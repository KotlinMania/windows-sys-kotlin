@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SystemDiagnosticsToolhelpNapiAddon(): Boolean

private val windowsWin32SystemDiagnosticsToolhelpNapiAvailable: Boolean = initWindowsWin32SystemDiagnosticsToolhelpNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsToolhelpCreateToolhelp32Snapshot(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsToolhelpCreateToolhelp32Snapshot(p0: Int, p1: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsToolhelpHeap32First(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsToolhelpHeap32First(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsToolhelpHeap32ListFirst(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsToolhelpHeap32ListFirst(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsToolhelpHeap32ListNext(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsToolhelpHeap32ListNext(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsToolhelpHeap32Next(p0)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsToolhelpHeap32Next(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsToolhelpModule32First(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsToolhelpModule32First(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsToolhelpModule32FirstW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsToolhelpModule32FirstW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsToolhelpModule32Next(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsToolhelpModule32Next(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsToolhelpModule32NextW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsToolhelpModule32NextW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsToolhelpProcess32First(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsToolhelpProcess32First(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsToolhelpProcess32FirstW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsToolhelpProcess32FirstW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsToolhelpProcess32Next(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsToolhelpProcess32Next(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsToolhelpProcess32NextW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsToolhelpProcess32NextW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsToolhelpThread32First(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsToolhelpThread32First(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsToolhelpThread32Next(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsToolhelpThread32Next(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsToolhelpToolhelp32ReadProcessMemory(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsToolhelpToolhelp32ReadProcessMemory(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

public actual fun createToolhelp32Snapshot(dwflags: CreateToolhelpSnapshotFlags, th32processid: UInt): Handle =
    if (windowsWin32SystemDiagnosticsToolhelpNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemDiagnosticsToolhelpCreateToolhelp32Snapshot(dwflags.toInt(), th32processid.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun heap32First(lphe: MutPtr, th32processid: UInt, th32heapid: ULong): Bool =
    if (windowsWin32SystemDiagnosticsToolhelpNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsToolhelpHeap32First(lphe.rawAddress.toString(), th32processid.toInt(), th32heapid.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun heap32ListFirst(hsnapshot: Handle, lphl: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsToolhelpNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsToolhelpHeap32ListFirst(hsnapshot.rawAddress.toString(), lphl.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun heap32ListNext(hsnapshot: Handle, lphl: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsToolhelpNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsToolhelpHeap32ListNext(hsnapshot.rawAddress.toString(), lphl.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun heap32Next(lphe: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsToolhelpNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsToolhelpHeap32Next(lphe.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun module32First(hsnapshot: Handle, lpme: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsToolhelpNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsToolhelpModule32First(hsnapshot.rawAddress.toString(), lpme.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun module32FirstW(hsnapshot: Handle, lpme: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsToolhelpNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsToolhelpModule32FirstW(hsnapshot.rawAddress.toString(), lpme.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun module32Next(hsnapshot: Handle, lpme: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsToolhelpNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsToolhelpModule32Next(hsnapshot.rawAddress.toString(), lpme.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun module32NextW(hsnapshot: Handle, lpme: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsToolhelpNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsToolhelpModule32NextW(hsnapshot.rawAddress.toString(), lpme.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun process32First(hsnapshot: Handle, lppe: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsToolhelpNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsToolhelpProcess32First(hsnapshot.rawAddress.toString(), lppe.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun process32FirstW(hsnapshot: Handle, lppe: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsToolhelpNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsToolhelpProcess32FirstW(hsnapshot.rawAddress.toString(), lppe.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun process32Next(hsnapshot: Handle, lppe: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsToolhelpNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsToolhelpProcess32Next(hsnapshot.rawAddress.toString(), lppe.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun process32NextW(hsnapshot: Handle, lppe: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsToolhelpNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsToolhelpProcess32NextW(hsnapshot.rawAddress.toString(), lppe.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun thread32First(hsnapshot: Handle, lpte: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsToolhelpNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsToolhelpThread32First(hsnapshot.rawAddress.toString(), lpte.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun thread32Next(hsnapshot: Handle, lpte: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsToolhelpNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsToolhelpThread32Next(hsnapshot.rawAddress.toString(), lpte.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun toolhelp32ReadProcessMemory(th32processid: UInt, lpbaseaddress: ConstPtr, lpbuffer: MutPtr, cbread: ULong, lpnumberofbytesread: MutPtr): Bool =
    if (windowsWin32SystemDiagnosticsToolhelpNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsToolhelpToolhelp32ReadProcessMemory(th32processid.toInt(), lpbaseaddress.rawAddress.toString(), lpbuffer.rawAddress.toString(), cbread.toString(), lpnumberofbytesread.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
