@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.mailslots

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32SystemMailslotsNapiAddon(): Boolean

private val _windowsWin32SystemMailslotsNapiAvailable: Boolean = _initWindowsWin32SystemMailslotsNapiAddon()

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_mailslots_createMailslotA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_mailslots_createMailslotA(p0: String, p1: Int, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_mailslots_createMailslotW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_mailslots_createMailslotW(p0: String, p1: Int, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_mailslots_getMailslotInfo(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_mailslots_getMailslotInfo(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_mailslots_setMailslotInfo(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_mailslots_setMailslotInfo(p0: String, p1: Int): Int

public actual fun createMailslotA(lpname: Pcstr, nmaxmessagesize: UInt, lreadtimeout: UInt, lpsecurityattributes: COpaquePointer?): Handle =
    if (_windowsWin32SystemMailslotsNapiAvailable) _wasm_windowssys_windows_win32_system_mailslots_createMailslotA((lpname?.value ?: 0L).toString(), nmaxmessagesize.toInt(), lreadtimeout.toInt(), (lpsecurityattributes?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createMailslotW(lpname: Pcwstr, nmaxmessagesize: UInt, lreadtimeout: UInt, lpsecurityattributes: COpaquePointer?): Handle =
    if (_windowsWin32SystemMailslotsNapiAvailable) _wasm_windowssys_windows_win32_system_mailslots_createMailslotW((lpname?.value ?: 0L).toString(), nmaxmessagesize.toInt(), lreadtimeout.toInt(), (lpsecurityattributes?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMailslotInfo(hmailslot: Handle, lpmaxmessagesize: COpaquePointer?, lpnextsize: COpaquePointer?, lpmessagecount: COpaquePointer?, lpreadtimeout: COpaquePointer?): Bool =
    if (_windowsWin32SystemMailslotsNapiAvailable) _wasm_windowssys_windows_win32_system_mailslots_getMailslotInfo((hmailslot?.value ?: 0L).toString(), (lpmaxmessagesize?.value ?: 0L).toString(), (lpnextsize?.value ?: 0L).toString(), (lpmessagecount?.value ?: 0L).toString(), (lpreadtimeout?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMailslotInfo(hmailslot: Handle, lreadtimeout: UInt): Bool =
    if (_windowsWin32SystemMailslotsNapiAvailable) _wasm_windowssys_windows_win32_system_mailslots_setMailslotInfo((hmailslot?.value ?: 0L).toString(), lreadtimeout.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")
