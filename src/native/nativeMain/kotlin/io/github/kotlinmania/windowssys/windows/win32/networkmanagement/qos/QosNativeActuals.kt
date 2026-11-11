@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.Socket
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssys_windows_win32_networkmanagement_qos_qOSAddSocketToFlow
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssys_windows_win32_networkmanagement_qos_qOSCancel
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssys_windows_win32_networkmanagement_qos_qOSCloseHandle
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssys_windows_win32_networkmanagement_qos_qOSCreateHandle
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssys_windows_win32_networkmanagement_qos_qOSEnumerateFlows
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssys_windows_win32_networkmanagement_qos_qOSNotifyFlow
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssys_windows_win32_networkmanagement_qos_qOSQueryFlow
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssys_windows_win32_networkmanagement_qos_qOSRemoveSocketFromFlow
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssys_windows_win32_networkmanagement_qos_qOSSetFlow
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssys_windows_win32_networkmanagement_qos_qOSStartTrackingClient
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssys_windows_win32_networkmanagement_qos_qOSStopTrackingClient
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssys_windows_win32_networkmanagement_qos_tcAddFilter
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssys_windows_win32_networkmanagement_qos_tcAddFlow
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssys_windows_win32_networkmanagement_qos_tcCloseInterface
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssys_windows_win32_networkmanagement_qos_tcDeleteFilter
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssys_windows_win32_networkmanagement_qos_tcDeleteFlow
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssys_windows_win32_networkmanagement_qos_tcDeregisterClient
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssys_windows_win32_networkmanagement_qos_tcEnumerateFlows
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssys_windows_win32_networkmanagement_qos_tcEnumerateInterfaces
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssys_windows_win32_networkmanagement_qos_tcGetFlowNameA
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssys_windows_win32_networkmanagement_qos_tcGetFlowNameW
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssys_windows_win32_networkmanagement_qos_tcModifyFlow
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssys_windows_win32_networkmanagement_qos_tcOpenInterfaceA
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssys_windows_win32_networkmanagement_qos_tcOpenInterfaceW
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssys_windows_win32_networkmanagement_qos_tcQueryFlowA
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssys_windows_win32_networkmanagement_qos_tcQueryFlowW
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssys_windows_win32_networkmanagement_qos_tcQueryInterface
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssys_windows_win32_networkmanagement_qos_tcRegisterClient
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssys_windows_win32_networkmanagement_qos_tcSetFlowA
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssys_windows_win32_networkmanagement_qos_tcSetFlowW
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos.cinterop.windowssys_windows_win32_networkmanagement_qos_tcSetInterface
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun qOSAddSocketToFlow(qoshandle: Handle, socket: Socket, destaddr: COpaquePointer?, traffictype: QosTrafficType, flags: UInt, flowid: COpaquePointer?): Bool =
    windowssys_windows_win32_networkmanagement_qos_qOSAddSocketToFlow(qoshandle?.value?.toCPointer<ByteVar>(), socket, destaddr?.value?.toCPointer<ByteVar>(), traffictype, flags, flowid?.value?.toCPointer<ByteVar>())

public actual fun qOSCancel(qoshandle: Handle, overlapped: COpaquePointer?): Bool =
    windowssys_windows_win32_networkmanagement_qos_qOSCancel(qoshandle?.value?.toCPointer<ByteVar>(), overlapped?.value?.toCPointer<ByteVar>())

public actual fun qOSCloseHandle(qoshandle: Handle): Bool =
    windowssys_windows_win32_networkmanagement_qos_qOSCloseHandle(qoshandle?.value?.toCPointer<ByteVar>())

public actual fun qOSCreateHandle(version: COpaquePointer?, qoshandle: COpaquePointer?): Bool =
    windowssys_windows_win32_networkmanagement_qos_qOSCreateHandle(version?.value?.toCPointer<ByteVar>(), qoshandle?.value?.toCPointer<ByteVar>())

public actual fun qOSEnumerateFlows(qoshandle: Handle, size: COpaquePointer?, buffer: COpaquePointer?): Bool =
    windowssys_windows_win32_networkmanagement_qos_qOSEnumerateFlows(qoshandle?.value?.toCPointer<ByteVar>(), size?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>())

