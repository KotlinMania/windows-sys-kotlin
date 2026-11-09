@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.usb

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

private val _windowsWin32DevicesUsbNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun WinUsb_AbortPipe(interfacehandle: WINUSB_INTERFACE_HANDLE, pipeid: UByte): BOOL =
    if (_windowsWin32DevicesUsbNapiAddon != null) (_windowsWin32DevicesUsbNapiAddon.windowssys_windows_win32_devices_usb_WinUsb_AbortPipe(interfacehandle.toString(), pipeid.toInt()) as Int) else 0

public actual fun WinUsb_ControlTransfer(interfacehandle: WINUSB_INTERFACE_HANDLE, setuppacket: WINUSB_SETUP_PACKET, buffer: Long, bufferlength: UInt, lengthtransferred: Long, overlapped: Long): BOOL =
    0

public actual fun WinUsb_FlushPipe(interfacehandle: WINUSB_INTERFACE_HANDLE, pipeid: UByte): BOOL =
    if (_windowsWin32DevicesUsbNapiAddon != null) (_windowsWin32DevicesUsbNapiAddon.windowssys_windows_win32_devices_usb_WinUsb_FlushPipe(interfacehandle.toString(), pipeid.toInt()) as Int) else 0

public actual fun WinUsb_Free(interfacehandle: WINUSB_INTERFACE_HANDLE): BOOL =
    if (_windowsWin32DevicesUsbNapiAddon != null) (_windowsWin32DevicesUsbNapiAddon.windowssys_windows_win32_devices_usb_WinUsb_Free(interfacehandle.toString()) as Int) else 0

public actual fun WinUsb_GetAdjustedFrameNumber(currentframenumber: Long, timestamp: Long): BOOL =
    if (_windowsWin32DevicesUsbNapiAddon != null) (_windowsWin32DevicesUsbNapiAddon.windowssys_windows_win32_devices_usb_WinUsb_GetAdjustedFrameNumber(currentframenumber.toString(), timestamp.toString()) as Int) else 0

public actual fun WinUsb_GetAssociatedInterface(interfacehandle: WINUSB_INTERFACE_HANDLE, associatedinterfaceindex: UByte, associatedinterfacehandle: Long): BOOL =
    if (_windowsWin32DevicesUsbNapiAddon != null) (_windowsWin32DevicesUsbNapiAddon.windowssys_windows_win32_devices_usb_WinUsb_GetAssociatedInterface(interfacehandle.toString(), associatedinterfaceindex.toInt(), associatedinterfacehandle.toString()) as Int) else 0

public actual fun WinUsb_GetCurrentAlternateSetting(interfacehandle: WINUSB_INTERFACE_HANDLE, settingnumber: Long): BOOL =
    if (_windowsWin32DevicesUsbNapiAddon != null) (_windowsWin32DevicesUsbNapiAddon.windowssys_windows_win32_devices_usb_WinUsb_GetCurrentAlternateSetting(interfacehandle.toString(), settingnumber.toString()) as Int) else 0

public actual fun WinUsb_GetCurrentFrameNumber(interfacehandle: WINUSB_INTERFACE_HANDLE, currentframenumber: Long, timestamp: Long): BOOL =
    if (_windowsWin32DevicesUsbNapiAddon != null) (_windowsWin32DevicesUsbNapiAddon.windowssys_windows_win32_devices_usb_WinUsb_GetCurrentFrameNumber(interfacehandle.toString(), currentframenumber.toString(), timestamp.toString()) as Int) else 0

public actual fun WinUsb_GetCurrentFrameNumberAndQpc(interfacehandle: WINUSB_INTERFACE_HANDLE, frameqpcinfo: Long): BOOL =
    if (_windowsWin32DevicesUsbNapiAddon != null) (_windowsWin32DevicesUsbNapiAddon.windowssys_windows_win32_devices_usb_WinUsb_GetCurrentFrameNumberAndQpc(interfacehandle.toString(), frameqpcinfo.toString()) as Int) else 0

public actual fun WinUsb_GetDescriptor(interfacehandle: WINUSB_INTERFACE_HANDLE, descriptortype: UByte, index: UByte, languageid: UShort, buffer: Long, bufferlength: UInt, lengthtransferred: Long): BOOL =
    if (_windowsWin32DevicesUsbNapiAddon != null) (_windowsWin32DevicesUsbNapiAddon.windowssys_windows_win32_devices_usb_WinUsb_GetDescriptor(interfacehandle.toString(), descriptortype.toInt(), index.toInt(), languageid.toInt(), buffer.toString(), bufferlength.toInt(), lengthtransferred.toString()) as Int) else 0

