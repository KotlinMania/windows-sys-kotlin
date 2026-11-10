@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.security.winwlx

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Luid
import io.github.kotlinmania.windowssys.windows.win32.security.QuotaLimits
import io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.Hdesk

public data class WlxClientCredentialsInfoV10(
    public var dwType: UInt = 0u,
    public var pszUserName: Pwstr = null,
    public var pszDomain: Pwstr = null,
    public var pszPassword: Pwstr = null,
    public var fPromptForPassword: Bool = 0,
)

public data class WlxClientCredentialsInfoV20(
    public var dwType: UInt = 0u,
    public var pszUserName: Pwstr = null,
    public var pszDomain: Pwstr = null,
    public var pszPassword: Pwstr = null,
    public var fPromptForPassword: Bool = 0,
    public var fDisconnectOnLogonFailure: Bool = 0,
)

public class WlxConsoleswitchCredentialsInfoV10(
    public var dwType: UInt = 0u,
    public var userToken: Handle = null,
    public var logonId: Luid = Luid(),
    public var quotas: QuotaLimits = QuotaLimits(),
    public var userName: Pwstr = null,
    public var domain: Pwstr = null,
    public var logonTime: Long = 0L,
    public var smartCardLogon: Bool = 0,
    public var profileLength: UInt = 0u,
    public var messageType: UInt = 0u,
    public var logonCount: UShort = 0u,
    public var badPasswordCount: UShort = 0u,
    public var profileLogonTime: Long = 0L,
    public var logoffTime: Long = 0L,
    public var kickOffTime: Long = 0L,
    public var passwordLastSet: Long = 0L,
    public var passwordCanChange: Long = 0L,
    public var passwordMustChange: Long = 0L,
    public var logonScript: Pwstr = null,
    public var homeDirectory: Pwstr = null,
    public var fullName: Pwstr = null,
    public var profilePath: Pwstr = null,
    public var homeDirectoryDrive: Pwstr = null,
    public var logonServer: Pwstr = null,
    public var userFlags: UInt = 0u,
    public var privateDataLen: UInt = 0u,
    public var privateData: COpaquePointer? = null,
)

public data class WlxDesktop(
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
    public var hDesktop: Hdesk = null,
    public var pszDesktopName: Pwstr = null,
)

public data class WlxDispatchVersion10(
    public var wlxUseCtrlAltDel: PwlxUseCtrlAltDel = null,
    public var wlxSetContextPointer: PwlxSetContextPointer = null,
    public var wlxSasNotify: PwlxSasNotify = null,
    public var wlxSetTimeout: PwlxSetTimeout = null,
    public var wlxAssignShellProtection: PwlxAssignShellProtection = null,
    public var wlxMessageBox: PwlxMessageBox = null,
    public var wlxDialogBox: PwlxDialogBox = null,
    public var wlxDialogBoxParam: PwlxDialogBoxParam = null,
    public var wlxDialogBoxIndirect: PwlxDialogBoxIndirect = null,
    public var wlxDialogBoxIndirectParam: PwlxDialogBoxIndirectParam = null,
    public var wlxSwitchDesktopToUser: PwlxSwitchDesktopToUser = null,
    public var wlxSwitchDesktopToWinlogon: PwlxSwitchDesktopToWinlogon = null,
    public var wlxChangePasswordNotify: PwlxChangePasswordNotify = null,
)

public class WlxDispatchVersion11(
    public var wlxUseCtrlAltDel: PwlxUseCtrlAltDel = null,
    public var wlxSetContextPointer: PwlxSetContextPointer = null,
    public var wlxSasNotify: PwlxSasNotify = null,
    public var wlxSetTimeout: PwlxSetTimeout = null,
    public var wlxAssignShellProtection: PwlxAssignShellProtection = null,
    public var wlxMessageBox: PwlxMessageBox = null,
    public var wlxDialogBox: PwlxDialogBox = null,
    public var wlxDialogBoxParam: PwlxDialogBoxParam = null,
    public var wlxDialogBoxIndirect: PwlxDialogBoxIndirect = null,
    public var wlxDialogBoxIndirectParam: PwlxDialogBoxIndirectParam = null,
    public var wlxSwitchDesktopToUser: PwlxSwitchDesktopToUser = null,
    public var wlxSwitchDesktopToWinlogon: PwlxSwitchDesktopToWinlogon = null,
    public var wlxChangePasswordNotify: PwlxChangePasswordNotify = null,
    public var wlxGetSourceDesktop: PwlxGetSourceDesktop = null,
    public var wlxSetReturnDesktop: PwlxSetReturnDesktop = null,
    public var wlxCreateUserDesktop: PwlxCreateUserDesktop = null,
    public var wlxChangePasswordNotifyEx: PwlxChangePasswordNotifyEx = null,
)

