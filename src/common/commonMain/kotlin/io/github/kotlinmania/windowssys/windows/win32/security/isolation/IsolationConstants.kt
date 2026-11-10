package io.github.kotlinmania.windowssys.windows.win32.security.isolation

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.w

public val ISOLATED_APP_LAUNCHER: Guid = Guid.fromU128(U128(0xbc812430e75e4fd1uL, 0x96411f9f1e2d9a1fuL))

public val WDAG_CLIPBOARD_TAG: Pcwstr = w("CrossIsolatedEnvironmentContent")
