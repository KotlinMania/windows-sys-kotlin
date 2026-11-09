@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.WIN32_ERROR

public actual fun MultinetGetConnectionPerformanceA(lpnetresource: Long, lpnetconnectinfostruct: Long): UInt =
    0u

public actual fun MultinetGetConnectionPerformanceW(lpnetresource: Long, lpnetconnectinfostruct: Long): UInt =
    0u

public actual fun NPAddConnection(lpnetresource: Long, lppassword: PCWSTR, lpusername: PCWSTR): UInt =
    0u

public actual fun NPAddConnection3(hwndowner: HWND, lpnetresource: Long, lppassword: PCWSTR, lpusername: PCWSTR, dwflags: NET_CONNECT_FLAGS): UInt =
    0u

public actual fun NPAddConnection4(hwndowner: HWND, lpnetresource: Long, lpauthbuffer: Long, cbauthbuffer: UInt, dwflags: UInt, lpuseoptions: Long, cbuseoptions: UInt): UInt =
    0u

public actual fun NPCancelConnection(lpname: PCWSTR, fforce: BOOL): UInt =
    0u

public actual fun NPCancelConnection2(lpname: PCWSTR, fforce: BOOL, dwflags: UInt): UInt =
    0u

public actual fun NPCloseEnum(henum: HANDLE): UInt =
    0u

public actual fun NPEnumResource(henum: HANDLE, lpccount: Long, lpbuffer: Long, lpbuffersize: Long): UInt =
    0u

public actual fun NPFormatNetworkName(lpremotename: PCWSTR, lpformattedname: PWSTR, lpnlength: Long, dwflags: NETWORK_NAME_FORMAT_FLAGS, dwavecharperline: UInt): UInt =
    0u

public actual fun NPGetCaps(ndex: UInt): UInt =
    0u

public actual fun NPGetConnection(lplocalname: PCWSTR, lpremotename: PWSTR, lpnbufferlen: Long): UInt =
    0u

public actual fun NPGetConnection3(lplocalname: PCWSTR, dwlevel: UInt, lpbuffer: Long, lpbuffersize: Long): UInt =
    0u

public actual fun NPGetConnectionPerformance(lpremotename: PCWSTR, lpnetconnectinfo: Long): UInt =
    0u

public actual fun NPGetPersistentUseOptionsForConnection(lpremotepath: PCWSTR, lpreaduseoptions: Long, cbreaduseoptions: UInt, lpwriteuseoptions: Long, lpsizewriteuseoptions: Long): UInt =
    0u

public actual fun NPGetResourceInformation(lpnetresource: Long, lpbuffer: Long, lpbuffersize: Long, lplpsystem: Long): UInt =
    0u

public actual fun NPGetResourceParent(lpnetresource: Long, lpbuffer: Long, lpbuffersize: Long): UInt =
    0u

public actual fun NPGetUniversalName(lplocalpath: PCWSTR, dwinfolevel: UNC_INFO_LEVEL, lpbuffer: Long, lpbuffersize: Long): UInt =
    0u

public actual fun NPGetUser(lpname: PCWSTR, lpusername: PWSTR, lpnbufferlen: Long): UInt =
    0u

public actual fun NPOpenEnum(dwscope: UInt, dwtype: UInt, dwusage: UInt, lpnetresource: Long, lphenum: Long): UInt =
    0u

public actual fun WNetAddConnection2A(lpnetresource: Long, lppassword: PCSTR, lpusername: PCSTR, dwflags: NET_CONNECT_FLAGS): WIN32_ERROR =
    0u

public actual fun WNetAddConnection2W(lpnetresource: Long, lppassword: PCWSTR, lpusername: PCWSTR, dwflags: NET_CONNECT_FLAGS): WIN32_ERROR =
    0u

public actual fun WNetAddConnection3A(hwndowner: HWND, lpnetresource: Long, lppassword: PCSTR, lpusername: PCSTR, dwflags: NET_CONNECT_FLAGS): WIN32_ERROR =
    0u

