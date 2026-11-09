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

private object WindowsWin32NetworkmanagementWnetJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_MultinetGetConnectionPerformanceA(lpnetresource: Long, lpnetconnectinfostruct: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_MultinetGetConnectionPerformanceW(lpnetresource: Long, lpnetconnectinfostruct: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_NPAddConnection(lpnetresource: Long, lppassword: Long, lpusername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_NPAddConnection3(hwndowner: Long, lpnetresource: Long, lppassword: Long, lpusername: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_NPAddConnection4(hwndowner: Long, lpnetresource: Long, lpauthbuffer: Long, cbauthbuffer: Int, dwflags: Int, lpuseoptions: Long, cbuseoptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_NPCancelConnection(lpname: Long, fforce: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_NPCancelConnection2(lpname: Long, fforce: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_NPCloseEnum(henum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_NPEnumResource(henum: Long, lpccount: Long, lpbuffer: Long, lpbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_NPFormatNetworkName(lpremotename: Long, lpformattedname: Long, lpnlength: Long, dwflags: Int, dwavecharperline: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_NPGetCaps(ndex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_NPGetConnection(lplocalname: Long, lpremotename: Long, lpnbufferlen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_NPGetConnection3(lplocalname: Long, dwlevel: Int, lpbuffer: Long, lpbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_NPGetConnectionPerformance(lpremotename: Long, lpnetconnectinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_NPGetPersistentUseOptionsForConnection(lpremotepath: Long, lpreaduseoptions: Long, cbreaduseoptions: Int, lpwriteuseoptions: Long, lpsizewriteuseoptions: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_NPGetResourceInformation(lpnetresource: Long, lpbuffer: Long, lpbuffersize: Long, lplpsystem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_NPGetResourceParent(lpnetresource: Long, lpbuffer: Long, lpbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_NPGetUniversalName(lplocalpath: Long, dwinfolevel: Int, lpbuffer: Long, lpbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_NPGetUser(lpname: Long, lpusername: Long, lpnbufferlen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_NPOpenEnum(dwscope: Int, dwtype: Int, dwusage: Int, lpnetresource: Long, lphenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_WNetAddConnection2A(lpnetresource: Long, lppassword: Long, lpusername: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_WNetAddConnection2W(lpnetresource: Long, lppassword: Long, lpusername: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_WNetAddConnection3A(hwndowner: Long, lpnetresource: Long, lppassword: Long, lpusername: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_WNetAddConnection3W(hwndowner: Long, lpnetresource: Long, lppassword: Long, lpusername: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_WNetAddConnection4A(hwndowner: Long, lpnetresource: Long, pauthbuffer: Long, cbauthbuffer: Int, dwflags: Int, lpuseoptions: Long, cbuseoptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_WNetAddConnection4W(hwndowner: Long, lpnetresource: Long, pauthbuffer: Long, cbauthbuffer: Int, dwflags: Int, lpuseoptions: Long, cbuseoptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_WNetAddConnectionA(lpremotename: Long, lppassword: Long, lplocalname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_WNetAddConnectionW(lpremotename: Long, lppassword: Long, lplocalname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_WNetCancelConnection2A(lpname: Long, dwflags: Int, fforce: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_WNetCancelConnection2W(lpname: Long, dwflags: Int, fforce: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_WNetCancelConnectionA(lpname: Long, fforce: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_WNetCancelConnectionW(lpname: Long, fforce: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_WNetCloseEnum(henum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_WNetConnectionDialog(hwnd: Long, dwtype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_WNetConnectionDialog1A(lpconndlgstruct: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_WNetConnectionDialog1W(lpconndlgstruct: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_WNetDisconnectDialog(hwnd: Long, dwtype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_WNetDisconnectDialog1A(lpconndlgstruct: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_WNetDisconnectDialog1W(lpconndlgstruct: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_WNetEnumResourceA(henum: Long, lpccount: Long, lpbuffer: Long, lpbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_WNetEnumResourceW(henum: Long, lpccount: Long, lpbuffer: Long, lpbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_WNetGetConnectionA(lplocalname: Long, lpremotename: Long, lpnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_WNetGetConnectionW(lplocalname: Long, lpremotename: Long, lpnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_WNetGetLastErrorA(lperror: Long, lperrorbuf: Long, nerrorbufsize: Int, lpnamebuf: Long, nnamebufsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_WNetGetLastErrorW(lperror: Long, lperrorbuf: Long, nerrorbufsize: Int, lpnamebuf: Long, nnamebufsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_WNetGetNetworkInformationA(lpprovider: Long, lpnetinfostruct: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_WNetGetNetworkInformationW(lpprovider: Long, lpnetinfostruct: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_WNetGetProviderNameA(dwnettype: Int, lpprovidername: Long, lpbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_WNetGetProviderNameW(dwnettype: Int, lpprovidername: Long, lpbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_WNetGetResourceInformationA(lpnetresource: Long, lpbuffer: Long, lpcbbuffer: Long, lplpsystem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_WNetGetResourceInformationW(lpnetresource: Long, lpbuffer: Long, lpcbbuffer: Long, lplpsystem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_WNetGetResourceParentA(lpnetresource: Long, lpbuffer: Long, lpcbbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_WNetGetResourceParentW(lpnetresource: Long, lpbuffer: Long, lpcbbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_WNetGetUniversalNameA(lplocalpath: Long, dwinfolevel: Int, lpbuffer: Long, lpbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_WNetGetUniversalNameW(lplocalpath: Long, dwinfolevel: Int, lpbuffer: Long, lpbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_WNetGetUserA(lpname: Long, lpusername: Long, lpnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_WNetGetUserW(lpname: Long, lpusername: Long, lpnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_WNetOpenEnumA(dwscope: Int, dwtype: Int, dwusage: Int, lpnetresource: Long, lphenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_WNetOpenEnumW(dwscope: Int, dwtype: Int, dwusage: Int, lpnetresource: Long, lphenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_WNetSetLastErrorA(err: Int, lperror: Long, lpproviders: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_WNetSetLastErrorW(err: Int, lperror: Long, lpproviders: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_WNetUseConnection4A(hwndowner: Long, lpnetresource: Long, pauthbuffer: Long, cbauthbuffer: Int, dwflags: Int, lpuseoptions: Long, cbuseoptions: Int, lpaccessname: Long, lpbuffersize: Long, lpresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_WNetUseConnection4W(hwndowner: Long, lpnetresource: Long, pauthbuffer: Long, cbauthbuffer: Int, dwflags: Int, lpuseoptions: Long, cbuseoptions: Int, lpaccessname: Long, lpbuffersize: Long, lpresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_WNetUseConnectionA(hwndowner: Long, lpnetresource: Long, lppassword: Long, lpuserid: Long, dwflags: Int, lpaccessname: Long, lpbuffersize: Long, lpresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_WNetUseConnectionW(hwndowner: Long, lpnetresource: Long, lppassword: Long, lpuserid: Long, dwflags: Int, lpaccessname: Long, lpbuffersize: Long, lpresult: Long): Int
}

public actual fun MultinetGetConnectionPerformanceA(lpnetresource: Long, lpnetconnectinfostruct: Long): UInt =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_MultinetGetConnectionPerformanceA(lpnetresource, lpnetconnectinfostruct).toUInt()

public actual fun MultinetGetConnectionPerformanceW(lpnetresource: Long, lpnetconnectinfostruct: Long): UInt =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_MultinetGetConnectionPerformanceW(lpnetresource, lpnetconnectinfostruct).toUInt()

public actual fun NPAddConnection(lpnetresource: Long, lppassword: PCWSTR, lpusername: PCWSTR): UInt =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_NPAddConnection(lpnetresource, lppassword, lpusername).toUInt()

public actual fun NPAddConnection3(hwndowner: HWND, lpnetresource: Long, lppassword: PCWSTR, lpusername: PCWSTR, dwflags: NET_CONNECT_FLAGS): UInt =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_NPAddConnection3(hwndowner, lpnetresource, lppassword, lpusername, dwflags.toInt()).toUInt()

public actual fun NPAddConnection4(hwndowner: HWND, lpnetresource: Long, lpauthbuffer: Long, cbauthbuffer: UInt, dwflags: UInt, lpuseoptions: Long, cbuseoptions: UInt): UInt =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_NPAddConnection4(hwndowner, lpnetresource, lpauthbuffer, cbauthbuffer.toInt(), dwflags.toInt(), lpuseoptions, cbuseoptions.toInt()).toUInt()

public actual fun NPCancelConnection(lpname: PCWSTR, fforce: BOOL): UInt =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_NPCancelConnection(lpname, fforce).toUInt()

public actual fun NPCancelConnection2(lpname: PCWSTR, fforce: BOOL, dwflags: UInt): UInt =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_NPCancelConnection2(lpname, fforce, dwflags.toInt()).toUInt()

public actual fun NPCloseEnum(henum: HANDLE): UInt =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_NPCloseEnum(henum).toUInt()

public actual fun NPEnumResource(henum: HANDLE, lpccount: Long, lpbuffer: Long, lpbuffersize: Long): UInt =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_NPEnumResource(henum, lpccount, lpbuffer, lpbuffersize).toUInt()

public actual fun NPFormatNetworkName(lpremotename: PCWSTR, lpformattedname: PWSTR, lpnlength: Long, dwflags: NETWORK_NAME_FORMAT_FLAGS, dwavecharperline: UInt): UInt =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_NPFormatNetworkName(lpremotename, lpformattedname, lpnlength, dwflags.toInt(), dwavecharperline.toInt()).toUInt()

public actual fun NPGetCaps(ndex: UInt): UInt =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_NPGetCaps(ndex.toInt()).toUInt()

public actual fun NPGetConnection(lplocalname: PCWSTR, lpremotename: PWSTR, lpnbufferlen: Long): UInt =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_NPGetConnection(lplocalname, lpremotename, lpnbufferlen).toUInt()

public actual fun NPGetConnection3(lplocalname: PCWSTR, dwlevel: UInt, lpbuffer: Long, lpbuffersize: Long): UInt =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_NPGetConnection3(lplocalname, dwlevel.toInt(), lpbuffer, lpbuffersize).toUInt()

public actual fun NPGetConnectionPerformance(lpremotename: PCWSTR, lpnetconnectinfo: Long): UInt =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_NPGetConnectionPerformance(lpremotename, lpnetconnectinfo).toUInt()

public actual fun NPGetPersistentUseOptionsForConnection(lpremotepath: PCWSTR, lpreaduseoptions: Long, cbreaduseoptions: UInt, lpwriteuseoptions: Long, lpsizewriteuseoptions: Long): UInt =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_NPGetPersistentUseOptionsForConnection(lpremotepath, lpreaduseoptions, cbreaduseoptions.toInt(), lpwriteuseoptions, lpsizewriteuseoptions).toUInt()

public actual fun NPGetResourceInformation(lpnetresource: Long, lpbuffer: Long, lpbuffersize: Long, lplpsystem: Long): UInt =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_NPGetResourceInformation(lpnetresource, lpbuffer, lpbuffersize, lplpsystem).toUInt()

public actual fun NPGetResourceParent(lpnetresource: Long, lpbuffer: Long, lpbuffersize: Long): UInt =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_NPGetResourceParent(lpnetresource, lpbuffer, lpbuffersize).toUInt()

public actual fun NPGetUniversalName(lplocalpath: PCWSTR, dwinfolevel: UNC_INFO_LEVEL, lpbuffer: Long, lpbuffersize: Long): UInt =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_NPGetUniversalName(lplocalpath, dwinfolevel.toInt(), lpbuffer, lpbuffersize).toUInt()

public actual fun NPGetUser(lpname: PCWSTR, lpusername: PWSTR, lpnbufferlen: Long): UInt =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_NPGetUser(lpname, lpusername, lpnbufferlen).toUInt()

public actual fun NPOpenEnum(dwscope: UInt, dwtype: UInt, dwusage: UInt, lpnetresource: Long, lphenum: Long): UInt =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_NPOpenEnum(dwscope.toInt(), dwtype.toInt(), dwusage.toInt(), lpnetresource, lphenum).toUInt()

public actual fun WNetAddConnection2A(lpnetresource: Long, lppassword: PCSTR, lpusername: PCSTR, dwflags: NET_CONNECT_FLAGS): WIN32_ERROR =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_WNetAddConnection2A(lpnetresource, lppassword, lpusername, dwflags.toInt()).toUInt()

public actual fun WNetAddConnection2W(lpnetresource: Long, lppassword: PCWSTR, lpusername: PCWSTR, dwflags: NET_CONNECT_FLAGS): WIN32_ERROR =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_WNetAddConnection2W(lpnetresource, lppassword, lpusername, dwflags.toInt()).toUInt()

public actual fun WNetAddConnection3A(hwndowner: HWND, lpnetresource: Long, lppassword: PCSTR, lpusername: PCSTR, dwflags: NET_CONNECT_FLAGS): WIN32_ERROR =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_WNetAddConnection3A(hwndowner, lpnetresource, lppassword, lpusername, dwflags.toInt()).toUInt()

public actual fun WNetAddConnection3W(hwndowner: HWND, lpnetresource: Long, lppassword: PCWSTR, lpusername: PCWSTR, dwflags: NET_CONNECT_FLAGS): WIN32_ERROR =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_WNetAddConnection3W(hwndowner, lpnetresource, lppassword, lpusername, dwflags.toInt()).toUInt()

public actual fun WNetAddConnection4A(hwndowner: HWND, lpnetresource: Long, pauthbuffer: Long, cbauthbuffer: UInt, dwflags: NET_CONNECT_FLAGS, lpuseoptions: Long, cbuseoptions: UInt): WIN32_ERROR =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_WNetAddConnection4A(hwndowner, lpnetresource, pauthbuffer, cbauthbuffer.toInt(), dwflags.toInt(), lpuseoptions, cbuseoptions.toInt()).toUInt()

public actual fun WNetAddConnection4W(hwndowner: HWND, lpnetresource: Long, pauthbuffer: Long, cbauthbuffer: UInt, dwflags: NET_CONNECT_FLAGS, lpuseoptions: Long, cbuseoptions: UInt): WIN32_ERROR =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_WNetAddConnection4W(hwndowner, lpnetresource, pauthbuffer, cbauthbuffer.toInt(), dwflags.toInt(), lpuseoptions, cbuseoptions.toInt()).toUInt()

public actual fun WNetAddConnectionA(lpremotename: PCSTR, lppassword: PCSTR, lplocalname: PCSTR): WIN32_ERROR =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_WNetAddConnectionA(lpremotename, lppassword, lplocalname).toUInt()

public actual fun WNetAddConnectionW(lpremotename: PCWSTR, lppassword: PCWSTR, lplocalname: PCWSTR): WIN32_ERROR =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_WNetAddConnectionW(lpremotename, lppassword, lplocalname).toUInt()

public actual fun WNetCancelConnection2A(lpname: PCSTR, dwflags: NET_CONNECT_FLAGS, fforce: BOOL): WIN32_ERROR =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_WNetCancelConnection2A(lpname, dwflags.toInt(), fforce).toUInt()

public actual fun WNetCancelConnection2W(lpname: PCWSTR, dwflags: NET_CONNECT_FLAGS, fforce: BOOL): WIN32_ERROR =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_WNetCancelConnection2W(lpname, dwflags.toInt(), fforce).toUInt()

public actual fun WNetCancelConnectionA(lpname: PCSTR, fforce: BOOL): WIN32_ERROR =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_WNetCancelConnectionA(lpname, fforce).toUInt()

public actual fun WNetCancelConnectionW(lpname: PCWSTR, fforce: BOOL): WIN32_ERROR =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_WNetCancelConnectionW(lpname, fforce).toUInt()

public actual fun WNetCloseEnum(henum: HANDLE): WIN32_ERROR =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_WNetCloseEnum(henum).toUInt()

public actual fun WNetConnectionDialog(hwnd: HWND, dwtype: UInt): WIN32_ERROR =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_WNetConnectionDialog(hwnd, dwtype.toInt()).toUInt()

public actual fun WNetConnectionDialog1A(lpconndlgstruct: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_WNetConnectionDialog1A(lpconndlgstruct).toUInt()

public actual fun WNetConnectionDialog1W(lpconndlgstruct: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_WNetConnectionDialog1W(lpconndlgstruct).toUInt()

public actual fun WNetDisconnectDialog(hwnd: HWND, dwtype: UInt): WIN32_ERROR =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_WNetDisconnectDialog(hwnd, dwtype.toInt()).toUInt()

public actual fun WNetDisconnectDialog1A(lpconndlgstruct: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_WNetDisconnectDialog1A(lpconndlgstruct).toUInt()

public actual fun WNetDisconnectDialog1W(lpconndlgstruct: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_WNetDisconnectDialog1W(lpconndlgstruct).toUInt()

public actual fun WNetEnumResourceA(henum: HANDLE, lpccount: Long, lpbuffer: Long, lpbuffersize: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_WNetEnumResourceA(henum, lpccount, lpbuffer, lpbuffersize).toUInt()

public actual fun WNetEnumResourceW(henum: HANDLE, lpccount: Long, lpbuffer: Long, lpbuffersize: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_WNetEnumResourceW(henum, lpccount, lpbuffer, lpbuffersize).toUInt()

public actual fun WNetGetConnectionA(lplocalname: PCSTR, lpremotename: PSTR, lpnlength: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_WNetGetConnectionA(lplocalname, lpremotename, lpnlength).toUInt()

public actual fun WNetGetConnectionW(lplocalname: PCWSTR, lpremotename: PWSTR, lpnlength: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_WNetGetConnectionW(lplocalname, lpremotename, lpnlength).toUInt()

public actual fun WNetGetLastErrorA(lperror: Long, lperrorbuf: PSTR, nerrorbufsize: UInt, lpnamebuf: PSTR, nnamebufsize: UInt): WIN32_ERROR =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_WNetGetLastErrorA(lperror, lperrorbuf, nerrorbufsize.toInt(), lpnamebuf, nnamebufsize.toInt()).toUInt()

public actual fun WNetGetLastErrorW(lperror: Long, lperrorbuf: PWSTR, nerrorbufsize: UInt, lpnamebuf: PWSTR, nnamebufsize: UInt): WIN32_ERROR =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_WNetGetLastErrorW(lperror, lperrorbuf, nerrorbufsize.toInt(), lpnamebuf, nnamebufsize.toInt()).toUInt()

public actual fun WNetGetNetworkInformationA(lpprovider: PCSTR, lpnetinfostruct: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_WNetGetNetworkInformationA(lpprovider, lpnetinfostruct).toUInt()

public actual fun WNetGetNetworkInformationW(lpprovider: PCWSTR, lpnetinfostruct: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_WNetGetNetworkInformationW(lpprovider, lpnetinfostruct).toUInt()

public actual fun WNetGetProviderNameA(dwnettype: UInt, lpprovidername: PSTR, lpbuffersize: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_WNetGetProviderNameA(dwnettype.toInt(), lpprovidername, lpbuffersize).toUInt()

public actual fun WNetGetProviderNameW(dwnettype: UInt, lpprovidername: PWSTR, lpbuffersize: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_WNetGetProviderNameW(dwnettype.toInt(), lpprovidername, lpbuffersize).toUInt()

public actual fun WNetGetResourceInformationA(lpnetresource: Long, lpbuffer: Long, lpcbbuffer: Long, lplpsystem: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_WNetGetResourceInformationA(lpnetresource, lpbuffer, lpcbbuffer, lplpsystem).toUInt()

public actual fun WNetGetResourceInformationW(lpnetresource: Long, lpbuffer: Long, lpcbbuffer: Long, lplpsystem: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_WNetGetResourceInformationW(lpnetresource, lpbuffer, lpcbbuffer, lplpsystem).toUInt()

public actual fun WNetGetResourceParentA(lpnetresource: Long, lpbuffer: Long, lpcbbuffer: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_WNetGetResourceParentA(lpnetresource, lpbuffer, lpcbbuffer).toUInt()

public actual fun WNetGetResourceParentW(lpnetresource: Long, lpbuffer: Long, lpcbbuffer: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_WNetGetResourceParentW(lpnetresource, lpbuffer, lpcbbuffer).toUInt()

public actual fun WNetGetUniversalNameA(lplocalpath: PCSTR, dwinfolevel: UNC_INFO_LEVEL, lpbuffer: Long, lpbuffersize: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_WNetGetUniversalNameA(lplocalpath, dwinfolevel.toInt(), lpbuffer, lpbuffersize).toUInt()

public actual fun WNetGetUniversalNameW(lplocalpath: PCWSTR, dwinfolevel: UNC_INFO_LEVEL, lpbuffer: Long, lpbuffersize: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_WNetGetUniversalNameW(lplocalpath, dwinfolevel.toInt(), lpbuffer, lpbuffersize).toUInt()

public actual fun WNetGetUserA(lpname: PCSTR, lpusername: PSTR, lpnlength: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_WNetGetUserA(lpname, lpusername, lpnlength).toUInt()

public actual fun WNetGetUserW(lpname: PCWSTR, lpusername: PWSTR, lpnlength: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_WNetGetUserW(lpname, lpusername, lpnlength).toUInt()

public actual fun WNetOpenEnumA(dwscope: NET_RESOURCE_SCOPE, dwtype: NET_RESOURCE_TYPE, dwusage: WNET_OPEN_ENUM_USAGE, lpnetresource: Long, lphenum: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_WNetOpenEnumA(dwscope.toInt(), dwtype.toInt(), dwusage.toInt(), lpnetresource, lphenum).toUInt()

public actual fun WNetOpenEnumW(dwscope: NET_RESOURCE_SCOPE, dwtype: NET_RESOURCE_TYPE, dwusage: WNET_OPEN_ENUM_USAGE, lpnetresource: Long, lphenum: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_WNetOpenEnumW(dwscope.toInt(), dwtype.toInt(), dwusage.toInt(), lpnetresource, lphenum).toUInt()

public actual fun WNetSetLastErrorA(err: UInt, lperror: PCSTR, lpproviders: PCSTR) {
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_WNetSetLastErrorA(err.toInt(), lperror, lpproviders)
}

public actual fun WNetSetLastErrorW(err: UInt, lperror: PCWSTR, lpproviders: PCWSTR) {
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_WNetSetLastErrorW(err.toInt(), lperror, lpproviders)
}

public actual fun WNetUseConnection4A(hwndowner: HWND, lpnetresource: Long, pauthbuffer: Long, cbauthbuffer: UInt, dwflags: UInt, lpuseoptions: Long, cbuseoptions: UInt, lpaccessname: PSTR, lpbuffersize: Long, lpresult: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_WNetUseConnection4A(hwndowner, lpnetresource, pauthbuffer, cbauthbuffer.toInt(), dwflags.toInt(), lpuseoptions, cbuseoptions.toInt(), lpaccessname, lpbuffersize, lpresult).toUInt()

public actual fun WNetUseConnection4W(hwndowner: HWND, lpnetresource: Long, pauthbuffer: Long, cbauthbuffer: UInt, dwflags: UInt, lpuseoptions: Long, cbuseoptions: UInt, lpaccessname: PWSTR, lpbuffersize: Long, lpresult: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_WNetUseConnection4W(hwndowner, lpnetresource, pauthbuffer, cbauthbuffer.toInt(), dwflags.toInt(), lpuseoptions, cbuseoptions.toInt(), lpaccessname, lpbuffersize, lpresult).toUInt()

public actual fun WNetUseConnectionA(hwndowner: HWND, lpnetresource: Long, lppassword: PCSTR, lpuserid: PCSTR, dwflags: NET_CONNECT_FLAGS, lpaccessname: PSTR, lpbuffersize: Long, lpresult: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_WNetUseConnectionA(hwndowner, lpnetresource, lppassword, lpuserid, dwflags.toInt(), lpaccessname, lpbuffersize, lpresult).toUInt()

public actual fun WNetUseConnectionW(hwndowner: HWND, lpnetresource: Long, lppassword: PCWSTR, lpuserid: PCWSTR, dwflags: NET_CONNECT_FLAGS, lpaccessname: PWSTR, lpbuffersize: Long, lpresult: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_WNetUseConnectionW(hwndowner, lpnetresource, lppassword, lpuserid, dwflags.toInt(), lpaccessname, lpbuffersize, lpresult).toUInt()
