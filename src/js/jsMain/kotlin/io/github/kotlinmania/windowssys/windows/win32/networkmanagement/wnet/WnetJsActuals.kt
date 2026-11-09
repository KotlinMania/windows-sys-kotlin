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

private val _windowsWin32NetworkmanagementWnetNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun MultinetGetConnectionPerformanceA(lpnetresource: Long, lpnetconnectinfostruct: Long): UInt =
    if (_windowsWin32NetworkmanagementWnetNapiAddon != null) (_windowsWin32NetworkmanagementWnetNapiAddon.windowssys_windows_win32_networkmanagement_wnet_MultinetGetConnectionPerformanceA(lpnetresource.toString(), lpnetconnectinfostruct.toString()) as Int).toUInt() else 0u

public actual fun MultinetGetConnectionPerformanceW(lpnetresource: Long, lpnetconnectinfostruct: Long): UInt =
    if (_windowsWin32NetworkmanagementWnetNapiAddon != null) (_windowsWin32NetworkmanagementWnetNapiAddon.windowssys_windows_win32_networkmanagement_wnet_MultinetGetConnectionPerformanceW(lpnetresource.toString(), lpnetconnectinfostruct.toString()) as Int).toUInt() else 0u

public actual fun NPAddConnection(lpnetresource: Long, lppassword: PCWSTR, lpusername: PCWSTR): UInt =
    if (_windowsWin32NetworkmanagementWnetNapiAddon != null) (_windowsWin32NetworkmanagementWnetNapiAddon.windowssys_windows_win32_networkmanagement_wnet_NPAddConnection(lpnetresource.toString(), lppassword.toString(), lpusername.toString()) as Int).toUInt() else 0u

public actual fun NPAddConnection3(hwndowner: HWND, lpnetresource: Long, lppassword: PCWSTR, lpusername: PCWSTR, dwflags: NET_CONNECT_FLAGS): UInt =
    if (_windowsWin32NetworkmanagementWnetNapiAddon != null) (_windowsWin32NetworkmanagementWnetNapiAddon.windowssys_windows_win32_networkmanagement_wnet_NPAddConnection3(hwndowner.toString(), lpnetresource.toString(), lppassword.toString(), lpusername.toString(), dwflags.toInt()) as Int).toUInt() else 0u

public actual fun NPAddConnection4(hwndowner: HWND, lpnetresource: Long, lpauthbuffer: Long, cbauthbuffer: UInt, dwflags: UInt, lpuseoptions: Long, cbuseoptions: UInt): UInt =
    if (_windowsWin32NetworkmanagementWnetNapiAddon != null) (_windowsWin32NetworkmanagementWnetNapiAddon.windowssys_windows_win32_networkmanagement_wnet_NPAddConnection4(hwndowner.toString(), lpnetresource.toString(), lpauthbuffer.toString(), cbauthbuffer.toInt(), dwflags.toInt(), lpuseoptions.toString(), cbuseoptions.toInt()) as Int).toUInt() else 0u

public actual fun NPCancelConnection(lpname: PCWSTR, fforce: BOOL): UInt =
    if (_windowsWin32NetworkmanagementWnetNapiAddon != null) (_windowsWin32NetworkmanagementWnetNapiAddon.windowssys_windows_win32_networkmanagement_wnet_NPCancelConnection(lpname.toString(), fforce) as Int).toUInt() else 0u

public actual fun NPCancelConnection2(lpname: PCWSTR, fforce: BOOL, dwflags: UInt): UInt =
    if (_windowsWin32NetworkmanagementWnetNapiAddon != null) (_windowsWin32NetworkmanagementWnetNapiAddon.windowssys_windows_win32_networkmanagement_wnet_NPCancelConnection2(lpname.toString(), fforce, dwflags.toInt()) as Int).toUInt() else 0u

