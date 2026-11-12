@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.networkdiagnosticsframework

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.Socket

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun ndfCancelIncident(handle: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCancelIncident")

public actual fun ndfCloseIncident(handle: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCloseIncident")

public actual fun ndfCreateConnectivityIncident(handle: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateConnectivityIncident")

public actual fun ndfCreateDNSIncident(hostname: Pcwstr, querytype: UShort, handle: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateDNSIncident")

public actual fun ndfCreateGroupingIncident(cloudname: Pcwstr, groupname: Pcwstr, identity: Pcwstr, invitation: Pcwstr, addresses: ConstPtr, appid: Pcwstr, handle: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateGroupingIncident")

public actual fun ndfCreateIncident(helperclassname: Pcwstr, celt: UInt, attributes: ConstPtr, handle: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateIncident")

public actual fun ndfCreateNetConnectionIncident(handle: MutPtr, id: Guid): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateNetConnectionIncident")

public actual fun ndfCreatePnrpIncident(cloudname: Pcwstr, peername: Pcwstr, diagnosepublish: Bool, appid: Pcwstr, handle: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreatePnrpIncident")

public actual fun ndfCreateSharingIncident(uncpath: Pcwstr, handle: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateSharingIncident")

public actual fun ndfCreateWebIncident(url: Pcwstr, handle: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateWebIncident")

public actual fun ndfCreateWebIncidentEx(url: Pcwstr, usewinhttp: Bool, modulename: Pcwstr, handle: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateWebIncidentEx")

public actual fun ndfCreateWinSockIncident(sock: Socket, host: Pcwstr, port: UShort, appid: Pcwstr, userid: ConstPtr, handle: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateWinSockIncident")

public actual fun ndfDiagnoseIncident(handle: ConstPtr, rootcausecount: MutPtr, rootcauses: MutPtr, dwwait: UInt, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfDiagnoseIncident")

public actual fun ndfExecuteDiagnosis(handle: ConstPtr, hwnd: Hwnd): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfExecuteDiagnosis")

public actual fun ndfGetTraceFile(handle: ConstPtr, tracefilelocation: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfGetTraceFile")

public actual fun ndfRepairIncident(handle: ConstPtr, repairex: ConstPtr, dwwait: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfRepairIncident")
