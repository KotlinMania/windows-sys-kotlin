@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.time

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool

private val _windowsWin32SystemTimeNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun enumDynamicTimeZoneInformation(dwindex: UInt, lptimezoneinformation: COpaquePointer?): UInt =
    if (_windowsWin32SystemTimeNapiAddon != null) (_windowsWin32SystemTimeNapiAddon.windowssys_windows_win32_system_time_enumDynamicTimeZoneInformation(dwindex.toInt(), (lptimezoneinformation?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fileTimeToSystemTime(lpfiletime: COpaquePointer?, lpsystemtime: COpaquePointer?): Bool =
    if (_windowsWin32SystemTimeNapiAddon != null) (_windowsWin32SystemTimeNapiAddon.windowssys_windows_win32_system_time_fileTimeToSystemTime((lpfiletime?.value ?: 0L).toString(), (lpsystemtime?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDynamicTimeZoneInformation(ptimezoneinformation: COpaquePointer?): UInt =
    if (_windowsWin32SystemTimeNapiAddon != null) (_windowsWin32SystemTimeNapiAddon.windowssys_windows_win32_system_time_getDynamicTimeZoneInformation((ptimezoneinformation?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDynamicTimeZoneInformationEffectiveYears(lptimezoneinformation: COpaquePointer?, firstyear: COpaquePointer?, lastyear: COpaquePointer?): UInt =
    if (_windowsWin32SystemTimeNapiAddon != null) (_windowsWin32SystemTimeNapiAddon.windowssys_windows_win32_system_time_getDynamicTimeZoneInformationEffectiveYears((lptimezoneinformation?.value ?: 0L).toString(), (firstyear?.value ?: 0L).toString(), (lastyear?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTimeZoneInformation(lptimezoneinformation: COpaquePointer?): UInt =
    if (_windowsWin32SystemTimeNapiAddon != null) (_windowsWin32SystemTimeNapiAddon.windowssys_windows_win32_system_time_getTimeZoneInformation((lptimezoneinformation?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTimeZoneInformationForYear(wyear: UShort, pdtzi: COpaquePointer?, ptzi: COpaquePointer?): Bool =
    if (_windowsWin32SystemTimeNapiAddon != null) (_windowsWin32SystemTimeNapiAddon.windowssys_windows_win32_system_time_getTimeZoneInformationForYear(wyear.toInt(), (pdtzi?.value ?: 0L).toString(), (ptzi?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localFileTimeToLocalSystemTime(timezoneinformation: COpaquePointer?, localfiletime: COpaquePointer?, localsystemtime: COpaquePointer?): Bool =
    if (_windowsWin32SystemTimeNapiAddon != null) (_windowsWin32SystemTimeNapiAddon.windowssys_windows_win32_system_time_localFileTimeToLocalSystemTime((timezoneinformation?.value ?: 0L).toString(), (localfiletime?.value ?: 0L).toString(), (localsystemtime?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localSystemTimeToLocalFileTime(timezoneinformation: COpaquePointer?, localsystemtime: COpaquePointer?, localfiletime: COpaquePointer?): Bool =
    if (_windowsWin32SystemTimeNapiAddon != null) (_windowsWin32SystemTimeNapiAddon.windowssys_windows_win32_system_time_localSystemTimeToLocalFileTime((timezoneinformation?.value ?: 0L).toString(), (localsystemtime?.value ?: 0L).toString(), (localfiletime?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDynamicTimeZoneInformation(lptimezoneinformation: COpaquePointer?): Bool =
    if (_windowsWin32SystemTimeNapiAddon != null) (_windowsWin32SystemTimeNapiAddon.windowssys_windows_win32_system_time_setDynamicTimeZoneInformation((lptimezoneinformation?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setTimeZoneInformation(lptimezoneinformation: COpaquePointer?): Bool =
    if (_windowsWin32SystemTimeNapiAddon != null) (_windowsWin32SystemTimeNapiAddon.windowssys_windows_win32_system_time_setTimeZoneInformation((lptimezoneinformation?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun systemTimeToFileTime(lpsystemtime: COpaquePointer?, lpfiletime: COpaquePointer?): Bool =
    if (_windowsWin32SystemTimeNapiAddon != null) (_windowsWin32SystemTimeNapiAddon.windowssys_windows_win32_system_time_systemTimeToFileTime((lpsystemtime?.value ?: 0L).toString(), (lpfiletime?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun systemTimeToTzSpecificLocalTime(lptimezoneinformation: COpaquePointer?, lpuniversaltime: COpaquePointer?, lplocaltime: COpaquePointer?): Bool =
    if (_windowsWin32SystemTimeNapiAddon != null) (_windowsWin32SystemTimeNapiAddon.windowssys_windows_win32_system_time_systemTimeToTzSpecificLocalTime((lptimezoneinformation?.value ?: 0L).toString(), (lpuniversaltime?.value ?: 0L).toString(), (lplocaltime?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun systemTimeToTzSpecificLocalTimeEx(lptimezoneinformation: COpaquePointer?, lpuniversaltime: COpaquePointer?, lplocaltime: COpaquePointer?): Bool =
    if (_windowsWin32SystemTimeNapiAddon != null) (_windowsWin32SystemTimeNapiAddon.windowssys_windows_win32_system_time_systemTimeToTzSpecificLocalTimeEx((lptimezoneinformation?.value ?: 0L).toString(), (lpuniversaltime?.value ?: 0L).toString(), (lplocaltime?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tzSpecificLocalTimeToSystemTime(lptimezoneinformation: COpaquePointer?, lplocaltime: COpaquePointer?, lpuniversaltime: COpaquePointer?): Bool =
    if (_windowsWin32SystemTimeNapiAddon != null) (_windowsWin32SystemTimeNapiAddon.windowssys_windows_win32_system_time_tzSpecificLocalTimeToSystemTime((lptimezoneinformation?.value ?: 0L).toString(), (lplocaltime?.value ?: 0L).toString(), (lpuniversaltime?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tzSpecificLocalTimeToSystemTimeEx(lptimezoneinformation: COpaquePointer?, lplocaltime: COpaquePointer?, lpuniversaltime: COpaquePointer?): Bool =
    if (_windowsWin32SystemTimeNapiAddon != null) (_windowsWin32SystemTimeNapiAddon.windowssys_windows_win32_system_time_tzSpecificLocalTimeToSystemTimeEx((lptimezoneinformation?.value ?: 0L).toString(), (lplocaltime?.value ?: 0L).toString(), (lpuniversaltime?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
