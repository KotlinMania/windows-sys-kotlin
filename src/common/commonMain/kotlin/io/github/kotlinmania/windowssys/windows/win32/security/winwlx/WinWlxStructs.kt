@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.security.winwlx

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.LUID
import io.github.kotlinmania.windowssys.windows.win32.security.QUOTA_LIMITS
import io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.HDESK

public data class WLX_CLIENT_CREDENTIALS_INFO_V1_0(
    public var dwType: UInt = 0u,
    public var pszUserName: PWSTR = 0L,
    public var pszDomain: PWSTR = 0L,
    public var pszPassword: PWSTR = 0L,
    public var fPromptForPassword: BOOL = 0,
)

public data class WLX_CLIENT_CREDENTIALS_INFO_V2_0(
    public var dwType: UInt = 0u,
    public var pszUserName: PWSTR = 0L,
    public var pszDomain: PWSTR = 0L,
    public var pszPassword: PWSTR = 0L,
    public var fPromptForPassword: BOOL = 0,
    public var fDisconnectOnLogonFailure: BOOL = 0,
)

public class WLX_CONSOLESWITCH_CREDENTIALS_INFO_V1_0(
    public var dwType: UInt = 0u,
    public var UserToken: HANDLE = 0L,
    public var LogonId: LUID = LUID(),
    public var Quotas: QUOTA_LIMITS = QUOTA_LIMITS(),
    public var UserName: PWSTR = 0L,
    public var Domain: PWSTR = 0L,
    public var LogonTime: Long = 0L,
    public var SmartCardLogon: BOOL = 0,
    public var ProfileLength: UInt = 0u,
    public var MessageType: UInt = 0u,
    public var LogonCount: UShort = 0u,
    public var BadPasswordCount: UShort = 0u,
    public var ProfileLogonTime: Long = 0L,
    public var LogoffTime: Long = 0L,
    public var KickOffTime: Long = 0L,
    public var PasswordLastSet: Long = 0L,
    public var PasswordCanChange: Long = 0L,
    public var PasswordMustChange: Long = 0L,
    public var LogonScript: PWSTR = 0L,
    public var HomeDirectory: PWSTR = 0L,
    public var FullName: PWSTR = 0L,
    public var ProfilePath: PWSTR = 0L,
    public var HomeDirectoryDrive: PWSTR = 0L,
    public var LogonServer: PWSTR = 0L,
    public var UserFlags: UInt = 0u,
    public var PrivateDataLen: UInt = 0u,
    public var PrivateData: Long = 0L,
)

public data class WLX_DESKTOP(
    public var Size: UInt = 0u,
    public var Flags: UInt = 0u,
    public var hDesktop: HDESK = 0L,
    public var pszDesktopName: PWSTR = 0L,
)

public data class WLX_DISPATCH_VERSION_1_0(
    public var WlxUseCtrlAltDel: PWLX_USE_CTRL_ALT_DEL = null,
    public var WlxSetContextPointer: PWLX_SET_CONTEXT_POINTER = null,
    public var WlxSasNotify: PWLX_SAS_NOTIFY = null,
    public var WlxSetTimeout: PWLX_SET_TIMEOUT = null,
    public var WlxAssignShellProtection: PWLX_ASSIGN_SHELL_PROTECTION = null,
    public var WlxMessageBox: PWLX_MESSAGE_BOX = null,
    public var WlxDialogBox: PWLX_DIALOG_BOX = null,
    public var WlxDialogBoxParam: PWLX_DIALOG_BOX_PARAM = null,
    public var WlxDialogBoxIndirect: PWLX_DIALOG_BOX_INDIRECT = null,
    public var WlxDialogBoxIndirectParam: PWLX_DIALOG_BOX_INDIRECT_PARAM = null,
    public var WlxSwitchDesktopToUser: PWLX_SWITCH_DESKTOP_TO_USER = null,
    public var WlxSwitchDesktopToWinlogon: PWLX_SWITCH_DESKTOP_TO_WINLOGON = null,
    public var WlxChangePasswordNotify: PWLX_CHANGE_PASSWORD_NOTIFY = null,
)

public class WLX_DISPATCH_VERSION_1_1(
    public var WlxUseCtrlAltDel: PWLX_USE_CTRL_ALT_DEL = null,
    public var WlxSetContextPointer: PWLX_SET_CONTEXT_POINTER = null,
    public var WlxSasNotify: PWLX_SAS_NOTIFY = null,
    public var WlxSetTimeout: PWLX_SET_TIMEOUT = null,
    public var WlxAssignShellProtection: PWLX_ASSIGN_SHELL_PROTECTION = null,
    public var WlxMessageBox: PWLX_MESSAGE_BOX = null,
    public var WlxDialogBox: PWLX_DIALOG_BOX = null,
    public var WlxDialogBoxParam: PWLX_DIALOG_BOX_PARAM = null,
    public var WlxDialogBoxIndirect: PWLX_DIALOG_BOX_INDIRECT = null,
    public var WlxDialogBoxIndirectParam: PWLX_DIALOG_BOX_INDIRECT_PARAM = null,
    public var WlxSwitchDesktopToUser: PWLX_SWITCH_DESKTOP_TO_USER = null,
    public var WlxSwitchDesktopToWinlogon: PWLX_SWITCH_DESKTOP_TO_WINLOGON = null,
    public var WlxChangePasswordNotify: PWLX_CHANGE_PASSWORD_NOTIFY = null,
    public var WlxGetSourceDesktop: PWLX_GET_SOURCE_DESKTOP = null,
    public var WlxSetReturnDesktop: PWLX_SET_RETURN_DESKTOP = null,
    public var WlxCreateUserDesktop: PWLX_CREATE_USER_DESKTOP = null,
    public var WlxChangePasswordNotifyEx: PWLX_CHANGE_PASSWORD_NOTIFY_EX = null,
)

