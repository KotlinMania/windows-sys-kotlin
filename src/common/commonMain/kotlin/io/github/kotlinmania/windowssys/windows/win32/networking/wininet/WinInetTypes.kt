package io.github.kotlinmania.windowssys.windows.win32.networking.wininet

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

public typealias APP_CACHE_FINALIZE_STATE = Int

public typealias APP_CACHE_STATE = Int

public typealias CACHE_CONFIG = UInt

public fun interface CACHE_OPERATORFn {
    public operator fun invoke(pcei: Long, pcbcei: Long, popdata: Long): BOOL
}

public typealias CACHE_OPERATOR = CACHE_OPERATORFn?

public typealias FORTCMD = Int

public typealias FORTSTAT = Int

public typealias FTP_FLAGS = UInt

public fun interface GOPHER_ATTRIBUTE_ENUMERATORFn {
    public operator fun invoke(lpattributeinfo: Long, dwerror: UInt): BOOL
}

public typealias GOPHER_ATTRIBUTE_ENUMERATOR = GOPHER_ATTRIBUTE_ENUMERATORFn?

public typealias GOPHER_TYPE = UInt

public typealias HTTP_ADDREQ_FLAG = UInt

public fun interface HTTP_POLICY_EXTENSION_INITFn {
    public operator fun invoke(version: HTTP_POLICY_EXTENSION_VERSION, type: HTTP_POLICY_EXTENSION_TYPE, pvdata: Long, cbdata: UInt): UInt
}

public typealias HTTP_POLICY_EXTENSION_INIT = HTTP_POLICY_EXTENSION_INITFn?

public fun interface HTTP_POLICY_EXTENSION_SHUTDOWNFn {
    public operator fun invoke(type: HTTP_POLICY_EXTENSION_TYPE): UInt
}

public typealias HTTP_POLICY_EXTENSION_SHUTDOWN = HTTP_POLICY_EXTENSION_SHUTDOWNFn?

public typealias HTTP_POLICY_EXTENSION_TYPE = Int

public typealias HTTP_POLICY_EXTENSION_VERSION = Int

public typealias HTTP_PUSH_WAIT_HANDLE = Long

public typealias HTTP_PUSH_WAIT_TYPE = Int

public typealias HTTP_WEB_SOCKET_BUFFER_TYPE = Int

public typealias HTTP_WEB_SOCKET_CLOSE_STATUS = Int

public typealias HTTP_WEB_SOCKET_OPERATION = Int

public typealias INTERNET_ACCESS_TYPE = UInt

public typealias INTERNET_AUTODIAL = UInt

public typealias INTERNET_CONNECTION = UInt

public typealias INTERNET_COOKIE_FLAGS = UInt

public typealias INTERNET_PER_CONN = UInt

public typealias INTERNET_SCHEME = Int

public typealias INTERNET_STATE = UInt

public typealias InternetCookieState = Int

public fun interface LPINTERNET_STATUS_CALLBACKFn {
    public operator fun invoke(hinternet: Long, dwcontext: ULong, dwinternetstatus: UInt, lpvstatusinformation: Long, dwstatusinformationlength: UInt)
}

public typealias LPINTERNET_STATUS_CALLBACK = LPINTERNET_STATUS_CALLBACKFn?

public fun interface PFN_AUTH_NOTIFYFn {
    public operator fun invoke(param0: ULong, param1: UInt, param2: Long): UInt
}

public typealias PFN_AUTH_NOTIFY = PFN_AUTH_NOTIFYFn?

public fun interface PFN_DIAL_HANDLERFn {
    public operator fun invoke(param0: HWND, param1: PCSTR, param2: UInt, param3: Long): UInt
}

public typealias PFN_DIAL_HANDLER = PFN_DIAL_HANDLERFn?

public typealias PROXY_AUTO_DETECT_TYPE = UInt

public typealias REQUEST_TIMES = Int

public typealias URL_CACHE_LIMIT_TYPE = Int

public typealias WININET_SYNC_MODE = Int

public typealias WPAD_CACHE_DELETE = Int

public fun interface pfnInternetDeInitializeAutoProxyDllFn {
    public operator fun invoke(lpszmime: PCSTR, dwreserved: UInt): BOOL
}

public typealias pfnInternetDeInitializeAutoProxyDll = pfnInternetDeInitializeAutoProxyDllFn?

public fun interface pfnInternetGetProxyInfoFn {
    public operator fun invoke(lpszurl: PCSTR, dwurllength: UInt, lpszurlhostname: PCSTR, dwurlhostnamelength: UInt, lplpszproxyhostname: Long, lpdwproxyhostnamelength: Long): BOOL
}

public typealias pfnInternetGetProxyInfo = pfnInternetGetProxyInfoFn?

public fun interface pfnInternetInitializeAutoProxyDllFn {
    public operator fun invoke(dwversion: UInt, lpszdownloadedtempfile: PCSTR, lpszmime: PCSTR, lpautoproxycallbacks: Long, lpautoproxyscriptbuffer: Long): BOOL
}

public typealias pfnInternetInitializeAutoProxyDll = pfnInternetInitializeAutoProxyDllFn?