public actual fun NPCloseEnum(henum: HANDLE): UInt =
    if (_windowsWin32NetworkmanagementWnetNapiAddon != null) (_windowsWin32NetworkmanagementWnetNapiAddon.windowssys_windows_win32_networkmanagement_wnet_NPCloseEnum(henum.toString()) as Int).toUInt() else 0u

public actual fun NPEnumResource(henum: HANDLE, lpccount: Long, lpbuffer: Long, lpbuffersize: Long): UInt =
    if (_windowsWin32NetworkmanagementWnetNapiAddon != null) (_windowsWin32NetworkmanagementWnetNapiAddon.windowssys_windows_win32_networkmanagement_wnet_NPEnumResource(henum.toString(), lpccount.toString(), lpbuffer.toString(), lpbuffersize.toString()) as Int).toUInt() else 0u

public actual fun NPFormatNetworkName(lpremotename: PCWSTR, lpformattedname: PWSTR, lpnlength: Long, dwflags: NETWORK_NAME_FORMAT_FLAGS, dwavecharperline: UInt): UInt =
    if (_windowsWin32NetworkmanagementWnetNapiAddon != null) (_windowsWin32NetworkmanagementWnetNapiAddon.windowssys_windows_win32_networkmanagement_wnet_NPFormatNetworkName(lpremotename.toString(), lpformattedname.toString(), lpnlength.toString(), dwflags.toInt(), dwavecharperline.toInt()) as Int).toUInt() else 0u

public actual fun NPGetCaps(ndex: UInt): UInt =
    if (_windowsWin32NetworkmanagementWnetNapiAddon != null) (_windowsWin32NetworkmanagementWnetNapiAddon.windowssys_windows_win32_networkmanagement_wnet_NPGetCaps(ndex.toInt()) as Int).toUInt() else 0u

public actual fun NPGetConnection(lplocalname: PCWSTR, lpremotename: PWSTR, lpnbufferlen: Long): UInt =
    if (_windowsWin32NetworkmanagementWnetNapiAddon != null) (_windowsWin32NetworkmanagementWnetNapiAddon.windowssys_windows_win32_networkmanagement_wnet_NPGetConnection(lplocalname.toString(), lpremotename.toString(), lpnbufferlen.toString()) as Int).toUInt() else 0u

public actual fun NPGetConnection3(lplocalname: PCWSTR, dwlevel: UInt, lpbuffer: Long, lpbuffersize: Long): UInt =
    if (_windowsWin32NetworkmanagementWnetNapiAddon != null) (_windowsWin32NetworkmanagementWnetNapiAddon.windowssys_windows_win32_networkmanagement_wnet_NPGetConnection3(lplocalname.toString(), dwlevel.toInt(), lpbuffer.toString(), lpbuffersize.toString()) as Int).toUInt() else 0u

public actual fun NPGetConnectionPerformance(lpremotename: PCWSTR, lpnetconnectinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementWnetNapiAddon != null) (_windowsWin32NetworkmanagementWnetNapiAddon.windowssys_windows_win32_networkmanagement_wnet_NPGetConnectionPerformance(lpremotename.toString(), lpnetconnectinfo.toString()) as Int).toUInt() else 0u

public actual fun NPGetPersistentUseOptionsForConnection(lpremotepath: PCWSTR, lpreaduseoptions: Long, cbreaduseoptions: UInt, lpwriteuseoptions: Long, lpsizewriteuseoptions: Long): UInt =
    if (_windowsWin32NetworkmanagementWnetNapiAddon != null) (_windowsWin32NetworkmanagementWnetNapiAddon.windowssys_windows_win32_networkmanagement_wnet_NPGetPersistentUseOptionsForConnection(lpremotepath.toString(), lpreaduseoptions.toString(), cbreaduseoptions.toInt(), lpwriteuseoptions.toString(), lpsizewriteuseoptions.toString()) as Int).toUInt() else 0u

