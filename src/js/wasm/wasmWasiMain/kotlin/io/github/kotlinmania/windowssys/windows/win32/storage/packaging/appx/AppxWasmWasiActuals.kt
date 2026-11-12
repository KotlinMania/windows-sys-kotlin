@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

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

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun activatePackageVirtualizationContext(context: PackageVirtualizationContextHandle, cookie: MutPtr<ULong>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StoragePackagingAppxActivatePackageVirtualizationContext")

public actual fun addPackageDependency(packagedependencyid: Pcwstr, rank: Int, options: AddPackageDependencyOptions, packagedependencycontext: MutPtr<PackagedependencyContext>, packagefullname: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StoragePackagingAppxAddPackageDependency")

public actual fun appPolicyGetClrCompat(processtoken: Handle, policy: MutPtr<AppPolicyClrCompat>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StoragePackagingAppxAppPolicyGetClrCompat")

public actual fun appPolicyGetCreateFileAccess(processtoken: Handle, policy: MutPtr<AppPolicyCreateFileAccess>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StoragePackagingAppxAppPolicyGetCreateFileAccess")

public actual fun appPolicyGetLifecycleManagement(processtoken: Handle, policy: MutPtr<AppPolicyLifecycleManagement>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StoragePackagingAppxAppPolicyGetLifecycleManagement")

public actual fun appPolicyGetMediaFoundationCodecLoading(processtoken: Handle, policy: MutPtr<AppPolicyMediaFoundationCodecLoading>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StoragePackagingAppxAppPolicyGetMediaFoundationCodecLoading")

public actual fun appPolicyGetProcessTerminationMethod(processtoken: Handle, policy: MutPtr<AppPolicyProcessTerminationMethod>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StoragePackagingAppxAppPolicyGetProcessTerminationMethod")

public actual fun appPolicyGetShowDeveloperDiagnostic(processtoken: Handle, policy: MutPtr<AppPolicyShowDeveloperDiagnostic>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StoragePackagingAppxAppPolicyGetShowDeveloperDiagnostic")

public actual fun appPolicyGetThreadInitializationType(processtoken: Handle, policy: MutPtr<AppPolicyThreadInitializationType>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StoragePackagingAppxAppPolicyGetThreadInitializationType")

public actual fun appPolicyGetWindowingModel(processtoken: Handle, policy: MutPtr<AppPolicyWindowingModel>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StoragePackagingAppxAppPolicyGetWindowingModel")

public actual fun checkIsMSIXPackage(packagefullname: Pcwstr, ismsixpackage: MutPtr<Bool>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StoragePackagingAppxCheckIsMSIXPackage")

public actual fun closePackageInfo(packageinforeference: ConstPtr<PackageInfoReference>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StoragePackagingAppxClosePackageInfo")

public actual fun createPackageVirtualizationContext(packagefamilyname: Pcwstr, context: MutPtr<PackageVirtualizationContextHandle>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StoragePackagingAppxCreatePackageVirtualizationContext")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StoragePackagingAppxDeactivatePackageVirtualizationContext")
private external fun wasiWindowssysWindowsWin32StoragePackagingAppxDeactivatePackageVirtualizationContext(cookie: Long): Unit

public actual fun deactivatePackageVirtualizationContext(cookie: ULong): Unit =
    wasiWindowssysWindowsWin32StoragePackagingAppxDeactivatePackageVirtualizationContext(cookie.toLong())

public actual fun deletePackageDependency(packagedependencyid: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StoragePackagingAppxDeletePackageDependency")

public actual fun duplicatePackageVirtualizationContext(sourcecontext: PackageVirtualizationContextHandle, destcontext: MutPtr<PackageVirtualizationContextHandle>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StoragePackagingAppxDuplicatePackageVirtualizationContext")

public actual fun findPackagesByPackageFamily(packagefamilyname: Pcwstr, packagefilters: UInt, count: MutPtr<UInt>, packagefullnames: MutPtr<Pwstr>, bufferlength: MutPtr<UInt>, buffer: Pwstr, packageproperties: MutPtr<UInt>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StoragePackagingAppxFindPackagesByPackageFamily")

public actual fun formatApplicationUserModelId(packagefamilyname: Pcwstr, packagerelativeapplicationid: Pcwstr, applicationusermodelidlength: MutPtr<UInt>, applicationusermodelid: Pwstr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StoragePackagingAppxFormatApplicationUserModelId")

public actual fun getApplicationUserModelId(hprocess: Handle, applicationusermodelidlength: MutPtr<UInt>, applicationusermodelid: Pwstr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StoragePackagingAppxGetApplicationUserModelId")

public actual fun getApplicationUserModelIdFromToken(token: Handle, applicationusermodelidlength: MutPtr<UInt>, applicationusermodelid: Pwstr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StoragePackagingAppxGetApplicationUserModelIdFromToken")

public actual fun getCurrentApplicationUserModelId(applicationusermodelidlength: MutPtr<UInt>, applicationusermodelid: Pwstr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StoragePackagingAppxGetCurrentApplicationUserModelId")

public actual fun getCurrentPackageFamilyName(packagefamilynamelength: MutPtr<UInt>, packagefamilyname: Pwstr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StoragePackagingAppxGetCurrentPackageFamilyName")

public actual fun getCurrentPackageFullName(packagefullnamelength: MutPtr<UInt>, packagefullname: Pwstr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StoragePackagingAppxGetCurrentPackageFullName")

public actual fun getCurrentPackageId(bufferlength: MutPtr<UInt>, buffer: MutPtr<UByte>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StoragePackagingAppxGetCurrentPackageId")

public actual fun getCurrentPackageInfo(flags: UInt, bufferlength: MutPtr<UInt>, buffer: MutPtr<UByte>, count: MutPtr<UInt>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StoragePackagingAppxGetCurrentPackageInfo")

public actual fun getCurrentPackageInfo2(flags: UInt, packagepathtype: PackagePathType, bufferlength: MutPtr<UInt>, buffer: MutPtr<UByte>, count: MutPtr<UInt>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StoragePackagingAppxGetCurrentPackageInfo2")

public actual fun getCurrentPackageInfo3(flags: UInt, packageinfotype: PackageInfo3Type, bufferlength: MutPtr<UInt>, buffer: MutPtr<CVoid>, count: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StoragePackagingAppxGetCurrentPackageInfo3")

public actual fun getCurrentPackagePath(pathlength: MutPtr<UInt>, path: Pwstr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StoragePackagingAppxGetCurrentPackagePath")

public actual fun getCurrentPackagePath2(packagepathtype: PackagePathType, pathlength: MutPtr<UInt>, path: Pwstr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StoragePackagingAppxGetCurrentPackagePath2")

public actual fun getCurrentPackageVirtualizationContext(): PackageVirtualizationContextHandle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StoragePackagingAppxGetCurrentPackageVirtualizationContext")

public actual fun getIdForPackageDependencyContext(packagedependencycontext: PackagedependencyContext, packagedependencyid: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StoragePackagingAppxGetIdForPackageDependencyContext")

public actual fun getPackageApplicationIds(packageinforeference: ConstPtr<PackageInfoReference>, bufferlength: MutPtr<UInt>, buffer: MutPtr<UByte>, count: MutPtr<UInt>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StoragePackagingAppxGetPackageApplicationIds")

public actual fun getPackageFamilyName(hprocess: Handle, packagefamilynamelength: MutPtr<UInt>, packagefamilyname: Pwstr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StoragePackagingAppxGetPackageFamilyName")

public actual fun getPackageFamilyNameFromToken(token: Handle, packagefamilynamelength: MutPtr<UInt>, packagefamilyname: Pwstr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StoragePackagingAppxGetPackageFamilyNameFromToken")

public actual fun getPackageFullName(hprocess: Handle, packagefullnamelength: MutPtr<UInt>, packagefullname: Pwstr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StoragePackagingAppxGetPackageFullName")

public actual fun getPackageFullNameFromToken(token: Handle, packagefullnamelength: MutPtr<UInt>, packagefullname: Pwstr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StoragePackagingAppxGetPackageFullNameFromToken")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StoragePackagingAppxGetPackageGraphRevisionId")
private external fun wasiWindowssysWindowsWin32StoragePackagingAppxGetPackageGraphRevisionId(): Int

public actual fun getPackageGraphRevisionId(): UInt =
    wasiWindowssysWindowsWin32StoragePackagingAppxGetPackageGraphRevisionId().toUInt()

public actual fun getPackageId(hprocess: Handle, bufferlength: MutPtr<UInt>, buffer: MutPtr<UByte>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StoragePackagingAppxGetPackageId")

public actual fun getPackageInfo(packageinforeference: ConstPtr<PackageInfoReference>, flags: UInt, bufferlength: MutPtr<UInt>, buffer: MutPtr<UByte>, count: MutPtr<UInt>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StoragePackagingAppxGetPackageInfo")

public actual fun getPackageInfo2(packageinforeference: ConstPtr<PackageInfoReference>, flags: UInt, packagepathtype: PackagePathType, bufferlength: MutPtr<UInt>, buffer: MutPtr<UByte>, count: MutPtr<UInt>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StoragePackagingAppxGetPackageInfo2")

public actual fun getPackagePath(packageid: ConstPtr<PackageId>, reserved: UInt, pathlength: MutPtr<UInt>, path: Pwstr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StoragePackagingAppxGetPackagePath")

public actual fun getPackagePathByFullName(packagefullname: Pcwstr, pathlength: MutPtr<UInt>, path: Pwstr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StoragePackagingAppxGetPackagePathByFullName")

public actual fun getPackagePathByFullName2(packagefullname: Pcwstr, packagepathtype: PackagePathType, pathlength: MutPtr<UInt>, path: Pwstr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StoragePackagingAppxGetPackagePathByFullName2")

public actual fun getPackagesByPackageFamily(packagefamilyname: Pcwstr, count: MutPtr<UInt>, packagefullnames: MutPtr<Pwstr>, bufferlength: MutPtr<UInt>, buffer: Pwstr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StoragePackagingAppxGetPackagesByPackageFamily")

public actual fun getProcessesInVirtualizationContext(packagefamilyname: Pcwstr, count: MutPtr<UInt>, processes: MutPtr<MutPtr<Handle>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StoragePackagingAppxGetProcessesInVirtualizationContext")

public actual fun getResolvedPackageFullNameForPackageDependency(packagedependencyid: Pcwstr, packagefullname: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StoragePackagingAppxGetResolvedPackageFullNameForPackageDependency")

public actual fun getStagedPackageOrigin(packagefullname: Pcwstr, origin: MutPtr<PackageOrigin>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StoragePackagingAppxGetStagedPackageOrigin")

public actual fun getStagedPackagePathByFullName(packagefullname: Pcwstr, pathlength: MutPtr<UInt>, path: Pwstr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StoragePackagingAppxGetStagedPackagePathByFullName")

public actual fun getStagedPackagePathByFullName2(packagefullname: Pcwstr, packagepathtype: PackagePathType, pathlength: MutPtr<UInt>, path: Pwstr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StoragePackagingAppxGetStagedPackagePathByFullName2")

public actual fun openPackageInfoByFullName(packagefullname: Pcwstr, reserved: UInt, packageinforeference: MutPtr<MutPtr<PackageInfoReference>>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StoragePackagingAppxOpenPackageInfoByFullName")

public actual fun openPackageInfoByFullNameForUser(usersid: Psid, packagefullname: Pcwstr, reserved: UInt, packageinforeference: MutPtr<MutPtr<PackageInfoReference>>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StoragePackagingAppxOpenPackageInfoByFullNameForUser")

public actual fun packageFamilyNameFromFullName(packagefullname: Pcwstr, packagefamilynamelength: MutPtr<UInt>, packagefamilyname: Pwstr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StoragePackagingAppxPackageFamilyNameFromFullName")

public actual fun packageFamilyNameFromId(packageid: ConstPtr<PackageId>, packagefamilynamelength: MutPtr<UInt>, packagefamilyname: Pwstr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StoragePackagingAppxPackageFamilyNameFromId")

public actual fun packageFullNameFromId(packageid: ConstPtr<PackageId>, packagefullnamelength: MutPtr<UInt>, packagefullname: Pwstr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StoragePackagingAppxPackageFullNameFromId")

public actual fun packageIdFromFullName(packagefullname: Pcwstr, flags: UInt, bufferlength: MutPtr<UInt>, buffer: MutPtr<UByte>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StoragePackagingAppxPackageIdFromFullName")

public actual fun packageNameAndPublisherIdFromFamilyName(packagefamilyname: Pcwstr, packagenamelength: MutPtr<UInt>, packagename: Pwstr, packagepublisheridlength: MutPtr<UInt>, packagepublisherid: Pwstr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StoragePackagingAppxPackageNameAndPublisherIdFromFamilyName")

public actual fun parseApplicationUserModelId(applicationusermodelid: Pcwstr, packagefamilynamelength: MutPtr<UInt>, packagefamilyname: Pwstr, packagerelativeapplicationidlength: MutPtr<UInt>, packagerelativeapplicationid: Pwstr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StoragePackagingAppxParseApplicationUserModelId")

public actual fun releasePackageVirtualizationContext(context: PackageVirtualizationContextHandle): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StoragePackagingAppxReleasePackageVirtualizationContext")

public actual fun removePackageDependency(packagedependencycontext: PackagedependencyContext): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StoragePackagingAppxRemovePackageDependency")

public actual fun tryCreatePackageDependency(user: Psid, packagefamilyname: Pcwstr, minversion: PackageVersion, packagedependencyprocessorarchitectures: PackageDependencyProcessorArchitectures, lifetimekind: PackageDependencyLifetimeKind, lifetimeartifact: Pcwstr, options: CreatePackageDependencyOptions, packagedependencyid: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StoragePackagingAppxTryCreatePackageDependency")

public actual fun verifyApplicationUserModelId(applicationusermodelid: Pcwstr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StoragePackagingAppxVerifyApplicationUserModelId")

public actual fun verifyPackageFamilyName(packagefamilyname: Pcwstr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StoragePackagingAppxVerifyPackageFamilyName")

public actual fun verifyPackageFullName(packagefullname: Pcwstr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StoragePackagingAppxVerifyPackageFullName")

public actual fun verifyPackageId(packageid: ConstPtr<PackageId>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StoragePackagingAppxVerifyPackageId")

public actual fun verifyPackageRelativeApplicationId(packagerelativeapplicationid: Pcwstr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StoragePackagingAppxVerifyPackageRelativeApplicationId")
