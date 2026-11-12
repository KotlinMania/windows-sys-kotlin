package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Luid

public typealias ConnectdlgstructFlags = UInt

public typealias DiscdlgstructFlags = UInt

public typealias NetinfostructCharacteristics = UInt

public typealias NetworkNameFormatFlags = UInt

public typealias NetConnectFlags = UInt

public typealias NetResourceScope = UInt

public typealias NetResourceType = UInt

public typealias NpdirectoryNotifyOperation = UInt

public typealias NpPropertyDialogSelection = UInt

public fun interface PfAddConnectNotifyFn {
    public operator fun invoke(lpnotifyinfo: MutPtr<Notifyinfo>, lpaddinfo: ConstPtr<Notifyadd>): UInt
}

public typealias PfAddConnectNotify = PfAddConnectNotifyFn?

public fun interface PfCancelConnectNotifyFn {
    public operator fun invoke(lpnotifyinfo: MutPtr<Notifyinfo>, lpcancelinfo: ConstPtr<Notifycancel>): UInt
}

public typealias PfCancelConnectNotify = PfCancelConnectNotifyFn?

public fun interface PfNpaddConnectionFn {
    public operator fun invoke(lpnetresource: ConstPtr<Netresourcew>, lppassword: Pcwstr, lpusername: Pcwstr): UInt
}

public typealias PfNpaddConnection = PfNpaddConnectionFn?

public fun interface PfNpaddConnection3Fn {
    public operator fun invoke(hwndowner: Hwnd, lpnetresource: ConstPtr<Netresourcew>, lppassword: Pcwstr, lpusername: Pcwstr, dwflags: UInt): UInt
}

public typealias PfNpaddConnection3 = PfNpaddConnection3Fn?

public fun interface PfNpaddConnection4Fn {
    public operator fun invoke(hwndowner: Hwnd, lpnetresource: ConstPtr<Netresourcew>, lpauthbuffer: ConstPtr<CVoid>, cbauthbuffer: UInt, dwflags: UInt, lpuseoptions: ConstPtr<UByte>, cbuseoptions: UInt): UInt
}

public typealias PfNpaddConnection4 = PfNpaddConnection4Fn?

public fun interface PfNpcancelConnectionFn {
    public operator fun invoke(lpname: Pcwstr, fforce: Bool): UInt
}

public typealias PfNpcancelConnection = PfNpcancelConnectionFn?

public fun interface PfNpcancelConnection2Fn {
    public operator fun invoke(lpname: Pcwstr, fforce: Bool, dwflags: UInt): UInt
}

public typealias PfNpcancelConnection2 = PfNpcancelConnection2Fn?

public fun interface PfNpcloseEnumFn {
    public operator fun invoke(henum: Handle): UInt
}

public typealias PfNpcloseEnum = PfNpcloseEnumFn?

public fun interface PfNpdeviceModeFn {
    public operator fun invoke(hparent: Hwnd): UInt
}

public typealias PfNpdeviceMode = PfNpdeviceModeFn?

public fun interface PfNpdirectoryNotifyFn {
    public operator fun invoke(hwnd: Hwnd, lpdir: Pcwstr, dwoper: UInt): UInt
}

public typealias PfNpdirectoryNotify = PfNpdirectoryNotifyFn?

public fun interface PfNpenumResourceFn {
    public operator fun invoke(henum: Handle, lpccount: MutPtr<UInt>, lpbuffer: MutPtr<CVoid>, lpbuffersize: MutPtr<UInt>): UInt
}

public typealias PfNpenumResource = PfNpenumResourceFn?

public fun interface PfNpfmxeditPermFn {
    public operator fun invoke(lpdrivename: Pcwstr, hwndfmx: Hwnd, ndialogtype: UInt): UInt
}

public typealias PfNpfmxeditPerm = PfNpfmxeditPermFn?

public fun interface PfNpfmxgetPermCapsFn {
    public operator fun invoke(lpdrivename: Pcwstr): UInt
}

public typealias PfNpfmxgetPermCaps = PfNpfmxgetPermCapsFn?

public fun interface PfNpfmxgetPermHelpFn {
    public operator fun invoke(lpdrivename: Pcwstr, ndialogtype: UInt, fdirectory: Bool, lpfilenamebuffer: MutPtr<CVoid>, lpbuffersize: MutPtr<UInt>, lpnhelpcontext: MutPtr<UInt>): UInt
}

public typealias PfNpfmxgetPermHelp = PfNpfmxgetPermHelpFn?

public fun interface PfNpformatNetworkNameFn {
    public operator fun invoke(lpremotename: Pcwstr, lpformattedname: Pwstr, lpnlength: MutPtr<UInt>, dwflags: UInt, dwavecharperline: UInt): UInt
}

public typealias PfNpformatNetworkName = PfNpformatNetworkNameFn?

public fun interface PfNpgetCapsFn {
    public operator fun invoke(ndex: UInt): UInt
}

public typealias PfNpgetCaps = PfNpgetCapsFn?

public fun interface PfNpgetConnectionFn {
    public operator fun invoke(lplocalname: Pcwstr, lpremotename: Pwstr, lpnbufferlen: MutPtr<UInt>): UInt
}

