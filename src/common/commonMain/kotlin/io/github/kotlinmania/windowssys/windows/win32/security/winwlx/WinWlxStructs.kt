@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.winwlx

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Luid
import io.github.kotlinmania.windowssys.windows.win32.security.QuotaLimits
import io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops.Hdesk

public class WlxClientCredentialsInfoV10 internal constructor(
    public var dwType: UInt,
    pszUserNameCtorArg: Pwstr,
    pszDomainCtorArg: Pwstr,
    pszPasswordCtorArg: Pwstr,
    public var fPromptForPassword: Bool,
) {
    public var pszUserName: Pwstr = pszUserNameCtorArg
        internal set

    public var pszDomain: Pwstr = pszDomainCtorArg
        internal set

    public var pszPassword: Pwstr = pszPasswordCtorArg
        internal set

    public constructor() : this(
        dwType = 0u,
        pszUserNameCtorArg = MutPtr(0L),
        pszDomainCtorArg = MutPtr(0L),
        pszPasswordCtorArg = MutPtr(0L),
        fPromptForPassword = 0,
    )

    public operator fun component1(): UInt = this.dwType

    public operator fun component2(): Pwstr = this.pszUserName

    public operator fun component3(): Pwstr = this.pszDomain

    public operator fun component4(): Pwstr = this.pszPassword

    public operator fun component5(): Bool = this.fPromptForPassword

    public fun copy(dwType: UInt = this.dwType, pszUserName: Pwstr = this.pszUserName, pszDomain: Pwstr = this.pszDomain, pszPassword: Pwstr = this.pszPassword, fPromptForPassword: Bool = this.fPromptForPassword): WlxClientCredentialsInfoV10 = WlxClientCredentialsInfoV10(dwType = dwType, pszUserNameCtorArg = pszUserName, pszDomainCtorArg = pszDomain, pszPasswordCtorArg = pszPassword, fPromptForPassword = fPromptForPassword)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WlxClientCredentialsInfoV10) return false
        if (this.dwType != other.dwType) return false
        if (this.pszUserName != other.pszUserName) return false
        if (this.pszDomain != other.pszDomain) return false
        if (this.pszPassword != other.pszPassword) return false
        if (this.fPromptForPassword != other.fPromptForPassword) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwType.hashCode()
        result = 31 * result + this.pszUserName.hashCode()
        result = 31 * result + this.pszDomain.hashCode()
        result = 31 * result + this.pszPassword.hashCode()
        result = 31 * result + this.fPromptForPassword.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwType: UInt = 0u,
            pszUserName: Pwstr = MutPtr(0L),
            pszDomain: Pwstr = MutPtr(0L),
            pszPassword: Pwstr = MutPtr(0L),
            fPromptForPassword: Bool = 0,
        ): WlxClientCredentialsInfoV10 =
            WlxClientCredentialsInfoV10(
                dwType = dwType,
                pszUserNameCtorArg = pszUserName,
                pszDomainCtorArg = pszDomain,
                pszPasswordCtorArg = pszPassword,
                fPromptForPassword = fPromptForPassword,
            )
    }
}

