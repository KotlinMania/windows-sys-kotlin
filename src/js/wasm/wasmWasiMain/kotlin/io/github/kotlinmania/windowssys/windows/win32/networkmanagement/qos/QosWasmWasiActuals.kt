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

public actual fun qOSAddSocketToFlow(qoshandle: Handle, socket: Socket, destaddr: COpaquePointer?, traffictype: QosTrafficType, flags: UInt, flowid: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun qOSCancel(qoshandle: Handle, overlapped: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun qOSCloseHandle(qoshandle: Handle): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun qOSCreateHandle(version: COpaquePointer?, qoshandle: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun qOSEnumerateFlows(qoshandle: Handle, size: COpaquePointer?, buffer: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun qOSNotifyFlow(qoshandle: Handle, flowid: UInt, operation: QosNotifyFlow, size: COpaquePointer?, buffer: COpaquePointer?, flags: UInt, overlapped: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun qOSQueryFlow(qoshandle: Handle, flowid: UInt, operation: QosQueryFlow, size: COpaquePointer?, buffer: COpaquePointer?, flags: UInt, overlapped: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun qOSRemoveSocketFromFlow(qoshandle: Handle, socket: Socket, flowid: UInt, flags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun qOSSetFlow(qoshandle: Handle, flowid: UInt, operation: QosSetFlow, size: UInt, buffer: COpaquePointer?, flags: UInt, overlapped: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun qOSStartTrackingClient(qoshandle: Handle, destaddr: COpaquePointer?, flags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun qOSStopTrackingClient(qoshandle: Handle, destaddr: COpaquePointer?, flags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tcAddFilter(flowhandle: Handle, pgenericfilter: COpaquePointer?, pfilterhandle: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tcAddFlow(ifchandle: Handle, clflowctx: Handle, flags: UInt, pgenericflow: COpaquePointer?, pflowhandle: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tcCloseInterface(ifchandle: Handle): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tcDeleteFilter(filterhandle: Handle): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tcDeleteFlow(flowhandle: Handle): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tcDeregisterClient(clienthandle: Handle): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tcEnumerateFlows(ifchandle: Handle, penumhandle: COpaquePointer?, pflowcount: COpaquePointer?, pbufsize: COpaquePointer?, buffer: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tcEnumerateInterfaces(clienthandle: Handle, pbuffersize: COpaquePointer?, interfacebuffer: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tcGetFlowNameA(flowhandle: Handle, strsize: UInt, pflowname: Pstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tcGetFlowNameW(flowhandle: Handle, strsize: UInt, pflowname: Pwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tcModifyFlow(flowhandle: Handle, pgenericflow: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tcOpenInterfaceA(pinterfacename: Pcstr, clienthandle: Handle, clifcctx: Handle, pifchandle: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tcOpenInterfaceW(pinterfacename: Pcwstr, clienthandle: Handle, clifcctx: Handle, pifchandle: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tcQueryFlowA(pflowname: Pcstr, pguidparam: COpaquePointer?, pbuffersize: COpaquePointer?, buffer: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tcQueryFlowW(pflowname: Pcwstr, pguidparam: COpaquePointer?, pbuffersize: COpaquePointer?, buffer: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tcQueryInterface(ifchandle: Handle, pguidparam: COpaquePointer?, notifychange: Boolean, pbuffersize: COpaquePointer?, buffer: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tcRegisterClient(tciversion: UInt, clregctx: Handle, clienthandlerlist: COpaquePointer?, pclienthandle: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tcSetFlowA(pflowname: Pcstr, pguidparam: COpaquePointer?, buffersize: UInt, buffer: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tcSetFlowW(pflowname: Pcwstr, pguidparam: COpaquePointer?, buffersize: UInt, buffer: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tcSetInterface(ifchandle: Handle, pguidparam: COpaquePointer?, buffersize: UInt, buffer: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
