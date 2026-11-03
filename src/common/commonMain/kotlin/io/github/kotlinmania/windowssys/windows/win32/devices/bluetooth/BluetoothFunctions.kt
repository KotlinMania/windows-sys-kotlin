package io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public fun interface FnCallback {
    public operator fun invoke(eventtype: BTH_LE_GATT_EVENT_TYPE, eventoutparameter: Long, context: Long)
}

public fun interface FnCallback1 {
    public operator fun invoke(pvparam: Long, pdevice: Long): BOOL
}

public fun interface FnCallback2 {
    public operator fun invoke(uattribid: UInt, pvaluestream: Long, cbstreamsize: UInt, pvparam: Long): BOOL
}

public fun BluetoothAuthenticateDevice(hwndparent: Foundation.HWND, hradio: Foundation.HANDLE, pbtbi: Long, pszpasskey: PCWSTR, ulpasskeylength: UInt): UInt {
    return Win32DynamicFfi.invoke("bthprops.cpl", "BluetoothAuthenticateDevice", longArrayOf(Win32DynamicFfi.objectSlot(hwndparent), Win32DynamicFfi.objectSlot(hradio), pbtbi, pszpasskey, ulpasskeylength.toLong())).toUInt()
}

public fun BluetoothAuthenticateDeviceEx(hwndparentin: Foundation.HWND, hradioin: Foundation.HANDLE, pbtdiinout: Long, pbtoobdata: Long, authenticationrequirement: AUTHENTICATION_REQUIREMENTS): UInt {
    return Win32DynamicFfi.invoke("bthprops.cpl", "BluetoothAuthenticateDeviceEx", longArrayOf(Win32DynamicFfi.objectSlot(hwndparentin), Win32DynamicFfi.objectSlot(hradioin), pbtdiinout, pbtoobdata, authenticationrequirement.toLong())).toUInt()
}

public fun BluetoothAuthenticateMultipleDevices(hwndparent: Foundation.HWND, hradio: Foundation.HANDLE, cdevices: UInt, rgbtdi: Long): UInt {
    return Win32DynamicFfi.invoke("bthprops.cpl", "BluetoothAuthenticateMultipleDevices", longArrayOf(Win32DynamicFfi.objectSlot(hwndparent), Win32DynamicFfi.objectSlot(hradio), cdevices.toLong(), rgbtdi)).toUInt()
}

public fun BluetoothDisplayDeviceProperties(hwndparent: Foundation.HWND, pbtdi: Long): BOOL {
    return Win32DynamicFfi.invoke("bthprops.cpl", "BluetoothDisplayDeviceProperties", longArrayOf(Win32DynamicFfi.objectSlot(hwndparent), pbtdi)).toInt()
}

public fun BluetoothEnableDiscovery(hradio: Foundation.HANDLE, fenabled: BOOL): BOOL {
    return Win32DynamicFfi.invoke("bluetoothapis.dll", "BluetoothEnableDiscovery", longArrayOf(Win32DynamicFfi.objectSlot(hradio), fenabled.toLong())).toInt()
}

public fun BluetoothEnableIncomingConnections(hradio: Foundation.HANDLE, fenabled: BOOL): BOOL {
    return Win32DynamicFfi.invoke("bluetoothapis.dll", "BluetoothEnableIncomingConnections", longArrayOf(Win32DynamicFfi.objectSlot(hradio), fenabled.toLong())).toInt()
}

public fun BluetoothEnumerateInstalledServices(hradio: Foundation.HANDLE, pbtdi: Long, pcserviceinout: Long, pguidservices: Long): UInt {
    return Win32DynamicFfi.invoke("bluetoothapis.dll", "BluetoothEnumerateInstalledServices", longArrayOf(Win32DynamicFfi.objectSlot(hradio), pbtdi, pcserviceinout, pguidservices)).toUInt()
}

public fun BluetoothFindDeviceClose(hfind: HBLUETOOTH_DEVICE_FIND): BOOL {
    return Win32DynamicFfi.invoke("bluetoothapis.dll", "BluetoothFindDeviceClose", longArrayOf(hfind)).toInt()
}

public fun BluetoothFindFirstDevice(pbtsp: Long, pbtdi: Long): HBLUETOOTH_DEVICE_FIND {
    return Win32DynamicFfi.invoke("bluetoothapis.dll", "BluetoothFindFirstDevice", longArrayOf(pbtsp, pbtdi))
}

public fun BluetoothFindFirstRadio(pbtfrp: Long, phradio: Long): HBLUETOOTH_RADIO_FIND {
    return Win32DynamicFfi.invoke("bluetoothapis.dll", "BluetoothFindFirstRadio", longArrayOf(pbtfrp, phradio))
}

