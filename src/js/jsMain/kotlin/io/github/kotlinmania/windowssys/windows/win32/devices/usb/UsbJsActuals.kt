@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.usb

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.system.io.Overlapped

private val windowsWin32DevicesUsbNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun winUsbAbortPipe(interfacehandle: WinusbInterfaceHandle, pipeid: UByte): Bool =
    if (windowsWin32DevicesUsbNapiAddon != null) (windowsWin32DevicesUsbNapiAddon.windowssysWindowsWin32DevicesUsbWinUsbAbortPipe(interfacehandle.rawAddress.toString(), pipeid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbControlTransfer(interfacehandle: WinusbInterfaceHandle, setuppacket: WinusbSetupPacket, buffer: MutPtr<UByte>, bufferlength: UInt, lengthtransferred: MutPtr<UInt>, overlapped: ConstPtr<Overlapped>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbFlushPipe(interfacehandle: WinusbInterfaceHandle, pipeid: UByte): Bool =
    if (windowsWin32DevicesUsbNapiAddon != null) (windowsWin32DevicesUsbNapiAddon.windowssysWindowsWin32DevicesUsbWinUsbFlushPipe(interfacehandle.rawAddress.toString(), pipeid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbFree(interfacehandle: WinusbInterfaceHandle): Bool =
    if (windowsWin32DevicesUsbNapiAddon != null) (windowsWin32DevicesUsbNapiAddon.windowssysWindowsWin32DevicesUsbWinUsbFree(interfacehandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbGetAdjustedFrameNumber(currentframenumber: MutPtr<UInt>, timestamp: Long): Bool =
    if (windowsWin32DevicesUsbNapiAddon != null) (windowsWin32DevicesUsbNapiAddon.windowssysWindowsWin32DevicesUsbWinUsbGetAdjustedFrameNumber(currentframenumber.rawAddress.toString(), timestamp.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbGetAssociatedInterface(interfacehandle: WinusbInterfaceHandle, associatedinterfaceindex: UByte, associatedinterfacehandle: MutPtr<WinusbInterfaceHandle>): Bool =
    if (windowsWin32DevicesUsbNapiAddon != null) (windowsWin32DevicesUsbNapiAddon.windowssysWindowsWin32DevicesUsbWinUsbGetAssociatedInterface(interfacehandle.rawAddress.toString(), associatedinterfaceindex.toInt(), associatedinterfacehandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbGetCurrentAlternateSetting(interfacehandle: WinusbInterfaceHandle, settingnumber: MutPtr<UByte>): Bool =
    if (windowsWin32DevicesUsbNapiAddon != null) (windowsWin32DevicesUsbNapiAddon.windowssysWindowsWin32DevicesUsbWinUsbGetCurrentAlternateSetting(interfacehandle.rawAddress.toString(), settingnumber.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbGetCurrentFrameNumber(interfacehandle: WinusbInterfaceHandle, currentframenumber: MutPtr<UInt>, timestamp: MutPtr<Long>): Bool =
    if (windowsWin32DevicesUsbNapiAddon != null) (windowsWin32DevicesUsbNapiAddon.windowssysWindowsWin32DevicesUsbWinUsbGetCurrentFrameNumber(interfacehandle.rawAddress.toString(), currentframenumber.rawAddress.toString(), timestamp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbGetCurrentFrameNumberAndQpc(interfacehandle: WinusbInterfaceHandle, frameqpcinfo: ConstPtr<UsbFrameNumberAndQpcForTimeSyncInformation>): Bool =
    if (windowsWin32DevicesUsbNapiAddon != null) (windowsWin32DevicesUsbNapiAddon.windowssysWindowsWin32DevicesUsbWinUsbGetCurrentFrameNumberAndQpc(interfacehandle.rawAddress.toString(), frameqpcinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbGetDescriptor(interfacehandle: WinusbInterfaceHandle, descriptortype: UByte, index: UByte, languageid: UShort, buffer: MutPtr<UByte>, bufferlength: UInt, lengthtransferred: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesUsbNapiAddon != null) (windowsWin32DevicesUsbNapiAddon.windowssysWindowsWin32DevicesUsbWinUsbGetDescriptor(interfacehandle.rawAddress.toString(), descriptortype.toInt(), index.toInt(), languageid.toInt(), buffer.rawAddress.toString(), bufferlength.toInt(), lengthtransferred.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbGetOverlappedResult(interfacehandle: WinusbInterfaceHandle, lpoverlapped: ConstPtr<Overlapped>, lpnumberofbytestransferred: MutPtr<UInt>, bwait: Bool): Bool =
    if (windowsWin32DevicesUsbNapiAddon != null) (windowsWin32DevicesUsbNapiAddon.windowssysWindowsWin32DevicesUsbWinUsbGetOverlappedResult(interfacehandle.rawAddress.toString(), lpoverlapped.rawAddress.toString(), lpnumberofbytestransferred.rawAddress.toString(), bwait) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbGetPipePolicy(interfacehandle: WinusbInterfaceHandle, pipeid: UByte, policytype: WinusbPipePolicy, valuelength: MutPtr<UInt>, value: MutPtr<CVoid>): Bool =
    if (windowsWin32DevicesUsbNapiAddon != null) (windowsWin32DevicesUsbNapiAddon.windowssysWindowsWin32DevicesUsbWinUsbGetPipePolicy(interfacehandle.rawAddress.toString(), pipeid.toInt(), policytype.toInt(), valuelength.rawAddress.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbGetPowerPolicy(interfacehandle: WinusbInterfaceHandle, policytype: WinusbPowerPolicy, valuelength: MutPtr<UInt>, value: MutPtr<CVoid>): Bool =
    if (windowsWin32DevicesUsbNapiAddon != null) (windowsWin32DevicesUsbNapiAddon.windowssysWindowsWin32DevicesUsbWinUsbGetPowerPolicy(interfacehandle.rawAddress.toString(), policytype.toInt(), valuelength.rawAddress.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbInitialize(devicehandle: Handle, interfacehandle: MutPtr<WinusbInterfaceHandle>): Bool =
    if (windowsWin32DevicesUsbNapiAddon != null) (windowsWin32DevicesUsbNapiAddon.windowssysWindowsWin32DevicesUsbWinUsbInitialize(devicehandle.rawAddress.toString(), interfacehandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbParseConfigurationDescriptor(configurationdescriptor: ConstPtr<UsbConfigurationDescriptor>, startposition: ConstPtr<CVoid>, interfacenumber: Int, alternatesetting: Int, interfaceclass: Int, interfacesubclass: Int, interfaceprotocol: Int): MutPtr<UsbInterfaceDescriptor> =
    if (windowsWin32DevicesUsbNapiAddon != null) MutPtr((windowsWin32DevicesUsbNapiAddon.windowssysWindowsWin32DevicesUsbWinUsbParseConfigurationDescriptor(configurationdescriptor.rawAddress.toString(), startposition.rawAddress.toString(), interfacenumber, alternatesetting, interfaceclass, interfacesubclass, interfaceprotocol) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbParseDescriptors(descriptorbuffer: ConstPtr<CVoid>, totallength: UInt, startposition: ConstPtr<CVoid>, descriptortype: Int): MutPtr<UsbCommonDescriptor> =
    if (windowsWin32DevicesUsbNapiAddon != null) MutPtr((windowsWin32DevicesUsbNapiAddon.windowssysWindowsWin32DevicesUsbWinUsbParseDescriptors(descriptorbuffer.rawAddress.toString(), totallength.toInt(), startposition.rawAddress.toString(), descriptortype) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbQueryDeviceInformation(interfacehandle: WinusbInterfaceHandle, informationtype: UInt, bufferlength: MutPtr<UInt>, buffer: MutPtr<CVoid>): Bool =
    if (windowsWin32DevicesUsbNapiAddon != null) (windowsWin32DevicesUsbNapiAddon.windowssysWindowsWin32DevicesUsbWinUsbQueryDeviceInformation(interfacehandle.rawAddress.toString(), informationtype.toInt(), bufferlength.rawAddress.toString(), buffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbQueryInterfaceSettings(interfacehandle: WinusbInterfaceHandle, alternateinterfacenumber: UByte, usbaltinterfacedescriptor: MutPtr<UsbInterfaceDescriptor>): Bool =
    if (windowsWin32DevicesUsbNapiAddon != null) (windowsWin32DevicesUsbNapiAddon.windowssysWindowsWin32DevicesUsbWinUsbQueryInterfaceSettings(interfacehandle.rawAddress.toString(), alternateinterfacenumber.toInt(), usbaltinterfacedescriptor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbQueryPipe(interfacehandle: WinusbInterfaceHandle, alternateinterfacenumber: UByte, pipeindex: UByte, pipeinformation: MutPtr<WinusbPipeInformation>): Bool =
    if (windowsWin32DevicesUsbNapiAddon != null) (windowsWin32DevicesUsbNapiAddon.windowssysWindowsWin32DevicesUsbWinUsbQueryPipe(interfacehandle.rawAddress.toString(), alternateinterfacenumber.toInt(), pipeindex.toInt(), pipeinformation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbQueryPipeEx(interfacehandle: WinusbInterfaceHandle, alternatesettingnumber: UByte, pipeindex: UByte, pipeinformationex: MutPtr<WinusbPipeInformationEx>): Bool =
    if (windowsWin32DevicesUsbNapiAddon != null) (windowsWin32DevicesUsbNapiAddon.windowssysWindowsWin32DevicesUsbWinUsbQueryPipeEx(interfacehandle.rawAddress.toString(), alternatesettingnumber.toInt(), pipeindex.toInt(), pipeinformationex.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbReadIsochPipe(bufferhandle: ConstPtr<CVoid>, offset: UInt, length: UInt, framenumber: MutPtr<UInt>, numberofpackets: UInt, isopacketdescriptors: MutPtr<UsbdIsoPacketDescriptor>, overlapped: ConstPtr<Overlapped>): Bool =
    if (windowsWin32DevicesUsbNapiAddon != null) (windowsWin32DevicesUsbNapiAddon.windowssysWindowsWin32DevicesUsbWinUsbReadIsochPipe(bufferhandle.rawAddress.toString(), offset.toInt(), length.toInt(), framenumber.rawAddress.toString(), numberofpackets.toInt(), isopacketdescriptors.rawAddress.toString(), overlapped.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbReadIsochPipeAsap(bufferhandle: ConstPtr<CVoid>, offset: UInt, length: UInt, continuestream: Bool, numberofpackets: UInt, isopacketdescriptors: MutPtr<UsbdIsoPacketDescriptor>, overlapped: ConstPtr<Overlapped>): Bool =
    if (windowsWin32DevicesUsbNapiAddon != null) (windowsWin32DevicesUsbNapiAddon.windowssysWindowsWin32DevicesUsbWinUsbReadIsochPipeAsap(bufferhandle.rawAddress.toString(), offset.toInt(), length.toInt(), continuestream, numberofpackets.toInt(), isopacketdescriptors.rawAddress.toString(), overlapped.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbReadPipe(interfacehandle: WinusbInterfaceHandle, pipeid: UByte, buffer: MutPtr<UByte>, bufferlength: UInt, lengthtransferred: MutPtr<UInt>, overlapped: ConstPtr<Overlapped>): Bool =
    if (windowsWin32DevicesUsbNapiAddon != null) (windowsWin32DevicesUsbNapiAddon.windowssysWindowsWin32DevicesUsbWinUsbReadPipe(interfacehandle.rawAddress.toString(), pipeid.toInt(), buffer.rawAddress.toString(), bufferlength.toInt(), lengthtransferred.rawAddress.toString(), overlapped.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbRegisterIsochBuffer(interfacehandle: WinusbInterfaceHandle, pipeid: UByte, buffer: MutPtr<UByte>, bufferlength: UInt, isochbufferhandle: MutPtr<MutPtr<CVoid>>): Bool =
    if (windowsWin32DevicesUsbNapiAddon != null) (windowsWin32DevicesUsbNapiAddon.windowssysWindowsWin32DevicesUsbWinUsbRegisterIsochBuffer(interfacehandle.rawAddress.toString(), pipeid.toInt(), buffer.rawAddress.toString(), bufferlength.toInt(), isochbufferhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbResetPipe(interfacehandle: WinusbInterfaceHandle, pipeid: UByte): Bool =
    if (windowsWin32DevicesUsbNapiAddon != null) (windowsWin32DevicesUsbNapiAddon.windowssysWindowsWin32DevicesUsbWinUsbResetPipe(interfacehandle.rawAddress.toString(), pipeid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbSetCurrentAlternateSetting(interfacehandle: WinusbInterfaceHandle, settingnumber: UByte): Bool =
    if (windowsWin32DevicesUsbNapiAddon != null) (windowsWin32DevicesUsbNapiAddon.windowssysWindowsWin32DevicesUsbWinUsbSetCurrentAlternateSetting(interfacehandle.rawAddress.toString(), settingnumber.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbSetPipePolicy(interfacehandle: WinusbInterfaceHandle, pipeid: UByte, policytype: WinusbPipePolicy, valuelength: UInt, value: ConstPtr<CVoid>): Bool =
    if (windowsWin32DevicesUsbNapiAddon != null) (windowsWin32DevicesUsbNapiAddon.windowssysWindowsWin32DevicesUsbWinUsbSetPipePolicy(interfacehandle.rawAddress.toString(), pipeid.toInt(), policytype.toInt(), valuelength.toInt(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbSetPowerPolicy(interfacehandle: WinusbInterfaceHandle, policytype: WinusbPowerPolicy, valuelength: UInt, value: ConstPtr<CVoid>): Bool =
    if (windowsWin32DevicesUsbNapiAddon != null) (windowsWin32DevicesUsbNapiAddon.windowssysWindowsWin32DevicesUsbWinUsbSetPowerPolicy(interfacehandle.rawAddress.toString(), policytype.toInt(), valuelength.toInt(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbStartTrackingForTimeSync(interfacehandle: WinusbInterfaceHandle, starttrackinginfo: ConstPtr<UsbStartTrackingForTimeSyncInformation>): Bool =
    if (windowsWin32DevicesUsbNapiAddon != null) (windowsWin32DevicesUsbNapiAddon.windowssysWindowsWin32DevicesUsbWinUsbStartTrackingForTimeSync(interfacehandle.rawAddress.toString(), starttrackinginfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbStopTrackingForTimeSync(interfacehandle: WinusbInterfaceHandle, stoptrackinginfo: ConstPtr<UsbStopTrackingForTimeSyncInformation>): Bool =
    if (windowsWin32DevicesUsbNapiAddon != null) (windowsWin32DevicesUsbNapiAddon.windowssysWindowsWin32DevicesUsbWinUsbStopTrackingForTimeSync(interfacehandle.rawAddress.toString(), stoptrackinginfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbUnregisterIsochBuffer(isochbufferhandle: ConstPtr<CVoid>): Bool =
    if (windowsWin32DevicesUsbNapiAddon != null) (windowsWin32DevicesUsbNapiAddon.windowssysWindowsWin32DevicesUsbWinUsbUnregisterIsochBuffer(isochbufferhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbWriteIsochPipe(bufferhandle: ConstPtr<CVoid>, offset: UInt, length: UInt, framenumber: MutPtr<UInt>, overlapped: ConstPtr<Overlapped>): Bool =
    if (windowsWin32DevicesUsbNapiAddon != null) (windowsWin32DevicesUsbNapiAddon.windowssysWindowsWin32DevicesUsbWinUsbWriteIsochPipe(bufferhandle.rawAddress.toString(), offset.toInt(), length.toInt(), framenumber.rawAddress.toString(), overlapped.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbWriteIsochPipeAsap(bufferhandle: ConstPtr<CVoid>, offset: UInt, length: UInt, continuestream: Bool, overlapped: ConstPtr<Overlapped>): Bool =
    if (windowsWin32DevicesUsbNapiAddon != null) (windowsWin32DevicesUsbNapiAddon.windowssysWindowsWin32DevicesUsbWinUsbWriteIsochPipeAsap(bufferhandle.rawAddress.toString(), offset.toInt(), length.toInt(), continuestream, overlapped.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbWritePipe(interfacehandle: WinusbInterfaceHandle, pipeid: UByte, buffer: ConstPtr<UByte>, bufferlength: UInt, lengthtransferred: MutPtr<UInt>, overlapped: ConstPtr<Overlapped>): Bool =
    if (windowsWin32DevicesUsbNapiAddon != null) (windowsWin32DevicesUsbNapiAddon.windowssysWindowsWin32DevicesUsbWinUsbWritePipe(interfacehandle.rawAddress.toString(), pipeid.toInt(), buffer.rawAddress.toString(), bufferlength.toInt(), lengthtransferred.rawAddress.toString(), overlapped.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
