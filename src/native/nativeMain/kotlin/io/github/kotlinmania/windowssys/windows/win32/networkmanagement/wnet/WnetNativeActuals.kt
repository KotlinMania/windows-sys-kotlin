@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssysWindowsWin32NetworkmanagementWnetMultinetGetConnectionPerformanceA
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssysWindowsWin32NetworkmanagementWnetMultinetGetConnectionPerformanceW
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssysWindowsWin32NetworkmanagementWnetNPAddConnection
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssysWindowsWin32NetworkmanagementWnetNPAddConnection3
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssysWindowsWin32NetworkmanagementWnetNPAddConnection4
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssysWindowsWin32NetworkmanagementWnetNPCancelConnection
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssysWindowsWin32NetworkmanagementWnetNPCancelConnection2
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssysWindowsWin32NetworkmanagementWnetNPCloseEnum
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssysWindowsWin32NetworkmanagementWnetNPEnumResource
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssysWindowsWin32NetworkmanagementWnetNPFormatNetworkName
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssysWindowsWin32NetworkmanagementWnetNPGetCaps
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssysWindowsWin32NetworkmanagementWnetNPGetConnection
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssysWindowsWin32NetworkmanagementWnetNPGetConnection3
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssysWindowsWin32NetworkmanagementWnetNPGetConnectionPerformance
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssysWindowsWin32NetworkmanagementWnetNPGetPersistentUseOptionsForConnection
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssysWindowsWin32NetworkmanagementWnetNPGetResourceInformation
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssysWindowsWin32NetworkmanagementWnetNPGetResourceParent
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssysWindowsWin32NetworkmanagementWnetNPGetUniversalName
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssysWindowsWin32NetworkmanagementWnetNPGetUser
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssysWindowsWin32NetworkmanagementWnetNPOpenEnum
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssysWindowsWin32NetworkmanagementWnetWNetAddConnection2A
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssysWindowsWin32NetworkmanagementWnetWNetAddConnection2W
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssysWindowsWin32NetworkmanagementWnetWNetAddConnection3A
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssysWindowsWin32NetworkmanagementWnetWNetAddConnection3W
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssysWindowsWin32NetworkmanagementWnetWNetAddConnection4A
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssysWindowsWin32NetworkmanagementWnetWNetAddConnection4W
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssysWindowsWin32NetworkmanagementWnetWNetAddConnectionA
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssysWindowsWin32NetworkmanagementWnetWNetAddConnectionW
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssysWindowsWin32NetworkmanagementWnetWNetCancelConnection2A
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssysWindowsWin32NetworkmanagementWnetWNetCancelConnection2W
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssysWindowsWin32NetworkmanagementWnetWNetCancelConnectionA
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssysWindowsWin32NetworkmanagementWnetWNetCancelConnectionW
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssysWindowsWin32NetworkmanagementWnetWNetCloseEnum
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssysWindowsWin32NetworkmanagementWnetWNetConnectionDialog
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssysWindowsWin32NetworkmanagementWnetWNetConnectionDialog1A
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssysWindowsWin32NetworkmanagementWnetWNetConnectionDialog1W
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssysWindowsWin32NetworkmanagementWnetWNetDisconnectDialog
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssysWindowsWin32NetworkmanagementWnetWNetDisconnectDialog1A
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssysWindowsWin32NetworkmanagementWnetWNetDisconnectDialog1W
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssysWindowsWin32NetworkmanagementWnetWNetEnumResourceA
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssysWindowsWin32NetworkmanagementWnetWNetEnumResourceW
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssysWindowsWin32NetworkmanagementWnetWNetGetConnectionA
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssysWindowsWin32NetworkmanagementWnetWNetGetConnectionW
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssysWindowsWin32NetworkmanagementWnetWNetGetLastErrorA
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssysWindowsWin32NetworkmanagementWnetWNetGetLastErrorW
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssysWindowsWin32NetworkmanagementWnetWNetGetNetworkInformationA
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssysWindowsWin32NetworkmanagementWnetWNetGetNetworkInformationW
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssysWindowsWin32NetworkmanagementWnetWNetGetProviderNameA
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssysWindowsWin32NetworkmanagementWnetWNetGetProviderNameW
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssysWindowsWin32NetworkmanagementWnetWNetGetResourceInformationA
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssysWindowsWin32NetworkmanagementWnetWNetGetResourceInformationW
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssysWindowsWin32NetworkmanagementWnetWNetGetResourceParentA
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssysWindowsWin32NetworkmanagementWnetWNetGetResourceParentW
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssysWindowsWin32NetworkmanagementWnetWNetGetUniversalNameA
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssysWindowsWin32NetworkmanagementWnetWNetGetUniversalNameW
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssysWindowsWin32NetworkmanagementWnetWNetGetUserA
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssysWindowsWin32NetworkmanagementWnetWNetGetUserW
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssysWindowsWin32NetworkmanagementWnetWNetOpenEnumA
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssysWindowsWin32NetworkmanagementWnetWNetOpenEnumW
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssysWindowsWin32NetworkmanagementWnetWNetSetLastErrorA
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssysWindowsWin32NetworkmanagementWnetWNetSetLastErrorW
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssysWindowsWin32NetworkmanagementWnetWNetUseConnection4A
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssysWindowsWin32NetworkmanagementWnetWNetUseConnection4W
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssysWindowsWin32NetworkmanagementWnetWNetUseConnectionA
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssysWindowsWin32NetworkmanagementWnetWNetUseConnectionW
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun multinetGetConnectionPerformanceA(lpnetresource: ConstPtr, lpnetconnectinfostruct: MutPtr): UInt =
    windowssysWindowsWin32NetworkmanagementWnetMultinetGetConnectionPerformanceA(lpnetresource.rawAddress.toCPointer<ByteVar>(), lpnetconnectinfostruct.rawAddress.toCPointer<ByteVar>())

