package io.github.kotlinmania.windowssys.windows.win32.storage.filehistory

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT

public fun FhServiceBlockBackup(pipe: FH_SERVICE_PIPE_HANDLE): HRESULT {
    return Win32DynamicFfi.invoke("fhsvcctl.dll", "FhServiceBlockBackup", longArrayOf(pipe)).toInt()
}

public fun FhServiceClosePipe(pipe: FH_SERVICE_PIPE_HANDLE): HRESULT {
    return Win32DynamicFfi.invoke("fhsvcctl.dll", "FhServiceClosePipe", longArrayOf(pipe)).toInt()
}

public fun FhServiceOpenPipe(startserviceifstopped: BOOL, pipe: Long): HRESULT {
    return Win32DynamicFfi.invoke("fhsvcctl.dll", "FhServiceOpenPipe", longArrayOf(startserviceifstopped.toLong(), pipe)).toInt()
}

public fun FhServiceReloadConfiguration(pipe: FH_SERVICE_PIPE_HANDLE): HRESULT {
    return Win32DynamicFfi.invoke("fhsvcctl.dll", "FhServiceReloadConfiguration", longArrayOf(pipe)).toInt()
}

public fun FhServiceStartBackup(pipe: FH_SERVICE_PIPE_HANDLE, lowpriorityio: BOOL): HRESULT {
    return Win32DynamicFfi.invoke("fhsvcctl.dll", "FhServiceStartBackup", longArrayOf(pipe, lowpriorityio.toLong())).toInt()
}

public fun FhServiceStopBackup(pipe: FH_SERVICE_PIPE_HANDLE, stoptracking: BOOL): HRESULT {
    return Win32DynamicFfi.invoke("fhsvcctl.dll", "FhServiceStopBackup", longArrayOf(pipe, stoptracking.toLong())).toInt()
}

public fun FhServiceUnblockBackup(pipe: FH_SERVICE_PIPE_HANDLE): HRESULT {
    return Win32DynamicFfi.invoke("fhsvcctl.dll", "FhServiceUnblockBackup", longArrayOf(pipe)).toInt()
}
