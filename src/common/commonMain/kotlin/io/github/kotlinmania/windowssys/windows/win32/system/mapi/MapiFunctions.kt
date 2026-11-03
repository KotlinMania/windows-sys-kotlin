package io.github.kotlinmania.windowssys.windows.win32.system.mapi

import io.github.kotlinmania.windowssys.Win32DynamicFfi

public fun MAPIFreeBuffer(pv: Long): UInt {
    return Win32DynamicFfi.invoke("mapi32.dll", "MAPIFreeBuffer", longArrayOf(pv)).toUInt()
}
