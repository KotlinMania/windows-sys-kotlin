@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssysWindowsWin32NetworkmanagementWifiWFDCancelOpenSession
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssysWindowsWin32NetworkmanagementWifiWFDCloseHandle
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssysWindowsWin32NetworkmanagementWifiWFDCloseSession
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssysWindowsWin32NetworkmanagementWifiWFDOpenHandle
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssysWindowsWin32NetworkmanagementWifiWFDOpenLegacySession
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssysWindowsWin32NetworkmanagementWifiWFDStartOpenSession
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssysWindowsWin32NetworkmanagementWifiWFDUpdateDeviceVisibility
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssysWindowsWin32NetworkmanagementWifiWlanAllocateMemory
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssysWindowsWin32NetworkmanagementWifiWlanCloseHandle
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssysWindowsWin32NetworkmanagementWifiWlanConnect
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssysWindowsWin32NetworkmanagementWifiWlanConnect2
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssysWindowsWin32NetworkmanagementWifiWlanDeleteProfile
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssysWindowsWin32NetworkmanagementWifiWlanDeviceServiceCommand
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssysWindowsWin32NetworkmanagementWifiWlanDisconnect
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssysWindowsWin32NetworkmanagementWifiWlanEnumInterfaces
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssysWindowsWin32NetworkmanagementWifiWlanExtractPsdIEDataList
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssysWindowsWin32NetworkmanagementWifiWlanFreeMemory
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssysWindowsWin32NetworkmanagementWifiWlanGetAvailableNetworkList
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssysWindowsWin32NetworkmanagementWifiWlanGetAvailableNetworkList2
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssysWindowsWin32NetworkmanagementWifiWlanGetFilterList
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssysWindowsWin32NetworkmanagementWifiWlanGetInterfaceCapability
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssysWindowsWin32NetworkmanagementWifiWlanGetNetworkBssList
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssysWindowsWin32NetworkmanagementWifiWlanGetProfile
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssysWindowsWin32NetworkmanagementWifiWlanGetProfileCustomUserData
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssysWindowsWin32NetworkmanagementWifiWlanGetProfileList
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssysWindowsWin32NetworkmanagementWifiWlanGetSecuritySettings
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssysWindowsWin32NetworkmanagementWifiWlanGetSupportedDeviceServices
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkForceStart
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkForceStop
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkInitSettings
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkQueryProperty
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkQuerySecondaryKey
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkQueryStatus
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkRefreshSecuritySettings
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkSetProperty
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkSetSecondaryKey
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkStartUsing
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkStopUsing
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssysWindowsWin32NetworkmanagementWifiWlanIhvControl
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssysWindowsWin32NetworkmanagementWifiWlanOpenHandle
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssysWindowsWin32NetworkmanagementWifiWlanQueryAutoConfigParameter
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssysWindowsWin32NetworkmanagementWifiWlanQueryInterface
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssysWindowsWin32NetworkmanagementWifiWlanReasonCodeToString
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssysWindowsWin32NetworkmanagementWifiWlanRegisterDeviceServiceNotification
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssysWindowsWin32NetworkmanagementWifiWlanRegisterNotification
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssysWindowsWin32NetworkmanagementWifiWlanRegisterVirtualStationNotification
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssysWindowsWin32NetworkmanagementWifiWlanRenameProfile
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssysWindowsWin32NetworkmanagementWifiWlanSaveTemporaryProfile
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssysWindowsWin32NetworkmanagementWifiWlanScan
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssysWindowsWin32NetworkmanagementWifiWlanSetAutoConfigParameter
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssysWindowsWin32NetworkmanagementWifiWlanSetFilterList
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssysWindowsWin32NetworkmanagementWifiWlanSetInterface
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssysWindowsWin32NetworkmanagementWifiWlanSetProfile
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssysWindowsWin32NetworkmanagementWifiWlanSetProfileCustomUserData
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssysWindowsWin32NetworkmanagementWifiWlanSetProfileEapXmlUserData
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssysWindowsWin32NetworkmanagementWifiWlanSetProfileList
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssysWindowsWin32NetworkmanagementWifiWlanSetProfilePosition
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssysWindowsWin32NetworkmanagementWifiWlanSetPsdIEDataList
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssysWindowsWin32NetworkmanagementWifiWlanSetSecuritySettings
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssysWindowsWin32NetworkmanagementWifiWlanUIEditProfile
import io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.EapMethodType
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun wFDCancelOpenSession(hsessionhandle: Handle): UInt =
    windowssysWindowsWin32NetworkmanagementWifiWFDCancelOpenSession(hsessionhandle.rawAddress.toCPointer<ByteVar>())

