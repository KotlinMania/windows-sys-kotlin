@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.offlinefiles

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.storage.offlinefiles.cinterop.windowssysWindowsWin32StorageOfflinefilesOfflineFilesEnable
import io.github.kotlinmania.windowssys.windows.win32.storage.offlinefiles.cinterop.windowssysWindowsWin32StorageOfflinefilesOfflineFilesQueryStatus
import io.github.kotlinmania.windowssys.windows.win32.storage.offlinefiles.cinterop.windowssysWindowsWin32StorageOfflinefilesOfflineFilesQueryStatusEx
import io.github.kotlinmania.windowssys.windows.win32.storage.offlinefiles.cinterop.windowssysWindowsWin32StorageOfflinefilesOfflineFilesStart
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun offlineFilesEnable(benable: Bool, pbrebootrequired: MutPtr<Bool>): UInt =
    windowssysWindowsWin32StorageOfflinefilesOfflineFilesEnable(benable, pbrebootrequired.rawAddress.toCPointer<ByteVar>())

public actual fun offlineFilesQueryStatus(pbactive: MutPtr<Bool>, pbenabled: MutPtr<Bool>): UInt =
    windowssysWindowsWin32StorageOfflinefilesOfflineFilesQueryStatus(pbactive.rawAddress.toCPointer<ByteVar>(), pbenabled.rawAddress.toCPointer<ByteVar>())

public actual fun offlineFilesQueryStatusEx(pbactive: MutPtr<Bool>, pbenabled: MutPtr<Bool>, pbavailable: MutPtr<Bool>): UInt =
    windowssysWindowsWin32StorageOfflinefilesOfflineFilesQueryStatusEx(pbactive.rawAddress.toCPointer<ByteVar>(), pbenabled.rawAddress.toCPointer<ByteVar>(), pbavailable.rawAddress.toCPointer<ByteVar>())

public actual fun offlineFilesStart(): UInt =
    windowssysWindowsWin32StorageOfflinefilesOfflineFilesStart()
