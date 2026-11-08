package io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.WIN32_ERROR
import io.github.kotlinmania.windowssys.windows.win32.security.PSID

public fun ActivatePackageVirtualizationContext(context: PACKAGE_VIRTUALIZATION_CONTEXT_HANDLE, cookie: Long): HRESULT {
    return Win32DynamicFfi.invoke("kernel32.dll", "ActivatePackageVirtualizationContext", longArrayOf(context, cookie)).toInt()
}

public fun AddPackageDependency(packagedependencyid: PCWSTR, rank: Int, options: AddPackageDependencyOptions, packagedependencycontext: Long, packagefullname: Long): HRESULT {
    return Win32DynamicFfi.invoke("kernelbase.dll", "AddPackageDependency", longArrayOf(packagedependencyid, rank.toLong(), options.toLong(), packagedependencycontext, packagefullname)).toInt()
}

public fun AppPolicyGetClrCompat(processtoken: HANDLE, policy: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("kernel32.dll", "AppPolicyGetClrCompat", longArrayOf(processtoken, policy)).toUInt()
}

public fun AppPolicyGetCreateFileAccess(processtoken: HANDLE, policy: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("kernel32.dll", "AppPolicyGetCreateFileAccess", longArrayOf(processtoken, policy)).toUInt()
}

public fun AppPolicyGetLifecycleManagement(processtoken: HANDLE, policy: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("kernel32.dll", "AppPolicyGetLifecycleManagement", longArrayOf(processtoken, policy)).toUInt()
}

public fun AppPolicyGetMediaFoundationCodecLoading(processtoken: HANDLE, policy: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("kernel32.dll", "AppPolicyGetMediaFoundationCodecLoading", longArrayOf(processtoken, policy)).toUInt()
}

public fun AppPolicyGetProcessTerminationMethod(processtoken: HANDLE, policy: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("kernel32.dll", "AppPolicyGetProcessTerminationMethod", longArrayOf(processtoken, policy)).toUInt()
}

public fun AppPolicyGetShowDeveloperDiagnostic(processtoken: HANDLE, policy: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("kernel32.dll", "AppPolicyGetShowDeveloperDiagnostic", longArrayOf(processtoken, policy)).toUInt()
}

public fun AppPolicyGetThreadInitializationType(processtoken: HANDLE, policy: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("kernel32.dll", "AppPolicyGetThreadInitializationType", longArrayOf(processtoken, policy)).toUInt()
}

public fun AppPolicyGetWindowingModel(processtoken: HANDLE, policy: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("kernel32.dll", "AppPolicyGetWindowingModel", longArrayOf(processtoken, policy)).toUInt()
}

public fun CheckIsMSIXPackage(packagefullname: PCWSTR, ismsixpackage: Long): HRESULT {
    return Win32DynamicFfi.invoke("kernel32.dll", "CheckIsMSIXPackage", longArrayOf(packagefullname, ismsixpackage)).toInt()
}

public fun ClosePackageInfo(packageinforeference: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("kernel32.dll", "ClosePackageInfo", longArrayOf(packageinforeference)).toUInt()
}

public fun CreatePackageVirtualizationContext(packagefamilyname: PCWSTR, context: Long): HRESULT {
    return Win32DynamicFfi.invoke("kernel32.dll", "CreatePackageVirtualizationContext", longArrayOf(packagefamilyname, context)).toInt()
}

public fun DeactivatePackageVirtualizationContext(cookie: ULong) {
    Win32DynamicFfi.invoke("kernel32.dll", "DeactivatePackageVirtualizationContext", longArrayOf(cookie.toLong()))
}

public fun DeletePackageDependency(packagedependencyid: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("kernelbase.dll", "DeletePackageDependency", longArrayOf(packagedependencyid)).toInt()
}

public fun DuplicatePackageVirtualizationContext(sourcecontext: PACKAGE_VIRTUALIZATION_CONTEXT_HANDLE, destcontext: Long): HRESULT {
    return Win32DynamicFfi.invoke("kernel32.dll", "DuplicatePackageVirtualizationContext", longArrayOf(sourcecontext, destcontext)).toInt()
}

