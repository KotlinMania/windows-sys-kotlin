@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

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

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SystemServicesNapiAddon(): Boolean

private val windowsWin32SystemServicesNapiAvailable: Boolean = initWindowsWin32SystemServicesNapiAddon()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemServicesChangeServiceConfig2A(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemServicesChangeServiceConfig2A(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemServicesChangeServiceConfig2W(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemServicesChangeServiceConfig2W(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemServicesChangeServiceConfigA(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWin32SystemServicesChangeServiceConfigA(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: String, p8: String, p9: String, p10: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemServicesChangeServiceConfigW(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWin32SystemServicesChangeServiceConfigW(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: String, p8: String, p9: String, p10: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemServicesCloseServiceHandle(p0)")
private external fun wasmWindowssysWindowsWin32SystemServicesCloseServiceHandle(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemServicesControlService(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemServicesControlService(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemServicesControlServiceExA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemServicesControlServiceExA(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemServicesControlServiceExW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemServicesControlServiceExW(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemServicesCreateServiceA(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12)")
private external fun wasmWindowssysWindowsWin32SystemServicesCreateServiceA(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: Int, p6: Int, p7: String, p8: String, p9: String, p10: String, p11: String, p12: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemServicesCreateServiceW(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12)")
private external fun wasmWindowssysWindowsWin32SystemServicesCreateServiceW(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: Int, p6: Int, p7: String, p8: String, p9: String, p10: String, p11: String, p12: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemServicesDeleteService(p0)")
private external fun wasmWindowssysWindowsWin32SystemServicesDeleteService(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemServicesEnumDependentServicesA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemServicesEnumDependentServicesA(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemServicesEnumDependentServicesW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemServicesEnumDependentServicesW(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemServicesEnumServicesStatusA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemServicesEnumServicesStatusA(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemServicesEnumServicesStatusExA(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32SystemServicesEnumServicesStatusExA(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: Int, p6: String, p7: String, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemServicesEnumServicesStatusExW(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32SystemServicesEnumServicesStatusExW(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: Int, p6: String, p7: String, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemServicesEnumServicesStatusW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemServicesEnumServicesStatusW(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemServicesGetServiceDirectory(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemServicesGetServiceDirectory(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemServicesGetServiceDisplayNameA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemServicesGetServiceDisplayNameA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemServicesGetServiceDisplayNameW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemServicesGetServiceDisplayNameW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemServicesGetServiceKeyNameA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemServicesGetServiceKeyNameA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemServicesGetServiceKeyNameW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemServicesGetServiceKeyNameW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemServicesGetServiceRegistryStateKey(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemServicesGetServiceRegistryStateKey(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemServicesGetSharedServiceDirectory(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemServicesGetSharedServiceDirectory(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemServicesGetSharedServiceRegistryStateKey(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemServicesGetSharedServiceRegistryStateKey(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemServicesLockServiceDatabase(p0)")
private external fun wasmWindowssysWindowsWin32SystemServicesLockServiceDatabase(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemServicesNotifyBootConfigStatus(p0)")
private external fun wasmWindowssysWindowsWin32SystemServicesNotifyBootConfigStatus(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemServicesNotifyServiceStatusChangeA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemServicesNotifyServiceStatusChangeA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemServicesNotifyServiceStatusChangeW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemServicesNotifyServiceStatusChangeW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemServicesOpenSCManagerA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemServicesOpenSCManagerA(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemServicesOpenSCManagerW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemServicesOpenSCManagerW(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemServicesOpenServiceA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemServicesOpenServiceA(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemServicesOpenServiceW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemServicesOpenServiceW(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemServicesQueryServiceConfig2A(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemServicesQueryServiceConfig2A(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemServicesQueryServiceConfig2W(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemServicesQueryServiceConfig2W(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemServicesQueryServiceConfigA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemServicesQueryServiceConfigA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemServicesQueryServiceConfigW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemServicesQueryServiceConfigW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemServicesQueryServiceDynamicInformation(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemServicesQueryServiceDynamicInformation(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemServicesQueryServiceLockStatusA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemServicesQueryServiceLockStatusA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemServicesQueryServiceLockStatusW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemServicesQueryServiceLockStatusW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemServicesQueryServiceObjectSecurity(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemServicesQueryServiceObjectSecurity(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemServicesQueryServiceStatus(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemServicesQueryServiceStatus(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemServicesQueryServiceStatusEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemServicesQueryServiceStatusEx(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemServicesRegisterServiceCtrlHandlerA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemServicesRegisterServiceCtrlHandlerA(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemServicesRegisterServiceCtrlHandlerExA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemServicesRegisterServiceCtrlHandlerExA(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemServicesRegisterServiceCtrlHandlerExW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemServicesRegisterServiceCtrlHandlerExW(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemServicesRegisterServiceCtrlHandlerW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemServicesRegisterServiceCtrlHandlerW(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemServicesSetServiceBits(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemServicesSetServiceBits(p0: String, p1: Int, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemServicesSetServiceObjectSecurity(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemServicesSetServiceObjectSecurity(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemServicesSetServiceStatus(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemServicesSetServiceStatus(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemServicesStartServiceA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemServicesStartServiceA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemServicesStartServiceCtrlDispatcherA(p0)")
private external fun wasmWindowssysWindowsWin32SystemServicesStartServiceCtrlDispatcherA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemServicesStartServiceCtrlDispatcherW(p0)")
private external fun wasmWindowssysWindowsWin32SystemServicesStartServiceCtrlDispatcherW(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemServicesStartServiceW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemServicesStartServiceW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemServicesSubscribeServiceChangeNotifications(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemServicesSubscribeServiceChangeNotifications(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemServicesUnlockServiceDatabase(p0)")
private external fun wasmWindowssysWindowsWin32SystemServicesUnlockServiceDatabase(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemServicesUnsubscribeServiceChangeNotifications(p0)")
private external fun wasmWindowssysWindowsWin32SystemServicesUnsubscribeServiceChangeNotifications(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemServicesWaitServiceState(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemServicesWaitServiceState(p0: String, p1: Int, p2: Int, p3: String): Int

public actual fun changeServiceConfig2A(hservice: ScHandle, dwinfolevel: ServiceConfig, lpinfo: ConstPtr): Bool =
    if (windowsWin32SystemServicesNapiAvailable) wasmWindowssysWindowsWin32SystemServicesChangeServiceConfig2A(hservice.rawAddress.toString(), dwinfolevel.toInt(), lpinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun changeServiceConfig2W(hservice: ScHandle, dwinfolevel: ServiceConfig, lpinfo: ConstPtr): Bool =
    if (windowsWin32SystemServicesNapiAvailable) wasmWindowssysWindowsWin32SystemServicesChangeServiceConfig2W(hservice.rawAddress.toString(), dwinfolevel.toInt(), lpinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun changeServiceConfigA(hservice: ScHandle, dwservicetype: EnumServiceType, dwstarttype: ServiceStartType, dwerrorcontrol: ServiceError, lpbinarypathname: Pcstr, lploadordergroup: Pcstr, lpdwtagid: MutPtr, lpdependencies: Pcstr, lpservicestartname: Pcstr, lppassword: Pcstr, lpdisplayname: Pcstr): Bool =
    if (windowsWin32SystemServicesNapiAvailable) wasmWindowssysWindowsWin32SystemServicesChangeServiceConfigA(hservice.rawAddress.toString(), dwservicetype.toInt(), dwstarttype.toInt(), dwerrorcontrol.toInt(), lpbinarypathname.rawAddress.toString(), lploadordergroup.rawAddress.toString(), lpdwtagid.rawAddress.toString(), lpdependencies.rawAddress.toString(), lpservicestartname.rawAddress.toString(), lppassword.rawAddress.toString(), lpdisplayname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun changeServiceConfigW(hservice: ScHandle, dwservicetype: EnumServiceType, dwstarttype: ServiceStartType, dwerrorcontrol: ServiceError, lpbinarypathname: Pcwstr, lploadordergroup: Pcwstr, lpdwtagid: MutPtr, lpdependencies: Pcwstr, lpservicestartname: Pcwstr, lppassword: Pcwstr, lpdisplayname: Pcwstr): Bool =
    if (windowsWin32SystemServicesNapiAvailable) wasmWindowssysWindowsWin32SystemServicesChangeServiceConfigW(hservice.rawAddress.toString(), dwservicetype.toInt(), dwstarttype.toInt(), dwerrorcontrol.toInt(), lpbinarypathname.rawAddress.toString(), lploadordergroup.rawAddress.toString(), lpdwtagid.rawAddress.toString(), lpdependencies.rawAddress.toString(), lpservicestartname.rawAddress.toString(), lppassword.rawAddress.toString(), lpdisplayname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeServiceHandle(hscobject: ScHandle): Bool =
    if (windowsWin32SystemServicesNapiAvailable) wasmWindowssysWindowsWin32SystemServicesCloseServiceHandle(hscobject.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun controlService(hservice: ScHandle, dwcontrol: UInt, lpservicestatus: MutPtr): Bool =
    if (windowsWin32SystemServicesNapiAvailable) wasmWindowssysWindowsWin32SystemServicesControlService(hservice.rawAddress.toString(), dwcontrol.toInt(), lpservicestatus.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun controlServiceExA(hservice: ScHandle, dwcontrol: UInt, dwinfolevel: UInt, pcontrolparams: MutPtr): Bool =
    if (windowsWin32SystemServicesNapiAvailable) wasmWindowssysWindowsWin32SystemServicesControlServiceExA(hservice.rawAddress.toString(), dwcontrol.toInt(), dwinfolevel.toInt(), pcontrolparams.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun controlServiceExW(hservice: ScHandle, dwcontrol: UInt, dwinfolevel: UInt, pcontrolparams: MutPtr): Bool =
    if (windowsWin32SystemServicesNapiAvailable) wasmWindowssysWindowsWin32SystemServicesControlServiceExW(hservice.rawAddress.toString(), dwcontrol.toInt(), dwinfolevel.toInt(), pcontrolparams.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createServiceA(hscmanager: ScHandle, lpservicename: Pcstr, lpdisplayname: Pcstr, dwdesiredaccess: UInt, dwservicetype: EnumServiceType, dwstarttype: ServiceStartType, dwerrorcontrol: ServiceError, lpbinarypathname: Pcstr, lploadordergroup: Pcstr, lpdwtagid: MutPtr, lpdependencies: Pcstr, lpservicestartname: Pcstr, lppassword: Pcstr): ScHandle =
    if (windowsWin32SystemServicesNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemServicesCreateServiceA(hscmanager.rawAddress.toString(), lpservicename.rawAddress.toString(), lpdisplayname.rawAddress.toString(), dwdesiredaccess.toInt(), dwservicetype.toInt(), dwstarttype.toInt(), dwerrorcontrol.toInt(), lpbinarypathname.rawAddress.toString(), lploadordergroup.rawAddress.toString(), lpdwtagid.rawAddress.toString(), lpdependencies.rawAddress.toString(), lpservicestartname.rawAddress.toString(), lppassword.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createServiceW(hscmanager: ScHandle, lpservicename: Pcwstr, lpdisplayname: Pcwstr, dwdesiredaccess: UInt, dwservicetype: EnumServiceType, dwstarttype: ServiceStartType, dwerrorcontrol: ServiceError, lpbinarypathname: Pcwstr, lploadordergroup: Pcwstr, lpdwtagid: MutPtr, lpdependencies: Pcwstr, lpservicestartname: Pcwstr, lppassword: Pcwstr): ScHandle =
    if (windowsWin32SystemServicesNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemServicesCreateServiceW(hscmanager.rawAddress.toString(), lpservicename.rawAddress.toString(), lpdisplayname.rawAddress.toString(), dwdesiredaccess.toInt(), dwservicetype.toInt(), dwstarttype.toInt(), dwerrorcontrol.toInt(), lpbinarypathname.rawAddress.toString(), lploadordergroup.rawAddress.toString(), lpdwtagid.rawAddress.toString(), lpdependencies.rawAddress.toString(), lpservicestartname.rawAddress.toString(), lppassword.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteService(hservice: ScHandle): Bool =
    if (windowsWin32SystemServicesNapiAvailable) wasmWindowssysWindowsWin32SystemServicesDeleteService(hservice.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumDependentServicesA(hservice: ScHandle, dwservicestate: EnumServiceState, lpservices: MutPtr, cbbufsize: UInt, pcbbytesneeded: MutPtr, lpservicesreturned: MutPtr): Bool =
    if (windowsWin32SystemServicesNapiAvailable) wasmWindowssysWindowsWin32SystemServicesEnumDependentServicesA(hservice.rawAddress.toString(), dwservicestate.toInt(), lpservices.rawAddress.toString(), cbbufsize.toInt(), pcbbytesneeded.rawAddress.toString(), lpservicesreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumDependentServicesW(hservice: ScHandle, dwservicestate: EnumServiceState, lpservices: MutPtr, cbbufsize: UInt, pcbbytesneeded: MutPtr, lpservicesreturned: MutPtr): Bool =
    if (windowsWin32SystemServicesNapiAvailable) wasmWindowssysWindowsWin32SystemServicesEnumDependentServicesW(hservice.rawAddress.toString(), dwservicestate.toInt(), lpservices.rawAddress.toString(), cbbufsize.toInt(), pcbbytesneeded.rawAddress.toString(), lpservicesreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumServicesStatusA(hscmanager: ScHandle, dwservicetype: EnumServiceType, dwservicestate: EnumServiceState, lpservices: MutPtr, cbbufsize: UInt, pcbbytesneeded: MutPtr, lpservicesreturned: MutPtr, lpresumehandle: MutPtr): Bool =
    if (windowsWin32SystemServicesNapiAvailable) wasmWindowssysWindowsWin32SystemServicesEnumServicesStatusA(hscmanager.rawAddress.toString(), dwservicetype.toInt(), dwservicestate.toInt(), lpservices.rawAddress.toString(), cbbufsize.toInt(), pcbbytesneeded.rawAddress.toString(), lpservicesreturned.rawAddress.toString(), lpresumehandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumServicesStatusExA(hscmanager: ScHandle, infolevel: ScEnumType, dwservicetype: EnumServiceType, dwservicestate: EnumServiceState, lpservices: MutPtr, cbbufsize: UInt, pcbbytesneeded: MutPtr, lpservicesreturned: MutPtr, lpresumehandle: MutPtr, pszgroupname: Pcstr): Bool =
    if (windowsWin32SystemServicesNapiAvailable) wasmWindowssysWindowsWin32SystemServicesEnumServicesStatusExA(hscmanager.rawAddress.toString(), infolevel, dwservicetype.toInt(), dwservicestate.toInt(), lpservices.rawAddress.toString(), cbbufsize.toInt(), pcbbytesneeded.rawAddress.toString(), lpservicesreturned.rawAddress.toString(), lpresumehandle.rawAddress.toString(), pszgroupname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumServicesStatusExW(hscmanager: ScHandle, infolevel: ScEnumType, dwservicetype: EnumServiceType, dwservicestate: EnumServiceState, lpservices: MutPtr, cbbufsize: UInt, pcbbytesneeded: MutPtr, lpservicesreturned: MutPtr, lpresumehandle: MutPtr, pszgroupname: Pcwstr): Bool =
    if (windowsWin32SystemServicesNapiAvailable) wasmWindowssysWindowsWin32SystemServicesEnumServicesStatusExW(hscmanager.rawAddress.toString(), infolevel, dwservicetype.toInt(), dwservicestate.toInt(), lpservices.rawAddress.toString(), cbbufsize.toInt(), pcbbytesneeded.rawAddress.toString(), lpservicesreturned.rawAddress.toString(), lpresumehandle.rawAddress.toString(), pszgroupname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumServicesStatusW(hscmanager: ScHandle, dwservicetype: EnumServiceType, dwservicestate: EnumServiceState, lpservices: MutPtr, cbbufsize: UInt, pcbbytesneeded: MutPtr, lpservicesreturned: MutPtr, lpresumehandle: MutPtr): Bool =
    if (windowsWin32SystemServicesNapiAvailable) wasmWindowssysWindowsWin32SystemServicesEnumServicesStatusW(hscmanager.rawAddress.toString(), dwservicetype.toInt(), dwservicestate.toInt(), lpservices.rawAddress.toString(), cbbufsize.toInt(), pcbbytesneeded.rawAddress.toString(), lpservicesreturned.rawAddress.toString(), lpresumehandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getServiceDirectory(hservicestatus: ServiceStatusHandle, edirectorytype: ServiceDirectoryType, lppathbuffer: Pwstr, cchpathbufferlength: UInt, lpcchrequiredbufferlength: MutPtr): UInt =
    if (windowsWin32SystemServicesNapiAvailable) wasmWindowssysWindowsWin32SystemServicesGetServiceDirectory(hservicestatus.rawAddress.toString(), edirectorytype, lppathbuffer.rawAddress.toString(), cchpathbufferlength.toInt(), lpcchrequiredbufferlength.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getServiceDisplayNameA(hscmanager: ScHandle, lpservicename: Pcstr, lpdisplayname: Pstr, lpcchbuffer: MutPtr): Bool =
    if (windowsWin32SystemServicesNapiAvailable) wasmWindowssysWindowsWin32SystemServicesGetServiceDisplayNameA(hscmanager.rawAddress.toString(), lpservicename.rawAddress.toString(), lpdisplayname.rawAddress.toString(), lpcchbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getServiceDisplayNameW(hscmanager: ScHandle, lpservicename: Pcwstr, lpdisplayname: Pwstr, lpcchbuffer: MutPtr): Bool =
    if (windowsWin32SystemServicesNapiAvailable) wasmWindowssysWindowsWin32SystemServicesGetServiceDisplayNameW(hscmanager.rawAddress.toString(), lpservicename.rawAddress.toString(), lpdisplayname.rawAddress.toString(), lpcchbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getServiceKeyNameA(hscmanager: ScHandle, lpdisplayname: Pcstr, lpservicename: Pstr, lpcchbuffer: MutPtr): Bool =
    if (windowsWin32SystemServicesNapiAvailable) wasmWindowssysWindowsWin32SystemServicesGetServiceKeyNameA(hscmanager.rawAddress.toString(), lpdisplayname.rawAddress.toString(), lpservicename.rawAddress.toString(), lpcchbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getServiceKeyNameW(hscmanager: ScHandle, lpdisplayname: Pcwstr, lpservicename: Pwstr, lpcchbuffer: MutPtr): Bool =
    if (windowsWin32SystemServicesNapiAvailable) wasmWindowssysWindowsWin32SystemServicesGetServiceKeyNameW(hscmanager.rawAddress.toString(), lpdisplayname.rawAddress.toString(), lpservicename.rawAddress.toString(), lpcchbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getServiceRegistryStateKey(servicestatushandle: ServiceStatusHandle, statetype: ServiceRegistryStateType, accessmask: UInt, servicestatekey: MutPtr): UInt =
    if (windowsWin32SystemServicesNapiAvailable) wasmWindowssysWindowsWin32SystemServicesGetServiceRegistryStateKey(servicestatushandle.rawAddress.toString(), statetype, accessmask.toInt(), servicestatekey.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSharedServiceDirectory(servicehandle: ScHandle, directorytype: ServiceSharedDirectoryType, pathbuffer: Pwstr, pathbufferlength: UInt, requiredbufferlength: MutPtr): UInt =
    if (windowsWin32SystemServicesNapiAvailable) wasmWindowssysWindowsWin32SystemServicesGetSharedServiceDirectory(servicehandle.rawAddress.toString(), directorytype, pathbuffer.rawAddress.toString(), pathbufferlength.toInt(), requiredbufferlength.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSharedServiceRegistryStateKey(servicehandle: ScHandle, statetype: ServiceSharedRegistryStateType, accessmask: UInt, servicestatekey: MutPtr): UInt =
    if (windowsWin32SystemServicesNapiAvailable) wasmWindowssysWindowsWin32SystemServicesGetSharedServiceRegistryStateKey(servicehandle.rawAddress.toString(), statetype, accessmask.toInt(), servicestatekey.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lockServiceDatabase(hscmanager: ScHandle): MutPtr =
    if (windowsWin32SystemServicesNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemServicesLockServiceDatabase(hscmanager.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun notifyBootConfigStatus(bootacceptable: Bool): Bool =
    if (windowsWin32SystemServicesNapiAvailable) wasmWindowssysWindowsWin32SystemServicesNotifyBootConfigStatus(bootacceptable) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun notifyServiceStatusChangeA(hservice: ScHandle, dwnotifymask: ServiceNotify, pnotifybuffer: ConstPtr): UInt =
    if (windowsWin32SystemServicesNapiAvailable) wasmWindowssysWindowsWin32SystemServicesNotifyServiceStatusChangeA(hservice.rawAddress.toString(), dwnotifymask.toInt(), pnotifybuffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun notifyServiceStatusChangeW(hservice: ScHandle, dwnotifymask: ServiceNotify, pnotifybuffer: ConstPtr): UInt =
    if (windowsWin32SystemServicesNapiAvailable) wasmWindowssysWindowsWin32SystemServicesNotifyServiceStatusChangeW(hservice.rawAddress.toString(), dwnotifymask.toInt(), pnotifybuffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openSCManagerA(lpmachinename: Pcstr, lpdatabasename: Pcstr, dwdesiredaccess: UInt): ScHandle =
    if (windowsWin32SystemServicesNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemServicesOpenSCManagerA(lpmachinename.rawAddress.toString(), lpdatabasename.rawAddress.toString(), dwdesiredaccess.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openSCManagerW(lpmachinename: Pcwstr, lpdatabasename: Pcwstr, dwdesiredaccess: UInt): ScHandle =
    if (windowsWin32SystemServicesNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemServicesOpenSCManagerW(lpmachinename.rawAddress.toString(), lpdatabasename.rawAddress.toString(), dwdesiredaccess.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openServiceA(hscmanager: ScHandle, lpservicename: Pcstr, dwdesiredaccess: UInt): ScHandle =
    if (windowsWin32SystemServicesNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemServicesOpenServiceA(hscmanager.rawAddress.toString(), lpservicename.rawAddress.toString(), dwdesiredaccess.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openServiceW(hscmanager: ScHandle, lpservicename: Pcwstr, dwdesiredaccess: UInt): ScHandle =
    if (windowsWin32SystemServicesNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemServicesOpenServiceW(hscmanager.rawAddress.toString(), lpservicename.rawAddress.toString(), dwdesiredaccess.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryServiceConfig2A(hservice: ScHandle, dwinfolevel: ServiceConfig, lpbuffer: MutPtr, cbbufsize: UInt, pcbbytesneeded: MutPtr): Bool =
    if (windowsWin32SystemServicesNapiAvailable) wasmWindowssysWindowsWin32SystemServicesQueryServiceConfig2A(hservice.rawAddress.toString(), dwinfolevel.toInt(), lpbuffer.rawAddress.toString(), cbbufsize.toInt(), pcbbytesneeded.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryServiceConfig2W(hservice: ScHandle, dwinfolevel: ServiceConfig, lpbuffer: MutPtr, cbbufsize: UInt, pcbbytesneeded: MutPtr): Bool =
    if (windowsWin32SystemServicesNapiAvailable) wasmWindowssysWindowsWin32SystemServicesQueryServiceConfig2W(hservice.rawAddress.toString(), dwinfolevel.toInt(), lpbuffer.rawAddress.toString(), cbbufsize.toInt(), pcbbytesneeded.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryServiceConfigA(hservice: ScHandle, lpserviceconfig: MutPtr, cbbufsize: UInt, pcbbytesneeded: MutPtr): Bool =
    if (windowsWin32SystemServicesNapiAvailable) wasmWindowssysWindowsWin32SystemServicesQueryServiceConfigA(hservice.rawAddress.toString(), lpserviceconfig.rawAddress.toString(), cbbufsize.toInt(), pcbbytesneeded.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryServiceConfigW(hservice: ScHandle, lpserviceconfig: MutPtr, cbbufsize: UInt, pcbbytesneeded: MutPtr): Bool =
    if (windowsWin32SystemServicesNapiAvailable) wasmWindowssysWindowsWin32SystemServicesQueryServiceConfigW(hservice.rawAddress.toString(), lpserviceconfig.rawAddress.toString(), cbbufsize.toInt(), pcbbytesneeded.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryServiceDynamicInformation(hservicestatus: ServiceStatusHandle, dwinfolevel: UInt, ppdynamicinfo: MutPtr): Bool =
    if (windowsWin32SystemServicesNapiAvailable) wasmWindowssysWindowsWin32SystemServicesQueryServiceDynamicInformation(hservicestatus.rawAddress.toString(), dwinfolevel.toInt(), ppdynamicinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryServiceLockStatusA(hscmanager: ScHandle, lplockstatus: MutPtr, cbbufsize: UInt, pcbbytesneeded: MutPtr): Bool =
    if (windowsWin32SystemServicesNapiAvailable) wasmWindowssysWindowsWin32SystemServicesQueryServiceLockStatusA(hscmanager.rawAddress.toString(), lplockstatus.rawAddress.toString(), cbbufsize.toInt(), pcbbytesneeded.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryServiceLockStatusW(hscmanager: ScHandle, lplockstatus: MutPtr, cbbufsize: UInt, pcbbytesneeded: MutPtr): Bool =
    if (windowsWin32SystemServicesNapiAvailable) wasmWindowssysWindowsWin32SystemServicesQueryServiceLockStatusW(hscmanager.rawAddress.toString(), lplockstatus.rawAddress.toString(), cbbufsize.toInt(), pcbbytesneeded.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryServiceObjectSecurity(hservice: ScHandle, dwsecurityinformation: UInt, lpsecuritydescriptor: PsecurityDescriptor, cbbufsize: UInt, pcbbytesneeded: MutPtr): Bool =
    if (windowsWin32SystemServicesNapiAvailable) wasmWindowssysWindowsWin32SystemServicesQueryServiceObjectSecurity(hservice.rawAddress.toString(), dwsecurityinformation.toInt(), lpsecuritydescriptor.rawAddress.toString(), cbbufsize.toInt(), pcbbytesneeded.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryServiceStatus(hservice: ScHandle, lpservicestatus: MutPtr): Bool =
    if (windowsWin32SystemServicesNapiAvailable) wasmWindowssysWindowsWin32SystemServicesQueryServiceStatus(hservice.rawAddress.toString(), lpservicestatus.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryServiceStatusEx(hservice: ScHandle, infolevel: ScStatusType, lpbuffer: MutPtr, cbbufsize: UInt, pcbbytesneeded: MutPtr): Bool =
    if (windowsWin32SystemServicesNapiAvailable) wasmWindowssysWindowsWin32SystemServicesQueryServiceStatusEx(hservice.rawAddress.toString(), infolevel, lpbuffer.rawAddress.toString(), cbbufsize.toInt(), pcbbytesneeded.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerServiceCtrlHandlerA(lpservicename: Pcstr, lphandlerproc: LphandlerFunction): ServiceStatusHandle =
    if (windowsWin32SystemServicesNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemServicesRegisterServiceCtrlHandlerA(lpservicename.rawAddress.toString(), 0L.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerServiceCtrlHandlerExA(lpservicename: Pcstr, lphandlerproc: LphandlerFunctionEx, lpcontext: ConstPtr): ServiceStatusHandle =
    if (windowsWin32SystemServicesNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemServicesRegisterServiceCtrlHandlerExA(lpservicename.rawAddress.toString(), 0L.toString(), lpcontext.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerServiceCtrlHandlerExW(lpservicename: Pcwstr, lphandlerproc: LphandlerFunctionEx, lpcontext: ConstPtr): ServiceStatusHandle =
    if (windowsWin32SystemServicesNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemServicesRegisterServiceCtrlHandlerExW(lpservicename.rawAddress.toString(), 0L.toString(), lpcontext.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerServiceCtrlHandlerW(lpservicename: Pcwstr, lphandlerproc: LphandlerFunction): ServiceStatusHandle =
    if (windowsWin32SystemServicesNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemServicesRegisterServiceCtrlHandlerW(lpservicename.rawAddress.toString(), 0L.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setServiceBits(hservicestatus: ServiceStatusHandle, dwservicebits: UInt, bsetbitson: Bool, bupdateimmediately: Bool): Bool =
    if (windowsWin32SystemServicesNapiAvailable) wasmWindowssysWindowsWin32SystemServicesSetServiceBits(hservicestatus.rawAddress.toString(), dwservicebits.toInt(), bsetbitson, bupdateimmediately) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setServiceObjectSecurity(hservice: ScHandle, dwsecurityinformation: ObjectSecurityInformation, lpsecuritydescriptor: PsecurityDescriptor): Bool =
    if (windowsWin32SystemServicesNapiAvailable) wasmWindowssysWindowsWin32SystemServicesSetServiceObjectSecurity(hservice.rawAddress.toString(), dwsecurityinformation.toInt(), lpsecuritydescriptor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setServiceStatus(hservicestatus: ServiceStatusHandle, lpservicestatus: ConstPtr): Bool =
    if (windowsWin32SystemServicesNapiAvailable) wasmWindowssysWindowsWin32SystemServicesSetServiceStatus(hservicestatus.rawAddress.toString(), lpservicestatus.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun startServiceA(hservice: ScHandle, dwnumserviceargs: UInt, lpserviceargvectors: ConstPtr): Bool =
    if (windowsWin32SystemServicesNapiAvailable) wasmWindowssysWindowsWin32SystemServicesStartServiceA(hservice.rawAddress.toString(), dwnumserviceargs.toInt(), lpserviceargvectors.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun startServiceCtrlDispatcherA(lpservicestarttable: ConstPtr): Bool =
    if (windowsWin32SystemServicesNapiAvailable) wasmWindowssysWindowsWin32SystemServicesStartServiceCtrlDispatcherA(lpservicestarttable.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun startServiceCtrlDispatcherW(lpservicestarttable: ConstPtr): Bool =
    if (windowsWin32SystemServicesNapiAvailable) wasmWindowssysWindowsWin32SystemServicesStartServiceCtrlDispatcherW(lpservicestarttable.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun startServiceW(hservice: ScHandle, dwnumserviceargs: UInt, lpserviceargvectors: ConstPtr): Bool =
    if (windowsWin32SystemServicesNapiAvailable) wasmWindowssysWindowsWin32SystemServicesStartServiceW(hservice.rawAddress.toString(), dwnumserviceargs.toInt(), lpserviceargvectors.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun subscribeServiceChangeNotifications(hservice: ScHandle, eeventtype: ScEventType, pcallback: PscNotificationCallback, pcallbackcontext: ConstPtr, psubscription: MutPtr): UInt =
    if (windowsWin32SystemServicesNapiAvailable) wasmWindowssysWindowsWin32SystemServicesSubscribeServiceChangeNotifications(hservice.rawAddress.toString(), eeventtype, 0L.toString(), pcallbackcontext.rawAddress.toString(), psubscription.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlockServiceDatabase(sclock: ConstPtr): Bool =
    if (windowsWin32SystemServicesNapiAvailable) wasmWindowssysWindowsWin32SystemServicesUnlockServiceDatabase(sclock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unsubscribeServiceChangeNotifications(psubscription: PscNotificationRegistration) {
    if (windowsWin32SystemServicesNapiAvailable) {
        wasmWindowssysWindowsWin32SystemServicesUnsubscribeServiceChangeNotifications(psubscription.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun waitServiceState(hservice: ScHandle, dwnotify: UInt, dwtimeout: UInt, hcancelevent: Handle): UInt =
    if (windowsWin32SystemServicesNapiAvailable) wasmWindowssysWindowsWin32SystemServicesWaitServiceState(hservice.rawAddress.toString(), dwnotify.toInt(), dwtimeout.toInt(), hcancelevent.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
