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

public actual fun ChangeServiceConfig2A(hservice: SC_HANDLE, dwinfolevel: SERVICE_CONFIG, lpinfo: Long): BOOL =
    0

public actual fun ChangeServiceConfig2W(hservice: SC_HANDLE, dwinfolevel: SERVICE_CONFIG, lpinfo: Long): BOOL =
    0

public actual fun ChangeServiceConfigA(hservice: SC_HANDLE, dwservicetype: ENUM_SERVICE_TYPE, dwstarttype: SERVICE_START_TYPE, dwerrorcontrol: SERVICE_ERROR, lpbinarypathname: PCSTR, lploadordergroup: PCSTR, lpdwtagid: Long, lpdependencies: PCSTR, lpservicestartname: PCSTR, lppassword: PCSTR, lpdisplayname: PCSTR): BOOL =
    0

public actual fun ChangeServiceConfigW(hservice: SC_HANDLE, dwservicetype: ENUM_SERVICE_TYPE, dwstarttype: SERVICE_START_TYPE, dwerrorcontrol: SERVICE_ERROR, lpbinarypathname: PCWSTR, lploadordergroup: PCWSTR, lpdwtagid: Long, lpdependencies: PCWSTR, lpservicestartname: PCWSTR, lppassword: PCWSTR, lpdisplayname: PCWSTR): BOOL =
    0

public actual fun CloseServiceHandle(hscobject: SC_HANDLE): BOOL =
    0

public actual fun ControlService(hservice: SC_HANDLE, dwcontrol: UInt, lpservicestatus: Long): BOOL =
    0

public actual fun ControlServiceExA(hservice: SC_HANDLE, dwcontrol: UInt, dwinfolevel: UInt, pcontrolparams: Long): BOOL =
    0

public actual fun ControlServiceExW(hservice: SC_HANDLE, dwcontrol: UInt, dwinfolevel: UInt, pcontrolparams: Long): BOOL =
    0

public actual fun CreateServiceA(hscmanager: SC_HANDLE, lpservicename: PCSTR, lpdisplayname: PCSTR, dwdesiredaccess: UInt, dwservicetype: ENUM_SERVICE_TYPE, dwstarttype: SERVICE_START_TYPE, dwerrorcontrol: SERVICE_ERROR, lpbinarypathname: PCSTR, lploadordergroup: PCSTR, lpdwtagid: Long, lpdependencies: PCSTR, lpservicestartname: PCSTR, lppassword: PCSTR): SC_HANDLE =
    0L

public actual fun CreateServiceW(hscmanager: SC_HANDLE, lpservicename: PCWSTR, lpdisplayname: PCWSTR, dwdesiredaccess: UInt, dwservicetype: ENUM_SERVICE_TYPE, dwstarttype: SERVICE_START_TYPE, dwerrorcontrol: SERVICE_ERROR, lpbinarypathname: PCWSTR, lploadordergroup: PCWSTR, lpdwtagid: Long, lpdependencies: PCWSTR, lpservicestartname: PCWSTR, lppassword: PCWSTR): SC_HANDLE =
    0L

public actual fun DeleteService(hservice: SC_HANDLE): BOOL =
    0

public actual fun EnumDependentServicesA(hservice: SC_HANDLE, dwservicestate: ENUM_SERVICE_STATE, lpservices: Long, cbbufsize: UInt, pcbbytesneeded: Long, lpservicesreturned: Long): BOOL =
    0

public actual fun EnumDependentServicesW(hservice: SC_HANDLE, dwservicestate: ENUM_SERVICE_STATE, lpservices: Long, cbbufsize: UInt, pcbbytesneeded: Long, lpservicesreturned: Long): BOOL =
    0

public actual fun EnumServicesStatusA(hscmanager: SC_HANDLE, dwservicetype: ENUM_SERVICE_TYPE, dwservicestate: ENUM_SERVICE_STATE, lpservices: Long, cbbufsize: UInt, pcbbytesneeded: Long, lpservicesreturned: Long, lpresumehandle: Long): BOOL =
    0

public actual fun EnumServicesStatusExA(hscmanager: SC_HANDLE, infolevel: SC_ENUM_TYPE, dwservicetype: ENUM_SERVICE_TYPE, dwservicestate: ENUM_SERVICE_STATE, lpservices: Long, cbbufsize: UInt, pcbbytesneeded: Long, lpservicesreturned: Long, lpresumehandle: Long, pszgroupname: PCSTR): BOOL =
    0

