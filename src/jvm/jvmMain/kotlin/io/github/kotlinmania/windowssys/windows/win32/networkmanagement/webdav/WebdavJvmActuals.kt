@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.webdav

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private object WindowsWin32NetworkmanagementWebdavJniBridge {
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
        val stream = WindowsWin32NetworkmanagementWebdavJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun windowssysWindowsWin32NetworkmanagementWebdavDavAddConnection(connectionhandle: Long, remotename: Long, username: Long, password: Long, clientcert: Long, certsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWebdavDavCancelConnectionsToServer(lpname: Long, fforce: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWebdavDavDeleteConnection(connectionhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWebdavDavFlushFile(hfile: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWebdavDavGetExtendedError(hfile: Long, exterror: Long, exterrorstring: Long, cchsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWebdavDavGetHTTPFromUNCPath(uncpath: Long, url: Long, lpsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWebdavDavGetTheLockOwnerOfTheFile(filename: Long, lockownername: Long, lockownernamelengthinbytes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWebdavDavGetUNCFromHTTPPath(url: Long, uncpath: Long, lpsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWebdavDavInvalidateCache(urlname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWebdavDavRegisterAuthCallback(callback: Long, version: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWebdavDavUnregisterAuthCallback(hcallback: Int)
}

public actual fun davAddConnection(connectionhandle: MutPtr, remotename: Pcwstr, username: Pcwstr, password: Pcwstr, clientcert: ConstPtr, certsize: UInt): UInt =
    WindowsWin32NetworkmanagementWebdavJniBridge.windowssysWindowsWin32NetworkmanagementWebdavDavAddConnection(connectionhandle.rawAddress, remotename.rawAddress, username.rawAddress, password.rawAddress, clientcert.rawAddress, certsize.toInt()).toUInt()

public actual fun davCancelConnectionsToServer(lpname: Pcwstr, fforce: Bool): UInt =
    WindowsWin32NetworkmanagementWebdavJniBridge.windowssysWindowsWin32NetworkmanagementWebdavDavCancelConnectionsToServer(lpname.rawAddress, fforce).toUInt()

public actual fun davDeleteConnection(connectionhandle: Handle): UInt =
    WindowsWin32NetworkmanagementWebdavJniBridge.windowssysWindowsWin32NetworkmanagementWebdavDavDeleteConnection(connectionhandle.rawAddress).toUInt()

public actual fun davFlushFile(hfile: Handle): UInt =
    WindowsWin32NetworkmanagementWebdavJniBridge.windowssysWindowsWin32NetworkmanagementWebdavDavFlushFile(hfile.rawAddress).toUInt()

public actual fun davGetExtendedError(hfile: Handle, exterror: MutPtr, exterrorstring: Pwstr, cchsize: MutPtr): UInt =
    WindowsWin32NetworkmanagementWebdavJniBridge.windowssysWindowsWin32NetworkmanagementWebdavDavGetExtendedError(hfile.rawAddress, exterror.rawAddress, exterrorstring.rawAddress, cchsize.rawAddress).toUInt()

public actual fun davGetHTTPFromUNCPath(uncpath: Pcwstr, url: Pwstr, lpsize: MutPtr): UInt =
    WindowsWin32NetworkmanagementWebdavJniBridge.windowssysWindowsWin32NetworkmanagementWebdavDavGetHTTPFromUNCPath(uncpath.rawAddress, url.rawAddress, lpsize.rawAddress).toUInt()

public actual fun davGetTheLockOwnerOfTheFile(filename: Pcwstr, lockownername: Pwstr, lockownernamelengthinbytes: MutPtr): UInt =
    WindowsWin32NetworkmanagementWebdavJniBridge.windowssysWindowsWin32NetworkmanagementWebdavDavGetTheLockOwnerOfTheFile(filename.rawAddress, lockownername.rawAddress, lockownernamelengthinbytes.rawAddress).toUInt()

public actual fun davGetUNCFromHTTPPath(url: Pcwstr, uncpath: Pwstr, lpsize: MutPtr): UInt =
    WindowsWin32NetworkmanagementWebdavJniBridge.windowssysWindowsWin32NetworkmanagementWebdavDavGetUNCFromHTTPPath(url.rawAddress, uncpath.rawAddress, lpsize.rawAddress).toUInt()

public actual fun davInvalidateCache(urlname: Pcwstr): UInt =
    WindowsWin32NetworkmanagementWebdavJniBridge.windowssysWindowsWin32NetworkmanagementWebdavDavInvalidateCache(urlname.rawAddress).toUInt()

public actual fun davRegisterAuthCallback(callback: Pfndavauthcallback, version: UInt): UInt =
    WindowsWin32NetworkmanagementWebdavJniBridge.windowssysWindowsWin32NetworkmanagementWebdavDavRegisterAuthCallback(0L, version.toInt()).toUInt()

public actual fun davUnregisterAuthCallback(hcallback: UInt) {
    WindowsWin32NetworkmanagementWebdavJniBridge.windowssysWindowsWin32NetworkmanagementWebdavDavUnregisterAuthCallback(hcallback.toInt())
}
