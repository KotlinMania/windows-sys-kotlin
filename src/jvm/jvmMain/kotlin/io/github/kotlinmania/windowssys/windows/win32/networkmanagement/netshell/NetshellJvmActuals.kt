@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netshell

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

private object WindowsWin32NetworkmanagementNetshellJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netshell_MatchEnumTag(hmodule: Long, pwcarg: Long, dwnumarg: Int, penumtable: Long, pdwvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netshell_MatchToken(pwszusertoken: Long, pwszcmdtoken: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netshell_PreprocessCommand(hmodule: Long, ppwcarguments: Long, dwcurrentindex: Int, dwargcount: Int, ptttags: Long, dwtagcount: Int, dwminargs: Int, dwmaxargs: Int, pdwtagtype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netshell_RegisterContext(pchildcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netshell_RegisterHelper(pguidparentcontext: Long, pfnregistersubcontext: Long): Int
}

public actual fun MatchEnumTag(hmodule: HANDLE, pwcarg: PCWSTR, dwnumarg: UInt, penumtable: Long, pdwvalue: Long): UInt =
    WindowsWin32NetworkmanagementNetshellJniBridge.windowssys_windows_win32_networkmanagement_netshell_MatchEnumTag(hmodule, pwcarg, dwnumarg.toInt(), penumtable, pdwvalue).toUInt()

public actual fun MatchToken(pwszusertoken: PCWSTR, pwszcmdtoken: PCWSTR): BOOL =
    WindowsWin32NetworkmanagementNetshellJniBridge.windowssys_windows_win32_networkmanagement_netshell_MatchToken(pwszusertoken, pwszcmdtoken)

public actual fun PreprocessCommand(hmodule: HANDLE, ppwcarguments: Long, dwcurrentindex: UInt, dwargcount: UInt, ptttags: Long, dwtagcount: UInt, dwminargs: UInt, dwmaxargs: UInt, pdwtagtype: Long): UInt =
    WindowsWin32NetworkmanagementNetshellJniBridge.windowssys_windows_win32_networkmanagement_netshell_PreprocessCommand(hmodule, ppwcarguments, dwcurrentindex.toInt(), dwargcount.toInt(), ptttags, dwtagcount.toInt(), dwminargs.toInt(), dwmaxargs.toInt(), pdwtagtype).toUInt()

public actual fun PrintError(hmodule: HANDLE, dwerrid: UInt): UInt =
    0u

public actual fun PrintMessage(pwszformat: PCWSTR): UInt =
    0u

public actual fun PrintMessageFromModule(hmodule: HANDLE, dwmsgid: UInt): UInt =
    0u

public actual fun RegisterContext(pchildcontext: Long): UInt =
    WindowsWin32NetworkmanagementNetshellJniBridge.windowssys_windows_win32_networkmanagement_netshell_RegisterContext(pchildcontext).toUInt()

public actual fun RegisterHelper(pguidparentcontext: Long, pfnregistersubcontext: Long): UInt =
    WindowsWin32NetworkmanagementNetshellJniBridge.windowssys_windows_win32_networkmanagement_netshell_RegisterHelper(pguidparentcontext, pfnregistersubcontext).toUInt()
