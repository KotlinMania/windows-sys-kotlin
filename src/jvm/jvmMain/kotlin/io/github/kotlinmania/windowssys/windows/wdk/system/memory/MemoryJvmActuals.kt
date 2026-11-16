@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.memory

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

private object WindowsWdkSystemMemoryJniBridge {
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
        val stream = WindowsWdkSystemMemoryJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun windowssysWindowsWdkSystemMemoryNtMapViewOfSection(sectionhandle: Long, processhandle: Long, baseaddress: Long, zerobits: Long, commitsize: Long, sectionoffset: Long, viewsize: Long, inheritdisposition: Int, allocationtype: Int, win32protect: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemMemoryNtOpenSection(sectionhandle: Long, desiredaccess: Int, objectattributes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemMemoryNtUnmapViewOfSection(processhandle: Long, baseaddress: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemMemoryZwMapViewOfSection(sectionhandle: Long, processhandle: Long, baseaddress: Long, zerobits: Long, commitsize: Long, sectionoffset: Long, viewsize: Long, inheritdisposition: Int, allocationtype: Int, win32protect: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemMemoryZwOpenSection(sectionhandle: Long, desiredaccess: Int, objectattributes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemMemoryZwUnmapViewOfSection(processhandle: Long, baseaddress: Long): Int
}

public actual fun ntMapViewOfSection(sectionhandle: Handle, processhandle: Handle, baseaddress: MutPtr, zerobits: ULong, commitsize: ULong, sectionoffset: MutPtr, viewsize: MutPtr, inheritdisposition: SectionInherit, allocationtype: UInt, win32protect: UInt): Ntstatus =
    WindowsWdkSystemMemoryJniBridge.windowssysWindowsWdkSystemMemoryNtMapViewOfSection(sectionhandle.rawAddress, processhandle.rawAddress, baseaddress.rawAddress, zerobits.toLong(), commitsize.toLong(), sectionoffset.rawAddress, viewsize.rawAddress, inheritdisposition, allocationtype.toInt(), win32protect.toInt())

public actual fun ntOpenSection(sectionhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr): Ntstatus =
    WindowsWdkSystemMemoryJniBridge.windowssysWindowsWdkSystemMemoryNtOpenSection(sectionhandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress)

public actual fun ntUnmapViewOfSection(processhandle: Handle, baseaddress: ConstPtr): Ntstatus =
    WindowsWdkSystemMemoryJniBridge.windowssysWindowsWdkSystemMemoryNtUnmapViewOfSection(processhandle.rawAddress, baseaddress.rawAddress)

public actual fun zwMapViewOfSection(sectionhandle: Handle, processhandle: Handle, baseaddress: MutPtr, zerobits: ULong, commitsize: ULong, sectionoffset: MutPtr, viewsize: MutPtr, inheritdisposition: SectionInherit, allocationtype: UInt, win32protect: UInt): Ntstatus =
    WindowsWdkSystemMemoryJniBridge.windowssysWindowsWdkSystemMemoryZwMapViewOfSection(sectionhandle.rawAddress, processhandle.rawAddress, baseaddress.rawAddress, zerobits.toLong(), commitsize.toLong(), sectionoffset.rawAddress, viewsize.rawAddress, inheritdisposition, allocationtype.toInt(), win32protect.toInt())

public actual fun zwOpenSection(sectionhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr): Ntstatus =
    WindowsWdkSystemMemoryJniBridge.windowssysWindowsWdkSystemMemoryZwOpenSection(sectionhandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress)

public actual fun zwUnmapViewOfSection(processhandle: Handle, baseaddress: ConstPtr): Ntstatus =
    WindowsWdkSystemMemoryJniBridge.windowssysWindowsWdkSystemMemoryZwUnmapViewOfSection(processhandle.rawAddress, baseaddress.rawAddress)
