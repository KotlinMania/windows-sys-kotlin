@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.EAP_METHOD_TYPE

private val _windowsWin32NetworkmanagementWifiNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun WFDCancelOpenSession(hsessionhandle: HANDLE): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAddon != null) (_windowsWin32NetworkmanagementWifiNapiAddon.windowssys_windows_win32_networkmanagement_wifi_WFDCancelOpenSession(hsessionhandle.toString()) as Int).toUInt() else 0u

public actual fun WFDCloseHandle(hclienthandle: HANDLE): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAddon != null) (_windowsWin32NetworkmanagementWifiNapiAddon.windowssys_windows_win32_networkmanagement_wifi_WFDCloseHandle(hclienthandle.toString()) as Int).toUInt() else 0u

public actual fun WFDCloseSession(hsessionhandle: HANDLE): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAddon != null) (_windowsWin32NetworkmanagementWifiNapiAddon.windowssys_windows_win32_networkmanagement_wifi_WFDCloseSession(hsessionhandle.toString()) as Int).toUInt() else 0u

public actual fun WFDOpenHandle(dwclientversion: UInt, pdwnegotiatedversion: Long, phclienthandle: Long): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAddon != null) (_windowsWin32NetworkmanagementWifiNapiAddon.windowssys_windows_win32_networkmanagement_wifi_WFDOpenHandle(dwclientversion.toInt(), pdwnegotiatedversion.toString(), phclienthandle.toString()) as Int).toUInt() else 0u

public actual fun WFDOpenLegacySession(hclienthandle: HANDLE, plegacymacaddress: Long, phsessionhandle: Long, pguidsessioninterface: Long): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAddon != null) (_windowsWin32NetworkmanagementWifiNapiAddon.windowssys_windows_win32_networkmanagement_wifi_WFDOpenLegacySession(hclienthandle.toString(), plegacymacaddress.toString(), phsessionhandle.toString(), pguidsessioninterface.toString()) as Int).toUInt() else 0u

public actual fun WFDStartOpenSession(hclienthandle: HANDLE, pdeviceaddress: Long, pvcontext: Long, pfncallback: WFD_OPEN_SESSION_COMPLETE_CALLBACK, phsessionhandle: Long): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAddon != null) (_windowsWin32NetworkmanagementWifiNapiAddon.windowssys_windows_win32_networkmanagement_wifi_WFDStartOpenSession(hclienthandle.toString(), pdeviceaddress.toString(), pvcontext.toString(), pfncallback.toLong().toString(), phsessionhandle.toString()) as Int).toUInt() else 0u

public actual fun WFDUpdateDeviceVisibility(pdeviceaddress: Long): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAddon != null) (_windowsWin32NetworkmanagementWifiNapiAddon.windowssys_windows_win32_networkmanagement_wifi_WFDUpdateDeviceVisibility(pdeviceaddress.toString()) as Int).toUInt() else 0u

public actual fun WlanAllocateMemory(dwmemorysize: UInt): Long =
    if (_windowsWin32NetworkmanagementWifiNapiAddon != null) (_windowsWin32NetworkmanagementWifiNapiAddon.windowssys_windows_win32_networkmanagement_wifi_WlanAllocateMemory(dwmemorysize.toInt()) as String).toLong() else 0L

public actual fun WlanCloseHandle(hclienthandle: HANDLE, preserved: Long): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAddon != null) (_windowsWin32NetworkmanagementWifiNapiAddon.windowssys_windows_win32_networkmanagement_wifi_WlanCloseHandle(hclienthandle.toString(), preserved.toString()) as Int).toUInt() else 0u

public actual fun WlanConnect(hclienthandle: HANDLE, pinterfaceguid: Long, pconnectionparameters: Long, preserved: Long): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAddon != null) (_windowsWin32NetworkmanagementWifiNapiAddon.windowssys_windows_win32_networkmanagement_wifi_WlanConnect(hclienthandle.toString(), pinterfaceguid.toString(), pconnectionparameters.toString(), preserved.toString()) as Int).toUInt() else 0u

