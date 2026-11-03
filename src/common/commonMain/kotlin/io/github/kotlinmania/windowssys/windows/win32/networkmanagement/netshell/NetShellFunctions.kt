package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netshell

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR

public fun MatchEnumTag(hmodule: Foundation.HANDLE, pwcarg: PCWSTR, dwnumarg: UInt, penumtable: Long, pdwvalue: Long): UInt {
    return Win32DynamicFfi.invoke("netsh.dll", "MatchEnumTag", longArrayOf(Win32DynamicFfi.objectSlot(hmodule), pwcarg, dwnumarg.toLong(), penumtable, pdwvalue)).toUInt()
}

public fun MatchToken(pwszusertoken: PCWSTR, pwszcmdtoken: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("netsh.dll", "MatchToken", longArrayOf(pwszusertoken, pwszcmdtoken)).toInt()
}

public fun PreprocessCommand(hmodule: Foundation.HANDLE, ppwcarguments: Long, dwcurrentindex: UInt, dwargcount: UInt, ptttags: Long, dwtagcount: UInt, dwminargs: UInt, dwmaxargs: UInt, pdwtagtype: Long): UInt {
    return Win32DynamicFfi.invoke("netsh.dll", "PreprocessCommand", longArrayOf(Win32DynamicFfi.objectSlot(hmodule), ppwcarguments, dwcurrentindex.toLong(), dwargcount.toLong(), ptttags, dwtagcount.toLong(), dwminargs.toLong(), dwmaxargs.toLong(), pdwtagtype)).toUInt()
}

public fun PrintError(hmodule: Foundation.HANDLE, dwerrid: UInt, vararg variadicArgs: Long): UInt {
    return Win32DynamicFfi.invoke("netsh.dll", "PrintError", longArrayOf(Win32DynamicFfi.objectSlot(hmodule), dwerrid.toLong()) + variadicArgs).toUInt()
}

public fun PrintMessage(pwszformat: PCWSTR, vararg variadicArgs: Long): UInt {
    return Win32DynamicFfi.invoke("netsh.dll", "PrintMessage", longArrayOf(pwszformat) + variadicArgs).toUInt()
}

public fun PrintMessageFromModule(hmodule: Foundation.HANDLE, dwmsgid: UInt, vararg variadicArgs: Long): UInt {
    return Win32DynamicFfi.invoke("netsh.dll", "PrintMessageFromModule", longArrayOf(Win32DynamicFfi.objectSlot(hmodule), dwmsgid.toLong()) + variadicArgs).toUInt()
}

public fun RegisterContext(pchildcontext: Long): UInt {
    return Win32DynamicFfi.invoke("netsh.dll", "RegisterContext", longArrayOf(pchildcontext)).toUInt()
}

public fun RegisterHelper(pguidparentcontext: Long, pfnregistersubcontext: Long): UInt {
    return Win32DynamicFfi.invoke("netsh.dll", "RegisterHelper", longArrayOf(pguidparentcontext, pfnregistersubcontext)).toUInt()
}
