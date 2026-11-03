package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.webdav

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public fun interface FnCallback {
    public operator fun invoke(lpwzservername: PCWSTR, lpwzremotename: PCWSTR, dwauthscheme: UInt, dwflags: UInt, pcallbackcred: Long, nextstep: Long, pfreecred: Long): UInt
}

public fun DavAddConnection(connectionhandle: Long, remotename: PCWSTR, username: PCWSTR, password: PCWSTR, clientcert: Long, certsize: UInt): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "DavAddConnection", longArrayOf(connectionhandle, remotename, username, password, clientcert, certsize.toLong())).toUInt()
}

public fun DavCancelConnectionsToServer(lpname: PCWSTR, fforce: BOOL): UInt {
    return Win32DynamicFfi.invoke("davclnt.dll", "DavCancelConnectionsToServer", longArrayOf(lpname, fforce.toLong())).toUInt()
}

public fun DavDeleteConnection(connectionhandle: Foundation.HANDLE): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "DavDeleteConnection", longArrayOf(Win32DynamicFfi.objectSlot(connectionhandle))).toUInt()
}

public fun DavFlushFile(hfile: Foundation.HANDLE): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "DavFlushFile", longArrayOf(Win32DynamicFfi.objectSlot(hfile))).toUInt()
}

public fun DavGetExtendedError(hfile: Foundation.HANDLE, exterror: Long, exterrorstring: PWSTR, cchsize: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "DavGetExtendedError", longArrayOf(Win32DynamicFfi.objectSlot(hfile), exterror, exterrorstring, cchsize)).toUInt()
}

public fun DavGetHTTPFromUNCPath(uncpath: PCWSTR, url: PWSTR, lpsize: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "DavGetHTTPFromUNCPath", longArrayOf(uncpath, url, lpsize)).toUInt()
}

public fun DavGetTheLockOwnerOfTheFile(filename: PCWSTR, lockownername: PWSTR, lockownernamelengthinbytes: Long): UInt {
    return Win32DynamicFfi.invoke("davclnt.dll", "DavGetTheLockOwnerOfTheFile", longArrayOf(filename, lockownername, lockownernamelengthinbytes)).toUInt()
}

public fun DavGetUNCFromHTTPPath(url: PCWSTR, uncpath: PWSTR, lpsize: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "DavGetUNCFromHTTPPath", longArrayOf(url, uncpath, lpsize)).toUInt()
}

public fun DavInvalidateCache(urlname: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("davclnt.dll", "DavInvalidateCache", longArrayOf(urlname)).toUInt()
}

public fun DavRegisterAuthCallback(callback: PFNDAVAUTHCALLBACK, version: UInt): UInt {
    return Win32DynamicFfi.invoke("davclnt.dll", "DavRegisterAuthCallback", longArrayOf(Win32DynamicFfi.objectSlot(callback), version.toLong())).toUInt()
}

public fun DavUnregisterAuthCallback(hcallback: UInt) {
    Win32DynamicFfi.invoke("davclnt.dll", "DavUnregisterAuthCallback", longArrayOf(hcallback.toLong()))
}
