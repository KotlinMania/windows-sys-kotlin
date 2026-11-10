@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.enterprisedata

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

private val _windowsWin32SecurityEnterprisedataNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun protectFileToEnterpriseIdentity(fileorfolderpath: Pcwstr, identity: Pcwstr): Hresult =
    if (_windowsWin32SecurityEnterprisedataNapiAddon != null) (_windowsWin32SecurityEnterprisedataNapiAddon.windowssys_windows_win32_security_enterprisedata_protectFileToEnterpriseIdentity((fileorfolderpath?.value ?: 0L).toString(), (identity?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srpCloseThreadNetworkContext(threadnetworkcontext: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityEnterprisedataNapiAddon != null) (_windowsWin32SecurityEnterprisedataNapiAddon.windowssys_windows_win32_security_enterprisedata_srpCloseThreadNetworkContext((threadnetworkcontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srpCreateThreadNetworkContext(enterpriseid: Pcwstr, threadnetworkcontext: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityEnterprisedataNapiAddon != null) (_windowsWin32SecurityEnterprisedataNapiAddon.windowssys_windows_win32_security_enterprisedata_srpCreateThreadNetworkContext((enterpriseid?.value ?: 0L).toString(), (threadnetworkcontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srpDisablePermissiveModeFileEncryption(): Hresult =
    if (_windowsWin32SecurityEnterprisedataNapiAddon != null) (_windowsWin32SecurityEnterprisedataNapiAddon.windowssys_windows_win32_security_enterprisedata_srpDisablePermissiveModeFileEncryption() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srpDoesPolicyAllowAppExecution(packageid: COpaquePointer?, isallowed: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityEnterprisedataNapiAddon != null) (_windowsWin32SecurityEnterprisedataNapiAddon.windowssys_windows_win32_security_enterprisedata_srpDoesPolicyAllowAppExecution((packageid?.value ?: 0L).toString(), (isallowed?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srpEnablePermissiveModeFileEncryption(enterpriseid: Pcwstr): Hresult =
    if (_windowsWin32SecurityEnterprisedataNapiAddon != null) (_windowsWin32SecurityEnterprisedataNapiAddon.windowssys_windows_win32_security_enterprisedata_srpEnablePermissiveModeFileEncryption((enterpriseid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srpGetEnterpriseIds(tokenhandle: Handle, numberofbytes: COpaquePointer?, enterpriseids: COpaquePointer?, enterpriseidcount: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityEnterprisedataNapiAddon != null) (_windowsWin32SecurityEnterprisedataNapiAddon.windowssys_windows_win32_security_enterprisedata_srpGetEnterpriseIds((tokenhandle?.value ?: 0L).toString(), (numberofbytes?.value ?: 0L).toString(), (enterpriseids?.value ?: 0L).toString(), (enterpriseidcount?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srpGetEnterprisePolicy(tokenhandle: Handle, policyflags: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityEnterprisedataNapiAddon != null) (_windowsWin32SecurityEnterprisedataNapiAddon.windowssys_windows_win32_security_enterprisedata_srpGetEnterprisePolicy((tokenhandle?.value ?: 0L).toString(), (policyflags?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srpHostingInitialize(version: SrphostingVersion, type: SrphostingType, pvdata: COpaquePointer?, cbdata: UInt): Hresult =
    if (_windowsWin32SecurityEnterprisedataNapiAddon != null) (_windowsWin32SecurityEnterprisedataNapiAddon.windowssys_windows_win32_security_enterprisedata_srpHostingInitialize(version, type, (pvdata?.value ?: 0L).toString(), cbdata.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srpHostingTerminate(type: SrphostingType) {
    if (_windowsWin32SecurityEnterprisedataNapiAddon != null) {
        _windowsWin32SecurityEnterprisedataNapiAddon.windowssys_windows_win32_security_enterprisedata_srpHostingTerminate(type)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun srpIsTokenService(tokenhandle: Handle, istokenservice: COpaquePointer?): Ntstatus =
    if (_windowsWin32SecurityEnterprisedataNapiAddon != null) (_windowsWin32SecurityEnterprisedataNapiAddon.windowssys_windows_win32_security_enterprisedata_srpIsTokenService((tokenhandle?.value ?: 0L).toString(), (istokenservice?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srpSetTokenEnterpriseId(tokenhandle: Handle, enterpriseid: Pcwstr): Hresult =
    if (_windowsWin32SecurityEnterprisedataNapiAddon != null) (_windowsWin32SecurityEnterprisedataNapiAddon.windowssys_windows_win32_security_enterprisedata_srpSetTokenEnterpriseId((tokenhandle?.value ?: 0L).toString(), (enterpriseid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unprotectFile(fileorfolderpath: Pcwstr, options: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityEnterprisedataNapiAddon != null) (_windowsWin32SecurityEnterprisedataNapiAddon.windowssys_windows_win32_security_enterprisedata_unprotectFile((fileorfolderpath?.value ?: 0L).toString(), (options?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