public class WlxDispatchVersion12(
    public var wlxUseCtrlAltDel: PwlxUseCtrlAltDel = null,
    public var wlxSetContextPointer: PwlxSetContextPointer = null,
    public var wlxSasNotify: PwlxSasNotify = null,
    public var wlxSetTimeout: PwlxSetTimeout = null,
    public var wlxAssignShellProtection: PwlxAssignShellProtection = null,
    public var wlxMessageBox: PwlxMessageBox = null,
    public var wlxDialogBox: PwlxDialogBox = null,
    public var wlxDialogBoxParam: PwlxDialogBoxParam = null,
    public var wlxDialogBoxIndirect: PwlxDialogBoxIndirect = null,
    public var wlxDialogBoxIndirectParam: PwlxDialogBoxIndirectParam = null,
    public var wlxSwitchDesktopToUser: PwlxSwitchDesktopToUser = null,
    public var wlxSwitchDesktopToWinlogon: PwlxSwitchDesktopToWinlogon = null,
    public var wlxChangePasswordNotify: PwlxChangePasswordNotify = null,
    public var wlxGetSourceDesktop: PwlxGetSourceDesktop = null,
    public var wlxSetReturnDesktop: PwlxSetReturnDesktop = null,
    public var wlxCreateUserDesktop: PwlxCreateUserDesktop = null,
    public var wlxChangePasswordNotifyEx: PwlxChangePasswordNotifyEx = null,
    public var wlxCloseUserDesktop: PwlxCloseUserDesktop = null,
)

public class WlxDispatchVersion13(
    public var wlxUseCtrlAltDel: PwlxUseCtrlAltDel = null,
    public var wlxSetContextPointer: PwlxSetContextPointer = null,
    public var wlxSasNotify: PwlxSasNotify = null,
    public var wlxSetTimeout: PwlxSetTimeout = null,
    public var wlxAssignShellProtection: PwlxAssignShellProtection = null,
    public var wlxMessageBox: PwlxMessageBox = null,
    public var wlxDialogBox: PwlxDialogBox = null,
    public var wlxDialogBoxParam: PwlxDialogBoxParam = null,
    public var wlxDialogBoxIndirect: PwlxDialogBoxIndirect = null,
    public var wlxDialogBoxIndirectParam: PwlxDialogBoxIndirectParam = null,
    public var wlxSwitchDesktopToUser: PwlxSwitchDesktopToUser = null,
    public var wlxSwitchDesktopToWinlogon: PwlxSwitchDesktopToWinlogon = null,
    public var wlxChangePasswordNotify: PwlxChangePasswordNotify = null,
    public var wlxGetSourceDesktop: PwlxGetSourceDesktop = null,
    public var wlxSetReturnDesktop: PwlxSetReturnDesktop = null,
    public var wlxCreateUserDesktop: PwlxCreateUserDesktop = null,
    public var wlxChangePasswordNotifyEx: PwlxChangePasswordNotifyEx = null,
    public var wlxCloseUserDesktop: PwlxCloseUserDesktop = null,
    public var wlxSetOption: PwlxSetOption = null,
    public var wlxGetOption: PwlxGetOption = null,
    public var wlxWin31Migrate: PwlxWin31Migrate = null,
    public var wlxQueryClientCredentials: PwlxQueryClientCredentials = null,
    public var wlxQueryInetConnectorCredentials: PwlxQueryIcCredentials = null,
    public var wlxDisconnect: PwlxDisconnect = null,
    public var wlxQueryTerminalServicesData: PwlxQueryTerminalServicesData = null,
)

