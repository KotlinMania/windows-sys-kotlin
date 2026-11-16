package io.github.kotlinmania.windowssys.windows.win32.system.restore

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool

public expect fun sRRemoveRestorePoint(dwrpnum: UInt): UInt

public expect fun sRSetRestorePointA(prestoreptspec: ConstPtr, psmgrstatus: MutPtr): Bool

public expect fun sRSetRestorePointW(prestoreptspec: ConstPtr, psmgrstatus: MutPtr): Bool
