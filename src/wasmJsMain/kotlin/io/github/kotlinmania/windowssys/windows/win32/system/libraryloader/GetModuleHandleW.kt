// port-lint: source Windows/Win32/System/LibraryLoader/mod.rs
@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.libraryloader

import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HMODULE

public fun GetModuleHandleW(lpmodulename: PCWSTR): HMODULE =
    throw UnsupportedOperationException("GetModuleHandleW requires Windows N-API addon")

public fun GetModuleHandleW(lpmodulename: UShortArray?): HMODULE =
    throw UnsupportedOperationException("GetModuleHandleW requires Windows N-API addon")
