@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun multinetGetConnectionPerformanceA(lpnetresource: COpaquePointer?, lpnetconnectinfostruct: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_multinetGetConnectionPerformanceA(lpnetresource?.value?.toCPointer<ByteVar>(), lpnetconnectinfostruct?.value?.toCPointer<ByteVar>())

public actual fun multinetGetConnectionPerformanceW(lpnetresource: COpaquePointer?, lpnetconnectinfostruct: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_multinetGetConnectionPerformanceW(lpnetresource?.value?.toCPointer<ByteVar>(), lpnetconnectinfostruct?.value?.toCPointer<ByteVar>())

public actual fun nPAddConnection(lpnetresource: COpaquePointer?, lppassword: Pcwstr, lpusername: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_nPAddConnection(lpnetresource?.value?.toCPointer<ByteVar>(), lppassword?.value?.toCPointer<ByteVar>(), lpusername?.value?.toCPointer<ByteVar>())

public actual fun nPAddConnection3(hwndowner: Hwnd, lpnetresource: COpaquePointer?, lppassword: Pcwstr, lpusername: Pcwstr, dwflags: NetConnectFlags): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_nPAddConnection3(hwndowner?.value?.toCPointer<ByteVar>(), lpnetresource?.value?.toCPointer<ByteVar>(), lppassword?.value?.toCPointer<ByteVar>(), lpusername?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun nPAddConnection4(hwndowner: Hwnd, lpnetresource: COpaquePointer?, lpauthbuffer: COpaquePointer?, cbauthbuffer: UInt, dwflags: UInt, lpuseoptions: COpaquePointer?, cbuseoptions: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_nPAddConnection4(hwndowner?.value?.toCPointer<ByteVar>(), lpnetresource?.value?.toCPointer<ByteVar>(), lpauthbuffer?.value?.toCPointer<ByteVar>(), cbauthbuffer, dwflags, lpuseoptions?.value?.toCPointer<ByteVar>(), cbuseoptions)

public actual fun nPCancelConnection(lpname: Pcwstr, fforce: Bool): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_nPCancelConnection(lpname?.value?.toCPointer<ByteVar>(), fforce)

public actual fun nPCancelConnection2(lpname: Pcwstr, fforce: Bool, dwflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_nPCancelConnection2(lpname?.value?.toCPointer<ByteVar>(), fforce, dwflags)

public actual fun nPCloseEnum(henum: Handle): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_nPCloseEnum(henum?.value?.toCPointer<ByteVar>())

public actual fun nPEnumResource(henum: Handle, lpccount: COpaquePointer?, lpbuffer: COpaquePointer?, lpbuffersize: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_nPEnumResource(henum?.value?.toCPointer<ByteVar>(), lpccount?.value?.toCPointer<ByteVar>(), lpbuffer?.value?.toCPointer<ByteVar>(), lpbuffersize?.value?.toCPointer<ByteVar>())

public actual fun nPFormatNetworkName(lpremotename: Pcwstr, lpformattedname: Pwstr, lpnlength: COpaquePointer?, dwflags: NetworkNameFormatFlags, dwavecharperline: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_nPFormatNetworkName(lpremotename?.value?.toCPointer<ByteVar>(), lpformattedname?.value?.toCPointer<ByteVar>(), lpnlength?.value?.toCPointer<ByteVar>(), dwflags, dwavecharperline)

public actual fun nPGetCaps(ndex: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_nPGetCaps(ndex)

public actual fun nPGetConnection(lplocalname: Pcwstr, lpremotename: Pwstr, lpnbufferlen: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_nPGetConnection(lplocalname?.value?.toCPointer<ByteVar>(), lpremotename?.value?.toCPointer<ByteVar>(), lpnbufferlen?.value?.toCPointer<ByteVar>())

public actual fun nPGetConnection3(lplocalname: Pcwstr, dwlevel: UInt, lpbuffer: COpaquePointer?, lpbuffersize: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_nPGetConnection3(lplocalname?.value?.toCPointer<ByteVar>(), dwlevel, lpbuffer?.value?.toCPointer<ByteVar>(), lpbuffersize?.value?.toCPointer<ByteVar>())

public actual fun nPGetConnectionPerformance(lpremotename: Pcwstr, lpnetconnectinfo: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_nPGetConnectionPerformance(lpremotename?.value?.toCPointer<ByteVar>(), lpnetconnectinfo?.value?.toCPointer<ByteVar>())

public actual fun nPGetPersistentUseOptionsForConnection(lpremotepath: Pcwstr, lpreaduseoptions: COpaquePointer?, cbreaduseoptions: UInt, lpwriteuseoptions: COpaquePointer?, lpsizewriteuseoptions: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_nPGetPersistentUseOptionsForConnection(lpremotepath?.value?.toCPointer<ByteVar>(), lpreaduseoptions?.value?.toCPointer<ByteVar>(), cbreaduseoptions, lpwriteuseoptions?.value?.toCPointer<ByteVar>(), lpsizewriteuseoptions?.value?.toCPointer<ByteVar>())

public actual fun nPGetResourceInformation(lpnetresource: COpaquePointer?, lpbuffer: COpaquePointer?, lpbuffersize: COpaquePointer?, lplpsystem: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_nPGetResourceInformation(lpnetresource?.value?.toCPointer<ByteVar>(), lpbuffer?.value?.toCPointer<ByteVar>(), lpbuffersize?.value?.toCPointer<ByteVar>(), lplpsystem?.value?.toCPointer<ByteVar>())

public actual fun nPGetResourceParent(lpnetresource: COpaquePointer?, lpbuffer: COpaquePointer?, lpbuffersize: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_nPGetResourceParent(lpnetresource?.value?.toCPointer<ByteVar>(), lpbuffer?.value?.toCPointer<ByteVar>(), lpbuffersize?.value?.toCPointer<ByteVar>())

public actual fun nPGetUniversalName(lplocalpath: Pcwstr, dwinfolevel: UncInfoLevel, lpbuffer: COpaquePointer?, lpbuffersize: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_nPGetUniversalName(lplocalpath?.value?.toCPointer<ByteVar>(), dwinfolevel, lpbuffer?.value?.toCPointer<ByteVar>(), lpbuffersize?.value?.toCPointer<ByteVar>())

public actual fun nPGetUser(lpname: Pcwstr, lpusername: Pwstr, lpnbufferlen: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_nPGetUser(lpname?.value?.toCPointer<ByteVar>(), lpusername?.value?.toCPointer<ByteVar>(), lpnbufferlen?.value?.toCPointer<ByteVar>())

public actual fun nPOpenEnum(dwscope: UInt, dwtype: UInt, dwusage: UInt, lpnetresource: COpaquePointer?, lphenum: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_nPOpenEnum(dwscope, dwtype, dwusage, lpnetresource?.value?.toCPointer<ByteVar>(), lphenum?.value?.toCPointer<ByteVar>())

public actual fun wNetAddConnection2A(lpnetresource: COpaquePointer?, lppassword: Pcstr, lpusername: Pcstr, dwflags: NetConnectFlags): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_wNetAddConnection2A(lpnetresource?.value?.toCPointer<ByteVar>(), lppassword?.value?.toCPointer<ByteVar>(), lpusername?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun wNetAddConnection2W(lpnetresource: COpaquePointer?, lppassword: Pcwstr, lpusername: Pcwstr, dwflags: NetConnectFlags): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_wNetAddConnection2W(lpnetresource?.value?.toCPointer<ByteVar>(), lppassword?.value?.toCPointer<ByteVar>(), lpusername?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun wNetAddConnection3A(hwndowner: Hwnd, lpnetresource: COpaquePointer?, lppassword: Pcstr, lpusername: Pcstr, dwflags: NetConnectFlags): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_wNetAddConnection3A(hwndowner?.value?.toCPointer<ByteVar>(), lpnetresource?.value?.toCPointer<ByteVar>(), lppassword?.value?.toCPointer<ByteVar>(), lpusername?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun wNetAddConnection3W(hwndowner: Hwnd, lpnetresource: COpaquePointer?, lppassword: Pcwstr, lpusername: Pcwstr, dwflags: NetConnectFlags): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_wNetAddConnection3W(hwndowner?.value?.toCPointer<ByteVar>(), lpnetresource?.value?.toCPointer<ByteVar>(), lppassword?.value?.toCPointer<ByteVar>(), lpusername?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun wNetAddConnection4A(hwndowner: Hwnd, lpnetresource: COpaquePointer?, pauthbuffer: COpaquePointer?, cbauthbuffer: UInt, dwflags: NetConnectFlags, lpuseoptions: COpaquePointer?, cbuseoptions: UInt): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_wNetAddConnection4A(hwndowner?.value?.toCPointer<ByteVar>(), lpnetresource?.value?.toCPointer<ByteVar>(), pauthbuffer?.value?.toCPointer<ByteVar>(), cbauthbuffer, dwflags, lpuseoptions?.value?.toCPointer<ByteVar>(), cbuseoptions)

public actual fun wNetAddConnection4W(hwndowner: Hwnd, lpnetresource: COpaquePointer?, pauthbuffer: COpaquePointer?, cbauthbuffer: UInt, dwflags: NetConnectFlags, lpuseoptions: COpaquePointer?, cbuseoptions: UInt): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_wNetAddConnection4W(hwndowner?.value?.toCPointer<ByteVar>(), lpnetresource?.value?.toCPointer<ByteVar>(), pauthbuffer?.value?.toCPointer<ByteVar>(), cbauthbuffer, dwflags, lpuseoptions?.value?.toCPointer<ByteVar>(), cbuseoptions)

public actual fun wNetAddConnectionA(lpremotename: Pcstr, lppassword: Pcstr, lplocalname: Pcstr): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_wNetAddConnectionA(lpremotename?.value?.toCPointer<ByteVar>(), lppassword?.value?.toCPointer<ByteVar>(), lplocalname?.value?.toCPointer<ByteVar>())

public actual fun wNetAddConnectionW(lpremotename: Pcwstr, lppassword: Pcwstr, lplocalname: Pcwstr): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_wNetAddConnectionW(lpremotename?.value?.toCPointer<ByteVar>(), lppassword?.value?.toCPointer<ByteVar>(), lplocalname?.value?.toCPointer<ByteVar>())

public actual fun wNetCancelConnection2A(lpname: Pcstr, dwflags: NetConnectFlags, fforce: Bool): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_wNetCancelConnection2A(lpname?.value?.toCPointer<ByteVar>(), dwflags, fforce)

public actual fun wNetCancelConnection2W(lpname: Pcwstr, dwflags: NetConnectFlags, fforce: Bool): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_wNetCancelConnection2W(lpname?.value?.toCPointer<ByteVar>(), dwflags, fforce)

public actual fun wNetCancelConnectionA(lpname: Pcstr, fforce: Bool): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_wNetCancelConnectionA(lpname?.value?.toCPointer<ByteVar>(), fforce)

public actual fun wNetCancelConnectionW(lpname: Pcwstr, fforce: Bool): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_wNetCancelConnectionW(lpname?.value?.toCPointer<ByteVar>(), fforce)

public actual fun wNetCloseEnum(henum: Handle): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_wNetCloseEnum(henum?.value?.toCPointer<ByteVar>())

public actual fun wNetConnectionDialog(hwnd: Hwnd, dwtype: UInt): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_wNetConnectionDialog(hwnd?.value?.toCPointer<ByteVar>(), dwtype)

public actual fun wNetConnectionDialog1A(lpconndlgstruct: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_wNetConnectionDialog1A(lpconndlgstruct?.value?.toCPointer<ByteVar>())

public actual fun wNetConnectionDialog1W(lpconndlgstruct: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_wNetConnectionDialog1W(lpconndlgstruct?.value?.toCPointer<ByteVar>())

public actual fun wNetDisconnectDialog(hwnd: Hwnd, dwtype: UInt): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_wNetDisconnectDialog(hwnd?.value?.toCPointer<ByteVar>(), dwtype)

public actual fun wNetDisconnectDialog1A(lpconndlgstruct: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_wNetDisconnectDialog1A(lpconndlgstruct?.value?.toCPointer<ByteVar>())

public actual fun wNetDisconnectDialog1W(lpconndlgstruct: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_wNetDisconnectDialog1W(lpconndlgstruct?.value?.toCPointer<ByteVar>())

public actual fun wNetEnumResourceA(henum: Handle, lpccount: COpaquePointer?, lpbuffer: COpaquePointer?, lpbuffersize: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_wNetEnumResourceA(henum?.value?.toCPointer<ByteVar>(), lpccount?.value?.toCPointer<ByteVar>(), lpbuffer?.value?.toCPointer<ByteVar>(), lpbuffersize?.value?.toCPointer<ByteVar>())

public actual fun wNetEnumResourceW(henum: Handle, lpccount: COpaquePointer?, lpbuffer: COpaquePointer?, lpbuffersize: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_wNetEnumResourceW(henum?.value?.toCPointer<ByteVar>(), lpccount?.value?.toCPointer<ByteVar>(), lpbuffer?.value?.toCPointer<ByteVar>(), lpbuffersize?.value?.toCPointer<ByteVar>())

public actual fun wNetGetConnectionA(lplocalname: Pcstr, lpremotename: Pstr, lpnlength: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_wNetGetConnectionA(lplocalname?.value?.toCPointer<ByteVar>(), lpremotename?.value?.toCPointer<ByteVar>(), lpnlength?.value?.toCPointer<ByteVar>())

public actual fun wNetGetConnectionW(lplocalname: Pcwstr, lpremotename: Pwstr, lpnlength: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_wNetGetConnectionW(lplocalname?.value?.toCPointer<ByteVar>(), lpremotename?.value?.toCPointer<ByteVar>(), lpnlength?.value?.toCPointer<ByteVar>())

public actual fun wNetGetLastErrorA(lperror: COpaquePointer?, lperrorbuf: Pstr, nerrorbufsize: UInt, lpnamebuf: Pstr, nnamebufsize: UInt): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_wNetGetLastErrorA(lperror?.value?.toCPointer<ByteVar>(), lperrorbuf?.value?.toCPointer<ByteVar>(), nerrorbufsize, lpnamebuf?.value?.toCPointer<ByteVar>(), nnamebufsize)

public actual fun wNetGetLastErrorW(lperror: COpaquePointer?, lperrorbuf: Pwstr, nerrorbufsize: UInt, lpnamebuf: Pwstr, nnamebufsize: UInt): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_wNetGetLastErrorW(lperror?.value?.toCPointer<ByteVar>(), lperrorbuf?.value?.toCPointer<ByteVar>(), nerrorbufsize, lpnamebuf?.value?.toCPointer<ByteVar>(), nnamebufsize)

public actual fun wNetGetNetworkInformationA(lpprovider: Pcstr, lpnetinfostruct: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_wNetGetNetworkInformationA(lpprovider?.value?.toCPointer<ByteVar>(), lpnetinfostruct?.value?.toCPointer<ByteVar>())

public actual fun wNetGetNetworkInformationW(lpprovider: Pcwstr, lpnetinfostruct: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_wNetGetNetworkInformationW(lpprovider?.value?.toCPointer<ByteVar>(), lpnetinfostruct?.value?.toCPointer<ByteVar>())

public actual fun wNetGetProviderNameA(dwnettype: UInt, lpprovidername: Pstr, lpbuffersize: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_wNetGetProviderNameA(dwnettype, lpprovidername?.value?.toCPointer<ByteVar>(), lpbuffersize?.value?.toCPointer<ByteVar>())

public actual fun wNetGetProviderNameW(dwnettype: UInt, lpprovidername: Pwstr, lpbuffersize: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_wNetGetProviderNameW(dwnettype, lpprovidername?.value?.toCPointer<ByteVar>(), lpbuffersize?.value?.toCPointer<ByteVar>())

public actual fun wNetGetResourceInformationA(lpnetresource: COpaquePointer?, lpbuffer: COpaquePointer?, lpcbbuffer: COpaquePointer?, lplpsystem: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_wNetGetResourceInformationA(lpnetresource?.value?.toCPointer<ByteVar>(), lpbuffer?.value?.toCPointer<ByteVar>(), lpcbbuffer?.value?.toCPointer<ByteVar>(), lplpsystem?.value?.toCPointer<ByteVar>())

public actual fun wNetGetResourceInformationW(lpnetresource: COpaquePointer?, lpbuffer: COpaquePointer?, lpcbbuffer: COpaquePointer?, lplpsystem: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_wNetGetResourceInformationW(lpnetresource?.value?.toCPointer<ByteVar>(), lpbuffer?.value?.toCPointer<ByteVar>(), lpcbbuffer?.value?.toCPointer<ByteVar>(), lplpsystem?.value?.toCPointer<ByteVar>())

public actual fun wNetGetResourceParentA(lpnetresource: COpaquePointer?, lpbuffer: COpaquePointer?, lpcbbuffer: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_wNetGetResourceParentA(lpnetresource?.value?.toCPointer<ByteVar>(), lpbuffer?.value?.toCPointer<ByteVar>(), lpcbbuffer?.value?.toCPointer<ByteVar>())

public actual fun wNetGetResourceParentW(lpnetresource: COpaquePointer?, lpbuffer: COpaquePointer?, lpcbbuffer: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_wNetGetResourceParentW(lpnetresource?.value?.toCPointer<ByteVar>(), lpbuffer?.value?.toCPointer<ByteVar>(), lpcbbuffer?.value?.toCPointer<ByteVar>())

public actual fun wNetGetUniversalNameA(lplocalpath: Pcstr, dwinfolevel: UncInfoLevel, lpbuffer: COpaquePointer?, lpbuffersize: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_wNetGetUniversalNameA(lplocalpath?.value?.toCPointer<ByteVar>(), dwinfolevel, lpbuffer?.value?.toCPointer<ByteVar>(), lpbuffersize?.value?.toCPointer<ByteVar>())

public actual fun wNetGetUniversalNameW(lplocalpath: Pcwstr, dwinfolevel: UncInfoLevel, lpbuffer: COpaquePointer?, lpbuffersize: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_wNetGetUniversalNameW(lplocalpath?.value?.toCPointer<ByteVar>(), dwinfolevel, lpbuffer?.value?.toCPointer<ByteVar>(), lpbuffersize?.value?.toCPointer<ByteVar>())

public actual fun wNetGetUserA(lpname: Pcstr, lpusername: Pstr, lpnlength: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_wNetGetUserA(lpname?.value?.toCPointer<ByteVar>(), lpusername?.value?.toCPointer<ByteVar>(), lpnlength?.value?.toCPointer<ByteVar>())

public actual fun wNetGetUserW(lpname: Pcwstr, lpusername: Pwstr, lpnlength: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_wNetGetUserW(lpname?.value?.toCPointer<ByteVar>(), lpusername?.value?.toCPointer<ByteVar>(), lpnlength?.value?.toCPointer<ByteVar>())

public actual fun wNetOpenEnumA(dwscope: NetResourceScope, dwtype: NetResourceType, dwusage: WnetOpenEnumUsage, lpnetresource: COpaquePointer?, lphenum: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_wNetOpenEnumA(dwscope, dwtype, dwusage, lpnetresource?.value?.toCPointer<ByteVar>(), lphenum?.value?.toCPointer<ByteVar>())

public actual fun wNetOpenEnumW(dwscope: NetResourceScope, dwtype: NetResourceType, dwusage: WnetOpenEnumUsage, lpnetresource: COpaquePointer?, lphenum: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_wNetOpenEnumW(dwscope, dwtype, dwusage, lpnetresource?.value?.toCPointer<ByteVar>(), lphenum?.value?.toCPointer<ByteVar>())

public actual fun wNetSetLastErrorA(err: UInt, lperror: Pcstr, lpproviders: Pcstr) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_wNetSetLastErrorA(err, lperror?.value?.toCPointer<ByteVar>(), lpproviders?.value?.toCPointer<ByteVar>())
}

public actual fun wNetSetLastErrorW(err: UInt, lperror: Pcwstr, lpproviders: Pcwstr) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_wNetSetLastErrorW(err, lperror?.value?.toCPointer<ByteVar>(), lpproviders?.value?.toCPointer<ByteVar>())
}

public actual fun wNetUseConnection4A(hwndowner: Hwnd, lpnetresource: COpaquePointer?, pauthbuffer: COpaquePointer?, cbauthbuffer: UInt, dwflags: UInt, lpuseoptions: COpaquePointer?, cbuseoptions: UInt, lpaccessname: Pstr, lpbuffersize: COpaquePointer?, lpresult: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_wNetUseConnection4A(hwndowner?.value?.toCPointer<ByteVar>(), lpnetresource?.value?.toCPointer<ByteVar>(), pauthbuffer?.value?.toCPointer<ByteVar>(), cbauthbuffer, dwflags, lpuseoptions?.value?.toCPointer<ByteVar>(), cbuseoptions, lpaccessname?.value?.toCPointer<ByteVar>(), lpbuffersize?.value?.toCPointer<ByteVar>(), lpresult?.value?.toCPointer<ByteVar>())

public actual fun wNetUseConnection4W(hwndowner: Hwnd, lpnetresource: COpaquePointer?, pauthbuffer: COpaquePointer?, cbauthbuffer: UInt, dwflags: UInt, lpuseoptions: COpaquePointer?, cbuseoptions: UInt, lpaccessname: Pwstr, lpbuffersize: COpaquePointer?, lpresult: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_wNetUseConnection4W(hwndowner?.value?.toCPointer<ByteVar>(), lpnetresource?.value?.toCPointer<ByteVar>(), pauthbuffer?.value?.toCPointer<ByteVar>(), cbauthbuffer, dwflags, lpuseoptions?.value?.toCPointer<ByteVar>(), cbuseoptions, lpaccessname?.value?.toCPointer<ByteVar>(), lpbuffersize?.value?.toCPointer<ByteVar>(), lpresult?.value?.toCPointer<ByteVar>())

public actual fun wNetUseConnectionA(hwndowner: Hwnd, lpnetresource: COpaquePointer?, lppassword: Pcstr, lpuserid: Pcstr, dwflags: NetConnectFlags, lpaccessname: Pstr, lpbuffersize: COpaquePointer?, lpresult: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_wNetUseConnectionA(hwndowner?.value?.toCPointer<ByteVar>(), lpnetresource?.value?.toCPointer<ByteVar>(), lppassword?.value?.toCPointer<ByteVar>(), lpuserid?.value?.toCPointer<ByteVar>(), dwflags, lpaccessname?.value?.toCPointer<ByteVar>(), lpbuffersize?.value?.toCPointer<ByteVar>(), lpresult?.value?.toCPointer<ByteVar>())

public actual fun wNetUseConnectionW(hwndowner: Hwnd, lpnetresource: COpaquePointer?, lppassword: Pcwstr, lpuserid: Pcwstr, dwflags: NetConnectFlags, lpaccessname: Pwstr, lpbuffersize: COpaquePointer?, lpresult: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_wNetUseConnectionW(hwndowner?.value?.toCPointer<ByteVar>(), lpnetresource?.value?.toCPointer<ByteVar>(), lppassword?.value?.toCPointer<ByteVar>(), lpuserid?.value?.toCPointer<ByteVar>(), dwflags, lpaccessname?.value?.toCPointer<ByteVar>(), lpbuffersize?.value?.toCPointer<ByteVar>(), lpresult?.value?.toCPointer<ByteVar>())
