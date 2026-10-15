// port-lint: source Windows/Win32/System/LibraryLoader/mod.rs
@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.libraryloader

import io.github.kotlinmania.windowssys.WindowsSysNative
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HMODULE

public fun GetModuleHandleW(lpmodulename: PCWSTR): HMODULE =
    WindowsSysNative.GetModuleHandleW(lpmodulename.toDouble()).toLong()

public fun GetModuleHandleW(lpmodulename: UShortArray?): HMODULE =
    WindowsSysNative.GetModuleHandleW(0.0).toLong()
