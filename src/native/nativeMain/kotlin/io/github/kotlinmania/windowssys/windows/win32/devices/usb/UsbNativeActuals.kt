@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.usb

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssys_windows_win32_devices_usb_winUsbAbortPipe
import io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssys_windows_win32_devices_usb_winUsbFlushPipe
import io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssys_windows_win32_devices_usb_winUsbFree
import io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssys_windows_win32_devices_usb_winUsbGetAdjustedFrameNumber
import io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssys_windows_win32_devices_usb_winUsbGetAssociatedInterface
import io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssys_windows_win32_devices_usb_winUsbGetCurrentAlternateSetting
import io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssys_windows_win32_devices_usb_winUsbGetCurrentFrameNumber
import io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssys_windows_win32_devices_usb_winUsbGetCurrentFrameNumberAndQpc
import io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssys_windows_win32_devices_usb_winUsbGetDescriptor
import io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssys_windows_win32_devices_usb_winUsbGetOverlappedResult
import io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssys_windows_win32_devices_usb_winUsbGetPipePolicy
import io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssys_windows_win32_devices_usb_winUsbGetPowerPolicy
import io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssys_windows_win32_devices_usb_winUsbInitialize
import io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssys_windows_win32_devices_usb_winUsbParseConfigurationDescriptor
import io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssys_windows_win32_devices_usb_winUsbParseDescriptors
import io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssys_windows_win32_devices_usb_winUsbQueryDeviceInformation
import io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssys_windows_win32_devices_usb_winUsbQueryInterfaceSettings
import io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssys_windows_win32_devices_usb_winUsbQueryPipe
import io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssys_windows_win32_devices_usb_winUsbQueryPipeEx
import io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssys_windows_win32_devices_usb_winUsbReadIsochPipe
import io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssys_windows_win32_devices_usb_winUsbReadIsochPipeAsap
import io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssys_windows_win32_devices_usb_winUsbReadPipe
import io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssys_windows_win32_devices_usb_winUsbRegisterIsochBuffer
import io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssys_windows_win32_devices_usb_winUsbResetPipe
import io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssys_windows_win32_devices_usb_winUsbSetCurrentAlternateSetting
import io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssys_windows_win32_devices_usb_winUsbSetPipePolicy
import io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssys_windows_win32_devices_usb_winUsbSetPowerPolicy
import io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssys_windows_win32_devices_usb_winUsbStartTrackingForTimeSync
import io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssys_windows_win32_devices_usb_winUsbStopTrackingForTimeSync
import io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssys_windows_win32_devices_usb_winUsbUnregisterIsochBuffer
import io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssys_windows_win32_devices_usb_winUsbWriteIsochPipe
import io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssys_windows_win32_devices_usb_winUsbWriteIsochPipeAsap
import io.github.kotlinmania.windowssys.windows.win32.devices.usb.cinterop.windowssys_windows_win32_devices_usb_winUsbWritePipe
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun winUsbAbortPipe(interfacehandle: WinusbInterfaceHandle, pipeid: UByte): Bool =
    windowssys_windows_win32_devices_usb_winUsbAbortPipe(interfacehandle?.value?.toCPointer<ByteVar>(), pipeid)

public actual fun winUsbControlTransfer(interfacehandle: WinusbInterfaceHandle, setuppacket: WinusbSetupPacket, buffer: COpaquePointer?, bufferlength: UInt, lengthtransferred: COpaquePointer?, overlapped: COpaquePointer?): Bool =
    0

public actual fun winUsbFlushPipe(interfacehandle: WinusbInterfaceHandle, pipeid: UByte): Bool =
    windowssys_windows_win32_devices_usb_winUsbFlushPipe(interfacehandle?.value?.toCPointer<ByteVar>(), pipeid)

public actual fun winUsbFree(interfacehandle: WinusbInterfaceHandle): Bool =
    windowssys_windows_win32_devices_usb_winUsbFree(interfacehandle?.value?.toCPointer<ByteVar>())

