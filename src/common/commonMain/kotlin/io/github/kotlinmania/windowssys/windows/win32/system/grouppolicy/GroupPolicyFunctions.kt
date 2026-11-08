package io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR
import io.github.kotlinmania.windowssys.windows.win32.security.PSID

public fun BrowseForGPO(lpbrowseinfo: Long): HRESULT {
    return Win32DynamicFfi.invoke("gpedit.dll", "BrowseForGPO", longArrayOf(lpbrowseinfo)).toInt()
}

public fun CommandLineFromMsiDescriptor(descriptor: PCWSTR, commandline: PWSTR, commandlinelength: Long): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "CommandLineFromMsiDescriptor", longArrayOf(descriptor, commandline, commandlinelength)).toUInt()
}

public fun CreateGPOLink(lpgpo: PCWSTR, lpcontainer: PCWSTR, fhighpriority: BOOL): HRESULT {
    return Win32DynamicFfi.invoke("gpedit.dll", "CreateGPOLink", longArrayOf(lpgpo, lpcontainer, fhighpriority.toLong())).toInt()
}

public fun DeleteAllGPOLinks(lpcontainer: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("gpedit.dll", "DeleteAllGPOLinks", longArrayOf(lpcontainer)).toInt()
}

public fun DeleteGPOLink(lpgpo: PCWSTR, lpcontainer: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("gpedit.dll", "DeleteGPOLink", longArrayOf(lpgpo, lpcontainer)).toInt()
}

public fun EnterCriticalPolicySection(bmachine: BOOL): HANDLE {
    return Win32DynamicFfi.invoke("userenv.dll", "EnterCriticalPolicySection", longArrayOf(bmachine.toLong()))
}

public fun ExportRSoPData(lpnamespace: PCWSTR, lpfilename: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("gpedit.dll", "ExportRSoPData", longArrayOf(lpnamespace, lpfilename)).toInt()
}

public fun FreeGPOListA(pgpolist: Long): BOOL {
    return Win32DynamicFfi.invoke("userenv.dll", "FreeGPOListA", longArrayOf(pgpolist)).toInt()
}

public fun FreeGPOListW(pgpolist: Long): BOOL {
    return Win32DynamicFfi.invoke("userenv.dll", "FreeGPOListW", longArrayOf(pgpolist)).toInt()
}

public fun GenerateGPNotification(bmachine: BOOL, lpwszmgmtproduct: PCWSTR, dwmgmtproductoptions: UInt): UInt {
    return Win32DynamicFfi.invoke("userenv.dll", "GenerateGPNotification", longArrayOf(bmachine.toLong(), lpwszmgmtproduct, dwmgmtproductoptions.toLong())).toUInt()
}

public fun GetAppliedGPOListA(dwflags: UInt, pmachinename: PCSTR, psiduser: PSID, pguidextension: Long, ppgpolist: Long): UInt {
    return Win32DynamicFfi.invoke("userenv.dll", "GetAppliedGPOListA", longArrayOf(dwflags.toLong(), pmachinename, psiduser, pguidextension, ppgpolist)).toUInt()
}

public fun GetAppliedGPOListW(dwflags: UInt, pmachinename: PCWSTR, psiduser: PSID, pguidextension: Long, ppgpolist: Long): UInt {
    return Win32DynamicFfi.invoke("userenv.dll", "GetAppliedGPOListW", longArrayOf(dwflags.toLong(), pmachinename, psiduser, pguidextension, ppgpolist)).toUInt()
}

public fun GetGPOListA(htoken: HANDLE, lpname: PCSTR, lphostname: PCSTR, lpcomputername: PCSTR, dwflags: UInt, pgpolist: Long): BOOL {
    return Win32DynamicFfi.invoke("userenv.dll", "GetGPOListA", longArrayOf(htoken, lpname, lphostname, lpcomputername, dwflags.toLong(), pgpolist)).toInt()
}

public fun GetGPOListW(htoken: HANDLE, lpname: PCWSTR, lphostname: PCWSTR, lpcomputername: PCWSTR, dwflags: UInt, pgpolist: Long): BOOL {
    return Win32DynamicFfi.invoke("userenv.dll", "GetGPOListW", longArrayOf(htoken, lpname, lphostname, lpcomputername, dwflags.toLong(), pgpolist)).toInt()
}

public fun GetLocalManagedApplicationData(productcode: PCWSTR, displayname: Long, supporturl: Long) {
    Win32DynamicFfi.invoke("advapi32.dll", "GetLocalManagedApplicationData", longArrayOf(productcode, displayname, supporturl))
}

public fun GetLocalManagedApplications(buserapps: BOOL, pdwapps: Long, prglocalapps: Long): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "GetLocalManagedApplications", longArrayOf(buserapps.toLong(), pdwapps, prglocalapps)).toUInt()
}

