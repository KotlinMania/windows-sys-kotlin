@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.EAP_METHOD_TYPE

public actual fun WFDCancelOpenSession(hsessionhandle: HANDLE): UInt =
    0u

public actual fun WFDCloseHandle(hclienthandle: HANDLE): UInt =
    0u

public actual fun WFDCloseSession(hsessionhandle: HANDLE): UInt =
    0u

public actual fun WFDOpenHandle(dwclientversion: UInt, pdwnegotiatedversion: Long, phclienthandle: Long): UInt =
    0u

public actual fun WFDOpenLegacySession(hclienthandle: HANDLE, plegacymacaddress: Long, phsessionhandle: Long, pguidsessioninterface: Long): UInt =
    0u

public actual fun WFDStartOpenSession(hclienthandle: HANDLE, pdeviceaddress: Long, pvcontext: Long, pfncallback: WFD_OPEN_SESSION_COMPLETE_CALLBACK, phsessionhandle: Long): UInt =
    0u

public actual fun WFDUpdateDeviceVisibility(pdeviceaddress: Long): UInt =
    0u

public actual fun WlanAllocateMemory(dwmemorysize: UInt): Long =
    0L

public actual fun WlanCloseHandle(hclienthandle: HANDLE, preserved: Long): UInt =
    0u

public actual fun WlanConnect(hclienthandle: HANDLE, pinterfaceguid: Long, pconnectionparameters: Long, preserved: Long): UInt =
    0u

public actual fun WlanConnect2(hclienthandle: HANDLE, pinterfaceguid: Long, pconnectionparameters: Long, preserved: Long): UInt =
    0u

public actual fun WlanDeleteProfile(hclienthandle: HANDLE, pinterfaceguid: Long, strprofilename: PCWSTR, preserved: Long): UInt =
    0u

public actual fun WlanDeviceServiceCommand(hclienthandle: HANDLE, pinterfaceguid: Long, pdeviceserviceguid: Long, dwopcode: UInt, dwinbuffersize: UInt, pinbuffer: Long, dwoutbuffersize: UInt, poutbuffer: Long, pdwbytesreturned: Long): UInt =
    0u

public actual fun WlanDisconnect(hclienthandle: HANDLE, pinterfaceguid: Long, preserved: Long): UInt =
    0u

public actual fun WlanEnumInterfaces(hclienthandle: HANDLE, preserved: Long, ppinterfacelist: Long): UInt =
    0u

public actual fun WlanExtractPsdIEDataList(hclienthandle: HANDLE, dwiedatasize: UInt, prawiedata: Long, strformat: PCWSTR, preserved: Long, pppsdiedatalist: Long): UInt =
    0u

public actual fun WlanFreeMemory(pmemory: Long) {
}

public actual fun WlanGetAvailableNetworkList(hclienthandle: HANDLE, pinterfaceguid: Long, dwflags: UInt, preserved: Long, ppavailablenetworklist: Long): UInt =
    0u

public actual fun WlanGetAvailableNetworkList2(hclienthandle: HANDLE, pinterfaceguid: Long, dwflags: UInt, preserved: Long, ppavailablenetworklist: Long): UInt =
    0u

public actual fun WlanGetFilterList(hclienthandle: HANDLE, wlanfilterlisttype: WLAN_FILTER_LIST_TYPE, preserved: Long, ppnetworklist: Long): UInt =
    0u

public actual fun WlanGetInterfaceCapability(hclienthandle: HANDLE, pinterfaceguid: Long, preserved: Long, ppcapability: Long): UInt =
    0u

public actual fun WlanGetNetworkBssList(hclienthandle: HANDLE, pinterfaceguid: Long, pdot11ssid: Long, dot11bsstype: DOT11_BSS_TYPE, bsecurityenabled: BOOL, preserved: Long, ppwlanbsslist: Long): UInt =
    0u

public actual fun WlanGetProfile(hclienthandle: HANDLE, pinterfaceguid: Long, strprofilename: PCWSTR, preserved: Long, pstrprofilexml: Long, pdwflags: Long, pdwgrantedaccess: Long): UInt =
    0u

