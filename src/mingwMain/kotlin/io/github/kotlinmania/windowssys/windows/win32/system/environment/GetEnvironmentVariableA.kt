// port-lint: source Windows/Win32/System/Environment/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.environment

import io.github.kotlinmania.windowssys.cinterop.windows_sys_get_environment_variable_a
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PSTR
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.addressOf
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.usePinned

public fun GetEnvironmentVariableA(lpname: PCSTR, lpbuffer: PSTR, nsize: UInt): UInt =
    windows_sys_get_environment_variable_a(
        lpname.toCPointer<ByteVar>(),
        lpbuffer.toCPointer<ByteVar>(),
        nsize,
    )

public fun GetEnvironmentVariableA(lpname: ByteArray, lpbuffer: ByteArray?, nsize: UInt): UInt {
    if (lpname.isEmpty()) return 0u
    return lpname.usePinned { pinnedName ->
        if (lpbuffer == null || lpbuffer.isEmpty()) {
            windows_sys_get_environment_variable_a(pinnedName.addressOf(0), null, nsize)
        } else {
            lpbuffer.usePinned { pinnedBuf ->
                windows_sys_get_environment_variable_a(pinnedName.addressOf(0), pinnedBuf.addressOf(0), nsize)
            }
        }
    }
}
