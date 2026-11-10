@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.mapi

import io.github.kotlinmania.windowssys.COpaquePointer

private object WindowsWin32SystemMapiJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_mapi_mAPIFreeBuffer(pv: Long): Int
}

public actual fun mAPIFreeBuffer(pv: COpaquePointer?): UInt =
    WindowsWin32SystemMapiJniBridge.windowssys_windows_win32_system_mapi_mAPIFreeBuffer((pv?.value ?: 0L)).toUInt()
