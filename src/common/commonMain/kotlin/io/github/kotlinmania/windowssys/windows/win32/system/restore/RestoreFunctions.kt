package io.github.kotlinmania.windowssys.windows.win32.system.restore

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL

public fun SRRemoveRestorePoint(dwrpnum: UInt): UInt {
    return Win32DynamicFfi.invoke("srclient.dll", "SRRemoveRestorePoint", longArrayOf(dwrpnum.toLong())).toUInt()
}

public fun SRSetRestorePointA(prestoreptspec: Long, psmgrstatus: Long): BOOL {
    return Win32DynamicFfi.invoke("sfc.dll", "SRSetRestorePointA", longArrayOf(prestoreptspec, psmgrstatus)).toInt()
}

public fun SRSetRestorePointW(prestoreptspec: Long, psmgrstatus: Long): BOOL {
    return Win32DynamicFfi.invoke("sfc.dll", "SRSetRestorePointW", longArrayOf(prestoreptspec, psmgrstatus)).toInt()
}
