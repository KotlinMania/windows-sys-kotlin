package io.github.kotlinmania.windowssys.windows.win32.management.mobiledevicemanagementregistration

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PWSTR

public data class MANAGEMENT_REGISTRATION_INFO(
    public var fDeviceRegisteredWithManagement: BOOL = 0,
    public var dwDeviceRegistionKind: UInt = 0u,
    public var pszUPN: PWSTR = 0L,
    public var pszMDMServiceUri: PWSTR = 0L,
)

public data class MANAGEMENT_SERVICE_INFO(public var pszMDMServiceUri: PWSTR = 0L, public var pszAuthenticationUri: PWSTR = 0L)
