@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.filehistory

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.storage.filehistory.cinterop.windowssysWindowsWin32StorageFilehistoryFhServiceBlockBackup
import io.github.kotlinmania.windowssys.windows.win32.storage.filehistory.cinterop.windowssysWindowsWin32StorageFilehistoryFhServiceClosePipe
import io.github.kotlinmania.windowssys.windows.win32.storage.filehistory.cinterop.windowssysWindowsWin32StorageFilehistoryFhServiceOpenPipe
import io.github.kotlinmania.windowssys.windows.win32.storage.filehistory.cinterop.windowssysWindowsWin32StorageFilehistoryFhServiceReloadConfiguration
import io.github.kotlinmania.windowssys.windows.win32.storage.filehistory.cinterop.windowssysWindowsWin32StorageFilehistoryFhServiceStartBackup
import io.github.kotlinmania.windowssys.windows.win32.storage.filehistory.cinterop.windowssysWindowsWin32StorageFilehistoryFhServiceStopBackup
import io.github.kotlinmania.windowssys.windows.win32.storage.filehistory.cinterop.windowssysWindowsWin32StorageFilehistoryFhServiceUnblockBackup
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun fhServiceBlockBackup(pipe: FhServicePipeHandle): Hresult =
    windowssysWindowsWin32StorageFilehistoryFhServiceBlockBackup(pipe.rawAddress.toCPointer<ByteVar>())

public actual fun fhServiceClosePipe(pipe: FhServicePipeHandle): Hresult =
    windowssysWindowsWin32StorageFilehistoryFhServiceClosePipe(pipe.rawAddress.toCPointer<ByteVar>())

public actual fun fhServiceOpenPipe(startserviceifstopped: Bool, pipe: MutPtr<FhServicePipeHandle>): Hresult =
    windowssysWindowsWin32StorageFilehistoryFhServiceOpenPipe(startserviceifstopped, pipe.rawAddress.toCPointer<ByteVar>())

public actual fun fhServiceReloadConfiguration(pipe: FhServicePipeHandle): Hresult =
    windowssysWindowsWin32StorageFilehistoryFhServiceReloadConfiguration(pipe.rawAddress.toCPointer<ByteVar>())

public actual fun fhServiceStartBackup(pipe: FhServicePipeHandle, lowpriorityio: Bool): Hresult =
    windowssysWindowsWin32StorageFilehistoryFhServiceStartBackup(pipe.rawAddress.toCPointer<ByteVar>(), lowpriorityio)

public actual fun fhServiceStopBackup(pipe: FhServicePipeHandle, stoptracking: Bool): Hresult =
    windowssysWindowsWin32StorageFilehistoryFhServiceStopBackup(pipe.rawAddress.toCPointer<ByteVar>(), stoptracking)

public actual fun fhServiceUnblockBackup(pipe: FhServicePipeHandle): Hresult =
    windowssysWindowsWin32StorageFilehistoryFhServiceUnblockBackup(pipe.rawAddress.toCPointer<ByteVar>())
