@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.serialcommunication

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32DevicesSerialcommunicationNapiAddon(): Boolean

private val windowsWin32DevicesSerialcommunicationNapiAvailable: Boolean = initWindowsWin32DevicesSerialcommunicationNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesSerialcommunicationComDBClaimNextFreePort(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesSerialcommunicationComDBClaimNextFreePort(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesSerialcommunicationComDBClaimPort(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesSerialcommunicationComDBClaimPort(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesSerialcommunicationComDBClose(p0)")
private external fun wasmWindowssysWindowsWin32DevicesSerialcommunicationComDBClose(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesSerialcommunicationComDBGetCurrentPortUsage(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DevicesSerialcommunicationComDBGetCurrentPortUsage(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesSerialcommunicationComDBOpen(p0)")
private external fun wasmWindowssysWindowsWin32DevicesSerialcommunicationComDBOpen(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesSerialcommunicationComDBReleasePort(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesSerialcommunicationComDBReleasePort(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesSerialcommunicationComDBResizeDatabase(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesSerialcommunicationComDBResizeDatabase(p0: String, p1: Int): Int

public actual fun comDBClaimNextFreePort(hcomdb: Hcomdb, comnumber: MutPtr): Int =
    if (windowsWin32DevicesSerialcommunicationNapiAvailable) wasmWindowssysWindowsWin32DevicesSerialcommunicationComDBClaimNextFreePort(hcomdb.rawAddress.toString(), comnumber.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun comDBClaimPort(hcomdb: Hcomdb, comnumber: UInt, forceclaim: Bool, forced: MutPtr): Int =
    if (windowsWin32DevicesSerialcommunicationNapiAvailable) wasmWindowssysWindowsWin32DevicesSerialcommunicationComDBClaimPort(hcomdb.rawAddress.toString(), comnumber.toInt(), forceclaim, forced.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun comDBClose(hcomdb: Hcomdb): Int =
    if (windowsWin32DevicesSerialcommunicationNapiAvailable) wasmWindowssysWindowsWin32DevicesSerialcommunicationComDBClose(hcomdb.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun comDBGetCurrentPortUsage(hcomdb: Hcomdb, buffer: MutPtr, buffersize: UInt, reporttype: UInt, maxportsreported: MutPtr): Int =
    if (windowsWin32DevicesSerialcommunicationNapiAvailable) wasmWindowssysWindowsWin32DevicesSerialcommunicationComDBGetCurrentPortUsage(hcomdb.rawAddress.toString(), buffer.rawAddress.toString(), buffersize.toInt(), reporttype.toInt(), maxportsreported.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun comDBOpen(phcomdb: MutPtr): Int =
    if (windowsWin32DevicesSerialcommunicationNapiAvailable) wasmWindowssysWindowsWin32DevicesSerialcommunicationComDBOpen(phcomdb.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun comDBReleasePort(hcomdb: Hcomdb, comnumber: UInt): Int =
    if (windowsWin32DevicesSerialcommunicationNapiAvailable) wasmWindowssysWindowsWin32DevicesSerialcommunicationComDBReleasePort(hcomdb.rawAddress.toString(), comnumber.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun comDBResizeDatabase(hcomdb: Hcomdb, newsize: UInt): Int =
    if (windowsWin32DevicesSerialcommunicationNapiAvailable) wasmWindowssysWindowsWin32DevicesSerialcommunicationComDBResizeDatabase(hcomdb.rawAddress.toString(), newsize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")
