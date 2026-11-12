@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.communication

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32DevicesCommunicationNapiAddon(): Boolean

private val windowsWin32DevicesCommunicationNapiAvailable: Boolean = initWindowsWin32DevicesCommunicationNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesCommunicationBuildCommDCBA(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesCommunicationBuildCommDCBA(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesCommunicationBuildCommDCBAndTimeoutsA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesCommunicationBuildCommDCBAndTimeoutsA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesCommunicationBuildCommDCBAndTimeoutsW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesCommunicationBuildCommDCBAndTimeoutsW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesCommunicationBuildCommDCBW(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesCommunicationBuildCommDCBW(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesCommunicationClearCommBreak(p0)")
private external fun wasmWindowssysWindowsWin32DevicesCommunicationClearCommBreak(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesCommunicationClearCommError(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesCommunicationClearCommError(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesCommunicationCommConfigDialogA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesCommunicationCommConfigDialogA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesCommunicationCommConfigDialogW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesCommunicationCommConfigDialogW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesCommunicationEscapeCommFunction(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesCommunicationEscapeCommFunction(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesCommunicationGetCommConfig(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesCommunicationGetCommConfig(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesCommunicationGetCommMask(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesCommunicationGetCommMask(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesCommunicationGetCommModemStatus(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesCommunicationGetCommModemStatus(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesCommunicationGetCommPorts(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesCommunicationGetCommPorts(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesCommunicationGetCommProperties(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesCommunicationGetCommProperties(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesCommunicationGetCommState(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesCommunicationGetCommState(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesCommunicationGetCommTimeouts(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesCommunicationGetCommTimeouts(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesCommunicationGetDefaultCommConfigA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesCommunicationGetDefaultCommConfigA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesCommunicationGetDefaultCommConfigW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesCommunicationGetDefaultCommConfigW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesCommunicationOpenCommPort(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesCommunicationOpenCommPort(p0: Int, p1: Int, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesCommunicationPurgeComm(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesCommunicationPurgeComm(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesCommunicationSetCommBreak(p0)")
private external fun wasmWindowssysWindowsWin32DevicesCommunicationSetCommBreak(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesCommunicationSetCommConfig(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesCommunicationSetCommConfig(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesCommunicationSetCommMask(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesCommunicationSetCommMask(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesCommunicationSetCommState(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesCommunicationSetCommState(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesCommunicationSetCommTimeouts(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesCommunicationSetCommTimeouts(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesCommunicationSetDefaultCommConfigA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesCommunicationSetDefaultCommConfigA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesCommunicationSetDefaultCommConfigW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesCommunicationSetDefaultCommConfigW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesCommunicationSetupComm(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesCommunicationSetupComm(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesCommunicationTransmitCommChar(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesCommunicationTransmitCommChar(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesCommunicationWaitCommEvent(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesCommunicationWaitCommEvent(p0: String, p1: String, p2: String): Int

public actual fun buildCommDCBA(lpdef: Pcstr, lpdcb: MutPtr): Bool =
    if (windowsWin32DevicesCommunicationNapiAvailable) wasmWindowssysWindowsWin32DevicesCommunicationBuildCommDCBA(lpdef.rawAddress.toString(), lpdcb.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun buildCommDCBAndTimeoutsA(lpdef: Pcstr, lpdcb: MutPtr, lpcommtimeouts: MutPtr): Bool =
    if (windowsWin32DevicesCommunicationNapiAvailable) wasmWindowssysWindowsWin32DevicesCommunicationBuildCommDCBAndTimeoutsA(lpdef.rawAddress.toString(), lpdcb.rawAddress.toString(), lpcommtimeouts.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun buildCommDCBAndTimeoutsW(lpdef: Pcwstr, lpdcb: MutPtr, lpcommtimeouts: MutPtr): Bool =
    if (windowsWin32DevicesCommunicationNapiAvailable) wasmWindowssysWindowsWin32DevicesCommunicationBuildCommDCBAndTimeoutsW(lpdef.rawAddress.toString(), lpdcb.rawAddress.toString(), lpcommtimeouts.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun buildCommDCBW(lpdef: Pcwstr, lpdcb: MutPtr): Bool =
    if (windowsWin32DevicesCommunicationNapiAvailable) wasmWindowssysWindowsWin32DevicesCommunicationBuildCommDCBW(lpdef.rawAddress.toString(), lpdcb.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clearCommBreak(hfile: Handle): Bool =
    if (windowsWin32DevicesCommunicationNapiAvailable) wasmWindowssysWindowsWin32DevicesCommunicationClearCommBreak(hfile.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clearCommError(hfile: Handle, lperrors: MutPtr, lpstat: MutPtr): Bool =
    if (windowsWin32DevicesCommunicationNapiAvailable) wasmWindowssysWindowsWin32DevicesCommunicationClearCommError(hfile.rawAddress.toString(), lperrors.rawAddress.toString(), lpstat.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun commConfigDialogA(lpszname: Pcstr, hwnd: Hwnd, lpcc: MutPtr): Bool =
    if (windowsWin32DevicesCommunicationNapiAvailable) wasmWindowssysWindowsWin32DevicesCommunicationCommConfigDialogA(lpszname.rawAddress.toString(), hwnd.rawAddress.toString(), lpcc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun commConfigDialogW(lpszname: Pcwstr, hwnd: Hwnd, lpcc: MutPtr): Bool =
    if (windowsWin32DevicesCommunicationNapiAvailable) wasmWindowssysWindowsWin32DevicesCommunicationCommConfigDialogW(lpszname.rawAddress.toString(), hwnd.rawAddress.toString(), lpcc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun escapeCommFunction(hfile: Handle, dwfunc: EscapeCommFunction): Bool =
    if (windowsWin32DevicesCommunicationNapiAvailable) wasmWindowssysWindowsWin32DevicesCommunicationEscapeCommFunction(hfile.rawAddress.toString(), dwfunc.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCommConfig(hcommdev: Handle, lpcc: MutPtr, lpdwsize: MutPtr): Bool =
    if (windowsWin32DevicesCommunicationNapiAvailable) wasmWindowssysWindowsWin32DevicesCommunicationGetCommConfig(hcommdev.rawAddress.toString(), lpcc.rawAddress.toString(), lpdwsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCommMask(hfile: Handle, lpevtmask: MutPtr): Bool =
    if (windowsWin32DevicesCommunicationNapiAvailable) wasmWindowssysWindowsWin32DevicesCommunicationGetCommMask(hfile.rawAddress.toString(), lpevtmask.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCommModemStatus(hfile: Handle, lpmodemstat: MutPtr): Bool =
    if (windowsWin32DevicesCommunicationNapiAvailable) wasmWindowssysWindowsWin32DevicesCommunicationGetCommModemStatus(hfile.rawAddress.toString(), lpmodemstat.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCommPorts(lpportnumbers: MutPtr, uportnumberscount: UInt, puportnumbersfound: MutPtr): UInt =
    if (windowsWin32DevicesCommunicationNapiAvailable) wasmWindowssysWindowsWin32DevicesCommunicationGetCommPorts(lpportnumbers.rawAddress.toString(), uportnumberscount.toInt(), puportnumbersfound.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCommProperties(hfile: Handle, lpcommprop: MutPtr): Bool =
    if (windowsWin32DevicesCommunicationNapiAvailable) wasmWindowssysWindowsWin32DevicesCommunicationGetCommProperties(hfile.rawAddress.toString(), lpcommprop.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCommState(hfile: Handle, lpdcb: MutPtr): Bool =
    if (windowsWin32DevicesCommunicationNapiAvailable) wasmWindowssysWindowsWin32DevicesCommunicationGetCommState(hfile.rawAddress.toString(), lpdcb.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCommTimeouts(hfile: Handle, lpcommtimeouts: MutPtr): Bool =
    if (windowsWin32DevicesCommunicationNapiAvailable) wasmWindowssysWindowsWin32DevicesCommunicationGetCommTimeouts(hfile.rawAddress.toString(), lpcommtimeouts.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDefaultCommConfigA(lpszname: Pcstr, lpcc: MutPtr, lpdwsize: MutPtr): Bool =
    if (windowsWin32DevicesCommunicationNapiAvailable) wasmWindowssysWindowsWin32DevicesCommunicationGetDefaultCommConfigA(lpszname.rawAddress.toString(), lpcc.rawAddress.toString(), lpdwsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDefaultCommConfigW(lpszname: Pcwstr, lpcc: MutPtr, lpdwsize: MutPtr): Bool =
    if (windowsWin32DevicesCommunicationNapiAvailable) wasmWindowssysWindowsWin32DevicesCommunicationGetDefaultCommConfigW(lpszname.rawAddress.toString(), lpcc.rawAddress.toString(), lpdwsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openCommPort(uportnumber: UInt, dwdesiredaccess: UInt, dwflagsandattributes: UInt): Handle =
    if (windowsWin32DevicesCommunicationNapiAvailable) MutPtr(wasmWindowssysWindowsWin32DevicesCommunicationOpenCommPort(uportnumber.toInt(), dwdesiredaccess.toInt(), dwflagsandattributes.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun purgeComm(hfile: Handle, dwflags: PurgeCommFlags): Bool =
    if (windowsWin32DevicesCommunicationNapiAvailable) wasmWindowssysWindowsWin32DevicesCommunicationPurgeComm(hfile.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCommBreak(hfile: Handle): Bool =
    if (windowsWin32DevicesCommunicationNapiAvailable) wasmWindowssysWindowsWin32DevicesCommunicationSetCommBreak(hfile.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCommConfig(hcommdev: Handle, lpcc: ConstPtr, dwsize: UInt): Bool =
    if (windowsWin32DevicesCommunicationNapiAvailable) wasmWindowssysWindowsWin32DevicesCommunicationSetCommConfig(hcommdev.rawAddress.toString(), lpcc.rawAddress.toString(), dwsize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCommMask(hfile: Handle, dwevtmask: CommEventMask): Bool =
    if (windowsWin32DevicesCommunicationNapiAvailable) wasmWindowssysWindowsWin32DevicesCommunicationSetCommMask(hfile.rawAddress.toString(), dwevtmask.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCommState(hfile: Handle, lpdcb: ConstPtr): Bool =
    if (windowsWin32DevicesCommunicationNapiAvailable) wasmWindowssysWindowsWin32DevicesCommunicationSetCommState(hfile.rawAddress.toString(), lpdcb.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCommTimeouts(hfile: Handle, lpcommtimeouts: ConstPtr): Bool =
    if (windowsWin32DevicesCommunicationNapiAvailable) wasmWindowssysWindowsWin32DevicesCommunicationSetCommTimeouts(hfile.rawAddress.toString(), lpcommtimeouts.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDefaultCommConfigA(lpszname: Pcstr, lpcc: ConstPtr, dwsize: UInt): Bool =
    if (windowsWin32DevicesCommunicationNapiAvailable) wasmWindowssysWindowsWin32DevicesCommunicationSetDefaultCommConfigA(lpszname.rawAddress.toString(), lpcc.rawAddress.toString(), dwsize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDefaultCommConfigW(lpszname: Pcwstr, lpcc: ConstPtr, dwsize: UInt): Bool =
    if (windowsWin32DevicesCommunicationNapiAvailable) wasmWindowssysWindowsWin32DevicesCommunicationSetDefaultCommConfigW(lpszname.rawAddress.toString(), lpcc.rawAddress.toString(), dwsize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setupComm(hfile: Handle, dwinqueue: UInt, dwoutqueue: UInt): Bool =
    if (windowsWin32DevicesCommunicationNapiAvailable) wasmWindowssysWindowsWin32DevicesCommunicationSetupComm(hfile.rawAddress.toString(), dwinqueue.toInt(), dwoutqueue.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun transmitCommChar(hfile: Handle, cchar: Byte): Bool =
    if (windowsWin32DevicesCommunicationNapiAvailable) wasmWindowssysWindowsWin32DevicesCommunicationTransmitCommChar(hfile.rawAddress.toString(), cchar.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun waitCommEvent(hfile: Handle, lpevtmask: MutPtr, lpoverlapped: MutPtr): Bool =
    if (windowsWin32DevicesCommunicationNapiAvailable) wasmWindowssysWindowsWin32DevicesCommunicationWaitCommEvent(hfile.rawAddress.toString(), lpevtmask.rawAddress.toString(), lpoverlapped.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
