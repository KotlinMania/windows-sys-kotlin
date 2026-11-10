@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32SystemDiagnosticsToolhelpNapiAddon(): Boolean

private val _windowsWin32SystemDiagnosticsToolhelpNapiAvailable: Boolean = _initWindowsWin32SystemDiagnosticsToolhelpNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_toolhelp_createToolhelp32Snapshot(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_toolhelp_createToolhelp32Snapshot(p0: Int, p1: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_toolhelp_heap32First(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_toolhelp_heap32First(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_toolhelp_heap32ListFirst(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_toolhelp_heap32ListFirst(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_toolhelp_heap32ListNext(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_toolhelp_heap32ListNext(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_toolhelp_heap32Next(p0)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_toolhelp_heap32Next(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_toolhelp_module32First(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_toolhelp_module32First(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_toolhelp_module32FirstW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_toolhelp_module32FirstW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_toolhelp_module32Next(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_toolhelp_module32Next(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_toolhelp_module32NextW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_toolhelp_module32NextW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_toolhelp_process32First(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_toolhelp_process32First(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_toolhelp_process32FirstW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_toolhelp_process32FirstW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_toolhelp_process32Next(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_toolhelp_process32Next(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_toolhelp_process32NextW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_toolhelp_process32NextW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_toolhelp_thread32First(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_toolhelp_thread32First(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_toolhelp_thread32Next(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_toolhelp_thread32Next(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_toolhelp_toolhelp32ReadProcessMemory(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_toolhelp_toolhelp32ReadProcessMemory(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

public actual fun createToolhelp32Snapshot(dwflags: CreateToolhelpSnapshotFlags, th32processid: UInt): Handle =
    if (_windowsWin32SystemDiagnosticsToolhelpNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_toolhelp_createToolhelp32Snapshot(dwflags.toInt(), th32processid.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun heap32First(lphe: COpaquePointer?, th32processid: UInt, th32heapid: ULong): Bool =
    if (_windowsWin32SystemDiagnosticsToolhelpNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_toolhelp_heap32First((lphe?.value ?: 0L).toString(), th32processid.toInt(), th32heapid.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun heap32ListFirst(hsnapshot: Handle, lphl: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsToolhelpNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_toolhelp_heap32ListFirst((hsnapshot?.value ?: 0L).toString(), (lphl?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun heap32ListNext(hsnapshot: Handle, lphl: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsToolhelpNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_toolhelp_heap32ListNext((hsnapshot?.value ?: 0L).toString(), (lphl?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun heap32Next(lphe: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsToolhelpNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_toolhelp_heap32Next((lphe?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun module32First(hsnapshot: Handle, lpme: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsToolhelpNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_toolhelp_module32First((hsnapshot?.value ?: 0L).toString(), (lpme?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun module32FirstW(hsnapshot: Handle, lpme: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsToolhelpNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_toolhelp_module32FirstW((hsnapshot?.value ?: 0L).toString(), (lpme?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun module32Next(hsnapshot: Handle, lpme: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsToolhelpNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_toolhelp_module32Next((hsnapshot?.value ?: 0L).toString(), (lpme?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun module32NextW(hsnapshot: Handle, lpme: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsToolhelpNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_toolhelp_module32NextW((hsnapshot?.value ?: 0L).toString(), (lpme?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun process32First(hsnapshot: Handle, lppe: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsToolhelpNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_toolhelp_process32First((hsnapshot?.value ?: 0L).toString(), (lppe?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun process32FirstW(hsnapshot: Handle, lppe: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsToolhelpNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_toolhelp_process32FirstW((hsnapshot?.value ?: 0L).toString(), (lppe?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun process32Next(hsnapshot: Handle, lppe: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsToolhelpNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_toolhelp_process32Next((hsnapshot?.value ?: 0L).toString(), (lppe?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun process32NextW(hsnapshot: Handle, lppe: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsToolhelpNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_toolhelp_process32NextW((hsnapshot?.value ?: 0L).toString(), (lppe?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun thread32First(hsnapshot: Handle, lpte: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsToolhelpNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_toolhelp_thread32First((hsnapshot?.value ?: 0L).toString(), (lpte?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun thread32Next(hsnapshot: Handle, lpte: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsToolhelpNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_toolhelp_thread32Next((hsnapshot?.value ?: 0L).toString(), (lpte?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun toolhelp32ReadProcessMemory(th32processid: UInt, lpbaseaddress: COpaquePointer?, lpbuffer: COpaquePointer?, cbread: ULong, lpnumberofbytesread: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsToolhelpNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_toolhelp_toolhelp32ReadProcessMemory(th32processid.toInt(), (lpbaseaddress?.value ?: 0L).toString(), (lpbuffer?.value ?: 0L).toString(), cbread.toString(), (lpnumberofbytesread?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