public actual fun wFDCloseHandle(hclienthandle: Handle): UInt =
    windowssysWindowsWin32NetworkmanagementWifiWFDCloseHandle(hclienthandle.rawAddress.toCPointer<ByteVar>())

public actual fun wFDCloseSession(hsessionhandle: Handle): UInt =
    windowssysWindowsWin32NetworkmanagementWifiWFDCloseSession(hsessionhandle.rawAddress.toCPointer<ByteVar>())

public actual fun wFDOpenHandle(dwclientversion: UInt, pdwnegotiatedversion: MutPtr<UInt>, phclienthandle: MutPtr<Handle>): UInt =
    windowssysWindowsWin32NetworkmanagementWifiWFDOpenHandle(dwclientversion, pdwnegotiatedversion.rawAddress.toCPointer<ByteVar>(), phclienthandle.rawAddress.toCPointer<ByteVar>())

public actual fun wFDOpenLegacySession(hclienthandle: Handle, plegacymacaddress: ConstPtr<ConstPtr<UByte>>, phsessionhandle: MutPtr<Handle>, pguidsessioninterface: MutPtr<Guid>): UInt =
    windowssysWindowsWin32NetworkmanagementWifiWFDOpenLegacySession(hclienthandle.rawAddress.toCPointer<ByteVar>(), plegacymacaddress.rawAddress.toCPointer<ByteVar>(), phsessionhandle.rawAddress.toCPointer<ByteVar>(), pguidsessioninterface.rawAddress.toCPointer<ByteVar>())

public actual fun wFDStartOpenSession(hclienthandle: Handle, pdeviceaddress: ConstPtr<ConstPtr<UByte>>, pvcontext: ConstPtr<CVoid>, pfncallback: WfdOpenSessionCompleteCallback, phsessionhandle: MutPtr<Handle>): UInt =
    windowssysWindowsWin32NetworkmanagementWifiWFDStartOpenSession(hclienthandle.rawAddress.toCPointer<ByteVar>(), pdeviceaddress.rawAddress.toCPointer<ByteVar>(), pvcontext.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), phsessionhandle.rawAddress.toCPointer<ByteVar>())

public actual fun wFDUpdateDeviceVisibility(pdeviceaddress: ConstPtr<ConstPtr<UByte>>): UInt =
    windowssysWindowsWin32NetworkmanagementWifiWFDUpdateDeviceVisibility(pdeviceaddress.rawAddress.toCPointer<ByteVar>())

public actual fun wlanAllocateMemory(dwmemorysize: UInt): MutPtr<CVoid> =
    MutPtr(windowssysWindowsWin32NetworkmanagementWifiWlanAllocateMemory(dwmemorysize)?.toLong() ?: 0L)

public actual fun wlanCloseHandle(hclienthandle: Handle, preserved: ConstPtr<CVoid>): UInt =
    windowssysWindowsWin32NetworkmanagementWifiWlanCloseHandle(hclienthandle.rawAddress.toCPointer<ByteVar>(), preserved.rawAddress.toCPointer<ByteVar>())

public actual fun wlanConnect(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, pconnectionparameters: ConstPtr<WlanConnectionParameters>, preserved: ConstPtr<CVoid>): UInt =
    windowssysWindowsWin32NetworkmanagementWifiWlanConnect(hclienthandle.rawAddress.toCPointer<ByteVar>(), pinterfaceguid.rawAddress.toCPointer<ByteVar>(), pconnectionparameters.rawAddress.toCPointer<ByteVar>(), preserved.rawAddress.toCPointer<ByteVar>())

public actual fun wlanConnect2(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, pconnectionparameters: ConstPtr<WlanConnectionParametersV2>, preserved: ConstPtr<CVoid>): UInt =
    windowssysWindowsWin32NetworkmanagementWifiWlanConnect2(hclienthandle.rawAddress.toCPointer<ByteVar>(), pinterfaceguid.rawAddress.toCPointer<ByteVar>(), pconnectionparameters.rawAddress.toCPointer<ByteVar>(), preserved.rawAddress.toCPointer<ByteVar>())

public actual fun wlanDeleteProfile(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, strprofilename: Pcwstr, preserved: ConstPtr<CVoid>): UInt =
    windowssysWindowsWin32NetworkmanagementWifiWlanDeleteProfile(hclienthandle.rawAddress.toCPointer<ByteVar>(), pinterfaceguid.rawAddress.toCPointer<ByteVar>(), strprofilename.rawAddress.toCPointer<ByteVar>(), preserved.rawAddress.toCPointer<ByteVar>())

