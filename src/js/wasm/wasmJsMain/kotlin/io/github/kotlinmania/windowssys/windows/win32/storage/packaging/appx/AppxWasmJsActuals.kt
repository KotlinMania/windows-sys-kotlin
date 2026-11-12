@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error
import io.github.kotlinmania.windowssys.windows.win32.security.Psid

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32StoragePackagingAppxNapiAddon(): Boolean

private val windowsWin32StoragePackagingAppxNapiAvailable: Boolean = initWindowsWin32StoragePackagingAppxNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StoragePackagingAppxActivatePackageVirtualizationContext(p0, p1)")
private external fun wasmWindowssysWindowsWin32StoragePackagingAppxActivatePackageVirtualizationContext(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StoragePackagingAppxAddPackageDependency(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StoragePackagingAppxAddPackageDependency(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StoragePackagingAppxAppPolicyGetClrCompat(p0, p1)")
private external fun wasmWindowssysWindowsWin32StoragePackagingAppxAppPolicyGetClrCompat(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StoragePackagingAppxAppPolicyGetCreateFileAccess(p0, p1)")
private external fun wasmWindowssysWindowsWin32StoragePackagingAppxAppPolicyGetCreateFileAccess(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StoragePackagingAppxAppPolicyGetLifecycleManagement(p0, p1)")
private external fun wasmWindowssysWindowsWin32StoragePackagingAppxAppPolicyGetLifecycleManagement(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StoragePackagingAppxAppPolicyGetMediaFoundationCodecLoading(p0, p1)")
private external fun wasmWindowssysWindowsWin32StoragePackagingAppxAppPolicyGetMediaFoundationCodecLoading(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StoragePackagingAppxAppPolicyGetProcessTerminationMethod(p0, p1)")
private external fun wasmWindowssysWindowsWin32StoragePackagingAppxAppPolicyGetProcessTerminationMethod(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StoragePackagingAppxAppPolicyGetShowDeveloperDiagnostic(p0, p1)")
private external fun wasmWindowssysWindowsWin32StoragePackagingAppxAppPolicyGetShowDeveloperDiagnostic(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StoragePackagingAppxAppPolicyGetThreadInitializationType(p0, p1)")
private external fun wasmWindowssysWindowsWin32StoragePackagingAppxAppPolicyGetThreadInitializationType(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StoragePackagingAppxAppPolicyGetWindowingModel(p0, p1)")
private external fun wasmWindowssysWindowsWin32StoragePackagingAppxAppPolicyGetWindowingModel(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StoragePackagingAppxCheckIsMSIXPackage(p0, p1)")
private external fun wasmWindowssysWindowsWin32StoragePackagingAppxCheckIsMSIXPackage(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StoragePackagingAppxClosePackageInfo(p0)")
private external fun wasmWindowssysWindowsWin32StoragePackagingAppxClosePackageInfo(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StoragePackagingAppxCreatePackageVirtualizationContext(p0, p1)")
private external fun wasmWindowssysWindowsWin32StoragePackagingAppxCreatePackageVirtualizationContext(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StoragePackagingAppxDeactivatePackageVirtualizationContext(p0)")
private external fun wasmWindowssysWindowsWin32StoragePackagingAppxDeactivatePackageVirtualizationContext(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StoragePackagingAppxDeletePackageDependency(p0)")
private external fun wasmWindowssysWindowsWin32StoragePackagingAppxDeletePackageDependency(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StoragePackagingAppxDuplicatePackageVirtualizationContext(p0, p1)")
private external fun wasmWindowssysWindowsWin32StoragePackagingAppxDuplicatePackageVirtualizationContext(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StoragePackagingAppxFindPackagesByPackageFamily(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32StoragePackagingAppxFindPackagesByPackageFamily(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StoragePackagingAppxFormatApplicationUserModelId(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StoragePackagingAppxFormatApplicationUserModelId(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StoragePackagingAppxGetApplicationUserModelId(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StoragePackagingAppxGetApplicationUserModelId(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StoragePackagingAppxGetApplicationUserModelIdFromToken(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StoragePackagingAppxGetApplicationUserModelIdFromToken(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StoragePackagingAppxGetCurrentApplicationUserModelId(p0, p1)")
private external fun wasmWindowssysWindowsWin32StoragePackagingAppxGetCurrentApplicationUserModelId(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StoragePackagingAppxGetCurrentPackageFamilyName(p0, p1)")
private external fun wasmWindowssysWindowsWin32StoragePackagingAppxGetCurrentPackageFamilyName(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StoragePackagingAppxGetCurrentPackageFullName(p0, p1)")
private external fun wasmWindowssysWindowsWin32StoragePackagingAppxGetCurrentPackageFullName(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StoragePackagingAppxGetCurrentPackageId(p0, p1)")
private external fun wasmWindowssysWindowsWin32StoragePackagingAppxGetCurrentPackageId(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StoragePackagingAppxGetCurrentPackageInfo(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StoragePackagingAppxGetCurrentPackageInfo(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StoragePackagingAppxGetCurrentPackageInfo2(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StoragePackagingAppxGetCurrentPackageInfo2(p0: Int, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StoragePackagingAppxGetCurrentPackageInfo3(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StoragePackagingAppxGetCurrentPackageInfo3(p0: Int, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StoragePackagingAppxGetCurrentPackagePath(p0, p1)")
private external fun wasmWindowssysWindowsWin32StoragePackagingAppxGetCurrentPackagePath(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StoragePackagingAppxGetCurrentPackagePath2(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StoragePackagingAppxGetCurrentPackagePath2(p0: Int, p1: String, p2: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32StoragePackagingAppxGetCurrentPackageVirtualizationContext()")
private external fun wasmWindowssysWindowsWin32StoragePackagingAppxGetCurrentPackageVirtualizationContext(): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StoragePackagingAppxGetIdForPackageDependencyContext(p0, p1)")
private external fun wasmWindowssysWindowsWin32StoragePackagingAppxGetIdForPackageDependencyContext(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StoragePackagingAppxGetPackageApplicationIds(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StoragePackagingAppxGetPackageApplicationIds(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StoragePackagingAppxGetPackageFamilyName(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StoragePackagingAppxGetPackageFamilyName(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StoragePackagingAppxGetPackageFamilyNameFromToken(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StoragePackagingAppxGetPackageFamilyNameFromToken(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StoragePackagingAppxGetPackageFullName(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StoragePackagingAppxGetPackageFullName(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StoragePackagingAppxGetPackageFullNameFromToken(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StoragePackagingAppxGetPackageFullNameFromToken(p0: String, p1: String, p2: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32StoragePackagingAppxGetPackageGraphRevisionId()")
private external fun wasmWindowssysWindowsWin32StoragePackagingAppxGetPackageGraphRevisionId(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StoragePackagingAppxGetPackageId(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StoragePackagingAppxGetPackageId(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StoragePackagingAppxGetPackageInfo(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StoragePackagingAppxGetPackageInfo(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StoragePackagingAppxGetPackageInfo2(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32StoragePackagingAppxGetPackageInfo2(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StoragePackagingAppxGetPackagePath(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StoragePackagingAppxGetPackagePath(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StoragePackagingAppxGetPackagePathByFullName(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StoragePackagingAppxGetPackagePathByFullName(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StoragePackagingAppxGetPackagePathByFullName2(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StoragePackagingAppxGetPackagePathByFullName2(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StoragePackagingAppxGetPackagesByPackageFamily(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StoragePackagingAppxGetPackagesByPackageFamily(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StoragePackagingAppxGetProcessesInVirtualizationContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StoragePackagingAppxGetProcessesInVirtualizationContext(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StoragePackagingAppxGetResolvedPackageFullNameForPackageDependency(p0, p1)")
private external fun wasmWindowssysWindowsWin32StoragePackagingAppxGetResolvedPackageFullNameForPackageDependency(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StoragePackagingAppxGetStagedPackageOrigin(p0, p1)")
private external fun wasmWindowssysWindowsWin32StoragePackagingAppxGetStagedPackageOrigin(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StoragePackagingAppxGetStagedPackagePathByFullName(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StoragePackagingAppxGetStagedPackagePathByFullName(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StoragePackagingAppxGetStagedPackagePathByFullName2(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StoragePackagingAppxGetStagedPackagePathByFullName2(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StoragePackagingAppxOpenPackageInfoByFullName(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StoragePackagingAppxOpenPackageInfoByFullName(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StoragePackagingAppxOpenPackageInfoByFullNameForUser(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StoragePackagingAppxOpenPackageInfoByFullNameForUser(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StoragePackagingAppxPackageFamilyNameFromFullName(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StoragePackagingAppxPackageFamilyNameFromFullName(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StoragePackagingAppxPackageFamilyNameFromId(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StoragePackagingAppxPackageFamilyNameFromId(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StoragePackagingAppxPackageFullNameFromId(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StoragePackagingAppxPackageFullNameFromId(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StoragePackagingAppxPackageIdFromFullName(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StoragePackagingAppxPackageIdFromFullName(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StoragePackagingAppxPackageNameAndPublisherIdFromFamilyName(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StoragePackagingAppxPackageNameAndPublisherIdFromFamilyName(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StoragePackagingAppxParseApplicationUserModelId(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StoragePackagingAppxParseApplicationUserModelId(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StoragePackagingAppxReleasePackageVirtualizationContext(p0)")
private external fun wasmWindowssysWindowsWin32StoragePackagingAppxReleasePackageVirtualizationContext(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StoragePackagingAppxRemovePackageDependency(p0)")
private external fun wasmWindowssysWindowsWin32StoragePackagingAppxRemovePackageDependency(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StoragePackagingAppxVerifyApplicationUserModelId(p0)")
private external fun wasmWindowssysWindowsWin32StoragePackagingAppxVerifyApplicationUserModelId(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StoragePackagingAppxVerifyPackageFamilyName(p0)")
private external fun wasmWindowssysWindowsWin32StoragePackagingAppxVerifyPackageFamilyName(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StoragePackagingAppxVerifyPackageFullName(p0)")
private external fun wasmWindowssysWindowsWin32StoragePackagingAppxVerifyPackageFullName(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StoragePackagingAppxVerifyPackageId(p0)")
private external fun wasmWindowssysWindowsWin32StoragePackagingAppxVerifyPackageId(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StoragePackagingAppxVerifyPackageRelativeApplicationId(p0)")
private external fun wasmWindowssysWindowsWin32StoragePackagingAppxVerifyPackageRelativeApplicationId(p0: String): Int

public actual fun activatePackageVirtualizationContext(context: PackageVirtualizationContextHandle, cookie: MutPtr<ULong>): Hresult =
    if (windowsWin32StoragePackagingAppxNapiAvailable) wasmWindowssysWindowsWin32StoragePackagingAppxActivatePackageVirtualizationContext(context.rawAddress.toString(), cookie.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addPackageDependency(packagedependencyid: Pcwstr, rank: Int, options: AddPackageDependencyOptions, packagedependencycontext: MutPtr<PackagedependencyContext>, packagefullname: MutPtr<Pwstr>): Hresult =
    if (windowsWin32StoragePackagingAppxNapiAvailable) wasmWindowssysWindowsWin32StoragePackagingAppxAddPackageDependency(packagedependencyid.rawAddress.toString(), rank, options, packagedependencycontext.rawAddress.toString(), packagefullname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appPolicyGetClrCompat(processtoken: Handle, policy: MutPtr<AppPolicyClrCompat>): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAvailable) wasmWindowssysWindowsWin32StoragePackagingAppxAppPolicyGetClrCompat(processtoken.rawAddress.toString(), policy.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appPolicyGetCreateFileAccess(processtoken: Handle, policy: MutPtr<AppPolicyCreateFileAccess>): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAvailable) wasmWindowssysWindowsWin32StoragePackagingAppxAppPolicyGetCreateFileAccess(processtoken.rawAddress.toString(), policy.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appPolicyGetLifecycleManagement(processtoken: Handle, policy: MutPtr<AppPolicyLifecycleManagement>): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAvailable) wasmWindowssysWindowsWin32StoragePackagingAppxAppPolicyGetLifecycleManagement(processtoken.rawAddress.toString(), policy.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appPolicyGetMediaFoundationCodecLoading(processtoken: Handle, policy: MutPtr<AppPolicyMediaFoundationCodecLoading>): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAvailable) wasmWindowssysWindowsWin32StoragePackagingAppxAppPolicyGetMediaFoundationCodecLoading(processtoken.rawAddress.toString(), policy.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appPolicyGetProcessTerminationMethod(processtoken: Handle, policy: MutPtr<AppPolicyProcessTerminationMethod>): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAvailable) wasmWindowssysWindowsWin32StoragePackagingAppxAppPolicyGetProcessTerminationMethod(processtoken.rawAddress.toString(), policy.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appPolicyGetShowDeveloperDiagnostic(processtoken: Handle, policy: MutPtr<AppPolicyShowDeveloperDiagnostic>): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAvailable) wasmWindowssysWindowsWin32StoragePackagingAppxAppPolicyGetShowDeveloperDiagnostic(processtoken.rawAddress.toString(), policy.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appPolicyGetThreadInitializationType(processtoken: Handle, policy: MutPtr<AppPolicyThreadInitializationType>): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAvailable) wasmWindowssysWindowsWin32StoragePackagingAppxAppPolicyGetThreadInitializationType(processtoken.rawAddress.toString(), policy.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appPolicyGetWindowingModel(processtoken: Handle, policy: MutPtr<AppPolicyWindowingModel>): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAvailable) wasmWindowssysWindowsWin32StoragePackagingAppxAppPolicyGetWindowingModel(processtoken.rawAddress.toString(), policy.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun checkIsMSIXPackage(packagefullname: Pcwstr, ismsixpackage: MutPtr<Bool>): Hresult =
    if (windowsWin32StoragePackagingAppxNapiAvailable) wasmWindowssysWindowsWin32StoragePackagingAppxCheckIsMSIXPackage(packagefullname.rawAddress.toString(), ismsixpackage.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closePackageInfo(packageinforeference: ConstPtr<PackageInfoReference>): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAvailable) wasmWindowssysWindowsWin32StoragePackagingAppxClosePackageInfo(packageinforeference.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPackageVirtualizationContext(packagefamilyname: Pcwstr, context: MutPtr<PackageVirtualizationContextHandle>): Hresult =
    if (windowsWin32StoragePackagingAppxNapiAvailable) wasmWindowssysWindowsWin32StoragePackagingAppxCreatePackageVirtualizationContext(packagefamilyname.rawAddress.toString(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deactivatePackageVirtualizationContext(cookie: ULong) {
    if (windowsWin32StoragePackagingAppxNapiAvailable) {
        wasmWindowssysWindowsWin32StoragePackagingAppxDeactivatePackageVirtualizationContext(cookie.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun deletePackageDependency(packagedependencyid: Pcwstr): Hresult =
    if (windowsWin32StoragePackagingAppxNapiAvailable) wasmWindowssysWindowsWin32StoragePackagingAppxDeletePackageDependency(packagedependencyid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun duplicatePackageVirtualizationContext(sourcecontext: PackageVirtualizationContextHandle, destcontext: MutPtr<PackageVirtualizationContextHandle>): Hresult =
    if (windowsWin32StoragePackagingAppxNapiAvailable) wasmWindowssysWindowsWin32StoragePackagingAppxDuplicatePackageVirtualizationContext(sourcecontext.rawAddress.toString(), destcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findPackagesByPackageFamily(packagefamilyname: Pcwstr, packagefilters: UInt, count: MutPtr<UInt>, packagefullnames: MutPtr<Pwstr>, bufferlength: MutPtr<UInt>, buffer: Pwstr, packageproperties: MutPtr<UInt>): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAvailable) wasmWindowssysWindowsWin32StoragePackagingAppxFindPackagesByPackageFamily(packagefamilyname.rawAddress.toString(), packagefilters.toInt(), count.rawAddress.toString(), packagefullnames.rawAddress.toString(), bufferlength.rawAddress.toString(), buffer.rawAddress.toString(), packageproperties.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun formatApplicationUserModelId(packagefamilyname: Pcwstr, packagerelativeapplicationid: Pcwstr, applicationusermodelidlength: MutPtr<UInt>, applicationusermodelid: Pwstr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAvailable) wasmWindowssysWindowsWin32StoragePackagingAppxFormatApplicationUserModelId(packagefamilyname.rawAddress.toString(), packagerelativeapplicationid.rawAddress.toString(), applicationusermodelidlength.rawAddress.toString(), applicationusermodelid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getApplicationUserModelId(hprocess: Handle, applicationusermodelidlength: MutPtr<UInt>, applicationusermodelid: Pwstr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAvailable) wasmWindowssysWindowsWin32StoragePackagingAppxGetApplicationUserModelId(hprocess.rawAddress.toString(), applicationusermodelidlength.rawAddress.toString(), applicationusermodelid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getApplicationUserModelIdFromToken(token: Handle, applicationusermodelidlength: MutPtr<UInt>, applicationusermodelid: Pwstr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAvailable) wasmWindowssysWindowsWin32StoragePackagingAppxGetApplicationUserModelIdFromToken(token.rawAddress.toString(), applicationusermodelidlength.rawAddress.toString(), applicationusermodelid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentApplicationUserModelId(applicationusermodelidlength: MutPtr<UInt>, applicationusermodelid: Pwstr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAvailable) wasmWindowssysWindowsWin32StoragePackagingAppxGetCurrentApplicationUserModelId(applicationusermodelidlength.rawAddress.toString(), applicationusermodelid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentPackageFamilyName(packagefamilynamelength: MutPtr<UInt>, packagefamilyname: Pwstr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAvailable) wasmWindowssysWindowsWin32StoragePackagingAppxGetCurrentPackageFamilyName(packagefamilynamelength.rawAddress.toString(), packagefamilyname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentPackageFullName(packagefullnamelength: MutPtr<UInt>, packagefullname: Pwstr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAvailable) wasmWindowssysWindowsWin32StoragePackagingAppxGetCurrentPackageFullName(packagefullnamelength.rawAddress.toString(), packagefullname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentPackageId(bufferlength: MutPtr<UInt>, buffer: MutPtr<UByte>): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAvailable) wasmWindowssysWindowsWin32StoragePackagingAppxGetCurrentPackageId(bufferlength.rawAddress.toString(), buffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentPackageInfo(flags: UInt, bufferlength: MutPtr<UInt>, buffer: MutPtr<UByte>, count: MutPtr<UInt>): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAvailable) wasmWindowssysWindowsWin32StoragePackagingAppxGetCurrentPackageInfo(flags.toInt(), bufferlength.rawAddress.toString(), buffer.rawAddress.toString(), count.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentPackageInfo2(flags: UInt, packagepathtype: PackagePathType, bufferlength: MutPtr<UInt>, buffer: MutPtr<UByte>, count: MutPtr<UInt>): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAvailable) wasmWindowssysWindowsWin32StoragePackagingAppxGetCurrentPackageInfo2(flags.toInt(), packagepathtype, bufferlength.rawAddress.toString(), buffer.rawAddress.toString(), count.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentPackageInfo3(flags: UInt, packageinfotype: PackageInfo3Type, bufferlength: MutPtr<UInt>, buffer: MutPtr<CVoid>, count: MutPtr<UInt>): Hresult =
    if (windowsWin32StoragePackagingAppxNapiAvailable) wasmWindowssysWindowsWin32StoragePackagingAppxGetCurrentPackageInfo3(flags.toInt(), packageinfotype, bufferlength.rawAddress.toString(), buffer.rawAddress.toString(), count.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentPackagePath(pathlength: MutPtr<UInt>, path: Pwstr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAvailable) wasmWindowssysWindowsWin32StoragePackagingAppxGetCurrentPackagePath(pathlength.rawAddress.toString(), path.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentPackagePath2(packagepathtype: PackagePathType, pathlength: MutPtr<UInt>, path: Pwstr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAvailable) wasmWindowssysWindowsWin32StoragePackagingAppxGetCurrentPackagePath2(packagepathtype, pathlength.rawAddress.toString(), path.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentPackageVirtualizationContext(): PackageVirtualizationContextHandle =
    if (windowsWin32StoragePackagingAppxNapiAvailable) MutPtr(wasmWindowssysWindowsWin32StoragePackagingAppxGetCurrentPackageVirtualizationContext().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIdForPackageDependencyContext(packagedependencycontext: PackagedependencyContext, packagedependencyid: MutPtr<Pwstr>): Hresult =
    if (windowsWin32StoragePackagingAppxNapiAvailable) wasmWindowssysWindowsWin32StoragePackagingAppxGetIdForPackageDependencyContext(packagedependencycontext.rawAddress.toString(), packagedependencyid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPackageApplicationIds(packageinforeference: ConstPtr<PackageInfoReference>, bufferlength: MutPtr<UInt>, buffer: MutPtr<UByte>, count: MutPtr<UInt>): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAvailable) wasmWindowssysWindowsWin32StoragePackagingAppxGetPackageApplicationIds(packageinforeference.rawAddress.toString(), bufferlength.rawAddress.toString(), buffer.rawAddress.toString(), count.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPackageFamilyName(hprocess: Handle, packagefamilynamelength: MutPtr<UInt>, packagefamilyname: Pwstr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAvailable) wasmWindowssysWindowsWin32StoragePackagingAppxGetPackageFamilyName(hprocess.rawAddress.toString(), packagefamilynamelength.rawAddress.toString(), packagefamilyname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPackageFamilyNameFromToken(token: Handle, packagefamilynamelength: MutPtr<UInt>, packagefamilyname: Pwstr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAvailable) wasmWindowssysWindowsWin32StoragePackagingAppxGetPackageFamilyNameFromToken(token.rawAddress.toString(), packagefamilynamelength.rawAddress.toString(), packagefamilyname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPackageFullName(hprocess: Handle, packagefullnamelength: MutPtr<UInt>, packagefullname: Pwstr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAvailable) wasmWindowssysWindowsWin32StoragePackagingAppxGetPackageFullName(hprocess.rawAddress.toString(), packagefullnamelength.rawAddress.toString(), packagefullname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPackageFullNameFromToken(token: Handle, packagefullnamelength: MutPtr<UInt>, packagefullname: Pwstr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAvailable) wasmWindowssysWindowsWin32StoragePackagingAppxGetPackageFullNameFromToken(token.rawAddress.toString(), packagefullnamelength.rawAddress.toString(), packagefullname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPackageGraphRevisionId(): UInt =
    if (windowsWin32StoragePackagingAppxNapiAvailable) wasmWindowssysWindowsWin32StoragePackagingAppxGetPackageGraphRevisionId().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPackageId(hprocess: Handle, bufferlength: MutPtr<UInt>, buffer: MutPtr<UByte>): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAvailable) wasmWindowssysWindowsWin32StoragePackagingAppxGetPackageId(hprocess.rawAddress.toString(), bufferlength.rawAddress.toString(), buffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPackageInfo(packageinforeference: ConstPtr<PackageInfoReference>, flags: UInt, bufferlength: MutPtr<UInt>, buffer: MutPtr<UByte>, count: MutPtr<UInt>): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAvailable) wasmWindowssysWindowsWin32StoragePackagingAppxGetPackageInfo(packageinforeference.rawAddress.toString(), flags.toInt(), bufferlength.rawAddress.toString(), buffer.rawAddress.toString(), count.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPackageInfo2(packageinforeference: ConstPtr<PackageInfoReference>, flags: UInt, packagepathtype: PackagePathType, bufferlength: MutPtr<UInt>, buffer: MutPtr<UByte>, count: MutPtr<UInt>): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAvailable) wasmWindowssysWindowsWin32StoragePackagingAppxGetPackageInfo2(packageinforeference.rawAddress.toString(), flags.toInt(), packagepathtype, bufferlength.rawAddress.toString(), buffer.rawAddress.toString(), count.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPackagePath(packageid: ConstPtr<PackageId>, reserved: UInt, pathlength: MutPtr<UInt>, path: Pwstr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAvailable) wasmWindowssysWindowsWin32StoragePackagingAppxGetPackagePath(packageid.rawAddress.toString(), reserved.toInt(), pathlength.rawAddress.toString(), path.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPackagePathByFullName(packagefullname: Pcwstr, pathlength: MutPtr<UInt>, path: Pwstr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAvailable) wasmWindowssysWindowsWin32StoragePackagingAppxGetPackagePathByFullName(packagefullname.rawAddress.toString(), pathlength.rawAddress.toString(), path.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPackagePathByFullName2(packagefullname: Pcwstr, packagepathtype: PackagePathType, pathlength: MutPtr<UInt>, path: Pwstr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAvailable) wasmWindowssysWindowsWin32StoragePackagingAppxGetPackagePathByFullName2(packagefullname.rawAddress.toString(), packagepathtype, pathlength.rawAddress.toString(), path.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPackagesByPackageFamily(packagefamilyname: Pcwstr, count: MutPtr<UInt>, packagefullnames: MutPtr<Pwstr>, bufferlength: MutPtr<UInt>, buffer: Pwstr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAvailable) wasmWindowssysWindowsWin32StoragePackagingAppxGetPackagesByPackageFamily(packagefamilyname.rawAddress.toString(), count.rawAddress.toString(), packagefullnames.rawAddress.toString(), bufferlength.rawAddress.toString(), buffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessesInVirtualizationContext(packagefamilyname: Pcwstr, count: MutPtr<UInt>, processes: MutPtr<MutPtr<Handle>>): Hresult =
    if (windowsWin32StoragePackagingAppxNapiAvailable) wasmWindowssysWindowsWin32StoragePackagingAppxGetProcessesInVirtualizationContext(packagefamilyname.rawAddress.toString(), count.rawAddress.toString(), processes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getResolvedPackageFullNameForPackageDependency(packagedependencyid: Pcwstr, packagefullname: MutPtr<Pwstr>): Hresult =
    if (windowsWin32StoragePackagingAppxNapiAvailable) wasmWindowssysWindowsWin32StoragePackagingAppxGetResolvedPackageFullNameForPackageDependency(packagedependencyid.rawAddress.toString(), packagefullname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getStagedPackageOrigin(packagefullname: Pcwstr, origin: MutPtr<PackageOrigin>): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAvailable) wasmWindowssysWindowsWin32StoragePackagingAppxGetStagedPackageOrigin(packagefullname.rawAddress.toString(), origin.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getStagedPackagePathByFullName(packagefullname: Pcwstr, pathlength: MutPtr<UInt>, path: Pwstr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAvailable) wasmWindowssysWindowsWin32StoragePackagingAppxGetStagedPackagePathByFullName(packagefullname.rawAddress.toString(), pathlength.rawAddress.toString(), path.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getStagedPackagePathByFullName2(packagefullname: Pcwstr, packagepathtype: PackagePathType, pathlength: MutPtr<UInt>, path: Pwstr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAvailable) wasmWindowssysWindowsWin32StoragePackagingAppxGetStagedPackagePathByFullName2(packagefullname.rawAddress.toString(), packagepathtype, pathlength.rawAddress.toString(), path.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openPackageInfoByFullName(packagefullname: Pcwstr, reserved: UInt, packageinforeference: MutPtr<MutPtr<PackageInfoReference>>): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAvailable) wasmWindowssysWindowsWin32StoragePackagingAppxOpenPackageInfoByFullName(packagefullname.rawAddress.toString(), reserved.toInt(), packageinforeference.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openPackageInfoByFullNameForUser(usersid: Psid, packagefullname: Pcwstr, reserved: UInt, packageinforeference: MutPtr<MutPtr<PackageInfoReference>>): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAvailable) wasmWindowssysWindowsWin32StoragePackagingAppxOpenPackageInfoByFullNameForUser(usersid.rawAddress.toString(), packagefullname.rawAddress.toString(), reserved.toInt(), packageinforeference.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun packageFamilyNameFromFullName(packagefullname: Pcwstr, packagefamilynamelength: MutPtr<UInt>, packagefamilyname: Pwstr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAvailable) wasmWindowssysWindowsWin32StoragePackagingAppxPackageFamilyNameFromFullName(packagefullname.rawAddress.toString(), packagefamilynamelength.rawAddress.toString(), packagefamilyname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun packageFamilyNameFromId(packageid: ConstPtr<PackageId>, packagefamilynamelength: MutPtr<UInt>, packagefamilyname: Pwstr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAvailable) wasmWindowssysWindowsWin32StoragePackagingAppxPackageFamilyNameFromId(packageid.rawAddress.toString(), packagefamilynamelength.rawAddress.toString(), packagefamilyname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun packageFullNameFromId(packageid: ConstPtr<PackageId>, packagefullnamelength: MutPtr<UInt>, packagefullname: Pwstr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAvailable) wasmWindowssysWindowsWin32StoragePackagingAppxPackageFullNameFromId(packageid.rawAddress.toString(), packagefullnamelength.rawAddress.toString(), packagefullname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun packageIdFromFullName(packagefullname: Pcwstr, flags: UInt, bufferlength: MutPtr<UInt>, buffer: MutPtr<UByte>): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAvailable) wasmWindowssysWindowsWin32StoragePackagingAppxPackageIdFromFullName(packagefullname.rawAddress.toString(), flags.toInt(), bufferlength.rawAddress.toString(), buffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun packageNameAndPublisherIdFromFamilyName(packagefamilyname: Pcwstr, packagenamelength: MutPtr<UInt>, packagename: Pwstr, packagepublisheridlength: MutPtr<UInt>, packagepublisherid: Pwstr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAvailable) wasmWindowssysWindowsWin32StoragePackagingAppxPackageNameAndPublisherIdFromFamilyName(packagefamilyname.rawAddress.toString(), packagenamelength.rawAddress.toString(), packagename.rawAddress.toString(), packagepublisheridlength.rawAddress.toString(), packagepublisherid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun parseApplicationUserModelId(applicationusermodelid: Pcwstr, packagefamilynamelength: MutPtr<UInt>, packagefamilyname: Pwstr, packagerelativeapplicationidlength: MutPtr<UInt>, packagerelativeapplicationid: Pwstr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAvailable) wasmWindowssysWindowsWin32StoragePackagingAppxParseApplicationUserModelId(applicationusermodelid.rawAddress.toString(), packagefamilynamelength.rawAddress.toString(), packagefamilyname.rawAddress.toString(), packagerelativeapplicationidlength.rawAddress.toString(), packagerelativeapplicationid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun releasePackageVirtualizationContext(context: PackageVirtualizationContextHandle) {
    if (windowsWin32StoragePackagingAppxNapiAvailable) {
        wasmWindowssysWindowsWin32StoragePackagingAppxReleasePackageVirtualizationContext(context.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun removePackageDependency(packagedependencycontext: PackagedependencyContext): Hresult =
    if (windowsWin32StoragePackagingAppxNapiAvailable) wasmWindowssysWindowsWin32StoragePackagingAppxRemovePackageDependency(packagedependencycontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tryCreatePackageDependency(user: Psid, packagefamilyname: Pcwstr, minversion: PackageVersion, packagedependencyprocessorarchitectures: PackageDependencyProcessorArchitectures, lifetimekind: PackageDependencyLifetimeKind, lifetimeartifact: Pcwstr, options: CreatePackageDependencyOptions, packagedependencyid: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun verifyApplicationUserModelId(applicationusermodelid: Pcwstr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAvailable) wasmWindowssysWindowsWin32StoragePackagingAppxVerifyApplicationUserModelId(applicationusermodelid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun verifyPackageFamilyName(packagefamilyname: Pcwstr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAvailable) wasmWindowssysWindowsWin32StoragePackagingAppxVerifyPackageFamilyName(packagefamilyname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun verifyPackageFullName(packagefullname: Pcwstr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAvailable) wasmWindowssysWindowsWin32StoragePackagingAppxVerifyPackageFullName(packagefullname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun verifyPackageId(packageid: ConstPtr<PackageId>): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAvailable) wasmWindowssysWindowsWin32StoragePackagingAppxVerifyPackageId(packageid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun verifyPackageRelativeApplicationId(packagerelativeapplicationid: Pcwstr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAvailable) wasmWindowssysWindowsWin32StoragePackagingAppxVerifyPackageRelativeApplicationId(packagerelativeapplicationid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
