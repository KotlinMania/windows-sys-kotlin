package io.github.kotlinmania.windowssys.windows.win32.storage.operationrecorder

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL

public fun OperationEnd(operationendparams: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "OperationEnd", longArrayOf(operationendparams)).toInt()
}

public fun OperationStart(operationstartparams: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "OperationStart", longArrayOf(operationstartparams)).toInt()
}