public actual fun wlanDeviceServiceCommand(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, pdeviceserviceguid: ConstPtr<Guid>, dwopcode: UInt, dwinbuffersize: UInt, pinbuffer: ConstPtr<CVoid>, dwoutbuffersize: UInt, poutbuffer: MutPtr<CVoid>, pdwbytesreturned: MutPtr<UInt>): UInt =
    windowssysWindowsWin32NetworkmanagementWifiWlanDeviceServiceCommand(hclienthandle.rawAddress.toCPointer<ByteVar>(), pinterfaceguid.rawAddress.toCPointer<ByteVar>(), pdeviceserviceguid.rawAddress.toCPointer<ByteVar>(), dwopcode, dwinbuffersize, pinbuffer.rawAddress.toCPointer<ByteVar>(), dwoutbuffersize, poutbuffer.rawAddress.toCPointer<ByteVar>(), pdwbytesreturned.rawAddress.toCPointer<ByteVar>())

public actual fun wlanDisconnect(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, preserved: ConstPtr<CVoid>): UInt =
    windowssysWindowsWin32NetworkmanagementWifiWlanDisconnect(hclienthandle.rawAddress.toCPointer<ByteVar>(), pinterfaceguid.rawAddress.toCPointer<ByteVar>(), preserved.rawAddress.toCPointer<ByteVar>())

public actual fun wlanEnumInterfaces(hclienthandle: Handle, preserved: ConstPtr<CVoid>, ppinterfacelist: MutPtr<MutPtr<WlanInterfaceInfoList>>): UInt =
    windowssysWindowsWin32NetworkmanagementWifiWlanEnumInterfaces(hclienthandle.rawAddress.toCPointer<ByteVar>(), preserved.rawAddress.toCPointer<ByteVar>(), ppinterfacelist.rawAddress.toCPointer<ByteVar>())

public actual fun wlanExtractPsdIEDataList(hclienthandle: Handle, dwiedatasize: UInt, prawiedata: ConstPtr<UByte>, strformat: Pcwstr, preserved: ConstPtr<CVoid>, pppsdiedatalist: MutPtr<MutPtr<WlanRawDataList>>): UInt =
    windowssysWindowsWin32NetworkmanagementWifiWlanExtractPsdIEDataList(hclienthandle.rawAddress.toCPointer<ByteVar>(), dwiedatasize, prawiedata.rawAddress.toCPointer<ByteVar>(), strformat.rawAddress.toCPointer<ByteVar>(), preserved.rawAddress.toCPointer<ByteVar>(), pppsdiedatalist.rawAddress.toCPointer<ByteVar>())

public actual fun wlanFreeMemory(pmemory: ConstPtr<CVoid>) {
    windowssysWindowsWin32NetworkmanagementWifiWlanFreeMemory(pmemory.rawAddress.toCPointer<ByteVar>())
}

public actual fun wlanGetAvailableNetworkList(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, dwflags: UInt, preserved: ConstPtr<CVoid>, ppavailablenetworklist: MutPtr<MutPtr<WlanAvailableNetworkList>>): UInt =
    windowssysWindowsWin32NetworkmanagementWifiWlanGetAvailableNetworkList(hclienthandle.rawAddress.toCPointer<ByteVar>(), pinterfaceguid.rawAddress.toCPointer<ByteVar>(), dwflags, preserved.rawAddress.toCPointer<ByteVar>(), ppavailablenetworklist.rawAddress.toCPointer<ByteVar>())

public actual fun wlanGetAvailableNetworkList2(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, dwflags: UInt, preserved: ConstPtr<CVoid>, ppavailablenetworklist: MutPtr<MutPtr<WlanAvailableNetworkListV2>>): UInt =
    windowssysWindowsWin32NetworkmanagementWifiWlanGetAvailableNetworkList2(hclienthandle.rawAddress.toCPointer<ByteVar>(), pinterfaceguid.rawAddress.toCPointer<ByteVar>(), dwflags, preserved.rawAddress.toCPointer<ByteVar>(), ppavailablenetworklist.rawAddress.toCPointer<ByteVar>())

public actual fun wlanGetFilterList(hclienthandle: Handle, wlanfilterlisttype: WlanFilterListType, preserved: ConstPtr<CVoid>, ppnetworklist: MutPtr<MutPtr<Dot11NetworkList>>): UInt =
    windowssysWindowsWin32NetworkmanagementWifiWlanGetFilterList(hclienthandle.rawAddress.toCPointer<ByteVar>(), wlanfilterlisttype, preserved.rawAddress.toCPointer<ByteVar>(), ppnetworklist.rawAddress.toCPointer<ByteVar>())

public actual fun wlanGetInterfaceCapability(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, preserved: ConstPtr<CVoid>, ppcapability: MutPtr<MutPtr<WlanInterfaceCapability>>): UInt =
    windowssysWindowsWin32NetworkmanagementWifiWlanGetInterfaceCapability(hclienthandle.rawAddress.toCPointer<ByteVar>(), pinterfaceguid.rawAddress.toCPointer<ByteVar>(), preserved.rawAddress.toCPointer<ByteVar>(), ppcapability.rawAddress.toCPointer<ByteVar>())

