package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error

public expect fun multinetGetConnectionPerformanceA(lpnetresource: COpaquePointer?, lpnetconnectinfostruct: COpaquePointer?): UInt

public expect fun multinetGetConnectionPerformanceW(lpnetresource: COpaquePointer?, lpnetconnectinfostruct: COpaquePointer?): UInt

public expect fun nPAddConnection(lpnetresource: COpaquePointer?, lppassword: Pcwstr, lpusername: Pcwstr): UInt

public expect fun nPAddConnection3(hwndowner: Hwnd, lpnetresource: COpaquePointer?, lppassword: Pcwstr, lpusername: Pcwstr, dwflags: NetConnectFlags): UInt

public expect fun nPAddConnection4(hwndowner: Hwnd, lpnetresource: COpaquePointer?, lpauthbuffer: COpaquePointer?, cbauthbuffer: UInt, dwflags: UInt, lpuseoptions: COpaquePointer?, cbuseoptions: UInt): UInt

public expect fun nPCancelConnection(lpname: Pcwstr, fforce: Bool): UInt

public expect fun nPCancelConnection2(lpname: Pcwstr, fforce: Bool, dwflags: UInt): UInt

public expect fun nPCloseEnum(henum: Handle): UInt

public expect fun nPEnumResource(henum: Handle, lpccount: COpaquePointer?, lpbuffer: COpaquePointer?, lpbuffersize: COpaquePointer?): UInt

public expect fun nPFormatNetworkName(lpremotename: Pcwstr, lpformattedname: Pwstr, lpnlength: COpaquePointer?, dwflags: NetworkNameFormatFlags, dwavecharperline: UInt): UInt

public expect fun nPGetCaps(ndex: UInt): UInt

public expect fun nPGetConnection(lplocalname: Pcwstr, lpremotename: Pwstr, lpnbufferlen: COpaquePointer?): UInt

public expect fun nPGetConnection3(lplocalname: Pcwstr, dwlevel: UInt, lpbuffer: COpaquePointer?, lpbuffersize: COpaquePointer?): UInt

public expect fun nPGetConnectionPerformance(lpremotename: Pcwstr, lpnetconnectinfo: COpaquePointer?): UInt

public expect fun nPGetPersistentUseOptionsForConnection(lpremotepath: Pcwstr, lpreaduseoptions: COpaquePointer?, cbreaduseoptions: UInt, lpwriteuseoptions: COpaquePointer?, lpsizewriteuseoptions: COpaquePointer?): UInt

public expect fun nPGetResourceInformation(lpnetresource: COpaquePointer?, lpbuffer: COpaquePointer?, lpbuffersize: COpaquePointer?, lplpsystem: COpaquePointer?): UInt

public expect fun nPGetResourceParent(lpnetresource: COpaquePointer?, lpbuffer: COpaquePointer?, lpbuffersize: COpaquePointer?): UInt

public expect fun nPGetUniversalName(lplocalpath: Pcwstr, dwinfolevel: UncInfoLevel, lpbuffer: COpaquePointer?, lpbuffersize: COpaquePointer?): UInt

public expect fun nPGetUser(lpname: Pcwstr, lpusername: Pwstr, lpnbufferlen: COpaquePointer?): UInt

public expect fun nPOpenEnum(dwscope: UInt, dwtype: UInt, dwusage: UInt, lpnetresource: COpaquePointer?, lphenum: COpaquePointer?): UInt

public expect fun wNetAddConnection2A(lpnetresource: COpaquePointer?, lppassword: Pcstr, lpusername: Pcstr, dwflags: NetConnectFlags): Win32Error

public expect fun wNetAddConnection2W(lpnetresource: COpaquePointer?, lppassword: Pcwstr, lpusername: Pcwstr, dwflags: NetConnectFlags): Win32Error

public expect fun wNetAddConnection3A(hwndowner: Hwnd, lpnetresource: COpaquePointer?, lppassword: Pcstr, lpusername: Pcstr, dwflags: NetConnectFlags): Win32Error

