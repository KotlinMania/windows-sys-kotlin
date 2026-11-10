package io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public expect fun wSManCloseCommand(commandhandle: WsmanCommandHandle, flags: UInt, async: COpaquePointer?)

public expect fun wSManCloseOperation(operationhandle: WsmanOperationHandle, flags: UInt): UInt

public expect fun wSManCloseSession(session: WsmanSessionHandle, flags: UInt): UInt

public expect fun wSManCloseShell(shellhandle: WsmanShellHandle, flags: UInt, async: COpaquePointer?)

public expect fun wSManConnectShell(session: WsmanSessionHandle, flags: UInt, resourceuri: Pcwstr, shellid: Pcwstr, options: COpaquePointer?, connectxml: COpaquePointer?, async: COpaquePointer?, shell: COpaquePointer?)

public expect fun wSManConnectShellCommand(shell: WsmanShellHandle, flags: UInt, commandid: Pcwstr, options: COpaquePointer?, connectxml: COpaquePointer?, async: COpaquePointer?, command: COpaquePointer?)

public expect fun wSManCreateSession(apihandle: WsmanApiHandle, connection: Pcwstr, flags: UInt, serverauthenticationcredentials: COpaquePointer?, proxyinfo: COpaquePointer?, session: COpaquePointer?): UInt

public expect fun wSManCreateShell(session: WsmanSessionHandle, flags: UInt, resourceuri: Pcwstr, startupinfo: COpaquePointer?, options: COpaquePointer?, createxml: COpaquePointer?, async: COpaquePointer?, shell: COpaquePointer?)

public expect fun wSManCreateShellEx(session: WsmanSessionHandle, flags: UInt, resourceuri: Pcwstr, shellid: Pcwstr, startupinfo: COpaquePointer?, options: COpaquePointer?, createxml: COpaquePointer?, async: COpaquePointer?, shell: COpaquePointer?)

public expect fun wSManDeinitialize(apihandle: WsmanApiHandle, flags: UInt): UInt

public expect fun wSManDisconnectShell(shell: WsmanShellHandle, flags: UInt, disconnectinfo: COpaquePointer?, async: COpaquePointer?)

public expect fun wSManGetErrorMessage(apihandle: WsmanApiHandle, flags: UInt, languagecode: Pcwstr, errorcode: UInt, messagelength: UInt, message: Pwstr, messagelengthused: COpaquePointer?): UInt

public expect fun wSManGetSessionOptionAsDword(session: WsmanSessionHandle, option: WSManSessionOption, value: COpaquePointer?): UInt

public expect fun wSManGetSessionOptionAsString(session: WsmanSessionHandle, option: WSManSessionOption, stringlength: UInt, string: Pwstr, stringlengthused: COpaquePointer?): UInt

public expect fun wSManInitialize(flags: UInt, apihandle: COpaquePointer?): UInt

public expect fun wSManPluginAuthzOperationComplete(senderdetails: COpaquePointer?, flags: UInt, userauthorizationcontext: COpaquePointer?, errorcode: UInt, extendederrorinformation: Pcwstr): UInt

public expect fun wSManPluginAuthzQueryQuotaComplete(senderdetails: COpaquePointer?, flags: UInt, quota: COpaquePointer?, errorcode: UInt, extendederrorinformation: Pcwstr): UInt

public expect fun wSManPluginAuthzUserComplete(senderdetails: COpaquePointer?, flags: UInt, userauthorizationcontext: COpaquePointer?, impersonationtoken: Handle, userisadministrator: Bool, errorcode: UInt, extendederrorinformation: Pcwstr): UInt

public expect fun wSManPluginFreeRequestDetails(requestdetails: COpaquePointer?): UInt

public expect fun wSManPluginGetConfiguration(plugincontext: COpaquePointer?, flags: UInt, data: COpaquePointer?): UInt

public expect fun wSManPluginGetOperationParameters(requestdetails: COpaquePointer?, flags: UInt, data: COpaquePointer?): UInt

public expect fun wSManPluginOperationComplete(requestdetails: COpaquePointer?, flags: UInt, errorcode: UInt, extendedinformation: Pcwstr): UInt

public expect fun wSManPluginReceiveResult(requestdetails: COpaquePointer?, flags: UInt, stream: Pcwstr, streamresult: COpaquePointer?, commandstate: Pcwstr, exitcode: UInt): UInt

public expect fun wSManPluginReportCompletion(plugincontext: COpaquePointer?, flags: UInt): UInt

public expect fun wSManPluginReportContext(requestdetails: COpaquePointer?, flags: UInt, context: COpaquePointer?): UInt

public expect fun wSManReceiveShellOutput(shell: WsmanShellHandle, command: WsmanCommandHandle, flags: UInt, desiredstreamset: COpaquePointer?, async: COpaquePointer?, receiveoperation: COpaquePointer?)

public expect fun wSManReconnectShell(shell: WsmanShellHandle, flags: UInt, async: COpaquePointer?)

public expect fun wSManReconnectShellCommand(commandhandle: WsmanCommandHandle, flags: UInt, async: COpaquePointer?)

public expect fun wSManRunShellCommand(shell: WsmanShellHandle, flags: UInt, commandline: Pcwstr, args: COpaquePointer?, options: COpaquePointer?, async: COpaquePointer?, command: COpaquePointer?)

public expect fun wSManRunShellCommandEx(shell: WsmanShellHandle, flags: UInt, commandid: Pcwstr, commandline: Pcwstr, args: COpaquePointer?, options: COpaquePointer?, async: COpaquePointer?, command: COpaquePointer?)

public expect fun wSManSendShellInput(shell: WsmanShellHandle, command: WsmanCommandHandle, flags: UInt, streamid: Pcwstr, streamdata: COpaquePointer?, endofstream: Bool, async: COpaquePointer?, sendoperation: COpaquePointer?)

public expect fun wSManSetSessionOption(session: WsmanSessionHandle, option: WSManSessionOption, data: COpaquePointer?): UInt

public expect fun wSManSignalShell(shell: WsmanShellHandle, command: WsmanCommandHandle, flags: UInt, code: Pcwstr, async: COpaquePointer?, signaloperation: COpaquePointer?)
