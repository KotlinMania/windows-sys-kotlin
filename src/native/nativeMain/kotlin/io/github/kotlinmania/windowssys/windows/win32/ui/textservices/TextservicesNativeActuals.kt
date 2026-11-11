@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.textservices

import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.ui.textservices.cinterop.windowssys_windows_win32_ui_textservices_doMsCtfMonitor
import io.github.kotlinmania.windowssys.windows.win32.ui.textservices.cinterop.windowssys_windows_win32_ui_textservices_initLocalMsCtfMonitor
import io.github.kotlinmania.windowssys.windows.win32.ui.textservices.cinterop.windowssys_windows_win32_ui_textservices_uninitLocalMsCtfMonitor
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun doMsCtfMonitor(dwflags: UInt, heventforservicestop: Handle): Bool =
    windowssys_windows_win32_ui_textservices_doMsCtfMonitor(dwflags, heventforservicestop?.value?.toCPointer<ByteVar>())

public actual fun initLocalMsCtfMonitor(dwflags: UInt): Hresult =
    windowssys_windows_win32_ui_textservices_initLocalMsCtfMonitor(dwflags)

public actual fun uninitLocalMsCtfMonitor(): Hresult =
    windowssys_windows_win32_ui_textservices_uninitLocalMsCtfMonitor()
