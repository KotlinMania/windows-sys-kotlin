@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32SystemRemotemanagementNapiAddon(): Boolean

private val _windowsWin32SystemRemotemanagementNapiAvailable: Boolean = _initWindowsWin32SystemRemotemanagementNapiAddon()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_remotemanagement_wSManCloseCommand(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_remotemanagement_wSManCloseCommand(p0: String, p1: Int, p2: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_remotemanagement_wSManCloseOperation(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_remotemanagement_wSManCloseOperation(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_remotemanagement_wSManCloseSession(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_remotemanagement_wSManCloseSession(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_remotemanagement_wSManCloseShell(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_remotemanagement_wSManCloseShell(p0: String, p1: Int, p2: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_remotemanagement_wSManConnectShell(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_system_remotemanagement_wSManConnectShell(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_remotemanagement_wSManConnectShellCommand(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_system_remotemanagement_wSManConnectShellCommand(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_remotemanagement_wSManCreateSession(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_remotemanagement_wSManCreateSession(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_remotemanagement_wSManCreateShell(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_system_remotemanagement_wSManCreateShell(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_remotemanagement_wSManCreateShellEx(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_win32_system_remotemanagement_wSManCreateShellEx(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_remotemanagement_wSManDeinitialize(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_remotemanagement_wSManDeinitialize(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_remotemanagement_wSManDisconnectShell(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_remotemanagement_wSManDisconnectShell(p0: String, p1: Int, p2: String, p3: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_remotemanagement_wSManGetErrorMessage(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_system_remotemanagement_wSManGetErrorMessage(p0: String, p1: Int, p2: String, p3: Int, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_remotemanagement_wSManGetSessionOptionAsDword(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_remotemanagement_wSManGetSessionOptionAsDword(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_remotemanagement_wSManGetSessionOptionAsString(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_remotemanagement_wSManGetSessionOptionAsString(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_remotemanagement_wSManInitialize(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_remotemanagement_wSManInitialize(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_remotemanagement_wSManPluginAuthzOperationComplete(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_remotemanagement_wSManPluginAuthzOperationComplete(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_remotemanagement_wSManPluginAuthzQueryQuotaComplete(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_remotemanagement_wSManPluginAuthzQueryQuotaComplete(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_remotemanagement_wSManPluginAuthzUserComplete(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_system_remotemanagement_wSManPluginAuthzUserComplete(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: Int, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_remotemanagement_wSManPluginFreeRequestDetails(p0)")
private external fun _wasm_windowssys_windows_win32_system_remotemanagement_wSManPluginFreeRequestDetails(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_remotemanagement_wSManPluginGetConfiguration(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_remotemanagement_wSManPluginGetConfiguration(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_remotemanagement_wSManPluginGetOperationParameters(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_remotemanagement_wSManPluginGetOperationParameters(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_remotemanagement_wSManPluginOperationComplete(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_remotemanagement_wSManPluginOperationComplete(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_remotemanagement_wSManPluginReceiveResult(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_remotemanagement_wSManPluginReceiveResult(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_remotemanagement_wSManPluginReportCompletion(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_remotemanagement_wSManPluginReportCompletion(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_remotemanagement_wSManPluginReportContext(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_remotemanagement_wSManPluginReportContext(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_remotemanagement_wSManReceiveShellOutput(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_remotemanagement_wSManReceiveShellOutput(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_remotemanagement_wSManReconnectShell(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_remotemanagement_wSManReconnectShell(p0: String, p1: Int, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_remotemanagement_wSManReconnectShellCommand(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_remotemanagement_wSManReconnectShellCommand(p0: String, p1: Int, p2: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_remotemanagement_wSManRunShellCommand(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_system_remotemanagement_wSManRunShellCommand(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_remotemanagement_wSManRunShellCommandEx(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_system_remotemanagement_wSManRunShellCommandEx(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_remotemanagement_wSManSendShellInput(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_system_remotemanagement_wSManSendShellInput(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int, p6: String, p7: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_remotemanagement_wSManSetSessionOption(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_remotemanagement_wSManSetSessionOption(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_remotemanagement_wSManSignalShell(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_remotemanagement_wSManSignalShell(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String)

public actual fun wSManCloseCommand(commandhandle: WsmanCommandHandle, flags: UInt, async: COpaquePointer?) {
    if (_windowsWin32SystemRemotemanagementNapiAvailable) {
        _wasm_windowssys_windows_win32_system_remotemanagement_wSManCloseCommand(commandhandle.toString(), flags.toInt(), (async?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wSManCloseOperation(operationhandle: WsmanOperationHandle, flags: UInt): UInt =
    if (_windowsWin32SystemRemotemanagementNapiAvailable) _wasm_windowssys_windows_win32_system_remotemanagement_wSManCloseOperation(operationhandle.toString(), flags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManCloseSession(session: WsmanSessionHandle, flags: UInt): UInt =
    if (_windowsWin32SystemRemotemanagementNapiAvailable) _wasm_windowssys_windows_win32_system_remotemanagement_wSManCloseSession(session.toString(), flags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManCloseShell(shellhandle: WsmanShellHandle, flags: UInt, async: COpaquePointer?) {
    if (_windowsWin32SystemRemotemanagementNapiAvailable) {
        _wasm_windowssys_windows_win32_system_remotemanagement_wSManCloseShell(shellhandle.toString(), flags.toInt(), (async?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wSManConnectShell(session: WsmanSessionHandle, flags: UInt, resourceuri: Pcwstr, shellid: Pcwstr, options: COpaquePointer?, connectxml: COpaquePointer?, async: COpaquePointer?, shell: COpaquePointer?) {
    if (_windowsWin32SystemRemotemanagementNapiAvailable) {
        _wasm_windowssys_windows_win32_system_remotemanagement_wSManConnectShell(session.toString(), flags.toInt(), (resourceuri?.value ?: 0L).toString(), (shellid?.value ?: 0L).toString(), (options?.value ?: 0L).toString(), (connectxml?.value ?: 0L).toString(), (async?.value ?: 0L).toString(), (shell?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wSManConnectShellCommand(shell: WsmanShellHandle, flags: UInt, commandid: Pcwstr, options: COpaquePointer?, connectxml: COpaquePointer?, async: COpaquePointer?, command: COpaquePointer?) {
    if (_windowsWin32SystemRemotemanagementNapiAvailable) {
        _wasm_windowssys_windows_win32_system_remotemanagement_wSManConnectShellCommand(shell.toString(), flags.toInt(), (commandid?.value ?: 0L).toString(), (options?.value ?: 0L).toString(), (connectxml?.value ?: 0L).toString(), (async?.value ?: 0L).toString(), (command?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wSManCreateSession(apihandle: WsmanApiHandle, connection: Pcwstr, flags: UInt, serverauthenticationcredentials: COpaquePointer?, proxyinfo: COpaquePointer?, session: COpaquePointer?): UInt =
    if (_windowsWin32SystemRemotemanagementNapiAvailable) _wasm_windowssys_windows_win32_system_remotemanagement_wSManCreateSession(apihandle.toString(), (connection?.value ?: 0L).toString(), flags.toInt(), (serverauthenticationcredentials?.value ?: 0L).toString(), (proxyinfo?.value ?: 0L).toString(), (session?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManCreateShell(session: WsmanSessionHandle, flags: UInt, resourceuri: Pcwstr, startupinfo: COpaquePointer?, options: COpaquePointer?, createxml: COpaquePointer?, async: COpaquePointer?, shell: COpaquePointer?) {
    if (_windowsWin32SystemRemotemanagementNapiAvailable) {
        _wasm_windowssys_windows_win32_system_remotemanagement_wSManCreateShell(session.toString(), flags.toInt(), (resourceuri?.value ?: 0L).toString(), (startupinfo?.value ?: 0L).toString(), (options?.value ?: 0L).toString(), (createxml?.value ?: 0L).toString(), (async?.value ?: 0L).toString(), (shell?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wSManCreateShellEx(session: WsmanSessionHandle, flags: UInt, resourceuri: Pcwstr, shellid: Pcwstr, startupinfo: COpaquePointer?, options: COpaquePointer?, createxml: COpaquePointer?, async: COpaquePointer?, shell: COpaquePointer?) {
    if (_windowsWin32SystemRemotemanagementNapiAvailable) {
        _wasm_windowssys_windows_win32_system_remotemanagement_wSManCreateShellEx(session.toString(), flags.toInt(), (resourceuri?.value ?: 0L).toString(), (shellid?.value ?: 0L).toString(), (startupinfo?.value ?: 0L).toString(), (options?.value ?: 0L).toString(), (createxml?.value ?: 0L).toString(), (async?.value ?: 0L).toString(), (shell?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wSManDeinitialize(apihandle: WsmanApiHandle, flags: UInt): UInt =
    if (_windowsWin32SystemRemotemanagementNapiAvailable) _wasm_windowssys_windows_win32_system_remotemanagement_wSManDeinitialize(apihandle.toString(), flags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManDisconnectShell(shell: WsmanShellHandle, flags: UInt, disconnectinfo: COpaquePointer?, async: COpaquePointer?) {
    if (_windowsWin32SystemRemotemanagementNapiAvailable) {
        _wasm_windowssys_windows_win32_system_remotemanagement_wSManDisconnectShell(shell.toString(), flags.toInt(), (disconnectinfo?.value ?: 0L).toString(), (async?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wSManGetErrorMessage(apihandle: WsmanApiHandle, flags: UInt, languagecode: Pcwstr, errorcode: UInt, messagelength: UInt, message: Pwstr, messagelengthused: COpaquePointer?): UInt =
    if (_windowsWin32SystemRemotemanagementNapiAvailable) _wasm_windowssys_windows_win32_system_remotemanagement_wSManGetErrorMessage(apihandle.toString(), flags.toInt(), (languagecode?.value ?: 0L).toString(), errorcode.toInt(), messagelength.toInt(), (message?.value ?: 0L).toString(), (messagelengthused?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManGetSessionOptionAsDword(session: WsmanSessionHandle, option: WSManSessionOption, value: COpaquePointer?): UInt =
    if (_windowsWin32SystemRemotemanagementNapiAvailable) _wasm_windowssys_windows_win32_system_remotemanagement_wSManGetSessionOptionAsDword(session.toString(), option, (value?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManGetSessionOptionAsString(session: WsmanSessionHandle, option: WSManSessionOption, stringlength: UInt, string: Pwstr, stringlengthused: COpaquePointer?): UInt =
    if (_windowsWin32SystemRemotemanagementNapiAvailable) _wasm_windowssys_windows_win32_system_remotemanagement_wSManGetSessionOptionAsString(session.toString(), option, stringlength.toInt(), (string?.value ?: 0L).toString(), (stringlengthused?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManInitialize(flags: UInt, apihandle: COpaquePointer?): UInt =
    if (_windowsWin32SystemRemotemanagementNapiAvailable) _wasm_windowssys_windows_win32_system_remotemanagement_wSManInitialize(flags.toInt(), (apihandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManPluginAuthzOperationComplete(senderdetails: COpaquePointer?, flags: UInt, userauthorizationcontext: COpaquePointer?, errorcode: UInt, extendederrorinformation: Pcwstr): UInt =
    if (_windowsWin32SystemRemotemanagementNapiAvailable) _wasm_windowssys_windows_win32_system_remotemanagement_wSManPluginAuthzOperationComplete((senderdetails?.value ?: 0L).toString(), flags.toInt(), (userauthorizationcontext?.value ?: 0L).toString(), errorcode.toInt(), (extendederrorinformation?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManPluginAuthzQueryQuotaComplete(senderdetails: COpaquePointer?, flags: UInt, quota: COpaquePointer?, errorcode: UInt, extendederrorinformation: Pcwstr): UInt =
    if (_windowsWin32SystemRemotemanagementNapiAvailable) _wasm_windowssys_windows_win32_system_remotemanagement_wSManPluginAuthzQueryQuotaComplete((senderdetails?.value ?: 0L).toString(), flags.toInt(), (quota?.value ?: 0L).toString(), errorcode.toInt(), (extendederrorinformation?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManPluginAuthzUserComplete(senderdetails: COpaquePointer?, flags: UInt, userauthorizationcontext: COpaquePointer?, impersonationtoken: Handle, userisadministrator: Bool, errorcode: UInt, extendederrorinformation: Pcwstr): UInt =
    if (_windowsWin32SystemRemotemanagementNapiAvailable) _wasm_windowssys_windows_win32_system_remotemanagement_wSManPluginAuthzUserComplete((senderdetails?.value ?: 0L).toString(), flags.toInt(), (userauthorizationcontext?.value ?: 0L).toString(), (impersonationtoken?.value ?: 0L).toString(), userisadministrator, errorcode.toInt(), (extendederrorinformation?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManPluginFreeRequestDetails(requestdetails: COpaquePointer?): UInt =
    if (_windowsWin32SystemRemotemanagementNapiAvailable) _wasm_windowssys_windows_win32_system_remotemanagement_wSManPluginFreeRequestDetails((requestdetails?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManPluginGetConfiguration(plugincontext: COpaquePointer?, flags: UInt, data: COpaquePointer?): UInt =
    if (_windowsWin32SystemRemotemanagementNapiAvailable) _wasm_windowssys_windows_win32_system_remotemanagement_wSManPluginGetConfiguration((plugincontext?.value ?: 0L).toString(), flags.toInt(), (data?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManPluginGetOperationParameters(requestdetails: COpaquePointer?, flags: UInt, data: COpaquePointer?): UInt =
    if (_windowsWin32SystemRemotemanagementNapiAvailable) _wasm_windowssys_windows_win32_system_remotemanagement_wSManPluginGetOperationParameters((requestdetails?.value ?: 0L).toString(), flags.toInt(), (data?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManPluginOperationComplete(requestdetails: COpaquePointer?, flags: UInt, errorcode: UInt, extendedinformation: Pcwstr): UInt =
    if (_windowsWin32SystemRemotemanagementNapiAvailable) _wasm_windowssys_windows_win32_system_remotemanagement_wSManPluginOperationComplete((requestdetails?.value ?: 0L).toString(), flags.toInt(), errorcode.toInt(), (extendedinformation?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManPluginReceiveResult(requestdetails: COpaquePointer?, flags: UInt, stream: Pcwstr, streamresult: COpaquePointer?, commandstate: Pcwstr, exitcode: UInt): UInt =
    if (_windowsWin32SystemRemotemanagementNapiAvailable) _wasm_windowssys_windows_win32_system_remotemanagement_wSManPluginReceiveResult((requestdetails?.value ?: 0L).toString(), flags.toInt(), (stream?.value ?: 0L).toString(), (streamresult?.value ?: 0L).toString(), (commandstate?.value ?: 0L).toString(), exitcode.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManPluginReportCompletion(plugincontext: COpaquePointer?, flags: UInt): UInt =
    if (_windowsWin32SystemRemotemanagementNapiAvailable) _wasm_windowssys_windows_win32_system_remotemanagement_wSManPluginReportCompletion((plugincontext?.value ?: 0L).toString(), flags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManPluginReportContext(requestdetails: COpaquePointer?, flags: UInt, context: COpaquePointer?): UInt =
    if (_windowsWin32SystemRemotemanagementNapiAvailable) _wasm_windowssys_windows_win32_system_remotemanagement_wSManPluginReportContext((requestdetails?.value ?: 0L).toString(), flags.toInt(), (context?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManReceiveShellOutput(shell: WsmanShellHandle, command: WsmanCommandHandle, flags: UInt, desiredstreamset: COpaquePointer?, async: COpaquePointer?, receiveoperation: COpaquePointer?) {
    if (_windowsWin32SystemRemotemanagementNapiAvailable) {
        _wasm_windowssys_windows_win32_system_remotemanagement_wSManReceiveShellOutput(shell.toString(), command.toString(), flags.toInt(), (desiredstreamset?.value ?: 0L).toString(), (async?.value ?: 0L).toString(), (receiveoperation?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wSManReconnectShell(shell: WsmanShellHandle, flags: UInt, async: COpaquePointer?) {
    if (_windowsWin32SystemRemotemanagementNapiAvailable) {
        _wasm_windowssys_windows_win32_system_remotemanagement_wSManReconnectShell(shell.toString(), flags.toInt(), (async?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wSManReconnectShellCommand(commandhandle: WsmanCommandHandle, flags: UInt, async: COpaquePointer?) {
    if (_windowsWin32SystemRemotemanagementNapiAvailable) {
        _wasm_windowssys_windows_win32_system_remotemanagement_wSManReconnectShellCommand(commandhandle.toString(), flags.toInt(), (async?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wSManRunShellCommand(shell: WsmanShellHandle, flags: UInt, commandline: Pcwstr, args: COpaquePointer?, options: COpaquePointer?, async: COpaquePointer?, command: COpaquePointer?) {
    if (_windowsWin32SystemRemotemanagementNapiAvailable) {
        _wasm_windowssys_windows_win32_system_remotemanagement_wSManRunShellCommand(shell.toString(), flags.toInt(), (commandline?.value ?: 0L).toString(), (args?.value ?: 0L).toString(), (options?.value ?: 0L).toString(), (async?.value ?: 0L).toString(), (command?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wSManRunShellCommandEx(shell: WsmanShellHandle, flags: UInt, commandid: Pcwstr, commandline: Pcwstr, args: COpaquePointer?, options: COpaquePointer?, async: COpaquePointer?, command: COpaquePointer?) {
    if (_windowsWin32SystemRemotemanagementNapiAvailable) {
        _wasm_windowssys_windows_win32_system_remotemanagement_wSManRunShellCommandEx(shell.toString(), flags.toInt(), (commandid?.value ?: 0L).toString(), (commandline?.value ?: 0L).toString(), (args?.value ?: 0L).toString(), (options?.value ?: 0L).toString(), (async?.value ?: 0L).toString(), (command?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wSManSendShellInput(shell: WsmanShellHandle, command: WsmanCommandHandle, flags: UInt, streamid: Pcwstr, streamdata: COpaquePointer?, endofstream: Bool, async: COpaquePointer?, sendoperation: COpaquePointer?) {
    if (_windowsWin32SystemRemotemanagementNapiAvailable) {
        _wasm_windowssys_windows_win32_system_remotemanagement_wSManSendShellInput(shell.toString(), command.toString(), flags.toInt(), (streamid?.value ?: 0L).toString(), (streamdata?.value ?: 0L).toString(), endofstream, (async?.value ?: 0L).toString(), (sendoperation?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wSManSetSessionOption(session: WsmanSessionHandle, option: WSManSessionOption, data: COpaquePointer?): UInt =
    if (_windowsWin32SystemRemotemanagementNapiAvailable) _wasm_windowssys_windows_win32_system_remotemanagement_wSManSetSessionOption(session.toString(), option, (data?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManSignalShell(shell: WsmanShellHandle, command: WsmanCommandHandle, flags: UInt, code: Pcwstr, async: COpaquePointer?, signaloperation: COpaquePointer?) {
    if (_windowsWin32SystemRemotemanagementNapiAvailable) {
        _wasm_windowssys_windows_win32_system_remotemanagement_wSManSignalShell(shell.toString(), command.toString(), flags.toInt(), (code?.value ?: 0L).toString(), (async?.value ?: 0L).toString(), (signaloperation?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}