public expect fun wNetAddConnection3W(hwndowner: Hwnd, lpnetresource: COpaquePointer?, lppassword: Pcwstr, lpusername: Pcwstr, dwflags: NetConnectFlags): Win32Error

public expect fun wNetAddConnection4A(hwndowner: Hwnd, lpnetresource: COpaquePointer?, pauthbuffer: COpaquePointer?, cbauthbuffer: UInt, dwflags: NetConnectFlags, lpuseoptions: COpaquePointer?, cbuseoptions: UInt): Win32Error

public expect fun wNetAddConnection4W(hwndowner: Hwnd, lpnetresource: COpaquePointer?, pauthbuffer: COpaquePointer?, cbauthbuffer: UInt, dwflags: NetConnectFlags, lpuseoptions: COpaquePointer?, cbuseoptions: UInt): Win32Error

public expect fun wNetAddConnectionA(lpremotename: Pcstr, lppassword: Pcstr, lplocalname: Pcstr): Win32Error

public expect fun wNetAddConnectionW(lpremotename: Pcwstr, lppassword: Pcwstr, lplocalname: Pcwstr): Win32Error

public expect fun wNetCancelConnection2A(lpname: Pcstr, dwflags: NetConnectFlags, fforce: Bool): Win32Error

public expect fun wNetCancelConnection2W(lpname: Pcwstr, dwflags: NetConnectFlags, fforce: Bool): Win32Error

public expect fun wNetCancelConnectionA(lpname: Pcstr, fforce: Bool): Win32Error

public expect fun wNetCancelConnectionW(lpname: Pcwstr, fforce: Bool): Win32Error

public expect fun wNetCloseEnum(henum: Handle): Win32Error

public expect fun wNetConnectionDialog(hwnd: Hwnd, dwtype: UInt): Win32Error

public expect fun wNetConnectionDialog1A(lpconndlgstruct: COpaquePointer?): Win32Error

public expect fun wNetConnectionDialog1W(lpconndlgstruct: COpaquePointer?): Win32Error

public expect fun wNetDisconnectDialog(hwnd: Hwnd, dwtype: UInt): Win32Error

public expect fun wNetDisconnectDialog1A(lpconndlgstruct: COpaquePointer?): Win32Error

public expect fun wNetDisconnectDialog1W(lpconndlgstruct: COpaquePointer?): Win32Error

public expect fun wNetEnumResourceA(henum: Handle, lpccount: COpaquePointer?, lpbuffer: COpaquePointer?, lpbuffersize: COpaquePointer?): Win32Error

public expect fun wNetEnumResourceW(henum: Handle, lpccount: COpaquePointer?, lpbuffer: COpaquePointer?, lpbuffersize: COpaquePointer?): Win32Error

public expect fun wNetGetConnectionA(lplocalname: Pcstr, lpremotename: Pstr, lpnlength: COpaquePointer?): Win32Error

public expect fun wNetGetConnectionW(lplocalname: Pcwstr, lpremotename: Pwstr, lpnlength: COpaquePointer?): Win32Error

public expect fun wNetGetLastErrorA(lperror: COpaquePointer?, lperrorbuf: Pstr, nerrorbufsize: UInt, lpnamebuf: Pstr, nnamebufsize: UInt): Win32Error

public expect fun wNetGetLastErrorW(lperror: COpaquePointer?, lperrorbuf: Pwstr, nerrorbufsize: UInt, lpnamebuf: Pwstr, nnamebufsize: UInt): Win32Error

public expect fun wNetGetNetworkInformationA(lpprovider: Pcstr, lpnetinfostruct: COpaquePointer?): Win32Error

public expect fun wNetGetNetworkInformationW(lpprovider: Pcwstr, lpnetinfostruct: COpaquePointer?): Win32Error

public expect fun wNetGetProviderNameA(dwnettype: UInt, lpprovidername: Pstr, lpbuffersize: COpaquePointer?): Win32Error

