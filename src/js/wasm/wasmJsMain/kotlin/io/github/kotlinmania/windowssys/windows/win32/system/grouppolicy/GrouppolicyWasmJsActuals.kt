@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.GenericMapping
import io.github.kotlinmania.windowssys.windows.win32.security.ObjectTypeList
import io.github.kotlinmania.windowssys.windows.win32.security.PrivilegeSet
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.Appcategoryinfolist

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SystemGrouppolicyNapiAddon(): Boolean

private val windowsWin32SystemGrouppolicyNapiAvailable: Boolean = initWindowsWin32SystemGrouppolicyNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemGrouppolicyBrowseForGPO(p0)")
private external fun wasmWindowssysWindowsWin32SystemGrouppolicyBrowseForGPO(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemGrouppolicyCommandLineFromMsiDescriptor(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemGrouppolicyCommandLineFromMsiDescriptor(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemGrouppolicyCreateGPOLink(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemGrouppolicyCreateGPOLink(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemGrouppolicyDeleteAllGPOLinks(p0)")
private external fun wasmWindowssysWindowsWin32SystemGrouppolicyDeleteAllGPOLinks(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemGrouppolicyDeleteGPOLink(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemGrouppolicyDeleteGPOLink(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemGrouppolicyEnterCriticalPolicySection(p0)")
private external fun wasmWindowssysWindowsWin32SystemGrouppolicyEnterCriticalPolicySection(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemGrouppolicyExportRSoPData(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemGrouppolicyExportRSoPData(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemGrouppolicyFreeGPOListA(p0)")
private external fun wasmWindowssysWindowsWin32SystemGrouppolicyFreeGPOListA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemGrouppolicyFreeGPOListW(p0)")
private external fun wasmWindowssysWindowsWin32SystemGrouppolicyFreeGPOListW(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemGrouppolicyGenerateGPNotification(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemGrouppolicyGenerateGPNotification(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemGrouppolicyGetAppliedGPOListA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemGrouppolicyGetAppliedGPOListA(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemGrouppolicyGetAppliedGPOListW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemGrouppolicyGetAppliedGPOListW(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemGrouppolicyGetGPOListA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemGrouppolicyGetGPOListA(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemGrouppolicyGetGPOListW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemGrouppolicyGetGPOListW(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemGrouppolicyGetLocalManagedApplicationData(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemGrouppolicyGetLocalManagedApplicationData(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemGrouppolicyGetLocalManagedApplications(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemGrouppolicyGetLocalManagedApplications(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemGrouppolicyGetManagedApplicationCategories(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemGrouppolicyGetManagedApplicationCategories(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemGrouppolicyGetManagedApplications(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemGrouppolicyGetManagedApplications(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemGrouppolicyImportRSoPData(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemGrouppolicyImportRSoPData(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemGrouppolicyInstallApplication(p0)")
private external fun wasmWindowssysWindowsWin32SystemGrouppolicyInstallApplication(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemGrouppolicyLeaveCriticalPolicySection(p0)")
private external fun wasmWindowssysWindowsWin32SystemGrouppolicyLeaveCriticalPolicySection(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemGrouppolicyProcessGroupPolicyCompleted(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemGrouppolicyProcessGroupPolicyCompleted(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemGrouppolicyProcessGroupPolicyCompletedEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemGrouppolicyProcessGroupPolicyCompletedEx(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemGrouppolicyRefreshPolicy(p0)")
private external fun wasmWindowssysWindowsWin32SystemGrouppolicyRefreshPolicy(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemGrouppolicyRefreshPolicyEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemGrouppolicyRefreshPolicyEx(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemGrouppolicyRegisterGPNotification(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemGrouppolicyRegisterGPNotification(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemGrouppolicyRsopAccessCheckByType(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWin32SystemGrouppolicyRsopAccessCheckByType(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: String, p8: String, p9: String, p10: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemGrouppolicyRsopFileAccessCheck(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemGrouppolicyRsopFileAccessCheck(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemGrouppolicyRsopResetPolicySettingStatus(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemGrouppolicyRsopResetPolicySettingStatus(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemGrouppolicyRsopSetPolicySettingStatus(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemGrouppolicyRsopSetPolicySettingStatus(p0: Int, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemGrouppolicyUninstallApplication(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemGrouppolicyUninstallApplication(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemGrouppolicyUnregisterGPNotification(p0)")
private external fun wasmWindowssysWindowsWin32SystemGrouppolicyUnregisterGPNotification(p0: String): Int

public actual fun browseForGPO(lpbrowseinfo: MutPtr<Gpobrowseinfo>): Hresult =
    if (windowsWin32SystemGrouppolicyNapiAvailable) wasmWindowssysWindowsWin32SystemGrouppolicyBrowseForGPO(lpbrowseinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun commandLineFromMsiDescriptor(descriptor: Pcwstr, commandline: Pwstr, commandlinelength: MutPtr<UInt>): UInt =
    if (windowsWin32SystemGrouppolicyNapiAvailable) wasmWindowssysWindowsWin32SystemGrouppolicyCommandLineFromMsiDescriptor(descriptor.rawAddress.toString(), commandline.rawAddress.toString(), commandlinelength.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createGPOLink(lpgpo: Pcwstr, lpcontainer: Pcwstr, fhighpriority: Bool): Hresult =
    if (windowsWin32SystemGrouppolicyNapiAvailable) wasmWindowssysWindowsWin32SystemGrouppolicyCreateGPOLink(lpgpo.rawAddress.toString(), lpcontainer.rawAddress.toString(), fhighpriority) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteAllGPOLinks(lpcontainer: Pcwstr): Hresult =
    if (windowsWin32SystemGrouppolicyNapiAvailable) wasmWindowssysWindowsWin32SystemGrouppolicyDeleteAllGPOLinks(lpcontainer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteGPOLink(lpgpo: Pcwstr, lpcontainer: Pcwstr): Hresult =
    if (windowsWin32SystemGrouppolicyNapiAvailable) wasmWindowssysWindowsWin32SystemGrouppolicyDeleteGPOLink(lpgpo.rawAddress.toString(), lpcontainer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enterCriticalPolicySection(bmachine: Bool): Handle =
    if (windowsWin32SystemGrouppolicyNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemGrouppolicyEnterCriticalPolicySection(bmachine).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exportRSoPData(lpnamespace: Pcwstr, lpfilename: Pcwstr): Hresult =
    if (windowsWin32SystemGrouppolicyNapiAvailable) wasmWindowssysWindowsWin32SystemGrouppolicyExportRSoPData(lpnamespace.rawAddress.toString(), lpfilename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeGPOListA(pgpolist: ConstPtr<GroupPolicyObjecta>): Bool =
    if (windowsWin32SystemGrouppolicyNapiAvailable) wasmWindowssysWindowsWin32SystemGrouppolicyFreeGPOListA(pgpolist.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeGPOListW(pgpolist: ConstPtr<GroupPolicyObjectw>): Bool =
    if (windowsWin32SystemGrouppolicyNapiAvailable) wasmWindowssysWindowsWin32SystemGrouppolicyFreeGPOListW(pgpolist.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun generateGPNotification(bmachine: Bool, lpwszmgmtproduct: Pcwstr, dwmgmtproductoptions: UInt): UInt =
    if (windowsWin32SystemGrouppolicyNapiAvailable) wasmWindowssysWindowsWin32SystemGrouppolicyGenerateGPNotification(bmachine, lpwszmgmtproduct.rawAddress.toString(), dwmgmtproductoptions.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAppliedGPOListA(dwflags: UInt, pmachinename: Pcstr, psiduser: Psid, pguidextension: ConstPtr<Guid>, ppgpolist: MutPtr<MutPtr<GroupPolicyObjecta>>): UInt =
    if (windowsWin32SystemGrouppolicyNapiAvailable) wasmWindowssysWindowsWin32SystemGrouppolicyGetAppliedGPOListA(dwflags.toInt(), pmachinename.rawAddress.toString(), psiduser.rawAddress.toString(), pguidextension.rawAddress.toString(), ppgpolist.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAppliedGPOListW(dwflags: UInt, pmachinename: Pcwstr, psiduser: Psid, pguidextension: ConstPtr<Guid>, ppgpolist: MutPtr<MutPtr<GroupPolicyObjectw>>): UInt =
    if (windowsWin32SystemGrouppolicyNapiAvailable) wasmWindowssysWindowsWin32SystemGrouppolicyGetAppliedGPOListW(dwflags.toInt(), pmachinename.rawAddress.toString(), psiduser.rawAddress.toString(), pguidextension.rawAddress.toString(), ppgpolist.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getGPOListA(htoken: Handle, lpname: Pcstr, lphostname: Pcstr, lpcomputername: Pcstr, dwflags: UInt, pgpolist: MutPtr<MutPtr<GroupPolicyObjecta>>): Bool =
    if (windowsWin32SystemGrouppolicyNapiAvailable) wasmWindowssysWindowsWin32SystemGrouppolicyGetGPOListA(htoken.rawAddress.toString(), lpname.rawAddress.toString(), lphostname.rawAddress.toString(), lpcomputername.rawAddress.toString(), dwflags.toInt(), pgpolist.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getGPOListW(htoken: Handle, lpname: Pcwstr, lphostname: Pcwstr, lpcomputername: Pcwstr, dwflags: UInt, pgpolist: MutPtr<MutPtr<GroupPolicyObjectw>>): Bool =
    if (windowsWin32SystemGrouppolicyNapiAvailable) wasmWindowssysWindowsWin32SystemGrouppolicyGetGPOListW(htoken.rawAddress.toString(), lpname.rawAddress.toString(), lphostname.rawAddress.toString(), lpcomputername.rawAddress.toString(), dwflags.toInt(), pgpolist.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLocalManagedApplicationData(productcode: Pcwstr, displayname: MutPtr<Pwstr>, supporturl: MutPtr<Pwstr>) {
    if (windowsWin32SystemGrouppolicyNapiAvailable) {
        wasmWindowssysWindowsWin32SystemGrouppolicyGetLocalManagedApplicationData(productcode.rawAddress.toString(), displayname.rawAddress.toString(), supporturl.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getLocalManagedApplications(buserapps: Bool, pdwapps: MutPtr<UInt>, prglocalapps: MutPtr<MutPtr<Localmanagedapplication>>): UInt =
    if (windowsWin32SystemGrouppolicyNapiAvailable) wasmWindowssysWindowsWin32SystemGrouppolicyGetLocalManagedApplications(buserapps, pdwapps.rawAddress.toString(), prglocalapps.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getManagedApplicationCategories(dwreserved: UInt, pappcategory: MutPtr<Appcategoryinfolist>): UInt =
    if (windowsWin32SystemGrouppolicyNapiAvailable) wasmWindowssysWindowsWin32SystemGrouppolicyGetManagedApplicationCategories(dwreserved.toInt(), pappcategory.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getManagedApplications(pcategory: ConstPtr<Guid>, dwqueryflags: UInt, dwinfolevel: UInt, pdwapps: MutPtr<UInt>, prgmanagedapps: MutPtr<MutPtr<Managedapplication>>): UInt =
    if (windowsWin32SystemGrouppolicyNapiAvailable) wasmWindowssysWindowsWin32SystemGrouppolicyGetManagedApplications(pcategory.rawAddress.toString(), dwqueryflags.toInt(), dwinfolevel.toInt(), pdwapps.rawAddress.toString(), prgmanagedapps.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun importRSoPData(lpnamespace: Pcwstr, lpfilename: Pcwstr): Hresult =
    if (windowsWin32SystemGrouppolicyNapiAvailable) wasmWindowssysWindowsWin32SystemGrouppolicyImportRSoPData(lpnamespace.rawAddress.toString(), lpfilename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun installApplication(pinstallinfo: ConstPtr<Installdata>): UInt =
    if (windowsWin32SystemGrouppolicyNapiAvailable) wasmWindowssysWindowsWin32SystemGrouppolicyInstallApplication(pinstallinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun leaveCriticalPolicySection(hsection: Handle): Bool =
    if (windowsWin32SystemGrouppolicyNapiAvailable) wasmWindowssysWindowsWin32SystemGrouppolicyLeaveCriticalPolicySection(hsection.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun processGroupPolicyCompleted(extensionid: ConstPtr<Guid>, pasynchandle: ULong, dwstatus: UInt): UInt =
    if (windowsWin32SystemGrouppolicyNapiAvailable) wasmWindowssysWindowsWin32SystemGrouppolicyProcessGroupPolicyCompleted(extensionid.rawAddress.toString(), pasynchandle.toString(), dwstatus.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun processGroupPolicyCompletedEx(extensionid: ConstPtr<Guid>, pasynchandle: ULong, dwstatus: UInt, rsopstatus: Hresult): UInt =
    if (windowsWin32SystemGrouppolicyNapiAvailable) wasmWindowssysWindowsWin32SystemGrouppolicyProcessGroupPolicyCompletedEx(extensionid.rawAddress.toString(), pasynchandle.toString(), dwstatus.toInt(), rsopstatus).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun refreshPolicy(bmachine: Bool): Bool =
    if (windowsWin32SystemGrouppolicyNapiAvailable) wasmWindowssysWindowsWin32SystemGrouppolicyRefreshPolicy(bmachine) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun refreshPolicyEx(bmachine: Bool, dwoptions: UInt): Bool =
    if (windowsWin32SystemGrouppolicyNapiAvailable) wasmWindowssysWindowsWin32SystemGrouppolicyRefreshPolicyEx(bmachine, dwoptions.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerGPNotification(hevent: Handle, bmachine: Bool): Bool =
    if (windowsWin32SystemGrouppolicyNapiAvailable) wasmWindowssysWindowsWin32SystemGrouppolicyRegisterGPNotification(hevent.rawAddress.toString(), bmachine) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rsopAccessCheckByType(psecuritydescriptor: PsecurityDescriptor, pprincipalselfsid: Psid, prsoptoken: ConstPtr<CVoid>, dwdesiredaccessmask: UInt, pobjecttypelist: ConstPtr<ObjectTypeList>, objecttypelistlength: UInt, pgenericmapping: ConstPtr<GenericMapping>, pprivilegeset: ConstPtr<PrivilegeSet>, pdwprivilegesetlength: ConstPtr<UInt>, pdwgrantedaccessmask: MutPtr<UInt>, pbaccessstatus: MutPtr<Bool>): Hresult =
    if (windowsWin32SystemGrouppolicyNapiAvailable) wasmWindowssysWindowsWin32SystemGrouppolicyRsopAccessCheckByType(psecuritydescriptor.rawAddress.toString(), pprincipalselfsid.rawAddress.toString(), prsoptoken.rawAddress.toString(), dwdesiredaccessmask.toInt(), pobjecttypelist.rawAddress.toString(), objecttypelistlength.toInt(), pgenericmapping.rawAddress.toString(), pprivilegeset.rawAddress.toString(), pdwprivilegesetlength.rawAddress.toString(), pdwgrantedaccessmask.rawAddress.toString(), pbaccessstatus.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rsopFileAccessCheck(pszfilename: Pcwstr, prsoptoken: ConstPtr<CVoid>, dwdesiredaccessmask: UInt, pdwgrantedaccessmask: MutPtr<UInt>, pbaccessstatus: MutPtr<Bool>): Hresult =
    if (windowsWin32SystemGrouppolicyNapiAvailable) wasmWindowssysWindowsWin32SystemGrouppolicyRsopFileAccessCheck(pszfilename.rawAddress.toString(), prsoptoken.rawAddress.toString(), dwdesiredaccessmask.toInt(), pdwgrantedaccessmask.rawAddress.toString(), pbaccessstatus.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rsopResetPolicySettingStatus(dwflags: UInt, pservices: MutPtr<CVoid>, psettinginstance: MutPtr<CVoid>): Hresult =
    if (windowsWin32SystemGrouppolicyNapiAvailable) wasmWindowssysWindowsWin32SystemGrouppolicyRsopResetPolicySettingStatus(dwflags.toInt(), pservices.rawAddress.toString(), psettinginstance.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rsopSetPolicySettingStatus(dwflags: UInt, pservices: MutPtr<CVoid>, psettinginstance: MutPtr<CVoid>, ninfo: UInt, pstatus: ConstPtr<Policysettingstatusinfo>): Hresult =
    if (windowsWin32SystemGrouppolicyNapiAvailable) wasmWindowssysWindowsWin32SystemGrouppolicyRsopSetPolicySettingStatus(dwflags.toInt(), pservices.rawAddress.toString(), psettinginstance.rawAddress.toString(), ninfo.toInt(), pstatus.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uninstallApplication(productcode: Pcwstr, dwstatus: UInt): UInt =
    if (windowsWin32SystemGrouppolicyNapiAvailable) wasmWindowssysWindowsWin32SystemGrouppolicyUninstallApplication(productcode.rawAddress.toString(), dwstatus.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterGPNotification(hevent: Handle): Bool =
    if (windowsWin32SystemGrouppolicyNapiAvailable) wasmWindowssysWindowsWin32SystemGrouppolicyUnregisterGPNotification(hevent.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