public fun FindPackagesByPackageFamily(packagefamilyname: PCWSTR, packagefilters: UInt, count: Long, packagefullnames: Long, bufferlength: Long, buffer: PWSTR, packageproperties: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("kernel32.dll", "FindPackagesByPackageFamily", longArrayOf(packagefamilyname, packagefilters.toLong(), count, packagefullnames, bufferlength, buffer, packageproperties)).toUInt()
}

public fun FormatApplicationUserModelId(packagefamilyname: PCWSTR, packagerelativeapplicationid: PCWSTR, applicationusermodelidlength: Long, applicationusermodelid: PWSTR): WIN32_ERROR {
    return Win32DynamicFfi.invoke("kernel32.dll", "FormatApplicationUserModelId", longArrayOf(packagefamilyname, packagerelativeapplicationid, applicationusermodelidlength, applicationusermodelid)).toUInt()
}

public fun GetApplicationUserModelId(hprocess: HANDLE, applicationusermodelidlength: Long, applicationusermodelid: PWSTR): WIN32_ERROR {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetApplicationUserModelId", longArrayOf(hprocess, applicationusermodelidlength, applicationusermodelid)).toUInt()
}

public fun GetApplicationUserModelIdFromToken(token: HANDLE, applicationusermodelidlength: Long, applicationusermodelid: PWSTR): WIN32_ERROR {
    return Win32DynamicFfi.invoke("api-ms-win-appmodel-runtime-l1-1-1.dll", "GetApplicationUserModelIdFromToken", longArrayOf(token, applicationusermodelidlength, applicationusermodelid)).toUInt()
}

public fun GetCurrentApplicationUserModelId(applicationusermodelidlength: Long, applicationusermodelid: PWSTR): WIN32_ERROR {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetCurrentApplicationUserModelId", longArrayOf(applicationusermodelidlength, applicationusermodelid)).toUInt()
}

public fun GetCurrentPackageFamilyName(packagefamilynamelength: Long, packagefamilyname: PWSTR): WIN32_ERROR {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetCurrentPackageFamilyName", longArrayOf(packagefamilynamelength, packagefamilyname)).toUInt()
}

public fun GetCurrentPackageFullName(packagefullnamelength: Long, packagefullname: PWSTR): WIN32_ERROR {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetCurrentPackageFullName", longArrayOf(packagefullnamelength, packagefullname)).toUInt()
}

public fun GetCurrentPackageId(bufferlength: Long, buffer: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetCurrentPackageId", longArrayOf(bufferlength, buffer)).toUInt()
}

public fun GetCurrentPackageInfo(flags: UInt, bufferlength: Long, buffer: Long, count: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetCurrentPackageInfo", longArrayOf(flags.toLong(), bufferlength, buffer, count)).toUInt()
}

public fun GetCurrentPackageInfo2(flags: UInt, packagepathtype: PackagePathType, bufferlength: Long, buffer: Long, count: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("api-ms-win-appmodel-runtime-l1-1-3.dll", "GetCurrentPackageInfo2", longArrayOf(flags.toLong(), packagepathtype.toLong(), bufferlength, buffer, count)).toUInt()
}

public fun GetCurrentPackageInfo3(flags: UInt, packageinfotype: PackageInfo3Type, bufferlength: Long, buffer: Long, count: Long): HRESULT {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetCurrentPackageInfo3", longArrayOf(flags.toLong(), packageinfotype.toLong(), bufferlength, buffer, count)).toInt()
}

public fun GetCurrentPackagePath(pathlength: Long, path: PWSTR): WIN32_ERROR {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetCurrentPackagePath", longArrayOf(pathlength, path)).toUInt()
}

public fun GetCurrentPackagePath2(packagepathtype: PackagePathType, pathlength: Long, path: PWSTR): WIN32_ERROR {
    return Win32DynamicFfi.invoke("api-ms-win-appmodel-runtime-l1-1-3.dll", "GetCurrentPackagePath2", longArrayOf(packagepathtype.toLong(), pathlength, path)).toUInt()
}

