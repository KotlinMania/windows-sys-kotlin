package io.github.kotlinmania.windowssys.windows.win32.security.isolation

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.w

public val IsolatedAppLauncher: GUID = GUID.from_u128(U128(0xbc812430e75e4fd1uL, 0x96411f9f1e2d9a1fuL))

public val WDAG_CLIPBOARD_TAG: PCWSTR = w("CrossIsolatedEnvironmentContent")
