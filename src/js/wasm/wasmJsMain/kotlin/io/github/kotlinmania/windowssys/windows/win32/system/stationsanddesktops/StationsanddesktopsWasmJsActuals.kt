@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Wndenumproc

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32SystemStationsanddesktopsNapiAddon(): Boolean

private val _windowsWin32SystemStationsanddesktopsNapiAvailable: Boolean = _initWindowsWin32SystemStationsanddesktopsNapiAddon()

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_stationsanddesktops_broadcastSystemMessageA(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_stationsanddesktops_broadcastSystemMessageA(p0: Int, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_stationsanddesktops_broadcastSystemMessageExA(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_stationsanddesktops_broadcastSystemMessageExA(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_stationsanddesktops_broadcastSystemMessageExW(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_stationsanddesktops_broadcastSystemMessageExW(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_stationsanddesktops_broadcastSystemMessageW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_stationsanddesktops_broadcastSystemMessageW(p0: Int, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_stationsanddesktops_closeDesktop(p0)")
private external fun _wasm_windowssys_windows_win32_system_stationsanddesktops_closeDesktop(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_stationsanddesktops_closeWindowStation(p0)")
private external fun _wasm_windowssys_windows_win32_system_stationsanddesktops_closeWindowStation(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_stationsanddesktops_createDesktopA(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_stationsanddesktops_createDesktopA(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_stationsanddesktops_createDesktopExA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_system_stationsanddesktops_createDesktopExA(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: Int, p7: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_stationsanddesktops_createDesktopExW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_system_stationsanddesktops_createDesktopExW(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: Int, p7: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_stationsanddesktops_createDesktopW(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_stationsanddesktops_createDesktopW(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_stationsanddesktops_createWindowStationA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_stationsanddesktops_createWindowStationA(p0: String, p1: Int, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_stationsanddesktops_createWindowStationW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_stationsanddesktops_createWindowStationW(p0: String, p1: Int, p2: Int, p3: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_stationsanddesktops_enumDesktopsA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_stationsanddesktops_enumDesktopsA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_stationsanddesktops_enumDesktopsW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_stationsanddesktops_enumDesktopsW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_stationsanddesktops_enumWindowStationsA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_stationsanddesktops_enumWindowStationsA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_stationsanddesktops_enumWindowStationsW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_stationsanddesktops_enumWindowStationsW(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_stationsanddesktops_getProcessWindowStation()")
private external fun _wasm_windowssys_windows_win32_system_stationsanddesktops_getProcessWindowStation(): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_stationsanddesktops_getThreadDesktop(p0)")
private external fun _wasm_windowssys_windows_win32_system_stationsanddesktops_getThreadDesktop(p0: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_stationsanddesktops_getUserObjectInformationA(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_stationsanddesktops_getUserObjectInformationA(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_stationsanddesktops_getUserObjectInformationW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_stationsanddesktops_getUserObjectInformationW(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_stationsanddesktops_openDesktopA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_stationsanddesktops_openDesktopA(p0: String, p1: Int, p2: Int, p3: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_stationsanddesktops_openDesktopW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_stationsanddesktops_openDesktopW(p0: String, p1: Int, p2: Int, p3: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_stationsanddesktops_openInputDesktop(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_stationsanddesktops_openInputDesktop(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_stationsanddesktops_openWindowStationA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_stationsanddesktops_openWindowStationA(p0: String, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_stationsanddesktops_openWindowStationW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_stationsanddesktops_openWindowStationW(p0: String, p1: Int, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_stationsanddesktops_setProcessWindowStation(p0)")
private external fun _wasm_windowssys_windows_win32_system_stationsanddesktops_setProcessWindowStation(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_stationsanddesktops_setThreadDesktop(p0)")
private external fun _wasm_windowssys_windows_win32_system_stationsanddesktops_setThreadDesktop(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_stationsanddesktops_setUserObjectInformationA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_stationsanddesktops_setUserObjectInformationA(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_stationsanddesktops_setUserObjectInformationW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_stationsanddesktops_setUserObjectInformationW(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_stationsanddesktops_switchDesktop(p0)")
private external fun _wasm_windowssys_windows_win32_system_stationsanddesktops_switchDesktop(p0: String): Int

public actual fun broadcastSystemMessageA(flags: UInt, lpinfo: COpaquePointer?, msg: UInt, wparam: Wparam, lparam: Lparam): Int =
    if (_windowsWin32SystemStationsanddesktopsNapiAvailable) _wasm_windowssys_windows_win32_system_stationsanddesktops_broadcastSystemMessageA(flags.toInt(), (lpinfo?.value ?: 0L).toString(), msg.toInt(), wparam.toString(), lparam.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun broadcastSystemMessageExA(flags: BroadcastSystemMessageFlags, lpinfo: COpaquePointer?, msg: UInt, wparam: Wparam, lparam: Lparam, pbsminfo: COpaquePointer?): Int =
    if (_windowsWin32SystemStationsanddesktopsNapiAvailable) _wasm_windowssys_windows_win32_system_stationsanddesktops_broadcastSystemMessageExA(flags.toInt(), (lpinfo?.value ?: 0L).toString(), msg.toInt(), wparam.toString(), lparam.toString(), (pbsminfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun broadcastSystemMessageExW(flags: BroadcastSystemMessageFlags, lpinfo: COpaquePointer?, msg: UInt, wparam: Wparam, lparam: Lparam, pbsminfo: COpaquePointer?): Int =
    if (_windowsWin32SystemStationsanddesktopsNapiAvailable) _wasm_windowssys_windows_win32_system_stationsanddesktops_broadcastSystemMessageExW(flags.toInt(), (lpinfo?.value ?: 0L).toString(), msg.toInt(), wparam.toString(), lparam.toString(), (pbsminfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun broadcastSystemMessageW(flags: BroadcastSystemMessageFlags, lpinfo: COpaquePointer?, msg: UInt, wparam: Wparam, lparam: Lparam): Int =
    if (_windowsWin32SystemStationsanddesktopsNapiAvailable) _wasm_windowssys_windows_win32_system_stationsanddesktops_broadcastSystemMessageW(flags.toInt(), (lpinfo?.value ?: 0L).toString(), msg.toInt(), wparam.toString(), lparam.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeDesktop(hdesktop: Hdesk): Bool =
    if (_windowsWin32SystemStationsanddesktopsNapiAvailable) _wasm_windowssys_windows_win32_system_stationsanddesktops_closeDesktop((hdesktop?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeWindowStation(hwinsta: Hwinsta): Bool =
    if (_windowsWin32SystemStationsanddesktopsNapiAvailable) _wasm_windowssys_windows_win32_system_stationsanddesktops_closeWindowStation((hwinsta?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDesktopA(lpszdesktop: Pcstr, lpszdevice: Pcstr, pdevmode: COpaquePointer?, dwflags: DesktopControlFlags, dwdesiredaccess: UInt, lpsa: COpaquePointer?): Hdesk =
    if (_windowsWin32SystemStationsanddesktopsNapiAvailable) _wasm_windowssys_windows_win32_system_stationsanddesktops_createDesktopA((lpszdesktop?.value ?: 0L).toString(), (lpszdevice?.value ?: 0L).toString(), (pdevmode?.value ?: 0L).toString(), dwflags.toInt(), dwdesiredaccess.toInt(), (lpsa?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDesktopExA(lpszdesktop: Pcstr, lpszdevice: Pcstr, pdevmode: COpaquePointer?, dwflags: DesktopControlFlags, dwdesiredaccess: UInt, lpsa: COpaquePointer?, ulheapsize: UInt, pvoid: COpaquePointer?): Hdesk =
    if (_windowsWin32SystemStationsanddesktopsNapiAvailable) _wasm_windowssys_windows_win32_system_stationsanddesktops_createDesktopExA((lpszdesktop?.value ?: 0L).toString(), (lpszdevice?.value ?: 0L).toString(), (pdevmode?.value ?: 0L).toString(), dwflags.toInt(), dwdesiredaccess.toInt(), (lpsa?.value ?: 0L).toString(), ulheapsize.toInt(), (pvoid?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDesktopExW(lpszdesktop: Pcwstr, lpszdevice: Pcwstr, pdevmode: COpaquePointer?, dwflags: DesktopControlFlags, dwdesiredaccess: UInt, lpsa: COpaquePointer?, ulheapsize: UInt, pvoid: COpaquePointer?): Hdesk =
    if (_windowsWin32SystemStationsanddesktopsNapiAvailable) _wasm_windowssys_windows_win32_system_stationsanddesktops_createDesktopExW((lpszdesktop?.value ?: 0L).toString(), (lpszdevice?.value ?: 0L).toString(), (pdevmode?.value ?: 0L).toString(), dwflags.toInt(), dwdesiredaccess.toInt(), (lpsa?.value ?: 0L).toString(), ulheapsize.toInt(), (pvoid?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDesktopW(lpszdesktop: Pcwstr, lpszdevice: Pcwstr, pdevmode: COpaquePointer?, dwflags: DesktopControlFlags, dwdesiredaccess: UInt, lpsa: COpaquePointer?): Hdesk =
    if (_windowsWin32SystemStationsanddesktopsNapiAvailable) _wasm_windowssys_windows_win32_system_stationsanddesktops_createDesktopW((lpszdesktop?.value ?: 0L).toString(), (lpszdevice?.value ?: 0L).toString(), (pdevmode?.value ?: 0L).toString(), dwflags.toInt(), dwdesiredaccess.toInt(), (lpsa?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createWindowStationA(lpwinsta: Pcstr, dwflags: UInt, dwdesiredaccess: UInt, lpsa: COpaquePointer?): Hwinsta =
    if (_windowsWin32SystemStationsanddesktopsNapiAvailable) _wasm_windowssys_windows_win32_system_stationsanddesktops_createWindowStationA((lpwinsta?.value ?: 0L).toString(), dwflags.toInt(), dwdesiredaccess.toInt(), (lpsa?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createWindowStationW(lpwinsta: Pcwstr, dwflags: UInt, dwdesiredaccess: UInt, lpsa: COpaquePointer?): Hwinsta =
    if (_windowsWin32SystemStationsanddesktopsNapiAvailable) _wasm_windowssys_windows_win32_system_stationsanddesktops_createWindowStationW((lpwinsta?.value ?: 0L).toString(), dwflags.toInt(), dwdesiredaccess.toInt(), (lpsa?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumDesktopWindows(hdesktop: Hdesk, lpfn: Wndenumproc, lparam: Lparam): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumDesktopsA(hwinsta: Hwinsta, lpenumfunc: Desktopenumproca, lparam: Lparam): Bool =
    if (_windowsWin32SystemStationsanddesktopsNapiAvailable) _wasm_windowssys_windows_win32_system_stationsanddesktops_enumDesktopsA((hwinsta?.value ?: 0L).toString(), 0L.toString(), lparam.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumDesktopsW(hwinsta: Hwinsta, lpenumfunc: Desktopenumprocw, lparam: Lparam): Bool =
    if (_windowsWin32SystemStationsanddesktopsNapiAvailable) _wasm_windowssys_windows_win32_system_stationsanddesktops_enumDesktopsW((hwinsta?.value ?: 0L).toString(), 0L.toString(), lparam.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumWindowStationsA(lpenumfunc: Winstaenumproca, lparam: Lparam): Bool =
    if (_windowsWin32SystemStationsanddesktopsNapiAvailable) _wasm_windowssys_windows_win32_system_stationsanddesktops_enumWindowStationsA(0L.toString(), lparam.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumWindowStationsW(lpenumfunc: Winstaenumprocw, lparam: Lparam): Bool =
    if (_windowsWin32SystemStationsanddesktopsNapiAvailable) _wasm_windowssys_windows_win32_system_stationsanddesktops_enumWindowStationsW(0L.toString(), lparam.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessWindowStation(): Hwinsta =
    if (_windowsWin32SystemStationsanddesktopsNapiAvailable) _wasm_windowssys_windows_win32_system_stationsanddesktops_getProcessWindowStation().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadDesktop(dwthreadid: UInt): Hdesk =
    if (_windowsWin32SystemStationsanddesktopsNapiAvailable) _wasm_windowssys_windows_win32_system_stationsanddesktops_getThreadDesktop(dwthreadid.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUserObjectInformationA(hobj: Handle, nindex: UserObjectInformationIndex, pvinfo: COpaquePointer?, nlength: UInt, lpnlengthneeded: COpaquePointer?): Bool =
    if (_windowsWin32SystemStationsanddesktopsNapiAvailable) _wasm_windowssys_windows_win32_system_stationsanddesktops_getUserObjectInformationA((hobj?.value ?: 0L).toString(), nindex, (pvinfo?.value ?: 0L).toString(), nlength.toInt(), (lpnlengthneeded?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUserObjectInformationW(hobj: Handle, nindex: UserObjectInformationIndex, pvinfo: COpaquePointer?, nlength: UInt, lpnlengthneeded: COpaquePointer?): Bool =
    if (_windowsWin32SystemStationsanddesktopsNapiAvailable) _wasm_windowssys_windows_win32_system_stationsanddesktops_getUserObjectInformationW((hobj?.value ?: 0L).toString(), nindex, (pvinfo?.value ?: 0L).toString(), nlength.toInt(), (lpnlengthneeded?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openDesktopA(lpszdesktop: Pcstr, dwflags: DesktopControlFlags, finherit: Bool, dwdesiredaccess: UInt): Hdesk =
    if (_windowsWin32SystemStationsanddesktopsNapiAvailable) _wasm_windowssys_windows_win32_system_stationsanddesktops_openDesktopA((lpszdesktop?.value ?: 0L).toString(), dwflags.toInt(), finherit, dwdesiredaccess.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openDesktopW(lpszdesktop: Pcwstr, dwflags: DesktopControlFlags, finherit: Bool, dwdesiredaccess: UInt): Hdesk =
    if (_windowsWin32SystemStationsanddesktopsNapiAvailable) _wasm_windowssys_windows_win32_system_stationsanddesktops_openDesktopW((lpszdesktop?.value ?: 0L).toString(), dwflags.toInt(), finherit, dwdesiredaccess.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openInputDesktop(dwflags: DesktopControlFlags, finherit: Bool, dwdesiredaccess: DesktopAccessFlags): Hdesk =
    if (_windowsWin32SystemStationsanddesktopsNapiAvailable) _wasm_windowssys_windows_win32_system_stationsanddesktops_openInputDesktop(dwflags.toInt(), finherit, dwdesiredaccess.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openWindowStationA(lpszwinsta: Pcstr, finherit: Bool, dwdesiredaccess: UInt): Hwinsta =
    if (_windowsWin32SystemStationsanddesktopsNapiAvailable) _wasm_windowssys_windows_win32_system_stationsanddesktops_openWindowStationA((lpszwinsta?.value ?: 0L).toString(), finherit, dwdesiredaccess.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openWindowStationW(lpszwinsta: Pcwstr, finherit: Bool, dwdesiredaccess: UInt): Hwinsta =
    if (_windowsWin32SystemStationsanddesktopsNapiAvailable) _wasm_windowssys_windows_win32_system_stationsanddesktops_openWindowStationW((lpszwinsta?.value ?: 0L).toString(), finherit, dwdesiredaccess.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProcessWindowStation(hwinsta: Hwinsta): Bool =
    if (_windowsWin32SystemStationsanddesktopsNapiAvailable) _wasm_windowssys_windows_win32_system_stationsanddesktops_setProcessWindowStation((hwinsta?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadDesktop(hdesktop: Hdesk): Bool =
    if (_windowsWin32SystemStationsanddesktopsNapiAvailable) _wasm_windowssys_windows_win32_system_stationsanddesktops_setThreadDesktop((hdesktop?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setUserObjectInformationA(hobj: Handle, nindex: Int, pvinfo: COpaquePointer?, nlength: UInt): Bool =
    if (_windowsWin32SystemStationsanddesktopsNapiAvailable) _wasm_windowssys_windows_win32_system_stationsanddesktops_setUserObjectInformationA((hobj?.value ?: 0L).toString(), nindex, (pvinfo?.value ?: 0L).toString(), nlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setUserObjectInformationW(hobj: Handle, nindex: Int, pvinfo: COpaquePointer?, nlength: UInt): Bool =
    if (_windowsWin32SystemStationsanddesktopsNapiAvailable) _wasm_windowssys_windows_win32_system_stationsanddesktops_setUserObjectInformationW((hobj?.value ?: 0L).toString(), nindex, (pvinfo?.value ?: 0L).toString(), nlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun switchDesktop(hdesktop: Hdesk): Bool =
    if (_windowsWin32SystemStationsanddesktopsNapiAvailable) _wasm_windowssys_windows_win32_system_stationsanddesktops_switchDesktop((hdesktop?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
