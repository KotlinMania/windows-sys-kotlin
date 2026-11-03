package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.networkdiagnosticsframework

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR

public fun NdfCancelIncident(handle: Long): HRESULT {
    return Win32DynamicFfi.invoke("ndfapi.dll", "NdfCancelIncident", longArrayOf(handle)).toInt()
}

public fun NdfCloseIncident(handle: Long): HRESULT {
    return Win32DynamicFfi.invoke("ndfapi.dll", "NdfCloseIncident", longArrayOf(handle)).toInt()
}

public fun NdfCreateConnectivityIncident(handle: Long): HRESULT {
    return Win32DynamicFfi.invoke("ndfapi.dll", "NdfCreateConnectivityIncident", longArrayOf(handle)).toInt()
}

public fun NdfCreateDNSIncident(hostname: PCWSTR, querytype: UShort, handle: Long): HRESULT {
    return Win32DynamicFfi.invoke("ndfapi.dll", "NdfCreateDNSIncident", longArrayOf(hostname, querytype.toLong(), handle)).toInt()
}

public fun NdfCreateGroupingIncident(cloudname: PCWSTR, groupname: PCWSTR, identity: PCWSTR, invitation: PCWSTR, addresses: Long, appid: PCWSTR, handle: Long): HRESULT {
    return Win32DynamicFfi.invoke("ndfapi.dll", "NdfCreateGroupingIncident", longArrayOf(cloudname, groupname, identity, invitation, addresses, appid, handle)).toInt()
}

public fun NdfCreateIncident(helperclassname: PCWSTR, celt: UInt, attributes: Long, handle: Long): HRESULT {
    return Win32DynamicFfi.invoke("ndfapi.dll", "NdfCreateIncident", longArrayOf(helperclassname, celt.toLong(), attributes, handle)).toInt()
}

public fun NdfCreateNetConnectionIncident(handle: Long, id: GUID): HRESULT {
    return Win32DynamicFfi.invoke("ndfapi.dll", "NdfCreateNetConnectionIncident", longArrayOf(handle, Win32DynamicFfi.guidSlot(id.data1, id.data2, id.data3, id.data4))).toInt()
}

public fun NdfCreatePnrpIncident(cloudname: PCWSTR, peername: PCWSTR, diagnosepublish: BOOL, appid: PCWSTR, handle: Long): HRESULT {
    return Win32DynamicFfi.invoke("ndfapi.dll", "NdfCreatePnrpIncident", longArrayOf(cloudname, peername, diagnosepublish.toLong(), appid, handle)).toInt()
}

public fun NdfCreateSharingIncident(uncpath: PCWSTR, handle: Long): HRESULT {
    return Win32DynamicFfi.invoke("ndfapi.dll", "NdfCreateSharingIncident", longArrayOf(uncpath, handle)).toInt()
}

public fun NdfCreateWebIncident(url: PCWSTR, handle: Long): HRESULT {
    return Win32DynamicFfi.invoke("ndfapi.dll", "NdfCreateWebIncident", longArrayOf(url, handle)).toInt()
}

public fun NdfCreateWebIncidentEx(url: PCWSTR, usewinhttp: BOOL, modulename: PCWSTR, handle: Long): HRESULT {
    return Win32DynamicFfi.invoke("ndfapi.dll", "NdfCreateWebIncidentEx", longArrayOf(url, usewinhttp.toLong(), modulename, handle)).toInt()
}

public fun NdfCreateWinSockIncident(sock: Networking.WinSock.SOCKET, host: PCWSTR, port: UShort, appid: PCWSTR, userid: Long, handle: Long): HRESULT {
    return Win32DynamicFfi.invoke("ndfapi.dll", "NdfCreateWinSockIncident", longArrayOf(Win32DynamicFfi.objectSlot(sock), host, port.toLong(), appid, userid, handle)).toInt()
}

public fun NdfDiagnoseIncident(handle: Long, rootcausecount: Long, rootcauses: Long, dwwait: UInt, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ndfapi.dll", "NdfDiagnoseIncident", longArrayOf(handle, rootcausecount, rootcauses, dwwait.toLong(), dwflags.toLong())).toInt()
}

public fun NdfExecuteDiagnosis(handle: Long, hwnd: Foundation.HWND): HRESULT {
    return Win32DynamicFfi.invoke("ndfapi.dll", "NdfExecuteDiagnosis", longArrayOf(handle, Win32DynamicFfi.objectSlot(hwnd))).toInt()
}

public fun NdfGetTraceFile(handle: Long, tracefilelocation: Long): HRESULT {
    return Win32DynamicFfi.invoke("ndfapi.dll", "NdfGetTraceFile", longArrayOf(handle, tracefilelocation)).toInt()
}

public fun NdfRepairIncident(handle: Long, repairex: Long, dwwait: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ndfapi.dll", "NdfRepairIncident", longArrayOf(handle, repairex, dwwait.toLong())).toInt()
}
