package io.github.kotlinmania.windowssys.windows.win32.security.winwlx

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.LPARAM
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.DLGPROC

public fun interface PFNMSGECALLBACKFn {
    public operator fun invoke(bverbose: BOOL, lpmessage: PCWSTR): UInt
}

public typealias PFNMSGECALLBACK = PFNMSGECALLBACKFn?

public fun interface PWLX_ASSIGN_SHELL_PROTECTIONFn {
    public operator fun invoke(hwlx: HANDLE, htoken: HANDLE, hprocess: HANDLE, hthread: HANDLE): Int
}

public typealias PWLX_ASSIGN_SHELL_PROTECTION = PWLX_ASSIGN_SHELL_PROTECTIONFn?

public fun interface PWLX_CHANGE_PASSWORD_NOTIFYFn {
    public operator fun invoke(hwlx: HANDLE, pmprinfo: Long, dwchangeinfo: UInt): Int
}

public typealias PWLX_CHANGE_PASSWORD_NOTIFY = PWLX_CHANGE_PASSWORD_NOTIFYFn?

public fun interface PWLX_CHANGE_PASSWORD_NOTIFY_EXFn {
    public operator fun invoke(hwlx: HANDLE, pmprinfo: Long, dwchangeinfo: UInt, providername: PCWSTR, reserved: Long): Int
}

public typealias PWLX_CHANGE_PASSWORD_NOTIFY_EX = PWLX_CHANGE_PASSWORD_NOTIFY_EXFn?

public fun interface PWLX_CLOSE_USER_DESKTOPFn {
    public operator fun invoke(hwlx: HANDLE, pdesktop: Long, htoken: HANDLE): BOOL
}

public typealias PWLX_CLOSE_USER_DESKTOP = PWLX_CLOSE_USER_DESKTOPFn?

public fun interface PWLX_CREATE_USER_DESKTOPFn {
    public operator fun invoke(hwlx: HANDLE, htoken: HANDLE, flags: UInt, pszdesktopname: PCWSTR, ppdesktop: Long): BOOL
}

public typealias PWLX_CREATE_USER_DESKTOP = PWLX_CREATE_USER_DESKTOPFn?

public fun interface PWLX_DIALOG_BOXFn {
    public operator fun invoke(hwlx: HANDLE, hinst: HANDLE, lpsztemplate: PCWSTR, hwndowner: HWND, dlgprc: DLGPROC): Int
}

public typealias PWLX_DIALOG_BOX = PWLX_DIALOG_BOXFn?

public fun interface PWLX_DIALOG_BOX_INDIRECTFn {
    public operator fun invoke(hwlx: HANDLE, hinst: HANDLE, hdialogtemplate: Long, hwndowner: HWND, dlgprc: DLGPROC): Int
}

public typealias PWLX_DIALOG_BOX_INDIRECT = PWLX_DIALOG_BOX_INDIRECTFn?

public fun interface PWLX_DIALOG_BOX_INDIRECT_PARAMFn {
    public operator fun invoke(hwlx: HANDLE, hinst: HANDLE, hdialogtemplate: Long, hwndowner: HWND, dlgprc: DLGPROC, dwinitparam: LPARAM): Int
}

public typealias PWLX_DIALOG_BOX_INDIRECT_PARAM = PWLX_DIALOG_BOX_INDIRECT_PARAMFn?

public fun interface PWLX_DIALOG_BOX_PARAMFn {
    public operator fun invoke(hwlx: HANDLE, hinst: HANDLE, lpsztemplate: PCWSTR, hwndowner: HWND, dlgprc: DLGPROC, dwinitparam: LPARAM): Int
}

public typealias PWLX_DIALOG_BOX_PARAM = PWLX_DIALOG_BOX_PARAMFn?

public fun interface PWLX_DISCONNECTFn {
    public operator fun invoke(): BOOL
}

public typealias PWLX_DISCONNECT = PWLX_DISCONNECTFn?

public fun interface PWLX_GET_OPTIONFn {
    public operator fun invoke(hwlx: HANDLE, option: UInt, value: Long): BOOL
}

public typealias PWLX_GET_OPTION = PWLX_GET_OPTIONFn?

public fun interface PWLX_GET_SOURCE_DESKTOPFn {
    public operator fun invoke(hwlx: HANDLE, ppdesktop: Long): BOOL
}

public typealias PWLX_GET_SOURCE_DESKTOP = PWLX_GET_SOURCE_DESKTOPFn?

