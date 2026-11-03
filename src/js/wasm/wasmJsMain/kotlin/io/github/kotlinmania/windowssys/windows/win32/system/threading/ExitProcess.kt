// port-lint: source Windows/Win32/System/Threading/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.threading

public fun ExitProcess(uexitcode: UInt): Unit =
    throw UnsupportedOperationException("ExitProcess requires Windows N-API addon")
