@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netshell

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32NetworkmanagementNetshellNapiAddon(): Boolean

private val windowsWin32NetworkmanagementNetshellNapiAvailable: Boolean = initWindowsWin32NetworkmanagementNetshellNapiAddon()

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetshellMatchEnumTag(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetshellMatchEnumTag(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetshellMatchToken(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetshellMatchToken(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetshellPreprocessCommand(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetshellPreprocessCommand(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: Int, p6: Int, p7: Int, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetshellPrintError(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetshellPrintError(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetshellPrintMessage(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetshellPrintMessage(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetshellPrintMessageFromModule(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetshellPrintMessageFromModule(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetshellRegisterContext(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetshellRegisterContext(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementNetshellRegisterHelper(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementNetshellRegisterHelper(p0: String, p1: String): Int

public actual fun matchEnumTag(hmodule: Handle, pwcarg: Pcwstr, dwnumarg: UInt, penumtable: ConstPtr<TokenValue>, pdwvalue: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetshellNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetshellMatchEnumTag(hmodule.rawAddress.toString(), pwcarg.rawAddress.toString(), dwnumarg.toInt(), penumtable.rawAddress.toString(), pdwvalue.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun matchToken(pwszusertoken: Pcwstr, pwszcmdtoken: Pcwstr): Bool =
    if (windowsWin32NetworkmanagementNetshellNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetshellMatchToken(pwszusertoken.rawAddress.toString(), pwszcmdtoken.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preprocessCommand(hmodule: Handle, ppwcarguments: MutPtr<Pwstr>, dwcurrentindex: UInt, dwargcount: UInt, ptttags: MutPtr<TagType>, dwtagcount: UInt, dwminargs: UInt, dwmaxargs: UInt, pdwtagtype: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementNetshellNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetshellPreprocessCommand(hmodule.rawAddress.toString(), ppwcarguments.rawAddress.toString(), dwcurrentindex.toInt(), dwargcount.toInt(), ptttags.rawAddress.toString(), dwtagcount.toInt(), dwminargs.toInt(), dwmaxargs.toInt(), pdwtagtype.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun printError(hmodule: Handle, dwerrid: UInt, vararg variadicArgs: Long): UInt =
    if (windowsWin32NetworkmanagementNetshellNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetshellPrintError(hmodule.rawAddress.toString(), dwerrid.toInt(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun printMessage(pwszformat: Pcwstr, vararg variadicArgs: Long): UInt =
    if (windowsWin32NetworkmanagementNetshellNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetshellPrintMessage(pwszformat.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun printMessageFromModule(hmodule: Handle, dwmsgid: UInt, vararg variadicArgs: Long): UInt =
    if (windowsWin32NetworkmanagementNetshellNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetshellPrintMessageFromModule(hmodule.rawAddress.toString(), dwmsgid.toInt(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerContext(pchildcontext: ConstPtr<NsContextAttributes>): UInt =
    if (windowsWin32NetworkmanagementNetshellNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetshellRegisterContext(pchildcontext.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerHelper(pguidparentcontext: ConstPtr<Guid>, pfnregistersubcontext: ConstPtr<NsHelperAttributes>): UInt =
    if (windowsWin32NetworkmanagementNetshellNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementNetshellRegisterHelper(pguidparentcontext.rawAddress.toString(), pfnregistersubcontext.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
