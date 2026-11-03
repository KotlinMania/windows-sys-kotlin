package io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public fun ActivatePackageVirtualizationContext(context: PACKAGE_VIRTUALIZATION_CONTEXT_HANDLE, cookie: Long): HRESULT {
    return Win32DynamicFfi.invoke("kernel32.dll", "ActivatePackageVirtualizationContext", longArrayOf(context, cookie)).toInt()
}

public fun AddPackageDependency(packagedependencyid: PCWSTR, rank: Int, options: AddPackageDependencyOptions, packagedependencycontext: Long, packagefullname: Long): HRESULT {
    return Win32DynamicFfi.invoke("kernelbase.dll", "AddPackageDependency", longArrayOf(packagedependencyid, rank.toLong(), options.toLong(), packagedependencycontext, packagefullname)).toInt()
}

public fun AppPolicyGetClrCompat(processtoken: Foundation.HANDLE, policy: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("kernel32.dll", "AppPolicyGetClrCompat", longArrayOf(Win32DynamicFfi.objectSlot(processtoken), policy))
    return Foundation.WIN32_ERROR()
}

public fun AppPolicyGetCreateFileAccess(processtoken: Foundation.HANDLE, policy: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("kernel32.dll", "AppPolicyGetCreateFileAccess", longArrayOf(Win32DynamicFfi.objectSlot(processtoken), policy))
    return Foundation.WIN32_ERROR()
}

public fun AppPolicyGetLifecycleManagement(processtoken: Foundation.HANDLE, policy: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("kernel32.dll", "AppPolicyGetLifecycleManagement", longArrayOf(Win32DynamicFfi.objectSlot(processtoken), policy))
    return Foundation.WIN32_ERROR()
}

public fun AppPolicyGetMediaFoundationCodecLoading(processtoken: Foundation.HANDLE, policy: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("kernel32.dll", "AppPolicyGetMediaFoundationCodecLoading", longArrayOf(Win32DynamicFfi.objectSlot(processtoken), policy))
    return Foundation.WIN32_ERROR()
}

public fun AppPolicyGetProcessTerminationMethod(processtoken: Foundation.HANDLE, policy: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("kernel32.dll", "AppPolicyGetProcessTerminationMethod", longArrayOf(Win32DynamicFfi.objectSlot(processtoken), policy))
    return Foundation.WIN32_ERROR()
}

public fun AppPolicyGetShowDeveloperDiagnostic(processtoken: Foundation.HANDLE, policy: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("kernel32.dll", "AppPolicyGetShowDeveloperDiagnostic", longArrayOf(Win32DynamicFfi.objectSlot(processtoken), policy))
    return Foundation.WIN32_ERROR()
}

public fun AppPolicyGetThreadInitializationType(processtoken: Foundation.HANDLE, policy: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("kernel32.dll", "AppPolicyGetThreadInitializationType", longArrayOf(Win32DynamicFfi.objectSlot(processtoken), policy))
    return Foundation.WIN32_ERROR()
}

public fun AppPolicyGetWindowingModel(processtoken: Foundation.HANDLE, policy: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("kernel32.dll", "AppPolicyGetWindowingModel", longArrayOf(Win32DynamicFfi.objectSlot(processtoken), policy))
    return Foundation.WIN32_ERROR()
}

public fun CheckIsMSIXPackage(packagefullname: PCWSTR, ismsixpackage: Long): HRESULT {
    return Win32DynamicFfi.invoke("kernel32.dll", "CheckIsMSIXPackage", longArrayOf(packagefullname, ismsixpackage)).toInt()
}

