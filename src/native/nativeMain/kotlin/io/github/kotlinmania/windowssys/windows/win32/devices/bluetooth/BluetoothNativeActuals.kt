@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssysWindowsWin32DevicesBluetoothBluetoothAuthenticateDevice
import io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssysWindowsWin32DevicesBluetoothBluetoothAuthenticateDeviceEx
import io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssysWindowsWin32DevicesBluetoothBluetoothAuthenticateMultipleDevices
import io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssysWindowsWin32DevicesBluetoothBluetoothDisplayDeviceProperties
import io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssysWindowsWin32DevicesBluetoothBluetoothEnableDiscovery
import io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssysWindowsWin32DevicesBluetoothBluetoothEnableIncomingConnections
import io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssysWindowsWin32DevicesBluetoothBluetoothEnumerateInstalledServices
import io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssysWindowsWin32DevicesBluetoothBluetoothFindDeviceClose
import io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssysWindowsWin32DevicesBluetoothBluetoothFindFirstDevice
import io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssysWindowsWin32DevicesBluetoothBluetoothFindFirstRadio
import io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssysWindowsWin32DevicesBluetoothBluetoothFindNextDevice
import io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssysWindowsWin32DevicesBluetoothBluetoothFindNextRadio
import io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssysWindowsWin32DevicesBluetoothBluetoothFindRadioClose
import io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssysWindowsWin32DevicesBluetoothBluetoothGATTAbortReliableWrite
import io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssysWindowsWin32DevicesBluetoothBluetoothGATTBeginReliableWrite
import io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssysWindowsWin32DevicesBluetoothBluetoothGATTEndReliableWrite
import io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssysWindowsWin32DevicesBluetoothBluetoothGATTGetCharacteristicValue
import io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssysWindowsWin32DevicesBluetoothBluetoothGATTGetCharacteristics
import io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssysWindowsWin32DevicesBluetoothBluetoothGATTGetDescriptorValue
import io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssysWindowsWin32DevicesBluetoothBluetoothGATTGetDescriptors
import io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssysWindowsWin32DevicesBluetoothBluetoothGATTGetIncludedServices
import io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssysWindowsWin32DevicesBluetoothBluetoothGATTGetServices
import io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssysWindowsWin32DevicesBluetoothBluetoothGATTRegisterEvent
import io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssysWindowsWin32DevicesBluetoothBluetoothGATTSetCharacteristicValue
import io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssysWindowsWin32DevicesBluetoothBluetoothGATTSetDescriptorValue
import io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssysWindowsWin32DevicesBluetoothBluetoothGATTUnregisterEvent
import io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssysWindowsWin32DevicesBluetoothBluetoothGetDeviceInfo
import io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssysWindowsWin32DevicesBluetoothBluetoothGetRadioInfo
import io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssysWindowsWin32DevicesBluetoothBluetoothIsConnectable
import io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssysWindowsWin32DevicesBluetoothBluetoothIsDiscoverable
import io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssysWindowsWin32DevicesBluetoothBluetoothIsVersionAvailable
import io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssysWindowsWin32DevicesBluetoothBluetoothRegisterForAuthentication
import io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssysWindowsWin32DevicesBluetoothBluetoothRegisterForAuthenticationEx
import io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssysWindowsWin32DevicesBluetoothBluetoothRemoveDevice
import io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssysWindowsWin32DevicesBluetoothBluetoothSdpEnumAttributes
import io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssysWindowsWin32DevicesBluetoothBluetoothSdpGetAttributeValue
import io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssysWindowsWin32DevicesBluetoothBluetoothSdpGetContainerElementData
import io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssysWindowsWin32DevicesBluetoothBluetoothSdpGetElementData
import io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssysWindowsWin32DevicesBluetoothBluetoothSdpGetString
import io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssysWindowsWin32DevicesBluetoothBluetoothSelectDevices
import io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssysWindowsWin32DevicesBluetoothBluetoothSelectDevicesFree
import io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssysWindowsWin32DevicesBluetoothBluetoothSendAuthenticationResponse
import io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssysWindowsWin32DevicesBluetoothBluetoothSendAuthenticationResponseEx
import io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssysWindowsWin32DevicesBluetoothBluetoothSetLocalServiceInfo
import io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssysWindowsWin32DevicesBluetoothBluetoothSetServiceState
import io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssysWindowsWin32DevicesBluetoothBluetoothUnregisterAuthentication
import io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth.cinterop.windowssysWindowsWin32DevicesBluetoothBluetoothUpdateDeviceRecord
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun bluetoothAuthenticateDevice(hwndparent: Hwnd, hradio: Handle, pbtbi: MutPtr, pszpasskey: Pcwstr, ulpasskeylength: UInt): UInt =
    windowssysWindowsWin32DevicesBluetoothBluetoothAuthenticateDevice(hwndparent.rawAddress.toCPointer<ByteVar>(), hradio.rawAddress.toCPointer<ByteVar>(), pbtbi.rawAddress.toCPointer<ByteVar>(), pszpasskey.rawAddress.toCPointer<ByteVar>(), ulpasskeylength)

