package io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

public expect fun bluetoothAuthenticateDevice(hwndparent: Hwnd, hradio: Handle, pbtbi: MutPtr, pszpasskey: Pcwstr, ulpasskeylength: UInt): UInt

public expect fun bluetoothAuthenticateDeviceEx(hwndparentin: Hwnd, hradioin: Handle, pbtdiinout: MutPtr, pbtoobdata: ConstPtr, authenticationrequirement: AuthenticationRequirements): UInt

public expect fun bluetoothAuthenticateMultipleDevices(hwndparent: Hwnd, hradio: Handle, cdevices: UInt, rgbtdi: MutPtr): UInt

public expect fun bluetoothDisplayDeviceProperties(hwndparent: Hwnd, pbtdi: MutPtr): Bool

public expect fun bluetoothEnableDiscovery(hradio: Handle, fenabled: Bool): Bool

public expect fun bluetoothEnableIncomingConnections(hradio: Handle, fenabled: Bool): Bool

public expect fun bluetoothEnumerateInstalledServices(hradio: Handle, pbtdi: ConstPtr, pcserviceinout: MutPtr, pguidservices: MutPtr): UInt

public expect fun bluetoothFindDeviceClose(hfind: HbluetoothDeviceFind): Bool

public expect fun bluetoothFindFirstDevice(pbtsp: ConstPtr, pbtdi: MutPtr): HbluetoothDeviceFind

public expect fun bluetoothFindFirstRadio(pbtfrp: ConstPtr, phradio: MutPtr): HbluetoothRadioFind

public expect fun bluetoothFindNextDevice(hfind: HbluetoothDeviceFind, pbtdi: MutPtr): Bool

public expect fun bluetoothFindNextRadio(hfind: HbluetoothRadioFind, phradio: MutPtr): Bool

public expect fun bluetoothFindRadioClose(hfind: HbluetoothRadioFind): Bool

public expect fun bluetoothGATTAbortReliableWrite(hdevice: Handle, reliablewritecontext: ULong, flags: UInt): Hresult

public expect fun bluetoothGATTBeginReliableWrite(hdevice: Handle, reliablewritecontext: MutPtr, flags: UInt): Hresult

public expect fun bluetoothGATTEndReliableWrite(hdevice: Handle, reliablewritecontext: ULong, flags: UInt): Hresult

public expect fun bluetoothGATTGetCharacteristicValue(hdevice: Handle, characteristic: ConstPtr, characteristicvaluedatasize: UInt, characteristicvalue: MutPtr, characteristicvaluesizerequired: MutPtr, flags: UInt): Hresult

public expect fun bluetoothGATTGetCharacteristics(hdevice: Handle, service: ConstPtr, characteristicsbuffercount: UShort, characteristicsbuffer: MutPtr, characteristicsbufferactual: MutPtr, flags: UInt): Hresult

public expect fun bluetoothGATTGetDescriptorValue(hdevice: Handle, descriptor: ConstPtr, descriptorvaluedatasize: UInt, descriptorvalue: MutPtr, descriptorvaluesizerequired: MutPtr, flags: UInt): Hresult

public expect fun bluetoothGATTGetDescriptors(hdevice: Handle, characteristic: ConstPtr, descriptorsbuffercount: UShort, descriptorsbuffer: MutPtr, descriptorsbufferactual: MutPtr, flags: UInt): Hresult

public expect fun bluetoothGATTGetIncludedServices(hdevice: Handle, parentservice: ConstPtr, includedservicesbuffercount: UShort, includedservicesbuffer: MutPtr, includedservicesbufferactual: MutPtr, flags: UInt): Hresult

public expect fun bluetoothGATTGetServices(hdevice: Handle, servicesbuffercount: UShort, servicesbuffer: MutPtr, servicesbufferactual: MutPtr, flags: UInt): Hresult

public expect fun bluetoothGATTRegisterEvent(hservice: Handle, eventtype: BthLeGattEventType, eventparameterin: ConstPtr, callback: PfnbluetoothGattEventCallback, callbackcontext: ConstPtr, peventhandle: MutPtr, flags: UInt): Hresult

public expect fun bluetoothGATTSetCharacteristicValue(hdevice: Handle, characteristic: ConstPtr, characteristicvalue: ConstPtr, reliablewritecontext: ULong, flags: UInt): Hresult

public expect fun bluetoothGATTSetDescriptorValue(hdevice: Handle, descriptor: ConstPtr, descriptorvalue: ConstPtr, flags: UInt): Hresult

public expect fun bluetoothGATTUnregisterEvent(eventhandle: Long, flags: UInt): Hresult

public expect fun bluetoothGetDeviceInfo(hradio: Handle, pbtdi: MutPtr): UInt

public expect fun bluetoothGetRadioInfo(hradio: Handle, pradioinfo: MutPtr): UInt

public expect fun bluetoothIsConnectable(hradio: Handle): Bool

public expect fun bluetoothIsDiscoverable(hradio: Handle): Bool

public expect fun bluetoothIsVersionAvailable(majorversion: UByte, minorversion: UByte): Bool

public expect fun bluetoothRegisterForAuthentication(pbtdi: ConstPtr, phreghandle: MutPtr, pfncallback: PfnAuthenticationCallback, pvparam: ConstPtr): UInt

public expect fun bluetoothRegisterForAuthenticationEx(pbtdiin: ConstPtr, phreghandleout: MutPtr, pfncallbackin: PfnAuthenticationCallbackEx, pvparam: ConstPtr): UInt

public expect fun bluetoothRemoveDevice(paddress: ConstPtr): UInt

public expect fun bluetoothSdpEnumAttributes(psdpstream: ConstPtr, cbstreamsize: UInt, pfncallback: PfnBluetoothEnumAttributesCallback, pvparam: ConstPtr): Bool

public expect fun bluetoothSdpGetAttributeValue(precordstream: ConstPtr, cbrecordlength: UInt, usattributeid: UShort, pattributedata: MutPtr): UInt

public expect fun bluetoothSdpGetContainerElementData(pcontainerstream: ConstPtr, cbcontainerlength: UInt, pelement: MutPtr, pdata: MutPtr): UInt

public expect fun bluetoothSdpGetElementData(psdpstream: ConstPtr, cbsdpstreamlength: UInt, pdata: MutPtr): UInt

public expect fun bluetoothSdpGetString(precordstream: ConstPtr, cbrecordlength: UInt, pstringdata: ConstPtr, usstringoffset: UShort, pszstring: Pwstr, pcchstringlength: MutPtr): UInt

public expect fun bluetoothSelectDevices(pbtsdp: MutPtr): Bool

public expect fun bluetoothSelectDevicesFree(pbtsdp: MutPtr): Bool

public expect fun bluetoothSendAuthenticationResponse(hradio: Handle, pbtdi: ConstPtr, pszpasskey: Pcwstr): UInt

public expect fun bluetoothSendAuthenticationResponseEx(hradioin: Handle, pauthresponse: ConstPtr): UInt

public expect fun bluetoothSetLocalServiceInfo(hradioin: Handle, pclassguid: ConstPtr, ulinstance: UInt, pserviceinfoin: ConstPtr): UInt

public expect fun bluetoothSetServiceState(hradio: Handle, pbtdi: ConstPtr, pguidservice: ConstPtr, dwserviceflags: UInt): UInt

public expect fun bluetoothUnregisterAuthentication(hreghandle: Long): Bool

public expect fun bluetoothUpdateDeviceRecord(pbtdi: ConstPtr): UInt
