// port-lint: source Windows/Win32/System/Environment/mod.rs
@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.environment

import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.internal.Kernel32Jni

public fun ExpandEnvironmentStringsW(lpsrc: PCWSTR, lpdst: PWSTR, nsize: UInt): UInt =
    Kernel32Jni.ExpandEnvironmentStringsW(lpsrc, lpdst, nsize.toInt()).toUInt()

public fun ExpandEnvironmentStringsW(lpsrc: UShortArray, lpdst: UShortArray?, nsize: UInt): UInt {
    if (lpsrc.isEmpty()) return 0u
    val srcShorts = ShortArray(lpsrc.size) { lpsrc[it].toShort() }
    val dstShorts = if (lpdst != null && lpdst.isNotEmpty()) ShortArray(lpdst.size) else null
    val res = Kernel32Jni.ExpandEnvironmentStringsWBuffer(srcShorts, dstShorts, nsize.toInt())
    if (dstShorts != null && lpdst != null) {
        for (i in dstShorts.indices) {
            lpdst[i] = dstShorts[i].toUShort()
        }
    }
    return res.toUInt()
}
