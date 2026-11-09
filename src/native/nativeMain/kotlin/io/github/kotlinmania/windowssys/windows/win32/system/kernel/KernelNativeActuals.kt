@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.kernel

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun RtlFirstEntrySList(listhead: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.kernel.cinterop.windowssys_windows_win32_system_kernel_RtlFirstEntrySList(listhead.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun RtlInitializeSListHead(listhead: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.kernel.cinterop.windowssys_windows_win32_system_kernel_RtlInitializeSListHead(listhead.toCPointer<ByteVar>())
}

public actual fun RtlInterlockedFlushSList(listhead: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.kernel.cinterop.windowssys_windows_win32_system_kernel_RtlInterlockedFlushSList(listhead.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun RtlInterlockedPopEntrySList(listhead: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.kernel.cinterop.windowssys_windows_win32_system_kernel_RtlInterlockedPopEntrySList(listhead.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun RtlInterlockedPushEntrySList(listhead: Long, listentry: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.kernel.cinterop.windowssys_windows_win32_system_kernel_RtlInterlockedPushEntrySList(listhead.toCPointer<ByteVar>(), listentry.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun RtlInterlockedPushListSListEx(listhead: Long, list: Long, listend: Long, count: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.kernel.cinterop.windowssys_windows_win32_system_kernel_RtlInterlockedPushListSListEx(listhead.toCPointer<ByteVar>(), list.toCPointer<ByteVar>(), listend.toCPointer<ByteVar>(), count)?.toLong() ?: 0L

public actual fun RtlQueryDepthSList(listhead: Long): UShort =
    io.github.kotlinmania.windowssys.windows.win32.system.kernel.cinterop.windowssys_windows_win32_system_kernel_RtlQueryDepthSList(listhead.toCPointer<ByteVar>())
