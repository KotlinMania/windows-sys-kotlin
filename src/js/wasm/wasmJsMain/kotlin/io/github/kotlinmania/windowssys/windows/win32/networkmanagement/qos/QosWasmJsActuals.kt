@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.Socket

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32NetworkmanagementQosNapiAddon(): Boolean

private val _windowsWin32NetworkmanagementQosNapiAvailable: Boolean = _initWindowsWin32NetworkmanagementQosNapiAddon()

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_qos_qOSAddSocketToFlow(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_qos_qOSAddSocketToFlow(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_qos_qOSCancel(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_qos_qOSCancel(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_qos_qOSCloseHandle(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_qos_qOSCloseHandle(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_qos_qOSCreateHandle(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_qos_qOSCreateHandle(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_qos_qOSEnumerateFlows(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_qos_qOSEnumerateFlows(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_qos_qOSNotifyFlow(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_qos_qOSNotifyFlow(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_qos_qOSQueryFlow(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_qos_qOSQueryFlow(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_qos_qOSRemoveSocketFromFlow(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_qos_qOSRemoveSocketFromFlow(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_qos_qOSSetFlow(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_qos_qOSSetFlow(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_qos_qOSStartTrackingClient(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_qos_qOSStartTrackingClient(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_qos_qOSStopTrackingClient(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_qos_qOSStopTrackingClient(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_qos_tcAddFilter(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_qos_tcAddFilter(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_qos_tcAddFlow(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_qos_tcAddFlow(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_qos_tcCloseInterface(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_qos_tcCloseInterface(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_qos_tcDeleteFilter(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_qos_tcDeleteFilter(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_qos_tcDeleteFlow(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_qos_tcDeleteFlow(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_qos_tcDeregisterClient(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_qos_tcDeregisterClient(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_qos_tcEnumerateFlows(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_qos_tcEnumerateFlows(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_qos_tcEnumerateInterfaces(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_qos_tcEnumerateInterfaces(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_qos_tcGetFlowNameA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_qos_tcGetFlowNameA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_qos_tcGetFlowNameW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_qos_tcGetFlowNameW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_qos_tcModifyFlow(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_qos_tcModifyFlow(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_qos_tcOpenInterfaceA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_qos_tcOpenInterfaceA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_qos_tcOpenInterfaceW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_qos_tcOpenInterfaceW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_qos_tcQueryFlowA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_qos_tcQueryFlowA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_qos_tcQueryFlowW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_qos_tcQueryFlowW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_qos_tcQueryInterface(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_qos_tcQueryInterface(p0: String, p1: String, p2: Boolean, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_qos_tcRegisterClient(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_qos_tcRegisterClient(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_qos_tcSetFlowA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_qos_tcSetFlowA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_qos_tcSetFlowW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_qos_tcSetFlowW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_qos_tcSetInterface(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_qos_tcSetInterface(p0: String, p1: String, p2: Int, p3: String): Int

public actual fun qOSAddSocketToFlow(qoshandle: Handle, socket: Socket, destaddr: COpaquePointer?, traffictype: QosTrafficType, flags: UInt, flowid: COpaquePointer?): Bool =
    if (_windowsWin32NetworkmanagementQosNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_qos_qOSAddSocketToFlow((qoshandle?.value ?: 0L).toString(), socket.toString(), (destaddr?.value ?: 0L).toString(), traffictype, flags.toInt(), (flowid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qOSCancel(qoshandle: Handle, overlapped: COpaquePointer?): Bool =
    if (_windowsWin32NetworkmanagementQosNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_qos_qOSCancel((qoshandle?.value ?: 0L).toString(), (overlapped?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qOSCloseHandle(qoshandle: Handle): Bool =
    if (_windowsWin32NetworkmanagementQosNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_qos_qOSCloseHandle((qoshandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qOSCreateHandle(version: COpaquePointer?, qoshandle: COpaquePointer?): Bool =
    if (_windowsWin32NetworkmanagementQosNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_qos_qOSCreateHandle((version?.value ?: 0L).toString(), (qoshandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qOSEnumerateFlows(qoshandle: Handle, size: COpaquePointer?, buffer: COpaquePointer?): Bool =
    if (_windowsWin32NetworkmanagementQosNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_qos_qOSEnumerateFlows((qoshandle?.value ?: 0L).toString(), (size?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qOSNotifyFlow(qoshandle: Handle, flowid: UInt, operation: QosNotifyFlow, size: COpaquePointer?, buffer: COpaquePointer?, flags: UInt, overlapped: COpaquePointer?): Bool =
    if (_windowsWin32NetworkmanagementQosNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_qos_qOSNotifyFlow((qoshandle?.value ?: 0L).toString(), flowid.toInt(), operation, (size?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), flags.toInt(), (overlapped?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qOSQueryFlow(qoshandle: Handle, flowid: UInt, operation: QosQueryFlow, size: COpaquePointer?, buffer: COpaquePointer?, flags: UInt, overlapped: COpaquePointer?): Bool =
    if (_windowsWin32NetworkmanagementQosNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_qos_qOSQueryFlow((qoshandle?.value ?: 0L).toString(), flowid.toInt(), operation, (size?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), flags.toInt(), (overlapped?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qOSRemoveSocketFromFlow(qoshandle: Handle, socket: Socket, flowid: UInt, flags: UInt): Bool =
    if (_windowsWin32NetworkmanagementQosNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_qos_qOSRemoveSocketFromFlow((qoshandle?.value ?: 0L).toString(), socket.toString(), flowid.toInt(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qOSSetFlow(qoshandle: Handle, flowid: UInt, operation: QosSetFlow, size: UInt, buffer: COpaquePointer?, flags: UInt, overlapped: COpaquePointer?): Bool =
    if (_windowsWin32NetworkmanagementQosNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_qos_qOSSetFlow((qoshandle?.value ?: 0L).toString(), flowid.toInt(), operation, size.toInt(), (buffer?.value ?: 0L).toString(), flags.toInt(), (overlapped?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qOSStartTrackingClient(qoshandle: Handle, destaddr: COpaquePointer?, flags: UInt): Bool =
    if (_windowsWin32NetworkmanagementQosNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_qos_qOSStartTrackingClient((qoshandle?.value ?: 0L).toString(), (destaddr?.value ?: 0L).toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qOSStopTrackingClient(qoshandle: Handle, destaddr: COpaquePointer?, flags: UInt): Bool =
    if (_windowsWin32NetworkmanagementQosNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_qos_qOSStopTrackingClient((qoshandle?.value ?: 0L).toString(), (destaddr?.value ?: 0L).toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcAddFilter(flowhandle: Handle, pgenericfilter: COpaquePointer?, pfilterhandle: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementQosNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_qos_tcAddFilter((flowhandle?.value ?: 0L).toString(), (pgenericfilter?.value ?: 0L).toString(), (pfilterhandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcAddFlow(ifchandle: Handle, clflowctx: Handle, flags: UInt, pgenericflow: COpaquePointer?, pflowhandle: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementQosNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_qos_tcAddFlow((ifchandle?.value ?: 0L).toString(), (clflowctx?.value ?: 0L).toString(), flags.toInt(), (pgenericflow?.value ?: 0L).toString(), (pflowhandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcCloseInterface(ifchandle: Handle): UInt =
    if (_windowsWin32NetworkmanagementQosNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_qos_tcCloseInterface((ifchandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcDeleteFilter(filterhandle: Handle): UInt =
    if (_windowsWin32NetworkmanagementQosNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_qos_tcDeleteFilter((filterhandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcDeleteFlow(flowhandle: Handle): UInt =
    if (_windowsWin32NetworkmanagementQosNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_qos_tcDeleteFlow((flowhandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcDeregisterClient(clienthandle: Handle): UInt =
    if (_windowsWin32NetworkmanagementQosNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_qos_tcDeregisterClient((clienthandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcEnumerateFlows(ifchandle: Handle, penumhandle: COpaquePointer?, pflowcount: COpaquePointer?, pbufsize: COpaquePointer?, buffer: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementQosNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_qos_tcEnumerateFlows((ifchandle?.value ?: 0L).toString(), (penumhandle?.value ?: 0L).toString(), (pflowcount?.value ?: 0L).toString(), (pbufsize?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcEnumerateInterfaces(clienthandle: Handle, pbuffersize: COpaquePointer?, interfacebuffer: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementQosNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_qos_tcEnumerateInterfaces((clienthandle?.value ?: 0L).toString(), (pbuffersize?.value ?: 0L).toString(), (interfacebuffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcGetFlowNameA(flowhandle: Handle, strsize: UInt, pflowname: Pstr): UInt =
    if (_windowsWin32NetworkmanagementQosNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_qos_tcGetFlowNameA((flowhandle?.value ?: 0L).toString(), strsize.toInt(), (pflowname?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcGetFlowNameW(flowhandle: Handle, strsize: UInt, pflowname: Pwstr): UInt =
    if (_windowsWin32NetworkmanagementQosNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_qos_tcGetFlowNameW((flowhandle?.value ?: 0L).toString(), strsize.toInt(), (pflowname?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcModifyFlow(flowhandle: Handle, pgenericflow: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementQosNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_qos_tcModifyFlow((flowhandle?.value ?: 0L).toString(), (pgenericflow?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcOpenInterfaceA(pinterfacename: Pcstr, clienthandle: Handle, clifcctx: Handle, pifchandle: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementQosNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_qos_tcOpenInterfaceA((pinterfacename?.value ?: 0L).toString(), (clienthandle?.value ?: 0L).toString(), (clifcctx?.value ?: 0L).toString(), (pifchandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcOpenInterfaceW(pinterfacename: Pcwstr, clienthandle: Handle, clifcctx: Handle, pifchandle: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementQosNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_qos_tcOpenInterfaceW((pinterfacename?.value ?: 0L).toString(), (clienthandle?.value ?: 0L).toString(), (clifcctx?.value ?: 0L).toString(), (pifchandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcQueryFlowA(pflowname: Pcstr, pguidparam: COpaquePointer?, pbuffersize: COpaquePointer?, buffer: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementQosNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_qos_tcQueryFlowA((pflowname?.value ?: 0L).toString(), (pguidparam?.value ?: 0L).toString(), (pbuffersize?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcQueryFlowW(pflowname: Pcwstr, pguidparam: COpaquePointer?, pbuffersize: COpaquePointer?, buffer: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementQosNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_qos_tcQueryFlowW((pflowname?.value ?: 0L).toString(), (pguidparam?.value ?: 0L).toString(), (pbuffersize?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcQueryInterface(ifchandle: Handle, pguidparam: COpaquePointer?, notifychange: Boolean, pbuffersize: COpaquePointer?, buffer: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementQosNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_qos_tcQueryInterface((ifchandle?.value ?: 0L).toString(), (pguidparam?.value ?: 0L).toString(), notifychange, (pbuffersize?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcRegisterClient(tciversion: UInt, clregctx: Handle, clienthandlerlist: COpaquePointer?, pclienthandle: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementQosNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_qos_tcRegisterClient(tciversion.toInt(), (clregctx?.value ?: 0L).toString(), (clienthandlerlist?.value ?: 0L).toString(), (pclienthandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcSetFlowA(pflowname: Pcstr, pguidparam: COpaquePointer?, buffersize: UInt, buffer: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementQosNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_qos_tcSetFlowA((pflowname?.value ?: 0L).toString(), (pguidparam?.value ?: 0L).toString(), buffersize.toInt(), (buffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcSetFlowW(pflowname: Pcwstr, pguidparam: COpaquePointer?, buffersize: UInt, buffer: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementQosNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_qos_tcSetFlowW((pflowname?.value ?: 0L).toString(), (pguidparam?.value ?: 0L).toString(), buffersize.toInt(), (buffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcSetInterface(ifchandle: Handle, pguidparam: COpaquePointer?, buffersize: UInt, buffer: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementQosNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_qos_tcSetInterface((ifchandle?.value ?: 0L).toString(), (pguidparam?.value ?: 0L).toString(), buffersize.toInt(), (buffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