public class WlxClientCredentialsInfoV20 internal constructor(
    public var dwType: UInt,
    pszUserNameCtorArg: Pwstr,
    pszDomainCtorArg: Pwstr,
    pszPasswordCtorArg: Pwstr,
    public var fPromptForPassword: Bool,
    public var fDisconnectOnLogonFailure: Bool,
) {
    public var pszUserName: Pwstr = pszUserNameCtorArg
        internal set

    public var pszDomain: Pwstr = pszDomainCtorArg
        internal set

    public var pszPassword: Pwstr = pszPasswordCtorArg
        internal set

    public constructor() : this(
        dwType = 0u,
        pszUserNameCtorArg = MutPtr(0L),
        pszDomainCtorArg = MutPtr(0L),
        pszPasswordCtorArg = MutPtr(0L),
        fPromptForPassword = 0,
        fDisconnectOnLogonFailure = 0,
    )

    public operator fun component1(): UInt = this.dwType

    public operator fun component2(): Pwstr = this.pszUserName

    public operator fun component3(): Pwstr = this.pszDomain

    public operator fun component4(): Pwstr = this.pszPassword

    public operator fun component5(): Bool = this.fPromptForPassword

    public operator fun component6(): Bool = this.fDisconnectOnLogonFailure

    public fun copy(dwType: UInt = this.dwType, pszUserName: Pwstr = this.pszUserName, pszDomain: Pwstr = this.pszDomain, pszPassword: Pwstr = this.pszPassword, fPromptForPassword: Bool = this.fPromptForPassword, fDisconnectOnLogonFailure: Bool = this.fDisconnectOnLogonFailure): WlxClientCredentialsInfoV20 = WlxClientCredentialsInfoV20(dwType = dwType, pszUserNameCtorArg = pszUserName, pszDomainCtorArg = pszDomain, pszPasswordCtorArg = pszPassword, fPromptForPassword = fPromptForPassword, fDisconnectOnLogonFailure = fDisconnectOnLogonFailure)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WlxClientCredentialsInfoV20) return false
        if (this.dwType != other.dwType) return false
        if (this.pszUserName != other.pszUserName) return false
        if (this.pszDomain != other.pszDomain) return false
        if (this.pszPassword != other.pszPassword) return false
        if (this.fPromptForPassword != other.fPromptForPassword) return false
        if (this.fDisconnectOnLogonFailure != other.fDisconnectOnLogonFailure) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwType.hashCode()
        result = 31 * result + this.pszUserName.hashCode()
        result = 31 * result + this.pszDomain.hashCode()
        result = 31 * result + this.pszPassword.hashCode()
        result = 31 * result + this.fPromptForPassword.hashCode()
        result = 31 * result + this.fDisconnectOnLogonFailure.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwType: UInt = 0u,
            pszUserName: Pwstr = MutPtr(0L),
            pszDomain: Pwstr = MutPtr(0L),
            pszPassword: Pwstr = MutPtr(0L),
            fPromptForPassword: Bool = 0,
            fDisconnectOnLogonFailure: Bool = 0,
        ): WlxClientCredentialsInfoV20 =
            WlxClientCredentialsInfoV20(
                dwType = dwType,
                pszUserNameCtorArg = pszUserName,
                pszDomainCtorArg = pszDomain,
                pszPasswordCtorArg = pszPassword,
                fPromptForPassword = fPromptForPassword,
                fDisconnectOnLogonFailure = fDisconnectOnLogonFailure,
            )
    }
}

