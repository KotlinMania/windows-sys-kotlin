package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PCWSTR

public fun interface FnCallback {
    public operator fun invoke(hsessionhandle: Foundation.HANDLE, pvcontext: Long, guidsessioninterface: GUID, dwerror: UInt, dwreasoncode: UInt)
}

public fun interface FnCallback1 {
    public operator fun invoke(param0: Long, param1: Long)
}

public fun WFDCancelOpenSession(hsessionhandle: Foundation.HANDLE): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WFDCancelOpenSession", longArrayOf(Win32DynamicFfi.objectSlot(hsessionhandle))).toUInt()
}

public fun WFDCloseHandle(hclienthandle: Foundation.HANDLE): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WFDCloseHandle", longArrayOf(Win32DynamicFfi.objectSlot(hclienthandle))).toUInt()
}

public fun WFDCloseSession(hsessionhandle: Foundation.HANDLE): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WFDCloseSession", longArrayOf(Win32DynamicFfi.objectSlot(hsessionhandle))).toUInt()
}

public fun WFDOpenHandle(dwclientversion: UInt, pdwnegotiatedversion: Long, phclienthandle: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WFDOpenHandle", longArrayOf(dwclientversion.toLong(), pdwnegotiatedversion, phclienthandle)).toUInt()
}

public fun WFDOpenLegacySession(hclienthandle: Foundation.HANDLE, plegacymacaddress: Long, phsessionhandle: Long, pguidsessioninterface: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WFDOpenLegacySession", longArrayOf(Win32DynamicFfi.objectSlot(hclienthandle), plegacymacaddress, phsessionhandle, pguidsessioninterface)).toUInt()
}

public fun WFDStartOpenSession(hclienthandle: Foundation.HANDLE, pdeviceaddress: Long, pvcontext: Long, pfncallback: WFD_OPEN_SESSION_COMPLETE_CALLBACK, phsessionhandle: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WFDStartOpenSession", longArrayOf(Win32DynamicFfi.objectSlot(hclienthandle), pdeviceaddress, pvcontext, Win32DynamicFfi.objectSlot(pfncallback), phsessionhandle)).toUInt()
}

public fun WFDUpdateDeviceVisibility(pdeviceaddress: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WFDUpdateDeviceVisibility", longArrayOf(pdeviceaddress)).toUInt()
}

public fun WlanAllocateMemory(dwmemorysize: UInt): Long {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanAllocateMemory", longArrayOf(dwmemorysize.toLong()))
}

public fun WlanCloseHandle(hclienthandle: Foundation.HANDLE, preserved: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanCloseHandle", longArrayOf(Win32DynamicFfi.objectSlot(hclienthandle), preserved)).toUInt()
}

public fun WlanConnect(hclienthandle: Foundation.HANDLE, pinterfaceguid: Long, pconnectionparameters: Long, preserved: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanConnect", longArrayOf(Win32DynamicFfi.objectSlot(hclienthandle), pinterfaceguid, pconnectionparameters, preserved)).toUInt()
}

public fun WlanConnect2(hclienthandle: Foundation.HANDLE, pinterfaceguid: Long, pconnectionparameters: Long, preserved: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanConnect2", longArrayOf(Win32DynamicFfi.objectSlot(hclienthandle), pinterfaceguid, pconnectionparameters, preserved)).toUInt()
}

public fun WlanDeleteProfile(hclienthandle: Foundation.HANDLE, pinterfaceguid: Long, strprofilename: PCWSTR, preserved: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanDeleteProfile", longArrayOf(Win32DynamicFfi.objectSlot(hclienthandle), pinterfaceguid, strprofilename, preserved)).toUInt()
}

public fun WlanDeviceServiceCommand(hclienthandle: Foundation.HANDLE, pinterfaceguid: Long, pdeviceserviceguid: Long, dwopcode: UInt, dwinbuffersize: UInt, pinbuffer: Long, dwoutbuffersize: UInt, poutbuffer: Long, pdwbytesreturned: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanDeviceServiceCommand", longArrayOf(Win32DynamicFfi.objectSlot(hclienthandle), pinterfaceguid, pdeviceserviceguid, dwopcode.toLong(), dwinbuffersize.toLong(), pinbuffer, dwoutbuffersize.toLong(), poutbuffer, pdwbytesreturned)).toUInt()
}

