package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.networkdiagnosticsframework

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.SOCKET

public expect fun NdfCancelIncident(handle: Long): HRESULT

public expect fun NdfCloseIncident(handle: Long): HRESULT

public expect fun NdfCreateConnectivityIncident(handle: Long): HRESULT

public expect fun NdfCreateDNSIncident(hostname: PCWSTR, querytype: UShort, handle: Long): HRESULT

public expect fun NdfCreateGroupingIncident(cloudname: PCWSTR, groupname: PCWSTR, identity: PCWSTR, invitation: PCWSTR, addresses: Long, appid: PCWSTR, handle: Long): HRESULT

public expect fun NdfCreateIncident(helperclassname: PCWSTR, celt: UInt, attributes: Long, handle: Long): HRESULT

public expect fun NdfCreateNetConnectionIncident(handle: Long, id: GUID): HRESULT

public expect fun NdfCreatePnrpIncident(cloudname: PCWSTR, peername: PCWSTR, diagnosepublish: BOOL, appid: PCWSTR, handle: Long): HRESULT

public expect fun NdfCreateSharingIncident(uncpath: PCWSTR, handle: Long): HRESULT

public expect fun NdfCreateWebIncident(url: PCWSTR, handle: Long): HRESULT

public expect fun NdfCreateWebIncidentEx(url: PCWSTR, usewinhttp: BOOL, modulename: PCWSTR, handle: Long): HRESULT

public expect fun NdfCreateWinSockIncident(sock: SOCKET, host: PCWSTR, port: UShort, appid: PCWSTR, userid: Long, handle: Long): HRESULT

public expect fun NdfDiagnoseIncident(handle: Long, rootcausecount: Long, rootcauses: Long, dwwait: UInt, dwflags: UInt): HRESULT

public expect fun NdfExecuteDiagnosis(handle: Long, hwnd: HWND): HRESULT

public expect fun NdfGetTraceFile(handle: Long, tracefilelocation: Long): HRESULT

public expect fun NdfRepairIncident(handle: Long, repairex: Long, dwwait: UInt): HRESULT
