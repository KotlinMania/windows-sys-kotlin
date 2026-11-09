@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.WIN32_ERROR
import io.github.kotlinmania.windowssys.windows.win32.security.PSID

private val _windowsWin32StoragePackagingAppxNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun ActivatePackageVirtualizationContext(context: PACKAGE_VIRTUALIZATION_CONTEXT_HANDLE, cookie: Long): HRESULT =
    if (_windowsWin32StoragePackagingAppxNapiAddon != null) (_windowsWin32StoragePackagingAppxNapiAddon.windowssys_windows_win32_storage_packaging_appx_ActivatePackageVirtualizationContext(context.toString(), cookie.toString()) as Int) else 0

public actual fun AddPackageDependency(packagedependencyid: PCWSTR, rank: Int, options: AddPackageDependencyOptions, packagedependencycontext: Long, packagefullname: Long): HRESULT =
    if (_windowsWin32StoragePackagingAppxNapiAddon != null) (_windowsWin32StoragePackagingAppxNapiAddon.windowssys_windows_win32_storage_packaging_appx_AddPackageDependency(packagedependencyid.toString(), rank, options, packagedependencycontext.toString(), packagefullname.toString()) as Int) else 0

public actual fun AppPolicyGetClrCompat(processtoken: HANDLE, policy: Long): WIN32_ERROR =
    if (_windowsWin32StoragePackagingAppxNapiAddon != null) (_windowsWin32StoragePackagingAppxNapiAddon.windowssys_windows_win32_storage_packaging_appx_AppPolicyGetClrCompat(processtoken.toString(), policy.toString()) as Int).toUInt() else 0u

public actual fun AppPolicyGetCreateFileAccess(processtoken: HANDLE, policy: Long): WIN32_ERROR =
    if (_windowsWin32StoragePackagingAppxNapiAddon != null) (_windowsWin32StoragePackagingAppxNapiAddon.windowssys_windows_win32_storage_packaging_appx_AppPolicyGetCreateFileAccess(processtoken.toString(), policy.toString()) as Int).toUInt() else 0u

public actual fun AppPolicyGetLifecycleManagement(processtoken: HANDLE, policy: Long): WIN32_ERROR =
    if (_windowsWin32StoragePackagingAppxNapiAddon != null) (_windowsWin32StoragePackagingAppxNapiAddon.windowssys_windows_win32_storage_packaging_appx_AppPolicyGetLifecycleManagement(processtoken.toString(), policy.toString()) as Int).toUInt() else 0u

public actual fun AppPolicyGetMediaFoundationCodecLoading(processtoken: HANDLE, policy: Long): WIN32_ERROR =
    if (_windowsWin32StoragePackagingAppxNapiAddon != null) (_windowsWin32StoragePackagingAppxNapiAddon.windowssys_windows_win32_storage_packaging_appx_AppPolicyGetMediaFoundationCodecLoading(processtoken.toString(), policy.toString()) as Int).toUInt() else 0u

public actual fun AppPolicyGetProcessTerminationMethod(processtoken: HANDLE, policy: Long): WIN32_ERROR =
    if (_windowsWin32StoragePackagingAppxNapiAddon != null) (_windowsWin32StoragePackagingAppxNapiAddon.windowssys_windows_win32_storage_packaging_appx_AppPolicyGetProcessTerminationMethod(processtoken.toString(), policy.toString()) as Int).toUInt() else 0u

public actual fun AppPolicyGetShowDeveloperDiagnostic(processtoken: HANDLE, policy: Long): WIN32_ERROR =
    if (_windowsWin32StoragePackagingAppxNapiAddon != null) (_windowsWin32StoragePackagingAppxNapiAddon.windowssys_windows_win32_storage_packaging_appx_AppPolicyGetShowDeveloperDiagnostic(processtoken.toString(), policy.toString()) as Int).toUInt() else 0u

public actual fun AppPolicyGetThreadInitializationType(processtoken: HANDLE, policy: Long): WIN32_ERROR =
    if (_windowsWin32StoragePackagingAppxNapiAddon != null) (_windowsWin32StoragePackagingAppxNapiAddon.windowssys_windows_win32_storage_packaging_appx_AppPolicyGetThreadInitializationType(processtoken.toString(), policy.toString()) as Int).toUInt() else 0u

