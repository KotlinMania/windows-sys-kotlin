@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.restore

import io.github.kotlinmania.windowssys.core.BOOL

private object WindowsWin32SystemRestoreJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_restore_SRRemoveRestorePoint(dwrpnum: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_restore_SRSetRestorePointA(prestoreptspec: Long, psmgrstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_restore_SRSetRestorePointW(prestoreptspec: Long, psmgrstatus: Long): Int
}

public actual fun SRRemoveRestorePoint(dwrpnum: UInt): UInt =
    WindowsWin32SystemRestoreJniBridge.windowssys_windows_win32_system_restore_SRRemoveRestorePoint(dwrpnum.toInt()).toUInt()

public actual fun SRSetRestorePointA(prestoreptspec: Long, psmgrstatus: Long): BOOL =
    WindowsWin32SystemRestoreJniBridge.windowssys_windows_win32_system_restore_SRSetRestorePointA(prestoreptspec, psmgrstatus)

public actual fun SRSetRestorePointW(prestoreptspec: Long, psmgrstatus: Long): BOOL =
    WindowsWin32SystemRestoreJniBridge.windowssys_windows_win32_system_restore_SRSetRestorePointW(prestoreptspec, psmgrstatus)
