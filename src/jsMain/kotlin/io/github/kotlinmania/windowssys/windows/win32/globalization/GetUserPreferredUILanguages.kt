// port-lint: source Windows/Win32/Globalization/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.globalization

import io.github.kotlinmania.windowssys.WindowsSysNative
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PWSTR

public fun GetUserPreferredUILanguages(
    dwflags: UInt,
    pulnumlanguages: UIntArray,
    pwszlanguagesbuffer: PWSTR,
    pcchlanguagesbuffer: UIntArray,
): BOOL {
    val res =
        WindowsSysNative.GetUserPreferredUILanguages(
            dwflags.toInt(),
            pulnumlanguages[0].toInt(),
            pwszlanguagesbuffer.toDouble(),
            pcchlanguagesbuffer[0].toInt(),
        )
    if (res != null) {
        val success = (res.success as? Number)?.toInt() ?: 0
        val numLangs = (res.numLanguages as? Number)?.toInt() ?: 0
        val cchBuf = (res.cchLanguagesBuffer as? Number)?.toInt() ?: 0
        pulnumlanguages[0] = numLangs.toUInt()
        pcchlanguagesbuffer[0] = cchBuf.toUInt()
        return success
    }
    return 0
}

public fun GetUserPreferredUILanguages(
    dwflags: UInt,
    pulnumlanguages: UIntArray,
    pwszlanguagesbuffer: UShortArray?,
    pcchlanguagesbuffer: UIntArray,
): BOOL =
    GetUserPreferredUILanguages(dwflags, pulnumlanguages, 0L, pcchlanguagesbuffer)
