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

public actual fun BrowseForGPO(lpbrowseinfo: Long): HRESULT =
    0

public actual fun CommandLineFromMsiDescriptor(descriptor: PCWSTR, commandline: PWSTR, commandlinelength: Long): UInt =
    0u

public actual fun CreateGPOLink(lpgpo: PCWSTR, lpcontainer: PCWSTR, fhighpriority: BOOL): HRESULT =
    0

public actual fun DeleteAllGPOLinks(lpcontainer: PCWSTR): HRESULT =
    0

public actual fun DeleteGPOLink(lpgpo: PCWSTR, lpcontainer: PCWSTR): HRESULT =
    0

public actual fun EnterCriticalPolicySection(bmachine: BOOL): HANDLE =
    0L

public actual fun ExportRSoPData(lpnamespace: PCWSTR, lpfilename: PCWSTR): HRESULT =
    0

public actual fun FreeGPOListA(pgpolist: Long): BOOL =
    0

public actual fun FreeGPOListW(pgpolist: Long): BOOL =
    0

public actual fun GenerateGPNotification(bmachine: BOOL, lpwszmgmtproduct: PCWSTR, dwmgmtproductoptions: UInt): UInt =
    0u

public actual fun GetAppliedGPOListA(dwflags: UInt, pmachinename: PCSTR, psiduser: PSID, pguidextension: Long, ppgpolist: Long): UInt =
    0u

public actual fun GetAppliedGPOListW(dwflags: UInt, pmachinename: PCWSTR, psiduser: PSID, pguidextension: Long, ppgpolist: Long): UInt =
    0u

public actual fun GetGPOListA(htoken: HANDLE, lpname: PCSTR, lphostname: PCSTR, lpcomputername: PCSTR, dwflags: UInt, pgpolist: Long): BOOL =
    0

public actual fun GetGPOListW(htoken: HANDLE, lpname: PCWSTR, lphostname: PCWSTR, lpcomputername: PCWSTR, dwflags: UInt, pgpolist: Long): BOOL =
    0

public actual fun GetLocalManagedApplicationData(productcode: PCWSTR, displayname: Long, supporturl: Long) {
}

public actual fun GetLocalManagedApplications(buserapps: BOOL, pdwapps: Long, prglocalapps: Long): UInt =
    0u

public actual fun GetManagedApplicationCategories(dwreserved: UInt, pappcategory: Long): UInt =
    0u

public actual fun GetManagedApplications(pcategory: Long, dwqueryflags: UInt, dwinfolevel: UInt, pdwapps: Long, prgmanagedapps: Long): UInt =
    0u

public actual fun ImportRSoPData(lpnamespace: PCWSTR, lpfilename: PCWSTR): HRESULT =
    0

public actual fun InstallApplication(pinstallinfo: Long): UInt =
    0u

public actual fun LeaveCriticalPolicySection(hsection: HANDLE): BOOL =
    0

public actual fun ProcessGroupPolicyCompleted(extensionid: Long, pasynchandle: ULong, dwstatus: UInt): UInt =
    0u

public actual fun ProcessGroupPolicyCompletedEx(extensionid: Long, pasynchandle: ULong, dwstatus: UInt, rsopstatus: HRESULT): UInt =
    0u

public actual fun RefreshPolicy(bmachine: BOOL): BOOL =
    0

public actual fun RefreshPolicyEx(bmachine: BOOL, dwoptions: UInt): BOOL =
    0

public actual fun RegisterGPNotification(hevent: HANDLE, bmachine: BOOL): BOOL =
    0

public actual fun RsopAccessCheckByType(psecuritydescriptor: PSECURITY_DESCRIPTOR, pprincipalselfsid: PSID, prsoptoken: Long, dwdesiredaccessmask: UInt, pobjecttypelist: Long, objecttypelistlength: UInt, pgenericmapping: Long, pprivilegeset: Long, pdwprivilegesetlength: Long, pdwgrantedaccessmask: Long, pbaccessstatus: Long): HRESULT =
    0

public actual fun RsopFileAccessCheck(pszfilename: PCWSTR, prsoptoken: Long, dwdesiredaccessmask: UInt, pdwgrantedaccessmask: Long, pbaccessstatus: Long): HRESULT =
    0

public actual fun RsopResetPolicySettingStatus(dwflags: UInt, pservices: Long, psettinginstance: Long): HRESULT =
    0

public actual fun RsopSetPolicySettingStatus(dwflags: UInt, pservices: Long, psettinginstance: Long, ninfo: UInt, pstatus: Long): HRESULT =
    0

public actual fun UninstallApplication(productcode: PCWSTR, dwstatus: UInt): UInt =
    0u

public actual fun UnregisterGPNotification(hevent: HANDLE): BOOL =
    0
