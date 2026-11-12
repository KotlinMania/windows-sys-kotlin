@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun bluetoothAuthenticateDevice(hwndparent: Hwnd, hradio: Handle, pbtbi: MutPtr, pszpasskey: Pcwstr, ulpasskeylength: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBluetoothBluetoothAuthenticateDevice")

public actual fun bluetoothAuthenticateDeviceEx(hwndparentin: Hwnd, hradioin: Handle, pbtdiinout: MutPtr, pbtoobdata: ConstPtr, authenticationrequirement: AuthenticationRequirements): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBluetoothBluetoothAuthenticateDeviceEx")

public actual fun bluetoothAuthenticateMultipleDevices(hwndparent: Hwnd, hradio: Handle, cdevices: UInt, rgbtdi: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBluetoothBluetoothAuthenticateMultipleDevices")

public actual fun bluetoothDisplayDeviceProperties(hwndparent: Hwnd, pbtdi: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBluetoothBluetoothDisplayDeviceProperties")

public actual fun bluetoothEnableDiscovery(hradio: Handle, fenabled: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBluetoothBluetoothEnableDiscovery")

public actual fun bluetoothEnableIncomingConnections(hradio: Handle, fenabled: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBluetoothBluetoothEnableIncomingConnections")

public actual fun bluetoothEnumerateInstalledServices(hradio: Handle, pbtdi: ConstPtr, pcserviceinout: MutPtr, pguidservices: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBluetoothBluetoothEnumerateInstalledServices")

public actual fun bluetoothFindDeviceClose(hfind: HbluetoothDeviceFind): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBluetoothBluetoothFindDeviceClose")

public actual fun bluetoothFindFirstDevice(pbtsp: ConstPtr, pbtdi: MutPtr): HbluetoothDeviceFind =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBluetoothBluetoothFindFirstDevice")

public actual fun bluetoothFindFirstRadio(pbtfrp: ConstPtr, phradio: MutPtr): HbluetoothRadioFind =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBluetoothBluetoothFindFirstRadio")

public actual fun bluetoothFindNextDevice(hfind: HbluetoothDeviceFind, pbtdi: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBluetoothBluetoothFindNextDevice")

public actual fun bluetoothFindNextRadio(hfind: HbluetoothRadioFind, phradio: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBluetoothBluetoothFindNextRadio")

public actual fun bluetoothFindRadioClose(hfind: HbluetoothRadioFind): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBluetoothBluetoothFindRadioClose")

public actual fun bluetoothGATTAbortReliableWrite(hdevice: Handle, reliablewritecontext: ULong, flags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBluetoothBluetoothGATTAbortReliableWrite")

public actual fun bluetoothGATTBeginReliableWrite(hdevice: Handle, reliablewritecontext: MutPtr, flags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBluetoothBluetoothGATTBeginReliableWrite")

public actual fun bluetoothGATTEndReliableWrite(hdevice: Handle, reliablewritecontext: ULong, flags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBluetoothBluetoothGATTEndReliableWrite")

public actual fun bluetoothGATTGetCharacteristicValue(hdevice: Handle, characteristic: ConstPtr, characteristicvaluedatasize: UInt, characteristicvalue: MutPtr, characteristicvaluesizerequired: MutPtr, flags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBluetoothBluetoothGATTGetCharacteristicValue")

public actual fun bluetoothGATTGetCharacteristics(hdevice: Handle, service: ConstPtr, characteristicsbuffercount: UShort, characteristicsbuffer: MutPtr, characteristicsbufferactual: MutPtr, flags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBluetoothBluetoothGATTGetCharacteristics")

public actual fun bluetoothGATTGetDescriptorValue(hdevice: Handle, descriptor: ConstPtr, descriptorvaluedatasize: UInt, descriptorvalue: MutPtr, descriptorvaluesizerequired: MutPtr, flags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBluetoothBluetoothGATTGetDescriptorValue")

public actual fun bluetoothGATTGetDescriptors(hdevice: Handle, characteristic: ConstPtr, descriptorsbuffercount: UShort, descriptorsbuffer: MutPtr, descriptorsbufferactual: MutPtr, flags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBluetoothBluetoothGATTGetDescriptors")

public actual fun bluetoothGATTGetIncludedServices(hdevice: Handle, parentservice: ConstPtr, includedservicesbuffercount: UShort, includedservicesbuffer: MutPtr, includedservicesbufferactual: MutPtr, flags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBluetoothBluetoothGATTGetIncludedServices")

public actual fun bluetoothGATTGetServices(hdevice: Handle, servicesbuffercount: UShort, servicesbuffer: MutPtr, servicesbufferactual: MutPtr, flags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBluetoothBluetoothGATTGetServices")

public actual fun bluetoothGATTRegisterEvent(hservice: Handle, eventtype: BthLeGattEventType, eventparameterin: ConstPtr, callback: PfnbluetoothGattEventCallback, callbackcontext: ConstPtr, peventhandle: MutPtr, flags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBluetoothBluetoothGATTRegisterEvent")

public actual fun bluetoothGATTSetCharacteristicValue(hdevice: Handle, characteristic: ConstPtr, characteristicvalue: ConstPtr, reliablewritecontext: ULong, flags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBluetoothBluetoothGATTSetCharacteristicValue")

public actual fun bluetoothGATTSetDescriptorValue(hdevice: Handle, descriptor: ConstPtr, descriptorvalue: ConstPtr, flags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBluetoothBluetoothGATTSetDescriptorValue")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesBluetoothBluetoothGATTUnregisterEvent")
private external fun wasiWindowssysWindowsWin32DevicesBluetoothBluetoothGATTUnregisterEvent(eventhandle: Long, flags: Int): Int

public actual fun bluetoothGATTUnregisterEvent(eventhandle: Long, flags: UInt): Hresult =
    wasiWindowssysWindowsWin32DevicesBluetoothBluetoothGATTUnregisterEvent(eventhandle, flags.toInt())

public actual fun bluetoothGetDeviceInfo(hradio: Handle, pbtdi: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBluetoothBluetoothGetDeviceInfo")

public actual fun bluetoothGetRadioInfo(hradio: Handle, pradioinfo: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBluetoothBluetoothGetRadioInfo")

public actual fun bluetoothIsConnectable(hradio: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBluetoothBluetoothIsConnectable")

public actual fun bluetoothIsDiscoverable(hradio: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBluetoothBluetoothIsDiscoverable")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesBluetoothBluetoothIsVersionAvailable")
private external fun wasiWindowssysWindowsWin32DevicesBluetoothBluetoothIsVersionAvailable(majorversion: Int, minorversion: Int): Int

public actual fun bluetoothIsVersionAvailable(majorversion: UByte, minorversion: UByte): Bool =
    wasiWindowssysWindowsWin32DevicesBluetoothBluetoothIsVersionAvailable(majorversion.toInt(), minorversion.toInt())

public actual fun bluetoothRegisterForAuthentication(pbtdi: ConstPtr, phreghandle: MutPtr, pfncallback: PfnAuthenticationCallback, pvparam: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBluetoothBluetoothRegisterForAuthentication")

public actual fun bluetoothRegisterForAuthenticationEx(pbtdiin: ConstPtr, phreghandleout: MutPtr, pfncallbackin: PfnAuthenticationCallbackEx, pvparam: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBluetoothBluetoothRegisterForAuthenticationEx")

public actual fun bluetoothRemoveDevice(paddress: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBluetoothBluetoothRemoveDevice")

public actual fun bluetoothSdpEnumAttributes(psdpstream: ConstPtr, cbstreamsize: UInt, pfncallback: PfnBluetoothEnumAttributesCallback, pvparam: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBluetoothBluetoothSdpEnumAttributes")

public actual fun bluetoothSdpGetAttributeValue(precordstream: ConstPtr, cbrecordlength: UInt, usattributeid: UShort, pattributedata: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBluetoothBluetoothSdpGetAttributeValue")

public actual fun bluetoothSdpGetContainerElementData(pcontainerstream: ConstPtr, cbcontainerlength: UInt, pelement: MutPtr, pdata: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBluetoothBluetoothSdpGetContainerElementData")

public actual fun bluetoothSdpGetElementData(psdpstream: ConstPtr, cbsdpstreamlength: UInt, pdata: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBluetoothBluetoothSdpGetElementData")

public actual fun bluetoothSdpGetString(precordstream: ConstPtr, cbrecordlength: UInt, pstringdata: ConstPtr, usstringoffset: UShort, pszstring: Pwstr, pcchstringlength: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBluetoothBluetoothSdpGetString")

public actual fun bluetoothSelectDevices(pbtsdp: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBluetoothBluetoothSelectDevices")

public actual fun bluetoothSelectDevicesFree(pbtsdp: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBluetoothBluetoothSelectDevicesFree")

public actual fun bluetoothSendAuthenticationResponse(hradio: Handle, pbtdi: ConstPtr, pszpasskey: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBluetoothBluetoothSendAuthenticationResponse")

public actual fun bluetoothSendAuthenticationResponseEx(hradioin: Handle, pauthresponse: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBluetoothBluetoothSendAuthenticationResponseEx")

public actual fun bluetoothSetLocalServiceInfo(hradioin: Handle, pclassguid: ConstPtr, ulinstance: UInt, pserviceinfoin: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBluetoothBluetoothSetLocalServiceInfo")

public actual fun bluetoothSetServiceState(hradio: Handle, pbtdi: ConstPtr, pguidservice: ConstPtr, dwserviceflags: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBluetoothBluetoothSetServiceState")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesBluetoothBluetoothUnregisterAuthentication")
private external fun wasiWindowssysWindowsWin32DevicesBluetoothBluetoothUnregisterAuthentication(hreghandle: Long): Int

public actual fun bluetoothUnregisterAuthentication(hreghandle: Long): Bool =
    wasiWindowssysWindowsWin32DevicesBluetoothBluetoothUnregisterAuthentication(hreghandle)

public actual fun bluetoothUpdateDeviceRecord(pbtdi: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesBluetoothBluetoothUpdateDeviceRecord")
