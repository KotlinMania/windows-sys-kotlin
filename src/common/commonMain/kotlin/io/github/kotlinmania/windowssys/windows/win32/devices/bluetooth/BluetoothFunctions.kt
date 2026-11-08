package io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

public fun interface FnCallback {
    public operator fun invoke(eventtype: BTH_LE_GATT_EVENT_TYPE, eventoutparameter: Long, context: Long)
}

public fun interface FnCallback1 {
    public operator fun invoke(pvparam: Long, pdevice: Long): BOOL
}

public fun interface FnCallback2 {
    public operator fun invoke(uattribid: UInt, pvaluestream: Long, cbstreamsize: UInt, pvparam: Long): BOOL
}

public fun BluetoothAuthenticateDevice(hwndparent: HWND, hradio: HANDLE, pbtbi: Long, pszpasskey: PCWSTR, ulpasskeylength: UInt): UInt {
    return Win32DynamicFfi.invoke("bthprops.cpl", "BluetoothAuthenticateDevice", longArrayOf(hwndparent, hradio, pbtbi, pszpasskey, ulpasskeylength.toLong())).toUInt()
}

public fun BluetoothAuthenticateDeviceEx(hwndparentin: HWND, hradioin: HANDLE, pbtdiinout: Long, pbtoobdata: Long, authenticationrequirement: AUTHENTICATION_REQUIREMENTS): UInt {
    return Win32DynamicFfi.invoke("bthprops.cpl", "BluetoothAuthenticateDeviceEx", longArrayOf(hwndparentin, hradioin, pbtdiinout, pbtoobdata, authenticationrequirement.toLong())).toUInt()
}

public fun BluetoothAuthenticateMultipleDevices(hwndparent: HWND, hradio: HANDLE, cdevices: UInt, rgbtdi: Long): UInt {
    return Win32DynamicFfi.invoke("bthprops.cpl", "BluetoothAuthenticateMultipleDevices", longArrayOf(hwndparent, hradio, cdevices.toLong(), rgbtdi)).toUInt()
}

public fun BluetoothDisplayDeviceProperties(hwndparent: HWND, pbtdi: Long): BOOL {
    return Win32DynamicFfi.invoke("bthprops.cpl", "BluetoothDisplayDeviceProperties", longArrayOf(hwndparent, pbtdi)).toInt()
}

public fun BluetoothEnableDiscovery(hradio: HANDLE, fenabled: BOOL): BOOL {
    return Win32DynamicFfi.invoke("bluetoothapis.dll", "BluetoothEnableDiscovery", longArrayOf(hradio, fenabled.toLong())).toInt()
}

public fun BluetoothEnableIncomingConnections(hradio: HANDLE, fenabled: BOOL): BOOL {
    return Win32DynamicFfi.invoke("bluetoothapis.dll", "BluetoothEnableIncomingConnections", longArrayOf(hradio, fenabled.toLong())).toInt()
}