public actual fun WlanConnect2(hclienthandle: HANDLE, pinterfaceguid: Long, pconnectionparameters: Long, preserved: Long): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAddon != null) (_windowsWin32NetworkmanagementWifiNapiAddon.windowssys_windows_win32_networkmanagement_wifi_WlanConnect2(hclienthandle.toString(), pinterfaceguid.toString(), pconnectionparameters.toString(), preserved.toString()) as Int).toUInt() else 0u

public actual fun WlanDeleteProfile(hclienthandle: HANDLE, pinterfaceguid: Long, strprofilename: PCWSTR, preserved: Long): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAddon != null) (_windowsWin32NetworkmanagementWifiNapiAddon.windowssys_windows_win32_networkmanagement_wifi_WlanDeleteProfile(hclienthandle.toString(), pinterfaceguid.toString(), strprofilename.toString(), preserved.toString()) as Int).toUInt() else 0u

public actual fun WlanDeviceServiceCommand(hclienthandle: HANDLE, pinterfaceguid: Long, pdeviceserviceguid: Long, dwopcode: UInt, dwinbuffersize: UInt, pinbuffer: Long, dwoutbuffersize: UInt, poutbuffer: Long, pdwbytesreturned: Long): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAddon != null) (_windowsWin32NetworkmanagementWifiNapiAddon.windowssys_windows_win32_networkmanagement_wifi_WlanDeviceServiceCommand(hclienthandle.toString(), pinterfaceguid.toString(), pdeviceserviceguid.toString(), dwopcode.toInt(), dwinbuffersize.toInt(), pinbuffer.toString(), dwoutbuffersize.toInt(), poutbuffer.toString(), pdwbytesreturned.toString()) as Int).toUInt() else 0u

public actual fun WlanDisconnect(hclienthandle: HANDLE, pinterfaceguid: Long, preserved: Long): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAddon != null) (_windowsWin32NetworkmanagementWifiNapiAddon.windowssys_windows_win32_networkmanagement_wifi_WlanDisconnect(hclienthandle.toString(), pinterfaceguid.toString(), preserved.toString()) as Int).toUInt() else 0u

public actual fun WlanEnumInterfaces(hclienthandle: HANDLE, preserved: Long, ppinterfacelist: Long): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAddon != null) (_windowsWin32NetworkmanagementWifiNapiAddon.windowssys_windows_win32_networkmanagement_wifi_WlanEnumInterfaces(hclienthandle.toString(), preserved.toString(), ppinterfacelist.toString()) as Int).toUInt() else 0u

public actual fun WlanExtractPsdIEDataList(hclienthandle: HANDLE, dwiedatasize: UInt, prawiedata: Long, strformat: PCWSTR, preserved: Long, pppsdiedatalist: Long): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAddon != null) (_windowsWin32NetworkmanagementWifiNapiAddon.windowssys_windows_win32_networkmanagement_wifi_WlanExtractPsdIEDataList(hclienthandle.toString(), dwiedatasize.toInt(), prawiedata.toString(), strformat.toString(), preserved.toString(), pppsdiedatalist.toString()) as Int).toUInt() else 0u

public actual fun WlanFreeMemory(pmemory: Long) {
    if (_windowsWin32NetworkmanagementWifiNapiAddon != null) {
        _windowsWin32NetworkmanagementWifiNapiAddon.windowssys_windows_win32_networkmanagement_wifi_WlanFreeMemory(pmemory.toString())
    }
}

public actual fun WlanGetAvailableNetworkList(hclienthandle: HANDLE, pinterfaceguid: Long, dwflags: UInt, preserved: Long, ppavailablenetworklist: Long): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAddon != null) (_windowsWin32NetworkmanagementWifiNapiAddon.windowssys_windows_win32_networkmanagement_wifi_WlanGetAvailableNetworkList(hclienthandle.toString(), pinterfaceguid.toString(), dwflags.toInt(), preserved.toString(), ppavailablenetworklist.toString()) as Int).toUInt() else 0u

