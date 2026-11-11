@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.filehistory

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.storage.filehistory.cinterop.windowssys_windows_win32_storage_filehistory_fhServiceBlockBackup
import io.github.kotlinmania.windowssys.windows.win32.storage.filehistory.cinterop.windowssys_windows_win32_storage_filehistory_fhServiceClosePipe
import io.github.kotlinmania.windowssys.windows.win32.storage.filehistory.cinterop.windowssys_windows_win32_storage_filehistory_fhServiceOpenPipe
import io.github.kotlinmania.windowssys.windows.win32.storage.filehistory.cinterop.windowssys_windows_win32_storage_filehistory_fhServiceReloadConfiguration
import io.github.kotlinmania.windowssys.windows.win32.storage.filehistory.cinterop.windowssys_windows_win32_storage_filehistory_fhServiceStartBackup
import io.github.kotlinmania.windowssys.windows.win32.storage.filehistory.cinterop.windowssys_windows_win32_storage_filehistory_fhServiceStopBackup
import io.github.kotlinmania.windowssys.windows.win32.storage.filehistory.cinterop.windowssys_windows_win32_storage_filehistory_fhServiceUnblockBackup
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun fhServiceBlockBackup(pipe: FhServicePipeHandle): Hresult =
    windowssys_windows_win32_storage_filehistory_fhServiceBlockBackup(pipe?.value?.toCPointer<ByteVar>())

public actual fun fhServiceClosePipe(pipe: FhServicePipeHandle): Hresult =
    windowssys_windows_win32_storage_filehistory_fhServiceClosePipe(pipe?.value?.toCPointer<ByteVar>())

public actual fun fhServiceOpenPipe(startserviceifstopped: Bool, pipe: COpaquePointer?): Hresult =
    windowssys_windows_win32_storage_filehistory_fhServiceOpenPipe(startserviceifstopped, pipe?.value?.toCPointer<ByteVar>())

public actual fun fhServiceReloadConfiguration(pipe: FhServicePipeHandle): Hresult =
    windowssys_windows_win32_storage_filehistory_fhServiceReloadConfiguration(pipe?.value?.toCPointer<ByteVar>())

public actual fun fhServiceStartBackup(pipe: FhServicePipeHandle, lowpriorityio: Bool): Hresult =
    windowssys_windows_win32_storage_filehistory_fhServiceStartBackup(pipe?.value?.toCPointer<ByteVar>(), lowpriorityio)

public actual fun fhServiceStopBackup(pipe: FhServicePipeHandle, stoptracking: Bool): Hresult =
    windowssys_windows_win32_storage_filehistory_fhServiceStopBackup(pipe?.value?.toCPointer<ByteVar>(), stoptracking)

public actual fun fhServiceUnblockBackup(pipe: FhServicePipeHandle): Hresult =
    windowssys_windows_win32_storage_filehistory_fhServiceUnblockBackup(pipe?.value?.toCPointer<ByteVar>())
