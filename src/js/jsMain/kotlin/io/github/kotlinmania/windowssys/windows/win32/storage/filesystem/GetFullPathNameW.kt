// port-lint: source Windows/Win32/Storage/FileSystem/mod.rs
@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.filesystem

import io.github.kotlinmania.windowssys.WindowsSysNative
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public fun GetFullPathNameW(
    lpfilename: PCWSTR,
    nbufferlength: UInt,
    lpbuffer: PWSTR,
    lpfilepart: Long = 0L,
): UInt {
    val res =
        WindowsSysNative.GetFullPathNameW(
            lpfilename.toDouble(),
            nbufferlength.toInt(),
            lpbuffer.toDouble(),
        )
    return (res.length as Int).toUInt()
}

public fun GetFullPathNameW(
    lpfilename: PCWSTR,
    nbufferlength: UInt,
    lpbuffer: PWSTR,
    lpfilepart: LongArray?,
): UInt {
    val res =
        WindowsSysNative.GetFullPathNameW(
            lpfilename.toDouble(),
            nbufferlength.toInt(),
            lpbuffer.toDouble(),
        )
    if (lpfilepart != null && lpfilepart.isNotEmpty()) {
        lpfilepart[0] = (res.filePart as Double).toLong()
    }
    return (res.length as Int).toUInt()
}

public fun GetFullPathNameW(
    lpfilename: UShortArray,
    nbufferlength: UInt,
    lpbuffer: UShortArray?,
    lpfilepart: LongArray? = null,
): UInt = 0u
