@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

private val _windowsWin32DevicesBluetoothNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun BluetoothAuthenticateDevice(hwndparent: HWND, hradio: HANDLE, pbtbi: Long, pszpasskey: PCWSTR, ulpasskeylength: UInt): UInt =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_BluetoothAuthenticateDevice(hwndparent.toString(), hradio.toString(), pbtbi.toString(), pszpasskey.toString(), ulpasskeylength.toInt()) as Int).toUInt() else 0u

public actual fun BluetoothAuthenticateDeviceEx(hwndparentin: HWND, hradioin: HANDLE, pbtdiinout: Long, pbtoobdata: Long, authenticationrequirement: AUTHENTICATION_REQUIREMENTS): UInt =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_BluetoothAuthenticateDeviceEx(hwndparentin.toString(), hradioin.toString(), pbtdiinout.toString(), pbtoobdata.toString(), authenticationrequirement) as Int).toUInt() else 0u

public actual fun BluetoothAuthenticateMultipleDevices(hwndparent: HWND, hradio: HANDLE, cdevices: UInt, rgbtdi: Long): UInt =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_BluetoothAuthenticateMultipleDevices(hwndparent.toString(), hradio.toString(), cdevices.toInt(), rgbtdi.toString()) as Int).toUInt() else 0u

public actual fun BluetoothDisplayDeviceProperties(hwndparent: HWND, pbtdi: Long): BOOL =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_BluetoothDisplayDeviceProperties(hwndparent.toString(), pbtdi.toString()) as Int) else 0

public actual fun BluetoothEnableDiscovery(hradio: HANDLE, fenabled: BOOL): BOOL =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_BluetoothEnableDiscovery(hradio.toString(), fenabled) as Int) else 0

public actual fun BluetoothEnableIncomingConnections(hradio: HANDLE, fenabled: BOOL): BOOL =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_BluetoothEnableIncomingConnections(hradio.toString(), fenabled) as Int) else 0

public actual fun BluetoothEnumerateInstalledServices(hradio: HANDLE, pbtdi: Long, pcserviceinout: Long, pguidservices: Long): UInt =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_BluetoothEnumerateInstalledServices(hradio.toString(), pbtdi.toString(), pcserviceinout.toString(), pguidservices.toString()) as Int).toUInt() else 0u

public actual fun BluetoothFindDeviceClose(hfind: HBLUETOOTH_DEVICE_FIND): BOOL =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_BluetoothFindDeviceClose(hfind.toString()) as Int) else 0

public actual fun BluetoothFindFirstDevice(pbtsp: Long, pbtdi: Long): HBLUETOOTH_DEVICE_FIND =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_BluetoothFindFirstDevice(pbtsp.toString(), pbtdi.toString()) as String).toLong() else 0L

public actual fun BluetoothFindFirstRadio(pbtfrp: Long, phradio: Long): HBLUETOOTH_RADIO_FIND =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_BluetoothFindFirstRadio(pbtfrp.toString(), phradio.toString()) as String).toLong() else 0L

public actual fun BluetoothFindNextDevice(hfind: HBLUETOOTH_DEVICE_FIND, pbtdi: Long): BOOL =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_BluetoothFindNextDevice(hfind.toString(), pbtdi.toString()) as Int) else 0

public actual fun BluetoothFindNextRadio(hfind: HBLUETOOTH_RADIO_FIND, phradio: Long): BOOL =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_BluetoothFindNextRadio(hfind.toString(), phradio.toString()) as Int) else 0

public actual fun BluetoothFindRadioClose(hfind: HBLUETOOTH_RADIO_FIND): BOOL =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_BluetoothFindRadioClose(hfind.toString()) as Int) else 0

public actual fun BluetoothGATTAbortReliableWrite(hdevice: HANDLE, reliablewritecontext: ULong, flags: UInt): HRESULT =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_BluetoothGATTAbortReliableWrite(hdevice.toString(), reliablewritecontext.toString(), flags.toInt()) as Int) else 0

public actual fun BluetoothGATTBeginReliableWrite(hdevice: HANDLE, reliablewritecontext: Long, flags: UInt): HRESULT =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_BluetoothGATTBeginReliableWrite(hdevice.toString(), reliablewritecontext.toString(), flags.toInt()) as Int) else 0

public actual fun BluetoothGATTEndReliableWrite(hdevice: HANDLE, reliablewritecontext: ULong, flags: UInt): HRESULT =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_BluetoothGATTEndReliableWrite(hdevice.toString(), reliablewritecontext.toString(), flags.toInt()) as Int) else 0

public actual fun BluetoothGATTGetCharacteristicValue(hdevice: HANDLE, characteristic: Long, characteristicvaluedatasize: UInt, characteristicvalue: Long, characteristicvaluesizerequired: Long, flags: UInt): HRESULT =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_BluetoothGATTGetCharacteristicValue(hdevice.toString(), characteristic.toString(), characteristicvaluedatasize.toInt(), characteristicvalue.toString(), characteristicvaluesizerequired.toString(), flags.toInt()) as Int) else 0

