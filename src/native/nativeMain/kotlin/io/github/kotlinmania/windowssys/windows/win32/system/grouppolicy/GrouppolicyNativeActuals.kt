@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun browseForGPO(lpbrowseinfo: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssys_windows_win32_system_grouppolicy_browseForGPO(lpbrowseinfo?.value?.toCPointer<ByteVar>())

public actual fun commandLineFromMsiDescriptor(descriptor: Pcwstr, commandline: Pwstr, commandlinelength: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssys_windows_win32_system_grouppolicy_commandLineFromMsiDescriptor(descriptor?.value?.toCPointer<ByteVar>(), commandline?.value?.toCPointer<ByteVar>(), commandlinelength?.value?.toCPointer<ByteVar>())

public actual fun createGPOLink(lpgpo: Pcwstr, lpcontainer: Pcwstr, fhighpriority: Bool): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssys_windows_win32_system_grouppolicy_createGPOLink(lpgpo?.value?.toCPointer<ByteVar>(), lpcontainer?.value?.toCPointer<ByteVar>(), fhighpriority)

public actual fun deleteAllGPOLinks(lpcontainer: Pcwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssys_windows_win32_system_grouppolicy_deleteAllGPOLinks(lpcontainer?.value?.toCPointer<ByteVar>())

public actual fun deleteGPOLink(lpgpo: Pcwstr, lpcontainer: Pcwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssys_windows_win32_system_grouppolicy_deleteGPOLink(lpgpo?.value?.toCPointer<ByteVar>(), lpcontainer?.value?.toCPointer<ByteVar>())

public actual fun enterCriticalPolicySection(bmachine: Bool): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssys_windows_win32_system_grouppolicy_enterCriticalPolicySection(bmachine)?.let { COpaquePointer(it.toLong()) }

public actual fun exportRSoPData(lpnamespace: Pcwstr, lpfilename: Pcwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssys_windows_win32_system_grouppolicy_exportRSoPData(lpnamespace?.value?.toCPointer<ByteVar>(), lpfilename?.value?.toCPointer<ByteVar>())

public actual fun freeGPOListA(pgpolist: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssys_windows_win32_system_grouppolicy_freeGPOListA(pgpolist?.value?.toCPointer<ByteVar>())

public actual fun freeGPOListW(pgpolist: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssys_windows_win32_system_grouppolicy_freeGPOListW(pgpolist?.value?.toCPointer<ByteVar>())

public actual fun generateGPNotification(bmachine: Bool, lpwszmgmtproduct: Pcwstr, dwmgmtproductoptions: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssys_windows_win32_system_grouppolicy_generateGPNotification(bmachine, lpwszmgmtproduct?.value?.toCPointer<ByteVar>(), dwmgmtproductoptions)

public actual fun getAppliedGPOListA(dwflags: UInt, pmachinename: Pcstr, psiduser: Psid, pguidextension: COpaquePointer?, ppgpolist: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssys_windows_win32_system_grouppolicy_getAppliedGPOListA(dwflags, pmachinename?.value?.toCPointer<ByteVar>(), psiduser?.value?.toCPointer<ByteVar>(), pguidextension?.value?.toCPointer<ByteVar>(), ppgpolist?.value?.toCPointer<ByteVar>())

public actual fun getAppliedGPOListW(dwflags: UInt, pmachinename: Pcwstr, psiduser: Psid, pguidextension: COpaquePointer?, ppgpolist: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssys_windows_win32_system_grouppolicy_getAppliedGPOListW(dwflags, pmachinename?.value?.toCPointer<ByteVar>(), psiduser?.value?.toCPointer<ByteVar>(), pguidextension?.value?.toCPointer<ByteVar>(), ppgpolist?.value?.toCPointer<ByteVar>())

public actual fun getGPOListA(htoken: Handle, lpname: Pcstr, lphostname: Pcstr, lpcomputername: Pcstr, dwflags: UInt, pgpolist: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssys_windows_win32_system_grouppolicy_getGPOListA(htoken?.value?.toCPointer<ByteVar>(), lpname?.value?.toCPointer<ByteVar>(), lphostname?.value?.toCPointer<ByteVar>(), lpcomputername?.value?.toCPointer<ByteVar>(), dwflags, pgpolist?.value?.toCPointer<ByteVar>())

public actual fun getGPOListW(htoken: Handle, lpname: Pcwstr, lphostname: Pcwstr, lpcomputername: Pcwstr, dwflags: UInt, pgpolist: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssys_windows_win32_system_grouppolicy_getGPOListW(htoken?.value?.toCPointer<ByteVar>(), lpname?.value?.toCPointer<ByteVar>(), lphostname?.value?.toCPointer<ByteVar>(), lpcomputername?.value?.toCPointer<ByteVar>(), dwflags, pgpolist?.value?.toCPointer<ByteVar>())

public actual fun getLocalManagedApplicationData(productcode: Pcwstr, displayname: COpaquePointer?, supporturl: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssys_windows_win32_system_grouppolicy_getLocalManagedApplicationData(productcode?.value?.toCPointer<ByteVar>(), displayname?.value?.toCPointer<ByteVar>(), supporturl?.value?.toCPointer<ByteVar>())
}

public actual fun getLocalManagedApplications(buserapps: Bool, pdwapps: COpaquePointer?, prglocalapps: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssys_windows_win32_system_grouppolicy_getLocalManagedApplications(buserapps, pdwapps?.value?.toCPointer<ByteVar>(), prglocalapps?.value?.toCPointer<ByteVar>())

public actual fun getManagedApplicationCategories(dwreserved: UInt, pappcategory: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssys_windows_win32_system_grouppolicy_getManagedApplicationCategories(dwreserved, pappcategory?.value?.toCPointer<ByteVar>())

public actual fun getManagedApplications(pcategory: COpaquePointer?, dwqueryflags: UInt, dwinfolevel: UInt, pdwapps: COpaquePointer?, prgmanagedapps: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssys_windows_win32_system_grouppolicy_getManagedApplications(pcategory?.value?.toCPointer<ByteVar>(), dwqueryflags, dwinfolevel, pdwapps?.value?.toCPointer<ByteVar>(), prgmanagedapps?.value?.toCPointer<ByteVar>())

public actual fun importRSoPData(lpnamespace: Pcwstr, lpfilename: Pcwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssys_windows_win32_system_grouppolicy_importRSoPData(lpnamespace?.value?.toCPointer<ByteVar>(), lpfilename?.value?.toCPointer<ByteVar>())

public actual fun installApplication(pinstallinfo: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssys_windows_win32_system_grouppolicy_installApplication(pinstallinfo?.value?.toCPointer<ByteVar>())

public actual fun leaveCriticalPolicySection(hsection: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssys_windows_win32_system_grouppolicy_leaveCriticalPolicySection(hsection?.value?.toCPointer<ByteVar>())

public actual fun processGroupPolicyCompleted(extensionid: COpaquePointer?, pasynchandle: ULong, dwstatus: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssys_windows_win32_system_grouppolicy_processGroupPolicyCompleted(extensionid?.value?.toCPointer<ByteVar>(), pasynchandle, dwstatus)

public actual fun processGroupPolicyCompletedEx(extensionid: COpaquePointer?, pasynchandle: ULong, dwstatus: UInt, rsopstatus: Hresult): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssys_windows_win32_system_grouppolicy_processGroupPolicyCompletedEx(extensionid?.value?.toCPointer<ByteVar>(), pasynchandle, dwstatus, rsopstatus)

public actual fun refreshPolicy(bmachine: Bool): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssys_windows_win32_system_grouppolicy_refreshPolicy(bmachine)

public actual fun refreshPolicyEx(bmachine: Bool, dwoptions: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssys_windows_win32_system_grouppolicy_refreshPolicyEx(bmachine, dwoptions)

public actual fun registerGPNotification(hevent: Handle, bmachine: Bool): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssys_windows_win32_system_grouppolicy_registerGPNotification(hevent?.value?.toCPointer<ByteVar>(), bmachine)

public actual fun rsopAccessCheckByType(psecuritydescriptor: PsecurityDescriptor, pprincipalselfsid: Psid, prsoptoken: COpaquePointer?, dwdesiredaccessmask: UInt, pobjecttypelist: COpaquePointer?, objecttypelistlength: UInt, pgenericmapping: COpaquePointer?, pprivilegeset: COpaquePointer?, pdwprivilegesetlength: COpaquePointer?, pdwgrantedaccessmask: COpaquePointer?, pbaccessstatus: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssys_windows_win32_system_grouppolicy_rsopAccessCheckByType(psecuritydescriptor?.value?.toCPointer<ByteVar>(), pprincipalselfsid?.value?.toCPointer<ByteVar>(), prsoptoken?.value?.toCPointer<ByteVar>(), dwdesiredaccessmask, pobjecttypelist?.value?.toCPointer<ByteVar>(), objecttypelistlength, pgenericmapping?.value?.toCPointer<ByteVar>(), pprivilegeset?.value?.toCPointer<ByteVar>(), pdwprivilegesetlength?.value?.toCPointer<ByteVar>(), pdwgrantedaccessmask?.value?.toCPointer<ByteVar>(), pbaccessstatus?.value?.toCPointer<ByteVar>())

public actual fun rsopFileAccessCheck(pszfilename: Pcwstr, prsoptoken: COpaquePointer?, dwdesiredaccessmask: UInt, pdwgrantedaccessmask: COpaquePointer?, pbaccessstatus: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssys_windows_win32_system_grouppolicy_rsopFileAccessCheck(pszfilename?.value?.toCPointer<ByteVar>(), prsoptoken?.value?.toCPointer<ByteVar>(), dwdesiredaccessmask, pdwgrantedaccessmask?.value?.toCPointer<ByteVar>(), pbaccessstatus?.value?.toCPointer<ByteVar>())

public actual fun rsopResetPolicySettingStatus(dwflags: UInt, pservices: COpaquePointer?, psettinginstance: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssys_windows_win32_system_grouppolicy_rsopResetPolicySettingStatus(dwflags, pservices?.value?.toCPointer<ByteVar>(), psettinginstance?.value?.toCPointer<ByteVar>())

public actual fun rsopSetPolicySettingStatus(dwflags: UInt, pservices: COpaquePointer?, psettinginstance: COpaquePointer?, ninfo: UInt, pstatus: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssys_windows_win32_system_grouppolicy_rsopSetPolicySettingStatus(dwflags, pservices?.value?.toCPointer<ByteVar>(), psettinginstance?.value?.toCPointer<ByteVar>(), ninfo, pstatus?.value?.toCPointer<ByteVar>())

public actual fun uninstallApplication(productcode: Pcwstr, dwstatus: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssys_windows_win32_system_grouppolicy_uninstallApplication(productcode?.value?.toCPointer<ByteVar>(), dwstatus)

public actual fun unregisterGPNotification(hevent: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssys_windows_win32_system_grouppolicy_unregisterGPNotification(hevent?.value?.toCPointer<ByteVar>())
