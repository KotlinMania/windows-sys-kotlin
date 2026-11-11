@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_wFDCancelOpenSession
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_wFDCloseHandle
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_wFDCloseSession
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_wFDOpenHandle
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_wFDOpenLegacySession
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_wFDStartOpenSession
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_wFDUpdateDeviceVisibility
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_wlanAllocateMemory
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_wlanCloseHandle
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_wlanConnect
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_wlanConnect2
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_wlanDeleteProfile
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_wlanDeviceServiceCommand
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_wlanDisconnect
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_wlanEnumInterfaces
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_wlanExtractPsdIEDataList
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_wlanFreeMemory
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_wlanGetAvailableNetworkList
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_wlanGetAvailableNetworkList2
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_wlanGetFilterList
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_wlanGetInterfaceCapability
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_wlanGetNetworkBssList
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_wlanGetProfile
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_wlanGetProfileCustomUserData
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_wlanGetProfileList
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_wlanGetSecuritySettings
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_wlanGetSupportedDeviceServices
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkForceStart
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkForceStop
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkInitSettings
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkQueryProperty
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkQuerySecondaryKey
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkQueryStatus
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkRefreshSecuritySettings
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkSetProperty
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkSetSecondaryKey
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkStartUsing
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkStopUsing
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_wlanIhvControl
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_wlanOpenHandle
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_wlanQueryAutoConfigParameter
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_wlanQueryInterface
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_wlanReasonCodeToString
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_wlanRegisterDeviceServiceNotification
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_wlanRegisterNotification
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_wlanRegisterVirtualStationNotification
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_wlanRenameProfile
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_wlanSaveTemporaryProfile
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_wlanScan
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_wlanSetAutoConfigParameter
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_wlanSetFilterList
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_wlanSetInterface
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_wlanSetProfile
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_wlanSetProfileCustomUserData
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_wlanSetProfileEapXmlUserData
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_wlanSetProfileList
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_wlanSetProfilePosition
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_wlanSetPsdIEDataList
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_wlanSetSecuritySettings
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_wlanUIEditProfile
import io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.EapMethodType
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun wFDCancelOpenSession(hsessionhandle: Handle): UInt =
    windowssys_windows_win32_networkmanagement_wifi_wFDCancelOpenSession(hsessionhandle?.value?.toCPointer<ByteVar>())

public actual fun wFDCloseHandle(hclienthandle: Handle): UInt =
    windowssys_windows_win32_networkmanagement_wifi_wFDCloseHandle(hclienthandle?.value?.toCPointer<ByteVar>())

public actual fun wFDCloseSession(hsessionhandle: Handle): UInt =
    windowssys_windows_win32_networkmanagement_wifi_wFDCloseSession(hsessionhandle?.value?.toCPointer<ByteVar>())

