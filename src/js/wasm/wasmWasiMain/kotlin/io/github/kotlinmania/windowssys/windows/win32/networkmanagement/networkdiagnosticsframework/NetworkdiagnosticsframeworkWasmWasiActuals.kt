@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.networkdiagnosticsframework

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.Socket

public actual fun ndfCancelIncident(handle: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndfCloseIncident(handle: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndfCreateConnectivityIncident(handle: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndfCreateDNSIncident(hostname: Pcwstr, querytype: UShort, handle: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndfCreateGroupingIncident(cloudname: Pcwstr, groupname: Pcwstr, identity: Pcwstr, invitation: Pcwstr, addresses: COpaquePointer?, appid: Pcwstr, handle: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndfCreateIncident(helperclassname: Pcwstr, celt: UInt, attributes: COpaquePointer?, handle: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndfCreateNetConnectionIncident(handle: COpaquePointer?, id: Guid): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndfCreatePnrpIncident(cloudname: Pcwstr, peername: Pcwstr, diagnosepublish: Bool, appid: Pcwstr, handle: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndfCreateSharingIncident(uncpath: Pcwstr, handle: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndfCreateWebIncident(url: Pcwstr, handle: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndfCreateWebIncidentEx(url: Pcwstr, usewinhttp: Bool, modulename: Pcwstr, handle: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndfCreateWinSockIncident(sock: Socket, host: Pcwstr, port: UShort, appid: Pcwstr, userid: COpaquePointer?, handle: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndfDiagnoseIncident(handle: COpaquePointer?, rootcausecount: COpaquePointer?, rootcauses: COpaquePointer?, dwwait: UInt, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndfExecuteDiagnosis(handle: COpaquePointer?, hwnd: Hwnd): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndfGetTraceFile(handle: COpaquePointer?, tracefilelocation: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ndfRepairIncident(handle: COpaquePointer?, repairex: COpaquePointer?, dwwait: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
