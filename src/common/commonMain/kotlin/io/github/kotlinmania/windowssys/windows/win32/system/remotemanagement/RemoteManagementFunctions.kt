package io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public fun WSManCloseCommand(commandhandle: WSMAN_COMMAND_HANDLE, flags: UInt, async: Long) {
    Win32DynamicFfi.invoke("wsmsvc.dll", "WSManCloseCommand", longArrayOf(commandhandle, flags.toLong(), async))
}

public fun WSManCloseOperation(operationhandle: WSMAN_OPERATION_HANDLE, flags: UInt): UInt {
    return Win32DynamicFfi.invoke("wsmsvc.dll", "WSManCloseOperation", longArrayOf(operationhandle, flags.toLong())).toUInt()
}

public fun WSManCloseSession(session: WSMAN_SESSION_HANDLE, flags: UInt): UInt {
    return Win32DynamicFfi.invoke("wsmsvc.dll", "WSManCloseSession", longArrayOf(session, flags.toLong())).toUInt()
}

public fun WSManCloseShell(shellhandle: WSMAN_SHELL_HANDLE, flags: UInt, async: Long) {
    Win32DynamicFfi.invoke("wsmsvc.dll", "WSManCloseShell", longArrayOf(shellhandle, flags.toLong(), async))
}

public fun WSManConnectShell(session: WSMAN_SESSION_HANDLE, flags: UInt, resourceuri: PCWSTR, shellid: PCWSTR, options: Long, connectxml: Long, async: Long, shell: Long) {
    Win32DynamicFfi.invoke("wsmsvc.dll", "WSManConnectShell", longArrayOf(session, flags.toLong(), resourceuri, shellid, options, connectxml, async, shell))
}

public fun WSManConnectShellCommand(shell: WSMAN_SHELL_HANDLE, flags: UInt, commandid: PCWSTR, options: Long, connectxml: Long, async: Long, command: Long) {
    Win32DynamicFfi.invoke("wsmsvc.dll", "WSManConnectShellCommand", longArrayOf(shell, flags.toLong(), commandid, options, connectxml, async, command))
}

public fun WSManCreateSession(apihandle: WSMAN_API_HANDLE, connection: PCWSTR, flags: UInt, serverauthenticationcredentials: Long, proxyinfo: Long, session: Long): UInt {
    return Win32DynamicFfi.invoke("wsmsvc.dll", "WSManCreateSession", longArrayOf(apihandle, connection, flags.toLong(), serverauthenticationcredentials, proxyinfo, session)).toUInt()
}

public fun WSManCreateShell(session: WSMAN_SESSION_HANDLE, flags: UInt, resourceuri: PCWSTR, startupinfo: Long, options: Long, createxml: Long, async: Long, shell: Long) {
    Win32DynamicFfi.invoke("wsmsvc.dll", "WSManCreateShell", longArrayOf(session, flags.toLong(), resourceuri, startupinfo, options, createxml, async, shell))
}

public fun WSManCreateShellEx(session: WSMAN_SESSION_HANDLE, flags: UInt, resourceuri: PCWSTR, shellid: PCWSTR, startupinfo: Long, options: Long, createxml: Long, async: Long, shell: Long) {
    Win32DynamicFfi.invoke("wsmsvc.dll", "WSManCreateShellEx", longArrayOf(session, flags.toLong(), resourceuri, shellid, startupinfo, options, createxml, async, shell))
}

public fun WSManDeinitialize(apihandle: WSMAN_API_HANDLE, flags: UInt): UInt {
    return Win32DynamicFfi.invoke("wsmsvc.dll", "WSManDeinitialize", longArrayOf(apihandle, flags.toLong())).toUInt()
}

public fun WSManDisconnectShell(shell: WSMAN_SHELL_HANDLE, flags: UInt, disconnectinfo: Long, async: Long) {
    Win32DynamicFfi.invoke("wsmsvc.dll", "WSManDisconnectShell", longArrayOf(shell, flags.toLong(), disconnectinfo, async))
}

