// port-lint: source Windows/Win32/Storage/FileSystem/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.storage.filesystem

import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.internal.Kernel32Jni

public fun GetFileAttributesA(lpfilename: PCSTR): UInt =
    Kernel32Jni.GetFileAttributesA(lpfilename).toUInt()
