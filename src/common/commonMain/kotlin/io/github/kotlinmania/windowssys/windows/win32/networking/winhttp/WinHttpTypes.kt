package io.github.kotlinmania.windowssys.windows.win32.networking.winhttp

public typealias WINHTTP_ACCESS_TYPE = UInt

public typealias WINHTTP_CREDS_AUTHSCHEME = UInt

public typealias WINHTTP_INTERNET_SCHEME = Int

public typealias WINHTTP_OPEN_REQUEST_FLAGS = UInt

public fun interface WINHTTP_PROXY_CHANGE_CALLBACKFn {
    public operator fun invoke(ullflags: ULong, pvcontext: Long)
}

public typealias WINHTTP_PROXY_CHANGE_CALLBACK = WINHTTP_PROXY_CHANGE_CALLBACKFn?

public typealias WINHTTP_PROXY_SETTINGS_TYPE = Int

public typealias WINHTTP_REQUEST_STAT_ENTRY = Int

public typealias WINHTTP_REQUEST_TIME_ENTRY = Int

public typealias WINHTTP_SECURE_DNS_SETTING = Int

public fun interface WINHTTP_STATUS_CALLBACKFn {
    public operator fun invoke(hinternet: Long, dwcontext: ULong, dwinternetstatus: UInt, lpvstatusinformation: Long, dwstatusinformationlength: UInt)
}

public typealias WINHTTP_STATUS_CALLBACK = WINHTTP_STATUS_CALLBACKFn?

public typealias WINHTTP_WEB_SOCKET_BUFFER_TYPE = Int

public typealias WINHTTP_WEB_SOCKET_CLOSE_STATUS = Int

public typealias WINHTTP_WEB_SOCKET_OPERATION = Int

public typealias WIN_HTTP_CREATE_URL_FLAGS = UInt

public typealias WinHttpRequestAutoLogonPolicy = Int

public typealias WinHttpRequestOption = Int

public typealias WinHttpRequestSecureProtocols = Int

public typealias WinHttpRequestSslErrorFlags = Int
