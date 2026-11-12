@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netbios

import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object WindowsWin32NetworkmanagementNetbiosJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetbiosNetbios(pncb: Long): Byte
}

public actual fun netbios(pncb: MutPtr<Ncb>): UByte =
    WindowsWin32NetworkmanagementNetbiosJniBridge.windowssysWindowsWin32NetworkmanagementNetbiosNetbios(pncb.rawAddress).toUByte()
