package io.github.kotlinmania.windowssys.windows.win32.storage.filehistory

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult

public expect fun fhServiceBlockBackup(pipe: FhServicePipeHandle): Hresult

public expect fun fhServiceClosePipe(pipe: FhServicePipeHandle): Hresult

public expect fun fhServiceOpenPipe(startserviceifstopped: Bool, pipe: MutPtr): Hresult

public expect fun fhServiceReloadConfiguration(pipe: FhServicePipeHandle): Hresult

public expect fun fhServiceStartBackup(pipe: FhServicePipeHandle, lowpriorityio: Bool): Hresult

public expect fun fhServiceStopBackup(pipe: FhServicePipeHandle, stoptracking: Bool): Hresult

public expect fun fhServiceUnblockBackup(pipe: FhServicePipeHandle): Hresult
