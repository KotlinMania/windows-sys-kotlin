package io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcwstr

public typealias WsmanApiHandle = Long

public typealias WsmanCommandHandle = Long

public typealias WsmanOperationHandle = Long

public fun interface WsmanPluginAuthorizeOperationFn {
    public operator fun invoke(plugincontext: COpaquePointer?, senderdetails: COpaquePointer?, flags: UInt, operation: UInt, action: Pcwstr, resourceuri: Pcwstr)
}

public typealias WsmanPluginAuthorizeOperation = WsmanPluginAuthorizeOperationFn?

public fun interface WsmanPluginAuthorizeQueryQuotaFn {
    public operator fun invoke(plugincontext: COpaquePointer?, senderdetails: COpaquePointer?, flags: UInt)
}

public typealias WsmanPluginAuthorizeQueryQuota = WsmanPluginAuthorizeQueryQuotaFn?

public fun interface WsmanPluginAuthorizeReleaseContextFn {
    public operator fun invoke(userauthorizationcontext: COpaquePointer?)
}

public typealias WsmanPluginAuthorizeReleaseContext = WsmanPluginAuthorizeReleaseContextFn?

public fun interface WsmanPluginAuthorizeUserFn {
    public operator fun invoke(plugincontext: COpaquePointer?, senderdetails: COpaquePointer?, flags: UInt)
}

public typealias WsmanPluginAuthorizeUser = WsmanPluginAuthorizeUserFn?

public fun interface WsmanPluginCommandFn {
    public operator fun invoke(requestdetails: COpaquePointer?, flags: UInt, shellcontext: COpaquePointer?, commandline: Pcwstr, arguments: COpaquePointer?)
}

public typealias WsmanPluginCommand = WsmanPluginCommandFn?

public fun interface WsmanPluginConnectFn {
    public operator fun invoke(requestdetails: COpaquePointer?, flags: UInt, shellcontext: COpaquePointer?, commandcontext: COpaquePointer?, inboundconnectinformation: COpaquePointer?)
}

public typealias WsmanPluginConnect = WsmanPluginConnectFn?

public fun interface WsmanPluginReceiveFn {
    public operator fun invoke(requestdetails: COpaquePointer?, flags: UInt, shellcontext: COpaquePointer?, commandcontext: COpaquePointer?, streamset: COpaquePointer?)
}

public typealias WsmanPluginReceive = WsmanPluginReceiveFn?

public fun interface WsmanPluginReleaseCommandContextFn {
    public operator fun invoke(shellcontext: COpaquePointer?, commandcontext: COpaquePointer?)
}

public typealias WsmanPluginReleaseCommandContext = WsmanPluginReleaseCommandContextFn?

public fun interface WsmanPluginReleaseShellContextFn {
    public operator fun invoke(shellcontext: COpaquePointer?)
}

public typealias WsmanPluginReleaseShellContext = WsmanPluginReleaseShellContextFn?

public fun interface WsmanPluginSendFn {
    public operator fun invoke(requestdetails: COpaquePointer?, flags: UInt, shellcontext: COpaquePointer?, commandcontext: COpaquePointer?, stream: Pcwstr, inbounddata: COpaquePointer?)
}

public typealias WsmanPluginSend = WsmanPluginSendFn?

public fun interface WsmanPluginShellFn {
    public operator fun invoke(plugincontext: COpaquePointer?, requestdetails: COpaquePointer?, flags: UInt, startupinfo: COpaquePointer?, inboundshellinformation: COpaquePointer?)
}

public typealias WsmanPluginShell = WsmanPluginShellFn?

public fun interface WsmanPluginShutdownFn {
    public operator fun invoke(plugincontext: COpaquePointer?, flags: UInt, reason: UInt): UInt
}

public typealias WsmanPluginShutdown = WsmanPluginShutdownFn?

public fun interface WsmanPluginSignalFn {
    public operator fun invoke(requestdetails: COpaquePointer?, flags: UInt, shellcontext: COpaquePointer?, commandcontext: COpaquePointer?, code: Pcwstr)
}

public typealias WsmanPluginSignal = WsmanPluginSignalFn?

public fun interface WsmanPluginStartupFn {
    public operator fun invoke(flags: UInt, applicationidentification: Pcwstr, extrainfo: Pcwstr, plugincontext: COpaquePointer?): UInt
}

public typealias WsmanPluginStartup = WsmanPluginStartupFn?

public typealias WsmanSessionHandle = Long

public fun interface WsmanShellCompletionFunctionFn {
    public operator fun invoke(operationcontext: COpaquePointer?, flags: UInt, error: COpaquePointer?, shell: WsmanShellHandle, command: WsmanCommandHandle, operationhandle: WsmanOperationHandle, data: COpaquePointer?)
}

public typealias WsmanShellCompletionFunction = WsmanShellCompletionFunctionFn?

public typealias WsmanShellHandle = Long

public typealias WSManAuthenticationFlags = Int

public typealias WSManCallbackFlags = Int

public typealias WSManDataType = Int

public typealias WSManEnumFlags = Int

public typealias WSManProxyAccessType = Int

public typealias WSManProxyAccessTypeFlags = Int

public typealias WSManProxyAuthenticationFlags = Int

public typealias WSManSessionFlags = Int

public typealias WSManSessionOption = Int

public typealias WSManShellFlag = Int
