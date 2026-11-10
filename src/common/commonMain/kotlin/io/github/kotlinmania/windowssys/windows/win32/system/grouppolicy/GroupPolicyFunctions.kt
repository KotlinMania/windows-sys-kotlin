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

public expect fun browseForGPO(lpbrowseinfo: COpaquePointer?): Hresult

public expect fun commandLineFromMsiDescriptor(descriptor: Pcwstr, commandline: Pwstr, commandlinelength: COpaquePointer?): UInt

public expect fun createGPOLink(lpgpo: Pcwstr, lpcontainer: Pcwstr, fhighpriority: Bool): Hresult

public expect fun deleteAllGPOLinks(lpcontainer: Pcwstr): Hresult

public expect fun deleteGPOLink(lpgpo: Pcwstr, lpcontainer: Pcwstr): Hresult

public expect fun enterCriticalPolicySection(bmachine: Bool): Handle

public expect fun exportRSoPData(lpnamespace: Pcwstr, lpfilename: Pcwstr): Hresult

public expect fun freeGPOListA(pgpolist: COpaquePointer?): Bool

public expect fun freeGPOListW(pgpolist: COpaquePointer?): Bool

public expect fun generateGPNotification(bmachine: Bool, lpwszmgmtproduct: Pcwstr, dwmgmtproductoptions: UInt): UInt

public expect fun getAppliedGPOListA(dwflags: UInt, pmachinename: Pcstr, psiduser: Psid, pguidextension: COpaquePointer?, ppgpolist: COpaquePointer?): UInt

public expect fun getAppliedGPOListW(dwflags: UInt, pmachinename: Pcwstr, psiduser: Psid, pguidextension: COpaquePointer?, ppgpolist: COpaquePointer?): UInt

public expect fun getGPOListA(htoken: Handle, lpname: Pcstr, lphostname: Pcstr, lpcomputername: Pcstr, dwflags: UInt, pgpolist: COpaquePointer?): Bool

public expect fun getGPOListW(htoken: Handle, lpname: Pcwstr, lphostname: Pcwstr, lpcomputername: Pcwstr, dwflags: UInt, pgpolist: COpaquePointer?): Bool

public expect fun getLocalManagedApplicationData(productcode: Pcwstr, displayname: COpaquePointer?, supporturl: COpaquePointer?)

public expect fun getLocalManagedApplications(buserapps: Bool, pdwapps: COpaquePointer?, prglocalapps: COpaquePointer?): UInt

public expect fun getManagedApplicationCategories(dwreserved: UInt, pappcategory: COpaquePointer?): UInt

public expect fun getManagedApplications(pcategory: COpaquePointer?, dwqueryflags: UInt, dwinfolevel: UInt, pdwapps: COpaquePointer?, prgmanagedapps: COpaquePointer?): UInt

public expect fun importRSoPData(lpnamespace: Pcwstr, lpfilename: Pcwstr): Hresult

public expect fun installApplication(pinstallinfo: COpaquePointer?): UInt

public expect fun leaveCriticalPolicySection(hsection: Handle): Bool

public expect fun processGroupPolicyCompleted(extensionid: COpaquePointer?, pasynchandle: ULong, dwstatus: UInt): UInt

public expect fun processGroupPolicyCompletedEx(extensionid: COpaquePointer?, pasynchandle: ULong, dwstatus: UInt, rsopstatus: Hresult): UInt

public expect fun refreshPolicy(bmachine: Bool): Bool

public expect fun refreshPolicyEx(bmachine: Bool, dwoptions: UInt): Bool

public expect fun registerGPNotification(hevent: Handle, bmachine: Bool): Bool

public expect fun rsopAccessCheckByType(psecuritydescriptor: PsecurityDescriptor, pprincipalselfsid: Psid, prsoptoken: COpaquePointer?, dwdesiredaccessmask: UInt, pobjecttypelist: COpaquePointer?, objecttypelistlength: UInt, pgenericmapping: COpaquePointer?, pprivilegeset: COpaquePointer?, pdwprivilegesetlength: COpaquePointer?, pdwgrantedaccessmask: COpaquePointer?, pbaccessstatus: COpaquePointer?): Hresult

public expect fun rsopFileAccessCheck(pszfilename: Pcwstr, prsoptoken: COpaquePointer?, dwdesiredaccessmask: UInt, pdwgrantedaccessmask: COpaquePointer?, pbaccessstatus: COpaquePointer?): Hresult

public expect fun rsopResetPolicySettingStatus(dwflags: UInt, pservices: COpaquePointer?, psettinginstance: COpaquePointer?): Hresult

public expect fun rsopSetPolicySettingStatus(dwflags: UInt, pservices: COpaquePointer?, psettinginstance: COpaquePointer?, ninfo: UInt, pstatus: COpaquePointer?): Hresult

public expect fun uninstallApplication(productcode: Pcwstr, dwstatus: UInt): UInt

public expect fun unregisterGPNotification(hevent: Handle): Bool
