// port-lint: source Windows/Win32/System/Shutdown/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.shutdown

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.internal.Kernel32Jni

public fun LockWorkStation(): BOOL =
    Kernel32Jni.LockWorkStation()
