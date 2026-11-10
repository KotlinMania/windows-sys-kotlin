@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private val _windowsWin32SystemDiagnosticsToolhelpNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun createToolhelp32Snapshot(dwflags: CreateToolhelpSnapshotFlags, th32processid: UInt): Handle =
    if (_windowsWin32SystemDiagnosticsToolhelpNapiAddon != null) (_windowsWin32SystemDiagnosticsToolhelpNapiAddon.windowssys_windows_win32_system_diagnostics_toolhelp_createToolhelp32Snapshot(dwflags.toInt(), th32processid.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun heap32First(lphe: COpaquePointer?, th32processid: UInt, th32heapid: ULong): Bool =
    if (_windowsWin32SystemDiagnosticsToolhelpNapiAddon != null) (_windowsWin32SystemDiagnosticsToolhelpNapiAddon.windowssys_windows_win32_system_diagnostics_toolhelp_heap32First((lphe?.value ?: 0L).toString(), th32processid.toInt(), th32heapid.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun heap32ListFirst(hsnapshot: Handle, lphl: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsToolhelpNapiAddon != null) (_windowsWin32SystemDiagnosticsToolhelpNapiAddon.windowssys_windows_win32_system_diagnostics_toolhelp_heap32ListFirst((hsnapshot?.value ?: 0L).toString(), (lphl?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun heap32ListNext(hsnapshot: Handle, lphl: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsToolhelpNapiAddon != null) (_windowsWin32SystemDiagnosticsToolhelpNapiAddon.windowssys_windows_win32_system_diagnostics_toolhelp_heap32ListNext((hsnapshot?.value ?: 0L).toString(), (lphl?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun heap32Next(lphe: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsToolhelpNapiAddon != null) (_windowsWin32SystemDiagnosticsToolhelpNapiAddon.windowssys_windows_win32_system_diagnostics_toolhelp_heap32Next((lphe?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun module32First(hsnapshot: Handle, lpme: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsToolhelpNapiAddon != null) (_windowsWin32SystemDiagnosticsToolhelpNapiAddon.windowssys_windows_win32_system_diagnostics_toolhelp_module32First((hsnapshot?.value ?: 0L).toString(), (lpme?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun module32FirstW(hsnapshot: Handle, lpme: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsToolhelpNapiAddon != null) (_windowsWin32SystemDiagnosticsToolhelpNapiAddon.windowssys_windows_win32_system_diagnostics_toolhelp_module32FirstW((hsnapshot?.value ?: 0L).toString(), (lpme?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun module32Next(hsnapshot: Handle, lpme: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsToolhelpNapiAddon != null) (_windowsWin32SystemDiagnosticsToolhelpNapiAddon.windowssys_windows_win32_system_diagnostics_toolhelp_module32Next((hsnapshot?.value ?: 0L).toString(), (lpme?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun module32NextW(hsnapshot: Handle, lpme: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsToolhelpNapiAddon != null) (_windowsWin32SystemDiagnosticsToolhelpNapiAddon.windowssys_windows_win32_system_diagnostics_toolhelp_module32NextW((hsnapshot?.value ?: 0L).toString(), (lpme?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun process32First(hsnapshot: Handle, lppe: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsToolhelpNapiAddon != null) (_windowsWin32SystemDiagnosticsToolhelpNapiAddon.windowssys_windows_win32_system_diagnostics_toolhelp_process32First((hsnapshot?.value ?: 0L).toString(), (lppe?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun process32FirstW(hsnapshot: Handle, lppe: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsToolhelpNapiAddon != null) (_windowsWin32SystemDiagnosticsToolhelpNapiAddon.windowssys_windows_win32_system_diagnostics_toolhelp_process32FirstW((hsnapshot?.value ?: 0L).toString(), (lppe?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun process32Next(hsnapshot: Handle, lppe: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsToolhelpNapiAddon != null) (_windowsWin32SystemDiagnosticsToolhelpNapiAddon.windowssys_windows_win32_system_diagnostics_toolhelp_process32Next((hsnapshot?.value ?: 0L).toString(), (lppe?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun process32NextW(hsnapshot: Handle, lppe: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsToolhelpNapiAddon != null) (_windowsWin32SystemDiagnosticsToolhelpNapiAddon.windowssys_windows_win32_system_diagnostics_toolhelp_process32NextW((hsnapshot?.value ?: 0L).toString(), (lppe?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun thread32First(hsnapshot: Handle, lpte: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsToolhelpNapiAddon != null) (_windowsWin32SystemDiagnosticsToolhelpNapiAddon.windowssys_windows_win32_system_diagnostics_toolhelp_thread32First((hsnapshot?.value ?: 0L).toString(), (lpte?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun thread32Next(hsnapshot: Handle, lpte: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsToolhelpNapiAddon != null) (_windowsWin32SystemDiagnosticsToolhelpNapiAddon.windowssys_windows_win32_system_diagnostics_toolhelp_thread32Next((hsnapshot?.value ?: 0L).toString(), (lpte?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun toolhelp32ReadProcessMemory(th32processid: UInt, lpbaseaddress: COpaquePointer?, lpbuffer: COpaquePointer?, cbread: ULong, lpnumberofbytesread: COpaquePointer?): Bool =
    if (_windowsWin32SystemDiagnosticsToolhelpNapiAddon != null) (_windowsWin32SystemDiagnosticsToolhelpNapiAddon.windowssys_windows_win32_system_diagnostics_toolhelp_toolhelp32ReadProcessMemory(th32processid.toInt(), (lpbaseaddress?.value ?: 0L).toString(), (lpbuffer?.value ?: 0L).toString(), cbread.toString(), (lpnumberofbytesread?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