public class WlxConsoleswitchCredentialsInfoV10 internal constructor(
    public var dwType: UInt,
    userTokenCtorArg: Handle,
    public var logonId: Luid,
    public var quotas: QuotaLimits,
    userNameCtorArg: Pwstr,
    domainCtorArg: Pwstr,
    public var logonTime: Long,
    public var smartCardLogon: Bool,
    public var profileLength: UInt,
    public var messageType: UInt,
    public var logonCount: UShort,
    public var badPasswordCount: UShort,
    public var profileLogonTime: Long,
    public var logoffTime: Long,
    public var kickOffTime: Long,
    public var passwordLastSet: Long,
    public var passwordCanChange: Long,
    public var passwordMustChange: Long,
    logonScriptCtorArg: Pwstr,
    homeDirectoryCtorArg: Pwstr,
    fullNameCtorArg: Pwstr,
    profilePathCtorArg: Pwstr,
    homeDirectoryDriveCtorArg: Pwstr,
    logonServerCtorArg: Pwstr,
    public var userFlags: UInt,
    public var privateDataLen: UInt,
    privateDataCtorArg: MutPtr,
) {
    public var userToken: Handle = userTokenCtorArg
        internal set

    public var userName: Pwstr = userNameCtorArg
        internal set

    public var domain: Pwstr = domainCtorArg
        internal set

    public var logonScript: Pwstr = logonScriptCtorArg
        internal set

    public var homeDirectory: Pwstr = homeDirectoryCtorArg
        internal set

    public var fullName: Pwstr = fullNameCtorArg
        internal set

    public var profilePath: Pwstr = profilePathCtorArg
        internal set

    public var homeDirectoryDrive: Pwstr = homeDirectoryDriveCtorArg
        internal set

    public var logonServer: Pwstr = logonServerCtorArg
        internal set

    public var privateData: MutPtr = privateDataCtorArg
        internal set

    public constructor() : this(
        dwType = 0u,
        userTokenCtorArg = MutPtr(0L),
        logonId = Luid(),
        quotas = QuotaLimits(),
        userNameCtorArg = MutPtr(0L),
        domainCtorArg = MutPtr(0L),
        logonTime = 0L,
        smartCardLogon = 0,
        profileLength = 0u,
        messageType = 0u,
        logonCount = 0u,
        badPasswordCount = 0u,
        profileLogonTime = 0L,
        logoffTime = 0L,
        kickOffTime = 0L,
        passwordLastSet = 0L,
        passwordCanChange = 0L,
        passwordMustChange = 0L,
        logonScriptCtorArg = MutPtr(0L),
        homeDirectoryCtorArg = MutPtr(0L),
        fullNameCtorArg = MutPtr(0L),
        profilePathCtorArg = MutPtr(0L),
        homeDirectoryDriveCtorArg = MutPtr(0L),
        logonServerCtorArg = MutPtr(0L),
        userFlags = 0u,
        privateDataLen = 0u,
        privateDataCtorArg = MutPtr(0L),
    )

    public companion object {
        public operator fun invoke(
            dwType: UInt = 0u,
            userToken: Handle = MutPtr(0L),
            logonId: Luid = Luid(),
            quotas: QuotaLimits = QuotaLimits(),
            userName: Pwstr = MutPtr(0L),
            domain: Pwstr = MutPtr(0L),
            logonTime: Long = 0L,
            smartCardLogon: Bool = 0,
            profileLength: UInt = 0u,
            messageType: UInt = 0u,
            logonCount: UShort = 0u,
            badPasswordCount: UShort = 0u,
            profileLogonTime: Long = 0L,
            logoffTime: Long = 0L,
            kickOffTime: Long = 0L,
            passwordLastSet: Long = 0L,
            passwordCanChange: Long = 0L,
            passwordMustChange: Long = 0L,
            logonScript: Pwstr = MutPtr(0L),
            homeDirectory: Pwstr = MutPtr(0L),
            fullName: Pwstr = MutPtr(0L),
            profilePath: Pwstr = MutPtr(0L),
            homeDirectoryDrive: Pwstr = MutPtr(0L),
            logonServer: Pwstr = MutPtr(0L),
            userFlags: UInt = 0u,
            privateDataLen: UInt = 0u,
            privateData: MutPtr = MutPtr(0L),
        ): WlxConsoleswitchCredentialsInfoV10 =
            WlxConsoleswitchCredentialsInfoV10(
                dwType = dwType,
                userTokenCtorArg = userToken,
                logonId = logonId,
                quotas = quotas,
                userNameCtorArg = userName,
                domainCtorArg = domain,
                logonTime = logonTime,
                smartCardLogon = smartCardLogon,
                profileLength = profileLength,
                messageType = messageType,
                logonCount = logonCount,
                badPasswordCount = badPasswordCount,
                profileLogonTime = profileLogonTime,
                logoffTime = logoffTime,
                kickOffTime = kickOffTime,
                passwordLastSet = passwordLastSet,
                passwordCanChange = passwordCanChange,
                passwordMustChange = passwordMustChange,
                logonScriptCtorArg = logonScript,
                homeDirectoryCtorArg = homeDirectory,
                fullNameCtorArg = fullName,
                profilePathCtorArg = profilePath,
                homeDirectoryDriveCtorArg = homeDirectoryDrive,
                logonServerCtorArg = logonServer,
                userFlags = userFlags,
                privateDataLen = privateDataLen,
                privateDataCtorArg = privateData,
            )
    }
}

