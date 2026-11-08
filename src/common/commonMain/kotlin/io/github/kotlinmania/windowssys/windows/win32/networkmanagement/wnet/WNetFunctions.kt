package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.WIN32_ERROR

public fun MultinetGetConnectionPerformanceA(lpnetresource: Long, lpnetconnectinfostruct: Long): UInt {
    return Win32DynamicFfi.invoke("mpr.dll", "MultinetGetConnectionPerformanceA", longArrayOf(lpnetresource, lpnetconnectinfostruct)).toUInt()
}

public fun MultinetGetConnectionPerformanceW(lpnetresource: Long, lpnetconnectinfostruct: Long): UInt {
    return Win32DynamicFfi.invoke("mpr.dll", "MultinetGetConnectionPerformanceW", longArrayOf(lpnetresource, lpnetconnectinfostruct)).toUInt()
}

public fun NPAddConnection(lpnetresource: Long, lppassword: PCWSTR, lpusername: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("davclnt.dll", "NPAddConnection", longArrayOf(lpnetresource, lppassword, lpusername)).toUInt()
}

public fun NPAddConnection3(hwndowner: HWND, lpnetresource: Long, lppassword: PCWSTR, lpusername: PCWSTR, dwflags: NET_CONNECT_FLAGS): UInt {
    return Win32DynamicFfi.invoke("davclnt.dll", "NPAddConnection3", longArrayOf(hwndowner, lpnetresource, lppassword, lpusername, dwflags.toLong())).toUInt()
}

public fun NPAddConnection4(hwndowner: HWND, lpnetresource: Long, lpauthbuffer: Long, cbauthbuffer: UInt, dwflags: UInt, lpuseoptions: Long, cbuseoptions: UInt): UInt {
    return Win32DynamicFfi.invoke("ntlanman.dll", "NPAddConnection4", longArrayOf(hwndowner, lpnetresource, lpauthbuffer, cbauthbuffer.toLong(), dwflags.toLong(), lpuseoptions, cbuseoptions.toLong())).toUInt()
}

public fun NPCancelConnection(lpname: PCWSTR, fforce: BOOL): UInt {
    return Win32DynamicFfi.invoke("davclnt.dll", "NPCancelConnection", longArrayOf(lpname, fforce.toLong())).toUInt()
}

public fun NPCancelConnection2(lpname: PCWSTR, fforce: BOOL, dwflags: UInt): UInt {
    return Win32DynamicFfi.invoke("ntlanman.dll", "NPCancelConnection2", longArrayOf(lpname, fforce.toLong(), dwflags.toLong())).toUInt()
}

public fun NPCloseEnum(henum: HANDLE): UInt {
    return Win32DynamicFfi.invoke("davclnt.dll", "NPCloseEnum", longArrayOf(henum)).toUInt()
}

