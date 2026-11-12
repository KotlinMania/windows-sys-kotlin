package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.Sockaddr
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.Socket
import io.github.kotlinmania.windowssys.windows.win32.system.io.Overlapped

public expect fun qOSAddSocketToFlow(qoshandle: Handle, socket: Socket, destaddr: ConstPtr<Sockaddr>, traffictype: QosTrafficType, flags: UInt, flowid: MutPtr<UInt>): Bool

public expect fun qOSCancel(qoshandle: Handle, overlapped: ConstPtr<Overlapped>): Bool

public expect fun qOSCloseHandle(qoshandle: Handle): Bool

public expect fun qOSCreateHandle(version: ConstPtr<QosVersion>, qoshandle: MutPtr<Handle>): Bool

public expect fun qOSEnumerateFlows(qoshandle: Handle, size: MutPtr<UInt>, buffer: MutPtr<CVoid>): Bool

public expect fun qOSNotifyFlow(qoshandle: Handle, flowid: UInt, operation: QosNotifyFlow, size: MutPtr<UInt>, buffer: MutPtr<CVoid>, flags: UInt, overlapped: MutPtr<Overlapped>): Bool

public expect fun qOSQueryFlow(qoshandle: Handle, flowid: UInt, operation: QosQueryFlow, size: MutPtr<UInt>, buffer: MutPtr<CVoid>, flags: UInt, overlapped: MutPtr<Overlapped>): Bool

public expect fun qOSRemoveSocketFromFlow(qoshandle: Handle, socket: Socket, flowid: UInt, flags: UInt): Bool

public expect fun qOSSetFlow(qoshandle: Handle, flowid: UInt, operation: QosSetFlow, size: UInt, buffer: ConstPtr<CVoid>, flags: UInt, overlapped: MutPtr<Overlapped>): Bool

public expect fun qOSStartTrackingClient(qoshandle: Handle, destaddr: ConstPtr<Sockaddr>, flags: UInt): Bool

public expect fun qOSStopTrackingClient(qoshandle: Handle, destaddr: ConstPtr<Sockaddr>, flags: UInt): Bool

public expect fun tcAddFilter(flowhandle: Handle, pgenericfilter: ConstPtr<TcGenFilter>, pfilterhandle: MutPtr<Handle>): UInt

public expect fun tcAddFlow(ifchandle: Handle, clflowctx: Handle, flags: UInt, pgenericflow: ConstPtr<TcGenFlow>, pflowhandle: MutPtr<Handle>): UInt

public expect fun tcCloseInterface(ifchandle: Handle): UInt

public expect fun tcDeleteFilter(filterhandle: Handle): UInt

public expect fun tcDeleteFlow(flowhandle: Handle): UInt

public expect fun tcDeregisterClient(clienthandle: Handle): UInt

public expect fun tcEnumerateFlows(ifchandle: Handle, penumhandle: MutPtr<Handle>, pflowcount: MutPtr<UInt>, pbufsize: MutPtr<UInt>, buffer: MutPtr<EnumerationBuffer>): UInt

public expect fun tcEnumerateInterfaces(clienthandle: Handle, pbuffersize: MutPtr<UInt>, interfacebuffer: MutPtr<TcIfcDescriptor>): UInt

public expect fun tcGetFlowNameA(flowhandle: Handle, strsize: UInt, pflowname: Pstr): UInt

public expect fun tcGetFlowNameW(flowhandle: Handle, strsize: UInt, pflowname: Pwstr): UInt

public expect fun tcModifyFlow(flowhandle: Handle, pgenericflow: ConstPtr<TcGenFlow>): UInt

public expect fun tcOpenInterfaceA(pinterfacename: Pcstr, clienthandle: Handle, clifcctx: Handle, pifchandle: MutPtr<Handle>): UInt

public expect fun tcOpenInterfaceW(pinterfacename: Pcwstr, clienthandle: Handle, clifcctx: Handle, pifchandle: MutPtr<Handle>): UInt

public expect fun tcQueryFlowA(pflowname: Pcstr, pguidparam: ConstPtr<Guid>, pbuffersize: MutPtr<UInt>, buffer: MutPtr<CVoid>): UInt

public expect fun tcQueryFlowW(pflowname: Pcwstr, pguidparam: ConstPtr<Guid>, pbuffersize: MutPtr<UInt>, buffer: MutPtr<CVoid>): UInt

public expect fun tcQueryInterface(ifchandle: Handle, pguidparam: ConstPtr<Guid>, notifychange: Boolean, pbuffersize: MutPtr<UInt>, buffer: MutPtr<CVoid>): UInt

public expect fun tcRegisterClient(tciversion: UInt, clregctx: Handle, clienthandlerlist: ConstPtr<TciClientFuncList>, pclienthandle: MutPtr<Handle>): UInt

public expect fun tcSetFlowA(pflowname: Pcstr, pguidparam: ConstPtr<Guid>, buffersize: UInt, buffer: ConstPtr<CVoid>): UInt

public expect fun tcSetFlowW(pflowname: Pcwstr, pguidparam: ConstPtr<Guid>, buffersize: UInt, buffer: ConstPtr<CVoid>): UInt

public expect fun tcSetInterface(ifchandle: Handle, pguidparam: ConstPtr<Guid>, buffersize: UInt, buffer: ConstPtr<CVoid>): UInt
