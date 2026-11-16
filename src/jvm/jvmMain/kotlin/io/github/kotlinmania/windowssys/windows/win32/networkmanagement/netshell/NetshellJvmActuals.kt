@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netshell

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private object WindowsWin32NetworkmanagementNetshellJniBridge {
    init {
        loadNativeLibrary()
    }

    private fun loadNativeLibrary() {
        val osRaw = System.getProperty("os.name", "").lowercase()
        val archRaw = System.getProperty("os.arch", "").lowercase()
        val hostPlatform =
            when {
                osRaw.contains("win") -> "windows"
                osRaw.contains("mac") || osRaw.contains("darwin") -> "macos"
                else -> "linux"
            }
        val hostArch =
            when {
                archRaw == "aarch64" || archRaw == "arm64" -> "aarch64"
                archRaw == "amd64" || archRaw == "x86_64" -> "x86_64"
                else -> archRaw
            }
        val libFileName =
            when (hostPlatform) {
                "windows" -> "windowssys_jni.dll"
                "macos" -> "libwindowssys_jni.dylib"
                else -> "libwindowssys_jni.so"
            }
        val pathSep = System.getProperty("path.separator", ":")
        val libPathProp = System.getProperty("java.library.path", "")
        for (dirEntry in libPathProp.split(pathSep)) {
            if (dirEntry.isEmpty()) continue
            val candidate = java.io.File(dirEntry, libFileName)
            if (candidate.isFile) {
                System.load(candidate.absolutePath)
                return
            }
        }
        val resourcePath = "io/github/kotlinmania/windowssys/native/$hostPlatform-$hostArch/$libFileName"
        val stream = WindowsWin32NetworkmanagementNetshellJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
        if (stream != null) {
            val suffix = "." + libFileName.substringAfterLast('.')
            val extracted =
                java.nio.file.Files
                    .createTempFile("windowssys_jni-", suffix)
                    .toFile()
            extracted.deleteOnExit()
            stream.use { input ->
                extracted.outputStream().use { output ->
                    input.copyTo(output)
                }
            }
            System.load(extracted.absolutePath)
            return
        }
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

public actual fun matchEnumTag(hmodule: Handle, pwcarg: Pcwstr, dwnumarg: UInt, penumtable: ConstPtr, pdwvalue: MutPtr): UInt =
    WindowsWin32NetworkmanagementNetshellJniBridge.windowssysWindowsWin32NetworkmanagementNetshellMatchEnumTag(hmodule.rawAddress, pwcarg.rawAddress, dwnumarg.toInt(), penumtable.rawAddress, pdwvalue.rawAddress).toUInt()

public actual fun matchToken(pwszusertoken: Pcwstr, pwszcmdtoken: Pcwstr): Bool =
    WindowsWin32NetworkmanagementNetshellJniBridge.windowssysWindowsWin32NetworkmanagementNetshellMatchToken(pwszusertoken.rawAddress, pwszcmdtoken.rawAddress)

public actual fun preprocessCommand(hmodule: Handle, ppwcarguments: MutPtr, dwcurrentindex: UInt, dwargcount: UInt, ptttags: MutPtr, dwtagcount: UInt, dwminargs: UInt, dwmaxargs: UInt, pdwtagtype: MutPtr): UInt =
    WindowsWin32NetworkmanagementNetshellJniBridge.windowssysWindowsWin32NetworkmanagementNetshellPreprocessCommand(hmodule.rawAddress, ppwcarguments.rawAddress, dwcurrentindex.toInt(), dwargcount.toInt(), ptttags.rawAddress, dwtagcount.toInt(), dwminargs.toInt(), dwmaxargs.toInt(), pdwtagtype.rawAddress).toUInt()

public actual fun printError(hmodule: Handle, dwerrid: UInt, vararg variadicArgs: Long): UInt =
    WindowsWin32NetworkmanagementNetshellJniBridge.windowssysWindowsWin32NetworkmanagementNetshellPrintError(hmodule.rawAddress, dwerrid.toInt(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L).toUInt()

public actual fun printMessage(pwszformat: Pcwstr, vararg variadicArgs: Long): UInt =
    WindowsWin32NetworkmanagementNetshellJniBridge.windowssysWindowsWin32NetworkmanagementNetshellPrintMessage(pwszformat.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L).toUInt()

public actual fun printMessageFromModule(hmodule: Handle, dwmsgid: UInt, vararg variadicArgs: Long): UInt =
    WindowsWin32NetworkmanagementNetshellJniBridge.windowssysWindowsWin32NetworkmanagementNetshellPrintMessageFromModule(hmodule.rawAddress, dwmsgid.toInt(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L).toUInt()

public actual fun registerContext(pchildcontext: ConstPtr): UInt =
    WindowsWin32NetworkmanagementNetshellJniBridge.windowssysWindowsWin32NetworkmanagementNetshellRegisterContext(pchildcontext.rawAddress).toUInt()

public actual fun registerHelper(pguidparentcontext: ConstPtr, pfnregistersubcontext: ConstPtr): UInt =
    WindowsWin32NetworkmanagementNetshellJniBridge.windowssysWindowsWin32NetworkmanagementNetshellRegisterHelper(pguidparentcontext.rawAddress, pfnregistersubcontext.rawAddress).toUInt()
