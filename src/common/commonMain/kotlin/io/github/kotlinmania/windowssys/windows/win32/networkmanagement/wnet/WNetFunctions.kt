package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public fun MultinetGetConnectionPerformanceA(lpnetresource: Long, lpnetconnectinfostruct: Long): UInt {
    return Win32DynamicFfi.invoke("mpr.dll", "MultinetGetConnectionPerformanceA", longArrayOf(lpnetresource, lpnetconnectinfostruct)).toUInt()
}

public fun MultinetGetConnectionPerformanceW(lpnetresource: Long, lpnetconnectinfostruct: Long): UInt {
    return Win32DynamicFfi.invoke("mpr.dll", "MultinetGetConnectionPerformanceW", longArrayOf(lpnetresource, lpnetconnectinfostruct)).toUInt()
}

public fun NPAddConnection(lpnetresource: Long, lppassword: PCWSTR, lpusername: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("davclnt.dll", "NPAddConnection", longArrayOf(lpnetresource, lppassword, lpusername)).toUInt()
}

public fun NPAddConnection3(hwndowner: Foundation.HWND, lpnetresource: Long, lppassword: PCWSTR, lpusername: PCWSTR, dwflags: NET_CONNECT_FLAGS): UInt {
    return Win32DynamicFfi.invoke("davclnt.dll", "NPAddConnection3", longArrayOf(Win32DynamicFfi.objectSlot(hwndowner), lpnetresource, lppassword, lpusername, dwflags.toLong())).toUInt()
}

public fun NPAddConnection4(hwndowner: Foundation.HWND, lpnetresource: Long, lpauthbuffer: Long, cbauthbuffer: UInt, dwflags: UInt, lpuseoptions: Long, cbuseoptions: UInt): UInt {
    return Win32DynamicFfi.invoke("ntlanman.dll", "NPAddConnection4", longArrayOf(Win32DynamicFfi.objectSlot(hwndowner), lpnetresource, lpauthbuffer, cbauthbuffer.toLong(), dwflags.toLong(), lpuseoptions, cbuseoptions.toLong())).toUInt()
}

public fun NPCancelConnection(lpname: PCWSTR, fforce: BOOL): UInt {
    return Win32DynamicFfi.invoke("davclnt.dll", "NPCancelConnection", longArrayOf(lpname, fforce.toLong())).toUInt()
}

public fun NPCancelConnection2(lpname: PCWSTR, fforce: BOOL, dwflags: UInt): UInt {
    return Win32DynamicFfi.invoke("ntlanman.dll", "NPCancelConnection2", longArrayOf(lpname, fforce.toLong(), dwflags.toLong())).toUInt()
}

public fun NPCloseEnum(henum: Foundation.HANDLE): UInt {
    return Win32DynamicFfi.invoke("davclnt.dll", "NPCloseEnum", longArrayOf(Win32DynamicFfi.objectSlot(henum))).toUInt()
}

public fun NPEnumResource(henum: Foundation.HANDLE, lpccount: Long, lpbuffer: Long, lpbuffersize: Long): UInt {
    return Win32DynamicFfi.invoke("davclnt.dll", "NPEnumResource", longArrayOf(Win32DynamicFfi.objectSlot(henum), lpccount, lpbuffer, lpbuffersize)).toUInt()
}

public fun NPFormatNetworkName(lpremotename: PCWSTR, lpformattedname: PWSTR, lpnlength: Long, dwflags: NETWORK_NAME_FORMAT_FLAGS, dwavecharperline: UInt): UInt {
    return Win32DynamicFfi.invoke("davclnt.dll", "NPFormatNetworkName", longArrayOf(lpremotename, lpformattedname, lpnlength, dwflags.toLong(), dwavecharperline.toLong())).toUInt()
}

public fun NPGetCaps(ndex: UInt): UInt {
    return Win32DynamicFfi.invoke("davclnt.dll", "NPGetCaps", longArrayOf(ndex.toLong())).toUInt()
}

