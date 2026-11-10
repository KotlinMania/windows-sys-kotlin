package io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

public expect fun bluetoothAuthenticateDevice(hwndparent: Hwnd, hradio: Handle, pbtbi: COpaquePointer?, pszpasskey: Pcwstr, ulpasskeylength: UInt): UInt

public expect fun bluetoothAuthenticateDeviceEx(hwndparentin: Hwnd, hradioin: Handle, pbtdiinout: COpaquePointer?, pbtoobdata: COpaquePointer?, authenticationrequirement: AuthenticationRequirements): UInt

public expect fun bluetoothAuthenticateMultipleDevices(hwndparent: Hwnd, hradio: Handle, cdevices: UInt, rgbtdi: COpaquePointer?): UInt

public expect fun bluetoothDisplayDeviceProperties(hwndparent: Hwnd, pbtdi: COpaquePointer?): Bool

public expect fun bluetoothEnableDiscovery(hradio: Handle, fenabled: Bool): Bool

public expect fun bluetoothEnableIncomingConnections(hradio: Handle, fenabled: Bool): Bool

public expect fun bluetoothEnumerateInstalledServices(hradio: Handle, pbtdi: COpaquePointer?, pcserviceinout: COpaquePointer?, pguidservices: COpaquePointer?): UInt

public expect fun bluetoothFindDeviceClose(hfind: HbluetoothDeviceFind): Bool

public expect fun bluetoothFindFirstDevice(pbtsp: COpaquePointer?, pbtdi: COpaquePointer?): HbluetoothDeviceFind

public expect fun bluetoothFindFirstRadio(pbtfrp: COpaquePointer?, phradio: COpaquePointer?): HbluetoothRadioFind

public expect fun bluetoothFindNextDevice(hfind: HbluetoothDeviceFind, pbtdi: COpaquePointer?): Bool

public expect fun bluetoothFindNextRadio(hfind: HbluetoothRadioFind, phradio: COpaquePointer?): Bool

public expect fun bluetoothFindRadioClose(hfind: HbluetoothRadioFind): Bool

public expect fun bluetoothGATTAbortReliableWrite(hdevice: Handle, reliablewritecontext: ULong, flags: UInt): Hresult

public expect fun bluetoothGATTBeginReliableWrite(hdevice: Handle, reliablewritecontext: COpaquePointer?, flags: UInt): Hresult

public expect fun bluetoothGATTEndReliableWrite(hdevice: Handle, reliablewritecontext: ULong, flags: UInt): Hresult

public expect fun bluetoothGATTGetCharacteristicValue(hdevice: Handle, characteristic: COpaquePointer?, characteristicvaluedatasize: UInt, characteristicvalue: COpaquePointer?, characteristicvaluesizerequired: COpaquePointer?, flags: UInt): Hresult

public expect fun bluetoothGATTGetCharacteristics(hdevice: Handle, service: COpaquePointer?, characteristicsbuffercount: UShort, characteristicsbuffer: COpaquePointer?, characteristicsbufferactual: COpaquePointer?, flags: UInt): Hresult

public expect fun bluetoothGATTGetDescriptorValue(hdevice: Handle, descriptor: COpaquePointer?, descriptorvaluedatasize: UInt, descriptorvalue: COpaquePointer?, descriptorvaluesizerequired: COpaquePointer?, flags: UInt): Hresult

public expect fun bluetoothGATTGetDescriptors(hdevice: Handle, characteristic: COpaquePointer?, descriptorsbuffercount: UShort, descriptorsbuffer: COpaquePointer?, descriptorsbufferactual: COpaquePointer?, flags: UInt): Hresult

public expect fun bluetoothGATTGetIncludedServices(hdevice: Handle, parentservice: COpaquePointer?, includedservicesbuffercount: UShort, includedservicesbuffer: COpaquePointer?, includedservicesbufferactual: COpaquePointer?, flags: UInt): Hresult

public expect fun bluetoothGATTGetServices(hdevice: Handle, servicesbuffercount: UShort, servicesbuffer: COpaquePointer?, servicesbufferactual: COpaquePointer?, flags: UInt): Hresult

