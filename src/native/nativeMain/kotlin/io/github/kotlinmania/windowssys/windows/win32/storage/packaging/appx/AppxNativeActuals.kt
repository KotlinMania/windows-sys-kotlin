@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssysWindowsWin32StoragePackagingAppxActivatePackageVirtualizationContext
import io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssysWindowsWin32StoragePackagingAppxAddPackageDependency
import io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssysWindowsWin32StoragePackagingAppxAppPolicyGetClrCompat
import io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssysWindowsWin32StoragePackagingAppxAppPolicyGetCreateFileAccess
import io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssysWindowsWin32StoragePackagingAppxAppPolicyGetLifecycleManagement
import io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssysWindowsWin32StoragePackagingAppxAppPolicyGetMediaFoundationCodecLoading
import io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssysWindowsWin32StoragePackagingAppxAppPolicyGetProcessTerminationMethod
import io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssysWindowsWin32StoragePackagingAppxAppPolicyGetShowDeveloperDiagnostic
import io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssysWindowsWin32StoragePackagingAppxAppPolicyGetThreadInitializationType
import io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssysWindowsWin32StoragePackagingAppxAppPolicyGetWindowingModel
import io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssysWindowsWin32StoragePackagingAppxCheckIsMSIXPackage
import io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssysWindowsWin32StoragePackagingAppxClosePackageInfo
import io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssysWindowsWin32StoragePackagingAppxCreatePackageVirtualizationContext
import io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssysWindowsWin32StoragePackagingAppxDeactivatePackageVirtualizationContext
import io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssysWindowsWin32StoragePackagingAppxDeletePackageDependency
import io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssysWindowsWin32StoragePackagingAppxDuplicatePackageVirtualizationContext
import io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssysWindowsWin32StoragePackagingAppxFindPackagesByPackageFamily
import io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssysWindowsWin32StoragePackagingAppxFormatApplicationUserModelId
import io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssysWindowsWin32StoragePackagingAppxGetApplicationUserModelId
import io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssysWindowsWin32StoragePackagingAppxGetApplicationUserModelIdFromToken
import io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssysWindowsWin32StoragePackagingAppxGetCurrentApplicationUserModelId
import io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssysWindowsWin32StoragePackagingAppxGetCurrentPackageFamilyName
import io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssysWindowsWin32StoragePackagingAppxGetCurrentPackageFullName
import io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssysWindowsWin32StoragePackagingAppxGetCurrentPackageId
import io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssysWindowsWin32StoragePackagingAppxGetCurrentPackageInfo
import io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssysWindowsWin32StoragePackagingAppxGetCurrentPackageInfo2
import io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssysWindowsWin32StoragePackagingAppxGetCurrentPackageInfo3
import io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssysWindowsWin32StoragePackagingAppxGetCurrentPackagePath
import io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssysWindowsWin32StoragePackagingAppxGetCurrentPackagePath2
import io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssysWindowsWin32StoragePackagingAppxGetCurrentPackageVirtualizationContext
import io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssysWindowsWin32StoragePackagingAppxGetIdForPackageDependencyContext
import io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssysWindowsWin32StoragePackagingAppxGetPackageApplicationIds
import io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssysWindowsWin32StoragePackagingAppxGetPackageFamilyName
import io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssysWindowsWin32StoragePackagingAppxGetPackageFamilyNameFromToken
import io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssysWindowsWin32StoragePackagingAppxGetPackageFullName
import io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssysWindowsWin32StoragePackagingAppxGetPackageFullNameFromToken
import io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssysWindowsWin32StoragePackagingAppxGetPackageGraphRevisionId
import io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssysWindowsWin32StoragePackagingAppxGetPackageId
import io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssysWindowsWin32StoragePackagingAppxGetPackageInfo
import io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssysWindowsWin32StoragePackagingAppxGetPackageInfo2
import io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssysWindowsWin32StoragePackagingAppxGetPackagePath
import io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssysWindowsWin32StoragePackagingAppxGetPackagePathByFullName
import io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssysWindowsWin32StoragePackagingAppxGetPackagePathByFullName2
import io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssysWindowsWin32StoragePackagingAppxGetPackagesByPackageFamily
import io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssysWindowsWin32StoragePackagingAppxGetProcessesInVirtualizationContext
import io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssysWindowsWin32StoragePackagingAppxGetResolvedPackageFullNameForPackageDependency
import io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssysWindowsWin32StoragePackagingAppxGetStagedPackageOrigin
import io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssysWindowsWin32StoragePackagingAppxGetStagedPackagePathByFullName
import io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssysWindowsWin32StoragePackagingAppxGetStagedPackagePathByFullName2
import io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssysWindowsWin32StoragePackagingAppxOpenPackageInfoByFullName
import io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssysWindowsWin32StoragePackagingAppxOpenPackageInfoByFullNameForUser
import io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssysWindowsWin32StoragePackagingAppxPackageFamilyNameFromFullName
import io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssysWindowsWin32StoragePackagingAppxPackageFamilyNameFromId
import io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssysWindowsWin32StoragePackagingAppxPackageFullNameFromId
import io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssysWindowsWin32StoragePackagingAppxPackageIdFromFullName
import io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssysWindowsWin32StoragePackagingAppxPackageNameAndPublisherIdFromFamilyName
import io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssysWindowsWin32StoragePackagingAppxParseApplicationUserModelId
import io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssysWindowsWin32StoragePackagingAppxReleasePackageVirtualizationContext
import io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssysWindowsWin32StoragePackagingAppxRemovePackageDependency
import io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssysWindowsWin32StoragePackagingAppxVerifyApplicationUserModelId
import io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssysWindowsWin32StoragePackagingAppxVerifyPackageFamilyName
import io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssysWindowsWin32StoragePackagingAppxVerifyPackageFullName
import io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssysWindowsWin32StoragePackagingAppxVerifyPackageId
import io.github.kotlinmania.windowssys.windows.win32.storage.packaging.appx.cinterop.windowssysWindowsWin32StoragePackagingAppxVerifyPackageRelativeApplicationId
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun activatePackageVirtualizationContext(context: PackageVirtualizationContextHandle, cookie: MutPtr<ULong>): Hresult =
    windowssysWindowsWin32StoragePackagingAppxActivatePackageVirtualizationContext(context.rawAddress.toCPointer<ByteVar>(), cookie.rawAddress.toCPointer<ByteVar>())

