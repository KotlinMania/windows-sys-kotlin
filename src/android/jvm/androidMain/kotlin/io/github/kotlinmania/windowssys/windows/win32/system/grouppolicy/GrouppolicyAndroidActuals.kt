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

private object WindowsWin32SystemGrouppolicyJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_grouppolicy_BrowseForGPO(lpbrowseinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_grouppolicy_CommandLineFromMsiDescriptor(descriptor: Long, commandline: Long, commandlinelength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_grouppolicy_CreateGPOLink(lpgpo: Long, lpcontainer: Long, fhighpriority: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_grouppolicy_DeleteAllGPOLinks(lpcontainer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_grouppolicy_DeleteGPOLink(lpgpo: Long, lpcontainer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_grouppolicy_EnterCriticalPolicySection(bmachine: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_grouppolicy_ExportRSoPData(lpnamespace: Long, lpfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_grouppolicy_FreeGPOListA(pgpolist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_grouppolicy_FreeGPOListW(pgpolist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_grouppolicy_GenerateGPNotification(bmachine: Int, lpwszmgmtproduct: Long, dwmgmtproductoptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_grouppolicy_GetAppliedGPOListA(dwflags: Int, pmachinename: Long, psiduser: Long, pguidextension: Long, ppgpolist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_grouppolicy_GetAppliedGPOListW(dwflags: Int, pmachinename: Long, psiduser: Long, pguidextension: Long, ppgpolist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_grouppolicy_GetGPOListA(htoken: Long, lpname: Long, lphostname: Long, lpcomputername: Long, dwflags: Int, pgpolist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_grouppolicy_GetGPOListW(htoken: Long, lpname: Long, lphostname: Long, lpcomputername: Long, dwflags: Int, pgpolist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_grouppolicy_GetLocalManagedApplicationData(productcode: Long, displayname: Long, supporturl: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_grouppolicy_GetLocalManagedApplications(buserapps: Int, pdwapps: Long, prglocalapps: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_grouppolicy_GetManagedApplicationCategories(dwreserved: Int, pappcategory: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_grouppolicy_GetManagedApplications(pcategory: Long, dwqueryflags: Int, dwinfolevel: Int, pdwapps: Long, prgmanagedapps: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_grouppolicy_ImportRSoPData(lpnamespace: Long, lpfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_grouppolicy_InstallApplication(pinstallinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_grouppolicy_LeaveCriticalPolicySection(hsection: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_grouppolicy_ProcessGroupPolicyCompleted(extensionid: Long, pasynchandle: Long, dwstatus: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_grouppolicy_ProcessGroupPolicyCompletedEx(extensionid: Long, pasynchandle: Long, dwstatus: Int, rsopstatus: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_grouppolicy_RefreshPolicy(bmachine: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_grouppolicy_RefreshPolicyEx(bmachine: Int, dwoptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_grouppolicy_RegisterGPNotification(hevent: Long, bmachine: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_grouppolicy_RsopAccessCheckByType(psecuritydescriptor: Long, pprincipalselfsid: Long, prsoptoken: Long, dwdesiredaccessmask: Int, pobjecttypelist: Long, objecttypelistlength: Int, pgenericmapping: Long, pprivilegeset: Long, pdwprivilegesetlength: Long, pdwgrantedaccessmask: Long, pbaccessstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_grouppolicy_RsopFileAccessCheck(pszfilename: Long, prsoptoken: Long, dwdesiredaccessmask: Int, pdwgrantedaccessmask: Long, pbaccessstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_grouppolicy_RsopResetPolicySettingStatus(dwflags: Int, pservices: Long, psettinginstance: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_grouppolicy_RsopSetPolicySettingStatus(dwflags: Int, pservices: Long, psettinginstance: Long, ninfo: Int, pstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_grouppolicy_UninstallApplication(productcode: Long, dwstatus: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_grouppolicy_UnregisterGPNotification(hevent: Long): Int
}

public actual fun BrowseForGPO(lpbrowseinfo: Long): HRESULT =
    WindowsWin32SystemGrouppolicyJniBridge.windowssys_windows_win32_system_grouppolicy_BrowseForGPO(lpbrowseinfo)

public actual fun CommandLineFromMsiDescriptor(descriptor: PCWSTR, commandline: PWSTR, commandlinelength: Long): UInt =
    WindowsWin32SystemGrouppolicyJniBridge.windowssys_windows_win32_system_grouppolicy_CommandLineFromMsiDescriptor(descriptor, commandline, commandlinelength).toUInt()

public actual fun CreateGPOLink(lpgpo: PCWSTR, lpcontainer: PCWSTR, fhighpriority: BOOL): HRESULT =
    WindowsWin32SystemGrouppolicyJniBridge.windowssys_windows_win32_system_grouppolicy_CreateGPOLink(lpgpo, lpcontainer, fhighpriority)

public actual fun DeleteAllGPOLinks(lpcontainer: PCWSTR): HRESULT =
    WindowsWin32SystemGrouppolicyJniBridge.windowssys_windows_win32_system_grouppolicy_DeleteAllGPOLinks(lpcontainer)

public actual fun DeleteGPOLink(lpgpo: PCWSTR, lpcontainer: PCWSTR): HRESULT =
    WindowsWin32SystemGrouppolicyJniBridge.windowssys_windows_win32_system_grouppolicy_DeleteGPOLink(lpgpo, lpcontainer)

public actual fun EnterCriticalPolicySection(bmachine: BOOL): HANDLE =
    WindowsWin32SystemGrouppolicyJniBridge.windowssys_windows_win32_system_grouppolicy_EnterCriticalPolicySection(bmachine)

public actual fun ExportRSoPData(lpnamespace: PCWSTR, lpfilename: PCWSTR): HRESULT =
    WindowsWin32SystemGrouppolicyJniBridge.windowssys_windows_win32_system_grouppolicy_ExportRSoPData(lpnamespace, lpfilename)

public actual fun FreeGPOListA(pgpolist: Long): BOOL =
    WindowsWin32SystemGrouppolicyJniBridge.windowssys_windows_win32_system_grouppolicy_FreeGPOListA(pgpolist)

public actual fun FreeGPOListW(pgpolist: Long): BOOL =
    WindowsWin32SystemGrouppolicyJniBridge.windowssys_windows_win32_system_grouppolicy_FreeGPOListW(pgpolist)

public actual fun GenerateGPNotification(bmachine: BOOL, lpwszmgmtproduct: PCWSTR, dwmgmtproductoptions: UInt): UInt =
    WindowsWin32SystemGrouppolicyJniBridge.windowssys_windows_win32_system_grouppolicy_GenerateGPNotification(bmachine, lpwszmgmtproduct, dwmgmtproductoptions.toInt()).toUInt()

public actual fun GetAppliedGPOListA(dwflags: UInt, pmachinename: PCSTR, psiduser: PSID, pguidextension: Long, ppgpolist: Long): UInt =
    WindowsWin32SystemGrouppolicyJniBridge.windowssys_windows_win32_system_grouppolicy_GetAppliedGPOListA(dwflags.toInt(), pmachinename, psiduser, pguidextension, ppgpolist).toUInt()

public actual fun GetAppliedGPOListW(dwflags: UInt, pmachinename: PCWSTR, psiduser: PSID, pguidextension: Long, ppgpolist: Long): UInt =
    WindowsWin32SystemGrouppolicyJniBridge.windowssys_windows_win32_system_grouppolicy_GetAppliedGPOListW(dwflags.toInt(), pmachinename, psiduser, pguidextension, ppgpolist).toUInt()

public actual fun GetGPOListA(htoken: HANDLE, lpname: PCSTR, lphostname: PCSTR, lpcomputername: PCSTR, dwflags: UInt, pgpolist: Long): BOOL =
    WindowsWin32SystemGrouppolicyJniBridge.windowssys_windows_win32_system_grouppolicy_GetGPOListA(htoken, lpname, lphostname, lpcomputername, dwflags.toInt(), pgpolist)

public actual fun GetGPOListW(htoken: HANDLE, lpname: PCWSTR, lphostname: PCWSTR, lpcomputername: PCWSTR, dwflags: UInt, pgpolist: Long): BOOL =
    WindowsWin32SystemGrouppolicyJniBridge.windowssys_windows_win32_system_grouppolicy_GetGPOListW(htoken, lpname, lphostname, lpcomputername, dwflags.toInt(), pgpolist)

public actual fun GetLocalManagedApplicationData(productcode: PCWSTR, displayname: Long, supporturl: Long) {
    WindowsWin32SystemGrouppolicyJniBridge.windowssys_windows_win32_system_grouppolicy_GetLocalManagedApplicationData(productcode, displayname, supporturl)
}

public actual fun GetLocalManagedApplications(buserapps: BOOL, pdwapps: Long, prglocalapps: Long): UInt =
    WindowsWin32SystemGrouppolicyJniBridge.windowssys_windows_win32_system_grouppolicy_GetLocalManagedApplications(buserapps, pdwapps, prglocalapps).toUInt()

public actual fun GetManagedApplicationCategories(dwreserved: UInt, pappcategory: Long): UInt =
    WindowsWin32SystemGrouppolicyJniBridge.windowssys_windows_win32_system_grouppolicy_GetManagedApplicationCategories(dwreserved.toInt(), pappcategory).toUInt()

public actual fun GetManagedApplications(pcategory: Long, dwqueryflags: UInt, dwinfolevel: UInt, pdwapps: Long, prgmanagedapps: Long): UInt =
    WindowsWin32SystemGrouppolicyJniBridge.windowssys_windows_win32_system_grouppolicy_GetManagedApplications(pcategory, dwqueryflags.toInt(), dwinfolevel.toInt(), pdwapps, prgmanagedapps).toUInt()

public actual fun ImportRSoPData(lpnamespace: PCWSTR, lpfilename: PCWSTR): HRESULT =
    WindowsWin32SystemGrouppolicyJniBridge.windowssys_windows_win32_system_grouppolicy_ImportRSoPData(lpnamespace, lpfilename)

public actual fun InstallApplication(pinstallinfo: Long): UInt =
    WindowsWin32SystemGrouppolicyJniBridge.windowssys_windows_win32_system_grouppolicy_InstallApplication(pinstallinfo).toUInt()

public actual fun LeaveCriticalPolicySection(hsection: HANDLE): BOOL =
    WindowsWin32SystemGrouppolicyJniBridge.windowssys_windows_win32_system_grouppolicy_LeaveCriticalPolicySection(hsection)

public actual fun ProcessGroupPolicyCompleted(extensionid: Long, pasynchandle: ULong, dwstatus: UInt): UInt =
    WindowsWin32SystemGrouppolicyJniBridge.windowssys_windows_win32_system_grouppolicy_ProcessGroupPolicyCompleted(extensionid, pasynchandle.toLong(), dwstatus.toInt()).toUInt()

public actual fun ProcessGroupPolicyCompletedEx(extensionid: Long, pasynchandle: ULong, dwstatus: UInt, rsopstatus: HRESULT): UInt =
    WindowsWin32SystemGrouppolicyJniBridge.windowssys_windows_win32_system_grouppolicy_ProcessGroupPolicyCompletedEx(extensionid, pasynchandle.toLong(), dwstatus.toInt(), rsopstatus).toUInt()

public actual fun RefreshPolicy(bmachine: BOOL): BOOL =
    WindowsWin32SystemGrouppolicyJniBridge.windowssys_windows_win32_system_grouppolicy_RefreshPolicy(bmachine)

public actual fun RefreshPolicyEx(bmachine: BOOL, dwoptions: UInt): BOOL =
    WindowsWin32SystemGrouppolicyJniBridge.windowssys_windows_win32_system_grouppolicy_RefreshPolicyEx(bmachine, dwoptions.toInt())

public actual fun RegisterGPNotification(hevent: HANDLE, bmachine: BOOL): BOOL =
    WindowsWin32SystemGrouppolicyJniBridge.windowssys_windows_win32_system_grouppolicy_RegisterGPNotification(hevent, bmachine)

public actual fun RsopAccessCheckByType(psecuritydescriptor: PSECURITY_DESCRIPTOR, pprincipalselfsid: PSID, prsoptoken: Long, dwdesiredaccessmask: UInt, pobjecttypelist: Long, objecttypelistlength: UInt, pgenericmapping: Long, pprivilegeset: Long, pdwprivilegesetlength: Long, pdwgrantedaccessmask: Long, pbaccessstatus: Long): HRESULT =
    WindowsWin32SystemGrouppolicyJniBridge.windowssys_windows_win32_system_grouppolicy_RsopAccessCheckByType(psecuritydescriptor, pprincipalselfsid, prsoptoken, dwdesiredaccessmask.toInt(), pobjecttypelist, objecttypelistlength.toInt(), pgenericmapping, pprivilegeset, pdwprivilegesetlength, pdwgrantedaccessmask, pbaccessstatus)

public actual fun RsopFileAccessCheck(pszfilename: PCWSTR, prsoptoken: Long, dwdesiredaccessmask: UInt, pdwgrantedaccessmask: Long, pbaccessstatus: Long): HRESULT =
    WindowsWin32SystemGrouppolicyJniBridge.windowssys_windows_win32_system_grouppolicy_RsopFileAccessCheck(pszfilename, prsoptoken, dwdesiredaccessmask.toInt(), pdwgrantedaccessmask, pbaccessstatus)

public actual fun RsopResetPolicySettingStatus(dwflags: UInt, pservices: Long, psettinginstance: Long): HRESULT =
    WindowsWin32SystemGrouppolicyJniBridge.windowssys_windows_win32_system_grouppolicy_RsopResetPolicySettingStatus(dwflags.toInt(), pservices, psettinginstance)

public actual fun RsopSetPolicySettingStatus(dwflags: UInt, pservices: Long, psettinginstance: Long, ninfo: UInt, pstatus: Long): HRESULT =
    WindowsWin32SystemGrouppolicyJniBridge.windowssys_windows_win32_system_grouppolicy_RsopSetPolicySettingStatus(dwflags.toInt(), pservices, psettinginstance, ninfo.toInt(), pstatus)

public actual fun UninstallApplication(productcode: PCWSTR, dwstatus: UInt): UInt =
    WindowsWin32SystemGrouppolicyJniBridge.windowssys_windows_win32_system_grouppolicy_UninstallApplication(productcode, dwstatus.toInt()).toUInt()

public actual fun UnregisterGPNotification(hevent: HANDLE): BOOL =
    WindowsWin32SystemGrouppolicyJniBridge.windowssys_windows_win32_system_grouppolicy_UnregisterGPNotification(hevent)
