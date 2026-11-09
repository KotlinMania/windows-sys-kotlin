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

private val _windowsWin32SystemServicesNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun ChangeServiceConfig2A(hservice: SC_HANDLE, dwinfolevel: SERVICE_CONFIG, lpinfo: Long): BOOL =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_ChangeServiceConfig2A(hservice.toString(), dwinfolevel.toInt(), lpinfo.toString()) as Int) else 0

public actual fun ChangeServiceConfig2W(hservice: SC_HANDLE, dwinfolevel: SERVICE_CONFIG, lpinfo: Long): BOOL =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_ChangeServiceConfig2W(hservice.toString(), dwinfolevel.toInt(), lpinfo.toString()) as Int) else 0

public actual fun ChangeServiceConfigA(hservice: SC_HANDLE, dwservicetype: ENUM_SERVICE_TYPE, dwstarttype: SERVICE_START_TYPE, dwerrorcontrol: SERVICE_ERROR, lpbinarypathname: PCSTR, lploadordergroup: PCSTR, lpdwtagid: Long, lpdependencies: PCSTR, lpservicestartname: PCSTR, lppassword: PCSTR, lpdisplayname: PCSTR): BOOL =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_ChangeServiceConfigA(hservice.toString(), dwservicetype.toInt(), dwstarttype.toInt(), dwerrorcontrol.toInt(), lpbinarypathname.toString(), lploadordergroup.toString(), lpdwtagid.toString(), lpdependencies.toString(), lpservicestartname.toString(), lppassword.toString(), lpdisplayname.toString()) as Int) else 0

public actual fun ChangeServiceConfigW(hservice: SC_HANDLE, dwservicetype: ENUM_SERVICE_TYPE, dwstarttype: SERVICE_START_TYPE, dwerrorcontrol: SERVICE_ERROR, lpbinarypathname: PCWSTR, lploadordergroup: PCWSTR, lpdwtagid: Long, lpdependencies: PCWSTR, lpservicestartname: PCWSTR, lppassword: PCWSTR, lpdisplayname: PCWSTR): BOOL =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_ChangeServiceConfigW(hservice.toString(), dwservicetype.toInt(), dwstarttype.toInt(), dwerrorcontrol.toInt(), lpbinarypathname.toString(), lploadordergroup.toString(), lpdwtagid.toString(), lpdependencies.toString(), lpservicestartname.toString(), lppassword.toString(), lpdisplayname.toString()) as Int) else 0

public actual fun CloseServiceHandle(hscobject: SC_HANDLE): BOOL =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_CloseServiceHandle(hscobject.toString()) as Int) else 0

public actual fun ControlService(hservice: SC_HANDLE, dwcontrol: UInt, lpservicestatus: Long): BOOL =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_ControlService(hservice.toString(), dwcontrol.toInt(), lpservicestatus.toString()) as Int) else 0

public actual fun ControlServiceExA(hservice: SC_HANDLE, dwcontrol: UInt, dwinfolevel: UInt, pcontrolparams: Long): BOOL =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_ControlServiceExA(hservice.toString(), dwcontrol.toInt(), dwinfolevel.toInt(), pcontrolparams.toString()) as Int) else 0

public actual fun ControlServiceExW(hservice: SC_HANDLE, dwcontrol: UInt, dwinfolevel: UInt, pcontrolparams: Long): BOOL =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_ControlServiceExW(hservice.toString(), dwcontrol.toInt(), dwinfolevel.toInt(), pcontrolparams.toString()) as Int) else 0

public actual fun CreateServiceA(hscmanager: SC_HANDLE, lpservicename: PCSTR, lpdisplayname: PCSTR, dwdesiredaccess: UInt, dwservicetype: ENUM_SERVICE_TYPE, dwstarttype: SERVICE_START_TYPE, dwerrorcontrol: SERVICE_ERROR, lpbinarypathname: PCSTR, lploadordergroup: PCSTR, lpdwtagid: Long, lpdependencies: PCSTR, lpservicestartname: PCSTR, lppassword: PCSTR): SC_HANDLE =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_CreateServiceA(hscmanager.toString(), lpservicename.toString(), lpdisplayname.toString(), dwdesiredaccess.toInt(), dwservicetype.toInt(), dwstarttype.toInt(), dwerrorcontrol.toInt(), lpbinarypathname.toString(), lploadordergroup.toString(), lpdwtagid.toString(), lpdependencies.toString(), lpservicestartname.toString(), lppassword.toString()) as String).toLong() else 0L

