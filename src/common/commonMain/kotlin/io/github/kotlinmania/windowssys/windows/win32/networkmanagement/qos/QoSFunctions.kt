package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public fun QOSAddSocketToFlow(qoshandle: Foundation.HANDLE, socket: Networking.WinSock.SOCKET, destaddr: Long, traffictype: QOS_TRAFFIC_TYPE, flags: UInt, flowid: Long): BOOL {
    return Win32DynamicFfi.invoke("qwave.dll", "QOSAddSocketToFlow", longArrayOf(Win32DynamicFfi.objectSlot(qoshandle), Win32DynamicFfi.objectSlot(socket), destaddr, traffictype.toLong(), flags.toLong(), flowid)).toInt()
}

public fun QOSCancel(qoshandle: Foundation.HANDLE, overlapped: Long): BOOL {
    return Win32DynamicFfi.invoke("qwave.dll", "QOSCancel", longArrayOf(Win32DynamicFfi.objectSlot(qoshandle), overlapped)).toInt()
}

public fun QOSCloseHandle(qoshandle: Foundation.HANDLE): BOOL {
    return Win32DynamicFfi.invoke("qwave.dll", "QOSCloseHandle", longArrayOf(Win32DynamicFfi.objectSlot(qoshandle))).toInt()
}

public fun QOSCreateHandle(version: Long, qoshandle: Long): BOOL {
    return Win32DynamicFfi.invoke("qwave.dll", "QOSCreateHandle", longArrayOf(version, qoshandle)).toInt()
}

public fun QOSEnumerateFlows(qoshandle: Foundation.HANDLE, size: Long, buffer: Long): BOOL {
    return Win32DynamicFfi.invoke("qwave.dll", "QOSEnumerateFlows", longArrayOf(Win32DynamicFfi.objectSlot(qoshandle), size, buffer)).toInt()
}

public fun QOSNotifyFlow(qoshandle: Foundation.HANDLE, flowid: UInt, operation: QOS_NOTIFY_FLOW, size: Long, buffer: Long, flags: UInt, overlapped: Long): BOOL {
    return Win32DynamicFfi.invoke("qwave.dll", "QOSNotifyFlow", longArrayOf(Win32DynamicFfi.objectSlot(qoshandle), flowid.toLong(), operation.toLong(), size, buffer, flags.toLong(), overlapped)).toInt()
}

public fun QOSQueryFlow(qoshandle: Foundation.HANDLE, flowid: UInt, operation: QOS_QUERY_FLOW, size: Long, buffer: Long, flags: UInt, overlapped: Long): BOOL {
    return Win32DynamicFfi.invoke("qwave.dll", "QOSQueryFlow", longArrayOf(Win32DynamicFfi.objectSlot(qoshandle), flowid.toLong(), operation.toLong(), size, buffer, flags.toLong(), overlapped)).toInt()
}

public fun QOSRemoveSocketFromFlow(qoshandle: Foundation.HANDLE, socket: Networking.WinSock.SOCKET, flowid: UInt, flags: UInt): BOOL {
    return Win32DynamicFfi.invoke("qwave.dll", "QOSRemoveSocketFromFlow", longArrayOf(Win32DynamicFfi.objectSlot(qoshandle), Win32DynamicFfi.objectSlot(socket), flowid.toLong(), flags.toLong())).toInt()
}

public fun QOSSetFlow(qoshandle: Foundation.HANDLE, flowid: UInt, operation: QOS_SET_FLOW, size: UInt, buffer: Long, flags: UInt, overlapped: Long): BOOL {
    return Win32DynamicFfi.invoke("qwave.dll", "QOSSetFlow", longArrayOf(Win32DynamicFfi.objectSlot(qoshandle), flowid.toLong(), operation.toLong(), size.toLong(), buffer, flags.toLong(), overlapped)).toInt()
}

