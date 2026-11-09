@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

private object WindowsWin32DevicesBluetoothJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_BluetoothAuthenticateDevice(hwndparent: Long, hradio: Long, pbtbi: Long, pszpasskey: Long, ulpasskeylength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_BluetoothAuthenticateDeviceEx(hwndparentin: Long, hradioin: Long, pbtdiinout: Long, pbtoobdata: Long, authenticationrequirement: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_BluetoothAuthenticateMultipleDevices(hwndparent: Long, hradio: Long, cdevices: Int, rgbtdi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_BluetoothDisplayDeviceProperties(hwndparent: Long, pbtdi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_BluetoothEnableDiscovery(hradio: Long, fenabled: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_BluetoothEnableIncomingConnections(hradio: Long, fenabled: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_BluetoothEnumerateInstalledServices(hradio: Long, pbtdi: Long, pcserviceinout: Long, pguidservices: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_BluetoothFindDeviceClose(hfind: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_BluetoothFindFirstDevice(pbtsp: Long, pbtdi: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_BluetoothFindFirstRadio(pbtfrp: Long, phradio: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_BluetoothFindNextDevice(hfind: Long, pbtdi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_BluetoothFindNextRadio(hfind: Long, phradio: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_BluetoothFindRadioClose(hfind: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_BluetoothGATTAbortReliableWrite(hdevice: Long, reliablewritecontext: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_BluetoothGATTBeginReliableWrite(hdevice: Long, reliablewritecontext: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_BluetoothGATTEndReliableWrite(hdevice: Long, reliablewritecontext: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_BluetoothGATTGetCharacteristicValue(hdevice: Long, characteristic: Long, characteristicvaluedatasize: Int, characteristicvalue: Long, characteristicvaluesizerequired: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_BluetoothGATTGetCharacteristics(hdevice: Long, service: Long, characteristicsbuffercount: Short, characteristicsbuffer: Long, characteristicsbufferactual: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_BluetoothGATTGetDescriptorValue(hdevice: Long, descriptor: Long, descriptorvaluedatasize: Int, descriptorvalue: Long, descriptorvaluesizerequired: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_BluetoothGATTGetDescriptors(hdevice: Long, characteristic: Long, descriptorsbuffercount: Short, descriptorsbuffer: Long, descriptorsbufferactual: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_BluetoothGATTGetIncludedServices(hdevice: Long, parentservice: Long, includedservicesbuffercount: Short, includedservicesbuffer: Long, includedservicesbufferactual: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_BluetoothGATTGetServices(hdevice: Long, servicesbuffercount: Short, servicesbuffer: Long, servicesbufferactual: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_BluetoothGATTRegisterEvent(hservice: Long, eventtype: Int, eventparameterin: Long, callback: Long, callbackcontext: Long, peventhandle: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_BluetoothGATTSetCharacteristicValue(hdevice: Long, characteristic: Long, characteristicvalue: Long, reliablewritecontext: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_BluetoothGATTSetDescriptorValue(hdevice: Long, descriptor: Long, descriptorvalue: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_BluetoothGATTUnregisterEvent(eventhandle: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_BluetoothGetDeviceInfo(hradio: Long, pbtdi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_BluetoothGetRadioInfo(hradio: Long, pradioinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_BluetoothIsConnectable(hradio: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_BluetoothIsDiscoverable(hradio: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_BluetoothIsVersionAvailable(majorversion: Byte, minorversion: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_BluetoothRegisterForAuthentication(pbtdi: Long, phreghandle: Long, pfncallback: Long, pvparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_BluetoothRegisterForAuthenticationEx(pbtdiin: Long, phreghandleout: Long, pfncallbackin: Long, pvparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_BluetoothRemoveDevice(paddress: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_BluetoothSdpEnumAttributes(psdpstream: Long, cbstreamsize: Int, pfncallback: Long, pvparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_BluetoothSdpGetAttributeValue(precordstream: Long, cbrecordlength: Int, usattributeid: Short, pattributedata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_BluetoothSdpGetContainerElementData(pcontainerstream: Long, cbcontainerlength: Int, pelement: Long, pdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_BluetoothSdpGetElementData(psdpstream: Long, cbsdpstreamlength: Int, pdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_BluetoothSdpGetString(precordstream: Long, cbrecordlength: Int, pstringdata: Long, usstringoffset: Short, pszstring: Long, pcchstringlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_BluetoothSelectDevices(pbtsdp: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_BluetoothSelectDevicesFree(pbtsdp: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_BluetoothSendAuthenticationResponse(hradio: Long, pbtdi: Long, pszpasskey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_BluetoothSendAuthenticationResponseEx(hradioin: Long, pauthresponse: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_BluetoothSetLocalServiceInfo(hradioin: Long, pclassguid: Long, ulinstance: Int, pserviceinfoin: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_BluetoothSetServiceState(hradio: Long, pbtdi: Long, pguidservice: Long, dwserviceflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_BluetoothUnregisterAuthentication(hreghandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_BluetoothUpdateDeviceRecord(pbtdi: Long): Int
}

public actual fun BluetoothAuthenticateDevice(hwndparent: HWND, hradio: HANDLE, pbtbi: Long, pszpasskey: PCWSTR, ulpasskeylength: UInt): UInt =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_BluetoothAuthenticateDevice(hwndparent, hradio, pbtbi, pszpasskey, ulpasskeylength.toInt()).toUInt()

public actual fun BluetoothAuthenticateDeviceEx(hwndparentin: HWND, hradioin: HANDLE, pbtdiinout: Long, pbtoobdata: Long, authenticationrequirement: AUTHENTICATION_REQUIREMENTS): UInt =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_BluetoothAuthenticateDeviceEx(hwndparentin, hradioin, pbtdiinout, pbtoobdata, authenticationrequirement).toUInt()

public actual fun BluetoothAuthenticateMultipleDevices(hwndparent: HWND, hradio: HANDLE, cdevices: UInt, rgbtdi: Long): UInt =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_BluetoothAuthenticateMultipleDevices(hwndparent, hradio, cdevices.toInt(), rgbtdi).toUInt()

public actual fun BluetoothDisplayDeviceProperties(hwndparent: HWND, pbtdi: Long): BOOL =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_BluetoothDisplayDeviceProperties(hwndparent, pbtdi)

public actual fun BluetoothEnableDiscovery(hradio: HANDLE, fenabled: BOOL): BOOL =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_BluetoothEnableDiscovery(hradio, fenabled)

public actual fun BluetoothEnableIncomingConnections(hradio: HANDLE, fenabled: BOOL): BOOL =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_BluetoothEnableIncomingConnections(hradio, fenabled)

public actual fun BluetoothEnumerateInstalledServices(hradio: HANDLE, pbtdi: Long, pcserviceinout: Long, pguidservices: Long): UInt =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_BluetoothEnumerateInstalledServices(hradio, pbtdi, pcserviceinout, pguidservices).toUInt()

public actual fun BluetoothFindDeviceClose(hfind: HBLUETOOTH_DEVICE_FIND): BOOL =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_BluetoothFindDeviceClose(hfind)

public actual fun BluetoothFindFirstDevice(pbtsp: Long, pbtdi: Long): HBLUETOOTH_DEVICE_FIND =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_BluetoothFindFirstDevice(pbtsp, pbtdi)

public actual fun BluetoothFindFirstRadio(pbtfrp: Long, phradio: Long): HBLUETOOTH_RADIO_FIND =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_BluetoothFindFirstRadio(pbtfrp, phradio)

public actual fun BluetoothFindNextDevice(hfind: HBLUETOOTH_DEVICE_FIND, pbtdi: Long): BOOL =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_BluetoothFindNextDevice(hfind, pbtdi)

public actual fun BluetoothFindNextRadio(hfind: HBLUETOOTH_RADIO_FIND, phradio: Long): BOOL =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_BluetoothFindNextRadio(hfind, phradio)

public actual fun BluetoothFindRadioClose(hfind: HBLUETOOTH_RADIO_FIND): BOOL =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_BluetoothFindRadioClose(hfind)

public actual fun BluetoothGATTAbortReliableWrite(hdevice: HANDLE, reliablewritecontext: ULong, flags: UInt): HRESULT =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_BluetoothGATTAbortReliableWrite(hdevice, reliablewritecontext.toLong(), flags.toInt())

public actual fun BluetoothGATTBeginReliableWrite(hdevice: HANDLE, reliablewritecontext: Long, flags: UInt): HRESULT =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_BluetoothGATTBeginReliableWrite(hdevice, reliablewritecontext, flags.toInt())

public actual fun BluetoothGATTEndReliableWrite(hdevice: HANDLE, reliablewritecontext: ULong, flags: UInt): HRESULT =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_BluetoothGATTEndReliableWrite(hdevice, reliablewritecontext.toLong(), flags.toInt())

public actual fun BluetoothGATTGetCharacteristicValue(hdevice: HANDLE, characteristic: Long, characteristicvaluedatasize: UInt, characteristicvalue: Long, characteristicvaluesizerequired: Long, flags: UInt): HRESULT =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_BluetoothGATTGetCharacteristicValue(hdevice, characteristic, characteristicvaluedatasize.toInt(), characteristicvalue, characteristicvaluesizerequired, flags.toInt())

public actual fun BluetoothGATTGetCharacteristics(hdevice: HANDLE, service: Long, characteristicsbuffercount: UShort, characteristicsbuffer: Long, characteristicsbufferactual: Long, flags: UInt): HRESULT =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_BluetoothGATTGetCharacteristics(hdevice, service, characteristicsbuffercount.toShort(), characteristicsbuffer, characteristicsbufferactual, flags.toInt())

public actual fun BluetoothGATTGetDescriptorValue(hdevice: HANDLE, descriptor: Long, descriptorvaluedatasize: UInt, descriptorvalue: Long, descriptorvaluesizerequired: Long, flags: UInt): HRESULT =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_BluetoothGATTGetDescriptorValue(hdevice, descriptor, descriptorvaluedatasize.toInt(), descriptorvalue, descriptorvaluesizerequired, flags.toInt())

public actual fun BluetoothGATTGetDescriptors(hdevice: HANDLE, characteristic: Long, descriptorsbuffercount: UShort, descriptorsbuffer: Long, descriptorsbufferactual: Long, flags: UInt): HRESULT =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_BluetoothGATTGetDescriptors(hdevice, characteristic, descriptorsbuffercount.toShort(), descriptorsbuffer, descriptorsbufferactual, flags.toInt())

public actual fun BluetoothGATTGetIncludedServices(hdevice: HANDLE, parentservice: Long, includedservicesbuffercount: UShort, includedservicesbuffer: Long, includedservicesbufferactual: Long, flags: UInt): HRESULT =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_BluetoothGATTGetIncludedServices(hdevice, parentservice, includedservicesbuffercount.toShort(), includedservicesbuffer, includedservicesbufferactual, flags.toInt())

public actual fun BluetoothGATTGetServices(hdevice: HANDLE, servicesbuffercount: UShort, servicesbuffer: Long, servicesbufferactual: Long, flags: UInt): HRESULT =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_BluetoothGATTGetServices(hdevice, servicesbuffercount.toShort(), servicesbuffer, servicesbufferactual, flags.toInt())

public actual fun BluetoothGATTRegisterEvent(hservice: HANDLE, eventtype: BTH_LE_GATT_EVENT_TYPE, eventparameterin: Long, callback: PFNBLUETOOTH_GATT_EVENT_CALLBACK, callbackcontext: Long, peventhandle: Long, flags: UInt): HRESULT =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_BluetoothGATTRegisterEvent(hservice, eventtype, eventparameterin, callback.toLong(), callbackcontext, peventhandle, flags.toInt())

public actual fun BluetoothGATTSetCharacteristicValue(hdevice: HANDLE, characteristic: Long, characteristicvalue: Long, reliablewritecontext: ULong, flags: UInt): HRESULT =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_BluetoothGATTSetCharacteristicValue(hdevice, characteristic, characteristicvalue, reliablewritecontext.toLong(), flags.toInt())

public actual fun BluetoothGATTSetDescriptorValue(hdevice: HANDLE, descriptor: Long, descriptorvalue: Long, flags: UInt): HRESULT =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_BluetoothGATTSetDescriptorValue(hdevice, descriptor, descriptorvalue, flags.toInt())

public actual fun BluetoothGATTUnregisterEvent(eventhandle: Long, flags: UInt): HRESULT =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_BluetoothGATTUnregisterEvent(eventhandle, flags.toInt())

public actual fun BluetoothGetDeviceInfo(hradio: HANDLE, pbtdi: Long): UInt =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_BluetoothGetDeviceInfo(hradio, pbtdi).toUInt()

public actual fun BluetoothGetRadioInfo(hradio: HANDLE, pradioinfo: Long): UInt =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_BluetoothGetRadioInfo(hradio, pradioinfo).toUInt()

public actual fun BluetoothIsConnectable(hradio: HANDLE): BOOL =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_BluetoothIsConnectable(hradio)

public actual fun BluetoothIsDiscoverable(hradio: HANDLE): BOOL =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_BluetoothIsDiscoverable(hradio)

public actual fun BluetoothIsVersionAvailable(majorversion: UByte, minorversion: UByte): BOOL =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_BluetoothIsVersionAvailable(majorversion.toByte(), minorversion.toByte())

public actual fun BluetoothRegisterForAuthentication(pbtdi: Long, phreghandle: Long, pfncallback: PFN_AUTHENTICATION_CALLBACK, pvparam: Long): UInt =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_BluetoothRegisterForAuthentication(pbtdi, phreghandle, pfncallback.toLong(), pvparam).toUInt()

public actual fun BluetoothRegisterForAuthenticationEx(pbtdiin: Long, phreghandleout: Long, pfncallbackin: PFN_AUTHENTICATION_CALLBACK_EX, pvparam: Long): UInt =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_BluetoothRegisterForAuthenticationEx(pbtdiin, phreghandleout, pfncallbackin.toLong(), pvparam).toUInt()

public actual fun BluetoothRemoveDevice(paddress: Long): UInt =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_BluetoothRemoveDevice(paddress).toUInt()

public actual fun BluetoothSdpEnumAttributes(psdpstream: Long, cbstreamsize: UInt, pfncallback: PFN_BLUETOOTH_ENUM_ATTRIBUTES_CALLBACK, pvparam: Long): BOOL =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_BluetoothSdpEnumAttributes(psdpstream, cbstreamsize.toInt(), pfncallback.toLong(), pvparam)

public actual fun BluetoothSdpGetAttributeValue(precordstream: Long, cbrecordlength: UInt, usattributeid: UShort, pattributedata: Long): UInt =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_BluetoothSdpGetAttributeValue(precordstream, cbrecordlength.toInt(), usattributeid.toShort(), pattributedata).toUInt()

public actual fun BluetoothSdpGetContainerElementData(pcontainerstream: Long, cbcontainerlength: UInt, pelement: Long, pdata: Long): UInt =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_BluetoothSdpGetContainerElementData(pcontainerstream, cbcontainerlength.toInt(), pelement, pdata).toUInt()

public actual fun BluetoothSdpGetElementData(psdpstream: Long, cbsdpstreamlength: UInt, pdata: Long): UInt =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_BluetoothSdpGetElementData(psdpstream, cbsdpstreamlength.toInt(), pdata).toUInt()

public actual fun BluetoothSdpGetString(precordstream: Long, cbrecordlength: UInt, pstringdata: Long, usstringoffset: UShort, pszstring: PWSTR, pcchstringlength: Long): UInt =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_BluetoothSdpGetString(precordstream, cbrecordlength.toInt(), pstringdata, usstringoffset.toShort(), pszstring, pcchstringlength).toUInt()

public actual fun BluetoothSelectDevices(pbtsdp: Long): BOOL =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_BluetoothSelectDevices(pbtsdp)

public actual fun BluetoothSelectDevicesFree(pbtsdp: Long): BOOL =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_BluetoothSelectDevicesFree(pbtsdp)

public actual fun BluetoothSendAuthenticationResponse(hradio: HANDLE, pbtdi: Long, pszpasskey: PCWSTR): UInt =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_BluetoothSendAuthenticationResponse(hradio, pbtdi, pszpasskey).toUInt()

public actual fun BluetoothSendAuthenticationResponseEx(hradioin: HANDLE, pauthresponse: Long): UInt =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_BluetoothSendAuthenticationResponseEx(hradioin, pauthresponse).toUInt()

public actual fun BluetoothSetLocalServiceInfo(hradioin: HANDLE, pclassguid: Long, ulinstance: UInt, pserviceinfoin: Long): UInt =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_BluetoothSetLocalServiceInfo(hradioin, pclassguid, ulinstance.toInt(), pserviceinfoin).toUInt()

public actual fun BluetoothSetServiceState(hradio: HANDLE, pbtdi: Long, pguidservice: Long, dwserviceflags: UInt): UInt =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_BluetoothSetServiceState(hradio, pbtdi, pguidservice, dwserviceflags.toInt()).toUInt()

public actual fun BluetoothUnregisterAuthentication(hreghandle: Long): BOOL =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_BluetoothUnregisterAuthentication(hreghandle)

public actual fun BluetoothUpdateDeviceRecord(pbtdi: Long): UInt =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_BluetoothUpdateDeviceRecord(pbtdi).toUInt()
