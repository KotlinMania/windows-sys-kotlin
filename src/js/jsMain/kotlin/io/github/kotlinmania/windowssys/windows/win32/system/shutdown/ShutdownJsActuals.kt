@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.shutdown

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

private val windowsWin32SystemShutdownNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun abortSystemShutdownA(lpmachinename: Pcstr): Bool =
    if (windowsWin32SystemShutdownNapiAddon != null) (windowsWin32SystemShutdownNapiAddon.windowssysWindowsWin32SystemShutdownAbortSystemShutdownA(lpmachinename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun abortSystemShutdownW(lpmachinename: Pcwstr): Bool =
    if (windowsWin32SystemShutdownNapiAddon != null) (windowsWin32SystemShutdownNapiAddon.windowssysWindowsWin32SystemShutdownAbortSystemShutdownW(lpmachinename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun checkForHiberboot(phiberboot: MutPtr<Boolean>, bclearflag: Boolean): UInt =
    if (windowsWin32SystemShutdownNapiAddon != null) (windowsWin32SystemShutdownNapiAddon.windowssysWindowsWin32SystemShutdownCheckForHiberboot(phiberboot.rawAddress.toString(), bclearflag) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exitWindowsEx(uflags: ExitWindowsFlags, dwreason: ShutdownReason): Bool =
    if (windowsWin32SystemShutdownNapiAddon != null) (windowsWin32SystemShutdownNapiAddon.windowssysWindowsWin32SystemShutdownExitWindowsEx(uflags.toInt(), dwreason.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initiateShutdownA(lpmachinename: Pcstr, lpmessage: Pcstr, dwgraceperiod: UInt, dwshutdownflags: ShutdownFlags, dwreason: ShutdownReason): UInt =
    if (windowsWin32SystemShutdownNapiAddon != null) (windowsWin32SystemShutdownNapiAddon.windowssysWindowsWin32SystemShutdownInitiateShutdownA(lpmachinename.rawAddress.toString(), lpmessage.rawAddress.toString(), dwgraceperiod.toInt(), dwshutdownflags.toInt(), dwreason.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initiateShutdownW(lpmachinename: Pcwstr, lpmessage: Pcwstr, dwgraceperiod: UInt, dwshutdownflags: ShutdownFlags, dwreason: ShutdownReason): UInt =
    if (windowsWin32SystemShutdownNapiAddon != null) (windowsWin32SystemShutdownNapiAddon.windowssysWindowsWin32SystemShutdownInitiateShutdownW(lpmachinename.rawAddress.toString(), lpmessage.rawAddress.toString(), dwgraceperiod.toInt(), dwshutdownflags.toInt(), dwreason.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initiateSystemShutdownA(lpmachinename: Pcstr, lpmessage: Pcstr, dwtimeout: UInt, bforceappsclosed: Bool, brebootaftershutdown: Bool): Bool =
    if (windowsWin32SystemShutdownNapiAddon != null) (windowsWin32SystemShutdownNapiAddon.windowssysWindowsWin32SystemShutdownInitiateSystemShutdownA(lpmachinename.rawAddress.toString(), lpmessage.rawAddress.toString(), dwtimeout.toInt(), bforceappsclosed, brebootaftershutdown) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initiateSystemShutdownExA(lpmachinename: Pcstr, lpmessage: Pcstr, dwtimeout: UInt, bforceappsclosed: Bool, brebootaftershutdown: Bool, dwreason: ShutdownReason): Bool =
    if (windowsWin32SystemShutdownNapiAddon != null) (windowsWin32SystemShutdownNapiAddon.windowssysWindowsWin32SystemShutdownInitiateSystemShutdownExA(lpmachinename.rawAddress.toString(), lpmessage.rawAddress.toString(), dwtimeout.toInt(), bforceappsclosed, brebootaftershutdown, dwreason.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initiateSystemShutdownExW(lpmachinename: Pcwstr, lpmessage: Pcwstr, dwtimeout: UInt, bforceappsclosed: Bool, brebootaftershutdown: Bool, dwreason: ShutdownReason): Bool =
    if (windowsWin32SystemShutdownNapiAddon != null) (windowsWin32SystemShutdownNapiAddon.windowssysWindowsWin32SystemShutdownInitiateSystemShutdownExW(lpmachinename.rawAddress.toString(), lpmessage.rawAddress.toString(), dwtimeout.toInt(), bforceappsclosed, brebootaftershutdown, dwreason.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initiateSystemShutdownW(lpmachinename: Pcwstr, lpmessage: Pcwstr, dwtimeout: UInt, bforceappsclosed: Bool, brebootaftershutdown: Bool): Bool =
    if (windowsWin32SystemShutdownNapiAddon != null) (windowsWin32SystemShutdownNapiAddon.windowssysWindowsWin32SystemShutdownInitiateSystemShutdownW(lpmachinename.rawAddress.toString(), lpmessage.rawAddress.toString(), dwtimeout.toInt(), bforceappsclosed, brebootaftershutdown) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lockWorkStation(): Bool =
    if (windowsWin32SystemShutdownNapiAddon != null) (windowsWin32SystemShutdownNapiAddon.windowssysWindowsWin32SystemShutdownLockWorkStation() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shutdownBlockReasonCreate(hwnd: Hwnd, pwszreason: Pcwstr): Bool =
    if (windowsWin32SystemShutdownNapiAddon != null) (windowsWin32SystemShutdownNapiAddon.windowssysWindowsWin32SystemShutdownShutdownBlockReasonCreate(hwnd.rawAddress.toString(), pwszreason.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shutdownBlockReasonDestroy(hwnd: Hwnd): Bool =
    if (windowsWin32SystemShutdownNapiAddon != null) (windowsWin32SystemShutdownNapiAddon.windowssysWindowsWin32SystemShutdownShutdownBlockReasonDestroy(hwnd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shutdownBlockReasonQuery(hwnd: Hwnd, pwszbuff: Pwstr, pcchbuff: MutPtr<UInt>): Bool =
    if (windowsWin32SystemShutdownNapiAddon != null) (windowsWin32SystemShutdownNapiAddon.windowssysWindowsWin32SystemShutdownShutdownBlockReasonQuery(hwnd.rawAddress.toString(), pwszbuff.rawAddress.toString(), pcchbuff.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
