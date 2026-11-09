@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.filehistory

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT

public actual fun FhServiceBlockBackup(pipe: FH_SERVICE_PIPE_HANDLE): HRESULT =
    0

public actual fun FhServiceClosePipe(pipe: FH_SERVICE_PIPE_HANDLE): HRESULT =
    0

public actual fun FhServiceOpenPipe(startserviceifstopped: BOOL, pipe: Long): HRESULT =
    0

public actual fun FhServiceReloadConfiguration(pipe: FH_SERVICE_PIPE_HANDLE): HRESULT =
    0

public actual fun FhServiceStartBackup(pipe: FH_SERVICE_PIPE_HANDLE, lowpriorityio: BOOL): HRESULT =
    0

public actual fun FhServiceStopBackup(pipe: FH_SERVICE_PIPE_HANDLE, stoptracking: BOOL): HRESULT =
    0

public actual fun FhServiceUnblockBackup(pipe: FH_SERVICE_PIPE_HANDLE): HRESULT =
    0