public actual fun wlanGetNetworkBssList(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, pdot11ssid: ConstPtr<Dot11Ssid>, dot11bsstype: Dot11BssType, bsecurityenabled: Bool, preserved: ConstPtr<CVoid>, ppwlanbsslist: MutPtr<MutPtr<WlanBssList>>): UInt =
    windowssysWindowsWin32NetworkmanagementWifiWlanGetNetworkBssList(hclienthandle.rawAddress.toCPointer<ByteVar>(), pinterfaceguid.rawAddress.toCPointer<ByteVar>(), pdot11ssid.rawAddress.toCPointer<ByteVar>(), dot11bsstype, bsecurityenabled, preserved.rawAddress.toCPointer<ByteVar>(), ppwlanbsslist.rawAddress.toCPointer<ByteVar>())

public actual fun wlanGetProfile(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, strprofilename: Pcwstr, preserved: ConstPtr<CVoid>, pstrprofilexml: MutPtr<Pwstr>, pdwflags: MutPtr<UInt>, pdwgrantedaccess: MutPtr<UInt>): UInt =
    windowssysWindowsWin32NetworkmanagementWifiWlanGetProfile(hclienthandle.rawAddress.toCPointer<ByteVar>(), pinterfaceguid.rawAddress.toCPointer<ByteVar>(), strprofilename.rawAddress.toCPointer<ByteVar>(), preserved.rawAddress.toCPointer<ByteVar>(), pstrprofilexml.rawAddress.toCPointer<ByteVar>(), pdwflags.rawAddress.toCPointer<ByteVar>(), pdwgrantedaccess.rawAddress.toCPointer<ByteVar>())

public actual fun wlanGetProfileCustomUserData(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, strprofilename: Pcwstr, preserved: ConstPtr<CVoid>, pdwdatasize: MutPtr<UInt>, ppdata: MutPtr<MutPtr<UByte>>): UInt =
    windowssysWindowsWin32NetworkmanagementWifiWlanGetProfileCustomUserData(hclienthandle.rawAddress.toCPointer<ByteVar>(), pinterfaceguid.rawAddress.toCPointer<ByteVar>(), strprofilename.rawAddress.toCPointer<ByteVar>(), preserved.rawAddress.toCPointer<ByteVar>(), pdwdatasize.rawAddress.toCPointer<ByteVar>(), ppdata.rawAddress.toCPointer<ByteVar>())

public actual fun wlanGetProfileList(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, preserved: ConstPtr<CVoid>, ppprofilelist: MutPtr<MutPtr<WlanProfileInfoList>>): UInt =
    windowssysWindowsWin32NetworkmanagementWifiWlanGetProfileList(hclienthandle.rawAddress.toCPointer<ByteVar>(), pinterfaceguid.rawAddress.toCPointer<ByteVar>(), preserved.rawAddress.toCPointer<ByteVar>(), ppprofilelist.rawAddress.toCPointer<ByteVar>())

public actual fun wlanGetSecuritySettings(hclienthandle: Handle, securableobject: WlanSecurableObject, pvaluetype: MutPtr<WlanOpcodeValueType>, pstrcurrentsddl: MutPtr<Pwstr>, pdwgrantedaccess: MutPtr<UInt>): UInt =
    windowssysWindowsWin32NetworkmanagementWifiWlanGetSecuritySettings(hclienthandle.rawAddress.toCPointer<ByteVar>(), securableobject, pvaluetype.rawAddress.toCPointer<ByteVar>(), pstrcurrentsddl.rawAddress.toCPointer<ByteVar>(), pdwgrantedaccess.rawAddress.toCPointer<ByteVar>())

public actual fun wlanGetSupportedDeviceServices(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, ppdevsvcguidlist: MutPtr<MutPtr<WlanDeviceServiceGuidList>>): UInt =
    windowssysWindowsWin32NetworkmanagementWifiWlanGetSupportedDeviceServices(hclienthandle.rawAddress.toCPointer<ByteVar>(), pinterfaceguid.rawAddress.toCPointer<ByteVar>(), ppdevsvcguidlist.rawAddress.toCPointer<ByteVar>())

public actual fun wlanHostedNetworkForceStart(hclienthandle: Handle, pfailreason: MutPtr<WlanHostedNetworkReason>, pvreserved: ConstPtr<CVoid>): UInt =
    windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkForceStart(hclienthandle.rawAddress.toCPointer<ByteVar>(), pfailreason.rawAddress.toCPointer<ByteVar>(), pvreserved.rawAddress.toCPointer<ByteVar>())

public actual fun wlanHostedNetworkForceStop(hclienthandle: Handle, pfailreason: MutPtr<WlanHostedNetworkReason>, pvreserved: ConstPtr<CVoid>): UInt =
    windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkForceStop(hclienthandle.rawAddress.toCPointer<ByteVar>(), pfailreason.rawAddress.toCPointer<ByteVar>(), pvreserved.rawAddress.toCPointer<ByteVar>())

