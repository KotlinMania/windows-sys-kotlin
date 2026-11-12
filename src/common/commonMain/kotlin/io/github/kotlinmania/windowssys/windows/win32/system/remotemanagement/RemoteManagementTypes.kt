package io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcwstr

public typealias WsmanApiHandle = Long

public typealias WsmanCommandHandle = Long

public typealias WsmanOperationHandle = Long

public fun interface WsmanPluginAuthorizeOperationFn {
    public operator fun invoke(plugincontext: ConstPtr<CVoid>, senderdetails: ConstPtr<WsmanSenderDetails>, flags: UInt, operation: UInt, action: Pcwstr, resourceuri: Pcwstr)
}

public typealias WsmanPluginAuthorizeOperation = WsmanPluginAuthorizeOperationFn?

public fun interface WsmanPluginAuthorizeQueryQuotaFn {
    public operator fun invoke(plugincontext: ConstPtr<CVoid>, senderdetails: ConstPtr<WsmanSenderDetails>, flags: UInt)
}

public typealias WsmanPluginAuthorizeQueryQuota = WsmanPluginAuthorizeQueryQuotaFn?

public fun interface WsmanPluginAuthorizeReleaseContextFn {
    public operator fun invoke(userauthorizationcontext: ConstPtr<CVoid>)
}

public typealias WsmanPluginAuthorizeReleaseContext = WsmanPluginAuthorizeReleaseContextFn?

public fun interface WsmanPluginAuthorizeUserFn {
    public operator fun invoke(plugincontext: ConstPtr<CVoid>, senderdetails: ConstPtr<WsmanSenderDetails>, flags: UInt)
}

public typealias WsmanPluginAuthorizeUser = WsmanPluginAuthorizeUserFn?

public fun interface WsmanPluginCommandFn {
    public operator fun invoke(requestdetails: ConstPtr<WsmanPluginRequest>, flags: UInt, shellcontext: ConstPtr<CVoid>, commandline: Pcwstr, arguments: ConstPtr<WsmanCommandArgSet>)
}

public typealias WsmanPluginCommand = WsmanPluginCommandFn?

public fun interface WsmanPluginConnectFn {
    public operator fun invoke(requestdetails: ConstPtr<WsmanPluginRequest>, flags: UInt, shellcontext: ConstPtr<CVoid>, commandcontext: ConstPtr<CVoid>, inboundconnectinformation: ConstPtr<WsmanData>)
}

public typealias WsmanPluginConnect = WsmanPluginConnectFn?

public fun interface WsmanPluginReceiveFn {
    public operator fun invoke(requestdetails: ConstPtr<WsmanPluginRequest>, flags: UInt, shellcontext: ConstPtr<CVoid>, commandcontext: ConstPtr<CVoid>, streamset: ConstPtr<WsmanStreamIdSet>)
}

public typealias WsmanPluginReceive = WsmanPluginReceiveFn?

public fun interface WsmanPluginReleaseCommandContextFn {
    public operator fun invoke(shellcontext: ConstPtr<CVoid>, commandcontext: ConstPtr<CVoid>)
}

public typealias WsmanPluginReleaseCommandContext = WsmanPluginReleaseCommandContextFn?

public fun interface WsmanPluginReleaseShellContextFn {
    public operator fun invoke(shellcontext: ConstPtr<CVoid>)
}

public typealias WsmanPluginReleaseShellContext = WsmanPluginReleaseShellContextFn?

public fun interface WsmanPluginSendFn {
    public operator fun invoke(requestdetails: ConstPtr<WsmanPluginRequest>, flags: UInt, shellcontext: ConstPtr<CVoid>, commandcontext: ConstPtr<CVoid>, stream: Pcwstr, inbounddata: ConstPtr<WsmanData>)
}

public typealias WsmanPluginSend = WsmanPluginSendFn?

public fun interface WsmanPluginShellFn {
    public operator fun invoke(plugincontext: ConstPtr<CVoid>, requestdetails: ConstPtr<WsmanPluginRequest>, flags: UInt, startupinfo: ConstPtr<WsmanShellStartupInfoV11>, inboundshellinformation: ConstPtr<WsmanData>)
}

public typealias WsmanPluginShell = WsmanPluginShellFn?

public fun interface WsmanPluginShutdownFn {
    public operator fun invoke(plugincontext: ConstPtr<CVoid>, flags: UInt, reason: UInt): UInt
}

public typealias WsmanPluginShutdown = WsmanPluginShutdownFn?

public fun interface WsmanPluginSignalFn {
    public operator fun invoke(requestdetails: ConstPtr<WsmanPluginRequest>, flags: UInt, shellcontext: ConstPtr<CVoid>, commandcontext: ConstPtr<CVoid>, code: Pcwstr)
}

public typealias WsmanPluginSignal = WsmanPluginSignalFn?

public fun interface WsmanPluginStartupFn {
    public operator fun invoke(flags: UInt, applicationidentification: Pcwstr, extrainfo: Pcwstr, plugincontext: MutPtr<MutPtr<CVoid>>): UInt
}

public typealias WsmanPluginStartup = WsmanPluginStartupFn?

public typealias WsmanSessionHandle = Long

public fun interface WsmanShellCompletionFunctionFn {
    public operator fun invoke(operationcontext: ConstPtr<CVoid>, flags: UInt, error: ConstPtr<WsmanError>, shell: WsmanShellHandle, command: WsmanCommandHandle, operationhandle: WsmanOperationHandle, data: ConstPtr<WsmanResponseData>)
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