public actual fun NPGetResourceInformation(lpnetresource: Long, lpbuffer: Long, lpbuffersize: Long, lplpsystem: Long): UInt =
    if (_windowsWin32NetworkmanagementWnetNapiAddon != null) (_windowsWin32NetworkmanagementWnetNapiAddon.windowssys_windows_win32_networkmanagement_wnet_NPGetResourceInformation(lpnetresource.toString(), lpbuffer.toString(), lpbuffersize.toString(), lplpsystem.toString()) as Int).toUInt() else 0u

public actual fun NPGetResourceParent(lpnetresource: Long, lpbuffer: Long, lpbuffersize: Long): UInt =
    if (_windowsWin32NetworkmanagementWnetNapiAddon != null) (_windowsWin32NetworkmanagementWnetNapiAddon.windowssys_windows_win32_networkmanagement_wnet_NPGetResourceParent(lpnetresource.toString(), lpbuffer.toString(), lpbuffersize.toString()) as Int).toUInt() else 0u

public actual fun NPGetUniversalName(lplocalpath: PCWSTR, dwinfolevel: UNC_INFO_LEVEL, lpbuffer: Long, lpbuffersize: Long): UInt =
    if (_windowsWin32NetworkmanagementWnetNapiAddon != null) (_windowsWin32NetworkmanagementWnetNapiAddon.windowssys_windows_win32_networkmanagement_wnet_NPGetUniversalName(lplocalpath.toString(), dwinfolevel.toInt(), lpbuffer.toString(), lpbuffersize.toString()) as Int).toUInt() else 0u

public actual fun NPGetUser(lpname: PCWSTR, lpusername: PWSTR, lpnbufferlen: Long): UInt =
    if (_windowsWin32NetworkmanagementWnetNapiAddon != null) (_windowsWin32NetworkmanagementWnetNapiAddon.windowssys_windows_win32_networkmanagement_wnet_NPGetUser(lpname.toString(), lpusername.toString(), lpnbufferlen.toString()) as Int).toUInt() else 0u

public actual fun NPOpenEnum(dwscope: UInt, dwtype: UInt, dwusage: UInt, lpnetresource: Long, lphenum: Long): UInt =
    if (_windowsWin32NetworkmanagementWnetNapiAddon != null) (_windowsWin32NetworkmanagementWnetNapiAddon.windowssys_windows_win32_networkmanagement_wnet_NPOpenEnum(dwscope.toInt(), dwtype.toInt(), dwusage.toInt(), lpnetresource.toString(), lphenum.toString()) as Int).toUInt() else 0u

public actual fun WNetAddConnection2A(lpnetresource: Long, lppassword: PCSTR, lpusername: PCSTR, dwflags: NET_CONNECT_FLAGS): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementWnetNapiAddon != null) (_windowsWin32NetworkmanagementWnetNapiAddon.windowssys_windows_win32_networkmanagement_wnet_WNetAddConnection2A(lpnetresource.toString(), lppassword.toString(), lpusername.toString(), dwflags.toInt()) as Int).toUInt() else 0u

public actual fun WNetAddConnection2W(lpnetresource: Long, lppassword: PCWSTR, lpusername: PCWSTR, dwflags: NET_CONNECT_FLAGS): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementWnetNapiAddon != null) (_windowsWin32NetworkmanagementWnetNapiAddon.windowssys_windows_win32_networkmanagement_wnet_WNetAddConnection2W(lpnetresource.toString(), lppassword.toString(), lpusername.toString(), dwflags.toInt()) as Int).toUInt() else 0u

public actual fun WNetAddConnection3A(hwndowner: HWND, lpnetresource: Long, lppassword: PCSTR, lpusername: PCSTR, dwflags: NET_CONNECT_FLAGS): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementWnetNapiAddon != null) (_windowsWin32NetworkmanagementWnetNapiAddon.windowssys_windows_win32_networkmanagement_wnet_WNetAddConnection3A(hwndowner.toString(), lpnetresource.toString(), lppassword.toString(), lpusername.toString(), dwflags.toInt()) as Int).toUInt() else 0u

