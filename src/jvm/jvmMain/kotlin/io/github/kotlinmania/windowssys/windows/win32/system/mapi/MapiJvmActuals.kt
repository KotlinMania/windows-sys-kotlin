@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.mapi

private object WindowsWin32SystemMapiJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_mapi_MAPIFreeBuffer(pv: Long): Int
}

public actual fun MAPIFreeBuffer(pv: Long): UInt =
    WindowsWin32SystemMapiJniBridge.windowssys_windows_win32_system_mapi_MAPIFreeBuffer(pv).toUInt()
