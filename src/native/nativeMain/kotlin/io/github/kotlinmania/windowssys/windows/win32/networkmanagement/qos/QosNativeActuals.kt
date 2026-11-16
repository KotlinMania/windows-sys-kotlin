@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssysWindowsWin32NetworkmanagementQosQOSAddSocketToFlow
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssysWindowsWin32NetworkmanagementQosQOSCancel
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssysWindowsWin32NetworkmanagementQosQOSCloseHandle
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssysWindowsWin32NetworkmanagementQosQOSCreateHandle
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssysWindowsWin32NetworkmanagementQosQOSEnumerateFlows
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssysWindowsWin32NetworkmanagementQosQOSNotifyFlow
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssysWindowsWin32NetworkmanagementQosQOSQueryFlow
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssysWindowsWin32NetworkmanagementQosQOSRemoveSocketFromFlow
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssysWindowsWin32NetworkmanagementQosQOSSetFlow
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssysWindowsWin32NetworkmanagementQosQOSStartTrackingClient
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssysWindowsWin32NetworkmanagementQosQOSStopTrackingClient
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssysWindowsWin32NetworkmanagementQosTcAddFilter
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssysWindowsWin32NetworkmanagementQosTcAddFlow
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssysWindowsWin32NetworkmanagementQosTcCloseInterface
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssysWindowsWin32NetworkmanagementQosTcDeleteFilter
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssysWindowsWin32NetworkmanagementQosTcDeleteFlow
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssysWindowsWin32NetworkmanagementQosTcDeregisterClient
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssysWindowsWin32NetworkmanagementQosTcEnumerateFlows
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssysWindowsWin32NetworkmanagementQosTcEnumerateInterfaces
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssysWindowsWin32NetworkmanagementQosTcGetFlowNameA
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssysWindowsWin32NetworkmanagementQosTcGetFlowNameW
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssysWindowsWin32NetworkmanagementQosTcModifyFlow
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssysWindowsWin32NetworkmanagementQosTcOpenInterfaceA
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssysWindowsWin32NetworkmanagementQosTcOpenInterfaceW
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssysWindowsWin32NetworkmanagementQosTcQueryFlowA
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssysWindowsWin32NetworkmanagementQosTcQueryFlowW
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssysWindowsWin32NetworkmanagementQosTcQueryInterface
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssysWindowsWin32NetworkmanagementQosTcRegisterClient
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssysWindowsWin32NetworkmanagementQosTcSetFlowA
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssysWindowsWin32NetworkmanagementQosTcSetFlowW
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssysWindowsWin32NetworkmanagementQosTcSetInterface
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun qOSAddSocketToFlow(qoshandle: Handle, socket: Socket, destaddr: ConstPtr, traffictype: QosTrafficType, flags: UInt, flowid: MutPtr): Bool =
    windowssysWindowsWin32NetworkmanagementQosQOSAddSocketToFlow(qoshandle.rawAddress.toCPointer<ByteVar>(), socket, destaddr.rawAddress.toCPointer<ByteVar>(), traffictype, flags, flowid.rawAddress.toCPointer<ByteVar>())

public actual fun qOSCancel(qoshandle: Handle, overlapped: ConstPtr): Bool =
    windowssysWindowsWin32NetworkmanagementQosQOSCancel(qoshandle.rawAddress.toCPointer<ByteVar>(), overlapped.rawAddress.toCPointer<ByteVar>())

public actual fun qOSCloseHandle(qoshandle: Handle): Bool =
    windowssysWindowsWin32NetworkmanagementQosQOSCloseHandle(qoshandle.rawAddress.toCPointer<ByteVar>())

public actual fun qOSCreateHandle(version: ConstPtr, qoshandle: MutPtr): Bool =
    windowssysWindowsWin32NetworkmanagementQosQOSCreateHandle(version.rawAddress.toCPointer<ByteVar>(), qoshandle.rawAddress.toCPointer<ByteVar>())

public actual fun qOSEnumerateFlows(qoshandle: Handle, size: MutPtr, buffer: MutPtr): Bool =
    windowssysWindowsWin32NetworkmanagementQosQOSEnumerateFlows(qoshandle.rawAddress.toCPointer<ByteVar>(), size.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>())

public actual fun qOSNotifyFlow(qoshandle: Handle, flowid: UInt, operation: QosNotifyFlow, size: MutPtr, buffer: MutPtr, flags: UInt, overlapped: MutPtr): Bool =
    windowssysWindowsWin32NetworkmanagementQosQOSNotifyFlow(qoshandle.rawAddress.toCPointer<ByteVar>(), flowid, operation, size.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>(), flags, overlapped.rawAddress.toCPointer<ByteVar>())