public fun NPGetConnection(lplocalname: PCWSTR, lpremotename: PWSTR, lpnbufferlen: Long): UInt {
    return Win32DynamicFfi.invoke("davclnt.dll", "NPGetConnection", longArrayOf(lplocalname, lpremotename, lpnbufferlen)).toUInt()
}

public fun NPGetConnection3(lplocalname: PCWSTR, dwlevel: UInt, lpbuffer: Long, lpbuffersize: Long): UInt {
    return Win32DynamicFfi.invoke("ntlanman.dll", "NPGetConnection3", longArrayOf(lplocalname, dwlevel.toLong(), lpbuffer, lpbuffersize)).toUInt()
}

public fun NPGetConnectionPerformance(lpremotename: PCWSTR, lpnetconnectinfo: Long): UInt {
    return Win32DynamicFfi.invoke("ntlanman.dll", "NPGetConnectionPerformance", longArrayOf(lpremotename, lpnetconnectinfo)).toUInt()
}

public fun NPGetPersistentUseOptionsForConnection(lpremotepath: PCWSTR, lpreaduseoptions: Long, cbreaduseoptions: UInt, lpwriteuseoptions: Long, lpsizewriteuseoptions: Long): UInt {
    return Win32DynamicFfi.invoke("ntlanman.dll", "NPGetPersistentUseOptionsForConnection", longArrayOf(lpremotepath, lpreaduseoptions, cbreaduseoptions.toLong(), lpwriteuseoptions, lpsizewriteuseoptions)).toUInt()
}

public fun NPGetResourceInformation(lpnetresource: Long, lpbuffer: Long, lpbuffersize: Long, lplpsystem: Long): UInt {
    return Win32DynamicFfi.invoke("davclnt.dll", "NPGetResourceInformation", longArrayOf(lpnetresource, lpbuffer, lpbuffersize, lplpsystem)).toUInt()
}

public fun NPGetResourceParent(lpnetresource: Long, lpbuffer: Long, lpbuffersize: Long): UInt {
    return Win32DynamicFfi.invoke("davclnt.dll", "NPGetResourceParent", longArrayOf(lpnetresource, lpbuffer, lpbuffersize)).toUInt()
}

public fun NPGetUniversalName(lplocalpath: PCWSTR, dwinfolevel: UNC_INFO_LEVEL, lpbuffer: Long, lpbuffersize: Long): UInt {
    return Win32DynamicFfi.invoke("davclnt.dll", "NPGetUniversalName", longArrayOf(lplocalpath, dwinfolevel.toLong(), lpbuffer, lpbuffersize)).toUInt()
}

public fun NPGetUser(lpname: PCWSTR, lpusername: PWSTR, lpnbufferlen: Long): UInt {
    return Win32DynamicFfi.invoke("davclnt.dll", "NPGetUser", longArrayOf(lpname, lpusername, lpnbufferlen)).toUInt()
}

public fun NPOpenEnum(dwscope: UInt, dwtype: UInt, dwusage: UInt, lpnetresource: Long, lphenum: Long): UInt {
    return Win32DynamicFfi.invoke("davclnt.dll", "NPOpenEnum", longArrayOf(dwscope.toLong(), dwtype.toLong(), dwusage.toLong(), lpnetresource, lphenum)).toUInt()
}

public fun WNetAddConnection2A(lpnetresource: Long, lppassword: PCSTR, lpusername: PCSTR, dwflags: NET_CONNECT_FLAGS): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("mpr.dll", "WNetAddConnection2A", longArrayOf(lpnetresource, lppassword, lpusername, dwflags.toLong()))
    return Foundation.WIN32_ERROR()
}

