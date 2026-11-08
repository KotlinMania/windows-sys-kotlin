package io.github.kotlinmania.windowssys.windows.win32.system.services

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.security.OBJECT_SECURITY_INFORMATION
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR

public fun interface FnCallback {
    public operator fun invoke(dwcontrol: UInt)
}

public fun interface FnCallback1 {
    public operator fun invoke(dwcontrol: UInt, dweventtype: UInt, lpeventdata: Long, lpcontext: Long): UInt
}

public fun interface FnCallback2 {
    public operator fun invoke(dwnotify: UInt, pcallbackcontext: Long)
}

public fun ChangeServiceConfig2A(hservice: SC_HANDLE, dwinfolevel: SERVICE_CONFIG, lpinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "ChangeServiceConfig2A", longArrayOf(hservice, dwinfolevel.toLong(), lpinfo)).toInt()
}

public fun ChangeServiceConfig2W(hservice: SC_HANDLE, dwinfolevel: SERVICE_CONFIG, lpinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "ChangeServiceConfig2W", longArrayOf(hservice, dwinfolevel.toLong(), lpinfo)).toInt()
}

public fun ChangeServiceConfigA(hservice: SC_HANDLE, dwservicetype: ENUM_SERVICE_TYPE, dwstarttype: SERVICE_START_TYPE, dwerrorcontrol: SERVICE_ERROR, lpbinarypathname: PCSTR, lploadordergroup: PCSTR, lpdwtagid: Long, lpdependencies: PCSTR, lpservicestartname: PCSTR, lppassword: PCSTR, lpdisplayname: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "ChangeServiceConfigA", longArrayOf(hservice, dwservicetype.toLong(), dwstarttype.toLong(), dwerrorcontrol.toLong(), lpbinarypathname, lploadordergroup, lpdwtagid, lpdependencies, lpservicestartname, lppassword, lpdisplayname)).toInt()
}

public fun ChangeServiceConfigW(hservice: SC_HANDLE, dwservicetype: ENUM_SERVICE_TYPE, dwstarttype: SERVICE_START_TYPE, dwerrorcontrol: SERVICE_ERROR, lpbinarypathname: PCWSTR, lploadordergroup: PCWSTR, lpdwtagid: Long, lpdependencies: PCWSTR, lpservicestartname: PCWSTR, lppassword: PCWSTR, lpdisplayname: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "ChangeServiceConfigW", longArrayOf(hservice, dwservicetype.toLong(), dwstarttype.toLong(), dwerrorcontrol.toLong(), lpbinarypathname, lploadordergroup, lpdwtagid, lpdependencies, lpservicestartname, lppassword, lpdisplayname)).toInt()
}

public fun CloseServiceHandle(hscobject: SC_HANDLE): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CloseServiceHandle", longArrayOf(hscobject)).toInt()
}

public fun ControlService(hservice: SC_HANDLE, dwcontrol: UInt, lpservicestatus: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "ControlService", longArrayOf(hservice, dwcontrol.toLong(), lpservicestatus)).toInt()
}

public fun ControlServiceExA(hservice: SC_HANDLE, dwcontrol: UInt, dwinfolevel: UInt, pcontrolparams: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "ControlServiceExA", longArrayOf(hservice, dwcontrol.toLong(), dwinfolevel.toLong(), pcontrolparams)).toInt()
}

public fun ControlServiceExW(hservice: SC_HANDLE, dwcontrol: UInt, dwinfolevel: UInt, pcontrolparams: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "ControlServiceExW", longArrayOf(hservice, dwcontrol.toLong(), dwinfolevel.toLong(), pcontrolparams)).toInt()
}

public fun CreateServiceA(hscmanager: SC_HANDLE, lpservicename: PCSTR, lpdisplayname: PCSTR, dwdesiredaccess: UInt, dwservicetype: ENUM_SERVICE_TYPE, dwstarttype: SERVICE_START_TYPE, dwerrorcontrol: SERVICE_ERROR, lpbinarypathname: PCSTR, lploadordergroup: PCSTR, lpdwtagid: Long, lpdependencies: PCSTR, lpservicestartname: PCSTR, lppassword: PCSTR): SC_HANDLE {
    return Win32DynamicFfi.invoke("advapi32.dll", "CreateServiceA", longArrayOf(hscmanager, lpservicename, lpdisplayname, dwdesiredaccess.toLong(), dwservicetype.toLong(), dwstarttype.toLong(), dwerrorcontrol.toLong(), lpbinarypathname, lploadordergroup, lpdwtagid, lpdependencies, lpservicestartname, lppassword))
}