public actual fun WinUsb_GetOverlappedResult(interfacehandle: WINUSB_INTERFACE_HANDLE, lpoverlapped: Long, lpnumberofbytestransferred: Long, bwait: BOOL): BOOL =
    if (_windowsWin32DevicesUsbNapiAddon != null) (_windowsWin32DevicesUsbNapiAddon.windowssys_windows_win32_devices_usb_WinUsb_GetOverlappedResult(interfacehandle.toString(), lpoverlapped.toString(), lpnumberofbytestransferred.toString(), bwait) as Int) else 0

public actual fun WinUsb_GetPipePolicy(interfacehandle: WINUSB_INTERFACE_HANDLE, pipeid: UByte, policytype: WINUSB_PIPE_POLICY, valuelength: Long, value: Long): BOOL =
    if (_windowsWin32DevicesUsbNapiAddon != null) (_windowsWin32DevicesUsbNapiAddon.windowssys_windows_win32_devices_usb_WinUsb_GetPipePolicy(interfacehandle.toString(), pipeid.toInt(), policytype.toInt(), valuelength.toString(), value.toString()) as Int) else 0

public actual fun WinUsb_GetPowerPolicy(interfacehandle: WINUSB_INTERFACE_HANDLE, policytype: WINUSB_POWER_POLICY, valuelength: Long, value: Long): BOOL =
    if (_windowsWin32DevicesUsbNapiAddon != null) (_windowsWin32DevicesUsbNapiAddon.windowssys_windows_win32_devices_usb_WinUsb_GetPowerPolicy(interfacehandle.toString(), policytype.toInt(), valuelength.toString(), value.toString()) as Int) else 0

public actual fun WinUsb_Initialize(devicehandle: HANDLE, interfacehandle: Long): BOOL =
    if (_windowsWin32DevicesUsbNapiAddon != null) (_windowsWin32DevicesUsbNapiAddon.windowssys_windows_win32_devices_usb_WinUsb_Initialize(devicehandle.toString(), interfacehandle.toString()) as Int) else 0

public actual fun WinUsb_ParseConfigurationDescriptor(configurationdescriptor: Long, startposition: Long, interfacenumber: Int, alternatesetting: Int, interfaceclass: Int, interfacesubclass: Int, interfaceprotocol: Int): Long =
    if (_windowsWin32DevicesUsbNapiAddon != null) (_windowsWin32DevicesUsbNapiAddon.windowssys_windows_win32_devices_usb_WinUsb_ParseConfigurationDescriptor(configurationdescriptor.toString(), startposition.toString(), interfacenumber, alternatesetting, interfaceclass, interfacesubclass, interfaceprotocol) as String).toLong() else 0L

public actual fun WinUsb_ParseDescriptors(descriptorbuffer: Long, totallength: UInt, startposition: Long, descriptortype: Int): Long =
    if (_windowsWin32DevicesUsbNapiAddon != null) (_windowsWin32DevicesUsbNapiAddon.windowssys_windows_win32_devices_usb_WinUsb_ParseDescriptors(descriptorbuffer.toString(), totallength.toInt(), startposition.toString(), descriptortype) as String).toLong() else 0L

public actual fun WinUsb_QueryDeviceInformation(interfacehandle: WINUSB_INTERFACE_HANDLE, informationtype: UInt, bufferlength: Long, buffer: Long): BOOL =
    if (_windowsWin32DevicesUsbNapiAddon != null) (_windowsWin32DevicesUsbNapiAddon.windowssys_windows_win32_devices_usb_WinUsb_QueryDeviceInformation(interfacehandle.toString(), informationtype.toInt(), bufferlength.toString(), buffer.toString()) as Int) else 0

public actual fun WinUsb_QueryInterfaceSettings(interfacehandle: WINUSB_INTERFACE_HANDLE, alternateinterfacenumber: UByte, usbaltinterfacedescriptor: Long): BOOL =
    if (_windowsWin32DevicesUsbNapiAddon != null) (_windowsWin32DevicesUsbNapiAddon.windowssys_windows_win32_devices_usb_WinUsb_QueryInterfaceSettings(interfacehandle.toString(), alternateinterfacenumber.toInt(), usbaltinterfacedescriptor.toString()) as Int) else 0