public fun WNetAddConnection2W(lpnetresource: Long, lppassword: PCWSTR, lpusername: PCWSTR, dwflags: NET_CONNECT_FLAGS): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("mpr.dll", "WNetAddConnection2W", longArrayOf(lpnetresource, lppassword, lpusername, dwflags.toLong()))
    return Foundation.WIN32_ERROR()
}

public fun WNetAddConnection3A(hwndowner: Foundation.HWND, lpnetresource: Long, lppassword: PCSTR, lpusername: PCSTR, dwflags: NET_CONNECT_FLAGS): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("mpr.dll", "WNetAddConnection3A", longArrayOf(Win32DynamicFfi.objectSlot(hwndowner), lpnetresource, lppassword, lpusername, dwflags.toLong()))
    return Foundation.WIN32_ERROR()
}

public fun WNetAddConnection3W(hwndowner: Foundation.HWND, lpnetresource: Long, lppassword: PCWSTR, lpusername: PCWSTR, dwflags: NET_CONNECT_FLAGS): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("mpr.dll", "WNetAddConnection3W", longArrayOf(Win32DynamicFfi.objectSlot(hwndowner), lpnetresource, lppassword, lpusername, dwflags.toLong()))
    return Foundation.WIN32_ERROR()
}

public fun WNetAddConnection4A(hwndowner: Foundation.HWND, lpnetresource: Long, pauthbuffer: Long, cbauthbuffer: UInt, dwflags: NET_CONNECT_FLAGS, lpuseoptions: Long, cbuseoptions: UInt): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("mpr.dll", "WNetAddConnection4A", longArrayOf(Win32DynamicFfi.objectSlot(hwndowner), lpnetresource, pauthbuffer, cbauthbuffer.toLong(), dwflags.toLong(), lpuseoptions, cbuseoptions.toLong()))
    return Foundation.WIN32_ERROR()
}

public fun WNetAddConnection4W(hwndowner: Foundation.HWND, lpnetresource: Long, pauthbuffer: Long, cbauthbuffer: UInt, dwflags: NET_CONNECT_FLAGS, lpuseoptions: Long, cbuseoptions: UInt): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("mpr.dll", "WNetAddConnection4W", longArrayOf(Win32DynamicFfi.objectSlot(hwndowner), lpnetresource, pauthbuffer, cbauthbuffer.toLong(), dwflags.toLong(), lpuseoptions, cbuseoptions.toLong()))
    return Foundation.WIN32_ERROR()
}

public fun WNetAddConnectionA(lpremotename: PCSTR, lppassword: PCSTR, lplocalname: PCSTR): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("mpr.dll", "WNetAddConnectionA", longArrayOf(lpremotename, lppassword, lplocalname))
    return Foundation.WIN32_ERROR()
}

public fun WNetAddConnectionW(lpremotename: PCWSTR, lppassword: PCWSTR, lplocalname: PCWSTR): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("mpr.dll", "WNetAddConnectionW", longArrayOf(lpremotename, lppassword, lplocalname))
    return Foundation.WIN32_ERROR()
}

public fun WNetCancelConnection2A(lpname: PCSTR, dwflags: NET_CONNECT_FLAGS, fforce: BOOL): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("mpr.dll", "WNetCancelConnection2A", longArrayOf(lpname, dwflags.toLong(), fforce.toLong()))
    return Foundation.WIN32_ERROR()
}

public fun WNetCancelConnection2W(lpname: PCWSTR, dwflags: NET_CONNECT_FLAGS, fforce: BOOL): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("mpr.dll", "WNetCancelConnection2W", longArrayOf(lpname, dwflags.toLong(), fforce.toLong()))
    return Foundation.WIN32_ERROR()
}

public fun WNetCancelConnectionA(lpname: PCSTR, fforce: BOOL): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("mpr.dll", "WNetCancelConnectionA", longArrayOf(lpname, fforce.toLong()))
    return Foundation.WIN32_ERROR()
}

