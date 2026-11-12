@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssysWindowsWin32SystemServicesChangeServiceConfig2A
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssysWindowsWin32SystemServicesChangeServiceConfig2W
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssysWindowsWin32SystemServicesChangeServiceConfigA
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssysWindowsWin32SystemServicesChangeServiceConfigW
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssysWindowsWin32SystemServicesCloseServiceHandle
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssysWindowsWin32SystemServicesControlService
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssysWindowsWin32SystemServicesControlServiceExA
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssysWindowsWin32SystemServicesControlServiceExW
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssysWindowsWin32SystemServicesCreateServiceA
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssysWindowsWin32SystemServicesCreateServiceW
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssysWindowsWin32SystemServicesDeleteService
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssysWindowsWin32SystemServicesEnumDependentServicesA
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssysWindowsWin32SystemServicesEnumDependentServicesW
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssysWindowsWin32SystemServicesEnumServicesStatusA
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssysWindowsWin32SystemServicesEnumServicesStatusExA
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssysWindowsWin32SystemServicesEnumServicesStatusExW
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssysWindowsWin32SystemServicesEnumServicesStatusW
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssysWindowsWin32SystemServicesGetServiceDirectory
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssysWindowsWin32SystemServicesGetServiceDisplayNameA
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssysWindowsWin32SystemServicesGetServiceDisplayNameW
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssysWindowsWin32SystemServicesGetServiceKeyNameA
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssysWindowsWin32SystemServicesGetServiceKeyNameW
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssysWindowsWin32SystemServicesGetServiceRegistryStateKey
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssysWindowsWin32SystemServicesGetSharedServiceDirectory
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssysWindowsWin32SystemServicesGetSharedServiceRegistryStateKey
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssysWindowsWin32SystemServicesLockServiceDatabase
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssysWindowsWin32SystemServicesNotifyBootConfigStatus
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssysWindowsWin32SystemServicesNotifyServiceStatusChangeA
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssysWindowsWin32SystemServicesNotifyServiceStatusChangeW
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssysWindowsWin32SystemServicesOpenSCManagerA
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssysWindowsWin32SystemServicesOpenSCManagerW
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssysWindowsWin32SystemServicesOpenServiceA
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssysWindowsWin32SystemServicesOpenServiceW
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssysWindowsWin32SystemServicesQueryServiceConfig2A
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssysWindowsWin32SystemServicesQueryServiceConfig2W
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssysWindowsWin32SystemServicesQueryServiceConfigA
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssysWindowsWin32SystemServicesQueryServiceConfigW
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssysWindowsWin32SystemServicesQueryServiceDynamicInformation
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssysWindowsWin32SystemServicesQueryServiceLockStatusA
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssysWindowsWin32SystemServicesQueryServiceLockStatusW
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssysWindowsWin32SystemServicesQueryServiceObjectSecurity
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssysWindowsWin32SystemServicesQueryServiceStatus
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssysWindowsWin32SystemServicesQueryServiceStatusEx
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssysWindowsWin32SystemServicesRegisterServiceCtrlHandlerA
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssysWindowsWin32SystemServicesRegisterServiceCtrlHandlerExA
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssysWindowsWin32SystemServicesRegisterServiceCtrlHandlerExW
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssysWindowsWin32SystemServicesRegisterServiceCtrlHandlerW
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssysWindowsWin32SystemServicesSetServiceBits
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssysWindowsWin32SystemServicesSetServiceObjectSecurity
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssysWindowsWin32SystemServicesSetServiceStatus
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssysWindowsWin32SystemServicesStartServiceA
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssysWindowsWin32SystemServicesStartServiceCtrlDispatcherA
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssysWindowsWin32SystemServicesStartServiceCtrlDispatcherW
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssysWindowsWin32SystemServicesStartServiceW
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssysWindowsWin32SystemServicesSubscribeServiceChangeNotifications
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssysWindowsWin32SystemServicesUnlockServiceDatabase
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssysWindowsWin32SystemServicesUnsubscribeServiceChangeNotifications
import io.github.kotlinmania.windowssys.windows.win32.system.services.cinterop.windowssysWindowsWin32SystemServicesWaitServiceState
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun changeServiceConfig2A(hservice: ScHandle, dwinfolevel: ServiceConfig, lpinfo: ConstPtr): Bool =
    windowssysWindowsWin32SystemServicesChangeServiceConfig2A(hservice.rawAddress.toCPointer<ByteVar>(), dwinfolevel, lpinfo.rawAddress.toCPointer<ByteVar>())

public actual fun changeServiceConfig2W(hservice: ScHandle, dwinfolevel: ServiceConfig, lpinfo: ConstPtr): Bool =
    windowssysWindowsWin32SystemServicesChangeServiceConfig2W(hservice.rawAddress.toCPointer<ByteVar>(), dwinfolevel, lpinfo.rawAddress.toCPointer<ByteVar>())

public actual fun changeServiceConfigA(hservice: ScHandle, dwservicetype: EnumServiceType, dwstarttype: ServiceStartType, dwerrorcontrol: ServiceError, lpbinarypathname: Pcstr, lploadordergroup: Pcstr, lpdwtagid: MutPtr, lpdependencies: Pcstr, lpservicestartname: Pcstr, lppassword: Pcstr, lpdisplayname: Pcstr): Bool =
    windowssysWindowsWin32SystemServicesChangeServiceConfigA(hservice.rawAddress.toCPointer<ByteVar>(), dwservicetype, dwstarttype, dwerrorcontrol, lpbinarypathname.rawAddress.toCPointer<ByteVar>(), lploadordergroup.rawAddress.toCPointer<ByteVar>(), lpdwtagid.rawAddress.toCPointer<ByteVar>(), lpdependencies.rawAddress.toCPointer<ByteVar>(), lpservicestartname.rawAddress.toCPointer<ByteVar>(), lppassword.rawAddress.toCPointer<ByteVar>(), lpdisplayname.rawAddress.toCPointer<ByteVar>())

public actual fun changeServiceConfigW(hservice: ScHandle, dwservicetype: EnumServiceType, dwstarttype: ServiceStartType, dwerrorcontrol: ServiceError, lpbinarypathname: Pcwstr, lploadordergroup: Pcwstr, lpdwtagid: MutPtr, lpdependencies: Pcwstr, lpservicestartname: Pcwstr, lppassword: Pcwstr, lpdisplayname: Pcwstr): Bool =
    windowssysWindowsWin32SystemServicesChangeServiceConfigW(hservice.rawAddress.toCPointer<ByteVar>(), dwservicetype, dwstarttype, dwerrorcontrol, lpbinarypathname.rawAddress.toCPointer<ByteVar>(), lploadordergroup.rawAddress.toCPointer<ByteVar>(), lpdwtagid.rawAddress.toCPointer<ByteVar>(), lpdependencies.rawAddress.toCPointer<ByteVar>(), lpservicestartname.rawAddress.toCPointer<ByteVar>(), lppassword.rawAddress.toCPointer<ByteVar>(), lpdisplayname.rawAddress.toCPointer<ByteVar>())

public actual fun closeServiceHandle(hscobject: ScHandle): Bool =
    windowssysWindowsWin32SystemServicesCloseServiceHandle(hscobject.rawAddress.toCPointer<ByteVar>())

public actual fun controlService(hservice: ScHandle, dwcontrol: UInt, lpservicestatus: MutPtr): Bool =
    windowssysWindowsWin32SystemServicesControlService(hservice.rawAddress.toCPointer<ByteVar>(), dwcontrol, lpservicestatus.rawAddress.toCPointer<ByteVar>())

public actual fun controlServiceExA(hservice: ScHandle, dwcontrol: UInt, dwinfolevel: UInt, pcontrolparams: MutPtr): Bool =
    windowssysWindowsWin32SystemServicesControlServiceExA(hservice.rawAddress.toCPointer<ByteVar>(), dwcontrol, dwinfolevel, pcontrolparams.rawAddress.toCPointer<ByteVar>())