public fun WlanDisconnect(hclienthandle: Foundation.HANDLE, pinterfaceguid: Long, preserved: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanDisconnect", longArrayOf(Win32DynamicFfi.objectSlot(hclienthandle), pinterfaceguid, preserved)).toUInt()
}

public fun WlanEnumInterfaces(hclienthandle: Foundation.HANDLE, preserved: Long, ppinterfacelist: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanEnumInterfaces", longArrayOf(Win32DynamicFfi.objectSlot(hclienthandle), preserved, ppinterfacelist)).toUInt()
}

public fun WlanExtractPsdIEDataList(hclienthandle: Foundation.HANDLE, dwiedatasize: UInt, prawiedata: Long, strformat: PCWSTR, preserved: Long, pppsdiedatalist: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanExtractPsdIEDataList", longArrayOf(Win32DynamicFfi.objectSlot(hclienthandle), dwiedatasize.toLong(), prawiedata, strformat, preserved, pppsdiedatalist)).toUInt()
}

public fun WlanFreeMemory(pmemory: Long) {
    Win32DynamicFfi.invoke("wlanapi.dll", "WlanFreeMemory", longArrayOf(pmemory))
}

public fun WlanGetAvailableNetworkList(hclienthandle: Foundation.HANDLE, pinterfaceguid: Long, dwflags: UInt, preserved: Long, ppavailablenetworklist: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanGetAvailableNetworkList", longArrayOf(Win32DynamicFfi.objectSlot(hclienthandle), pinterfaceguid, dwflags.toLong(), preserved, ppavailablenetworklist)).toUInt()
}

public fun WlanGetAvailableNetworkList2(hclienthandle: Foundation.HANDLE, pinterfaceguid: Long, dwflags: UInt, preserved: Long, ppavailablenetworklist: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanGetAvailableNetworkList2", longArrayOf(Win32DynamicFfi.objectSlot(hclienthandle), pinterfaceguid, dwflags.toLong(), preserved, ppavailablenetworklist)).toUInt()
}

public fun WlanGetFilterList(hclienthandle: Foundation.HANDLE, wlanfilterlisttype: WLAN_FILTER_LIST_TYPE, preserved: Long, ppnetworklist: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanGetFilterList", longArrayOf(Win32DynamicFfi.objectSlot(hclienthandle), wlanfilterlisttype.toLong(), preserved, ppnetworklist)).toUInt()
}

public fun WlanGetInterfaceCapability(hclienthandle: Foundation.HANDLE, pinterfaceguid: Long, preserved: Long, ppcapability: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanGetInterfaceCapability", longArrayOf(Win32DynamicFfi.objectSlot(hclienthandle), pinterfaceguid, preserved, ppcapability)).toUInt()
}

public fun WlanGetNetworkBssList(hclienthandle: Foundation.HANDLE, pinterfaceguid: Long, pdot11ssid: Long, dot11bsstype: DOT11_BSS_TYPE, bsecurityenabled: BOOL, preserved: Long, ppwlanbsslist: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanGetNetworkBssList", longArrayOf(Win32DynamicFfi.objectSlot(hclienthandle), pinterfaceguid, pdot11ssid, dot11bsstype.toLong(), bsecurityenabled.toLong(), preserved, ppwlanbsslist)).toUInt()
}

public fun WlanGetProfile(hclienthandle: Foundation.HANDLE, pinterfaceguid: Long, strprofilename: PCWSTR, preserved: Long, pstrprofilexml: Long, pdwflags: Long, pdwgrantedaccess: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanGetProfile", longArrayOf(Win32DynamicFfi.objectSlot(hclienthandle), pinterfaceguid, strprofilename, preserved, pstrprofilexml, pdwflags, pdwgrantedaccess)).toUInt()
}