public actual fun bluetoothAuthenticateDeviceEx(hwndparentin: Hwnd, hradioin: Handle, pbtdiinout: MutPtr, pbtoobdata: ConstPtr, authenticationrequirement: AuthenticationRequirements): UInt =
    windowssysWindowsWin32DevicesBluetoothBluetoothAuthenticateDeviceEx(hwndparentin.rawAddress.toCPointer<ByteVar>(), hradioin.rawAddress.toCPointer<ByteVar>(), pbtdiinout.rawAddress.toCPointer<ByteVar>(), pbtoobdata.rawAddress.toCPointer<ByteVar>(), authenticationrequirement)

public actual fun bluetoothAuthenticateMultipleDevices(hwndparent: Hwnd, hradio: Handle, cdevices: UInt, rgbtdi: MutPtr): UInt =
    windowssysWindowsWin32DevicesBluetoothBluetoothAuthenticateMultipleDevices(hwndparent.rawAddress.toCPointer<ByteVar>(), hradio.rawAddress.toCPointer<ByteVar>(), cdevices, rgbtdi.rawAddress.toCPointer<ByteVar>())

public actual fun bluetoothDisplayDeviceProperties(hwndparent: Hwnd, pbtdi: MutPtr): Bool =
    windowssysWindowsWin32DevicesBluetoothBluetoothDisplayDeviceProperties(hwndparent.rawAddress.toCPointer<ByteVar>(), pbtdi.rawAddress.toCPointer<ByteVar>())

public actual fun bluetoothEnableDiscovery(hradio: Handle, fenabled: Bool): Bool =
    windowssysWindowsWin32DevicesBluetoothBluetoothEnableDiscovery(hradio.rawAddress.toCPointer<ByteVar>(), fenabled)

public actual fun bluetoothEnableIncomingConnections(hradio: Handle, fenabled: Bool): Bool =
    windowssysWindowsWin32DevicesBluetoothBluetoothEnableIncomingConnections(hradio.rawAddress.toCPointer<ByteVar>(), fenabled)

public actual fun bluetoothEnumerateInstalledServices(hradio: Handle, pbtdi: ConstPtr, pcserviceinout: MutPtr, pguidservices: MutPtr): UInt =
    windowssysWindowsWin32DevicesBluetoothBluetoothEnumerateInstalledServices(hradio.rawAddress.toCPointer<ByteVar>(), pbtdi.rawAddress.toCPointer<ByteVar>(), pcserviceinout.rawAddress.toCPointer<ByteVar>(), pguidservices.rawAddress.toCPointer<ByteVar>())

