@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.passwordmanagement

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcwstr

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32SystemPasswordmanagementNapiAddon(): Boolean

private val _windowsWin32SystemPasswordmanagementNapiAvailable: Boolean = _initWindowsWin32SystemPasswordmanagementNapiAddon()

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_passwordmanagement_mSChapSrvChangePassword(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_system_passwordmanagement_mSChapSrvChangePassword(p0: String, p1: String, p2: Boolean, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_passwordmanagement_mSChapSrvChangePassword2(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_system_passwordmanagement_mSChapSrvChangePassword2(p0: String, p1: String, p2: String, p3: String, p4: Boolean, p5: String, p6: String): Int

public actual fun mSChapSrvChangePassword(servername: Pcwstr, username: Pcwstr, lmoldpresent: Boolean, lmoldowfpassword: COpaquePointer?, lmnewowfpassword: COpaquePointer?, ntoldowfpassword: COpaquePointer?, ntnewowfpassword: COpaquePointer?): UInt =
    if (_windowsWin32SystemPasswordmanagementNapiAvailable) _wasm_windowssys_windows_win32_system_passwordmanagement_mSChapSrvChangePassword((servername?.value ?: 0L).toString(), (username?.value ?: 0L).toString(), lmoldpresent, (lmoldowfpassword?.value ?: 0L).toString(), (lmnewowfpassword?.value ?: 0L).toString(), (ntoldowfpassword?.value ?: 0L).toString(), (ntnewowfpassword?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mSChapSrvChangePassword2(servername: Pcwstr, username: Pcwstr, newpasswordencryptedwitholdnt: COpaquePointer?, oldntowfpasswordencryptedwithnewnt: COpaquePointer?, lmpresent: Boolean, newpasswordencryptedwitholdlm: COpaquePointer?, oldlmowfpasswordencryptedwithnewlmornt: COpaquePointer?): UInt =
    if (_windowsWin32SystemPasswordmanagementNapiAvailable) _wasm_windowssys_windows_win32_system_passwordmanagement_mSChapSrvChangePassword2((servername?.value ?: 0L).toString(), (username?.value ?: 0L).toString(), (newpasswordencryptedwitholdnt?.value ?: 0L).toString(), (oldntowfpasswordencryptedwithnewnt?.value ?: 0L).toString(), lmpresent, (newpasswordencryptedwitholdlm?.value ?: 0L).toString(), (oldlmowfpasswordencryptedwithnewlmornt?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
