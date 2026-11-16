@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error
import io.github.kotlinmania.windowssys.windows.win32.security.Psid

private val windowsWin32StoragePackagingAppxNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun activatePackageVirtualizationContext(context: PackageVirtualizationContextHandle, cookie: MutPtr): Hresult =
    if (windowsWin32StoragePackagingAppxNapiAddon != null) (windowsWin32StoragePackagingAppxNapiAddon.windowssysWindowsWin32StoragePackagingAppxActivatePackageVirtualizationContext(context.rawAddress.toString(), cookie.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addPackageDependency(packagedependencyid: Pcwstr, rank: Int, options: AddPackageDependencyOptions, packagedependencycontext: MutPtr, packagefullname: MutPtr): Hresult =
    if (windowsWin32StoragePackagingAppxNapiAddon != null) (windowsWin32StoragePackagingAppxNapiAddon.windowssysWindowsWin32StoragePackagingAppxAddPackageDependency(packagedependencyid.rawAddress.toString(), rank, options, packagedependencycontext.rawAddress.toString(), packagefullname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appPolicyGetClrCompat(processtoken: Handle, policy: MutPtr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAddon != null) (windowsWin32StoragePackagingAppxNapiAddon.windowssysWindowsWin32StoragePackagingAppxAppPolicyGetClrCompat(processtoken.rawAddress.toString(), policy.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appPolicyGetCreateFileAccess(processtoken: Handle, policy: MutPtr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAddon != null) (windowsWin32StoragePackagingAppxNapiAddon.windowssysWindowsWin32StoragePackagingAppxAppPolicyGetCreateFileAccess(processtoken.rawAddress.toString(), policy.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appPolicyGetLifecycleManagement(processtoken: Handle, policy: MutPtr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAddon != null) (windowsWin32StoragePackagingAppxNapiAddon.windowssysWindowsWin32StoragePackagingAppxAppPolicyGetLifecycleManagement(processtoken.rawAddress.toString(), policy.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appPolicyGetMediaFoundationCodecLoading(processtoken: Handle, policy: MutPtr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAddon != null) (windowsWin32StoragePackagingAppxNapiAddon.windowssysWindowsWin32StoragePackagingAppxAppPolicyGetMediaFoundationCodecLoading(processtoken.rawAddress.toString(), policy.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appPolicyGetProcessTerminationMethod(processtoken: Handle, policy: MutPtr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAddon != null) (windowsWin32StoragePackagingAppxNapiAddon.windowssysWindowsWin32StoragePackagingAppxAppPolicyGetProcessTerminationMethod(processtoken.rawAddress.toString(), policy.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appPolicyGetShowDeveloperDiagnostic(processtoken: Handle, policy: MutPtr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAddon != null) (windowsWin32StoragePackagingAppxNapiAddon.windowssysWindowsWin32StoragePackagingAppxAppPolicyGetShowDeveloperDiagnostic(processtoken.rawAddress.toString(), policy.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appPolicyGetThreadInitializationType(processtoken: Handle, policy: MutPtr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAddon != null) (windowsWin32StoragePackagingAppxNapiAddon.windowssysWindowsWin32StoragePackagingAppxAppPolicyGetThreadInitializationType(processtoken.rawAddress.toString(), policy.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appPolicyGetWindowingModel(processtoken: Handle, policy: MutPtr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAddon != null) (windowsWin32StoragePackagingAppxNapiAddon.windowssysWindowsWin32StoragePackagingAppxAppPolicyGetWindowingModel(processtoken.rawAddress.toString(), policy.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun checkIsMSIXPackage(packagefullname: Pcwstr, ismsixpackage: MutPtr): Hresult =
    if (windowsWin32StoragePackagingAppxNapiAddon != null) (windowsWin32StoragePackagingAppxNapiAddon.windowssysWindowsWin32StoragePackagingAppxCheckIsMSIXPackage(packagefullname.rawAddress.toString(), ismsixpackage.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closePackageInfo(packageinforeference: ConstPtr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAddon != null) (windowsWin32StoragePackagingAppxNapiAddon.windowssysWindowsWin32StoragePackagingAppxClosePackageInfo(packageinforeference.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPackageVirtualizationContext(packagefamilyname: Pcwstr, context: MutPtr): Hresult =
    if (windowsWin32StoragePackagingAppxNapiAddon != null) (windowsWin32StoragePackagingAppxNapiAddon.windowssysWindowsWin32StoragePackagingAppxCreatePackageVirtualizationContext(packagefamilyname.rawAddress.toString(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deactivatePackageVirtualizationContext(cookie: ULong) {
    if (windowsWin32StoragePackagingAppxNapiAddon != null) {
        windowsWin32StoragePackagingAppxNapiAddon.windowssysWindowsWin32StoragePackagingAppxDeactivatePackageVirtualizationContext(cookie.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun deletePackageDependency(packagedependencyid: Pcwstr): Hresult =
    if (windowsWin32StoragePackagingAppxNapiAddon != null) (windowsWin32StoragePackagingAppxNapiAddon.windowssysWindowsWin32StoragePackagingAppxDeletePackageDependency(packagedependencyid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun duplicatePackageVirtualizationContext(sourcecontext: PackageVirtualizationContextHandle, destcontext: MutPtr): Hresult =
    if (windowsWin32StoragePackagingAppxNapiAddon != null) (windowsWin32StoragePackagingAppxNapiAddon.windowssysWindowsWin32StoragePackagingAppxDuplicatePackageVirtualizationContext(sourcecontext.rawAddress.toString(), destcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findPackagesByPackageFamily(packagefamilyname: Pcwstr, packagefilters: UInt, count: MutPtr, packagefullnames: MutPtr, bufferlength: MutPtr, buffer: Pwstr, packageproperties: MutPtr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAddon != null) (windowsWin32StoragePackagingAppxNapiAddon.windowssysWindowsWin32StoragePackagingAppxFindPackagesByPackageFamily(packagefamilyname.rawAddress.toString(), packagefilters.toInt(), count.rawAddress.toString(), packagefullnames.rawAddress.toString(), bufferlength.rawAddress.toString(), buffer.rawAddress.toString(), packageproperties.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun formatApplicationUserModelId(packagefamilyname: Pcwstr, packagerelativeapplicationid: Pcwstr, applicationusermodelidlength: MutPtr, applicationusermodelid: Pwstr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAddon != null) (windowsWin32StoragePackagingAppxNapiAddon.windowssysWindowsWin32StoragePackagingAppxFormatApplicationUserModelId(packagefamilyname.rawAddress.toString(), packagerelativeapplicationid.rawAddress.toString(), applicationusermodelidlength.rawAddress.toString(), applicationusermodelid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getApplicationUserModelId(hprocess: Handle, applicationusermodelidlength: MutPtr, applicationusermodelid: Pwstr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAddon != null) (windowsWin32StoragePackagingAppxNapiAddon.windowssysWindowsWin32StoragePackagingAppxGetApplicationUserModelId(hprocess.rawAddress.toString(), applicationusermodelidlength.rawAddress.toString(), applicationusermodelid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getApplicationUserModelIdFromToken(token: Handle, applicationusermodelidlength: MutPtr, applicationusermodelid: Pwstr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAddon != null) (windowsWin32StoragePackagingAppxNapiAddon.windowssysWindowsWin32StoragePackagingAppxGetApplicationUserModelIdFromToken(token.rawAddress.toString(), applicationusermodelidlength.rawAddress.toString(), applicationusermodelid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentApplicationUserModelId(applicationusermodelidlength: MutPtr, applicationusermodelid: Pwstr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAddon != null) (windowsWin32StoragePackagingAppxNapiAddon.windowssysWindowsWin32StoragePackagingAppxGetCurrentApplicationUserModelId(applicationusermodelidlength.rawAddress.toString(), applicationusermodelid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentPackageFamilyName(packagefamilynamelength: MutPtr, packagefamilyname: Pwstr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAddon != null) (windowsWin32StoragePackagingAppxNapiAddon.windowssysWindowsWin32StoragePackagingAppxGetCurrentPackageFamilyName(packagefamilynamelength.rawAddress.toString(), packagefamilyname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentPackageFullName(packagefullnamelength: MutPtr, packagefullname: Pwstr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAddon != null) (windowsWin32StoragePackagingAppxNapiAddon.windowssysWindowsWin32StoragePackagingAppxGetCurrentPackageFullName(packagefullnamelength.rawAddress.toString(), packagefullname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentPackageId(bufferlength: MutPtr, buffer: MutPtr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAddon != null) (windowsWin32StoragePackagingAppxNapiAddon.windowssysWindowsWin32StoragePackagingAppxGetCurrentPackageId(bufferlength.rawAddress.toString(), buffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentPackageInfo(flags: UInt, bufferlength: MutPtr, buffer: MutPtr, count: MutPtr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAddon != null) (windowsWin32StoragePackagingAppxNapiAddon.windowssysWindowsWin32StoragePackagingAppxGetCurrentPackageInfo(flags.toInt(), bufferlength.rawAddress.toString(), buffer.rawAddress.toString(), count.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentPackageInfo2(flags: UInt, packagepathtype: PackagePathType, bufferlength: MutPtr, buffer: MutPtr, count: MutPtr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAddon != null) (windowsWin32StoragePackagingAppxNapiAddon.windowssysWindowsWin32StoragePackagingAppxGetCurrentPackageInfo2(flags.toInt(), packagepathtype, bufferlength.rawAddress.toString(), buffer.rawAddress.toString(), count.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentPackageInfo3(flags: UInt, packageinfotype: PackageInfo3Type, bufferlength: MutPtr, buffer: MutPtr, count: MutPtr): Hresult =
    if (windowsWin32StoragePackagingAppxNapiAddon != null) (windowsWin32StoragePackagingAppxNapiAddon.windowssysWindowsWin32StoragePackagingAppxGetCurrentPackageInfo3(flags.toInt(), packageinfotype, bufferlength.rawAddress.toString(), buffer.rawAddress.toString(), count.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentPackagePath(pathlength: MutPtr, path: Pwstr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAddon != null) (windowsWin32StoragePackagingAppxNapiAddon.windowssysWindowsWin32StoragePackagingAppxGetCurrentPackagePath(pathlength.rawAddress.toString(), path.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentPackagePath2(packagepathtype: PackagePathType, pathlength: MutPtr, path: Pwstr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAddon != null) (windowsWin32StoragePackagingAppxNapiAddon.windowssysWindowsWin32StoragePackagingAppxGetCurrentPackagePath2(packagepathtype, pathlength.rawAddress.toString(), path.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentPackageVirtualizationContext(): PackageVirtualizationContextHandle =
    if (windowsWin32StoragePackagingAppxNapiAddon != null) MutPtr((windowsWin32StoragePackagingAppxNapiAddon.windowssysWindowsWin32StoragePackagingAppxGetCurrentPackageVirtualizationContext() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIdForPackageDependencyContext(packagedependencycontext: PackagedependencyContext, packagedependencyid: MutPtr): Hresult =
    if (windowsWin32StoragePackagingAppxNapiAddon != null) (windowsWin32StoragePackagingAppxNapiAddon.windowssysWindowsWin32StoragePackagingAppxGetIdForPackageDependencyContext(packagedependencycontext.rawAddress.toString(), packagedependencyid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPackageApplicationIds(packageinforeference: ConstPtr, bufferlength: MutPtr, buffer: MutPtr, count: MutPtr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAddon != null) (windowsWin32StoragePackagingAppxNapiAddon.windowssysWindowsWin32StoragePackagingAppxGetPackageApplicationIds(packageinforeference.rawAddress.toString(), bufferlength.rawAddress.toString(), buffer.rawAddress.toString(), count.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPackageFamilyName(hprocess: Handle, packagefamilynamelength: MutPtr, packagefamilyname: Pwstr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAddon != null) (windowsWin32StoragePackagingAppxNapiAddon.windowssysWindowsWin32StoragePackagingAppxGetPackageFamilyName(hprocess.rawAddress.toString(), packagefamilynamelength.rawAddress.toString(), packagefamilyname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPackageFamilyNameFromToken(token: Handle, packagefamilynamelength: MutPtr, packagefamilyname: Pwstr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAddon != null) (windowsWin32StoragePackagingAppxNapiAddon.windowssysWindowsWin32StoragePackagingAppxGetPackageFamilyNameFromToken(token.rawAddress.toString(), packagefamilynamelength.rawAddress.toString(), packagefamilyname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPackageFullName(hprocess: Handle, packagefullnamelength: MutPtr, packagefullname: Pwstr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAddon != null) (windowsWin32StoragePackagingAppxNapiAddon.windowssysWindowsWin32StoragePackagingAppxGetPackageFullName(hprocess.rawAddress.toString(), packagefullnamelength.rawAddress.toString(), packagefullname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPackageFullNameFromToken(token: Handle, packagefullnamelength: MutPtr, packagefullname: Pwstr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAddon != null) (windowsWin32StoragePackagingAppxNapiAddon.windowssysWindowsWin32StoragePackagingAppxGetPackageFullNameFromToken(token.rawAddress.toString(), packagefullnamelength.rawAddress.toString(), packagefullname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPackageGraphRevisionId(): UInt =
    if (windowsWin32StoragePackagingAppxNapiAddon != null) (windowsWin32StoragePackagingAppxNapiAddon.windowssysWindowsWin32StoragePackagingAppxGetPackageGraphRevisionId() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPackageId(hprocess: Handle, bufferlength: MutPtr, buffer: MutPtr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAddon != null) (windowsWin32StoragePackagingAppxNapiAddon.windowssysWindowsWin32StoragePackagingAppxGetPackageId(hprocess.rawAddress.toString(), bufferlength.rawAddress.toString(), buffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPackageInfo(packageinforeference: ConstPtr, flags: UInt, bufferlength: MutPtr, buffer: MutPtr, count: MutPtr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAddon != null) (windowsWin32StoragePackagingAppxNapiAddon.windowssysWindowsWin32StoragePackagingAppxGetPackageInfo(packageinforeference.rawAddress.toString(), flags.toInt(), bufferlength.rawAddress.toString(), buffer.rawAddress.toString(), count.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPackageInfo2(packageinforeference: ConstPtr, flags: UInt, packagepathtype: PackagePathType, bufferlength: MutPtr, buffer: MutPtr, count: MutPtr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAddon != null) (windowsWin32StoragePackagingAppxNapiAddon.windowssysWindowsWin32StoragePackagingAppxGetPackageInfo2(packageinforeference.rawAddress.toString(), flags.toInt(), packagepathtype, bufferlength.rawAddress.toString(), buffer.rawAddress.toString(), count.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPackagePath(packageid: ConstPtr, reserved: UInt, pathlength: MutPtr, path: Pwstr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAddon != null) (windowsWin32StoragePackagingAppxNapiAddon.windowssysWindowsWin32StoragePackagingAppxGetPackagePath(packageid.rawAddress.toString(), reserved.toInt(), pathlength.rawAddress.toString(), path.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPackagePathByFullName(packagefullname: Pcwstr, pathlength: MutPtr, path: Pwstr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAddon != null) (windowsWin32StoragePackagingAppxNapiAddon.windowssysWindowsWin32StoragePackagingAppxGetPackagePathByFullName(packagefullname.rawAddress.toString(), pathlength.rawAddress.toString(), path.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPackagePathByFullName2(packagefullname: Pcwstr, packagepathtype: PackagePathType, pathlength: MutPtr, path: Pwstr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAddon != null) (windowsWin32StoragePackagingAppxNapiAddon.windowssysWindowsWin32StoragePackagingAppxGetPackagePathByFullName2(packagefullname.rawAddress.toString(), packagepathtype, pathlength.rawAddress.toString(), path.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPackagesByPackageFamily(packagefamilyname: Pcwstr, count: MutPtr, packagefullnames: MutPtr, bufferlength: MutPtr, buffer: Pwstr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAddon != null) (windowsWin32StoragePackagingAppxNapiAddon.windowssysWindowsWin32StoragePackagingAppxGetPackagesByPackageFamily(packagefamilyname.rawAddress.toString(), count.rawAddress.toString(), packagefullnames.rawAddress.toString(), bufferlength.rawAddress.toString(), buffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessesInVirtualizationContext(packagefamilyname: Pcwstr, count: MutPtr, processes: MutPtr): Hresult =
    if (windowsWin32StoragePackagingAppxNapiAddon != null) (windowsWin32StoragePackagingAppxNapiAddon.windowssysWindowsWin32StoragePackagingAppxGetProcessesInVirtualizationContext(packagefamilyname.rawAddress.toString(), count.rawAddress.toString(), processes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getResolvedPackageFullNameForPackageDependency(packagedependencyid: Pcwstr, packagefullname: MutPtr): Hresult =
    if (windowsWin32StoragePackagingAppxNapiAddon != null) (windowsWin32StoragePackagingAppxNapiAddon.windowssysWindowsWin32StoragePackagingAppxGetResolvedPackageFullNameForPackageDependency(packagedependencyid.rawAddress.toString(), packagefullname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getStagedPackageOrigin(packagefullname: Pcwstr, origin: MutPtr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAddon != null) (windowsWin32StoragePackagingAppxNapiAddon.windowssysWindowsWin32StoragePackagingAppxGetStagedPackageOrigin(packagefullname.rawAddress.toString(), origin.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getStagedPackagePathByFullName(packagefullname: Pcwstr, pathlength: MutPtr, path: Pwstr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAddon != null) (windowsWin32StoragePackagingAppxNapiAddon.windowssysWindowsWin32StoragePackagingAppxGetStagedPackagePathByFullName(packagefullname.rawAddress.toString(), pathlength.rawAddress.toString(), path.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getStagedPackagePathByFullName2(packagefullname: Pcwstr, packagepathtype: PackagePathType, pathlength: MutPtr, path: Pwstr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAddon != null) (windowsWin32StoragePackagingAppxNapiAddon.windowssysWindowsWin32StoragePackagingAppxGetStagedPackagePathByFullName2(packagefullname.rawAddress.toString(), packagepathtype, pathlength.rawAddress.toString(), path.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openPackageInfoByFullName(packagefullname: Pcwstr, reserved: UInt, packageinforeference: MutPtr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAddon != null) (windowsWin32StoragePackagingAppxNapiAddon.windowssysWindowsWin32StoragePackagingAppxOpenPackageInfoByFullName(packagefullname.rawAddress.toString(), reserved.toInt(), packageinforeference.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openPackageInfoByFullNameForUser(usersid: Psid, packagefullname: Pcwstr, reserved: UInt, packageinforeference: MutPtr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAddon != null) (windowsWin32StoragePackagingAppxNapiAddon.windowssysWindowsWin32StoragePackagingAppxOpenPackageInfoByFullNameForUser(usersid.rawAddress.toString(), packagefullname.rawAddress.toString(), reserved.toInt(), packageinforeference.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun packageFamilyNameFromFullName(packagefullname: Pcwstr, packagefamilynamelength: MutPtr, packagefamilyname: Pwstr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAddon != null) (windowsWin32StoragePackagingAppxNapiAddon.windowssysWindowsWin32StoragePackagingAppxPackageFamilyNameFromFullName(packagefullname.rawAddress.toString(), packagefamilynamelength.rawAddress.toString(), packagefamilyname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun packageFamilyNameFromId(packageid: ConstPtr, packagefamilynamelength: MutPtr, packagefamilyname: Pwstr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAddon != null) (windowsWin32StoragePackagingAppxNapiAddon.windowssysWindowsWin32StoragePackagingAppxPackageFamilyNameFromId(packageid.rawAddress.toString(), packagefamilynamelength.rawAddress.toString(), packagefamilyname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun packageFullNameFromId(packageid: ConstPtr, packagefullnamelength: MutPtr, packagefullname: Pwstr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAddon != null) (windowsWin32StoragePackagingAppxNapiAddon.windowssysWindowsWin32StoragePackagingAppxPackageFullNameFromId(packageid.rawAddress.toString(), packagefullnamelength.rawAddress.toString(), packagefullname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun packageIdFromFullName(packagefullname: Pcwstr, flags: UInt, bufferlength: MutPtr, buffer: MutPtr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAddon != null) (windowsWin32StoragePackagingAppxNapiAddon.windowssysWindowsWin32StoragePackagingAppxPackageIdFromFullName(packagefullname.rawAddress.toString(), flags.toInt(), bufferlength.rawAddress.toString(), buffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun packageNameAndPublisherIdFromFamilyName(packagefamilyname: Pcwstr, packagenamelength: MutPtr, packagename: Pwstr, packagepublisheridlength: MutPtr, packagepublisherid: Pwstr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAddon != null) (windowsWin32StoragePackagingAppxNapiAddon.windowssysWindowsWin32StoragePackagingAppxPackageNameAndPublisherIdFromFamilyName(packagefamilyname.rawAddress.toString(), packagenamelength.rawAddress.toString(), packagename.rawAddress.toString(), packagepublisheridlength.rawAddress.toString(), packagepublisherid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun parseApplicationUserModelId(applicationusermodelid: Pcwstr, packagefamilynamelength: MutPtr, packagefamilyname: Pwstr, packagerelativeapplicationidlength: MutPtr, packagerelativeapplicationid: Pwstr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAddon != null) (windowsWin32StoragePackagingAppxNapiAddon.windowssysWindowsWin32StoragePackagingAppxParseApplicationUserModelId(applicationusermodelid.rawAddress.toString(), packagefamilynamelength.rawAddress.toString(), packagefamilyname.rawAddress.toString(), packagerelativeapplicationidlength.rawAddress.toString(), packagerelativeapplicationid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun releasePackageVirtualizationContext(context: PackageVirtualizationContextHandle) {
    if (windowsWin32StoragePackagingAppxNapiAddon != null) {
        windowsWin32StoragePackagingAppxNapiAddon.windowssysWindowsWin32StoragePackagingAppxReleasePackageVirtualizationContext(context.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun removePackageDependency(packagedependencycontext: PackagedependencyContext): Hresult =
    if (windowsWin32StoragePackagingAppxNapiAddon != null) (windowsWin32StoragePackagingAppxNapiAddon.windowssysWindowsWin32StoragePackagingAppxRemovePackageDependency(packagedependencycontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tryCreatePackageDependency(user: Psid, packagefamilyname: Pcwstr, minversion: PackageVersion, packagedependencyprocessorarchitectures: PackageDependencyProcessorArchitectures, lifetimekind: PackageDependencyLifetimeKind, lifetimeartifact: Pcwstr, options: CreatePackageDependencyOptions, packagedependencyid: MutPtr): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun verifyApplicationUserModelId(applicationusermodelid: Pcwstr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAddon != null) (windowsWin32StoragePackagingAppxNapiAddon.windowssysWindowsWin32StoragePackagingAppxVerifyApplicationUserModelId(applicationusermodelid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun verifyPackageFamilyName(packagefamilyname: Pcwstr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAddon != null) (windowsWin32StoragePackagingAppxNapiAddon.windowssysWindowsWin32StoragePackagingAppxVerifyPackageFamilyName(packagefamilyname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun verifyPackageFullName(packagefullname: Pcwstr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAddon != null) (windowsWin32StoragePackagingAppxNapiAddon.windowssysWindowsWin32StoragePackagingAppxVerifyPackageFullName(packagefullname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun verifyPackageId(packageid: ConstPtr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAddon != null) (windowsWin32StoragePackagingAppxNapiAddon.windowssysWindowsWin32StoragePackagingAppxVerifyPackageId(packageid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun verifyPackageRelativeApplicationId(packagerelativeapplicationid: Pcwstr): Win32Error =
    if (windowsWin32StoragePackagingAppxNapiAddon != null) (windowsWin32StoragePackagingAppxNapiAddon.windowssysWindowsWin32StoragePackagingAppxVerifyPackageRelativeApplicationId(packagerelativeapplicationid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
