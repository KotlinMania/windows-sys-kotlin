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

private val _windowsWin32NetworkmanagementQosNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun qOSAddSocketToFlow(qoshandle: Handle, socket: Socket, destaddr: COpaquePointer?, traffictype: QosTrafficType, flags: UInt, flowid: COpaquePointer?): Bool =
    if (_windowsWin32NetworkmanagementQosNapiAddon != null) (_windowsWin32NetworkmanagementQosNapiAddon.windowssys_windows_win32_networkmanagement_qos_qOSAddSocketToFlow((qoshandle?.value ?: 0L).toString(), socket.toString(), (destaddr?.value ?: 0L).toString(), traffictype, flags.toInt(), (flowid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qOSCancel(qoshandle: Handle, overlapped: COpaquePointer?): Bool =
    if (_windowsWin32NetworkmanagementQosNapiAddon != null) (_windowsWin32NetworkmanagementQosNapiAddon.windowssys_windows_win32_networkmanagement_qos_qOSCancel((qoshandle?.value ?: 0L).toString(), (overlapped?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qOSCloseHandle(qoshandle: Handle): Bool =
    if (_windowsWin32NetworkmanagementQosNapiAddon != null) (_windowsWin32NetworkmanagementQosNapiAddon.windowssys_windows_win32_networkmanagement_qos_qOSCloseHandle((qoshandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qOSCreateHandle(version: COpaquePointer?, qoshandle: COpaquePointer?): Bool =
    if (_windowsWin32NetworkmanagementQosNapiAddon != null) (_windowsWin32NetworkmanagementQosNapiAddon.windowssys_windows_win32_networkmanagement_qos_qOSCreateHandle((version?.value ?: 0L).toString(), (qoshandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qOSEnumerateFlows(qoshandle: Handle, size: COpaquePointer?, buffer: COpaquePointer?): Bool =
    if (_windowsWin32NetworkmanagementQosNapiAddon != null) (_windowsWin32NetworkmanagementQosNapiAddon.windowssys_windows_win32_networkmanagement_qos_qOSEnumerateFlows((qoshandle?.value ?: 0L).toString(), (size?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qOSNotifyFlow(qoshandle: Handle, flowid: UInt, operation: QosNotifyFlow, size: COpaquePointer?, buffer: COpaquePointer?, flags: UInt, overlapped: COpaquePointer?): Bool =
    if (_windowsWin32NetworkmanagementQosNapiAddon != null) (_windowsWin32NetworkmanagementQosNapiAddon.windowssys_windows_win32_networkmanagement_qos_qOSNotifyFlow((qoshandle?.value ?: 0L).toString(), flowid.toInt(), operation, (size?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), flags.toInt(), (overlapped?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qOSQueryFlow(qoshandle: Handle, flowid: UInt, operation: QosQueryFlow, size: COpaquePointer?, buffer: COpaquePointer?, flags: UInt, overlapped: COpaquePointer?): Bool =
    if (_windowsWin32NetworkmanagementQosNapiAddon != null) (_windowsWin32NetworkmanagementQosNapiAddon.windowssys_windows_win32_networkmanagement_qos_qOSQueryFlow((qoshandle?.value ?: 0L).toString(), flowid.toInt(), operation, (size?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), flags.toInt(), (overlapped?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qOSRemoveSocketFromFlow(qoshandle: Handle, socket: Socket, flowid: UInt, flags: UInt): Bool =
    if (_windowsWin32NetworkmanagementQosNapiAddon != null) (_windowsWin32NetworkmanagementQosNapiAddon.windowssys_windows_win32_networkmanagement_qos_qOSRemoveSocketFromFlow((qoshandle?.value ?: 0L).toString(), socket.toString(), flowid.toInt(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qOSSetFlow(qoshandle: Handle, flowid: UInt, operation: QosSetFlow, size: UInt, buffer: COpaquePointer?, flags: UInt, overlapped: COpaquePointer?): Bool =
    if (_windowsWin32NetworkmanagementQosNapiAddon != null) (_windowsWin32NetworkmanagementQosNapiAddon.windowssys_windows_win32_networkmanagement_qos_qOSSetFlow((qoshandle?.value ?: 0L).toString(), flowid.toInt(), operation, size.toInt(), (buffer?.value ?: 0L).toString(), flags.toInt(), (overlapped?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qOSStartTrackingClient(qoshandle: Handle, destaddr: COpaquePointer?, flags: UInt): Bool =
    if (_windowsWin32NetworkmanagementQosNapiAddon != null) (_windowsWin32NetworkmanagementQosNapiAddon.windowssys_windows_win32_networkmanagement_qos_qOSStartTrackingClient((qoshandle?.value ?: 0L).toString(), (destaddr?.value ?: 0L).toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qOSStopTrackingClient(qoshandle: Handle, destaddr: COpaquePointer?, flags: UInt): Bool =
    if (_windowsWin32NetworkmanagementQosNapiAddon != null) (_windowsWin32NetworkmanagementQosNapiAddon.windowssys_windows_win32_networkmanagement_qos_qOSStopTrackingClient((qoshandle?.value ?: 0L).toString(), (destaddr?.value ?: 0L).toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcAddFilter(flowhandle: Handle, pgenericfilter: COpaquePointer?, pfilterhandle: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementQosNapiAddon != null) (_windowsWin32NetworkmanagementQosNapiAddon.windowssys_windows_win32_networkmanagement_qos_tcAddFilter((flowhandle?.value ?: 0L).toString(), (pgenericfilter?.value ?: 0L).toString(), (pfilterhandle?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcAddFlow(ifchandle: Handle, clflowctx: Handle, flags: UInt, pgenericflow: COpaquePointer?, pflowhandle: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementQosNapiAddon != null) (_windowsWin32NetworkmanagementQosNapiAddon.windowssys_windows_win32_networkmanagement_qos_tcAddFlow((ifchandle?.value ?: 0L).toString(), (clflowctx?.value ?: 0L).toString(), flags.toInt(), (pgenericflow?.value ?: 0L).toString(), (pflowhandle?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcCloseInterface(ifchandle: Handle): UInt =
    if (_windowsWin32NetworkmanagementQosNapiAddon != null) (_windowsWin32NetworkmanagementQosNapiAddon.windowssys_windows_win32_networkmanagement_qos_tcCloseInterface((ifchandle?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcDeleteFilter(filterhandle: Handle): UInt =
    if (_windowsWin32NetworkmanagementQosNapiAddon != null) (_windowsWin32NetworkmanagementQosNapiAddon.windowssys_windows_win32_networkmanagement_qos_tcDeleteFilter((filterhandle?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcDeleteFlow(flowhandle: Handle): UInt =
    if (_windowsWin32NetworkmanagementQosNapiAddon != null) (_windowsWin32NetworkmanagementQosNapiAddon.windowssys_windows_win32_networkmanagement_qos_tcDeleteFlow((flowhandle?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcDeregisterClient(clienthandle: Handle): UInt =
    if (_windowsWin32NetworkmanagementQosNapiAddon != null) (_windowsWin32NetworkmanagementQosNapiAddon.windowssys_windows_win32_networkmanagement_qos_tcDeregisterClient((clienthandle?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcEnumerateFlows(ifchandle: Handle, penumhandle: COpaquePointer?, pflowcount: COpaquePointer?, pbufsize: COpaquePointer?, buffer: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementQosNapiAddon != null) (_windowsWin32NetworkmanagementQosNapiAddon.windowssys_windows_win32_networkmanagement_qos_tcEnumerateFlows((ifchandle?.value ?: 0L).toString(), (penumhandle?.value ?: 0L).toString(), (pflowcount?.value ?: 0L).toString(), (pbufsize?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcEnumerateInterfaces(clienthandle: Handle, pbuffersize: COpaquePointer?, interfacebuffer: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementQosNapiAddon != null) (_windowsWin32NetworkmanagementQosNapiAddon.windowssys_windows_win32_networkmanagement_qos_tcEnumerateInterfaces((clienthandle?.value ?: 0L).toString(), (pbuffersize?.value ?: 0L).toString(), (interfacebuffer?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcGetFlowNameA(flowhandle: Handle, strsize: UInt, pflowname: Pstr): UInt =
    if (_windowsWin32NetworkmanagementQosNapiAddon != null) (_windowsWin32NetworkmanagementQosNapiAddon.windowssys_windows_win32_networkmanagement_qos_tcGetFlowNameA((flowhandle?.value ?: 0L).toString(), strsize.toInt(), (pflowname?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcGetFlowNameW(flowhandle: Handle, strsize: UInt, pflowname: Pwstr): UInt =
    if (_windowsWin32NetworkmanagementQosNapiAddon != null) (_windowsWin32NetworkmanagementQosNapiAddon.windowssys_windows_win32_networkmanagement_qos_tcGetFlowNameW((flowhandle?.value ?: 0L).toString(), strsize.toInt(), (pflowname?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcModifyFlow(flowhandle: Handle, pgenericflow: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementQosNapiAddon != null) (_windowsWin32NetworkmanagementQosNapiAddon.windowssys_windows_win32_networkmanagement_qos_tcModifyFlow((flowhandle?.value ?: 0L).toString(), (pgenericflow?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcOpenInterfaceA(pinterfacename: Pcstr, clienthandle: Handle, clifcctx: Handle, pifchandle: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementQosNapiAddon != null) (_windowsWin32NetworkmanagementQosNapiAddon.windowssys_windows_win32_networkmanagement_qos_tcOpenInterfaceA((pinterfacename?.value ?: 0L).toString(), (clienthandle?.value ?: 0L).toString(), (clifcctx?.value ?: 0L).toString(), (pifchandle?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcOpenInterfaceW(pinterfacename: Pcwstr, clienthandle: Handle, clifcctx: Handle, pifchandle: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementQosNapiAddon != null) (_windowsWin32NetworkmanagementQosNapiAddon.windowssys_windows_win32_networkmanagement_qos_tcOpenInterfaceW((pinterfacename?.value ?: 0L).toString(), (clienthandle?.value ?: 0L).toString(), (clifcctx?.value ?: 0L).toString(), (pifchandle?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcQueryFlowA(pflowname: Pcstr, pguidparam: COpaquePointer?, pbuffersize: COpaquePointer?, buffer: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementQosNapiAddon != null) (_windowsWin32NetworkmanagementQosNapiAddon.windowssys_windows_win32_networkmanagement_qos_tcQueryFlowA((pflowname?.value ?: 0L).toString(), (pguidparam?.value ?: 0L).toString(), (pbuffersize?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcQueryFlowW(pflowname: Pcwstr, pguidparam: COpaquePointer?, pbuffersize: COpaquePointer?, buffer: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementQosNapiAddon != null) (_windowsWin32NetworkmanagementQosNapiAddon.windowssys_windows_win32_networkmanagement_qos_tcQueryFlowW((pflowname?.value ?: 0L).toString(), (pguidparam?.value ?: 0L).toString(), (pbuffersize?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcQueryInterface(ifchandle: Handle, pguidparam: COpaquePointer?, notifychange: Boolean, pbuffersize: COpaquePointer?, buffer: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementQosNapiAddon != null) (_windowsWin32NetworkmanagementQosNapiAddon.windowssys_windows_win32_networkmanagement_qos_tcQueryInterface((ifchandle?.value ?: 0L).toString(), (pguidparam?.value ?: 0L).toString(), notifychange, (pbuffersize?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcRegisterClient(tciversion: UInt, clregctx: Handle, clienthandlerlist: COpaquePointer?, pclienthandle: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementQosNapiAddon != null) (_windowsWin32NetworkmanagementQosNapiAddon.windowssys_windows_win32_networkmanagement_qos_tcRegisterClient(tciversion.toInt(), (clregctx?.value ?: 0L).toString(), (clienthandlerlist?.value ?: 0L).toString(), (pclienthandle?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcSetFlowA(pflowname: Pcstr, pguidparam: COpaquePointer?, buffersize: UInt, buffer: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementQosNapiAddon != null) (_windowsWin32NetworkmanagementQosNapiAddon.windowssys_windows_win32_networkmanagement_qos_tcSetFlowA((pflowname?.value ?: 0L).toString(), (pguidparam?.value ?: 0L).toString(), buffersize.toInt(), (buffer?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcSetFlowW(pflowname: Pcwstr, pguidparam: COpaquePointer?, buffersize: UInt, buffer: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementQosNapiAddon != null) (_windowsWin32NetworkmanagementQosNapiAddon.windowssys_windows_win32_networkmanagement_qos_tcSetFlowW((pflowname?.value ?: 0L).toString(), (pguidparam?.value ?: 0L).toString(), buffersize.toInt(), (buffer?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcSetInterface(ifchandle: Handle, pguidparam: COpaquePointer?, buffersize: UInt, buffer: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementQosNapiAddon != null) (_windowsWin32NetworkmanagementQosNapiAddon.windowssys_windows_win32_networkmanagement_qos_tcSetInterface((ifchandle?.value ?: 0L).toString(), (pguidparam?.value ?: 0L).toString(), buffersize.toInt(), (buffer?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
