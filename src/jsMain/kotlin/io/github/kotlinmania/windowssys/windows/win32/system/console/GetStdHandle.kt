// port-lint: source Windows/Win32/System/Console/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.console

import io.github.kotlinmania.windowssys.WindowsSysNative
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public fun GetStdHandle(nstdhandle: STD_HANDLE): HANDLE =
    WindowsSysNative.GetStdHandle(nstdhandle.toInt()).toLong()
