// port-lint: source Windows/Win32/System/Environment/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.windowssys.windows.win32.system.environment

import io.github.kotlinmania.windowssys.cinterop.windows_sys_get_environment_strings_w
import io.github.kotlinmania.windowssys.core.PWSTR
import kotlinx.cinterop.toLong

public fun GetEnvironmentStringsW(): PWSTR =
    windows_sys_get_environment_strings_w()?.toLong() ?: 0L
