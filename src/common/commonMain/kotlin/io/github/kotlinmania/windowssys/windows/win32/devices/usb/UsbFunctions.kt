package io.github.kotlinmania.windowssys.windows.win32.devices.usb

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public expect fun winUsbAbortPipe(interfacehandle: WinusbInterfaceHandle, pipeid: UByte): Bool

public expect fun winUsbControlTransfer(interfacehandle: WinusbInterfaceHandle, setuppacket: WinusbSetupPacket, buffer: MutPtr, bufferlength: UInt, lengthtransferred: MutPtr, overlapped: ConstPtr): Bool

public expect fun winUsbFlushPipe(interfacehandle: WinusbInterfaceHandle, pipeid: UByte): Bool

public expect fun winUsbFree(interfacehandle: WinusbInterfaceHandle): Bool

public expect fun winUsbGetAdjustedFrameNumber(currentframenumber: MutPtr, timestamp: Long): Bool

public expect fun winUsbGetAssociatedInterface(interfacehandle: WinusbInterfaceHandle, associatedinterfaceindex: UByte, associatedinterfacehandle: MutPtr): Bool

public expect fun winUsbGetCurrentAlternateSetting(interfacehandle: WinusbInterfaceHandle, settingnumber: MutPtr): Bool

public expect fun winUsbGetCurrentFrameNumber(interfacehandle: WinusbInterfaceHandle, currentframenumber: MutPtr, timestamp: MutPtr): Bool

public expect fun winUsbGetCurrentFrameNumberAndQpc(interfacehandle: WinusbInterfaceHandle, frameqpcinfo: ConstPtr): Bool

public expect fun winUsbGetDescriptor(interfacehandle: WinusbInterfaceHandle, descriptortype: UByte, index: UByte, languageid: UShort, buffer: MutPtr, bufferlength: UInt, lengthtransferred: MutPtr): Bool

public expect fun winUsbGetOverlappedResult(interfacehandle: WinusbInterfaceHandle, lpoverlapped: ConstPtr, lpnumberofbytestransferred: MutPtr, bwait: Bool): Bool

public expect fun winUsbGetPipePolicy(interfacehandle: WinusbInterfaceHandle, pipeid: UByte, policytype: WinusbPipePolicy, valuelength: MutPtr, value: MutPtr): Bool

public expect fun winUsbGetPowerPolicy(interfacehandle: WinusbInterfaceHandle, policytype: WinusbPowerPolicy, valuelength: MutPtr, value: MutPtr): Bool

public expect fun winUsbInitialize(devicehandle: Handle, interfacehandle: MutPtr): Bool

public expect fun winUsbParseConfigurationDescriptor(configurationdescriptor: ConstPtr, startposition: ConstPtr, interfacenumber: Int, alternatesetting: Int, interfaceclass: Int, interfacesubclass: Int, interfaceprotocol: Int): MutPtr

public expect fun winUsbParseDescriptors(descriptorbuffer: ConstPtr, totallength: UInt, startposition: ConstPtr, descriptortype: Int): MutPtr

public expect fun winUsbQueryDeviceInformation(interfacehandle: WinusbInterfaceHandle, informationtype: UInt, bufferlength: MutPtr, buffer: MutPtr): Bool

public expect fun winUsbQueryInterfaceSettings(interfacehandle: WinusbInterfaceHandle, alternateinterfacenumber: UByte, usbaltinterfacedescriptor: MutPtr): Bool

public expect fun winUsbQueryPipe(interfacehandle: WinusbInterfaceHandle, alternateinterfacenumber: UByte, pipeindex: UByte, pipeinformation: MutPtr): Bool

public expect fun winUsbQueryPipeEx(interfacehandle: WinusbInterfaceHandle, alternatesettingnumber: UByte, pipeindex: UByte, pipeinformationex: MutPtr): Bool

public expect fun winUsbReadIsochPipe(bufferhandle: ConstPtr, offset: UInt, length: UInt, framenumber: MutPtr, numberofpackets: UInt, isopacketdescriptors: MutPtr, overlapped: ConstPtr): Bool

public expect fun winUsbReadIsochPipeAsap(bufferhandle: ConstPtr, offset: UInt, length: UInt, continuestream: Bool, numberofpackets: UInt, isopacketdescriptors: MutPtr, overlapped: ConstPtr): Bool

public expect fun winUsbReadPipe(interfacehandle: WinusbInterfaceHandle, pipeid: UByte, buffer: MutPtr, bufferlength: UInt, lengthtransferred: MutPtr, overlapped: ConstPtr): Bool

public expect fun winUsbRegisterIsochBuffer(interfacehandle: WinusbInterfaceHandle, pipeid: UByte, buffer: MutPtr, bufferlength: UInt, isochbufferhandle: MutPtr): Bool

public expect fun winUsbResetPipe(interfacehandle: WinusbInterfaceHandle, pipeid: UByte): Bool

public expect fun winUsbSetCurrentAlternateSetting(interfacehandle: WinusbInterfaceHandle, settingnumber: UByte): Bool

public expect fun winUsbSetPipePolicy(interfacehandle: WinusbInterfaceHandle, pipeid: UByte, policytype: WinusbPipePolicy, valuelength: UInt, value: ConstPtr): Bool

public expect fun winUsbSetPowerPolicy(interfacehandle: WinusbInterfaceHandle, policytype: WinusbPowerPolicy, valuelength: UInt, value: ConstPtr): Bool

public expect fun winUsbStartTrackingForTimeSync(interfacehandle: WinusbInterfaceHandle, starttrackinginfo: ConstPtr): Bool

public expect fun winUsbStopTrackingForTimeSync(interfacehandle: WinusbInterfaceHandle, stoptrackinginfo: ConstPtr): Bool

public expect fun winUsbUnregisterIsochBuffer(isochbufferhandle: ConstPtr): Bool

public expect fun winUsbWriteIsochPipe(bufferhandle: ConstPtr, offset: UInt, length: UInt, framenumber: MutPtr, overlapped: ConstPtr): Bool

public expect fun winUsbWriteIsochPipeAsap(bufferhandle: ConstPtr, offset: UInt, length: UInt, continuestream: Bool, overlapped: ConstPtr): Bool

public expect fun winUsbWritePipe(interfacehandle: WinusbInterfaceHandle, pipeid: UByte, buffer: ConstPtr, bufferlength: UInt, lengthtransferred: MutPtr, overlapped: ConstPtr): Bool