public fun NPEnumResource(henum: HANDLE, lpccount: Long, lpbuffer: Long, lpbuffersize: Long): UInt {
    return Win32DynamicFfi.invoke("davclnt.dll", "NPEnumResource", longArrayOf(henum, lpccount, lpbuffer, lpbuffersize)).toUInt()
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

public fun WNetAddConnection2A(lpnetresource: Long, lppassword: PCSTR, lpusername: PCSTR, dwflags: NET_CONNECT_FLAGS): WIN32_ERROR {
    return Win32DynamicFfi.invoke("mpr.dll", "WNetAddConnection2A", longArrayOf(lpnetresource, lppassword, lpusername, dwflags.toLong())).toUInt()
}

public fun WNetAddConnection2W(lpnetresource: Long, lppassword: PCWSTR, lpusername: PCWSTR, dwflags: NET_CONNECT_FLAGS): WIN32_ERROR {
    return Win32DynamicFfi.invoke("mpr.dll", "WNetAddConnection2W", longArrayOf(lpnetresource, lppassword, lpusername, dwflags.toLong())).toUInt()
}

public fun WNetAddConnection3A(hwndowner: HWND, lpnetresource: Long, lppassword: PCSTR, lpusername: PCSTR, dwflags: NET_CONNECT_FLAGS): WIN32_ERROR {
    return Win32DynamicFfi.invoke("mpr.dll", "WNetAddConnection3A", longArrayOf(hwndowner, lpnetresource, lppassword, lpusername, dwflags.toLong())).toUInt()
}

public fun WNetAddConnection3W(hwndowner: HWND, lpnetresource: Long, lppassword: PCWSTR, lpusername: PCWSTR, dwflags: NET_CONNECT_FLAGS): WIN32_ERROR {
    return Win32DynamicFfi.invoke("mpr.dll", "WNetAddConnection3W", longArrayOf(hwndowner, lpnetresource, lppassword, lpusername, dwflags.toLong())).toUInt()
}

public fun WNetAddConnection4A(hwndowner: HWND, lpnetresource: Long, pauthbuffer: Long, cbauthbuffer: UInt, dwflags: NET_CONNECT_FLAGS, lpuseoptions: Long, cbuseoptions: UInt): WIN32_ERROR {
    return Win32DynamicFfi.invoke("mpr.dll", "WNetAddConnection4A", longArrayOf(hwndowner, lpnetresource, pauthbuffer, cbauthbuffer.toLong(), dwflags.toLong(), lpuseoptions, cbuseoptions.toLong())).toUInt()
}

public fun WNetAddConnection4W(hwndowner: HWND, lpnetresource: Long, pauthbuffer: Long, cbauthbuffer: UInt, dwflags: NET_CONNECT_FLAGS, lpuseoptions: Long, cbuseoptions: UInt): WIN32_ERROR {
    return Win32DynamicFfi.invoke("mpr.dll", "WNetAddConnection4W", longArrayOf(hwndowner, lpnetresource, pauthbuffer, cbauthbuffer.toLong(), dwflags.toLong(), lpuseoptions, cbuseoptions.toLong())).toUInt()
}

public fun WNetAddConnectionA(lpremotename: PCSTR, lppassword: PCSTR, lplocalname: PCSTR): WIN32_ERROR {
    return Win32DynamicFfi.invoke("mpr.dll", "WNetAddConnectionA", longArrayOf(lpremotename, lppassword, lplocalname)).toUInt()
}

public fun WNetAddConnectionW(lpremotename: PCWSTR, lppassword: PCWSTR, lplocalname: PCWSTR): WIN32_ERROR {
    return Win32DynamicFfi.invoke("mpr.dll", "WNetAddConnectionW", longArrayOf(lpremotename, lppassword, lplocalname)).toUInt()
}

public fun WNetCancelConnection2A(lpname: PCSTR, dwflags: NET_CONNECT_FLAGS, fforce: BOOL): WIN32_ERROR {
    return Win32DynamicFfi.invoke("mpr.dll", "WNetCancelConnection2A", longArrayOf(lpname, dwflags.toLong(), fforce.toLong())).toUInt()
}

public fun WNetCancelConnection2W(lpname: PCWSTR, dwflags: NET_CONNECT_FLAGS, fforce: BOOL): WIN32_ERROR {
    return Win32DynamicFfi.invoke("mpr.dll", "WNetCancelConnection2W", longArrayOf(lpname, dwflags.toLong(), fforce.toLong())).toUInt()
}

public fun WNetCancelConnectionA(lpname: PCSTR, fforce: BOOL): WIN32_ERROR {
    return Win32DynamicFfi.invoke("mpr.dll", "WNetCancelConnectionA", longArrayOf(lpname, fforce.toLong())).toUInt()
}

public fun WNetCancelConnectionW(lpname: PCWSTR, fforce: BOOL): WIN32_ERROR {
    return Win32DynamicFfi.invoke("mpr.dll", "WNetCancelConnectionW", longArrayOf(lpname, fforce.toLong())).toUInt()
}

public fun WNetCloseEnum(henum: HANDLE): WIN32_ERROR {
    return Win32DynamicFfi.invoke("mpr.dll", "WNetCloseEnum", longArrayOf(henum)).toUInt()
}

public fun WNetConnectionDialog(hwnd: HWND, dwtype: UInt): WIN32_ERROR {
    return Win32DynamicFfi.invoke("mpr.dll", "WNetConnectionDialog", longArrayOf(hwnd, dwtype.toLong())).toUInt()
}

public fun WNetConnectionDialog1A(lpconndlgstruct: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("mpr.dll", "WNetConnectionDialog1A", longArrayOf(lpconndlgstruct)).toUInt()
}

public fun WNetConnectionDialog1W(lpconndlgstruct: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("mpr.dll", "WNetConnectionDialog1W", longArrayOf(lpconndlgstruct)).toUInt()
}

public fun WNetDisconnectDialog(hwnd: HWND, dwtype: UInt): WIN32_ERROR {
    return Win32DynamicFfi.invoke("mpr.dll", "WNetDisconnectDialog", longArrayOf(hwnd, dwtype.toLong())).toUInt()
}

public fun WNetDisconnectDialog1A(lpconndlgstruct: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("mpr.dll", "WNetDisconnectDialog1A", longArrayOf(lpconndlgstruct)).toUInt()
}

public fun WNetDisconnectDialog1W(lpconndlgstruct: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("mpr.dll", "WNetDisconnectDialog1W", longArrayOf(lpconndlgstruct)).toUInt()
}

public fun WNetEnumResourceA(henum: HANDLE, lpccount: Long, lpbuffer: Long, lpbuffersize: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("mpr.dll", "WNetEnumResourceA", longArrayOf(henum, lpccount, lpbuffer, lpbuffersize)).toUInt()
}

public fun WNetEnumResourceW(henum: HANDLE, lpccount: Long, lpbuffer: Long, lpbuffersize: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("mpr.dll", "WNetEnumResourceW", longArrayOf(henum, lpccount, lpbuffer, lpbuffersize)).toUInt()
}

public fun WNetGetConnectionA(lplocalname: PCSTR, lpremotename: PSTR, lpnlength: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("mpr.dll", "WNetGetConnectionA", longArrayOf(lplocalname, lpremotename, lpnlength)).toUInt()
}

public fun WNetGetConnectionW(lplocalname: PCWSTR, lpremotename: PWSTR, lpnlength: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("mpr.dll", "WNetGetConnectionW", longArrayOf(lplocalname, lpremotename, lpnlength)).toUInt()
}

public fun WNetGetLastErrorA(lperror: Long, lperrorbuf: PSTR, nerrorbufsize: UInt, lpnamebuf: PSTR, nnamebufsize: UInt): WIN32_ERROR {
    return Win32DynamicFfi.invoke("mpr.dll", "WNetGetLastErrorA", longArrayOf(lperror, lperrorbuf, nerrorbufsize.toLong(), lpnamebuf, nnamebufsize.toLong())).toUInt()
}

public fun WNetGetLastErrorW(lperror: Long, lperrorbuf: PWSTR, nerrorbufsize: UInt, lpnamebuf: PWSTR, nnamebufsize: UInt): WIN32_ERROR {
    return Win32DynamicFfi.invoke("mpr.dll", "WNetGetLastErrorW", longArrayOf(lperror, lperrorbuf, nerrorbufsize.toLong(), lpnamebuf, nnamebufsize.toLong())).toUInt()
}

public fun WNetGetNetworkInformationA(lpprovider: PCSTR, lpnetinfostruct: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("mpr.dll", "WNetGetNetworkInformationA", longArrayOf(lpprovider, lpnetinfostruct)).toUInt()
}

public fun WNetGetNetworkInformationW(lpprovider: PCWSTR, lpnetinfostruct: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("mpr.dll", "WNetGetNetworkInformationW", longArrayOf(lpprovider, lpnetinfostruct)).toUInt()
}

public fun WNetGetProviderNameA(dwnettype: UInt, lpprovidername: PSTR, lpbuffersize: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("mpr.dll", "WNetGetProviderNameA", longArrayOf(dwnettype.toLong(), lpprovidername, lpbuffersize)).toUInt()
}

public fun WNetGetProviderNameW(dwnettype: UInt, lpprovidername: PWSTR, lpbuffersize: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("mpr.dll", "WNetGetProviderNameW", longArrayOf(dwnettype.toLong(), lpprovidername, lpbuffersize)).toUInt()
}

public fun WNetGetResourceInformationA(lpnetresource: Long, lpbuffer: Long, lpcbbuffer: Long, lplpsystem: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("mpr.dll", "WNetGetResourceInformationA", longArrayOf(lpnetresource, lpbuffer, lpcbbuffer, lplpsystem)).toUInt()
}

public fun WNetGetResourceInformationW(lpnetresource: Long, lpbuffer: Long, lpcbbuffer: Long, lplpsystem: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("mpr.dll", "WNetGetResourceInformationW", longArrayOf(lpnetresource, lpbuffer, lpcbbuffer, lplpsystem)).toUInt()
}

public fun WNetGetResourceParentA(lpnetresource: Long, lpbuffer: Long, lpcbbuffer: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("mpr.dll", "WNetGetResourceParentA", longArrayOf(lpnetresource, lpbuffer, lpcbbuffer)).toUInt()
}

public fun WNetGetResourceParentW(lpnetresource: Long, lpbuffer: Long, lpcbbuffer: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("mpr.dll", "WNetGetResourceParentW", longArrayOf(lpnetresource, lpbuffer, lpcbbuffer)).toUInt()
}

public fun WNetGetUniversalNameA(lplocalpath: PCSTR, dwinfolevel: UNC_INFO_LEVEL, lpbuffer: Long, lpbuffersize: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("mpr.dll", "WNetGetUniversalNameA", longArrayOf(lplocalpath, dwinfolevel.toLong(), lpbuffer, lpbuffersize)).toUInt()
}

public fun WNetGetUniversalNameW(lplocalpath: PCWSTR, dwinfolevel: UNC_INFO_LEVEL, lpbuffer: Long, lpbuffersize: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("mpr.dll", "WNetGetUniversalNameW", longArrayOf(lplocalpath, dwinfolevel.toLong(), lpbuffer, lpbuffersize)).toUInt()
}

public fun WNetGetUserA(lpname: PCSTR, lpusername: PSTR, lpnlength: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("mpr.dll", "WNetGetUserA", longArrayOf(lpname, lpusername, lpnlength)).toUInt()
}

public fun WNetGetUserW(lpname: PCWSTR, lpusername: PWSTR, lpnlength: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("mpr.dll", "WNetGetUserW", longArrayOf(lpname, lpusername, lpnlength)).toUInt()
}

public fun WNetOpenEnumA(dwscope: NET_RESOURCE_SCOPE, dwtype: NET_RESOURCE_TYPE, dwusage: WNET_OPEN_ENUM_USAGE, lpnetresource: Long, lphenum: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("mpr.dll", "WNetOpenEnumA", longArrayOf(dwscope.toLong(), dwtype.toLong(), dwusage.toLong(), lpnetresource, lphenum)).toUInt()
}

public fun WNetOpenEnumW(dwscope: NET_RESOURCE_SCOPE, dwtype: NET_RESOURCE_TYPE, dwusage: WNET_OPEN_ENUM_USAGE, lpnetresource: Long, lphenum: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("mpr.dll", "WNetOpenEnumW", longArrayOf(dwscope.toLong(), dwtype.toLong(), dwusage.toLong(), lpnetresource, lphenum)).toUInt()
}

public fun WNetSetLastErrorA(err: UInt, lperror: PCSTR, lpproviders: PCSTR) {
    Win32DynamicFfi.invoke("mpr.dll", "WNetSetLastErrorA", longArrayOf(err.toLong(), lperror, lpproviders))
}

public fun WNetSetLastErrorW(err: UInt, lperror: PCWSTR, lpproviders: PCWSTR) {
    Win32DynamicFfi.invoke("mpr.dll", "WNetSetLastErrorW", longArrayOf(err.toLong(), lperror, lpproviders))
}

public fun WNetUseConnection4A(hwndowner: HWND, lpnetresource: Long, pauthbuffer: Long, cbauthbuffer: UInt, dwflags: UInt, lpuseoptions: Long, cbuseoptions: UInt, lpaccessname: PSTR, lpbuffersize: Long, lpresult: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("mpr.dll", "WNetUseConnection4A", longArrayOf(hwndowner, lpnetresource, pauthbuffer, cbauthbuffer.toLong(), dwflags.toLong(), lpuseoptions, cbuseoptions.toLong(), lpaccessname, lpbuffersize, lpresult)).toUInt()
}

public fun WNetUseConnection4W(hwndowner: HWND, lpnetresource: Long, pauthbuffer: Long, cbauthbuffer: UInt, dwflags: UInt, lpuseoptions: Long, cbuseoptions: UInt, lpaccessname: PWSTR, lpbuffersize: Long, lpresult: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("mpr.dll", "WNetUseConnection4W", longArrayOf(hwndowner, lpnetresource, pauthbuffer, cbauthbuffer.toLong(), dwflags.toLong(), lpuseoptions, cbuseoptions.toLong(), lpaccessname, lpbuffersize, lpresult)).toUInt()
}

public fun WNetUseConnectionA(hwndowner: HWND, lpnetresource: Long, lppassword: PCSTR, lpuserid: PCSTR, dwflags: NET_CONNECT_FLAGS, lpaccessname: PSTR, lpbuffersize: Long, lpresult: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("mpr.dll", "WNetUseConnectionA", longArrayOf(hwndowner, lpnetresource, lppassword, lpuserid, dwflags.toLong(), lpaccessname, lpbuffersize, lpresult)).toUInt()
}

public fun WNetUseConnectionW(hwndowner: HWND, lpnetresource: Long, lppassword: PCWSTR, lpuserid: PCWSTR, dwflags: NET_CONNECT_FLAGS, lpaccessname: PWSTR, lpbuffersize: Long, lpresult: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("mpr.dll", "WNetUseConnectionW", longArrayOf(hwndowner, lpnetresource, lppassword, lpuserid, dwflags.toLong(), lpaccessname, lpbuffersize, lpresult)).toUInt()
}
