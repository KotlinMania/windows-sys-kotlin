// port-lint: source Windows/Win32/System/Environment/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.windowssys.windows.win32.system.environment

import io.github.kotlinmania.windowssys.cinterop.windows_sys_get_command_line_w
import io.github.kotlinmania.windowssys.core.PCWSTR
import kotlinx.cinterop.toLong

public fun GetCommandLineW(): PCWSTR =
    windows_sys_get_command_line_w()?.toLong() ?: 0L
