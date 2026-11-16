package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error

public expect fun multinetGetConnectionPerformanceA(lpnetresource: ConstPtr, lpnetconnectinfostruct: MutPtr): UInt

public expect fun multinetGetConnectionPerformanceW(lpnetresource: ConstPtr, lpnetconnectinfostruct: MutPtr): UInt

public expect fun nPAddConnection(lpnetresource: ConstPtr, lppassword: Pcwstr, lpusername: Pcwstr): UInt

public expect fun nPAddConnection3(hwndowner: Hwnd, lpnetresource: ConstPtr, lppassword: Pcwstr, lpusername: Pcwstr, dwflags: NetConnectFlags): UInt

public expect fun nPAddConnection4(hwndowner: Hwnd, lpnetresource: ConstPtr, lpauthbuffer: ConstPtr, cbauthbuffer: UInt, dwflags: UInt, lpuseoptions: ConstPtr, cbuseoptions: UInt): UInt

public expect fun nPCancelConnection(lpname: Pcwstr, fforce: Bool): UInt

public expect fun nPCancelConnection2(lpname: Pcwstr, fforce: Bool, dwflags: UInt): UInt

public expect fun nPCloseEnum(henum: Handle): UInt

public expect fun nPEnumResource(henum: Handle, lpccount: MutPtr, lpbuffer: MutPtr, lpbuffersize: MutPtr): UInt

public expect fun nPFormatNetworkName(lpremotename: Pcwstr, lpformattedname: Pwstr, lpnlength: MutPtr, dwflags: NetworkNameFormatFlags, dwavecharperline: UInt): UInt

public expect fun nPGetCaps(ndex: UInt): UInt

public expect fun nPGetConnection(lplocalname: Pcwstr, lpremotename: Pwstr, lpnbufferlen: MutPtr): UInt

public expect fun nPGetConnection3(lplocalname: Pcwstr, dwlevel: UInt, lpbuffer: MutPtr, lpbuffersize: MutPtr): UInt

public expect fun nPGetConnectionPerformance(lpremotename: Pcwstr, lpnetconnectinfo: MutPtr): UInt

public expect fun nPGetPersistentUseOptionsForConnection(lpremotepath: Pcwstr, lpreaduseoptions: ConstPtr, cbreaduseoptions: UInt, lpwriteuseoptions: MutPtr, lpsizewriteuseoptions: MutPtr): UInt

public expect fun nPGetResourceInformation(lpnetresource: ConstPtr, lpbuffer: MutPtr, lpbuffersize: MutPtr, lplpsystem: MutPtr): UInt

public expect fun nPGetResourceParent(lpnetresource: ConstPtr, lpbuffer: MutPtr, lpbuffersize: MutPtr): UInt

public expect fun nPGetUniversalName(lplocalpath: Pcwstr, dwinfolevel: UncInfoLevel, lpbuffer: MutPtr, lpbuffersize: MutPtr): UInt

public expect fun nPGetUser(lpname: Pcwstr, lpusername: Pwstr, lpnbufferlen: MutPtr): UInt

public expect fun nPOpenEnum(dwscope: UInt, dwtype: UInt, dwusage: UInt, lpnetresource: ConstPtr, lphenum: MutPtr): UInt

public expect fun wNetAddConnection2A(lpnetresource: ConstPtr, lppassword: Pcstr, lpusername: Pcstr, dwflags: NetConnectFlags): Win32Error

public expect fun wNetAddConnection2W(lpnetresource: ConstPtr, lppassword: Pcwstr, lpusername: Pcwstr, dwflags: NetConnectFlags): Win32Error

public expect fun wNetAddConnection3A(hwndowner: Hwnd, lpnetresource: ConstPtr, lppassword: Pcstr, lpusername: Pcstr, dwflags: NetConnectFlags): Win32Error

public expect fun wNetAddConnection3W(hwndowner: Hwnd, lpnetresource: ConstPtr, lppassword: Pcwstr, lpusername: Pcwstr, dwflags: NetConnectFlags): Win32Error

public expect fun wNetAddConnection4A(hwndowner: Hwnd, lpnetresource: ConstPtr, pauthbuffer: ConstPtr, cbauthbuffer: UInt, dwflags: NetConnectFlags, lpuseoptions: ConstPtr, cbuseoptions: UInt): Win32Error

public expect fun wNetAddConnection4W(hwndowner: Hwnd, lpnetresource: ConstPtr, pauthbuffer: ConstPtr, cbauthbuffer: UInt, dwflags: NetConnectFlags, lpuseoptions: ConstPtr, cbuseoptions: UInt): Win32Error

public expect fun wNetAddConnectionA(lpremotename: Pcstr, lppassword: Pcstr, lplocalname: Pcstr): Win32Error

public expect fun wNetAddConnectionW(lpremotename: Pcwstr, lppassword: Pcwstr, lplocalname: Pcwstr): Win32Error

public expect fun wNetCancelConnection2A(lpname: Pcstr, dwflags: NetConnectFlags, fforce: Bool): Win32Error

public expect fun wNetCancelConnection2W(lpname: Pcwstr, dwflags: NetConnectFlags, fforce: Bool): Win32Error

public expect fun wNetCancelConnectionA(lpname: Pcstr, fforce: Bool): Win32Error

public expect fun wNetCancelConnectionW(lpname: Pcwstr, fforce: Bool): Win32Error

public expect fun wNetCloseEnum(henum: Handle): Win32Error

public expect fun wNetConnectionDialog(hwnd: Hwnd, dwtype: UInt): Win32Error

