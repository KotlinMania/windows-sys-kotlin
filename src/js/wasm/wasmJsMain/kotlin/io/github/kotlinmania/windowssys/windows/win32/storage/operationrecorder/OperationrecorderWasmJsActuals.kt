@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.operationrecorder

import io.github.kotlinmania.windowssys.core.BOOL

public actual fun OperationEnd(operationendparams: Long): BOOL =
    0

public actual fun OperationStart(operationstartparams: Long): BOOL =
    0
