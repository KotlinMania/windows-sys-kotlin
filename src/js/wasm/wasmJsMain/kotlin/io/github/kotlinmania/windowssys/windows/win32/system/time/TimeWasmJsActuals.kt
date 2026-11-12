@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.time

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SystemTimeNapiAddon(): Boolean

private val windowsWin32SystemTimeNapiAvailable: Boolean = initWindowsWin32SystemTimeNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemTimeEnumDynamicTimeZoneInformation(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemTimeEnumDynamicTimeZoneInformation(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemTimeFileTimeToSystemTime(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemTimeFileTimeToSystemTime(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemTimeGetDynamicTimeZoneInformation(p0)")
private external fun wasmWindowssysWindowsWin32SystemTimeGetDynamicTimeZoneInformation(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemTimeGetDynamicTimeZoneInformationEffectiveYears(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemTimeGetDynamicTimeZoneInformationEffectiveYears(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemTimeGetTimeZoneInformation(p0)")
private external fun wasmWindowssysWindowsWin32SystemTimeGetTimeZoneInformation(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemTimeGetTimeZoneInformationForYear(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemTimeGetTimeZoneInformationForYear(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemTimeLocalFileTimeToLocalSystemTime(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemTimeLocalFileTimeToLocalSystemTime(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemTimeLocalSystemTimeToLocalFileTime(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemTimeLocalSystemTimeToLocalFileTime(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemTimeSetDynamicTimeZoneInformation(p0)")
private external fun wasmWindowssysWindowsWin32SystemTimeSetDynamicTimeZoneInformation(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemTimeSetTimeZoneInformation(p0)")
private external fun wasmWindowssysWindowsWin32SystemTimeSetTimeZoneInformation(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemTimeSystemTimeToFileTime(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemTimeSystemTimeToFileTime(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemTimeSystemTimeToTzSpecificLocalTime(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemTimeSystemTimeToTzSpecificLocalTime(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemTimeSystemTimeToTzSpecificLocalTimeEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemTimeSystemTimeToTzSpecificLocalTimeEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemTimeTzSpecificLocalTimeToSystemTime(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemTimeTzSpecificLocalTimeToSystemTime(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemTimeTzSpecificLocalTimeToSystemTimeEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemTimeTzSpecificLocalTimeToSystemTimeEx(p0: String, p1: String, p2: String): Int

public actual fun enumDynamicTimeZoneInformation(dwindex: UInt, lptimezoneinformation: MutPtr): UInt =
    if (windowsWin32SystemTimeNapiAvailable) wasmWindowssysWindowsWin32SystemTimeEnumDynamicTimeZoneInformation(dwindex.toInt(), lptimezoneinformation.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fileTimeToSystemTime(lpfiletime: ConstPtr, lpsystemtime: MutPtr): Bool =
    if (windowsWin32SystemTimeNapiAvailable) wasmWindowssysWindowsWin32SystemTimeFileTimeToSystemTime(lpfiletime.rawAddress.toString(), lpsystemtime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDynamicTimeZoneInformation(ptimezoneinformation: MutPtr): UInt =
    if (windowsWin32SystemTimeNapiAvailable) wasmWindowssysWindowsWin32SystemTimeGetDynamicTimeZoneInformation(ptimezoneinformation.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDynamicTimeZoneInformationEffectiveYears(lptimezoneinformation: ConstPtr, firstyear: MutPtr, lastyear: MutPtr): UInt =
    if (windowsWin32SystemTimeNapiAvailable) wasmWindowssysWindowsWin32SystemTimeGetDynamicTimeZoneInformationEffectiveYears(lptimezoneinformation.rawAddress.toString(), firstyear.rawAddress.toString(), lastyear.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTimeZoneInformation(lptimezoneinformation: MutPtr): UInt =
    if (windowsWin32SystemTimeNapiAvailable) wasmWindowssysWindowsWin32SystemTimeGetTimeZoneInformation(lptimezoneinformation.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTimeZoneInformationForYear(wyear: UShort, pdtzi: ConstPtr, ptzi: MutPtr): Bool =
    if (windowsWin32SystemTimeNapiAvailable) wasmWindowssysWindowsWin32SystemTimeGetTimeZoneInformationForYear(wyear.toInt(), pdtzi.rawAddress.toString(), ptzi.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localFileTimeToLocalSystemTime(timezoneinformation: ConstPtr, localfiletime: ConstPtr, localsystemtime: MutPtr): Bool =
    if (windowsWin32SystemTimeNapiAvailable) wasmWindowssysWindowsWin32SystemTimeLocalFileTimeToLocalSystemTime(timezoneinformation.rawAddress.toString(), localfiletime.rawAddress.toString(), localsystemtime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localSystemTimeToLocalFileTime(timezoneinformation: ConstPtr, localsystemtime: ConstPtr, localfiletime: MutPtr): Bool =
    if (windowsWin32SystemTimeNapiAvailable) wasmWindowssysWindowsWin32SystemTimeLocalSystemTimeToLocalFileTime(timezoneinformation.rawAddress.toString(), localsystemtime.rawAddress.toString(), localfiletime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDynamicTimeZoneInformation(lptimezoneinformation: ConstPtr): Bool =
    if (windowsWin32SystemTimeNapiAvailable) wasmWindowssysWindowsWin32SystemTimeSetDynamicTimeZoneInformation(lptimezoneinformation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setTimeZoneInformation(lptimezoneinformation: ConstPtr): Bool =
    if (windowsWin32SystemTimeNapiAvailable) wasmWindowssysWindowsWin32SystemTimeSetTimeZoneInformation(lptimezoneinformation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun systemTimeToFileTime(lpsystemtime: ConstPtr, lpfiletime: MutPtr): Bool =
    if (windowsWin32SystemTimeNapiAvailable) wasmWindowssysWindowsWin32SystemTimeSystemTimeToFileTime(lpsystemtime.rawAddress.toString(), lpfiletime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun systemTimeToTzSpecificLocalTime(lptimezoneinformation: ConstPtr, lpuniversaltime: ConstPtr, lplocaltime: MutPtr): Bool =
    if (windowsWin32SystemTimeNapiAvailable) wasmWindowssysWindowsWin32SystemTimeSystemTimeToTzSpecificLocalTime(lptimezoneinformation.rawAddress.toString(), lpuniversaltime.rawAddress.toString(), lplocaltime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun systemTimeToTzSpecificLocalTimeEx(lptimezoneinformation: ConstPtr, lpuniversaltime: ConstPtr, lplocaltime: MutPtr): Bool =
    if (windowsWin32SystemTimeNapiAvailable) wasmWindowssysWindowsWin32SystemTimeSystemTimeToTzSpecificLocalTimeEx(lptimezoneinformation.rawAddress.toString(), lpuniversaltime.rawAddress.toString(), lplocaltime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tzSpecificLocalTimeToSystemTime(lptimezoneinformation: ConstPtr, lplocaltime: ConstPtr, lpuniversaltime: MutPtr): Bool =
    if (windowsWin32SystemTimeNapiAvailable) wasmWindowssysWindowsWin32SystemTimeTzSpecificLocalTimeToSystemTime(lptimezoneinformation.rawAddress.toString(), lplocaltime.rawAddress.toString(), lpuniversaltime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tzSpecificLocalTimeToSystemTimeEx(lptimezoneinformation: ConstPtr, lplocaltime: ConstPtr, lpuniversaltime: MutPtr): Bool =
    if (windowsWin32SystemTimeNapiAvailable) wasmWindowssysWindowsWin32SystemTimeTzSpecificLocalTimeToSystemTimeEx(lptimezoneinformation.rawAddress.toString(), lplocaltime.rawAddress.toString(), lpuniversaltime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
