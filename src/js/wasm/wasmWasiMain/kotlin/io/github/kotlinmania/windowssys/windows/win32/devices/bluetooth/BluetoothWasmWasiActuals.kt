@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

public actual fun bluetoothAuthenticateDevice(hwndparent: Hwnd, hradio: Handle, pbtbi: COpaquePointer?, pszpasskey: Pcwstr, ulpasskeylength: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bluetoothAuthenticateDeviceEx(hwndparentin: Hwnd, hradioin: Handle, pbtdiinout: COpaquePointer?, pbtoobdata: COpaquePointer?, authenticationrequirement: AuthenticationRequirements): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bluetoothAuthenticateMultipleDevices(hwndparent: Hwnd, hradio: Handle, cdevices: UInt, rgbtdi: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bluetoothDisplayDeviceProperties(hwndparent: Hwnd, pbtdi: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bluetoothEnableDiscovery(hradio: Handle, fenabled: Bool): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bluetoothEnableIncomingConnections(hradio: Handle, fenabled: Bool): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bluetoothEnumerateInstalledServices(hradio: Handle, pbtdi: COpaquePointer?, pcserviceinout: COpaquePointer?, pguidservices: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bluetoothFindDeviceClose(hfind: HbluetoothDeviceFind): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bluetoothFindFirstDevice(pbtsp: COpaquePointer?, pbtdi: COpaquePointer?): HbluetoothDeviceFind =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bluetoothFindFirstRadio(pbtfrp: COpaquePointer?, phradio: COpaquePointer?): HbluetoothRadioFind =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bluetoothFindNextDevice(hfind: HbluetoothDeviceFind, pbtdi: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bluetoothFindNextRadio(hfind: HbluetoothRadioFind, phradio: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bluetoothFindRadioClose(hfind: HbluetoothRadioFind): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bluetoothGATTAbortReliableWrite(hdevice: Handle, reliablewritecontext: ULong, flags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bluetoothGATTBeginReliableWrite(hdevice: Handle, reliablewritecontext: COpaquePointer?, flags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bluetoothGATTEndReliableWrite(hdevice: Handle, reliablewritecontext: ULong, flags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bluetoothGATTGetCharacteristicValue(hdevice: Handle, characteristic: COpaquePointer?, characteristicvaluedatasize: UInt, characteristicvalue: COpaquePointer?, characteristicvaluesizerequired: COpaquePointer?, flags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bluetoothGATTGetCharacteristics(hdevice: Handle, service: COpaquePointer?, characteristicsbuffercount: UShort, characteristicsbuffer: COpaquePointer?, characteristicsbufferactual: COpaquePointer?, flags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bluetoothGATTGetDescriptorValue(hdevice: Handle, descriptor: COpaquePointer?, descriptorvaluedatasize: UInt, descriptorvalue: COpaquePointer?, descriptorvaluesizerequired: COpaquePointer?, flags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bluetoothGATTGetDescriptors(hdevice: Handle, characteristic: COpaquePointer?, descriptorsbuffercount: UShort, descriptorsbuffer: COpaquePointer?, descriptorsbufferactual: COpaquePointer?, flags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bluetoothGATTGetIncludedServices(hdevice: Handle, parentservice: COpaquePointer?, includedservicesbuffercount: UShort, includedservicesbuffer: COpaquePointer?, includedservicesbufferactual: COpaquePointer?, flags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bluetoothGATTGetServices(hdevice: Handle, servicesbuffercount: UShort, servicesbuffer: COpaquePointer?, servicesbufferactual: COpaquePointer?, flags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bluetoothGATTRegisterEvent(hservice: Handle, eventtype: BthLeGattEventType, eventparameterin: COpaquePointer?, callback: PfnbluetoothGattEventCallback, callbackcontext: COpaquePointer?, peventhandle: COpaquePointer?, flags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bluetoothGATTSetCharacteristicValue(hdevice: Handle, characteristic: COpaquePointer?, characteristicvalue: COpaquePointer?, reliablewritecontext: ULong, flags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bluetoothGATTSetDescriptorValue(hdevice: Handle, descriptor: COpaquePointer?, descriptorvalue: COpaquePointer?, flags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bluetoothGATTUnregisterEvent(eventhandle: Long, flags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bluetoothGetDeviceInfo(hradio: Handle, pbtdi: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bluetoothGetRadioInfo(hradio: Handle, pradioinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bluetoothIsConnectable(hradio: Handle): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bluetoothIsDiscoverable(hradio: Handle): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bluetoothIsVersionAvailable(majorversion: UByte, minorversion: UByte): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bluetoothRegisterForAuthentication(pbtdi: COpaquePointer?, phreghandle: COpaquePointer?, pfncallback: PfnAuthenticationCallback, pvparam: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bluetoothRegisterForAuthenticationEx(pbtdiin: COpaquePointer?, phreghandleout: COpaquePointer?, pfncallbackin: PfnAuthenticationCallbackEx, pvparam: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bluetoothRemoveDevice(paddress: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bluetoothSdpEnumAttributes(psdpstream: COpaquePointer?, cbstreamsize: UInt, pfncallback: PfnBluetoothEnumAttributesCallback, pvparam: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bluetoothSdpGetAttributeValue(precordstream: COpaquePointer?, cbrecordlength: UInt, usattributeid: UShort, pattributedata: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bluetoothSdpGetContainerElementData(pcontainerstream: COpaquePointer?, cbcontainerlength: UInt, pelement: COpaquePointer?, pdata: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bluetoothSdpGetElementData(psdpstream: COpaquePointer?, cbsdpstreamlength: UInt, pdata: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bluetoothSdpGetString(precordstream: COpaquePointer?, cbrecordlength: UInt, pstringdata: COpaquePointer?, usstringoffset: UShort, pszstring: Pwstr, pcchstringlength: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bluetoothSelectDevices(pbtsdp: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bluetoothSelectDevicesFree(pbtsdp: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bluetoothSendAuthenticationResponse(hradio: Handle, pbtdi: COpaquePointer?, pszpasskey: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bluetoothSendAuthenticationResponseEx(hradioin: Handle, pauthresponse: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bluetoothSetLocalServiceInfo(hradioin: Handle, pclassguid: COpaquePointer?, ulinstance: UInt, pserviceinfoin: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bluetoothSetServiceState(hradio: Handle, pbtdi: COpaquePointer?, pguidservice: COpaquePointer?, dwserviceflags: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bluetoothUnregisterAuthentication(hreghandle: Long): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bluetoothUpdateDeviceRecord(pbtdi: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
