@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssysWindowsWin32SystemGrouppolicyBrowseForGPO
import io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssysWindowsWin32SystemGrouppolicyCommandLineFromMsiDescriptor
import io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssysWindowsWin32SystemGrouppolicyCreateGPOLink
import io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssysWindowsWin32SystemGrouppolicyDeleteAllGPOLinks
import io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssysWindowsWin32SystemGrouppolicyDeleteGPOLink
import io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssysWindowsWin32SystemGrouppolicyEnterCriticalPolicySection
import io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssysWindowsWin32SystemGrouppolicyExportRSoPData
import io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssysWindowsWin32SystemGrouppolicyFreeGPOListA
import io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssysWindowsWin32SystemGrouppolicyFreeGPOListW
import io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssysWindowsWin32SystemGrouppolicyGenerateGPNotification
import io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssysWindowsWin32SystemGrouppolicyGetAppliedGPOListA
import io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssysWindowsWin32SystemGrouppolicyGetAppliedGPOListW
import io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssysWindowsWin32SystemGrouppolicyGetGPOListA
import io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssysWindowsWin32SystemGrouppolicyGetGPOListW
import io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssysWindowsWin32SystemGrouppolicyGetLocalManagedApplicationData
import io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssysWindowsWin32SystemGrouppolicyGetLocalManagedApplications
import io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssysWindowsWin32SystemGrouppolicyGetManagedApplicationCategories
import io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssysWindowsWin32SystemGrouppolicyGetManagedApplications
import io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssysWindowsWin32SystemGrouppolicyImportRSoPData
import io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssysWindowsWin32SystemGrouppolicyInstallApplication
import io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssysWindowsWin32SystemGrouppolicyLeaveCriticalPolicySection
import io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssysWindowsWin32SystemGrouppolicyProcessGroupPolicyCompleted
import io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssysWindowsWin32SystemGrouppolicyProcessGroupPolicyCompletedEx
import io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssysWindowsWin32SystemGrouppolicyRefreshPolicy
import io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssysWindowsWin32SystemGrouppolicyRefreshPolicyEx
import io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssysWindowsWin32SystemGrouppolicyRegisterGPNotification
import io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssysWindowsWin32SystemGrouppolicyRsopAccessCheckByType
import io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssysWindowsWin32SystemGrouppolicyRsopFileAccessCheck
import io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssysWindowsWin32SystemGrouppolicyRsopResetPolicySettingStatus
import io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssysWindowsWin32SystemGrouppolicyRsopSetPolicySettingStatus
import io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssysWindowsWin32SystemGrouppolicyUninstallApplication
import io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy.cinterop.windowssysWindowsWin32SystemGrouppolicyUnregisterGPNotification
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun browseForGPO(lpbrowseinfo: MutPtr): Hresult =
    windowssysWindowsWin32SystemGrouppolicyBrowseForGPO(lpbrowseinfo.rawAddress.toCPointer<ByteVar>())

public actual fun commandLineFromMsiDescriptor(descriptor: Pcwstr, commandline: Pwstr, commandlinelength: MutPtr): UInt =
    windowssysWindowsWin32SystemGrouppolicyCommandLineFromMsiDescriptor(descriptor.rawAddress.toCPointer<ByteVar>(), commandline.rawAddress.toCPointer<ByteVar>(), commandlinelength.rawAddress.toCPointer<ByteVar>())

public actual fun createGPOLink(lpgpo: Pcwstr, lpcontainer: Pcwstr, fhighpriority: Bool): Hresult =
    windowssysWindowsWin32SystemGrouppolicyCreateGPOLink(lpgpo.rawAddress.toCPointer<ByteVar>(), lpcontainer.rawAddress.toCPointer<ByteVar>(), fhighpriority)

public actual fun deleteAllGPOLinks(lpcontainer: Pcwstr): Hresult =
    windowssysWindowsWin32SystemGrouppolicyDeleteAllGPOLinks(lpcontainer.rawAddress.toCPointer<ByteVar>())

public actual fun deleteGPOLink(lpgpo: Pcwstr, lpcontainer: Pcwstr): Hresult =
    windowssysWindowsWin32SystemGrouppolicyDeleteGPOLink(lpgpo.rawAddress.toCPointer<ByteVar>(), lpcontainer.rawAddress.toCPointer<ByteVar>())

public actual fun enterCriticalPolicySection(bmachine: Bool): Handle =
    MutPtr(windowssysWindowsWin32SystemGrouppolicyEnterCriticalPolicySection(bmachine)?.toLong() ?: 0L)

public actual fun exportRSoPData(lpnamespace: Pcwstr, lpfilename: Pcwstr): Hresult =
    windowssysWindowsWin32SystemGrouppolicyExportRSoPData(lpnamespace.rawAddress.toCPointer<ByteVar>(), lpfilename.rawAddress.toCPointer<ByteVar>())

