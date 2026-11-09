@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

private val _windowsWin32SystemRemotemanagementNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun WSManCloseCommand(commandhandle: WSMAN_COMMAND_HANDLE, flags: UInt, async: Long) {
    if (_windowsWin32SystemRemotemanagementNapiAddon != null) {
        _windowsWin32SystemRemotemanagementNapiAddon.windowssys_windows_win32_system_remotemanagement_WSManCloseCommand(commandhandle.toString(), flags.toInt(), async.toString())
    }
}

public actual fun WSManCloseOperation(operationhandle: WSMAN_OPERATION_HANDLE, flags: UInt): UInt =
    if (_windowsWin32SystemRemotemanagementNapiAddon != null) (_windowsWin32SystemRemotemanagementNapiAddon.windowssys_windows_win32_system_remotemanagement_WSManCloseOperation(operationhandle.toString(), flags.toInt()) as Int).toUInt() else 0u

public actual fun WSManCloseSession(session: WSMAN_SESSION_HANDLE, flags: UInt): UInt =
    if (_windowsWin32SystemRemotemanagementNapiAddon != null) (_windowsWin32SystemRemotemanagementNapiAddon.windowssys_windows_win32_system_remotemanagement_WSManCloseSession(session.toString(), flags.toInt()) as Int).toUInt() else 0u

public actual fun WSManCloseShell(shellhandle: WSMAN_SHELL_HANDLE, flags: UInt, async: Long) {
    if (_windowsWin32SystemRemotemanagementNapiAddon != null) {
        _windowsWin32SystemRemotemanagementNapiAddon.windowssys_windows_win32_system_remotemanagement_WSManCloseShell(shellhandle.toString(), flags.toInt(), async.toString())
    }
}

public actual fun WSManConnectShell(session: WSMAN_SESSION_HANDLE, flags: UInt, resourceuri: PCWSTR, shellid: PCWSTR, options: Long, connectxml: Long, async: Long, shell: Long) {
    if (_windowsWin32SystemRemotemanagementNapiAddon != null) {
        _windowsWin32SystemRemotemanagementNapiAddon.windowssys_windows_win32_system_remotemanagement_WSManConnectShell(session.toString(), flags.toInt(), resourceuri.toString(), shellid.toString(), options.toString(), connectxml.toString(), async.toString(), shell.toString())
    }
}

public actual fun WSManConnectShellCommand(shell: WSMAN_SHELL_HANDLE, flags: UInt, commandid: PCWSTR, options: Long, connectxml: Long, async: Long, command: Long) {
    if (_windowsWin32SystemRemotemanagementNapiAddon != null) {
        _windowsWin32SystemRemotemanagementNapiAddon.windowssys_windows_win32_system_remotemanagement_WSManConnectShellCommand(shell.toString(), flags.toInt(), commandid.toString(), options.toString(), connectxml.toString(), async.toString(), command.toString())
    }
}

public actual fun WSManCreateSession(apihandle: WSMAN_API_HANDLE, connection: PCWSTR, flags: UInt, serverauthenticationcredentials: Long, proxyinfo: Long, session: Long): UInt =
    if (_windowsWin32SystemRemotemanagementNapiAddon != null) (_windowsWin32SystemRemotemanagementNapiAddon.windowssys_windows_win32_system_remotemanagement_WSManCreateSession(apihandle.toString(), connection.toString(), flags.toInt(), serverauthenticationcredentials.toString(), proxyinfo.toString(), session.toString()) as Int).toUInt() else 0u

public actual fun WSManCreateShell(session: WSMAN_SESSION_HANDLE, flags: UInt, resourceuri: PCWSTR, startupinfo: Long, options: Long, createxml: Long, async: Long, shell: Long) {
    if (_windowsWin32SystemRemotemanagementNapiAddon != null) {
        _windowsWin32SystemRemotemanagementNapiAddon.windowssys_windows_win32_system_remotemanagement_WSManCreateShell(session.toString(), flags.toInt(), resourceuri.toString(), startupinfo.toString(), options.toString(), createxml.toString(), async.toString(), shell.toString())
    }
}