public fun GetCurrentPackageVirtualizationContext(): PACKAGE_VIRTUALIZATION_CONTEXT_HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetCurrentPackageVirtualizationContext", longArrayOf())
}

public fun GetIdForPackageDependencyContext(packagedependencycontext: PACKAGEDEPENDENCY_CONTEXT, packagedependencyid: Long): HRESULT {
    return Win32DynamicFfi.invoke("kernelbase.dll", "GetIdForPackageDependencyContext", longArrayOf(packagedependencycontext, packagedependencyid)).toInt()
}

public fun GetPackageApplicationIds(packageinforeference: Long, bufferlength: Long, buffer: Long, count: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetPackageApplicationIds", longArrayOf(packageinforeference, bufferlength, buffer, count)).toUInt()
}

public fun GetPackageFamilyName(hprocess: HANDLE, packagefamilynamelength: Long, packagefamilyname: PWSTR): WIN32_ERROR {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetPackageFamilyName", longArrayOf(hprocess, packagefamilynamelength, packagefamilyname)).toUInt()
}

public fun GetPackageFamilyNameFromToken(token: HANDLE, packagefamilynamelength: Long, packagefamilyname: PWSTR): WIN32_ERROR {
    return Win32DynamicFfi.invoke("api-ms-win-appmodel-runtime-l1-1-1.dll", "GetPackageFamilyNameFromToken", longArrayOf(token, packagefamilynamelength, packagefamilyname)).toUInt()
}

public fun GetPackageFullName(hprocess: HANDLE, packagefullnamelength: Long, packagefullname: PWSTR): WIN32_ERROR {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetPackageFullName", longArrayOf(hprocess, packagefullnamelength, packagefullname)).toUInt()
}

public fun GetPackageFullNameFromToken(token: HANDLE, packagefullnamelength: Long, packagefullname: PWSTR): WIN32_ERROR {
    return Win32DynamicFfi.invoke("api-ms-win-appmodel-runtime-l1-1-1.dll", "GetPackageFullNameFromToken", longArrayOf(token, packagefullnamelength, packagefullname)).toUInt()
}

public fun GetPackageGraphRevisionId(): UInt {
    return Win32DynamicFfi.invoke("api-ms-win-appmodel-runtime-l1-1-6.dll", "GetPackageGraphRevisionId", longArrayOf()).toUInt()
}

public fun GetPackageId(hprocess: HANDLE, bufferlength: Long, buffer: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetPackageId", longArrayOf(hprocess, bufferlength, buffer)).toUInt()
}

public fun GetPackageInfo(packageinforeference: Long, flags: UInt, bufferlength: Long, buffer: Long, count: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetPackageInfo", longArrayOf(packageinforeference, flags.toLong(), bufferlength, buffer, count)).toUInt()
}

public fun GetPackageInfo2(packageinforeference: Long, flags: UInt, packagepathtype: PackagePathType, bufferlength: Long, buffer: Long, count: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("api-ms-win-appmodel-runtime-l1-1-3.dll", "GetPackageInfo2", longArrayOf(packageinforeference, flags.toLong(), packagepathtype.toLong(), bufferlength, buffer, count)).toUInt()
}

public fun GetPackagePath(packageid: Long, reserved: UInt, pathlength: Long, path: PWSTR): WIN32_ERROR {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetPackagePath", longArrayOf(packageid, reserved.toLong(), pathlength, path)).toUInt()
}

public fun GetPackagePathByFullName(packagefullname: PCWSTR, pathlength: Long, path: PWSTR): WIN32_ERROR {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetPackagePathByFullName", longArrayOf(packagefullname, pathlength, path)).toUInt()
}

public fun GetPackagePathByFullName2(packagefullname: PCWSTR, packagepathtype: PackagePathType, pathlength: Long, path: PWSTR): WIN32_ERROR {
    return Win32DynamicFfi.invoke("api-ms-win-appmodel-runtime-l1-1-3.dll", "GetPackagePathByFullName2", longArrayOf(packagefullname, packagepathtype.toLong(), pathlength, path)).toUInt()
}