public actual fun AppPolicyGetWindowingModel(processtoken: HANDLE, policy: Long): WIN32_ERROR =
    if (_windowsWin32StoragePackagingAppxNapiAddon != null) (_windowsWin32StoragePackagingAppxNapiAddon.windowssys_windows_win32_storage_packaging_appx_AppPolicyGetWindowingModel(processtoken.toString(), policy.toString()) as Int).toUInt() else 0u

public actual fun CheckIsMSIXPackage(packagefullname: PCWSTR, ismsixpackage: Long): HRESULT =
    if (_windowsWin32StoragePackagingAppxNapiAddon != null) (_windowsWin32StoragePackagingAppxNapiAddon.windowssys_windows_win32_storage_packaging_appx_CheckIsMSIXPackage(packagefullname.toString(), ismsixpackage.toString()) as Int) else 0

public actual fun ClosePackageInfo(packageinforeference: Long): WIN32_ERROR =
    if (_windowsWin32StoragePackagingAppxNapiAddon != null) (_windowsWin32StoragePackagingAppxNapiAddon.windowssys_windows_win32_storage_packaging_appx_ClosePackageInfo(packageinforeference.toString()) as Int).toUInt() else 0u

public actual fun CreatePackageVirtualizationContext(packagefamilyname: PCWSTR, context: Long): HRESULT =
    if (_windowsWin32StoragePackagingAppxNapiAddon != null) (_windowsWin32StoragePackagingAppxNapiAddon.windowssys_windows_win32_storage_packaging_appx_CreatePackageVirtualizationContext(packagefamilyname.toString(), context.toString()) as Int) else 0

public actual fun DeactivatePackageVirtualizationContext(cookie: ULong) {
    if (_windowsWin32StoragePackagingAppxNapiAddon != null) {
        _windowsWin32StoragePackagingAppxNapiAddon.windowssys_windows_win32_storage_packaging_appx_DeactivatePackageVirtualizationContext(cookie.toString())
    }
}

public actual fun DeletePackageDependency(packagedependencyid: PCWSTR): HRESULT =
    if (_windowsWin32StoragePackagingAppxNapiAddon != null) (_windowsWin32StoragePackagingAppxNapiAddon.windowssys_windows_win32_storage_packaging_appx_DeletePackageDependency(packagedependencyid.toString()) as Int) else 0

public actual fun DuplicatePackageVirtualizationContext(sourcecontext: PACKAGE_VIRTUALIZATION_CONTEXT_HANDLE, destcontext: Long): HRESULT =
    if (_windowsWin32StoragePackagingAppxNapiAddon != null) (_windowsWin32StoragePackagingAppxNapiAddon.windowssys_windows_win32_storage_packaging_appx_DuplicatePackageVirtualizationContext(sourcecontext.toString(), destcontext.toString()) as Int) else 0

public actual fun FindPackagesByPackageFamily(packagefamilyname: PCWSTR, packagefilters: UInt, count: Long, packagefullnames: Long, bufferlength: Long, buffer: PWSTR, packageproperties: Long): WIN32_ERROR =
    if (_windowsWin32StoragePackagingAppxNapiAddon != null) (_windowsWin32StoragePackagingAppxNapiAddon.windowssys_windows_win32_storage_packaging_appx_FindPackagesByPackageFamily(packagefamilyname.toString(), packagefilters.toInt(), count.toString(), packagefullnames.toString(), bufferlength.toString(), buffer.toString(), packageproperties.toString()) as Int).toUInt() else 0u

public actual fun FormatApplicationUserModelId(packagefamilyname: PCWSTR, packagerelativeapplicationid: PCWSTR, applicationusermodelidlength: Long, applicationusermodelid: PWSTR): WIN32_ERROR =
    if (_windowsWin32StoragePackagingAppxNapiAddon != null) (_windowsWin32StoragePackagingAppxNapiAddon.windowssys_windows_win32_storage_packaging_appx_FormatApplicationUserModelId(packagefamilyname.toString(), packagerelativeapplicationid.toString(), applicationusermodelidlength.toString(), applicationusermodelid.toString()) as Int).toUInt() else 0u

public actual fun GetApplicationUserModelId(hprocess: HANDLE, applicationusermodelidlength: Long, applicationusermodelid: PWSTR): WIN32_ERROR =
    if (_windowsWin32StoragePackagingAppxNapiAddon != null) (_windowsWin32StoragePackagingAppxNapiAddon.windowssys_windows_win32_storage_packaging_appx_GetApplicationUserModelId(hprocess.toString(), applicationusermodelidlength.toString(), applicationusermodelid.toString()) as Int).toUInt() else 0u

