@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

public actual fun multinetGetConnectionPerformanceA(lpnetresource: COpaquePointer?, lpnetconnectinfostruct: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun multinetGetConnectionPerformanceW(lpnetresource: COpaquePointer?, lpnetconnectinfostruct: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nPAddConnection(lpnetresource: COpaquePointer?, lppassword: Pcwstr, lpusername: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nPAddConnection3(hwndowner: Hwnd, lpnetresource: COpaquePointer?, lppassword: Pcwstr, lpusername: Pcwstr, dwflags: NetConnectFlags): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nPAddConnection4(hwndowner: Hwnd, lpnetresource: COpaquePointer?, lpauthbuffer: COpaquePointer?, cbauthbuffer: UInt, dwflags: UInt, lpuseoptions: COpaquePointer?, cbuseoptions: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nPCancelConnection(lpname: Pcwstr, fforce: Bool): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nPCancelConnection2(lpname: Pcwstr, fforce: Bool, dwflags: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nPCloseEnum(henum: Handle): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nPEnumResource(henum: Handle, lpccount: COpaquePointer?, lpbuffer: COpaquePointer?, lpbuffersize: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nPFormatNetworkName(lpremotename: Pcwstr, lpformattedname: Pwstr, lpnlength: COpaquePointer?, dwflags: NetworkNameFormatFlags, dwavecharperline: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nPGetCaps(ndex: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nPGetConnection(lplocalname: Pcwstr, lpremotename: Pwstr, lpnbufferlen: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nPGetConnection3(lplocalname: Pcwstr, dwlevel: UInt, lpbuffer: COpaquePointer?, lpbuffersize: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nPGetConnectionPerformance(lpremotename: Pcwstr, lpnetconnectinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nPGetPersistentUseOptionsForConnection(lpremotepath: Pcwstr, lpreaduseoptions: COpaquePointer?, cbreaduseoptions: UInt, lpwriteuseoptions: COpaquePointer?, lpsizewriteuseoptions: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nPGetResourceInformation(lpnetresource: COpaquePointer?, lpbuffer: COpaquePointer?, lpbuffersize: COpaquePointer?, lplpsystem: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nPGetResourceParent(lpnetresource: COpaquePointer?, lpbuffer: COpaquePointer?, lpbuffersize: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nPGetUniversalName(lplocalpath: Pcwstr, dwinfolevel: UncInfoLevel, lpbuffer: COpaquePointer?, lpbuffersize: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nPGetUser(lpname: Pcwstr, lpusername: Pwstr, lpnbufferlen: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nPOpenEnum(dwscope: UInt, dwtype: UInt, dwusage: UInt, lpnetresource: COpaquePointer?, lphenum: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wNetAddConnection2A(lpnetresource: COpaquePointer?, lppassword: Pcstr, lpusername: Pcstr, dwflags: NetConnectFlags): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wNetAddConnection2W(lpnetresource: COpaquePointer?, lppassword: Pcwstr, lpusername: Pcwstr, dwflags: NetConnectFlags): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wNetAddConnection3A(hwndowner: Hwnd, lpnetresource: COpaquePointer?, lppassword: Pcstr, lpusername: Pcstr, dwflags: NetConnectFlags): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wNetAddConnection3W(hwndowner: Hwnd, lpnetresource: COpaquePointer?, lppassword: Pcwstr, lpusername: Pcwstr, dwflags: NetConnectFlags): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wNetAddConnection4A(hwndowner: Hwnd, lpnetresource: COpaquePointer?, pauthbuffer: COpaquePointer?, cbauthbuffer: UInt, dwflags: NetConnectFlags, lpuseoptions: COpaquePointer?, cbuseoptions: UInt): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wNetAddConnection4W(hwndowner: Hwnd, lpnetresource: COpaquePointer?, pauthbuffer: COpaquePointer?, cbauthbuffer: UInt, dwflags: NetConnectFlags, lpuseoptions: COpaquePointer?, cbuseoptions: UInt): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wNetAddConnectionA(lpremotename: Pcstr, lppassword: Pcstr, lplocalname: Pcstr): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wNetAddConnectionW(lpremotename: Pcwstr, lppassword: Pcwstr, lplocalname: Pcwstr): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wNetCancelConnection2A(lpname: Pcstr, dwflags: NetConnectFlags, fforce: Bool): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wNetCancelConnection2W(lpname: Pcwstr, dwflags: NetConnectFlags, fforce: Bool): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wNetCancelConnectionA(lpname: Pcstr, fforce: Bool): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wNetCancelConnectionW(lpname: Pcwstr, fforce: Bool): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wNetCloseEnum(henum: Handle): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wNetConnectionDialog(hwnd: Hwnd, dwtype: UInt): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wNetConnectionDialog1A(lpconndlgstruct: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wNetConnectionDialog1W(lpconndlgstruct: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wNetDisconnectDialog(hwnd: Hwnd, dwtype: UInt): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wNetDisconnectDialog1A(lpconndlgstruct: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wNetDisconnectDialog1W(lpconndlgstruct: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wNetEnumResourceA(henum: Handle, lpccount: COpaquePointer?, lpbuffer: COpaquePointer?, lpbuffersize: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wNetEnumResourceW(henum: Handle, lpccount: COpaquePointer?, lpbuffer: COpaquePointer?, lpbuffersize: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wNetGetConnectionA(lplocalname: Pcstr, lpremotename: Pstr, lpnlength: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wNetGetConnectionW(lplocalname: Pcwstr, lpremotename: Pwstr, lpnlength: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wNetGetLastErrorA(lperror: COpaquePointer?, lperrorbuf: Pstr, nerrorbufsize: UInt, lpnamebuf: Pstr, nnamebufsize: UInt): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wNetGetLastErrorW(lperror: COpaquePointer?, lperrorbuf: Pwstr, nerrorbufsize: UInt, lpnamebuf: Pwstr, nnamebufsize: UInt): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wNetGetNetworkInformationA(lpprovider: Pcstr, lpnetinfostruct: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wNetGetNetworkInformationW(lpprovider: Pcwstr, lpnetinfostruct: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wNetGetProviderNameA(dwnettype: UInt, lpprovidername: Pstr, lpbuffersize: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wNetGetProviderNameW(dwnettype: UInt, lpprovidername: Pwstr, lpbuffersize: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wNetGetResourceInformationA(lpnetresource: COpaquePointer?, lpbuffer: COpaquePointer?, lpcbbuffer: COpaquePointer?, lplpsystem: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wNetGetResourceInformationW(lpnetresource: COpaquePointer?, lpbuffer: COpaquePointer?, lpcbbuffer: COpaquePointer?, lplpsystem: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wNetGetResourceParentA(lpnetresource: COpaquePointer?, lpbuffer: COpaquePointer?, lpcbbuffer: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wNetGetResourceParentW(lpnetresource: COpaquePointer?, lpbuffer: COpaquePointer?, lpcbbuffer: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wNetGetUniversalNameA(lplocalpath: Pcstr, dwinfolevel: UncInfoLevel, lpbuffer: COpaquePointer?, lpbuffersize: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wNetGetUniversalNameW(lplocalpath: Pcwstr, dwinfolevel: UncInfoLevel, lpbuffer: COpaquePointer?, lpbuffersize: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wNetGetUserA(lpname: Pcstr, lpusername: Pstr, lpnlength: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wNetGetUserW(lpname: Pcwstr, lpusername: Pwstr, lpnlength: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wNetOpenEnumA(dwscope: NetResourceScope, dwtype: NetResourceType, dwusage: WnetOpenEnumUsage, lpnetresource: COpaquePointer?, lphenum: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wNetOpenEnumW(dwscope: NetResourceScope, dwtype: NetResourceType, dwusage: WnetOpenEnumUsage, lpnetresource: COpaquePointer?, lphenum: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wNetSetLastErrorA(err: UInt, lperror: Pcstr, lpproviders: Pcstr): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wNetSetLastErrorW(err: UInt, lperror: Pcwstr, lpproviders: Pcwstr): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wNetUseConnection4A(hwndowner: Hwnd, lpnetresource: COpaquePointer?, pauthbuffer: COpaquePointer?, cbauthbuffer: UInt, dwflags: UInt, lpuseoptions: COpaquePointer?, cbuseoptions: UInt, lpaccessname: Pstr, lpbuffersize: COpaquePointer?, lpresult: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wNetUseConnection4W(hwndowner: Hwnd, lpnetresource: COpaquePointer?, pauthbuffer: COpaquePointer?, cbauthbuffer: UInt, dwflags: UInt, lpuseoptions: COpaquePointer?, cbuseoptions: UInt, lpaccessname: Pwstr, lpbuffersize: COpaquePointer?, lpresult: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wNetUseConnectionA(hwndowner: Hwnd, lpnetresource: COpaquePointer?, lppassword: Pcstr, lpuserid: Pcstr, dwflags: NetConnectFlags, lpaccessname: Pstr, lpbuffersize: COpaquePointer?, lpresult: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wNetUseConnectionW(hwndowner: Hwnd, lpnetresource: COpaquePointer?, lppassword: Pcwstr, lpuserid: Pcwstr, dwflags: NetConnectFlags, lpaccessname: Pwstr, lpbuffersize: COpaquePointer?, lpresult: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
