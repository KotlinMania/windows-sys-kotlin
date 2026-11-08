@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.LPARAM
import io.github.kotlinmania.windowssys.windows.win32.foundation.SYSTEMTIME

public data class GPOBROWSEINFO(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var hwndOwner: HWND = 0L,
    public var lpTitle: PWSTR = 0L,
    public var lpInitialOU: PWSTR = 0L,
    public var lpDSPath: PWSTR = 0L,
    public var dwDSPathSize: UInt = 0u,
    public var lpName: PWSTR = 0L,
    public var dwNameSize: UInt = 0u,
    public var gpoType: GROUP_POLICY_OBJECT_TYPE = 0,
    public var gpoHint: GROUP_POLICY_HINT_TYPE = 0,
)

public data class GROUP_POLICY_OBJECTA(
    public var dwOptions: UInt = 0u,
    public var dwVersion: UInt = 0u,
    public var lpDSPath: PSTR = 0L,
    public var lpFileSysPath: PSTR = 0L,
    public var lpDisplayName: PSTR = 0L,
    public var szGPOName: ByteArray = ByteArray(50),
    public var GPOLink: GPO_LINK = 0,
    public var lParam: LPARAM = 0L,
    public var pNext: Long = 0L,
    public var pPrev: Long = 0L,
    public var lpExtensions: PSTR = 0L,
    public var lParam2: LPARAM = 0L,
    public var lpLink: PSTR = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GROUP_POLICY_OBJECTA) return false
        if (this.dwOptions != other.dwOptions) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.lpDSPath != other.lpDSPath) return false
        if (this.lpFileSysPath != other.lpFileSysPath) return false
        if (this.lpDisplayName != other.lpDisplayName) return false
        if (!this.szGPOName.contentEquals(other.szGPOName)) return false
        if (this.GPOLink != other.GPOLink) return false
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
        result = 31 * result + this.GPOLink.hashCode()
        result = 31 * result + this.lParam.hashCode()
        result = 31 * result + this.pNext.hashCode()
        result = 31 * result + this.pPrev.hashCode()
        result = 31 * result + this.lpExtensions.hashCode()
        result = 31 * result + this.lParam2.hashCode()
        result = 31 * result + this.lpLink.hashCode()
        return result
    }
}

public data class GROUP_POLICY_OBJECTW(
    public var dwOptions: UInt = 0u,
    public var dwVersion: UInt = 0u,
    public var lpDSPath: PWSTR = 0L,
    public var lpFileSysPath: PWSTR = 0L,
    public var lpDisplayName: PWSTR = 0L,
    public var szGPOName: UShortArray = UShortArray(50),
    public var GPOLink: GPO_LINK = 0,
    public var lParam: LPARAM = 0L,
    public var pNext: Long = 0L,
    public var pPrev: Long = 0L,
    public var lpExtensions: PWSTR = 0L,
    public var lParam2: LPARAM = 0L,
    public var lpLink: PWSTR = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GROUP_POLICY_OBJECTW) return false
        if (this.dwOptions != other.dwOptions) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.lpDSPath != other.lpDSPath) return false
        if (this.lpFileSysPath != other.lpFileSysPath) return false
        if (this.lpDisplayName != other.lpDisplayName) return false
        if (!this.szGPOName.contentEquals(other.szGPOName)) return false
        if (this.GPOLink != other.GPOLink) return false
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
        result = 31 * result + this.GPOLink.hashCode()
        result = 31 * result + this.lParam.hashCode()
        result = 31 * result + this.pNext.hashCode()
        result = 31 * result + this.pPrev.hashCode()
        result = 31 * result + this.lpExtensions.hashCode()
        result = 31 * result + this.lParam2.hashCode()
        result = 31 * result + this.lpLink.hashCode()
        return result
    }
}

public data class INSTALLDATA(public var Type: INSTALLSPECTYPE = 0, public var Spec: INSTALLSPEC = INSTALLSPEC())

public data class INSTALLSPEC(
    public var AppName: INSTALLSPEC_0 = INSTALLSPEC_0(),
    public var FileExt: PWSTR = 0L,
    public var ProgId: PWSTR = 0L,
    public var COMClass: INSTALLSPEC_1 = INSTALLSPEC_1(),
)

public data class INSTALLSPEC_0(public var Name: PWSTR = 0L, public var GPOId: GUID = GUID())

public data class INSTALLSPEC_1(public var Clsid: GUID = GUID(), public var ClsCtx: UInt = 0u)

public data class LOCALMANAGEDAPPLICATION(
    public var pszDeploymentName: PWSTR = 0L,
    public var pszPolicyName: PWSTR = 0L,
    public var pszProductId: PWSTR = 0L,
    public var dwState: UInt = 0u,
)

public data class MANAGEDAPPLICATION(
    public var pszPackageName: PWSTR = 0L,
    public var pszPublisher: PWSTR = 0L,
    public var dwVersionHi: UInt = 0u,
    public var dwVersionLo: UInt = 0u,
    public var dwRevision: UInt = 0u,
    public var GpoId: GUID = GUID(),
    public var pszPolicyName: PWSTR = 0L,
    public var ProductId: GUID = GUID(),
    public var Language: UShort = 0u,
    public var pszOwner: PWSTR = 0L,
    public var pszCompany: PWSTR = 0L,
    public var pszComments: PWSTR = 0L,
    public var pszContact: PWSTR = 0L,
    public var pszSupportUrl: PWSTR = 0L,
    public var dwPathType: UInt = 0u,
    public var bInstalled: BOOL = 0,
)

public data class POLICYSETTINGSTATUSINFO(
    public var szKey: PWSTR = 0L,
    public var szEventSource: PWSTR = 0L,
    public var szEventLogName: PWSTR = 0L,
    public var dwEventID: UInt = 0u,
    public var dwErrorCode: UInt = 0u,
    public var status: SETTINGSTATUS = 0,
    public var timeLogged: SYSTEMTIME = SYSTEMTIME(),
)

public data class RSOP_TARGET(
    public var pwszAccountName: PWSTR = 0L,
    public var pwszNewSOM: PWSTR = 0L,
    public var psaSecurityGroups: Long = 0L,
    public var pRsopToken: Long = 0L,
    public var pGPOList: Long = 0L,
    public var pWbemServices: Long = 0L,
)
