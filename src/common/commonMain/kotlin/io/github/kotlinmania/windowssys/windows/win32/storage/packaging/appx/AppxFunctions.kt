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

public expect fun activatePackageVirtualizationContext(context: PackageVirtualizationContextHandle, cookie: MutPtr<ULong>): Hresult

public expect fun addPackageDependency(packagedependencyid: Pcwstr, rank: Int, options: AddPackageDependencyOptions, packagedependencycontext: MutPtr<PackagedependencyContext>, packagefullname: MutPtr<Pwstr>): Hresult

public expect fun appPolicyGetClrCompat(processtoken: Handle, policy: MutPtr<AppPolicyClrCompat>): Win32Error

public expect fun appPolicyGetCreateFileAccess(processtoken: Handle, policy: MutPtr<AppPolicyCreateFileAccess>): Win32Error

public expect fun appPolicyGetLifecycleManagement(processtoken: Handle, policy: MutPtr<AppPolicyLifecycleManagement>): Win32Error

public expect fun appPolicyGetMediaFoundationCodecLoading(processtoken: Handle, policy: MutPtr<AppPolicyMediaFoundationCodecLoading>): Win32Error

public expect fun appPolicyGetProcessTerminationMethod(processtoken: Handle, policy: MutPtr<AppPolicyProcessTerminationMethod>): Win32Error

public expect fun appPolicyGetShowDeveloperDiagnostic(processtoken: Handle, policy: MutPtr<AppPolicyShowDeveloperDiagnostic>): Win32Error

public expect fun appPolicyGetThreadInitializationType(processtoken: Handle, policy: MutPtr<AppPolicyThreadInitializationType>): Win32Error

public expect fun appPolicyGetWindowingModel(processtoken: Handle, policy: MutPtr<AppPolicyWindowingModel>): Win32Error

public expect fun checkIsMSIXPackage(packagefullname: Pcwstr, ismsixpackage: MutPtr<Bool>): Hresult

public expect fun closePackageInfo(packageinforeference: ConstPtr<PackageInfoReference>): Win32Error

public expect fun createPackageVirtualizationContext(packagefamilyname: Pcwstr, context: MutPtr<PackageVirtualizationContextHandle>): Hresult

public expect fun deactivatePackageVirtualizationContext(cookie: ULong)

public expect fun deletePackageDependency(packagedependencyid: Pcwstr): Hresult

public expect fun duplicatePackageVirtualizationContext(sourcecontext: PackageVirtualizationContextHandle, destcontext: MutPtr<PackageVirtualizationContextHandle>): Hresult

public expect fun findPackagesByPackageFamily(packagefamilyname: Pcwstr, packagefilters: UInt, count: MutPtr<UInt>, packagefullnames: MutPtr<Pwstr>, bufferlength: MutPtr<UInt>, buffer: Pwstr, packageproperties: MutPtr<UInt>): Win32Error

public expect fun formatApplicationUserModelId(packagefamilyname: Pcwstr, packagerelativeapplicationid: Pcwstr, applicationusermodelidlength: MutPtr<UInt>, applicationusermodelid: Pwstr): Win32Error

public expect fun getApplicationUserModelId(hprocess: Handle, applicationusermodelidlength: MutPtr<UInt>, applicationusermodelid: Pwstr): Win32Error

public expect fun getApplicationUserModelIdFromToken(token: Handle, applicationusermodelidlength: MutPtr<UInt>, applicationusermodelid: Pwstr): Win32Error

public expect fun getCurrentApplicationUserModelId(applicationusermodelidlength: MutPtr<UInt>, applicationusermodelid: Pwstr): Win32Error

public expect fun getCurrentPackageFamilyName(packagefamilynamelength: MutPtr<UInt>, packagefamilyname: Pwstr): Win32Error

public expect fun getCurrentPackageFullName(packagefullnamelength: MutPtr<UInt>, packagefullname: Pwstr): Win32Error

public expect fun getCurrentPackageId(bufferlength: MutPtr<UInt>, buffer: MutPtr<UByte>): Win32Error

public expect fun getCurrentPackageInfo(flags: UInt, bufferlength: MutPtr<UInt>, buffer: MutPtr<UByte>, count: MutPtr<UInt>): Win32Error

public expect fun getCurrentPackageInfo2(flags: UInt, packagepathtype: PackagePathType, bufferlength: MutPtr<UInt>, buffer: MutPtr<UByte>, count: MutPtr<UInt>): Win32Error

public expect fun getCurrentPackageInfo3(flags: UInt, packageinfotype: PackageInfo3Type, bufferlength: MutPtr<UInt>, buffer: MutPtr<CVoid>, count: MutPtr<UInt>): Hresult

public expect fun getCurrentPackagePath(pathlength: MutPtr<UInt>, path: Pwstr): Win32Error

public expect fun getCurrentPackagePath2(packagepathtype: PackagePathType, pathlength: MutPtr<UInt>, path: Pwstr): Win32Error

public expect fun getCurrentPackageVirtualizationContext(): PackageVirtualizationContextHandle

public expect fun getIdForPackageDependencyContext(packagedependencycontext: PackagedependencyContext, packagedependencyid: MutPtr<Pwstr>): Hresult

public expect fun getPackageApplicationIds(packageinforeference: ConstPtr<PackageInfoReference>, bufferlength: MutPtr<UInt>, buffer: MutPtr<UByte>, count: MutPtr<UInt>): Win32Error

public expect fun getPackageFamilyName(hprocess: Handle, packagefamilynamelength: MutPtr<UInt>, packagefamilyname: Pwstr): Win32Error

