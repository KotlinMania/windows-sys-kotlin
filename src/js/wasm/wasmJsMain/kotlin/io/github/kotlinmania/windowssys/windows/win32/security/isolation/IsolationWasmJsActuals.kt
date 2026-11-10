@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.security.isolation

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.Psid

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32SecurityIsolationNapiAddon(): Boolean

private val _windowsWin32SecurityIsolationNapiAvailable: Boolean = _initWindowsWin32SecurityIsolationNapiAddon()

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_isolation_createAppContainerProfile(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_security_isolation_createAppContainerProfile(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_isolation_deleteAppContainerProfile(p0)")
private external fun _wasm_windowssys_windows_win32_security_isolation_deleteAppContainerProfile(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_isolation_deriveAppContainerSidFromAppContainerName(p0, p1)")
private external fun _wasm_windowssys_windows_win32_security_isolation_deriveAppContainerSidFromAppContainerName(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_isolation_deriveRestrictedAppContainerSidFromAppContainerSidAndRestrictedName(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_security_isolation_deriveRestrictedAppContainerSidFromAppContainerSidAndRestrictedName(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_isolation_getAppContainerFolderPath(p0, p1)")
private external fun _wasm_windowssys_windows_win32_security_isolation_getAppContainerFolderPath(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_isolation_getAppContainerNamedObjectPath(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_security_isolation_getAppContainerNamedObjectPath(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_isolation_getAppContainerRegistryLocation(p0, p1)")
private external fun _wasm_windowssys_windows_win32_security_isolation_getAppContainerRegistryLocation(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_isolation_isCrossIsolatedEnvironmentClipboardContent(p0)")
private external fun _wasm_windowssys_windows_win32_security_isolation_isCrossIsolatedEnvironmentClipboardContent(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_isolation_isProcessInIsolatedContainer(p0)")
private external fun _wasm_windowssys_windows_win32_security_isolation_isProcessInIsolatedContainer(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_isolation_isProcessInIsolatedWindowsEnvironment(p0)")
private external fun _wasm_windowssys_windows_win32_security_isolation_isProcessInIsolatedWindowsEnvironment(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_isolation_isProcessInWDAGContainer(p0, p1)")
private external fun _wasm_windowssys_windows_win32_security_isolation_isProcessInWDAGContainer(p0: String, p1: String): Int

public actual fun createAppContainerProfile(pszappcontainername: Pcwstr, pszdisplayname: Pcwstr, pszdescription: Pcwstr, pcapabilities: COpaquePointer?, dwcapabilitycount: UInt, ppsidappcontainersid: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityIsolationNapiAvailable) _wasm_windowssys_windows_win32_security_isolation_createAppContainerProfile((pszappcontainername?.value ?: 0L).toString(), (pszdisplayname?.value ?: 0L).toString(), (pszdescription?.value ?: 0L).toString(), (pcapabilities?.value ?: 0L).toString(), dwcapabilitycount.toInt(), (ppsidappcontainersid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteAppContainerProfile(pszappcontainername: Pcwstr): Hresult =
    if (_windowsWin32SecurityIsolationNapiAvailable) _wasm_windowssys_windows_win32_security_isolation_deleteAppContainerProfile((pszappcontainername?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deriveAppContainerSidFromAppContainerName(pszappcontainername: Pcwstr, ppsidappcontainersid: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityIsolationNapiAvailable) _wasm_windowssys_windows_win32_security_isolation_deriveAppContainerSidFromAppContainerName((pszappcontainername?.value ?: 0L).toString(), (ppsidappcontainersid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deriveRestrictedAppContainerSidFromAppContainerSidAndRestrictedName(psidappcontainersid: Psid, pszrestrictedappcontainername: Pcwstr, ppsidrestrictedappcontainersid: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityIsolationNapiAvailable) _wasm_windowssys_windows_win32_security_isolation_deriveRestrictedAppContainerSidFromAppContainerSidAndRestrictedName((psidappcontainersid?.value ?: 0L).toString(), (pszrestrictedappcontainername?.value ?: 0L).toString(), (ppsidrestrictedappcontainersid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAppContainerFolderPath(pszappcontainersid: Pcwstr, ppszpath: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityIsolationNapiAvailable) _wasm_windowssys_windows_win32_security_isolation_getAppContainerFolderPath((pszappcontainersid?.value ?: 0L).toString(), (ppszpath?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAppContainerNamedObjectPath(token: Handle, appcontainersid: Psid, objectpathlength: UInt, objectpath: Pwstr, returnlength: COpaquePointer?): Bool =
    if (_windowsWin32SecurityIsolationNapiAvailable) _wasm_windowssys_windows_win32_security_isolation_getAppContainerNamedObjectPath((token?.value ?: 0L).toString(), (appcontainersid?.value ?: 0L).toString(), objectpathlength.toInt(), (objectpath?.value ?: 0L).toString(), (returnlength?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAppContainerRegistryLocation(desiredaccess: UInt, phappcontainerkey: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityIsolationNapiAvailable) _wasm_windowssys_windows_win32_security_isolation_getAppContainerRegistryLocation(desiredaccess.toInt(), (phappcontainerkey?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isCrossIsolatedEnvironmentClipboardContent(iscrossisolatedenvironmentclipboardcontent: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityIsolationNapiAvailable) _wasm_windowssys_windows_win32_security_isolation_isCrossIsolatedEnvironmentClipboardContent((iscrossisolatedenvironmentclipboardcontent?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isProcessInIsolatedContainer(isprocessinisolatedcontainer: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityIsolationNapiAvailable) _wasm_windowssys_windows_win32_security_isolation_isProcessInIsolatedContainer((isprocessinisolatedcontainer?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isProcessInIsolatedWindowsEnvironment(isprocessinisolatedwindowsenvironment: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityIsolationNapiAvailable) _wasm_windowssys_windows_win32_security_isolation_isProcessInIsolatedWindowsEnvironment((isprocessinisolatedwindowsenvironment?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isProcessInWDAGContainer(reserved: COpaquePointer?, isprocessinwdagcontainer: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityIsolationNapiAvailable) _wasm_windowssys_windows_win32_security_isolation_isProcessInWDAGContainer((reserved?.value ?: 0L).toString(), (isprocessinwdagcontainer?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