public actual fun WSManCreateShellEx(session: WSMAN_SESSION_HANDLE, flags: UInt, resourceuri: PCWSTR, shellid: PCWSTR, startupinfo: Long, options: Long, createxml: Long, async: Long, shell: Long) {
    if (_windowsWin32SystemRemotemanagementNapiAddon != null) {
        _windowsWin32SystemRemotemanagementNapiAddon.windowssys_windows_win32_system_remotemanagement_WSManCreateShellEx(session.toString(), flags.toInt(), resourceuri.toString(), shellid.toString(), startupinfo.toString(), options.toString(), createxml.toString(), async.toString(), shell.toString())
    }
}

public actual fun WSManDeinitialize(apihandle: WSMAN_API_HANDLE, flags: UInt): UInt =
    if (_windowsWin32SystemRemotemanagementNapiAddon != null) (_windowsWin32SystemRemotemanagementNapiAddon.windowssys_windows_win32_system_remotemanagement_WSManDeinitialize(apihandle.toString(), flags.toInt()) as Int).toUInt() else 0u

public actual fun WSManDisconnectShell(shell: WSMAN_SHELL_HANDLE, flags: UInt, disconnectinfo: Long, async: Long) {
    if (_windowsWin32SystemRemotemanagementNapiAddon != null) {
        _windowsWin32SystemRemotemanagementNapiAddon.windowssys_windows_win32_system_remotemanagement_WSManDisconnectShell(shell.toString(), flags.toInt(), disconnectinfo.toString(), async.toString())
    }
}

public actual fun WSManGetErrorMessage(apihandle: WSMAN_API_HANDLE, flags: UInt, languagecode: PCWSTR, errorcode: UInt, messagelength: UInt, message: PWSTR, messagelengthused: Long): UInt =
    if (_windowsWin32SystemRemotemanagementNapiAddon != null) (_windowsWin32SystemRemotemanagementNapiAddon.windowssys_windows_win32_system_remotemanagement_WSManGetErrorMessage(apihandle.toString(), flags.toInt(), languagecode.toString(), errorcode.toInt(), messagelength.toInt(), message.toString(), messagelengthused.toString()) as Int).toUInt() else 0u

public actual fun WSManGetSessionOptionAsDword(session: WSMAN_SESSION_HANDLE, option: WSManSessionOption, value: Long): UInt =
    if (_windowsWin32SystemRemotemanagementNapiAddon != null) (_windowsWin32SystemRemotemanagementNapiAddon.windowssys_windows_win32_system_remotemanagement_WSManGetSessionOptionAsDword(session.toString(), option, value.toString()) as Int).toUInt() else 0u

public actual fun WSManGetSessionOptionAsString(session: WSMAN_SESSION_HANDLE, option: WSManSessionOption, stringlength: UInt, string: PWSTR, stringlengthused: Long): UInt =
    if (_windowsWin32SystemRemotemanagementNapiAddon != null) (_windowsWin32SystemRemotemanagementNapiAddon.windowssys_windows_win32_system_remotemanagement_WSManGetSessionOptionAsString(session.toString(), option, stringlength.toInt(), string.toString(), stringlengthused.toString()) as Int).toUInt() else 0u

public actual fun WSManInitialize(flags: UInt, apihandle: Long): UInt =
    if (_windowsWin32SystemRemotemanagementNapiAddon != null) (_windowsWin32SystemRemotemanagementNapiAddon.windowssys_windows_win32_system_remotemanagement_WSManInitialize(flags.toInt(), apihandle.toString()) as Int).toUInt() else 0u

public actual fun WSManPluginAuthzOperationComplete(senderdetails: Long, flags: UInt, userauthorizationcontext: Long, errorcode: UInt, extendederrorinformation: PCWSTR): UInt =
    if (_windowsWin32SystemRemotemanagementNapiAddon != null) (_windowsWin32SystemRemotemanagementNapiAddon.windowssys_windows_win32_system_remotemanagement_WSManPluginAuthzOperationComplete(senderdetails.toString(), flags.toInt(), userauthorizationcontext.toString(), errorcode.toInt(), extendederrorinformation.toString()) as Int).toUInt() else 0u

