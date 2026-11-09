@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.filehistory

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun FhServiceBlockBackup(pipe: FH_SERVICE_PIPE_HANDLE): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.filehistory.cinterop.windowssys_windows_win32_storage_filehistory_FhServiceBlockBackup(pipe.toCPointer<ByteVar>())

public actual fun FhServiceClosePipe(pipe: FH_SERVICE_PIPE_HANDLE): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.filehistory.cinterop.windowssys_windows_win32_storage_filehistory_FhServiceClosePipe(pipe.toCPointer<ByteVar>())

public actual fun FhServiceOpenPipe(startserviceifstopped: BOOL, pipe: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.filehistory.cinterop.windowssys_windows_win32_storage_filehistory_FhServiceOpenPipe(startserviceifstopped, pipe.toCPointer<ByteVar>())

public actual fun FhServiceReloadConfiguration(pipe: FH_SERVICE_PIPE_HANDLE): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.filehistory.cinterop.windowssys_windows_win32_storage_filehistory_FhServiceReloadConfiguration(pipe.toCPointer<ByteVar>())

public actual fun FhServiceStartBackup(pipe: FH_SERVICE_PIPE_HANDLE, lowpriorityio: BOOL): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.filehistory.cinterop.windowssys_windows_win32_storage_filehistory_FhServiceStartBackup(pipe.toCPointer<ByteVar>(), lowpriorityio)

public actual fun FhServiceStopBackup(pipe: FH_SERVICE_PIPE_HANDLE, stoptracking: BOOL): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.filehistory.cinterop.windowssys_windows_win32_storage_filehistory_FhServiceStopBackup(pipe.toCPointer<ByteVar>(), stoptracking)

public actual fun FhServiceUnblockBackup(pipe: FH_SERVICE_PIPE_HANDLE): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.filehistory.cinterop.windowssys_windows_win32_storage_filehistory_FhServiceUnblockBackup(pipe.toCPointer<ByteVar>())