public actual fun WlanGetAvailableNetworkList2(hclienthandle: HANDLE, pinterfaceguid: Long, dwflags: UInt, preserved: Long, ppavailablenetworklist: Long): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAddon != null) (_windowsWin32NetworkmanagementWifiNapiAddon.windowssys_windows_win32_networkmanagement_wifi_WlanGetAvailableNetworkList2(hclienthandle.toString(), pinterfaceguid.toString(), dwflags.toInt(), preserved.toString(), ppavailablenetworklist.toString()) as Int).toUInt() else 0u

public actual fun WlanGetFilterList(hclienthandle: HANDLE, wlanfilterlisttype: WLAN_FILTER_LIST_TYPE, preserved: Long, ppnetworklist: Long): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAddon != null) (_windowsWin32NetworkmanagementWifiNapiAddon.windowssys_windows_win32_networkmanagement_wifi_WlanGetFilterList(hclienthandle.toString(), wlanfilterlisttype, preserved.toString(), ppnetworklist.toString()) as Int).toUInt() else 0u

public actual fun WlanGetInterfaceCapability(hclienthandle: HANDLE, pinterfaceguid: Long, preserved: Long, ppcapability: Long): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAddon != null) (_windowsWin32NetworkmanagementWifiNapiAddon.windowssys_windows_win32_networkmanagement_wifi_WlanGetInterfaceCapability(hclienthandle.toString(), pinterfaceguid.toString(), preserved.toString(), ppcapability.toString()) as Int).toUInt() else 0u

public actual fun WlanGetNetworkBssList(hclienthandle: HANDLE, pinterfaceguid: Long, pdot11ssid: Long, dot11bsstype: DOT11_BSS_TYPE, bsecurityenabled: BOOL, preserved: Long, ppwlanbsslist: Long): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAddon != null) (_windowsWin32NetworkmanagementWifiNapiAddon.windowssys_windows_win32_networkmanagement_wifi_WlanGetNetworkBssList(hclienthandle.toString(), pinterfaceguid.toString(), pdot11ssid.toString(), dot11bsstype, bsecurityenabled, preserved.toString(), ppwlanbsslist.toString()) as Int).toUInt() else 0u

public actual fun WlanGetProfile(hclienthandle: HANDLE, pinterfaceguid: Long, strprofilename: PCWSTR, preserved: Long, pstrprofilexml: Long, pdwflags: Long, pdwgrantedaccess: Long): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAddon != null) (_windowsWin32NetworkmanagementWifiNapiAddon.windowssys_windows_win32_networkmanagement_wifi_WlanGetProfile(hclienthandle.toString(), pinterfaceguid.toString(), strprofilename.toString(), preserved.toString(), pstrprofilexml.toString(), pdwflags.toString(), pdwgrantedaccess.toString()) as Int).toUInt() else 0u

public actual fun WlanGetProfileCustomUserData(hclienthandle: HANDLE, pinterfaceguid: Long, strprofilename: PCWSTR, preserved: Long, pdwdatasize: Long, ppdata: Long): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAddon != null) (_windowsWin32NetworkmanagementWifiNapiAddon.windowssys_windows_win32_networkmanagement_wifi_WlanGetProfileCustomUserData(hclienthandle.toString(), pinterfaceguid.toString(), strprofilename.toString(), preserved.toString(), pdwdatasize.toString(), ppdata.toString()) as Int).toUInt() else 0u

public actual fun WlanGetProfileList(hclienthandle: HANDLE, pinterfaceguid: Long, preserved: Long, ppprofilelist: Long): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAddon != null) (_windowsWin32NetworkmanagementWifiNapiAddon.windowssys_windows_win32_networkmanagement_wifi_WlanGetProfileList(hclienthandle.toString(), pinterfaceguid.toString(), preserved.toString(), ppprofilelist.toString()) as Int).toUInt() else 0u