public class WlxDesktop internal constructor(
    public var size: UInt,
    public var flags: UInt,
    hDesktopCtorArg: Hdesk,
    pszDesktopNameCtorArg: Pwstr,
) {
    public var hDesktop: Hdesk = hDesktopCtorArg
        internal set

    public var pszDesktopName: Pwstr = pszDesktopNameCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        flags = 0u,
        hDesktopCtorArg = MutPtr(0L),
        pszDesktopNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.size

    public operator fun component2(): UInt = this.flags

    public operator fun component3(): Hdesk = this.hDesktop

    public operator fun component4(): Pwstr = this.pszDesktopName

    public fun copy(size: UInt = this.size, flags: UInt = this.flags, hDesktop: Hdesk = this.hDesktop, pszDesktopName: Pwstr = this.pszDesktopName): WlxDesktop = WlxDesktop(size = size, flags = flags, hDesktopCtorArg = hDesktop, pszDesktopNameCtorArg = pszDesktopName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WlxDesktop) return false
        if (this.size != other.size) return false
        if (this.flags != other.flags) return false
        if (this.hDesktop != other.hDesktop) return false
        if (this.pszDesktopName != other.pszDesktopName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.hDesktop.hashCode()
        result = 31 * result + this.pszDesktopName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            size: UInt = 0u,
            flags: UInt = 0u,
            hDesktop: Hdesk = MutPtr(0L),
            pszDesktopName: Pwstr = MutPtr(0L),
        ): WlxDesktop =
            WlxDesktop(
                size = size,
                flags = flags,
                hDesktopCtorArg = hDesktop,
                pszDesktopNameCtorArg = pszDesktopName,
            )
    }
}

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

public class WlxMprNotifyInfo internal constructor(
    pszUserNameCtorArg: Pwstr,
    pszDomainCtorArg: Pwstr,
    pszPasswordCtorArg: Pwstr,
    pszOldPasswordCtorArg: Pwstr,
) {
    public var pszUserName: Pwstr = pszUserNameCtorArg
        internal set

    public var pszDomain: Pwstr = pszDomainCtorArg
        internal set

    public var pszPassword: Pwstr = pszPasswordCtorArg
        internal set

    public var pszOldPassword: Pwstr = pszOldPasswordCtorArg
        internal set

    public constructor() : this(
        pszUserNameCtorArg = MutPtr(0L),
        pszDomainCtorArg = MutPtr(0L),
        pszPasswordCtorArg = MutPtr(0L),
        pszOldPasswordCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.pszUserName

    public operator fun component2(): Pwstr = this.pszDomain

    public operator fun component3(): Pwstr = this.pszPassword

    public operator fun component4(): Pwstr = this.pszOldPassword

    public fun copy(pszUserName: Pwstr = this.pszUserName, pszDomain: Pwstr = this.pszDomain, pszPassword: Pwstr = this.pszPassword, pszOldPassword: Pwstr = this.pszOldPassword): WlxMprNotifyInfo = WlxMprNotifyInfo(pszUserNameCtorArg = pszUserName, pszDomainCtorArg = pszDomain, pszPasswordCtorArg = pszPassword, pszOldPasswordCtorArg = pszOldPassword)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WlxMprNotifyInfo) return false
        if (this.pszUserName != other.pszUserName) return false
        if (this.pszDomain != other.pszDomain) return false
        if (this.pszPassword != other.pszPassword) return false
        if (this.pszOldPassword != other.pszOldPassword) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszUserName.hashCode()
        result = 31 * result + this.pszDomain.hashCode()
        result = 31 * result + this.pszPassword.hashCode()
        result = 31 * result + this.pszOldPassword.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszUserName: Pwstr = MutPtr(0L),
            pszDomain: Pwstr = MutPtr(0L),
            pszPassword: Pwstr = MutPtr(0L),
            pszOldPassword: Pwstr = MutPtr(0L),
        ): WlxMprNotifyInfo =
            WlxMprNotifyInfo(
                pszUserNameCtorArg = pszUserName,
                pszDomainCtorArg = pszDomain,
                pszPasswordCtorArg = pszPassword,
                pszOldPasswordCtorArg = pszOldPassword,
            )
    }
}

