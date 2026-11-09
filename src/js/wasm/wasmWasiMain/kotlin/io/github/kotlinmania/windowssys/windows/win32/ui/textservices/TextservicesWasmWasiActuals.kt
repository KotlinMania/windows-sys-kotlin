@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.textservices

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public actual fun DoMsCtfMonitor(dwflags: UInt, heventforservicestop: HANDLE): BOOL =
    0

public actual fun InitLocalMsCtfMonitor(dwflags: UInt): HRESULT =
    0

public actual fun UninitLocalMsCtfMonitor(): HRESULT =
    0