public actual fun BluetoothGATTGetCharacteristics(hdevice: HANDLE, service: Long, characteristicsbuffercount: UShort, characteristicsbuffer: Long, characteristicsbufferactual: Long, flags: UInt): HRESULT =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_BluetoothGATTGetCharacteristics(hdevice.toString(), service.toString(), characteristicsbuffercount.toInt(), characteristicsbuffer.toString(), characteristicsbufferactual.toString(), flags.toInt()) as Int) else 0

public actual fun BluetoothGATTGetDescriptorValue(hdevice: HANDLE, descriptor: Long, descriptorvaluedatasize: UInt, descriptorvalue: Long, descriptorvaluesizerequired: Long, flags: UInt): HRESULT =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_BluetoothGATTGetDescriptorValue(hdevice.toString(), descriptor.toString(), descriptorvaluedatasize.toInt(), descriptorvalue.toString(), descriptorvaluesizerequired.toString(), flags.toInt()) as Int) else 0

public actual fun BluetoothGATTGetDescriptors(hdevice: HANDLE, characteristic: Long, descriptorsbuffercount: UShort, descriptorsbuffer: Long, descriptorsbufferactual: Long, flags: UInt): HRESULT =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_BluetoothGATTGetDescriptors(hdevice.toString(), characteristic.toString(), descriptorsbuffercount.toInt(), descriptorsbuffer.toString(), descriptorsbufferactual.toString(), flags.toInt()) as Int) else 0

public actual fun BluetoothGATTGetIncludedServices(hdevice: HANDLE, parentservice: Long, includedservicesbuffercount: UShort, includedservicesbuffer: Long, includedservicesbufferactual: Long, flags: UInt): HRESULT =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_BluetoothGATTGetIncludedServices(hdevice.toString(), parentservice.toString(), includedservicesbuffercount.toInt(), includedservicesbuffer.toString(), includedservicesbufferactual.toString(), flags.toInt()) as Int) else 0

public actual fun BluetoothGATTGetServices(hdevice: HANDLE, servicesbuffercount: UShort, servicesbuffer: Long, servicesbufferactual: Long, flags: UInt): HRESULT =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_BluetoothGATTGetServices(hdevice.toString(), servicesbuffercount.toInt(), servicesbuffer.toString(), servicesbufferactual.toString(), flags.toInt()) as Int) else 0

public actual fun BluetoothGATTRegisterEvent(hservice: HANDLE, eventtype: BTH_LE_GATT_EVENT_TYPE, eventparameterin: Long, callback: PFNBLUETOOTH_GATT_EVENT_CALLBACK, callbackcontext: Long, peventhandle: Long, flags: UInt): HRESULT =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_BluetoothGATTRegisterEvent(hservice.toString(), eventtype, eventparameterin.toString(), callback.toLong().toString(), callbackcontext.toString(), peventhandle.toString(), flags.toInt()) as Int) else 0

public actual fun BluetoothGATTSetCharacteristicValue(hdevice: HANDLE, characteristic: Long, characteristicvalue: Long, reliablewritecontext: ULong, flags: UInt): HRESULT =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_BluetoothGATTSetCharacteristicValue(hdevice.toString(), characteristic.toString(), characteristicvalue.toString(), reliablewritecontext.toString(), flags.toInt()) as Int) else 0

public actual fun BluetoothGATTSetDescriptorValue(hdevice: HANDLE, descriptor: Long, descriptorvalue: Long, flags: UInt): HRESULT =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_BluetoothGATTSetDescriptorValue(hdevice.toString(), descriptor.toString(), descriptorvalue.toString(), flags.toInt()) as Int) else 0

public actual fun BluetoothGATTUnregisterEvent(eventhandle: Long, flags: UInt): HRESULT =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_BluetoothGATTUnregisterEvent(eventhandle.toString(), flags.toInt()) as Int) else 0

public actual fun BluetoothGetDeviceInfo(hradio: HANDLE, pbtdi: Long): UInt =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_BluetoothGetDeviceInfo(hradio.toString(), pbtdi.toString()) as Int).toUInt() else 0u

public actual fun BluetoothGetRadioInfo(hradio: HANDLE, pradioinfo: Long): UInt =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_BluetoothGetRadioInfo(hradio.toString(), pradioinfo.toString()) as Int).toUInt() else 0u

public actual fun BluetoothIsConnectable(hradio: HANDLE): BOOL =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_BluetoothIsConnectable(hradio.toString()) as Int) else 0

public actual fun BluetoothIsDiscoverable(hradio: HANDLE): BOOL =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_BluetoothIsDiscoverable(hradio.toString()) as Int) else 0

public actual fun BluetoothIsVersionAvailable(majorversion: UByte, minorversion: UByte): BOOL =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_BluetoothIsVersionAvailable(majorversion.toInt(), minorversion.toInt()) as Int) else 0

