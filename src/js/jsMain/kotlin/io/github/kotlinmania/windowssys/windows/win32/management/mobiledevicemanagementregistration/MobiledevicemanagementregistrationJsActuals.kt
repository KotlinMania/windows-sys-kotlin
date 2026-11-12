@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.management.mobiledevicemanagementregistration

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private val windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun applyLocalManagementSyncML(syncmlrequest: Pcwstr, syncmlresult: MutPtr): Hresult =
    if (windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon != null) (windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon.windowssysWindowsWin32ManagementMobiledevicemanagementregistrationApplyLocalManagementSyncML(syncmlrequest.rawAddress.toString(), syncmlresult.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun discoverManagementService(pszupn: Pcwstr, ppmgmtinfo: MutPtr): Hresult =
    if (windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon != null) (windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon.windowssysWindowsWin32ManagementMobiledevicemanagementregistrationDiscoverManagementService(pszupn.rawAddress.toString(), ppmgmtinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun discoverManagementServiceEx(pszupn: Pcwstr, pszdiscoveryservicecandidate: Pcwstr, ppmgmtinfo: MutPtr): Hresult =
    if (windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon != null) (windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon.windowssysWindowsWin32ManagementMobiledevicemanagementregistrationDiscoverManagementServiceEx(pszupn.rawAddress.toString(), pszdiscoveryservicecandidate.rawAddress.toString(), ppmgmtinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDeviceManagementConfigInfo(providerid: Pcwstr, configstringbufferlength: MutPtr, configstring: Pwstr): Hresult =
    if (windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon != null) (windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon.windowssysWindowsWin32ManagementMobiledevicemanagementregistrationGetDeviceManagementConfigInfo(providerid.rawAddress.toString(), configstringbufferlength.rawAddress.toString(), configstring.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDeviceRegistrationInfo(deviceinformationclass: RegistrationInformationClass, ppdeviceregistrationinfo: MutPtr): Hresult =
    if (windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon != null) (windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon.windowssysWindowsWin32ManagementMobiledevicemanagementregistrationGetDeviceRegistrationInfo(deviceinformationclass, ppdeviceregistrationinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getManagementAppHyperlink(cchhyperlink: UInt, pszhyperlink: Pwstr): Hresult =
    if (windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon != null) (windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon.windowssysWindowsWin32ManagementMobiledevicemanagementregistrationGetManagementAppHyperlink(cchhyperlink.toInt(), pszhyperlink.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isDeviceRegisteredWithManagement(pfisdeviceregisteredwithmanagement: MutPtr, cchupn: UInt, pszupn: Pwstr): Hresult =
    if (windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon != null) (windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon.windowssysWindowsWin32ManagementMobiledevicemanagementregistrationIsDeviceRegisteredWithManagement(pfisdeviceregisteredwithmanagement.rawAddress.toString(), cchupn.toInt(), pszupn.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isManagementRegistrationAllowed(pfismanagementregistrationallowed: MutPtr): Hresult =
    if (windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon != null) (windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon.windowssysWindowsWin32ManagementMobiledevicemanagementregistrationIsManagementRegistrationAllowed(pfismanagementregistrationallowed.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isMdmUxWithoutAadAllowed(isenrollmentallowed: MutPtr): Hresult =
    if (windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon != null) (windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon.windowssysWindowsWin32ManagementMobiledevicemanagementregistrationIsMdmUxWithoutAadAllowed(isenrollmentallowed.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerDeviceWithLocalManagement(alreadyregistered: MutPtr): Hresult =
    if (windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon != null) (windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon.windowssysWindowsWin32ManagementMobiledevicemanagementregistrationRegisterDeviceWithLocalManagement(alreadyregistered.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerDeviceWithManagement(pszupn: Pcwstr, ppszmdmserviceuri: Pcwstr, ppzsaccesstoken: Pcwstr): Hresult =
    if (windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon != null) (windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon.windowssysWindowsWin32ManagementMobiledevicemanagementregistrationRegisterDeviceWithManagement(pszupn.rawAddress.toString(), ppszmdmserviceuri.rawAddress.toString(), ppzsaccesstoken.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerDeviceWithManagementUsingAADCredentials(usertoken: Handle): Hresult =
    if (windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon != null) (windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon.windowssysWindowsWin32ManagementMobiledevicemanagementregistrationRegisterDeviceWithManagementUsingAADCredentials(usertoken.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerDeviceWithManagementUsingAADDeviceCredentials(): Hresult =
    if (windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon != null) (windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon.windowssysWindowsWin32ManagementMobiledevicemanagementregistrationRegisterDeviceWithManagementUsingAADDeviceCredentials() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerDeviceWithManagementUsingAADDeviceCredentials2(mdmapplicationid: Pcwstr): Hresult =
    if (windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon != null) (windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon.windowssysWindowsWin32ManagementMobiledevicemanagementregistrationRegisterDeviceWithManagementUsingAADDeviceCredentials2(mdmapplicationid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDeviceManagementConfigInfo(providerid: Pcwstr, configstring: Pcwstr): Hresult =
    if (windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon != null) (windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon.windowssysWindowsWin32ManagementMobiledevicemanagementregistrationSetDeviceManagementConfigInfo(providerid.rawAddress.toString(), configstring.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setManagedExternally(ismanagedexternally: Bool): Hresult =
    if (windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon != null) (windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon.windowssysWindowsWin32ManagementMobiledevicemanagementregistrationSetManagedExternally(ismanagedexternally) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterDeviceWithLocalManagement(): Hresult =
    if (windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon != null) (windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon.windowssysWindowsWin32ManagementMobiledevicemanagementregistrationUnregisterDeviceWithLocalManagement() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterDeviceWithManagement(enrollmentid: Pcwstr): Hresult =
    if (windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon != null) (windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon.windowssysWindowsWin32ManagementMobiledevicemanagementregistrationUnregisterDeviceWithManagement(enrollmentid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