public fun WlanGetProfileCustomUserData(hclienthandle: Foundation.HANDLE, pinterfaceguid: Long, strprofilename: PCWSTR, preserved: Long, pdwdatasize: Long, ppdata: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanGetProfileCustomUserData", longArrayOf(Win32DynamicFfi.objectSlot(hclienthandle), pinterfaceguid, strprofilename, preserved, pdwdatasize, ppdata)).toUInt()
}

public fun WlanGetProfileList(hclienthandle: Foundation.HANDLE, pinterfaceguid: Long, preserved: Long, ppprofilelist: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanGetProfileList", longArrayOf(Win32DynamicFfi.objectSlot(hclienthandle), pinterfaceguid, preserved, ppprofilelist)).toUInt()
}

public fun WlanGetSecuritySettings(hclienthandle: Foundation.HANDLE, securableobject: WLAN_SECURABLE_OBJECT, pvaluetype: Long, pstrcurrentsddl: Long, pdwgrantedaccess: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanGetSecuritySettings", longArrayOf(Win32DynamicFfi.objectSlot(hclienthandle), securableobject.toLong(), pvaluetype, pstrcurrentsddl, pdwgrantedaccess)).toUInt()
}

public fun WlanGetSupportedDeviceServices(hclienthandle: Foundation.HANDLE, pinterfaceguid: Long, ppdevsvcguidlist: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanGetSupportedDeviceServices", longArrayOf(Win32DynamicFfi.objectSlot(hclienthandle), pinterfaceguid, ppdevsvcguidlist)).toUInt()
}

public fun WlanHostedNetworkForceStart(hclienthandle: Foundation.HANDLE, pfailreason: Long, pvreserved: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanHostedNetworkForceStart", longArrayOf(Win32DynamicFfi.objectSlot(hclienthandle), pfailreason, pvreserved)).toUInt()
}

public fun WlanHostedNetworkForceStop(hclienthandle: Foundation.HANDLE, pfailreason: Long, pvreserved: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanHostedNetworkForceStop", longArrayOf(Win32DynamicFfi.objectSlot(hclienthandle), pfailreason, pvreserved)).toUInt()
}

public fun WlanHostedNetworkInitSettings(hclienthandle: Foundation.HANDLE, pfailreason: Long, pvreserved: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanHostedNetworkInitSettings", longArrayOf(Win32DynamicFfi.objectSlot(hclienthandle), pfailreason, pvreserved)).toUInt()
}

public fun WlanHostedNetworkQueryProperty(hclienthandle: Foundation.HANDLE, opcode: WLAN_HOSTED_NETWORK_OPCODE, pdwdatasize: Long, ppvdata: Long, pwlanopcodevaluetype: Long, pvreserved: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanHostedNetworkQueryProperty", longArrayOf(Win32DynamicFfi.objectSlot(hclienthandle), opcode.toLong(), pdwdatasize, ppvdata, pwlanopcodevaluetype, pvreserved)).toUInt()
}

public fun WlanHostedNetworkQuerySecondaryKey(hclienthandle: Foundation.HANDLE, pdwkeylength: Long, ppuckeydata: Long, pbispassphrase: Long, pbpersistent: Long, pfailreason: Long, pvreserved: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanHostedNetworkQuerySecondaryKey", longArrayOf(Win32DynamicFfi.objectSlot(hclienthandle), pdwkeylength, ppuckeydata, pbispassphrase, pbpersistent, pfailreason, pvreserved)).toUInt()
}

public fun WlanHostedNetworkQueryStatus(hclienthandle: Foundation.HANDLE, ppwlanhostednetworkstatus: Long, pvreserved: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanHostedNetworkQueryStatus", longArrayOf(Win32DynamicFfi.objectSlot(hclienthandle), ppwlanhostednetworkstatus, pvreserved)).toUInt()
}