public fun QOSStartTrackingClient(qoshandle: Foundation.HANDLE, destaddr: Long, flags: UInt): BOOL {
    return Win32DynamicFfi.invoke("qwave.dll", "QOSStartTrackingClient", longArrayOf(Win32DynamicFfi.objectSlot(qoshandle), destaddr, flags.toLong())).toInt()
}

public fun QOSStopTrackingClient(qoshandle: Foundation.HANDLE, destaddr: Long, flags: UInt): BOOL {
    return Win32DynamicFfi.invoke("qwave.dll", "QOSStopTrackingClient", longArrayOf(Win32DynamicFfi.objectSlot(qoshandle), destaddr, flags.toLong())).toInt()
}

public fun TcAddFilter(flowhandle: Foundation.HANDLE, pgenericfilter: Long, pfilterhandle: Long): UInt {
    return Win32DynamicFfi.invoke("traffic.dll", "TcAddFilter", longArrayOf(Win32DynamicFfi.objectSlot(flowhandle), pgenericfilter, pfilterhandle)).toUInt()
}

public fun TcAddFlow(ifchandle: Foundation.HANDLE, clflowctx: Foundation.HANDLE, flags: UInt, pgenericflow: Long, pflowhandle: Long): UInt {
    return Win32DynamicFfi.invoke("traffic.dll", "TcAddFlow", longArrayOf(Win32DynamicFfi.objectSlot(ifchandle), Win32DynamicFfi.objectSlot(clflowctx), flags.toLong(), pgenericflow, pflowhandle)).toUInt()
}

public fun TcCloseInterface(ifchandle: Foundation.HANDLE): UInt {
    return Win32DynamicFfi.invoke("traffic.dll", "TcCloseInterface", longArrayOf(Win32DynamicFfi.objectSlot(ifchandle))).toUInt()
}

public fun TcDeleteFilter(filterhandle: Foundation.HANDLE): UInt {
    return Win32DynamicFfi.invoke("traffic.dll", "TcDeleteFilter", longArrayOf(Win32DynamicFfi.objectSlot(filterhandle))).toUInt()
}

public fun TcDeleteFlow(flowhandle: Foundation.HANDLE): UInt {
    return Win32DynamicFfi.invoke("traffic.dll", "TcDeleteFlow", longArrayOf(Win32DynamicFfi.objectSlot(flowhandle))).toUInt()
}

public fun TcDeregisterClient(clienthandle: Foundation.HANDLE): UInt {
    return Win32DynamicFfi.invoke("traffic.dll", "TcDeregisterClient", longArrayOf(Win32DynamicFfi.objectSlot(clienthandle))).toUInt()
}

public fun TcEnumerateFlows(ifchandle: Foundation.HANDLE, penumhandle: Long, pflowcount: Long, pbufsize: Long, buffer: Long): UInt {
    return Win32DynamicFfi.invoke("traffic.dll", "TcEnumerateFlows", longArrayOf(Win32DynamicFfi.objectSlot(ifchandle), penumhandle, pflowcount, pbufsize, buffer)).toUInt()
}

public fun TcEnumerateInterfaces(clienthandle: Foundation.HANDLE, pbuffersize: Long, interfacebuffer: Long): UInt {
    return Win32DynamicFfi.invoke("traffic.dll", "TcEnumerateInterfaces", longArrayOf(Win32DynamicFfi.objectSlot(clienthandle), pbuffersize, interfacebuffer)).toUInt()
}

public fun TcGetFlowNameA(flowhandle: Foundation.HANDLE, strsize: UInt, pflowname: PSTR): UInt {
    return Win32DynamicFfi.invoke("traffic.dll", "TcGetFlowNameA", longArrayOf(Win32DynamicFfi.objectSlot(flowhandle), strsize.toLong(), pflowname)).toUInt()
}

public fun TcGetFlowNameW(flowhandle: Foundation.HANDLE, strsize: UInt, pflowname: PWSTR): UInt {
    return Win32DynamicFfi.invoke("traffic.dll", "TcGetFlowNameW", longArrayOf(Win32DynamicFfi.objectSlot(flowhandle), strsize.toLong(), pflowname)).toUInt()
}