public fun BluetoothFindNextDevice(hfind: HBLUETOOTH_DEVICE_FIND, pbtdi: Long): BOOL {
    return Win32DynamicFfi.invoke("bluetoothapis.dll", "BluetoothFindNextDevice", longArrayOf(hfind, pbtdi)).toInt()
}

public fun BluetoothFindNextRadio(hfind: HBLUETOOTH_RADIO_FIND, phradio: Long): BOOL {
    return Win32DynamicFfi.invoke("bluetoothapis.dll", "BluetoothFindNextRadio", longArrayOf(hfind, phradio)).toInt()
}

public fun BluetoothFindRadioClose(hfind: HBLUETOOTH_RADIO_FIND): BOOL {
    return Win32DynamicFfi.invoke("bluetoothapis.dll", "BluetoothFindRadioClose", longArrayOf(hfind)).toInt()
}

public fun BluetoothGATTAbortReliableWrite(hdevice: Foundation.HANDLE, reliablewritecontext: ULong, flags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("bluetoothapis.dll", "BluetoothGATTAbortReliableWrite", longArrayOf(Win32DynamicFfi.objectSlot(hdevice), reliablewritecontext.toLong(), flags.toLong())).toInt()
}

public fun BluetoothGATTBeginReliableWrite(hdevice: Foundation.HANDLE, reliablewritecontext: Long, flags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("bluetoothapis.dll", "BluetoothGATTBeginReliableWrite", longArrayOf(Win32DynamicFfi.objectSlot(hdevice), reliablewritecontext, flags.toLong())).toInt()
}

public fun BluetoothGATTEndReliableWrite(hdevice: Foundation.HANDLE, reliablewritecontext: ULong, flags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("bluetoothapis.dll", "BluetoothGATTEndReliableWrite", longArrayOf(Win32DynamicFfi.objectSlot(hdevice), reliablewritecontext.toLong(), flags.toLong())).toInt()
}

public fun BluetoothGATTGetCharacteristicValue(hdevice: Foundation.HANDLE, characteristic: Long, characteristicvaluedatasize: UInt, characteristicvalue: Long, characteristicvaluesizerequired: Long, flags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("bluetoothapis.dll", "BluetoothGATTGetCharacteristicValue", longArrayOf(Win32DynamicFfi.objectSlot(hdevice), characteristic, characteristicvaluedatasize.toLong(), characteristicvalue, characteristicvaluesizerequired, flags.toLong())).toInt()
}

public fun BluetoothGATTGetCharacteristics(hdevice: Foundation.HANDLE, service: Long, characteristicsbuffercount: UShort, characteristicsbuffer: Long, characteristicsbufferactual: Long, flags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("bluetoothapis.dll", "BluetoothGATTGetCharacteristics", longArrayOf(Win32DynamicFfi.objectSlot(hdevice), service, characteristicsbuffercount.toLong(), characteristicsbuffer, characteristicsbufferactual, flags.toLong())).toInt()
}

public fun BluetoothGATTGetDescriptorValue(hdevice: Foundation.HANDLE, descriptor: Long, descriptorvaluedatasize: UInt, descriptorvalue: Long, descriptorvaluesizerequired: Long, flags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("bluetoothapis.dll", "BluetoothGATTGetDescriptorValue", longArrayOf(Win32DynamicFfi.objectSlot(hdevice), descriptor, descriptorvaluedatasize.toLong(), descriptorvalue, descriptorvaluesizerequired, flags.toLong())).toInt()
}

public fun BluetoothGATTGetDescriptors(hdevice: Foundation.HANDLE, characteristic: Long, descriptorsbuffercount: UShort, descriptorsbuffer: Long, descriptorsbufferactual: Long, flags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("bluetoothapis.dll", "BluetoothGATTGetDescriptors", longArrayOf(Win32DynamicFfi.objectSlot(hdevice), characteristic, descriptorsbuffercount.toLong(), descriptorsbuffer, descriptorsbufferactual, flags.toLong())).toInt()
}

public fun BluetoothGATTGetIncludedServices(hdevice: Foundation.HANDLE, parentservice: Long, includedservicesbuffercount: UShort, includedservicesbuffer: Long, includedservicesbufferactual: Long, flags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("bluetoothapis.dll", "BluetoothGATTGetIncludedServices", longArrayOf(Win32DynamicFfi.objectSlot(hdevice), parentservice, includedservicesbuffercount.toLong(), includedservicesbuffer, includedservicesbufferactual, flags.toLong())).toInt()
}