public actual fun WinUsb_QueryPipe(interfacehandle: WINUSB_INTERFACE_HANDLE, alternateinterfacenumber: UByte, pipeindex: UByte, pipeinformation: Long): BOOL =
    if (_windowsWin32DevicesUsbNapiAddon != null) (_windowsWin32DevicesUsbNapiAddon.windowssys_windows_win32_devices_usb_WinUsb_QueryPipe(interfacehandle.toString(), alternateinterfacenumber.toInt(), pipeindex.toInt(), pipeinformation.toString()) as Int) else 0

public actual fun WinUsb_QueryPipeEx(interfacehandle: WINUSB_INTERFACE_HANDLE, alternatesettingnumber: UByte, pipeindex: UByte, pipeinformationex: Long): BOOL =
    if (_windowsWin32DevicesUsbNapiAddon != null) (_windowsWin32DevicesUsbNapiAddon.windowssys_windows_win32_devices_usb_WinUsb_QueryPipeEx(interfacehandle.toString(), alternatesettingnumber.toInt(), pipeindex.toInt(), pipeinformationex.toString()) as Int) else 0

public actual fun WinUsb_ReadIsochPipe(bufferhandle: Long, offset: UInt, length: UInt, framenumber: Long, numberofpackets: UInt, isopacketdescriptors: Long, overlapped: Long): BOOL =
    if (_windowsWin32DevicesUsbNapiAddon != null) (_windowsWin32DevicesUsbNapiAddon.windowssys_windows_win32_devices_usb_WinUsb_ReadIsochPipe(bufferhandle.toString(), offset.toInt(), length.toInt(), framenumber.toString(), numberofpackets.toInt(), isopacketdescriptors.toString(), overlapped.toString()) as Int) else 0

public actual fun WinUsb_ReadIsochPipeAsap(bufferhandle: Long, offset: UInt, length: UInt, continuestream: BOOL, numberofpackets: UInt, isopacketdescriptors: Long, overlapped: Long): BOOL =
    if (_windowsWin32DevicesUsbNapiAddon != null) (_windowsWin32DevicesUsbNapiAddon.windowssys_windows_win32_devices_usb_WinUsb_ReadIsochPipeAsap(bufferhandle.toString(), offset.toInt(), length.toInt(), continuestream, numberofpackets.toInt(), isopacketdescriptors.toString(), overlapped.toString()) as Int) else 0

public actual fun WinUsb_ReadPipe(interfacehandle: WINUSB_INTERFACE_HANDLE, pipeid: UByte, buffer: Long, bufferlength: UInt, lengthtransferred: Long, overlapped: Long): BOOL =
    if (_windowsWin32DevicesUsbNapiAddon != null) (_windowsWin32DevicesUsbNapiAddon.windowssys_windows_win32_devices_usb_WinUsb_ReadPipe(interfacehandle.toString(), pipeid.toInt(), buffer.toString(), bufferlength.toInt(), lengthtransferred.toString(), overlapped.toString()) as Int) else 0

public actual fun WinUsb_RegisterIsochBuffer(interfacehandle: WINUSB_INTERFACE_HANDLE, pipeid: UByte, buffer: Long, bufferlength: UInt, isochbufferhandle: Long): BOOL =
    if (_windowsWin32DevicesUsbNapiAddon != null) (_windowsWin32DevicesUsbNapiAddon.windowssys_windows_win32_devices_usb_WinUsb_RegisterIsochBuffer(interfacehandle.toString(), pipeid.toInt(), buffer.toString(), bufferlength.toInt(), isochbufferhandle.toString()) as Int) else 0

public actual fun WinUsb_ResetPipe(interfacehandle: WINUSB_INTERFACE_HANDLE, pipeid: UByte): BOOL =
    if (_windowsWin32DevicesUsbNapiAddon != null) (_windowsWin32DevicesUsbNapiAddon.windowssys_windows_win32_devices_usb_WinUsb_ResetPipe(interfacehandle.toString(), pipeid.toInt()) as Int) else 0

