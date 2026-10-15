// port-lint: source Windows/Win32/System/Environment/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.environment

import io.github.kotlinmania.windowssys.cinterop.windows_sys_set_environment_variable_w
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import kotlinx.cinterop.UShortVar
import kotlinx.cinterop.addressOf
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.usePinned

public fun SetEnvironmentVariableW(lpname: PCWSTR, lpvalue: PCWSTR): BOOL =
    windows_sys_set_environment_variable_w(
        lpname.toCPointer<UShortVar>(),
        lpvalue.toCPointer<UShortVar>(),
    )

public fun SetEnvironmentVariableW(lpname: UShortArray, lpvalue: UShortArray?): BOOL {
    if (lpname.isEmpty()) return 0
    return lpname.usePinned { pinnedName ->
        if (lpvalue == null) {
            windows_sys_set_environment_variable_w(pinnedName.addressOf(0), null)
        } else {
            lpvalue.usePinned { pinnedVal ->
                windows_sys_set_environment_variable_w(pinnedName.addressOf(0), pinnedVal.addressOf(0))
            }
        }
    }
}
