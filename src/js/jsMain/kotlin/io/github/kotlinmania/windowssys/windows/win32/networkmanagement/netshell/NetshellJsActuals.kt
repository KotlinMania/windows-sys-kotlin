@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netshell

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

private val _windowsWin32NetworkmanagementNetshellNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun MatchEnumTag(hmodule: HANDLE, pwcarg: PCWSTR, dwnumarg: UInt, penumtable: Long, pdwvalue: Long): UInt =
    if (_windowsWin32NetworkmanagementNetshellNapiAddon != null) (_windowsWin32NetworkmanagementNetshellNapiAddon.windowssys_windows_win32_networkmanagement_netshell_MatchEnumTag(hmodule.toString(), pwcarg.toString(), dwnumarg.toInt(), penumtable.toString(), pdwvalue.toString()) as Int).toUInt() else 0u

public actual fun MatchToken(pwszusertoken: PCWSTR, pwszcmdtoken: PCWSTR): BOOL =
    if (_windowsWin32NetworkmanagementNetshellNapiAddon != null) (_windowsWin32NetworkmanagementNetshellNapiAddon.windowssys_windows_win32_networkmanagement_netshell_MatchToken(pwszusertoken.toString(), pwszcmdtoken.toString()) as Int) else 0

public actual fun PreprocessCommand(hmodule: HANDLE, ppwcarguments: Long, dwcurrentindex: UInt, dwargcount: UInt, ptttags: Long, dwtagcount: UInt, dwminargs: UInt, dwmaxargs: UInt, pdwtagtype: Long): UInt =
    if (_windowsWin32NetworkmanagementNetshellNapiAddon != null) (_windowsWin32NetworkmanagementNetshellNapiAddon.windowssys_windows_win32_networkmanagement_netshell_PreprocessCommand(hmodule.toString(), ppwcarguments.toString(), dwcurrentindex.toInt(), dwargcount.toInt(), ptttags.toString(), dwtagcount.toInt(), dwminargs.toInt(), dwmaxargs.toInt(), pdwtagtype.toString()) as Int).toUInt() else 0u

public actual fun PrintError(hmodule: HANDLE, dwerrid: UInt): UInt =
    0u

public actual fun PrintMessage(pwszformat: PCWSTR): UInt =
    0u

public actual fun PrintMessageFromModule(hmodule: HANDLE, dwmsgid: UInt): UInt =
    0u

public actual fun RegisterContext(pchildcontext: Long): UInt =
    if (_windowsWin32NetworkmanagementNetshellNapiAddon != null) (_windowsWin32NetworkmanagementNetshellNapiAddon.windowssys_windows_win32_networkmanagement_netshell_RegisterContext(pchildcontext.toString()) as Int).toUInt() else 0u

public actual fun RegisterHelper(pguidparentcontext: Long, pfnregistersubcontext: Long): UInt =
    if (_windowsWin32NetworkmanagementNetshellNapiAddon != null) (_windowsWin32NetworkmanagementNetshellNapiAddon.windowssys_windows_win32_networkmanagement_netshell_RegisterHelper(pguidparentcontext.toString(), pfnregistersubcontext.toString()) as Int).toUInt() else 0u