public actual fun WNetAddConnection3W(hwndowner: HWND, lpnetresource: Long, lppassword: PCWSTR, lpusername: PCWSTR, dwflags: NET_CONNECT_FLAGS): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementWnetNapiAddon != null) (_windowsWin32NetworkmanagementWnetNapiAddon.windowssys_windows_win32_networkmanagement_wnet_WNetAddConnection3W(hwndowner.toString(), lpnetresource.toString(), lppassword.toString(), lpusername.toString(), dwflags.toInt()) as Int).toUInt() else 0u

public actual fun WNetAddConnection4A(hwndowner: HWND, lpnetresource: Long, pauthbuffer: Long, cbauthbuffer: UInt, dwflags: NET_CONNECT_FLAGS, lpuseoptions: Long, cbuseoptions: UInt): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementWnetNapiAddon != null) (_windowsWin32NetworkmanagementWnetNapiAddon.windowssys_windows_win32_networkmanagement_wnet_WNetAddConnection4A(hwndowner.toString(), lpnetresource.toString(), pauthbuffer.toString(), cbauthbuffer.toInt(), dwflags.toInt(), lpuseoptions.toString(), cbuseoptions.toInt()) as Int).toUInt() else 0u

public actual fun WNetAddConnection4W(hwndowner: HWND, lpnetresource: Long, pauthbuffer: Long, cbauthbuffer: UInt, dwflags: NET_CONNECT_FLAGS, lpuseoptions: Long, cbuseoptions: UInt): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementWnetNapiAddon != null) (_windowsWin32NetworkmanagementWnetNapiAddon.windowssys_windows_win32_networkmanagement_wnet_WNetAddConnection4W(hwndowner.toString(), lpnetresource.toString(), pauthbuffer.toString(), cbauthbuffer.toInt(), dwflags.toInt(), lpuseoptions.toString(), cbuseoptions.toInt()) as Int).toUInt() else 0u

public actual fun WNetAddConnectionA(lpremotename: PCSTR, lppassword: PCSTR, lplocalname: PCSTR): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementWnetNapiAddon != null) (_windowsWin32NetworkmanagementWnetNapiAddon.windowssys_windows_win32_networkmanagement_wnet_WNetAddConnectionA(lpremotename.toString(), lppassword.toString(), lplocalname.toString()) as Int).toUInt() else 0u

public actual fun WNetAddConnectionW(lpremotename: PCWSTR, lppassword: PCWSTR, lplocalname: PCWSTR): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementWnetNapiAddon != null) (_windowsWin32NetworkmanagementWnetNapiAddon.windowssys_windows_win32_networkmanagement_wnet_WNetAddConnectionW(lpremotename.toString(), lppassword.toString(), lplocalname.toString()) as Int).toUInt() else 0u

public actual fun WNetCancelConnection2A(lpname: PCSTR, dwflags: NET_CONNECT_FLAGS, fforce: BOOL): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementWnetNapiAddon != null) (_windowsWin32NetworkmanagementWnetNapiAddon.windowssys_windows_win32_networkmanagement_wnet_WNetCancelConnection2A(lpname.toString(), dwflags.toInt(), fforce) as Int).toUInt() else 0u

public actual fun WNetCancelConnection2W(lpname: PCWSTR, dwflags: NET_CONNECT_FLAGS, fforce: BOOL): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementWnetNapiAddon != null) (_windowsWin32NetworkmanagementWnetNapiAddon.windowssys_windows_win32_networkmanagement_wnet_WNetCancelConnection2W(lpname.toString(), dwflags.toInt(), fforce) as Int).toUInt() else 0u

public actual fun WNetCancelConnectionA(lpname: PCSTR, fforce: BOOL): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementWnetNapiAddon != null) (_windowsWin32NetworkmanagementWnetNapiAddon.windowssys_windows_win32_networkmanagement_wnet_WNetCancelConnectionA(lpname.toString(), fforce) as Int).toUInt() else 0u

