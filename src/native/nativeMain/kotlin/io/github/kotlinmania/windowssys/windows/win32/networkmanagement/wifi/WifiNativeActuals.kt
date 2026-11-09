@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.EAP_METHOD_TYPE
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun WFDCancelOpenSession(hsessionhandle: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_WFDCancelOpenSession(hsessionhandle.toCPointer<ByteVar>())

public actual fun WFDCloseHandle(hclienthandle: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_WFDCloseHandle(hclienthandle.toCPointer<ByteVar>())

public actual fun WFDCloseSession(hsessionhandle: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_WFDCloseSession(hsessionhandle.toCPointer<ByteVar>())

public actual fun WFDOpenHandle(dwclientversion: UInt, pdwnegotiatedversion: Long, phclienthandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_WFDOpenHandle(dwclientversion, pdwnegotiatedversion.toCPointer<ByteVar>(), phclienthandle.toCPointer<ByteVar>())

public actual fun WFDOpenLegacySession(hclienthandle: HANDLE, plegacymacaddress: Long, phsessionhandle: Long, pguidsessioninterface: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_WFDOpenLegacySession(hclienthandle.toCPointer<ByteVar>(), plegacymacaddress.toCPointer<ByteVar>(), phsessionhandle.toCPointer<ByteVar>(), pguidsessioninterface.toCPointer<ByteVar>())

public actual fun WFDStartOpenSession(hclienthandle: HANDLE, pdeviceaddress: Long, pvcontext: Long, pfncallback: WFD_OPEN_SESSION_COMPLETE_CALLBACK, phsessionhandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_WFDStartOpenSession(hclienthandle.toCPointer<ByteVar>(), pdeviceaddress.toCPointer<ByteVar>(), pvcontext.toCPointer<ByteVar>(), pfncallback.toLong().toCPointer<ByteVar>(), phsessionhandle.toCPointer<ByteVar>())

public actual fun WFDUpdateDeviceVisibility(pdeviceaddress: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_WFDUpdateDeviceVisibility(pdeviceaddress.toCPointer<ByteVar>())

public actual fun WlanAllocateMemory(dwmemorysize: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_WlanAllocateMemory(dwmemorysize)?.toLong() ?: 0L

public actual fun WlanCloseHandle(hclienthandle: HANDLE, preserved: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_WlanCloseHandle(hclienthandle.toCPointer<ByteVar>(), preserved.toCPointer<ByteVar>())

public actual fun WlanConnect(hclienthandle: HANDLE, pinterfaceguid: Long, pconnectionparameters: Long, preserved: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_WlanConnect(hclienthandle.toCPointer<ByteVar>(), pinterfaceguid.toCPointer<ByteVar>(), pconnectionparameters.toCPointer<ByteVar>(), preserved.toCPointer<ByteVar>())

public actual fun WlanConnect2(hclienthandle: HANDLE, pinterfaceguid: Long, pconnectionparameters: Long, preserved: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_WlanConnect2(hclienthandle.toCPointer<ByteVar>(), pinterfaceguid.toCPointer<ByteVar>(), pconnectionparameters.toCPointer<ByteVar>(), preserved.toCPointer<ByteVar>())

public actual fun WlanDeleteProfile(hclienthandle: HANDLE, pinterfaceguid: Long, strprofilename: PCWSTR, preserved: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_WlanDeleteProfile(hclienthandle.toCPointer<ByteVar>(), pinterfaceguid.toCPointer<ByteVar>(), strprofilename.toCPointer<ByteVar>(), preserved.toCPointer<ByteVar>())

public actual fun WlanDeviceServiceCommand(hclienthandle: HANDLE, pinterfaceguid: Long, pdeviceserviceguid: Long, dwopcode: UInt, dwinbuffersize: UInt, pinbuffer: Long, dwoutbuffersize: UInt, poutbuffer: Long, pdwbytesreturned: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_WlanDeviceServiceCommand(hclienthandle.toCPointer<ByteVar>(), pinterfaceguid.toCPointer<ByteVar>(), pdeviceserviceguid.toCPointer<ByteVar>(), dwopcode, dwinbuffersize, pinbuffer.toCPointer<ByteVar>(), dwoutbuffersize, poutbuffer.toCPointer<ByteVar>(), pdwbytesreturned.toCPointer<ByteVar>())

public actual fun WlanDisconnect(hclienthandle: HANDLE, pinterfaceguid: Long, preserved: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_WlanDisconnect(hclienthandle.toCPointer<ByteVar>(), pinterfaceguid.toCPointer<ByteVar>(), preserved.toCPointer<ByteVar>())

public actual fun WlanEnumInterfaces(hclienthandle: HANDLE, preserved: Long, ppinterfacelist: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_WlanEnumInterfaces(hclienthandle.toCPointer<ByteVar>(), preserved.toCPointer<ByteVar>(), ppinterfacelist.toCPointer<ByteVar>())

public actual fun WlanExtractPsdIEDataList(hclienthandle: HANDLE, dwiedatasize: UInt, prawiedata: Long, strformat: PCWSTR, preserved: Long, pppsdiedatalist: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_WlanExtractPsdIEDataList(hclienthandle.toCPointer<ByteVar>(), dwiedatasize, prawiedata.toCPointer<ByteVar>(), strformat.toCPointer<ByteVar>(), preserved.toCPointer<ByteVar>(), pppsdiedatalist.toCPointer<ByteVar>())

public actual fun WlanFreeMemory(pmemory: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_WlanFreeMemory(pmemory.toCPointer<ByteVar>())
}

public actual fun WlanGetAvailableNetworkList(hclienthandle: HANDLE, pinterfaceguid: Long, dwflags: UInt, preserved: Long, ppavailablenetworklist: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_WlanGetAvailableNetworkList(hclienthandle.toCPointer<ByteVar>(), pinterfaceguid.toCPointer<ByteVar>(), dwflags, preserved.toCPointer<ByteVar>(), ppavailablenetworklist.toCPointer<ByteVar>())

public actual fun WlanGetAvailableNetworkList2(hclienthandle: HANDLE, pinterfaceguid: Long, dwflags: UInt, preserved: Long, ppavailablenetworklist: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_WlanGetAvailableNetworkList2(hclienthandle.toCPointer<ByteVar>(), pinterfaceguid.toCPointer<ByteVar>(), dwflags, preserved.toCPointer<ByteVar>(), ppavailablenetworklist.toCPointer<ByteVar>())

public actual fun WlanGetFilterList(hclienthandle: HANDLE, wlanfilterlisttype: WLAN_FILTER_LIST_TYPE, preserved: Long, ppnetworklist: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_WlanGetFilterList(hclienthandle.toCPointer<ByteVar>(), wlanfilterlisttype, preserved.toCPointer<ByteVar>(), ppnetworklist.toCPointer<ByteVar>())

public actual fun WlanGetInterfaceCapability(hclienthandle: HANDLE, pinterfaceguid: Long, preserved: Long, ppcapability: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_WlanGetInterfaceCapability(hclienthandle.toCPointer<ByteVar>(), pinterfaceguid.toCPointer<ByteVar>(), preserved.toCPointer<ByteVar>(), ppcapability.toCPointer<ByteVar>())

public actual fun WlanGetNetworkBssList(hclienthandle: HANDLE, pinterfaceguid: Long, pdot11ssid: Long, dot11bsstype: DOT11_BSS_TYPE, bsecurityenabled: BOOL, preserved: Long, ppwlanbsslist: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_WlanGetNetworkBssList(hclienthandle.toCPointer<ByteVar>(), pinterfaceguid.toCPointer<ByteVar>(), pdot11ssid.toCPointer<ByteVar>(), dot11bsstype, bsecurityenabled, preserved.toCPointer<ByteVar>(), ppwlanbsslist.toCPointer<ByteVar>())

public actual fun WlanGetProfile(hclienthandle: HANDLE, pinterfaceguid: Long, strprofilename: PCWSTR, preserved: Long, pstrprofilexml: Long, pdwflags: Long, pdwgrantedaccess: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_WlanGetProfile(hclienthandle.toCPointer<ByteVar>(), pinterfaceguid.toCPointer<ByteVar>(), strprofilename.toCPointer<ByteVar>(), preserved.toCPointer<ByteVar>(), pstrprofilexml.toCPointer<ByteVar>(), pdwflags.toCPointer<ByteVar>(), pdwgrantedaccess.toCPointer<ByteVar>())

public actual fun WlanGetProfileCustomUserData(hclienthandle: HANDLE, pinterfaceguid: Long, strprofilename: PCWSTR, preserved: Long, pdwdatasize: Long, ppdata: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_WlanGetProfileCustomUserData(hclienthandle.toCPointer<ByteVar>(), pinterfaceguid.toCPointer<ByteVar>(), strprofilename.toCPointer<ByteVar>(), preserved.toCPointer<ByteVar>(), pdwdatasize.toCPointer<ByteVar>(), ppdata.toCPointer<ByteVar>())

public actual fun WlanGetProfileList(hclienthandle: HANDLE, pinterfaceguid: Long, preserved: Long, ppprofilelist: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_WlanGetProfileList(hclienthandle.toCPointer<ByteVar>(), pinterfaceguid.toCPointer<ByteVar>(), preserved.toCPointer<ByteVar>(), ppprofilelist.toCPointer<ByteVar>())

public actual fun WlanGetSecuritySettings(hclienthandle: HANDLE, securableobject: WLAN_SECURABLE_OBJECT, pvaluetype: Long, pstrcurrentsddl: Long, pdwgrantedaccess: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_WlanGetSecuritySettings(hclienthandle.toCPointer<ByteVar>(), securableobject, pvaluetype.toCPointer<ByteVar>(), pstrcurrentsddl.toCPointer<ByteVar>(), pdwgrantedaccess.toCPointer<ByteVar>())

public actual fun WlanGetSupportedDeviceServices(hclienthandle: HANDLE, pinterfaceguid: Long, ppdevsvcguidlist: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_WlanGetSupportedDeviceServices(hclienthandle.toCPointer<ByteVar>(), pinterfaceguid.toCPointer<ByteVar>(), ppdevsvcguidlist.toCPointer<ByteVar>())

public actual fun WlanHostedNetworkForceStart(hclienthandle: HANDLE, pfailreason: Long, pvreserved: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_WlanHostedNetworkForceStart(hclienthandle.toCPointer<ByteVar>(), pfailreason.toCPointer<ByteVar>(), pvreserved.toCPointer<ByteVar>())

public actual fun WlanHostedNetworkForceStop(hclienthandle: HANDLE, pfailreason: Long, pvreserved: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_WlanHostedNetworkForceStop(hclienthandle.toCPointer<ByteVar>(), pfailreason.toCPointer<ByteVar>(), pvreserved.toCPointer<ByteVar>())

public actual fun WlanHostedNetworkInitSettings(hclienthandle: HANDLE, pfailreason: Long, pvreserved: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_WlanHostedNetworkInitSettings(hclienthandle.toCPointer<ByteVar>(), pfailreason.toCPointer<ByteVar>(), pvreserved.toCPointer<ByteVar>())

public actual fun WlanHostedNetworkQueryProperty(hclienthandle: HANDLE, opcode: WLAN_HOSTED_NETWORK_OPCODE, pdwdatasize: Long, ppvdata: Long, pwlanopcodevaluetype: Long, pvreserved: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_WlanHostedNetworkQueryProperty(hclienthandle.toCPointer<ByteVar>(), opcode, pdwdatasize.toCPointer<ByteVar>(), ppvdata.toCPointer<ByteVar>(), pwlanopcodevaluetype.toCPointer<ByteVar>(), pvreserved.toCPointer<ByteVar>())

public actual fun WlanHostedNetworkQuerySecondaryKey(hclienthandle: HANDLE, pdwkeylength: Long, ppuckeydata: Long, pbispassphrase: Long, pbpersistent: Long, pfailreason: Long, pvreserved: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_WlanHostedNetworkQuerySecondaryKey(hclienthandle.toCPointer<ByteVar>(), pdwkeylength.toCPointer<ByteVar>(), ppuckeydata.toCPointer<ByteVar>(), pbispassphrase.toCPointer<ByteVar>(), pbpersistent.toCPointer<ByteVar>(), pfailreason.toCPointer<ByteVar>(), pvreserved.toCPointer<ByteVar>())

public actual fun WlanHostedNetworkQueryStatus(hclienthandle: HANDLE, ppwlanhostednetworkstatus: Long, pvreserved: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_WlanHostedNetworkQueryStatus(hclienthandle.toCPointer<ByteVar>(), ppwlanhostednetworkstatus.toCPointer<ByteVar>(), pvreserved.toCPointer<ByteVar>())

public actual fun WlanHostedNetworkRefreshSecuritySettings(hclienthandle: HANDLE, pfailreason: Long, pvreserved: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_WlanHostedNetworkRefreshSecuritySettings(hclienthandle.toCPointer<ByteVar>(), pfailreason.toCPointer<ByteVar>(), pvreserved.toCPointer<ByteVar>())

public actual fun WlanHostedNetworkSetProperty(hclienthandle: HANDLE, opcode: WLAN_HOSTED_NETWORK_OPCODE, dwdatasize: UInt, pvdata: Long, pfailreason: Long, pvreserved: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_WlanHostedNetworkSetProperty(hclienthandle.toCPointer<ByteVar>(), opcode, dwdatasize, pvdata.toCPointer<ByteVar>(), pfailreason.toCPointer<ByteVar>(), pvreserved.toCPointer<ByteVar>())

public actual fun WlanHostedNetworkSetSecondaryKey(hclienthandle: HANDLE, dwkeylength: UInt, puckeydata: Long, bispassphrase: BOOL, bpersistent: BOOL, pfailreason: Long, pvreserved: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_WlanHostedNetworkSetSecondaryKey(hclienthandle.toCPointer<ByteVar>(), dwkeylength, puckeydata.toCPointer<ByteVar>(), bispassphrase, bpersistent, pfailreason.toCPointer<ByteVar>(), pvreserved.toCPointer<ByteVar>())

public actual fun WlanHostedNetworkStartUsing(hclienthandle: HANDLE, pfailreason: Long, pvreserved: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_WlanHostedNetworkStartUsing(hclienthandle.toCPointer<ByteVar>(), pfailreason.toCPointer<ByteVar>(), pvreserved.toCPointer<ByteVar>())

public actual fun WlanHostedNetworkStopUsing(hclienthandle: HANDLE, pfailreason: Long, pvreserved: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_WlanHostedNetworkStopUsing(hclienthandle.toCPointer<ByteVar>(), pfailreason.toCPointer<ByteVar>(), pvreserved.toCPointer<ByteVar>())

public actual fun WlanIhvControl(hclienthandle: HANDLE, pinterfaceguid: Long, type: WLAN_IHV_CONTROL_TYPE, dwinbuffersize: UInt, pinbuffer: Long, dwoutbuffersize: UInt, poutbuffer: Long, pdwbytesreturned: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_WlanIhvControl(hclienthandle.toCPointer<ByteVar>(), pinterfaceguid.toCPointer<ByteVar>(), type, dwinbuffersize, pinbuffer.toCPointer<ByteVar>(), dwoutbuffersize, poutbuffer.toCPointer<ByteVar>(), pdwbytesreturned.toCPointer<ByteVar>())

public actual fun WlanOpenHandle(dwclientversion: UInt, preserved: Long, pdwnegotiatedversion: Long, phclienthandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_WlanOpenHandle(dwclientversion, preserved.toCPointer<ByteVar>(), pdwnegotiatedversion.toCPointer<ByteVar>(), phclienthandle.toCPointer<ByteVar>())

public actual fun WlanQueryAutoConfigParameter(hclienthandle: HANDLE, opcode: WLAN_AUTOCONF_OPCODE, preserved: Long, pdwdatasize: Long, ppdata: Long, pwlanopcodevaluetype: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_WlanQueryAutoConfigParameter(hclienthandle.toCPointer<ByteVar>(), opcode, preserved.toCPointer<ByteVar>(), pdwdatasize.toCPointer<ByteVar>(), ppdata.toCPointer<ByteVar>(), pwlanopcodevaluetype.toCPointer<ByteVar>())

public actual fun WlanQueryInterface(hclienthandle: HANDLE, pinterfaceguid: Long, opcode: WLAN_INTF_OPCODE, preserved: Long, pdwdatasize: Long, ppdata: Long, pwlanopcodevaluetype: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_WlanQueryInterface(hclienthandle.toCPointer<ByteVar>(), pinterfaceguid.toCPointer<ByteVar>(), opcode, preserved.toCPointer<ByteVar>(), pdwdatasize.toCPointer<ByteVar>(), ppdata.toCPointer<ByteVar>(), pwlanopcodevaluetype.toCPointer<ByteVar>())

public actual fun WlanReasonCodeToString(dwreasoncode: UInt, dwbuffersize: UInt, pstringbuffer: PCWSTR, preserved: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_WlanReasonCodeToString(dwreasoncode, dwbuffersize, pstringbuffer.toCPointer<ByteVar>(), preserved.toCPointer<ByteVar>())

public actual fun WlanRegisterDeviceServiceNotification(hclienthandle: HANDLE, pdevsvcguidlist: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_WlanRegisterDeviceServiceNotification(hclienthandle.toCPointer<ByteVar>(), pdevsvcguidlist.toCPointer<ByteVar>())

public actual fun WlanRegisterNotification(hclienthandle: HANDLE, dwnotifsource: WLAN_NOTIFICATION_SOURCES, bignoreduplicate: BOOL, funccallback: WLAN_NOTIFICATION_CALLBACK, pcallbackcontext: Long, preserved: Long, pdwprevnotifsource: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_WlanRegisterNotification(hclienthandle.toCPointer<ByteVar>(), dwnotifsource, bignoreduplicate, funccallback.toLong().toCPointer<ByteVar>(), pcallbackcontext.toCPointer<ByteVar>(), preserved.toCPointer<ByteVar>(), pdwprevnotifsource.toCPointer<ByteVar>())

public actual fun WlanRegisterVirtualStationNotification(hclienthandle: HANDLE, bregister: BOOL, preserved: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_WlanRegisterVirtualStationNotification(hclienthandle.toCPointer<ByteVar>(), bregister, preserved.toCPointer<ByteVar>())

public actual fun WlanRenameProfile(hclienthandle: HANDLE, pinterfaceguid: Long, stroldprofilename: PCWSTR, strnewprofilename: PCWSTR, preserved: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_WlanRenameProfile(hclienthandle.toCPointer<ByteVar>(), pinterfaceguid.toCPointer<ByteVar>(), stroldprofilename.toCPointer<ByteVar>(), strnewprofilename.toCPointer<ByteVar>(), preserved.toCPointer<ByteVar>())

public actual fun WlanSaveTemporaryProfile(hclienthandle: HANDLE, pinterfaceguid: Long, strprofilename: PCWSTR, stralluserprofilesecurity: PCWSTR, dwflags: UInt, boverwrite: BOOL, preserved: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_WlanSaveTemporaryProfile(hclienthandle.toCPointer<ByteVar>(), pinterfaceguid.toCPointer<ByteVar>(), strprofilename.toCPointer<ByteVar>(), stralluserprofilesecurity.toCPointer<ByteVar>(), dwflags, boverwrite, preserved.toCPointer<ByteVar>())

public actual fun WlanScan(hclienthandle: HANDLE, pinterfaceguid: Long, pdot11ssid: Long, piedata: Long, preserved: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_WlanScan(hclienthandle.toCPointer<ByteVar>(), pinterfaceguid.toCPointer<ByteVar>(), pdot11ssid.toCPointer<ByteVar>(), piedata.toCPointer<ByteVar>(), preserved.toCPointer<ByteVar>())

public actual fun WlanSetAutoConfigParameter(hclienthandle: HANDLE, opcode: WLAN_AUTOCONF_OPCODE, dwdatasize: UInt, pdata: Long, preserved: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_WlanSetAutoConfigParameter(hclienthandle.toCPointer<ByteVar>(), opcode, dwdatasize, pdata.toCPointer<ByteVar>(), preserved.toCPointer<ByteVar>())

public actual fun WlanSetFilterList(hclienthandle: HANDLE, wlanfilterlisttype: WLAN_FILTER_LIST_TYPE, pnetworklist: Long, preserved: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_WlanSetFilterList(hclienthandle.toCPointer<ByteVar>(), wlanfilterlisttype, pnetworklist.toCPointer<ByteVar>(), preserved.toCPointer<ByteVar>())

public actual fun WlanSetInterface(hclienthandle: HANDLE, pinterfaceguid: Long, opcode: WLAN_INTF_OPCODE, dwdatasize: UInt, pdata: Long, preserved: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_WlanSetInterface(hclienthandle.toCPointer<ByteVar>(), pinterfaceguid.toCPointer<ByteVar>(), opcode, dwdatasize, pdata.toCPointer<ByteVar>(), preserved.toCPointer<ByteVar>())

public actual fun WlanSetProfile(hclienthandle: HANDLE, pinterfaceguid: Long, dwflags: UInt, strprofilexml: PCWSTR, stralluserprofilesecurity: PCWSTR, boverwrite: BOOL, preserved: Long, pdwreasoncode: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_WlanSetProfile(hclienthandle.toCPointer<ByteVar>(), pinterfaceguid.toCPointer<ByteVar>(), dwflags, strprofilexml.toCPointer<ByteVar>(), stralluserprofilesecurity.toCPointer<ByteVar>(), boverwrite, preserved.toCPointer<ByteVar>(), pdwreasoncode.toCPointer<ByteVar>())

public actual fun WlanSetProfileCustomUserData(hclienthandle: HANDLE, pinterfaceguid: Long, strprofilename: PCWSTR, dwdatasize: UInt, pdata: Long, preserved: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_WlanSetProfileCustomUserData(hclienthandle.toCPointer<ByteVar>(), pinterfaceguid.toCPointer<ByteVar>(), strprofilename.toCPointer<ByteVar>(), dwdatasize, pdata.toCPointer<ByteVar>(), preserved.toCPointer<ByteVar>())

public actual fun WlanSetProfileEapUserData(hclienthandle: HANDLE, pinterfaceguid: Long, strprofilename: PCWSTR, eaptype: EAP_METHOD_TYPE, dwflags: WLAN_SET_EAPHOST_FLAGS, dweapuserdatasize: UInt, pbeapuserdata: Long, preserved: Long): UInt =
    0u

public actual fun WlanSetProfileEapXmlUserData(hclienthandle: HANDLE, pinterfaceguid: Long, strprofilename: PCWSTR, dwflags: WLAN_SET_EAPHOST_FLAGS, streapxmluserdata: PCWSTR, preserved: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_WlanSetProfileEapXmlUserData(hclienthandle.toCPointer<ByteVar>(), pinterfaceguid.toCPointer<ByteVar>(), strprofilename.toCPointer<ByteVar>(), dwflags, streapxmluserdata.toCPointer<ByteVar>(), preserved.toCPointer<ByteVar>())

public actual fun WlanSetProfileList(hclienthandle: HANDLE, pinterfaceguid: Long, dwitems: UInt, strprofilenames: Long, preserved: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_WlanSetProfileList(hclienthandle.toCPointer<ByteVar>(), pinterfaceguid.toCPointer<ByteVar>(), dwitems, strprofilenames.toCPointer<ByteVar>(), preserved.toCPointer<ByteVar>())

public actual fun WlanSetProfilePosition(hclienthandle: HANDLE, pinterfaceguid: Long, strprofilename: PCWSTR, dwposition: UInt, preserved: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_WlanSetProfilePosition(hclienthandle.toCPointer<ByteVar>(), pinterfaceguid.toCPointer<ByteVar>(), strprofilename.toCPointer<ByteVar>(), dwposition, preserved.toCPointer<ByteVar>())

public actual fun WlanSetPsdIEDataList(hclienthandle: HANDLE, strformat: PCWSTR, ppsdiedatalist: Long, preserved: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_WlanSetPsdIEDataList(hclienthandle.toCPointer<ByteVar>(), strformat.toCPointer<ByteVar>(), ppsdiedatalist.toCPointer<ByteVar>(), preserved.toCPointer<ByteVar>())

public actual fun WlanSetSecuritySettings(hclienthandle: HANDLE, securableobject: WLAN_SECURABLE_OBJECT, strmodifiedsddl: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_WlanSetSecuritySettings(hclienthandle.toCPointer<ByteVar>(), securableobject, strmodifiedsddl.toCPointer<ByteVar>())

public actual fun WlanUIEditProfile(dwclientversion: UInt, wstrprofilename: PCWSTR, pinterfaceguid: Long, hwnd: HWND, wlstartpage: WL_DISPLAY_PAGES, preserved: Long, pwlanreasoncode: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi.cinterop.windowssys_windows_win32_networkmanagement_wifi_WlanUIEditProfile(dwclientversion, wstrprofilename.toCPointer<ByteVar>(), pinterfaceguid.toCPointer<ByteVar>(), hwnd.toCPointer<ByteVar>(), wlstartpage, preserved.toCPointer<ByteVar>(), pwlanreasoncode.toCPointer<ByteVar>())
