@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.time

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Systemtime

private val windowsWin32SystemTimeNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun enumDynamicTimeZoneInformation(dwindex: UInt, lptimezoneinformation: MutPtr<DynamicTimeZoneInformation>): UInt =
    if (windowsWin32SystemTimeNapiAddon != null) (windowsWin32SystemTimeNapiAddon.windowssysWindowsWin32SystemTimeEnumDynamicTimeZoneInformation(dwindex.toInt(), lptimezoneinformation.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fileTimeToSystemTime(lpfiletime: ConstPtr<Filetime>, lpsystemtime: MutPtr<Systemtime>): Bool =
    if (windowsWin32SystemTimeNapiAddon != null) (windowsWin32SystemTimeNapiAddon.windowssysWindowsWin32SystemTimeFileTimeToSystemTime(lpfiletime.rawAddress.toString(), lpsystemtime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDynamicTimeZoneInformation(ptimezoneinformation: MutPtr<DynamicTimeZoneInformation>): UInt =
    if (windowsWin32SystemTimeNapiAddon != null) (windowsWin32SystemTimeNapiAddon.windowssysWindowsWin32SystemTimeGetDynamicTimeZoneInformation(ptimezoneinformation.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDynamicTimeZoneInformationEffectiveYears(lptimezoneinformation: ConstPtr<DynamicTimeZoneInformation>, firstyear: MutPtr<UInt>, lastyear: MutPtr<UInt>): UInt =
    if (windowsWin32SystemTimeNapiAddon != null) (windowsWin32SystemTimeNapiAddon.windowssysWindowsWin32SystemTimeGetDynamicTimeZoneInformationEffectiveYears(lptimezoneinformation.rawAddress.toString(), firstyear.rawAddress.toString(), lastyear.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTimeZoneInformation(lptimezoneinformation: MutPtr<TimeZoneInformation>): UInt =
    if (windowsWin32SystemTimeNapiAddon != null) (windowsWin32SystemTimeNapiAddon.windowssysWindowsWin32SystemTimeGetTimeZoneInformation(lptimezoneinformation.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTimeZoneInformationForYear(wyear: UShort, pdtzi: ConstPtr<DynamicTimeZoneInformation>, ptzi: MutPtr<TimeZoneInformation>): Bool =
    if (windowsWin32SystemTimeNapiAddon != null) (windowsWin32SystemTimeNapiAddon.windowssysWindowsWin32SystemTimeGetTimeZoneInformationForYear(wyear.toInt(), pdtzi.rawAddress.toString(), ptzi.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localFileTimeToLocalSystemTime(timezoneinformation: ConstPtr<TimeZoneInformation>, localfiletime: ConstPtr<Filetime>, localsystemtime: MutPtr<Systemtime>): Bool =
    if (windowsWin32SystemTimeNapiAddon != null) (windowsWin32SystemTimeNapiAddon.windowssysWindowsWin32SystemTimeLocalFileTimeToLocalSystemTime(timezoneinformation.rawAddress.toString(), localfiletime.rawAddress.toString(), localsystemtime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localSystemTimeToLocalFileTime(timezoneinformation: ConstPtr<TimeZoneInformation>, localsystemtime: ConstPtr<Systemtime>, localfiletime: MutPtr<Filetime>): Bool =
    if (windowsWin32SystemTimeNapiAddon != null) (windowsWin32SystemTimeNapiAddon.windowssysWindowsWin32SystemTimeLocalSystemTimeToLocalFileTime(timezoneinformation.rawAddress.toString(), localsystemtime.rawAddress.toString(), localfiletime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDynamicTimeZoneInformation(lptimezoneinformation: ConstPtr<DynamicTimeZoneInformation>): Bool =
    if (windowsWin32SystemTimeNapiAddon != null) (windowsWin32SystemTimeNapiAddon.windowssysWindowsWin32SystemTimeSetDynamicTimeZoneInformation(lptimezoneinformation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setTimeZoneInformation(lptimezoneinformation: ConstPtr<TimeZoneInformation>): Bool =
    if (windowsWin32SystemTimeNapiAddon != null) (windowsWin32SystemTimeNapiAddon.windowssysWindowsWin32SystemTimeSetTimeZoneInformation(lptimezoneinformation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun systemTimeToFileTime(lpsystemtime: ConstPtr<Systemtime>, lpfiletime: MutPtr<Filetime>): Bool =
    if (windowsWin32SystemTimeNapiAddon != null) (windowsWin32SystemTimeNapiAddon.windowssysWindowsWin32SystemTimeSystemTimeToFileTime(lpsystemtime.rawAddress.toString(), lpfiletime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun systemTimeToTzSpecificLocalTime(lptimezoneinformation: ConstPtr<TimeZoneInformation>, lpuniversaltime: ConstPtr<Systemtime>, lplocaltime: MutPtr<Systemtime>): Bool =
    if (windowsWin32SystemTimeNapiAddon != null) (windowsWin32SystemTimeNapiAddon.windowssysWindowsWin32SystemTimeSystemTimeToTzSpecificLocalTime(lptimezoneinformation.rawAddress.toString(), lpuniversaltime.rawAddress.toString(), lplocaltime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun systemTimeToTzSpecificLocalTimeEx(lptimezoneinformation: ConstPtr<DynamicTimeZoneInformation>, lpuniversaltime: ConstPtr<Systemtime>, lplocaltime: MutPtr<Systemtime>): Bool =
    if (windowsWin32SystemTimeNapiAddon != null) (windowsWin32SystemTimeNapiAddon.windowssysWindowsWin32SystemTimeSystemTimeToTzSpecificLocalTimeEx(lptimezoneinformation.rawAddress.toString(), lpuniversaltime.rawAddress.toString(), lplocaltime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tzSpecificLocalTimeToSystemTime(lptimezoneinformation: ConstPtr<TimeZoneInformation>, lplocaltime: ConstPtr<Systemtime>, lpuniversaltime: MutPtr<Systemtime>): Bool =
    if (windowsWin32SystemTimeNapiAddon != null) (windowsWin32SystemTimeNapiAddon.windowssysWindowsWin32SystemTimeTzSpecificLocalTimeToSystemTime(lptimezoneinformation.rawAddress.toString(), lplocaltime.rawAddress.toString(), lpuniversaltime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tzSpecificLocalTimeToSystemTimeEx(lptimezoneinformation: ConstPtr<DynamicTimeZoneInformation>, lplocaltime: ConstPtr<Systemtime>, lpuniversaltime: MutPtr<Systemtime>): Bool =
    if (windowsWin32SystemTimeNapiAddon != null) (windowsWin32SystemTimeNapiAddon.windowssysWindowsWin32SystemTimeTzSpecificLocalTimeToSystemTimeEx(lptimezoneinformation.rawAddress.toString(), lplocaltime.rawAddress.toString(), lpuniversaltime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
