package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.SOCKET

public fun QOSAddSocketToFlow(qoshandle: HANDLE, socket: SOCKET, destaddr: Long, traffictype: QOS_TRAFFIC_TYPE, flags: UInt, flowid: Long): BOOL {
    return Win32DynamicFfi.invoke("qwave.dll", "QOSAddSocketToFlow", longArrayOf(qoshandle, socket.toLong(), destaddr, traffictype.toLong(), flags.toLong(), flowid)).toInt()
}

public fun QOSCancel(qoshandle: HANDLE, overlapped: Long): BOOL {
    return Win32DynamicFfi.invoke("qwave.dll", "QOSCancel", longArrayOf(qoshandle, overlapped)).toInt()
}

public fun QOSCloseHandle(qoshandle: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("qwave.dll", "QOSCloseHandle", longArrayOf(qoshandle)).toInt()
}

public fun QOSCreateHandle(version: Long, qoshandle: Long): BOOL {
    return Win32DynamicFfi.invoke("qwave.dll", "QOSCreateHandle", longArrayOf(version, qoshandle)).toInt()
}

public fun QOSEnumerateFlows(qoshandle: HANDLE, size: Long, buffer: Long): BOOL {
    return Win32DynamicFfi.invoke("qwave.dll", "QOSEnumerateFlows", longArrayOf(qoshandle, size, buffer)).toInt()
}

public fun QOSNotifyFlow(qoshandle: HANDLE, flowid: UInt, operation: QOS_NOTIFY_FLOW, size: Long, buffer: Long, flags: UInt, overlapped: Long): BOOL {
    return Win32DynamicFfi.invoke("qwave.dll", "QOSNotifyFlow", longArrayOf(qoshandle, flowid.toLong(), operation.toLong(), size, buffer, flags.toLong(), overlapped)).toInt()
}

public fun QOSQueryFlow(qoshandle: HANDLE, flowid: UInt, operation: QOS_QUERY_FLOW, size: Long, buffer: Long, flags: UInt, overlapped: Long): BOOL {
    return Win32DynamicFfi.invoke("qwave.dll", "QOSQueryFlow", longArrayOf(qoshandle, flowid.toLong(), operation.toLong(), size, buffer, flags.toLong(), overlapped)).toInt()
}

public fun QOSRemoveSocketFromFlow(qoshandle: HANDLE, socket: SOCKET, flowid: UInt, flags: UInt): BOOL {
    return Win32DynamicFfi.invoke("qwave.dll", "QOSRemoveSocketFromFlow", longArrayOf(qoshandle, socket.toLong(), flowid.toLong(), flags.toLong())).toInt()
}

public fun QOSSetFlow(qoshandle: HANDLE, flowid: UInt, operation: QOS_SET_FLOW, size: UInt, buffer: Long, flags: UInt, overlapped: Long): BOOL {
    return Win32DynamicFfi.invoke("qwave.dll", "QOSSetFlow", longArrayOf(qoshandle, flowid.toLong(), operation.toLong(), size.toLong(), buffer, flags.toLong(), overlapped)).toInt()
}

public fun QOSStartTrackingClient(qoshandle: HANDLE, destaddr: Long, flags: UInt): BOOL {
    return Win32DynamicFfi.invoke("qwave.dll", "QOSStartTrackingClient", longArrayOf(qoshandle, destaddr, flags.toLong())).toInt()
}

public fun QOSStopTrackingClient(qoshandle: HANDLE, destaddr: Long, flags: UInt): BOOL {
    return Win32DynamicFfi.invoke("qwave.dll", "QOSStopTrackingClient", longArrayOf(qoshandle, destaddr, flags.toLong())).toInt()
}

public fun TcAddFilter(flowhandle: HANDLE, pgenericfilter: Long, pfilterhandle: Long): UInt {
    return Win32DynamicFfi.invoke("traffic.dll", "TcAddFilter", longArrayOf(flowhandle, pgenericfilter, pfilterhandle)).toUInt()
}

public fun TcAddFlow(ifchandle: HANDLE, clflowctx: HANDLE, flags: UInt, pgenericflow: Long, pflowhandle: Long): UInt {
    return Win32DynamicFfi.invoke("traffic.dll", "TcAddFlow", longArrayOf(ifchandle, clflowctx, flags.toLong(), pgenericflow, pflowhandle)).toUInt()
}

public fun TcCloseInterface(ifchandle: HANDLE): UInt {
    return Win32DynamicFfi.invoke("traffic.dll", "TcCloseInterface", longArrayOf(ifchandle)).toUInt()
}

public fun TcDeleteFilter(filterhandle: HANDLE): UInt {
    return Win32DynamicFfi.invoke("traffic.dll", "TcDeleteFilter", longArrayOf(filterhandle)).toUInt()
}

public fun TcDeleteFlow(flowhandle: HANDLE): UInt {
    return Win32DynamicFfi.invoke("traffic.dll", "TcDeleteFlow", longArrayOf(flowhandle)).toUInt()
}

