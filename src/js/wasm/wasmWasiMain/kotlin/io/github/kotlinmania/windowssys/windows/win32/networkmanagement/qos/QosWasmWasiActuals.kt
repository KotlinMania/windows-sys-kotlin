@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.SOCKET

public actual fun QOSAddSocketToFlow(qoshandle: HANDLE, socket: SOCKET, destaddr: Long, traffictype: QOS_TRAFFIC_TYPE, flags: UInt, flowid: Long): BOOL =
    0

public actual fun QOSCancel(qoshandle: HANDLE, overlapped: Long): BOOL =
    0

public actual fun QOSCloseHandle(qoshandle: HANDLE): BOOL =
    0

public actual fun QOSCreateHandle(version: Long, qoshandle: Long): BOOL =
    0

public actual fun QOSEnumerateFlows(qoshandle: HANDLE, size: Long, buffer: Long): BOOL =
    0

public actual fun QOSNotifyFlow(qoshandle: HANDLE, flowid: UInt, operation: QOS_NOTIFY_FLOW, size: Long, buffer: Long, flags: UInt, overlapped: Long): BOOL =
    0

public actual fun QOSQueryFlow(qoshandle: HANDLE, flowid: UInt, operation: QOS_QUERY_FLOW, size: Long, buffer: Long, flags: UInt, overlapped: Long): BOOL =
    0

public actual fun QOSRemoveSocketFromFlow(qoshandle: HANDLE, socket: SOCKET, flowid: UInt, flags: UInt): BOOL =
    0

public actual fun QOSSetFlow(qoshandle: HANDLE, flowid: UInt, operation: QOS_SET_FLOW, size: UInt, buffer: Long, flags: UInt, overlapped: Long): BOOL =
    0

public actual fun QOSStartTrackingClient(qoshandle: HANDLE, destaddr: Long, flags: UInt): BOOL =
    0

public actual fun QOSStopTrackingClient(qoshandle: HANDLE, destaddr: Long, flags: UInt): BOOL =
    0

public actual fun TcAddFilter(flowhandle: HANDLE, pgenericfilter: Long, pfilterhandle: Long): UInt =
    0u

public actual fun TcAddFlow(ifchandle: HANDLE, clflowctx: HANDLE, flags: UInt, pgenericflow: Long, pflowhandle: Long): UInt =
    0u

public actual fun TcCloseInterface(ifchandle: HANDLE): UInt =
    0u

public actual fun TcDeleteFilter(filterhandle: HANDLE): UInt =
    0u

public actual fun TcDeleteFlow(flowhandle: HANDLE): UInt =
    0u

public actual fun TcDeregisterClient(clienthandle: HANDLE): UInt =
    0u

public actual fun TcEnumerateFlows(ifchandle: HANDLE, penumhandle: Long, pflowcount: Long, pbufsize: Long, buffer: Long): UInt =
    0u

public actual fun TcEnumerateInterfaces(clienthandle: HANDLE, pbuffersize: Long, interfacebuffer: Long): UInt =
    0u

public actual fun TcGetFlowNameA(flowhandle: HANDLE, strsize: UInt, pflowname: PSTR): UInt =
    0u

public actual fun TcGetFlowNameW(flowhandle: HANDLE, strsize: UInt, pflowname: PWSTR): UInt =
    0u

public actual fun TcModifyFlow(flowhandle: HANDLE, pgenericflow: Long): UInt =
    0u

public actual fun TcOpenInterfaceA(pinterfacename: PCSTR, clienthandle: HANDLE, clifcctx: HANDLE, pifchandle: Long): UInt =
    0u

public actual fun TcOpenInterfaceW(pinterfacename: PCWSTR, clienthandle: HANDLE, clifcctx: HANDLE, pifchandle: Long): UInt =
    0u

public actual fun TcQueryFlowA(pflowname: PCSTR, pguidparam: Long, pbuffersize: Long, buffer: Long): UInt =
    0u

public actual fun TcQueryFlowW(pflowname: PCWSTR, pguidparam: Long, pbuffersize: Long, buffer: Long): UInt =
    0u

public actual fun TcQueryInterface(ifchandle: HANDLE, pguidparam: Long, notifychange: Boolean, pbuffersize: Long, buffer: Long): UInt =
    0u

public actual fun TcRegisterClient(tciversion: UInt, clregctx: HANDLE, clienthandlerlist: Long, pclienthandle: Long): UInt =
    0u

public actual fun TcSetFlowA(pflowname: PCSTR, pguidparam: Long, buffersize: UInt, buffer: Long): UInt =
    0u

public actual fun TcSetFlowW(pflowname: PCWSTR, pguidparam: Long, buffersize: UInt, buffer: Long): UInt =
    0u

public actual fun TcSetInterface(ifchandle: HANDLE, pguidparam: Long, buffersize: UInt, buffer: Long): UInt =
    0u
