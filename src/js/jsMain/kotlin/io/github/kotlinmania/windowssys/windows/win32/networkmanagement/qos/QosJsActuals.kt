@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private val windowsWin32NetworkmanagementQosNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun qOSAddSocketToFlow(qoshandle: Handle, socket: Socket, destaddr: ConstPtr, traffictype: QosTrafficType, flags: UInt, flowid: MutPtr): Bool =
    if (windowsWin32NetworkmanagementQosNapiAddon != null) (windowsWin32NetworkmanagementQosNapiAddon.windowssysWindowsWin32NetworkmanagementQosQOSAddSocketToFlow(qoshandle.rawAddress.toString(), socket.toString(), destaddr.rawAddress.toString(), traffictype, flags.toInt(), flowid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qOSCancel(qoshandle: Handle, overlapped: ConstPtr): Bool =
    if (windowsWin32NetworkmanagementQosNapiAddon != null) (windowsWin32NetworkmanagementQosNapiAddon.windowssysWindowsWin32NetworkmanagementQosQOSCancel(qoshandle.rawAddress.toString(), overlapped.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qOSCloseHandle(qoshandle: Handle): Bool =
    if (windowsWin32NetworkmanagementQosNapiAddon != null) (windowsWin32NetworkmanagementQosNapiAddon.windowssysWindowsWin32NetworkmanagementQosQOSCloseHandle(qoshandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qOSCreateHandle(version: ConstPtr, qoshandle: MutPtr): Bool =
    if (windowsWin32NetworkmanagementQosNapiAddon != null) (windowsWin32NetworkmanagementQosNapiAddon.windowssysWindowsWin32NetworkmanagementQosQOSCreateHandle(version.rawAddress.toString(), qoshandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qOSEnumerateFlows(qoshandle: Handle, size: MutPtr, buffer: MutPtr): Bool =
    if (windowsWin32NetworkmanagementQosNapiAddon != null) (windowsWin32NetworkmanagementQosNapiAddon.windowssysWindowsWin32NetworkmanagementQosQOSEnumerateFlows(qoshandle.rawAddress.toString(), size.rawAddress.toString(), buffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qOSNotifyFlow(qoshandle: Handle, flowid: UInt, operation: QosNotifyFlow, size: MutPtr, buffer: MutPtr, flags: UInt, overlapped: MutPtr): Bool =
    if (windowsWin32NetworkmanagementQosNapiAddon != null) (windowsWin32NetworkmanagementQosNapiAddon.windowssysWindowsWin32NetworkmanagementQosQOSNotifyFlow(qoshandle.rawAddress.toString(), flowid.toInt(), operation, size.rawAddress.toString(), buffer.rawAddress.toString(), flags.toInt(), overlapped.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qOSQueryFlow(qoshandle: Handle, flowid: UInt, operation: QosQueryFlow, size: MutPtr, buffer: MutPtr, flags: UInt, overlapped: MutPtr): Bool =
    if (windowsWin32NetworkmanagementQosNapiAddon != null) (windowsWin32NetworkmanagementQosNapiAddon.windowssysWindowsWin32NetworkmanagementQosQOSQueryFlow(qoshandle.rawAddress.toString(), flowid.toInt(), operation, size.rawAddress.toString(), buffer.rawAddress.toString(), flags.toInt(), overlapped.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qOSRemoveSocketFromFlow(qoshandle: Handle, socket: Socket, flowid: UInt, flags: UInt): Bool =
    if (windowsWin32NetworkmanagementQosNapiAddon != null) (windowsWin32NetworkmanagementQosNapiAddon.windowssysWindowsWin32NetworkmanagementQosQOSRemoveSocketFromFlow(qoshandle.rawAddress.toString(), socket.toString(), flowid.toInt(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qOSSetFlow(qoshandle: Handle, flowid: UInt, operation: QosSetFlow, size: UInt, buffer: ConstPtr, flags: UInt, overlapped: MutPtr): Bool =
    if (windowsWin32NetworkmanagementQosNapiAddon != null) (windowsWin32NetworkmanagementQosNapiAddon.windowssysWindowsWin32NetworkmanagementQosQOSSetFlow(qoshandle.rawAddress.toString(), flowid.toInt(), operation, size.toInt(), buffer.rawAddress.toString(), flags.toInt(), overlapped.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qOSStartTrackingClient(qoshandle: Handle, destaddr: ConstPtr, flags: UInt): Bool =
    if (windowsWin32NetworkmanagementQosNapiAddon != null) (windowsWin32NetworkmanagementQosNapiAddon.windowssysWindowsWin32NetworkmanagementQosQOSStartTrackingClient(qoshandle.rawAddress.toString(), destaddr.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qOSStopTrackingClient(qoshandle: Handle, destaddr: ConstPtr, flags: UInt): Bool =
    if (windowsWin32NetworkmanagementQosNapiAddon != null) (windowsWin32NetworkmanagementQosNapiAddon.windowssysWindowsWin32NetworkmanagementQosQOSStopTrackingClient(qoshandle.rawAddress.toString(), destaddr.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcAddFilter(flowhandle: Handle, pgenericfilter: ConstPtr, pfilterhandle: MutPtr): UInt =
    if (windowsWin32NetworkmanagementQosNapiAddon != null) (windowsWin32NetworkmanagementQosNapiAddon.windowssysWindowsWin32NetworkmanagementQosTcAddFilter(flowhandle.rawAddress.toString(), pgenericfilter.rawAddress.toString(), pfilterhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcAddFlow(ifchandle: Handle, clflowctx: Handle, flags: UInt, pgenericflow: ConstPtr, pflowhandle: MutPtr): UInt =
    if (windowsWin32NetworkmanagementQosNapiAddon != null) (windowsWin32NetworkmanagementQosNapiAddon.windowssysWindowsWin32NetworkmanagementQosTcAddFlow(ifchandle.rawAddress.toString(), clflowctx.rawAddress.toString(), flags.toInt(), pgenericflow.rawAddress.toString(), pflowhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcCloseInterface(ifchandle: Handle): UInt =
    if (windowsWin32NetworkmanagementQosNapiAddon != null) (windowsWin32NetworkmanagementQosNapiAddon.windowssysWindowsWin32NetworkmanagementQosTcCloseInterface(ifchandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcDeleteFilter(filterhandle: Handle): UInt =
    if (windowsWin32NetworkmanagementQosNapiAddon != null) (windowsWin32NetworkmanagementQosNapiAddon.windowssysWindowsWin32NetworkmanagementQosTcDeleteFilter(filterhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcDeleteFlow(flowhandle: Handle): UInt =
    if (windowsWin32NetworkmanagementQosNapiAddon != null) (windowsWin32NetworkmanagementQosNapiAddon.windowssysWindowsWin32NetworkmanagementQosTcDeleteFlow(flowhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcDeregisterClient(clienthandle: Handle): UInt =
    if (windowsWin32NetworkmanagementQosNapiAddon != null) (windowsWin32NetworkmanagementQosNapiAddon.windowssysWindowsWin32NetworkmanagementQosTcDeregisterClient(clienthandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcEnumerateFlows(ifchandle: Handle, penumhandle: MutPtr, pflowcount: MutPtr, pbufsize: MutPtr, buffer: MutPtr): UInt =
    if (windowsWin32NetworkmanagementQosNapiAddon != null) (windowsWin32NetworkmanagementQosNapiAddon.windowssysWindowsWin32NetworkmanagementQosTcEnumerateFlows(ifchandle.rawAddress.toString(), penumhandle.rawAddress.toString(), pflowcount.rawAddress.toString(), pbufsize.rawAddress.toString(), buffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcEnumerateInterfaces(clienthandle: Handle, pbuffersize: MutPtr, interfacebuffer: MutPtr): UInt =
    if (windowsWin32NetworkmanagementQosNapiAddon != null) (windowsWin32NetworkmanagementQosNapiAddon.windowssysWindowsWin32NetworkmanagementQosTcEnumerateInterfaces(clienthandle.rawAddress.toString(), pbuffersize.rawAddress.toString(), interfacebuffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcGetFlowNameA(flowhandle: Handle, strsize: UInt, pflowname: Pstr): UInt =
    if (windowsWin32NetworkmanagementQosNapiAddon != null) (windowsWin32NetworkmanagementQosNapiAddon.windowssysWindowsWin32NetworkmanagementQosTcGetFlowNameA(flowhandle.rawAddress.toString(), strsize.toInt(), pflowname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcGetFlowNameW(flowhandle: Handle, strsize: UInt, pflowname: Pwstr): UInt =
    if (windowsWin32NetworkmanagementQosNapiAddon != null) (windowsWin32NetworkmanagementQosNapiAddon.windowssysWindowsWin32NetworkmanagementQosTcGetFlowNameW(flowhandle.rawAddress.toString(), strsize.toInt(), pflowname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcModifyFlow(flowhandle: Handle, pgenericflow: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementQosNapiAddon != null) (windowsWin32NetworkmanagementQosNapiAddon.windowssysWindowsWin32NetworkmanagementQosTcModifyFlow(flowhandle.rawAddress.toString(), pgenericflow.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcOpenInterfaceA(pinterfacename: Pcstr, clienthandle: Handle, clifcctx: Handle, pifchandle: MutPtr): UInt =
    if (windowsWin32NetworkmanagementQosNapiAddon != null) (windowsWin32NetworkmanagementQosNapiAddon.windowssysWindowsWin32NetworkmanagementQosTcOpenInterfaceA(pinterfacename.rawAddress.toString(), clienthandle.rawAddress.toString(), clifcctx.rawAddress.toString(), pifchandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcOpenInterfaceW(pinterfacename: Pcwstr, clienthandle: Handle, clifcctx: Handle, pifchandle: MutPtr): UInt =
    if (windowsWin32NetworkmanagementQosNapiAddon != null) (windowsWin32NetworkmanagementQosNapiAddon.windowssysWindowsWin32NetworkmanagementQosTcOpenInterfaceW(pinterfacename.rawAddress.toString(), clienthandle.rawAddress.toString(), clifcctx.rawAddress.toString(), pifchandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcQueryFlowA(pflowname: Pcstr, pguidparam: ConstPtr, pbuffersize: MutPtr, buffer: MutPtr): UInt =
    if (windowsWin32NetworkmanagementQosNapiAddon != null) (windowsWin32NetworkmanagementQosNapiAddon.windowssysWindowsWin32NetworkmanagementQosTcQueryFlowA(pflowname.rawAddress.toString(), pguidparam.rawAddress.toString(), pbuffersize.rawAddress.toString(), buffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcQueryFlowW(pflowname: Pcwstr, pguidparam: ConstPtr, pbuffersize: MutPtr, buffer: MutPtr): UInt =
    if (windowsWin32NetworkmanagementQosNapiAddon != null) (windowsWin32NetworkmanagementQosNapiAddon.windowssysWindowsWin32NetworkmanagementQosTcQueryFlowW(pflowname.rawAddress.toString(), pguidparam.rawAddress.toString(), pbuffersize.rawAddress.toString(), buffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcQueryInterface(ifchandle: Handle, pguidparam: ConstPtr, notifychange: Boolean, pbuffersize: MutPtr, buffer: MutPtr): UInt =
    if (windowsWin32NetworkmanagementQosNapiAddon != null) (windowsWin32NetworkmanagementQosNapiAddon.windowssysWindowsWin32NetworkmanagementQosTcQueryInterface(ifchandle.rawAddress.toString(), pguidparam.rawAddress.toString(), notifychange, pbuffersize.rawAddress.toString(), buffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcRegisterClient(tciversion: UInt, clregctx: Handle, clienthandlerlist: ConstPtr, pclienthandle: MutPtr): UInt =
    if (windowsWin32NetworkmanagementQosNapiAddon != null) (windowsWin32NetworkmanagementQosNapiAddon.windowssysWindowsWin32NetworkmanagementQosTcRegisterClient(tciversion.toInt(), clregctx.rawAddress.toString(), clienthandlerlist.rawAddress.toString(), pclienthandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcSetFlowA(pflowname: Pcstr, pguidparam: ConstPtr, buffersize: UInt, buffer: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementQosNapiAddon != null) (windowsWin32NetworkmanagementQosNapiAddon.windowssysWindowsWin32NetworkmanagementQosTcSetFlowA(pflowname.rawAddress.toString(), pguidparam.rawAddress.toString(), buffersize.toInt(), buffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcSetFlowW(pflowname: Pcwstr, pguidparam: ConstPtr, buffersize: UInt, buffer: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementQosNapiAddon != null) (windowsWin32NetworkmanagementQosNapiAddon.windowssysWindowsWin32NetworkmanagementQosTcSetFlowW(pflowname.rawAddress.toString(), pguidparam.rawAddress.toString(), buffersize.toInt(), buffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tcSetInterface(ifchandle: Handle, pguidparam: ConstPtr, buffersize: UInt, buffer: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementQosNapiAddon != null) (windowsWin32NetworkmanagementQosNapiAddon.windowssysWindowsWin32NetworkmanagementQosTcSetInterface(ifchandle.rawAddress.toString(), pguidparam.rawAddress.toString(), buffersize.toInt(), buffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
