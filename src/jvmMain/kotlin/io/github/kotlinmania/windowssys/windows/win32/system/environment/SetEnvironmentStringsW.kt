// port-lint: source Windows/Win32/System/Environment/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.environment

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.internal.Kernel32Jni

public fun SetEnvironmentStringsW(newenvironment: PCWSTR): BOOL =
    Kernel32Jni.SetEnvironmentStringsW(newenvironment)
