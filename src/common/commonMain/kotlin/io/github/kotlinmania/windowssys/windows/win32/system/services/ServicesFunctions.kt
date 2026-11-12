package io.github.kotlinmania.windowssys.windows.win32.system.services

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

public expect fun changeServiceConfig2A(hservice: ScHandle, dwinfolevel: ServiceConfig, lpinfo: ConstPtr): Bool

public expect fun changeServiceConfig2W(hservice: ScHandle, dwinfolevel: ServiceConfig, lpinfo: ConstPtr): Bool

public expect fun changeServiceConfigA(hservice: ScHandle, dwservicetype: EnumServiceType, dwstarttype: ServiceStartType, dwerrorcontrol: ServiceError, lpbinarypathname: Pcstr, lploadordergroup: Pcstr, lpdwtagid: MutPtr, lpdependencies: Pcstr, lpservicestartname: Pcstr, lppassword: Pcstr, lpdisplayname: Pcstr): Bool

public expect fun changeServiceConfigW(hservice: ScHandle, dwservicetype: EnumServiceType, dwstarttype: ServiceStartType, dwerrorcontrol: ServiceError, lpbinarypathname: Pcwstr, lploadordergroup: Pcwstr, lpdwtagid: MutPtr, lpdependencies: Pcwstr, lpservicestartname: Pcwstr, lppassword: Pcwstr, lpdisplayname: Pcwstr): Bool

public expect fun closeServiceHandle(hscobject: ScHandle): Bool

public expect fun controlService(hservice: ScHandle, dwcontrol: UInt, lpservicestatus: MutPtr): Bool

public expect fun controlServiceExA(hservice: ScHandle, dwcontrol: UInt, dwinfolevel: UInt, pcontrolparams: MutPtr): Bool

public expect fun controlServiceExW(hservice: ScHandle, dwcontrol: UInt, dwinfolevel: UInt, pcontrolparams: MutPtr): Bool

public expect fun createServiceA(hscmanager: ScHandle, lpservicename: Pcstr, lpdisplayname: Pcstr, dwdesiredaccess: UInt, dwservicetype: EnumServiceType, dwstarttype: ServiceStartType, dwerrorcontrol: ServiceError, lpbinarypathname: Pcstr, lploadordergroup: Pcstr, lpdwtagid: MutPtr, lpdependencies: Pcstr, lpservicestartname: Pcstr, lppassword: Pcstr): ScHandle

public expect fun createServiceW(hscmanager: ScHandle, lpservicename: Pcwstr, lpdisplayname: Pcwstr, dwdesiredaccess: UInt, dwservicetype: EnumServiceType, dwstarttype: ServiceStartType, dwerrorcontrol: ServiceError, lpbinarypathname: Pcwstr, lploadordergroup: Pcwstr, lpdwtagid: MutPtr, lpdependencies: Pcwstr, lpservicestartname: Pcwstr, lppassword: Pcwstr): ScHandle

public expect fun deleteService(hservice: ScHandle): Bool

public expect fun enumDependentServicesA(hservice: ScHandle, dwservicestate: EnumServiceState, lpservices: MutPtr, cbbufsize: UInt, pcbbytesneeded: MutPtr, lpservicesreturned: MutPtr): Bool

public expect fun enumDependentServicesW(hservice: ScHandle, dwservicestate: EnumServiceState, lpservices: MutPtr, cbbufsize: UInt, pcbbytesneeded: MutPtr, lpservicesreturned: MutPtr): Bool

public expect fun enumServicesStatusA(hscmanager: ScHandle, dwservicetype: EnumServiceType, dwservicestate: EnumServiceState, lpservices: MutPtr, cbbufsize: UInt, pcbbytesneeded: MutPtr, lpservicesreturned: MutPtr, lpresumehandle: MutPtr): Bool