public fun interface PWLX_MESSAGE_BOXFn {
    public operator fun invoke(hwlx: HANDLE, hwndowner: HWND, lpsztext: PCWSTR, lpsztitle: PCWSTR, fustyle: UInt): Int
}

public typealias PWLX_MESSAGE_BOX = PWLX_MESSAGE_BOXFn?

public fun interface PWLX_QUERY_CLIENT_CREDENTIALSFn {
    public operator fun invoke(pcred: Long): BOOL
}

public typealias PWLX_QUERY_CLIENT_CREDENTIALS = PWLX_QUERY_CLIENT_CREDENTIALSFn?

public fun interface PWLX_QUERY_CONSOLESWITCH_CREDENTIALSFn {
    public operator fun invoke(pcred: Long): UInt
}

public typealias PWLX_QUERY_CONSOLESWITCH_CREDENTIALS = PWLX_QUERY_CONSOLESWITCH_CREDENTIALSFn?

public fun interface PWLX_QUERY_IC_CREDENTIALSFn {
    public operator fun invoke(pcred: Long): BOOL
}

public typealias PWLX_QUERY_IC_CREDENTIALS = PWLX_QUERY_IC_CREDENTIALSFn?

public fun interface PWLX_QUERY_TERMINAL_SERVICES_DATAFn {
    public operator fun invoke(hwlx: HANDLE, ptsdata: Long, username: PCWSTR, domain: PCWSTR): UInt
}

public typealias PWLX_QUERY_TERMINAL_SERVICES_DATA = PWLX_QUERY_TERMINAL_SERVICES_DATAFn?

public fun interface PWLX_QUERY_TS_LOGON_CREDENTIALSFn {
    public operator fun invoke(pcred: Long): BOOL
}

public typealias PWLX_QUERY_TS_LOGON_CREDENTIALS = PWLX_QUERY_TS_LOGON_CREDENTIALSFn?

public fun interface PWLX_SAS_NOTIFYFn {
    public operator fun invoke(hwlx: HANDLE, dwsastype: UInt)
}

public typealias PWLX_SAS_NOTIFY = PWLX_SAS_NOTIFYFn?

public fun interface PWLX_SET_CONTEXT_POINTERFn {
    public operator fun invoke(hwlx: HANDLE, pwlxcontext: Long)
}

public typealias PWLX_SET_CONTEXT_POINTER = PWLX_SET_CONTEXT_POINTERFn?

public fun interface PWLX_SET_OPTIONFn {
    public operator fun invoke(hwlx: HANDLE, option: UInt, value: ULong, oldvalue: Long): BOOL
}

public typealias PWLX_SET_OPTION = PWLX_SET_OPTIONFn?

public fun interface PWLX_SET_RETURN_DESKTOPFn {
    public operator fun invoke(hwlx: HANDLE, pdesktop: Long): BOOL
}

public typealias PWLX_SET_RETURN_DESKTOP = PWLX_SET_RETURN_DESKTOPFn?

public fun interface PWLX_SET_TIMEOUTFn {
    public operator fun invoke(hwlx: HANDLE, timeout: UInt): BOOL
}

public typealias PWLX_SET_TIMEOUT = PWLX_SET_TIMEOUTFn?

public fun interface PWLX_SWITCH_DESKTOP_TO_USERFn {
    public operator fun invoke(hwlx: HANDLE): Int
}

public typealias PWLX_SWITCH_DESKTOP_TO_USER = PWLX_SWITCH_DESKTOP_TO_USERFn?

public fun interface PWLX_SWITCH_DESKTOP_TO_WINLOGONFn {
    public operator fun invoke(hwlx: HANDLE): Int
}

public typealias PWLX_SWITCH_DESKTOP_TO_WINLOGON = PWLX_SWITCH_DESKTOP_TO_WINLOGONFn?

public fun interface PWLX_USE_CTRL_ALT_DELFn {
    public operator fun invoke(hwlx: HANDLE)
}

public typealias PWLX_USE_CTRL_ALT_DEL = PWLX_USE_CTRL_ALT_DELFn?

public fun interface PWLX_WIN31_MIGRATEFn {
    public operator fun invoke(hwlx: HANDLE)
}

public typealias PWLX_WIN31_MIGRATE = PWLX_WIN31_MIGRATEFn?

public typealias WLX_SHUTDOWN_TYPE = UInt
