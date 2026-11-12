package io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

public expect fun bluetoothAuthenticateDevice(hwndparent: Hwnd, hradio: Handle, pbtbi: MutPtr<BluetoothDeviceInfo>, pszpasskey: Pcwstr, ulpasskeylength: UInt): UInt

public expect fun bluetoothAuthenticateDeviceEx(hwndparentin: Hwnd, hradioin: Handle, pbtdiinout: MutPtr<BluetoothDeviceInfo>, pbtoobdata: ConstPtr<BluetoothOobDataInfo>, authenticationrequirement: AuthenticationRequirements): UInt

public expect fun bluetoothAuthenticateMultipleDevices(hwndparent: Hwnd, hradio: Handle, cdevices: UInt, rgbtdi: MutPtr<BluetoothDeviceInfo>): UInt

public expect fun bluetoothDisplayDeviceProperties(hwndparent: Hwnd, pbtdi: MutPtr<BluetoothDeviceInfo>): Bool

public expect fun bluetoothEnableDiscovery(hradio: Handle, fenabled: Bool): Bool

public expect fun bluetoothEnableIncomingConnections(hradio: Handle, fenabled: Bool): Bool

public expect fun bluetoothEnumerateInstalledServices(hradio: Handle, pbtdi: ConstPtr<BluetoothDeviceInfo>, pcserviceinout: MutPtr<UInt>, pguidservices: MutPtr<Guid>): UInt

public expect fun bluetoothFindDeviceClose(hfind: HbluetoothDeviceFind): Bool

public expect fun bluetoothFindFirstDevice(pbtsp: ConstPtr<BluetoothDeviceSearchParams>, pbtdi: MutPtr<BluetoothDeviceInfo>): HbluetoothDeviceFind

public expect fun bluetoothFindFirstRadio(pbtfrp: ConstPtr<BluetoothFindRadioParams>, phradio: MutPtr<Handle>): HbluetoothRadioFind

public expect fun bluetoothFindNextDevice(hfind: HbluetoothDeviceFind, pbtdi: MutPtr<BluetoothDeviceInfo>): Bool

public expect fun bluetoothFindNextRadio(hfind: HbluetoothRadioFind, phradio: MutPtr<Handle>): Bool

public expect fun bluetoothFindRadioClose(hfind: HbluetoothRadioFind): Bool

public expect fun bluetoothGATTAbortReliableWrite(hdevice: Handle, reliablewritecontext: ULong, flags: UInt): Hresult

public expect fun bluetoothGATTBeginReliableWrite(hdevice: Handle, reliablewritecontext: MutPtr<ULong>, flags: UInt): Hresult

public expect fun bluetoothGATTEndReliableWrite(hdevice: Handle, reliablewritecontext: ULong, flags: UInt): Hresult

public expect fun bluetoothGATTGetCharacteristicValue(hdevice: Handle, characteristic: ConstPtr<BthLeGattCharacteristic>, characteristicvaluedatasize: UInt, characteristicvalue: MutPtr<BthLeGattCharacteristicValue>, characteristicvaluesizerequired: MutPtr<UShort>, flags: UInt): Hresult

public expect fun bluetoothGATTGetCharacteristics(hdevice: Handle, service: ConstPtr<BthLeGattService>, characteristicsbuffercount: UShort, characteristicsbuffer: MutPtr<BthLeGattCharacteristic>, characteristicsbufferactual: MutPtr<UShort>, flags: UInt): Hresult

public expect fun bluetoothGATTGetDescriptorValue(hdevice: Handle, descriptor: ConstPtr<BthLeGattDescriptor>, descriptorvaluedatasize: UInt, descriptorvalue: MutPtr<BthLeGattDescriptorValue>, descriptorvaluesizerequired: MutPtr<UShort>, flags: UInt): Hresult

public expect fun bluetoothGATTGetDescriptors(hdevice: Handle, characteristic: ConstPtr<BthLeGattCharacteristic>, descriptorsbuffercount: UShort, descriptorsbuffer: MutPtr<BthLeGattDescriptor>, descriptorsbufferactual: MutPtr<UShort>, flags: UInt): Hresult

public expect fun bluetoothGATTGetIncludedServices(hdevice: Handle, parentservice: ConstPtr<BthLeGattService>, includedservicesbuffercount: UShort, includedservicesbuffer: MutPtr<BthLeGattService>, includedservicesbufferactual: MutPtr<UShort>, flags: UInt): Hresult

public expect fun bluetoothGATTGetServices(hdevice: Handle, servicesbuffercount: UShort, servicesbuffer: MutPtr<BthLeGattService>, servicesbufferactual: MutPtr<UShort>, flags: UInt): Hresult

