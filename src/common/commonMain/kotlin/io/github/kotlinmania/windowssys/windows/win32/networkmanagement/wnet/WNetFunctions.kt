package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet

import io.github.kotlinmania.rustlang.core.ffi.CVoid
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

public expect fun multinetGetConnectionPerformanceA(lpnetresource: ConstPtr<Netresourcea>, lpnetconnectinfostruct: MutPtr<Netconnectinfostruct>): UInt

public expect fun multinetGetConnectionPerformanceW(lpnetresource: ConstPtr<Netresourcew>, lpnetconnectinfostruct: MutPtr<Netconnectinfostruct>): UInt

public expect fun nPAddConnection(lpnetresource: ConstPtr<Netresourcew>, lppassword: Pcwstr, lpusername: Pcwstr): UInt

public expect fun nPAddConnection3(hwndowner: Hwnd, lpnetresource: ConstPtr<Netresourcew>, lppassword: Pcwstr, lpusername: Pcwstr, dwflags: NetConnectFlags): UInt

public expect fun nPAddConnection4(hwndowner: Hwnd, lpnetresource: ConstPtr<Netresourcew>, lpauthbuffer: ConstPtr<CVoid>, cbauthbuffer: UInt, dwflags: UInt, lpuseoptions: ConstPtr<UByte>, cbuseoptions: UInt): UInt

public expect fun nPCancelConnection(lpname: Pcwstr, fforce: Bool): UInt

public expect fun nPCancelConnection2(lpname: Pcwstr, fforce: Bool, dwflags: UInt): UInt

public expect fun nPCloseEnum(henum: Handle): UInt

public expect fun nPEnumResource(henum: Handle, lpccount: MutPtr<UInt>, lpbuffer: MutPtr<CVoid>, lpbuffersize: MutPtr<UInt>): UInt

public expect fun nPFormatNetworkName(lpremotename: Pcwstr, lpformattedname: Pwstr, lpnlength: MutPtr<UInt>, dwflags: NetworkNameFormatFlags, dwavecharperline: UInt): UInt

public expect fun nPGetCaps(ndex: UInt): UInt

public expect fun nPGetConnection(lplocalname: Pcwstr, lpremotename: Pwstr, lpnbufferlen: MutPtr<UInt>): UInt

public expect fun nPGetConnection3(lplocalname: Pcwstr, dwlevel: UInt, lpbuffer: MutPtr<CVoid>, lpbuffersize: MutPtr<UInt>): UInt

public expect fun nPGetConnectionPerformance(lpremotename: Pcwstr, lpnetconnectinfo: MutPtr<Netconnectinfostruct>): UInt

public expect fun nPGetPersistentUseOptionsForConnection(lpremotepath: Pcwstr, lpreaduseoptions: ConstPtr<UByte>, cbreaduseoptions: UInt, lpwriteuseoptions: MutPtr<UByte>, lpsizewriteuseoptions: MutPtr<UInt>): UInt

public expect fun nPGetResourceInformation(lpnetresource: ConstPtr<Netresourcew>, lpbuffer: MutPtr<CVoid>, lpbuffersize: MutPtr<UInt>, lplpsystem: MutPtr<Pwstr>): UInt

public expect fun nPGetResourceParent(lpnetresource: ConstPtr<Netresourcew>, lpbuffer: MutPtr<CVoid>, lpbuffersize: MutPtr<UInt>): UInt

public expect fun nPGetUniversalName(lplocalpath: Pcwstr, dwinfolevel: UncInfoLevel, lpbuffer: MutPtr<CVoid>, lpbuffersize: MutPtr<UInt>): UInt

public expect fun nPGetUser(lpname: Pcwstr, lpusername: Pwstr, lpnbufferlen: MutPtr<UInt>): UInt

public expect fun nPOpenEnum(dwscope: UInt, dwtype: UInt, dwusage: UInt, lpnetresource: ConstPtr<Netresourcew>, lphenum: MutPtr<Handle>): UInt

public expect fun wNetAddConnection2A(lpnetresource: ConstPtr<Netresourcea>, lppassword: Pcstr, lpusername: Pcstr, dwflags: NetConnectFlags): Win32Error

public expect fun wNetAddConnection2W(lpnetresource: ConstPtr<Netresourcew>, lppassword: Pcwstr, lpusername: Pcwstr, dwflags: NetConnectFlags): Win32Error

