// port-lint: source Windows/Win32/System/Environment/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.windowssys.windows.win32.system.environment

import io.github.kotlinmania.windowssys.cinterop.windows_sys_free_environment_strings_w
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import kotlinx.cinterop.UShortVar
import kotlinx.cinterop.toCPointer

public fun FreeEnvironmentStringsW(penv: PCWSTR): BOOL =
    windows_sys_free_environment_strings_w(penv.toCPointer<UShortVar>())
