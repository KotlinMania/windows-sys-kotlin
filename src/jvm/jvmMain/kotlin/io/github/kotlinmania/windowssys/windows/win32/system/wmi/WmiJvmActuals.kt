@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.wmi

private object WindowsWin32SystemWmiJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_wmi_MI_Application_InitializeV1(flags: Int, applicationid: Long, extendederror: Long, application: Long): Int
}

public actual fun MI_Application_InitializeV1(flags: UInt, applicationid: Long, extendederror: Long, application: Long): MI_Result =
    WindowsWin32SystemWmiJniBridge.windowssys_windows_win32_system_wmi_MI_Application_InitializeV1(flags.toInt(), applicationid, extendederror, application)
