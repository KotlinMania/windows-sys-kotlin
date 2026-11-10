@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

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

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32SystemServicesNapiAddon(): Boolean

private val _windowsWin32SystemServicesNapiAvailable: Boolean = _initWindowsWin32SystemServicesNapiAddon()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_services_changeServiceConfig2A(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_services_changeServiceConfig2A(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_services_changeServiceConfig2W(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_services_changeServiceConfig2W(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_services_changeServiceConfigA(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun _wasm_windowssys_windows_win32_system_services_changeServiceConfigA(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: String, p8: String, p9: String, p10: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_services_changeServiceConfigW(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun _wasm_windowssys_windows_win32_system_services_changeServiceConfigW(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: String, p8: String, p9: String, p10: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_services_closeServiceHandle(p0)")
private external fun _wasm_windowssys_windows_win32_system_services_closeServiceHandle(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_services_controlService(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_services_controlService(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_services_controlServiceExA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_services_controlServiceExA(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_services_controlServiceExW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_services_controlServiceExW(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_services_createServiceA(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12)")
private external fun _wasm_windowssys_windows_win32_system_services_createServiceA(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: Int, p6: Int, p7: String, p8: String, p9: String, p10: String, p11: String, p12: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_services_createServiceW(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12)")
private external fun _wasm_windowssys_windows_win32_system_services_createServiceW(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: Int, p6: Int, p7: String, p8: String, p9: String, p10: String, p11: String, p12: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_services_deleteService(p0)")
private external fun _wasm_windowssys_windows_win32_system_services_deleteService(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_services_enumDependentServicesA(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_services_enumDependentServicesA(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_services_enumDependentServicesW(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_services_enumDependentServicesW(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_services_enumServicesStatusA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_system_services_enumServicesStatusA(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_services_enumServicesStatusExA(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun _wasm_windowssys_windows_win32_system_services_enumServicesStatusExA(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: Int, p6: String, p7: String, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_services_enumServicesStatusExW(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun _wasm_windowssys_windows_win32_system_services_enumServicesStatusExW(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: Int, p6: String, p7: String, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_services_enumServicesStatusW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_system_services_enumServicesStatusW(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_services_getServiceDirectory(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_services_getServiceDirectory(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_services_getServiceDisplayNameA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_services_getServiceDisplayNameA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_services_getServiceDisplayNameW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_services_getServiceDisplayNameW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_services_getServiceKeyNameA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_services_getServiceKeyNameA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_services_getServiceKeyNameW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_services_getServiceKeyNameW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_services_getServiceRegistryStateKey(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_services_getServiceRegistryStateKey(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_services_getSharedServiceDirectory(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_services_getSharedServiceDirectory(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_services_getSharedServiceRegistryStateKey(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_services_getSharedServiceRegistryStateKey(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_services_lockServiceDatabase(p0)")
private external fun _wasm_windowssys_windows_win32_system_services_lockServiceDatabase(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_services_notifyBootConfigStatus(p0)")
private external fun _wasm_windowssys_windows_win32_system_services_notifyBootConfigStatus(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_services_notifyServiceStatusChangeA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_services_notifyServiceStatusChangeA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_services_notifyServiceStatusChangeW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_services_notifyServiceStatusChangeW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_services_openSCManagerA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_services_openSCManagerA(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_services_openSCManagerW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_services_openSCManagerW(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_services_openServiceA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_services_openServiceA(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_services_openServiceW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_services_openServiceW(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_services_queryServiceConfig2A(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_services_queryServiceConfig2A(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_services_queryServiceConfig2W(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_services_queryServiceConfig2W(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_services_queryServiceConfigA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_services_queryServiceConfigA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_services_queryServiceConfigW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_services_queryServiceConfigW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_services_queryServiceDynamicInformation(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_services_queryServiceDynamicInformation(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_services_queryServiceLockStatusA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_services_queryServiceLockStatusA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_services_queryServiceLockStatusW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_services_queryServiceLockStatusW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_services_queryServiceObjectSecurity(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_services_queryServiceObjectSecurity(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_services_queryServiceStatus(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_services_queryServiceStatus(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_services_queryServiceStatusEx(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_services_queryServiceStatusEx(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_services_registerServiceCtrlHandlerA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_services_registerServiceCtrlHandlerA(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_services_registerServiceCtrlHandlerExA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_services_registerServiceCtrlHandlerExA(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_services_registerServiceCtrlHandlerExW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_services_registerServiceCtrlHandlerExW(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_services_registerServiceCtrlHandlerW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_services_registerServiceCtrlHandlerW(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_services_setServiceBits(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_services_setServiceBits(p0: String, p1: Int, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_services_setServiceObjectSecurity(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_services_setServiceObjectSecurity(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_services_setServiceStatus(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_services_setServiceStatus(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_services_startServiceA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_services_startServiceA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_services_startServiceCtrlDispatcherA(p0)")
private external fun _wasm_windowssys_windows_win32_system_services_startServiceCtrlDispatcherA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_services_startServiceCtrlDispatcherW(p0)")
private external fun _wasm_windowssys_windows_win32_system_services_startServiceCtrlDispatcherW(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_services_startServiceW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_services_startServiceW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_services_subscribeServiceChangeNotifications(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_services_subscribeServiceChangeNotifications(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_services_unlockServiceDatabase(p0)")
private external fun _wasm_windowssys_windows_win32_system_services_unlockServiceDatabase(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_services_unsubscribeServiceChangeNotifications(p0)")
private external fun _wasm_windowssys_windows_win32_system_services_unsubscribeServiceChangeNotifications(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_services_waitServiceState(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_services_waitServiceState(p0: String, p1: Int, p2: Int, p3: String): Int

public actual fun changeServiceConfig2A(hservice: ScHandle, dwinfolevel: ServiceConfig, lpinfo: COpaquePointer?): Bool =
    if (_windowsWin32SystemServicesNapiAvailable) _wasm_windowssys_windows_win32_system_services_changeServiceConfig2A((hservice?.value ?: 0L).toString(), dwinfolevel.toInt(), (lpinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun changeServiceConfig2W(hservice: ScHandle, dwinfolevel: ServiceConfig, lpinfo: COpaquePointer?): Bool =
    if (_windowsWin32SystemServicesNapiAvailable) _wasm_windowssys_windows_win32_system_services_changeServiceConfig2W((hservice?.value ?: 0L).toString(), dwinfolevel.toInt(), (lpinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun changeServiceConfigA(hservice: ScHandle, dwservicetype: EnumServiceType, dwstarttype: ServiceStartType, dwerrorcontrol: ServiceError, lpbinarypathname: Pcstr, lploadordergroup: Pcstr, lpdwtagid: COpaquePointer?, lpdependencies: Pcstr, lpservicestartname: Pcstr, lppassword: Pcstr, lpdisplayname: Pcstr): Bool =
    if (_windowsWin32SystemServicesNapiAvailable) _wasm_windowssys_windows_win32_system_services_changeServiceConfigA((hservice?.value ?: 0L).toString(), dwservicetype.toInt(), dwstarttype.toInt(), dwerrorcontrol.toInt(), (lpbinarypathname?.value ?: 0L).toString(), (lploadordergroup?.value ?: 0L).toString(), (lpdwtagid?.value ?: 0L).toString(), (lpdependencies?.value ?: 0L).toString(), (lpservicestartname?.value ?: 0L).toString(), (lppassword?.value ?: 0L).toString(), (lpdisplayname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun changeServiceConfigW(hservice: ScHandle, dwservicetype: EnumServiceType, dwstarttype: ServiceStartType, dwerrorcontrol: ServiceError, lpbinarypathname: Pcwstr, lploadordergroup: Pcwstr, lpdwtagid: COpaquePointer?, lpdependencies: Pcwstr, lpservicestartname: Pcwstr, lppassword: Pcwstr, lpdisplayname: Pcwstr): Bool =
    if (_windowsWin32SystemServicesNapiAvailable) _wasm_windowssys_windows_win32_system_services_changeServiceConfigW((hservice?.value ?: 0L).toString(), dwservicetype.toInt(), dwstarttype.toInt(), dwerrorcontrol.toInt(), (lpbinarypathname?.value ?: 0L).toString(), (lploadordergroup?.value ?: 0L).toString(), (lpdwtagid?.value ?: 0L).toString(), (lpdependencies?.value ?: 0L).toString(), (lpservicestartname?.value ?: 0L).toString(), (lppassword?.value ?: 0L).toString(), (lpdisplayname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeServiceHandle(hscobject: ScHandle): Bool =
    if (_windowsWin32SystemServicesNapiAvailable) _wasm_windowssys_windows_win32_system_services_closeServiceHandle((hscobject?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun controlService(hservice: ScHandle, dwcontrol: UInt, lpservicestatus: COpaquePointer?): Bool =
    if (_windowsWin32SystemServicesNapiAvailable) _wasm_windowssys_windows_win32_system_services_controlService((hservice?.value ?: 0L).toString(), dwcontrol.toInt(), (lpservicestatus?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun controlServiceExA(hservice: ScHandle, dwcontrol: UInt, dwinfolevel: UInt, pcontrolparams: COpaquePointer?): Bool =
    if (_windowsWin32SystemServicesNapiAvailable) _wasm_windowssys_windows_win32_system_services_controlServiceExA((hservice?.value ?: 0L).toString(), dwcontrol.toInt(), dwinfolevel.toInt(), (pcontrolparams?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun controlServiceExW(hservice: ScHandle, dwcontrol: UInt, dwinfolevel: UInt, pcontrolparams: COpaquePointer?): Bool =
    if (_windowsWin32SystemServicesNapiAvailable) _wasm_windowssys_windows_win32_system_services_controlServiceExW((hservice?.value ?: 0L).toString(), dwcontrol.toInt(), dwinfolevel.toInt(), (pcontrolparams?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createServiceA(hscmanager: ScHandle, lpservicename: Pcstr, lpdisplayname: Pcstr, dwdesiredaccess: UInt, dwservicetype: EnumServiceType, dwstarttype: ServiceStartType, dwerrorcontrol: ServiceError, lpbinarypathname: Pcstr, lploadordergroup: Pcstr, lpdwtagid: COpaquePointer?, lpdependencies: Pcstr, lpservicestartname: Pcstr, lppassword: Pcstr): ScHandle =
    if (_windowsWin32SystemServicesNapiAvailable) _wasm_windowssys_windows_win32_system_services_createServiceA((hscmanager?.value ?: 0L).toString(), (lpservicename?.value ?: 0L).toString(), (lpdisplayname?.value ?: 0L).toString(), dwdesiredaccess.toInt(), dwservicetype.toInt(), dwstarttype.toInt(), dwerrorcontrol.toInt(), (lpbinarypathname?.value ?: 0L).toString(), (lploadordergroup?.value ?: 0L).toString(), (lpdwtagid?.value ?: 0L).toString(), (lpdependencies?.value ?: 0L).toString(), (lpservicestartname?.value ?: 0L).toString(), (lppassword?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createServiceW(hscmanager: ScHandle, lpservicename: Pcwstr, lpdisplayname: Pcwstr, dwdesiredaccess: UInt, dwservicetype: EnumServiceType, dwstarttype: ServiceStartType, dwerrorcontrol: ServiceError, lpbinarypathname: Pcwstr, lploadordergroup: Pcwstr, lpdwtagid: COpaquePointer?, lpdependencies: Pcwstr, lpservicestartname: Pcwstr, lppassword: Pcwstr): ScHandle =
    if (_windowsWin32SystemServicesNapiAvailable) _wasm_windowssys_windows_win32_system_services_createServiceW((hscmanager?.value ?: 0L).toString(), (lpservicename?.value ?: 0L).toString(), (lpdisplayname?.value ?: 0L).toString(), dwdesiredaccess.toInt(), dwservicetype.toInt(), dwstarttype.toInt(), dwerrorcontrol.toInt(), (lpbinarypathname?.value ?: 0L).toString(), (lploadordergroup?.value ?: 0L).toString(), (lpdwtagid?.value ?: 0L).toString(), (lpdependencies?.value ?: 0L).toString(), (lpservicestartname?.value ?: 0L).toString(), (lppassword?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteService(hservice: ScHandle): Bool =
    if (_windowsWin32SystemServicesNapiAvailable) _wasm_windowssys_windows_win32_system_services_deleteService((hservice?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumDependentServicesA(hservice: ScHandle, dwservicestate: EnumServiceState, lpservices: COpaquePointer?, cbbufsize: UInt, pcbbytesneeded: COpaquePointer?, lpservicesreturned: COpaquePointer?): Bool =
    if (_windowsWin32SystemServicesNapiAvailable) _wasm_windowssys_windows_win32_system_services_enumDependentServicesA((hservice?.value ?: 0L).toString(), dwservicestate.toInt(), (lpservices?.value ?: 0L).toString(), cbbufsize.toInt(), (pcbbytesneeded?.value ?: 0L).toString(), (lpservicesreturned?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumDependentServicesW(hservice: ScHandle, dwservicestate: EnumServiceState, lpservices: COpaquePointer?, cbbufsize: UInt, pcbbytesneeded: COpaquePointer?, lpservicesreturned: COpaquePointer?): Bool =
    if (_windowsWin32SystemServicesNapiAvailable) _wasm_windowssys_windows_win32_system_services_enumDependentServicesW((hservice?.value ?: 0L).toString(), dwservicestate.toInt(), (lpservices?.value ?: 0L).toString(), cbbufsize.toInt(), (pcbbytesneeded?.value ?: 0L).toString(), (lpservicesreturned?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumServicesStatusA(hscmanager: ScHandle, dwservicetype: EnumServiceType, dwservicestate: EnumServiceState, lpservices: COpaquePointer?, cbbufsize: UInt, pcbbytesneeded: COpaquePointer?, lpservicesreturned: COpaquePointer?, lpresumehandle: COpaquePointer?): Bool =
    if (_windowsWin32SystemServicesNapiAvailable) _wasm_windowssys_windows_win32_system_services_enumServicesStatusA((hscmanager?.value ?: 0L).toString(), dwservicetype.toInt(), dwservicestate.toInt(), (lpservices?.value ?: 0L).toString(), cbbufsize.toInt(), (pcbbytesneeded?.value ?: 0L).toString(), (lpservicesreturned?.value ?: 0L).toString(), (lpresumehandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumServicesStatusExA(hscmanager: ScHandle, infolevel: ScEnumType, dwservicetype: EnumServiceType, dwservicestate: EnumServiceState, lpservices: COpaquePointer?, cbbufsize: UInt, pcbbytesneeded: COpaquePointer?, lpservicesreturned: COpaquePointer?, lpresumehandle: COpaquePointer?, pszgroupname: Pcstr): Bool =
    if (_windowsWin32SystemServicesNapiAvailable) _wasm_windowssys_windows_win32_system_services_enumServicesStatusExA((hscmanager?.value ?: 0L).toString(), infolevel, dwservicetype.toInt(), dwservicestate.toInt(), (lpservices?.value ?: 0L).toString(), cbbufsize.toInt(), (pcbbytesneeded?.value ?: 0L).toString(), (lpservicesreturned?.value ?: 0L).toString(), (lpresumehandle?.value ?: 0L).toString(), (pszgroupname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumServicesStatusExW(hscmanager: ScHandle, infolevel: ScEnumType, dwservicetype: EnumServiceType, dwservicestate: EnumServiceState, lpservices: COpaquePointer?, cbbufsize: UInt, pcbbytesneeded: COpaquePointer?, lpservicesreturned: COpaquePointer?, lpresumehandle: COpaquePointer?, pszgroupname: Pcwstr): Bool =
    if (_windowsWin32SystemServicesNapiAvailable) _wasm_windowssys_windows_win32_system_services_enumServicesStatusExW((hscmanager?.value ?: 0L).toString(), infolevel, dwservicetype.toInt(), dwservicestate.toInt(), (lpservices?.value ?: 0L).toString(), cbbufsize.toInt(), (pcbbytesneeded?.value ?: 0L).toString(), (lpservicesreturned?.value ?: 0L).toString(), (lpresumehandle?.value ?: 0L).toString(), (pszgroupname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumServicesStatusW(hscmanager: ScHandle, dwservicetype: EnumServiceType, dwservicestate: EnumServiceState, lpservices: COpaquePointer?, cbbufsize: UInt, pcbbytesneeded: COpaquePointer?, lpservicesreturned: COpaquePointer?, lpresumehandle: COpaquePointer?): Bool =
    if (_windowsWin32SystemServicesNapiAvailable) _wasm_windowssys_windows_win32_system_services_enumServicesStatusW((hscmanager?.value ?: 0L).toString(), dwservicetype.toInt(), dwservicestate.toInt(), (lpservices?.value ?: 0L).toString(), cbbufsize.toInt(), (pcbbytesneeded?.value ?: 0L).toString(), (lpservicesreturned?.value ?: 0L).toString(), (lpresumehandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getServiceDirectory(hservicestatus: ServiceStatusHandle, edirectorytype: ServiceDirectoryType, lppathbuffer: Pwstr, cchpathbufferlength: UInt, lpcchrequiredbufferlength: COpaquePointer?): UInt =
    if (_windowsWin32SystemServicesNapiAvailable) _wasm_windowssys_windows_win32_system_services_getServiceDirectory((hservicestatus?.value ?: 0L).toString(), edirectorytype, (lppathbuffer?.value ?: 0L).toString(), cchpathbufferlength.toInt(), (lpcchrequiredbufferlength?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getServiceDisplayNameA(hscmanager: ScHandle, lpservicename: Pcstr, lpdisplayname: Pstr, lpcchbuffer: COpaquePointer?): Bool =
    if (_windowsWin32SystemServicesNapiAvailable) _wasm_windowssys_windows_win32_system_services_getServiceDisplayNameA((hscmanager?.value ?: 0L).toString(), (lpservicename?.value ?: 0L).toString(), (lpdisplayname?.value ?: 0L).toString(), (lpcchbuffer?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getServiceDisplayNameW(hscmanager: ScHandle, lpservicename: Pcwstr, lpdisplayname: Pwstr, lpcchbuffer: COpaquePointer?): Bool =
    if (_windowsWin32SystemServicesNapiAvailable) _wasm_windowssys_windows_win32_system_services_getServiceDisplayNameW((hscmanager?.value ?: 0L).toString(), (lpservicename?.value ?: 0L).toString(), (lpdisplayname?.value ?: 0L).toString(), (lpcchbuffer?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getServiceKeyNameA(hscmanager: ScHandle, lpdisplayname: Pcstr, lpservicename: Pstr, lpcchbuffer: COpaquePointer?): Bool =
    if (_windowsWin32SystemServicesNapiAvailable) _wasm_windowssys_windows_win32_system_services_getServiceKeyNameA((hscmanager?.value ?: 0L).toString(), (lpdisplayname?.value ?: 0L).toString(), (lpservicename?.value ?: 0L).toString(), (lpcchbuffer?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getServiceKeyNameW(hscmanager: ScHandle, lpdisplayname: Pcwstr, lpservicename: Pwstr, lpcchbuffer: COpaquePointer?): Bool =
    if (_windowsWin32SystemServicesNapiAvailable) _wasm_windowssys_windows_win32_system_services_getServiceKeyNameW((hscmanager?.value ?: 0L).toString(), (lpdisplayname?.value ?: 0L).toString(), (lpservicename?.value ?: 0L).toString(), (lpcchbuffer?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getServiceRegistryStateKey(servicestatushandle: ServiceStatusHandle, statetype: ServiceRegistryStateType, accessmask: UInt, servicestatekey: COpaquePointer?): UInt =
    if (_windowsWin32SystemServicesNapiAvailable) _wasm_windowssys_windows_win32_system_services_getServiceRegistryStateKey((servicestatushandle?.value ?: 0L).toString(), statetype, accessmask.toInt(), (servicestatekey?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSharedServiceDirectory(servicehandle: ScHandle, directorytype: ServiceSharedDirectoryType, pathbuffer: Pwstr, pathbufferlength: UInt, requiredbufferlength: COpaquePointer?): UInt =
    if (_windowsWin32SystemServicesNapiAvailable) _wasm_windowssys_windows_win32_system_services_getSharedServiceDirectory((servicehandle?.value ?: 0L).toString(), directorytype, (pathbuffer?.value ?: 0L).toString(), pathbufferlength.toInt(), (requiredbufferlength?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSharedServiceRegistryStateKey(servicehandle: ScHandle, statetype: ServiceSharedRegistryStateType, accessmask: UInt, servicestatekey: COpaquePointer?): UInt =
    if (_windowsWin32SystemServicesNapiAvailable) _wasm_windowssys_windows_win32_system_services_getSharedServiceRegistryStateKey((servicehandle?.value ?: 0L).toString(), statetype, accessmask.toInt(), (servicestatekey?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lockServiceDatabase(hscmanager: ScHandle): COpaquePointer? =
    if (_windowsWin32SystemServicesNapiAvailable) _wasm_windowssys_windows_win32_system_services_lockServiceDatabase((hscmanager?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun notifyBootConfigStatus(bootacceptable: Bool): Bool =
    if (_windowsWin32SystemServicesNapiAvailable) _wasm_windowssys_windows_win32_system_services_notifyBootConfigStatus(bootacceptable) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun notifyServiceStatusChangeA(hservice: ScHandle, dwnotifymask: ServiceNotify, pnotifybuffer: COpaquePointer?): UInt =
    if (_windowsWin32SystemServicesNapiAvailable) _wasm_windowssys_windows_win32_system_services_notifyServiceStatusChangeA((hservice?.value ?: 0L).toString(), dwnotifymask.toInt(), (pnotifybuffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun notifyServiceStatusChangeW(hservice: ScHandle, dwnotifymask: ServiceNotify, pnotifybuffer: COpaquePointer?): UInt =
    if (_windowsWin32SystemServicesNapiAvailable) _wasm_windowssys_windows_win32_system_services_notifyServiceStatusChangeW((hservice?.value ?: 0L).toString(), dwnotifymask.toInt(), (pnotifybuffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openSCManagerA(lpmachinename: Pcstr, lpdatabasename: Pcstr, dwdesiredaccess: UInt): ScHandle =
    if (_windowsWin32SystemServicesNapiAvailable) _wasm_windowssys_windows_win32_system_services_openSCManagerA((lpmachinename?.value ?: 0L).toString(), (lpdatabasename?.value ?: 0L).toString(), dwdesiredaccess.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openSCManagerW(lpmachinename: Pcwstr, lpdatabasename: Pcwstr, dwdesiredaccess: UInt): ScHandle =
    if (_windowsWin32SystemServicesNapiAvailable) _wasm_windowssys_windows_win32_system_services_openSCManagerW((lpmachinename?.value ?: 0L).toString(), (lpdatabasename?.value ?: 0L).toString(), dwdesiredaccess.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openServiceA(hscmanager: ScHandle, lpservicename: Pcstr, dwdesiredaccess: UInt): ScHandle =
    if (_windowsWin32SystemServicesNapiAvailable) _wasm_windowssys_windows_win32_system_services_openServiceA((hscmanager?.value ?: 0L).toString(), (lpservicename?.value ?: 0L).toString(), dwdesiredaccess.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openServiceW(hscmanager: ScHandle, lpservicename: Pcwstr, dwdesiredaccess: UInt): ScHandle =
    if (_windowsWin32SystemServicesNapiAvailable) _wasm_windowssys_windows_win32_system_services_openServiceW((hscmanager?.value ?: 0L).toString(), (lpservicename?.value ?: 0L).toString(), dwdesiredaccess.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryServiceConfig2A(hservice: ScHandle, dwinfolevel: ServiceConfig, lpbuffer: COpaquePointer?, cbbufsize: UInt, pcbbytesneeded: COpaquePointer?): Bool =
    if (_windowsWin32SystemServicesNapiAvailable) _wasm_windowssys_windows_win32_system_services_queryServiceConfig2A((hservice?.value ?: 0L).toString(), dwinfolevel.toInt(), (lpbuffer?.value ?: 0L).toString(), cbbufsize.toInt(), (pcbbytesneeded?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryServiceConfig2W(hservice: ScHandle, dwinfolevel: ServiceConfig, lpbuffer: COpaquePointer?, cbbufsize: UInt, pcbbytesneeded: COpaquePointer?): Bool =
    if (_windowsWin32SystemServicesNapiAvailable) _wasm_windowssys_windows_win32_system_services_queryServiceConfig2W((hservice?.value ?: 0L).toString(), dwinfolevel.toInt(), (lpbuffer?.value ?: 0L).toString(), cbbufsize.toInt(), (pcbbytesneeded?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryServiceConfigA(hservice: ScHandle, lpserviceconfig: COpaquePointer?, cbbufsize: UInt, pcbbytesneeded: COpaquePointer?): Bool =
    if (_windowsWin32SystemServicesNapiAvailable) _wasm_windowssys_windows_win32_system_services_queryServiceConfigA((hservice?.value ?: 0L).toString(), (lpserviceconfig?.value ?: 0L).toString(), cbbufsize.toInt(), (pcbbytesneeded?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryServiceConfigW(hservice: ScHandle, lpserviceconfig: COpaquePointer?, cbbufsize: UInt, pcbbytesneeded: COpaquePointer?): Bool =
    if (_windowsWin32SystemServicesNapiAvailable) _wasm_windowssys_windows_win32_system_services_queryServiceConfigW((hservice?.value ?: 0L).toString(), (lpserviceconfig?.value ?: 0L).toString(), cbbufsize.toInt(), (pcbbytesneeded?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryServiceDynamicInformation(hservicestatus: ServiceStatusHandle, dwinfolevel: UInt, ppdynamicinfo: COpaquePointer?): Bool =
    if (_windowsWin32SystemServicesNapiAvailable) _wasm_windowssys_windows_win32_system_services_queryServiceDynamicInformation((hservicestatus?.value ?: 0L).toString(), dwinfolevel.toInt(), (ppdynamicinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryServiceLockStatusA(hscmanager: ScHandle, lplockstatus: COpaquePointer?, cbbufsize: UInt, pcbbytesneeded: COpaquePointer?): Bool =
    if (_windowsWin32SystemServicesNapiAvailable) _wasm_windowssys_windows_win32_system_services_queryServiceLockStatusA((hscmanager?.value ?: 0L).toString(), (lplockstatus?.value ?: 0L).toString(), cbbufsize.toInt(), (pcbbytesneeded?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryServiceLockStatusW(hscmanager: ScHandle, lplockstatus: COpaquePointer?, cbbufsize: UInt, pcbbytesneeded: COpaquePointer?): Bool =
    if (_windowsWin32SystemServicesNapiAvailable) _wasm_windowssys_windows_win32_system_services_queryServiceLockStatusW((hscmanager?.value ?: 0L).toString(), (lplockstatus?.value ?: 0L).toString(), cbbufsize.toInt(), (pcbbytesneeded?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryServiceObjectSecurity(hservice: ScHandle, dwsecurityinformation: UInt, lpsecuritydescriptor: PsecurityDescriptor, cbbufsize: UInt, pcbbytesneeded: COpaquePointer?): Bool =
    if (_windowsWin32SystemServicesNapiAvailable) _wasm_windowssys_windows_win32_system_services_queryServiceObjectSecurity((hservice?.value ?: 0L).toString(), dwsecurityinformation.toInt(), (lpsecuritydescriptor?.value ?: 0L).toString(), cbbufsize.toInt(), (pcbbytesneeded?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryServiceStatus(hservice: ScHandle, lpservicestatus: COpaquePointer?): Bool =
    if (_windowsWin32SystemServicesNapiAvailable) _wasm_windowssys_windows_win32_system_services_queryServiceStatus((hservice?.value ?: 0L).toString(), (lpservicestatus?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryServiceStatusEx(hservice: ScHandle, infolevel: ScStatusType, lpbuffer: COpaquePointer?, cbbufsize: UInt, pcbbytesneeded: COpaquePointer?): Bool =
    if (_windowsWin32SystemServicesNapiAvailable) _wasm_windowssys_windows_win32_system_services_queryServiceStatusEx((hservice?.value ?: 0L).toString(), infolevel, (lpbuffer?.value ?: 0L).toString(), cbbufsize.toInt(), (pcbbytesneeded?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerServiceCtrlHandlerA(lpservicename: Pcstr, lphandlerproc: LphandlerFunction): ServiceStatusHandle =
    if (_windowsWin32SystemServicesNapiAvailable) _wasm_windowssys_windows_win32_system_services_registerServiceCtrlHandlerA((lpservicename?.value ?: 0L).toString(), 0L.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerServiceCtrlHandlerExA(lpservicename: Pcstr, lphandlerproc: LphandlerFunctionEx, lpcontext: COpaquePointer?): ServiceStatusHandle =
    if (_windowsWin32SystemServicesNapiAvailable) _wasm_windowssys_windows_win32_system_services_registerServiceCtrlHandlerExA((lpservicename?.value ?: 0L).toString(), 0L.toString(), (lpcontext?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerServiceCtrlHandlerExW(lpservicename: Pcwstr, lphandlerproc: LphandlerFunctionEx, lpcontext: COpaquePointer?): ServiceStatusHandle =
    if (_windowsWin32SystemServicesNapiAvailable) _wasm_windowssys_windows_win32_system_services_registerServiceCtrlHandlerExW((lpservicename?.value ?: 0L).toString(), 0L.toString(), (lpcontext?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerServiceCtrlHandlerW(lpservicename: Pcwstr, lphandlerproc: LphandlerFunction): ServiceStatusHandle =
    if (_windowsWin32SystemServicesNapiAvailable) _wasm_windowssys_windows_win32_system_services_registerServiceCtrlHandlerW((lpservicename?.value ?: 0L).toString(), 0L.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setServiceBits(hservicestatus: ServiceStatusHandle, dwservicebits: UInt, bsetbitson: Bool, bupdateimmediately: Bool): Bool =
    if (_windowsWin32SystemServicesNapiAvailable) _wasm_windowssys_windows_win32_system_services_setServiceBits((hservicestatus?.value ?: 0L).toString(), dwservicebits.toInt(), bsetbitson, bupdateimmediately) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setServiceObjectSecurity(hservice: ScHandle, dwsecurityinformation: ObjectSecurityInformation, lpsecuritydescriptor: PsecurityDescriptor): Bool =
    if (_windowsWin32SystemServicesNapiAvailable) _wasm_windowssys_windows_win32_system_services_setServiceObjectSecurity((hservice?.value ?: 0L).toString(), dwsecurityinformation.toInt(), (lpsecuritydescriptor?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setServiceStatus(hservicestatus: ServiceStatusHandle, lpservicestatus: COpaquePointer?): Bool =
    if (_windowsWin32SystemServicesNapiAvailable) _wasm_windowssys_windows_win32_system_services_setServiceStatus((hservicestatus?.value ?: 0L).toString(), (lpservicestatus?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun startServiceA(hservice: ScHandle, dwnumserviceargs: UInt, lpserviceargvectors: COpaquePointer?): Bool =
    if (_windowsWin32SystemServicesNapiAvailable) _wasm_windowssys_windows_win32_system_services_startServiceA((hservice?.value ?: 0L).toString(), dwnumserviceargs.toInt(), (lpserviceargvectors?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun startServiceCtrlDispatcherA(lpservicestarttable: COpaquePointer?): Bool =
    if (_windowsWin32SystemServicesNapiAvailable) _wasm_windowssys_windows_win32_system_services_startServiceCtrlDispatcherA((lpservicestarttable?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun startServiceCtrlDispatcherW(lpservicestarttable: COpaquePointer?): Bool =
    if (_windowsWin32SystemServicesNapiAvailable) _wasm_windowssys_windows_win32_system_services_startServiceCtrlDispatcherW((lpservicestarttable?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun startServiceW(hservice: ScHandle, dwnumserviceargs: UInt, lpserviceargvectors: COpaquePointer?): Bool =
    if (_windowsWin32SystemServicesNapiAvailable) _wasm_windowssys_windows_win32_system_services_startServiceW((hservice?.value ?: 0L).toString(), dwnumserviceargs.toInt(), (lpserviceargvectors?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun subscribeServiceChangeNotifications(hservice: ScHandle, eeventtype: ScEventType, pcallback: PscNotificationCallback, pcallbackcontext: COpaquePointer?, psubscription: COpaquePointer?): UInt =
    if (_windowsWin32SystemServicesNapiAvailable) _wasm_windowssys_windows_win32_system_services_subscribeServiceChangeNotifications((hservice?.value ?: 0L).toString(), eeventtype, 0L.toString(), (pcallbackcontext?.value ?: 0L).toString(), (psubscription?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlockServiceDatabase(sclock: COpaquePointer?): Bool =
    if (_windowsWin32SystemServicesNapiAvailable) _wasm_windowssys_windows_win32_system_services_unlockServiceDatabase((sclock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unsubscribeServiceChangeNotifications(psubscription: PscNotificationRegistration) {
    if (_windowsWin32SystemServicesNapiAvailable) {
        _wasm_windowssys_windows_win32_system_services_unsubscribeServiceChangeNotifications(psubscription.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun waitServiceState(hservice: ScHandle, dwnotify: UInt, dwtimeout: UInt, hcancelevent: Handle): UInt =
    if (_windowsWin32SystemServicesNapiAvailable) _wasm_windowssys_windows_win32_system_services_waitServiceState((hservice?.value ?: 0L).toString(), dwnotify.toInt(), dwtimeout.toInt(), (hcancelevent?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