public actual fun WlanGetSecuritySettings(hclienthandle: HANDLE, securableobject: WLAN_SECURABLE_OBJECT, pvaluetype: Long, pstrcurrentsddl: Long, pdwgrantedaccess: Long): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAddon != null) (_windowsWin32NetworkmanagementWifiNapiAddon.windowssys_windows_win32_networkmanagement_wifi_WlanGetSecuritySettings(hclienthandle.toString(), securableobject, pvaluetype.toString(), pstrcurrentsddl.toString(), pdwgrantedaccess.toString()) as Int).toUInt() else 0u

public actual fun WlanGetSupportedDeviceServices(hclienthandle: HANDLE, pinterfaceguid: Long, ppdevsvcguidlist: Long): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAddon != null) (_windowsWin32NetworkmanagementWifiNapiAddon.windowssys_windows_win32_networkmanagement_wifi_WlanGetSupportedDeviceServices(hclienthandle.toString(), pinterfaceguid.toString(), ppdevsvcguidlist.toString()) as Int).toUInt() else 0u

public actual fun WlanHostedNetworkForceStart(hclienthandle: HANDLE, pfailreason: Long, pvreserved: Long): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAddon != null) (_windowsWin32NetworkmanagementWifiNapiAddon.windowssys_windows_win32_networkmanagement_wifi_WlanHostedNetworkForceStart(hclienthandle.toString(), pfailreason.toString(), pvreserved.toString()) as Int).toUInt() else 0u

public actual fun WlanHostedNetworkForceStop(hclienthandle: HANDLE, pfailreason: Long, pvreserved: Long): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAddon != null) (_windowsWin32NetworkmanagementWifiNapiAddon.windowssys_windows_win32_networkmanagement_wifi_WlanHostedNetworkForceStop(hclienthandle.toString(), pfailreason.toString(), pvreserved.toString()) as Int).toUInt() else 0u

public actual fun WlanHostedNetworkInitSettings(hclienthandle: HANDLE, pfailreason: Long, pvreserved: Long): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAddon != null) (_windowsWin32NetworkmanagementWifiNapiAddon.windowssys_windows_win32_networkmanagement_wifi_WlanHostedNetworkInitSettings(hclienthandle.toString(), pfailreason.toString(), pvreserved.toString()) as Int).toUInt() else 0u

public actual fun WlanHostedNetworkQueryProperty(hclienthandle: HANDLE, opcode: WLAN_HOSTED_NETWORK_OPCODE, pdwdatasize: Long, ppvdata: Long, pwlanopcodevaluetype: Long, pvreserved: Long): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAddon != null) (_windowsWin32NetworkmanagementWifiNapiAddon.windowssys_windows_win32_networkmanagement_wifi_WlanHostedNetworkQueryProperty(hclienthandle.toString(), opcode, pdwdatasize.toString(), ppvdata.toString(), pwlanopcodevaluetype.toString(), pvreserved.toString()) as Int).toUInt() else 0u

public actual fun WlanHostedNetworkQuerySecondaryKey(hclienthandle: HANDLE, pdwkeylength: Long, ppuckeydata: Long, pbispassphrase: Long, pbpersistent: Long, pfailreason: Long, pvreserved: Long): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAddon != null) (_windowsWin32NetworkmanagementWifiNapiAddon.windowssys_windows_win32_networkmanagement_wifi_WlanHostedNetworkQuerySecondaryKey(hclienthandle.toString(), pdwkeylength.toString(), ppuckeydata.toString(), pbispassphrase.toString(), pbpersistent.toString(), pfailreason.toString(), pvreserved.toString()) as Int).toUInt() else 0u

