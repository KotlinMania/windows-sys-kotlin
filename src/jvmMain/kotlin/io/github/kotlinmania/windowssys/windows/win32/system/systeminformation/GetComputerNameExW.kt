// port-lint: source Windows/Win32/System/SystemInformation/mod.rs
@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.systeminformation

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.internal.Kernel32Jni

public fun GetComputerNameExW(
    nametype: COMPUTER_NAME_FORMAT,
    lpbuffer: PWSTR,
    nsize: Long,
): BOOL {
    if (nsize == 0L) return 0
    val sizeArr = IntArray(1)
    return Kernel32Jni.GetComputerNameExW(nametype, lpbuffer, sizeArr)
}

public fun GetComputerNameExW(
    nametype: COMPUTER_NAME_FORMAT,
    lpbuffer: PWSTR,
    nsize: UIntArray,
): BOOL {
    if (nsize.isEmpty()) return 0
    val sizeArr = IntArray(1) { nsize[0].toInt() }
    val res = Kernel32Jni.GetComputerNameExW(nametype, lpbuffer, sizeArr)
    nsize[0] = sizeArr[0].toUInt()
    return res
}

public fun GetComputerNameExW(
    nametype: COMPUTER_NAME_FORMAT,
    lpbuffer: UShortArray?,
    nsize: UIntArray,
): BOOL {
    if (nsize.isEmpty()) return 0
    val sizeArr = IntArray(1) { nsize[0].toInt() }
    val bufShorts = if (lpbuffer != null && lpbuffer.isNotEmpty()) ShortArray(lpbuffer.size) else null
    val res = Kernel32Jni.GetComputerNameExWBuffer(nametype, bufShorts, sizeArr)
    nsize[0] = sizeArr[0].toUInt()
    if (bufShorts != null && lpbuffer != null) {
        for (i in bufShorts.indices) {
            lpbuffer[i] = bufShorts[i].toUShort()
        }
    }
    return res
}
