@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.kernel

private object WindowsWin32SystemKernelJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_kernel_RtlFirstEntrySList(listhead: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_kernel_RtlInitializeSListHead(listhead: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_kernel_RtlInterlockedFlushSList(listhead: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_kernel_RtlInterlockedPopEntrySList(listhead: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_kernel_RtlInterlockedPushEntrySList(listhead: Long, listentry: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_kernel_RtlInterlockedPushListSListEx(listhead: Long, list: Long, listend: Long, count: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_kernel_RtlQueryDepthSList(listhead: Long): Short
}

public actual fun RtlFirstEntrySList(listhead: Long): Long =
    WindowsWin32SystemKernelJniBridge.windowssys_windows_win32_system_kernel_RtlFirstEntrySList(listhead)

public actual fun RtlInitializeSListHead(listhead: Long) {
    WindowsWin32SystemKernelJniBridge.windowssys_windows_win32_system_kernel_RtlInitializeSListHead(listhead)
}

public actual fun RtlInterlockedFlushSList(listhead: Long): Long =
    WindowsWin32SystemKernelJniBridge.windowssys_windows_win32_system_kernel_RtlInterlockedFlushSList(listhead)

public actual fun RtlInterlockedPopEntrySList(listhead: Long): Long =
    WindowsWin32SystemKernelJniBridge.windowssys_windows_win32_system_kernel_RtlInterlockedPopEntrySList(listhead)

public actual fun RtlInterlockedPushEntrySList(listhead: Long, listentry: Long): Long =
    WindowsWin32SystemKernelJniBridge.windowssys_windows_win32_system_kernel_RtlInterlockedPushEntrySList(listhead, listentry)

public actual fun RtlInterlockedPushListSListEx(listhead: Long, list: Long, listend: Long, count: UInt): Long =
    WindowsWin32SystemKernelJniBridge.windowssys_windows_win32_system_kernel_RtlInterlockedPushListSListEx(listhead, list, listend, count.toInt())

public actual fun RtlQueryDepthSList(listhead: Long): UShort =
    WindowsWin32SystemKernelJniBridge.windowssys_windows_win32_system_kernel_RtlQueryDepthSList(listhead).toUShort()
