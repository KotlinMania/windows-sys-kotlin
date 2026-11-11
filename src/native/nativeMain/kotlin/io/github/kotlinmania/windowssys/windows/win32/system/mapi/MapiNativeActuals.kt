@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.mapi

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.win32.system.mapi.cinterop.windowssys_windows_win32_system_mapi_mAPIFreeBuffer
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun mAPIFreeBuffer(pv: COpaquePointer?): UInt =
    windowssys_windows_win32_system_mapi_mAPIFreeBuffer(pv?.value?.toCPointer<ByteVar>())