public actual fun addPackageDependency(packagedependencyid: Pcwstr, rank: Int, options: AddPackageDependencyOptions, packagedependencycontext: MutPtr<PackagedependencyContext>, packagefullname: MutPtr<Pwstr>): Hresult =
    windowssysWindowsWin32StoragePackagingAppxAddPackageDependency(packagedependencyid.rawAddress.toCPointer<ByteVar>(), rank, options, packagedependencycontext.rawAddress.toCPointer<ByteVar>(), packagefullname.rawAddress.toCPointer<ByteVar>())

public actual fun appPolicyGetClrCompat(processtoken: Handle, policy: MutPtr<AppPolicyClrCompat>): Win32Error =
    windowssysWindowsWin32StoragePackagingAppxAppPolicyGetClrCompat(processtoken.rawAddress.toCPointer<ByteVar>(), policy.rawAddress.toCPointer<ByteVar>())

public actual fun appPolicyGetCreateFileAccess(processtoken: Handle, policy: MutPtr<AppPolicyCreateFileAccess>): Win32Error =
    windowssysWindowsWin32StoragePackagingAppxAppPolicyGetCreateFileAccess(processtoken.rawAddress.toCPointer<ByteVar>(), policy.rawAddress.toCPointer<ByteVar>())

public actual fun appPolicyGetLifecycleManagement(processtoken: Handle, policy: MutPtr<AppPolicyLifecycleManagement>): Win32Error =
    windowssysWindowsWin32StoragePackagingAppxAppPolicyGetLifecycleManagement(processtoken.rawAddress.toCPointer<ByteVar>(), policy.rawAddress.toCPointer<ByteVar>())

