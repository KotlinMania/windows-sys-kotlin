@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.EapMethodType

private object WindowsWin32NetworkmanagementWifiJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_wFDCancelOpenSession(hsessionhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_wFDCloseHandle(hclienthandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_wFDCloseSession(hsessionhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_wFDOpenHandle(dwclientversion: Int, pdwnegotiatedversion: Long, phclienthandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_wFDOpenLegacySession(hclienthandle: Long, plegacymacaddress: Long, phsessionhandle: Long, pguidsessioninterface: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_wFDStartOpenSession(hclienthandle: Long, pdeviceaddress: Long, pvcontext: Long, pfncallback: Long, phsessionhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_wFDUpdateDeviceVisibility(pdeviceaddress: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_wlanAllocateMemory(dwmemorysize: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_wlanCloseHandle(hclienthandle: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_wlanConnect(hclienthandle: Long, pinterfaceguid: Long, pconnectionparameters: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_wlanConnect2(hclienthandle: Long, pinterfaceguid: Long, pconnectionparameters: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_wlanDeleteProfile(hclienthandle: Long, pinterfaceguid: Long, strprofilename: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_wlanDeviceServiceCommand(hclienthandle: Long, pinterfaceguid: Long, pdeviceserviceguid: Long, dwopcode: Int, dwinbuffersize: Int, pinbuffer: Long, dwoutbuffersize: Int, poutbuffer: Long, pdwbytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_wlanDisconnect(hclienthandle: Long, pinterfaceguid: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_wlanEnumInterfaces(hclienthandle: Long, preserved: Long, ppinterfacelist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_wlanExtractPsdIEDataList(hclienthandle: Long, dwiedatasize: Int, prawiedata: Long, strformat: Long, preserved: Long, pppsdiedatalist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_wlanFreeMemory(pmemory: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_wlanGetAvailableNetworkList(hclienthandle: Long, pinterfaceguid: Long, dwflags: Int, preserved: Long, ppavailablenetworklist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_wlanGetAvailableNetworkList2(hclienthandle: Long, pinterfaceguid: Long, dwflags: Int, preserved: Long, ppavailablenetworklist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_wlanGetFilterList(hclienthandle: Long, wlanfilterlisttype: Int, preserved: Long, ppnetworklist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_wlanGetInterfaceCapability(hclienthandle: Long, pinterfaceguid: Long, preserved: Long, ppcapability: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_wlanGetNetworkBssList(hclienthandle: Long, pinterfaceguid: Long, pdot11ssid: Long, dot11bsstype: Int, bsecurityenabled: Int, preserved: Long, ppwlanbsslist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_wlanGetProfile(hclienthandle: Long, pinterfaceguid: Long, strprofilename: Long, preserved: Long, pstrprofilexml: Long, pdwflags: Long, pdwgrantedaccess: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_wlanGetProfileCustomUserData(hclienthandle: Long, pinterfaceguid: Long, strprofilename: Long, preserved: Long, pdwdatasize: Long, ppdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_wlanGetProfileList(hclienthandle: Long, pinterfaceguid: Long, preserved: Long, ppprofilelist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_wlanGetSecuritySettings(hclienthandle: Long, securableobject: Int, pvaluetype: Long, pstrcurrentsddl: Long, pdwgrantedaccess: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_wlanGetSupportedDeviceServices(hclienthandle: Long, pinterfaceguid: Long, ppdevsvcguidlist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkForceStart(hclienthandle: Long, pfailreason: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkForceStop(hclienthandle: Long, pfailreason: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkInitSettings(hclienthandle: Long, pfailreason: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkQueryProperty(hclienthandle: Long, opcode: Int, pdwdatasize: Long, ppvdata: Long, pwlanopcodevaluetype: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkQuerySecondaryKey(hclienthandle: Long, pdwkeylength: Long, ppuckeydata: Long, pbispassphrase: Long, pbpersistent: Long, pfailreason: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkQueryStatus(hclienthandle: Long, ppwlanhostednetworkstatus: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkRefreshSecuritySettings(hclienthandle: Long, pfailreason: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkSetProperty(hclienthandle: Long, opcode: Int, dwdatasize: Int, pvdata: Long, pfailreason: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkSetSecondaryKey(hclienthandle: Long, dwkeylength: Int, puckeydata: Long, bispassphrase: Int, bpersistent: Int, pfailreason: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkStartUsing(hclienthandle: Long, pfailreason: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkStopUsing(hclienthandle: Long, pfailreason: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_wlanIhvControl(hclienthandle: Long, pinterfaceguid: Long, type: Int, dwinbuffersize: Int, pinbuffer: Long, dwoutbuffersize: Int, poutbuffer: Long, pdwbytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_wlanOpenHandle(dwclientversion: Int, preserved: Long, pdwnegotiatedversion: Long, phclienthandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_wlanQueryAutoConfigParameter(hclienthandle: Long, opcode: Int, preserved: Long, pdwdatasize: Long, ppdata: Long, pwlanopcodevaluetype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_wlanQueryInterface(hclienthandle: Long, pinterfaceguid: Long, opcode: Int, preserved: Long, pdwdatasize: Long, ppdata: Long, pwlanopcodevaluetype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_wlanReasonCodeToString(dwreasoncode: Int, dwbuffersize: Int, pstringbuffer: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_wlanRegisterDeviceServiceNotification(hclienthandle: Long, pdevsvcguidlist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_wlanRegisterNotification(hclienthandle: Long, dwnotifsource: Int, bignoreduplicate: Int, funccallback: Long, pcallbackcontext: Long, preserved: Long, pdwprevnotifsource: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_wlanRegisterVirtualStationNotification(hclienthandle: Long, bregister: Int, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_wlanRenameProfile(hclienthandle: Long, pinterfaceguid: Long, stroldprofilename: Long, strnewprofilename: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_wlanSaveTemporaryProfile(hclienthandle: Long, pinterfaceguid: Long, strprofilename: Long, stralluserprofilesecurity: Long, dwflags: Int, boverwrite: Int, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_wlanScan(hclienthandle: Long, pinterfaceguid: Long, pdot11ssid: Long, piedata: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_wlanSetAutoConfigParameter(hclienthandle: Long, opcode: Int, dwdatasize: Int, pdata: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_wlanSetFilterList(hclienthandle: Long, wlanfilterlisttype: Int, pnetworklist: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_wlanSetInterface(hclienthandle: Long, pinterfaceguid: Long, opcode: Int, dwdatasize: Int, pdata: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_wlanSetProfile(hclienthandle: Long, pinterfaceguid: Long, dwflags: Int, strprofilexml: Long, stralluserprofilesecurity: Long, boverwrite: Int, preserved: Long, pdwreasoncode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_wlanSetProfileCustomUserData(hclienthandle: Long, pinterfaceguid: Long, strprofilename: Long, dwdatasize: Int, pdata: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_wlanSetProfileEapXmlUserData(hclienthandle: Long, pinterfaceguid: Long, strprofilename: Long, dwflags: Int, streapxmluserdata: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_wlanSetProfileList(hclienthandle: Long, pinterfaceguid: Long, dwitems: Int, strprofilenames: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_wlanSetProfilePosition(hclienthandle: Long, pinterfaceguid: Long, strprofilename: Long, dwposition: Int, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_wlanSetPsdIEDataList(hclienthandle: Long, strformat: Long, ppsdiedatalist: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_wlanSetSecuritySettings(hclienthandle: Long, securableobject: Int, strmodifiedsddl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wifi_wlanUIEditProfile(dwclientversion: Int, wstrprofilename: Long, pinterfaceguid: Long, hwnd: Long, wlstartpage: Int, preserved: Long, pwlanreasoncode: Long): Int
}

public actual fun wFDCancelOpenSession(hsessionhandle: Handle): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_wFDCancelOpenSession((hsessionhandle?.value ?: 0L)).toUInt()

public actual fun wFDCloseHandle(hclienthandle: Handle): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_wFDCloseHandle((hclienthandle?.value ?: 0L)).toUInt()

public actual fun wFDCloseSession(hsessionhandle: Handle): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_wFDCloseSession((hsessionhandle?.value ?: 0L)).toUInt()

public actual fun wFDOpenHandle(dwclientversion: UInt, pdwnegotiatedversion: COpaquePointer?, phclienthandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_wFDOpenHandle(dwclientversion.toInt(), (pdwnegotiatedversion?.value ?: 0L), (phclienthandle?.value ?: 0L)).toUInt()

public actual fun wFDOpenLegacySession(hclienthandle: Handle, plegacymacaddress: COpaquePointer?, phsessionhandle: COpaquePointer?, pguidsessioninterface: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_wFDOpenLegacySession((hclienthandle?.value ?: 0L), (plegacymacaddress?.value ?: 0L), (phsessionhandle?.value ?: 0L), (pguidsessioninterface?.value ?: 0L)).toUInt()

public actual fun wFDStartOpenSession(hclienthandle: Handle, pdeviceaddress: COpaquePointer?, pvcontext: COpaquePointer?, pfncallback: WfdOpenSessionCompleteCallback, phsessionhandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_wFDStartOpenSession((hclienthandle?.value ?: 0L), (pdeviceaddress?.value ?: 0L), (pvcontext?.value ?: 0L), 0L, (phsessionhandle?.value ?: 0L)).toUInt()

public actual fun wFDUpdateDeviceVisibility(pdeviceaddress: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_wFDUpdateDeviceVisibility((pdeviceaddress?.value ?: 0L)).toUInt()

public actual fun wlanAllocateMemory(dwmemorysize: UInt): COpaquePointer? =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_wlanAllocateMemory(dwmemorysize.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun wlanCloseHandle(hclienthandle: Handle, preserved: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_wlanCloseHandle((hclienthandle?.value ?: 0L), (preserved?.value ?: 0L)).toUInt()

public actual fun wlanConnect(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, pconnectionparameters: COpaquePointer?, preserved: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_wlanConnect((hclienthandle?.value ?: 0L), (pinterfaceguid?.value ?: 0L), (pconnectionparameters?.value ?: 0L), (preserved?.value ?: 0L)).toUInt()

public actual fun wlanConnect2(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, pconnectionparameters: COpaquePointer?, preserved: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_wlanConnect2((hclienthandle?.value ?: 0L), (pinterfaceguid?.value ?: 0L), (pconnectionparameters?.value ?: 0L), (preserved?.value ?: 0L)).toUInt()

public actual fun wlanDeleteProfile(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, strprofilename: Pcwstr, preserved: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_wlanDeleteProfile((hclienthandle?.value ?: 0L), (pinterfaceguid?.value ?: 0L), (strprofilename?.value ?: 0L), (preserved?.value ?: 0L)).toUInt()

public actual fun wlanDeviceServiceCommand(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, pdeviceserviceguid: COpaquePointer?, dwopcode: UInt, dwinbuffersize: UInt, pinbuffer: COpaquePointer?, dwoutbuffersize: UInt, poutbuffer: COpaquePointer?, pdwbytesreturned: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_wlanDeviceServiceCommand((hclienthandle?.value ?: 0L), (pinterfaceguid?.value ?: 0L), (pdeviceserviceguid?.value ?: 0L), dwopcode.toInt(), dwinbuffersize.toInt(), (pinbuffer?.value ?: 0L), dwoutbuffersize.toInt(), (poutbuffer?.value ?: 0L), (pdwbytesreturned?.value ?: 0L)).toUInt()

public actual fun wlanDisconnect(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, preserved: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_wlanDisconnect((hclienthandle?.value ?: 0L), (pinterfaceguid?.value ?: 0L), (preserved?.value ?: 0L)).toUInt()

public actual fun wlanEnumInterfaces(hclienthandle: Handle, preserved: COpaquePointer?, ppinterfacelist: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_wlanEnumInterfaces((hclienthandle?.value ?: 0L), (preserved?.value ?: 0L), (ppinterfacelist?.value ?: 0L)).toUInt()

public actual fun wlanExtractPsdIEDataList(hclienthandle: Handle, dwiedatasize: UInt, prawiedata: COpaquePointer?, strformat: Pcwstr, preserved: COpaquePointer?, pppsdiedatalist: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_wlanExtractPsdIEDataList((hclienthandle?.value ?: 0L), dwiedatasize.toInt(), (prawiedata?.value ?: 0L), (strformat?.value ?: 0L), (preserved?.value ?: 0L), (pppsdiedatalist?.value ?: 0L)).toUInt()

public actual fun wlanFreeMemory(pmemory: COpaquePointer?) {
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_wlanFreeMemory((pmemory?.value ?: 0L))
}

public actual fun wlanGetAvailableNetworkList(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, dwflags: UInt, preserved: COpaquePointer?, ppavailablenetworklist: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_wlanGetAvailableNetworkList((hclienthandle?.value ?: 0L), (pinterfaceguid?.value ?: 0L), dwflags.toInt(), (preserved?.value ?: 0L), (ppavailablenetworklist?.value ?: 0L)).toUInt()

public actual fun wlanGetAvailableNetworkList2(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, dwflags: UInt, preserved: COpaquePointer?, ppavailablenetworklist: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_wlanGetAvailableNetworkList2((hclienthandle?.value ?: 0L), (pinterfaceguid?.value ?: 0L), dwflags.toInt(), (preserved?.value ?: 0L), (ppavailablenetworklist?.value ?: 0L)).toUInt()

public actual fun wlanGetFilterList(hclienthandle: Handle, wlanfilterlisttype: WlanFilterListType, preserved: COpaquePointer?, ppnetworklist: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_wlanGetFilterList((hclienthandle?.value ?: 0L), wlanfilterlisttype, (preserved?.value ?: 0L), (ppnetworklist?.value ?: 0L)).toUInt()

public actual fun wlanGetInterfaceCapability(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, preserved: COpaquePointer?, ppcapability: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_wlanGetInterfaceCapability((hclienthandle?.value ?: 0L), (pinterfaceguid?.value ?: 0L), (preserved?.value ?: 0L), (ppcapability?.value ?: 0L)).toUInt()

public actual fun wlanGetNetworkBssList(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, pdot11ssid: COpaquePointer?, dot11bsstype: Dot11BssType, bsecurityenabled: Bool, preserved: COpaquePointer?, ppwlanbsslist: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_wlanGetNetworkBssList((hclienthandle?.value ?: 0L), (pinterfaceguid?.value ?: 0L), (pdot11ssid?.value ?: 0L), dot11bsstype, bsecurityenabled, (preserved?.value ?: 0L), (ppwlanbsslist?.value ?: 0L)).toUInt()

public actual fun wlanGetProfile(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, strprofilename: Pcwstr, preserved: COpaquePointer?, pstrprofilexml: COpaquePointer?, pdwflags: COpaquePointer?, pdwgrantedaccess: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_wlanGetProfile((hclienthandle?.value ?: 0L), (pinterfaceguid?.value ?: 0L), (strprofilename?.value ?: 0L), (preserved?.value ?: 0L), (pstrprofilexml?.value ?: 0L), (pdwflags?.value ?: 0L), (pdwgrantedaccess?.value ?: 0L)).toUInt()

public actual fun wlanGetProfileCustomUserData(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, strprofilename: Pcwstr, preserved: COpaquePointer?, pdwdatasize: COpaquePointer?, ppdata: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_wlanGetProfileCustomUserData((hclienthandle?.value ?: 0L), (pinterfaceguid?.value ?: 0L), (strprofilename?.value ?: 0L), (preserved?.value ?: 0L), (pdwdatasize?.value ?: 0L), (ppdata?.value ?: 0L)).toUInt()

public actual fun wlanGetProfileList(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, preserved: COpaquePointer?, ppprofilelist: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_wlanGetProfileList((hclienthandle?.value ?: 0L), (pinterfaceguid?.value ?: 0L), (preserved?.value ?: 0L), (ppprofilelist?.value ?: 0L)).toUInt()

public actual fun wlanGetSecuritySettings(hclienthandle: Handle, securableobject: WlanSecurableObject, pvaluetype: COpaquePointer?, pstrcurrentsddl: COpaquePointer?, pdwgrantedaccess: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_wlanGetSecuritySettings((hclienthandle?.value ?: 0L), securableobject, (pvaluetype?.value ?: 0L), (pstrcurrentsddl?.value ?: 0L), (pdwgrantedaccess?.value ?: 0L)).toUInt()

public actual fun wlanGetSupportedDeviceServices(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, ppdevsvcguidlist: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_wlanGetSupportedDeviceServices((hclienthandle?.value ?: 0L), (pinterfaceguid?.value ?: 0L), (ppdevsvcguidlist?.value ?: 0L)).toUInt()

public actual fun wlanHostedNetworkForceStart(hclienthandle: Handle, pfailreason: COpaquePointer?, pvreserved: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkForceStart((hclienthandle?.value ?: 0L), (pfailreason?.value ?: 0L), (pvreserved?.value ?: 0L)).toUInt()

public actual fun wlanHostedNetworkForceStop(hclienthandle: Handle, pfailreason: COpaquePointer?, pvreserved: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkForceStop((hclienthandle?.value ?: 0L), (pfailreason?.value ?: 0L), (pvreserved?.value ?: 0L)).toUInt()

public actual fun wlanHostedNetworkInitSettings(hclienthandle: Handle, pfailreason: COpaquePointer?, pvreserved: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkInitSettings((hclienthandle?.value ?: 0L), (pfailreason?.value ?: 0L), (pvreserved?.value ?: 0L)).toUInt()

public actual fun wlanHostedNetworkQueryProperty(hclienthandle: Handle, opcode: WlanHostedNetworkOpcode, pdwdatasize: COpaquePointer?, ppvdata: COpaquePointer?, pwlanopcodevaluetype: COpaquePointer?, pvreserved: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkQueryProperty((hclienthandle?.value ?: 0L), opcode, (pdwdatasize?.value ?: 0L), (ppvdata?.value ?: 0L), (pwlanopcodevaluetype?.value ?: 0L), (pvreserved?.value ?: 0L)).toUInt()

public actual fun wlanHostedNetworkQuerySecondaryKey(hclienthandle: Handle, pdwkeylength: COpaquePointer?, ppuckeydata: COpaquePointer?, pbispassphrase: COpaquePointer?, pbpersistent: COpaquePointer?, pfailreason: COpaquePointer?, pvreserved: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkQuerySecondaryKey((hclienthandle?.value ?: 0L), (pdwkeylength?.value ?: 0L), (ppuckeydata?.value ?: 0L), (pbispassphrase?.value ?: 0L), (pbpersistent?.value ?: 0L), (pfailreason?.value ?: 0L), (pvreserved?.value ?: 0L)).toUInt()

public actual fun wlanHostedNetworkQueryStatus(hclienthandle: Handle, ppwlanhostednetworkstatus: COpaquePointer?, pvreserved: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkQueryStatus((hclienthandle?.value ?: 0L), (ppwlanhostednetworkstatus?.value ?: 0L), (pvreserved?.value ?: 0L)).toUInt()

public actual fun wlanHostedNetworkRefreshSecuritySettings(hclienthandle: Handle, pfailreason: COpaquePointer?, pvreserved: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkRefreshSecuritySettings((hclienthandle?.value ?: 0L), (pfailreason?.value ?: 0L), (pvreserved?.value ?: 0L)).toUInt()

public actual fun wlanHostedNetworkSetProperty(hclienthandle: Handle, opcode: WlanHostedNetworkOpcode, dwdatasize: UInt, pvdata: COpaquePointer?, pfailreason: COpaquePointer?, pvreserved: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkSetProperty((hclienthandle?.value ?: 0L), opcode, dwdatasize.toInt(), (pvdata?.value ?: 0L), (pfailreason?.value ?: 0L), (pvreserved?.value ?: 0L)).toUInt()

public actual fun wlanHostedNetworkSetSecondaryKey(hclienthandle: Handle, dwkeylength: UInt, puckeydata: COpaquePointer?, bispassphrase: Bool, bpersistent: Bool, pfailreason: COpaquePointer?, pvreserved: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkSetSecondaryKey((hclienthandle?.value ?: 0L), dwkeylength.toInt(), (puckeydata?.value ?: 0L), bispassphrase, bpersistent, (pfailreason?.value ?: 0L), (pvreserved?.value ?: 0L)).toUInt()

public actual fun wlanHostedNetworkStartUsing(hclienthandle: Handle, pfailreason: COpaquePointer?, pvreserved: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkStartUsing((hclienthandle?.value ?: 0L), (pfailreason?.value ?: 0L), (pvreserved?.value ?: 0L)).toUInt()

public actual fun wlanHostedNetworkStopUsing(hclienthandle: Handle, pfailreason: COpaquePointer?, pvreserved: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkStopUsing((hclienthandle?.value ?: 0L), (pfailreason?.value ?: 0L), (pvreserved?.value ?: 0L)).toUInt()

public actual fun wlanIhvControl(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, type: WlanIhvControlType, dwinbuffersize: UInt, pinbuffer: COpaquePointer?, dwoutbuffersize: UInt, poutbuffer: COpaquePointer?, pdwbytesreturned: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_wlanIhvControl((hclienthandle?.value ?: 0L), (pinterfaceguid?.value ?: 0L), type, dwinbuffersize.toInt(), (pinbuffer?.value ?: 0L), dwoutbuffersize.toInt(), (poutbuffer?.value ?: 0L), (pdwbytesreturned?.value ?: 0L)).toUInt()

public actual fun wlanOpenHandle(dwclientversion: UInt, preserved: COpaquePointer?, pdwnegotiatedversion: COpaquePointer?, phclienthandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_wlanOpenHandle(dwclientversion.toInt(), (preserved?.value ?: 0L), (pdwnegotiatedversion?.value ?: 0L), (phclienthandle?.value ?: 0L)).toUInt()

public actual fun wlanQueryAutoConfigParameter(hclienthandle: Handle, opcode: WlanAutoconfOpcode, preserved: COpaquePointer?, pdwdatasize: COpaquePointer?, ppdata: COpaquePointer?, pwlanopcodevaluetype: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_wlanQueryAutoConfigParameter((hclienthandle?.value ?: 0L), opcode, (preserved?.value ?: 0L), (pdwdatasize?.value ?: 0L), (ppdata?.value ?: 0L), (pwlanopcodevaluetype?.value ?: 0L)).toUInt()

public actual fun wlanQueryInterface(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, opcode: WlanIntfOpcode, preserved: COpaquePointer?, pdwdatasize: COpaquePointer?, ppdata: COpaquePointer?, pwlanopcodevaluetype: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_wlanQueryInterface((hclienthandle?.value ?: 0L), (pinterfaceguid?.value ?: 0L), opcode, (preserved?.value ?: 0L), (pdwdatasize?.value ?: 0L), (ppdata?.value ?: 0L), (pwlanopcodevaluetype?.value ?: 0L)).toUInt()

public actual fun wlanReasonCodeToString(dwreasoncode: UInt, dwbuffersize: UInt, pstringbuffer: Pcwstr, preserved: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_wlanReasonCodeToString(dwreasoncode.toInt(), dwbuffersize.toInt(), (pstringbuffer?.value ?: 0L), (preserved?.value ?: 0L)).toUInt()

public actual fun wlanRegisterDeviceServiceNotification(hclienthandle: Handle, pdevsvcguidlist: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_wlanRegisterDeviceServiceNotification((hclienthandle?.value ?: 0L), (pdevsvcguidlist?.value ?: 0L)).toUInt()

public actual fun wlanRegisterNotification(hclienthandle: Handle, dwnotifsource: WlanNotificationSources, bignoreduplicate: Bool, funccallback: WlanNotificationCallback, pcallbackcontext: COpaquePointer?, preserved: COpaquePointer?, pdwprevnotifsource: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_wlanRegisterNotification((hclienthandle?.value ?: 0L), dwnotifsource.toInt(), bignoreduplicate, 0L, (pcallbackcontext?.value ?: 0L), (preserved?.value ?: 0L), (pdwprevnotifsource?.value ?: 0L)).toUInt()

public actual fun wlanRegisterVirtualStationNotification(hclienthandle: Handle, bregister: Bool, preserved: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_wlanRegisterVirtualStationNotification((hclienthandle?.value ?: 0L), bregister, (preserved?.value ?: 0L)).toUInt()

public actual fun wlanRenameProfile(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, stroldprofilename: Pcwstr, strnewprofilename: Pcwstr, preserved: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_wlanRenameProfile((hclienthandle?.value ?: 0L), (pinterfaceguid?.value ?: 0L), (stroldprofilename?.value ?: 0L), (strnewprofilename?.value ?: 0L), (preserved?.value ?: 0L)).toUInt()

public actual fun wlanSaveTemporaryProfile(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, strprofilename: Pcwstr, stralluserprofilesecurity: Pcwstr, dwflags: UInt, boverwrite: Bool, preserved: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_wlanSaveTemporaryProfile((hclienthandle?.value ?: 0L), (pinterfaceguid?.value ?: 0L), (strprofilename?.value ?: 0L), (stralluserprofilesecurity?.value ?: 0L), dwflags.toInt(), boverwrite, (preserved?.value ?: 0L)).toUInt()

public actual fun wlanScan(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, pdot11ssid: COpaquePointer?, piedata: COpaquePointer?, preserved: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_wlanScan((hclienthandle?.value ?: 0L), (pinterfaceguid?.value ?: 0L), (pdot11ssid?.value ?: 0L), (piedata?.value ?: 0L), (preserved?.value ?: 0L)).toUInt()

public actual fun wlanSetAutoConfigParameter(hclienthandle: Handle, opcode: WlanAutoconfOpcode, dwdatasize: UInt, pdata: COpaquePointer?, preserved: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_wlanSetAutoConfigParameter((hclienthandle?.value ?: 0L), opcode, dwdatasize.toInt(), (pdata?.value ?: 0L), (preserved?.value ?: 0L)).toUInt()

public actual fun wlanSetFilterList(hclienthandle: Handle, wlanfilterlisttype: WlanFilterListType, pnetworklist: COpaquePointer?, preserved: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_wlanSetFilterList((hclienthandle?.value ?: 0L), wlanfilterlisttype, (pnetworklist?.value ?: 0L), (preserved?.value ?: 0L)).toUInt()

public actual fun wlanSetInterface(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, opcode: WlanIntfOpcode, dwdatasize: UInt, pdata: COpaquePointer?, preserved: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_wlanSetInterface((hclienthandle?.value ?: 0L), (pinterfaceguid?.value ?: 0L), opcode, dwdatasize.toInt(), (pdata?.value ?: 0L), (preserved?.value ?: 0L)).toUInt()

public actual fun wlanSetProfile(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, dwflags: UInt, strprofilexml: Pcwstr, stralluserprofilesecurity: Pcwstr, boverwrite: Bool, preserved: COpaquePointer?, pdwreasoncode: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_wlanSetProfile((hclienthandle?.value ?: 0L), (pinterfaceguid?.value ?: 0L), dwflags.toInt(), (strprofilexml?.value ?: 0L), (stralluserprofilesecurity?.value ?: 0L), boverwrite, (preserved?.value ?: 0L), (pdwreasoncode?.value ?: 0L)).toUInt()

public actual fun wlanSetProfileCustomUserData(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, strprofilename: Pcwstr, dwdatasize: UInt, pdata: COpaquePointer?, preserved: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_wlanSetProfileCustomUserData((hclienthandle?.value ?: 0L), (pinterfaceguid?.value ?: 0L), (strprofilename?.value ?: 0L), dwdatasize.toInt(), (pdata?.value ?: 0L), (preserved?.value ?: 0L)).toUInt()

public actual fun wlanSetProfileEapUserData(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, strprofilename: Pcwstr, eaptype: EapMethodType, dwflags: WlanSetEaphostFlags, dweapuserdatasize: UInt, pbeapuserdata: COpaquePointer?, preserved: COpaquePointer?): UInt =
    0u

public actual fun wlanSetProfileEapXmlUserData(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, strprofilename: Pcwstr, dwflags: WlanSetEaphostFlags, streapxmluserdata: Pcwstr, preserved: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_wlanSetProfileEapXmlUserData((hclienthandle?.value ?: 0L), (pinterfaceguid?.value ?: 0L), (strprofilename?.value ?: 0L), dwflags.toInt(), (streapxmluserdata?.value ?: 0L), (preserved?.value ?: 0L)).toUInt()

public actual fun wlanSetProfileList(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, dwitems: UInt, strprofilenames: COpaquePointer?, preserved: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_wlanSetProfileList((hclienthandle?.value ?: 0L), (pinterfaceguid?.value ?: 0L), dwitems.toInt(), (strprofilenames?.value ?: 0L), (preserved?.value ?: 0L)).toUInt()

public actual fun wlanSetProfilePosition(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, strprofilename: Pcwstr, dwposition: UInt, preserved: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_wlanSetProfilePosition((hclienthandle?.value ?: 0L), (pinterfaceguid?.value ?: 0L), (strprofilename?.value ?: 0L), dwposition.toInt(), (preserved?.value ?: 0L)).toUInt()

public actual fun wlanSetPsdIEDataList(hclienthandle: Handle, strformat: Pcwstr, ppsdiedatalist: COpaquePointer?, preserved: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_wlanSetPsdIEDataList((hclienthandle?.value ?: 0L), (strformat?.value ?: 0L), (ppsdiedatalist?.value ?: 0L), (preserved?.value ?: 0L)).toUInt()

public actual fun wlanSetSecuritySettings(hclienthandle: Handle, securableobject: WlanSecurableObject, strmodifiedsddl: Pcwstr): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_wlanSetSecuritySettings((hclienthandle?.value ?: 0L), securableobject, (strmodifiedsddl?.value ?: 0L)).toUInt()

public actual fun wlanUIEditProfile(dwclientversion: UInt, wstrprofilename: Pcwstr, pinterfaceguid: COpaquePointer?, hwnd: Hwnd, wlstartpage: WlDisplayPages, preserved: COpaquePointer?, pwlanreasoncode: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssys_windows_win32_networkmanagement_wifi_wlanUIEditProfile(dwclientversion.toInt(), (wstrprofilename?.value ?: 0L), (pinterfaceguid?.value ?: 0L), (hwnd?.value ?: 0L), wlstartpage, (preserved?.value ?: 0L), (pwlanreasoncode?.value ?: 0L)).toUInt()
