@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.usb

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.system.io.Overlapped

private object WindowsWin32DevicesUsbJniBridge {
    init {
        loadNativeLibrary()
    }

    private fun loadNativeLibrary() {
        val osRaw = System.getProperty("os.name", "").lowercase()
        val archRaw = System.getProperty("os.arch", "").lowercase()
        val hostPlatform =
            when {
                osRaw.contains("win") -> "windows"
                osRaw.contains("mac") || osRaw.contains("darwin") -> "macos"
                else -> "linux"
            }
        val hostArch =
            when {
                archRaw == "aarch64" || archRaw == "arm64" -> "aarch64"
                archRaw == "amd64" || archRaw == "x86_64" -> "x86_64"
                else -> archRaw
            }
        val libFileName =
            when (hostPlatform) {
                "windows" -> "windowssys_jni.dll"
                "macos" -> "libwindowssys_jni.dylib"
                else -> "libwindowssys_jni.so"
            }
        val pathSep = System.getProperty("path.separator", ":")
        val libPathProp = System.getProperty("java.library.path", "")
        for (dirEntry in libPathProp.split(pathSep)) {
            if (dirEntry.isEmpty()) continue
            val candidate = java.io.File(dirEntry, libFileName)
            if (candidate.isFile) {
                System.load(candidate.absolutePath)
                return
            }
        }
        val resourcePath = "io/github/kotlinmania/windowssys/native/$hostPlatform-$hostArch/$libFileName"
        val stream = WindowsWin32DevicesUsbJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
        if (stream != null) {
            val suffix = "." + libFileName.substringAfterLast('.')
            val extracted =
                java.nio.file.Files
                    .createTempFile("windowssys_jni-", suffix)
                    .toFile()
            extracted.deleteOnExit()
            stream.use { input ->
                extracted.outputStream().use { output ->
                    input.copyTo(output)
                }
            }
            System.load(extracted.absolutePath)
            return
        }
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32DevicesUsbWinUsbAbortPipe(interfacehandle: Long, pipeid: Byte): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesUsbWinUsbFlushPipe(interfacehandle: Long, pipeid: Byte): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesUsbWinUsbFree(interfacehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesUsbWinUsbGetAdjustedFrameNumber(currentframenumber: Long, timestamp: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesUsbWinUsbGetAssociatedInterface(interfacehandle: Long, associatedinterfaceindex: Byte, associatedinterfacehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesUsbWinUsbGetCurrentAlternateSetting(interfacehandle: Long, settingnumber: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesUsbWinUsbGetCurrentFrameNumber(interfacehandle: Long, currentframenumber: Long, timestamp: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesUsbWinUsbGetCurrentFrameNumberAndQpc(interfacehandle: Long, frameqpcinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesUsbWinUsbGetDescriptor(interfacehandle: Long, descriptortype: Byte, index: Byte, languageid: Short, buffer: Long, bufferlength: Int, lengthtransferred: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesUsbWinUsbGetOverlappedResult(interfacehandle: Long, lpoverlapped: Long, lpnumberofbytestransferred: Long, bwait: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesUsbWinUsbGetPipePolicy(interfacehandle: Long, pipeid: Byte, policytype: Int, valuelength: Long, value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesUsbWinUsbGetPowerPolicy(interfacehandle: Long, policytype: Int, valuelength: Long, value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesUsbWinUsbInitialize(devicehandle: Long, interfacehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesUsbWinUsbParseConfigurationDescriptor(configurationdescriptor: Long, startposition: Long, interfacenumber: Int, alternatesetting: Int, interfaceclass: Int, interfacesubclass: Int, interfaceprotocol: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesUsbWinUsbParseDescriptors(descriptorbuffer: Long, totallength: Int, startposition: Long, descriptortype: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesUsbWinUsbQueryDeviceInformation(interfacehandle: Long, informationtype: Int, bufferlength: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesUsbWinUsbQueryInterfaceSettings(interfacehandle: Long, alternateinterfacenumber: Byte, usbaltinterfacedescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesUsbWinUsbQueryPipe(interfacehandle: Long, alternateinterfacenumber: Byte, pipeindex: Byte, pipeinformation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesUsbWinUsbQueryPipeEx(interfacehandle: Long, alternatesettingnumber: Byte, pipeindex: Byte, pipeinformationex: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesUsbWinUsbReadIsochPipe(bufferhandle: Long, offset: Int, length: Int, framenumber: Long, numberofpackets: Int, isopacketdescriptors: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesUsbWinUsbReadIsochPipeAsap(bufferhandle: Long, offset: Int, length: Int, continuestream: Int, numberofpackets: Int, isopacketdescriptors: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesUsbWinUsbReadPipe(interfacehandle: Long, pipeid: Byte, buffer: Long, bufferlength: Int, lengthtransferred: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesUsbWinUsbRegisterIsochBuffer(interfacehandle: Long, pipeid: Byte, buffer: Long, bufferlength: Int, isochbufferhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesUsbWinUsbResetPipe(interfacehandle: Long, pipeid: Byte): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesUsbWinUsbSetCurrentAlternateSetting(interfacehandle: Long, settingnumber: Byte): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesUsbWinUsbSetPipePolicy(interfacehandle: Long, pipeid: Byte, policytype: Int, valuelength: Int, value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesUsbWinUsbSetPowerPolicy(interfacehandle: Long, policytype: Int, valuelength: Int, value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesUsbWinUsbStartTrackingForTimeSync(interfacehandle: Long, starttrackinginfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesUsbWinUsbStopTrackingForTimeSync(interfacehandle: Long, stoptrackinginfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesUsbWinUsbUnregisterIsochBuffer(isochbufferhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesUsbWinUsbWriteIsochPipe(bufferhandle: Long, offset: Int, length: Int, framenumber: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesUsbWinUsbWriteIsochPipeAsap(bufferhandle: Long, offset: Int, length: Int, continuestream: Int, overlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesUsbWinUsbWritePipe(interfacehandle: Long, pipeid: Byte, buffer: Long, bufferlength: Int, lengthtransferred: Long, overlapped: Long): Int
}

public actual fun winUsbAbortPipe(interfacehandle: WinusbInterfaceHandle, pipeid: UByte): Bool =
    WindowsWin32DevicesUsbJniBridge.windowssysWindowsWin32DevicesUsbWinUsbAbortPipe(interfacehandle.rawAddress, pipeid.toByte())

public actual fun winUsbControlTransfer(interfacehandle: WinusbInterfaceHandle, setuppacket: WinusbSetupPacket, buffer: MutPtr<UByte>, bufferlength: UInt, lengthtransferred: MutPtr<UInt>, overlapped: ConstPtr<Overlapped>): Bool =
    0

public actual fun winUsbFlushPipe(interfacehandle: WinusbInterfaceHandle, pipeid: UByte): Bool =
    WindowsWin32DevicesUsbJniBridge.windowssysWindowsWin32DevicesUsbWinUsbFlushPipe(interfacehandle.rawAddress, pipeid.toByte())

public actual fun winUsbFree(interfacehandle: WinusbInterfaceHandle): Bool =
    WindowsWin32DevicesUsbJniBridge.windowssysWindowsWin32DevicesUsbWinUsbFree(interfacehandle.rawAddress)

public actual fun winUsbGetAdjustedFrameNumber(currentframenumber: MutPtr<UInt>, timestamp: Long): Bool =
    WindowsWin32DevicesUsbJniBridge.windowssysWindowsWin32DevicesUsbWinUsbGetAdjustedFrameNumber(currentframenumber.rawAddress, timestamp)

public actual fun winUsbGetAssociatedInterface(interfacehandle: WinusbInterfaceHandle, associatedinterfaceindex: UByte, associatedinterfacehandle: MutPtr<WinusbInterfaceHandle>): Bool =
    WindowsWin32DevicesUsbJniBridge.windowssysWindowsWin32DevicesUsbWinUsbGetAssociatedInterface(interfacehandle.rawAddress, associatedinterfaceindex.toByte(), associatedinterfacehandle.rawAddress)

public actual fun winUsbGetCurrentAlternateSetting(interfacehandle: WinusbInterfaceHandle, settingnumber: MutPtr<UByte>): Bool =
    WindowsWin32DevicesUsbJniBridge.windowssysWindowsWin32DevicesUsbWinUsbGetCurrentAlternateSetting(interfacehandle.rawAddress, settingnumber.rawAddress)

public actual fun winUsbGetCurrentFrameNumber(interfacehandle: WinusbInterfaceHandle, currentframenumber: MutPtr<UInt>, timestamp: MutPtr<Long>): Bool =
    WindowsWin32DevicesUsbJniBridge.windowssysWindowsWin32DevicesUsbWinUsbGetCurrentFrameNumber(interfacehandle.rawAddress, currentframenumber.rawAddress, timestamp.rawAddress)

public actual fun winUsbGetCurrentFrameNumberAndQpc(interfacehandle: WinusbInterfaceHandle, frameqpcinfo: ConstPtr<UsbFrameNumberAndQpcForTimeSyncInformation>): Bool =
    WindowsWin32DevicesUsbJniBridge.windowssysWindowsWin32DevicesUsbWinUsbGetCurrentFrameNumberAndQpc(interfacehandle.rawAddress, frameqpcinfo.rawAddress)

public actual fun winUsbGetDescriptor(interfacehandle: WinusbInterfaceHandle, descriptortype: UByte, index: UByte, languageid: UShort, buffer: MutPtr<UByte>, bufferlength: UInt, lengthtransferred: MutPtr<UInt>): Bool =
    WindowsWin32DevicesUsbJniBridge.windowssysWindowsWin32DevicesUsbWinUsbGetDescriptor(interfacehandle.rawAddress, descriptortype.toByte(), index.toByte(), languageid.toShort(), buffer.rawAddress, bufferlength.toInt(), lengthtransferred.rawAddress)

public actual fun winUsbGetOverlappedResult(interfacehandle: WinusbInterfaceHandle, lpoverlapped: ConstPtr<Overlapped>, lpnumberofbytestransferred: MutPtr<UInt>, bwait: Bool): Bool =
    WindowsWin32DevicesUsbJniBridge.windowssysWindowsWin32DevicesUsbWinUsbGetOverlappedResult(interfacehandle.rawAddress, lpoverlapped.rawAddress, lpnumberofbytestransferred.rawAddress, bwait)

public actual fun winUsbGetPipePolicy(interfacehandle: WinusbInterfaceHandle, pipeid: UByte, policytype: WinusbPipePolicy, valuelength: MutPtr<UInt>, value: MutPtr<CVoid>): Bool =
    WindowsWin32DevicesUsbJniBridge.windowssysWindowsWin32DevicesUsbWinUsbGetPipePolicy(interfacehandle.rawAddress, pipeid.toByte(), policytype.toInt(), valuelength.rawAddress, value.rawAddress)

public actual fun winUsbGetPowerPolicy(interfacehandle: WinusbInterfaceHandle, policytype: WinusbPowerPolicy, valuelength: MutPtr<UInt>, value: MutPtr<CVoid>): Bool =
    WindowsWin32DevicesUsbJniBridge.windowssysWindowsWin32DevicesUsbWinUsbGetPowerPolicy(interfacehandle.rawAddress, policytype.toInt(), valuelength.rawAddress, value.rawAddress)

public actual fun winUsbInitialize(devicehandle: Handle, interfacehandle: MutPtr<WinusbInterfaceHandle>): Bool =
    WindowsWin32DevicesUsbJniBridge.windowssysWindowsWin32DevicesUsbWinUsbInitialize(devicehandle.rawAddress, interfacehandle.rawAddress)

public actual fun winUsbParseConfigurationDescriptor(configurationdescriptor: ConstPtr<UsbConfigurationDescriptor>, startposition: ConstPtr<CVoid>, interfacenumber: Int, alternatesetting: Int, interfaceclass: Int, interfacesubclass: Int, interfaceprotocol: Int): MutPtr<UsbInterfaceDescriptor> =
    MutPtr(WindowsWin32DevicesUsbJniBridge.windowssysWindowsWin32DevicesUsbWinUsbParseConfigurationDescriptor(configurationdescriptor.rawAddress, startposition.rawAddress, interfacenumber, alternatesetting, interfaceclass, interfacesubclass, interfaceprotocol))

public actual fun winUsbParseDescriptors(descriptorbuffer: ConstPtr<CVoid>, totallength: UInt, startposition: ConstPtr<CVoid>, descriptortype: Int): MutPtr<UsbCommonDescriptor> =
    MutPtr(WindowsWin32DevicesUsbJniBridge.windowssysWindowsWin32DevicesUsbWinUsbParseDescriptors(descriptorbuffer.rawAddress, totallength.toInt(), startposition.rawAddress, descriptortype))

public actual fun winUsbQueryDeviceInformation(interfacehandle: WinusbInterfaceHandle, informationtype: UInt, bufferlength: MutPtr<UInt>, buffer: MutPtr<CVoid>): Bool =
    WindowsWin32DevicesUsbJniBridge.windowssysWindowsWin32DevicesUsbWinUsbQueryDeviceInformation(interfacehandle.rawAddress, informationtype.toInt(), bufferlength.rawAddress, buffer.rawAddress)

public actual fun winUsbQueryInterfaceSettings(interfacehandle: WinusbInterfaceHandle, alternateinterfacenumber: UByte, usbaltinterfacedescriptor: MutPtr<UsbInterfaceDescriptor>): Bool =
    WindowsWin32DevicesUsbJniBridge.windowssysWindowsWin32DevicesUsbWinUsbQueryInterfaceSettings(interfacehandle.rawAddress, alternateinterfacenumber.toByte(), usbaltinterfacedescriptor.rawAddress)

public actual fun winUsbQueryPipe(interfacehandle: WinusbInterfaceHandle, alternateinterfacenumber: UByte, pipeindex: UByte, pipeinformation: MutPtr<WinusbPipeInformation>): Bool =
    WindowsWin32DevicesUsbJniBridge.windowssysWindowsWin32DevicesUsbWinUsbQueryPipe(interfacehandle.rawAddress, alternateinterfacenumber.toByte(), pipeindex.toByte(), pipeinformation.rawAddress)

public actual fun winUsbQueryPipeEx(interfacehandle: WinusbInterfaceHandle, alternatesettingnumber: UByte, pipeindex: UByte, pipeinformationex: MutPtr<WinusbPipeInformationEx>): Bool =
    WindowsWin32DevicesUsbJniBridge.windowssysWindowsWin32DevicesUsbWinUsbQueryPipeEx(interfacehandle.rawAddress, alternatesettingnumber.toByte(), pipeindex.toByte(), pipeinformationex.rawAddress)

public actual fun winUsbReadIsochPipe(bufferhandle: ConstPtr<CVoid>, offset: UInt, length: UInt, framenumber: MutPtr<UInt>, numberofpackets: UInt, isopacketdescriptors: MutPtr<UsbdIsoPacketDescriptor>, overlapped: ConstPtr<Overlapped>): Bool =
    WindowsWin32DevicesUsbJniBridge.windowssysWindowsWin32DevicesUsbWinUsbReadIsochPipe(bufferhandle.rawAddress, offset.toInt(), length.toInt(), framenumber.rawAddress, numberofpackets.toInt(), isopacketdescriptors.rawAddress, overlapped.rawAddress)

public actual fun winUsbReadIsochPipeAsap(bufferhandle: ConstPtr<CVoid>, offset: UInt, length: UInt, continuestream: Bool, numberofpackets: UInt, isopacketdescriptors: MutPtr<UsbdIsoPacketDescriptor>, overlapped: ConstPtr<Overlapped>): Bool =
    WindowsWin32DevicesUsbJniBridge.windowssysWindowsWin32DevicesUsbWinUsbReadIsochPipeAsap(bufferhandle.rawAddress, offset.toInt(), length.toInt(), continuestream, numberofpackets.toInt(), isopacketdescriptors.rawAddress, overlapped.rawAddress)

public actual fun winUsbReadPipe(interfacehandle: WinusbInterfaceHandle, pipeid: UByte, buffer: MutPtr<UByte>, bufferlength: UInt, lengthtransferred: MutPtr<UInt>, overlapped: ConstPtr<Overlapped>): Bool =
    WindowsWin32DevicesUsbJniBridge.windowssysWindowsWin32DevicesUsbWinUsbReadPipe(interfacehandle.rawAddress, pipeid.toByte(), buffer.rawAddress, bufferlength.toInt(), lengthtransferred.rawAddress, overlapped.rawAddress)

public actual fun winUsbRegisterIsochBuffer(interfacehandle: WinusbInterfaceHandle, pipeid: UByte, buffer: MutPtr<UByte>, bufferlength: UInt, isochbufferhandle: MutPtr<MutPtr<CVoid>>): Bool =
    WindowsWin32DevicesUsbJniBridge.windowssysWindowsWin32DevicesUsbWinUsbRegisterIsochBuffer(interfacehandle.rawAddress, pipeid.toByte(), buffer.rawAddress, bufferlength.toInt(), isochbufferhandle.rawAddress)

public actual fun winUsbResetPipe(interfacehandle: WinusbInterfaceHandle, pipeid: UByte): Bool =
    WindowsWin32DevicesUsbJniBridge.windowssysWindowsWin32DevicesUsbWinUsbResetPipe(interfacehandle.rawAddress, pipeid.toByte())

public actual fun winUsbSetCurrentAlternateSetting(interfacehandle: WinusbInterfaceHandle, settingnumber: UByte): Bool =
    WindowsWin32DevicesUsbJniBridge.windowssysWindowsWin32DevicesUsbWinUsbSetCurrentAlternateSetting(interfacehandle.rawAddress, settingnumber.toByte())

public actual fun winUsbSetPipePolicy(interfacehandle: WinusbInterfaceHandle, pipeid: UByte, policytype: WinusbPipePolicy, valuelength: UInt, value: ConstPtr<CVoid>): Bool =
    WindowsWin32DevicesUsbJniBridge.windowssysWindowsWin32DevicesUsbWinUsbSetPipePolicy(interfacehandle.rawAddress, pipeid.toByte(), policytype.toInt(), valuelength.toInt(), value.rawAddress)

public actual fun winUsbSetPowerPolicy(interfacehandle: WinusbInterfaceHandle, policytype: WinusbPowerPolicy, valuelength: UInt, value: ConstPtr<CVoid>): Bool =
    WindowsWin32DevicesUsbJniBridge.windowssysWindowsWin32DevicesUsbWinUsbSetPowerPolicy(interfacehandle.rawAddress, policytype.toInt(), valuelength.toInt(), value.rawAddress)

public actual fun winUsbStartTrackingForTimeSync(interfacehandle: WinusbInterfaceHandle, starttrackinginfo: ConstPtr<UsbStartTrackingForTimeSyncInformation>): Bool =
    WindowsWin32DevicesUsbJniBridge.windowssysWindowsWin32DevicesUsbWinUsbStartTrackingForTimeSync(interfacehandle.rawAddress, starttrackinginfo.rawAddress)

public actual fun winUsbStopTrackingForTimeSync(interfacehandle: WinusbInterfaceHandle, stoptrackinginfo: ConstPtr<UsbStopTrackingForTimeSyncInformation>): Bool =
    WindowsWin32DevicesUsbJniBridge.windowssysWindowsWin32DevicesUsbWinUsbStopTrackingForTimeSync(interfacehandle.rawAddress, stoptrackinginfo.rawAddress)

public actual fun winUsbUnregisterIsochBuffer(isochbufferhandle: ConstPtr<CVoid>): Bool =
    WindowsWin32DevicesUsbJniBridge.windowssysWindowsWin32DevicesUsbWinUsbUnregisterIsochBuffer(isochbufferhandle.rawAddress)

public actual fun winUsbWriteIsochPipe(bufferhandle: ConstPtr<CVoid>, offset: UInt, length: UInt, framenumber: MutPtr<UInt>, overlapped: ConstPtr<Overlapped>): Bool =
    WindowsWin32DevicesUsbJniBridge.windowssysWindowsWin32DevicesUsbWinUsbWriteIsochPipe(bufferhandle.rawAddress, offset.toInt(), length.toInt(), framenumber.rawAddress, overlapped.rawAddress)

public actual fun winUsbWriteIsochPipeAsap(bufferhandle: ConstPtr<CVoid>, offset: UInt, length: UInt, continuestream: Bool, overlapped: ConstPtr<Overlapped>): Bool =
    WindowsWin32DevicesUsbJniBridge.windowssysWindowsWin32DevicesUsbWinUsbWriteIsochPipeAsap(bufferhandle.rawAddress, offset.toInt(), length.toInt(), continuestream, overlapped.rawAddress)

public actual fun winUsbWritePipe(interfacehandle: WinusbInterfaceHandle, pipeid: UByte, buffer: ConstPtr<UByte>, bufferlength: UInt, lengthtransferred: MutPtr<UInt>, overlapped: ConstPtr<Overlapped>): Bool =
    WindowsWin32DevicesUsbJniBridge.windowssysWindowsWin32DevicesUsbWinUsbWritePipe(interfacehandle.rawAddress, pipeid.toByte(), buffer.rawAddress, bufferlength.toInt(), lengthtransferred.rawAddress, overlapped.rawAddress)
