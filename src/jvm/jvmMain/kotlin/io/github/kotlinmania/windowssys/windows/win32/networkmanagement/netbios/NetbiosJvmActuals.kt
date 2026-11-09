@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netbios

private object WindowsWin32NetworkmanagementNetbiosJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netbios_Netbios(pncb: Long): Byte
}

public actual fun Netbios(pncb: Long): UByte =
    WindowsWin32NetworkmanagementNetbiosJniBridge.windowssys_windows_win32_networkmanagement_netbios_Netbios(pncb).toUByte()
