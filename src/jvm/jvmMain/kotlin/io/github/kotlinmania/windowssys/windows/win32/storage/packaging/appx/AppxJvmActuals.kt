@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error
import io.github.kotlinmania.windowssys.windows.win32.security.Psid

private object WindowsWin32StoragePackagingAppxJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_activatePackageVirtualizationContext(context: Long, cookie: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_addPackageDependency(packagedependencyid: Long, rank: Int, options: Int, packagedependencycontext: Long, packagefullname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_appPolicyGetClrCompat(processtoken: Long, policy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_appPolicyGetCreateFileAccess(processtoken: Long, policy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_appPolicyGetLifecycleManagement(processtoken: Long, policy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_appPolicyGetMediaFoundationCodecLoading(processtoken: Long, policy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_appPolicyGetProcessTerminationMethod(processtoken: Long, policy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_appPolicyGetShowDeveloperDiagnostic(processtoken: Long, policy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_appPolicyGetThreadInitializationType(processtoken: Long, policy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_appPolicyGetWindowingModel(processtoken: Long, policy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_checkIsMSIXPackage(packagefullname: Long, ismsixpackage: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_closePackageInfo(packageinforeference: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_createPackageVirtualizationContext(packagefamilyname: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_deactivatePackageVirtualizationContext(cookie: Long)

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_deletePackageDependency(packagedependencyid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_duplicatePackageVirtualizationContext(sourcecontext: Long, destcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_findPackagesByPackageFamily(packagefamilyname: Long, packagefilters: Int, count: Long, packagefullnames: Long, bufferlength: Long, buffer: Long, packageproperties: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_formatApplicationUserModelId(packagefamilyname: Long, packagerelativeapplicationid: Long, applicationusermodelidlength: Long, applicationusermodelid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_getApplicationUserModelId(hprocess: Long, applicationusermodelidlength: Long, applicationusermodelid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_getApplicationUserModelIdFromToken(token: Long, applicationusermodelidlength: Long, applicationusermodelid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_getCurrentApplicationUserModelId(applicationusermodelidlength: Long, applicationusermodelid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_getCurrentPackageFamilyName(packagefamilynamelength: Long, packagefamilyname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_getCurrentPackageFullName(packagefullnamelength: Long, packagefullname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_getCurrentPackageId(bufferlength: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_getCurrentPackageInfo(flags: Int, bufferlength: Long, buffer: Long, count: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_getCurrentPackageInfo2(flags: Int, packagepathtype: Int, bufferlength: Long, buffer: Long, count: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_getCurrentPackageInfo3(flags: Int, packageinfotype: Int, bufferlength: Long, buffer: Long, count: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_getCurrentPackagePath(pathlength: Long, path: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_getCurrentPackagePath2(packagepathtype: Int, pathlength: Long, path: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_getCurrentPackageVirtualizationContext(): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_getIdForPackageDependencyContext(packagedependencycontext: Long, packagedependencyid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_getPackageApplicationIds(packageinforeference: Long, bufferlength: Long, buffer: Long, count: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_getPackageFamilyName(hprocess: Long, packagefamilynamelength: Long, packagefamilyname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_getPackageFamilyNameFromToken(token: Long, packagefamilynamelength: Long, packagefamilyname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_getPackageFullName(hprocess: Long, packagefullnamelength: Long, packagefullname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_getPackageFullNameFromToken(token: Long, packagefullnamelength: Long, packagefullname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_getPackageGraphRevisionId(): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_getPackageId(hprocess: Long, bufferlength: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_getPackageInfo(packageinforeference: Long, flags: Int, bufferlength: Long, buffer: Long, count: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_getPackageInfo2(packageinforeference: Long, flags: Int, packagepathtype: Int, bufferlength: Long, buffer: Long, count: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_getPackagePath(packageid: Long, reserved: Int, pathlength: Long, path: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_getPackagePathByFullName(packagefullname: Long, pathlength: Long, path: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_getPackagePathByFullName2(packagefullname: Long, packagepathtype: Int, pathlength: Long, path: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_getPackagesByPackageFamily(packagefamilyname: Long, count: Long, packagefullnames: Long, bufferlength: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_getProcessesInVirtualizationContext(packagefamilyname: Long, count: Long, processes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_getResolvedPackageFullNameForPackageDependency(packagedependencyid: Long, packagefullname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_getStagedPackageOrigin(packagefullname: Long, origin: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_getStagedPackagePathByFullName(packagefullname: Long, pathlength: Long, path: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_getStagedPackagePathByFullName2(packagefullname: Long, packagepathtype: Int, pathlength: Long, path: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_openPackageInfoByFullName(packagefullname: Long, reserved: Int, packageinforeference: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_openPackageInfoByFullNameForUser(usersid: Long, packagefullname: Long, reserved: Int, packageinforeference: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_packageFamilyNameFromFullName(packagefullname: Long, packagefamilynamelength: Long, packagefamilyname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_packageFamilyNameFromId(packageid: Long, packagefamilynamelength: Long, packagefamilyname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_packageFullNameFromId(packageid: Long, packagefullnamelength: Long, packagefullname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_packageIdFromFullName(packagefullname: Long, flags: Int, bufferlength: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_packageNameAndPublisherIdFromFamilyName(packagefamilyname: Long, packagenamelength: Long, packagename: Long, packagepublisheridlength: Long, packagepublisherid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_parseApplicationUserModelId(applicationusermodelid: Long, packagefamilynamelength: Long, packagefamilyname: Long, packagerelativeapplicationidlength: Long, packagerelativeapplicationid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_releasePackageVirtualizationContext(context: Long)

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_removePackageDependency(packagedependencycontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_verifyApplicationUserModelId(applicationusermodelid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_verifyPackageFamilyName(packagefamilyname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_verifyPackageFullName(packagefullname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_verifyPackageId(packageid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_verifyPackageRelativeApplicationId(packagerelativeapplicationid: Long): Int
}

public actual fun activatePackageVirtualizationContext(context: PackageVirtualizationContextHandle, cookie: COpaquePointer?): Hresult =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_activatePackageVirtualizationContext((context?.value ?: 0L), (cookie?.value ?: 0L))

public actual fun addPackageDependency(packagedependencyid: Pcwstr, rank: Int, options: AddPackageDependencyOptions, packagedependencycontext: COpaquePointer?, packagefullname: COpaquePointer?): Hresult =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_addPackageDependency((packagedependencyid?.value ?: 0L), rank, options, (packagedependencycontext?.value ?: 0L), (packagefullname?.value ?: 0L))

public actual fun appPolicyGetClrCompat(processtoken: Handle, policy: COpaquePointer?): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_appPolicyGetClrCompat((processtoken?.value ?: 0L), (policy?.value ?: 0L)).toUInt()

public actual fun appPolicyGetCreateFileAccess(processtoken: Handle, policy: COpaquePointer?): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_appPolicyGetCreateFileAccess((processtoken?.value ?: 0L), (policy?.value ?: 0L)).toUInt()

public actual fun appPolicyGetLifecycleManagement(processtoken: Handle, policy: COpaquePointer?): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_appPolicyGetLifecycleManagement((processtoken?.value ?: 0L), (policy?.value ?: 0L)).toUInt()

public actual fun appPolicyGetMediaFoundationCodecLoading(processtoken: Handle, policy: COpaquePointer?): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_appPolicyGetMediaFoundationCodecLoading((processtoken?.value ?: 0L), (policy?.value ?: 0L)).toUInt()

public actual fun appPolicyGetProcessTerminationMethod(processtoken: Handle, policy: COpaquePointer?): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_appPolicyGetProcessTerminationMethod((processtoken?.value ?: 0L), (policy?.value ?: 0L)).toUInt()

public actual fun appPolicyGetShowDeveloperDiagnostic(processtoken: Handle, policy: COpaquePointer?): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_appPolicyGetShowDeveloperDiagnostic((processtoken?.value ?: 0L), (policy?.value ?: 0L)).toUInt()

public actual fun appPolicyGetThreadInitializationType(processtoken: Handle, policy: COpaquePointer?): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_appPolicyGetThreadInitializationType((processtoken?.value ?: 0L), (policy?.value ?: 0L)).toUInt()

public actual fun appPolicyGetWindowingModel(processtoken: Handle, policy: COpaquePointer?): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_appPolicyGetWindowingModel((processtoken?.value ?: 0L), (policy?.value ?: 0L)).toUInt()

public actual fun checkIsMSIXPackage(packagefullname: Pcwstr, ismsixpackage: COpaquePointer?): Hresult =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_checkIsMSIXPackage((packagefullname?.value ?: 0L), (ismsixpackage?.value ?: 0L))

public actual fun closePackageInfo(packageinforeference: COpaquePointer?): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_closePackageInfo((packageinforeference?.value ?: 0L)).toUInt()

public actual fun createPackageVirtualizationContext(packagefamilyname: Pcwstr, context: COpaquePointer?): Hresult =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_createPackageVirtualizationContext((packagefamilyname?.value ?: 0L), (context?.value ?: 0L))

public actual fun deactivatePackageVirtualizationContext(cookie: ULong) {
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_deactivatePackageVirtualizationContext(cookie.toLong())
}

public actual fun deletePackageDependency(packagedependencyid: Pcwstr): Hresult =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_deletePackageDependency((packagedependencyid?.value ?: 0L))

public actual fun duplicatePackageVirtualizationContext(sourcecontext: PackageVirtualizationContextHandle, destcontext: COpaquePointer?): Hresult =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_duplicatePackageVirtualizationContext((sourcecontext?.value ?: 0L), (destcontext?.value ?: 0L))

public actual fun findPackagesByPackageFamily(packagefamilyname: Pcwstr, packagefilters: UInt, count: COpaquePointer?, packagefullnames: COpaquePointer?, bufferlength: COpaquePointer?, buffer: Pwstr, packageproperties: COpaquePointer?): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_findPackagesByPackageFamily((packagefamilyname?.value ?: 0L), packagefilters.toInt(), (count?.value ?: 0L), (packagefullnames?.value ?: 0L), (bufferlength?.value ?: 0L), (buffer?.value ?: 0L), (packageproperties?.value ?: 0L)).toUInt()

public actual fun formatApplicationUserModelId(packagefamilyname: Pcwstr, packagerelativeapplicationid: Pcwstr, applicationusermodelidlength: COpaquePointer?, applicationusermodelid: Pwstr): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_formatApplicationUserModelId((packagefamilyname?.value ?: 0L), (packagerelativeapplicationid?.value ?: 0L), (applicationusermodelidlength?.value ?: 0L), (applicationusermodelid?.value ?: 0L)).toUInt()

public actual fun getApplicationUserModelId(hprocess: Handle, applicationusermodelidlength: COpaquePointer?, applicationusermodelid: Pwstr): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_getApplicationUserModelId((hprocess?.value ?: 0L), (applicationusermodelidlength?.value ?: 0L), (applicationusermodelid?.value ?: 0L)).toUInt()

public actual fun getApplicationUserModelIdFromToken(token: Handle, applicationusermodelidlength: COpaquePointer?, applicationusermodelid: Pwstr): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_getApplicationUserModelIdFromToken((token?.value ?: 0L), (applicationusermodelidlength?.value ?: 0L), (applicationusermodelid?.value ?: 0L)).toUInt()

public actual fun getCurrentApplicationUserModelId(applicationusermodelidlength: COpaquePointer?, applicationusermodelid: Pwstr): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_getCurrentApplicationUserModelId((applicationusermodelidlength?.value ?: 0L), (applicationusermodelid?.value ?: 0L)).toUInt()

public actual fun getCurrentPackageFamilyName(packagefamilynamelength: COpaquePointer?, packagefamilyname: Pwstr): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_getCurrentPackageFamilyName((packagefamilynamelength?.value ?: 0L), (packagefamilyname?.value ?: 0L)).toUInt()

public actual fun getCurrentPackageFullName(packagefullnamelength: COpaquePointer?, packagefullname: Pwstr): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_getCurrentPackageFullName((packagefullnamelength?.value ?: 0L), (packagefullname?.value ?: 0L)).toUInt()

public actual fun getCurrentPackageId(bufferlength: COpaquePointer?, buffer: COpaquePointer?): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_getCurrentPackageId((bufferlength?.value ?: 0L), (buffer?.value ?: 0L)).toUInt()

public actual fun getCurrentPackageInfo(flags: UInt, bufferlength: COpaquePointer?, buffer: COpaquePointer?, count: COpaquePointer?): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_getCurrentPackageInfo(flags.toInt(), (bufferlength?.value ?: 0L), (buffer?.value ?: 0L), (count?.value ?: 0L)).toUInt()

public actual fun getCurrentPackageInfo2(flags: UInt, packagepathtype: PackagePathType, bufferlength: COpaquePointer?, buffer: COpaquePointer?, count: COpaquePointer?): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_getCurrentPackageInfo2(flags.toInt(), packagepathtype, (bufferlength?.value ?: 0L), (buffer?.value ?: 0L), (count?.value ?: 0L)).toUInt()

public actual fun getCurrentPackageInfo3(flags: UInt, packageinfotype: PackageInfo3Type, bufferlength: COpaquePointer?, buffer: COpaquePointer?, count: COpaquePointer?): Hresult =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_getCurrentPackageInfo3(flags.toInt(), packageinfotype, (bufferlength?.value ?: 0L), (buffer?.value ?: 0L), (count?.value ?: 0L))

public actual fun getCurrentPackagePath(pathlength: COpaquePointer?, path: Pwstr): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_getCurrentPackagePath((pathlength?.value ?: 0L), (path?.value ?: 0L)).toUInt()

public actual fun getCurrentPackagePath2(packagepathtype: PackagePathType, pathlength: COpaquePointer?, path: Pwstr): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_getCurrentPackagePath2(packagepathtype, (pathlength?.value ?: 0L), (path?.value ?: 0L)).toUInt()

public actual fun getCurrentPackageVirtualizationContext(): PackageVirtualizationContextHandle =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_getCurrentPackageVirtualizationContext().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getIdForPackageDependencyContext(packagedependencycontext: PackagedependencyContext, packagedependencyid: COpaquePointer?): Hresult =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_getIdForPackageDependencyContext((packagedependencycontext?.value ?: 0L), (packagedependencyid?.value ?: 0L))

public actual fun getPackageApplicationIds(packageinforeference: COpaquePointer?, bufferlength: COpaquePointer?, buffer: COpaquePointer?, count: COpaquePointer?): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_getPackageApplicationIds((packageinforeference?.value ?: 0L), (bufferlength?.value ?: 0L), (buffer?.value ?: 0L), (count?.value ?: 0L)).toUInt()

public actual fun getPackageFamilyName(hprocess: Handle, packagefamilynamelength: COpaquePointer?, packagefamilyname: Pwstr): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_getPackageFamilyName((hprocess?.value ?: 0L), (packagefamilynamelength?.value ?: 0L), (packagefamilyname?.value ?: 0L)).toUInt()

public actual fun getPackageFamilyNameFromToken(token: Handle, packagefamilynamelength: COpaquePointer?, packagefamilyname: Pwstr): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_getPackageFamilyNameFromToken((token?.value ?: 0L), (packagefamilynamelength?.value ?: 0L), (packagefamilyname?.value ?: 0L)).toUInt()

public actual fun getPackageFullName(hprocess: Handle, packagefullnamelength: COpaquePointer?, packagefullname: Pwstr): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_getPackageFullName((hprocess?.value ?: 0L), (packagefullnamelength?.value ?: 0L), (packagefullname?.value ?: 0L)).toUInt()

public actual fun getPackageFullNameFromToken(token: Handle, packagefullnamelength: COpaquePointer?, packagefullname: Pwstr): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_getPackageFullNameFromToken((token?.value ?: 0L), (packagefullnamelength?.value ?: 0L), (packagefullname?.value ?: 0L)).toUInt()

public actual fun getPackageGraphRevisionId(): UInt =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_getPackageGraphRevisionId().toUInt()

public actual fun getPackageId(hprocess: Handle, bufferlength: COpaquePointer?, buffer: COpaquePointer?): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_getPackageId((hprocess?.value ?: 0L), (bufferlength?.value ?: 0L), (buffer?.value ?: 0L)).toUInt()

public actual fun getPackageInfo(packageinforeference: COpaquePointer?, flags: UInt, bufferlength: COpaquePointer?, buffer: COpaquePointer?, count: COpaquePointer?): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_getPackageInfo((packageinforeference?.value ?: 0L), flags.toInt(), (bufferlength?.value ?: 0L), (buffer?.value ?: 0L), (count?.value ?: 0L)).toUInt()

public actual fun getPackageInfo2(packageinforeference: COpaquePointer?, flags: UInt, packagepathtype: PackagePathType, bufferlength: COpaquePointer?, buffer: COpaquePointer?, count: COpaquePointer?): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_getPackageInfo2((packageinforeference?.value ?: 0L), flags.toInt(), packagepathtype, (bufferlength?.value ?: 0L), (buffer?.value ?: 0L), (count?.value ?: 0L)).toUInt()

public actual fun getPackagePath(packageid: COpaquePointer?, reserved: UInt, pathlength: COpaquePointer?, path: Pwstr): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_getPackagePath((packageid?.value ?: 0L), reserved.toInt(), (pathlength?.value ?: 0L), (path?.value ?: 0L)).toUInt()

public actual fun getPackagePathByFullName(packagefullname: Pcwstr, pathlength: COpaquePointer?, path: Pwstr): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_getPackagePathByFullName((packagefullname?.value ?: 0L), (pathlength?.value ?: 0L), (path?.value ?: 0L)).toUInt()

public actual fun getPackagePathByFullName2(packagefullname: Pcwstr, packagepathtype: PackagePathType, pathlength: COpaquePointer?, path: Pwstr): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_getPackagePathByFullName2((packagefullname?.value ?: 0L), packagepathtype, (pathlength?.value ?: 0L), (path?.value ?: 0L)).toUInt()

public actual fun getPackagesByPackageFamily(packagefamilyname: Pcwstr, count: COpaquePointer?, packagefullnames: COpaquePointer?, bufferlength: COpaquePointer?, buffer: Pwstr): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_getPackagesByPackageFamily((packagefamilyname?.value ?: 0L), (count?.value ?: 0L), (packagefullnames?.value ?: 0L), (bufferlength?.value ?: 0L), (buffer?.value ?: 0L)).toUInt()

public actual fun getProcessesInVirtualizationContext(packagefamilyname: Pcwstr, count: COpaquePointer?, processes: COpaquePointer?): Hresult =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_getProcessesInVirtualizationContext((packagefamilyname?.value ?: 0L), (count?.value ?: 0L), (processes?.value ?: 0L))

public actual fun getResolvedPackageFullNameForPackageDependency(packagedependencyid: Pcwstr, packagefullname: COpaquePointer?): Hresult =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_getResolvedPackageFullNameForPackageDependency((packagedependencyid?.value ?: 0L), (packagefullname?.value ?: 0L))

public actual fun getStagedPackageOrigin(packagefullname: Pcwstr, origin: COpaquePointer?): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_getStagedPackageOrigin((packagefullname?.value ?: 0L), (origin?.value ?: 0L)).toUInt()

public actual fun getStagedPackagePathByFullName(packagefullname: Pcwstr, pathlength: COpaquePointer?, path: Pwstr): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_getStagedPackagePathByFullName((packagefullname?.value ?: 0L), (pathlength?.value ?: 0L), (path?.value ?: 0L)).toUInt()

public actual fun getStagedPackagePathByFullName2(packagefullname: Pcwstr, packagepathtype: PackagePathType, pathlength: COpaquePointer?, path: Pwstr): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_getStagedPackagePathByFullName2((packagefullname?.value ?: 0L), packagepathtype, (pathlength?.value ?: 0L), (path?.value ?: 0L)).toUInt()

public actual fun openPackageInfoByFullName(packagefullname: Pcwstr, reserved: UInt, packageinforeference: COpaquePointer?): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_openPackageInfoByFullName((packagefullname?.value ?: 0L), reserved.toInt(), (packageinforeference?.value ?: 0L)).toUInt()

public actual fun openPackageInfoByFullNameForUser(usersid: Psid, packagefullname: Pcwstr, reserved: UInt, packageinforeference: COpaquePointer?): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_openPackageInfoByFullNameForUser((usersid?.value ?: 0L), (packagefullname?.value ?: 0L), reserved.toInt(), (packageinforeference?.value ?: 0L)).toUInt()

public actual fun packageFamilyNameFromFullName(packagefullname: Pcwstr, packagefamilynamelength: COpaquePointer?, packagefamilyname: Pwstr): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_packageFamilyNameFromFullName((packagefullname?.value ?: 0L), (packagefamilynamelength?.value ?: 0L), (packagefamilyname?.value ?: 0L)).toUInt()

public actual fun packageFamilyNameFromId(packageid: COpaquePointer?, packagefamilynamelength: COpaquePointer?, packagefamilyname: Pwstr): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_packageFamilyNameFromId((packageid?.value ?: 0L), (packagefamilynamelength?.value ?: 0L), (packagefamilyname?.value ?: 0L)).toUInt()

public actual fun packageFullNameFromId(packageid: COpaquePointer?, packagefullnamelength: COpaquePointer?, packagefullname: Pwstr): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_packageFullNameFromId((packageid?.value ?: 0L), (packagefullnamelength?.value ?: 0L), (packagefullname?.value ?: 0L)).toUInt()

public actual fun packageIdFromFullName(packagefullname: Pcwstr, flags: UInt, bufferlength: COpaquePointer?, buffer: COpaquePointer?): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_packageIdFromFullName((packagefullname?.value ?: 0L), flags.toInt(), (bufferlength?.value ?: 0L), (buffer?.value ?: 0L)).toUInt()

public actual fun packageNameAndPublisherIdFromFamilyName(packagefamilyname: Pcwstr, packagenamelength: COpaquePointer?, packagename: Pwstr, packagepublisheridlength: COpaquePointer?, packagepublisherid: Pwstr): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_packageNameAndPublisherIdFromFamilyName((packagefamilyname?.value ?: 0L), (packagenamelength?.value ?: 0L), (packagename?.value ?: 0L), (packagepublisheridlength?.value ?: 0L), (packagepublisherid?.value ?: 0L)).toUInt()

public actual fun parseApplicationUserModelId(applicationusermodelid: Pcwstr, packagefamilynamelength: COpaquePointer?, packagefamilyname: Pwstr, packagerelativeapplicationidlength: COpaquePointer?, packagerelativeapplicationid: Pwstr): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_parseApplicationUserModelId((applicationusermodelid?.value ?: 0L), (packagefamilynamelength?.value ?: 0L), (packagefamilyname?.value ?: 0L), (packagerelativeapplicationidlength?.value ?: 0L), (packagerelativeapplicationid?.value ?: 0L)).toUInt()

public actual fun releasePackageVirtualizationContext(context: PackageVirtualizationContextHandle) {
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_releasePackageVirtualizationContext((context?.value ?: 0L))
}

public actual fun removePackageDependency(packagedependencycontext: PackagedependencyContext): Hresult =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_removePackageDependency((packagedependencycontext?.value ?: 0L))

public actual fun tryCreatePackageDependency(user: Psid, packagefamilyname: Pcwstr, minversion: PackageVersion, packagedependencyprocessorarchitectures: PackageDependencyProcessorArchitectures, lifetimekind: PackageDependencyLifetimeKind, lifetimeartifact: Pcwstr, options: CreatePackageDependencyOptions, packagedependencyid: COpaquePointer?): Hresult =
    0

public actual fun verifyApplicationUserModelId(applicationusermodelid: Pcwstr): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_verifyApplicationUserModelId((applicationusermodelid?.value ?: 0L)).toUInt()

public actual fun verifyPackageFamilyName(packagefamilyname: Pcwstr): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_verifyPackageFamilyName((packagefamilyname?.value ?: 0L)).toUInt()

public actual fun verifyPackageFullName(packagefullname: Pcwstr): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_verifyPackageFullName((packagefullname?.value ?: 0L)).toUInt()

public actual fun verifyPackageId(packageid: COpaquePointer?): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_verifyPackageId((packageid?.value ?: 0L)).toUInt()

public actual fun verifyPackageRelativeApplicationId(packagerelativeapplicationid: Pcwstr): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_verifyPackageRelativeApplicationId((packagerelativeapplicationid?.value ?: 0L)).toUInt()
