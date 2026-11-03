// port-lint: source Windows/Win32/System/Environment/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.environment

import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.internal.Kernel32Jni

public fun GetCommandLineA(): PCSTR =
    Kernel32Jni.GetCommandLineA()
