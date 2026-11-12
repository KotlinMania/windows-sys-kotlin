package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netshell

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public expect fun matchEnumTag(hmodule: Handle, pwcarg: Pcwstr, dwnumarg: UInt, penumtable: ConstPtr<TokenValue>, pdwvalue: MutPtr<UInt>): UInt

public expect fun matchToken(pwszusertoken: Pcwstr, pwszcmdtoken: Pcwstr): Bool

public expect fun preprocessCommand(hmodule: Handle, ppwcarguments: MutPtr<Pwstr>, dwcurrentindex: UInt, dwargcount: UInt, ptttags: MutPtr<TagType>, dwtagcount: UInt, dwminargs: UInt, dwmaxargs: UInt, pdwtagtype: MutPtr<UInt>): UInt

public expect fun printError(hmodule: Handle, dwerrid: UInt, vararg variadicArgs: Long): UInt

public expect fun printMessage(pwszformat: Pcwstr, vararg variadicArgs: Long): UInt

public expect fun printMessageFromModule(hmodule: Handle, dwmsgid: UInt, vararg variadicArgs: Long): UInt

public expect fun registerContext(pchildcontext: ConstPtr<NsContextAttributes>): UInt

public expect fun registerHelper(pguidparentcontext: ConstPtr<Guid>, pfnregistersubcontext: ConstPtr<NsHelperAttributes>): UInt