public actual fun WSManPluginAuthzQueryQuotaComplete(senderdetails: Long, flags: UInt, quota: Long, errorcode: UInt, extendederrorinformation: PCWSTR): UInt =
    if (_windowsWin32SystemRemotemanagementNapiAddon != null) (_windowsWin32SystemRemotemanagementNapiAddon.windowssys_windows_win32_system_remotemanagement_WSManPluginAuthzQueryQuotaComplete(senderdetails.toString(), flags.toInt(), quota.toString(), errorcode.toInt(), extendederrorinformation.toString()) as Int).toUInt() else 0u

public actual fun WSManPluginAuthzUserComplete(senderdetails: Long, flags: UInt, userauthorizationcontext: Long, impersonationtoken: HANDLE, userisadministrator: BOOL, errorcode: UInt, extendederrorinformation: PCWSTR): UInt =
    if (_windowsWin32SystemRemotemanagementNapiAddon != null) (_windowsWin32SystemRemotemanagementNapiAddon.windowssys_windows_win32_system_remotemanagement_WSManPluginAuthzUserComplete(senderdetails.toString(), flags.toInt(), userauthorizationcontext.toString(), impersonationtoken.toString(), userisadministrator, errorcode.toInt(), extendederrorinformation.toString()) as Int).toUInt() else 0u

public actual fun WSManPluginFreeRequestDetails(requestdetails: Long): UInt =
    if (_windowsWin32SystemRemotemanagementNapiAddon != null) (_windowsWin32SystemRemotemanagementNapiAddon.windowssys_windows_win32_system_remotemanagement_WSManPluginFreeRequestDetails(requestdetails.toString()) as Int).toUInt() else 0u

public actual fun WSManPluginGetConfiguration(plugincontext: Long, flags: UInt, data: Long): UInt =
    if (_windowsWin32SystemRemotemanagementNapiAddon != null) (_windowsWin32SystemRemotemanagementNapiAddon.windowssys_windows_win32_system_remotemanagement_WSManPluginGetConfiguration(plugincontext.toString(), flags.toInt(), data.toString()) as Int).toUInt() else 0u

public actual fun WSManPluginGetOperationParameters(requestdetails: Long, flags: UInt, data: Long): UInt =
    if (_windowsWin32SystemRemotemanagementNapiAddon != null) (_windowsWin32SystemRemotemanagementNapiAddon.windowssys_windows_win32_system_remotemanagement_WSManPluginGetOperationParameters(requestdetails.toString(), flags.toInt(), data.toString()) as Int).toUInt() else 0u

public actual fun WSManPluginOperationComplete(requestdetails: Long, flags: UInt, errorcode: UInt, extendedinformation: PCWSTR): UInt =
    if (_windowsWin32SystemRemotemanagementNapiAddon != null) (_windowsWin32SystemRemotemanagementNapiAddon.windowssys_windows_win32_system_remotemanagement_WSManPluginOperationComplete(requestdetails.toString(), flags.toInt(), errorcode.toInt(), extendedinformation.toString()) as Int).toUInt() else 0u

public actual fun WSManPluginReceiveResult(requestdetails: Long, flags: UInt, stream: PCWSTR, streamresult: Long, commandstate: PCWSTR, exitcode: UInt): UInt =
    if (_windowsWin32SystemRemotemanagementNapiAddon != null) (_windowsWin32SystemRemotemanagementNapiAddon.windowssys_windows_win32_system_remotemanagement_WSManPluginReceiveResult(requestdetails.toString(), flags.toInt(), stream.toString(), streamresult.toString(), commandstate.toString(), exitcode.toInt()) as Int).toUInt() else 0u

public actual fun WSManPluginReportCompletion(plugincontext: Long, flags: UInt): UInt =
    if (_windowsWin32SystemRemotemanagementNapiAddon != null) (_windowsWin32SystemRemotemanagementNapiAddon.windowssys_windows_win32_system_remotemanagement_WSManPluginReportCompletion(plugincontext.toString(), flags.toInt()) as Int).toUInt() else 0u

public actual fun WSManPluginReportContext(requestdetails: Long, flags: UInt, context: Long): UInt =
    if (_windowsWin32SystemRemotemanagementNapiAddon != null) (_windowsWin32SystemRemotemanagementNapiAddon.windowssys_windows_win32_system_remotemanagement_WSManPluginReportContext(requestdetails.toString(), flags.toInt(), context.toString()) as Int).toUInt() else 0u

