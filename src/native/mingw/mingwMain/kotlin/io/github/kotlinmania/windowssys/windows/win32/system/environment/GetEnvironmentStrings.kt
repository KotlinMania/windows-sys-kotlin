// port-lint: source Windows/Win32/System/Environment/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.windowssys.windows.win32.system.environment

import io.github.kotlinmania.windowssys.cinterop.windows_sys_get_environment_strings
import io.github.kotlinmania.windowssys.core.PSTR
import kotlinx.cinterop.toLong

public fun GetEnvironmentStrings(): PSTR =
    windows_sys_get_environment_strings()?.toLong() ?: 0L
