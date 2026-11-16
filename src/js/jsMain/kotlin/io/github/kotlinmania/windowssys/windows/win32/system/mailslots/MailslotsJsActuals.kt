@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.mailslots

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private val windowsWin32SystemMailslotsNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun createMailslotA(lpname: Pcstr, nmaxmessagesize: UInt, lreadtimeout: UInt, lpsecurityattributes: ConstPtr): Handle =
    if (windowsWin32SystemMailslotsNapiAddon != null) MutPtr((windowsWin32SystemMailslotsNapiAddon.windowssysWindowsWin32SystemMailslotsCreateMailslotA(lpname.rawAddress.toString(), nmaxmessagesize.toInt(), lreadtimeout.toInt(), lpsecurityattributes.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createMailslotW(lpname: Pcwstr, nmaxmessagesize: UInt, lreadtimeout: UInt, lpsecurityattributes: ConstPtr): Handle =
    if (windowsWin32SystemMailslotsNapiAddon != null) MutPtr((windowsWin32SystemMailslotsNapiAddon.windowssysWindowsWin32SystemMailslotsCreateMailslotW(lpname.rawAddress.toString(), nmaxmessagesize.toInt(), lreadtimeout.toInt(), lpsecurityattributes.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMailslotInfo(hmailslot: Handle, lpmaxmessagesize: MutPtr, lpnextsize: MutPtr, lpmessagecount: MutPtr, lpreadtimeout: MutPtr): Bool =
    if (windowsWin32SystemMailslotsNapiAddon != null) (windowsWin32SystemMailslotsNapiAddon.windowssysWindowsWin32SystemMailslotsGetMailslotInfo(hmailslot.rawAddress.toString(), lpmaxmessagesize.rawAddress.toString(), lpnextsize.rawAddress.toString(), lpmessagecount.rawAddress.toString(), lpreadtimeout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMailslotInfo(hmailslot: Handle, lreadtimeout: UInt): Bool =
    if (windowsWin32SystemMailslotsNapiAddon != null) (windowsWin32SystemMailslotsNapiAddon.windowssysWindowsWin32SystemMailslotsSetMailslotInfo(hmailslot.rawAddress.toString(), lreadtimeout.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
