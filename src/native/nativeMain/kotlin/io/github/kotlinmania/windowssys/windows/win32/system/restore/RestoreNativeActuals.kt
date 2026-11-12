@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.restore

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.system.restore.cinterop.windowssysWindowsWin32SystemRestoreSRRemoveRestorePoint
import io.github.kotlinmania.windowssys.windows.win32.system.restore.cinterop.windowssysWindowsWin32SystemRestoreSRSetRestorePointA
import io.github.kotlinmania.windowssys.windows.win32.system.restore.cinterop.windowssysWindowsWin32SystemRestoreSRSetRestorePointW
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun sRRemoveRestorePoint(dwrpnum: UInt): UInt =
    windowssysWindowsWin32SystemRestoreSRRemoveRestorePoint(dwrpnum)

public actual fun sRSetRestorePointA(prestoreptspec: ConstPtr<Restorepointinfoa>, psmgrstatus: MutPtr<Statemgrstatus>): Bool =
    windowssysWindowsWin32SystemRestoreSRSetRestorePointA(prestoreptspec.rawAddress.toCPointer<ByteVar>(), psmgrstatus.rawAddress.toCPointer<ByteVar>())

public actual fun sRSetRestorePointW(prestoreptspec: ConstPtr<Restorepointinfow>, psmgrstatus: MutPtr<Statemgrstatus>): Bool =
    windowssysWindowsWin32SystemRestoreSRSetRestorePointW(prestoreptspec.rawAddress.toCPointer<ByteVar>(), psmgrstatus.rawAddress.toCPointer<ByteVar>())
