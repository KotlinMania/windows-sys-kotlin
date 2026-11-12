@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

private val windowsWin32DevicesBluetoothNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun bluetoothAuthenticateDevice(hwndparent: Hwnd, hradio: Handle, pbtbi: MutPtr<BluetoothDeviceInfo>, pszpasskey: Pcwstr, ulpasskeylength: UInt): UInt =
    if (windowsWin32DevicesBluetoothNapiAddon != null) (windowsWin32DevicesBluetoothNapiAddon.windowssysWindowsWin32DevicesBluetoothBluetoothAuthenticateDevice(hwndparent.rawAddress.toString(), hradio.rawAddress.toString(), pbtbi.rawAddress.toString(), pszpasskey.rawAddress.toString(), ulpasskeylength.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothAuthenticateDeviceEx(hwndparentin: Hwnd, hradioin: Handle, pbtdiinout: MutPtr<BluetoothDeviceInfo>, pbtoobdata: ConstPtr<BluetoothOobDataInfo>, authenticationrequirement: AuthenticationRequirements): UInt =
    if (windowsWin32DevicesBluetoothNapiAddon != null) (windowsWin32DevicesBluetoothNapiAddon.windowssysWindowsWin32DevicesBluetoothBluetoothAuthenticateDeviceEx(hwndparentin.rawAddress.toString(), hradioin.rawAddress.toString(), pbtdiinout.rawAddress.toString(), pbtoobdata.rawAddress.toString(), authenticationrequirement) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothAuthenticateMultipleDevices(hwndparent: Hwnd, hradio: Handle, cdevices: UInt, rgbtdi: MutPtr<BluetoothDeviceInfo>): UInt =
    if (windowsWin32DevicesBluetoothNapiAddon != null) (windowsWin32DevicesBluetoothNapiAddon.windowssysWindowsWin32DevicesBluetoothBluetoothAuthenticateMultipleDevices(hwndparent.rawAddress.toString(), hradio.rawAddress.toString(), cdevices.toInt(), rgbtdi.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothDisplayDeviceProperties(hwndparent: Hwnd, pbtdi: MutPtr<BluetoothDeviceInfo>): Bool =
    if (windowsWin32DevicesBluetoothNapiAddon != null) (windowsWin32DevicesBluetoothNapiAddon.windowssysWindowsWin32DevicesBluetoothBluetoothDisplayDeviceProperties(hwndparent.rawAddress.toString(), pbtdi.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothEnableDiscovery(hradio: Handle, fenabled: Bool): Bool =
    if (windowsWin32DevicesBluetoothNapiAddon != null) (windowsWin32DevicesBluetoothNapiAddon.windowssysWindowsWin32DevicesBluetoothBluetoothEnableDiscovery(hradio.rawAddress.toString(), fenabled) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothEnableIncomingConnections(hradio: Handle, fenabled: Bool): Bool =
    if (windowsWin32DevicesBluetoothNapiAddon != null) (windowsWin32DevicesBluetoothNapiAddon.windowssysWindowsWin32DevicesBluetoothBluetoothEnableIncomingConnections(hradio.rawAddress.toString(), fenabled) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothEnumerateInstalledServices(hradio: Handle, pbtdi: ConstPtr<BluetoothDeviceInfo>, pcserviceinout: MutPtr<UInt>, pguidservices: MutPtr<Guid>): UInt =
    if (windowsWin32DevicesBluetoothNapiAddon != null) (windowsWin32DevicesBluetoothNapiAddon.windowssysWindowsWin32DevicesBluetoothBluetoothEnumerateInstalledServices(hradio.rawAddress.toString(), pbtdi.rawAddress.toString(), pcserviceinout.rawAddress.toString(), pguidservices.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothFindDeviceClose(hfind: HbluetoothDeviceFind): Bool =
    if (windowsWin32DevicesBluetoothNapiAddon != null) (windowsWin32DevicesBluetoothNapiAddon.windowssysWindowsWin32DevicesBluetoothBluetoothFindDeviceClose(hfind.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothFindFirstDevice(pbtsp: ConstPtr<BluetoothDeviceSearchParams>, pbtdi: MutPtr<BluetoothDeviceInfo>): HbluetoothDeviceFind =
    if (windowsWin32DevicesBluetoothNapiAddon != null) MutPtr((windowsWin32DevicesBluetoothNapiAddon.windowssysWindowsWin32DevicesBluetoothBluetoothFindFirstDevice(pbtsp.rawAddress.toString(), pbtdi.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothFindFirstRadio(pbtfrp: ConstPtr<BluetoothFindRadioParams>, phradio: MutPtr<Handle>): HbluetoothRadioFind =
    if (windowsWin32DevicesBluetoothNapiAddon != null) MutPtr((windowsWin32DevicesBluetoothNapiAddon.windowssysWindowsWin32DevicesBluetoothBluetoothFindFirstRadio(pbtfrp.rawAddress.toString(), phradio.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothFindNextDevice(hfind: HbluetoothDeviceFind, pbtdi: MutPtr<BluetoothDeviceInfo>): Bool =
    if (windowsWin32DevicesBluetoothNapiAddon != null) (windowsWin32DevicesBluetoothNapiAddon.windowssysWindowsWin32DevicesBluetoothBluetoothFindNextDevice(hfind.rawAddress.toString(), pbtdi.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothFindNextRadio(hfind: HbluetoothRadioFind, phradio: MutPtr<Handle>): Bool =
    if (windowsWin32DevicesBluetoothNapiAddon != null) (windowsWin32DevicesBluetoothNapiAddon.windowssysWindowsWin32DevicesBluetoothBluetoothFindNextRadio(hfind.rawAddress.toString(), phradio.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothFindRadioClose(hfind: HbluetoothRadioFind): Bool =
    if (windowsWin32DevicesBluetoothNapiAddon != null) (windowsWin32DevicesBluetoothNapiAddon.windowssysWindowsWin32DevicesBluetoothBluetoothFindRadioClose(hfind.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothGATTAbortReliableWrite(hdevice: Handle, reliablewritecontext: ULong, flags: UInt): Hresult =
    if (windowsWin32DevicesBluetoothNapiAddon != null) (windowsWin32DevicesBluetoothNapiAddon.windowssysWindowsWin32DevicesBluetoothBluetoothGATTAbortReliableWrite(hdevice.rawAddress.toString(), reliablewritecontext.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothGATTBeginReliableWrite(hdevice: Handle, reliablewritecontext: MutPtr<ULong>, flags: UInt): Hresult =
    if (windowsWin32DevicesBluetoothNapiAddon != null) (windowsWin32DevicesBluetoothNapiAddon.windowssysWindowsWin32DevicesBluetoothBluetoothGATTBeginReliableWrite(hdevice.rawAddress.toString(), reliablewritecontext.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothGATTEndReliableWrite(hdevice: Handle, reliablewritecontext: ULong, flags: UInt): Hresult =
    if (windowsWin32DevicesBluetoothNapiAddon != null) (windowsWin32DevicesBluetoothNapiAddon.windowssysWindowsWin32DevicesBluetoothBluetoothGATTEndReliableWrite(hdevice.rawAddress.toString(), reliablewritecontext.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothGATTGetCharacteristicValue(hdevice: Handle, characteristic: ConstPtr<BthLeGattCharacteristic>, characteristicvaluedatasize: UInt, characteristicvalue: MutPtr<BthLeGattCharacteristicValue>, characteristicvaluesizerequired: MutPtr<UShort>, flags: UInt): Hresult =
    if (windowsWin32DevicesBluetoothNapiAddon != null) (windowsWin32DevicesBluetoothNapiAddon.windowssysWindowsWin32DevicesBluetoothBluetoothGATTGetCharacteristicValue(hdevice.rawAddress.toString(), characteristic.rawAddress.toString(), characteristicvaluedatasize.toInt(), characteristicvalue.rawAddress.toString(), characteristicvaluesizerequired.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothGATTGetCharacteristics(hdevice: Handle, service: ConstPtr<BthLeGattService>, characteristicsbuffercount: UShort, characteristicsbuffer: MutPtr<BthLeGattCharacteristic>, characteristicsbufferactual: MutPtr<UShort>, flags: UInt): Hresult =
    if (windowsWin32DevicesBluetoothNapiAddon != null) (windowsWin32DevicesBluetoothNapiAddon.windowssysWindowsWin32DevicesBluetoothBluetoothGATTGetCharacteristics(hdevice.rawAddress.toString(), service.rawAddress.toString(), characteristicsbuffercount.toInt(), characteristicsbuffer.rawAddress.toString(), characteristicsbufferactual.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothGATTGetDescriptorValue(hdevice: Handle, descriptor: ConstPtr<BthLeGattDescriptor>, descriptorvaluedatasize: UInt, descriptorvalue: MutPtr<BthLeGattDescriptorValue>, descriptorvaluesizerequired: MutPtr<UShort>, flags: UInt): Hresult =
    if (windowsWin32DevicesBluetoothNapiAddon != null) (windowsWin32DevicesBluetoothNapiAddon.windowssysWindowsWin32DevicesBluetoothBluetoothGATTGetDescriptorValue(hdevice.rawAddress.toString(), descriptor.rawAddress.toString(), descriptorvaluedatasize.toInt(), descriptorvalue.rawAddress.toString(), descriptorvaluesizerequired.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothGATTGetDescriptors(hdevice: Handle, characteristic: ConstPtr<BthLeGattCharacteristic>, descriptorsbuffercount: UShort, descriptorsbuffer: MutPtr<BthLeGattDescriptor>, descriptorsbufferactual: MutPtr<UShort>, flags: UInt): Hresult =
    if (windowsWin32DevicesBluetoothNapiAddon != null) (windowsWin32DevicesBluetoothNapiAddon.windowssysWindowsWin32DevicesBluetoothBluetoothGATTGetDescriptors(hdevice.rawAddress.toString(), characteristic.rawAddress.toString(), descriptorsbuffercount.toInt(), descriptorsbuffer.rawAddress.toString(), descriptorsbufferactual.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothGATTGetIncludedServices(hdevice: Handle, parentservice: ConstPtr<BthLeGattService>, includedservicesbuffercount: UShort, includedservicesbuffer: MutPtr<BthLeGattService>, includedservicesbufferactual: MutPtr<UShort>, flags: UInt): Hresult =
    if (windowsWin32DevicesBluetoothNapiAddon != null) (windowsWin32DevicesBluetoothNapiAddon.windowssysWindowsWin32DevicesBluetoothBluetoothGATTGetIncludedServices(hdevice.rawAddress.toString(), parentservice.rawAddress.toString(), includedservicesbuffercount.toInt(), includedservicesbuffer.rawAddress.toString(), includedservicesbufferactual.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothGATTGetServices(hdevice: Handle, servicesbuffercount: UShort, servicesbuffer: MutPtr<BthLeGattService>, servicesbufferactual: MutPtr<UShort>, flags: UInt): Hresult =
    if (windowsWin32DevicesBluetoothNapiAddon != null) (windowsWin32DevicesBluetoothNapiAddon.windowssysWindowsWin32DevicesBluetoothBluetoothGATTGetServices(hdevice.rawAddress.toString(), servicesbuffercount.toInt(), servicesbuffer.rawAddress.toString(), servicesbufferactual.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothGATTRegisterEvent(hservice: Handle, eventtype: BthLeGattEventType, eventparameterin: ConstPtr<CVoid>, callback: PfnbluetoothGattEventCallback, callbackcontext: ConstPtr<CVoid>, peventhandle: MutPtr<Long>, flags: UInt): Hresult =
    if (windowsWin32DevicesBluetoothNapiAddon != null) (windowsWin32DevicesBluetoothNapiAddon.windowssysWindowsWin32DevicesBluetoothBluetoothGATTRegisterEvent(hservice.rawAddress.toString(), eventtype, eventparameterin.rawAddress.toString(), 0L.toString(), callbackcontext.rawAddress.toString(), peventhandle.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothGATTSetCharacteristicValue(hdevice: Handle, characteristic: ConstPtr<BthLeGattCharacteristic>, characteristicvalue: ConstPtr<BthLeGattCharacteristicValue>, reliablewritecontext: ULong, flags: UInt): Hresult =
    if (windowsWin32DevicesBluetoothNapiAddon != null) (windowsWin32DevicesBluetoothNapiAddon.windowssysWindowsWin32DevicesBluetoothBluetoothGATTSetCharacteristicValue(hdevice.rawAddress.toString(), characteristic.rawAddress.toString(), characteristicvalue.rawAddress.toString(), reliablewritecontext.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothGATTSetDescriptorValue(hdevice: Handle, descriptor: ConstPtr<BthLeGattDescriptor>, descriptorvalue: ConstPtr<BthLeGattDescriptorValue>, flags: UInt): Hresult =
    if (windowsWin32DevicesBluetoothNapiAddon != null) (windowsWin32DevicesBluetoothNapiAddon.windowssysWindowsWin32DevicesBluetoothBluetoothGATTSetDescriptorValue(hdevice.rawAddress.toString(), descriptor.rawAddress.toString(), descriptorvalue.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothGATTUnregisterEvent(eventhandle: Long, flags: UInt): Hresult =
    if (windowsWin32DevicesBluetoothNapiAddon != null) (windowsWin32DevicesBluetoothNapiAddon.windowssysWindowsWin32DevicesBluetoothBluetoothGATTUnregisterEvent(eventhandle.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothGetDeviceInfo(hradio: Handle, pbtdi: MutPtr<BluetoothDeviceInfo>): UInt =
    if (windowsWin32DevicesBluetoothNapiAddon != null) (windowsWin32DevicesBluetoothNapiAddon.windowssysWindowsWin32DevicesBluetoothBluetoothGetDeviceInfo(hradio.rawAddress.toString(), pbtdi.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothGetRadioInfo(hradio: Handle, pradioinfo: MutPtr<BluetoothRadioInfo>): UInt =
    if (windowsWin32DevicesBluetoothNapiAddon != null) (windowsWin32DevicesBluetoothNapiAddon.windowssysWindowsWin32DevicesBluetoothBluetoothGetRadioInfo(hradio.rawAddress.toString(), pradioinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothIsConnectable(hradio: Handle): Bool =
    if (windowsWin32DevicesBluetoothNapiAddon != null) (windowsWin32DevicesBluetoothNapiAddon.windowssysWindowsWin32DevicesBluetoothBluetoothIsConnectable(hradio.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothIsDiscoverable(hradio: Handle): Bool =
    if (windowsWin32DevicesBluetoothNapiAddon != null) (windowsWin32DevicesBluetoothNapiAddon.windowssysWindowsWin32DevicesBluetoothBluetoothIsDiscoverable(hradio.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothIsVersionAvailable(majorversion: UByte, minorversion: UByte): Bool =
    if (windowsWin32DevicesBluetoothNapiAddon != null) (windowsWin32DevicesBluetoothNapiAddon.windowssysWindowsWin32DevicesBluetoothBluetoothIsVersionAvailable(majorversion.toInt(), minorversion.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothRegisterForAuthentication(pbtdi: ConstPtr<BluetoothDeviceInfo>, phreghandle: MutPtr<Long>, pfncallback: PfnAuthenticationCallback, pvparam: ConstPtr<CVoid>): UInt =
    if (windowsWin32DevicesBluetoothNapiAddon != null) (windowsWin32DevicesBluetoothNapiAddon.windowssysWindowsWin32DevicesBluetoothBluetoothRegisterForAuthentication(pbtdi.rawAddress.toString(), phreghandle.rawAddress.toString(), 0L.toString(), pvparam.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothRegisterForAuthenticationEx(pbtdiin: ConstPtr<BluetoothDeviceInfo>, phreghandleout: MutPtr<Long>, pfncallbackin: PfnAuthenticationCallbackEx, pvparam: ConstPtr<CVoid>): UInt =
    if (windowsWin32DevicesBluetoothNapiAddon != null) (windowsWin32DevicesBluetoothNapiAddon.windowssysWindowsWin32DevicesBluetoothBluetoothRegisterForAuthenticationEx(pbtdiin.rawAddress.toString(), phreghandleout.rawAddress.toString(), 0L.toString(), pvparam.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothRemoveDevice(paddress: ConstPtr<BluetoothAddress>): UInt =
    if (windowsWin32DevicesBluetoothNapiAddon != null) (windowsWin32DevicesBluetoothNapiAddon.windowssysWindowsWin32DevicesBluetoothBluetoothRemoveDevice(paddress.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothSdpEnumAttributes(psdpstream: ConstPtr<UByte>, cbstreamsize: UInt, pfncallback: PfnBluetoothEnumAttributesCallback, pvparam: ConstPtr<CVoid>): Bool =
    if (windowsWin32DevicesBluetoothNapiAddon != null) (windowsWin32DevicesBluetoothNapiAddon.windowssysWindowsWin32DevicesBluetoothBluetoothSdpEnumAttributes(psdpstream.rawAddress.toString(), cbstreamsize.toInt(), 0L.toString(), pvparam.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothSdpGetAttributeValue(precordstream: ConstPtr<UByte>, cbrecordlength: UInt, usattributeid: UShort, pattributedata: MutPtr<SdpElementData>): UInt =
    if (windowsWin32DevicesBluetoothNapiAddon != null) (windowsWin32DevicesBluetoothNapiAddon.windowssysWindowsWin32DevicesBluetoothBluetoothSdpGetAttributeValue(precordstream.rawAddress.toString(), cbrecordlength.toInt(), usattributeid.toInt(), pattributedata.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothSdpGetContainerElementData(pcontainerstream: ConstPtr<UByte>, cbcontainerlength: UInt, pelement: MutPtr<Long>, pdata: MutPtr<SdpElementData>): UInt =
    if (windowsWin32DevicesBluetoothNapiAddon != null) (windowsWin32DevicesBluetoothNapiAddon.windowssysWindowsWin32DevicesBluetoothBluetoothSdpGetContainerElementData(pcontainerstream.rawAddress.toString(), cbcontainerlength.toInt(), pelement.rawAddress.toString(), pdata.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothSdpGetElementData(psdpstream: ConstPtr<UByte>, cbsdpstreamlength: UInt, pdata: MutPtr<SdpElementData>): UInt =
    if (windowsWin32DevicesBluetoothNapiAddon != null) (windowsWin32DevicesBluetoothNapiAddon.windowssysWindowsWin32DevicesBluetoothBluetoothSdpGetElementData(psdpstream.rawAddress.toString(), cbsdpstreamlength.toInt(), pdata.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothSdpGetString(precordstream: ConstPtr<UByte>, cbrecordlength: UInt, pstringdata: ConstPtr<SdpStringTypeData>, usstringoffset: UShort, pszstring: Pwstr, pcchstringlength: MutPtr<UInt>): UInt =
    if (windowsWin32DevicesBluetoothNapiAddon != null) (windowsWin32DevicesBluetoothNapiAddon.windowssysWindowsWin32DevicesBluetoothBluetoothSdpGetString(precordstream.rawAddress.toString(), cbrecordlength.toInt(), pstringdata.rawAddress.toString(), usstringoffset.toInt(), pszstring.rawAddress.toString(), pcchstringlength.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothSelectDevices(pbtsdp: MutPtr<BluetoothSelectDeviceParams>): Bool =
    if (windowsWin32DevicesBluetoothNapiAddon != null) (windowsWin32DevicesBluetoothNapiAddon.windowssysWindowsWin32DevicesBluetoothBluetoothSelectDevices(pbtsdp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothSelectDevicesFree(pbtsdp: MutPtr<BluetoothSelectDeviceParams>): Bool =
    if (windowsWin32DevicesBluetoothNapiAddon != null) (windowsWin32DevicesBluetoothNapiAddon.windowssysWindowsWin32DevicesBluetoothBluetoothSelectDevicesFree(pbtsdp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothSendAuthenticationResponse(hradio: Handle, pbtdi: ConstPtr<BluetoothDeviceInfo>, pszpasskey: Pcwstr): UInt =
    if (windowsWin32DevicesBluetoothNapiAddon != null) (windowsWin32DevicesBluetoothNapiAddon.windowssysWindowsWin32DevicesBluetoothBluetoothSendAuthenticationResponse(hradio.rawAddress.toString(), pbtdi.rawAddress.toString(), pszpasskey.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothSendAuthenticationResponseEx(hradioin: Handle, pauthresponse: ConstPtr<BluetoothAuthenticateResponse>): UInt =
    if (windowsWin32DevicesBluetoothNapiAddon != null) (windowsWin32DevicesBluetoothNapiAddon.windowssysWindowsWin32DevicesBluetoothBluetoothSendAuthenticationResponseEx(hradioin.rawAddress.toString(), pauthresponse.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothSetLocalServiceInfo(hradioin: Handle, pclassguid: ConstPtr<Guid>, ulinstance: UInt, pserviceinfoin: ConstPtr<BluetoothLocalServiceInfo>): UInt =
    if (windowsWin32DevicesBluetoothNapiAddon != null) (windowsWin32DevicesBluetoothNapiAddon.windowssysWindowsWin32DevicesBluetoothBluetoothSetLocalServiceInfo(hradioin.rawAddress.toString(), pclassguid.rawAddress.toString(), ulinstance.toInt(), pserviceinfoin.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothSetServiceState(hradio: Handle, pbtdi: ConstPtr<BluetoothDeviceInfo>, pguidservice: ConstPtr<Guid>, dwserviceflags: UInt): UInt =
    if (windowsWin32DevicesBluetoothNapiAddon != null) (windowsWin32DevicesBluetoothNapiAddon.windowssysWindowsWin32DevicesBluetoothBluetoothSetServiceState(hradio.rawAddress.toString(), pbtdi.rawAddress.toString(), pguidservice.rawAddress.toString(), dwserviceflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothUnregisterAuthentication(hreghandle: Long): Bool =
    if (windowsWin32DevicesBluetoothNapiAddon != null) (windowsWin32DevicesBluetoothNapiAddon.windowssysWindowsWin32DevicesBluetoothBluetoothUnregisterAuthentication(hreghandle.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bluetoothUpdateDeviceRecord(pbtdi: ConstPtr<BluetoothDeviceInfo>): UInt =
    if (windowsWin32DevicesBluetoothNapiAddon != null) (windowsWin32DevicesBluetoothNapiAddon.windowssysWindowsWin32DevicesBluetoothBluetoothUpdateDeviceRecord(pbtdi.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