public fun ClosePackageInfo(packageinforeference: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("kernel32.dll", "ClosePackageInfo", longArrayOf(packageinforeference))
    return Foundation.WIN32_ERROR()
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

public fun FindPackagesByPackageFamily(packagefamilyname: PCWSTR, packagefilters: UInt, count: Long, packagefullnames: Long, bufferlength: Long, buffer: PWSTR, packageproperties: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("kernel32.dll", "FindPackagesByPackageFamily", longArrayOf(packagefamilyname, packagefilters.toLong(), count, packagefullnames, bufferlength, buffer, packageproperties))
    return Foundation.WIN32_ERROR()
}

public fun FormatApplicationUserModelId(packagefamilyname: PCWSTR, packagerelativeapplicationid: PCWSTR, applicationusermodelidlength: Long, applicationusermodelid: PWSTR): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("kernel32.dll", "FormatApplicationUserModelId", longArrayOf(packagefamilyname, packagerelativeapplicationid, applicationusermodelidlength, applicationusermodelid))
    return Foundation.WIN32_ERROR()
}

public fun GetApplicationUserModelId(hprocess: Foundation.HANDLE, applicationusermodelidlength: Long, applicationusermodelid: PWSTR): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("kernel32.dll", "GetApplicationUserModelId", longArrayOf(Win32DynamicFfi.objectSlot(hprocess), applicationusermodelidlength, applicationusermodelid))
    return Foundation.WIN32_ERROR()
}

public fun GetApplicationUserModelIdFromToken(token: Foundation.HANDLE, applicationusermodelidlength: Long, applicationusermodelid: PWSTR): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("api-ms-win-appmodel-runtime-l1-1-1.dll", "GetApplicationUserModelIdFromToken", longArrayOf(Win32DynamicFfi.objectSlot(token), applicationusermodelidlength, applicationusermodelid))
    return Foundation.WIN32_ERROR()
}

public fun GetCurrentApplicationUserModelId(applicationusermodelidlength: Long, applicationusermodelid: PWSTR): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("kernel32.dll", "GetCurrentApplicationUserModelId", longArrayOf(applicationusermodelidlength, applicationusermodelid))
    return Foundation.WIN32_ERROR()
}

public fun GetCurrentPackageFamilyName(packagefamilynamelength: Long, packagefamilyname: PWSTR): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("kernel32.dll", "GetCurrentPackageFamilyName", longArrayOf(packagefamilynamelength, packagefamilyname))
    return Foundation.WIN32_ERROR()
}

public fun GetCurrentPackageFullName(packagefullnamelength: Long, packagefullname: PWSTR): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("kernel32.dll", "GetCurrentPackageFullName", longArrayOf(packagefullnamelength, packagefullname))
    return Foundation.WIN32_ERROR()
}

public fun GetCurrentPackageId(bufferlength: Long, buffer: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("kernel32.dll", "GetCurrentPackageId", longArrayOf(bufferlength, buffer))
    return Foundation.WIN32_ERROR()
}

public fun GetCurrentPackageInfo(flags: UInt, bufferlength: Long, buffer: Long, count: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("kernel32.dll", "GetCurrentPackageInfo", longArrayOf(flags.toLong(), bufferlength, buffer, count))
    return Foundation.WIN32_ERROR()
}

public fun GetCurrentPackageInfo2(flags: UInt, packagepathtype: PackagePathType, bufferlength: Long, buffer: Long, count: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("api-ms-win-appmodel-runtime-l1-1-3.dll", "GetCurrentPackageInfo2", longArrayOf(flags.toLong(), packagepathtype.toLong(), bufferlength, buffer, count))
    return Foundation.WIN32_ERROR()
}

public fun GetCurrentPackageInfo3(flags: UInt, packageinfotype: PackageInfo3Type, bufferlength: Long, buffer: Long, count: Long): HRESULT {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetCurrentPackageInfo3", longArrayOf(flags.toLong(), packageinfotype.toLong(), bufferlength, buffer, count)).toInt()
}

public fun GetCurrentPackagePath(pathlength: Long, path: PWSTR): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("kernel32.dll", "GetCurrentPackagePath", longArrayOf(pathlength, path))
    return Foundation.WIN32_ERROR()
}

public fun GetCurrentPackagePath2(packagepathtype: PackagePathType, pathlength: Long, path: PWSTR): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("api-ms-win-appmodel-runtime-l1-1-3.dll", "GetCurrentPackagePath2", longArrayOf(packagepathtype.toLong(), pathlength, path))
    return Foundation.WIN32_ERROR()
}

