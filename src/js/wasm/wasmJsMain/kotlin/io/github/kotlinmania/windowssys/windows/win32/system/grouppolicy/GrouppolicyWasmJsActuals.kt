@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.security.Psid

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32SystemGrouppolicyNapiAddon(): Boolean

private val _windowsWin32SystemGrouppolicyNapiAvailable: Boolean = _initWindowsWin32SystemGrouppolicyNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_grouppolicy_browseForGPO(p0)")
private external fun _wasm_windowssys_windows_win32_system_grouppolicy_browseForGPO(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_grouppolicy_commandLineFromMsiDescriptor(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_grouppolicy_commandLineFromMsiDescriptor(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_grouppolicy_createGPOLink(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_grouppolicy_createGPOLink(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_grouppolicy_deleteAllGPOLinks(p0)")
private external fun _wasm_windowssys_windows_win32_system_grouppolicy_deleteAllGPOLinks(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_grouppolicy_deleteGPOLink(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_grouppolicy_deleteGPOLink(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_grouppolicy_enterCriticalPolicySection(p0)")
private external fun _wasm_windowssys_windows_win32_system_grouppolicy_enterCriticalPolicySection(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_grouppolicy_exportRSoPData(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_grouppolicy_exportRSoPData(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_grouppolicy_freeGPOListA(p0)")
private external fun _wasm_windowssys_windows_win32_system_grouppolicy_freeGPOListA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_grouppolicy_freeGPOListW(p0)")
private external fun _wasm_windowssys_windows_win32_system_grouppolicy_freeGPOListW(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_grouppolicy_generateGPNotification(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_grouppolicy_generateGPNotification(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_grouppolicy_getAppliedGPOListA(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_grouppolicy_getAppliedGPOListA(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_grouppolicy_getAppliedGPOListW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_grouppolicy_getAppliedGPOListW(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_grouppolicy_getGPOListA(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_grouppolicy_getGPOListA(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_grouppolicy_getGPOListW(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_grouppolicy_getGPOListW(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_grouppolicy_getLocalManagedApplicationData(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_grouppolicy_getLocalManagedApplicationData(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_grouppolicy_getLocalManagedApplications(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_grouppolicy_getLocalManagedApplications(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_grouppolicy_getManagedApplicationCategories(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_grouppolicy_getManagedApplicationCategories(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_grouppolicy_getManagedApplications(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_grouppolicy_getManagedApplications(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_grouppolicy_importRSoPData(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_grouppolicy_importRSoPData(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_grouppolicy_installApplication(p0)")
private external fun _wasm_windowssys_windows_win32_system_grouppolicy_installApplication(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_grouppolicy_leaveCriticalPolicySection(p0)")
private external fun _wasm_windowssys_windows_win32_system_grouppolicy_leaveCriticalPolicySection(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_grouppolicy_processGroupPolicyCompleted(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_grouppolicy_processGroupPolicyCompleted(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_grouppolicy_processGroupPolicyCompletedEx(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_grouppolicy_processGroupPolicyCompletedEx(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_grouppolicy_refreshPolicy(p0)")
private external fun _wasm_windowssys_windows_win32_system_grouppolicy_refreshPolicy(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_grouppolicy_refreshPolicyEx(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_grouppolicy_refreshPolicyEx(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_grouppolicy_registerGPNotification(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_grouppolicy_registerGPNotification(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_grouppolicy_rsopAccessCheckByType(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun _wasm_windowssys_windows_win32_system_grouppolicy_rsopAccessCheckByType(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: String, p8: String, p9: String, p10: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_grouppolicy_rsopFileAccessCheck(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_grouppolicy_rsopFileAccessCheck(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_grouppolicy_rsopResetPolicySettingStatus(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_grouppolicy_rsopResetPolicySettingStatus(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_grouppolicy_rsopSetPolicySettingStatus(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_grouppolicy_rsopSetPolicySettingStatus(p0: Int, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_grouppolicy_uninstallApplication(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_grouppolicy_uninstallApplication(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_grouppolicy_unregisterGPNotification(p0)")
private external fun _wasm_windowssys_windows_win32_system_grouppolicy_unregisterGPNotification(p0: String): Int

public actual fun browseForGPO(lpbrowseinfo: COpaquePointer?): Hresult =
    if (_windowsWin32SystemGrouppolicyNapiAvailable) _wasm_windowssys_windows_win32_system_grouppolicy_browseForGPO((lpbrowseinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun commandLineFromMsiDescriptor(descriptor: Pcwstr, commandline: Pwstr, commandlinelength: COpaquePointer?): UInt =
    if (_windowsWin32SystemGrouppolicyNapiAvailable) _wasm_windowssys_windows_win32_system_grouppolicy_commandLineFromMsiDescriptor((descriptor?.value ?: 0L).toString(), (commandline?.value ?: 0L).toString(), (commandlinelength?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createGPOLink(lpgpo: Pcwstr, lpcontainer: Pcwstr, fhighpriority: Bool): Hresult =
    if (_windowsWin32SystemGrouppolicyNapiAvailable) _wasm_windowssys_windows_win32_system_grouppolicy_createGPOLink((lpgpo?.value ?: 0L).toString(), (lpcontainer?.value ?: 0L).toString(), fhighpriority) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteAllGPOLinks(lpcontainer: Pcwstr): Hresult =
    if (_windowsWin32SystemGrouppolicyNapiAvailable) _wasm_windowssys_windows_win32_system_grouppolicy_deleteAllGPOLinks((lpcontainer?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteGPOLink(lpgpo: Pcwstr, lpcontainer: Pcwstr): Hresult =
    if (_windowsWin32SystemGrouppolicyNapiAvailable) _wasm_windowssys_windows_win32_system_grouppolicy_deleteGPOLink((lpgpo?.value ?: 0L).toString(), (lpcontainer?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enterCriticalPolicySection(bmachine: Bool): Handle =
    if (_windowsWin32SystemGrouppolicyNapiAvailable) _wasm_windowssys_windows_win32_system_grouppolicy_enterCriticalPolicySection(bmachine).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exportRSoPData(lpnamespace: Pcwstr, lpfilename: Pcwstr): Hresult =
    if (_windowsWin32SystemGrouppolicyNapiAvailable) _wasm_windowssys_windows_win32_system_grouppolicy_exportRSoPData((lpnamespace?.value ?: 0L).toString(), (lpfilename?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeGPOListA(pgpolist: COpaquePointer?): Bool =
    if (_windowsWin32SystemGrouppolicyNapiAvailable) _wasm_windowssys_windows_win32_system_grouppolicy_freeGPOListA((pgpolist?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeGPOListW(pgpolist: COpaquePointer?): Bool =
    if (_windowsWin32SystemGrouppolicyNapiAvailable) _wasm_windowssys_windows_win32_system_grouppolicy_freeGPOListW((pgpolist?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun generateGPNotification(bmachine: Bool, lpwszmgmtproduct: Pcwstr, dwmgmtproductoptions: UInt): UInt =
    if (_windowsWin32SystemGrouppolicyNapiAvailable) _wasm_windowssys_windows_win32_system_grouppolicy_generateGPNotification(bmachine, (lpwszmgmtproduct?.value ?: 0L).toString(), dwmgmtproductoptions.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAppliedGPOListA(dwflags: UInt, pmachinename: Pcstr, psiduser: Psid, pguidextension: COpaquePointer?, ppgpolist: COpaquePointer?): UInt =
    if (_windowsWin32SystemGrouppolicyNapiAvailable) _wasm_windowssys_windows_win32_system_grouppolicy_getAppliedGPOListA(dwflags.toInt(), (pmachinename?.value ?: 0L).toString(), (psiduser?.value ?: 0L).toString(), (pguidextension?.value ?: 0L).toString(), (ppgpolist?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAppliedGPOListW(dwflags: UInt, pmachinename: Pcwstr, psiduser: Psid, pguidextension: COpaquePointer?, ppgpolist: COpaquePointer?): UInt =
    if (_windowsWin32SystemGrouppolicyNapiAvailable) _wasm_windowssys_windows_win32_system_grouppolicy_getAppliedGPOListW(dwflags.toInt(), (pmachinename?.value ?: 0L).toString(), (psiduser?.value ?: 0L).toString(), (pguidextension?.value ?: 0L).toString(), (ppgpolist?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getGPOListA(htoken: Handle, lpname: Pcstr, lphostname: Pcstr, lpcomputername: Pcstr, dwflags: UInt, pgpolist: COpaquePointer?): Bool =
    if (_windowsWin32SystemGrouppolicyNapiAvailable) _wasm_windowssys_windows_win32_system_grouppolicy_getGPOListA((htoken?.value ?: 0L).toString(), (lpname?.value ?: 0L).toString(), (lphostname?.value ?: 0L).toString(), (lpcomputername?.value ?: 0L).toString(), dwflags.toInt(), (pgpolist?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getGPOListW(htoken: Handle, lpname: Pcwstr, lphostname: Pcwstr, lpcomputername: Pcwstr, dwflags: UInt, pgpolist: COpaquePointer?): Bool =
    if (_windowsWin32SystemGrouppolicyNapiAvailable) _wasm_windowssys_windows_win32_system_grouppolicy_getGPOListW((htoken?.value ?: 0L).toString(), (lpname?.value ?: 0L).toString(), (lphostname?.value ?: 0L).toString(), (lpcomputername?.value ?: 0L).toString(), dwflags.toInt(), (pgpolist?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLocalManagedApplicationData(productcode: Pcwstr, displayname: COpaquePointer?, supporturl: COpaquePointer?) {
    if (_windowsWin32SystemGrouppolicyNapiAvailable) {
        _wasm_windowssys_windows_win32_system_grouppolicy_getLocalManagedApplicationData((productcode?.value ?: 0L).toString(), (displayname?.value ?: 0L).toString(), (supporturl?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getLocalManagedApplications(buserapps: Bool, pdwapps: COpaquePointer?, prglocalapps: COpaquePointer?): UInt =
    if (_windowsWin32SystemGrouppolicyNapiAvailable) _wasm_windowssys_windows_win32_system_grouppolicy_getLocalManagedApplications(buserapps, (pdwapps?.value ?: 0L).toString(), (prglocalapps?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getManagedApplicationCategories(dwreserved: UInt, pappcategory: COpaquePointer?): UInt =
    if (_windowsWin32SystemGrouppolicyNapiAvailable) _wasm_windowssys_windows_win32_system_grouppolicy_getManagedApplicationCategories(dwreserved.toInt(), (pappcategory?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getManagedApplications(pcategory: COpaquePointer?, dwqueryflags: UInt, dwinfolevel: UInt, pdwapps: COpaquePointer?, prgmanagedapps: COpaquePointer?): UInt =
    if (_windowsWin32SystemGrouppolicyNapiAvailable) _wasm_windowssys_windows_win32_system_grouppolicy_getManagedApplications((pcategory?.value ?: 0L).toString(), dwqueryflags.toInt(), dwinfolevel.toInt(), (pdwapps?.value ?: 0L).toString(), (prgmanagedapps?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun importRSoPData(lpnamespace: Pcwstr, lpfilename: Pcwstr): Hresult =
    if (_windowsWin32SystemGrouppolicyNapiAvailable) _wasm_windowssys_windows_win32_system_grouppolicy_importRSoPData((lpnamespace?.value ?: 0L).toString(), (lpfilename?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun installApplication(pinstallinfo: COpaquePointer?): UInt =
    if (_windowsWin32SystemGrouppolicyNapiAvailable) _wasm_windowssys_windows_win32_system_grouppolicy_installApplication((pinstallinfo?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun leaveCriticalPolicySection(hsection: Handle): Bool =
    if (_windowsWin32SystemGrouppolicyNapiAvailable) _wasm_windowssys_windows_win32_system_grouppolicy_leaveCriticalPolicySection((hsection?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun processGroupPolicyCompleted(extensionid: COpaquePointer?, pasynchandle: ULong, dwstatus: UInt): UInt =
    if (_windowsWin32SystemGrouppolicyNapiAvailable) _wasm_windowssys_windows_win32_system_grouppolicy_processGroupPolicyCompleted((extensionid?.value ?: 0L).toString(), pasynchandle.toString(), dwstatus.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun processGroupPolicyCompletedEx(extensionid: COpaquePointer?, pasynchandle: ULong, dwstatus: UInt, rsopstatus: Hresult): UInt =
    if (_windowsWin32SystemGrouppolicyNapiAvailable) _wasm_windowssys_windows_win32_system_grouppolicy_processGroupPolicyCompletedEx((extensionid?.value ?: 0L).toString(), pasynchandle.toString(), dwstatus.toInt(), rsopstatus).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun refreshPolicy(bmachine: Bool): Bool =
    if (_windowsWin32SystemGrouppolicyNapiAvailable) _wasm_windowssys_windows_win32_system_grouppolicy_refreshPolicy(bmachine) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun refreshPolicyEx(bmachine: Bool, dwoptions: UInt): Bool =
    if (_windowsWin32SystemGrouppolicyNapiAvailable) _wasm_windowssys_windows_win32_system_grouppolicy_refreshPolicyEx(bmachine, dwoptions.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerGPNotification(hevent: Handle, bmachine: Bool): Bool =
    if (_windowsWin32SystemGrouppolicyNapiAvailable) _wasm_windowssys_windows_win32_system_grouppolicy_registerGPNotification((hevent?.value ?: 0L).toString(), bmachine) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rsopAccessCheckByType(psecuritydescriptor: PsecurityDescriptor, pprincipalselfsid: Psid, prsoptoken: COpaquePointer?, dwdesiredaccessmask: UInt, pobjecttypelist: COpaquePointer?, objecttypelistlength: UInt, pgenericmapping: COpaquePointer?, pprivilegeset: COpaquePointer?, pdwprivilegesetlength: COpaquePointer?, pdwgrantedaccessmask: COpaquePointer?, pbaccessstatus: COpaquePointer?): Hresult =
    if (_windowsWin32SystemGrouppolicyNapiAvailable) _wasm_windowssys_windows_win32_system_grouppolicy_rsopAccessCheckByType((psecuritydescriptor?.value ?: 0L).toString(), (pprincipalselfsid?.value ?: 0L).toString(), (prsoptoken?.value ?: 0L).toString(), dwdesiredaccessmask.toInt(), (pobjecttypelist?.value ?: 0L).toString(), objecttypelistlength.toInt(), (pgenericmapping?.value ?: 0L).toString(), (pprivilegeset?.value ?: 0L).toString(), (pdwprivilegesetlength?.value ?: 0L).toString(), (pdwgrantedaccessmask?.value ?: 0L).toString(), (pbaccessstatus?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rsopFileAccessCheck(pszfilename: Pcwstr, prsoptoken: COpaquePointer?, dwdesiredaccessmask: UInt, pdwgrantedaccessmask: COpaquePointer?, pbaccessstatus: COpaquePointer?): Hresult =
    if (_windowsWin32SystemGrouppolicyNapiAvailable) _wasm_windowssys_windows_win32_system_grouppolicy_rsopFileAccessCheck((pszfilename?.value ?: 0L).toString(), (prsoptoken?.value ?: 0L).toString(), dwdesiredaccessmask.toInt(), (pdwgrantedaccessmask?.value ?: 0L).toString(), (pbaccessstatus?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rsopResetPolicySettingStatus(dwflags: UInt, pservices: COpaquePointer?, psettinginstance: COpaquePointer?): Hresult =
    if (_windowsWin32SystemGrouppolicyNapiAvailable) _wasm_windowssys_windows_win32_system_grouppolicy_rsopResetPolicySettingStatus(dwflags.toInt(), (pservices?.value ?: 0L).toString(), (psettinginstance?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rsopSetPolicySettingStatus(dwflags: UInt, pservices: COpaquePointer?, psettinginstance: COpaquePointer?, ninfo: UInt, pstatus: COpaquePointer?): Hresult =
    if (_windowsWin32SystemGrouppolicyNapiAvailable) _wasm_windowssys_windows_win32_system_grouppolicy_rsopSetPolicySettingStatus(dwflags.toInt(), (pservices?.value ?: 0L).toString(), (psettinginstance?.value ?: 0L).toString(), ninfo.toInt(), (pstatus?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uninstallApplication(productcode: Pcwstr, dwstatus: UInt): UInt =
    if (_windowsWin32SystemGrouppolicyNapiAvailable) _wasm_windowssys_windows_win32_system_grouppolicy_uninstallApplication((productcode?.value ?: 0L).toString(), dwstatus.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterGPNotification(hevent: Handle): Bool =
    if (_windowsWin32SystemGrouppolicyNapiAvailable) _wasm_windowssys_windows_win32_system_grouppolicy_unregisterGPNotification((hevent?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