public actual fun GetApplicationUserModelIdFromToken(token: HANDLE, applicationusermodelidlength: Long, applicationusermodelid: PWSTR): WIN32_ERROR =
    if (_windowsWin32StoragePackagingAppxNapiAddon != null) (_windowsWin32StoragePackagingAppxNapiAddon.windowssys_windows_win32_storage_packaging_appx_GetApplicationUserModelIdFromToken(token.toString(), applicationusermodelidlength.toString(), applicationusermodelid.toString()) as Int).toUInt() else 0u

public actual fun GetCurrentApplicationUserModelId(applicationusermodelidlength: Long, applicationusermodelid: PWSTR): WIN32_ERROR =
    if (_windowsWin32StoragePackagingAppxNapiAddon != null) (_windowsWin32StoragePackagingAppxNapiAddon.windowssys_windows_win32_storage_packaging_appx_GetCurrentApplicationUserModelId(applicationusermodelidlength.toString(), applicationusermodelid.toString()) as Int).toUInt() else 0u

public actual fun GetCurrentPackageFamilyName(packagefamilynamelength: Long, packagefamilyname: PWSTR): WIN32_ERROR =
    if (_windowsWin32StoragePackagingAppxNapiAddon != null) (_windowsWin32StoragePackagingAppxNapiAddon.windowssys_windows_win32_storage_packaging_appx_GetCurrentPackageFamilyName(packagefamilynamelength.toString(), packagefamilyname.toString()) as Int).toUInt() else 0u

public actual fun GetCurrentPackageFullName(packagefullnamelength: Long, packagefullname: PWSTR): WIN32_ERROR =
    if (_windowsWin32StoragePackagingAppxNapiAddon != null) (_windowsWin32StoragePackagingAppxNapiAddon.windowssys_windows_win32_storage_packaging_appx_GetCurrentPackageFullName(packagefullnamelength.toString(), packagefullname.toString()) as Int).toUInt() else 0u

public actual fun GetCurrentPackageId(bufferlength: Long, buffer: Long): WIN32_ERROR =
    if (_windowsWin32StoragePackagingAppxNapiAddon != null) (_windowsWin32StoragePackagingAppxNapiAddon.windowssys_windows_win32_storage_packaging_appx_GetCurrentPackageId(bufferlength.toString(), buffer.toString()) as Int).toUInt() else 0u

public actual fun GetCurrentPackageInfo(flags: UInt, bufferlength: Long, buffer: Long, count: Long): WIN32_ERROR =
    if (_windowsWin32StoragePackagingAppxNapiAddon != null) (_windowsWin32StoragePackagingAppxNapiAddon.windowssys_windows_win32_storage_packaging_appx_GetCurrentPackageInfo(flags.toInt(), bufferlength.toString(), buffer.toString(), count.toString()) as Int).toUInt() else 0u

public actual fun GetCurrentPackageInfo2(flags: UInt, packagepathtype: PackagePathType, bufferlength: Long, buffer: Long, count: Long): WIN32_ERROR =
    if (_windowsWin32StoragePackagingAppxNapiAddon != null) (_windowsWin32StoragePackagingAppxNapiAddon.windowssys_windows_win32_storage_packaging_appx_GetCurrentPackageInfo2(flags.toInt(), packagepathtype, bufferlength.toString(), buffer.toString(), count.toString()) as Int).toUInt() else 0u

public actual fun GetCurrentPackageInfo3(flags: UInt, packageinfotype: PackageInfo3Type, bufferlength: Long, buffer: Long, count: Long): HRESULT =
    if (_windowsWin32StoragePackagingAppxNapiAddon != null) (_windowsWin32StoragePackagingAppxNapiAddon.windowssys_windows_win32_storage_packaging_appx_GetCurrentPackageInfo3(flags.toInt(), packageinfotype, bufferlength.toString(), buffer.toString(), count.toString()) as Int) else 0

public actual fun GetCurrentPackagePath(pathlength: Long, path: PWSTR): WIN32_ERROR =
    if (_windowsWin32StoragePackagingAppxNapiAddon != null) (_windowsWin32StoragePackagingAppxNapiAddon.windowssys_windows_win32_storage_packaging_appx_GetCurrentPackagePath(pathlength.toString(), path.toString()) as Int).toUInt() else 0u

