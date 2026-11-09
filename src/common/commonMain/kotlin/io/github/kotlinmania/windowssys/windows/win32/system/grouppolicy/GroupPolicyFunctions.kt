package io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR
import io.github.kotlinmania.windowssys.windows.win32.security.PSID

public expect fun BrowseForGPO(lpbrowseinfo: Long): HRESULT

public expect fun CommandLineFromMsiDescriptor(descriptor: PCWSTR, commandline: PWSTR, commandlinelength: Long): UInt

public expect fun CreateGPOLink(lpgpo: PCWSTR, lpcontainer: PCWSTR, fhighpriority: BOOL): HRESULT

public expect fun DeleteAllGPOLinks(lpcontainer: PCWSTR): HRESULT

public expect fun DeleteGPOLink(lpgpo: PCWSTR, lpcontainer: PCWSTR): HRESULT

public expect fun EnterCriticalPolicySection(bmachine: BOOL): HANDLE

public expect fun ExportRSoPData(lpnamespace: PCWSTR, lpfilename: PCWSTR): HRESULT

public expect fun FreeGPOListA(pgpolist: Long): BOOL

public expect fun FreeGPOListW(pgpolist: Long): BOOL

public expect fun GenerateGPNotification(bmachine: BOOL, lpwszmgmtproduct: PCWSTR, dwmgmtproductoptions: UInt): UInt

public expect fun GetAppliedGPOListA(dwflags: UInt, pmachinename: PCSTR, psiduser: PSID, pguidextension: Long, ppgpolist: Long): UInt

public expect fun GetAppliedGPOListW(dwflags: UInt, pmachinename: PCWSTR, psiduser: PSID, pguidextension: Long, ppgpolist: Long): UInt

public expect fun GetGPOListA(htoken: HANDLE, lpname: PCSTR, lphostname: PCSTR, lpcomputername: PCSTR, dwflags: UInt, pgpolist: Long): BOOL

public expect fun GetGPOListW(htoken: HANDLE, lpname: PCWSTR, lphostname: PCWSTR, lpcomputername: PCWSTR, dwflags: UInt, pgpolist: Long): BOOL

public expect fun GetLocalManagedApplicationData(productcode: PCWSTR, displayname: Long, supporturl: Long)

public expect fun GetLocalManagedApplications(buserapps: BOOL, pdwapps: Long, prglocalapps: Long): UInt

public expect fun GetManagedApplicationCategories(dwreserved: UInt, pappcategory: Long): UInt

public expect fun GetManagedApplications(pcategory: Long, dwqueryflags: UInt, dwinfolevel: UInt, pdwapps: Long, prgmanagedapps: Long): UInt

public expect fun ImportRSoPData(lpnamespace: PCWSTR, lpfilename: PCWSTR): HRESULT

public expect fun InstallApplication(pinstallinfo: Long): UInt

public expect fun LeaveCriticalPolicySection(hsection: HANDLE): BOOL

public expect fun ProcessGroupPolicyCompleted(extensionid: Long, pasynchandle: ULong, dwstatus: UInt): UInt

public expect fun ProcessGroupPolicyCompletedEx(extensionid: Long, pasynchandle: ULong, dwstatus: UInt, rsopstatus: HRESULT): UInt

public expect fun RefreshPolicy(bmachine: BOOL): BOOL

public expect fun RefreshPolicyEx(bmachine: BOOL, dwoptions: UInt): BOOL

public expect fun RegisterGPNotification(hevent: HANDLE, bmachine: BOOL): BOOL

public expect fun RsopAccessCheckByType(psecuritydescriptor: PSECURITY_DESCRIPTOR, pprincipalselfsid: PSID, prsoptoken: Long, dwdesiredaccessmask: UInt, pobjecttypelist: Long, objecttypelistlength: UInt, pgenericmapping: Long, pprivilegeset: Long, pdwprivilegesetlength: Long, pdwgrantedaccessmask: Long, pbaccessstatus: Long): HRESULT

public expect fun RsopFileAccessCheck(pszfilename: PCWSTR, prsoptoken: Long, dwdesiredaccessmask: UInt, pdwgrantedaccessmask: Long, pbaccessstatus: Long): HRESULT

public expect fun RsopResetPolicySettingStatus(dwflags: UInt, pservices: Long, psettinginstance: Long): HRESULT

public expect fun RsopSetPolicySettingStatus(dwflags: UInt, pservices: Long, psettinginstance: Long, ninfo: UInt, pstatus: Long): HRESULT

public expect fun UninstallApplication(productcode: PCWSTR, dwstatus: UInt): UInt

public expect fun UnregisterGPNotification(hevent: HANDLE): BOOL