public fun GetManagedApplicationCategories(dwreserved: UInt, pappcategory: Long): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "GetManagedApplicationCategories", longArrayOf(dwreserved.toLong(), pappcategory)).toUInt()
}

public fun GetManagedApplications(pcategory: Long, dwqueryflags: UInt, dwinfolevel: UInt, pdwapps: Long, prgmanagedapps: Long): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "GetManagedApplications", longArrayOf(pcategory, dwqueryflags.toLong(), dwinfolevel.toLong(), pdwapps, prgmanagedapps)).toUInt()
}

public fun ImportRSoPData(lpnamespace: PCWSTR, lpfilename: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("gpedit.dll", "ImportRSoPData", longArrayOf(lpnamespace, lpfilename)).toInt()
}

public fun InstallApplication(pinstallinfo: Long): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "InstallApplication", longArrayOf(pinstallinfo)).toUInt()
}

public fun LeaveCriticalPolicySection(hsection: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("userenv.dll", "LeaveCriticalPolicySection", longArrayOf(hsection)).toInt()
}

public fun ProcessGroupPolicyCompleted(extensionid: Long, pasynchandle: ULong, dwstatus: UInt): UInt {
    return Win32DynamicFfi.invoke("userenv.dll", "ProcessGroupPolicyCompleted", longArrayOf(extensionid, pasynchandle.toLong(), dwstatus.toLong())).toUInt()
}

public fun ProcessGroupPolicyCompletedEx(extensionid: Long, pasynchandle: ULong, dwstatus: UInt, rsopstatus: HRESULT): UInt {
    return Win32DynamicFfi.invoke("userenv.dll", "ProcessGroupPolicyCompletedEx", longArrayOf(extensionid, pasynchandle.toLong(), dwstatus.toLong(), rsopstatus.toLong())).toUInt()
}

public fun RefreshPolicy(bmachine: BOOL): BOOL {
    return Win32DynamicFfi.invoke("userenv.dll", "RefreshPolicy", longArrayOf(bmachine.toLong())).toInt()
}

public fun RefreshPolicyEx(bmachine: BOOL, dwoptions: UInt): BOOL {
    return Win32DynamicFfi.invoke("userenv.dll", "RefreshPolicyEx", longArrayOf(bmachine.toLong(), dwoptions.toLong())).toInt()
}

public fun RegisterGPNotification(hevent: HANDLE, bmachine: BOOL): BOOL {
    return Win32DynamicFfi.invoke("userenv.dll", "RegisterGPNotification", longArrayOf(hevent, bmachine.toLong())).toInt()
}

public fun RsopAccessCheckByType(psecuritydescriptor: PSECURITY_DESCRIPTOR, pprincipalselfsid: PSID, prsoptoken: Long, dwdesiredaccessmask: UInt, pobjecttypelist: Long, objecttypelistlength: UInt, pgenericmapping: Long, pprivilegeset: Long, pdwprivilegesetlength: Long, pdwgrantedaccessmask: Long, pbaccessstatus: Long): HRESULT {
    return Win32DynamicFfi.invoke("userenv.dll", "RsopAccessCheckByType", longArrayOf(psecuritydescriptor, pprincipalselfsid, prsoptoken, dwdesiredaccessmask.toLong(), pobjecttypelist, objecttypelistlength.toLong(), pgenericmapping, pprivilegeset, pdwprivilegesetlength, pdwgrantedaccessmask, pbaccessstatus)).toInt()
}

public fun RsopFileAccessCheck(pszfilename: PCWSTR, prsoptoken: Long, dwdesiredaccessmask: UInt, pdwgrantedaccessmask: Long, pbaccessstatus: Long): HRESULT {
    return Win32DynamicFfi.invoke("userenv.dll", "RsopFileAccessCheck", longArrayOf(pszfilename, prsoptoken, dwdesiredaccessmask.toLong(), pdwgrantedaccessmask, pbaccessstatus)).toInt()
}

public fun RsopResetPolicySettingStatus(dwflags: UInt, pservices: Long, psettinginstance: Long): HRESULT {
    return Win32DynamicFfi.invoke("userenv.dll", "RsopResetPolicySettingStatus", longArrayOf(dwflags.toLong(), pservices, psettinginstance)).toInt()
}

public fun RsopSetPolicySettingStatus(dwflags: UInt, pservices: Long, psettinginstance: Long, ninfo: UInt, pstatus: Long): HRESULT {
    return Win32DynamicFfi.invoke("userenv.dll", "RsopSetPolicySettingStatus", longArrayOf(dwflags.toLong(), pservices, psettinginstance, ninfo.toLong(), pstatus)).toInt()
}

public fun UninstallApplication(productcode: PCWSTR, dwstatus: UInt): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "UninstallApplication", longArrayOf(productcode, dwstatus.toLong())).toUInt()
}

public fun UnregisterGPNotification(hevent: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("userenv.dll", "UnregisterGPNotification", longArrayOf(hevent)).toInt()
}
