// port-lint: source Windows/Win32/Storage/FileSystem/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.storage.filesystem

import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.internal.Kernel32Jni

public fun GetFileAttributesW(lpfilename: PCWSTR): UInt =
    Kernel32Jni.GetFileAttributesW(lpfilename).toUInt()