public actual fun GetCurrentPackagePath2(packagepathtype: PackagePathType, pathlength: Long, path: PWSTR): WIN32_ERROR =
    if (_windowsWin32StoragePackagingAppxNapiAddon != null) (_windowsWin32StoragePackagingAppxNapiAddon.windowssys_windows_win32_storage_packaging_appx_GetCurrentPackagePath2(packagepathtype, pathlength.toString(), path.toString()) as Int).toUInt() else 0u

public actual fun GetCurrentPackageVirtualizationContext(): PACKAGE_VIRTUALIZATION_CONTEXT_HANDLE =
    if (_windowsWin32StoragePackagingAppxNapiAddon != null) (_windowsWin32StoragePackagingAppxNapiAddon.windowssys_windows_win32_storage_packaging_appx_GetCurrentPackageVirtualizationContext() as String).toLong() else 0L

public actual fun GetIdForPackageDependencyContext(packagedependencycontext: PACKAGEDEPENDENCY_CONTEXT, packagedependencyid: Long): HRESULT =
    if (_windowsWin32StoragePackagingAppxNapiAddon != null) (_windowsWin32StoragePackagingAppxNapiAddon.windowssys_windows_win32_storage_packaging_appx_GetIdForPackageDependencyContext(packagedependencycontext.toString(), packagedependencyid.toString()) as Int) else 0

public actual fun GetPackageApplicationIds(packageinforeference: Long, bufferlength: Long, buffer: Long, count: Long): WIN32_ERROR =
    if (_windowsWin32StoragePackagingAppxNapiAddon != null) (_windowsWin32StoragePackagingAppxNapiAddon.windowssys_windows_win32_storage_packaging_appx_GetPackageApplicationIds(packageinforeference.toString(), bufferlength.toString(), buffer.toString(), count.toString()) as Int).toUInt() else 0u

public actual fun GetPackageFamilyName(hprocess: HANDLE, packagefamilynamelength: Long, packagefamilyname: PWSTR): WIN32_ERROR =
    if (_windowsWin32StoragePackagingAppxNapiAddon != null) (_windowsWin32StoragePackagingAppxNapiAddon.windowssys_windows_win32_storage_packaging_appx_GetPackageFamilyName(hprocess.toString(), packagefamilynamelength.toString(), packagefamilyname.toString()) as Int).toUInt() else 0u

public actual fun GetPackageFamilyNameFromToken(token: HANDLE, packagefamilynamelength: Long, packagefamilyname: PWSTR): WIN32_ERROR =
    if (_windowsWin32StoragePackagingAppxNapiAddon != null) (_windowsWin32StoragePackagingAppxNapiAddon.windowssys_windows_win32_storage_packaging_appx_GetPackageFamilyNameFromToken(token.toString(), packagefamilynamelength.toString(), packagefamilyname.toString()) as Int).toUInt() else 0u

public actual fun GetPackageFullName(hprocess: HANDLE, packagefullnamelength: Long, packagefullname: PWSTR): WIN32_ERROR =
    if (_windowsWin32StoragePackagingAppxNapiAddon != null) (_windowsWin32StoragePackagingAppxNapiAddon.windowssys_windows_win32_storage_packaging_appx_GetPackageFullName(hprocess.toString(), packagefullnamelength.toString(), packagefullname.toString()) as Int).toUInt() else 0u

public actual fun GetPackageFullNameFromToken(token: HANDLE, packagefullnamelength: Long, packagefullname: PWSTR): WIN32_ERROR =
    if (_windowsWin32StoragePackagingAppxNapiAddon != null) (_windowsWin32StoragePackagingAppxNapiAddon.windowssys_windows_win32_storage_packaging_appx_GetPackageFullNameFromToken(token.toString(), packagefullnamelength.toString(), packagefullname.toString()) as Int).toUInt() else 0u

public actual fun GetPackageGraphRevisionId(): UInt =
    if (_windowsWin32StoragePackagingAppxNapiAddon != null) (_windowsWin32StoragePackagingAppxNapiAddon.windowssys_windows_win32_storage_packaging_appx_GetPackageGraphRevisionId() as Int).toUInt() else 0u

public actual fun GetPackageId(hprocess: HANDLE, bufferlength: Long, buffer: Long): WIN32_ERROR =
    if (_windowsWin32StoragePackagingAppxNapiAddon != null) (_windowsWin32StoragePackagingAppxNapiAddon.windowssys_windows_win32_storage_packaging_appx_GetPackageId(hprocess.toString(), bufferlength.toString(), buffer.toString()) as Int).toUInt() else 0u

