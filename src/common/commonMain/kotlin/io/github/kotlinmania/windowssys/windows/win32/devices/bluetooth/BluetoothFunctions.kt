package io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

public expect fun BluetoothAuthenticateDevice(hwndparent: HWND, hradio: HANDLE, pbtbi: Long, pszpasskey: PCWSTR, ulpasskeylength: UInt): UInt

public expect fun BluetoothAuthenticateDeviceEx(hwndparentin: HWND, hradioin: HANDLE, pbtdiinout: Long, pbtoobdata: Long, authenticationrequirement: AUTHENTICATION_REQUIREMENTS): UInt

public expect fun BluetoothAuthenticateMultipleDevices(hwndparent: HWND, hradio: HANDLE, cdevices: UInt, rgbtdi: Long): UInt

public expect fun BluetoothDisplayDeviceProperties(hwndparent: HWND, pbtdi: Long): BOOL

public expect fun BluetoothEnableDiscovery(hradio: HANDLE, fenabled: BOOL): BOOL

public expect fun BluetoothEnableIncomingConnections(hradio: HANDLE, fenabled: BOOL): BOOL

public expect fun BluetoothEnumerateInstalledServices(hradio: HANDLE, pbtdi: Long, pcserviceinout: Long, pguidservices: Long): UInt

public expect fun BluetoothFindDeviceClose(hfind: HBLUETOOTH_DEVICE_FIND): BOOL

public expect fun BluetoothFindFirstDevice(pbtsp: Long, pbtdi: Long): HBLUETOOTH_DEVICE_FIND

public expect fun BluetoothFindFirstRadio(pbtfrp: Long, phradio: Long): HBLUETOOTH_RADIO_FIND

public expect fun BluetoothFindNextDevice(hfind: HBLUETOOTH_DEVICE_FIND, pbtdi: Long): BOOL

public expect fun BluetoothFindNextRadio(hfind: HBLUETOOTH_RADIO_FIND, phradio: Long): BOOL

public expect fun BluetoothFindRadioClose(hfind: HBLUETOOTH_RADIO_FIND): BOOL

public expect fun BluetoothGATTAbortReliableWrite(hdevice: HANDLE, reliablewritecontext: ULong, flags: UInt): HRESULT

public expect fun BluetoothGATTBeginReliableWrite(hdevice: HANDLE, reliablewritecontext: Long, flags: UInt): HRESULT

public expect fun BluetoothGATTEndReliableWrite(hdevice: HANDLE, reliablewritecontext: ULong, flags: UInt): HRESULT

public expect fun BluetoothGATTGetCharacteristicValue(hdevice: HANDLE, characteristic: Long, characteristicvaluedatasize: UInt, characteristicvalue: Long, characteristicvaluesizerequired: Long, flags: UInt): HRESULT

public expect fun BluetoothGATTGetCharacteristics(hdevice: HANDLE, service: Long, characteristicsbuffercount: UShort, characteristicsbuffer: Long, characteristicsbufferactual: Long, flags: UInt): HRESULT

public expect fun BluetoothGATTGetDescriptorValue(hdevice: HANDLE, descriptor: Long, descriptorvaluedatasize: UInt, descriptorvalue: Long, descriptorvaluesizerequired: Long, flags: UInt): HRESULT

public expect fun BluetoothGATTGetDescriptors(hdevice: HANDLE, characteristic: Long, descriptorsbuffercount: UShort, descriptorsbuffer: Long, descriptorsbufferactual: Long, flags: UInt): HRESULT

public expect fun BluetoothGATTGetIncludedServices(hdevice: HANDLE, parentservice: Long, includedservicesbuffercount: UShort, includedservicesbuffer: Long, includedservicesbufferactual: Long, flags: UInt): HRESULT

public expect fun BluetoothGATTGetServices(hdevice: HANDLE, servicesbuffercount: UShort, servicesbuffer: Long, servicesbufferactual: Long, flags: UInt): HRESULT

public expect fun BluetoothGATTRegisterEvent(hservice: HANDLE, eventtype: BTH_LE_GATT_EVENT_TYPE, eventparameterin: Long, callback: PFNBLUETOOTH_GATT_EVENT_CALLBACK, callbackcontext: Long, peventhandle: Long, flags: UInt): HRESULT

public expect fun BluetoothGATTSetCharacteristicValue(hdevice: HANDLE, characteristic: Long, characteristicvalue: Long, reliablewritecontext: ULong, flags: UInt): HRESULT

public expect fun BluetoothGATTSetDescriptorValue(hdevice: HANDLE, descriptor: Long, descriptorvalue: Long, flags: UInt): HRESULT

public expect fun BluetoothGATTUnregisterEvent(eventhandle: Long, flags: UInt): HRESULT

public expect fun BluetoothGetDeviceInfo(hradio: HANDLE, pbtdi: Long): UInt

public expect fun BluetoothGetRadioInfo(hradio: HANDLE, pradioinfo: Long): UInt

public expect fun BluetoothIsConnectable(hradio: HANDLE): BOOL

public expect fun BluetoothIsDiscoverable(hradio: HANDLE): BOOL

public expect fun BluetoothIsVersionAvailable(majorversion: UByte, minorversion: UByte): BOOL

public expect fun BluetoothRegisterForAuthentication(pbtdi: Long, phreghandle: Long, pfncallback: PFN_AUTHENTICATION_CALLBACK, pvparam: Long): UInt

public expect fun BluetoothRegisterForAuthenticationEx(pbtdiin: Long, phreghandleout: Long, pfncallbackin: PFN_AUTHENTICATION_CALLBACK_EX, pvparam: Long): UInt

public expect fun BluetoothRemoveDevice(paddress: Long): UInt

public expect fun BluetoothSdpEnumAttributes(psdpstream: Long, cbstreamsize: UInt, pfncallback: PFN_BLUETOOTH_ENUM_ATTRIBUTES_CALLBACK, pvparam: Long): BOOL

public expect fun BluetoothSdpGetAttributeValue(precordstream: Long, cbrecordlength: UInt, usattributeid: UShort, pattributedata: Long): UInt

public expect fun BluetoothSdpGetContainerElementData(pcontainerstream: Long, cbcontainerlength: UInt, pelement: Long, pdata: Long): UInt

public expect fun BluetoothSdpGetElementData(psdpstream: Long, cbsdpstreamlength: UInt, pdata: Long): UInt

public expect fun BluetoothSdpGetString(precordstream: Long, cbrecordlength: UInt, pstringdata: Long, usstringoffset: UShort, pszstring: PWSTR, pcchstringlength: Long): UInt

public expect fun BluetoothSelectDevices(pbtsdp: Long): BOOL

public expect fun BluetoothSelectDevicesFree(pbtsdp: Long): BOOL

public expect fun BluetoothSendAuthenticationResponse(hradio: HANDLE, pbtdi: Long, pszpasskey: PCWSTR): UInt

public expect fun BluetoothSendAuthenticationResponseEx(hradioin: HANDLE, pauthresponse: Long): UInt

public expect fun BluetoothSetLocalServiceInfo(hradioin: HANDLE, pclassguid: Long, ulinstance: UInt, pserviceinfoin: Long): UInt

public expect fun BluetoothSetServiceState(hradio: HANDLE, pbtdi: Long, pguidservice: Long, dwserviceflags: UInt): UInt

public expect fun BluetoothUnregisterAuthentication(hreghandle: Long): BOOL

public expect fun BluetoothUpdateDeviceRecord(pbtdi: Long): UInt
