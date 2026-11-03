// port-lint: source Windows/Win32/System/Environment/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.windowssys.windows.win32.system.environment

import io.github.kotlinmania.windowssys.cinterop.windows_sys_get_command_line_a
import io.github.kotlinmania.windowssys.core.PCSTR
import kotlinx.cinterop.toLong

public fun GetCommandLineA(): PCSTR =
    windows_sys_get_command_line_a()?.toLong() ?: 0L
