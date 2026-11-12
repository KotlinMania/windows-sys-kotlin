package io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public expect fun wSManCloseCommand(commandhandle: WsmanCommandHandle, flags: UInt, async: ConstPtr)

public expect fun wSManCloseOperation(operationhandle: WsmanOperationHandle, flags: UInt): UInt

public expect fun wSManCloseSession(session: WsmanSessionHandle, flags: UInt): UInt

public expect fun wSManCloseShell(shellhandle: WsmanShellHandle, flags: UInt, async: ConstPtr)

public expect fun wSManConnectShell(session: WsmanSessionHandle, flags: UInt, resourceuri: Pcwstr, shellid: Pcwstr, options: ConstPtr, connectxml: ConstPtr, async: ConstPtr, shell: MutPtr)

public expect fun wSManConnectShellCommand(shell: WsmanShellHandle, flags: UInt, commandid: Pcwstr, options: ConstPtr, connectxml: ConstPtr, async: ConstPtr, command: MutPtr)

public expect fun wSManCreateSession(apihandle: WsmanApiHandle, connection: Pcwstr, flags: UInt, serverauthenticationcredentials: ConstPtr, proxyinfo: ConstPtr, session: MutPtr): UInt

public expect fun wSManCreateShell(session: WsmanSessionHandle, flags: UInt, resourceuri: Pcwstr, startupinfo: ConstPtr, options: ConstPtr, createxml: ConstPtr, async: ConstPtr, shell: MutPtr)

public expect fun wSManCreateShellEx(session: WsmanSessionHandle, flags: UInt, resourceuri: Pcwstr, shellid: Pcwstr, startupinfo: ConstPtr, options: ConstPtr, createxml: ConstPtr, async: ConstPtr, shell: MutPtr)

public expect fun wSManDeinitialize(apihandle: WsmanApiHandle, flags: UInt): UInt

public expect fun wSManDisconnectShell(shell: WsmanShellHandle, flags: UInt, disconnectinfo: ConstPtr, async: ConstPtr)

public expect fun wSManGetErrorMessage(apihandle: WsmanApiHandle, flags: UInt, languagecode: Pcwstr, errorcode: UInt, messagelength: UInt, message: Pwstr, messagelengthused: MutPtr): UInt

public expect fun wSManGetSessionOptionAsDword(session: WsmanSessionHandle, option: WSManSessionOption, value: MutPtr): UInt

public expect fun wSManGetSessionOptionAsString(session: WsmanSessionHandle, option: WSManSessionOption, stringlength: UInt, string: Pwstr, stringlengthused: MutPtr): UInt

public expect fun wSManInitialize(flags: UInt, apihandle: MutPtr): UInt

public expect fun wSManPluginAuthzOperationComplete(senderdetails: ConstPtr, flags: UInt, userauthorizationcontext: ConstPtr, errorcode: UInt, extendederrorinformation: Pcwstr): UInt

public expect fun wSManPluginAuthzQueryQuotaComplete(senderdetails: ConstPtr, flags: UInt, quota: ConstPtr, errorcode: UInt, extendederrorinformation: Pcwstr): UInt

public expect fun wSManPluginAuthzUserComplete(senderdetails: ConstPtr, flags: UInt, userauthorizationcontext: ConstPtr, impersonationtoken: Handle, userisadministrator: Bool, errorcode: UInt, extendederrorinformation: Pcwstr): UInt

public expect fun wSManPluginFreeRequestDetails(requestdetails: ConstPtr): UInt

public expect fun wSManPluginGetConfiguration(plugincontext: ConstPtr, flags: UInt, data: MutPtr): UInt

public expect fun wSManPluginGetOperationParameters(requestdetails: ConstPtr, flags: UInt, data: MutPtr): UInt

public expect fun wSManPluginOperationComplete(requestdetails: ConstPtr, flags: UInt, errorcode: UInt, extendedinformation: Pcwstr): UInt

public expect fun wSManPluginReceiveResult(requestdetails: ConstPtr, flags: UInt, stream: Pcwstr, streamresult: ConstPtr, commandstate: Pcwstr, exitcode: UInt): UInt

public expect fun wSManPluginReportCompletion(plugincontext: ConstPtr, flags: UInt): UInt

public expect fun wSManPluginReportContext(requestdetails: ConstPtr, flags: UInt, context: ConstPtr): UInt

public expect fun wSManReceiveShellOutput(shell: WsmanShellHandle, command: WsmanCommandHandle, flags: UInt, desiredstreamset: ConstPtr, async: ConstPtr, receiveoperation: MutPtr)

public expect fun wSManReconnectShell(shell: WsmanShellHandle, flags: UInt, async: ConstPtr)

public expect fun wSManReconnectShellCommand(commandhandle: WsmanCommandHandle, flags: UInt, async: ConstPtr)

public expect fun wSManRunShellCommand(shell: WsmanShellHandle, flags: UInt, commandline: Pcwstr, args: ConstPtr, options: ConstPtr, async: ConstPtr, command: MutPtr)

public expect fun wSManRunShellCommandEx(shell: WsmanShellHandle, flags: UInt, commandid: Pcwstr, commandline: Pcwstr, args: ConstPtr, options: ConstPtr, async: ConstPtr, command: MutPtr)

public expect fun wSManSendShellInput(shell: WsmanShellHandle, command: WsmanCommandHandle, flags: UInt, streamid: Pcwstr, streamdata: ConstPtr, endofstream: Bool, async: ConstPtr, sendoperation: MutPtr)

public expect fun wSManSetSessionOption(session: WsmanSessionHandle, option: WSManSessionOption, data: ConstPtr): UInt

public expect fun wSManSignalShell(shell: WsmanShellHandle, command: WsmanCommandHandle, flags: UInt, code: Pcwstr, async: ConstPtr, signaloperation: MutPtr)