public expect fun enumServicesStatusExA(hscmanager: ScHandle, infolevel: ScEnumType, dwservicetype: EnumServiceType, dwservicestate: EnumServiceState, lpservices: MutPtr, cbbufsize: UInt, pcbbytesneeded: MutPtr, lpservicesreturned: MutPtr, lpresumehandle: MutPtr, pszgroupname: Pcstr): Bool

public expect fun enumServicesStatusExW(hscmanager: ScHandle, infolevel: ScEnumType, dwservicetype: EnumServiceType, dwservicestate: EnumServiceState, lpservices: MutPtr, cbbufsize: UInt, pcbbytesneeded: MutPtr, lpservicesreturned: MutPtr, lpresumehandle: MutPtr, pszgroupname: Pcwstr): Bool

public expect fun enumServicesStatusW(hscmanager: ScHandle, dwservicetype: EnumServiceType, dwservicestate: EnumServiceState, lpservices: MutPtr, cbbufsize: UInt, pcbbytesneeded: MutPtr, lpservicesreturned: MutPtr, lpresumehandle: MutPtr): Bool

public expect fun getServiceDirectory(hservicestatus: ServiceStatusHandle, edirectorytype: ServiceDirectoryType, lppathbuffer: Pwstr, cchpathbufferlength: UInt, lpcchrequiredbufferlength: MutPtr): UInt

public expect fun getServiceDisplayNameA(hscmanager: ScHandle, lpservicename: Pcstr, lpdisplayname: Pstr, lpcchbuffer: MutPtr): Bool

public expect fun getServiceDisplayNameW(hscmanager: ScHandle, lpservicename: Pcwstr, lpdisplayname: Pwstr, lpcchbuffer: MutPtr): Bool

public expect fun getServiceKeyNameA(hscmanager: ScHandle, lpdisplayname: Pcstr, lpservicename: Pstr, lpcchbuffer: MutPtr): Bool

public expect fun getServiceKeyNameW(hscmanager: ScHandle, lpdisplayname: Pcwstr, lpservicename: Pwstr, lpcchbuffer: MutPtr): Bool

public expect fun getServiceRegistryStateKey(servicestatushandle: ServiceStatusHandle, statetype: ServiceRegistryStateType, accessmask: UInt, servicestatekey: MutPtr): UInt

public expect fun getSharedServiceDirectory(servicehandle: ScHandle, directorytype: ServiceSharedDirectoryType, pathbuffer: Pwstr, pathbufferlength: UInt, requiredbufferlength: MutPtr): UInt

public expect fun getSharedServiceRegistryStateKey(servicehandle: ScHandle, statetype: ServiceSharedRegistryStateType, accessmask: UInt, servicestatekey: MutPtr): UInt

public expect fun lockServiceDatabase(hscmanager: ScHandle): MutPtr

public expect fun notifyBootConfigStatus(bootacceptable: Bool): Bool

public expect fun notifyServiceStatusChangeA(hservice: ScHandle, dwnotifymask: ServiceNotify, pnotifybuffer: ConstPtr): UInt

public expect fun notifyServiceStatusChangeW(hservice: ScHandle, dwnotifymask: ServiceNotify, pnotifybuffer: ConstPtr): UInt

public expect fun openSCManagerA(lpmachinename: Pcstr, lpdatabasename: Pcstr, dwdesiredaccess: UInt): ScHandle

public expect fun openSCManagerW(lpmachinename: Pcwstr, lpdatabasename: Pcwstr, dwdesiredaccess: UInt): ScHandle

public expect fun openServiceA(hscmanager: ScHandle, lpservicename: Pcstr, dwdesiredaccess: UInt): ScHandle

public expect fun openServiceW(hscmanager: ScHandle, lpservicename: Pcwstr, dwdesiredaccess: UInt): ScHandle

public expect fun queryServiceConfig2A(hservice: ScHandle, dwinfolevel: ServiceConfig, lpbuffer: MutPtr, cbbufsize: UInt, pcbbytesneeded: MutPtr): Bool