public actual fun qOSNotifyFlow(qoshandle: Handle, flowid: UInt, operation: QosNotifyFlow, size: COpaquePointer?, buffer: COpaquePointer?, flags: UInt, overlapped: COpaquePointer?): Bool =
    windowssys_windows_win32_networkmanagement_qos_qOSNotifyFlow(qoshandle?.value?.toCPointer<ByteVar>(), flowid, operation, size?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), flags, overlapped?.value?.toCPointer<ByteVar>())

public actual fun qOSQueryFlow(qoshandle: Handle, flowid: UInt, operation: QosQueryFlow, size: COpaquePointer?, buffer: COpaquePointer?, flags: UInt, overlapped: COpaquePointer?): Bool =
    windowssys_windows_win32_networkmanagement_qos_qOSQueryFlow(qoshandle?.value?.toCPointer<ByteVar>(), flowid, operation, size?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), flags, overlapped?.value?.toCPointer<ByteVar>())

public actual fun qOSRemoveSocketFromFlow(qoshandle: Handle, socket: Socket, flowid: UInt, flags: UInt): Bool =
    windowssys_windows_win32_networkmanagement_qos_qOSRemoveSocketFromFlow(qoshandle?.value?.toCPointer<ByteVar>(), socket, flowid, flags)

public actual fun qOSSetFlow(qoshandle: Handle, flowid: UInt, operation: QosSetFlow, size: UInt, buffer: COpaquePointer?, flags: UInt, overlapped: COpaquePointer?): Bool =
    windowssys_windows_win32_networkmanagement_qos_qOSSetFlow(qoshandle?.value?.toCPointer<ByteVar>(), flowid, operation, size, buffer?.value?.toCPointer<ByteVar>(), flags, overlapped?.value?.toCPointer<ByteVar>())

public actual fun qOSStartTrackingClient(qoshandle: Handle, destaddr: COpaquePointer?, flags: UInt): Bool =
    windowssys_windows_win32_networkmanagement_qos_qOSStartTrackingClient(qoshandle?.value?.toCPointer<ByteVar>(), destaddr?.value?.toCPointer<ByteVar>(), flags)

public actual fun qOSStopTrackingClient(qoshandle: Handle, destaddr: COpaquePointer?, flags: UInt): Bool =
    windowssys_windows_win32_networkmanagement_qos_qOSStopTrackingClient(qoshandle?.value?.toCPointer<ByteVar>(), destaddr?.value?.toCPointer<ByteVar>(), flags)

