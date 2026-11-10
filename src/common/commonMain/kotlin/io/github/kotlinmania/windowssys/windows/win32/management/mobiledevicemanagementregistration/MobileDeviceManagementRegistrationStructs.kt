package io.github.kotlinmania.windowssys.windows.win32.management.mobiledevicemanagementregistration

import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pwstr

public data class ManagementRegistrationInfo(
    public var fDeviceRegisteredWithManagement: Bool = 0,
    public var dwDeviceRegistionKind: UInt = 0u,
    public var pszUPN: Pwstr = null,
    public var pszMDMServiceUri: Pwstr = null,
)

public data class ManagementServiceInfo(public var pszMDMServiceUri: Pwstr = null, public var pszAuthenticationUri: Pwstr = null)
