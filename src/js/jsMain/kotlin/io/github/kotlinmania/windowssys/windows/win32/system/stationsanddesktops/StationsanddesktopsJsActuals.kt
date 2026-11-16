@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Wndenumproc

private val windowsWin32SystemStationsanddesktopsNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun broadcastSystemMessageA(flags: UInt, lpinfo: MutPtr, msg: UInt, wparam: Wparam, lparam: Lparam): Int =
    if (windowsWin32SystemStationsanddesktopsNapiAddon != null) (windowsWin32SystemStationsanddesktopsNapiAddon.windowssysWindowsWin32SystemStationsanddesktopsBroadcastSystemMessageA(flags.toInt(), lpinfo.rawAddress.toString(), msg.toInt(), wparam.toString(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun broadcastSystemMessageExA(flags: BroadcastSystemMessageFlags, lpinfo: MutPtr, msg: UInt, wparam: Wparam, lparam: Lparam, pbsminfo: MutPtr): Int =
    if (windowsWin32SystemStationsanddesktopsNapiAddon != null) (windowsWin32SystemStationsanddesktopsNapiAddon.windowssysWindowsWin32SystemStationsanddesktopsBroadcastSystemMessageExA(flags.toInt(), lpinfo.rawAddress.toString(), msg.toInt(), wparam.toString(), lparam.toString(), pbsminfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun broadcastSystemMessageExW(flags: BroadcastSystemMessageFlags, lpinfo: MutPtr, msg: UInt, wparam: Wparam, lparam: Lparam, pbsminfo: MutPtr): Int =
    if (windowsWin32SystemStationsanddesktopsNapiAddon != null) (windowsWin32SystemStationsanddesktopsNapiAddon.windowssysWindowsWin32SystemStationsanddesktopsBroadcastSystemMessageExW(flags.toInt(), lpinfo.rawAddress.toString(), msg.toInt(), wparam.toString(), lparam.toString(), pbsminfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun broadcastSystemMessageW(flags: BroadcastSystemMessageFlags, lpinfo: MutPtr, msg: UInt, wparam: Wparam, lparam: Lparam): Int =
    if (windowsWin32SystemStationsanddesktopsNapiAddon != null) (windowsWin32SystemStationsanddesktopsNapiAddon.windowssysWindowsWin32SystemStationsanddesktopsBroadcastSystemMessageW(flags.toInt(), lpinfo.rawAddress.toString(), msg.toInt(), wparam.toString(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeDesktop(hdesktop: Hdesk): Bool =
    if (windowsWin32SystemStationsanddesktopsNapiAddon != null) (windowsWin32SystemStationsanddesktopsNapiAddon.windowssysWindowsWin32SystemStationsanddesktopsCloseDesktop(hdesktop.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeWindowStation(hwinsta: Hwinsta): Bool =
    if (windowsWin32SystemStationsanddesktopsNapiAddon != null) (windowsWin32SystemStationsanddesktopsNapiAddon.windowssysWindowsWin32SystemStationsanddesktopsCloseWindowStation(hwinsta.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDesktopA(lpszdesktop: Pcstr, lpszdevice: Pcstr, pdevmode: ConstPtr, dwflags: DesktopControlFlags, dwdesiredaccess: UInt, lpsa: ConstPtr): Hdesk =
    if (windowsWin32SystemStationsanddesktopsNapiAddon != null) MutPtr((windowsWin32SystemStationsanddesktopsNapiAddon.windowssysWindowsWin32SystemStationsanddesktopsCreateDesktopA(lpszdesktop.rawAddress.toString(), lpszdevice.rawAddress.toString(), pdevmode.rawAddress.toString(), dwflags.toInt(), dwdesiredaccess.toInt(), lpsa.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDesktopExA(lpszdesktop: Pcstr, lpszdevice: Pcstr, pdevmode: ConstPtr, dwflags: DesktopControlFlags, dwdesiredaccess: UInt, lpsa: ConstPtr, ulheapsize: UInt, pvoid: ConstPtr): Hdesk =
    if (windowsWin32SystemStationsanddesktopsNapiAddon != null) MutPtr((windowsWin32SystemStationsanddesktopsNapiAddon.windowssysWindowsWin32SystemStationsanddesktopsCreateDesktopExA(lpszdesktop.rawAddress.toString(), lpszdevice.rawAddress.toString(), pdevmode.rawAddress.toString(), dwflags.toInt(), dwdesiredaccess.toInt(), lpsa.rawAddress.toString(), ulheapsize.toInt(), pvoid.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDesktopExW(lpszdesktop: Pcwstr, lpszdevice: Pcwstr, pdevmode: ConstPtr, dwflags: DesktopControlFlags, dwdesiredaccess: UInt, lpsa: ConstPtr, ulheapsize: UInt, pvoid: ConstPtr): Hdesk =
    if (windowsWin32SystemStationsanddesktopsNapiAddon != null) MutPtr((windowsWin32SystemStationsanddesktopsNapiAddon.windowssysWindowsWin32SystemStationsanddesktopsCreateDesktopExW(lpszdesktop.rawAddress.toString(), lpszdevice.rawAddress.toString(), pdevmode.rawAddress.toString(), dwflags.toInt(), dwdesiredaccess.toInt(), lpsa.rawAddress.toString(), ulheapsize.toInt(), pvoid.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDesktopW(lpszdesktop: Pcwstr, lpszdevice: Pcwstr, pdevmode: ConstPtr, dwflags: DesktopControlFlags, dwdesiredaccess: UInt, lpsa: ConstPtr): Hdesk =
    if (windowsWin32SystemStationsanddesktopsNapiAddon != null) MutPtr((windowsWin32SystemStationsanddesktopsNapiAddon.windowssysWindowsWin32SystemStationsanddesktopsCreateDesktopW(lpszdesktop.rawAddress.toString(), lpszdevice.rawAddress.toString(), pdevmode.rawAddress.toString(), dwflags.toInt(), dwdesiredaccess.toInt(), lpsa.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createWindowStationA(lpwinsta: Pcstr, dwflags: UInt, dwdesiredaccess: UInt, lpsa: ConstPtr): Hwinsta =
    if (windowsWin32SystemStationsanddesktopsNapiAddon != null) MutPtr((windowsWin32SystemStationsanddesktopsNapiAddon.windowssysWindowsWin32SystemStationsanddesktopsCreateWindowStationA(lpwinsta.rawAddress.toString(), dwflags.toInt(), dwdesiredaccess.toInt(), lpsa.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createWindowStationW(lpwinsta: Pcwstr, dwflags: UInt, dwdesiredaccess: UInt, lpsa: ConstPtr): Hwinsta =
    if (windowsWin32SystemStationsanddesktopsNapiAddon != null) MutPtr((windowsWin32SystemStationsanddesktopsNapiAddon.windowssysWindowsWin32SystemStationsanddesktopsCreateWindowStationW(lpwinsta.rawAddress.toString(), dwflags.toInt(), dwdesiredaccess.toInt(), lpsa.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumDesktopWindows(hdesktop: Hdesk, lpfn: Wndenumproc, lparam: Lparam): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumDesktopsA(hwinsta: Hwinsta, lpenumfunc: Desktopenumproca, lparam: Lparam): Bool =
    if (windowsWin32SystemStationsanddesktopsNapiAddon != null) (windowsWin32SystemStationsanddesktopsNapiAddon.windowssysWindowsWin32SystemStationsanddesktopsEnumDesktopsA(hwinsta.rawAddress.toString(), 0L.toString(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumDesktopsW(hwinsta: Hwinsta, lpenumfunc: Desktopenumprocw, lparam: Lparam): Bool =
    if (windowsWin32SystemStationsanddesktopsNapiAddon != null) (windowsWin32SystemStationsanddesktopsNapiAddon.windowssysWindowsWin32SystemStationsanddesktopsEnumDesktopsW(hwinsta.rawAddress.toString(), 0L.toString(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumWindowStationsA(lpenumfunc: Winstaenumproca, lparam: Lparam): Bool =
    if (windowsWin32SystemStationsanddesktopsNapiAddon != null) (windowsWin32SystemStationsanddesktopsNapiAddon.windowssysWindowsWin32SystemStationsanddesktopsEnumWindowStationsA(0L.toString(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumWindowStationsW(lpenumfunc: Winstaenumprocw, lparam: Lparam): Bool =
    if (windowsWin32SystemStationsanddesktopsNapiAddon != null) (windowsWin32SystemStationsanddesktopsNapiAddon.windowssysWindowsWin32SystemStationsanddesktopsEnumWindowStationsW(0L.toString(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessWindowStation(): Hwinsta =
    if (windowsWin32SystemStationsanddesktopsNapiAddon != null) MutPtr((windowsWin32SystemStationsanddesktopsNapiAddon.windowssysWindowsWin32SystemStationsanddesktopsGetProcessWindowStation() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadDesktop(dwthreadid: UInt): Hdesk =
    if (windowsWin32SystemStationsanddesktopsNapiAddon != null) MutPtr((windowsWin32SystemStationsanddesktopsNapiAddon.windowssysWindowsWin32SystemStationsanddesktopsGetThreadDesktop(dwthreadid.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUserObjectInformationA(hobj: Handle, nindex: UserObjectInformationIndex, pvinfo: MutPtr, nlength: UInt, lpnlengthneeded: MutPtr): Bool =
    if (windowsWin32SystemStationsanddesktopsNapiAddon != null) (windowsWin32SystemStationsanddesktopsNapiAddon.windowssysWindowsWin32SystemStationsanddesktopsGetUserObjectInformationA(hobj.rawAddress.toString(), nindex, pvinfo.rawAddress.toString(), nlength.toInt(), lpnlengthneeded.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUserObjectInformationW(hobj: Handle, nindex: UserObjectInformationIndex, pvinfo: MutPtr, nlength: UInt, lpnlengthneeded: MutPtr): Bool =
    if (windowsWin32SystemStationsanddesktopsNapiAddon != null) (windowsWin32SystemStationsanddesktopsNapiAddon.windowssysWindowsWin32SystemStationsanddesktopsGetUserObjectInformationW(hobj.rawAddress.toString(), nindex, pvinfo.rawAddress.toString(), nlength.toInt(), lpnlengthneeded.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openDesktopA(lpszdesktop: Pcstr, dwflags: DesktopControlFlags, finherit: Bool, dwdesiredaccess: UInt): Hdesk =
    if (windowsWin32SystemStationsanddesktopsNapiAddon != null) MutPtr((windowsWin32SystemStationsanddesktopsNapiAddon.windowssysWindowsWin32SystemStationsanddesktopsOpenDesktopA(lpszdesktop.rawAddress.toString(), dwflags.toInt(), finherit, dwdesiredaccess.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openDesktopW(lpszdesktop: Pcwstr, dwflags: DesktopControlFlags, finherit: Bool, dwdesiredaccess: UInt): Hdesk =
    if (windowsWin32SystemStationsanddesktopsNapiAddon != null) MutPtr((windowsWin32SystemStationsanddesktopsNapiAddon.windowssysWindowsWin32SystemStationsanddesktopsOpenDesktopW(lpszdesktop.rawAddress.toString(), dwflags.toInt(), finherit, dwdesiredaccess.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openInputDesktop(dwflags: DesktopControlFlags, finherit: Bool, dwdesiredaccess: DesktopAccessFlags): Hdesk =
    if (windowsWin32SystemStationsanddesktopsNapiAddon != null) MutPtr((windowsWin32SystemStationsanddesktopsNapiAddon.windowssysWindowsWin32SystemStationsanddesktopsOpenInputDesktop(dwflags.toInt(), finherit, dwdesiredaccess.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openWindowStationA(lpszwinsta: Pcstr, finherit: Bool, dwdesiredaccess: UInt): Hwinsta =
    if (windowsWin32SystemStationsanddesktopsNapiAddon != null) MutPtr((windowsWin32SystemStationsanddesktopsNapiAddon.windowssysWindowsWin32SystemStationsanddesktopsOpenWindowStationA(lpszwinsta.rawAddress.toString(), finherit, dwdesiredaccess.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openWindowStationW(lpszwinsta: Pcwstr, finherit: Bool, dwdesiredaccess: UInt): Hwinsta =
    if (windowsWin32SystemStationsanddesktopsNapiAddon != null) MutPtr((windowsWin32SystemStationsanddesktopsNapiAddon.windowssysWindowsWin32SystemStationsanddesktopsOpenWindowStationW(lpszwinsta.rawAddress.toString(), finherit, dwdesiredaccess.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProcessWindowStation(hwinsta: Hwinsta): Bool =
    if (windowsWin32SystemStationsanddesktopsNapiAddon != null) (windowsWin32SystemStationsanddesktopsNapiAddon.windowssysWindowsWin32SystemStationsanddesktopsSetProcessWindowStation(hwinsta.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadDesktop(hdesktop: Hdesk): Bool =
    if (windowsWin32SystemStationsanddesktopsNapiAddon != null) (windowsWin32SystemStationsanddesktopsNapiAddon.windowssysWindowsWin32SystemStationsanddesktopsSetThreadDesktop(hdesktop.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setUserObjectInformationA(hobj: Handle, nindex: Int, pvinfo: ConstPtr, nlength: UInt): Bool =
    if (windowsWin32SystemStationsanddesktopsNapiAddon != null) (windowsWin32SystemStationsanddesktopsNapiAddon.windowssysWindowsWin32SystemStationsanddesktopsSetUserObjectInformationA(hobj.rawAddress.toString(), nindex, pvinfo.rawAddress.toString(), nlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setUserObjectInformationW(hobj: Handle, nindex: Int, pvinfo: ConstPtr, nlength: UInt): Bool =
    if (windowsWin32SystemStationsanddesktopsNapiAddon != null) (windowsWin32SystemStationsanddesktopsNapiAddon.windowssysWindowsWin32SystemStationsanddesktopsSetUserObjectInformationW(hobj.rawAddress.toString(), nindex, pvinfo.rawAddress.toString(), nlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun switchDesktop(hdesktop: Hdesk): Bool =
    if (windowsWin32SystemStationsanddesktopsNapiAddon != null) (windowsWin32SystemStationsanddesktopsNapiAddon.windowssysWindowsWin32SystemStationsanddesktopsSwitchDesktop(hdesktop.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
