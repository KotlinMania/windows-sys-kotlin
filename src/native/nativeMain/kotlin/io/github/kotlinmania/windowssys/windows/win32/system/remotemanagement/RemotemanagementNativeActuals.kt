@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun WSManCloseCommand(commandhandle: WSMAN_COMMAND_HANDLE, flags: UInt, async: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssys_windows_win32_system_remotemanagement_WSManCloseCommand(commandhandle, flags, async.toCPointer<ByteVar>())
}

public actual fun WSManCloseOperation(operationhandle: WSMAN_OPERATION_HANDLE, flags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssys_windows_win32_system_remotemanagement_WSManCloseOperation(operationhandle, flags)

public actual fun WSManCloseSession(session: WSMAN_SESSION_HANDLE, flags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssys_windows_win32_system_remotemanagement_WSManCloseSession(session, flags)

public actual fun WSManCloseShell(shellhandle: WSMAN_SHELL_HANDLE, flags: UInt, async: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssys_windows_win32_system_remotemanagement_WSManCloseShell(shellhandle, flags, async.toCPointer<ByteVar>())
}

public actual fun WSManConnectShell(session: WSMAN_SESSION_HANDLE, flags: UInt, resourceuri: PCWSTR, shellid: PCWSTR, options: Long, connectxml: Long, async: Long, shell: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssys_windows_win32_system_remotemanagement_WSManConnectShell(session, flags, resourceuri.toCPointer<ByteVar>(), shellid.toCPointer<ByteVar>(), options.toCPointer<ByteVar>(), connectxml.toCPointer<ByteVar>(), async.toCPointer<ByteVar>(), shell.toCPointer<ByteVar>())
}

public actual fun WSManConnectShellCommand(shell: WSMAN_SHELL_HANDLE, flags: UInt, commandid: PCWSTR, options: Long, connectxml: Long, async: Long, command: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssys_windows_win32_system_remotemanagement_WSManConnectShellCommand(shell, flags, commandid.toCPointer<ByteVar>(), options.toCPointer<ByteVar>(), connectxml.toCPointer<ByteVar>(), async.toCPointer<ByteVar>(), command.toCPointer<ByteVar>())
}

public actual fun WSManCreateSession(apihandle: WSMAN_API_HANDLE, connection: PCWSTR, flags: UInt, serverauthenticationcredentials: Long, proxyinfo: Long, session: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssys_windows_win32_system_remotemanagement_WSManCreateSession(apihandle, connection.toCPointer<ByteVar>(), flags, serverauthenticationcredentials.toCPointer<ByteVar>(), proxyinfo.toCPointer<ByteVar>(), session.toCPointer<ByteVar>())

public actual fun WSManCreateShell(session: WSMAN_SESSION_HANDLE, flags: UInt, resourceuri: PCWSTR, startupinfo: Long, options: Long, createxml: Long, async: Long, shell: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssys_windows_win32_system_remotemanagement_WSManCreateShell(session, flags, resourceuri.toCPointer<ByteVar>(), startupinfo.toCPointer<ByteVar>(), options.toCPointer<ByteVar>(), createxml.toCPointer<ByteVar>(), async.toCPointer<ByteVar>(), shell.toCPointer<ByteVar>())
}

public actual fun WSManCreateShellEx(session: WSMAN_SESSION_HANDLE, flags: UInt, resourceuri: PCWSTR, shellid: PCWSTR, startupinfo: Long, options: Long, createxml: Long, async: Long, shell: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssys_windows_win32_system_remotemanagement_WSManCreateShellEx(session, flags, resourceuri.toCPointer<ByteVar>(), shellid.toCPointer<ByteVar>(), startupinfo.toCPointer<ByteVar>(), options.toCPointer<ByteVar>(), createxml.toCPointer<ByteVar>(), async.toCPointer<ByteVar>(), shell.toCPointer<ByteVar>())
}

public actual fun WSManDeinitialize(apihandle: WSMAN_API_HANDLE, flags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssys_windows_win32_system_remotemanagement_WSManDeinitialize(apihandle, flags)

public actual fun WSManDisconnectShell(shell: WSMAN_SHELL_HANDLE, flags: UInt, disconnectinfo: Long, async: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssys_windows_win32_system_remotemanagement_WSManDisconnectShell(shell, flags, disconnectinfo.toCPointer<ByteVar>(), async.toCPointer<ByteVar>())
}

public actual fun WSManGetErrorMessage(apihandle: WSMAN_API_HANDLE, flags: UInt, languagecode: PCWSTR, errorcode: UInt, messagelength: UInt, message: PWSTR, messagelengthused: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssys_windows_win32_system_remotemanagement_WSManGetErrorMessage(apihandle, flags, languagecode.toCPointer<ByteVar>(), errorcode, messagelength, message.toCPointer<ByteVar>(), messagelengthused.toCPointer<ByteVar>())

public actual fun WSManGetSessionOptionAsDword(session: WSMAN_SESSION_HANDLE, option: WSManSessionOption, value: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssys_windows_win32_system_remotemanagement_WSManGetSessionOptionAsDword(session, option, value.toCPointer<ByteVar>())

public actual fun WSManGetSessionOptionAsString(session: WSMAN_SESSION_HANDLE, option: WSManSessionOption, stringlength: UInt, string: PWSTR, stringlengthused: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssys_windows_win32_system_remotemanagement_WSManGetSessionOptionAsString(session, option, stringlength, string.toCPointer<ByteVar>(), stringlengthused.toCPointer<ByteVar>())

public actual fun WSManInitialize(flags: UInt, apihandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssys_windows_win32_system_remotemanagement_WSManInitialize(flags, apihandle.toCPointer<ByteVar>())

public actual fun WSManPluginAuthzOperationComplete(senderdetails: Long, flags: UInt, userauthorizationcontext: Long, errorcode: UInt, extendederrorinformation: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssys_windows_win32_system_remotemanagement_WSManPluginAuthzOperationComplete(senderdetails.toCPointer<ByteVar>(), flags, userauthorizationcontext.toCPointer<ByteVar>(), errorcode, extendederrorinformation.toCPointer<ByteVar>())

public actual fun WSManPluginAuthzQueryQuotaComplete(senderdetails: Long, flags: UInt, quota: Long, errorcode: UInt, extendederrorinformation: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssys_windows_win32_system_remotemanagement_WSManPluginAuthzQueryQuotaComplete(senderdetails.toCPointer<ByteVar>(), flags, quota.toCPointer<ByteVar>(), errorcode, extendederrorinformation.toCPointer<ByteVar>())

public actual fun WSManPluginAuthzUserComplete(senderdetails: Long, flags: UInt, userauthorizationcontext: Long, impersonationtoken: HANDLE, userisadministrator: BOOL, errorcode: UInt, extendederrorinformation: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssys_windows_win32_system_remotemanagement_WSManPluginAuthzUserComplete(senderdetails.toCPointer<ByteVar>(), flags, userauthorizationcontext.toCPointer<ByteVar>(), impersonationtoken.toCPointer<ByteVar>(), userisadministrator, errorcode, extendederrorinformation.toCPointer<ByteVar>())

public actual fun WSManPluginFreeRequestDetails(requestdetails: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssys_windows_win32_system_remotemanagement_WSManPluginFreeRequestDetails(requestdetails.toCPointer<ByteVar>())

public actual fun WSManPluginGetConfiguration(plugincontext: Long, flags: UInt, data: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssys_windows_win32_system_remotemanagement_WSManPluginGetConfiguration(plugincontext.toCPointer<ByteVar>(), flags, data.toCPointer<ByteVar>())

public actual fun WSManPluginGetOperationParameters(requestdetails: Long, flags: UInt, data: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssys_windows_win32_system_remotemanagement_WSManPluginGetOperationParameters(requestdetails.toCPointer<ByteVar>(), flags, data.toCPointer<ByteVar>())

public actual fun WSManPluginOperationComplete(requestdetails: Long, flags: UInt, errorcode: UInt, extendedinformation: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssys_windows_win32_system_remotemanagement_WSManPluginOperationComplete(requestdetails.toCPointer<ByteVar>(), flags, errorcode, extendedinformation.toCPointer<ByteVar>())

public actual fun WSManPluginReceiveResult(requestdetails: Long, flags: UInt, stream: PCWSTR, streamresult: Long, commandstate: PCWSTR, exitcode: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssys_windows_win32_system_remotemanagement_WSManPluginReceiveResult(requestdetails.toCPointer<ByteVar>(), flags, stream.toCPointer<ByteVar>(), streamresult.toCPointer<ByteVar>(), commandstate.toCPointer<ByteVar>(), exitcode)

public actual fun WSManPluginReportCompletion(plugincontext: Long, flags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssys_windows_win32_system_remotemanagement_WSManPluginReportCompletion(plugincontext.toCPointer<ByteVar>(), flags)

public actual fun WSManPluginReportContext(requestdetails: Long, flags: UInt, context: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssys_windows_win32_system_remotemanagement_WSManPluginReportContext(requestdetails.toCPointer<ByteVar>(), flags, context.toCPointer<ByteVar>())

public actual fun WSManReceiveShellOutput(shell: WSMAN_SHELL_HANDLE, command: WSMAN_COMMAND_HANDLE, flags: UInt, desiredstreamset: Long, async: Long, receiveoperation: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssys_windows_win32_system_remotemanagement_WSManReceiveShellOutput(shell, command, flags, desiredstreamset.toCPointer<ByteVar>(), async.toCPointer<ByteVar>(), receiveoperation.toCPointer<ByteVar>())
}

public actual fun WSManReconnectShell(shell: WSMAN_SHELL_HANDLE, flags: UInt, async: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssys_windows_win32_system_remotemanagement_WSManReconnectShell(shell, flags, async.toCPointer<ByteVar>())
}

public actual fun WSManReconnectShellCommand(commandhandle: WSMAN_COMMAND_HANDLE, flags: UInt, async: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssys_windows_win32_system_remotemanagement_WSManReconnectShellCommand(commandhandle, flags, async.toCPointer<ByteVar>())
}

public actual fun WSManRunShellCommand(shell: WSMAN_SHELL_HANDLE, flags: UInt, commandline: PCWSTR, args: Long, options: Long, async: Long, command: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssys_windows_win32_system_remotemanagement_WSManRunShellCommand(shell, flags, commandline.toCPointer<ByteVar>(), args.toCPointer<ByteVar>(), options.toCPointer<ByteVar>(), async.toCPointer<ByteVar>(), command.toCPointer<ByteVar>())
}

public actual fun WSManRunShellCommandEx(shell: WSMAN_SHELL_HANDLE, flags: UInt, commandid: PCWSTR, commandline: PCWSTR, args: Long, options: Long, async: Long, command: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssys_windows_win32_system_remotemanagement_WSManRunShellCommandEx(shell, flags, commandid.toCPointer<ByteVar>(), commandline.toCPointer<ByteVar>(), args.toCPointer<ByteVar>(), options.toCPointer<ByteVar>(), async.toCPointer<ByteVar>(), command.toCPointer<ByteVar>())
}

public actual fun WSManSendShellInput(shell: WSMAN_SHELL_HANDLE, command: WSMAN_COMMAND_HANDLE, flags: UInt, streamid: PCWSTR, streamdata: Long, endofstream: BOOL, async: Long, sendoperation: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssys_windows_win32_system_remotemanagement_WSManSendShellInput(shell, command, flags, streamid.toCPointer<ByteVar>(), streamdata.toCPointer<ByteVar>(), endofstream, async.toCPointer<ByteVar>(), sendoperation.toCPointer<ByteVar>())
}

public actual fun WSManSetSessionOption(session: WSMAN_SESSION_HANDLE, option: WSManSessionOption, data: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssys_windows_win32_system_remotemanagement_WSManSetSessionOption(session, option, data.toCPointer<ByteVar>())

public actual fun WSManSignalShell(shell: WSMAN_SHELL_HANDLE, command: WSMAN_COMMAND_HANDLE, flags: UInt, code: PCWSTR, async: Long, signaloperation: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement.cinterop.windowssys_windows_win32_system_remotemanagement_WSManSignalShell(shell, command, flags, code.toCPointer<ByteVar>(), async.toCPointer<ByteVar>(), signaloperation.toCPointer<ByteVar>())
}
