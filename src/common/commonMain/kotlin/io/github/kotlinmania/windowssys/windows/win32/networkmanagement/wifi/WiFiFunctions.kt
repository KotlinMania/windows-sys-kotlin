package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.EAP_METHOD_TYPE

public fun interface FnCallback {
    public operator fun invoke(hsessionhandle: HANDLE, pvcontext: Long, guidsessioninterface: GUID, dwerror: UInt, dwreasoncode: UInt)
}

public fun interface FnCallback1 {
    public operator fun invoke(param0: Long, param1: Long)
}

public fun WFDCancelOpenSession(hsessionhandle: HANDLE): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WFDCancelOpenSession", longArrayOf(hsessionhandle)).toUInt()
}

public fun WFDCloseHandle(hclienthandle: HANDLE): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WFDCloseHandle", longArrayOf(hclienthandle)).toUInt()
}

public fun WFDCloseSession(hsessionhandle: HANDLE): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WFDCloseSession", longArrayOf(hsessionhandle)).toUInt()
}

public fun WFDOpenHandle(dwclientversion: UInt, pdwnegotiatedversion: Long, phclienthandle: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WFDOpenHandle", longArrayOf(dwclientversion.toLong(), pdwnegotiatedversion, phclienthandle)).toUInt()
}

public fun WFDOpenLegacySession(hclienthandle: HANDLE, plegacymacaddress: Long, phsessionhandle: Long, pguidsessioninterface: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WFDOpenLegacySession", longArrayOf(hclienthandle, plegacymacaddress, phsessionhandle, pguidsessioninterface)).toUInt()
}

public fun WFDStartOpenSession(hclienthandle: HANDLE, pdeviceaddress: Long, pvcontext: Long, pfncallback: WFD_OPEN_SESSION_COMPLETE_CALLBACK, phsessionhandle: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WFDStartOpenSession", longArrayOf(hclienthandle, pdeviceaddress, pvcontext, Win32DynamicFfi.objectSlot(pfncallback), phsessionhandle)).toUInt()
}

public fun WFDUpdateDeviceVisibility(pdeviceaddress: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WFDUpdateDeviceVisibility", longArrayOf(pdeviceaddress)).toUInt()
}

public fun WlanAllocateMemory(dwmemorysize: UInt): Long {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanAllocateMemory", longArrayOf(dwmemorysize.toLong()))
}

public fun WlanCloseHandle(hclienthandle: HANDLE, preserved: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanCloseHandle", longArrayOf(hclienthandle, preserved)).toUInt()
}

public fun WlanConnect(hclienthandle: HANDLE, pinterfaceguid: Long, pconnectionparameters: Long, preserved: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanConnect", longArrayOf(hclienthandle, pinterfaceguid, pconnectionparameters, preserved)).toUInt()
}

public fun WlanConnect2(hclienthandle: HANDLE, pinterfaceguid: Long, pconnectionparameters: Long, preserved: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanConnect2", longArrayOf(hclienthandle, pinterfaceguid, pconnectionparameters, preserved)).toUInt()
}

public fun WlanDeleteProfile(hclienthandle: HANDLE, pinterfaceguid: Long, strprofilename: PCWSTR, preserved: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanDeleteProfile", longArrayOf(hclienthandle, pinterfaceguid, strprofilename, preserved)).toUInt()
}

public fun WlanDeviceServiceCommand(hclienthandle: HANDLE, pinterfaceguid: Long, pdeviceserviceguid: Long, dwopcode: UInt, dwinbuffersize: UInt, pinbuffer: Long, dwoutbuffersize: UInt, poutbuffer: Long, pdwbytesreturned: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanDeviceServiceCommand", longArrayOf(hclienthandle, pinterfaceguid, pdeviceserviceguid, dwopcode.toLong(), dwinbuffersize.toLong(), pinbuffer, dwoutbuffersize.toLong(), poutbuffer, pdwbytesreturned)).toUInt()
}

public fun WlanDisconnect(hclienthandle: HANDLE, pinterfaceguid: Long, preserved: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanDisconnect", longArrayOf(hclienthandle, pinterfaceguid, preserved)).toUInt()
}

public fun WlanEnumInterfaces(hclienthandle: HANDLE, preserved: Long, ppinterfacelist: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanEnumInterfaces", longArrayOf(hclienthandle, preserved, ppinterfacelist)).toUInt()
}

