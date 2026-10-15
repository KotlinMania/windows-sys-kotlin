// port-lint: source Windows/Win32/System/Environment/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.environment

import io.github.kotlinmania.windowssys.cinterop.windows_sys_expand_environment_strings_w
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import kotlinx.cinterop.UShortVar
import kotlinx.cinterop.addressOf
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.usePinned

public fun ExpandEnvironmentStringsW(lpsrc: PCWSTR, lpdst: PWSTR, nsize: UInt): UInt =
    windows_sys_expand_environment_strings_w(
        lpsrc.toCPointer<UShortVar>(),
        lpdst.toCPointer<UShortVar>(),
        nsize,
    )

public fun ExpandEnvironmentStringsW(lpsrc: UShortArray, lpdst: UShortArray?, nsize: UInt): UInt {
    if (lpsrc.isEmpty()) return 0u
    return lpsrc.usePinned { pinnedSrc ->
        if (lpdst == null || lpdst.isEmpty()) {
            windows_sys_expand_environment_strings_w(pinnedSrc.addressOf(0), null, nsize)
        } else {
            lpdst.usePinned { pinnedDst ->
                windows_sys_expand_environment_strings_w(pinnedSrc.addressOf(0), pinnedDst.addressOf(0), nsize)
            }
        }
    }
}
