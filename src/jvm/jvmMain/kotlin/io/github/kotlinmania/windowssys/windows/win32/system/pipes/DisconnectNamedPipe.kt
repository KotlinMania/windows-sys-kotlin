// port-lint: source Windows/Win32/System/Pipes/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.pipes

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.internal.Kernel32Jni
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public fun DisconnectNamedPipe(hnamedpipe: HANDLE): BOOL =
    Kernel32Jni.DisconnectNamedPipe(hnamedpipe)
