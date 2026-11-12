@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

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

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32NetworkmanagementQosNapiAddon(): Boolean

private val windowsWin32NetworkmanagementQosNapiAvailable: Boolean = initWindowsWin32NetworkmanagementQosNapiAddon()

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementQosQOSAddSocketToFlow(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementQosQOSAddSocketToFlow(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementQosQOSCancel(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementQosQOSCancel(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementQosQOSCloseHandle(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementQosQOSCloseHandle(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementQosQOSCreateHandle(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementQosQOSCreateHandle(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementQosQOSEnumerateFlows(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementQosQOSEnumerateFlows(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementQosQOSNotifyFlow(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementQosQOSNotifyFlow(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementQosQOSQueryFlow(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementQosQOSQueryFlow(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementQosQOSRemoveSocketFromFlow(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementQosQOSRemoveSocketFromFlow(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementQosQOSSetFlow(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementQosQOSSetFlow(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementQosQOSStartTrackingClient(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementQosQOSStartTrackingClient(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementQosQOSStopTrackingClient(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementQosQOSStopTrackingClient(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementQosTcAddFilter(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementQosTcAddFilter(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementQosTcAddFlow(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementQosTcAddFlow(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementQosTcCloseInterface(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementQosTcCloseInterface(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementQosTcDeleteFilter(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementQosTcDeleteFilter(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementQosTcDeleteFlow(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementQosTcDeleteFlow(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementQosTcDeregisterClient(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementQosTcDeregisterClient(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementQosTcEnumerateFlows(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementQosTcEnumerateFlows(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementQosTcEnumerateInterfaces(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementQosTcEnumerateInterfaces(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementQosTcGetFlowNameA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementQosTcGetFlowNameA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementQosTcGetFlowNameW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementQosTcGetFlowNameW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementQosTcModifyFlow(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementQosTcModifyFlow(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementQosTcOpenInterfaceA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementQosTcOpenInterfaceA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementQosTcOpenInterfaceW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementQosTcOpenInterfaceW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementQosTcQueryFlowA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementQosTcQueryFlowA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementQosTcQueryFlowW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementQosTcQueryFlowW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementQosTcQueryInterface(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementQosTcQueryInterface(p0: String, p1: String, p2: Boolean, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementQosTcRegisterClient(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementQosTcRegisterClient(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementQosTcSetFlowA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementQosTcSetFlowA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementQosTcSetFlowW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementQosTcSetFlowW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementQosTcSetInterface(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementQosTcSetInterface(p0: String, p1: String, p2: Int, p3: String): Int

public actual fun qOSAddSocketToFlow(qoshandle: Handle, socket: Socket, destaddr: ConstPtr<Sockaddr>, traffictype: QosTrafficType, flags: UInt, flowid: MutPtr<UInt>): Bool =
    if (windowsWin32NetworkmanagementQosNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementQosQOSAddSocketToFlow(qoshandle.rawAddress.toString(), socket.toString(), destaddr.rawAddress.toString(), traffictype, flags.toInt(), flowid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qOSCancel(qoshandle: Handle, overlapped: ConstPtr<Overlapped>): Bool =
    if (windowsWin32NetworkmanagementQosNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementQosQOSCancel(qoshandle.rawAddress.toString(), overlapped.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qOSCloseHandle(qoshandle: Handle): Bool =
    if (windowsWin32NetworkmanagementQosNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementQosQOSCloseHandle(qoshandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qOSCreateHandle(version: ConstPtr<QosVersion>, qoshandle: MutPtr<Handle>): Bool =
    if (windowsWin32NetworkmanagementQosNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementQosQOSCreateHandle(version.rawAddress.toString(), qoshandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qOSEnumerateFlows(qoshandle: Handle, size: MutPtr<UInt>, buffer: MutPtr<CVoid>): Bool =
    if (windowsWin32NetworkmanagementQosNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementQosQOSEnumerateFlows(qoshandle.rawAddress.toString(), size.rawAddress.toString(), buffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qOSNotifyFlow(qoshandle: Handle, flowid: UInt, operation: QosNotifyFlow, size: MutPtr<UInt>, buffer: MutPtr<CVoid>, flags: UInt, overlapped: MutPtr<Overlapped>): Bool =
    if (windowsWin32NetworkmanagementQosNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementQosQOSNotifyFlow(qoshandle.rawAddress.toString(), flowid.toInt(), operation, size.rawAddress.toString(), buffer.rawAddress.toString(), flags.toInt(), overlapped.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qOSQueryFlow(qoshandle: Handle, flowid: UInt, operation: QosQueryFlow, size: MutPtr<UInt>, buffer: MutPtr<CVoid>, flags: UInt, overlapped: MutPtr<Overlapped>): Bool =
    if (windowsWin32NetworkmanagementQosNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementQosQOSQueryFlow(qoshandle.rawAddress.toString(), flowid.toInt(), operation, size.rawAddress.toString(), buffer.rawAddress.toString(), flags.toInt(), overlapped.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qOSRemoveSocketFromFlow(qoshandle: Handle, socket: Socket, flowid: UInt, flags: UInt): Bool =
    if (windowsWin32NetworkmanagementQosNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementQosQOSRemoveSocketFromFlow(qoshandle.rawAddress.toString(), socket.toString(), flowid.toInt(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qOSSetFlow(qoshandle: Handle, flowid: UInt, operation: QosSetFlow, size: UInt, buffer: ConstPtr<CVoid>, flags: UInt, overlapped: MutPtr<Overlapped>): Bool =
    if (windowsWin32NetworkmanagementQosNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementQosQOSSetFlow(qoshandle.rawAddress.toString(), flowid.toInt(), operation, size.toInt(), buffer.rawAddress.toString(), flags.toInt(), overlapped.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qOSStartTrackingClient(qoshandle: Handle, destaddr: ConstPtr<Sockaddr>, flags: UInt): Bool =
    if (windowsWin32NetworkmanagementQosNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementQosQOSStartTrackingClient(qoshandle.rawAddress.toString(), destaddr.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qOSStopTrackingClient(qoshandle: Handle, destaddr: ConstPtr<Sockaddr>, flags: UInt): Bool =
    if (windowsWin32NetworkmanagementQosNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementQosQOSStopTrackingClient(qoshandle.rawAddress.toString(), destaddr.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcAddFilter(flowhandle: Handle, pgenericfilter: ConstPtr<TcGenFilter>, pfilterhandle: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkmanagementQosNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementQosTcAddFilter(flowhandle.rawAddress.toString(), pgenericfilter.rawAddress.toString(), pfilterhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcAddFlow(ifchandle: Handle, clflowctx: Handle, flags: UInt, pgenericflow: ConstPtr<TcGenFlow>, pflowhandle: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkmanagementQosNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementQosTcAddFlow(ifchandle.rawAddress.toString(), clflowctx.rawAddress.toString(), flags.toInt(), pgenericflow.rawAddress.toString(), pflowhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcCloseInterface(ifchandle: Handle): UInt =
    if (windowsWin32NetworkmanagementQosNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementQosTcCloseInterface(ifchandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcDeleteFilter(filterhandle: Handle): UInt =
    if (windowsWin32NetworkmanagementQosNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementQosTcDeleteFilter(filterhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcDeleteFlow(flowhandle: Handle): UInt =
    if (windowsWin32NetworkmanagementQosNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementQosTcDeleteFlow(flowhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcDeregisterClient(clienthandle: Handle): UInt =
    if (windowsWin32NetworkmanagementQosNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementQosTcDeregisterClient(clienthandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcEnumerateFlows(ifchandle: Handle, penumhandle: MutPtr<Handle>, pflowcount: MutPtr<UInt>, pbufsize: MutPtr<UInt>, buffer: MutPtr<EnumerationBuffer>): UInt =
    if (windowsWin32NetworkmanagementQosNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementQosTcEnumerateFlows(ifchandle.rawAddress.toString(), penumhandle.rawAddress.toString(), pflowcount.rawAddress.toString(), pbufsize.rawAddress.toString(), buffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcEnumerateInterfaces(clienthandle: Handle, pbuffersize: MutPtr<UInt>, interfacebuffer: MutPtr<TcIfcDescriptor>): UInt =
    if (windowsWin32NetworkmanagementQosNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementQosTcEnumerateInterfaces(clienthandle.rawAddress.toString(), pbuffersize.rawAddress.toString(), interfacebuffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcGetFlowNameA(flowhandle: Handle, strsize: UInt, pflowname: Pstr): UInt =
    if (windowsWin32NetworkmanagementQosNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementQosTcGetFlowNameA(flowhandle.rawAddress.toString(), strsize.toInt(), pflowname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcGetFlowNameW(flowhandle: Handle, strsize: UInt, pflowname: Pwstr): UInt =
    if (windowsWin32NetworkmanagementQosNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementQosTcGetFlowNameW(flowhandle.rawAddress.toString(), strsize.toInt(), pflowname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcModifyFlow(flowhandle: Handle, pgenericflow: ConstPtr<TcGenFlow>): UInt =
    if (windowsWin32NetworkmanagementQosNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementQosTcModifyFlow(flowhandle.rawAddress.toString(), pgenericflow.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcOpenInterfaceA(pinterfacename: Pcstr, clienthandle: Handle, clifcctx: Handle, pifchandle: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkmanagementQosNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementQosTcOpenInterfaceA(pinterfacename.rawAddress.toString(), clienthandle.rawAddress.toString(), clifcctx.rawAddress.toString(), pifchandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcOpenInterfaceW(pinterfacename: Pcwstr, clienthandle: Handle, clifcctx: Handle, pifchandle: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkmanagementQosNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementQosTcOpenInterfaceW(pinterfacename.rawAddress.toString(), clienthandle.rawAddress.toString(), clifcctx.rawAddress.toString(), pifchandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcQueryFlowA(pflowname: Pcstr, pguidparam: ConstPtr<Guid>, pbuffersize: MutPtr<UInt>, buffer: MutPtr<CVoid>): UInt =
    if (windowsWin32NetworkmanagementQosNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementQosTcQueryFlowA(pflowname.rawAddress.toString(), pguidparam.rawAddress.toString(), pbuffersize.rawAddress.toString(), buffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcQueryFlowW(pflowname: Pcwstr, pguidparam: ConstPtr<Guid>, pbuffersize: MutPtr<UInt>, buffer: MutPtr<CVoid>): UInt =
    if (windowsWin32NetworkmanagementQosNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementQosTcQueryFlowW(pflowname.rawAddress.toString(), pguidparam.rawAddress.toString(), pbuffersize.rawAddress.toString(), buffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcQueryInterface(ifchandle: Handle, pguidparam: ConstPtr<Guid>, notifychange: Boolean, pbuffersize: MutPtr<UInt>, buffer: MutPtr<CVoid>): UInt =
    if (windowsWin32NetworkmanagementQosNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementQosTcQueryInterface(ifchandle.rawAddress.toString(), pguidparam.rawAddress.toString(), notifychange, pbuffersize.rawAddress.toString(), buffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcRegisterClient(tciversion: UInt, clregctx: Handle, clienthandlerlist: ConstPtr<TciClientFuncList>, pclienthandle: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkmanagementQosNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementQosTcRegisterClient(tciversion.toInt(), clregctx.rawAddress.toString(), clienthandlerlist.rawAddress.toString(), pclienthandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcSetFlowA(pflowname: Pcstr, pguidparam: ConstPtr<Guid>, buffersize: UInt, buffer: ConstPtr<CVoid>): UInt =
    if (windowsWin32NetworkmanagementQosNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementQosTcSetFlowA(pflowname.rawAddress.toString(), pguidparam.rawAddress.toString(), buffersize.toInt(), buffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcSetFlowW(pflowname: Pcwstr, pguidparam: ConstPtr<Guid>, buffersize: UInt, buffer: ConstPtr<CVoid>): UInt =
    if (windowsWin32NetworkmanagementQosNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementQosTcSetFlowW(pflowname.rawAddress.toString(), pguidparam.rawAddress.toString(), buffersize.toInt(), buffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcSetInterface(ifchandle: Handle, pguidparam: ConstPtr<Guid>, buffersize: UInt, buffer: ConstPtr<CVoid>): UInt =
    if (windowsWin32NetworkmanagementQosNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementQosTcSetInterface(ifchandle.rawAddress.toString(), pguidparam.rawAddress.toString(), buffersize.toInt(), buffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
