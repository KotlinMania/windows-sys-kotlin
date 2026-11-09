@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.SOCKET

private object WindowsWin32NetworkmanagementQosJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_qos_QOSAddSocketToFlow(qoshandle: Long, socket: Long, destaddr: Long, traffictype: Int, flags: Int, flowid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_qos_QOSCancel(qoshandle: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_qos_QOSCloseHandle(qoshandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_qos_QOSCreateHandle(version: Long, qoshandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_qos_QOSEnumerateFlows(qoshandle: Long, size: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_qos_QOSNotifyFlow(qoshandle: Long, flowid: Int, operation: Int, size: Long, buffer: Long, flags: Int, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_qos_QOSQueryFlow(qoshandle: Long, flowid: Int, operation: Int, size: Long, buffer: Long, flags: Int, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_qos_QOSRemoveSocketFromFlow(qoshandle: Long, socket: Long, flowid: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_qos_QOSSetFlow(qoshandle: Long, flowid: Int, operation: Int, size: Int, buffer: Long, flags: Int, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_qos_QOSStartTrackingClient(qoshandle: Long, destaddr: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_qos_QOSStopTrackingClient(qoshandle: Long, destaddr: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_qos_TcAddFilter(flowhandle: Long, pgenericfilter: Long, pfilterhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_qos_TcAddFlow(ifchandle: Long, clflowctx: Long, flags: Int, pgenericflow: Long, pflowhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_qos_TcCloseInterface(ifchandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_qos_TcDeleteFilter(filterhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_qos_TcDeleteFlow(flowhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_qos_TcDeregisterClient(clienthandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_qos_TcEnumerateFlows(ifchandle: Long, penumhandle: Long, pflowcount: Long, pbufsize: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_qos_TcEnumerateInterfaces(clienthandle: Long, pbuffersize: Long, interfacebuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_qos_TcGetFlowNameA(flowhandle: Long, strsize: Int, pflowname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_qos_TcGetFlowNameW(flowhandle: Long, strsize: Int, pflowname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_qos_TcModifyFlow(flowhandle: Long, pgenericflow: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_qos_TcOpenInterfaceA(pinterfacename: Long, clienthandle: Long, clifcctx: Long, pifchandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_qos_TcOpenInterfaceW(pinterfacename: Long, clienthandle: Long, clifcctx: Long, pifchandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_qos_TcQueryFlowA(pflowname: Long, pguidparam: Long, pbuffersize: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_qos_TcQueryFlowW(pflowname: Long, pguidparam: Long, pbuffersize: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_qos_TcQueryInterface(ifchandle: Long, pguidparam: Long, notifychange: Boolean, pbuffersize: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_qos_TcRegisterClient(tciversion: Int, clregctx: Long, clienthandlerlist: Long, pclienthandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_qos_TcSetFlowA(pflowname: Long, pguidparam: Long, buffersize: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_qos_TcSetFlowW(pflowname: Long, pguidparam: Long, buffersize: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_qos_TcSetInterface(ifchandle: Long, pguidparam: Long, buffersize: Int, buffer: Long): Int
}

public actual fun QOSAddSocketToFlow(qoshandle: HANDLE, socket: SOCKET, destaddr: Long, traffictype: QOS_TRAFFIC_TYPE, flags: UInt, flowid: Long): BOOL =
    WindowsWin32NetworkmanagementQosJniBridge.windowssys_windows_win32_networkmanagement_qos_QOSAddSocketToFlow(qoshandle, socket.toLong(), destaddr, traffictype, flags.toInt(), flowid)

public actual fun QOSCancel(qoshandle: HANDLE, overlapped: Long): BOOL =
    WindowsWin32NetworkmanagementQosJniBridge.windowssys_windows_win32_networkmanagement_qos_QOSCancel(qoshandle, overlapped)

public actual fun QOSCloseHandle(qoshandle: HANDLE): BOOL =
    WindowsWin32NetworkmanagementQosJniBridge.windowssys_windows_win32_networkmanagement_qos_QOSCloseHandle(qoshandle)

public actual fun QOSCreateHandle(version: Long, qoshandle: Long): BOOL =
    WindowsWin32NetworkmanagementQosJniBridge.windowssys_windows_win32_networkmanagement_qos_QOSCreateHandle(version, qoshandle)

public actual fun QOSEnumerateFlows(qoshandle: HANDLE, size: Long, buffer: Long): BOOL =
    WindowsWin32NetworkmanagementQosJniBridge.windowssys_windows_win32_networkmanagement_qos_QOSEnumerateFlows(qoshandle, size, buffer)

public actual fun QOSNotifyFlow(qoshandle: HANDLE, flowid: UInt, operation: QOS_NOTIFY_FLOW, size: Long, buffer: Long, flags: UInt, overlapped: Long): BOOL =
    WindowsWin32NetworkmanagementQosJniBridge.windowssys_windows_win32_networkmanagement_qos_QOSNotifyFlow(qoshandle, flowid.toInt(), operation, size, buffer, flags.toInt(), overlapped)

public actual fun QOSQueryFlow(qoshandle: HANDLE, flowid: UInt, operation: QOS_QUERY_FLOW, size: Long, buffer: Long, flags: UInt, overlapped: Long): BOOL =
    WindowsWin32NetworkmanagementQosJniBridge.windowssys_windows_win32_networkmanagement_qos_QOSQueryFlow(qoshandle, flowid.toInt(), operation, size, buffer, flags.toInt(), overlapped)

public actual fun QOSRemoveSocketFromFlow(qoshandle: HANDLE, socket: SOCKET, flowid: UInt, flags: UInt): BOOL =
    WindowsWin32NetworkmanagementQosJniBridge.windowssys_windows_win32_networkmanagement_qos_QOSRemoveSocketFromFlow(qoshandle, socket.toLong(), flowid.toInt(), flags.toInt())

public actual fun QOSSetFlow(qoshandle: HANDLE, flowid: UInt, operation: QOS_SET_FLOW, size: UInt, buffer: Long, flags: UInt, overlapped: Long): BOOL =
    WindowsWin32NetworkmanagementQosJniBridge.windowssys_windows_win32_networkmanagement_qos_QOSSetFlow(qoshandle, flowid.toInt(), operation, size.toInt(), buffer, flags.toInt(), overlapped)

public actual fun QOSStartTrackingClient(qoshandle: HANDLE, destaddr: Long, flags: UInt): BOOL =
    WindowsWin32NetworkmanagementQosJniBridge.windowssys_windows_win32_networkmanagement_qos_QOSStartTrackingClient(qoshandle, destaddr, flags.toInt())

public actual fun QOSStopTrackingClient(qoshandle: HANDLE, destaddr: Long, flags: UInt): BOOL =
    WindowsWin32NetworkmanagementQosJniBridge.windowssys_windows_win32_networkmanagement_qos_QOSStopTrackingClient(qoshandle, destaddr, flags.toInt())

public actual fun TcAddFilter(flowhandle: HANDLE, pgenericfilter: Long, pfilterhandle: Long): UInt =
    WindowsWin32NetworkmanagementQosJniBridge.windowssys_windows_win32_networkmanagement_qos_TcAddFilter(flowhandle, pgenericfilter, pfilterhandle).toUInt()

public actual fun TcAddFlow(ifchandle: HANDLE, clflowctx: HANDLE, flags: UInt, pgenericflow: Long, pflowhandle: Long): UInt =
    WindowsWin32NetworkmanagementQosJniBridge.windowssys_windows_win32_networkmanagement_qos_TcAddFlow(ifchandle, clflowctx, flags.toInt(), pgenericflow, pflowhandle).toUInt()

public actual fun TcCloseInterface(ifchandle: HANDLE): UInt =
    WindowsWin32NetworkmanagementQosJniBridge.windowssys_windows_win32_networkmanagement_qos_TcCloseInterface(ifchandle).toUInt()

public actual fun TcDeleteFilter(filterhandle: HANDLE): UInt =
    WindowsWin32NetworkmanagementQosJniBridge.windowssys_windows_win32_networkmanagement_qos_TcDeleteFilter(filterhandle).toUInt()

public actual fun TcDeleteFlow(flowhandle: HANDLE): UInt =
    WindowsWin32NetworkmanagementQosJniBridge.windowssys_windows_win32_networkmanagement_qos_TcDeleteFlow(flowhandle).toUInt()

public actual fun TcDeregisterClient(clienthandle: HANDLE): UInt =
    WindowsWin32NetworkmanagementQosJniBridge.windowssys_windows_win32_networkmanagement_qos_TcDeregisterClient(clienthandle).toUInt()

public actual fun TcEnumerateFlows(ifchandle: HANDLE, penumhandle: Long, pflowcount: Long, pbufsize: Long, buffer: Long): UInt =
    WindowsWin32NetworkmanagementQosJniBridge.windowssys_windows_win32_networkmanagement_qos_TcEnumerateFlows(ifchandle, penumhandle, pflowcount, pbufsize, buffer).toUInt()

public actual fun TcEnumerateInterfaces(clienthandle: HANDLE, pbuffersize: Long, interfacebuffer: Long): UInt =
    WindowsWin32NetworkmanagementQosJniBridge.windowssys_windows_win32_networkmanagement_qos_TcEnumerateInterfaces(clienthandle, pbuffersize, interfacebuffer).toUInt()

public actual fun TcGetFlowNameA(flowhandle: HANDLE, strsize: UInt, pflowname: PSTR): UInt =
    WindowsWin32NetworkmanagementQosJniBridge.windowssys_windows_win32_networkmanagement_qos_TcGetFlowNameA(flowhandle, strsize.toInt(), pflowname).toUInt()

public actual fun TcGetFlowNameW(flowhandle: HANDLE, strsize: UInt, pflowname: PWSTR): UInt =
    WindowsWin32NetworkmanagementQosJniBridge.windowssys_windows_win32_networkmanagement_qos_TcGetFlowNameW(flowhandle, strsize.toInt(), pflowname).toUInt()

public actual fun TcModifyFlow(flowhandle: HANDLE, pgenericflow: Long): UInt =
    WindowsWin32NetworkmanagementQosJniBridge.windowssys_windows_win32_networkmanagement_qos_TcModifyFlow(flowhandle, pgenericflow).toUInt()

public actual fun TcOpenInterfaceA(pinterfacename: PCSTR, clienthandle: HANDLE, clifcctx: HANDLE, pifchandle: Long): UInt =
    WindowsWin32NetworkmanagementQosJniBridge.windowssys_windows_win32_networkmanagement_qos_TcOpenInterfaceA(pinterfacename, clienthandle, clifcctx, pifchandle).toUInt()

public actual fun TcOpenInterfaceW(pinterfacename: PCWSTR, clienthandle: HANDLE, clifcctx: HANDLE, pifchandle: Long): UInt =
    WindowsWin32NetworkmanagementQosJniBridge.windowssys_windows_win32_networkmanagement_qos_TcOpenInterfaceW(pinterfacename, clienthandle, clifcctx, pifchandle).toUInt()

public actual fun TcQueryFlowA(pflowname: PCSTR, pguidparam: Long, pbuffersize: Long, buffer: Long): UInt =
    WindowsWin32NetworkmanagementQosJniBridge.windowssys_windows_win32_networkmanagement_qos_TcQueryFlowA(pflowname, pguidparam, pbuffersize, buffer).toUInt()

public actual fun TcQueryFlowW(pflowname: PCWSTR, pguidparam: Long, pbuffersize: Long, buffer: Long): UInt =
    WindowsWin32NetworkmanagementQosJniBridge.windowssys_windows_win32_networkmanagement_qos_TcQueryFlowW(pflowname, pguidparam, pbuffersize, buffer).toUInt()

public actual fun TcQueryInterface(ifchandle: HANDLE, pguidparam: Long, notifychange: Boolean, pbuffersize: Long, buffer: Long): UInt =
    WindowsWin32NetworkmanagementQosJniBridge.windowssys_windows_win32_networkmanagement_qos_TcQueryInterface(ifchandle, pguidparam, notifychange, pbuffersize, buffer).toUInt()

public actual fun TcRegisterClient(tciversion: UInt, clregctx: HANDLE, clienthandlerlist: Long, pclienthandle: Long): UInt =
    WindowsWin32NetworkmanagementQosJniBridge.windowssys_windows_win32_networkmanagement_qos_TcRegisterClient(tciversion.toInt(), clregctx, clienthandlerlist, pclienthandle).toUInt()

public actual fun TcSetFlowA(pflowname: PCSTR, pguidparam: Long, buffersize: UInt, buffer: Long): UInt =
    WindowsWin32NetworkmanagementQosJniBridge.windowssys_windows_win32_networkmanagement_qos_TcSetFlowA(pflowname, pguidparam, buffersize.toInt(), buffer).toUInt()

public actual fun TcSetFlowW(pflowname: PCWSTR, pguidparam: Long, buffersize: UInt, buffer: Long): UInt =
    WindowsWin32NetworkmanagementQosJniBridge.windowssys_windows_win32_networkmanagement_qos_TcSetFlowW(pflowname, pguidparam, buffersize.toInt(), buffer).toUInt()

public actual fun TcSetInterface(ifchandle: HANDLE, pguidparam: Long, buffersize: UInt, buffer: Long): UInt =
    WindowsWin32NetworkmanagementQosJniBridge.windowssys_windows_win32_networkmanagement_qos_TcSetInterface(ifchandle, pguidparam, buffersize.toInt(), buffer).toUInt()
