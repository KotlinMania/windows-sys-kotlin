@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.mapi

import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object WindowsWin32SystemMapiJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32SystemMapiMAPIFreeBuffer(pv: Long): Int
}

public actual fun mAPIFreeBuffer(pv: MutPtr): UInt =
    WindowsWin32SystemMapiJniBridge.windowssysWindowsWin32SystemMapiMAPIFreeBuffer(pv.rawAddress).toUInt()
