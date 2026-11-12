@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.media

import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object WindowsWin32MediaJniBridge {
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
        val stream = WindowsWin32MediaJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun windowssysWindowsWin32MediaTimeBeginPeriod(uperiod: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaTimeEndPeriod(uperiod: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaTimeGetDevCaps(ptc: Long, cbtc: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaTimeGetSystemTime(pmmt: Long, cbmmt: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaTimeGetTime(): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaTimeKillEvent(utimerid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaTimeSetEvent(udelay: Int, uresolution: Int, fptc: Long, dwuser: Long, fuevent: Int): Int
}

public actual fun timeBeginPeriod(uperiod: UInt): UInt =
    WindowsWin32MediaJniBridge.windowssysWindowsWin32MediaTimeBeginPeriod(uperiod.toInt()).toUInt()

public actual fun timeEndPeriod(uperiod: UInt): UInt =
    WindowsWin32MediaJniBridge.windowssysWindowsWin32MediaTimeEndPeriod(uperiod.toInt()).toUInt()

public actual fun timeGetDevCaps(ptc: MutPtr<Timecaps>, cbtc: UInt): UInt =
    WindowsWin32MediaJniBridge.windowssysWindowsWin32MediaTimeGetDevCaps(ptc.rawAddress, cbtc.toInt()).toUInt()

public actual fun timeGetSystemTime(pmmt: MutPtr<Mmtime>, cbmmt: UInt): UInt =
    WindowsWin32MediaJniBridge.windowssysWindowsWin32MediaTimeGetSystemTime(pmmt.rawAddress, cbmmt.toInt()).toUInt()

public actual fun timeGetTime(): UInt =
    WindowsWin32MediaJniBridge.windowssysWindowsWin32MediaTimeGetTime().toUInt()

public actual fun timeKillEvent(utimerid: UInt): UInt =
    WindowsWin32MediaJniBridge.windowssysWindowsWin32MediaTimeKillEvent(utimerid.toInt()).toUInt()

public actual fun timeSetEvent(udelay: UInt, uresolution: UInt, fptc: Lptimecallback, dwuser: ULong, fuevent: UInt): UInt =
    WindowsWin32MediaJniBridge.windowssysWindowsWin32MediaTimeSetEvent(udelay.toInt(), uresolution.toInt(), 0L, dwuser.toLong(), fuevent.toInt()).toUInt()
