@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.networkdiagnosticsframework

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.Socket
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.SocketAddressList
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.networkdiagnosticsframework.cinterop.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCancelIncident
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.networkdiagnosticsframework.cinterop.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCloseIncident
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.networkdiagnosticsframework.cinterop.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateConnectivityIncident
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.networkdiagnosticsframework.cinterop.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateDNSIncident
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.networkdiagnosticsframework.cinterop.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateGroupingIncident
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.networkdiagnosticsframework.cinterop.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateIncident
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.networkdiagnosticsframework.cinterop.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreatePnrpIncident
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.networkdiagnosticsframework.cinterop.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateSharingIncident
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.networkdiagnosticsframework.cinterop.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateWebIncident
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.networkdiagnosticsframework.cinterop.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateWebIncidentEx
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.networkdiagnosticsframework.cinterop.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateWinSockIncident
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.networkdiagnosticsframework.cinterop.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfDiagnoseIncident
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.networkdiagnosticsframework.cinterop.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfExecuteDiagnosis
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.networkdiagnosticsframework.cinterop.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfGetTraceFile
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.networkdiagnosticsframework.cinterop.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfRepairIncident
import io.github.kotlinmania.windowssys.windows.win32.security.Sid
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun ndfCancelIncident(handle: ConstPtr<CVoid>): Hresult =
    windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCancelIncident(handle.rawAddress.toCPointer<ByteVar>())

public actual fun ndfCloseIncident(handle: MutPtr<CVoid>): Hresult =
    windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCloseIncident(handle.rawAddress.toCPointer<ByteVar>())

public actual fun ndfCreateConnectivityIncident(handle: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateConnectivityIncident(handle.rawAddress.toCPointer<ByteVar>())

public actual fun ndfCreateDNSIncident(hostname: Pcwstr, querytype: UShort, handle: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateDNSIncident(hostname.rawAddress.toCPointer<ByteVar>(), querytype, handle.rawAddress.toCPointer<ByteVar>())

public actual fun ndfCreateGroupingIncident(cloudname: Pcwstr, groupname: Pcwstr, identity: Pcwstr, invitation: Pcwstr, addresses: ConstPtr<SocketAddressList>, appid: Pcwstr, handle: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateGroupingIncident(cloudname.rawAddress.toCPointer<ByteVar>(), groupname.rawAddress.toCPointer<ByteVar>(), identity.rawAddress.toCPointer<ByteVar>(), invitation.rawAddress.toCPointer<ByteVar>(), addresses.rawAddress.toCPointer<ByteVar>(), appid.rawAddress.toCPointer<ByteVar>(), handle.rawAddress.toCPointer<ByteVar>())

public actual fun ndfCreateIncident(helperclassname: Pcwstr, celt: UInt, attributes: ConstPtr<HelperAttribute>, handle: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateIncident(helperclassname.rawAddress.toCPointer<ByteVar>(), celt, attributes.rawAddress.toCPointer<ByteVar>(), handle.rawAddress.toCPointer<ByteVar>())

public actual fun ndfCreateNetConnectionIncident(handle: MutPtr<MutPtr<CVoid>>, id: Guid): Hresult =
    0

public actual fun ndfCreatePnrpIncident(cloudname: Pcwstr, peername: Pcwstr, diagnosepublish: Bool, appid: Pcwstr, handle: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreatePnrpIncident(cloudname.rawAddress.toCPointer<ByteVar>(), peername.rawAddress.toCPointer<ByteVar>(), diagnosepublish, appid.rawAddress.toCPointer<ByteVar>(), handle.rawAddress.toCPointer<ByteVar>())

public actual fun ndfCreateSharingIncident(uncpath: Pcwstr, handle: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateSharingIncident(uncpath.rawAddress.toCPointer<ByteVar>(), handle.rawAddress.toCPointer<ByteVar>())

public actual fun ndfCreateWebIncident(url: Pcwstr, handle: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateWebIncident(url.rawAddress.toCPointer<ByteVar>(), handle.rawAddress.toCPointer<ByteVar>())

public actual fun ndfCreateWebIncidentEx(url: Pcwstr, usewinhttp: Bool, modulename: Pcwstr, handle: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateWebIncidentEx(url.rawAddress.toCPointer<ByteVar>(), usewinhttp, modulename.rawAddress.toCPointer<ByteVar>(), handle.rawAddress.toCPointer<ByteVar>())

public actual fun ndfCreateWinSockIncident(sock: Socket, host: Pcwstr, port: UShort, appid: Pcwstr, userid: ConstPtr<Sid>, handle: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateWinSockIncident(sock, host.rawAddress.toCPointer<ByteVar>(), port, appid.rawAddress.toCPointer<ByteVar>(), userid.rawAddress.toCPointer<ByteVar>(), handle.rawAddress.toCPointer<ByteVar>())

public actual fun ndfDiagnoseIncident(handle: ConstPtr<CVoid>, rootcausecount: MutPtr<UInt>, rootcauses: MutPtr<MutPtr<RootCauseInfo>>, dwwait: UInt, dwflags: UInt): Hresult =
    windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfDiagnoseIncident(handle.rawAddress.toCPointer<ByteVar>(), rootcausecount.rawAddress.toCPointer<ByteVar>(), rootcauses.rawAddress.toCPointer<ByteVar>(), dwwait, dwflags)

public actual fun ndfExecuteDiagnosis(handle: ConstPtr<CVoid>, hwnd: Hwnd): Hresult =
    windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfExecuteDiagnosis(handle.rawAddress.toCPointer<ByteVar>(), hwnd.rawAddress.toCPointer<ByteVar>())

public actual fun ndfGetTraceFile(handle: ConstPtr<CVoid>, tracefilelocation: MutPtr<Pcwstr>): Hresult =
    windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfGetTraceFile(handle.rawAddress.toCPointer<ByteVar>(), tracefilelocation.rawAddress.toCPointer<ByteVar>())

public actual fun ndfRepairIncident(handle: ConstPtr<CVoid>, repairex: ConstPtr<RepairInfoEx>, dwwait: UInt): Hresult =
    windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfRepairIncident(handle.rawAddress.toCPointer<ByteVar>(), repairex.rawAddress.toCPointer<ByteVar>(), dwwait)
