package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netbios

import io.github.kotlinmania.windowssys.Win32DynamicFfi

public fun Netbios(pncb: Long): UByte {
    return Win32DynamicFfi.invoke("netapi32.dll", "Netbios", longArrayOf(pncb)).toUByte()
}
