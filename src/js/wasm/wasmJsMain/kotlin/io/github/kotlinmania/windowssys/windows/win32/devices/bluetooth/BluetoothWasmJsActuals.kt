@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32DevicesBluetoothNapiAddon(): Boolean

private val windowsWin32DevicesBluetoothNapiAvailable: Boolean = initWindowsWin32DevicesBluetoothNapiAddon()

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBluetoothBluetoothAuthenticateDevice(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesBluetoothBluetoothAuthenticateDevice(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBluetoothBluetoothAuthenticateDeviceEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesBluetoothBluetoothAuthenticateDeviceEx(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBluetoothBluetoothAuthenticateMultipleDevices(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesBluetoothBluetoothAuthenticateMultipleDevices(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBluetoothBluetoothDisplayDeviceProperties(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesBluetoothBluetoothDisplayDeviceProperties(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBluetoothBluetoothEnableDiscovery(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesBluetoothBluetoothEnableDiscovery(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBluetoothBluetoothEnableIncomingConnections(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesBluetoothBluetoothEnableIncomingConnections(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBluetoothBluetoothEnumerateInstalledServices(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesBluetoothBluetoothEnumerateInstalledServices(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBluetoothBluetoothFindDeviceClose(p0)")
private external fun wasmWindowssysWindowsWin32DevicesBluetoothBluetoothFindDeviceClose(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBluetoothBluetoothFindFirstDevice(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesBluetoothBluetoothFindFirstDevice(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBluetoothBluetoothFindFirstRadio(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesBluetoothBluetoothFindFirstRadio(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBluetoothBluetoothFindNextDevice(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesBluetoothBluetoothFindNextDevice(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBluetoothBluetoothFindNextRadio(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesBluetoothBluetoothFindNextRadio(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBluetoothBluetoothFindRadioClose(p0)")
private external fun wasmWindowssysWindowsWin32DevicesBluetoothBluetoothFindRadioClose(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBluetoothBluetoothGATTAbortReliableWrite(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesBluetoothBluetoothGATTAbortReliableWrite(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBluetoothBluetoothGATTBeginReliableWrite(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesBluetoothBluetoothGATTBeginReliableWrite(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBluetoothBluetoothGATTEndReliableWrite(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesBluetoothBluetoothGATTEndReliableWrite(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBluetoothBluetoothGATTGetCharacteristicValue(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesBluetoothBluetoothGATTGetCharacteristicValue(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBluetoothBluetoothGATTGetCharacteristics(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesBluetoothBluetoothGATTGetCharacteristics(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBluetoothBluetoothGATTGetDescriptorValue(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesBluetoothBluetoothGATTGetDescriptorValue(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBluetoothBluetoothGATTGetDescriptors(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesBluetoothBluetoothGATTGetDescriptors(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBluetoothBluetoothGATTGetIncludedServices(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesBluetoothBluetoothGATTGetIncludedServices(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBluetoothBluetoothGATTGetServices(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesBluetoothBluetoothGATTGetServices(p0: String, p1: Int, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBluetoothBluetoothGATTRegisterEvent(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesBluetoothBluetoothGATTRegisterEvent(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBluetoothBluetoothGATTSetCharacteristicValue(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesBluetoothBluetoothGATTSetCharacteristicValue(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBluetoothBluetoothGATTSetDescriptorValue(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesBluetoothBluetoothGATTSetDescriptorValue(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBluetoothBluetoothGATTUnregisterEvent(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesBluetoothBluetoothGATTUnregisterEvent(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBluetoothBluetoothGetDeviceInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesBluetoothBluetoothGetDeviceInfo(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBluetoothBluetoothGetRadioInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesBluetoothBluetoothGetRadioInfo(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBluetoothBluetoothIsConnectable(p0)")
private external fun wasmWindowssysWindowsWin32DevicesBluetoothBluetoothIsConnectable(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBluetoothBluetoothIsDiscoverable(p0)")
private external fun wasmWindowssysWindowsWin32DevicesBluetoothBluetoothIsDiscoverable(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBluetoothBluetoothIsVersionAvailable(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesBluetoothBluetoothIsVersionAvailable(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBluetoothBluetoothRegisterForAuthentication(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesBluetoothBluetoothRegisterForAuthentication(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBluetoothBluetoothRegisterForAuthenticationEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesBluetoothBluetoothRegisterForAuthenticationEx(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBluetoothBluetoothRemoveDevice(p0)")
private external fun wasmWindowssysWindowsWin32DevicesBluetoothBluetoothRemoveDevice(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBluetoothBluetoothSdpEnumAttributes(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesBluetoothBluetoothSdpEnumAttributes(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBluetoothBluetoothSdpGetAttributeValue(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesBluetoothBluetoothSdpGetAttributeValue(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBluetoothBluetoothSdpGetContainerElementData(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesBluetoothBluetoothSdpGetContainerElementData(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBluetoothBluetoothSdpGetElementData(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesBluetoothBluetoothSdpGetElementData(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBluetoothBluetoothSdpGetString(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DevicesBluetoothBluetoothSdpGetString(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBluetoothBluetoothSelectDevices(p0)")
private external fun wasmWindowssysWindowsWin32DevicesBluetoothBluetoothSelectDevices(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBluetoothBluetoothSelectDevicesFree(p0)")
private external fun wasmWindowssysWindowsWin32DevicesBluetoothBluetoothSelectDevicesFree(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBluetoothBluetoothSendAuthenticationResponse(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesBluetoothBluetoothSendAuthenticationResponse(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBluetoothBluetoothSendAuthenticationResponseEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesBluetoothBluetoothSendAuthenticationResponseEx(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBluetoothBluetoothSetLocalServiceInfo(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesBluetoothBluetoothSetLocalServiceInfo(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBluetoothBluetoothSetServiceState(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesBluetoothBluetoothSetServiceState(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBluetoothBluetoothUnregisterAuthentication(p0)")
private external fun wasmWindowssysWindowsWin32DevicesBluetoothBluetoothUnregisterAuthentication(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesBluetoothBluetoothUpdateDeviceRecord(p0)")
private external fun wasmWindowssysWindowsWin32DevicesBluetoothBluetoothUpdateDeviceRecord(p0: String): Int

public actual fun bluetoothAuthenticateDevice(hwndparent: Hwnd, hradio: Handle, pbtbi: MutPtr, pszpasskey: Pcwstr, ulpasskeylength: UInt): UInt =
    if (windowsWin32DevicesBluetoothNapiAvailable) wasmWindowssysWindowsWin32DevicesBluetoothBluetoothAuthenticateDevice(hwndparent.rawAddress.toString(), hradio.rawAddress.toString(), pbtbi.rawAddress.toString(), pszpasskey.rawAddress.toString(), ulpasskeylength.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothAuthenticateDeviceEx(hwndparentin: Hwnd, hradioin: Handle, pbtdiinout: MutPtr, pbtoobdata: ConstPtr, authenticationrequirement: AuthenticationRequirements): UInt =
    if (windowsWin32DevicesBluetoothNapiAvailable) wasmWindowssysWindowsWin32DevicesBluetoothBluetoothAuthenticateDeviceEx(hwndparentin.rawAddress.toString(), hradioin.rawAddress.toString(), pbtdiinout.rawAddress.toString(), pbtoobdata.rawAddress.toString(), authenticationrequirement).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothAuthenticateMultipleDevices(hwndparent: Hwnd, hradio: Handle, cdevices: UInt, rgbtdi: MutPtr): UInt =
    if (windowsWin32DevicesBluetoothNapiAvailable) wasmWindowssysWindowsWin32DevicesBluetoothBluetoothAuthenticateMultipleDevices(hwndparent.rawAddress.toString(), hradio.rawAddress.toString(), cdevices.toInt(), rgbtdi.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothDisplayDeviceProperties(hwndparent: Hwnd, pbtdi: MutPtr): Bool =
    if (windowsWin32DevicesBluetoothNapiAvailable) wasmWindowssysWindowsWin32DevicesBluetoothBluetoothDisplayDeviceProperties(hwndparent.rawAddress.toString(), pbtdi.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothEnableDiscovery(hradio: Handle, fenabled: Bool): Bool =
    if (windowsWin32DevicesBluetoothNapiAvailable) wasmWindowssysWindowsWin32DevicesBluetoothBluetoothEnableDiscovery(hradio.rawAddress.toString(), fenabled) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothEnableIncomingConnections(hradio: Handle, fenabled: Bool): Bool =
    if (windowsWin32DevicesBluetoothNapiAvailable) wasmWindowssysWindowsWin32DevicesBluetoothBluetoothEnableIncomingConnections(hradio.rawAddress.toString(), fenabled) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothEnumerateInstalledServices(hradio: Handle, pbtdi: ConstPtr, pcserviceinout: MutPtr, pguidservices: MutPtr): UInt =
    if (windowsWin32DevicesBluetoothNapiAvailable) wasmWindowssysWindowsWin32DevicesBluetoothBluetoothEnumerateInstalledServices(hradio.rawAddress.toString(), pbtdi.rawAddress.toString(), pcserviceinout.rawAddress.toString(), pguidservices.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothFindDeviceClose(hfind: HbluetoothDeviceFind): Bool =
    if (windowsWin32DevicesBluetoothNapiAvailable) wasmWindowssysWindowsWin32DevicesBluetoothBluetoothFindDeviceClose(hfind.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothFindFirstDevice(pbtsp: ConstPtr, pbtdi: MutPtr): HbluetoothDeviceFind =
    if (windowsWin32DevicesBluetoothNapiAvailable) MutPtr(wasmWindowssysWindowsWin32DevicesBluetoothBluetoothFindFirstDevice(pbtsp.rawAddress.toString(), pbtdi.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothFindFirstRadio(pbtfrp: ConstPtr, phradio: MutPtr): HbluetoothRadioFind =
    if (windowsWin32DevicesBluetoothNapiAvailable) MutPtr(wasmWindowssysWindowsWin32DevicesBluetoothBluetoothFindFirstRadio(pbtfrp.rawAddress.toString(), phradio.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothFindNextDevice(hfind: HbluetoothDeviceFind, pbtdi: MutPtr): Bool =
    if (windowsWin32DevicesBluetoothNapiAvailable) wasmWindowssysWindowsWin32DevicesBluetoothBluetoothFindNextDevice(hfind.rawAddress.toString(), pbtdi.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothFindNextRadio(hfind: HbluetoothRadioFind, phradio: MutPtr): Bool =
    if (windowsWin32DevicesBluetoothNapiAvailable) wasmWindowssysWindowsWin32DevicesBluetoothBluetoothFindNextRadio(hfind.rawAddress.toString(), phradio.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothFindRadioClose(hfind: HbluetoothRadioFind): Bool =
    if (windowsWin32DevicesBluetoothNapiAvailable) wasmWindowssysWindowsWin32DevicesBluetoothBluetoothFindRadioClose(hfind.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothGATTAbortReliableWrite(hdevice: Handle, reliablewritecontext: ULong, flags: UInt): Hresult =
    if (windowsWin32DevicesBluetoothNapiAvailable) wasmWindowssysWindowsWin32DevicesBluetoothBluetoothGATTAbortReliableWrite(hdevice.rawAddress.toString(), reliablewritecontext.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothGATTBeginReliableWrite(hdevice: Handle, reliablewritecontext: MutPtr, flags: UInt): Hresult =
    if (windowsWin32DevicesBluetoothNapiAvailable) wasmWindowssysWindowsWin32DevicesBluetoothBluetoothGATTBeginReliableWrite(hdevice.rawAddress.toString(), reliablewritecontext.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothGATTEndReliableWrite(hdevice: Handle, reliablewritecontext: ULong, flags: UInt): Hresult =
    if (windowsWin32DevicesBluetoothNapiAvailable) wasmWindowssysWindowsWin32DevicesBluetoothBluetoothGATTEndReliableWrite(hdevice.rawAddress.toString(), reliablewritecontext.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothGATTGetCharacteristicValue(hdevice: Handle, characteristic: ConstPtr, characteristicvaluedatasize: UInt, characteristicvalue: MutPtr, characteristicvaluesizerequired: MutPtr, flags: UInt): Hresult =
    if (windowsWin32DevicesBluetoothNapiAvailable) wasmWindowssysWindowsWin32DevicesBluetoothBluetoothGATTGetCharacteristicValue(hdevice.rawAddress.toString(), characteristic.rawAddress.toString(), characteristicvaluedatasize.toInt(), characteristicvalue.rawAddress.toString(), characteristicvaluesizerequired.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothGATTGetCharacteristics(hdevice: Handle, service: ConstPtr, characteristicsbuffercount: UShort, characteristicsbuffer: MutPtr, characteristicsbufferactual: MutPtr, flags: UInt): Hresult =
    if (windowsWin32DevicesBluetoothNapiAvailable) wasmWindowssysWindowsWin32DevicesBluetoothBluetoothGATTGetCharacteristics(hdevice.rawAddress.toString(), service.rawAddress.toString(), characteristicsbuffercount.toInt(), characteristicsbuffer.rawAddress.toString(), characteristicsbufferactual.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothGATTGetDescriptorValue(hdevice: Handle, descriptor: ConstPtr, descriptorvaluedatasize: UInt, descriptorvalue: MutPtr, descriptorvaluesizerequired: MutPtr, flags: UInt): Hresult =
    if (windowsWin32DevicesBluetoothNapiAvailable) wasmWindowssysWindowsWin32DevicesBluetoothBluetoothGATTGetDescriptorValue(hdevice.rawAddress.toString(), descriptor.rawAddress.toString(), descriptorvaluedatasize.toInt(), descriptorvalue.rawAddress.toString(), descriptorvaluesizerequired.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothGATTGetDescriptors(hdevice: Handle, characteristic: ConstPtr, descriptorsbuffercount: UShort, descriptorsbuffer: MutPtr, descriptorsbufferactual: MutPtr, flags: UInt): Hresult =
    if (windowsWin32DevicesBluetoothNapiAvailable) wasmWindowssysWindowsWin32DevicesBluetoothBluetoothGATTGetDescriptors(hdevice.rawAddress.toString(), characteristic.rawAddress.toString(), descriptorsbuffercount.toInt(), descriptorsbuffer.rawAddress.toString(), descriptorsbufferactual.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothGATTGetIncludedServices(hdevice: Handle, parentservice: ConstPtr, includedservicesbuffercount: UShort, includedservicesbuffer: MutPtr, includedservicesbufferactual: MutPtr, flags: UInt): Hresult =
    if (windowsWin32DevicesBluetoothNapiAvailable) wasmWindowssysWindowsWin32DevicesBluetoothBluetoothGATTGetIncludedServices(hdevice.rawAddress.toString(), parentservice.rawAddress.toString(), includedservicesbuffercount.toInt(), includedservicesbuffer.rawAddress.toString(), includedservicesbufferactual.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothGATTGetServices(hdevice: Handle, servicesbuffercount: UShort, servicesbuffer: MutPtr, servicesbufferactual: MutPtr, flags: UInt): Hresult =
    if (windowsWin32DevicesBluetoothNapiAvailable) wasmWindowssysWindowsWin32DevicesBluetoothBluetoothGATTGetServices(hdevice.rawAddress.toString(), servicesbuffercount.toInt(), servicesbuffer.rawAddress.toString(), servicesbufferactual.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothGATTRegisterEvent(hservice: Handle, eventtype: BthLeGattEventType, eventparameterin: ConstPtr, callback: PfnbluetoothGattEventCallback, callbackcontext: ConstPtr, peventhandle: MutPtr, flags: UInt): Hresult =
    if (windowsWin32DevicesBluetoothNapiAvailable) wasmWindowssysWindowsWin32DevicesBluetoothBluetoothGATTRegisterEvent(hservice.rawAddress.toString(), eventtype, eventparameterin.rawAddress.toString(), 0L.toString(), callbackcontext.rawAddress.toString(), peventhandle.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothGATTSetCharacteristicValue(hdevice: Handle, characteristic: ConstPtr, characteristicvalue: ConstPtr, reliablewritecontext: ULong, flags: UInt): Hresult =
    if (windowsWin32DevicesBluetoothNapiAvailable) wasmWindowssysWindowsWin32DevicesBluetoothBluetoothGATTSetCharacteristicValue(hdevice.rawAddress.toString(), characteristic.rawAddress.toString(), characteristicvalue.rawAddress.toString(), reliablewritecontext.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothGATTSetDescriptorValue(hdevice: Handle, descriptor: ConstPtr, descriptorvalue: ConstPtr, flags: UInt): Hresult =
    if (windowsWin32DevicesBluetoothNapiAvailable) wasmWindowssysWindowsWin32DevicesBluetoothBluetoothGATTSetDescriptorValue(hdevice.rawAddress.toString(), descriptor.rawAddress.toString(), descriptorvalue.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothGATTUnregisterEvent(eventhandle: Long, flags: UInt): Hresult =
    if (windowsWin32DevicesBluetoothNapiAvailable) wasmWindowssysWindowsWin32DevicesBluetoothBluetoothGATTUnregisterEvent(eventhandle.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothGetDeviceInfo(hradio: Handle, pbtdi: MutPtr): UInt =
    if (windowsWin32DevicesBluetoothNapiAvailable) wasmWindowssysWindowsWin32DevicesBluetoothBluetoothGetDeviceInfo(hradio.rawAddress.toString(), pbtdi.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothGetRadioInfo(hradio: Handle, pradioinfo: MutPtr): UInt =
    if (windowsWin32DevicesBluetoothNapiAvailable) wasmWindowssysWindowsWin32DevicesBluetoothBluetoothGetRadioInfo(hradio.rawAddress.toString(), pradioinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothIsConnectable(hradio: Handle): Bool =
    if (windowsWin32DevicesBluetoothNapiAvailable) wasmWindowssysWindowsWin32DevicesBluetoothBluetoothIsConnectable(hradio.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothIsDiscoverable(hradio: Handle): Bool =
    if (windowsWin32DevicesBluetoothNapiAvailable) wasmWindowssysWindowsWin32DevicesBluetoothBluetoothIsDiscoverable(hradio.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothIsVersionAvailable(majorversion: UByte, minorversion: UByte): Bool =
    if (windowsWin32DevicesBluetoothNapiAvailable) wasmWindowssysWindowsWin32DevicesBluetoothBluetoothIsVersionAvailable(majorversion.toInt(), minorversion.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothRegisterForAuthentication(pbtdi: ConstPtr, phreghandle: MutPtr, pfncallback: PfnAuthenticationCallback, pvparam: ConstPtr): UInt =
    if (windowsWin32DevicesBluetoothNapiAvailable) wasmWindowssysWindowsWin32DevicesBluetoothBluetoothRegisterForAuthentication(pbtdi.rawAddress.toString(), phreghandle.rawAddress.toString(), 0L.toString(), pvparam.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothRegisterForAuthenticationEx(pbtdiin: ConstPtr, phreghandleout: MutPtr, pfncallbackin: PfnAuthenticationCallbackEx, pvparam: ConstPtr): UInt =
    if (windowsWin32DevicesBluetoothNapiAvailable) wasmWindowssysWindowsWin32DevicesBluetoothBluetoothRegisterForAuthenticationEx(pbtdiin.rawAddress.toString(), phreghandleout.rawAddress.toString(), 0L.toString(), pvparam.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothRemoveDevice(paddress: ConstPtr): UInt =
    if (windowsWin32DevicesBluetoothNapiAvailable) wasmWindowssysWindowsWin32DevicesBluetoothBluetoothRemoveDevice(paddress.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothSdpEnumAttributes(psdpstream: ConstPtr, cbstreamsize: UInt, pfncallback: PfnBluetoothEnumAttributesCallback, pvparam: ConstPtr): Bool =
    if (windowsWin32DevicesBluetoothNapiAvailable) wasmWindowssysWindowsWin32DevicesBluetoothBluetoothSdpEnumAttributes(psdpstream.rawAddress.toString(), cbstreamsize.toInt(), 0L.toString(), pvparam.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothSdpGetAttributeValue(precordstream: ConstPtr, cbrecordlength: UInt, usattributeid: UShort, pattributedata: MutPtr): UInt =
    if (windowsWin32DevicesBluetoothNapiAvailable) wasmWindowssysWindowsWin32DevicesBluetoothBluetoothSdpGetAttributeValue(precordstream.rawAddress.toString(), cbrecordlength.toInt(), usattributeid.toInt(), pattributedata.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothSdpGetContainerElementData(pcontainerstream: ConstPtr, cbcontainerlength: UInt, pelement: MutPtr, pdata: MutPtr): UInt =
    if (windowsWin32DevicesBluetoothNapiAvailable) wasmWindowssysWindowsWin32DevicesBluetoothBluetoothSdpGetContainerElementData(pcontainerstream.rawAddress.toString(), cbcontainerlength.toInt(), pelement.rawAddress.toString(), pdata.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothSdpGetElementData(psdpstream: ConstPtr, cbsdpstreamlength: UInt, pdata: MutPtr): UInt =
    if (windowsWin32DevicesBluetoothNapiAvailable) wasmWindowssysWindowsWin32DevicesBluetoothBluetoothSdpGetElementData(psdpstream.rawAddress.toString(), cbsdpstreamlength.toInt(), pdata.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothSdpGetString(precordstream: ConstPtr, cbrecordlength: UInt, pstringdata: ConstPtr, usstringoffset: UShort, pszstring: Pwstr, pcchstringlength: MutPtr): UInt =
    if (windowsWin32DevicesBluetoothNapiAvailable) wasmWindowssysWindowsWin32DevicesBluetoothBluetoothSdpGetString(precordstream.rawAddress.toString(), cbrecordlength.toInt(), pstringdata.rawAddress.toString(), usstringoffset.toInt(), pszstring.rawAddress.toString(), pcchstringlength.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothSelectDevices(pbtsdp: MutPtr): Bool =
    if (windowsWin32DevicesBluetoothNapiAvailable) wasmWindowssysWindowsWin32DevicesBluetoothBluetoothSelectDevices(pbtsdp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothSelectDevicesFree(pbtsdp: MutPtr): Bool =
    if (windowsWin32DevicesBluetoothNapiAvailable) wasmWindowssysWindowsWin32DevicesBluetoothBluetoothSelectDevicesFree(pbtsdp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothSendAuthenticationResponse(hradio: Handle, pbtdi: ConstPtr, pszpasskey: Pcwstr): UInt =
    if (windowsWin32DevicesBluetoothNapiAvailable) wasmWindowssysWindowsWin32DevicesBluetoothBluetoothSendAuthenticationResponse(hradio.rawAddress.toString(), pbtdi.rawAddress.toString(), pszpasskey.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothSendAuthenticationResponseEx(hradioin: Handle, pauthresponse: ConstPtr): UInt =
    if (windowsWin32DevicesBluetoothNapiAvailable) wasmWindowssysWindowsWin32DevicesBluetoothBluetoothSendAuthenticationResponseEx(hradioin.rawAddress.toString(), pauthresponse.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothSetLocalServiceInfo(hradioin: Handle, pclassguid: ConstPtr, ulinstance: UInt, pserviceinfoin: ConstPtr): UInt =
    if (windowsWin32DevicesBluetoothNapiAvailable) wasmWindowssysWindowsWin32DevicesBluetoothBluetoothSetLocalServiceInfo(hradioin.rawAddress.toString(), pclassguid.rawAddress.toString(), ulinstance.toInt(), pserviceinfoin.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothSetServiceState(hradio: Handle, pbtdi: ConstPtr, pguidservice: ConstPtr, dwserviceflags: UInt): UInt =
    if (windowsWin32DevicesBluetoothNapiAvailable) wasmWindowssysWindowsWin32DevicesBluetoothBluetoothSetServiceState(hradio.rawAddress.toString(), pbtdi.rawAddress.toString(), pguidservice.rawAddress.toString(), dwserviceflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothUnregisterAuthentication(hreghandle: Long): Bool =
    if (windowsWin32DevicesBluetoothNapiAvailable) wasmWindowssysWindowsWin32DevicesBluetoothBluetoothUnregisterAuthentication(hreghandle.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothUpdateDeviceRecord(pbtdi: ConstPtr): UInt =
    if (windowsWin32DevicesBluetoothNapiAvailable) wasmWindowssysWindowsWin32DevicesBluetoothBluetoothUpdateDeviceRecord(pbtdi.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