public fun GetPackagesByPackageFamily(packagefamilyname: PCWSTR, count: Long, packagefullnames: Long, bufferlength: Long, buffer: PWSTR): WIN32_ERROR {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetPackagesByPackageFamily", longArrayOf(packagefamilyname, count, packagefullnames, bufferlength, buffer)).toUInt()
}

public fun GetProcessesInVirtualizationContext(packagefamilyname: PCWSTR, count: Long, processes: Long): HRESULT {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetProcessesInVirtualizationContext", longArrayOf(packagefamilyname, count, processes)).toInt()
}

public fun GetResolvedPackageFullNameForPackageDependency(packagedependencyid: PCWSTR, packagefullname: Long): HRESULT {
    return Win32DynamicFfi.invoke("kernelbase.dll", "GetResolvedPackageFullNameForPackageDependency", longArrayOf(packagedependencyid, packagefullname)).toInt()
}

public fun GetStagedPackageOrigin(packagefullname: PCWSTR, origin: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("api-ms-win-appmodel-runtime-l1-1-1.dll", "GetStagedPackageOrigin", longArrayOf(packagefullname, origin)).toUInt()
}

public fun GetStagedPackagePathByFullName(packagefullname: PCWSTR, pathlength: Long, path: PWSTR): WIN32_ERROR {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetStagedPackagePathByFullName", longArrayOf(packagefullname, pathlength, path)).toUInt()
}

public fun GetStagedPackagePathByFullName2(packagefullname: PCWSTR, packagepathtype: PackagePathType, pathlength: Long, path: PWSTR): WIN32_ERROR {
    return Win32DynamicFfi.invoke("api-ms-win-appmodel-runtime-l1-1-3.dll", "GetStagedPackagePathByFullName2", longArrayOf(packagefullname, packagepathtype.toLong(), pathlength, path)).toUInt()
}

public fun OpenPackageInfoByFullName(packagefullname: PCWSTR, reserved: UInt, packageinforeference: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("kernel32.dll", "OpenPackageInfoByFullName", longArrayOf(packagefullname, reserved.toLong(), packageinforeference)).toUInt()
}

public fun OpenPackageInfoByFullNameForUser(usersid: PSID, packagefullname: PCWSTR, reserved: UInt, packageinforeference: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("api-ms-win-appmodel-runtime-l1-1-1.dll", "OpenPackageInfoByFullNameForUser", longArrayOf(usersid, packagefullname, reserved.toLong(), packageinforeference)).toUInt()
}

public fun PackageFamilyNameFromFullName(packagefullname: PCWSTR, packagefamilynamelength: Long, packagefamilyname: PWSTR): WIN32_ERROR {
    return Win32DynamicFfi.invoke("kernel32.dll", "PackageFamilyNameFromFullName", longArrayOf(packagefullname, packagefamilynamelength, packagefamilyname)).toUInt()
}

public fun PackageFamilyNameFromId(packageid: Long, packagefamilynamelength: Long, packagefamilyname: PWSTR): WIN32_ERROR {
    return Win32DynamicFfi.invoke("kernel32.dll", "PackageFamilyNameFromId", longArrayOf(packageid, packagefamilynamelength, packagefamilyname)).toUInt()
}

public fun PackageFullNameFromId(packageid: Long, packagefullnamelength: Long, packagefullname: PWSTR): WIN32_ERROR {
    return Win32DynamicFfi.invoke("kernel32.dll", "PackageFullNameFromId", longArrayOf(packageid, packagefullnamelength, packagefullname)).toUInt()
}

public fun PackageIdFromFullName(packagefullname: PCWSTR, flags: UInt, bufferlength: Long, buffer: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("kernel32.dll", "PackageIdFromFullName", longArrayOf(packagefullname, flags.toLong(), bufferlength, buffer)).toUInt()
}

