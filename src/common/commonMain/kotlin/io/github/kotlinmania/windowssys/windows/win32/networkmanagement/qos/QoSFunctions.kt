package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.Socket

public expect fun qOSAddSocketToFlow(qoshandle: Handle, socket: Socket, destaddr: ConstPtr, traffictype: QosTrafficType, flags: UInt, flowid: MutPtr): Bool

public expect fun qOSCancel(qoshandle: Handle, overlapped: ConstPtr): Bool

public expect fun qOSCloseHandle(qoshandle: Handle): Bool

public expect fun qOSCreateHandle(version: ConstPtr, qoshandle: MutPtr): Bool

public expect fun qOSEnumerateFlows(qoshandle: Handle, size: MutPtr, buffer: MutPtr): Bool

public expect fun qOSNotifyFlow(qoshandle: Handle, flowid: UInt, operation: QosNotifyFlow, size: MutPtr, buffer: MutPtr, flags: UInt, overlapped: MutPtr): Bool

public expect fun qOSQueryFlow(qoshandle: Handle, flowid: UInt, operation: QosQueryFlow, size: MutPtr, buffer: MutPtr, flags: UInt, overlapped: MutPtr): Bool

public expect fun qOSRemoveSocketFromFlow(qoshandle: Handle, socket: Socket, flowid: UInt, flags: UInt): Bool

public expect fun qOSSetFlow(qoshandle: Handle, flowid: UInt, operation: QosSetFlow, size: UInt, buffer: ConstPtr, flags: UInt, overlapped: MutPtr): Bool

public expect fun qOSStartTrackingClient(qoshandle: Handle, destaddr: ConstPtr, flags: UInt): Bool

public expect fun qOSStopTrackingClient(qoshandle: Handle, destaddr: ConstPtr, flags: UInt): Bool

public expect fun tcAddFilter(flowhandle: Handle, pgenericfilter: ConstPtr, pfilterhandle: MutPtr): UInt

public expect fun tcAddFlow(ifchandle: Handle, clflowctx: Handle, flags: UInt, pgenericflow: ConstPtr, pflowhandle: MutPtr): UInt

public expect fun tcCloseInterface(ifchandle: Handle): UInt

public expect fun tcDeleteFilter(filterhandle: Handle): UInt

public expect fun tcDeleteFlow(flowhandle: Handle): UInt

public expect fun tcDeregisterClient(clienthandle: Handle): UInt

public expect fun tcEnumerateFlows(ifchandle: Handle, penumhandle: MutPtr, pflowcount: MutPtr, pbufsize: MutPtr, buffer: MutPtr): UInt

public expect fun tcEnumerateInterfaces(clienthandle: Handle, pbuffersize: MutPtr, interfacebuffer: MutPtr): UInt

public expect fun tcGetFlowNameA(flowhandle: Handle, strsize: UInt, pflowname: Pstr): UInt

public expect fun tcGetFlowNameW(flowhandle: Handle, strsize: UInt, pflowname: Pwstr): UInt

public expect fun tcModifyFlow(flowhandle: Handle, pgenericflow: ConstPtr): UInt

public expect fun tcOpenInterfaceA(pinterfacename: Pcstr, clienthandle: Handle, clifcctx: Handle, pifchandle: MutPtr): UInt

public expect fun tcOpenInterfaceW(pinterfacename: Pcwstr, clienthandle: Handle, clifcctx: Handle, pifchandle: MutPtr): UInt

public expect fun tcQueryFlowA(pflowname: Pcstr, pguidparam: ConstPtr, pbuffersize: MutPtr, buffer: MutPtr): UInt

public expect fun tcQueryFlowW(pflowname: Pcwstr, pguidparam: ConstPtr, pbuffersize: MutPtr, buffer: MutPtr): UInt

public expect fun tcQueryInterface(ifchandle: Handle, pguidparam: ConstPtr, notifychange: Boolean, pbuffersize: MutPtr, buffer: MutPtr): UInt

public expect fun tcRegisterClient(tciversion: UInt, clregctx: Handle, clienthandlerlist: ConstPtr, pclienthandle: MutPtr): UInt

public expect fun tcSetFlowA(pflowname: Pcstr, pguidparam: ConstPtr, buffersize: UInt, buffer: ConstPtr): UInt

public expect fun tcSetFlowW(pflowname: Pcwstr, pguidparam: ConstPtr, buffersize: UInt, buffer: ConstPtr): UInt

public expect fun tcSetInterface(ifchandle: Handle, pguidparam: ConstPtr, buffersize: UInt, buffer: ConstPtr): UInt
