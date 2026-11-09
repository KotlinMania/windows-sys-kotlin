@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.WIN32_ERROR
import io.github.kotlinmania.windowssys.windows.win32.security.PSID
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun ActivatePackageVirtualizationContext(context: PACKAGE_VIRTUALIZATION_CONTEXT_HANDLE, cookie: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_ActivatePackageVirtualizationContext(context.toCPointer<ByteVar>(), cookie.toCPointer<ByteVar>())

public actual fun AddPackageDependency(packagedependencyid: PCWSTR, rank: Int, options: AddPackageDependencyOptions, packagedependencycontext: Long, packagefullname: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_AddPackageDependency(packagedependencyid.toCPointer<ByteVar>(), rank, options, packagedependencycontext.toCPointer<ByteVar>(), packagefullname.toCPointer<ByteVar>())

public actual fun AppPolicyGetClrCompat(processtoken: HANDLE, policy: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_AppPolicyGetClrCompat(processtoken.toCPointer<ByteVar>(), policy.toCPointer<ByteVar>())

public actual fun AppPolicyGetCreateFileAccess(processtoken: HANDLE, policy: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_AppPolicyGetCreateFileAccess(processtoken.toCPointer<ByteVar>(), policy.toCPointer<ByteVar>())

public actual fun AppPolicyGetLifecycleManagement(processtoken: HANDLE, policy: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_AppPolicyGetLifecycleManagement(processtoken.toCPointer<ByteVar>(), policy.toCPointer<ByteVar>())

public actual fun AppPolicyGetMediaFoundationCodecLoading(processtoken: HANDLE, policy: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_AppPolicyGetMediaFoundationCodecLoading(processtoken.toCPointer<ByteVar>(), policy.toCPointer<ByteVar>())

public actual fun AppPolicyGetProcessTerminationMethod(processtoken: HANDLE, policy: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_AppPolicyGetProcessTerminationMethod(processtoken.toCPointer<ByteVar>(), policy.toCPointer<ByteVar>())

public actual fun AppPolicyGetShowDeveloperDiagnostic(processtoken: HANDLE, policy: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_AppPolicyGetShowDeveloperDiagnostic(processtoken.toCPointer<ByteVar>(), policy.toCPointer<ByteVar>())

public actual fun AppPolicyGetThreadInitializationType(processtoken: HANDLE, policy: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_AppPolicyGetThreadInitializationType(processtoken.toCPointer<ByteVar>(), policy.toCPointer<ByteVar>())

public actual fun AppPolicyGetWindowingModel(processtoken: HANDLE, policy: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_AppPolicyGetWindowingModel(processtoken.toCPointer<ByteVar>(), policy.toCPointer<ByteVar>())

public actual fun CheckIsMSIXPackage(packagefullname: PCWSTR, ismsixpackage: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_CheckIsMSIXPackage(packagefullname.toCPointer<ByteVar>(), ismsixpackage.toCPointer<ByteVar>())

public actual fun ClosePackageInfo(packageinforeference: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_ClosePackageInfo(packageinforeference.toCPointer<ByteVar>())

public actual fun CreatePackageVirtualizationContext(packagefamilyname: PCWSTR, context: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_CreatePackageVirtualizationContext(packagefamilyname.toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun DeactivatePackageVirtualizationContext(cookie: ULong) {
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_DeactivatePackageVirtualizationContext(cookie)
}

public actual fun DeletePackageDependency(packagedependencyid: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_DeletePackageDependency(packagedependencyid.toCPointer<ByteVar>())

public actual fun DuplicatePackageVirtualizationContext(sourcecontext: PACKAGE_VIRTUALIZATION_CONTEXT_HANDLE, destcontext: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_DuplicatePackageVirtualizationContext(sourcecontext.toCPointer<ByteVar>(), destcontext.toCPointer<ByteVar>())

public actual fun FindPackagesByPackageFamily(packagefamilyname: PCWSTR, packagefilters: UInt, count: Long, packagefullnames: Long, bufferlength: Long, buffer: PWSTR, packageproperties: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_FindPackagesByPackageFamily(packagefamilyname.toCPointer<ByteVar>(), packagefilters, count.toCPointer<ByteVar>(), packagefullnames.toCPointer<ByteVar>(), bufferlength.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), packageproperties.toCPointer<ByteVar>())

public actual fun FormatApplicationUserModelId(packagefamilyname: PCWSTR, packagerelativeapplicationid: PCWSTR, applicationusermodelidlength: Long, applicationusermodelid: PWSTR): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_FormatApplicationUserModelId(packagefamilyname.toCPointer<ByteVar>(), packagerelativeapplicationid.toCPointer<ByteVar>(), applicationusermodelidlength.toCPointer<ByteVar>(), applicationusermodelid.toCPointer<ByteVar>())

public actual fun GetApplicationUserModelId(hprocess: HANDLE, applicationusermodelidlength: Long, applicationusermodelid: PWSTR): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_GetApplicationUserModelId(hprocess.toCPointer<ByteVar>(), applicationusermodelidlength.toCPointer<ByteVar>(), applicationusermodelid.toCPointer<ByteVar>())

public actual fun GetApplicationUserModelIdFromToken(token: HANDLE, applicationusermodelidlength: Long, applicationusermodelid: PWSTR): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_GetApplicationUserModelIdFromToken(token.toCPointer<ByteVar>(), applicationusermodelidlength.toCPointer<ByteVar>(), applicationusermodelid.toCPointer<ByteVar>())

public actual fun GetCurrentApplicationUserModelId(applicationusermodelidlength: Long, applicationusermodelid: PWSTR): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_GetCurrentApplicationUserModelId(applicationusermodelidlength.toCPointer<ByteVar>(), applicationusermodelid.toCPointer<ByteVar>())

public actual fun GetCurrentPackageFamilyName(packagefamilynamelength: Long, packagefamilyname: PWSTR): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_GetCurrentPackageFamilyName(packagefamilynamelength.toCPointer<ByteVar>(), packagefamilyname.toCPointer<ByteVar>())

public actual fun GetCurrentPackageFullName(packagefullnamelength: Long, packagefullname: PWSTR): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_GetCurrentPackageFullName(packagefullnamelength.toCPointer<ByteVar>(), packagefullname.toCPointer<ByteVar>())

public actual fun GetCurrentPackageId(bufferlength: Long, buffer: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_GetCurrentPackageId(bufferlength.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>())

public actual fun GetCurrentPackageInfo(flags: UInt, bufferlength: Long, buffer: Long, count: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_GetCurrentPackageInfo(flags, bufferlength.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), count.toCPointer<ByteVar>())

public actual fun GetCurrentPackageInfo2(flags: UInt, packagepathtype: PackagePathType, bufferlength: Long, buffer: Long, count: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_GetCurrentPackageInfo2(flags, packagepathtype, bufferlength.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), count.toCPointer<ByteVar>())

public actual fun GetCurrentPackageInfo3(flags: UInt, packageinfotype: PackageInfo3Type, bufferlength: Long, buffer: Long, count: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_GetCurrentPackageInfo3(flags, packageinfotype, bufferlength.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), count.toCPointer<ByteVar>())

public actual fun GetCurrentPackagePath(pathlength: Long, path: PWSTR): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_GetCurrentPackagePath(pathlength.toCPointer<ByteVar>(), path.toCPointer<ByteVar>())

public actual fun GetCurrentPackagePath2(packagepathtype: PackagePathType, pathlength: Long, path: PWSTR): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_GetCurrentPackagePath2(packagepathtype, pathlength.toCPointer<ByteVar>(), path.toCPointer<ByteVar>())

public actual fun GetCurrentPackageVirtualizationContext(): PACKAGE_VIRTUALIZATION_CONTEXT_HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_GetCurrentPackageVirtualizationContext()?.toLong() ?: 0L

public actual fun GetIdForPackageDependencyContext(packagedependencycontext: PACKAGEDEPENDENCY_CONTEXT, packagedependencyid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_GetIdForPackageDependencyContext(packagedependencycontext.toCPointer<ByteVar>(), packagedependencyid.toCPointer<ByteVar>())

public actual fun GetPackageApplicationIds(packageinforeference: Long, bufferlength: Long, buffer: Long, count: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_GetPackageApplicationIds(packageinforeference.toCPointer<ByteVar>(), bufferlength.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), count.toCPointer<ByteVar>())

public actual fun GetPackageFamilyName(hprocess: HANDLE, packagefamilynamelength: Long, packagefamilyname: PWSTR): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_GetPackageFamilyName(hprocess.toCPointer<ByteVar>(), packagefamilynamelength.toCPointer<ByteVar>(), packagefamilyname.toCPointer<ByteVar>())

public actual fun GetPackageFamilyNameFromToken(token: HANDLE, packagefamilynamelength: Long, packagefamilyname: PWSTR): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_GetPackageFamilyNameFromToken(token.toCPointer<ByteVar>(), packagefamilynamelength.toCPointer<ByteVar>(), packagefamilyname.toCPointer<ByteVar>())

public actual fun GetPackageFullName(hprocess: HANDLE, packagefullnamelength: Long, packagefullname: PWSTR): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_GetPackageFullName(hprocess.toCPointer<ByteVar>(), packagefullnamelength.toCPointer<ByteVar>(), packagefullname.toCPointer<ByteVar>())

public actual fun GetPackageFullNameFromToken(token: HANDLE, packagefullnamelength: Long, packagefullname: PWSTR): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_GetPackageFullNameFromToken(token.toCPointer<ByteVar>(), packagefullnamelength.toCPointer<ByteVar>(), packagefullname.toCPointer<ByteVar>())

public actual fun GetPackageGraphRevisionId(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_GetPackageGraphRevisionId()

public actual fun GetPackageId(hprocess: HANDLE, bufferlength: Long, buffer: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_GetPackageId(hprocess.toCPointer<ByteVar>(), bufferlength.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>())

public actual fun GetPackageInfo(packageinforeference: Long, flags: UInt, bufferlength: Long, buffer: Long, count: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_GetPackageInfo(packageinforeference.toCPointer<ByteVar>(), flags, bufferlength.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), count.toCPointer<ByteVar>())

public actual fun GetPackageInfo2(packageinforeference: Long, flags: UInt, packagepathtype: PackagePathType, bufferlength: Long, buffer: Long, count: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_GetPackageInfo2(packageinforeference.toCPointer<ByteVar>(), flags, packagepathtype, bufferlength.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), count.toCPointer<ByteVar>())

public actual fun GetPackagePath(packageid: Long, reserved: UInt, pathlength: Long, path: PWSTR): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_GetPackagePath(packageid.toCPointer<ByteVar>(), reserved, pathlength.toCPointer<ByteVar>(), path.toCPointer<ByteVar>())

public actual fun GetPackagePathByFullName(packagefullname: PCWSTR, pathlength: Long, path: PWSTR): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_GetPackagePathByFullName(packagefullname.toCPointer<ByteVar>(), pathlength.toCPointer<ByteVar>(), path.toCPointer<ByteVar>())

public actual fun GetPackagePathByFullName2(packagefullname: PCWSTR, packagepathtype: PackagePathType, pathlength: Long, path: PWSTR): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_GetPackagePathByFullName2(packagefullname.toCPointer<ByteVar>(), packagepathtype, pathlength.toCPointer<ByteVar>(), path.toCPointer<ByteVar>())

public actual fun GetPackagesByPackageFamily(packagefamilyname: PCWSTR, count: Long, packagefullnames: Long, bufferlength: Long, buffer: PWSTR): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_GetPackagesByPackageFamily(packagefamilyname.toCPointer<ByteVar>(), count.toCPointer<ByteVar>(), packagefullnames.toCPointer<ByteVar>(), bufferlength.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>())

public actual fun GetProcessesInVirtualizationContext(packagefamilyname: PCWSTR, count: Long, processes: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_GetProcessesInVirtualizationContext(packagefamilyname.toCPointer<ByteVar>(), count.toCPointer<ByteVar>(), processes.toCPointer<ByteVar>())

public actual fun GetResolvedPackageFullNameForPackageDependency(packagedependencyid: PCWSTR, packagefullname: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_GetResolvedPackageFullNameForPackageDependency(packagedependencyid.toCPointer<ByteVar>(), packagefullname.toCPointer<ByteVar>())

public actual fun GetStagedPackageOrigin(packagefullname: PCWSTR, origin: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_GetStagedPackageOrigin(packagefullname.toCPointer<ByteVar>(), origin.toCPointer<ByteVar>())

public actual fun GetStagedPackagePathByFullName(packagefullname: PCWSTR, pathlength: Long, path: PWSTR): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_GetStagedPackagePathByFullName(packagefullname.toCPointer<ByteVar>(), pathlength.toCPointer<ByteVar>(), path.toCPointer<ByteVar>())

public actual fun GetStagedPackagePathByFullName2(packagefullname: PCWSTR, packagepathtype: PackagePathType, pathlength: Long, path: PWSTR): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_GetStagedPackagePathByFullName2(packagefullname.toCPointer<ByteVar>(), packagepathtype, pathlength.toCPointer<ByteVar>(), path.toCPointer<ByteVar>())

public actual fun OpenPackageInfoByFullName(packagefullname: PCWSTR, reserved: UInt, packageinforeference: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_OpenPackageInfoByFullName(packagefullname.toCPointer<ByteVar>(), reserved, packageinforeference.toCPointer<ByteVar>())

public actual fun OpenPackageInfoByFullNameForUser(usersid: PSID, packagefullname: PCWSTR, reserved: UInt, packageinforeference: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_OpenPackageInfoByFullNameForUser(usersid.toCPointer<ByteVar>(), packagefullname.toCPointer<ByteVar>(), reserved, packageinforeference.toCPointer<ByteVar>())

public actual fun PackageFamilyNameFromFullName(packagefullname: PCWSTR, packagefamilynamelength: Long, packagefamilyname: PWSTR): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_PackageFamilyNameFromFullName(packagefullname.toCPointer<ByteVar>(), packagefamilynamelength.toCPointer<ByteVar>(), packagefamilyname.toCPointer<ByteVar>())

public actual fun PackageFamilyNameFromId(packageid: Long, packagefamilynamelength: Long, packagefamilyname: PWSTR): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_PackageFamilyNameFromId(packageid.toCPointer<ByteVar>(), packagefamilynamelength.toCPointer<ByteVar>(), packagefamilyname.toCPointer<ByteVar>())

public actual fun PackageFullNameFromId(packageid: Long, packagefullnamelength: Long, packagefullname: PWSTR): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_PackageFullNameFromId(packageid.toCPointer<ByteVar>(), packagefullnamelength.toCPointer<ByteVar>(), packagefullname.toCPointer<ByteVar>())

public actual fun PackageIdFromFullName(packagefullname: PCWSTR, flags: UInt, bufferlength: Long, buffer: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_PackageIdFromFullName(packagefullname.toCPointer<ByteVar>(), flags, bufferlength.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>())

public actual fun PackageNameAndPublisherIdFromFamilyName(packagefamilyname: PCWSTR, packagenamelength: Long, packagename: PWSTR, packagepublisheridlength: Long, packagepublisherid: PWSTR): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_PackageNameAndPublisherIdFromFamilyName(packagefamilyname.toCPointer<ByteVar>(), packagenamelength.toCPointer<ByteVar>(), packagename.toCPointer<ByteVar>(), packagepublisheridlength.toCPointer<ByteVar>(), packagepublisherid.toCPointer<ByteVar>())

public actual fun ParseApplicationUserModelId(applicationusermodelid: PCWSTR, packagefamilynamelength: Long, packagefamilyname: PWSTR, packagerelativeapplicationidlength: Long, packagerelativeapplicationid: PWSTR): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_ParseApplicationUserModelId(applicationusermodelid.toCPointer<ByteVar>(), packagefamilynamelength.toCPointer<ByteVar>(), packagefamilyname.toCPointer<ByteVar>(), packagerelativeapplicationidlength.toCPointer<ByteVar>(), packagerelativeapplicationid.toCPointer<ByteVar>())

public actual fun ReleasePackageVirtualizationContext(context: PACKAGE_VIRTUALIZATION_CONTEXT_HANDLE) {
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_ReleasePackageVirtualizationContext(context.toCPointer<ByteVar>())
}

public actual fun RemovePackageDependency(packagedependencycontext: PACKAGEDEPENDENCY_CONTEXT): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_RemovePackageDependency(packagedependencycontext.toCPointer<ByteVar>())

public actual fun TryCreatePackageDependency(user: PSID, packagefamilyname: PCWSTR, minversion: PACKAGE_VERSION, packagedependencyprocessorarchitectures: PackageDependencyProcessorArchitectures, lifetimekind: PackageDependencyLifetimeKind, lifetimeartifact: PCWSTR, options: CreatePackageDependencyOptions, packagedependencyid: Long): HRESULT =
    0

public actual fun VerifyApplicationUserModelId(applicationusermodelid: PCWSTR): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_VerifyApplicationUserModelId(applicationusermodelid.toCPointer<ByteVar>())

public actual fun VerifyPackageFamilyName(packagefamilyname: PCWSTR): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_VerifyPackageFamilyName(packagefamilyname.toCPointer<ByteVar>())

public actual fun VerifyPackageFullName(packagefullname: PCWSTR): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_VerifyPackageFullName(packagefullname.toCPointer<ByteVar>())

public actual fun VerifyPackageId(packageid: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_VerifyPackageId(packageid.toCPointer<ByteVar>())

public actual fun VerifyPackageRelativeApplicationId(packagerelativeapplicationid: PCWSTR): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_VerifyPackageRelativeApplicationId(packagerelativeapplicationid.toCPointer<ByteVar>())