public actual fun winUsbGetAdjustedFrameNumber(currentframenumber: COpaquePointer?, timestamp: Long): Bool =
    windowssys_windows_win32_devices_usb_winUsbGetAdjustedFrameNumber(currentframenumber?.value?.toCPointer<ByteVar>(), timestamp)

public actual fun winUsbGetAssociatedInterface(interfacehandle: WinusbInterfaceHandle, associatedinterfaceindex: UByte, associatedinterfacehandle: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_usb_winUsbGetAssociatedInterface(interfacehandle?.value?.toCPointer<ByteVar>(), associatedinterfaceindex, associatedinterfacehandle?.value?.toCPointer<ByteVar>())

public actual fun winUsbGetCurrentAlternateSetting(interfacehandle: WinusbInterfaceHandle, settingnumber: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_usb_winUsbGetCurrentAlternateSetting(interfacehandle?.value?.toCPointer<ByteVar>(), settingnumber?.value?.toCPointer<ByteVar>())

public actual fun winUsbGetCurrentFrameNumber(interfacehandle: WinusbInterfaceHandle, currentframenumber: COpaquePointer?, timestamp: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_usb_winUsbGetCurrentFrameNumber(interfacehandle?.value?.toCPointer<ByteVar>(), currentframenumber?.value?.toCPointer<ByteVar>(), timestamp?.value?.toCPointer<ByteVar>())

public actual fun winUsbGetCurrentFrameNumberAndQpc(interfacehandle: WinusbInterfaceHandle, frameqpcinfo: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_usb_winUsbGetCurrentFrameNumberAndQpc(interfacehandle?.value?.toCPointer<ByteVar>(), frameqpcinfo?.value?.toCPointer<ByteVar>())

public actual fun winUsbGetDescriptor(interfacehandle: WinusbInterfaceHandle, descriptortype: UByte, index: UByte, languageid: UShort, buffer: COpaquePointer?, bufferlength: UInt, lengthtransferred: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_usb_winUsbGetDescriptor(interfacehandle?.value?.toCPointer<ByteVar>(), descriptortype, index, languageid, buffer?.value?.toCPointer<ByteVar>(), bufferlength, lengthtransferred?.value?.toCPointer<ByteVar>())

public actual fun winUsbGetOverlappedResult(interfacehandle: WinusbInterfaceHandle, lpoverlapped: COpaquePointer?, lpnumberofbytestransferred: COpaquePointer?, bwait: Bool): Bool =
    windowssys_windows_win32_devices_usb_winUsbGetOverlappedResult(interfacehandle?.value?.toCPointer<ByteVar>(), lpoverlapped?.value?.toCPointer<ByteVar>(), lpnumberofbytestransferred?.value?.toCPointer<ByteVar>(), bwait)

public actual fun winUsbGetPipePolicy(interfacehandle: WinusbInterfaceHandle, pipeid: UByte, policytype: WinusbPipePolicy, valuelength: COpaquePointer?, value: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_usb_winUsbGetPipePolicy(interfacehandle?.value?.toCPointer<ByteVar>(), pipeid, policytype, valuelength?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun winUsbGetPowerPolicy(interfacehandle: WinusbInterfaceHandle, policytype: WinusbPowerPolicy, valuelength: COpaquePointer?, value: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_usb_winUsbGetPowerPolicy(interfacehandle?.value?.toCPointer<ByteVar>(), policytype, valuelength?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun winUsbInitialize(devicehandle: Handle, interfacehandle: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_usb_winUsbInitialize(devicehandle?.value?.toCPointer<ByteVar>(), interfacehandle?.value?.toCPointer<ByteVar>())

public actual fun winUsbParseConfigurationDescriptor(configurationdescriptor: COpaquePointer?, startposition: COpaquePointer?, interfacenumber: Int, alternatesetting: Int, interfaceclass: Int, interfacesubclass: Int, interfaceprotocol: Int): COpaquePointer? =
    windowssys_windows_win32_devices_usb_winUsbParseConfigurationDescriptor(configurationdescriptor?.value?.toCPointer<ByteVar>(), startposition?.value?.toCPointer<ByteVar>(), interfacenumber, alternatesetting, interfaceclass, interfacesubclass, interfaceprotocol)?.let { COpaquePointer(it.toLong()) }

public actual fun winUsbParseDescriptors(descriptorbuffer: COpaquePointer?, totallength: UInt, startposition: COpaquePointer?, descriptortype: Int): COpaquePointer? =
    windowssys_windows_win32_devices_usb_winUsbParseDescriptors(descriptorbuffer?.value?.toCPointer<ByteVar>(), totallength, startposition?.value?.toCPointer<ByteVar>(), descriptortype)?.let { COpaquePointer(it.toLong()) }

public actual fun winUsbQueryDeviceInformation(interfacehandle: WinusbInterfaceHandle, informationtype: UInt, bufferlength: COpaquePointer?, buffer: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_usb_winUsbQueryDeviceInformation(interfacehandle?.value?.toCPointer<ByteVar>(), informationtype, bufferlength?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>())

public actual fun winUsbQueryInterfaceSettings(interfacehandle: WinusbInterfaceHandle, alternateinterfacenumber: UByte, usbaltinterfacedescriptor: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_usb_winUsbQueryInterfaceSettings(interfacehandle?.value?.toCPointer<ByteVar>(), alternateinterfacenumber, usbaltinterfacedescriptor?.value?.toCPointer<ByteVar>())

public actual fun winUsbQueryPipe(interfacehandle: WinusbInterfaceHandle, alternateinterfacenumber: UByte, pipeindex: UByte, pipeinformation: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_usb_winUsbQueryPipe(interfacehandle?.value?.toCPointer<ByteVar>(), alternateinterfacenumber, pipeindex, pipeinformation?.value?.toCPointer<ByteVar>())

public actual fun winUsbQueryPipeEx(interfacehandle: WinusbInterfaceHandle, alternatesettingnumber: UByte, pipeindex: UByte, pipeinformationex: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_usb_winUsbQueryPipeEx(interfacehandle?.value?.toCPointer<ByteVar>(), alternatesettingnumber, pipeindex, pipeinformationex?.value?.toCPointer<ByteVar>())

public actual fun winUsbReadIsochPipe(bufferhandle: COpaquePointer?, offset: UInt, length: UInt, framenumber: COpaquePointer?, numberofpackets: UInt, isopacketdescriptors: COpaquePointer?, overlapped: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_usb_winUsbReadIsochPipe(bufferhandle?.value?.toCPointer<ByteVar>(), offset, length, framenumber?.value?.toCPointer<ByteVar>(), numberofpackets, isopacketdescriptors?.value?.toCPointer<ByteVar>(), overlapped?.value?.toCPointer<ByteVar>())

public actual fun winUsbReadIsochPipeAsap(bufferhandle: COpaquePointer?, offset: UInt, length: UInt, continuestream: Bool, numberofpackets: UInt, isopacketdescriptors: COpaquePointer?, overlapped: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_usb_winUsbReadIsochPipeAsap(bufferhandle?.value?.toCPointer<ByteVar>(), offset, length, continuestream, numberofpackets, isopacketdescriptors?.value?.toCPointer<ByteVar>(), overlapped?.value?.toCPointer<ByteVar>())

public actual fun winUsbReadPipe(interfacehandle: WinusbInterfaceHandle, pipeid: UByte, buffer: COpaquePointer?, bufferlength: UInt, lengthtransferred: COpaquePointer?, overlapped: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_usb_winUsbReadPipe(interfacehandle?.value?.toCPointer<ByteVar>(), pipeid, buffer?.value?.toCPointer<ByteVar>(), bufferlength, lengthtransferred?.value?.toCPointer<ByteVar>(), overlapped?.value?.toCPointer<ByteVar>())

public actual fun winUsbRegisterIsochBuffer(interfacehandle: WinusbInterfaceHandle, pipeid: UByte, buffer: COpaquePointer?, bufferlength: UInt, isochbufferhandle: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_usb_winUsbRegisterIsochBuffer(interfacehandle?.value?.toCPointer<ByteVar>(), pipeid, buffer?.value?.toCPointer<ByteVar>(), bufferlength, isochbufferhandle?.value?.toCPointer<ByteVar>())

public actual fun winUsbResetPipe(interfacehandle: WinusbInterfaceHandle, pipeid: UByte): Bool =
    windowssys_windows_win32_devices_usb_winUsbResetPipe(interfacehandle?.value?.toCPointer<ByteVar>(), pipeid)

public actual fun winUsbSetCurrentAlternateSetting(interfacehandle: WinusbInterfaceHandle, settingnumber: UByte): Bool =
    windowssys_windows_win32_devices_usb_winUsbSetCurrentAlternateSetting(interfacehandle?.value?.toCPointer<ByteVar>(), settingnumber)

public actual fun winUsbSetPipePolicy(interfacehandle: WinusbInterfaceHandle, pipeid: UByte, policytype: WinusbPipePolicy, valuelength: UInt, value: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_usb_winUsbSetPipePolicy(interfacehandle?.value?.toCPointer<ByteVar>(), pipeid, policytype, valuelength, value?.value?.toCPointer<ByteVar>())

public actual fun winUsbSetPowerPolicy(interfacehandle: WinusbInterfaceHandle, policytype: WinusbPowerPolicy, valuelength: UInt, value: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_usb_winUsbSetPowerPolicy(interfacehandle?.value?.toCPointer<ByteVar>(), policytype, valuelength, value?.value?.toCPointer<ByteVar>())

public actual fun winUsbStartTrackingForTimeSync(interfacehandle: WinusbInterfaceHandle, starttrackinginfo: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_usb_winUsbStartTrackingForTimeSync(interfacehandle?.value?.toCPointer<ByteVar>(), starttrackinginfo?.value?.toCPointer<ByteVar>())

public actual fun winUsbStopTrackingForTimeSync(interfacehandle: WinusbInterfaceHandle, stoptrackinginfo: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_usb_winUsbStopTrackingForTimeSync(interfacehandle?.value?.toCPointer<ByteVar>(), stoptrackinginfo?.value?.toCPointer<ByteVar>())

public actual fun winUsbUnregisterIsochBuffer(isochbufferhandle: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_usb_winUsbUnregisterIsochBuffer(isochbufferhandle?.value?.toCPointer<ByteVar>())

public actual fun winUsbWriteIsochPipe(bufferhandle: COpaquePointer?, offset: UInt, length: UInt, framenumber: COpaquePointer?, overlapped: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_usb_winUsbWriteIsochPipe(bufferhandle?.value?.toCPointer<ByteVar>(), offset, length, framenumber?.value?.toCPointer<ByteVar>(), overlapped?.value?.toCPointer<ByteVar>())

public actual fun winUsbWriteIsochPipeAsap(bufferhandle: COpaquePointer?, offset: UInt, length: UInt, continuestream: Bool, overlapped: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_usb_winUsbWriteIsochPipeAsap(bufferhandle?.value?.toCPointer<ByteVar>(), offset, length, continuestream, overlapped?.value?.toCPointer<ByteVar>())

public actual fun winUsbWritePipe(interfacehandle: WinusbInterfaceHandle, pipeid: UByte, buffer: COpaquePointer?, bufferlength: UInt, lengthtransferred: COpaquePointer?, overlapped: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_usb_winUsbWritePipe(interfacehandle?.value?.toCPointer<ByteVar>(), pipeid, buffer?.value?.toCPointer<ByteVar>(), bufferlength, lengthtransferred?.value?.toCPointer<ByteVar>(), overlapped?.value?.toCPointer<ByteVar>())
