@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun bluetoothAuthenticateDevice(hwndparent: Hwnd, hradio: Handle, pbtbi: COpaquePointer?, pszpasskey: Pcwstr, ulpasskeylength: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_bluetoothAuthenticateDevice(hwndparent?.value?.toCPointer<ByteVar>(), hradio?.value?.toCPointer<ByteVar>(), pbtbi?.value?.toCPointer<ByteVar>(), pszpasskey?.value?.toCPointer<ByteVar>(), ulpasskeylength)

public actual fun bluetoothAuthenticateDeviceEx(hwndparentin: Hwnd, hradioin: Handle, pbtdiinout: COpaquePointer?, pbtoobdata: COpaquePointer?, authenticationrequirement: AuthenticationRequirements): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_bluetoothAuthenticateDeviceEx(hwndparentin?.value?.toCPointer<ByteVar>(), hradioin?.value?.toCPointer<ByteVar>(), pbtdiinout?.value?.toCPointer<ByteVar>(), pbtoobdata?.value?.toCPointer<ByteVar>(), authenticationrequirement)

public actual fun bluetoothAuthenticateMultipleDevices(hwndparent: Hwnd, hradio: Handle, cdevices: UInt, rgbtdi: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_bluetoothAuthenticateMultipleDevices(hwndparent?.value?.toCPointer<ByteVar>(), hradio?.value?.toCPointer<ByteVar>(), cdevices, rgbtdi?.value?.toCPointer<ByteVar>())

public actual fun bluetoothDisplayDeviceProperties(hwndparent: Hwnd, pbtdi: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_bluetoothDisplayDeviceProperties(hwndparent?.value?.toCPointer<ByteVar>(), pbtdi?.value?.toCPointer<ByteVar>())

public actual fun bluetoothEnableDiscovery(hradio: Handle, fenabled: Bool): Bool =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_bluetoothEnableDiscovery(hradio?.value?.toCPointer<ByteVar>(), fenabled)

public actual fun bluetoothEnableIncomingConnections(hradio: Handle, fenabled: Bool): Bool =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_bluetoothEnableIncomingConnections(hradio?.value?.toCPointer<ByteVar>(), fenabled)

public actual fun bluetoothEnumerateInstalledServices(hradio: Handle, pbtdi: COpaquePointer?, pcserviceinout: COpaquePointer?, pguidservices: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_bluetoothEnumerateInstalledServices(hradio?.value?.toCPointer<ByteVar>(), pbtdi?.value?.toCPointer<ByteVar>(), pcserviceinout?.value?.toCPointer<ByteVar>(), pguidservices?.value?.toCPointer<ByteVar>())

public actual fun bluetoothFindDeviceClose(hfind: HbluetoothDeviceFind): Bool =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_bluetoothFindDeviceClose(hfind?.value?.toCPointer<ByteVar>())

public actual fun bluetoothFindFirstDevice(pbtsp: COpaquePointer?, pbtdi: COpaquePointer?): HbluetoothDeviceFind =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_bluetoothFindFirstDevice(pbtsp?.value?.toCPointer<ByteVar>(), pbtdi?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun bluetoothFindFirstRadio(pbtfrp: COpaquePointer?, phradio: COpaquePointer?): HbluetoothRadioFind =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_bluetoothFindFirstRadio(pbtfrp?.value?.toCPointer<ByteVar>(), phradio?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun bluetoothFindNextDevice(hfind: HbluetoothDeviceFind, pbtdi: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_bluetoothFindNextDevice(hfind?.value?.toCPointer<ByteVar>(), pbtdi?.value?.toCPointer<ByteVar>())

public actual fun bluetoothFindNextRadio(hfind: HbluetoothRadioFind, phradio: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_bluetoothFindNextRadio(hfind?.value?.toCPointer<ByteVar>(), phradio?.value?.toCPointer<ByteVar>())

public actual fun bluetoothFindRadioClose(hfind: HbluetoothRadioFind): Bool =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_bluetoothFindRadioClose(hfind?.value?.toCPointer<ByteVar>())

public actual fun bluetoothGATTAbortReliableWrite(hdevice: Handle, reliablewritecontext: ULong, flags: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_bluetoothGATTAbortReliableWrite(hdevice?.value?.toCPointer<ByteVar>(), reliablewritecontext, flags)

public actual fun bluetoothGATTBeginReliableWrite(hdevice: Handle, reliablewritecontext: COpaquePointer?, flags: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_bluetoothGATTBeginReliableWrite(hdevice?.value?.toCPointer<ByteVar>(), reliablewritecontext?.value?.toCPointer<ByteVar>(), flags)

public actual fun bluetoothGATTEndReliableWrite(hdevice: Handle, reliablewritecontext: ULong, flags: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_bluetoothGATTEndReliableWrite(hdevice?.value?.toCPointer<ByteVar>(), reliablewritecontext, flags)

public actual fun bluetoothGATTGetCharacteristicValue(hdevice: Handle, characteristic: COpaquePointer?, characteristicvaluedatasize: UInt, characteristicvalue: COpaquePointer?, characteristicvaluesizerequired: COpaquePointer?, flags: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_bluetoothGATTGetCharacteristicValue(hdevice?.value?.toCPointer<ByteVar>(), characteristic?.value?.toCPointer<ByteVar>(), characteristicvaluedatasize, characteristicvalue?.value?.toCPointer<ByteVar>(), characteristicvaluesizerequired?.value?.toCPointer<ByteVar>(), flags)

public actual fun bluetoothGATTGetCharacteristics(hdevice: Handle, service: COpaquePointer?, characteristicsbuffercount: UShort, characteristicsbuffer: COpaquePointer?, characteristicsbufferactual: COpaquePointer?, flags: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_bluetoothGATTGetCharacteristics(hdevice?.value?.toCPointer<ByteVar>(), service?.value?.toCPointer<ByteVar>(), characteristicsbuffercount, characteristicsbuffer?.value?.toCPointer<ByteVar>(), characteristicsbufferactual?.value?.toCPointer<ByteVar>(), flags)

public actual fun bluetoothGATTGetDescriptorValue(hdevice: Handle, descriptor: COpaquePointer?, descriptorvaluedatasize: UInt, descriptorvalue: COpaquePointer?, descriptorvaluesizerequired: COpaquePointer?, flags: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_bluetoothGATTGetDescriptorValue(hdevice?.value?.toCPointer<ByteVar>(), descriptor?.value?.toCPointer<ByteVar>(), descriptorvaluedatasize, descriptorvalue?.value?.toCPointer<ByteVar>(), descriptorvaluesizerequired?.value?.toCPointer<ByteVar>(), flags)

public actual fun bluetoothGATTGetDescriptors(hdevice: Handle, characteristic: COpaquePointer?, descriptorsbuffercount: UShort, descriptorsbuffer: COpaquePointer?, descriptorsbufferactual: COpaquePointer?, flags: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_bluetoothGATTGetDescriptors(hdevice?.value?.toCPointer<ByteVar>(), characteristic?.value?.toCPointer<ByteVar>(), descriptorsbuffercount, descriptorsbuffer?.value?.toCPointer<ByteVar>(), descriptorsbufferactual?.value?.toCPointer<ByteVar>(), flags)

public actual fun bluetoothGATTGetIncludedServices(hdevice: Handle, parentservice: COpaquePointer?, includedservicesbuffercount: UShort, includedservicesbuffer: COpaquePointer?, includedservicesbufferactual: COpaquePointer?, flags: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_bluetoothGATTGetIncludedServices(hdevice?.value?.toCPointer<ByteVar>(), parentservice?.value?.toCPointer<ByteVar>(), includedservicesbuffercount, includedservicesbuffer?.value?.toCPointer<ByteVar>(), includedservicesbufferactual?.value?.toCPointer<ByteVar>(), flags)

public actual fun bluetoothGATTGetServices(hdevice: Handle, servicesbuffercount: UShort, servicesbuffer: COpaquePointer?, servicesbufferactual: COpaquePointer?, flags: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_bluetoothGATTGetServices(hdevice?.value?.toCPointer<ByteVar>(), servicesbuffercount, servicesbuffer?.value?.toCPointer<ByteVar>(), servicesbufferactual?.value?.toCPointer<ByteVar>(), flags)

public actual fun bluetoothGATTRegisterEvent(hservice: Handle, eventtype: BthLeGattEventType, eventparameterin: COpaquePointer?, callback: PfnbluetoothGattEventCallback, callbackcontext: COpaquePointer?, peventhandle: COpaquePointer?, flags: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_bluetoothGATTRegisterEvent(hservice?.value?.toCPointer<ByteVar>(), eventtype, eventparameterin?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), callbackcontext?.value?.toCPointer<ByteVar>(), peventhandle?.value?.toCPointer<ByteVar>(), flags)

public actual fun bluetoothGATTSetCharacteristicValue(hdevice: Handle, characteristic: COpaquePointer?, characteristicvalue: COpaquePointer?, reliablewritecontext: ULong, flags: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_bluetoothGATTSetCharacteristicValue(hdevice?.value?.toCPointer<ByteVar>(), characteristic?.value?.toCPointer<ByteVar>(), characteristicvalue?.value?.toCPointer<ByteVar>(), reliablewritecontext, flags)

public actual fun bluetoothGATTSetDescriptorValue(hdevice: Handle, descriptor: COpaquePointer?, descriptorvalue: COpaquePointer?, flags: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_bluetoothGATTSetDescriptorValue(hdevice?.value?.toCPointer<ByteVar>(), descriptor?.value?.toCPointer<ByteVar>(), descriptorvalue?.value?.toCPointer<ByteVar>(), flags)

public actual fun bluetoothGATTUnregisterEvent(eventhandle: Long, flags: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_bluetoothGATTUnregisterEvent(eventhandle, flags)

public actual fun bluetoothGetDeviceInfo(hradio: Handle, pbtdi: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_bluetoothGetDeviceInfo(hradio?.value?.toCPointer<ByteVar>(), pbtdi?.value?.toCPointer<ByteVar>())

public actual fun bluetoothGetRadioInfo(hradio: Handle, pradioinfo: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_bluetoothGetRadioInfo(hradio?.value?.toCPointer<ByteVar>(), pradioinfo?.value?.toCPointer<ByteVar>())

public actual fun bluetoothIsConnectable(hradio: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_bluetoothIsConnectable(hradio?.value?.toCPointer<ByteVar>())

public actual fun bluetoothIsDiscoverable(hradio: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_bluetoothIsDiscoverable(hradio?.value?.toCPointer<ByteVar>())

public actual fun bluetoothIsVersionAvailable(majorversion: UByte, minorversion: UByte): Bool =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_bluetoothIsVersionAvailable(majorversion, minorversion)

public actual fun bluetoothRegisterForAuthentication(pbtdi: COpaquePointer?, phreghandle: COpaquePointer?, pfncallback: PfnAuthenticationCallback, pvparam: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_bluetoothRegisterForAuthentication(pbtdi?.value?.toCPointer<ByteVar>(), phreghandle?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), pvparam?.value?.toCPointer<ByteVar>())

public actual fun bluetoothRegisterForAuthenticationEx(pbtdiin: COpaquePointer?, phreghandleout: COpaquePointer?, pfncallbackin: PfnAuthenticationCallbackEx, pvparam: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_bluetoothRegisterForAuthenticationEx(pbtdiin?.value?.toCPointer<ByteVar>(), phreghandleout?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), pvparam?.value?.toCPointer<ByteVar>())

public actual fun bluetoothRemoveDevice(paddress: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_bluetoothRemoveDevice(paddress?.value?.toCPointer<ByteVar>())

public actual fun bluetoothSdpEnumAttributes(psdpstream: COpaquePointer?, cbstreamsize: UInt, pfncallback: PfnBluetoothEnumAttributesCallback, pvparam: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_bluetoothSdpEnumAttributes(psdpstream?.value?.toCPointer<ByteVar>(), cbstreamsize, 0L.toCPointer<ByteVar>(), pvparam?.value?.toCPointer<ByteVar>())

public actual fun bluetoothSdpGetAttributeValue(precordstream: COpaquePointer?, cbrecordlength: UInt, usattributeid: UShort, pattributedata: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_bluetoothSdpGetAttributeValue(precordstream?.value?.toCPointer<ByteVar>(), cbrecordlength, usattributeid, pattributedata?.value?.toCPointer<ByteVar>())

public actual fun bluetoothSdpGetContainerElementData(pcontainerstream: COpaquePointer?, cbcontainerlength: UInt, pelement: COpaquePointer?, pdata: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_bluetoothSdpGetContainerElementData(pcontainerstream?.value?.toCPointer<ByteVar>(), cbcontainerlength, pelement?.value?.toCPointer<ByteVar>(), pdata?.value?.toCPointer<ByteVar>())

public actual fun bluetoothSdpGetElementData(psdpstream: COpaquePointer?, cbsdpstreamlength: UInt, pdata: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_bluetoothSdpGetElementData(psdpstream?.value?.toCPointer<ByteVar>(), cbsdpstreamlength, pdata?.value?.toCPointer<ByteVar>())

public actual fun bluetoothSdpGetString(precordstream: COpaquePointer?, cbrecordlength: UInt, pstringdata: COpaquePointer?, usstringoffset: UShort, pszstring: Pwstr, pcchstringlength: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_bluetoothSdpGetString(precordstream?.value?.toCPointer<ByteVar>(), cbrecordlength, pstringdata?.value?.toCPointer<ByteVar>(), usstringoffset, pszstring?.value?.toCPointer<ByteVar>(), pcchstringlength?.value?.toCPointer<ByteVar>())

public actual fun bluetoothSelectDevices(pbtsdp: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_bluetoothSelectDevices(pbtsdp?.value?.toCPointer<ByteVar>())

public actual fun bluetoothSelectDevicesFree(pbtsdp: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_bluetoothSelectDevicesFree(pbtsdp?.value?.toCPointer<ByteVar>())

public actual fun bluetoothSendAuthenticationResponse(hradio: Handle, pbtdi: COpaquePointer?, pszpasskey: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_bluetoothSendAuthenticationResponse(hradio?.value?.toCPointer<ByteVar>(), pbtdi?.value?.toCPointer<ByteVar>(), pszpasskey?.value?.toCPointer<ByteVar>())

public actual fun bluetoothSendAuthenticationResponseEx(hradioin: Handle, pauthresponse: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_bluetoothSendAuthenticationResponseEx(hradioin?.value?.toCPointer<ByteVar>(), pauthresponse?.value?.toCPointer<ByteVar>())

public actual fun bluetoothSetLocalServiceInfo(hradioin: Handle, pclassguid: COpaquePointer?, ulinstance: UInt, pserviceinfoin: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_bluetoothSetLocalServiceInfo(hradioin?.value?.toCPointer<ByteVar>(), pclassguid?.value?.toCPointer<ByteVar>(), ulinstance, pserviceinfoin?.value?.toCPointer<ByteVar>())

public actual fun bluetoothSetServiceState(hradio: Handle, pbtdi: COpaquePointer?, pguidservice: COpaquePointer?, dwserviceflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_bluetoothSetServiceState(hradio?.value?.toCPointer<ByteVar>(), pbtdi?.value?.toCPointer<ByteVar>(), pguidservice?.value?.toCPointer<ByteVar>(), dwserviceflags)

public actual fun bluetoothUnregisterAuthentication(hreghandle: Long): Bool =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_bluetoothUnregisterAuthentication(hreghandle)

public actual fun bluetoothUpdateDeviceRecord(pbtdi: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssys_windows_win32_devices_bluetooth_bluetoothUpdateDeviceRecord(pbtdi?.value?.toCPointer<ByteVar>())
