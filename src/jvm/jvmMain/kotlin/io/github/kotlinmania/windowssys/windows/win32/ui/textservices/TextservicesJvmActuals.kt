@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.textservices

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

private object WindowsWin32UiTextservicesJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_ui_textservices_DoMsCtfMonitor(dwflags: Int, heventforservicestop: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_textservices_InitLocalMsCtfMonitor(dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_textservices_UninitLocalMsCtfMonitor(): Int
}

public actual fun DoMsCtfMonitor(dwflags: UInt, heventforservicestop: HANDLE): BOOL =
    WindowsWin32UiTextservicesJniBridge.windowssys_windows_win32_ui_textservices_DoMsCtfMonitor(dwflags.toInt(), heventforservicestop)

public actual fun InitLocalMsCtfMonitor(dwflags: UInt): HRESULT =
    WindowsWin32UiTextservicesJniBridge.windowssys_windows_win32_ui_textservices_InitLocalMsCtfMonitor(dwflags.toInt())

public actual fun UninitLocalMsCtfMonitor(): HRESULT =
    WindowsWin32UiTextservicesJniBridge.windowssys_windows_win32_ui_textservices_UninitLocalMsCtfMonitor()
