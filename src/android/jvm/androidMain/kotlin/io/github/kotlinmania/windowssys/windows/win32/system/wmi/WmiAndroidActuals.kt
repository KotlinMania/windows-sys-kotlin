@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.wmi

import io.github.kotlinmania.windowssys.COpaquePointer

private object WindowsWin32SystemWmiJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_wmi_miApplicationInitializeV1(flags: Int, applicationid: Long, extendederror: Long, application: Long): Int
}

public actual fun miApplicationInitializeV1(flags: UInt, applicationid: COpaquePointer?, extendederror: COpaquePointer?, application: COpaquePointer?): MiResult =
    WindowsWin32SystemWmiJniBridge.windowssys_windows_win32_system_wmi_miApplicationInitializeV1(flags.toInt(), (applicationid?.value ?: 0L), (extendederror?.value ?: 0L), (application?.value ?: 0L))
