@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.usb

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public actual fun WinUsb_AbortPipe(interfacehandle: WINUSB_INTERFACE_HANDLE, pipeid: UByte): BOOL =
    0

public actual fun WinUsb_ControlTransfer(interfacehandle: WINUSB_INTERFACE_HANDLE, setuppacket: WINUSB_SETUP_PACKET, buffer: Long, bufferlength: UInt, lengthtransferred: Long, overlapped: Long): BOOL =
    0

public actual fun WinUsb_FlushPipe(interfacehandle: WINUSB_INTERFACE_HANDLE, pipeid: UByte): BOOL =
    0

public actual fun WinUsb_Free(interfacehandle: WINUSB_INTERFACE_HANDLE): BOOL =
    0

public actual fun WinUsb_GetAdjustedFrameNumber(currentframenumber: Long, timestamp: Long): BOOL =
    0

public actual fun WinUsb_GetAssociatedInterface(interfacehandle: WINUSB_INTERFACE_HANDLE, associatedinterfaceindex: UByte, associatedinterfacehandle: Long): BOOL =
    0

public actual fun WinUsb_GetCurrentAlternateSetting(interfacehandle: WINUSB_INTERFACE_HANDLE, settingnumber: Long): BOOL =
    0

public actual fun WinUsb_GetCurrentFrameNumber(interfacehandle: WINUSB_INTERFACE_HANDLE, currentframenumber: Long, timestamp: Long): BOOL =
    0

public actual fun WinUsb_GetCurrentFrameNumberAndQpc(interfacehandle: WINUSB_INTERFACE_HANDLE, frameqpcinfo: Long): BOOL =
    0

public actual fun WinUsb_GetDescriptor(interfacehandle: WINUSB_INTERFACE_HANDLE, descriptortype: UByte, index: UByte, languageid: UShort, buffer: Long, bufferlength: UInt, lengthtransferred: Long): BOOL =
    0

public actual fun WinUsb_GetOverlappedResult(interfacehandle: WINUSB_INTERFACE_HANDLE, lpoverlapped: Long, lpnumberofbytestransferred: Long, bwait: BOOL): BOOL =
    0

public actual fun WinUsb_GetPipePolicy(interfacehandle: WINUSB_INTERFACE_HANDLE, pipeid: UByte, policytype: WINUSB_PIPE_POLICY, valuelength: Long, value: Long): BOOL =
    0

public actual fun WinUsb_GetPowerPolicy(interfacehandle: WINUSB_INTERFACE_HANDLE, policytype: WINUSB_POWER_POLICY, valuelength: Long, value: Long): BOOL =
    0

public actual fun WinUsb_Initialize(devicehandle: HANDLE, interfacehandle: Long): BOOL =
    0

public actual fun WinUsb_ParseConfigurationDescriptor(configurationdescriptor: Long, startposition: Long, interfacenumber: Int, alternatesetting: Int, interfaceclass: Int, interfacesubclass: Int, interfaceprotocol: Int): Long =
    0L

public actual fun WinUsb_ParseDescriptors(descriptorbuffer: Long, totallength: UInt, startposition: Long, descriptortype: Int): Long =
    0L

public actual fun WinUsb_QueryDeviceInformation(interfacehandle: WINUSB_INTERFACE_HANDLE, informationtype: UInt, bufferlength: Long, buffer: Long): BOOL =
    0

public actual fun WinUsb_QueryInterfaceSettings(interfacehandle: WINUSB_INTERFACE_HANDLE, alternateinterfacenumber: UByte, usbaltinterfacedescriptor: Long): BOOL =
    0

public actual fun WinUsb_QueryPipe(interfacehandle: WINUSB_INTERFACE_HANDLE, alternateinterfacenumber: UByte, pipeindex: UByte, pipeinformation: Long): BOOL =
    0

public actual fun WinUsb_QueryPipeEx(interfacehandle: WINUSB_INTERFACE_HANDLE, alternatesettingnumber: UByte, pipeindex: UByte, pipeinformationex: Long): BOOL =
    0

public actual fun WinUsb_ReadIsochPipe(bufferhandle: Long, offset: UInt, length: UInt, framenumber: Long, numberofpackets: UInt, isopacketdescriptors: Long, overlapped: Long): BOOL =
    0

public actual fun WinUsb_ReadIsochPipeAsap(bufferhandle: Long, offset: UInt, length: UInt, continuestream: BOOL, numberofpackets: UInt, isopacketdescriptors: Long, overlapped: Long): BOOL =
    0

public actual fun WinUsb_ReadPipe(interfacehandle: WINUSB_INTERFACE_HANDLE, pipeid: UByte, buffer: Long, bufferlength: UInt, lengthtransferred: Long, overlapped: Long): BOOL =
    0

public actual fun WinUsb_RegisterIsochBuffer(interfacehandle: WINUSB_INTERFACE_HANDLE, pipeid: UByte, buffer: Long, bufferlength: UInt, isochbufferhandle: Long): BOOL =
    0

public actual fun WinUsb_ResetPipe(interfacehandle: WINUSB_INTERFACE_HANDLE, pipeid: UByte): BOOL =
    0

public actual fun WinUsb_SetCurrentAlternateSetting(interfacehandle: WINUSB_INTERFACE_HANDLE, settingnumber: UByte): BOOL =
    0

public actual fun WinUsb_SetPipePolicy(interfacehandle: WINUSB_INTERFACE_HANDLE, pipeid: UByte, policytype: WINUSB_PIPE_POLICY, valuelength: UInt, value: Long): BOOL =
    0

public actual fun WinUsb_SetPowerPolicy(interfacehandle: WINUSB_INTERFACE_HANDLE, policytype: WINUSB_POWER_POLICY, valuelength: UInt, value: Long): BOOL =
    0

public actual fun WinUsb_StartTrackingForTimeSync(interfacehandle: WINUSB_INTERFACE_HANDLE, starttrackinginfo: Long): BOOL =
    0

public actual fun WinUsb_StopTrackingForTimeSync(interfacehandle: WINUSB_INTERFACE_HANDLE, stoptrackinginfo: Long): BOOL =
    0

public actual fun WinUsb_UnregisterIsochBuffer(isochbufferhandle: Long): BOOL =
    0

public actual fun WinUsb_WriteIsochPipe(bufferhandle: Long, offset: UInt, length: UInt, framenumber: Long, overlapped: Long): BOOL =
    0

public actual fun WinUsb_WriteIsochPipeAsap(bufferhandle: Long, offset: UInt, length: UInt, continuestream: BOOL, overlapped: Long): BOOL =
    0

public actual fun WinUsb_WritePipe(interfacehandle: WINUSB_INTERFACE_HANDLE, pipeid: UByte, buffer: Long, bufferlength: UInt, lengthtransferred: Long, overlapped: Long): BOOL =
    0
