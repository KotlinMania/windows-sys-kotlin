@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private object WindowsWin32NetworkmanagementWnetJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWnetMultinetGetConnectionPerformanceA(lpnetresource: Long, lpnetconnectinfostruct: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWnetMultinetGetConnectionPerformanceW(lpnetresource: Long, lpnetconnectinfostruct: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWnetNPAddConnection(lpnetresource: Long, lppassword: Long, lpusername: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWnetNPAddConnection3(hwndowner: Long, lpnetresource: Long, lppassword: Long, lpusername: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWnetNPAddConnection4(hwndowner: Long, lpnetresource: Long, lpauthbuffer: Long, cbauthbuffer: Int, dwflags: Int, lpuseoptions: Long, cbuseoptions: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWnetNPCancelConnection(lpname: Long, fforce: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWnetNPCancelConnection2(lpname: Long, fforce: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWnetNPCloseEnum(henum: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWnetNPEnumResource(henum: Long, lpccount: Long, lpbuffer: Long, lpbuffersize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWnetNPFormatNetworkName(lpremotename: Long, lpformattedname: Long, lpnlength: Long, dwflags: Int, dwavecharperline: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWnetNPGetCaps(ndex: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWnetNPGetConnection(lplocalname: Long, lpremotename: Long, lpnbufferlen: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWnetNPGetConnection3(lplocalname: Long, dwlevel: Int, lpbuffer: Long, lpbuffersize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWnetNPGetConnectionPerformance(lpremotename: Long, lpnetconnectinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWnetNPGetPersistentUseOptionsForConnection(lpremotepath: Long, lpreaduseoptions: Long, cbreaduseoptions: Int, lpwriteuseoptions: Long, lpsizewriteuseoptions: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWnetNPGetResourceInformation(lpnetresource: Long, lpbuffer: Long, lpbuffersize: Long, lplpsystem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWnetNPGetResourceParent(lpnetresource: Long, lpbuffer: Long, lpbuffersize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWnetNPGetUniversalName(lplocalpath: Long, dwinfolevel: Int, lpbuffer: Long, lpbuffersize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWnetNPGetUser(lpname: Long, lpusername: Long, lpnbufferlen: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWnetNPOpenEnum(dwscope: Int, dwtype: Int, dwusage: Int, lpnetresource: Long, lphenum: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWnetWNetAddConnection2A(lpnetresource: Long, lppassword: Long, lpusername: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWnetWNetAddConnection2W(lpnetresource: Long, lppassword: Long, lpusername: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWnetWNetAddConnection3A(hwndowner: Long, lpnetresource: Long, lppassword: Long, lpusername: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWnetWNetAddConnection3W(hwndowner: Long, lpnetresource: Long, lppassword: Long, lpusername: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWnetWNetAddConnection4A(hwndowner: Long, lpnetresource: Long, pauthbuffer: Long, cbauthbuffer: Int, dwflags: Int, lpuseoptions: Long, cbuseoptions: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWnetWNetAddConnection4W(hwndowner: Long, lpnetresource: Long, pauthbuffer: Long, cbauthbuffer: Int, dwflags: Int, lpuseoptions: Long, cbuseoptions: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWnetWNetAddConnectionA(lpremotename: Long, lppassword: Long, lplocalname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWnetWNetAddConnectionW(lpremotename: Long, lppassword: Long, lplocalname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWnetWNetCancelConnection2A(lpname: Long, dwflags: Int, fforce: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWnetWNetCancelConnection2W(lpname: Long, dwflags: Int, fforce: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWnetWNetCancelConnectionA(lpname: Long, fforce: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWnetWNetCancelConnectionW(lpname: Long, fforce: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWnetWNetCloseEnum(henum: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWnetWNetConnectionDialog(hwnd: Long, dwtype: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWnetWNetConnectionDialog1A(lpconndlgstruct: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWnetWNetConnectionDialog1W(lpconndlgstruct: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWnetWNetDisconnectDialog(hwnd: Long, dwtype: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWnetWNetDisconnectDialog1A(lpconndlgstruct: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWnetWNetDisconnectDialog1W(lpconndlgstruct: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWnetWNetEnumResourceA(henum: Long, lpccount: Long, lpbuffer: Long, lpbuffersize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWnetWNetEnumResourceW(henum: Long, lpccount: Long, lpbuffer: Long, lpbuffersize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWnetWNetGetConnectionA(lplocalname: Long, lpremotename: Long, lpnlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWnetWNetGetConnectionW(lplocalname: Long, lpremotename: Long, lpnlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWnetWNetGetLastErrorA(lperror: Long, lperrorbuf: Long, nerrorbufsize: Int, lpnamebuf: Long, nnamebufsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWnetWNetGetLastErrorW(lperror: Long, lperrorbuf: Long, nerrorbufsize: Int, lpnamebuf: Long, nnamebufsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWnetWNetGetNetworkInformationA(lpprovider: Long, lpnetinfostruct: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWnetWNetGetNetworkInformationW(lpprovider: Long, lpnetinfostruct: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWnetWNetGetProviderNameA(dwnettype: Int, lpprovidername: Long, lpbuffersize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWnetWNetGetProviderNameW(dwnettype: Int, lpprovidername: Long, lpbuffersize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWnetWNetGetResourceInformationA(lpnetresource: Long, lpbuffer: Long, lpcbbuffer: Long, lplpsystem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWnetWNetGetResourceInformationW(lpnetresource: Long, lpbuffer: Long, lpcbbuffer: Long, lplpsystem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWnetWNetGetResourceParentA(lpnetresource: Long, lpbuffer: Long, lpcbbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWnetWNetGetResourceParentW(lpnetresource: Long, lpbuffer: Long, lpcbbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWnetWNetGetUniversalNameA(lplocalpath: Long, dwinfolevel: Int, lpbuffer: Long, lpbuffersize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWnetWNetGetUniversalNameW(lplocalpath: Long, dwinfolevel: Int, lpbuffer: Long, lpbuffersize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWnetWNetGetUserA(lpname: Long, lpusername: Long, lpnlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWnetWNetGetUserW(lpname: Long, lpusername: Long, lpnlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWnetWNetOpenEnumA(dwscope: Int, dwtype: Int, dwusage: Int, lpnetresource: Long, lphenum: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWnetWNetOpenEnumW(dwscope: Int, dwtype: Int, dwusage: Int, lpnetresource: Long, lphenum: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWnetWNetSetLastErrorA(err: Int, lperror: Long, lpproviders: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWnetWNetSetLastErrorW(err: Int, lperror: Long, lpproviders: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWnetWNetUseConnection4A(hwndowner: Long, lpnetresource: Long, pauthbuffer: Long, cbauthbuffer: Int, dwflags: Int, lpuseoptions: Long, cbuseoptions: Int, lpaccessname: Long, lpbuffersize: Long, lpresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWnetWNetUseConnection4W(hwndowner: Long, lpnetresource: Long, pauthbuffer: Long, cbauthbuffer: Int, dwflags: Int, lpuseoptions: Long, cbuseoptions: Int, lpaccessname: Long, lpbuffersize: Long, lpresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWnetWNetUseConnectionA(hwndowner: Long, lpnetresource: Long, lppassword: Long, lpuserid: Long, dwflags: Int, lpaccessname: Long, lpbuffersize: Long, lpresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWnetWNetUseConnectionW(hwndowner: Long, lpnetresource: Long, lppassword: Long, lpuserid: Long, dwflags: Int, lpaccessname: Long, lpbuffersize: Long, lpresult: Long): Int
}

public actual fun multinetGetConnectionPerformanceA(lpnetresource: ConstPtr<Netresourcea>, lpnetconnectinfostruct: MutPtr<Netconnectinfostruct>): UInt =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssysWindowsWin32NetworkmanagementWnetMultinetGetConnectionPerformanceA(lpnetresource.rawAddress, lpnetconnectinfostruct.rawAddress).toUInt()

public actual fun multinetGetConnectionPerformanceW(lpnetresource: ConstPtr<Netresourcew>, lpnetconnectinfostruct: MutPtr<Netconnectinfostruct>): UInt =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssysWindowsWin32NetworkmanagementWnetMultinetGetConnectionPerformanceW(lpnetresource.rawAddress, lpnetconnectinfostruct.rawAddress).toUInt()

public actual fun nPAddConnection(lpnetresource: ConstPtr<Netresourcew>, lppassword: Pcwstr, lpusername: Pcwstr): UInt =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssysWindowsWin32NetworkmanagementWnetNPAddConnection(lpnetresource.rawAddress, lppassword.rawAddress, lpusername.rawAddress).toUInt()

public actual fun nPAddConnection3(hwndowner: Hwnd, lpnetresource: ConstPtr<Netresourcew>, lppassword: Pcwstr, lpusername: Pcwstr, dwflags: NetConnectFlags): UInt =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssysWindowsWin32NetworkmanagementWnetNPAddConnection3(hwndowner.rawAddress, lpnetresource.rawAddress, lppassword.rawAddress, lpusername.rawAddress, dwflags.toInt()).toUInt()

public actual fun nPAddConnection4(hwndowner: Hwnd, lpnetresource: ConstPtr<Netresourcew>, lpauthbuffer: ConstPtr<CVoid>, cbauthbuffer: UInt, dwflags: UInt, lpuseoptions: ConstPtr<UByte>, cbuseoptions: UInt): UInt =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssysWindowsWin32NetworkmanagementWnetNPAddConnection4(hwndowner.rawAddress, lpnetresource.rawAddress, lpauthbuffer.rawAddress, cbauthbuffer.toInt(), dwflags.toInt(), lpuseoptions.rawAddress, cbuseoptions.toInt()).toUInt()

public actual fun nPCancelConnection(lpname: Pcwstr, fforce: Bool): UInt =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssysWindowsWin32NetworkmanagementWnetNPCancelConnection(lpname.rawAddress, fforce).toUInt()

public actual fun nPCancelConnection2(lpname: Pcwstr, fforce: Bool, dwflags: UInt): UInt =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssysWindowsWin32NetworkmanagementWnetNPCancelConnection2(lpname.rawAddress, fforce, dwflags.toInt()).toUInt()

public actual fun nPCloseEnum(henum: Handle): UInt =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssysWindowsWin32NetworkmanagementWnetNPCloseEnum(henum.rawAddress).toUInt()

public actual fun nPEnumResource(henum: Handle, lpccount: MutPtr<UInt>, lpbuffer: MutPtr<CVoid>, lpbuffersize: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssysWindowsWin32NetworkmanagementWnetNPEnumResource(henum.rawAddress, lpccount.rawAddress, lpbuffer.rawAddress, lpbuffersize.rawAddress).toUInt()

public actual fun nPFormatNetworkName(lpremotename: Pcwstr, lpformattedname: Pwstr, lpnlength: MutPtr<UInt>, dwflags: NetworkNameFormatFlags, dwavecharperline: UInt): UInt =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssysWindowsWin32NetworkmanagementWnetNPFormatNetworkName(lpremotename.rawAddress, lpformattedname.rawAddress, lpnlength.rawAddress, dwflags.toInt(), dwavecharperline.toInt()).toUInt()

public actual fun nPGetCaps(ndex: UInt): UInt =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssysWindowsWin32NetworkmanagementWnetNPGetCaps(ndex.toInt()).toUInt()

public actual fun nPGetConnection(lplocalname: Pcwstr, lpremotename: Pwstr, lpnbufferlen: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssysWindowsWin32NetworkmanagementWnetNPGetConnection(lplocalname.rawAddress, lpremotename.rawAddress, lpnbufferlen.rawAddress).toUInt()

public actual fun nPGetConnection3(lplocalname: Pcwstr, dwlevel: UInt, lpbuffer: MutPtr<CVoid>, lpbuffersize: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssysWindowsWin32NetworkmanagementWnetNPGetConnection3(lplocalname.rawAddress, dwlevel.toInt(), lpbuffer.rawAddress, lpbuffersize.rawAddress).toUInt()

public actual fun nPGetConnectionPerformance(lpremotename: Pcwstr, lpnetconnectinfo: MutPtr<Netconnectinfostruct>): UInt =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssysWindowsWin32NetworkmanagementWnetNPGetConnectionPerformance(lpremotename.rawAddress, lpnetconnectinfo.rawAddress).toUInt()

public actual fun nPGetPersistentUseOptionsForConnection(lpremotepath: Pcwstr, lpreaduseoptions: ConstPtr<UByte>, cbreaduseoptions: UInt, lpwriteuseoptions: MutPtr<UByte>, lpsizewriteuseoptions: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssysWindowsWin32NetworkmanagementWnetNPGetPersistentUseOptionsForConnection(lpremotepath.rawAddress, lpreaduseoptions.rawAddress, cbreaduseoptions.toInt(), lpwriteuseoptions.rawAddress, lpsizewriteuseoptions.rawAddress).toUInt()

public actual fun nPGetResourceInformation(lpnetresource: ConstPtr<Netresourcew>, lpbuffer: MutPtr<CVoid>, lpbuffersize: MutPtr<UInt>, lplpsystem: MutPtr<Pwstr>): UInt =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssysWindowsWin32NetworkmanagementWnetNPGetResourceInformation(lpnetresource.rawAddress, lpbuffer.rawAddress, lpbuffersize.rawAddress, lplpsystem.rawAddress).toUInt()

public actual fun nPGetResourceParent(lpnetresource: ConstPtr<Netresourcew>, lpbuffer: MutPtr<CVoid>, lpbuffersize: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssysWindowsWin32NetworkmanagementWnetNPGetResourceParent(lpnetresource.rawAddress, lpbuffer.rawAddress, lpbuffersize.rawAddress).toUInt()

public actual fun nPGetUniversalName(lplocalpath: Pcwstr, dwinfolevel: UncInfoLevel, lpbuffer: MutPtr<CVoid>, lpbuffersize: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssysWindowsWin32NetworkmanagementWnetNPGetUniversalName(lplocalpath.rawAddress, dwinfolevel.toInt(), lpbuffer.rawAddress, lpbuffersize.rawAddress).toUInt()

public actual fun nPGetUser(lpname: Pcwstr, lpusername: Pwstr, lpnbufferlen: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssysWindowsWin32NetworkmanagementWnetNPGetUser(lpname.rawAddress, lpusername.rawAddress, lpnbufferlen.rawAddress).toUInt()

public actual fun nPOpenEnum(dwscope: UInt, dwtype: UInt, dwusage: UInt, lpnetresource: ConstPtr<Netresourcew>, lphenum: MutPtr<Handle>): UInt =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssysWindowsWin32NetworkmanagementWnetNPOpenEnum(dwscope.toInt(), dwtype.toInt(), dwusage.toInt(), lpnetresource.rawAddress, lphenum.rawAddress).toUInt()

public actual fun wNetAddConnection2A(lpnetresource: ConstPtr<Netresourcea>, lppassword: Pcstr, lpusername: Pcstr, dwflags: NetConnectFlags): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssysWindowsWin32NetworkmanagementWnetWNetAddConnection2A(lpnetresource.rawAddress, lppassword.rawAddress, lpusername.rawAddress, dwflags.toInt()).toUInt()

public actual fun wNetAddConnection2W(lpnetresource: ConstPtr<Netresourcew>, lppassword: Pcwstr, lpusername: Pcwstr, dwflags: NetConnectFlags): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssysWindowsWin32NetworkmanagementWnetWNetAddConnection2W(lpnetresource.rawAddress, lppassword.rawAddress, lpusername.rawAddress, dwflags.toInt()).toUInt()

public actual fun wNetAddConnection3A(hwndowner: Hwnd, lpnetresource: ConstPtr<Netresourcea>, lppassword: Pcstr, lpusername: Pcstr, dwflags: NetConnectFlags): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssysWindowsWin32NetworkmanagementWnetWNetAddConnection3A(hwndowner.rawAddress, lpnetresource.rawAddress, lppassword.rawAddress, lpusername.rawAddress, dwflags.toInt()).toUInt()

public actual fun wNetAddConnection3W(hwndowner: Hwnd, lpnetresource: ConstPtr<Netresourcew>, lppassword: Pcwstr, lpusername: Pcwstr, dwflags: NetConnectFlags): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssysWindowsWin32NetworkmanagementWnetWNetAddConnection3W(hwndowner.rawAddress, lpnetresource.rawAddress, lppassword.rawAddress, lpusername.rawAddress, dwflags.toInt()).toUInt()

public actual fun wNetAddConnection4A(hwndowner: Hwnd, lpnetresource: ConstPtr<Netresourcea>, pauthbuffer: ConstPtr<CVoid>, cbauthbuffer: UInt, dwflags: NetConnectFlags, lpuseoptions: ConstPtr<UByte>, cbuseoptions: UInt): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssysWindowsWin32NetworkmanagementWnetWNetAddConnection4A(hwndowner.rawAddress, lpnetresource.rawAddress, pauthbuffer.rawAddress, cbauthbuffer.toInt(), dwflags.toInt(), lpuseoptions.rawAddress, cbuseoptions.toInt()).toUInt()

public actual fun wNetAddConnection4W(hwndowner: Hwnd, lpnetresource: ConstPtr<Netresourcew>, pauthbuffer: ConstPtr<CVoid>, cbauthbuffer: UInt, dwflags: NetConnectFlags, lpuseoptions: ConstPtr<UByte>, cbuseoptions: UInt): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssysWindowsWin32NetworkmanagementWnetWNetAddConnection4W(hwndowner.rawAddress, lpnetresource.rawAddress, pauthbuffer.rawAddress, cbauthbuffer.toInt(), dwflags.toInt(), lpuseoptions.rawAddress, cbuseoptions.toInt()).toUInt()

public actual fun wNetAddConnectionA(lpremotename: Pcstr, lppassword: Pcstr, lplocalname: Pcstr): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssysWindowsWin32NetworkmanagementWnetWNetAddConnectionA(lpremotename.rawAddress, lppassword.rawAddress, lplocalname.rawAddress).toUInt()

public actual fun wNetAddConnectionW(lpremotename: Pcwstr, lppassword: Pcwstr, lplocalname: Pcwstr): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssysWindowsWin32NetworkmanagementWnetWNetAddConnectionW(lpremotename.rawAddress, lppassword.rawAddress, lplocalname.rawAddress).toUInt()

public actual fun wNetCancelConnection2A(lpname: Pcstr, dwflags: NetConnectFlags, fforce: Bool): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssysWindowsWin32NetworkmanagementWnetWNetCancelConnection2A(lpname.rawAddress, dwflags.toInt(), fforce).toUInt()

public actual fun wNetCancelConnection2W(lpname: Pcwstr, dwflags: NetConnectFlags, fforce: Bool): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssysWindowsWin32NetworkmanagementWnetWNetCancelConnection2W(lpname.rawAddress, dwflags.toInt(), fforce).toUInt()

public actual fun wNetCancelConnectionA(lpname: Pcstr, fforce: Bool): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssysWindowsWin32NetworkmanagementWnetWNetCancelConnectionA(lpname.rawAddress, fforce).toUInt()

public actual fun wNetCancelConnectionW(lpname: Pcwstr, fforce: Bool): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssysWindowsWin32NetworkmanagementWnetWNetCancelConnectionW(lpname.rawAddress, fforce).toUInt()

public actual fun wNetCloseEnum(henum: Handle): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssysWindowsWin32NetworkmanagementWnetWNetCloseEnum(henum.rawAddress).toUInt()

public actual fun wNetConnectionDialog(hwnd: Hwnd, dwtype: UInt): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssysWindowsWin32NetworkmanagementWnetWNetConnectionDialog(hwnd.rawAddress, dwtype.toInt()).toUInt()

public actual fun wNetConnectionDialog1A(lpconndlgstruct: MutPtr<Connectdlgstructa>): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssysWindowsWin32NetworkmanagementWnetWNetConnectionDialog1A(lpconndlgstruct.rawAddress).toUInt()

public actual fun wNetConnectionDialog1W(lpconndlgstruct: MutPtr<Connectdlgstructw>): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssysWindowsWin32NetworkmanagementWnetWNetConnectionDialog1W(lpconndlgstruct.rawAddress).toUInt()

public actual fun wNetDisconnectDialog(hwnd: Hwnd, dwtype: UInt): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssysWindowsWin32NetworkmanagementWnetWNetDisconnectDialog(hwnd.rawAddress, dwtype.toInt()).toUInt()

public actual fun wNetDisconnectDialog1A(lpconndlgstruct: ConstPtr<Discdlgstructa>): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssysWindowsWin32NetworkmanagementWnetWNetDisconnectDialog1A(lpconndlgstruct.rawAddress).toUInt()

public actual fun wNetDisconnectDialog1W(lpconndlgstruct: ConstPtr<Discdlgstructw>): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssysWindowsWin32NetworkmanagementWnetWNetDisconnectDialog1W(lpconndlgstruct.rawAddress).toUInt()

public actual fun wNetEnumResourceA(henum: Handle, lpccount: MutPtr<UInt>, lpbuffer: MutPtr<CVoid>, lpbuffersize: MutPtr<UInt>): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssysWindowsWin32NetworkmanagementWnetWNetEnumResourceA(henum.rawAddress, lpccount.rawAddress, lpbuffer.rawAddress, lpbuffersize.rawAddress).toUInt()

public actual fun wNetEnumResourceW(henum: Handle, lpccount: MutPtr<UInt>, lpbuffer: MutPtr<CVoid>, lpbuffersize: MutPtr<UInt>): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssysWindowsWin32NetworkmanagementWnetWNetEnumResourceW(henum.rawAddress, lpccount.rawAddress, lpbuffer.rawAddress, lpbuffersize.rawAddress).toUInt()

public actual fun wNetGetConnectionA(lplocalname: Pcstr, lpremotename: Pstr, lpnlength: MutPtr<UInt>): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssysWindowsWin32NetworkmanagementWnetWNetGetConnectionA(lplocalname.rawAddress, lpremotename.rawAddress, lpnlength.rawAddress).toUInt()

public actual fun wNetGetConnectionW(lplocalname: Pcwstr, lpremotename: Pwstr, lpnlength: MutPtr<UInt>): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssysWindowsWin32NetworkmanagementWnetWNetGetConnectionW(lplocalname.rawAddress, lpremotename.rawAddress, lpnlength.rawAddress).toUInt()

public actual fun wNetGetLastErrorA(lperror: MutPtr<UInt>, lperrorbuf: Pstr, nerrorbufsize: UInt, lpnamebuf: Pstr, nnamebufsize: UInt): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssysWindowsWin32NetworkmanagementWnetWNetGetLastErrorA(lperror.rawAddress, lperrorbuf.rawAddress, nerrorbufsize.toInt(), lpnamebuf.rawAddress, nnamebufsize.toInt()).toUInt()

public actual fun wNetGetLastErrorW(lperror: MutPtr<UInt>, lperrorbuf: Pwstr, nerrorbufsize: UInt, lpnamebuf: Pwstr, nnamebufsize: UInt): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssysWindowsWin32NetworkmanagementWnetWNetGetLastErrorW(lperror.rawAddress, lperrorbuf.rawAddress, nerrorbufsize.toInt(), lpnamebuf.rawAddress, nnamebufsize.toInt()).toUInt()

public actual fun wNetGetNetworkInformationA(lpprovider: Pcstr, lpnetinfostruct: MutPtr<Netinfostruct>): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssysWindowsWin32NetworkmanagementWnetWNetGetNetworkInformationA(lpprovider.rawAddress, lpnetinfostruct.rawAddress).toUInt()

public actual fun wNetGetNetworkInformationW(lpprovider: Pcwstr, lpnetinfostruct: MutPtr<Netinfostruct>): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssysWindowsWin32NetworkmanagementWnetWNetGetNetworkInformationW(lpprovider.rawAddress, lpnetinfostruct.rawAddress).toUInt()

public actual fun wNetGetProviderNameA(dwnettype: UInt, lpprovidername: Pstr, lpbuffersize: MutPtr<UInt>): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssysWindowsWin32NetworkmanagementWnetWNetGetProviderNameA(dwnettype.toInt(), lpprovidername.rawAddress, lpbuffersize.rawAddress).toUInt()

public actual fun wNetGetProviderNameW(dwnettype: UInt, lpprovidername: Pwstr, lpbuffersize: MutPtr<UInt>): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssysWindowsWin32NetworkmanagementWnetWNetGetProviderNameW(dwnettype.toInt(), lpprovidername.rawAddress, lpbuffersize.rawAddress).toUInt()

public actual fun wNetGetResourceInformationA(lpnetresource: ConstPtr<Netresourcea>, lpbuffer: MutPtr<CVoid>, lpcbbuffer: MutPtr<UInt>, lplpsystem: MutPtr<Pstr>): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssysWindowsWin32NetworkmanagementWnetWNetGetResourceInformationA(lpnetresource.rawAddress, lpbuffer.rawAddress, lpcbbuffer.rawAddress, lplpsystem.rawAddress).toUInt()

public actual fun wNetGetResourceInformationW(lpnetresource: ConstPtr<Netresourcew>, lpbuffer: MutPtr<CVoid>, lpcbbuffer: MutPtr<UInt>, lplpsystem: MutPtr<Pwstr>): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssysWindowsWin32NetworkmanagementWnetWNetGetResourceInformationW(lpnetresource.rawAddress, lpbuffer.rawAddress, lpcbbuffer.rawAddress, lplpsystem.rawAddress).toUInt()

public actual fun wNetGetResourceParentA(lpnetresource: ConstPtr<Netresourcea>, lpbuffer: MutPtr<CVoid>, lpcbbuffer: MutPtr<UInt>): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssysWindowsWin32NetworkmanagementWnetWNetGetResourceParentA(lpnetresource.rawAddress, lpbuffer.rawAddress, lpcbbuffer.rawAddress).toUInt()

public actual fun wNetGetResourceParentW(lpnetresource: ConstPtr<Netresourcew>, lpbuffer: MutPtr<CVoid>, lpcbbuffer: MutPtr<UInt>): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssysWindowsWin32NetworkmanagementWnetWNetGetResourceParentW(lpnetresource.rawAddress, lpbuffer.rawAddress, lpcbbuffer.rawAddress).toUInt()

public actual fun wNetGetUniversalNameA(lplocalpath: Pcstr, dwinfolevel: UncInfoLevel, lpbuffer: MutPtr<CVoid>, lpbuffersize: MutPtr<UInt>): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssysWindowsWin32NetworkmanagementWnetWNetGetUniversalNameA(lplocalpath.rawAddress, dwinfolevel.toInt(), lpbuffer.rawAddress, lpbuffersize.rawAddress).toUInt()

public actual fun wNetGetUniversalNameW(lplocalpath: Pcwstr, dwinfolevel: UncInfoLevel, lpbuffer: MutPtr<CVoid>, lpbuffersize: MutPtr<UInt>): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssysWindowsWin32NetworkmanagementWnetWNetGetUniversalNameW(lplocalpath.rawAddress, dwinfolevel.toInt(), lpbuffer.rawAddress, lpbuffersize.rawAddress).toUInt()

public actual fun wNetGetUserA(lpname: Pcstr, lpusername: Pstr, lpnlength: MutPtr<UInt>): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssysWindowsWin32NetworkmanagementWnetWNetGetUserA(lpname.rawAddress, lpusername.rawAddress, lpnlength.rawAddress).toUInt()

public actual fun wNetGetUserW(lpname: Pcwstr, lpusername: Pwstr, lpnlength: MutPtr<UInt>): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssysWindowsWin32NetworkmanagementWnetWNetGetUserW(lpname.rawAddress, lpusername.rawAddress, lpnlength.rawAddress).toUInt()

public actual fun wNetOpenEnumA(dwscope: NetResourceScope, dwtype: NetResourceType, dwusage: WnetOpenEnumUsage, lpnetresource: ConstPtr<Netresourcea>, lphenum: MutPtr<Handle>): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssysWindowsWin32NetworkmanagementWnetWNetOpenEnumA(dwscope.toInt(), dwtype.toInt(), dwusage.toInt(), lpnetresource.rawAddress, lphenum.rawAddress).toUInt()

public actual fun wNetOpenEnumW(dwscope: NetResourceScope, dwtype: NetResourceType, dwusage: WnetOpenEnumUsage, lpnetresource: ConstPtr<Netresourcew>, lphenum: MutPtr<Handle>): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssysWindowsWin32NetworkmanagementWnetWNetOpenEnumW(dwscope.toInt(), dwtype.toInt(), dwusage.toInt(), lpnetresource.rawAddress, lphenum.rawAddress).toUInt()

public actual fun wNetSetLastErrorA(err: UInt, lperror: Pcstr, lpproviders: Pcstr) {
    WindowsWin32NetworkmanagementWnetJniBridge.windowssysWindowsWin32NetworkmanagementWnetWNetSetLastErrorA(err.toInt(), lperror.rawAddress, lpproviders.rawAddress)
}

public actual fun wNetSetLastErrorW(err: UInt, lperror: Pcwstr, lpproviders: Pcwstr) {
    WindowsWin32NetworkmanagementWnetJniBridge.windowssysWindowsWin32NetworkmanagementWnetWNetSetLastErrorW(err.toInt(), lperror.rawAddress, lpproviders.rawAddress)
}

public actual fun wNetUseConnection4A(hwndowner: Hwnd, lpnetresource: ConstPtr<Netresourcea>, pauthbuffer: ConstPtr<CVoid>, cbauthbuffer: UInt, dwflags: UInt, lpuseoptions: ConstPtr<UByte>, cbuseoptions: UInt, lpaccessname: Pstr, lpbuffersize: MutPtr<UInt>, lpresult: MutPtr<UInt>): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssysWindowsWin32NetworkmanagementWnetWNetUseConnection4A(hwndowner.rawAddress, lpnetresource.rawAddress, pauthbuffer.rawAddress, cbauthbuffer.toInt(), dwflags.toInt(), lpuseoptions.rawAddress, cbuseoptions.toInt(), lpaccessname.rawAddress, lpbuffersize.rawAddress, lpresult.rawAddress).toUInt()

public actual fun wNetUseConnection4W(hwndowner: Hwnd, lpnetresource: ConstPtr<Netresourcew>, pauthbuffer: ConstPtr<CVoid>, cbauthbuffer: UInt, dwflags: UInt, lpuseoptions: ConstPtr<UByte>, cbuseoptions: UInt, lpaccessname: Pwstr, lpbuffersize: MutPtr<UInt>, lpresult: MutPtr<UInt>): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssysWindowsWin32NetworkmanagementWnetWNetUseConnection4W(hwndowner.rawAddress, lpnetresource.rawAddress, pauthbuffer.rawAddress, cbauthbuffer.toInt(), dwflags.toInt(), lpuseoptions.rawAddress, cbuseoptions.toInt(), lpaccessname.rawAddress, lpbuffersize.rawAddress, lpresult.rawAddress).toUInt()

public actual fun wNetUseConnectionA(hwndowner: Hwnd, lpnetresource: ConstPtr<Netresourcea>, lppassword: Pcstr, lpuserid: Pcstr, dwflags: NetConnectFlags, lpaccessname: Pstr, lpbuffersize: MutPtr<UInt>, lpresult: MutPtr<UInt>): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssysWindowsWin32NetworkmanagementWnetWNetUseConnectionA(hwndowner.rawAddress, lpnetresource.rawAddress, lppassword.rawAddress, lpuserid.rawAddress, dwflags.toInt(), lpaccessname.rawAddress, lpbuffersize.rawAddress, lpresult.rawAddress).toUInt()

public actual fun wNetUseConnectionW(hwndowner: Hwnd, lpnetresource: ConstPtr<Netresourcew>, lppassword: Pcwstr, lpuserid: Pcwstr, dwflags: NetConnectFlags, lpaccessname: Pwstr, lpbuffersize: MutPtr<UInt>, lpresult: MutPtr<UInt>): Win32Error =
    WindowsWin32NetworkmanagementWnetJniBridge.windowssysWindowsWin32NetworkmanagementWnetWNetUseConnectionW(hwndowner.rawAddress, lpnetresource.rawAddress, lppassword.rawAddress, lpuserid.rawAddress, dwflags.toInt(), lpaccessname.rawAddress, lpbuffersize.rawAddress, lpresult.rawAddress).toUInt()
