@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.EapMethodType

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun wFDCancelOpenSession(hsessionhandle: Handle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWifiWFDCancelOpenSession")

public actual fun wFDCloseHandle(hclienthandle: Handle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWifiWFDCloseHandle")

public actual fun wFDCloseSession(hsessionhandle: Handle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWifiWFDCloseSession")

public actual fun wFDOpenHandle(dwclientversion: UInt, pdwnegotiatedversion: MutPtr, phclienthandle: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWifiWFDOpenHandle")

public actual fun wFDOpenLegacySession(hclienthandle: Handle, plegacymacaddress: ConstPtr, phsessionhandle: MutPtr, pguidsessioninterface: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWifiWFDOpenLegacySession")

public actual fun wFDStartOpenSession(hclienthandle: Handle, pdeviceaddress: ConstPtr, pvcontext: ConstPtr, pfncallback: WfdOpenSessionCompleteCallback, phsessionhandle: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWifiWFDStartOpenSession")

public actual fun wFDUpdateDeviceVisibility(pdeviceaddress: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWifiWFDUpdateDeviceVisibility")

public actual fun wlanAllocateMemory(dwmemorysize: UInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWifiWlanAllocateMemory")

public actual fun wlanCloseHandle(hclienthandle: Handle, preserved: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWifiWlanCloseHandle")

public actual fun wlanConnect(hclienthandle: Handle, pinterfaceguid: ConstPtr, pconnectionparameters: ConstPtr, preserved: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWifiWlanConnect")

public actual fun wlanConnect2(hclienthandle: Handle, pinterfaceguid: ConstPtr, pconnectionparameters: ConstPtr, preserved: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWifiWlanConnect2")

public actual fun wlanDeleteProfile(hclienthandle: Handle, pinterfaceguid: ConstPtr, strprofilename: Pcwstr, preserved: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWifiWlanDeleteProfile")

public actual fun wlanDeviceServiceCommand(hclienthandle: Handle, pinterfaceguid: ConstPtr, pdeviceserviceguid: ConstPtr, dwopcode: UInt, dwinbuffersize: UInt, pinbuffer: ConstPtr, dwoutbuffersize: UInt, poutbuffer: MutPtr, pdwbytesreturned: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWifiWlanDeviceServiceCommand")

public actual fun wlanDisconnect(hclienthandle: Handle, pinterfaceguid: ConstPtr, preserved: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWifiWlanDisconnect")

public actual fun wlanEnumInterfaces(hclienthandle: Handle, preserved: ConstPtr, ppinterfacelist: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWifiWlanEnumInterfaces")

public actual fun wlanExtractPsdIEDataList(hclienthandle: Handle, dwiedatasize: UInt, prawiedata: ConstPtr, strformat: Pcwstr, preserved: ConstPtr, pppsdiedatalist: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWifiWlanExtractPsdIEDataList")

public actual fun wlanFreeMemory(pmemory: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWifiWlanFreeMemory")

public actual fun wlanGetAvailableNetworkList(hclienthandle: Handle, pinterfaceguid: ConstPtr, dwflags: UInt, preserved: ConstPtr, ppavailablenetworklist: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWifiWlanGetAvailableNetworkList")

public actual fun wlanGetAvailableNetworkList2(hclienthandle: Handle, pinterfaceguid: ConstPtr, dwflags: UInt, preserved: ConstPtr, ppavailablenetworklist: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWifiWlanGetAvailableNetworkList2")

public actual fun wlanGetFilterList(hclienthandle: Handle, wlanfilterlisttype: WlanFilterListType, preserved: ConstPtr, ppnetworklist: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWifiWlanGetFilterList")

public actual fun wlanGetInterfaceCapability(hclienthandle: Handle, pinterfaceguid: ConstPtr, preserved: ConstPtr, ppcapability: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWifiWlanGetInterfaceCapability")

public actual fun wlanGetNetworkBssList(hclienthandle: Handle, pinterfaceguid: ConstPtr, pdot11ssid: ConstPtr, dot11bsstype: Dot11BssType, bsecurityenabled: Bool, preserved: ConstPtr, ppwlanbsslist: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWifiWlanGetNetworkBssList")

public actual fun wlanGetProfile(hclienthandle: Handle, pinterfaceguid: ConstPtr, strprofilename: Pcwstr, preserved: ConstPtr, pstrprofilexml: MutPtr, pdwflags: MutPtr, pdwgrantedaccess: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWifiWlanGetProfile")

public actual fun wlanGetProfileCustomUserData(hclienthandle: Handle, pinterfaceguid: ConstPtr, strprofilename: Pcwstr, preserved: ConstPtr, pdwdatasize: MutPtr, ppdata: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWifiWlanGetProfileCustomUserData")

public actual fun wlanGetProfileList(hclienthandle: Handle, pinterfaceguid: ConstPtr, preserved: ConstPtr, ppprofilelist: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWifiWlanGetProfileList")

public actual fun wlanGetSecuritySettings(hclienthandle: Handle, securableobject: WlanSecurableObject, pvaluetype: MutPtr, pstrcurrentsddl: MutPtr, pdwgrantedaccess: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWifiWlanGetSecuritySettings")

public actual fun wlanGetSupportedDeviceServices(hclienthandle: Handle, pinterfaceguid: ConstPtr, ppdevsvcguidlist: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWifiWlanGetSupportedDeviceServices")

public actual fun wlanHostedNetworkForceStart(hclienthandle: Handle, pfailreason: MutPtr, pvreserved: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkForceStart")

public actual fun wlanHostedNetworkForceStop(hclienthandle: Handle, pfailreason: MutPtr, pvreserved: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkForceStop")

public actual fun wlanHostedNetworkInitSettings(hclienthandle: Handle, pfailreason: MutPtr, pvreserved: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkInitSettings")

public actual fun wlanHostedNetworkQueryProperty(hclienthandle: Handle, opcode: WlanHostedNetworkOpcode, pdwdatasize: MutPtr, ppvdata: MutPtr, pwlanopcodevaluetype: MutPtr, pvreserved: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkQueryProperty")

public actual fun wlanHostedNetworkQuerySecondaryKey(hclienthandle: Handle, pdwkeylength: MutPtr, ppuckeydata: MutPtr, pbispassphrase: MutPtr, pbpersistent: MutPtr, pfailreason: MutPtr, pvreserved: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkQuerySecondaryKey")

public actual fun wlanHostedNetworkQueryStatus(hclienthandle: Handle, ppwlanhostednetworkstatus: MutPtr, pvreserved: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkQueryStatus")

public actual fun wlanHostedNetworkRefreshSecuritySettings(hclienthandle: Handle, pfailreason: MutPtr, pvreserved: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkRefreshSecuritySettings")

public actual fun wlanHostedNetworkSetProperty(hclienthandle: Handle, opcode: WlanHostedNetworkOpcode, dwdatasize: UInt, pvdata: ConstPtr, pfailreason: MutPtr, pvreserved: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkSetProperty")

public actual fun wlanHostedNetworkSetSecondaryKey(hclienthandle: Handle, dwkeylength: UInt, puckeydata: ConstPtr, bispassphrase: Bool, bpersistent: Bool, pfailreason: MutPtr, pvreserved: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkSetSecondaryKey")

public actual fun wlanHostedNetworkStartUsing(hclienthandle: Handle, pfailreason: MutPtr, pvreserved: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkStartUsing")

public actual fun wlanHostedNetworkStopUsing(hclienthandle: Handle, pfailreason: MutPtr, pvreserved: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkStopUsing")

public actual fun wlanIhvControl(hclienthandle: Handle, pinterfaceguid: ConstPtr, type: WlanIhvControlType, dwinbuffersize: UInt, pinbuffer: ConstPtr, dwoutbuffersize: UInt, poutbuffer: MutPtr, pdwbytesreturned: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWifiWlanIhvControl")

public actual fun wlanOpenHandle(dwclientversion: UInt, preserved: ConstPtr, pdwnegotiatedversion: MutPtr, phclienthandle: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWifiWlanOpenHandle")

public actual fun wlanQueryAutoConfigParameter(hclienthandle: Handle, opcode: WlanAutoconfOpcode, preserved: ConstPtr, pdwdatasize: MutPtr, ppdata: MutPtr, pwlanopcodevaluetype: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWifiWlanQueryAutoConfigParameter")

public actual fun wlanQueryInterface(hclienthandle: Handle, pinterfaceguid: ConstPtr, opcode: WlanIntfOpcode, preserved: ConstPtr, pdwdatasize: MutPtr, ppdata: MutPtr, pwlanopcodevaluetype: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWifiWlanQueryInterface")

public actual fun wlanReasonCodeToString(dwreasoncode: UInt, dwbuffersize: UInt, pstringbuffer: Pcwstr, preserved: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWifiWlanReasonCodeToString")

public actual fun wlanRegisterDeviceServiceNotification(hclienthandle: Handle, pdevsvcguidlist: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWifiWlanRegisterDeviceServiceNotification")

public actual fun wlanRegisterNotification(hclienthandle: Handle, dwnotifsource: WlanNotificationSources, bignoreduplicate: Bool, funccallback: WlanNotificationCallback, pcallbackcontext: ConstPtr, preserved: ConstPtr, pdwprevnotifsource: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWifiWlanRegisterNotification")

public actual fun wlanRegisterVirtualStationNotification(hclienthandle: Handle, bregister: Bool, preserved: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWifiWlanRegisterVirtualStationNotification")

public actual fun wlanRenameProfile(hclienthandle: Handle, pinterfaceguid: ConstPtr, stroldprofilename: Pcwstr, strnewprofilename: Pcwstr, preserved: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWifiWlanRenameProfile")

public actual fun wlanSaveTemporaryProfile(hclienthandle: Handle, pinterfaceguid: ConstPtr, strprofilename: Pcwstr, stralluserprofilesecurity: Pcwstr, dwflags: UInt, boverwrite: Bool, preserved: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWifiWlanSaveTemporaryProfile")

public actual fun wlanScan(hclienthandle: Handle, pinterfaceguid: ConstPtr, pdot11ssid: ConstPtr, piedata: ConstPtr, preserved: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWifiWlanScan")

public actual fun wlanSetAutoConfigParameter(hclienthandle: Handle, opcode: WlanAutoconfOpcode, dwdatasize: UInt, pdata: ConstPtr, preserved: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWifiWlanSetAutoConfigParameter")

public actual fun wlanSetFilterList(hclienthandle: Handle, wlanfilterlisttype: WlanFilterListType, pnetworklist: ConstPtr, preserved: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWifiWlanSetFilterList")

public actual fun wlanSetInterface(hclienthandle: Handle, pinterfaceguid: ConstPtr, opcode: WlanIntfOpcode, dwdatasize: UInt, pdata: ConstPtr, preserved: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWifiWlanSetInterface")

public actual fun wlanSetProfile(hclienthandle: Handle, pinterfaceguid: ConstPtr, dwflags: UInt, strprofilexml: Pcwstr, stralluserprofilesecurity: Pcwstr, boverwrite: Bool, preserved: ConstPtr, pdwreasoncode: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWifiWlanSetProfile")

public actual fun wlanSetProfileCustomUserData(hclienthandle: Handle, pinterfaceguid: ConstPtr, strprofilename: Pcwstr, dwdatasize: UInt, pdata: ConstPtr, preserved: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWifiWlanSetProfileCustomUserData")

public actual fun wlanSetProfileEapUserData(hclienthandle: Handle, pinterfaceguid: ConstPtr, strprofilename: Pcwstr, eaptype: EapMethodType, dwflags: WlanSetEaphostFlags, dweapuserdatasize: UInt, pbeapuserdata: ConstPtr, preserved: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWifiWlanSetProfileEapUserData")

public actual fun wlanSetProfileEapXmlUserData(hclienthandle: Handle, pinterfaceguid: ConstPtr, strprofilename: Pcwstr, dwflags: WlanSetEaphostFlags, streapxmluserdata: Pcwstr, preserved: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWifiWlanSetProfileEapXmlUserData")

public actual fun wlanSetProfileList(hclienthandle: Handle, pinterfaceguid: ConstPtr, dwitems: UInt, strprofilenames: ConstPtr, preserved: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWifiWlanSetProfileList")

public actual fun wlanSetProfilePosition(hclienthandle: Handle, pinterfaceguid: ConstPtr, strprofilename: Pcwstr, dwposition: UInt, preserved: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWifiWlanSetProfilePosition")

public actual fun wlanSetPsdIEDataList(hclienthandle: Handle, strformat: Pcwstr, ppsdiedatalist: ConstPtr, preserved: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWifiWlanSetPsdIEDataList")

public actual fun wlanSetSecuritySettings(hclienthandle: Handle, securableobject: WlanSecurableObject, strmodifiedsddl: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWifiWlanSetSecuritySettings")

public actual fun wlanUIEditProfile(dwclientversion: UInt, wstrprofilename: Pcwstr, pinterfaceguid: ConstPtr, hwnd: Hwnd, wlstartpage: WlDisplayPages, preserved: ConstPtr, pwlanreasoncode: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWifiWlanUIEditProfile")
