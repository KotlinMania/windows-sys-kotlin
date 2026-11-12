@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.security.isolation

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import io.github.kotlinmania.windowssys.windows.win32.security.SidAndAttributes
import io.github.kotlinmania.windowssys.windows.win32.system.registry.Hkey

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SecurityIsolationNapiAddon(): Boolean

private val windowsWin32SecurityIsolationNapiAvailable: Boolean = initWindowsWin32SecurityIsolationNapiAddon()

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityIsolationCreateAppContainerProfile(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityIsolationCreateAppContainerProfile(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityIsolationDeleteAppContainerProfile(p0)")
private external fun wasmWindowssysWindowsWin32SecurityIsolationDeleteAppContainerProfile(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityIsolationDeriveAppContainerSidFromAppContainerName(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityIsolationDeriveAppContainerSidFromAppContainerName(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityIsolationDeriveRestrictedAppContainerSidFromAppContainerSidAndRestrictedName(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityIsolationDeriveRestrictedAppContainerSidFromAppContainerSidAndRestrictedName(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityIsolationGetAppContainerFolderPath(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityIsolationGetAppContainerFolderPath(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityIsolationGetAppContainerNamedObjectPath(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityIsolationGetAppContainerNamedObjectPath(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityIsolationGetAppContainerRegistryLocation(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityIsolationGetAppContainerRegistryLocation(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityIsolationIsCrossIsolatedEnvironmentClipboardContent(p0)")
private external fun wasmWindowssysWindowsWin32SecurityIsolationIsCrossIsolatedEnvironmentClipboardContent(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityIsolationIsProcessInIsolatedContainer(p0)")
private external fun wasmWindowssysWindowsWin32SecurityIsolationIsProcessInIsolatedContainer(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityIsolationIsProcessInIsolatedWindowsEnvironment(p0)")
private external fun wasmWindowssysWindowsWin32SecurityIsolationIsProcessInIsolatedWindowsEnvironment(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityIsolationIsProcessInWDAGContainer(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityIsolationIsProcessInWDAGContainer(p0: String, p1: String): Int

public actual fun createAppContainerProfile(pszappcontainername: Pcwstr, pszdisplayname: Pcwstr, pszdescription: Pcwstr, pcapabilities: ConstPtr<SidAndAttributes>, dwcapabilitycount: UInt, ppsidappcontainersid: MutPtr<Psid>): Hresult =
    if (windowsWin32SecurityIsolationNapiAvailable) wasmWindowssysWindowsWin32SecurityIsolationCreateAppContainerProfile(pszappcontainername.rawAddress.toString(), pszdisplayname.rawAddress.toString(), pszdescription.rawAddress.toString(), pcapabilities.rawAddress.toString(), dwcapabilitycount.toInt(), ppsidappcontainersid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteAppContainerProfile(pszappcontainername: Pcwstr): Hresult =
    if (windowsWin32SecurityIsolationNapiAvailable) wasmWindowssysWindowsWin32SecurityIsolationDeleteAppContainerProfile(pszappcontainername.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deriveAppContainerSidFromAppContainerName(pszappcontainername: Pcwstr, ppsidappcontainersid: MutPtr<Psid>): Hresult =
    if (windowsWin32SecurityIsolationNapiAvailable) wasmWindowssysWindowsWin32SecurityIsolationDeriveAppContainerSidFromAppContainerName(pszappcontainername.rawAddress.toString(), ppsidappcontainersid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deriveRestrictedAppContainerSidFromAppContainerSidAndRestrictedName(psidappcontainersid: Psid, pszrestrictedappcontainername: Pcwstr, ppsidrestrictedappcontainersid: MutPtr<Psid>): Hresult =
    if (windowsWin32SecurityIsolationNapiAvailable) wasmWindowssysWindowsWin32SecurityIsolationDeriveRestrictedAppContainerSidFromAppContainerSidAndRestrictedName(psidappcontainersid.rawAddress.toString(), pszrestrictedappcontainername.rawAddress.toString(), ppsidrestrictedappcontainersid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAppContainerFolderPath(pszappcontainersid: Pcwstr, ppszpath: MutPtr<Pwstr>): Hresult =
    if (windowsWin32SecurityIsolationNapiAvailable) wasmWindowssysWindowsWin32SecurityIsolationGetAppContainerFolderPath(pszappcontainersid.rawAddress.toString(), ppszpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAppContainerNamedObjectPath(token: Handle, appcontainersid: Psid, objectpathlength: UInt, objectpath: Pwstr, returnlength: MutPtr<UInt>): Bool =
    if (windowsWin32SecurityIsolationNapiAvailable) wasmWindowssysWindowsWin32SecurityIsolationGetAppContainerNamedObjectPath(token.rawAddress.toString(), appcontainersid.rawAddress.toString(), objectpathlength.toInt(), objectpath.rawAddress.toString(), returnlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAppContainerRegistryLocation(desiredaccess: UInt, phappcontainerkey: MutPtr<Hkey>): Hresult =
    if (windowsWin32SecurityIsolationNapiAvailable) wasmWindowssysWindowsWin32SecurityIsolationGetAppContainerRegistryLocation(desiredaccess.toInt(), phappcontainerkey.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isCrossIsolatedEnvironmentClipboardContent(iscrossisolatedenvironmentclipboardcontent: MutPtr<Bool>): Hresult =
    if (windowsWin32SecurityIsolationNapiAvailable) wasmWindowssysWindowsWin32SecurityIsolationIsCrossIsolatedEnvironmentClipboardContent(iscrossisolatedenvironmentclipboardcontent.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isProcessInIsolatedContainer(isprocessinisolatedcontainer: MutPtr<Bool>): Hresult =
    if (windowsWin32SecurityIsolationNapiAvailable) wasmWindowssysWindowsWin32SecurityIsolationIsProcessInIsolatedContainer(isprocessinisolatedcontainer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isProcessInIsolatedWindowsEnvironment(isprocessinisolatedwindowsenvironment: MutPtr<Bool>): Hresult =
    if (windowsWin32SecurityIsolationNapiAvailable) wasmWindowssysWindowsWin32SecurityIsolationIsProcessInIsolatedWindowsEnvironment(isprocessinisolatedwindowsenvironment.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isProcessInWDAGContainer(reserved: ConstPtr<CVoid>, isprocessinwdagcontainer: MutPtr<Bool>): Hresult =
    if (windowsWin32SecurityIsolationNapiAvailable) wasmWindowssysWindowsWin32SecurityIsolationIsProcessInWDAGContainer(reserved.rawAddress.toString(), isprocessinwdagcontainer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
