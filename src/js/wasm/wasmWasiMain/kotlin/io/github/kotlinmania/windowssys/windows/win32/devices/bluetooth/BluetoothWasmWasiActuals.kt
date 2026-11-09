@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

public actual fun BluetoothAuthenticateDevice(hwndparent: HWND, hradio: HANDLE, pbtbi: Long, pszpasskey: PCWSTR, ulpasskeylength: UInt): UInt =
    0u

public actual fun BluetoothAuthenticateDeviceEx(hwndparentin: HWND, hradioin: HANDLE, pbtdiinout: Long, pbtoobdata: Long, authenticationrequirement: AUTHENTICATION_REQUIREMENTS): UInt =
    0u

public actual fun BluetoothAuthenticateMultipleDevices(hwndparent: HWND, hradio: HANDLE, cdevices: UInt, rgbtdi: Long): UInt =
    0u

public actual fun BluetoothDisplayDeviceProperties(hwndparent: HWND, pbtdi: Long): BOOL =
    0

public actual fun BluetoothEnableDiscovery(hradio: HANDLE, fenabled: BOOL): BOOL =
    0

public actual fun BluetoothEnableIncomingConnections(hradio: HANDLE, fenabled: BOOL): BOOL =
    0

public actual fun BluetoothEnumerateInstalledServices(hradio: HANDLE, pbtdi: Long, pcserviceinout: Long, pguidservices: Long): UInt =
    0u

public actual fun BluetoothFindDeviceClose(hfind: HBLUETOOTH_DEVICE_FIND): BOOL =
    0

public actual fun BluetoothFindFirstDevice(pbtsp: Long, pbtdi: Long): HBLUETOOTH_DEVICE_FIND =
    0L

public actual fun BluetoothFindFirstRadio(pbtfrp: Long, phradio: Long): HBLUETOOTH_RADIO_FIND =
    0L

public actual fun BluetoothFindNextDevice(hfind: HBLUETOOTH_DEVICE_FIND, pbtdi: Long): BOOL =
    0

public actual fun BluetoothFindNextRadio(hfind: HBLUETOOTH_RADIO_FIND, phradio: Long): BOOL =
    0

public actual fun BluetoothFindRadioClose(hfind: HBLUETOOTH_RADIO_FIND): BOOL =
    0

public actual fun BluetoothGATTAbortReliableWrite(hdevice: HANDLE, reliablewritecontext: ULong, flags: UInt): HRESULT =
    0

public actual fun BluetoothGATTBeginReliableWrite(hdevice: HANDLE, reliablewritecontext: Long, flags: UInt): HRESULT =
    0

public actual fun BluetoothGATTEndReliableWrite(hdevice: HANDLE, reliablewritecontext: ULong, flags: UInt): HRESULT =
    0

public actual fun BluetoothGATTGetCharacteristicValue(hdevice: HANDLE, characteristic: Long, characteristicvaluedatasize: UInt, characteristicvalue: Long, characteristicvaluesizerequired: Long, flags: UInt): HRESULT =
    0

public actual fun BluetoothGATTGetCharacteristics(hdevice: HANDLE, service: Long, characteristicsbuffercount: UShort, characteristicsbuffer: Long, characteristicsbufferactual: Long, flags: UInt): HRESULT =
    0

public actual fun BluetoothGATTGetDescriptorValue(hdevice: HANDLE, descriptor: Long, descriptorvaluedatasize: UInt, descriptorvalue: Long, descriptorvaluesizerequired: Long, flags: UInt): HRESULT =
    0

public actual fun BluetoothGATTGetDescriptors(hdevice: HANDLE, characteristic: Long, descriptorsbuffercount: UShort, descriptorsbuffer: Long, descriptorsbufferactual: Long, flags: UInt): HRESULT =
    0

public actual fun BluetoothGATTGetIncludedServices(hdevice: HANDLE, parentservice: Long, includedservicesbuffercount: UShort, includedservicesbuffer: Long, includedservicesbufferactual: Long, flags: UInt): HRESULT =
    0

