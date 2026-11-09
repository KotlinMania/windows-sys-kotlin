@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netbios

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun Netbios(pncb: Long): UByte =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netbios.cinterop.windowssys_windows_win32_networkmanagement_netbios_Netbios(pncb.toCPointer<ByteVar>())