public actual fun multinetGetConnectionPerformanceW(lpnetresource: ConstPtr, lpnetconnectinfostruct: MutPtr): UInt =
    windowssysWindowsWin32NetworkmanagementWnetMultinetGetConnectionPerformanceW(lpnetresource.rawAddress.toCPointer<ByteVar>(), lpnetconnectinfostruct.rawAddress.toCPointer<ByteVar>())

public actual fun nPAddConnection(lpnetresource: ConstPtr, lppassword: Pcwstr, lpusername: Pcwstr): UInt =
    windowssysWindowsWin32NetworkmanagementWnetNPAddConnection(lpnetresource.rawAddress.toCPointer<ByteVar>(), lppassword.rawAddress.toCPointer<ByteVar>(), lpusername.rawAddress.toCPointer<ByteVar>())

public actual fun nPAddConnection3(hwndowner: Hwnd, lpnetresource: ConstPtr, lppassword: Pcwstr, lpusername: Pcwstr, dwflags: NetConnectFlags): UInt =
    windowssysWindowsWin32NetworkmanagementWnetNPAddConnection3(hwndowner.rawAddress.toCPointer<ByteVar>(), lpnetresource.rawAddress.toCPointer<ByteVar>(), lppassword.rawAddress.toCPointer<ByteVar>(), lpusername.rawAddress.toCPointer<ByteVar>(), dwflags)

public actual fun nPAddConnection4(hwndowner: Hwnd, lpnetresource: ConstPtr, lpauthbuffer: ConstPtr, cbauthbuffer: UInt, dwflags: UInt, lpuseoptions: ConstPtr, cbuseoptions: UInt): UInt =
    windowssysWindowsWin32NetworkmanagementWnetNPAddConnection4(hwndowner.rawAddress.toCPointer<ByteVar>(), lpnetresource.rawAddress.toCPointer<ByteVar>(), lpauthbuffer.rawAddress.toCPointer<ByteVar>(), cbauthbuffer, dwflags, lpuseoptions.rawAddress.toCPointer<ByteVar>(), cbuseoptions)

public actual fun nPCancelConnection(lpname: Pcwstr, fforce: Bool): UInt =
    windowssysWindowsWin32NetworkmanagementWnetNPCancelConnection(lpname.rawAddress.toCPointer<ByteVar>(), fforce)

public actual fun nPCancelConnection2(lpname: Pcwstr, fforce: Bool, dwflags: UInt): UInt =
    windowssysWindowsWin32NetworkmanagementWnetNPCancelConnection2(lpname.rawAddress.toCPointer<ByteVar>(), fforce, dwflags)

public actual fun nPCloseEnum(henum: Handle): UInt =
    windowssysWindowsWin32NetworkmanagementWnetNPCloseEnum(henum.rawAddress.toCPointer<ByteVar>())