public actual fun wFDOpenHandle(dwclientversion: UInt, pdwnegotiatedversion: COpaquePointer?, phclienthandle: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_wifi_wFDOpenHandle(dwclientversion, pdwnegotiatedversion?.value?.toCPointer<ByteVar>(), phclienthandle?.value?.toCPointer<ByteVar>())

public actual fun wFDOpenLegacySession(hclienthandle: Handle, plegacymacaddress: COpaquePointer?, phsessionhandle: COpaquePointer?, pguidsessioninterface: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_wifi_wFDOpenLegacySession(hclienthandle?.value?.toCPointer<ByteVar>(), plegacymacaddress?.value?.toCPointer<ByteVar>(), phsessionhandle?.value?.toCPointer<ByteVar>(), pguidsessioninterface?.value?.toCPointer<ByteVar>())

public actual fun wFDStartOpenSession(hclienthandle: Handle, pdeviceaddress: COpaquePointer?, pvcontext: COpaquePointer?, pfncallback: WfdOpenSessionCompleteCallback, phsessionhandle: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_wifi_wFDStartOpenSession(hclienthandle?.value?.toCPointer<ByteVar>(), pdeviceaddress?.value?.toCPointer<ByteVar>(), pvcontext?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), phsessionhandle?.value?.toCPointer<ByteVar>())

public actual fun wFDUpdateDeviceVisibility(pdeviceaddress: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_wifi_wFDUpdateDeviceVisibility(pdeviceaddress?.value?.toCPointer<ByteVar>())

public actual fun wlanAllocateMemory(dwmemorysize: UInt): COpaquePointer? =
    windowssys_windows_win32_networkmanagement_wifi_wlanAllocateMemory(dwmemorysize)?.let { COpaquePointer(it.toLong()) }

public actual fun wlanCloseHandle(hclienthandle: Handle, preserved: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_wifi_wlanCloseHandle(hclienthandle?.value?.toCPointer<ByteVar>(), preserved?.value?.toCPointer<ByteVar>())

public actual fun wlanConnect(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, pconnectionparameters: COpaquePointer?, preserved: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_wifi_wlanConnect(hclienthandle?.value?.toCPointer<ByteVar>(), pinterfaceguid?.value?.toCPointer<ByteVar>(), pconnectionparameters?.value?.toCPointer<ByteVar>(), preserved?.value?.toCPointer<ByteVar>())

public actual fun wlanConnect2(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, pconnectionparameters: COpaquePointer?, preserved: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_wifi_wlanConnect2(hclienthandle?.value?.toCPointer<ByteVar>(), pinterfaceguid?.value?.toCPointer<ByteVar>(), pconnectionparameters?.value?.toCPointer<ByteVar>(), preserved?.value?.toCPointer<ByteVar>())

public actual fun wlanDeleteProfile(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, strprofilename: Pcwstr, preserved: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_wifi_wlanDeleteProfile(hclienthandle?.value?.toCPointer<ByteVar>(), pinterfaceguid?.value?.toCPointer<ByteVar>(), strprofilename?.value?.toCPointer<ByteVar>(), preserved?.value?.toCPointer<ByteVar>())

public actual fun wlanDeviceServiceCommand(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, pdeviceserviceguid: COpaquePointer?, dwopcode: UInt, dwinbuffersize: UInt, pinbuffer: COpaquePointer?, dwoutbuffersize: UInt, poutbuffer: COpaquePointer?, pdwbytesreturned: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_wifi_wlanDeviceServiceCommand(hclienthandle?.value?.toCPointer<ByteVar>(), pinterfaceguid?.value?.toCPointer<ByteVar>(), pdeviceserviceguid?.value?.toCPointer<ByteVar>(), dwopcode, dwinbuffersize, pinbuffer?.value?.toCPointer<ByteVar>(), dwoutbuffersize, poutbuffer?.value?.toCPointer<ByteVar>(), pdwbytesreturned?.value?.toCPointer<ByteVar>())

public actual fun wlanDisconnect(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, preserved: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_wifi_wlanDisconnect(hclienthandle?.value?.toCPointer<ByteVar>(), pinterfaceguid?.value?.toCPointer<ByteVar>(), preserved?.value?.toCPointer<ByteVar>())

public actual fun wlanEnumInterfaces(hclienthandle: Handle, preserved: COpaquePointer?, ppinterfacelist: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_wifi_wlanEnumInterfaces(hclienthandle?.value?.toCPointer<ByteVar>(), preserved?.value?.toCPointer<ByteVar>(), ppinterfacelist?.value?.toCPointer<ByteVar>())

public actual fun wlanExtractPsdIEDataList(hclienthandle: Handle, dwiedatasize: UInt, prawiedata: COpaquePointer?, strformat: Pcwstr, preserved: COpaquePointer?, pppsdiedatalist: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_wifi_wlanExtractPsdIEDataList(hclienthandle?.value?.toCPointer<ByteVar>(), dwiedatasize, prawiedata?.value?.toCPointer<ByteVar>(), strformat?.value?.toCPointer<ByteVar>(), preserved?.value?.toCPointer<ByteVar>(), pppsdiedatalist?.value?.toCPointer<ByteVar>())

public actual fun wlanFreeMemory(pmemory: COpaquePointer?) {
    windowssys_windows_win32_networkmanagement_wifi_wlanFreeMemory(pmemory?.value?.toCPointer<ByteVar>())
}

public actual fun wlanGetAvailableNetworkList(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, dwflags: UInt, preserved: COpaquePointer?, ppavailablenetworklist: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_wifi_wlanGetAvailableNetworkList(hclienthandle?.value?.toCPointer<ByteVar>(), pinterfaceguid?.value?.toCPointer<ByteVar>(), dwflags, preserved?.value?.toCPointer<ByteVar>(), ppavailablenetworklist?.value?.toCPointer<ByteVar>())

public actual fun wlanGetAvailableNetworkList2(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, dwflags: UInt, preserved: COpaquePointer?, ppavailablenetworklist: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_wifi_wlanGetAvailableNetworkList2(hclienthandle?.value?.toCPointer<ByteVar>(), pinterfaceguid?.value?.toCPointer<ByteVar>(), dwflags, preserved?.value?.toCPointer<ByteVar>(), ppavailablenetworklist?.value?.toCPointer<ByteVar>())

public actual fun wlanGetFilterList(hclienthandle: Handle, wlanfilterlisttype: WlanFilterListType, preserved: COpaquePointer?, ppnetworklist: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_wifi_wlanGetFilterList(hclienthandle?.value?.toCPointer<ByteVar>(), wlanfilterlisttype, preserved?.value?.toCPointer<ByteVar>(), ppnetworklist?.value?.toCPointer<ByteVar>())

public actual fun wlanGetInterfaceCapability(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, preserved: COpaquePointer?, ppcapability: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_wifi_wlanGetInterfaceCapability(hclienthandle?.value?.toCPointer<ByteVar>(), pinterfaceguid?.value?.toCPointer<ByteVar>(), preserved?.value?.toCPointer<ByteVar>(), ppcapability?.value?.toCPointer<ByteVar>())

public actual fun wlanGetNetworkBssList(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, pdot11ssid: COpaquePointer?, dot11bsstype: Dot11BssType, bsecurityenabled: Bool, preserved: COpaquePointer?, ppwlanbsslist: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_wifi_wlanGetNetworkBssList(hclienthandle?.value?.toCPointer<ByteVar>(), pinterfaceguid?.value?.toCPointer<ByteVar>(), pdot11ssid?.value?.toCPointer<ByteVar>(), dot11bsstype, bsecurityenabled, preserved?.value?.toCPointer<ByteVar>(), ppwlanbsslist?.value?.toCPointer<ByteVar>())

public actual fun wlanGetProfile(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, strprofilename: Pcwstr, preserved: COpaquePointer?, pstrprofilexml: COpaquePointer?, pdwflags: COpaquePointer?, pdwgrantedaccess: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_wifi_wlanGetProfile(hclienthandle?.value?.toCPointer<ByteVar>(), pinterfaceguid?.value?.toCPointer<ByteVar>(), strprofilename?.value?.toCPointer<ByteVar>(), preserved?.value?.toCPointer<ByteVar>(), pstrprofilexml?.value?.toCPointer<ByteVar>(), pdwflags?.value?.toCPointer<ByteVar>(), pdwgrantedaccess?.value?.toCPointer<ByteVar>())

public actual fun wlanGetProfileCustomUserData(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, strprofilename: Pcwstr, preserved: COpaquePointer?, pdwdatasize: COpaquePointer?, ppdata: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_wifi_wlanGetProfileCustomUserData(hclienthandle?.value?.toCPointer<ByteVar>(), pinterfaceguid?.value?.toCPointer<ByteVar>(), strprofilename?.value?.toCPointer<ByteVar>(), preserved?.value?.toCPointer<ByteVar>(), pdwdatasize?.value?.toCPointer<ByteVar>(), ppdata?.value?.toCPointer<ByteVar>())

public actual fun wlanGetProfileList(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, preserved: COpaquePointer?, ppprofilelist: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_wifi_wlanGetProfileList(hclienthandle?.value?.toCPointer<ByteVar>(), pinterfaceguid?.value?.toCPointer<ByteVar>(), preserved?.value?.toCPointer<ByteVar>(), ppprofilelist?.value?.toCPointer<ByteVar>())

public actual fun wlanGetSecuritySettings(hclienthandle: Handle, securableobject: WlanSecurableObject, pvaluetype: COpaquePointer?, pstrcurrentsddl: COpaquePointer?, pdwgrantedaccess: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_wifi_wlanGetSecuritySettings(hclienthandle?.value?.toCPointer<ByteVar>(), securableobject, pvaluetype?.value?.toCPointer<ByteVar>(), pstrcurrentsddl?.value?.toCPointer<ByteVar>(), pdwgrantedaccess?.value?.toCPointer<ByteVar>())

public actual fun wlanGetSupportedDeviceServices(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, ppdevsvcguidlist: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_wifi_wlanGetSupportedDeviceServices(hclienthandle?.value?.toCPointer<ByteVar>(), pinterfaceguid?.value?.toCPointer<ByteVar>(), ppdevsvcguidlist?.value?.toCPointer<ByteVar>())

public actual fun wlanHostedNetworkForceStart(hclienthandle: Handle, pfailreason: COpaquePointer?, pvreserved: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkForceStart(hclienthandle?.value?.toCPointer<ByteVar>(), pfailreason?.value?.toCPointer<ByteVar>(), pvreserved?.value?.toCPointer<ByteVar>())

public actual fun wlanHostedNetworkForceStop(hclienthandle: Handle, pfailreason: COpaquePointer?, pvreserved: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkForceStop(hclienthandle?.value?.toCPointer<ByteVar>(), pfailreason?.value?.toCPointer<ByteVar>(), pvreserved?.value?.toCPointer<ByteVar>())

public actual fun wlanHostedNetworkInitSettings(hclienthandle: Handle, pfailreason: COpaquePointer?, pvreserved: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkInitSettings(hclienthandle?.value?.toCPointer<ByteVar>(), pfailreason?.value?.toCPointer<ByteVar>(), pvreserved?.value?.toCPointer<ByteVar>())

public actual fun wlanHostedNetworkQueryProperty(hclienthandle: Handle, opcode: WlanHostedNetworkOpcode, pdwdatasize: COpaquePointer?, ppvdata: COpaquePointer?, pwlanopcodevaluetype: COpaquePointer?, pvreserved: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkQueryProperty(hclienthandle?.value?.toCPointer<ByteVar>(), opcode, pdwdatasize?.value?.toCPointer<ByteVar>(), ppvdata?.value?.toCPointer<ByteVar>(), pwlanopcodevaluetype?.value?.toCPointer<ByteVar>(), pvreserved?.value?.toCPointer<ByteVar>())

public actual fun wlanHostedNetworkQuerySecondaryKey(hclienthandle: Handle, pdwkeylength: COpaquePointer?, ppuckeydata: COpaquePointer?, pbispassphrase: COpaquePointer?, pbpersistent: COpaquePointer?, pfailreason: COpaquePointer?, pvreserved: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkQuerySecondaryKey(hclienthandle?.value?.toCPointer<ByteVar>(), pdwkeylength?.value?.toCPointer<ByteVar>(), ppuckeydata?.value?.toCPointer<ByteVar>(), pbispassphrase?.value?.toCPointer<ByteVar>(), pbpersistent?.value?.toCPointer<ByteVar>(), pfailreason?.value?.toCPointer<ByteVar>(), pvreserved?.value?.toCPointer<ByteVar>())

public actual fun wlanHostedNetworkQueryStatus(hclienthandle: Handle, ppwlanhostednetworkstatus: COpaquePointer?, pvreserved: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkQueryStatus(hclienthandle?.value?.toCPointer<ByteVar>(), ppwlanhostednetworkstatus?.value?.toCPointer<ByteVar>(), pvreserved?.value?.toCPointer<ByteVar>())

public actual fun wlanHostedNetworkRefreshSecuritySettings(hclienthandle: Handle, pfailreason: COpaquePointer?, pvreserved: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkRefreshSecuritySettings(hclienthandle?.value?.toCPointer<ByteVar>(), pfailreason?.value?.toCPointer<ByteVar>(), pvreserved?.value?.toCPointer<ByteVar>())

public actual fun wlanHostedNetworkSetProperty(hclienthandle: Handle, opcode: WlanHostedNetworkOpcode, dwdatasize: UInt, pvdata: COpaquePointer?, pfailreason: COpaquePointer?, pvreserved: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkSetProperty(hclienthandle?.value?.toCPointer<ByteVar>(), opcode, dwdatasize, pvdata?.value?.toCPointer<ByteVar>(), pfailreason?.value?.toCPointer<ByteVar>(), pvreserved?.value?.toCPointer<ByteVar>())

public actual fun wlanHostedNetworkSetSecondaryKey(hclienthandle: Handle, dwkeylength: UInt, puckeydata: COpaquePointer?, bispassphrase: Bool, bpersistent: Bool, pfailreason: COpaquePointer?, pvreserved: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkSetSecondaryKey(hclienthandle?.value?.toCPointer<ByteVar>(), dwkeylength, puckeydata?.value?.toCPointer<ByteVar>(), bispassphrase, bpersistent, pfailreason?.value?.toCPointer<ByteVar>(), pvreserved?.value?.toCPointer<ByteVar>())

public actual fun wlanHostedNetworkStartUsing(hclienthandle: Handle, pfailreason: COpaquePointer?, pvreserved: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkStartUsing(hclienthandle?.value?.toCPointer<ByteVar>(), pfailreason?.value?.toCPointer<ByteVar>(), pvreserved?.value?.toCPointer<ByteVar>())

public actual fun wlanHostedNetworkStopUsing(hclienthandle: Handle, pfailreason: COpaquePointer?, pvreserved: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkStopUsing(hclienthandle?.value?.toCPointer<ByteVar>(), pfailreason?.value?.toCPointer<ByteVar>(), pvreserved?.value?.toCPointer<ByteVar>())

public actual fun wlanIhvControl(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, type: WlanIhvControlType, dwinbuffersize: UInt, pinbuffer: COpaquePointer?, dwoutbuffersize: UInt, poutbuffer: COpaquePointer?, pdwbytesreturned: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_wifi_wlanIhvControl(hclienthandle?.value?.toCPointer<ByteVar>(), pinterfaceguid?.value?.toCPointer<ByteVar>(), type, dwinbuffersize, pinbuffer?.value?.toCPointer<ByteVar>(), dwoutbuffersize, poutbuffer?.value?.toCPointer<ByteVar>(), pdwbytesreturned?.value?.toCPointer<ByteVar>())

public actual fun wlanOpenHandle(dwclientversion: UInt, preserved: COpaquePointer?, pdwnegotiatedversion: COpaquePointer?, phclienthandle: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_wifi_wlanOpenHandle(dwclientversion, preserved?.value?.toCPointer<ByteVar>(), pdwnegotiatedversion?.value?.toCPointer<ByteVar>(), phclienthandle?.value?.toCPointer<ByteVar>())

public actual fun wlanQueryAutoConfigParameter(hclienthandle: Handle, opcode: WlanAutoconfOpcode, preserved: COpaquePointer?, pdwdatasize: COpaquePointer?, ppdata: COpaquePointer?, pwlanopcodevaluetype: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_wifi_wlanQueryAutoConfigParameter(hclienthandle?.value?.toCPointer<ByteVar>(), opcode, preserved?.value?.toCPointer<ByteVar>(), pdwdatasize?.value?.toCPointer<ByteVar>(), ppdata?.value?.toCPointer<ByteVar>(), pwlanopcodevaluetype?.value?.toCPointer<ByteVar>())

public actual fun wlanQueryInterface(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, opcode: WlanIntfOpcode, preserved: COpaquePointer?, pdwdatasize: COpaquePointer?, ppdata: COpaquePointer?, pwlanopcodevaluetype: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_wifi_wlanQueryInterface(hclienthandle?.value?.toCPointer<ByteVar>(), pinterfaceguid?.value?.toCPointer<ByteVar>(), opcode, preserved?.value?.toCPointer<ByteVar>(), pdwdatasize?.value?.toCPointer<ByteVar>(), ppdata?.value?.toCPointer<ByteVar>(), pwlanopcodevaluetype?.value?.toCPointer<ByteVar>())

public actual fun wlanReasonCodeToString(dwreasoncode: UInt, dwbuffersize: UInt, pstringbuffer: Pcwstr, preserved: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_wifi_wlanReasonCodeToString(dwreasoncode, dwbuffersize, pstringbuffer?.value?.toCPointer<ByteVar>(), preserved?.value?.toCPointer<ByteVar>())

public actual fun wlanRegisterDeviceServiceNotification(hclienthandle: Handle, pdevsvcguidlist: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_wifi_wlanRegisterDeviceServiceNotification(hclienthandle?.value?.toCPointer<ByteVar>(), pdevsvcguidlist?.value?.toCPointer<ByteVar>())

public actual fun wlanRegisterNotification(hclienthandle: Handle, dwnotifsource: WlanNotificationSources, bignoreduplicate: Bool, funccallback: WlanNotificationCallback, pcallbackcontext: COpaquePointer?, preserved: COpaquePointer?, pdwprevnotifsource: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_wifi_wlanRegisterNotification(hclienthandle?.value?.toCPointer<ByteVar>(), dwnotifsource, bignoreduplicate, 0L.toCPointer<ByteVar>(), pcallbackcontext?.value?.toCPointer<ByteVar>(), preserved?.value?.toCPointer<ByteVar>(), pdwprevnotifsource?.value?.toCPointer<ByteVar>())

public actual fun wlanRegisterVirtualStationNotification(hclienthandle: Handle, bregister: Bool, preserved: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_wifi_wlanRegisterVirtualStationNotification(hclienthandle?.value?.toCPointer<ByteVar>(), bregister, preserved?.value?.toCPointer<ByteVar>())

public actual fun wlanRenameProfile(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, stroldprofilename: Pcwstr, strnewprofilename: Pcwstr, preserved: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_wifi_wlanRenameProfile(hclienthandle?.value?.toCPointer<ByteVar>(), pinterfaceguid?.value?.toCPointer<ByteVar>(), stroldprofilename?.value?.toCPointer<ByteVar>(), strnewprofilename?.value?.toCPointer<ByteVar>(), preserved?.value?.toCPointer<ByteVar>())

public actual fun wlanSaveTemporaryProfile(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, strprofilename: Pcwstr, stralluserprofilesecurity: Pcwstr, dwflags: UInt, boverwrite: Bool, preserved: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_wifi_wlanSaveTemporaryProfile(hclienthandle?.value?.toCPointer<ByteVar>(), pinterfaceguid?.value?.toCPointer<ByteVar>(), strprofilename?.value?.toCPointer<ByteVar>(), stralluserprofilesecurity?.value?.toCPointer<ByteVar>(), dwflags, boverwrite, preserved?.value?.toCPointer<ByteVar>())

public actual fun wlanScan(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, pdot11ssid: COpaquePointer?, piedata: COpaquePointer?, preserved: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_wifi_wlanScan(hclienthandle?.value?.toCPointer<ByteVar>(), pinterfaceguid?.value?.toCPointer<ByteVar>(), pdot11ssid?.value?.toCPointer<ByteVar>(), piedata?.value?.toCPointer<ByteVar>(), preserved?.value?.toCPointer<ByteVar>())

public actual fun wlanSetAutoConfigParameter(hclienthandle: Handle, opcode: WlanAutoconfOpcode, dwdatasize: UInt, pdata: COpaquePointer?, preserved: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_wifi_wlanSetAutoConfigParameter(hclienthandle?.value?.toCPointer<ByteVar>(), opcode, dwdatasize, pdata?.value?.toCPointer<ByteVar>(), preserved?.value?.toCPointer<ByteVar>())

public actual fun wlanSetFilterList(hclienthandle: Handle, wlanfilterlisttype: WlanFilterListType, pnetworklist: COpaquePointer?, preserved: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_wifi_wlanSetFilterList(hclienthandle?.value?.toCPointer<ByteVar>(), wlanfilterlisttype, pnetworklist?.value?.toCPointer<ByteVar>(), preserved?.value?.toCPointer<ByteVar>())

public actual fun wlanSetInterface(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, opcode: WlanIntfOpcode, dwdatasize: UInt, pdata: COpaquePointer?, preserved: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_wifi_wlanSetInterface(hclienthandle?.value?.toCPointer<ByteVar>(), pinterfaceguid?.value?.toCPointer<ByteVar>(), opcode, dwdatasize, pdata?.value?.toCPointer<ByteVar>(), preserved?.value?.toCPointer<ByteVar>())

public actual fun wlanSetProfile(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, dwflags: UInt, strprofilexml: Pcwstr, stralluserprofilesecurity: Pcwstr, boverwrite: Bool, preserved: COpaquePointer?, pdwreasoncode: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_wifi_wlanSetProfile(hclienthandle?.value?.toCPointer<ByteVar>(), pinterfaceguid?.value?.toCPointer<ByteVar>(), dwflags, strprofilexml?.value?.toCPointer<ByteVar>(), stralluserprofilesecurity?.value?.toCPointer<ByteVar>(), boverwrite, preserved?.value?.toCPointer<ByteVar>(), pdwreasoncode?.value?.toCPointer<ByteVar>())

public actual fun wlanSetProfileCustomUserData(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, strprofilename: Pcwstr, dwdatasize: UInt, pdata: COpaquePointer?, preserved: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_wifi_wlanSetProfileCustomUserData(hclienthandle?.value?.toCPointer<ByteVar>(), pinterfaceguid?.value?.toCPointer<ByteVar>(), strprofilename?.value?.toCPointer<ByteVar>(), dwdatasize, pdata?.value?.toCPointer<ByteVar>(), preserved?.value?.toCPointer<ByteVar>())

public actual fun wlanSetProfileEapUserData(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, strprofilename: Pcwstr, eaptype: EapMethodType, dwflags: WlanSetEaphostFlags, dweapuserdatasize: UInt, pbeapuserdata: COpaquePointer?, preserved: COpaquePointer?): UInt =
    0u

public actual fun wlanSetProfileEapXmlUserData(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, strprofilename: Pcwstr, dwflags: WlanSetEaphostFlags, streapxmluserdata: Pcwstr, preserved: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_wifi_wlanSetProfileEapXmlUserData(hclienthandle?.value?.toCPointer<ByteVar>(), pinterfaceguid?.value?.toCPointer<ByteVar>(), strprofilename?.value?.toCPointer<ByteVar>(), dwflags, streapxmluserdata?.value?.toCPointer<ByteVar>(), preserved?.value?.toCPointer<ByteVar>())

public actual fun wlanSetProfileList(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, dwitems: UInt, strprofilenames: COpaquePointer?, preserved: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_wifi_wlanSetProfileList(hclienthandle?.value?.toCPointer<ByteVar>(), pinterfaceguid?.value?.toCPointer<ByteVar>(), dwitems, strprofilenames?.value?.toCPointer<ByteVar>(), preserved?.value?.toCPointer<ByteVar>())

public actual fun wlanSetProfilePosition(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, strprofilename: Pcwstr, dwposition: UInt, preserved: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_wifi_wlanSetProfilePosition(hclienthandle?.value?.toCPointer<ByteVar>(), pinterfaceguid?.value?.toCPointer<ByteVar>(), strprofilename?.value?.toCPointer<ByteVar>(), dwposition, preserved?.value?.toCPointer<ByteVar>())

public actual fun wlanSetPsdIEDataList(hclienthandle: Handle, strformat: Pcwstr, ppsdiedatalist: COpaquePointer?, preserved: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_wifi_wlanSetPsdIEDataList(hclienthandle?.value?.toCPointer<ByteVar>(), strformat?.value?.toCPointer<ByteVar>(), ppsdiedatalist?.value?.toCPointer<ByteVar>(), preserved?.value?.toCPointer<ByteVar>())

public actual fun wlanSetSecuritySettings(hclienthandle: Handle, securableobject: WlanSecurableObject, strmodifiedsddl: Pcwstr): UInt =
    windowssys_windows_win32_networkmanagement_wifi_wlanSetSecuritySettings(hclienthandle?.value?.toCPointer<ByteVar>(), securableobject, strmodifiedsddl?.value?.toCPointer<ByteVar>())

public actual fun wlanUIEditProfile(dwclientversion: UInt, wstrprofilename: Pcwstr, pinterfaceguid: COpaquePointer?, hwnd: Hwnd, wlstartpage: WlDisplayPages, preserved: COpaquePointer?, pwlanreasoncode: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_wifi_wlanUIEditProfile(dwclientversion, wstrprofilename?.value?.toCPointer<ByteVar>(), pinterfaceguid?.value?.toCPointer<ByteVar>(), hwnd?.value?.toCPointer<ByteVar>(), wlstartpage, preserved?.value?.toCPointer<ByteVar>(), pwlanreasoncode?.value?.toCPointer<ByteVar>())