public actual fun WSManReceiveShellOutput(shell: WSMAN_SHELL_HANDLE, command: WSMAN_COMMAND_HANDLE, flags: UInt, desiredstreamset: Long, async: Long, receiveoperation: Long) {
    if (_windowsWin32SystemRemotemanagementNapiAddon != null) {
        _windowsWin32SystemRemotemanagementNapiAddon.windowssys_windows_win32_system_remotemanagement_WSManReceiveShellOutput(shell.toString(), command.toString(), flags.toInt(), desiredstreamset.toString(), async.toString(), receiveoperation.toString())
    }
}

public actual fun WSManReconnectShell(shell: WSMAN_SHELL_HANDLE, flags: UInt, async: Long) {
    if (_windowsWin32SystemRemotemanagementNapiAddon != null) {
        _windowsWin32SystemRemotemanagementNapiAddon.windowssys_windows_win32_system_remotemanagement_WSManReconnectShell(shell.toString(), flags.toInt(), async.toString())
    }
}

public actual fun WSManReconnectShellCommand(commandhandle: WSMAN_COMMAND_HANDLE, flags: UInt, async: Long) {
    if (_windowsWin32SystemRemotemanagementNapiAddon != null) {
        _windowsWin32SystemRemotemanagementNapiAddon.windowssys_windows_win32_system_remotemanagement_WSManReconnectShellCommand(commandhandle.toString(), flags.toInt(), async.toString())
    }
}

public actual fun WSManRunShellCommand(shell: WSMAN_SHELL_HANDLE, flags: UInt, commandline: PCWSTR, args: Long, options: Long, async: Long, command: Long) {
    if (_windowsWin32SystemRemotemanagementNapiAddon != null) {
        _windowsWin32SystemRemotemanagementNapiAddon.windowssys_windows_win32_system_remotemanagement_WSManRunShellCommand(shell.toString(), flags.toInt(), commandline.toString(), args.toString(), options.toString(), async.toString(), command.toString())
    }
}

public actual fun WSManRunShellCommandEx(shell: WSMAN_SHELL_HANDLE, flags: UInt, commandid: PCWSTR, commandline: PCWSTR, args: Long, options: Long, async: Long, command: Long) {
    if (_windowsWin32SystemRemotemanagementNapiAddon != null) {
        _windowsWin32SystemRemotemanagementNapiAddon.windowssys_windows_win32_system_remotemanagement_WSManRunShellCommandEx(shell.toString(), flags.toInt(), commandid.toString(), commandline.toString(), args.toString(), options.toString(), async.toString(), command.toString())
    }
}

public actual fun WSManSendShellInput(shell: WSMAN_SHELL_HANDLE, command: WSMAN_COMMAND_HANDLE, flags: UInt, streamid: PCWSTR, streamdata: Long, endofstream: BOOL, async: Long, sendoperation: Long) {
    if (_windowsWin32SystemRemotemanagementNapiAddon != null) {
        _windowsWin32SystemRemotemanagementNapiAddon.windowssys_windows_win32_system_remotemanagement_WSManSendShellInput(shell.toString(), command.toString(), flags.toInt(), streamid.toString(), streamdata.toString(), endofstream, async.toString(), sendoperation.toString())
    }
}

public actual fun WSManSetSessionOption(session: WSMAN_SESSION_HANDLE, option: WSManSessionOption, data: Long): UInt =
    if (_windowsWin32SystemRemotemanagementNapiAddon != null) (_windowsWin32SystemRemotemanagementNapiAddon.windowssys_windows_win32_system_remotemanagement_WSManSetSessionOption(session.toString(), option, data.toString()) as Int).toUInt() else 0u

public actual fun WSManSignalShell(shell: WSMAN_SHELL_HANDLE, command: WSMAN_COMMAND_HANDLE, flags: UInt, code: PCWSTR, async: Long, signaloperation: Long) {
    if (_windowsWin32SystemRemotemanagementNapiAddon != null) {
        _windowsWin32SystemRemotemanagementNapiAddon.windowssys_windows_win32_system_remotemanagement_WSManSignalShell(shell.toString(), command.toString(), flags.toInt(), code.toString(), async.toString(), signaloperation.toString())
    }
}
