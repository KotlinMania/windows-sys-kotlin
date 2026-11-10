@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.time

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32SystemTimeNapiAddon(): Boolean

private val _windowsWin32SystemTimeNapiAvailable: Boolean = _initWindowsWin32SystemTimeNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_time_enumDynamicTimeZoneInformation(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_time_enumDynamicTimeZoneInformation(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_time_fileTimeToSystemTime(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_time_fileTimeToSystemTime(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_time_getDynamicTimeZoneInformation(p0)")
private external fun _wasm_windowssys_windows_win32_system_time_getDynamicTimeZoneInformation(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_time_getDynamicTimeZoneInformationEffectiveYears(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_time_getDynamicTimeZoneInformationEffectiveYears(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_time_getTimeZoneInformation(p0)")
private external fun _wasm_windowssys_windows_win32_system_time_getTimeZoneInformation(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_time_getTimeZoneInformationForYear(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_time_getTimeZoneInformationForYear(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_time_localFileTimeToLocalSystemTime(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_time_localFileTimeToLocalSystemTime(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_time_localSystemTimeToLocalFileTime(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_time_localSystemTimeToLocalFileTime(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_time_setDynamicTimeZoneInformation(p0)")
private external fun _wasm_windowssys_windows_win32_system_time_setDynamicTimeZoneInformation(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_time_setTimeZoneInformation(p0)")
private external fun _wasm_windowssys_windows_win32_system_time_setTimeZoneInformation(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_time_systemTimeToFileTime(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_time_systemTimeToFileTime(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_time_systemTimeToTzSpecificLocalTime(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_time_systemTimeToTzSpecificLocalTime(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_time_systemTimeToTzSpecificLocalTimeEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_time_systemTimeToTzSpecificLocalTimeEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_time_tzSpecificLocalTimeToSystemTime(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_time_tzSpecificLocalTimeToSystemTime(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_time_tzSpecificLocalTimeToSystemTimeEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_time_tzSpecificLocalTimeToSystemTimeEx(p0: String, p1: String, p2: String): Int

public actual fun enumDynamicTimeZoneInformation(dwindex: UInt, lptimezoneinformation: COpaquePointer?): UInt =
    if (_windowsWin32SystemTimeNapiAvailable) _wasm_windowssys_windows_win32_system_time_enumDynamicTimeZoneInformation(dwindex.toInt(), (lptimezoneinformation?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fileTimeToSystemTime(lpfiletime: COpaquePointer?, lpsystemtime: COpaquePointer?): Bool =
    if (_windowsWin32SystemTimeNapiAvailable) _wasm_windowssys_windows_win32_system_time_fileTimeToSystemTime((lpfiletime?.value ?: 0L).toString(), (lpsystemtime?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDynamicTimeZoneInformation(ptimezoneinformation: COpaquePointer?): UInt =
    if (_windowsWin32SystemTimeNapiAvailable) _wasm_windowssys_windows_win32_system_time_getDynamicTimeZoneInformation((ptimezoneinformation?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDynamicTimeZoneInformationEffectiveYears(lptimezoneinformation: COpaquePointer?, firstyear: COpaquePointer?, lastyear: COpaquePointer?): UInt =
    if (_windowsWin32SystemTimeNapiAvailable) _wasm_windowssys_windows_win32_system_time_getDynamicTimeZoneInformationEffectiveYears((lptimezoneinformation?.value ?: 0L).toString(), (firstyear?.value ?: 0L).toString(), (lastyear?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTimeZoneInformation(lptimezoneinformation: COpaquePointer?): UInt =
    if (_windowsWin32SystemTimeNapiAvailable) _wasm_windowssys_windows_win32_system_time_getTimeZoneInformation((lptimezoneinformation?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTimeZoneInformationForYear(wyear: UShort, pdtzi: COpaquePointer?, ptzi: COpaquePointer?): Bool =
    if (_windowsWin32SystemTimeNapiAvailable) _wasm_windowssys_windows_win32_system_time_getTimeZoneInformationForYear(wyear.toInt(), (pdtzi?.value ?: 0L).toString(), (ptzi?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localFileTimeToLocalSystemTime(timezoneinformation: COpaquePointer?, localfiletime: COpaquePointer?, localsystemtime: COpaquePointer?): Bool =
    if (_windowsWin32SystemTimeNapiAvailable) _wasm_windowssys_windows_win32_system_time_localFileTimeToLocalSystemTime((timezoneinformation?.value ?: 0L).toString(), (localfiletime?.value ?: 0L).toString(), (localsystemtime?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localSystemTimeToLocalFileTime(timezoneinformation: COpaquePointer?, localsystemtime: COpaquePointer?, localfiletime: COpaquePointer?): Bool =
    if (_windowsWin32SystemTimeNapiAvailable) _wasm_windowssys_windows_win32_system_time_localSystemTimeToLocalFileTime((timezoneinformation?.value ?: 0L).toString(), (localsystemtime?.value ?: 0L).toString(), (localfiletime?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDynamicTimeZoneInformation(lptimezoneinformation: COpaquePointer?): Bool =
    if (_windowsWin32SystemTimeNapiAvailable) _wasm_windowssys_windows_win32_system_time_setDynamicTimeZoneInformation((lptimezoneinformation?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setTimeZoneInformation(lptimezoneinformation: COpaquePointer?): Bool =
    if (_windowsWin32SystemTimeNapiAvailable) _wasm_windowssys_windows_win32_system_time_setTimeZoneInformation((lptimezoneinformation?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun systemTimeToFileTime(lpsystemtime: COpaquePointer?, lpfiletime: COpaquePointer?): Bool =
    if (_windowsWin32SystemTimeNapiAvailable) _wasm_windowssys_windows_win32_system_time_systemTimeToFileTime((lpsystemtime?.value ?: 0L).toString(), (lpfiletime?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun systemTimeToTzSpecificLocalTime(lptimezoneinformation: COpaquePointer?, lpuniversaltime: COpaquePointer?, lplocaltime: COpaquePointer?): Bool =
    if (_windowsWin32SystemTimeNapiAvailable) _wasm_windowssys_windows_win32_system_time_systemTimeToTzSpecificLocalTime((lptimezoneinformation?.value ?: 0L).toString(), (lpuniversaltime?.value ?: 0L).toString(), (lplocaltime?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun systemTimeToTzSpecificLocalTimeEx(lptimezoneinformation: COpaquePointer?, lpuniversaltime: COpaquePointer?, lplocaltime: COpaquePointer?): Bool =
    if (_windowsWin32SystemTimeNapiAvailable) _wasm_windowssys_windows_win32_system_time_systemTimeToTzSpecificLocalTimeEx((lptimezoneinformation?.value ?: 0L).toString(), (lpuniversaltime?.value ?: 0L).toString(), (lplocaltime?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tzSpecificLocalTimeToSystemTime(lptimezoneinformation: COpaquePointer?, lplocaltime: COpaquePointer?, lpuniversaltime: COpaquePointer?): Bool =
    if (_windowsWin32SystemTimeNapiAvailable) _wasm_windowssys_windows_win32_system_time_tzSpecificLocalTimeToSystemTime((lptimezoneinformation?.value ?: 0L).toString(), (lplocaltime?.value ?: 0L).toString(), (lpuniversaltime?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tzSpecificLocalTimeToSystemTimeEx(lptimezoneinformation: COpaquePointer?, lplocaltime: COpaquePointer?, lpuniversaltime: COpaquePointer?): Bool =
    if (_windowsWin32SystemTimeNapiAvailable) _wasm_windowssys_windows_win32_system_time_tzSpecificLocalTimeToSystemTimeEx((lptimezoneinformation?.value ?: 0L).toString(), (lplocaltime?.value ?: 0L).toString(), (lpuniversaltime?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
