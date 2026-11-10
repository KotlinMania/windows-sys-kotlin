@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netshell

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private val _windowsWin32NetworkmanagementNetshellNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun matchEnumTag(hmodule: Handle, pwcarg: Pcwstr, dwnumarg: UInt, penumtable: COpaquePointer?, pdwvalue: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetshellNapiAddon != null) (_windowsWin32NetworkmanagementNetshellNapiAddon.windowssys_windows_win32_networkmanagement_netshell_matchEnumTag((hmodule?.value ?: 0L).toString(), (pwcarg?.value ?: 0L).toString(), dwnumarg.toInt(), (penumtable?.value ?: 0L).toString(), (pdwvalue?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun matchToken(pwszusertoken: Pcwstr, pwszcmdtoken: Pcwstr): Bool =
    if (_windowsWin32NetworkmanagementNetshellNapiAddon != null) (_windowsWin32NetworkmanagementNetshellNapiAddon.windowssys_windows_win32_networkmanagement_netshell_matchToken((pwszusertoken?.value ?: 0L).toString(), (pwszcmdtoken?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun preprocessCommand(hmodule: Handle, ppwcarguments: COpaquePointer?, dwcurrentindex: UInt, dwargcount: UInt, ptttags: COpaquePointer?, dwtagcount: UInt, dwminargs: UInt, dwmaxargs: UInt, pdwtagtype: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetshellNapiAddon != null) (_windowsWin32NetworkmanagementNetshellNapiAddon.windowssys_windows_win32_networkmanagement_netshell_preprocessCommand((hmodule?.value ?: 0L).toString(), (ppwcarguments?.value ?: 0L).toString(), dwcurrentindex.toInt(), dwargcount.toInt(), (ptttags?.value ?: 0L).toString(), dwtagcount.toInt(), dwminargs.toInt(), dwmaxargs.toInt(), (pdwtagtype?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun printError(hmodule: Handle, dwerrid: UInt, vararg variadicArgs: Long): UInt =
    if (_windowsWin32NetworkmanagementNetshellNapiAddon != null) (_windowsWin32NetworkmanagementNetshellNapiAddon.windowssys_windows_win32_networkmanagement_netshell_printError((hmodule?.value ?: 0L).toString(), dwerrid.toInt(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun printMessage(pwszformat: Pcwstr, vararg variadicArgs: Long): UInt =
    if (_windowsWin32NetworkmanagementNetshellNapiAddon != null) (_windowsWin32NetworkmanagementNetshellNapiAddon.windowssys_windows_win32_networkmanagement_netshell_printMessage((pwszformat?.value ?: 0L).toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun printMessageFromModule(hmodule: Handle, dwmsgid: UInt, vararg variadicArgs: Long): UInt =
    if (_windowsWin32NetworkmanagementNetshellNapiAddon != null) (_windowsWin32NetworkmanagementNetshellNapiAddon.windowssys_windows_win32_networkmanagement_netshell_printMessageFromModule((hmodule?.value ?: 0L).toString(), dwmsgid.toInt(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerContext(pchildcontext: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetshellNapiAddon != null) (_windowsWin32NetworkmanagementNetshellNapiAddon.windowssys_windows_win32_networkmanagement_netshell_registerContext((pchildcontext?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerHelper(pguidparentcontext: COpaquePointer?, pfnregistersubcontext: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementNetshellNapiAddon != null) (_windowsWin32NetworkmanagementNetshellNapiAddon.windowssys_windows_win32_networkmanagement_netshell_registerHelper((pguidparentcontext?.value ?: 0L).toString(), (pfnregistersubcontext?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