public actual fun WlanGetProfileCustomUserData(hclienthandle: HANDLE, pinterfaceguid: Long, strprofilename: PCWSTR, preserved: Long, pdwdatasize: Long, ppdata: Long): UInt =
    0u

public actual fun WlanGetProfileList(hclienthandle: HANDLE, pinterfaceguid: Long, preserved: Long, ppprofilelist: Long): UInt =
    0u

public actual fun WlanGetSecuritySettings(hclienthandle: HANDLE, securableobject: WLAN_SECURABLE_OBJECT, pvaluetype: Long, pstrcurrentsddl: Long, pdwgrantedaccess: Long): UInt =
    0u

public actual fun WlanGetSupportedDeviceServices(hclienthandle: HANDLE, pinterfaceguid: Long, ppdevsvcguidlist: Long): UInt =
    0u

public actual fun WlanHostedNetworkForceStart(hclienthandle: HANDLE, pfailreason: Long, pvreserved: Long): UInt =
    0u

public actual fun WlanHostedNetworkForceStop(hclienthandle: HANDLE, pfailreason: Long, pvreserved: Long): UInt =
    0u

public actual fun WlanHostedNetworkInitSettings(hclienthandle: HANDLE, pfailreason: Long, pvreserved: Long): UInt =
    0u

public actual fun WlanHostedNetworkQueryProperty(hclienthandle: HANDLE, opcode: WLAN_HOSTED_NETWORK_OPCODE, pdwdatasize: Long, ppvdata: Long, pwlanopcodevaluetype: Long, pvreserved: Long): UInt =
    0u

public actual fun WlanHostedNetworkQuerySecondaryKey(hclienthandle: HANDLE, pdwkeylength: Long, ppuckeydata: Long, pbispassphrase: Long, pbpersistent: Long, pfailreason: Long, pvreserved: Long): UInt =
    0u

public actual fun WlanHostedNetworkQueryStatus(hclienthandle: HANDLE, ppwlanhostednetworkstatus: Long, pvreserved: Long): UInt =
    0u

public actual fun WlanHostedNetworkRefreshSecuritySettings(hclienthandle: HANDLE, pfailreason: Long, pvreserved: Long): UInt =
    0u

public actual fun WlanHostedNetworkSetProperty(hclienthandle: HANDLE, opcode: WLAN_HOSTED_NETWORK_OPCODE, dwdatasize: UInt, pvdata: Long, pfailreason: Long, pvreserved: Long): UInt =
    0u

public actual fun WlanHostedNetworkSetSecondaryKey(hclienthandle: HANDLE, dwkeylength: UInt, puckeydata: Long, bispassphrase: BOOL, bpersistent: BOOL, pfailreason: Long, pvreserved: Long): UInt =
    0u

public actual fun WlanHostedNetworkStartUsing(hclienthandle: HANDLE, pfailreason: Long, pvreserved: Long): UInt =
    0u

public actual fun WlanHostedNetworkStopUsing(hclienthandle: HANDLE, pfailreason: Long, pvreserved: Long): UInt =
    0u

public actual fun WlanIhvControl(hclienthandle: HANDLE, pinterfaceguid: Long, type: WLAN_IHV_CONTROL_TYPE, dwinbuffersize: UInt, pinbuffer: Long, dwoutbuffersize: UInt, poutbuffer: Long, pdwbytesreturned: Long): UInt =
    0u

public actual fun WlanOpenHandle(dwclientversion: UInt, preserved: Long, pdwnegotiatedversion: Long, phclienthandle: Long): UInt =
    0u

public actual fun WlanQueryAutoConfigParameter(hclienthandle: HANDLE, opcode: WLAN_AUTOCONF_OPCODE, preserved: Long, pdwdatasize: Long, ppdata: Long, pwlanopcodevaluetype: Long): UInt =
    0u

public actual fun WlanQueryInterface(hclienthandle: HANDLE, pinterfaceguid: Long, opcode: WLAN_INTF_OPCODE, preserved: Long, pdwdatasize: Long, ppdata: Long, pwlanopcodevaluetype: Long): UInt =
    0u

public actual fun WlanReasonCodeToString(dwreasoncode: UInt, dwbuffersize: UInt, pstringbuffer: PCWSTR, preserved: Long): UInt =
    0u

