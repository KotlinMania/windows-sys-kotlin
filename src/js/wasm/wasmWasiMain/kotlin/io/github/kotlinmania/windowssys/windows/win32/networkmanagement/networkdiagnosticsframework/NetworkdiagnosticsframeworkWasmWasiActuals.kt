@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.networkdiagnosticsframework

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.SOCKET

public actual fun NdfCancelIncident(handle: Long): HRESULT =
    0

public actual fun NdfCloseIncident(handle: Long): HRESULT =
    0

public actual fun NdfCreateConnectivityIncident(handle: Long): HRESULT =
    0

public actual fun NdfCreateDNSIncident(hostname: PCWSTR, querytype: UShort, handle: Long): HRESULT =
    0

public actual fun NdfCreateGroupingIncident(cloudname: PCWSTR, groupname: PCWSTR, identity: PCWSTR, invitation: PCWSTR, addresses: Long, appid: PCWSTR, handle: Long): HRESULT =
    0

public actual fun NdfCreateIncident(helperclassname: PCWSTR, celt: UInt, attributes: Long, handle: Long): HRESULT =
    0

public actual fun NdfCreateNetConnectionIncident(handle: Long, id: GUID): HRESULT =
    0

public actual fun NdfCreatePnrpIncident(cloudname: PCWSTR, peername: PCWSTR, diagnosepublish: BOOL, appid: PCWSTR, handle: Long): HRESULT =
    0

public actual fun NdfCreateSharingIncident(uncpath: PCWSTR, handle: Long): HRESULT =
    0

public actual fun NdfCreateWebIncident(url: PCWSTR, handle: Long): HRESULT =
    0

public actual fun NdfCreateWebIncidentEx(url: PCWSTR, usewinhttp: BOOL, modulename: PCWSTR, handle: Long): HRESULT =
    0

public actual fun NdfCreateWinSockIncident(sock: SOCKET, host: PCWSTR, port: UShort, appid: PCWSTR, userid: Long, handle: Long): HRESULT =
    0

public actual fun NdfDiagnoseIncident(handle: Long, rootcausecount: Long, rootcauses: Long, dwwait: UInt, dwflags: UInt): HRESULT =
    0

public actual fun NdfExecuteDiagnosis(handle: Long, hwnd: HWND): HRESULT =
    0

public actual fun NdfGetTraceFile(handle: Long, tracefilelocation: Long): HRESULT =
    0

public actual fun NdfRepairIncident(handle: Long, repairex: Long, dwwait: UInt): HRESULT =
    0