public actual fun WlanHostedNetworkQueryStatus(hclienthandle: HANDLE, ppwlanhostednetworkstatus: Long, pvreserved: Long): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAddon != null) (_windowsWin32NetworkmanagementWifiNapiAddon.windowssys_windows_win32_networkmanagement_wifi_WlanHostedNetworkQueryStatus(hclienthandle.toString(), ppwlanhostednetworkstatus.toString(), pvreserved.toString()) as Int).toUInt() else 0u

public actual fun WlanHostedNetworkRefreshSecuritySettings(hclienthandle: HANDLE, pfailreason: Long, pvreserved: Long): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAddon != null) (_windowsWin32NetworkmanagementWifiNapiAddon.windowssys_windows_win32_networkmanagement_wifi_WlanHostedNetworkRefreshSecuritySettings(hclienthandle.toString(), pfailreason.toString(), pvreserved.toString()) as Int).toUInt() else 0u

public actual fun WlanHostedNetworkSetProperty(hclienthandle: HANDLE, opcode: WLAN_HOSTED_NETWORK_OPCODE, dwdatasize: UInt, pvdata: Long, pfailreason: Long, pvreserved: Long): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAddon != null) (_windowsWin32NetworkmanagementWifiNapiAddon.windowssys_windows_win32_networkmanagement_wifi_WlanHostedNetworkSetProperty(hclienthandle.toString(), opcode, dwdatasize.toInt(), pvdata.toString(), pfailreason.toString(), pvreserved.toString()) as Int).toUInt() else 0u

public actual fun WlanHostedNetworkSetSecondaryKey(hclienthandle: HANDLE, dwkeylength: UInt, puckeydata: Long, bispassphrase: BOOL, bpersistent: BOOL, pfailreason: Long, pvreserved: Long): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAddon != null) (_windowsWin32NetworkmanagementWifiNapiAddon.windowssys_windows_win32_networkmanagement_wifi_WlanHostedNetworkSetSecondaryKey(hclienthandle.toString(), dwkeylength.toInt(), puckeydata.toString(), bispassphrase, bpersistent, pfailreason.toString(), pvreserved.toString()) as Int).toUInt() else 0u

public actual fun WlanHostedNetworkStartUsing(hclienthandle: HANDLE, pfailreason: Long, pvreserved: Long): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAddon != null) (_windowsWin32NetworkmanagementWifiNapiAddon.windowssys_windows_win32_networkmanagement_wifi_WlanHostedNetworkStartUsing(hclienthandle.toString(), pfailreason.toString(), pvreserved.toString()) as Int).toUInt() else 0u

public actual fun WlanHostedNetworkStopUsing(hclienthandle: HANDLE, pfailreason: Long, pvreserved: Long): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAddon != null) (_windowsWin32NetworkmanagementWifiNapiAddon.windowssys_windows_win32_networkmanagement_wifi_WlanHostedNetworkStopUsing(hclienthandle.toString(), pfailreason.toString(), pvreserved.toString()) as Int).toUInt() else 0u

public actual fun WlanIhvControl(hclienthandle: HANDLE, pinterfaceguid: Long, type: WLAN_IHV_CONTROL_TYPE, dwinbuffersize: UInt, pinbuffer: Long, dwoutbuffersize: UInt, poutbuffer: Long, pdwbytesreturned: Long): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAddon != null) (_windowsWin32NetworkmanagementWifiNapiAddon.windowssys_windows_win32_networkmanagement_wifi_WlanIhvControl(hclienthandle.toString(), pinterfaceguid.toString(), type, dwinbuffersize.toInt(), pinbuffer.toString(), dwoutbuffersize.toInt(), poutbuffer.toString(), pdwbytesreturned.toString()) as Int).toUInt() else 0u

public actual fun WlanOpenHandle(dwclientversion: UInt, preserved: Long, pdwnegotiatedversion: Long, phclienthandle: Long): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAddon != null) (_windowsWin32NetworkmanagementWifiNapiAddon.windowssys_windows_win32_networkmanagement_wifi_WlanOpenHandle(dwclientversion.toInt(), preserved.toString(), pdwnegotiatedversion.toString(), phclienthandle.toString()) as Int).toUInt() else 0u