public fun CreateServiceW(hscmanager: SC_HANDLE, lpservicename: PCWSTR, lpdisplayname: PCWSTR, dwdesiredaccess: UInt, dwservicetype: ENUM_SERVICE_TYPE, dwstarttype: SERVICE_START_TYPE, dwerrorcontrol: SERVICE_ERROR, lpbinarypathname: PCWSTR, lploadordergroup: PCWSTR, lpdwtagid: Long, lpdependencies: PCWSTR, lpservicestartname: PCWSTR, lppassword: PCWSTR): SC_HANDLE {
    return Win32DynamicFfi.invoke("advapi32.dll", "CreateServiceW", longArrayOf(hscmanager, lpservicename, lpdisplayname, dwdesiredaccess.toLong(), dwservicetype.toLong(), dwstarttype.toLong(), dwerrorcontrol.toLong(), lpbinarypathname, lploadordergroup, lpdwtagid, lpdependencies, lpservicestartname, lppassword))
}

public fun DeleteService(hservice: SC_HANDLE): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "DeleteService", longArrayOf(hservice)).toInt()
}

public fun EnumDependentServicesA(hservice: SC_HANDLE, dwservicestate: ENUM_SERVICE_STATE, lpservices: Long, cbbufsize: UInt, pcbbytesneeded: Long, lpservicesreturned: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "EnumDependentServicesA", longArrayOf(hservice, dwservicestate.toLong(), lpservices, cbbufsize.toLong(), pcbbytesneeded, lpservicesreturned)).toInt()
}

public fun EnumDependentServicesW(hservice: SC_HANDLE, dwservicestate: ENUM_SERVICE_STATE, lpservices: Long, cbbufsize: UInt, pcbbytesneeded: Long, lpservicesreturned: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "EnumDependentServicesW", longArrayOf(hservice, dwservicestate.toLong(), lpservices, cbbufsize.toLong(), pcbbytesneeded, lpservicesreturned)).toInt()
}

public fun EnumServicesStatusA(hscmanager: SC_HANDLE, dwservicetype: ENUM_SERVICE_TYPE, dwservicestate: ENUM_SERVICE_STATE, lpservices: Long, cbbufsize: UInt, pcbbytesneeded: Long, lpservicesreturned: Long, lpresumehandle: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "EnumServicesStatusA", longArrayOf(hscmanager, dwservicetype.toLong(), dwservicestate.toLong(), lpservices, cbbufsize.toLong(), pcbbytesneeded, lpservicesreturned, lpresumehandle)).toInt()
}

public fun EnumServicesStatusExA(hscmanager: SC_HANDLE, infolevel: SC_ENUM_TYPE, dwservicetype: ENUM_SERVICE_TYPE, dwservicestate: ENUM_SERVICE_STATE, lpservices: Long, cbbufsize: UInt, pcbbytesneeded: Long, lpservicesreturned: Long, lpresumehandle: Long, pszgroupname: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "EnumServicesStatusExA", longArrayOf(hscmanager, infolevel.toLong(), dwservicetype.toLong(), dwservicestate.toLong(), lpservices, cbbufsize.toLong(), pcbbytesneeded, lpservicesreturned, lpresumehandle, pszgroupname)).toInt()
}

public fun EnumServicesStatusExW(hscmanager: SC_HANDLE, infolevel: SC_ENUM_TYPE, dwservicetype: ENUM_SERVICE_TYPE, dwservicestate: ENUM_SERVICE_STATE, lpservices: Long, cbbufsize: UInt, pcbbytesneeded: Long, lpservicesreturned: Long, lpresumehandle: Long, pszgroupname: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "EnumServicesStatusExW", longArrayOf(hscmanager, infolevel.toLong(), dwservicetype.toLong(), dwservicestate.toLong(), lpservices, cbbufsize.toLong(), pcbbytesneeded, lpservicesreturned, lpresumehandle, pszgroupname)).toInt()
}

public fun EnumServicesStatusW(hscmanager: SC_HANDLE, dwservicetype: ENUM_SERVICE_TYPE, dwservicestate: ENUM_SERVICE_STATE, lpservices: Long, cbbufsize: UInt, pcbbytesneeded: Long, lpservicesreturned: Long, lpresumehandle: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "EnumServicesStatusW", longArrayOf(hscmanager, dwservicetype.toLong(), dwservicestate.toLong(), lpservices, cbbufsize.toLong(), pcbbytesneeded, lpservicesreturned, lpresumehandle)).toInt()
}

