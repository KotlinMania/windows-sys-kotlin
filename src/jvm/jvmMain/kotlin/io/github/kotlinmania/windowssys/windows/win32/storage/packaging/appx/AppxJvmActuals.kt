@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.WIN32_ERROR
import io.github.kotlinmania.windowssys.windows.win32.security.PSID

private object WindowsWin32StoragePackagingAppxJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_ActivatePackageVirtualizationContext(context: Long, cookie: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_AddPackageDependency(packagedependencyid: Long, rank: Int, options: Int, packagedependencycontext: Long, packagefullname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_AppPolicyGetClrCompat(processtoken: Long, policy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_AppPolicyGetCreateFileAccess(processtoken: Long, policy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_AppPolicyGetLifecycleManagement(processtoken: Long, policy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_AppPolicyGetMediaFoundationCodecLoading(processtoken: Long, policy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_AppPolicyGetProcessTerminationMethod(processtoken: Long, policy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_AppPolicyGetShowDeveloperDiagnostic(processtoken: Long, policy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_AppPolicyGetThreadInitializationType(processtoken: Long, policy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_AppPolicyGetWindowingModel(processtoken: Long, policy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_CheckIsMSIXPackage(packagefullname: Long, ismsixpackage: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_ClosePackageInfo(packageinforeference: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_CreatePackageVirtualizationContext(packagefamilyname: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_DeactivatePackageVirtualizationContext(cookie: Long)

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_DeletePackageDependency(packagedependencyid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_DuplicatePackageVirtualizationContext(sourcecontext: Long, destcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_FindPackagesByPackageFamily(packagefamilyname: Long, packagefilters: Int, count: Long, packagefullnames: Long, bufferlength: Long, buffer: Long, packageproperties: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_FormatApplicationUserModelId(packagefamilyname: Long, packagerelativeapplicationid: Long, applicationusermodelidlength: Long, applicationusermodelid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_GetApplicationUserModelId(hprocess: Long, applicationusermodelidlength: Long, applicationusermodelid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_GetApplicationUserModelIdFromToken(token: Long, applicationusermodelidlength: Long, applicationusermodelid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_GetCurrentApplicationUserModelId(applicationusermodelidlength: Long, applicationusermodelid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_GetCurrentPackageFamilyName(packagefamilynamelength: Long, packagefamilyname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_GetCurrentPackageFullName(packagefullnamelength: Long, packagefullname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_GetCurrentPackageId(bufferlength: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_GetCurrentPackageInfo(flags: Int, bufferlength: Long, buffer: Long, count: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_GetCurrentPackageInfo2(flags: Int, packagepathtype: Int, bufferlength: Long, buffer: Long, count: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_GetCurrentPackageInfo3(flags: Int, packageinfotype: Int, bufferlength: Long, buffer: Long, count: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_GetCurrentPackagePath(pathlength: Long, path: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_GetCurrentPackagePath2(packagepathtype: Int, pathlength: Long, path: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_GetCurrentPackageVirtualizationContext(): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_GetIdForPackageDependencyContext(packagedependencycontext: Long, packagedependencyid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_GetPackageApplicationIds(packageinforeference: Long, bufferlength: Long, buffer: Long, count: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_GetPackageFamilyName(hprocess: Long, packagefamilynamelength: Long, packagefamilyname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_GetPackageFamilyNameFromToken(token: Long, packagefamilynamelength: Long, packagefamilyname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_GetPackageFullName(hprocess: Long, packagefullnamelength: Long, packagefullname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_GetPackageFullNameFromToken(token: Long, packagefullnamelength: Long, packagefullname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_GetPackageGraphRevisionId(): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_GetPackageId(hprocess: Long, bufferlength: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_GetPackageInfo(packageinforeference: Long, flags: Int, bufferlength: Long, buffer: Long, count: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_GetPackageInfo2(packageinforeference: Long, flags: Int, packagepathtype: Int, bufferlength: Long, buffer: Long, count: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_GetPackagePath(packageid: Long, reserved: Int, pathlength: Long, path: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_GetPackagePathByFullName(packagefullname: Long, pathlength: Long, path: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_GetPackagePathByFullName2(packagefullname: Long, packagepathtype: Int, pathlength: Long, path: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_GetPackagesByPackageFamily(packagefamilyname: Long, count: Long, packagefullnames: Long, bufferlength: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_GetProcessesInVirtualizationContext(packagefamilyname: Long, count: Long, processes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_GetResolvedPackageFullNameForPackageDependency(packagedependencyid: Long, packagefullname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_GetStagedPackageOrigin(packagefullname: Long, origin: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_GetStagedPackagePathByFullName(packagefullname: Long, pathlength: Long, path: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_GetStagedPackagePathByFullName2(packagefullname: Long, packagepathtype: Int, pathlength: Long, path: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_OpenPackageInfoByFullName(packagefullname: Long, reserved: Int, packageinforeference: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_OpenPackageInfoByFullNameForUser(usersid: Long, packagefullname: Long, reserved: Int, packageinforeference: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_PackageFamilyNameFromFullName(packagefullname: Long, packagefamilynamelength: Long, packagefamilyname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_PackageFamilyNameFromId(packageid: Long, packagefamilynamelength: Long, packagefamilyname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_PackageFullNameFromId(packageid: Long, packagefullnamelength: Long, packagefullname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_PackageIdFromFullName(packagefullname: Long, flags: Int, bufferlength: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_PackageNameAndPublisherIdFromFamilyName(packagefamilyname: Long, packagenamelength: Long, packagename: Long, packagepublisheridlength: Long, packagepublisherid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_ParseApplicationUserModelId(applicationusermodelid: Long, packagefamilynamelength: Long, packagefamilyname: Long, packagerelativeapplicationidlength: Long, packagerelativeapplicationid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_ReleasePackageVirtualizationContext(context: Long)

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_RemovePackageDependency(packagedependencycontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_VerifyApplicationUserModelId(applicationusermodelid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_VerifyPackageFamilyName(packagefamilyname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_VerifyPackageFullName(packagefullname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_VerifyPackageId(packageid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_packaging_appx_VerifyPackageRelativeApplicationId(packagerelativeapplicationid: Long): Int
}

public actual fun ActivatePackageVirtualizationContext(context: PACKAGE_VIRTUALIZATION_CONTEXT_HANDLE, cookie: Long): HRESULT =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_ActivatePackageVirtualizationContext(context, cookie)

public actual fun AddPackageDependency(packagedependencyid: PCWSTR, rank: Int, options: AddPackageDependencyOptions, packagedependencycontext: Long, packagefullname: Long): HRESULT =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_AddPackageDependency(packagedependencyid, rank, options, packagedependencycontext, packagefullname)

public actual fun AppPolicyGetClrCompat(processtoken: HANDLE, policy: Long): WIN32_ERROR =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_AppPolicyGetClrCompat(processtoken, policy).toUInt()

public actual fun AppPolicyGetCreateFileAccess(processtoken: HANDLE, policy: Long): WIN32_ERROR =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_AppPolicyGetCreateFileAccess(processtoken, policy).toUInt()

public actual fun AppPolicyGetLifecycleManagement(processtoken: HANDLE, policy: Long): WIN32_ERROR =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_AppPolicyGetLifecycleManagement(processtoken, policy).toUInt()

public actual fun AppPolicyGetMediaFoundationCodecLoading(processtoken: HANDLE, policy: Long): WIN32_ERROR =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_AppPolicyGetMediaFoundationCodecLoading(processtoken, policy).toUInt()

public actual fun AppPolicyGetProcessTerminationMethod(processtoken: HANDLE, policy: Long): WIN32_ERROR =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_AppPolicyGetProcessTerminationMethod(processtoken, policy).toUInt()

public actual fun AppPolicyGetShowDeveloperDiagnostic(processtoken: HANDLE, policy: Long): WIN32_ERROR =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_AppPolicyGetShowDeveloperDiagnostic(processtoken, policy).toUInt()

public actual fun AppPolicyGetThreadInitializationType(processtoken: HANDLE, policy: Long): WIN32_ERROR =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_AppPolicyGetThreadInitializationType(processtoken, policy).toUInt()

public actual fun AppPolicyGetWindowingModel(processtoken: HANDLE, policy: Long): WIN32_ERROR =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_AppPolicyGetWindowingModel(processtoken, policy).toUInt()

public actual fun CheckIsMSIXPackage(packagefullname: PCWSTR, ismsixpackage: Long): HRESULT =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_CheckIsMSIXPackage(packagefullname, ismsixpackage)

public actual fun ClosePackageInfo(packageinforeference: Long): WIN32_ERROR =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_ClosePackageInfo(packageinforeference).toUInt()

public actual fun CreatePackageVirtualizationContext(packagefamilyname: PCWSTR, context: Long): HRESULT =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_CreatePackageVirtualizationContext(packagefamilyname, context)

public actual fun DeactivatePackageVirtualizationContext(cookie: ULong) {
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_DeactivatePackageVirtualizationContext(cookie.toLong())
}

public actual fun DeletePackageDependency(packagedependencyid: PCWSTR): HRESULT =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_DeletePackageDependency(packagedependencyid)

public actual fun DuplicatePackageVirtualizationContext(sourcecontext: PACKAGE_VIRTUALIZATION_CONTEXT_HANDLE, destcontext: Long): HRESULT =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_DuplicatePackageVirtualizationContext(sourcecontext, destcontext)

public actual fun FindPackagesByPackageFamily(packagefamilyname: PCWSTR, packagefilters: UInt, count: Long, packagefullnames: Long, bufferlength: Long, buffer: PWSTR, packageproperties: Long): WIN32_ERROR =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_FindPackagesByPackageFamily(packagefamilyname, packagefilters.toInt(), count, packagefullnames, bufferlength, buffer, packageproperties).toUInt()

public actual fun FormatApplicationUserModelId(packagefamilyname: PCWSTR, packagerelativeapplicationid: PCWSTR, applicationusermodelidlength: Long, applicationusermodelid: PWSTR): WIN32_ERROR =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_FormatApplicationUserModelId(packagefamilyname, packagerelativeapplicationid, applicationusermodelidlength, applicationusermodelid).toUInt()

public actual fun GetApplicationUserModelId(hprocess: HANDLE, applicationusermodelidlength: Long, applicationusermodelid: PWSTR): WIN32_ERROR =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_GetApplicationUserModelId(hprocess, applicationusermodelidlength, applicationusermodelid).toUInt()

public actual fun GetApplicationUserModelIdFromToken(token: HANDLE, applicationusermodelidlength: Long, applicationusermodelid: PWSTR): WIN32_ERROR =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_GetApplicationUserModelIdFromToken(token, applicationusermodelidlength, applicationusermodelid).toUInt()

public actual fun GetCurrentApplicationUserModelId(applicationusermodelidlength: Long, applicationusermodelid: PWSTR): WIN32_ERROR =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_GetCurrentApplicationUserModelId(applicationusermodelidlength, applicationusermodelid).toUInt()

public actual fun GetCurrentPackageFamilyName(packagefamilynamelength: Long, packagefamilyname: PWSTR): WIN32_ERROR =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_GetCurrentPackageFamilyName(packagefamilynamelength, packagefamilyname).toUInt()

public actual fun GetCurrentPackageFullName(packagefullnamelength: Long, packagefullname: PWSTR): WIN32_ERROR =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_GetCurrentPackageFullName(packagefullnamelength, packagefullname).toUInt()

public actual fun GetCurrentPackageId(bufferlength: Long, buffer: Long): WIN32_ERROR =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_GetCurrentPackageId(bufferlength, buffer).toUInt()

public actual fun GetCurrentPackageInfo(flags: UInt, bufferlength: Long, buffer: Long, count: Long): WIN32_ERROR =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_GetCurrentPackageInfo(flags.toInt(), bufferlength, buffer, count).toUInt()

public actual fun GetCurrentPackageInfo2(flags: UInt, packagepathtype: PackagePathType, bufferlength: Long, buffer: Long, count: Long): WIN32_ERROR =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_GetCurrentPackageInfo2(flags.toInt(), packagepathtype, bufferlength, buffer, count).toUInt()

public actual fun GetCurrentPackageInfo3(flags: UInt, packageinfotype: PackageInfo3Type, bufferlength: Long, buffer: Long, count: Long): HRESULT =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_GetCurrentPackageInfo3(flags.toInt(), packageinfotype, bufferlength, buffer, count)

public actual fun GetCurrentPackagePath(pathlength: Long, path: PWSTR): WIN32_ERROR =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_GetCurrentPackagePath(pathlength, path).toUInt()

public actual fun GetCurrentPackagePath2(packagepathtype: PackagePathType, pathlength: Long, path: PWSTR): WIN32_ERROR =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_GetCurrentPackagePath2(packagepathtype, pathlength, path).toUInt()

public actual fun GetCurrentPackageVirtualizationContext(): PACKAGE_VIRTUALIZATION_CONTEXT_HANDLE =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_GetCurrentPackageVirtualizationContext()

public actual fun GetIdForPackageDependencyContext(packagedependencycontext: PACKAGEDEPENDENCY_CONTEXT, packagedependencyid: Long): HRESULT =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_GetIdForPackageDependencyContext(packagedependencycontext, packagedependencyid)

public actual fun GetPackageApplicationIds(packageinforeference: Long, bufferlength: Long, buffer: Long, count: Long): WIN32_ERROR =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_GetPackageApplicationIds(packageinforeference, bufferlength, buffer, count).toUInt()

public actual fun GetPackageFamilyName(hprocess: HANDLE, packagefamilynamelength: Long, packagefamilyname: PWSTR): WIN32_ERROR =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_GetPackageFamilyName(hprocess, packagefamilynamelength, packagefamilyname).toUInt()

public actual fun GetPackageFamilyNameFromToken(token: HANDLE, packagefamilynamelength: Long, packagefamilyname: PWSTR): WIN32_ERROR =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_GetPackageFamilyNameFromToken(token, packagefamilynamelength, packagefamilyname).toUInt()

public actual fun GetPackageFullName(hprocess: HANDLE, packagefullnamelength: Long, packagefullname: PWSTR): WIN32_ERROR =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_GetPackageFullName(hprocess, packagefullnamelength, packagefullname).toUInt()

public actual fun GetPackageFullNameFromToken(token: HANDLE, packagefullnamelength: Long, packagefullname: PWSTR): WIN32_ERROR =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_GetPackageFullNameFromToken(token, packagefullnamelength, packagefullname).toUInt()

public actual fun GetPackageGraphRevisionId(): UInt =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_GetPackageGraphRevisionId().toUInt()

public actual fun GetPackageId(hprocess: HANDLE, bufferlength: Long, buffer: Long): WIN32_ERROR =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_GetPackageId(hprocess, bufferlength, buffer).toUInt()

public actual fun GetPackageInfo(packageinforeference: Long, flags: UInt, bufferlength: Long, buffer: Long, count: Long): WIN32_ERROR =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_GetPackageInfo(packageinforeference, flags.toInt(), bufferlength, buffer, count).toUInt()

public actual fun GetPackageInfo2(packageinforeference: Long, flags: UInt, packagepathtype: PackagePathType, bufferlength: Long, buffer: Long, count: Long): WIN32_ERROR =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_GetPackageInfo2(packageinforeference, flags.toInt(), packagepathtype, bufferlength, buffer, count).toUInt()

public actual fun GetPackagePath(packageid: Long, reserved: UInt, pathlength: Long, path: PWSTR): WIN32_ERROR =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_GetPackagePath(packageid, reserved.toInt(), pathlength, path).toUInt()

public actual fun GetPackagePathByFullName(packagefullname: PCWSTR, pathlength: Long, path: PWSTR): WIN32_ERROR =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_GetPackagePathByFullName(packagefullname, pathlength, path).toUInt()

public actual fun GetPackagePathByFullName2(packagefullname: PCWSTR, packagepathtype: PackagePathType, pathlength: Long, path: PWSTR): WIN32_ERROR =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_GetPackagePathByFullName2(packagefullname, packagepathtype, pathlength, path).toUInt()

public actual fun GetPackagesByPackageFamily(packagefamilyname: PCWSTR, count: Long, packagefullnames: Long, bufferlength: Long, buffer: PWSTR): WIN32_ERROR =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_GetPackagesByPackageFamily(packagefamilyname, count, packagefullnames, bufferlength, buffer).toUInt()

public actual fun GetProcessesInVirtualizationContext(packagefamilyname: PCWSTR, count: Long, processes: Long): HRESULT =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_GetProcessesInVirtualizationContext(packagefamilyname, count, processes)

public actual fun GetResolvedPackageFullNameForPackageDependency(packagedependencyid: PCWSTR, packagefullname: Long): HRESULT =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_GetResolvedPackageFullNameForPackageDependency(packagedependencyid, packagefullname)

public actual fun GetStagedPackageOrigin(packagefullname: PCWSTR, origin: Long): WIN32_ERROR =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_GetStagedPackageOrigin(packagefullname, origin).toUInt()

public actual fun GetStagedPackagePathByFullName(packagefullname: PCWSTR, pathlength: Long, path: PWSTR): WIN32_ERROR =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_GetStagedPackagePathByFullName(packagefullname, pathlength, path).toUInt()

public actual fun GetStagedPackagePathByFullName2(packagefullname: PCWSTR, packagepathtype: PackagePathType, pathlength: Long, path: PWSTR): WIN32_ERROR =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_GetStagedPackagePathByFullName2(packagefullname, packagepathtype, pathlength, path).toUInt()

public actual fun OpenPackageInfoByFullName(packagefullname: PCWSTR, reserved: UInt, packageinforeference: Long): WIN32_ERROR =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_OpenPackageInfoByFullName(packagefullname, reserved.toInt(), packageinforeference).toUInt()

public actual fun OpenPackageInfoByFullNameForUser(usersid: PSID, packagefullname: PCWSTR, reserved: UInt, packageinforeference: Long): WIN32_ERROR =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_OpenPackageInfoByFullNameForUser(usersid, packagefullname, reserved.toInt(), packageinforeference).toUInt()

public actual fun PackageFamilyNameFromFullName(packagefullname: PCWSTR, packagefamilynamelength: Long, packagefamilyname: PWSTR): WIN32_ERROR =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_PackageFamilyNameFromFullName(packagefullname, packagefamilynamelength, packagefamilyname).toUInt()

public actual fun PackageFamilyNameFromId(packageid: Long, packagefamilynamelength: Long, packagefamilyname: PWSTR): WIN32_ERROR =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_PackageFamilyNameFromId(packageid, packagefamilynamelength, packagefamilyname).toUInt()

public actual fun PackageFullNameFromId(packageid: Long, packagefullnamelength: Long, packagefullname: PWSTR): WIN32_ERROR =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_PackageFullNameFromId(packageid, packagefullnamelength, packagefullname).toUInt()

public actual fun PackageIdFromFullName(packagefullname: PCWSTR, flags: UInt, bufferlength: Long, buffer: Long): WIN32_ERROR =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_PackageIdFromFullName(packagefullname, flags.toInt(), bufferlength, buffer).toUInt()

public actual fun PackageNameAndPublisherIdFromFamilyName(packagefamilyname: PCWSTR, packagenamelength: Long, packagename: PWSTR, packagepublisheridlength: Long, packagepublisherid: PWSTR): WIN32_ERROR =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_PackageNameAndPublisherIdFromFamilyName(packagefamilyname, packagenamelength, packagename, packagepublisheridlength, packagepublisherid).toUInt()

public actual fun ParseApplicationUserModelId(applicationusermodelid: PCWSTR, packagefamilynamelength: Long, packagefamilyname: PWSTR, packagerelativeapplicationidlength: Long, packagerelativeapplicationid: PWSTR): WIN32_ERROR =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_ParseApplicationUserModelId(applicationusermodelid, packagefamilynamelength, packagefamilyname, packagerelativeapplicationidlength, packagerelativeapplicationid).toUInt()

public actual fun ReleasePackageVirtualizationContext(context: PACKAGE_VIRTUALIZATION_CONTEXT_HANDLE) {
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_ReleasePackageVirtualizationContext(context)
}

public actual fun RemovePackageDependency(packagedependencycontext: PACKAGEDEPENDENCY_CONTEXT): HRESULT =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_RemovePackageDependency(packagedependencycontext)

public actual fun TryCreatePackageDependency(user: PSID, packagefamilyname: PCWSTR, minversion: PACKAGE_VERSION, packagedependencyprocessorarchitectures: PackageDependencyProcessorArchitectures, lifetimekind: PackageDependencyLifetimeKind, lifetimeartifact: PCWSTR, options: CreatePackageDependencyOptions, packagedependencyid: Long): HRESULT =
    0

public actual fun VerifyApplicationUserModelId(applicationusermodelid: PCWSTR): WIN32_ERROR =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_VerifyApplicationUserModelId(applicationusermodelid).toUInt()

public actual fun VerifyPackageFamilyName(packagefamilyname: PCWSTR): WIN32_ERROR =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_VerifyPackageFamilyName(packagefamilyname).toUInt()

public actual fun VerifyPackageFullName(packagefullname: PCWSTR): WIN32_ERROR =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_VerifyPackageFullName(packagefullname).toUInt()

public actual fun VerifyPackageId(packageid: Long): WIN32_ERROR =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_VerifyPackageId(packageid).toUInt()

public actual fun VerifyPackageRelativeApplicationId(packagerelativeapplicationid: PCWSTR): WIN32_ERROR =
    WindowsWin32StoragePackagingAppxJniBridge.windowssys_windows_win32_storage_packaging_appx_VerifyPackageRelativeApplicationId(packagerelativeapplicationid).toUInt()
