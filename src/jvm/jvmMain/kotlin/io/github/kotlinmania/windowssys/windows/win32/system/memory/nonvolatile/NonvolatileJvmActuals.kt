@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.memory.nonvolatile

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object WindowsWin32SystemMemoryNonvolatileJniBridge {
    init {
        loadNativeLibrary()
    }

    private fun loadNativeLibrary() {
        val osRaw = System.getProperty("os.name", "").lowercase()
        val archRaw = System.getProperty("os.arch", "").lowercase()
        val hostPlatform =
            when {
                osRaw.contains("win") -> "windows"
                osRaw.contains("mac") || osRaw.contains("darwin") -> "macos"
                else -> "linux"
            }
        val hostArch =
            when {
                archRaw == "aarch64" || archRaw == "arm64" -> "aarch64"
                archRaw == "amd64" || archRaw == "x86_64" -> "x86_64"
                else -> archRaw
            }
        val libFileName =
            when (hostPlatform) {
                "windows" -> "windowssys_jni.dll"
                "macos" -> "libwindowssys_jni.dylib"
                else -> "libwindowssys_jni.so"
            }
        val pathSep = System.getProperty("path.separator", ":")
        val libPathProp = System.getProperty("java.library.path", "")
        for (dirEntry in libPathProp.split(pathSep)) {
            if (dirEntry.isEmpty()) continue
            val candidate = java.io.File(dirEntry, libFileName)
            if (candidate.isFile) {
                System.load(candidate.absolutePath)
                return
            }
        }
        val resourcePath = "io/github/kotlinmania/windowssys/native/$hostPlatform-$hostArch/$libFileName"
        val stream = WindowsWin32SystemMemoryNonvolatileJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
        if (stream != null) {
            val suffix = "." + libFileName.substringAfterLast('.')
            val extracted =
                java.nio.file.Files
                    .createTempFile("windowssys_jni-", suffix)
                    .toFile()
            extracted.deleteOnExit()
            stream.use { input ->
                extracted.outputStream().use { output ->
                    input.copyTo(output)
                }
            }
            System.load(extracted.absolutePath)
            return
        }
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryNonvolatileRtlDrainNonVolatileFlush(nvtoken: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryNonvolatileRtlFillNonVolatileMemory(nvtoken: Long, nvdestination: Long, size: Long, value: Byte, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryNonvolatileRtlFlushNonVolatileMemory(nvtoken: Long, nvbuffer: Long, size: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryNonvolatileRtlFlushNonVolatileMemoryRanges(nvtoken: Long, nvranges: Long, numranges: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryNonvolatileRtlFreeNonVolatileToken(nvtoken: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryNonvolatileRtlGetNonVolatileToken(nvbuffer: Long, size: Long, nvtoken: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemMemoryNonvolatileRtlWriteNonVolatileMemory(nvtoken: Long, nvdestination: Long, source: Long, size: Long, flags: Int): Int
}

public actual fun rtlDrainNonVolatileFlush(nvtoken: ConstPtr<CVoid>): UInt =
    WindowsWin32SystemMemoryNonvolatileJniBridge.windowssysWindowsWin32SystemMemoryNonvolatileRtlDrainNonVolatileFlush(nvtoken.rawAddress).toUInt()

public actual fun rtlFillNonVolatileMemory(nvtoken: ConstPtr<CVoid>, nvdestination: MutPtr<CVoid>, size: ULong, value: UByte, flags: UInt): UInt =
    WindowsWin32SystemMemoryNonvolatileJniBridge.windowssysWindowsWin32SystemMemoryNonvolatileRtlFillNonVolatileMemory(nvtoken.rawAddress, nvdestination.rawAddress, size.toLong(), value.toByte(), flags.toInt()).toUInt()

public actual fun rtlFlushNonVolatileMemory(nvtoken: ConstPtr<CVoid>, nvbuffer: ConstPtr<CVoid>, size: ULong, flags: UInt): UInt =
    WindowsWin32SystemMemoryNonvolatileJniBridge.windowssysWindowsWin32SystemMemoryNonvolatileRtlFlushNonVolatileMemory(nvtoken.rawAddress, nvbuffer.rawAddress, size.toLong(), flags.toInt()).toUInt()

public actual fun rtlFlushNonVolatileMemoryRanges(nvtoken: ConstPtr<CVoid>, nvranges: ConstPtr<NvMemoryRange>, numranges: ULong, flags: UInt): UInt =
    WindowsWin32SystemMemoryNonvolatileJniBridge.windowssysWindowsWin32SystemMemoryNonvolatileRtlFlushNonVolatileMemoryRanges(nvtoken.rawAddress, nvranges.rawAddress, numranges.toLong(), flags.toInt()).toUInt()

public actual fun rtlFreeNonVolatileToken(nvtoken: ConstPtr<CVoid>): UInt =
    WindowsWin32SystemMemoryNonvolatileJniBridge.windowssysWindowsWin32SystemMemoryNonvolatileRtlFreeNonVolatileToken(nvtoken.rawAddress).toUInt()

public actual fun rtlGetNonVolatileToken(nvbuffer: ConstPtr<CVoid>, size: ULong, nvtoken: MutPtr<MutPtr<CVoid>>): UInt =
    WindowsWin32SystemMemoryNonvolatileJniBridge.windowssysWindowsWin32SystemMemoryNonvolatileRtlGetNonVolatileToken(nvbuffer.rawAddress, size.toLong(), nvtoken.rawAddress).toUInt()

public actual fun rtlWriteNonVolatileMemory(nvtoken: ConstPtr<CVoid>, nvdestination: MutPtr<CVoid>, source: ConstPtr<CVoid>, size: ULong, flags: UInt): UInt =
    WindowsWin32SystemMemoryNonvolatileJniBridge.windowssysWindowsWin32SystemMemoryNonvolatileRtlWriteNonVolatileMemory(nvtoken.rawAddress, nvdestination.rawAddress, source.rawAddress, size.toLong(), flags.toInt()).toUInt()
