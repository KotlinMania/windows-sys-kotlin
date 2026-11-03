// port-lint: source Windows/Win32/System/Environment/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.environment

import io.github.kotlinmania.windowssys.cinterop.windows_sys_set_environment_variable_a
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.addressOf
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.usePinned

public fun SetEnvironmentVariableA(lpname: PCSTR, lpvalue: PCSTR): BOOL =
    windows_sys_set_environment_variable_a(
        lpname.toCPointer<ByteVar>(),
        lpvalue.toCPointer<ByteVar>(),
    )

public fun SetEnvironmentVariableA(lpname: ByteArray, lpvalue: ByteArray?): BOOL {
    if (lpname.isEmpty()) return 0
    return lpname.usePinned { pinnedName ->
        if (lpvalue == null) {
            windows_sys_set_environment_variable_a(pinnedName.addressOf(0), null)
        } else {
            lpvalue.usePinned { pinnedVal ->
                windows_sys_set_environment_variable_a(pinnedName.addressOf(0), pinnedVal.addressOf(0))
            }
        }
    }
}