public fun WNetCancelConnectionW(lpname: PCWSTR, fforce: BOOL): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("mpr.dll", "WNetCancelConnectionW", longArrayOf(lpname, fforce.toLong()))
    return Foundation.WIN32_ERROR()
}

public fun WNetCloseEnum(henum: Foundation.HANDLE): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("mpr.dll", "WNetCloseEnum", longArrayOf(Win32DynamicFfi.objectSlot(henum)))
    return Foundation.WIN32_ERROR()
}

public fun WNetConnectionDialog(hwnd: Foundation.HWND, dwtype: UInt): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("mpr.dll", "WNetConnectionDialog", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), dwtype.toLong()))
    return Foundation.WIN32_ERROR()
}

public fun WNetConnectionDialog1A(lpconndlgstruct: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("mpr.dll", "WNetConnectionDialog1A", longArrayOf(lpconndlgstruct))
    return Foundation.WIN32_ERROR()
}

public fun WNetConnectionDialog1W(lpconndlgstruct: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("mpr.dll", "WNetConnectionDialog1W", longArrayOf(lpconndlgstruct))
    return Foundation.WIN32_ERROR()
}

public fun WNetDisconnectDialog(hwnd: Foundation.HWND, dwtype: UInt): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("mpr.dll", "WNetDisconnectDialog", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), dwtype.toLong()))
    return Foundation.WIN32_ERROR()
}

public fun WNetDisconnectDialog1A(lpconndlgstruct: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("mpr.dll", "WNetDisconnectDialog1A", longArrayOf(lpconndlgstruct))
    return Foundation.WIN32_ERROR()
}

public fun WNetDisconnectDialog1W(lpconndlgstruct: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("mpr.dll", "WNetDisconnectDialog1W", longArrayOf(lpconndlgstruct))
    return Foundation.WIN32_ERROR()
}

public fun WNetEnumResourceA(henum: Foundation.HANDLE, lpccount: Long, lpbuffer: Long, lpbuffersize: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("mpr.dll", "WNetEnumResourceA", longArrayOf(Win32DynamicFfi.objectSlot(henum), lpccount, lpbuffer, lpbuffersize))
    return Foundation.WIN32_ERROR()
}

public fun WNetEnumResourceW(henum: Foundation.HANDLE, lpccount: Long, lpbuffer: Long, lpbuffersize: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("mpr.dll", "WNetEnumResourceW", longArrayOf(Win32DynamicFfi.objectSlot(henum), lpccount, lpbuffer, lpbuffersize))
    return Foundation.WIN32_ERROR()
}

public fun WNetGetConnectionA(lplocalname: PCSTR, lpremotename: PSTR, lpnlength: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("mpr.dll", "WNetGetConnectionA", longArrayOf(lplocalname, lpremotename, lpnlength))
    return Foundation.WIN32_ERROR()
}

public fun WNetGetConnectionW(lplocalname: PCWSTR, lpremotename: PWSTR, lpnlength: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("mpr.dll", "WNetGetConnectionW", longArrayOf(lplocalname, lpremotename, lpnlength))
    return Foundation.WIN32_ERROR()
}

public fun WNetGetLastErrorA(lperror: Long, lperrorbuf: PSTR, nerrorbufsize: UInt, lpnamebuf: PSTR, nnamebufsize: UInt): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("mpr.dll", "WNetGetLastErrorA", longArrayOf(lperror, lperrorbuf, nerrorbufsize.toLong(), lpnamebuf, nnamebufsize.toLong()))
    return Foundation.WIN32_ERROR()
}

public fun WNetGetLastErrorW(lperror: Long, lperrorbuf: PWSTR, nerrorbufsize: UInt, lpnamebuf: PWSTR, nnamebufsize: UInt): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("mpr.dll", "WNetGetLastErrorW", longArrayOf(lperror, lperrorbuf, nerrorbufsize.toLong(), lpnamebuf, nnamebufsize.toLong()))
    return Foundation.WIN32_ERROR()
}