public fun GetCurrentPackageVirtualizationContext(): PACKAGE_VIRTUALIZATION_CONTEXT_HANDLE {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetCurrentPackageVirtualizationContext", longArrayOf())
}

public fun GetIdForPackageDependencyContext(packagedependencycontext: PACKAGEDEPENDENCY_CONTEXT, packagedependencyid: Long): HRESULT {
    return Win32DynamicFfi.invoke("kernelbase.dll", "GetIdForPackageDependencyContext", longArrayOf(packagedependencycontext, packagedependencyid)).toInt()
}

public fun GetPackageApplicationIds(packageinforeference: Long, bufferlength: Long, buffer: Long, count: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("kernel32.dll", "GetPackageApplicationIds", longArrayOf(packageinforeference, bufferlength, buffer, count))
    return Foundation.WIN32_ERROR()
}

public fun GetPackageFamilyName(hprocess: Foundation.HANDLE, packagefamilynamelength: Long, packagefamilyname: PWSTR): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("kernel32.dll", "GetPackageFamilyName", longArrayOf(Win32DynamicFfi.objectSlot(hprocess), packagefamilynamelength, packagefamilyname))
    return Foundation.WIN32_ERROR()
}

public fun GetPackageFamilyNameFromToken(token: Foundation.HANDLE, packagefamilynamelength: Long, packagefamilyname: PWSTR): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("api-ms-win-appmodel-runtime-l1-1-1.dll", "GetPackageFamilyNameFromToken", longArrayOf(Win32DynamicFfi.objectSlot(token), packagefamilynamelength, packagefamilyname))
    return Foundation.WIN32_ERROR()
}

public fun GetPackageFullName(hprocess: Foundation.HANDLE, packagefullnamelength: Long, packagefullname: PWSTR): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("kernel32.dll", "GetPackageFullName", longArrayOf(Win32DynamicFfi.objectSlot(hprocess), packagefullnamelength, packagefullname))
    return Foundation.WIN32_ERROR()
}

public fun GetPackageFullNameFromToken(token: Foundation.HANDLE, packagefullnamelength: Long, packagefullname: PWSTR): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("api-ms-win-appmodel-runtime-l1-1-1.dll", "GetPackageFullNameFromToken", longArrayOf(Win32DynamicFfi.objectSlot(token), packagefullnamelength, packagefullname))
    return Foundation.WIN32_ERROR()
}

public fun GetPackageGraphRevisionId(): UInt {
    return Win32DynamicFfi.invoke("api-ms-win-appmodel-runtime-l1-1-6.dll", "GetPackageGraphRevisionId", longArrayOf()).toUInt()
}

public fun GetPackageId(hprocess: Foundation.HANDLE, bufferlength: Long, buffer: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("kernel32.dll", "GetPackageId", longArrayOf(Win32DynamicFfi.objectSlot(hprocess), bufferlength, buffer))
    return Foundation.WIN32_ERROR()
}

public fun GetPackageInfo(packageinforeference: Long, flags: UInt, bufferlength: Long, buffer: Long, count: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("kernel32.dll", "GetPackageInfo", longArrayOf(packageinforeference, flags.toLong(), bufferlength, buffer, count))
    return Foundation.WIN32_ERROR()
}

public fun GetPackageInfo2(packageinforeference: Long, flags: UInt, packagepathtype: PackagePathType, bufferlength: Long, buffer: Long, count: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("api-ms-win-appmodel-runtime-l1-1-3.dll", "GetPackageInfo2", longArrayOf(packageinforeference, flags.toLong(), packagepathtype.toLong(), bufferlength, buffer, count))
    return Foundation.WIN32_ERROR()
}

public fun GetPackagePath(packageid: Long, reserved: UInt, pathlength: Long, path: PWSTR): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("kernel32.dll", "GetPackagePath", longArrayOf(packageid, reserved.toLong(), pathlength, path))
    return Foundation.WIN32_ERROR()
}

