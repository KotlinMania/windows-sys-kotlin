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
    external fun windowssysWindowsWin32UiTextservicesDoMsCtfMonitor(dwflags: Int, heventforservicestop: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiTextservicesInitLocalMsCtfMonitor(dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiTextservicesUninitLocalMsCtfMonitor(): Int
}

public actual fun doMsCtfMonitor(dwflags: UInt, heventforservicestop: Handle): Bool =
    WindowsWin32UiTextservicesJniBridge.windowssysWindowsWin32UiTextservicesDoMsCtfMonitor(dwflags.toInt(), heventforservicestop.rawAddress)

public actual fun initLocalMsCtfMonitor(dwflags: UInt): Hresult =
    WindowsWin32UiTextservicesJniBridge.windowssysWindowsWin32UiTextservicesInitLocalMsCtfMonitor(dwflags.toInt())

public actual fun uninitLocalMsCtfMonitor(): Hresult =
    WindowsWin32UiTextservicesJniBridge.windowssysWindowsWin32UiTextservicesUninitLocalMsCtfMonitor()
