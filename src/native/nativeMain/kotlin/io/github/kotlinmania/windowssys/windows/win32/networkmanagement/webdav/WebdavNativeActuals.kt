@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.webdav

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun DavAddConnection(connectionhandle: Long, remotename: PCWSTR, username: PCWSTR, password: PCWSTR, clientcert: Long, certsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.webdav.cinterop.windowssys_windows_win32_networkmanagement_webdav_DavAddConnection(connectionhandle.toCPointer<ByteVar>(), remotename.toCPointer<ByteVar>(), username.toCPointer<ByteVar>(), password.toCPointer<ByteVar>(), clientcert.toCPointer<ByteVar>(), certsize)

public actual fun DavCancelConnectionsToServer(lpname: PCWSTR, fforce: BOOL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.webdav.cinterop.windowssys_windows_win32_networkmanagement_webdav_DavCancelConnectionsToServer(lpname.toCPointer<ByteVar>(), fforce)

public actual fun DavDeleteConnection(connectionhandle: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.webdav.cinterop.windowssys_windows_win32_networkmanagement_webdav_DavDeleteConnection(connectionhandle.toCPointer<ByteVar>())

public actual fun DavFlushFile(hfile: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.webdav.cinterop.windowssys_windows_win32_networkmanagement_webdav_DavFlushFile(hfile.toCPointer<ByteVar>())

public actual fun DavGetExtendedError(hfile: HANDLE, exterror: Long, exterrorstring: PWSTR, cchsize: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.webdav.cinterop.windowssys_windows_win32_networkmanagement_webdav_DavGetExtendedError(hfile.toCPointer<ByteVar>(), exterror.toCPointer<ByteVar>(), exterrorstring.toCPointer<ByteVar>(), cchsize.toCPointer<ByteVar>())

public actual fun DavGetHTTPFromUNCPath(uncpath: PCWSTR, url: PWSTR, lpsize: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.webdav.cinterop.windowssys_windows_win32_networkmanagement_webdav_DavGetHTTPFromUNCPath(uncpath.toCPointer<ByteVar>(), url.toCPointer<ByteVar>(), lpsize.toCPointer<ByteVar>())

public actual fun DavGetTheLockOwnerOfTheFile(filename: PCWSTR, lockownername: PWSTR, lockownernamelengthinbytes: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.webdav.cinterop.windowssys_windows_win32_networkmanagement_webdav_DavGetTheLockOwnerOfTheFile(filename.toCPointer<ByteVar>(), lockownername.toCPointer<ByteVar>(), lockownernamelengthinbytes.toCPointer<ByteVar>())

public actual fun DavGetUNCFromHTTPPath(url: PCWSTR, uncpath: PWSTR, lpsize: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.webdav.cinterop.windowssys_windows_win32_networkmanagement_webdav_DavGetUNCFromHTTPPath(url.toCPointer<ByteVar>(), uncpath.toCPointer<ByteVar>(), lpsize.toCPointer<ByteVar>())

public actual fun DavInvalidateCache(urlname: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.webdav.cinterop.windowssys_windows_win32_networkmanagement_webdav_DavInvalidateCache(urlname.toCPointer<ByteVar>())

public actual fun DavRegisterAuthCallback(callback: PFNDAVAUTHCALLBACK, version: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.webdav.cinterop.windowssys_windows_win32_networkmanagement_webdav_DavRegisterAuthCallback(callback.toLong().toCPointer<ByteVar>(), version)

public actual fun DavUnregisterAuthCallback(hcallback: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.webdav.cinterop.windowssys_windows_win32_networkmanagement_webdav_DavUnregisterAuthCallback(hcallback)
}
