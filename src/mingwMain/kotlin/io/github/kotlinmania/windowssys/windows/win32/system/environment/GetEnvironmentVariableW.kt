// port-lint: source Windows/Win32/System/Environment/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.environment

import io.github.kotlinmania.windowssys.cinterop.windows_sys_get_environment_variable_w
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import kotlinx.cinterop.UShortVar
import kotlinx.cinterop.addressOf
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.usePinned

public fun GetEnvironmentVariableW(lpname: PCWSTR, lpbuffer: PWSTR, nsize: UInt): UInt =
    windows_sys_get_environment_variable_w(
        lpname.toCPointer<UShortVar>(),
        lpbuffer.toCPointer<UShortVar>(),
        nsize,
    )

public fun GetEnvironmentVariableW(lpname: UShortArray, lpbuffer: UShortArray?, nsize: UInt): UInt {
    if (lpname.isEmpty()) return 0u
    return lpname.usePinned { pinnedName ->
        if (lpbuffer == null || lpbuffer.isEmpty()) {
            windows_sys_get_environment_variable_w(pinnedName.addressOf(0), null, nsize)
        } else {
            lpbuffer.usePinned { pinnedBuf ->
                windows_sys_get_environment_variable_w(pinnedName.addressOf(0), pinnedBuf.addressOf(0), nsize)
            }
        }
    }
}
