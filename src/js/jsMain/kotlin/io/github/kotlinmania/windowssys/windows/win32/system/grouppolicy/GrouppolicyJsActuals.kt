@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR
import io.github.kotlinmania.windowssys.windows.win32.security.PSID

private val _windowsWin32SystemGrouppolicyNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun BrowseForGPO(lpbrowseinfo: Long): HRESULT =
    if (_windowsWin32SystemGrouppolicyNapiAddon != null) (_windowsWin32SystemGrouppolicyNapiAddon.windowssys_windows_win32_system_grouppolicy_BrowseForGPO(lpbrowseinfo.toString()) as Int) else 0

public actual fun CommandLineFromMsiDescriptor(descriptor: PCWSTR, commandline: PWSTR, commandlinelength: Long): UInt =
    if (_windowsWin32SystemGrouppolicyNapiAddon != null) (_windowsWin32SystemGrouppolicyNapiAddon.windowssys_windows_win32_system_grouppolicy_CommandLineFromMsiDescriptor(descriptor.toString(), commandline.toString(), commandlinelength.toString()) as Int).toUInt() else 0u

public actual fun CreateGPOLink(lpgpo: PCWSTR, lpcontainer: PCWSTR, fhighpriority: BOOL): HRESULT =
    if (_windowsWin32SystemGrouppolicyNapiAddon != null) (_windowsWin32SystemGrouppolicyNapiAddon.windowssys_windows_win32_system_grouppolicy_CreateGPOLink(lpgpo.toString(), lpcontainer.toString(), fhighpriority) as Int) else 0

public actual fun DeleteAllGPOLinks(lpcontainer: PCWSTR): HRESULT =
    if (_windowsWin32SystemGrouppolicyNapiAddon != null) (_windowsWin32SystemGrouppolicyNapiAddon.windowssys_windows_win32_system_grouppolicy_DeleteAllGPOLinks(lpcontainer.toString()) as Int) else 0

public actual fun DeleteGPOLink(lpgpo: PCWSTR, lpcontainer: PCWSTR): HRESULT =
    if (_windowsWin32SystemGrouppolicyNapiAddon != null) (_windowsWin32SystemGrouppolicyNapiAddon.windowssys_windows_win32_system_grouppolicy_DeleteGPOLink(lpgpo.toString(), lpcontainer.toString()) as Int) else 0

public actual fun EnterCriticalPolicySection(bmachine: BOOL): HANDLE =
    if (_windowsWin32SystemGrouppolicyNapiAddon != null) (_windowsWin32SystemGrouppolicyNapiAddon.windowssys_windows_win32_system_grouppolicy_EnterCriticalPolicySection(bmachine) as String).toLong() else 0L

public actual fun ExportRSoPData(lpnamespace: PCWSTR, lpfilename: PCWSTR): HRESULT =
    if (_windowsWin32SystemGrouppolicyNapiAddon != null) (_windowsWin32SystemGrouppolicyNapiAddon.windowssys_windows_win32_system_grouppolicy_ExportRSoPData(lpnamespace.toString(), lpfilename.toString()) as Int) else 0

public actual fun FreeGPOListA(pgpolist: Long): BOOL =
    if (_windowsWin32SystemGrouppolicyNapiAddon != null) (_windowsWin32SystemGrouppolicyNapiAddon.windowssys_windows_win32_system_grouppolicy_FreeGPOListA(pgpolist.toString()) as Int) else 0

public actual fun FreeGPOListW(pgpolist: Long): BOOL =
    if (_windowsWin32SystemGrouppolicyNapiAddon != null) (_windowsWin32SystemGrouppolicyNapiAddon.windowssys_windows_win32_system_grouppolicy_FreeGPOListW(pgpolist.toString()) as Int) else 0

public actual fun GenerateGPNotification(bmachine: BOOL, lpwszmgmtproduct: PCWSTR, dwmgmtproductoptions: UInt): UInt =
    if (_windowsWin32SystemGrouppolicyNapiAddon != null) (_windowsWin32SystemGrouppolicyNapiAddon.windowssys_windows_win32_system_grouppolicy_GenerateGPNotification(bmachine, lpwszmgmtproduct.toString(), dwmgmtproductoptions.toInt()) as Int).toUInt() else 0u

public actual fun GetAppliedGPOListA(dwflags: UInt, pmachinename: PCSTR, psiduser: PSID, pguidextension: Long, ppgpolist: Long): UInt =
    if (_windowsWin32SystemGrouppolicyNapiAddon != null) (_windowsWin32SystemGrouppolicyNapiAddon.windowssys_windows_win32_system_grouppolicy_GetAppliedGPOListA(dwflags.toInt(), pmachinename.toString(), psiduser.toString(), pguidextension.toString(), ppgpolist.toString()) as Int).toUInt() else 0u

