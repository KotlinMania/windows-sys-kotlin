@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.mapi

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.win32.system.mapi.cinterop.windowssysWindowsWin32SystemMapiMAPIFreeBuffer
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun mAPIFreeBuffer(pv: MutPtr): UInt =
    windowssysWindowsWin32SystemMapiMAPIFreeBuffer(pv.rawAddress.toCPointer<ByteVar>())
