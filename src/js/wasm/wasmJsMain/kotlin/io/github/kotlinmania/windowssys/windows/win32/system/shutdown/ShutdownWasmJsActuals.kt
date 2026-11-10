@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.shutdown

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32SystemShutdownNapiAddon(): Boolean

private val _windowsWin32SystemShutdownNapiAvailable: Boolean = _initWindowsWin32SystemShutdownNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_shutdown_abortSystemShutdownA(p0)")
private external fun _wasm_windowssys_windows_win32_system_shutdown_abortSystemShutdownA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_shutdown_abortSystemShutdownW(p0)")
private external fun _wasm_windowssys_windows_win32_system_shutdown_abortSystemShutdownW(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_shutdown_checkForHiberboot(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_shutdown_checkForHiberboot(p0: String, p1: Boolean): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_shutdown_exitWindowsEx(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_shutdown_exitWindowsEx(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_shutdown_initiateShutdownA(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_shutdown_initiateShutdownA(p0: String, p1: String, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_shutdown_initiateShutdownW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_shutdown_initiateShutdownW(p0: String, p1: String, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_shutdown_initiateSystemShutdownA(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_shutdown_initiateSystemShutdownA(p0: String, p1: String, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_shutdown_initiateSystemShutdownExA(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_shutdown_initiateSystemShutdownExA(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_shutdown_initiateSystemShutdownExW(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_shutdown_initiateSystemShutdownExW(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_shutdown_initiateSystemShutdownW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_shutdown_initiateSystemShutdownW(p0: String, p1: String, p2: Int, p3: Int, p4: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_shutdown_lockWorkStation()")
private external fun _wasm_windowssys_windows_win32_system_shutdown_lockWorkStation(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_shutdown_shutdownBlockReasonCreate(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_shutdown_shutdownBlockReasonCreate(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_shutdown_shutdownBlockReasonDestroy(p0)")
private external fun _wasm_windowssys_windows_win32_system_shutdown_shutdownBlockReasonDestroy(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_shutdown_shutdownBlockReasonQuery(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_shutdown_shutdownBlockReasonQuery(p0: String, p1: String, p2: String): Int

public actual fun abortSystemShutdownA(lpmachinename: Pcstr): Bool =
    if (_windowsWin32SystemShutdownNapiAvailable) _wasm_windowssys_windows_win32_system_shutdown_abortSystemShutdownA((lpmachinename?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun abortSystemShutdownW(lpmachinename: Pcwstr): Bool =
    if (_windowsWin32SystemShutdownNapiAvailable) _wasm_windowssys_windows_win32_system_shutdown_abortSystemShutdownW((lpmachinename?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun checkForHiberboot(phiberboot: COpaquePointer?, bclearflag: Boolean): UInt =
    if (_windowsWin32SystemShutdownNapiAvailable) _wasm_windowssys_windows_win32_system_shutdown_checkForHiberboot((phiberboot?.value ?: 0L).toString(), bclearflag).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exitWindowsEx(uflags: ExitWindowsFlags, dwreason: ShutdownReason): Bool =
    if (_windowsWin32SystemShutdownNapiAvailable) _wasm_windowssys_windows_win32_system_shutdown_exitWindowsEx(uflags.toInt(), dwreason.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initiateShutdownA(lpmachinename: Pcstr, lpmessage: Pcstr, dwgraceperiod: UInt, dwshutdownflags: ShutdownFlags, dwreason: ShutdownReason): UInt =
    if (_windowsWin32SystemShutdownNapiAvailable) _wasm_windowssys_windows_win32_system_shutdown_initiateShutdownA((lpmachinename?.value ?: 0L).toString(), (lpmessage?.value ?: 0L).toString(), dwgraceperiod.toInt(), dwshutdownflags.toInt(), dwreason.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initiateShutdownW(lpmachinename: Pcwstr, lpmessage: Pcwstr, dwgraceperiod: UInt, dwshutdownflags: ShutdownFlags, dwreason: ShutdownReason): UInt =
    if (_windowsWin32SystemShutdownNapiAvailable) _wasm_windowssys_windows_win32_system_shutdown_initiateShutdownW((lpmachinename?.value ?: 0L).toString(), (lpmessage?.value ?: 0L).toString(), dwgraceperiod.toInt(), dwshutdownflags.toInt(), dwreason.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initiateSystemShutdownA(lpmachinename: Pcstr, lpmessage: Pcstr, dwtimeout: UInt, bforceappsclosed: Bool, brebootaftershutdown: Bool): Bool =
    if (_windowsWin32SystemShutdownNapiAvailable) _wasm_windowssys_windows_win32_system_shutdown_initiateSystemShutdownA((lpmachinename?.value ?: 0L).toString(), (lpmessage?.value ?: 0L).toString(), dwtimeout.toInt(), bforceappsclosed, brebootaftershutdown) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initiateSystemShutdownExA(lpmachinename: Pcstr, lpmessage: Pcstr, dwtimeout: UInt, bforceappsclosed: Bool, brebootaftershutdown: Bool, dwreason: ShutdownReason): Bool =
    if (_windowsWin32SystemShutdownNapiAvailable) _wasm_windowssys_windows_win32_system_shutdown_initiateSystemShutdownExA((lpmachinename?.value ?: 0L).toString(), (lpmessage?.value ?: 0L).toString(), dwtimeout.toInt(), bforceappsclosed, brebootaftershutdown, dwreason.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initiateSystemShutdownExW(lpmachinename: Pcwstr, lpmessage: Pcwstr, dwtimeout: UInt, bforceappsclosed: Bool, brebootaftershutdown: Bool, dwreason: ShutdownReason): Bool =
    if (_windowsWin32SystemShutdownNapiAvailable) _wasm_windowssys_windows_win32_system_shutdown_initiateSystemShutdownExW((lpmachinename?.value ?: 0L).toString(), (lpmessage?.value ?: 0L).toString(), dwtimeout.toInt(), bforceappsclosed, brebootaftershutdown, dwreason.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initiateSystemShutdownW(lpmachinename: Pcwstr, lpmessage: Pcwstr, dwtimeout: UInt, bforceappsclosed: Bool, brebootaftershutdown: Bool): Bool =
    if (_windowsWin32SystemShutdownNapiAvailable) _wasm_windowssys_windows_win32_system_shutdown_initiateSystemShutdownW((lpmachinename?.value ?: 0L).toString(), (lpmessage?.value ?: 0L).toString(), dwtimeout.toInt(), bforceappsclosed, brebootaftershutdown) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lockWorkStation(): Bool =
    if (_windowsWin32SystemShutdownNapiAvailable) _wasm_windowssys_windows_win32_system_shutdown_lockWorkStation() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shutdownBlockReasonCreate(hwnd: Hwnd, pwszreason: Pcwstr): Bool =
    if (_windowsWin32SystemShutdownNapiAvailable) _wasm_windowssys_windows_win32_system_shutdown_shutdownBlockReasonCreate((hwnd?.value ?: 0L).toString(), (pwszreason?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shutdownBlockReasonDestroy(hwnd: Hwnd): Bool =
    if (_windowsWin32SystemShutdownNapiAvailable) _wasm_windowssys_windows_win32_system_shutdown_shutdownBlockReasonDestroy((hwnd?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shutdownBlockReasonQuery(hwnd: Hwnd, pwszbuff: Pwstr, pcchbuff: COpaquePointer?): Bool =
    if (_windowsWin32SystemShutdownNapiAvailable) _wasm_windowssys_windows_win32_system_shutdown_shutdownBlockReasonQuery((hwnd?.value ?: 0L).toString(), (pwszbuff?.value ?: 0L).toString(), (pcchbuff?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
