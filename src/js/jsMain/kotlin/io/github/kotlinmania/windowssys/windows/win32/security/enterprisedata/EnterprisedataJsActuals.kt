@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.enterprisedata

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

private val windowsWin32SecurityEnterprisedataNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun protectFileToEnterpriseIdentity(fileorfolderpath: Pcwstr, identity: Pcwstr): Hresult =
    if (windowsWin32SecurityEnterprisedataNapiAddon != null) (windowsWin32SecurityEnterprisedataNapiAddon.windowssysWindowsWin32SecurityEnterprisedataProtectFileToEnterpriseIdentity(fileorfolderpath.rawAddress.toString(), identity.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srpCloseThreadNetworkContext(threadnetworkcontext: MutPtr): Hresult =
    if (windowsWin32SecurityEnterprisedataNapiAddon != null) (windowsWin32SecurityEnterprisedataNapiAddon.windowssysWindowsWin32SecurityEnterprisedataSrpCloseThreadNetworkContext(threadnetworkcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srpCreateThreadNetworkContext(enterpriseid: Pcwstr, threadnetworkcontext: MutPtr): Hresult =
    if (windowsWin32SecurityEnterprisedataNapiAddon != null) (windowsWin32SecurityEnterprisedataNapiAddon.windowssysWindowsWin32SecurityEnterprisedataSrpCreateThreadNetworkContext(enterpriseid.rawAddress.toString(), threadnetworkcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srpDisablePermissiveModeFileEncryption(): Hresult =
    if (windowsWin32SecurityEnterprisedataNapiAddon != null) (windowsWin32SecurityEnterprisedataNapiAddon.windowssysWindowsWin32SecurityEnterprisedataSrpDisablePermissiveModeFileEncryption() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srpDoesPolicyAllowAppExecution(packageid: ConstPtr, isallowed: MutPtr): Hresult =
    if (windowsWin32SecurityEnterprisedataNapiAddon != null) (windowsWin32SecurityEnterprisedataNapiAddon.windowssysWindowsWin32SecurityEnterprisedataSrpDoesPolicyAllowAppExecution(packageid.rawAddress.toString(), isallowed.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srpEnablePermissiveModeFileEncryption(enterpriseid: Pcwstr): Hresult =
    if (windowsWin32SecurityEnterprisedataNapiAddon != null) (windowsWin32SecurityEnterprisedataNapiAddon.windowssysWindowsWin32SecurityEnterprisedataSrpEnablePermissiveModeFileEncryption(enterpriseid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srpGetEnterpriseIds(tokenhandle: Handle, numberofbytes: MutPtr, enterpriseids: MutPtr, enterpriseidcount: MutPtr): Hresult =
    if (windowsWin32SecurityEnterprisedataNapiAddon != null) (windowsWin32SecurityEnterprisedataNapiAddon.windowssysWindowsWin32SecurityEnterprisedataSrpGetEnterpriseIds(tokenhandle.rawAddress.toString(), numberofbytes.rawAddress.toString(), enterpriseids.rawAddress.toString(), enterpriseidcount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srpGetEnterprisePolicy(tokenhandle: Handle, policyflags: MutPtr): Hresult =
    if (windowsWin32SecurityEnterprisedataNapiAddon != null) (windowsWin32SecurityEnterprisedataNapiAddon.windowssysWindowsWin32SecurityEnterprisedataSrpGetEnterprisePolicy(tokenhandle.rawAddress.toString(), policyflags.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srpHostingInitialize(version: SrphostingVersion, type: SrphostingType, pvdata: ConstPtr, cbdata: UInt): Hresult =
    if (windowsWin32SecurityEnterprisedataNapiAddon != null) (windowsWin32SecurityEnterprisedataNapiAddon.windowssysWindowsWin32SecurityEnterprisedataSrpHostingInitialize(version, type, pvdata.rawAddress.toString(), cbdata.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srpHostingTerminate(type: SrphostingType) {
    if (windowsWin32SecurityEnterprisedataNapiAddon != null) {
        windowsWin32SecurityEnterprisedataNapiAddon.windowssysWindowsWin32SecurityEnterprisedataSrpHostingTerminate(type)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun srpIsTokenService(tokenhandle: Handle, istokenservice: MutPtr): Ntstatus =
    if (windowsWin32SecurityEnterprisedataNapiAddon != null) (windowsWin32SecurityEnterprisedataNapiAddon.windowssysWindowsWin32SecurityEnterprisedataSrpIsTokenService(tokenhandle.rawAddress.toString(), istokenservice.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srpSetTokenEnterpriseId(tokenhandle: Handle, enterpriseid: Pcwstr): Hresult =
    if (windowsWin32SecurityEnterprisedataNapiAddon != null) (windowsWin32SecurityEnterprisedataNapiAddon.windowssysWindowsWin32SecurityEnterprisedataSrpSetTokenEnterpriseId(tokenhandle.rawAddress.toString(), enterpriseid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unprotectFile(fileorfolderpath: Pcwstr, options: ConstPtr): Hresult =
    if (windowsWin32SecurityEnterprisedataNapiAddon != null) (windowsWin32SecurityEnterprisedataNapiAddon.windowssysWindowsWin32SecurityEnterprisedataUnprotectFile(fileorfolderpath.rawAddress.toString(), options.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
