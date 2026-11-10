@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.security.applocker

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.SaferLevelHandle

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32SecurityApplockerNapiAddon(): Boolean

private val _windowsWin32SecurityApplockerNapiAvailable: Boolean = _initWindowsWin32SecurityApplockerNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_applocker_saferCloseLevel(p0)")
private external fun _wasm_windowssys_windows_win32_security_applocker_saferCloseLevel(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_applocker_saferComputeTokenFromLevel(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_security_applocker_saferComputeTokenFromLevel(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_applocker_saferCreateLevel(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_security_applocker_saferCreateLevel(p0: Int, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_applocker_saferGetLevelInformation(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_security_applocker_saferGetLevelInformation(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_applocker_saferGetPolicyInformation(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_security_applocker_saferGetPolicyInformation(p0: Int, p1: Int, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_applocker_saferIdentifyLevel(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_security_applocker_saferIdentifyLevel(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_applocker_saferRecordEventLogEntry(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_security_applocker_saferRecordEventLogEntry(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_applocker_saferSetLevelInformation(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_security_applocker_saferSetLevelInformation(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_applocker_saferSetPolicyInformation(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_security_applocker_saferSetPolicyInformation(p0: Int, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_applocker_saferiIsExecutableFileType(p0, p1)")
private external fun _wasm_windowssys_windows_win32_security_applocker_saferiIsExecutableFileType(p0: String, p1: Boolean): Int

public actual fun saferCloseLevel(hlevelhandle: SaferLevelHandle): Bool =
    if (_windowsWin32SecurityApplockerNapiAvailable) _wasm_windowssys_windows_win32_security_applocker_saferCloseLevel((hlevelhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saferComputeTokenFromLevel(levelhandle: SaferLevelHandle, inaccesstoken: Handle, outaccesstoken: COpaquePointer?, dwflags: SaferComputeTokenFromLevelFlags, lpreserved: COpaquePointer?): Bool =
    if (_windowsWin32SecurityApplockerNapiAvailable) _wasm_windowssys_windows_win32_security_applocker_saferComputeTokenFromLevel((levelhandle?.value ?: 0L).toString(), (inaccesstoken?.value ?: 0L).toString(), (outaccesstoken?.value ?: 0L).toString(), dwflags.toInt(), (lpreserved?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saferCreateLevel(dwscopeid: UInt, dwlevelid: UInt, openflags: UInt, plevelhandle: COpaquePointer?, lpreserved: COpaquePointer?): Bool =
    if (_windowsWin32SecurityApplockerNapiAvailable) _wasm_windowssys_windows_win32_security_applocker_saferCreateLevel(dwscopeid.toInt(), dwlevelid.toInt(), openflags.toInt(), (plevelhandle?.value ?: 0L).toString(), (lpreserved?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saferGetLevelInformation(levelhandle: SaferLevelHandle, dwinfotype: SaferObjectInfoClass, lpquerybuffer: COpaquePointer?, dwinbuffersize: UInt, lpdwoutbuffersize: COpaquePointer?): Bool =
    if (_windowsWin32SecurityApplockerNapiAvailable) _wasm_windowssys_windows_win32_security_applocker_saferGetLevelInformation((levelhandle?.value ?: 0L).toString(), dwinfotype, (lpquerybuffer?.value ?: 0L).toString(), dwinbuffersize.toInt(), (lpdwoutbuffersize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saferGetPolicyInformation(dwscopeid: UInt, saferpolicyinfoclass: SaferPolicyInfoClass, infobuffersize: UInt, infobuffer: COpaquePointer?, infobufferretsize: COpaquePointer?, lpreserved: COpaquePointer?): Bool =
    if (_windowsWin32SecurityApplockerNapiAvailable) _wasm_windowssys_windows_win32_security_applocker_saferGetPolicyInformation(dwscopeid.toInt(), saferpolicyinfoclass, infobuffersize.toInt(), (infobuffer?.value ?: 0L).toString(), (infobufferretsize?.value ?: 0L).toString(), (lpreserved?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saferIdentifyLevel(dwnumproperties: UInt, pcodeproperties: COpaquePointer?, plevelhandle: COpaquePointer?, lpreserved: COpaquePointer?): Bool =
    if (_windowsWin32SecurityApplockerNapiAvailable) _wasm_windowssys_windows_win32_security_applocker_saferIdentifyLevel(dwnumproperties.toInt(), (pcodeproperties?.value ?: 0L).toString(), (plevelhandle?.value ?: 0L).toString(), (lpreserved?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saferRecordEventLogEntry(hlevel: SaferLevelHandle, sztargetpath: Pcwstr, lpreserved: COpaquePointer?): Bool =
    if (_windowsWin32SecurityApplockerNapiAvailable) _wasm_windowssys_windows_win32_security_applocker_saferRecordEventLogEntry((hlevel?.value ?: 0L).toString(), (sztargetpath?.value ?: 0L).toString(), (lpreserved?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saferSetLevelInformation(levelhandle: SaferLevelHandle, dwinfotype: SaferObjectInfoClass, lpquerybuffer: COpaquePointer?, dwinbuffersize: UInt): Bool =
    if (_windowsWin32SecurityApplockerNapiAvailable) _wasm_windowssys_windows_win32_security_applocker_saferSetLevelInformation((levelhandle?.value ?: 0L).toString(), dwinfotype, (lpquerybuffer?.value ?: 0L).toString(), dwinbuffersize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saferSetPolicyInformation(dwscopeid: UInt, saferpolicyinfoclass: SaferPolicyInfoClass, infobuffersize: UInt, infobuffer: COpaquePointer?, lpreserved: COpaquePointer?): Bool =
    if (_windowsWin32SecurityApplockerNapiAvailable) _wasm_windowssys_windows_win32_security_applocker_saferSetPolicyInformation(dwscopeid.toInt(), saferpolicyinfoclass, infobuffersize.toInt(), (infobuffer?.value ?: 0L).toString(), (lpreserved?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saferiIsExecutableFileType(szfullpathname: Pcwstr, bfromshellexecute: Boolean): Bool =
    if (_windowsWin32SecurityApplockerNapiAvailable) _wasm_windowssys_windows_win32_security_applocker_saferiIsExecutableFileType((szfullpathname?.value ?: 0L).toString(), bfromshellexecute) else throw UnsupportedOperationException("Native FFI addon is not available")
