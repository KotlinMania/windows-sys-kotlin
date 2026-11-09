@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.WIN32_ERROR
import io.github.kotlinmania.windowssys.windows.win32.security.PSID

public actual fun ActivatePackageVirtualizationContext(context: PACKAGE_VIRTUALIZATION_CONTEXT_HANDLE, cookie: Long): HRESULT =
    0

public actual fun AddPackageDependency(packagedependencyid: PCWSTR, rank: Int, options: AddPackageDependencyOptions, packagedependencycontext: Long, packagefullname: Long): HRESULT =
    0

public actual fun AppPolicyGetClrCompat(processtoken: HANDLE, policy: Long): WIN32_ERROR =
    0u

public actual fun AppPolicyGetCreateFileAccess(processtoken: HANDLE, policy: Long): WIN32_ERROR =
    0u

public actual fun AppPolicyGetLifecycleManagement(processtoken: HANDLE, policy: Long): WIN32_ERROR =
    0u

public actual fun AppPolicyGetMediaFoundationCodecLoading(processtoken: HANDLE, policy: Long): WIN32_ERROR =
    0u

public actual fun AppPolicyGetProcessTerminationMethod(processtoken: HANDLE, policy: Long): WIN32_ERROR =
    0u

public actual fun AppPolicyGetShowDeveloperDiagnostic(processtoken: HANDLE, policy: Long): WIN32_ERROR =
    0u

public actual fun AppPolicyGetThreadInitializationType(processtoken: HANDLE, policy: Long): WIN32_ERROR =
    0u

public actual fun AppPolicyGetWindowingModel(processtoken: HANDLE, policy: Long): WIN32_ERROR =
    0u

public actual fun CheckIsMSIXPackage(packagefullname: PCWSTR, ismsixpackage: Long): HRESULT =
    0

public actual fun ClosePackageInfo(packageinforeference: Long): WIN32_ERROR =
    0u

public actual fun CreatePackageVirtualizationContext(packagefamilyname: PCWSTR, context: Long): HRESULT =
    0

public actual fun DeactivatePackageVirtualizationContext(cookie: ULong) {
}

public actual fun DeletePackageDependency(packagedependencyid: PCWSTR): HRESULT =
    0

public actual fun DuplicatePackageVirtualizationContext(sourcecontext: PACKAGE_VIRTUALIZATION_CONTEXT_HANDLE, destcontext: Long): HRESULT =
    0

public actual fun FindPackagesByPackageFamily(packagefamilyname: PCWSTR, packagefilters: UInt, count: Long, packagefullnames: Long, bufferlength: Long, buffer: PWSTR, packageproperties: Long): WIN32_ERROR =
    0u

public actual fun FormatApplicationUserModelId(packagefamilyname: PCWSTR, packagerelativeapplicationid: PCWSTR, applicationusermodelidlength: Long, applicationusermodelid: PWSTR): WIN32_ERROR =
    0u

public actual fun GetApplicationUserModelId(hprocess: HANDLE, applicationusermodelidlength: Long, applicationusermodelid: PWSTR): WIN32_ERROR =
    0u

public actual fun GetApplicationUserModelIdFromToken(token: HANDLE, applicationusermodelidlength: Long, applicationusermodelid: PWSTR): WIN32_ERROR =
    0u

public actual fun GetCurrentApplicationUserModelId(applicationusermodelidlength: Long, applicationusermodelid: PWSTR): WIN32_ERROR =
    0u

public actual fun GetCurrentPackageFamilyName(packagefamilynamelength: Long, packagefamilyname: PWSTR): WIN32_ERROR =
    0u

public actual fun GetCurrentPackageFullName(packagefullnamelength: Long, packagefullname: PWSTR): WIN32_ERROR =
    0u

public actual fun GetCurrentPackageId(bufferlength: Long, buffer: Long): WIN32_ERROR =
    0u

public actual fun GetCurrentPackageInfo(flags: UInt, bufferlength: Long, buffer: Long, count: Long): WIN32_ERROR =
    0u

public actual fun GetCurrentPackageInfo2(flags: UInt, packagepathtype: PackagePathType, bufferlength: Long, buffer: Long, count: Long): WIN32_ERROR =
    0u

public actual fun GetCurrentPackageInfo3(flags: UInt, packageinfotype: PackageInfo3Type, bufferlength: Long, buffer: Long, count: Long): HRESULT =
    0

public actual fun GetCurrentPackagePath(pathlength: Long, path: PWSTR): WIN32_ERROR =
    0u

public actual fun GetCurrentPackagePath2(packagepathtype: PackagePathType, pathlength: Long, path: PWSTR): WIN32_ERROR =
    0u

public actual fun GetCurrentPackageVirtualizationContext(): PACKAGE_VIRTUALIZATION_CONTEXT_HANDLE =
    0L

public actual fun GetIdForPackageDependencyContext(packagedependencycontext: PACKAGEDEPENDENCY_CONTEXT, packagedependencyid: Long): HRESULT =
    0

public actual fun GetPackageApplicationIds(packageinforeference: Long, bufferlength: Long, buffer: Long, count: Long): WIN32_ERROR =
    0u

public actual fun GetPackageFamilyName(hprocess: HANDLE, packagefamilynamelength: Long, packagefamilyname: PWSTR): WIN32_ERROR =
    0u