public actual fun WlanQueryAutoConfigParameter(hclienthandle: HANDLE, opcode: WLAN_AUTOCONF_OPCODE, preserved: Long, pdwdatasize: Long, ppdata: Long, pwlanopcodevaluetype: Long): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAddon != null) (_windowsWin32NetworkmanagementWifiNapiAddon.windowssys_windows_win32_networkmanagement_wifi_WlanQueryAutoConfigParameter(hclienthandle.toString(), opcode, preserved.toString(), pdwdatasize.toString(), ppdata.toString(), pwlanopcodevaluetype.toString()) as Int).toUInt() else 0u

public actual fun WlanQueryInterface(hclienthandle: HANDLE, pinterfaceguid: Long, opcode: WLAN_INTF_OPCODE, preserved: Long, pdwdatasize: Long, ppdata: Long, pwlanopcodevaluetype: Long): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAddon != null) (_windowsWin32NetworkmanagementWifiNapiAddon.windowssys_windows_win32_networkmanagement_wifi_WlanQueryInterface(hclienthandle.toString(), pinterfaceguid.toString(), opcode, preserved.toString(), pdwdatasize.toString(), ppdata.toString(), pwlanopcodevaluetype.toString()) as Int).toUInt() else 0u

public actual fun WlanReasonCodeToString(dwreasoncode: UInt, dwbuffersize: UInt, pstringbuffer: PCWSTR, preserved: Long): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAddon != null) (_windowsWin32NetworkmanagementWifiNapiAddon.windowssys_windows_win32_networkmanagement_wifi_WlanReasonCodeToString(dwreasoncode.toInt(), dwbuffersize.toInt(), pstringbuffer.toString(), preserved.toString()) as Int).toUInt() else 0u

public actual fun WlanRegisterDeviceServiceNotification(hclienthandle: HANDLE, pdevsvcguidlist: Long): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAddon != null) (_windowsWin32NetworkmanagementWifiNapiAddon.windowssys_windows_win32_networkmanagement_wifi_WlanRegisterDeviceServiceNotification(hclienthandle.toString(), pdevsvcguidlist.toString()) as Int).toUInt() else 0u

public actual fun WlanRegisterNotification(hclienthandle: HANDLE, dwnotifsource: WLAN_NOTIFICATION_SOURCES, bignoreduplicate: BOOL, funccallback: WLAN_NOTIFICATION_CALLBACK, pcallbackcontext: Long, preserved: Long, pdwprevnotifsource: Long): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAddon != null) (_windowsWin32NetworkmanagementWifiNapiAddon.windowssys_windows_win32_networkmanagement_wifi_WlanRegisterNotification(hclienthandle.toString(), dwnotifsource.toInt(), bignoreduplicate, funccallback.toLong().toString(), pcallbackcontext.toString(), preserved.toString(), pdwprevnotifsource.toString()) as Int).toUInt() else 0u

public actual fun WlanRegisterVirtualStationNotification(hclienthandle: HANDLE, bregister: BOOL, preserved: Long): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAddon != null) (_windowsWin32NetworkmanagementWifiNapiAddon.windowssys_windows_win32_networkmanagement_wifi_WlanRegisterVirtualStationNotification(hclienthandle.toString(), bregister, preserved.toString()) as Int).toUInt() else 0u

public actual fun WlanRenameProfile(hclienthandle: HANDLE, pinterfaceguid: Long, stroldprofilename: PCWSTR, strnewprofilename: PCWSTR, preserved: Long): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAddon != null) (_windowsWin32NetworkmanagementWifiNapiAddon.windowssys_windows_win32_networkmanagement_wifi_WlanRenameProfile(hclienthandle.toString(), pinterfaceguid.toString(), stroldprofilename.toString(), strnewprofilename.toString(), preserved.toString()) as Int).toUInt() else 0u