public actual fun nPEnumResource(henum: Handle, lpccount: MutPtr, lpbuffer: MutPtr, lpbuffersize: MutPtr): UInt =
    windowssysWindowsWin32NetworkmanagementWnetNPEnumResource(henum.rawAddress.toCPointer<ByteVar>(), lpccount.rawAddress.toCPointer<ByteVar>(), lpbuffer.rawAddress.toCPointer<ByteVar>(), lpbuffersize.rawAddress.toCPointer<ByteVar>())

public actual fun nPFormatNetworkName(lpremotename: Pcwstr, lpformattedname: Pwstr, lpnlength: MutPtr, dwflags: NetworkNameFormatFlags, dwavecharperline: UInt): UInt =
    windowssysWindowsWin32NetworkmanagementWnetNPFormatNetworkName(lpremotename.rawAddress.toCPointer<ByteVar>(), lpformattedname.rawAddress.toCPointer<ByteVar>(), lpnlength.rawAddress.toCPointer<ByteVar>(), dwflags, dwavecharperline)

public actual fun nPGetCaps(ndex: UInt): UInt =
    windowssysWindowsWin32NetworkmanagementWnetNPGetCaps(ndex)

public actual fun nPGetConnection(lplocalname: Pcwstr, lpremotename: Pwstr, lpnbufferlen: MutPtr): UInt =
    windowssysWindowsWin32NetworkmanagementWnetNPGetConnection(lplocalname.rawAddress.toCPointer<ByteVar>(), lpremotename.rawAddress.toCPointer<ByteVar>(), lpnbufferlen.rawAddress.toCPointer<ByteVar>())

public actual fun nPGetConnection3(lplocalname: Pcwstr, dwlevel: UInt, lpbuffer: MutPtr, lpbuffersize: MutPtr): UInt =
    windowssysWindowsWin32NetworkmanagementWnetNPGetConnection3(lplocalname.rawAddress.toCPointer<ByteVar>(), dwlevel, lpbuffer.rawAddress.toCPointer<ByteVar>(), lpbuffersize.rawAddress.toCPointer<ByteVar>())

public actual fun nPGetConnectionPerformance(lpremotename: Pcwstr, lpnetconnectinfo: MutPtr): UInt =
    windowssysWindowsWin32NetworkmanagementWnetNPGetConnectionPerformance(lpremotename.rawAddress.toCPointer<ByteVar>(), lpnetconnectinfo.rawAddress.toCPointer<ByteVar>())

public actual fun nPGetPersistentUseOptionsForConnection(lpremotepath: Pcwstr, lpreaduseoptions: ConstPtr, cbreaduseoptions: UInt, lpwriteuseoptions: MutPtr, lpsizewriteuseoptions: MutPtr): UInt =
    windowssysWindowsWin32NetworkmanagementWnetNPGetPersistentUseOptionsForConnection(lpremotepath.rawAddress.toCPointer<ByteVar>(), lpreaduseoptions.rawAddress.toCPointer<ByteVar>(), cbreaduseoptions, lpwriteuseoptions.rawAddress.toCPointer<ByteVar>(), lpsizewriteuseoptions.rawAddress.toCPointer<ByteVar>())

public actual fun nPGetResourceInformation(lpnetresource: ConstPtr, lpbuffer: MutPtr, lpbuffersize: MutPtr, lplpsystem: MutPtr): UInt =
    windowssysWindowsWin32NetworkmanagementWnetNPGetResourceInformation(lpnetresource.rawAddress.toCPointer<ByteVar>(), lpbuffer.rawAddress.toCPointer<ByteVar>(), lpbuffersize.rawAddress.toCPointer<ByteVar>(), lplpsystem.rawAddress.toCPointer<ByteVar>())

public actual fun nPGetResourceParent(lpnetresource: ConstPtr, lpbuffer: MutPtr, lpbuffersize: MutPtr): UInt =
    windowssysWindowsWin32NetworkmanagementWnetNPGetResourceParent(lpnetresource.rawAddress.toCPointer<ByteVar>(), lpbuffer.rawAddress.toCPointer<ByteVar>(), lpbuffersize.rawAddress.toCPointer<ByteVar>())

public actual fun nPGetUniversalName(lplocalpath: Pcwstr, dwinfolevel: UncInfoLevel, lpbuffer: MutPtr, lpbuffersize: MutPtr): UInt =
    windowssysWindowsWin32NetworkmanagementWnetNPGetUniversalName(lplocalpath.rawAddress.toCPointer<ByteVar>(), dwinfolevel, lpbuffer.rawAddress.toCPointer<ByteVar>(), lpbuffersize.rawAddress.toCPointer<ByteVar>())

