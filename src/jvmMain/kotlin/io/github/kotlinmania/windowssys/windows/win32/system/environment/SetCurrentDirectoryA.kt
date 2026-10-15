// port-lint: source Windows/Win32/System/Environment/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.environment

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.internal.Kernel32Jni

public fun SetCurrentDirectoryA(lppathname: PCSTR): BOOL =
    Kernel32Jni.SetCurrentDirectoryA(lppathname)

public fun SetCurrentDirectoryA(lppathname: ByteArray): BOOL = 0
