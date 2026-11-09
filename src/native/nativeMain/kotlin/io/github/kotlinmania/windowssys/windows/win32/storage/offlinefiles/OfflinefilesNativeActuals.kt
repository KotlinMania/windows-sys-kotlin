@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.offlinefiles

import io.github.kotlinmania.windowssys.core.BOOL
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun OfflineFilesEnable(benable: BOOL, pbrebootrequired: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.offlinefiles.cinterop.windowssys_windows_win32_storage_offlinefiles_OfflineFilesEnable(benable, pbrebootrequired.toCPointer<ByteVar>())

public actual fun OfflineFilesQueryStatus(pbactive: Long, pbenabled: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.offlinefiles.cinterop.windowssys_windows_win32_storage_offlinefiles_OfflineFilesQueryStatus(pbactive.toCPointer<ByteVar>(), pbenabled.toCPointer<ByteVar>())

public actual fun OfflineFilesQueryStatusEx(pbactive: Long, pbenabled: Long, pbavailable: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.offlinefiles.cinterop.windowssys_windows_win32_storage_offlinefiles_OfflineFilesQueryStatusEx(pbactive.toCPointer<ByteVar>(), pbenabled.toCPointer<ByteVar>(), pbavailable.toCPointer<ByteVar>())

public actual fun OfflineFilesStart(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.offlinefiles.cinterop.windowssys_windows_win32_storage_offlinefiles_OfflineFilesStart()
