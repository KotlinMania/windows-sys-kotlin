@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private val windowsWin32SystemRemotemanagementNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun wSManCloseCommand(commandhandle: WsmanCommandHandle, flags: UInt, async: ConstPtr) {
    if (windowsWin32SystemRemotemanagementNapiAddon != null) {
        windowsWin32SystemRemotemanagementNapiAddon.windowssysWindowsWin32SystemRemotemanagementWSManCloseCommand(commandhandle.toString(), flags.toInt(), async.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wSManCloseOperation(operationhandle: WsmanOperationHandle, flags: UInt): UInt =
    if (windowsWin32SystemRemotemanagementNapiAddon != null) (windowsWin32SystemRemotemanagementNapiAddon.windowssysWindowsWin32SystemRemotemanagementWSManCloseOperation(operationhandle.toString(), flags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManCloseSession(session: WsmanSessionHandle, flags: UInt): UInt =
    if (windowsWin32SystemRemotemanagementNapiAddon != null) (windowsWin32SystemRemotemanagementNapiAddon.windowssysWindowsWin32SystemRemotemanagementWSManCloseSession(session.toString(), flags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManCloseShell(shellhandle: WsmanShellHandle, flags: UInt, async: ConstPtr) {
    if (windowsWin32SystemRemotemanagementNapiAddon != null) {
        windowsWin32SystemRemotemanagementNapiAddon.windowssysWindowsWin32SystemRemotemanagementWSManCloseShell(shellhandle.toString(), flags.toInt(), async.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wSManConnectShell(session: WsmanSessionHandle, flags: UInt, resourceuri: Pcwstr, shellid: Pcwstr, options: ConstPtr, connectxml: ConstPtr, async: ConstPtr, shell: MutPtr) {
    if (windowsWin32SystemRemotemanagementNapiAddon != null) {
        windowsWin32SystemRemotemanagementNapiAddon.windowssysWindowsWin32SystemRemotemanagementWSManConnectShell(session.toString(), flags.toInt(), resourceuri.rawAddress.toString(), shellid.rawAddress.toString(), options.rawAddress.toString(), connectxml.rawAddress.toString(), async.rawAddress.toString(), shell.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wSManConnectShellCommand(shell: WsmanShellHandle, flags: UInt, commandid: Pcwstr, options: ConstPtr, connectxml: ConstPtr, async: ConstPtr, command: MutPtr) {
    if (windowsWin32SystemRemotemanagementNapiAddon != null) {
        windowsWin32SystemRemotemanagementNapiAddon.windowssysWindowsWin32SystemRemotemanagementWSManConnectShellCommand(shell.toString(), flags.toInt(), commandid.rawAddress.toString(), options.rawAddress.toString(), connectxml.rawAddress.toString(), async.rawAddress.toString(), command.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wSManCreateSession(apihandle: WsmanApiHandle, connection: Pcwstr, flags: UInt, serverauthenticationcredentials: ConstPtr, proxyinfo: ConstPtr, session: MutPtr): UInt =
    if (windowsWin32SystemRemotemanagementNapiAddon != null) (windowsWin32SystemRemotemanagementNapiAddon.windowssysWindowsWin32SystemRemotemanagementWSManCreateSession(apihandle.toString(), connection.rawAddress.toString(), flags.toInt(), serverauthenticationcredentials.rawAddress.toString(), proxyinfo.rawAddress.toString(), session.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManCreateShell(session: WsmanSessionHandle, flags: UInt, resourceuri: Pcwstr, startupinfo: ConstPtr, options: ConstPtr, createxml: ConstPtr, async: ConstPtr, shell: MutPtr) {
    if (windowsWin32SystemRemotemanagementNapiAddon != null) {
        windowsWin32SystemRemotemanagementNapiAddon.windowssysWindowsWin32SystemRemotemanagementWSManCreateShell(session.toString(), flags.toInt(), resourceuri.rawAddress.toString(), startupinfo.rawAddress.toString(), options.rawAddress.toString(), createxml.rawAddress.toString(), async.rawAddress.toString(), shell.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wSManCreateShellEx(session: WsmanSessionHandle, flags: UInt, resourceuri: Pcwstr, shellid: Pcwstr, startupinfo: ConstPtr, options: ConstPtr, createxml: ConstPtr, async: ConstPtr, shell: MutPtr) {
    if (windowsWin32SystemRemotemanagementNapiAddon != null) {
        windowsWin32SystemRemotemanagementNapiAddon.windowssysWindowsWin32SystemRemotemanagementWSManCreateShellEx(session.toString(), flags.toInt(), resourceuri.rawAddress.toString(), shellid.rawAddress.toString(), startupinfo.rawAddress.toString(), options.rawAddress.toString(), createxml.rawAddress.toString(), async.rawAddress.toString(), shell.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wSManDeinitialize(apihandle: WsmanApiHandle, flags: UInt): UInt =
    if (windowsWin32SystemRemotemanagementNapiAddon != null) (windowsWin32SystemRemotemanagementNapiAddon.windowssysWindowsWin32SystemRemotemanagementWSManDeinitialize(apihandle.toString(), flags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManDisconnectShell(shell: WsmanShellHandle, flags: UInt, disconnectinfo: ConstPtr, async: ConstPtr) {
    if (windowsWin32SystemRemotemanagementNapiAddon != null) {
        windowsWin32SystemRemotemanagementNapiAddon.windowssysWindowsWin32SystemRemotemanagementWSManDisconnectShell(shell.toString(), flags.toInt(), disconnectinfo.rawAddress.toString(), async.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wSManGetErrorMessage(apihandle: WsmanApiHandle, flags: UInt, languagecode: Pcwstr, errorcode: UInt, messagelength: UInt, message: Pwstr, messagelengthused: MutPtr): UInt =
    if (windowsWin32SystemRemotemanagementNapiAddon != null) (windowsWin32SystemRemotemanagementNapiAddon.windowssysWindowsWin32SystemRemotemanagementWSManGetErrorMessage(apihandle.toString(), flags.toInt(), languagecode.rawAddress.toString(), errorcode.toInt(), messagelength.toInt(), message.rawAddress.toString(), messagelengthused.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManGetSessionOptionAsDword(session: WsmanSessionHandle, option: WSManSessionOption, value: MutPtr): UInt =
    if (windowsWin32SystemRemotemanagementNapiAddon != null) (windowsWin32SystemRemotemanagementNapiAddon.windowssysWindowsWin32SystemRemotemanagementWSManGetSessionOptionAsDword(session.toString(), option, value.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManGetSessionOptionAsString(session: WsmanSessionHandle, option: WSManSessionOption, stringlength: UInt, string: Pwstr, stringlengthused: MutPtr): UInt =
    if (windowsWin32SystemRemotemanagementNapiAddon != null) (windowsWin32SystemRemotemanagementNapiAddon.windowssysWindowsWin32SystemRemotemanagementWSManGetSessionOptionAsString(session.toString(), option, stringlength.toInt(), string.rawAddress.toString(), stringlengthused.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManInitialize(flags: UInt, apihandle: MutPtr): UInt =
    if (windowsWin32SystemRemotemanagementNapiAddon != null) (windowsWin32SystemRemotemanagementNapiAddon.windowssysWindowsWin32SystemRemotemanagementWSManInitialize(flags.toInt(), apihandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManPluginAuthzOperationComplete(senderdetails: ConstPtr, flags: UInt, userauthorizationcontext: ConstPtr, errorcode: UInt, extendederrorinformation: Pcwstr): UInt =
    if (windowsWin32SystemRemotemanagementNapiAddon != null) (windowsWin32SystemRemotemanagementNapiAddon.windowssysWindowsWin32SystemRemotemanagementWSManPluginAuthzOperationComplete(senderdetails.rawAddress.toString(), flags.toInt(), userauthorizationcontext.rawAddress.toString(), errorcode.toInt(), extendederrorinformation.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManPluginAuthzQueryQuotaComplete(senderdetails: ConstPtr, flags: UInt, quota: ConstPtr, errorcode: UInt, extendederrorinformation: Pcwstr): UInt =
    if (windowsWin32SystemRemotemanagementNapiAddon != null) (windowsWin32SystemRemotemanagementNapiAddon.windowssysWindowsWin32SystemRemotemanagementWSManPluginAuthzQueryQuotaComplete(senderdetails.rawAddress.toString(), flags.toInt(), quota.rawAddress.toString(), errorcode.toInt(), extendederrorinformation.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManPluginAuthzUserComplete(senderdetails: ConstPtr, flags: UInt, userauthorizationcontext: ConstPtr, impersonationtoken: Handle, userisadministrator: Bool, errorcode: UInt, extendederrorinformation: Pcwstr): UInt =
    if (windowsWin32SystemRemotemanagementNapiAddon != null) (windowsWin32SystemRemotemanagementNapiAddon.windowssysWindowsWin32SystemRemotemanagementWSManPluginAuthzUserComplete(senderdetails.rawAddress.toString(), flags.toInt(), userauthorizationcontext.rawAddress.toString(), impersonationtoken.rawAddress.toString(), userisadministrator, errorcode.toInt(), extendederrorinformation.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManPluginFreeRequestDetails(requestdetails: ConstPtr): UInt =
    if (windowsWin32SystemRemotemanagementNapiAddon != null) (windowsWin32SystemRemotemanagementNapiAddon.windowssysWindowsWin32SystemRemotemanagementWSManPluginFreeRequestDetails(requestdetails.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManPluginGetConfiguration(plugincontext: ConstPtr, flags: UInt, data: MutPtr): UInt =
    if (windowsWin32SystemRemotemanagementNapiAddon != null) (windowsWin32SystemRemotemanagementNapiAddon.windowssysWindowsWin32SystemRemotemanagementWSManPluginGetConfiguration(plugincontext.rawAddress.toString(), flags.toInt(), data.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManPluginGetOperationParameters(requestdetails: ConstPtr, flags: UInt, data: MutPtr): UInt =
    if (windowsWin32SystemRemotemanagementNapiAddon != null) (windowsWin32SystemRemotemanagementNapiAddon.windowssysWindowsWin32SystemRemotemanagementWSManPluginGetOperationParameters(requestdetails.rawAddress.toString(), flags.toInt(), data.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManPluginOperationComplete(requestdetails: ConstPtr, flags: UInt, errorcode: UInt, extendedinformation: Pcwstr): UInt =
    if (windowsWin32SystemRemotemanagementNapiAddon != null) (windowsWin32SystemRemotemanagementNapiAddon.windowssysWindowsWin32SystemRemotemanagementWSManPluginOperationComplete(requestdetails.rawAddress.toString(), flags.toInt(), errorcode.toInt(), extendedinformation.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManPluginReceiveResult(requestdetails: ConstPtr, flags: UInt, stream: Pcwstr, streamresult: ConstPtr, commandstate: Pcwstr, exitcode: UInt): UInt =
    if (windowsWin32SystemRemotemanagementNapiAddon != null) (windowsWin32SystemRemotemanagementNapiAddon.windowssysWindowsWin32SystemRemotemanagementWSManPluginReceiveResult(requestdetails.rawAddress.toString(), flags.toInt(), stream.rawAddress.toString(), streamresult.rawAddress.toString(), commandstate.rawAddress.toString(), exitcode.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManPluginReportCompletion(plugincontext: ConstPtr, flags: UInt): UInt =
    if (windowsWin32SystemRemotemanagementNapiAddon != null) (windowsWin32SystemRemotemanagementNapiAddon.windowssysWindowsWin32SystemRemotemanagementWSManPluginReportCompletion(plugincontext.rawAddress.toString(), flags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManPluginReportContext(requestdetails: ConstPtr, flags: UInt, context: ConstPtr): UInt =
    if (windowsWin32SystemRemotemanagementNapiAddon != null) (windowsWin32SystemRemotemanagementNapiAddon.windowssysWindowsWin32SystemRemotemanagementWSManPluginReportContext(requestdetails.rawAddress.toString(), flags.toInt(), context.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManReceiveShellOutput(shell: WsmanShellHandle, command: WsmanCommandHandle, flags: UInt, desiredstreamset: ConstPtr, async: ConstPtr, receiveoperation: MutPtr) {
    if (windowsWin32SystemRemotemanagementNapiAddon != null) {
        windowsWin32SystemRemotemanagementNapiAddon.windowssysWindowsWin32SystemRemotemanagementWSManReceiveShellOutput(shell.toString(), command.toString(), flags.toInt(), desiredstreamset.rawAddress.toString(), async.rawAddress.toString(), receiveoperation.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wSManReconnectShell(shell: WsmanShellHandle, flags: UInt, async: ConstPtr) {
    if (windowsWin32SystemRemotemanagementNapiAddon != null) {
        windowsWin32SystemRemotemanagementNapiAddon.windowssysWindowsWin32SystemRemotemanagementWSManReconnectShell(shell.toString(), flags.toInt(), async.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wSManReconnectShellCommand(commandhandle: WsmanCommandHandle, flags: UInt, async: ConstPtr) {
    if (windowsWin32SystemRemotemanagementNapiAddon != null) {
        windowsWin32SystemRemotemanagementNapiAddon.windowssysWindowsWin32SystemRemotemanagementWSManReconnectShellCommand(commandhandle.toString(), flags.toInt(), async.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wSManRunShellCommand(shell: WsmanShellHandle, flags: UInt, commandline: Pcwstr, args: ConstPtr, options: ConstPtr, async: ConstPtr, command: MutPtr) {
    if (windowsWin32SystemRemotemanagementNapiAddon != null) {
        windowsWin32SystemRemotemanagementNapiAddon.windowssysWindowsWin32SystemRemotemanagementWSManRunShellCommand(shell.toString(), flags.toInt(), commandline.rawAddress.toString(), args.rawAddress.toString(), options.rawAddress.toString(), async.rawAddress.toString(), command.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wSManRunShellCommandEx(shell: WsmanShellHandle, flags: UInt, commandid: Pcwstr, commandline: Pcwstr, args: ConstPtr, options: ConstPtr, async: ConstPtr, command: MutPtr) {
    if (windowsWin32SystemRemotemanagementNapiAddon != null) {
        windowsWin32SystemRemotemanagementNapiAddon.windowssysWindowsWin32SystemRemotemanagementWSManRunShellCommandEx(shell.toString(), flags.toInt(), commandid.rawAddress.toString(), commandline.rawAddress.toString(), args.rawAddress.toString(), options.rawAddress.toString(), async.rawAddress.toString(), command.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wSManSendShellInput(shell: WsmanShellHandle, command: WsmanCommandHandle, flags: UInt, streamid: Pcwstr, streamdata: ConstPtr, endofstream: Bool, async: ConstPtr, sendoperation: MutPtr) {
    if (windowsWin32SystemRemotemanagementNapiAddon != null) {
        windowsWin32SystemRemotemanagementNapiAddon.windowssysWindowsWin32SystemRemotemanagementWSManSendShellInput(shell.toString(), command.toString(), flags.toInt(), streamid.rawAddress.toString(), streamdata.rawAddress.toString(), endofstream, async.rawAddress.toString(), sendoperation.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wSManSetSessionOption(session: WsmanSessionHandle, option: WSManSessionOption, data: ConstPtr): UInt =
    if (windowsWin32SystemRemotemanagementNapiAddon != null) (windowsWin32SystemRemotemanagementNapiAddon.windowssysWindowsWin32SystemRemotemanagementWSManSetSessionOption(session.toString(), option, data.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wSManSignalShell(shell: WsmanShellHandle, command: WsmanCommandHandle, flags: UInt, code: Pcwstr, async: ConstPtr, signaloperation: MutPtr) {
    if (windowsWin32SystemRemotemanagementNapiAddon != null) {
        windowsWin32SystemRemotemanagementNapiAddon.windowssysWindowsWin32SystemRemotemanagementWSManSignalShell(shell.toString(), command.toString(), flags.toInt(), code.rawAddress.toString(), async.rawAddress.toString(), signaloperation.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}