public actual fun WNetAddConnection3W(hwndowner: HWND, lpnetresource: Long, lppassword: PCWSTR, lpusername: PCWSTR, dwflags: NET_CONNECT_FLAGS): WIN32_ERROR =
    0u

public actual fun WNetAddConnection4A(hwndowner: HWND, lpnetresource: Long, pauthbuffer: Long, cbauthbuffer: UInt, dwflags: NET_CONNECT_FLAGS, lpuseoptions: Long, cbuseoptions: UInt): WIN32_ERROR =
    0u

public actual fun WNetAddConnection4W(hwndowner: HWND, lpnetresource: Long, pauthbuffer: Long, cbauthbuffer: UInt, dwflags: NET_CONNECT_FLAGS, lpuseoptions: Long, cbuseoptions: UInt): WIN32_ERROR =
    0u

public actual fun WNetAddConnectionA(lpremotename: PCSTR, lppassword: PCSTR, lplocalname: PCSTR): WIN32_ERROR =
    0u

public actual fun WNetAddConnectionW(lpremotename: PCWSTR, lppassword: PCWSTR, lplocalname: PCWSTR): WIN32_ERROR =
    0u

public actual fun WNetCancelConnection2A(lpname: PCSTR, dwflags: NET_CONNECT_FLAGS, fforce: BOOL): WIN32_ERROR =
    0u

public actual fun WNetCancelConnection2W(lpname: PCWSTR, dwflags: NET_CONNECT_FLAGS, fforce: BOOL): WIN32_ERROR =
    0u

public actual fun WNetCancelConnectionA(lpname: PCSTR, fforce: BOOL): WIN32_ERROR =
    0u

public actual fun WNetCancelConnectionW(lpname: PCWSTR, fforce: BOOL): WIN32_ERROR =
    0u

public actual fun WNetCloseEnum(henum: HANDLE): WIN32_ERROR =
    0u

public actual fun WNetConnectionDialog(hwnd: HWND, dwtype: UInt): WIN32_ERROR =
    0u

public actual fun WNetConnectionDialog1A(lpconndlgstruct: Long): WIN32_ERROR =
    0u

public actual fun WNetConnectionDialog1W(lpconndlgstruct: Long): WIN32_ERROR =
    0u

public actual fun WNetDisconnectDialog(hwnd: HWND, dwtype: UInt): WIN32_ERROR =
    0u

public actual fun WNetDisconnectDialog1A(lpconndlgstruct: Long): WIN32_ERROR =
    0u

public actual fun WNetDisconnectDialog1W(lpconndlgstruct: Long): WIN32_ERROR =
    0u

public actual fun WNetEnumResourceA(henum: HANDLE, lpccount: Long, lpbuffer: Long, lpbuffersize: Long): WIN32_ERROR =
    0u

public actual fun WNetEnumResourceW(henum: HANDLE, lpccount: Long, lpbuffer: Long, lpbuffersize: Long): WIN32_ERROR =
    0u

public actual fun WNetGetConnectionA(lplocalname: PCSTR, lpremotename: PSTR, lpnlength: Long): WIN32_ERROR =
    0u

public actual fun WNetGetConnectionW(lplocalname: PCWSTR, lpremotename: PWSTR, lpnlength: Long): WIN32_ERROR =
    0u

public actual fun WNetGetLastErrorA(lperror: Long, lperrorbuf: PSTR, nerrorbufsize: UInt, lpnamebuf: PSTR, nnamebufsize: UInt): WIN32_ERROR =
    0u

public actual fun WNetGetLastErrorW(lperror: Long, lperrorbuf: PWSTR, nerrorbufsize: UInt, lpnamebuf: PWSTR, nnamebufsize: UInt): WIN32_ERROR =
    0u

public actual fun WNetGetNetworkInformationA(lpprovider: PCSTR, lpnetinfostruct: Long): WIN32_ERROR =
    0u

public actual fun WNetGetNetworkInformationW(lpprovider: PCWSTR, lpnetinfostruct: Long): WIN32_ERROR =
    0u

