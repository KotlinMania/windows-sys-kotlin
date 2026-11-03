// port-lint: source Windows/Win32/System/Environment/mod.rs
@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.environment

import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.internal.Kernel32Jni

public fun GetCurrentDirectoryW(nbufferlength: UInt, lpbuffer: PWSTR): UInt =
    Kernel32Jni.GetCurrentDirectoryW(nbufferlength.toInt(), lpbuffer).toUInt()

public fun GetCurrentDirectoryW(nbufferlength: UInt, lpbuffer: UShortArray?): UInt {
    val bufShorts = if (lpbuffer != null && lpbuffer.isNotEmpty()) ShortArray(lpbuffer.size) else null
    val res = Kernel32Jni.GetCurrentDirectoryWBuffer(nbufferlength.toInt(), bufShorts)
    if (bufShorts != null && lpbuffer != null) {
        for (i in bufShorts.indices) {
            lpbuffer[i] = bufShorts[i].toUShort()
        }
    }
    return res.toUInt()
}