public actual fun GetPackageInfo(packageinforeference: Long, flags: UInt, bufferlength: Long, buffer: Long, count: Long): WIN32_ERROR =
    if (_windowsWin32StoragePackagingAppxNapiAddon != null) (_windowsWin32StoragePackagingAppxNapiAddon.windowssys_windows_win32_storage_packaging_appx_GetPackageInfo(packageinforeference.toString(), flags.toInt(), bufferlength.toString(), buffer.toString(), count.toString()) as Int).toUInt() else 0u

public actual fun GetPackageInfo2(packageinforeference: Long, flags: UInt, packagepathtype: PackagePathType, bufferlength: Long, buffer: Long, count: Long): WIN32_ERROR =
    if (_windowsWin32StoragePackagingAppxNapiAddon != null) (_windowsWin32StoragePackagingAppxNapiAddon.windowssys_windows_win32_storage_packaging_appx_GetPackageInfo2(packageinforeference.toString(), flags.toInt(), packagepathtype, bufferlength.toString(), buffer.toString(), count.toString()) as Int).toUInt() else 0u

public actual fun GetPackagePath(packageid: Long, reserved: UInt, pathlength: Long, path: PWSTR): WIN32_ERROR =
    if (_windowsWin32StoragePackagingAppxNapiAddon != null) (_windowsWin32StoragePackagingAppxNapiAddon.windowssys_windows_win32_storage_packaging_appx_GetPackagePath(packageid.toString(), reserved.toInt(), pathlength.toString(), path.toString()) as Int).toUInt() else 0u

public actual fun GetPackagePathByFullName(packagefullname: PCWSTR, pathlength: Long, path: PWSTR): WIN32_ERROR =
    if (_windowsWin32StoragePackagingAppxNapiAddon != null) (_windowsWin32StoragePackagingAppxNapiAddon.windowssys_windows_win32_storage_packaging_appx_GetPackagePathByFullName(packagefullname.toString(), pathlength.toString(), path.toString()) as Int).toUInt() else 0u

public actual fun GetPackagePathByFullName2(packagefullname: PCWSTR, packagepathtype: PackagePathType, pathlength: Long, path: PWSTR): WIN32_ERROR =
    if (_windowsWin32StoragePackagingAppxNapiAddon != null) (_windowsWin32StoragePackagingAppxNapiAddon.windowssys_windows_win32_storage_packaging_appx_GetPackagePathByFullName2(packagefullname.toString(), packagepathtype, pathlength.toString(), path.toString()) as Int).toUInt() else 0u

public actual fun GetPackagesByPackageFamily(packagefamilyname: PCWSTR, count: Long, packagefullnames: Long, bufferlength: Long, buffer: PWSTR): WIN32_ERROR =
    if (_windowsWin32StoragePackagingAppxNapiAddon != null) (_windowsWin32StoragePackagingAppxNapiAddon.windowssys_windows_win32_storage_packaging_appx_GetPackagesByPackageFamily(packagefamilyname.toString(), count.toString(), packagefullnames.toString(), bufferlength.toString(), buffer.toString()) as Int).toUInt() else 0u

public actual fun GetProcessesInVirtualizationContext(packagefamilyname: PCWSTR, count: Long, processes: Long): HRESULT =
    if (_windowsWin32StoragePackagingAppxNapiAddon != null) (_windowsWin32StoragePackagingAppxNapiAddon.windowssys_windows_win32_storage_packaging_appx_GetProcessesInVirtualizationContext(packagefamilyname.toString(), count.toString(), processes.toString()) as Int) else 0

public actual fun GetResolvedPackageFullNameForPackageDependency(packagedependencyid: PCWSTR, packagefullname: Long): HRESULT =
    if (_windowsWin32StoragePackagingAppxNapiAddon != null) (_windowsWin32StoragePackagingAppxNapiAddon.windowssys_windows_win32_storage_packaging_appx_GetResolvedPackageFullNameForPackageDependency(packagedependencyid.toString(), packagefullname.toString()) as Int) else 0

public actual fun GetStagedPackageOrigin(packagefullname: PCWSTR, origin: Long): WIN32_ERROR =
    if (_windowsWin32StoragePackagingAppxNapiAddon != null) (_windowsWin32StoragePackagingAppxNapiAddon.windowssys_windows_win32_storage_packaging_appx_GetStagedPackageOrigin(packagefullname.toString(), origin.toString()) as Int).toUInt() else 0u

