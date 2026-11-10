@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private val _windowsWin32SystemRemotemanagementNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun wSManCloseCommand(commandhandle: WsmanCommandHandle, flags: UInt, async: COpaquePointer?) {
    if (_windowsWin32SystemRemotemanagementNapiAddon != null) {
        _windowsWin32SystemRemotemanagementNapiAddon.windowssys_windows_win32_system_remotemanagement_wSManCloseCommand(commandhandle.toString(), flags.toInt(), (async?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wSManCloseOperation(operationhandle: WsmanOperationHandle, flags: UInt): UInt =
    if (_windowsWin32SystemRemotemanagementNapiAddon != null) (_windowsWin32SystemRemotemanagementNapiAddon.windowssys_windows_win32_system_remotemanagement_wSManCloseOperation(operationhandle.toString(), flags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManCloseSession(session: WsmanSessionHandle, flags: UInt): UInt =
    if (_windowsWin32SystemRemotemanagementNapiAddon != null) (_windowsWin32SystemRemotemanagementNapiAddon.windowssys_windows_win32_system_remotemanagement_wSManCloseSession(session.toString(), flags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManCloseShell(shellhandle: WsmanShellHandle, flags: UInt, async: COpaquePointer?) {
    if (_windowsWin32SystemRemotemanagementNapiAddon != null) {
        _windowsWin32SystemRemotemanagementNapiAddon.windowssys_windows_win32_system_remotemanagement_wSManCloseShell(shellhandle.toString(), flags.toInt(), (async?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wSManConnectShell(session: WsmanSessionHandle, flags: UInt, resourceuri: Pcwstr, shellid: Pcwstr, options: COpaquePointer?, connectxml: COpaquePointer?, async: COpaquePointer?, shell: COpaquePointer?) {
    if (_windowsWin32SystemRemotemanagementNapiAddon != null) {
        _windowsWin32SystemRemotemanagementNapiAddon.windowssys_windows_win32_system_remotemanagement_wSManConnectShell(session.toString(), flags.toInt(), (resourceuri?.value ?: 0L).toString(), (shellid?.value ?: 0L).toString(), (options?.value ?: 0L).toString(), (connectxml?.value ?: 0L).toString(), (async?.value ?: 0L).toString(), (shell?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wSManConnectShellCommand(shell: WsmanShellHandle, flags: UInt, commandid: Pcwstr, options: COpaquePointer?, connectxml: COpaquePointer?, async: COpaquePointer?, command: COpaquePointer?) {
    if (_windowsWin32SystemRemotemanagementNapiAddon != null) {
        _windowsWin32SystemRemotemanagementNapiAddon.windowssys_windows_win32_system_remotemanagement_wSManConnectShellCommand(shell.toString(), flags.toInt(), (commandid?.value ?: 0L).toString(), (options?.value ?: 0L).toString(), (connectxml?.value ?: 0L).toString(), (async?.value ?: 0L).toString(), (command?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wSManCreateSession(apihandle: WsmanApiHandle, connection: Pcwstr, flags: UInt, serverauthenticationcredentials: COpaquePointer?, proxyinfo: COpaquePointer?, session: COpaquePointer?): UInt =
    if (_windowsWin32SystemRemotemanagementNapiAddon != null) (_windowsWin32SystemRemotemanagementNapiAddon.windowssys_windows_win32_system_remotemanagement_wSManCreateSession(apihandle.toString(), (connection?.value ?: 0L).toString(), flags.toInt(), (serverauthenticationcredentials?.value ?: 0L).toString(), (proxyinfo?.value ?: 0L).toString(), (session?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManCreateShell(session: WsmanSessionHandle, flags: UInt, resourceuri: Pcwstr, startupinfo: COpaquePointer?, options: COpaquePointer?, createxml: COpaquePointer?, async: COpaquePointer?, shell: COpaquePointer?) {
    if (_windowsWin32SystemRemotemanagementNapiAddon != null) {
        _windowsWin32SystemRemotemanagementNapiAddon.windowssys_windows_win32_system_remotemanagement_wSManCreateShell(session.toString(), flags.toInt(), (resourceuri?.value ?: 0L).toString(), (startupinfo?.value ?: 0L).toString(), (options?.value ?: 0L).toString(), (createxml?.value ?: 0L).toString(), (async?.value ?: 0L).toString(), (shell?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wSManCreateShellEx(session: WsmanSessionHandle, flags: UInt, resourceuri: Pcwstr, shellid: Pcwstr, startupinfo: COpaquePointer?, options: COpaquePointer?, createxml: COpaquePointer?, async: COpaquePointer?, shell: COpaquePointer?) {
    if (_windowsWin32SystemRemotemanagementNapiAddon != null) {
        _windowsWin32SystemRemotemanagementNapiAddon.windowssys_windows_win32_system_remotemanagement_wSManCreateShellEx(session.toString(), flags.toInt(), (resourceuri?.value ?: 0L).toString(), (shellid?.value ?: 0L).toString(), (startupinfo?.value ?: 0L).toString(), (options?.value ?: 0L).toString(), (createxml?.value ?: 0L).toString(), (async?.value ?: 0L).toString(), (shell?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wSManDeinitialize(apihandle: WsmanApiHandle, flags: UInt): UInt =
    if (_windowsWin32SystemRemotemanagementNapiAddon != null) (_windowsWin32SystemRemotemanagementNapiAddon.windowssys_windows_win32_system_remotemanagement_wSManDeinitialize(apihandle.toString(), flags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManDisconnectShell(shell: WsmanShellHandle, flags: UInt, disconnectinfo: COpaquePointer?, async: COpaquePointer?) {
    if (_windowsWin32SystemRemotemanagementNapiAddon != null) {
        _windowsWin32SystemRemotemanagementNapiAddon.windowssys_windows_win32_system_remotemanagement_wSManDisconnectShell(shell.toString(), flags.toInt(), (disconnectinfo?.value ?: 0L).toString(), (async?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wSManGetErrorMessage(apihandle: WsmanApiHandle, flags: UInt, languagecode: Pcwstr, errorcode: UInt, messagelength: UInt, message: Pwstr, messagelengthused: COpaquePointer?): UInt =
    if (_windowsWin32SystemRemotemanagementNapiAddon != null) (_windowsWin32SystemRemotemanagementNapiAddon.windowssys_windows_win32_system_remotemanagement_wSManGetErrorMessage(apihandle.toString(), flags.toInt(), (languagecode?.value ?: 0L).toString(), errorcode.toInt(), messagelength.toInt(), (message?.value ?: 0L).toString(), (messagelengthused?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManGetSessionOptionAsDword(session: WsmanSessionHandle, option: WSManSessionOption, value: COpaquePointer?): UInt =
    if (_windowsWin32SystemRemotemanagementNapiAddon != null) (_windowsWin32SystemRemotemanagementNapiAddon.windowssys_windows_win32_system_remotemanagement_wSManGetSessionOptionAsDword(session.toString(), option, (value?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManGetSessionOptionAsString(session: WsmanSessionHandle, option: WSManSessionOption, stringlength: UInt, string: Pwstr, stringlengthused: COpaquePointer?): UInt =
    if (_windowsWin32SystemRemotemanagementNapiAddon != null) (_windowsWin32SystemRemotemanagementNapiAddon.windowssys_windows_win32_system_remotemanagement_wSManGetSessionOptionAsString(session.toString(), option, stringlength.toInt(), (string?.value ?: 0L).toString(), (stringlengthused?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManInitialize(flags: UInt, apihandle: COpaquePointer?): UInt =
    if (_windowsWin32SystemRemotemanagementNapiAddon != null) (_windowsWin32SystemRemotemanagementNapiAddon.windowssys_windows_win32_system_remotemanagement_wSManInitialize(flags.toInt(), (apihandle?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManPluginAuthzOperationComplete(senderdetails: COpaquePointer?, flags: UInt, userauthorizationcontext: COpaquePointer?, errorcode: UInt, extendederrorinformation: Pcwstr): UInt =
    if (_windowsWin32SystemRemotemanagementNapiAddon != null) (_windowsWin32SystemRemotemanagementNapiAddon.windowssys_windows_win32_system_remotemanagement_wSManPluginAuthzOperationComplete((senderdetails?.value ?: 0L).toString(), flags.toInt(), (userauthorizationcontext?.value ?: 0L).toString(), errorcode.toInt(), (extendederrorinformation?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManPluginAuthzQueryQuotaComplete(senderdetails: COpaquePointer?, flags: UInt, quota: COpaquePointer?, errorcode: UInt, extendederrorinformation: Pcwstr): UInt =
    if (_windowsWin32SystemRemotemanagementNapiAddon != null) (_windowsWin32SystemRemotemanagementNapiAddon.windowssys_windows_win32_system_remotemanagement_wSManPluginAuthzQueryQuotaComplete((senderdetails?.value ?: 0L).toString(), flags.toInt(), (quota?.value ?: 0L).toString(), errorcode.toInt(), (extendederrorinformation?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManPluginAuthzUserComplete(senderdetails: COpaquePointer?, flags: UInt, userauthorizationcontext: COpaquePointer?, impersonationtoken: Handle, userisadministrator: Bool, errorcode: UInt, extendederrorinformation: Pcwstr): UInt =
    if (_windowsWin32SystemRemotemanagementNapiAddon != null) (_windowsWin32SystemRemotemanagementNapiAddon.windowssys_windows_win32_system_remotemanagement_wSManPluginAuthzUserComplete((senderdetails?.value ?: 0L).toString(), flags.toInt(), (userauthorizationcontext?.value ?: 0L).toString(), (impersonationtoken?.value ?: 0L).toString(), userisadministrator, errorcode.toInt(), (extendederrorinformation?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManPluginFreeRequestDetails(requestdetails: COpaquePointer?): UInt =
    if (_windowsWin32SystemRemotemanagementNapiAddon != null) (_windowsWin32SystemRemotemanagementNapiAddon.windowssys_windows_win32_system_remotemanagement_wSManPluginFreeRequestDetails((requestdetails?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManPluginGetConfiguration(plugincontext: COpaquePointer?, flags: UInt, data: COpaquePointer?): UInt =
    if (_windowsWin32SystemRemotemanagementNapiAddon != null) (_windowsWin32SystemRemotemanagementNapiAddon.windowssys_windows_win32_system_remotemanagement_wSManPluginGetConfiguration((plugincontext?.value ?: 0L).toString(), flags.toInt(), (data?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManPluginGetOperationParameters(requestdetails: COpaquePointer?, flags: UInt, data: COpaquePointer?): UInt =
    if (_windowsWin32SystemRemotemanagementNapiAddon != null) (_windowsWin32SystemRemotemanagementNapiAddon.windowssys_windows_win32_system_remotemanagement_wSManPluginGetOperationParameters((requestdetails?.value ?: 0L).toString(), flags.toInt(), (data?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManPluginOperationComplete(requestdetails: COpaquePointer?, flags: UInt, errorcode: UInt, extendedinformation: Pcwstr): UInt =
    if (_windowsWin32SystemRemotemanagementNapiAddon != null) (_windowsWin32SystemRemotemanagementNapiAddon.windowssys_windows_win32_system_remotemanagement_wSManPluginOperationComplete((requestdetails?.value ?: 0L).toString(), flags.toInt(), errorcode.toInt(), (extendedinformation?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManPluginReceiveResult(requestdetails: COpaquePointer?, flags: UInt, stream: Pcwstr, streamresult: COpaquePointer?, commandstate: Pcwstr, exitcode: UInt): UInt =
    if (_windowsWin32SystemRemotemanagementNapiAddon != null) (_windowsWin32SystemRemotemanagementNapiAddon.windowssys_windows_win32_system_remotemanagement_wSManPluginReceiveResult((requestdetails?.value ?: 0L).toString(), flags.toInt(), (stream?.value ?: 0L).toString(), (streamresult?.value ?: 0L).toString(), (commandstate?.value ?: 0L).toString(), exitcode.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManPluginReportCompletion(plugincontext: COpaquePointer?, flags: UInt): UInt =
    if (_windowsWin32SystemRemotemanagementNapiAddon != null) (_windowsWin32SystemRemotemanagementNapiAddon.windowssys_windows_win32_system_remotemanagement_wSManPluginReportCompletion((plugincontext?.value ?: 0L).toString(), flags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManPluginReportContext(requestdetails: COpaquePointer?, flags: UInt, context: COpaquePointer?): UInt =
    if (_windowsWin32SystemRemotemanagementNapiAddon != null) (_windowsWin32SystemRemotemanagementNapiAddon.windowssys_windows_win32_system_remotemanagement_wSManPluginReportContext((requestdetails?.value ?: 0L).toString(), flags.toInt(), (context?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManReceiveShellOutput(shell: WsmanShellHandle, command: WsmanCommandHandle, flags: UInt, desiredstreamset: COpaquePointer?, async: COpaquePointer?, receiveoperation: COpaquePointer?) {
    if (_windowsWin32SystemRemotemanagementNapiAddon != null) {
        _windowsWin32SystemRemotemanagementNapiAddon.windowssys_windows_win32_system_remotemanagement_wSManReceiveShellOutput(shell.toString(), command.toString(), flags.toInt(), (desiredstreamset?.value ?: 0L).toString(), (async?.value ?: 0L).toString(), (receiveoperation?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wSManReconnectShell(shell: WsmanShellHandle, flags: UInt, async: COpaquePointer?) {
    if (_windowsWin32SystemRemotemanagementNapiAddon != null) {
        _windowsWin32SystemRemotemanagementNapiAddon.windowssys_windows_win32_system_remotemanagement_wSManReconnectShell(shell.toString(), flags.toInt(), (async?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wSManReconnectShellCommand(commandhandle: WsmanCommandHandle, flags: UInt, async: COpaquePointer?) {
    if (_windowsWin32SystemRemotemanagementNapiAddon != null) {
        _windowsWin32SystemRemotemanagementNapiAddon.windowssys_windows_win32_system_remotemanagement_wSManReconnectShellCommand(commandhandle.toString(), flags.toInt(), (async?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wSManRunShellCommand(shell: WsmanShellHandle, flags: UInt, commandline: Pcwstr, args: COpaquePointer?, options: COpaquePointer?, async: COpaquePointer?, command: COpaquePointer?) {
    if (_windowsWin32SystemRemotemanagementNapiAddon != null) {
        _windowsWin32SystemRemotemanagementNapiAddon.windowssys_windows_win32_system_remotemanagement_wSManRunShellCommand(shell.toString(), flags.toInt(), (commandline?.value ?: 0L).toString(), (args?.value ?: 0L).toString(), (options?.value ?: 0L).toString(), (async?.value ?: 0L).toString(), (command?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wSManRunShellCommandEx(shell: WsmanShellHandle, flags: UInt, commandid: Pcwstr, commandline: Pcwstr, args: COpaquePointer?, options: COpaquePointer?, async: COpaquePointer?, command: COpaquePointer?) {
    if (_windowsWin32SystemRemotemanagementNapiAddon != null) {
        _windowsWin32SystemRemotemanagementNapiAddon.windowssys_windows_win32_system_remotemanagement_wSManRunShellCommandEx(shell.toString(), flags.toInt(), (commandid?.value ?: 0L).toString(), (commandline?.value ?: 0L).toString(), (args?.value ?: 0L).toString(), (options?.value ?: 0L).toString(), (async?.value ?: 0L).toString(), (command?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wSManSendShellInput(shell: WsmanShellHandle, command: WsmanCommandHandle, flags: UInt, streamid: Pcwstr, streamdata: COpaquePointer?, endofstream: Bool, async: COpaquePointer?, sendoperation: COpaquePointer?) {
    if (_windowsWin32SystemRemotemanagementNapiAddon != null) {
        _windowsWin32SystemRemotemanagementNapiAddon.windowssys_windows_win32_system_remotemanagement_wSManSendShellInput(shell.toString(), command.toString(), flags.toInt(), (streamid?.value ?: 0L).toString(), (streamdata?.value ?: 0L).toString(), endofstream, (async?.value ?: 0L).toString(), (sendoperation?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wSManSetSessionOption(session: WsmanSessionHandle, option: WSManSessionOption, data: COpaquePointer?): UInt =
    if (_windowsWin32SystemRemotemanagementNapiAddon != null) (_windowsWin32SystemRemotemanagementNapiAddon.windowssys_windows_win32_system_remotemanagement_wSManSetSessionOption(session.toString(), option, (data?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManSignalShell(shell: WsmanShellHandle, command: WsmanCommandHandle, flags: UInt, code: Pcwstr, async: COpaquePointer?, signaloperation: COpaquePointer?) {
    if (_windowsWin32SystemRemotemanagementNapiAddon != null) {
        _windowsWin32SystemRemotemanagementNapiAddon.windowssys_windows_win32_system_remotemanagement_wSManSignalShell(shell.toString(), command.toString(), flags.toInt(), (code?.value ?: 0L).toString(), (async?.value ?: 0L).toString(), (signaloperation?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}