public actual fun WNetCancelConnectionW(lpname: PCWSTR, fforce: BOOL): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementWnetNapiAddon != null) (_windowsWin32NetworkmanagementWnetNapiAddon.windowssys_windows_win32_networkmanagement_wnet_WNetCancelConnectionW(lpname.toString(), fforce) as Int).toUInt() else 0u

public actual fun WNetCloseEnum(henum: HANDLE): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementWnetNapiAddon != null) (_windowsWin32NetworkmanagementWnetNapiAddon.windowssys_windows_win32_networkmanagement_wnet_WNetCloseEnum(henum.toString()) as Int).toUInt() else 0u

public actual fun WNetConnectionDialog(hwnd: HWND, dwtype: UInt): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementWnetNapiAddon != null) (_windowsWin32NetworkmanagementWnetNapiAddon.windowssys_windows_win32_networkmanagement_wnet_WNetConnectionDialog(hwnd.toString(), dwtype.toInt()) as Int).toUInt() else 0u

public actual fun WNetConnectionDialog1A(lpconndlgstruct: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementWnetNapiAddon != null) (_windowsWin32NetworkmanagementWnetNapiAddon.windowssys_windows_win32_networkmanagement_wnet_WNetConnectionDialog1A(lpconndlgstruct.toString()) as Int).toUInt() else 0u

public actual fun WNetConnectionDialog1W(lpconndlgstruct: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementWnetNapiAddon != null) (_windowsWin32NetworkmanagementWnetNapiAddon.windowssys_windows_win32_networkmanagement_wnet_WNetConnectionDialog1W(lpconndlgstruct.toString()) as Int).toUInt() else 0u

public actual fun WNetDisconnectDialog(hwnd: HWND, dwtype: UInt): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementWnetNapiAddon != null) (_windowsWin32NetworkmanagementWnetNapiAddon.windowssys_windows_win32_networkmanagement_wnet_WNetDisconnectDialog(hwnd.toString(), dwtype.toInt()) as Int).toUInt() else 0u

public actual fun WNetDisconnectDialog1A(lpconndlgstruct: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementWnetNapiAddon != null) (_windowsWin32NetworkmanagementWnetNapiAddon.windowssys_windows_win32_networkmanagement_wnet_WNetDisconnectDialog1A(lpconndlgstruct.toString()) as Int).toUInt() else 0u

public actual fun WNetDisconnectDialog1W(lpconndlgstruct: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementWnetNapiAddon != null) (_windowsWin32NetworkmanagementWnetNapiAddon.windowssys_windows_win32_networkmanagement_wnet_WNetDisconnectDialog1W(lpconndlgstruct.toString()) as Int).toUInt() else 0u

public actual fun WNetEnumResourceA(henum: HANDLE, lpccount: Long, lpbuffer: Long, lpbuffersize: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementWnetNapiAddon != null) (_windowsWin32NetworkmanagementWnetNapiAddon.windowssys_windows_win32_networkmanagement_wnet_WNetEnumResourceA(henum.toString(), lpccount.toString(), lpbuffer.toString(), lpbuffersize.toString()) as Int).toUInt() else 0u

public actual fun WNetEnumResourceW(henum: HANDLE, lpccount: Long, lpbuffer: Long, lpbuffersize: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementWnetNapiAddon != null) (_windowsWin32NetworkmanagementWnetNapiAddon.windowssys_windows_win32_networkmanagement_wnet_WNetEnumResourceW(henum.toString(), lpccount.toString(), lpbuffer.toString(), lpbuffersize.toString()) as Int).toUInt() else 0u

public actual fun WNetGetConnectionA(lplocalname: PCSTR, lpremotename: PSTR, lpnlength: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementWnetNapiAddon != null) (_windowsWin32NetworkmanagementWnetNapiAddon.windowssys_windows_win32_networkmanagement_wnet_WNetGetConnectionA(lplocalname.toString(), lpremotename.toString(), lpnlength.toString()) as Int).toUInt() else 0u

