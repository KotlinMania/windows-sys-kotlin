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

private object WindowsWin32NetworkmanagementWnetJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_multinetGetConnectionPerformanceA(lpnetresource: Long, lpnetconnectinfostruct: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_multinetGetConnectionPerformanceW(lpnetresource: Long, lpnetconnectinfostruct: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_nPAddConnection(lpnetresource: Long, lppassword: Long, lpusername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_nPAddConnection3(hwndowner: Long, lpnetresource: Long, lppassword: Long, lpusername: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_nPAddConnection4(hwndowner: Long, lpnetresource: Long, lpauthbuffer: Long, cbauthbuffer: Int, dwflags: Int, lpuseoptions: Long, cbuseoptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_nPCancelConnection(lpname: Long, fforce: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_nPCancelConnection2(lpname: Long, fforce: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_nPCloseEnum(henum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_nPEnumResource(henum: Long, lpccount: Long, lpbuffer: Long, lpbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_nPFormatNetworkName(lpremotename: Long, lpformattedname: Long, lpnlength: Long, dwflags: Int, dwavecharperline: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_nPGetCaps(ndex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_nPGetConnection(lplocalname: Long, lpremotename: Long, lpnbufferlen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_nPGetConnection3(lplocalname: Long, dwlevel: Int, lpbuffer: Long, lpbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_nPGetConnectionPerformance(lpremotename: Long, lpnetconnectinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_nPGetPersistentUseOptionsForConnection(lpremotepath: Long, lpreaduseoptions: Long, cbreaduseoptions: Int, lpwriteuseoptions: Long, lpsizewriteuseoptions: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_nPGetResourceInformation(lpnetresource: Long, lpbuffer: Long, lpbuffersize: Long, lplpsystem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_nPGetResourceParent(lpnetresource: Long, lpbuffer: Long, lpbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_nPGetUniversalName(lplocalpath: Long, dwinfolevel: Int, lpbuffer: Long, lpbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_nPGetUser(lpname: Long, lpusername: Long, lpnbufferlen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_nPOpenEnum(dwscope: Int, dwtype: Int, dwusage: Int, lpnetresource: Long, lphenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_wNetAddConnection2A(lpnetresource: Long, lppassword: Long, lpusername: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_wNetAddConnection2W(lpnetresource: Long, lppassword: Long, lpusername: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_wNetAddConnection3A(hwndowner: Long, lpnetresource: Long, lppassword: Long, lpusername: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_wNetAddConnection3W(hwndowner: Long, lpnetresource: Long, lppassword: Long, lpusername: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_wNetAddConnection4A(hwndowner: Long, lpnetresource: Long, pauthbuffer: Long, cbauthbuffer: Int, dwflags: Int, lpuseoptions: Long, cbuseoptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_wNetAddConnection4W(hwndowner: Long, lpnetresource: Long, pauthbuffer: Long, cbauthbuffer: Int, dwflags: Int, lpuseoptions: Long, cbuseoptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_wNetAddConnectionA(lpremotename: Long, lppassword: Long, lplocalname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_wNetAddConnectionW(lpremotename: Long, lppassword: Long, lplocalname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_wNetCancelConnection2A(lpname: Long, dwflags: Int, fforce: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_wNetCancelConnection2W(lpname: Long, dwflags: Int, fforce: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_wNetCancelConnectionA(lpname: Long, fforce: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_wNetCancelConnectionW(lpname: Long, fforce: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_wNetCloseEnum(henum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_wNetConnectionDialog(hwnd: Long, dwtype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_wNetConnectionDialog1A(lpconndlgstruct: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_wNetConnectionDialog1W(lpconndlgstruct: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_wNetDisconnectDialog(hwnd: Long, dwtype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_wNetDisconnectDialog1A(lpconndlgstruct: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_wNetDisconnectDialog1W(lpconndlgstruct: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_wNetEnumResourceA(henum: Long, lpccount: Long, lpbuffer: Long, lpbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_wNetEnumResourceW(henum: Long, lpccount: Long, lpbuffer: Long, lpbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_wNetGetConnectionA(lplocalname: Long, lpremotename: Long, lpnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_wNetGetConnectionW(lplocalname: Long, lpremotename: Long, lpnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_wNetGetLastErrorA(lperror: Long, lperrorbuf: Long, nerrorbufsize: Int, lpnamebuf: Long, nnamebufsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_wNetGetLastErrorW(lperror: Long, lperrorbuf: Long, nerrorbufsize: Int, lpnamebuf: Long, nnamebufsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_wNetGetNetworkInformationA(lpprovider: Long, lpnetinfostruct: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_wNetGetNetworkInformationW(lpprovider: Long, lpnetinfostruct: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_wNetGetProviderNameA(dwnettype: Int, lpprovidername: Long, lpbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_wNetGetProviderNameW(dwnettype: Int, lpprovidername: Long, lpbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_wNetGetResourceInformationA(lpnetresource: Long, lpbuffer: Long, lpcbbuffer: Long, lplpsystem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_wNetGetResourceInformationW(lpnetresource: Long, lpbuffer: Long, lpcbbuffer: Long, lplpsystem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_wNetGetResourceParentA(lpnetresource: Long, lpbuffer: Long, lpcbbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_wNetGetResourceParentW(lpnetresource: Long, lpbuffer: Long, lpcbbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_wNetGetUniversalNameA(lplocalpath: Long, dwinfolevel: Int, lpbuffer: Long, lpbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_wNetGetUniversalNameW(lplocalpath: Long, dwinfolevel: Int, lpbuffer: Long, lpbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_wNetGetUserA(lpname: Long, lpusername: Long, lpnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_wNetGetUserW(lpname: Long, lpusername: Long, lpnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_wNetOpenEnumA(dwscope: Int, dwtype: Int, dwusage: Int, lpnetresource: Long, lphenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_wNetOpenEnumW(dwscope: Int, dwtype: Int, dwusage: Int, lpnetresource: Long, lphenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_wNetSetLastErrorA(err: Int, lperror: Long, lpproviders: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_wNetSetLastErrorW(err: Int, lperror: Long, lpproviders: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_wNetUseConnection4A(hwndowner: Long, lpnetresource: Long, pauthbuffer: Long, cbauthbuffer: Int, dwflags: Int, lpuseoptions: Long, cbuseoptions: Int, lpaccessname: Long, lpbuffersize: Long, lpresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_wNetUseConnection4W(hwndowner: Long, lpnetresource: Long, pauthbuffer: Long, cbauthbuffer: Int, dwflags: Int, lpuseoptions: Long, cbuseoptions: Int, lpaccessname: Long, lpbuffersize: Long, lpresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_wNetUseConnectionA(hwndowner: Long, lpnetresource: Long, lppassword: Long, lpuserid: Long, dwflags: Int, lpaccessname: Long, lpbuffersize: Long, lpresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_wnet_wNetUseConnectionW(hwndowner: Long, lpnetresource: Long, lppassword: Long, lpuserid: Long, dwflags: Int, lpaccessname: Long, lpbuffersize: Long, lpresult: Long): Int
}

public actual fun multinetGetConnectionPerformanceA(lpnetresource: COpaquePointer?, lpnetconnectinfostruct: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_multinetGetConnectionPerformanceA((lpnetresource?.value ?: 0L), (lpnetconnectinfostruct?.value ?: 0L)).toUInt()

public actual fun multinetGetConnectionPerformanceW(lpnetresource: COpaquePointer?, lpnetconnectinfostruct: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_multinetGetConnectionPerformanceW((lpnetresource?.value ?: 0L), (lpnetconnectinfostruct?.value ?: 0L)).toUInt()

public actual fun nPAddConnection(lpnetresource: COpaquePointer?, lppassword: Pcwstr, lpusername: Pcwstr): UInt =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_nPAddConnection((lpnetresource?.value ?: 0L), (lppassword?.value ?: 0L), (lpusername?.value ?: 0L)).toUInt()

public actual fun nPAddConnection3(hwndowner: Hwnd, lpnetresource: COpaquePointer?, lppassword: Pcwstr, lpusername: Pcwstr, dwflags: NetConnectFlags): UInt =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_nPAddConnection3((hwndowner?.value ?: 0L), (lpnetresource?.value ?: 0L), (lppassword?.value ?: 0L), (lpusername?.value ?: 0L), dwflags.toInt()).toUInt()

public actual fun nPAddConnection4(hwndowner: Hwnd, lpnetresource: COpaquePointer?, lpauthbuffer: COpaquePointer?, cbauthbuffer: UInt, dwflags: UInt, lpuseoptions: COpaquePointer?, cbuseoptions: UInt): UInt =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_nPAddConnection4((hwndowner?.value ?: 0L), (lpnetresource?.value ?: 0L), (lpauthbuffer?.value ?: 0L), cbauthbuffer.toInt(), dwflags.toInt(), (lpuseoptions?.value ?: 0L), cbuseoptions.toInt()).toUInt()

public actual fun nPCancelConnection(lpname: Pcwstr, fforce: Bool): UInt =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_nPCancelConnection((lpname?.value ?: 0L), fforce).toUInt()

public actual fun nPCancelConnection2(lpname: Pcwstr, fforce: Bool, dwflags: UInt): UInt =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_nPCancelConnection2((lpname?.value ?: 0L), fforce, dwflags.toInt()).toUInt()

public actual fun nPCloseEnum(henum: Handle): UInt =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_nPCloseEnum((henum?.value ?: 0L)).toUInt()

public actual fun nPEnumResource(henum: Handle, lpccount: COpaquePointer?, lpbuffer: COpaquePointer?, lpbuffersize: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_nPEnumResource((henum?.value ?: 0L), (lpccount?.value ?: 0L), (lpbuffer?.value ?: 0L), (lpbuffersize?.value ?: 0L)).toUInt()

public actual fun nPFormatNetworkName(lpremotename: Pcwstr, lpformattedname: Pwstr, lpnlength: COpaquePointer?, dwflags: NetworkNameFormatFlags, dwavecharperline: UInt): UInt =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_nPFormatNetworkName((lpremotename?.value ?: 0L), (lpformattedname?.value ?: 0L), (lpnlength?.value ?: 0L), dwflags.toInt(), dwavecharperline.toInt()).toUInt()

public actual fun nPGetCaps(ndex: UInt): UInt =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_nPGetCaps(ndex.toInt()).toUInt()

public actual fun nPGetConnection(lplocalname: Pcwstr, lpremotename: Pwstr, lpnbufferlen: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_nPGetConnection((lplocalname?.value ?: 0L), (lpremotename?.value ?: 0L), (lpnbufferlen?.value ?: 0L)).toUInt()

public actual fun nPGetConnection3(lplocalname: Pcwstr, dwlevel: UInt, lpbuffer: COpaquePointer?, lpbuffersize: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_nPGetConnection3((lplocalname?.value ?: 0L), dwlevel.toInt(), (lpbuffer?.value ?: 0L), (lpbuffersize?.value ?: 0L)).toUInt()

public actual fun nPGetConnectionPerformance(lpremotename: Pcwstr, lpnetconnectinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_nPGetConnectionPerformance((lpremotename?.value ?: 0L), (lpnetconnectinfo?.value ?: 0L)).toUInt()

public actual fun nPGetPersistentUseOptionsForConnection(lpremotepath: Pcwstr, lpreaduseoptions: COpaquePointer?, cbreaduseoptions: UInt, lpwriteuseoptions: COpaquePointer?, lpsizewriteuseoptions: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_nPGetPersistentUseOptionsForConnection((lpremotepath?.value ?: 0L), (lpreaduseoptions?.value ?: 0L), cbreaduseoptions.toInt(), (lpwriteuseoptions?.value ?: 0L), (lpsizewriteuseoptions?.value ?: 0L)).toUInt()

public actual fun nPGetResourceInformation(lpnetresource: COpaquePointer?, lpbuffer: COpaquePointer?, lpbuffersize: COpaquePointer?, lplpsystem: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_nPGetResourceInformation((lpnetresource?.value ?: 0L), (lpbuffer?.value ?: 0L), (lpbuffersize?.value ?: 0L), (lplpsystem?.value ?: 0L)).toUInt()

public actual fun nPGetResourceParent(lpnetresource: COpaquePointer?, lpbuffer: COpaquePointer?, lpbuffersize: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_nPGetResourceParent((lpnetresource?.value ?: 0L), (lpbuffer?.value ?: 0L), (lpbuffersize?.value ?: 0L)).toUInt()

public actual fun nPGetUniversalName(lplocalpath: Pcwstr, dwinfolevel: UncInfoLevel, lpbuffer: COpaquePointer?, lpbuffersize: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_nPGetUniversalName((lplocalpath?.value ?: 0L), dwinfolevel.toInt(), (lpbuffer?.value ?: 0L), (lpbuffersize?.value ?: 0L)).toUInt()

public actual fun nPGetUser(lpname: Pcwstr, lpusername: Pwstr, lpnbufferlen: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_nPGetUser((lpname?.value ?: 0L), (lpusername?.value ?: 0L), (lpnbufferlen?.value ?: 0L)).toUInt()

public actual fun nPOpenEnum(dwscope: UInt, dwtype: UInt, dwusage: UInt, lpnetresource: COpaquePointer?, lphenum: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_nPOpenEnum(dwscope.toInt(), dwtype.toInt(), dwusage.toInt(), (lpnetresource?.value ?: 0L), (lphenum?.value ?: 0L)).toUInt()

public actual fun wNetAddConnection2A(lpnetresource: COpaquePointer?, lppassword: Pcstr, lpusername: Pcstr, dwflags: NetConnectFlags): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_wNetAddConnection2A((lpnetresource?.value ?: 0L), (lppassword?.value ?: 0L), (lpusername?.value ?: 0L), dwflags.toInt()).toUInt()

public actual fun wNetAddConnection2W(lpnetresource: COpaquePointer?, lppassword: Pcwstr, lpusername: Pcwstr, dwflags: NetConnectFlags): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_wNetAddConnection2W((lpnetresource?.value ?: 0L), (lppassword?.value ?: 0L), (lpusername?.value ?: 0L), dwflags.toInt()).toUInt()

public actual fun wNetAddConnection3A(hwndowner: Hwnd, lpnetresource: COpaquePointer?, lppassword: Pcstr, lpusername: Pcstr, dwflags: NetConnectFlags): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_wNetAddConnection3A((hwndowner?.value ?: 0L), (lpnetresource?.value ?: 0L), (lppassword?.value ?: 0L), (lpusername?.value ?: 0L), dwflags.toInt()).toUInt()

public actual fun wNetAddConnection3W(hwndowner: Hwnd, lpnetresource: COpaquePointer?, lppassword: Pcwstr, lpusername: Pcwstr, dwflags: NetConnectFlags): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_wNetAddConnection3W((hwndowner?.value ?: 0L), (lpnetresource?.value ?: 0L), (lppassword?.value ?: 0L), (lpusername?.value ?: 0L), dwflags.toInt()).toUInt()

public actual fun wNetAddConnection4A(hwndowner: Hwnd, lpnetresource: COpaquePointer?, pauthbuffer: COpaquePointer?, cbauthbuffer: UInt, dwflags: NetConnectFlags, lpuseoptions: COpaquePointer?, cbuseoptions: UInt): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_wNetAddConnection4A((hwndowner?.value ?: 0L), (lpnetresource?.value ?: 0L), (pauthbuffer?.value ?: 0L), cbauthbuffer.toInt(), dwflags.toInt(), (lpuseoptions?.value ?: 0L), cbuseoptions.toInt()).toUInt()

public actual fun wNetAddConnection4W(hwndowner: Hwnd, lpnetresource: COpaquePointer?, pauthbuffer: COpaquePointer?, cbauthbuffer: UInt, dwflags: NetConnectFlags, lpuseoptions: COpaquePointer?, cbuseoptions: UInt): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_wNetAddConnection4W((hwndowner?.value ?: 0L), (lpnetresource?.value ?: 0L), (pauthbuffer?.value ?: 0L), cbauthbuffer.toInt(), dwflags.toInt(), (lpuseoptions?.value ?: 0L), cbuseoptions.toInt()).toUInt()

public actual fun wNetAddConnectionA(lpremotename: Pcstr, lppassword: Pcstr, lplocalname: Pcstr): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_wNetAddConnectionA((lpremotename?.value ?: 0L), (lppassword?.value ?: 0L), (lplocalname?.value ?: 0L)).toUInt()

public actual fun wNetAddConnectionW(lpremotename: Pcwstr, lppassword: Pcwstr, lplocalname: Pcwstr): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_wNetAddConnectionW((lpremotename?.value ?: 0L), (lppassword?.value ?: 0L), (lplocalname?.value ?: 0L)).toUInt()

public actual fun wNetCancelConnection2A(lpname: Pcstr, dwflags: NetConnectFlags, fforce: Bool): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_wNetCancelConnection2A((lpname?.value ?: 0L), dwflags.toInt(), fforce).toUInt()

public actual fun wNetCancelConnection2W(lpname: Pcwstr, dwflags: NetConnectFlags, fforce: Bool): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_wNetCancelConnection2W((lpname?.value ?: 0L), dwflags.toInt(), fforce).toUInt()

public actual fun wNetCancelConnectionA(lpname: Pcstr, fforce: Bool): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_wNetCancelConnectionA((lpname?.value ?: 0L), fforce).toUInt()

public actual fun wNetCancelConnectionW(lpname: Pcwstr, fforce: Bool): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_wNetCancelConnectionW((lpname?.value ?: 0L), fforce).toUInt()

public actual fun wNetCloseEnum(henum: Handle): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_wNetCloseEnum((henum?.value ?: 0L)).toUInt()

public actual fun wNetConnectionDialog(hwnd: Hwnd, dwtype: UInt): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_wNetConnectionDialog((hwnd?.value ?: 0L), dwtype.toInt()).toUInt()

public actual fun wNetConnectionDialog1A(lpconndlgstruct: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_wNetConnectionDialog1A((lpconndlgstruct?.value ?: 0L)).toUInt()

public actual fun wNetConnectionDialog1W(lpconndlgstruct: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_wNetConnectionDialog1W((lpconndlgstruct?.value ?: 0L)).toUInt()

public actual fun wNetDisconnectDialog(hwnd: Hwnd, dwtype: UInt): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_wNetDisconnectDialog((hwnd?.value ?: 0L), dwtype.toInt()).toUInt()

public actual fun wNetDisconnectDialog1A(lpconndlgstruct: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_wNetDisconnectDialog1A((lpconndlgstruct?.value ?: 0L)).toUInt()

public actual fun wNetDisconnectDialog1W(lpconndlgstruct: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_wNetDisconnectDialog1W((lpconndlgstruct?.value ?: 0L)).toUInt()

public actual fun wNetEnumResourceA(henum: Handle, lpccount: COpaquePointer?, lpbuffer: COpaquePointer?, lpbuffersize: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_wNetEnumResourceA((henum?.value ?: 0L), (lpccount?.value ?: 0L), (lpbuffer?.value ?: 0L), (lpbuffersize?.value ?: 0L)).toUInt()

public actual fun wNetEnumResourceW(henum: Handle, lpccount: COpaquePointer?, lpbuffer: COpaquePointer?, lpbuffersize: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_wNetEnumResourceW((henum?.value ?: 0L), (lpccount?.value ?: 0L), (lpbuffer?.value ?: 0L), (lpbuffersize?.value ?: 0L)).toUInt()

public actual fun wNetGetConnectionA(lplocalname: Pcstr, lpremotename: Pstr, lpnlength: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_wNetGetConnectionA((lplocalname?.value ?: 0L), (lpremotename?.value ?: 0L), (lpnlength?.value ?: 0L)).toUInt()

public actual fun wNetGetConnectionW(lplocalname: Pcwstr, lpremotename: Pwstr, lpnlength: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_wNetGetConnectionW((lplocalname?.value ?: 0L), (lpremotename?.value ?: 0L), (lpnlength?.value ?: 0L)).toUInt()

public actual fun wNetGetLastErrorA(lperror: COpaquePointer?, lperrorbuf: Pstr, nerrorbufsize: UInt, lpnamebuf: Pstr, nnamebufsize: UInt): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_wNetGetLastErrorA((lperror?.value ?: 0L), (lperrorbuf?.value ?: 0L), nerrorbufsize.toInt(), (lpnamebuf?.value ?: 0L), nnamebufsize.toInt()).toUInt()

public actual fun wNetGetLastErrorW(lperror: COpaquePointer?, lperrorbuf: Pwstr, nerrorbufsize: UInt, lpnamebuf: Pwstr, nnamebufsize: UInt): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_wNetGetLastErrorW((lperror?.value ?: 0L), (lperrorbuf?.value ?: 0L), nerrorbufsize.toInt(), (lpnamebuf?.value ?: 0L), nnamebufsize.toInt()).toUInt()

public actual fun wNetGetNetworkInformationA(lpprovider: Pcstr, lpnetinfostruct: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_wNetGetNetworkInformationA((lpprovider?.value ?: 0L), (lpnetinfostruct?.value ?: 0L)).toUInt()

public actual fun wNetGetNetworkInformationW(lpprovider: Pcwstr, lpnetinfostruct: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_wNetGetNetworkInformationW((lpprovider?.value ?: 0L), (lpnetinfostruct?.value ?: 0L)).toUInt()

public actual fun wNetGetProviderNameA(dwnettype: UInt, lpprovidername: Pstr, lpbuffersize: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_wNetGetProviderNameA(dwnettype.toInt(), (lpprovidername?.value ?: 0L), (lpbuffersize?.value ?: 0L)).toUInt()

public actual fun wNetGetProviderNameW(dwnettype: UInt, lpprovidername: Pwstr, lpbuffersize: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_wNetGetProviderNameW(dwnettype.toInt(), (lpprovidername?.value ?: 0L), (lpbuffersize?.value ?: 0L)).toUInt()

public actual fun wNetGetResourceInformationA(lpnetresource: COpaquePointer?, lpbuffer: COpaquePointer?, lpcbbuffer: COpaquePointer?, lplpsystem: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_wNetGetResourceInformationA((lpnetresource?.value ?: 0L), (lpbuffer?.value ?: 0L), (lpcbbuffer?.value ?: 0L), (lplpsystem?.value ?: 0L)).toUInt()

public actual fun wNetGetResourceInformationW(lpnetresource: COpaquePointer?, lpbuffer: COpaquePointer?, lpcbbuffer: COpaquePointer?, lplpsystem: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_wNetGetResourceInformationW((lpnetresource?.value ?: 0L), (lpbuffer?.value ?: 0L), (lpcbbuffer?.value ?: 0L), (lplpsystem?.value ?: 0L)).toUInt()

public actual fun wNetGetResourceParentA(lpnetresource: COpaquePointer?, lpbuffer: COpaquePointer?, lpcbbuffer: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_wNetGetResourceParentA((lpnetresource?.value ?: 0L), (lpbuffer?.value ?: 0L), (lpcbbuffer?.value ?: 0L)).toUInt()

public actual fun wNetGetResourceParentW(lpnetresource: COpaquePointer?, lpbuffer: COpaquePointer?, lpcbbuffer: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_wNetGetResourceParentW((lpnetresource?.value ?: 0L), (lpbuffer?.value ?: 0L), (lpcbbuffer?.value ?: 0L)).toUInt()

public actual fun wNetGetUniversalNameA(lplocalpath: Pcstr, dwinfolevel: UncInfoLevel, lpbuffer: COpaquePointer?, lpbuffersize: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_wNetGetUniversalNameA((lplocalpath?.value ?: 0L), dwinfolevel.toInt(), (lpbuffer?.value ?: 0L), (lpbuffersize?.value ?: 0L)).toUInt()

public actual fun wNetGetUniversalNameW(lplocalpath: Pcwstr, dwinfolevel: UncInfoLevel, lpbuffer: COpaquePointer?, lpbuffersize: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_wNetGetUniversalNameW((lplocalpath?.value ?: 0L), dwinfolevel.toInt(), (lpbuffer?.value ?: 0L), (lpbuffersize?.value ?: 0L)).toUInt()

public actual fun wNetGetUserA(lpname: Pcstr, lpusername: Pstr, lpnlength: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_wNetGetUserA((lpname?.value ?: 0L), (lpusername?.value ?: 0L), (lpnlength?.value ?: 0L)).toUInt()

public actual fun wNetGetUserW(lpname: Pcwstr, lpusername: Pwstr, lpnlength: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_wNetGetUserW((lpname?.value ?: 0L), (lpusername?.value ?: 0L), (lpnlength?.value ?: 0L)).toUInt()

public actual fun wNetOpenEnumA(dwscope: NetResourceScope, dwtype: NetResourceType, dwusage: WnetOpenEnumUsage, lpnetresource: COpaquePointer?, lphenum: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_wNetOpenEnumA(dwscope.toInt(), dwtype.toInt(), dwusage.toInt(), (lpnetresource?.value ?: 0L), (lphenum?.value ?: 0L)).toUInt()

public actual fun wNetOpenEnumW(dwscope: NetResourceScope, dwtype: NetResourceType, dwusage: WnetOpenEnumUsage, lpnetresource: COpaquePointer?, lphenum: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_wNetOpenEnumW(dwscope.toInt(), dwtype.toInt(), dwusage.toInt(), (lpnetresource?.value ?: 0L), (lphenum?.value ?: 0L)).toUInt()

public actual fun wNetSetLastErrorA(err: UInt, lperror: Pcstr, lpproviders: Pcstr) {
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_wNetSetLastErrorA(err.toInt(), (lperror?.value ?: 0L), (lpproviders?.value ?: 0L))
}

public actual fun wNetSetLastErrorW(err: UInt, lperror: Pcwstr, lpproviders: Pcwstr) {
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_wNetSetLastErrorW(err.toInt(), (lperror?.value ?: 0L), (lpproviders?.value ?: 0L))
}

public actual fun wNetUseConnection4A(hwndowner: Hwnd, lpnetresource: COpaquePointer?, pauthbuffer: COpaquePointer?, cbauthbuffer: UInt, dwflags: UInt, lpuseoptions: COpaquePointer?, cbuseoptions: UInt, lpaccessname: Pstr, lpbuffersize: COpaquePointer?, lpresult: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_wNetUseConnection4A((hwndowner?.value ?: 0L), (lpnetresource?.value ?: 0L), (pauthbuffer?.value ?: 0L), cbauthbuffer.toInt(), dwflags.toInt(), (lpuseoptions?.value ?: 0L), cbuseoptions.toInt(), (lpaccessname?.value ?: 0L), (lpbuffersize?.value ?: 0L), (lpresult?.value ?: 0L)).toUInt()

public actual fun wNetUseConnection4W(hwndowner: Hwnd, lpnetresource: COpaquePointer?, pauthbuffer: COpaquePointer?, cbauthbuffer: UInt, dwflags: UInt, lpuseoptions: COpaquePointer?, cbuseoptions: UInt, lpaccessname: Pwstr, lpbuffersize: COpaquePointer?, lpresult: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_wNetUseConnection4W((hwndowner?.value ?: 0L), (lpnetresource?.value ?: 0L), (pauthbuffer?.value ?: 0L), cbauthbuffer.toInt(), dwflags.toInt(), (lpuseoptions?.value ?: 0L), cbuseoptions.toInt(), (lpaccessname?.value ?: 0L), (lpbuffersize?.value ?: 0L), (lpresult?.value ?: 0L)).toUInt()

public actual fun wNetUseConnectionA(hwndowner: Hwnd, lpnetresource: COpaquePointer?, lppassword: Pcstr, lpuserid: Pcstr, dwflags: NetConnectFlags, lpaccessname: Pstr, lpbuffersize: COpaquePointer?, lpresult: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_wNetUseConnectionA((hwndowner?.value ?: 0L), (lpnetresource?.value ?: 0L), (lppassword?.value ?: 0L), (lpuserid?.value ?: 0L), dwflags.toInt(), (lpaccessname?.value ?: 0L), (lpbuffersize?.value ?: 0L), (lpresult?.value ?: 0L)).toUInt()

public actual fun wNetUseConnectionW(hwndowner: Hwnd, lpnetresource: COpaquePointer?, lppassword: Pcwstr, lpuserid: Pcwstr, dwflags: NetConnectFlags, lpaccessname: Pwstr, lpbuffersize: COpaquePointer?, lpresult: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssys_windows_win32_networkmanagement_wnet_wNetUseConnectionW((hwndowner?.value ?: 0L), (lpnetresource?.value ?: 0L), (lppassword?.value ?: 0L), (lpuserid?.value ?: 0L), dwflags.toInt(), (lpaccessname?.value ?: 0L), (lpbuffersize?.value ?: 0L), (lpresult?.value ?: 0L)).toUInt()