public actual fun CreateServiceW(hscmanager: SC_HANDLE, lpservicename: PCWSTR, lpdisplayname: PCWSTR, dwdesiredaccess: UInt, dwservicetype: ENUM_SERVICE_TYPE, dwstarttype: SERVICE_START_TYPE, dwerrorcontrol: SERVICE_ERROR, lpbinarypathname: PCWSTR, lploadordergroup: PCWSTR, lpdwtagid: Long, lpdependencies: PCWSTR, lpservicestartname: PCWSTR, lppassword: PCWSTR): SC_HANDLE =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_CreateServiceW(hscmanager.toString(), lpservicename.toString(), lpdisplayname.toString(), dwdesiredaccess.toInt(), dwservicetype.toInt(), dwstarttype.toInt(), dwerrorcontrol.toInt(), lpbinarypathname.toString(), lploadordergroup.toString(), lpdwtagid.toString(), lpdependencies.toString(), lpservicestartname.toString(), lppassword.toString()) as String).toLong() else 0L

public actual fun DeleteService(hservice: SC_HANDLE): BOOL =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_DeleteService(hservice.toString()) as Int) else 0

public actual fun EnumDependentServicesA(hservice: SC_HANDLE, dwservicestate: ENUM_SERVICE_STATE, lpservices: Long, cbbufsize: UInt, pcbbytesneeded: Long, lpservicesreturned: Long): BOOL =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_EnumDependentServicesA(hservice.toString(), dwservicestate.toInt(), lpservices.toString(), cbbufsize.toInt(), pcbbytesneeded.toString(), lpservicesreturned.toString()) as Int) else 0

public actual fun EnumDependentServicesW(hservice: SC_HANDLE, dwservicestate: ENUM_SERVICE_STATE, lpservices: Long, cbbufsize: UInt, pcbbytesneeded: Long, lpservicesreturned: Long): BOOL =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_EnumDependentServicesW(hservice.toString(), dwservicestate.toInt(), lpservices.toString(), cbbufsize.toInt(), pcbbytesneeded.toString(), lpservicesreturned.toString()) as Int) else 0

public actual fun EnumServicesStatusA(hscmanager: SC_HANDLE, dwservicetype: ENUM_SERVICE_TYPE, dwservicestate: ENUM_SERVICE_STATE, lpservices: Long, cbbufsize: UInt, pcbbytesneeded: Long, lpservicesreturned: Long, lpresumehandle: Long): BOOL =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_EnumServicesStatusA(hscmanager.toString(), dwservicetype.toInt(), dwservicestate.toInt(), lpservices.toString(), cbbufsize.toInt(), pcbbytesneeded.toString(), lpservicesreturned.toString(), lpresumehandle.toString()) as Int) else 0

public actual fun EnumServicesStatusExA(hscmanager: SC_HANDLE, infolevel: SC_ENUM_TYPE, dwservicetype: ENUM_SERVICE_TYPE, dwservicestate: ENUM_SERVICE_STATE, lpservices: Long, cbbufsize: UInt, pcbbytesneeded: Long, lpservicesreturned: Long, lpresumehandle: Long, pszgroupname: PCSTR): BOOL =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_EnumServicesStatusExA(hscmanager.toString(), infolevel, dwservicetype.toInt(), dwservicestate.toInt(), lpservices.toString(), cbbufsize.toInt(), pcbbytesneeded.toString(), lpservicesreturned.toString(), lpresumehandle.toString(), pszgroupname.toString()) as Int) else 0

public actual fun EnumServicesStatusExW(hscmanager: SC_HANDLE, infolevel: SC_ENUM_TYPE, dwservicetype: ENUM_SERVICE_TYPE, dwservicestate: ENUM_SERVICE_STATE, lpservices: Long, cbbufsize: UInt, pcbbytesneeded: Long, lpservicesreturned: Long, lpresumehandle: Long, pszgroupname: PCWSTR): BOOL =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_EnumServicesStatusExW(hscmanager.toString(), infolevel, dwservicetype.toInt(), dwservicestate.toInt(), lpservices.toString(), cbbufsize.toInt(), pcbbytesneeded.toString(), lpservicesreturned.toString(), lpresumehandle.toString(), pszgroupname.toString()) as Int) else 0

public actual fun EnumServicesStatusW(hscmanager: SC_HANDLE, dwservicetype: ENUM_SERVICE_TYPE, dwservicestate: ENUM_SERVICE_STATE, lpservices: Long, cbbufsize: UInt, pcbbytesneeded: Long, lpservicesreturned: Long, lpresumehandle: Long): BOOL =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_EnumServicesStatusW(hscmanager.toString(), dwservicetype.toInt(), dwservicestate.toInt(), lpservices.toString(), cbbufsize.toInt(), pcbbytesneeded.toString(), lpservicesreturned.toString(), lpresumehandle.toString()) as Int) else 0

