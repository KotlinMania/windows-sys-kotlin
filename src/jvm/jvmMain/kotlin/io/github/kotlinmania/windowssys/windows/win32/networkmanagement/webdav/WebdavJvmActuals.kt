@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.webdav

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

private object WindowsWin32NetworkmanagementWebdavJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_webdav_DavAddConnection(connectionhandle: Long, remotename: Long, username: Long, password: Long, clientcert: Long, certsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_webdav_DavCancelConnectionsToServer(lpname: Long, fforce: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_webdav_DavDeleteConnection(connectionhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_webdav_DavFlushFile(hfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_webdav_DavGetExtendedError(hfile: Long, exterror: Long, exterrorstring: Long, cchsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_webdav_DavGetHTTPFromUNCPath(uncpath: Long, url: Long, lpsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_webdav_DavGetTheLockOwnerOfTheFile(filename: Long, lockownername: Long, lockownernamelengthinbytes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_webdav_DavGetUNCFromHTTPPath(url: Long, uncpath: Long, lpsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_webdav_DavInvalidateCache(urlname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_webdav_DavRegisterAuthCallback(callback: Long, version: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_webdav_DavUnregisterAuthCallback(hcallback: Int)
}

public actual fun DavAddConnection(connectionhandle: Long, remotename: PCWSTR, username: PCWSTR, password: PCWSTR, clientcert: Long, certsize: UInt): UInt =
    WindowsWin32NetworkmanagementWebdavJniBridge.windowssys_windows_win32_networkmanagement_webdav_DavAddConnection(connectionhandle, remotename, username, password, clientcert, certsize.toInt()).toUInt()

public actual fun DavCancelConnectionsToServer(lpname: PCWSTR, fforce: BOOL): UInt =
    WindowsWin32NetworkmanagementWebdavJniBridge.windowssys_windows_win32_networkmanagement_webdav_DavCancelConnectionsToServer(lpname, fforce).toUInt()

public actual fun DavDeleteConnection(connectionhandle: HANDLE): UInt =
    WindowsWin32NetworkmanagementWebdavJniBridge.windowssys_windows_win32_networkmanagement_webdav_DavDeleteConnection(connectionhandle).toUInt()

public actual fun DavFlushFile(hfile: HANDLE): UInt =
    WindowsWin32NetworkmanagementWebdavJniBridge.windowssys_windows_win32_networkmanagement_webdav_DavFlushFile(hfile).toUInt()

public actual fun DavGetExtendedError(hfile: HANDLE, exterror: Long, exterrorstring: PWSTR, cchsize: Long): UInt =
    WindowsWin32NetworkmanagementWebdavJniBridge.windowssys_windows_win32_networkmanagement_webdav_DavGetExtendedError(hfile, exterror, exterrorstring, cchsize).toUInt()

public actual fun DavGetHTTPFromUNCPath(uncpath: PCWSTR, url: PWSTR, lpsize: Long): UInt =
    WindowsWin32NetworkmanagementWebdavJniBridge.windowssys_windows_win32_networkmanagement_webdav_DavGetHTTPFromUNCPath(uncpath, url, lpsize).toUInt()

public actual fun DavGetTheLockOwnerOfTheFile(filename: PCWSTR, lockownername: PWSTR, lockownernamelengthinbytes: Long): UInt =
    WindowsWin32NetworkmanagementWebdavJniBridge.windowssys_windows_win32_networkmanagement_webdav_DavGetTheLockOwnerOfTheFile(filename, lockownername, lockownernamelengthinbytes).toUInt()

public actual fun DavGetUNCFromHTTPPath(url: PCWSTR, uncpath: PWSTR, lpsize: Long): UInt =
    WindowsWin32NetworkmanagementWebdavJniBridge.windowssys_windows_win32_networkmanagement_webdav_DavGetUNCFromHTTPPath(url, uncpath, lpsize).toUInt()

public actual fun DavInvalidateCache(urlname: PCWSTR): UInt =
    WindowsWin32NetworkmanagementWebdavJniBridge.windowssys_windows_win32_networkmanagement_webdav_DavInvalidateCache(urlname).toUInt()

public actual fun DavRegisterAuthCallback(callback: PFNDAVAUTHCALLBACK, version: UInt): UInt =
    WindowsWin32NetworkmanagementWebdavJniBridge.windowssys_windows_win32_networkmanagement_webdav_DavRegisterAuthCallback(callback.toLong(), version.toInt()).toUInt()

public actual fun DavUnregisterAuthCallback(hcallback: UInt) {
    WindowsWin32NetworkmanagementWebdavJniBridge.windowssys_windows_win32_networkmanagement_webdav_DavUnregisterAuthCallback(hcallback.toInt())
}
