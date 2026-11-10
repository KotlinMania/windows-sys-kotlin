@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.kernel

import io.github.kotlinmania.windowssys.COpaquePointer

private object WindowsWin32SystemKernelJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_kernel_rtlFirstEntrySList(listhead: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_kernel_rtlInitializeSListHead(listhead: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_kernel_rtlInterlockedFlushSList(listhead: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_kernel_rtlInterlockedPopEntrySList(listhead: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_kernel_rtlInterlockedPushEntrySList(listhead: Long, listentry: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_kernel_rtlInterlockedPushListSListEx(listhead: Long, list: Long, listend: Long, count: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_kernel_rtlQueryDepthSList(listhead: Long): Short
}

public actual fun rtlFirstEntrySList(listhead: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemKernelJniBridge.windowssys_windows_win32_system_kernel_rtlFirstEntrySList((listhead?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun rtlInitializeSListHead(listhead: COpaquePointer?) {
    WindowsWin32SystemKernelJniBridge.windowssys_windows_win32_system_kernel_rtlInitializeSListHead((listhead?.value ?: 0L))
}

public actual fun rtlInterlockedFlushSList(listhead: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemKernelJniBridge.windowssys_windows_win32_system_kernel_rtlInterlockedFlushSList((listhead?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun rtlInterlockedPopEntrySList(listhead: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemKernelJniBridge.windowssys_windows_win32_system_kernel_rtlInterlockedPopEntrySList((listhead?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun rtlInterlockedPushEntrySList(listhead: COpaquePointer?, listentry: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemKernelJniBridge.windowssys_windows_win32_system_kernel_rtlInterlockedPushEntrySList((listhead?.value ?: 0L), (listentry?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun rtlInterlockedPushListSListEx(listhead: COpaquePointer?, list: COpaquePointer?, listend: COpaquePointer?, count: UInt): COpaquePointer? =
    WindowsWin32SystemKernelJniBridge.windowssys_windows_win32_system_kernel_rtlInterlockedPushListSListEx((listhead?.value ?: 0L), (list?.value ?: 0L), (listend?.value ?: 0L), count.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun rtlQueryDepthSList(listhead: COpaquePointer?): UShort =
    WindowsWin32SystemKernelJniBridge.windowssys_windows_win32_system_kernel_rtlQueryDepthSList((listhead?.value ?: 0L)).toUShort()
