@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netshell

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private object WindowsWin32NetworkmanagementNetshellJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netshell_matchEnumTag(hmodule: Long, pwcarg: Long, dwnumarg: Int, penumtable: Long, pdwvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netshell_matchToken(pwszusertoken: Long, pwszcmdtoken: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netshell_preprocessCommand(hmodule: Long, ppwcarguments: Long, dwcurrentindex: Int, dwargcount: Int, ptttags: Long, dwtagcount: Int, dwminargs: Int, dwmaxargs: Int, pdwtagtype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netshell_printError(hmodule: Long, dwerrid: Int, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netshell_printMessage(pwszformat: Long, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netshell_printMessageFromModule(hmodule: Long, dwmsgid: Int, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netshell_registerContext(pchildcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_netshell_registerHelper(pguidparentcontext: Long, pfnregistersubcontext: Long): Int
}

public actual fun matchEnumTag(hmodule: Handle, pwcarg: Pcwstr, dwnumarg: UInt, penumtable: COpaquePointer?, pdwvalue: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetshellJniBridge.windowssys_windows_win32_networkmanagement_netshell_matchEnumTag((hmodule?.value ?: 0L), (pwcarg?.value ?: 0L), dwnumarg.toInt(), (penumtable?.value ?: 0L), (pdwvalue?.value ?: 0L)).toUInt()

public actual fun matchToken(pwszusertoken: Pcwstr, pwszcmdtoken: Pcwstr): Bool =
    WindowsWin32NetworkmanagementNetshellJniBridge.windowssys_windows_win32_networkmanagement_netshell_matchToken((pwszusertoken?.value ?: 0L), (pwszcmdtoken?.value ?: 0L))

public actual fun preprocessCommand(hmodule: Handle, ppwcarguments: COpaquePointer?, dwcurrentindex: UInt, dwargcount: UInt, ptttags: COpaquePointer?, dwtagcount: UInt, dwminargs: UInt, dwmaxargs: UInt, pdwtagtype: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetshellJniBridge.windowssys_windows_win32_networkmanagement_netshell_preprocessCommand((hmodule?.value ?: 0L), (ppwcarguments?.value ?: 0L), dwcurrentindex.toInt(), dwargcount.toInt(), (ptttags?.value ?: 0L), dwtagcount.toInt(), dwminargs.toInt(), dwmaxargs.toInt(), (pdwtagtype?.value ?: 0L)).toUInt()

public actual fun printError(hmodule: Handle, dwerrid: UInt, vararg variadicArgs: Long): UInt =
    WindowsWin32NetworkmanagementNetshellJniBridge.windowssys_windows_win32_networkmanagement_netshell_printError((hmodule?.value ?: 0L), dwerrid.toInt(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L).toUInt()

public actual fun printMessage(pwszformat: Pcwstr, vararg variadicArgs: Long): UInt =
    WindowsWin32NetworkmanagementNetshellJniBridge.windowssys_windows_win32_networkmanagement_netshell_printMessage((pwszformat?.value ?: 0L), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L).toUInt()

public actual fun printMessageFromModule(hmodule: Handle, dwmsgid: UInt, vararg variadicArgs: Long): UInt =
    WindowsWin32NetworkmanagementNetshellJniBridge.windowssys_windows_win32_networkmanagement_netshell_printMessageFromModule((hmodule?.value ?: 0L), dwmsgid.toInt(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L).toUInt()

public actual fun registerContext(pchildcontext: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetshellJniBridge.windowssys_windows_win32_networkmanagement_netshell_registerContext((pchildcontext?.value ?: 0L)).toUInt()

public actual fun registerHelper(pguidparentcontext: COpaquePointer?, pfnregistersubcontext: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementNetshellJniBridge.windowssys_windows_win32_networkmanagement_netshell_registerHelper((pguidparentcontext?.value ?: 0L), (pfnregistersubcontext?.value ?: 0L)).toUInt()
