package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.ceip

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL

public fun CeipIsOptedIn(): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "CeipIsOptedIn", longArrayOf()).toInt()
}
