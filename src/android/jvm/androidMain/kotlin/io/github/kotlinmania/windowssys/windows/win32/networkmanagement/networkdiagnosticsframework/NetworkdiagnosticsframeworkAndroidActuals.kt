@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.networkdiagnosticsframework

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.Socket

private object WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfCancelIncident(handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfCloseIncident(handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfCreateConnectivityIncident(handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfCreateDNSIncident(hostname: Long, querytype: Short, handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfCreateGroupingIncident(cloudname: Long, groupname: Long, identity: Long, invitation: Long, addresses: Long, appid: Long, handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfCreateIncident(helperclassname: Long, celt: Int, attributes: Long, handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfCreatePnrpIncident(cloudname: Long, peername: Long, diagnosepublish: Int, appid: Long, handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfCreateSharingIncident(uncpath: Long, handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfCreateWebIncident(url: Long, handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfCreateWebIncidentEx(url: Long, usewinhttp: Int, modulename: Long, handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfCreateWinSockIncident(sock: Long, host: Long, port: Short, appid: Long, userid: Long, handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfDiagnoseIncident(handle: Long, rootcausecount: Long, rootcauses: Long, dwwait: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfExecuteDiagnosis(handle: Long, hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfGetTraceFile(handle: Long, tracefilelocation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfRepairIncident(handle: Long, repairex: Long, dwwait: Int): Int
}

public actual fun ndfCancelIncident(handle: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfCancelIncident((handle?.value ?: 0L))

public actual fun ndfCloseIncident(handle: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfCloseIncident((handle?.value ?: 0L))

public actual fun ndfCreateConnectivityIncident(handle: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfCreateConnectivityIncident((handle?.value ?: 0L))

public actual fun ndfCreateDNSIncident(hostname: Pcwstr, querytype: UShort, handle: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfCreateDNSIncident((hostname?.value ?: 0L), querytype.toShort(), (handle?.value ?: 0L))

public actual fun ndfCreateGroupingIncident(cloudname: Pcwstr, groupname: Pcwstr, identity: Pcwstr, invitation: Pcwstr, addresses: COpaquePointer?, appid: Pcwstr, handle: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfCreateGroupingIncident((cloudname?.value ?: 0L), (groupname?.value ?: 0L), (identity?.value ?: 0L), (invitation?.value ?: 0L), (addresses?.value ?: 0L), (appid?.value ?: 0L), (handle?.value ?: 0L))

public actual fun ndfCreateIncident(helperclassname: Pcwstr, celt: UInt, attributes: COpaquePointer?, handle: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfCreateIncident((helperclassname?.value ?: 0L), celt.toInt(), (attributes?.value ?: 0L), (handle?.value ?: 0L))

public actual fun ndfCreateNetConnectionIncident(handle: COpaquePointer?, id: Guid): Hresult =
    0

public actual fun ndfCreatePnrpIncident(cloudname: Pcwstr, peername: Pcwstr, diagnosepublish: Bool, appid: Pcwstr, handle: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfCreatePnrpIncident((cloudname?.value ?: 0L), (peername?.value ?: 0L), diagnosepublish, (appid?.value ?: 0L), (handle?.value ?: 0L))

public actual fun ndfCreateSharingIncident(uncpath: Pcwstr, handle: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfCreateSharingIncident((uncpath?.value ?: 0L), (handle?.value ?: 0L))

public actual fun ndfCreateWebIncident(url: Pcwstr, handle: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfCreateWebIncident((url?.value ?: 0L), (handle?.value ?: 0L))

public actual fun ndfCreateWebIncidentEx(url: Pcwstr, usewinhttp: Bool, modulename: Pcwstr, handle: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfCreateWebIncidentEx((url?.value ?: 0L), usewinhttp, (modulename?.value ?: 0L), (handle?.value ?: 0L))

public actual fun ndfCreateWinSockIncident(sock: Socket, host: Pcwstr, port: UShort, appid: Pcwstr, userid: COpaquePointer?, handle: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfCreateWinSockIncident(sock.toLong(), (host?.value ?: 0L), port.toShort(), (appid?.value ?: 0L), (userid?.value ?: 0L), (handle?.value ?: 0L))

public actual fun ndfDiagnoseIncident(handle: COpaquePointer?, rootcausecount: COpaquePointer?, rootcauses: COpaquePointer?, dwwait: UInt, dwflags: UInt): Hresult =
    WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfDiagnoseIncident((handle?.value ?: 0L), (rootcausecount?.value ?: 0L), (rootcauses?.value ?: 0L), dwwait.toInt(), dwflags.toInt())

public actual fun ndfExecuteDiagnosis(handle: COpaquePointer?, hwnd: Hwnd): Hresult =
    WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfExecuteDiagnosis((handle?.value ?: 0L), (hwnd?.value ?: 0L))

public actual fun ndfGetTraceFile(handle: COpaquePointer?, tracefilelocation: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfGetTraceFile((handle?.value ?: 0L), (tracefilelocation?.value ?: 0L))

public actual fun ndfRepairIncident(handle: COpaquePointer?, repairex: COpaquePointer?, dwwait: UInt): Hresult =
    WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge.windowssys_windows_win32_networkmanagement_networkdiagnosticsframework_ndfRepairIncident((handle?.value ?: 0L), (repairex?.value ?: 0L), dwwait.toInt())
