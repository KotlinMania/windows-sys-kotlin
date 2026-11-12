@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SystemRemotemanagementNapiAddon(): Boolean

private val windowsWin32SystemRemotemanagementNapiAvailable: Boolean = initWindowsWin32SystemRemotemanagementNapiAddon()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotemanagementWSManCloseCommand(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRemotemanagementWSManCloseCommand(p0: String, p1: Int, p2: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotemanagementWSManCloseOperation(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRemotemanagementWSManCloseOperation(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotemanagementWSManCloseSession(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRemotemanagementWSManCloseSession(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotemanagementWSManCloseShell(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRemotemanagementWSManCloseShell(p0: String, p1: Int, p2: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotemanagementWSManConnectShell(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemRemotemanagementWSManConnectShell(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotemanagementWSManConnectShellCommand(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemRemotemanagementWSManConnectShellCommand(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotemanagementWSManCreateSession(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemRemotemanagementWSManCreateSession(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotemanagementWSManCreateShell(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemRemotemanagementWSManCreateShell(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotemanagementWSManCreateShellEx(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SystemRemotemanagementWSManCreateShellEx(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotemanagementWSManDeinitialize(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRemotemanagementWSManDeinitialize(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotemanagementWSManDisconnectShell(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRemotemanagementWSManDisconnectShell(p0: String, p1: Int, p2: String, p3: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotemanagementWSManGetErrorMessage(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemRemotemanagementWSManGetErrorMessage(p0: String, p1: Int, p2: String, p3: Int, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotemanagementWSManGetSessionOptionAsDword(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRemotemanagementWSManGetSessionOptionAsDword(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotemanagementWSManGetSessionOptionAsString(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemRemotemanagementWSManGetSessionOptionAsString(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotemanagementWSManInitialize(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRemotemanagementWSManInitialize(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotemanagementWSManPluginAuthzOperationComplete(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemRemotemanagementWSManPluginAuthzOperationComplete(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotemanagementWSManPluginAuthzQueryQuotaComplete(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemRemotemanagementWSManPluginAuthzQueryQuotaComplete(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotemanagementWSManPluginAuthzUserComplete(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemRemotemanagementWSManPluginAuthzUserComplete(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: Int, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotemanagementWSManPluginFreeRequestDetails(p0)")
private external fun wasmWindowssysWindowsWin32SystemRemotemanagementWSManPluginFreeRequestDetails(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotemanagementWSManPluginGetConfiguration(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRemotemanagementWSManPluginGetConfiguration(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotemanagementWSManPluginGetOperationParameters(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRemotemanagementWSManPluginGetOperationParameters(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotemanagementWSManPluginOperationComplete(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRemotemanagementWSManPluginOperationComplete(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotemanagementWSManPluginReceiveResult(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemRemotemanagementWSManPluginReceiveResult(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotemanagementWSManPluginReportCompletion(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRemotemanagementWSManPluginReportCompletion(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotemanagementWSManPluginReportContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRemotemanagementWSManPluginReportContext(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotemanagementWSManReceiveShellOutput(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemRemotemanagementWSManReceiveShellOutput(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotemanagementWSManReconnectShell(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRemotemanagementWSManReconnectShell(p0: String, p1: Int, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotemanagementWSManReconnectShellCommand(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRemotemanagementWSManReconnectShellCommand(p0: String, p1: Int, p2: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotemanagementWSManRunShellCommand(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemRemotemanagementWSManRunShellCommand(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotemanagementWSManRunShellCommandEx(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemRemotemanagementWSManRunShellCommandEx(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotemanagementWSManSendShellInput(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemRemotemanagementWSManSendShellInput(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int, p6: String, p7: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotemanagementWSManSetSessionOption(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRemotemanagementWSManSetSessionOption(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotemanagementWSManSignalShell(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemRemotemanagementWSManSignalShell(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String)

public actual fun wSManCloseCommand(commandhandle: WsmanCommandHandle, flags: UInt, async: ConstPtr) {
    if (windowsWin32SystemRemotemanagementNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRemotemanagementWSManCloseCommand(commandhandle.toString(), flags.toInt(), async.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wSManCloseOperation(operationhandle: WsmanOperationHandle, flags: UInt): UInt =
    if (windowsWin32SystemRemotemanagementNapiAvailable) wasmWindowssysWindowsWin32SystemRemotemanagementWSManCloseOperation(operationhandle.toString(), flags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManCloseSession(session: WsmanSessionHandle, flags: UInt): UInt =
    if (windowsWin32SystemRemotemanagementNapiAvailable) wasmWindowssysWindowsWin32SystemRemotemanagementWSManCloseSession(session.toString(), flags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManCloseShell(shellhandle: WsmanShellHandle, flags: UInt, async: ConstPtr) {
    if (windowsWin32SystemRemotemanagementNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRemotemanagementWSManCloseShell(shellhandle.toString(), flags.toInt(), async.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wSManConnectShell(session: WsmanSessionHandle, flags: UInt, resourceuri: Pcwstr, shellid: Pcwstr, options: ConstPtr, connectxml: ConstPtr, async: ConstPtr, shell: MutPtr) {
    if (windowsWin32SystemRemotemanagementNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRemotemanagementWSManConnectShell(session.toString(), flags.toInt(), resourceuri.rawAddress.toString(), shellid.rawAddress.toString(), options.rawAddress.toString(), connectxml.rawAddress.toString(), async.rawAddress.toString(), shell.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wSManConnectShellCommand(shell: WsmanShellHandle, flags: UInt, commandid: Pcwstr, options: ConstPtr, connectxml: ConstPtr, async: ConstPtr, command: MutPtr) {
    if (windowsWin32SystemRemotemanagementNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRemotemanagementWSManConnectShellCommand(shell.toString(), flags.toInt(), commandid.rawAddress.toString(), options.rawAddress.toString(), connectxml.rawAddress.toString(), async.rawAddress.toString(), command.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wSManCreateSession(apihandle: WsmanApiHandle, connection: Pcwstr, flags: UInt, serverauthenticationcredentials: ConstPtr, proxyinfo: ConstPtr, session: MutPtr): UInt =
    if (windowsWin32SystemRemotemanagementNapiAvailable) wasmWindowssysWindowsWin32SystemRemotemanagementWSManCreateSession(apihandle.toString(), connection.rawAddress.toString(), flags.toInt(), serverauthenticationcredentials.rawAddress.toString(), proxyinfo.rawAddress.toString(), session.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManCreateShell(session: WsmanSessionHandle, flags: UInt, resourceuri: Pcwstr, startupinfo: ConstPtr, options: ConstPtr, createxml: ConstPtr, async: ConstPtr, shell: MutPtr) {
    if (windowsWin32SystemRemotemanagementNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRemotemanagementWSManCreateShell(session.toString(), flags.toInt(), resourceuri.rawAddress.toString(), startupinfo.rawAddress.toString(), options.rawAddress.toString(), createxml.rawAddress.toString(), async.rawAddress.toString(), shell.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wSManCreateShellEx(session: WsmanSessionHandle, flags: UInt, resourceuri: Pcwstr, shellid: Pcwstr, startupinfo: ConstPtr, options: ConstPtr, createxml: ConstPtr, async: ConstPtr, shell: MutPtr) {
    if (windowsWin32SystemRemotemanagementNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRemotemanagementWSManCreateShellEx(session.toString(), flags.toInt(), resourceuri.rawAddress.toString(), shellid.rawAddress.toString(), startupinfo.rawAddress.toString(), options.rawAddress.toString(), createxml.rawAddress.toString(), async.rawAddress.toString(), shell.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wSManDeinitialize(apihandle: WsmanApiHandle, flags: UInt): UInt =
    if (windowsWin32SystemRemotemanagementNapiAvailable) wasmWindowssysWindowsWin32SystemRemotemanagementWSManDeinitialize(apihandle.toString(), flags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManDisconnectShell(shell: WsmanShellHandle, flags: UInt, disconnectinfo: ConstPtr, async: ConstPtr) {
    if (windowsWin32SystemRemotemanagementNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRemotemanagementWSManDisconnectShell(shell.toString(), flags.toInt(), disconnectinfo.rawAddress.toString(), async.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wSManGetErrorMessage(apihandle: WsmanApiHandle, flags: UInt, languagecode: Pcwstr, errorcode: UInt, messagelength: UInt, message: Pwstr, messagelengthused: MutPtr): UInt =
    if (windowsWin32SystemRemotemanagementNapiAvailable) wasmWindowssysWindowsWin32SystemRemotemanagementWSManGetErrorMessage(apihandle.toString(), flags.toInt(), languagecode.rawAddress.toString(), errorcode.toInt(), messagelength.toInt(), message.rawAddress.toString(), messagelengthused.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManGetSessionOptionAsDword(session: WsmanSessionHandle, option: WSManSessionOption, value: MutPtr): UInt =
    if (windowsWin32SystemRemotemanagementNapiAvailable) wasmWindowssysWindowsWin32SystemRemotemanagementWSManGetSessionOptionAsDword(session.toString(), option, value.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManGetSessionOptionAsString(session: WsmanSessionHandle, option: WSManSessionOption, stringlength: UInt, string: Pwstr, stringlengthused: MutPtr): UInt =
    if (windowsWin32SystemRemotemanagementNapiAvailable) wasmWindowssysWindowsWin32SystemRemotemanagementWSManGetSessionOptionAsString(session.toString(), option, stringlength.toInt(), string.rawAddress.toString(), stringlengthused.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManInitialize(flags: UInt, apihandle: MutPtr): UInt =
    if (windowsWin32SystemRemotemanagementNapiAvailable) wasmWindowssysWindowsWin32SystemRemotemanagementWSManInitialize(flags.toInt(), apihandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManPluginAuthzOperationComplete(senderdetails: ConstPtr, flags: UInt, userauthorizationcontext: ConstPtr, errorcode: UInt, extendederrorinformation: Pcwstr): UInt =
    if (windowsWin32SystemRemotemanagementNapiAvailable) wasmWindowssysWindowsWin32SystemRemotemanagementWSManPluginAuthzOperationComplete(senderdetails.rawAddress.toString(), flags.toInt(), userauthorizationcontext.rawAddress.toString(), errorcode.toInt(), extendederrorinformation.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManPluginAuthzQueryQuotaComplete(senderdetails: ConstPtr, flags: UInt, quota: ConstPtr, errorcode: UInt, extendederrorinformation: Pcwstr): UInt =
    if (windowsWin32SystemRemotemanagementNapiAvailable) wasmWindowssysWindowsWin32SystemRemotemanagementWSManPluginAuthzQueryQuotaComplete(senderdetails.rawAddress.toString(), flags.toInt(), quota.rawAddress.toString(), errorcode.toInt(), extendederrorinformation.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManPluginAuthzUserComplete(senderdetails: ConstPtr, flags: UInt, userauthorizationcontext: ConstPtr, impersonationtoken: Handle, userisadministrator: Bool, errorcode: UInt, extendederrorinformation: Pcwstr): UInt =
    if (windowsWin32SystemRemotemanagementNapiAvailable) wasmWindowssysWindowsWin32SystemRemotemanagementWSManPluginAuthzUserComplete(senderdetails.rawAddress.toString(), flags.toInt(), userauthorizationcontext.rawAddress.toString(), impersonationtoken.rawAddress.toString(), userisadministrator, errorcode.toInt(), extendederrorinformation.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManPluginFreeRequestDetails(requestdetails: ConstPtr): UInt =
    if (windowsWin32SystemRemotemanagementNapiAvailable) wasmWindowssysWindowsWin32SystemRemotemanagementWSManPluginFreeRequestDetails(requestdetails.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManPluginGetConfiguration(plugincontext: ConstPtr, flags: UInt, data: MutPtr): UInt =
    if (windowsWin32SystemRemotemanagementNapiAvailable) wasmWindowssysWindowsWin32SystemRemotemanagementWSManPluginGetConfiguration(plugincontext.rawAddress.toString(), flags.toInt(), data.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManPluginGetOperationParameters(requestdetails: ConstPtr, flags: UInt, data: MutPtr): UInt =
    if (windowsWin32SystemRemotemanagementNapiAvailable) wasmWindowssysWindowsWin32SystemRemotemanagementWSManPluginGetOperationParameters(requestdetails.rawAddress.toString(), flags.toInt(), data.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManPluginOperationComplete(requestdetails: ConstPtr, flags: UInt, errorcode: UInt, extendedinformation: Pcwstr): UInt =
    if (windowsWin32SystemRemotemanagementNapiAvailable) wasmWindowssysWindowsWin32SystemRemotemanagementWSManPluginOperationComplete(requestdetails.rawAddress.toString(), flags.toInt(), errorcode.toInt(), extendedinformation.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManPluginReceiveResult(requestdetails: ConstPtr, flags: UInt, stream: Pcwstr, streamresult: ConstPtr, commandstate: Pcwstr, exitcode: UInt): UInt =
    if (windowsWin32SystemRemotemanagementNapiAvailable) wasmWindowssysWindowsWin32SystemRemotemanagementWSManPluginReceiveResult(requestdetails.rawAddress.toString(), flags.toInt(), stream.rawAddress.toString(), streamresult.rawAddress.toString(), commandstate.rawAddress.toString(), exitcode.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManPluginReportCompletion(plugincontext: ConstPtr, flags: UInt): UInt =
    if (windowsWin32SystemRemotemanagementNapiAvailable) wasmWindowssysWindowsWin32SystemRemotemanagementWSManPluginReportCompletion(plugincontext.rawAddress.toString(), flags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManPluginReportContext(requestdetails: ConstPtr, flags: UInt, context: ConstPtr): UInt =
    if (windowsWin32SystemRemotemanagementNapiAvailable) wasmWindowssysWindowsWin32SystemRemotemanagementWSManPluginReportContext(requestdetails.rawAddress.toString(), flags.toInt(), context.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManReceiveShellOutput(shell: WsmanShellHandle, command: WsmanCommandHandle, flags: UInt, desiredstreamset: ConstPtr, async: ConstPtr, receiveoperation: MutPtr) {
    if (windowsWin32SystemRemotemanagementNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRemotemanagementWSManReceiveShellOutput(shell.toString(), command.toString(), flags.toInt(), desiredstreamset.rawAddress.toString(), async.rawAddress.toString(), receiveoperation.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wSManReconnectShell(shell: WsmanShellHandle, flags: UInt, async: ConstPtr) {
    if (windowsWin32SystemRemotemanagementNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRemotemanagementWSManReconnectShell(shell.toString(), flags.toInt(), async.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wSManReconnectShellCommand(commandhandle: WsmanCommandHandle, flags: UInt, async: ConstPtr) {
    if (windowsWin32SystemRemotemanagementNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRemotemanagementWSManReconnectShellCommand(commandhandle.toString(), flags.toInt(), async.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wSManRunShellCommand(shell: WsmanShellHandle, flags: UInt, commandline: Pcwstr, args: ConstPtr, options: ConstPtr, async: ConstPtr, command: MutPtr) {
    if (windowsWin32SystemRemotemanagementNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRemotemanagementWSManRunShellCommand(shell.toString(), flags.toInt(), commandline.rawAddress.toString(), args.rawAddress.toString(), options.rawAddress.toString(), async.rawAddress.toString(), command.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wSManRunShellCommandEx(shell: WsmanShellHandle, flags: UInt, commandid: Pcwstr, commandline: Pcwstr, args: ConstPtr, options: ConstPtr, async: ConstPtr, command: MutPtr) {
    if (windowsWin32SystemRemotemanagementNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRemotemanagementWSManRunShellCommandEx(shell.toString(), flags.toInt(), commandid.rawAddress.toString(), commandline.rawAddress.toString(), args.rawAddress.toString(), options.rawAddress.toString(), async.rawAddress.toString(), command.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wSManSendShellInput(shell: WsmanShellHandle, command: WsmanCommandHandle, flags: UInt, streamid: Pcwstr, streamdata: ConstPtr, endofstream: Bool, async: ConstPtr, sendoperation: MutPtr) {
    if (windowsWin32SystemRemotemanagementNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRemotemanagementWSManSendShellInput(shell.toString(), command.toString(), flags.toInt(), streamid.rawAddress.toString(), streamdata.rawAddress.toString(), endofstream, async.rawAddress.toString(), sendoperation.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wSManSetSessionOption(session: WsmanSessionHandle, option: WSManSessionOption, data: ConstPtr): UInt =
    if (windowsWin32SystemRemotemanagementNapiAvailable) wasmWindowssysWindowsWin32SystemRemotemanagementWSManSetSessionOption(session.toString(), option, data.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManSignalShell(shell: WsmanShellHandle, command: WsmanCommandHandle, flags: UInt, code: Pcwstr, async: ConstPtr, signaloperation: MutPtr) {
    if (windowsWin32SystemRemotemanagementNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRemotemanagementWSManSignalShell(shell.toString(), command.toString(), flags.toInt(), code.rawAddress.toString(), async.rawAddress.toString(), signaloperation.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}