public actual fun nPGetUser(lpname: Pcwstr, lpusername: Pwstr, lpnbufferlen: MutPtr): UInt =
    windowssysWindowsWin32NetworkmanagementWnetNPGetUser(lpname.rawAddress.toCPointer<ByteVar>(), lpusername.rawAddress.toCPointer<ByteVar>(), lpnbufferlen.rawAddress.toCPointer<ByteVar>())

public actual fun nPOpenEnum(dwscope: UInt, dwtype: UInt, dwusage: UInt, lpnetresource: ConstPtr, lphenum: MutPtr): UInt =
    windowssysWindowsWin32NetworkmanagementWnetNPOpenEnum(dwscope, dwtype, dwusage, lpnetresource.rawAddress.toCPointer<ByteVar>(), lphenum.rawAddress.toCPointer<ByteVar>())

public actual fun wNetAddConnection2A(lpnetresource: ConstPtr, lppassword: Pcstr, lpusername: Pcstr, dwflags: NetConnectFlags): Win32Error =
    windowssysWindowsWin32NetworkmanagementWnetWNetAddConnection2A(lpnetresource.rawAddress.toCPointer<ByteVar>(), lppassword.rawAddress.toCPointer<ByteVar>(), lpusername.rawAddress.toCPointer<ByteVar>(), dwflags)

public actual fun wNetAddConnection2W(lpnetresource: ConstPtr, lppassword: Pcwstr, lpusername: Pcwstr, dwflags: NetConnectFlags): Win32Error =
    windowssysWindowsWin32NetworkmanagementWnetWNetAddConnection2W(lpnetresource.rawAddress.toCPointer<ByteVar>(), lppassword.rawAddress.toCPointer<ByteVar>(), lpusername.rawAddress.toCPointer<ByteVar>(), dwflags)

public actual fun wNetAddConnection3A(hwndowner: Hwnd, lpnetresource: ConstPtr, lppassword: Pcstr, lpusername: Pcstr, dwflags: NetConnectFlags): Win32Error =
    windowssysWindowsWin32NetworkmanagementWnetWNetAddConnection3A(hwndowner.rawAddress.toCPointer<ByteVar>(), lpnetresource.rawAddress.toCPointer<ByteVar>(), lppassword.rawAddress.toCPointer<ByteVar>(), lpusername.rawAddress.toCPointer<ByteVar>(), dwflags)

public actual fun wNetAddConnection3W(hwndowner: Hwnd, lpnetresource: ConstPtr, lppassword: Pcwstr, lpusername: Pcwstr, dwflags: NetConnectFlags): Win32Error =
    windowssysWindowsWin32NetworkmanagementWnetWNetAddConnection3W(hwndowner.rawAddress.toCPointer<ByteVar>(), lpnetresource.rawAddress.toCPointer<ByteVar>(), lppassword.rawAddress.toCPointer<ByteVar>(), lpusername.rawAddress.toCPointer<ByteVar>(), dwflags)

public actual fun wNetAddConnection4A(hwndowner: Hwnd, lpnetresource: ConstPtr, pauthbuffer: ConstPtr, cbauthbuffer: UInt, dwflags: NetConnectFlags, lpuseoptions: ConstPtr, cbuseoptions: UInt): Win32Error =
    windowssysWindowsWin32NetworkmanagementWnetWNetAddConnection4A(hwndowner.rawAddress.toCPointer<ByteVar>(), lpnetresource.rawAddress.toCPointer<ByteVar>(), pauthbuffer.rawAddress.toCPointer<ByteVar>(), cbauthbuffer, dwflags, lpuseoptions.rawAddress.toCPointer<ByteVar>(), cbuseoptions)

public actual fun wNetAddConnection4W(hwndowner: Hwnd, lpnetresource: ConstPtr, pauthbuffer: ConstPtr, cbauthbuffer: UInt, dwflags: NetConnectFlags, lpuseoptions: ConstPtr, cbuseoptions: UInt): Win32Error =
    windowssysWindowsWin32NetworkmanagementWnetWNetAddConnection4W(hwndowner.rawAddress.toCPointer<ByteVar>(), lpnetresource.rawAddress.toCPointer<ByteVar>(), pauthbuffer.rawAddress.toCPointer<ByteVar>(), cbauthbuffer, dwflags, lpuseoptions.rawAddress.toCPointer<ByteVar>(), cbuseoptions)

