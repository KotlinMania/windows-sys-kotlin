// port-lint: source Windows/Win32/Globalization/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.windowssys.windows.win32.globalization

import io.github.kotlinmania.windowssys.cinterop.windows_sys_lstrlen_w
import io.github.kotlinmania.windowssys.core.PCWSTR
import kotlinx.cinterop.UShortVar
import kotlinx.cinterop.toCPointer

public fun lstrlenW(lpstring: PCWSTR): Int =
    windows_sys_lstrlen_w(lpstring.toCPointer<UShortVar>())
