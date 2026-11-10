package io.github.kotlinmania.windowssys.windows.win32.devices.usb

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public expect fun winUsbAbortPipe(interfacehandle: WinusbInterfaceHandle, pipeid: UByte): Bool

public expect fun winUsbControlTransfer(interfacehandle: WinusbInterfaceHandle, setuppacket: WinusbSetupPacket, buffer: COpaquePointer?, bufferlength: UInt, lengthtransferred: COpaquePointer?, overlapped: COpaquePointer?): Bool

public expect fun winUsbFlushPipe(interfacehandle: WinusbInterfaceHandle, pipeid: UByte): Bool

public expect fun winUsbFree(interfacehandle: WinusbInterfaceHandle): Bool

public expect fun winUsbGetAdjustedFrameNumber(currentframenumber: COpaquePointer?, timestamp: Long): Bool

public expect fun winUsbGetAssociatedInterface(interfacehandle: WinusbInterfaceHandle, associatedinterfaceindex: UByte, associatedinterfacehandle: COpaquePointer?): Bool

public expect fun winUsbGetCurrentAlternateSetting(interfacehandle: WinusbInterfaceHandle, settingnumber: COpaquePointer?): Bool

public expect fun winUsbGetCurrentFrameNumber(interfacehandle: WinusbInterfaceHandle, currentframenumber: COpaquePointer?, timestamp: COpaquePointer?): Bool

public expect fun winUsbGetCurrentFrameNumberAndQpc(interfacehandle: WinusbInterfaceHandle, frameqpcinfo: COpaquePointer?): Bool

public expect fun winUsbGetDescriptor(interfacehandle: WinusbInterfaceHandle, descriptortype: UByte, index: UByte, languageid: UShort, buffer: COpaquePointer?, bufferlength: UInt, lengthtransferred: COpaquePointer?): Bool

public expect fun winUsbGetOverlappedResult(interfacehandle: WinusbInterfaceHandle, lpoverlapped: COpaquePointer?, lpnumberofbytestransferred: COpaquePointer?, bwait: Bool): Bool

public expect fun winUsbGetPipePolicy(interfacehandle: WinusbInterfaceHandle, pipeid: UByte, policytype: WinusbPipePolicy, valuelength: COpaquePointer?, value: COpaquePointer?): Bool

public expect fun winUsbGetPowerPolicy(interfacehandle: WinusbInterfaceHandle, policytype: WinusbPowerPolicy, valuelength: COpaquePointer?, value: COpaquePointer?): Bool

public expect fun winUsbInitialize(devicehandle: Handle, interfacehandle: COpaquePointer?): Bool

public expect fun winUsbParseConfigurationDescriptor(configurationdescriptor: COpaquePointer?, startposition: COpaquePointer?, interfacenumber: Int, alternatesetting: Int, interfaceclass: Int, interfacesubclass: Int, interfaceprotocol: Int): COpaquePointer?

public expect fun winUsbParseDescriptors(descriptorbuffer: COpaquePointer?, totallength: UInt, startposition: COpaquePointer?, descriptortype: Int): COpaquePointer?

public expect fun winUsbQueryDeviceInformation(interfacehandle: WinusbInterfaceHandle, informationtype: UInt, bufferlength: COpaquePointer?, buffer: COpaquePointer?): Bool

public expect fun winUsbQueryInterfaceSettings(interfacehandle: WinusbInterfaceHandle, alternateinterfacenumber: UByte, usbaltinterfacedescriptor: COpaquePointer?): Bool

public expect fun winUsbQueryPipe(interfacehandle: WinusbInterfaceHandle, alternateinterfacenumber: UByte, pipeindex: UByte, pipeinformation: COpaquePointer?): Bool

public expect fun winUsbQueryPipeEx(interfacehandle: WinusbInterfaceHandle, alternatesettingnumber: UByte, pipeindex: UByte, pipeinformationex: COpaquePointer?): Bool

public expect fun winUsbReadIsochPipe(bufferhandle: COpaquePointer?, offset: UInt, length: UInt, framenumber: COpaquePointer?, numberofpackets: UInt, isopacketdescriptors: COpaquePointer?, overlapped: COpaquePointer?): Bool

public expect fun winUsbReadIsochPipeAsap(bufferhandle: COpaquePointer?, offset: UInt, length: UInt, continuestream: Bool, numberofpackets: UInt, isopacketdescriptors: COpaquePointer?, overlapped: COpaquePointer?): Bool

public expect fun winUsbReadPipe(interfacehandle: WinusbInterfaceHandle, pipeid: UByte, buffer: COpaquePointer?, bufferlength: UInt, lengthtransferred: COpaquePointer?, overlapped: COpaquePointer?): Bool

public expect fun winUsbRegisterIsochBuffer(interfacehandle: WinusbInterfaceHandle, pipeid: UByte, buffer: COpaquePointer?, bufferlength: UInt, isochbufferhandle: COpaquePointer?): Bool

public expect fun winUsbResetPipe(interfacehandle: WinusbInterfaceHandle, pipeid: UByte): Bool

public expect fun winUsbSetCurrentAlternateSetting(interfacehandle: WinusbInterfaceHandle, settingnumber: UByte): Bool

public expect fun winUsbSetPipePolicy(interfacehandle: WinusbInterfaceHandle, pipeid: UByte, policytype: WinusbPipePolicy, valuelength: UInt, value: COpaquePointer?): Bool

public expect fun winUsbSetPowerPolicy(interfacehandle: WinusbInterfaceHandle, policytype: WinusbPowerPolicy, valuelength: UInt, value: COpaquePointer?): Bool

public expect fun winUsbStartTrackingForTimeSync(interfacehandle: WinusbInterfaceHandle, starttrackinginfo: COpaquePointer?): Bool

public expect fun winUsbStopTrackingForTimeSync(interfacehandle: WinusbInterfaceHandle, stoptrackinginfo: COpaquePointer?): Bool

public expect fun winUsbUnregisterIsochBuffer(isochbufferhandle: COpaquePointer?): Bool

public expect fun winUsbWriteIsochPipe(bufferhandle: COpaquePointer?, offset: UInt, length: UInt, framenumber: COpaquePointer?, overlapped: COpaquePointer?): Bool

public expect fun winUsbWriteIsochPipeAsap(bufferhandle: COpaquePointer?, offset: UInt, length: UInt, continuestream: Bool, overlapped: COpaquePointer?): Bool

public expect fun winUsbWritePipe(interfacehandle: WinusbInterfaceHandle, pipeid: UByte, buffer: COpaquePointer?, bufferlength: UInt, lengthtransferred: COpaquePointer?, overlapped: COpaquePointer?): Bool
