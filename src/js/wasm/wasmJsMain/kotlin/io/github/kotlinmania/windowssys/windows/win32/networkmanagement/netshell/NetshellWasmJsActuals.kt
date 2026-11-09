@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netshell

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public actual fun MatchEnumTag(hmodule: HANDLE, pwcarg: PCWSTR, dwnumarg: UInt, penumtable: Long, pdwvalue: Long): UInt =
    0u

public actual fun MatchToken(pwszusertoken: PCWSTR, pwszcmdtoken: PCWSTR): BOOL =
    0

public actual fun PreprocessCommand(hmodule: HANDLE, ppwcarguments: Long, dwcurrentindex: UInt, dwargcount: UInt, ptttags: Long, dwtagcount: UInt, dwminargs: UInt, dwmaxargs: UInt, pdwtagtype: Long): UInt =
    0u

public actual fun PrintError(hmodule: HANDLE, dwerrid: UInt): UInt =
    0u

public actual fun PrintMessage(pwszformat: PCWSTR): UInt =
    0u

public actual fun PrintMessageFromModule(hmodule: HANDLE, dwmsgid: UInt): UInt =
    0u

public actual fun RegisterContext(pchildcontext: Long): UInt =
    0u

public actual fun RegisterHelper(pguidparentcontext: Long, pfnregistersubcontext: Long): UInt =
    0u