public class WLX_DISPATCH_VERSION_1_2(
    public var WlxUseCtrlAltDel: PWLX_USE_CTRL_ALT_DEL = null,
    public var WlxSetContextPointer: PWLX_SET_CONTEXT_POINTER = null,
    public var WlxSasNotify: PWLX_SAS_NOTIFY = null,
    public var WlxSetTimeout: PWLX_SET_TIMEOUT = null,
    public var WlxAssignShellProtection: PWLX_ASSIGN_SHELL_PROTECTION = null,
    public var WlxMessageBox: PWLX_MESSAGE_BOX = null,
    public var WlxDialogBox: PWLX_DIALOG_BOX = null,
    public var WlxDialogBoxParam: PWLX_DIALOG_BOX_PARAM = null,
    public var WlxDialogBoxIndirect: PWLX_DIALOG_BOX_INDIRECT = null,
    public var WlxDialogBoxIndirectParam: PWLX_DIALOG_BOX_INDIRECT_PARAM = null,
    public var WlxSwitchDesktopToUser: PWLX_SWITCH_DESKTOP_TO_USER = null,
    public var WlxSwitchDesktopToWinlogon: PWLX_SWITCH_DESKTOP_TO_WINLOGON = null,
    public var WlxChangePasswordNotify: PWLX_CHANGE_PASSWORD_NOTIFY = null,
    public var WlxGetSourceDesktop: PWLX_GET_SOURCE_DESKTOP = null,
    public var WlxSetReturnDesktop: PWLX_SET_RETURN_DESKTOP = null,
    public var WlxCreateUserDesktop: PWLX_CREATE_USER_DESKTOP = null,
    public var WlxChangePasswordNotifyEx: PWLX_CHANGE_PASSWORD_NOTIFY_EX = null,
    public var WlxCloseUserDesktop: PWLX_CLOSE_USER_DESKTOP = null,
)

public class WLX_DISPATCH_VERSION_1_3(
    public var WlxUseCtrlAltDel: PWLX_USE_CTRL_ALT_DEL = null,
    public var WlxSetContextPointer: PWLX_SET_CONTEXT_POINTER = null,
    public var WlxSasNotify: PWLX_SAS_NOTIFY = null,
    public var WlxSetTimeout: PWLX_SET_TIMEOUT = null,
    public var WlxAssignShellProtection: PWLX_ASSIGN_SHELL_PROTECTION = null,
    public var WlxMessageBox: PWLX_MESSAGE_BOX = null,
    public var WlxDialogBox: PWLX_DIALOG_BOX = null,
    public var WlxDialogBoxParam: PWLX_DIALOG_BOX_PARAM = null,
    public var WlxDialogBoxIndirect: PWLX_DIALOG_BOX_INDIRECT = null,
    public var WlxDialogBoxIndirectParam: PWLX_DIALOG_BOX_INDIRECT_PARAM = null,
    public var WlxSwitchDesktopToUser: PWLX_SWITCH_DESKTOP_TO_USER = null,
    public var WlxSwitchDesktopToWinlogon: PWLX_SWITCH_DESKTOP_TO_WINLOGON = null,
    public var WlxChangePasswordNotify: PWLX_CHANGE_PASSWORD_NOTIFY = null,
    public var WlxGetSourceDesktop: PWLX_GET_SOURCE_DESKTOP = null,
    public var WlxSetReturnDesktop: PWLX_SET_RETURN_DESKTOP = null,
    public var WlxCreateUserDesktop: PWLX_CREATE_USER_DESKTOP = null,
    public var WlxChangePasswordNotifyEx: PWLX_CHANGE_PASSWORD_NOTIFY_EX = null,
    public var WlxCloseUserDesktop: PWLX_CLOSE_USER_DESKTOP = null,
    public var WlxSetOption: PWLX_SET_OPTION = null,
    public var WlxGetOption: PWLX_GET_OPTION = null,
    public var WlxWin31Migrate: PWLX_WIN31_MIGRATE = null,
    public var WlxQueryClientCredentials: PWLX_QUERY_CLIENT_CREDENTIALS = null,
    public var WlxQueryInetConnectorCredentials: PWLX_QUERY_IC_CREDENTIALS = null,
    public var WlxDisconnect: PWLX_DISCONNECT = null,
    public var WlxQueryTerminalServicesData: PWLX_QUERY_TERMINAL_SERVICES_DATA = null,
)

