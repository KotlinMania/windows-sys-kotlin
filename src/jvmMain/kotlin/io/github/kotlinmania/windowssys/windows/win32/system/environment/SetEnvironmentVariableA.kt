// port-lint: source Windows/Win32/System/Environment/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.environment

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.internal.Kernel32Jni

public fun SetEnvironmentVariableA(lpname: PCSTR, lpvalue: PCSTR): BOOL =
    Kernel32Jni.SetEnvironmentVariableA(lpname, lpvalue)

public fun SetEnvironmentVariableA(lpname: ByteArray, lpvalue: ByteArray?): BOOL = 0