public actual fun GetAppliedGPOListW(dwflags: UInt, pmachinename: PCWSTR, psiduser: PSID, pguidextension: Long, ppgpolist: Long): UInt =
    if (_windowsWin32SystemGrouppolicyNapiAddon != null) (_windowsWin32SystemGrouppolicyNapiAddon.windowssys_windows_win32_system_grouppolicy_GetAppliedGPOListW(dwflags.toInt(), pmachinename.toString(), psiduser.toString(), pguidextension.toString(), ppgpolist.toString()) as Int).toUInt() else 0u

public actual fun GetGPOListA(htoken: HANDLE, lpname: PCSTR, lphostname: PCSTR, lpcomputername: PCSTR, dwflags: UInt, pgpolist: Long): BOOL =
    if (_windowsWin32SystemGrouppolicyNapiAddon != null) (_windowsWin32SystemGrouppolicyNapiAddon.windowssys_windows_win32_system_grouppolicy_GetGPOListA(htoken.toString(), lpname.toString(), lphostname.toString(), lpcomputername.toString(), dwflags.toInt(), pgpolist.toString()) as Int) else 0

public actual fun GetGPOListW(htoken: HANDLE, lpname: PCWSTR, lphostname: PCWSTR, lpcomputername: PCWSTR, dwflags: UInt, pgpolist: Long): BOOL =
    if (_windowsWin32SystemGrouppolicyNapiAddon != null) (_windowsWin32SystemGrouppolicyNapiAddon.windowssys_windows_win32_system_grouppolicy_GetGPOListW(htoken.toString(), lpname.toString(), lphostname.toString(), lpcomputername.toString(), dwflags.toInt(), pgpolist.toString()) as Int) else 0

public actual fun GetLocalManagedApplicationData(productcode: PCWSTR, displayname: Long, supporturl: Long) {
    if (_windowsWin32SystemGrouppolicyNapiAddon != null) {
        _windowsWin32SystemGrouppolicyNapiAddon.windowssys_windows_win32_system_grouppolicy_GetLocalManagedApplicationData(productcode.toString(), displayname.toString(), supporturl.toString())
    }
}

public actual fun GetLocalManagedApplications(buserapps: BOOL, pdwapps: Long, prglocalapps: Long): UInt =
    if (_windowsWin32SystemGrouppolicyNapiAddon != null) (_windowsWin32SystemGrouppolicyNapiAddon.windowssys_windows_win32_system_grouppolicy_GetLocalManagedApplications(buserapps, pdwapps.toString(), prglocalapps.toString()) as Int).toUInt() else 0u

public actual fun GetManagedApplicationCategories(dwreserved: UInt, pappcategory: Long): UInt =
    if (_windowsWin32SystemGrouppolicyNapiAddon != null) (_windowsWin32SystemGrouppolicyNapiAddon.windowssys_windows_win32_system_grouppolicy_GetManagedApplicationCategories(dwreserved.toInt(), pappcategory.toString()) as Int).toUInt() else 0u

public actual fun GetManagedApplications(pcategory: Long, dwqueryflags: UInt, dwinfolevel: UInt, pdwapps: Long, prgmanagedapps: Long): UInt =
    if (_windowsWin32SystemGrouppolicyNapiAddon != null) (_windowsWin32SystemGrouppolicyNapiAddon.windowssys_windows_win32_system_grouppolicy_GetManagedApplications(pcategory.toString(), dwqueryflags.toInt(), dwinfolevel.toInt(), pdwapps.toString(), prgmanagedapps.toString()) as Int).toUInt() else 0u

public actual fun ImportRSoPData(lpnamespace: PCWSTR, lpfilename: PCWSTR): HRESULT =
    if (_windowsWin32SystemGrouppolicyNapiAddon != null) (_windowsWin32SystemGrouppolicyNapiAddon.windowssys_windows_win32_system_grouppolicy_ImportRSoPData(lpnamespace.toString(), lpfilename.toString()) as Int) else 0

public actual fun InstallApplication(pinstallinfo: Long): UInt =
    if (_windowsWin32SystemGrouppolicyNapiAddon != null) (_windowsWin32SystemGrouppolicyNapiAddon.windowssys_windows_win32_system_grouppolicy_InstallApplication(pinstallinfo.toString()) as Int).toUInt() else 0u

public actual fun LeaveCriticalPolicySection(hsection: HANDLE): BOOL =
    if (_windowsWin32SystemGrouppolicyNapiAddon != null) (_windowsWin32SystemGrouppolicyNapiAddon.windowssys_windows_win32_system_grouppolicy_LeaveCriticalPolicySection(hsection.toString()) as Int) else 0

public actual fun ProcessGroupPolicyCompleted(extensionid: Long, pasynchandle: ULong, dwstatus: UInt): UInt =
    if (_windowsWin32SystemGrouppolicyNapiAddon != null) (_windowsWin32SystemGrouppolicyNapiAddon.windowssys_windows_win32_system_grouppolicy_ProcessGroupPolicyCompleted(extensionid.toString(), pasynchandle.toString(), dwstatus.toInt()) as Int).toUInt() else 0u

