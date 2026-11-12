package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.networkdiagnosticsframework

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.Socket

public expect fun ndfCancelIncident(handle: ConstPtr): Hresult

public expect fun ndfCloseIncident(handle: MutPtr): Hresult

public expect fun ndfCreateConnectivityIncident(handle: MutPtr): Hresult

public expect fun ndfCreateDNSIncident(hostname: Pcwstr, querytype: UShort, handle: MutPtr): Hresult

public expect fun ndfCreateGroupingIncident(cloudname: Pcwstr, groupname: Pcwstr, identity: Pcwstr, invitation: Pcwstr, addresses: ConstPtr, appid: Pcwstr, handle: MutPtr): Hresult

public expect fun ndfCreateIncident(helperclassname: Pcwstr, celt: UInt, attributes: ConstPtr, handle: MutPtr): Hresult

public expect fun ndfCreateNetConnectionIncident(handle: MutPtr, id: Guid): Hresult

public expect fun ndfCreatePnrpIncident(cloudname: Pcwstr, peername: Pcwstr, diagnosepublish: Bool, appid: Pcwstr, handle: MutPtr): Hresult

public expect fun ndfCreateSharingIncident(uncpath: Pcwstr, handle: MutPtr): Hresult

public expect fun ndfCreateWebIncident(url: Pcwstr, handle: MutPtr): Hresult

public expect fun ndfCreateWebIncidentEx(url: Pcwstr, usewinhttp: Bool, modulename: Pcwstr, handle: MutPtr): Hresult

public expect fun ndfCreateWinSockIncident(sock: Socket, host: Pcwstr, port: UShort, appid: Pcwstr, userid: ConstPtr, handle: MutPtr): Hresult

public expect fun ndfDiagnoseIncident(handle: ConstPtr, rootcausecount: MutPtr, rootcauses: MutPtr, dwwait: UInt, dwflags: UInt): Hresult

public expect fun ndfExecuteDiagnosis(handle: ConstPtr, hwnd: Hwnd): Hresult

public expect fun ndfGetTraceFile(handle: ConstPtr, tracefilelocation: MutPtr): Hresult

public expect fun ndfRepairIncident(handle: ConstPtr, repairex: ConstPtr, dwwait: UInt): Hresult