public fun GetPackagePathByFullName(packagefullname: PCWSTR, pathlength: Long, path: PWSTR): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("kernel32.dll", "GetPackagePathByFullName", longArrayOf(packagefullname, pathlength, path))
    return Foundation.WIN32_ERROR()
}

public fun GetPackagePathByFullName2(packagefullname: PCWSTR, packagepathtype: PackagePathType, pathlength: Long, path: PWSTR): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("api-ms-win-appmodel-runtime-l1-1-3.dll", "GetPackagePathByFullName2", longArrayOf(packagefullname, packagepathtype.toLong(), pathlength, path))
    return Foundation.WIN32_ERROR()
}

public fun GetPackagesByPackageFamily(packagefamilyname: PCWSTR, count: Long, packagefullnames: Long, bufferlength: Long, buffer: PWSTR): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("kernel32.dll", "GetPackagesByPackageFamily", longArrayOf(packagefamilyname, count, packagefullnames, bufferlength, buffer))
    return Foundation.WIN32_ERROR()
}

public fun GetProcessesInVirtualizationContext(packagefamilyname: PCWSTR, count: Long, processes: Long): HRESULT {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetProcessesInVirtualizationContext", longArrayOf(packagefamilyname, count, processes)).toInt()
}

public fun GetResolvedPackageFullNameForPackageDependency(packagedependencyid: PCWSTR, packagefullname: Long): HRESULT {
    return Win32DynamicFfi.invoke("kernelbase.dll", "GetResolvedPackageFullNameForPackageDependency", longArrayOf(packagedependencyid, packagefullname)).toInt()
}

public fun GetStagedPackageOrigin(packagefullname: PCWSTR, origin: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("api-ms-win-appmodel-runtime-l1-1-1.dll", "GetStagedPackageOrigin", longArrayOf(packagefullname, origin))
    return Foundation.WIN32_ERROR()
}

public fun GetStagedPackagePathByFullName(packagefullname: PCWSTR, pathlength: Long, path: PWSTR): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("kernel32.dll", "GetStagedPackagePathByFullName", longArrayOf(packagefullname, pathlength, path))
    return Foundation.WIN32_ERROR()
}

public fun GetStagedPackagePathByFullName2(packagefullname: PCWSTR, packagepathtype: PackagePathType, pathlength: Long, path: PWSTR): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("api-ms-win-appmodel-runtime-l1-1-3.dll", "GetStagedPackagePathByFullName2", longArrayOf(packagefullname, packagepathtype.toLong(), pathlength, path))
    return Foundation.WIN32_ERROR()
}

public fun OpenPackageInfoByFullName(packagefullname: PCWSTR, reserved: UInt, packageinforeference: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("kernel32.dll", "OpenPackageInfoByFullName", longArrayOf(packagefullname, reserved.toLong(), packageinforeference))
    return Foundation.WIN32_ERROR()
}

public fun OpenPackageInfoByFullNameForUser(usersid: Security.PSID, packagefullname: PCWSTR, reserved: UInt, packageinforeference: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("api-ms-win-appmodel-runtime-l1-1-1.dll", "OpenPackageInfoByFullNameForUser", longArrayOf(Win32DynamicFfi.objectSlot(usersid), packagefullname, reserved.toLong(), packageinforeference))
    return Foundation.WIN32_ERROR()
}

public fun PackageFamilyNameFromFullName(packagefullname: PCWSTR, packagefamilynamelength: Long, packagefamilyname: PWSTR): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("kernel32.dll", "PackageFamilyNameFromFullName", longArrayOf(packagefullname, packagefamilynamelength, packagefamilyname))
    return Foundation.WIN32_ERROR()
}

public fun PackageFamilyNameFromId(packageid: Long, packagefamilynamelength: Long, packagefamilyname: PWSTR): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("kernel32.dll", "PackageFamilyNameFromId", longArrayOf(packageid, packagefamilynamelength, packagefamilyname))
    return Foundation.WIN32_ERROR()
}

public fun PackageFullNameFromId(packageid: Long, packagefullnamelength: Long, packagefullname: PWSTR): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("kernel32.dll", "PackageFullNameFromId", longArrayOf(packageid, packagefullnamelength, packagefullname))
    return Foundation.WIN32_ERROR()
}