public actual fun EnumServicesStatusExW(hscmanager: SC_HANDLE, infolevel: SC_ENUM_TYPE, dwservicetype: ENUM_SERVICE_TYPE, dwservicestate: ENUM_SERVICE_STATE, lpservices: Long, cbbufsize: UInt, pcbbytesneeded: Long, lpservicesreturned: Long, lpresumehandle: Long, pszgroupname: PCWSTR): BOOL =
    0

public actual fun EnumServicesStatusW(hscmanager: SC_HANDLE, dwservicetype: ENUM_SERVICE_TYPE, dwservicestate: ENUM_SERVICE_STATE, lpservices: Long, cbbufsize: UInt, pcbbytesneeded: Long, lpservicesreturned: Long, lpresumehandle: Long): BOOL =
    0

public actual fun GetServiceDirectory(hservicestatus: SERVICE_STATUS_HANDLE, edirectorytype: SERVICE_DIRECTORY_TYPE, lppathbuffer: PWSTR, cchpathbufferlength: UInt, lpcchrequiredbufferlength: Long): UInt =
    0u

public actual fun GetServiceDisplayNameA(hscmanager: SC_HANDLE, lpservicename: PCSTR, lpdisplayname: PSTR, lpcchbuffer: Long): BOOL =
    0

public actual fun GetServiceDisplayNameW(hscmanager: SC_HANDLE, lpservicename: PCWSTR, lpdisplayname: PWSTR, lpcchbuffer: Long): BOOL =
    0

public actual fun GetServiceKeyNameA(hscmanager: SC_HANDLE, lpdisplayname: PCSTR, lpservicename: PSTR, lpcchbuffer: Long): BOOL =
    0

public actual fun GetServiceKeyNameW(hscmanager: SC_HANDLE, lpdisplayname: PCWSTR, lpservicename: PWSTR, lpcchbuffer: Long): BOOL =
    0

public actual fun GetServiceRegistryStateKey(servicestatushandle: SERVICE_STATUS_HANDLE, statetype: SERVICE_REGISTRY_STATE_TYPE, accessmask: UInt, servicestatekey: Long): UInt =
    0u

public actual fun GetSharedServiceDirectory(servicehandle: SC_HANDLE, directorytype: SERVICE_SHARED_DIRECTORY_TYPE, pathbuffer: PWSTR, pathbufferlength: UInt, requiredbufferlength: Long): UInt =
    0u

public actual fun GetSharedServiceRegistryStateKey(servicehandle: SC_HANDLE, statetype: SERVICE_SHARED_REGISTRY_STATE_TYPE, accessmask: UInt, servicestatekey: Long): UInt =
    0u

public actual fun LockServiceDatabase(hscmanager: SC_HANDLE): Long =
    0L

public actual fun NotifyBootConfigStatus(bootacceptable: BOOL): BOOL =
    0

public actual fun NotifyServiceStatusChangeA(hservice: SC_HANDLE, dwnotifymask: SERVICE_NOTIFY, pnotifybuffer: Long): UInt =
    0u

public actual fun NotifyServiceStatusChangeW(hservice: SC_HANDLE, dwnotifymask: SERVICE_NOTIFY, pnotifybuffer: Long): UInt =
    0u

public actual fun OpenSCManagerA(lpmachinename: PCSTR, lpdatabasename: PCSTR, dwdesiredaccess: UInt): SC_HANDLE =
    0L

public actual fun OpenSCManagerW(lpmachinename: PCWSTR, lpdatabasename: PCWSTR, dwdesiredaccess: UInt): SC_HANDLE =
    0L

public actual fun OpenServiceA(hscmanager: SC_HANDLE, lpservicename: PCSTR, dwdesiredaccess: UInt): SC_HANDLE =
    0L

public actual fun OpenServiceW(hscmanager: SC_HANDLE, lpservicename: PCWSTR, dwdesiredaccess: UInt): SC_HANDLE =
    0L

public actual fun QueryServiceConfig2A(hservice: SC_HANDLE, dwinfolevel: SERVICE_CONFIG, lpbuffer: Long, cbbufsize: UInt, pcbbytesneeded: Long): BOOL =
    0

