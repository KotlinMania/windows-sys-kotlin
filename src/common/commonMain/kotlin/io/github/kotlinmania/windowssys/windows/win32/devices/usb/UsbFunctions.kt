package io.github.kotlinmania.windowssys.windows.win32.devices.usb

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.system.io.Overlapped

public expect fun winUsbAbortPipe(interfacehandle: WinusbInterfaceHandle, pipeid: UByte): Bool

public expect fun winUsbControlTransfer(interfacehandle: WinusbInterfaceHandle, setuppacket: WinusbSetupPacket, buffer: MutPtr<UByte>, bufferlength: UInt, lengthtransferred: MutPtr<UInt>, overlapped: ConstPtr<Overlapped>): Bool

public expect fun winUsbFlushPipe(interfacehandle: WinusbInterfaceHandle, pipeid: UByte): Bool

public expect fun winUsbFree(interfacehandle: WinusbInterfaceHandle): Bool

public expect fun winUsbGetAdjustedFrameNumber(currentframenumber: MutPtr<UInt>, timestamp: Long): Bool

public expect fun winUsbGetAssociatedInterface(interfacehandle: WinusbInterfaceHandle, associatedinterfaceindex: UByte, associatedinterfacehandle: MutPtr<WinusbInterfaceHandle>): Bool

public expect fun winUsbGetCurrentAlternateSetting(interfacehandle: WinusbInterfaceHandle, settingnumber: MutPtr<UByte>): Bool

public expect fun winUsbGetCurrentFrameNumber(interfacehandle: WinusbInterfaceHandle, currentframenumber: MutPtr<UInt>, timestamp: MutPtr<Long>): Bool

public expect fun winUsbGetCurrentFrameNumberAndQpc(interfacehandle: WinusbInterfaceHandle, frameqpcinfo: ConstPtr<UsbFrameNumberAndQpcForTimeSyncInformation>): Bool

public expect fun winUsbGetDescriptor(interfacehandle: WinusbInterfaceHandle, descriptortype: UByte, index: UByte, languageid: UShort, buffer: MutPtr<UByte>, bufferlength: UInt, lengthtransferred: MutPtr<UInt>): Bool

public expect fun winUsbGetOverlappedResult(interfacehandle: WinusbInterfaceHandle, lpoverlapped: ConstPtr<Overlapped>, lpnumberofbytestransferred: MutPtr<UInt>, bwait: Bool): Bool

public expect fun winUsbGetPipePolicy(interfacehandle: WinusbInterfaceHandle, pipeid: UByte, policytype: WinusbPipePolicy, valuelength: MutPtr<UInt>, value: MutPtr<CVoid>): Bool

public expect fun winUsbGetPowerPolicy(interfacehandle: WinusbInterfaceHandle, policytype: WinusbPowerPolicy, valuelength: MutPtr<UInt>, value: MutPtr<CVoid>): Bool

public expect fun winUsbInitialize(devicehandle: Handle, interfacehandle: MutPtr<WinusbInterfaceHandle>): Bool

public expect fun winUsbParseConfigurationDescriptor(configurationdescriptor: ConstPtr<UsbConfigurationDescriptor>, startposition: ConstPtr<CVoid>, interfacenumber: Int, alternatesetting: Int, interfaceclass: Int, interfacesubclass: Int, interfaceprotocol: Int): MutPtr<UsbInterfaceDescriptor>

public expect fun winUsbParseDescriptors(descriptorbuffer: ConstPtr<CVoid>, totallength: UInt, startposition: ConstPtr<CVoid>, descriptortype: Int): MutPtr<UsbCommonDescriptor>

public expect fun winUsbQueryDeviceInformation(interfacehandle: WinusbInterfaceHandle, informationtype: UInt, bufferlength: MutPtr<UInt>, buffer: MutPtr<CVoid>): Bool

public expect fun winUsbQueryInterfaceSettings(interfacehandle: WinusbInterfaceHandle, alternateinterfacenumber: UByte, usbaltinterfacedescriptor: MutPtr<UsbInterfaceDescriptor>): Bool

public expect fun winUsbQueryPipe(interfacehandle: WinusbInterfaceHandle, alternateinterfacenumber: UByte, pipeindex: UByte, pipeinformation: MutPtr<WinusbPipeInformation>): Bool

public expect fun winUsbQueryPipeEx(interfacehandle: WinusbInterfaceHandle, alternatesettingnumber: UByte, pipeindex: UByte, pipeinformationex: MutPtr<WinusbPipeInformationEx>): Bool

public expect fun winUsbReadIsochPipe(bufferhandle: ConstPtr<CVoid>, offset: UInt, length: UInt, framenumber: MutPtr<UInt>, numberofpackets: UInt, isopacketdescriptors: MutPtr<UsbdIsoPacketDescriptor>, overlapped: ConstPtr<Overlapped>): Bool

public expect fun winUsbReadIsochPipeAsap(bufferhandle: ConstPtr<CVoid>, offset: UInt, length: UInt, continuestream: Bool, numberofpackets: UInt, isopacketdescriptors: MutPtr<UsbdIsoPacketDescriptor>, overlapped: ConstPtr<Overlapped>): Bool

public expect fun winUsbReadPipe(interfacehandle: WinusbInterfaceHandle, pipeid: UByte, buffer: MutPtr<UByte>, bufferlength: UInt, lengthtransferred: MutPtr<UInt>, overlapped: ConstPtr<Overlapped>): Bool

public expect fun winUsbRegisterIsochBuffer(interfacehandle: WinusbInterfaceHandle, pipeid: UByte, buffer: MutPtr<UByte>, bufferlength: UInt, isochbufferhandle: MutPtr<MutPtr<CVoid>>): Bool

public expect fun winUsbResetPipe(interfacehandle: WinusbInterfaceHandle, pipeid: UByte): Bool

public expect fun winUsbSetCurrentAlternateSetting(interfacehandle: WinusbInterfaceHandle, settingnumber: UByte): Bool

public expect fun winUsbSetPipePolicy(interfacehandle: WinusbInterfaceHandle, pipeid: UByte, policytype: WinusbPipePolicy, valuelength: UInt, value: ConstPtr<CVoid>): Bool

public expect fun winUsbSetPowerPolicy(interfacehandle: WinusbInterfaceHandle, policytype: WinusbPowerPolicy, valuelength: UInt, value: ConstPtr<CVoid>): Bool

public expect fun winUsbStartTrackingForTimeSync(interfacehandle: WinusbInterfaceHandle, starttrackinginfo: ConstPtr<UsbStartTrackingForTimeSyncInformation>): Bool

public expect fun winUsbStopTrackingForTimeSync(interfacehandle: WinusbInterfaceHandle, stoptrackinginfo: ConstPtr<UsbStopTrackingForTimeSyncInformation>): Bool

public expect fun winUsbUnregisterIsochBuffer(isochbufferhandle: ConstPtr<CVoid>): Bool

public expect fun winUsbWriteIsochPipe(bufferhandle: ConstPtr<CVoid>, offset: UInt, length: UInt, framenumber: MutPtr<UInt>, overlapped: ConstPtr<Overlapped>): Bool

public expect fun winUsbWriteIsochPipeAsap(bufferhandle: ConstPtr<CVoid>, offset: UInt, length: UInt, continuestream: Bool, overlapped: ConstPtr<Overlapped>): Bool

public expect fun winUsbWritePipe(interfacehandle: WinusbInterfaceHandle, pipeid: UByte, buffer: ConstPtr<UByte>, bufferlength: UInt, lengthtransferred: MutPtr<UInt>, overlapped: ConstPtr<Overlapped>): Bool