public fun WNetGetNetworkInformationA(lpprovider: PCSTR, lpnetinfostruct: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("mpr.dll", "WNetGetNetworkInformationA", longArrayOf(lpprovider, lpnetinfostruct))
    return Foundation.WIN32_ERROR()
}

public fun WNetGetNetworkInformationW(lpprovider: PCWSTR, lpnetinfostruct: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("mpr.dll", "WNetGetNetworkInformationW", longArrayOf(lpprovider, lpnetinfostruct))
    return Foundation.WIN32_ERROR()
}

public fun WNetGetProviderNameA(dwnettype: UInt, lpprovidername: PSTR, lpbuffersize: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("mpr.dll", "WNetGetProviderNameA", longArrayOf(dwnettype.toLong(), lpprovidername, lpbuffersize))
    return Foundation.WIN32_ERROR()
}

public fun WNetGetProviderNameW(dwnettype: UInt, lpprovidername: PWSTR, lpbuffersize: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("mpr.dll", "WNetGetProviderNameW", longArrayOf(dwnettype.toLong(), lpprovidername, lpbuffersize))
    return Foundation.WIN32_ERROR()
}

public fun WNetGetResourceInformationA(lpnetresource: Long, lpbuffer: Long, lpcbbuffer: Long, lplpsystem: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("mpr.dll", "WNetGetResourceInformationA", longArrayOf(lpnetresource, lpbuffer, lpcbbuffer, lplpsystem))
    return Foundation.WIN32_ERROR()
}

public fun WNetGetResourceInformationW(lpnetresource: Long, lpbuffer: Long, lpcbbuffer: Long, lplpsystem: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("mpr.dll", "WNetGetResourceInformationW", longArrayOf(lpnetresource, lpbuffer, lpcbbuffer, lplpsystem))
    return Foundation.WIN32_ERROR()
}

public fun WNetGetResourceParentA(lpnetresource: Long, lpbuffer: Long, lpcbbuffer: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("mpr.dll", "WNetGetResourceParentA", longArrayOf(lpnetresource, lpbuffer, lpcbbuffer))
    return Foundation.WIN32_ERROR()
}

public fun WNetGetResourceParentW(lpnetresource: Long, lpbuffer: Long, lpcbbuffer: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("mpr.dll", "WNetGetResourceParentW", longArrayOf(lpnetresource, lpbuffer, lpcbbuffer))
    return Foundation.WIN32_ERROR()
}

public fun WNetGetUniversalNameA(lplocalpath: PCSTR, dwinfolevel: UNC_INFO_LEVEL, lpbuffer: Long, lpbuffersize: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("mpr.dll", "WNetGetUniversalNameA", longArrayOf(lplocalpath, dwinfolevel.toLong(), lpbuffer, lpbuffersize))
    return Foundation.WIN32_ERROR()
}

public fun WNetGetUniversalNameW(lplocalpath: PCWSTR, dwinfolevel: UNC_INFO_LEVEL, lpbuffer: Long, lpbuffersize: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("mpr.dll", "WNetGetUniversalNameW", longArrayOf(lplocalpath, dwinfolevel.toLong(), lpbuffer, lpbuffersize))
    return Foundation.WIN32_ERROR()
}

public fun WNetGetUserA(lpname: PCSTR, lpusername: PSTR, lpnlength: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("mpr.dll", "WNetGetUserA", longArrayOf(lpname, lpusername, lpnlength))
    return Foundation.WIN32_ERROR()
}

public fun WNetGetUserW(lpname: PCWSTR, lpusername: PWSTR, lpnlength: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("mpr.dll", "WNetGetUserW", longArrayOf(lpname, lpusername, lpnlength))
    return Foundation.WIN32_ERROR()
}

