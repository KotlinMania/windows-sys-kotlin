// port-lint: source Windows/Win32/System/Threading/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.threading

import io.github.kotlinmania.windowssys.internal.Kernel32Jni

public fun ExitProcess(uexitcode: UInt): Unit =
    Kernel32Jni.ExitProcess(uexitcode.toInt())