public typealias PfNpgetConnection = PfNpgetConnectionFn?

public fun interface PfNpgetConnection3Fn {
    public operator fun invoke(lplocalname: Pcwstr, dwlevel: UInt, lpbuffer: MutPtr<CVoid>, lpbuffersize: MutPtr<UInt>): UInt
}

public typealias PfNpgetConnection3 = PfNpgetConnection3Fn?

public fun interface PfNpgetConnectionPerformanceFn {
    public operator fun invoke(lpremotename: Pcwstr, lpnetconnectinfo: MutPtr<Netconnectinfostruct>): UInt
}

public typealias PfNpgetConnectionPerformance = PfNpgetConnectionPerformanceFn?

public fun interface PfNpgetDirectoryTypeFn {
    public operator fun invoke(lpname: Pcwstr, lptype: ConstPtr<Int>, bflushcache: Bool): UInt
}

public typealias PfNpgetDirectoryType = PfNpgetDirectoryTypeFn?

public fun interface PfNpgetPersistentUseOptionsForConnectionFn {
    public operator fun invoke(lpremotepath: Pcwstr, lpreaduseoptions: ConstPtr<UByte>, cbreaduseoptions: UInt, lpwriteuseoptions: MutPtr<UByte>, lpsizewriteuseoptions: MutPtr<UInt>): UInt
}

public typealias PfNpgetPersistentUseOptionsForConnection = PfNpgetPersistentUseOptionsForConnectionFn?

public fun interface PfNpgetPropertyTextFn {
    public operator fun invoke(ibutton: UInt, npropsel: UInt, lpname: Pcwstr, lpbuttonname: Pwstr, nbuttonnamelen: UInt, ntype: UInt): UInt
}

public typealias PfNpgetPropertyText = PfNpgetPropertyTextFn?

public fun interface PfNpgetResourceInformationFn {
    public operator fun invoke(lpnetresource: ConstPtr<Netresourcew>, lpbuffer: MutPtr<CVoid>, lpbuffersize: MutPtr<UInt>, lplpsystem: MutPtr<Pwstr>): UInt
}

public typealias PfNpgetResourceInformation = PfNpgetResourceInformationFn?

public fun interface PfNpgetResourceParentFn {
    public operator fun invoke(lpnetresource: ConstPtr<Netresourcew>, lpbuffer: MutPtr<CVoid>, lpbuffersize: MutPtr<UInt>): UInt
}

public typealias PfNpgetResourceParent = PfNpgetResourceParentFn?

public fun interface PfNpgetUniversalNameFn {
    public operator fun invoke(lplocalpath: Pcwstr, dwinfolevel: UInt, lpbuffer: MutPtr<CVoid>, lpnbuffersize: MutPtr<UInt>): UInt
}

public typealias PfNpgetUniversalName = PfNpgetUniversalNameFn?

public fun interface PfNpgetUserFn {
    public operator fun invoke(lpname: Pcwstr, lpusername: Pwstr, lpnbufferlen: MutPtr<UInt>): UInt
}

public typealias PfNpgetUser = PfNpgetUserFn?

public fun interface PfNplogonNotifyFn {
    public operator fun invoke(lplogonid: ConstPtr<Luid>, lpauthentinfotype: Pcwstr, lpauthentinfo: ConstPtr<CVoid>, lppreviousauthentinfotype: Pcwstr, lppreviousauthentinfo: ConstPtr<CVoid>, lpstationname: Pcwstr, stationhandle: ConstPtr<CVoid>, lplogonscript: MutPtr<Pwstr>): UInt
}

public typealias PfNplogonNotify = PfNplogonNotifyFn?

public fun interface PfNpopenEnumFn {
    public operator fun invoke(dwscope: UInt, dwtype: UInt, dwusage: UInt, lpnetresource: ConstPtr<Netresourcew>, lphenum: MutPtr<Handle>): UInt
}

public typealias PfNpopenEnum = PfNpopenEnumFn?

public fun interface PfNppasswordChangeNotifyFn {
    public operator fun invoke(lpauthentinfotype: Pcwstr, lpauthentinfo: ConstPtr<CVoid>, lppreviousauthentinfotype: Pcwstr, lppreviousauthentinfo: ConstPtr<CVoid>, lpstationname: Pcwstr, stationhandle: ConstPtr<CVoid>, dwchangeinfo: UInt): UInt
}

public typealias PfNppasswordChangeNotify = PfNppasswordChangeNotifyFn?

public fun interface PfNppropertyDialogFn {
    public operator fun invoke(hwndparent: Hwnd, ibuttondlg: UInt, npropsel: UInt, lpfilename: Pcwstr, ntype: UInt): UInt
}

public typealias PfNppropertyDialog = PfNppropertyDialogFn?

public fun interface PfNpsearchDialogFn {
    public operator fun invoke(hwndparent: Hwnd, lpnetresource: ConstPtr<Netresourcew>, lpbuffer: MutPtr<CVoid>, cbbuffer: UInt, lpnflags: MutPtr<UInt>): UInt
}

public typealias PfNpsearchDialog = PfNpsearchDialogFn?

public typealias UncInfoLevel = UInt

public typealias WnetOpenEnumUsage = UInt

public typealias WnpermDlg = UInt
