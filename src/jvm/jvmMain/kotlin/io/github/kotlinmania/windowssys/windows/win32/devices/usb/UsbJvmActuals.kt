@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.usb

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private object WindowsWin32DevicesUsbJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_devices_usb_winUsbAbortPipe(interfacehandle: Long, pipeid: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_usb_winUsbFlushPipe(interfacehandle: Long, pipeid: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_usb_winUsbFree(interfacehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_usb_winUsbGetAdjustedFrameNumber(currentframenumber: Long, timestamp: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_usb_winUsbGetAssociatedInterface(interfacehandle: Long, associatedinterfaceindex: Byte, associatedinterfacehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_usb_winUsbGetCurrentAlternateSetting(interfacehandle: Long, settingnumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_usb_winUsbGetCurrentFrameNumber(interfacehandle: Long, currentframenumber: Long, timestamp: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_usb_winUsbGetCurrentFrameNumberAndQpc(interfacehandle: Long, frameqpcinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_usb_winUsbGetDescriptor(interfacehandle: Long, descriptortype: Byte, index: Byte, languageid: Short, buffer: Long, bufferlength: Int, lengthtransferred: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_usb_winUsbGetOverlappedResult(interfacehandle: Long, lpoverlapped: Long, lpnumberofbytestransferred: Long, bwait: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_usb_winUsbGetPipePolicy(interfacehandle: Long, pipeid: Byte, policytype: Int, valuelength: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_usb_winUsbGetPowerPolicy(interfacehandle: Long, policytype: Int, valuelength: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_usb_winUsbInitialize(devicehandle: Long, interfacehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_usb_winUsbParseConfigurationDescriptor(configurationdescriptor: Long, startposition: Long, interfacenumber: Int, alternatesetting: Int, interfaceclass: Int, interfacesubclass: Int, interfaceprotocol: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_usb_winUsbParseDescriptors(descriptorbuffer: Long, totallength: Int, startposition: Long, descriptortype: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_usb_winUsbQueryDeviceInformation(interfacehandle: Long, informationtype: Int, bufferlength: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_usb_winUsbQueryInterfaceSettings(interfacehandle: Long, alternateinterfacenumber: Byte, usbaltinterfacedescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_usb_winUsbQueryPipe(interfacehandle: Long, alternateinterfacenumber: Byte, pipeindex: Byte, pipeinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_usb_winUsbQueryPipeEx(interfacehandle: Long, alternatesettingnumber: Byte, pipeindex: Byte, pipeinformationex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_usb_winUsbReadIsochPipe(bufferhandle: Long, offset: Int, length: Int, framenumber: Long, numberofpackets: Int, isopacketdescriptors: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_usb_winUsbReadIsochPipeAsap(bufferhandle: Long, offset: Int, length: Int, continuestream: Int, numberofpackets: Int, isopacketdescriptors: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_usb_winUsbReadPipe(interfacehandle: Long, pipeid: Byte, buffer: Long, bufferlength: Int, lengthtransferred: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_usb_winUsbRegisterIsochBuffer(interfacehandle: Long, pipeid: Byte, buffer: Long, bufferlength: Int, isochbufferhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_usb_winUsbResetPipe(interfacehandle: Long, pipeid: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_usb_winUsbSetCurrentAlternateSetting(interfacehandle: Long, settingnumber: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_usb_winUsbSetPipePolicy(interfacehandle: Long, pipeid: Byte, policytype: Int, valuelength: Int, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_usb_winUsbSetPowerPolicy(interfacehandle: Long, policytype: Int, valuelength: Int, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_usb_winUsbStartTrackingForTimeSync(interfacehandle: Long, starttrackinginfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_usb_winUsbStopTrackingForTimeSync(interfacehandle: Long, stoptrackinginfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_usb_winUsbUnregisterIsochBuffer(isochbufferhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_usb_winUsbWriteIsochPipe(bufferhandle: Long, offset: Int, length: Int, framenumber: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_usb_winUsbWriteIsochPipeAsap(bufferhandle: Long, offset: Int, length: Int, continuestream: Int, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_usb_winUsbWritePipe(interfacehandle: Long, pipeid: Byte, buffer: Long, bufferlength: Int, lengthtransferred: Long, overlapped: Long): Int
}

public actual fun winUsbAbortPipe(interfacehandle: WinusbInterfaceHandle, pipeid: UByte): Bool =
    WindowsWin32DevicesUsbJniBridge.windowssys_windows_win32_devices_usb_winUsbAbortPipe((interfacehandle?.value ?: 0L), pipeid.toByte())

public actual fun winUsbControlTransfer(interfacehandle: WinusbInterfaceHandle, setuppacket: WinusbSetupPacket, buffer: COpaquePointer?, bufferlength: UInt, lengthtransferred: COpaquePointer?, overlapped: COpaquePointer?): Bool =
    0

public actual fun winUsbFlushPipe(interfacehandle: WinusbInterfaceHandle, pipeid: UByte): Bool =
    WindowsWin32DevicesUsbJniBridge.windowssys_windows_win32_devices_usb_winUsbFlushPipe((interfacehandle?.value ?: 0L), pipeid.toByte())

public actual fun winUsbFree(interfacehandle: WinusbInterfaceHandle): Bool =
    WindowsWin32DevicesUsbJniBridge.windowssys_windows_win32_devices_usb_winUsbFree((interfacehandle?.value ?: 0L))

public actual fun winUsbGetAdjustedFrameNumber(currentframenumber: COpaquePointer?, timestamp: Long): Bool =
    WindowsWin32DevicesUsbJniBridge.windowssys_windows_win32_devices_usb_winUsbGetAdjustedFrameNumber((currentframenumber?.value ?: 0L), timestamp)

public actual fun winUsbGetAssociatedInterface(interfacehandle: WinusbInterfaceHandle, associatedinterfaceindex: UByte, associatedinterfacehandle: COpaquePointer?): Bool =
    WindowsWin32DevicesUsbJniBridge.windowssys_windows_win32_devices_usb_winUsbGetAssociatedInterface((interfacehandle?.value ?: 0L), associatedinterfaceindex.toByte(), (associatedinterfacehandle?.value ?: 0L))

public actual fun winUsbGetCurrentAlternateSetting(interfacehandle: WinusbInterfaceHandle, settingnumber: COpaquePointer?): Bool =
    WindowsWin32DevicesUsbJniBridge.windowssys_windows_win32_devices_usb_winUsbGetCurrentAlternateSetting((interfacehandle?.value ?: 0L), (settingnumber?.value ?: 0L))

public actual fun winUsbGetCurrentFrameNumber(interfacehandle: WinusbInterfaceHandle, currentframenumber: COpaquePointer?, timestamp: COpaquePointer?): Bool =
    WindowsWin32DevicesUsbJniBridge.windowssys_windows_win32_devices_usb_winUsbGetCurrentFrameNumber((interfacehandle?.value ?: 0L), (currentframenumber?.value ?: 0L), (timestamp?.value ?: 0L))

public actual fun winUsbGetCurrentFrameNumberAndQpc(interfacehandle: WinusbInterfaceHandle, frameqpcinfo: COpaquePointer?): Bool =
    WindowsWin32DevicesUsbJniBridge.windowssys_windows_win32_devices_usb_winUsbGetCurrentFrameNumberAndQpc((interfacehandle?.value ?: 0L), (frameqpcinfo?.value ?: 0L))

public actual fun winUsbGetDescriptor(interfacehandle: WinusbInterfaceHandle, descriptortype: UByte, index: UByte, languageid: UShort, buffer: COpaquePointer?, bufferlength: UInt, lengthtransferred: COpaquePointer?): Bool =
    WindowsWin32DevicesUsbJniBridge.windowssys_windows_win32_devices_usb_winUsbGetDescriptor((interfacehandle?.value ?: 0L), descriptortype.toByte(), index.toByte(), languageid.toShort(), (buffer?.value ?: 0L), bufferlength.toInt(), (lengthtransferred?.value ?: 0L))

public actual fun winUsbGetOverlappedResult(interfacehandle: WinusbInterfaceHandle, lpoverlapped: COpaquePointer?, lpnumberofbytestransferred: COpaquePointer?, bwait: Bool): Bool =
    WindowsWin32DevicesUsbJniBridge.windowssys_windows_win32_devices_usb_winUsbGetOverlappedResult((interfacehandle?.value ?: 0L), (lpoverlapped?.value ?: 0L), (lpnumberofbytestransferred?.value ?: 0L), bwait)

public actual fun winUsbGetPipePolicy(interfacehandle: WinusbInterfaceHandle, pipeid: UByte, policytype: WinusbPipePolicy, valuelength: COpaquePointer?, value: COpaquePointer?): Bool =
    WindowsWin32DevicesUsbJniBridge.windowssys_windows_win32_devices_usb_winUsbGetPipePolicy((interfacehandle?.value ?: 0L), pipeid.toByte(), policytype.toInt(), (valuelength?.value ?: 0L), (value?.value ?: 0L))

public actual fun winUsbGetPowerPolicy(interfacehandle: WinusbInterfaceHandle, policytype: WinusbPowerPolicy, valuelength: COpaquePointer?, value: COpaquePointer?): Bool =
    WindowsWin32DevicesUsbJniBridge.windowssys_windows_win32_devices_usb_winUsbGetPowerPolicy((interfacehandle?.value ?: 0L), policytype.toInt(), (valuelength?.value ?: 0L), (value?.value ?: 0L))

public actual fun winUsbInitialize(devicehandle: Handle, interfacehandle: COpaquePointer?): Bool =
    WindowsWin32DevicesUsbJniBridge.windowssys_windows_win32_devices_usb_winUsbInitialize((devicehandle?.value ?: 0L), (interfacehandle?.value ?: 0L))

public actual fun winUsbParseConfigurationDescriptor(configurationdescriptor: COpaquePointer?, startposition: COpaquePointer?, interfacenumber: Int, alternatesetting: Int, interfaceclass: Int, interfacesubclass: Int, interfaceprotocol: Int): COpaquePointer? =
    WindowsWin32DevicesUsbJniBridge.windowssys_windows_win32_devices_usb_winUsbParseConfigurationDescriptor((configurationdescriptor?.value ?: 0L), (startposition?.value ?: 0L), interfacenumber, alternatesetting, interfaceclass, interfacesubclass, interfaceprotocol).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun winUsbParseDescriptors(descriptorbuffer: COpaquePointer?, totallength: UInt, startposition: COpaquePointer?, descriptortype: Int): COpaquePointer? =
    WindowsWin32DevicesUsbJniBridge.windowssys_windows_win32_devices_usb_winUsbParseDescriptors((descriptorbuffer?.value ?: 0L), totallength.toInt(), (startposition?.value ?: 0L), descriptortype).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun winUsbQueryDeviceInformation(interfacehandle: WinusbInterfaceHandle, informationtype: UInt, bufferlength: COpaquePointer?, buffer: COpaquePointer?): Bool =
    WindowsWin32DevicesUsbJniBridge.windowssys_windows_win32_devices_usb_winUsbQueryDeviceInformation((interfacehandle?.value ?: 0L), informationtype.toInt(), (bufferlength?.value ?: 0L), (buffer?.value ?: 0L))

public actual fun winUsbQueryInterfaceSettings(interfacehandle: WinusbInterfaceHandle, alternateinterfacenumber: UByte, usbaltinterfacedescriptor: COpaquePointer?): Bool =
    WindowsWin32DevicesUsbJniBridge.windowssys_windows_win32_devices_usb_winUsbQueryInterfaceSettings((interfacehandle?.value ?: 0L), alternateinterfacenumber.toByte(), (usbaltinterfacedescriptor?.value ?: 0L))

public actual fun winUsbQueryPipe(interfacehandle: WinusbInterfaceHandle, alternateinterfacenumber: UByte, pipeindex: UByte, pipeinformation: COpaquePointer?): Bool =
    WindowsWin32DevicesUsbJniBridge.windowssys_windows_win32_devices_usb_winUsbQueryPipe((interfacehandle?.value ?: 0L), alternateinterfacenumber.toByte(), pipeindex.toByte(), (pipeinformation?.value ?: 0L))

public actual fun winUsbQueryPipeEx(interfacehandle: WinusbInterfaceHandle, alternatesettingnumber: UByte, pipeindex: UByte, pipeinformationex: COpaquePointer?): Bool =
    WindowsWin32DevicesUsbJniBridge.windowssys_windows_win32_devices_usb_winUsbQueryPipeEx((interfacehandle?.value ?: 0L), alternatesettingnumber.toByte(), pipeindex.toByte(), (pipeinformationex?.value ?: 0L))

public actual fun winUsbReadIsochPipe(bufferhandle: COpaquePointer?, offset: UInt, length: UInt, framenumber: COpaquePointer?, numberofpackets: UInt, isopacketdescriptors: COpaquePointer?, overlapped: COpaquePointer?): Bool =
    WindowsWin32DevicesUsbJniBridge.windowssys_windows_win32_devices_usb_winUsbReadIsochPipe((bufferhandle?.value ?: 0L), offset.toInt(), length.toInt(), (framenumber?.value ?: 0L), numberofpackets.toInt(), (isopacketdescriptors?.value ?: 0L), (overlapped?.value ?: 0L))

public actual fun winUsbReadIsochPipeAsap(bufferhandle: COpaquePointer?, offset: UInt, length: UInt, continuestream: Bool, numberofpackets: UInt, isopacketdescriptors: COpaquePointer?, overlapped: COpaquePointer?): Bool =
    WindowsWin32DevicesUsbJniBridge.windowssys_windows_win32_devices_usb_winUsbReadIsochPipeAsap((bufferhandle?.value ?: 0L), offset.toInt(), length.toInt(), continuestream, numberofpackets.toInt(), (isopacketdescriptors?.value ?: 0L), (overlapped?.value ?: 0L))

public actual fun winUsbReadPipe(interfacehandle: WinusbInterfaceHandle, pipeid: UByte, buffer: COpaquePointer?, bufferlength: UInt, lengthtransferred: COpaquePointer?, overlapped: COpaquePointer?): Bool =
    WindowsWin32DevicesUsbJniBridge.windowssys_windows_win32_devices_usb_winUsbReadPipe((interfacehandle?.value ?: 0L), pipeid.toByte(), (buffer?.value ?: 0L), bufferlength.toInt(), (lengthtransferred?.value ?: 0L), (overlapped?.value ?: 0L))

public actual fun winUsbRegisterIsochBuffer(interfacehandle: WinusbInterfaceHandle, pipeid: UByte, buffer: COpaquePointer?, bufferlength: UInt, isochbufferhandle: COpaquePointer?): Bool =
    WindowsWin32DevicesUsbJniBridge.windowssys_windows_win32_devices_usb_winUsbRegisterIsochBuffer((interfacehandle?.value ?: 0L), pipeid.toByte(), (buffer?.value ?: 0L), bufferlength.toInt(), (isochbufferhandle?.value ?: 0L))

public actual fun winUsbResetPipe(interfacehandle: WinusbInterfaceHandle, pipeid: UByte): Bool =
    WindowsWin32DevicesUsbJniBridge.windowssys_windows_win32_devices_usb_winUsbResetPipe((interfacehandle?.value ?: 0L), pipeid.toByte())

public actual fun winUsbSetCurrentAlternateSetting(interfacehandle: WinusbInterfaceHandle, settingnumber: UByte): Bool =
    WindowsWin32DevicesUsbJniBridge.windowssys_windows_win32_devices_usb_winUsbSetCurrentAlternateSetting((interfacehandle?.value ?: 0L), settingnumber.toByte())

public actual fun winUsbSetPipePolicy(interfacehandle: WinusbInterfaceHandle, pipeid: UByte, policytype: WinusbPipePolicy, valuelength: UInt, value: COpaquePointer?): Bool =
    WindowsWin32DevicesUsbJniBridge.windowssys_windows_win32_devices_usb_winUsbSetPipePolicy((interfacehandle?.value ?: 0L), pipeid.toByte(), policytype.toInt(), valuelength.toInt(), (value?.value ?: 0L))

public actual fun winUsbSetPowerPolicy(interfacehandle: WinusbInterfaceHandle, policytype: WinusbPowerPolicy, valuelength: UInt, value: COpaquePointer?): Bool =
    WindowsWin32DevicesUsbJniBridge.windowssys_windows_win32_devices_usb_winUsbSetPowerPolicy((interfacehandle?.value ?: 0L), policytype.toInt(), valuelength.toInt(), (value?.value ?: 0L))

public actual fun winUsbStartTrackingForTimeSync(interfacehandle: WinusbInterfaceHandle, starttrackinginfo: COpaquePointer?): Bool =
    WindowsWin32DevicesUsbJniBridge.windowssys_windows_win32_devices_usb_winUsbStartTrackingForTimeSync((interfacehandle?.value ?: 0L), (starttrackinginfo?.value ?: 0L))

public actual fun winUsbStopTrackingForTimeSync(interfacehandle: WinusbInterfaceHandle, stoptrackinginfo: COpaquePointer?): Bool =
    WindowsWin32DevicesUsbJniBridge.windowssys_windows_win32_devices_usb_winUsbStopTrackingForTimeSync((interfacehandle?.value ?: 0L), (stoptrackinginfo?.value ?: 0L))

public actual fun winUsbUnregisterIsochBuffer(isochbufferhandle: COpaquePointer?): Bool =
    WindowsWin32DevicesUsbJniBridge.windowssys_windows_win32_devices_usb_winUsbUnregisterIsochBuffer((isochbufferhandle?.value ?: 0L))

public actual fun winUsbWriteIsochPipe(bufferhandle: COpaquePointer?, offset: UInt, length: UInt, framenumber: COpaquePointer?, overlapped: COpaquePointer?): Bool =
    WindowsWin32DevicesUsbJniBridge.windowssys_windows_win32_devices_usb_winUsbWriteIsochPipe((bufferhandle?.value ?: 0L), offset.toInt(), length.toInt(), (framenumber?.value ?: 0L), (overlapped?.value ?: 0L))

public actual fun winUsbWriteIsochPipeAsap(bufferhandle: COpaquePointer?, offset: UInt, length: UInt, continuestream: Bool, overlapped: COpaquePointer?): Bool =
    WindowsWin32DevicesUsbJniBridge.windowssys_windows_win32_devices_usb_winUsbWriteIsochPipeAsap((bufferhandle?.value ?: 0L), offset.toInt(), length.toInt(), continuestream, (overlapped?.value ?: 0L))

public actual fun winUsbWritePipe(interfacehandle: WinusbInterfaceHandle, pipeid: UByte, buffer: COpaquePointer?, bufferlength: UInt, lengthtransferred: COpaquePointer?, overlapped: COpaquePointer?): Bool =
    WindowsWin32DevicesUsbJniBridge.windowssys_windows_win32_devices_usb_winUsbWritePipe((interfacehandle?.value ?: 0L), pipeid.toByte(), (buffer?.value ?: 0L), bufferlength.toInt(), (lengthtransferred?.value ?: 0L), (overlapped?.value ?: 0L))
