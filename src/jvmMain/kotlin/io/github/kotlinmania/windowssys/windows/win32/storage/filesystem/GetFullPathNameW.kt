// port-lint: source Windows/Win32/Storage/FileSystem/mod.rs
@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.filesystem

import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.internal.Kernel32Jni

public fun GetFullPathNameW(
    lpfilename: PCWSTR,
    nbufferlength: UInt,
    lpbuffer: PWSTR,
    lpfilepart: Long = 0L,
): UInt =
    Kernel32Jni
        .GetFullPathNameW(
            lpfilename,
            nbufferlength.toInt(),
            lpbuffer,
            null,
        ).toUInt()

public fun GetFullPathNameW(
    lpfilename: PCWSTR,
    nbufferlength: UInt,
    lpbuffer: PWSTR,
    lpfilepart: LongArray?,
): UInt =
    Kernel32Jni
        .GetFullPathNameW(
            lpfilename,
            nbufferlength.toInt(),
            lpbuffer,
            lpfilepart,
        ).toUInt()

public fun GetFullPathNameW(
    lpfilename: UShortArray,
    nbufferlength: UInt,
    lpbuffer: UShortArray?,
    lpfilepart: LongArray? = null,
): UInt {
    if (lpfilename.isEmpty()) return 0u
    val nameShorts = ShortArray(lpfilename.size) { lpfilename[it].toShort() }
    val bufShorts = if (lpbuffer != null && lpbuffer.isNotEmpty()) ShortArray(lpbuffer.size) else null
    val res =
        Kernel32Jni.GetFullPathNameWBuffer(
            nameShorts,
            nbufferlength.toInt(),
            bufShorts,
            lpfilepart,
        )
    if (bufShorts != null && lpbuffer != null) {
        for (i in bufShorts.indices) {
            lpbuffer[i] = bufShorts[i].toUShort()
        }
    }
    return res.toUInt()
}
