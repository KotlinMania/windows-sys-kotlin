@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netshell

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netshell.cinterop.windowssysWindowsWin32NetworkmanagementNetshellMatchEnumTag
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netshell.cinterop.windowssysWindowsWin32NetworkmanagementNetshellMatchToken
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netshell.cinterop.windowssysWindowsWin32NetworkmanagementNetshellPreprocessCommand
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netshell.cinterop.windowssysWindowsWin32NetworkmanagementNetshellPrintError
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netshell.cinterop.windowssysWindowsWin32NetworkmanagementNetshellPrintMessage
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netshell.cinterop.windowssysWindowsWin32NetworkmanagementNetshellPrintMessageFromModule
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netshell.cinterop.windowssysWindowsWin32NetworkmanagementNetshellRegisterContext
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netshell.cinterop.windowssysWindowsWin32NetworkmanagementNetshellRegisterHelper
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun matchEnumTag(hmodule: Handle, pwcarg: Pcwstr, dwnumarg: UInt, penumtable: ConstPtr<TokenValue>, pdwvalue: MutPtr<UInt>): UInt =
    windowssysWindowsWin32NetworkmanagementNetshellMatchEnumTag(hmodule.rawAddress.toCPointer<ByteVar>(), pwcarg.rawAddress.toCPointer<ByteVar>(), dwnumarg, penumtable.rawAddress.toCPointer<ByteVar>(), pdwvalue.rawAddress.toCPointer<ByteVar>())

public actual fun matchToken(pwszusertoken: Pcwstr, pwszcmdtoken: Pcwstr): Bool =
    windowssysWindowsWin32NetworkmanagementNetshellMatchToken(pwszusertoken.rawAddress.toCPointer<ByteVar>(), pwszcmdtoken.rawAddress.toCPointer<ByteVar>())

public actual fun preprocessCommand(hmodule: Handle, ppwcarguments: MutPtr<Pwstr>, dwcurrentindex: UInt, dwargcount: UInt, ptttags: MutPtr<TagType>, dwtagcount: UInt, dwminargs: UInt, dwmaxargs: UInt, pdwtagtype: MutPtr<UInt>): UInt =
    windowssysWindowsWin32NetworkmanagementNetshellPreprocessCommand(hmodule.rawAddress.toCPointer<ByteVar>(), ppwcarguments.rawAddress.toCPointer<ByteVar>(), dwcurrentindex, dwargcount, ptttags.rawAddress.toCPointer<ByteVar>(), dwtagcount, dwminargs, dwmaxargs, pdwtagtype.rawAddress.toCPointer<ByteVar>())

public actual fun printError(hmodule: Handle, dwerrid: UInt, vararg variadicArgs: Long): UInt =
    windowssysWindowsWin32NetworkmanagementNetshellPrintError(hmodule.rawAddress.toCPointer<ByteVar>(), dwerrid, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun printMessage(pwszformat: Pcwstr, vararg variadicArgs: Long): UInt =
    windowssysWindowsWin32NetworkmanagementNetshellPrintMessage(pwszformat.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun printMessageFromModule(hmodule: Handle, dwmsgid: UInt, vararg variadicArgs: Long): UInt =
    windowssysWindowsWin32NetworkmanagementNetshellPrintMessageFromModule(hmodule.rawAddress.toCPointer<ByteVar>(), dwmsgid, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun registerContext(pchildcontext: ConstPtr<NsContextAttributes>): UInt =
    windowssysWindowsWin32NetworkmanagementNetshellRegisterContext(pchildcontext.rawAddress.toCPointer<ByteVar>())

public actual fun registerHelper(pguidparentcontext: ConstPtr<Guid>, pfnregistersubcontext: ConstPtr<NsHelperAttributes>): UInt =
    windowssysWindowsWin32NetworkmanagementNetshellRegisterHelper(pguidparentcontext.rawAddress.toCPointer<ByteVar>(), pfnregistersubcontext.rawAddress.toCPointer<ByteVar>())
