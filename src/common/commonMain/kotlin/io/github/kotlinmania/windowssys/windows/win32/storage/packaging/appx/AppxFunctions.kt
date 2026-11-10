package io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error
import io.github.kotlinmania.windowssys.windows.win32.security.Psid

public expect fun activatePackageVirtualizationContext(context: PackageVirtualizationContextHandle, cookie: COpaquePointer?): Hresult

public expect fun addPackageDependency(packagedependencyid: Pcwstr, rank: Int, options: AddPackageDependencyOptions, packagedependencycontext: COpaquePointer?, packagefullname: COpaquePointer?): Hresult

public expect fun appPolicyGetClrCompat(processtoken: Handle, policy: COpaquePointer?): Win32Error

public expect fun appPolicyGetCreateFileAccess(processtoken: Handle, policy: COpaquePointer?): Win32Error

public expect fun appPolicyGetLifecycleManagement(processtoken: Handle, policy: COpaquePointer?): Win32Error

public expect fun appPolicyGetMediaFoundationCodecLoading(processtoken: Handle, policy: COpaquePointer?): Win32Error

public expect fun appPolicyGetProcessTerminationMethod(processtoken: Handle, policy: COpaquePointer?): Win32Error

public expect fun appPolicyGetShowDeveloperDiagnostic(processtoken: Handle, policy: COpaquePointer?): Win32Error

public expect fun appPolicyGetThreadInitializationType(processtoken: Handle, policy: COpaquePointer?): Win32Error

public expect fun appPolicyGetWindowingModel(processtoken: Handle, policy: COpaquePointer?): Win32Error

public expect fun checkIsMSIXPackage(packagefullname: Pcwstr, ismsixpackage: COpaquePointer?): Hresult

public expect fun closePackageInfo(packageinforeference: COpaquePointer?): Win32Error

public expect fun createPackageVirtualizationContext(packagefamilyname: Pcwstr, context: COpaquePointer?): Hresult

public expect fun deactivatePackageVirtualizationContext(cookie: ULong)

public expect fun deletePackageDependency(packagedependencyid: Pcwstr): Hresult

public expect fun duplicatePackageVirtualizationContext(sourcecontext: PackageVirtualizationContextHandle, destcontext: COpaquePointer?): Hresult

public expect fun findPackagesByPackageFamily(packagefamilyname: Pcwstr, packagefilters: UInt, count: COpaquePointer?, packagefullnames: COpaquePointer?, bufferlength: COpaquePointer?, buffer: Pwstr, packageproperties: COpaquePointer?): Win32Error

public expect fun formatApplicationUserModelId(packagefamilyname: Pcwstr, packagerelativeapplicationid: Pcwstr, applicationusermodelidlength: COpaquePointer?, applicationusermodelid: Pwstr): Win32Error

public expect fun getApplicationUserModelId(hprocess: Handle, applicationusermodelidlength: COpaquePointer?, applicationusermodelid: Pwstr): Win32Error

public expect fun getApplicationUserModelIdFromToken(token: Handle, applicationusermodelidlength: COpaquePointer?, applicationusermodelid: Pwstr): Win32Error

public expect fun getCurrentApplicationUserModelId(applicationusermodelidlength: COpaquePointer?, applicationusermodelid: Pwstr): Win32Error

public expect fun getCurrentPackageFamilyName(packagefamilynamelength: COpaquePointer?, packagefamilyname: Pwstr): Win32Error

public expect fun getCurrentPackageFullName(packagefullnamelength: COpaquePointer?, packagefullname: Pwstr): Win32Error

public expect fun getCurrentPackageId(bufferlength: COpaquePointer?, buffer: COpaquePointer?): Win32Error

public expect fun getCurrentPackageInfo(flags: UInt, bufferlength: COpaquePointer?, buffer: COpaquePointer?, count: COpaquePointer?): Win32Error

public expect fun getCurrentPackageInfo2(flags: UInt, packagepathtype: PackagePathType, bufferlength: COpaquePointer?, buffer: COpaquePointer?, count: COpaquePointer?): Win32Error

public expect fun getCurrentPackageInfo3(flags: UInt, packageinfotype: PackageInfo3Type, bufferlength: COpaquePointer?, buffer: COpaquePointer?, count: COpaquePointer?): Hresult

public expect fun getCurrentPackagePath(pathlength: COpaquePointer?, path: Pwstr): Win32Error

public expect fun getCurrentPackagePath2(packagepathtype: PackagePathType, pathlength: COpaquePointer?, path: Pwstr): Win32Error

public expect fun getCurrentPackageVirtualizationContext(): PackageVirtualizationContextHandle

public expect fun getIdForPackageDependencyContext(packagedependencycontext: PackagedependencyContext, packagedependencyid: COpaquePointer?): Hresult

public expect fun getPackageApplicationIds(packageinforeference: COpaquePointer?, bufferlength: COpaquePointer?, buffer: COpaquePointer?, count: COpaquePointer?): Win32Error

public expect fun getPackageFamilyName(hprocess: Handle, packagefamilynamelength: COpaquePointer?, packagefamilyname: Pwstr): Win32Error

