@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.kernel

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.cinterop.windowssysWindowsWin32SystemKernelRtlFirstEntrySList
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.cinterop.windowssysWindowsWin32SystemKernelRtlInitializeSListHead
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.cinterop.windowssysWindowsWin32SystemKernelRtlInterlockedFlushSList
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.cinterop.windowssysWindowsWin32SystemKernelRtlInterlockedPopEntrySList
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.cinterop.windowssysWindowsWin32SystemKernelRtlInterlockedPushEntrySList
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.cinterop.windowssysWindowsWin32SystemKernelRtlInterlockedPushListSListEx
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.cinterop.windowssysWindowsWin32SystemKernelRtlQueryDepthSList
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun rtlFirstEntrySList(listhead: ConstPtr): MutPtr =
    MutPtr(windowssysWindowsWin32SystemKernelRtlFirstEntrySList(listhead.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun rtlInitializeSListHead(listhead: MutPtr) {
    windowssysWindowsWin32SystemKernelRtlInitializeSListHead(listhead.rawAddress.toCPointer<ByteVar>())
}

public actual fun rtlInterlockedFlushSList(listhead: MutPtr): MutPtr =
    MutPtr(windowssysWindowsWin32SystemKernelRtlInterlockedFlushSList(listhead.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun rtlInterlockedPopEntrySList(listhead: MutPtr): MutPtr =
    MutPtr(windowssysWindowsWin32SystemKernelRtlInterlockedPopEntrySList(listhead.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun rtlInterlockedPushEntrySList(listhead: MutPtr, listentry: MutPtr): MutPtr =
    MutPtr(windowssysWindowsWin32SystemKernelRtlInterlockedPushEntrySList(listhead.rawAddress.toCPointer<ByteVar>(), listentry.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun rtlInterlockedPushListSListEx(listhead: MutPtr, list: MutPtr, listend: MutPtr, count: UInt): MutPtr =
    MutPtr(windowssysWindowsWin32SystemKernelRtlInterlockedPushListSListEx(listhead.rawAddress.toCPointer<ByteVar>(), list.rawAddress.toCPointer<ByteVar>(), listend.rawAddress.toCPointer<ByteVar>(), count)?.toLong() ?: 0L)

public actual fun rtlQueryDepthSList(listhead: ConstPtr): UShort =
    windowssysWindowsWin32SystemKernelRtlQueryDepthSList(listhead.rawAddress.toCPointer<ByteVar>())