public actual fun GetServiceDirectory(hservicestatus: SERVICE_STATUS_HANDLE, edirectorytype: SERVICE_DIRECTORY_TYPE, lppathbuffer: PWSTR, cchpathbufferlength: UInt, lpcchrequiredbufferlength: Long): UInt =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_GetServiceDirectory(hservicestatus.toString(), edirectorytype, lppathbuffer.toString(), cchpathbufferlength.toInt(), lpcchrequiredbufferlength.toString()) as Int).toUInt() else 0u

public actual fun GetServiceDisplayNameA(hscmanager: SC_HANDLE, lpservicename: PCSTR, lpdisplayname: PSTR, lpcchbuffer: Long): BOOL =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_GetServiceDisplayNameA(hscmanager.toString(), lpservicename.toString(), lpdisplayname.toString(), lpcchbuffer.toString()) as Int) else 0

public actual fun GetServiceDisplayNameW(hscmanager: SC_HANDLE, lpservicename: PCWSTR, lpdisplayname: PWSTR, lpcchbuffer: Long): BOOL =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_GetServiceDisplayNameW(hscmanager.toString(), lpservicename.toString(), lpdisplayname.toString(), lpcchbuffer.toString()) as Int) else 0

public actual fun GetServiceKeyNameA(hscmanager: SC_HANDLE, lpdisplayname: PCSTR, lpservicename: PSTR, lpcchbuffer: Long): BOOL =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_GetServiceKeyNameA(hscmanager.toString(), lpdisplayname.toString(), lpservicename.toString(), lpcchbuffer.toString()) as Int) else 0

public actual fun GetServiceKeyNameW(hscmanager: SC_HANDLE, lpdisplayname: PCWSTR, lpservicename: PWSTR, lpcchbuffer: Long): BOOL =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_GetServiceKeyNameW(hscmanager.toString(), lpdisplayname.toString(), lpservicename.toString(), lpcchbuffer.toString()) as Int) else 0

public actual fun GetServiceRegistryStateKey(servicestatushandle: SERVICE_STATUS_HANDLE, statetype: SERVICE_REGISTRY_STATE_TYPE, accessmask: UInt, servicestatekey: Long): UInt =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_GetServiceRegistryStateKey(servicestatushandle.toString(), statetype, accessmask.toInt(), servicestatekey.toString()) as Int).toUInt() else 0u

public actual fun GetSharedServiceDirectory(servicehandle: SC_HANDLE, directorytype: SERVICE_SHARED_DIRECTORY_TYPE, pathbuffer: PWSTR, pathbufferlength: UInt, requiredbufferlength: Long): UInt =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_GetSharedServiceDirectory(servicehandle.toString(), directorytype, pathbuffer.toString(), pathbufferlength.toInt(), requiredbufferlength.toString()) as Int).toUInt() else 0u

public actual fun GetSharedServiceRegistryStateKey(servicehandle: SC_HANDLE, statetype: SERVICE_SHARED_REGISTRY_STATE_TYPE, accessmask: UInt, servicestatekey: Long): UInt =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_GetSharedServiceRegistryStateKey(servicehandle.toString(), statetype, accessmask.toInt(), servicestatekey.toString()) as Int).toUInt() else 0u

public actual fun LockServiceDatabase(hscmanager: SC_HANDLE): Long =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_LockServiceDatabase(hscmanager.toString()) as String).toLong() else 0L

public actual fun NotifyBootConfigStatus(bootacceptable: BOOL): BOOL =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_NotifyBootConfigStatus(bootacceptable) as Int) else 0

public actual fun NotifyServiceStatusChangeA(hservice: SC_HANDLE, dwnotifymask: SERVICE_NOTIFY, pnotifybuffer: Long): UInt =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_NotifyServiceStatusChangeA(hservice.toString(), dwnotifymask.toInt(), pnotifybuffer.toString()) as Int).toUInt() else 0u

public actual fun NotifyServiceStatusChangeW(hservice: SC_HANDLE, dwnotifymask: SERVICE_NOTIFY, pnotifybuffer: Long): UInt =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_NotifyServiceStatusChangeW(hservice.toString(), dwnotifymask.toInt(), pnotifybuffer.toString()) as Int).toUInt() else 0u

public actual fun OpenSCManagerA(lpmachinename: PCSTR, lpdatabasename: PCSTR, dwdesiredaccess: UInt): SC_HANDLE =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_OpenSCManagerA(lpmachinename.toString(), lpdatabasename.toString(), dwdesiredaccess.toInt()) as String).toLong() else 0L

