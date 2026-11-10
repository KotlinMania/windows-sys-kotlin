@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.security.enterprisedata

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32SecurityEnterprisedataNapiAddon(): Boolean

private val _windowsWin32SecurityEnterprisedataNapiAvailable: Boolean = _initWindowsWin32SecurityEnterprisedataNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_enterprisedata_protectFileToEnterpriseIdentity(p0, p1)")
private external fun _wasm_windowssys_windows_win32_security_enterprisedata_protectFileToEnterpriseIdentity(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_enterprisedata_srpCloseThreadNetworkContext(p0)")
private external fun _wasm_windowssys_windows_win32_security_enterprisedata_srpCloseThreadNetworkContext(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_enterprisedata_srpCreateThreadNetworkContext(p0, p1)")
private external fun _wasm_windowssys_windows_win32_security_enterprisedata_srpCreateThreadNetworkContext(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_enterprisedata_srpDisablePermissiveModeFileEncryption()")
private external fun _wasm_windowssys_windows_win32_security_enterprisedata_srpDisablePermissiveModeFileEncryption(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_enterprisedata_srpDoesPolicyAllowAppExecution(p0, p1)")
private external fun _wasm_windowssys_windows_win32_security_enterprisedata_srpDoesPolicyAllowAppExecution(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_enterprisedata_srpEnablePermissiveModeFileEncryption(p0)")
private external fun _wasm_windowssys_windows_win32_security_enterprisedata_srpEnablePermissiveModeFileEncryption(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_enterprisedata_srpGetEnterpriseIds(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_security_enterprisedata_srpGetEnterpriseIds(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_enterprisedata_srpGetEnterprisePolicy(p0, p1)")
private external fun _wasm_windowssys_windows_win32_security_enterprisedata_srpGetEnterprisePolicy(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_enterprisedata_srpHostingInitialize(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_security_enterprisedata_srpHostingInitialize(p0: Int, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_enterprisedata_srpHostingTerminate(p0)")
private external fun _wasm_windowssys_windows_win32_security_enterprisedata_srpHostingTerminate(p0: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_enterprisedata_srpIsTokenService(p0, p1)")
private external fun _wasm_windowssys_windows_win32_security_enterprisedata_srpIsTokenService(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_enterprisedata_srpSetTokenEnterpriseId(p0, p1)")
private external fun _wasm_windowssys_windows_win32_security_enterprisedata_srpSetTokenEnterpriseId(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_enterprisedata_unprotectFile(p0, p1)")
private external fun _wasm_windowssys_windows_win32_security_enterprisedata_unprotectFile(p0: String, p1: String): Int

public actual fun protectFileToEnterpriseIdentity(fileorfolderpath: Pcwstr, identity: Pcwstr): Hresult =
    if (_windowsWin32SecurityEnterprisedataNapiAvailable) _wasm_windowssys_windows_win32_security_enterprisedata_protectFileToEnterpriseIdentity((fileorfolderpath?.value ?: 0L).toString(), (identity?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srpCloseThreadNetworkContext(threadnetworkcontext: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityEnterprisedataNapiAvailable) _wasm_windowssys_windows_win32_security_enterprisedata_srpCloseThreadNetworkContext((threadnetworkcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srpCreateThreadNetworkContext(enterpriseid: Pcwstr, threadnetworkcontext: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityEnterprisedataNapiAvailable) _wasm_windowssys_windows_win32_security_enterprisedata_srpCreateThreadNetworkContext((enterpriseid?.value ?: 0L).toString(), (threadnetworkcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srpDisablePermissiveModeFileEncryption(): Hresult =
    if (_windowsWin32SecurityEnterprisedataNapiAvailable) _wasm_windowssys_windows_win32_security_enterprisedata_srpDisablePermissiveModeFileEncryption() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srpDoesPolicyAllowAppExecution(packageid: COpaquePointer?, isallowed: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityEnterprisedataNapiAvailable) _wasm_windowssys_windows_win32_security_enterprisedata_srpDoesPolicyAllowAppExecution((packageid?.value ?: 0L).toString(), (isallowed?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srpEnablePermissiveModeFileEncryption(enterpriseid: Pcwstr): Hresult =
    if (_windowsWin32SecurityEnterprisedataNapiAvailable) _wasm_windowssys_windows_win32_security_enterprisedata_srpEnablePermissiveModeFileEncryption((enterpriseid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srpGetEnterpriseIds(tokenhandle: Handle, numberofbytes: COpaquePointer?, enterpriseids: COpaquePointer?, enterpriseidcount: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityEnterprisedataNapiAvailable) _wasm_windowssys_windows_win32_security_enterprisedata_srpGetEnterpriseIds((tokenhandle?.value ?: 0L).toString(), (numberofbytes?.value ?: 0L).toString(), (enterpriseids?.value ?: 0L).toString(), (enterpriseidcount?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srpGetEnterprisePolicy(tokenhandle: Handle, policyflags: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityEnterprisedataNapiAvailable) _wasm_windowssys_windows_win32_security_enterprisedata_srpGetEnterprisePolicy((tokenhandle?.value ?: 0L).toString(), (policyflags?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srpHostingInitialize(version: SrphostingVersion, type: SrphostingType, pvdata: COpaquePointer?, cbdata: UInt): Hresult =
    if (_windowsWin32SecurityEnterprisedataNapiAvailable) _wasm_windowssys_windows_win32_security_enterprisedata_srpHostingInitialize(version, type, (pvdata?.value ?: 0L).toString(), cbdata.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srpHostingTerminate(type: SrphostingType) {
    if (_windowsWin32SecurityEnterprisedataNapiAvailable) {
        _wasm_windowssys_windows_win32_security_enterprisedata_srpHostingTerminate(type)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun srpIsTokenService(tokenhandle: Handle, istokenservice: COpaquePointer?): Ntstatus =
    if (_windowsWin32SecurityEnterprisedataNapiAvailable) _wasm_windowssys_windows_win32_security_enterprisedata_srpIsTokenService((tokenhandle?.value ?: 0L).toString(), (istokenservice?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srpSetTokenEnterpriseId(tokenhandle: Handle, enterpriseid: Pcwstr): Hresult =
    if (_windowsWin32SecurityEnterprisedataNapiAvailable) _wasm_windowssys_windows_win32_security_enterprisedata_srpSetTokenEnterpriseId((tokenhandle?.value ?: 0L).toString(), (enterpriseid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unprotectFile(fileorfolderpath: Pcwstr, options: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityEnterprisedataNapiAvailable) _wasm_windowssys_windows_win32_security_enterprisedata_unprotectFile((fileorfolderpath?.value ?: 0L).toString(), (options?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