public fun WlanExtractPsdIEDataList(hclienthandle: HANDLE, dwiedatasize: UInt, prawiedata: Long, strformat: PCWSTR, preserved: Long, pppsdiedatalist: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanExtractPsdIEDataList", longArrayOf(hclienthandle, dwiedatasize.toLong(), prawiedata, strformat, preserved, pppsdiedatalist)).toUInt()
}

public fun WlanFreeMemory(pmemory: Long) {
    Win32DynamicFfi.invoke("wlanapi.dll", "WlanFreeMemory", longArrayOf(pmemory))
}

public fun WlanGetAvailableNetworkList(hclienthandle: HANDLE, pinterfaceguid: Long, dwflags: UInt, preserved: Long, ppavailablenetworklist: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanGetAvailableNetworkList", longArrayOf(hclienthandle, pinterfaceguid, dwflags.toLong(), preserved, ppavailablenetworklist)).toUInt()
}

public fun WlanGetAvailableNetworkList2(hclienthandle: HANDLE, pinterfaceguid: Long, dwflags: UInt, preserved: Long, ppavailablenetworklist: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanGetAvailableNetworkList2", longArrayOf(hclienthandle, pinterfaceguid, dwflags.toLong(), preserved, ppavailablenetworklist)).toUInt()
}

public fun WlanGetFilterList(hclienthandle: HANDLE, wlanfilterlisttype: WLAN_FILTER_LIST_TYPE, preserved: Long, ppnetworklist: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanGetFilterList", longArrayOf(hclienthandle, wlanfilterlisttype.toLong(), preserved, ppnetworklist)).toUInt()
}

public fun WlanGetInterfaceCapability(hclienthandle: HANDLE, pinterfaceguid: Long, preserved: Long, ppcapability: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanGetInterfaceCapability", longArrayOf(hclienthandle, pinterfaceguid, preserved, ppcapability)).toUInt()
}

public fun WlanGetNetworkBssList(hclienthandle: HANDLE, pinterfaceguid: Long, pdot11ssid: Long, dot11bsstype: DOT11_BSS_TYPE, bsecurityenabled: BOOL, preserved: Long, ppwlanbsslist: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanGetNetworkBssList", longArrayOf(hclienthandle, pinterfaceguid, pdot11ssid, dot11bsstype.toLong(), bsecurityenabled.toLong(), preserved, ppwlanbsslist)).toUInt()
}

public fun WlanGetProfile(hclienthandle: HANDLE, pinterfaceguid: Long, strprofilename: PCWSTR, preserved: Long, pstrprofilexml: Long, pdwflags: Long, pdwgrantedaccess: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanGetProfile", longArrayOf(hclienthandle, pinterfaceguid, strprofilename, preserved, pstrprofilexml, pdwflags, pdwgrantedaccess)).toUInt()
}

public fun WlanGetProfileCustomUserData(hclienthandle: HANDLE, pinterfaceguid: Long, strprofilename: PCWSTR, preserved: Long, pdwdatasize: Long, ppdata: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanGetProfileCustomUserData", longArrayOf(hclienthandle, pinterfaceguid, strprofilename, preserved, pdwdatasize, ppdata)).toUInt()
}

public fun WlanGetProfileList(hclienthandle: HANDLE, pinterfaceguid: Long, preserved: Long, ppprofilelist: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanGetProfileList", longArrayOf(hclienthandle, pinterfaceguid, preserved, ppprofilelist)).toUInt()
}

public fun WlanGetSecuritySettings(hclienthandle: HANDLE, securableobject: WLAN_SECURABLE_OBJECT, pvaluetype: Long, pstrcurrentsddl: Long, pdwgrantedaccess: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanGetSecuritySettings", longArrayOf(hclienthandle, securableobject.toLong(), pvaluetype, pstrcurrentsddl, pdwgrantedaccess)).toUInt()
}

public fun WlanGetSupportedDeviceServices(hclienthandle: HANDLE, pinterfaceguid: Long, ppdevsvcguidlist: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanGetSupportedDeviceServices", longArrayOf(hclienthandle, pinterfaceguid, ppdevsvcguidlist)).toUInt()
}

public fun WlanHostedNetworkForceStart(hclienthandle: HANDLE, pfailreason: Long, pvreserved: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanHostedNetworkForceStart", longArrayOf(hclienthandle, pfailreason, pvreserved)).toUInt()
}

public fun WlanHostedNetworkForceStop(hclienthandle: HANDLE, pfailreason: Long, pvreserved: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanHostedNetworkForceStop", longArrayOf(hclienthandle, pfailreason, pvreserved)).toUInt()
}

