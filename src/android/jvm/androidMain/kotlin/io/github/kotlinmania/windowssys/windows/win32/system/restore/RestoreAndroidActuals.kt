@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.restore

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool

private object WindowsWin32SystemRestoreJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32SystemRestoreSRRemoveRestorePoint(dwrpnum: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRestoreSRSetRestorePointA(prestoreptspec: Long, psmgrstatus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRestoreSRSetRestorePointW(prestoreptspec: Long, psmgrstatus: Long): Int
}

public actual fun sRRemoveRestorePoint(dwrpnum: UInt): UInt =
    WindowsWin32SystemRestoreJniBridge.windowssysWindowsWin32SystemRestoreSRRemoveRestorePoint(dwrpnum.toInt()).toUInt()

public actual fun sRSetRestorePointA(prestoreptspec: ConstPtr, psmgrstatus: MutPtr): Bool =
    WindowsWin32SystemRestoreJniBridge.windowssysWindowsWin32SystemRestoreSRSetRestorePointA(prestoreptspec.rawAddress, psmgrstatus.rawAddress)

public actual fun sRSetRestorePointW(prestoreptspec: ConstPtr, psmgrstatus: MutPtr): Bool =
    WindowsWin32SystemRestoreJniBridge.windowssysWindowsWin32SystemRestoreSRSetRestorePointW(prestoreptspec.rawAddress, psmgrstatus.rawAddress)
