// port-lint: source Windows/Win32/Globalization/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.globalization

import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.internal.Kernel32Jni

public fun lstrlenW(lpstring: PCWSTR): Int =
    Kernel32Jni.lstrlenW(lpstring)
