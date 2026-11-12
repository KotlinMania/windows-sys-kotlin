@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.usb

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.system.io.Overlapped

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32DevicesUsbNapiAddon(): Boolean

private val windowsWin32DevicesUsbNapiAvailable: Boolean = initWindowsWin32DevicesUsbNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesUsbWinUsbAbortPipe(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesUsbWinUsbAbortPipe(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesUsbWinUsbFlushPipe(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesUsbWinUsbFlushPipe(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesUsbWinUsbFree(p0)")
private external fun wasmWindowssysWindowsWin32DevicesUsbWinUsbFree(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesUsbWinUsbGetAdjustedFrameNumber(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesUsbWinUsbGetAdjustedFrameNumber(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesUsbWinUsbGetAssociatedInterface(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesUsbWinUsbGetAssociatedInterface(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesUsbWinUsbGetCurrentAlternateSetting(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesUsbWinUsbGetCurrentAlternateSetting(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesUsbWinUsbGetCurrentFrameNumber(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesUsbWinUsbGetCurrentFrameNumber(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesUsbWinUsbGetCurrentFrameNumberAndQpc(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesUsbWinUsbGetCurrentFrameNumberAndQpc(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesUsbWinUsbGetDescriptor(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesUsbWinUsbGetDescriptor(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesUsbWinUsbGetOverlappedResult(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesUsbWinUsbGetOverlappedResult(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesUsbWinUsbGetPipePolicy(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesUsbWinUsbGetPipePolicy(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesUsbWinUsbGetPowerPolicy(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesUsbWinUsbGetPowerPolicy(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesUsbWinUsbInitialize(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesUsbWinUsbInitialize(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesUsbWinUsbParseConfigurationDescriptor(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesUsbWinUsbParseConfigurationDescriptor(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesUsbWinUsbParseDescriptors(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesUsbWinUsbParseDescriptors(p0: String, p1: Int, p2: String, p3: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesUsbWinUsbQueryDeviceInformation(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesUsbWinUsbQueryDeviceInformation(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesUsbWinUsbQueryInterfaceSettings(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesUsbWinUsbQueryInterfaceSettings(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesUsbWinUsbQueryPipe(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesUsbWinUsbQueryPipe(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesUsbWinUsbQueryPipeEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesUsbWinUsbQueryPipeEx(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesUsbWinUsbReadIsochPipe(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesUsbWinUsbReadIsochPipe(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesUsbWinUsbReadIsochPipeAsap(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesUsbWinUsbReadIsochPipeAsap(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesUsbWinUsbReadPipe(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesUsbWinUsbReadPipe(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesUsbWinUsbRegisterIsochBuffer(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesUsbWinUsbRegisterIsochBuffer(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesUsbWinUsbResetPipe(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesUsbWinUsbResetPipe(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesUsbWinUsbSetCurrentAlternateSetting(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesUsbWinUsbSetCurrentAlternateSetting(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesUsbWinUsbSetPipePolicy(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesUsbWinUsbSetPipePolicy(p0: String, p1: Int, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesUsbWinUsbSetPowerPolicy(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesUsbWinUsbSetPowerPolicy(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesUsbWinUsbStartTrackingForTimeSync(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesUsbWinUsbStartTrackingForTimeSync(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesUsbWinUsbStopTrackingForTimeSync(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesUsbWinUsbStopTrackingForTimeSync(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesUsbWinUsbUnregisterIsochBuffer(p0)")
private external fun wasmWindowssysWindowsWin32DevicesUsbWinUsbUnregisterIsochBuffer(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesUsbWinUsbWriteIsochPipe(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesUsbWinUsbWriteIsochPipe(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesUsbWinUsbWriteIsochPipeAsap(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesUsbWinUsbWriteIsochPipeAsap(p0: String, p1: Int, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesUsbWinUsbWritePipe(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesUsbWinUsbWritePipe(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

public actual fun winUsbAbortPipe(interfacehandle: WinusbInterfaceHandle, pipeid: UByte): Bool =
    if (windowsWin32DevicesUsbNapiAvailable) wasmWindowssysWindowsWin32DevicesUsbWinUsbAbortPipe(interfacehandle.rawAddress.toString(), pipeid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbControlTransfer(interfacehandle: WinusbInterfaceHandle, setuppacket: WinusbSetupPacket, buffer: MutPtr<UByte>, bufferlength: UInt, lengthtransferred: MutPtr<UInt>, overlapped: ConstPtr<Overlapped>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbFlushPipe(interfacehandle: WinusbInterfaceHandle, pipeid: UByte): Bool =
    if (windowsWin32DevicesUsbNapiAvailable) wasmWindowssysWindowsWin32DevicesUsbWinUsbFlushPipe(interfacehandle.rawAddress.toString(), pipeid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbFree(interfacehandle: WinusbInterfaceHandle): Bool =
    if (windowsWin32DevicesUsbNapiAvailable) wasmWindowssysWindowsWin32DevicesUsbWinUsbFree(interfacehandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbGetAdjustedFrameNumber(currentframenumber: MutPtr<UInt>, timestamp: Long): Bool =
    if (windowsWin32DevicesUsbNapiAvailable) wasmWindowssysWindowsWin32DevicesUsbWinUsbGetAdjustedFrameNumber(currentframenumber.rawAddress.toString(), timestamp.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbGetAssociatedInterface(interfacehandle: WinusbInterfaceHandle, associatedinterfaceindex: UByte, associatedinterfacehandle: MutPtr<WinusbInterfaceHandle>): Bool =
    if (windowsWin32DevicesUsbNapiAvailable) wasmWindowssysWindowsWin32DevicesUsbWinUsbGetAssociatedInterface(interfacehandle.rawAddress.toString(), associatedinterfaceindex.toInt(), associatedinterfacehandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbGetCurrentAlternateSetting(interfacehandle: WinusbInterfaceHandle, settingnumber: MutPtr<UByte>): Bool =
    if (windowsWin32DevicesUsbNapiAvailable) wasmWindowssysWindowsWin32DevicesUsbWinUsbGetCurrentAlternateSetting(interfacehandle.rawAddress.toString(), settingnumber.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbGetCurrentFrameNumber(interfacehandle: WinusbInterfaceHandle, currentframenumber: MutPtr<UInt>, timestamp: MutPtr<Long>): Bool =
    if (windowsWin32DevicesUsbNapiAvailable) wasmWindowssysWindowsWin32DevicesUsbWinUsbGetCurrentFrameNumber(interfacehandle.rawAddress.toString(), currentframenumber.rawAddress.toString(), timestamp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbGetCurrentFrameNumberAndQpc(interfacehandle: WinusbInterfaceHandle, frameqpcinfo: ConstPtr<UsbFrameNumberAndQpcForTimeSyncInformation>): Bool =
    if (windowsWin32DevicesUsbNapiAvailable) wasmWindowssysWindowsWin32DevicesUsbWinUsbGetCurrentFrameNumberAndQpc(interfacehandle.rawAddress.toString(), frameqpcinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbGetDescriptor(interfacehandle: WinusbInterfaceHandle, descriptortype: UByte, index: UByte, languageid: UShort, buffer: MutPtr<UByte>, bufferlength: UInt, lengthtransferred: MutPtr<UInt>): Bool =
    if (windowsWin32DevicesUsbNapiAvailable) wasmWindowssysWindowsWin32DevicesUsbWinUsbGetDescriptor(interfacehandle.rawAddress.toString(), descriptortype.toInt(), index.toInt(), languageid.toInt(), buffer.rawAddress.toString(), bufferlength.toInt(), lengthtransferred.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbGetOverlappedResult(interfacehandle: WinusbInterfaceHandle, lpoverlapped: ConstPtr<Overlapped>, lpnumberofbytestransferred: MutPtr<UInt>, bwait: Bool): Bool =
    if (windowsWin32DevicesUsbNapiAvailable) wasmWindowssysWindowsWin32DevicesUsbWinUsbGetOverlappedResult(interfacehandle.rawAddress.toString(), lpoverlapped.rawAddress.toString(), lpnumberofbytestransferred.rawAddress.toString(), bwait) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbGetPipePolicy(interfacehandle: WinusbInterfaceHandle, pipeid: UByte, policytype: WinusbPipePolicy, valuelength: MutPtr<UInt>, value: MutPtr<CVoid>): Bool =
    if (windowsWin32DevicesUsbNapiAvailable) wasmWindowssysWindowsWin32DevicesUsbWinUsbGetPipePolicy(interfacehandle.rawAddress.toString(), pipeid.toInt(), policytype.toInt(), valuelength.rawAddress.toString(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbGetPowerPolicy(interfacehandle: WinusbInterfaceHandle, policytype: WinusbPowerPolicy, valuelength: MutPtr<UInt>, value: MutPtr<CVoid>): Bool =
    if (windowsWin32DevicesUsbNapiAvailable) wasmWindowssysWindowsWin32DevicesUsbWinUsbGetPowerPolicy(interfacehandle.rawAddress.toString(), policytype.toInt(), valuelength.rawAddress.toString(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbInitialize(devicehandle: Handle, interfacehandle: MutPtr<WinusbInterfaceHandle>): Bool =
    if (windowsWin32DevicesUsbNapiAvailable) wasmWindowssysWindowsWin32DevicesUsbWinUsbInitialize(devicehandle.rawAddress.toString(), interfacehandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbParseConfigurationDescriptor(configurationdescriptor: ConstPtr<UsbConfigurationDescriptor>, startposition: ConstPtr<CVoid>, interfacenumber: Int, alternatesetting: Int, interfaceclass: Int, interfacesubclass: Int, interfaceprotocol: Int): MutPtr<UsbInterfaceDescriptor> =
    if (windowsWin32DevicesUsbNapiAvailable) MutPtr(wasmWindowssysWindowsWin32DevicesUsbWinUsbParseConfigurationDescriptor(configurationdescriptor.rawAddress.toString(), startposition.rawAddress.toString(), interfacenumber, alternatesetting, interfaceclass, interfacesubclass, interfaceprotocol).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbParseDescriptors(descriptorbuffer: ConstPtr<CVoid>, totallength: UInt, startposition: ConstPtr<CVoid>, descriptortype: Int): MutPtr<UsbCommonDescriptor> =
    if (windowsWin32DevicesUsbNapiAvailable) MutPtr(wasmWindowssysWindowsWin32DevicesUsbWinUsbParseDescriptors(descriptorbuffer.rawAddress.toString(), totallength.toInt(), startposition.rawAddress.toString(), descriptortype).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbQueryDeviceInformation(interfacehandle: WinusbInterfaceHandle, informationtype: UInt, bufferlength: MutPtr<UInt>, buffer: MutPtr<CVoid>): Bool =
    if (windowsWin32DevicesUsbNapiAvailable) wasmWindowssysWindowsWin32DevicesUsbWinUsbQueryDeviceInformation(interfacehandle.rawAddress.toString(), informationtype.toInt(), bufferlength.rawAddress.toString(), buffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbQueryInterfaceSettings(interfacehandle: WinusbInterfaceHandle, alternateinterfacenumber: UByte, usbaltinterfacedescriptor: MutPtr<UsbInterfaceDescriptor>): Bool =
    if (windowsWin32DevicesUsbNapiAvailable) wasmWindowssysWindowsWin32DevicesUsbWinUsbQueryInterfaceSettings(interfacehandle.rawAddress.toString(), alternateinterfacenumber.toInt(), usbaltinterfacedescriptor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbQueryPipe(interfacehandle: WinusbInterfaceHandle, alternateinterfacenumber: UByte, pipeindex: UByte, pipeinformation: MutPtr<WinusbPipeInformation>): Bool =
    if (windowsWin32DevicesUsbNapiAvailable) wasmWindowssysWindowsWin32DevicesUsbWinUsbQueryPipe(interfacehandle.rawAddress.toString(), alternateinterfacenumber.toInt(), pipeindex.toInt(), pipeinformation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbQueryPipeEx(interfacehandle: WinusbInterfaceHandle, alternatesettingnumber: UByte, pipeindex: UByte, pipeinformationex: MutPtr<WinusbPipeInformationEx>): Bool =
    if (windowsWin32DevicesUsbNapiAvailable) wasmWindowssysWindowsWin32DevicesUsbWinUsbQueryPipeEx(interfacehandle.rawAddress.toString(), alternatesettingnumber.toInt(), pipeindex.toInt(), pipeinformationex.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbReadIsochPipe(bufferhandle: ConstPtr<CVoid>, offset: UInt, length: UInt, framenumber: MutPtr<UInt>, numberofpackets: UInt, isopacketdescriptors: MutPtr<UsbdIsoPacketDescriptor>, overlapped: ConstPtr<Overlapped>): Bool =
    if (windowsWin32DevicesUsbNapiAvailable) wasmWindowssysWindowsWin32DevicesUsbWinUsbReadIsochPipe(bufferhandle.rawAddress.toString(), offset.toInt(), length.toInt(), framenumber.rawAddress.toString(), numberofpackets.toInt(), isopacketdescriptors.rawAddress.toString(), overlapped.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbReadIsochPipeAsap(bufferhandle: ConstPtr<CVoid>, offset: UInt, length: UInt, continuestream: Bool, numberofpackets: UInt, isopacketdescriptors: MutPtr<UsbdIsoPacketDescriptor>, overlapped: ConstPtr<Overlapped>): Bool =
    if (windowsWin32DevicesUsbNapiAvailable) wasmWindowssysWindowsWin32DevicesUsbWinUsbReadIsochPipeAsap(bufferhandle.rawAddress.toString(), offset.toInt(), length.toInt(), continuestream, numberofpackets.toInt(), isopacketdescriptors.rawAddress.toString(), overlapped.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbReadPipe(interfacehandle: WinusbInterfaceHandle, pipeid: UByte, buffer: MutPtr<UByte>, bufferlength: UInt, lengthtransferred: MutPtr<UInt>, overlapped: ConstPtr<Overlapped>): Bool =
    if (windowsWin32DevicesUsbNapiAvailable) wasmWindowssysWindowsWin32DevicesUsbWinUsbReadPipe(interfacehandle.rawAddress.toString(), pipeid.toInt(), buffer.rawAddress.toString(), bufferlength.toInt(), lengthtransferred.rawAddress.toString(), overlapped.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbRegisterIsochBuffer(interfacehandle: WinusbInterfaceHandle, pipeid: UByte, buffer: MutPtr<UByte>, bufferlength: UInt, isochbufferhandle: MutPtr<MutPtr<CVoid>>): Bool =
    if (windowsWin32DevicesUsbNapiAvailable) wasmWindowssysWindowsWin32DevicesUsbWinUsbRegisterIsochBuffer(interfacehandle.rawAddress.toString(), pipeid.toInt(), buffer.rawAddress.toString(), bufferlength.toInt(), isochbufferhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbResetPipe(interfacehandle: WinusbInterfaceHandle, pipeid: UByte): Bool =
    if (windowsWin32DevicesUsbNapiAvailable) wasmWindowssysWindowsWin32DevicesUsbWinUsbResetPipe(interfacehandle.rawAddress.toString(), pipeid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbSetCurrentAlternateSetting(interfacehandle: WinusbInterfaceHandle, settingnumber: UByte): Bool =
    if (windowsWin32DevicesUsbNapiAvailable) wasmWindowssysWindowsWin32DevicesUsbWinUsbSetCurrentAlternateSetting(interfacehandle.rawAddress.toString(), settingnumber.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbSetPipePolicy(interfacehandle: WinusbInterfaceHandle, pipeid: UByte, policytype: WinusbPipePolicy, valuelength: UInt, value: ConstPtr<CVoid>): Bool =
    if (windowsWin32DevicesUsbNapiAvailable) wasmWindowssysWindowsWin32DevicesUsbWinUsbSetPipePolicy(interfacehandle.rawAddress.toString(), pipeid.toInt(), policytype.toInt(), valuelength.toInt(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbSetPowerPolicy(interfacehandle: WinusbInterfaceHandle, policytype: WinusbPowerPolicy, valuelength: UInt, value: ConstPtr<CVoid>): Bool =
    if (windowsWin32DevicesUsbNapiAvailable) wasmWindowssysWindowsWin32DevicesUsbWinUsbSetPowerPolicy(interfacehandle.rawAddress.toString(), policytype.toInt(), valuelength.toInt(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbStartTrackingForTimeSync(interfacehandle: WinusbInterfaceHandle, starttrackinginfo: ConstPtr<UsbStartTrackingForTimeSyncInformation>): Bool =
    if (windowsWin32DevicesUsbNapiAvailable) wasmWindowssysWindowsWin32DevicesUsbWinUsbStartTrackingForTimeSync(interfacehandle.rawAddress.toString(), starttrackinginfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbStopTrackingForTimeSync(interfacehandle: WinusbInterfaceHandle, stoptrackinginfo: ConstPtr<UsbStopTrackingForTimeSyncInformation>): Bool =
    if (windowsWin32DevicesUsbNapiAvailable) wasmWindowssysWindowsWin32DevicesUsbWinUsbStopTrackingForTimeSync(interfacehandle.rawAddress.toString(), stoptrackinginfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbUnregisterIsochBuffer(isochbufferhandle: ConstPtr<CVoid>): Bool =
    if (windowsWin32DevicesUsbNapiAvailable) wasmWindowssysWindowsWin32DevicesUsbWinUsbUnregisterIsochBuffer(isochbufferhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbWriteIsochPipe(bufferhandle: ConstPtr<CVoid>, offset: UInt, length: UInt, framenumber: MutPtr<UInt>, overlapped: ConstPtr<Overlapped>): Bool =
    if (windowsWin32DevicesUsbNapiAvailable) wasmWindowssysWindowsWin32DevicesUsbWinUsbWriteIsochPipe(bufferhandle.rawAddress.toString(), offset.toInt(), length.toInt(), framenumber.rawAddress.toString(), overlapped.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbWriteIsochPipeAsap(bufferhandle: ConstPtr<CVoid>, offset: UInt, length: UInt, continuestream: Bool, overlapped: ConstPtr<Overlapped>): Bool =
    if (windowsWin32DevicesUsbNapiAvailable) wasmWindowssysWindowsWin32DevicesUsbWinUsbWriteIsochPipeAsap(bufferhandle.rawAddress.toString(), offset.toInt(), length.toInt(), continuestream, overlapped.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbWritePipe(interfacehandle: WinusbInterfaceHandle, pipeid: UByte, buffer: ConstPtr<UByte>, bufferlength: UInt, lengthtransferred: MutPtr<UInt>, overlapped: ConstPtr<Overlapped>): Bool =
    if (windowsWin32DevicesUsbNapiAvailable) wasmWindowssysWindowsWin32DevicesUsbWinUsbWritePipe(interfacehandle.rawAddress.toString(), pipeid.toInt(), buffer.rawAddress.toString(), bufferlength.toInt(), lengthtransferred.rawAddress.toString(), overlapped.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