public fun BluetoothEnumerateInstalledServices(hradio: HANDLE, pbtdi: Long, pcserviceinout: Long, pguidservices: Long): UInt {
    return Win32DynamicFfi.invoke("bluetoothapis.dll", "BluetoothEnumerateInstalledServices", longArrayOf(hradio, pbtdi, pcserviceinout, pguidservices)).toUInt()
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

public fun BluetoothGATTAbortReliableWrite(hdevice: HANDLE, reliablewritecontext: ULong, flags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("bluetoothapis.dll", "BluetoothGATTAbortReliableWrite", longArrayOf(hdevice, reliablewritecontext.toLong(), flags.toLong())).toInt()
}

public fun BluetoothGATTBeginReliableWrite(hdevice: HANDLE, reliablewritecontext: Long, flags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("bluetoothapis.dll", "BluetoothGATTBeginReliableWrite", longArrayOf(hdevice, reliablewritecontext, flags.toLong())).toInt()
}

public fun BluetoothGATTEndReliableWrite(hdevice: HANDLE, reliablewritecontext: ULong, flags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("bluetoothapis.dll", "BluetoothGATTEndReliableWrite", longArrayOf(hdevice, reliablewritecontext.toLong(), flags.toLong())).toInt()
}

public fun BluetoothGATTGetCharacteristicValue(hdevice: HANDLE, characteristic: Long, characteristicvaluedatasize: UInt, characteristicvalue: Long, characteristicvaluesizerequired: Long, flags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("bluetoothapis.dll", "BluetoothGATTGetCharacteristicValue", longArrayOf(hdevice, characteristic, characteristicvaluedatasize.toLong(), characteristicvalue, characteristicvaluesizerequired, flags.toLong())).toInt()
}

public fun BluetoothGATTGetCharacteristics(hdevice: HANDLE, service: Long, characteristicsbuffercount: UShort, characteristicsbuffer: Long, characteristicsbufferactual: Long, flags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("bluetoothapis.dll", "BluetoothGATTGetCharacteristics", longArrayOf(hdevice, service, characteristicsbuffercount.toLong(), characteristicsbuffer, characteristicsbufferactual, flags.toLong())).toInt()
}

public fun BluetoothGATTGetDescriptorValue(hdevice: HANDLE, descriptor: Long, descriptorvaluedatasize: UInt, descriptorvalue: Long, descriptorvaluesizerequired: Long, flags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("bluetoothapis.dll", "BluetoothGATTGetDescriptorValue", longArrayOf(hdevice, descriptor, descriptorvaluedatasize.toLong(), descriptorvalue, descriptorvaluesizerequired, flags.toLong())).toInt()
}

public fun BluetoothGATTGetDescriptors(hdevice: HANDLE, characteristic: Long, descriptorsbuffercount: UShort, descriptorsbuffer: Long, descriptorsbufferactual: Long, flags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("bluetoothapis.dll", "BluetoothGATTGetDescriptors", longArrayOf(hdevice, characteristic, descriptorsbuffercount.toLong(), descriptorsbuffer, descriptorsbufferactual, flags.toLong())).toInt()
}

public fun BluetoothGATTGetIncludedServices(hdevice: HANDLE, parentservice: Long, includedservicesbuffercount: UShort, includedservicesbuffer: Long, includedservicesbufferactual: Long, flags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("bluetoothapis.dll", "BluetoothGATTGetIncludedServices", longArrayOf(hdevice, parentservice, includedservicesbuffercount.toLong(), includedservicesbuffer, includedservicesbufferactual, flags.toLong())).toInt()
}

public fun BluetoothGATTGetServices(hdevice: HANDLE, servicesbuffercount: UShort, servicesbuffer: Long, servicesbufferactual: Long, flags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("bluetoothapis.dll", "BluetoothGATTGetServices", longArrayOf(hdevice, servicesbuffercount.toLong(), servicesbuffer, servicesbufferactual, flags.toLong())).toInt()
}

public fun BluetoothGATTRegisterEvent(hservice: HANDLE, eventtype: BTH_LE_GATT_EVENT_TYPE, eventparameterin: Long, callback: PFNBLUETOOTH_GATT_EVENT_CALLBACK, callbackcontext: Long, peventhandle: Long, flags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("bluetoothapis.dll", "BluetoothGATTRegisterEvent", longArrayOf(hservice, eventtype.toLong(), eventparameterin, Win32DynamicFfi.objectSlot(callback), callbackcontext, peventhandle, flags.toLong())).toInt()
}

public fun BluetoothGATTSetCharacteristicValue(hdevice: HANDLE, characteristic: Long, characteristicvalue: Long, reliablewritecontext: ULong, flags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("bluetoothapis.dll", "BluetoothGATTSetCharacteristicValue", longArrayOf(hdevice, characteristic, characteristicvalue, reliablewritecontext.toLong(), flags.toLong())).toInt()
}

public fun BluetoothGATTSetDescriptorValue(hdevice: HANDLE, descriptor: Long, descriptorvalue: Long, flags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("bluetoothapis.dll", "BluetoothGATTSetDescriptorValue", longArrayOf(hdevice, descriptor, descriptorvalue, flags.toLong())).toInt()
}

public fun BluetoothGATTUnregisterEvent(eventhandle: Long, flags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("bluetoothapis.dll", "BluetoothGATTUnregisterEvent", longArrayOf(eventhandle, flags.toLong())).toInt()
}

public fun BluetoothGetDeviceInfo(hradio: HANDLE, pbtdi: Long): UInt {
    return Win32DynamicFfi.invoke("bluetoothapis.dll", "BluetoothGetDeviceInfo", longArrayOf(hradio, pbtdi)).toUInt()
}

public fun BluetoothGetRadioInfo(hradio: HANDLE, pradioinfo: Long): UInt {
    return Win32DynamicFfi.invoke("bluetoothapis.dll", "BluetoothGetRadioInfo", longArrayOf(hradio, pradioinfo)).toUInt()
}

public fun BluetoothIsConnectable(hradio: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("bluetoothapis.dll", "BluetoothIsConnectable", longArrayOf(hradio)).toInt()
}

public fun BluetoothIsDiscoverable(hradio: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("bluetoothapis.dll", "BluetoothIsDiscoverable", longArrayOf(hradio)).toInt()
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

public fun BluetoothSendAuthenticationResponse(hradio: HANDLE, pbtdi: Long, pszpasskey: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("bluetoothapis.dll", "BluetoothSendAuthenticationResponse", longArrayOf(hradio, pbtdi, pszpasskey)).toUInt()
}

public fun BluetoothSendAuthenticationResponseEx(hradioin: HANDLE, pauthresponse: Long): UInt {
    return Win32DynamicFfi.invoke("bluetoothapis.dll", "BluetoothSendAuthenticationResponseEx", longArrayOf(hradioin, pauthresponse)).toUInt()
}

public fun BluetoothSetLocalServiceInfo(hradioin: HANDLE, pclassguid: Long, ulinstance: UInt, pserviceinfoin: Long): UInt {
    return Win32DynamicFfi.invoke("bluetoothapis.dll", "BluetoothSetLocalServiceInfo", longArrayOf(hradioin, pclassguid, ulinstance.toLong(), pserviceinfoin)).toUInt()
}

public fun BluetoothSetServiceState(hradio: HANDLE, pbtdi: Long, pguidservice: Long, dwserviceflags: UInt): UInt {
    return Win32DynamicFfi.invoke("bluetoothapis.dll", "BluetoothSetServiceState", longArrayOf(hradio, pbtdi, pguidservice, dwserviceflags.toLong())).toUInt()
}

public fun BluetoothUnregisterAuthentication(hreghandle: Long): BOOL {
    return Win32DynamicFfi.invoke("bluetoothapis.dll", "BluetoothUnregisterAuthentication", longArrayOf(hreghandle)).toInt()
}

public fun BluetoothUpdateDeviceRecord(pbtdi: Long): UInt {
    return Win32DynamicFfi.invoke("bluetoothapis.dll", "BluetoothUpdateDeviceRecord", longArrayOf(pbtdi)).toUInt()
}