public actual fun wlanHostedNetworkInitSettings(hclienthandle: Handle, pfailreason: MutPtr<WlanHostedNetworkReason>, pvreserved: ConstPtr<CVoid>): UInt =
    windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkInitSettings(hclienthandle.rawAddress.toCPointer<ByteVar>(), pfailreason.rawAddress.toCPointer<ByteVar>(), pvreserved.rawAddress.toCPointer<ByteVar>())

public actual fun wlanHostedNetworkQueryProperty(hclienthandle: Handle, opcode: WlanHostedNetworkOpcode, pdwdatasize: MutPtr<UInt>, ppvdata: MutPtr<MutPtr<CVoid>>, pwlanopcodevaluetype: MutPtr<WlanOpcodeValueType>, pvreserved: ConstPtr<CVoid>): UInt =
    windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkQueryProperty(hclienthandle.rawAddress.toCPointer<ByteVar>(), opcode, pdwdatasize.rawAddress.toCPointer<ByteVar>(), ppvdata.rawAddress.toCPointer<ByteVar>(), pwlanopcodevaluetype.rawAddress.toCPointer<ByteVar>(), pvreserved.rawAddress.toCPointer<ByteVar>())

public actual fun wlanHostedNetworkQuerySecondaryKey(hclienthandle: Handle, pdwkeylength: MutPtr<UInt>, ppuckeydata: MutPtr<MutPtr<UByte>>, pbispassphrase: MutPtr<Bool>, pbpersistent: MutPtr<Bool>, pfailreason: MutPtr<WlanHostedNetworkReason>, pvreserved: ConstPtr<CVoid>): UInt =
    windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkQuerySecondaryKey(hclienthandle.rawAddress.toCPointer<ByteVar>(), pdwkeylength.rawAddress.toCPointer<ByteVar>(), ppuckeydata.rawAddress.toCPointer<ByteVar>(), pbispassphrase.rawAddress.toCPointer<ByteVar>(), pbpersistent.rawAddress.toCPointer<ByteVar>(), pfailreason.rawAddress.toCPointer<ByteVar>(), pvreserved.rawAddress.toCPointer<ByteVar>())

public actual fun wlanHostedNetworkQueryStatus(hclienthandle: Handle, ppwlanhostednetworkstatus: MutPtr<MutPtr<WlanHostedNetworkStatus>>, pvreserved: ConstPtr<CVoid>): UInt =
    windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkQueryStatus(hclienthandle.rawAddress.toCPointer<ByteVar>(), ppwlanhostednetworkstatus.rawAddress.toCPointer<ByteVar>(), pvreserved.rawAddress.toCPointer<ByteVar>())

public actual fun wlanHostedNetworkRefreshSecuritySettings(hclienthandle: Handle, pfailreason: MutPtr<WlanHostedNetworkReason>, pvreserved: ConstPtr<CVoid>): UInt =
    windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkRefreshSecuritySettings(hclienthandle.rawAddress.toCPointer<ByteVar>(), pfailreason.rawAddress.toCPointer<ByteVar>(), pvreserved.rawAddress.toCPointer<ByteVar>())

public actual fun wlanHostedNetworkSetProperty(hclienthandle: Handle, opcode: WlanHostedNetworkOpcode, dwdatasize: UInt, pvdata: ConstPtr<CVoid>, pfailreason: MutPtr<WlanHostedNetworkReason>, pvreserved: ConstPtr<CVoid>): UInt =
    windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkSetProperty(hclienthandle.rawAddress.toCPointer<ByteVar>(), opcode, dwdatasize, pvdata.rawAddress.toCPointer<ByteVar>(), pfailreason.rawAddress.toCPointer<ByteVar>(), pvreserved.rawAddress.toCPointer<ByteVar>())

public actual fun wlanHostedNetworkSetSecondaryKey(hclienthandle: Handle, dwkeylength: UInt, puckeydata: ConstPtr<UByte>, bispassphrase: Bool, bpersistent: Bool, pfailreason: MutPtr<WlanHostedNetworkReason>, pvreserved: ConstPtr<CVoid>): UInt =
    windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkSetSecondaryKey(hclienthandle.rawAddress.toCPointer<ByteVar>(), dwkeylength, puckeydata.rawAddress.toCPointer<ByteVar>(), bispassphrase, bpersistent, pfailreason.rawAddress.toCPointer<ByteVar>(), pvreserved.rawAddress.toCPointer<ByteVar>())

public actual fun wlanHostedNetworkStartUsing(hclienthandle: Handle, pfailreason: MutPtr<WlanHostedNetworkReason>, pvreserved: ConstPtr<CVoid>): UInt =
    windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkStartUsing(hclienthandle.rawAddress.toCPointer<ByteVar>(), pfailreason.rawAddress.toCPointer<ByteVar>(), pvreserved.rawAddress.toCPointer<ByteVar>())

