@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.xps

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32StorageXpsNapiAddon(): Boolean

private val _windowsWin32StorageXpsNapiAvailable: Boolean = _initWindowsWin32StorageXpsNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_xps_abortDoc(p0)")
private external fun _wasm_windowssys_windows_win32_storage_xps_abortDoc(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_xps_deviceCapabilitiesA(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_xps_deviceCapabilitiesA(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_xps_deviceCapabilitiesW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_xps_deviceCapabilitiesW(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_xps_endDoc(p0)")
private external fun _wasm_windowssys_windows_win32_storage_xps_endDoc(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_xps_endPage(p0)")
private external fun _wasm_windowssys_windows_win32_storage_xps_endPage(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_xps_escape(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_xps_escape(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_xps_extEscape(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_storage_xps_extEscape(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_xps_printWindow(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_xps_printWindow(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_xps_setAbortProc(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_xps_setAbortProc(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_xps_startDocA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_xps_startDocA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_xps_startDocW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_xps_startDocW(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_xps_startPage(p0)")
private external fun _wasm_windowssys_windows_win32_storage_xps_startPage(p0: String): Int

public actual fun abortDoc(hdc: Hdc): Int =
    if (_windowsWin32StorageXpsNapiAvailable) _wasm_windowssys_windows_win32_storage_xps_abortDoc((hdc?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deviceCapabilitiesA(pdevice: Pcstr, pport: Pcstr, fwcapability: PrinterDeviceCapabilities, poutput: Pstr, pdevmode: COpaquePointer?): Int =
    if (_windowsWin32StorageXpsNapiAvailable) _wasm_windowssys_windows_win32_storage_xps_deviceCapabilitiesA((pdevice?.value ?: 0L).toString(), (pport?.value ?: 0L).toString(), fwcapability.toInt(), (poutput?.value ?: 0L).toString(), (pdevmode?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deviceCapabilitiesW(pdevice: Pcwstr, pport: Pcwstr, fwcapability: PrinterDeviceCapabilities, poutput: Pwstr, pdevmode: COpaquePointer?): Int =
    if (_windowsWin32StorageXpsNapiAvailable) _wasm_windowssys_windows_win32_storage_xps_deviceCapabilitiesW((pdevice?.value ?: 0L).toString(), (pport?.value ?: 0L).toString(), fwcapability.toInt(), (poutput?.value ?: 0L).toString(), (pdevmode?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endDoc(hdc: Hdc): Int =
    if (_windowsWin32StorageXpsNapiAvailable) _wasm_windowssys_windows_win32_storage_xps_endDoc((hdc?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endPage(hdc: Hdc): Int =
    if (_windowsWin32StorageXpsNapiAvailable) _wasm_windowssys_windows_win32_storage_xps_endPage((hdc?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun escape(hdc: Hdc, iescape: Int, cjin: Int, pvin: Pcstr, pvout: COpaquePointer?): Int =
    if (_windowsWin32StorageXpsNapiAvailable) _wasm_windowssys_windows_win32_storage_xps_escape((hdc?.value ?: 0L).toString(), iescape, cjin, (pvin?.value ?: 0L).toString(), (pvout?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extEscape(hdc: Hdc, iescape: Int, cjinput: Int, lpindata: Pcstr, cjoutput: Int, lpoutdata: Pstr): Int =
    if (_windowsWin32StorageXpsNapiAvailable) _wasm_windowssys_windows_win32_storage_xps_extEscape((hdc?.value ?: 0L).toString(), iescape, cjinput, (lpindata?.value ?: 0L).toString(), cjoutput, (lpoutdata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun printWindow(hwnd: Hwnd, hdcblt: Hdc, nflags: PrintWindowFlags): Bool =
    if (_windowsWin32StorageXpsNapiAvailable) _wasm_windowssys_windows_win32_storage_xps_printWindow((hwnd?.value ?: 0L).toString(), (hdcblt?.value ?: 0L).toString(), nflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setAbortProc(hdc: Hdc, proc: Abortproc): Int =
    if (_windowsWin32StorageXpsNapiAvailable) _wasm_windowssys_windows_win32_storage_xps_setAbortProc((hdc?.value ?: 0L).toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun startDocA(hdc: Hdc, lpdi: COpaquePointer?): Int =
    if (_windowsWin32StorageXpsNapiAvailable) _wasm_windowssys_windows_win32_storage_xps_startDocA((hdc?.value ?: 0L).toString(), (lpdi?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun startDocW(hdc: Hdc, lpdi: COpaquePointer?): Int =
    if (_windowsWin32StorageXpsNapiAvailable) _wasm_windowssys_windows_win32_storage_xps_startDocW((hdc?.value ?: 0L).toString(), (lpdi?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun startPage(hdc: Hdc): Int =
    if (_windowsWin32StorageXpsNapiAvailable) _wasm_windowssys_windows_win32_storage_xps_startPage((hdc?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