public actual fun WNetGetProviderNameA(dwnettype: UInt, lpprovidername: PSTR, lpbuffersize: Long): WIN32_ERROR =
    0u

public actual fun WNetGetProviderNameW(dwnettype: UInt, lpprovidername: PWSTR, lpbuffersize: Long): WIN32_ERROR =
    0u

public actual fun WNetGetResourceInformationA(lpnetresource: Long, lpbuffer: Long, lpcbbuffer: Long, lplpsystem: Long): WIN32_ERROR =
    0u

public actual fun WNetGetResourceInformationW(lpnetresource: Long, lpbuffer: Long, lpcbbuffer: Long, lplpsystem: Long): WIN32_ERROR =
    0u

public actual fun WNetGetResourceParentA(lpnetresource: Long, lpbuffer: Long, lpcbbuffer: Long): WIN32_ERROR =
    0u

public actual fun WNetGetResourceParentW(lpnetresource: Long, lpbuffer: Long, lpcbbuffer: Long): WIN32_ERROR =
    0u

public actual fun WNetGetUniversalNameA(lplocalpath: PCSTR, dwinfolevel: UNC_INFO_LEVEL, lpbuffer: Long, lpbuffersize: Long): WIN32_ERROR =
    0u

public actual fun WNetGetUniversalNameW(lplocalpath: PCWSTR, dwinfolevel: UNC_INFO_LEVEL, lpbuffer: Long, lpbuffersize: Long): WIN32_ERROR =
    0u

public actual fun WNetGetUserA(lpname: PCSTR, lpusername: PSTR, lpnlength: Long): WIN32_ERROR =
    0u

public actual fun WNetGetUserW(lpname: PCWSTR, lpusername: PWSTR, lpnlength: Long): WIN32_ERROR =
    0u

public actual fun WNetOpenEnumA(dwscope: NET_RESOURCE_SCOPE, dwtype: NET_RESOURCE_TYPE, dwusage: WNET_OPEN_ENUM_USAGE, lpnetresource: Long, lphenum: Long): WIN32_ERROR =
    0u

public actual fun WNetOpenEnumW(dwscope: NET_RESOURCE_SCOPE, dwtype: NET_RESOURCE_TYPE, dwusage: WNET_OPEN_ENUM_USAGE, lpnetresource: Long, lphenum: Long): WIN32_ERROR =
    0u

public actual fun WNetSetLastErrorA(err: UInt, lperror: PCSTR, lpproviders: PCSTR) {
}

public actual fun WNetSetLastErrorW(err: UInt, lperror: PCWSTR, lpproviders: PCWSTR) {
}

public actual fun WNetUseConnection4A(hwndowner: HWND, lpnetresource: Long, pauthbuffer: Long, cbauthbuffer: UInt, dwflags: UInt, lpuseoptions: Long, cbuseoptions: UInt, lpaccessname: PSTR, lpbuffersize: Long, lpresult: Long): WIN32_ERROR =
    0u

public actual fun WNetUseConnection4W(hwndowner: HWND, lpnetresource: Long, pauthbuffer: Long, cbauthbuffer: UInt, dwflags: UInt, lpuseoptions: Long, cbuseoptions: UInt, lpaccessname: PWSTR, lpbuffersize: Long, lpresult: Long): WIN32_ERROR =
    0u

public actual fun WNetUseConnectionA(hwndowner: HWND, lpnetresource: Long, lppassword: PCSTR, lpuserid: PCSTR, dwflags: NET_CONNECT_FLAGS, lpaccessname: PSTR, lpbuffersize: Long, lpresult: Long): WIN32_ERROR =
    0u

public actual fun WNetUseConnectionW(hwndowner: HWND, lpnetresource: Long, lppassword: PCWSTR, lpuserid: PCWSTR, dwflags: NET_CONNECT_FLAGS, lpaccessname: PWSTR, lpbuffersize: Long, lpresult: Long): WIN32_ERROR =
    0u