public actual fun wNetAddConnectionA(lpremotename: Pcstr, lppassword: Pcstr, lplocalname: Pcstr): Win32Error =
    windowssysWindowsWin32NetworkmanagementWnetWNetAddConnectionA(lpremotename.rawAddress.toCPointer<ByteVar>(), lppassword.rawAddress.toCPointer<ByteVar>(), lplocalname.rawAddress.toCPointer<ByteVar>())

public actual fun wNetAddConnectionW(lpremotename: Pcwstr, lppassword: Pcwstr, lplocalname: Pcwstr): Win32Error =
    windowssysWindowsWin32NetworkmanagementWnetWNetAddConnectionW(lpremotename.rawAddress.toCPointer<ByteVar>(), lppassword.rawAddress.toCPointer<ByteVar>(), lplocalname.rawAddress.toCPointer<ByteVar>())

public actual fun wNetCancelConnection2A(lpname: Pcstr, dwflags: NetConnectFlags, fforce: Bool): Win32Error =
    windowssysWindowsWin32NetworkmanagementWnetWNetCancelConnection2A(lpname.rawAddress.toCPointer<ByteVar>(), dwflags, fforce)

public actual fun wNetCancelConnection2W(lpname: Pcwstr, dwflags: NetConnectFlags, fforce: Bool): Win32Error =
    windowssysWindowsWin32NetworkmanagementWnetWNetCancelConnection2W(lpname.rawAddress.toCPointer<ByteVar>(), dwflags, fforce)

public actual fun wNetCancelConnectionA(lpname: Pcstr, fforce: Bool): Win32Error =
    windowssysWindowsWin32NetworkmanagementWnetWNetCancelConnectionA(lpname.rawAddress.toCPointer<ByteVar>(), fforce)

public actual fun wNetCancelConnectionW(lpname: Pcwstr, fforce: Bool): Win32Error =
    windowssysWindowsWin32NetworkmanagementWnetWNetCancelConnectionW(lpname.rawAddress.toCPointer<ByteVar>(), fforce)

public actual fun wNetCloseEnum(henum: Handle): Win32Error =
    windowssysWindowsWin32NetworkmanagementWnetWNetCloseEnum(henum.rawAddress.toCPointer<ByteVar>())

public actual fun wNetConnectionDialog(hwnd: Hwnd, dwtype: UInt): Win32Error =
    windowssysWindowsWin32NetworkmanagementWnetWNetConnectionDialog(hwnd.rawAddress.toCPointer<ByteVar>(), dwtype)

public actual fun wNetConnectionDialog1A(lpconndlgstruct: MutPtr): Win32Error =
    windowssysWindowsWin32NetworkmanagementWnetWNetConnectionDialog1A(lpconndlgstruct.rawAddress.toCPointer<ByteVar>())

public actual fun wNetConnectionDialog1W(lpconndlgstruct: MutPtr): Win32Error =
    windowssysWindowsWin32NetworkmanagementWnetWNetConnectionDialog1W(lpconndlgstruct.rawAddress.toCPointer<ByteVar>())

public actual fun wNetDisconnectDialog(hwnd: Hwnd, dwtype: UInt): Win32Error =
    windowssysWindowsWin32NetworkmanagementWnetWNetDisconnectDialog(hwnd.rawAddress.toCPointer<ByteVar>(), dwtype)

public actual fun wNetDisconnectDialog1A(lpconndlgstruct: ConstPtr): Win32Error =
    windowssysWindowsWin32NetworkmanagementWnetWNetDisconnectDialog1A(lpconndlgstruct.rawAddress.toCPointer<ByteVar>())

public actual fun wNetDisconnectDialog1W(lpconndlgstruct: ConstPtr): Win32Error =
    windowssysWindowsWin32NetworkmanagementWnetWNetDisconnectDialog1W(lpconndlgstruct.rawAddress.toCPointer<ByteVar>())

public actual fun wNetEnumResourceA(henum: Handle, lpccount: MutPtr, lpbuffer: MutPtr, lpbuffersize: MutPtr): Win32Error =
    windowssysWindowsWin32NetworkmanagementWnetWNetEnumResourceA(henum.rawAddress.toCPointer<ByteVar>(), lpccount.rawAddress.toCPointer<ByteVar>(), lpbuffer.rawAddress.toCPointer<ByteVar>(), lpbuffersize.rawAddress.toCPointer<ByteVar>())