public actual fun WlanSaveTemporaryProfile(hclienthandle: HANDLE, pinterfaceguid: Long, strprofilename: PCWSTR, stralluserprofilesecurity: PCWSTR, dwflags: UInt, boverwrite: BOOL, preserved: Long): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAddon != null) (_windowsWin32NetworkmanagementWifiNapiAddon.windowssys_windows_win32_networkmanagement_wifi_WlanSaveTemporaryProfile(hclienthandle.toString(), pinterfaceguid.toString(), strprofilename.toString(), stralluserprofilesecurity.toString(), dwflags.toInt(), boverwrite, preserved.toString()) as Int).toUInt() else 0u

public actual fun WlanScan(hclienthandle: HANDLE, pinterfaceguid: Long, pdot11ssid: Long, piedata: Long, preserved: Long): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAddon != null) (_windowsWin32NetworkmanagementWifiNapiAddon.windowssys_windows_win32_networkmanagement_wifi_WlanScan(hclienthandle.toString(), pinterfaceguid.toString(), pdot11ssid.toString(), piedata.toString(), preserved.toString()) as Int).toUInt() else 0u

public actual fun WlanSetAutoConfigParameter(hclienthandle: HANDLE, opcode: WLAN_AUTOCONF_OPCODE, dwdatasize: UInt, pdata: Long, preserved: Long): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAddon != null) (_windowsWin32NetworkmanagementWifiNapiAddon.windowssys_windows_win32_networkmanagement_wifi_WlanSetAutoConfigParameter(hclienthandle.toString(), opcode, dwdatasize.toInt(), pdata.toString(), preserved.toString()) as Int).toUInt() else 0u

public actual fun WlanSetFilterList(hclienthandle: HANDLE, wlanfilterlisttype: WLAN_FILTER_LIST_TYPE, pnetworklist: Long, preserved: Long): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAddon != null) (_windowsWin32NetworkmanagementWifiNapiAddon.windowssys_windows_win32_networkmanagement_wifi_WlanSetFilterList(hclienthandle.toString(), wlanfilterlisttype, pnetworklist.toString(), preserved.toString()) as Int).toUInt() else 0u

public actual fun WlanSetInterface(hclienthandle: HANDLE, pinterfaceguid: Long, opcode: WLAN_INTF_OPCODE, dwdatasize: UInt, pdata: Long, preserved: Long): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAddon != null) (_windowsWin32NetworkmanagementWifiNapiAddon.windowssys_windows_win32_networkmanagement_wifi_WlanSetInterface(hclienthandle.toString(), pinterfaceguid.toString(), opcode, dwdatasize.toInt(), pdata.toString(), preserved.toString()) as Int).toUInt() else 0u

public actual fun WlanSetProfile(hclienthandle: HANDLE, pinterfaceguid: Long, dwflags: UInt, strprofilexml: PCWSTR, stralluserprofilesecurity: PCWSTR, boverwrite: BOOL, preserved: Long, pdwreasoncode: Long): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAddon != null) (_windowsWin32NetworkmanagementWifiNapiAddon.windowssys_windows_win32_networkmanagement_wifi_WlanSetProfile(hclienthandle.toString(), pinterfaceguid.toString(), dwflags.toInt(), strprofilexml.toString(), stralluserprofilesecurity.toString(), boverwrite, preserved.toString(), pdwreasoncode.toString()) as Int).toUInt() else 0u

public actual fun WlanSetProfileCustomUserData(hclienthandle: HANDLE, pinterfaceguid: Long, strprofilename: PCWSTR, dwdatasize: UInt, pdata: Long, preserved: Long): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAddon != null) (_windowsWin32NetworkmanagementWifiNapiAddon.windowssys_windows_win32_networkmanagement_wifi_WlanSetProfileCustomUserData(hclienthandle.toString(), pinterfaceguid.toString(), strprofilename.toString(), dwdatasize.toInt(), pdata.toString(), preserved.toString()) as Int).toUInt() else 0u

