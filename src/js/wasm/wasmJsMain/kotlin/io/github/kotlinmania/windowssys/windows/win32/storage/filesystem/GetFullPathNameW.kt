// port-lint: source Windows/Win32/Storage/FileSystem/mod.rs
@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.filesystem

import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public fun GetFullPathNameW(
    lpfilename: PCWSTR,
    nbufferlength: UInt,
    lpbuffer: PWSTR,
    lpfilepart: Long = 0L,
): UInt =
    throw UnsupportedOperationException("GetFullPathNameW requires Windows N-API addon")

public fun GetFullPathNameW(
    lpfilename: PCWSTR,
    nbufferlength: UInt,
    lpbuffer: PWSTR,
    lpfilepart: LongArray?,
): UInt =
    throw UnsupportedOperationException("GetFullPathNameW requires Windows N-API addon")

public fun GetFullPathNameW(
    lpfilename: UShortArray,
    nbufferlength: UInt,
    lpbuffer: UShortArray?,
    lpfilepart: LongArray? = null,
): UInt =
    throw UnsupportedOperationException("GetFullPathNameW requires Windows N-API addon")