public actual fun WNetGetConnectionW(lplocalname: PCWSTR, lpremotename: PWSTR, lpnlength: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementWnetNapiAddon != null) (_windowsWin32NetworkmanagementWnetNapiAddon.windowssys_windows_win32_networkmanagement_wnet_WNetGetConnectionW(lplocalname.toString(), lpremotename.toString(), lpnlength.toString()) as Int).toUInt() else 0u

public actual fun WNetGetLastErrorA(lperror: Long, lperrorbuf: PSTR, nerrorbufsize: UInt, lpnamebuf: PSTR, nnamebufsize: UInt): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementWnetNapiAddon != null) (_windowsWin32NetworkmanagementWnetNapiAddon.windowssys_windows_win32_networkmanagement_wnet_WNetGetLastErrorA(lperror.toString(), lperrorbuf.toString(), nerrorbufsize.toInt(), lpnamebuf.toString(), nnamebufsize.toInt()) as Int).toUInt() else 0u

public actual fun WNetGetLastErrorW(lperror: Long, lperrorbuf: PWSTR, nerrorbufsize: UInt, lpnamebuf: PWSTR, nnamebufsize: UInt): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementWnetNapiAddon != null) (_windowsWin32NetworkmanagementWnetNapiAddon.windowssys_windows_win32_networkmanagement_wnet_WNetGetLastErrorW(lperror.toString(), lperrorbuf.toString(), nerrorbufsize.toInt(), lpnamebuf.toString(), nnamebufsize.toInt()) as Int).toUInt() else 0u

public actual fun WNetGetNetworkInformationA(lpprovider: PCSTR, lpnetinfostruct: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementWnetNapiAddon != null) (_windowsWin32NetworkmanagementWnetNapiAddon.windowssys_windows_win32_networkmanagement_wnet_WNetGetNetworkInformationA(lpprovider.toString(), lpnetinfostruct.toString()) as Int).toUInt() else 0u

public actual fun WNetGetNetworkInformationW(lpprovider: PCWSTR, lpnetinfostruct: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementWnetNapiAddon != null) (_windowsWin32NetworkmanagementWnetNapiAddon.windowssys_windows_win32_networkmanagement_wnet_WNetGetNetworkInformationW(lpprovider.toString(), lpnetinfostruct.toString()) as Int).toUInt() else 0u

public actual fun WNetGetProviderNameA(dwnettype: UInt, lpprovidername: PSTR, lpbuffersize: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementWnetNapiAddon != null) (_windowsWin32NetworkmanagementWnetNapiAddon.windowssys_windows_win32_networkmanagement_wnet_WNetGetProviderNameA(dwnettype.toInt(), lpprovidername.toString(), lpbuffersize.toString()) as Int).toUInt() else 0u

public actual fun WNetGetProviderNameW(dwnettype: UInt, lpprovidername: PWSTR, lpbuffersize: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementWnetNapiAddon != null) (_windowsWin32NetworkmanagementWnetNapiAddon.windowssys_windows_win32_networkmanagement_wnet_WNetGetProviderNameW(dwnettype.toInt(), lpprovidername.toString(), lpbuffersize.toString()) as Int).toUInt() else 0u

public actual fun WNetGetResourceInformationA(lpnetresource: Long, lpbuffer: Long, lpcbbuffer: Long, lplpsystem: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementWnetNapiAddon != null) (_windowsWin32NetworkmanagementWnetNapiAddon.windowssys_windows_win32_networkmanagement_wnet_WNetGetResourceInformationA(lpnetresource.toString(), lpbuffer.toString(), lpcbbuffer.toString(), lplpsystem.toString()) as Int).toUInt() else 0u

public actual fun WNetGetResourceInformationW(lpnetresource: Long, lpbuffer: Long, lpcbbuffer: Long, lplpsystem: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementWnetNapiAddon != null) (_windowsWin32NetworkmanagementWnetNapiAddon.windowssys_windows_win32_networkmanagement_wnet_WNetGetResourceInformationW(lpnetresource.toString(), lpbuffer.toString(), lpcbbuffer.toString(), lplpsystem.toString()) as Int).toUInt() else 0u