public expect fun bluetoothGATTRegisterEvent(hservice: Handle, eventtype: BthLeGattEventType, eventparameterin: ConstPtr<CVoid>, callback: PfnbluetoothGattEventCallback, callbackcontext: ConstPtr<CVoid>, peventhandle: MutPtr<Long>, flags: UInt): Hresult

public expect fun bluetoothGATTSetCharacteristicValue(hdevice: Handle, characteristic: ConstPtr<BthLeGattCharacteristic>, characteristicvalue: ConstPtr<BthLeGattCharacteristicValue>, reliablewritecontext: ULong, flags: UInt): Hresult

public expect fun bluetoothGATTSetDescriptorValue(hdevice: Handle, descriptor: ConstPtr<BthLeGattDescriptor>, descriptorvalue: ConstPtr<BthLeGattDescriptorValue>, flags: UInt): Hresult

public expect fun bluetoothGATTUnregisterEvent(eventhandle: Long, flags: UInt): Hresult

public expect fun bluetoothGetDeviceInfo(hradio: Handle, pbtdi: MutPtr<BluetoothDeviceInfo>): UInt

public expect fun bluetoothGetRadioInfo(hradio: Handle, pradioinfo: MutPtr<BluetoothRadioInfo>): UInt

public expect fun bluetoothIsConnectable(hradio: Handle): Bool

public expect fun bluetoothIsDiscoverable(hradio: Handle): Bool

public expect fun bluetoothIsVersionAvailable(majorversion: UByte, minorversion: UByte): Bool

public expect fun bluetoothRegisterForAuthentication(pbtdi: ConstPtr<BluetoothDeviceInfo>, phreghandle: MutPtr<Long>, pfncallback: PfnAuthenticationCallback, pvparam: ConstPtr<CVoid>): UInt

public expect fun bluetoothRegisterForAuthenticationEx(pbtdiin: ConstPtr<BluetoothDeviceInfo>, phreghandleout: MutPtr<Long>, pfncallbackin: PfnAuthenticationCallbackEx, pvparam: ConstPtr<CVoid>): UInt

public expect fun bluetoothRemoveDevice(paddress: ConstPtr<BluetoothAddress>): UInt

public expect fun bluetoothSdpEnumAttributes(psdpstream: ConstPtr<UByte>, cbstreamsize: UInt, pfncallback: PfnBluetoothEnumAttributesCallback, pvparam: ConstPtr<CVoid>): Bool

public expect fun bluetoothSdpGetAttributeValue(precordstream: ConstPtr<UByte>, cbrecordlength: UInt, usattributeid: UShort, pattributedata: MutPtr<SdpElementData>): UInt

public expect fun bluetoothSdpGetContainerElementData(pcontainerstream: ConstPtr<UByte>, cbcontainerlength: UInt, pelement: MutPtr<Long>, pdata: MutPtr<SdpElementData>): UInt

public expect fun bluetoothSdpGetElementData(psdpstream: ConstPtr<UByte>, cbsdpstreamlength: UInt, pdata: MutPtr<SdpElementData>): UInt

public expect fun bluetoothSdpGetString(precordstream: ConstPtr<UByte>, cbrecordlength: UInt, pstringdata: ConstPtr<SdpStringTypeData>, usstringoffset: UShort, pszstring: Pwstr, pcchstringlength: MutPtr<UInt>): UInt

public expect fun bluetoothSelectDevices(pbtsdp: MutPtr<BluetoothSelectDeviceParams>): Bool

public expect fun bluetoothSelectDevicesFree(pbtsdp: MutPtr<BluetoothSelectDeviceParams>): Bool

public expect fun bluetoothSendAuthenticationResponse(hradio: Handle, pbtdi: ConstPtr<BluetoothDeviceInfo>, pszpasskey: Pcwstr): UInt

public expect fun bluetoothSendAuthenticationResponseEx(hradioin: Handle, pauthresponse: ConstPtr<BluetoothAuthenticateResponse>): UInt

public expect fun bluetoothSetLocalServiceInfo(hradioin: Handle, pclassguid: ConstPtr<Guid>, ulinstance: UInt, pserviceinfoin: ConstPtr<BluetoothLocalServiceInfo>): UInt

public expect fun bluetoothSetServiceState(hradio: Handle, pbtdi: ConstPtr<BluetoothDeviceInfo>, pguidservice: ConstPtr<Guid>, dwserviceflags: UInt): UInt

public expect fun bluetoothUnregisterAuthentication(hreghandle: Long): Bool

public expect fun bluetoothUpdateDeviceRecord(pbtdi: ConstPtr<BluetoothDeviceInfo>): UInt