public expect fun bluetoothGATTRegisterEvent(hservice: Handle, eventtype: BthLeGattEventType, eventparameterin: COpaquePointer?, callback: PfnbluetoothGattEventCallback, callbackcontext: COpaquePointer?, peventhandle: COpaquePointer?, flags: UInt): Hresult

public expect fun bluetoothGATTSetCharacteristicValue(hdevice: Handle, characteristic: COpaquePointer?, characteristicvalue: COpaquePointer?, reliablewritecontext: ULong, flags: UInt): Hresult

public expect fun bluetoothGATTSetDescriptorValue(hdevice: Handle, descriptor: COpaquePointer?, descriptorvalue: COpaquePointer?, flags: UInt): Hresult

public expect fun bluetoothGATTUnregisterEvent(eventhandle: Long, flags: UInt): Hresult

public expect fun bluetoothGetDeviceInfo(hradio: Handle, pbtdi: COpaquePointer?): UInt

public expect fun bluetoothGetRadioInfo(hradio: Handle, pradioinfo: COpaquePointer?): UInt

public expect fun bluetoothIsConnectable(hradio: Handle): Bool

public expect fun bluetoothIsDiscoverable(hradio: Handle): Bool

public expect fun bluetoothIsVersionAvailable(majorversion: UByte, minorversion: UByte): Bool

public expect fun bluetoothRegisterForAuthentication(pbtdi: COpaquePointer?, phreghandle: COpaquePointer?, pfncallback: PfnAuthenticationCallback, pvparam: COpaquePointer?): UInt

public expect fun bluetoothRegisterForAuthenticationEx(pbtdiin: COpaquePointer?, phreghandleout: COpaquePointer?, pfncallbackin: PfnAuthenticationCallbackEx, pvparam: COpaquePointer?): UInt

public expect fun bluetoothRemoveDevice(paddress: COpaquePointer?): UInt

public expect fun bluetoothSdpEnumAttributes(psdpstream: COpaquePointer?, cbstreamsize: UInt, pfncallback: PfnBluetoothEnumAttributesCallback, pvparam: COpaquePointer?): Bool

public expect fun bluetoothSdpGetAttributeValue(precordstream: COpaquePointer?, cbrecordlength: UInt, usattributeid: UShort, pattributedata: COpaquePointer?): UInt

public expect fun bluetoothSdpGetContainerElementData(pcontainerstream: COpaquePointer?, cbcontainerlength: UInt, pelement: COpaquePointer?, pdata: COpaquePointer?): UInt

public expect fun bluetoothSdpGetElementData(psdpstream: COpaquePointer?, cbsdpstreamlength: UInt, pdata: COpaquePointer?): UInt

public expect fun bluetoothSdpGetString(precordstream: COpaquePointer?, cbrecordlength: UInt, pstringdata: COpaquePointer?, usstringoffset: UShort, pszstring: Pwstr, pcchstringlength: COpaquePointer?): UInt

public expect fun bluetoothSelectDevices(pbtsdp: COpaquePointer?): Bool

public expect fun bluetoothSelectDevicesFree(pbtsdp: COpaquePointer?): Bool

public expect fun bluetoothSendAuthenticationResponse(hradio: Handle, pbtdi: COpaquePointer?, pszpasskey: Pcwstr): UInt

public expect fun bluetoothSendAuthenticationResponseEx(hradioin: Handle, pauthresponse: COpaquePointer?): UInt

public expect fun bluetoothSetLocalServiceInfo(hradioin: Handle, pclassguid: COpaquePointer?, ulinstance: UInt, pserviceinfoin: COpaquePointer?): UInt

public expect fun bluetoothSetServiceState(hradio: Handle, pbtdi: COpaquePointer?, pguidservice: COpaquePointer?, dwserviceflags: UInt): UInt

public expect fun bluetoothUnregisterAuthentication(hreghandle: Long): Bool

public expect fun bluetoothUpdateDeviceRecord(pbtdi: COpaquePointer?): UInt
