package io.github.kotlinmania.windowssys.windows.win32.networking.winhttp

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public typealias WinhttpAccessType = UInt

public typealias WinhttpCredsAuthscheme = UInt

public typealias WinhttpInternetScheme = Int

public typealias WinhttpOpenRequestFlags = UInt

public fun interface WinhttpProxyChangeCallbackFn {
    public operator fun invoke(ullflags: ULong, pvcontext: ConstPtr<CVoid>)
}

public typealias WinhttpProxyChangeCallback = WinhttpProxyChangeCallbackFn?

public typealias WinhttpProxySettingsType = Int

public typealias WinhttpRequestStatEntry = Int

public typealias WinhttpRequestTimeEntry = Int

public typealias WinhttpSecureDnsSetting = Int

public fun interface WinhttpStatusCallbackFn {
    public operator fun invoke(hinternet: MutPtr<CVoid>, dwcontext: ULong, dwinternetstatus: UInt, lpvstatusinformation: MutPtr<CVoid>, dwstatusinformationlength: UInt)
}

public typealias WinhttpStatusCallback = WinhttpStatusCallbackFn?

public typealias WinhttpWebSocketBufferType = Int

public typealias WinhttpWebSocketCloseStatus = Int

public typealias WinhttpWebSocketOperation = Int

public typealias WinHttpCreateUrlFlags = UInt

public typealias WinHttpRequestAutoLogonPolicy = Int

public typealias WinHttpRequestOption = Int

public typealias WinHttpRequestSecureProtocols = Int

public typealias WinHttpRequestSslErrorFlags = Int
