@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.offlinefiles

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun offlineFilesEnable(benable: Bool, pbrebootrequired: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.offlinefiles.cinterop.windowssys_windows_win32_storage_offlinefiles_offlineFilesEnable(benable, pbrebootrequired?.value?.toCPointer<ByteVar>())

public actual fun offlineFilesQueryStatus(pbactive: COpaquePointer?, pbenabled: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.offlinefiles.cinterop.windowssys_windows_win32_storage_offlinefiles_offlineFilesQueryStatus(pbactive?.value?.toCPointer<ByteVar>(), pbenabled?.value?.toCPointer<ByteVar>())

public actual fun offlineFilesQueryStatusEx(pbactive: COpaquePointer?, pbenabled: COpaquePointer?, pbavailable: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.offlinefiles.cinterop.windowssys_windows_win32_storage_offlinefiles_offlineFilesQueryStatusEx(pbactive?.value?.toCPointer<ByteVar>(), pbenabled?.value?.toCPointer<ByteVar>(), pbavailable?.value?.toCPointer<ByteVar>())

public actual fun offlineFilesStart(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.offlinefiles.cinterop.windowssys_windows_win32_storage_offlinefiles_offlineFilesStart()
