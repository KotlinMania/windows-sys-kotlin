package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netshell

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public expect fun MatchEnumTag(hmodule: HANDLE, pwcarg: PCWSTR, dwnumarg: UInt, penumtable: Long, pdwvalue: Long): UInt

public expect fun MatchToken(pwszusertoken: PCWSTR, pwszcmdtoken: PCWSTR): BOOL

public expect fun PreprocessCommand(hmodule: HANDLE, ppwcarguments: Long, dwcurrentindex: UInt, dwargcount: UInt, ptttags: Long, dwtagcount: UInt, dwminargs: UInt, dwmaxargs: UInt, pdwtagtype: Long): UInt

public expect fun PrintError(hmodule: HANDLE, dwerrid: UInt, vararg variadicArgs: Long): UInt

public expect fun PrintMessage(pwszformat: PCWSTR, vararg variadicArgs: Long): UInt

public expect fun PrintMessageFromModule(hmodule: HANDLE, dwmsgid: UInt, vararg variadicArgs: Long): UInt

public expect fun RegisterContext(pchildcontext: Long): UInt

public expect fun RegisterHelper(pguidparentcontext: Long, pfnregistersubcontext: Long): UInt