public actual fun WinUsb_SetCurrentAlternateSetting(interfacehandle: WINUSB_INTERFACE_HANDLE, settingnumber: UByte): BOOL =
    if (_windowsWin32DevicesUsbNapiAddon != null) (_windowsWin32DevicesUsbNapiAddon.windowssys_windows_win32_devices_usb_WinUsb_SetCurrentAlternateSetting(interfacehandle.toString(), settingnumber.toInt()) as Int) else 0

public actual fun WinUsb_SetPipePolicy(interfacehandle: WINUSB_INTERFACE_HANDLE, pipeid: UByte, policytype: WINUSB_PIPE_POLICY, valuelength: UInt, value: Long): BOOL =
    if (_windowsWin32DevicesUsbNapiAddon != null) (_windowsWin32DevicesUsbNapiAddon.windowssys_windows_win32_devices_usb_WinUsb_SetPipePolicy(interfacehandle.toString(), pipeid.toInt(), policytype.toInt(), valuelength.toInt(), value.toString()) as Int) else 0

public actual fun WinUsb_SetPowerPolicy(interfacehandle: WINUSB_INTERFACE_HANDLE, policytype: WINUSB_POWER_POLICY, valuelength: UInt, value: Long): BOOL =
    if (_windowsWin32DevicesUsbNapiAddon != null) (_windowsWin32DevicesUsbNapiAddon.windowssys_windows_win32_devices_usb_WinUsb_SetPowerPolicy(interfacehandle.toString(), policytype.toInt(), valuelength.toInt(), value.toString()) as Int) else 0

public actual fun WinUsb_StartTrackingForTimeSync(interfacehandle: WINUSB_INTERFACE_HANDLE, starttrackinginfo: Long): BOOL =
    if (_windowsWin32DevicesUsbNapiAddon != null) (_windowsWin32DevicesUsbNapiAddon.windowssys_windows_win32_devices_usb_WinUsb_StartTrackingForTimeSync(interfacehandle.toString(), starttrackinginfo.toString()) as Int) else 0

public actual fun WinUsb_StopTrackingForTimeSync(interfacehandle: WINUSB_INTERFACE_HANDLE, stoptrackinginfo: Long): BOOL =
    if (_windowsWin32DevicesUsbNapiAddon != null) (_windowsWin32DevicesUsbNapiAddon.windowssys_windows_win32_devices_usb_WinUsb_StopTrackingForTimeSync(interfacehandle.toString(), stoptrackinginfo.toString()) as Int) else 0

public actual fun WinUsb_UnregisterIsochBuffer(isochbufferhandle: Long): BOOL =
    if (_windowsWin32DevicesUsbNapiAddon != null) (_windowsWin32DevicesUsbNapiAddon.windowssys_windows_win32_devices_usb_WinUsb_UnregisterIsochBuffer(isochbufferhandle.toString()) as Int) else 0

public actual fun WinUsb_WriteIsochPipe(bufferhandle: Long, offset: UInt, length: UInt, framenumber: Long, overlapped: Long): BOOL =
    if (_windowsWin32DevicesUsbNapiAddon != null) (_windowsWin32DevicesUsbNapiAddon.windowssys_windows_win32_devices_usb_WinUsb_WriteIsochPipe(bufferhandle.toString(), offset.toInt(), length.toInt(), framenumber.toString(), overlapped.toString()) as Int) else 0

public actual fun WinUsb_WriteIsochPipeAsap(bufferhandle: Long, offset: UInt, length: UInt, continuestream: BOOL, overlapped: Long): BOOL =
    if (_windowsWin32DevicesUsbNapiAddon != null) (_windowsWin32DevicesUsbNapiAddon.windowssys_windows_win32_devices_usb_WinUsb_WriteIsochPipeAsap(bufferhandle.toString(), offset.toInt(), length.toInt(), continuestream, overlapped.toString()) as Int) else 0

public actual fun WinUsb_WritePipe(interfacehandle: WINUSB_INTERFACE_HANDLE, pipeid: UByte, buffer: Long, bufferlength: UInt, lengthtransferred: Long, overlapped: Long): BOOL =
    if (_windowsWin32DevicesUsbNapiAddon != null) (_windowsWin32DevicesUsbNapiAddon.windowssys_windows_win32_devices_usb_WinUsb_WritePipe(interfacehandle.toString(), pipeid.toInt(), buffer.toString(), bufferlength.toInt(), lengthtransferred.toString(), overlapped.toString()) as Int) else 0