public actual fun WNetGetResourceParentA(lpnetresource: Long, lpbuffer: Long, lpcbbuffer: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementWnetNapiAddon != null) (_windowsWin32NetworkmanagementWnetNapiAddon.windowssys_windows_win32_networkmanagement_wnet_WNetGetResourceParentA(lpnetresource.toString(), lpbuffer.toString(), lpcbbuffer.toString()) as Int).toUInt() else 0u

public actual fun WNetGetResourceParentW(lpnetresource: Long, lpbuffer: Long, lpcbbuffer: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementWnetNapiAddon != null) (_windowsWin32NetworkmanagementWnetNapiAddon.windowssys_windows_win32_networkmanagement_wnet_WNetGetResourceParentW(lpnetresource.toString(), lpbuffer.toString(), lpcbbuffer.toString()) as Int).toUInt() else 0u

public actual fun WNetGetUniversalNameA(lplocalpath: PCSTR, dwinfolevel: UNC_INFO_LEVEL, lpbuffer: Long, lpbuffersize: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementWnetNapiAddon != null) (_windowsWin32NetworkmanagementWnetNapiAddon.windowssys_windows_win32_networkmanagement_wnet_WNetGetUniversalNameA(lplocalpath.toString(), dwinfolevel.toInt(), lpbuffer.toString(), lpbuffersize.toString()) as Int).toUInt() else 0u

public actual fun WNetGetUniversalNameW(lplocalpath: PCWSTR, dwinfolevel: UNC_INFO_LEVEL, lpbuffer: Long, lpbuffersize: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementWnetNapiAddon != null) (_windowsWin32NetworkmanagementWnetNapiAddon.windowssys_windows_win32_networkmanagement_wnet_WNetGetUniversalNameW(lplocalpath.toString(), dwinfolevel.toInt(), lpbuffer.toString(), lpbuffersize.toString()) as Int).toUInt() else 0u

public actual fun WNetGetUserA(lpname: PCSTR, lpusername: PSTR, lpnlength: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementWnetNapiAddon != null) (_windowsWin32NetworkmanagementWnetNapiAddon.windowssys_windows_win32_networkmanagement_wnet_WNetGetUserA(lpname.toString(), lpusername.toString(), lpnlength.toString()) as Int).toUInt() else 0u

public actual fun WNetGetUserW(lpname: PCWSTR, lpusername: PWSTR, lpnlength: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementWnetNapiAddon != null) (_windowsWin32NetworkmanagementWnetNapiAddon.windowssys_windows_win32_networkmanagement_wnet_WNetGetUserW(lpname.toString(), lpusername.toString(), lpnlength.toString()) as Int).toUInt() else 0u

public actual fun WNetOpenEnumA(dwscope: NET_RESOURCE_SCOPE, dwtype: NET_RESOURCE_TYPE, dwusage: WNET_OPEN_ENUM_USAGE, lpnetresource: Long, lphenum: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementWnetNapiAddon != null) (_windowsWin32NetworkmanagementWnetNapiAddon.windowssys_windows_win32_networkmanagement_wnet_WNetOpenEnumA(dwscope.toInt(), dwtype.toInt(), dwusage.toInt(), lpnetresource.toString(), lphenum.toString()) as Int).toUInt() else 0u

public actual fun WNetOpenEnumW(dwscope: NET_RESOURCE_SCOPE, dwtype: NET_RESOURCE_TYPE, dwusage: WNET_OPEN_ENUM_USAGE, lpnetresource: Long, lphenum: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementWnetNapiAddon != null) (_windowsWin32NetworkmanagementWnetNapiAddon.windowssys_windows_win32_networkmanagement_wnet_WNetOpenEnumW(dwscope.toInt(), dwtype.toInt(), dwusage.toInt(), lpnetresource.toString(), lphenum.toString()) as Int).toUInt() else 0u

