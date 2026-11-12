@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netbios

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netbios.cinterop.windowssysWindowsWin32NetworkmanagementNetbiosNetbios
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun netbios(pncb: MutPtr): UByte =
    windowssysWindowsWin32NetworkmanagementNetbiosNetbios(pncb.rawAddress.toCPointer<ByteVar>())
