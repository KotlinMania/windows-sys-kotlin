@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error
import io.github.kotlinmania.windowssys.windows.win32.security.Psid

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32StoragePackagingAppxNapiAddon(): Boolean

private val _windowsWin32StoragePackagingAppxNapiAvailable: Boolean = _initWindowsWin32StoragePackagingAppxNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_packaging_appx_activatePackageVirtualizationContext(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_packaging_appx_activatePackageVirtualizationContext(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_packaging_appx_addPackageDependency(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_packaging_appx_addPackageDependency(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_packaging_appx_appPolicyGetClrCompat(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_packaging_appx_appPolicyGetClrCompat(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_packaging_appx_appPolicyGetCreateFileAccess(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_packaging_appx_appPolicyGetCreateFileAccess(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_packaging_appx_appPolicyGetLifecycleManagement(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_packaging_appx_appPolicyGetLifecycleManagement(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_packaging_appx_appPolicyGetMediaFoundationCodecLoading(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_packaging_appx_appPolicyGetMediaFoundationCodecLoading(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_packaging_appx_appPolicyGetProcessTerminationMethod(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_packaging_appx_appPolicyGetProcessTerminationMethod(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_packaging_appx_appPolicyGetShowDeveloperDiagnostic(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_packaging_appx_appPolicyGetShowDeveloperDiagnostic(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_packaging_appx_appPolicyGetThreadInitializationType(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_packaging_appx_appPolicyGetThreadInitializationType(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_packaging_appx_appPolicyGetWindowingModel(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_packaging_appx_appPolicyGetWindowingModel(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_packaging_appx_checkIsMSIXPackage(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_packaging_appx_checkIsMSIXPackage(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_packaging_appx_closePackageInfo(p0)")
private external fun _wasm_windowssys_windows_win32_storage_packaging_appx_closePackageInfo(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_packaging_appx_createPackageVirtualizationContext(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_packaging_appx_createPackageVirtualizationContext(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_packaging_appx_deactivatePackageVirtualizationContext(p0)")
private external fun _wasm_windowssys_windows_win32_storage_packaging_appx_deactivatePackageVirtualizationContext(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_packaging_appx_deletePackageDependency(p0)")
private external fun _wasm_windowssys_windows_win32_storage_packaging_appx_deletePackageDependency(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_packaging_appx_duplicatePackageVirtualizationContext(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_packaging_appx_duplicatePackageVirtualizationContext(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_packaging_appx_findPackagesByPackageFamily(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_storage_packaging_appx_findPackagesByPackageFamily(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_packaging_appx_formatApplicationUserModelId(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_packaging_appx_formatApplicationUserModelId(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_packaging_appx_getApplicationUserModelId(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_packaging_appx_getApplicationUserModelId(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_packaging_appx_getApplicationUserModelIdFromToken(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_packaging_appx_getApplicationUserModelIdFromToken(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_packaging_appx_getCurrentApplicationUserModelId(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_packaging_appx_getCurrentApplicationUserModelId(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_packaging_appx_getCurrentPackageFamilyName(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_packaging_appx_getCurrentPackageFamilyName(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_packaging_appx_getCurrentPackageFullName(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_packaging_appx_getCurrentPackageFullName(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_packaging_appx_getCurrentPackageId(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_packaging_appx_getCurrentPackageId(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_packaging_appx_getCurrentPackageInfo(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_packaging_appx_getCurrentPackageInfo(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_packaging_appx_getCurrentPackageInfo2(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_packaging_appx_getCurrentPackageInfo2(p0: Int, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_packaging_appx_getCurrentPackageInfo3(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_packaging_appx_getCurrentPackageInfo3(p0: Int, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_packaging_appx_getCurrentPackagePath(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_packaging_appx_getCurrentPackagePath(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_packaging_appx_getCurrentPackagePath2(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_packaging_appx_getCurrentPackagePath2(p0: Int, p1: String, p2: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_packaging_appx_getCurrentPackageVirtualizationContext()")
private external fun _wasm_windowssys_windows_win32_storage_packaging_appx_getCurrentPackageVirtualizationContext(): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_packaging_appx_getIdForPackageDependencyContext(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_packaging_appx_getIdForPackageDependencyContext(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_packaging_appx_getPackageApplicationIds(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_packaging_appx_getPackageApplicationIds(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_packaging_appx_getPackageFamilyName(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_packaging_appx_getPackageFamilyName(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_packaging_appx_getPackageFamilyNameFromToken(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_packaging_appx_getPackageFamilyNameFromToken(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_packaging_appx_getPackageFullName(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_packaging_appx_getPackageFullName(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_packaging_appx_getPackageFullNameFromToken(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_packaging_appx_getPackageFullNameFromToken(p0: String, p1: String, p2: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_packaging_appx_getPackageGraphRevisionId()")
private external fun _wasm_windowssys_windows_win32_storage_packaging_appx_getPackageGraphRevisionId(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_packaging_appx_getPackageId(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_packaging_appx_getPackageId(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_packaging_appx_getPackageInfo(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_packaging_appx_getPackageInfo(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_packaging_appx_getPackageInfo2(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_storage_packaging_appx_getPackageInfo2(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_packaging_appx_getPackagePath(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_packaging_appx_getPackagePath(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_packaging_appx_getPackagePathByFullName(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_packaging_appx_getPackagePathByFullName(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_packaging_appx_getPackagePathByFullName2(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_packaging_appx_getPackagePathByFullName2(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_packaging_appx_getPackagesByPackageFamily(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_packaging_appx_getPackagesByPackageFamily(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_packaging_appx_getProcessesInVirtualizationContext(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_packaging_appx_getProcessesInVirtualizationContext(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_packaging_appx_getResolvedPackageFullNameForPackageDependency(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_packaging_appx_getResolvedPackageFullNameForPackageDependency(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_packaging_appx_getStagedPackageOrigin(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_packaging_appx_getStagedPackageOrigin(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_packaging_appx_getStagedPackagePathByFullName(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_packaging_appx_getStagedPackagePathByFullName(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_packaging_appx_getStagedPackagePathByFullName2(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_packaging_appx_getStagedPackagePathByFullName2(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_packaging_appx_openPackageInfoByFullName(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_packaging_appx_openPackageInfoByFullName(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_packaging_appx_openPackageInfoByFullNameForUser(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_packaging_appx_openPackageInfoByFullNameForUser(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_packaging_appx_packageFamilyNameFromFullName(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_packaging_appx_packageFamilyNameFromFullName(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_packaging_appx_packageFamilyNameFromId(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_packaging_appx_packageFamilyNameFromId(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_packaging_appx_packageFullNameFromId(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_packaging_appx_packageFullNameFromId(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_packaging_appx_packageIdFromFullName(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_packaging_appx_packageIdFromFullName(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_packaging_appx_packageNameAndPublisherIdFromFamilyName(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_packaging_appx_packageNameAndPublisherIdFromFamilyName(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_packaging_appx_parseApplicationUserModelId(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_packaging_appx_parseApplicationUserModelId(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_packaging_appx_releasePackageVirtualizationContext(p0)")
private external fun _wasm_windowssys_windows_win32_storage_packaging_appx_releasePackageVirtualizationContext(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_packaging_appx_removePackageDependency(p0)")
private external fun _wasm_windowssys_windows_win32_storage_packaging_appx_removePackageDependency(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_packaging_appx_verifyApplicationUserModelId(p0)")
private external fun _wasm_windowssys_windows_win32_storage_packaging_appx_verifyApplicationUserModelId(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_packaging_appx_verifyPackageFamilyName(p0)")
private external fun _wasm_windowssys_windows_win32_storage_packaging_appx_verifyPackageFamilyName(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_packaging_appx_verifyPackageFullName(p0)")
private external fun _wasm_windowssys_windows_win32_storage_packaging_appx_verifyPackageFullName(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_packaging_appx_verifyPackageId(p0)")
private external fun _wasm_windowssys_windows_win32_storage_packaging_appx_verifyPackageId(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_packaging_appx_verifyPackageRelativeApplicationId(p0)")
private external fun _wasm_windowssys_windows_win32_storage_packaging_appx_verifyPackageRelativeApplicationId(p0: String): Int

public actual fun activatePackageVirtualizationContext(context: PackageVirtualizationContextHandle, cookie: COpaquePointer?): Hresult =
    if (_windowsWin32StoragePackagingAppxNapiAvailable) _wasm_windowssys_windows_win32_storage_packaging_appx_activatePackageVirtualizationContext((context?.value ?: 0L).toString(), (cookie?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addPackageDependency(packagedependencyid: Pcwstr, rank: Int, options: AddPackageDependencyOptions, packagedependencycontext: COpaquePointer?, packagefullname: COpaquePointer?): Hresult =
    if (_windowsWin32StoragePackagingAppxNapiAvailable) _wasm_windowssys_windows_win32_storage_packaging_appx_addPackageDependency((packagedependencyid?.value ?: 0L).toString(), rank, options, (packagedependencycontext?.value ?: 0L).toString(), (packagefullname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appPolicyGetClrCompat(processtoken: Handle, policy: COpaquePointer?): Win32Error =
    if (_windowsWin32StoragePackagingAppxNapiAvailable) _wasm_windowssys_windows_win32_storage_packaging_appx_appPolicyGetClrCompat((processtoken?.value ?: 0L).toString(), (policy?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appPolicyGetCreateFileAccess(processtoken: Handle, policy: COpaquePointer?): Win32Error =
    if (_windowsWin32StoragePackagingAppxNapiAvailable) _wasm_windowssys_windows_win32_storage_packaging_appx_appPolicyGetCreateFileAccess((processtoken?.value ?: 0L).toString(), (policy?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appPolicyGetLifecycleManagement(processtoken: Handle, policy: COpaquePointer?): Win32Error =
    if (_windowsWin32StoragePackagingAppxNapiAvailable) _wasm_windowssys_windows_win32_storage_packaging_appx_appPolicyGetLifecycleManagement((processtoken?.value ?: 0L).toString(), (policy?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appPolicyGetMediaFoundationCodecLoading(processtoken: Handle, policy: COpaquePointer?): Win32Error =
    if (_windowsWin32StoragePackagingAppxNapiAvailable) _wasm_windowssys_windows_win32_storage_packaging_appx_appPolicyGetMediaFoundationCodecLoading((processtoken?.value ?: 0L).toString(), (policy?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appPolicyGetProcessTerminationMethod(processtoken: Handle, policy: COpaquePointer?): Win32Error =
    if (_windowsWin32StoragePackagingAppxNapiAvailable) _wasm_windowssys_windows_win32_storage_packaging_appx_appPolicyGetProcessTerminationMethod((processtoken?.value ?: 0L).toString(), (policy?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appPolicyGetShowDeveloperDiagnostic(processtoken: Handle, policy: COpaquePointer?): Win32Error =
    if (_windowsWin32StoragePackagingAppxNapiAvailable) _wasm_windowssys_windows_win32_storage_packaging_appx_appPolicyGetShowDeveloperDiagnostic((processtoken?.value ?: 0L).toString(), (policy?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appPolicyGetThreadInitializationType(processtoken: Handle, policy: COpaquePointer?): Win32Error =
    if (_windowsWin32StoragePackagingAppxNapiAvailable) _wasm_windowssys_windows_win32_storage_packaging_appx_appPolicyGetThreadInitializationType((processtoken?.value ?: 0L).toString(), (policy?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appPolicyGetWindowingModel(processtoken: Handle, policy: COpaquePointer?): Win32Error =
    if (_windowsWin32StoragePackagingAppxNapiAvailable) _wasm_windowssys_windows_win32_storage_packaging_appx_appPolicyGetWindowingModel((processtoken?.value ?: 0L).toString(), (policy?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun checkIsMSIXPackage(packagefullname: Pcwstr, ismsixpackage: COpaquePointer?): Hresult =
    if (_windowsWin32StoragePackagingAppxNapiAvailable) _wasm_windowssys_windows_win32_storage_packaging_appx_checkIsMSIXPackage((packagefullname?.value ?: 0L).toString(), (ismsixpackage?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closePackageInfo(packageinforeference: COpaquePointer?): Win32Error =
    if (_windowsWin32StoragePackagingAppxNapiAvailable) _wasm_windowssys_windows_win32_storage_packaging_appx_closePackageInfo((packageinforeference?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPackageVirtualizationContext(packagefamilyname: Pcwstr, context: COpaquePointer?): Hresult =
    if (_windowsWin32StoragePackagingAppxNapiAvailable) _wasm_windowssys_windows_win32_storage_packaging_appx_createPackageVirtualizationContext((packagefamilyname?.value ?: 0L).toString(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deactivatePackageVirtualizationContext(cookie: ULong) {
    if (_windowsWin32StoragePackagingAppxNapiAvailable) {
        _wasm_windowssys_windows_win32_storage_packaging_appx_deactivatePackageVirtualizationContext(cookie.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun deletePackageDependency(packagedependencyid: Pcwstr): Hresult =
    if (_windowsWin32StoragePackagingAppxNapiAvailable) _wasm_windowssys_windows_win32_storage_packaging_appx_deletePackageDependency((packagedependencyid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun duplicatePackageVirtualizationContext(sourcecontext: PackageVirtualizationContextHandle, destcontext: COpaquePointer?): Hresult =
    if (_windowsWin32StoragePackagingAppxNapiAvailable) _wasm_windowssys_windows_win32_storage_packaging_appx_duplicatePackageVirtualizationContext((sourcecontext?.value ?: 0L).toString(), (destcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findPackagesByPackageFamily(packagefamilyname: Pcwstr, packagefilters: UInt, count: COpaquePointer?, packagefullnames: COpaquePointer?, bufferlength: COpaquePointer?, buffer: Pwstr, packageproperties: COpaquePointer?): Win32Error =
    if (_windowsWin32StoragePackagingAppxNapiAvailable) _wasm_windowssys_windows_win32_storage_packaging_appx_findPackagesByPackageFamily((packagefamilyname?.value ?: 0L).toString(), packagefilters.toInt(), (count?.value ?: 0L).toString(), (packagefullnames?.value ?: 0L).toString(), (bufferlength?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), (packageproperties?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun formatApplicationUserModelId(packagefamilyname: Pcwstr, packagerelativeapplicationid: Pcwstr, applicationusermodelidlength: COpaquePointer?, applicationusermodelid: Pwstr): Win32Error =
    if (_windowsWin32StoragePackagingAppxNapiAvailable) _wasm_windowssys_windows_win32_storage_packaging_appx_formatApplicationUserModelId((packagefamilyname?.value ?: 0L).toString(), (packagerelativeapplicationid?.value ?: 0L).toString(), (applicationusermodelidlength?.value ?: 0L).toString(), (applicationusermodelid?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getApplicationUserModelId(hprocess: Handle, applicationusermodelidlength: COpaquePointer?, applicationusermodelid: Pwstr): Win32Error =
    if (_windowsWin32StoragePackagingAppxNapiAvailable) _wasm_windowssys_windows_win32_storage_packaging_appx_getApplicationUserModelId((hprocess?.value ?: 0L).toString(), (applicationusermodelidlength?.value ?: 0L).toString(), (applicationusermodelid?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getApplicationUserModelIdFromToken(token: Handle, applicationusermodelidlength: COpaquePointer?, applicationusermodelid: Pwstr): Win32Error =
    if (_windowsWin32StoragePackagingAppxNapiAvailable) _wasm_windowssys_windows_win32_storage_packaging_appx_getApplicationUserModelIdFromToken((token?.value ?: 0L).toString(), (applicationusermodelidlength?.value ?: 0L).toString(), (applicationusermodelid?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentApplicationUserModelId(applicationusermodelidlength: COpaquePointer?, applicationusermodelid: Pwstr): Win32Error =
    if (_windowsWin32StoragePackagingAppxNapiAvailable) _wasm_windowssys_windows_win32_storage_packaging_appx_getCurrentApplicationUserModelId((applicationusermodelidlength?.value ?: 0L).toString(), (applicationusermodelid?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentPackageFamilyName(packagefamilynamelength: COpaquePointer?, packagefamilyname: Pwstr): Win32Error =
    if (_windowsWin32StoragePackagingAppxNapiAvailable) _wasm_windowssys_windows_win32_storage_packaging_appx_getCurrentPackageFamilyName((packagefamilynamelength?.value ?: 0L).toString(), (packagefamilyname?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentPackageFullName(packagefullnamelength: COpaquePointer?, packagefullname: Pwstr): Win32Error =
    if (_windowsWin32StoragePackagingAppxNapiAvailable) _wasm_windowssys_windows_win32_storage_packaging_appx_getCurrentPackageFullName((packagefullnamelength?.value ?: 0L).toString(), (packagefullname?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentPackageId(bufferlength: COpaquePointer?, buffer: COpaquePointer?): Win32Error =
    if (_windowsWin32StoragePackagingAppxNapiAvailable) _wasm_windowssys_windows_win32_storage_packaging_appx_getCurrentPackageId((bufferlength?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentPackageInfo(flags: UInt, bufferlength: COpaquePointer?, buffer: COpaquePointer?, count: COpaquePointer?): Win32Error =
    if (_windowsWin32StoragePackagingAppxNapiAvailable) _wasm_windowssys_windows_win32_storage_packaging_appx_getCurrentPackageInfo(flags.toInt(), (bufferlength?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), (count?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentPackageInfo2(flags: UInt, packagepathtype: PackagePathType, bufferlength: COpaquePointer?, buffer: COpaquePointer?, count: COpaquePointer?): Win32Error =
    if (_windowsWin32StoragePackagingAppxNapiAvailable) _wasm_windowssys_windows_win32_storage_packaging_appx_getCurrentPackageInfo2(flags.toInt(), packagepathtype, (bufferlength?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), (count?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentPackageInfo3(flags: UInt, packageinfotype: PackageInfo3Type, bufferlength: COpaquePointer?, buffer: COpaquePointer?, count: COpaquePointer?): Hresult =
    if (_windowsWin32StoragePackagingAppxNapiAvailable) _wasm_windowssys_windows_win32_storage_packaging_appx_getCurrentPackageInfo3(flags.toInt(), packageinfotype, (bufferlength?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), (count?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentPackagePath(pathlength: COpaquePointer?, path: Pwstr): Win32Error =
    if (_windowsWin32StoragePackagingAppxNapiAvailable) _wasm_windowssys_windows_win32_storage_packaging_appx_getCurrentPackagePath((pathlength?.value ?: 0L).toString(), (path?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentPackagePath2(packagepathtype: PackagePathType, pathlength: COpaquePointer?, path: Pwstr): Win32Error =
    if (_windowsWin32StoragePackagingAppxNapiAvailable) _wasm_windowssys_windows_win32_storage_packaging_appx_getCurrentPackagePath2(packagepathtype, (pathlength?.value ?: 0L).toString(), (path?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentPackageVirtualizationContext(): PackageVirtualizationContextHandle =
    if (_windowsWin32StoragePackagingAppxNapiAvailable) _wasm_windowssys_windows_win32_storage_packaging_appx_getCurrentPackageVirtualizationContext().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIdForPackageDependencyContext(packagedependencycontext: PackagedependencyContext, packagedependencyid: COpaquePointer?): Hresult =
    if (_windowsWin32StoragePackagingAppxNapiAvailable) _wasm_windowssys_windows_win32_storage_packaging_appx_getIdForPackageDependencyContext((packagedependencycontext?.value ?: 0L).toString(), (packagedependencyid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPackageApplicationIds(packageinforeference: COpaquePointer?, bufferlength: COpaquePointer?, buffer: COpaquePointer?, count: COpaquePointer?): Win32Error =
    if (_windowsWin32StoragePackagingAppxNapiAvailable) _wasm_windowssys_windows_win32_storage_packaging_appx_getPackageApplicationIds((packageinforeference?.value ?: 0L).toString(), (bufferlength?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), (count?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPackageFamilyName(hprocess: Handle, packagefamilynamelength: COpaquePointer?, packagefamilyname: Pwstr): Win32Error =
    if (_windowsWin32StoragePackagingAppxNapiAvailable) _wasm_windowssys_windows_win32_storage_packaging_appx_getPackageFamilyName((hprocess?.value ?: 0L).toString(), (packagefamilynamelength?.value ?: 0L).toString(), (packagefamilyname?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPackageFamilyNameFromToken(token: Handle, packagefamilynamelength: COpaquePointer?, packagefamilyname: Pwstr): Win32Error =
    if (_windowsWin32StoragePackagingAppxNapiAvailable) _wasm_windowssys_windows_win32_storage_packaging_appx_getPackageFamilyNameFromToken((token?.value ?: 0L).toString(), (packagefamilynamelength?.value ?: 0L).toString(), (packagefamilyname?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPackageFullName(hprocess: Handle, packagefullnamelength: COpaquePointer?, packagefullname: Pwstr): Win32Error =
    if (_windowsWin32StoragePackagingAppxNapiAvailable) _wasm_windowssys_windows_win32_storage_packaging_appx_getPackageFullName((hprocess?.value ?: 0L).toString(), (packagefullnamelength?.value ?: 0L).toString(), (packagefullname?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPackageFullNameFromToken(token: Handle, packagefullnamelength: COpaquePointer?, packagefullname: Pwstr): Win32Error =
    if (_windowsWin32StoragePackagingAppxNapiAvailable) _wasm_windowssys_windows_win32_storage_packaging_appx_getPackageFullNameFromToken((token?.value ?: 0L).toString(), (packagefullnamelength?.value ?: 0L).toString(), (packagefullname?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPackageGraphRevisionId(): UInt =
    if (_windowsWin32StoragePackagingAppxNapiAvailable) _wasm_windowssys_windows_win32_storage_packaging_appx_getPackageGraphRevisionId().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPackageId(hprocess: Handle, bufferlength: COpaquePointer?, buffer: COpaquePointer?): Win32Error =
    if (_windowsWin32StoragePackagingAppxNapiAvailable) _wasm_windowssys_windows_win32_storage_packaging_appx_getPackageId((hprocess?.value ?: 0L).toString(), (bufferlength?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPackageInfo(packageinforeference: COpaquePointer?, flags: UInt, bufferlength: COpaquePointer?, buffer: COpaquePointer?, count: COpaquePointer?): Win32Error =
    if (_windowsWin32StoragePackagingAppxNapiAvailable) _wasm_windowssys_windows_win32_storage_packaging_appx_getPackageInfo((packageinforeference?.value ?: 0L).toString(), flags.toInt(), (bufferlength?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), (count?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPackageInfo2(packageinforeference: COpaquePointer?, flags: UInt, packagepathtype: PackagePathType, bufferlength: COpaquePointer?, buffer: COpaquePointer?, count: COpaquePointer?): Win32Error =
    if (_windowsWin32StoragePackagingAppxNapiAvailable) _wasm_windowssys_windows_win32_storage_packaging_appx_getPackageInfo2((packageinforeference?.value ?: 0L).toString(), flags.toInt(), packagepathtype, (bufferlength?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), (count?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPackagePath(packageid: COpaquePointer?, reserved: UInt, pathlength: COpaquePointer?, path: Pwstr): Win32Error =
    if (_windowsWin32StoragePackagingAppxNapiAvailable) _wasm_windowssys_windows_win32_storage_packaging_appx_getPackagePath((packageid?.value ?: 0L).toString(), reserved.toInt(), (pathlength?.value ?: 0L).toString(), (path?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPackagePathByFullName(packagefullname: Pcwstr, pathlength: COpaquePointer?, path: Pwstr): Win32Error =
    if (_windowsWin32StoragePackagingAppxNapiAvailable) _wasm_windowssys_windows_win32_storage_packaging_appx_getPackagePathByFullName((packagefullname?.value ?: 0L).toString(), (pathlength?.value ?: 0L).toString(), (path?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPackagePathByFullName2(packagefullname: Pcwstr, packagepathtype: PackagePathType, pathlength: COpaquePointer?, path: Pwstr): Win32Error =
    if (_windowsWin32StoragePackagingAppxNapiAvailable) _wasm_windowssys_windows_win32_storage_packaging_appx_getPackagePathByFullName2((packagefullname?.value ?: 0L).toString(), packagepathtype, (pathlength?.value ?: 0L).toString(), (path?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPackagesByPackageFamily(packagefamilyname: Pcwstr, count: COpaquePointer?, packagefullnames: COpaquePointer?, bufferlength: COpaquePointer?, buffer: Pwstr): Win32Error =
    if (_windowsWin32StoragePackagingAppxNapiAvailable) _wasm_windowssys_windows_win32_storage_packaging_appx_getPackagesByPackageFamily((packagefamilyname?.value ?: 0L).toString(), (count?.value ?: 0L).toString(), (packagefullnames?.value ?: 0L).toString(), (bufferlength?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessesInVirtualizationContext(packagefamilyname: Pcwstr, count: COpaquePointer?, processes: COpaquePointer?): Hresult =
    if (_windowsWin32StoragePackagingAppxNapiAvailable) _wasm_windowssys_windows_win32_storage_packaging_appx_getProcessesInVirtualizationContext((packagefamilyname?.value ?: 0L).toString(), (count?.value ?: 0L).toString(), (processes?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getResolvedPackageFullNameForPackageDependency(packagedependencyid: Pcwstr, packagefullname: COpaquePointer?): Hresult =
    if (_windowsWin32StoragePackagingAppxNapiAvailable) _wasm_windowssys_windows_win32_storage_packaging_appx_getResolvedPackageFullNameForPackageDependency((packagedependencyid?.value ?: 0L).toString(), (packagefullname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getStagedPackageOrigin(packagefullname: Pcwstr, origin: COpaquePointer?): Win32Error =
    if (_windowsWin32StoragePackagingAppxNapiAvailable) _wasm_windowssys_windows_win32_storage_packaging_appx_getStagedPackageOrigin((packagefullname?.value ?: 0L).toString(), (origin?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getStagedPackagePathByFullName(packagefullname: Pcwstr, pathlength: COpaquePointer?, path: Pwstr): Win32Error =
    if (_windowsWin32StoragePackagingAppxNapiAvailable) _wasm_windowssys_windows_win32_storage_packaging_appx_getStagedPackagePathByFullName((packagefullname?.value ?: 0L).toString(), (pathlength?.value ?: 0L).toString(), (path?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getStagedPackagePathByFullName2(packagefullname: Pcwstr, packagepathtype: PackagePathType, pathlength: COpaquePointer?, path: Pwstr): Win32Error =
    if (_windowsWin32StoragePackagingAppxNapiAvailable) _wasm_windowssys_windows_win32_storage_packaging_appx_getStagedPackagePathByFullName2((packagefullname?.value ?: 0L).toString(), packagepathtype, (pathlength?.value ?: 0L).toString(), (path?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openPackageInfoByFullName(packagefullname: Pcwstr, reserved: UInt, packageinforeference: COpaquePointer?): Win32Error =
    if (_windowsWin32StoragePackagingAppxNapiAvailable) _wasm_windowssys_windows_win32_storage_packaging_appx_openPackageInfoByFullName((packagefullname?.value ?: 0L).toString(), reserved.toInt(), (packageinforeference?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openPackageInfoByFullNameForUser(usersid: Psid, packagefullname: Pcwstr, reserved: UInt, packageinforeference: COpaquePointer?): Win32Error =
    if (_windowsWin32StoragePackagingAppxNapiAvailable) _wasm_windowssys_windows_win32_storage_packaging_appx_openPackageInfoByFullNameForUser((usersid?.value ?: 0L).toString(), (packagefullname?.value ?: 0L).toString(), reserved.toInt(), (packageinforeference?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun packageFamilyNameFromFullName(packagefullname: Pcwstr, packagefamilynamelength: COpaquePointer?, packagefamilyname: Pwstr): Win32Error =
    if (_windowsWin32StoragePackagingAppxNapiAvailable) _wasm_windowssys_windows_win32_storage_packaging_appx_packageFamilyNameFromFullName((packagefullname?.value ?: 0L).toString(), (packagefamilynamelength?.value ?: 0L).toString(), (packagefamilyname?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun packageFamilyNameFromId(packageid: COpaquePointer?, packagefamilynamelength: COpaquePointer?, packagefamilyname: Pwstr): Win32Error =
    if (_windowsWin32StoragePackagingAppxNapiAvailable) _wasm_windowssys_windows_win32_storage_packaging_appx_packageFamilyNameFromId((packageid?.value ?: 0L).toString(), (packagefamilynamelength?.value ?: 0L).toString(), (packagefamilyname?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun packageFullNameFromId(packageid: COpaquePointer?, packagefullnamelength: COpaquePointer?, packagefullname: Pwstr): Win32Error =
    if (_windowsWin32StoragePackagingAppxNapiAvailable) _wasm_windowssys_windows_win32_storage_packaging_appx_packageFullNameFromId((packageid?.value ?: 0L).toString(), (packagefullnamelength?.value ?: 0L).toString(), (packagefullname?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun packageIdFromFullName(packagefullname: Pcwstr, flags: UInt, bufferlength: COpaquePointer?, buffer: COpaquePointer?): Win32Error =
    if (_windowsWin32StoragePackagingAppxNapiAvailable) _wasm_windowssys_windows_win32_storage_packaging_appx_packageIdFromFullName((packagefullname?.value ?: 0L).toString(), flags.toInt(), (bufferlength?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun packageNameAndPublisherIdFromFamilyName(packagefamilyname: Pcwstr, packagenamelength: COpaquePointer?, packagename: Pwstr, packagepublisheridlength: COpaquePointer?, packagepublisherid: Pwstr): Win32Error =
    if (_windowsWin32StoragePackagingAppxNapiAvailable) _wasm_windowssys_windows_win32_storage_packaging_appx_packageNameAndPublisherIdFromFamilyName((packagefamilyname?.value ?: 0L).toString(), (packagenamelength?.value ?: 0L).toString(), (packagename?.value ?: 0L).toString(), (packagepublisheridlength?.value ?: 0L).toString(), (packagepublisherid?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun parseApplicationUserModelId(applicationusermodelid: Pcwstr, packagefamilynamelength: COpaquePointer?, packagefamilyname: Pwstr, packagerelativeapplicationidlength: COpaquePointer?, packagerelativeapplicationid: Pwstr): Win32Error =
    if (_windowsWin32StoragePackagingAppxNapiAvailable) _wasm_windowssys_windows_win32_storage_packaging_appx_parseApplicationUserModelId((applicationusermodelid?.value ?: 0L).toString(), (packagefamilynamelength?.value ?: 0L).toString(), (packagefamilyname?.value ?: 0L).toString(), (packagerelativeapplicationidlength?.value ?: 0L).toString(), (packagerelativeapplicationid?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun releasePackageVirtualizationContext(context: PackageVirtualizationContextHandle) {
    if (_windowsWin32StoragePackagingAppxNapiAvailable) {
        _wasm_windowssys_windows_win32_storage_packaging_appx_releasePackageVirtualizationContext((context?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun removePackageDependency(packagedependencycontext: PackagedependencyContext): Hresult =
    if (_windowsWin32StoragePackagingAppxNapiAvailable) _wasm_windowssys_windows_win32_storage_packaging_appx_removePackageDependency((packagedependencycontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tryCreatePackageDependency(user: Psid, packagefamilyname: Pcwstr, minversion: PackageVersion, packagedependencyprocessorarchitectures: PackageDependencyProcessorArchitectures, lifetimekind: PackageDependencyLifetimeKind, lifetimeartifact: Pcwstr, options: CreatePackageDependencyOptions, packagedependencyid: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun verifyApplicationUserModelId(applicationusermodelid: Pcwstr): Win32Error =
    if (_windowsWin32StoragePackagingAppxNapiAvailable) _wasm_windowssys_windows_win32_storage_packaging_appx_verifyApplicationUserModelId((applicationusermodelid?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun verifyPackageFamilyName(packagefamilyname: Pcwstr): Win32Error =
    if (_windowsWin32StoragePackagingAppxNapiAvailable) _wasm_windowssys_windows_win32_storage_packaging_appx_verifyPackageFamilyName((packagefamilyname?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun verifyPackageFullName(packagefullname: Pcwstr): Win32Error =
    if (_windowsWin32StoragePackagingAppxNapiAvailable) _wasm_windowssys_windows_win32_storage_packaging_appx_verifyPackageFullName((packagefullname?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun verifyPackageId(packageid: COpaquePointer?): Win32Error =
    if (_windowsWin32StoragePackagingAppxNapiAvailable) _wasm_windowssys_windows_win32_storage_packaging_appx_verifyPackageId((packageid?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun verifyPackageRelativeApplicationId(packagerelativeapplicationid: Pcwstr): Win32Error =
    if (_windowsWin32StoragePackagingAppxNapiAvailable) _wasm_windowssys_windows_win32_storage_packaging_appx_verifyPackageRelativeApplicationId((packagerelativeapplicationid?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
