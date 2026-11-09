@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.textservices

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun DoMsCtfMonitor(dwflags: UInt, heventforservicestop: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.textservices.cinterop.windowssys_windows_win32_ui_textservices_DoMsCtfMonitor(dwflags, heventforservicestop.toCPointer<ByteVar>())

public actual fun InitLocalMsCtfMonitor(dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.textservices.cinterop.windowssys_windows_win32_ui_textservices_InitLocalMsCtfMonitor(dwflags)

public actual fun UninitLocalMsCtfMonitor(): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.textservices.cinterop.windowssys_windows_win32_ui_textservices_UninitLocalMsCtfMonitor()
