package io.github.kotlinmania.windowssys.windows.win32.storage.operationrecorder

import io.github.kotlinmania.windowssys.core.BOOL

public expect fun OperationEnd(operationendparams: Long): BOOL

public expect fun OperationStart(operationstartparams: Long): BOOL
