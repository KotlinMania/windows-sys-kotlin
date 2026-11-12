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
import io.github.kotlinmania.windowssys.windows.win32.security.Sid

public expect fun ndfCancelIncident(handle: ConstPtr<CVoid>): Hresult

public expect fun ndfCloseIncident(handle: MutPtr<CVoid>): Hresult

public expect fun ndfCreateConnectivityIncident(handle: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun ndfCreateDNSIncident(hostname: Pcwstr, querytype: UShort, handle: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun ndfCreateGroupingIncident(cloudname: Pcwstr, groupname: Pcwstr, identity: Pcwstr, invitation: Pcwstr, addresses: ConstPtr<SocketAddressList>, appid: Pcwstr, handle: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun ndfCreateIncident(helperclassname: Pcwstr, celt: UInt, attributes: ConstPtr<HelperAttribute>, handle: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun ndfCreateNetConnectionIncident(handle: MutPtr<MutPtr<CVoid>>, id: Guid): Hresult

public expect fun ndfCreatePnrpIncident(cloudname: Pcwstr, peername: Pcwstr, diagnosepublish: Bool, appid: Pcwstr, handle: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun ndfCreateSharingIncident(uncpath: Pcwstr, handle: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun ndfCreateWebIncident(url: Pcwstr, handle: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun ndfCreateWebIncidentEx(url: Pcwstr, usewinhttp: Bool, modulename: Pcwstr, handle: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun ndfCreateWinSockIncident(sock: Socket, host: Pcwstr, port: UShort, appid: Pcwstr, userid: ConstPtr<Sid>, handle: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun ndfDiagnoseIncident(handle: ConstPtr<CVoid>, rootcausecount: MutPtr<UInt>, rootcauses: MutPtr<MutPtr<RootCauseInfo>>, dwwait: UInt, dwflags: UInt): Hresult

public expect fun ndfExecuteDiagnosis(handle: ConstPtr<CVoid>, hwnd: Hwnd): Hresult

public expect fun ndfGetTraceFile(handle: ConstPtr<CVoid>, tracefilelocation: MutPtr<Pcwstr>): Hresult

public expect fun ndfRepairIncident(handle: ConstPtr<CVoid>, repairex: ConstPtr<RepairInfoEx>, dwwait: UInt): Hresult