public fun BluetoothGATTGetServices(hdevice: Foundation.HANDLE, servicesbuffercount: UShort, servicesbuffer: Long, servicesbufferactual: Long, flags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("bluetoothapis.dll", "BluetoothGATTGetServices", longArrayOf(Win32DynamicFfi.objectSlot(hdevice), servicesbuffercount.toLong(), servicesbuffer, servicesbufferactual, flags.toLong())).toInt()
}

public fun BluetoothGATTRegisterEvent(hservice: Foundation.HANDLE, eventtype: BTH_LE_GATT_EVENT_TYPE, eventparameterin: Long, callback: PFNBLUETOOTH_GATT_EVENT_CALLBACK, callbackcontext: Long, peventhandle: Long, flags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("bluetoothapis.dll", "BluetoothGATTRegisterEvent", longArrayOf(Win32DynamicFfi.objectSlot(hservice), eventtype.toLong(), eventparameterin, Win32DynamicFfi.objectSlot(callback), callbackcontext, peventhandle, flags.toLong())).toInt()
}

public fun BluetoothGATTSetCharacteristicValue(hdevice: Foundation.HANDLE, characteristic: Long, characteristicvalue: Long, reliablewritecontext: ULong, flags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("bluetoothapis.dll", "BluetoothGATTSetCharacteristicValue", longArrayOf(Win32DynamicFfi.objectSlot(hdevice), characteristic, characteristicvalue, reliablewritecontext.toLong(), flags.toLong())).toInt()
}

public fun BluetoothGATTSetDescriptorValue(hdevice: Foundation.HANDLE, descriptor: Long, descriptorvalue: Long, flags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("bluetoothapis.dll", "BluetoothGATTSetDescriptorValue", longArrayOf(Win32DynamicFfi.objectSlot(hdevice), descriptor, descriptorvalue, flags.toLong())).toInt()
}

public fun BluetoothGATTUnregisterEvent(eventhandle: Long, flags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("bluetoothapis.dll", "BluetoothGATTUnregisterEvent", longArrayOf(eventhandle, flags.toLong())).toInt()
}

public fun BluetoothGetDeviceInfo(hradio: Foundation.HANDLE, pbtdi: Long): UInt {
    return Win32DynamicFfi.invoke("bluetoothapis.dll", "BluetoothGetDeviceInfo", longArrayOf(Win32DynamicFfi.objectSlot(hradio), pbtdi)).toUInt()
}

public fun BluetoothGetRadioInfo(hradio: Foundation.HANDLE, pradioinfo: Long): UInt {
    return Win32DynamicFfi.invoke("bluetoothapis.dll", "BluetoothGetRadioInfo", longArrayOf(Win32DynamicFfi.objectSlot(hradio), pradioinfo)).toUInt()
}

public fun BluetoothIsConnectable(hradio: Foundation.HANDLE): BOOL {
    return Win32DynamicFfi.invoke("bluetoothapis.dll", "BluetoothIsConnectable", longArrayOf(Win32DynamicFfi.objectSlot(hradio))).toInt()
}

public fun BluetoothIsDiscoverable(hradio: Foundation.HANDLE): BOOL {
    return Win32DynamicFfi.invoke("bluetoothapis.dll", "BluetoothIsDiscoverable", longArrayOf(Win32DynamicFfi.objectSlot(hradio))).toInt()
}

public fun BluetoothIsVersionAvailable(majorversion: UByte, minorversion: UByte): BOOL {
    return Win32DynamicFfi.invoke("bluetoothapis.dll", "BluetoothIsVersionAvailable", longArrayOf(majorversion.toLong(), minorversion.toLong())).toInt()
}

public fun BluetoothRegisterForAuthentication(pbtdi: Long, phreghandle: Long, pfncallback: PFN_AUTHENTICATION_CALLBACK, pvparam: Long): UInt {
    return Win32DynamicFfi.invoke("bluetoothapis.dll", "BluetoothRegisterForAuthentication", longArrayOf(pbtdi, phreghandle, Win32DynamicFfi.objectSlot(pfncallback), pvparam)).toUInt()
}

public fun BluetoothRegisterForAuthenticationEx(pbtdiin: Long, phreghandleout: Long, pfncallbackin: PFN_AUTHENTICATION_CALLBACK_EX, pvparam: Long): UInt {
    return Win32DynamicFfi.invoke("bluetoothapis.dll", "BluetoothRegisterForAuthenticationEx", longArrayOf(pbtdiin, phreghandleout, Win32DynamicFfi.objectSlot(pfncallbackin), pvparam)).toUInt()
}

public fun BluetoothRemoveDevice(paddress: Long): UInt {
    return Win32DynamicFfi.invoke("bluetoothapis.dll", "BluetoothRemoveDevice", longArrayOf(paddress)).toUInt()
}

