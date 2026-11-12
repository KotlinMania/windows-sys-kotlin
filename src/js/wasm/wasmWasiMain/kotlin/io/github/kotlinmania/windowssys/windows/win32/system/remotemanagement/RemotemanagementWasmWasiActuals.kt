@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.remotemanagement

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun wSManCloseCommand(commandhandle: WsmanCommandHandle, flags: UInt, async: ConstPtr<WsmanShellAsync>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotemanagementWSManCloseCommand")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemRemotemanagementWSManCloseOperation")
private external fun wasiWindowssysWindowsWin32SystemRemotemanagementWSManCloseOperation(operationhandle: Long, flags: Int): Int

public actual fun wSManCloseOperation(operationhandle: WsmanOperationHandle, flags: UInt): UInt =
    wasiWindowssysWindowsWin32SystemRemotemanagementWSManCloseOperation(operationhandle, flags.toInt()).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemRemotemanagementWSManCloseSession")
private external fun wasiWindowssysWindowsWin32SystemRemotemanagementWSManCloseSession(session: Long, flags: Int): Int

public actual fun wSManCloseSession(session: WsmanSessionHandle, flags: UInt): UInt =
    wasiWindowssysWindowsWin32SystemRemotemanagementWSManCloseSession(session, flags.toInt()).toUInt()

