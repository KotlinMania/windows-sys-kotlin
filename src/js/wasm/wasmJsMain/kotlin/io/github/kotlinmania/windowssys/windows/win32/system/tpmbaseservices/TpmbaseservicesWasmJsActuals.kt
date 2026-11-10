@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.tpmbaseservices

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pwstr

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32SystemTpmbaseservicesNapiAddon(): Boolean

private val _windowsWin32SystemTpmbaseservicesNapiAvailable: Boolean = _initWindowsWin32SystemTpmbaseservicesNapiAddon()

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_tpmbaseservices_getDeviceID(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_tpmbaseservices_getDeviceID(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_tpmbaseservices_getDeviceIDString(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_tpmbaseservices_getDeviceIDString(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_tpmbaseservices_tbsiContextCreate(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_tpmbaseservices_tbsiContextCreate(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_tpmbaseservices_tbsiCreateWindowsKey(p0)")
private external fun _wasm_windowssys_windows_win32_system_tpmbaseservices_tbsiCreateWindowsKey(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_tpmbaseservices_tbsiGetDeviceInfo(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_tpmbaseservices_tbsiGetDeviceInfo(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_tpmbaseservices_tbsiGetOwnerAuth(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_tpmbaseservices_tbsiGetOwnerAuth(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_tpmbaseservices_tbsiGetTcgLog(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_tpmbaseservices_tbsiGetTcgLog(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_tpmbaseservices_tbsiGetTcgLogEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_tpmbaseservices_tbsiGetTcgLogEx(p0: Int, p1: String, p2: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_tpmbaseservices_tbsiIsTpmPresent()")
private external fun _wasm_windowssys_windows_win32_system_tpmbaseservices_tbsiIsTpmPresent(): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_tpmbaseservices_tbsiPhysicalPresenceCommand(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_tpmbaseservices_tbsiPhysicalPresenceCommand(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_tpmbaseservices_tbsiRevokeAttestation()")
private external fun _wasm_windowssys_windows_win32_system_tpmbaseservices_tbsiRevokeAttestation(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_tpmbaseservices_tbsipCancelCommands(p0)")
private external fun _wasm_windowssys_windows_win32_system_tpmbaseservices_tbsipCancelCommands(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_tpmbaseservices_tbsipContextClose(p0)")
private external fun _wasm_windowssys_windows_win32_system_tpmbaseservices_tbsipContextClose(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_tpmbaseservices_tbsipSubmitCommand(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_system_tpmbaseservices_tbsipSubmitCommand(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

public actual fun getDeviceID(pbwindowsaik: COpaquePointer?, cbwindowsaik: UInt, pcbresult: COpaquePointer?, pfprotectedbytpm: COpaquePointer?): Hresult =
    if (_windowsWin32SystemTpmbaseservicesNapiAvailable) _wasm_windowssys_windows_win32_system_tpmbaseservices_getDeviceID((pbwindowsaik?.value ?: 0L).toString(), cbwindowsaik.toInt(), (pcbresult?.value ?: 0L).toString(), (pfprotectedbytpm?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDeviceIDString(pszwindowsaik: Pwstr, cchwindowsaik: UInt, pcchresult: COpaquePointer?, pfprotectedbytpm: COpaquePointer?): Hresult =
    if (_windowsWin32SystemTpmbaseservicesNapiAvailable) _wasm_windowssys_windows_win32_system_tpmbaseservices_getDeviceIDString((pszwindowsaik?.value ?: 0L).toString(), cchwindowsaik.toInt(), (pcchresult?.value ?: 0L).toString(), (pfprotectedbytpm?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tbsiContextCreate(pcontextparams: COpaquePointer?, phcontext: COpaquePointer?): UInt =
    if (_windowsWin32SystemTpmbaseservicesNapiAvailable) _wasm_windowssys_windows_win32_system_tpmbaseservices_tbsiContextCreate((pcontextparams?.value ?: 0L).toString(), (phcontext?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tbsiCreateWindowsKey(keyhandle: UInt): UInt =
    if (_windowsWin32SystemTpmbaseservicesNapiAvailable) _wasm_windowssys_windows_win32_system_tpmbaseservices_tbsiCreateWindowsKey(keyhandle.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tbsiGetDeviceInfo(size: UInt, info: COpaquePointer?): UInt =
    if (_windowsWin32SystemTpmbaseservicesNapiAvailable) _wasm_windowssys_windows_win32_system_tpmbaseservices_tbsiGetDeviceInfo(size.toInt(), (info?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tbsiGetOwnerAuth(hcontext: COpaquePointer?, ownerauthtype: UInt, poutputbuf: COpaquePointer?, poutputbuflen: COpaquePointer?): UInt =
    if (_windowsWin32SystemTpmbaseservicesNapiAvailable) _wasm_windowssys_windows_win32_system_tpmbaseservices_tbsiGetOwnerAuth((hcontext?.value ?: 0L).toString(), ownerauthtype.toInt(), (poutputbuf?.value ?: 0L).toString(), (poutputbuflen?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tbsiGetTcgLog(hcontext: COpaquePointer?, poutputbuf: COpaquePointer?, poutputbuflen: COpaquePointer?): UInt =
    if (_windowsWin32SystemTpmbaseservicesNapiAvailable) _wasm_windowssys_windows_win32_system_tpmbaseservices_tbsiGetTcgLog((hcontext?.value ?: 0L).toString(), (poutputbuf?.value ?: 0L).toString(), (poutputbuflen?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tbsiGetTcgLogEx(logtype: UInt, pboutput: COpaquePointer?, pcboutput: COpaquePointer?): UInt =
    if (_windowsWin32SystemTpmbaseservicesNapiAvailable) _wasm_windowssys_windows_win32_system_tpmbaseservices_tbsiGetTcgLogEx(logtype.toInt(), (pboutput?.value ?: 0L).toString(), (pcboutput?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tbsiIsTpmPresent(): Bool =
    if (_windowsWin32SystemTpmbaseservicesNapiAvailable) _wasm_windowssys_windows_win32_system_tpmbaseservices_tbsiIsTpmPresent() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tbsiPhysicalPresenceCommand(hcontext: COpaquePointer?, pabinput: COpaquePointer?, cbinput: UInt, paboutput: COpaquePointer?, pcboutput: COpaquePointer?): UInt =
    if (_windowsWin32SystemTpmbaseservicesNapiAvailable) _wasm_windowssys_windows_win32_system_tpmbaseservices_tbsiPhysicalPresenceCommand((hcontext?.value ?: 0L).toString(), (pabinput?.value ?: 0L).toString(), cbinput.toInt(), (paboutput?.value ?: 0L).toString(), (pcboutput?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tbsiRevokeAttestation(): UInt =
    if (_windowsWin32SystemTpmbaseservicesNapiAvailable) _wasm_windowssys_windows_win32_system_tpmbaseservices_tbsiRevokeAttestation().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tbsipCancelCommands(hcontext: COpaquePointer?): UInt =
    if (_windowsWin32SystemTpmbaseservicesNapiAvailable) _wasm_windowssys_windows_win32_system_tpmbaseservices_tbsipCancelCommands((hcontext?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tbsipContextClose(hcontext: COpaquePointer?): UInt =
    if (_windowsWin32SystemTpmbaseservicesNapiAvailable) _wasm_windowssys_windows_win32_system_tpmbaseservices_tbsipContextClose((hcontext?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tbsipSubmitCommand(hcontext: COpaquePointer?, locality: TbsCommandLocality, priority: TbsCommandPriority, pabcommand: COpaquePointer?, cbcommand: UInt, pabresult: COpaquePointer?, pcbresult: COpaquePointer?): UInt =
    if (_windowsWin32SystemTpmbaseservicesNapiAvailable) _wasm_windowssys_windows_win32_system_tpmbaseservices_tbsipSubmitCommand((hcontext?.value ?: 0L).toString(), locality.toInt(), priority.toInt(), (pabcommand?.value ?: 0L).toString(), cbcommand.toInt(), (pabresult?.value ?: 0L).toString(), (pcbresult?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
