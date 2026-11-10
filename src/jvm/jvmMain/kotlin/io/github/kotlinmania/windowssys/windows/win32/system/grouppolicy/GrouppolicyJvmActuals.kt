@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private object WindowsWin32SystemGrouppolicyJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_grouppolicy_browseForGPO(lpbrowseinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_grouppolicy_commandLineFromMsiDescriptor(descriptor: Long, commandline: Long, commandlinelength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_grouppolicy_createGPOLink(lpgpo: Long, lpcontainer: Long, fhighpriority: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_grouppolicy_deleteAllGPOLinks(lpcontainer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_grouppolicy_deleteGPOLink(lpgpo: Long, lpcontainer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_grouppolicy_enterCriticalPolicySection(bmachine: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_grouppolicy_exportRSoPData(lpnamespace: Long, lpfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_grouppolicy_freeGPOListA(pgpolist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_grouppolicy_freeGPOListW(pgpolist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_grouppolicy_generateGPNotification(bmachine: Int, lpwszmgmtproduct: Long, dwmgmtproductoptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_grouppolicy_getAppliedGPOListA(dwflags: Int, pmachinename: Long, psiduser: Long, pguidextension: Long, ppgpolist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_grouppolicy_getAppliedGPOListW(dwflags: Int, pmachinename: Long, psiduser: Long, pguidextension: Long, ppgpolist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_grouppolicy_getGPOListA(htoken: Long, lpname: Long, lphostname: Long, lpcomputername: Long, dwflags: Int, pgpolist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_grouppolicy_getGPOListW(htoken: Long, lpname: Long, lphostname: Long, lpcomputername: Long, dwflags: Int, pgpolist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_grouppolicy_getLocalManagedApplicationData(productcode: Long, displayname: Long, supporturl: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_grouppolicy_getLocalManagedApplications(buserapps: Int, pdwapps: Long, prglocalapps: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_grouppolicy_getManagedApplicationCategories(dwreserved: Int, pappcategory: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_grouppolicy_getManagedApplications(pcategory: Long, dwqueryflags: Int, dwinfolevel: Int, pdwapps: Long, prgmanagedapps: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_grouppolicy_importRSoPData(lpnamespace: Long, lpfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_grouppolicy_installApplication(pinstallinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_grouppolicy_leaveCriticalPolicySection(hsection: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_grouppolicy_processGroupPolicyCompleted(extensionid: Long, pasynchandle: Long, dwstatus: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_grouppolicy_processGroupPolicyCompletedEx(extensionid: Long, pasynchandle: Long, dwstatus: Int, rsopstatus: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_grouppolicy_refreshPolicy(bmachine: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_grouppolicy_refreshPolicyEx(bmachine: Int, dwoptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_grouppolicy_registerGPNotification(hevent: Long, bmachine: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_grouppolicy_rsopAccessCheckByType(psecuritydescriptor: Long, pprincipalselfsid: Long, prsoptoken: Long, dwdesiredaccessmask: Int, pobjecttypelist: Long, objecttypelistlength: Int, pgenericmapping: Long, pprivilegeset: Long, pdwprivilegesetlength: Long, pdwgrantedaccessmask: Long, pbaccessstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_grouppolicy_rsopFileAccessCheck(pszfilename: Long, prsoptoken: Long, dwdesiredaccessmask: Int, pdwgrantedaccessmask: Long, pbaccessstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_grouppolicy_rsopResetPolicySettingStatus(dwflags: Int, pservices: Long, psettinginstance: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_grouppolicy_rsopSetPolicySettingStatus(dwflags: Int, pservices: Long, psettinginstance: Long, ninfo: Int, pstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_grouppolicy_uninstallApplication(productcode: Long, dwstatus: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_grouppolicy_unregisterGPNotification(hevent: Long): Int
}

public actual fun browseForGPO(lpbrowseinfo: COpaquePointer?): Hresult =
    WindowsWin32SystemGrouppolicyJniBridge.windowssys_windows_win32_system_grouppolicy_browseForGPO((lpbrowseinfo?.value ?: 0L))

public actual fun commandLineFromMsiDescriptor(descriptor: Pcwstr, commandline: Pwstr, commandlinelength: COpaquePointer?): UInt =
    WindowsWin32SystemGrouppolicyJniBridge.windowssys_windows_win32_system_grouppolicy_commandLineFromMsiDescriptor((descriptor?.value ?: 0L), (commandline?.value ?: 0L), (commandlinelength?.value ?: 0L)).toUInt()

public actual fun createGPOLink(lpgpo: Pcwstr, lpcontainer: Pcwstr, fhighpriority: Bool): Hresult =
    WindowsWin32SystemGrouppolicyJniBridge.windowssys_windows_win32_system_grouppolicy_createGPOLink((lpgpo?.value ?: 0L), (lpcontainer?.value ?: 0L), fhighpriority)

public actual fun deleteAllGPOLinks(lpcontainer: Pcwstr): Hresult =
    WindowsWin32SystemGrouppolicyJniBridge.windowssys_windows_win32_system_grouppolicy_deleteAllGPOLinks((lpcontainer?.value ?: 0L))

public actual fun deleteGPOLink(lpgpo: Pcwstr, lpcontainer: Pcwstr): Hresult =
    WindowsWin32SystemGrouppolicyJniBridge.windowssys_windows_win32_system_grouppolicy_deleteGPOLink((lpgpo?.value ?: 0L), (lpcontainer?.value ?: 0L))

public actual fun enterCriticalPolicySection(bmachine: Bool): Handle =
    WindowsWin32SystemGrouppolicyJniBridge.windowssys_windows_win32_system_grouppolicy_enterCriticalPolicySection(bmachine).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun exportRSoPData(lpnamespace: Pcwstr, lpfilename: Pcwstr): Hresult =
    WindowsWin32SystemGrouppolicyJniBridge.windowssys_windows_win32_system_grouppolicy_exportRSoPData((lpnamespace?.value ?: 0L), (lpfilename?.value ?: 0L))

public actual fun freeGPOListA(pgpolist: COpaquePointer?): Bool =
    WindowsWin32SystemGrouppolicyJniBridge.windowssys_windows_win32_system_grouppolicy_freeGPOListA((pgpolist?.value ?: 0L))

public actual fun freeGPOListW(pgpolist: COpaquePointer?): Bool =
    WindowsWin32SystemGrouppolicyJniBridge.windowssys_windows_win32_system_grouppolicy_freeGPOListW((pgpolist?.value ?: 0L))

public actual fun generateGPNotification(bmachine: Bool, lpwszmgmtproduct: Pcwstr, dwmgmtproductoptions: UInt): UInt =
    WindowsWin32SystemGrouppolicyJniBridge.windowssys_windows_win32_system_grouppolicy_generateGPNotification(bmachine, (lpwszmgmtproduct?.value ?: 0L), dwmgmtproductoptions.toInt()).toUInt()

public actual fun getAppliedGPOListA(dwflags: UInt, pmachinename: Pcstr, psiduser: Psid, pguidextension: COpaquePointer?, ppgpolist: COpaquePointer?): UInt =
    WindowsWin32SystemGrouppolicyJniBridge.windowssys_windows_win32_system_grouppolicy_getAppliedGPOListA(dwflags.toInt(), (pmachinename?.value ?: 0L), (psiduser?.value ?: 0L), (pguidextension?.value ?: 0L), (ppgpolist?.value ?: 0L)).toUInt()

public actual fun getAppliedGPOListW(dwflags: UInt, pmachinename: Pcwstr, psiduser: Psid, pguidextension: COpaquePointer?, ppgpolist: COpaquePointer?): UInt =
    WindowsWin32SystemGrouppolicyJniBridge.windowssys_windows_win32_system_grouppolicy_getAppliedGPOListW(dwflags.toInt(), (pmachinename?.value ?: 0L), (psiduser?.value ?: 0L), (pguidextension?.value ?: 0L), (ppgpolist?.value ?: 0L)).toUInt()

public actual fun getGPOListA(htoken: Handle, lpname: Pcstr, lphostname: Pcstr, lpcomputername: Pcstr, dwflags: UInt, pgpolist: COpaquePointer?): Bool =
    WindowsWin32SystemGrouppolicyJniBridge.windowssys_windows_win32_system_grouppolicy_getGPOListA((htoken?.value ?: 0L), (lpname?.value ?: 0L), (lphostname?.value ?: 0L), (lpcomputername?.value ?: 0L), dwflags.toInt(), (pgpolist?.value ?: 0L))

public actual fun getGPOListW(htoken: Handle, lpname: Pcwstr, lphostname: Pcwstr, lpcomputername: Pcwstr, dwflags: UInt, pgpolist: COpaquePointer?): Bool =
    WindowsWin32SystemGrouppolicyJniBridge.windowssys_windows_win32_system_grouppolicy_getGPOListW((htoken?.value ?: 0L), (lpname?.value ?: 0L), (lphostname?.value ?: 0L), (lpcomputername?.value ?: 0L), dwflags.toInt(), (pgpolist?.value ?: 0L))

public actual fun getLocalManagedApplicationData(productcode: Pcwstr, displayname: COpaquePointer?, supporturl: COpaquePointer?) {
    WindowsWin32SystemGrouppolicyJniBridge.windowssys_windows_win32_system_grouppolicy_getLocalManagedApplicationData((productcode?.value ?: 0L), (displayname?.value ?: 0L), (supporturl?.value ?: 0L))
}

public actual fun getLocalManagedApplications(buserapps: Bool, pdwapps: COpaquePointer?, prglocalapps: COpaquePointer?): UInt =
    WindowsWin32SystemGrouppolicyJniBridge.windowssys_windows_win32_system_grouppolicy_getLocalManagedApplications(buserapps, (pdwapps?.value ?: 0L), (prglocalapps?.value ?: 0L)).toUInt()

public actual fun getManagedApplicationCategories(dwreserved: UInt, pappcategory: COpaquePointer?): UInt =
    WindowsWin32SystemGrouppolicyJniBridge.windowssys_windows_win32_system_grouppolicy_getManagedApplicationCategories(dwreserved.toInt(), (pappcategory?.value ?: 0L)).toUInt()

public actual fun getManagedApplications(pcategory: COpaquePointer?, dwqueryflags: UInt, dwinfolevel: UInt, pdwapps: COpaquePointer?, prgmanagedapps: COpaquePointer?): UInt =
    WindowsWin32SystemGrouppolicyJniBridge.windowssys_windows_win32_system_grouppolicy_getManagedApplications((pcategory?.value ?: 0L), dwqueryflags.toInt(), dwinfolevel.toInt(), (pdwapps?.value ?: 0L), (prgmanagedapps?.value ?: 0L)).toUInt()

public actual fun importRSoPData(lpnamespace: Pcwstr, lpfilename: Pcwstr): Hresult =
    WindowsWin32SystemGrouppolicyJniBridge.windowssys_windows_win32_system_grouppolicy_importRSoPData((lpnamespace?.value ?: 0L), (lpfilename?.value ?: 0L))

public actual fun installApplication(pinstallinfo: COpaquePointer?): UInt =
    WindowsWin32SystemGrouppolicyJniBridge.windowssys_windows_win32_system_grouppolicy_installApplication((pinstallinfo?.value ?: 0L)).toUInt()

public actual fun leaveCriticalPolicySection(hsection: Handle): Bool =
    WindowsWin32SystemGrouppolicyJniBridge.windowssys_windows_win32_system_grouppolicy_leaveCriticalPolicySection((hsection?.value ?: 0L))

public actual fun processGroupPolicyCompleted(extensionid: COpaquePointer?, pasynchandle: ULong, dwstatus: UInt): UInt =
    WindowsWin32SystemGrouppolicyJniBridge.windowssys_windows_win32_system_grouppolicy_processGroupPolicyCompleted((extensionid?.value ?: 0L), pasynchandle.toLong(), dwstatus.toInt()).toUInt()

public actual fun processGroupPolicyCompletedEx(extensionid: COpaquePointer?, pasynchandle: ULong, dwstatus: UInt, rsopstatus: Hresult): UInt =
    WindowsWin32SystemGrouppolicyJniBridge.windowssys_windows_win32_system_grouppolicy_processGroupPolicyCompletedEx((extensionid?.value ?: 0L), pasynchandle.toLong(), dwstatus.toInt(), rsopstatus).toUInt()

public actual fun refreshPolicy(bmachine: Bool): Bool =
    WindowsWin32SystemGrouppolicyJniBridge.windowssys_windows_win32_system_grouppolicy_refreshPolicy(bmachine)

public actual fun refreshPolicyEx(bmachine: Bool, dwoptions: UInt): Bool =
    WindowsWin32SystemGrouppolicyJniBridge.windowssys_windows_win32_system_grouppolicy_refreshPolicyEx(bmachine, dwoptions.toInt())

public actual fun registerGPNotification(hevent: Handle, bmachine: Bool): Bool =
    WindowsWin32SystemGrouppolicyJniBridge.windowssys_windows_win32_system_grouppolicy_registerGPNotification((hevent?.value ?: 0L), bmachine)

public actual fun rsopAccessCheckByType(psecuritydescriptor: PsecurityDescriptor, pprincipalselfsid: Psid, prsoptoken: COpaquePointer?, dwdesiredaccessmask: UInt, pobjecttypelist: COpaquePointer?, objecttypelistlength: UInt, pgenericmapping: COpaquePointer?, pprivilegeset: COpaquePointer?, pdwprivilegesetlength: COpaquePointer?, pdwgrantedaccessmask: COpaquePointer?, pbaccessstatus: COpaquePointer?): Hresult =
    WindowsWin32SystemGrouppolicyJniBridge.windowssys_windows_win32_system_grouppolicy_rsopAccessCheckByType((psecuritydescriptor?.value ?: 0L), (pprincipalselfsid?.value ?: 0L), (prsoptoken?.value ?: 0L), dwdesiredaccessmask.toInt(), (pobjecttypelist?.value ?: 0L), objecttypelistlength.toInt(), (pgenericmapping?.value ?: 0L), (pprivilegeset?.value ?: 0L), (pdwprivilegesetlength?.value ?: 0L), (pdwgrantedaccessmask?.value ?: 0L), (pbaccessstatus?.value ?: 0L))

public actual fun rsopFileAccessCheck(pszfilename: Pcwstr, prsoptoken: COpaquePointer?, dwdesiredaccessmask: UInt, pdwgrantedaccessmask: COpaquePointer?, pbaccessstatus: COpaquePointer?): Hresult =
    WindowsWin32SystemGrouppolicyJniBridge.windowssys_windows_win32_system_grouppolicy_rsopFileAccessCheck((pszfilename?.value ?: 0L), (prsoptoken?.value ?: 0L), dwdesiredaccessmask.toInt(), (pdwgrantedaccessmask?.value ?: 0L), (pbaccessstatus?.value ?: 0L))

public actual fun rsopResetPolicySettingStatus(dwflags: UInt, pservices: COpaquePointer?, psettinginstance: COpaquePointer?): Hresult =
    WindowsWin32SystemGrouppolicyJniBridge.windowssys_windows_win32_system_grouppolicy_rsopResetPolicySettingStatus(dwflags.toInt(), (pservices?.value ?: 0L), (psettinginstance?.value ?: 0L))

public actual fun rsopSetPolicySettingStatus(dwflags: UInt, pservices: COpaquePointer?, psettinginstance: COpaquePointer?, ninfo: UInt, pstatus: COpaquePointer?): Hresult =
    WindowsWin32SystemGrouppolicyJniBridge.windowssys_windows_win32_system_grouppolicy_rsopSetPolicySettingStatus(dwflags.toInt(), (pservices?.value ?: 0L), (psettinginstance?.value ?: 0L), ninfo.toInt(), (pstatus?.value ?: 0L))

public actual fun uninstallApplication(productcode: Pcwstr, dwstatus: UInt): UInt =
    WindowsWin32SystemGrouppolicyJniBridge.windowssys_windows_win32_system_grouppolicy_uninstallApplication((productcode?.value ?: 0L), dwstatus.toInt()).toUInt()

public actual fun unregisterGPNotification(hevent: Handle): Bool =
    WindowsWin32SystemGrouppolicyJniBridge.windowssys_windows_win32_system_grouppolicy_unregisterGPNotification((hevent?.value ?: 0L))
