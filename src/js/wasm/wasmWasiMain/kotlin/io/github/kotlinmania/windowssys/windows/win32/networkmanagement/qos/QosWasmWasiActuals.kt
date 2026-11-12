@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

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

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun qOSAddSocketToFlow(qoshandle: Handle, socket: Socket, destaddr: ConstPtr<Sockaddr>, traffictype: QosTrafficType, flags: UInt, flowid: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementQosQOSAddSocketToFlow")

public actual fun qOSCancel(qoshandle: Handle, overlapped: ConstPtr<Overlapped>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementQosQOSCancel")

public actual fun qOSCloseHandle(qoshandle: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementQosQOSCloseHandle")

public actual fun qOSCreateHandle(version: ConstPtr<QosVersion>, qoshandle: MutPtr<Handle>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementQosQOSCreateHandle")

public actual fun qOSEnumerateFlows(qoshandle: Handle, size: MutPtr<UInt>, buffer: MutPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementQosQOSEnumerateFlows")

public actual fun qOSNotifyFlow(qoshandle: Handle, flowid: UInt, operation: QosNotifyFlow, size: MutPtr<UInt>, buffer: MutPtr<CVoid>, flags: UInt, overlapped: MutPtr<Overlapped>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementQosQOSNotifyFlow")

public actual fun qOSQueryFlow(qoshandle: Handle, flowid: UInt, operation: QosQueryFlow, size: MutPtr<UInt>, buffer: MutPtr<CVoid>, flags: UInt, overlapped: MutPtr<Overlapped>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementQosQOSQueryFlow")

public actual fun qOSRemoveSocketFromFlow(qoshandle: Handle, socket: Socket, flowid: UInt, flags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementQosQOSRemoveSocketFromFlow")

public actual fun qOSSetFlow(qoshandle: Handle, flowid: UInt, operation: QosSetFlow, size: UInt, buffer: ConstPtr<CVoid>, flags: UInt, overlapped: MutPtr<Overlapped>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementQosQOSSetFlow")

public actual fun qOSStartTrackingClient(qoshandle: Handle, destaddr: ConstPtr<Sockaddr>, flags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementQosQOSStartTrackingClient")

public actual fun qOSStopTrackingClient(qoshandle: Handle, destaddr: ConstPtr<Sockaddr>, flags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementQosQOSStopTrackingClient")

public actual fun tcAddFilter(flowhandle: Handle, pgenericfilter: ConstPtr<TcGenFilter>, pfilterhandle: MutPtr<Handle>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementQosTcAddFilter")

public actual fun tcAddFlow(ifchandle: Handle, clflowctx: Handle, flags: UInt, pgenericflow: ConstPtr<TcGenFlow>, pflowhandle: MutPtr<Handle>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementQosTcAddFlow")

public actual fun tcCloseInterface(ifchandle: Handle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementQosTcCloseInterface")

public actual fun tcDeleteFilter(filterhandle: Handle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementQosTcDeleteFilter")

public actual fun tcDeleteFlow(flowhandle: Handle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementQosTcDeleteFlow")

public actual fun tcDeregisterClient(clienthandle: Handle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementQosTcDeregisterClient")

public actual fun tcEnumerateFlows(ifchandle: Handle, penumhandle: MutPtr<Handle>, pflowcount: MutPtr<UInt>, pbufsize: MutPtr<UInt>, buffer: MutPtr<EnumerationBuffer>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementQosTcEnumerateFlows")

public actual fun tcEnumerateInterfaces(clienthandle: Handle, pbuffersize: MutPtr<UInt>, interfacebuffer: MutPtr<TcIfcDescriptor>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementQosTcEnumerateInterfaces")

public actual fun tcGetFlowNameA(flowhandle: Handle, strsize: UInt, pflowname: Pstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementQosTcGetFlowNameA")

public actual fun tcGetFlowNameW(flowhandle: Handle, strsize: UInt, pflowname: Pwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementQosTcGetFlowNameW")

public actual fun tcModifyFlow(flowhandle: Handle, pgenericflow: ConstPtr<TcGenFlow>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementQosTcModifyFlow")

public actual fun tcOpenInterfaceA(pinterfacename: Pcstr, clienthandle: Handle, clifcctx: Handle, pifchandle: MutPtr<Handle>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementQosTcOpenInterfaceA")

public actual fun tcOpenInterfaceW(pinterfacename: Pcwstr, clienthandle: Handle, clifcctx: Handle, pifchandle: MutPtr<Handle>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementQosTcOpenInterfaceW")

public actual fun tcQueryFlowA(pflowname: Pcstr, pguidparam: ConstPtr<Guid>, pbuffersize: MutPtr<UInt>, buffer: MutPtr<CVoid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementQosTcQueryFlowA")

public actual fun tcQueryFlowW(pflowname: Pcwstr, pguidparam: ConstPtr<Guid>, pbuffersize: MutPtr<UInt>, buffer: MutPtr<CVoid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementQosTcQueryFlowW")

public actual fun tcQueryInterface(ifchandle: Handle, pguidparam: ConstPtr<Guid>, notifychange: Boolean, pbuffersize: MutPtr<UInt>, buffer: MutPtr<CVoid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementQosTcQueryInterface")

public actual fun tcRegisterClient(tciversion: UInt, clregctx: Handle, clienthandlerlist: ConstPtr<TciClientFuncList>, pclienthandle: MutPtr<Handle>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementQosTcRegisterClient")

public actual fun tcSetFlowA(pflowname: Pcstr, pguidparam: ConstPtr<Guid>, buffersize: UInt, buffer: ConstPtr<CVoid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementQosTcSetFlowA")

public actual fun tcSetFlowW(pflowname: Pcwstr, pguidparam: ConstPtr<Guid>, buffersize: UInt, buffer: ConstPtr<CVoid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementQosTcSetFlowW")

public actual fun tcSetInterface(ifchandle: Handle, pguidparam: ConstPtr<Guid>, buffersize: UInt, buffer: ConstPtr<CVoid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementQosTcSetInterface")
