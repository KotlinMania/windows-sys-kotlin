// port-lint: source Windows/Win32/System/Pipes/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.pipes

import io.github.kotlinmania.windowssys.WindowsSysNative
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public fun DisconnectNamedPipe(hnamedpipe: HANDLE): BOOL =
    WindowsSysNative.DisconnectNamedPipe(hnamedpipe.toDouble())