public actual fun wNetEnumResourceW(henum: Handle, lpccount: MutPtr, lpbuffer: MutPtr, lpbuffersize: MutPtr): Win32Error =
    windowssysWindowsWin32NetworkmanagementWnetWNetEnumResourceW(henum.rawAddress.toCPointer<ByteVar>(), lpccount.rawAddress.toCPointer<ByteVar>(), lpbuffer.rawAddress.toCPointer<ByteVar>(), lpbuffersize.rawAddress.toCPointer<ByteVar>())

public actual fun wNetGetConnectionA(lplocalname: Pcstr, lpremotename: Pstr, lpnlength: MutPtr): Win32Error =
    windowssysWindowsWin32NetworkmanagementWnetWNetGetConnectionA(lplocalname.rawAddress.toCPointer<ByteVar>(), lpremotename.rawAddress.toCPointer<ByteVar>(), lpnlength.rawAddress.toCPointer<ByteVar>())

public actual fun wNetGetConnectionW(lplocalname: Pcwstr, lpremotename: Pwstr, lpnlength: MutPtr): Win32Error =
    windowssysWindowsWin32NetworkmanagementWnetWNetGetConnectionW(lplocalname.rawAddress.toCPointer<ByteVar>(), lpremotename.rawAddress.toCPointer<ByteVar>(), lpnlength.rawAddress.toCPointer<ByteVar>())

public actual fun wNetGetLastErrorA(lperror: MutPtr, lperrorbuf: Pstr, nerrorbufsize: UInt, lpnamebuf: Pstr, nnamebufsize: UInt): Win32Error =
    windowssysWindowsWin32NetworkmanagementWnetWNetGetLastErrorA(lperror.rawAddress.toCPointer<ByteVar>(), lperrorbuf.rawAddress.toCPointer<ByteVar>(), nerrorbufsize, lpnamebuf.rawAddress.toCPointer<ByteVar>(), nnamebufsize)

public actual fun wNetGetLastErrorW(lperror: MutPtr, lperrorbuf: Pwstr, nerrorbufsize: UInt, lpnamebuf: Pwstr, nnamebufsize: UInt): Win32Error =
    windowssysWindowsWin32NetworkmanagementWnetWNetGetLastErrorW(lperror.rawAddress.toCPointer<ByteVar>(), lperrorbuf.rawAddress.toCPointer<ByteVar>(), nerrorbufsize, lpnamebuf.rawAddress.toCPointer<ByteVar>(), nnamebufsize)

public actual fun wNetGetNetworkInformationA(lpprovider: Pcstr, lpnetinfostruct: MutPtr): Win32Error =
    windowssysWindowsWin32NetworkmanagementWnetWNetGetNetworkInformationA(lpprovider.rawAddress.toCPointer<ByteVar>(), lpnetinfostruct.rawAddress.toCPointer<ByteVar>())

public actual fun wNetGetNetworkInformationW(lpprovider: Pcwstr, lpnetinfostruct: MutPtr): Win32Error =
    windowssysWindowsWin32NetworkmanagementWnetWNetGetNetworkInformationW(lpprovider.rawAddress.toCPointer<ByteVar>(), lpnetinfostruct.rawAddress.toCPointer<ByteVar>())

public actual fun wNetGetProviderNameA(dwnettype: UInt, lpprovidername: Pstr, lpbuffersize: MutPtr): Win32Error =
    windowssysWindowsWin32NetworkmanagementWnetWNetGetProviderNameA(dwnettype, lpprovidername.rawAddress.toCPointer<ByteVar>(), lpbuffersize.rawAddress.toCPointer<ByteVar>())

public actual fun wNetGetProviderNameW(dwnettype: UInt, lpprovidername: Pwstr, lpbuffersize: MutPtr): Win32Error =
    windowssysWindowsWin32NetworkmanagementWnetWNetGetProviderNameW(dwnettype, lpprovidername.rawAddress.toCPointer<ByteVar>(), lpbuffersize.rawAddress.toCPointer<ByteVar>())

public actual fun wNetGetResourceInformationA(lpnetresource: ConstPtr, lpbuffer: MutPtr, lpcbbuffer: MutPtr, lplpsystem: MutPtr): Win32Error =
    windowssysWindowsWin32NetworkmanagementWnetWNetGetResourceInformationA(lpnetresource.rawAddress.toCPointer<ByteVar>(), lpbuffer.rawAddress.toCPointer<ByteVar>(), lpcbbuffer.rawAddress.toCPointer<ByteVar>(), lplpsystem.rawAddress.toCPointer<ByteVar>())

