@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private val windowsWin32SystemDiagnosticsToolhelpNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun createToolhelp32Snapshot(dwflags: CreateToolhelpSnapshotFlags, th32processid: UInt): Handle =
    if (windowsWin32SystemDiagnosticsToolhelpNapiAddon != null) MutPtr((windowsWin32SystemDiagnosticsToolhelpNapiAddon.windowssysWindowsWin32SystemDiagnosticsToolhelpCreateToolhelp32Snapshot(dwflags.toInt(), th32processid.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun heap32First(lphe: MutPtr, th32processid: UInt, th32heapid: ULong): Bool =
    if (windowsWin32SystemDiagnosticsToolhelpNapiAddon != null) (windowsWin32SystemDiagnosticsToolhelpNapiAddon.windowssysWindowsWin32SystemDiagnosticsToolhelpHeap32First(lphe.rawAddress.toString(), th32processid.toInt(), th32heapid.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun heap32ListFirst(hsnapshot: Handle, lphl: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsToolhelpNapiAddon != null) (windowsWin32SystemDiagnosticsToolhelpNapiAddon.windowssysWindowsWin32SystemDiagnosticsToolhelpHeap32ListFirst(hsnapshot.rawAddress.toString(), lphl.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun heap32ListNext(hsnapshot: Handle, lphl: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsToolhelpNapiAddon != null) (windowsWin32SystemDiagnosticsToolhelpNapiAddon.windowssysWindowsWin32SystemDiagnosticsToolhelpHeap32ListNext(hsnapshot.rawAddress.toString(), lphl.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun heap32Next(lphe: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsToolhelpNapiAddon != null) (windowsWin32SystemDiagnosticsToolhelpNapiAddon.windowssysWindowsWin32SystemDiagnosticsToolhelpHeap32Next(lphe.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun module32First(hsnapshot: Handle, lpme: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsToolhelpNapiAddon != null) (windowsWin32SystemDiagnosticsToolhelpNapiAddon.windowssysWindowsWin32SystemDiagnosticsToolhelpModule32First(hsnapshot.rawAddress.toString(), lpme.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun module32FirstW(hsnapshot: Handle, lpme: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsToolhelpNapiAddon != null) (windowsWin32SystemDiagnosticsToolhelpNapiAddon.windowssysWindowsWin32SystemDiagnosticsToolhelpModule32FirstW(hsnapshot.rawAddress.toString(), lpme.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun module32Next(hsnapshot: Handle, lpme: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsToolhelpNapiAddon != null) (windowsWin32SystemDiagnosticsToolhelpNapiAddon.windowssysWindowsWin32SystemDiagnosticsToolhelpModule32Next(hsnapshot.rawAddress.toString(), lpme.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun module32NextW(hsnapshot: Handle, lpme: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsToolhelpNapiAddon != null) (windowsWin32SystemDiagnosticsToolhelpNapiAddon.windowssysWindowsWin32SystemDiagnosticsToolhelpModule32NextW(hsnapshot.rawAddress.toString(), lpme.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun process32First(hsnapshot: Handle, lppe: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsToolhelpNapiAddon != null) (windowsWin32SystemDiagnosticsToolhelpNapiAddon.windowssysWindowsWin32SystemDiagnosticsToolhelpProcess32First(hsnapshot.rawAddress.toString(), lppe.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun process32FirstW(hsnapshot: Handle, lppe: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsToolhelpNapiAddon != null) (windowsWin32SystemDiagnosticsToolhelpNapiAddon.windowssysWindowsWin32SystemDiagnosticsToolhelpProcess32FirstW(hsnapshot.rawAddress.toString(), lppe.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun process32Next(hsnapshot: Handle, lppe: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsToolhelpNapiAddon != null) (windowsWin32SystemDiagnosticsToolhelpNapiAddon.windowssysWindowsWin32SystemDiagnosticsToolhelpProcess32Next(hsnapshot.rawAddress.toString(), lppe.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun process32NextW(hsnapshot: Handle, lppe: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsToolhelpNapiAddon != null) (windowsWin32SystemDiagnosticsToolhelpNapiAddon.windowssysWindowsWin32SystemDiagnosticsToolhelpProcess32NextW(hsnapshot.rawAddress.toString(), lppe.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun thread32First(hsnapshot: Handle, lpte: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsToolhelpNapiAddon != null) (windowsWin32SystemDiagnosticsToolhelpNapiAddon.windowssysWindowsWin32SystemDiagnosticsToolhelpThread32First(hsnapshot.rawAddress.toString(), lpte.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun thread32Next(hsnapshot: Handle, lpte: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsToolhelpNapiAddon != null) (windowsWin32SystemDiagnosticsToolhelpNapiAddon.windowssysWindowsWin32SystemDiagnosticsToolhelpThread32Next(hsnapshot.rawAddress.toString(), lpte.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun toolhelp32ReadProcessMemory(th32processid: UInt, lpbaseaddress: ConstPtr, lpbuffer: MutPtr, cbread: ULong, lpnumberofbytesread: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsToolhelpNapiAddon != null) (windowsWin32SystemDiagnosticsToolhelpNapiAddon.windowssysWindowsWin32SystemDiagnosticsToolhelpToolhelp32ReadProcessMemory(th32processid.toInt(), lpbaseaddress.rawAddress.toString(), lpbuffer.rawAddress.toString(), cbread.toString(), lpnumberofbytesread.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