public fun WSManGetErrorMessage(apihandle: WSMAN_API_HANDLE, flags: UInt, languagecode: PCWSTR, errorcode: UInt, messagelength: UInt, message: PWSTR, messagelengthused: Long): UInt {
    return Win32DynamicFfi.invoke("wsmsvc.dll", "WSManGetErrorMessage", longArrayOf(apihandle, flags.toLong(), languagecode, errorcode.toLong(), messagelength.toLong(), message, messagelengthused)).toUInt()
}

public fun WSManGetSessionOptionAsDword(session: WSMAN_SESSION_HANDLE, option: WSManSessionOption, value: Long): UInt {
    return Win32DynamicFfi.invoke("wsmsvc.dll", "WSManGetSessionOptionAsDword", longArrayOf(session, option.toLong(), value)).toUInt()
}

public fun WSManGetSessionOptionAsString(session: WSMAN_SESSION_HANDLE, option: WSManSessionOption, stringlength: UInt, string: PWSTR, stringlengthused: Long): UInt {
    return Win32DynamicFfi.invoke("wsmsvc.dll", "WSManGetSessionOptionAsString", longArrayOf(session, option.toLong(), stringlength.toLong(), string, stringlengthused)).toUInt()
}

public fun WSManInitialize(flags: UInt, apihandle: Long): UInt {
    return Win32DynamicFfi.invoke("wsmsvc.dll", "WSManInitialize", longArrayOf(flags.toLong(), apihandle)).toUInt()
}

public fun WSManPluginAuthzOperationComplete(senderdetails: Long, flags: UInt, userauthorizationcontext: Long, errorcode: UInt, extendederrorinformation: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("wsmsvc.dll", "WSManPluginAuthzOperationComplete", longArrayOf(senderdetails, flags.toLong(), userauthorizationcontext, errorcode.toLong(), extendederrorinformation)).toUInt()
}

public fun WSManPluginAuthzQueryQuotaComplete(senderdetails: Long, flags: UInt, quota: Long, errorcode: UInt, extendederrorinformation: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("wsmsvc.dll", "WSManPluginAuthzQueryQuotaComplete", longArrayOf(senderdetails, flags.toLong(), quota, errorcode.toLong(), extendederrorinformation)).toUInt()
}

public fun WSManPluginAuthzUserComplete(senderdetails: Long, flags: UInt, userauthorizationcontext: Long, impersonationtoken: HANDLE, userisadministrator: BOOL, errorcode: UInt, extendederrorinformation: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("wsmsvc.dll", "WSManPluginAuthzUserComplete", longArrayOf(senderdetails, flags.toLong(), userauthorizationcontext, impersonationtoken, userisadministrator.toLong(), errorcode.toLong(), extendederrorinformation)).toUInt()
}

public fun WSManPluginFreeRequestDetails(requestdetails: Long): UInt {
    return Win32DynamicFfi.invoke("wsmsvc.dll", "WSManPluginFreeRequestDetails", longArrayOf(requestdetails)).toUInt()
}

public fun WSManPluginGetConfiguration(plugincontext: Long, flags: UInt, data: Long): UInt {
    return Win32DynamicFfi.invoke("wsmsvc.dll", "WSManPluginGetConfiguration", longArrayOf(plugincontext, flags.toLong(), data)).toUInt()
}

public fun WSManPluginGetOperationParameters(requestdetails: Long, flags: UInt, data: Long): UInt {
    return Win32DynamicFfi.invoke("wsmsvc.dll", "WSManPluginGetOperationParameters", longArrayOf(requestdetails, flags.toLong(), data)).toUInt()
}

public fun WSManPluginOperationComplete(requestdetails: Long, flags: UInt, errorcode: UInt, extendedinformation: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("wsmsvc.dll", "WSManPluginOperationComplete", longArrayOf(requestdetails, flags.toLong(), errorcode.toLong(), extendedinformation)).toUInt()
}