public fun TcDeregisterClient(clienthandle: HANDLE): UInt {
    return Win32DynamicFfi.invoke("traffic.dll", "TcDeregisterClient", longArrayOf(clienthandle)).toUInt()
}

public fun TcEnumerateFlows(ifchandle: HANDLE, penumhandle: Long, pflowcount: Long, pbufsize: Long, buffer: Long): UInt {
    return Win32DynamicFfi.invoke("traffic.dll", "TcEnumerateFlows", longArrayOf(ifchandle, penumhandle, pflowcount, pbufsize, buffer)).toUInt()
}

public fun TcEnumerateInterfaces(clienthandle: HANDLE, pbuffersize: Long, interfacebuffer: Long): UInt {
    return Win32DynamicFfi.invoke("traffic.dll", "TcEnumerateInterfaces", longArrayOf(clienthandle, pbuffersize, interfacebuffer)).toUInt()
}

public fun TcGetFlowNameA(flowhandle: HANDLE, strsize: UInt, pflowname: PSTR): UInt {
    return Win32DynamicFfi.invoke("traffic.dll", "TcGetFlowNameA", longArrayOf(flowhandle, strsize.toLong(), pflowname)).toUInt()
}

public fun TcGetFlowNameW(flowhandle: HANDLE, strsize: UInt, pflowname: PWSTR): UInt {
    return Win32DynamicFfi.invoke("traffic.dll", "TcGetFlowNameW", longArrayOf(flowhandle, strsize.toLong(), pflowname)).toUInt()
}

public fun TcModifyFlow(flowhandle: HANDLE, pgenericflow: Long): UInt {
    return Win32DynamicFfi.invoke("traffic.dll", "TcModifyFlow", longArrayOf(flowhandle, pgenericflow)).toUInt()
}

public fun TcOpenInterfaceA(pinterfacename: PCSTR, clienthandle: HANDLE, clifcctx: HANDLE, pifchandle: Long): UInt {
    return Win32DynamicFfi.invoke("traffic.dll", "TcOpenInterfaceA", longArrayOf(pinterfacename, clienthandle, clifcctx, pifchandle)).toUInt()
}

public fun TcOpenInterfaceW(pinterfacename: PCWSTR, clienthandle: HANDLE, clifcctx: HANDLE, pifchandle: Long): UInt {
    return Win32DynamicFfi.invoke("traffic.dll", "TcOpenInterfaceW", longArrayOf(pinterfacename, clienthandle, clifcctx, pifchandle)).toUInt()
}

public fun TcQueryFlowA(pflowname: PCSTR, pguidparam: Long, pbuffersize: Long, buffer: Long): UInt {
    return Win32DynamicFfi.invoke("traffic.dll", "TcQueryFlowA", longArrayOf(pflowname, pguidparam, pbuffersize, buffer)).toUInt()
}

public fun TcQueryFlowW(pflowname: PCWSTR, pguidparam: Long, pbuffersize: Long, buffer: Long): UInt {
    return Win32DynamicFfi.invoke("traffic.dll", "TcQueryFlowW", longArrayOf(pflowname, pguidparam, pbuffersize, buffer)).toUInt()
}

public fun TcQueryInterface(ifchandle: HANDLE, pguidparam: Long, notifychange: Boolean, pbuffersize: Long, buffer: Long): UInt {
    return Win32DynamicFfi.invoke("traffic.dll", "TcQueryInterface", longArrayOf(ifchandle, pguidparam, if (notifychange) 1L else 0L, pbuffersize, buffer)).toUInt()
}

public fun TcRegisterClient(tciversion: UInt, clregctx: HANDLE, clienthandlerlist: Long, pclienthandle: Long): UInt {
    return Win32DynamicFfi.invoke("traffic.dll", "TcRegisterClient", longArrayOf(tciversion.toLong(), clregctx, clienthandlerlist, pclienthandle)).toUInt()
}

public fun TcSetFlowA(pflowname: PCSTR, pguidparam: Long, buffersize: UInt, buffer: Long): UInt {
    return Win32DynamicFfi.invoke("traffic.dll", "TcSetFlowA", longArrayOf(pflowname, pguidparam, buffersize.toLong(), buffer)).toUInt()
}

public fun TcSetFlowW(pflowname: PCWSTR, pguidparam: Long, buffersize: UInt, buffer: Long): UInt {
    return Win32DynamicFfi.invoke("traffic.dll", "TcSetFlowW", longArrayOf(pflowname, pguidparam, buffersize.toLong(), buffer)).toUInt()
}

public fun TcSetInterface(ifchandle: HANDLE, pguidparam: Long, buffersize: UInt, buffer: Long): UInt {
    return Win32DynamicFfi.invoke("traffic.dll", "TcSetInterface", longArrayOf(ifchandle, pguidparam, buffersize.toLong(), buffer)).toUInt()
}
