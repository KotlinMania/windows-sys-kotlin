// port-lint: source Windows/Win32/Globalization/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.globalization

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.internal.Kernel32Jni

public fun GetUserPreferredUILanguages(
    dwflags: UInt,
    pulnumlanguages: UIntArray,
    pwszlanguagesbuffer: PWSTR,
    pcchlanguagesbuffer: UIntArray,
): BOOL {
    val numArr = IntArray(1) { pulnumlanguages[0].toInt() }
    val cchArr = IntArray(1) { pcchlanguagesbuffer[0].toInt() }
    val res = Kernel32Jni.GetUserPreferredUILanguages(dwflags.toInt(), numArr, pwszlanguagesbuffer, cchArr)
    pulnumlanguages[0] = numArr[0].toUInt()
    pcchlanguagesbuffer[0] = cchArr[0].toUInt()
    return res
}

public fun GetUserPreferredUILanguages(
    dwflags: UInt,
    pulnumlanguages: UIntArray,
    pwszlanguagesbuffer: UShortArray?,
    pcchlanguagesbuffer: UIntArray,
): BOOL {
    val numArr = IntArray(1) { pulnumlanguages[0].toInt() }
    val cchArr = IntArray(1) { pcchlanguagesbuffer[0].toInt() }
    val shortBuf = pwszlanguagesbuffer?.let { ShortArray(it.size) { i -> it[i].toShort() } }
    val res = Kernel32Jni.GetUserPreferredUILanguagesBuffer(dwflags.toInt(), numArr, shortBuf, cchArr)
    if (shortBuf != null) {
        for (i in shortBuf.indices) {
            pwszlanguagesbuffer[i] = shortBuf[i].toUShort()
        }
    }
    pulnumlanguages[0] = numArr[0].toUInt()
    pcchlanguagesbuffer[0] = cchArr[0].toUInt()
    return res
}