public fun WlanHostedNetworkRefreshSecuritySettings(hclienthandle: Foundation.HANDLE, pfailreason: Long, pvreserved: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanHostedNetworkRefreshSecuritySettings", longArrayOf(Win32DynamicFfi.objectSlot(hclienthandle), pfailreason, pvreserved)).toUInt()
}

public fun WlanHostedNetworkSetProperty(hclienthandle: Foundation.HANDLE, opcode: WLAN_HOSTED_NETWORK_OPCODE, dwdatasize: UInt, pvdata: Long, pfailreason: Long, pvreserved: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanHostedNetworkSetProperty", longArrayOf(Win32DynamicFfi.objectSlot(hclienthandle), opcode.toLong(), dwdatasize.toLong(), pvdata, pfailreason, pvreserved)).toUInt()
}

public fun WlanHostedNetworkSetSecondaryKey(hclienthandle: Foundation.HANDLE, dwkeylength: UInt, puckeydata: Long, bispassphrase: BOOL, bpersistent: BOOL, pfailreason: Long, pvreserved: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanHostedNetworkSetSecondaryKey", longArrayOf(Win32DynamicFfi.objectSlot(hclienthandle), dwkeylength.toLong(), puckeydata, bispassphrase.toLong(), bpersistent.toLong(), pfailreason, pvreserved)).toUInt()
}

public fun WlanHostedNetworkStartUsing(hclienthandle: Foundation.HANDLE, pfailreason: Long, pvreserved: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanHostedNetworkStartUsing", longArrayOf(Win32DynamicFfi.objectSlot(hclienthandle), pfailreason, pvreserved)).toUInt()
}

public fun WlanHostedNetworkStopUsing(hclienthandle: Foundation.HANDLE, pfailreason: Long, pvreserved: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanHostedNetworkStopUsing", longArrayOf(Win32DynamicFfi.objectSlot(hclienthandle), pfailreason, pvreserved)).toUInt()
}

public fun WlanIhvControl(hclienthandle: Foundation.HANDLE, pinterfaceguid: Long, type: WLAN_IHV_CONTROL_TYPE, dwinbuffersize: UInt, pinbuffer: Long, dwoutbuffersize: UInt, poutbuffer: Long, pdwbytesreturned: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanIhvControl", longArrayOf(Win32DynamicFfi.objectSlot(hclienthandle), pinterfaceguid, type.toLong(), dwinbuffersize.toLong(), pinbuffer, dwoutbuffersize.toLong(), poutbuffer, pdwbytesreturned)).toUInt()
}

public fun WlanOpenHandle(dwclientversion: UInt, preserved: Long, pdwnegotiatedversion: Long, phclienthandle: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanOpenHandle", longArrayOf(dwclientversion.toLong(), preserved, pdwnegotiatedversion, phclienthandle)).toUInt()
}

public fun WlanQueryAutoConfigParameter(hclienthandle: Foundation.HANDLE, opcode: WLAN_AUTOCONF_OPCODE, preserved: Long, pdwdatasize: Long, ppdata: Long, pwlanopcodevaluetype: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanQueryAutoConfigParameter", longArrayOf(Win32DynamicFfi.objectSlot(hclienthandle), opcode.toLong(), preserved, pdwdatasize, ppdata, pwlanopcodevaluetype)).toUInt()
}

public fun WlanQueryInterface(hclienthandle: Foundation.HANDLE, pinterfaceguid: Long, opcode: WLAN_INTF_OPCODE, preserved: Long, pdwdatasize: Long, ppdata: Long, pwlanopcodevaluetype: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanQueryInterface", longArrayOf(Win32DynamicFfi.objectSlot(hclienthandle), pinterfaceguid, opcode.toLong(), preserved, pdwdatasize, ppdata, pwlanopcodevaluetype)).toUInt()
}

public fun WlanReasonCodeToString(dwreasoncode: UInt, dwbuffersize: UInt, pstringbuffer: PCWSTR, preserved: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanReasonCodeToString", longArrayOf(dwreasoncode.toLong(), dwbuffersize.toLong(), pstringbuffer, preserved)).toUInt()
}

