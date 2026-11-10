@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

private val _windowsWin32DevicesBluetoothNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun bluetoothAuthenticateDevice(hwndparent: Hwnd, hradio: Handle, pbtbi: COpaquePointer?, pszpasskey: Pcwstr, ulpasskeylength: UInt): UInt =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_bluetoothAuthenticateDevice((hwndparent?.value ?: 0L).toString(), (hradio?.value ?: 0L).toString(), (pbtbi?.value ?: 0L).toString(), (pszpasskey?.value ?: 0L).toString(), ulpasskeylength.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothAuthenticateDeviceEx(hwndparentin: Hwnd, hradioin: Handle, pbtdiinout: COpaquePointer?, pbtoobdata: COpaquePointer?, authenticationrequirement: AuthenticationRequirements): UInt =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_bluetoothAuthenticateDeviceEx((hwndparentin?.value ?: 0L).toString(), (hradioin?.value ?: 0L).toString(), (pbtdiinout?.value ?: 0L).toString(), (pbtoobdata?.value ?: 0L).toString(), authenticationrequirement) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothAuthenticateMultipleDevices(hwndparent: Hwnd, hradio: Handle, cdevices: UInt, rgbtdi: COpaquePointer?): UInt =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_bluetoothAuthenticateMultipleDevices((hwndparent?.value ?: 0L).toString(), (hradio?.value ?: 0L).toString(), cdevices.toInt(), (rgbtdi?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothDisplayDeviceProperties(hwndparent: Hwnd, pbtdi: COpaquePointer?): Bool =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_bluetoothDisplayDeviceProperties((hwndparent?.value ?: 0L).toString(), (pbtdi?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothEnableDiscovery(hradio: Handle, fenabled: Bool): Bool =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_bluetoothEnableDiscovery((hradio?.value ?: 0L).toString(), fenabled) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothEnableIncomingConnections(hradio: Handle, fenabled: Bool): Bool =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_bluetoothEnableIncomingConnections((hradio?.value ?: 0L).toString(), fenabled) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothEnumerateInstalledServices(hradio: Handle, pbtdi: COpaquePointer?, pcserviceinout: COpaquePointer?, pguidservices: COpaquePointer?): UInt =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_bluetoothEnumerateInstalledServices((hradio?.value ?: 0L).toString(), (pbtdi?.value ?: 0L).toString(), (pcserviceinout?.value ?: 0L).toString(), (pguidservices?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothFindDeviceClose(hfind: HbluetoothDeviceFind): Bool =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_bluetoothFindDeviceClose((hfind?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothFindFirstDevice(pbtsp: COpaquePointer?, pbtdi: COpaquePointer?): HbluetoothDeviceFind =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_bluetoothFindFirstDevice((pbtsp?.value ?: 0L).toString(), (pbtdi?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothFindFirstRadio(pbtfrp: COpaquePointer?, phradio: COpaquePointer?): HbluetoothRadioFind =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_bluetoothFindFirstRadio((pbtfrp?.value ?: 0L).toString(), (phradio?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothFindNextDevice(hfind: HbluetoothDeviceFind, pbtdi: COpaquePointer?): Bool =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_bluetoothFindNextDevice((hfind?.value ?: 0L).toString(), (pbtdi?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothFindNextRadio(hfind: HbluetoothRadioFind, phradio: COpaquePointer?): Bool =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_bluetoothFindNextRadio((hfind?.value ?: 0L).toString(), (phradio?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothFindRadioClose(hfind: HbluetoothRadioFind): Bool =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_bluetoothFindRadioClose((hfind?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothGATTAbortReliableWrite(hdevice: Handle, reliablewritecontext: ULong, flags: UInt): Hresult =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_bluetoothGATTAbortReliableWrite((hdevice?.value ?: 0L).toString(), reliablewritecontext.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothGATTBeginReliableWrite(hdevice: Handle, reliablewritecontext: COpaquePointer?, flags: UInt): Hresult =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_bluetoothGATTBeginReliableWrite((hdevice?.value ?: 0L).toString(), (reliablewritecontext?.value ?: 0L).toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothGATTEndReliableWrite(hdevice: Handle, reliablewritecontext: ULong, flags: UInt): Hresult =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_bluetoothGATTEndReliableWrite((hdevice?.value ?: 0L).toString(), reliablewritecontext.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothGATTGetCharacteristicValue(hdevice: Handle, characteristic: COpaquePointer?, characteristicvaluedatasize: UInt, characteristicvalue: COpaquePointer?, characteristicvaluesizerequired: COpaquePointer?, flags: UInt): Hresult =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_bluetoothGATTGetCharacteristicValue((hdevice?.value ?: 0L).toString(), (characteristic?.value ?: 0L).toString(), characteristicvaluedatasize.toInt(), (characteristicvalue?.value ?: 0L).toString(), (characteristicvaluesizerequired?.value ?: 0L).toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothGATTGetCharacteristics(hdevice: Handle, service: COpaquePointer?, characteristicsbuffercount: UShort, characteristicsbuffer: COpaquePointer?, characteristicsbufferactual: COpaquePointer?, flags: UInt): Hresult =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_bluetoothGATTGetCharacteristics((hdevice?.value ?: 0L).toString(), (service?.value ?: 0L).toString(), characteristicsbuffercount.toInt(), (characteristicsbuffer?.value ?: 0L).toString(), (characteristicsbufferactual?.value ?: 0L).toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothGATTGetDescriptorValue(hdevice: Handle, descriptor: COpaquePointer?, descriptorvaluedatasize: UInt, descriptorvalue: COpaquePointer?, descriptorvaluesizerequired: COpaquePointer?, flags: UInt): Hresult =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_bluetoothGATTGetDescriptorValue((hdevice?.value ?: 0L).toString(), (descriptor?.value ?: 0L).toString(), descriptorvaluedatasize.toInt(), (descriptorvalue?.value ?: 0L).toString(), (descriptorvaluesizerequired?.value ?: 0L).toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothGATTGetDescriptors(hdevice: Handle, characteristic: COpaquePointer?, descriptorsbuffercount: UShort, descriptorsbuffer: COpaquePointer?, descriptorsbufferactual: COpaquePointer?, flags: UInt): Hresult =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_bluetoothGATTGetDescriptors((hdevice?.value ?: 0L).toString(), (characteristic?.value ?: 0L).toString(), descriptorsbuffercount.toInt(), (descriptorsbuffer?.value ?: 0L).toString(), (descriptorsbufferactual?.value ?: 0L).toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothGATTGetIncludedServices(hdevice: Handle, parentservice: COpaquePointer?, includedservicesbuffercount: UShort, includedservicesbuffer: COpaquePointer?, includedservicesbufferactual: COpaquePointer?, flags: UInt): Hresult =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_bluetoothGATTGetIncludedServices((hdevice?.value ?: 0L).toString(), (parentservice?.value ?: 0L).toString(), includedservicesbuffercount.toInt(), (includedservicesbuffer?.value ?: 0L).toString(), (includedservicesbufferactual?.value ?: 0L).toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothGATTGetServices(hdevice: Handle, servicesbuffercount: UShort, servicesbuffer: COpaquePointer?, servicesbufferactual: COpaquePointer?, flags: UInt): Hresult =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_bluetoothGATTGetServices((hdevice?.value ?: 0L).toString(), servicesbuffercount.toInt(), (servicesbuffer?.value ?: 0L).toString(), (servicesbufferactual?.value ?: 0L).toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothGATTRegisterEvent(hservice: Handle, eventtype: BthLeGattEventType, eventparameterin: COpaquePointer?, callback: PfnbluetoothGattEventCallback, callbackcontext: COpaquePointer?, peventhandle: COpaquePointer?, flags: UInt): Hresult =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_bluetoothGATTRegisterEvent((hservice?.value ?: 0L).toString(), eventtype, (eventparameterin?.value ?: 0L).toString(), 0L.toString(), (callbackcontext?.value ?: 0L).toString(), (peventhandle?.value ?: 0L).toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothGATTSetCharacteristicValue(hdevice: Handle, characteristic: COpaquePointer?, characteristicvalue: COpaquePointer?, reliablewritecontext: ULong, flags: UInt): Hresult =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_bluetoothGATTSetCharacteristicValue((hdevice?.value ?: 0L).toString(), (characteristic?.value ?: 0L).toString(), (characteristicvalue?.value ?: 0L).toString(), reliablewritecontext.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothGATTSetDescriptorValue(hdevice: Handle, descriptor: COpaquePointer?, descriptorvalue: COpaquePointer?, flags: UInt): Hresult =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_bluetoothGATTSetDescriptorValue((hdevice?.value ?: 0L).toString(), (descriptor?.value ?: 0L).toString(), (descriptorvalue?.value ?: 0L).toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothGATTUnregisterEvent(eventhandle: Long, flags: UInt): Hresult =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_bluetoothGATTUnregisterEvent(eventhandle.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothGetDeviceInfo(hradio: Handle, pbtdi: COpaquePointer?): UInt =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_bluetoothGetDeviceInfo((hradio?.value ?: 0L).toString(), (pbtdi?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothGetRadioInfo(hradio: Handle, pradioinfo: COpaquePointer?): UInt =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_bluetoothGetRadioInfo((hradio?.value ?: 0L).toString(), (pradioinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothIsConnectable(hradio: Handle): Bool =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_bluetoothIsConnectable((hradio?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothIsDiscoverable(hradio: Handle): Bool =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_bluetoothIsDiscoverable((hradio?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothIsVersionAvailable(majorversion: UByte, minorversion: UByte): Bool =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_bluetoothIsVersionAvailable(majorversion.toInt(), minorversion.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothRegisterForAuthentication(pbtdi: COpaquePointer?, phreghandle: COpaquePointer?, pfncallback: PfnAuthenticationCallback, pvparam: COpaquePointer?): UInt =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_bluetoothRegisterForAuthentication((pbtdi?.value ?: 0L).toString(), (phreghandle?.value ?: 0L).toString(), 0L.toString(), (pvparam?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothRegisterForAuthenticationEx(pbtdiin: COpaquePointer?, phreghandleout: COpaquePointer?, pfncallbackin: PfnAuthenticationCallbackEx, pvparam: COpaquePointer?): UInt =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_bluetoothRegisterForAuthenticationEx((pbtdiin?.value ?: 0L).toString(), (phreghandleout?.value ?: 0L).toString(), 0L.toString(), (pvparam?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothRemoveDevice(paddress: COpaquePointer?): UInt =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_bluetoothRemoveDevice((paddress?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothSdpEnumAttributes(psdpstream: COpaquePointer?, cbstreamsize: UInt, pfncallback: PfnBluetoothEnumAttributesCallback, pvparam: COpaquePointer?): Bool =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_bluetoothSdpEnumAttributes((psdpstream?.value ?: 0L).toString(), cbstreamsize.toInt(), 0L.toString(), (pvparam?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothSdpGetAttributeValue(precordstream: COpaquePointer?, cbrecordlength: UInt, usattributeid: UShort, pattributedata: COpaquePointer?): UInt =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_bluetoothSdpGetAttributeValue((precordstream?.value ?: 0L).toString(), cbrecordlength.toInt(), usattributeid.toInt(), (pattributedata?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothSdpGetContainerElementData(pcontainerstream: COpaquePointer?, cbcontainerlength: UInt, pelement: COpaquePointer?, pdata: COpaquePointer?): UInt =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_bluetoothSdpGetContainerElementData((pcontainerstream?.value ?: 0L).toString(), cbcontainerlength.toInt(), (pelement?.value ?: 0L).toString(), (pdata?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothSdpGetElementData(psdpstream: COpaquePointer?, cbsdpstreamlength: UInt, pdata: COpaquePointer?): UInt =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_bluetoothSdpGetElementData((psdpstream?.value ?: 0L).toString(), cbsdpstreamlength.toInt(), (pdata?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothSdpGetString(precordstream: COpaquePointer?, cbrecordlength: UInt, pstringdata: COpaquePointer?, usstringoffset: UShort, pszstring: Pwstr, pcchstringlength: COpaquePointer?): UInt =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_bluetoothSdpGetString((precordstream?.value ?: 0L).toString(), cbrecordlength.toInt(), (pstringdata?.value ?: 0L).toString(), usstringoffset.toInt(), (pszstring?.value ?: 0L).toString(), (pcchstringlength?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothSelectDevices(pbtsdp: COpaquePointer?): Bool =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_bluetoothSelectDevices((pbtsdp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothSelectDevicesFree(pbtsdp: COpaquePointer?): Bool =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_bluetoothSelectDevicesFree((pbtsdp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothSendAuthenticationResponse(hradio: Handle, pbtdi: COpaquePointer?, pszpasskey: Pcwstr): UInt =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_bluetoothSendAuthenticationResponse((hradio?.value ?: 0L).toString(), (pbtdi?.value ?: 0L).toString(), (pszpasskey?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothSendAuthenticationResponseEx(hradioin: Handle, pauthresponse: COpaquePointer?): UInt =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_bluetoothSendAuthenticationResponseEx((hradioin?.value ?: 0L).toString(), (pauthresponse?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothSetLocalServiceInfo(hradioin: Handle, pclassguid: COpaquePointer?, ulinstance: UInt, pserviceinfoin: COpaquePointer?): UInt =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_bluetoothSetLocalServiceInfo((hradioin?.value ?: 0L).toString(), (pclassguid?.value ?: 0L).toString(), ulinstance.toInt(), (pserviceinfoin?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothSetServiceState(hradio: Handle, pbtdi: COpaquePointer?, pguidservice: COpaquePointer?, dwserviceflags: UInt): UInt =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_bluetoothSetServiceState((hradio?.value ?: 0L).toString(), (pbtdi?.value ?: 0L).toString(), (pguidservice?.value ?: 0L).toString(), dwserviceflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothUnregisterAuthentication(hreghandle: Long): Bool =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_bluetoothUnregisterAuthentication(hreghandle.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothUpdateDeviceRecord(pbtdi: COpaquePointer?): UInt =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_bluetoothUpdateDeviceRecord((pbtdi?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
