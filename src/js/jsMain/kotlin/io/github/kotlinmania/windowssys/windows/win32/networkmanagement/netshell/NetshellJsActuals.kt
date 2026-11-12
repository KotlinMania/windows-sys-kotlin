@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netshell

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private val windowsWin32NetworkmanagementNetshellNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun matchEnumTag(hmodule: Handle, pwcarg: Pcwstr, dwnumarg: UInt, penumtable: ConstPtr<TokenValue>, pdwvalue: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetshellNapiAddon != null) (windowsWin32NetworkmanagementNetshellNapiAddon.windowssysWindowsWin32NetworkmanagementNetshellMatchEnumTag(hmodule.rawAddress.toString(), pwcarg.rawAddress.toString(), dwnumarg.toInt(), penumtable.rawAddress.toString(), pdwvalue.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun matchToken(pwszusertoken: Pcwstr, pwszcmdtoken: Pcwstr): Bool =
    if (windowsWin32NetworkmanagementNetshellNapiAddon != null) (windowsWin32NetworkmanagementNetshellNapiAddon.windowssysWindowsWin32NetworkmanagementNetshellMatchToken(pwszusertoken.rawAddress.toString(), pwszcmdtoken.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preprocessCommand(hmodule: Handle, ppwcarguments: MutPtr<Pwstr>, dwcurrentindex: UInt, dwargcount: UInt, ptttags: MutPtr<TagType>, dwtagcount: UInt, dwminargs: UInt, dwmaxargs: UInt, pdwtagtype: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetshellNapiAddon != null) (windowsWin32NetworkmanagementNetshellNapiAddon.windowssysWindowsWin32NetworkmanagementNetshellPreprocessCommand(hmodule.rawAddress.toString(), ppwcarguments.rawAddress.toString(), dwcurrentindex.toInt(), dwargcount.toInt(), ptttags.rawAddress.toString(), dwtagcount.toInt(), dwminargs.toInt(), dwmaxargs.toInt(), pdwtagtype.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun printError(hmodule: Handle, dwerrid: UInt, vararg variadicArgs: Long): UInt =
    if (windowsWin32NetworkmanagementNetshellNapiAddon != null) (windowsWin32NetworkmanagementNetshellNapiAddon.windowssysWindowsWin32NetworkmanagementNetshellPrintError(hmodule.rawAddress.toString(), dwerrid.toInt(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun printMessage(pwszformat: Pcwstr, vararg variadicArgs: Long): UInt =
    if (windowsWin32NetworkmanagementNetshellNapiAddon != null) (windowsWin32NetworkmanagementNetshellNapiAddon.windowssysWindowsWin32NetworkmanagementNetshellPrintMessage(pwszformat.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun printMessageFromModule(hmodule: Handle, dwmsgid: UInt, vararg variadicArgs: Long): UInt =
    if (windowsWin32NetworkmanagementNetshellNapiAddon != null) (windowsWin32NetworkmanagementNetshellNapiAddon.windowssysWindowsWin32NetworkmanagementNetshellPrintMessageFromModule(hmodule.rawAddress.toString(), dwmsgid.toInt(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerContext(pchildcontext: ConstPtr<NsContextAttributes>): UInt =
    if (windowsWin32NetworkmanagementNetshellNapiAddon != null) (windowsWin32NetworkmanagementNetshellNapiAddon.windowssysWindowsWin32NetworkmanagementNetshellRegisterContext(pchildcontext.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerHelper(pguidparentcontext: ConstPtr<Guid>, pfnregistersubcontext: ConstPtr<NsHelperAttributes>): UInt =
    if (windowsWin32NetworkmanagementNetshellNapiAddon != null) (windowsWin32NetworkmanagementNetshellNapiAddon.windowssysWindowsWin32NetworkmanagementNetshellRegisterHelper(pguidparentcontext.rawAddress.toString(), pfnregistersubcontext.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
