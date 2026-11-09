package io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.WIN32_ERROR
import io.github.kotlinmania.windowssys.windows.win32.security.PSID

public expect fun ActivatePackageVirtualizationContext(context: PACKAGE_VIRTUALIZATION_CONTEXT_HANDLE, cookie: Long): HRESULT

public expect fun AddPackageDependency(packagedependencyid: PCWSTR, rank: Int, options: AddPackageDependencyOptions, packagedependencycontext: Long, packagefullname: Long): HRESULT

public expect fun AppPolicyGetClrCompat(processtoken: HANDLE, policy: Long): WIN32_ERROR

public expect fun AppPolicyGetCreateFileAccess(processtoken: HANDLE, policy: Long): WIN32_ERROR

public expect fun AppPolicyGetLifecycleManagement(processtoken: HANDLE, policy: Long): WIN32_ERROR

public expect fun AppPolicyGetMediaFoundationCodecLoading(processtoken: HANDLE, policy: Long): WIN32_ERROR

public expect fun AppPolicyGetProcessTerminationMethod(processtoken: HANDLE, policy: Long): WIN32_ERROR

public expect fun AppPolicyGetShowDeveloperDiagnostic(processtoken: HANDLE, policy: Long): WIN32_ERROR

public expect fun AppPolicyGetThreadInitializationType(processtoken: HANDLE, policy: Long): WIN32_ERROR

public expect fun AppPolicyGetWindowingModel(processtoken: HANDLE, policy: Long): WIN32_ERROR

public expect fun CheckIsMSIXPackage(packagefullname: PCWSTR, ismsixpackage: Long): HRESULT

public expect fun ClosePackageInfo(packageinforeference: Long): WIN32_ERROR

public expect fun CreatePackageVirtualizationContext(packagefamilyname: PCWSTR, context: Long): HRESULT

public expect fun DeactivatePackageVirtualizationContext(cookie: ULong)

public expect fun DeletePackageDependency(packagedependencyid: PCWSTR): HRESULT

public expect fun DuplicatePackageVirtualizationContext(sourcecontext: PACKAGE_VIRTUALIZATION_CONTEXT_HANDLE, destcontext: Long): HRESULT

public expect fun FindPackagesByPackageFamily(packagefamilyname: PCWSTR, packagefilters: UInt, count: Long, packagefullnames: Long, bufferlength: Long, buffer: PWSTR, packageproperties: Long): WIN32_ERROR

public expect fun FormatApplicationUserModelId(packagefamilyname: PCWSTR, packagerelativeapplicationid: PCWSTR, applicationusermodelidlength: Long, applicationusermodelid: PWSTR): WIN32_ERROR

public expect fun GetApplicationUserModelId(hprocess: HANDLE, applicationusermodelidlength: Long, applicationusermodelid: PWSTR): WIN32_ERROR

public expect fun GetApplicationUserModelIdFromToken(token: HANDLE, applicationusermodelidlength: Long, applicationusermodelid: PWSTR): WIN32_ERROR

public expect fun GetCurrentApplicationUserModelId(applicationusermodelidlength: Long, applicationusermodelid: PWSTR): WIN32_ERROR

public expect fun GetCurrentPackageFamilyName(packagefamilynamelength: Long, packagefamilyname: PWSTR): WIN32_ERROR

public expect fun GetCurrentPackageFullName(packagefullnamelength: Long, packagefullname: PWSTR): WIN32_ERROR

public expect fun GetCurrentPackageId(bufferlength: Long, buffer: Long): WIN32_ERROR

public expect fun GetCurrentPackageInfo(flags: UInt, bufferlength: Long, buffer: Long, count: Long): WIN32_ERROR

public expect fun GetCurrentPackageInfo2(flags: UInt, packagepathtype: PackagePathType, bufferlength: Long, buffer: Long, count: Long): WIN32_ERROR

public expect fun GetCurrentPackageInfo3(flags: UInt, packageinfotype: PackageInfo3Type, bufferlength: Long, buffer: Long, count: Long): HRESULT

public expect fun GetCurrentPackagePath(pathlength: Long, path: PWSTR): WIN32_ERROR

public expect fun GetCurrentPackagePath2(packagepathtype: PackagePathType, pathlength: Long, path: PWSTR): WIN32_ERROR

public expect fun GetCurrentPackageVirtualizationContext(): PACKAGE_VIRTUALIZATION_CONTEXT_HANDLE

public expect fun GetIdForPackageDependencyContext(packagedependencycontext: PACKAGEDEPENDENCY_CONTEXT, packagedependencyid: Long): HRESULT

public expect fun GetPackageApplicationIds(packageinforeference: Long, bufferlength: Long, buffer: Long, count: Long): WIN32_ERROR

public expect fun GetPackageFamilyName(hprocess: HANDLE, packagefamilynamelength: Long, packagefamilyname: PWSTR): WIN32_ERROR

