@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.usb

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssysWindowsWin32DevicesUsbWinUsbAbortPipe
import io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssysWindowsWin32DevicesUsbWinUsbFlushPipe
import io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssysWindowsWin32DevicesUsbWinUsbFree
import io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssysWindowsWin32DevicesUsbWinUsbGetAdjustedFrameNumber
import io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssysWindowsWin32DevicesUsbWinUsbGetAssociatedInterface
import io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssysWindowsWin32DevicesUsbWinUsbGetCurrentAlternateSetting
import io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssysWindowsWin32DevicesUsbWinUsbGetCurrentFrameNumber
import io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssysWindowsWin32DevicesUsbWinUsbGetCurrentFrameNumberAndQpc
import io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssysWindowsWin32DevicesUsbWinUsbGetDescriptor
import io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssysWindowsWin32DevicesUsbWinUsbGetOverlappedResult
import io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssysWindowsWin32DevicesUsbWinUsbGetPipePolicy
import io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssysWindowsWin32DevicesUsbWinUsbGetPowerPolicy
import io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssysWindowsWin32DevicesUsbWinUsbInitialize
import io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssysWindowsWin32DevicesUsbWinUsbParseConfigurationDescriptor
import io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssysWindowsWin32DevicesUsbWinUsbParseDescriptors
import io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssysWindowsWin32DevicesUsbWinUsbQueryDeviceInformation
import io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssysWindowsWin32DevicesUsbWinUsbQueryInterfaceSettings
import io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssysWindowsWin32DevicesUsbWinUsbQueryPipe
import io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssysWindowsWin32DevicesUsbWinUsbQueryPipeEx
import io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssysWindowsWin32DevicesUsbWinUsbReadIsochPipe
import io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssysWindowsWin32DevicesUsbWinUsbReadIsochPipeAsap
import io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssysWindowsWin32DevicesUsbWinUsbReadPipe
import io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssysWindowsWin32DevicesUsbWinUsbRegisterIsochBuffer
import io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssysWindowsWin32DevicesUsbWinUsbResetPipe
import io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssysWindowsWin32DevicesUsbWinUsbSetCurrentAlternateSetting
import io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssysWindowsWin32DevicesUsbWinUsbSetPipePolicy
import io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssysWindowsWin32DevicesUsbWinUsbSetPowerPolicy
import io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssysWindowsWin32DevicesUsbWinUsbStartTrackingForTimeSync
import io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssysWindowsWin32DevicesUsbWinUsbStopTrackingForTimeSync
import io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssysWindowsWin32DevicesUsbWinUsbUnregisterIsochBuffer
import io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssysWindowsWin32DevicesUsbWinUsbWriteIsochPipe
import io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssysWindowsWin32DevicesUsbWinUsbWriteIsochPipeAsap
import io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssysWindowsWin32DevicesUsbWinUsbWritePipe
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun winUsbAbortPipe(interfacehandle: WinusbInterfaceHandle, pipeid: UByte): Bool =
    windowssysWindowsWin32DevicesUsbWinUsbAbortPipe(interfacehandle.rawAddress.toCPointer<ByteVar>(), pipeid)

public actual fun winUsbControlTransfer(interfacehandle: WinusbInterfaceHandle, setuppacket: WinusbSetupPacket, buffer: MutPtr, bufferlength: UInt, lengthtransferred: MutPtr, overlapped: ConstPtr): Bool =
    0

public actual fun winUsbFlushPipe(interfacehandle: WinusbInterfaceHandle, pipeid: UByte): Bool =
    windowssysWindowsWin32DevicesUsbWinUsbFlushPipe(interfacehandle.rawAddress.toCPointer<ByteVar>(), pipeid)

public actual fun winUsbFree(interfacehandle: WinusbInterfaceHandle): Bool =
    windowssysWindowsWin32DevicesUsbWinUsbFree(interfacehandle.rawAddress.toCPointer<ByteVar>())

public actual fun winUsbGetAdjustedFrameNumber(currentframenumber: MutPtr, timestamp: Long): Bool =
    windowssysWindowsWin32DevicesUsbWinUsbGetAdjustedFrameNumber(currentframenumber.rawAddress.toCPointer<ByteVar>(), timestamp)