public actual fun appPolicyGetMediaFoundationCodecLoading(processtoken: Handle, policy: MutPtr<AppPolicyMediaFoundationCodecLoading>): Win32Error =
    windowssysWindowsWin32StoragePackagingAppxAppPolicyGetMediaFoundationCodecLoading(processtoken.rawAddress.toCPointer<ByteVar>(), policy.rawAddress.toCPointer<ByteVar>())

public actual fun appPolicyGetProcessTerminationMethod(processtoken: Handle, policy: MutPtr<AppPolicyProcessTerminationMethod>): Win32Error =
    windowssysWindowsWin32StoragePackagingAppxAppPolicyGetProcessTerminationMethod(processtoken.rawAddress.toCPointer<ByteVar>(), policy.rawAddress.toCPointer<ByteVar>())

public actual fun appPolicyGetShowDeveloperDiagnostic(processtoken: Handle, policy: MutPtr<AppPolicyShowDeveloperDiagnostic>): Win32Error =
    windowssysWindowsWin32StoragePackagingAppxAppPolicyGetShowDeveloperDiagnostic(processtoken.rawAddress.toCPointer<ByteVar>(), policy.rawAddress.toCPointer<ByteVar>())

public actual fun appPolicyGetThreadInitializationType(processtoken: Handle, policy: MutPtr<AppPolicyThreadInitializationType>): Win32Error =
    windowssysWindowsWin32StoragePackagingAppxAppPolicyGetThreadInitializationType(processtoken.rawAddress.toCPointer<ByteVar>(), policy.rawAddress.toCPointer<ByteVar>())

public actual fun appPolicyGetWindowingModel(processtoken: Handle, policy: MutPtr<AppPolicyWindowingModel>): Win32Error =
    windowssysWindowsWin32StoragePackagingAppxAppPolicyGetWindowingModel(processtoken.rawAddress.toCPointer<ByteVar>(), policy.rawAddress.toCPointer<ByteVar>())

public actual fun checkIsMSIXPackage(packagefullname: Pcwstr, ismsixpackage: MutPtr<Bool>): Hresult =
    windowssysWindowsWin32StoragePackagingAppxCheckIsMSIXPackage(packagefullname.rawAddress.toCPointer<ByteVar>(), ismsixpackage.rawAddress.toCPointer<ByteVar>())

public actual fun closePackageInfo(packageinforeference: ConstPtr<PackageInfoReference>): Win32Error =
    windowssysWindowsWin32StoragePackagingAppxClosePackageInfo(packageinforeference.rawAddress.toCPointer<ByteVar>())

public actual fun createPackageVirtualizationContext(packagefamilyname: Pcwstr, context: MutPtr<PackageVirtualizationContextHandle>): Hresult =
    windowssysWindowsWin32StoragePackagingAppxCreatePackageVirtualizationContext(packagefamilyname.rawAddress.toCPointer<ByteVar>(), context.rawAddress.toCPointer<ByteVar>())

public actual fun deactivatePackageVirtualizationContext(cookie: ULong) {
    windowssysWindowsWin32StoragePackagingAppxDeactivatePackageVirtualizationContext(cookie)
}

public actual fun deletePackageDependency(packagedependencyid: Pcwstr): Hresult =
    windowssysWindowsWin32StoragePackagingAppxDeletePackageDependency(packagedependencyid.rawAddress.toCPointer<ByteVar>())

public actual fun duplicatePackageVirtualizationContext(sourcecontext: PackageVirtualizationContextHandle, destcontext: MutPtr<PackageVirtualizationContextHandle>): Hresult =
    windowssysWindowsWin32StoragePackagingAppxDuplicatePackageVirtualizationContext(sourcecontext.rawAddress.toCPointer<ByteVar>(), destcontext.rawAddress.toCPointer<ByteVar>())