public actual fun GetPackageFamilyNameFromToken(token: HANDLE, packagefamilynamelength: Long, packagefamilyname: PWSTR): WIN32_ERROR =
    0u

public actual fun GetPackageFullName(hprocess: HANDLE, packagefullnamelength: Long, packagefullname: PWSTR): WIN32_ERROR =
    0u

public actual fun GetPackageFullNameFromToken(token: HANDLE, packagefullnamelength: Long, packagefullname: PWSTR): WIN32_ERROR =
    0u

public actual fun GetPackageGraphRevisionId(): UInt =
    0u

public actual fun GetPackageId(hprocess: HANDLE, bufferlength: Long, buffer: Long): WIN32_ERROR =
    0u

public actual fun GetPackageInfo(packageinforeference: Long, flags: UInt, bufferlength: Long, buffer: Long, count: Long): WIN32_ERROR =
    0u

public actual fun GetPackageInfo2(packageinforeference: Long, flags: UInt, packagepathtype: PackagePathType, bufferlength: Long, buffer: Long, count: Long): WIN32_ERROR =
    0u

public actual fun GetPackagePath(packageid: Long, reserved: UInt, pathlength: Long, path: PWSTR): WIN32_ERROR =
    0u

public actual fun GetPackagePathByFullName(packagefullname: PCWSTR, pathlength: Long, path: PWSTR): WIN32_ERROR =
    0u

public actual fun GetPackagePathByFullName2(packagefullname: PCWSTR, packagepathtype: PackagePathType, pathlength: Long, path: PWSTR): WIN32_ERROR =
    0u

public actual fun GetPackagesByPackageFamily(packagefamilyname: PCWSTR, count: Long, packagefullnames: Long, bufferlength: Long, buffer: PWSTR): WIN32_ERROR =
    0u

public actual fun GetProcessesInVirtualizationContext(packagefamilyname: PCWSTR, count: Long, processes: Long): HRESULT =
    0

public actual fun GetResolvedPackageFullNameForPackageDependency(packagedependencyid: PCWSTR, packagefullname: Long): HRESULT =
    0

public actual fun GetStagedPackageOrigin(packagefullname: PCWSTR, origin: Long): WIN32_ERROR =
    0u

public actual fun GetStagedPackagePathByFullName(packagefullname: PCWSTR, pathlength: Long, path: PWSTR): WIN32_ERROR =
    0u

public actual fun GetStagedPackagePathByFullName2(packagefullname: PCWSTR, packagepathtype: PackagePathType, pathlength: Long, path: PWSTR): WIN32_ERROR =
    0u

public actual fun OpenPackageInfoByFullName(packagefullname: PCWSTR, reserved: UInt, packageinforeference: Long): WIN32_ERROR =
    0u

public actual fun OpenPackageInfoByFullNameForUser(usersid: PSID, packagefullname: PCWSTR, reserved: UInt, packageinforeference: Long): WIN32_ERROR =
    0u

public actual fun PackageFamilyNameFromFullName(packagefullname: PCWSTR, packagefamilynamelength: Long, packagefamilyname: PWSTR): WIN32_ERROR =
    0u

public actual fun PackageFamilyNameFromId(packageid: Long, packagefamilynamelength: Long, packagefamilyname: PWSTR): WIN32_ERROR =
    0u

public actual fun PackageFullNameFromId(packageid: Long, packagefullnamelength: Long, packagefullname: PWSTR): WIN32_ERROR =
    0u

public actual fun PackageIdFromFullName(packagefullname: PCWSTR, flags: UInt, bufferlength: Long, buffer: Long): WIN32_ERROR =
    0u

public actual fun PackageNameAndPublisherIdFromFamilyName(packagefamilyname: PCWSTR, packagenamelength: Long, packagename: PWSTR, packagepublisheridlength: Long, packagepublisherid: PWSTR): WIN32_ERROR =
    0u

public actual fun ParseApplicationUserModelId(applicationusermodelid: PCWSTR, packagefamilynamelength: Long, packagefamilyname: PWSTR, packagerelativeapplicationidlength: Long, packagerelativeapplicationid: PWSTR): WIN32_ERROR =
    0u

public actual fun ReleasePackageVirtualizationContext(context: PACKAGE_VIRTUALIZATION_CONTEXT_HANDLE) {
}

public actual fun RemovePackageDependency(packagedependencycontext: PACKAGEDEPENDENCY_CONTEXT): HRESULT =
    0

public actual fun TryCreatePackageDependency(user: PSID, packagefamilyname: PCWSTR, minversion: PACKAGE_VERSION, packagedependencyprocessorarchitectures: PackageDependencyProcessorArchitectures, lifetimekind: PackageDependencyLifetimeKind, lifetimeartifact: PCWSTR, options: CreatePackageDependencyOptions, packagedependencyid: Long): HRESULT =
    0

public actual fun VerifyApplicationUserModelId(applicationusermodelid: PCWSTR): WIN32_ERROR =
    0u

public actual fun VerifyPackageFamilyName(packagefamilyname: PCWSTR): WIN32_ERROR =
    0u

public actual fun VerifyPackageFullName(packagefullname: PCWSTR): WIN32_ERROR =
    0u

public actual fun VerifyPackageId(packageid: Long): WIN32_ERROR =
    0u

public actual fun VerifyPackageRelativeApplicationId(packagerelativeapplicationid: PCWSTR): WIN32_ERROR =
    0u