public actual fun GetStagedPackagePathByFullName(packagefullname: PCWSTR, pathlength: Long, path: PWSTR): WIN32_ERROR =
    if (_windowsWin32StoragePackagingAppxNapiAddon != null) (_windowsWin32StoragePackagingAppxNapiAddon.windowssys_windows_win32_storage_packaging_appx_GetStagedPackagePathByFullName(packagefullname.toString(), pathlength.toString(), path.toString()) as Int).toUInt() else 0u

public actual fun GetStagedPackagePathByFullName2(packagefullname: PCWSTR, packagepathtype: PackagePathType, pathlength: Long, path: PWSTR): WIN32_ERROR =
    if (_windowsWin32StoragePackagingAppxNapiAddon != null) (_windowsWin32StoragePackagingAppxNapiAddon.windowssys_windows_win32_storage_packaging_appx_GetStagedPackagePathByFullName2(packagefullname.toString(), packagepathtype, pathlength.toString(), path.toString()) as Int).toUInt() else 0u

public actual fun OpenPackageInfoByFullName(packagefullname: PCWSTR, reserved: UInt, packageinforeference: Long): WIN32_ERROR =
    if (_windowsWin32StoragePackagingAppxNapiAddon != null) (_windowsWin32StoragePackagingAppxNapiAddon.windowssys_windows_win32_storage_packaging_appx_OpenPackageInfoByFullName(packagefullname.toString(), reserved.toInt(), packageinforeference.toString()) as Int).toUInt() else 0u

public actual fun OpenPackageInfoByFullNameForUser(usersid: PSID, packagefullname: PCWSTR, reserved: UInt, packageinforeference: Long): WIN32_ERROR =
    if (_windowsWin32StoragePackagingAppxNapiAddon != null) (_windowsWin32StoragePackagingAppxNapiAddon.windowssys_windows_win32_storage_packaging_appx_OpenPackageInfoByFullNameForUser(usersid.toString(), packagefullname.toString(), reserved.toInt(), packageinforeference.toString()) as Int).toUInt() else 0u

public actual fun PackageFamilyNameFromFullName(packagefullname: PCWSTR, packagefamilynamelength: Long, packagefamilyname: PWSTR): WIN32_ERROR =
    if (_windowsWin32StoragePackagingAppxNapiAddon != null) (_windowsWin32StoragePackagingAppxNapiAddon.windowssys_windows_win32_storage_packaging_appx_PackageFamilyNameFromFullName(packagefullname.toString(), packagefamilynamelength.toString(), packagefamilyname.toString()) as Int).toUInt() else 0u

public actual fun PackageFamilyNameFromId(packageid: Long, packagefamilynamelength: Long, packagefamilyname: PWSTR): WIN32_ERROR =
    if (_windowsWin32StoragePackagingAppxNapiAddon != null) (_windowsWin32StoragePackagingAppxNapiAddon.windowssys_windows_win32_storage_packaging_appx_PackageFamilyNameFromId(packageid.toString(), packagefamilynamelength.toString(), packagefamilyname.toString()) as Int).toUInt() else 0u

public actual fun PackageFullNameFromId(packageid: Long, packagefullnamelength: Long, packagefullname: PWSTR): WIN32_ERROR =
    if (_windowsWin32StoragePackagingAppxNapiAddon != null) (_windowsWin32StoragePackagingAppxNapiAddon.windowssys_windows_win32_storage_packaging_appx_PackageFullNameFromId(packageid.toString(), packagefullnamelength.toString(), packagefullname.toString()) as Int).toUInt() else 0u

public actual fun PackageIdFromFullName(packagefullname: PCWSTR, flags: UInt, bufferlength: Long, buffer: Long): WIN32_ERROR =
    if (_windowsWin32StoragePackagingAppxNapiAddon != null) (_windowsWin32StoragePackagingAppxNapiAddon.windowssys_windows_win32_storage_packaging_appx_PackageIdFromFullName(packagefullname.toString(), flags.toInt(), bufferlength.toString(), buffer.toString()) as Int).toUInt() else 0u