public fun WlanRegisterDeviceServiceNotification(hclienthandle: Foundation.HANDLE, pdevsvcguidlist: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanRegisterDeviceServiceNotification", longArrayOf(Win32DynamicFfi.objectSlot(hclienthandle), pdevsvcguidlist)).toUInt()
}

public fun WlanRegisterNotification(hclienthandle: Foundation.HANDLE, dwnotifsource: WLAN_NOTIFICATION_SOURCES, bignoreduplicate: BOOL, funccallback: WLAN_NOTIFICATION_CALLBACK, pcallbackcontext: Long, preserved: Long, pdwprevnotifsource: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanRegisterNotification", longArrayOf(Win32DynamicFfi.objectSlot(hclienthandle), dwnotifsource.toLong(), bignoreduplicate.toLong(), Win32DynamicFfi.objectSlot(funccallback), pcallbackcontext, preserved, pdwprevnotifsource)).toUInt()
}

public fun WlanRegisterVirtualStationNotification(hclienthandle: Foundation.HANDLE, bregister: BOOL, preserved: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanRegisterVirtualStationNotification", longArrayOf(Win32DynamicFfi.objectSlot(hclienthandle), bregister.toLong(), preserved)).toUInt()
}

public fun WlanRenameProfile(hclienthandle: Foundation.HANDLE, pinterfaceguid: Long, stroldprofilename: PCWSTR, strnewprofilename: PCWSTR, preserved: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanRenameProfile", longArrayOf(Win32DynamicFfi.objectSlot(hclienthandle), pinterfaceguid, stroldprofilename, strnewprofilename, preserved)).toUInt()
}

public fun WlanSaveTemporaryProfile(hclienthandle: Foundation.HANDLE, pinterfaceguid: Long, strprofilename: PCWSTR, stralluserprofilesecurity: PCWSTR, dwflags: UInt, boverwrite: BOOL, preserved: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanSaveTemporaryProfile", longArrayOf(Win32DynamicFfi.objectSlot(hclienthandle), pinterfaceguid, strprofilename, stralluserprofilesecurity, dwflags.toLong(), boverwrite.toLong(), preserved)).toUInt()
}

public fun WlanScan(hclienthandle: Foundation.HANDLE, pinterfaceguid: Long, pdot11ssid: Long, piedata: Long, preserved: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanScan", longArrayOf(Win32DynamicFfi.objectSlot(hclienthandle), pinterfaceguid, pdot11ssid, piedata, preserved)).toUInt()
}

public fun WlanSetAutoConfigParameter(hclienthandle: Foundation.HANDLE, opcode: WLAN_AUTOCONF_OPCODE, dwdatasize: UInt, pdata: Long, preserved: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanSetAutoConfigParameter", longArrayOf(Win32DynamicFfi.objectSlot(hclienthandle), opcode.toLong(), dwdatasize.toLong(), pdata, preserved)).toUInt()
}

public fun WlanSetFilterList(hclienthandle: Foundation.HANDLE, wlanfilterlisttype: WLAN_FILTER_LIST_TYPE, pnetworklist: Long, preserved: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanSetFilterList", longArrayOf(Win32DynamicFfi.objectSlot(hclienthandle), wlanfilterlisttype.toLong(), pnetworklist, preserved)).toUInt()
}

public fun WlanSetInterface(hclienthandle: Foundation.HANDLE, pinterfaceguid: Long, opcode: WLAN_INTF_OPCODE, dwdatasize: UInt, pdata: Long, preserved: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanSetInterface", longArrayOf(Win32DynamicFfi.objectSlot(hclienthandle), pinterfaceguid, opcode.toLong(), dwdatasize.toLong(), pdata, preserved)).toUInt()
}

public fun WlanSetProfile(hclienthandle: Foundation.HANDLE, pinterfaceguid: Long, dwflags: UInt, strprofilexml: PCWSTR, stralluserprofilesecurity: PCWSTR, boverwrite: BOOL, preserved: Long, pdwreasoncode: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanSetProfile", longArrayOf(Win32DynamicFfi.objectSlot(hclienthandle), pinterfaceguid, dwflags.toLong(), strprofilexml, stralluserprofilesecurity, boverwrite.toLong(), preserved, pdwreasoncode)).toUInt()
}

