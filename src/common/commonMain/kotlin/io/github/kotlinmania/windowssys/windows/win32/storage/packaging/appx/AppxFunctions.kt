package io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error
import io.github.kotlinmania.windowssys.windows.win32.security.Psid

public expect fun activatePackageVirtualizationContext(context: PackageVirtualizationContextHandle, cookie: MutPtr): Hresult

public expect fun addPackageDependency(packagedependencyid: Pcwstr, rank: Int, options: AddPackageDependencyOptions, packagedependencycontext: MutPtr, packagefullname: MutPtr): Hresult

public expect fun appPolicyGetClrCompat(processtoken: Handle, policy: MutPtr): Win32Error

public expect fun appPolicyGetCreateFileAccess(processtoken: Handle, policy: MutPtr): Win32Error

public expect fun appPolicyGetLifecycleManagement(processtoken: Handle, policy: MutPtr): Win32Error

public expect fun appPolicyGetMediaFoundationCodecLoading(processtoken: Handle, policy: MutPtr): Win32Error

public expect fun appPolicyGetProcessTerminationMethod(processtoken: Handle, policy: MutPtr): Win32Error

public expect fun appPolicyGetShowDeveloperDiagnostic(processtoken: Handle, policy: MutPtr): Win32Error

public expect fun appPolicyGetThreadInitializationType(processtoken: Handle, policy: MutPtr): Win32Error

public expect fun appPolicyGetWindowingModel(processtoken: Handle, policy: MutPtr): Win32Error

public expect fun checkIsMSIXPackage(packagefullname: Pcwstr, ismsixpackage: MutPtr): Hresult

public expect fun closePackageInfo(packageinforeference: ConstPtr): Win32Error

public expect fun createPackageVirtualizationContext(packagefamilyname: Pcwstr, context: MutPtr): Hresult

public expect fun deactivatePackageVirtualizationContext(cookie: ULong)

public expect fun deletePackageDependency(packagedependencyid: Pcwstr): Hresult

public expect fun duplicatePackageVirtualizationContext(sourcecontext: PackageVirtualizationContextHandle, destcontext: MutPtr): Hresult

public expect fun findPackagesByPackageFamily(packagefamilyname: Pcwstr, packagefilters: UInt, count: MutPtr, packagefullnames: MutPtr, bufferlength: MutPtr, buffer: Pwstr, packageproperties: MutPtr): Win32Error

public expect fun formatApplicationUserModelId(packagefamilyname: Pcwstr, packagerelativeapplicationid: Pcwstr, applicationusermodelidlength: MutPtr, applicationusermodelid: Pwstr): Win32Error

public expect fun getApplicationUserModelId(hprocess: Handle, applicationusermodelidlength: MutPtr, applicationusermodelid: Pwstr): Win32Error

public expect fun getApplicationUserModelIdFromToken(token: Handle, applicationusermodelidlength: MutPtr, applicationusermodelid: Pwstr): Win32Error

public expect fun getCurrentApplicationUserModelId(applicationusermodelidlength: MutPtr, applicationusermodelid: Pwstr): Win32Error

public expect fun getCurrentPackageFamilyName(packagefamilynamelength: MutPtr, packagefamilyname: Pwstr): Win32Error

public expect fun getCurrentPackageFullName(packagefullnamelength: MutPtr, packagefullname: Pwstr): Win32Error

public expect fun getCurrentPackageId(bufferlength: MutPtr, buffer: MutPtr): Win32Error

public expect fun getCurrentPackageInfo(flags: UInt, bufferlength: MutPtr, buffer: MutPtr, count: MutPtr): Win32Error

public expect fun getCurrentPackageInfo2(flags: UInt, packagepathtype: PackagePathType, bufferlength: MutPtr, buffer: MutPtr, count: MutPtr): Win32Error

public expect fun getCurrentPackageInfo3(flags: UInt, packageinfotype: PackageInfo3Type, bufferlength: MutPtr, buffer: MutPtr, count: MutPtr): Hresult

public expect fun getCurrentPackagePath(pathlength: MutPtr, path: Pwstr): Win32Error

public expect fun getCurrentPackagePath2(packagepathtype: PackagePathType, pathlength: MutPtr, path: Pwstr): Win32Error

public expect fun getCurrentPackageVirtualizationContext(): PackageVirtualizationContextHandle

public expect fun getIdForPackageDependencyContext(packagedependencycontext: PackagedependencyContext, packagedependencyid: MutPtr): Hresult

public expect fun getPackageApplicationIds(packageinforeference: ConstPtr, bufferlength: MutPtr, buffer: MutPtr, count: MutPtr): Win32Error

public expect fun getPackageFamilyName(hprocess: Handle, packagefamilynamelength: MutPtr, packagefamilyname: Pwstr): Win32Error

