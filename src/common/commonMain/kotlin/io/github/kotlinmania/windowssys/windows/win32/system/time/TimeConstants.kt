package io.github.kotlinmania.windowssys.windows.win32.system.time

import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.w

public val TIME_ZONE_ID_INVALID: UInt = 4294967295u

public val TSF_AUTHENTICATED: UInt = 2u

public val TSF_HARDWARE: UInt = 1u

public val TSF_I_PV6: UInt = 4u

public val TSF_SIGNATURE_AUTHENTICATED: UInt = 8u

public val WSZ_W32TIME_REG_KEY_POLICY_TIME_PROVIDERS: Pcwstr = w("Software\\Policies\\Microsoft\\W32Time\\TimeProviders")

public val WSZ_W32TIME_REG_KEY_TIME_PROVIDERS: Pcwstr = w("System\\CurrentControlSet\\Services\\W32Time\\TimeProviders")

public val WSZ_W32TIME_REG_VALUE_DLL_NAME: Pcwstr = w("DllName")

public val WSZ_W32TIME_REG_VALUE_ENABLED: Pcwstr = w("Enabled")

public val WSZ_W32TIME_REG_VALUE_INPUT_PROVIDER: Pcwstr = w("InputProvider")

public val WSZ_W32TIME_REG_VALUE_META_DATA_PROVIDER: Pcwstr = w("MetaDataProvider")