public actual fun wNetGetResourceInformationW(lpnetresource: ConstPtr, lpbuffer: MutPtr, lpcbbuffer: MutPtr, lplpsystem: MutPtr): Win32Error =
    windowssysWindowsWin32NetworkmanagementWnetWNetGetResourceInformationW(lpnetresource.rawAddress.toCPointer<ByteVar>(), lpbuffer.rawAddress.toCPointer<ByteVar>(), lpcbbuffer.rawAddress.toCPointer<ByteVar>(), lplpsystem.rawAddress.toCPointer<ByteVar>())

public actual fun wNetGetResourceParentA(lpnetresource: ConstPtr, lpbuffer: MutPtr, lpcbbuffer: MutPtr): Win32Error =
    windowssysWindowsWin32NetworkmanagementWnetWNetGetResourceParentA(lpnetresource.rawAddress.toCPointer<ByteVar>(), lpbuffer.rawAddress.toCPointer<ByteVar>(), lpcbbuffer.rawAddress.toCPointer<ByteVar>())

public actual fun wNetGetResourceParentW(lpnetresource: ConstPtr, lpbuffer: MutPtr, lpcbbuffer: MutPtr): Win32Error =
    windowssysWindowsWin32NetworkmanagementWnetWNetGetResourceParentW(lpnetresource.rawAddress.toCPointer<ByteVar>(), lpbuffer.rawAddress.toCPointer<ByteVar>(), lpcbbuffer.rawAddress.toCPointer<ByteVar>())

public actual fun wNetGetUniversalNameA(lplocalpath: Pcstr, dwinfolevel: UncInfoLevel, lpbuffer: MutPtr, lpbuffersize: MutPtr): Win32Error =
    windowssysWindowsWin32NetworkmanagementWnetWNetGetUniversalNameA(lplocalpath.rawAddress.toCPointer<ByteVar>(), dwinfolevel, lpbuffer.rawAddress.toCPointer<ByteVar>(), lpbuffersize.rawAddress.toCPointer<ByteVar>())

public actual fun wNetGetUniversalNameW(lplocalpath: Pcwstr, dwinfolevel: UncInfoLevel, lpbuffer: MutPtr, lpbuffersize: MutPtr): Win32Error =
    windowssysWindowsWin32NetworkmanagementWnetWNetGetUniversalNameW(lplocalpath.rawAddress.toCPointer<ByteVar>(), dwinfolevel, lpbuffer.rawAddress.toCPointer<ByteVar>(), lpbuffersize.rawAddress.toCPointer<ByteVar>())

public actual fun wNetGetUserA(lpname: Pcstr, lpusername: Pstr, lpnlength: MutPtr): Win32Error =
    windowssysWindowsWin32NetworkmanagementWnetWNetGetUserA(lpname.rawAddress.toCPointer<ByteVar>(), lpusername.rawAddress.toCPointer<ByteVar>(), lpnlength.rawAddress.toCPointer<ByteVar>())

public actual fun wNetGetUserW(lpname: Pcwstr, lpusername: Pwstr, lpnlength: MutPtr): Win32Error =
    windowssysWindowsWin32NetworkmanagementWnetWNetGetUserW(lpname.rawAddress.toCPointer<ByteVar>(), lpusername.rawAddress.toCPointer<ByteVar>(), lpnlength.rawAddress.toCPointer<ByteVar>())

public actual fun wNetOpenEnumA(dwscope: NetResourceScope, dwtype: NetResourceType, dwusage: WnetOpenEnumUsage, lpnetresource: ConstPtr, lphenum: MutPtr): Win32Error =
    windowssysWindowsWin32NetworkmanagementWnetWNetOpenEnumA(dwscope, dwtype, dwusage, lpnetresource.rawAddress.toCPointer<ByteVar>(), lphenum.rawAddress.toCPointer<ByteVar>())

public actual fun wNetOpenEnumW(dwscope: NetResourceScope, dwtype: NetResourceType, dwusage: WnetOpenEnumUsage, lpnetresource: ConstPtr, lphenum: MutPtr): Win32Error =
    windowssysWindowsWin32NetworkmanagementWnetWNetOpenEnumW(dwscope, dwtype, dwusage, lpnetresource.rawAddress.toCPointer<ByteVar>(), lphenum.rawAddress.toCPointer<ByteVar>())