public fun WlanHostedNetworkInitSettings(hclienthandle: HANDLE, pfailreason: Long, pvreserved: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanHostedNetworkInitSettings", longArrayOf(hclienthandle, pfailreason, pvreserved)).toUInt()
}

public fun WlanHostedNetworkQueryProperty(hclienthandle: HANDLE, opcode: WLAN_HOSTED_NETWORK_OPCODE, pdwdatasize: Long, ppvdata: Long, pwlanopcodevaluetype: Long, pvreserved: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanHostedNetworkQueryProperty", longArrayOf(hclienthandle, opcode.toLong(), pdwdatasize, ppvdata, pwlanopcodevaluetype, pvreserved)).toUInt()
}

public fun WlanHostedNetworkQuerySecondaryKey(hclienthandle: HANDLE, pdwkeylength: Long, ppuckeydata: Long, pbispassphrase: Long, pbpersistent: Long, pfailreason: Long, pvreserved: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanHostedNetworkQuerySecondaryKey", longArrayOf(hclienthandle, pdwkeylength, ppuckeydata, pbispassphrase, pbpersistent, pfailreason, pvreserved)).toUInt()
}

public fun WlanHostedNetworkQueryStatus(hclienthandle: HANDLE, ppwlanhostednetworkstatus: Long, pvreserved: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanHostedNetworkQueryStatus", longArrayOf(hclienthandle, ppwlanhostednetworkstatus, pvreserved)).toUInt()
}

public fun WlanHostedNetworkRefreshSecuritySettings(hclienthandle: HANDLE, pfailreason: Long, pvreserved: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanHostedNetworkRefreshSecuritySettings", longArrayOf(hclienthandle, pfailreason, pvreserved)).toUInt()
}

public fun WlanHostedNetworkSetProperty(hclienthandle: HANDLE, opcode: WLAN_HOSTED_NETWORK_OPCODE, dwdatasize: UInt, pvdata: Long, pfailreason: Long, pvreserved: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanHostedNetworkSetProperty", longArrayOf(hclienthandle, opcode.toLong(), dwdatasize.toLong(), pvdata, pfailreason, pvreserved)).toUInt()
}

public fun WlanHostedNetworkSetSecondaryKey(hclienthandle: HANDLE, dwkeylength: UInt, puckeydata: Long, bispassphrase: BOOL, bpersistent: BOOL, pfailreason: Long, pvreserved: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanHostedNetworkSetSecondaryKey", longArrayOf(hclienthandle, dwkeylength.toLong(), puckeydata, bispassphrase.toLong(), bpersistent.toLong(), pfailreason, pvreserved)).toUInt()
}

public fun WlanHostedNetworkStartUsing(hclienthandle: HANDLE, pfailreason: Long, pvreserved: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanHostedNetworkStartUsing", longArrayOf(hclienthandle, pfailreason, pvreserved)).toUInt()
}

public fun WlanHostedNetworkStopUsing(hclienthandle: HANDLE, pfailreason: Long, pvreserved: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanHostedNetworkStopUsing", longArrayOf(hclienthandle, pfailreason, pvreserved)).toUInt()
}

public fun WlanIhvControl(hclienthandle: HANDLE, pinterfaceguid: Long, type: WLAN_IHV_CONTROL_TYPE, dwinbuffersize: UInt, pinbuffer: Long, dwoutbuffersize: UInt, poutbuffer: Long, pdwbytesreturned: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanIhvControl", longArrayOf(hclienthandle, pinterfaceguid, type.toLong(), dwinbuffersize.toLong(), pinbuffer, dwoutbuffersize.toLong(), poutbuffer, pdwbytesreturned)).toUInt()
}

public fun WlanOpenHandle(dwclientversion: UInt, preserved: Long, pdwnegotiatedversion: Long, phclienthandle: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanOpenHandle", longArrayOf(dwclientversion.toLong(), preserved, pdwnegotiatedversion, phclienthandle)).toUInt()
}

public fun WlanQueryAutoConfigParameter(hclienthandle: HANDLE, opcode: WLAN_AUTOCONF_OPCODE, preserved: Long, pdwdatasize: Long, ppdata: Long, pwlanopcodevaluetype: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanQueryAutoConfigParameter", longArrayOf(hclienthandle, opcode.toLong(), preserved, pdwdatasize, ppdata, pwlanopcodevaluetype)).toUInt()
}

