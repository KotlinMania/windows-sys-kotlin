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

public expect fun browseForGPO(lpbrowseinfo: MutPtr<Gpobrowseinfo>): Hresult

public expect fun commandLineFromMsiDescriptor(descriptor: Pcwstr, commandline: Pwstr, commandlinelength: MutPtr<UInt>): UInt

public expect fun createGPOLink(lpgpo: Pcwstr, lpcontainer: Pcwstr, fhighpriority: Bool): Hresult

public expect fun deleteAllGPOLinks(lpcontainer: Pcwstr): Hresult

public expect fun deleteGPOLink(lpgpo: Pcwstr, lpcontainer: Pcwstr): Hresult

public expect fun enterCriticalPolicySection(bmachine: Bool): Handle

public expect fun exportRSoPData(lpnamespace: Pcwstr, lpfilename: Pcwstr): Hresult

public expect fun freeGPOListA(pgpolist: ConstPtr<GroupPolicyObjecta>): Bool

public expect fun freeGPOListW(pgpolist: ConstPtr<GroupPolicyObjectw>): Bool

public expect fun generateGPNotification(bmachine: Bool, lpwszmgmtproduct: Pcwstr, dwmgmtproductoptions: UInt): UInt

public expect fun getAppliedGPOListA(dwflags: UInt, pmachinename: Pcstr, psiduser: Psid, pguidextension: ConstPtr<Guid>, ppgpolist: MutPtr<MutPtr<GroupPolicyObjecta>>): UInt

public expect fun getAppliedGPOListW(dwflags: UInt, pmachinename: Pcwstr, psiduser: Psid, pguidextension: ConstPtr<Guid>, ppgpolist: MutPtr<MutPtr<GroupPolicyObjectw>>): UInt

public expect fun getGPOListA(htoken: Handle, lpname: Pcstr, lphostname: Pcstr, lpcomputername: Pcstr, dwflags: UInt, pgpolist: MutPtr<MutPtr<GroupPolicyObjecta>>): Bool

public expect fun getGPOListW(htoken: Handle, lpname: Pcwstr, lphostname: Pcwstr, lpcomputername: Pcwstr, dwflags: UInt, pgpolist: MutPtr<MutPtr<GroupPolicyObjectw>>): Bool

public expect fun getLocalManagedApplicationData(productcode: Pcwstr, displayname: MutPtr<Pwstr>, supporturl: MutPtr<Pwstr>)

public expect fun getLocalManagedApplications(buserapps: Bool, pdwapps: MutPtr<UInt>, prglocalapps: MutPtr<MutPtr<Localmanagedapplication>>): UInt

public expect fun getManagedApplicationCategories(dwreserved: UInt, pappcategory: MutPtr<Appcategoryinfolist>): UInt

public expect fun getManagedApplications(pcategory: ConstPtr<Guid>, dwqueryflags: UInt, dwinfolevel: UInt, pdwapps: MutPtr<UInt>, prgmanagedapps: MutPtr<MutPtr<Managedapplication>>): UInt

public expect fun importRSoPData(lpnamespace: Pcwstr, lpfilename: Pcwstr): Hresult

public expect fun installApplication(pinstallinfo: ConstPtr<Installdata>): UInt

public expect fun leaveCriticalPolicySection(hsection: Handle): Bool

public expect fun processGroupPolicyCompleted(extensionid: ConstPtr<Guid>, pasynchandle: ULong, dwstatus: UInt): UInt

public expect fun processGroupPolicyCompletedEx(extensionid: ConstPtr<Guid>, pasynchandle: ULong, dwstatus: UInt, rsopstatus: Hresult): UInt

public expect fun refreshPolicy(bmachine: Bool): Bool

public expect fun refreshPolicyEx(bmachine: Bool, dwoptions: UInt): Bool

public expect fun registerGPNotification(hevent: Handle, bmachine: Bool): Bool

public expect fun rsopAccessCheckByType(psecuritydescriptor: PsecurityDescriptor, pprincipalselfsid: Psid, prsoptoken: ConstPtr<CVoid>, dwdesiredaccessmask: UInt, pobjecttypelist: ConstPtr<ObjectTypeList>, objecttypelistlength: UInt, pgenericmapping: ConstPtr<GenericMapping>, pprivilegeset: ConstPtr<PrivilegeSet>, pdwprivilegesetlength: ConstPtr<UInt>, pdwgrantedaccessmask: MutPtr<UInt>, pbaccessstatus: MutPtr<Bool>): Hresult

public expect fun rsopFileAccessCheck(pszfilename: Pcwstr, prsoptoken: ConstPtr<CVoid>, dwdesiredaccessmask: UInt, pdwgrantedaccessmask: MutPtr<UInt>, pbaccessstatus: MutPtr<Bool>): Hresult

public expect fun rsopResetPolicySettingStatus(dwflags: UInt, pservices: MutPtr<CVoid>, psettinginstance: MutPtr<CVoid>): Hresult

public expect fun rsopSetPolicySettingStatus(dwflags: UInt, pservices: MutPtr<CVoid>, psettinginstance: MutPtr<CVoid>, ninfo: UInt, pstatus: ConstPtr<Policysettingstatusinfo>): Hresult

public expect fun uninstallApplication(productcode: Pcwstr, dwstatus: UInt): UInt

public expect fun unregisterGPNotification(hevent: Handle): Bool
