@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Wndenumproc

private val _windowsWin32SystemStationsanddesktopsNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun broadcastSystemMessageA(flags: UInt, lpinfo: COpaquePointer?, msg: UInt, wparam: Wparam, lparam: Lparam): Int =
    if (_windowsWin32SystemStationsanddesktopsNapiAddon != null) (_windowsWin32SystemStationsanddesktopsNapiAddon.windowssys_windows_win32_system_stationsanddesktops_broadcastSystemMessageA(flags.toInt(), (lpinfo?.value ?: 0L).toString(), msg.toInt(), wparam.toString(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun broadcastSystemMessageExA(flags: BroadcastSystemMessageFlags, lpinfo: COpaquePointer?, msg: UInt, wparam: Wparam, lparam: Lparam, pbsminfo: COpaquePointer?): Int =
    if (_windowsWin32SystemStationsanddesktopsNapiAddon != null) (_windowsWin32SystemStationsanddesktopsNapiAddon.windowssys_windows_win32_system_stationsanddesktops_broadcastSystemMessageExA(flags.toInt(), (lpinfo?.value ?: 0L).toString(), msg.toInt(), wparam.toString(), lparam.toString(), (pbsminfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun broadcastSystemMessageExW(flags: BroadcastSystemMessageFlags, lpinfo: COpaquePointer?, msg: UInt, wparam: Wparam, lparam: Lparam, pbsminfo: COpaquePointer?): Int =
    if (_windowsWin32SystemStationsanddesktopsNapiAddon != null) (_windowsWin32SystemStationsanddesktopsNapiAddon.windowssys_windows_win32_system_stationsanddesktops_broadcastSystemMessageExW(flags.toInt(), (lpinfo?.value ?: 0L).toString(), msg.toInt(), wparam.toString(), lparam.toString(), (pbsminfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun broadcastSystemMessageW(flags: BroadcastSystemMessageFlags, lpinfo: COpaquePointer?, msg: UInt, wparam: Wparam, lparam: Lparam): Int =
    if (_windowsWin32SystemStationsanddesktopsNapiAddon != null) (_windowsWin32SystemStationsanddesktopsNapiAddon.windowssys_windows_win32_system_stationsanddesktops_broadcastSystemMessageW(flags.toInt(), (lpinfo?.value ?: 0L).toString(), msg.toInt(), wparam.toString(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeDesktop(hdesktop: Hdesk): Bool =
    if (_windowsWin32SystemStationsanddesktopsNapiAddon != null) (_windowsWin32SystemStationsanddesktopsNapiAddon.windowssys_windows_win32_system_stationsanddesktops_closeDesktop((hdesktop?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeWindowStation(hwinsta: Hwinsta): Bool =
    if (_windowsWin32SystemStationsanddesktopsNapiAddon != null) (_windowsWin32SystemStationsanddesktopsNapiAddon.windowssys_windows_win32_system_stationsanddesktops_closeWindowStation((hwinsta?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDesktopA(lpszdesktop: Pcstr, lpszdevice: Pcstr, pdevmode: COpaquePointer?, dwflags: DesktopControlFlags, dwdesiredaccess: UInt, lpsa: COpaquePointer?): Hdesk =
    if (_windowsWin32SystemStationsanddesktopsNapiAddon != null) (_windowsWin32SystemStationsanddesktopsNapiAddon.windowssys_windows_win32_system_stationsanddesktops_createDesktopA((lpszdesktop?.value ?: 0L).toString(), (lpszdevice?.value ?: 0L).toString(), (pdevmode?.value ?: 0L).toString(), dwflags.toInt(), dwdesiredaccess.toInt(), (lpsa?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDesktopExA(lpszdesktop: Pcstr, lpszdevice: Pcstr, pdevmode: COpaquePointer?, dwflags: DesktopControlFlags, dwdesiredaccess: UInt, lpsa: COpaquePointer?, ulheapsize: UInt, pvoid: COpaquePointer?): Hdesk =
    if (_windowsWin32SystemStationsanddesktopsNapiAddon != null) (_windowsWin32SystemStationsanddesktopsNapiAddon.windowssys_windows_win32_system_stationsanddesktops_createDesktopExA((lpszdesktop?.value ?: 0L).toString(), (lpszdevice?.value ?: 0L).toString(), (pdevmode?.value ?: 0L).toString(), dwflags.toInt(), dwdesiredaccess.toInt(), (lpsa?.value ?: 0L).toString(), ulheapsize.toInt(), (pvoid?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDesktopExW(lpszdesktop: Pcwstr, lpszdevice: Pcwstr, pdevmode: COpaquePointer?, dwflags: DesktopControlFlags, dwdesiredaccess: UInt, lpsa: COpaquePointer?, ulheapsize: UInt, pvoid: COpaquePointer?): Hdesk =
    if (_windowsWin32SystemStationsanddesktopsNapiAddon != null) (_windowsWin32SystemStationsanddesktopsNapiAddon.windowssys_windows_win32_system_stationsanddesktops_createDesktopExW((lpszdesktop?.value ?: 0L).toString(), (lpszdevice?.value ?: 0L).toString(), (pdevmode?.value ?: 0L).toString(), dwflags.toInt(), dwdesiredaccess.toInt(), (lpsa?.value ?: 0L).toString(), ulheapsize.toInt(), (pvoid?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDesktopW(lpszdesktop: Pcwstr, lpszdevice: Pcwstr, pdevmode: COpaquePointer?, dwflags: DesktopControlFlags, dwdesiredaccess: UInt, lpsa: COpaquePointer?): Hdesk =
    if (_windowsWin32SystemStationsanddesktopsNapiAddon != null) (_windowsWin32SystemStationsanddesktopsNapiAddon.windowssys_windows_win32_system_stationsanddesktops_createDesktopW((lpszdesktop?.value ?: 0L).toString(), (lpszdevice?.value ?: 0L).toString(), (pdevmode?.value ?: 0L).toString(), dwflags.toInt(), dwdesiredaccess.toInt(), (lpsa?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createWindowStationA(lpwinsta: Pcstr, dwflags: UInt, dwdesiredaccess: UInt, lpsa: COpaquePointer?): Hwinsta =
    if (_windowsWin32SystemStationsanddesktopsNapiAddon != null) (_windowsWin32SystemStationsanddesktopsNapiAddon.windowssys_windows_win32_system_stationsanddesktops_createWindowStationA((lpwinsta?.value ?: 0L).toString(), dwflags.toInt(), dwdesiredaccess.toInt(), (lpsa?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createWindowStationW(lpwinsta: Pcwstr, dwflags: UInt, dwdesiredaccess: UInt, lpsa: COpaquePointer?): Hwinsta =
    if (_windowsWin32SystemStationsanddesktopsNapiAddon != null) (_windowsWin32SystemStationsanddesktopsNapiAddon.windowssys_windows_win32_system_stationsanddesktops_createWindowStationW((lpwinsta?.value ?: 0L).toString(), dwflags.toInt(), dwdesiredaccess.toInt(), (lpsa?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumDesktopWindows(hdesktop: Hdesk, lpfn: Wndenumproc, lparam: Lparam): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumDesktopsA(hwinsta: Hwinsta, lpenumfunc: Desktopenumproca, lparam: Lparam): Bool =
    if (_windowsWin32SystemStationsanddesktopsNapiAddon != null) (_windowsWin32SystemStationsanddesktopsNapiAddon.windowssys_windows_win32_system_stationsanddesktops_enumDesktopsA((hwinsta?.value ?: 0L).toString(), 0L.toString(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumDesktopsW(hwinsta: Hwinsta, lpenumfunc: Desktopenumprocw, lparam: Lparam): Bool =
    if (_windowsWin32SystemStationsanddesktopsNapiAddon != null) (_windowsWin32SystemStationsanddesktopsNapiAddon.windowssys_windows_win32_system_stationsanddesktops_enumDesktopsW((hwinsta?.value ?: 0L).toString(), 0L.toString(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumWindowStationsA(lpenumfunc: Winstaenumproca, lparam: Lparam): Bool =
    if (_windowsWin32SystemStationsanddesktopsNapiAddon != null) (_windowsWin32SystemStationsanddesktopsNapiAddon.windowssys_windows_win32_system_stationsanddesktops_enumWindowStationsA(0L.toString(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumWindowStationsW(lpenumfunc: Winstaenumprocw, lparam: Lparam): Bool =
    if (_windowsWin32SystemStationsanddesktopsNapiAddon != null) (_windowsWin32SystemStationsanddesktopsNapiAddon.windowssys_windows_win32_system_stationsanddesktops_enumWindowStationsW(0L.toString(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessWindowStation(): Hwinsta =
    if (_windowsWin32SystemStationsanddesktopsNapiAddon != null) (_windowsWin32SystemStationsanddesktopsNapiAddon.windowssys_windows_win32_system_stationsanddesktops_getProcessWindowStation() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadDesktop(dwthreadid: UInt): Hdesk =
    if (_windowsWin32SystemStationsanddesktopsNapiAddon != null) (_windowsWin32SystemStationsanddesktopsNapiAddon.windowssys_windows_win32_system_stationsanddesktops_getThreadDesktop(dwthreadid.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUserObjectInformationA(hobj: Handle, nindex: UserObjectInformationIndex, pvinfo: COpaquePointer?, nlength: UInt, lpnlengthneeded: COpaquePointer?): Bool =
    if (_windowsWin32SystemStationsanddesktopsNapiAddon != null) (_windowsWin32SystemStationsanddesktopsNapiAddon.windowssys_windows_win32_system_stationsanddesktops_getUserObjectInformationA((hobj?.value ?: 0L).toString(), nindex, (pvinfo?.value ?: 0L).toString(), nlength.toInt(), (lpnlengthneeded?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUserObjectInformationW(hobj: Handle, nindex: UserObjectInformationIndex, pvinfo: COpaquePointer?, nlength: UInt, lpnlengthneeded: COpaquePointer?): Bool =
    if (_windowsWin32SystemStationsanddesktopsNapiAddon != null) (_windowsWin32SystemStationsanddesktopsNapiAddon.windowssys_windows_win32_system_stationsanddesktops_getUserObjectInformationW((hobj?.value ?: 0L).toString(), nindex, (pvinfo?.value ?: 0L).toString(), nlength.toInt(), (lpnlengthneeded?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openDesktopA(lpszdesktop: Pcstr, dwflags: DesktopControlFlags, finherit: Bool, dwdesiredaccess: UInt): Hdesk =
    if (_windowsWin32SystemStationsanddesktopsNapiAddon != null) (_windowsWin32SystemStationsanddesktopsNapiAddon.windowssys_windows_win32_system_stationsanddesktops_openDesktopA((lpszdesktop?.value ?: 0L).toString(), dwflags.toInt(), finherit, dwdesiredaccess.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openDesktopW(lpszdesktop: Pcwstr, dwflags: DesktopControlFlags, finherit: Bool, dwdesiredaccess: UInt): Hdesk =
    if (_windowsWin32SystemStationsanddesktopsNapiAddon != null) (_windowsWin32SystemStationsanddesktopsNapiAddon.windowssys_windows_win32_system_stationsanddesktops_openDesktopW((lpszdesktop?.value ?: 0L).toString(), dwflags.toInt(), finherit, dwdesiredaccess.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openInputDesktop(dwflags: DesktopControlFlags, finherit: Bool, dwdesiredaccess: DesktopAccessFlags): Hdesk =
    if (_windowsWin32SystemStationsanddesktopsNapiAddon != null) (_windowsWin32SystemStationsanddesktopsNapiAddon.windowssys_windows_win32_system_stationsanddesktops_openInputDesktop(dwflags.toInt(), finherit, dwdesiredaccess.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openWindowStationA(lpszwinsta: Pcstr, finherit: Bool, dwdesiredaccess: UInt): Hwinsta =
    if (_windowsWin32SystemStationsanddesktopsNapiAddon != null) (_windowsWin32SystemStationsanddesktopsNapiAddon.windowssys_windows_win32_system_stationsanddesktops_openWindowStationA((lpszwinsta?.value ?: 0L).toString(), finherit, dwdesiredaccess.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openWindowStationW(lpszwinsta: Pcwstr, finherit: Bool, dwdesiredaccess: UInt): Hwinsta =
    if (_windowsWin32SystemStationsanddesktopsNapiAddon != null) (_windowsWin32SystemStationsanddesktopsNapiAddon.windowssys_windows_win32_system_stationsanddesktops_openWindowStationW((lpszwinsta?.value ?: 0L).toString(), finherit, dwdesiredaccess.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProcessWindowStation(hwinsta: Hwinsta): Bool =
    if (_windowsWin32SystemStationsanddesktopsNapiAddon != null) (_windowsWin32SystemStationsanddesktopsNapiAddon.windowssys_windows_win32_system_stationsanddesktops_setProcessWindowStation((hwinsta?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadDesktop(hdesktop: Hdesk): Bool =
    if (_windowsWin32SystemStationsanddesktopsNapiAddon != null) (_windowsWin32SystemStationsanddesktopsNapiAddon.windowssys_windows_win32_system_stationsanddesktops_setThreadDesktop((hdesktop?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setUserObjectInformationA(hobj: Handle, nindex: Int, pvinfo: COpaquePointer?, nlength: UInt): Bool =
    if (_windowsWin32SystemStationsanddesktopsNapiAddon != null) (_windowsWin32SystemStationsanddesktopsNapiAddon.windowssys_windows_win32_system_stationsanddesktops_setUserObjectInformationA((hobj?.value ?: 0L).toString(), nindex, (pvinfo?.value ?: 0L).toString(), nlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setUserObjectInformationW(hobj: Handle, nindex: Int, pvinfo: COpaquePointer?, nlength: UInt): Bool =
    if (_windowsWin32SystemStationsanddesktopsNapiAddon != null) (_windowsWin32SystemStationsanddesktopsNapiAddon.windowssys_windows_win32_system_stationsanddesktops_setUserObjectInformationW((hobj?.value ?: 0L).toString(), nindex, (pvinfo?.value ?: 0L).toString(), nlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun switchDesktop(hdesktop: Hdesk): Bool =
    if (_windowsWin32SystemStationsanddesktopsNapiAddon != null) (_windowsWin32SystemStationsanddesktopsNapiAddon.windowssys_windows_win32_system_stationsanddesktops_switchDesktop((hdesktop?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