public class WLX_DISPATCH_VERSION_1_4(
    public var WlxUseCtrlAltDel: PWLX_USE_CTRL_ALT_DEL = null,
    public var WlxSetContextPointer: PWLX_SET_CONTEXT_POINTER = null,
    public var WlxSasNotify: PWLX_SAS_NOTIFY = null,
    public var WlxSetTimeout: PWLX_SET_TIMEOUT = null,
    public var WlxAssignShellProtection: PWLX_ASSIGN_SHELL_PROTECTION = null,
    public var WlxMessageBox: PWLX_MESSAGE_BOX = null,
    public var WlxDialogBox: PWLX_DIALOG_BOX = null,
    public var WlxDialogBoxParam: PWLX_DIALOG_BOX_PARAM = null,
    public var WlxDialogBoxIndirect: PWLX_DIALOG_BOX_INDIRECT = null,
    public var WlxDialogBoxIndirectParam: PWLX_DIALOG_BOX_INDIRECT_PARAM = null,
    public var WlxSwitchDesktopToUser: PWLX_SWITCH_DESKTOP_TO_USER = null,
    public var WlxSwitchDesktopToWinlogon: PWLX_SWITCH_DESKTOP_TO_WINLOGON = null,
    public var WlxChangePasswordNotify: PWLX_CHANGE_PASSWORD_NOTIFY = null,
    public var WlxGetSourceDesktop: PWLX_GET_SOURCE_DESKTOP = null,
    public var WlxSetReturnDesktop: PWLX_SET_RETURN_DESKTOP = null,
    public var WlxCreateUserDesktop: PWLX_CREATE_USER_DESKTOP = null,
    public var WlxChangePasswordNotifyEx: PWLX_CHANGE_PASSWORD_NOTIFY_EX = null,
    public var WlxCloseUserDesktop: PWLX_CLOSE_USER_DESKTOP = null,
    public var WlxSetOption: PWLX_SET_OPTION = null,
    public var WlxGetOption: PWLX_GET_OPTION = null,
    public var WlxWin31Migrate: PWLX_WIN31_MIGRATE = null,
    public var WlxQueryClientCredentials: PWLX_QUERY_CLIENT_CREDENTIALS = null,
    public var WlxQueryInetConnectorCredentials: PWLX_QUERY_IC_CREDENTIALS = null,
    public var WlxDisconnect: PWLX_DISCONNECT = null,
    public var WlxQueryTerminalServicesData: PWLX_QUERY_TERMINAL_SERVICES_DATA = null,
    public var WlxQueryConsoleSwitchCredentials: PWLX_QUERY_CONSOLESWITCH_CREDENTIALS = null,
    public var WlxQueryTsLogonCredentials: PWLX_QUERY_TS_LOGON_CREDENTIALS = null,
)

public data class WLX_MPR_NOTIFY_INFO(
    public var pszUserName: PWSTR = 0L,
    public var pszDomain: PWSTR = 0L,
    public var pszPassword: PWSTR = 0L,
    public var pszOldPassword: PWSTR = 0L,
)

public data class WLX_NOTIFICATION_INFO(
    public var Size: UInt = 0u,
    public var Flags: UInt = 0u,
    public var UserName: PWSTR = 0L,
    public var Domain: PWSTR = 0L,
    public var WindowStation: PWSTR = 0L,
    public var hToken: HANDLE = 0L,
    public var hDesktop: HDESK = 0L,
    public var pStatusCallback: PFNMSGECALLBACK = null,
)

public data class WLX_PROFILE_V1_0(public var dwType: UInt = 0u, public var pszProfile: PWSTR = 0L)

public data class WLX_PROFILE_V2_0(
    public var dwType: UInt = 0u,
    public var pszProfile: PWSTR = 0L,
    public var pszPolicy: PWSTR = 0L,
    public var pszNetworkDefaultUserProfile: PWSTR = 0L,
    public var pszServerName: PWSTR = 0L,
    public var pszEnvironment: PWSTR = 0L,
)

public data class WLX_SC_NOTIFICATION_INFO(
    public var pszCard: PWSTR = 0L,
    public var pszReader: PWSTR = 0L,
    public var pszContainer: PWSTR = 0L,
    public var pszCryptoProvider: PWSTR = 0L,
)

public data class WLX_TERMINAL_SERVICES_DATA(
    public var ProfilePath: UShortArray = UShortArray(257),
    public var HomeDir: UShortArray = UShortArray(257),
    public var HomeDirDrive: UShortArray = UShortArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WLX_TERMINAL_SERVICES_DATA) return false
        if (!this.ProfilePath.contentEquals(other.ProfilePath)) return false
        if (!this.HomeDir.contentEquals(other.HomeDir)) return false
        if (!this.HomeDirDrive.contentEquals(other.HomeDirDrive)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ProfilePath.contentHashCode()
        result = 31 * result + this.HomeDir.contentHashCode()
        result = 31 * result + this.HomeDirDrive.contentHashCode()
        return result
    }
}