public actual fun winUsbGetAssociatedInterface(interfacehandle: WinusbInterfaceHandle, associatedinterfaceindex: UByte, associatedinterfacehandle: MutPtr): Bool =
    windowssysWindowsWin32DevicesUsbWinUsbGetAssociatedInterface(interfacehandle.rawAddress.toCPointer<ByteVar>(), associatedinterfaceindex, associatedinterfacehandle.rawAddress.toCPointer<ByteVar>())

public actual fun winUsbGetCurrentAlternateSetting(interfacehandle: WinusbInterfaceHandle, settingnumber: MutPtr): Bool =
    windowssysWindowsWin32DevicesUsbWinUsbGetCurrentAlternateSetting(interfacehandle.rawAddress.toCPointer<ByteVar>(), settingnumber.rawAddress.toCPointer<ByteVar>())

public actual fun winUsbGetCurrentFrameNumber(interfacehandle: WinusbInterfaceHandle, currentframenumber: MutPtr, timestamp: MutPtr): Bool =
    windowssysWindowsWin32DevicesUsbWinUsbGetCurrentFrameNumber(interfacehandle.rawAddress.toCPointer<ByteVar>(), currentframenumber.rawAddress.toCPointer<ByteVar>(), timestamp.rawAddress.toCPointer<ByteVar>())

public actual fun winUsbGetCurrentFrameNumberAndQpc(interfacehandle: WinusbInterfaceHandle, frameqpcinfo: ConstPtr): Bool =
    windowssysWindowsWin32DevicesUsbWinUsbGetCurrentFrameNumberAndQpc(interfacehandle.rawAddress.toCPointer<ByteVar>(), frameqpcinfo.rawAddress.toCPointer<ByteVar>())

public actual fun winUsbGetDescriptor(interfacehandle: WinusbInterfaceHandle, descriptortype: UByte, index: UByte, languageid: UShort, buffer: MutPtr, bufferlength: UInt, lengthtransferred: MutPtr): Bool =
    windowssysWindowsWin32DevicesUsbWinUsbGetDescriptor(interfacehandle.rawAddress.toCPointer<ByteVar>(), descriptortype, index, languageid, buffer.rawAddress.toCPointer<ByteVar>(), bufferlength, lengthtransferred.rawAddress.toCPointer<ByteVar>())

public actual fun winUsbGetOverlappedResult(interfacehandle: WinusbInterfaceHandle, lpoverlapped: ConstPtr, lpnumberofbytestransferred: MutPtr, bwait: Bool): Bool =
    windowssysWindowsWin32DevicesUsbWinUsbGetOverlappedResult(interfacehandle.rawAddress.toCPointer<ByteVar>(), lpoverlapped.rawAddress.toCPointer<ByteVar>(), lpnumberofbytestransferred.rawAddress.toCPointer<ByteVar>(), bwait)