public actual fun QueryServiceConfig2W(hservice: SC_HANDLE, dwinfolevel: SERVICE_CONFIG, lpbuffer: Long, cbbufsize: UInt, pcbbytesneeded: Long): BOOL =
    0

public actual fun QueryServiceConfigA(hservice: SC_HANDLE, lpserviceconfig: Long, cbbufsize: UInt, pcbbytesneeded: Long): BOOL =
    0

public actual fun QueryServiceConfigW(hservice: SC_HANDLE, lpserviceconfig: Long, cbbufsize: UInt, pcbbytesneeded: Long): BOOL =
    0

public actual fun QueryServiceDynamicInformation(hservicestatus: SERVICE_STATUS_HANDLE, dwinfolevel: UInt, ppdynamicinfo: Long): BOOL =
    0

public actual fun QueryServiceLockStatusA(hscmanager: SC_HANDLE, lplockstatus: Long, cbbufsize: UInt, pcbbytesneeded: Long): BOOL =
    0

public actual fun QueryServiceLockStatusW(hscmanager: SC_HANDLE, lplockstatus: Long, cbbufsize: UInt, pcbbytesneeded: Long): BOOL =
    0

public actual fun QueryServiceObjectSecurity(hservice: SC_HANDLE, dwsecurityinformation: UInt, lpsecuritydescriptor: PSECURITY_DESCRIPTOR, cbbufsize: UInt, pcbbytesneeded: Long): BOOL =
    0

public actual fun QueryServiceStatus(hservice: SC_HANDLE, lpservicestatus: Long): BOOL =
    0

public actual fun QueryServiceStatusEx(hservice: SC_HANDLE, infolevel: SC_STATUS_TYPE, lpbuffer: Long, cbbufsize: UInt, pcbbytesneeded: Long): BOOL =
    0

public actual fun RegisterServiceCtrlHandlerA(lpservicename: PCSTR, lphandlerproc: LPHANDLER_FUNCTION): SERVICE_STATUS_HANDLE =
    0L

public actual fun RegisterServiceCtrlHandlerExA(lpservicename: PCSTR, lphandlerproc: LPHANDLER_FUNCTION_EX, lpcontext: Long): SERVICE_STATUS_HANDLE =
    0L

public actual fun RegisterServiceCtrlHandlerExW(lpservicename: PCWSTR, lphandlerproc: LPHANDLER_FUNCTION_EX, lpcontext: Long): SERVICE_STATUS_HANDLE =
    0L

public actual fun RegisterServiceCtrlHandlerW(lpservicename: PCWSTR, lphandlerproc: LPHANDLER_FUNCTION): SERVICE_STATUS_HANDLE =
    0L

public actual fun SetServiceBits(hservicestatus: SERVICE_STATUS_HANDLE, dwservicebits: UInt, bsetbitson: BOOL, bupdateimmediately: BOOL): BOOL =
    0

public actual fun SetServiceObjectSecurity(hservice: SC_HANDLE, dwsecurityinformation: OBJECT_SECURITY_INFORMATION, lpsecuritydescriptor: PSECURITY_DESCRIPTOR): BOOL =
    0

public actual fun SetServiceStatus(hservicestatus: SERVICE_STATUS_HANDLE, lpservicestatus: Long): BOOL =
    0

public actual fun StartServiceA(hservice: SC_HANDLE, dwnumserviceargs: UInt, lpserviceargvectors: Long): BOOL =
    0

public actual fun StartServiceCtrlDispatcherA(lpservicestarttable: Long): BOOL =
    0

public actual fun StartServiceCtrlDispatcherW(lpservicestarttable: Long): BOOL =
    0

public actual fun StartServiceW(hservice: SC_HANDLE, dwnumserviceargs: UInt, lpserviceargvectors: Long): BOOL =
    0

public actual fun SubscribeServiceChangeNotifications(hservice: SC_HANDLE, eeventtype: SC_EVENT_TYPE, pcallback: PSC_NOTIFICATION_CALLBACK, pcallbackcontext: Long, psubscription: Long): UInt =
    0u

public actual fun UnlockServiceDatabase(sclock: Long): BOOL =
    0

public actual fun UnsubscribeServiceChangeNotifications(psubscription: PSC_NOTIFICATION_REGISTRATION) {
}

public actual fun WaitServiceState(hservice: SC_HANDLE, dwnotify: UInt, dwtimeout: UInt, hcancelevent: HANDLE): UInt =
    0u
