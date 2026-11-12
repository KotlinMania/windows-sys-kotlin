@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.mailslots

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SystemMailslotsNapiAddon(): Boolean

private val windowsWin32SystemMailslotsNapiAvailable: Boolean = initWindowsWin32SystemMailslotsNapiAddon()

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMailslotsCreateMailslotA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemMailslotsCreateMailslotA(p0: String, p1: Int, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMailslotsCreateMailslotW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemMailslotsCreateMailslotW(p0: String, p1: Int, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMailslotsGetMailslotInfo(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemMailslotsGetMailslotInfo(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMailslotsSetMailslotInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemMailslotsSetMailslotInfo(p0: String, p1: Int): Int

public actual fun createMailslotA(lpname: Pcstr, nmaxmessagesize: UInt, lreadtimeout: UInt, lpsecurityattributes: ConstPtr): Handle =
    if (windowsWin32SystemMailslotsNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemMailslotsCreateMailslotA(lpname.rawAddress.toString(), nmaxmessagesize.toInt(), lreadtimeout.toInt(), lpsecurityattributes.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createMailslotW(lpname: Pcwstr, nmaxmessagesize: UInt, lreadtimeout: UInt, lpsecurityattributes: ConstPtr): Handle =
    if (windowsWin32SystemMailslotsNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemMailslotsCreateMailslotW(lpname.rawAddress.toString(), nmaxmessagesize.toInt(), lreadtimeout.toInt(), lpsecurityattributes.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMailslotInfo(hmailslot: Handle, lpmaxmessagesize: MutPtr, lpnextsize: MutPtr, lpmessagecount: MutPtr, lpreadtimeout: MutPtr): Bool =
    if (windowsWin32SystemMailslotsNapiAvailable) wasmWindowssysWindowsWin32SystemMailslotsGetMailslotInfo(hmailslot.rawAddress.toString(), lpmaxmessagesize.rawAddress.toString(), lpnextsize.rawAddress.toString(), lpmessagecount.rawAddress.toString(), lpreadtimeout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMailslotInfo(hmailslot: Handle, lreadtimeout: UInt): Bool =
    if (windowsWin32SystemMailslotsNapiAvailable) wasmWindowssysWindowsWin32SystemMailslotsSetMailslotInfo(hmailslot.rawAddress.toString(), lreadtimeout.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")