public class WlxNotificationInfo internal constructor(
    public var size: UInt,
    public var flags: UInt,
    userNameCtorArg: Pwstr,
    domainCtorArg: Pwstr,
    windowStationCtorArg: Pwstr,
    hTokenCtorArg: Handle,
    hDesktopCtorArg: Hdesk,
    public var pStatusCallback: Pfnmsgecallback,
) {
    public var userName: Pwstr = userNameCtorArg
        internal set

    public var domain: Pwstr = domainCtorArg
        internal set

    public var windowStation: Pwstr = windowStationCtorArg
        internal set

    public var hToken: Handle = hTokenCtorArg
        internal set

    public var hDesktop: Hdesk = hDesktopCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        flags = 0u,
        userNameCtorArg = MutPtr(0L),
        domainCtorArg = MutPtr(0L),
        windowStationCtorArg = MutPtr(0L),
        hTokenCtorArg = MutPtr(0L),
        hDesktopCtorArg = MutPtr(0L),
        pStatusCallback = null,
    )

    public operator fun component1(): UInt = this.size

    public operator fun component2(): UInt = this.flags

    public operator fun component3(): Pwstr = this.userName

    public operator fun component4(): Pwstr = this.domain

    public operator fun component5(): Pwstr = this.windowStation

    public operator fun component6(): Handle = this.hToken

    public operator fun component7(): Hdesk = this.hDesktop

    public operator fun component8(): Pfnmsgecallback = this.pStatusCallback

    public fun copy(size: UInt = this.size, flags: UInt = this.flags, userName: Pwstr = this.userName, domain: Pwstr = this.domain, windowStation: Pwstr = this.windowStation, hToken: Handle = this.hToken, hDesktop: Hdesk = this.hDesktop, pStatusCallback: Pfnmsgecallback = this.pStatusCallback): WlxNotificationInfo = WlxNotificationInfo(size = size, flags = flags, userNameCtorArg = userName, domainCtorArg = domain, windowStationCtorArg = windowStation, hTokenCtorArg = hToken, hDesktopCtorArg = hDesktop, pStatusCallback = pStatusCallback)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WlxNotificationInfo) return false
        if (this.size != other.size) return false
        if (this.flags != other.flags) return false
        if (this.userName != other.userName) return false
        if (this.domain != other.domain) return false
        if (this.windowStation != other.windowStation) return false
        if (this.hToken != other.hToken) return false
        if (this.hDesktop != other.hDesktop) return false
        if (this.pStatusCallback != other.pStatusCallback) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.userName.hashCode()
        result = 31 * result + this.domain.hashCode()
        result = 31 * result + this.windowStation.hashCode()
        result = 31 * result + this.hToken.hashCode()
        result = 31 * result + this.hDesktop.hashCode()
        result = 31 * result + this.pStatusCallback.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            size: UInt = 0u,
            flags: UInt = 0u,
            userName: Pwstr = MutPtr(0L),
            domain: Pwstr = MutPtr(0L),
            windowStation: Pwstr = MutPtr(0L),
            hToken: Handle = MutPtr(0L),
            hDesktop: Hdesk = MutPtr(0L),
            pStatusCallback: Pfnmsgecallback = null,
        ): WlxNotificationInfo =
            WlxNotificationInfo(
                size = size,
                flags = flags,
                userNameCtorArg = userName,
                domainCtorArg = domain,
                windowStationCtorArg = windowStation,
                hTokenCtorArg = hToken,
                hDesktopCtorArg = hDesktop,
                pStatusCallback = pStatusCallback,
            )
    }
}