public fun PackageIdFromFullName(packagefullname: PCWSTR, flags: UInt, bufferlength: Long, buffer: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("kernel32.dll", "PackageIdFromFullName", longArrayOf(packagefullname, flags.toLong(), bufferlength, buffer))
    return Foundation.WIN32_ERROR()
}

public fun PackageNameAndPublisherIdFromFamilyName(packagefamilyname: PCWSTR, packagenamelength: Long, packagename: PWSTR, packagepublisheridlength: Long, packagepublisherid: PWSTR): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("kernel32.dll", "PackageNameAndPublisherIdFromFamilyName", longArrayOf(packagefamilyname, packagenamelength, packagename, packagepublisheridlength, packagepublisherid))
    return Foundation.WIN32_ERROR()
}

public fun ParseApplicationUserModelId(applicationusermodelid: PCWSTR, packagefamilynamelength: Long, packagefamilyname: PWSTR, packagerelativeapplicationidlength: Long, packagerelativeapplicationid: PWSTR): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("kernel32.dll", "ParseApplicationUserModelId", longArrayOf(applicationusermodelid, packagefamilynamelength, packagefamilyname, packagerelativeapplicationidlength, packagerelativeapplicationid))
    return Foundation.WIN32_ERROR()
}

public fun ReleasePackageVirtualizationContext(context: PACKAGE_VIRTUALIZATION_CONTEXT_HANDLE) {
    Win32DynamicFfi.invoke("kernel32.dll", "ReleasePackageVirtualizationContext", longArrayOf(context))
}

public fun RemovePackageDependency(packagedependencycontext: PACKAGEDEPENDENCY_CONTEXT): HRESULT {
    return Win32DynamicFfi.invoke("kernelbase.dll", "RemovePackageDependency", longArrayOf(packagedependencycontext)).toInt()
}

public fun TryCreatePackageDependency(user: Security.PSID, packagefamilyname: PCWSTR, minversion: PACKAGE_VERSION, packagedependencyprocessorarchitectures: PackageDependencyProcessorArchitectures, lifetimekind: PackageDependencyLifetimeKind, lifetimeartifact: PCWSTR, options: CreatePackageDependencyOptions, packagedependencyid: Long): HRESULT {
    return Win32DynamicFfi.invoke("kernelbase.dll", "TryCreatePackageDependency", longArrayOf(Win32DynamicFfi.objectSlot(user), packagefamilyname, Win32DynamicFfi.objectSlot(minversion), packagedependencyprocessorarchitectures.toLong(), lifetimekind.toLong(), lifetimeartifact, options.toLong(), packagedependencyid)).toInt()
}

public fun VerifyApplicationUserModelId(applicationusermodelid: PCWSTR): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("api-ms-win-appmodel-runtime-l1-1-1.dll", "VerifyApplicationUserModelId", longArrayOf(applicationusermodelid))
    return Foundation.WIN32_ERROR()
}

public fun VerifyPackageFamilyName(packagefamilyname: PCWSTR): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("api-ms-win-appmodel-runtime-l1-1-1.dll", "VerifyPackageFamilyName", longArrayOf(packagefamilyname))
    return Foundation.WIN32_ERROR()
}

public fun VerifyPackageFullName(packagefullname: PCWSTR): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("api-ms-win-appmodel-runtime-l1-1-1.dll", "VerifyPackageFullName", longArrayOf(packagefullname))
    return Foundation.WIN32_ERROR()
}

public fun VerifyPackageId(packageid: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("api-ms-win-appmodel-runtime-l1-1-1.dll", "VerifyPackageId", longArrayOf(packageid))
    return Foundation.WIN32_ERROR()
}

public fun VerifyPackageRelativeApplicationId(packagerelativeapplicationid: PCWSTR): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("api-ms-win-appmodel-runtime-l1-1-1.dll", "VerifyPackageRelativeApplicationId", longArrayOf(packagerelativeapplicationid))
    return Foundation.WIN32_ERROR()
}
