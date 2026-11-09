@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.SOCKET
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun QOSAddSocketToFlow(qoshandle: HANDLE, socket: SOCKET, destaddr: Long, traffictype: QOS_TRAFFIC_TYPE, flags: UInt, flowid: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssys_windows_win32_networkmanagement_qos_QOSAddSocketToFlow(qoshandle.toCPointer<ByteVar>(), socket, destaddr.toCPointer<ByteVar>(), traffictype, flags, flowid.toCPointer<ByteVar>())

public actual fun QOSCancel(qoshandle: HANDLE, overlapped: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssys_windows_win32_networkmanagement_qos_QOSCancel(qoshandle.toCPointer<ByteVar>(), overlapped.toCPointer<ByteVar>())

public actual fun QOSCloseHandle(qoshandle: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssys_windows_win32_networkmanagement_qos_QOSCloseHandle(qoshandle.toCPointer<ByteVar>())

public actual fun QOSCreateHandle(version: Long, qoshandle: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssys_windows_win32_networkmanagement_qos_QOSCreateHandle(version.toCPointer<ByteVar>(), qoshandle.toCPointer<ByteVar>())

public actual fun QOSEnumerateFlows(qoshandle: HANDLE, size: Long, buffer: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssys_windows_win32_networkmanagement_qos_QOSEnumerateFlows(qoshandle.toCPointer<ByteVar>(), size.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>())

public actual fun QOSNotifyFlow(qoshandle: HANDLE, flowid: UInt, operation: QOS_NOTIFY_FLOW, size: Long, buffer: Long, flags: UInt, overlapped: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssys_windows_win32_networkmanagement_qos_QOSNotifyFlow(qoshandle.toCPointer<ByteVar>(), flowid, operation, size.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), flags, overlapped.toCPointer<ByteVar>())

public actual fun QOSQueryFlow(qoshandle: HANDLE, flowid: UInt, operation: QOS_QUERY_FLOW, size: Long, buffer: Long, flags: UInt, overlapped: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssys_windows_win32_networkmanagement_qos_QOSQueryFlow(qoshandle.toCPointer<ByteVar>(), flowid, operation, size.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), flags, overlapped.toCPointer<ByteVar>())

public actual fun QOSRemoveSocketFromFlow(qoshandle: HANDLE, socket: SOCKET, flowid: UInt, flags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssys_windows_win32_networkmanagement_qos_QOSRemoveSocketFromFlow(qoshandle.toCPointer<ByteVar>(), socket, flowid, flags)

public actual fun QOSSetFlow(qoshandle: HANDLE, flowid: UInt, operation: QOS_SET_FLOW, size: UInt, buffer: Long, flags: UInt, overlapped: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssys_windows_win32_networkmanagement_qos_QOSSetFlow(qoshandle.toCPointer<ByteVar>(), flowid, operation, size, buffer.toCPointer<ByteVar>(), flags, overlapped.toCPointer<ByteVar>())

public actual fun QOSStartTrackingClient(qoshandle: HANDLE, destaddr: Long, flags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssys_windows_win32_networkmanagement_qos_QOSStartTrackingClient(qoshandle.toCPointer<ByteVar>(), destaddr.toCPointer<ByteVar>(), flags)

public actual fun QOSStopTrackingClient(qoshandle: HANDLE, destaddr: Long, flags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssys_windows_win32_networkmanagement_qos_QOSStopTrackingClient(qoshandle.toCPointer<ByteVar>(), destaddr.toCPointer<ByteVar>(), flags)

public actual fun TcAddFilter(flowhandle: HANDLE, pgenericfilter: Long, pfilterhandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssys_windows_win32_networkmanagement_qos_TcAddFilter(flowhandle.toCPointer<ByteVar>(), pgenericfilter.toCPointer<ByteVar>(), pfilterhandle.toCPointer<ByteVar>())

public actual fun TcAddFlow(ifchandle: HANDLE, clflowctx: HANDLE, flags: UInt, pgenericflow: Long, pflowhandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssys_windows_win32_networkmanagement_qos_TcAddFlow(ifchandle.toCPointer<ByteVar>(), clflowctx.toCPointer<ByteVar>(), flags, pgenericflow.toCPointer<ByteVar>(), pflowhandle.toCPointer<ByteVar>())

public actual fun TcCloseInterface(ifchandle: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssys_windows_win32_networkmanagement_qos_TcCloseInterface(ifchandle.toCPointer<ByteVar>())

public actual fun TcDeleteFilter(filterhandle: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssys_windows_win32_networkmanagement_qos_TcDeleteFilter(filterhandle.toCPointer<ByteVar>())

public actual fun TcDeleteFlow(flowhandle: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssys_windows_win32_networkmanagement_qos_TcDeleteFlow(flowhandle.toCPointer<ByteVar>())

public actual fun TcDeregisterClient(clienthandle: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssys_windows_win32_networkmanagement_qos_TcDeregisterClient(clienthandle.toCPointer<ByteVar>())

public actual fun TcEnumerateFlows(ifchandle: HANDLE, penumhandle: Long, pflowcount: Long, pbufsize: Long, buffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssys_windows_win32_networkmanagement_qos_TcEnumerateFlows(ifchandle.toCPointer<ByteVar>(), penumhandle.toCPointer<ByteVar>(), pflowcount.toCPointer<ByteVar>(), pbufsize.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>())

public actual fun TcEnumerateInterfaces(clienthandle: HANDLE, pbuffersize: Long, interfacebuffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssys_windows_win32_networkmanagement_qos_TcEnumerateInterfaces(clienthandle.toCPointer<ByteVar>(), pbuffersize.toCPointer<ByteVar>(), interfacebuffer.toCPointer<ByteVar>())

public actual fun TcGetFlowNameA(flowhandle: HANDLE, strsize: UInt, pflowname: PSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssys_windows_win32_networkmanagement_qos_TcGetFlowNameA(flowhandle.toCPointer<ByteVar>(), strsize, pflowname.toCPointer<ByteVar>())

public actual fun TcGetFlowNameW(flowhandle: HANDLE, strsize: UInt, pflowname: PWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssys_windows_win32_networkmanagement_qos_TcGetFlowNameW(flowhandle.toCPointer<ByteVar>(), strsize, pflowname.toCPointer<ByteVar>())

public actual fun TcModifyFlow(flowhandle: HANDLE, pgenericflow: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssys_windows_win32_networkmanagement_qos_TcModifyFlow(flowhandle.toCPointer<ByteVar>(), pgenericflow.toCPointer<ByteVar>())

public actual fun TcOpenInterfaceA(pinterfacename: PCSTR, clienthandle: HANDLE, clifcctx: HANDLE, pifchandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssys_windows_win32_networkmanagement_qos_TcOpenInterfaceA(pinterfacename.toCPointer<ByteVar>(), clienthandle.toCPointer<ByteVar>(), clifcctx.toCPointer<ByteVar>(), pifchandle.toCPointer<ByteVar>())

public actual fun TcOpenInterfaceW(pinterfacename: PCWSTR, clienthandle: HANDLE, clifcctx: HANDLE, pifchandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssys_windows_win32_networkmanagement_qos_TcOpenInterfaceW(pinterfacename.toCPointer<ByteVar>(), clienthandle.toCPointer<ByteVar>(), clifcctx.toCPointer<ByteVar>(), pifchandle.toCPointer<ByteVar>())

public actual fun TcQueryFlowA(pflowname: PCSTR, pguidparam: Long, pbuffersize: Long, buffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssys_windows_win32_networkmanagement_qos_TcQueryFlowA(pflowname.toCPointer<ByteVar>(), pguidparam.toCPointer<ByteVar>(), pbuffersize.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>())

public actual fun TcQueryFlowW(pflowname: PCWSTR, pguidparam: Long, pbuffersize: Long, buffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssys_windows_win32_networkmanagement_qos_TcQueryFlowW(pflowname.toCPointer<ByteVar>(), pguidparam.toCPointer<ByteVar>(), pbuffersize.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>())

public actual fun TcQueryInterface(ifchandle: HANDLE, pguidparam: Long, notifychange: Boolean, pbuffersize: Long, buffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssys_windows_win32_networkmanagement_qos_TcQueryInterface(ifchandle.toCPointer<ByteVar>(), pguidparam.toCPointer<ByteVar>(), notifychange, pbuffersize.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>())

public actual fun TcRegisterClient(tciversion: UInt, clregctx: HANDLE, clienthandlerlist: Long, pclienthandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssys_windows_win32_networkmanagement_qos_TcRegisterClient(tciversion, clregctx.toCPointer<ByteVar>(), clienthandlerlist.toCPointer<ByteVar>(), pclienthandle.toCPointer<ByteVar>())

public actual fun TcSetFlowA(pflowname: PCSTR, pguidparam: Long, buffersize: UInt, buffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssys_windows_win32_networkmanagement_qos_TcSetFlowA(pflowname.toCPointer<ByteVar>(), pguidparam.toCPointer<ByteVar>(), buffersize, buffer.toCPointer<ByteVar>())

public actual fun TcSetFlowW(pflowname: PCWSTR, pguidparam: Long, buffersize: UInt, buffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssys_windows_win32_networkmanagement_qos_TcSetFlowW(pflowname.toCPointer<ByteVar>(), pguidparam.toCPointer<ByteVar>(), buffersize, buffer.toCPointer<ByteVar>())

public actual fun TcSetInterface(ifchandle: HANDLE, pguidparam: Long, buffersize: UInt, buffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssys_windows_win32_networkmanagement_qos_TcSetInterface(ifchandle.toCPointer<ByteVar>(), pguidparam.toCPointer<ByteVar>(), buffersize, buffer.toCPointer<ByteVar>())