public actual fun wlanHostedNetworkStopUsing(hclienthandle: Handle, pfailreason: MutPtr<WlanHostedNetworkReason>, pvreserved: ConstPtr<CVoid>): UInt =
    windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkStopUsing(hclienthandle.rawAddress.toCPointer<ByteVar>(), pfailreason.rawAddress.toCPointer<ByteVar>(), pvreserved.rawAddress.toCPointer<ByteVar>())

public actual fun wlanIhvControl(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, type: WlanIhvControlType, dwinbuffersize: UInt, pinbuffer: ConstPtr<CVoid>, dwoutbuffersize: UInt, poutbuffer: MutPtr<CVoid>, pdwbytesreturned: MutPtr<UInt>): UInt =
    windowssysWindowsWin32NetworkmanagementWifiWlanIhvControl(hclienthandle.rawAddress.toCPointer<ByteVar>(), pinterfaceguid.rawAddress.toCPointer<ByteVar>(), type, dwinbuffersize, pinbuffer.rawAddress.toCPointer<ByteVar>(), dwoutbuffersize, poutbuffer.rawAddress.toCPointer<ByteVar>(), pdwbytesreturned.rawAddress.toCPointer<ByteVar>())

public actual fun wlanOpenHandle(dwclientversion: UInt, preserved: ConstPtr<CVoid>, pdwnegotiatedversion: MutPtr<UInt>, phclienthandle: MutPtr<Handle>): UInt =
    windowssysWindowsWin32NetworkmanagementWifiWlanOpenHandle(dwclientversion, preserved.rawAddress.toCPointer<ByteVar>(), pdwnegotiatedversion.rawAddress.toCPointer<ByteVar>(), phclienthandle.rawAddress.toCPointer<ByteVar>())

public actual fun wlanQueryAutoConfigParameter(hclienthandle: Handle, opcode: WlanAutoconfOpcode, preserved: ConstPtr<CVoid>, pdwdatasize: MutPtr<UInt>, ppdata: MutPtr<MutPtr<CVoid>>, pwlanopcodevaluetype: MutPtr<WlanOpcodeValueType>): UInt =
    windowssysWindowsWin32NetworkmanagementWifiWlanQueryAutoConfigParameter(hclienthandle.rawAddress.toCPointer<ByteVar>(), opcode, preserved.rawAddress.toCPointer<ByteVar>(), pdwdatasize.rawAddress.toCPointer<ByteVar>(), ppdata.rawAddress.toCPointer<ByteVar>(), pwlanopcodevaluetype.rawAddress.toCPointer<ByteVar>())

public actual fun wlanQueryInterface(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, opcode: WlanIntfOpcode, preserved: ConstPtr<CVoid>, pdwdatasize: MutPtr<UInt>, ppdata: MutPtr<MutPtr<CVoid>>, pwlanopcodevaluetype: MutPtr<WlanOpcodeValueType>): UInt =
    windowssysWindowsWin32NetworkmanagementWifiWlanQueryInterface(hclienthandle.rawAddress.toCPointer<ByteVar>(), pinterfaceguid.rawAddress.toCPointer<ByteVar>(), opcode, preserved.rawAddress.toCPointer<ByteVar>(), pdwdatasize.rawAddress.toCPointer<ByteVar>(), ppdata.rawAddress.toCPointer<ByteVar>(), pwlanopcodevaluetype.rawAddress.toCPointer<ByteVar>())

public actual fun wlanReasonCodeToString(dwreasoncode: UInt, dwbuffersize: UInt, pstringbuffer: Pcwstr, preserved: ConstPtr<CVoid>): UInt =
    windowssysWindowsWin32NetworkmanagementWifiWlanReasonCodeToString(dwreasoncode, dwbuffersize, pstringbuffer.rawAddress.toCPointer<ByteVar>(), preserved.rawAddress.toCPointer<ByteVar>())

public actual fun wlanRegisterDeviceServiceNotification(hclienthandle: Handle, pdevsvcguidlist: ConstPtr<WlanDeviceServiceGuidList>): UInt =
    windowssysWindowsWin32NetworkmanagementWifiWlanRegisterDeviceServiceNotification(hclienthandle.rawAddress.toCPointer<ByteVar>(), pdevsvcguidlist.rawAddress.toCPointer<ByteVar>())

public actual fun wlanRegisterNotification(hclienthandle: Handle, dwnotifsource: WlanNotificationSources, bignoreduplicate: Bool, funccallback: WlanNotificationCallback, pcallbackcontext: ConstPtr<CVoid>, preserved: ConstPtr<CVoid>, pdwprevnotifsource: MutPtr<UInt>): UInt =
    windowssysWindowsWin32NetworkmanagementWifiWlanRegisterNotification(hclienthandle.rawAddress.toCPointer<ByteVar>(), dwnotifsource, bignoreduplicate, 0L.toCPointer<ByteVar>(), pcallbackcontext.rawAddress.toCPointer<ByteVar>(), preserved.rawAddress.toCPointer<ByteVar>(), pdwprevnotifsource.rawAddress.toCPointer<ByteVar>())

