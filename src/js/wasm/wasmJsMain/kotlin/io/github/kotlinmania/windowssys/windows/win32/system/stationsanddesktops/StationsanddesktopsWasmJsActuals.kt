@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Devmodea
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Devmodew
import io.github.kotlinmania.windowssys.windows.win32.security.SecurityAttributes
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Wndenumproc

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SystemStationsanddesktopsNapiAddon(): Boolean

private val windowsWin32SystemStationsanddesktopsNapiAvailable: Boolean = initWindowsWin32SystemStationsanddesktopsNapiAddon()

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemStationsanddesktopsBroadcastSystemMessageA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemStationsanddesktopsBroadcastSystemMessageA(p0: Int, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemStationsanddesktopsBroadcastSystemMessageExA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemStationsanddesktopsBroadcastSystemMessageExA(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemStationsanddesktopsBroadcastSystemMessageExW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemStationsanddesktopsBroadcastSystemMessageExW(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemStationsanddesktopsBroadcastSystemMessageW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemStationsanddesktopsBroadcastSystemMessageW(p0: Int, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemStationsanddesktopsCloseDesktop(p0)")
private external fun wasmWindowssysWindowsWin32SystemStationsanddesktopsCloseDesktop(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemStationsanddesktopsCloseWindowStation(p0)")
private external fun wasmWindowssysWindowsWin32SystemStationsanddesktopsCloseWindowStation(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemStationsanddesktopsCreateDesktopA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemStationsanddesktopsCreateDesktopA(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemStationsanddesktopsCreateDesktopExA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemStationsanddesktopsCreateDesktopExA(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: Int, p7: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemStationsanddesktopsCreateDesktopExW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemStationsanddesktopsCreateDesktopExW(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: Int, p7: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemStationsanddesktopsCreateDesktopW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemStationsanddesktopsCreateDesktopW(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemStationsanddesktopsCreateWindowStationA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemStationsanddesktopsCreateWindowStationA(p0: String, p1: Int, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemStationsanddesktopsCreateWindowStationW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemStationsanddesktopsCreateWindowStationW(p0: String, p1: Int, p2: Int, p3: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemStationsanddesktopsEnumDesktopsA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemStationsanddesktopsEnumDesktopsA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemStationsanddesktopsEnumDesktopsW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemStationsanddesktopsEnumDesktopsW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemStationsanddesktopsEnumWindowStationsA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemStationsanddesktopsEnumWindowStationsA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemStationsanddesktopsEnumWindowStationsW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemStationsanddesktopsEnumWindowStationsW(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemStationsanddesktopsGetProcessWindowStation()")
private external fun wasmWindowssysWindowsWin32SystemStationsanddesktopsGetProcessWindowStation(): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemStationsanddesktopsGetThreadDesktop(p0)")
private external fun wasmWindowssysWindowsWin32SystemStationsanddesktopsGetThreadDesktop(p0: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemStationsanddesktopsGetUserObjectInformationA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemStationsanddesktopsGetUserObjectInformationA(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemStationsanddesktopsGetUserObjectInformationW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemStationsanddesktopsGetUserObjectInformationW(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemStationsanddesktopsOpenDesktopA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemStationsanddesktopsOpenDesktopA(p0: String, p1: Int, p2: Int, p3: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemStationsanddesktopsOpenDesktopW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemStationsanddesktopsOpenDesktopW(p0: String, p1: Int, p2: Int, p3: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemStationsanddesktopsOpenInputDesktop(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemStationsanddesktopsOpenInputDesktop(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemStationsanddesktopsOpenWindowStationA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemStationsanddesktopsOpenWindowStationA(p0: String, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemStationsanddesktopsOpenWindowStationW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemStationsanddesktopsOpenWindowStationW(p0: String, p1: Int, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemStationsanddesktopsSetProcessWindowStation(p0)")
private external fun wasmWindowssysWindowsWin32SystemStationsanddesktopsSetProcessWindowStation(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemStationsanddesktopsSetThreadDesktop(p0)")
private external fun wasmWindowssysWindowsWin32SystemStationsanddesktopsSetThreadDesktop(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemStationsanddesktopsSetUserObjectInformationA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemStationsanddesktopsSetUserObjectInformationA(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemStationsanddesktopsSetUserObjectInformationW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemStationsanddesktopsSetUserObjectInformationW(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemStationsanddesktopsSwitchDesktop(p0)")
private external fun wasmWindowssysWindowsWin32SystemStationsanddesktopsSwitchDesktop(p0: String): Int

public actual fun broadcastSystemMessageA(flags: UInt, lpinfo: MutPtr<UInt>, msg: UInt, wparam: Wparam, lparam: Lparam): Int =
    if (windowsWin32SystemStationsanddesktopsNapiAvailable) wasmWindowssysWindowsWin32SystemStationsanddesktopsBroadcastSystemMessageA(flags.toInt(), lpinfo.rawAddress.toString(), msg.toInt(), wparam.toString(), lparam.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun broadcastSystemMessageExA(flags: BroadcastSystemMessageFlags, lpinfo: MutPtr<BroadcastSystemMessageInfo>, msg: UInt, wparam: Wparam, lparam: Lparam, pbsminfo: MutPtr<Bsminfo>): Int =
    if (windowsWin32SystemStationsanddesktopsNapiAvailable) wasmWindowssysWindowsWin32SystemStationsanddesktopsBroadcastSystemMessageExA(flags.toInt(), lpinfo.rawAddress.toString(), msg.toInt(), wparam.toString(), lparam.toString(), pbsminfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun broadcastSystemMessageExW(flags: BroadcastSystemMessageFlags, lpinfo: MutPtr<BroadcastSystemMessageInfo>, msg: UInt, wparam: Wparam, lparam: Lparam, pbsminfo: MutPtr<Bsminfo>): Int =
    if (windowsWin32SystemStationsanddesktopsNapiAvailable) wasmWindowssysWindowsWin32SystemStationsanddesktopsBroadcastSystemMessageExW(flags.toInt(), lpinfo.rawAddress.toString(), msg.toInt(), wparam.toString(), lparam.toString(), pbsminfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun broadcastSystemMessageW(flags: BroadcastSystemMessageFlags, lpinfo: MutPtr<BroadcastSystemMessageInfo>, msg: UInt, wparam: Wparam, lparam: Lparam): Int =
    if (windowsWin32SystemStationsanddesktopsNapiAvailable) wasmWindowssysWindowsWin32SystemStationsanddesktopsBroadcastSystemMessageW(flags.toInt(), lpinfo.rawAddress.toString(), msg.toInt(), wparam.toString(), lparam.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeDesktop(hdesktop: Hdesk): Bool =
    if (windowsWin32SystemStationsanddesktopsNapiAvailable) wasmWindowssysWindowsWin32SystemStationsanddesktopsCloseDesktop(hdesktop.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeWindowStation(hwinsta: Hwinsta): Bool =
    if (windowsWin32SystemStationsanddesktopsNapiAvailable) wasmWindowssysWindowsWin32SystemStationsanddesktopsCloseWindowStation(hwinsta.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDesktopA(lpszdesktop: Pcstr, lpszdevice: Pcstr, pdevmode: ConstPtr<Devmodea>, dwflags: DesktopControlFlags, dwdesiredaccess: UInt, lpsa: ConstPtr<SecurityAttributes>): Hdesk =
    if (windowsWin32SystemStationsanddesktopsNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemStationsanddesktopsCreateDesktopA(lpszdesktop.rawAddress.toString(), lpszdevice.rawAddress.toString(), pdevmode.rawAddress.toString(), dwflags.toInt(), dwdesiredaccess.toInt(), lpsa.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDesktopExA(lpszdesktop: Pcstr, lpszdevice: Pcstr, pdevmode: ConstPtr<Devmodea>, dwflags: DesktopControlFlags, dwdesiredaccess: UInt, lpsa: ConstPtr<SecurityAttributes>, ulheapsize: UInt, pvoid: ConstPtr<CVoid>): Hdesk =
    if (windowsWin32SystemStationsanddesktopsNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemStationsanddesktopsCreateDesktopExA(lpszdesktop.rawAddress.toString(), lpszdevice.rawAddress.toString(), pdevmode.rawAddress.toString(), dwflags.toInt(), dwdesiredaccess.toInt(), lpsa.rawAddress.toString(), ulheapsize.toInt(), pvoid.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDesktopExW(lpszdesktop: Pcwstr, lpszdevice: Pcwstr, pdevmode: ConstPtr<Devmodew>, dwflags: DesktopControlFlags, dwdesiredaccess: UInt, lpsa: ConstPtr<SecurityAttributes>, ulheapsize: UInt, pvoid: ConstPtr<CVoid>): Hdesk =
    if (windowsWin32SystemStationsanddesktopsNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemStationsanddesktopsCreateDesktopExW(lpszdesktop.rawAddress.toString(), lpszdevice.rawAddress.toString(), pdevmode.rawAddress.toString(), dwflags.toInt(), dwdesiredaccess.toInt(), lpsa.rawAddress.toString(), ulheapsize.toInt(), pvoid.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDesktopW(lpszdesktop: Pcwstr, lpszdevice: Pcwstr, pdevmode: ConstPtr<Devmodew>, dwflags: DesktopControlFlags, dwdesiredaccess: UInt, lpsa: ConstPtr<SecurityAttributes>): Hdesk =
    if (windowsWin32SystemStationsanddesktopsNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemStationsanddesktopsCreateDesktopW(lpszdesktop.rawAddress.toString(), lpszdevice.rawAddress.toString(), pdevmode.rawAddress.toString(), dwflags.toInt(), dwdesiredaccess.toInt(), lpsa.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createWindowStationA(lpwinsta: Pcstr, dwflags: UInt, dwdesiredaccess: UInt, lpsa: ConstPtr<SecurityAttributes>): Hwinsta =
    if (windowsWin32SystemStationsanddesktopsNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemStationsanddesktopsCreateWindowStationA(lpwinsta.rawAddress.toString(), dwflags.toInt(), dwdesiredaccess.toInt(), lpsa.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createWindowStationW(lpwinsta: Pcwstr, dwflags: UInt, dwdesiredaccess: UInt, lpsa: ConstPtr<SecurityAttributes>): Hwinsta =
    if (windowsWin32SystemStationsanddesktopsNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemStationsanddesktopsCreateWindowStationW(lpwinsta.rawAddress.toString(), dwflags.toInt(), dwdesiredaccess.toInt(), lpsa.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumDesktopWindows(hdesktop: Hdesk, lpfn: Wndenumproc, lparam: Lparam): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumDesktopsA(hwinsta: Hwinsta, lpenumfunc: Desktopenumproca, lparam: Lparam): Bool =
    if (windowsWin32SystemStationsanddesktopsNapiAvailable) wasmWindowssysWindowsWin32SystemStationsanddesktopsEnumDesktopsA(hwinsta.rawAddress.toString(), 0L.toString(), lparam.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumDesktopsW(hwinsta: Hwinsta, lpenumfunc: Desktopenumprocw, lparam: Lparam): Bool =
    if (windowsWin32SystemStationsanddesktopsNapiAvailable) wasmWindowssysWindowsWin32SystemStationsanddesktopsEnumDesktopsW(hwinsta.rawAddress.toString(), 0L.toString(), lparam.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumWindowStationsA(lpenumfunc: Winstaenumproca, lparam: Lparam): Bool =
    if (windowsWin32SystemStationsanddesktopsNapiAvailable) wasmWindowssysWindowsWin32SystemStationsanddesktopsEnumWindowStationsA(0L.toString(), lparam.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumWindowStationsW(lpenumfunc: Winstaenumprocw, lparam: Lparam): Bool =
    if (windowsWin32SystemStationsanddesktopsNapiAvailable) wasmWindowssysWindowsWin32SystemStationsanddesktopsEnumWindowStationsW(0L.toString(), lparam.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessWindowStation(): Hwinsta =
    if (windowsWin32SystemStationsanddesktopsNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemStationsanddesktopsGetProcessWindowStation().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadDesktop(dwthreadid: UInt): Hdesk =
    if (windowsWin32SystemStationsanddesktopsNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemStationsanddesktopsGetThreadDesktop(dwthreadid.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUserObjectInformationA(hobj: Handle, nindex: UserObjectInformationIndex, pvinfo: MutPtr<CVoid>, nlength: UInt, lpnlengthneeded: MutPtr<UInt>): Bool =
    if (windowsWin32SystemStationsanddesktopsNapiAvailable) wasmWindowssysWindowsWin32SystemStationsanddesktopsGetUserObjectInformationA(hobj.rawAddress.toString(), nindex, pvinfo.rawAddress.toString(), nlength.toInt(), lpnlengthneeded.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUserObjectInformationW(hobj: Handle, nindex: UserObjectInformationIndex, pvinfo: MutPtr<CVoid>, nlength: UInt, lpnlengthneeded: MutPtr<UInt>): Bool =
    if (windowsWin32SystemStationsanddesktopsNapiAvailable) wasmWindowssysWindowsWin32SystemStationsanddesktopsGetUserObjectInformationW(hobj.rawAddress.toString(), nindex, pvinfo.rawAddress.toString(), nlength.toInt(), lpnlengthneeded.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openDesktopA(lpszdesktop: Pcstr, dwflags: DesktopControlFlags, finherit: Bool, dwdesiredaccess: UInt): Hdesk =
    if (windowsWin32SystemStationsanddesktopsNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemStationsanddesktopsOpenDesktopA(lpszdesktop.rawAddress.toString(), dwflags.toInt(), finherit, dwdesiredaccess.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openDesktopW(lpszdesktop: Pcwstr, dwflags: DesktopControlFlags, finherit: Bool, dwdesiredaccess: UInt): Hdesk =
    if (windowsWin32SystemStationsanddesktopsNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemStationsanddesktopsOpenDesktopW(lpszdesktop.rawAddress.toString(), dwflags.toInt(), finherit, dwdesiredaccess.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openInputDesktop(dwflags: DesktopControlFlags, finherit: Bool, dwdesiredaccess: DesktopAccessFlags): Hdesk =
    if (windowsWin32SystemStationsanddesktopsNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemStationsanddesktopsOpenInputDesktop(dwflags.toInt(), finherit, dwdesiredaccess.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openWindowStationA(lpszwinsta: Pcstr, finherit: Bool, dwdesiredaccess: UInt): Hwinsta =
    if (windowsWin32SystemStationsanddesktopsNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemStationsanddesktopsOpenWindowStationA(lpszwinsta.rawAddress.toString(), finherit, dwdesiredaccess.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openWindowStationW(lpszwinsta: Pcwstr, finherit: Bool, dwdesiredaccess: UInt): Hwinsta =
    if (windowsWin32SystemStationsanddesktopsNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemStationsanddesktopsOpenWindowStationW(lpszwinsta.rawAddress.toString(), finherit, dwdesiredaccess.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProcessWindowStation(hwinsta: Hwinsta): Bool =
    if (windowsWin32SystemStationsanddesktopsNapiAvailable) wasmWindowssysWindowsWin32SystemStationsanddesktopsSetProcessWindowStation(hwinsta.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadDesktop(hdesktop: Hdesk): Bool =
    if (windowsWin32SystemStationsanddesktopsNapiAvailable) wasmWindowssysWindowsWin32SystemStationsanddesktopsSetThreadDesktop(hdesktop.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setUserObjectInformationA(hobj: Handle, nindex: Int, pvinfo: ConstPtr<CVoid>, nlength: UInt): Bool =
    if (windowsWin32SystemStationsanddesktopsNapiAvailable) wasmWindowssysWindowsWin32SystemStationsanddesktopsSetUserObjectInformationA(hobj.rawAddress.toString(), nindex, pvinfo.rawAddress.toString(), nlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setUserObjectInformationW(hobj: Handle, nindex: Int, pvinfo: ConstPtr<CVoid>, nlength: UInt): Bool =
    if (windowsWin32SystemStationsanddesktopsNapiAvailable) wasmWindowssysWindowsWin32SystemStationsanddesktopsSetUserObjectInformationW(hobj.rawAddress.toString(), nindex, pvinfo.rawAddress.toString(), nlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun switchDesktop(hdesktop: Hdesk): Bool =
    if (windowsWin32SystemStationsanddesktopsNapiAvailable) wasmWindowssysWindowsWin32SystemStationsanddesktopsSwitchDesktop(hdesktop.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
