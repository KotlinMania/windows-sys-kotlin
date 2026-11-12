@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.shutdown

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SystemShutdownNapiAddon(): Boolean

private val windowsWin32SystemShutdownNapiAvailable: Boolean = initWindowsWin32SystemShutdownNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemShutdownAbortSystemShutdownA(p0)")
private external fun wasmWindowssysWindowsWin32SystemShutdownAbortSystemShutdownA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemShutdownAbortSystemShutdownW(p0)")
private external fun wasmWindowssysWindowsWin32SystemShutdownAbortSystemShutdownW(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemShutdownCheckForHiberboot(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemShutdownCheckForHiberboot(p0: String, p1: Boolean): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemShutdownExitWindowsEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemShutdownExitWindowsEx(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemShutdownInitiateShutdownA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemShutdownInitiateShutdownA(p0: String, p1: String, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemShutdownInitiateShutdownW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemShutdownInitiateShutdownW(p0: String, p1: String, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemShutdownInitiateSystemShutdownA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemShutdownInitiateSystemShutdownA(p0: String, p1: String, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemShutdownInitiateSystemShutdownExA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemShutdownInitiateSystemShutdownExA(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemShutdownInitiateSystemShutdownExW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemShutdownInitiateSystemShutdownExW(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemShutdownInitiateSystemShutdownW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemShutdownInitiateSystemShutdownW(p0: String, p1: String, p2: Int, p3: Int, p4: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemShutdownLockWorkStation()")
private external fun wasmWindowssysWindowsWin32SystemShutdownLockWorkStation(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemShutdownShutdownBlockReasonCreate(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemShutdownShutdownBlockReasonCreate(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemShutdownShutdownBlockReasonDestroy(p0)")
private external fun wasmWindowssysWindowsWin32SystemShutdownShutdownBlockReasonDestroy(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemShutdownShutdownBlockReasonQuery(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemShutdownShutdownBlockReasonQuery(p0: String, p1: String, p2: String): Int

public actual fun abortSystemShutdownA(lpmachinename: Pcstr): Bool =
    if (windowsWin32SystemShutdownNapiAvailable) wasmWindowssysWindowsWin32SystemShutdownAbortSystemShutdownA(lpmachinename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun abortSystemShutdownW(lpmachinename: Pcwstr): Bool =
    if (windowsWin32SystemShutdownNapiAvailable) wasmWindowssysWindowsWin32SystemShutdownAbortSystemShutdownW(lpmachinename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun checkForHiberboot(phiberboot: MutPtr, bclearflag: Boolean): UInt =
    if (windowsWin32SystemShutdownNapiAvailable) wasmWindowssysWindowsWin32SystemShutdownCheckForHiberboot(phiberboot.rawAddress.toString(), bclearflag).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exitWindowsEx(uflags: ExitWindowsFlags, dwreason: ShutdownReason): Bool =
    if (windowsWin32SystemShutdownNapiAvailable) wasmWindowssysWindowsWin32SystemShutdownExitWindowsEx(uflags.toInt(), dwreason.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initiateShutdownA(lpmachinename: Pcstr, lpmessage: Pcstr, dwgraceperiod: UInt, dwshutdownflags: ShutdownFlags, dwreason: ShutdownReason): UInt =
    if (windowsWin32SystemShutdownNapiAvailable) wasmWindowssysWindowsWin32SystemShutdownInitiateShutdownA(lpmachinename.rawAddress.toString(), lpmessage.rawAddress.toString(), dwgraceperiod.toInt(), dwshutdownflags.toInt(), dwreason.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initiateShutdownW(lpmachinename: Pcwstr, lpmessage: Pcwstr, dwgraceperiod: UInt, dwshutdownflags: ShutdownFlags, dwreason: ShutdownReason): UInt =
    if (windowsWin32SystemShutdownNapiAvailable) wasmWindowssysWindowsWin32SystemShutdownInitiateShutdownW(lpmachinename.rawAddress.toString(), lpmessage.rawAddress.toString(), dwgraceperiod.toInt(), dwshutdownflags.toInt(), dwreason.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initiateSystemShutdownA(lpmachinename: Pcstr, lpmessage: Pcstr, dwtimeout: UInt, bforceappsclosed: Bool, brebootaftershutdown: Bool): Bool =
    if (windowsWin32SystemShutdownNapiAvailable) wasmWindowssysWindowsWin32SystemShutdownInitiateSystemShutdownA(lpmachinename.rawAddress.toString(), lpmessage.rawAddress.toString(), dwtimeout.toInt(), bforceappsclosed, brebootaftershutdown) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initiateSystemShutdownExA(lpmachinename: Pcstr, lpmessage: Pcstr, dwtimeout: UInt, bforceappsclosed: Bool, brebootaftershutdown: Bool, dwreason: ShutdownReason): Bool =
    if (windowsWin32SystemShutdownNapiAvailable) wasmWindowssysWindowsWin32SystemShutdownInitiateSystemShutdownExA(lpmachinename.rawAddress.toString(), lpmessage.rawAddress.toString(), dwtimeout.toInt(), bforceappsclosed, brebootaftershutdown, dwreason.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initiateSystemShutdownExW(lpmachinename: Pcwstr, lpmessage: Pcwstr, dwtimeout: UInt, bforceappsclosed: Bool, brebootaftershutdown: Bool, dwreason: ShutdownReason): Bool =
    if (windowsWin32SystemShutdownNapiAvailable) wasmWindowssysWindowsWin32SystemShutdownInitiateSystemShutdownExW(lpmachinename.rawAddress.toString(), lpmessage.rawAddress.toString(), dwtimeout.toInt(), bforceappsclosed, brebootaftershutdown, dwreason.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initiateSystemShutdownW(lpmachinename: Pcwstr, lpmessage: Pcwstr, dwtimeout: UInt, bforceappsclosed: Bool, brebootaftershutdown: Bool): Bool =
    if (windowsWin32SystemShutdownNapiAvailable) wasmWindowssysWindowsWin32SystemShutdownInitiateSystemShutdownW(lpmachinename.rawAddress.toString(), lpmessage.rawAddress.toString(), dwtimeout.toInt(), bforceappsclosed, brebootaftershutdown) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lockWorkStation(): Bool =
    if (windowsWin32SystemShutdownNapiAvailable) wasmWindowssysWindowsWin32SystemShutdownLockWorkStation() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shutdownBlockReasonCreate(hwnd: Hwnd, pwszreason: Pcwstr): Bool =
    if (windowsWin32SystemShutdownNapiAvailable) wasmWindowssysWindowsWin32SystemShutdownShutdownBlockReasonCreate(hwnd.rawAddress.toString(), pwszreason.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shutdownBlockReasonDestroy(hwnd: Hwnd): Bool =
    if (windowsWin32SystemShutdownNapiAvailable) wasmWindowssysWindowsWin32SystemShutdownShutdownBlockReasonDestroy(hwnd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shutdownBlockReasonQuery(hwnd: Hwnd, pwszbuff: Pwstr, pcchbuff: MutPtr): Bool =
    if (windowsWin32SystemShutdownNapiAvailable) wasmWindowssysWindowsWin32SystemShutdownShutdownBlockReasonQuery(hwnd.rawAddress.toString(), pwszbuff.rawAddress.toString(), pcchbuff.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
