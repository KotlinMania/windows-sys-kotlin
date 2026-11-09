@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun BluetoothAuthenticateDevice(hwndparent: HWND, hradio: HANDLE, pbtbi: Long, pszpasskey: PCWSTR, ulpasskeylength: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_BluetoothAuthenticateDevice(hwndparent.toCPointer<ByteVar>(), hradio.toCPointer<ByteVar>(), pbtbi.toCPointer<ByteVar>(), pszpasskey.toCPointer<ByteVar>(), ulpasskeylength)

public actual fun BluetoothAuthenticateDeviceEx(hwndparentin: HWND, hradioin: HANDLE, pbtdiinout: Long, pbtoobdata: Long, authenticationrequirement: AUTHENTICATION_REQUIREMENTS): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_BluetoothAuthenticateDeviceEx(hwndparentin.toCPointer<ByteVar>(), hradioin.toCPointer<ByteVar>(), pbtdiinout.toCPointer<ByteVar>(), pbtoobdata.toCPointer<ByteVar>(), authenticationrequirement)

public actual fun BluetoothAuthenticateMultipleDevices(hwndparent: HWND, hradio: HANDLE, cdevices: UInt, rgbtdi: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_BluetoothAuthenticateMultipleDevices(hwndparent.toCPointer<ByteVar>(), hradio.toCPointer<ByteVar>(), cdevices, rgbtdi.toCPointer<ByteVar>())

public actual fun BluetoothDisplayDeviceProperties(hwndparent: HWND, pbtdi: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_BluetoothDisplayDeviceProperties(hwndparent.toCPointer<ByteVar>(), pbtdi.toCPointer<ByteVar>())

public actual fun BluetoothEnableDiscovery(hradio: HANDLE, fenabled: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_BluetoothEnableDiscovery(hradio.toCPointer<ByteVar>(), fenabled)

public actual fun BluetoothEnableIncomingConnections(hradio: HANDLE, fenabled: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_BluetoothEnableIncomingConnections(hradio.toCPointer<ByteVar>(), fenabled)

public actual fun BluetoothEnumerateInstalledServices(hradio: HANDLE, pbtdi: Long, pcserviceinout: Long, pguidservices: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_BluetoothEnumerateInstalledServices(hradio.toCPointer<ByteVar>(), pbtdi.toCPointer<ByteVar>(), pcserviceinout.toCPointer<ByteVar>(), pguidservices.toCPointer<ByteVar>())

public actual fun BluetoothFindDeviceClose(hfind: HBLUETOOTH_DEVICE_FIND): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_BluetoothFindDeviceClose(hfind.toCPointer<ByteVar>())

public actual fun BluetoothFindFirstDevice(pbtsp: Long, pbtdi: Long): HBLUETOOTH_DEVICE_FIND =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_BluetoothFindFirstDevice(pbtsp.toCPointer<ByteVar>(), pbtdi.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun BluetoothFindFirstRadio(pbtfrp: Long, phradio: Long): HBLUETOOTH_RADIO_FIND =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_BluetoothFindFirstRadio(pbtfrp.toCPointer<ByteVar>(), phradio.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun BluetoothFindNextDevice(hfind: HBLUETOOTH_DEVICE_FIND, pbtdi: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_BluetoothFindNextDevice(hfind.toCPointer<ByteVar>(), pbtdi.toCPointer<ByteVar>())

public actual fun BluetoothFindNextRadio(hfind: HBLUETOOTH_RADIO_FIND, phradio: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_BluetoothFindNextRadio(hfind.toCPointer<ByteVar>(), phradio.toCPointer<ByteVar>())

public actual fun BluetoothFindRadioClose(hfind: HBLUETOOTH_RADIO_FIND): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_BluetoothFindRadioClose(hfind.toCPointer<ByteVar>())

public actual fun BluetoothGATTAbortReliableWrite(hdevice: HANDLE, reliablewritecontext: ULong, flags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_BluetoothGATTAbortReliableWrite(hdevice.toCPointer<ByteVar>(), reliablewritecontext, flags)

public actual fun BluetoothGATTBeginReliableWrite(hdevice: HANDLE, reliablewritecontext: Long, flags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_BluetoothGATTBeginReliableWrite(hdevice.toCPointer<ByteVar>(), reliablewritecontext.toCPointer<ByteVar>(), flags)

public actual fun BluetoothGATTEndReliableWrite(hdevice: HANDLE, reliablewritecontext: ULong, flags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_BluetoothGATTEndReliableWrite(hdevice.toCPointer<ByteVar>(), reliablewritecontext, flags)

public actual fun BluetoothGATTGetCharacteristicValue(hdevice: HANDLE, characteristic: Long, characteristicvaluedatasize: UInt, characteristicvalue: Long, characteristicvaluesizerequired: Long, flags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_BluetoothGATTGetCharacteristicValue(hdevice.toCPointer<ByteVar>(), characteristic.toCPointer<ByteVar>(), characteristicvaluedatasize, characteristicvalue.toCPointer<ByteVar>(), characteristicvaluesizerequired.toCPointer<ByteVar>(), flags)

public actual fun BluetoothGATTGetCharacteristics(hdevice: HANDLE, service: Long, characteristicsbuffercount: UShort, characteristicsbuffer: Long, characteristicsbufferactual: Long, flags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_BluetoothGATTGetCharacteristics(hdevice.toCPointer<ByteVar>(), service.toCPointer<ByteVar>(), characteristicsbuffercount, characteristicsbuffer.toCPointer<ByteVar>(), characteristicsbufferactual.toCPointer<ByteVar>(), flags)

public actual fun BluetoothGATTGetDescriptorValue(hdevice: HANDLE, descriptor: Long, descriptorvaluedatasize: UInt, descriptorvalue: Long, descriptorvaluesizerequired: Long, flags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_BluetoothGATTGetDescriptorValue(hdevice.toCPointer<ByteVar>(), descriptor.toCPointer<ByteVar>(), descriptorvaluedatasize, descriptorvalue.toCPointer<ByteVar>(), descriptorvaluesizerequired.toCPointer<ByteVar>(), flags)

public actual fun BluetoothGATTGetDescriptors(hdevice: HANDLE, characteristic: Long, descriptorsbuffercount: UShort, descriptorsbuffer: Long, descriptorsbufferactual: Long, flags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_BluetoothGATTGetDescriptors(hdevice.toCPointer<ByteVar>(), characteristic.toCPointer<ByteVar>(), descriptorsbuffercount, descriptorsbuffer.toCPointer<ByteVar>(), descriptorsbufferactual.toCPointer<ByteVar>(), flags)

public actual fun BluetoothGATTGetIncludedServices(hdevice: HANDLE, parentservice: Long, includedservicesbuffercount: UShort, includedservicesbuffer: Long, includedservicesbufferactual: Long, flags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_BluetoothGATTGetIncludedServices(hdevice.toCPointer<ByteVar>(), parentservice.toCPointer<ByteVar>(), includedservicesbuffercount, includedservicesbuffer.toCPointer<ByteVar>(), includedservicesbufferactual.toCPointer<ByteVar>(), flags)

public actual fun BluetoothGATTGetServices(hdevice: HANDLE, servicesbuffercount: UShort, servicesbuffer: Long, servicesbufferactual: Long, flags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_BluetoothGATTGetServices(hdevice.toCPointer<ByteVar>(), servicesbuffercount, servicesbuffer.toCPointer<ByteVar>(), servicesbufferactual.toCPointer<ByteVar>(), flags)

public actual fun BluetoothGATTRegisterEvent(hservice: HANDLE, eventtype: BTH_LE_GATT_EVENT_TYPE, eventparameterin: Long, callback: PFNBLUETOOTH_GATT_EVENT_CALLBACK, callbackcontext: Long, peventhandle: Long, flags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_BluetoothGATTRegisterEvent(hservice.toCPointer<ByteVar>(), eventtype, eventparameterin.toCPointer<ByteVar>(), callback.toLong().toCPointer<ByteVar>(), callbackcontext.toCPointer<ByteVar>(), peventhandle.toCPointer<ByteVar>(), flags)

public actual fun BluetoothGATTSetCharacteristicValue(hdevice: HANDLE, characteristic: Long, characteristicvalue: Long, reliablewritecontext: ULong, flags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_BluetoothGATTSetCharacteristicValue(hdevice.toCPointer<ByteVar>(), characteristic.toCPointer<ByteVar>(), characteristicvalue.toCPointer<ByteVar>(), reliablewritecontext, flags)

public actual fun BluetoothGATTSetDescriptorValue(hdevice: HANDLE, descriptor: Long, descriptorvalue: Long, flags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_BluetoothGATTSetDescriptorValue(hdevice.toCPointer<ByteVar>(), descriptor.toCPointer<ByteVar>(), descriptorvalue.toCPointer<ByteVar>(), flags)

public actual fun BluetoothGATTUnregisterEvent(eventhandle: Long, flags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_BluetoothGATTUnregisterEvent(eventhandle, flags)

public actual fun BluetoothGetDeviceInfo(hradio: HANDLE, pbtdi: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_BluetoothGetDeviceInfo(hradio.toCPointer<ByteVar>(), pbtdi.toCPointer<ByteVar>())

public actual fun BluetoothGetRadioInfo(hradio: HANDLE, pradioinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_BluetoothGetRadioInfo(hradio.toCPointer<ByteVar>(), pradioinfo.toCPointer<ByteVar>())

public actual fun BluetoothIsConnectable(hradio: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_BluetoothIsConnectable(hradio.toCPointer<ByteVar>())

public actual fun BluetoothIsDiscoverable(hradio: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_BluetoothIsDiscoverable(hradio.toCPointer<ByteVar>())

public actual fun BluetoothIsVersionAvailable(majorversion: UByte, minorversion: UByte): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_BluetoothIsVersionAvailable(majorversion, minorversion)

public actual fun BluetoothRegisterForAuthentication(pbtdi: Long, phreghandle: Long, pfncallback: PFN_AUTHENTICATION_CALLBACK, pvparam: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_BluetoothRegisterForAuthentication(pbtdi.toCPointer<ByteVar>(), phreghandle.toCPointer<ByteVar>(), pfncallback.toLong().toCPointer<ByteVar>(), pvparam.toCPointer<ByteVar>())

public actual fun BluetoothRegisterForAuthenticationEx(pbtdiin: Long, phreghandleout: Long, pfncallbackin: PFN_AUTHENTICATION_CALLBACK_EX, pvparam: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_BluetoothRegisterForAuthenticationEx(pbtdiin.toCPointer<ByteVar>(), phreghandleout.toCPointer<ByteVar>(), pfncallbackin.toLong().toCPointer<ByteVar>(), pvparam.toCPointer<ByteVar>())

public actual fun BluetoothRemoveDevice(paddress: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_BluetoothRemoveDevice(paddress.toCPointer<ByteVar>())

public actual fun BluetoothSdpEnumAttributes(psdpstream: Long, cbstreamsize: UInt, pfncallback: PFN_BLUETOOTH_ENUM_ATTRIBUTES_CALLBACK, pvparam: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_BluetoothSdpEnumAttributes(psdpstream.toCPointer<ByteVar>(), cbstreamsize, pfncallback.toLong().toCPointer<ByteVar>(), pvparam.toCPointer<ByteVar>())

public actual fun BluetoothSdpGetAttributeValue(precordstream: Long, cbrecordlength: UInt, usattributeid: UShort, pattributedata: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_BluetoothSdpGetAttributeValue(precordstream.toCPointer<ByteVar>(), cbrecordlength, usattributeid, pattributedata.toCPointer<ByteVar>())

public actual fun BluetoothSdpGetContainerElementData(pcontainerstream: Long, cbcontainerlength: UInt, pelement: Long, pdata: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_BluetoothSdpGetContainerElementData(pcontainerstream.toCPointer<ByteVar>(), cbcontainerlength, pelement.toCPointer<ByteVar>(), pdata.toCPointer<ByteVar>())

public actual fun BluetoothSdpGetElementData(psdpstream: Long, cbsdpstreamlength: UInt, pdata: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_BluetoothSdpGetElementData(psdpstream.toCPointer<ByteVar>(), cbsdpstreamlength, pdata.toCPointer<ByteVar>())

public actual fun BluetoothSdpGetString(precordstream: Long, cbrecordlength: UInt, pstringdata: Long, usstringoffset: UShort, pszstring: PWSTR, pcchstringlength: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_BluetoothSdpGetString(precordstream.toCPointer<ByteVar>(), cbrecordlength, pstringdata.toCPointer<ByteVar>(), usstringoffset, pszstring.toCPointer<ByteVar>(), pcchstringlength.toCPointer<ByteVar>())

public actual fun BluetoothSelectDevices(pbtsdp: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_BluetoothSelectDevices(pbtsdp.toCPointer<ByteVar>())

public actual fun BluetoothSelectDevicesFree(pbtsdp: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_BluetoothSelectDevicesFree(pbtsdp.toCPointer<ByteVar>())

public actual fun BluetoothSendAuthenticationResponse(hradio: HANDLE, pbtdi: Long, pszpasskey: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_BluetoothSendAuthenticationResponse(hradio.toCPointer<ByteVar>(), pbtdi.toCPointer<ByteVar>(), pszpasskey.toCPointer<ByteVar>())

public actual fun BluetoothSendAuthenticationResponseEx(hradioin: HANDLE, pauthresponse: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_BluetoothSendAuthenticationResponseEx(hradioin.toCPointer<ByteVar>(), pauthresponse.toCPointer<ByteVar>())

public actual fun BluetoothSetLocalServiceInfo(hradioin: HANDLE, pclassguid: Long, ulinstance: UInt, pserviceinfoin: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_BluetoothSetLocalServiceInfo(hradioin.toCPointer<ByteVar>(), pclassguid.toCPointer<ByteVar>(), ulinstance, pserviceinfoin.toCPointer<ByteVar>())

public actual fun BluetoothSetServiceState(hradio: HANDLE, pbtdi: Long, pguidservice: Long, dwserviceflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_BluetoothSetServiceState(hradio.toCPointer<ByteVar>(), pbtdi.toCPointer<ByteVar>(), pguidservice.toCPointer<ByteVar>(), dwserviceflags)

public actual fun BluetoothUnregisterAuthentication(hreghandle: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_BluetoothUnregisterAuthentication(hreghandle)

public actual fun BluetoothUpdateDeviceRecord(pbtdi: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_BluetoothUpdateDeviceRecord(pbtdi.toCPointer<ByteVar>())
