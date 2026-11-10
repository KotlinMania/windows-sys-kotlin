package io.github.kotlinmania.windowssys.windows.win32.storage.operationrecorder

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool

public expect fun operationEnd(operationendparams: COpaquePointer?): Bool

public expect fun operationStart(operationstartparams: COpaquePointer?): Bool
