@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.services

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.ObjectSecurityInformation
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor

private object WindowsWin32SystemServicesJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_services_changeServiceConfig2A(hservice: Long, dwinfolevel: Int, lpinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_changeServiceConfig2W(hservice: Long, dwinfolevel: Int, lpinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_changeServiceConfigA(hservice: Long, dwservicetype: Int, dwstarttype: Int, dwerrorcontrol: Int, lpbinarypathname: Long, lploadordergroup: Long, lpdwtagid: Long, lpdependencies: Long, lpservicestartname: Long, lppassword: Long, lpdisplayname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_changeServiceConfigW(hservice: Long, dwservicetype: Int, dwstarttype: Int, dwerrorcontrol: Int, lpbinarypathname: Long, lploadordergroup: Long, lpdwtagid: Long, lpdependencies: Long, lpservicestartname: Long, lppassword: Long, lpdisplayname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_closeServiceHandle(hscobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_controlService(hservice: Long, dwcontrol: Int, lpservicestatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_controlServiceExA(hservice: Long, dwcontrol: Int, dwinfolevel: Int, pcontrolparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_controlServiceExW(hservice: Long, dwcontrol: Int, dwinfolevel: Int, pcontrolparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_createServiceA(hscmanager: Long, lpservicename: Long, lpdisplayname: Long, dwdesiredaccess: Int, dwservicetype: Int, dwstarttype: Int, dwerrorcontrol: Int, lpbinarypathname: Long, lploadordergroup: Long, lpdwtagid: Long, lpdependencies: Long, lpservicestartname: Long, lppassword: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_services_createServiceW(hscmanager: Long, lpservicename: Long, lpdisplayname: Long, dwdesiredaccess: Int, dwservicetype: Int, dwstarttype: Int, dwerrorcontrol: Int, lpbinarypathname: Long, lploadordergroup: Long, lpdwtagid: Long, lpdependencies: Long, lpservicestartname: Long, lppassword: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_services_deleteService(hservice: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_enumDependentServicesA(hservice: Long, dwservicestate: Int, lpservices: Long, cbbufsize: Int, pcbbytesneeded: Long, lpservicesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_enumDependentServicesW(hservice: Long, dwservicestate: Int, lpservices: Long, cbbufsize: Int, pcbbytesneeded: Long, lpservicesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_enumServicesStatusA(hscmanager: Long, dwservicetype: Int, dwservicestate: Int, lpservices: Long, cbbufsize: Int, pcbbytesneeded: Long, lpservicesreturned: Long, lpresumehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_enumServicesStatusExA(hscmanager: Long, infolevel: Int, dwservicetype: Int, dwservicestate: Int, lpservices: Long, cbbufsize: Int, pcbbytesneeded: Long, lpservicesreturned: Long, lpresumehandle: Long, pszgroupname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_enumServicesStatusExW(hscmanager: Long, infolevel: Int, dwservicetype: Int, dwservicestate: Int, lpservices: Long, cbbufsize: Int, pcbbytesneeded: Long, lpservicesreturned: Long, lpresumehandle: Long, pszgroupname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_enumServicesStatusW(hscmanager: Long, dwservicetype: Int, dwservicestate: Int, lpservices: Long, cbbufsize: Int, pcbbytesneeded: Long, lpservicesreturned: Long, lpresumehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_getServiceDirectory(hservicestatus: Long, edirectorytype: Int, lppathbuffer: Long, cchpathbufferlength: Int, lpcchrequiredbufferlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_getServiceDisplayNameA(hscmanager: Long, lpservicename: Long, lpdisplayname: Long, lpcchbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_getServiceDisplayNameW(hscmanager: Long, lpservicename: Long, lpdisplayname: Long, lpcchbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_getServiceKeyNameA(hscmanager: Long, lpdisplayname: Long, lpservicename: Long, lpcchbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_getServiceKeyNameW(hscmanager: Long, lpdisplayname: Long, lpservicename: Long, lpcchbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_getServiceRegistryStateKey(servicestatushandle: Long, statetype: Int, accessmask: Int, servicestatekey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_getSharedServiceDirectory(servicehandle: Long, directorytype: Int, pathbuffer: Long, pathbufferlength: Int, requiredbufferlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_getSharedServiceRegistryStateKey(servicehandle: Long, statetype: Int, accessmask: Int, servicestatekey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_lockServiceDatabase(hscmanager: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_services_notifyBootConfigStatus(bootacceptable: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_notifyServiceStatusChangeA(hservice: Long, dwnotifymask: Int, pnotifybuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_notifyServiceStatusChangeW(hservice: Long, dwnotifymask: Int, pnotifybuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_openSCManagerA(lpmachinename: Long, lpdatabasename: Long, dwdesiredaccess: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_services_openSCManagerW(lpmachinename: Long, lpdatabasename: Long, dwdesiredaccess: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_services_openServiceA(hscmanager: Long, lpservicename: Long, dwdesiredaccess: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_services_openServiceW(hscmanager: Long, lpservicename: Long, dwdesiredaccess: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_services_queryServiceConfig2A(hservice: Long, dwinfolevel: Int, lpbuffer: Long, cbbufsize: Int, pcbbytesneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_queryServiceConfig2W(hservice: Long, dwinfolevel: Int, lpbuffer: Long, cbbufsize: Int, pcbbytesneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_queryServiceConfigA(hservice: Long, lpserviceconfig: Long, cbbufsize: Int, pcbbytesneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_queryServiceConfigW(hservice: Long, lpserviceconfig: Long, cbbufsize: Int, pcbbytesneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_queryServiceDynamicInformation(hservicestatus: Long, dwinfolevel: Int, ppdynamicinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_queryServiceLockStatusA(hscmanager: Long, lplockstatus: Long, cbbufsize: Int, pcbbytesneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_queryServiceLockStatusW(hscmanager: Long, lplockstatus: Long, cbbufsize: Int, pcbbytesneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_queryServiceObjectSecurity(hservice: Long, dwsecurityinformation: Int, lpsecuritydescriptor: Long, cbbufsize: Int, pcbbytesneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_queryServiceStatus(hservice: Long, lpservicestatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_queryServiceStatusEx(hservice: Long, infolevel: Int, lpbuffer: Long, cbbufsize: Int, pcbbytesneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_registerServiceCtrlHandlerA(lpservicename: Long, lphandlerproc: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_services_registerServiceCtrlHandlerExA(lpservicename: Long, lphandlerproc: Long, lpcontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_services_registerServiceCtrlHandlerExW(lpservicename: Long, lphandlerproc: Long, lpcontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_services_registerServiceCtrlHandlerW(lpservicename: Long, lphandlerproc: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_services_setServiceBits(hservicestatus: Long, dwservicebits: Int, bsetbitson: Int, bupdateimmediately: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_setServiceObjectSecurity(hservice: Long, dwsecurityinformation: Int, lpsecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_setServiceStatus(hservicestatus: Long, lpservicestatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_startServiceA(hservice: Long, dwnumserviceargs: Int, lpserviceargvectors: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_startServiceCtrlDispatcherA(lpservicestarttable: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_startServiceCtrlDispatcherW(lpservicestarttable: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_startServiceW(hservice: Long, dwnumserviceargs: Int, lpserviceargvectors: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_subscribeServiceChangeNotifications(hservice: Long, eeventtype: Int, pcallback: Long, pcallbackcontext: Long, psubscription: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_unlockServiceDatabase(sclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_unsubscribeServiceChangeNotifications(psubscription: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_services_waitServiceState(hservice: Long, dwnotify: Int, dwtimeout: Int, hcancelevent: Long): Int
}

public actual fun changeServiceConfig2A(hservice: ScHandle, dwinfolevel: ServiceConfig, lpinfo: COpaquePointer?): Bool =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_changeServiceConfig2A((hservice?.value ?: 0L), dwinfolevel.toInt(), (lpinfo?.value ?: 0L))

public actual fun changeServiceConfig2W(hservice: ScHandle, dwinfolevel: ServiceConfig, lpinfo: COpaquePointer?): Bool =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_changeServiceConfig2W((hservice?.value ?: 0L), dwinfolevel.toInt(), (lpinfo?.value ?: 0L))

public actual fun changeServiceConfigA(hservice: ScHandle, dwservicetype: EnumServiceType, dwstarttype: ServiceStartType, dwerrorcontrol: ServiceError, lpbinarypathname: Pcstr, lploadordergroup: Pcstr, lpdwtagid: COpaquePointer?, lpdependencies: Pcstr, lpservicestartname: Pcstr, lppassword: Pcstr, lpdisplayname: Pcstr): Bool =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_changeServiceConfigA((hservice?.value ?: 0L), dwservicetype.toInt(), dwstarttype.toInt(), dwerrorcontrol.toInt(), (lpbinarypathname?.value ?: 0L), (lploadordergroup?.value ?: 0L), (lpdwtagid?.value ?: 0L), (lpdependencies?.value ?: 0L), (lpservicestartname?.value ?: 0L), (lppassword?.value ?: 0L), (lpdisplayname?.value ?: 0L))

public actual fun changeServiceConfigW(hservice: ScHandle, dwservicetype: EnumServiceType, dwstarttype: ServiceStartType, dwerrorcontrol: ServiceError, lpbinarypathname: Pcwstr, lploadordergroup: Pcwstr, lpdwtagid: COpaquePointer?, lpdependencies: Pcwstr, lpservicestartname: Pcwstr, lppassword: Pcwstr, lpdisplayname: Pcwstr): Bool =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_changeServiceConfigW((hservice?.value ?: 0L), dwservicetype.toInt(), dwstarttype.toInt(), dwerrorcontrol.toInt(), (lpbinarypathname?.value ?: 0L), (lploadordergroup?.value ?: 0L), (lpdwtagid?.value ?: 0L), (lpdependencies?.value ?: 0L), (lpservicestartname?.value ?: 0L), (lppassword?.value ?: 0L), (lpdisplayname?.value ?: 0L))

public actual fun closeServiceHandle(hscobject: ScHandle): Bool =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_closeServiceHandle((hscobject?.value ?: 0L))

public actual fun controlService(hservice: ScHandle, dwcontrol: UInt, lpservicestatus: COpaquePointer?): Bool =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_controlService((hservice?.value ?: 0L), dwcontrol.toInt(), (lpservicestatus?.value ?: 0L))

public actual fun controlServiceExA(hservice: ScHandle, dwcontrol: UInt, dwinfolevel: UInt, pcontrolparams: COpaquePointer?): Bool =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_controlServiceExA((hservice?.value ?: 0L), dwcontrol.toInt(), dwinfolevel.toInt(), (pcontrolparams?.value ?: 0L))

public actual fun controlServiceExW(hservice: ScHandle, dwcontrol: UInt, dwinfolevel: UInt, pcontrolparams: COpaquePointer?): Bool =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_controlServiceExW((hservice?.value ?: 0L), dwcontrol.toInt(), dwinfolevel.toInt(), (pcontrolparams?.value ?: 0L))

public actual fun createServiceA(hscmanager: ScHandle, lpservicename: Pcstr, lpdisplayname: Pcstr, dwdesiredaccess: UInt, dwservicetype: EnumServiceType, dwstarttype: ServiceStartType, dwerrorcontrol: ServiceError, lpbinarypathname: Pcstr, lploadordergroup: Pcstr, lpdwtagid: COpaquePointer?, lpdependencies: Pcstr, lpservicestartname: Pcstr, lppassword: Pcstr): ScHandle =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_createServiceA((hscmanager?.value ?: 0L), (lpservicename?.value ?: 0L), (lpdisplayname?.value ?: 0L), dwdesiredaccess.toInt(), dwservicetype.toInt(), dwstarttype.toInt(), dwerrorcontrol.toInt(), (lpbinarypathname?.value ?: 0L), (lploadordergroup?.value ?: 0L), (lpdwtagid?.value ?: 0L), (lpdependencies?.value ?: 0L), (lpservicestartname?.value ?: 0L), (lppassword?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createServiceW(hscmanager: ScHandle, lpservicename: Pcwstr, lpdisplayname: Pcwstr, dwdesiredaccess: UInt, dwservicetype: EnumServiceType, dwstarttype: ServiceStartType, dwerrorcontrol: ServiceError, lpbinarypathname: Pcwstr, lploadordergroup: Pcwstr, lpdwtagid: COpaquePointer?, lpdependencies: Pcwstr, lpservicestartname: Pcwstr, lppassword: Pcwstr): ScHandle =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_createServiceW((hscmanager?.value ?: 0L), (lpservicename?.value ?: 0L), (lpdisplayname?.value ?: 0L), dwdesiredaccess.toInt(), dwservicetype.toInt(), dwstarttype.toInt(), dwerrorcontrol.toInt(), (lpbinarypathname?.value ?: 0L), (lploadordergroup?.value ?: 0L), (lpdwtagid?.value ?: 0L), (lpdependencies?.value ?: 0L), (lpservicestartname?.value ?: 0L), (lppassword?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun deleteService(hservice: ScHandle): Bool =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_deleteService((hservice?.value ?: 0L))

public actual fun enumDependentServicesA(hservice: ScHandle, dwservicestate: EnumServiceState, lpservices: COpaquePointer?, cbbufsize: UInt, pcbbytesneeded: COpaquePointer?, lpservicesreturned: COpaquePointer?): Bool =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_enumDependentServicesA((hservice?.value ?: 0L), dwservicestate.toInt(), (lpservices?.value ?: 0L), cbbufsize.toInt(), (pcbbytesneeded?.value ?: 0L), (lpservicesreturned?.value ?: 0L))

public actual fun enumDependentServicesW(hservice: ScHandle, dwservicestate: EnumServiceState, lpservices: COpaquePointer?, cbbufsize: UInt, pcbbytesneeded: COpaquePointer?, lpservicesreturned: COpaquePointer?): Bool =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_enumDependentServicesW((hservice?.value ?: 0L), dwservicestate.toInt(), (lpservices?.value ?: 0L), cbbufsize.toInt(), (pcbbytesneeded?.value ?: 0L), (lpservicesreturned?.value ?: 0L))

public actual fun enumServicesStatusA(hscmanager: ScHandle, dwservicetype: EnumServiceType, dwservicestate: EnumServiceState, lpservices: COpaquePointer?, cbbufsize: UInt, pcbbytesneeded: COpaquePointer?, lpservicesreturned: COpaquePointer?, lpresumehandle: COpaquePointer?): Bool =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_enumServicesStatusA((hscmanager?.value ?: 0L), dwservicetype.toInt(), dwservicestate.toInt(), (lpservices?.value ?: 0L), cbbufsize.toInt(), (pcbbytesneeded?.value ?: 0L), (lpservicesreturned?.value ?: 0L), (lpresumehandle?.value ?: 0L))

public actual fun enumServicesStatusExA(hscmanager: ScHandle, infolevel: ScEnumType, dwservicetype: EnumServiceType, dwservicestate: EnumServiceState, lpservices: COpaquePointer?, cbbufsize: UInt, pcbbytesneeded: COpaquePointer?, lpservicesreturned: COpaquePointer?, lpresumehandle: COpaquePointer?, pszgroupname: Pcstr): Bool =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_enumServicesStatusExA((hscmanager?.value ?: 0L), infolevel, dwservicetype.toInt(), dwservicestate.toInt(), (lpservices?.value ?: 0L), cbbufsize.toInt(), (pcbbytesneeded?.value ?: 0L), (lpservicesreturned?.value ?: 0L), (lpresumehandle?.value ?: 0L), (pszgroupname?.value ?: 0L))

public actual fun enumServicesStatusExW(hscmanager: ScHandle, infolevel: ScEnumType, dwservicetype: EnumServiceType, dwservicestate: EnumServiceState, lpservices: COpaquePointer?, cbbufsize: UInt, pcbbytesneeded: COpaquePointer?, lpservicesreturned: COpaquePointer?, lpresumehandle: COpaquePointer?, pszgroupname: Pcwstr): Bool =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_enumServicesStatusExW((hscmanager?.value ?: 0L), infolevel, dwservicetype.toInt(), dwservicestate.toInt(), (lpservices?.value ?: 0L), cbbufsize.toInt(), (pcbbytesneeded?.value ?: 0L), (lpservicesreturned?.value ?: 0L), (lpresumehandle?.value ?: 0L), (pszgroupname?.value ?: 0L))

public actual fun enumServicesStatusW(hscmanager: ScHandle, dwservicetype: EnumServiceType, dwservicestate: EnumServiceState, lpservices: COpaquePointer?, cbbufsize: UInt, pcbbytesneeded: COpaquePointer?, lpservicesreturned: COpaquePointer?, lpresumehandle: COpaquePointer?): Bool =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_enumServicesStatusW((hscmanager?.value ?: 0L), dwservicetype.toInt(), dwservicestate.toInt(), (lpservices?.value ?: 0L), cbbufsize.toInt(), (pcbbytesneeded?.value ?: 0L), (lpservicesreturned?.value ?: 0L), (lpresumehandle?.value ?: 0L))

public actual fun getServiceDirectory(hservicestatus: ServiceStatusHandle, edirectorytype: ServiceDirectoryType, lppathbuffer: Pwstr, cchpathbufferlength: UInt, lpcchrequiredbufferlength: COpaquePointer?): UInt =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_getServiceDirectory((hservicestatus?.value ?: 0L), edirectorytype, (lppathbuffer?.value ?: 0L), cchpathbufferlength.toInt(), (lpcchrequiredbufferlength?.value ?: 0L)).toUInt()

public actual fun getServiceDisplayNameA(hscmanager: ScHandle, lpservicename: Pcstr, lpdisplayname: Pstr, lpcchbuffer: COpaquePointer?): Bool =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_getServiceDisplayNameA((hscmanager?.value ?: 0L), (lpservicename?.value ?: 0L), (lpdisplayname?.value ?: 0L), (lpcchbuffer?.value ?: 0L))

public actual fun getServiceDisplayNameW(hscmanager: ScHandle, lpservicename: Pcwstr, lpdisplayname: Pwstr, lpcchbuffer: COpaquePointer?): Bool =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_getServiceDisplayNameW((hscmanager?.value ?: 0L), (lpservicename?.value ?: 0L), (lpdisplayname?.value ?: 0L), (lpcchbuffer?.value ?: 0L))

public actual fun getServiceKeyNameA(hscmanager: ScHandle, lpdisplayname: Pcstr, lpservicename: Pstr, lpcchbuffer: COpaquePointer?): Bool =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_getServiceKeyNameA((hscmanager?.value ?: 0L), (lpdisplayname?.value ?: 0L), (lpservicename?.value ?: 0L), (lpcchbuffer?.value ?: 0L))

public actual fun getServiceKeyNameW(hscmanager: ScHandle, lpdisplayname: Pcwstr, lpservicename: Pwstr, lpcchbuffer: COpaquePointer?): Bool =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_getServiceKeyNameW((hscmanager?.value ?: 0L), (lpdisplayname?.value ?: 0L), (lpservicename?.value ?: 0L), (lpcchbuffer?.value ?: 0L))

public actual fun getServiceRegistryStateKey(servicestatushandle: ServiceStatusHandle, statetype: ServiceRegistryStateType, accessmask: UInt, servicestatekey: COpaquePointer?): UInt =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_getServiceRegistryStateKey((servicestatushandle?.value ?: 0L), statetype, accessmask.toInt(), (servicestatekey?.value ?: 0L)).toUInt()

public actual fun getSharedServiceDirectory(servicehandle: ScHandle, directorytype: ServiceSharedDirectoryType, pathbuffer: Pwstr, pathbufferlength: UInt, requiredbufferlength: COpaquePointer?): UInt =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_getSharedServiceDirectory((servicehandle?.value ?: 0L), directorytype, (pathbuffer?.value ?: 0L), pathbufferlength.toInt(), (requiredbufferlength?.value ?: 0L)).toUInt()

public actual fun getSharedServiceRegistryStateKey(servicehandle: ScHandle, statetype: ServiceSharedRegistryStateType, accessmask: UInt, servicestatekey: COpaquePointer?): UInt =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_getSharedServiceRegistryStateKey((servicehandle?.value ?: 0L), statetype, accessmask.toInt(), (servicestatekey?.value ?: 0L)).toUInt()

public actual fun lockServiceDatabase(hscmanager: ScHandle): COpaquePointer? =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_lockServiceDatabase((hscmanager?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun notifyBootConfigStatus(bootacceptable: Bool): Bool =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_notifyBootConfigStatus(bootacceptable)

public actual fun notifyServiceStatusChangeA(hservice: ScHandle, dwnotifymask: ServiceNotify, pnotifybuffer: COpaquePointer?): UInt =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_notifyServiceStatusChangeA((hservice?.value ?: 0L), dwnotifymask.toInt(), (pnotifybuffer?.value ?: 0L)).toUInt()

public actual fun notifyServiceStatusChangeW(hservice: ScHandle, dwnotifymask: ServiceNotify, pnotifybuffer: COpaquePointer?): UInt =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_notifyServiceStatusChangeW((hservice?.value ?: 0L), dwnotifymask.toInt(), (pnotifybuffer?.value ?: 0L)).toUInt()

public actual fun openSCManagerA(lpmachinename: Pcstr, lpdatabasename: Pcstr, dwdesiredaccess: UInt): ScHandle =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_openSCManagerA((lpmachinename?.value ?: 0L), (lpdatabasename?.value ?: 0L), dwdesiredaccess.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun openSCManagerW(lpmachinename: Pcwstr, lpdatabasename: Pcwstr, dwdesiredaccess: UInt): ScHandle =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_openSCManagerW((lpmachinename?.value ?: 0L), (lpdatabasename?.value ?: 0L), dwdesiredaccess.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun openServiceA(hscmanager: ScHandle, lpservicename: Pcstr, dwdesiredaccess: UInt): ScHandle =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_openServiceA((hscmanager?.value ?: 0L), (lpservicename?.value ?: 0L), dwdesiredaccess.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun openServiceW(hscmanager: ScHandle, lpservicename: Pcwstr, dwdesiredaccess: UInt): ScHandle =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_openServiceW((hscmanager?.value ?: 0L), (lpservicename?.value ?: 0L), dwdesiredaccess.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun queryServiceConfig2A(hservice: ScHandle, dwinfolevel: ServiceConfig, lpbuffer: COpaquePointer?, cbbufsize: UInt, pcbbytesneeded: COpaquePointer?): Bool =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_queryServiceConfig2A((hservice?.value ?: 0L), dwinfolevel.toInt(), (lpbuffer?.value ?: 0L), cbbufsize.toInt(), (pcbbytesneeded?.value ?: 0L))

public actual fun queryServiceConfig2W(hservice: ScHandle, dwinfolevel: ServiceConfig, lpbuffer: COpaquePointer?, cbbufsize: UInt, pcbbytesneeded: COpaquePointer?): Bool =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_queryServiceConfig2W((hservice?.value ?: 0L), dwinfolevel.toInt(), (lpbuffer?.value ?: 0L), cbbufsize.toInt(), (pcbbytesneeded?.value ?: 0L))

public actual fun queryServiceConfigA(hservice: ScHandle, lpserviceconfig: COpaquePointer?, cbbufsize: UInt, pcbbytesneeded: COpaquePointer?): Bool =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_queryServiceConfigA((hservice?.value ?: 0L), (lpserviceconfig?.value ?: 0L), cbbufsize.toInt(), (pcbbytesneeded?.value ?: 0L))

public actual fun queryServiceConfigW(hservice: ScHandle, lpserviceconfig: COpaquePointer?, cbbufsize: UInt, pcbbytesneeded: COpaquePointer?): Bool =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_queryServiceConfigW((hservice?.value ?: 0L), (lpserviceconfig?.value ?: 0L), cbbufsize.toInt(), (pcbbytesneeded?.value ?: 0L))

public actual fun queryServiceDynamicInformation(hservicestatus: ServiceStatusHandle, dwinfolevel: UInt, ppdynamicinfo: COpaquePointer?): Bool =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_queryServiceDynamicInformation((hservicestatus?.value ?: 0L), dwinfolevel.toInt(), (ppdynamicinfo?.value ?: 0L))

public actual fun queryServiceLockStatusA(hscmanager: ScHandle, lplockstatus: COpaquePointer?, cbbufsize: UInt, pcbbytesneeded: COpaquePointer?): Bool =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_queryServiceLockStatusA((hscmanager?.value ?: 0L), (lplockstatus?.value ?: 0L), cbbufsize.toInt(), (pcbbytesneeded?.value ?: 0L))

public actual fun queryServiceLockStatusW(hscmanager: ScHandle, lplockstatus: COpaquePointer?, cbbufsize: UInt, pcbbytesneeded: COpaquePointer?): Bool =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_queryServiceLockStatusW((hscmanager?.value ?: 0L), (lplockstatus?.value ?: 0L), cbbufsize.toInt(), (pcbbytesneeded?.value ?: 0L))

public actual fun queryServiceObjectSecurity(hservice: ScHandle, dwsecurityinformation: UInt, lpsecuritydescriptor: PsecurityDescriptor, cbbufsize: UInt, pcbbytesneeded: COpaquePointer?): Bool =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_queryServiceObjectSecurity((hservice?.value ?: 0L), dwsecurityinformation.toInt(), (lpsecuritydescriptor?.value ?: 0L), cbbufsize.toInt(), (pcbbytesneeded?.value ?: 0L))

public actual fun queryServiceStatus(hservice: ScHandle, lpservicestatus: COpaquePointer?): Bool =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_queryServiceStatus((hservice?.value ?: 0L), (lpservicestatus?.value ?: 0L))

public actual fun queryServiceStatusEx(hservice: ScHandle, infolevel: ScStatusType, lpbuffer: COpaquePointer?, cbbufsize: UInt, pcbbytesneeded: COpaquePointer?): Bool =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_queryServiceStatusEx((hservice?.value ?: 0L), infolevel, (lpbuffer?.value ?: 0L), cbbufsize.toInt(), (pcbbytesneeded?.value ?: 0L))

public actual fun registerServiceCtrlHandlerA(lpservicename: Pcstr, lphandlerproc: LphandlerFunction): ServiceStatusHandle =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_registerServiceCtrlHandlerA((lpservicename?.value ?: 0L), 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun registerServiceCtrlHandlerExA(lpservicename: Pcstr, lphandlerproc: LphandlerFunctionEx, lpcontext: COpaquePointer?): ServiceStatusHandle =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_registerServiceCtrlHandlerExA((lpservicename?.value ?: 0L), 0L, (lpcontext?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun registerServiceCtrlHandlerExW(lpservicename: Pcwstr, lphandlerproc: LphandlerFunctionEx, lpcontext: COpaquePointer?): ServiceStatusHandle =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_registerServiceCtrlHandlerExW((lpservicename?.value ?: 0L), 0L, (lpcontext?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun registerServiceCtrlHandlerW(lpservicename: Pcwstr, lphandlerproc: LphandlerFunction): ServiceStatusHandle =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_registerServiceCtrlHandlerW((lpservicename?.value ?: 0L), 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setServiceBits(hservicestatus: ServiceStatusHandle, dwservicebits: UInt, bsetbitson: Bool, bupdateimmediately: Bool): Bool =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_setServiceBits((hservicestatus?.value ?: 0L), dwservicebits.toInt(), bsetbitson, bupdateimmediately)

public actual fun setServiceObjectSecurity(hservice: ScHandle, dwsecurityinformation: ObjectSecurityInformation, lpsecuritydescriptor: PsecurityDescriptor): Bool =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_setServiceObjectSecurity((hservice?.value ?: 0L), dwsecurityinformation.toInt(), (lpsecuritydescriptor?.value ?: 0L))

public actual fun setServiceStatus(hservicestatus: ServiceStatusHandle, lpservicestatus: COpaquePointer?): Bool =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_setServiceStatus((hservicestatus?.value ?: 0L), (lpservicestatus?.value ?: 0L))

public actual fun startServiceA(hservice: ScHandle, dwnumserviceargs: UInt, lpserviceargvectors: COpaquePointer?): Bool =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_startServiceA((hservice?.value ?: 0L), dwnumserviceargs.toInt(), (lpserviceargvectors?.value ?: 0L))

public actual fun startServiceCtrlDispatcherA(lpservicestarttable: COpaquePointer?): Bool =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_startServiceCtrlDispatcherA((lpservicestarttable?.value ?: 0L))

public actual fun startServiceCtrlDispatcherW(lpservicestarttable: COpaquePointer?): Bool =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_startServiceCtrlDispatcherW((lpservicestarttable?.value ?: 0L))

public actual fun startServiceW(hservice: ScHandle, dwnumserviceargs: UInt, lpserviceargvectors: COpaquePointer?): Bool =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_startServiceW((hservice?.value ?: 0L), dwnumserviceargs.toInt(), (lpserviceargvectors?.value ?: 0L))

public actual fun subscribeServiceChangeNotifications(hservice: ScHandle, eeventtype: ScEventType, pcallback: PscNotificationCallback, pcallbackcontext: COpaquePointer?, psubscription: COpaquePointer?): UInt =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_subscribeServiceChangeNotifications((hservice?.value ?: 0L), eeventtype, 0L, (pcallbackcontext?.value ?: 0L), (psubscription?.value ?: 0L)).toUInt()

public actual fun unlockServiceDatabase(sclock: COpaquePointer?): Bool =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_unlockServiceDatabase((sclock?.value ?: 0L))

public actual fun unsubscribeServiceChangeNotifications(psubscription: PscNotificationRegistration) {
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_unsubscribeServiceChangeNotifications(psubscription.toLong())
}

public actual fun waitServiceState(hservice: ScHandle, dwnotify: UInt, dwtimeout: UInt, hcancelevent: Handle): UInt =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_waitServiceState((hservice?.value ?: 0L), dwnotify.toInt(), dwtimeout.toInt(), (hcancelevent?.value ?: 0L)).toUInt()
