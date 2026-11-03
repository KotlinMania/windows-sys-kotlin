// port-lint: source Windows/Win32/Globalization/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.globalization

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PWSTR

public fun GetUserPreferredUILanguages(
    dwflags: UInt,
    pulnumlanguages: UIntArray,
    pwszlanguagesbuffer: PWSTR,
    pcchlanguagesbuffer: UIntArray,
): BOOL =
    throw UnsupportedOperationException("GetUserPreferredUILanguages requires Windows N-API addon")

public fun GetUserPreferredUILanguages(
    dwflags: UInt,
    pulnumlanguages: UIntArray,
    pwszlanguagesbuffer: UShortArray?,
    pcchlanguagesbuffer: UIntArray,
): BOOL =
    throw UnsupportedOperationException("GetUserPreferredUILanguages requires Windows N-API addon")
