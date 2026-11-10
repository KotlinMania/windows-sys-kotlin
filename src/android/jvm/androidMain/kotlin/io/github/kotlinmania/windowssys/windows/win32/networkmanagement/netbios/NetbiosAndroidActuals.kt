@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netbios

import io.github.kotlinmania.windowssys.COpaquePointer

private object WindowsWin32NetworkmanagementNetbiosJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netbios_netbios(pncb: Long): Byte
}

public actual fun netbios(pncb: COpaquePointer?): UByte =
    WindowsWin32NetworkmanagementNetbiosJniBridge.windowssys_windows_win32_networkmanagement_netbios_netbios((pncb?.value ?: 0L)).toUByte()
