@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.services

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.security.OBJECT_SECURITY_INFORMATION
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR

private object WindowsWin32SystemServicesJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_services_ChangeServiceConfig2A(hservice: Long, dwinfolevel: Int, lpinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_ChangeServiceConfig2W(hservice: Long, dwinfolevel: Int, lpinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_ChangeServiceConfigA(hservice: Long, dwservicetype: Int, dwstarttype: Int, dwerrorcontrol: Int, lpbinarypathname: Long, lploadordergroup: Long, lpdwtagid: Long, lpdependencies: Long, lpservicestartname: Long, lppassword: Long, lpdisplayname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_ChangeServiceConfigW(hservice: Long, dwservicetype: Int, dwstarttype: Int, dwerrorcontrol: Int, lpbinarypathname: Long, lploadordergroup: Long, lpdwtagid: Long, lpdependencies: Long, lpservicestartname: Long, lppassword: Long, lpdisplayname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_CloseServiceHandle(hscobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_ControlService(hservice: Long, dwcontrol: Int, lpservicestatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_ControlServiceExA(hservice: Long, dwcontrol: Int, dwinfolevel: Int, pcontrolparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_ControlServiceExW(hservice: Long, dwcontrol: Int, dwinfolevel: Int, pcontrolparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_CreateServiceA(hscmanager: Long, lpservicename: Long, lpdisplayname: Long, dwdesiredaccess: Int, dwservicetype: Int, dwstarttype: Int, dwerrorcontrol: Int, lpbinarypathname: Long, lploadordergroup: Long, lpdwtagid: Long, lpdependencies: Long, lpservicestartname: Long, lppassword: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_services_CreateServiceW(hscmanager: Long, lpservicename: Long, lpdisplayname: Long, dwdesiredaccess: Int, dwservicetype: Int, dwstarttype: Int, dwerrorcontrol: Int, lpbinarypathname: Long, lploadordergroup: Long, lpdwtagid: Long, lpdependencies: Long, lpservicestartname: Long, lppassword: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_services_DeleteService(hservice: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_EnumDependentServicesA(hservice: Long, dwservicestate: Int, lpservices: Long, cbbufsize: Int, pcbbytesneeded: Long, lpservicesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_EnumDependentServicesW(hservice: Long, dwservicestate: Int, lpservices: Long, cbbufsize: Int, pcbbytesneeded: Long, lpservicesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_EnumServicesStatusA(hscmanager: Long, dwservicetype: Int, dwservicestate: Int, lpservices: Long, cbbufsize: Int, pcbbytesneeded: Long, lpservicesreturned: Long, lpresumehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_EnumServicesStatusExA(hscmanager: Long, infolevel: Int, dwservicetype: Int, dwservicestate: Int, lpservices: Long, cbbufsize: Int, pcbbytesneeded: Long, lpservicesreturned: Long, lpresumehandle: Long, pszgroupname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_EnumServicesStatusExW(hscmanager: Long, infolevel: Int, dwservicetype: Int, dwservicestate: Int, lpservices: Long, cbbufsize: Int, pcbbytesneeded: Long, lpservicesreturned: Long, lpresumehandle: Long, pszgroupname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_EnumServicesStatusW(hscmanager: Long, dwservicetype: Int, dwservicestate: Int, lpservices: Long, cbbufsize: Int, pcbbytesneeded: Long, lpservicesreturned: Long, lpresumehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_GetServiceDirectory(hservicestatus: Long, edirectorytype: Int, lppathbuffer: Long, cchpathbufferlength: Int, lpcchrequiredbufferlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_GetServiceDisplayNameA(hscmanager: Long, lpservicename: Long, lpdisplayname: Long, lpcchbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_GetServiceDisplayNameW(hscmanager: Long, lpservicename: Long, lpdisplayname: Long, lpcchbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_GetServiceKeyNameA(hscmanager: Long, lpdisplayname: Long, lpservicename: Long, lpcchbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_GetServiceKeyNameW(hscmanager: Long, lpdisplayname: Long, lpservicename: Long, lpcchbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_GetServiceRegistryStateKey(servicestatushandle: Long, statetype: Int, accessmask: Int, servicestatekey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_GetSharedServiceDirectory(servicehandle: Long, directorytype: Int, pathbuffer: Long, pathbufferlength: Int, requiredbufferlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_GetSharedServiceRegistryStateKey(servicehandle: Long, statetype: Int, accessmask: Int, servicestatekey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_LockServiceDatabase(hscmanager: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_services_NotifyBootConfigStatus(bootacceptable: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_NotifyServiceStatusChangeA(hservice: Long, dwnotifymask: Int, pnotifybuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_NotifyServiceStatusChangeW(hservice: Long, dwnotifymask: Int, pnotifybuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_OpenSCManagerA(lpmachinename: Long, lpdatabasename: Long, dwdesiredaccess: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_services_OpenSCManagerW(lpmachinename: Long, lpdatabasename: Long, dwdesiredaccess: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_services_OpenServiceA(hscmanager: Long, lpservicename: Long, dwdesiredaccess: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_services_OpenServiceW(hscmanager: Long, lpservicename: Long, dwdesiredaccess: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_services_QueryServiceConfig2A(hservice: Long, dwinfolevel: Int, lpbuffer: Long, cbbufsize: Int, pcbbytesneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_QueryServiceConfig2W(hservice: Long, dwinfolevel: Int, lpbuffer: Long, cbbufsize: Int, pcbbytesneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_QueryServiceConfigA(hservice: Long, lpserviceconfig: Long, cbbufsize: Int, pcbbytesneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_QueryServiceConfigW(hservice: Long, lpserviceconfig: Long, cbbufsize: Int, pcbbytesneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_QueryServiceDynamicInformation(hservicestatus: Long, dwinfolevel: Int, ppdynamicinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_QueryServiceLockStatusA(hscmanager: Long, lplockstatus: Long, cbbufsize: Int, pcbbytesneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_QueryServiceLockStatusW(hscmanager: Long, lplockstatus: Long, cbbufsize: Int, pcbbytesneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_QueryServiceObjectSecurity(hservice: Long, dwsecurityinformation: Int, lpsecuritydescriptor: Long, cbbufsize: Int, pcbbytesneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_QueryServiceStatus(hservice: Long, lpservicestatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_QueryServiceStatusEx(hservice: Long, infolevel: Int, lpbuffer: Long, cbbufsize: Int, pcbbytesneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_RegisterServiceCtrlHandlerA(lpservicename: Long, lphandlerproc: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_services_RegisterServiceCtrlHandlerExA(lpservicename: Long, lphandlerproc: Long, lpcontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_services_RegisterServiceCtrlHandlerExW(lpservicename: Long, lphandlerproc: Long, lpcontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_services_RegisterServiceCtrlHandlerW(lpservicename: Long, lphandlerproc: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_services_SetServiceBits(hservicestatus: Long, dwservicebits: Int, bsetbitson: Int, bupdateimmediately: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_SetServiceObjectSecurity(hservice: Long, dwsecurityinformation: Int, lpsecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_SetServiceStatus(hservicestatus: Long, lpservicestatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_StartServiceA(hservice: Long, dwnumserviceargs: Int, lpserviceargvectors: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_StartServiceCtrlDispatcherA(lpservicestarttable: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_StartServiceCtrlDispatcherW(lpservicestarttable: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_StartServiceW(hservice: Long, dwnumserviceargs: Int, lpserviceargvectors: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_SubscribeServiceChangeNotifications(hservice: Long, eeventtype: Int, pcallback: Long, pcallbackcontext: Long, psubscription: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_UnlockServiceDatabase(sclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_services_UnsubscribeServiceChangeNotifications(psubscription: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_services_WaitServiceState(hservice: Long, dwnotify: Int, dwtimeout: Int, hcancelevent: Long): Int
}

public actual fun ChangeServiceConfig2A(hservice: SC_HANDLE, dwinfolevel: SERVICE_CONFIG, lpinfo: Long): BOOL =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_ChangeServiceConfig2A(hservice, dwinfolevel.toInt(), lpinfo)

public actual fun ChangeServiceConfig2W(hservice: SC_HANDLE, dwinfolevel: SERVICE_CONFIG, lpinfo: Long): BOOL =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_ChangeServiceConfig2W(hservice, dwinfolevel.toInt(), lpinfo)

public actual fun ChangeServiceConfigA(hservice: SC_HANDLE, dwservicetype: ENUM_SERVICE_TYPE, dwstarttype: SERVICE_START_TYPE, dwerrorcontrol: SERVICE_ERROR, lpbinarypathname: PCSTR, lploadordergroup: PCSTR, lpdwtagid: Long, lpdependencies: PCSTR, lpservicestartname: PCSTR, lppassword: PCSTR, lpdisplayname: PCSTR): BOOL =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_ChangeServiceConfigA(hservice, dwservicetype.toInt(), dwstarttype.toInt(), dwerrorcontrol.toInt(), lpbinarypathname, lploadordergroup, lpdwtagid, lpdependencies, lpservicestartname, lppassword, lpdisplayname)

public actual fun ChangeServiceConfigW(hservice: SC_HANDLE, dwservicetype: ENUM_SERVICE_TYPE, dwstarttype: SERVICE_START_TYPE, dwerrorcontrol: SERVICE_ERROR, lpbinarypathname: PCWSTR, lploadordergroup: PCWSTR, lpdwtagid: Long, lpdependencies: PCWSTR, lpservicestartname: PCWSTR, lppassword: PCWSTR, lpdisplayname: PCWSTR): BOOL =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_ChangeServiceConfigW(hservice, dwservicetype.toInt(), dwstarttype.toInt(), dwerrorcontrol.toInt(), lpbinarypathname, lploadordergroup, lpdwtagid, lpdependencies, lpservicestartname, lppassword, lpdisplayname)

public actual fun CloseServiceHandle(hscobject: SC_HANDLE): BOOL =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_CloseServiceHandle(hscobject)

public actual fun ControlService(hservice: SC_HANDLE, dwcontrol: UInt, lpservicestatus: Long): BOOL =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_ControlService(hservice, dwcontrol.toInt(), lpservicestatus)

public actual fun ControlServiceExA(hservice: SC_HANDLE, dwcontrol: UInt, dwinfolevel: UInt, pcontrolparams: Long): BOOL =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_ControlServiceExA(hservice, dwcontrol.toInt(), dwinfolevel.toInt(), pcontrolparams)

public actual fun ControlServiceExW(hservice: SC_HANDLE, dwcontrol: UInt, dwinfolevel: UInt, pcontrolparams: Long): BOOL =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_ControlServiceExW(hservice, dwcontrol.toInt(), dwinfolevel.toInt(), pcontrolparams)

public actual fun CreateServiceA(hscmanager: SC_HANDLE, lpservicename: PCSTR, lpdisplayname: PCSTR, dwdesiredaccess: UInt, dwservicetype: ENUM_SERVICE_TYPE, dwstarttype: SERVICE_START_TYPE, dwerrorcontrol: SERVICE_ERROR, lpbinarypathname: PCSTR, lploadordergroup: PCSTR, lpdwtagid: Long, lpdependencies: PCSTR, lpservicestartname: PCSTR, lppassword: PCSTR): SC_HANDLE =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_CreateServiceA(hscmanager, lpservicename, lpdisplayname, dwdesiredaccess.toInt(), dwservicetype.toInt(), dwstarttype.toInt(), dwerrorcontrol.toInt(), lpbinarypathname, lploadordergroup, lpdwtagid, lpdependencies, lpservicestartname, lppassword)

public actual fun CreateServiceW(hscmanager: SC_HANDLE, lpservicename: PCWSTR, lpdisplayname: PCWSTR, dwdesiredaccess: UInt, dwservicetype: ENUM_SERVICE_TYPE, dwstarttype: SERVICE_START_TYPE, dwerrorcontrol: SERVICE_ERROR, lpbinarypathname: PCWSTR, lploadordergroup: PCWSTR, lpdwtagid: Long, lpdependencies: PCWSTR, lpservicestartname: PCWSTR, lppassword: PCWSTR): SC_HANDLE =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_CreateServiceW(hscmanager, lpservicename, lpdisplayname, dwdesiredaccess.toInt(), dwservicetype.toInt(), dwstarttype.toInt(), dwerrorcontrol.toInt(), lpbinarypathname, lploadordergroup, lpdwtagid, lpdependencies, lpservicestartname, lppassword)

public actual fun DeleteService(hservice: SC_HANDLE): BOOL =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_DeleteService(hservice)

public actual fun EnumDependentServicesA(hservice: SC_HANDLE, dwservicestate: ENUM_SERVICE_STATE, lpservices: Long, cbbufsize: UInt, pcbbytesneeded: Long, lpservicesreturned: Long): BOOL =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_EnumDependentServicesA(hservice, dwservicestate.toInt(), lpservices, cbbufsize.toInt(), pcbbytesneeded, lpservicesreturned)

public actual fun EnumDependentServicesW(hservice: SC_HANDLE, dwservicestate: ENUM_SERVICE_STATE, lpservices: Long, cbbufsize: UInt, pcbbytesneeded: Long, lpservicesreturned: Long): BOOL =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_EnumDependentServicesW(hservice, dwservicestate.toInt(), lpservices, cbbufsize.toInt(), pcbbytesneeded, lpservicesreturned)

public actual fun EnumServicesStatusA(hscmanager: SC_HANDLE, dwservicetype: ENUM_SERVICE_TYPE, dwservicestate: ENUM_SERVICE_STATE, lpservices: Long, cbbufsize: UInt, pcbbytesneeded: Long, lpservicesreturned: Long, lpresumehandle: Long): BOOL =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_EnumServicesStatusA(hscmanager, dwservicetype.toInt(), dwservicestate.toInt(), lpservices, cbbufsize.toInt(), pcbbytesneeded, lpservicesreturned, lpresumehandle)

public actual fun EnumServicesStatusExA(hscmanager: SC_HANDLE, infolevel: SC_ENUM_TYPE, dwservicetype: ENUM_SERVICE_TYPE, dwservicestate: ENUM_SERVICE_STATE, lpservices: Long, cbbufsize: UInt, pcbbytesneeded: Long, lpservicesreturned: Long, lpresumehandle: Long, pszgroupname: PCSTR): BOOL =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_EnumServicesStatusExA(hscmanager, infolevel, dwservicetype.toInt(), dwservicestate.toInt(), lpservices, cbbufsize.toInt(), pcbbytesneeded, lpservicesreturned, lpresumehandle, pszgroupname)

public actual fun EnumServicesStatusExW(hscmanager: SC_HANDLE, infolevel: SC_ENUM_TYPE, dwservicetype: ENUM_SERVICE_TYPE, dwservicestate: ENUM_SERVICE_STATE, lpservices: Long, cbbufsize: UInt, pcbbytesneeded: Long, lpservicesreturned: Long, lpresumehandle: Long, pszgroupname: PCWSTR): BOOL =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_EnumServicesStatusExW(hscmanager, infolevel, dwservicetype.toInt(), dwservicestate.toInt(), lpservices, cbbufsize.toInt(), pcbbytesneeded, lpservicesreturned, lpresumehandle, pszgroupname)

public actual fun EnumServicesStatusW(hscmanager: SC_HANDLE, dwservicetype: ENUM_SERVICE_TYPE, dwservicestate: ENUM_SERVICE_STATE, lpservices: Long, cbbufsize: UInt, pcbbytesneeded: Long, lpservicesreturned: Long, lpresumehandle: Long): BOOL =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_EnumServicesStatusW(hscmanager, dwservicetype.toInt(), dwservicestate.toInt(), lpservices, cbbufsize.toInt(), pcbbytesneeded, lpservicesreturned, lpresumehandle)

public actual fun GetServiceDirectory(hservicestatus: SERVICE_STATUS_HANDLE, edirectorytype: SERVICE_DIRECTORY_TYPE, lppathbuffer: PWSTR, cchpathbufferlength: UInt, lpcchrequiredbufferlength: Long): UInt =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_GetServiceDirectory(hservicestatus, edirectorytype, lppathbuffer, cchpathbufferlength.toInt(), lpcchrequiredbufferlength).toUInt()

public actual fun GetServiceDisplayNameA(hscmanager: SC_HANDLE, lpservicename: PCSTR, lpdisplayname: PSTR, lpcchbuffer: Long): BOOL =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_GetServiceDisplayNameA(hscmanager, lpservicename, lpdisplayname, lpcchbuffer)

public actual fun GetServiceDisplayNameW(hscmanager: SC_HANDLE, lpservicename: PCWSTR, lpdisplayname: PWSTR, lpcchbuffer: Long): BOOL =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_GetServiceDisplayNameW(hscmanager, lpservicename, lpdisplayname, lpcchbuffer)

public actual fun GetServiceKeyNameA(hscmanager: SC_HANDLE, lpdisplayname: PCSTR, lpservicename: PSTR, lpcchbuffer: Long): BOOL =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_GetServiceKeyNameA(hscmanager, lpdisplayname, lpservicename, lpcchbuffer)

public actual fun GetServiceKeyNameW(hscmanager: SC_HANDLE, lpdisplayname: PCWSTR, lpservicename: PWSTR, lpcchbuffer: Long): BOOL =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_GetServiceKeyNameW(hscmanager, lpdisplayname, lpservicename, lpcchbuffer)

public actual fun GetServiceRegistryStateKey(servicestatushandle: SERVICE_STATUS_HANDLE, statetype: SERVICE_REGISTRY_STATE_TYPE, accessmask: UInt, servicestatekey: Long): UInt =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_GetServiceRegistryStateKey(servicestatushandle, statetype, accessmask.toInt(), servicestatekey).toUInt()

public actual fun GetSharedServiceDirectory(servicehandle: SC_HANDLE, directorytype: SERVICE_SHARED_DIRECTORY_TYPE, pathbuffer: PWSTR, pathbufferlength: UInt, requiredbufferlength: Long): UInt =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_GetSharedServiceDirectory(servicehandle, directorytype, pathbuffer, pathbufferlength.toInt(), requiredbufferlength).toUInt()

public actual fun GetSharedServiceRegistryStateKey(servicehandle: SC_HANDLE, statetype: SERVICE_SHARED_REGISTRY_STATE_TYPE, accessmask: UInt, servicestatekey: Long): UInt =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_GetSharedServiceRegistryStateKey(servicehandle, statetype, accessmask.toInt(), servicestatekey).toUInt()

public actual fun LockServiceDatabase(hscmanager: SC_HANDLE): Long =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_LockServiceDatabase(hscmanager)

public actual fun NotifyBootConfigStatus(bootacceptable: BOOL): BOOL =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_NotifyBootConfigStatus(bootacceptable)

public actual fun NotifyServiceStatusChangeA(hservice: SC_HANDLE, dwnotifymask: SERVICE_NOTIFY, pnotifybuffer: Long): UInt =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_NotifyServiceStatusChangeA(hservice, dwnotifymask.toInt(), pnotifybuffer).toUInt()

public actual fun NotifyServiceStatusChangeW(hservice: SC_HANDLE, dwnotifymask: SERVICE_NOTIFY, pnotifybuffer: Long): UInt =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_NotifyServiceStatusChangeW(hservice, dwnotifymask.toInt(), pnotifybuffer).toUInt()

public actual fun OpenSCManagerA(lpmachinename: PCSTR, lpdatabasename: PCSTR, dwdesiredaccess: UInt): SC_HANDLE =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_OpenSCManagerA(lpmachinename, lpdatabasename, dwdesiredaccess.toInt())

public actual fun OpenSCManagerW(lpmachinename: PCWSTR, lpdatabasename: PCWSTR, dwdesiredaccess: UInt): SC_HANDLE =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_OpenSCManagerW(lpmachinename, lpdatabasename, dwdesiredaccess.toInt())

public actual fun OpenServiceA(hscmanager: SC_HANDLE, lpservicename: PCSTR, dwdesiredaccess: UInt): SC_HANDLE =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_OpenServiceA(hscmanager, lpservicename, dwdesiredaccess.toInt())

public actual fun OpenServiceW(hscmanager: SC_HANDLE, lpservicename: PCWSTR, dwdesiredaccess: UInt): SC_HANDLE =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_OpenServiceW(hscmanager, lpservicename, dwdesiredaccess.toInt())

public actual fun QueryServiceConfig2A(hservice: SC_HANDLE, dwinfolevel: SERVICE_CONFIG, lpbuffer: Long, cbbufsize: UInt, pcbbytesneeded: Long): BOOL =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_QueryServiceConfig2A(hservice, dwinfolevel.toInt(), lpbuffer, cbbufsize.toInt(), pcbbytesneeded)

public actual fun QueryServiceConfig2W(hservice: SC_HANDLE, dwinfolevel: SERVICE_CONFIG, lpbuffer: Long, cbbufsize: UInt, pcbbytesneeded: Long): BOOL =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_QueryServiceConfig2W(hservice, dwinfolevel.toInt(), lpbuffer, cbbufsize.toInt(), pcbbytesneeded)

public actual fun QueryServiceConfigA(hservice: SC_HANDLE, lpserviceconfig: Long, cbbufsize: UInt, pcbbytesneeded: Long): BOOL =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_QueryServiceConfigA(hservice, lpserviceconfig, cbbufsize.toInt(), pcbbytesneeded)

public actual fun QueryServiceConfigW(hservice: SC_HANDLE, lpserviceconfig: Long, cbbufsize: UInt, pcbbytesneeded: Long): BOOL =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_QueryServiceConfigW(hservice, lpserviceconfig, cbbufsize.toInt(), pcbbytesneeded)

public actual fun QueryServiceDynamicInformation(hservicestatus: SERVICE_STATUS_HANDLE, dwinfolevel: UInt, ppdynamicinfo: Long): BOOL =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_QueryServiceDynamicInformation(hservicestatus, dwinfolevel.toInt(), ppdynamicinfo)

public actual fun QueryServiceLockStatusA(hscmanager: SC_HANDLE, lplockstatus: Long, cbbufsize: UInt, pcbbytesneeded: Long): BOOL =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_QueryServiceLockStatusA(hscmanager, lplockstatus, cbbufsize.toInt(), pcbbytesneeded)

public actual fun QueryServiceLockStatusW(hscmanager: SC_HANDLE, lplockstatus: Long, cbbufsize: UInt, pcbbytesneeded: Long): BOOL =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_QueryServiceLockStatusW(hscmanager, lplockstatus, cbbufsize.toInt(), pcbbytesneeded)

public actual fun QueryServiceObjectSecurity(hservice: SC_HANDLE, dwsecurityinformation: UInt, lpsecuritydescriptor: PSECURITY_DESCRIPTOR, cbbufsize: UInt, pcbbytesneeded: Long): BOOL =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_QueryServiceObjectSecurity(hservice, dwsecurityinformation.toInt(), lpsecuritydescriptor, cbbufsize.toInt(), pcbbytesneeded)

public actual fun QueryServiceStatus(hservice: SC_HANDLE, lpservicestatus: Long): BOOL =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_QueryServiceStatus(hservice, lpservicestatus)

public actual fun QueryServiceStatusEx(hservice: SC_HANDLE, infolevel: SC_STATUS_TYPE, lpbuffer: Long, cbbufsize: UInt, pcbbytesneeded: Long): BOOL =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_QueryServiceStatusEx(hservice, infolevel, lpbuffer, cbbufsize.toInt(), pcbbytesneeded)

public actual fun RegisterServiceCtrlHandlerA(lpservicename: PCSTR, lphandlerproc: LPHANDLER_FUNCTION): SERVICE_STATUS_HANDLE =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_RegisterServiceCtrlHandlerA(lpservicename, lphandlerproc.toLong())

public actual fun RegisterServiceCtrlHandlerExA(lpservicename: PCSTR, lphandlerproc: LPHANDLER_FUNCTION_EX, lpcontext: Long): SERVICE_STATUS_HANDLE =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_RegisterServiceCtrlHandlerExA(lpservicename, lphandlerproc.toLong(), lpcontext)

public actual fun RegisterServiceCtrlHandlerExW(lpservicename: PCWSTR, lphandlerproc: LPHANDLER_FUNCTION_EX, lpcontext: Long): SERVICE_STATUS_HANDLE =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_RegisterServiceCtrlHandlerExW(lpservicename, lphandlerproc.toLong(), lpcontext)

public actual fun RegisterServiceCtrlHandlerW(lpservicename: PCWSTR, lphandlerproc: LPHANDLER_FUNCTION): SERVICE_STATUS_HANDLE =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_RegisterServiceCtrlHandlerW(lpservicename, lphandlerproc.toLong())

public actual fun SetServiceBits(hservicestatus: SERVICE_STATUS_HANDLE, dwservicebits: UInt, bsetbitson: BOOL, bupdateimmediately: BOOL): BOOL =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_SetServiceBits(hservicestatus, dwservicebits.toInt(), bsetbitson, bupdateimmediately)

public actual fun SetServiceObjectSecurity(hservice: SC_HANDLE, dwsecurityinformation: OBJECT_SECURITY_INFORMATION, lpsecuritydescriptor: PSECURITY_DESCRIPTOR): BOOL =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_SetServiceObjectSecurity(hservice, dwsecurityinformation.toInt(), lpsecuritydescriptor)

public actual fun SetServiceStatus(hservicestatus: SERVICE_STATUS_HANDLE, lpservicestatus: Long): BOOL =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_SetServiceStatus(hservicestatus, lpservicestatus)

public actual fun StartServiceA(hservice: SC_HANDLE, dwnumserviceargs: UInt, lpserviceargvectors: Long): BOOL =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_StartServiceA(hservice, dwnumserviceargs.toInt(), lpserviceargvectors)

public actual fun StartServiceCtrlDispatcherA(lpservicestarttable: Long): BOOL =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_StartServiceCtrlDispatcherA(lpservicestarttable)

public actual fun StartServiceCtrlDispatcherW(lpservicestarttable: Long): BOOL =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_StartServiceCtrlDispatcherW(lpservicestarttable)

public actual fun StartServiceW(hservice: SC_HANDLE, dwnumserviceargs: UInt, lpserviceargvectors: Long): BOOL =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_StartServiceW(hservice, dwnumserviceargs.toInt(), lpserviceargvectors)

public actual fun SubscribeServiceChangeNotifications(hservice: SC_HANDLE, eeventtype: SC_EVENT_TYPE, pcallback: PSC_NOTIFICATION_CALLBACK, pcallbackcontext: Long, psubscription: Long): UInt =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_SubscribeServiceChangeNotifications(hservice, eeventtype, pcallback.toLong(), pcallbackcontext, psubscription).toUInt()

public actual fun UnlockServiceDatabase(sclock: Long): BOOL =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_UnlockServiceDatabase(sclock)

public actual fun UnsubscribeServiceChangeNotifications(psubscription: PSC_NOTIFICATION_REGISTRATION) {
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_UnsubscribeServiceChangeNotifications(psubscription)
}

public actual fun WaitServiceState(hservice: SC_HANDLE, dwnotify: UInt, dwtimeout: UInt, hcancelevent: HANDLE): UInt =
    WindowsWin32SystemServicesJniBridge.windowssys_windows_win32_system_services_WaitServiceState(hservice, dwnotify.toInt(), dwtimeout.toInt(), hcancelevent).toUInt()
