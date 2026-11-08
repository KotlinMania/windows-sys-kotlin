package io.github.kotlinmania.windowssys.windows.win32.devices.usb

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public fun WinUsb_AbortPipe(interfacehandle: WINUSB_INTERFACE_HANDLE, pipeid: UByte): BOOL {
    return Win32DynamicFfi.invoke("winusb.dll", "WinUsb_AbortPipe", longArrayOf(interfacehandle, pipeid.toLong())).toInt()
}

public fun WinUsb_ControlTransfer(interfacehandle: WINUSB_INTERFACE_HANDLE, setuppacket: WINUSB_SETUP_PACKET, buffer: Long, bufferlength: UInt, lengthtransferred: Long, overlapped: Long): BOOL {
    return Win32DynamicFfi.invoke("winusb.dll", "WinUsb_ControlTransfer", longArrayOf(interfacehandle, ((setuppacket.RequestType.toLong() and 0xFFL) or ((setuppacket.Request.toLong() and 0xFFL) shl 8) or ((setuppacket.Value.toLong() and 0xFFFFL) shl 16) or ((setuppacket.Index.toLong() and 0xFFFFL) shl 32) or ((setuppacket.Length.toLong() and 0xFFFFL) shl 48)), buffer, bufferlength.toLong(), lengthtransferred, overlapped)).toInt()
}

public fun WinUsb_FlushPipe(interfacehandle: WINUSB_INTERFACE_HANDLE, pipeid: UByte): BOOL {
    return Win32DynamicFfi.invoke("winusb.dll", "WinUsb_FlushPipe", longArrayOf(interfacehandle, pipeid.toLong())).toInt()
}

public fun WinUsb_Free(interfacehandle: WINUSB_INTERFACE_HANDLE): BOOL {
    return Win32DynamicFfi.invoke("winusb.dll", "WinUsb_Free", longArrayOf(interfacehandle)).toInt()
}

public fun WinUsb_GetAdjustedFrameNumber(currentframenumber: Long, timestamp: Long): BOOL {
    return Win32DynamicFfi.invoke("winusb.dll", "WinUsb_GetAdjustedFrameNumber", longArrayOf(currentframenumber, timestamp)).toInt()
}

public fun WinUsb_GetAssociatedInterface(interfacehandle: WINUSB_INTERFACE_HANDLE, associatedinterfaceindex: UByte, associatedinterfacehandle: Long): BOOL {
    return Win32DynamicFfi.invoke("winusb.dll", "WinUsb_GetAssociatedInterface", longArrayOf(interfacehandle, associatedinterfaceindex.toLong(), associatedinterfacehandle)).toInt()
}

public fun WinUsb_GetCurrentAlternateSetting(interfacehandle: WINUSB_INTERFACE_HANDLE, settingnumber: Long): BOOL {
    return Win32DynamicFfi.invoke("winusb.dll", "WinUsb_GetCurrentAlternateSetting", longArrayOf(interfacehandle, settingnumber)).toInt()
}

public fun WinUsb_GetCurrentFrameNumber(interfacehandle: WINUSB_INTERFACE_HANDLE, currentframenumber: Long, timestamp: Long): BOOL {
    return Win32DynamicFfi.invoke("winusb.dll", "WinUsb_GetCurrentFrameNumber", longArrayOf(interfacehandle, currentframenumber, timestamp)).toInt()
}

public fun WinUsb_GetCurrentFrameNumberAndQpc(interfacehandle: WINUSB_INTERFACE_HANDLE, frameqpcinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("winusb.dll", "WinUsb_GetCurrentFrameNumberAndQpc", longArrayOf(interfacehandle, frameqpcinfo)).toInt()
}

public fun WinUsb_GetDescriptor(interfacehandle: WINUSB_INTERFACE_HANDLE, descriptortype: UByte, index: UByte, languageid: UShort, buffer: Long, bufferlength: UInt, lengthtransferred: Long): BOOL {
    return Win32DynamicFfi.invoke("winusb.dll", "WinUsb_GetDescriptor", longArrayOf(interfacehandle, descriptortype.toLong(), index.toLong(), languageid.toLong(), buffer, bufferlength.toLong(), lengthtransferred)).toInt()
}

public fun WinUsb_GetOverlappedResult(interfacehandle: WINUSB_INTERFACE_HANDLE, lpoverlapped: Long, lpnumberofbytestransferred: Long, bwait: BOOL): BOOL {
    return Win32DynamicFfi.invoke("winusb.dll", "WinUsb_GetOverlappedResult", longArrayOf(interfacehandle, lpoverlapped, lpnumberofbytestransferred, bwait.toLong())).toInt()
}