public class WlxDispatchVersion14(
    public var wlxUseCtrlAltDel: PwlxUseCtrlAltDel = null,
    public var wlxSetContextPointer: PwlxSetContextPointer = null,
    public var wlxSasNotify: PwlxSasNotify = null,
    public var wlxSetTimeout: PwlxSetTimeout = null,
    public var wlxAssignShellProtection: PwlxAssignShellProtection = null,
    public var wlxMessageBox: PwlxMessageBox = null,
    public var wlxDialogBox: PwlxDialogBox = null,
    public var wlxDialogBoxParam: PwlxDialogBoxParam = null,
    public var wlxDialogBoxIndirect: PwlxDialogBoxIndirect = null,
    public var wlxDialogBoxIndirectParam: PwlxDialogBoxIndirectParam = null,
    public var wlxSwitchDesktopToUser: PwlxSwitchDesktopToUser = null,
    public var wlxSwitchDesktopToWinlogon: PwlxSwitchDesktopToWinlogon = null,
    public var wlxChangePasswordNotify: PwlxChangePasswordNotify = null,
    public var wlxGetSourceDesktop: PwlxGetSourceDesktop = null,
    public var wlxSetReturnDesktop: PwlxSetReturnDesktop = null,
    public var wlxCreateUserDesktop: PwlxCreateUserDesktop = null,
    public var wlxChangePasswordNotifyEx: PwlxChangePasswordNotifyEx = null,
    public var wlxCloseUserDesktop: PwlxCloseUserDesktop = null,
    public var wlxSetOption: PwlxSetOption = null,
    public var wlxGetOption: PwlxGetOption = null,
    public var wlxWin31Migrate: PwlxWin31Migrate = null,
    public var wlxQueryClientCredentials: PwlxQueryClientCredentials = null,
    public var wlxQueryInetConnectorCredentials: PwlxQueryIcCredentials = null,
    public var wlxDisconnect: PwlxDisconnect = null,
    public var wlxQueryTerminalServicesData: PwlxQueryTerminalServicesData = null,
    public var wlxQueryConsoleSwitchCredentials: PwlxQueryConsoleswitchCredentials = null,
    public var wlxQueryTsLogonCredentials: PwlxQueryTsLogonCredentials = null,
)

public data class WlxMprNotifyInfo(
    public var pszUserName: Pwstr = null,
    public var pszDomain: Pwstr = null,
    public var pszPassword: Pwstr = null,
    public var pszOldPassword: Pwstr = null,
)

public data class WlxNotificationInfo(
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
    public var userName: Pwstr = null,
    public var domain: Pwstr = null,
    public var windowStation: Pwstr = null,
    public var hToken: Handle = null,
    public var hDesktop: Hdesk = null,
    public var pStatusCallback: Pfnmsgecallback = null,
)

public data class WlxProfileV10(public var dwType: UInt = 0u, public var pszProfile: Pwstr = null)

public data class WlxProfileV20(
    public var dwType: UInt = 0u,
    public var pszProfile: Pwstr = null,
    public var pszPolicy: Pwstr = null,
    public var pszNetworkDefaultUserProfile: Pwstr = null,
    public var pszServerName: Pwstr = null,
    public var pszEnvironment: Pwstr = null,
)

public data class WlxScNotificationInfo(
    public var pszCard: Pwstr = null,
    public var pszReader: Pwstr = null,
    public var pszContainer: Pwstr = null,
    public var pszCryptoProvider: Pwstr = null,
)

public data class WlxTerminalServicesData(
    public var profilePath: UShortArray = UShortArray(257),
    public var homeDir: UShortArray = UShortArray(257),
    public var homeDirDrive: UShortArray = UShortArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WlxTerminalServicesData) return false
        if (!this.profilePath.contentEquals(other.profilePath)) return false
        if (!this.homeDir.contentEquals(other.homeDir)) return false
        if (!this.homeDirDrive.contentEquals(other.homeDirDrive)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.profilePath.contentHashCode()
        result = 31 * result + this.homeDir.contentHashCode()
        result = 31 * result + this.homeDirDrive.contentHashCode()
        return result
    }
}
