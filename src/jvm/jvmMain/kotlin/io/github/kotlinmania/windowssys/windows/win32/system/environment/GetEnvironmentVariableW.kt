// port-lint: source Windows/Win32/System/Environment/mod.rs
@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.environment

import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.internal.Kernel32Jni

public fun GetEnvironmentVariableW(lpname: PCWSTR, lpbuffer: PWSTR, nsize: UInt): UInt =
    Kernel32Jni.GetEnvironmentVariableW(lpname, lpbuffer, nsize.toInt()).toUInt()

public fun GetEnvironmentVariableW(lpname: UShortArray, lpbuffer: UShortArray?, nsize: UInt): UInt {
    if (lpname.isEmpty()) return 0u
    val nameShorts = ShortArray(lpname.size) { lpname[it].toShort() }
    val bufShorts = if (lpbuffer != null && lpbuffer.isNotEmpty()) ShortArray(lpbuffer.size) else null
    val res = Kernel32Jni.GetEnvironmentVariableWBuffer(nameShorts, bufShorts, nsize.toInt())
    if (bufShorts != null && lpbuffer != null) {
        for (i in bufShorts.indices) {
            lpbuffer[i] = bufShorts[i].toUShort()
        }
    }
    return res.toUInt()
}