public actual fun BluetoothRegisterForAuthentication(pbtdi: Long, phreghandle: Long, pfncallback: PFN_AUTHENTICATION_CALLBACK, pvparam: Long): UInt =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_BluetoothRegisterForAuthentication(pbtdi.toString(), phreghandle.toString(), pfncallback.toLong().toString(), pvparam.toString()) as Int).toUInt() else 0u

public actual fun BluetoothRegisterForAuthenticationEx(pbtdiin: Long, phreghandleout: Long, pfncallbackin: PFN_AUTHENTICATION_CALLBACK_EX, pvparam: Long): UInt =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_BluetoothRegisterForAuthenticationEx(pbtdiin.toString(), phreghandleout.toString(), pfncallbackin.toLong().toString(), pvparam.toString()) as Int).toUInt() else 0u

public actual fun BluetoothRemoveDevice(paddress: Long): UInt =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_BluetoothRemoveDevice(paddress.toString()) as Int).toUInt() else 0u

public actual fun BluetoothSdpEnumAttributes(psdpstream: Long, cbstreamsize: UInt, pfncallback: PFN_BLUETOOTH_ENUM_ATTRIBUTES_CALLBACK, pvparam: Long): BOOL =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_BluetoothSdpEnumAttributes(psdpstream.toString(), cbstreamsize.toInt(), pfncallback.toLong().toString(), pvparam.toString()) as Int) else 0

public actual fun BluetoothSdpGetAttributeValue(precordstream: Long, cbrecordlength: UInt, usattributeid: UShort, pattributedata: Long): UInt =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_BluetoothSdpGetAttributeValue(precordstream.toString(), cbrecordlength.toInt(), usattributeid.toInt(), pattributedata.toString()) as Int).toUInt() else 0u

public actual fun BluetoothSdpGetContainerElementData(pcontainerstream: Long, cbcontainerlength: UInt, pelement: Long, pdata: Long): UInt =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_BluetoothSdpGetContainerElementData(pcontainerstream.toString(), cbcontainerlength.toInt(), pelement.toString(), pdata.toString()) as Int).toUInt() else 0u

public actual fun BluetoothSdpGetElementData(psdpstream: Long, cbsdpstreamlength: UInt, pdata: Long): UInt =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_BluetoothSdpGetElementData(psdpstream.toString(), cbsdpstreamlength.toInt(), pdata.toString()) as Int).toUInt() else 0u

public actual fun BluetoothSdpGetString(precordstream: Long, cbrecordlength: UInt, pstringdata: Long, usstringoffset: UShort, pszstring: PWSTR, pcchstringlength: Long): UInt =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_BluetoothSdpGetString(precordstream.toString(), cbrecordlength.toInt(), pstringdata.toString(), usstringoffset.toInt(), pszstring.toString(), pcchstringlength.toString()) as Int).toUInt() else 0u

public actual fun BluetoothSelectDevices(pbtsdp: Long): BOOL =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_BluetoothSelectDevices(pbtsdp.toString()) as Int) else 0

public actual fun BluetoothSelectDevicesFree(pbtsdp: Long): BOOL =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_BluetoothSelectDevicesFree(pbtsdp.toString()) as Int) else 0

public actual fun BluetoothSendAuthenticationResponse(hradio: HANDLE, pbtdi: Long, pszpasskey: PCWSTR): UInt =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_BluetoothSendAuthenticationResponse(hradio.toString(), pbtdi.toString(), pszpasskey.toString()) as Int).toUInt() else 0u

public actual fun BluetoothSendAuthenticationResponseEx(hradioin: HANDLE, pauthresponse: Long): UInt =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_BluetoothSendAuthenticationResponseEx(hradioin.toString(), pauthresponse.toString()) as Int).toUInt() else 0u

public actual fun BluetoothSetLocalServiceInfo(hradioin: HANDLE, pclassguid: Long, ulinstance: UInt, pserviceinfoin: Long): UInt =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_BluetoothSetLocalServiceInfo(hradioin.toString(), pclassguid.toString(), ulinstance.toInt(), pserviceinfoin.toString()) as Int).toUInt() else 0u

public actual fun BluetoothSetServiceState(hradio: HANDLE, pbtdi: Long, pguidservice: Long, dwserviceflags: UInt): UInt =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_BluetoothSetServiceState(hradio.toString(), pbtdi.toString(), pguidservice.toString(), dwserviceflags.toInt()) as Int).toUInt() else 0u

public actual fun BluetoothUnregisterAuthentication(hreghandle: Long): BOOL =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_BluetoothUnregisterAuthentication(hreghandle.toString()) as Int) else 0

public actual fun BluetoothUpdateDeviceRecord(pbtdi: Long): UInt =
    if (_windowsWin32DevicesBluetoothNapiAddon != null) (_windowsWin32DevicesBluetoothNapiAddon.windowssys_windows_win32_devices_bluetooth_BluetoothUpdateDeviceRecord(pbtdi.toString()) as Int).toUInt() else 0u
