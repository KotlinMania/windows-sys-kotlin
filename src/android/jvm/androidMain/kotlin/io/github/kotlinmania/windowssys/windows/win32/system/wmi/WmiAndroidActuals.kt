@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.wmi

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object WindowsWin32SystemWmiJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32SystemWmiMiApplicationInitializeV1(flags: Int, applicationid: Long, extendederror: Long, application: Long): Int
}

public actual fun miApplicationInitializeV1(flags: UInt, applicationid: ConstPtr, extendederror: MutPtr, application: MutPtr): MiResult =
    WindowsWin32SystemWmiJniBridge.windowssysWindowsWin32SystemWmiMiApplicationInitializeV1(flags.toInt(), applicationid.rawAddress, extendederror.rawAddress, application.rawAddress)