public fun PackageNameAndPublisherIdFromFamilyName(packagefamilyname: PCWSTR, packagenamelength: Long, packagename: PWSTR, packagepublisheridlength: Long, packagepublisherid: PWSTR): WIN32_ERROR {
    return Win32DynamicFfi.invoke("kernel32.dll", "PackageNameAndPublisherIdFromFamilyName", longArrayOf(packagefamilyname, packagenamelength, packagename, packagepublisheridlength, packagepublisherid)).toUInt()
}

public fun ParseApplicationUserModelId(applicationusermodelid: PCWSTR, packagefamilynamelength: Long, packagefamilyname: PWSTR, packagerelativeapplicationidlength: Long, packagerelativeapplicationid: PWSTR): WIN32_ERROR {
    return Win32DynamicFfi.invoke("kernel32.dll", "ParseApplicationUserModelId", longArrayOf(applicationusermodelid, packagefamilynamelength, packagefamilyname, packagerelativeapplicationidlength, packagerelativeapplicationid)).toUInt()
}

public fun ReleasePackageVirtualizationContext(context: PACKAGE_VIRTUALIZATION_CONTEXT_HANDLE) {
    Win32DynamicFfi.invoke("kernel32.dll", "ReleasePackageVirtualizationContext", longArrayOf(context))
}

public fun RemovePackageDependency(packagedependencycontext: PACKAGEDEPENDENCY_CONTEXT): HRESULT {
    return Win32DynamicFfi.invoke("kernelbase.dll", "RemovePackageDependency", longArrayOf(packagedependencycontext)).toInt()
}

public fun TryCreatePackageDependency(user: PSID, packagefamilyname: PCWSTR, minversion: PACKAGE_VERSION, packagedependencyprocessorarchitectures: PackageDependencyProcessorArchitectures, lifetimekind: PackageDependencyLifetimeKind, lifetimeartifact: PCWSTR, options: CreatePackageDependencyOptions, packagedependencyid: Long): HRESULT {
    return Win32DynamicFfi.invoke("kernelbase.dll", "TryCreatePackageDependency", longArrayOf(user, packagefamilyname, (minversion.Anonymous.Version.toLong() or ((minversion.Anonymous.Anonymous.Revision.toLong() and 0xFFFFL) or ((minversion.Anonymous.Anonymous.Build.toLong() and 0xFFFFL) shl 16) or ((minversion.Anonymous.Anonymous.Minor.toLong() and 0xFFFFL) shl 32) or ((minversion.Anonymous.Anonymous.Major.toLong() and 0xFFFFL) shl 48))), packagedependencyprocessorarchitectures.toLong(), lifetimekind.toLong(), lifetimeartifact, options.toLong(), packagedependencyid)).toInt()
}

public fun VerifyApplicationUserModelId(applicationusermodelid: PCWSTR): WIN32_ERROR {
    return Win32DynamicFfi.invoke("api-ms-win-appmodel-runtime-l1-1-1.dll", "VerifyApplicationUserModelId", longArrayOf(applicationusermodelid)).toUInt()
}

public fun VerifyPackageFamilyName(packagefamilyname: PCWSTR): WIN32_ERROR {
    return Win32DynamicFfi.invoke("api-ms-win-appmodel-runtime-l1-1-1.dll", "VerifyPackageFamilyName", longArrayOf(packagefamilyname)).toUInt()
}

public fun VerifyPackageFullName(packagefullname: PCWSTR): WIN32_ERROR {
    return Win32DynamicFfi.invoke("api-ms-win-appmodel-runtime-l1-1-1.dll", "VerifyPackageFullName", longArrayOf(packagefullname)).toUInt()
}

public fun VerifyPackageId(packageid: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("api-ms-win-appmodel-runtime-l1-1-1.dll", "VerifyPackageId", longArrayOf(packageid)).toUInt()
}

public fun VerifyPackageRelativeApplicationId(packagerelativeapplicationid: PCWSTR): WIN32_ERROR {
    return Win32DynamicFfi.invoke("api-ms-win-appmodel-runtime-l1-1-1.dll", "VerifyPackageRelativeApplicationId", longArrayOf(packagerelativeapplicationid)).toUInt()
}