public expect fun getPackageFamilyNameFromToken(token: Handle, packagefamilynamelength: MutPtr, packagefamilyname: Pwstr): Win32Error

public expect fun getPackageFullName(hprocess: Handle, packagefullnamelength: MutPtr, packagefullname: Pwstr): Win32Error

public expect fun getPackageFullNameFromToken(token: Handle, packagefullnamelength: MutPtr, packagefullname: Pwstr): Win32Error

public expect fun getPackageGraphRevisionId(): UInt

public expect fun getPackageId(hprocess: Handle, bufferlength: MutPtr, buffer: MutPtr): Win32Error

public expect fun getPackageInfo(packageinforeference: ConstPtr, flags: UInt, bufferlength: MutPtr, buffer: MutPtr, count: MutPtr): Win32Error

public expect fun getPackageInfo2(packageinforeference: ConstPtr, flags: UInt, packagepathtype: PackagePathType, bufferlength: MutPtr, buffer: MutPtr, count: MutPtr): Win32Error

public expect fun getPackagePath(packageid: ConstPtr, reserved: UInt, pathlength: MutPtr, path: Pwstr): Win32Error

public expect fun getPackagePathByFullName(packagefullname: Pcwstr, pathlength: MutPtr, path: Pwstr): Win32Error

public expect fun getPackagePathByFullName2(packagefullname: Pcwstr, packagepathtype: PackagePathType, pathlength: MutPtr, path: Pwstr): Win32Error

public expect fun getPackagesByPackageFamily(packagefamilyname: Pcwstr, count: MutPtr, packagefullnames: MutPtr, bufferlength: MutPtr, buffer: Pwstr): Win32Error

public expect fun getProcessesInVirtualizationContext(packagefamilyname: Pcwstr, count: MutPtr, processes: MutPtr): Hresult

public expect fun getResolvedPackageFullNameForPackageDependency(packagedependencyid: Pcwstr, packagefullname: MutPtr): Hresult

public expect fun getStagedPackageOrigin(packagefullname: Pcwstr, origin: MutPtr): Win32Error

public expect fun getStagedPackagePathByFullName(packagefullname: Pcwstr, pathlength: MutPtr, path: Pwstr): Win32Error

public expect fun getStagedPackagePathByFullName2(packagefullname: Pcwstr, packagepathtype: PackagePathType, pathlength: MutPtr, path: Pwstr): Win32Error

public expect fun openPackageInfoByFullName(packagefullname: Pcwstr, reserved: UInt, packageinforeference: MutPtr): Win32Error

public expect fun openPackageInfoByFullNameForUser(usersid: Psid, packagefullname: Pcwstr, reserved: UInt, packageinforeference: MutPtr): Win32Error

public expect fun packageFamilyNameFromFullName(packagefullname: Pcwstr, packagefamilynamelength: MutPtr, packagefamilyname: Pwstr): Win32Error

public expect fun packageFamilyNameFromId(packageid: ConstPtr, packagefamilynamelength: MutPtr, packagefamilyname: Pwstr): Win32Error

public expect fun packageFullNameFromId(packageid: ConstPtr, packagefullnamelength: MutPtr, packagefullname: Pwstr): Win32Error

public expect fun packageIdFromFullName(packagefullname: Pcwstr, flags: UInt, bufferlength: MutPtr, buffer: MutPtr): Win32Error

public expect fun packageNameAndPublisherIdFromFamilyName(packagefamilyname: Pcwstr, packagenamelength: MutPtr, packagename: Pwstr, packagepublisheridlength: MutPtr, packagepublisherid: Pwstr): Win32Error

public expect fun parseApplicationUserModelId(applicationusermodelid: Pcwstr, packagefamilynamelength: MutPtr, packagefamilyname: Pwstr, packagerelativeapplicationidlength: MutPtr, packagerelativeapplicationid: Pwstr): Win32Error

public expect fun releasePackageVirtualizationContext(context: PackageVirtualizationContextHandle)

public expect fun removePackageDependency(packagedependencycontext: PackagedependencyContext): Hresult

public expect fun tryCreatePackageDependency(user: Psid, packagefamilyname: Pcwstr, minversion: PackageVersion, packagedependencyprocessorarchitectures: PackageDependencyProcessorArchitectures, lifetimekind: PackageDependencyLifetimeKind, lifetimeartifact: Pcwstr, options: CreatePackageDependencyOptions, packagedependencyid: MutPtr): Hresult

public expect fun verifyApplicationUserModelId(applicationusermodelid: Pcwstr): Win32Error

public expect fun verifyPackageFamilyName(packagefamilyname: Pcwstr): Win32Error

public expect fun verifyPackageFullName(packagefullname: Pcwstr): Win32Error

public expect fun verifyPackageId(packageid: ConstPtr): Win32Error

public expect fun verifyPackageRelativeApplicationId(packagerelativeapplicationid: Pcwstr): Win32Error
