package io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement

import io.github.kotlinmania.windowssys.core.PCWSTR

public typealias WSMAN_API_HANDLE = Long

public typealias WSMAN_COMMAND_HANDLE = Long

public typealias WSMAN_OPERATION_HANDLE = Long

public fun interface WSMAN_PLUGIN_AUTHORIZE_OPERATIONFn {
    public operator fun invoke(plugincontext: Long, senderdetails: Long, flags: UInt, operation: UInt, action: PCWSTR, resourceuri: PCWSTR)
}

public typealias WSMAN_PLUGIN_AUTHORIZE_OPERATION = WSMAN_PLUGIN_AUTHORIZE_OPERATIONFn?

public fun interface WSMAN_PLUGIN_AUTHORIZE_QUERY_QUOTAFn {
    public operator fun invoke(plugincontext: Long, senderdetails: Long, flags: UInt)
}

public typealias WSMAN_PLUGIN_AUTHORIZE_QUERY_QUOTA = WSMAN_PLUGIN_AUTHORIZE_QUERY_QUOTAFn?

public fun interface WSMAN_PLUGIN_AUTHORIZE_RELEASE_CONTEXTFn {
    public operator fun invoke(userauthorizationcontext: Long)
}

public typealias WSMAN_PLUGIN_AUTHORIZE_RELEASE_CONTEXT = WSMAN_PLUGIN_AUTHORIZE_RELEASE_CONTEXTFn?

public fun interface WSMAN_PLUGIN_AUTHORIZE_USERFn {
    public operator fun invoke(plugincontext: Long, senderdetails: Long, flags: UInt)
}

public typealias WSMAN_PLUGIN_AUTHORIZE_USER = WSMAN_PLUGIN_AUTHORIZE_USERFn?

public fun interface WSMAN_PLUGIN_COMMANDFn {
    public operator fun invoke(requestdetails: Long, flags: UInt, shellcontext: Long, commandline: PCWSTR, arguments: Long)
}

public typealias WSMAN_PLUGIN_COMMAND = WSMAN_PLUGIN_COMMANDFn?

public fun interface WSMAN_PLUGIN_CONNECTFn {
    public operator fun invoke(requestdetails: Long, flags: UInt, shellcontext: Long, commandcontext: Long, inboundconnectinformation: Long)
}

public typealias WSMAN_PLUGIN_CONNECT = WSMAN_PLUGIN_CONNECTFn?

public fun interface WSMAN_PLUGIN_RECEIVEFn {
    public operator fun invoke(requestdetails: Long, flags: UInt, shellcontext: Long, commandcontext: Long, streamset: Long)
}

public typealias WSMAN_PLUGIN_RECEIVE = WSMAN_PLUGIN_RECEIVEFn?

public fun interface WSMAN_PLUGIN_RELEASE_COMMAND_CONTEXTFn {
    public operator fun invoke(shellcontext: Long, commandcontext: Long)
}

public typealias WSMAN_PLUGIN_RELEASE_COMMAND_CONTEXT = WSMAN_PLUGIN_RELEASE_COMMAND_CONTEXTFn?

public fun interface WSMAN_PLUGIN_RELEASE_SHELL_CONTEXTFn {
    public operator fun invoke(shellcontext: Long)
}

public typealias WSMAN_PLUGIN_RELEASE_SHELL_CONTEXT = WSMAN_PLUGIN_RELEASE_SHELL_CONTEXTFn?

public fun interface WSMAN_PLUGIN_SENDFn {
    public operator fun invoke(requestdetails: Long, flags: UInt, shellcontext: Long, commandcontext: Long, stream: PCWSTR, inbounddata: Long)
}

public typealias WSMAN_PLUGIN_SEND = WSMAN_PLUGIN_SENDFn?

public fun interface WSMAN_PLUGIN_SHELLFn {
    public operator fun invoke(plugincontext: Long, requestdetails: Long, flags: UInt, startupinfo: Long, inboundshellinformation: Long)
}

public typealias WSMAN_PLUGIN_SHELL = WSMAN_PLUGIN_SHELLFn?

public fun interface WSMAN_PLUGIN_SHUTDOWNFn {
    public operator fun invoke(plugincontext: Long, flags: UInt, reason: UInt): UInt
}

public typealias WSMAN_PLUGIN_SHUTDOWN = WSMAN_PLUGIN_SHUTDOWNFn?

public fun interface WSMAN_PLUGIN_SIGNALFn {
    public operator fun invoke(requestdetails: Long, flags: UInt, shellcontext: Long, commandcontext: Long, code: PCWSTR)
}

public typealias WSMAN_PLUGIN_SIGNAL = WSMAN_PLUGIN_SIGNALFn?

public fun interface WSMAN_PLUGIN_STARTUPFn {
    public operator fun invoke(flags: UInt, applicationidentification: PCWSTR, extrainfo: PCWSTR, plugincontext: Long): UInt
}

public typealias WSMAN_PLUGIN_STARTUP = WSMAN_PLUGIN_STARTUPFn?

public typealias WSMAN_SESSION_HANDLE = Long

public fun interface WSMAN_SHELL_COMPLETION_FUNCTIONFn {
    public operator fun invoke(operationcontext: Long, flags: UInt, error: Long, shell: WSMAN_SHELL_HANDLE, command: WSMAN_COMMAND_HANDLE, operationhandle: WSMAN_OPERATION_HANDLE, data: Long)
}

public typealias WSMAN_SHELL_COMPLETION_FUNCTION = WSMAN_SHELL_COMPLETION_FUNCTIONFn?

public typealias WSMAN_SHELL_HANDLE = Long

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
