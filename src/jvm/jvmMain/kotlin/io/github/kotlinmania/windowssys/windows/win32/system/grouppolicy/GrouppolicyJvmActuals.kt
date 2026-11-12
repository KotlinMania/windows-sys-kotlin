@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private object WindowsWin32SystemGrouppolicyJniBridge {
    init {
        loadNativeLibrary()
    }

    private fun loadNativeLibrary() {
        val osRaw = System.getProperty("os.name", "").lowercase()
        val archRaw = System.getProperty("os.arch", "").lowercase()
        val hostPlatform =
            when {
                osRaw.contains("win") -> "windows"
                osRaw.contains("mac") || osRaw.contains("darwin") -> "macos"
                else -> "linux"
            }
        val hostArch =
            when {
                archRaw == "aarch64" || archRaw == "arm64" -> "aarch64"
                archRaw == "amd64" || archRaw == "x86_64" -> "x86_64"
                else -> archRaw
            }
        val libFileName =
            when (hostPlatform) {
                "windows" -> "windowssys_jni.dll"
                "macos" -> "libwindowssys_jni.dylib"
                else -> "libwindowssys_jni.so"
            }
        val pathSep = System.getProperty("path.separator", ":")
        val libPathProp = System.getProperty("java.library.path", "")
        for (dirEntry in libPathProp.split(pathSep)) {
            if (dirEntry.isEmpty()) continue
            val candidate = java.io.File(dirEntry, libFileName)
            if (candidate.isFile) {
                System.load(candidate.absolutePath)
                return
            }
        }
        val resourcePath = "io/github/kotlinmania/windowssys/native/$hostPlatform-$hostArch/$libFileName"
        val stream = WindowsWin32SystemGrouppolicyJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
        if (stream != null) {
            val suffix = "." + libFileName.substringAfterLast('.')
            val extracted =
                java.nio.file.Files
                    .createTempFile("windowssys_jni-", suffix)
                    .toFile()
            extracted.deleteOnExit()
            stream.use { input ->
                extracted.outputStream().use { output ->
                    input.copyTo(output)
                }
            }
            System.load(extracted.absolutePath)
            return
        }
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32SystemGrouppolicyBrowseForGPO(lpbrowseinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemGrouppolicyCommandLineFromMsiDescriptor(descriptor: Long, commandline: Long, commandlinelength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemGrouppolicyCreateGPOLink(lpgpo: Long, lpcontainer: Long, fhighpriority: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemGrouppolicyDeleteAllGPOLinks(lpcontainer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemGrouppolicyDeleteGPOLink(lpgpo: Long, lpcontainer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemGrouppolicyEnterCriticalPolicySection(bmachine: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemGrouppolicyExportRSoPData(lpnamespace: Long, lpfilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemGrouppolicyFreeGPOListA(pgpolist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemGrouppolicyFreeGPOListW(pgpolist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemGrouppolicyGenerateGPNotification(bmachine: Int, lpwszmgmtproduct: Long, dwmgmtproductoptions: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemGrouppolicyGetAppliedGPOListA(dwflags: Int, pmachinename: Long, psiduser: Long, pguidextension: Long, ppgpolist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemGrouppolicyGetAppliedGPOListW(dwflags: Int, pmachinename: Long, psiduser: Long, pguidextension: Long, ppgpolist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemGrouppolicyGetGPOListA(htoken: Long, lpname: Long, lphostname: Long, lpcomputername: Long, dwflags: Int, pgpolist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemGrouppolicyGetGPOListW(htoken: Long, lpname: Long, lphostname: Long, lpcomputername: Long, dwflags: Int, pgpolist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemGrouppolicyGetLocalManagedApplicationData(productcode: Long, displayname: Long, supporturl: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemGrouppolicyGetLocalManagedApplications(buserapps: Int, pdwapps: Long, prglocalapps: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemGrouppolicyGetManagedApplicationCategories(dwreserved: Int, pappcategory: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemGrouppolicyGetManagedApplications(pcategory: Long, dwqueryflags: Int, dwinfolevel: Int, pdwapps: Long, prgmanagedapps: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemGrouppolicyImportRSoPData(lpnamespace: Long, lpfilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemGrouppolicyInstallApplication(pinstallinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemGrouppolicyLeaveCriticalPolicySection(hsection: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemGrouppolicyProcessGroupPolicyCompleted(extensionid: Long, pasynchandle: Long, dwstatus: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemGrouppolicyProcessGroupPolicyCompletedEx(extensionid: Long, pasynchandle: Long, dwstatus: Int, rsopstatus: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemGrouppolicyRefreshPolicy(bmachine: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemGrouppolicyRefreshPolicyEx(bmachine: Int, dwoptions: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemGrouppolicyRegisterGPNotification(hevent: Long, bmachine: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemGrouppolicyRsopAccessCheckByType(psecuritydescriptor: Long, pprincipalselfsid: Long, prsoptoken: Long, dwdesiredaccessmask: Int, pobjecttypelist: Long, objecttypelistlength: Int, pgenericmapping: Long, pprivilegeset: Long, pdwprivilegesetlength: Long, pdwgrantedaccessmask: Long, pbaccessstatus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemGrouppolicyRsopFileAccessCheck(pszfilename: Long, prsoptoken: Long, dwdesiredaccessmask: Int, pdwgrantedaccessmask: Long, pbaccessstatus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemGrouppolicyRsopResetPolicySettingStatus(dwflags: Int, pservices: Long, psettinginstance: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemGrouppolicyRsopSetPolicySettingStatus(dwflags: Int, pservices: Long, psettinginstance: Long, ninfo: Int, pstatus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemGrouppolicyUninstallApplication(productcode: Long, dwstatus: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemGrouppolicyUnregisterGPNotification(hevent: Long): Int
}

public actual fun browseForGPO(lpbrowseinfo: MutPtr<Gpobrowseinfo>): Hresult =
    WindowsWin32SystemGrouppolicyJniBridge.windowssysWindowsWin32SystemGrouppolicyBrowseForGPO(lpbrowseinfo.rawAddress)

public actual fun commandLineFromMsiDescriptor(descriptor: Pcwstr, commandline: Pwstr, commandlinelength: MutPtr<UInt>): UInt =
    WindowsWin32SystemGrouppolicyJniBridge.windowssysWindowsWin32SystemGrouppolicyCommandLineFromMsiDescriptor(descriptor.rawAddress, commandline.rawAddress, commandlinelength.rawAddress).toUInt()

public actual fun createGPOLink(lpgpo: Pcwstr, lpcontainer: Pcwstr, fhighpriority: Bool): Hresult =
    WindowsWin32SystemGrouppolicyJniBridge.windowssysWindowsWin32SystemGrouppolicyCreateGPOLink(lpgpo.rawAddress, lpcontainer.rawAddress, fhighpriority)

public actual fun deleteAllGPOLinks(lpcontainer: Pcwstr): Hresult =
    WindowsWin32SystemGrouppolicyJniBridge.windowssysWindowsWin32SystemGrouppolicyDeleteAllGPOLinks(lpcontainer.rawAddress)

public actual fun deleteGPOLink(lpgpo: Pcwstr, lpcontainer: Pcwstr): Hresult =
    WindowsWin32SystemGrouppolicyJniBridge.windowssysWindowsWin32SystemGrouppolicyDeleteGPOLink(lpgpo.rawAddress, lpcontainer.rawAddress)

public actual fun enterCriticalPolicySection(bmachine: Bool): Handle =
    MutPtr(WindowsWin32SystemGrouppolicyJniBridge.windowssysWindowsWin32SystemGrouppolicyEnterCriticalPolicySection(bmachine))

public actual fun exportRSoPData(lpnamespace: Pcwstr, lpfilename: Pcwstr): Hresult =
    WindowsWin32SystemGrouppolicyJniBridge.windowssysWindowsWin32SystemGrouppolicyExportRSoPData(lpnamespace.rawAddress, lpfilename.rawAddress)

public actual fun freeGPOListA(pgpolist: ConstPtr<GroupPolicyObjecta>): Bool =
    WindowsWin32SystemGrouppolicyJniBridge.windowssysWindowsWin32SystemGrouppolicyFreeGPOListA(pgpolist.rawAddress)

public actual fun freeGPOListW(pgpolist: ConstPtr<GroupPolicyObjectw>): Bool =
    WindowsWin32SystemGrouppolicyJniBridge.windowssysWindowsWin32SystemGrouppolicyFreeGPOListW(pgpolist.rawAddress)

public actual fun generateGPNotification(bmachine: Bool, lpwszmgmtproduct: Pcwstr, dwmgmtproductoptions: UInt): UInt =
    WindowsWin32SystemGrouppolicyJniBridge.windowssysWindowsWin32SystemGrouppolicyGenerateGPNotification(bmachine, lpwszmgmtproduct.rawAddress, dwmgmtproductoptions.toInt()).toUInt()

public actual fun getAppliedGPOListA(dwflags: UInt, pmachinename: Pcstr, psiduser: Psid, pguidextension: ConstPtr<Guid>, ppgpolist: MutPtr<MutPtr<GroupPolicyObjecta>>): UInt =
    WindowsWin32SystemGrouppolicyJniBridge.windowssysWindowsWin32SystemGrouppolicyGetAppliedGPOListA(dwflags.toInt(), pmachinename.rawAddress, psiduser.rawAddress, pguidextension.rawAddress, ppgpolist.rawAddress).toUInt()

public actual fun getAppliedGPOListW(dwflags: UInt, pmachinename: Pcwstr, psiduser: Psid, pguidextension: ConstPtr<Guid>, ppgpolist: MutPtr<MutPtr<GroupPolicyObjectw>>): UInt =
    WindowsWin32SystemGrouppolicyJniBridge.windowssysWindowsWin32SystemGrouppolicyGetAppliedGPOListW(dwflags.toInt(), pmachinename.rawAddress, psiduser.rawAddress, pguidextension.rawAddress, ppgpolist.rawAddress).toUInt()

public actual fun getGPOListA(htoken: Handle, lpname: Pcstr, lphostname: Pcstr, lpcomputername: Pcstr, dwflags: UInt, pgpolist: MutPtr<MutPtr<GroupPolicyObjecta>>): Bool =
    WindowsWin32SystemGrouppolicyJniBridge.windowssysWindowsWin32SystemGrouppolicyGetGPOListA(htoken.rawAddress, lpname.rawAddress, lphostname.rawAddress, lpcomputername.rawAddress, dwflags.toInt(), pgpolist.rawAddress)

public actual fun getGPOListW(htoken: Handle, lpname: Pcwstr, lphostname: Pcwstr, lpcomputername: Pcwstr, dwflags: UInt, pgpolist: MutPtr<MutPtr<GroupPolicyObjectw>>): Bool =
    WindowsWin32SystemGrouppolicyJniBridge.windowssysWindowsWin32SystemGrouppolicyGetGPOListW(htoken.rawAddress, lpname.rawAddress, lphostname.rawAddress, lpcomputername.rawAddress, dwflags.toInt(), pgpolist.rawAddress)

public actual fun getLocalManagedApplicationData(productcode: Pcwstr, displayname: MutPtr<Pwstr>, supporturl: MutPtr<Pwstr>) {
    WindowsWin32SystemGrouppolicyJniBridge.windowssysWindowsWin32SystemGrouppolicyGetLocalManagedApplicationData(productcode.rawAddress, displayname.rawAddress, supporturl.rawAddress)
}

public actual fun getLocalManagedApplications(buserapps: Bool, pdwapps: MutPtr<UInt>, prglocalapps: MutPtr<MutPtr<Localmanagedapplication>>): UInt =
    WindowsWin32SystemGrouppolicyJniBridge.windowssysWindowsWin32SystemGrouppolicyGetLocalManagedApplications(buserapps, pdwapps.rawAddress, prglocalapps.rawAddress).toUInt()

public actual fun getManagedApplicationCategories(dwreserved: UInt, pappcategory: MutPtr<Appcategoryinfolist>): UInt =
    WindowsWin32SystemGrouppolicyJniBridge.windowssysWindowsWin32SystemGrouppolicyGetManagedApplicationCategories(dwreserved.toInt(), pappcategory.rawAddress).toUInt()

public actual fun getManagedApplications(pcategory: ConstPtr<Guid>, dwqueryflags: UInt, dwinfolevel: UInt, pdwapps: MutPtr<UInt>, prgmanagedapps: MutPtr<MutPtr<Managedapplication>>): UInt =
    WindowsWin32SystemGrouppolicyJniBridge.windowssysWindowsWin32SystemGrouppolicyGetManagedApplications(pcategory.rawAddress, dwqueryflags.toInt(), dwinfolevel.toInt(), pdwapps.rawAddress, prgmanagedapps.rawAddress).toUInt()

public actual fun importRSoPData(lpnamespace: Pcwstr, lpfilename: Pcwstr): Hresult =
    WindowsWin32SystemGrouppolicyJniBridge.windowssysWindowsWin32SystemGrouppolicyImportRSoPData(lpnamespace.rawAddress, lpfilename.rawAddress)

public actual fun installApplication(pinstallinfo: ConstPtr<Installdata>): UInt =
    WindowsWin32SystemGrouppolicyJniBridge.windowssysWindowsWin32SystemGrouppolicyInstallApplication(pinstallinfo.rawAddress).toUInt()

public actual fun leaveCriticalPolicySection(hsection: Handle): Bool =
    WindowsWin32SystemGrouppolicyJniBridge.windowssysWindowsWin32SystemGrouppolicyLeaveCriticalPolicySection(hsection.rawAddress)

public actual fun processGroupPolicyCompleted(extensionid: ConstPtr<Guid>, pasynchandle: ULong, dwstatus: UInt): UInt =
    WindowsWin32SystemGrouppolicyJniBridge.windowssysWindowsWin32SystemGrouppolicyProcessGroupPolicyCompleted(extensionid.rawAddress, pasynchandle.toLong(), dwstatus.toInt()).toUInt()

public actual fun processGroupPolicyCompletedEx(extensionid: ConstPtr<Guid>, pasynchandle: ULong, dwstatus: UInt, rsopstatus: Hresult): UInt =
    WindowsWin32SystemGrouppolicyJniBridge.windowssysWindowsWin32SystemGrouppolicyProcessGroupPolicyCompletedEx(extensionid.rawAddress, pasynchandle.toLong(), dwstatus.toInt(), rsopstatus).toUInt()

public actual fun refreshPolicy(bmachine: Bool): Bool =
    WindowsWin32SystemGrouppolicyJniBridge.windowssysWindowsWin32SystemGrouppolicyRefreshPolicy(bmachine)

public actual fun refreshPolicyEx(bmachine: Bool, dwoptions: UInt): Bool =
    WindowsWin32SystemGrouppolicyJniBridge.windowssysWindowsWin32SystemGrouppolicyRefreshPolicyEx(bmachine, dwoptions.toInt())

public actual fun registerGPNotification(hevent: Handle, bmachine: Bool): Bool =
    WindowsWin32SystemGrouppolicyJniBridge.windowssysWindowsWin32SystemGrouppolicyRegisterGPNotification(hevent.rawAddress, bmachine)

public actual fun rsopAccessCheckByType(psecuritydescriptor: PsecurityDescriptor, pprincipalselfsid: Psid, prsoptoken: ConstPtr<CVoid>, dwdesiredaccessmask: UInt, pobjecttypelist: ConstPtr<ObjectTypeList>, objecttypelistlength: UInt, pgenericmapping: ConstPtr<GenericMapping>, pprivilegeset: ConstPtr<PrivilegeSet>, pdwprivilegesetlength: ConstPtr<UInt>, pdwgrantedaccessmask: MutPtr<UInt>, pbaccessstatus: MutPtr<Bool>): Hresult =
    WindowsWin32SystemGrouppolicyJniBridge.windowssysWindowsWin32SystemGrouppolicyRsopAccessCheckByType(psecuritydescriptor.rawAddress, pprincipalselfsid.rawAddress, prsoptoken.rawAddress, dwdesiredaccessmask.toInt(), pobjecttypelist.rawAddress, objecttypelistlength.toInt(), pgenericmapping.rawAddress, pprivilegeset.rawAddress, pdwprivilegesetlength.rawAddress, pdwgrantedaccessmask.rawAddress, pbaccessstatus.rawAddress)

public actual fun rsopFileAccessCheck(pszfilename: Pcwstr, prsoptoken: ConstPtr<CVoid>, dwdesiredaccessmask: UInt, pdwgrantedaccessmask: MutPtr<UInt>, pbaccessstatus: MutPtr<Bool>): Hresult =
    WindowsWin32SystemGrouppolicyJniBridge.windowssysWindowsWin32SystemGrouppolicyRsopFileAccessCheck(pszfilename.rawAddress, prsoptoken.rawAddress, dwdesiredaccessmask.toInt(), pdwgrantedaccessmask.rawAddress, pbaccessstatus.rawAddress)

public actual fun rsopResetPolicySettingStatus(dwflags: UInt, pservices: MutPtr<CVoid>, psettinginstance: MutPtr<CVoid>): Hresult =
    WindowsWin32SystemGrouppolicyJniBridge.windowssysWindowsWin32SystemGrouppolicyRsopResetPolicySettingStatus(dwflags.toInt(), pservices.rawAddress, psettinginstance.rawAddress)

public actual fun rsopSetPolicySettingStatus(dwflags: UInt, pservices: MutPtr<CVoid>, psettinginstance: MutPtr<CVoid>, ninfo: UInt, pstatus: ConstPtr<Policysettingstatusinfo>): Hresult =
    WindowsWin32SystemGrouppolicyJniBridge.windowssysWindowsWin32SystemGrouppolicyRsopSetPolicySettingStatus(dwflags.toInt(), pservices.rawAddress, psettinginstance.rawAddress, ninfo.toInt(), pstatus.rawAddress)

public actual fun uninstallApplication(productcode: Pcwstr, dwstatus: UInt): UInt =
    WindowsWin32SystemGrouppolicyJniBridge.windowssysWindowsWin32SystemGrouppolicyUninstallApplication(productcode.rawAddress, dwstatus.toInt()).toUInt()

public actual fun unregisterGPNotification(hevent: Handle): Bool =
    WindowsWin32SystemGrouppolicyJniBridge.windowssysWindowsWin32SystemGrouppolicyUnregisterGPNotification(hevent.rawAddress)