public fun WSManPluginReceiveResult(requestdetails: Long, flags: UInt, stream: PCWSTR, streamresult: Long, commandstate: PCWSTR, exitcode: UInt): UInt {
    return Win32DynamicFfi.invoke("wsmsvc.dll", "WSManPluginReceiveResult", longArrayOf(requestdetails, flags.toLong(), stream, streamresult, commandstate, exitcode.toLong())).toUInt()
}

public fun WSManPluginReportCompletion(plugincontext: Long, flags: UInt): UInt {
    return Win32DynamicFfi.invoke("wsmsvc.dll", "WSManPluginReportCompletion", longArrayOf(plugincontext, flags.toLong())).toUInt()
}

public fun WSManPluginReportContext(requestdetails: Long, flags: UInt, context: Long): UInt {
    return Win32DynamicFfi.invoke("wsmsvc.dll", "WSManPluginReportContext", longArrayOf(requestdetails, flags.toLong(), context)).toUInt()
}

public fun WSManReceiveShellOutput(shell: WSMAN_SHELL_HANDLE, command: WSMAN_COMMAND_HANDLE, flags: UInt, desiredstreamset: Long, async: Long, receiveoperation: Long) {
    Win32DynamicFfi.invoke("wsmsvc.dll", "WSManReceiveShellOutput", longArrayOf(shell, command, flags.toLong(), desiredstreamset, async, receiveoperation))
}

public fun WSManReconnectShell(shell: WSMAN_SHELL_HANDLE, flags: UInt, async: Long) {
    Win32DynamicFfi.invoke("wsmsvc.dll", "WSManReconnectShell", longArrayOf(shell, flags.toLong(), async))
}

public fun WSManReconnectShellCommand(commandhandle: WSMAN_COMMAND_HANDLE, flags: UInt, async: Long) {
    Win32DynamicFfi.invoke("wsmsvc.dll", "WSManReconnectShellCommand", longArrayOf(commandhandle, flags.toLong(), async))
}

public fun WSManRunShellCommand(shell: WSMAN_SHELL_HANDLE, flags: UInt, commandline: PCWSTR, args: Long, options: Long, async: Long, command: Long) {
    Win32DynamicFfi.invoke("wsmsvc.dll", "WSManRunShellCommand", longArrayOf(shell, flags.toLong(), commandline, args, options, async, command))
}

public fun WSManRunShellCommandEx(shell: WSMAN_SHELL_HANDLE, flags: UInt, commandid: PCWSTR, commandline: PCWSTR, args: Long, options: Long, async: Long, command: Long) {
    Win32DynamicFfi.invoke("wsmsvc.dll", "WSManRunShellCommandEx", longArrayOf(shell, flags.toLong(), commandid, commandline, args, options, async, command))
}

public fun WSManSendShellInput(shell: WSMAN_SHELL_HANDLE, command: WSMAN_COMMAND_HANDLE, flags: UInt, streamid: PCWSTR, streamdata: Long, endofstream: BOOL, async: Long, sendoperation: Long) {
    Win32DynamicFfi.invoke("wsmsvc.dll", "WSManSendShellInput", longArrayOf(shell, command, flags.toLong(), streamid, streamdata, endofstream.toLong(), async, sendoperation))
}

public fun WSManSetSessionOption(session: WSMAN_SESSION_HANDLE, option: WSManSessionOption, data: Long): UInt {
    return Win32DynamicFfi.invoke("wsmsvc.dll", "WSManSetSessionOption", longArrayOf(session, option.toLong(), data)).toUInt()
}

public fun WSManSignalShell(shell: WSMAN_SHELL_HANDLE, command: WSMAN_COMMAND_HANDLE, flags: UInt, code: PCWSTR, async: Long, signaloperation: Long) {
    Win32DynamicFfi.invoke("wsmsvc.dll", "WSManSignalShell", longArrayOf(shell, command, flags.toLong(), code, async, signaloperation))
}