public expect fun getPackageFamilyNameFromToken(token: Handle, packagefamilynamelength: MutPtr<UInt>, packagefamilyname: Pwstr): Win32Error

public expect fun getPackageFullName(hprocess: Handle, packagefullnamelength: MutPtr<UInt>, packagefullname: Pwstr): Win32Error

public expect fun getPackageFullNameFromToken(token: Handle, packagefullnamelength: MutPtr<UInt>, packagefullname: Pwstr): Win32Error

public expect fun getPackageGraphRevisionId(): UInt

public expect fun getPackageId(hprocess: Handle, bufferlength: MutPtr<UInt>, buffer: MutPtr<UByte>): Win32Error

public expect fun getPackageInfo(packageinforeference: ConstPtr<PackageInfoReference>, flags: UInt, bufferlength: MutPtr<UInt>, buffer: MutPtr<UByte>, count: MutPtr<UInt>): Win32Error

public expect fun getPackageInfo2(packageinforeference: ConstPtr<PackageInfoReference>, flags: UInt, packagepathtype: PackagePathType, bufferlength: MutPtr<UInt>, buffer: MutPtr<UByte>, count: MutPtr<UInt>): Win32Error

public expect fun getPackagePath(packageid: ConstPtr<PackageId>, reserved: UInt, pathlength: MutPtr<UInt>, path: Pwstr): Win32Error

public expect fun getPackagePathByFullName(packagefullname: Pcwstr, pathlength: MutPtr<UInt>, path: Pwstr): Win32Error

public expect fun getPackagePathByFullName2(packagefullname: Pcwstr, packagepathtype: PackagePathType, pathlength: MutPtr<UInt>, path: Pwstr): Win32Error

public expect fun getPackagesByPackageFamily(packagefamilyname: Pcwstr, count: MutPtr<UInt>, packagefullnames: MutPtr<Pwstr>, bufferlength: MutPtr<UInt>, buffer: Pwstr): Win32Error

public expect fun getProcessesInVirtualizationContext(packagefamilyname: Pcwstr, count: MutPtr<UInt>, processes: MutPtr<MutPtr<Handle>>): Hresult

public expect fun getResolvedPackageFullNameForPackageDependency(packagedependencyid: Pcwstr, packagefullname: MutPtr<Pwstr>): Hresult

public expect fun getStagedPackageOrigin(packagefullname: Pcwstr, origin: MutPtr<PackageOrigin>): Win32Error

public expect fun getStagedPackagePathByFullName(packagefullname: Pcwstr, pathlength: MutPtr<UInt>, path: Pwstr): Win32Error

public expect fun getStagedPackagePathByFullName2(packagefullname: Pcwstr, packagepathtype: PackagePathType, pathlength: MutPtr<UInt>, path: Pwstr): Win32Error

public expect fun openPackageInfoByFullName(packagefullname: Pcwstr, reserved: UInt, packageinforeference: MutPtr<MutPtr<PackageInfoReference>>): Win32Error

public expect fun openPackageInfoByFullNameForUser(usersid: Psid, packagefullname: Pcwstr, reserved: UInt, packageinforeference: MutPtr<MutPtr<PackageInfoReference>>): Win32Error

public expect fun packageFamilyNameFromFullName(packagefullname: Pcwstr, packagefamilynamelength: MutPtr<UInt>, packagefamilyname: Pwstr): Win32Error

public expect fun packageFamilyNameFromId(packageid: ConstPtr<PackageId>, packagefamilynamelength: MutPtr<UInt>, packagefamilyname: Pwstr): Win32Error

public expect fun packageFullNameFromId(packageid: ConstPtr<PackageId>, packagefullnamelength: MutPtr<UInt>, packagefullname: Pwstr): Win32Error

public expect fun packageIdFromFullName(packagefullname: Pcwstr, flags: UInt, bufferlength: MutPtr<UInt>, buffer: MutPtr<UByte>): Win32Error

public expect fun packageNameAndPublisherIdFromFamilyName(packagefamilyname: Pcwstr, packagenamelength: MutPtr<UInt>, packagename: Pwstr, packagepublisheridlength: MutPtr<UInt>, packagepublisherid: Pwstr): Win32Error

public expect fun parseApplicationUserModelId(applicationusermodelid: Pcwstr, packagefamilynamelength: MutPtr<UInt>, packagefamilyname: Pwstr, packagerelativeapplicationidlength: MutPtr<UInt>, packagerelativeapplicationid: Pwstr): Win32Error

public expect fun releasePackageVirtualizationContext(context: PackageVirtualizationContextHandle)

public expect fun removePackageDependency(packagedependencycontext: PackagedependencyContext): Hresult

public expect fun tryCreatePackageDependency(user: Psid, packagefamilyname: Pcwstr, minversion: PackageVersion, packagedependencyprocessorarchitectures: PackageDependencyProcessorArchitectures, lifetimekind: PackageDependencyLifetimeKind, lifetimeartifact: Pcwstr, options: CreatePackageDependencyOptions, packagedependencyid: MutPtr<Pwstr>): Hresult

public expect fun verifyApplicationUserModelId(applicationusermodelid: Pcwstr): Win32Error

public expect fun verifyPackageFamilyName(packagefamilyname: Pcwstr): Win32Error

public expect fun verifyPackageFullName(packagefullname: Pcwstr): Win32Error

public expect fun verifyPackageId(packageid: ConstPtr<PackageId>): Win32Error

public expect fun verifyPackageRelativeApplicationId(packagerelativeapplicationid: Pcwstr): Win32Error