public expect fun wNetConnectionDialog1A(lpconndlgstruct: MutPtr): Win32Error

public expect fun wNetConnectionDialog1W(lpconndlgstruct: MutPtr): Win32Error

public expect fun wNetDisconnectDialog(hwnd: Hwnd, dwtype: UInt): Win32Error

public expect fun wNetDisconnectDialog1A(lpconndlgstruct: ConstPtr): Win32Error

public expect fun wNetDisconnectDialog1W(lpconndlgstruct: ConstPtr): Win32Error

public expect fun wNetEnumResourceA(henum: Handle, lpccount: MutPtr, lpbuffer: MutPtr, lpbuffersize: MutPtr): Win32Error

public expect fun wNetEnumResourceW(henum: Handle, lpccount: MutPtr, lpbuffer: MutPtr, lpbuffersize: MutPtr): Win32Error

public expect fun wNetGetConnectionA(lplocalname: Pcstr, lpremotename: Pstr, lpnlength: MutPtr): Win32Error

public expect fun wNetGetConnectionW(lplocalname: Pcwstr, lpremotename: Pwstr, lpnlength: MutPtr): Win32Error

public expect fun wNetGetLastErrorA(lperror: MutPtr, lperrorbuf: Pstr, nerrorbufsize: UInt, lpnamebuf: Pstr, nnamebufsize: UInt): Win32Error

public expect fun wNetGetLastErrorW(lperror: MutPtr, lperrorbuf: Pwstr, nerrorbufsize: UInt, lpnamebuf: Pwstr, nnamebufsize: UInt): Win32Error

public expect fun wNetGetNetworkInformationA(lpprovider: Pcstr, lpnetinfostruct: MutPtr): Win32Error

public expect fun wNetGetNetworkInformationW(lpprovider: Pcwstr, lpnetinfostruct: MutPtr): Win32Error

public expect fun wNetGetProviderNameA(dwnettype: UInt, lpprovidername: Pstr, lpbuffersize: MutPtr): Win32Error

public expect fun wNetGetProviderNameW(dwnettype: UInt, lpprovidername: Pwstr, lpbuffersize: MutPtr): Win32Error

public expect fun wNetGetResourceInformationA(lpnetresource: ConstPtr, lpbuffer: MutPtr, lpcbbuffer: MutPtr, lplpsystem: MutPtr): Win32Error

public expect fun wNetGetResourceInformationW(lpnetresource: ConstPtr, lpbuffer: MutPtr, lpcbbuffer: MutPtr, lplpsystem: MutPtr): Win32Error

public expect fun wNetGetResourceParentA(lpnetresource: ConstPtr, lpbuffer: MutPtr, lpcbbuffer: MutPtr): Win32Error

public expect fun wNetGetResourceParentW(lpnetresource: ConstPtr, lpbuffer: MutPtr, lpcbbuffer: MutPtr): Win32Error

public expect fun wNetGetUniversalNameA(lplocalpath: Pcstr, dwinfolevel: UncInfoLevel, lpbuffer: MutPtr, lpbuffersize: MutPtr): Win32Error

public expect fun wNetGetUniversalNameW(lplocalpath: Pcwstr, dwinfolevel: UncInfoLevel, lpbuffer: MutPtr, lpbuffersize: MutPtr): Win32Error

public expect fun wNetGetUserA(lpname: Pcstr, lpusername: Pstr, lpnlength: MutPtr): Win32Error

public expect fun wNetGetUserW(lpname: Pcwstr, lpusername: Pwstr, lpnlength: MutPtr): Win32Error

public expect fun wNetOpenEnumA(dwscope: NetResourceScope, dwtype: NetResourceType, dwusage: WnetOpenEnumUsage, lpnetresource: ConstPtr, lphenum: MutPtr): Win32Error

public expect fun wNetOpenEnumW(dwscope: NetResourceScope, dwtype: NetResourceType, dwusage: WnetOpenEnumUsage, lpnetresource: ConstPtr, lphenum: MutPtr): Win32Error

public expect fun wNetSetLastErrorA(err: UInt, lperror: Pcstr, lpproviders: Pcstr)

public expect fun wNetSetLastErrorW(err: UInt, lperror: Pcwstr, lpproviders: Pcwstr)

public expect fun wNetUseConnection4A(hwndowner: Hwnd, lpnetresource: ConstPtr, pauthbuffer: ConstPtr, cbauthbuffer: UInt, dwflags: UInt, lpuseoptions: ConstPtr, cbuseoptions: UInt, lpaccessname: Pstr, lpbuffersize: MutPtr, lpresult: MutPtr): Win32Error

public expect fun wNetUseConnection4W(hwndowner: Hwnd, lpnetresource: ConstPtr, pauthbuffer: ConstPtr, cbauthbuffer: UInt, dwflags: UInt, lpuseoptions: ConstPtr, cbuseoptions: UInt, lpaccessname: Pwstr, lpbuffersize: MutPtr, lpresult: MutPtr): Win32Error

public expect fun wNetUseConnectionA(hwndowner: Hwnd, lpnetresource: ConstPtr, lppassword: Pcstr, lpuserid: Pcstr, dwflags: NetConnectFlags, lpaccessname: Pstr, lpbuffersize: MutPtr, lpresult: MutPtr): Win32Error

public expect fun wNetUseConnectionW(hwndowner: Hwnd, lpnetresource: ConstPtr, lppassword: Pcwstr, lpuserid: Pcwstr, dwflags: NetConnectFlags, lpaccessname: Pwstr, lpbuffersize: MutPtr, lpresult: MutPtr): Win32Error