public actual fun tcAddFilter(flowhandle: Handle, pgenericfilter: COpaquePointer?, pfilterhandle: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_qos_tcAddFilter(flowhandle?.value?.toCPointer<ByteVar>(), pgenericfilter?.value?.toCPointer<ByteVar>(), pfilterhandle?.value?.toCPointer<ByteVar>())

public actual fun tcAddFlow(ifchandle: Handle, clflowctx: Handle, flags: UInt, pgenericflow: COpaquePointer?, pflowhandle: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_qos_tcAddFlow(ifchandle?.value?.toCPointer<ByteVar>(), clflowctx?.value?.toCPointer<ByteVar>(), flags, pgenericflow?.value?.toCPointer<ByteVar>(), pflowhandle?.value?.toCPointer<ByteVar>())

public actual fun tcCloseInterface(ifchandle: Handle): UInt =
    windowssys_windows_win32_networkmanagement_qos_tcCloseInterface(ifchandle?.value?.toCPointer<ByteVar>())

public actual fun tcDeleteFilter(filterhandle: Handle): UInt =
    windowssys_windows_win32_networkmanagement_qos_tcDeleteFilter(filterhandle?.value?.toCPointer<ByteVar>())

public actual fun tcDeleteFlow(flowhandle: Handle): UInt =
    windowssys_windows_win32_networkmanagement_qos_tcDeleteFlow(flowhandle?.value?.toCPointer<ByteVar>())

public actual fun tcDeregisterClient(clienthandle: Handle): UInt =
    windowssys_windows_win32_networkmanagement_qos_tcDeregisterClient(clienthandle?.value?.toCPointer<ByteVar>())

public actual fun tcEnumerateFlows(ifchandle: Handle, penumhandle: COpaquePointer?, pflowcount: COpaquePointer?, pbufsize: COpaquePointer?, buffer: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_qos_tcEnumerateFlows(ifchandle?.value?.toCPointer<ByteVar>(), penumhandle?.value?.toCPointer<ByteVar>(), pflowcount?.value?.toCPointer<ByteVar>(), pbufsize?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>())

public actual fun tcEnumerateInterfaces(clienthandle: Handle, pbuffersize: COpaquePointer?, interfacebuffer: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_qos_tcEnumerateInterfaces(clienthandle?.value?.toCPointer<ByteVar>(), pbuffersize?.value?.toCPointer<ByteVar>(), interfacebuffer?.value?.toCPointer<ByteVar>())

public actual fun tcGetFlowNameA(flowhandle: Handle, strsize: UInt, pflowname: Pstr): UInt =
    windowssys_windows_win32_networkmanagement_qos_tcGetFlowNameA(flowhandle?.value?.toCPointer<ByteVar>(), strsize, pflowname?.value?.toCPointer<ByteVar>())

public actual fun tcGetFlowNameW(flowhandle: Handle, strsize: UInt, pflowname: Pwstr): UInt =
    windowssys_windows_win32_networkmanagement_qos_tcGetFlowNameW(flowhandle?.value?.toCPointer<ByteVar>(), strsize, pflowname?.value?.toCPointer<ByteVar>())

public actual fun tcModifyFlow(flowhandle: Handle, pgenericflow: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_qos_tcModifyFlow(flowhandle?.value?.toCPointer<ByteVar>(), pgenericflow?.value?.toCPointer<ByteVar>())

public actual fun tcOpenInterfaceA(pinterfacename: Pcstr, clienthandle: Handle, clifcctx: Handle, pifchandle: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_qos_tcOpenInterfaceA(pinterfacename?.value?.toCPointer<ByteVar>(), clienthandle?.value?.toCPointer<ByteVar>(), clifcctx?.value?.toCPointer<ByteVar>(), pifchandle?.value?.toCPointer<ByteVar>())

public actual fun tcOpenInterfaceW(pinterfacename: Pcwstr, clienthandle: Handle, clifcctx: Handle, pifchandle: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_qos_tcOpenInterfaceW(pinterfacename?.value?.toCPointer<ByteVar>(), clienthandle?.value?.toCPointer<ByteVar>(), clifcctx?.value?.toCPointer<ByteVar>(), pifchandle?.value?.toCPointer<ByteVar>())

public actual fun tcQueryFlowA(pflowname: Pcstr, pguidparam: COpaquePointer?, pbuffersize: COpaquePointer?, buffer: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_qos_tcQueryFlowA(pflowname?.value?.toCPointer<ByteVar>(), pguidparam?.value?.toCPointer<ByteVar>(), pbuffersize?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>())

public actual fun tcQueryFlowW(pflowname: Pcwstr, pguidparam: COpaquePointer?, pbuffersize: COpaquePointer?, buffer: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_qos_tcQueryFlowW(pflowname?.value?.toCPointer<ByteVar>(), pguidparam?.value?.toCPointer<ByteVar>(), pbuffersize?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>())

public actual fun tcQueryInterface(ifchandle: Handle, pguidparam: COpaquePointer?, notifychange: Boolean, pbuffersize: COpaquePointer?, buffer: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_qos_tcQueryInterface(ifchandle?.value?.toCPointer<ByteVar>(), pguidparam?.value?.toCPointer<ByteVar>(), notifychange, pbuffersize?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>())

public actual fun tcRegisterClient(tciversion: UInt, clregctx: Handle, clienthandlerlist: COpaquePointer?, pclienthandle: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_qos_tcRegisterClient(tciversion, clregctx?.value?.toCPointer<ByteVar>(), clienthandlerlist?.value?.toCPointer<ByteVar>(), pclienthandle?.value?.toCPointer<ByteVar>())

public actual fun tcSetFlowA(pflowname: Pcstr, pguidparam: COpaquePointer?, buffersize: UInt, buffer: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_qos_tcSetFlowA(pflowname?.value?.toCPointer<ByteVar>(), pguidparam?.value?.toCPointer<ByteVar>(), buffersize, buffer?.value?.toCPointer<ByteVar>())

public actual fun tcSetFlowW(pflowname: Pcwstr, pguidparam: COpaquePointer?, buffersize: UInt, buffer: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_qos_tcSetFlowW(pflowname?.value?.toCPointer<ByteVar>(), pguidparam?.value?.toCPointer<ByteVar>(), buffersize, buffer?.value?.toCPointer<ByteVar>())

public actual fun tcSetInterface(ifchandle: Handle, pguidparam: COpaquePointer?, buffersize: UInt, buffer: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_qos_tcSetInterface(ifchandle?.value?.toCPointer<ByteVar>(), pguidparam?.value?.toCPointer<ByteVar>(), buffersize, buffer?.value?.toCPointer<ByteVar>())
