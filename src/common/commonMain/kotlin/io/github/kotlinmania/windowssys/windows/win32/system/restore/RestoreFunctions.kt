package io.github.kotlinmania.windowssys.windows.win32.system.restore

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool

public expect fun sRRemoveRestorePoint(dwrpnum: UInt): UInt

public expect fun sRSetRestorePointA(prestoreptspec: COpaquePointer?, psmgrstatus: COpaquePointer?): Bool

public expect fun sRSetRestorePointW(prestoreptspec: COpaquePointer?, psmgrstatus: COpaquePointer?): Bool
