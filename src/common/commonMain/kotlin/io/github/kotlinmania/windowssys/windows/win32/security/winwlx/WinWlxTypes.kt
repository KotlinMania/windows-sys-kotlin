package io.github.kotlinmania.windowssys.windows.win32.security.winwlx

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Dlgproc

public fun interface PfnmsgecallbackFn {
    public operator fun invoke(bverbose: Bool, lpmessage: Pcwstr): UInt
}

public typealias Pfnmsgecallback = PfnmsgecallbackFn?

public fun interface PwlxAssignShellProtectionFn {
    public operator fun invoke(hwlx: Handle, htoken: Handle, hprocess: Handle, hthread: Handle): Int
}

public typealias PwlxAssignShellProtection = PwlxAssignShellProtectionFn?

public fun interface PwlxChangePasswordNotifyFn {
    public operator fun invoke(hwlx: Handle, pmprinfo: COpaquePointer?, dwchangeinfo: UInt): Int
}

public typealias PwlxChangePasswordNotify = PwlxChangePasswordNotifyFn?

public fun interface PwlxChangePasswordNotifyExFn {
    public operator fun invoke(hwlx: Handle, pmprinfo: COpaquePointer?, dwchangeinfo: UInt, providername: Pcwstr, reserved: COpaquePointer?): Int
}

public typealias PwlxChangePasswordNotifyEx = PwlxChangePasswordNotifyExFn?

public fun interface PwlxCloseUserDesktopFn {
    public operator fun invoke(hwlx: Handle, pdesktop: COpaquePointer?, htoken: Handle): Bool
}

public typealias PwlxCloseUserDesktop = PwlxCloseUserDesktopFn?

public fun interface PwlxCreateUserDesktopFn {
    public operator fun invoke(hwlx: Handle, htoken: Handle, flags: UInt, pszdesktopname: Pcwstr, ppdesktop: COpaquePointer?): Bool
}

public typealias PwlxCreateUserDesktop = PwlxCreateUserDesktopFn?

public fun interface PwlxDialogBoxFn {
    public operator fun invoke(hwlx: Handle, hinst: Handle, lpsztemplate: Pcwstr, hwndowner: Hwnd, dlgprc: Dlgproc): Int
}

public typealias PwlxDialogBox = PwlxDialogBoxFn?

public fun interface PwlxDialogBoxIndirectFn {
    public operator fun invoke(hwlx: Handle, hinst: Handle, hdialogtemplate: COpaquePointer?, hwndowner: Hwnd, dlgprc: Dlgproc): Int
}

public typealias PwlxDialogBoxIndirect = PwlxDialogBoxIndirectFn?

public fun interface PwlxDialogBoxIndirectParamFn {
    public operator fun invoke(hwlx: Handle, hinst: Handle, hdialogtemplate: COpaquePointer?, hwndowner: Hwnd, dlgprc: Dlgproc, dwinitparam: Lparam): Int
}

public typealias PwlxDialogBoxIndirectParam = PwlxDialogBoxIndirectParamFn?

public fun interface PwlxDialogBoxParamFn {
    public operator fun invoke(hwlx: Handle, hinst: Handle, lpsztemplate: Pcwstr, hwndowner: Hwnd, dlgprc: Dlgproc, dwinitparam: Lparam): Int
}

public typealias PwlxDialogBoxParam = PwlxDialogBoxParamFn?

public fun interface PwlxDisconnectFn {
    public operator fun invoke(): Bool
}

public typealias PwlxDisconnect = PwlxDisconnectFn?

public fun interface PwlxGetOptionFn {
    public operator fun invoke(hwlx: Handle, option: UInt, value: COpaquePointer?): Bool
}

public typealias PwlxGetOption = PwlxGetOptionFn?

public fun interface PwlxGetSourceDesktopFn {
    public operator fun invoke(hwlx: Handle, ppdesktop: COpaquePointer?): Bool
}

public typealias PwlxGetSourceDesktop = PwlxGetSourceDesktopFn?

public fun interface PwlxMessageBoxFn {
    public operator fun invoke(hwlx: Handle, hwndowner: Hwnd, lpsztext: Pcwstr, lpsztitle: Pcwstr, fustyle: UInt): Int
}

public typealias PwlxMessageBox = PwlxMessageBoxFn?

public fun interface PwlxQueryClientCredentialsFn {
    public operator fun invoke(pcred: COpaquePointer?): Bool
}

public typealias PwlxQueryClientCredentials = PwlxQueryClientCredentialsFn?

public fun interface PwlxQueryConsoleswitchCredentialsFn {
    public operator fun invoke(pcred: COpaquePointer?): UInt
}

public typealias PwlxQueryConsoleswitchCredentials = PwlxQueryConsoleswitchCredentialsFn?

public fun interface PwlxQueryIcCredentialsFn {
    public operator fun invoke(pcred: COpaquePointer?): Bool
}

public typealias PwlxQueryIcCredentials = PwlxQueryIcCredentialsFn?

public fun interface PwlxQueryTerminalServicesDataFn {
    public operator fun invoke(hwlx: Handle, ptsdata: COpaquePointer?, username: Pcwstr, domain: Pcwstr): UInt
}

public typealias PwlxQueryTerminalServicesData = PwlxQueryTerminalServicesDataFn?

public fun interface PwlxQueryTsLogonCredentialsFn {
    public operator fun invoke(pcred: COpaquePointer?): Bool
}

public typealias PwlxQueryTsLogonCredentials = PwlxQueryTsLogonCredentialsFn?

public fun interface PwlxSasNotifyFn {
    public operator fun invoke(hwlx: Handle, dwsastype: UInt)
}

public typealias PwlxSasNotify = PwlxSasNotifyFn?

public fun interface PwlxSetContextPointerFn {
    public operator fun invoke(hwlx: Handle, pwlxcontext: COpaquePointer?)
}

public typealias PwlxSetContextPointer = PwlxSetContextPointerFn?

public fun interface PwlxSetOptionFn {
    public operator fun invoke(hwlx: Handle, option: UInt, value: ULong, oldvalue: COpaquePointer?): Bool
}

public typealias PwlxSetOption = PwlxSetOptionFn?

public fun interface PwlxSetReturnDesktopFn {
    public operator fun invoke(hwlx: Handle, pdesktop: COpaquePointer?): Bool
}

public typealias PwlxSetReturnDesktop = PwlxSetReturnDesktopFn?

public fun interface PwlxSetTimeoutFn {
    public operator fun invoke(hwlx: Handle, timeout: UInt): Bool
}

public typealias PwlxSetTimeout = PwlxSetTimeoutFn?

public fun interface PwlxSwitchDesktopToUserFn {
    public operator fun invoke(hwlx: Handle): Int
}

public typealias PwlxSwitchDesktopToUser = PwlxSwitchDesktopToUserFn?

public fun interface PwlxSwitchDesktopToWinlogonFn {
    public operator fun invoke(hwlx: Handle): Int
}

public typealias PwlxSwitchDesktopToWinlogon = PwlxSwitchDesktopToWinlogonFn?

public fun interface PwlxUseCtrlAltDelFn {
    public operator fun invoke(hwlx: Handle)
}

public typealias PwlxUseCtrlAltDel = PwlxUseCtrlAltDelFn?

public fun interface PwlxWin31MigrateFn {
    public operator fun invoke(hwlx: Handle)
}

public typealias PwlxWin31Migrate = PwlxWin31MigrateFn?

public typealias WlxShutdownType = UInt
