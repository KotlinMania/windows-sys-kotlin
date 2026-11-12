@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.communication

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

private val windowsWin32DevicesCommunicationNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun buildCommDCBA(lpdef: Pcstr, lpdcb: MutPtr): Bool =
    if (windowsWin32DevicesCommunicationNapiAddon != null) (windowsWin32DevicesCommunicationNapiAddon.windowssysWindowsWin32DevicesCommunicationBuildCommDCBA(lpdef.rawAddress.toString(), lpdcb.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun buildCommDCBAndTimeoutsA(lpdef: Pcstr, lpdcb: MutPtr, lpcommtimeouts: MutPtr): Bool =
    if (windowsWin32DevicesCommunicationNapiAddon != null) (windowsWin32DevicesCommunicationNapiAddon.windowssysWindowsWin32DevicesCommunicationBuildCommDCBAndTimeoutsA(lpdef.rawAddress.toString(), lpdcb.rawAddress.toString(), lpcommtimeouts.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun buildCommDCBAndTimeoutsW(lpdef: Pcwstr, lpdcb: MutPtr, lpcommtimeouts: MutPtr): Bool =
    if (windowsWin32DevicesCommunicationNapiAddon != null) (windowsWin32DevicesCommunicationNapiAddon.windowssysWindowsWin32DevicesCommunicationBuildCommDCBAndTimeoutsW(lpdef.rawAddress.toString(), lpdcb.rawAddress.toString(), lpcommtimeouts.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun buildCommDCBW(lpdef: Pcwstr, lpdcb: MutPtr): Bool =
    if (windowsWin32DevicesCommunicationNapiAddon != null) (windowsWin32DevicesCommunicationNapiAddon.windowssysWindowsWin32DevicesCommunicationBuildCommDCBW(lpdef.rawAddress.toString(), lpdcb.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clearCommBreak(hfile: Handle): Bool =
    if (windowsWin32DevicesCommunicationNapiAddon != null) (windowsWin32DevicesCommunicationNapiAddon.windowssysWindowsWin32DevicesCommunicationClearCommBreak(hfile.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clearCommError(hfile: Handle, lperrors: MutPtr, lpstat: MutPtr): Bool =
    if (windowsWin32DevicesCommunicationNapiAddon != null) (windowsWin32DevicesCommunicationNapiAddon.windowssysWindowsWin32DevicesCommunicationClearCommError(hfile.rawAddress.toString(), lperrors.rawAddress.toString(), lpstat.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun commConfigDialogA(lpszname: Pcstr, hwnd: Hwnd, lpcc: MutPtr): Bool =
    if (windowsWin32DevicesCommunicationNapiAddon != null) (windowsWin32DevicesCommunicationNapiAddon.windowssysWindowsWin32DevicesCommunicationCommConfigDialogA(lpszname.rawAddress.toString(), hwnd.rawAddress.toString(), lpcc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun commConfigDialogW(lpszname: Pcwstr, hwnd: Hwnd, lpcc: MutPtr): Bool =
    if (windowsWin32DevicesCommunicationNapiAddon != null) (windowsWin32DevicesCommunicationNapiAddon.windowssysWindowsWin32DevicesCommunicationCommConfigDialogW(lpszname.rawAddress.toString(), hwnd.rawAddress.toString(), lpcc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun escapeCommFunction(hfile: Handle, dwfunc: EscapeCommFunction): Bool =
    if (windowsWin32DevicesCommunicationNapiAddon != null) (windowsWin32DevicesCommunicationNapiAddon.windowssysWindowsWin32DevicesCommunicationEscapeCommFunction(hfile.rawAddress.toString(), dwfunc.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCommConfig(hcommdev: Handle, lpcc: MutPtr, lpdwsize: MutPtr): Bool =
    if (windowsWin32DevicesCommunicationNapiAddon != null) (windowsWin32DevicesCommunicationNapiAddon.windowssysWindowsWin32DevicesCommunicationGetCommConfig(hcommdev.rawAddress.toString(), lpcc.rawAddress.toString(), lpdwsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCommMask(hfile: Handle, lpevtmask: MutPtr): Bool =
    if (windowsWin32DevicesCommunicationNapiAddon != null) (windowsWin32DevicesCommunicationNapiAddon.windowssysWindowsWin32DevicesCommunicationGetCommMask(hfile.rawAddress.toString(), lpevtmask.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCommModemStatus(hfile: Handle, lpmodemstat: MutPtr): Bool =
    if (windowsWin32DevicesCommunicationNapiAddon != null) (windowsWin32DevicesCommunicationNapiAddon.windowssysWindowsWin32DevicesCommunicationGetCommModemStatus(hfile.rawAddress.toString(), lpmodemstat.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCommPorts(lpportnumbers: MutPtr, uportnumberscount: UInt, puportnumbersfound: MutPtr): UInt =
    if (windowsWin32DevicesCommunicationNapiAddon != null) (windowsWin32DevicesCommunicationNapiAddon.windowssysWindowsWin32DevicesCommunicationGetCommPorts(lpportnumbers.rawAddress.toString(), uportnumberscount.toInt(), puportnumbersfound.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCommProperties(hfile: Handle, lpcommprop: MutPtr): Bool =
    if (windowsWin32DevicesCommunicationNapiAddon != null) (windowsWin32DevicesCommunicationNapiAddon.windowssysWindowsWin32DevicesCommunicationGetCommProperties(hfile.rawAddress.toString(), lpcommprop.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCommState(hfile: Handle, lpdcb: MutPtr): Bool =
    if (windowsWin32DevicesCommunicationNapiAddon != null) (windowsWin32DevicesCommunicationNapiAddon.windowssysWindowsWin32DevicesCommunicationGetCommState(hfile.rawAddress.toString(), lpdcb.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCommTimeouts(hfile: Handle, lpcommtimeouts: MutPtr): Bool =
    if (windowsWin32DevicesCommunicationNapiAddon != null) (windowsWin32DevicesCommunicationNapiAddon.windowssysWindowsWin32DevicesCommunicationGetCommTimeouts(hfile.rawAddress.toString(), lpcommtimeouts.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDefaultCommConfigA(lpszname: Pcstr, lpcc: MutPtr, lpdwsize: MutPtr): Bool =
    if (windowsWin32DevicesCommunicationNapiAddon != null) (windowsWin32DevicesCommunicationNapiAddon.windowssysWindowsWin32DevicesCommunicationGetDefaultCommConfigA(lpszname.rawAddress.toString(), lpcc.rawAddress.toString(), lpdwsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDefaultCommConfigW(lpszname: Pcwstr, lpcc: MutPtr, lpdwsize: MutPtr): Bool =
    if (windowsWin32DevicesCommunicationNapiAddon != null) (windowsWin32DevicesCommunicationNapiAddon.windowssysWindowsWin32DevicesCommunicationGetDefaultCommConfigW(lpszname.rawAddress.toString(), lpcc.rawAddress.toString(), lpdwsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openCommPort(uportnumber: UInt, dwdesiredaccess: UInt, dwflagsandattributes: UInt): Handle =
    if (windowsWin32DevicesCommunicationNapiAddon != null) MutPtr((windowsWin32DevicesCommunicationNapiAddon.windowssysWindowsWin32DevicesCommunicationOpenCommPort(uportnumber.toInt(), dwdesiredaccess.toInt(), dwflagsandattributes.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun purgeComm(hfile: Handle, dwflags: PurgeCommFlags): Bool =
    if (windowsWin32DevicesCommunicationNapiAddon != null) (windowsWin32DevicesCommunicationNapiAddon.windowssysWindowsWin32DevicesCommunicationPurgeComm(hfile.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCommBreak(hfile: Handle): Bool =
    if (windowsWin32DevicesCommunicationNapiAddon != null) (windowsWin32DevicesCommunicationNapiAddon.windowssysWindowsWin32DevicesCommunicationSetCommBreak(hfile.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCommConfig(hcommdev: Handle, lpcc: ConstPtr, dwsize: UInt): Bool =
    if (windowsWin32DevicesCommunicationNapiAddon != null) (windowsWin32DevicesCommunicationNapiAddon.windowssysWindowsWin32DevicesCommunicationSetCommConfig(hcommdev.rawAddress.toString(), lpcc.rawAddress.toString(), dwsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCommMask(hfile: Handle, dwevtmask: CommEventMask): Bool =
    if (windowsWin32DevicesCommunicationNapiAddon != null) (windowsWin32DevicesCommunicationNapiAddon.windowssysWindowsWin32DevicesCommunicationSetCommMask(hfile.rawAddress.toString(), dwevtmask.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCommState(hfile: Handle, lpdcb: ConstPtr): Bool =
    if (windowsWin32DevicesCommunicationNapiAddon != null) (windowsWin32DevicesCommunicationNapiAddon.windowssysWindowsWin32DevicesCommunicationSetCommState(hfile.rawAddress.toString(), lpdcb.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCommTimeouts(hfile: Handle, lpcommtimeouts: ConstPtr): Bool =
    if (windowsWin32DevicesCommunicationNapiAddon != null) (windowsWin32DevicesCommunicationNapiAddon.windowssysWindowsWin32DevicesCommunicationSetCommTimeouts(hfile.rawAddress.toString(), lpcommtimeouts.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDefaultCommConfigA(lpszname: Pcstr, lpcc: ConstPtr, dwsize: UInt): Bool =
    if (windowsWin32DevicesCommunicationNapiAddon != null) (windowsWin32DevicesCommunicationNapiAddon.windowssysWindowsWin32DevicesCommunicationSetDefaultCommConfigA(lpszname.rawAddress.toString(), lpcc.rawAddress.toString(), dwsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDefaultCommConfigW(lpszname: Pcwstr, lpcc: ConstPtr, dwsize: UInt): Bool =
    if (windowsWin32DevicesCommunicationNapiAddon != null) (windowsWin32DevicesCommunicationNapiAddon.windowssysWindowsWin32DevicesCommunicationSetDefaultCommConfigW(lpszname.rawAddress.toString(), lpcc.rawAddress.toString(), dwsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupComm(hfile: Handle, dwinqueue: UInt, dwoutqueue: UInt): Bool =
    if (windowsWin32DevicesCommunicationNapiAddon != null) (windowsWin32DevicesCommunicationNapiAddon.windowssysWindowsWin32DevicesCommunicationSetupComm(hfile.rawAddress.toString(), dwinqueue.toInt(), dwoutqueue.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun transmitCommChar(hfile: Handle, cchar: Byte): Bool =
    if (windowsWin32DevicesCommunicationNapiAddon != null) (windowsWin32DevicesCommunicationNapiAddon.windowssysWindowsWin32DevicesCommunicationTransmitCommChar(hfile.rawAddress.toString(), cchar.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitCommEvent(hfile: Handle, lpevtmask: MutPtr, lpoverlapped: MutPtr): Bool =
    if (windowsWin32DevicesCommunicationNapiAddon != null) (windowsWin32DevicesCommunicationNapiAddon.windowssysWindowsWin32DevicesCommunicationWaitCommEvent(hfile.rawAddress.toString(), lpevtmask.rawAddress.toString(), lpoverlapped.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
