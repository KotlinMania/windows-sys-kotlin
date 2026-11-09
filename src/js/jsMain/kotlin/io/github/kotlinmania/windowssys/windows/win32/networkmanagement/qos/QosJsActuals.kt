@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.SOCKET

private val _windowsWin32NetworkmanagementQosNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun QOSAddSocketToFlow(qoshandle: HANDLE, socket: SOCKET, destaddr: Long, traffictype: QOS_TRAFFIC_TYPE, flags: UInt, flowid: Long): BOOL =
    if (_windowsWin32NetworkmanagementQosNapiAddon != null) (_windowsWin32NetworkmanagementQosNapiAddon.windowssys_windows_win32_networkmanagement_qos_QOSAddSocketToFlow(qoshandle.toString(), socket.toString(), destaddr.toString(), traffictype, flags.toInt(), flowid.toString()) as Int) else 0

public actual fun QOSCancel(qoshandle: HANDLE, overlapped: Long): BOOL =
    if (_windowsWin32NetworkmanagementQosNapiAddon != null) (_windowsWin32NetworkmanagementQosNapiAddon.windowssys_windows_win32_networkmanagement_qos_QOSCancel(qoshandle.toString(), overlapped.toString()) as Int) else 0

public actual fun QOSCloseHandle(qoshandle: HANDLE): BOOL =
    if (_windowsWin32NetworkmanagementQosNapiAddon != null) (_windowsWin32NetworkmanagementQosNapiAddon.windowssys_windows_win32_networkmanagement_qos_QOSCloseHandle(qoshandle.toString()) as Int) else 0

public actual fun QOSCreateHandle(version: Long, qoshandle: Long): BOOL =
    if (_windowsWin32NetworkmanagementQosNapiAddon != null) (_windowsWin32NetworkmanagementQosNapiAddon.windowssys_windows_win32_networkmanagement_qos_QOSCreateHandle(version.toString(), qoshandle.toString()) as Int) else 0

public actual fun QOSEnumerateFlows(qoshandle: HANDLE, size: Long, buffer: Long): BOOL =
    if (_windowsWin32NetworkmanagementQosNapiAddon != null) (_windowsWin32NetworkmanagementQosNapiAddon.windowssys_windows_win32_networkmanagement_qos_QOSEnumerateFlows(qoshandle.toString(), size.toString(), buffer.toString()) as Int) else 0

public actual fun QOSNotifyFlow(qoshandle: HANDLE, flowid: UInt, operation: QOS_NOTIFY_FLOW, size: Long, buffer: Long, flags: UInt, overlapped: Long): BOOL =
    if (_windowsWin32NetworkmanagementQosNapiAddon != null) (_windowsWin32NetworkmanagementQosNapiAddon.windowssys_windows_win32_networkmanagement_qos_QOSNotifyFlow(qoshandle.toString(), flowid.toInt(), operation, size.toString(), buffer.toString(), flags.toInt(), overlapped.toString()) as Int) else 0

public actual fun QOSQueryFlow(qoshandle: HANDLE, flowid: UInt, operation: QOS_QUERY_FLOW, size: Long, buffer: Long, flags: UInt, overlapped: Long): BOOL =
    if (_windowsWin32NetworkmanagementQosNapiAddon != null) (_windowsWin32NetworkmanagementQosNapiAddon.windowssys_windows_win32_networkmanagement_qos_QOSQueryFlow(qoshandle.toString(), flowid.toInt(), operation, size.toString(), buffer.toString(), flags.toInt(), overlapped.toString()) as Int) else 0

public actual fun QOSRemoveSocketFromFlow(qoshandle: HANDLE, socket: SOCKET, flowid: UInt, flags: UInt): BOOL =
    if (_windowsWin32NetworkmanagementQosNapiAddon != null) (_windowsWin32NetworkmanagementQosNapiAddon.windowssys_windows_win32_networkmanagement_qos_QOSRemoveSocketFromFlow(qoshandle.toString(), socket.toString(), flowid.toInt(), flags.toInt()) as Int) else 0

public actual fun QOSSetFlow(qoshandle: HANDLE, flowid: UInt, operation: QOS_SET_FLOW, size: UInt, buffer: Long, flags: UInt, overlapped: Long): BOOL =
    if (_windowsWin32NetworkmanagementQosNapiAddon != null) (_windowsWin32NetworkmanagementQosNapiAddon.windowssys_windows_win32_networkmanagement_qos_QOSSetFlow(qoshandle.toString(), flowid.toInt(), operation, size.toInt(), buffer.toString(), flags.toInt(), overlapped.toString()) as Int) else 0

public actual fun QOSStartTrackingClient(qoshandle: HANDLE, destaddr: Long, flags: UInt): BOOL =
    if (_windowsWin32NetworkmanagementQosNapiAddon != null) (_windowsWin32NetworkmanagementQosNapiAddon.windowssys_windows_win32_networkmanagement_qos_QOSStartTrackingClient(qoshandle.toString(), destaddr.toString(), flags.toInt()) as Int) else 0

