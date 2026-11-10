@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.textservices

import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private object WindowsWin32UiTextservicesJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_ui_textservices_doMsCtfMonitor(dwflags: Int, heventforservicestop: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_textservices_initLocalMsCtfMonitor(dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_textservices_uninitLocalMsCtfMonitor(): Int
}

public actual fun doMsCtfMonitor(dwflags: UInt, heventforservicestop: Handle): Bool =
    WindowsWin32UiTextservicesJniBridge.windowssys_windows_win32_ui_textservices_doMsCtfMonitor(dwflags.toInt(), (heventforservicestop?.value ?: 0L))

public actual fun initLocalMsCtfMonitor(dwflags: UInt): Hresult =
    WindowsWin32UiTextservicesJniBridge.windowssys_windows_win32_ui_textservices_initLocalMsCtfMonitor(dwflags.toInt())

public actual fun uninitLocalMsCtfMonitor(): Hresult =
    WindowsWin32UiTextservicesJniBridge.windowssys_windows_win32_ui_textservices_uninitLocalMsCtfMonitor()