public fun WinUsb_GetPipePolicy(interfacehandle: WINUSB_INTERFACE_HANDLE, pipeid: UByte, policytype: WINUSB_PIPE_POLICY, valuelength: Long, value: Long): BOOL {
    return Win32DynamicFfi.invoke("winusb.dll", "WinUsb_GetPipePolicy", longArrayOf(interfacehandle, pipeid.toLong(), policytype.toLong(), valuelength, value)).toInt()
}

public fun WinUsb_GetPowerPolicy(interfacehandle: WINUSB_INTERFACE_HANDLE, policytype: WINUSB_POWER_POLICY, valuelength: Long, value: Long): BOOL {
    return Win32DynamicFfi.invoke("winusb.dll", "WinUsb_GetPowerPolicy", longArrayOf(interfacehandle, policytype.toLong(), valuelength, value)).toInt()
}

public fun WinUsb_Initialize(devicehandle: HANDLE, interfacehandle: Long): BOOL {
    return Win32DynamicFfi.invoke("winusb.dll", "WinUsb_Initialize", longArrayOf(devicehandle, interfacehandle)).toInt()
}

public fun WinUsb_ParseConfigurationDescriptor(configurationdescriptor: Long, startposition: Long, interfacenumber: Int, alternatesetting: Int, interfaceclass: Int, interfacesubclass: Int, interfaceprotocol: Int): Long {
    return Win32DynamicFfi.invoke("winusb.dll", "WinUsb_ParseConfigurationDescriptor", longArrayOf(configurationdescriptor, startposition, interfacenumber.toLong(), alternatesetting.toLong(), interfaceclass.toLong(), interfacesubclass.toLong(), interfaceprotocol.toLong()))
}

public fun WinUsb_ParseDescriptors(descriptorbuffer: Long, totallength: UInt, startposition: Long, descriptortype: Int): Long {
    return Win32DynamicFfi.invoke("winusb.dll", "WinUsb_ParseDescriptors", longArrayOf(descriptorbuffer, totallength.toLong(), startposition, descriptortype.toLong()))
}

public fun WinUsb_QueryDeviceInformation(interfacehandle: WINUSB_INTERFACE_HANDLE, informationtype: UInt, bufferlength: Long, buffer: Long): BOOL {
    return Win32DynamicFfi.invoke("winusb.dll", "WinUsb_QueryDeviceInformation", longArrayOf(interfacehandle, informationtype.toLong(), bufferlength, buffer)).toInt()
}

public fun WinUsb_QueryInterfaceSettings(interfacehandle: WINUSB_INTERFACE_HANDLE, alternateinterfacenumber: UByte, usbaltinterfacedescriptor: Long): BOOL {
    return Win32DynamicFfi.invoke("winusb.dll", "WinUsb_QueryInterfaceSettings", longArrayOf(interfacehandle, alternateinterfacenumber.toLong(), usbaltinterfacedescriptor)).toInt()
}

public fun WinUsb_QueryPipe(interfacehandle: WINUSB_INTERFACE_HANDLE, alternateinterfacenumber: UByte, pipeindex: UByte, pipeinformation: Long): BOOL {
    return Win32DynamicFfi.invoke("winusb.dll", "WinUsb_QueryPipe", longArrayOf(interfacehandle, alternateinterfacenumber.toLong(), pipeindex.toLong(), pipeinformation)).toInt()
}

public fun WinUsb_QueryPipeEx(interfacehandle: WINUSB_INTERFACE_HANDLE, alternatesettingnumber: UByte, pipeindex: UByte, pipeinformationex: Long): BOOL {
    return Win32DynamicFfi.invoke("winusb.dll", "WinUsb_QueryPipeEx", longArrayOf(interfacehandle, alternatesettingnumber.toLong(), pipeindex.toLong(), pipeinformationex)).toInt()
}

public fun WinUsb_ReadIsochPipe(bufferhandle: Long, offset: UInt, length: UInt, framenumber: Long, numberofpackets: UInt, isopacketdescriptors: Long, overlapped: Long): BOOL {
    return Win32DynamicFfi.invoke("winusb.dll", "WinUsb_ReadIsochPipe", longArrayOf(bufferhandle, offset.toLong(), length.toLong(), framenumber, numberofpackets.toLong(), isopacketdescriptors, overlapped)).toInt()
}

public fun WinUsb_ReadIsochPipeAsap(bufferhandle: Long, offset: UInt, length: UInt, continuestream: BOOL, numberofpackets: UInt, isopacketdescriptors: Long, overlapped: Long): BOOL {
    return Win32DynamicFfi.invoke("winusb.dll", "WinUsb_ReadIsochPipeAsap", longArrayOf(bufferhandle, offset.toLong(), length.toLong(), continuestream.toLong(), numberofpackets.toLong(), isopacketdescriptors, overlapped)).toInt()
}