public actual fun ProcessGroupPolicyCompletedEx(extensionid: Long, pasynchandle: ULong, dwstatus: UInt, rsopstatus: HRESULT): UInt =
    if (_windowsWin32SystemGrouppolicyNapiAddon != null) (_windowsWin32SystemGrouppolicyNapiAddon.windowssys_windows_win32_system_grouppolicy_ProcessGroupPolicyCompletedEx(extensionid.toString(), pasynchandle.toString(), dwstatus.toInt(), rsopstatus) as Int).toUInt() else 0u

public actual fun RefreshPolicy(bmachine: BOOL): BOOL =
    if (_windowsWin32SystemGrouppolicyNapiAddon != null) (_windowsWin32SystemGrouppolicyNapiAddon.windowssys_windows_win32_system_grouppolicy_RefreshPolicy(bmachine) as Int) else 0

public actual fun RefreshPolicyEx(bmachine: BOOL, dwoptions: UInt): BOOL =
    if (_windowsWin32SystemGrouppolicyNapiAddon != null) (_windowsWin32SystemGrouppolicyNapiAddon.windowssys_windows_win32_system_grouppolicy_RefreshPolicyEx(bmachine, dwoptions.toInt()) as Int) else 0

public actual fun RegisterGPNotification(hevent: HANDLE, bmachine: BOOL): BOOL =
    if (_windowsWin32SystemGrouppolicyNapiAddon != null) (_windowsWin32SystemGrouppolicyNapiAddon.windowssys_windows_win32_system_grouppolicy_RegisterGPNotification(hevent.toString(), bmachine) as Int) else 0

public actual fun RsopAccessCheckByType(psecuritydescriptor: PSECURITY_DESCRIPTOR, pprincipalselfsid: PSID, prsoptoken: Long, dwdesiredaccessmask: UInt, pobjecttypelist: Long, objecttypelistlength: UInt, pgenericmapping: Long, pprivilegeset: Long, pdwprivilegesetlength: Long, pdwgrantedaccessmask: Long, pbaccessstatus: Long): HRESULT =
    if (_windowsWin32SystemGrouppolicyNapiAddon != null) (_windowsWin32SystemGrouppolicyNapiAddon.windowssys_windows_win32_system_grouppolicy_RsopAccessCheckByType(psecuritydescriptor.toString(), pprincipalselfsid.toString(), prsoptoken.toString(), dwdesiredaccessmask.toInt(), pobjecttypelist.toString(), objecttypelistlength.toInt(), pgenericmapping.toString(), pprivilegeset.toString(), pdwprivilegesetlength.toString(), pdwgrantedaccessmask.toString(), pbaccessstatus.toString()) as Int) else 0

public actual fun RsopFileAccessCheck(pszfilename: PCWSTR, prsoptoken: Long, dwdesiredaccessmask: UInt, pdwgrantedaccessmask: Long, pbaccessstatus: Long): HRESULT =
    if (_windowsWin32SystemGrouppolicyNapiAddon != null) (_windowsWin32SystemGrouppolicyNapiAddon.windowssys_windows_win32_system_grouppolicy_RsopFileAccessCheck(pszfilename.toString(), prsoptoken.toString(), dwdesiredaccessmask.toInt(), pdwgrantedaccessmask.toString(), pbaccessstatus.toString()) as Int) else 0

public actual fun RsopResetPolicySettingStatus(dwflags: UInt, pservices: Long, psettinginstance: Long): HRESULT =
    if (_windowsWin32SystemGrouppolicyNapiAddon != null) (_windowsWin32SystemGrouppolicyNapiAddon.windowssys_windows_win32_system_grouppolicy_RsopResetPolicySettingStatus(dwflags.toInt(), pservices.toString(), psettinginstance.toString()) as Int) else 0

public actual fun RsopSetPolicySettingStatus(dwflags: UInt, pservices: Long, psettinginstance: Long, ninfo: UInt, pstatus: Long): HRESULT =
    if (_windowsWin32SystemGrouppolicyNapiAddon != null) (_windowsWin32SystemGrouppolicyNapiAddon.windowssys_windows_win32_system_grouppolicy_RsopSetPolicySettingStatus(dwflags.toInt(), pservices.toString(), psettinginstance.toString(), ninfo.toInt(), pstatus.toString()) as Int) else 0

public actual fun UninstallApplication(productcode: PCWSTR, dwstatus: UInt): UInt =
    if (_windowsWin32SystemGrouppolicyNapiAddon != null) (_windowsWin32SystemGrouppolicyNapiAddon.windowssys_windows_win32_system_grouppolicy_UninstallApplication(productcode.toString(), dwstatus.toInt()) as Int).toUInt() else 0u

public actual fun UnregisterGPNotification(hevent: HANDLE): BOOL =
    if (_windowsWin32SystemGrouppolicyNapiAddon != null) (_windowsWin32SystemGrouppolicyNapiAddon.windowssys_windows_win32_system_grouppolicy_UnregisterGPNotification(hevent.toString()) as Int) else 0
