package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.SOCKET

public expect fun QOSAddSocketToFlow(qoshandle: HANDLE, socket: SOCKET, destaddr: Long, traffictype: QOS_TRAFFIC_TYPE, flags: UInt, flowid: Long): BOOL

public expect fun QOSCancel(qoshandle: HANDLE, overlapped: Long): BOOL

public expect fun QOSCloseHandle(qoshandle: HANDLE): BOOL

public expect fun QOSCreateHandle(version: Long, qoshandle: Long): BOOL

public expect fun QOSEnumerateFlows(qoshandle: HANDLE, size: Long, buffer: Long): BOOL

public expect fun QOSNotifyFlow(qoshandle: HANDLE, flowid: UInt, operation: QOS_NOTIFY_FLOW, size: Long, buffer: Long, flags: UInt, overlapped: Long): BOOL

public expect fun QOSQueryFlow(qoshandle: HANDLE, flowid: UInt, operation: QOS_QUERY_FLOW, size: Long, buffer: Long, flags: UInt, overlapped: Long): BOOL

public expect fun QOSRemoveSocketFromFlow(qoshandle: HANDLE, socket: SOCKET, flowid: UInt, flags: UInt): BOOL

public expect fun QOSSetFlow(qoshandle: HANDLE, flowid: UInt, operation: QOS_SET_FLOW, size: UInt, buffer: Long, flags: UInt, overlapped: Long): BOOL

public expect fun QOSStartTrackingClient(qoshandle: HANDLE, destaddr: Long, flags: UInt): BOOL

public expect fun QOSStopTrackingClient(qoshandle: HANDLE, destaddr: Long, flags: UInt): BOOL

public expect fun TcAddFilter(flowhandle: HANDLE, pgenericfilter: Long, pfilterhandle: Long): UInt

public expect fun TcAddFlow(ifchandle: HANDLE, clflowctx: HANDLE, flags: UInt, pgenericflow: Long, pflowhandle: Long): UInt

public expect fun TcCloseInterface(ifchandle: HANDLE): UInt

public expect fun TcDeleteFilter(filterhandle: HANDLE): UInt

public expect fun TcDeleteFlow(flowhandle: HANDLE): UInt

public expect fun TcDeregisterClient(clienthandle: HANDLE): UInt

public expect fun TcEnumerateFlows(ifchandle: HANDLE, penumhandle: Long, pflowcount: Long, pbufsize: Long, buffer: Long): UInt

public expect fun TcEnumerateInterfaces(clienthandle: HANDLE, pbuffersize: Long, interfacebuffer: Long): UInt

public expect fun TcGetFlowNameA(flowhandle: HANDLE, strsize: UInt, pflowname: PSTR): UInt

public expect fun TcGetFlowNameW(flowhandle: HANDLE, strsize: UInt, pflowname: PWSTR): UInt

public expect fun TcModifyFlow(flowhandle: HANDLE, pgenericflow: Long): UInt

public expect fun TcOpenInterfaceA(pinterfacename: PCSTR, clienthandle: HANDLE, clifcctx: HANDLE, pifchandle: Long): UInt

public expect fun TcOpenInterfaceW(pinterfacename: PCWSTR, clienthandle: HANDLE, clifcctx: HANDLE, pifchandle: Long): UInt

public expect fun TcQueryFlowA(pflowname: PCSTR, pguidparam: Long, pbuffersize: Long, buffer: Long): UInt

public expect fun TcQueryFlowW(pflowname: PCWSTR, pguidparam: Long, pbuffersize: Long, buffer: Long): UInt

public expect fun TcQueryInterface(ifchandle: HANDLE, pguidparam: Long, notifychange: Boolean, pbuffersize: Long, buffer: Long): UInt

public expect fun TcRegisterClient(tciversion: UInt, clregctx: HANDLE, clienthandlerlist: Long, pclienthandle: Long): UInt

public expect fun TcSetFlowA(pflowname: PCSTR, pguidparam: Long, buffersize: UInt, buffer: Long): UInt

public expect fun TcSetFlowW(pflowname: PCWSTR, pguidparam: Long, buffersize: UInt, buffer: Long): UInt

public expect fun TcSetInterface(ifchandle: HANDLE, pguidparam: Long, buffersize: UInt, buffer: Long): UInt