public actual fun OpenSCManagerW(lpmachinename: PCWSTR, lpdatabasename: PCWSTR, dwdesiredaccess: UInt): SC_HANDLE =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_OpenSCManagerW(lpmachinename.toString(), lpdatabasename.toString(), dwdesiredaccess.toInt()) as String).toLong() else 0L

public actual fun OpenServiceA(hscmanager: SC_HANDLE, lpservicename: PCSTR, dwdesiredaccess: UInt): SC_HANDLE =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_OpenServiceA(hscmanager.toString(), lpservicename.toString(), dwdesiredaccess.toInt()) as String).toLong() else 0L

public actual fun OpenServiceW(hscmanager: SC_HANDLE, lpservicename: PCWSTR, dwdesiredaccess: UInt): SC_HANDLE =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_OpenServiceW(hscmanager.toString(), lpservicename.toString(), dwdesiredaccess.toInt()) as String).toLong() else 0L

public actual fun QueryServiceConfig2A(hservice: SC_HANDLE, dwinfolevel: SERVICE_CONFIG, lpbuffer: Long, cbbufsize: UInt, pcbbytesneeded: Long): BOOL =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_QueryServiceConfig2A(hservice.toString(), dwinfolevel.toInt(), lpbuffer.toString(), cbbufsize.toInt(), pcbbytesneeded.toString()) as Int) else 0

public actual fun QueryServiceConfig2W(hservice: SC_HANDLE, dwinfolevel: SERVICE_CONFIG, lpbuffer: Long, cbbufsize: UInt, pcbbytesneeded: Long): BOOL =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_QueryServiceConfig2W(hservice.toString(), dwinfolevel.toInt(), lpbuffer.toString(), cbbufsize.toInt(), pcbbytesneeded.toString()) as Int) else 0

public actual fun QueryServiceConfigA(hservice: SC_HANDLE, lpserviceconfig: Long, cbbufsize: UInt, pcbbytesneeded: Long): BOOL =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_QueryServiceConfigA(hservice.toString(), lpserviceconfig.toString(), cbbufsize.toInt(), pcbbytesneeded.toString()) as Int) else 0

public actual fun QueryServiceConfigW(hservice: SC_HANDLE, lpserviceconfig: Long, cbbufsize: UInt, pcbbytesneeded: Long): BOOL =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_QueryServiceConfigW(hservice.toString(), lpserviceconfig.toString(), cbbufsize.toInt(), pcbbytesneeded.toString()) as Int) else 0

public actual fun QueryServiceDynamicInformation(hservicestatus: SERVICE_STATUS_HANDLE, dwinfolevel: UInt, ppdynamicinfo: Long): BOOL =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_QueryServiceDynamicInformation(hservicestatus.toString(), dwinfolevel.toInt(), ppdynamicinfo.toString()) as Int) else 0

public actual fun QueryServiceLockStatusA(hscmanager: SC_HANDLE, lplockstatus: Long, cbbufsize: UInt, pcbbytesneeded: Long): BOOL =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_QueryServiceLockStatusA(hscmanager.toString(), lplockstatus.toString(), cbbufsize.toInt(), pcbbytesneeded.toString()) as Int) else 0

public actual fun QueryServiceLockStatusW(hscmanager: SC_HANDLE, lplockstatus: Long, cbbufsize: UInt, pcbbytesneeded: Long): BOOL =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_QueryServiceLockStatusW(hscmanager.toString(), lplockstatus.toString(), cbbufsize.toInt(), pcbbytesneeded.toString()) as Int) else 0

public actual fun QueryServiceObjectSecurity(hservice: SC_HANDLE, dwsecurityinformation: UInt, lpsecuritydescriptor: PSECURITY_DESCRIPTOR, cbbufsize: UInt, pcbbytesneeded: Long): BOOL =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_QueryServiceObjectSecurity(hservice.toString(), dwsecurityinformation.toInt(), lpsecuritydescriptor.toString(), cbbufsize.toInt(), pcbbytesneeded.toString()) as Int) else 0

public actual fun QueryServiceStatus(hservice: SC_HANDLE, lpservicestatus: Long): BOOL =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_QueryServiceStatus(hservice.toString(), lpservicestatus.toString()) as Int) else 0

public actual fun QueryServiceStatusEx(hservice: SC_HANDLE, infolevel: SC_STATUS_TYPE, lpbuffer: Long, cbbufsize: UInt, pcbbytesneeded: Long): BOOL =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_QueryServiceStatusEx(hservice.toString(), infolevel, lpbuffer.toString(), cbbufsize.toInt(), pcbbytesneeded.toString()) as Int) else 0

