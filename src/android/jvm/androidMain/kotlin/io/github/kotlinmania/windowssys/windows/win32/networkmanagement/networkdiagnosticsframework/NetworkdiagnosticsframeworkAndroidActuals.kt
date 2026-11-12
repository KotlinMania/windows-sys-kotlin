@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.networkdiagnosticsframework

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
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
    external fun windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCancelIncident(handle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCloseIncident(handle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateConnectivityIncident(handle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateDNSIncident(hostname: Long, querytype: Short, handle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateGroupingIncident(cloudname: Long, groupname: Long, identity: Long, invitation: Long, addresses: Long, appid: Long, handle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateIncident(helperclassname: Long, celt: Int, attributes: Long, handle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreatePnrpIncident(cloudname: Long, peername: Long, diagnosepublish: Int, appid: Long, handle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateSharingIncident(uncpath: Long, handle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateWebIncident(url: Long, handle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateWebIncidentEx(url: Long, usewinhttp: Int, modulename: Long, handle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateWinSockIncident(sock: Long, host: Long, port: Short, appid: Long, userid: Long, handle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfDiagnoseIncident(handle: Long, rootcausecount: Long, rootcauses: Long, dwwait: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfExecuteDiagnosis(handle: Long, hwnd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfGetTraceFile(handle: Long, tracefilelocation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfRepairIncident(handle: Long, repairex: Long, dwwait: Int): Int
}

public actual fun ndfCancelIncident(handle: ConstPtr): Hresult =
    WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCancelIncident(handle.rawAddress)

public actual fun ndfCloseIncident(handle: MutPtr): Hresult =
    WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCloseIncident(handle.rawAddress)

public actual fun ndfCreateConnectivityIncident(handle: MutPtr): Hresult =
    WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateConnectivityIncident(handle.rawAddress)

public actual fun ndfCreateDNSIncident(hostname: Pcwstr, querytype: UShort, handle: MutPtr): Hresult =
    WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateDNSIncident(hostname.rawAddress, querytype.toShort(), handle.rawAddress)

public actual fun ndfCreateGroupingIncident(cloudname: Pcwstr, groupname: Pcwstr, identity: Pcwstr, invitation: Pcwstr, addresses: ConstPtr, appid: Pcwstr, handle: MutPtr): Hresult =
    WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateGroupingIncident(cloudname.rawAddress, groupname.rawAddress, identity.rawAddress, invitation.rawAddress, addresses.rawAddress, appid.rawAddress, handle.rawAddress)

public actual fun ndfCreateIncident(helperclassname: Pcwstr, celt: UInt, attributes: ConstPtr, handle: MutPtr): Hresult =
    WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateIncident(helperclassname.rawAddress, celt.toInt(), attributes.rawAddress, handle.rawAddress)

public actual fun ndfCreateNetConnectionIncident(handle: MutPtr, id: Guid): Hresult =
    0

public actual fun ndfCreatePnrpIncident(cloudname: Pcwstr, peername: Pcwstr, diagnosepublish: Bool, appid: Pcwstr, handle: MutPtr): Hresult =
    WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreatePnrpIncident(cloudname.rawAddress, peername.rawAddress, diagnosepublish, appid.rawAddress, handle.rawAddress)

public actual fun ndfCreateSharingIncident(uncpath: Pcwstr, handle: MutPtr): Hresult =
    WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateSharingIncident(uncpath.rawAddress, handle.rawAddress)

public actual fun ndfCreateWebIncident(url: Pcwstr, handle: MutPtr): Hresult =
    WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateWebIncident(url.rawAddress, handle.rawAddress)

public actual fun ndfCreateWebIncidentEx(url: Pcwstr, usewinhttp: Bool, modulename: Pcwstr, handle: MutPtr): Hresult =
    WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateWebIncidentEx(url.rawAddress, usewinhttp, modulename.rawAddress, handle.rawAddress)

public actual fun ndfCreateWinSockIncident(sock: Socket, host: Pcwstr, port: UShort, appid: Pcwstr, userid: ConstPtr, handle: MutPtr): Hresult =
    WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateWinSockIncident(sock.toLong(), host.rawAddress, port.toShort(), appid.rawAddress, userid.rawAddress, handle.rawAddress)

public actual fun ndfDiagnoseIncident(handle: ConstPtr, rootcausecount: MutPtr, rootcauses: MutPtr, dwwait: UInt, dwflags: UInt): Hresult =
    WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfDiagnoseIncident(handle.rawAddress, rootcausecount.rawAddress, rootcauses.rawAddress, dwwait.toInt(), dwflags.toInt())

public actual fun ndfExecuteDiagnosis(handle: ConstPtr, hwnd: Hwnd): Hresult =
    WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfExecuteDiagnosis(handle.rawAddress, hwnd.rawAddress)

public actual fun ndfGetTraceFile(handle: ConstPtr, tracefilelocation: MutPtr): Hresult =
    WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfGetTraceFile(handle.rawAddress, tracefilelocation.rawAddress)

public actual fun ndfRepairIncident(handle: ConstPtr, repairex: ConstPtr, dwwait: UInt): Hresult =
    WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfRepairIncident(handle.rawAddress, repairex.rawAddress, dwwait.toInt())