public fun GetServiceDirectory(hservicestatus: SERVICE_STATUS_HANDLE, edirectorytype: SERVICE_DIRECTORY_TYPE, lppathbuffer: PWSTR, cchpathbufferlength: UInt, lpcchrequiredbufferlength: Long): UInt {
    return Win32DynamicFfi.invoke("api-ms-win-service-core-l1-1-4.dll", "GetServiceDirectory", longArrayOf(hservicestatus, edirectorytype.toLong(), lppathbuffer, cchpathbufferlength.toLong(), lpcchrequiredbufferlength)).toUInt()
}

public fun GetServiceDisplayNameA(hscmanager: SC_HANDLE, lpservicename: PCSTR, lpdisplayname: PSTR, lpcchbuffer: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "GetServiceDisplayNameA", longArrayOf(hscmanager, lpservicename, lpdisplayname, lpcchbuffer)).toInt()
}

public fun GetServiceDisplayNameW(hscmanager: SC_HANDLE, lpservicename: PCWSTR, lpdisplayname: PWSTR, lpcchbuffer: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "GetServiceDisplayNameW", longArrayOf(hscmanager, lpservicename, lpdisplayname, lpcchbuffer)).toInt()
}

public fun GetServiceKeyNameA(hscmanager: SC_HANDLE, lpdisplayname: PCSTR, lpservicename: PSTR, lpcchbuffer: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "GetServiceKeyNameA", longArrayOf(hscmanager, lpdisplayname, lpservicename, lpcchbuffer)).toInt()
}

public fun GetServiceKeyNameW(hscmanager: SC_HANDLE, lpdisplayname: PCWSTR, lpservicename: PWSTR, lpcchbuffer: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "GetServiceKeyNameW", longArrayOf(hscmanager, lpdisplayname, lpservicename, lpcchbuffer)).toInt()
}

public fun GetServiceRegistryStateKey(servicestatushandle: SERVICE_STATUS_HANDLE, statetype: SERVICE_REGISTRY_STATE_TYPE, accessmask: UInt, servicestatekey: Long): UInt {
    return Win32DynamicFfi.invoke("api-ms-win-service-core-l1-1-3.dll", "GetServiceRegistryStateKey", longArrayOf(servicestatushandle, statetype.toLong(), accessmask.toLong(), servicestatekey)).toUInt()
}

public fun GetSharedServiceDirectory(servicehandle: SC_HANDLE, directorytype: SERVICE_SHARED_DIRECTORY_TYPE, pathbuffer: PWSTR, pathbufferlength: UInt, requiredbufferlength: Long): UInt {
    return Win32DynamicFfi.invoke("api-ms-win-service-core-l1-1-5.dll", "GetSharedServiceDirectory", longArrayOf(servicehandle, directorytype.toLong(), pathbuffer, pathbufferlength.toLong(), requiredbufferlength)).toUInt()
}

public fun GetSharedServiceRegistryStateKey(servicehandle: SC_HANDLE, statetype: SERVICE_SHARED_REGISTRY_STATE_TYPE, accessmask: UInt, servicestatekey: Long): UInt {
    return Win32DynamicFfi.invoke("api-ms-win-service-core-l1-1-5.dll", "GetSharedServiceRegistryStateKey", longArrayOf(servicehandle, statetype.toLong(), accessmask.toLong(), servicestatekey)).toUInt()
}

public fun LockServiceDatabase(hscmanager: SC_HANDLE): Long {
    return Win32DynamicFfi.invoke("advapi32.dll", "LockServiceDatabase", longArrayOf(hscmanager))
}

public fun NotifyBootConfigStatus(bootacceptable: BOOL): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "NotifyBootConfigStatus", longArrayOf(bootacceptable.toLong())).toInt()
}

public fun NotifyServiceStatusChangeA(hservice: SC_HANDLE, dwnotifymask: SERVICE_NOTIFY, pnotifybuffer: Long): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "NotifyServiceStatusChangeA", longArrayOf(hservice, dwnotifymask.toLong(), pnotifybuffer)).toUInt()
}

public fun NotifyServiceStatusChangeW(hservice: SC_HANDLE, dwnotifymask: SERVICE_NOTIFY, pnotifybuffer: Long): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "NotifyServiceStatusChangeW", longArrayOf(hservice, dwnotifymask.toLong(), pnotifybuffer)).toUInt()
}