public actual fun wlanRegisterVirtualStationNotification(hclienthandle: Handle, bregister: Bool, preserved: ConstPtr<CVoid>): UInt =
    windowssysWindowsWin32NetworkmanagementWifiWlanRegisterVirtualStationNotification(hclienthandle.rawAddress.toCPointer<ByteVar>(), bregister, preserved.rawAddress.toCPointer<ByteVar>())

public actual fun wlanRenameProfile(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, stroldprofilename: Pcwstr, strnewprofilename: Pcwstr, preserved: ConstPtr<CVoid>): UInt =
    windowssysWindowsWin32NetworkmanagementWifiWlanRenameProfile(hclienthandle.rawAddress.toCPointer<ByteVar>(), pinterfaceguid.rawAddress.toCPointer<ByteVar>(), stroldprofilename.rawAddress.toCPointer<ByteVar>(), strnewprofilename.rawAddress.toCPointer<ByteVar>(), preserved.rawAddress.toCPointer<ByteVar>())

public actual fun wlanSaveTemporaryProfile(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, strprofilename: Pcwstr, stralluserprofilesecurity: Pcwstr, dwflags: UInt, boverwrite: Bool, preserved: ConstPtr<CVoid>): UInt =
    windowssysWindowsWin32NetworkmanagementWifiWlanSaveTemporaryProfile(hclienthandle.rawAddress.toCPointer<ByteVar>(), pinterfaceguid.rawAddress.toCPointer<ByteVar>(), strprofilename.rawAddress.toCPointer<ByteVar>(), stralluserprofilesecurity.rawAddress.toCPointer<ByteVar>(), dwflags, boverwrite, preserved.rawAddress.toCPointer<ByteVar>())

public actual fun wlanScan(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, pdot11ssid: ConstPtr<Dot11Ssid>, piedata: ConstPtr<WlanRawData>, preserved: ConstPtr<CVoid>): UInt =
    windowssysWindowsWin32NetworkmanagementWifiWlanScan(hclienthandle.rawAddress.toCPointer<ByteVar>(), pinterfaceguid.rawAddress.toCPointer<ByteVar>(), pdot11ssid.rawAddress.toCPointer<ByteVar>(), piedata.rawAddress.toCPointer<ByteVar>(), preserved.rawAddress.toCPointer<ByteVar>())

public actual fun wlanSetAutoConfigParameter(hclienthandle: Handle, opcode: WlanAutoconfOpcode, dwdatasize: UInt, pdata: ConstPtr<CVoid>, preserved: ConstPtr<CVoid>): UInt =
    windowssysWindowsWin32NetworkmanagementWifiWlanSetAutoConfigParameter(hclienthandle.rawAddress.toCPointer<ByteVar>(), opcode, dwdatasize, pdata.rawAddress.toCPointer<ByteVar>(), preserved.rawAddress.toCPointer<ByteVar>())

public actual fun wlanSetFilterList(hclienthandle: Handle, wlanfilterlisttype: WlanFilterListType, pnetworklist: ConstPtr<Dot11NetworkList>, preserved: ConstPtr<CVoid>): UInt =
    windowssysWindowsWin32NetworkmanagementWifiWlanSetFilterList(hclienthandle.rawAddress.toCPointer<ByteVar>(), wlanfilterlisttype, pnetworklist.rawAddress.toCPointer<ByteVar>(), preserved.rawAddress.toCPointer<ByteVar>())

public actual fun wlanSetInterface(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, opcode: WlanIntfOpcode, dwdatasize: UInt, pdata: ConstPtr<CVoid>, preserved: ConstPtr<CVoid>): UInt =
    windowssysWindowsWin32NetworkmanagementWifiWlanSetInterface(hclienthandle.rawAddress.toCPointer<ByteVar>(), pinterfaceguid.rawAddress.toCPointer<ByteVar>(), opcode, dwdatasize, pdata.rawAddress.toCPointer<ByteVar>(), preserved.rawAddress.toCPointer<ByteVar>())

public actual fun wlanSetProfile(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, dwflags: UInt, strprofilexml: Pcwstr, stralluserprofilesecurity: Pcwstr, boverwrite: Bool, preserved: ConstPtr<CVoid>, pdwreasoncode: MutPtr<UInt>): UInt =
    windowssysWindowsWin32NetworkmanagementWifiWlanSetProfile(hclienthandle.rawAddress.toCPointer<ByteVar>(), pinterfaceguid.rawAddress.toCPointer<ByteVar>(), dwflags, strprofilexml.rawAddress.toCPointer<ByteVar>(), stralluserprofilesecurity.rawAddress.toCPointer<ByteVar>(), boverwrite, preserved.rawAddress.toCPointer<ByteVar>(), pdwreasoncode.rawAddress.toCPointer<ByteVar>())

