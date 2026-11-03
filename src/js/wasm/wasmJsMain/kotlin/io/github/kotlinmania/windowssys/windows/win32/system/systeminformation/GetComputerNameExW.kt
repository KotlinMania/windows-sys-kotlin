// port-lint: source Windows/Win32/System/SystemInformation/mod.rs
@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.systeminformation

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PWSTR

public fun GetComputerNameExW(
    nametype: COMPUTER_NAME_FORMAT,
    lpbuffer: PWSTR,
    nsize: Long,
): BOOL =
    throw UnsupportedOperationException("GetComputerNameExW requires Windows N-API addon")

public fun GetComputerNameExW(
    nametype: COMPUTER_NAME_FORMAT,
    lpbuffer: PWSTR,
    nsize: UIntArray,
): BOOL =
    throw UnsupportedOperationException("GetComputerNameExW requires Windows N-API addon")

public fun GetComputerNameExW(
    nametype: COMPUTER_NAME_FORMAT,
    lpbuffer: UShortArray?,
    nsize: UIntArray,
): BOOL =
    throw UnsupportedOperationException("GetComputerNameExW requires Windows N-API addon")
