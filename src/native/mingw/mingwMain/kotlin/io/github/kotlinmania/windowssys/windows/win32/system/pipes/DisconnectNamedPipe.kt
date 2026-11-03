// port-lint: source Windows/Win32/System/Pipes/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.windowssys.windows.win32.system.pipes

import io.github.kotlinmania.windowssys.cinterop.windows_sys_disconnect_named_pipe
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import kotlinx.cinterop.toCPointer

public fun DisconnectNamedPipe(hnamedpipe: HANDLE): BOOL =
    windows_sys_disconnect_named_pipe(hnamedpipe.toCPointer())