public actual fun wSManCloseShell(shellhandle: WsmanShellHandle, flags: UInt, async: ConstPtr<WsmanShellAsync>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotemanagementWSManCloseShell")

public actual fun wSManConnectShell(session: WsmanSessionHandle, flags: UInt, resourceuri: Pcwstr, shellid: Pcwstr, options: ConstPtr<WsmanOptionSet>, connectxml: ConstPtr<WsmanData>, async: ConstPtr<WsmanShellAsync>, shell: MutPtr<WsmanShellHandle>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotemanagementWSManConnectShell")

public actual fun wSManConnectShellCommand(shell: WsmanShellHandle, flags: UInt, commandid: Pcwstr, options: ConstPtr<WsmanOptionSet>, connectxml: ConstPtr<WsmanData>, async: ConstPtr<WsmanShellAsync>, command: MutPtr<WsmanCommandHandle>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotemanagementWSManConnectShellCommand")

public actual fun wSManCreateSession(apihandle: WsmanApiHandle, connection: Pcwstr, flags: UInt, serverauthenticationcredentials: ConstPtr<WsmanAuthenticationCredentials>, proxyinfo: ConstPtr<WsmanProxyInfo>, session: MutPtr<WsmanSessionHandle>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotemanagementWSManCreateSession")

public actual fun wSManCreateShell(session: WsmanSessionHandle, flags: UInt, resourceuri: Pcwstr, startupinfo: ConstPtr<WsmanShellStartupInfoV11>, options: ConstPtr<WsmanOptionSet>, createxml: ConstPtr<WsmanData>, async: ConstPtr<WsmanShellAsync>, shell: MutPtr<WsmanShellHandle>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotemanagementWSManCreateShell")

public actual fun wSManCreateShellEx(session: WsmanSessionHandle, flags: UInt, resourceuri: Pcwstr, shellid: Pcwstr, startupinfo: ConstPtr<WsmanShellStartupInfoV11>, options: ConstPtr<WsmanOptionSet>, createxml: ConstPtr<WsmanData>, async: ConstPtr<WsmanShellAsync>, shell: MutPtr<WsmanShellHandle>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotemanagementWSManCreateShellEx")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemRemotemanagementWSManDeinitialize")
private external fun wasiWindowssysWindowsWin32SystemRemotemanagementWSManDeinitialize(apihandle: Long, flags: Int): Int

public actual fun wSManDeinitialize(apihandle: WsmanApiHandle, flags: UInt): UInt =
    wasiWindowssysWindowsWin32SystemRemotemanagementWSManDeinitialize(apihandle, flags.toInt()).toUInt()

public actual fun wSManDisconnectShell(shell: WsmanShellHandle, flags: UInt, disconnectinfo: ConstPtr<WsmanShellDisconnectInfo>, async: ConstPtr<WsmanShellAsync>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotemanagementWSManDisconnectShell")

public actual fun wSManGetErrorMessage(apihandle: WsmanApiHandle, flags: UInt, languagecode: Pcwstr, errorcode: UInt, messagelength: UInt, message: Pwstr, messagelengthused: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotemanagementWSManGetErrorMessage")

public actual fun wSManGetSessionOptionAsDword(session: WsmanSessionHandle, option: WSManSessionOption, value: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotemanagementWSManGetSessionOptionAsDword")

public actual fun wSManGetSessionOptionAsString(session: WsmanSessionHandle, option: WSManSessionOption, stringlength: UInt, string: Pwstr, stringlengthused: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotemanagementWSManGetSessionOptionAsString")

public actual fun wSManInitialize(flags: UInt, apihandle: MutPtr<WsmanApiHandle>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotemanagementWSManInitialize")

public actual fun wSManPluginAuthzOperationComplete(senderdetails: ConstPtr<WsmanSenderDetails>, flags: UInt, userauthorizationcontext: ConstPtr<CVoid>, errorcode: UInt, extendederrorinformation: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotemanagementWSManPluginAuthzOperationComplete")

public actual fun wSManPluginAuthzQueryQuotaComplete(senderdetails: ConstPtr<WsmanSenderDetails>, flags: UInt, quota: ConstPtr<WsmanAuthzQuota>, errorcode: UInt, extendederrorinformation: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotemanagementWSManPluginAuthzQueryQuotaComplete")

public actual fun wSManPluginAuthzUserComplete(senderdetails: ConstPtr<WsmanSenderDetails>, flags: UInt, userauthorizationcontext: ConstPtr<CVoid>, impersonationtoken: Handle, userisadministrator: Bool, errorcode: UInt, extendederrorinformation: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotemanagementWSManPluginAuthzUserComplete")

public actual fun wSManPluginFreeRequestDetails(requestdetails: ConstPtr<WsmanPluginRequest>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotemanagementWSManPluginFreeRequestDetails")

public actual fun wSManPluginGetConfiguration(plugincontext: ConstPtr<CVoid>, flags: UInt, data: MutPtr<WsmanData>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotemanagementWSManPluginGetConfiguration")

public actual fun wSManPluginGetOperationParameters(requestdetails: ConstPtr<WsmanPluginRequest>, flags: UInt, data: MutPtr<WsmanData>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotemanagementWSManPluginGetOperationParameters")

public actual fun wSManPluginOperationComplete(requestdetails: ConstPtr<WsmanPluginRequest>, flags: UInt, errorcode: UInt, extendedinformation: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotemanagementWSManPluginOperationComplete")

public actual fun wSManPluginReceiveResult(requestdetails: ConstPtr<WsmanPluginRequest>, flags: UInt, stream: Pcwstr, streamresult: ConstPtr<WsmanData>, commandstate: Pcwstr, exitcode: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotemanagementWSManPluginReceiveResult")

public actual fun wSManPluginReportCompletion(plugincontext: ConstPtr<CVoid>, flags: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotemanagementWSManPluginReportCompletion")

public actual fun wSManPluginReportContext(requestdetails: ConstPtr<WsmanPluginRequest>, flags: UInt, context: ConstPtr<CVoid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotemanagementWSManPluginReportContext")

public actual fun wSManReceiveShellOutput(shell: WsmanShellHandle, command: WsmanCommandHandle, flags: UInt, desiredstreamset: ConstPtr<WsmanStreamIdSet>, async: ConstPtr<WsmanShellAsync>, receiveoperation: MutPtr<WsmanOperationHandle>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotemanagementWSManReceiveShellOutput")

public actual fun wSManReconnectShell(shell: WsmanShellHandle, flags: UInt, async: ConstPtr<WsmanShellAsync>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotemanagementWSManReconnectShell")

public actual fun wSManReconnectShellCommand(commandhandle: WsmanCommandHandle, flags: UInt, async: ConstPtr<WsmanShellAsync>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotemanagementWSManReconnectShellCommand")

public actual fun wSManRunShellCommand(shell: WsmanShellHandle, flags: UInt, commandline: Pcwstr, args: ConstPtr<WsmanCommandArgSet>, options: ConstPtr<WsmanOptionSet>, async: ConstPtr<WsmanShellAsync>, command: MutPtr<WsmanCommandHandle>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotemanagementWSManRunShellCommand")

public actual fun wSManRunShellCommandEx(shell: WsmanShellHandle, flags: UInt, commandid: Pcwstr, commandline: Pcwstr, args: ConstPtr<WsmanCommandArgSet>, options: ConstPtr<WsmanOptionSet>, async: ConstPtr<WsmanShellAsync>, command: MutPtr<WsmanCommandHandle>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotemanagementWSManRunShellCommandEx")

public actual fun wSManSendShellInput(shell: WsmanShellHandle, command: WsmanCommandHandle, flags: UInt, streamid: Pcwstr, streamdata: ConstPtr<WsmanData>, endofstream: Bool, async: ConstPtr<WsmanShellAsync>, sendoperation: MutPtr<WsmanOperationHandle>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotemanagementWSManSendShellInput")

public actual fun wSManSetSessionOption(session: WsmanSessionHandle, option: WSManSessionOption, data: ConstPtr<WsmanData>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotemanagementWSManSetSessionOption")

public actual fun wSManSignalShell(shell: WsmanShellHandle, command: WsmanCommandHandle, flags: UInt, code: Pcwstr, async: ConstPtr<WsmanShellAsync>, signaloperation: MutPtr<WsmanOperationHandle>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotemanagementWSManSignalShell")
