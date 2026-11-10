@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.communication

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32DevicesCommunicationNapiAddon(): Boolean

private val _windowsWin32DevicesCommunicationNapiAvailable: Boolean = _initWindowsWin32DevicesCommunicationNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_communication_buildCommDCBA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_communication_buildCommDCBA(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_communication_buildCommDCBAndTimeoutsA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_communication_buildCommDCBAndTimeoutsA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_communication_buildCommDCBAndTimeoutsW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_communication_buildCommDCBAndTimeoutsW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_communication_buildCommDCBW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_communication_buildCommDCBW(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_communication_clearCommBreak(p0)")
private external fun _wasm_windowssys_windows_win32_devices_communication_clearCommBreak(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_communication_clearCommError(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_communication_clearCommError(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_communication_commConfigDialogA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_communication_commConfigDialogA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_communication_commConfigDialogW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_communication_commConfigDialogW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_communication_escapeCommFunction(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_communication_escapeCommFunction(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_communication_getCommConfig(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_communication_getCommConfig(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_communication_getCommMask(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_communication_getCommMask(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_communication_getCommModemStatus(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_communication_getCommModemStatus(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_communication_getCommPorts(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_communication_getCommPorts(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_communication_getCommProperties(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_communication_getCommProperties(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_communication_getCommState(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_communication_getCommState(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_communication_getCommTimeouts(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_communication_getCommTimeouts(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_communication_getDefaultCommConfigA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_communication_getDefaultCommConfigA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_communication_getDefaultCommConfigW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_communication_getDefaultCommConfigW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_communication_openCommPort(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_communication_openCommPort(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_communication_purgeComm(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_communication_purgeComm(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_communication_setCommBreak(p0)")
private external fun _wasm_windowssys_windows_win32_devices_communication_setCommBreak(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_communication_setCommConfig(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_communication_setCommConfig(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_communication_setCommMask(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_communication_setCommMask(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_communication_setCommState(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_communication_setCommState(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_communication_setCommTimeouts(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_communication_setCommTimeouts(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_communication_setDefaultCommConfigA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_communication_setDefaultCommConfigA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_communication_setDefaultCommConfigW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_communication_setDefaultCommConfigW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_communication_setupComm(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_communication_setupComm(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_communication_transmitCommChar(p0, p1)")
private external fun _wasm_windowssys_windows_win32_devices_communication_transmitCommChar(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_devices_communication_waitCommEvent(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_devices_communication_waitCommEvent(p0: String, p1: String, p2: String): Int

public actual fun buildCommDCBA(lpdef: Pcstr, lpdcb: COpaquePointer?): Bool =
    if (_windowsWin32DevicesCommunicationNapiAvailable) _wasm_windowssys_windows_win32_devices_communication_buildCommDCBA((lpdef?.value ?: 0L).toString(), (lpdcb?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun buildCommDCBAndTimeoutsA(lpdef: Pcstr, lpdcb: COpaquePointer?, lpcommtimeouts: COpaquePointer?): Bool =
    if (_windowsWin32DevicesCommunicationNapiAvailable) _wasm_windowssys_windows_win32_devices_communication_buildCommDCBAndTimeoutsA((lpdef?.value ?: 0L).toString(), (lpdcb?.value ?: 0L).toString(), (lpcommtimeouts?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun buildCommDCBAndTimeoutsW(lpdef: Pcwstr, lpdcb: COpaquePointer?, lpcommtimeouts: COpaquePointer?): Bool =
    if (_windowsWin32DevicesCommunicationNapiAvailable) _wasm_windowssys_windows_win32_devices_communication_buildCommDCBAndTimeoutsW((lpdef?.value ?: 0L).toString(), (lpdcb?.value ?: 0L).toString(), (lpcommtimeouts?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun buildCommDCBW(lpdef: Pcwstr, lpdcb: COpaquePointer?): Bool =
    if (_windowsWin32DevicesCommunicationNapiAvailable) _wasm_windowssys_windows_win32_devices_communication_buildCommDCBW((lpdef?.value ?: 0L).toString(), (lpdcb?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clearCommBreak(hfile: Handle): Bool =
    if (_windowsWin32DevicesCommunicationNapiAvailable) _wasm_windowssys_windows_win32_devices_communication_clearCommBreak((hfile?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clearCommError(hfile: Handle, lperrors: COpaquePointer?, lpstat: COpaquePointer?): Bool =
    if (_windowsWin32DevicesCommunicationNapiAvailable) _wasm_windowssys_windows_win32_devices_communication_clearCommError((hfile?.value ?: 0L).toString(), (lperrors?.value ?: 0L).toString(), (lpstat?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun commConfigDialogA(lpszname: Pcstr, hwnd: Hwnd, lpcc: COpaquePointer?): Bool =
    if (_windowsWin32DevicesCommunicationNapiAvailable) _wasm_windowssys_windows_win32_devices_communication_commConfigDialogA((lpszname?.value ?: 0L).toString(), (hwnd?.value ?: 0L).toString(), (lpcc?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun commConfigDialogW(lpszname: Pcwstr, hwnd: Hwnd, lpcc: COpaquePointer?): Bool =
    if (_windowsWin32DevicesCommunicationNapiAvailable) _wasm_windowssys_windows_win32_devices_communication_commConfigDialogW((lpszname?.value ?: 0L).toString(), (hwnd?.value ?: 0L).toString(), (lpcc?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun escapeCommFunction(hfile: Handle, dwfunc: EscapeCommFunction): Bool =
    if (_windowsWin32DevicesCommunicationNapiAvailable) _wasm_windowssys_windows_win32_devices_communication_escapeCommFunction((hfile?.value ?: 0L).toString(), dwfunc.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCommConfig(hcommdev: Handle, lpcc: COpaquePointer?, lpdwsize: COpaquePointer?): Bool =
    if (_windowsWin32DevicesCommunicationNapiAvailable) _wasm_windowssys_windows_win32_devices_communication_getCommConfig((hcommdev?.value ?: 0L).toString(), (lpcc?.value ?: 0L).toString(), (lpdwsize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCommMask(hfile: Handle, lpevtmask: COpaquePointer?): Bool =
    if (_windowsWin32DevicesCommunicationNapiAvailable) _wasm_windowssys_windows_win32_devices_communication_getCommMask((hfile?.value ?: 0L).toString(), (lpevtmask?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCommModemStatus(hfile: Handle, lpmodemstat: COpaquePointer?): Bool =
    if (_windowsWin32DevicesCommunicationNapiAvailable) _wasm_windowssys_windows_win32_devices_communication_getCommModemStatus((hfile?.value ?: 0L).toString(), (lpmodemstat?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCommPorts(lpportnumbers: COpaquePointer?, uportnumberscount: UInt, puportnumbersfound: COpaquePointer?): UInt =
    if (_windowsWin32DevicesCommunicationNapiAvailable) _wasm_windowssys_windows_win32_devices_communication_getCommPorts((lpportnumbers?.value ?: 0L).toString(), uportnumberscount.toInt(), (puportnumbersfound?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCommProperties(hfile: Handle, lpcommprop: COpaquePointer?): Bool =
    if (_windowsWin32DevicesCommunicationNapiAvailable) _wasm_windowssys_windows_win32_devices_communication_getCommProperties((hfile?.value ?: 0L).toString(), (lpcommprop?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCommState(hfile: Handle, lpdcb: COpaquePointer?): Bool =
    if (_windowsWin32DevicesCommunicationNapiAvailable) _wasm_windowssys_windows_win32_devices_communication_getCommState((hfile?.value ?: 0L).toString(), (lpdcb?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCommTimeouts(hfile: Handle, lpcommtimeouts: COpaquePointer?): Bool =
    if (_windowsWin32DevicesCommunicationNapiAvailable) _wasm_windowssys_windows_win32_devices_communication_getCommTimeouts((hfile?.value ?: 0L).toString(), (lpcommtimeouts?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDefaultCommConfigA(lpszname: Pcstr, lpcc: COpaquePointer?, lpdwsize: COpaquePointer?): Bool =
    if (_windowsWin32DevicesCommunicationNapiAvailable) _wasm_windowssys_windows_win32_devices_communication_getDefaultCommConfigA((lpszname?.value ?: 0L).toString(), (lpcc?.value ?: 0L).toString(), (lpdwsize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDefaultCommConfigW(lpszname: Pcwstr, lpcc: COpaquePointer?, lpdwsize: COpaquePointer?): Bool =
    if (_windowsWin32DevicesCommunicationNapiAvailable) _wasm_windowssys_windows_win32_devices_communication_getDefaultCommConfigW((lpszname?.value ?: 0L).toString(), (lpcc?.value ?: 0L).toString(), (lpdwsize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openCommPort(uportnumber: UInt, dwdesiredaccess: UInt, dwflagsandattributes: UInt): Handle =
    if (_windowsWin32DevicesCommunicationNapiAvailable) _wasm_windowssys_windows_win32_devices_communication_openCommPort(uportnumber.toInt(), dwdesiredaccess.toInt(), dwflagsandattributes.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun purgeComm(hfile: Handle, dwflags: PurgeCommFlags): Bool =
    if (_windowsWin32DevicesCommunicationNapiAvailable) _wasm_windowssys_windows_win32_devices_communication_purgeComm((hfile?.value ?: 0L).toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCommBreak(hfile: Handle): Bool =
    if (_windowsWin32DevicesCommunicationNapiAvailable) _wasm_windowssys_windows_win32_devices_communication_setCommBreak((hfile?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCommConfig(hcommdev: Handle, lpcc: COpaquePointer?, dwsize: UInt): Bool =
    if (_windowsWin32DevicesCommunicationNapiAvailable) _wasm_windowssys_windows_win32_devices_communication_setCommConfig((hcommdev?.value ?: 0L).toString(), (lpcc?.value ?: 0L).toString(), dwsize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCommMask(hfile: Handle, dwevtmask: CommEventMask): Bool =
    if (_windowsWin32DevicesCommunicationNapiAvailable) _wasm_windowssys_windows_win32_devices_communication_setCommMask((hfile?.value ?: 0L).toString(), dwevtmask.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCommState(hfile: Handle, lpdcb: COpaquePointer?): Bool =
    if (_windowsWin32DevicesCommunicationNapiAvailable) _wasm_windowssys_windows_win32_devices_communication_setCommState((hfile?.value ?: 0L).toString(), (lpdcb?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCommTimeouts(hfile: Handle, lpcommtimeouts: COpaquePointer?): Bool =
    if (_windowsWin32DevicesCommunicationNapiAvailable) _wasm_windowssys_windows_win32_devices_communication_setCommTimeouts((hfile?.value ?: 0L).toString(), (lpcommtimeouts?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDefaultCommConfigA(lpszname: Pcstr, lpcc: COpaquePointer?, dwsize: UInt): Bool =
    if (_windowsWin32DevicesCommunicationNapiAvailable) _wasm_windowssys_windows_win32_devices_communication_setDefaultCommConfigA((lpszname?.value ?: 0L).toString(), (lpcc?.value ?: 0L).toString(), dwsize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDefaultCommConfigW(lpszname: Pcwstr, lpcc: COpaquePointer?, dwsize: UInt): Bool =
    if (_windowsWin32DevicesCommunicationNapiAvailable) _wasm_windowssys_windows_win32_devices_communication_setDefaultCommConfigW((lpszname?.value ?: 0L).toString(), (lpcc?.value ?: 0L).toString(), dwsize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupComm(hfile: Handle, dwinqueue: UInt, dwoutqueue: UInt): Bool =
    if (_windowsWin32DevicesCommunicationNapiAvailable) _wasm_windowssys_windows_win32_devices_communication_setupComm((hfile?.value ?: 0L).toString(), dwinqueue.toInt(), dwoutqueue.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun transmitCommChar(hfile: Handle, cchar: Byte): Bool =
    if (_windowsWin32DevicesCommunicationNapiAvailable) _wasm_windowssys_windows_win32_devices_communication_transmitCommChar((hfile?.value ?: 0L).toString(), cchar.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitCommEvent(hfile: Handle, lpevtmask: COpaquePointer?, lpoverlapped: COpaquePointer?): Bool =
    if (_windowsWin32DevicesCommunicationNapiAvailable) _wasm_windowssys_windows_win32_devices_communication_waitCommEvent((hfile?.value ?: 0L).toString(), (lpevtmask?.value ?: 0L).toString(), (lpoverlapped?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