public actual fun findPackagesByPackageFamily(packagefamilyname: Pcwstr, packagefilters: UInt, count: MutPtr<UInt>, packagefullnames: MutPtr<Pwstr>, bufferlength: MutPtr<UInt>, buffer: Pwstr, packageproperties: MutPtr<UInt>): Win32Error =
    windowssysWindowsWin32StoragePackagingAppxFindPackagesByPackageFamily(packagefamilyname.rawAddress.toCPointer<ByteVar>(), packagefilters, count.rawAddress.toCPointer<ByteVar>(), packagefullnames.rawAddress.toCPointer<ByteVar>(), bufferlength.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>(), packageproperties.rawAddress.toCPointer<ByteVar>())

public actual fun formatApplicationUserModelId(packagefamilyname: Pcwstr, packagerelativeapplicationid: Pcwstr, applicationusermodelidlength: MutPtr<UInt>, applicationusermodelid: Pwstr): Win32Error =
    windowssysWindowsWin32StoragePackagingAppxFormatApplicationUserModelId(packagefamilyname.rawAddress.toCPointer<ByteVar>(), packagerelativeapplicationid.rawAddress.toCPointer<ByteVar>(), applicationusermodelidlength.rawAddress.toCPointer<ByteVar>(), applicationusermodelid.rawAddress.toCPointer<ByteVar>())

public actual fun getApplicationUserModelId(hprocess: Handle, applicationusermodelidlength: MutPtr<UInt>, applicationusermodelid: Pwstr): Win32Error =
    windowssysWindowsWin32StoragePackagingAppxGetApplicationUserModelId(hprocess.rawAddress.toCPointer<ByteVar>(), applicationusermodelidlength.rawAddress.toCPointer<ByteVar>(), applicationusermodelid.rawAddress.toCPointer<ByteVar>())

public actual fun getApplicationUserModelIdFromToken(token: Handle, applicationusermodelidlength: MutPtr<UInt>, applicationusermodelid: Pwstr): Win32Error =
    windowssysWindowsWin32StoragePackagingAppxGetApplicationUserModelIdFromToken(token.rawAddress.toCPointer<ByteVar>(), applicationusermodelidlength.rawAddress.toCPointer<ByteVar>(), applicationusermodelid.rawAddress.toCPointer<ByteVar>())

public actual fun getCurrentApplicationUserModelId(applicationusermodelidlength: MutPtr<UInt>, applicationusermodelid: Pwstr): Win32Error =
    windowssysWindowsWin32StoragePackagingAppxGetCurrentApplicationUserModelId(applicationusermodelidlength.rawAddress.toCPointer<ByteVar>(), applicationusermodelid.rawAddress.toCPointer<ByteVar>())

public actual fun getCurrentPackageFamilyName(packagefamilynamelength: MutPtr<UInt>, packagefamilyname: Pwstr): Win32Error =
    windowssysWindowsWin32StoragePackagingAppxGetCurrentPackageFamilyName(packagefamilynamelength.rawAddress.toCPointer<ByteVar>(), packagefamilyname.rawAddress.toCPointer<ByteVar>())

public actual fun getCurrentPackageFullName(packagefullnamelength: MutPtr<UInt>, packagefullname: Pwstr): Win32Error =
    windowssysWindowsWin32StoragePackagingAppxGetCurrentPackageFullName(packagefullnamelength.rawAddress.toCPointer<ByteVar>(), packagefullname.rawAddress.toCPointer<ByteVar>())

public actual fun getCurrentPackageId(bufferlength: MutPtr<UInt>, buffer: MutPtr<UByte>): Win32Error =
    windowssysWindowsWin32StoragePackagingAppxGetCurrentPackageId(bufferlength.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>())

public actual fun getCurrentPackageInfo(flags: UInt, bufferlength: MutPtr<UInt>, buffer: MutPtr<UByte>, count: MutPtr<UInt>): Win32Error =
    windowssysWindowsWin32StoragePackagingAppxGetCurrentPackageInfo(flags, bufferlength.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>(), count.rawAddress.toCPointer<ByteVar>())

