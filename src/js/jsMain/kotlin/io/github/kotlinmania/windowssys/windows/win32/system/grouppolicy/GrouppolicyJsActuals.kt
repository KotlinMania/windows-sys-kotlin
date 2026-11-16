@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.security.Psid

private val windowsWin32SystemGrouppolicyNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun browseForGPO(lpbrowseinfo: MutPtr): Hresult =
    if (windowsWin32SystemGrouppolicyNapiAddon != null) (windowsWin32SystemGrouppolicyNapiAddon.windowssysWindowsWin32SystemGrouppolicyBrowseForGPO(lpbrowseinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun commandLineFromMsiDescriptor(descriptor: Pcwstr, commandline: Pwstr, commandlinelength: MutPtr): UInt =
    if (windowsWin32SystemGrouppolicyNapiAddon != null) (windowsWin32SystemGrouppolicyNapiAddon.windowssysWindowsWin32SystemGrouppolicyCommandLineFromMsiDescriptor(descriptor.rawAddress.toString(), commandline.rawAddress.toString(), commandlinelength.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createGPOLink(lpgpo: Pcwstr, lpcontainer: Pcwstr, fhighpriority: Bool): Hresult =
    if (windowsWin32SystemGrouppolicyNapiAddon != null) (windowsWin32SystemGrouppolicyNapiAddon.windowssysWindowsWin32SystemGrouppolicyCreateGPOLink(lpgpo.rawAddress.toString(), lpcontainer.rawAddress.toString(), fhighpriority) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteAllGPOLinks(lpcontainer: Pcwstr): Hresult =
    if (windowsWin32SystemGrouppolicyNapiAddon != null) (windowsWin32SystemGrouppolicyNapiAddon.windowssysWindowsWin32SystemGrouppolicyDeleteAllGPOLinks(lpcontainer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteGPOLink(lpgpo: Pcwstr, lpcontainer: Pcwstr): Hresult =
    if (windowsWin32SystemGrouppolicyNapiAddon != null) (windowsWin32SystemGrouppolicyNapiAddon.windowssysWindowsWin32SystemGrouppolicyDeleteGPOLink(lpgpo.rawAddress.toString(), lpcontainer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enterCriticalPolicySection(bmachine: Bool): Handle =
    if (windowsWin32SystemGrouppolicyNapiAddon != null) MutPtr((windowsWin32SystemGrouppolicyNapiAddon.windowssysWindowsWin32SystemGrouppolicyEnterCriticalPolicySection(bmachine) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exportRSoPData(lpnamespace: Pcwstr, lpfilename: Pcwstr): Hresult =
    if (windowsWin32SystemGrouppolicyNapiAddon != null) (windowsWin32SystemGrouppolicyNapiAddon.windowssysWindowsWin32SystemGrouppolicyExportRSoPData(lpnamespace.rawAddress.toString(), lpfilename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeGPOListA(pgpolist: ConstPtr): Bool =
    if (windowsWin32SystemGrouppolicyNapiAddon != null) (windowsWin32SystemGrouppolicyNapiAddon.windowssysWindowsWin32SystemGrouppolicyFreeGPOListA(pgpolist.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeGPOListW(pgpolist: ConstPtr): Bool =
    if (windowsWin32SystemGrouppolicyNapiAddon != null) (windowsWin32SystemGrouppolicyNapiAddon.windowssysWindowsWin32SystemGrouppolicyFreeGPOListW(pgpolist.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun generateGPNotification(bmachine: Bool, lpwszmgmtproduct: Pcwstr, dwmgmtproductoptions: UInt): UInt =
    if (windowsWin32SystemGrouppolicyNapiAddon != null) (windowsWin32SystemGrouppolicyNapiAddon.windowssysWindowsWin32SystemGrouppolicyGenerateGPNotification(bmachine, lpwszmgmtproduct.rawAddress.toString(), dwmgmtproductoptions.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAppliedGPOListA(dwflags: UInt, pmachinename: Pcstr, psiduser: Psid, pguidextension: ConstPtr, ppgpolist: MutPtr): UInt =
    if (windowsWin32SystemGrouppolicyNapiAddon != null) (windowsWin32SystemGrouppolicyNapiAddon.windowssysWindowsWin32SystemGrouppolicyGetAppliedGPOListA(dwflags.toInt(), pmachinename.rawAddress.toString(), psiduser.rawAddress.toString(), pguidextension.rawAddress.toString(), ppgpolist.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAppliedGPOListW(dwflags: UInt, pmachinename: Pcwstr, psiduser: Psid, pguidextension: ConstPtr, ppgpolist: MutPtr): UInt =
    if (windowsWin32SystemGrouppolicyNapiAddon != null) (windowsWin32SystemGrouppolicyNapiAddon.windowssysWindowsWin32SystemGrouppolicyGetAppliedGPOListW(dwflags.toInt(), pmachinename.rawAddress.toString(), psiduser.rawAddress.toString(), pguidextension.rawAddress.toString(), ppgpolist.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getGPOListA(htoken: Handle, lpname: Pcstr, lphostname: Pcstr, lpcomputername: Pcstr, dwflags: UInt, pgpolist: MutPtr): Bool =
    if (windowsWin32SystemGrouppolicyNapiAddon != null) (windowsWin32SystemGrouppolicyNapiAddon.windowssysWindowsWin32SystemGrouppolicyGetGPOListA(htoken.rawAddress.toString(), lpname.rawAddress.toString(), lphostname.rawAddress.toString(), lpcomputername.rawAddress.toString(), dwflags.toInt(), pgpolist.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getGPOListW(htoken: Handle, lpname: Pcwstr, lphostname: Pcwstr, lpcomputername: Pcwstr, dwflags: UInt, pgpolist: MutPtr): Bool =
    if (windowsWin32SystemGrouppolicyNapiAddon != null) (windowsWin32SystemGrouppolicyNapiAddon.windowssysWindowsWin32SystemGrouppolicyGetGPOListW(htoken.rawAddress.toString(), lpname.rawAddress.toString(), lphostname.rawAddress.toString(), lpcomputername.rawAddress.toString(), dwflags.toInt(), pgpolist.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLocalManagedApplicationData(productcode: Pcwstr, displayname: MutPtr, supporturl: MutPtr) {
    if (windowsWin32SystemGrouppolicyNapiAddon != null) {
        windowsWin32SystemGrouppolicyNapiAddon.windowssysWindowsWin32SystemGrouppolicyGetLocalManagedApplicationData(productcode.rawAddress.toString(), displayname.rawAddress.toString(), supporturl.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getLocalManagedApplications(buserapps: Bool, pdwapps: MutPtr, prglocalapps: MutPtr): UInt =
    if (windowsWin32SystemGrouppolicyNapiAddon != null) (windowsWin32SystemGrouppolicyNapiAddon.windowssysWindowsWin32SystemGrouppolicyGetLocalManagedApplications(buserapps, pdwapps.rawAddress.toString(), prglocalapps.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getManagedApplicationCategories(dwreserved: UInt, pappcategory: MutPtr): UInt =
    if (windowsWin32SystemGrouppolicyNapiAddon != null) (windowsWin32SystemGrouppolicyNapiAddon.windowssysWindowsWin32SystemGrouppolicyGetManagedApplicationCategories(dwreserved.toInt(), pappcategory.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getManagedApplications(pcategory: ConstPtr, dwqueryflags: UInt, dwinfolevel: UInt, pdwapps: MutPtr, prgmanagedapps: MutPtr): UInt =
    if (windowsWin32SystemGrouppolicyNapiAddon != null) (windowsWin32SystemGrouppolicyNapiAddon.windowssysWindowsWin32SystemGrouppolicyGetManagedApplications(pcategory.rawAddress.toString(), dwqueryflags.toInt(), dwinfolevel.toInt(), pdwapps.rawAddress.toString(), prgmanagedapps.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun importRSoPData(lpnamespace: Pcwstr, lpfilename: Pcwstr): Hresult =
    if (windowsWin32SystemGrouppolicyNapiAddon != null) (windowsWin32SystemGrouppolicyNapiAddon.windowssysWindowsWin32SystemGrouppolicyImportRSoPData(lpnamespace.rawAddress.toString(), lpfilename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun installApplication(pinstallinfo: ConstPtr): UInt =
    if (windowsWin32SystemGrouppolicyNapiAddon != null) (windowsWin32SystemGrouppolicyNapiAddon.windowssysWindowsWin32SystemGrouppolicyInstallApplication(pinstallinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun leaveCriticalPolicySection(hsection: Handle): Bool =
    if (windowsWin32SystemGrouppolicyNapiAddon != null) (windowsWin32SystemGrouppolicyNapiAddon.windowssysWindowsWin32SystemGrouppolicyLeaveCriticalPolicySection(hsection.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun processGroupPolicyCompleted(extensionid: ConstPtr, pasynchandle: ULong, dwstatus: UInt): UInt =
    if (windowsWin32SystemGrouppolicyNapiAddon != null) (windowsWin32SystemGrouppolicyNapiAddon.windowssysWindowsWin32SystemGrouppolicyProcessGroupPolicyCompleted(extensionid.rawAddress.toString(), pasynchandle.toString(), dwstatus.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun processGroupPolicyCompletedEx(extensionid: ConstPtr, pasynchandle: ULong, dwstatus: UInt, rsopstatus: Hresult): UInt =
    if (windowsWin32SystemGrouppolicyNapiAddon != null) (windowsWin32SystemGrouppolicyNapiAddon.windowssysWindowsWin32SystemGrouppolicyProcessGroupPolicyCompletedEx(extensionid.rawAddress.toString(), pasynchandle.toString(), dwstatus.toInt(), rsopstatus) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun refreshPolicy(bmachine: Bool): Bool =
    if (windowsWin32SystemGrouppolicyNapiAddon != null) (windowsWin32SystemGrouppolicyNapiAddon.windowssysWindowsWin32SystemGrouppolicyRefreshPolicy(bmachine) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun refreshPolicyEx(bmachine: Bool, dwoptions: UInt): Bool =
    if (windowsWin32SystemGrouppolicyNapiAddon != null) (windowsWin32SystemGrouppolicyNapiAddon.windowssysWindowsWin32SystemGrouppolicyRefreshPolicyEx(bmachine, dwoptions.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerGPNotification(hevent: Handle, bmachine: Bool): Bool =
    if (windowsWin32SystemGrouppolicyNapiAddon != null) (windowsWin32SystemGrouppolicyNapiAddon.windowssysWindowsWin32SystemGrouppolicyRegisterGPNotification(hevent.rawAddress.toString(), bmachine) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rsopAccessCheckByType(psecuritydescriptor: PsecurityDescriptor, pprincipalselfsid: Psid, prsoptoken: ConstPtr, dwdesiredaccessmask: UInt, pobjecttypelist: ConstPtr, objecttypelistlength: UInt, pgenericmapping: ConstPtr, pprivilegeset: ConstPtr, pdwprivilegesetlength: ConstPtr, pdwgrantedaccessmask: MutPtr, pbaccessstatus: MutPtr): Hresult =
    if (windowsWin32SystemGrouppolicyNapiAddon != null) (windowsWin32SystemGrouppolicyNapiAddon.windowssysWindowsWin32SystemGrouppolicyRsopAccessCheckByType(psecuritydescriptor.rawAddress.toString(), pprincipalselfsid.rawAddress.toString(), prsoptoken.rawAddress.toString(), dwdesiredaccessmask.toInt(), pobjecttypelist.rawAddress.toString(), objecttypelistlength.toInt(), pgenericmapping.rawAddress.toString(), pprivilegeset.rawAddress.toString(), pdwprivilegesetlength.rawAddress.toString(), pdwgrantedaccessmask.rawAddress.toString(), pbaccessstatus.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rsopFileAccessCheck(pszfilename: Pcwstr, prsoptoken: ConstPtr, dwdesiredaccessmask: UInt, pdwgrantedaccessmask: MutPtr, pbaccessstatus: MutPtr): Hresult =
    if (windowsWin32SystemGrouppolicyNapiAddon != null) (windowsWin32SystemGrouppolicyNapiAddon.windowssysWindowsWin32SystemGrouppolicyRsopFileAccessCheck(pszfilename.rawAddress.toString(), prsoptoken.rawAddress.toString(), dwdesiredaccessmask.toInt(), pdwgrantedaccessmask.rawAddress.toString(), pbaccessstatus.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rsopResetPolicySettingStatus(dwflags: UInt, pservices: MutPtr, psettinginstance: MutPtr): Hresult =
    if (windowsWin32SystemGrouppolicyNapiAddon != null) (windowsWin32SystemGrouppolicyNapiAddon.windowssysWindowsWin32SystemGrouppolicyRsopResetPolicySettingStatus(dwflags.toInt(), pservices.rawAddress.toString(), psettinginstance.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rsopSetPolicySettingStatus(dwflags: UInt, pservices: MutPtr, psettinginstance: MutPtr, ninfo: UInt, pstatus: ConstPtr): Hresult =
    if (windowsWin32SystemGrouppolicyNapiAddon != null) (windowsWin32SystemGrouppolicyNapiAddon.windowssysWindowsWin32SystemGrouppolicyRsopSetPolicySettingStatus(dwflags.toInt(), pservices.rawAddress.toString(), psettinginstance.rawAddress.toString(), ninfo.toInt(), pstatus.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uninstallApplication(productcode: Pcwstr, dwstatus: UInt): UInt =
    if (windowsWin32SystemGrouppolicyNapiAddon != null) (windowsWin32SystemGrouppolicyNapiAddon.windowssysWindowsWin32SystemGrouppolicyUninstallApplication(productcode.rawAddress.toString(), dwstatus.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterGPNotification(hevent: Handle): Bool =
    if (windowsWin32SystemGrouppolicyNapiAddon != null) (windowsWin32SystemGrouppolicyNapiAddon.windowssysWindowsWin32SystemGrouppolicyUnregisterGPNotification(hevent.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
