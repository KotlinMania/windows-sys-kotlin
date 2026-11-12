@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.serialcommunication

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool

private object WindowsWin32DevicesSerialcommunicationJniBridge {
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
        val stream = WindowsWin32DevicesSerialcommunicationJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun windowssysWindowsWin32DevicesSerialcommunicationComDBClaimNextFreePort(hcomdb: Long, comnumber: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSerialcommunicationComDBClaimPort(hcomdb: Long, comnumber: Int, forceclaim: Int, forced: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSerialcommunicationComDBClose(hcomdb: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSerialcommunicationComDBGetCurrentPortUsage(hcomdb: Long, buffer: Long, buffersize: Int, reporttype: Int, maxportsreported: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSerialcommunicationComDBOpen(phcomdb: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSerialcommunicationComDBReleasePort(hcomdb: Long, comnumber: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesSerialcommunicationComDBResizeDatabase(hcomdb: Long, newsize: Int): Int
}

public actual fun comDBClaimNextFreePort(hcomdb: Hcomdb, comnumber: MutPtr): Int =
    WindowsWin32DevicesSerialcommunicationJniBridge.windowssysWindowsWin32DevicesSerialcommunicationComDBClaimNextFreePort(hcomdb.rawAddress, comnumber.rawAddress)

public actual fun comDBClaimPort(hcomdb: Hcomdb, comnumber: UInt, forceclaim: Bool, forced: MutPtr): Int =
    WindowsWin32DevicesSerialcommunicationJniBridge.windowssysWindowsWin32DevicesSerialcommunicationComDBClaimPort(hcomdb.rawAddress, comnumber.toInt(), forceclaim, forced.rawAddress)

public actual fun comDBClose(hcomdb: Hcomdb): Int =
    WindowsWin32DevicesSerialcommunicationJniBridge.windowssysWindowsWin32DevicesSerialcommunicationComDBClose(hcomdb.rawAddress)

public actual fun comDBGetCurrentPortUsage(hcomdb: Hcomdb, buffer: MutPtr, buffersize: UInt, reporttype: UInt, maxportsreported: MutPtr): Int =
    WindowsWin32DevicesSerialcommunicationJniBridge.windowssysWindowsWin32DevicesSerialcommunicationComDBGetCurrentPortUsage(hcomdb.rawAddress, buffer.rawAddress, buffersize.toInt(), reporttype.toInt(), maxportsreported.rawAddress)

public actual fun comDBOpen(phcomdb: MutPtr): Int =
    WindowsWin32DevicesSerialcommunicationJniBridge.windowssysWindowsWin32DevicesSerialcommunicationComDBOpen(phcomdb.rawAddress)

public actual fun comDBReleasePort(hcomdb: Hcomdb, comnumber: UInt): Int =
    WindowsWin32DevicesSerialcommunicationJniBridge.windowssysWindowsWin32DevicesSerialcommunicationComDBReleasePort(hcomdb.rawAddress, comnumber.toInt())

public actual fun comDBResizeDatabase(hcomdb: Hcomdb, newsize: UInt): Int =
    WindowsWin32DevicesSerialcommunicationJniBridge.windowssysWindowsWin32DevicesSerialcommunicationComDBResizeDatabase(hcomdb.rawAddress, newsize.toInt())