public expect fun wNetAddConnection3A(hwndowner: Hwnd, lpnetresource: ConstPtr<Netresourcea>, lppassword: Pcstr, lpusername: Pcstr, dwflags: NetConnectFlags): Win32Error

public expect fun wNetAddConnection3W(hwndowner: Hwnd, lpnetresource: ConstPtr<Netresourcew>, lppassword: Pcwstr, lpusername: Pcwstr, dwflags: NetConnectFlags): Win32Error

public expect fun wNetAddConnection4A(hwndowner: Hwnd, lpnetresource: ConstPtr<Netresourcea>, pauthbuffer: ConstPtr<CVoid>, cbauthbuffer: UInt, dwflags: NetConnectFlags, lpuseoptions: ConstPtr<UByte>, cbuseoptions: UInt): Win32Error

public expect fun wNetAddConnection4W(hwndowner: Hwnd, lpnetresource: ConstPtr<Netresourcew>, pauthbuffer: ConstPtr<CVoid>, cbauthbuffer: UInt, dwflags: NetConnectFlags, lpuseoptions: ConstPtr<UByte>, cbuseoptions: UInt): Win32Error

public expect fun wNetAddConnectionA(lpremotename: Pcstr, lppassword: Pcstr, lplocalname: Pcstr): Win32Error

public expect fun wNetAddConnectionW(lpremotename: Pcwstr, lppassword: Pcwstr, lplocalname: Pcwstr): Win32Error

public expect fun wNetCancelConnection2A(lpname: Pcstr, dwflags: NetConnectFlags, fforce: Bool): Win32Error

public expect fun wNetCancelConnection2W(lpname: Pcwstr, dwflags: NetConnectFlags, fforce: Bool): Win32Error

public expect fun wNetCancelConnectionA(lpname: Pcstr, fforce: Bool): Win32Error

public expect fun wNetCancelConnectionW(lpname: Pcwstr, fforce: Bool): Win32Error

public expect fun wNetCloseEnum(henum: Handle): Win32Error

public expect fun wNetConnectionDialog(hwnd: Hwnd, dwtype: UInt): Win32Error

public expect fun wNetConnectionDialog1A(lpconndlgstruct: MutPtr<Connectdlgstructa>): Win32Error

public expect fun wNetConnectionDialog1W(lpconndlgstruct: MutPtr<Connectdlgstructw>): Win32Error

public expect fun wNetDisconnectDialog(hwnd: Hwnd, dwtype: UInt): Win32Error

public expect fun wNetDisconnectDialog1A(lpconndlgstruct: ConstPtr<Discdlgstructa>): Win32Error

public expect fun wNetDisconnectDialog1W(lpconndlgstruct: ConstPtr<Discdlgstructw>): Win32Error

public expect fun wNetEnumResourceA(henum: Handle, lpccount: MutPtr<UInt>, lpbuffer: MutPtr<CVoid>, lpbuffersize: MutPtr<UInt>): Win32Error

public expect fun wNetEnumResourceW(henum: Handle, lpccount: MutPtr<UInt>, lpbuffer: MutPtr<CVoid>, lpbuffersize: MutPtr<UInt>): Win32Error

public expect fun wNetGetConnectionA(lplocalname: Pcstr, lpremotename: Pstr, lpnlength: MutPtr<UInt>): Win32Error

public expect fun wNetGetConnectionW(lplocalname: Pcwstr, lpremotename: Pwstr, lpnlength: MutPtr<UInt>): Win32Error

public expect fun wNetGetLastErrorA(lperror: MutPtr<UInt>, lperrorbuf: Pstr, nerrorbufsize: UInt, lpnamebuf: Pstr, nnamebufsize: UInt): Win32Error

public expect fun wNetGetLastErrorW(lperror: MutPtr<UInt>, lperrorbuf: Pwstr, nerrorbufsize: UInt, lpnamebuf: Pwstr, nnamebufsize: UInt): Win32Error

public expect fun wNetGetNetworkInformationA(lpprovider: Pcstr, lpnetinfostruct: MutPtr<Netinfostruct>): Win32Error

public expect fun wNetGetNetworkInformationW(lpprovider: Pcwstr, lpnetinfostruct: MutPtr<Netinfostruct>): Win32Error