public actual fun getCurrentPackageInfo2(flags: UInt, packagepathtype: PackagePathType, bufferlength: MutPtr<UInt>, buffer: MutPtr<UByte>, count: MutPtr<UInt>): Win32Error =
    windowssysWindowsWin32StoragePackagingAppxGetCurrentPackageInfo2(flags, packagepathtype, bufferlength.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>(), count.rawAddress.toCPointer<ByteVar>())

public actual fun getCurrentPackageInfo3(flags: UInt, packageinfotype: PackageInfo3Type, bufferlength: MutPtr<UInt>, buffer: MutPtr<CVoid>, count: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32StoragePackagingAppxGetCurrentPackageInfo3(flags, packageinfotype, bufferlength.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>(), count.rawAddress.toCPointer<ByteVar>())

public actual fun getCurrentPackagePath(pathlength: MutPtr<UInt>, path: Pwstr): Win32Error =
    windowssysWindowsWin32StoragePackagingAppxGetCurrentPackagePath(pathlength.rawAddress.toCPointer<ByteVar>(), path.rawAddress.toCPointer<ByteVar>())

public actual fun getCurrentPackagePath2(packagepathtype: PackagePathType, pathlength: MutPtr<UInt>, path: Pwstr): Win32Error =
    windowssysWindowsWin32StoragePackagingAppxGetCurrentPackagePath2(packagepathtype, pathlength.rawAddress.toCPointer<ByteVar>(), path.rawAddress.toCPointer<ByteVar>())

public actual fun getCurrentPackageVirtualizationContext(): PackageVirtualizationContextHandle =
    MutPtr(windowssysWindowsWin32StoragePackagingAppxGetCurrentPackageVirtualizationContext()?.toLong() ?: 0L)

public actual fun getIdForPackageDependencyContext(packagedependencycontext: PackagedependencyContext, packagedependencyid: MutPtr<Pwstr>): Hresult =
    windowssysWindowsWin32StoragePackagingAppxGetIdForPackageDependencyContext(packagedependencycontext.rawAddress.toCPointer<ByteVar>(), packagedependencyid.rawAddress.toCPointer<ByteVar>())

public actual fun getPackageApplicationIds(packageinforeference: ConstPtr<PackageInfoReference>, bufferlength: MutPtr<UInt>, buffer: MutPtr<UByte>, count: MutPtr<UInt>): Win32Error =
    windowssysWindowsWin32StoragePackagingAppxGetPackageApplicationIds(packageinforeference.rawAddress.toCPointer<ByteVar>(), bufferlength.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>(), count.rawAddress.toCPointer<ByteVar>())

public actual fun getPackageFamilyName(hprocess: Handle, packagefamilynamelength: MutPtr<UInt>, packagefamilyname: Pwstr): Win32Error =
    windowssysWindowsWin32StoragePackagingAppxGetPackageFamilyName(hprocess.rawAddress.toCPointer<ByteVar>(), packagefamilynamelength.rawAddress.toCPointer<ByteVar>(), packagefamilyname.rawAddress.toCPointer<ByteVar>())

public actual fun getPackageFamilyNameFromToken(token: Handle, packagefamilynamelength: MutPtr<UInt>, packagefamilyname: Pwstr): Win32Error =
    windowssysWindowsWin32StoragePackagingAppxGetPackageFamilyNameFromToken(token.rawAddress.toCPointer<ByteVar>(), packagefamilynamelength.rawAddress.toCPointer<ByteVar>(), packagefamilyname.rawAddress.toCPointer<ByteVar>())

public actual fun getPackageFullName(hprocess: Handle, packagefullnamelength: MutPtr<UInt>, packagefullname: Pwstr): Win32Error =
    windowssysWindowsWin32StoragePackagingAppxGetPackageFullName(hprocess.rawAddress.toCPointer<ByteVar>(), packagefullnamelength.rawAddress.toCPointer<ByteVar>(), packagefullname.rawAddress.toCPointer<ByteVar>())

public actual fun getPackageFullNameFromToken(token: Handle, packagefullnamelength: MutPtr<UInt>, packagefullname: Pwstr): Win32Error =
    windowssysWindowsWin32StoragePackagingAppxGetPackageFullNameFromToken(token.rawAddress.toCPointer<ByteVar>(), packagefullnamelength.rawAddress.toCPointer<ByteVar>(), packagefullname.rawAddress.toCPointer<ByteVar>())

public actual fun getPackageGraphRevisionId(): UInt =
    windowssysWindowsWin32StoragePackagingAppxGetPackageGraphRevisionId()

public actual fun getPackageId(hprocess: Handle, bufferlength: MutPtr<UInt>, buffer: MutPtr<UByte>): Win32Error =
    windowssysWindowsWin32StoragePackagingAppxGetPackageId(hprocess.rawAddress.toCPointer<ByteVar>(), bufferlength.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>())

public actual fun getPackageInfo(packageinforeference: ConstPtr<PackageInfoReference>, flags: UInt, bufferlength: MutPtr<UInt>, buffer: MutPtr<UByte>, count: MutPtr<UInt>): Win32Error =
    windowssysWindowsWin32StoragePackagingAppxGetPackageInfo(packageinforeference.rawAddress.toCPointer<ByteVar>(), flags, bufferlength.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>(), count.rawAddress.toCPointer<ByteVar>())

public actual fun getPackageInfo2(packageinforeference: ConstPtr<PackageInfoReference>, flags: UInt, packagepathtype: PackagePathType, bufferlength: MutPtr<UInt>, buffer: MutPtr<UByte>, count: MutPtr<UInt>): Win32Error =
    windowssysWindowsWin32StoragePackagingAppxGetPackageInfo2(packageinforeference.rawAddress.toCPointer<ByteVar>(), flags, packagepathtype, bufferlength.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>(), count.rawAddress.toCPointer<ByteVar>())

public actual fun getPackagePath(packageid: ConstPtr<PackageId>, reserved: UInt, pathlength: MutPtr<UInt>, path: Pwstr): Win32Error =
    windowssysWindowsWin32StoragePackagingAppxGetPackagePath(packageid.rawAddress.toCPointer<ByteVar>(), reserved, pathlength.rawAddress.toCPointer<ByteVar>(), path.rawAddress.toCPointer<ByteVar>())

public actual fun getPackagePathByFullName(packagefullname: Pcwstr, pathlength: MutPtr<UInt>, path: Pwstr): Win32Error =
    windowssysWindowsWin32StoragePackagingAppxGetPackagePathByFullName(packagefullname.rawAddress.toCPointer<ByteVar>(), pathlength.rawAddress.toCPointer<ByteVar>(), path.rawAddress.toCPointer<ByteVar>())

public actual fun getPackagePathByFullName2(packagefullname: Pcwstr, packagepathtype: PackagePathType, pathlength: MutPtr<UInt>, path: Pwstr): Win32Error =
    windowssysWindowsWin32StoragePackagingAppxGetPackagePathByFullName2(packagefullname.rawAddress.toCPointer<ByteVar>(), packagepathtype, pathlength.rawAddress.toCPointer<ByteVar>(), path.rawAddress.toCPointer<ByteVar>())

public actual fun getPackagesByPackageFamily(packagefamilyname: Pcwstr, count: MutPtr<UInt>, packagefullnames: MutPtr<Pwstr>, bufferlength: MutPtr<UInt>, buffer: Pwstr): Win32Error =
    windowssysWindowsWin32StoragePackagingAppxGetPackagesByPackageFamily(packagefamilyname.rawAddress.toCPointer<ByteVar>(), count.rawAddress.toCPointer<ByteVar>(), packagefullnames.rawAddress.toCPointer<ByteVar>(), bufferlength.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>())

public actual fun getProcessesInVirtualizationContext(packagefamilyname: Pcwstr, count: MutPtr<UInt>, processes: MutPtr<MutPtr<Handle>>): Hresult =
    windowssysWindowsWin32StoragePackagingAppxGetProcessesInVirtualizationContext(packagefamilyname.rawAddress.toCPointer<ByteVar>(), count.rawAddress.toCPointer<ByteVar>(), processes.rawAddress.toCPointer<ByteVar>())

public actual fun getResolvedPackageFullNameForPackageDependency(packagedependencyid: Pcwstr, packagefullname: MutPtr<Pwstr>): Hresult =
    windowssysWindowsWin32StoragePackagingAppxGetResolvedPackageFullNameForPackageDependency(packagedependencyid.rawAddress.toCPointer<ByteVar>(), packagefullname.rawAddress.toCPointer<ByteVar>())

public actual fun getStagedPackageOrigin(packagefullname: Pcwstr, origin: MutPtr<PackageOrigin>): Win32Error =
    windowssysWindowsWin32StoragePackagingAppxGetStagedPackageOrigin(packagefullname.rawAddress.toCPointer<ByteVar>(), origin.rawAddress.toCPointer<ByteVar>())

public actual fun getStagedPackagePathByFullName(packagefullname: Pcwstr, pathlength: MutPtr<UInt>, path: Pwstr): Win32Error =
    windowssysWindowsWin32StoragePackagingAppxGetStagedPackagePathByFullName(packagefullname.rawAddress.toCPointer<ByteVar>(), pathlength.rawAddress.toCPointer<ByteVar>(), path.rawAddress.toCPointer<ByteVar>())

public actual fun getStagedPackagePathByFullName2(packagefullname: Pcwstr, packagepathtype: PackagePathType, pathlength: MutPtr<UInt>, path: Pwstr): Win32Error =
    windowssysWindowsWin32StoragePackagingAppxGetStagedPackagePathByFullName2(packagefullname.rawAddress.toCPointer<ByteVar>(), packagepathtype, pathlength.rawAddress.toCPointer<ByteVar>(), path.rawAddress.toCPointer<ByteVar>())

public actual fun openPackageInfoByFullName(packagefullname: Pcwstr, reserved: UInt, packageinforeference: MutPtr<MutPtr<PackageInfoReference>>): Win32Error =
    windowssysWindowsWin32StoragePackagingAppxOpenPackageInfoByFullName(packagefullname.rawAddress.toCPointer<ByteVar>(), reserved, packageinforeference.rawAddress.toCPointer<ByteVar>())

public actual fun openPackageInfoByFullNameForUser(usersid: Psid, packagefullname: Pcwstr, reserved: UInt, packageinforeference: MutPtr<MutPtr<PackageInfoReference>>): Win32Error =
    windowssysWindowsWin32StoragePackagingAppxOpenPackageInfoByFullNameForUser(usersid.rawAddress.toCPointer<ByteVar>(), packagefullname.rawAddress.toCPointer<ByteVar>(), reserved, packageinforeference.rawAddress.toCPointer<ByteVar>())

public actual fun packageFamilyNameFromFullName(packagefullname: Pcwstr, packagefamilynamelength: MutPtr<UInt>, packagefamilyname: Pwstr): Win32Error =
    windowssysWindowsWin32StoragePackagingAppxPackageFamilyNameFromFullName(packagefullname.rawAddress.toCPointer<ByteVar>(), packagefamilynamelength.rawAddress.toCPointer<ByteVar>(), packagefamilyname.rawAddress.toCPointer<ByteVar>())

public actual fun packageFamilyNameFromId(packageid: ConstPtr<PackageId>, packagefamilynamelength: MutPtr<UInt>, packagefamilyname: Pwstr): Win32Error =
    windowssysWindowsWin32StoragePackagingAppxPackageFamilyNameFromId(packageid.rawAddress.toCPointer<ByteVar>(), packagefamilynamelength.rawAddress.toCPointer<ByteVar>(), packagefamilyname.rawAddress.toCPointer<ByteVar>())

public actual fun packageFullNameFromId(packageid: ConstPtr<PackageId>, packagefullnamelength: MutPtr<UInt>, packagefullname: Pwstr): Win32Error =
    windowssysWindowsWin32StoragePackagingAppxPackageFullNameFromId(packageid.rawAddress.toCPointer<ByteVar>(), packagefullnamelength.rawAddress.toCPointer<ByteVar>(), packagefullname.rawAddress.toCPointer<ByteVar>())

public actual fun packageIdFromFullName(packagefullname: Pcwstr, flags: UInt, bufferlength: MutPtr<UInt>, buffer: MutPtr<UByte>): Win32Error =
    windowssysWindowsWin32StoragePackagingAppxPackageIdFromFullName(packagefullname.rawAddress.toCPointer<ByteVar>(), flags, bufferlength.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>())

public actual fun packageNameAndPublisherIdFromFamilyName(packagefamilyname: Pcwstr, packagenamelength: MutPtr<UInt>, packagename: Pwstr, packagepublisheridlength: MutPtr<UInt>, packagepublisherid: Pwstr): Win32Error =
    windowssysWindowsWin32StoragePackagingAppxPackageNameAndPublisherIdFromFamilyName(packagefamilyname.rawAddress.toCPointer<ByteVar>(), packagenamelength.rawAddress.toCPointer<ByteVar>(), packagename.rawAddress.toCPointer<ByteVar>(), packagepublisheridlength.rawAddress.toCPointer<ByteVar>(), packagepublisherid.rawAddress.toCPointer<ByteVar>())

public actual fun parseApplicationUserModelId(applicationusermodelid: Pcwstr, packagefamilynamelength: MutPtr<UInt>, packagefamilyname: Pwstr, packagerelativeapplicationidlength: MutPtr<UInt>, packagerelativeapplicationid: Pwstr): Win32Error =
    windowssysWindowsWin32StoragePackagingAppxParseApplicationUserModelId(applicationusermodelid.rawAddress.toCPointer<ByteVar>(), packagefamilynamelength.rawAddress.toCPointer<ByteVar>(), packagefamilyname.rawAddress.toCPointer<ByteVar>(), packagerelativeapplicationidlength.rawAddress.toCPointer<ByteVar>(), packagerelativeapplicationid.rawAddress.toCPointer<ByteVar>())

public actual fun releasePackageVirtualizationContext(context: PackageVirtualizationContextHandle) {
    windowssysWindowsWin32StoragePackagingAppxReleasePackageVirtualizationContext(context.rawAddress.toCPointer<ByteVar>())
}

public actual fun removePackageDependency(packagedependencycontext: PackagedependencyContext): Hresult =
    windowssysWindowsWin32StoragePackagingAppxRemovePackageDependency(packagedependencycontext.rawAddress.toCPointer<ByteVar>())

public actual fun tryCreatePackageDependency(user: Psid, packagefamilyname: Pcwstr, minversion: PackageVersion, packagedependencyprocessorarchitectures: PackageDependencyProcessorArchitectures, lifetimekind: PackageDependencyLifetimeKind, lifetimeartifact: Pcwstr, options: CreatePackageDependencyOptions, packagedependencyid: MutPtr<Pwstr>): Hresult =
    0

public actual fun verifyApplicationUserModelId(applicationusermodelid: Pcwstr): Win32Error =
    windowssysWindowsWin32StoragePackagingAppxVerifyApplicationUserModelId(applicationusermodelid.rawAddress.toCPointer<ByteVar>())

public actual fun verifyPackageFamilyName(packagefamilyname: Pcwstr): Win32Error =
    windowssysWindowsWin32StoragePackagingAppxVerifyPackageFamilyName(packagefamilyname.rawAddress.toCPointer<ByteVar>())

public actual fun verifyPackageFullName(packagefullname: Pcwstr): Win32Error =
    windowssysWindowsWin32StoragePackagingAppxVerifyPackageFullName(packagefullname.rawAddress.toCPointer<ByteVar>())

public actual fun verifyPackageId(packageid: ConstPtr<PackageId>): Win32Error =
    windowssysWindowsWin32StoragePackagingAppxVerifyPackageId(packageid.rawAddress.toCPointer<ByteVar>())

public actual fun verifyPackageRelativeApplicationId(packagerelativeapplicationid: Pcwstr): Win32Error =
    windowssysWindowsWin32StoragePackagingAppxVerifyPackageRelativeApplicationId(packagerelativeapplicationid.rawAddress.toCPointer<ByteVar>())
