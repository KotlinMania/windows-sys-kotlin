// port-lint: source Windows/Win32/System/Environment/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.environment

import io.github.kotlinmania.windowssys.WindowsSysNative
import io.github.kotlinmania.windowssys.core.PWSTR

public fun GetEnvironmentStringsW(): PWSTR =
    WindowsSysNative.GetEnvironmentStringsW().toLong()