public actual fun wlanSetProfileCustomUserData(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, strprofilename: Pcwstr, dwdatasize: UInt, pdata: ConstPtr<UByte>, preserved: ConstPtr<CVoid>): UInt =
    windowssysWindowsWin32NetworkmanagementWifiWlanSetProfileCustomUserData(hclienthandle.rawAddress.toCPointer<ByteVar>(), pinterfaceguid.rawAddress.toCPointer<ByteVar>(), strprofilename.rawAddress.toCPointer<ByteVar>(), dwdatasize, pdata.rawAddress.toCPointer<ByteVar>(), preserved.rawAddress.toCPointer<ByteVar>())

public actual fun wlanSetProfileEapUserData(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, strprofilename: Pcwstr, eaptype: EapMethodType, dwflags: WlanSetEaphostFlags, dweapuserdatasize: UInt, pbeapuserdata: ConstPtr<UByte>, preserved: ConstPtr<CVoid>): UInt =
    0u

public actual fun wlanSetProfileEapXmlUserData(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, strprofilename: Pcwstr, dwflags: WlanSetEaphostFlags, streapxmluserdata: Pcwstr, preserved: ConstPtr<CVoid>): UInt =
    windowssysWindowsWin32NetworkmanagementWifiWlanSetProfileEapXmlUserData(hclienthandle.rawAddress.toCPointer<ByteVar>(), pinterfaceguid.rawAddress.toCPointer<ByteVar>(), strprofilename.rawAddress.toCPointer<ByteVar>(), dwflags, streapxmluserdata.rawAddress.toCPointer<ByteVar>(), preserved.rawAddress.toCPointer<ByteVar>())

public actual fun wlanSetProfileList(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, dwitems: UInt, strprofilenames: ConstPtr<Pcwstr>, preserved: ConstPtr<CVoid>): UInt =
    windowssysWindowsWin32NetworkmanagementWifiWlanSetProfileList(hclienthandle.rawAddress.toCPointer<ByteVar>(), pinterfaceguid.rawAddress.toCPointer<ByteVar>(), dwitems, strprofilenames.rawAddress.toCPointer<ByteVar>(), preserved.rawAddress.toCPointer<ByteVar>())

public actual fun wlanSetProfilePosition(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, strprofilename: Pcwstr, dwposition: UInt, preserved: ConstPtr<CVoid>): UInt =
    windowssysWindowsWin32NetworkmanagementWifiWlanSetProfilePosition(hclienthandle.rawAddress.toCPointer<ByteVar>(), pinterfaceguid.rawAddress.toCPointer<ByteVar>(), strprofilename.rawAddress.toCPointer<ByteVar>(), dwposition, preserved.rawAddress.toCPointer<ByteVar>())

public actual fun wlanSetPsdIEDataList(hclienthandle: Handle, strformat: Pcwstr, ppsdiedatalist: ConstPtr<WlanRawDataList>, preserved: ConstPtr<CVoid>): UInt =
    windowssysWindowsWin32NetworkmanagementWifiWlanSetPsdIEDataList(hclienthandle.rawAddress.toCPointer<ByteVar>(), strformat.rawAddress.toCPointer<ByteVar>(), ppsdiedatalist.rawAddress.toCPointer<ByteVar>(), preserved.rawAddress.toCPointer<ByteVar>())

public actual fun wlanSetSecuritySettings(hclienthandle: Handle, securableobject: WlanSecurableObject, strmodifiedsddl: Pcwstr): UInt =
    windowssysWindowsWin32NetworkmanagementWifiWlanSetSecuritySettings(hclienthandle.rawAddress.toCPointer<ByteVar>(), securableobject, strmodifiedsddl.rawAddress.toCPointer<ByteVar>())

public actual fun wlanUIEditProfile(dwclientversion: UInt, wstrprofilename: Pcwstr, pinterfaceguid: ConstPtr<Guid>, hwnd: Hwnd, wlstartpage: WlDisplayPages, preserved: ConstPtr<CVoid>, pwlanreasoncode: MutPtr<UInt>): UInt =
    windowssysWindowsWin32NetworkmanagementWifiWlanUIEditProfile(dwclientversion, wstrprofilename.rawAddress.toCPointer<ByteVar>(), pinterfaceguid.rawAddress.toCPointer<ByteVar>(), hwnd.rawAddress.toCPointer<ByteVar>(), wlstartpage, preserved.rawAddress.toCPointer<ByteVar>(), pwlanreasoncode.rawAddress.toCPointer<ByteVar>())
