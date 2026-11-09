@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.usb

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

private object WindowsWin32DevicesUsbJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_devices_usb_WinUsb_AbortPipe(interfacehandle: Long, pipeid: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_usb_WinUsb_FlushPipe(interfacehandle: Long, pipeid: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_usb_WinUsb_Free(interfacehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_usb_WinUsb_GetAdjustedFrameNumber(currentframenumber: Long, timestamp: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_usb_WinUsb_GetAssociatedInterface(interfacehandle: Long, associatedinterfaceindex: Byte, associatedinterfacehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_usb_WinUsb_GetCurrentAlternateSetting(interfacehandle: Long, settingnumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_usb_WinUsb_GetCurrentFrameNumber(interfacehandle: Long, currentframenumber: Long, timestamp: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_usb_WinUsb_GetCurrentFrameNumberAndQpc(interfacehandle: Long, frameqpcinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_usb_WinUsb_GetDescriptor(interfacehandle: Long, descriptortype: Byte, index: Byte, languageid: Short, buffer: Long, bufferlength: Int, lengthtransferred: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_usb_WinUsb_GetOverlappedResult(interfacehandle: Long, lpoverlapped: Long, lpnumberofbytestransferred: Long, bwait: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_usb_WinUsb_GetPipePolicy(interfacehandle: Long, pipeid: Byte, policytype: Int, valuelength: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_usb_WinUsb_GetPowerPolicy(interfacehandle: Long, policytype: Int, valuelength: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_usb_WinUsb_Initialize(devicehandle: Long, interfacehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_usb_WinUsb_ParseConfigurationDescriptor(configurationdescriptor: Long, startposition: Long, interfacenumber: Int, alternatesetting: Int, interfaceclass: Int, interfacesubclass: Int, interfaceprotocol: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_usb_WinUsb_ParseDescriptors(descriptorbuffer: Long, totallength: Int, startposition: Long, descriptortype: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_usb_WinUsb_QueryDeviceInformation(interfacehandle: Long, informationtype: Int, bufferlength: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_usb_WinUsb_QueryInterfaceSettings(interfacehandle: Long, alternateinterfacenumber: Byte, usbaltinterfacedescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_usb_WinUsb_QueryPipe(interfacehandle: Long, alternateinterfacenumber: Byte, pipeindex: Byte, pipeinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_usb_WinUsb_QueryPipeEx(interfacehandle: Long, alternatesettingnumber: Byte, pipeindex: Byte, pipeinformationex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_usb_WinUsb_ReadIsochPipe(bufferhandle: Long, offset: Int, length: Int, framenumber: Long, numberofpackets: Int, isopacketdescriptors: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_usb_WinUsb_ReadIsochPipeAsap(bufferhandle: Long, offset: Int, length: Int, continuestream: Int, numberofpackets: Int, isopacketdescriptors: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_usb_WinUsb_ReadPipe(interfacehandle: Long, pipeid: Byte, buffer: Long, bufferlength: Int, lengthtransferred: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_usb_WinUsb_RegisterIsochBuffer(interfacehandle: Long, pipeid: Byte, buffer: Long, bufferlength: Int, isochbufferhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_usb_WinUsb_ResetPipe(interfacehandle: Long, pipeid: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_usb_WinUsb_SetCurrentAlternateSetting(interfacehandle: Long, settingnumber: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_usb_WinUsb_SetPipePolicy(interfacehandle: Long, pipeid: Byte, policytype: Int, valuelength: Int, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_usb_WinUsb_SetPowerPolicy(interfacehandle: Long, policytype: Int, valuelength: Int, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_usb_WinUsb_StartTrackingForTimeSync(interfacehandle: Long, starttrackinginfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_usb_WinUsb_StopTrackingForTimeSync(interfacehandle: Long, stoptrackinginfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_usb_WinUsb_UnregisterIsochBuffer(isochbufferhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_usb_WinUsb_WriteIsochPipe(bufferhandle: Long, offset: Int, length: Int, framenumber: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_usb_WinUsb_WriteIsochPipeAsap(bufferhandle: Long, offset: Int, length: Int, continuestream: Int, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_usb_WinUsb_WritePipe(interfacehandle: Long, pipeid: Byte, buffer: Long, bufferlength: Int, lengthtransferred: Long, overlapped: Long): Int
}

public actual fun WinUsb_AbortPipe(interfacehandle: WINUSB_INTERFACE_HANDLE, pipeid: UByte): BOOL =
    WindowsWin32DevicesUsbJniBridge.windowssys_windows_win32_devices_usb_WinUsb_AbortPipe(interfacehandle, pipeid.toByte())

public actual fun WinUsb_ControlTransfer(interfacehandle: WINUSB_INTERFACE_HANDLE, setuppacket: WINUSB_SETUP_PACKET, buffer: Long, bufferlength: UInt, lengthtransferred: Long, overlapped: Long): BOOL =
    0

public actual fun WinUsb_FlushPipe(interfacehandle: WINUSB_INTERFACE_HANDLE, pipeid: UByte): BOOL =
    WindowsWin32DevicesUsbJniBridge.windowssys_windows_win32_devices_usb_WinUsb_FlushPipe(interfacehandle, pipeid.toByte())

public actual fun WinUsb_Free(interfacehandle: WINUSB_INTERFACE_HANDLE): BOOL =
    WindowsWin32DevicesUsbJniBridge.windowssys_windows_win32_devices_usb_WinUsb_Free(interfacehandle)

public actual fun WinUsb_GetAdjustedFrameNumber(currentframenumber: Long, timestamp: Long): BOOL =
    WindowsWin32DevicesUsbJniBridge.windowssys_windows_win32_devices_usb_WinUsb_GetAdjustedFrameNumber(currentframenumber, timestamp)

public actual fun WinUsb_GetAssociatedInterface(interfacehandle: WINUSB_INTERFACE_HANDLE, associatedinterfaceindex: UByte, associatedinterfacehandle: Long): BOOL =
    WindowsWin32DevicesUsbJniBridge.windowssys_windows_win32_devices_usb_WinUsb_GetAssociatedInterface(interfacehandle, associatedinterfaceindex.toByte(), associatedinterfacehandle)

public actual fun WinUsb_GetCurrentAlternateSetting(interfacehandle: WINUSB_INTERFACE_HANDLE, settingnumber: Long): BOOL =
    WindowsWin32DevicesUsbJniBridge.windowssys_windows_win32_devices_usb_WinUsb_GetCurrentAlternateSetting(interfacehandle, settingnumber)

public actual fun WinUsb_GetCurrentFrameNumber(interfacehandle: WINUSB_INTERFACE_HANDLE, currentframenumber: Long, timestamp: Long): BOOL =
    WindowsWin32DevicesUsbJniBridge.windowssys_windows_win32_devices_usb_WinUsb_GetCurrentFrameNumber(interfacehandle, currentframenumber, timestamp)

public actual fun WinUsb_GetCurrentFrameNumberAndQpc(interfacehandle: WINUSB_INTERFACE_HANDLE, frameqpcinfo: Long): BOOL =
    WindowsWin32DevicesUsbJniBridge.windowssys_windows_win32_devices_usb_WinUsb_GetCurrentFrameNumberAndQpc(interfacehandle, frameqpcinfo)

public actual fun WinUsb_GetDescriptor(interfacehandle: WINUSB_INTERFACE_HANDLE, descriptortype: UByte, index: UByte, languageid: UShort, buffer: Long, bufferlength: UInt, lengthtransferred: Long): BOOL =
    WindowsWin32DevicesUsbJniBridge.windowssys_windows_win32_devices_usb_WinUsb_GetDescriptor(interfacehandle, descriptortype.toByte(), index.toByte(), languageid.toShort(), buffer, bufferlength.toInt(), lengthtransferred)

public actual fun WinUsb_GetOverlappedResult(interfacehandle: WINUSB_INTERFACE_HANDLE, lpoverlapped: Long, lpnumberofbytestransferred: Long, bwait: BOOL): BOOL =
    WindowsWin32DevicesUsbJniBridge.windowssys_windows_win32_devices_usb_WinUsb_GetOverlappedResult(interfacehandle, lpoverlapped, lpnumberofbytestransferred, bwait)

public actual fun WinUsb_GetPipePolicy(interfacehandle: WINUSB_INTERFACE_HANDLE, pipeid: UByte, policytype: WINUSB_PIPE_POLICY, valuelength: Long, value: Long): BOOL =
    WindowsWin32DevicesUsbJniBridge.windowssys_windows_win32_devices_usb_WinUsb_GetPipePolicy(interfacehandle, pipeid.toByte(), policytype.toInt(), valuelength, value)

public actual fun WinUsb_GetPowerPolicy(interfacehandle: WINUSB_INTERFACE_HANDLE, policytype: WINUSB_POWER_POLICY, valuelength: Long, value: Long): BOOL =
    WindowsWin32DevicesUsbJniBridge.windowssys_windows_win32_devices_usb_WinUsb_GetPowerPolicy(interfacehandle, policytype.toInt(), valuelength, value)

public actual fun WinUsb_Initialize(devicehandle: HANDLE, interfacehandle: Long): BOOL =
    WindowsWin32DevicesUsbJniBridge.windowssys_windows_win32_devices_usb_WinUsb_Initialize(devicehandle, interfacehandle)

public actual fun WinUsb_ParseConfigurationDescriptor(configurationdescriptor: Long, startposition: Long, interfacenumber: Int, alternatesetting: Int, interfaceclass: Int, interfacesubclass: Int, interfaceprotocol: Int): Long =
    WindowsWin32DevicesUsbJniBridge.windowssys_windows_win32_devices_usb_WinUsb_ParseConfigurationDescriptor(configurationdescriptor, startposition, interfacenumber, alternatesetting, interfaceclass, interfacesubclass, interfaceprotocol)

public actual fun WinUsb_ParseDescriptors(descriptorbuffer: Long, totallength: UInt, startposition: Long, descriptortype: Int): Long =
    WindowsWin32DevicesUsbJniBridge.windowssys_windows_win32_devices_usb_WinUsb_ParseDescriptors(descriptorbuffer, totallength.toInt(), startposition, descriptortype)

public actual fun WinUsb_QueryDeviceInformation(interfacehandle: WINUSB_INTERFACE_HANDLE, informationtype: UInt, bufferlength: Long, buffer: Long): BOOL =
    WindowsWin32DevicesUsbJniBridge.windowssys_windows_win32_devices_usb_WinUsb_QueryDeviceInformation(interfacehandle, informationtype.toInt(), bufferlength, buffer)

public actual fun WinUsb_QueryInterfaceSettings(interfacehandle: WINUSB_INTERFACE_HANDLE, alternateinterfacenumber: UByte, usbaltinterfacedescriptor: Long): BOOL =
    WindowsWin32DevicesUsbJniBridge.windowssys_windows_win32_devices_usb_WinUsb_QueryInterfaceSettings(interfacehandle, alternateinterfacenumber.toByte(), usbaltinterfacedescriptor)

public actual fun WinUsb_QueryPipe(interfacehandle: WINUSB_INTERFACE_HANDLE, alternateinterfacenumber: UByte, pipeindex: UByte, pipeinformation: Long): BOOL =
    WindowsWin32DevicesUsbJniBridge.windowssys_windows_win32_devices_usb_WinUsb_QueryPipe(interfacehandle, alternateinterfacenumber.toByte(), pipeindex.toByte(), pipeinformation)

public actual fun WinUsb_QueryPipeEx(interfacehandle: WINUSB_INTERFACE_HANDLE, alternatesettingnumber: UByte, pipeindex: UByte, pipeinformationex: Long): BOOL =
    WindowsWin32DevicesUsbJniBridge.windowssys_windows_win32_devices_usb_WinUsb_QueryPipeEx(interfacehandle, alternatesettingnumber.toByte(), pipeindex.toByte(), pipeinformationex)

public actual fun WinUsb_ReadIsochPipe(bufferhandle: Long, offset: UInt, length: UInt, framenumber: Long, numberofpackets: UInt, isopacketdescriptors: Long, overlapped: Long): BOOL =
    WindowsWin32DevicesUsbJniBridge.windowssys_windows_win32_devices_usb_WinUsb_ReadIsochPipe(bufferhandle, offset.toInt(), length.toInt(), framenumber, numberofpackets.toInt(), isopacketdescriptors, overlapped)

public actual fun WinUsb_ReadIsochPipeAsap(bufferhandle: Long, offset: UInt, length: UInt, continuestream: BOOL, numberofpackets: UInt, isopacketdescriptors: Long, overlapped: Long): BOOL =
    WindowsWin32DevicesUsbJniBridge.windowssys_windows_win32_devices_usb_WinUsb_ReadIsochPipeAsap(bufferhandle, offset.toInt(), length.toInt(), continuestream, numberofpackets.toInt(), isopacketdescriptors, overlapped)

public actual fun WinUsb_ReadPipe(interfacehandle: WINUSB_INTERFACE_HANDLE, pipeid: UByte, buffer: Long, bufferlength: UInt, lengthtransferred: Long, overlapped: Long): BOOL =
    WindowsWin32DevicesUsbJniBridge.windowssys_windows_win32_devices_usb_WinUsb_ReadPipe(interfacehandle, pipeid.toByte(), buffer, bufferlength.toInt(), lengthtransferred, overlapped)

public actual fun WinUsb_RegisterIsochBuffer(interfacehandle: WINUSB_INTERFACE_HANDLE, pipeid: UByte, buffer: Long, bufferlength: UInt, isochbufferhandle: Long): BOOL =
    WindowsWin32DevicesUsbJniBridge.windowssys_windows_win32_devices_usb_WinUsb_RegisterIsochBuffer(interfacehandle, pipeid.toByte(), buffer, bufferlength.toInt(), isochbufferhandle)

public actual fun WinUsb_ResetPipe(interfacehandle: WINUSB_INTERFACE_HANDLE, pipeid: UByte): BOOL =
    WindowsWin32DevicesUsbJniBridge.windowssys_windows_win32_devices_usb_WinUsb_ResetPipe(interfacehandle, pipeid.toByte())

public actual fun WinUsb_SetCurrentAlternateSetting(interfacehandle: WINUSB_INTERFACE_HANDLE, settingnumber: UByte): BOOL =
    WindowsWin32DevicesUsbJniBridge.windowssys_windows_win32_devices_usb_WinUsb_SetCurrentAlternateSetting(interfacehandle, settingnumber.toByte())

public actual fun WinUsb_SetPipePolicy(interfacehandle: WINUSB_INTERFACE_HANDLE, pipeid: UByte, policytype: WINUSB_PIPE_POLICY, valuelength: UInt, value: Long): BOOL =
    WindowsWin32DevicesUsbJniBridge.windowssys_windows_win32_devices_usb_WinUsb_SetPipePolicy(interfacehandle, pipeid.toByte(), policytype.toInt(), valuelength.toInt(), value)

public actual fun WinUsb_SetPowerPolicy(interfacehandle: WINUSB_INTERFACE_HANDLE, policytype: WINUSB_POWER_POLICY, valuelength: UInt, value: Long): BOOL =
    WindowsWin32DevicesUsbJniBridge.windowssys_windows_win32_devices_usb_WinUsb_SetPowerPolicy(interfacehandle, policytype.toInt(), valuelength.toInt(), value)

public actual fun WinUsb_StartTrackingForTimeSync(interfacehandle: WINUSB_INTERFACE_HANDLE, starttrackinginfo: Long): BOOL =
    WindowsWin32DevicesUsbJniBridge.windowssys_windows_win32_devices_usb_WinUsb_StartTrackingForTimeSync(interfacehandle, starttrackinginfo)

public actual fun WinUsb_StopTrackingForTimeSync(interfacehandle: WINUSB_INTERFACE_HANDLE, stoptrackinginfo: Long): BOOL =
    WindowsWin32DevicesUsbJniBridge.windowssys_windows_win32_devices_usb_WinUsb_StopTrackingForTimeSync(interfacehandle, stoptrackinginfo)

public actual fun WinUsb_UnregisterIsochBuffer(isochbufferhandle: Long): BOOL =
    WindowsWin32DevicesUsbJniBridge.windowssys_windows_win32_devices_usb_WinUsb_UnregisterIsochBuffer(isochbufferhandle)

public actual fun WinUsb_WriteIsochPipe(bufferhandle: Long, offset: UInt, length: UInt, framenumber: Long, overlapped: Long): BOOL =
    WindowsWin32DevicesUsbJniBridge.windowssys_windows_win32_devices_usb_WinUsb_WriteIsochPipe(bufferhandle, offset.toInt(), length.toInt(), framenumber, overlapped)

public actual fun WinUsb_WriteIsochPipeAsap(bufferhandle: Long, offset: UInt, length: UInt, continuestream: BOOL, overlapped: Long): BOOL =
    WindowsWin32DevicesUsbJniBridge.windowssys_windows_win32_devices_usb_WinUsb_WriteIsochPipeAsap(bufferhandle, offset.toInt(), length.toInt(), continuestream, overlapped)

public actual fun WinUsb_WritePipe(interfacehandle: WINUSB_INTERFACE_HANDLE, pipeid: UByte, buffer: Long, bufferlength: UInt, lengthtransferred: Long, overlapped: Long): BOOL =
    WindowsWin32DevicesUsbJniBridge.windowssys_windows_win32_devices_usb_WinUsb_WritePipe(interfacehandle, pipeid.toByte(), buffer, bufferlength.toInt(), lengthtransferred, overlapped)