public actual fun wNetSetLastErrorA(err: UInt, lperror: Pcstr, lpproviders: Pcstr) {
    windowssysWindowsWin32NetworkmanagementWnetWNetSetLastErrorA(err, lperror.rawAddress.toCPointer<ByteVar>(), lpproviders.rawAddress.toCPointer<ByteVar>())
}

public actual fun wNetSetLastErrorW(err: UInt, lperror: Pcwstr, lpproviders: Pcwstr) {
    windowssysWindowsWin32NetworkmanagementWnetWNetSetLastErrorW(err, lperror.rawAddress.toCPointer<ByteVar>(), lpproviders.rawAddress.toCPointer<ByteVar>())
}

public actual fun wNetUseConnection4A(hwndowner: Hwnd, lpnetresource: ConstPtr, pauthbuffer: ConstPtr, cbauthbuffer: UInt, dwflags: UInt, lpuseoptions: ConstPtr, cbuseoptions: UInt, lpaccessname: Pstr, lpbuffersize: MutPtr, lpresult: MutPtr): Win32Error =
    windowssysWindowsWin32NetworkmanagementWnetWNetUseConnection4A(hwndowner.rawAddress.toCPointer<ByteVar>(), lpnetresource.rawAddress.toCPointer<ByteVar>(), pauthbuffer.rawAddress.toCPointer<ByteVar>(), cbauthbuffer, dwflags, lpuseoptions.rawAddress.toCPointer<ByteVar>(), cbuseoptions, lpaccessname.rawAddress.toCPointer<ByteVar>(), lpbuffersize.rawAddress.toCPointer<ByteVar>(), lpresult.rawAddress.toCPointer<ByteVar>())

public actual fun wNetUseConnection4W(hwndowner: Hwnd, lpnetresource: ConstPtr, pauthbuffer: ConstPtr, cbauthbuffer: UInt, dwflags: UInt, lpuseoptions: ConstPtr, cbuseoptions: UInt, lpaccessname: Pwstr, lpbuffersize: MutPtr, lpresult: MutPtr): Win32Error =
    windowssysWindowsWin32NetworkmanagementWnetWNetUseConnection4W(hwndowner.rawAddress.toCPointer<ByteVar>(), lpnetresource.rawAddress.toCPointer<ByteVar>(), pauthbuffer.rawAddress.toCPointer<ByteVar>(), cbauthbuffer, dwflags, lpuseoptions.rawAddress.toCPointer<ByteVar>(), cbuseoptions, lpaccessname.rawAddress.toCPointer<ByteVar>(), lpbuffersize.rawAddress.toCPointer<ByteVar>(), lpresult.rawAddress.toCPointer<ByteVar>())

public actual fun wNetUseConnectionA(hwndowner: Hwnd, lpnetresource: ConstPtr, lppassword: Pcstr, lpuserid: Pcstr, dwflags: NetConnectFlags, lpaccessname: Pstr, lpbuffersize: MutPtr, lpresult: MutPtr): Win32Error =
    windowssysWindowsWin32NetworkmanagementWnetWNetUseConnectionA(hwndowner.rawAddress.toCPointer<ByteVar>(), lpnetresource.rawAddress.toCPointer<ByteVar>(), lppassword.rawAddress.toCPointer<ByteVar>(), lpuserid.rawAddress.toCPointer<ByteVar>(), dwflags, lpaccessname.rawAddress.toCPointer<ByteVar>(), lpbuffersize.rawAddress.toCPointer<ByteVar>(), lpresult.rawAddress.toCPointer<ByteVar>())

public actual fun wNetUseConnectionW(hwndowner: Hwnd, lpnetresource: ConstPtr, lppassword: Pcwstr, lpuserid: Pcwstr, dwflags: NetConnectFlags, lpaccessname: Pwstr, lpbuffersize: MutPtr, lpresult: MutPtr): Win32Error =
    windowssysWindowsWin32NetworkmanagementWnetWNetUseConnectionW(hwndowner.rawAddress.toCPointer<ByteVar>(), lpnetresource.rawAddress.toCPointer<ByteVar>(), lppassword.rawAddress.toCPointer<ByteVar>(), lpuserid.rawAddress.toCPointer<ByteVar>(), dwflags, lpaccessname.rawAddress.toCPointer<ByteVar>(), lpbuffersize.rawAddress.toCPointer<ByteVar>(), lpresult.rawAddress.toCPointer<ByteVar>())