public class WlxProfileV10 internal constructor(
    public var dwType: UInt,
    pszProfileCtorArg: Pwstr,
) {
    public var pszProfile: Pwstr = pszProfileCtorArg
        internal set

    public constructor() : this(
        dwType = 0u,
        pszProfileCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwType

    public operator fun component2(): Pwstr = this.pszProfile

    public fun copy(dwType: UInt = this.dwType, pszProfile: Pwstr = this.pszProfile): WlxProfileV10 = WlxProfileV10(dwType = dwType, pszProfileCtorArg = pszProfile)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WlxProfileV10) return false
        if (this.dwType != other.dwType) return false
        if (this.pszProfile != other.pszProfile) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwType.hashCode()
        result = 31 * result + this.pszProfile.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwType: UInt = 0u,
            pszProfile: Pwstr = MutPtr(0L),
        ): WlxProfileV10 =
            WlxProfileV10(
                dwType = dwType,
                pszProfileCtorArg = pszProfile,
            )
    }
}

public class WlxProfileV20 internal constructor(
    public var dwType: UInt,
    pszProfileCtorArg: Pwstr,
    pszPolicyCtorArg: Pwstr,
    pszNetworkDefaultUserProfileCtorArg: Pwstr,
    pszServerNameCtorArg: Pwstr,
    pszEnvironmentCtorArg: Pwstr,
) {
    public var pszProfile: Pwstr = pszProfileCtorArg
        internal set

    public var pszPolicy: Pwstr = pszPolicyCtorArg
        internal set

    public var pszNetworkDefaultUserProfile: Pwstr = pszNetworkDefaultUserProfileCtorArg
        internal set

    public var pszServerName: Pwstr = pszServerNameCtorArg
        internal set

    public var pszEnvironment: Pwstr = pszEnvironmentCtorArg
        internal set

    public constructor() : this(
        dwType = 0u,
        pszProfileCtorArg = MutPtr(0L),
        pszPolicyCtorArg = MutPtr(0L),
        pszNetworkDefaultUserProfileCtorArg = MutPtr(0L),
        pszServerNameCtorArg = MutPtr(0L),
        pszEnvironmentCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwType

    public operator fun component2(): Pwstr = this.pszProfile

    public operator fun component3(): Pwstr = this.pszPolicy

    public operator fun component4(): Pwstr = this.pszNetworkDefaultUserProfile

    public operator fun component5(): Pwstr = this.pszServerName

    public operator fun component6(): Pwstr = this.pszEnvironment

    public fun copy(dwType: UInt = this.dwType, pszProfile: Pwstr = this.pszProfile, pszPolicy: Pwstr = this.pszPolicy, pszNetworkDefaultUserProfile: Pwstr = this.pszNetworkDefaultUserProfile, pszServerName: Pwstr = this.pszServerName, pszEnvironment: Pwstr = this.pszEnvironment): WlxProfileV20 = WlxProfileV20(dwType = dwType, pszProfileCtorArg = pszProfile, pszPolicyCtorArg = pszPolicy, pszNetworkDefaultUserProfileCtorArg = pszNetworkDefaultUserProfile, pszServerNameCtorArg = pszServerName, pszEnvironmentCtorArg = pszEnvironment)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WlxProfileV20) return false
        if (this.dwType != other.dwType) return false
        if (this.pszProfile != other.pszProfile) return false
        if (this.pszPolicy != other.pszPolicy) return false
        if (this.pszNetworkDefaultUserProfile != other.pszNetworkDefaultUserProfile) return false
        if (this.pszServerName != other.pszServerName) return false
        if (this.pszEnvironment != other.pszEnvironment) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwType.hashCode()
        result = 31 * result + this.pszProfile.hashCode()
        result = 31 * result + this.pszPolicy.hashCode()
        result = 31 * result + this.pszNetworkDefaultUserProfile.hashCode()
        result = 31 * result + this.pszServerName.hashCode()
        result = 31 * result + this.pszEnvironment.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwType: UInt = 0u,
            pszProfile: Pwstr = MutPtr(0L),
            pszPolicy: Pwstr = MutPtr(0L),
            pszNetworkDefaultUserProfile: Pwstr = MutPtr(0L),
            pszServerName: Pwstr = MutPtr(0L),
            pszEnvironment: Pwstr = MutPtr(0L),
        ): WlxProfileV20 =
            WlxProfileV20(
                dwType = dwType,
                pszProfileCtorArg = pszProfile,
                pszPolicyCtorArg = pszPolicy,
                pszNetworkDefaultUserProfileCtorArg = pszNetworkDefaultUserProfile,
                pszServerNameCtorArg = pszServerName,
                pszEnvironmentCtorArg = pszEnvironment,
            )
    }
}

