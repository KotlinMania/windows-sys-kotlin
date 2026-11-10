@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun activatePackageVirtualizationContext(context: PackageVirtualizationContextHandle, cookie: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_activatePackageVirtualizationContext(context?.value?.toCPointer<ByteVar>(), cookie?.value?.toCPointer<ByteVar>())

public actual fun addPackageDependency(packagedependencyid: Pcwstr, rank: Int, options: AddPackageDependencyOptions, packagedependencycontext: COpaquePointer?, packagefullname: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_addPackageDependency(packagedependencyid?.value?.toCPointer<ByteVar>(), rank, options, packagedependencycontext?.value?.toCPointer<ByteVar>(), packagefullname?.value?.toCPointer<ByteVar>())

public actual fun appPolicyGetClrCompat(processtoken: Handle, policy: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_appPolicyGetClrCompat(processtoken?.value?.toCPointer<ByteVar>(), policy?.value?.toCPointer<ByteVar>())

public actual fun appPolicyGetCreateFileAccess(processtoken: Handle, policy: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_appPolicyGetCreateFileAccess(processtoken?.value?.toCPointer<ByteVar>(), policy?.value?.toCPointer<ByteVar>())

public actual fun appPolicyGetLifecycleManagement(processtoken: Handle, policy: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_appPolicyGetLifecycleManagement(processtoken?.value?.toCPointer<ByteVar>(), policy?.value?.toCPointer<ByteVar>())

public actual fun appPolicyGetMediaFoundationCodecLoading(processtoken: Handle, policy: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_appPolicyGetMediaFoundationCodecLoading(processtoken?.value?.toCPointer<ByteVar>(), policy?.value?.toCPointer<ByteVar>())

public actual fun appPolicyGetProcessTerminationMethod(processtoken: Handle, policy: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_appPolicyGetProcessTerminationMethod(processtoken?.value?.toCPointer<ByteVar>(), policy?.value?.toCPointer<ByteVar>())

public actual fun appPolicyGetShowDeveloperDiagnostic(processtoken: Handle, policy: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_appPolicyGetShowDeveloperDiagnostic(processtoken?.value?.toCPointer<ByteVar>(), policy?.value?.toCPointer<ByteVar>())

public actual fun appPolicyGetThreadInitializationType(processtoken: Handle, policy: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_appPolicyGetThreadInitializationType(processtoken?.value?.toCPointer<ByteVar>(), policy?.value?.toCPointer<ByteVar>())

public actual fun appPolicyGetWindowingModel(processtoken: Handle, policy: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_appPolicyGetWindowingModel(processtoken?.value?.toCPointer<ByteVar>(), policy?.value?.toCPointer<ByteVar>())

public actual fun checkIsMSIXPackage(packagefullname: Pcwstr, ismsixpackage: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_checkIsMSIXPackage(packagefullname?.value?.toCPointer<ByteVar>(), ismsixpackage?.value?.toCPointer<ByteVar>())

public actual fun closePackageInfo(packageinforeference: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_closePackageInfo(packageinforeference?.value?.toCPointer<ByteVar>())

public actual fun createPackageVirtualizationContext(packagefamilyname: Pcwstr, context: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_createPackageVirtualizationContext(packagefamilyname?.value?.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())

public actual fun deactivatePackageVirtualizationContext(cookie: ULong) {
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_deactivatePackageVirtualizationContext(cookie)
}

public actual fun deletePackageDependency(packagedependencyid: Pcwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_deletePackageDependency(packagedependencyid?.value?.toCPointer<ByteVar>())

public actual fun duplicatePackageVirtualizationContext(sourcecontext: PackageVirtualizationContextHandle, destcontext: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_duplicatePackageVirtualizationContext(sourcecontext?.value?.toCPointer<ByteVar>(), destcontext?.value?.toCPointer<ByteVar>())

public actual fun findPackagesByPackageFamily(packagefamilyname: Pcwstr, packagefilters: UInt, count: COpaquePointer?, packagefullnames: COpaquePointer?, bufferlength: COpaquePointer?, buffer: Pwstr, packageproperties: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_findPackagesByPackageFamily(packagefamilyname?.value?.toCPointer<ByteVar>(), packagefilters, count?.value?.toCPointer<ByteVar>(), packagefullnames?.value?.toCPointer<ByteVar>(), bufferlength?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), packageproperties?.value?.toCPointer<ByteVar>())

public actual fun formatApplicationUserModelId(packagefamilyname: Pcwstr, packagerelativeapplicationid: Pcwstr, applicationusermodelidlength: COpaquePointer?, applicationusermodelid: Pwstr): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_formatApplicationUserModelId(packagefamilyname?.value?.toCPointer<ByteVar>(), packagerelativeapplicationid?.value?.toCPointer<ByteVar>(), applicationusermodelidlength?.value?.toCPointer<ByteVar>(), applicationusermodelid?.value?.toCPointer<ByteVar>())

public actual fun getApplicationUserModelId(hprocess: Handle, applicationusermodelidlength: COpaquePointer?, applicationusermodelid: Pwstr): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_getApplicationUserModelId(hprocess?.value?.toCPointer<ByteVar>(), applicationusermodelidlength?.value?.toCPointer<ByteVar>(), applicationusermodelid?.value?.toCPointer<ByteVar>())

public actual fun getApplicationUserModelIdFromToken(token: Handle, applicationusermodelidlength: COpaquePointer?, applicationusermodelid: Pwstr): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_getApplicationUserModelIdFromToken(token?.value?.toCPointer<ByteVar>(), applicationusermodelidlength?.value?.toCPointer<ByteVar>(), applicationusermodelid?.value?.toCPointer<ByteVar>())

public actual fun getCurrentApplicationUserModelId(applicationusermodelidlength: COpaquePointer?, applicationusermodelid: Pwstr): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_getCurrentApplicationUserModelId(applicationusermodelidlength?.value?.toCPointer<ByteVar>(), applicationusermodelid?.value?.toCPointer<ByteVar>())

public actual fun getCurrentPackageFamilyName(packagefamilynamelength: COpaquePointer?, packagefamilyname: Pwstr): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_getCurrentPackageFamilyName(packagefamilynamelength?.value?.toCPointer<ByteVar>(), packagefamilyname?.value?.toCPointer<ByteVar>())

public actual fun getCurrentPackageFullName(packagefullnamelength: COpaquePointer?, packagefullname: Pwstr): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_getCurrentPackageFullName(packagefullnamelength?.value?.toCPointer<ByteVar>(), packagefullname?.value?.toCPointer<ByteVar>())

public actual fun getCurrentPackageId(bufferlength: COpaquePointer?, buffer: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_getCurrentPackageId(bufferlength?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>())

public actual fun getCurrentPackageInfo(flags: UInt, bufferlength: COpaquePointer?, buffer: COpaquePointer?, count: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_getCurrentPackageInfo(flags, bufferlength?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), count?.value?.toCPointer<ByteVar>())

public actual fun getCurrentPackageInfo2(flags: UInt, packagepathtype: PackagePathType, bufferlength: COpaquePointer?, buffer: COpaquePointer?, count: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_getCurrentPackageInfo2(flags, packagepathtype, bufferlength?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), count?.value?.toCPointer<ByteVar>())

public actual fun getCurrentPackageInfo3(flags: UInt, packageinfotype: PackageInfo3Type, bufferlength: COpaquePointer?, buffer: COpaquePointer?, count: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_getCurrentPackageInfo3(flags, packageinfotype, bufferlength?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), count?.value?.toCPointer<ByteVar>())

public actual fun getCurrentPackagePath(pathlength: COpaquePointer?, path: Pwstr): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_getCurrentPackagePath(pathlength?.value?.toCPointer<ByteVar>(), path?.value?.toCPointer<ByteVar>())

public actual fun getCurrentPackagePath2(packagepathtype: PackagePathType, pathlength: COpaquePointer?, path: Pwstr): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_getCurrentPackagePath2(packagepathtype, pathlength?.value?.toCPointer<ByteVar>(), path?.value?.toCPointer<ByteVar>())

public actual fun getCurrentPackageVirtualizationContext(): PackageVirtualizationContextHandle =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_getCurrentPackageVirtualizationContext()?.let { COpaquePointer(it.toLong()) }

public actual fun getIdForPackageDependencyContext(packagedependencycontext: PackagedependencyContext, packagedependencyid: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_getIdForPackageDependencyContext(packagedependencycontext?.value?.toCPointer<ByteVar>(), packagedependencyid?.value?.toCPointer<ByteVar>())

public actual fun getPackageApplicationIds(packageinforeference: COpaquePointer?, bufferlength: COpaquePointer?, buffer: COpaquePointer?, count: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_getPackageApplicationIds(packageinforeference?.value?.toCPointer<ByteVar>(), bufferlength?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), count?.value?.toCPointer<ByteVar>())

public actual fun getPackageFamilyName(hprocess: Handle, packagefamilynamelength: COpaquePointer?, packagefamilyname: Pwstr): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_getPackageFamilyName(hprocess?.value?.toCPointer<ByteVar>(), packagefamilynamelength?.value?.toCPointer<ByteVar>(), packagefamilyname?.value?.toCPointer<ByteVar>())

public actual fun getPackageFamilyNameFromToken(token: Handle, packagefamilynamelength: COpaquePointer?, packagefamilyname: Pwstr): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_getPackageFamilyNameFromToken(token?.value?.toCPointer<ByteVar>(), packagefamilynamelength?.value?.toCPointer<ByteVar>(), packagefamilyname?.value?.toCPointer<ByteVar>())

public actual fun getPackageFullName(hprocess: Handle, packagefullnamelength: COpaquePointer?, packagefullname: Pwstr): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_getPackageFullName(hprocess?.value?.toCPointer<ByteVar>(), packagefullnamelength?.value?.toCPointer<ByteVar>(), packagefullname?.value?.toCPointer<ByteVar>())

public actual fun getPackageFullNameFromToken(token: Handle, packagefullnamelength: COpaquePointer?, packagefullname: Pwstr): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_getPackageFullNameFromToken(token?.value?.toCPointer<ByteVar>(), packagefullnamelength?.value?.toCPointer<ByteVar>(), packagefullname?.value?.toCPointer<ByteVar>())

public actual fun getPackageGraphRevisionId(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_getPackageGraphRevisionId()

public actual fun getPackageId(hprocess: Handle, bufferlength: COpaquePointer?, buffer: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_getPackageId(hprocess?.value?.toCPointer<ByteVar>(), bufferlength?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>())

public actual fun getPackageInfo(packageinforeference: COpaquePointer?, flags: UInt, bufferlength: COpaquePointer?, buffer: COpaquePointer?, count: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_getPackageInfo(packageinforeference?.value?.toCPointer<ByteVar>(), flags, bufferlength?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), count?.value?.toCPointer<ByteVar>())

public actual fun getPackageInfo2(packageinforeference: COpaquePointer?, flags: UInt, packagepathtype: PackagePathType, bufferlength: COpaquePointer?, buffer: COpaquePointer?, count: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_getPackageInfo2(packageinforeference?.value?.toCPointer<ByteVar>(), flags, packagepathtype, bufferlength?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), count?.value?.toCPointer<ByteVar>())

public actual fun getPackagePath(packageid: COpaquePointer?, reserved: UInt, pathlength: COpaquePointer?, path: Pwstr): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_getPackagePath(packageid?.value?.toCPointer<ByteVar>(), reserved, pathlength?.value?.toCPointer<ByteVar>(), path?.value?.toCPointer<ByteVar>())

public actual fun getPackagePathByFullName(packagefullname: Pcwstr, pathlength: COpaquePointer?, path: Pwstr): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_getPackagePathByFullName(packagefullname?.value?.toCPointer<ByteVar>(), pathlength?.value?.toCPointer<ByteVar>(), path?.value?.toCPointer<ByteVar>())

public actual fun getPackagePathByFullName2(packagefullname: Pcwstr, packagepathtype: PackagePathType, pathlength: COpaquePointer?, path: Pwstr): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_getPackagePathByFullName2(packagefullname?.value?.toCPointer<ByteVar>(), packagepathtype, pathlength?.value?.toCPointer<ByteVar>(), path?.value?.toCPointer<ByteVar>())

public actual fun getPackagesByPackageFamily(packagefamilyname: Pcwstr, count: COpaquePointer?, packagefullnames: COpaquePointer?, bufferlength: COpaquePointer?, buffer: Pwstr): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_getPackagesByPackageFamily(packagefamilyname?.value?.toCPointer<ByteVar>(), count?.value?.toCPointer<ByteVar>(), packagefullnames?.value?.toCPointer<ByteVar>(), bufferlength?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>())

public actual fun getProcessesInVirtualizationContext(packagefamilyname: Pcwstr, count: COpaquePointer?, processes: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_getProcessesInVirtualizationContext(packagefamilyname?.value?.toCPointer<ByteVar>(), count?.value?.toCPointer<ByteVar>(), processes?.value?.toCPointer<ByteVar>())

public actual fun getResolvedPackageFullNameForPackageDependency(packagedependencyid: Pcwstr, packagefullname: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_getResolvedPackageFullNameForPackageDependency(packagedependencyid?.value?.toCPointer<ByteVar>(), packagefullname?.value?.toCPointer<ByteVar>())

public actual fun getStagedPackageOrigin(packagefullname: Pcwstr, origin: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_getStagedPackageOrigin(packagefullname?.value?.toCPointer<ByteVar>(), origin?.value?.toCPointer<ByteVar>())

public actual fun getStagedPackagePathByFullName(packagefullname: Pcwstr, pathlength: COpaquePointer?, path: Pwstr): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_getStagedPackagePathByFullName(packagefullname?.value?.toCPointer<ByteVar>(), pathlength?.value?.toCPointer<ByteVar>(), path?.value?.toCPointer<ByteVar>())

public actual fun getStagedPackagePathByFullName2(packagefullname: Pcwstr, packagepathtype: PackagePathType, pathlength: COpaquePointer?, path: Pwstr): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_getStagedPackagePathByFullName2(packagefullname?.value?.toCPointer<ByteVar>(), packagepathtype, pathlength?.value?.toCPointer<ByteVar>(), path?.value?.toCPointer<ByteVar>())

public actual fun openPackageInfoByFullName(packagefullname: Pcwstr, reserved: UInt, packageinforeference: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_openPackageInfoByFullName(packagefullname?.value?.toCPointer<ByteVar>(), reserved, packageinforeference?.value?.toCPointer<ByteVar>())

public actual fun openPackageInfoByFullNameForUser(usersid: Psid, packagefullname: Pcwstr, reserved: UInt, packageinforeference: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_openPackageInfoByFullNameForUser(usersid?.value?.toCPointer<ByteVar>(), packagefullname?.value?.toCPointer<ByteVar>(), reserved, packageinforeference?.value?.toCPointer<ByteVar>())

public actual fun packageFamilyNameFromFullName(packagefullname: Pcwstr, packagefamilynamelength: COpaquePointer?, packagefamilyname: Pwstr): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_packageFamilyNameFromFullName(packagefullname?.value?.toCPointer<ByteVar>(), packagefamilynamelength?.value?.toCPointer<ByteVar>(), packagefamilyname?.value?.toCPointer<ByteVar>())

public actual fun packageFamilyNameFromId(packageid: COpaquePointer?, packagefamilynamelength: COpaquePointer?, packagefamilyname: Pwstr): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_packageFamilyNameFromId(packageid?.value?.toCPointer<ByteVar>(), packagefamilynamelength?.value?.toCPointer<ByteVar>(), packagefamilyname?.value?.toCPointer<ByteVar>())

public actual fun packageFullNameFromId(packageid: COpaquePointer?, packagefullnamelength: COpaquePointer?, packagefullname: Pwstr): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_packageFullNameFromId(packageid?.value?.toCPointer<ByteVar>(), packagefullnamelength?.value?.toCPointer<ByteVar>(), packagefullname?.value?.toCPointer<ByteVar>())

public actual fun packageIdFromFullName(packagefullname: Pcwstr, flags: UInt, bufferlength: COpaquePointer?, buffer: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_packageIdFromFullName(packagefullname?.value?.toCPointer<ByteVar>(), flags, bufferlength?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>())

public actual fun packageNameAndPublisherIdFromFamilyName(packagefamilyname: Pcwstr, packagenamelength: COpaquePointer?, packagename: Pwstr, packagepublisheridlength: COpaquePointer?, packagepublisherid: Pwstr): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_packageNameAndPublisherIdFromFamilyName(packagefamilyname?.value?.toCPointer<ByteVar>(), packagenamelength?.value?.toCPointer<ByteVar>(), packagename?.value?.toCPointer<ByteVar>(), packagepublisheridlength?.value?.toCPointer<ByteVar>(), packagepublisherid?.value?.toCPointer<ByteVar>())

public actual fun parseApplicationUserModelId(applicationusermodelid: Pcwstr, packagefamilynamelength: COpaquePointer?, packagefamilyname: Pwstr, packagerelativeapplicationidlength: COpaquePointer?, packagerelativeapplicationid: Pwstr): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_parseApplicationUserModelId(applicationusermodelid?.value?.toCPointer<ByteVar>(), packagefamilynamelength?.value?.toCPointer<ByteVar>(), packagefamilyname?.value?.toCPointer<ByteVar>(), packagerelativeapplicationidlength?.value?.toCPointer<ByteVar>(), packagerelativeapplicationid?.value?.toCPointer<ByteVar>())

public actual fun releasePackageVirtualizationContext(context: PackageVirtualizationContextHandle) {
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_releasePackageVirtualizationContext(context?.value?.toCPointer<ByteVar>())
}

public actual fun removePackageDependency(packagedependencycontext: PackagedependencyContext): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_removePackageDependency(packagedependencycontext?.value?.toCPointer<ByteVar>())

public actual fun tryCreatePackageDependency(user: Psid, packagefamilyname: Pcwstr, minversion: PackageVersion, packagedependencyprocessorarchitectures: PackageDependencyProcessorArchitectures, lifetimekind: PackageDependencyLifetimeKind, lifetimeartifact: Pcwstr, options: CreatePackageDependencyOptions, packagedependencyid: COpaquePointer?): Hresult =
    0

public actual fun verifyApplicationUserModelId(applicationusermodelid: Pcwstr): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_verifyApplicationUserModelId(applicationusermodelid?.value?.toCPointer<ByteVar>())

public actual fun verifyPackageFamilyName(packagefamilyname: Pcwstr): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_verifyPackageFamilyName(packagefamilyname?.value?.toCPointer<ByteVar>())

public actual fun verifyPackageFullName(packagefullname: Pcwstr): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_verifyPackageFullName(packagefullname?.value?.toCPointer<ByteVar>())

public actual fun verifyPackageId(packageid: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_verifyPackageId(packageid?.value?.toCPointer<ByteVar>())

public actual fun verifyPackageRelativeApplicationId(packagerelativeapplicationid: Pcwstr): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssys_windows_win32_storage_packaging_appx_verifyPackageRelativeApplicationId(packagerelativeapplicationid?.value?.toCPointer<ByteVar>())