public fun BluetoothSdpEnumAttributes(psdpstream: Long, cbstreamsize: UInt, pfncallback: PFN_BLUETOOTH_ENUM_ATTRIBUTES_CALLBACK, pvparam: Long): BOOL {
    return Win32DynamicFfi.invoke("bluetoothapis.dll", "BluetoothSdpEnumAttributes", longArrayOf(psdpstream, cbstreamsize.toLong(), Win32DynamicFfi.objectSlot(pfncallback), pvparam)).toInt()
}

public fun BluetoothSdpGetAttributeValue(precordstream: Long, cbrecordlength: UInt, usattributeid: UShort, pattributedata: Long): UInt {
    return Win32DynamicFfi.invoke("bluetoothapis.dll", "BluetoothSdpGetAttributeValue", longArrayOf(precordstream, cbrecordlength.toLong(), usattributeid.toLong(), pattributedata)).toUInt()
}

public fun BluetoothSdpGetContainerElementData(pcontainerstream: Long, cbcontainerlength: UInt, pelement: Long, pdata: Long): UInt {
    return Win32DynamicFfi.invoke("bluetoothapis.dll", "BluetoothSdpGetContainerElementData", longArrayOf(pcontainerstream, cbcontainerlength.toLong(), pelement, pdata)).toUInt()
}

public fun BluetoothSdpGetElementData(psdpstream: Long, cbsdpstreamlength: UInt, pdata: Long): UInt {
    return Win32DynamicFfi.invoke("bluetoothapis.dll", "BluetoothSdpGetElementData", longArrayOf(psdpstream, cbsdpstreamlength.toLong(), pdata)).toUInt()
}

public fun BluetoothSdpGetString(precordstream: Long, cbrecordlength: UInt, pstringdata: Long, usstringoffset: UShort, pszstring: PWSTR, pcchstringlength: Long): UInt {
    return Win32DynamicFfi.invoke("bluetoothapis.dll", "BluetoothSdpGetString", longArrayOf(precordstream, cbrecordlength.toLong(), pstringdata, usstringoffset.toLong(), pszstring, pcchstringlength)).toUInt()
}

public fun BluetoothSelectDevices(pbtsdp: Long): BOOL {
    return Win32DynamicFfi.invoke("bthprops.cpl", "BluetoothSelectDevices", longArrayOf(pbtsdp)).toInt()
}

public fun BluetoothSelectDevicesFree(pbtsdp: Long): BOOL {
    return Win32DynamicFfi.invoke("bthprops.cpl", "BluetoothSelectDevicesFree", longArrayOf(pbtsdp)).toInt()
}

public fun BluetoothSendAuthenticationResponse(hradio: Foundation.HANDLE, pbtdi: Long, pszpasskey: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("bluetoothapis.dll", "BluetoothSendAuthenticationResponse", longArrayOf(Win32DynamicFfi.objectSlot(hradio), pbtdi, pszpasskey)).toUInt()
}

public fun BluetoothSendAuthenticationResponseEx(hradioin: Foundation.HANDLE, pauthresponse: Long): UInt {
    return Win32DynamicFfi.invoke("bluetoothapis.dll", "BluetoothSendAuthenticationResponseEx", longArrayOf(Win32DynamicFfi.objectSlot(hradioin), pauthresponse)).toUInt()
}

public fun BluetoothSetLocalServiceInfo(hradioin: Foundation.HANDLE, pclassguid: Long, ulinstance: UInt, pserviceinfoin: Long): UInt {
    return Win32DynamicFfi.invoke("bluetoothapis.dll", "BluetoothSetLocalServiceInfo", longArrayOf(Win32DynamicFfi.objectSlot(hradioin), pclassguid, ulinstance.toLong(), pserviceinfoin)).toUInt()
}

public fun BluetoothSetServiceState(hradio: Foundation.HANDLE, pbtdi: Long, pguidservice: Long, dwserviceflags: UInt): UInt {
    return Win32DynamicFfi.invoke("bluetoothapis.dll", "BluetoothSetServiceState", longArrayOf(Win32DynamicFfi.objectSlot(hradio), pbtdi, pguidservice, dwserviceflags.toLong())).toUInt()
}

public fun BluetoothUnregisterAuthentication(hreghandle: Long): BOOL {
    return Win32DynamicFfi.invoke("bluetoothapis.dll", "BluetoothUnregisterAuthentication", longArrayOf(hreghandle)).toInt()
}

public fun BluetoothUpdateDeviceRecord(pbtdi: Long): UInt {
    return Win32DynamicFfi.invoke("bluetoothapis.dll", "BluetoothUpdateDeviceRecord", longArrayOf(pbtdi)).toUInt()
}
