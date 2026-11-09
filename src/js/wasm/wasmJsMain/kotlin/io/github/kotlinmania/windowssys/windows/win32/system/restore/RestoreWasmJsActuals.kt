@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.restore

import io.github.kotlinmania.windowssys.core.BOOL

public actual fun SRRemoveRestorePoint(dwrpnum: UInt): UInt =
    0u

public actual fun SRSetRestorePointA(prestoreptspec: Long, psmgrstatus: Long): BOOL =
    0

public actual fun SRSetRestorePointW(prestoreptspec: Long, psmgrstatus: Long): BOOL =
    0
