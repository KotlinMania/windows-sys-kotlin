@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.networkdiagnosticsframework

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.SOCKET
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun NdfCancelIncident(handle: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.networkdiagnosticsframework.cinterop.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfCancelIncident(handle.toCPointer<ByteVar>())

public actual fun NdfCloseIncident(handle: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.networkdiagnosticsframework.cinterop.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfCloseIncident(handle.toCPointer<ByteVar>())

public actual fun NdfCreateConnectivityIncident(handle: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.networkdiagnosticsframework.cinterop.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfCreateConnectivityIncident(handle.toCPointer<ByteVar>())

public actual fun NdfCreateDNSIncident(hostname: PCWSTR, querytype: UShort, handle: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.networkdiagnosticsframework.cinterop.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfCreateDNSIncident(hostname.toCPointer<ByteVar>(), querytype, handle.toCPointer<ByteVar>())

public actual fun NdfCreateGroupingIncident(cloudname: PCWSTR, groupname: PCWSTR, identity: PCWSTR, invitation: PCWSTR, addresses: Long, appid: PCWSTR, handle: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.networkdiagnosticsframework.cinterop.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfCreateGroupingIncident(cloudname.toCPointer<ByteVar>(), groupname.toCPointer<ByteVar>(), identity.toCPointer<ByteVar>(), invitation.toCPointer<ByteVar>(), addresses.toCPointer<ByteVar>(), appid.toCPointer<ByteVar>(), handle.toCPointer<ByteVar>())

public actual fun NdfCreateIncident(helperclassname: PCWSTR, celt: UInt, attributes: Long, handle: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.networkdiagnosticsframework.cinterop.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfCreateIncident(helperclassname.toCPointer<ByteVar>(), celt, attributes.toCPointer<ByteVar>(), handle.toCPointer<ByteVar>())

public actual fun NdfCreateNetConnectionIncident(handle: Long, id: GUID): HRESULT =
    0

public actual fun NdfCreatePnrpIncident(cloudname: PCWSTR, peername: PCWSTR, diagnosepublish: BOOL, appid: PCWSTR, handle: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.networkdiagnosticsframework.cinterop.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfCreatePnrpIncident(cloudname.toCPointer<ByteVar>(), peername.toCPointer<ByteVar>(), diagnosepublish, appid.toCPointer<ByteVar>(), handle.toCPointer<ByteVar>())

public actual fun NdfCreateSharingIncident(uncpath: PCWSTR, handle: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.networkdiagnosticsframework.cinterop.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfCreateSharingIncident(uncpath.toCPointer<ByteVar>(), handle.toCPointer<ByteVar>())

public actual fun NdfCreateWebIncident(url: PCWSTR, handle: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.networkdiagnosticsframework.cinterop.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfCreateWebIncident(url.toCPointer<ByteVar>(), handle.toCPointer<ByteVar>())

public actual fun NdfCreateWebIncidentEx(url: PCWSTR, usewinhttp: BOOL, modulename: PCWSTR, handle: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.networkdiagnosticsframework.cinterop.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfCreateWebIncidentEx(url.toCPointer<ByteVar>(), usewinhttp, modulename.toCPointer<ByteVar>(), handle.toCPointer<ByteVar>())

public actual fun NdfCreateWinSockIncident(sock: SOCKET, host: PCWSTR, port: UShort, appid: PCWSTR, userid: Long, handle: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.networkdiagnosticsframework.cinterop.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfCreateWinSockIncident(sock, host.toCPointer<ByteVar>(), port, appid.toCPointer<ByteVar>(), userid.toCPointer<ByteVar>(), handle.toCPointer<ByteVar>())

public actual fun NdfDiagnoseIncident(handle: Long, rootcausecount: Long, rootcauses: Long, dwwait: UInt, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.networkdiagnosticsframework.cinterop.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfDiagnoseIncident(handle.toCPointer<ByteVar>(), rootcausecount.toCPointer<ByteVar>(), rootcauses.toCPointer<ByteVar>(), dwwait, dwflags)

public actual fun NdfExecuteDiagnosis(handle: Long, hwnd: HWND): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.networkdiagnosticsframework.cinterop.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfExecuteDiagnosis(handle.toCPointer<ByteVar>(), hwnd.toCPointer<ByteVar>())

public actual fun NdfGetTraceFile(handle: Long, tracefilelocation: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.networkdiagnosticsframework.cinterop.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfGetTraceFile(handle.toCPointer<ByteVar>(), tracefilelocation.toCPointer<ByteVar>())

public actual fun NdfRepairIncident(handle: Long, repairex: Long, dwwait: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.networkdiagnosticsframework.cinterop.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfRepairIncident(handle.toCPointer<ByteVar>(), repairex.toCPointer<ByteVar>(), dwwait)
