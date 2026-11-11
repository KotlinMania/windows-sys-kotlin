@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_changeServiceConfig2A
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_changeServiceConfig2W
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_changeServiceConfigA
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_changeServiceConfigW
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_closeServiceHandle
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_controlService
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_controlServiceExA
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_controlServiceExW
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_createServiceA
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_createServiceW
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_deleteService
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_enumDependentServicesA
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_enumDependentServicesW
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_enumServicesStatusA
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_enumServicesStatusExA
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_enumServicesStatusExW
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_enumServicesStatusW
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_getServiceDirectory
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_getServiceDisplayNameA
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_getServiceDisplayNameW
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_getServiceKeyNameA
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_getServiceKeyNameW
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_getServiceRegistryStateKey
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_getSharedServiceDirectory
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_getSharedServiceRegistryStateKey
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_lockServiceDatabase
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_notifyBootConfigStatus
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_notifyServiceStatusChangeA
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_notifyServiceStatusChangeW
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_openSCManagerA
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_openSCManagerW
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_openServiceA
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_openServiceW
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_queryServiceConfig2A
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_queryServiceConfig2W
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_queryServiceConfigA
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_queryServiceConfigW
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_queryServiceDynamicInformation
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_queryServiceLockStatusA
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_queryServiceLockStatusW
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_queryServiceObjectSecurity
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_queryServiceStatus
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_queryServiceStatusEx
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_registerServiceCtrlHandlerA
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_registerServiceCtrlHandlerExA
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_registerServiceCtrlHandlerExW
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_registerServiceCtrlHandlerW
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_setServiceBits
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_setServiceObjectSecurity
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_setServiceStatus
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_startServiceA
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_startServiceCtrlDispatcherA
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_startServiceCtrlDispatcherW
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_startServiceW
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_subscribeServiceChangeNotifications
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_unlockServiceDatabase
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_unsubscribeServiceChangeNotifications
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssys_windows_win32_system_services_waitServiceState
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun changeServiceConfig2A(hservice: ScHandle, dwinfolevel: ServiceConfig, lpinfo: COpaquePointer?): Bool =
    windowssys_windows_win32_system_services_changeServiceConfig2A(hservice?.value?.toCPointer<ByteVar>(), dwinfolevel, lpinfo?.value?.toCPointer<ByteVar>())

public actual fun changeServiceConfig2W(hservice: ScHandle, dwinfolevel: ServiceConfig, lpinfo: COpaquePointer?): Bool =
    windowssys_windows_win32_system_services_changeServiceConfig2W(hservice?.value?.toCPointer<ByteVar>(), dwinfolevel, lpinfo?.value?.toCPointer<ByteVar>())

public actual fun changeServiceConfigA(hservice: ScHandle, dwservicetype: EnumServiceType, dwstarttype: ServiceStartType, dwerrorcontrol: ServiceError, lpbinarypathname: Pcstr, lploadordergroup: Pcstr, lpdwtagid: COpaquePointer?, lpdependencies: Pcstr, lpservicestartname: Pcstr, lppassword: Pcstr, lpdisplayname: Pcstr): Bool =
    windowssys_windows_win32_system_services_changeServiceConfigA(hservice?.value?.toCPointer<ByteVar>(), dwservicetype, dwstarttype, dwerrorcontrol, lpbinarypathname?.value?.toCPointer<ByteVar>(), lploadordergroup?.value?.toCPointer<ByteVar>(), lpdwtagid?.value?.toCPointer<ByteVar>(), lpdependencies?.value?.toCPointer<ByteVar>(), lpservicestartname?.value?.toCPointer<ByteVar>(), lppassword?.value?.toCPointer<ByteVar>(), lpdisplayname?.value?.toCPointer<ByteVar>())

