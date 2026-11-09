@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.EAP_METHOD_TYPE

private object WindowsWin32NetworkmanagementWifiJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_WFDCancelOpenSession(hsessionhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_WFDCloseHandle(hclienthandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_WFDCloseSession(hsessionhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_WFDOpenHandle(dwclientversion: Int, pdwnegotiatedversion: Long, phclienthandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_WFDOpenLegacySession(hclienthandle: Long, plegacymacaddress: Long, phsessionhandle: Long, pguidsessioninterface: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_WFDStartOpenSession(hclienthandle: Long, pdeviceaddress: Long, pvcontext: Long, pfncallback: Long, phsessionhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_WFDUpdateDeviceVisibility(pdeviceaddress: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_WlanAllocateMemory(dwmemorysize: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_WlanCloseHandle(hclienthandle: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_WlanConnect(hclienthandle: Long, pinterfaceguid: Long, pconnectionparameters: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_WlanConnect2(hclienthandle: Long, pinterfaceguid: Long, pconnectionparameters: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_WlanDeleteProfile(hclienthandle: Long, pinterfaceguid: Long, strprofilename: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_WlanDeviceServiceCommand(hclienthandle: Long, pinterfaceguid: Long, pdeviceserviceguid: Long, dwopcode: Int, dwinbuffersize: Int, pinbuffer: Long, dwoutbuffersize: Int, poutbuffer: Long, pdwbytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_WlanDisconnect(hclienthandle: Long, pinterfaceguid: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_WlanEnumInterfaces(hclienthandle: Long, preserved: Long, ppinterfacelist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_WlanExtractPsdIEDataList(hclienthandle: Long, dwiedatasize: Int, prawiedata: Long, strformat: Long, preserved: Long, pppsdiedatalist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_WlanFreeMemory(pmemory: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_WlanGetAvailableNetworkList(hclienthandle: Long, pinterfaceguid: Long, dwflags: Int, preserved: Long, ppavailablenetworklist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_WlanGetAvailableNetworkList2(hclienthandle: Long, pinterfaceguid: Long, dwflags: Int, preserved: Long, ppavailablenetworklist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_WlanGetFilterList(hclienthandle: Long, wlanfilterlisttype: Int, preserved: Long, ppnetworklist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_WlanGetInterfaceCapability(hclienthandle: Long, pinterfaceguid: Long, preserved: Long, ppcapability: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_WlanGetNetworkBssList(hclienthandle: Long, pinterfaceguid: Long, pdot11ssid: Long, dot11bsstype: Int, bsecurityenabled: Int, preserved: Long, ppwlanbsslist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_WlanGetProfile(hclienthandle: Long, pinterfaceguid: Long, strprofilename: Long, preserved: Long, pstrprofilexml: Long, pdwflags: Long, pdwgrantedaccess: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_WlanGetProfileCustomUserData(hclienthandle: Long, pinterfaceguid: Long, strprofilename: Long, preserved: Long, pdwdatasize: Long, ppdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_WlanGetProfileList(hclienthandle: Long, pinterfaceguid: Long, preserved: Long, ppprofilelist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_WlanGetSecuritySettings(hclienthandle: Long, securableobject: Int, pvaluetype: Long, pstrcurrentsddl: Long, pdwgrantedaccess: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_WlanGetSupportedDeviceServices(hclienthandle: Long, pinterfaceguid: Long, ppdevsvcguidlist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_WlanHostedNetworkForceStart(hclienthandle: Long, pfailreason: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_WlanHostedNetworkForceStop(hclienthandle: Long, pfailreason: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_WlanHostedNetworkInitSettings(hclienthandle: Long, pfailreason: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_WlanHostedNetworkQueryProperty(hclienthandle: Long, opcode: Int, pdwdatasize: Long, ppvdata: Long, pwlanopcodevaluetype: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_WlanHostedNetworkQuerySecondaryKey(hclienthandle: Long, pdwkeylength: Long, ppuckeydata: Long, pbispassphrase: Long, pbpersistent: Long, pfailreason: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_WlanHostedNetworkQueryStatus(hclienthandle: Long, ppwlanhostednetworkstatus: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_WlanHostedNetworkRefreshSecuritySettings(hclienthandle: Long, pfailreason: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_WlanHostedNetworkSetProperty(hclienthandle: Long, opcode: Int, dwdatasize: Int, pvdata: Long, pfailreason: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_WlanHostedNetworkSetSecondaryKey(hclienthandle: Long, dwkeylength: Int, puckeydata: Long, bispassphrase: Int, bpersistent: Int, pfailreason: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_WlanHostedNetworkStartUsing(hclienthandle: Long, pfailreason: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_WlanHostedNetworkStopUsing(hclienthandle: Long, pfailreason: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_WlanIhvControl(hclienthandle: Long, pinterfaceguid: Long, type: Int, dwinbuffersize: Int, pinbuffer: Long, dwoutbuffersize: Int, poutbuffer: Long, pdwbytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_WlanOpenHandle(dwclientversion: Int, preserved: Long, pdwnegotiatedversion: Long, phclienthandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_WlanQueryAutoConfigParameter(hclienthandle: Long, opcode: Int, preserved: Long, pdwdatasize: Long, ppdata: Long, pwlanopcodevaluetype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_WlanQueryInterface(hclienthandle: Long, pinterfaceguid: Long, opcode: Int, preserved: Long, pdwdatasize: Long, ppdata: Long, pwlanopcodevaluetype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_WlanReasonCodeToString(dwreasoncode: Int, dwbuffersize: Int, pstringbuffer: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_WlanRegisterDeviceServiceNotification(hclienthandle: Long, pdevsvcguidlist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_WlanRegisterNotification(hclienthandle: Long, dwnotifsource: Int, bignoreduplicate: Int, funccallback: Long, pcallbackcontext: Long, preserved: Long, pdwprevnotifsource: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_WlanRegisterVirtualStationNotification(hclienthandle: Long, bregister: Int, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_WlanRenameProfile(hclienthandle: Long, pinterfaceguid: Long, stroldprofilename: Long, strnewprofilename: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_WlanSaveTemporaryProfile(hclienthandle: Long, pinterfaceguid: Long, strprofilename: Long, stralluserprofilesecurity: Long, dwflags: Int, boverwrite: Int, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_WlanScan(hclienthandle: Long, pinterfaceguid: Long, pdot11ssid: Long, piedata: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_WlanSetAutoConfigParameter(hclienthandle: Long, opcode: Int, dwdatasize: Int, pdata: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_WlanSetFilterList(hclienthandle: Long, wlanfilterlisttype: Int, pnetworklist: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_WlanSetInterface(hclienthandle: Long, pinterfaceguid: Long, opcode: Int, dwdatasize: Int, pdata: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_WlanSetProfile(hclienthandle: Long, pinterfaceguid: Long, dwflags: Int, strprofilexml: Long, stralluserprofilesecurity: Long, boverwrite: Int, preserved: Long, pdwreasoncode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_WlanSetProfileCustomUserData(hclienthandle: Long, pinterfaceguid: Long, strprofilename: Long, dwdatasize: Int, pdata: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_WlanSetProfileEapXmlUserData(hclienthandle: Long, pinterfaceguid: Long, strprofilename: Long, dwflags: Int, streapxmluserdata: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_WlanSetProfileList(hclienthandle: Long, pinterfaceguid: Long, dwitems: Int, strprofilenames: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_WlanSetProfilePosition(hclienthandle: Long, pinterfaceguid: Long, strprofilename: Long, dwposition: Int, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_WlanSetPsdIEDataList(hclienthandle: Long, strformat: Long, ppsdiedatalist: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_WlanSetSecuritySettings(hclienthandle: Long, securableobject: Int, strmodifiedsddl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_WlanUIEditProfile(dwclientversion: Int, wstrprofilename: Long, pinterfaceguid: Long, hwnd: Long, wlstartpage: Int, preserved: Long, pwlanreasoncode: Long): Int
}

public actual fun WFDCancelOpenSession(hsessionhandle: HANDLE): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_WFDCancelOpenSession(hsessionhandle).toUInt()

public actual fun WFDCloseHandle(hclienthandle: HANDLE): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_WFDCloseHandle(hclienthandle).toUInt()

public actual fun WFDCloseSession(hsessionhandle: HANDLE): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_WFDCloseSession(hsessionhandle).toUInt()

public actual fun WFDOpenHandle(dwclientversion: UInt, pdwnegotiatedversion: Long, phclienthandle: Long): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_WFDOpenHandle(dwclientversion.toInt(), pdwnegotiatedversion, phclienthandle).toUInt()

public actual fun WFDOpenLegacySession(hclienthandle: HANDLE, plegacymacaddress: Long, phsessionhandle: Long, pguidsessioninterface: Long): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_WFDOpenLegacySession(hclienthandle, plegacymacaddress, phsessionhandle, pguidsessioninterface).toUInt()

public actual fun WFDStartOpenSession(hclienthandle: HANDLE, pdeviceaddress: Long, pvcontext: Long, pfncallback: WFD_OPEN_SESSION_COMPLETE_CALLBACK, phsessionhandle: Long): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_WFDStartOpenSession(hclienthandle, pdeviceaddress, pvcontext, pfncallback.toLong(), phsessionhandle).toUInt()

public actual fun WFDUpdateDeviceVisibility(pdeviceaddress: Long): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_WFDUpdateDeviceVisibility(pdeviceaddress).toUInt()

public actual fun WlanAllocateMemory(dwmemorysize: UInt): Long =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_WlanAllocateMemory(dwmemorysize.toInt())

public actual fun WlanCloseHandle(hclienthandle: HANDLE, preserved: Long): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_WlanCloseHandle(hclienthandle, preserved).toUInt()

public actual fun WlanConnect(hclienthandle: HANDLE, pinterfaceguid: Long, pconnectionparameters: Long, preserved: Long): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_WlanConnect(hclienthandle, pinterfaceguid, pconnectionparameters, preserved).toUInt()

public actual fun WlanConnect2(hclienthandle: HANDLE, pinterfaceguid: Long, pconnectionparameters: Long, preserved: Long): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_WlanConnect2(hclienthandle, pinterfaceguid, pconnectionparameters, preserved).toUInt()

public actual fun WlanDeleteProfile(hclienthandle: HANDLE, pinterfaceguid: Long, strprofilename: PCWSTR, preserved: Long): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_WlanDeleteProfile(hclienthandle, pinterfaceguid, strprofilename, preserved).toUInt()

public actual fun WlanDeviceServiceCommand(hclienthandle: HANDLE, pinterfaceguid: Long, pdeviceserviceguid: Long, dwopcode: UInt, dwinbuffersize: UInt, pinbuffer: Long, dwoutbuffersize: UInt, poutbuffer: Long, pdwbytesreturned: Long): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_WlanDeviceServiceCommand(hclienthandle, pinterfaceguid, pdeviceserviceguid, dwopcode.toInt(), dwinbuffersize.toInt(), pinbuffer, dwoutbuffersize.toInt(), poutbuffer, pdwbytesreturned).toUInt()

public actual fun WlanDisconnect(hclienthandle: HANDLE, pinterfaceguid: Long, preserved: Long): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_WlanDisconnect(hclienthandle, pinterfaceguid, preserved).toUInt()

public actual fun WlanEnumInterfaces(hclienthandle: HANDLE, preserved: Long, ppinterfacelist: Long): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_WlanEnumInterfaces(hclienthandle, preserved, ppinterfacelist).toUInt()

public actual fun WlanExtractPsdIEDataList(hclienthandle: HANDLE, dwiedatasize: UInt, prawiedata: Long, strformat: PCWSTR, preserved: Long, pppsdiedatalist: Long): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_WlanExtractPsdIEDataList(hclienthandle, dwiedatasize.toInt(), prawiedata, strformat, preserved, pppsdiedatalist).toUInt()

public actual fun WlanFreeMemory(pmemory: Long) {
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_WlanFreeMemory(pmemory)
}

public actual fun WlanGetAvailableNetworkList(hclienthandle: HANDLE, pinterfaceguid: Long, dwflags: UInt, preserved: Long, ppavailablenetworklist: Long): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_WlanGetAvailableNetworkList(hclienthandle, pinterfaceguid, dwflags.toInt(), preserved, ppavailablenetworklist).toUInt()

public actual fun WlanGetAvailableNetworkList2(hclienthandle: HANDLE, pinterfaceguid: Long, dwflags: UInt, preserved: Long, ppavailablenetworklist: Long): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_WlanGetAvailableNetworkList2(hclienthandle, pinterfaceguid, dwflags.toInt(), preserved, ppavailablenetworklist).toUInt()

public actual fun WlanGetFilterList(hclienthandle: HANDLE, wlanfilterlisttype: WLAN_FILTER_LIST_TYPE, preserved: Long, ppnetworklist: Long): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_WlanGetFilterList(hclienthandle, wlanfilterlisttype, preserved, ppnetworklist).toUInt()

public actual fun WlanGetInterfaceCapability(hclienthandle: HANDLE, pinterfaceguid: Long, preserved: Long, ppcapability: Long): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_WlanGetInterfaceCapability(hclienthandle, pinterfaceguid, preserved, ppcapability).toUInt()

public actual fun WlanGetNetworkBssList(hclienthandle: HANDLE, pinterfaceguid: Long, pdot11ssid: Long, dot11bsstype: DOT11_BSS_TYPE, bsecurityenabled: BOOL, preserved: Long, ppwlanbsslist: Long): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_WlanGetNetworkBssList(hclienthandle, pinterfaceguid, pdot11ssid, dot11bsstype, bsecurityenabled, preserved, ppwlanbsslist).toUInt()

public actual fun WlanGetProfile(hclienthandle: HANDLE, pinterfaceguid: Long, strprofilename: PCWSTR, preserved: Long, pstrprofilexml: Long, pdwflags: Long, pdwgrantedaccess: Long): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_WlanGetProfile(hclienthandle, pinterfaceguid, strprofilename, preserved, pstrprofilexml, pdwflags, pdwgrantedaccess).toUInt()

public actual fun WlanGetProfileCustomUserData(hclienthandle: HANDLE, pinterfaceguid: Long, strprofilename: PCWSTR, preserved: Long, pdwdatasize: Long, ppdata: Long): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_WlanGetProfileCustomUserData(hclienthandle, pinterfaceguid, strprofilename, preserved, pdwdatasize, ppdata).toUInt()

public actual fun WlanGetProfileList(hclienthandle: HANDLE, pinterfaceguid: Long, preserved: Long, ppprofilelist: Long): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_WlanGetProfileList(hclienthandle, pinterfaceguid, preserved, ppprofilelist).toUInt()

public actual fun WlanGetSecuritySettings(hclienthandle: HANDLE, securableobject: WLAN_SECURABLE_OBJECT, pvaluetype: Long, pstrcurrentsddl: Long, pdwgrantedaccess: Long): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_WlanGetSecuritySettings(hclienthandle, securableobject, pvaluetype, pstrcurrentsddl, pdwgrantedaccess).toUInt()

public actual fun WlanGetSupportedDeviceServices(hclienthandle: HANDLE, pinterfaceguid: Long, ppdevsvcguidlist: Long): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_WlanGetSupportedDeviceServices(hclienthandle, pinterfaceguid, ppdevsvcguidlist).toUInt()

public actual fun WlanHostedNetworkForceStart(hclienthandle: HANDLE, pfailreason: Long, pvreserved: Long): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_WlanHostedNetworkForceStart(hclienthandle, pfailreason, pvreserved).toUInt()

public actual fun WlanHostedNetworkForceStop(hclienthandle: HANDLE, pfailreason: Long, pvreserved: Long): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_WlanHostedNetworkForceStop(hclienthandle, pfailreason, pvreserved).toUInt()

public actual fun WlanHostedNetworkInitSettings(hclienthandle: HANDLE, pfailreason: Long, pvreserved: Long): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_WlanHostedNetworkInitSettings(hclienthandle, pfailreason, pvreserved).toUInt()

public actual fun WlanHostedNetworkQueryProperty(hclienthandle: HANDLE, opcode: WLAN_HOSTED_NETWORK_OPCODE, pdwdatasize: Long, ppvdata: Long, pwlanopcodevaluetype: Long, pvreserved: Long): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_WlanHostedNetworkQueryProperty(hclienthandle, opcode, pdwdatasize, ppvdata, pwlanopcodevaluetype, pvreserved).toUInt()

public actual fun WlanHostedNetworkQuerySecondaryKey(hclienthandle: HANDLE, pdwkeylength: Long, ppuckeydata: Long, pbispassphrase: Long, pbpersistent: Long, pfailreason: Long, pvreserved: Long): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_WlanHostedNetworkQuerySecondaryKey(hclienthandle, pdwkeylength, ppuckeydata, pbispassphrase, pbpersistent, pfailreason, pvreserved).toUInt()

public actual fun WlanHostedNetworkQueryStatus(hclienthandle: HANDLE, ppwlanhostednetworkstatus: Long, pvreserved: Long): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_WlanHostedNetworkQueryStatus(hclienthandle, ppwlanhostednetworkstatus, pvreserved).toUInt()

public actual fun WlanHostedNetworkRefreshSecuritySettings(hclienthandle: HANDLE, pfailreason: Long, pvreserved: Long): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_WlanHostedNetworkRefreshSecuritySettings(hclienthandle, pfailreason, pvreserved).toUInt()

public actual fun WlanHostedNetworkSetProperty(hclienthandle: HANDLE, opcode: WLAN_HOSTED_NETWORK_OPCODE, dwdatasize: UInt, pvdata: Long, pfailreason: Long, pvreserved: Long): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_WlanHostedNetworkSetProperty(hclienthandle, opcode, dwdatasize.toInt(), pvdata, pfailreason, pvreserved).toUInt()

public actual fun WlanHostedNetworkSetSecondaryKey(hclienthandle: HANDLE, dwkeylength: UInt, puckeydata: Long, bispassphrase: BOOL, bpersistent: BOOL, pfailreason: Long, pvreserved: Long): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_WlanHostedNetworkSetSecondaryKey(hclienthandle, dwkeylength.toInt(), puckeydata, bispassphrase, bpersistent, pfailreason, pvreserved).toUInt()

public actual fun WlanHostedNetworkStartUsing(hclienthandle: HANDLE, pfailreason: Long, pvreserved: Long): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_WlanHostedNetworkStartUsing(hclienthandle, pfailreason, pvreserved).toUInt()

public actual fun WlanHostedNetworkStopUsing(hclienthandle: HANDLE, pfailreason: Long, pvreserved: Long): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_WlanHostedNetworkStopUsing(hclienthandle, pfailreason, pvreserved).toUInt()

public actual fun WlanIhvControl(hclienthandle: HANDLE, pinterfaceguid: Long, type: WLAN_IHV_CONTROL_TYPE, dwinbuffersize: UInt, pinbuffer: Long, dwoutbuffersize: UInt, poutbuffer: Long, pdwbytesreturned: Long): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_WlanIhvControl(hclienthandle, pinterfaceguid, type, dwinbuffersize.toInt(), pinbuffer, dwoutbuffersize.toInt(), poutbuffer, pdwbytesreturned).toUInt()

public actual fun WlanOpenHandle(dwclientversion: UInt, preserved: Long, pdwnegotiatedversion: Long, phclienthandle: Long): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_WlanOpenHandle(dwclientversion.toInt(), preserved, pdwnegotiatedversion, phclienthandle).toUInt()

public actual fun WlanQueryAutoConfigParameter(hclienthandle: HANDLE, opcode: WLAN_AUTOCONF_OPCODE, preserved: Long, pdwdatasize: Long, ppdata: Long, pwlanopcodevaluetype: Long): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_WlanQueryAutoConfigParameter(hclienthandle, opcode, preserved, pdwdatasize, ppdata, pwlanopcodevaluetype).toUInt()

public actual fun WlanQueryInterface(hclienthandle: HANDLE, pinterfaceguid: Long, opcode: WLAN_INTF_OPCODE, preserved: Long, pdwdatasize: Long, ppdata: Long, pwlanopcodevaluetype: Long): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_WlanQueryInterface(hclienthandle, pinterfaceguid, opcode, preserved, pdwdatasize, ppdata, pwlanopcodevaluetype).toUInt()

public actual fun WlanReasonCodeToString(dwreasoncode: UInt, dwbuffersize: UInt, pstringbuffer: PCWSTR, preserved: Long): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_WlanReasonCodeToString(dwreasoncode.toInt(), dwbuffersize.toInt(), pstringbuffer, preserved).toUInt()

public actual fun WlanRegisterDeviceServiceNotification(hclienthandle: HANDLE, pdevsvcguidlist: Long): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_WlanRegisterDeviceServiceNotification(hclienthandle, pdevsvcguidlist).toUInt()

public actual fun WlanRegisterNotification(hclienthandle: HANDLE, dwnotifsource: WLAN_NOTIFICATION_SOURCES, bignoreduplicate: BOOL, funccallback: WLAN_NOTIFICATION_CALLBACK, pcallbackcontext: Long, preserved: Long, pdwprevnotifsource: Long): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_WlanRegisterNotification(hclienthandle, dwnotifsource.toInt(), bignoreduplicate, funccallback.toLong(), pcallbackcontext, preserved, pdwprevnotifsource).toUInt()

public actual fun WlanRegisterVirtualStationNotification(hclienthandle: HANDLE, bregister: BOOL, preserved: Long): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_WlanRegisterVirtualStationNotification(hclienthandle, bregister, preserved).toUInt()

public actual fun WlanRenameProfile(hclienthandle: HANDLE, pinterfaceguid: Long, stroldprofilename: PCWSTR, strnewprofilename: PCWSTR, preserved: Long): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_WlanRenameProfile(hclienthandle, pinterfaceguid, stroldprofilename, strnewprofilename, preserved).toUInt()

public actual fun WlanSaveTemporaryProfile(hclienthandle: HANDLE, pinterfaceguid: Long, strprofilename: PCWSTR, stralluserprofilesecurity: PCWSTR, dwflags: UInt, boverwrite: BOOL, preserved: Long): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_WlanSaveTemporaryProfile(hclienthandle, pinterfaceguid, strprofilename, stralluserprofilesecurity, dwflags.toInt(), boverwrite, preserved).toUInt()

public actual fun WlanScan(hclienthandle: HANDLE, pinterfaceguid: Long, pdot11ssid: Long, piedata: Long, preserved: Long): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_WlanScan(hclienthandle, pinterfaceguid, pdot11ssid, piedata, preserved).toUInt()

public actual fun WlanSetAutoConfigParameter(hclienthandle: HANDLE, opcode: WLAN_AUTOCONF_OPCODE, dwdatasize: UInt, pdata: Long, preserved: Long): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_WlanSetAutoConfigParameter(hclienthandle, opcode, dwdatasize.toInt(), pdata, preserved).toUInt()

public actual fun WlanSetFilterList(hclienthandle: HANDLE, wlanfilterlisttype: WLAN_FILTER_LIST_TYPE, pnetworklist: Long, preserved: Long): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_WlanSetFilterList(hclienthandle, wlanfilterlisttype, pnetworklist, preserved).toUInt()

public actual fun WlanSetInterface(hclienthandle: HANDLE, pinterfaceguid: Long, opcode: WLAN_INTF_OPCODE, dwdatasize: UInt, pdata: Long, preserved: Long): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_WlanSetInterface(hclienthandle, pinterfaceguid, opcode, dwdatasize.toInt(), pdata, preserved).toUInt()

public actual fun WlanSetProfile(hclienthandle: HANDLE, pinterfaceguid: Long, dwflags: UInt, strprofilexml: PCWSTR, stralluserprofilesecurity: PCWSTR, boverwrite: BOOL, preserved: Long, pdwreasoncode: Long): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_WlanSetProfile(hclienthandle, pinterfaceguid, dwflags.toInt(), strprofilexml, stralluserprofilesecurity, boverwrite, preserved, pdwreasoncode).toUInt()

public actual fun WlanSetProfileCustomUserData(hclienthandle: HANDLE, pinterfaceguid: Long, strprofilename: PCWSTR, dwdatasize: UInt, pdata: Long, preserved: Long): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_WlanSetProfileCustomUserData(hclienthandle, pinterfaceguid, strprofilename, dwdatasize.toInt(), pdata, preserved).toUInt()

public actual fun WlanSetProfileEapUserData(hclienthandle: HANDLE, pinterfaceguid: Long, strprofilename: PCWSTR, eaptype: EAP_METHOD_TYPE, dwflags: WLAN_SET_EAPHOST_FLAGS, dweapuserdatasize: UInt, pbeapuserdata: Long, preserved: Long): UInt =
    0u

public actual fun WlanSetProfileEapXmlUserData(hclienthandle: HANDLE, pinterfaceguid: Long, strprofilename: PCWSTR, dwflags: WLAN_SET_EAPHOST_FLAGS, streapxmluserdata: PCWSTR, preserved: Long): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_WlanSetProfileEapXmlUserData(hclienthandle, pinterfaceguid, strprofilename, dwflags.toInt(), streapxmluserdata, preserved).toUInt()

public actual fun WlanSetProfileList(hclienthandle: HANDLE, pinterfaceguid: Long, dwitems: UInt, strprofilenames: Long, preserved: Long): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_WlanSetProfileList(hclienthandle, pinterfaceguid, dwitems.toInt(), strprofilenames, preserved).toUInt()

public actual fun WlanSetProfilePosition(hclienthandle: HANDLE, pinterfaceguid: Long, strprofilename: PCWSTR, dwposition: UInt, preserved: Long): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_WlanSetProfilePosition(hclienthandle, pinterfaceguid, strprofilename, dwposition.toInt(), preserved).toUInt()

public actual fun WlanSetPsdIEDataList(hclienthandle: HANDLE, strformat: PCWSTR, ppsdiedatalist: Long, preserved: Long): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_WlanSetPsdIEDataList(hclienthandle, strformat, ppsdiedatalist, preserved).toUInt()

public actual fun WlanSetSecuritySettings(hclienthandle: HANDLE, securableobject: WLAN_SECURABLE_OBJECT, strmodifiedsddl: PCWSTR): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_WlanSetSecuritySettings(hclienthandle, securableobject, strmodifiedsddl).toUInt()

public actual fun WlanUIEditProfile(dwclientversion: UInt, wstrprofilename: PCWSTR, pinterfaceguid: Long, hwnd: HWND, wlstartpage: WL_DISPLAY_PAGES, preserved: Long, pwlanreasoncode: Long): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_WlanUIEditProfile(dwclientversion.toInt(), wstrprofilename, pinterfaceguid, hwnd, wlstartpage, preserved, pwlanreasoncode).toUInt()
