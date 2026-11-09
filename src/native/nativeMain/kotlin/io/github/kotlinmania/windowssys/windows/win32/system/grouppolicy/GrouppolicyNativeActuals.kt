@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR
import io.github.kotlinmania.windowssys.windows.win32.security.PSID
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun BrowseForGPO(lpbrowseinfo: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssys_windows_win32_system_grouppolicy_BrowseForGPO(lpbrowseinfo.toCPointer<ByteVar>())

public actual fun CommandLineFromMsiDescriptor(descriptor: PCWSTR, commandline: PWSTR, commandlinelength: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssys_windows_win32_system_grouppolicy_CommandLineFromMsiDescriptor(descriptor.toCPointer<ByteVar>(), commandline.toCPointer<ByteVar>(), commandlinelength.toCPointer<ByteVar>())

public actual fun CreateGPOLink(lpgpo: PCWSTR, lpcontainer: PCWSTR, fhighpriority: BOOL): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssys_windows_win32_system_grouppolicy_CreateGPOLink(lpgpo.toCPointer<ByteVar>(), lpcontainer.toCPointer<ByteVar>(), fhighpriority)

public actual fun DeleteAllGPOLinks(lpcontainer: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssys_windows_win32_system_grouppolicy_DeleteAllGPOLinks(lpcontainer.toCPointer<ByteVar>())

public actual fun DeleteGPOLink(lpgpo: PCWSTR, lpcontainer: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssys_windows_win32_system_grouppolicy_DeleteGPOLink(lpgpo.toCPointer<ByteVar>(), lpcontainer.toCPointer<ByteVar>())

public actual fun EnterCriticalPolicySection(bmachine: BOOL): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssys_windows_win32_system_grouppolicy_EnterCriticalPolicySection(bmachine)?.toLong() ?: 0L

public actual fun ExportRSoPData(lpnamespace: PCWSTR, lpfilename: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssys_windows_win32_system_grouppolicy_ExportRSoPData(lpnamespace.toCPointer<ByteVar>(), lpfilename.toCPointer<ByteVar>())

public actual fun FreeGPOListA(pgpolist: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssys_windows_win32_system_grouppolicy_FreeGPOListA(pgpolist.toCPointer<ByteVar>())

public actual fun FreeGPOListW(pgpolist: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssys_windows_win32_system_grouppolicy_FreeGPOListW(pgpolist.toCPointer<ByteVar>())

public actual fun GenerateGPNotification(bmachine: BOOL, lpwszmgmtproduct: PCWSTR, dwmgmtproductoptions: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssys_windows_win32_system_grouppolicy_GenerateGPNotification(bmachine, lpwszmgmtproduct.toCPointer<ByteVar>(), dwmgmtproductoptions)

public actual fun GetAppliedGPOListA(dwflags: UInt, pmachinename: PCSTR, psiduser: PSID, pguidextension: Long, ppgpolist: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssys_windows_win32_system_grouppolicy_GetAppliedGPOListA(dwflags, pmachinename.toCPointer<ByteVar>(), psiduser.toCPointer<ByteVar>(), pguidextension.toCPointer<ByteVar>(), ppgpolist.toCPointer<ByteVar>())

public actual fun GetAppliedGPOListW(dwflags: UInt, pmachinename: PCWSTR, psiduser: PSID, pguidextension: Long, ppgpolist: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssys_windows_win32_system_grouppolicy_GetAppliedGPOListW(dwflags, pmachinename.toCPointer<ByteVar>(), psiduser.toCPointer<ByteVar>(), pguidextension.toCPointer<ByteVar>(), ppgpolist.toCPointer<ByteVar>())

public actual fun GetGPOListA(htoken: HANDLE, lpname: PCSTR, lphostname: PCSTR, lpcomputername: PCSTR, dwflags: UInt, pgpolist: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssys_windows_win32_system_grouppolicy_GetGPOListA(htoken.toCPointer<ByteVar>(), lpname.toCPointer<ByteVar>(), lphostname.toCPointer<ByteVar>(), lpcomputername.toCPointer<ByteVar>(), dwflags, pgpolist.toCPointer<ByteVar>())

public actual fun GetGPOListW(htoken: HANDLE, lpname: PCWSTR, lphostname: PCWSTR, lpcomputername: PCWSTR, dwflags: UInt, pgpolist: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssys_windows_win32_system_grouppolicy_GetGPOListW(htoken.toCPointer<ByteVar>(), lpname.toCPointer<ByteVar>(), lphostname.toCPointer<ByteVar>(), lpcomputername.toCPointer<ByteVar>(), dwflags, pgpolist.toCPointer<ByteVar>())

public actual fun GetLocalManagedApplicationData(productcode: PCWSTR, displayname: Long, supporturl: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssys_windows_win32_system_grouppolicy_GetLocalManagedApplicationData(productcode.toCPointer<ByteVar>(), displayname.toCPointer<ByteVar>(), supporturl.toCPointer<ByteVar>())
}

public actual fun GetLocalManagedApplications(buserapps: BOOL, pdwapps: Long, prglocalapps: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssys_windows_win32_system_grouppolicy_GetLocalManagedApplications(buserapps, pdwapps.toCPointer<ByteVar>(), prglocalapps.toCPointer<ByteVar>())

public actual fun GetManagedApplicationCategories(dwreserved: UInt, pappcategory: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssys_windows_win32_system_grouppolicy_GetManagedApplicationCategories(dwreserved, pappcategory.toCPointer<ByteVar>())

public actual fun GetManagedApplications(pcategory: Long, dwqueryflags: UInt, dwinfolevel: UInt, pdwapps: Long, prgmanagedapps: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssys_windows_win32_system_grouppolicy_GetManagedApplications(pcategory.toCPointer<ByteVar>(), dwqueryflags, dwinfolevel, pdwapps.toCPointer<ByteVar>(), prgmanagedapps.toCPointer<ByteVar>())

public actual fun ImportRSoPData(lpnamespace: PCWSTR, lpfilename: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssys_windows_win32_system_grouppolicy_ImportRSoPData(lpnamespace.toCPointer<ByteVar>(), lpfilename.toCPointer<ByteVar>())

public actual fun InstallApplication(pinstallinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssys_windows_win32_system_grouppolicy_InstallApplication(pinstallinfo.toCPointer<ByteVar>())

public actual fun LeaveCriticalPolicySection(hsection: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssys_windows_win32_system_grouppolicy_LeaveCriticalPolicySection(hsection.toCPointer<ByteVar>())

public actual fun ProcessGroupPolicyCompleted(extensionid: Long, pasynchandle: ULong, dwstatus: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssys_windows_win32_system_grouppolicy_ProcessGroupPolicyCompleted(extensionid.toCPointer<ByteVar>(), pasynchandle, dwstatus)

public actual fun ProcessGroupPolicyCompletedEx(extensionid: Long, pasynchandle: ULong, dwstatus: UInt, rsopstatus: HRESULT): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssys_windows_win32_system_grouppolicy_ProcessGroupPolicyCompletedEx(extensionid.toCPointer<ByteVar>(), pasynchandle, dwstatus, rsopstatus)

public actual fun RefreshPolicy(bmachine: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssys_windows_win32_system_grouppolicy_RefreshPolicy(bmachine)

public actual fun RefreshPolicyEx(bmachine: BOOL, dwoptions: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssys_windows_win32_system_grouppolicy_RefreshPolicyEx(bmachine, dwoptions)

public actual fun RegisterGPNotification(hevent: HANDLE, bmachine: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssys_windows_win32_system_grouppolicy_RegisterGPNotification(hevent.toCPointer<ByteVar>(), bmachine)

public actual fun RsopAccessCheckByType(psecuritydescriptor: PSECURITY_DESCRIPTOR, pprincipalselfsid: PSID, prsoptoken: Long, dwdesiredaccessmask: UInt, pobjecttypelist: Long, objecttypelistlength: UInt, pgenericmapping: Long, pprivilegeset: Long, pdwprivilegesetlength: Long, pdwgrantedaccessmask: Long, pbaccessstatus: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssys_windows_win32_system_grouppolicy_RsopAccessCheckByType(psecuritydescriptor.toCPointer<ByteVar>(), pprincipalselfsid.toCPointer<ByteVar>(), prsoptoken.toCPointer<ByteVar>(), dwdesiredaccessmask, pobjecttypelist.toCPointer<ByteVar>(), objecttypelistlength, pgenericmapping.toCPointer<ByteVar>(), pprivilegeset.toCPointer<ByteVar>(), pdwprivilegesetlength.toCPointer<ByteVar>(), pdwgrantedaccessmask.toCPointer<ByteVar>(), pbaccessstatus.toCPointer<ByteVar>())

public actual fun RsopFileAccessCheck(pszfilename: PCWSTR, prsoptoken: Long, dwdesiredaccessmask: UInt, pdwgrantedaccessmask: Long, pbaccessstatus: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssys_windows_win32_system_grouppolicy_RsopFileAccessCheck(pszfilename.toCPointer<ByteVar>(), prsoptoken.toCPointer<ByteVar>(), dwdesiredaccessmask, pdwgrantedaccessmask.toCPointer<ByteVar>(), pbaccessstatus.toCPointer<ByteVar>())

public actual fun RsopResetPolicySettingStatus(dwflags: UInt, pservices: Long, psettinginstance: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssys_windows_win32_system_grouppolicy_RsopResetPolicySettingStatus(dwflags, pservices.toCPointer<ByteVar>(), psettinginstance.toCPointer<ByteVar>())

public actual fun RsopSetPolicySettingStatus(dwflags: UInt, pservices: Long, psettinginstance: Long, ninfo: UInt, pstatus: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssys_windows_win32_system_grouppolicy_RsopSetPolicySettingStatus(dwflags, pservices.toCPointer<ByteVar>(), psettinginstance.toCPointer<ByteVar>(), ninfo, pstatus.toCPointer<ByteVar>())

public actual fun UninstallApplication(productcode: PCWSTR, dwstatus: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssys_windows_win32_system_grouppolicy_UninstallApplication(productcode.toCPointer<ByteVar>(), dwstatus)

public actual fun UnregisterGPNotification(hevent: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssys_windows_win32_system_grouppolicy_UnregisterGPNotification(hevent.toCPointer<ByteVar>())