public fun WNetOpenEnumA(dwscope: NET_RESOURCE_SCOPE, dwtype: NET_RESOURCE_TYPE, dwusage: WNET_OPEN_ENUM_USAGE, lpnetresource: Long, lphenum: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("mpr.dll", "WNetOpenEnumA", longArrayOf(dwscope.toLong(), dwtype.toLong(), dwusage.toLong(), lpnetresource, lphenum))
    return Foundation.WIN32_ERROR()
}

public fun WNetOpenEnumW(dwscope: NET_RESOURCE_SCOPE, dwtype: NET_RESOURCE_TYPE, dwusage: WNET_OPEN_ENUM_USAGE, lpnetresource: Long, lphenum: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("mpr.dll", "WNetOpenEnumW", longArrayOf(dwscope.toLong(), dwtype.toLong(), dwusage.toLong(), lpnetresource, lphenum))
    return Foundation.WIN32_ERROR()
}

public fun WNetSetLastErrorA(err: UInt, lperror: PCSTR, lpproviders: PCSTR) {
    Win32DynamicFfi.invoke("mpr.dll", "WNetSetLastErrorA", longArrayOf(err.toLong(), lperror, lpproviders))
}

public fun WNetSetLastErrorW(err: UInt, lperror: PCWSTR, lpproviders: PCWSTR) {
    Win32DynamicFfi.invoke("mpr.dll", "WNetSetLastErrorW", longArrayOf(err.toLong(), lperror, lpproviders))
}

public fun WNetUseConnection4A(hwndowner: Foundation.HWND, lpnetresource: Long, pauthbuffer: Long, cbauthbuffer: UInt, dwflags: UInt, lpuseoptions: Long, cbuseoptions: UInt, lpaccessname: PSTR, lpbuffersize: Long, lpresult: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("mpr.dll", "WNetUseConnection4A", longArrayOf(Win32DynamicFfi.objectSlot(hwndowner), lpnetresource, pauthbuffer, cbauthbuffer.toLong(), dwflags.toLong(), lpuseoptions, cbuseoptions.toLong(), lpaccessname, lpbuffersize, lpresult))
    return Foundation.WIN32_ERROR()
}

public fun WNetUseConnection4W(hwndowner: Foundation.HWND, lpnetresource: Long, pauthbuffer: Long, cbauthbuffer: UInt, dwflags: UInt, lpuseoptions: Long, cbuseoptions: UInt, lpaccessname: PWSTR, lpbuffersize: Long, lpresult: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("mpr.dll", "WNetUseConnection4W", longArrayOf(Win32DynamicFfi.objectSlot(hwndowner), lpnetresource, pauthbuffer, cbauthbuffer.toLong(), dwflags.toLong(), lpuseoptions, cbuseoptions.toLong(), lpaccessname, lpbuffersize, lpresult))
    return Foundation.WIN32_ERROR()
}

public fun WNetUseConnectionA(hwndowner: Foundation.HWND, lpnetresource: Long, lppassword: PCSTR, lpuserid: PCSTR, dwflags: NET_CONNECT_FLAGS, lpaccessname: PSTR, lpbuffersize: Long, lpresult: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("mpr.dll", "WNetUseConnectionA", longArrayOf(Win32DynamicFfi.objectSlot(hwndowner), lpnetresource, lppassword, lpuserid, dwflags.toLong(), lpaccessname, lpbuffersize, lpresult))
    return Foundation.WIN32_ERROR()
}

public fun WNetUseConnectionW(hwndowner: Foundation.HWND, lpnetresource: Long, lppassword: PCWSTR, lpuserid: PCWSTR, dwflags: NET_CONNECT_FLAGS, lpaccessname: PWSTR, lpbuffersize: Long, lpresult: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("mpr.dll", "WNetUseConnectionW", longArrayOf(Win32DynamicFfi.objectSlot(hwndowner), lpnetresource, lppassword, lpuserid, dwflags.toLong(), lpaccessname, lpbuffersize, lpresult))
    return Foundation.WIN32_ERROR()
}