public fun OpenSCManagerA(lpmachinename: PCSTR, lpdatabasename: PCSTR, dwdesiredaccess: UInt): SC_HANDLE {
    return Win32DynamicFfi.invoke("advapi32.dll", "OpenSCManagerA", longArrayOf(lpmachinename, lpdatabasename, dwdesiredaccess.toLong()))
}

public fun OpenSCManagerW(lpmachinename: PCWSTR, lpdatabasename: PCWSTR, dwdesiredaccess: UInt): SC_HANDLE {
    return Win32DynamicFfi.invoke("advapi32.dll", "OpenSCManagerW", longArrayOf(lpmachinename, lpdatabasename, dwdesiredaccess.toLong()))
}

public fun OpenServiceA(hscmanager: SC_HANDLE, lpservicename: PCSTR, dwdesiredaccess: UInt): SC_HANDLE {
    return Win32DynamicFfi.invoke("advapi32.dll", "OpenServiceA", longArrayOf(hscmanager, lpservicename, dwdesiredaccess.toLong()))
}

public fun OpenServiceW(hscmanager: SC_HANDLE, lpservicename: PCWSTR, dwdesiredaccess: UInt): SC_HANDLE {
    return Win32DynamicFfi.invoke("advapi32.dll", "OpenServiceW", longArrayOf(hscmanager, lpservicename, dwdesiredaccess.toLong()))
}

public fun QueryServiceConfig2A(hservice: SC_HANDLE, dwinfolevel: SERVICE_CONFIG, lpbuffer: Long, cbbufsize: UInt, pcbbytesneeded: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "QueryServiceConfig2A", longArrayOf(hservice, dwinfolevel.toLong(), lpbuffer, cbbufsize.toLong(), pcbbytesneeded)).toInt()
}

public fun QueryServiceConfig2W(hservice: SC_HANDLE, dwinfolevel: SERVICE_CONFIG, lpbuffer: Long, cbbufsize: UInt, pcbbytesneeded: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "QueryServiceConfig2W", longArrayOf(hservice, dwinfolevel.toLong(), lpbuffer, cbbufsize.toLong(), pcbbytesneeded)).toInt()
}

public fun QueryServiceConfigA(hservice: SC_HANDLE, lpserviceconfig: Long, cbbufsize: UInt, pcbbytesneeded: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "QueryServiceConfigA", longArrayOf(hservice, lpserviceconfig, cbbufsize.toLong(), pcbbytesneeded)).toInt()
}

public fun QueryServiceConfigW(hservice: SC_HANDLE, lpserviceconfig: Long, cbbufsize: UInt, pcbbytesneeded: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "QueryServiceConfigW", longArrayOf(hservice, lpserviceconfig, cbbufsize.toLong(), pcbbytesneeded)).toInt()
}

public fun QueryServiceDynamicInformation(hservicestatus: SERVICE_STATUS_HANDLE, dwinfolevel: UInt, ppdynamicinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "QueryServiceDynamicInformation", longArrayOf(hservicestatus, dwinfolevel.toLong(), ppdynamicinfo)).toInt()
}

public fun QueryServiceLockStatusA(hscmanager: SC_HANDLE, lplockstatus: Long, cbbufsize: UInt, pcbbytesneeded: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "QueryServiceLockStatusA", longArrayOf(hscmanager, lplockstatus, cbbufsize.toLong(), pcbbytesneeded)).toInt()
}

public fun QueryServiceLockStatusW(hscmanager: SC_HANDLE, lplockstatus: Long, cbbufsize: UInt, pcbbytesneeded: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "QueryServiceLockStatusW", longArrayOf(hscmanager, lplockstatus, cbbufsize.toLong(), pcbbytesneeded)).toInt()
}

public fun QueryServiceObjectSecurity(hservice: SC_HANDLE, dwsecurityinformation: UInt, lpsecuritydescriptor: PSECURITY_DESCRIPTOR, cbbufsize: UInt, pcbbytesneeded: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "QueryServiceObjectSecurity", longArrayOf(hservice, dwsecurityinformation.toLong(), lpsecuritydescriptor, cbbufsize.toLong(), pcbbytesneeded)).toInt()
}

public fun QueryServiceStatus(hservice: SC_HANDLE, lpservicestatus: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "QueryServiceStatus", longArrayOf(hservice, lpservicestatus)).toInt()
}

public fun QueryServiceStatusEx(hservice: SC_HANDLE, infolevel: SC_STATUS_TYPE, lpbuffer: Long, cbbufsize: UInt, pcbbytesneeded: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "QueryServiceStatusEx", longArrayOf(hservice, infolevel.toLong(), lpbuffer, cbbufsize.toLong(), pcbbytesneeded)).toInt()
}