public expect fun wNetGetProviderNameA(dwnettype: UInt, lpprovidername: Pstr, lpbuffersize: MutPtr<UInt>): Win32Error

public expect fun wNetGetProviderNameW(dwnettype: UInt, lpprovidername: Pwstr, lpbuffersize: MutPtr<UInt>): Win32Error

public expect fun wNetGetResourceInformationA(lpnetresource: ConstPtr<Netresourcea>, lpbuffer: MutPtr<CVoid>, lpcbbuffer: MutPtr<UInt>, lplpsystem: MutPtr<Pstr>): Win32Error

public expect fun wNetGetResourceInformationW(lpnetresource: ConstPtr<Netresourcew>, lpbuffer: MutPtr<CVoid>, lpcbbuffer: MutPtr<UInt>, lplpsystem: MutPtr<Pwstr>): Win32Error

public expect fun wNetGetResourceParentA(lpnetresource: ConstPtr<Netresourcea>, lpbuffer: MutPtr<CVoid>, lpcbbuffer: MutPtr<UInt>): Win32Error

public expect fun wNetGetResourceParentW(lpnetresource: ConstPtr<Netresourcew>, lpbuffer: MutPtr<CVoid>, lpcbbuffer: MutPtr<UInt>): Win32Error

public expect fun wNetGetUniversalNameA(lplocalpath: Pcstr, dwinfolevel: UncInfoLevel, lpbuffer: MutPtr<CVoid>, lpbuffersize: MutPtr<UInt>): Win32Error

public expect fun wNetGetUniversalNameW(lplocalpath: Pcwstr, dwinfolevel: UncInfoLevel, lpbuffer: MutPtr<CVoid>, lpbuffersize: MutPtr<UInt>): Win32Error

public expect fun wNetGetUserA(lpname: Pcstr, lpusername: Pstr, lpnlength: MutPtr<UInt>): Win32Error

public expect fun wNetGetUserW(lpname: Pcwstr, lpusername: Pwstr, lpnlength: MutPtr<UInt>): Win32Error

public expect fun wNetOpenEnumA(dwscope: NetResourceScope, dwtype: NetResourceType, dwusage: WnetOpenEnumUsage, lpnetresource: ConstPtr<Netresourcea>, lphenum: MutPtr<Handle>): Win32Error

public expect fun wNetOpenEnumW(dwscope: NetResourceScope, dwtype: NetResourceType, dwusage: WnetOpenEnumUsage, lpnetresource: ConstPtr<Netresourcew>, lphenum: MutPtr<Handle>): Win32Error

public expect fun wNetSetLastErrorA(err: UInt, lperror: Pcstr, lpproviders: Pcstr)

public expect fun wNetSetLastErrorW(err: UInt, lperror: Pcwstr, lpproviders: Pcwstr)

public expect fun wNetUseConnection4A(hwndowner: Hwnd, lpnetresource: ConstPtr<Netresourcea>, pauthbuffer: ConstPtr<CVoid>, cbauthbuffer: UInt, dwflags: UInt, lpuseoptions: ConstPtr<UByte>, cbuseoptions: UInt, lpaccessname: Pstr, lpbuffersize: MutPtr<UInt>, lpresult: MutPtr<UInt>): Win32Error

public expect fun wNetUseConnection4W(hwndowner: Hwnd, lpnetresource: ConstPtr<Netresourcew>, pauthbuffer: ConstPtr<CVoid>, cbauthbuffer: UInt, dwflags: UInt, lpuseoptions: ConstPtr<UByte>, cbuseoptions: UInt, lpaccessname: Pwstr, lpbuffersize: MutPtr<UInt>, lpresult: MutPtr<UInt>): Win32Error

public expect fun wNetUseConnectionA(hwndowner: Hwnd, lpnetresource: ConstPtr<Netresourcea>, lppassword: Pcstr, lpuserid: Pcstr, dwflags: NetConnectFlags, lpaccessname: Pstr, lpbuffersize: MutPtr<UInt>, lpresult: MutPtr<UInt>): Win32Error

public expect fun wNetUseConnectionW(hwndowner: Hwnd, lpnetresource: ConstPtr<Netresourcew>, lppassword: Pcwstr, lpuserid: Pcwstr, dwflags: NetConnectFlags, lpaccessname: Pwstr, lpbuffersize: MutPtr<UInt>, lpresult: MutPtr<UInt>): Win32Error
