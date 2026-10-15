// port-lint: source Windows/Win32/System/SystemInformation/mod.rs
@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.systeminformation

import io.github.kotlinmania.windowssys.WindowsSysNative
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PWSTR

public fun GetComputerNameExW(
    nametype: COMPUTER_NAME_FORMAT,
    lpbuffer: PWSTR,
    nsize: Long,
): BOOL {
    val res = WindowsSysNative.GetComputerNameExW(nametype, lpbuffer.toDouble(), 0)
    return (res.success as? Number)?.toInt() ?: 0
}

public fun GetComputerNameExW(
    nametype: COMPUTER_NAME_FORMAT,
    lpbuffer: PWSTR,
    nsize: UIntArray,
): BOOL {
    if (nsize.isEmpty()) return 0
    val res = WindowsSysNative.GetComputerNameExW(nametype, lpbuffer.toDouble(), nsize[0].toInt())
    nsize[0] = ((res.size as? Number)?.toInt() ?: 0).toUInt()
    return (res.success as? Number)?.toInt() ?: 0
}

public fun GetComputerNameExW(
    nametype: COMPUTER_NAME_FORMAT,
    lpbuffer: UShortArray?,
    nsize: UIntArray,
): BOOL {
    if (nsize.isEmpty()) return 0
    val res = WindowsSysNative.GetComputerNameExW(nametype, 0.0, nsize[0].toInt())
    nsize[0] = ((res.size as? Number)?.toInt() ?: 0).toUInt()
    return (res.success as? Number)?.toInt() ?: 0
}
