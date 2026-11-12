package io.github.kotlinmania.windowssys.windows.win32.management.mobiledevicemanagementregistration

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pwstr

public class ManagementRegistrationInfo internal constructor(
    public var fDeviceRegisteredWithManagement: Bool,
    public var dwDeviceRegistionKind: UInt,
    pszUPNCtorArg: Pwstr,
    pszMDMServiceUriCtorArg: Pwstr,
) {
    public var pszUPN: Pwstr = pszUPNCtorArg
        internal set

    public var pszMDMServiceUri: Pwstr = pszMDMServiceUriCtorArg
        internal set

    public constructor() : this(
        fDeviceRegisteredWithManagement = 0,
        dwDeviceRegistionKind = 0u,
        pszUPNCtorArg = MutPtr(0L),
        pszMDMServiceUriCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Bool = this.fDeviceRegisteredWithManagement

    public operator fun component2(): UInt = this.dwDeviceRegistionKind

    public operator fun component3(): Pwstr = this.pszUPN

    public operator fun component4(): Pwstr = this.pszMDMServiceUri

    public fun copy(fDeviceRegisteredWithManagement: Bool = this.fDeviceRegisteredWithManagement, dwDeviceRegistionKind: UInt = this.dwDeviceRegistionKind, pszUPN: Pwstr = this.pszUPN, pszMDMServiceUri: Pwstr = this.pszMDMServiceUri): ManagementRegistrationInfo = ManagementRegistrationInfo(fDeviceRegisteredWithManagement = fDeviceRegisteredWithManagement, dwDeviceRegistionKind = dwDeviceRegistionKind, pszUPNCtorArg = pszUPN, pszMDMServiceUriCtorArg = pszMDMServiceUri)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ManagementRegistrationInfo) return false
        if (this.fDeviceRegisteredWithManagement != other.fDeviceRegisteredWithManagement) return false
        if (this.dwDeviceRegistionKind != other.dwDeviceRegistionKind) return false
        if (this.pszUPN != other.pszUPN) return false
        if (this.pszMDMServiceUri != other.pszMDMServiceUri) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fDeviceRegisteredWithManagement.hashCode()
        result = 31 * result + this.dwDeviceRegistionKind.hashCode()
        result = 31 * result + this.pszUPN.hashCode()
        result = 31 * result + this.pszMDMServiceUri.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            fDeviceRegisteredWithManagement: Bool = 0,
            dwDeviceRegistionKind: UInt = 0u,
            pszUPN: Pwstr = MutPtr(0L),
            pszMDMServiceUri: Pwstr = MutPtr(0L),
        ): ManagementRegistrationInfo =
            ManagementRegistrationInfo(
                fDeviceRegisteredWithManagement = fDeviceRegisteredWithManagement,
                dwDeviceRegistionKind = dwDeviceRegistionKind,
                pszUPNCtorArg = pszUPN,
                pszMDMServiceUriCtorArg = pszMDMServiceUri,
            )
    }
}

public class ManagementServiceInfo internal constructor(
    pszMDMServiceUriCtorArg: Pwstr,
    pszAuthenticationUriCtorArg: Pwstr,
) {
    public var pszMDMServiceUri: Pwstr = pszMDMServiceUriCtorArg
        internal set

    public var pszAuthenticationUri: Pwstr = pszAuthenticationUriCtorArg
        internal set

    public constructor() : this(
        pszMDMServiceUriCtorArg = MutPtr(0L),
        pszAuthenticationUriCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.pszMDMServiceUri

    public operator fun component2(): Pwstr = this.pszAuthenticationUri

    public fun copy(pszMDMServiceUri: Pwstr = this.pszMDMServiceUri, pszAuthenticationUri: Pwstr = this.pszAuthenticationUri): ManagementServiceInfo = ManagementServiceInfo(pszMDMServiceUriCtorArg = pszMDMServiceUri, pszAuthenticationUriCtorArg = pszAuthenticationUri)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ManagementServiceInfo) return false
        if (this.pszMDMServiceUri != other.pszMDMServiceUri) return false
        if (this.pszAuthenticationUri != other.pszAuthenticationUri) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszMDMServiceUri.hashCode()
        result = 31 * result + this.pszAuthenticationUri.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszMDMServiceUri: Pwstr = MutPtr(0L),
            pszAuthenticationUri: Pwstr = MutPtr(0L),
        ): ManagementServiceInfo =
            ManagementServiceInfo(
                pszMDMServiceUriCtorArg = pszMDMServiceUri,
                pszAuthenticationUriCtorArg = pszAuthenticationUri,
            )
    }
}