public actual fun WlanRegisterDeviceServiceNotification(hclienthandle: HANDLE, pdevsvcguidlist: Long): UInt =
    0u

public actual fun WlanRegisterNotification(hclienthandle: HANDLE, dwnotifsource: WLAN_NOTIFICATION_SOURCES, bignoreduplicate: BOOL, funccallback: WLAN_NOTIFICATION_CALLBACK, pcallbackcontext: Long, preserved: Long, pdwprevnotifsource: Long): UInt =
    0u

public actual fun WlanRegisterVirtualStationNotification(hclienthandle: HANDLE, bregister: BOOL, preserved: Long): UInt =
    0u

public actual fun WlanRenameProfile(hclienthandle: HANDLE, pinterfaceguid: Long, stroldprofilename: PCWSTR, strnewprofilename: PCWSTR, preserved: Long): UInt =
    0u

public actual fun WlanSaveTemporaryProfile(hclienthandle: HANDLE, pinterfaceguid: Long, strprofilename: PCWSTR, stralluserprofilesecurity: PCWSTR, dwflags: UInt, boverwrite: BOOL, preserved: Long): UInt =
    0u

public actual fun WlanScan(hclienthandle: HANDLE, pinterfaceguid: Long, pdot11ssid: Long, piedata: Long, preserved: Long): UInt =
    0u

public actual fun WlanSetAutoConfigParameter(hclienthandle: HANDLE, opcode: WLAN_AUTOCONF_OPCODE, dwdatasize: UInt, pdata: Long, preserved: Long): UInt =
    0u

public actual fun WlanSetFilterList(hclienthandle: HANDLE, wlanfilterlisttype: WLAN_FILTER_LIST_TYPE, pnetworklist: Long, preserved: Long): UInt =
    0u

public actual fun WlanSetInterface(hclienthandle: HANDLE, pinterfaceguid: Long, opcode: WLAN_INTF_OPCODE, dwdatasize: UInt, pdata: Long, preserved: Long): UInt =
    0u

public actual fun WlanSetProfile(hclienthandle: HANDLE, pinterfaceguid: Long, dwflags: UInt, strprofilexml: PCWSTR, stralluserprofilesecurity: PCWSTR, boverwrite: BOOL, preserved: Long, pdwreasoncode: Long): UInt =
    0u

public actual fun WlanSetProfileCustomUserData(hclienthandle: HANDLE, pinterfaceguid: Long, strprofilename: PCWSTR, dwdatasize: UInt, pdata: Long, preserved: Long): UInt =
    0u

public actual fun WlanSetProfileEapUserData(hclienthandle: HANDLE, pinterfaceguid: Long, strprofilename: PCWSTR, eaptype: EAP_METHOD_TYPE, dwflags: WLAN_SET_EAPHOST_FLAGS, dweapuserdatasize: UInt, pbeapuserdata: Long, preserved: Long): UInt =
    0u

public actual fun WlanSetProfileEapXmlUserData(hclienthandle: HANDLE, pinterfaceguid: Long, strprofilename: PCWSTR, dwflags: WLAN_SET_EAPHOST_FLAGS, streapxmluserdata: PCWSTR, preserved: Long): UInt =
    0u

public actual fun WlanSetProfileList(hclienthandle: HANDLE, pinterfaceguid: Long, dwitems: UInt, strprofilenames: Long, preserved: Long): UInt =
    0u

public actual fun WlanSetProfilePosition(hclienthandle: HANDLE, pinterfaceguid: Long, strprofilename: PCWSTR, dwposition: UInt, preserved: Long): UInt =
    0u

public actual fun WlanSetPsdIEDataList(hclienthandle: HANDLE, strformat: PCWSTR, ppsdiedatalist: Long, preserved: Long): UInt =
    0u

public actual fun WlanSetSecuritySettings(hclienthandle: HANDLE, securableobject: WLAN_SECURABLE_OBJECT, strmodifiedsddl: PCWSTR): UInt =
    0u

public actual fun WlanUIEditProfile(dwclientversion: UInt, wstrprofilename: PCWSTR, pinterfaceguid: Long, hwnd: HWND, wlstartpage: WL_DISPLAY_PAGES, preserved: Long, pwlanreasoncode: Long): UInt =
    0u
