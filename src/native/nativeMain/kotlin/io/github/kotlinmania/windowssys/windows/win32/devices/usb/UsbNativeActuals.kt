@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.usb

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun WinUsb_AbortPipe(interfacehandle: WINUSB_INTERFACE_HANDLE, pipeid: UByte): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssys_windows_win32_devices_usb_WinUsb_AbortPipe(interfacehandle.toCPointer<ByteVar>(), pipeid)

public actual fun WinUsb_ControlTransfer(interfacehandle: WINUSB_INTERFACE_HANDLE, setuppacket: WINUSB_SETUP_PACKET, buffer: Long, bufferlength: UInt, lengthtransferred: Long, overlapped: Long): BOOL =
    0

public actual fun WinUsb_FlushPipe(interfacehandle: WINUSB_INTERFACE_HANDLE, pipeid: UByte): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssys_windows_win32_devices_usb_WinUsb_FlushPipe(interfacehandle.toCPointer<ByteVar>(), pipeid)

public actual fun WinUsb_Free(interfacehandle: WINUSB_INTERFACE_HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssys_windows_win32_devices_usb_WinUsb_Free(interfacehandle.toCPointer<ByteVar>())

public actual fun WinUsb_GetAdjustedFrameNumber(currentframenumber: Long, timestamp: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssys_windows_win32_devices_usb_WinUsb_GetAdjustedFrameNumber(currentframenumber.toCPointer<ByteVar>(), timestamp)

public actual fun WinUsb_GetAssociatedInterface(interfacehandle: WINUSB_INTERFACE_HANDLE, associatedinterfaceindex: UByte, associatedinterfacehandle: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssys_windows_win32_devices_usb_WinUsb_GetAssociatedInterface(interfacehandle.toCPointer<ByteVar>(), associatedinterfaceindex, associatedinterfacehandle.toCPointer<ByteVar>())

public actual fun WinUsb_GetCurrentAlternateSetting(interfacehandle: WINUSB_INTERFACE_HANDLE, settingnumber: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssys_windows_win32_devices_usb_WinUsb_GetCurrentAlternateSetting(interfacehandle.toCPointer<ByteVar>(), settingnumber.toCPointer<ByteVar>())

public actual fun WinUsb_GetCurrentFrameNumber(interfacehandle: WINUSB_INTERFACE_HANDLE, currentframenumber: Long, timestamp: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssys_windows_win32_devices_usb_WinUsb_GetCurrentFrameNumber(interfacehandle.toCPointer<ByteVar>(), currentframenumber.toCPointer<ByteVar>(), timestamp.toCPointer<ByteVar>())

public actual fun WinUsb_GetCurrentFrameNumberAndQpc(interfacehandle: WINUSB_INTERFACE_HANDLE, frameqpcinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssys_windows_win32_devices_usb_WinUsb_GetCurrentFrameNumberAndQpc(interfacehandle.toCPointer<ByteVar>(), frameqpcinfo.toCPointer<ByteVar>())

public actual fun WinUsb_GetDescriptor(interfacehandle: WINUSB_INTERFACE_HANDLE, descriptortype: UByte, index: UByte, languageid: UShort, buffer: Long, bufferlength: UInt, lengthtransferred: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssys_windows_win32_devices_usb_WinUsb_GetDescriptor(interfacehandle.toCPointer<ByteVar>(), descriptortype, index, languageid, buffer.toCPointer<ByteVar>(), bufferlength, lengthtransferred.toCPointer<ByteVar>())

public actual fun WinUsb_GetOverlappedResult(interfacehandle: WINUSB_INTERFACE_HANDLE, lpoverlapped: Long, lpnumberofbytestransferred: Long, bwait: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssys_windows_win32_devices_usb_WinUsb_GetOverlappedResult(interfacehandle.toCPointer<ByteVar>(), lpoverlapped.toCPointer<ByteVar>(), lpnumberofbytestransferred.toCPointer<ByteVar>(), bwait)

public actual fun WinUsb_GetPipePolicy(interfacehandle: WINUSB_INTERFACE_HANDLE, pipeid: UByte, policytype: WINUSB_PIPE_POLICY, valuelength: Long, value: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssys_windows_win32_devices_usb_WinUsb_GetPipePolicy(interfacehandle.toCPointer<ByteVar>(), pipeid, policytype, valuelength.toCPointer<ByteVar>(), value.toCPointer<ByteVar>())

public actual fun WinUsb_GetPowerPolicy(interfacehandle: WINUSB_INTERFACE_HANDLE, policytype: WINUSB_POWER_POLICY, valuelength: Long, value: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssys_windows_win32_devices_usb_WinUsb_GetPowerPolicy(interfacehandle.toCPointer<ByteVar>(), policytype, valuelength.toCPointer<ByteVar>(), value.toCPointer<ByteVar>())

public actual fun WinUsb_Initialize(devicehandle: HANDLE, interfacehandle: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssys_windows_win32_devices_usb_WinUsb_Initialize(devicehandle.toCPointer<ByteVar>(), interfacehandle.toCPointer<ByteVar>())

public actual fun WinUsb_ParseConfigurationDescriptor(configurationdescriptor: Long, startposition: Long, interfacenumber: Int, alternatesetting: Int, interfaceclass: Int, interfacesubclass: Int, interfaceprotocol: Int): Long =
    io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssys_windows_win32_devices_usb_WinUsb_ParseConfigurationDescriptor(configurationdescriptor.toCPointer<ByteVar>(), startposition.toCPointer<ByteVar>(), interfacenumber, alternatesetting, interfaceclass, interfacesubclass, interfaceprotocol)?.toLong() ?: 0L

public actual fun WinUsb_ParseDescriptors(descriptorbuffer: Long, totallength: UInt, startposition: Long, descriptortype: Int): Long =
    io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssys_windows_win32_devices_usb_WinUsb_ParseDescriptors(descriptorbuffer.toCPointer<ByteVar>(), totallength, startposition.toCPointer<ByteVar>(), descriptortype)?.toLong() ?: 0L

public actual fun WinUsb_QueryDeviceInformation(interfacehandle: WINUSB_INTERFACE_HANDLE, informationtype: UInt, bufferlength: Long, buffer: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssys_windows_win32_devices_usb_WinUsb_QueryDeviceInformation(interfacehandle.toCPointer<ByteVar>(), informationtype, bufferlength.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>())

public actual fun WinUsb_QueryInterfaceSettings(interfacehandle: WINUSB_INTERFACE_HANDLE, alternateinterfacenumber: UByte, usbaltinterfacedescriptor: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssys_windows_win32_devices_usb_WinUsb_QueryInterfaceSettings(interfacehandle.toCPointer<ByteVar>(), alternateinterfacenumber, usbaltinterfacedescriptor.toCPointer<ByteVar>())

public actual fun WinUsb_QueryPipe(interfacehandle: WINUSB_INTERFACE_HANDLE, alternateinterfacenumber: UByte, pipeindex: UByte, pipeinformation: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssys_windows_win32_devices_usb_WinUsb_QueryPipe(interfacehandle.toCPointer<ByteVar>(), alternateinterfacenumber, pipeindex, pipeinformation.toCPointer<ByteVar>())

public actual fun WinUsb_QueryPipeEx(interfacehandle: WINUSB_INTERFACE_HANDLE, alternatesettingnumber: UByte, pipeindex: UByte, pipeinformationex: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssys_windows_win32_devices_usb_WinUsb_QueryPipeEx(interfacehandle.toCPointer<ByteVar>(), alternatesettingnumber, pipeindex, pipeinformationex.toCPointer<ByteVar>())

public actual fun WinUsb_ReadIsochPipe(bufferhandle: Long, offset: UInt, length: UInt, framenumber: Long, numberofpackets: UInt, isopacketdescriptors: Long, overlapped: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssys_windows_win32_devices_usb_WinUsb_ReadIsochPipe(bufferhandle.toCPointer<ByteVar>(), offset, length, framenumber.toCPointer<ByteVar>(), numberofpackets, isopacketdescriptors.toCPointer<ByteVar>(), overlapped.toCPointer<ByteVar>())

public actual fun WinUsb_ReadIsochPipeAsap(bufferhandle: Long, offset: UInt, length: UInt, continuestream: BOOL, numberofpackets: UInt, isopacketdescriptors: Long, overlapped: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssys_windows_win32_devices_usb_WinUsb_ReadIsochPipeAsap(bufferhandle.toCPointer<ByteVar>(), offset, length, continuestream, numberofpackets, isopacketdescriptors.toCPointer<ByteVar>(), overlapped.toCPointer<ByteVar>())

public actual fun WinUsb_ReadPipe(interfacehandle: WINUSB_INTERFACE_HANDLE, pipeid: UByte, buffer: Long, bufferlength: UInt, lengthtransferred: Long, overlapped: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssys_windows_win32_devices_usb_WinUsb_ReadPipe(interfacehandle.toCPointer<ByteVar>(), pipeid, buffer.toCPointer<ByteVar>(), bufferlength, lengthtransferred.toCPointer<ByteVar>(), overlapped.toCPointer<ByteVar>())

public actual fun WinUsb_RegisterIsochBuffer(interfacehandle: WINUSB_INTERFACE_HANDLE, pipeid: UByte, buffer: Long, bufferlength: UInt, isochbufferhandle: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssys_windows_win32_devices_usb_WinUsb_RegisterIsochBuffer(interfacehandle.toCPointer<ByteVar>(), pipeid, buffer.toCPointer<ByteVar>(), bufferlength, isochbufferhandle.toCPointer<ByteVar>())

public actual fun WinUsb_ResetPipe(interfacehandle: WINUSB_INTERFACE_HANDLE, pipeid: UByte): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssys_windows_win32_devices_usb_WinUsb_ResetPipe(interfacehandle.toCPointer<ByteVar>(), pipeid)

public actual fun WinUsb_SetCurrentAlternateSetting(interfacehandle: WINUSB_INTERFACE_HANDLE, settingnumber: UByte): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssys_windows_win32_devices_usb_WinUsb_SetCurrentAlternateSetting(interfacehandle.toCPointer<ByteVar>(), settingnumber)

public actual fun WinUsb_SetPipePolicy(interfacehandle: WINUSB_INTERFACE_HANDLE, pipeid: UByte, policytype: WINUSB_PIPE_POLICY, valuelength: UInt, value: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssys_windows_win32_devices_usb_WinUsb_SetPipePolicy(interfacehandle.toCPointer<ByteVar>(), pipeid, policytype, valuelength, value.toCPointer<ByteVar>())

public actual fun WinUsb_SetPowerPolicy(interfacehandle: WINUSB_INTERFACE_HANDLE, policytype: WINUSB_POWER_POLICY, valuelength: UInt, value: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssys_windows_win32_devices_usb_WinUsb_SetPowerPolicy(interfacehandle.toCPointer<ByteVar>(), policytype, valuelength, value.toCPointer<ByteVar>())

public actual fun WinUsb_StartTrackingForTimeSync(interfacehandle: WINUSB_INTERFACE_HANDLE, starttrackinginfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssys_windows_win32_devices_usb_WinUsb_StartTrackingForTimeSync(interfacehandle.toCPointer<ByteVar>(), starttrackinginfo.toCPointer<ByteVar>())

public actual fun WinUsb_StopTrackingForTimeSync(interfacehandle: WINUSB_INTERFACE_HANDLE, stoptrackinginfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssys_windows_win32_devices_usb_WinUsb_StopTrackingForTimeSync(interfacehandle.toCPointer<ByteVar>(), stoptrackinginfo.toCPointer<ByteVar>())

public actual fun WinUsb_UnregisterIsochBuffer(isochbufferhandle: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssys_windows_win32_devices_usb_WinUsb_UnregisterIsochBuffer(isochbufferhandle.toCPointer<ByteVar>())

public actual fun WinUsb_WriteIsochPipe(bufferhandle: Long, offset: UInt, length: UInt, framenumber: Long, overlapped: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssys_windows_win32_devices_usb_WinUsb_WriteIsochPipe(bufferhandle.toCPointer<ByteVar>(), offset, length, framenumber.toCPointer<ByteVar>(), overlapped.toCPointer<ByteVar>())

public actual fun WinUsb_WriteIsochPipeAsap(bufferhandle: Long, offset: UInt, length: UInt, continuestream: BOOL, overlapped: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssys_windows_win32_devices_usb_WinUsb_WriteIsochPipeAsap(bufferhandle.toCPointer<ByteVar>(), offset, length, continuestream, overlapped.toCPointer<ByteVar>())

public actual fun WinUsb_WritePipe(interfacehandle: WINUSB_INTERFACE_HANDLE, pipeid: UByte, buffer: Long, bufferlength: UInt, lengthtransferred: Long, overlapped: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssys_windows_win32_devices_usb_WinUsb_WritePipe(interfacehandle.toCPointer<ByteVar>(), pipeid, buffer.toCPointer<ByteVar>(), bufferlength, lengthtransferred.toCPointer<ByteVar>(), overlapped.toCPointer<ByteVar>())
