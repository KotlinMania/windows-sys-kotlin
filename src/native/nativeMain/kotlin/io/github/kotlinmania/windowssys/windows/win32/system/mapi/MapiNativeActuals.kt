@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.mapi

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun MAPIFreeBuffer(pv: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.mapi.cinterop.windowssys_windows_win32_system_mapi_MAPIFreeBuffer(pv.toCPointer<ByteVar>())
