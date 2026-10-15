// port-lint: source Windows/Win32/System/LibraryLoader/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.libraryloader

import io.github.kotlinmania.windowssys.WindowsSysNative
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.FARPROC
import io.github.kotlinmania.windowssys.windows.win32.foundation.HMODULE

public fun GetProcAddress(
    hmodule: HMODULE,
    lpprocname: PCSTR,
): FARPROC? {
    val addr = WindowsSysNative.GetProcAddress(hmodule.toDouble(), lpprocname.toDouble()).toLong()
    return if (addr == 0L) null else FARPROC { addr }
}

public fun GetProcAddress(
    hmodule: HMODULE,
    lpprocname: ByteArray,
): FARPROC? = null
