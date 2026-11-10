@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.webdav

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private object WindowsWin32NetworkmanagementWebdavJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_webdav_davAddConnection(connectionhandle: Long, remotename: Long, username: Long, password: Long, clientcert: Long, certsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_webdav_davCancelConnectionsToServer(lpname: Long, fforce: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_webdav_davDeleteConnection(connectionhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_webdav_davFlushFile(hfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_webdav_davGetExtendedError(hfile: Long, exterror: Long, exterrorstring: Long, cchsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_webdav_davGetHTTPFromUNCPath(uncpath: Long, url: Long, lpsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_webdav_davGetTheLockOwnerOfTheFile(filename: Long, lockownername: Long, lockownernamelengthinbytes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_webdav_davGetUNCFromHTTPPath(url: Long, uncpath: Long, lpsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_webdav_davInvalidateCache(urlname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_webdav_davRegisterAuthCallback(callback: Long, version: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_webdav_davUnregisterAuthCallback(hcallback: Int)
}

public actual fun davAddConnection(connectionhandle: COpaquePointer?, remotename: Pcwstr, username: Pcwstr, password: Pcwstr, clientcert: COpaquePointer?, certsize: UInt): UInt =
    WindowsWin32NetworkmanagementWebdavJniBridge.windowssys_windows_win32_networkmanagement_webdav_davAddConnection((connectionhandle?.value ?: 0L), (remotename?.value ?: 0L), (username?.value ?: 0L), (password?.value ?: 0L), (clientcert?.value ?: 0L), certsize.toInt()).toUInt()

public actual fun davCancelConnectionsToServer(lpname: Pcwstr, fforce: Bool): UInt =
    WindowsWin32NetworkmanagementWebdavJniBridge.windowssys_windows_win32_networkmanagement_webdav_davCancelConnectionsToServer((lpname?.value ?: 0L), fforce).toUInt()

public actual fun davDeleteConnection(connectionhandle: Handle): UInt =
    WindowsWin32NetworkmanagementWebdavJniBridge.windowssys_windows_win32_networkmanagement_webdav_davDeleteConnection((connectionhandle?.value ?: 0L)).toUInt()

public actual fun davFlushFile(hfile: Handle): UInt =
    WindowsWin32NetworkmanagementWebdavJniBridge.windowssys_windows_win32_networkmanagement_webdav_davFlushFile((hfile?.value ?: 0L)).toUInt()

public actual fun davGetExtendedError(hfile: Handle, exterror: COpaquePointer?, exterrorstring: Pwstr, cchsize: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWebdavJniBridge.windowssys_windows_win32_networkmanagement_webdav_davGetExtendedError((hfile?.value ?: 0L), (exterror?.value ?: 0L), (exterrorstring?.value ?: 0L), (cchsize?.value ?: 0L)).toUInt()

public actual fun davGetHTTPFromUNCPath(uncpath: Pcwstr, url: Pwstr, lpsize: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWebdavJniBridge.windowssys_windows_win32_networkmanagement_webdav_davGetHTTPFromUNCPath((uncpath?.value ?: 0L), (url?.value ?: 0L), (lpsize?.value ?: 0L)).toUInt()

public actual fun davGetTheLockOwnerOfTheFile(filename: Pcwstr, lockownername: Pwstr, lockownernamelengthinbytes: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWebdavJniBridge.windowssys_windows_win32_networkmanagement_webdav_davGetTheLockOwnerOfTheFile((filename?.value ?: 0L), (lockownername?.value ?: 0L), (lockownernamelengthinbytes?.value ?: 0L)).toUInt()

public actual fun davGetUNCFromHTTPPath(url: Pcwstr, uncpath: Pwstr, lpsize: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWebdavJniBridge.windowssys_windows_win32_networkmanagement_webdav_davGetUNCFromHTTPPath((url?.value ?: 0L), (uncpath?.value ?: 0L), (lpsize?.value ?: 0L)).toUInt()

public actual fun davInvalidateCache(urlname: Pcwstr): UInt =
    WindowsWin32NetworkmanagementWebdavJniBridge.windowssys_windows_win32_networkmanagement_webdav_davInvalidateCache((urlname?.value ?: 0L)).toUInt()

public actual fun davRegisterAuthCallback(callback: Pfndavauthcallback, version: UInt): UInt =
    WindowsWin32NetworkmanagementWebdavJniBridge.windowssys_windows_win32_networkmanagement_webdav_davRegisterAuthCallback(0L, version.toInt()).toUInt()

public actual fun davUnregisterAuthCallback(hcallback: UInt) {
    WindowsWin32NetworkmanagementWebdavJniBridge.windowssys_windows_win32_networkmanagement_webdav_davUnregisterAuthCallback(hcallback.toInt())
}
