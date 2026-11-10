@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.restore

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun sRRemoveRestorePoint(dwrpnum: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.restore.cinterop.windowssys_windows_win32_system_restore_sRRemoveRestorePoint(dwrpnum)

public actual fun sRSetRestorePointA(prestoreptspec: COpaquePointer?, psmgrstatus: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.restore.cinterop.windowssys_windows_win32_system_restore_sRSetRestorePointA(prestoreptspec?.value?.toCPointer<ByteVar>(), psmgrstatus?.value?.toCPointer<ByteVar>())

public actual fun sRSetRestorePointW(prestoreptspec: COpaquePointer?, psmgrstatus: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.restore.cinterop.windowssys_windows_win32_system_restore_sRSetRestorePointW(prestoreptspec?.value?.toCPointer<ByteVar>(), psmgrstatus?.value?.toCPointer<ByteVar>())
