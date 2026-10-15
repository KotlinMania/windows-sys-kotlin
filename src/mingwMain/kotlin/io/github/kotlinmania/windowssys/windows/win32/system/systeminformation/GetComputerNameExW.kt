// port-lint: source Windows/Win32/System/SystemInformation/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.systeminformation

import io.github.kotlinmania.windowssys.cinterop.windows_sys_get_computer_name_ex_w
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PWSTR
import kotlinx.cinterop.UIntVar
import kotlinx.cinterop.UShortVar
import kotlinx.cinterop.addressOf
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.usePinned

public fun GetComputerNameExW(
    nametype: COMPUTER_NAME_FORMAT,
    lpbuffer: PWSTR,
    nsize: Long,
): BOOL =
    windows_sys_get_computer_name_ex_w(
        nametype,
        lpbuffer.toCPointer<UShortVar>(),
        nsize.toCPointer<UIntVar>(),
    )

public fun GetComputerNameExW(
    nametype: COMPUTER_NAME_FORMAT,
    lpbuffer: PWSTR,
    nsize: UIntArray,
): BOOL {
    if (nsize.isEmpty()) return 0
    return nsize.usePinned { pinnedSize ->
        windows_sys_get_computer_name_ex_w(
            nametype,
            lpbuffer.toCPointer<UShortVar>(),
            pinnedSize.addressOf(0),
        )
    }
}

public fun GetComputerNameExW(
    nametype: COMPUTER_NAME_FORMAT,
    lpbuffer: UShortArray?,
    nsize: UIntArray,
): BOOL {
    if (nsize.isEmpty()) return 0
    return nsize.usePinned { pinnedSize ->
        if (lpbuffer == null || lpbuffer.isEmpty()) {
            windows_sys_get_computer_name_ex_w(
                nametype,
                null,
                pinnedSize.addressOf(0),
            )
        } else {
            lpbuffer.usePinned { pinnedBuf ->
                windows_sys_get_computer_name_ex_w(
                    nametype,
                    pinnedBuf.addressOf(0),
                    pinnedSize.addressOf(0),
                )
            }
        }
    }
}
