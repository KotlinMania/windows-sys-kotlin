@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.security.enterprisedata

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SecurityEnterprisedataNapiAddon(): Boolean

private val windowsWin32SecurityEnterprisedataNapiAvailable: Boolean = initWindowsWin32SecurityEnterprisedataNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityEnterprisedataProtectFileToEnterpriseIdentity(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityEnterprisedataProtectFileToEnterpriseIdentity(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityEnterprisedataSrpCloseThreadNetworkContext(p0)")
private external fun wasmWindowssysWindowsWin32SecurityEnterprisedataSrpCloseThreadNetworkContext(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityEnterprisedataSrpCreateThreadNetworkContext(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityEnterprisedataSrpCreateThreadNetworkContext(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityEnterprisedataSrpDisablePermissiveModeFileEncryption()")
private external fun wasmWindowssysWindowsWin32SecurityEnterprisedataSrpDisablePermissiveModeFileEncryption(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityEnterprisedataSrpDoesPolicyAllowAppExecution(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityEnterprisedataSrpDoesPolicyAllowAppExecution(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityEnterprisedataSrpEnablePermissiveModeFileEncryption(p0)")
private external fun wasmWindowssysWindowsWin32SecurityEnterprisedataSrpEnablePermissiveModeFileEncryption(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityEnterprisedataSrpGetEnterpriseIds(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityEnterprisedataSrpGetEnterpriseIds(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityEnterprisedataSrpGetEnterprisePolicy(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityEnterprisedataSrpGetEnterprisePolicy(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityEnterprisedataSrpHostingInitialize(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityEnterprisedataSrpHostingInitialize(p0: Int, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityEnterprisedataSrpHostingTerminate(p0)")
private external fun wasmWindowssysWindowsWin32SecurityEnterprisedataSrpHostingTerminate(p0: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityEnterprisedataSrpIsTokenService(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityEnterprisedataSrpIsTokenService(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityEnterprisedataSrpSetTokenEnterpriseId(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityEnterprisedataSrpSetTokenEnterpriseId(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityEnterprisedataUnprotectFile(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityEnterprisedataUnprotectFile(p0: String, p1: String): Int

public actual fun protectFileToEnterpriseIdentity(fileorfolderpath: Pcwstr, identity: Pcwstr): Hresult =
    if (windowsWin32SecurityEnterprisedataNapiAvailable) wasmWindowssysWindowsWin32SecurityEnterprisedataProtectFileToEnterpriseIdentity(fileorfolderpath.rawAddress.toString(), identity.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srpCloseThreadNetworkContext(threadnetworkcontext: MutPtr): Hresult =
    if (windowsWin32SecurityEnterprisedataNapiAvailable) wasmWindowssysWindowsWin32SecurityEnterprisedataSrpCloseThreadNetworkContext(threadnetworkcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srpCreateThreadNetworkContext(enterpriseid: Pcwstr, threadnetworkcontext: MutPtr): Hresult =
    if (windowsWin32SecurityEnterprisedataNapiAvailable) wasmWindowssysWindowsWin32SecurityEnterprisedataSrpCreateThreadNetworkContext(enterpriseid.rawAddress.toString(), threadnetworkcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srpDisablePermissiveModeFileEncryption(): Hresult =
    if (windowsWin32SecurityEnterprisedataNapiAvailable) wasmWindowssysWindowsWin32SecurityEnterprisedataSrpDisablePermissiveModeFileEncryption() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srpDoesPolicyAllowAppExecution(packageid: ConstPtr, isallowed: MutPtr): Hresult =
    if (windowsWin32SecurityEnterprisedataNapiAvailable) wasmWindowssysWindowsWin32SecurityEnterprisedataSrpDoesPolicyAllowAppExecution(packageid.rawAddress.toString(), isallowed.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srpEnablePermissiveModeFileEncryption(enterpriseid: Pcwstr): Hresult =
    if (windowsWin32SecurityEnterprisedataNapiAvailable) wasmWindowssysWindowsWin32SecurityEnterprisedataSrpEnablePermissiveModeFileEncryption(enterpriseid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srpGetEnterpriseIds(tokenhandle: Handle, numberofbytes: MutPtr, enterpriseids: MutPtr, enterpriseidcount: MutPtr): Hresult =
    if (windowsWin32SecurityEnterprisedataNapiAvailable) wasmWindowssysWindowsWin32SecurityEnterprisedataSrpGetEnterpriseIds(tokenhandle.rawAddress.toString(), numberofbytes.rawAddress.toString(), enterpriseids.rawAddress.toString(), enterpriseidcount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srpGetEnterprisePolicy(tokenhandle: Handle, policyflags: MutPtr): Hresult =
    if (windowsWin32SecurityEnterprisedataNapiAvailable) wasmWindowssysWindowsWin32SecurityEnterprisedataSrpGetEnterprisePolicy(tokenhandle.rawAddress.toString(), policyflags.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srpHostingInitialize(version: SrphostingVersion, type: SrphostingType, pvdata: ConstPtr, cbdata: UInt): Hresult =
    if (windowsWin32SecurityEnterprisedataNapiAvailable) wasmWindowssysWindowsWin32SecurityEnterprisedataSrpHostingInitialize(version, type, pvdata.rawAddress.toString(), cbdata.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srpHostingTerminate(type: SrphostingType) {
    if (windowsWin32SecurityEnterprisedataNapiAvailable) {
        wasmWindowssysWindowsWin32SecurityEnterprisedataSrpHostingTerminate(type)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun srpIsTokenService(tokenhandle: Handle, istokenservice: MutPtr): Ntstatus =
    if (windowsWin32SecurityEnterprisedataNapiAvailable) wasmWindowssysWindowsWin32SecurityEnterprisedataSrpIsTokenService(tokenhandle.rawAddress.toString(), istokenservice.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun srpSetTokenEnterpriseId(tokenhandle: Handle, enterpriseid: Pcwstr): Hresult =
    if (windowsWin32SecurityEnterprisedataNapiAvailable) wasmWindowssysWindowsWin32SecurityEnterprisedataSrpSetTokenEnterpriseId(tokenhandle.rawAddress.toString(), enterpriseid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unprotectFile(fileorfolderpath: Pcwstr, options: ConstPtr): Hresult =
    if (windowsWin32SecurityEnterprisedataNapiAvailable) wasmWindowssysWindowsWin32SecurityEnterprisedataUnprotectFile(fileorfolderpath.rawAddress.toString(), options.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
