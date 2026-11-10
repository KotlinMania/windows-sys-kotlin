@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Systemtime
import io.github.kotlinmania.windowssys.windows.win32.system.com.Safearray

public data class Gpobrowseinfo(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var hwndOwner: Hwnd = null,
    public var lpTitle: Pwstr = null,
    public var lpInitialOU: Pwstr = null,
    public var lpDSPath: Pwstr = null,
    public var dwDSPathSize: UInt = 0u,
    public var lpName: Pwstr = null,
    public var dwNameSize: UInt = 0u,
    public var gpoType: GroupPolicyObjectType = 0,
    public var gpoHint: GroupPolicyHintType = 0,
)

public data class GroupPolicyObjecta(
    public var dwOptions: UInt = 0u,
    public var dwVersion: UInt = 0u,
    public var lpDSPath: Pstr = null,
    public var lpFileSysPath: Pstr = null,
    public var lpDisplayName: Pstr = null,
    public var szGPOName: ByteArray = ByteArray(50),
    public var gPOLink: GpoLink = 0,
    public var lParam: Lparam = 0L,
    public var pNext: GroupPolicyObjecta? = null,
    public var pPrev: GroupPolicyObjecta? = null,
    public var lpExtensions: Pstr = null,
    public var lParam2: Lparam = 0L,
    public var lpLink: Pstr = null,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GroupPolicyObjecta) return false
        if (this.dwOptions != other.dwOptions) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.lpDSPath != other.lpDSPath) return false
        if (this.lpFileSysPath != other.lpFileSysPath) return false
        if (this.lpDisplayName != other.lpDisplayName) return false
        if (!this.szGPOName.contentEquals(other.szGPOName)) return false
        if (this.gPOLink != other.gPOLink) return false
        if (this.lParam != other.lParam) return false
        if (this.pNext != other.pNext) return false
        if (this.pPrev != other.pPrev) return false
        if (this.lpExtensions != other.lpExtensions) return false
        if (this.lParam2 != other.lParam2) return false
        if (this.lpLink != other.lpLink) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwOptions.hashCode()
        result = 31 * result + this.dwVersion.hashCode()
        result = 31 * result + this.lpDSPath.hashCode()
        result = 31 * result + this.lpFileSysPath.hashCode()
        result = 31 * result + this.lpDisplayName.hashCode()
        result = 31 * result + this.szGPOName.contentHashCode()
        result = 31 * result + this.gPOLink.hashCode()
        result = 31 * result + this.lParam.hashCode()
        result = 31 * result + this.pNext.hashCode()
        result = 31 * result + this.pPrev.hashCode()
        result = 31 * result + this.lpExtensions.hashCode()
        result = 31 * result + this.lParam2.hashCode()
        result = 31 * result + this.lpLink.hashCode()
        return result
    }
}

public data class GroupPolicyObjectw(
    public var dwOptions: UInt = 0u,
    public var dwVersion: UInt = 0u,
    public var lpDSPath: Pwstr = null,
    public var lpFileSysPath: Pwstr = null,
    public var lpDisplayName: Pwstr = null,
    public var szGPOName: UShortArray = UShortArray(50),
    public var gPOLink: GpoLink = 0,
    public var lParam: Lparam = 0L,
    public var pNext: GroupPolicyObjectw? = null,
    public var pPrev: GroupPolicyObjectw? = null,
    public var lpExtensions: Pwstr = null,
    public var lParam2: Lparam = 0L,
    public var lpLink: Pwstr = null,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GroupPolicyObjectw) return false
        if (this.dwOptions != other.dwOptions) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.lpDSPath != other.lpDSPath) return false
        if (this.lpFileSysPath != other.lpFileSysPath) return false
        if (this.lpDisplayName != other.lpDisplayName) return false
        if (!this.szGPOName.contentEquals(other.szGPOName)) return false
        if (this.gPOLink != other.gPOLink) return false
        if (this.lParam != other.lParam) return false
        if (this.pNext != other.pNext) return false
        if (this.pPrev != other.pPrev) return false
        if (this.lpExtensions != other.lpExtensions) return false
        if (this.lParam2 != other.lParam2) return false
        if (this.lpLink != other.lpLink) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwOptions.hashCode()
        result = 31 * result + this.dwVersion.hashCode()
        result = 31 * result + this.lpDSPath.hashCode()
        result = 31 * result + this.lpFileSysPath.hashCode()
        result = 31 * result + this.lpDisplayName.hashCode()
        result = 31 * result + this.szGPOName.contentHashCode()
        result = 31 * result + this.gPOLink.hashCode()
        result = 31 * result + this.lParam.hashCode()
        result = 31 * result + this.pNext.hashCode()
        result = 31 * result + this.pPrev.hashCode()
        result = 31 * result + this.lpExtensions.hashCode()
        result = 31 * result + this.lParam2.hashCode()
        result = 31 * result + this.lpLink.hashCode()
        return result
    }
}

public data class Installdata(
    public var type: Installspectype = 0,
    public var spec: Installspec = Installspec(),
)

public data class Installspec(
    public var appName: Installspec0 = Installspec0(),
    public var fileExt: Pwstr = null,
    public var progId: Pwstr = null,
    public var cOMClass: Installspec1 = Installspec1(),
)

public data class Installspec0(
    public var name: Pwstr = null,
    public var gPOId: Guid = Guid(),
)

public data class Installspec1(
    public var clsid: Guid = Guid(),
    public var clsCtx: UInt = 0u,
)

public data class Localmanagedapplication(
    public var pszDeploymentName: Pwstr = null,
    public var pszPolicyName: Pwstr = null,
    public var pszProductId: Pwstr = null,
    public var dwState: UInt = 0u,
)

public data class Managedapplication(
    public var pszPackageName: Pwstr = null,
    public var pszPublisher: Pwstr = null,
    public var dwVersionHi: UInt = 0u,
    public var dwVersionLo: UInt = 0u,
    public var dwRevision: UInt = 0u,
    public var gpoId: Guid = Guid(),
    public var pszPolicyName: Pwstr = null,
    public var productId: Guid = Guid(),
    public var language: UShort = 0u,
    public var pszOwner: Pwstr = null,
    public var pszCompany: Pwstr = null,
    public var pszComments: Pwstr = null,
    public var pszContact: Pwstr = null,
    public var pszSupportUrl: Pwstr = null,
    public var dwPathType: UInt = 0u,
    public var bInstalled: Bool = 0,
)

public data class Policysettingstatusinfo(
    public var szKey: Pwstr = null,
    public var szEventSource: Pwstr = null,
    public var szEventLogName: Pwstr = null,
    public var dwEventID: UInt = 0u,
    public var dwErrorCode: UInt = 0u,
    public var status: Settingstatus = 0,
    public var timeLogged: Systemtime = Systemtime(),
)

public data class RsopTarget(
    public var pwszAccountName: Pwstr = null,
    public var pwszNewSOM: Pwstr = null,
    public var psaSecurityGroups: Safearray? = null,
    public var pRsopToken: COpaquePointer? = null,
    public var pGPOList: GroupPolicyObjecta? = null,
    public var pWbemServices: COpaquePointer? = null,
)