public fun RegisterServiceCtrlHandlerA(lpservicename: PCSTR, lphandlerproc: LPHANDLER_FUNCTION): SERVICE_STATUS_HANDLE {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegisterServiceCtrlHandlerA", longArrayOf(lpservicename, Win32DynamicFfi.objectSlot(lphandlerproc)))
}

public fun RegisterServiceCtrlHandlerExA(lpservicename: PCSTR, lphandlerproc: LPHANDLER_FUNCTION_EX, lpcontext: Long): SERVICE_STATUS_HANDLE {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegisterServiceCtrlHandlerExA", longArrayOf(lpservicename, Win32DynamicFfi.objectSlot(lphandlerproc), lpcontext))
}

public fun RegisterServiceCtrlHandlerExW(lpservicename: PCWSTR, lphandlerproc: LPHANDLER_FUNCTION_EX, lpcontext: Long): SERVICE_STATUS_HANDLE {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegisterServiceCtrlHandlerExW", longArrayOf(lpservicename, Win32DynamicFfi.objectSlot(lphandlerproc), lpcontext))
}

public fun RegisterServiceCtrlHandlerW(lpservicename: PCWSTR, lphandlerproc: LPHANDLER_FUNCTION): SERVICE_STATUS_HANDLE {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegisterServiceCtrlHandlerW", longArrayOf(lpservicename, Win32DynamicFfi.objectSlot(lphandlerproc)))
}

public fun SetServiceBits(hservicestatus: SERVICE_STATUS_HANDLE, dwservicebits: UInt, bsetbitson: BOOL, bupdateimmediately: BOOL): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "SetServiceBits", longArrayOf(hservicestatus, dwservicebits.toLong(), bsetbitson.toLong(), bupdateimmediately.toLong())).toInt()
}

public fun SetServiceObjectSecurity(hservice: SC_HANDLE, dwsecurityinformation: OBJECT_SECURITY_INFORMATION, lpsecuritydescriptor: PSECURITY_DESCRIPTOR): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "SetServiceObjectSecurity", longArrayOf(hservice, dwsecurityinformation.toLong(), lpsecuritydescriptor)).toInt()
}

public fun SetServiceStatus(hservicestatus: SERVICE_STATUS_HANDLE, lpservicestatus: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "SetServiceStatus", longArrayOf(hservicestatus, lpservicestatus)).toInt()
}

public fun StartServiceA(hservice: SC_HANDLE, dwnumserviceargs: UInt, lpserviceargvectors: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "StartServiceA", longArrayOf(hservice, dwnumserviceargs.toLong(), lpserviceargvectors)).toInt()
}

public fun StartServiceCtrlDispatcherA(lpservicestarttable: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "StartServiceCtrlDispatcherA", longArrayOf(lpservicestarttable)).toInt()
}

public fun StartServiceCtrlDispatcherW(lpservicestarttable: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "StartServiceCtrlDispatcherW", longArrayOf(lpservicestarttable)).toInt()
}

public fun StartServiceW(hservice: SC_HANDLE, dwnumserviceargs: UInt, lpserviceargvectors: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "StartServiceW", longArrayOf(hservice, dwnumserviceargs.toLong(), lpserviceargvectors)).toInt()
}

public fun SubscribeServiceChangeNotifications(hservice: SC_HANDLE, eeventtype: SC_EVENT_TYPE, pcallback: PSC_NOTIFICATION_CALLBACK, pcallbackcontext: Long, psubscription: Long): UInt {
    return Win32DynamicFfi.invoke("sechost.dll", "SubscribeServiceChangeNotifications", longArrayOf(hservice, eeventtype.toLong(), Win32DynamicFfi.objectSlot(pcallback), pcallbackcontext, psubscription)).toUInt()
}

public fun UnlockServiceDatabase(sclock: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "UnlockServiceDatabase", longArrayOf(sclock)).toInt()
}

public fun UnsubscribeServiceChangeNotifications(psubscription: PSC_NOTIFICATION_REGISTRATION) {
    Win32DynamicFfi.invoke("sechost.dll", "UnsubscribeServiceChangeNotifications", longArrayOf(psubscription))
}

public fun WaitServiceState(hservice: SC_HANDLE, dwnotify: UInt, dwtimeout: UInt, hcancelevent: HANDLE): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "WaitServiceState", longArrayOf(hservice, dwnotify.toLong(), dwtimeout.toLong(), hcancelevent)).toUInt()
}
