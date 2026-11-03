package io.github.kotlinmania.windowssys.windows.win32.system.time

import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.w

public val TIME_ZONE_ID_INVALID: UInt = 4294967295u

public val TSF_Authenticated: UInt = 2u

public val TSF_Hardware: UInt = 1u

public val TSF_IPv6: UInt = 4u

public val TSF_SignatureAuthenticated: UInt = 8u

public val wszW32TimeRegKeyPolicyTimeProviders: PCWSTR = w("Software\\Policies\\Microsoft\\W32Time\\TimeProviders")

public val wszW32TimeRegKeyTimeProviders: PCWSTR = w("System\\CurrentControlSet\\Services\\W32Time\\TimeProviders")

public val wszW32TimeRegValueDllName: PCWSTR = w("DllName")

public val wszW32TimeRegValueEnabled: PCWSTR = w("Enabled")

public val wszW32TimeRegValueInputProvider: PCWSTR = w("InputProvider")

public val wszW32TimeRegValueMetaDataProvider: PCWSTR = w("MetaDataProvider")