public class WlxScNotificationInfo internal constructor(
    pszCardCtorArg: Pwstr,
    pszReaderCtorArg: Pwstr,
    pszContainerCtorArg: Pwstr,
    pszCryptoProviderCtorArg: Pwstr,
) {
    public var pszCard: Pwstr = pszCardCtorArg
        internal set

    public var pszReader: Pwstr = pszReaderCtorArg
        internal set

    public var pszContainer: Pwstr = pszContainerCtorArg
        internal set

    public var pszCryptoProvider: Pwstr = pszCryptoProviderCtorArg
        internal set

    public constructor() : this(
        pszCardCtorArg = MutPtr(0L),
        pszReaderCtorArg = MutPtr(0L),
        pszContainerCtorArg = MutPtr(0L),
        pszCryptoProviderCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.pszCard

    public operator fun component2(): Pwstr = this.pszReader

    public operator fun component3(): Pwstr = this.pszContainer

    public operator fun component4(): Pwstr = this.pszCryptoProvider

    public fun copy(pszCard: Pwstr = this.pszCard, pszReader: Pwstr = this.pszReader, pszContainer: Pwstr = this.pszContainer, pszCryptoProvider: Pwstr = this.pszCryptoProvider): WlxScNotificationInfo = WlxScNotificationInfo(pszCardCtorArg = pszCard, pszReaderCtorArg = pszReader, pszContainerCtorArg = pszContainer, pszCryptoProviderCtorArg = pszCryptoProvider)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WlxScNotificationInfo) return false
        if (this.pszCard != other.pszCard) return false
        if (this.pszReader != other.pszReader) return false
        if (this.pszContainer != other.pszContainer) return false
        if (this.pszCryptoProvider != other.pszCryptoProvider) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszCard.hashCode()
        result = 31 * result + this.pszReader.hashCode()
        result = 31 * result + this.pszContainer.hashCode()
        result = 31 * result + this.pszCryptoProvider.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszCard: Pwstr = MutPtr(0L),
            pszReader: Pwstr = MutPtr(0L),
            pszContainer: Pwstr = MutPtr(0L),
            pszCryptoProvider: Pwstr = MutPtr(0L),
        ): WlxScNotificationInfo =
            WlxScNotificationInfo(
                pszCardCtorArg = pszCard,
                pszReaderCtorArg = pszReader,
                pszContainerCtorArg = pszContainer,
                pszCryptoProviderCtorArg = pszCryptoProvider,
            )
    }
}

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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WlxTerminalServicesData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WlxTerminalServicesData> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 1036L
                override fun readNative(addr: Long): WlxTerminalServicesData =
                    WlxTerminalServicesData(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (257).toInt())
                        ).readNative(addr).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (257).toInt())
                        ).readNative(addr + 514L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (4).toInt())
                        ).readNative(addr + 1028L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: WlxTerminalServicesData) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (257).toInt())
                    ).writeNative(addr, value.profilePath.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (257).toInt())
                    ).writeNative(addr + 514L, value.homeDir.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (4).toInt())
                    ).writeNative(addr + 1028L, value.homeDirDrive.toList())
                }
            }
    }
}
