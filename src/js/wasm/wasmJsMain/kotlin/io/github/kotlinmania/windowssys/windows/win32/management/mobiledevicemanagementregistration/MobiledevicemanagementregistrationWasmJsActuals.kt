@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.management.mobiledevicemanagementregistration

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32ManagementMobiledevicemanagementregistrationNapiAddon(): Boolean

private val windowsWin32ManagementMobiledevicemanagementregistrationNapiAvailable: Boolean = initWindowsWin32ManagementMobiledevicemanagementregistrationNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32ManagementMobiledevicemanagementregistrationApplyLocalManagementSyncML(p0, p1)")
private external fun wasmWindowssysWindowsWin32ManagementMobiledevicemanagementregistrationApplyLocalManagementSyncML(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32ManagementMobiledevicemanagementregistrationDiscoverManagementService(p0, p1)")
private external fun wasmWindowssysWindowsWin32ManagementMobiledevicemanagementregistrationDiscoverManagementService(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32ManagementMobiledevicemanagementregistrationDiscoverManagementServiceEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32ManagementMobiledevicemanagementregistrationDiscoverManagementServiceEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32ManagementMobiledevicemanagementregistrationGetDeviceManagementConfigInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32ManagementMobiledevicemanagementregistrationGetDeviceManagementConfigInfo(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32ManagementMobiledevicemanagementregistrationGetDeviceRegistrationInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32ManagementMobiledevicemanagementregistrationGetDeviceRegistrationInfo(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32ManagementMobiledevicemanagementregistrationGetManagementAppHyperlink(p0, p1)")
private external fun wasmWindowssysWindowsWin32ManagementMobiledevicemanagementregistrationGetManagementAppHyperlink(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32ManagementMobiledevicemanagementregistrationIsDeviceRegisteredWithManagement(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32ManagementMobiledevicemanagementregistrationIsDeviceRegisteredWithManagement(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32ManagementMobiledevicemanagementregistrationIsManagementRegistrationAllowed(p0)")
private external fun wasmWindowssysWindowsWin32ManagementMobiledevicemanagementregistrationIsManagementRegistrationAllowed(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32ManagementMobiledevicemanagementregistrationIsMdmUxWithoutAadAllowed(p0)")
private external fun wasmWindowssysWindowsWin32ManagementMobiledevicemanagementregistrationIsMdmUxWithoutAadAllowed(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32ManagementMobiledevicemanagementregistrationRegisterDeviceWithLocalManagement(p0)")
private external fun wasmWindowssysWindowsWin32ManagementMobiledevicemanagementregistrationRegisterDeviceWithLocalManagement(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32ManagementMobiledevicemanagementregistrationRegisterDeviceWithManagement(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32ManagementMobiledevicemanagementregistrationRegisterDeviceWithManagement(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32ManagementMobiledevicemanagementregistrationRegisterDeviceWithManagementUsingAADCredentials(p0)")
private external fun wasmWindowssysWindowsWin32ManagementMobiledevicemanagementregistrationRegisterDeviceWithManagementUsingAADCredentials(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32ManagementMobiledevicemanagementregistrationRegisterDeviceWithManagementUsingAADDeviceCredentials()")
private external fun wasmWindowssysWindowsWin32ManagementMobiledevicemanagementregistrationRegisterDeviceWithManagementUsingAADDeviceCredentials(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32ManagementMobiledevicemanagementregistrationRegisterDeviceWithManagementUsingAADDeviceCredentials2(p0)")
private external fun wasmWindowssysWindowsWin32ManagementMobiledevicemanagementregistrationRegisterDeviceWithManagementUsingAADDeviceCredentials2(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32ManagementMobiledevicemanagementregistrationSetDeviceManagementConfigInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32ManagementMobiledevicemanagementregistrationSetDeviceManagementConfigInfo(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32ManagementMobiledevicemanagementregistrationSetManagedExternally(p0)")
private external fun wasmWindowssysWindowsWin32ManagementMobiledevicemanagementregistrationSetManagedExternally(p0: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32ManagementMobiledevicemanagementregistrationUnregisterDeviceWithLocalManagement()")
private external fun wasmWindowssysWindowsWin32ManagementMobiledevicemanagementregistrationUnregisterDeviceWithLocalManagement(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32ManagementMobiledevicemanagementregistrationUnregisterDeviceWithManagement(p0)")
private external fun wasmWindowssysWindowsWin32ManagementMobiledevicemanagementregistrationUnregisterDeviceWithManagement(p0: String): Int

public actual fun applyLocalManagementSyncML(syncmlrequest: Pcwstr, syncmlresult: MutPtr): Hresult =
    if (windowsWin32ManagementMobiledevicemanagementregistrationNapiAvailable) wasmWindowssysWindowsWin32ManagementMobiledevicemanagementregistrationApplyLocalManagementSyncML(syncmlrequest.rawAddress.toString(), syncmlresult.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun discoverManagementService(pszupn: Pcwstr, ppmgmtinfo: MutPtr): Hresult =
    if (windowsWin32ManagementMobiledevicemanagementregistrationNapiAvailable) wasmWindowssysWindowsWin32ManagementMobiledevicemanagementregistrationDiscoverManagementService(pszupn.rawAddress.toString(), ppmgmtinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun discoverManagementServiceEx(pszupn: Pcwstr, pszdiscoveryservicecandidate: Pcwstr, ppmgmtinfo: MutPtr): Hresult =
    if (windowsWin32ManagementMobiledevicemanagementregistrationNapiAvailable) wasmWindowssysWindowsWin32ManagementMobiledevicemanagementregistrationDiscoverManagementServiceEx(pszupn.rawAddress.toString(), pszdiscoveryservicecandidate.rawAddress.toString(), ppmgmtinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDeviceManagementConfigInfo(providerid: Pcwstr, configstringbufferlength: MutPtr, configstring: Pwstr): Hresult =
    if (windowsWin32ManagementMobiledevicemanagementregistrationNapiAvailable) wasmWindowssysWindowsWin32ManagementMobiledevicemanagementregistrationGetDeviceManagementConfigInfo(providerid.rawAddress.toString(), configstringbufferlength.rawAddress.toString(), configstring.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDeviceRegistrationInfo(deviceinformationclass: RegistrationInformationClass, ppdeviceregistrationinfo: MutPtr): Hresult =
    if (windowsWin32ManagementMobiledevicemanagementregistrationNapiAvailable) wasmWindowssysWindowsWin32ManagementMobiledevicemanagementregistrationGetDeviceRegistrationInfo(deviceinformationclass, ppdeviceregistrationinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getManagementAppHyperlink(cchhyperlink: UInt, pszhyperlink: Pwstr): Hresult =
    if (windowsWin32ManagementMobiledevicemanagementregistrationNapiAvailable) wasmWindowssysWindowsWin32ManagementMobiledevicemanagementregistrationGetManagementAppHyperlink(cchhyperlink.toInt(), pszhyperlink.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isDeviceRegisteredWithManagement(pfisdeviceregisteredwithmanagement: MutPtr, cchupn: UInt, pszupn: Pwstr): Hresult =
    if (windowsWin32ManagementMobiledevicemanagementregistrationNapiAvailable) wasmWindowssysWindowsWin32ManagementMobiledevicemanagementregistrationIsDeviceRegisteredWithManagement(pfisdeviceregisteredwithmanagement.rawAddress.toString(), cchupn.toInt(), pszupn.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isManagementRegistrationAllowed(pfismanagementregistrationallowed: MutPtr): Hresult =
    if (windowsWin32ManagementMobiledevicemanagementregistrationNapiAvailable) wasmWindowssysWindowsWin32ManagementMobiledevicemanagementregistrationIsManagementRegistrationAllowed(pfismanagementregistrationallowed.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isMdmUxWithoutAadAllowed(isenrollmentallowed: MutPtr): Hresult =
    if (windowsWin32ManagementMobiledevicemanagementregistrationNapiAvailable) wasmWindowssysWindowsWin32ManagementMobiledevicemanagementregistrationIsMdmUxWithoutAadAllowed(isenrollmentallowed.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerDeviceWithLocalManagement(alreadyregistered: MutPtr): Hresult =
    if (windowsWin32ManagementMobiledevicemanagementregistrationNapiAvailable) wasmWindowssysWindowsWin32ManagementMobiledevicemanagementregistrationRegisterDeviceWithLocalManagement(alreadyregistered.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerDeviceWithManagement(pszupn: Pcwstr, ppszmdmserviceuri: Pcwstr, ppzsaccesstoken: Pcwstr): Hresult =
    if (windowsWin32ManagementMobiledevicemanagementregistrationNapiAvailable) wasmWindowssysWindowsWin32ManagementMobiledevicemanagementregistrationRegisterDeviceWithManagement(pszupn.rawAddress.toString(), ppszmdmserviceuri.rawAddress.toString(), ppzsaccesstoken.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerDeviceWithManagementUsingAADCredentials(usertoken: Handle): Hresult =
    if (windowsWin32ManagementMobiledevicemanagementregistrationNapiAvailable) wasmWindowssysWindowsWin32ManagementMobiledevicemanagementregistrationRegisterDeviceWithManagementUsingAADCredentials(usertoken.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerDeviceWithManagementUsingAADDeviceCredentials(): Hresult =
    if (windowsWin32ManagementMobiledevicemanagementregistrationNapiAvailable) wasmWindowssysWindowsWin32ManagementMobiledevicemanagementregistrationRegisterDeviceWithManagementUsingAADDeviceCredentials() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerDeviceWithManagementUsingAADDeviceCredentials2(mdmapplicationid: Pcwstr): Hresult =
    if (windowsWin32ManagementMobiledevicemanagementregistrationNapiAvailable) wasmWindowssysWindowsWin32ManagementMobiledevicemanagementregistrationRegisterDeviceWithManagementUsingAADDeviceCredentials2(mdmapplicationid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDeviceManagementConfigInfo(providerid: Pcwstr, configstring: Pcwstr): Hresult =
    if (windowsWin32ManagementMobiledevicemanagementregistrationNapiAvailable) wasmWindowssysWindowsWin32ManagementMobiledevicemanagementregistrationSetDeviceManagementConfigInfo(providerid.rawAddress.toString(), configstring.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setManagedExternally(ismanagedexternally: Bool): Hresult =
    if (windowsWin32ManagementMobiledevicemanagementregistrationNapiAvailable) wasmWindowssysWindowsWin32ManagementMobiledevicemanagementregistrationSetManagedExternally(ismanagedexternally) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterDeviceWithLocalManagement(): Hresult =
    if (windowsWin32ManagementMobiledevicemanagementregistrationNapiAvailable) wasmWindowssysWindowsWin32ManagementMobiledevicemanagementregistrationUnregisterDeviceWithLocalManagement() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterDeviceWithManagement(enrollmentid: Pcwstr): Hresult =
    if (windowsWin32ManagementMobiledevicemanagementregistrationNapiAvailable) wasmWindowssysWindowsWin32ManagementMobiledevicemanagementregistrationUnregisterDeviceWithManagement(enrollmentid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