public actual fun RegisterServiceCtrlHandlerA(lpservicename: PCSTR, lphandlerproc: LPHANDLER_FUNCTION): SERVICE_STATUS_HANDLE =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_RegisterServiceCtrlHandlerA(lpservicename.toString(), lphandlerproc.toLong().toString()) as String).toLong() else 0L

public actual fun RegisterServiceCtrlHandlerExA(lpservicename: PCSTR, lphandlerproc: LPHANDLER_FUNCTION_EX, lpcontext: Long): SERVICE_STATUS_HANDLE =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_RegisterServiceCtrlHandlerExA(lpservicename.toString(), lphandlerproc.toLong().toString(), lpcontext.toString()) as String).toLong() else 0L

public actual fun RegisterServiceCtrlHandlerExW(lpservicename: PCWSTR, lphandlerproc: LPHANDLER_FUNCTION_EX, lpcontext: Long): SERVICE_STATUS_HANDLE =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_RegisterServiceCtrlHandlerExW(lpservicename.toString(), lphandlerproc.toLong().toString(), lpcontext.toString()) as String).toLong() else 0L

public actual fun RegisterServiceCtrlHandlerW(lpservicename: PCWSTR, lphandlerproc: LPHANDLER_FUNCTION): SERVICE_STATUS_HANDLE =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_RegisterServiceCtrlHandlerW(lpservicename.toString(), lphandlerproc.toLong().toString()) as String).toLong() else 0L

public actual fun SetServiceBits(hservicestatus: SERVICE_STATUS_HANDLE, dwservicebits: UInt, bsetbitson: BOOL, bupdateimmediately: BOOL): BOOL =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_SetServiceBits(hservicestatus.toString(), dwservicebits.toInt(), bsetbitson, bupdateimmediately) as Int) else 0

public actual fun SetServiceObjectSecurity(hservice: SC_HANDLE, dwsecurityinformation: OBJECT_SECURITY_INFORMATION, lpsecuritydescriptor: PSECURITY_DESCRIPTOR): BOOL =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_SetServiceObjectSecurity(hservice.toString(), dwsecurityinformation.toInt(), lpsecuritydescriptor.toString()) as Int) else 0

public actual fun SetServiceStatus(hservicestatus: SERVICE_STATUS_HANDLE, lpservicestatus: Long): BOOL =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_SetServiceStatus(hservicestatus.toString(), lpservicestatus.toString()) as Int) else 0

public actual fun StartServiceA(hservice: SC_HANDLE, dwnumserviceargs: UInt, lpserviceargvectors: Long): BOOL =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_StartServiceA(hservice.toString(), dwnumserviceargs.toInt(), lpserviceargvectors.toString()) as Int) else 0

public actual fun StartServiceCtrlDispatcherA(lpservicestarttable: Long): BOOL =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_StartServiceCtrlDispatcherA(lpservicestarttable.toString()) as Int) else 0

public actual fun StartServiceCtrlDispatcherW(lpservicestarttable: Long): BOOL =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_StartServiceCtrlDispatcherW(lpservicestarttable.toString()) as Int) else 0

public actual fun StartServiceW(hservice: SC_HANDLE, dwnumserviceargs: UInt, lpserviceargvectors: Long): BOOL =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_StartServiceW(hservice.toString(), dwnumserviceargs.toInt(), lpserviceargvectors.toString()) as Int) else 0

public actual fun SubscribeServiceChangeNotifications(hservice: SC_HANDLE, eeventtype: SC_EVENT_TYPE, pcallback: PSC_NOTIFICATION_CALLBACK, pcallbackcontext: Long, psubscription: Long): UInt =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_SubscribeServiceChangeNotifications(hservice.toString(), eeventtype, pcallback.toLong().toString(), pcallbackcontext.toString(), psubscription.toString()) as Int).toUInt() else 0u

public actual fun UnlockServiceDatabase(sclock: Long): BOOL =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_UnlockServiceDatabase(sclock.toString()) as Int) else 0

public actual fun UnsubscribeServiceChangeNotifications(psubscription: PSC_NOTIFICATION_REGISTRATION) {
    if (_windowsWin32SystemServicesNapiAddon != null) {
        _windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_UnsubscribeServiceChangeNotifications(psubscription.toString())
    }
}

public actual fun WaitServiceState(hservice: SC_HANDLE, dwnotify: UInt, dwtimeout: UInt, hcancelevent: HANDLE): UInt =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_WaitServiceState(hservice.toString(), dwnotify.toInt(), dwtimeout.toInt(), hcancelevent.toString()) as Int).toUInt() else 0u
