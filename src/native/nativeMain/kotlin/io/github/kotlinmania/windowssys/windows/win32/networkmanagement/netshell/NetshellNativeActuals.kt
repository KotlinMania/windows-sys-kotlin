@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netshell

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netshell.cinterop.windowssys_windows_win32_networkmanagement_netshell_matchEnumTag
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netshell.cinterop.windowssys_windows_win32_networkmanagement_netshell_matchToken
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netshell.cinterop.windowssys_windows_win32_networkmanagement_netshell_preprocessCommand
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netshell.cinterop.windowssys_windows_win32_networkmanagement_netshell_printError
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netshell.cinterop.windowssys_windows_win32_networkmanagement_netshell_printMessage
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netshell.cinterop.windowssys_windows_win32_networkmanagement_netshell_printMessageFromModule
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netshell.cinterop.windowssys_windows_win32_networkmanagement_netshell_registerContext
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netshell.cinterop.windowssys_windows_win32_networkmanagement_netshell_registerHelper
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun matchEnumTag(hmodule: Handle, pwcarg: Pcwstr, dwnumarg: UInt, penumtable: COpaquePointer?, pdwvalue: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_netshell_matchEnumTag(hmodule?.value?.toCPointer<ByteVar>(), pwcarg?.value?.toCPointer<ByteVar>(), dwnumarg, penumtable?.value?.toCPointer<ByteVar>(), pdwvalue?.value?.toCPointer<ByteVar>())

public actual fun matchToken(pwszusertoken: Pcwstr, pwszcmdtoken: Pcwstr): Bool =
    windowssys_windows_win32_networkmanagement_netshell_matchToken(pwszusertoken?.value?.toCPointer<ByteVar>(), pwszcmdtoken?.value?.toCPointer<ByteVar>())

public actual fun preprocessCommand(hmodule: Handle, ppwcarguments: COpaquePointer?, dwcurrentindex: UInt, dwargcount: UInt, ptttags: COpaquePointer?, dwtagcount: UInt, dwminargs: UInt, dwmaxargs: UInt, pdwtagtype: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_netshell_preprocessCommand(hmodule?.value?.toCPointer<ByteVar>(), ppwcarguments?.value?.toCPointer<ByteVar>(), dwcurrentindex, dwargcount, ptttags?.value?.toCPointer<ByteVar>(), dwtagcount, dwminargs, dwmaxargs, pdwtagtype?.value?.toCPointer<ByteVar>())

public actual fun printError(hmodule: Handle, dwerrid: UInt, vararg variadicArgs: Long): UInt =
    windowssys_windows_win32_networkmanagement_netshell_printError(hmodule?.value?.toCPointer<ByteVar>(), dwerrid, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun printMessage(pwszformat: Pcwstr, vararg variadicArgs: Long): UInt =
    windowssys_windows_win32_networkmanagement_netshell_printMessage(pwszformat?.value?.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun printMessageFromModule(hmodule: Handle, dwmsgid: UInt, vararg variadicArgs: Long): UInt =
    windowssys_windows_win32_networkmanagement_netshell_printMessageFromModule(hmodule?.value?.toCPointer<ByteVar>(), dwmsgid, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun registerContext(pchildcontext: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_netshell_registerContext(pchildcontext?.value?.toCPointer<ByteVar>())

public actual fun registerHelper(pguidparentcontext: COpaquePointer?, pfnregistersubcontext: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_netshell_registerHelper(pguidparentcontext?.value?.toCPointer<ByteVar>(), pfnregistersubcontext?.value?.toCPointer<ByteVar>())
