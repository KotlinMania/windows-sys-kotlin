@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.services

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.ObjectSecurityInformation
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.system.registry.Hkey

private object WindowsWin32SystemServicesJniBridge {
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
        val stream = WindowsWin32SystemServicesJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun windowssysWindowsWin32SystemServicesChangeServiceConfig2A(hservice: Long, dwinfolevel: Int, lpinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemServicesChangeServiceConfig2W(hservice: Long, dwinfolevel: Int, lpinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemServicesChangeServiceConfigA(hservice: Long, dwservicetype: Int, dwstarttype: Int, dwerrorcontrol: Int, lpbinarypathname: Long, lploadordergroup: Long, lpdwtagid: Long, lpdependencies: Long, lpservicestartname: Long, lppassword: Long, lpdisplayname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemServicesChangeServiceConfigW(hservice: Long, dwservicetype: Int, dwstarttype: Int, dwerrorcontrol: Int, lpbinarypathname: Long, lploadordergroup: Long, lpdwtagid: Long, lpdependencies: Long, lpservicestartname: Long, lppassword: Long, lpdisplayname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemServicesCloseServiceHandle(hscobject: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemServicesControlService(hservice: Long, dwcontrol: Int, lpservicestatus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemServicesControlServiceExA(hservice: Long, dwcontrol: Int, dwinfolevel: Int, pcontrolparams: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemServicesControlServiceExW(hservice: Long, dwcontrol: Int, dwinfolevel: Int, pcontrolparams: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemServicesCreateServiceA(hscmanager: Long, lpservicename: Long, lpdisplayname: Long, dwdesiredaccess: Int, dwservicetype: Int, dwstarttype: Int, dwerrorcontrol: Int, lpbinarypathname: Long, lploadordergroup: Long, lpdwtagid: Long, lpdependencies: Long, lpservicestartname: Long, lppassword: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemServicesCreateServiceW(hscmanager: Long, lpservicename: Long, lpdisplayname: Long, dwdesiredaccess: Int, dwservicetype: Int, dwstarttype: Int, dwerrorcontrol: Int, lpbinarypathname: Long, lploadordergroup: Long, lpdwtagid: Long, lpdependencies: Long, lpservicestartname: Long, lppassword: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemServicesDeleteService(hservice: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemServicesEnumDependentServicesA(hservice: Long, dwservicestate: Int, lpservices: Long, cbbufsize: Int, pcbbytesneeded: Long, lpservicesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemServicesEnumDependentServicesW(hservice: Long, dwservicestate: Int, lpservices: Long, cbbufsize: Int, pcbbytesneeded: Long, lpservicesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemServicesEnumServicesStatusA(hscmanager: Long, dwservicetype: Int, dwservicestate: Int, lpservices: Long, cbbufsize: Int, pcbbytesneeded: Long, lpservicesreturned: Long, lpresumehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemServicesEnumServicesStatusExA(hscmanager: Long, infolevel: Int, dwservicetype: Int, dwservicestate: Int, lpservices: Long, cbbufsize: Int, pcbbytesneeded: Long, lpservicesreturned: Long, lpresumehandle: Long, pszgroupname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemServicesEnumServicesStatusExW(hscmanager: Long, infolevel: Int, dwservicetype: Int, dwservicestate: Int, lpservices: Long, cbbufsize: Int, pcbbytesneeded: Long, lpservicesreturned: Long, lpresumehandle: Long, pszgroupname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemServicesEnumServicesStatusW(hscmanager: Long, dwservicetype: Int, dwservicestate: Int, lpservices: Long, cbbufsize: Int, pcbbytesneeded: Long, lpservicesreturned: Long, lpresumehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemServicesGetServiceDirectory(hservicestatus: Long, edirectorytype: Int, lppathbuffer: Long, cchpathbufferlength: Int, lpcchrequiredbufferlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemServicesGetServiceDisplayNameA(hscmanager: Long, lpservicename: Long, lpdisplayname: Long, lpcchbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemServicesGetServiceDisplayNameW(hscmanager: Long, lpservicename: Long, lpdisplayname: Long, lpcchbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemServicesGetServiceKeyNameA(hscmanager: Long, lpdisplayname: Long, lpservicename: Long, lpcchbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemServicesGetServiceKeyNameW(hscmanager: Long, lpdisplayname: Long, lpservicename: Long, lpcchbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemServicesGetServiceRegistryStateKey(servicestatushandle: Long, statetype: Int, accessmask: Int, servicestatekey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemServicesGetSharedServiceDirectory(servicehandle: Long, directorytype: Int, pathbuffer: Long, pathbufferlength: Int, requiredbufferlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemServicesGetSharedServiceRegistryStateKey(servicehandle: Long, statetype: Int, accessmask: Int, servicestatekey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemServicesLockServiceDatabase(hscmanager: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemServicesNotifyBootConfigStatus(bootacceptable: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemServicesNotifyServiceStatusChangeA(hservice: Long, dwnotifymask: Int, pnotifybuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemServicesNotifyServiceStatusChangeW(hservice: Long, dwnotifymask: Int, pnotifybuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemServicesOpenSCManagerA(lpmachinename: Long, lpdatabasename: Long, dwdesiredaccess: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemServicesOpenSCManagerW(lpmachinename: Long, lpdatabasename: Long, dwdesiredaccess: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemServicesOpenServiceA(hscmanager: Long, lpservicename: Long, dwdesiredaccess: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemServicesOpenServiceW(hscmanager: Long, lpservicename: Long, dwdesiredaccess: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemServicesQueryServiceConfig2A(hservice: Long, dwinfolevel: Int, lpbuffer: Long, cbbufsize: Int, pcbbytesneeded: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemServicesQueryServiceConfig2W(hservice: Long, dwinfolevel: Int, lpbuffer: Long, cbbufsize: Int, pcbbytesneeded: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemServicesQueryServiceConfigA(hservice: Long, lpserviceconfig: Long, cbbufsize: Int, pcbbytesneeded: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemServicesQueryServiceConfigW(hservice: Long, lpserviceconfig: Long, cbbufsize: Int, pcbbytesneeded: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemServicesQueryServiceDynamicInformation(hservicestatus: Long, dwinfolevel: Int, ppdynamicinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemServicesQueryServiceLockStatusA(hscmanager: Long, lplockstatus: Long, cbbufsize: Int, pcbbytesneeded: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemServicesQueryServiceLockStatusW(hscmanager: Long, lplockstatus: Long, cbbufsize: Int, pcbbytesneeded: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemServicesQueryServiceObjectSecurity(hservice: Long, dwsecurityinformation: Int, lpsecuritydescriptor: Long, cbbufsize: Int, pcbbytesneeded: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemServicesQueryServiceStatus(hservice: Long, lpservicestatus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemServicesQueryServiceStatusEx(hservice: Long, infolevel: Int, lpbuffer: Long, cbbufsize: Int, pcbbytesneeded: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemServicesRegisterServiceCtrlHandlerA(lpservicename: Long, lphandlerproc: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemServicesRegisterServiceCtrlHandlerExA(lpservicename: Long, lphandlerproc: Long, lpcontext: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemServicesRegisterServiceCtrlHandlerExW(lpservicename: Long, lphandlerproc: Long, lpcontext: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemServicesRegisterServiceCtrlHandlerW(lpservicename: Long, lphandlerproc: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemServicesSetServiceBits(hservicestatus: Long, dwservicebits: Int, bsetbitson: Int, bupdateimmediately: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemServicesSetServiceObjectSecurity(hservice: Long, dwsecurityinformation: Int, lpsecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemServicesSetServiceStatus(hservicestatus: Long, lpservicestatus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemServicesStartServiceA(hservice: Long, dwnumserviceargs: Int, lpserviceargvectors: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemServicesStartServiceCtrlDispatcherA(lpservicestarttable: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemServicesStartServiceCtrlDispatcherW(lpservicestarttable: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemServicesStartServiceW(hservice: Long, dwnumserviceargs: Int, lpserviceargvectors: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemServicesSubscribeServiceChangeNotifications(hservice: Long, eeventtype: Int, pcallback: Long, pcallbackcontext: Long, psubscription: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemServicesUnlockServiceDatabase(sclock: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemServicesUnsubscribeServiceChangeNotifications(psubscription: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemServicesWaitServiceState(hservice: Long, dwnotify: Int, dwtimeout: Int, hcancelevent: Long): Int
}

public actual fun changeServiceConfig2A(hservice: ScHandle, dwinfolevel: ServiceConfig, lpinfo: ConstPtr<CVoid>): Bool =
    WindowsWin32SystemServicesJniBridge.windowssysWindowsWin32SystemServicesChangeServiceConfig2A(hservice.rawAddress, dwinfolevel.toInt(), lpinfo.rawAddress)

public actual fun changeServiceConfig2W(hservice: ScHandle, dwinfolevel: ServiceConfig, lpinfo: ConstPtr<CVoid>): Bool =
    WindowsWin32SystemServicesJniBridge.windowssysWindowsWin32SystemServicesChangeServiceConfig2W(hservice.rawAddress, dwinfolevel.toInt(), lpinfo.rawAddress)

public actual fun changeServiceConfigA(hservice: ScHandle, dwservicetype: EnumServiceType, dwstarttype: ServiceStartType, dwerrorcontrol: ServiceError, lpbinarypathname: Pcstr, lploadordergroup: Pcstr, lpdwtagid: MutPtr<UInt>, lpdependencies: Pcstr, lpservicestartname: Pcstr, lppassword: Pcstr, lpdisplayname: Pcstr): Bool =
    WindowsWin32SystemServicesJniBridge.windowssysWindowsWin32SystemServicesChangeServiceConfigA(hservice.rawAddress, dwservicetype.toInt(), dwstarttype.toInt(), dwerrorcontrol.toInt(), lpbinarypathname.rawAddress, lploadordergroup.rawAddress, lpdwtagid.rawAddress, lpdependencies.rawAddress, lpservicestartname.rawAddress, lppassword.rawAddress, lpdisplayname.rawAddress)

public actual fun changeServiceConfigW(hservice: ScHandle, dwservicetype: EnumServiceType, dwstarttype: ServiceStartType, dwerrorcontrol: ServiceError, lpbinarypathname: Pcwstr, lploadordergroup: Pcwstr, lpdwtagid: MutPtr<UInt>, lpdependencies: Pcwstr, lpservicestartname: Pcwstr, lppassword: Pcwstr, lpdisplayname: Pcwstr): Bool =
    WindowsWin32SystemServicesJniBridge.windowssysWindowsWin32SystemServicesChangeServiceConfigW(hservice.rawAddress, dwservicetype.toInt(), dwstarttype.toInt(), dwerrorcontrol.toInt(), lpbinarypathname.rawAddress, lploadordergroup.rawAddress, lpdwtagid.rawAddress, lpdependencies.rawAddress, lpservicestartname.rawAddress, lppassword.rawAddress, lpdisplayname.rawAddress)

public actual fun closeServiceHandle(hscobject: ScHandle): Bool =
    WindowsWin32SystemServicesJniBridge.windowssysWindowsWin32SystemServicesCloseServiceHandle(hscobject.rawAddress)

public actual fun controlService(hservice: ScHandle, dwcontrol: UInt, lpservicestatus: MutPtr<ServiceStatus>): Bool =
    WindowsWin32SystemServicesJniBridge.windowssysWindowsWin32SystemServicesControlService(hservice.rawAddress, dwcontrol.toInt(), lpservicestatus.rawAddress)

public actual fun controlServiceExA(hservice: ScHandle, dwcontrol: UInt, dwinfolevel: UInt, pcontrolparams: MutPtr<CVoid>): Bool =
    WindowsWin32SystemServicesJniBridge.windowssysWindowsWin32SystemServicesControlServiceExA(hservice.rawAddress, dwcontrol.toInt(), dwinfolevel.toInt(), pcontrolparams.rawAddress)

public actual fun controlServiceExW(hservice: ScHandle, dwcontrol: UInt, dwinfolevel: UInt, pcontrolparams: MutPtr<CVoid>): Bool =
    WindowsWin32SystemServicesJniBridge.windowssysWindowsWin32SystemServicesControlServiceExW(hservice.rawAddress, dwcontrol.toInt(), dwinfolevel.toInt(), pcontrolparams.rawAddress)

public actual fun createServiceA(hscmanager: ScHandle, lpservicename: Pcstr, lpdisplayname: Pcstr, dwdesiredaccess: UInt, dwservicetype: EnumServiceType, dwstarttype: ServiceStartType, dwerrorcontrol: ServiceError, lpbinarypathname: Pcstr, lploadordergroup: Pcstr, lpdwtagid: MutPtr<UInt>, lpdependencies: Pcstr, lpservicestartname: Pcstr, lppassword: Pcstr): ScHandle =
    MutPtr(WindowsWin32SystemServicesJniBridge.windowssysWindowsWin32SystemServicesCreateServiceA(hscmanager.rawAddress, lpservicename.rawAddress, lpdisplayname.rawAddress, dwdesiredaccess.toInt(), dwservicetype.toInt(), dwstarttype.toInt(), dwerrorcontrol.toInt(), lpbinarypathname.rawAddress, lploadordergroup.rawAddress, lpdwtagid.rawAddress, lpdependencies.rawAddress, lpservicestartname.rawAddress, lppassword.rawAddress))

public actual fun createServiceW(hscmanager: ScHandle, lpservicename: Pcwstr, lpdisplayname: Pcwstr, dwdesiredaccess: UInt, dwservicetype: EnumServiceType, dwstarttype: ServiceStartType, dwerrorcontrol: ServiceError, lpbinarypathname: Pcwstr, lploadordergroup: Pcwstr, lpdwtagid: MutPtr<UInt>, lpdependencies: Pcwstr, lpservicestartname: Pcwstr, lppassword: Pcwstr): ScHandle =
    MutPtr(WindowsWin32SystemServicesJniBridge.windowssysWindowsWin32SystemServicesCreateServiceW(hscmanager.rawAddress, lpservicename.rawAddress, lpdisplayname.rawAddress, dwdesiredaccess.toInt(), dwservicetype.toInt(), dwstarttype.toInt(), dwerrorcontrol.toInt(), lpbinarypathname.rawAddress, lploadordergroup.rawAddress, lpdwtagid.rawAddress, lpdependencies.rawAddress, lpservicestartname.rawAddress, lppassword.rawAddress))

public actual fun deleteService(hservice: ScHandle): Bool =
    WindowsWin32SystemServicesJniBridge.windowssysWindowsWin32SystemServicesDeleteService(hservice.rawAddress)

public actual fun enumDependentServicesA(hservice: ScHandle, dwservicestate: EnumServiceState, lpservices: MutPtr<EnumServiceStatusa>, cbbufsize: UInt, pcbbytesneeded: MutPtr<UInt>, lpservicesreturned: MutPtr<UInt>): Bool =
    WindowsWin32SystemServicesJniBridge.windowssysWindowsWin32SystemServicesEnumDependentServicesA(hservice.rawAddress, dwservicestate.toInt(), lpservices.rawAddress, cbbufsize.toInt(), pcbbytesneeded.rawAddress, lpservicesreturned.rawAddress)

public actual fun enumDependentServicesW(hservice: ScHandle, dwservicestate: EnumServiceState, lpservices: MutPtr<EnumServiceStatusw>, cbbufsize: UInt, pcbbytesneeded: MutPtr<UInt>, lpservicesreturned: MutPtr<UInt>): Bool =
    WindowsWin32SystemServicesJniBridge.windowssysWindowsWin32SystemServicesEnumDependentServicesW(hservice.rawAddress, dwservicestate.toInt(), lpservices.rawAddress, cbbufsize.toInt(), pcbbytesneeded.rawAddress, lpservicesreturned.rawAddress)

public actual fun enumServicesStatusA(hscmanager: ScHandle, dwservicetype: EnumServiceType, dwservicestate: EnumServiceState, lpservices: MutPtr<EnumServiceStatusa>, cbbufsize: UInt, pcbbytesneeded: MutPtr<UInt>, lpservicesreturned: MutPtr<UInt>, lpresumehandle: MutPtr<UInt>): Bool =
    WindowsWin32SystemServicesJniBridge.windowssysWindowsWin32SystemServicesEnumServicesStatusA(hscmanager.rawAddress, dwservicetype.toInt(), dwservicestate.toInt(), lpservices.rawAddress, cbbufsize.toInt(), pcbbytesneeded.rawAddress, lpservicesreturned.rawAddress, lpresumehandle.rawAddress)

public actual fun enumServicesStatusExA(hscmanager: ScHandle, infolevel: ScEnumType, dwservicetype: EnumServiceType, dwservicestate: EnumServiceState, lpservices: MutPtr<UByte>, cbbufsize: UInt, pcbbytesneeded: MutPtr<UInt>, lpservicesreturned: MutPtr<UInt>, lpresumehandle: MutPtr<UInt>, pszgroupname: Pcstr): Bool =
    WindowsWin32SystemServicesJniBridge.windowssysWindowsWin32SystemServicesEnumServicesStatusExA(hscmanager.rawAddress, infolevel, dwservicetype.toInt(), dwservicestate.toInt(), lpservices.rawAddress, cbbufsize.toInt(), pcbbytesneeded.rawAddress, lpservicesreturned.rawAddress, lpresumehandle.rawAddress, pszgroupname.rawAddress)

public actual fun enumServicesStatusExW(hscmanager: ScHandle, infolevel: ScEnumType, dwservicetype: EnumServiceType, dwservicestate: EnumServiceState, lpservices: MutPtr<UByte>, cbbufsize: UInt, pcbbytesneeded: MutPtr<UInt>, lpservicesreturned: MutPtr<UInt>, lpresumehandle: MutPtr<UInt>, pszgroupname: Pcwstr): Bool =
    WindowsWin32SystemServicesJniBridge.windowssysWindowsWin32SystemServicesEnumServicesStatusExW(hscmanager.rawAddress, infolevel, dwservicetype.toInt(), dwservicestate.toInt(), lpservices.rawAddress, cbbufsize.toInt(), pcbbytesneeded.rawAddress, lpservicesreturned.rawAddress, lpresumehandle.rawAddress, pszgroupname.rawAddress)

public actual fun enumServicesStatusW(hscmanager: ScHandle, dwservicetype: EnumServiceType, dwservicestate: EnumServiceState, lpservices: MutPtr<EnumServiceStatusw>, cbbufsize: UInt, pcbbytesneeded: MutPtr<UInt>, lpservicesreturned: MutPtr<UInt>, lpresumehandle: MutPtr<UInt>): Bool =
    WindowsWin32SystemServicesJniBridge.windowssysWindowsWin32SystemServicesEnumServicesStatusW(hscmanager.rawAddress, dwservicetype.toInt(), dwservicestate.toInt(), lpservices.rawAddress, cbbufsize.toInt(), pcbbytesneeded.rawAddress, lpservicesreturned.rawAddress, lpresumehandle.rawAddress)

public actual fun getServiceDirectory(hservicestatus: ServiceStatusHandle, edirectorytype: ServiceDirectoryType, lppathbuffer: Pwstr, cchpathbufferlength: UInt, lpcchrequiredbufferlength: MutPtr<UInt>): UInt =
    WindowsWin32SystemServicesJniBridge.windowssysWindowsWin32SystemServicesGetServiceDirectory(hservicestatus.rawAddress, edirectorytype, lppathbuffer.rawAddress, cchpathbufferlength.toInt(), lpcchrequiredbufferlength.rawAddress).toUInt()

public actual fun getServiceDisplayNameA(hscmanager: ScHandle, lpservicename: Pcstr, lpdisplayname: Pstr, lpcchbuffer: MutPtr<UInt>): Bool =
    WindowsWin32SystemServicesJniBridge.windowssysWindowsWin32SystemServicesGetServiceDisplayNameA(hscmanager.rawAddress, lpservicename.rawAddress, lpdisplayname.rawAddress, lpcchbuffer.rawAddress)

public actual fun getServiceDisplayNameW(hscmanager: ScHandle, lpservicename: Pcwstr, lpdisplayname: Pwstr, lpcchbuffer: MutPtr<UInt>): Bool =
    WindowsWin32SystemServicesJniBridge.windowssysWindowsWin32SystemServicesGetServiceDisplayNameW(hscmanager.rawAddress, lpservicename.rawAddress, lpdisplayname.rawAddress, lpcchbuffer.rawAddress)

public actual fun getServiceKeyNameA(hscmanager: ScHandle, lpdisplayname: Pcstr, lpservicename: Pstr, lpcchbuffer: MutPtr<UInt>): Bool =
    WindowsWin32SystemServicesJniBridge.windowssysWindowsWin32SystemServicesGetServiceKeyNameA(hscmanager.rawAddress, lpdisplayname.rawAddress, lpservicename.rawAddress, lpcchbuffer.rawAddress)

public actual fun getServiceKeyNameW(hscmanager: ScHandle, lpdisplayname: Pcwstr, lpservicename: Pwstr, lpcchbuffer: MutPtr<UInt>): Bool =
    WindowsWin32SystemServicesJniBridge.windowssysWindowsWin32SystemServicesGetServiceKeyNameW(hscmanager.rawAddress, lpdisplayname.rawAddress, lpservicename.rawAddress, lpcchbuffer.rawAddress)

public actual fun getServiceRegistryStateKey(servicestatushandle: ServiceStatusHandle, statetype: ServiceRegistryStateType, accessmask: UInt, servicestatekey: MutPtr<Hkey>): UInt =
    WindowsWin32SystemServicesJniBridge.windowssysWindowsWin32SystemServicesGetServiceRegistryStateKey(servicestatushandle.rawAddress, statetype, accessmask.toInt(), servicestatekey.rawAddress).toUInt()

public actual fun getSharedServiceDirectory(servicehandle: ScHandle, directorytype: ServiceSharedDirectoryType, pathbuffer: Pwstr, pathbufferlength: UInt, requiredbufferlength: MutPtr<UInt>): UInt =
    WindowsWin32SystemServicesJniBridge.windowssysWindowsWin32SystemServicesGetSharedServiceDirectory(servicehandle.rawAddress, directorytype, pathbuffer.rawAddress, pathbufferlength.toInt(), requiredbufferlength.rawAddress).toUInt()

public actual fun getSharedServiceRegistryStateKey(servicehandle: ScHandle, statetype: ServiceSharedRegistryStateType, accessmask: UInt, servicestatekey: MutPtr<Hkey>): UInt =
    WindowsWin32SystemServicesJniBridge.windowssysWindowsWin32SystemServicesGetSharedServiceRegistryStateKey(servicehandle.rawAddress, statetype, accessmask.toInt(), servicestatekey.rawAddress).toUInt()

public actual fun lockServiceDatabase(hscmanager: ScHandle): MutPtr<CVoid> =
    MutPtr(WindowsWin32SystemServicesJniBridge.windowssysWindowsWin32SystemServicesLockServiceDatabase(hscmanager.rawAddress))

public actual fun notifyBootConfigStatus(bootacceptable: Bool): Bool =
    WindowsWin32SystemServicesJniBridge.windowssysWindowsWin32SystemServicesNotifyBootConfigStatus(bootacceptable)

public actual fun notifyServiceStatusChangeA(hservice: ScHandle, dwnotifymask: ServiceNotify, pnotifybuffer: ConstPtr<ServiceNotify2a>): UInt =
    WindowsWin32SystemServicesJniBridge.windowssysWindowsWin32SystemServicesNotifyServiceStatusChangeA(hservice.rawAddress, dwnotifymask.toInt(), pnotifybuffer.rawAddress).toUInt()

public actual fun notifyServiceStatusChangeW(hservice: ScHandle, dwnotifymask: ServiceNotify, pnotifybuffer: ConstPtr<ServiceNotify2w>): UInt =
    WindowsWin32SystemServicesJniBridge.windowssysWindowsWin32SystemServicesNotifyServiceStatusChangeW(hservice.rawAddress, dwnotifymask.toInt(), pnotifybuffer.rawAddress).toUInt()

public actual fun openSCManagerA(lpmachinename: Pcstr, lpdatabasename: Pcstr, dwdesiredaccess: UInt): ScHandle =
    MutPtr(WindowsWin32SystemServicesJniBridge.windowssysWindowsWin32SystemServicesOpenSCManagerA(lpmachinename.rawAddress, lpdatabasename.rawAddress, dwdesiredaccess.toInt()))

public actual fun openSCManagerW(lpmachinename: Pcwstr, lpdatabasename: Pcwstr, dwdesiredaccess: UInt): ScHandle =
    MutPtr(WindowsWin32SystemServicesJniBridge.windowssysWindowsWin32SystemServicesOpenSCManagerW(lpmachinename.rawAddress, lpdatabasename.rawAddress, dwdesiredaccess.toInt()))

public actual fun openServiceA(hscmanager: ScHandle, lpservicename: Pcstr, dwdesiredaccess: UInt): ScHandle =
    MutPtr(WindowsWin32SystemServicesJniBridge.windowssysWindowsWin32SystemServicesOpenServiceA(hscmanager.rawAddress, lpservicename.rawAddress, dwdesiredaccess.toInt()))

public actual fun openServiceW(hscmanager: ScHandle, lpservicename: Pcwstr, dwdesiredaccess: UInt): ScHandle =
    MutPtr(WindowsWin32SystemServicesJniBridge.windowssysWindowsWin32SystemServicesOpenServiceW(hscmanager.rawAddress, lpservicename.rawAddress, dwdesiredaccess.toInt()))

public actual fun queryServiceConfig2A(hservice: ScHandle, dwinfolevel: ServiceConfig, lpbuffer: MutPtr<UByte>, cbbufsize: UInt, pcbbytesneeded: MutPtr<UInt>): Bool =
    WindowsWin32SystemServicesJniBridge.windowssysWindowsWin32SystemServicesQueryServiceConfig2A(hservice.rawAddress, dwinfolevel.toInt(), lpbuffer.rawAddress, cbbufsize.toInt(), pcbbytesneeded.rawAddress)

public actual fun queryServiceConfig2W(hservice: ScHandle, dwinfolevel: ServiceConfig, lpbuffer: MutPtr<UByte>, cbbufsize: UInt, pcbbytesneeded: MutPtr<UInt>): Bool =
    WindowsWin32SystemServicesJniBridge.windowssysWindowsWin32SystemServicesQueryServiceConfig2W(hservice.rawAddress, dwinfolevel.toInt(), lpbuffer.rawAddress, cbbufsize.toInt(), pcbbytesneeded.rawAddress)

public actual fun queryServiceConfigA(hservice: ScHandle, lpserviceconfig: MutPtr<QueryServiceConfiga>, cbbufsize: UInt, pcbbytesneeded: MutPtr<UInt>): Bool =
    WindowsWin32SystemServicesJniBridge.windowssysWindowsWin32SystemServicesQueryServiceConfigA(hservice.rawAddress, lpserviceconfig.rawAddress, cbbufsize.toInt(), pcbbytesneeded.rawAddress)

public actual fun queryServiceConfigW(hservice: ScHandle, lpserviceconfig: MutPtr<QueryServiceConfigw>, cbbufsize: UInt, pcbbytesneeded: MutPtr<UInt>): Bool =
    WindowsWin32SystemServicesJniBridge.windowssysWindowsWin32SystemServicesQueryServiceConfigW(hservice.rawAddress, lpserviceconfig.rawAddress, cbbufsize.toInt(), pcbbytesneeded.rawAddress)

public actual fun queryServiceDynamicInformation(hservicestatus: ServiceStatusHandle, dwinfolevel: UInt, ppdynamicinfo: MutPtr<MutPtr<CVoid>>): Bool =
    WindowsWin32SystemServicesJniBridge.windowssysWindowsWin32SystemServicesQueryServiceDynamicInformation(hservicestatus.rawAddress, dwinfolevel.toInt(), ppdynamicinfo.rawAddress)

public actual fun queryServiceLockStatusA(hscmanager: ScHandle, lplockstatus: MutPtr<QueryServiceLockStatusa>, cbbufsize: UInt, pcbbytesneeded: MutPtr<UInt>): Bool =
    WindowsWin32SystemServicesJniBridge.windowssysWindowsWin32SystemServicesQueryServiceLockStatusA(hscmanager.rawAddress, lplockstatus.rawAddress, cbbufsize.toInt(), pcbbytesneeded.rawAddress)

public actual fun queryServiceLockStatusW(hscmanager: ScHandle, lplockstatus: MutPtr<QueryServiceLockStatusw>, cbbufsize: UInt, pcbbytesneeded: MutPtr<UInt>): Bool =
    WindowsWin32SystemServicesJniBridge.windowssysWindowsWin32SystemServicesQueryServiceLockStatusW(hscmanager.rawAddress, lplockstatus.rawAddress, cbbufsize.toInt(), pcbbytesneeded.rawAddress)

public actual fun queryServiceObjectSecurity(hservice: ScHandle, dwsecurityinformation: UInt, lpsecuritydescriptor: PsecurityDescriptor, cbbufsize: UInt, pcbbytesneeded: MutPtr<UInt>): Bool =
    WindowsWin32SystemServicesJniBridge.windowssysWindowsWin32SystemServicesQueryServiceObjectSecurity(hservice.rawAddress, dwsecurityinformation.toInt(), lpsecuritydescriptor.rawAddress, cbbufsize.toInt(), pcbbytesneeded.rawAddress)

public actual fun queryServiceStatus(hservice: ScHandle, lpservicestatus: MutPtr<ServiceStatus>): Bool =
    WindowsWin32SystemServicesJniBridge.windowssysWindowsWin32SystemServicesQueryServiceStatus(hservice.rawAddress, lpservicestatus.rawAddress)

public actual fun queryServiceStatusEx(hservice: ScHandle, infolevel: ScStatusType, lpbuffer: MutPtr<UByte>, cbbufsize: UInt, pcbbytesneeded: MutPtr<UInt>): Bool =
    WindowsWin32SystemServicesJniBridge.windowssysWindowsWin32SystemServicesQueryServiceStatusEx(hservice.rawAddress, infolevel, lpbuffer.rawAddress, cbbufsize.toInt(), pcbbytesneeded.rawAddress)

public actual fun registerServiceCtrlHandlerA(lpservicename: Pcstr, lphandlerproc: LphandlerFunction): ServiceStatusHandle =
    MutPtr(WindowsWin32SystemServicesJniBridge.windowssysWindowsWin32SystemServicesRegisterServiceCtrlHandlerA(lpservicename.rawAddress, 0L))

public actual fun registerServiceCtrlHandlerExA(lpservicename: Pcstr, lphandlerproc: LphandlerFunctionEx, lpcontext: ConstPtr<CVoid>): ServiceStatusHandle =
    MutPtr(WindowsWin32SystemServicesJniBridge.windowssysWindowsWin32SystemServicesRegisterServiceCtrlHandlerExA(lpservicename.rawAddress, 0L, lpcontext.rawAddress))

public actual fun registerServiceCtrlHandlerExW(lpservicename: Pcwstr, lphandlerproc: LphandlerFunctionEx, lpcontext: ConstPtr<CVoid>): ServiceStatusHandle =
    MutPtr(WindowsWin32SystemServicesJniBridge.windowssysWindowsWin32SystemServicesRegisterServiceCtrlHandlerExW(lpservicename.rawAddress, 0L, lpcontext.rawAddress))

public actual fun registerServiceCtrlHandlerW(lpservicename: Pcwstr, lphandlerproc: LphandlerFunction): ServiceStatusHandle =
    MutPtr(WindowsWin32SystemServicesJniBridge.windowssysWindowsWin32SystemServicesRegisterServiceCtrlHandlerW(lpservicename.rawAddress, 0L))

public actual fun setServiceBits(hservicestatus: ServiceStatusHandle, dwservicebits: UInt, bsetbitson: Bool, bupdateimmediately: Bool): Bool =
    WindowsWin32SystemServicesJniBridge.windowssysWindowsWin32SystemServicesSetServiceBits(hservicestatus.rawAddress, dwservicebits.toInt(), bsetbitson, bupdateimmediately)

public actual fun setServiceObjectSecurity(hservice: ScHandle, dwsecurityinformation: ObjectSecurityInformation, lpsecuritydescriptor: PsecurityDescriptor): Bool =
    WindowsWin32SystemServicesJniBridge.windowssysWindowsWin32SystemServicesSetServiceObjectSecurity(hservice.rawAddress, dwsecurityinformation.toInt(), lpsecuritydescriptor.rawAddress)

public actual fun setServiceStatus(hservicestatus: ServiceStatusHandle, lpservicestatus: ConstPtr<ServiceStatus>): Bool =
    WindowsWin32SystemServicesJniBridge.windowssysWindowsWin32SystemServicesSetServiceStatus(hservicestatus.rawAddress, lpservicestatus.rawAddress)

public actual fun startServiceA(hservice: ScHandle, dwnumserviceargs: UInt, lpserviceargvectors: ConstPtr<Pcstr>): Bool =
    WindowsWin32SystemServicesJniBridge.windowssysWindowsWin32SystemServicesStartServiceA(hservice.rawAddress, dwnumserviceargs.toInt(), lpserviceargvectors.rawAddress)

public actual fun startServiceCtrlDispatcherA(lpservicestarttable: ConstPtr<ServiceTableEntrya>): Bool =
    WindowsWin32SystemServicesJniBridge.windowssysWindowsWin32SystemServicesStartServiceCtrlDispatcherA(lpservicestarttable.rawAddress)

public actual fun startServiceCtrlDispatcherW(lpservicestarttable: ConstPtr<ServiceTableEntryw>): Bool =
    WindowsWin32SystemServicesJniBridge.windowssysWindowsWin32SystemServicesStartServiceCtrlDispatcherW(lpservicestarttable.rawAddress)

public actual fun startServiceW(hservice: ScHandle, dwnumserviceargs: UInt, lpserviceargvectors: ConstPtr<Pcwstr>): Bool =
    WindowsWin32SystemServicesJniBridge.windowssysWindowsWin32SystemServicesStartServiceW(hservice.rawAddress, dwnumserviceargs.toInt(), lpserviceargvectors.rawAddress)

public actual fun subscribeServiceChangeNotifications(hservice: ScHandle, eeventtype: ScEventType, pcallback: PscNotificationCallback, pcallbackcontext: ConstPtr<CVoid>, psubscription: MutPtr<PscNotificationRegistration>): UInt =
    WindowsWin32SystemServicesJniBridge.windowssysWindowsWin32SystemServicesSubscribeServiceChangeNotifications(hservice.rawAddress, eeventtype, 0L, pcallbackcontext.rawAddress, psubscription.rawAddress).toUInt()

public actual fun unlockServiceDatabase(sclock: ConstPtr<CVoid>): Bool =
    WindowsWin32SystemServicesJniBridge.windowssysWindowsWin32SystemServicesUnlockServiceDatabase(sclock.rawAddress)

public actual fun unsubscribeServiceChangeNotifications(psubscription: PscNotificationRegistration) {
    WindowsWin32SystemServicesJniBridge.windowssysWindowsWin32SystemServicesUnsubscribeServiceChangeNotifications(psubscription)
}

public actual fun waitServiceState(hservice: ScHandle, dwnotify: UInt, dwtimeout: UInt, hcancelevent: Handle): UInt =
    WindowsWin32SystemServicesJniBridge.windowssysWindowsWin32SystemServicesWaitServiceState(hservice.rawAddress, dwnotify.toInt(), dwtimeout.toInt(), hcancelevent.rawAddress).toUInt()