public fun WlanQueryInterface(hclienthandle: HANDLE, pinterfaceguid: Long, opcode: WLAN_INTF_OPCODE, preserved: Long, pdwdatasize: Long, ppdata: Long, pwlanopcodevaluetype: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanQueryInterface", longArrayOf(hclienthandle, pinterfaceguid, opcode.toLong(), preserved, pdwdatasize, ppdata, pwlanopcodevaluetype)).toUInt()
}

public fun WlanReasonCodeToString(dwreasoncode: UInt, dwbuffersize: UInt, pstringbuffer: PCWSTR, preserved: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanReasonCodeToString", longArrayOf(dwreasoncode.toLong(), dwbuffersize.toLong(), pstringbuffer, preserved)).toUInt()
}

public fun WlanRegisterDeviceServiceNotification(hclienthandle: HANDLE, pdevsvcguidlist: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanRegisterDeviceServiceNotification", longArrayOf(hclienthandle, pdevsvcguidlist)).toUInt()
}

public fun WlanRegisterNotification(hclienthandle: HANDLE, dwnotifsource: WLAN_NOTIFICATION_SOURCES, bignoreduplicate: BOOL, funccallback: WLAN_NOTIFICATION_CALLBACK, pcallbackcontext: Long, preserved: Long, pdwprevnotifsource: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanRegisterNotification", longArrayOf(hclienthandle, dwnotifsource.toLong(), bignoreduplicate.toLong(), Win32DynamicFfi.objectSlot(funccallback), pcallbackcontext, preserved, pdwprevnotifsource)).toUInt()
}

public fun WlanRegisterVirtualStationNotification(hclienthandle: HANDLE, bregister: BOOL, preserved: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanRegisterVirtualStationNotification", longArrayOf(hclienthandle, bregister.toLong(), preserved)).toUInt()
}

public fun WlanRenameProfile(hclienthandle: HANDLE, pinterfaceguid: Long, stroldprofilename: PCWSTR, strnewprofilename: PCWSTR, preserved: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanRenameProfile", longArrayOf(hclienthandle, pinterfaceguid, stroldprofilename, strnewprofilename, preserved)).toUInt()
}

public fun WlanSaveTemporaryProfile(hclienthandle: HANDLE, pinterfaceguid: Long, strprofilename: PCWSTR, stralluserprofilesecurity: PCWSTR, dwflags: UInt, boverwrite: BOOL, preserved: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanSaveTemporaryProfile", longArrayOf(hclienthandle, pinterfaceguid, strprofilename, stralluserprofilesecurity, dwflags.toLong(), boverwrite.toLong(), preserved)).toUInt()
}

public fun WlanScan(hclienthandle: HANDLE, pinterfaceguid: Long, pdot11ssid: Long, piedata: Long, preserved: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanScan", longArrayOf(hclienthandle, pinterfaceguid, pdot11ssid, piedata, preserved)).toUInt()
}

public fun WlanSetAutoConfigParameter(hclienthandle: HANDLE, opcode: WLAN_AUTOCONF_OPCODE, dwdatasize: UInt, pdata: Long, preserved: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanSetAutoConfigParameter", longArrayOf(hclienthandle, opcode.toLong(), dwdatasize.toLong(), pdata, preserved)).toUInt()
}

public fun WlanSetFilterList(hclienthandle: HANDLE, wlanfilterlisttype: WLAN_FILTER_LIST_TYPE, pnetworklist: Long, preserved: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanSetFilterList", longArrayOf(hclienthandle, wlanfilterlisttype.toLong(), pnetworklist, preserved)).toUInt()
}

public fun WlanSetInterface(hclienthandle: HANDLE, pinterfaceguid: Long, opcode: WLAN_INTF_OPCODE, dwdatasize: UInt, pdata: Long, preserved: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanSetInterface", longArrayOf(hclienthandle, pinterfaceguid, opcode.toLong(), dwdatasize.toLong(), pdata, preserved)).toUInt()
}

public fun WlanSetProfile(hclienthandle: HANDLE, pinterfaceguid: Long, dwflags: UInt, strprofilexml: PCWSTR, stralluserprofilesecurity: PCWSTR, boverwrite: BOOL, preserved: Long, pdwreasoncode: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanSetProfile", longArrayOf(hclienthandle, pinterfaceguid, dwflags.toLong(), strprofilexml, stralluserprofilesecurity, boverwrite.toLong(), preserved, pdwreasoncode)).toUInt()
}

