@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.restore

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool

private object WindowsWin32SystemRestoreJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_restore_sRRemoveRestorePoint(dwrpnum: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_restore_sRSetRestorePointA(prestoreptspec: Long, psmgrstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_restore_sRSetRestorePointW(prestoreptspec: Long, psmgrstatus: Long): Int
}

public actual fun sRRemoveRestorePoint(dwrpnum: UInt): UInt =
    WindowsWin32SystemRestoreJniBridge.windowssys_windows_win32_system_restore_sRRemoveRestorePoint(dwrpnum.toInt()).toUInt()

public actual fun sRSetRestorePointA(prestoreptspec: COpaquePointer?, psmgrstatus: COpaquePointer?): Bool =
    WindowsWin32SystemRestoreJniBridge.windowssys_windows_win32_system_restore_sRSetRestorePointA((prestoreptspec?.value ?: 0L), (psmgrstatus?.value ?: 0L))

public actual fun sRSetRestorePointW(prestoreptspec: COpaquePointer?, psmgrstatus: COpaquePointer?): Bool =
    WindowsWin32SystemRestoreJniBridge.windowssys_windows_win32_system_restore_sRSetRestorePointW((prestoreptspec?.value ?: 0L), (psmgrstatus?.value ?: 0L))
