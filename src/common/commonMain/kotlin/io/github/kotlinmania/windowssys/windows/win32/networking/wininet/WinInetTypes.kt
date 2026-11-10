package io.github.kotlinmania.windowssys.windows.win32.networking.wininet

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

public typealias AppCacheFinalizeState = Int

public typealias AppCacheState = Int

public typealias CacheConfig = UInt

public fun interface CacheOperatorFn {
    public operator fun invoke(pcei: COpaquePointer?, pcbcei: COpaquePointer?, popdata: COpaquePointer?): Bool
}

public typealias CacheOperator = CacheOperatorFn?

public typealias Fortcmd = Int

public typealias Fortstat = Int

public typealias FtpFlags = UInt

public fun interface GopherAttributeEnumeratorFn {
    public operator fun invoke(lpattributeinfo: COpaquePointer?, dwerror: UInt): Bool
}

public typealias GopherAttributeEnumerator = GopherAttributeEnumeratorFn?

public typealias GopherType = UInt

public typealias HttpAddreqFlag = UInt

public fun interface HttpPolicyExtensionInitFn {
    public operator fun invoke(version: HttpPolicyExtensionVersion, type: HttpPolicyExtensionType, pvdata: COpaquePointer?, cbdata: UInt): UInt
}

public typealias HttpPolicyExtensionInit = HttpPolicyExtensionInitFn?

public fun interface HttpPolicyExtensionShutdownFn {
    public operator fun invoke(type: HttpPolicyExtensionType): UInt
}

public typealias HttpPolicyExtensionShutdown = HttpPolicyExtensionShutdownFn?

public typealias HttpPolicyExtensionType = Int

public typealias HttpPolicyExtensionVersion = Int

public typealias HttpPushWaitHandle = COpaquePointer?

public typealias HttpPushWaitType = Int

public typealias HttpWebSocketBufferType = Int

public typealias HttpWebSocketCloseStatus = Int

public typealias HttpWebSocketOperation = Int

public typealias InternetAccessType = UInt

public typealias InternetAutodial = UInt

public typealias InternetConnection = UInt

public typealias InternetCookieFlags = UInt

public typealias InternetPerConn = UInt

public typealias InternetScheme = Int

public typealias InternetState = UInt

public typealias InternetCookieState = Int

public fun interface LpinternetStatusCallbackFn {
    public operator fun invoke(hinternet: COpaquePointer?, dwcontext: ULong, dwinternetstatus: UInt, lpvstatusinformation: COpaquePointer?, dwstatusinformationlength: UInt)
}

public typealias LpinternetStatusCallback = LpinternetStatusCallbackFn?

public fun interface PfnAuthNotifyFn {
    public operator fun invoke(param0: ULong, param1: UInt, param2: COpaquePointer?): UInt
}

public typealias PfnAuthNotify = PfnAuthNotifyFn?

public fun interface PfnDialHandlerFn {
    public operator fun invoke(param0: Hwnd, param1: Pcstr, param2: UInt, param3: COpaquePointer?): UInt
}

public typealias PfnDialHandler = PfnDialHandlerFn?

public typealias ProxyAutoDetectType = UInt

public typealias RequestTimes = Int

public typealias UrlCacheLimitType = Int

public typealias WininetSyncMode = Int

public typealias WpadCacheDelete = Int

public fun interface PfnInternetDeInitializeAutoProxyDllFn {
    public operator fun invoke(lpszmime: Pcstr, dwreserved: UInt): Bool
}

public typealias PfnInternetDeInitializeAutoProxyDll = PfnInternetDeInitializeAutoProxyDllFn?

public fun interface PfnInternetGetProxyInfoFn {
    public operator fun invoke(lpszurl: Pcstr, dwurllength: UInt, lpszurlhostname: Pcstr, dwurlhostnamelength: UInt, lplpszproxyhostname: COpaquePointer?, lpdwproxyhostnamelength: COpaquePointer?): Bool
}

public typealias PfnInternetGetProxyInfo = PfnInternetGetProxyInfoFn?

public fun interface PfnInternetInitializeAutoProxyDllFn {
    public operator fun invoke(dwversion: UInt, lpszdownloadedtempfile: Pcstr, lpszmime: Pcstr, lpautoproxycallbacks: COpaquePointer?, lpautoproxyscriptbuffer: COpaquePointer?): Bool
}

public typealias PfnInternetInitializeAutoProxyDll = PfnInternetInitializeAutoProxyDllFn?