public fun TcModifyFlow(flowhandle: Foundation.HANDLE, pgenericflow: Long): UInt {
    return Win32DynamicFfi.invoke("traffic.dll", "TcModifyFlow", longArrayOf(Win32DynamicFfi.objectSlot(flowhandle), pgenericflow)).toUInt()
}

public fun TcOpenInterfaceA(pinterfacename: PCSTR, clienthandle: Foundation.HANDLE, clifcctx: Foundation.HANDLE, pifchandle: Long): UInt {
    return Win32DynamicFfi.invoke("traffic.dll", "TcOpenInterfaceA", longArrayOf(pinterfacename, Win32DynamicFfi.objectSlot(clienthandle), Win32DynamicFfi.objectSlot(clifcctx), pifchandle)).toUInt()
}

public fun TcOpenInterfaceW(pinterfacename: PCWSTR, clienthandle: Foundation.HANDLE, clifcctx: Foundation.HANDLE, pifchandle: Long): UInt {
    return Win32DynamicFfi.invoke("traffic.dll", "TcOpenInterfaceW", longArrayOf(pinterfacename, Win32DynamicFfi.objectSlot(clienthandle), Win32DynamicFfi.objectSlot(clifcctx), pifchandle)).toUInt()
}

public fun TcQueryFlowA(pflowname: PCSTR, pguidparam: Long, pbuffersize: Long, buffer: Long): UInt {
    return Win32DynamicFfi.invoke("traffic.dll", "TcQueryFlowA", longArrayOf(pflowname, pguidparam, pbuffersize, buffer)).toUInt()
}

public fun TcQueryFlowW(pflowname: PCWSTR, pguidparam: Long, pbuffersize: Long, buffer: Long): UInt {
    return Win32DynamicFfi.invoke("traffic.dll", "TcQueryFlowW", longArrayOf(pflowname, pguidparam, pbuffersize, buffer)).toUInt()
}

public fun TcQueryInterface(ifchandle: Foundation.HANDLE, pguidparam: Long, notifychange: Boolean, pbuffersize: Long, buffer: Long): UInt {
    return Win32DynamicFfi.invoke("traffic.dll", "TcQueryInterface", longArrayOf(Win32DynamicFfi.objectSlot(ifchandle), pguidparam, if (notifychange) 1L else 0L, pbuffersize, buffer)).toUInt()
}

public fun TcRegisterClient(tciversion: UInt, clregctx: Foundation.HANDLE, clienthandlerlist: Long, pclienthandle: Long): UInt {
    return Win32DynamicFfi.invoke("traffic.dll", "TcRegisterClient", longArrayOf(tciversion.toLong(), Win32DynamicFfi.objectSlot(clregctx), clienthandlerlist, pclienthandle)).toUInt()
}

public fun TcSetFlowA(pflowname: PCSTR, pguidparam: Long, buffersize: UInt, buffer: Long): UInt {
    return Win32DynamicFfi.invoke("traffic.dll", "TcSetFlowA", longArrayOf(pflowname, pguidparam, buffersize.toLong(), buffer)).toUInt()
}

public fun TcSetFlowW(pflowname: PCWSTR, pguidparam: Long, buffersize: UInt, buffer: Long): UInt {
    return Win32DynamicFfi.invoke("traffic.dll", "TcSetFlowW", longArrayOf(pflowname, pguidparam, buffersize.toLong(), buffer)).toUInt()
}

public fun TcSetInterface(ifchandle: Foundation.HANDLE, pguidparam: Long, buffersize: UInt, buffer: Long): UInt {
    return Win32DynamicFfi.invoke("traffic.dll", "TcSetInterface", longArrayOf(Win32DynamicFfi.objectSlot(ifchandle), pguidparam, buffersize.toLong(), buffer)).toUInt()
}