public actual fun bluetoothFindDeviceClose(hfind: HbluetoothDeviceFind): Bool =
    windowssysWindowsWin32DevicesBluetoothBluetoothFindDeviceClose(hfind.rawAddress.toCPointer<ByteVar>())

public actual fun bluetoothFindFirstDevice(pbtsp: ConstPtr, pbtdi: MutPtr): HbluetoothDeviceFind =
    MutPtr(windowssysWindowsWin32DevicesBluetoothBluetoothFindFirstDevice(pbtsp.rawAddress.toCPointer<ByteVar>(), pbtdi.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun bluetoothFindFirstRadio(pbtfrp: ConstPtr, phradio: MutPtr): HbluetoothRadioFind =
    MutPtr(windowssysWindowsWin32DevicesBluetoothBluetoothFindFirstRadio(pbtfrp.rawAddress.toCPointer<ByteVar>(), phradio.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun bluetoothFindNextDevice(hfind: HbluetoothDeviceFind, pbtdi: MutPtr): Bool =
    windowssysWindowsWin32DevicesBluetoothBluetoothFindNextDevice(hfind.rawAddress.toCPointer<ByteVar>(), pbtdi.rawAddress.toCPointer<ByteVar>())

public actual fun bluetoothFindNextRadio(hfind: HbluetoothRadioFind, phradio: MutPtr): Bool =
    windowssysWindowsWin32DevicesBluetoothBluetoothFindNextRadio(hfind.rawAddress.toCPointer<ByteVar>(), phradio.rawAddress.toCPointer<ByteVar>())

public actual fun bluetoothFindRadioClose(hfind: HbluetoothRadioFind): Bool =
    windowssysWindowsWin32DevicesBluetoothBluetoothFindRadioClose(hfind.rawAddress.toCPointer<ByteVar>())

public actual fun bluetoothGATTAbortReliableWrite(hdevice: Handle, reliablewritecontext: ULong, flags: UInt): Hresult =
    windowssysWindowsWin32DevicesBluetoothBluetoothGATTAbortReliableWrite(hdevice.rawAddress.toCPointer<ByteVar>(), reliablewritecontext, flags)

public actual fun bluetoothGATTBeginReliableWrite(hdevice: Handle, reliablewritecontext: MutPtr, flags: UInt): Hresult =
    windowssysWindowsWin32DevicesBluetoothBluetoothGATTBeginReliableWrite(hdevice.rawAddress.toCPointer<ByteVar>(), reliablewritecontext.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun bluetoothGATTEndReliableWrite(hdevice: Handle, reliablewritecontext: ULong, flags: UInt): Hresult =
    windowssysWindowsWin32DevicesBluetoothBluetoothGATTEndReliableWrite(hdevice.rawAddress.toCPointer<ByteVar>(), reliablewritecontext, flags)

public actual fun bluetoothGATTGetCharacteristicValue(hdevice: Handle, characteristic: ConstPtr, characteristicvaluedatasize: UInt, characteristicvalue: MutPtr, characteristicvaluesizerequired: MutPtr, flags: UInt): Hresult =
    windowssysWindowsWin32DevicesBluetoothBluetoothGATTGetCharacteristicValue(hdevice.rawAddress.toCPointer<ByteVar>(), characteristic.rawAddress.toCPointer<ByteVar>(), characteristicvaluedatasize, characteristicvalue.rawAddress.toCPointer<ByteVar>(), characteristicvaluesizerequired.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun bluetoothGATTGetCharacteristics(hdevice: Handle, service: ConstPtr, characteristicsbuffercount: UShort, characteristicsbuffer: MutPtr, characteristicsbufferactual: MutPtr, flags: UInt): Hresult =
    windowssysWindowsWin32DevicesBluetoothBluetoothGATTGetCharacteristics(hdevice.rawAddress.toCPointer<ByteVar>(), service.rawAddress.toCPointer<ByteVar>(), characteristicsbuffercount, characteristicsbuffer.rawAddress.toCPointer<ByteVar>(), characteristicsbufferactual.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun bluetoothGATTGetDescriptorValue(hdevice: Handle, descriptor: ConstPtr, descriptorvaluedatasize: UInt, descriptorvalue: MutPtr, descriptorvaluesizerequired: MutPtr, flags: UInt): Hresult =
    windowssysWindowsWin32DevicesBluetoothBluetoothGATTGetDescriptorValue(hdevice.rawAddress.toCPointer<ByteVar>(), descriptor.rawAddress.toCPointer<ByteVar>(), descriptorvaluedatasize, descriptorvalue.rawAddress.toCPointer<ByteVar>(), descriptorvaluesizerequired.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun bluetoothGATTGetDescriptors(hdevice: Handle, characteristic: ConstPtr, descriptorsbuffercount: UShort, descriptorsbuffer: MutPtr, descriptorsbufferactual: MutPtr, flags: UInt): Hresult =
    windowssysWindowsWin32DevicesBluetoothBluetoothGATTGetDescriptors(hdevice.rawAddress.toCPointer<ByteVar>(), characteristic.rawAddress.toCPointer<ByteVar>(), descriptorsbuffercount, descriptorsbuffer.rawAddress.toCPointer<ByteVar>(), descriptorsbufferactual.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun bluetoothGATTGetIncludedServices(hdevice: Handle, parentservice: ConstPtr, includedservicesbuffercount: UShort, includedservicesbuffer: MutPtr, includedservicesbufferactual: MutPtr, flags: UInt): Hresult =
    windowssysWindowsWin32DevicesBluetoothBluetoothGATTGetIncludedServices(hdevice.rawAddress.toCPointer<ByteVar>(), parentservice.rawAddress.toCPointer<ByteVar>(), includedservicesbuffercount, includedservicesbuffer.rawAddress.toCPointer<ByteVar>(), includedservicesbufferactual.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun bluetoothGATTGetServices(hdevice: Handle, servicesbuffercount: UShort, servicesbuffer: MutPtr, servicesbufferactual: MutPtr, flags: UInt): Hresult =
    windowssysWindowsWin32DevicesBluetoothBluetoothGATTGetServices(hdevice.rawAddress.toCPointer<ByteVar>(), servicesbuffercount, servicesbuffer.rawAddress.toCPointer<ByteVar>(), servicesbufferactual.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun bluetoothGATTRegisterEvent(hservice: Handle, eventtype: BthLeGattEventType, eventparameterin: ConstPtr, callback: PfnbluetoothGattEventCallback, callbackcontext: ConstPtr, peventhandle: MutPtr, flags: UInt): Hresult =
    windowssysWindowsWin32DevicesBluetoothBluetoothGATTRegisterEvent(hservice.rawAddress.toCPointer<ByteVar>(), eventtype, eventparameterin.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), callbackcontext.rawAddress.toCPointer<ByteVar>(), peventhandle.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun bluetoothGATTSetCharacteristicValue(hdevice: Handle, characteristic: ConstPtr, characteristicvalue: ConstPtr, reliablewritecontext: ULong, flags: UInt): Hresult =
    windowssysWindowsWin32DevicesBluetoothBluetoothGATTSetCharacteristicValue(hdevice.rawAddress.toCPointer<ByteVar>(), characteristic.rawAddress.toCPointer<ByteVar>(), characteristicvalue.rawAddress.toCPointer<ByteVar>(), reliablewritecontext, flags)

public actual fun bluetoothGATTSetDescriptorValue(hdevice: Handle, descriptor: ConstPtr, descriptorvalue: ConstPtr, flags: UInt): Hresult =
    windowssysWindowsWin32DevicesBluetoothBluetoothGATTSetDescriptorValue(hdevice.rawAddress.toCPointer<ByteVar>(), descriptor.rawAddress.toCPointer<ByteVar>(), descriptorvalue.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun bluetoothGATTUnregisterEvent(eventhandle: Long, flags: UInt): Hresult =
    windowssysWindowsWin32DevicesBluetoothBluetoothGATTUnregisterEvent(eventhandle, flags)

public actual fun bluetoothGetDeviceInfo(hradio: Handle, pbtdi: MutPtr): UInt =
    windowssysWindowsWin32DevicesBluetoothBluetoothGetDeviceInfo(hradio.rawAddress.toCPointer<ByteVar>(), pbtdi.rawAddress.toCPointer<ByteVar>())

public actual fun bluetoothGetRadioInfo(hradio: Handle, pradioinfo: MutPtr): UInt =
    windowssysWindowsWin32DevicesBluetoothBluetoothGetRadioInfo(hradio.rawAddress.toCPointer<ByteVar>(), pradioinfo.rawAddress.toCPointer<ByteVar>())

public actual fun bluetoothIsConnectable(hradio: Handle): Bool =
    windowssysWindowsWin32DevicesBluetoothBluetoothIsConnectable(hradio.rawAddress.toCPointer<ByteVar>())

public actual fun bluetoothIsDiscoverable(hradio: Handle): Bool =
    windowssysWindowsWin32DevicesBluetoothBluetoothIsDiscoverable(hradio.rawAddress.toCPointer<ByteVar>())

public actual fun bluetoothIsVersionAvailable(majorversion: UByte, minorversion: UByte): Bool =
    windowssysWindowsWin32DevicesBluetoothBluetoothIsVersionAvailable(majorversion, minorversion)

public actual fun bluetoothRegisterForAuthentication(pbtdi: ConstPtr, phreghandle: MutPtr, pfncallback: PfnAuthenticationCallback, pvparam: ConstPtr): UInt =
    windowssysWindowsWin32DevicesBluetoothBluetoothRegisterForAuthentication(pbtdi.rawAddress.toCPointer<ByteVar>(), phreghandle.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), pvparam.rawAddress.toCPointer<ByteVar>())

public actual fun bluetoothRegisterForAuthenticationEx(pbtdiin: ConstPtr, phreghandleout: MutPtr, pfncallbackin: PfnAuthenticationCallbackEx, pvparam: ConstPtr): UInt =
    windowssysWindowsWin32DevicesBluetoothBluetoothRegisterForAuthenticationEx(pbtdiin.rawAddress.toCPointer<ByteVar>(), phreghandleout.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), pvparam.rawAddress.toCPointer<ByteVar>())

public actual fun bluetoothRemoveDevice(paddress: ConstPtr): UInt =
    windowssysWindowsWin32DevicesBluetoothBluetoothRemoveDevice(paddress.rawAddress.toCPointer<ByteVar>())

public actual fun bluetoothSdpEnumAttributes(psdpstream: ConstPtr, cbstreamsize: UInt, pfncallback: PfnBluetoothEnumAttributesCallback, pvparam: ConstPtr): Bool =
    windowssysWindowsWin32DevicesBluetoothBluetoothSdpEnumAttributes(psdpstream.rawAddress.toCPointer<ByteVar>(), cbstreamsize, 0L.toCPointer<ByteVar>(), pvparam.rawAddress.toCPointer<ByteVar>())

public actual fun bluetoothSdpGetAttributeValue(precordstream: ConstPtr, cbrecordlength: UInt, usattributeid: UShort, pattributedata: MutPtr): UInt =
    windowssysWindowsWin32DevicesBluetoothBluetoothSdpGetAttributeValue(precordstream.rawAddress.toCPointer<ByteVar>(), cbrecordlength, usattributeid, pattributedata.rawAddress.toCPointer<ByteVar>())

public actual fun bluetoothSdpGetContainerElementData(pcontainerstream: ConstPtr, cbcontainerlength: UInt, pelement: MutPtr, pdata: MutPtr): UInt =
    windowssysWindowsWin32DevicesBluetoothBluetoothSdpGetContainerElementData(pcontainerstream.rawAddress.toCPointer<ByteVar>(), cbcontainerlength, pelement.rawAddress.toCPointer<ByteVar>(), pdata.rawAddress.toCPointer<ByteVar>())

public actual fun bluetoothSdpGetElementData(psdpstream: ConstPtr, cbsdpstreamlength: UInt, pdata: MutPtr): UInt =
    windowssysWindowsWin32DevicesBluetoothBluetoothSdpGetElementData(psdpstream.rawAddress.toCPointer<ByteVar>(), cbsdpstreamlength, pdata.rawAddress.toCPointer<ByteVar>())

public actual fun bluetoothSdpGetString(precordstream: ConstPtr, cbrecordlength: UInt, pstringdata: ConstPtr, usstringoffset: UShort, pszstring: Pwstr, pcchstringlength: MutPtr): UInt =
    windowssysWindowsWin32DevicesBluetoothBluetoothSdpGetString(precordstream.rawAddress.toCPointer<ByteVar>(), cbrecordlength, pstringdata.rawAddress.toCPointer<ByteVar>(), usstringoffset, pszstring.rawAddress.toCPointer<ByteVar>(), pcchstringlength.rawAddress.toCPointer<ByteVar>())

public actual fun bluetoothSelectDevices(pbtsdp: MutPtr): Bool =
    windowssysWindowsWin32DevicesBluetoothBluetoothSelectDevices(pbtsdp.rawAddress.toCPointer<ByteVar>())

public actual fun bluetoothSelectDevicesFree(pbtsdp: MutPtr): Bool =
    windowssysWindowsWin32DevicesBluetoothBluetoothSelectDevicesFree(pbtsdp.rawAddress.toCPointer<ByteVar>())

public actual fun bluetoothSendAuthenticationResponse(hradio: Handle, pbtdi: ConstPtr, pszpasskey: Pcwstr): UInt =
    windowssysWindowsWin32DevicesBluetoothBluetoothSendAuthenticationResponse(hradio.rawAddress.toCPointer<ByteVar>(), pbtdi.rawAddress.toCPointer<ByteVar>(), pszpasskey.rawAddress.toCPointer<ByteVar>())

public actual fun bluetoothSendAuthenticationResponseEx(hradioin: Handle, pauthresponse: ConstPtr): UInt =
    windowssysWindowsWin32DevicesBluetoothBluetoothSendAuthenticationResponseEx(hradioin.rawAddress.toCPointer<ByteVar>(), pauthresponse.rawAddress.toCPointer<ByteVar>())

public actual fun bluetoothSetLocalServiceInfo(hradioin: Handle, pclassguid: ConstPtr, ulinstance: UInt, pserviceinfoin: ConstPtr): UInt =
    windowssysWindowsWin32DevicesBluetoothBluetoothSetLocalServiceInfo(hradioin.rawAddress.toCPointer<ByteVar>(), pclassguid.rawAddress.toCPointer<ByteVar>(), ulinstance, pserviceinfoin.rawAddress.toCPointer<ByteVar>())

public actual fun bluetoothSetServiceState(hradio: Handle, pbtdi: ConstPtr, pguidservice: ConstPtr, dwserviceflags: UInt): UInt =
    windowssysWindowsWin32DevicesBluetoothBluetoothSetServiceState(hradio.rawAddress.toCPointer<ByteVar>(), pbtdi.rawAddress.toCPointer<ByteVar>(), pguidservice.rawAddress.toCPointer<ByteVar>(), dwserviceflags)

public actual fun bluetoothUnregisterAuthentication(hreghandle: Long): Bool =
    windowssysWindowsWin32DevicesBluetoothBluetoothUnregisterAuthentication(hreghandle)

public actual fun bluetoothUpdateDeviceRecord(pbtdi: ConstPtr): UInt =
    windowssysWindowsWin32DevicesBluetoothBluetoothUpdateDeviceRecord(pbtdi.rawAddress.toCPointer<ByteVar>())