public expect fun getPackageFamilyNameFromToken(token: Handle, packagefamilynamelength: COpaquePointer?, packagefamilyname: Pwstr): Win32Error

public expect fun getPackageFullName(hprocess: Handle, packagefullnamelength: COpaquePointer?, packagefullname: Pwstr): Win32Error

public expect fun getPackageFullNameFromToken(token: Handle, packagefullnamelength: COpaquePointer?, packagefullname: Pwstr): Win32Error

public expect fun getPackageGraphRevisionId(): UInt

public expect fun getPackageId(hprocess: Handle, bufferlength: COpaquePointer?, buffer: COpaquePointer?): Win32Error

public expect fun getPackageInfo(packageinforeference: COpaquePointer?, flags: UInt, bufferlength: COpaquePointer?, buffer: COpaquePointer?, count: COpaquePointer?): Win32Error

public expect fun getPackageInfo2(packageinforeference: COpaquePointer?, flags: UInt, packagepathtype: PackagePathType, bufferlength: COpaquePointer?, buffer: COpaquePointer?, count: COpaquePointer?): Win32Error

public expect fun getPackagePath(packageid: COpaquePointer?, reserved: UInt, pathlength: COpaquePointer?, path: Pwstr): Win32Error

public expect fun getPackagePathByFullName(packagefullname: Pcwstr, pathlength: COpaquePointer?, path: Pwstr): Win32Error

public expect fun getPackagePathByFullName2(packagefullname: Pcwstr, packagepathtype: PackagePathType, pathlength: COpaquePointer?, path: Pwstr): Win32Error

public expect fun getPackagesByPackageFamily(packagefamilyname: Pcwstr, count: COpaquePointer?, packagefullnames: COpaquePointer?, bufferlength: COpaquePointer?, buffer: Pwstr): Win32Error

public expect fun getProcessesInVirtualizationContext(packagefamilyname: Pcwstr, count: COpaquePointer?, processes: COpaquePointer?): Hresult

public expect fun getResolvedPackageFullNameForPackageDependency(packagedependencyid: Pcwstr, packagefullname: COpaquePointer?): Hresult

public expect fun getStagedPackageOrigin(packagefullname: Pcwstr, origin: COpaquePointer?): Win32Error

public expect fun getStagedPackagePathByFullName(packagefullname: Pcwstr, pathlength: COpaquePointer?, path: Pwstr): Win32Error

public expect fun getStagedPackagePathByFullName2(packagefullname: Pcwstr, packagepathtype: PackagePathType, pathlength: COpaquePointer?, path: Pwstr): Win32Error

public expect fun openPackageInfoByFullName(packagefullname: Pcwstr, reserved: UInt, packageinforeference: COpaquePointer?): Win32Error

public expect fun openPackageInfoByFullNameForUser(usersid: Psid, packagefullname: Pcwstr, reserved: UInt, packageinforeference: COpaquePointer?): Win32Error

public expect fun packageFamilyNameFromFullName(packagefullname: Pcwstr, packagefamilynamelength: COpaquePointer?, packagefamilyname: Pwstr): Win32Error

public expect fun packageFamilyNameFromId(packageid: COpaquePointer?, packagefamilynamelength: COpaquePointer?, packagefamilyname: Pwstr): Win32Error

public expect fun packageFullNameFromId(packageid: COpaquePointer?, packagefullnamelength: COpaquePointer?, packagefullname: Pwstr): Win32Error

public expect fun packageIdFromFullName(packagefullname: Pcwstr, flags: UInt, bufferlength: COpaquePointer?, buffer: COpaquePointer?): Win32Error

public expect fun packageNameAndPublisherIdFromFamilyName(packagefamilyname: Pcwstr, packagenamelength: COpaquePointer?, packagename: Pwstr, packagepublisheridlength: COpaquePointer?, packagepublisherid: Pwstr): Win32Error

public expect fun parseApplicationUserModelId(applicationusermodelid: Pcwstr, packagefamilynamelength: COpaquePointer?, packagefamilyname: Pwstr, packagerelativeapplicationidlength: COpaquePointer?, packagerelativeapplicationid: Pwstr): Win32Error

public expect fun releasePackageVirtualizationContext(context: PackageVirtualizationContextHandle)

public expect fun removePackageDependency(packagedependencycontext: PackagedependencyContext): Hresult

public expect fun tryCreatePackageDependency(user: Psid, packagefamilyname: Pcwstr, minversion: PackageVersion, packagedependencyprocessorarchitectures: PackageDependencyProcessorArchitectures, lifetimekind: PackageDependencyLifetimeKind, lifetimeartifact: Pcwstr, options: CreatePackageDependencyOptions, packagedependencyid: COpaquePointer?): Hresult

public expect fun verifyApplicationUserModelId(applicationusermodelid: Pcwstr): Win32Error

public expect fun verifyPackageFamilyName(packagefamilyname: Pcwstr): Win32Error

public expect fun verifyPackageFullName(packagefullname: Pcwstr): Win32Error

public expect fun verifyPackageId(packageid: COpaquePointer?): Win32Error

public expect fun verifyPackageRelativeApplicationId(packagerelativeapplicationid: Pcwstr): Win32Error