public actual fun WNetSetLastErrorA(err: UInt, lperror: PCSTR, lpproviders: PCSTR) {
    if (_windowsWin32NetworkmanagementWnetNapiAddon != null) {
        _windowsWin32NetworkmanagementWnetNapiAddon.windowssys_windows_win32_networkmanagement_wnet_WNetSetLastErrorA(err.toInt(), lperror.toString(), lpproviders.toString())
    }
}

public actual fun WNetSetLastErrorW(err: UInt, lperror: PCWSTR, lpproviders: PCWSTR) {
    if (_windowsWin32NetworkmanagementWnetNapiAddon != null) {
        _windowsWin32NetworkmanagementWnetNapiAddon.windowssys_windows_win32_networkmanagement_wnet_WNetSetLastErrorW(err.toInt(), lperror.toString(), lpproviders.toString())
    }
}

public actual fun WNetUseConnection4A(hwndowner: HWND, lpnetresource: Long, pauthbuffer: Long, cbauthbuffer: UInt, dwflags: UInt, lpuseoptions: Long, cbuseoptions: UInt, lpaccessname: PSTR, lpbuffersize: Long, lpresult: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementWnetNapiAddon != null) (_windowsWin32NetworkmanagementWnetNapiAddon.windowssys_windows_win32_networkmanagement_wnet_WNetUseConnection4A(hwndowner.toString(), lpnetresource.toString(), pauthbuffer.toString(), cbauthbuffer.toInt(), dwflags.toInt(), lpuseoptions.toString(), cbuseoptions.toInt(), lpaccessname.toString(), lpbuffersize.toString(), lpresult.toString()) as Int).toUInt() else 0u

public actual fun WNetUseConnection4W(hwndowner: HWND, lpnetresource: Long, pauthbuffer: Long, cbauthbuffer: UInt, dwflags: UInt, lpuseoptions: Long, cbuseoptions: UInt, lpaccessname: PWSTR, lpbuffersize: Long, lpresult: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementWnetNapiAddon != null) (_windowsWin32NetworkmanagementWnetNapiAddon.windowssys_windows_win32_networkmanagement_wnet_WNetUseConnection4W(hwndowner.toString(), lpnetresource.toString(), pauthbuffer.toString(), cbauthbuffer.toInt(), dwflags.toInt(), lpuseoptions.toString(), cbuseoptions.toInt(), lpaccessname.toString(), lpbuffersize.toString(), lpresult.toString()) as Int).toUInt() else 0u

public actual fun WNetUseConnectionA(hwndowner: HWND, lpnetresource: Long, lppassword: PCSTR, lpuserid: PCSTR, dwflags: NET_CONNECT_FLAGS, lpaccessname: PSTR, lpbuffersize: Long, lpresult: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementWnetNapiAddon != null) (_windowsWin32NetworkmanagementWnetNapiAddon.windowssys_windows_win32_networkmanagement_wnet_WNetUseConnectionA(hwndowner.toString(), lpnetresource.toString(), lppassword.toString(), lpuserid.toString(), dwflags.toInt(), lpaccessname.toString(), lpbuffersize.toString(), lpresult.toString()) as Int).toUInt() else 0u

public actual fun WNetUseConnectionW(hwndowner: HWND, lpnetresource: Long, lppassword: PCWSTR, lpuserid: PCWSTR, dwflags: NET_CONNECT_FLAGS, lpaccessname: PWSTR, lpbuffersize: Long, lpresult: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementWnetNapiAddon != null) (_windowsWin32NetworkmanagementWnetNapiAddon.windowssys_windows_win32_networkmanagement_wnet_WNetUseConnectionW(hwndowner.toString(), lpnetresource.toString(), lppassword.toString(), lpuserid.toString(), dwflags.toInt(), lpaccessname.toString(), lpbuffersize.toString(), lpresult.toString()) as Int).toUInt() else 0u
