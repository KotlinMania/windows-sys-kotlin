@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.networkdiagnosticsframework

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.SOCKET

private object WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfCancelIncident(handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfCloseIncident(handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfCreateConnectivityIncident(handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfCreateDNSIncident(hostname: Long, querytype: Short, handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfCreateGroupingIncident(cloudname: Long, groupname: Long, identity: Long, invitation: Long, addresses: Long, appid: Long, handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfCreateIncident(helperclassname: Long, celt: Int, attributes: Long, handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfCreatePnrpIncident(cloudname: Long, peername: Long, diagnosepublish: Int, appid: Long, handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfCreateSharingIncident(uncpath: Long, handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfCreateWebIncident(url: Long, handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfCreateWebIncidentEx(url: Long, usewinhttp: Int, modulename: Long, handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfCreateWinSockIncident(sock: Long, host: Long, port: Short, appid: Long, userid: Long, handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfDiagnoseIncident(handle: Long, rootcausecount: Long, rootcauses: Long, dwwait: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfExecuteDiagnosis(handle: Long, hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfGetTraceFile(handle: Long, tracefilelocation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfRepairIncident(handle: Long, repairex: Long, dwwait: Int): Int
}

public actual fun NdfCancelIncident(handle: Long): HRESULT =
    WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfCancelIncident(handle)

public actual fun NdfCloseIncident(handle: Long): HRESULT =
    WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfCloseIncident(handle)

public actual fun NdfCreateConnectivityIncident(handle: Long): HRESULT =
    WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfCreateConnectivityIncident(handle)

public actual fun NdfCreateDNSIncident(hostname: PCWSTR, querytype: UShort, handle: Long): HRESULT =
    WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfCreateDNSIncident(hostname, querytype.toShort(), handle)

public actual fun NdfCreateGroupingIncident(cloudname: PCWSTR, groupname: PCWSTR, identity: PCWSTR, invitation: PCWSTR, addresses: Long, appid: PCWSTR, handle: Long): HRESULT =
    WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfCreateGroupingIncident(cloudname, groupname, identity, invitation, addresses, appid, handle)

public actual fun NdfCreateIncident(helperclassname: PCWSTR, celt: UInt, attributes: Long, handle: Long): HRESULT =
    WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfCreateIncident(helperclassname, celt.toInt(), attributes, handle)

public actual fun NdfCreateNetConnectionIncident(handle: Long, id: GUID): HRESULT =
    0

public actual fun NdfCreatePnrpIncident(cloudname: PCWSTR, peername: PCWSTR, diagnosepublish: BOOL, appid: PCWSTR, handle: Long): HRESULT =
    WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfCreatePnrpIncident(cloudname, peername, diagnosepublish, appid, handle)

public actual fun NdfCreateSharingIncident(uncpath: PCWSTR, handle: Long): HRESULT =
    WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfCreateSharingIncident(uncpath, handle)

public actual fun NdfCreateWebIncident(url: PCWSTR, handle: Long): HRESULT =
    WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfCreateWebIncident(url, handle)

public actual fun NdfCreateWebIncidentEx(url: PCWSTR, usewinhttp: BOOL, modulename: PCWSTR, handle: Long): HRESULT =
    WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfCreateWebIncidentEx(url, usewinhttp, modulename, handle)

public actual fun NdfCreateWinSockIncident(sock: SOCKET, host: PCWSTR, port: UShort, appid: PCWSTR, userid: Long, handle: Long): HRESULT =
    WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfCreateWinSockIncident(sock.toLong(), host, port.toShort(), appid, userid, handle)

public actual fun NdfDiagnoseIncident(handle: Long, rootcausecount: Long, rootcauses: Long, dwwait: UInt, dwflags: UInt): HRESULT =
    WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfDiagnoseIncident(handle, rootcausecount, rootcauses, dwwait.toInt(), dwflags.toInt())

public actual fun NdfExecuteDiagnosis(handle: Long, hwnd: HWND): HRESULT =
    WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfExecuteDiagnosis(handle, hwnd)

public actual fun NdfGetTraceFile(handle: Long, tracefilelocation: Long): HRESULT =
    WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfGetTraceFile(handle, tracefilelocation)

public actual fun NdfRepairIncident(handle: Long, repairex: Long, dwwait: UInt): HRESULT =
    WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_NdfRepairIncident(handle, repairex, dwwait.toInt())
