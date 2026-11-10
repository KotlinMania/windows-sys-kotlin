@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.kernel

import io.github.kotlinmania.windowssys.COpaquePointer
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun rtlFirstEntrySList(listhead: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.kernel.cinterop.windowssys_windows_win32_system_kernel_rtlFirstEntrySList(listhead?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun rtlInitializeSListHead(listhead: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.kernel.cinterop.windowssys_windows_win32_system_kernel_rtlInitializeSListHead(listhead?.value?.toCPointer<ByteVar>())
}

public actual fun rtlInterlockedFlushSList(listhead: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.kernel.cinterop.windowssys_windows_win32_system_kernel_rtlInterlockedFlushSList(listhead?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun rtlInterlockedPopEntrySList(listhead: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.kernel.cinterop.windowssys_windows_win32_system_kernel_rtlInterlockedPopEntrySList(listhead?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun rtlInterlockedPushEntrySList(listhead: COpaquePointer?, listentry: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.kernel.cinterop.windowssys_windows_win32_system_kernel_rtlInterlockedPushEntrySList(listhead?.value?.toCPointer<ByteVar>(), listentry?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun rtlInterlockedPushListSListEx(listhead: COpaquePointer?, list: COpaquePointer?, listend: COpaquePointer?, count: UInt): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.kernel.cinterop.windowssys_windows_win32_system_kernel_rtlInterlockedPushListSListEx(listhead?.value?.toCPointer<ByteVar>(), list?.value?.toCPointer<ByteVar>(), listend?.value?.toCPointer<ByteVar>(), count)?.let { COpaquePointer(it.toLong()) }

public actual fun rtlQueryDepthSList(listhead: COpaquePointer?): UShort =
    io.github.kotlinmania.windowssys.windows.win32.system.kernel.cinterop.windowssys_windows_win32_system_kernel_rtlQueryDepthSList(listhead?.value?.toCPointer<ByteVar>())
