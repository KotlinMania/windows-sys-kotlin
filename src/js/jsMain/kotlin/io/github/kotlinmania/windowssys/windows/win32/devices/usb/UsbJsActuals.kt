@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.usb

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private val _windowsWin32DevicesUsbNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun winUsbAbortPipe(interfacehandle: WinusbInterfaceHandle, pipeid: UByte): Bool =
    if (_windowsWin32DevicesUsbNapiAddon != null) (_windowsWin32DevicesUsbNapiAddon.windowssys_windows_win32_devices_usb_winUsbAbortPipe((interfacehandle?.value ?: 0L).toString(), pipeid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbControlTransfer(interfacehandle: WinusbInterfaceHandle, setuppacket: WinusbSetupPacket, buffer: COpaquePointer?, bufferlength: UInt, lengthtransferred: COpaquePointer?, overlapped: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbFlushPipe(interfacehandle: WinusbInterfaceHandle, pipeid: UByte): Bool =
    if (_windowsWin32DevicesUsbNapiAddon != null) (_windowsWin32DevicesUsbNapiAddon.windowssys_windows_win32_devices_usb_winUsbFlushPipe((interfacehandle?.value ?: 0L).toString(), pipeid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbFree(interfacehandle: WinusbInterfaceHandle): Bool =
    if (_windowsWin32DevicesUsbNapiAddon != null) (_windowsWin32DevicesUsbNapiAddon.windowssys_windows_win32_devices_usb_winUsbFree((interfacehandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbGetAdjustedFrameNumber(currentframenumber: COpaquePointer?, timestamp: Long): Bool =
    if (_windowsWin32DevicesUsbNapiAddon != null) (_windowsWin32DevicesUsbNapiAddon.windowssys_windows_win32_devices_usb_winUsbGetAdjustedFrameNumber((currentframenumber?.value ?: 0L).toString(), timestamp.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbGetAssociatedInterface(interfacehandle: WinusbInterfaceHandle, associatedinterfaceindex: UByte, associatedinterfacehandle: COpaquePointer?): Bool =
    if (_windowsWin32DevicesUsbNapiAddon != null) (_windowsWin32DevicesUsbNapiAddon.windowssys_windows_win32_devices_usb_winUsbGetAssociatedInterface((interfacehandle?.value ?: 0L).toString(), associatedinterfaceindex.toInt(), (associatedinterfacehandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbGetCurrentAlternateSetting(interfacehandle: WinusbInterfaceHandle, settingnumber: COpaquePointer?): Bool =
    if (_windowsWin32DevicesUsbNapiAddon != null) (_windowsWin32DevicesUsbNapiAddon.windowssys_windows_win32_devices_usb_winUsbGetCurrentAlternateSetting((interfacehandle?.value ?: 0L).toString(), (settingnumber?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbGetCurrentFrameNumber(interfacehandle: WinusbInterfaceHandle, currentframenumber: COpaquePointer?, timestamp: COpaquePointer?): Bool =
    if (_windowsWin32DevicesUsbNapiAddon != null) (_windowsWin32DevicesUsbNapiAddon.windowssys_windows_win32_devices_usb_winUsbGetCurrentFrameNumber((interfacehandle?.value ?: 0L).toString(), (currentframenumber?.value ?: 0L).toString(), (timestamp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbGetCurrentFrameNumberAndQpc(interfacehandle: WinusbInterfaceHandle, frameqpcinfo: COpaquePointer?): Bool =
    if (_windowsWin32DevicesUsbNapiAddon != null) (_windowsWin32DevicesUsbNapiAddon.windowssys_windows_win32_devices_usb_winUsbGetCurrentFrameNumberAndQpc((interfacehandle?.value ?: 0L).toString(), (frameqpcinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbGetDescriptor(interfacehandle: WinusbInterfaceHandle, descriptortype: UByte, index: UByte, languageid: UShort, buffer: COpaquePointer?, bufferlength: UInt, lengthtransferred: COpaquePointer?): Bool =
    if (_windowsWin32DevicesUsbNapiAddon != null) (_windowsWin32DevicesUsbNapiAddon.windowssys_windows_win32_devices_usb_winUsbGetDescriptor((interfacehandle?.value ?: 0L).toString(), descriptortype.toInt(), index.toInt(), languageid.toInt(), (buffer?.value ?: 0L).toString(), bufferlength.toInt(), (lengthtransferred?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbGetOverlappedResult(interfacehandle: WinusbInterfaceHandle, lpoverlapped: COpaquePointer?, lpnumberofbytestransferred: COpaquePointer?, bwait: Bool): Bool =
    if (_windowsWin32DevicesUsbNapiAddon != null) (_windowsWin32DevicesUsbNapiAddon.windowssys_windows_win32_devices_usb_winUsbGetOverlappedResult((interfacehandle?.value ?: 0L).toString(), (lpoverlapped?.value ?: 0L).toString(), (lpnumberofbytestransferred?.value ?: 0L).toString(), bwait) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbGetPipePolicy(interfacehandle: WinusbInterfaceHandle, pipeid: UByte, policytype: WinusbPipePolicy, valuelength: COpaquePointer?, value: COpaquePointer?): Bool =
    if (_windowsWin32DevicesUsbNapiAddon != null) (_windowsWin32DevicesUsbNapiAddon.windowssys_windows_win32_devices_usb_winUsbGetPipePolicy((interfacehandle?.value ?: 0L).toString(), pipeid.toInt(), policytype.toInt(), (valuelength?.value ?: 0L).toString(), (value?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbGetPowerPolicy(interfacehandle: WinusbInterfaceHandle, policytype: WinusbPowerPolicy, valuelength: COpaquePointer?, value: COpaquePointer?): Bool =
    if (_windowsWin32DevicesUsbNapiAddon != null) (_windowsWin32DevicesUsbNapiAddon.windowssys_windows_win32_devices_usb_winUsbGetPowerPolicy((interfacehandle?.value ?: 0L).toString(), policytype.toInt(), (valuelength?.value ?: 0L).toString(), (value?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbInitialize(devicehandle: Handle, interfacehandle: COpaquePointer?): Bool =
    if (_windowsWin32DevicesUsbNapiAddon != null) (_windowsWin32DevicesUsbNapiAddon.windowssys_windows_win32_devices_usb_winUsbInitialize((devicehandle?.value ?: 0L).toString(), (interfacehandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbParseConfigurationDescriptor(configurationdescriptor: COpaquePointer?, startposition: COpaquePointer?, interfacenumber: Int, alternatesetting: Int, interfaceclass: Int, interfacesubclass: Int, interfaceprotocol: Int): COpaquePointer? =
    if (_windowsWin32DevicesUsbNapiAddon != null) (_windowsWin32DevicesUsbNapiAddon.windowssys_windows_win32_devices_usb_winUsbParseConfigurationDescriptor((configurationdescriptor?.value ?: 0L).toString(), (startposition?.value ?: 0L).toString(), interfacenumber, alternatesetting, interfaceclass, interfacesubclass, interfaceprotocol) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbParseDescriptors(descriptorbuffer: COpaquePointer?, totallength: UInt, startposition: COpaquePointer?, descriptortype: Int): COpaquePointer? =
    if (_windowsWin32DevicesUsbNapiAddon != null) (_windowsWin32DevicesUsbNapiAddon.windowssys_windows_win32_devices_usb_winUsbParseDescriptors((descriptorbuffer?.value ?: 0L).toString(), totallength.toInt(), (startposition?.value ?: 0L).toString(), descriptortype) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbQueryDeviceInformation(interfacehandle: WinusbInterfaceHandle, informationtype: UInt, bufferlength: COpaquePointer?, buffer: COpaquePointer?): Bool =
    if (_windowsWin32DevicesUsbNapiAddon != null) (_windowsWin32DevicesUsbNapiAddon.windowssys_windows_win32_devices_usb_winUsbQueryDeviceInformation((interfacehandle?.value ?: 0L).toString(), informationtype.toInt(), (bufferlength?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbQueryInterfaceSettings(interfacehandle: WinusbInterfaceHandle, alternateinterfacenumber: UByte, usbaltinterfacedescriptor: COpaquePointer?): Bool =
    if (_windowsWin32DevicesUsbNapiAddon != null) (_windowsWin32DevicesUsbNapiAddon.windowssys_windows_win32_devices_usb_winUsbQueryInterfaceSettings((interfacehandle?.value ?: 0L).toString(), alternateinterfacenumber.toInt(), (usbaltinterfacedescriptor?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbQueryPipe(interfacehandle: WinusbInterfaceHandle, alternateinterfacenumber: UByte, pipeindex: UByte, pipeinformation: COpaquePointer?): Bool =
    if (_windowsWin32DevicesUsbNapiAddon != null) (_windowsWin32DevicesUsbNapiAddon.windowssys_windows_win32_devices_usb_winUsbQueryPipe((interfacehandle?.value ?: 0L).toString(), alternateinterfacenumber.toInt(), pipeindex.toInt(), (pipeinformation?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbQueryPipeEx(interfacehandle: WinusbInterfaceHandle, alternatesettingnumber: UByte, pipeindex: UByte, pipeinformationex: COpaquePointer?): Bool =
    if (_windowsWin32DevicesUsbNapiAddon != null) (_windowsWin32DevicesUsbNapiAddon.windowssys_windows_win32_devices_usb_winUsbQueryPipeEx((interfacehandle?.value ?: 0L).toString(), alternatesettingnumber.toInt(), pipeindex.toInt(), (pipeinformationex?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbReadIsochPipe(bufferhandle: COpaquePointer?, offset: UInt, length: UInt, framenumber: COpaquePointer?, numberofpackets: UInt, isopacketdescriptors: COpaquePointer?, overlapped: COpaquePointer?): Bool =
    if (_windowsWin32DevicesUsbNapiAddon != null) (_windowsWin32DevicesUsbNapiAddon.windowssys_windows_win32_devices_usb_winUsbReadIsochPipe((bufferhandle?.value ?: 0L).toString(), offset.toInt(), length.toInt(), (framenumber?.value ?: 0L).toString(), numberofpackets.toInt(), (isopacketdescriptors?.value ?: 0L).toString(), (overlapped?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbReadIsochPipeAsap(bufferhandle: COpaquePointer?, offset: UInt, length: UInt, continuestream: Bool, numberofpackets: UInt, isopacketdescriptors: COpaquePointer?, overlapped: COpaquePointer?): Bool =
    if (_windowsWin32DevicesUsbNapiAddon != null) (_windowsWin32DevicesUsbNapiAddon.windowssys_windows_win32_devices_usb_winUsbReadIsochPipeAsap((bufferhandle?.value ?: 0L).toString(), offset.toInt(), length.toInt(), continuestream, numberofpackets.toInt(), (isopacketdescriptors?.value ?: 0L).toString(), (overlapped?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbReadPipe(interfacehandle: WinusbInterfaceHandle, pipeid: UByte, buffer: COpaquePointer?, bufferlength: UInt, lengthtransferred: COpaquePointer?, overlapped: COpaquePointer?): Bool =
    if (_windowsWin32DevicesUsbNapiAddon != null) (_windowsWin32DevicesUsbNapiAddon.windowssys_windows_win32_devices_usb_winUsbReadPipe((interfacehandle?.value ?: 0L).toString(), pipeid.toInt(), (buffer?.value ?: 0L).toString(), bufferlength.toInt(), (lengthtransferred?.value ?: 0L).toString(), (overlapped?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbRegisterIsochBuffer(interfacehandle: WinusbInterfaceHandle, pipeid: UByte, buffer: COpaquePointer?, bufferlength: UInt, isochbufferhandle: COpaquePointer?): Bool =
    if (_windowsWin32DevicesUsbNapiAddon != null) (_windowsWin32DevicesUsbNapiAddon.windowssys_windows_win32_devices_usb_winUsbRegisterIsochBuffer((interfacehandle?.value ?: 0L).toString(), pipeid.toInt(), (buffer?.value ?: 0L).toString(), bufferlength.toInt(), (isochbufferhandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbResetPipe(interfacehandle: WinusbInterfaceHandle, pipeid: UByte): Bool =
    if (_windowsWin32DevicesUsbNapiAddon != null) (_windowsWin32DevicesUsbNapiAddon.windowssys_windows_win32_devices_usb_winUsbResetPipe((interfacehandle?.value ?: 0L).toString(), pipeid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbSetCurrentAlternateSetting(interfacehandle: WinusbInterfaceHandle, settingnumber: UByte): Bool =
    if (_windowsWin32DevicesUsbNapiAddon != null) (_windowsWin32DevicesUsbNapiAddon.windowssys_windows_win32_devices_usb_winUsbSetCurrentAlternateSetting((interfacehandle?.value ?: 0L).toString(), settingnumber.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbSetPipePolicy(interfacehandle: WinusbInterfaceHandle, pipeid: UByte, policytype: WinusbPipePolicy, valuelength: UInt, value: COpaquePointer?): Bool =
    if (_windowsWin32DevicesUsbNapiAddon != null) (_windowsWin32DevicesUsbNapiAddon.windowssys_windows_win32_devices_usb_winUsbSetPipePolicy((interfacehandle?.value ?: 0L).toString(), pipeid.toInt(), policytype.toInt(), valuelength.toInt(), (value?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbSetPowerPolicy(interfacehandle: WinusbInterfaceHandle, policytype: WinusbPowerPolicy, valuelength: UInt, value: COpaquePointer?): Bool =
    if (_windowsWin32DevicesUsbNapiAddon != null) (_windowsWin32DevicesUsbNapiAddon.windowssys_windows_win32_devices_usb_winUsbSetPowerPolicy((interfacehandle?.value ?: 0L).toString(), policytype.toInt(), valuelength.toInt(), (value?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbStartTrackingForTimeSync(interfacehandle: WinusbInterfaceHandle, starttrackinginfo: COpaquePointer?): Bool =
    if (_windowsWin32DevicesUsbNapiAddon != null) (_windowsWin32DevicesUsbNapiAddon.windowssys_windows_win32_devices_usb_winUsbStartTrackingForTimeSync((interfacehandle?.value ?: 0L).toString(), (starttrackinginfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbStopTrackingForTimeSync(interfacehandle: WinusbInterfaceHandle, stoptrackinginfo: COpaquePointer?): Bool =
    if (_windowsWin32DevicesUsbNapiAddon != null) (_windowsWin32DevicesUsbNapiAddon.windowssys_windows_win32_devices_usb_winUsbStopTrackingForTimeSync((interfacehandle?.value ?: 0L).toString(), (stoptrackinginfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbUnregisterIsochBuffer(isochbufferhandle: COpaquePointer?): Bool =
    if (_windowsWin32DevicesUsbNapiAddon != null) (_windowsWin32DevicesUsbNapiAddon.windowssys_windows_win32_devices_usb_winUsbUnregisterIsochBuffer((isochbufferhandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbWriteIsochPipe(bufferhandle: COpaquePointer?, offset: UInt, length: UInt, framenumber: COpaquePointer?, overlapped: COpaquePointer?): Bool =
    if (_windowsWin32DevicesUsbNapiAddon != null) (_windowsWin32DevicesUsbNapiAddon.windowssys_windows_win32_devices_usb_winUsbWriteIsochPipe((bufferhandle?.value ?: 0L).toString(), offset.toInt(), length.toInt(), (framenumber?.value ?: 0L).toString(), (overlapped?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbWriteIsochPipeAsap(bufferhandle: COpaquePointer?, offset: UInt, length: UInt, continuestream: Bool, overlapped: COpaquePointer?): Bool =
    if (_windowsWin32DevicesUsbNapiAddon != null) (_windowsWin32DevicesUsbNapiAddon.windowssys_windows_win32_devices_usb_winUsbWriteIsochPipeAsap((bufferhandle?.value ?: 0L).toString(), offset.toInt(), length.toInt(), continuestream, (overlapped?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winUsbWritePipe(interfacehandle: WinusbInterfaceHandle, pipeid: UByte, buffer: COpaquePointer?, bufferlength: UInt, lengthtransferred: COpaquePointer?, overlapped: COpaquePointer?): Bool =
    if (_windowsWin32DevicesUsbNapiAddon != null) (_windowsWin32DevicesUsbNapiAddon.windowssys_windows_win32_devices_usb_winUsbWritePipe((interfacehandle?.value ?: 0L).toString(), pipeid.toInt(), (buffer?.value ?: 0L).toString(), bufferlength.toInt(), (lengthtransferred?.value ?: 0L).toString(), (overlapped?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