public actual fun changeServiceConfigW(hservice: ScHandle, dwservicetype: EnumServiceType, dwstarttype: ServiceStartType, dwerrorcontrol: ServiceError, lpbinarypathname: Pcwstr, lploadordergroup: Pcwstr, lpdwtagid: COpaquePointer?, lpdependencies: Pcwstr, lpservicestartname: Pcwstr, lppassword: Pcwstr, lpdisplayname: Pcwstr): Bool =
    windowssys_windows_win32_system_services_changeServiceConfigW(hservice?.value?.toCPointer<ByteVar>(), dwservicetype, dwstarttype, dwerrorcontrol, lpbinarypathname?.value?.toCPointer<ByteVar>(), lploadordergroup?.value?.toCPointer<ByteVar>(), lpdwtagid?.value?.toCPointer<ByteVar>(), lpdependencies?.value?.toCPointer<ByteVar>(), lpservicestartname?.value?.toCPointer<ByteVar>(), lppassword?.value?.toCPointer<ByteVar>(), lpdisplayname?.value?.toCPointer<ByteVar>())

public actual fun closeServiceHandle(hscobject: ScHandle): Bool =
    windowssys_windows_win32_system_services_closeServiceHandle(hscobject?.value?.toCPointer<ByteVar>())

public actual fun controlService(hservice: ScHandle, dwcontrol: UInt, lpservicestatus: COpaquePointer?): Bool =
    windowssys_windows_win32_system_services_controlService(hservice?.value?.toCPointer<ByteVar>(), dwcontrol, lpservicestatus?.value?.toCPointer<ByteVar>())

public actual fun controlServiceExA(hservice: ScHandle, dwcontrol: UInt, dwinfolevel: UInt, pcontrolparams: COpaquePointer?): Bool =
    windowssys_windows_win32_system_services_controlServiceExA(hservice?.value?.toCPointer<ByteVar>(), dwcontrol, dwinfolevel, pcontrolparams?.value?.toCPointer<ByteVar>())

public actual fun controlServiceExW(hservice: ScHandle, dwcontrol: UInt, dwinfolevel: UInt, pcontrolparams: COpaquePointer?): Bool =
    windowssys_windows_win32_system_services_controlServiceExW(hservice?.value?.toCPointer<ByteVar>(), dwcontrol, dwinfolevel, pcontrolparams?.value?.toCPointer<ByteVar>())

