@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netbios

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netbios.cinterop.windowssys_windows_win32_networkmanagement_netbios_netbios
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun netbios(pncb: COpaquePointer?): UByte =
    windowssys_windows_win32_networkmanagement_netbios_netbios(pncb?.value?.toCPointer<ByteVar>())