public expect fun GetPackageFamilyNameFromToken(token: HANDLE, packagefamilynamelength: Long, packagefamilyname: PWSTR): WIN32_ERROR

public expect fun GetPackageFullName(hprocess: HANDLE, packagefullnamelength: Long, packagefullname: PWSTR): WIN32_ERROR

public expect fun GetPackageFullNameFromToken(token: HANDLE, packagefullnamelength: Long, packagefullname: PWSTR): WIN32_ERROR

public expect fun GetPackageGraphRevisionId(): UInt

public expect fun GetPackageId(hprocess: HANDLE, bufferlength: Long, buffer: Long): WIN32_ERROR

public expect fun GetPackageInfo(packageinforeference: Long, flags: UInt, bufferlength: Long, buffer: Long, count: Long): WIN32_ERROR

public expect fun GetPackageInfo2(packageinforeference: Long, flags: UInt, packagepathtype: PackagePathType, bufferlength: Long, buffer: Long, count: Long): WIN32_ERROR

public expect fun GetPackagePath(packageid: Long, reserved: UInt, pathlength: Long, path: PWSTR): WIN32_ERROR

public expect fun GetPackagePathByFullName(packagefullname: PCWSTR, pathlength: Long, path: PWSTR): WIN32_ERROR

public expect fun GetPackagePathByFullName2(packagefullname: PCWSTR, packagepathtype: PackagePathType, pathlength: Long, path: PWSTR): WIN32_ERROR

public expect fun GetPackagesByPackageFamily(packagefamilyname: PCWSTR, count: Long, packagefullnames: Long, bufferlength: Long, buffer: PWSTR): WIN32_ERROR

public expect fun GetProcessesInVirtualizationContext(packagefamilyname: PCWSTR, count: Long, processes: Long): HRESULT

public expect fun GetResolvedPackageFullNameForPackageDependency(packagedependencyid: PCWSTR, packagefullname: Long): HRESULT

public expect fun GetStagedPackageOrigin(packagefullname: PCWSTR, origin: Long): WIN32_ERROR

public expect fun GetStagedPackagePathByFullName(packagefullname: PCWSTR, pathlength: Long, path: PWSTR): WIN32_ERROR

public expect fun GetStagedPackagePathByFullName2(packagefullname: PCWSTR, packagepathtype: PackagePathType, pathlength: Long, path: PWSTR): WIN32_ERROR

public expect fun OpenPackageInfoByFullName(packagefullname: PCWSTR, reserved: UInt, packageinforeference: Long): WIN32_ERROR

public expect fun OpenPackageInfoByFullNameForUser(usersid: PSID, packagefullname: PCWSTR, reserved: UInt, packageinforeference: Long): WIN32_ERROR

public expect fun PackageFamilyNameFromFullName(packagefullname: PCWSTR, packagefamilynamelength: Long, packagefamilyname: PWSTR): WIN32_ERROR

public expect fun PackageFamilyNameFromId(packageid: Long, packagefamilynamelength: Long, packagefamilyname: PWSTR): WIN32_ERROR

public expect fun PackageFullNameFromId(packageid: Long, packagefullnamelength: Long, packagefullname: PWSTR): WIN32_ERROR

public expect fun PackageIdFromFullName(packagefullname: PCWSTR, flags: UInt, bufferlength: Long, buffer: Long): WIN32_ERROR

public expect fun PackageNameAndPublisherIdFromFamilyName(packagefamilyname: PCWSTR, packagenamelength: Long, packagename: PWSTR, packagepublisheridlength: Long, packagepublisherid: PWSTR): WIN32_ERROR

public expect fun ParseApplicationUserModelId(applicationusermodelid: PCWSTR, packagefamilynamelength: Long, packagefamilyname: PWSTR, packagerelativeapplicationidlength: Long, packagerelativeapplicationid: PWSTR): WIN32_ERROR

public expect fun ReleasePackageVirtualizationContext(context: PACKAGE_VIRTUALIZATION_CONTEXT_HANDLE)

public expect fun RemovePackageDependency(packagedependencycontext: PACKAGEDEPENDENCY_CONTEXT): HRESULT

public expect fun TryCreatePackageDependency(user: PSID, packagefamilyname: PCWSTR, minversion: PACKAGE_VERSION, packagedependencyprocessorarchitectures: PackageDependencyProcessorArchitectures, lifetimekind: PackageDependencyLifetimeKind, lifetimeartifact: PCWSTR, options: CreatePackageDependencyOptions, packagedependencyid: Long): HRESULT

public expect fun VerifyApplicationUserModelId(applicationusermodelid: PCWSTR): WIN32_ERROR

public expect fun VerifyPackageFamilyName(packagefamilyname: PCWSTR): WIN32_ERROR

public expect fun VerifyPackageFullName(packagefullname: PCWSTR): WIN32_ERROR

public expect fun VerifyPackageId(packageid: Long): WIN32_ERROR

public expect fun VerifyPackageRelativeApplicationId(packagerelativeapplicationid: PCWSTR): WIN32_ERROR
