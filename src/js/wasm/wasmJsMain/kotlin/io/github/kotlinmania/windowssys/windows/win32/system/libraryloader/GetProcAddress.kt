// port-lint: source Windows/Win32/System/LibraryLoader/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.libraryloader

import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.FARPROC
import io.github.kotlinmania.windowssys.windows.win32.foundation.HMODULE

public fun GetProcAddress(
    hmodule: HMODULE,
    lpprocname: PCSTR,
): FARPROC? =
    throw UnsupportedOperationException("GetProcAddress requires Windows N-API addon")

public fun GetProcAddress(
    hmodule: HMODULE,
    lpprocname: ByteArray,
): FARPROC? =
    throw UnsupportedOperationException("GetProcAddress requires Windows N-API addon")