public actual fun PackageNameAndPublisherIdFromFamilyName(packagefamilyname: PCWSTR, packagenamelength: Long, packagename: PWSTR, packagepublisheridlength: Long, packagepublisherid: PWSTR): WIN32_ERROR =
    if (_windowsWin32StoragePackagingAppxNapiAddon != null) (_windowsWin32StoragePackagingAppxNapiAddon.windowssys_windows_win32_storage_packaging_appx_PackageNameAndPublisherIdFromFamilyName(packagefamilyname.toString(), packagenamelength.toString(), packagename.toString(), packagepublisheridlength.toString(), packagepublisherid.toString()) as Int).toUInt() else 0u

public actual fun ParseApplicationUserModelId(applicationusermodelid: PCWSTR, packagefamilynamelength: Long, packagefamilyname: PWSTR, packagerelativeapplicationidlength: Long, packagerelativeapplicationid: PWSTR): WIN32_ERROR =
    if (_windowsWin32StoragePackagingAppxNapiAddon != null) (_windowsWin32StoragePackagingAppxNapiAddon.windowssys_windows_win32_storage_packaging_appx_ParseApplicationUserModelId(applicationusermodelid.toString(), packagefamilynamelength.toString(), packagefamilyname.toString(), packagerelativeapplicationidlength.toString(), packagerelativeapplicationid.toString()) as Int).toUInt() else 0u

public actual fun ReleasePackageVirtualizationContext(context: PACKAGE_VIRTUALIZATION_CONTEXT_HANDLE) {
    if (_windowsWin32StoragePackagingAppxNapiAddon != null) {
        _windowsWin32StoragePackagingAppxNapiAddon.windowssys_windows_win32_storage_packaging_appx_ReleasePackageVirtualizationContext(context.toString())
    }
}

public actual fun RemovePackageDependency(packagedependencycontext: PACKAGEDEPENDENCY_CONTEXT): HRESULT =
    if (_windowsWin32StoragePackagingAppxNapiAddon != null) (_windowsWin32StoragePackagingAppxNapiAddon.windowssys_windows_win32_storage_packaging_appx_RemovePackageDependency(packagedependencycontext.toString()) as Int) else 0

public actual fun TryCreatePackageDependency(user: PSID, packagefamilyname: PCWSTR, minversion: PACKAGE_VERSION, packagedependencyprocessorarchitectures: PackageDependencyProcessorArchitectures, lifetimekind: PackageDependencyLifetimeKind, lifetimeartifact: PCWSTR, options: CreatePackageDependencyOptions, packagedependencyid: Long): HRESULT =
    0

public actual fun VerifyApplicationUserModelId(applicationusermodelid: PCWSTR): WIN32_ERROR =
    if (_windowsWin32StoragePackagingAppxNapiAddon != null) (_windowsWin32StoragePackagingAppxNapiAddon.windowssys_windows_win32_storage_packaging_appx_VerifyApplicationUserModelId(applicationusermodelid.toString()) as Int).toUInt() else 0u

public actual fun VerifyPackageFamilyName(packagefamilyname: PCWSTR): WIN32_ERROR =
    if (_windowsWin32StoragePackagingAppxNapiAddon != null) (_windowsWin32StoragePackagingAppxNapiAddon.windowssys_windows_win32_storage_packaging_appx_VerifyPackageFamilyName(packagefamilyname.toString()) as Int).toUInt() else 0u

public actual fun VerifyPackageFullName(packagefullname: PCWSTR): WIN32_ERROR =
    if (_windowsWin32StoragePackagingAppxNapiAddon != null) (_windowsWin32StoragePackagingAppxNapiAddon.windowssys_windows_win32_storage_packaging_appx_VerifyPackageFullName(packagefullname.toString()) as Int).toUInt() else 0u

public actual fun VerifyPackageId(packageid: Long): WIN32_ERROR =
    if (_windowsWin32StoragePackagingAppxNapiAddon != null) (_windowsWin32StoragePackagingAppxNapiAddon.windowssys_windows_win32_storage_packaging_appx_VerifyPackageId(packageid.toString()) as Int).toUInt() else 0u

public actual fun VerifyPackageRelativeApplicationId(packagerelativeapplicationid: PCWSTR): WIN32_ERROR =
    if (_windowsWin32StoragePackagingAppxNapiAddon != null) (_windowsWin32StoragePackagingAppxNapiAddon.windowssys_windows_win32_storage_packaging_appx_VerifyPackageRelativeApplicationId(packagerelativeapplicationid.toString()) as Int).toUInt() else 0u