public actual fun freeGPOListA(pgpolist: ConstPtr): Bool =
    windowssysWindowsWin32SystemGrouppolicyFreeGPOListA(pgpolist.rawAddress.toCPointer<ByteVar>())

public actual fun freeGPOListW(pgpolist: ConstPtr): Bool =
    windowssysWindowsWin32SystemGrouppolicyFreeGPOListW(pgpolist.rawAddress.toCPointer<ByteVar>())

public actual fun generateGPNotification(bmachine: Bool, lpwszmgmtproduct: Pcwstr, dwmgmtproductoptions: UInt): UInt =
    windowssysWindowsWin32SystemGrouppolicyGenerateGPNotification(bmachine, lpwszmgmtproduct.rawAddress.toCPointer<ByteVar>(), dwmgmtproductoptions)

public actual fun getAppliedGPOListA(dwflags: UInt, pmachinename: Pcstr, psiduser: Psid, pguidextension: ConstPtr, ppgpolist: MutPtr): UInt =
    windowssysWindowsWin32SystemGrouppolicyGetAppliedGPOListA(dwflags, pmachinename.rawAddress.toCPointer<ByteVar>(), psiduser.rawAddress.toCPointer<ByteVar>(), pguidextension.rawAddress.toCPointer<ByteVar>(), ppgpolist.rawAddress.toCPointer<ByteVar>())

public actual fun getAppliedGPOListW(dwflags: UInt, pmachinename: Pcwstr, psiduser: Psid, pguidextension: ConstPtr, ppgpolist: MutPtr): UInt =
    windowssysWindowsWin32SystemGrouppolicyGetAppliedGPOListW(dwflags, pmachinename.rawAddress.toCPointer<ByteVar>(), psiduser.rawAddress.toCPointer<ByteVar>(), pguidextension.rawAddress.toCPointer<ByteVar>(), ppgpolist.rawAddress.toCPointer<ByteVar>())

public actual fun getGPOListA(htoken: Handle, lpname: Pcstr, lphostname: Pcstr, lpcomputername: Pcstr, dwflags: UInt, pgpolist: MutPtr): Bool =
    windowssysWindowsWin32SystemGrouppolicyGetGPOListA(htoken.rawAddress.toCPointer<ByteVar>(), lpname.rawAddress.toCPointer<ByteVar>(), lphostname.rawAddress.toCPointer<ByteVar>(), lpcomputername.rawAddress.toCPointer<ByteVar>(), dwflags, pgpolist.rawAddress.toCPointer<ByteVar>())

public actual fun getGPOListW(htoken: Handle, lpname: Pcwstr, lphostname: Pcwstr, lpcomputername: Pcwstr, dwflags: UInt, pgpolist: MutPtr): Bool =
    windowssysWindowsWin32SystemGrouppolicyGetGPOListW(htoken.rawAddress.toCPointer<ByteVar>(), lpname.rawAddress.toCPointer<ByteVar>(), lphostname.rawAddress.toCPointer<ByteVar>(), lpcomputername.rawAddress.toCPointer<ByteVar>(), dwflags, pgpolist.rawAddress.toCPointer<ByteVar>())

public actual fun getLocalManagedApplicationData(productcode: Pcwstr, displayname: MutPtr, supporturl: MutPtr) {
    windowssysWindowsWin32SystemGrouppolicyGetLocalManagedApplicationData(productcode.rawAddress.toCPointer<ByteVar>(), displayname.rawAddress.toCPointer<ByteVar>(), supporturl.rawAddress.toCPointer<ByteVar>())
}

public actual fun getLocalManagedApplications(buserapps: Bool, pdwapps: MutPtr, prglocalapps: MutPtr): UInt =
    windowssysWindowsWin32SystemGrouppolicyGetLocalManagedApplications(buserapps, pdwapps.rawAddress.toCPointer<ByteVar>(), prglocalapps.rawAddress.toCPointer<ByteVar>())

public actual fun getManagedApplicationCategories(dwreserved: UInt, pappcategory: MutPtr): UInt =
    windowssysWindowsWin32SystemGrouppolicyGetManagedApplicationCategories(dwreserved, pappcategory.rawAddress.toCPointer<ByteVar>())

public actual fun getManagedApplications(pcategory: ConstPtr, dwqueryflags: UInt, dwinfolevel: UInt, pdwapps: MutPtr, prgmanagedapps: MutPtr): UInt =
    windowssysWindowsWin32SystemGrouppolicyGetManagedApplications(pcategory.rawAddress.toCPointer<ByteVar>(), dwqueryflags, dwinfolevel, pdwapps.rawAddress.toCPointer<ByteVar>(), prgmanagedapps.rawAddress.toCPointer<ByteVar>())

public actual fun importRSoPData(lpnamespace: Pcwstr, lpfilename: Pcwstr): Hresult =
    windowssysWindowsWin32SystemGrouppolicyImportRSoPData(lpnamespace.rawAddress.toCPointer<ByteVar>(), lpfilename.rawAddress.toCPointer<ByteVar>())

