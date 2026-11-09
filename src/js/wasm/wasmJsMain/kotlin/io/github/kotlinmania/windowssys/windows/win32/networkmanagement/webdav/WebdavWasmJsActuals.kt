@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.webdav

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public actual fun DavAddConnection(connectionhandle: Long, remotename: PCWSTR, username: PCWSTR, password: PCWSTR, clientcert: Long, certsize: UInt): UInt =
    0u

public actual fun DavCancelConnectionsToServer(lpname: PCWSTR, fforce: BOOL): UInt =
    0u

public actual fun DavDeleteConnection(connectionhandle: HANDLE): UInt =
    0u

public actual fun DavFlushFile(hfile: HANDLE): UInt =
    0u

public actual fun DavGetExtendedError(hfile: HANDLE, exterror: Long, exterrorstring: PWSTR, cchsize: Long): UInt =
    0u

public actual fun DavGetHTTPFromUNCPath(uncpath: PCWSTR, url: PWSTR, lpsize: Long): UInt =
    0u

public actual fun DavGetTheLockOwnerOfTheFile(filename: PCWSTR, lockownername: PWSTR, lockownernamelengthinbytes: Long): UInt =
    0u

public actual fun DavGetUNCFromHTTPPath(url: PCWSTR, uncpath: PWSTR, lpsize: Long): UInt =
    0u

public actual fun DavInvalidateCache(urlname: PCWSTR): UInt =
    0u

public actual fun DavRegisterAuthCallback(callback: PFNDAVAUTHCALLBACK, version: UInt): UInt =
    0u

public actual fun DavUnregisterAuthCallback(hcallback: UInt) {
}