public actual fun QOSStopTrackingClient(qoshandle: HANDLE, destaddr: Long, flags: UInt): BOOL =
    if (_windowsWin32NetworkmanagementQosNapiAddon != null) (_windowsWin32NetworkmanagementQosNapiAddon.windowssys_windows_win32_networkmanagement_qos_QOSStopTrackingClient(qoshandle.toString(), destaddr.toString(), flags.toInt()) as Int) else 0

public actual fun TcAddFilter(flowhandle: HANDLE, pgenericfilter: Long, pfilterhandle: Long): UInt =
    if (_windowsWin32NetworkmanagementQosNapiAddon != null) (_windowsWin32NetworkmanagementQosNapiAddon.windowssys_windows_win32_networkmanagement_qos_TcAddFilter(flowhandle.toString(), pgenericfilter.toString(), pfilterhandle.toString()) as Int).toUInt() else 0u

public actual fun TcAddFlow(ifchandle: HANDLE, clflowctx: HANDLE, flags: UInt, pgenericflow: Long, pflowhandle: Long): UInt =
    if (_windowsWin32NetworkmanagementQosNapiAddon != null) (_windowsWin32NetworkmanagementQosNapiAddon.windowssys_windows_win32_networkmanagement_qos_TcAddFlow(ifchandle.toString(), clflowctx.toString(), flags.toInt(), pgenericflow.toString(), pflowhandle.toString()) as Int).toUInt() else 0u

public actual fun TcCloseInterface(ifchandle: HANDLE): UInt =
    if (_windowsWin32NetworkmanagementQosNapiAddon != null) (_windowsWin32NetworkmanagementQosNapiAddon.windowssys_windows_win32_networkmanagement_qos_TcCloseInterface(ifchandle.toString()) as Int).toUInt() else 0u

public actual fun TcDeleteFilter(filterhandle: HANDLE): UInt =
    if (_windowsWin32NetworkmanagementQosNapiAddon != null) (_windowsWin32NetworkmanagementQosNapiAddon.windowssys_windows_win32_networkmanagement_qos_TcDeleteFilter(filterhandle.toString()) as Int).toUInt() else 0u

public actual fun TcDeleteFlow(flowhandle: HANDLE): UInt =
    if (_windowsWin32NetworkmanagementQosNapiAddon != null) (_windowsWin32NetworkmanagementQosNapiAddon.windowssys_windows_win32_networkmanagement_qos_TcDeleteFlow(flowhandle.toString()) as Int).toUInt() else 0u

public actual fun TcDeregisterClient(clienthandle: HANDLE): UInt =
    if (_windowsWin32NetworkmanagementQosNapiAddon != null) (_windowsWin32NetworkmanagementQosNapiAddon.windowssys_windows_win32_networkmanagement_qos_TcDeregisterClient(clienthandle.toString()) as Int).toUInt() else 0u

public actual fun TcEnumerateFlows(ifchandle: HANDLE, penumhandle: Long, pflowcount: Long, pbufsize: Long, buffer: Long): UInt =
    if (_windowsWin32NetworkmanagementQosNapiAddon != null) (_windowsWin32NetworkmanagementQosNapiAddon.windowssys_windows_win32_networkmanagement_qos_TcEnumerateFlows(ifchandle.toString(), penumhandle.toString(), pflowcount.toString(), pbufsize.toString(), buffer.toString()) as Int).toUInt() else 0u

public actual fun TcEnumerateInterfaces(clienthandle: HANDLE, pbuffersize: Long, interfacebuffer: Long): UInt =
    if (_windowsWin32NetworkmanagementQosNapiAddon != null) (_windowsWin32NetworkmanagementQosNapiAddon.windowssys_windows_win32_networkmanagement_qos_TcEnumerateInterfaces(clienthandle.toString(), pbuffersize.toString(), interfacebuffer.toString()) as Int).toUInt() else 0u

public actual fun TcGetFlowNameA(flowhandle: HANDLE, strsize: UInt, pflowname: PSTR): UInt =
    if (_windowsWin32NetworkmanagementQosNapiAddon != null) (_windowsWin32NetworkmanagementQosNapiAddon.windowssys_windows_win32_networkmanagement_qos_TcGetFlowNameA(flowhandle.toString(), strsize.toInt(), pflowname.toString()) as Int).toUInt() else 0u

public actual fun TcGetFlowNameW(flowhandle: HANDLE, strsize: UInt, pflowname: PWSTR): UInt =
    if (_windowsWin32NetworkmanagementQosNapiAddon != null) (_windowsWin32NetworkmanagementQosNapiAddon.windowssys_windows_win32_networkmanagement_qos_TcGetFlowNameW(flowhandle.toString(), strsize.toInt(), pflowname.toString()) as Int).toUInt() else 0u

