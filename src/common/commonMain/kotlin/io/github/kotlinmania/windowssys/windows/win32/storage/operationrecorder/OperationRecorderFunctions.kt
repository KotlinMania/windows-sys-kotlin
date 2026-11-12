package io.github.kotlinmania.windowssys.windows.win32.storage.operationrecorder

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.windowssys.core.Bool

public expect fun operationEnd(operationendparams: ConstPtr<OperationEndParameters>): Bool

public expect fun operationStart(operationstartparams: ConstPtr<OperationStartParameters>): Bool
