package io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public expect fun wSManCloseCommand(commandhandle: WsmanCommandHandle, flags: UInt, async: ConstPtr<WsmanShellAsync>)

public expect fun wSManCloseOperation(operationhandle: WsmanOperationHandle, flags: UInt): UInt

public expect fun wSManCloseSession(session: WsmanSessionHandle, flags: UInt): UInt

public expect fun wSManCloseShell(shellhandle: WsmanShellHandle, flags: UInt, async: ConstPtr<WsmanShellAsync>)

public expect fun wSManConnectShell(session: WsmanSessionHandle, flags: UInt, resourceuri: Pcwstr, shellid: Pcwstr, options: ConstPtr<WsmanOptionSet>, connectxml: ConstPtr<WsmanData>, async: ConstPtr<WsmanShellAsync>, shell: MutPtr<WsmanShellHandle>)

public expect fun wSManConnectShellCommand(shell: WsmanShellHandle, flags: UInt, commandid: Pcwstr, options: ConstPtr<WsmanOptionSet>, connectxml: ConstPtr<WsmanData>, async: ConstPtr<WsmanShellAsync>, command: MutPtr<WsmanCommandHandle>)

public expect fun wSManCreateSession(apihandle: WsmanApiHandle, connection: Pcwstr, flags: UInt, serverauthenticationcredentials: ConstPtr<WsmanAuthenticationCredentials>, proxyinfo: ConstPtr<WsmanProxyInfo>, session: MutPtr<WsmanSessionHandle>): UInt

public expect fun wSManCreateShell(session: WsmanSessionHandle, flags: UInt, resourceuri: Pcwstr, startupinfo: ConstPtr<WsmanShellStartupInfoV11>, options: ConstPtr<WsmanOptionSet>, createxml: ConstPtr<WsmanData>, async: ConstPtr<WsmanShellAsync>, shell: MutPtr<WsmanShellHandle>)

public expect fun wSManCreateShellEx(session: WsmanSessionHandle, flags: UInt, resourceuri: Pcwstr, shellid: Pcwstr, startupinfo: ConstPtr<WsmanShellStartupInfoV11>, options: ConstPtr<WsmanOptionSet>, createxml: ConstPtr<WsmanData>, async: ConstPtr<WsmanShellAsync>, shell: MutPtr<WsmanShellHandle>)

public expect fun wSManDeinitialize(apihandle: WsmanApiHandle, flags: UInt): UInt

public expect fun wSManDisconnectShell(shell: WsmanShellHandle, flags: UInt, disconnectinfo: ConstPtr<WsmanShellDisconnectInfo>, async: ConstPtr<WsmanShellAsync>)

public expect fun wSManGetErrorMessage(apihandle: WsmanApiHandle, flags: UInt, languagecode: Pcwstr, errorcode: UInt, messagelength: UInt, message: Pwstr, messagelengthused: MutPtr<UInt>): UInt

public expect fun wSManGetSessionOptionAsDword(session: WsmanSessionHandle, option: WSManSessionOption, value: MutPtr<UInt>): UInt

public expect fun wSManGetSessionOptionAsString(session: WsmanSessionHandle, option: WSManSessionOption, stringlength: UInt, string: Pwstr, stringlengthused: MutPtr<UInt>): UInt

public expect fun wSManInitialize(flags: UInt, apihandle: MutPtr<WsmanApiHandle>): UInt

public expect fun wSManPluginAuthzOperationComplete(senderdetails: ConstPtr<WsmanSenderDetails>, flags: UInt, userauthorizationcontext: ConstPtr<CVoid>, errorcode: UInt, extendederrorinformation: Pcwstr): UInt

public expect fun wSManPluginAuthzQueryQuotaComplete(senderdetails: ConstPtr<WsmanSenderDetails>, flags: UInt, quota: ConstPtr<WsmanAuthzQuota>, errorcode: UInt, extendederrorinformation: Pcwstr): UInt

public expect fun wSManPluginAuthzUserComplete(senderdetails: ConstPtr<WsmanSenderDetails>, flags: UInt, userauthorizationcontext: ConstPtr<CVoid>, impersonationtoken: Handle, userisadministrator: Bool, errorcode: UInt, extendederrorinformation: Pcwstr): UInt

public expect fun wSManPluginFreeRequestDetails(requestdetails: ConstPtr<WsmanPluginRequest>): UInt

public expect fun wSManPluginGetConfiguration(plugincontext: ConstPtr<CVoid>, flags: UInt, data: MutPtr<WsmanData>): UInt

public expect fun wSManPluginGetOperationParameters(requestdetails: ConstPtr<WsmanPluginRequest>, flags: UInt, data: MutPtr<WsmanData>): UInt

public expect fun wSManPluginOperationComplete(requestdetails: ConstPtr<WsmanPluginRequest>, flags: UInt, errorcode: UInt, extendedinformation: Pcwstr): UInt

public expect fun wSManPluginReceiveResult(requestdetails: ConstPtr<WsmanPluginRequest>, flags: UInt, stream: Pcwstr, streamresult: ConstPtr<WsmanData>, commandstate: Pcwstr, exitcode: UInt): UInt

public expect fun wSManPluginReportCompletion(plugincontext: ConstPtr<CVoid>, flags: UInt): UInt

public expect fun wSManPluginReportContext(requestdetails: ConstPtr<WsmanPluginRequest>, flags: UInt, context: ConstPtr<CVoid>): UInt

public expect fun wSManReceiveShellOutput(shell: WsmanShellHandle, command: WsmanCommandHandle, flags: UInt, desiredstreamset: ConstPtr<WsmanStreamIdSet>, async: ConstPtr<WsmanShellAsync>, receiveoperation: MutPtr<WsmanOperationHandle>)

public expect fun wSManReconnectShell(shell: WsmanShellHandle, flags: UInt, async: ConstPtr<WsmanShellAsync>)

public expect fun wSManReconnectShellCommand(commandhandle: WsmanCommandHandle, flags: UInt, async: ConstPtr<WsmanShellAsync>)

public expect fun wSManRunShellCommand(shell: WsmanShellHandle, flags: UInt, commandline: Pcwstr, args: ConstPtr<WsmanCommandArgSet>, options: ConstPtr<WsmanOptionSet>, async: ConstPtr<WsmanShellAsync>, command: MutPtr<WsmanCommandHandle>)

public expect fun wSManRunShellCommandEx(shell: WsmanShellHandle, flags: UInt, commandid: Pcwstr, commandline: Pcwstr, args: ConstPtr<WsmanCommandArgSet>, options: ConstPtr<WsmanOptionSet>, async: ConstPtr<WsmanShellAsync>, command: MutPtr<WsmanCommandHandle>)

public expect fun wSManSendShellInput(shell: WsmanShellHandle, command: WsmanCommandHandle, flags: UInt, streamid: Pcwstr, streamdata: ConstPtr<WsmanData>, endofstream: Bool, async: ConstPtr<WsmanShellAsync>, sendoperation: MutPtr<WsmanOperationHandle>)

public expect fun wSManSetSessionOption(session: WsmanSessionHandle, option: WSManSessionOption, data: ConstPtr<WsmanData>): UInt

public expect fun wSManSignalShell(shell: WsmanShellHandle, command: WsmanCommandHandle, flags: UInt, code: Pcwstr, async: ConstPtr<WsmanShellAsync>, signaloperation: MutPtr<WsmanOperationHandle>)
