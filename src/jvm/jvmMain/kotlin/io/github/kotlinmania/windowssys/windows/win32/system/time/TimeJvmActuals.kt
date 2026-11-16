@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.time

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool

private object WindowsWin32SystemTimeJniBridge {
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
        val stream = WindowsWin32SystemTimeJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun windowssysWindowsWin32SystemTimeEnumDynamicTimeZoneInformation(dwindex: Int, lptimezoneinformation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemTimeFileTimeToSystemTime(lpfiletime: Long, lpsystemtime: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemTimeGetDynamicTimeZoneInformation(ptimezoneinformation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemTimeGetDynamicTimeZoneInformationEffectiveYears(lptimezoneinformation: Long, firstyear: Long, lastyear: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemTimeGetTimeZoneInformation(lptimezoneinformation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemTimeGetTimeZoneInformationForYear(wyear: Short, pdtzi: Long, ptzi: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemTimeLocalFileTimeToLocalSystemTime(timezoneinformation: Long, localfiletime: Long, localsystemtime: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemTimeLocalSystemTimeToLocalFileTime(timezoneinformation: Long, localsystemtime: Long, localfiletime: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemTimeSetDynamicTimeZoneInformation(lptimezoneinformation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemTimeSetTimeZoneInformation(lptimezoneinformation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemTimeSystemTimeToFileTime(lpsystemtime: Long, lpfiletime: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemTimeSystemTimeToTzSpecificLocalTime(lptimezoneinformation: Long, lpuniversaltime: Long, lplocaltime: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemTimeSystemTimeToTzSpecificLocalTimeEx(lptimezoneinformation: Long, lpuniversaltime: Long, lplocaltime: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemTimeTzSpecificLocalTimeToSystemTime(lptimezoneinformation: Long, lplocaltime: Long, lpuniversaltime: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemTimeTzSpecificLocalTimeToSystemTimeEx(lptimezoneinformation: Long, lplocaltime: Long, lpuniversaltime: Long): Int
}

public actual fun enumDynamicTimeZoneInformation(dwindex: UInt, lptimezoneinformation: MutPtr): UInt =
    WindowsWin32SystemTimeJniBridge.windowssysWindowsWin32SystemTimeEnumDynamicTimeZoneInformation(dwindex.toInt(), lptimezoneinformation.rawAddress).toUInt()

public actual fun fileTimeToSystemTime(lpfiletime: ConstPtr, lpsystemtime: MutPtr): Bool =
    WindowsWin32SystemTimeJniBridge.windowssysWindowsWin32SystemTimeFileTimeToSystemTime(lpfiletime.rawAddress, lpsystemtime.rawAddress)

public actual fun getDynamicTimeZoneInformation(ptimezoneinformation: MutPtr): UInt =
    WindowsWin32SystemTimeJniBridge.windowssysWindowsWin32SystemTimeGetDynamicTimeZoneInformation(ptimezoneinformation.rawAddress).toUInt()

public actual fun getDynamicTimeZoneInformationEffectiveYears(lptimezoneinformation: ConstPtr, firstyear: MutPtr, lastyear: MutPtr): UInt =
    WindowsWin32SystemTimeJniBridge.windowssysWindowsWin32SystemTimeGetDynamicTimeZoneInformationEffectiveYears(lptimezoneinformation.rawAddress, firstyear.rawAddress, lastyear.rawAddress).toUInt()

public actual fun getTimeZoneInformation(lptimezoneinformation: MutPtr): UInt =
    WindowsWin32SystemTimeJniBridge.windowssysWindowsWin32SystemTimeGetTimeZoneInformation(lptimezoneinformation.rawAddress).toUInt()

public actual fun getTimeZoneInformationForYear(wyear: UShort, pdtzi: ConstPtr, ptzi: MutPtr): Bool =
    WindowsWin32SystemTimeJniBridge.windowssysWindowsWin32SystemTimeGetTimeZoneInformationForYear(wyear.toShort(), pdtzi.rawAddress, ptzi.rawAddress)

public actual fun localFileTimeToLocalSystemTime(timezoneinformation: ConstPtr, localfiletime: ConstPtr, localsystemtime: MutPtr): Bool =
    WindowsWin32SystemTimeJniBridge.windowssysWindowsWin32SystemTimeLocalFileTimeToLocalSystemTime(timezoneinformation.rawAddress, localfiletime.rawAddress, localsystemtime.rawAddress)

public actual fun localSystemTimeToLocalFileTime(timezoneinformation: ConstPtr, localsystemtime: ConstPtr, localfiletime: MutPtr): Bool =
    WindowsWin32SystemTimeJniBridge.windowssysWindowsWin32SystemTimeLocalSystemTimeToLocalFileTime(timezoneinformation.rawAddress, localsystemtime.rawAddress, localfiletime.rawAddress)

public actual fun setDynamicTimeZoneInformation(lptimezoneinformation: ConstPtr): Bool =
    WindowsWin32SystemTimeJniBridge.windowssysWindowsWin32SystemTimeSetDynamicTimeZoneInformation(lptimezoneinformation.rawAddress)

public actual fun setTimeZoneInformation(lptimezoneinformation: ConstPtr): Bool =
    WindowsWin32SystemTimeJniBridge.windowssysWindowsWin32SystemTimeSetTimeZoneInformation(lptimezoneinformation.rawAddress)

public actual fun systemTimeToFileTime(lpsystemtime: ConstPtr, lpfiletime: MutPtr): Bool =
    WindowsWin32SystemTimeJniBridge.windowssysWindowsWin32SystemTimeSystemTimeToFileTime(lpsystemtime.rawAddress, lpfiletime.rawAddress)

public actual fun systemTimeToTzSpecificLocalTime(lptimezoneinformation: ConstPtr, lpuniversaltime: ConstPtr, lplocaltime: MutPtr): Bool =
    WindowsWin32SystemTimeJniBridge.windowssysWindowsWin32SystemTimeSystemTimeToTzSpecificLocalTime(lptimezoneinformation.rawAddress, lpuniversaltime.rawAddress, lplocaltime.rawAddress)

public actual fun systemTimeToTzSpecificLocalTimeEx(lptimezoneinformation: ConstPtr, lpuniversaltime: ConstPtr, lplocaltime: MutPtr): Bool =
    WindowsWin32SystemTimeJniBridge.windowssysWindowsWin32SystemTimeSystemTimeToTzSpecificLocalTimeEx(lptimezoneinformation.rawAddress, lpuniversaltime.rawAddress, lplocaltime.rawAddress)

public actual fun tzSpecificLocalTimeToSystemTime(lptimezoneinformation: ConstPtr, lplocaltime: ConstPtr, lpuniversaltime: MutPtr): Bool =
    WindowsWin32SystemTimeJniBridge.windowssysWindowsWin32SystemTimeTzSpecificLocalTimeToSystemTime(lptimezoneinformation.rawAddress, lplocaltime.rawAddress, lpuniversaltime.rawAddress)

public actual fun tzSpecificLocalTimeToSystemTimeEx(lptimezoneinformation: ConstPtr, lplocaltime: ConstPtr, lpuniversaltime: MutPtr): Bool =
    WindowsWin32SystemTimeJniBridge.windowssysWindowsWin32SystemTimeTzSpecificLocalTimeToSystemTimeEx(lptimezoneinformation.rawAddress, lplocaltime.rawAddress, lpuniversaltime.rawAddress)
