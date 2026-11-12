@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

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

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun multinetGetConnectionPerformanceA(lpnetresource: ConstPtr, lpnetconnectinfostruct: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWnetMultinetGetConnectionPerformanceA")

public actual fun multinetGetConnectionPerformanceW(lpnetresource: ConstPtr, lpnetconnectinfostruct: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWnetMultinetGetConnectionPerformanceW")

public actual fun nPAddConnection(lpnetresource: ConstPtr, lppassword: Pcwstr, lpusername: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWnetNPAddConnection")

public actual fun nPAddConnection3(hwndowner: Hwnd, lpnetresource: ConstPtr, lppassword: Pcwstr, lpusername: Pcwstr, dwflags: NetConnectFlags): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWnetNPAddConnection3")

public actual fun nPAddConnection4(hwndowner: Hwnd, lpnetresource: ConstPtr, lpauthbuffer: ConstPtr, cbauthbuffer: UInt, dwflags: UInt, lpuseoptions: ConstPtr, cbuseoptions: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWnetNPAddConnection4")

public actual fun nPCancelConnection(lpname: Pcwstr, fforce: Bool): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWnetNPCancelConnection")

public actual fun nPCancelConnection2(lpname: Pcwstr, fforce: Bool, dwflags: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWnetNPCancelConnection2")

public actual fun nPCloseEnum(henum: Handle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWnetNPCloseEnum")

public actual fun nPEnumResource(henum: Handle, lpccount: MutPtr, lpbuffer: MutPtr, lpbuffersize: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWnetNPEnumResource")

public actual fun nPFormatNetworkName(lpremotename: Pcwstr, lpformattedname: Pwstr, lpnlength: MutPtr, dwflags: NetworkNameFormatFlags, dwavecharperline: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWnetNPFormatNetworkName")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementWnetNPGetCaps")
private external fun wasiWindowssysWindowsWin32NetworkmanagementWnetNPGetCaps(ndex: Int): Int

public actual fun nPGetCaps(ndex: UInt): UInt =
    wasiWindowssysWindowsWin32NetworkmanagementWnetNPGetCaps(ndex.toInt()).toUInt()

public actual fun nPGetConnection(lplocalname: Pcwstr, lpremotename: Pwstr, lpnbufferlen: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWnetNPGetConnection")

public actual fun nPGetConnection3(lplocalname: Pcwstr, dwlevel: UInt, lpbuffer: MutPtr, lpbuffersize: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWnetNPGetConnection3")

public actual fun nPGetConnectionPerformance(lpremotename: Pcwstr, lpnetconnectinfo: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWnetNPGetConnectionPerformance")

public actual fun nPGetPersistentUseOptionsForConnection(lpremotepath: Pcwstr, lpreaduseoptions: ConstPtr, cbreaduseoptions: UInt, lpwriteuseoptions: MutPtr, lpsizewriteuseoptions: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWnetNPGetPersistentUseOptionsForConnection")

public actual fun nPGetResourceInformation(lpnetresource: ConstPtr, lpbuffer: MutPtr, lpbuffersize: MutPtr, lplpsystem: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWnetNPGetResourceInformation")

public actual fun nPGetResourceParent(lpnetresource: ConstPtr, lpbuffer: MutPtr, lpbuffersize: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWnetNPGetResourceParent")

public actual fun nPGetUniversalName(lplocalpath: Pcwstr, dwinfolevel: UncInfoLevel, lpbuffer: MutPtr, lpbuffersize: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWnetNPGetUniversalName")

public actual fun nPGetUser(lpname: Pcwstr, lpusername: Pwstr, lpnbufferlen: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWnetNPGetUser")

public actual fun nPOpenEnum(dwscope: UInt, dwtype: UInt, dwusage: UInt, lpnetresource: ConstPtr, lphenum: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWnetNPOpenEnum")

public actual fun wNetAddConnection2A(lpnetresource: ConstPtr, lppassword: Pcstr, lpusername: Pcstr, dwflags: NetConnectFlags): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWnetWNetAddConnection2A")

public actual fun wNetAddConnection2W(lpnetresource: ConstPtr, lppassword: Pcwstr, lpusername: Pcwstr, dwflags: NetConnectFlags): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWnetWNetAddConnection2W")

public actual fun wNetAddConnection3A(hwndowner: Hwnd, lpnetresource: ConstPtr, lppassword: Pcstr, lpusername: Pcstr, dwflags: NetConnectFlags): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWnetWNetAddConnection3A")

public actual fun wNetAddConnection3W(hwndowner: Hwnd, lpnetresource: ConstPtr, lppassword: Pcwstr, lpusername: Pcwstr, dwflags: NetConnectFlags): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWnetWNetAddConnection3W")

public actual fun wNetAddConnection4A(hwndowner: Hwnd, lpnetresource: ConstPtr, pauthbuffer: ConstPtr, cbauthbuffer: UInt, dwflags: NetConnectFlags, lpuseoptions: ConstPtr, cbuseoptions: UInt): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWnetWNetAddConnection4A")

public actual fun wNetAddConnection4W(hwndowner: Hwnd, lpnetresource: ConstPtr, pauthbuffer: ConstPtr, cbauthbuffer: UInt, dwflags: NetConnectFlags, lpuseoptions: ConstPtr, cbuseoptions: UInt): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWnetWNetAddConnection4W")

public actual fun wNetAddConnectionA(lpremotename: Pcstr, lppassword: Pcstr, lplocalname: Pcstr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWnetWNetAddConnectionA")

public actual fun wNetAddConnectionW(lpremotename: Pcwstr, lppassword: Pcwstr, lplocalname: Pcwstr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWnetWNetAddConnectionW")

public actual fun wNetCancelConnection2A(lpname: Pcstr, dwflags: NetConnectFlags, fforce: Bool): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWnetWNetCancelConnection2A")

public actual fun wNetCancelConnection2W(lpname: Pcwstr, dwflags: NetConnectFlags, fforce: Bool): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWnetWNetCancelConnection2W")

public actual fun wNetCancelConnectionA(lpname: Pcstr, fforce: Bool): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWnetWNetCancelConnectionA")

public actual fun wNetCancelConnectionW(lpname: Pcwstr, fforce: Bool): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWnetWNetCancelConnectionW")

public actual fun wNetCloseEnum(henum: Handle): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWnetWNetCloseEnum")

public actual fun wNetConnectionDialog(hwnd: Hwnd, dwtype: UInt): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWnetWNetConnectionDialog")

public actual fun wNetConnectionDialog1A(lpconndlgstruct: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWnetWNetConnectionDialog1A")

public actual fun wNetConnectionDialog1W(lpconndlgstruct: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWnetWNetConnectionDialog1W")

public actual fun wNetDisconnectDialog(hwnd: Hwnd, dwtype: UInt): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWnetWNetDisconnectDialog")

public actual fun wNetDisconnectDialog1A(lpconndlgstruct: ConstPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWnetWNetDisconnectDialog1A")

public actual fun wNetDisconnectDialog1W(lpconndlgstruct: ConstPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWnetWNetDisconnectDialog1W")

public actual fun wNetEnumResourceA(henum: Handle, lpccount: MutPtr, lpbuffer: MutPtr, lpbuffersize: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWnetWNetEnumResourceA")

public actual fun wNetEnumResourceW(henum: Handle, lpccount: MutPtr, lpbuffer: MutPtr, lpbuffersize: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWnetWNetEnumResourceW")

public actual fun wNetGetConnectionA(lplocalname: Pcstr, lpremotename: Pstr, lpnlength: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWnetWNetGetConnectionA")

public actual fun wNetGetConnectionW(lplocalname: Pcwstr, lpremotename: Pwstr, lpnlength: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWnetWNetGetConnectionW")

public actual fun wNetGetLastErrorA(lperror: MutPtr, lperrorbuf: Pstr, nerrorbufsize: UInt, lpnamebuf: Pstr, nnamebufsize: UInt): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWnetWNetGetLastErrorA")

public actual fun wNetGetLastErrorW(lperror: MutPtr, lperrorbuf: Pwstr, nerrorbufsize: UInt, lpnamebuf: Pwstr, nnamebufsize: UInt): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWnetWNetGetLastErrorW")

public actual fun wNetGetNetworkInformationA(lpprovider: Pcstr, lpnetinfostruct: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWnetWNetGetNetworkInformationA")

public actual fun wNetGetNetworkInformationW(lpprovider: Pcwstr, lpnetinfostruct: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWnetWNetGetNetworkInformationW")

public actual fun wNetGetProviderNameA(dwnettype: UInt, lpprovidername: Pstr, lpbuffersize: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWnetWNetGetProviderNameA")

public actual fun wNetGetProviderNameW(dwnettype: UInt, lpprovidername: Pwstr, lpbuffersize: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWnetWNetGetProviderNameW")

public actual fun wNetGetResourceInformationA(lpnetresource: ConstPtr, lpbuffer: MutPtr, lpcbbuffer: MutPtr, lplpsystem: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWnetWNetGetResourceInformationA")

public actual fun wNetGetResourceInformationW(lpnetresource: ConstPtr, lpbuffer: MutPtr, lpcbbuffer: MutPtr, lplpsystem: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWnetWNetGetResourceInformationW")

public actual fun wNetGetResourceParentA(lpnetresource: ConstPtr, lpbuffer: MutPtr, lpcbbuffer: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWnetWNetGetResourceParentA")

public actual fun wNetGetResourceParentW(lpnetresource: ConstPtr, lpbuffer: MutPtr, lpcbbuffer: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWnetWNetGetResourceParentW")

public actual fun wNetGetUniversalNameA(lplocalpath: Pcstr, dwinfolevel: UncInfoLevel, lpbuffer: MutPtr, lpbuffersize: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWnetWNetGetUniversalNameA")

public actual fun wNetGetUniversalNameW(lplocalpath: Pcwstr, dwinfolevel: UncInfoLevel, lpbuffer: MutPtr, lpbuffersize: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWnetWNetGetUniversalNameW")

public actual fun wNetGetUserA(lpname: Pcstr, lpusername: Pstr, lpnlength: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWnetWNetGetUserA")

public actual fun wNetGetUserW(lpname: Pcwstr, lpusername: Pwstr, lpnlength: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWnetWNetGetUserW")

public actual fun wNetOpenEnumA(dwscope: NetResourceScope, dwtype: NetResourceType, dwusage: WnetOpenEnumUsage, lpnetresource: ConstPtr, lphenum: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWnetWNetOpenEnumA")

public actual fun wNetOpenEnumW(dwscope: NetResourceScope, dwtype: NetResourceType, dwusage: WnetOpenEnumUsage, lpnetresource: ConstPtr, lphenum: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWnetWNetOpenEnumW")

public actual fun wNetSetLastErrorA(err: UInt, lperror: Pcstr, lpproviders: Pcstr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWnetWNetSetLastErrorA")

public actual fun wNetSetLastErrorW(err: UInt, lperror: Pcwstr, lpproviders: Pcwstr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWnetWNetSetLastErrorW")

public actual fun wNetUseConnection4A(hwndowner: Hwnd, lpnetresource: ConstPtr, pauthbuffer: ConstPtr, cbauthbuffer: UInt, dwflags: UInt, lpuseoptions: ConstPtr, cbuseoptions: UInt, lpaccessname: Pstr, lpbuffersize: MutPtr, lpresult: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWnetWNetUseConnection4A")

public actual fun wNetUseConnection4W(hwndowner: Hwnd, lpnetresource: ConstPtr, pauthbuffer: ConstPtr, cbauthbuffer: UInt, dwflags: UInt, lpuseoptions: ConstPtr, cbuseoptions: UInt, lpaccessname: Pwstr, lpbuffersize: MutPtr, lpresult: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWnetWNetUseConnection4W")

public actual fun wNetUseConnectionA(hwndowner: Hwnd, lpnetresource: ConstPtr, lppassword: Pcstr, lpuserid: Pcstr, dwflags: NetConnectFlags, lpaccessname: Pstr, lpbuffersize: MutPtr, lpresult: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWnetWNetUseConnectionA")

public actual fun wNetUseConnectionW(hwndowner: Hwnd, lpnetresource: ConstPtr, lppassword: Pcwstr, lpuserid: Pcwstr, dwflags: NetConnectFlags, lpaccessname: Pwstr, lpbuffersize: MutPtr, lpresult: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementWnetWNetUseConnectionW")
