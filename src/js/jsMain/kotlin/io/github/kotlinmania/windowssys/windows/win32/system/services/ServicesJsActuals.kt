@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private val windowsWin32SystemServicesNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun changeServiceConfig2A(hservice: ScHandle, dwinfolevel: ServiceConfig, lpinfo: ConstPtr): Bool =
    if (windowsWin32SystemServicesNapiAddon != null) (windowsWin32SystemServicesNapiAddon.windowssysWindowsWin32SystemServicesChangeServiceConfig2A(hservice.rawAddress.toString(), dwinfolevel.toInt(), lpinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun changeServiceConfig2W(hservice: ScHandle, dwinfolevel: ServiceConfig, lpinfo: ConstPtr): Bool =
    if (windowsWin32SystemServicesNapiAddon != null) (windowsWin32SystemServicesNapiAddon.windowssysWindowsWin32SystemServicesChangeServiceConfig2W(hservice.rawAddress.toString(), dwinfolevel.toInt(), lpinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun changeServiceConfigA(hservice: ScHandle, dwservicetype: EnumServiceType, dwstarttype: ServiceStartType, dwerrorcontrol: ServiceError, lpbinarypathname: Pcstr, lploadordergroup: Pcstr, lpdwtagid: MutPtr, lpdependencies: Pcstr, lpservicestartname: Pcstr, lppassword: Pcstr, lpdisplayname: Pcstr): Bool =
    if (windowsWin32SystemServicesNapiAddon != null) (windowsWin32SystemServicesNapiAddon.windowssysWindowsWin32SystemServicesChangeServiceConfigA(hservice.rawAddress.toString(), dwservicetype.toInt(), dwstarttype.toInt(), dwerrorcontrol.toInt(), lpbinarypathname.rawAddress.toString(), lploadordergroup.rawAddress.toString(), lpdwtagid.rawAddress.toString(), lpdependencies.rawAddress.toString(), lpservicestartname.rawAddress.toString(), lppassword.rawAddress.toString(), lpdisplayname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun changeServiceConfigW(hservice: ScHandle, dwservicetype: EnumServiceType, dwstarttype: ServiceStartType, dwerrorcontrol: ServiceError, lpbinarypathname: Pcwstr, lploadordergroup: Pcwstr, lpdwtagid: MutPtr, lpdependencies: Pcwstr, lpservicestartname: Pcwstr, lppassword: Pcwstr, lpdisplayname: Pcwstr): Bool =
    if (windowsWin32SystemServicesNapiAddon != null) (windowsWin32SystemServicesNapiAddon.windowssysWindowsWin32SystemServicesChangeServiceConfigW(hservice.rawAddress.toString(), dwservicetype.toInt(), dwstarttype.toInt(), dwerrorcontrol.toInt(), lpbinarypathname.rawAddress.toString(), lploadordergroup.rawAddress.toString(), lpdwtagid.rawAddress.toString(), lpdependencies.rawAddress.toString(), lpservicestartname.rawAddress.toString(), lppassword.rawAddress.toString(), lpdisplayname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeServiceHandle(hscobject: ScHandle): Bool =
    if (windowsWin32SystemServicesNapiAddon != null) (windowsWin32SystemServicesNapiAddon.windowssysWindowsWin32SystemServicesCloseServiceHandle(hscobject.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun controlService(hservice: ScHandle, dwcontrol: UInt, lpservicestatus: MutPtr): Bool =
    if (windowsWin32SystemServicesNapiAddon != null) (windowsWin32SystemServicesNapiAddon.windowssysWindowsWin32SystemServicesControlService(hservice.rawAddress.toString(), dwcontrol.toInt(), lpservicestatus.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun controlServiceExA(hservice: ScHandle, dwcontrol: UInt, dwinfolevel: UInt, pcontrolparams: MutPtr): Bool =
    if (windowsWin32SystemServicesNapiAddon != null) (windowsWin32SystemServicesNapiAddon.windowssysWindowsWin32SystemServicesControlServiceExA(hservice.rawAddress.toString(), dwcontrol.toInt(), dwinfolevel.toInt(), pcontrolparams.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun controlServiceExW(hservice: ScHandle, dwcontrol: UInt, dwinfolevel: UInt, pcontrolparams: MutPtr): Bool =
    if (windowsWin32SystemServicesNapiAddon != null) (windowsWin32SystemServicesNapiAddon.windowssysWindowsWin32SystemServicesControlServiceExW(hservice.rawAddress.toString(), dwcontrol.toInt(), dwinfolevel.toInt(), pcontrolparams.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createServiceA(hscmanager: ScHandle, lpservicename: Pcstr, lpdisplayname: Pcstr, dwdesiredaccess: UInt, dwservicetype: EnumServiceType, dwstarttype: ServiceStartType, dwerrorcontrol: ServiceError, lpbinarypathname: Pcstr, lploadordergroup: Pcstr, lpdwtagid: MutPtr, lpdependencies: Pcstr, lpservicestartname: Pcstr, lppassword: Pcstr): ScHandle =
    if (windowsWin32SystemServicesNapiAddon != null) MutPtr((windowsWin32SystemServicesNapiAddon.windowssysWindowsWin32SystemServicesCreateServiceA(hscmanager.rawAddress.toString(), lpservicename.rawAddress.toString(), lpdisplayname.rawAddress.toString(), dwdesiredaccess.toInt(), dwservicetype.toInt(), dwstarttype.toInt(), dwerrorcontrol.toInt(), lpbinarypathname.rawAddress.toString(), lploadordergroup.rawAddress.toString(), lpdwtagid.rawAddress.toString(), lpdependencies.rawAddress.toString(), lpservicestartname.rawAddress.toString(), lppassword.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createServiceW(hscmanager: ScHandle, lpservicename: Pcwstr, lpdisplayname: Pcwstr, dwdesiredaccess: UInt, dwservicetype: EnumServiceType, dwstarttype: ServiceStartType, dwerrorcontrol: ServiceError, lpbinarypathname: Pcwstr, lploadordergroup: Pcwstr, lpdwtagid: MutPtr, lpdependencies: Pcwstr, lpservicestartname: Pcwstr, lppassword: Pcwstr): ScHandle =
    if (windowsWin32SystemServicesNapiAddon != null) MutPtr((windowsWin32SystemServicesNapiAddon.windowssysWindowsWin32SystemServicesCreateServiceW(hscmanager.rawAddress.toString(), lpservicename.rawAddress.toString(), lpdisplayname.rawAddress.toString(), dwdesiredaccess.toInt(), dwservicetype.toInt(), dwstarttype.toInt(), dwerrorcontrol.toInt(), lpbinarypathname.rawAddress.toString(), lploadordergroup.rawAddress.toString(), lpdwtagid.rawAddress.toString(), lpdependencies.rawAddress.toString(), lpservicestartname.rawAddress.toString(), lppassword.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteService(hservice: ScHandle): Bool =
    if (windowsWin32SystemServicesNapiAddon != null) (windowsWin32SystemServicesNapiAddon.windowssysWindowsWin32SystemServicesDeleteService(hservice.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumDependentServicesA(hservice: ScHandle, dwservicestate: EnumServiceState, lpservices: MutPtr, cbbufsize: UInt, pcbbytesneeded: MutPtr, lpservicesreturned: MutPtr): Bool =
    if (windowsWin32SystemServicesNapiAddon != null) (windowsWin32SystemServicesNapiAddon.windowssysWindowsWin32SystemServicesEnumDependentServicesA(hservice.rawAddress.toString(), dwservicestate.toInt(), lpservices.rawAddress.toString(), cbbufsize.toInt(), pcbbytesneeded.rawAddress.toString(), lpservicesreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumDependentServicesW(hservice: ScHandle, dwservicestate: EnumServiceState, lpservices: MutPtr, cbbufsize: UInt, pcbbytesneeded: MutPtr, lpservicesreturned: MutPtr): Bool =
    if (windowsWin32SystemServicesNapiAddon != null) (windowsWin32SystemServicesNapiAddon.windowssysWindowsWin32SystemServicesEnumDependentServicesW(hservice.rawAddress.toString(), dwservicestate.toInt(), lpservices.rawAddress.toString(), cbbufsize.toInt(), pcbbytesneeded.rawAddress.toString(), lpservicesreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumServicesStatusA(hscmanager: ScHandle, dwservicetype: EnumServiceType, dwservicestate: EnumServiceState, lpservices: MutPtr, cbbufsize: UInt, pcbbytesneeded: MutPtr, lpservicesreturned: MutPtr, lpresumehandle: MutPtr): Bool =
    if (windowsWin32SystemServicesNapiAddon != null) (windowsWin32SystemServicesNapiAddon.windowssysWindowsWin32SystemServicesEnumServicesStatusA(hscmanager.rawAddress.toString(), dwservicetype.toInt(), dwservicestate.toInt(), lpservices.rawAddress.toString(), cbbufsize.toInt(), pcbbytesneeded.rawAddress.toString(), lpservicesreturned.rawAddress.toString(), lpresumehandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumServicesStatusExA(hscmanager: ScHandle, infolevel: ScEnumType, dwservicetype: EnumServiceType, dwservicestate: EnumServiceState, lpservices: MutPtr, cbbufsize: UInt, pcbbytesneeded: MutPtr, lpservicesreturned: MutPtr, lpresumehandle: MutPtr, pszgroupname: Pcstr): Bool =
    if (windowsWin32SystemServicesNapiAddon != null) (windowsWin32SystemServicesNapiAddon.windowssysWindowsWin32SystemServicesEnumServicesStatusExA(hscmanager.rawAddress.toString(), infolevel, dwservicetype.toInt(), dwservicestate.toInt(), lpservices.rawAddress.toString(), cbbufsize.toInt(), pcbbytesneeded.rawAddress.toString(), lpservicesreturned.rawAddress.toString(), lpresumehandle.rawAddress.toString(), pszgroupname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumServicesStatusExW(hscmanager: ScHandle, infolevel: ScEnumType, dwservicetype: EnumServiceType, dwservicestate: EnumServiceState, lpservices: MutPtr, cbbufsize: UInt, pcbbytesneeded: MutPtr, lpservicesreturned: MutPtr, lpresumehandle: MutPtr, pszgroupname: Pcwstr): Bool =
    if (windowsWin32SystemServicesNapiAddon != null) (windowsWin32SystemServicesNapiAddon.windowssysWindowsWin32SystemServicesEnumServicesStatusExW(hscmanager.rawAddress.toString(), infolevel, dwservicetype.toInt(), dwservicestate.toInt(), lpservices.rawAddress.toString(), cbbufsize.toInt(), pcbbytesneeded.rawAddress.toString(), lpservicesreturned.rawAddress.toString(), lpresumehandle.rawAddress.toString(), pszgroupname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumServicesStatusW(hscmanager: ScHandle, dwservicetype: EnumServiceType, dwservicestate: EnumServiceState, lpservices: MutPtr, cbbufsize: UInt, pcbbytesneeded: MutPtr, lpservicesreturned: MutPtr, lpresumehandle: MutPtr): Bool =
    if (windowsWin32SystemServicesNapiAddon != null) (windowsWin32SystemServicesNapiAddon.windowssysWindowsWin32SystemServicesEnumServicesStatusW(hscmanager.rawAddress.toString(), dwservicetype.toInt(), dwservicestate.toInt(), lpservices.rawAddress.toString(), cbbufsize.toInt(), pcbbytesneeded.rawAddress.toString(), lpservicesreturned.rawAddress.toString(), lpresumehandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getServiceDirectory(hservicestatus: ServiceStatusHandle, edirectorytype: ServiceDirectoryType, lppathbuffer: Pwstr, cchpathbufferlength: UInt, lpcchrequiredbufferlength: MutPtr): UInt =
    if (windowsWin32SystemServicesNapiAddon != null) (windowsWin32SystemServicesNapiAddon.windowssysWindowsWin32SystemServicesGetServiceDirectory(hservicestatus.rawAddress.toString(), edirectorytype, lppathbuffer.rawAddress.toString(), cchpathbufferlength.toInt(), lpcchrequiredbufferlength.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getServiceDisplayNameA(hscmanager: ScHandle, lpservicename: Pcstr, lpdisplayname: Pstr, lpcchbuffer: MutPtr): Bool =
    if (windowsWin32SystemServicesNapiAddon != null) (windowsWin32SystemServicesNapiAddon.windowssysWindowsWin32SystemServicesGetServiceDisplayNameA(hscmanager.rawAddress.toString(), lpservicename.rawAddress.toString(), lpdisplayname.rawAddress.toString(), lpcchbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getServiceDisplayNameW(hscmanager: ScHandle, lpservicename: Pcwstr, lpdisplayname: Pwstr, lpcchbuffer: MutPtr): Bool =
    if (windowsWin32SystemServicesNapiAddon != null) (windowsWin32SystemServicesNapiAddon.windowssysWindowsWin32SystemServicesGetServiceDisplayNameW(hscmanager.rawAddress.toString(), lpservicename.rawAddress.toString(), lpdisplayname.rawAddress.toString(), lpcchbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getServiceKeyNameA(hscmanager: ScHandle, lpdisplayname: Pcstr, lpservicename: Pstr, lpcchbuffer: MutPtr): Bool =
    if (windowsWin32SystemServicesNapiAddon != null) (windowsWin32SystemServicesNapiAddon.windowssysWindowsWin32SystemServicesGetServiceKeyNameA(hscmanager.rawAddress.toString(), lpdisplayname.rawAddress.toString(), lpservicename.rawAddress.toString(), lpcchbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getServiceKeyNameW(hscmanager: ScHandle, lpdisplayname: Pcwstr, lpservicename: Pwstr, lpcchbuffer: MutPtr): Bool =
    if (windowsWin32SystemServicesNapiAddon != null) (windowsWin32SystemServicesNapiAddon.windowssysWindowsWin32SystemServicesGetServiceKeyNameW(hscmanager.rawAddress.toString(), lpdisplayname.rawAddress.toString(), lpservicename.rawAddress.toString(), lpcchbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getServiceRegistryStateKey(servicestatushandle: ServiceStatusHandle, statetype: ServiceRegistryStateType, accessmask: UInt, servicestatekey: MutPtr): UInt =
    if (windowsWin32SystemServicesNapiAddon != null) (windowsWin32SystemServicesNapiAddon.windowssysWindowsWin32SystemServicesGetServiceRegistryStateKey(servicestatushandle.rawAddress.toString(), statetype, accessmask.toInt(), servicestatekey.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSharedServiceDirectory(servicehandle: ScHandle, directorytype: ServiceSharedDirectoryType, pathbuffer: Pwstr, pathbufferlength: UInt, requiredbufferlength: MutPtr): UInt =
    if (windowsWin32SystemServicesNapiAddon != null) (windowsWin32SystemServicesNapiAddon.windowssysWindowsWin32SystemServicesGetSharedServiceDirectory(servicehandle.rawAddress.toString(), directorytype, pathbuffer.rawAddress.toString(), pathbufferlength.toInt(), requiredbufferlength.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSharedServiceRegistryStateKey(servicehandle: ScHandle, statetype: ServiceSharedRegistryStateType, accessmask: UInt, servicestatekey: MutPtr): UInt =
    if (windowsWin32SystemServicesNapiAddon != null) (windowsWin32SystemServicesNapiAddon.windowssysWindowsWin32SystemServicesGetSharedServiceRegistryStateKey(servicehandle.rawAddress.toString(), statetype, accessmask.toInt(), servicestatekey.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lockServiceDatabase(hscmanager: ScHandle): MutPtr =
    if (windowsWin32SystemServicesNapiAddon != null) MutPtr((windowsWin32SystemServicesNapiAddon.windowssysWindowsWin32SystemServicesLockServiceDatabase(hscmanager.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun notifyBootConfigStatus(bootacceptable: Bool): Bool =
    if (windowsWin32SystemServicesNapiAddon != null) (windowsWin32SystemServicesNapiAddon.windowssysWindowsWin32SystemServicesNotifyBootConfigStatus(bootacceptable) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun notifyServiceStatusChangeA(hservice: ScHandle, dwnotifymask: ServiceNotify, pnotifybuffer: ConstPtr): UInt =
    if (windowsWin32SystemServicesNapiAddon != null) (windowsWin32SystemServicesNapiAddon.windowssysWindowsWin32SystemServicesNotifyServiceStatusChangeA(hservice.rawAddress.toString(), dwnotifymask.toInt(), pnotifybuffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun notifyServiceStatusChangeW(hservice: ScHandle, dwnotifymask: ServiceNotify, pnotifybuffer: ConstPtr): UInt =
    if (windowsWin32SystemServicesNapiAddon != null) (windowsWin32SystemServicesNapiAddon.windowssysWindowsWin32SystemServicesNotifyServiceStatusChangeW(hservice.rawAddress.toString(), dwnotifymask.toInt(), pnotifybuffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openSCManagerA(lpmachinename: Pcstr, lpdatabasename: Pcstr, dwdesiredaccess: UInt): ScHandle =
    if (windowsWin32SystemServicesNapiAddon != null) MutPtr((windowsWin32SystemServicesNapiAddon.windowssysWindowsWin32SystemServicesOpenSCManagerA(lpmachinename.rawAddress.toString(), lpdatabasename.rawAddress.toString(), dwdesiredaccess.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openSCManagerW(lpmachinename: Pcwstr, lpdatabasename: Pcwstr, dwdesiredaccess: UInt): ScHandle =
    if (windowsWin32SystemServicesNapiAddon != null) MutPtr((windowsWin32SystemServicesNapiAddon.windowssysWindowsWin32SystemServicesOpenSCManagerW(lpmachinename.rawAddress.toString(), lpdatabasename.rawAddress.toString(), dwdesiredaccess.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openServiceA(hscmanager: ScHandle, lpservicename: Pcstr, dwdesiredaccess: UInt): ScHandle =
    if (windowsWin32SystemServicesNapiAddon != null) MutPtr((windowsWin32SystemServicesNapiAddon.windowssysWindowsWin32SystemServicesOpenServiceA(hscmanager.rawAddress.toString(), lpservicename.rawAddress.toString(), dwdesiredaccess.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openServiceW(hscmanager: ScHandle, lpservicename: Pcwstr, dwdesiredaccess: UInt): ScHandle =
    if (windowsWin32SystemServicesNapiAddon != null) MutPtr((windowsWin32SystemServicesNapiAddon.windowssysWindowsWin32SystemServicesOpenServiceW(hscmanager.rawAddress.toString(), lpservicename.rawAddress.toString(), dwdesiredaccess.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryServiceConfig2A(hservice: ScHandle, dwinfolevel: ServiceConfig, lpbuffer: MutPtr, cbbufsize: UInt, pcbbytesneeded: MutPtr): Bool =
    if (windowsWin32SystemServicesNapiAddon != null) (windowsWin32SystemServicesNapiAddon.windowssysWindowsWin32SystemServicesQueryServiceConfig2A(hservice.rawAddress.toString(), dwinfolevel.toInt(), lpbuffer.rawAddress.toString(), cbbufsize.toInt(), pcbbytesneeded.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryServiceConfig2W(hservice: ScHandle, dwinfolevel: ServiceConfig, lpbuffer: MutPtr, cbbufsize: UInt, pcbbytesneeded: MutPtr): Bool =
    if (windowsWin32SystemServicesNapiAddon != null) (windowsWin32SystemServicesNapiAddon.windowssysWindowsWin32SystemServicesQueryServiceConfig2W(hservice.rawAddress.toString(), dwinfolevel.toInt(), lpbuffer.rawAddress.toString(), cbbufsize.toInt(), pcbbytesneeded.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryServiceConfigA(hservice: ScHandle, lpserviceconfig: MutPtr, cbbufsize: UInt, pcbbytesneeded: MutPtr): Bool =
    if (windowsWin32SystemServicesNapiAddon != null) (windowsWin32SystemServicesNapiAddon.windowssysWindowsWin32SystemServicesQueryServiceConfigA(hservice.rawAddress.toString(), lpserviceconfig.rawAddress.toString(), cbbufsize.toInt(), pcbbytesneeded.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryServiceConfigW(hservice: ScHandle, lpserviceconfig: MutPtr, cbbufsize: UInt, pcbbytesneeded: MutPtr): Bool =
    if (windowsWin32SystemServicesNapiAddon != null) (windowsWin32SystemServicesNapiAddon.windowssysWindowsWin32SystemServicesQueryServiceConfigW(hservice.rawAddress.toString(), lpserviceconfig.rawAddress.toString(), cbbufsize.toInt(), pcbbytesneeded.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryServiceDynamicInformation(hservicestatus: ServiceStatusHandle, dwinfolevel: UInt, ppdynamicinfo: MutPtr): Bool =
    if (windowsWin32SystemServicesNapiAddon != null) (windowsWin32SystemServicesNapiAddon.windowssysWindowsWin32SystemServicesQueryServiceDynamicInformation(hservicestatus.rawAddress.toString(), dwinfolevel.toInt(), ppdynamicinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryServiceLockStatusA(hscmanager: ScHandle, lplockstatus: MutPtr, cbbufsize: UInt, pcbbytesneeded: MutPtr): Bool =
    if (windowsWin32SystemServicesNapiAddon != null) (windowsWin32SystemServicesNapiAddon.windowssysWindowsWin32SystemServicesQueryServiceLockStatusA(hscmanager.rawAddress.toString(), lplockstatus.rawAddress.toString(), cbbufsize.toInt(), pcbbytesneeded.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryServiceLockStatusW(hscmanager: ScHandle, lplockstatus: MutPtr, cbbufsize: UInt, pcbbytesneeded: MutPtr): Bool =
    if (windowsWin32SystemServicesNapiAddon != null) (windowsWin32SystemServicesNapiAddon.windowssysWindowsWin32SystemServicesQueryServiceLockStatusW(hscmanager.rawAddress.toString(), lplockstatus.rawAddress.toString(), cbbufsize.toInt(), pcbbytesneeded.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryServiceObjectSecurity(hservice: ScHandle, dwsecurityinformation: UInt, lpsecuritydescriptor: PsecurityDescriptor, cbbufsize: UInt, pcbbytesneeded: MutPtr): Bool =
    if (windowsWin32SystemServicesNapiAddon != null) (windowsWin32SystemServicesNapiAddon.windowssysWindowsWin32SystemServicesQueryServiceObjectSecurity(hservice.rawAddress.toString(), dwsecurityinformation.toInt(), lpsecuritydescriptor.rawAddress.toString(), cbbufsize.toInt(), pcbbytesneeded.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryServiceStatus(hservice: ScHandle, lpservicestatus: MutPtr): Bool =
    if (windowsWin32SystemServicesNapiAddon != null) (windowsWin32SystemServicesNapiAddon.windowssysWindowsWin32SystemServicesQueryServiceStatus(hservice.rawAddress.toString(), lpservicestatus.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryServiceStatusEx(hservice: ScHandle, infolevel: ScStatusType, lpbuffer: MutPtr, cbbufsize: UInt, pcbbytesneeded: MutPtr): Bool =
    if (windowsWin32SystemServicesNapiAddon != null) (windowsWin32SystemServicesNapiAddon.windowssysWindowsWin32SystemServicesQueryServiceStatusEx(hservice.rawAddress.toString(), infolevel, lpbuffer.rawAddress.toString(), cbbufsize.toInt(), pcbbytesneeded.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerServiceCtrlHandlerA(lpservicename: Pcstr, lphandlerproc: LphandlerFunction): ServiceStatusHandle =
    if (windowsWin32SystemServicesNapiAddon != null) MutPtr((windowsWin32SystemServicesNapiAddon.windowssysWindowsWin32SystemServicesRegisterServiceCtrlHandlerA(lpservicename.rawAddress.toString(), 0L.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerServiceCtrlHandlerExA(lpservicename: Pcstr, lphandlerproc: LphandlerFunctionEx, lpcontext: ConstPtr): ServiceStatusHandle =
    if (windowsWin32SystemServicesNapiAddon != null) MutPtr((windowsWin32SystemServicesNapiAddon.windowssysWindowsWin32SystemServicesRegisterServiceCtrlHandlerExA(lpservicename.rawAddress.toString(), 0L.toString(), lpcontext.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerServiceCtrlHandlerExW(lpservicename: Pcwstr, lphandlerproc: LphandlerFunctionEx, lpcontext: ConstPtr): ServiceStatusHandle =
    if (windowsWin32SystemServicesNapiAddon != null) MutPtr((windowsWin32SystemServicesNapiAddon.windowssysWindowsWin32SystemServicesRegisterServiceCtrlHandlerExW(lpservicename.rawAddress.toString(), 0L.toString(), lpcontext.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerServiceCtrlHandlerW(lpservicename: Pcwstr, lphandlerproc: LphandlerFunction): ServiceStatusHandle =
    if (windowsWin32SystemServicesNapiAddon != null) MutPtr((windowsWin32SystemServicesNapiAddon.windowssysWindowsWin32SystemServicesRegisterServiceCtrlHandlerW(lpservicename.rawAddress.toString(), 0L.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setServiceBits(hservicestatus: ServiceStatusHandle, dwservicebits: UInt, bsetbitson: Bool, bupdateimmediately: Bool): Bool =
    if (windowsWin32SystemServicesNapiAddon != null) (windowsWin32SystemServicesNapiAddon.windowssysWindowsWin32SystemServicesSetServiceBits(hservicestatus.rawAddress.toString(), dwservicebits.toInt(), bsetbitson, bupdateimmediately) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setServiceObjectSecurity(hservice: ScHandle, dwsecurityinformation: ObjectSecurityInformation, lpsecuritydescriptor: PsecurityDescriptor): Bool =
    if (windowsWin32SystemServicesNapiAddon != null) (windowsWin32SystemServicesNapiAddon.windowssysWindowsWin32SystemServicesSetServiceObjectSecurity(hservice.rawAddress.toString(), dwsecurityinformation.toInt(), lpsecuritydescriptor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setServiceStatus(hservicestatus: ServiceStatusHandle, lpservicestatus: ConstPtr): Bool =
    if (windowsWin32SystemServicesNapiAddon != null) (windowsWin32SystemServicesNapiAddon.windowssysWindowsWin32SystemServicesSetServiceStatus(hservicestatus.rawAddress.toString(), lpservicestatus.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun startServiceA(hservice: ScHandle, dwnumserviceargs: UInt, lpserviceargvectors: ConstPtr): Bool =
    if (windowsWin32SystemServicesNapiAddon != null) (windowsWin32SystemServicesNapiAddon.windowssysWindowsWin32SystemServicesStartServiceA(hservice.rawAddress.toString(), dwnumserviceargs.toInt(), lpserviceargvectors.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun startServiceCtrlDispatcherA(lpservicestarttable: ConstPtr): Bool =
    if (windowsWin32SystemServicesNapiAddon != null) (windowsWin32SystemServicesNapiAddon.windowssysWindowsWin32SystemServicesStartServiceCtrlDispatcherA(lpservicestarttable.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun startServiceCtrlDispatcherW(lpservicestarttable: ConstPtr): Bool =
    if (windowsWin32SystemServicesNapiAddon != null) (windowsWin32SystemServicesNapiAddon.windowssysWindowsWin32SystemServicesStartServiceCtrlDispatcherW(lpservicestarttable.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun startServiceW(hservice: ScHandle, dwnumserviceargs: UInt, lpserviceargvectors: ConstPtr): Bool =
    if (windowsWin32SystemServicesNapiAddon != null) (windowsWin32SystemServicesNapiAddon.windowssysWindowsWin32SystemServicesStartServiceW(hservice.rawAddress.toString(), dwnumserviceargs.toInt(), lpserviceargvectors.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun subscribeServiceChangeNotifications(hservice: ScHandle, eeventtype: ScEventType, pcallback: PscNotificationCallback, pcallbackcontext: ConstPtr, psubscription: MutPtr): UInt =
    if (windowsWin32SystemServicesNapiAddon != null) (windowsWin32SystemServicesNapiAddon.windowssysWindowsWin32SystemServicesSubscribeServiceChangeNotifications(hservice.rawAddress.toString(), eeventtype, 0L.toString(), pcallbackcontext.rawAddress.toString(), psubscription.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlockServiceDatabase(sclock: ConstPtr): Bool =
    if (windowsWin32SystemServicesNapiAddon != null) (windowsWin32SystemServicesNapiAddon.windowssysWindowsWin32SystemServicesUnlockServiceDatabase(sclock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unsubscribeServiceChangeNotifications(psubscription: PscNotificationRegistration) {
    if (windowsWin32SystemServicesNapiAddon != null) {
        windowsWin32SystemServicesNapiAddon.windowssysWindowsWin32SystemServicesUnsubscribeServiceChangeNotifications(psubscription.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun waitServiceState(hservice: ScHandle, dwnotify: UInt, dwtimeout: UInt, hcancelevent: Handle): UInt =
    if (windowsWin32SystemServicesNapiAddon != null) (windowsWin32SystemServicesNapiAddon.windowssysWindowsWin32SystemServicesWaitServiceState(hservice.rawAddress.toString(), dwnotify.toInt(), dwtimeout.toInt(), hcancelevent.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