public actual fun BluetoothGATTGetServices(hdevice: HANDLE, servicesbuffercount: UShort, servicesbuffer: Long, servicesbufferactual: Long, flags: UInt): HRESULT =
    0

public actual fun BluetoothGATTRegisterEvent(hservice: HANDLE, eventtype: BTH_LE_GATT_EVENT_TYPE, eventparameterin: Long, callback: PFNBLUETOOTH_GATT_EVENT_CALLBACK, callbackcontext: Long, peventhandle: Long, flags: UInt): HRESULT =
    0

public actual fun BluetoothGATTSetCharacteristicValue(hdevice: HANDLE, characteristic: Long, characteristicvalue: Long, reliablewritecontext: ULong, flags: UInt): HRESULT =
    0

public actual fun BluetoothGATTSetDescriptorValue(hdevice: HANDLE, descriptor: Long, descriptorvalue: Long, flags: UInt): HRESULT =
    0

public actual fun BluetoothGATTUnregisterEvent(eventhandle: Long, flags: UInt): HRESULT =
    0

public actual fun BluetoothGetDeviceInfo(hradio: HANDLE, pbtdi: Long): UInt =
    0u

public actual fun BluetoothGetRadioInfo(hradio: HANDLE, pradioinfo: Long): UInt =
    0u

public actual fun BluetoothIsConnectable(hradio: HANDLE): BOOL =
    0

public actual fun BluetoothIsDiscoverable(hradio: HANDLE): BOOL =
    0

public actual fun BluetoothIsVersionAvailable(majorversion: UByte, minorversion: UByte): BOOL =
    0

public actual fun BluetoothRegisterForAuthentication(pbtdi: Long, phreghandle: Long, pfncallback: PFN_AUTHENTICATION_CALLBACK, pvparam: Long): UInt =
    0u

public actual fun BluetoothRegisterForAuthenticationEx(pbtdiin: Long, phreghandleout: Long, pfncallbackin: PFN_AUTHENTICATION_CALLBACK_EX, pvparam: Long): UInt =
    0u

public actual fun BluetoothRemoveDevice(paddress: Long): UInt =
    0u

public actual fun BluetoothSdpEnumAttributes(psdpstream: Long, cbstreamsize: UInt, pfncallback: PFN_BLUETOOTH_ENUM_ATTRIBUTES_CALLBACK, pvparam: Long): BOOL =
    0

public actual fun BluetoothSdpGetAttributeValue(precordstream: Long, cbrecordlength: UInt, usattributeid: UShort, pattributedata: Long): UInt =
    0u

public actual fun BluetoothSdpGetContainerElementData(pcontainerstream: Long, cbcontainerlength: UInt, pelement: Long, pdata: Long): UInt =
    0u

public actual fun BluetoothSdpGetElementData(psdpstream: Long, cbsdpstreamlength: UInt, pdata: Long): UInt =
    0u

public actual fun BluetoothSdpGetString(precordstream: Long, cbrecordlength: UInt, pstringdata: Long, usstringoffset: UShort, pszstring: PWSTR, pcchstringlength: Long): UInt =
    0u

public actual fun BluetoothSelectDevices(pbtsdp: Long): BOOL =
    0

public actual fun BluetoothSelectDevicesFree(pbtsdp: Long): BOOL =
    0

public actual fun BluetoothSendAuthenticationResponse(hradio: HANDLE, pbtdi: Long, pszpasskey: PCWSTR): UInt =
    0u

public actual fun BluetoothSendAuthenticationResponseEx(hradioin: HANDLE, pauthresponse: Long): UInt =
    0u

public actual fun BluetoothSetLocalServiceInfo(hradioin: HANDLE, pclassguid: Long, ulinstance: UInt, pserviceinfoin: Long): UInt =
    0u

public actual fun BluetoothSetServiceState(hradio: HANDLE, pbtdi: Long, pguidservice: Long, dwserviceflags: UInt): UInt =
    0u

public actual fun BluetoothUnregisterAuthentication(hreghandle: Long): BOOL =
    0

public actual fun BluetoothUpdateDeviceRecord(pbtdi: Long): UInt =
    0u
