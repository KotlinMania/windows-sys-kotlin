package io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public expect fun WSManCloseCommand(commandhandle: WSMAN_COMMAND_HANDLE, flags: UInt, async: Long)

public expect fun WSManCloseOperation(operationhandle: WSMAN_OPERATION_HANDLE, flags: UInt): UInt

public expect fun WSManCloseSession(session: WSMAN_SESSION_HANDLE, flags: UInt): UInt

public expect fun WSManCloseShell(shellhandle: WSMAN_SHELL_HANDLE, flags: UInt, async: Long)

public expect fun WSManConnectShell(session: WSMAN_SESSION_HANDLE, flags: UInt, resourceuri: PCWSTR, shellid: PCWSTR, options: Long, connectxml: Long, async: Long, shell: Long)

public expect fun WSManConnectShellCommand(shell: WSMAN_SHELL_HANDLE, flags: UInt, commandid: PCWSTR, options: Long, connectxml: Long, async: Long, command: Long)

public expect fun WSManCreateSession(apihandle: WSMAN_API_HANDLE, connection: PCWSTR, flags: UInt, serverauthenticationcredentials: Long, proxyinfo: Long, session: Long): UInt

public expect fun WSManCreateShell(session: WSMAN_SESSION_HANDLE, flags: UInt, resourceuri: PCWSTR, startupinfo: Long, options: Long, createxml: Long, async: Long, shell: Long)

public expect fun WSManCreateShellEx(session: WSMAN_SESSION_HANDLE, flags: UInt, resourceuri: PCWSTR, shellid: PCWSTR, startupinfo: Long, options: Long, createxml: Long, async: Long, shell: Long)

public expect fun WSManDeinitialize(apihandle: WSMAN_API_HANDLE, flags: UInt): UInt

public expect fun WSManDisconnectShell(shell: WSMAN_SHELL_HANDLE, flags: UInt, disconnectinfo: Long, async: Long)

public expect fun WSManGetErrorMessage(apihandle: WSMAN_API_HANDLE, flags: UInt, languagecode: PCWSTR, errorcode: UInt, messagelength: UInt, message: PWSTR, messagelengthused: Long): UInt

public expect fun WSManGetSessionOptionAsDword(session: WSMAN_SESSION_HANDLE, option: WSManSessionOption, value: Long): UInt

public expect fun WSManGetSessionOptionAsString(session: WSMAN_SESSION_HANDLE, option: WSManSessionOption, stringlength: UInt, string: PWSTR, stringlengthused: Long): UInt

public expect fun WSManInitialize(flags: UInt, apihandle: Long): UInt

public expect fun WSManPluginAuthzOperationComplete(senderdetails: Long, flags: UInt, userauthorizationcontext: Long, errorcode: UInt, extendederrorinformation: PCWSTR): UInt

public expect fun WSManPluginAuthzQueryQuotaComplete(senderdetails: Long, flags: UInt, quota: Long, errorcode: UInt, extendederrorinformation: PCWSTR): UInt

public expect fun WSManPluginAuthzUserComplete(senderdetails: Long, flags: UInt, userauthorizationcontext: Long, impersonationtoken: HANDLE, userisadministrator: BOOL, errorcode: UInt, extendederrorinformation: PCWSTR): UInt

public expect fun WSManPluginFreeRequestDetails(requestdetails: Long): UInt

public expect fun WSManPluginGetConfiguration(plugincontext: Long, flags: UInt, data: Long): UInt

public expect fun WSManPluginGetOperationParameters(requestdetails: Long, flags: UInt, data: Long): UInt

public expect fun WSManPluginOperationComplete(requestdetails: Long, flags: UInt, errorcode: UInt, extendedinformation: PCWSTR): UInt

public expect fun WSManPluginReceiveResult(requestdetails: Long, flags: UInt, stream: PCWSTR, streamresult: Long, commandstate: PCWSTR, exitcode: UInt): UInt

public expect fun WSManPluginReportCompletion(plugincontext: Long, flags: UInt): UInt

public expect fun WSManPluginReportContext(requestdetails: Long, flags: UInt, context: Long): UInt

public expect fun WSManReceiveShellOutput(shell: WSMAN_SHELL_HANDLE, command: WSMAN_COMMAND_HANDLE, flags: UInt, desiredstreamset: Long, async: Long, receiveoperation: Long)

public expect fun WSManReconnectShell(shell: WSMAN_SHELL_HANDLE, flags: UInt, async: Long)

public expect fun WSManReconnectShellCommand(commandhandle: WSMAN_COMMAND_HANDLE, flags: UInt, async: Long)

public expect fun WSManRunShellCommand(shell: WSMAN_SHELL_HANDLE, flags: UInt, commandline: PCWSTR, args: Long, options: Long, async: Long, command: Long)

public expect fun WSManRunShellCommandEx(shell: WSMAN_SHELL_HANDLE, flags: UInt, commandid: PCWSTR, commandline: PCWSTR, args: Long, options: Long, async: Long, command: Long)

public expect fun WSManSendShellInput(shell: WSMAN_SHELL_HANDLE, command: WSMAN_COMMAND_HANDLE, flags: UInt, streamid: PCWSTR, streamdata: Long, endofstream: BOOL, async: Long, sendoperation: Long)

public expect fun WSManSetSessionOption(session: WSMAN_SESSION_HANDLE, option: WSManSessionOption, data: Long): UInt

public expect fun WSManSignalShell(shell: WSMAN_SHELL_HANDLE, command: WSMAN_COMMAND_HANDLE, flags: UInt, code: PCWSTR, async: Long, signaloperation: Long)
