@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.textservices

import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun doMsCtfMonitor(dwflags: UInt, heventforservicestop: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.textservices.cinterop.windowssys_windows_win32_ui_textservices_doMsCtfMonitor(dwflags, heventforservicestop?.value?.toCPointer<ByteVar>())

public actual fun initLocalMsCtfMonitor(dwflags: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.textservices.cinterop.windowssys_windows_win32_ui_textservices_initLocalMsCtfMonitor(dwflags)

public actual fun uninitLocalMsCtfMonitor(): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.textservices.cinterop.windowssys_windows_win32_ui_textservices_uninitLocalMsCtfMonitor()
