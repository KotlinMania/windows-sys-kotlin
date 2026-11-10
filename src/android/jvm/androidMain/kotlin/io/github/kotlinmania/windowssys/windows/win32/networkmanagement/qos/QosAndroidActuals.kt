@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.Socket

private object WindowsWin32NetworkmanagementQosJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_qos_qOSAddSocketToFlow(qoshandle: Long, socket: Long, destaddr: Long, traffictype: Int, flags: Int, flowid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_qos_qOSCancel(qoshandle: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_qos_qOSCloseHandle(qoshandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_qos_qOSCreateHandle(version: Long, qoshandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_qos_qOSEnumerateFlows(qoshandle: Long, size: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_qos_qOSNotifyFlow(qoshandle: Long, flowid: Int, operation: Int, size: Long, buffer: Long, flags: Int, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_qos_qOSQueryFlow(qoshandle: Long, flowid: Int, operation: Int, size: Long, buffer: Long, flags: Int, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_qos_qOSRemoveSocketFromFlow(qoshandle: Long, socket: Long, flowid: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_qos_qOSSetFlow(qoshandle: Long, flowid: Int, operation: Int, size: Int, buffer: Long, flags: Int, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_qos_qOSStartTrackingClient(qoshandle: Long, destaddr: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_qos_qOSStopTrackingClient(qoshandle: Long, destaddr: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_qos_tcAddFilter(flowhandle: Long, pgenericfilter: Long, pfilterhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_qos_tcAddFlow(ifchandle: Long, clflowctx: Long, flags: Int, pgenericflow: Long, pflowhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_qos_tcCloseInterface(ifchandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_qos_tcDeleteFilter(filterhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_qos_tcDeleteFlow(flowhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_qos_tcDeregisterClient(clienthandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_qos_tcEnumerateFlows(ifchandle: Long, penumhandle: Long, pflowcount: Long, pbufsize: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_qos_tcEnumerateInterfaces(clienthandle: Long, pbuffersize: Long, interfacebuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_qos_tcGetFlowNameA(flowhandle: Long, strsize: Int, pflowname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_qos_tcGetFlowNameW(flowhandle: Long, strsize: Int, pflowname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_qos_tcModifyFlow(flowhandle: Long, pgenericflow: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_qos_tcOpenInterfaceA(pinterfacename: Long, clienthandle: Long, clifcctx: Long, pifchandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_qos_tcOpenInterfaceW(pinterfacename: Long, clienthandle: Long, clifcctx: Long, pifchandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_qos_tcQueryFlowA(pflowname: Long, pguidparam: Long, pbuffersize: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_qos_tcQueryFlowW(pflowname: Long, pguidparam: Long, pbuffersize: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_qos_tcQueryInterface(ifchandle: Long, pguidparam: Long, notifychange: Boolean, pbuffersize: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_qos_tcRegisterClient(tciversion: Int, clregctx: Long, clienthandlerlist: Long, pclienthandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_qos_tcSetFlowA(pflowname: Long, pguidparam: Long, buffersize: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_qos_tcSetFlowW(pflowname: Long, pguidparam: Long, buffersize: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_qos_tcSetInterface(ifchandle: Long, pguidparam: Long, buffersize: Int, buffer: Long): Int
}

public actual fun qOSAddSocketToFlow(qoshandle: Handle, socket: Socket, destaddr: COpaquePointer?, traffictype: QosTrafficType, flags: UInt, flowid: COpaquePointer?): Bool =
    WindowsWin32NetworkmanagementQosJniBridge.windowssys_windows_win32_networkmanagement_qos_qOSAddSocketToFlow((qoshandle?.value ?: 0L), socket.toLong(), (destaddr?.value ?: 0L), traffictype, flags.toInt(), (flowid?.value ?: 0L))

public actual fun qOSCancel(qoshandle: Handle, overlapped: COpaquePointer?): Bool =
    WindowsWin32NetworkmanagementQosJniBridge.windowssys_windows_win32_networkmanagement_qos_qOSCancel((qoshandle?.value ?: 0L), (overlapped?.value ?: 0L))

public actual fun qOSCloseHandle(qoshandle: Handle): Bool =
    WindowsWin32NetworkmanagementQosJniBridge.windowssys_windows_win32_networkmanagement_qos_qOSCloseHandle((qoshandle?.value ?: 0L))

public actual fun qOSCreateHandle(version: COpaquePointer?, qoshandle: COpaquePointer?): Bool =
    WindowsWin32NetworkmanagementQosJniBridge.windowssys_windows_win32_networkmanagement_qos_qOSCreateHandle((version?.value ?: 0L), (qoshandle?.value ?: 0L))

public actual fun qOSEnumerateFlows(qoshandle: Handle, size: COpaquePointer?, buffer: COpaquePointer?): Bool =
    WindowsWin32NetworkmanagementQosJniBridge.windowssys_windows_win32_networkmanagement_qos_qOSEnumerateFlows((qoshandle?.value ?: 0L), (size?.value ?: 0L), (buffer?.value ?: 0L))

public actual fun qOSNotifyFlow(qoshandle: Handle, flowid: UInt, operation: QosNotifyFlow, size: COpaquePointer?, buffer: COpaquePointer?, flags: UInt, overlapped: COpaquePointer?): Bool =
    WindowsWin32NetworkmanagementQosJniBridge.windowssys_windows_win32_networkmanagement_qos_qOSNotifyFlow((qoshandle?.value ?: 0L), flowid.toInt(), operation, (size?.value ?: 0L), (buffer?.value ?: 0L), flags.toInt(), (overlapped?.value ?: 0L))

public actual fun qOSQueryFlow(qoshandle: Handle, flowid: UInt, operation: QosQueryFlow, size: COpaquePointer?, buffer: COpaquePointer?, flags: UInt, overlapped: COpaquePointer?): Bool =
    WindowsWin32NetworkmanagementQosJniBridge.windowssys_windows_win32_networkmanagement_qos_qOSQueryFlow((qoshandle?.value ?: 0L), flowid.toInt(), operation, (size?.value ?: 0L), (buffer?.value ?: 0L), flags.toInt(), (overlapped?.value ?: 0L))

public actual fun qOSRemoveSocketFromFlow(qoshandle: Handle, socket: Socket, flowid: UInt, flags: UInt): Bool =
    WindowsWin32NetworkmanagementQosJniBridge.windowssys_windows_win32_networkmanagement_qos_qOSRemoveSocketFromFlow((qoshandle?.value ?: 0L), socket.toLong(), flowid.toInt(), flags.toInt())

public actual fun qOSSetFlow(qoshandle: Handle, flowid: UInt, operation: QosSetFlow, size: UInt, buffer: COpaquePointer?, flags: UInt, overlapped: COpaquePointer?): Bool =
    WindowsWin32NetworkmanagementQosJniBridge.windowssys_windows_win32_networkmanagement_qos_qOSSetFlow((qoshandle?.value ?: 0L), flowid.toInt(), operation, size.toInt(), (buffer?.value ?: 0L), flags.toInt(), (overlapped?.value ?: 0L))

public actual fun qOSStartTrackingClient(qoshandle: Handle, destaddr: COpaquePointer?, flags: UInt): Bool =
    WindowsWin32NetworkmanagementQosJniBridge.windowssys_windows_win32_networkmanagement_qos_qOSStartTrackingClient((qoshandle?.value ?: 0L), (destaddr?.value ?: 0L), flags.toInt())

public actual fun qOSStopTrackingClient(qoshandle: Handle, destaddr: COpaquePointer?, flags: UInt): Bool =
    WindowsWin32NetworkmanagementQosJniBridge.windowssys_windows_win32_networkmanagement_qos_qOSStopTrackingClient((qoshandle?.value ?: 0L), (destaddr?.value ?: 0L), flags.toInt())

public actual fun tcAddFilter(flowhandle: Handle, pgenericfilter: COpaquePointer?, pfilterhandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementQosJniBridge.windowssys_windows_win32_networkmanagement_qos_tcAddFilter((flowhandle?.value ?: 0L), (pgenericfilter?.value ?: 0L), (pfilterhandle?.value ?: 0L)).toUInt()

public actual fun tcAddFlow(ifchandle: Handle, clflowctx: Handle, flags: UInt, pgenericflow: COpaquePointer?, pflowhandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementQosJniBridge.windowssys_windows_win32_networkmanagement_qos_tcAddFlow((ifchandle?.value ?: 0L), (clflowctx?.value ?: 0L), flags.toInt(), (pgenericflow?.value ?: 0L), (pflowhandle?.value ?: 0L)).toUInt()

public actual fun tcCloseInterface(ifchandle: Handle): UInt =
    WindowsWin32NetworkmanagementQosJniBridge.windowssys_windows_win32_networkmanagement_qos_tcCloseInterface((ifchandle?.value ?: 0L)).toUInt()

public actual fun tcDeleteFilter(filterhandle: Handle): UInt =
    WindowsWin32NetworkmanagementQosJniBridge.windowssys_windows_win32_networkmanagement_qos_tcDeleteFilter((filterhandle?.value ?: 0L)).toUInt()

public actual fun tcDeleteFlow(flowhandle: Handle): UInt =
    WindowsWin32NetworkmanagementQosJniBridge.windowssys_windows_win32_networkmanagement_qos_tcDeleteFlow((flowhandle?.value ?: 0L)).toUInt()

public actual fun tcDeregisterClient(clienthandle: Handle): UInt =
    WindowsWin32NetworkmanagementQosJniBridge.windowssys_windows_win32_networkmanagement_qos_tcDeregisterClient((clienthandle?.value ?: 0L)).toUInt()

public actual fun tcEnumerateFlows(ifchandle: Handle, penumhandle: COpaquePointer?, pflowcount: COpaquePointer?, pbufsize: COpaquePointer?, buffer: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementQosJniBridge.windowssys_windows_win32_networkmanagement_qos_tcEnumerateFlows((ifchandle?.value ?: 0L), (penumhandle?.value ?: 0L), (pflowcount?.value ?: 0L), (pbufsize?.value ?: 0L), (buffer?.value ?: 0L)).toUInt()

public actual fun tcEnumerateInterfaces(clienthandle: Handle, pbuffersize: COpaquePointer?, interfacebuffer: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementQosJniBridge.windowssys_windows_win32_networkmanagement_qos_tcEnumerateInterfaces((clienthandle?.value ?: 0L), (pbuffersize?.value ?: 0L), (interfacebuffer?.value ?: 0L)).toUInt()

public actual fun tcGetFlowNameA(flowhandle: Handle, strsize: UInt, pflowname: Pstr): UInt =
    WindowsWin32NetworkmanagementQosJniBridge.windowssys_windows_win32_networkmanagement_qos_tcGetFlowNameA((flowhandle?.value ?: 0L), strsize.toInt(), (pflowname?.value ?: 0L)).toUInt()

public actual fun tcGetFlowNameW(flowhandle: Handle, strsize: UInt, pflowname: Pwstr): UInt =
    WindowsWin32NetworkmanagementQosJniBridge.windowssys_windows_win32_networkmanagement_qos_tcGetFlowNameW((flowhandle?.value ?: 0L), strsize.toInt(), (pflowname?.value ?: 0L)).toUInt()

public actual fun tcModifyFlow(flowhandle: Handle, pgenericflow: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementQosJniBridge.windowssys_windows_win32_networkmanagement_qos_tcModifyFlow((flowhandle?.value ?: 0L), (pgenericflow?.value ?: 0L)).toUInt()

public actual fun tcOpenInterfaceA(pinterfacename: Pcstr, clienthandle: Handle, clifcctx: Handle, pifchandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementQosJniBridge.windowssys_windows_win32_networkmanagement_qos_tcOpenInterfaceA((pinterfacename?.value ?: 0L), (clienthandle?.value ?: 0L), (clifcctx?.value ?: 0L), (pifchandle?.value ?: 0L)).toUInt()

public actual fun tcOpenInterfaceW(pinterfacename: Pcwstr, clienthandle: Handle, clifcctx: Handle, pifchandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementQosJniBridge.windowssys_windows_win32_networkmanagement_qos_tcOpenInterfaceW((pinterfacename?.value ?: 0L), (clienthandle?.value ?: 0L), (clifcctx?.value ?: 0L), (pifchandle?.value ?: 0L)).toUInt()

public actual fun tcQueryFlowA(pflowname: Pcstr, pguidparam: COpaquePointer?, pbuffersize: COpaquePointer?, buffer: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementQosJniBridge.windowssys_windows_win32_networkmanagement_qos_tcQueryFlowA((pflowname?.value ?: 0L), (pguidparam?.value ?: 0L), (pbuffersize?.value ?: 0L), (buffer?.value ?: 0L)).toUInt()

public actual fun tcQueryFlowW(pflowname: Pcwstr, pguidparam: COpaquePointer?, pbuffersize: COpaquePointer?, buffer: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementQosJniBridge.windowssys_windows_win32_networkmanagement_qos_tcQueryFlowW((pflowname?.value ?: 0L), (pguidparam?.value ?: 0L), (pbuffersize?.value ?: 0L), (buffer?.value ?: 0L)).toUInt()

public actual fun tcQueryInterface(ifchandle: Handle, pguidparam: COpaquePointer?, notifychange: Boolean, pbuffersize: COpaquePointer?, buffer: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementQosJniBridge.windowssys_windows_win32_networkmanagement_qos_tcQueryInterface((ifchandle?.value ?: 0L), (pguidparam?.value ?: 0L), notifychange, (pbuffersize?.value ?: 0L), (buffer?.value ?: 0L)).toUInt()

public actual fun tcRegisterClient(tciversion: UInt, clregctx: Handle, clienthandlerlist: COpaquePointer?, pclienthandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementQosJniBridge.windowssys_windows_win32_networkmanagement_qos_tcRegisterClient(tciversion.toInt(), (clregctx?.value ?: 0L), (clienthandlerlist?.value ?: 0L), (pclienthandle?.value ?: 0L)).toUInt()

public actual fun tcSetFlowA(pflowname: Pcstr, pguidparam: COpaquePointer?, buffersize: UInt, buffer: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementQosJniBridge.windowssys_windows_win32_networkmanagement_qos_tcSetFlowA((pflowname?.value ?: 0L), (pguidparam?.value ?: 0L), buffersize.toInt(), (buffer?.value ?: 0L)).toUInt()

public actual fun tcSetFlowW(pflowname: Pcwstr, pguidparam: COpaquePointer?, buffersize: UInt, buffer: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementQosJniBridge.windowssys_windows_win32_networkmanagement_qos_tcSetFlowW((pflowname?.value ?: 0L), (pguidparam?.value ?: 0L), buffersize.toInt(), (buffer?.value ?: 0L)).toUInt()

public actual fun tcSetInterface(ifchandle: Handle, pguidparam: COpaquePointer?, buffersize: UInt, buffer: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementQosJniBridge.windowssys_windows_win32_networkmanagement_qos_tcSetInterface((ifchandle?.value ?: 0L), (pguidparam?.value ?: 0L), buffersize.toInt(), (buffer?.value ?: 0L)).toUInt()