public actual fun winUsbGetPipePolicy(interfacehandle: WinusbInterfaceHandle, pipeid: UByte, policytype: WinusbPipePolicy, valuelength: MutPtr, value: MutPtr): Bool =
    windowssysWindowsWin32DevicesUsbWinUsbGetPipePolicy(interfacehandle.rawAddress.toCPointer<ByteVar>(), pipeid, policytype, valuelength.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun winUsbGetPowerPolicy(interfacehandle: WinusbInterfaceHandle, policytype: WinusbPowerPolicy, valuelength: MutPtr, value: MutPtr): Bool =
    windowssysWindowsWin32DevicesUsbWinUsbGetPowerPolicy(interfacehandle.rawAddress.toCPointer<ByteVar>(), policytype, valuelength.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun winUsbInitialize(devicehandle: Handle, interfacehandle: MutPtr): Bool =
    windowssysWindowsWin32DevicesUsbWinUsbInitialize(devicehandle.rawAddress.toCPointer<ByteVar>(), interfacehandle.rawAddress.toCPointer<ByteVar>())

public actual fun winUsbParseConfigurationDescriptor(configurationdescriptor: ConstPtr, startposition: ConstPtr, interfacenumber: Int, alternatesetting: Int, interfaceclass: Int, interfacesubclass: Int, interfaceprotocol: Int): MutPtr =
    MutPtr(windowssysWindowsWin32DevicesUsbWinUsbParseConfigurationDescriptor(configurationdescriptor.rawAddress.toCPointer<ByteVar>(), startposition.rawAddress.toCPointer<ByteVar>(), interfacenumber, alternatesetting, interfaceclass, interfacesubclass, interfaceprotocol)?.toLong() ?: 0L)

public actual fun winUsbParseDescriptors(descriptorbuffer: ConstPtr, totallength: UInt, startposition: ConstPtr, descriptortype: Int): MutPtr =
    MutPtr(windowssysWindowsWin32DevicesUsbWinUsbParseDescriptors(descriptorbuffer.rawAddress.toCPointer<ByteVar>(), totallength, startposition.rawAddress.toCPointer<ByteVar>(), descriptortype)?.toLong() ?: 0L)

public actual fun winUsbQueryDeviceInformation(interfacehandle: WinusbInterfaceHandle, informationtype: UInt, bufferlength: MutPtr, buffer: MutPtr): Bool =
    windowssysWindowsWin32DevicesUsbWinUsbQueryDeviceInformation(interfacehandle.rawAddress.toCPointer<ByteVar>(), informationtype, bufferlength.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>())

public actual fun winUsbQueryInterfaceSettings(interfacehandle: WinusbInterfaceHandle, alternateinterfacenumber: UByte, usbaltinterfacedescriptor: MutPtr): Bool =
    windowssysWindowsWin32DevicesUsbWinUsbQueryInterfaceSettings(interfacehandle.rawAddress.toCPointer<ByteVar>(), alternateinterfacenumber, usbaltinterfacedescriptor.rawAddress.toCPointer<ByteVar>())

public actual fun winUsbQueryPipe(interfacehandle: WinusbInterfaceHandle, alternateinterfacenumber: UByte, pipeindex: UByte, pipeinformation: MutPtr): Bool =
    windowssysWindowsWin32DevicesUsbWinUsbQueryPipe(interfacehandle.rawAddress.toCPointer<ByteVar>(), alternateinterfacenumber, pipeindex, pipeinformation.rawAddress.toCPointer<ByteVar>())

public actual fun winUsbQueryPipeEx(interfacehandle: WinusbInterfaceHandle, alternatesettingnumber: UByte, pipeindex: UByte, pipeinformationex: MutPtr): Bool =
    windowssysWindowsWin32DevicesUsbWinUsbQueryPipeEx(interfacehandle.rawAddress.toCPointer<ByteVar>(), alternatesettingnumber, pipeindex, pipeinformationex.rawAddress.toCPointer<ByteVar>())

public actual fun winUsbReadIsochPipe(bufferhandle: ConstPtr, offset: UInt, length: UInt, framenumber: MutPtr, numberofpackets: UInt, isopacketdescriptors: MutPtr, overlapped: ConstPtr): Bool =
    windowssysWindowsWin32DevicesUsbWinUsbReadIsochPipe(bufferhandle.rawAddress.toCPointer<ByteVar>(), offset, length, framenumber.rawAddress.toCPointer<ByteVar>(), numberofpackets, isopacketdescriptors.rawAddress.toCPointer<ByteVar>(), overlapped.rawAddress.toCPointer<ByteVar>())

public actual fun winUsbReadIsochPipeAsap(bufferhandle: ConstPtr, offset: UInt, length: UInt, continuestream: Bool, numberofpackets: UInt, isopacketdescriptors: MutPtr, overlapped: ConstPtr): Bool =
    windowssysWindowsWin32DevicesUsbWinUsbReadIsochPipeAsap(bufferhandle.rawAddress.toCPointer<ByteVar>(), offset, length, continuestream, numberofpackets, isopacketdescriptors.rawAddress.toCPointer<ByteVar>(), overlapped.rawAddress.toCPointer<ByteVar>())

public actual fun winUsbReadPipe(interfacehandle: WinusbInterfaceHandle, pipeid: UByte, buffer: MutPtr, bufferlength: UInt, lengthtransferred: MutPtr, overlapped: ConstPtr): Bool =
    windowssysWindowsWin32DevicesUsbWinUsbReadPipe(interfacehandle.rawAddress.toCPointer<ByteVar>(), pipeid, buffer.rawAddress.toCPointer<ByteVar>(), bufferlength, lengthtransferred.rawAddress.toCPointer<ByteVar>(), overlapped.rawAddress.toCPointer<ByteVar>())

public actual fun winUsbRegisterIsochBuffer(interfacehandle: WinusbInterfaceHandle, pipeid: UByte, buffer: MutPtr, bufferlength: UInt, isochbufferhandle: MutPtr): Bool =
    windowssysWindowsWin32DevicesUsbWinUsbRegisterIsochBuffer(interfacehandle.rawAddress.toCPointer<ByteVar>(), pipeid, buffer.rawAddress.toCPointer<ByteVar>(), bufferlength, isochbufferhandle.rawAddress.toCPointer<ByteVar>())

public actual fun winUsbResetPipe(interfacehandle: WinusbInterfaceHandle, pipeid: UByte): Bool =
    windowssysWindowsWin32DevicesUsbWinUsbResetPipe(interfacehandle.rawAddress.toCPointer<ByteVar>(), pipeid)

public actual fun winUsbSetCurrentAlternateSetting(interfacehandle: WinusbInterfaceHandle, settingnumber: UByte): Bool =
    windowssysWindowsWin32DevicesUsbWinUsbSetCurrentAlternateSetting(interfacehandle.rawAddress.toCPointer<ByteVar>(), settingnumber)

public actual fun winUsbSetPipePolicy(interfacehandle: WinusbInterfaceHandle, pipeid: UByte, policytype: WinusbPipePolicy, valuelength: UInt, value: ConstPtr): Bool =
    windowssysWindowsWin32DevicesUsbWinUsbSetPipePolicy(interfacehandle.rawAddress.toCPointer<ByteVar>(), pipeid, policytype, valuelength, value.rawAddress.toCPointer<ByteVar>())

public actual fun winUsbSetPowerPolicy(interfacehandle: WinusbInterfaceHandle, policytype: WinusbPowerPolicy, valuelength: UInt, value: ConstPtr): Bool =
    windowssysWindowsWin32DevicesUsbWinUsbSetPowerPolicy(interfacehandle.rawAddress.toCPointer<ByteVar>(), policytype, valuelength, value.rawAddress.toCPointer<ByteVar>())

public actual fun winUsbStartTrackingForTimeSync(interfacehandle: WinusbInterfaceHandle, starttrackinginfo: ConstPtr): Bool =
    windowssysWindowsWin32DevicesUsbWinUsbStartTrackingForTimeSync(interfacehandle.rawAddress.toCPointer<ByteVar>(), starttrackinginfo.rawAddress.toCPointer<ByteVar>())

public actual fun winUsbStopTrackingForTimeSync(interfacehandle: WinusbInterfaceHandle, stoptrackinginfo: ConstPtr): Bool =
    windowssysWindowsWin32DevicesUsbWinUsbStopTrackingForTimeSync(interfacehandle.rawAddress.toCPointer<ByteVar>(), stoptrackinginfo.rawAddress.toCPointer<ByteVar>())

public actual fun winUsbUnregisterIsochBuffer(isochbufferhandle: ConstPtr): Bool =
    windowssysWindowsWin32DevicesUsbWinUsbUnregisterIsochBuffer(isochbufferhandle.rawAddress.toCPointer<ByteVar>())

public actual fun winUsbWriteIsochPipe(bufferhandle: ConstPtr, offset: UInt, length: UInt, framenumber: MutPtr, overlapped: ConstPtr): Bool =
    windowssysWindowsWin32DevicesUsbWinUsbWriteIsochPipe(bufferhandle.rawAddress.toCPointer<ByteVar>(), offset, length, framenumber.rawAddress.toCPointer<ByteVar>(), overlapped.rawAddress.toCPointer<ByteVar>())

public actual fun winUsbWriteIsochPipeAsap(bufferhandle: ConstPtr, offset: UInt, length: UInt, continuestream: Bool, overlapped: ConstPtr): Bool =
    windowssysWindowsWin32DevicesUsbWinUsbWriteIsochPipeAsap(bufferhandle.rawAddress.toCPointer<ByteVar>(), offset, length, continuestream, overlapped.rawAddress.toCPointer<ByteVar>())

public actual fun winUsbWritePipe(interfacehandle: WinusbInterfaceHandle, pipeid: UByte, buffer: ConstPtr, bufferlength: UInt, lengthtransferred: MutPtr, overlapped: ConstPtr): Bool =
    windowssysWindowsWin32DevicesUsbWinUsbWritePipe(interfacehandle.rawAddress.toCPointer<ByteVar>(), pipeid, buffer.rawAddress.toCPointer<ByteVar>(), bufferlength, lengthtransferred.rawAddress.toCPointer<ByteVar>(), overlapped.rawAddress.toCPointer<ByteVar>())
