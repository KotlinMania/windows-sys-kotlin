@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.management.mobiledevicemanagementregistration

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private val _windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun applyLocalManagementSyncML(syncmlrequest: Pcwstr, syncmlresult: COpaquePointer?): Hresult =
    if (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon != null) (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon.windowssys_windows_win32_management_mobiledevicemanagementregistration_applyLocalManagementSyncML((syncmlrequest?.value ?: 0L).toString(), (syncmlresult?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun discoverManagementService(pszupn: Pcwstr, ppmgmtinfo: COpaquePointer?): Hresult =
    if (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon != null) (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon.windowssys_windows_win32_management_mobiledevicemanagementregistration_discoverManagementService((pszupn?.value ?: 0L).toString(), (ppmgmtinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun discoverManagementServiceEx(pszupn: Pcwstr, pszdiscoveryservicecandidate: Pcwstr, ppmgmtinfo: COpaquePointer?): Hresult =
    if (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon != null) (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon.windowssys_windows_win32_management_mobiledevicemanagementregistration_discoverManagementServiceEx((pszupn?.value ?: 0L).toString(), (pszdiscoveryservicecandidate?.value ?: 0L).toString(), (ppmgmtinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDeviceManagementConfigInfo(providerid: Pcwstr, configstringbufferlength: COpaquePointer?, configstring: Pwstr): Hresult =
    if (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon != null) (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon.windowssys_windows_win32_management_mobiledevicemanagementregistration_getDeviceManagementConfigInfo((providerid?.value ?: 0L).toString(), (configstringbufferlength?.value ?: 0L).toString(), (configstring?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDeviceRegistrationInfo(deviceinformationclass: RegistrationInformationClass, ppdeviceregistrationinfo: COpaquePointer?): Hresult =
    if (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon != null) (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon.windowssys_windows_win32_management_mobiledevicemanagementregistration_getDeviceRegistrationInfo(deviceinformationclass, (ppdeviceregistrationinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getManagementAppHyperlink(cchhyperlink: UInt, pszhyperlink: Pwstr): Hresult =
    if (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon != null) (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon.windowssys_windows_win32_management_mobiledevicemanagementregistration_getManagementAppHyperlink(cchhyperlink.toInt(), (pszhyperlink?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isDeviceRegisteredWithManagement(pfisdeviceregisteredwithmanagement: COpaquePointer?, cchupn: UInt, pszupn: Pwstr): Hresult =
    if (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon != null) (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon.windowssys_windows_win32_management_mobiledevicemanagementregistration_isDeviceRegisteredWithManagement((pfisdeviceregisteredwithmanagement?.value ?: 0L).toString(), cchupn.toInt(), (pszupn?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isManagementRegistrationAllowed(pfismanagementregistrationallowed: COpaquePointer?): Hresult =
    if (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon != null) (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon.windowssys_windows_win32_management_mobiledevicemanagementregistration_isManagementRegistrationAllowed((pfismanagementregistrationallowed?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isMdmUxWithoutAadAllowed(isenrollmentallowed: COpaquePointer?): Hresult =
    if (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon != null) (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon.windowssys_windows_win32_management_mobiledevicemanagementregistration_isMdmUxWithoutAadAllowed((isenrollmentallowed?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerDeviceWithLocalManagement(alreadyregistered: COpaquePointer?): Hresult =
    if (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon != null) (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon.windowssys_windows_win32_management_mobiledevicemanagementregistration_registerDeviceWithLocalManagement((alreadyregistered?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerDeviceWithManagement(pszupn: Pcwstr, ppszmdmserviceuri: Pcwstr, ppzsaccesstoken: Pcwstr): Hresult =
    if (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon != null) (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon.windowssys_windows_win32_management_mobiledevicemanagementregistration_registerDeviceWithManagement((pszupn?.value ?: 0L).toString(), (ppszmdmserviceuri?.value ?: 0L).toString(), (ppzsaccesstoken?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerDeviceWithManagementUsingAADCredentials(usertoken: Handle): Hresult =
    if (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon != null) (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon.windowssys_windows_win32_management_mobiledevicemanagementregistration_registerDeviceWithManagementUsingAADCredentials((usertoken?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerDeviceWithManagementUsingAADDeviceCredentials(): Hresult =
    if (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon != null) (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon.windowssys_windows_win32_management_mobiledevicemanagementregistration_registerDeviceWithManagementUsingAADDeviceCredentials() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerDeviceWithManagementUsingAADDeviceCredentials2(mdmapplicationid: Pcwstr): Hresult =
    if (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon != null) (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon.windowssys_windows_win32_management_mobiledevicemanagementregistration_registerDeviceWithManagementUsingAADDeviceCredentials2((mdmapplicationid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDeviceManagementConfigInfo(providerid: Pcwstr, configstring: Pcwstr): Hresult =
    if (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon != null) (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon.windowssys_windows_win32_management_mobiledevicemanagementregistration_setDeviceManagementConfigInfo((providerid?.value ?: 0L).toString(), (configstring?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setManagedExternally(ismanagedexternally: Bool): Hresult =
    if (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon != null) (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon.windowssys_windows_win32_management_mobiledevicemanagementregistration_setManagedExternally(ismanagedexternally) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterDeviceWithLocalManagement(): Hresult =
    if (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon != null) (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon.windowssys_windows_win32_management_mobiledevicemanagementregistration_unregisterDeviceWithLocalManagement() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterDeviceWithManagement(enrollmentid: Pcwstr): Hresult =
    if (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon != null) (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon.windowssys_windows_win32_management_mobiledevicemanagementregistration_unregisterDeviceWithManagement((enrollmentid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
