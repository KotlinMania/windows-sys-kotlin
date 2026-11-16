package io.github.kotlinmania.windowssys.windows.win32.ui.textservices

import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public expect fun doMsCtfMonitor(dwflags: UInt, heventforservicestop: Handle): Bool

public expect fun initLocalMsCtfMonitor(dwflags: UInt): Hresult

public expect fun uninitLocalMsCtfMonitor(): Hresult