public actual fun TcModifyFlow(flowhandle: HANDLE, pgenericflow: Long): UInt =
    if (_windowsWin32NetworkmanagementQosNapiAddon != null) (_windowsWin32NetworkmanagementQosNapiAddon.windowssys_windows_win32_networkmanagement_qos_TcModifyFlow(flowhandle.toString(), pgenericflow.toString()) as Int).toUInt() else 0u

public actual fun TcOpenInterfaceA(pinterfacename: PCSTR, clienthandle: HANDLE, clifcctx: HANDLE, pifchandle: Long): UInt =
    if (_windowsWin32NetworkmanagementQosNapiAddon != null) (_windowsWin32NetworkmanagementQosNapiAddon.windowssys_windows_win32_networkmanagement_qos_TcOpenInterfaceA(pinterfacename.toString(), clienthandle.toString(), clifcctx.toString(), pifchandle.toString()) as Int).toUInt() else 0u

public actual fun TcOpenInterfaceW(pinterfacename: PCWSTR, clienthandle: HANDLE, clifcctx: HANDLE, pifchandle: Long): UInt =
    if (_windowsWin32NetworkmanagementQosNapiAddon != null) (_windowsWin32NetworkmanagementQosNapiAddon.windowssys_windows_win32_networkmanagement_qos_TcOpenInterfaceW(pinterfacename.toString(), clienthandle.toString(), clifcctx.toString(), pifchandle.toString()) as Int).toUInt() else 0u

public actual fun TcQueryFlowA(pflowname: PCSTR, pguidparam: Long, pbuffersize: Long, buffer: Long): UInt =
    if (_windowsWin32NetworkmanagementQosNapiAddon != null) (_windowsWin32NetworkmanagementQosNapiAddon.windowssys_windows_win32_networkmanagement_qos_TcQueryFlowA(pflowname.toString(), pguidparam.toString(), pbuffersize.toString(), buffer.toString()) as Int).toUInt() else 0u

public actual fun TcQueryFlowW(pflowname: PCWSTR, pguidparam: Long, pbuffersize: Long, buffer: Long): UInt =
    if (_windowsWin32NetworkmanagementQosNapiAddon != null) (_windowsWin32NetworkmanagementQosNapiAddon.windowssys_windows_win32_networkmanagement_qos_TcQueryFlowW(pflowname.toString(), pguidparam.toString(), pbuffersize.toString(), buffer.toString()) as Int).toUInt() else 0u

public actual fun TcQueryInterface(ifchandle: HANDLE, pguidparam: Long, notifychange: Boolean, pbuffersize: Long, buffer: Long): UInt =
    if (_windowsWin32NetworkmanagementQosNapiAddon != null) (_windowsWin32NetworkmanagementQosNapiAddon.windowssys_windows_win32_networkmanagement_qos_TcQueryInterface(ifchandle.toString(), pguidparam.toString(), notifychange, pbuffersize.toString(), buffer.toString()) as Int).toUInt() else 0u

public actual fun TcRegisterClient(tciversion: UInt, clregctx: HANDLE, clienthandlerlist: Long, pclienthandle: Long): UInt =
    if (_windowsWin32NetworkmanagementQosNapiAddon != null) (_windowsWin32NetworkmanagementQosNapiAddon.windowssys_windows_win32_networkmanagement_qos_TcRegisterClient(tciversion.toInt(), clregctx.toString(), clienthandlerlist.toString(), pclienthandle.toString()) as Int).toUInt() else 0u

public actual fun TcSetFlowA(pflowname: PCSTR, pguidparam: Long, buffersize: UInt, buffer: Long): UInt =
    if (_windowsWin32NetworkmanagementQosNapiAddon != null) (_windowsWin32NetworkmanagementQosNapiAddon.windowssys_windows_win32_networkmanagement_qos_TcSetFlowA(pflowname.toString(), pguidparam.toString(), buffersize.toInt(), buffer.toString()) as Int).toUInt() else 0u

public actual fun TcSetFlowW(pflowname: PCWSTR, pguidparam: Long, buffersize: UInt, buffer: Long): UInt =
    if (_windowsWin32NetworkmanagementQosNapiAddon != null) (_windowsWin32NetworkmanagementQosNapiAddon.windowssys_windows_win32_networkmanagement_qos_TcSetFlowW(pflowname.toString(), pguidparam.toString(), buffersize.toInt(), buffer.toString()) as Int).toUInt() else 0u

public actual fun TcSetInterface(ifchandle: HANDLE, pguidparam: Long, buffersize: UInt, buffer: Long): UInt =
    if (_windowsWin32NetworkmanagementQosNapiAddon != null) (_windowsWin32NetworkmanagementQosNapiAddon.windowssys_windows_win32_networkmanagement_qos_TcSetInterface(ifchandle.toString(), pguidparam.toString(), buffersize.toInt(), buffer.toString()) as Int).toUInt() else 0u