public fun WlanSetProfileCustomUserData(hclienthandle: HANDLE, pinterfaceguid: Long, strprofilename: PCWSTR, dwdatasize: UInt, pdata: Long, preserved: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanSetProfileCustomUserData", longArrayOf(hclienthandle, pinterfaceguid, strprofilename, dwdatasize.toLong(), pdata, preserved)).toUInt()
}

public fun WlanSetProfileEapUserData(hclienthandle: HANDLE, pinterfaceguid: Long, strprofilename: PCWSTR, eaptype: EAP_METHOD_TYPE, dwflags: WLAN_SET_EAPHOST_FLAGS, dweapuserdatasize: UInt, pbeapuserdata: Long, preserved: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanSetProfileEapUserData", longArrayOf(hclienthandle, pinterfaceguid, strprofilename, run { val buf = ByteArray(16); buf[0] = eaptype.eapType.type.toByte(); buf[4] = (eaptype.eapType.dwVendorId.toInt() and 0xFF).toByte(); buf[5] = ((eaptype.eapType.dwVendorId.toInt() ushr 8) and 0xFF).toByte(); buf[6] = ((eaptype.eapType.dwVendorId.toInt() ushr 16) and 0xFF).toByte(); buf[7] = ((eaptype.eapType.dwVendorId.toInt() ushr 24) and 0xFF).toByte(); buf[8] = (eaptype.eapType.dwVendorType.toInt() and 0xFF).toByte(); buf[9] = ((eaptype.eapType.dwVendorType.toInt() ushr 8) and 0xFF).toByte(); buf[10] = ((eaptype.eapType.dwVendorType.toInt() ushr 16) and 0xFF).toByte(); buf[11] = ((eaptype.eapType.dwVendorType.toInt() ushr 24) and 0xFF).toByte(); buf[12] = (eaptype.dwAuthorId.toInt() and 0xFF).toByte(); buf[13] = ((eaptype.dwAuthorId.toInt() ushr 8) and 0xFF).toByte(); buf[14] = ((eaptype.dwAuthorId.toInt() ushr 16) and 0xFF).toByte(); buf[15] = ((eaptype.dwAuthorId.toInt() ushr 24) and 0xFF).toByte(); val ptr = Win32DynamicFfi.allocZeroed(16); Win32DynamicFfi.writeBytes(ptr, buf); ptr }, dwflags.toLong(), dweapuserdatasize.toLong(), pbeapuserdata, preserved)).toUInt()
}

public fun WlanSetProfileEapXmlUserData(hclienthandle: HANDLE, pinterfaceguid: Long, strprofilename: PCWSTR, dwflags: WLAN_SET_EAPHOST_FLAGS, streapxmluserdata: PCWSTR, preserved: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanSetProfileEapXmlUserData", longArrayOf(hclienthandle, pinterfaceguid, strprofilename, dwflags.toLong(), streapxmluserdata, preserved)).toUInt()
}

public fun WlanSetProfileList(hclienthandle: HANDLE, pinterfaceguid: Long, dwitems: UInt, strprofilenames: Long, preserved: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanSetProfileList", longArrayOf(hclienthandle, pinterfaceguid, dwitems.toLong(), strprofilenames, preserved)).toUInt()
}

public fun WlanSetProfilePosition(hclienthandle: HANDLE, pinterfaceguid: Long, strprofilename: PCWSTR, dwposition: UInt, preserved: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanSetProfilePosition", longArrayOf(hclienthandle, pinterfaceguid, strprofilename, dwposition.toLong(), preserved)).toUInt()
}

public fun WlanSetPsdIEDataList(hclienthandle: HANDLE, strformat: PCWSTR, ppsdiedatalist: Long, preserved: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanSetPsdIEDataList", longArrayOf(hclienthandle, strformat, ppsdiedatalist, preserved)).toUInt()
}

public fun WlanSetSecuritySettings(hclienthandle: HANDLE, securableobject: WLAN_SECURABLE_OBJECT, strmodifiedsddl: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanSetSecuritySettings", longArrayOf(hclienthandle, securableobject.toLong(), strmodifiedsddl)).toUInt()
}

public fun WlanUIEditProfile(dwclientversion: UInt, wstrprofilename: PCWSTR, pinterfaceguid: Long, hwnd: HWND, wlstartpage: WL_DISPLAY_PAGES, preserved: Long, pwlanreasoncode: Long): UInt {
    return Win32DynamicFfi.invoke("wlanui.dll", "WlanUIEditProfile", longArrayOf(dwclientversion.toLong(), wstrprofilename, pinterfaceguid, hwnd, wlstartpage.toLong(), preserved, pwlanreasoncode)).toUInt()
}