public actual fun WlanSetProfileEapUserData(hclienthandle: HANDLE, pinterfaceguid: Long, strprofilename: PCWSTR, eaptype: EAP_METHOD_TYPE, dwflags: WLAN_SET_EAPHOST_FLAGS, dweapuserdatasize: UInt, pbeapuserdata: Long, preserved: Long): UInt =
    0u

public actual fun WlanSetProfileEapXmlUserData(hclienthandle: HANDLE, pinterfaceguid: Long, strprofilename: PCWSTR, dwflags: WLAN_SET_EAPHOST_FLAGS, streapxmluserdata: PCWSTR, preserved: Long): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAddon != null) (_windowsWin32NetworkmanagementWifiNapiAddon.windowssys_windows_win32_networkmanagement_wifi_WlanSetProfileEapXmlUserData(hclienthandle.toString(), pinterfaceguid.toString(), strprofilename.toString(), dwflags.toInt(), streapxmluserdata.toString(), preserved.toString()) as Int).toUInt() else 0u

public actual fun WlanSetProfileList(hclienthandle: HANDLE, pinterfaceguid: Long, dwitems: UInt, strprofilenames: Long, preserved: Long): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAddon != null) (_windowsWin32NetworkmanagementWifiNapiAddon.windowssys_windows_win32_networkmanagement_wifi_WlanSetProfileList(hclienthandle.toString(), pinterfaceguid.toString(), dwitems.toInt(), strprofilenames.toString(), preserved.toString()) as Int).toUInt() else 0u

public actual fun WlanSetProfilePosition(hclienthandle: HANDLE, pinterfaceguid: Long, strprofilename: PCWSTR, dwposition: UInt, preserved: Long): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAddon != null) (_windowsWin32NetworkmanagementWifiNapiAddon.windowssys_windows_win32_networkmanagement_wifi_WlanSetProfilePosition(hclienthandle.toString(), pinterfaceguid.toString(), strprofilename.toString(), dwposition.toInt(), preserved.toString()) as Int).toUInt() else 0u

public actual fun WlanSetPsdIEDataList(hclienthandle: HANDLE, strformat: PCWSTR, ppsdiedatalist: Long, preserved: Long): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAddon != null) (_windowsWin32NetworkmanagementWifiNapiAddon.windowssys_windows_win32_networkmanagement_wifi_WlanSetPsdIEDataList(hclienthandle.toString(), strformat.toString(), ppsdiedatalist.toString(), preserved.toString()) as Int).toUInt() else 0u

public actual fun WlanSetSecuritySettings(hclienthandle: HANDLE, securableobject: WLAN_SECURABLE_OBJECT, strmodifiedsddl: PCWSTR): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAddon != null) (_windowsWin32NetworkmanagementWifiNapiAddon.windowssys_windows_win32_networkmanagement_wifi_WlanSetSecuritySettings(hclienthandle.toString(), securableobject, strmodifiedsddl.toString()) as Int).toUInt() else 0u

public actual fun WlanUIEditProfile(dwclientversion: UInt, wstrprofilename: PCWSTR, pinterfaceguid: Long, hwnd: HWND, wlstartpage: WL_DISPLAY_PAGES, preserved: Long, pwlanreasoncode: Long): UInt =
    if (_windowsWin32NetworkmanagementWifiNapiAddon != null) (_windowsWin32NetworkmanagementWifiNapiAddon.windowssys_windows_win32_networkmanagement_wifi_WlanUIEditProfile(dwclientversion.toInt(), wstrprofilename.toString(), pinterfaceguid.toString(), hwnd.toString(), wlstartpage, preserved.toString(), pwlanreasoncode.toString()) as Int).toUInt() else 0u
