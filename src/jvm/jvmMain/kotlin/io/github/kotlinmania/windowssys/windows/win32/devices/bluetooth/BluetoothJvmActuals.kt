@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

private object WindowsWin32DevicesBluetoothJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_bluetoothAuthenticateDevice(hwndparent: Long, hradio: Long, pbtbi: Long, pszpasskey: Long, ulpasskeylength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_bluetoothAuthenticateDeviceEx(hwndparentin: Long, hradioin: Long, pbtdiinout: Long, pbtoobdata: Long, authenticationrequirement: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_bluetoothAuthenticateMultipleDevices(hwndparent: Long, hradio: Long, cdevices: Int, rgbtdi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_bluetoothDisplayDeviceProperties(hwndparent: Long, pbtdi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_bluetoothEnableDiscovery(hradio: Long, fenabled: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_bluetoothEnableIncomingConnections(hradio: Long, fenabled: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_bluetoothEnumerateInstalledServices(hradio: Long, pbtdi: Long, pcserviceinout: Long, pguidservices: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_bluetoothFindDeviceClose(hfind: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_bluetoothFindFirstDevice(pbtsp: Long, pbtdi: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_bluetoothFindFirstRadio(pbtfrp: Long, phradio: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_bluetoothFindNextDevice(hfind: Long, pbtdi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_bluetoothFindNextRadio(hfind: Long, phradio: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_bluetoothFindRadioClose(hfind: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_bluetoothGATTAbortReliableWrite(hdevice: Long, reliablewritecontext: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_bluetoothGATTBeginReliableWrite(hdevice: Long, reliablewritecontext: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_bluetoothGATTEndReliableWrite(hdevice: Long, reliablewritecontext: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_bluetoothGATTGetCharacteristicValue(hdevice: Long, characteristic: Long, characteristicvaluedatasize: Int, characteristicvalue: Long, characteristicvaluesizerequired: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_bluetoothGATTGetCharacteristics(hdevice: Long, service: Long, characteristicsbuffercount: Short, characteristicsbuffer: Long, characteristicsbufferactual: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_bluetoothGATTGetDescriptorValue(hdevice: Long, descriptor: Long, descriptorvaluedatasize: Int, descriptorvalue: Long, descriptorvaluesizerequired: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_bluetoothGATTGetDescriptors(hdevice: Long, characteristic: Long, descriptorsbuffercount: Short, descriptorsbuffer: Long, descriptorsbufferactual: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_bluetoothGATTGetIncludedServices(hdevice: Long, parentservice: Long, includedservicesbuffercount: Short, includedservicesbuffer: Long, includedservicesbufferactual: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_bluetoothGATTGetServices(hdevice: Long, servicesbuffercount: Short, servicesbuffer: Long, servicesbufferactual: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_bluetoothGATTRegisterEvent(hservice: Long, eventtype: Int, eventparameterin: Long, callback: Long, callbackcontext: Long, peventhandle: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_bluetoothGATTSetCharacteristicValue(hdevice: Long, characteristic: Long, characteristicvalue: Long, reliablewritecontext: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_bluetoothGATTSetDescriptorValue(hdevice: Long, descriptor: Long, descriptorvalue: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_bluetoothGATTUnregisterEvent(eventhandle: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_bluetoothGetDeviceInfo(hradio: Long, pbtdi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_bluetoothGetRadioInfo(hradio: Long, pradioinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_bluetoothIsConnectable(hradio: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_bluetoothIsDiscoverable(hradio: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_bluetoothIsVersionAvailable(majorversion: Byte, minorversion: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_bluetoothRegisterForAuthentication(pbtdi: Long, phreghandle: Long, pfncallback: Long, pvparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_bluetoothRegisterForAuthenticationEx(pbtdiin: Long, phreghandleout: Long, pfncallbackin: Long, pvparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_bluetoothRemoveDevice(paddress: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_bluetoothSdpEnumAttributes(psdpstream: Long, cbstreamsize: Int, pfncallback: Long, pvparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_bluetoothSdpGetAttributeValue(precordstream: Long, cbrecordlength: Int, usattributeid: Short, pattributedata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_bluetoothSdpGetContainerElementData(pcontainerstream: Long, cbcontainerlength: Int, pelement: Long, pdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_bluetoothSdpGetElementData(psdpstream: Long, cbsdpstreamlength: Int, pdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_bluetoothSdpGetString(precordstream: Long, cbrecordlength: Int, pstringdata: Long, usstringoffset: Short, pszstring: Long, pcchstringlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_bluetoothSelectDevices(pbtsdp: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_bluetoothSelectDevicesFree(pbtsdp: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_bluetoothSendAuthenticationResponse(hradio: Long, pbtdi: Long, pszpasskey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_bluetoothSendAuthenticationResponseEx(hradioin: Long, pauthresponse: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_bluetoothSetLocalServiceInfo(hradioin: Long, pclassguid: Long, ulinstance: Int, pserviceinfoin: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_bluetoothSetServiceState(hradio: Long, pbtdi: Long, pguidservice: Long, dwserviceflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_bluetoothUnregisterAuthentication(hreghandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_bluetooth_bluetoothUpdateDeviceRecord(pbtdi: Long): Int
}

public actual fun bluetoothAuthenticateDevice(hwndparent: Hwnd, hradio: Handle, pbtbi: COpaquePointer?, pszpasskey: Pcwstr, ulpasskeylength: UInt): UInt =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_bluetoothAuthenticateDevice((hwndparent?.value ?: 0L), (hradio?.value ?: 0L), (pbtbi?.value ?: 0L), (pszpasskey?.value ?: 0L), ulpasskeylength.toInt()).toUInt()

public actual fun bluetoothAuthenticateDeviceEx(hwndparentin: Hwnd, hradioin: Handle, pbtdiinout: COpaquePointer?, pbtoobdata: COpaquePointer?, authenticationrequirement: AuthenticationRequirements): UInt =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_bluetoothAuthenticateDeviceEx((hwndparentin?.value ?: 0L), (hradioin?.value ?: 0L), (pbtdiinout?.value ?: 0L), (pbtoobdata?.value ?: 0L), authenticationrequirement).toUInt()

public actual fun bluetoothAuthenticateMultipleDevices(hwndparent: Hwnd, hradio: Handle, cdevices: UInt, rgbtdi: COpaquePointer?): UInt =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_bluetoothAuthenticateMultipleDevices((hwndparent?.value ?: 0L), (hradio?.value ?: 0L), cdevices.toInt(), (rgbtdi?.value ?: 0L)).toUInt()

public actual fun bluetoothDisplayDeviceProperties(hwndparent: Hwnd, pbtdi: COpaquePointer?): Bool =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_bluetoothDisplayDeviceProperties((hwndparent?.value ?: 0L), (pbtdi?.value ?: 0L))

public actual fun bluetoothEnableDiscovery(hradio: Handle, fenabled: Bool): Bool =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_bluetoothEnableDiscovery((hradio?.value ?: 0L), fenabled)

public actual fun bluetoothEnableIncomingConnections(hradio: Handle, fenabled: Bool): Bool =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_bluetoothEnableIncomingConnections((hradio?.value ?: 0L), fenabled)

public actual fun bluetoothEnumerateInstalledServices(hradio: Handle, pbtdi: COpaquePointer?, pcserviceinout: COpaquePointer?, pguidservices: COpaquePointer?): UInt =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_bluetoothEnumerateInstalledServices((hradio?.value ?: 0L), (pbtdi?.value ?: 0L), (pcserviceinout?.value ?: 0L), (pguidservices?.value ?: 0L)).toUInt()

public actual fun bluetoothFindDeviceClose(hfind: HbluetoothDeviceFind): Bool =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_bluetoothFindDeviceClose((hfind?.value ?: 0L))

public actual fun bluetoothFindFirstDevice(pbtsp: COpaquePointer?, pbtdi: COpaquePointer?): HbluetoothDeviceFind =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_bluetoothFindFirstDevice((pbtsp?.value ?: 0L), (pbtdi?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun bluetoothFindFirstRadio(pbtfrp: COpaquePointer?, phradio: COpaquePointer?): HbluetoothRadioFind =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_bluetoothFindFirstRadio((pbtfrp?.value ?: 0L), (phradio?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun bluetoothFindNextDevice(hfind: HbluetoothDeviceFind, pbtdi: COpaquePointer?): Bool =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_bluetoothFindNextDevice((hfind?.value ?: 0L), (pbtdi?.value ?: 0L))

public actual fun bluetoothFindNextRadio(hfind: HbluetoothRadioFind, phradio: COpaquePointer?): Bool =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_bluetoothFindNextRadio((hfind?.value ?: 0L), (phradio?.value ?: 0L))

public actual fun bluetoothFindRadioClose(hfind: HbluetoothRadioFind): Bool =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_bluetoothFindRadioClose((hfind?.value ?: 0L))

public actual fun bluetoothGATTAbortReliableWrite(hdevice: Handle, reliablewritecontext: ULong, flags: UInt): Hresult =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_bluetoothGATTAbortReliableWrite((hdevice?.value ?: 0L), reliablewritecontext.toLong(), flags.toInt())

public actual fun bluetoothGATTBeginReliableWrite(hdevice: Handle, reliablewritecontext: COpaquePointer?, flags: UInt): Hresult =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_bluetoothGATTBeginReliableWrite((hdevice?.value ?: 0L), (reliablewritecontext?.value ?: 0L), flags.toInt())

public actual fun bluetoothGATTEndReliableWrite(hdevice: Handle, reliablewritecontext: ULong, flags: UInt): Hresult =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_bluetoothGATTEndReliableWrite((hdevice?.value ?: 0L), reliablewritecontext.toLong(), flags.toInt())

public actual fun bluetoothGATTGetCharacteristicValue(hdevice: Handle, characteristic: COpaquePointer?, characteristicvaluedatasize: UInt, characteristicvalue: COpaquePointer?, characteristicvaluesizerequired: COpaquePointer?, flags: UInt): Hresult =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_bluetoothGATTGetCharacteristicValue((hdevice?.value ?: 0L), (characteristic?.value ?: 0L), characteristicvaluedatasize.toInt(), (characteristicvalue?.value ?: 0L), (characteristicvaluesizerequired?.value ?: 0L), flags.toInt())

public actual fun bluetoothGATTGetCharacteristics(hdevice: Handle, service: COpaquePointer?, characteristicsbuffercount: UShort, characteristicsbuffer: COpaquePointer?, characteristicsbufferactual: COpaquePointer?, flags: UInt): Hresult =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_bluetoothGATTGetCharacteristics((hdevice?.value ?: 0L), (service?.value ?: 0L), characteristicsbuffercount.toShort(), (characteristicsbuffer?.value ?: 0L), (characteristicsbufferactual?.value ?: 0L), flags.toInt())

public actual fun bluetoothGATTGetDescriptorValue(hdevice: Handle, descriptor: COpaquePointer?, descriptorvaluedatasize: UInt, descriptorvalue: COpaquePointer?, descriptorvaluesizerequired: COpaquePointer?, flags: UInt): Hresult =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_bluetoothGATTGetDescriptorValue((hdevice?.value ?: 0L), (descriptor?.value ?: 0L), descriptorvaluedatasize.toInt(), (descriptorvalue?.value ?: 0L), (descriptorvaluesizerequired?.value ?: 0L), flags.toInt())

public actual fun bluetoothGATTGetDescriptors(hdevice: Handle, characteristic: COpaquePointer?, descriptorsbuffercount: UShort, descriptorsbuffer: COpaquePointer?, descriptorsbufferactual: COpaquePointer?, flags: UInt): Hresult =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_bluetoothGATTGetDescriptors((hdevice?.value ?: 0L), (characteristic?.value ?: 0L), descriptorsbuffercount.toShort(), (descriptorsbuffer?.value ?: 0L), (descriptorsbufferactual?.value ?: 0L), flags.toInt())

public actual fun bluetoothGATTGetIncludedServices(hdevice: Handle, parentservice: COpaquePointer?, includedservicesbuffercount: UShort, includedservicesbuffer: COpaquePointer?, includedservicesbufferactual: COpaquePointer?, flags: UInt): Hresult =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_bluetoothGATTGetIncludedServices((hdevice?.value ?: 0L), (parentservice?.value ?: 0L), includedservicesbuffercount.toShort(), (includedservicesbuffer?.value ?: 0L), (includedservicesbufferactual?.value ?: 0L), flags.toInt())

public actual fun bluetoothGATTGetServices(hdevice: Handle, servicesbuffercount: UShort, servicesbuffer: COpaquePointer?, servicesbufferactual: COpaquePointer?, flags: UInt): Hresult =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_bluetoothGATTGetServices((hdevice?.value ?: 0L), servicesbuffercount.toShort(), (servicesbuffer?.value ?: 0L), (servicesbufferactual?.value ?: 0L), flags.toInt())

public actual fun bluetoothGATTRegisterEvent(hservice: Handle, eventtype: BthLeGattEventType, eventparameterin: COpaquePointer?, callback: PfnbluetoothGattEventCallback, callbackcontext: COpaquePointer?, peventhandle: COpaquePointer?, flags: UInt): Hresult =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_bluetoothGATTRegisterEvent((hservice?.value ?: 0L), eventtype, (eventparameterin?.value ?: 0L), 0L, (callbackcontext?.value ?: 0L), (peventhandle?.value ?: 0L), flags.toInt())

public actual fun bluetoothGATTSetCharacteristicValue(hdevice: Handle, characteristic: COpaquePointer?, characteristicvalue: COpaquePointer?, reliablewritecontext: ULong, flags: UInt): Hresult =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_bluetoothGATTSetCharacteristicValue((hdevice?.value ?: 0L), (characteristic?.value ?: 0L), (characteristicvalue?.value ?: 0L), reliablewritecontext.toLong(), flags.toInt())

public actual fun bluetoothGATTSetDescriptorValue(hdevice: Handle, descriptor: COpaquePointer?, descriptorvalue: COpaquePointer?, flags: UInt): Hresult =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_bluetoothGATTSetDescriptorValue((hdevice?.value ?: 0L), (descriptor?.value ?: 0L), (descriptorvalue?.value ?: 0L), flags.toInt())

public actual fun bluetoothGATTUnregisterEvent(eventhandle: Long, flags: UInt): Hresult =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_bluetoothGATTUnregisterEvent(eventhandle, flags.toInt())

public actual fun bluetoothGetDeviceInfo(hradio: Handle, pbtdi: COpaquePointer?): UInt =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_bluetoothGetDeviceInfo((hradio?.value ?: 0L), (pbtdi?.value ?: 0L)).toUInt()

public actual fun bluetoothGetRadioInfo(hradio: Handle, pradioinfo: COpaquePointer?): UInt =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_bluetoothGetRadioInfo((hradio?.value ?: 0L), (pradioinfo?.value ?: 0L)).toUInt()

public actual fun bluetoothIsConnectable(hradio: Handle): Bool =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_bluetoothIsConnectable((hradio?.value ?: 0L))

public actual fun bluetoothIsDiscoverable(hradio: Handle): Bool =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_bluetoothIsDiscoverable((hradio?.value ?: 0L))

public actual fun bluetoothIsVersionAvailable(majorversion: UByte, minorversion: UByte): Bool =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_bluetoothIsVersionAvailable(majorversion.toByte(), minorversion.toByte())

public actual fun bluetoothRegisterForAuthentication(pbtdi: COpaquePointer?, phreghandle: COpaquePointer?, pfncallback: PfnAuthenticationCallback, pvparam: COpaquePointer?): UInt =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_bluetoothRegisterForAuthentication((pbtdi?.value ?: 0L), (phreghandle?.value ?: 0L), 0L, (pvparam?.value ?: 0L)).toUInt()

public actual fun bluetoothRegisterForAuthenticationEx(pbtdiin: COpaquePointer?, phreghandleout: COpaquePointer?, pfncallbackin: PfnAuthenticationCallbackEx, pvparam: COpaquePointer?): UInt =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_bluetoothRegisterForAuthenticationEx((pbtdiin?.value ?: 0L), (phreghandleout?.value ?: 0L), 0L, (pvparam?.value ?: 0L)).toUInt()

public actual fun bluetoothRemoveDevice(paddress: COpaquePointer?): UInt =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_bluetoothRemoveDevice((paddress?.value ?: 0L)).toUInt()

public actual fun bluetoothSdpEnumAttributes(psdpstream: COpaquePointer?, cbstreamsize: UInt, pfncallback: PfnBluetoothEnumAttributesCallback, pvparam: COpaquePointer?): Bool =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_bluetoothSdpEnumAttributes((psdpstream?.value ?: 0L), cbstreamsize.toInt(), 0L, (pvparam?.value ?: 0L))

public actual fun bluetoothSdpGetAttributeValue(precordstream: COpaquePointer?, cbrecordlength: UInt, usattributeid: UShort, pattributedata: COpaquePointer?): UInt =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_bluetoothSdpGetAttributeValue((precordstream?.value ?: 0L), cbrecordlength.toInt(), usattributeid.toShort(), (pattributedata?.value ?: 0L)).toUInt()

public actual fun bluetoothSdpGetContainerElementData(pcontainerstream: COpaquePointer?, cbcontainerlength: UInt, pelement: COpaquePointer?, pdata: COpaquePointer?): UInt =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_bluetoothSdpGetContainerElementData((pcontainerstream?.value ?: 0L), cbcontainerlength.toInt(), (pelement?.value ?: 0L), (pdata?.value ?: 0L)).toUInt()

public actual fun bluetoothSdpGetElementData(psdpstream: COpaquePointer?, cbsdpstreamlength: UInt, pdata: COpaquePointer?): UInt =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_bluetoothSdpGetElementData((psdpstream?.value ?: 0L), cbsdpstreamlength.toInt(), (pdata?.value ?: 0L)).toUInt()

public actual fun bluetoothSdpGetString(precordstream: COpaquePointer?, cbrecordlength: UInt, pstringdata: COpaquePointer?, usstringoffset: UShort, pszstring: Pwstr, pcchstringlength: COpaquePointer?): UInt =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_bluetoothSdpGetString((precordstream?.value ?: 0L), cbrecordlength.toInt(), (pstringdata?.value ?: 0L), usstringoffset.toShort(), (pszstring?.value ?: 0L), (pcchstringlength?.value ?: 0L)).toUInt()

public actual fun bluetoothSelectDevices(pbtsdp: COpaquePointer?): Bool =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_bluetoothSelectDevices((pbtsdp?.value ?: 0L))

public actual fun bluetoothSelectDevicesFree(pbtsdp: COpaquePointer?): Bool =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_bluetoothSelectDevicesFree((pbtsdp?.value ?: 0L))

public actual fun bluetoothSendAuthenticationResponse(hradio: Handle, pbtdi: COpaquePointer?, pszpasskey: Pcwstr): UInt =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_bluetoothSendAuthenticationResponse((hradio?.value ?: 0L), (pbtdi?.value ?: 0L), (pszpasskey?.value ?: 0L)).toUInt()

public actual fun bluetoothSendAuthenticationResponseEx(hradioin: Handle, pauthresponse: COpaquePointer?): UInt =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_bluetoothSendAuthenticationResponseEx((hradioin?.value ?: 0L), (pauthresponse?.value ?: 0L)).toUInt()

public actual fun bluetoothSetLocalServiceInfo(hradioin: Handle, pclassguid: COpaquePointer?, ulinstance: UInt, pserviceinfoin: COpaquePointer?): UInt =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_bluetoothSetLocalServiceInfo((hradioin?.value ?: 0L), (pclassguid?.value ?: 0L), ulinstance.toInt(), (pserviceinfoin?.value ?: 0L)).toUInt()

public actual fun bluetoothSetServiceState(hradio: Handle, pbtdi: COpaquePointer?, pguidservice: COpaquePointer?, dwserviceflags: UInt): UInt =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_bluetoothSetServiceState((hradio?.value ?: 0L), (pbtdi?.value ?: 0L), (pguidservice?.value ?: 0L), dwserviceflags.toInt()).toUInt()

public actual fun bluetoothUnregisterAuthentication(hreghandle: Long): Bool =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_bluetoothUnregisterAuthentication(hreghandle)

public actual fun bluetoothUpdateDeviceRecord(pbtdi: COpaquePointer?): UInt =
    WindowsWin32DevicesBluetoothJniBridge.windowssys_windows_win32_devices_bluetooth_bluetoothUpdateDeviceRecord((pbtdi?.value ?: 0L)).toUInt()
