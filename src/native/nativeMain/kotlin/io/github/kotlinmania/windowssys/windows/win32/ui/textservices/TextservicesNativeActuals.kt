@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.textservices

import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.ui.textservices.cinterop.windowssysWindowsWin32UiTextservicesDoMsCtfMonitor
import io.github.kotlinmania.windowssys.windows.win32.ui.textservices.cinterop.windowssysWindowsWin32UiTextservicesInitLocalMsCtfMonitor
import io.github.kotlinmania.windowssys.windows.win32.ui.textservices.cinterop.windowssysWindowsWin32UiTextservicesUninitLocalMsCtfMonitor
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun doMsCtfMonitor(dwflags: UInt, heventforservicestop: Handle): Bool =
    windowssysWindowsWin32UiTextservicesDoMsCtfMonitor(dwflags, heventforservicestop.rawAddress.toCPointer<ByteVar>())

public actual fun initLocalMsCtfMonitor(dwflags: UInt): Hresult =
    windowssysWindowsWin32UiTextservicesInitLocalMsCtfMonitor(dwflags)

public actual fun uninitLocalMsCtfMonitor(): Hresult =
    windowssysWindowsWin32UiTextservicesUninitLocalMsCtfMonitor()
