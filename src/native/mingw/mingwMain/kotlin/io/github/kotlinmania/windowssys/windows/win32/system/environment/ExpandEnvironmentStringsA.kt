// port-lint: source Windows/Win32/System/Environment/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.environment

import io.github.kotlinmania.windowssys.cinterop.windows_sys_expand_environment_strings_a
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PSTR
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.addressOf
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.usePinned

public fun ExpandEnvironmentStringsA(lpsrc: PCSTR, lpdst: PSTR, nsize: UInt): UInt =
    windows_sys_expand_environment_strings_a(
        lpsrc.toCPointer<ByteVar>(),
        lpdst.toCPointer<ByteVar>(),
        nsize,
    )

public fun ExpandEnvironmentStringsA(lpsrc: ByteArray, lpdst: ByteArray?, nsize: UInt): UInt {
    if (lpsrc.isEmpty()) return 0u
    return lpsrc.usePinned { pinnedSrc ->
        if (lpdst == null || lpdst.isEmpty()) {
            windows_sys_expand_environment_strings_a(pinnedSrc.addressOf(0), null, nsize)
        } else {
            lpdst.usePinned { pinnedDst ->
                windows_sys_expand_environment_strings_a(pinnedSrc.addressOf(0), pinnedDst.addressOf(0), nsize)
            }
        }
    }
}
