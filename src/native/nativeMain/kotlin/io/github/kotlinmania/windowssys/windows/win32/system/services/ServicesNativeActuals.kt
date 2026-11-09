@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.services

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.security.OBJECT_SECURITY_INFORMATION
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun ChangeServiceConfig2A(hservice: SC_HANDLE, dwinfolevel: SERVICE_CONFIG, lpinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_ChangeServiceConfig2A(hservice.toCPointer<ByteVar>(), dwinfolevel, lpinfo.toCPointer<ByteVar>())

public actual fun ChangeServiceConfig2W(hservice: SC_HANDLE, dwinfolevel: SERVICE_CONFIG, lpinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_ChangeServiceConfig2W(hservice.toCPointer<ByteVar>(), dwinfolevel, lpinfo.toCPointer<ByteVar>())

public actual fun ChangeServiceConfigA(hservice: SC_HANDLE, dwservicetype: ENUM_SERVICE_TYPE, dwstarttype: SERVICE_START_TYPE, dwerrorcontrol: SERVICE_ERROR, lpbinarypathname: PCSTR, lploadordergroup: PCSTR, lpdwtagid: Long, lpdependencies: PCSTR, lpservicestartname: PCSTR, lppassword: PCSTR, lpdisplayname: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_ChangeServiceConfigA(hservice.toCPointer<ByteVar>(), dwservicetype, dwstarttype, dwerrorcontrol, lpbinarypathname.toCPointer<ByteVar>(), lploadordergroup.toCPointer<ByteVar>(), lpdwtagid.toCPointer<ByteVar>(), lpdependencies.toCPointer<ByteVar>(), lpservicestartname.toCPointer<ByteVar>(), lppassword.toCPointer<ByteVar>(), lpdisplayname.toCPointer<ByteVar>())

public actual fun ChangeServiceConfigW(hservice: SC_HANDLE, dwservicetype: ENUM_SERVICE_TYPE, dwstarttype: SERVICE_START_TYPE, dwerrorcontrol: SERVICE_ERROR, lpbinarypathname: PCWSTR, lploadordergroup: PCWSTR, lpdwtagid: Long, lpdependencies: PCWSTR, lpservicestartname: PCWSTR, lppassword: PCWSTR, lpdisplayname: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_ChangeServiceConfigW(hservice.toCPointer<ByteVar>(), dwservicetype, dwstarttype, dwerrorcontrol, lpbinarypathname.toCPointer<ByteVar>(), lploadordergroup.toCPointer<ByteVar>(), lpdwtagid.toCPointer<ByteVar>(), lpdependencies.toCPointer<ByteVar>(), lpservicestartname.toCPointer<ByteVar>(), lppassword.toCPointer<ByteVar>(), lpdisplayname.toCPointer<ByteVar>())

public actual fun CloseServiceHandle(hscobject: SC_HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_CloseServiceHandle(hscobject.toCPointer<ByteVar>())

public actual fun ControlService(hservice: SC_HANDLE, dwcontrol: UInt, lpservicestatus: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_ControlService(hservice.toCPointer<ByteVar>(), dwcontrol, lpservicestatus.toCPointer<ByteVar>())

public actual fun ControlServiceExA(hservice: SC_HANDLE, dwcontrol: UInt, dwinfolevel: UInt, pcontrolparams: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_ControlServiceExA(hservice.toCPointer<ByteVar>(), dwcontrol, dwinfolevel, pcontrolparams.toCPointer<ByteVar>())

public actual fun ControlServiceExW(hservice: SC_HANDLE, dwcontrol: UInt, dwinfolevel: UInt, pcontrolparams: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_ControlServiceExW(hservice.toCPointer<ByteVar>(), dwcontrol, dwinfolevel, pcontrolparams.toCPointer<ByteVar>())

public actual fun CreateServiceA(hscmanager: SC_HANDLE, lpservicename: PCSTR, lpdisplayname: PCSTR, dwdesiredaccess: UInt, dwservicetype: ENUM_SERVICE_TYPE, dwstarttype: SERVICE_START_TYPE, dwerrorcontrol: SERVICE_ERROR, lpbinarypathname: PCSTR, lploadordergroup: PCSTR, lpdwtagid: Long, lpdependencies: PCSTR, lpservicestartname: PCSTR, lppassword: PCSTR): SC_HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_CreateServiceA(hscmanager.toCPointer<ByteVar>(), lpservicename.toCPointer<ByteVar>(), lpdisplayname.toCPointer<ByteVar>(), dwdesiredaccess, dwservicetype, dwstarttype, dwerrorcontrol, lpbinarypathname.toCPointer<ByteVar>(), lploadordergroup.toCPointer<ByteVar>(), lpdwtagid.toCPointer<ByteVar>(), lpdependencies.toCPointer<ByteVar>(), lpservicestartname.toCPointer<ByteVar>(), lppassword.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreateServiceW(hscmanager: SC_HANDLE, lpservicename: PCWSTR, lpdisplayname: PCWSTR, dwdesiredaccess: UInt, dwservicetype: ENUM_SERVICE_TYPE, dwstarttype: SERVICE_START_TYPE, dwerrorcontrol: SERVICE_ERROR, lpbinarypathname: PCWSTR, lploadordergroup: PCWSTR, lpdwtagid: Long, lpdependencies: PCWSTR, lpservicestartname: PCWSTR, lppassword: PCWSTR): SC_HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_CreateServiceW(hscmanager.toCPointer<ByteVar>(), lpservicename.toCPointer<ByteVar>(), lpdisplayname.toCPointer<ByteVar>(), dwdesiredaccess, dwservicetype, dwstarttype, dwerrorcontrol, lpbinarypathname.toCPointer<ByteVar>(), lploadordergroup.toCPointer<ByteVar>(), lpdwtagid.toCPointer<ByteVar>(), lpdependencies.toCPointer<ByteVar>(), lpservicestartname.toCPointer<ByteVar>(), lppassword.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun DeleteService(hservice: SC_HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_DeleteService(hservice.toCPointer<ByteVar>())

public actual fun EnumDependentServicesA(hservice: SC_HANDLE, dwservicestate: ENUM_SERVICE_STATE, lpservices: Long, cbbufsize: UInt, pcbbytesneeded: Long, lpservicesreturned: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_EnumDependentServicesA(hservice.toCPointer<ByteVar>(), dwservicestate, lpservices.toCPointer<ByteVar>(), cbbufsize, pcbbytesneeded.toCPointer<ByteVar>(), lpservicesreturned.toCPointer<ByteVar>())

public actual fun EnumDependentServicesW(hservice: SC_HANDLE, dwservicestate: ENUM_SERVICE_STATE, lpservices: Long, cbbufsize: UInt, pcbbytesneeded: Long, lpservicesreturned: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_EnumDependentServicesW(hservice.toCPointer<ByteVar>(), dwservicestate, lpservices.toCPointer<ByteVar>(), cbbufsize, pcbbytesneeded.toCPointer<ByteVar>(), lpservicesreturned.toCPointer<ByteVar>())

public actual fun EnumServicesStatusA(hscmanager: SC_HANDLE, dwservicetype: ENUM_SERVICE_TYPE, dwservicestate: ENUM_SERVICE_STATE, lpservices: Long, cbbufsize: UInt, pcbbytesneeded: Long, lpservicesreturned: Long, lpresumehandle: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_EnumServicesStatusA(hscmanager.toCPointer<ByteVar>(), dwservicetype, dwservicestate, lpservices.toCPointer<ByteVar>(), cbbufsize, pcbbytesneeded.toCPointer<ByteVar>(), lpservicesreturned.toCPointer<ByteVar>(), lpresumehandle.toCPointer<ByteVar>())

public actual fun EnumServicesStatusExA(hscmanager: SC_HANDLE, infolevel: SC_ENUM_TYPE, dwservicetype: ENUM_SERVICE_TYPE, dwservicestate: ENUM_SERVICE_STATE, lpservices: Long, cbbufsize: UInt, pcbbytesneeded: Long, lpservicesreturned: Long, lpresumehandle: Long, pszgroupname: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_EnumServicesStatusExA(hscmanager.toCPointer<ByteVar>(), infolevel, dwservicetype, dwservicestate, lpservices.toCPointer<ByteVar>(), cbbufsize, pcbbytesneeded.toCPointer<ByteVar>(), lpservicesreturned.toCPointer<ByteVar>(), lpresumehandle.toCPointer<ByteVar>(), pszgroupname.toCPointer<ByteVar>())

public actual fun EnumServicesStatusExW(hscmanager: SC_HANDLE, infolevel: SC_ENUM_TYPE, dwservicetype: ENUM_SERVICE_TYPE, dwservicestate: ENUM_SERVICE_STATE, lpservices: Long, cbbufsize: UInt, pcbbytesneeded: Long, lpservicesreturned: Long, lpresumehandle: Long, pszgroupname: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_EnumServicesStatusExW(hscmanager.toCPointer<ByteVar>(), infolevel, dwservicetype, dwservicestate, lpservices.toCPointer<ByteVar>(), cbbufsize, pcbbytesneeded.toCPointer<ByteVar>(), lpservicesreturned.toCPointer<ByteVar>(), lpresumehandle.toCPointer<ByteVar>(), pszgroupname.toCPointer<ByteVar>())

public actual fun EnumServicesStatusW(hscmanager: SC_HANDLE, dwservicetype: ENUM_SERVICE_TYPE, dwservicestate: ENUM_SERVICE_STATE, lpservices: Long, cbbufsize: UInt, pcbbytesneeded: Long, lpservicesreturned: Long, lpresumehandle: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_EnumServicesStatusW(hscmanager.toCPointer<ByteVar>(), dwservicetype, dwservicestate, lpservices.toCPointer<ByteVar>(), cbbufsize, pcbbytesneeded.toCPointer<ByteVar>(), lpservicesreturned.toCPointer<ByteVar>(), lpresumehandle.toCPointer<ByteVar>())

public actual fun GetServiceDirectory(hservicestatus: SERVICE_STATUS_HANDLE, edirectorytype: SERVICE_DIRECTORY_TYPE, lppathbuffer: PWSTR, cchpathbufferlength: UInt, lpcchrequiredbufferlength: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_GetServiceDirectory(hservicestatus.toCPointer<ByteVar>(), edirectorytype, lppathbuffer.toCPointer<ByteVar>(), cchpathbufferlength, lpcchrequiredbufferlength.toCPointer<ByteVar>())

public actual fun GetServiceDisplayNameA(hscmanager: SC_HANDLE, lpservicename: PCSTR, lpdisplayname: PSTR, lpcchbuffer: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_GetServiceDisplayNameA(hscmanager.toCPointer<ByteVar>(), lpservicename.toCPointer<ByteVar>(), lpdisplayname.toCPointer<ByteVar>(), lpcchbuffer.toCPointer<ByteVar>())

public actual fun GetServiceDisplayNameW(hscmanager: SC_HANDLE, lpservicename: PCWSTR, lpdisplayname: PWSTR, lpcchbuffer: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_GetServiceDisplayNameW(hscmanager.toCPointer<ByteVar>(), lpservicename.toCPointer<ByteVar>(), lpdisplayname.toCPointer<ByteVar>(), lpcchbuffer.toCPointer<ByteVar>())

public actual fun GetServiceKeyNameA(hscmanager: SC_HANDLE, lpdisplayname: PCSTR, lpservicename: PSTR, lpcchbuffer: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_GetServiceKeyNameA(hscmanager.toCPointer<ByteVar>(), lpdisplayname.toCPointer<ByteVar>(), lpservicename.toCPointer<ByteVar>(), lpcchbuffer.toCPointer<ByteVar>())

public actual fun GetServiceKeyNameW(hscmanager: SC_HANDLE, lpdisplayname: PCWSTR, lpservicename: PWSTR, lpcchbuffer: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_GetServiceKeyNameW(hscmanager.toCPointer<ByteVar>(), lpdisplayname.toCPointer<ByteVar>(), lpservicename.toCPointer<ByteVar>(), lpcchbuffer.toCPointer<ByteVar>())

public actual fun GetServiceRegistryStateKey(servicestatushandle: SERVICE_STATUS_HANDLE, statetype: SERVICE_REGISTRY_STATE_TYPE, accessmask: UInt, servicestatekey: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_GetServiceRegistryStateKey(servicestatushandle.toCPointer<ByteVar>(), statetype, accessmask, servicestatekey.toCPointer<ByteVar>())

public actual fun GetSharedServiceDirectory(servicehandle: SC_HANDLE, directorytype: SERVICE_SHARED_DIRECTORY_TYPE, pathbuffer: PWSTR, pathbufferlength: UInt, requiredbufferlength: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_GetSharedServiceDirectory(servicehandle.toCPointer<ByteVar>(), directorytype, pathbuffer.toCPointer<ByteVar>(), pathbufferlength, requiredbufferlength.toCPointer<ByteVar>())

public actual fun GetSharedServiceRegistryStateKey(servicehandle: SC_HANDLE, statetype: SERVICE_SHARED_REGISTRY_STATE_TYPE, accessmask: UInt, servicestatekey: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_GetSharedServiceRegistryStateKey(servicehandle.toCPointer<ByteVar>(), statetype, accessmask, servicestatekey.toCPointer<ByteVar>())

public actual fun LockServiceDatabase(hscmanager: SC_HANDLE): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_LockServiceDatabase(hscmanager.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun NotifyBootConfigStatus(bootacceptable: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_NotifyBootConfigStatus(bootacceptable)

public actual fun NotifyServiceStatusChangeA(hservice: SC_HANDLE, dwnotifymask: SERVICE_NOTIFY, pnotifybuffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_NotifyServiceStatusChangeA(hservice.toCPointer<ByteVar>(), dwnotifymask, pnotifybuffer.toCPointer<ByteVar>())

public actual fun NotifyServiceStatusChangeW(hservice: SC_HANDLE, dwnotifymask: SERVICE_NOTIFY, pnotifybuffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_NotifyServiceStatusChangeW(hservice.toCPointer<ByteVar>(), dwnotifymask, pnotifybuffer.toCPointer<ByteVar>())

public actual fun OpenSCManagerA(lpmachinename: PCSTR, lpdatabasename: PCSTR, dwdesiredaccess: UInt): SC_HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_OpenSCManagerA(lpmachinename.toCPointer<ByteVar>(), lpdatabasename.toCPointer<ByteVar>(), dwdesiredaccess)?.toLong() ?: 0L

public actual fun OpenSCManagerW(lpmachinename: PCWSTR, lpdatabasename: PCWSTR, dwdesiredaccess: UInt): SC_HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_OpenSCManagerW(lpmachinename.toCPointer<ByteVar>(), lpdatabasename.toCPointer<ByteVar>(), dwdesiredaccess)?.toLong() ?: 0L

public actual fun OpenServiceA(hscmanager: SC_HANDLE, lpservicename: PCSTR, dwdesiredaccess: UInt): SC_HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_OpenServiceA(hscmanager.toCPointer<ByteVar>(), lpservicename.toCPointer<ByteVar>(), dwdesiredaccess)?.toLong() ?: 0L

public actual fun OpenServiceW(hscmanager: SC_HANDLE, lpservicename: PCWSTR, dwdesiredaccess: UInt): SC_HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_OpenServiceW(hscmanager.toCPointer<ByteVar>(), lpservicename.toCPointer<ByteVar>(), dwdesiredaccess)?.toLong() ?: 0L

public actual fun QueryServiceConfig2A(hservice: SC_HANDLE, dwinfolevel: SERVICE_CONFIG, lpbuffer: Long, cbbufsize: UInt, pcbbytesneeded: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_QueryServiceConfig2A(hservice.toCPointer<ByteVar>(), dwinfolevel, lpbuffer.toCPointer<ByteVar>(), cbbufsize, pcbbytesneeded.toCPointer<ByteVar>())

public actual fun QueryServiceConfig2W(hservice: SC_HANDLE, dwinfolevel: SERVICE_CONFIG, lpbuffer: Long, cbbufsize: UInt, pcbbytesneeded: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_QueryServiceConfig2W(hservice.toCPointer<ByteVar>(), dwinfolevel, lpbuffer.toCPointer<ByteVar>(), cbbufsize, pcbbytesneeded.toCPointer<ByteVar>())

public actual fun QueryServiceConfigA(hservice: SC_HANDLE, lpserviceconfig: Long, cbbufsize: UInt, pcbbytesneeded: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_QueryServiceConfigA(hservice.toCPointer<ByteVar>(), lpserviceconfig.toCPointer<ByteVar>(), cbbufsize, pcbbytesneeded.toCPointer<ByteVar>())

public actual fun QueryServiceConfigW(hservice: SC_HANDLE, lpserviceconfig: Long, cbbufsize: UInt, pcbbytesneeded: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_QueryServiceConfigW(hservice.toCPointer<ByteVar>(), lpserviceconfig.toCPointer<ByteVar>(), cbbufsize, pcbbytesneeded.toCPointer<ByteVar>())

public actual fun QueryServiceDynamicInformation(hservicestatus: SERVICE_STATUS_HANDLE, dwinfolevel: UInt, ppdynamicinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_QueryServiceDynamicInformation(hservicestatus.toCPointer<ByteVar>(), dwinfolevel, ppdynamicinfo.toCPointer<ByteVar>())

public actual fun QueryServiceLockStatusA(hscmanager: SC_HANDLE, lplockstatus: Long, cbbufsize: UInt, pcbbytesneeded: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_QueryServiceLockStatusA(hscmanager.toCPointer<ByteVar>(), lplockstatus.toCPointer<ByteVar>(), cbbufsize, pcbbytesneeded.toCPointer<ByteVar>())

public actual fun QueryServiceLockStatusW(hscmanager: SC_HANDLE, lplockstatus: Long, cbbufsize: UInt, pcbbytesneeded: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_QueryServiceLockStatusW(hscmanager.toCPointer<ByteVar>(), lplockstatus.toCPointer<ByteVar>(), cbbufsize, pcbbytesneeded.toCPointer<ByteVar>())

public actual fun QueryServiceObjectSecurity(hservice: SC_HANDLE, dwsecurityinformation: UInt, lpsecuritydescriptor: PSECURITY_DESCRIPTOR, cbbufsize: UInt, pcbbytesneeded: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_QueryServiceObjectSecurity(hservice.toCPointer<ByteVar>(), dwsecurityinformation, lpsecuritydescriptor.toCPointer<ByteVar>(), cbbufsize, pcbbytesneeded.toCPointer<ByteVar>())

public actual fun QueryServiceStatus(hservice: SC_HANDLE, lpservicestatus: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_QueryServiceStatus(hservice.toCPointer<ByteVar>(), lpservicestatus.toCPointer<ByteVar>())

public actual fun QueryServiceStatusEx(hservice: SC_HANDLE, infolevel: SC_STATUS_TYPE, lpbuffer: Long, cbbufsize: UInt, pcbbytesneeded: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_QueryServiceStatusEx(hservice.toCPointer<ByteVar>(), infolevel, lpbuffer.toCPointer<ByteVar>(), cbbufsize, pcbbytesneeded.toCPointer<ByteVar>())

public actual fun RegisterServiceCtrlHandlerA(lpservicename: PCSTR, lphandlerproc: LPHANDLER_FUNCTION): SERVICE_STATUS_HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_RegisterServiceCtrlHandlerA(lpservicename.toCPointer<ByteVar>(), lphandlerproc.toLong().toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun RegisterServiceCtrlHandlerExA(lpservicename: PCSTR, lphandlerproc: LPHANDLER_FUNCTION_EX, lpcontext: Long): SERVICE_STATUS_HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_RegisterServiceCtrlHandlerExA(lpservicename.toCPointer<ByteVar>(), lphandlerproc.toLong().toCPointer<ByteVar>(), lpcontext.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun RegisterServiceCtrlHandlerExW(lpservicename: PCWSTR, lphandlerproc: LPHANDLER_FUNCTION_EX, lpcontext: Long): SERVICE_STATUS_HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_RegisterServiceCtrlHandlerExW(lpservicename.toCPointer<ByteVar>(), lphandlerproc.toLong().toCPointer<ByteVar>(), lpcontext.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun RegisterServiceCtrlHandlerW(lpservicename: PCWSTR, lphandlerproc: LPHANDLER_FUNCTION): SERVICE_STATUS_HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_RegisterServiceCtrlHandlerW(lpservicename.toCPointer<ByteVar>(), lphandlerproc.toLong().toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun SetServiceBits(hservicestatus: SERVICE_STATUS_HANDLE, dwservicebits: UInt, bsetbitson: BOOL, bupdateimmediately: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_SetServiceBits(hservicestatus.toCPointer<ByteVar>(), dwservicebits, bsetbitson, bupdateimmediately)

public actual fun SetServiceObjectSecurity(hservice: SC_HANDLE, dwsecurityinformation: OBJECT_SECURITY_INFORMATION, lpsecuritydescriptor: PSECURITY_DESCRIPTOR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_SetServiceObjectSecurity(hservice.toCPointer<ByteVar>(), dwsecurityinformation, lpsecuritydescriptor.toCPointer<ByteVar>())

public actual fun SetServiceStatus(hservicestatus: SERVICE_STATUS_HANDLE, lpservicestatus: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_SetServiceStatus(hservicestatus.toCPointer<ByteVar>(), lpservicestatus.toCPointer<ByteVar>())

public actual fun StartServiceA(hservice: SC_HANDLE, dwnumserviceargs: UInt, lpserviceargvectors: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_StartServiceA(hservice.toCPointer<ByteVar>(), dwnumserviceargs, lpserviceargvectors.toCPointer<ByteVar>())

public actual fun StartServiceCtrlDispatcherA(lpservicestarttable: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_StartServiceCtrlDispatcherA(lpservicestarttable.toCPointer<ByteVar>())

public actual fun StartServiceCtrlDispatcherW(lpservicestarttable: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_StartServiceCtrlDispatcherW(lpservicestarttable.toCPointer<ByteVar>())

public actual fun StartServiceW(hservice: SC_HANDLE, dwnumserviceargs: UInt, lpserviceargvectors: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_StartServiceW(hservice.toCPointer<ByteVar>(), dwnumserviceargs, lpserviceargvectors.toCPointer<ByteVar>())

public actual fun SubscribeServiceChangeNotifications(hservice: SC_HANDLE, eeventtype: SC_EVENT_TYPE, pcallback: PSC_NOTIFICATION_CALLBACK, pcallbackcontext: Long, psubscription: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_SubscribeServiceChangeNotifications(hservice.toCPointer<ByteVar>(), eeventtype, pcallback.toLong().toCPointer<ByteVar>(), pcallbackcontext.toCPointer<ByteVar>(), psubscription.toCPointer<ByteVar>())

public actual fun UnlockServiceDatabase(sclock: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_UnlockServiceDatabase(sclock.toCPointer<ByteVar>())

public actual fun UnsubscribeServiceChangeNotifications(psubscription: PSC_NOTIFICATION_REGISTRATION) {
    io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_UnsubscribeServiceChangeNotifications(psubscription)
}

public actual fun WaitServiceState(hservice: SC_HANDLE, dwnotify: UInt, dwtimeout: UInt, hcancelevent: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_WaitServiceState(hservice.toCPointer<ByteVar>(), dwnotify, dwtimeout, hcancelevent.toCPointer<ByteVar>())