public fun WlanSetProfileCustomUserData(hclienthandle: Foundation.HANDLE, pinterfaceguid: Long, strprofilename: PCWSTR, dwdatasize: UInt, pdata: Long, preserved: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanSetProfileCustomUserData", longArrayOf(Win32DynamicFfi.objectSlot(hclienthandle), pinterfaceguid, strprofilename, dwdatasize.toLong(), pdata, preserved)).toUInt()
}

public fun WlanSetProfileEapUserData(hclienthandle: Foundation.HANDLE, pinterfaceguid: Long, strprofilename: PCWSTR, eaptype: Security.ExtensibleAuthenticationProtocol.EAP_METHOD_TYPE, dwflags: WLAN_SET_EAPHOST_FLAGS, dweapuserdatasize: UInt, pbeapuserdata: Long, preserved: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanSetProfileEapUserData", longArrayOf(Win32DynamicFfi.objectSlot(hclienthandle), pinterfaceguid, strprofilename, Win32DynamicFfi.objectSlot(eaptype), dwflags.toLong(), dweapuserdatasize.toLong(), pbeapuserdata, preserved)).toUInt()
}

public fun WlanSetProfileEapXmlUserData(hclienthandle: Foundation.HANDLE, pinterfaceguid: Long, strprofilename: PCWSTR, dwflags: WLAN_SET_EAPHOST_FLAGS, streapxmluserdata: PCWSTR, preserved: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanSetProfileEapXmlUserData", longArrayOf(Win32DynamicFfi.objectSlot(hclienthandle), pinterfaceguid, strprofilename, dwflags.toLong(), streapxmluserdata, preserved)).toUInt()
}

public fun WlanSetProfileList(hclienthandle: Foundation.HANDLE, pinterfaceguid: Long, dwitems: UInt, strprofilenames: Long, preserved: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanSetProfileList", longArrayOf(Win32DynamicFfi.objectSlot(hclienthandle), pinterfaceguid, dwitems.toLong(), strprofilenames, preserved)).toUInt()
}

public fun WlanSetProfilePosition(hclienthandle: Foundation.HANDLE, pinterfaceguid: Long, strprofilename: PCWSTR, dwposition: UInt, preserved: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanSetProfilePosition", longArrayOf(Win32DynamicFfi.objectSlot(hclienthandle), pinterfaceguid, strprofilename, dwposition.toLong(), preserved)).toUInt()
}

public fun WlanSetPsdIEDataList(hclienthandle: Foundation.HANDLE, strformat: PCWSTR, ppsdiedatalist: Long, preserved: Long): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanSetPsdIEDataList", longArrayOf(Win32DynamicFfi.objectSlot(hclienthandle), strformat, ppsdiedatalist, preserved)).toUInt()
}

public fun WlanSetSecuritySettings(hclienthandle: Foundation.HANDLE, securableobject: WLAN_SECURABLE_OBJECT, strmodifiedsddl: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("wlanapi.dll", "WlanSetSecuritySettings", longArrayOf(Win32DynamicFfi.objectSlot(hclienthandle), securableobject.toLong(), strmodifiedsddl)).toUInt()
}

public fun WlanUIEditProfile(dwclientversion: UInt, wstrprofilename: PCWSTR, pinterfaceguid: Long, hwnd: Foundation.HWND, wlstartpage: WL_DISPLAY_PAGES, preserved: Long, pwlanreasoncode: Long): UInt {
    return Win32DynamicFfi.invoke("wlanui.dll", "WlanUIEditProfile", longArrayOf(dwclientversion.toLong(), wstrprofilename, pinterfaceguid, Win32DynamicFfi.objectSlot(hwnd), wlstartpage.toLong(), preserved, pwlanreasoncode)).toUInt()
}
