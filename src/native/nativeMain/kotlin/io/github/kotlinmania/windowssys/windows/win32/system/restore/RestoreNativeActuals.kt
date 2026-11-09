@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.restore

import io.github.kotlinmania.windowssys.core.BOOL
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun SRRemoveRestorePoint(dwrpnum: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.restore.cinterop.windowssys_windows_win32_system_restore_SRRemoveRestorePoint(dwrpnum)

public actual fun SRSetRestorePointA(prestoreptspec: Long, psmgrstatus: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.restore.cinterop.windowssys_windows_win32_system_restore_SRSetRestorePointA(prestoreptspec.toCPointer<ByteVar>(), psmgrstatus.toCPointer<ByteVar>())

public actual fun SRSetRestorePointW(prestoreptspec: Long, psmgrstatus: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.restore.cinterop.windowssys_windows_win32_system_restore_SRSetRestorePointW(prestoreptspec.toCPointer<ByteVar>(), psmgrstatus.toCPointer<ByteVar>())
