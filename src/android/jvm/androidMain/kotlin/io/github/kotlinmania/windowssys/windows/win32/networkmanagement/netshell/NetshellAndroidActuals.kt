@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netshell

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private object WindowsWin32NetworkmanagementNetshellJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetshellMatchEnumTag(hmodule: Long, pwcarg: Long, dwnumarg: Int, penumtable: Long, pdwvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetshellMatchToken(pwszusertoken: Long, pwszcmdtoken: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetshellPreprocessCommand(hmodule: Long, ppwcarguments: Long, dwcurrentindex: Int, dwargcount: Int, ptttags: Long, dwtagcount: Int, dwminargs: Int, dwmaxargs: Int, pdwtagtype: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetshellPrintError(hmodule: Long, dwerrid: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetshellPrintMessage(pwszformat: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetshellPrintMessageFromModule(hmodule: Long, dwmsgid: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetshellRegisterContext(pchildcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetshellRegisterHelper(pguidparentcontext: Long, pfnregistersubcontext: Long): Int
}

public actual fun matchEnumTag(hmodule: Handle, pwcarg: Pcwstr, dwnumarg: UInt, penumtable: ConstPtr<TokenValue>, pdwvalue: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementNetshellJniBridge.windowssysWindowsWin32NetworkmanagementNetshellMatchEnumTag(hmodule.rawAddress, pwcarg.rawAddress, dwnumarg.toInt(), penumtable.rawAddress, pdwvalue.rawAddress).toUInt()

public actual fun matchToken(pwszusertoken: Pcwstr, pwszcmdtoken: Pcwstr): Bool =
    WindowsWin32NetworkmanagementNetshellJniBridge.windowssysWindowsWin32NetworkmanagementNetshellMatchToken(pwszusertoken.rawAddress, pwszcmdtoken.rawAddress)

public actual fun preprocessCommand(hmodule: Handle, ppwcarguments: MutPtr<Pwstr>, dwcurrentindex: UInt, dwargcount: UInt, ptttags: MutPtr<TagType>, dwtagcount: UInt, dwminargs: UInt, dwmaxargs: UInt, pdwtagtype: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementNetshellJniBridge.windowssysWindowsWin32NetworkmanagementNetshellPreprocessCommand(hmodule.rawAddress, ppwcarguments.rawAddress, dwcurrentindex.toInt(), dwargcount.toInt(), ptttags.rawAddress, dwtagcount.toInt(), dwminargs.toInt(), dwmaxargs.toInt(), pdwtagtype.rawAddress).toUInt()

public actual fun printError(hmodule: Handle, dwerrid: UInt, vararg variadicArgs: Long): UInt =
    WindowsWin32NetworkmanagementNetshellJniBridge.windowssysWindowsWin32NetworkmanagementNetshellPrintError(hmodule.rawAddress, dwerrid.toInt(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L).toUInt()

public actual fun printMessage(pwszformat: Pcwstr, vararg variadicArgs: Long): UInt =
    WindowsWin32NetworkmanagementNetshellJniBridge.windowssysWindowsWin32NetworkmanagementNetshellPrintMessage(pwszformat.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L).toUInt()

public actual fun printMessageFromModule(hmodule: Handle, dwmsgid: UInt, vararg variadicArgs: Long): UInt =
    WindowsWin32NetworkmanagementNetshellJniBridge.windowssysWindowsWin32NetworkmanagementNetshellPrintMessageFromModule(hmodule.rawAddress, dwmsgid.toInt(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L).toUInt()

public actual fun registerContext(pchildcontext: ConstPtr<NsContextAttributes>): UInt =
    WindowsWin32NetworkmanagementNetshellJniBridge.windowssysWindowsWin32NetworkmanagementNetshellRegisterContext(pchildcontext.rawAddress).toUInt()

public actual fun registerHelper(pguidparentcontext: ConstPtr<Guid>, pfnregistersubcontext: ConstPtr<NsHelperAttributes>): UInt =
    WindowsWin32NetworkmanagementNetshellJniBridge.windowssysWindowsWin32NetworkmanagementNetshellRegisterHelper(pguidparentcontext.rawAddress, pfnregistersubcontext.rawAddress).toUInt()
