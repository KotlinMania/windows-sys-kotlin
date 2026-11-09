package io.github.kotlinmania.windowssys.windows.win32.system.restore

import io.github.kotlinmania.windowssys.core.BOOL

public expect fun SRRemoveRestorePoint(dwrpnum: UInt): UInt

public expect fun SRSetRestorePointA(prestoreptspec: Long, psmgrstatus: Long): BOOL

public expect fun SRSetRestorePointW(prestoreptspec: Long, psmgrstatus: Long): BOOL
