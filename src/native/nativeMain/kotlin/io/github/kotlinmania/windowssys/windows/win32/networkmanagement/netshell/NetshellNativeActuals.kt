@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netshell

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun MatchEnumTag(hmodule: HANDLE, pwcarg: PCWSTR, dwnumarg: UInt, penumtable: Long, pdwvalue: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netshell.cinterop.windowssys_windows_win32_networkmanagement_netshell_MatchEnumTag(hmodule.toCPointer<ByteVar>(), pwcarg.toCPointer<ByteVar>(), dwnumarg, penumtable.toCPointer<ByteVar>(), pdwvalue.toCPointer<ByteVar>())

public actual fun MatchToken(pwszusertoken: PCWSTR, pwszcmdtoken: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netshell.cinterop.windowssys_windows_win32_networkmanagement_netshell_MatchToken(pwszusertoken.toCPointer<ByteVar>(), pwszcmdtoken.toCPointer<ByteVar>())

public actual fun PreprocessCommand(hmodule: HANDLE, ppwcarguments: Long, dwcurrentindex: UInt, dwargcount: UInt, ptttags: Long, dwtagcount: UInt, dwminargs: UInt, dwmaxargs: UInt, pdwtagtype: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netshell.cinterop.windowssys_windows_win32_networkmanagement_netshell_PreprocessCommand(hmodule.toCPointer<ByteVar>(), ppwcarguments.toCPointer<ByteVar>(), dwcurrentindex, dwargcount, ptttags.toCPointer<ByteVar>(), dwtagcount, dwminargs, dwmaxargs, pdwtagtype.toCPointer<ByteVar>())

public actual fun PrintError(hmodule: HANDLE, dwerrid: UInt): UInt =
    0u

public actual fun PrintMessage(pwszformat: PCWSTR): UInt =
    0u

public actual fun PrintMessageFromModule(hmodule: HANDLE, dwmsgid: UInt): UInt =
    0u

public actual fun RegisterContext(pchildcontext: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netshell.cinterop.windowssys_windows_win32_networkmanagement_netshell_RegisterContext(pchildcontext.toCPointer<ByteVar>())

public actual fun RegisterHelper(pguidparentcontext: Long, pfnregistersubcontext: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netshell.cinterop.windowssys_windows_win32_networkmanagement_netshell_RegisterHelper(pguidparentcontext.toCPointer<ByteVar>(), pfnregistersubcontext.toCPointer<ByteVar>())