public actual fun installApplication(pinstallinfo: ConstPtr): UInt =
    windowssysWindowsWin32SystemGrouppolicyInstallApplication(pinstallinfo.rawAddress.toCPointer<ByteVar>())

public actual fun leaveCriticalPolicySection(hsection: Handle): Bool =
    windowssysWindowsWin32SystemGrouppolicyLeaveCriticalPolicySection(hsection.rawAddress.toCPointer<ByteVar>())

public actual fun processGroupPolicyCompleted(extensionid: ConstPtr, pasynchandle: ULong, dwstatus: UInt): UInt =
    windowssysWindowsWin32SystemGrouppolicyProcessGroupPolicyCompleted(extensionid.rawAddress.toCPointer<ByteVar>(), pasynchandle, dwstatus)

public actual fun processGroupPolicyCompletedEx(extensionid: ConstPtr, pasynchandle: ULong, dwstatus: UInt, rsopstatus: Hresult): UInt =
    windowssysWindowsWin32SystemGrouppolicyProcessGroupPolicyCompletedEx(extensionid.rawAddress.toCPointer<ByteVar>(), pasynchandle, dwstatus, rsopstatus)

public actual fun refreshPolicy(bmachine: Bool): Bool =
    windowssysWindowsWin32SystemGrouppolicyRefreshPolicy(bmachine)

public actual fun refreshPolicyEx(bmachine: Bool, dwoptions: UInt): Bool =
    windowssysWindowsWin32SystemGrouppolicyRefreshPolicyEx(bmachine, dwoptions)

public actual fun registerGPNotification(hevent: Handle, bmachine: Bool): Bool =
    windowssysWindowsWin32SystemGrouppolicyRegisterGPNotification(hevent.rawAddress.toCPointer<ByteVar>(), bmachine)

public actual fun rsopAccessCheckByType(psecuritydescriptor: PsecurityDescriptor, pprincipalselfsid: Psid, prsoptoken: ConstPtr, dwdesiredaccessmask: UInt, pobjecttypelist: ConstPtr, objecttypelistlength: UInt, pgenericmapping: ConstPtr, pprivilegeset: ConstPtr, pdwprivilegesetlength: ConstPtr, pdwgrantedaccessmask: MutPtr, pbaccessstatus: MutPtr): Hresult =
    windowssysWindowsWin32SystemGrouppolicyRsopAccessCheckByType(psecuritydescriptor.rawAddress.toCPointer<ByteVar>(), pprincipalselfsid.rawAddress.toCPointer<ByteVar>(), prsoptoken.rawAddress.toCPointer<ByteVar>(), dwdesiredaccessmask, pobjecttypelist.rawAddress.toCPointer<ByteVar>(), objecttypelistlength, pgenericmapping.rawAddress.toCPointer<ByteVar>(), pprivilegeset.rawAddress.toCPointer<ByteVar>(), pdwprivilegesetlength.rawAddress.toCPointer<ByteVar>(), pdwgrantedaccessmask.rawAddress.toCPointer<ByteVar>(), pbaccessstatus.rawAddress.toCPointer<ByteVar>())

public actual fun rsopFileAccessCheck(pszfilename: Pcwstr, prsoptoken: ConstPtr, dwdesiredaccessmask: UInt, pdwgrantedaccessmask: MutPtr, pbaccessstatus: MutPtr): Hresult =
    windowssysWindowsWin32SystemGrouppolicyRsopFileAccessCheck(pszfilename.rawAddress.toCPointer<ByteVar>(), prsoptoken.rawAddress.toCPointer<ByteVar>(), dwdesiredaccessmask, pdwgrantedaccessmask.rawAddress.toCPointer<ByteVar>(), pbaccessstatus.rawAddress.toCPointer<ByteVar>())

public actual fun rsopResetPolicySettingStatus(dwflags: UInt, pservices: MutPtr, psettinginstance: MutPtr): Hresult =
    windowssysWindowsWin32SystemGrouppolicyRsopResetPolicySettingStatus(dwflags, pservices.rawAddress.toCPointer<ByteVar>(), psettinginstance.rawAddress.toCPointer<ByteVar>())

public actual fun rsopSetPolicySettingStatus(dwflags: UInt, pservices: MutPtr, psettinginstance: MutPtr, ninfo: UInt, pstatus: ConstPtr): Hresult =
    windowssysWindowsWin32SystemGrouppolicyRsopSetPolicySettingStatus(dwflags, pservices.rawAddress.toCPointer<ByteVar>(), psettinginstance.rawAddress.toCPointer<ByteVar>(), ninfo, pstatus.rawAddress.toCPointer<ByteVar>())

public actual fun uninstallApplication(productcode: Pcwstr, dwstatus: UInt): UInt =
    windowssysWindowsWin32SystemGrouppolicyUninstallApplication(productcode.rawAddress.toCPointer<ByteVar>(), dwstatus)

public actual fun unregisterGPNotification(hevent: Handle): Bool =
    windowssysWindowsWin32SystemGrouppolicyUnregisterGPNotification(hevent.rawAddress.toCPointer<ByteVar>())
