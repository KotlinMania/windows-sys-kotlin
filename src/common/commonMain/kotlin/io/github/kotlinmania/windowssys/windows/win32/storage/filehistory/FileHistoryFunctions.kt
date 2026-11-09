package io.github.kotlinmania.windowssys.windows.win32.storage.filehistory

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT

public expect fun FhServiceBlockBackup(pipe: FH_SERVICE_PIPE_HANDLE): HRESULT

public expect fun FhServiceClosePipe(pipe: FH_SERVICE_PIPE_HANDLE): HRESULT

public expect fun FhServiceOpenPipe(startserviceifstopped: BOOL, pipe: Long): HRESULT

public expect fun FhServiceReloadConfiguration(pipe: FH_SERVICE_PIPE_HANDLE): HRESULT

public expect fun FhServiceStartBackup(pipe: FH_SERVICE_PIPE_HANDLE, lowpriorityio: BOOL): HRESULT

public expect fun FhServiceStopBackup(pipe: FH_SERVICE_PIPE_HANDLE, stoptracking: BOOL): HRESULT

public expect fun FhServiceUnblockBackup(pipe: FH_SERVICE_PIPE_HANDLE): HRESULT