public fun WinUsb_ReadPipe(interfacehandle: WINUSB_INTERFACE_HANDLE, pipeid: UByte, buffer: Long, bufferlength: UInt, lengthtransferred: Long, overlapped: Long): BOOL {
    return Win32DynamicFfi.invoke("winusb.dll", "WinUsb_ReadPipe", longArrayOf(interfacehandle, pipeid.toLong(), buffer, bufferlength.toLong(), lengthtransferred, overlapped)).toInt()
}

public fun WinUsb_RegisterIsochBuffer(interfacehandle: WINUSB_INTERFACE_HANDLE, pipeid: UByte, buffer: Long, bufferlength: UInt, isochbufferhandle: Long): BOOL {
    return Win32DynamicFfi.invoke("winusb.dll", "WinUsb_RegisterIsochBuffer", longArrayOf(interfacehandle, pipeid.toLong(), buffer, bufferlength.toLong(), isochbufferhandle)).toInt()
}

public fun WinUsb_ResetPipe(interfacehandle: WINUSB_INTERFACE_HANDLE, pipeid: UByte): BOOL {
    return Win32DynamicFfi.invoke("winusb.dll", "WinUsb_ResetPipe", longArrayOf(interfacehandle, pipeid.toLong())).toInt()
}

public fun WinUsb_SetCurrentAlternateSetting(interfacehandle: WINUSB_INTERFACE_HANDLE, settingnumber: UByte): BOOL {
    return Win32DynamicFfi.invoke("winusb.dll", "WinUsb_SetCurrentAlternateSetting", longArrayOf(interfacehandle, settingnumber.toLong())).toInt()
}

public fun WinUsb_SetPipePolicy(interfacehandle: WINUSB_INTERFACE_HANDLE, pipeid: UByte, policytype: WINUSB_PIPE_POLICY, valuelength: UInt, value: Long): BOOL {
    return Win32DynamicFfi.invoke("winusb.dll", "WinUsb_SetPipePolicy", longArrayOf(interfacehandle, pipeid.toLong(), policytype.toLong(), valuelength.toLong(), value)).toInt()
}

public fun WinUsb_SetPowerPolicy(interfacehandle: WINUSB_INTERFACE_HANDLE, policytype: WINUSB_POWER_POLICY, valuelength: UInt, value: Long): BOOL {
    return Win32DynamicFfi.invoke("winusb.dll", "WinUsb_SetPowerPolicy", longArrayOf(interfacehandle, policytype.toLong(), valuelength.toLong(), value)).toInt()
}

public fun WinUsb_StartTrackingForTimeSync(interfacehandle: WINUSB_INTERFACE_HANDLE, starttrackinginfo: Long): BOOL {
    return Win32DynamicFfi.invoke("winusb.dll", "WinUsb_StartTrackingForTimeSync", longArrayOf(interfacehandle, starttrackinginfo)).toInt()
}

public fun WinUsb_StopTrackingForTimeSync(interfacehandle: WINUSB_INTERFACE_HANDLE, stoptrackinginfo: Long): BOOL {
    return Win32DynamicFfi.invoke("winusb.dll", "WinUsb_StopTrackingForTimeSync", longArrayOf(interfacehandle, stoptrackinginfo)).toInt()
}

public fun WinUsb_UnregisterIsochBuffer(isochbufferhandle: Long): BOOL {
    return Win32DynamicFfi.invoke("winusb.dll", "WinUsb_UnregisterIsochBuffer", longArrayOf(isochbufferhandle)).toInt()
}

public fun WinUsb_WriteIsochPipe(bufferhandle: Long, offset: UInt, length: UInt, framenumber: Long, overlapped: Long): BOOL {
    return Win32DynamicFfi.invoke("winusb.dll", "WinUsb_WriteIsochPipe", longArrayOf(bufferhandle, offset.toLong(), length.toLong(), framenumber, overlapped)).toInt()
}

public fun WinUsb_WriteIsochPipeAsap(bufferhandle: Long, offset: UInt, length: UInt, continuestream: BOOL, overlapped: Long): BOOL {
    return Win32DynamicFfi.invoke("winusb.dll", "WinUsb_WriteIsochPipeAsap", longArrayOf(bufferhandle, offset.toLong(), length.toLong(), continuestream.toLong(), overlapped)).toInt()
}

public fun WinUsb_WritePipe(interfacehandle: WINUSB_INTERFACE_HANDLE, pipeid: UByte, buffer: Long, bufferlength: UInt, lengthtransferred: Long, overlapped: Long): BOOL {
    return Win32DynamicFfi.invoke("winusb.dll", "WinUsb_WritePipe", longArrayOf(interfacehandle, pipeid.toLong(), buffer, bufferlength.toLong(), lengthtransferred, overlapped)).toInt()
}
