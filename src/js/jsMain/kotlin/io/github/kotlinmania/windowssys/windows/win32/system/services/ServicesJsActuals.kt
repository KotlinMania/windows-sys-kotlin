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

private val _windowsWin32SystemServicesNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun changeServiceConfig2A(hservice: ScHandle, dwinfolevel: ServiceConfig, lpinfo: COpaquePointer?): Bool =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_changeServiceConfig2A((hservice?.value ?: 0L).toString(), dwinfolevel.toInt(), (lpinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun changeServiceConfig2W(hservice: ScHandle, dwinfolevel: ServiceConfig, lpinfo: COpaquePointer?): Bool =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_changeServiceConfig2W((hservice?.value ?: 0L).toString(), dwinfolevel.toInt(), (lpinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun changeServiceConfigA(hservice: ScHandle, dwservicetype: EnumServiceType, dwstarttype: ServiceStartType, dwerrorcontrol: ServiceError, lpbinarypathname: Pcstr, lploadordergroup: Pcstr, lpdwtagid: COpaquePointer?, lpdependencies: Pcstr, lpservicestartname: Pcstr, lppassword: Pcstr, lpdisplayname: Pcstr): Bool =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_changeServiceConfigA((hservice?.value ?: 0L).toString(), dwservicetype.toInt(), dwstarttype.toInt(), dwerrorcontrol.toInt(), (lpbinarypathname?.value ?: 0L).toString(), (lploadordergroup?.value ?: 0L).toString(), (lpdwtagid?.value ?: 0L).toString(), (lpdependencies?.value ?: 0L).toString(), (lpservicestartname?.value ?: 0L).toString(), (lppassword?.value ?: 0L).toString(), (lpdisplayname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun changeServiceConfigW(hservice: ScHandle, dwservicetype: EnumServiceType, dwstarttype: ServiceStartType, dwerrorcontrol: ServiceError, lpbinarypathname: Pcwstr, lploadordergroup: Pcwstr, lpdwtagid: COpaquePointer?, lpdependencies: Pcwstr, lpservicestartname: Pcwstr, lppassword: Pcwstr, lpdisplayname: Pcwstr): Bool =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_changeServiceConfigW((hservice?.value ?: 0L).toString(), dwservicetype.toInt(), dwstarttype.toInt(), dwerrorcontrol.toInt(), (lpbinarypathname?.value ?: 0L).toString(), (lploadordergroup?.value ?: 0L).toString(), (lpdwtagid?.value ?: 0L).toString(), (lpdependencies?.value ?: 0L).toString(), (lpservicestartname?.value ?: 0L).toString(), (lppassword?.value ?: 0L).toString(), (lpdisplayname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeServiceHandle(hscobject: ScHandle): Bool =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_closeServiceHandle((hscobject?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun controlService(hservice: ScHandle, dwcontrol: UInt, lpservicestatus: COpaquePointer?): Bool =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_controlService((hservice?.value ?: 0L).toString(), dwcontrol.toInt(), (lpservicestatus?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun controlServiceExA(hservice: ScHandle, dwcontrol: UInt, dwinfolevel: UInt, pcontrolparams: COpaquePointer?): Bool =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_controlServiceExA((hservice?.value ?: 0L).toString(), dwcontrol.toInt(), dwinfolevel.toInt(), (pcontrolparams?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun controlServiceExW(hservice: ScHandle, dwcontrol: UInt, dwinfolevel: UInt, pcontrolparams: COpaquePointer?): Bool =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_controlServiceExW((hservice?.value ?: 0L).toString(), dwcontrol.toInt(), dwinfolevel.toInt(), (pcontrolparams?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createServiceA(hscmanager: ScHandle, lpservicename: Pcstr, lpdisplayname: Pcstr, dwdesiredaccess: UInt, dwservicetype: EnumServiceType, dwstarttype: ServiceStartType, dwerrorcontrol: ServiceError, lpbinarypathname: Pcstr, lploadordergroup: Pcstr, lpdwtagid: COpaquePointer?, lpdependencies: Pcstr, lpservicestartname: Pcstr, lppassword: Pcstr): ScHandle =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_createServiceA((hscmanager?.value ?: 0L).toString(), (lpservicename?.value ?: 0L).toString(), (lpdisplayname?.value ?: 0L).toString(), dwdesiredaccess.toInt(), dwservicetype.toInt(), dwstarttype.toInt(), dwerrorcontrol.toInt(), (lpbinarypathname?.value ?: 0L).toString(), (lploadordergroup?.value ?: 0L).toString(), (lpdwtagid?.value ?: 0L).toString(), (lpdependencies?.value ?: 0L).toString(), (lpservicestartname?.value ?: 0L).toString(), (lppassword?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createServiceW(hscmanager: ScHandle, lpservicename: Pcwstr, lpdisplayname: Pcwstr, dwdesiredaccess: UInt, dwservicetype: EnumServiceType, dwstarttype: ServiceStartType, dwerrorcontrol: ServiceError, lpbinarypathname: Pcwstr, lploadordergroup: Pcwstr, lpdwtagid: COpaquePointer?, lpdependencies: Pcwstr, lpservicestartname: Pcwstr, lppassword: Pcwstr): ScHandle =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_createServiceW((hscmanager?.value ?: 0L).toString(), (lpservicename?.value ?: 0L).toString(), (lpdisplayname?.value ?: 0L).toString(), dwdesiredaccess.toInt(), dwservicetype.toInt(), dwstarttype.toInt(), dwerrorcontrol.toInt(), (lpbinarypathname?.value ?: 0L).toString(), (lploadordergroup?.value ?: 0L).toString(), (lpdwtagid?.value ?: 0L).toString(), (lpdependencies?.value ?: 0L).toString(), (lpservicestartname?.value ?: 0L).toString(), (lppassword?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteService(hservice: ScHandle): Bool =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_deleteService((hservice?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumDependentServicesA(hservice: ScHandle, dwservicestate: EnumServiceState, lpservices: COpaquePointer?, cbbufsize: UInt, pcbbytesneeded: COpaquePointer?, lpservicesreturned: COpaquePointer?): Bool =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_enumDependentServicesA((hservice?.value ?: 0L).toString(), dwservicestate.toInt(), (lpservices?.value ?: 0L).toString(), cbbufsize.toInt(), (pcbbytesneeded?.value ?: 0L).toString(), (lpservicesreturned?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumDependentServicesW(hservice: ScHandle, dwservicestate: EnumServiceState, lpservices: COpaquePointer?, cbbufsize: UInt, pcbbytesneeded: COpaquePointer?, lpservicesreturned: COpaquePointer?): Bool =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_enumDependentServicesW((hservice?.value ?: 0L).toString(), dwservicestate.toInt(), (lpservices?.value ?: 0L).toString(), cbbufsize.toInt(), (pcbbytesneeded?.value ?: 0L).toString(), (lpservicesreturned?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumServicesStatusA(hscmanager: ScHandle, dwservicetype: EnumServiceType, dwservicestate: EnumServiceState, lpservices: COpaquePointer?, cbbufsize: UInt, pcbbytesneeded: COpaquePointer?, lpservicesreturned: COpaquePointer?, lpresumehandle: COpaquePointer?): Bool =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_enumServicesStatusA((hscmanager?.value ?: 0L).toString(), dwservicetype.toInt(), dwservicestate.toInt(), (lpservices?.value ?: 0L).toString(), cbbufsize.toInt(), (pcbbytesneeded?.value ?: 0L).toString(), (lpservicesreturned?.value ?: 0L).toString(), (lpresumehandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumServicesStatusExA(hscmanager: ScHandle, infolevel: ScEnumType, dwservicetype: EnumServiceType, dwservicestate: EnumServiceState, lpservices: COpaquePointer?, cbbufsize: UInt, pcbbytesneeded: COpaquePointer?, lpservicesreturned: COpaquePointer?, lpresumehandle: COpaquePointer?, pszgroupname: Pcstr): Bool =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_enumServicesStatusExA((hscmanager?.value ?: 0L).toString(), infolevel, dwservicetype.toInt(), dwservicestate.toInt(), (lpservices?.value ?: 0L).toString(), cbbufsize.toInt(), (pcbbytesneeded?.value ?: 0L).toString(), (lpservicesreturned?.value ?: 0L).toString(), (lpresumehandle?.value ?: 0L).toString(), (pszgroupname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumServicesStatusExW(hscmanager: ScHandle, infolevel: ScEnumType, dwservicetype: EnumServiceType, dwservicestate: EnumServiceState, lpservices: COpaquePointer?, cbbufsize: UInt, pcbbytesneeded: COpaquePointer?, lpservicesreturned: COpaquePointer?, lpresumehandle: COpaquePointer?, pszgroupname: Pcwstr): Bool =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_enumServicesStatusExW((hscmanager?.value ?: 0L).toString(), infolevel, dwservicetype.toInt(), dwservicestate.toInt(), (lpservices?.value ?: 0L).toString(), cbbufsize.toInt(), (pcbbytesneeded?.value ?: 0L).toString(), (lpservicesreturned?.value ?: 0L).toString(), (lpresumehandle?.value ?: 0L).toString(), (pszgroupname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumServicesStatusW(hscmanager: ScHandle, dwservicetype: EnumServiceType, dwservicestate: EnumServiceState, lpservices: COpaquePointer?, cbbufsize: UInt, pcbbytesneeded: COpaquePointer?, lpservicesreturned: COpaquePointer?, lpresumehandle: COpaquePointer?): Bool =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_enumServicesStatusW((hscmanager?.value ?: 0L).toString(), dwservicetype.toInt(), dwservicestate.toInt(), (lpservices?.value ?: 0L).toString(), cbbufsize.toInt(), (pcbbytesneeded?.value ?: 0L).toString(), (lpservicesreturned?.value ?: 0L).toString(), (lpresumehandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getServiceDirectory(hservicestatus: ServiceStatusHandle, edirectorytype: ServiceDirectoryType, lppathbuffer: Pwstr, cchpathbufferlength: UInt, lpcchrequiredbufferlength: COpaquePointer?): UInt =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_getServiceDirectory((hservicestatus?.value ?: 0L).toString(), edirectorytype, (lppathbuffer?.value ?: 0L).toString(), cchpathbufferlength.toInt(), (lpcchrequiredbufferlength?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getServiceDisplayNameA(hscmanager: ScHandle, lpservicename: Pcstr, lpdisplayname: Pstr, lpcchbuffer: COpaquePointer?): Bool =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_getServiceDisplayNameA((hscmanager?.value ?: 0L).toString(), (lpservicename?.value ?: 0L).toString(), (lpdisplayname?.value ?: 0L).toString(), (lpcchbuffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getServiceDisplayNameW(hscmanager: ScHandle, lpservicename: Pcwstr, lpdisplayname: Pwstr, lpcchbuffer: COpaquePointer?): Bool =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_getServiceDisplayNameW((hscmanager?.value ?: 0L).toString(), (lpservicename?.value ?: 0L).toString(), (lpdisplayname?.value ?: 0L).toString(), (lpcchbuffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getServiceKeyNameA(hscmanager: ScHandle, lpdisplayname: Pcstr, lpservicename: Pstr, lpcchbuffer: COpaquePointer?): Bool =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_getServiceKeyNameA((hscmanager?.value ?: 0L).toString(), (lpdisplayname?.value ?: 0L).toString(), (lpservicename?.value ?: 0L).toString(), (lpcchbuffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getServiceKeyNameW(hscmanager: ScHandle, lpdisplayname: Pcwstr, lpservicename: Pwstr, lpcchbuffer: COpaquePointer?): Bool =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_getServiceKeyNameW((hscmanager?.value ?: 0L).toString(), (lpdisplayname?.value ?: 0L).toString(), (lpservicename?.value ?: 0L).toString(), (lpcchbuffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getServiceRegistryStateKey(servicestatushandle: ServiceStatusHandle, statetype: ServiceRegistryStateType, accessmask: UInt, servicestatekey: COpaquePointer?): UInt =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_getServiceRegistryStateKey((servicestatushandle?.value ?: 0L).toString(), statetype, accessmask.toInt(), (servicestatekey?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSharedServiceDirectory(servicehandle: ScHandle, directorytype: ServiceSharedDirectoryType, pathbuffer: Pwstr, pathbufferlength: UInt, requiredbufferlength: COpaquePointer?): UInt =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_getSharedServiceDirectory((servicehandle?.value ?: 0L).toString(), directorytype, (pathbuffer?.value ?: 0L).toString(), pathbufferlength.toInt(), (requiredbufferlength?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSharedServiceRegistryStateKey(servicehandle: ScHandle, statetype: ServiceSharedRegistryStateType, accessmask: UInt, servicestatekey: COpaquePointer?): UInt =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_getSharedServiceRegistryStateKey((servicehandle?.value ?: 0L).toString(), statetype, accessmask.toInt(), (servicestatekey?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lockServiceDatabase(hscmanager: ScHandle): COpaquePointer? =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_lockServiceDatabase((hscmanager?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun notifyBootConfigStatus(bootacceptable: Bool): Bool =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_notifyBootConfigStatus(bootacceptable) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun notifyServiceStatusChangeA(hservice: ScHandle, dwnotifymask: ServiceNotify, pnotifybuffer: COpaquePointer?): UInt =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_notifyServiceStatusChangeA((hservice?.value ?: 0L).toString(), dwnotifymask.toInt(), (pnotifybuffer?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun notifyServiceStatusChangeW(hservice: ScHandle, dwnotifymask: ServiceNotify, pnotifybuffer: COpaquePointer?): UInt =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_notifyServiceStatusChangeW((hservice?.value ?: 0L).toString(), dwnotifymask.toInt(), (pnotifybuffer?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openSCManagerA(lpmachinename: Pcstr, lpdatabasename: Pcstr, dwdesiredaccess: UInt): ScHandle =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_openSCManagerA((lpmachinename?.value ?: 0L).toString(), (lpdatabasename?.value ?: 0L).toString(), dwdesiredaccess.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openSCManagerW(lpmachinename: Pcwstr, lpdatabasename: Pcwstr, dwdesiredaccess: UInt): ScHandle =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_openSCManagerW((lpmachinename?.value ?: 0L).toString(), (lpdatabasename?.value ?: 0L).toString(), dwdesiredaccess.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openServiceA(hscmanager: ScHandle, lpservicename: Pcstr, dwdesiredaccess: UInt): ScHandle =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_openServiceA((hscmanager?.value ?: 0L).toString(), (lpservicename?.value ?: 0L).toString(), dwdesiredaccess.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openServiceW(hscmanager: ScHandle, lpservicename: Pcwstr, dwdesiredaccess: UInt): ScHandle =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_openServiceW((hscmanager?.value ?: 0L).toString(), (lpservicename?.value ?: 0L).toString(), dwdesiredaccess.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryServiceConfig2A(hservice: ScHandle, dwinfolevel: ServiceConfig, lpbuffer: COpaquePointer?, cbbufsize: UInt, pcbbytesneeded: COpaquePointer?): Bool =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_queryServiceConfig2A((hservice?.value ?: 0L).toString(), dwinfolevel.toInt(), (lpbuffer?.value ?: 0L).toString(), cbbufsize.toInt(), (pcbbytesneeded?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryServiceConfig2W(hservice: ScHandle, dwinfolevel: ServiceConfig, lpbuffer: COpaquePointer?, cbbufsize: UInt, pcbbytesneeded: COpaquePointer?): Bool =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_queryServiceConfig2W((hservice?.value ?: 0L).toString(), dwinfolevel.toInt(), (lpbuffer?.value ?: 0L).toString(), cbbufsize.toInt(), (pcbbytesneeded?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryServiceConfigA(hservice: ScHandle, lpserviceconfig: COpaquePointer?, cbbufsize: UInt, pcbbytesneeded: COpaquePointer?): Bool =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_queryServiceConfigA((hservice?.value ?: 0L).toString(), (lpserviceconfig?.value ?: 0L).toString(), cbbufsize.toInt(), (pcbbytesneeded?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryServiceConfigW(hservice: ScHandle, lpserviceconfig: COpaquePointer?, cbbufsize: UInt, pcbbytesneeded: COpaquePointer?): Bool =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_queryServiceConfigW((hservice?.value ?: 0L).toString(), (lpserviceconfig?.value ?: 0L).toString(), cbbufsize.toInt(), (pcbbytesneeded?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryServiceDynamicInformation(hservicestatus: ServiceStatusHandle, dwinfolevel: UInt, ppdynamicinfo: COpaquePointer?): Bool =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_queryServiceDynamicInformation((hservicestatus?.value ?: 0L).toString(), dwinfolevel.toInt(), (ppdynamicinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryServiceLockStatusA(hscmanager: ScHandle, lplockstatus: COpaquePointer?, cbbufsize: UInt, pcbbytesneeded: COpaquePointer?): Bool =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_queryServiceLockStatusA((hscmanager?.value ?: 0L).toString(), (lplockstatus?.value ?: 0L).toString(), cbbufsize.toInt(), (pcbbytesneeded?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryServiceLockStatusW(hscmanager: ScHandle, lplockstatus: COpaquePointer?, cbbufsize: UInt, pcbbytesneeded: COpaquePointer?): Bool =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_queryServiceLockStatusW((hscmanager?.value ?: 0L).toString(), (lplockstatus?.value ?: 0L).toString(), cbbufsize.toInt(), (pcbbytesneeded?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryServiceObjectSecurity(hservice: ScHandle, dwsecurityinformation: UInt, lpsecuritydescriptor: PsecurityDescriptor, cbbufsize: UInt, pcbbytesneeded: COpaquePointer?): Bool =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_queryServiceObjectSecurity((hservice?.value ?: 0L).toString(), dwsecurityinformation.toInt(), (lpsecuritydescriptor?.value ?: 0L).toString(), cbbufsize.toInt(), (pcbbytesneeded?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryServiceStatus(hservice: ScHandle, lpservicestatus: COpaquePointer?): Bool =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_queryServiceStatus((hservice?.value ?: 0L).toString(), (lpservicestatus?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryServiceStatusEx(hservice: ScHandle, infolevel: ScStatusType, lpbuffer: COpaquePointer?, cbbufsize: UInt, pcbbytesneeded: COpaquePointer?): Bool =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_queryServiceStatusEx((hservice?.value ?: 0L).toString(), infolevel, (lpbuffer?.value ?: 0L).toString(), cbbufsize.toInt(), (pcbbytesneeded?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerServiceCtrlHandlerA(lpservicename: Pcstr, lphandlerproc: LphandlerFunction): ServiceStatusHandle =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_registerServiceCtrlHandlerA((lpservicename?.value ?: 0L).toString(), 0L.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerServiceCtrlHandlerExA(lpservicename: Pcstr, lphandlerproc: LphandlerFunctionEx, lpcontext: COpaquePointer?): ServiceStatusHandle =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_registerServiceCtrlHandlerExA((lpservicename?.value ?: 0L).toString(), 0L.toString(), (lpcontext?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerServiceCtrlHandlerExW(lpservicename: Pcwstr, lphandlerproc: LphandlerFunctionEx, lpcontext: COpaquePointer?): ServiceStatusHandle =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_registerServiceCtrlHandlerExW((lpservicename?.value ?: 0L).toString(), 0L.toString(), (lpcontext?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerServiceCtrlHandlerW(lpservicename: Pcwstr, lphandlerproc: LphandlerFunction): ServiceStatusHandle =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_registerServiceCtrlHandlerW((lpservicename?.value ?: 0L).toString(), 0L.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setServiceBits(hservicestatus: ServiceStatusHandle, dwservicebits: UInt, bsetbitson: Bool, bupdateimmediately: Bool): Bool =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_setServiceBits((hservicestatus?.value ?: 0L).toString(), dwservicebits.toInt(), bsetbitson, bupdateimmediately) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setServiceObjectSecurity(hservice: ScHandle, dwsecurityinformation: ObjectSecurityInformation, lpsecuritydescriptor: PsecurityDescriptor): Bool =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_setServiceObjectSecurity((hservice?.value ?: 0L).toString(), dwsecurityinformation.toInt(), (lpsecuritydescriptor?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setServiceStatus(hservicestatus: ServiceStatusHandle, lpservicestatus: COpaquePointer?): Bool =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_setServiceStatus((hservicestatus?.value ?: 0L).toString(), (lpservicestatus?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun startServiceA(hservice: ScHandle, dwnumserviceargs: UInt, lpserviceargvectors: COpaquePointer?): Bool =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_startServiceA((hservice?.value ?: 0L).toString(), dwnumserviceargs.toInt(), (lpserviceargvectors?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun startServiceCtrlDispatcherA(lpservicestarttable: COpaquePointer?): Bool =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_startServiceCtrlDispatcherA((lpservicestarttable?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun startServiceCtrlDispatcherW(lpservicestarttable: COpaquePointer?): Bool =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_startServiceCtrlDispatcherW((lpservicestarttable?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun startServiceW(hservice: ScHandle, dwnumserviceargs: UInt, lpserviceargvectors: COpaquePointer?): Bool =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_startServiceW((hservice?.value ?: 0L).toString(), dwnumserviceargs.toInt(), (lpserviceargvectors?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun subscribeServiceChangeNotifications(hservice: ScHandle, eeventtype: ScEventType, pcallback: PscNotificationCallback, pcallbackcontext: COpaquePointer?, psubscription: COpaquePointer?): UInt =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_subscribeServiceChangeNotifications((hservice?.value ?: 0L).toString(), eeventtype, 0L.toString(), (pcallbackcontext?.value ?: 0L).toString(), (psubscription?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlockServiceDatabase(sclock: COpaquePointer?): Bool =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_unlockServiceDatabase((sclock?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unsubscribeServiceChangeNotifications(psubscription: PscNotificationRegistration) {
    if (_windowsWin32SystemServicesNapiAddon != null) {
        _windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_unsubscribeServiceChangeNotifications(psubscription.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun waitServiceState(hservice: ScHandle, dwnotify: UInt, dwtimeout: UInt, hcancelevent: Handle): UInt =
    if (_windowsWin32SystemServicesNapiAddon != null) (_windowsWin32SystemServicesNapiAddon.windowssys_windows_win32_system_services_waitServiceState((hservice?.value ?: 0L).toString(), dwnotify.toInt(), dwtimeout.toInt(), (hcancelevent?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