public actual fun createServiceA(hscmanager: ScHandle, lpservicename: Pcstr, lpdisplayname: Pcstr, dwdesiredaccess: UInt, dwservicetype: EnumServiceType, dwstarttype: ServiceStartType, dwerrorcontrol: ServiceError, lpbinarypathname: Pcstr, lploadordergroup: Pcstr, lpdwtagid: COpaquePointer?, lpdependencies: Pcstr, lpservicestartname: Pcstr, lppassword: Pcstr): ScHandle =
    windowssys_windows_win32_system_services_createServiceA(hscmanager?.value?.toCPointer<ByteVar>(), lpservicename?.value?.toCPointer<ByteVar>(), lpdisplayname?.value?.toCPointer<ByteVar>(), dwdesiredaccess, dwservicetype, dwstarttype, dwerrorcontrol, lpbinarypathname?.value?.toCPointer<ByteVar>(), lploadordergroup?.value?.toCPointer<ByteVar>(), lpdwtagid?.value?.toCPointer<ByteVar>(), lpdependencies?.value?.toCPointer<ByteVar>(), lpservicestartname?.value?.toCPointer<ByteVar>(), lppassword?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createServiceW(hscmanager: ScHandle, lpservicename: Pcwstr, lpdisplayname: Pcwstr, dwdesiredaccess: UInt, dwservicetype: EnumServiceType, dwstarttype: ServiceStartType, dwerrorcontrol: ServiceError, lpbinarypathname: Pcwstr, lploadordergroup: Pcwstr, lpdwtagid: COpaquePointer?, lpdependencies: Pcwstr, lpservicestartname: Pcwstr, lppassword: Pcwstr): ScHandle =
    windowssys_windows_win32_system_services_createServiceW(hscmanager?.value?.toCPointer<ByteVar>(), lpservicename?.value?.toCPointer<ByteVar>(), lpdisplayname?.value?.toCPointer<ByteVar>(), dwdesiredaccess, dwservicetype, dwstarttype, dwerrorcontrol, lpbinarypathname?.value?.toCPointer<ByteVar>(), lploadordergroup?.value?.toCPointer<ByteVar>(), lpdwtagid?.value?.toCPointer<ByteVar>(), lpdependencies?.value?.toCPointer<ByteVar>(), lpservicestartname?.value?.toCPointer<ByteVar>(), lppassword?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun deleteService(hservice: ScHandle): Bool =
    windowssys_windows_win32_system_services_deleteService(hservice?.value?.toCPointer<ByteVar>())

public actual fun enumDependentServicesA(hservice: ScHandle, dwservicestate: EnumServiceState, lpservices: COpaquePointer?, cbbufsize: UInt, pcbbytesneeded: COpaquePointer?, lpservicesreturned: COpaquePointer?): Bool =
    windowssys_windows_win32_system_services_enumDependentServicesA(hservice?.value?.toCPointer<ByteVar>(), dwservicestate, lpservices?.value?.toCPointer<ByteVar>(), cbbufsize, pcbbytesneeded?.value?.toCPointer<ByteVar>(), lpservicesreturned?.value?.toCPointer<ByteVar>())

public actual fun enumDependentServicesW(hservice: ScHandle, dwservicestate: EnumServiceState, lpservices: COpaquePointer?, cbbufsize: UInt, pcbbytesneeded: COpaquePointer?, lpservicesreturned: COpaquePointer?): Bool =
    windowssys_windows_win32_system_services_enumDependentServicesW(hservice?.value?.toCPointer<ByteVar>(), dwservicestate, lpservices?.value?.toCPointer<ByteVar>(), cbbufsize, pcbbytesneeded?.value?.toCPointer<ByteVar>(), lpservicesreturned?.value?.toCPointer<ByteVar>())

public actual fun enumServicesStatusA(hscmanager: ScHandle, dwservicetype: EnumServiceType, dwservicestate: EnumServiceState, lpservices: COpaquePointer?, cbbufsize: UInt, pcbbytesneeded: COpaquePointer?, lpservicesreturned: COpaquePointer?, lpresumehandle: COpaquePointer?): Bool =
    windowssys_windows_win32_system_services_enumServicesStatusA(hscmanager?.value?.toCPointer<ByteVar>(), dwservicetype, dwservicestate, lpservices?.value?.toCPointer<ByteVar>(), cbbufsize, pcbbytesneeded?.value?.toCPointer<ByteVar>(), lpservicesreturned?.value?.toCPointer<ByteVar>(), lpresumehandle?.value?.toCPointer<ByteVar>())

public actual fun enumServicesStatusExA(hscmanager: ScHandle, infolevel: ScEnumType, dwservicetype: EnumServiceType, dwservicestate: EnumServiceState, lpservices: COpaquePointer?, cbbufsize: UInt, pcbbytesneeded: COpaquePointer?, lpservicesreturned: COpaquePointer?, lpresumehandle: COpaquePointer?, pszgroupname: Pcstr): Bool =
    windowssys_windows_win32_system_services_enumServicesStatusExA(hscmanager?.value?.toCPointer<ByteVar>(), infolevel, dwservicetype, dwservicestate, lpservices?.value?.toCPointer<ByteVar>(), cbbufsize, pcbbytesneeded?.value?.toCPointer<ByteVar>(), lpservicesreturned?.value?.toCPointer<ByteVar>(), lpresumehandle?.value?.toCPointer<ByteVar>(), pszgroupname?.value?.toCPointer<ByteVar>())

public actual fun enumServicesStatusExW(hscmanager: ScHandle, infolevel: ScEnumType, dwservicetype: EnumServiceType, dwservicestate: EnumServiceState, lpservices: COpaquePointer?, cbbufsize: UInt, pcbbytesneeded: COpaquePointer?, lpservicesreturned: COpaquePointer?, lpresumehandle: COpaquePointer?, pszgroupname: Pcwstr): Bool =
    windowssys_windows_win32_system_services_enumServicesStatusExW(hscmanager?.value?.toCPointer<ByteVar>(), infolevel, dwservicetype, dwservicestate, lpservices?.value?.toCPointer<ByteVar>(), cbbufsize, pcbbytesneeded?.value?.toCPointer<ByteVar>(), lpservicesreturned?.value?.toCPointer<ByteVar>(), lpresumehandle?.value?.toCPointer<ByteVar>(), pszgroupname?.value?.toCPointer<ByteVar>())

public actual fun enumServicesStatusW(hscmanager: ScHandle, dwservicetype: EnumServiceType, dwservicestate: EnumServiceState, lpservices: COpaquePointer?, cbbufsize: UInt, pcbbytesneeded: COpaquePointer?, lpservicesreturned: COpaquePointer?, lpresumehandle: COpaquePointer?): Bool =
    windowssys_windows_win32_system_services_enumServicesStatusW(hscmanager?.value?.toCPointer<ByteVar>(), dwservicetype, dwservicestate, lpservices?.value?.toCPointer<ByteVar>(), cbbufsize, pcbbytesneeded?.value?.toCPointer<ByteVar>(), lpservicesreturned?.value?.toCPointer<ByteVar>(), lpresumehandle?.value?.toCPointer<ByteVar>())

public actual fun getServiceDirectory(hservicestatus: ServiceStatusHandle, edirectorytype: ServiceDirectoryType, lppathbuffer: Pwstr, cchpathbufferlength: UInt, lpcchrequiredbufferlength: COpaquePointer?): UInt =
    windowssys_windows_win32_system_services_getServiceDirectory(hservicestatus?.value?.toCPointer<ByteVar>(), edirectorytype, lppathbuffer?.value?.toCPointer<ByteVar>(), cchpathbufferlength, lpcchrequiredbufferlength?.value?.toCPointer<ByteVar>())

public actual fun getServiceDisplayNameA(hscmanager: ScHandle, lpservicename: Pcstr, lpdisplayname: Pstr, lpcchbuffer: COpaquePointer?): Bool =
    windowssys_windows_win32_system_services_getServiceDisplayNameA(hscmanager?.value?.toCPointer<ByteVar>(), lpservicename?.value?.toCPointer<ByteVar>(), lpdisplayname?.value?.toCPointer<ByteVar>(), lpcchbuffer?.value?.toCPointer<ByteVar>())

public actual fun getServiceDisplayNameW(hscmanager: ScHandle, lpservicename: Pcwstr, lpdisplayname: Pwstr, lpcchbuffer: COpaquePointer?): Bool =
    windowssys_windows_win32_system_services_getServiceDisplayNameW(hscmanager?.value?.toCPointer<ByteVar>(), lpservicename?.value?.toCPointer<ByteVar>(), lpdisplayname?.value?.toCPointer<ByteVar>(), lpcchbuffer?.value?.toCPointer<ByteVar>())

public actual fun getServiceKeyNameA(hscmanager: ScHandle, lpdisplayname: Pcstr, lpservicename: Pstr, lpcchbuffer: COpaquePointer?): Bool =
    windowssys_windows_win32_system_services_getServiceKeyNameA(hscmanager?.value?.toCPointer<ByteVar>(), lpdisplayname?.value?.toCPointer<ByteVar>(), lpservicename?.value?.toCPointer<ByteVar>(), lpcchbuffer?.value?.toCPointer<ByteVar>())

public actual fun getServiceKeyNameW(hscmanager: ScHandle, lpdisplayname: Pcwstr, lpservicename: Pwstr, lpcchbuffer: COpaquePointer?): Bool =
    windowssys_windows_win32_system_services_getServiceKeyNameW(hscmanager?.value?.toCPointer<ByteVar>(), lpdisplayname?.value?.toCPointer<ByteVar>(), lpservicename?.value?.toCPointer<ByteVar>(), lpcchbuffer?.value?.toCPointer<ByteVar>())

public actual fun getServiceRegistryStateKey(servicestatushandle: ServiceStatusHandle, statetype: ServiceRegistryStateType, accessmask: UInt, servicestatekey: COpaquePointer?): UInt =
    windowssys_windows_win32_system_services_getServiceRegistryStateKey(servicestatushandle?.value?.toCPointer<ByteVar>(), statetype, accessmask, servicestatekey?.value?.toCPointer<ByteVar>())

public actual fun getSharedServiceDirectory(servicehandle: ScHandle, directorytype: ServiceSharedDirectoryType, pathbuffer: Pwstr, pathbufferlength: UInt, requiredbufferlength: COpaquePointer?): UInt =
    windowssys_windows_win32_system_services_getSharedServiceDirectory(servicehandle?.value?.toCPointer<ByteVar>(), directorytype, pathbuffer?.value?.toCPointer<ByteVar>(), pathbufferlength, requiredbufferlength?.value?.toCPointer<ByteVar>())

public actual fun getSharedServiceRegistryStateKey(servicehandle: ScHandle, statetype: ServiceSharedRegistryStateType, accessmask: UInt, servicestatekey: COpaquePointer?): UInt =
    windowssys_windows_win32_system_services_getSharedServiceRegistryStateKey(servicehandle?.value?.toCPointer<ByteVar>(), statetype, accessmask, servicestatekey?.value?.toCPointer<ByteVar>())

public actual fun lockServiceDatabase(hscmanager: ScHandle): COpaquePointer? =
    windowssys_windows_win32_system_services_lockServiceDatabase(hscmanager?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun notifyBootConfigStatus(bootacceptable: Bool): Bool =
    windowssys_windows_win32_system_services_notifyBootConfigStatus(bootacceptable)

public actual fun notifyServiceStatusChangeA(hservice: ScHandle, dwnotifymask: ServiceNotify, pnotifybuffer: COpaquePointer?): UInt =
    windowssys_windows_win32_system_services_notifyServiceStatusChangeA(hservice?.value?.toCPointer<ByteVar>(), dwnotifymask, pnotifybuffer?.value?.toCPointer<ByteVar>())

public actual fun notifyServiceStatusChangeW(hservice: ScHandle, dwnotifymask: ServiceNotify, pnotifybuffer: COpaquePointer?): UInt =
    windowssys_windows_win32_system_services_notifyServiceStatusChangeW(hservice?.value?.toCPointer<ByteVar>(), dwnotifymask, pnotifybuffer?.value?.toCPointer<ByteVar>())

public actual fun openSCManagerA(lpmachinename: Pcstr, lpdatabasename: Pcstr, dwdesiredaccess: UInt): ScHandle =
    windowssys_windows_win32_system_services_openSCManagerA(lpmachinename?.value?.toCPointer<ByteVar>(), lpdatabasename?.value?.toCPointer<ByteVar>(), dwdesiredaccess)?.let { COpaquePointer(it.toLong()) }

public actual fun openSCManagerW(lpmachinename: Pcwstr, lpdatabasename: Pcwstr, dwdesiredaccess: UInt): ScHandle =
    windowssys_windows_win32_system_services_openSCManagerW(lpmachinename?.value?.toCPointer<ByteVar>(), lpdatabasename?.value?.toCPointer<ByteVar>(), dwdesiredaccess)?.let { COpaquePointer(it.toLong()) }

public actual fun openServiceA(hscmanager: ScHandle, lpservicename: Pcstr, dwdesiredaccess: UInt): ScHandle =
    windowssys_windows_win32_system_services_openServiceA(hscmanager?.value?.toCPointer<ByteVar>(), lpservicename?.value?.toCPointer<ByteVar>(), dwdesiredaccess)?.let { COpaquePointer(it.toLong()) }

public actual fun openServiceW(hscmanager: ScHandle, lpservicename: Pcwstr, dwdesiredaccess: UInt): ScHandle =
    windowssys_windows_win32_system_services_openServiceW(hscmanager?.value?.toCPointer<ByteVar>(), lpservicename?.value?.toCPointer<ByteVar>(), dwdesiredaccess)?.let { COpaquePointer(it.toLong()) }

public actual fun queryServiceConfig2A(hservice: ScHandle, dwinfolevel: ServiceConfig, lpbuffer: COpaquePointer?, cbbufsize: UInt, pcbbytesneeded: COpaquePointer?): Bool =
    windowssys_windows_win32_system_services_queryServiceConfig2A(hservice?.value?.toCPointer<ByteVar>(), dwinfolevel, lpbuffer?.value?.toCPointer<ByteVar>(), cbbufsize, pcbbytesneeded?.value?.toCPointer<ByteVar>())

public actual fun queryServiceConfig2W(hservice: ScHandle, dwinfolevel: ServiceConfig, lpbuffer: COpaquePointer?, cbbufsize: UInt, pcbbytesneeded: COpaquePointer?): Bool =
    windowssys_windows_win32_system_services_queryServiceConfig2W(hservice?.value?.toCPointer<ByteVar>(), dwinfolevel, lpbuffer?.value?.toCPointer<ByteVar>(), cbbufsize, pcbbytesneeded?.value?.toCPointer<ByteVar>())

public actual fun queryServiceConfigA(hservice: ScHandle, lpserviceconfig: COpaquePointer?, cbbufsize: UInt, pcbbytesneeded: COpaquePointer?): Bool =
    windowssys_windows_win32_system_services_queryServiceConfigA(hservice?.value?.toCPointer<ByteVar>(), lpserviceconfig?.value?.toCPointer<ByteVar>(), cbbufsize, pcbbytesneeded?.value?.toCPointer<ByteVar>())

public actual fun queryServiceConfigW(hservice: ScHandle, lpserviceconfig: COpaquePointer?, cbbufsize: UInt, pcbbytesneeded: COpaquePointer?): Bool =
    windowssys_windows_win32_system_services_queryServiceConfigW(hservice?.value?.toCPointer<ByteVar>(), lpserviceconfig?.value?.toCPointer<ByteVar>(), cbbufsize, pcbbytesneeded?.value?.toCPointer<ByteVar>())

public actual fun queryServiceDynamicInformation(hservicestatus: ServiceStatusHandle, dwinfolevel: UInt, ppdynamicinfo: COpaquePointer?): Bool =
    windowssys_windows_win32_system_services_queryServiceDynamicInformation(hservicestatus?.value?.toCPointer<ByteVar>(), dwinfolevel, ppdynamicinfo?.value?.toCPointer<ByteVar>())

public actual fun queryServiceLockStatusA(hscmanager: ScHandle, lplockstatus: COpaquePointer?, cbbufsize: UInt, pcbbytesneeded: COpaquePointer?): Bool =
    windowssys_windows_win32_system_services_queryServiceLockStatusA(hscmanager?.value?.toCPointer<ByteVar>(), lplockstatus?.value?.toCPointer<ByteVar>(), cbbufsize, pcbbytesneeded?.value?.toCPointer<ByteVar>())

public actual fun queryServiceLockStatusW(hscmanager: ScHandle, lplockstatus: COpaquePointer?, cbbufsize: UInt, pcbbytesneeded: COpaquePointer?): Bool =
    windowssys_windows_win32_system_services_queryServiceLockStatusW(hscmanager?.value?.toCPointer<ByteVar>(), lplockstatus?.value?.toCPointer<ByteVar>(), cbbufsize, pcbbytesneeded?.value?.toCPointer<ByteVar>())

public actual fun queryServiceObjectSecurity(hservice: ScHandle, dwsecurityinformation: UInt, lpsecuritydescriptor: PsecurityDescriptor, cbbufsize: UInt, pcbbytesneeded: COpaquePointer?): Bool =
    windowssys_windows_win32_system_services_queryServiceObjectSecurity(hservice?.value?.toCPointer<ByteVar>(), dwsecurityinformation, lpsecuritydescriptor?.value?.toCPointer<ByteVar>(), cbbufsize, pcbbytesneeded?.value?.toCPointer<ByteVar>())

public actual fun queryServiceStatus(hservice: ScHandle, lpservicestatus: COpaquePointer?): Bool =
    windowssys_windows_win32_system_services_queryServiceStatus(hservice?.value?.toCPointer<ByteVar>(), lpservicestatus?.value?.toCPointer<ByteVar>())

public actual fun queryServiceStatusEx(hservice: ScHandle, infolevel: ScStatusType, lpbuffer: COpaquePointer?, cbbufsize: UInt, pcbbytesneeded: COpaquePointer?): Bool =
    windowssys_windows_win32_system_services_queryServiceStatusEx(hservice?.value?.toCPointer<ByteVar>(), infolevel, lpbuffer?.value?.toCPointer<ByteVar>(), cbbufsize, pcbbytesneeded?.value?.toCPointer<ByteVar>())

public actual fun registerServiceCtrlHandlerA(lpservicename: Pcstr, lphandlerproc: LphandlerFunction): ServiceStatusHandle =
    windowssys_windows_win32_system_services_registerServiceCtrlHandlerA(lpservicename?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun registerServiceCtrlHandlerExA(lpservicename: Pcstr, lphandlerproc: LphandlerFunctionEx, lpcontext: COpaquePointer?): ServiceStatusHandle =
    windowssys_windows_win32_system_services_registerServiceCtrlHandlerExA(lpservicename?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lpcontext?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun registerServiceCtrlHandlerExW(lpservicename: Pcwstr, lphandlerproc: LphandlerFunctionEx, lpcontext: COpaquePointer?): ServiceStatusHandle =
    windowssys_windows_win32_system_services_registerServiceCtrlHandlerExW(lpservicename?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lpcontext?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun registerServiceCtrlHandlerW(lpservicename: Pcwstr, lphandlerproc: LphandlerFunction): ServiceStatusHandle =
    windowssys_windows_win32_system_services_registerServiceCtrlHandlerW(lpservicename?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun setServiceBits(hservicestatus: ServiceStatusHandle, dwservicebits: UInt, bsetbitson: Bool, bupdateimmediately: Bool): Bool =
    windowssys_windows_win32_system_services_setServiceBits(hservicestatus?.value?.toCPointer<ByteVar>(), dwservicebits, bsetbitson, bupdateimmediately)

public actual fun setServiceObjectSecurity(hservice: ScHandle, dwsecurityinformation: ObjectSecurityInformation, lpsecuritydescriptor: PsecurityDescriptor): Bool =
    windowssys_windows_win32_system_services_setServiceObjectSecurity(hservice?.value?.toCPointer<ByteVar>(), dwsecurityinformation, lpsecuritydescriptor?.value?.toCPointer<ByteVar>())

public actual fun setServiceStatus(hservicestatus: ServiceStatusHandle, lpservicestatus: COpaquePointer?): Bool =
    windowssys_windows_win32_system_services_setServiceStatus(hservicestatus?.value?.toCPointer<ByteVar>(), lpservicestatus?.value?.toCPointer<ByteVar>())

public actual fun startServiceA(hservice: ScHandle, dwnumserviceargs: UInt, lpserviceargvectors: COpaquePointer?): Bool =
    windowssys_windows_win32_system_services_startServiceA(hservice?.value?.toCPointer<ByteVar>(), dwnumserviceargs, lpserviceargvectors?.value?.toCPointer<ByteVar>())

public actual fun startServiceCtrlDispatcherA(lpservicestarttable: COpaquePointer?): Bool =
    windowssys_windows_win32_system_services_startServiceCtrlDispatcherA(lpservicestarttable?.value?.toCPointer<ByteVar>())

public actual fun startServiceCtrlDispatcherW(lpservicestarttable: COpaquePointer?): Bool =
    windowssys_windows_win32_system_services_startServiceCtrlDispatcherW(lpservicestarttable?.value?.toCPointer<ByteVar>())

public actual fun startServiceW(hservice: ScHandle, dwnumserviceargs: UInt, lpserviceargvectors: COpaquePointer?): Bool =
    windowssys_windows_win32_system_services_startServiceW(hservice?.value?.toCPointer<ByteVar>(), dwnumserviceargs, lpserviceargvectors?.value?.toCPointer<ByteVar>())

public actual fun subscribeServiceChangeNotifications(hservice: ScHandle, eeventtype: ScEventType, pcallback: PscNotificationCallback, pcallbackcontext: COpaquePointer?, psubscription: COpaquePointer?): UInt =
    windowssys_windows_win32_system_services_subscribeServiceChangeNotifications(hservice?.value?.toCPointer<ByteVar>(), eeventtype, 0L.toCPointer<ByteVar>(), pcallbackcontext?.value?.toCPointer<ByteVar>(), psubscription?.value?.toCPointer<ByteVar>())

public actual fun unlockServiceDatabase(sclock: COpaquePointer?): Bool =
    windowssys_windows_win32_system_services_unlockServiceDatabase(sclock?.value?.toCPointer<ByteVar>())

public actual fun unsubscribeServiceChangeNotifications(psubscription: PscNotificationRegistration) {
    windowssys_windows_win32_system_services_unsubscribeServiceChangeNotifications(psubscription.toLong())
}

public actual fun waitServiceState(hservice: ScHandle, dwnotify: UInt, dwtimeout: UInt, hcancelevent: Handle): UInt =
    windowssys_windows_win32_system_services_waitServiceState(hservice?.value?.toCPointer<ByteVar>(), dwnotify, dwtimeout, hcancelevent?.value?.toCPointer<ByteVar>())