public expect fun wNetGetProviderNameW(dwnettype: UInt, lpprovidername: Pwstr, lpbuffersize: COpaquePointer?): Win32Error

public expect fun wNetGetResourceInformationA(lpnetresource: COpaquePointer?, lpbuffer: COpaquePointer?, lpcbbuffer: COpaquePointer?, lplpsystem: COpaquePointer?): Win32Error

public expect fun wNetGetResourceInformationW(lpnetresource: COpaquePointer?, lpbuffer: COpaquePointer?, lpcbbuffer: COpaquePointer?, lplpsystem: COpaquePointer?): Win32Error

public expect fun wNetGetResourceParentA(lpnetresource: COpaquePointer?, lpbuffer: COpaquePointer?, lpcbbuffer: COpaquePointer?): Win32Error

public expect fun wNetGetResourceParentW(lpnetresource: COpaquePointer?, lpbuffer: COpaquePointer?, lpcbbuffer: COpaquePointer?): Win32Error

public expect fun wNetGetUniversalNameA(lplocalpath: Pcstr, dwinfolevel: UncInfoLevel, lpbuffer: COpaquePointer?, lpbuffersize: COpaquePointer?): Win32Error

public expect fun wNetGetUniversalNameW(lplocalpath: Pcwstr, dwinfolevel: UncInfoLevel, lpbuffer: COpaquePointer?, lpbuffersize: COpaquePointer?): Win32Error

public expect fun wNetGetUserA(lpname: Pcstr, lpusername: Pstr, lpnlength: COpaquePointer?): Win32Error

public expect fun wNetGetUserW(lpname: Pcwstr, lpusername: Pwstr, lpnlength: COpaquePointer?): Win32Error

public expect fun wNetOpenEnumA(dwscope: NetResourceScope, dwtype: NetResourceType, dwusage: WnetOpenEnumUsage, lpnetresource: COpaquePointer?, lphenum: COpaquePointer?): Win32Error

public expect fun wNetOpenEnumW(dwscope: NetResourceScope, dwtype: NetResourceType, dwusage: WnetOpenEnumUsage, lpnetresource: COpaquePointer?, lphenum: COpaquePointer?): Win32Error

public expect fun wNetSetLastErrorA(err: UInt, lperror: Pcstr, lpproviders: Pcstr)

public expect fun wNetSetLastErrorW(err: UInt, lperror: Pcwstr, lpproviders: Pcwstr)

public expect fun wNetUseConnection4A(hwndowner: Hwnd, lpnetresource: COpaquePointer?, pauthbuffer: COpaquePointer?, cbauthbuffer: UInt, dwflags: UInt, lpuseoptions: COpaquePointer?, cbuseoptions: UInt, lpaccessname: Pstr, lpbuffersize: COpaquePointer?, lpresult: COpaquePointer?): Win32Error

public expect fun wNetUseConnection4W(hwndowner: Hwnd, lpnetresource: COpaquePointer?, pauthbuffer: COpaquePointer?, cbauthbuffer: UInt, dwflags: UInt, lpuseoptions: COpaquePointer?, cbuseoptions: UInt, lpaccessname: Pwstr, lpbuffersize: COpaquePointer?, lpresult: COpaquePointer?): Win32Error

public expect fun wNetUseConnectionA(hwndowner: Hwnd, lpnetresource: COpaquePointer?, lppassword: Pcstr, lpuserid: Pcstr, dwflags: NetConnectFlags, lpaccessname: Pstr, lpbuffersize: COpaquePointer?, lpresult: COpaquePointer?): Win32Error

public expect fun wNetUseConnectionW(hwndowner: Hwnd, lpnetresource: COpaquePointer?, lppassword: Pcwstr, lpuserid: Pcwstr, dwflags: NetConnectFlags, lpaccessname: Pwstr, lpbuffersize: COpaquePointer?, lpresult: COpaquePointer?): Win32Error