public actual fun qOSQueryFlow(qoshandle: Handle, flowid: UInt, operation: QosQueryFlow, size: MutPtr, buffer: MutPtr, flags: UInt, overlapped: MutPtr): Bool =
    windowssysWindowsWin32NetworkmanagementQosQOSQueryFlow(qoshandle.rawAddress.toCPointer<ByteVar>(), flowid, operation, size.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>(), flags, overlapped.rawAddress.toCPointer<ByteVar>())

public actual fun qOSRemoveSocketFromFlow(qoshandle: Handle, socket: Socket, flowid: UInt, flags: UInt): Bool =
    windowssysWindowsWin32NetworkmanagementQosQOSRemoveSocketFromFlow(qoshandle.rawAddress.toCPointer<ByteVar>(), socket, flowid, flags)

public actual fun qOSSetFlow(qoshandle: Handle, flowid: UInt, operation: QosSetFlow, size: UInt, buffer: ConstPtr, flags: UInt, overlapped: MutPtr): Bool =
    windowssysWindowsWin32NetworkmanagementQosQOSSetFlow(qoshandle.rawAddress.toCPointer<ByteVar>(), flowid, operation, size, buffer.rawAddress.toCPointer<ByteVar>(), flags, overlapped.rawAddress.toCPointer<ByteVar>())

