@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.networkdiagnosticsframework

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.Socket
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun ndfCancelIncident(handle: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.networkdiagnosticsframework.cinterop.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfCancelIncident(handle?.value?.toCPointer<ByteVar>())

public actual fun ndfCloseIncident(handle: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.networkdiagnosticsframework.cinterop.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfCloseIncident(handle?.value?.toCPointer<ByteVar>())

public actual fun ndfCreateConnectivityIncident(handle: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.networkdiagnosticsframework.cinterop.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfCreateConnectivityIncident(handle?.value?.toCPointer<ByteVar>())

public actual fun ndfCreateDNSIncident(hostname: Pcwstr, querytype: UShort, handle: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.networkdiagnosticsframework.cinterop.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfCreateDNSIncident(hostname?.value?.toCPointer<ByteVar>(), querytype, handle?.value?.toCPointer<ByteVar>())

public actual fun ndfCreateGroupingIncident(cloudname: Pcwstr, groupname: Pcwstr, identity: Pcwstr, invitation: Pcwstr, addresses: COpaquePointer?, appid: Pcwstr, handle: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.networkdiagnosticsframework.cinterop.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfCreateGroupingIncident(cloudname?.value?.toCPointer<ByteVar>(), groupname?.value?.toCPointer<ByteVar>(), identity?.value?.toCPointer<ByteVar>(), invitation?.value?.toCPointer<ByteVar>(), addresses?.value?.toCPointer<ByteVar>(), appid?.value?.toCPointer<ByteVar>(), handle?.value?.toCPointer<ByteVar>())

public actual fun ndfCreateIncident(helperclassname: Pcwstr, celt: UInt, attributes: COpaquePointer?, handle: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.networkdiagnosticsframework.cinterop.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfCreateIncident(helperclassname?.value?.toCPointer<ByteVar>(), celt, attributes?.value?.toCPointer<ByteVar>(), handle?.value?.toCPointer<ByteVar>())

public actual fun ndfCreateNetConnectionIncident(handle: COpaquePointer?, id: Guid): Hresult =
    0

public actual fun ndfCreatePnrpIncident(cloudname: Pcwstr, peername: Pcwstr, diagnosepublish: Bool, appid: Pcwstr, handle: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.networkdiagnosticsframework.cinterop.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfCreatePnrpIncident(cloudname?.value?.toCPointer<ByteVar>(), peername?.value?.toCPointer<ByteVar>(), diagnosepublish, appid?.value?.toCPointer<ByteVar>(), handle?.value?.toCPointer<ByteVar>())

public actual fun ndfCreateSharingIncident(uncpath: Pcwstr, handle: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.networkdiagnosticsframework.cinterop.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfCreateSharingIncident(uncpath?.value?.toCPointer<ByteVar>(), handle?.value?.toCPointer<ByteVar>())

public actual fun ndfCreateWebIncident(url: Pcwstr, handle: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.networkdiagnosticsframework.cinterop.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfCreateWebIncident(url?.value?.toCPointer<ByteVar>(), handle?.value?.toCPointer<ByteVar>())

public actual fun ndfCreateWebIncidentEx(url: Pcwstr, usewinhttp: Bool, modulename: Pcwstr, handle: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.networkdiagnosticsframework.cinterop.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfCreateWebIncidentEx(url?.value?.toCPointer<ByteVar>(), usewinhttp, modulename?.value?.toCPointer<ByteVar>(), handle?.value?.toCPointer<ByteVar>())

public actual fun ndfCreateWinSockIncident(sock: Socket, host: Pcwstr, port: UShort, appid: Pcwstr, userid: COpaquePointer?, handle: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.networkdiagnosticsframework.cinterop.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfCreateWinSockIncident(sock, host?.value?.toCPointer<ByteVar>(), port, appid?.value?.toCPointer<ByteVar>(), userid?.value?.toCPointer<ByteVar>(), handle?.value?.toCPointer<ByteVar>())

public actual fun ndfDiagnoseIncident(handle: COpaquePointer?, rootcausecount: COpaquePointer?, rootcauses: COpaquePointer?, dwwait: UInt, dwflags: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.networkdiagnosticsframework.cinterop.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfDiagnoseIncident(handle?.value?.toCPointer<ByteVar>(), rootcausecount?.value?.toCPointer<ByteVar>(), rootcauses?.value?.toCPointer<ByteVar>(), dwwait, dwflags)

public actual fun ndfExecuteDiagnosis(handle: COpaquePointer?, hwnd: Hwnd): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.networkdiagnosticsframework.cinterop.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfExecuteDiagnosis(handle?.value?.toCPointer<ByteVar>(), hwnd?.value?.toCPointer<ByteVar>())

public actual fun ndfGetTraceFile(handle: COpaquePointer?, tracefilelocation: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.networkdiagnosticsframework.cinterop.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfGetTraceFile(handle?.value?.toCPointer<ByteVar>(), tracefilelocation?.value?.toCPointer<ByteVar>())

public actual fun ndfRepairIncident(handle: COpaquePointer?, repairex: COpaquePointer?, dwwait: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.networkdiagnosticsframework.cinterop.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfRepairIncident(handle?.value?.toCPointer<ByteVar>(), repairex?.value?.toCPointer<ByteVar>(), dwwait)
