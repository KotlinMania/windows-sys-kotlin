package io.github.kotlinmania.windowssys.windows.win32.system.wmi

import io.github.kotlinmania.windowssys.Win32DynamicFfi

public fun MI_Application_InitializeV1(flags: UInt, applicationid: Long, extendederror: Long, application: Long): MI_Result {
    return Win32DynamicFfi.invoke("mi.dll", "MI_Application_InitializeV1", longArrayOf(flags.toLong(), applicationid, extendederror, application)).toInt()
}
