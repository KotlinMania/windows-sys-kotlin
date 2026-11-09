package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.webdav

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public expect fun DavAddConnection(connectionhandle: Long, remotename: PCWSTR, username: PCWSTR, password: PCWSTR, clientcert: Long, certsize: UInt): UInt

public expect fun DavCancelConnectionsToServer(lpname: PCWSTR, fforce: BOOL): UInt

public expect fun DavDeleteConnection(connectionhandle: HANDLE): UInt

public expect fun DavFlushFile(hfile: HANDLE): UInt

public expect fun DavGetExtendedError(hfile: HANDLE, exterror: Long, exterrorstring: PWSTR, cchsize: Long): UInt

public expect fun DavGetHTTPFromUNCPath(uncpath: PCWSTR, url: PWSTR, lpsize: Long): UInt

public expect fun DavGetTheLockOwnerOfTheFile(filename: PCWSTR, lockownername: PWSTR, lockownernamelengthinbytes: Long): UInt

public expect fun DavGetUNCFromHTTPPath(url: PCWSTR, uncpath: PWSTR, lpsize: Long): UInt

public expect fun DavInvalidateCache(urlname: PCWSTR): UInt

public expect fun DavRegisterAuthCallback(callback: PFNDAVAUTHCALLBACK, version: UInt): UInt

public expect fun DavUnregisterAuthCallback(hcallback: UInt)
