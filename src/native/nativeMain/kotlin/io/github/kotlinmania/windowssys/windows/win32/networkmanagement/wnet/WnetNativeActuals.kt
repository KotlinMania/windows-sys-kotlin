@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.WIN32_ERROR
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun MultinetGetConnectionPerformanceA(lpnetresource: Long, lpnetconnectinfostruct: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_MultinetGetConnectionPerformanceA(lpnetresource.toCPointer<ByteVar>(), lpnetconnectinfostruct.toCPointer<ByteVar>())

public actual fun MultinetGetConnectionPerformanceW(lpnetresource: Long, lpnetconnectinfostruct: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_MultinetGetConnectionPerformanceW(lpnetresource.toCPointer<ByteVar>(), lpnetconnectinfostruct.toCPointer<ByteVar>())

public actual fun NPAddConnection(lpnetresource: Long, lppassword: PCWSTR, lpusername: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_NPAddConnection(lpnetresource.toCPointer<ByteVar>(), lppassword.toCPointer<ByteVar>(), lpusername.toCPointer<ByteVar>())

public actual fun NPAddConnection3(hwndowner: HWND, lpnetresource: Long, lppassword: PCWSTR, lpusername: PCWSTR, dwflags: NET_CONNECT_FLAGS): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_NPAddConnection3(hwndowner.toCPointer<ByteVar>(), lpnetresource.toCPointer<ByteVar>(), lppassword.toCPointer<ByteVar>(), lpusername.toCPointer<ByteVar>(), dwflags)

public actual fun NPAddConnection4(hwndowner: HWND, lpnetresource: Long, lpauthbuffer: Long, cbauthbuffer: UInt, dwflags: UInt, lpuseoptions: Long, cbuseoptions: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_NPAddConnection4(hwndowner.toCPointer<ByteVar>(), lpnetresource.toCPointer<ByteVar>(), lpauthbuffer.toCPointer<ByteVar>(), cbauthbuffer, dwflags, lpuseoptions.toCPointer<ByteVar>(), cbuseoptions)

public actual fun NPCancelConnection(lpname: PCWSTR, fforce: BOOL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_NPCancelConnection(lpname.toCPointer<ByteVar>(), fforce)

public actual fun NPCancelConnection2(lpname: PCWSTR, fforce: BOOL, dwflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_NPCancelConnection2(lpname.toCPointer<ByteVar>(), fforce, dwflags)

public actual fun NPCloseEnum(henum: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_NPCloseEnum(henum.toCPointer<ByteVar>())

public actual fun NPEnumResource(henum: HANDLE, lpccount: Long, lpbuffer: Long, lpbuffersize: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_NPEnumResource(henum.toCPointer<ByteVar>(), lpccount.toCPointer<ByteVar>(), lpbuffer.toCPointer<ByteVar>(), lpbuffersize.toCPointer<ByteVar>())

public actual fun NPFormatNetworkName(lpremotename: PCWSTR, lpformattedname: PWSTR, lpnlength: Long, dwflags: NETWORK_NAME_FORMAT_FLAGS, dwavecharperline: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_NPFormatNetworkName(lpremotename.toCPointer<ByteVar>(), lpformattedname.toCPointer<ByteVar>(), lpnlength.toCPointer<ByteVar>(), dwflags, dwavecharperline)

public actual fun NPGetCaps(ndex: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_NPGetCaps(ndex)

public actual fun NPGetConnection(lplocalname: PCWSTR, lpremotename: PWSTR, lpnbufferlen: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_NPGetConnection(lplocalname.toCPointer<ByteVar>(), lpremotename.toCPointer<ByteVar>(), lpnbufferlen.toCPointer<ByteVar>())

public actual fun NPGetConnection3(lplocalname: PCWSTR, dwlevel: UInt, lpbuffer: Long, lpbuffersize: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_NPGetConnection3(lplocalname.toCPointer<ByteVar>(), dwlevel, lpbuffer.toCPointer<ByteVar>(), lpbuffersize.toCPointer<ByteVar>())

public actual fun NPGetConnectionPerformance(lpremotename: PCWSTR, lpnetconnectinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_NPGetConnectionPerformance(lpremotename.toCPointer<ByteVar>(), lpnetconnectinfo.toCPointer<ByteVar>())

public actual fun NPGetPersistentUseOptionsForConnection(lpremotepath: PCWSTR, lpreaduseoptions: Long, cbreaduseoptions: UInt, lpwriteuseoptions: Long, lpsizewriteuseoptions: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_NPGetPersistentUseOptionsForConnection(lpremotepath.toCPointer<ByteVar>(), lpreaduseoptions.toCPointer<ByteVar>(), cbreaduseoptions, lpwriteuseoptions.toCPointer<ByteVar>(), lpsizewriteuseoptions.toCPointer<ByteVar>())

public actual fun NPGetResourceInformation(lpnetresource: Long, lpbuffer: Long, lpbuffersize: Long, lplpsystem: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_NPGetResourceInformation(lpnetresource.toCPointer<ByteVar>(), lpbuffer.toCPointer<ByteVar>(), lpbuffersize.toCPointer<ByteVar>(), lplpsystem.toCPointer<ByteVar>())

public actual fun NPGetResourceParent(lpnetresource: Long, lpbuffer: Long, lpbuffersize: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_NPGetResourceParent(lpnetresource.toCPointer<ByteVar>(), lpbuffer.toCPointer<ByteVar>(), lpbuffersize.toCPointer<ByteVar>())

public actual fun NPGetUniversalName(lplocalpath: PCWSTR, dwinfolevel: UNC_INFO_LEVEL, lpbuffer: Long, lpbuffersize: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_NPGetUniversalName(lplocalpath.toCPointer<ByteVar>(), dwinfolevel, lpbuffer.toCPointer<ByteVar>(), lpbuffersize.toCPointer<ByteVar>())

public actual fun NPGetUser(lpname: PCWSTR, lpusername: PWSTR, lpnbufferlen: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_NPGetUser(lpname.toCPointer<ByteVar>(), lpusername.toCPointer<ByteVar>(), lpnbufferlen.toCPointer<ByteVar>())

public actual fun NPOpenEnum(dwscope: UInt, dwtype: UInt, dwusage: UInt, lpnetresource: Long, lphenum: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_NPOpenEnum(dwscope, dwtype, dwusage, lpnetresource.toCPointer<ByteVar>(), lphenum.toCPointer<ByteVar>())

public actual fun WNetAddConnection2A(lpnetresource: Long, lppassword: PCSTR, lpusername: PCSTR, dwflags: NET_CONNECT_FLAGS): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_WNetAddConnection2A(lpnetresource.toCPointer<ByteVar>(), lppassword.toCPointer<ByteVar>(), lpusername.toCPointer<ByteVar>(), dwflags)

public actual fun WNetAddConnection2W(lpnetresource: Long, lppassword: PCWSTR, lpusername: PCWSTR, dwflags: NET_CONNECT_FLAGS): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_WNetAddConnection2W(lpnetresource.toCPointer<ByteVar>(), lppassword.toCPointer<ByteVar>(), lpusername.toCPointer<ByteVar>(), dwflags)

public actual fun WNetAddConnection3A(hwndowner: HWND, lpnetresource: Long, lppassword: PCSTR, lpusername: PCSTR, dwflags: NET_CONNECT_FLAGS): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_WNetAddConnection3A(hwndowner.toCPointer<ByteVar>(), lpnetresource.toCPointer<ByteVar>(), lppassword.toCPointer<ByteVar>(), lpusername.toCPointer<ByteVar>(), dwflags)

public actual fun WNetAddConnection3W(hwndowner: HWND, lpnetresource: Long, lppassword: PCWSTR, lpusername: PCWSTR, dwflags: NET_CONNECT_FLAGS): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_WNetAddConnection3W(hwndowner.toCPointer<ByteVar>(), lpnetresource.toCPointer<ByteVar>(), lppassword.toCPointer<ByteVar>(), lpusername.toCPointer<ByteVar>(), dwflags)

public actual fun WNetAddConnection4A(hwndowner: HWND, lpnetresource: Long, pauthbuffer: Long, cbauthbuffer: UInt, dwflags: NET_CONNECT_FLAGS, lpuseoptions: Long, cbuseoptions: UInt): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_WNetAddConnection4A(hwndowner.toCPointer<ByteVar>(), lpnetresource.toCPointer<ByteVar>(), pauthbuffer.toCPointer<ByteVar>(), cbauthbuffer, dwflags, lpuseoptions.toCPointer<ByteVar>(), cbuseoptions)

public actual fun WNetAddConnection4W(hwndowner: HWND, lpnetresource: Long, pauthbuffer: Long, cbauthbuffer: UInt, dwflags: NET_CONNECT_FLAGS, lpuseoptions: Long, cbuseoptions: UInt): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_WNetAddConnection4W(hwndowner.toCPointer<ByteVar>(), lpnetresource.toCPointer<ByteVar>(), pauthbuffer.toCPointer<ByteVar>(), cbauthbuffer, dwflags, lpuseoptions.toCPointer<ByteVar>(), cbuseoptions)

public actual fun WNetAddConnectionA(lpremotename: PCSTR, lppassword: PCSTR, lplocalname: PCSTR): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_WNetAddConnectionA(lpremotename.toCPointer<ByteVar>(), lppassword.toCPointer<ByteVar>(), lplocalname.toCPointer<ByteVar>())

public actual fun WNetAddConnectionW(lpremotename: PCWSTR, lppassword: PCWSTR, lplocalname: PCWSTR): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_WNetAddConnectionW(lpremotename.toCPointer<ByteVar>(), lppassword.toCPointer<ByteVar>(), lplocalname.toCPointer<ByteVar>())

public actual fun WNetCancelConnection2A(lpname: PCSTR, dwflags: NET_CONNECT_FLAGS, fforce: BOOL): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_WNetCancelConnection2A(lpname.toCPointer<ByteVar>(), dwflags, fforce)

public actual fun WNetCancelConnection2W(lpname: PCWSTR, dwflags: NET_CONNECT_FLAGS, fforce: BOOL): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_WNetCancelConnection2W(lpname.toCPointer<ByteVar>(), dwflags, fforce)

public actual fun WNetCancelConnectionA(lpname: PCSTR, fforce: BOOL): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_WNetCancelConnectionA(lpname.toCPointer<ByteVar>(), fforce)

public actual fun WNetCancelConnectionW(lpname: PCWSTR, fforce: BOOL): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_WNetCancelConnectionW(lpname.toCPointer<ByteVar>(), fforce)

public actual fun WNetCloseEnum(henum: HANDLE): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_WNetCloseEnum(henum.toCPointer<ByteVar>())

public actual fun WNetConnectionDialog(hwnd: HWND, dwtype: UInt): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_WNetConnectionDialog(hwnd.toCPointer<ByteVar>(), dwtype)

public actual fun WNetConnectionDialog1A(lpconndlgstruct: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_WNetConnectionDialog1A(lpconndlgstruct.toCPointer<ByteVar>())

public actual fun WNetConnectionDialog1W(lpconndlgstruct: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_WNetConnectionDialog1W(lpconndlgstruct.toCPointer<ByteVar>())

public actual fun WNetDisconnectDialog(hwnd: HWND, dwtype: UInt): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_WNetDisconnectDialog(hwnd.toCPointer<ByteVar>(), dwtype)

public actual fun WNetDisconnectDialog1A(lpconndlgstruct: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_WNetDisconnectDialog1A(lpconndlgstruct.toCPointer<ByteVar>())

public actual fun WNetDisconnectDialog1W(lpconndlgstruct: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_WNetDisconnectDialog1W(lpconndlgstruct.toCPointer<ByteVar>())

public actual fun WNetEnumResourceA(henum: HANDLE, lpccount: Long, lpbuffer: Long, lpbuffersize: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_WNetEnumResourceA(henum.toCPointer<ByteVar>(), lpccount.toCPointer<ByteVar>(), lpbuffer.toCPointer<ByteVar>(), lpbuffersize.toCPointer<ByteVar>())

public actual fun WNetEnumResourceW(henum: HANDLE, lpccount: Long, lpbuffer: Long, lpbuffersize: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_WNetEnumResourceW(henum.toCPointer<ByteVar>(), lpccount.toCPointer<ByteVar>(), lpbuffer.toCPointer<ByteVar>(), lpbuffersize.toCPointer<ByteVar>())

public actual fun WNetGetConnectionA(lplocalname: PCSTR, lpremotename: PSTR, lpnlength: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_WNetGetConnectionA(lplocalname.toCPointer<ByteVar>(), lpremotename.toCPointer<ByteVar>(), lpnlength.toCPointer<ByteVar>())

public actual fun WNetGetConnectionW(lplocalname: PCWSTR, lpremotename: PWSTR, lpnlength: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_WNetGetConnectionW(lplocalname.toCPointer<ByteVar>(), lpremotename.toCPointer<ByteVar>(), lpnlength.toCPointer<ByteVar>())

public actual fun WNetGetLastErrorA(lperror: Long, lperrorbuf: PSTR, nerrorbufsize: UInt, lpnamebuf: PSTR, nnamebufsize: UInt): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_WNetGetLastErrorA(lperror.toCPointer<ByteVar>(), lperrorbuf.toCPointer<ByteVar>(), nerrorbufsize, lpnamebuf.toCPointer<ByteVar>(), nnamebufsize)

public actual fun WNetGetLastErrorW(lperror: Long, lperrorbuf: PWSTR, nerrorbufsize: UInt, lpnamebuf: PWSTR, nnamebufsize: UInt): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_WNetGetLastErrorW(lperror.toCPointer<ByteVar>(), lperrorbuf.toCPointer<ByteVar>(), nerrorbufsize, lpnamebuf.toCPointer<ByteVar>(), nnamebufsize)

public actual fun WNetGetNetworkInformationA(lpprovider: PCSTR, lpnetinfostruct: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_WNetGetNetworkInformationA(lpprovider.toCPointer<ByteVar>(), lpnetinfostruct.toCPointer<ByteVar>())

public actual fun WNetGetNetworkInformationW(lpprovider: PCWSTR, lpnetinfostruct: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_WNetGetNetworkInformationW(lpprovider.toCPointer<ByteVar>(), lpnetinfostruct.toCPointer<ByteVar>())

public actual fun WNetGetProviderNameA(dwnettype: UInt, lpprovidername: PSTR, lpbuffersize: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_WNetGetProviderNameA(dwnettype, lpprovidername.toCPointer<ByteVar>(), lpbuffersize.toCPointer<ByteVar>())

public actual fun WNetGetProviderNameW(dwnettype: UInt, lpprovidername: PWSTR, lpbuffersize: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_WNetGetProviderNameW(dwnettype, lpprovidername.toCPointer<ByteVar>(), lpbuffersize.toCPointer<ByteVar>())

public actual fun WNetGetResourceInformationA(lpnetresource: Long, lpbuffer: Long, lpcbbuffer: Long, lplpsystem: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_WNetGetResourceInformationA(lpnetresource.toCPointer<ByteVar>(), lpbuffer.toCPointer<ByteVar>(), lpcbbuffer.toCPointer<ByteVar>(), lplpsystem.toCPointer<ByteVar>())

public actual fun WNetGetResourceInformationW(lpnetresource: Long, lpbuffer: Long, lpcbbuffer: Long, lplpsystem: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_WNetGetResourceInformationW(lpnetresource.toCPointer<ByteVar>(), lpbuffer.toCPointer<ByteVar>(), lpcbbuffer.toCPointer<ByteVar>(), lplpsystem.toCPointer<ByteVar>())

public actual fun WNetGetResourceParentA(lpnetresource: Long, lpbuffer: Long, lpcbbuffer: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_WNetGetResourceParentA(lpnetresource.toCPointer<ByteVar>(), lpbuffer.toCPointer<ByteVar>(), lpcbbuffer.toCPointer<ByteVar>())

public actual fun WNetGetResourceParentW(lpnetresource: Long, lpbuffer: Long, lpcbbuffer: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_WNetGetResourceParentW(lpnetresource.toCPointer<ByteVar>(), lpbuffer.toCPointer<ByteVar>(), lpcbbuffer.toCPointer<ByteVar>())

public actual fun WNetGetUniversalNameA(lplocalpath: PCSTR, dwinfolevel: UNC_INFO_LEVEL, lpbuffer: Long, lpbuffersize: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_WNetGetUniversalNameA(lplocalpath.toCPointer<ByteVar>(), dwinfolevel, lpbuffer.toCPointer<ByteVar>(), lpbuffersize.toCPointer<ByteVar>())

public actual fun WNetGetUniversalNameW(lplocalpath: PCWSTR, dwinfolevel: UNC_INFO_LEVEL, lpbuffer: Long, lpbuffersize: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_WNetGetUniversalNameW(lplocalpath.toCPointer<ByteVar>(), dwinfolevel, lpbuffer.toCPointer<ByteVar>(), lpbuffersize.toCPointer<ByteVar>())

public actual fun WNetGetUserA(lpname: PCSTR, lpusername: PSTR, lpnlength: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_WNetGetUserA(lpname.toCPointer<ByteVar>(), lpusername.toCPointer<ByteVar>(), lpnlength.toCPointer<ByteVar>())

public actual fun WNetGetUserW(lpname: PCWSTR, lpusername: PWSTR, lpnlength: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_WNetGetUserW(lpname.toCPointer<ByteVar>(), lpusername.toCPointer<ByteVar>(), lpnlength.toCPointer<ByteVar>())

public actual fun WNetOpenEnumA(dwscope: NET_RESOURCE_SCOPE, dwtype: NET_RESOURCE_TYPE, dwusage: WNET_OPEN_ENUM_USAGE, lpnetresource: Long, lphenum: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_WNetOpenEnumA(dwscope, dwtype, dwusage, lpnetresource.toCPointer<ByteVar>(), lphenum.toCPointer<ByteVar>())

public actual fun WNetOpenEnumW(dwscope: NET_RESOURCE_SCOPE, dwtype: NET_RESOURCE_TYPE, dwusage: WNET_OPEN_ENUM_USAGE, lpnetresource: Long, lphenum: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_WNetOpenEnumW(dwscope, dwtype, dwusage, lpnetresource.toCPointer<ByteVar>(), lphenum.toCPointer<ByteVar>())

public actual fun WNetSetLastErrorA(err: UInt, lperror: PCSTR, lpproviders: PCSTR) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_WNetSetLastErrorA(err, lperror.toCPointer<ByteVar>(), lpproviders.toCPointer<ByteVar>())
}

public actual fun WNetSetLastErrorW(err: UInt, lperror: PCWSTR, lpproviders: PCWSTR) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_WNetSetLastErrorW(err, lperror.toCPointer<ByteVar>(), lpproviders.toCPointer<ByteVar>())
}

public actual fun WNetUseConnection4A(hwndowner: HWND, lpnetresource: Long, pauthbuffer: Long, cbauthbuffer: UInt, dwflags: UInt, lpuseoptions: Long, cbuseoptions: UInt, lpaccessname: PSTR, lpbuffersize: Long, lpresult: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_WNetUseConnection4A(hwndowner.toCPointer<ByteVar>(), lpnetresource.toCPointer<ByteVar>(), pauthbuffer.toCPointer<ByteVar>(), cbauthbuffer, dwflags, lpuseoptions.toCPointer<ByteVar>(), cbuseoptions, lpaccessname.toCPointer<ByteVar>(), lpbuffersize.toCPointer<ByteVar>(), lpresult.toCPointer<ByteVar>())

public actual fun WNetUseConnection4W(hwndowner: HWND, lpnetresource: Long, pauthbuffer: Long, cbauthbuffer: UInt, dwflags: UInt, lpuseoptions: Long, cbuseoptions: UInt, lpaccessname: PWSTR, lpbuffersize: Long, lpresult: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_WNetUseConnection4W(hwndowner.toCPointer<ByteVar>(), lpnetresource.toCPointer<ByteVar>(), pauthbuffer.toCPointer<ByteVar>(), cbauthbuffer, dwflags, lpuseoptions.toCPointer<ByteVar>(), cbuseoptions, lpaccessname.toCPointer<ByteVar>(), lpbuffersize.toCPointer<ByteVar>(), lpresult.toCPointer<ByteVar>())

public actual fun WNetUseConnectionA(hwndowner: HWND, lpnetresource: Long, lppassword: PCSTR, lpuserid: PCSTR, dwflags: NET_CONNECT_FLAGS, lpaccessname: PSTR, lpbuffersize: Long, lpresult: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_WNetUseConnectionA(hwndowner.toCPointer<ByteVar>(), lpnetresource.toCPointer<ByteVar>(), lppassword.toCPointer<ByteVar>(), lpuserid.toCPointer<ByteVar>(), dwflags, lpaccessname.toCPointer<ByteVar>(), lpbuffersize.toCPointer<ByteVar>(), lpresult.toCPointer<ByteVar>())

public actual fun WNetUseConnectionW(hwndowner: HWND, lpnetresource: Long, lppassword: PCWSTR, lpuserid: PCWSTR, dwflags: NET_CONNECT_FLAGS, lpaccessname: PWSTR, lpbuffersize: Long, lpresult: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.cinterop.windowssys_windows_win32_networkmanagement_wnet_WNetUseConnectionW(hwndowner.toCPointer<ByteVar>(), lpnetresource.toCPointer<ByteVar>(), lppassword.toCPointer<ByteVar>(), lpuserid.toCPointer<ByteVar>(), dwflags, lpaccessname.toCPointer<ByteVar>(), lpbuffersize.toCPointer<ByteVar>(), lpresult.toCPointer<ByteVar>())
