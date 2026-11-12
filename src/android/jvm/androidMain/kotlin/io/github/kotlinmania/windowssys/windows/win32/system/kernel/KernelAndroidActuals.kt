@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.kernel

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object WindowsWin32SystemKernelJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32SystemKernelRtlFirstEntrySList(listhead: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemKernelRtlInitializeSListHead(listhead: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemKernelRtlInterlockedFlushSList(listhead: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemKernelRtlInterlockedPopEntrySList(listhead: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemKernelRtlInterlockedPushEntrySList(listhead: Long, listentry: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemKernelRtlInterlockedPushListSListEx(listhead: Long, list: Long, listend: Long, count: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemKernelRtlQueryDepthSList(listhead: Long): Short
}

public actual fun rtlFirstEntrySList(listhead: ConstPtr): MutPtr =
    MutPtr(WindowsWin32SystemKernelJniBridge.windowssysWindowsWin32SystemKernelRtlFirstEntrySList(listhead.rawAddress))

public actual fun rtlInitializeSListHead(listhead: MutPtr) {
    WindowsWin32SystemKernelJniBridge.windowssysWindowsWin32SystemKernelRtlInitializeSListHead(listhead.rawAddress)
}

public actual fun rtlInterlockedFlushSList(listhead: MutPtr): MutPtr =
    MutPtr(WindowsWin32SystemKernelJniBridge.windowssysWindowsWin32SystemKernelRtlInterlockedFlushSList(listhead.rawAddress))

public actual fun rtlInterlockedPopEntrySList(listhead: MutPtr): MutPtr =
    MutPtr(WindowsWin32SystemKernelJniBridge.windowssysWindowsWin32SystemKernelRtlInterlockedPopEntrySList(listhead.rawAddress))

public actual fun rtlInterlockedPushEntrySList(listhead: MutPtr, listentry: MutPtr): MutPtr =
    MutPtr(WindowsWin32SystemKernelJniBridge.windowssysWindowsWin32SystemKernelRtlInterlockedPushEntrySList(listhead.rawAddress, listentry.rawAddress))

public actual fun rtlInterlockedPushListSListEx(listhead: MutPtr, list: MutPtr, listend: MutPtr, count: UInt): MutPtr =
    MutPtr(WindowsWin32SystemKernelJniBridge.windowssysWindowsWin32SystemKernelRtlInterlockedPushListSListEx(listhead.rawAddress, list.rawAddress, listend.rawAddress, count.toInt()))

public actual fun rtlQueryDepthSList(listhead: ConstPtr): UShort =
    WindowsWin32SystemKernelJniBridge.windowssysWindowsWin32SystemKernelRtlQueryDepthSList(listhead.rawAddress).toUShort()
