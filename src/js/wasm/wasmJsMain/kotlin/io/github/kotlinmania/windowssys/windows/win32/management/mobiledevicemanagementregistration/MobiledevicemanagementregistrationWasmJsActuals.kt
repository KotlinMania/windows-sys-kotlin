@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.management.mobiledevicemanagementregistration

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32ManagementMobiledevicemanagementregistrationNapiAddon(): Boolean

private val _windowsWin32ManagementMobiledevicemanagementregistrationNapiAvailable: Boolean = _initWindowsWin32ManagementMobiledevicemanagementregistrationNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_management_mobiledevicemanagementregistration_applyLocalManagementSyncML(p0, p1)")
private external fun _wasm_windowssys_windows_win32_management_mobiledevicemanagementregistration_applyLocalManagementSyncML(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_management_mobiledevicemanagementregistration_discoverManagementService(p0, p1)")
private external fun _wasm_windowssys_windows_win32_management_mobiledevicemanagementregistration_discoverManagementService(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_management_mobiledevicemanagementregistration_discoverManagementServiceEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_management_mobiledevicemanagementregistration_discoverManagementServiceEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_management_mobiledevicemanagementregistration_getDeviceManagementConfigInfo(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_management_mobiledevicemanagementregistration_getDeviceManagementConfigInfo(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_management_mobiledevicemanagementregistration_getDeviceRegistrationInfo(p0, p1)")
private external fun _wasm_windowssys_windows_win32_management_mobiledevicemanagementregistration_getDeviceRegistrationInfo(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_management_mobiledevicemanagementregistration_getManagementAppHyperlink(p0, p1)")
private external fun _wasm_windowssys_windows_win32_management_mobiledevicemanagementregistration_getManagementAppHyperlink(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_management_mobiledevicemanagementregistration_isDeviceRegisteredWithManagement(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_management_mobiledevicemanagementregistration_isDeviceRegisteredWithManagement(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_management_mobiledevicemanagementregistration_isManagementRegistrationAllowed(p0)")
private external fun _wasm_windowssys_windows_win32_management_mobiledevicemanagementregistration_isManagementRegistrationAllowed(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_management_mobiledevicemanagementregistration_isMdmUxWithoutAadAllowed(p0)")
private external fun _wasm_windowssys_windows_win32_management_mobiledevicemanagementregistration_isMdmUxWithoutAadAllowed(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_management_mobiledevicemanagementregistration_registerDeviceWithLocalManagement(p0)")
private external fun _wasm_windowssys_windows_win32_management_mobiledevicemanagementregistration_registerDeviceWithLocalManagement(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_management_mobiledevicemanagementregistration_registerDeviceWithManagement(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_management_mobiledevicemanagementregistration_registerDeviceWithManagement(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_management_mobiledevicemanagementregistration_registerDeviceWithManagementUsingAADCredentials(p0)")
private external fun _wasm_windowssys_windows_win32_management_mobiledevicemanagementregistration_registerDeviceWithManagementUsingAADCredentials(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_management_mobiledevicemanagementregistration_registerDeviceWithManagementUsingAADDeviceCredentials()")
private external fun _wasm_windowssys_windows_win32_management_mobiledevicemanagementregistration_registerDeviceWithManagementUsingAADDeviceCredentials(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_management_mobiledevicemanagementregistration_registerDeviceWithManagementUsingAADDeviceCredentials2(p0)")
private external fun _wasm_windowssys_windows_win32_management_mobiledevicemanagementregistration_registerDeviceWithManagementUsingAADDeviceCredentials2(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_management_mobiledevicemanagementregistration_setDeviceManagementConfigInfo(p0, p1)")
private external fun _wasm_windowssys_windows_win32_management_mobiledevicemanagementregistration_setDeviceManagementConfigInfo(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_management_mobiledevicemanagementregistration_setManagedExternally(p0)")
private external fun _wasm_windowssys_windows_win32_management_mobiledevicemanagementregistration_setManagedExternally(p0: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_management_mobiledevicemanagementregistration_unregisterDeviceWithLocalManagement()")
private external fun _wasm_windowssys_windows_win32_management_mobiledevicemanagementregistration_unregisterDeviceWithLocalManagement(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_management_mobiledevicemanagementregistration_unregisterDeviceWithManagement(p0)")
private external fun _wasm_windowssys_windows_win32_management_mobiledevicemanagementregistration_unregisterDeviceWithManagement(p0: String): Int

public actual fun applyLocalManagementSyncML(syncmlrequest: Pcwstr, syncmlresult: COpaquePointer?): Hresult =
    if (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAvailable) _wasm_windowssys_windows_win32_management_mobiledevicemanagementregistration_applyLocalManagementSyncML((syncmlrequest?.value ?: 0L).toString(), (syncmlresult?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun discoverManagementService(pszupn: Pcwstr, ppmgmtinfo: COpaquePointer?): Hresult =
    if (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAvailable) _wasm_windowssys_windows_win32_management_mobiledevicemanagementregistration_discoverManagementService((pszupn?.value ?: 0L).toString(), (ppmgmtinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun discoverManagementServiceEx(pszupn: Pcwstr, pszdiscoveryservicecandidate: Pcwstr, ppmgmtinfo: COpaquePointer?): Hresult =
    if (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAvailable) _wasm_windowssys_windows_win32_management_mobiledevicemanagementregistration_discoverManagementServiceEx((pszupn?.value ?: 0L).toString(), (pszdiscoveryservicecandidate?.value ?: 0L).toString(), (ppmgmtinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDeviceManagementConfigInfo(providerid: Pcwstr, configstringbufferlength: COpaquePointer?, configstring: Pwstr): Hresult =
    if (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAvailable) _wasm_windowssys_windows_win32_management_mobiledevicemanagementregistration_getDeviceManagementConfigInfo((providerid?.value ?: 0L).toString(), (configstringbufferlength?.value ?: 0L).toString(), (configstring?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDeviceRegistrationInfo(deviceinformationclass: RegistrationInformationClass, ppdeviceregistrationinfo: COpaquePointer?): Hresult =
    if (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAvailable) _wasm_windowssys_windows_win32_management_mobiledevicemanagementregistration_getDeviceRegistrationInfo(deviceinformationclass, (ppdeviceregistrationinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getManagementAppHyperlink(cchhyperlink: UInt, pszhyperlink: Pwstr): Hresult =
    if (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAvailable) _wasm_windowssys_windows_win32_management_mobiledevicemanagementregistration_getManagementAppHyperlink(cchhyperlink.toInt(), (pszhyperlink?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isDeviceRegisteredWithManagement(pfisdeviceregisteredwithmanagement: COpaquePointer?, cchupn: UInt, pszupn: Pwstr): Hresult =
    if (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAvailable) _wasm_windowssys_windows_win32_management_mobiledevicemanagementregistration_isDeviceRegisteredWithManagement((pfisdeviceregisteredwithmanagement?.value ?: 0L).toString(), cchupn.toInt(), (pszupn?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isManagementRegistrationAllowed(pfismanagementregistrationallowed: COpaquePointer?): Hresult =
    if (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAvailable) _wasm_windowssys_windows_win32_management_mobiledevicemanagementregistration_isManagementRegistrationAllowed((pfismanagementregistrationallowed?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isMdmUxWithoutAadAllowed(isenrollmentallowed: COpaquePointer?): Hresult =
    if (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAvailable) _wasm_windowssys_windows_win32_management_mobiledevicemanagementregistration_isMdmUxWithoutAadAllowed((isenrollmentallowed?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerDeviceWithLocalManagement(alreadyregistered: COpaquePointer?): Hresult =
    if (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAvailable) _wasm_windowssys_windows_win32_management_mobiledevicemanagementregistration_registerDeviceWithLocalManagement((alreadyregistered?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerDeviceWithManagement(pszupn: Pcwstr, ppszmdmserviceuri: Pcwstr, ppzsaccesstoken: Pcwstr): Hresult =
    if (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAvailable) _wasm_windowssys_windows_win32_management_mobiledevicemanagementregistration_registerDeviceWithManagement((pszupn?.value ?: 0L).toString(), (ppszmdmserviceuri?.value ?: 0L).toString(), (ppzsaccesstoken?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerDeviceWithManagementUsingAADCredentials(usertoken: Handle): Hresult =
    if (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAvailable) _wasm_windowssys_windows_win32_management_mobiledevicemanagementregistration_registerDeviceWithManagementUsingAADCredentials((usertoken?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerDeviceWithManagementUsingAADDeviceCredentials(): Hresult =
    if (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAvailable) _wasm_windowssys_windows_win32_management_mobiledevicemanagementregistration_registerDeviceWithManagementUsingAADDeviceCredentials() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerDeviceWithManagementUsingAADDeviceCredentials2(mdmapplicationid: Pcwstr): Hresult =
    if (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAvailable) _wasm_windowssys_windows_win32_management_mobiledevicemanagementregistration_registerDeviceWithManagementUsingAADDeviceCredentials2((mdmapplicationid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDeviceManagementConfigInfo(providerid: Pcwstr, configstring: Pcwstr): Hresult =
    if (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAvailable) _wasm_windowssys_windows_win32_management_mobiledevicemanagementregistration_setDeviceManagementConfigInfo((providerid?.value ?: 0L).toString(), (configstring?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setManagedExternally(ismanagedexternally: Bool): Hresult =
    if (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAvailable) _wasm_windowssys_windows_win32_management_mobiledevicemanagementregistration_setManagedExternally(ismanagedexternally) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterDeviceWithLocalManagement(): Hresult =
    if (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAvailable) _wasm_windowssys_windows_win32_management_mobiledevicemanagementregistration_unregisterDeviceWithLocalManagement() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterDeviceWithManagement(enrollmentid: Pcwstr): Hresult =
    if (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAvailable) _wasm_windowssys_windows_win32_management_mobiledevicemanagementregistration_unregisterDeviceWithManagement((enrollmentid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
