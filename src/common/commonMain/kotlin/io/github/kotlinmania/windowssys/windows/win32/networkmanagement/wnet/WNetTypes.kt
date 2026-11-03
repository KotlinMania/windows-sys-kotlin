package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public typealias CONNECTDLGSTRUCT_FLAGS = UInt

public typealias DISCDLGSTRUCT_FLAGS = UInt

public typealias NETINFOSTRUCT_CHARACTERISTICS = UInt

public typealias NETWORK_NAME_FORMAT_FLAGS = UInt

public typealias NET_CONNECT_FLAGS = UInt

public typealias NET_RESOURCE_SCOPE = UInt

public typealias NET_RESOURCE_TYPE = UInt

public typealias NPDIRECTORY_NOTIFY_OPERATION = UInt

public typealias NP_PROPERTY_DIALOG_SELECTION = UInt

public fun interface PF_AddConnectNotifyFn {
    public operator fun invoke(lpnotifyinfo: Long, lpaddinfo: Long): UInt
}

public typealias PF_AddConnectNotify = PF_AddConnectNotifyFn?

public fun interface PF_CancelConnectNotifyFn {
    public operator fun invoke(lpnotifyinfo: Long, lpcancelinfo: Long): UInt
}

public typealias PF_CancelConnectNotify = PF_CancelConnectNotifyFn?

public fun interface PF_NPAddConnectionFn {
    public operator fun invoke(lpnetresource: Long, lppassword: PCWSTR, lpusername: PCWSTR): UInt
}

public typealias PF_NPAddConnection = PF_NPAddConnectionFn?

public fun interface PF_NPAddConnection3Fn {
    public operator fun invoke(hwndowner: Foundation.HWND, lpnetresource: Long, lppassword: PCWSTR, lpusername: PCWSTR, dwflags: UInt): UInt
}

public typealias PF_NPAddConnection3 = PF_NPAddConnection3Fn?

public fun interface PF_NPAddConnection4Fn {
    public operator fun invoke(hwndowner: Foundation.HWND, lpnetresource: Long, lpauthbuffer: Long, cbauthbuffer: UInt, dwflags: UInt, lpuseoptions: Long, cbuseoptions: UInt): UInt
}

public typealias PF_NPAddConnection4 = PF_NPAddConnection4Fn?

public fun interface PF_NPCancelConnectionFn {
    public operator fun invoke(lpname: PCWSTR, fforce: BOOL): UInt
}

public typealias PF_NPCancelConnection = PF_NPCancelConnectionFn?

public fun interface PF_NPCancelConnection2Fn {
    public operator fun invoke(lpname: PCWSTR, fforce: BOOL, dwflags: UInt): UInt
}

public typealias PF_NPCancelConnection2 = PF_NPCancelConnection2Fn?

public fun interface PF_NPCloseEnumFn {
    public operator fun invoke(henum: Foundation.HANDLE): UInt
}

public typealias PF_NPCloseEnum = PF_NPCloseEnumFn?

public fun interface PF_NPDeviceModeFn {
    public operator fun invoke(hparent: Foundation.HWND): UInt
}

public typealias PF_NPDeviceMode = PF_NPDeviceModeFn?

public fun interface PF_NPDirectoryNotifyFn {
    public operator fun invoke(hwnd: Foundation.HWND, lpdir: PCWSTR, dwoper: UInt): UInt
}

public typealias PF_NPDirectoryNotify = PF_NPDirectoryNotifyFn?

public fun interface PF_NPEnumResourceFn {
    public operator fun invoke(henum: Foundation.HANDLE, lpccount: Long, lpbuffer: Long, lpbuffersize: Long): UInt
}

public typealias PF_NPEnumResource = PF_NPEnumResourceFn?

public fun interface PF_NPFMXEditPermFn {
    public operator fun invoke(lpdrivename: PCWSTR, hwndfmx: Foundation.HWND, ndialogtype: UInt): UInt
}

public typealias PF_NPFMXEditPerm = PF_NPFMXEditPermFn?

public fun interface PF_NPFMXGetPermCapsFn {
    public operator fun invoke(lpdrivename: PCWSTR): UInt
}

public typealias PF_NPFMXGetPermCaps = PF_NPFMXGetPermCapsFn?

public fun interface PF_NPFMXGetPermHelpFn {
    public operator fun invoke(lpdrivename: PCWSTR, ndialogtype: UInt, fdirectory: BOOL, lpfilenamebuffer: Long, lpbuffersize: Long, lpnhelpcontext: Long): UInt
}

public typealias PF_NPFMXGetPermHelp = PF_NPFMXGetPermHelpFn?

public fun interface PF_NPFormatNetworkNameFn {
    public operator fun invoke(lpremotename: PCWSTR, lpformattedname: PWSTR, lpnlength: Long, dwflags: UInt, dwavecharperline: UInt): UInt
}

public typealias PF_NPFormatNetworkName = PF_NPFormatNetworkNameFn?

public fun interface PF_NPGetCapsFn {
    public operator fun invoke(ndex: UInt): UInt
}