public expect fun queryServiceConfig2W(hservice: ScHandle, dwinfolevel: ServiceConfig, lpbuffer: MutPtr, cbbufsize: UInt, pcbbytesneeded: MutPtr): Bool

public expect fun queryServiceConfigA(hservice: ScHandle, lpserviceconfig: MutPtr, cbbufsize: UInt, pcbbytesneeded: MutPtr): Bool

public expect fun queryServiceConfigW(hservice: ScHandle, lpserviceconfig: MutPtr, cbbufsize: UInt, pcbbytesneeded: MutPtr): Bool

public expect fun queryServiceDynamicInformation(hservicestatus: ServiceStatusHandle, dwinfolevel: UInt, ppdynamicinfo: MutPtr): Bool

public expect fun queryServiceLockStatusA(hscmanager: ScHandle, lplockstatus: MutPtr, cbbufsize: UInt, pcbbytesneeded: MutPtr): Bool

public expect fun queryServiceLockStatusW(hscmanager: ScHandle, lplockstatus: MutPtr, cbbufsize: UInt, pcbbytesneeded: MutPtr): Bool

public expect fun queryServiceObjectSecurity(hservice: ScHandle, dwsecurityinformation: UInt, lpsecuritydescriptor: PsecurityDescriptor, cbbufsize: UInt, pcbbytesneeded: MutPtr): Bool

public expect fun queryServiceStatus(hservice: ScHandle, lpservicestatus: MutPtr): Bool

public expect fun queryServiceStatusEx(hservice: ScHandle, infolevel: ScStatusType, lpbuffer: MutPtr, cbbufsize: UInt, pcbbytesneeded: MutPtr): Bool

public expect fun registerServiceCtrlHandlerA(lpservicename: Pcstr, lphandlerproc: LphandlerFunction): ServiceStatusHandle

public expect fun registerServiceCtrlHandlerExA(lpservicename: Pcstr, lphandlerproc: LphandlerFunctionEx, lpcontext: ConstPtr): ServiceStatusHandle

public expect fun registerServiceCtrlHandlerExW(lpservicename: Pcwstr, lphandlerproc: LphandlerFunctionEx, lpcontext: ConstPtr): ServiceStatusHandle

public expect fun registerServiceCtrlHandlerW(lpservicename: Pcwstr, lphandlerproc: LphandlerFunction): ServiceStatusHandle

public expect fun setServiceBits(hservicestatus: ServiceStatusHandle, dwservicebits: UInt, bsetbitson: Bool, bupdateimmediately: Bool): Bool

public expect fun setServiceObjectSecurity(hservice: ScHandle, dwsecurityinformation: ObjectSecurityInformation, lpsecuritydescriptor: PsecurityDescriptor): Bool

public expect fun setServiceStatus(hservicestatus: ServiceStatusHandle, lpservicestatus: ConstPtr): Bool

public expect fun startServiceA(hservice: ScHandle, dwnumserviceargs: UInt, lpserviceargvectors: ConstPtr): Bool

public expect fun startServiceCtrlDispatcherA(lpservicestarttable: ConstPtr): Bool

public expect fun startServiceCtrlDispatcherW(lpservicestarttable: ConstPtr): Bool

public expect fun startServiceW(hservice: ScHandle, dwnumserviceargs: UInt, lpserviceargvectors: ConstPtr): Bool

public expect fun subscribeServiceChangeNotifications(hservice: ScHandle, eeventtype: ScEventType, pcallback: PscNotificationCallback, pcallbackcontext: ConstPtr, psubscription: MutPtr): UInt

public expect fun unlockServiceDatabase(sclock: ConstPtr): Bool

public expect fun unsubscribeServiceChangeNotifications(psubscription: PscNotificationRegistration)

public expect fun waitServiceState(hservice: ScHandle, dwnotify: UInt, dwtimeout: UInt, hcancelevent: Handle): UInt
