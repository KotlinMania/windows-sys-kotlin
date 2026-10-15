// port-lint: source Windows/Win32/System/LibraryLoader/mod.rs
@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.libraryloader

import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.internal.Kernel32Jni
import io.github.kotlinmania.windowssys.windows.win32.foundation.HMODULE

public fun LoadLibraryW(lplibfilename: PCWSTR): HMODULE =
    Kernel32Jni.LoadLibraryW(lplibfilename)

public fun LoadLibraryW(lplibfilename: UShortArray): HMODULE = 0L