public actual fun controlServiceExW(hservice: ScHandle, dwcontrol: UInt, dwinfolevel: UInt, pcontrolparams: MutPtr): Bool =
    windowssysWindowsWin32SystemServicesControlServiceExW(hservice.rawAddress.toCPointer<ByteVar>(), dwcontrol, dwinfolevel, pcontrolparams.rawAddress.toCPointer<ByteVar>())

public actual fun createServiceA(hscmanager: ScHandle, lpservicename: Pcstr, lpdisplayname: Pcstr, dwdesiredaccess: UInt, dwservicetype: EnumServiceType, dwstarttype: ServiceStartType, dwerrorcontrol: ServiceError, lpbinarypathname: Pcstr, lploadordergroup: Pcstr, lpdwtagid: MutPtr, lpdependencies: Pcstr, lpservicestartname: Pcstr, lppassword: Pcstr): ScHandle =
    MutPtr(windowssysWindowsWin32SystemServicesCreateServiceA(hscmanager.rawAddress.toCPointer<ByteVar>(), lpservicename.rawAddress.toCPointer<ByteVar>(), lpdisplayname.rawAddress.toCPointer<ByteVar>(), dwdesiredaccess, dwservicetype, dwstarttype, dwerrorcontrol, lpbinarypathname.rawAddress.toCPointer<ByteVar>(), lploadordergroup.rawAddress.toCPointer<ByteVar>(), lpdwtagid.rawAddress.toCPointer<ByteVar>(), lpdependencies.rawAddress.toCPointer<ByteVar>(), lpservicestartname.rawAddress.toCPointer<ByteVar>(), lppassword.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun createServiceW(hscmanager: ScHandle, lpservicename: Pcwstr, lpdisplayname: Pcwstr, dwdesiredaccess: UInt, dwservicetype: EnumServiceType, dwstarttype: ServiceStartType, dwerrorcontrol: ServiceError, lpbinarypathname: Pcwstr, lploadordergroup: Pcwstr, lpdwtagid: MutPtr, lpdependencies: Pcwstr, lpservicestartname: Pcwstr, lppassword: Pcwstr): ScHandle =
    MutPtr(windowssysWindowsWin32SystemServicesCreateServiceW(hscmanager.rawAddress.toCPointer<ByteVar>(), lpservicename.rawAddress.toCPointer<ByteVar>(), lpdisplayname.rawAddress.toCPointer<ByteVar>(), dwdesiredaccess, dwservicetype, dwstarttype, dwerrorcontrol, lpbinarypathname.rawAddress.toCPointer<ByteVar>(), lploadordergroup.rawAddress.toCPointer<ByteVar>(), lpdwtagid.rawAddress.toCPointer<ByteVar>(), lpdependencies.rawAddress.toCPointer<ByteVar>(), lpservicestartname.rawAddress.toCPointer<ByteVar>(), lppassword.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun deleteService(hservice: ScHandle): Bool =
    windowssysWindowsWin32SystemServicesDeleteService(hservice.rawAddress.toCPointer<ByteVar>())

public actual fun enumDependentServicesA(hservice: ScHandle, dwservicestate: EnumServiceState, lpservices: MutPtr, cbbufsize: UInt, pcbbytesneeded: MutPtr, lpservicesreturned: MutPtr): Bool =
    windowssysWindowsWin32SystemServicesEnumDependentServicesA(hservice.rawAddress.toCPointer<ByteVar>(), dwservicestate, lpservices.rawAddress.toCPointer<ByteVar>(), cbbufsize, pcbbytesneeded.rawAddress.toCPointer<ByteVar>(), lpservicesreturned.rawAddress.toCPointer<ByteVar>())

public actual fun enumDependentServicesW(hservice: ScHandle, dwservicestate: EnumServiceState, lpservices: MutPtr, cbbufsize: UInt, pcbbytesneeded: MutPtr, lpservicesreturned: MutPtr): Bool =
    windowssysWindowsWin32SystemServicesEnumDependentServicesW(hservice.rawAddress.toCPointer<ByteVar>(), dwservicestate, lpservices.rawAddress.toCPointer<ByteVar>(), cbbufsize, pcbbytesneeded.rawAddress.toCPointer<ByteVar>(), lpservicesreturned.rawAddress.toCPointer<ByteVar>())

public actual fun enumServicesStatusA(hscmanager: ScHandle, dwservicetype: EnumServiceType, dwservicestate: EnumServiceState, lpservices: MutPtr, cbbufsize: UInt, pcbbytesneeded: MutPtr, lpservicesreturned: MutPtr, lpresumehandle: MutPtr): Bool =
    windowssysWindowsWin32SystemServicesEnumServicesStatusA(hscmanager.rawAddress.toCPointer<ByteVar>(), dwservicetype, dwservicestate, lpservices.rawAddress.toCPointer<ByteVar>(), cbbufsize, pcbbytesneeded.rawAddress.toCPointer<ByteVar>(), lpservicesreturned.rawAddress.toCPointer<ByteVar>(), lpresumehandle.rawAddress.toCPointer<ByteVar>())

public actual fun enumServicesStatusExA(hscmanager: ScHandle, infolevel: ScEnumType, dwservicetype: EnumServiceType, dwservicestate: EnumServiceState, lpservices: MutPtr, cbbufsize: UInt, pcbbytesneeded: MutPtr, lpservicesreturned: MutPtr, lpresumehandle: MutPtr, pszgroupname: Pcstr): Bool =
    windowssysWindowsWin32SystemServicesEnumServicesStatusExA(hscmanager.rawAddress.toCPointer<ByteVar>(), infolevel, dwservicetype, dwservicestate, lpservices.rawAddress.toCPointer<ByteVar>(), cbbufsize, pcbbytesneeded.rawAddress.toCPointer<ByteVar>(), lpservicesreturned.rawAddress.toCPointer<ByteVar>(), lpresumehandle.rawAddress.toCPointer<ByteVar>(), pszgroupname.rawAddress.toCPointer<ByteVar>())

public actual fun enumServicesStatusExW(hscmanager: ScHandle, infolevel: ScEnumType, dwservicetype: EnumServiceType, dwservicestate: EnumServiceState, lpservices: MutPtr, cbbufsize: UInt, pcbbytesneeded: MutPtr, lpservicesreturned: MutPtr, lpresumehandle: MutPtr, pszgroupname: Pcwstr): Bool =
    windowssysWindowsWin32SystemServicesEnumServicesStatusExW(hscmanager.rawAddress.toCPointer<ByteVar>(), infolevel, dwservicetype, dwservicestate, lpservices.rawAddress.toCPointer<ByteVar>(), cbbufsize, pcbbytesneeded.rawAddress.toCPointer<ByteVar>(), lpservicesreturned.rawAddress.toCPointer<ByteVar>(), lpresumehandle.rawAddress.toCPointer<ByteVar>(), pszgroupname.rawAddress.toCPointer<ByteVar>())

public actual fun enumServicesStatusW(hscmanager: ScHandle, dwservicetype: EnumServiceType, dwservicestate: EnumServiceState, lpservices: MutPtr, cbbufsize: UInt, pcbbytesneeded: MutPtr, lpservicesreturned: MutPtr, lpresumehandle: MutPtr): Bool =
    windowssysWindowsWin32SystemServicesEnumServicesStatusW(hscmanager.rawAddress.toCPointer<ByteVar>(), dwservicetype, dwservicestate, lpservices.rawAddress.toCPointer<ByteVar>(), cbbufsize, pcbbytesneeded.rawAddress.toCPointer<ByteVar>(), lpservicesreturned.rawAddress.toCPointer<ByteVar>(), lpresumehandle.rawAddress.toCPointer<ByteVar>())

public actual fun getServiceDirectory(hservicestatus: ServiceStatusHandle, edirectorytype: ServiceDirectoryType, lppathbuffer: Pwstr, cchpathbufferlength: UInt, lpcchrequiredbufferlength: MutPtr): UInt =
    windowssysWindowsWin32SystemServicesGetServiceDirectory(hservicestatus.rawAddress.toCPointer<ByteVar>(), edirectorytype, lppathbuffer.rawAddress.toCPointer<ByteVar>(), cchpathbufferlength, lpcchrequiredbufferlength.rawAddress.toCPointer<ByteVar>())

public actual fun getServiceDisplayNameA(hscmanager: ScHandle, lpservicename: Pcstr, lpdisplayname: Pstr, lpcchbuffer: MutPtr): Bool =
    windowssysWindowsWin32SystemServicesGetServiceDisplayNameA(hscmanager.rawAddress.toCPointer<ByteVar>(), lpservicename.rawAddress.toCPointer<ByteVar>(), lpdisplayname.rawAddress.toCPointer<ByteVar>(), lpcchbuffer.rawAddress.toCPointer<ByteVar>())

public actual fun getServiceDisplayNameW(hscmanager: ScHandle, lpservicename: Pcwstr, lpdisplayname: Pwstr, lpcchbuffer: MutPtr): Bool =
    windowssysWindowsWin32SystemServicesGetServiceDisplayNameW(hscmanager.rawAddress.toCPointer<ByteVar>(), lpservicename.rawAddress.toCPointer<ByteVar>(), lpdisplayname.rawAddress.toCPointer<ByteVar>(), lpcchbuffer.rawAddress.toCPointer<ByteVar>())

public actual fun getServiceKeyNameA(hscmanager: ScHandle, lpdisplayname: Pcstr, lpservicename: Pstr, lpcchbuffer: MutPtr): Bool =
    windowssysWindowsWin32SystemServicesGetServiceKeyNameA(hscmanager.rawAddress.toCPointer<ByteVar>(), lpdisplayname.rawAddress.toCPointer<ByteVar>(), lpservicename.rawAddress.toCPointer<ByteVar>(), lpcchbuffer.rawAddress.toCPointer<ByteVar>())

public actual fun getServiceKeyNameW(hscmanager: ScHandle, lpdisplayname: Pcwstr, lpservicename: Pwstr, lpcchbuffer: MutPtr): Bool =
    windowssysWindowsWin32SystemServicesGetServiceKeyNameW(hscmanager.rawAddress.toCPointer<ByteVar>(), lpdisplayname.rawAddress.toCPointer<ByteVar>(), lpservicename.rawAddress.toCPointer<ByteVar>(), lpcchbuffer.rawAddress.toCPointer<ByteVar>())

public actual fun getServiceRegistryStateKey(servicestatushandle: ServiceStatusHandle, statetype: ServiceRegistryStateType, accessmask: UInt, servicestatekey: MutPtr): UInt =
    windowssysWindowsWin32SystemServicesGetServiceRegistryStateKey(servicestatushandle.rawAddress.toCPointer<ByteVar>(), statetype, accessmask, servicestatekey.rawAddress.toCPointer<ByteVar>())

public actual fun getSharedServiceDirectory(servicehandle: ScHandle, directorytype: ServiceSharedDirectoryType, pathbuffer: Pwstr, pathbufferlength: UInt, requiredbufferlength: MutPtr): UInt =
    windowssysWindowsWin32SystemServicesGetSharedServiceDirectory(servicehandle.rawAddress.toCPointer<ByteVar>(), directorytype, pathbuffer.rawAddress.toCPointer<ByteVar>(), pathbufferlength, requiredbufferlength.rawAddress.toCPointer<ByteVar>())

public actual fun getSharedServiceRegistryStateKey(servicehandle: ScHandle, statetype: ServiceSharedRegistryStateType, accessmask: UInt, servicestatekey: MutPtr): UInt =
    windowssysWindowsWin32SystemServicesGetSharedServiceRegistryStateKey(servicehandle.rawAddress.toCPointer<ByteVar>(), statetype, accessmask, servicestatekey.rawAddress.toCPointer<ByteVar>())

public actual fun lockServiceDatabase(hscmanager: ScHandle): MutPtr =
    MutPtr(windowssysWindowsWin32SystemServicesLockServiceDatabase(hscmanager.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun notifyBootConfigStatus(bootacceptable: Bool): Bool =
    windowssysWindowsWin32SystemServicesNotifyBootConfigStatus(bootacceptable)

public actual fun notifyServiceStatusChangeA(hservice: ScHandle, dwnotifymask: ServiceNotify, pnotifybuffer: ConstPtr): UInt =
    windowssysWindowsWin32SystemServicesNotifyServiceStatusChangeA(hservice.rawAddress.toCPointer<ByteVar>(), dwnotifymask, pnotifybuffer.rawAddress.toCPointer<ByteVar>())

public actual fun notifyServiceStatusChangeW(hservice: ScHandle, dwnotifymask: ServiceNotify, pnotifybuffer: ConstPtr): UInt =
    windowssysWindowsWin32SystemServicesNotifyServiceStatusChangeW(hservice.rawAddress.toCPointer<ByteVar>(), dwnotifymask, pnotifybuffer.rawAddress.toCPointer<ByteVar>())

public actual fun openSCManagerA(lpmachinename: Pcstr, lpdatabasename: Pcstr, dwdesiredaccess: UInt): ScHandle =
    MutPtr(windowssysWindowsWin32SystemServicesOpenSCManagerA(lpmachinename.rawAddress.toCPointer<ByteVar>(), lpdatabasename.rawAddress.toCPointer<ByteVar>(), dwdesiredaccess)?.toLong() ?: 0L)

public actual fun openSCManagerW(lpmachinename: Pcwstr, lpdatabasename: Pcwstr, dwdesiredaccess: UInt): ScHandle =
    MutPtr(windowssysWindowsWin32SystemServicesOpenSCManagerW(lpmachinename.rawAddress.toCPointer<ByteVar>(), lpdatabasename.rawAddress.toCPointer<ByteVar>(), dwdesiredaccess)?.toLong() ?: 0L)

public actual fun openServiceA(hscmanager: ScHandle, lpservicename: Pcstr, dwdesiredaccess: UInt): ScHandle =
    MutPtr(windowssysWindowsWin32SystemServicesOpenServiceA(hscmanager.rawAddress.toCPointer<ByteVar>(), lpservicename.rawAddress.toCPointer<ByteVar>(), dwdesiredaccess)?.toLong() ?: 0L)

public actual fun openServiceW(hscmanager: ScHandle, lpservicename: Pcwstr, dwdesiredaccess: UInt): ScHandle =
    MutPtr(windowssysWindowsWin32SystemServicesOpenServiceW(hscmanager.rawAddress.toCPointer<ByteVar>(), lpservicename.rawAddress.toCPointer<ByteVar>(), dwdesiredaccess)?.toLong() ?: 0L)

public actual fun queryServiceConfig2A(hservice: ScHandle, dwinfolevel: ServiceConfig, lpbuffer: MutPtr, cbbufsize: UInt, pcbbytesneeded: MutPtr): Bool =
    windowssysWindowsWin32SystemServicesQueryServiceConfig2A(hservice.rawAddress.toCPointer<ByteVar>(), dwinfolevel, lpbuffer.rawAddress.toCPointer<ByteVar>(), cbbufsize, pcbbytesneeded.rawAddress.toCPointer<ByteVar>())

public actual fun queryServiceConfig2W(hservice: ScHandle, dwinfolevel: ServiceConfig, lpbuffer: MutPtr, cbbufsize: UInt, pcbbytesneeded: MutPtr): Bool =
    windowssysWindowsWin32SystemServicesQueryServiceConfig2W(hservice.rawAddress.toCPointer<ByteVar>(), dwinfolevel, lpbuffer.rawAddress.toCPointer<ByteVar>(), cbbufsize, pcbbytesneeded.rawAddress.toCPointer<ByteVar>())

public actual fun queryServiceConfigA(hservice: ScHandle, lpserviceconfig: MutPtr, cbbufsize: UInt, pcbbytesneeded: MutPtr): Bool =
    windowssysWindowsWin32SystemServicesQueryServiceConfigA(hservice.rawAddress.toCPointer<ByteVar>(), lpserviceconfig.rawAddress.toCPointer<ByteVar>(), cbbufsize, pcbbytesneeded.rawAddress.toCPointer<ByteVar>())

public actual fun queryServiceConfigW(hservice: ScHandle, lpserviceconfig: MutPtr, cbbufsize: UInt, pcbbytesneeded: MutPtr): Bool =
    windowssysWindowsWin32SystemServicesQueryServiceConfigW(hservice.rawAddress.toCPointer<ByteVar>(), lpserviceconfig.rawAddress.toCPointer<ByteVar>(), cbbufsize, pcbbytesneeded.rawAddress.toCPointer<ByteVar>())

public actual fun queryServiceDynamicInformation(hservicestatus: ServiceStatusHandle, dwinfolevel: UInt, ppdynamicinfo: MutPtr): Bool =
    windowssysWindowsWin32SystemServicesQueryServiceDynamicInformation(hservicestatus.rawAddress.toCPointer<ByteVar>(), dwinfolevel, ppdynamicinfo.rawAddress.toCPointer<ByteVar>())

public actual fun queryServiceLockStatusA(hscmanager: ScHandle, lplockstatus: MutPtr, cbbufsize: UInt, pcbbytesneeded: MutPtr): Bool =
    windowssysWindowsWin32SystemServicesQueryServiceLockStatusA(hscmanager.rawAddress.toCPointer<ByteVar>(), lplockstatus.rawAddress.toCPointer<ByteVar>(), cbbufsize, pcbbytesneeded.rawAddress.toCPointer<ByteVar>())

public actual fun queryServiceLockStatusW(hscmanager: ScHandle, lplockstatus: MutPtr, cbbufsize: UInt, pcbbytesneeded: MutPtr): Bool =
    windowssysWindowsWin32SystemServicesQueryServiceLockStatusW(hscmanager.rawAddress.toCPointer<ByteVar>(), lplockstatus.rawAddress.toCPointer<ByteVar>(), cbbufsize, pcbbytesneeded.rawAddress.toCPointer<ByteVar>())

public actual fun queryServiceObjectSecurity(hservice: ScHandle, dwsecurityinformation: UInt, lpsecuritydescriptor: PsecurityDescriptor, cbbufsize: UInt, pcbbytesneeded: MutPtr): Bool =
    windowssysWindowsWin32SystemServicesQueryServiceObjectSecurity(hservice.rawAddress.toCPointer<ByteVar>(), dwsecurityinformation, lpsecuritydescriptor.rawAddress.toCPointer<ByteVar>(), cbbufsize, pcbbytesneeded.rawAddress.toCPointer<ByteVar>())

public actual fun queryServiceStatus(hservice: ScHandle, lpservicestatus: MutPtr): Bool =
    windowssysWindowsWin32SystemServicesQueryServiceStatus(hservice.rawAddress.toCPointer<ByteVar>(), lpservicestatus.rawAddress.toCPointer<ByteVar>())

public actual fun queryServiceStatusEx(hservice: ScHandle, infolevel: ScStatusType, lpbuffer: MutPtr, cbbufsize: UInt, pcbbytesneeded: MutPtr): Bool =
    windowssysWindowsWin32SystemServicesQueryServiceStatusEx(hservice.rawAddress.toCPointer<ByteVar>(), infolevel, lpbuffer.rawAddress.toCPointer<ByteVar>(), cbbufsize, pcbbytesneeded.rawAddress.toCPointer<ByteVar>())

public actual fun registerServiceCtrlHandlerA(lpservicename: Pcstr, lphandlerproc: LphandlerFunction): ServiceStatusHandle =
    MutPtr(windowssysWindowsWin32SystemServicesRegisterServiceCtrlHandlerA(lpservicename.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun registerServiceCtrlHandlerExA(lpservicename: Pcstr, lphandlerproc: LphandlerFunctionEx, lpcontext: ConstPtr): ServiceStatusHandle =
    MutPtr(windowssysWindowsWin32SystemServicesRegisterServiceCtrlHandlerExA(lpservicename.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lpcontext.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun registerServiceCtrlHandlerExW(lpservicename: Pcwstr, lphandlerproc: LphandlerFunctionEx, lpcontext: ConstPtr): ServiceStatusHandle =
    MutPtr(windowssysWindowsWin32SystemServicesRegisterServiceCtrlHandlerExW(lpservicename.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lpcontext.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun registerServiceCtrlHandlerW(lpservicename: Pcwstr, lphandlerproc: LphandlerFunction): ServiceStatusHandle =
    MutPtr(windowssysWindowsWin32SystemServicesRegisterServiceCtrlHandlerW(lpservicename.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun setServiceBits(hservicestatus: ServiceStatusHandle, dwservicebits: UInt, bsetbitson: Bool, bupdateimmediately: Bool): Bool =
    windowssysWindowsWin32SystemServicesSetServiceBits(hservicestatus.rawAddress.toCPointer<ByteVar>(), dwservicebits, bsetbitson, bupdateimmediately)

public actual fun setServiceObjectSecurity(hservice: ScHandle, dwsecurityinformation: ObjectSecurityInformation, lpsecuritydescriptor: PsecurityDescriptor): Bool =
    windowssysWindowsWin32SystemServicesSetServiceObjectSecurity(hservice.rawAddress.toCPointer<ByteVar>(), dwsecurityinformation, lpsecuritydescriptor.rawAddress.toCPointer<ByteVar>())

public actual fun setServiceStatus(hservicestatus: ServiceStatusHandle, lpservicestatus: ConstPtr): Bool =
    windowssysWindowsWin32SystemServicesSetServiceStatus(hservicestatus.rawAddress.toCPointer<ByteVar>(), lpservicestatus.rawAddress.toCPointer<ByteVar>())

public actual fun startServiceA(hservice: ScHandle, dwnumserviceargs: UInt, lpserviceargvectors: ConstPtr): Bool =
    windowssysWindowsWin32SystemServicesStartServiceA(hservice.rawAddress.toCPointer<ByteVar>(), dwnumserviceargs, lpserviceargvectors.rawAddress.toCPointer<ByteVar>())

public actual fun startServiceCtrlDispatcherA(lpservicestarttable: ConstPtr): Bool =
    windowssysWindowsWin32SystemServicesStartServiceCtrlDispatcherA(lpservicestarttable.rawAddress.toCPointer<ByteVar>())

public actual fun startServiceCtrlDispatcherW(lpservicestarttable: ConstPtr): Bool =
    windowssysWindowsWin32SystemServicesStartServiceCtrlDispatcherW(lpservicestarttable.rawAddress.toCPointer<ByteVar>())

public actual fun startServiceW(hservice: ScHandle, dwnumserviceargs: UInt, lpserviceargvectors: ConstPtr): Bool =
    windowssysWindowsWin32SystemServicesStartServiceW(hservice.rawAddress.toCPointer<ByteVar>(), dwnumserviceargs, lpserviceargvectors.rawAddress.toCPointer<ByteVar>())

public actual fun subscribeServiceChangeNotifications(hservice: ScHandle, eeventtype: ScEventType, pcallback: PscNotificationCallback, pcallbackcontext: ConstPtr, psubscription: MutPtr): UInt =
    windowssysWindowsWin32SystemServicesSubscribeServiceChangeNotifications(hservice.rawAddress.toCPointer<ByteVar>(), eeventtype, 0L.toCPointer<ByteVar>(), pcallbackcontext.rawAddress.toCPointer<ByteVar>(), psubscription.rawAddress.toCPointer<ByteVar>())

public actual fun unlockServiceDatabase(sclock: ConstPtr): Bool =
    windowssysWindowsWin32SystemServicesUnlockServiceDatabase(sclock.rawAddress.toCPointer<ByteVar>())

public actual fun unsubscribeServiceChangeNotifications(psubscription: PscNotificationRegistration) {
    windowssysWindowsWin32SystemServicesUnsubscribeServiceChangeNotifications(psubscription)
}

public actual fun waitServiceState(hservice: ScHandle, dwnotify: UInt, dwtimeout: UInt, hcancelevent: Handle): UInt =
    windowssysWindowsWin32SystemServicesWaitServiceState(hservice.rawAddress.toCPointer<ByteVar>(), dwnotify, dwtimeout, hcancelevent.rawAddress.toCPointer<ByteVar>())