public typealias PF_NPGetCaps = PF_NPGetCapsFn?

public fun interface PF_NPGetConnectionFn {
    public operator fun invoke(lplocalname: PCWSTR, lpremotename: PWSTR, lpnbufferlen: Long): UInt
}

public typealias PF_NPGetConnection = PF_NPGetConnectionFn?

public fun interface PF_NPGetConnection3Fn {
    public operator fun invoke(lplocalname: PCWSTR, dwlevel: UInt, lpbuffer: Long, lpbuffersize: Long): UInt
}

public typealias PF_NPGetConnection3 = PF_NPGetConnection3Fn?

public fun interface PF_NPGetConnectionPerformanceFn {
    public operator fun invoke(lpremotename: PCWSTR, lpnetconnectinfo: Long): UInt
}

public typealias PF_NPGetConnectionPerformance = PF_NPGetConnectionPerformanceFn?

public fun interface PF_NPGetDirectoryTypeFn {
    public operator fun invoke(lpname: PCWSTR, lptype: Long, bflushcache: BOOL): UInt
}

public typealias PF_NPGetDirectoryType = PF_NPGetDirectoryTypeFn?

public fun interface PF_NPGetPersistentUseOptionsForConnectionFn {
    public operator fun invoke(lpremotepath: PCWSTR, lpreaduseoptions: Long, cbreaduseoptions: UInt, lpwriteuseoptions: Long, lpsizewriteuseoptions: Long): UInt
}

public typealias PF_NPGetPersistentUseOptionsForConnection = PF_NPGetPersistentUseOptionsForConnectionFn?

public fun interface PF_NPGetPropertyTextFn {
    public operator fun invoke(ibutton: UInt, npropsel: UInt, lpname: PCWSTR, lpbuttonname: PWSTR, nbuttonnamelen: UInt, ntype: UInt): UInt
}

public typealias PF_NPGetPropertyText = PF_NPGetPropertyTextFn?

public fun interface PF_NPGetResourceInformationFn {
    public operator fun invoke(lpnetresource: Long, lpbuffer: Long, lpbuffersize: Long, lplpsystem: Long): UInt
}

public typealias PF_NPGetResourceInformation = PF_NPGetResourceInformationFn?

public fun interface PF_NPGetResourceParentFn {
    public operator fun invoke(lpnetresource: Long, lpbuffer: Long, lpbuffersize: Long): UInt
}

public typealias PF_NPGetResourceParent = PF_NPGetResourceParentFn?

public fun interface PF_NPGetUniversalNameFn {
    public operator fun invoke(lplocalpath: PCWSTR, dwinfolevel: UInt, lpbuffer: Long, lpnbuffersize: Long): UInt
}

public typealias PF_NPGetUniversalName = PF_NPGetUniversalNameFn?

public fun interface PF_NPGetUserFn {
    public operator fun invoke(lpname: PCWSTR, lpusername: PWSTR, lpnbufferlen: Long): UInt
}

public typealias PF_NPGetUser = PF_NPGetUserFn?

public fun interface PF_NPLogonNotifyFn {
    public operator fun invoke(lplogonid: Long, lpauthentinfotype: PCWSTR, lpauthentinfo: Long, lppreviousauthentinfotype: PCWSTR, lppreviousauthentinfo: Long, lpstationname: PCWSTR, stationhandle: Long, lplogonscript: Long): UInt
}

public typealias PF_NPLogonNotify = PF_NPLogonNotifyFn?

public fun interface PF_NPOpenEnumFn {
    public operator fun invoke(dwscope: UInt, dwtype: UInt, dwusage: UInt, lpnetresource: Long, lphenum: Long): UInt
}

public typealias PF_NPOpenEnum = PF_NPOpenEnumFn?

public fun interface PF_NPPasswordChangeNotifyFn {
    public operator fun invoke(lpauthentinfotype: PCWSTR, lpauthentinfo: Long, lppreviousauthentinfotype: PCWSTR, lppreviousauthentinfo: Long, lpstationname: PCWSTR, stationhandle: Long, dwchangeinfo: UInt): UInt
}

public typealias PF_NPPasswordChangeNotify = PF_NPPasswordChangeNotifyFn?

public fun interface PF_NPPropertyDialogFn {
    public operator fun invoke(hwndparent: Foundation.HWND, ibuttondlg: UInt, npropsel: UInt, lpfilename: PCWSTR, ntype: UInt): UInt
}

public typealias PF_NPPropertyDialog = PF_NPPropertyDialogFn?

public fun interface PF_NPSearchDialogFn {
    public operator fun invoke(hwndparent: Foundation.HWND, lpnetresource: Long, lpbuffer: Long, cbbuffer: UInt, lpnflags: Long): UInt
}

public typealias PF_NPSearchDialog = PF_NPSearchDialogFn?

public typealias UNC_INFO_LEVEL = UInt

public typealias WNET_OPEN_ENUM_USAGE = UInt

public typealias WNPERM_DLG = UInt