public actual fun qOSStartTrackingClient(qoshandle: Handle, destaddr: ConstPtr, flags: UInt): Bool =
    windowssysWindowsWin32NetworkmanagementQosQOSStartTrackingClient(qoshandle.rawAddress.toCPointer<ByteVar>(), destaddr.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun qOSStopTrackingClient(qoshandle: Handle, destaddr: ConstPtr, flags: UInt): Bool =
    windowssysWindowsWin32NetworkmanagementQosQOSStopTrackingClient(qoshandle.rawAddress.toCPointer<ByteVar>(), destaddr.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun tcAddFilter(flowhandle: Handle, pgenericfilter: ConstPtr, pfilterhandle: MutPtr): UInt =
    windowssysWindowsWin32NetworkmanagementQosTcAddFilter(flowhandle.rawAddress.toCPointer<ByteVar>(), pgenericfilter.rawAddress.toCPointer<ByteVar>(), pfilterhandle.rawAddress.toCPointer<ByteVar>())

public actual fun tcAddFlow(ifchandle: Handle, clflowctx: Handle, flags: UInt, pgenericflow: ConstPtr, pflowhandle: MutPtr): UInt =
    windowssysWindowsWin32NetworkmanagementQosTcAddFlow(ifchandle.rawAddress.toCPointer<ByteVar>(), clflowctx.rawAddress.toCPointer<ByteVar>(), flags, pgenericflow.rawAddress.toCPointer<ByteVar>(), pflowhandle.rawAddress.toCPointer<ByteVar>())

public actual fun tcCloseInterface(ifchandle: Handle): UInt =
    windowssysWindowsWin32NetworkmanagementQosTcCloseInterface(ifchandle.rawAddress.toCPointer<ByteVar>())

public actual fun tcDeleteFilter(filterhandle: Handle): UInt =
    windowssysWindowsWin32NetworkmanagementQosTcDeleteFilter(filterhandle.rawAddress.toCPointer<ByteVar>())

public actual fun tcDeleteFlow(flowhandle: Handle): UInt =
    windowssysWindowsWin32NetworkmanagementQosTcDeleteFlow(flowhandle.rawAddress.toCPointer<ByteVar>())

public actual fun tcDeregisterClient(clienthandle: Handle): UInt =
    windowssysWindowsWin32NetworkmanagementQosTcDeregisterClient(clienthandle.rawAddress.toCPointer<ByteVar>())

public actual fun tcEnumerateFlows(ifchandle: Handle, penumhandle: MutPtr, pflowcount: MutPtr, pbufsize: MutPtr, buffer: MutPtr): UInt =
    windowssysWindowsWin32NetworkmanagementQosTcEnumerateFlows(ifchandle.rawAddress.toCPointer<ByteVar>(), penumhandle.rawAddress.toCPointer<ByteVar>(), pflowcount.rawAddress.toCPointer<ByteVar>(), pbufsize.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>())

public actual fun tcEnumerateInterfaces(clienthandle: Handle, pbuffersize: MutPtr, interfacebuffer: MutPtr): UInt =
    windowssysWindowsWin32NetworkmanagementQosTcEnumerateInterfaces(clienthandle.rawAddress.toCPointer<ByteVar>(), pbuffersize.rawAddress.toCPointer<ByteVar>(), interfacebuffer.rawAddress.toCPointer<ByteVar>())

public actual fun tcGetFlowNameA(flowhandle: Handle, strsize: UInt, pflowname: Pstr): UInt =
    windowssysWindowsWin32NetworkmanagementQosTcGetFlowNameA(flowhandle.rawAddress.toCPointer<ByteVar>(), strsize, pflowname.rawAddress.toCPointer<ByteVar>())

public actual fun tcGetFlowNameW(flowhandle: Handle, strsize: UInt, pflowname: Pwstr): UInt =
    windowssysWindowsWin32NetworkmanagementQosTcGetFlowNameW(flowhandle.rawAddress.toCPointer<ByteVar>(), strsize, pflowname.rawAddress.toCPointer<ByteVar>())

public actual fun tcModifyFlow(flowhandle: Handle, pgenericflow: ConstPtr): UInt =
    windowssysWindowsWin32NetworkmanagementQosTcModifyFlow(flowhandle.rawAddress.toCPointer<ByteVar>(), pgenericflow.rawAddress.toCPointer<ByteVar>())

public actual fun tcOpenInterfaceA(pinterfacename: Pcstr, clienthandle: Handle, clifcctx: Handle, pifchandle: MutPtr): UInt =
    windowssysWindowsWin32NetworkmanagementQosTcOpenInterfaceA(pinterfacename.rawAddress.toCPointer<ByteVar>(), clienthandle.rawAddress.toCPointer<ByteVar>(), clifcctx.rawAddress.toCPointer<ByteVar>(), pifchandle.rawAddress.toCPointer<ByteVar>())

public actual fun tcOpenInterfaceW(pinterfacename: Pcwstr, clienthandle: Handle, clifcctx: Handle, pifchandle: MutPtr): UInt =
    windowssysWindowsWin32NetworkmanagementQosTcOpenInterfaceW(pinterfacename.rawAddress.toCPointer<ByteVar>(), clienthandle.rawAddress.toCPointer<ByteVar>(), clifcctx.rawAddress.toCPointer<ByteVar>(), pifchandle.rawAddress.toCPointer<ByteVar>())

public actual fun tcQueryFlowA(pflowname: Pcstr, pguidparam: ConstPtr, pbuffersize: MutPtr, buffer: MutPtr): UInt =
    windowssysWindowsWin32NetworkmanagementQosTcQueryFlowA(pflowname.rawAddress.toCPointer<ByteVar>(), pguidparam.rawAddress.toCPointer<ByteVar>(), pbuffersize.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>())

public actual fun tcQueryFlowW(pflowname: Pcwstr, pguidparam: ConstPtr, pbuffersize: MutPtr, buffer: MutPtr): UInt =
    windowssysWindowsWin32NetworkmanagementQosTcQueryFlowW(pflowname.rawAddress.toCPointer<ByteVar>(), pguidparam.rawAddress.toCPointer<ByteVar>(), pbuffersize.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>())

public actual fun tcQueryInterface(ifchandle: Handle, pguidparam: ConstPtr, notifychange: Boolean, pbuffersize: MutPtr, buffer: MutPtr): UInt =
    windowssysWindowsWin32NetworkmanagementQosTcQueryInterface(ifchandle.rawAddress.toCPointer<ByteVar>(), pguidparam.rawAddress.toCPointer<ByteVar>(), notifychange, pbuffersize.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>())

public actual fun tcRegisterClient(tciversion: UInt, clregctx: Handle, clienthandlerlist: ConstPtr, pclienthandle: MutPtr): UInt =
    windowssysWindowsWin32NetworkmanagementQosTcRegisterClient(tciversion, clregctx.rawAddress.toCPointer<ByteVar>(), clienthandlerlist.rawAddress.toCPointer<ByteVar>(), pclienthandle.rawAddress.toCPointer<ByteVar>())

public actual fun tcSetFlowA(pflowname: Pcstr, pguidparam: ConstPtr, buffersize: UInt, buffer: ConstPtr): UInt =
    windowssysWindowsWin32NetworkmanagementQosTcSetFlowA(pflowname.rawAddress.toCPointer<ByteVar>(), pguidparam.rawAddress.toCPointer<ByteVar>(), buffersize, buffer.rawAddress.toCPointer<ByteVar>())

public actual fun tcSetFlowW(pflowname: Pcwstr, pguidparam: ConstPtr, buffersize: UInt, buffer: ConstPtr): UInt =
    windowssysWindowsWin32NetworkmanagementQosTcSetFlowW(pflowname.rawAddress.toCPointer<ByteVar>(), pguidparam.rawAddress.toCPointer<ByteVar>(), buffersize, buffer.rawAddress.toCPointer<ByteVar>())

public actual fun tcSetInterface(ifchandle: Handle, pguidparam: ConstPtr, buffersize: UInt, buffer: ConstPtr): UInt =
    windowssysWindowsWin32NetworkmanagementQosTcSetInterface(ifchandle.rawAddress.toCPointer<ByteVar>(), pguidparam.rawAddress.toCPointer<ByteVar>(), buffersize, buffer.rawAddress.toCPointer<ByteVar>())
