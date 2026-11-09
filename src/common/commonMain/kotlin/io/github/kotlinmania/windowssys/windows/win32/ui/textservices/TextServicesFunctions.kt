package io.github.kotlinmania.windowssys.windows.win32.ui.textservices

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public expect fun DoMsCtfMonitor(dwflags: UInt, heventforservicestop: HANDLE): BOOL

public expect fun InitLocalMsCtfMonitor(dwflags: UInt): HRESULT

public expect fun UninitLocalMsCtfMonitor(): HRESULT
