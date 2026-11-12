@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private object WindowsWin32StoragePackagingAppxJniBridge {
    init {
        loadNativeLibrary()
    }

    private fun loadNativeLibrary() {
        val osRaw = System.getProperty("os.name", "").lowercase()
        val archRaw = System.getProperty("os.arch", "").lowercase()
        val hostPlatform =
            when {
                osRaw.contains("win") -> "windows"
                osRaw.contains("mac") || osRaw.contains("darwin") -> "macos"
                else -> "linux"
            }
        val hostArch =
            when {
                archRaw == "aarch64" || archRaw == "arm64" -> "aarch64"
                archRaw == "amd64" || archRaw == "x86_64" -> "x86_64"
                else -> archRaw
            }
        val libFileName =
            when (hostPlatform) {
                "windows" -> "windowssys_jni.dll"
                "macos" -> "libwindowssys_jni.dylib"
                else -> "libwindowssys_jni.so"
            }
        val pathSep = System.getProperty("path.separator", ":")
        val libPathProp = System.getProperty("java.library.path", "")
        for (dirEntry in libPathProp.split(pathSep)) {
            if (dirEntry.isEmpty()) continue
            val candidate = java.io.File(dirEntry, libFileName)
            if (candidate.isFile) {
                System.load(candidate.absolutePath)
                return
            }
        }
        val resourcePath = "io/github/kotlinmania/windowssys/native/$hostPlatform-$hostArch/$libFileName"
        val stream = WindowsWin32StoragePackagingAppxJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
        if (stream != null) {
            val suffix = "." + libFileName.substringAfterLast('.')
            val extracted =
                java.nio.file.Files
                    .createTempFile("windowssys_jni-", suffix)
                    .toFile()
            extracted.deleteOnExit()
            stream.use { input ->
                extracted.outputStream().use { output ->
                    input.copyTo(output)
                }
            }
            System.load(extracted.absolutePath)
            return
        }
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32StoragePackagingAppxActivatePackageVirtualizationContext(context: Long, cookie: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StoragePackagingAppxAddPackageDependency(packagedependencyid: Long, rank: Int, options: Int, packagedependencycontext: Long, packagefullname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StoragePackagingAppxAppPolicyGetClrCompat(processtoken: Long, policy: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StoragePackagingAppxAppPolicyGetCreateFileAccess(processtoken: Long, policy: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StoragePackagingAppxAppPolicyGetLifecycleManagement(processtoken: Long, policy: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StoragePackagingAppxAppPolicyGetMediaFoundationCodecLoading(processtoken: Long, policy: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StoragePackagingAppxAppPolicyGetProcessTerminationMethod(processtoken: Long, policy: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StoragePackagingAppxAppPolicyGetShowDeveloperDiagnostic(processtoken: Long, policy: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StoragePackagingAppxAppPolicyGetThreadInitializationType(processtoken: Long, policy: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StoragePackagingAppxAppPolicyGetWindowingModel(processtoken: Long, policy: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StoragePackagingAppxCheckIsMSIXPackage(packagefullname: Long, ismsixpackage: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StoragePackagingAppxClosePackageInfo(packageinforeference: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StoragePackagingAppxCreatePackageVirtualizationContext(packagefamilyname: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StoragePackagingAppxDeactivatePackageVirtualizationContext(cookie: Long)

    @JvmStatic
    external fun windowssysWindowsWin32StoragePackagingAppxDeletePackageDependency(packagedependencyid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StoragePackagingAppxDuplicatePackageVirtualizationContext(sourcecontext: Long, destcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StoragePackagingAppxFindPackagesByPackageFamily(packagefamilyname: Long, packagefilters: Int, count: Long, packagefullnames: Long, bufferlength: Long, buffer: Long, packageproperties: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StoragePackagingAppxFormatApplicationUserModelId(packagefamilyname: Long, packagerelativeapplicationid: Long, applicationusermodelidlength: Long, applicationusermodelid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StoragePackagingAppxGetApplicationUserModelId(hprocess: Long, applicationusermodelidlength: Long, applicationusermodelid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StoragePackagingAppxGetApplicationUserModelIdFromToken(token: Long, applicationusermodelidlength: Long, applicationusermodelid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StoragePackagingAppxGetCurrentApplicationUserModelId(applicationusermodelidlength: Long, applicationusermodelid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StoragePackagingAppxGetCurrentPackageFamilyName(packagefamilynamelength: Long, packagefamilyname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StoragePackagingAppxGetCurrentPackageFullName(packagefullnamelength: Long, packagefullname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StoragePackagingAppxGetCurrentPackageId(bufferlength: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StoragePackagingAppxGetCurrentPackageInfo(flags: Int, bufferlength: Long, buffer: Long, count: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StoragePackagingAppxGetCurrentPackageInfo2(flags: Int, packagepathtype: Int, bufferlength: Long, buffer: Long, count: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StoragePackagingAppxGetCurrentPackageInfo3(flags: Int, packageinfotype: Int, bufferlength: Long, buffer: Long, count: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StoragePackagingAppxGetCurrentPackagePath(pathlength: Long, path: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StoragePackagingAppxGetCurrentPackagePath2(packagepathtype: Int, pathlength: Long, path: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StoragePackagingAppxGetCurrentPackageVirtualizationContext(): Long

    @JvmStatic
    external fun windowssysWindowsWin32StoragePackagingAppxGetIdForPackageDependencyContext(packagedependencycontext: Long, packagedependencyid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StoragePackagingAppxGetPackageApplicationIds(packageinforeference: Long, bufferlength: Long, buffer: Long, count: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StoragePackagingAppxGetPackageFamilyName(hprocess: Long, packagefamilynamelength: Long, packagefamilyname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StoragePackagingAppxGetPackageFamilyNameFromToken(token: Long, packagefamilynamelength: Long, packagefamilyname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StoragePackagingAppxGetPackageFullName(hprocess: Long, packagefullnamelength: Long, packagefullname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StoragePackagingAppxGetPackageFullNameFromToken(token: Long, packagefullnamelength: Long, packagefullname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StoragePackagingAppxGetPackageGraphRevisionId(): Int

    @JvmStatic
    external fun windowssysWindowsWin32StoragePackagingAppxGetPackageId(hprocess: Long, bufferlength: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StoragePackagingAppxGetPackageInfo(packageinforeference: Long, flags: Int, bufferlength: Long, buffer: Long, count: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StoragePackagingAppxGetPackageInfo2(packageinforeference: Long, flags: Int, packagepathtype: Int, bufferlength: Long, buffer: Long, count: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StoragePackagingAppxGetPackagePath(packageid: Long, reserved: Int, pathlength: Long, path: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StoragePackagingAppxGetPackagePathByFullName(packagefullname: Long, pathlength: Long, path: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StoragePackagingAppxGetPackagePathByFullName2(packagefullname: Long, packagepathtype: Int, pathlength: Long, path: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StoragePackagingAppxGetPackagesByPackageFamily(packagefamilyname: Long, count: Long, packagefullnames: Long, bufferlength: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StoragePackagingAppxGetProcessesInVirtualizationContext(packagefamilyname: Long, count: Long, processes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StoragePackagingAppxGetResolvedPackageFullNameForPackageDependency(packagedependencyid: Long, packagefullname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StoragePackagingAppxGetStagedPackageOrigin(packagefullname: Long, origin: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StoragePackagingAppxGetStagedPackagePathByFullName(packagefullname: Long, pathlength: Long, path: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StoragePackagingAppxGetStagedPackagePathByFullName2(packagefullname: Long, packagepathtype: Int, pathlength: Long, path: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StoragePackagingAppxOpenPackageInfoByFullName(packagefullname: Long, reserved: Int, packageinforeference: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StoragePackagingAppxOpenPackageInfoByFullNameForUser(usersid: Long, packagefullname: Long, reserved: Int, packageinforeference: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StoragePackagingAppxPackageFamilyNameFromFullName(packagefullname: Long, packagefamilynamelength: Long, packagefamilyname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StoragePackagingAppxPackageFamilyNameFromId(packageid: Long, packagefamilynamelength: Long, packagefamilyname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StoragePackagingAppxPackageFullNameFromId(packageid: Long, packagefullnamelength: Long, packagefullname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StoragePackagingAppxPackageIdFromFullName(packagefullname: Long, flags: Int, bufferlength: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StoragePackagingAppxPackageNameAndPublisherIdFromFamilyName(packagefamilyname: Long, packagenamelength: Long, packagename: Long, packagepublisheridlength: Long, packagepublisherid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StoragePackagingAppxParseApplicationUserModelId(applicationusermodelid: Long, packagefamilynamelength: Long, packagefamilyname: Long, packagerelativeapplicationidlength: Long, packagerelativeapplicationid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StoragePackagingAppxReleasePackageVirtualizationContext(context: Long)

    @JvmStatic
    external fun windowssysWindowsWin32StoragePackagingAppxRemovePackageDependency(packagedependencycontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StoragePackagingAppxVerifyApplicationUserModelId(applicationusermodelid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StoragePackagingAppxVerifyPackageFamilyName(packagefamilyname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StoragePackagingAppxVerifyPackageFullName(packagefullname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StoragePackagingAppxVerifyPackageId(packageid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StoragePackagingAppxVerifyPackageRelativeApplicationId(packagerelativeapplicationid: Long): Int
}

public actual fun activatePackageVirtualizationContext(context: PackageVirtualizationContextHandle, cookie: MutPtr<ULong>): Hresult =
    WindowsWin32StoragePackagingAppxJniBridge.windowssysWindowsWin32StoragePackagingAppxActivatePackageVirtualizationContext(context.rawAddress, cookie.rawAddress)

public actual fun addPackageDependency(packagedependencyid: Pcwstr, rank: Int, options: AddPackageDependencyOptions, packagedependencycontext: MutPtr<PackagedependencyContext>, packagefullname: MutPtr<Pwstr>): Hresult =
    WindowsWin32StoragePackagingAppxJniBridge.windowssysWindowsWin32StoragePackagingAppxAddPackageDependency(packagedependencyid.rawAddress, rank, options, packagedependencycontext.rawAddress, packagefullname.rawAddress)

public actual fun appPolicyGetClrCompat(processtoken: Handle, policy: MutPtr<AppPolicyClrCompat>): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssysWindowsWin32StoragePackagingAppxAppPolicyGetClrCompat(processtoken.rawAddress, policy.rawAddress).toUInt()

public actual fun appPolicyGetCreateFileAccess(processtoken: Handle, policy: MutPtr<AppPolicyCreateFileAccess>): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssysWindowsWin32StoragePackagingAppxAppPolicyGetCreateFileAccess(processtoken.rawAddress, policy.rawAddress).toUInt()

public actual fun appPolicyGetLifecycleManagement(processtoken: Handle, policy: MutPtr<AppPolicyLifecycleManagement>): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssysWindowsWin32StoragePackagingAppxAppPolicyGetLifecycleManagement(processtoken.rawAddress, policy.rawAddress).toUInt()

public actual fun appPolicyGetMediaFoundationCodecLoading(processtoken: Handle, policy: MutPtr<AppPolicyMediaFoundationCodecLoading>): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssysWindowsWin32StoragePackagingAppxAppPolicyGetMediaFoundationCodecLoading(processtoken.rawAddress, policy.rawAddress).toUInt()

public actual fun appPolicyGetProcessTerminationMethod(processtoken: Handle, policy: MutPtr<AppPolicyProcessTerminationMethod>): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssysWindowsWin32StoragePackagingAppxAppPolicyGetProcessTerminationMethod(processtoken.rawAddress, policy.rawAddress).toUInt()

public actual fun appPolicyGetShowDeveloperDiagnostic(processtoken: Handle, policy: MutPtr<AppPolicyShowDeveloperDiagnostic>): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssysWindowsWin32StoragePackagingAppxAppPolicyGetShowDeveloperDiagnostic(processtoken.rawAddress, policy.rawAddress).toUInt()

public actual fun appPolicyGetThreadInitializationType(processtoken: Handle, policy: MutPtr<AppPolicyThreadInitializationType>): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssysWindowsWin32StoragePackagingAppxAppPolicyGetThreadInitializationType(processtoken.rawAddress, policy.rawAddress).toUInt()

public actual fun appPolicyGetWindowingModel(processtoken: Handle, policy: MutPtr<AppPolicyWindowingModel>): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssysWindowsWin32StoragePackagingAppxAppPolicyGetWindowingModel(processtoken.rawAddress, policy.rawAddress).toUInt()

public actual fun checkIsMSIXPackage(packagefullname: Pcwstr, ismsixpackage: MutPtr<Bool>): Hresult =
    WindowsWin32StoragePackagingAppxJniBridge.windowssysWindowsWin32StoragePackagingAppxCheckIsMSIXPackage(packagefullname.rawAddress, ismsixpackage.rawAddress)

public actual fun closePackageInfo(packageinforeference: ConstPtr<PackageInfoReference>): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssysWindowsWin32StoragePackagingAppxClosePackageInfo(packageinforeference.rawAddress).toUInt()

public actual fun createPackageVirtualizationContext(packagefamilyname: Pcwstr, context: MutPtr<PackageVirtualizationContextHandle>): Hresult =
    WindowsWin32StoragePackagingAppxJniBridge.windowssysWindowsWin32StoragePackagingAppxCreatePackageVirtualizationContext(packagefamilyname.rawAddress, context.rawAddress)

public actual fun deactivatePackageVirtualizationContext(cookie: ULong) {
    WindowsWin32StoragePackagingAppxJniBridge.windowssysWindowsWin32StoragePackagingAppxDeactivatePackageVirtualizationContext(cookie.toLong())
}

public actual fun deletePackageDependency(packagedependencyid: Pcwstr): Hresult =
    WindowsWin32StoragePackagingAppxJniBridge.windowssysWindowsWin32StoragePackagingAppxDeletePackageDependency(packagedependencyid.rawAddress)

public actual fun duplicatePackageVirtualizationContext(sourcecontext: PackageVirtualizationContextHandle, destcontext: MutPtr<PackageVirtualizationContextHandle>): Hresult =
    WindowsWin32StoragePackagingAppxJniBridge.windowssysWindowsWin32StoragePackagingAppxDuplicatePackageVirtualizationContext(sourcecontext.rawAddress, destcontext.rawAddress)

public actual fun findPackagesByPackageFamily(packagefamilyname: Pcwstr, packagefilters: UInt, count: MutPtr<UInt>, packagefullnames: MutPtr<Pwstr>, bufferlength: MutPtr<UInt>, buffer: Pwstr, packageproperties: MutPtr<UInt>): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssysWindowsWin32StoragePackagingAppxFindPackagesByPackageFamily(packagefamilyname.rawAddress, packagefilters.toInt(), count.rawAddress, packagefullnames.rawAddress, bufferlength.rawAddress, buffer.rawAddress, packageproperties.rawAddress).toUInt()

public actual fun formatApplicationUserModelId(packagefamilyname: Pcwstr, packagerelativeapplicationid: Pcwstr, applicationusermodelidlength: MutPtr<UInt>, applicationusermodelid: Pwstr): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssysWindowsWin32StoragePackagingAppxFormatApplicationUserModelId(packagefamilyname.rawAddress, packagerelativeapplicationid.rawAddress, applicationusermodelidlength.rawAddress, applicationusermodelid.rawAddress).toUInt()

public actual fun getApplicationUserModelId(hprocess: Handle, applicationusermodelidlength: MutPtr<UInt>, applicationusermodelid: Pwstr): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssysWindowsWin32StoragePackagingAppxGetApplicationUserModelId(hprocess.rawAddress, applicationusermodelidlength.rawAddress, applicationusermodelid.rawAddress).toUInt()

public actual fun getApplicationUserModelIdFromToken(token: Handle, applicationusermodelidlength: MutPtr<UInt>, applicationusermodelid: Pwstr): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssysWindowsWin32StoragePackagingAppxGetApplicationUserModelIdFromToken(token.rawAddress, applicationusermodelidlength.rawAddress, applicationusermodelid.rawAddress).toUInt()

public actual fun getCurrentApplicationUserModelId(applicationusermodelidlength: MutPtr<UInt>, applicationusermodelid: Pwstr): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssysWindowsWin32StoragePackagingAppxGetCurrentApplicationUserModelId(applicationusermodelidlength.rawAddress, applicationusermodelid.rawAddress).toUInt()

public actual fun getCurrentPackageFamilyName(packagefamilynamelength: MutPtr<UInt>, packagefamilyname: Pwstr): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssysWindowsWin32StoragePackagingAppxGetCurrentPackageFamilyName(packagefamilynamelength.rawAddress, packagefamilyname.rawAddress).toUInt()

public actual fun getCurrentPackageFullName(packagefullnamelength: MutPtr<UInt>, packagefullname: Pwstr): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssysWindowsWin32StoragePackagingAppxGetCurrentPackageFullName(packagefullnamelength.rawAddress, packagefullname.rawAddress).toUInt()

public actual fun getCurrentPackageId(bufferlength: MutPtr<UInt>, buffer: MutPtr<UByte>): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssysWindowsWin32StoragePackagingAppxGetCurrentPackageId(bufferlength.rawAddress, buffer.rawAddress).toUInt()

public actual fun getCurrentPackageInfo(flags: UInt, bufferlength: MutPtr<UInt>, buffer: MutPtr<UByte>, count: MutPtr<UInt>): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssysWindowsWin32StoragePackagingAppxGetCurrentPackageInfo(flags.toInt(), bufferlength.rawAddress, buffer.rawAddress, count.rawAddress).toUInt()

public actual fun getCurrentPackageInfo2(flags: UInt, packagepathtype: PackagePathType, bufferlength: MutPtr<UInt>, buffer: MutPtr<UByte>, count: MutPtr<UInt>): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssysWindowsWin32StoragePackagingAppxGetCurrentPackageInfo2(flags.toInt(), packagepathtype, bufferlength.rawAddress, buffer.rawAddress, count.rawAddress).toUInt()

public actual fun getCurrentPackageInfo3(flags: UInt, packageinfotype: PackageInfo3Type, bufferlength: MutPtr<UInt>, buffer: MutPtr<CVoid>, count: MutPtr<UInt>): Hresult =
    WindowsWin32StoragePackagingAppxJniBridge.windowssysWindowsWin32StoragePackagingAppxGetCurrentPackageInfo3(flags.toInt(), packageinfotype, bufferlength.rawAddress, buffer.rawAddress, count.rawAddress)

public actual fun getCurrentPackagePath(pathlength: MutPtr<UInt>, path: Pwstr): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssysWindowsWin32StoragePackagingAppxGetCurrentPackagePath(pathlength.rawAddress, path.rawAddress).toUInt()

public actual fun getCurrentPackagePath2(packagepathtype: PackagePathType, pathlength: MutPtr<UInt>, path: Pwstr): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssysWindowsWin32StoragePackagingAppxGetCurrentPackagePath2(packagepathtype, pathlength.rawAddress, path.rawAddress).toUInt()

public actual fun getCurrentPackageVirtualizationContext(): PackageVirtualizationContextHandle =
    MutPtr(WindowsWin32StoragePackagingAppxJniBridge.windowssysWindowsWin32StoragePackagingAppxGetCurrentPackageVirtualizationContext())

public actual fun getIdForPackageDependencyContext(packagedependencycontext: PackagedependencyContext, packagedependencyid: MutPtr<Pwstr>): Hresult =
    WindowsWin32StoragePackagingAppxJniBridge.windowssysWindowsWin32StoragePackagingAppxGetIdForPackageDependencyContext(packagedependencycontext.rawAddress, packagedependencyid.rawAddress)

public actual fun getPackageApplicationIds(packageinforeference: ConstPtr<PackageInfoReference>, bufferlength: MutPtr<UInt>, buffer: MutPtr<UByte>, count: MutPtr<UInt>): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssysWindowsWin32StoragePackagingAppxGetPackageApplicationIds(packageinforeference.rawAddress, bufferlength.rawAddress, buffer.rawAddress, count.rawAddress).toUInt()

public actual fun getPackageFamilyName(hprocess: Handle, packagefamilynamelength: MutPtr<UInt>, packagefamilyname: Pwstr): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssysWindowsWin32StoragePackagingAppxGetPackageFamilyName(hprocess.rawAddress, packagefamilynamelength.rawAddress, packagefamilyname.rawAddress).toUInt()

public actual fun getPackageFamilyNameFromToken(token: Handle, packagefamilynamelength: MutPtr<UInt>, packagefamilyname: Pwstr): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssysWindowsWin32StoragePackagingAppxGetPackageFamilyNameFromToken(token.rawAddress, packagefamilynamelength.rawAddress, packagefamilyname.rawAddress).toUInt()

public actual fun getPackageFullName(hprocess: Handle, packagefullnamelength: MutPtr<UInt>, packagefullname: Pwstr): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssysWindowsWin32StoragePackagingAppxGetPackageFullName(hprocess.rawAddress, packagefullnamelength.rawAddress, packagefullname.rawAddress).toUInt()

public actual fun getPackageFullNameFromToken(token: Handle, packagefullnamelength: MutPtr<UInt>, packagefullname: Pwstr): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssysWindowsWin32StoragePackagingAppxGetPackageFullNameFromToken(token.rawAddress, packagefullnamelength.rawAddress, packagefullname.rawAddress).toUInt()

public actual fun getPackageGraphRevisionId(): UInt =
    WindowsWin32StoragePackagingAppxJniBridge.windowssysWindowsWin32StoragePackagingAppxGetPackageGraphRevisionId().toUInt()

public actual fun getPackageId(hprocess: Handle, bufferlength: MutPtr<UInt>, buffer: MutPtr<UByte>): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssysWindowsWin32StoragePackagingAppxGetPackageId(hprocess.rawAddress, bufferlength.rawAddress, buffer.rawAddress).toUInt()

public actual fun getPackageInfo(packageinforeference: ConstPtr<PackageInfoReference>, flags: UInt, bufferlength: MutPtr<UInt>, buffer: MutPtr<UByte>, count: MutPtr<UInt>): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssysWindowsWin32StoragePackagingAppxGetPackageInfo(packageinforeference.rawAddress, flags.toInt(), bufferlength.rawAddress, buffer.rawAddress, count.rawAddress).toUInt()

public actual fun getPackageInfo2(packageinforeference: ConstPtr<PackageInfoReference>, flags: UInt, packagepathtype: PackagePathType, bufferlength: MutPtr<UInt>, buffer: MutPtr<UByte>, count: MutPtr<UInt>): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssysWindowsWin32StoragePackagingAppxGetPackageInfo2(packageinforeference.rawAddress, flags.toInt(), packagepathtype, bufferlength.rawAddress, buffer.rawAddress, count.rawAddress).toUInt()

public actual fun getPackagePath(packageid: ConstPtr<PackageId>, reserved: UInt, pathlength: MutPtr<UInt>, path: Pwstr): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssysWindowsWin32StoragePackagingAppxGetPackagePath(packageid.rawAddress, reserved.toInt(), pathlength.rawAddress, path.rawAddress).toUInt()

public actual fun getPackagePathByFullName(packagefullname: Pcwstr, pathlength: MutPtr<UInt>, path: Pwstr): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssysWindowsWin32StoragePackagingAppxGetPackagePathByFullName(packagefullname.rawAddress, pathlength.rawAddress, path.rawAddress).toUInt()

public actual fun getPackagePathByFullName2(packagefullname: Pcwstr, packagepathtype: PackagePathType, pathlength: MutPtr<UInt>, path: Pwstr): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssysWindowsWin32StoragePackagingAppxGetPackagePathByFullName2(packagefullname.rawAddress, packagepathtype, pathlength.rawAddress, path.rawAddress).toUInt()

public actual fun getPackagesByPackageFamily(packagefamilyname: Pcwstr, count: MutPtr<UInt>, packagefullnames: MutPtr<Pwstr>, bufferlength: MutPtr<UInt>, buffer: Pwstr): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssysWindowsWin32StoragePackagingAppxGetPackagesByPackageFamily(packagefamilyname.rawAddress, count.rawAddress, packagefullnames.rawAddress, bufferlength.rawAddress, buffer.rawAddress).toUInt()

public actual fun getProcessesInVirtualizationContext(packagefamilyname: Pcwstr, count: MutPtr<UInt>, processes: MutPtr<MutPtr<Handle>>): Hresult =
    WindowsWin32StoragePackagingAppxJniBridge.windowssysWindowsWin32StoragePackagingAppxGetProcessesInVirtualizationContext(packagefamilyname.rawAddress, count.rawAddress, processes.rawAddress)

public actual fun getResolvedPackageFullNameForPackageDependency(packagedependencyid: Pcwstr, packagefullname: MutPtr<Pwstr>): Hresult =
    WindowsWin32StoragePackagingAppxJniBridge.windowssysWindowsWin32StoragePackagingAppxGetResolvedPackageFullNameForPackageDependency(packagedependencyid.rawAddress, packagefullname.rawAddress)

public actual fun getStagedPackageOrigin(packagefullname: Pcwstr, origin: MutPtr<PackageOrigin>): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssysWindowsWin32StoragePackagingAppxGetStagedPackageOrigin(packagefullname.rawAddress, origin.rawAddress).toUInt()

public actual fun getStagedPackagePathByFullName(packagefullname: Pcwstr, pathlength: MutPtr<UInt>, path: Pwstr): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssysWindowsWin32StoragePackagingAppxGetStagedPackagePathByFullName(packagefullname.rawAddress, pathlength.rawAddress, path.rawAddress).toUInt()

public actual fun getStagedPackagePathByFullName2(packagefullname: Pcwstr, packagepathtype: PackagePathType, pathlength: MutPtr<UInt>, path: Pwstr): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssysWindowsWin32StoragePackagingAppxGetStagedPackagePathByFullName2(packagefullname.rawAddress, packagepathtype, pathlength.rawAddress, path.rawAddress).toUInt()

public actual fun openPackageInfoByFullName(packagefullname: Pcwstr, reserved: UInt, packageinforeference: MutPtr<MutPtr<PackageInfoReference>>): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssysWindowsWin32StoragePackagingAppxOpenPackageInfoByFullName(packagefullname.rawAddress, reserved.toInt(), packageinforeference.rawAddress).toUInt()

public actual fun openPackageInfoByFullNameForUser(usersid: Psid, packagefullname: Pcwstr, reserved: UInt, packageinforeference: MutPtr<MutPtr<PackageInfoReference>>): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssysWindowsWin32StoragePackagingAppxOpenPackageInfoByFullNameForUser(usersid.rawAddress, packagefullname.rawAddress, reserved.toInt(), packageinforeference.rawAddress).toUInt()

public actual fun packageFamilyNameFromFullName(packagefullname: Pcwstr, packagefamilynamelength: MutPtr<UInt>, packagefamilyname: Pwstr): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssysWindowsWin32StoragePackagingAppxPackageFamilyNameFromFullName(packagefullname.rawAddress, packagefamilynamelength.rawAddress, packagefamilyname.rawAddress).toUInt()

public actual fun packageFamilyNameFromId(packageid: ConstPtr<PackageId>, packagefamilynamelength: MutPtr<UInt>, packagefamilyname: Pwstr): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssysWindowsWin32StoragePackagingAppxPackageFamilyNameFromId(packageid.rawAddress, packagefamilynamelength.rawAddress, packagefamilyname.rawAddress).toUInt()

public actual fun packageFullNameFromId(packageid: ConstPtr<PackageId>, packagefullnamelength: MutPtr<UInt>, packagefullname: Pwstr): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssysWindowsWin32StoragePackagingAppxPackageFullNameFromId(packageid.rawAddress, packagefullnamelength.rawAddress, packagefullname.rawAddress).toUInt()

public actual fun packageIdFromFullName(packagefullname: Pcwstr, flags: UInt, bufferlength: MutPtr<UInt>, buffer: MutPtr<UByte>): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssysWindowsWin32StoragePackagingAppxPackageIdFromFullName(packagefullname.rawAddress, flags.toInt(), bufferlength.rawAddress, buffer.rawAddress).toUInt()

public actual fun packageNameAndPublisherIdFromFamilyName(packagefamilyname: Pcwstr, packagenamelength: MutPtr<UInt>, packagename: Pwstr, packagepublisheridlength: MutPtr<UInt>, packagepublisherid: Pwstr): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssysWindowsWin32StoragePackagingAppxPackageNameAndPublisherIdFromFamilyName(packagefamilyname.rawAddress, packagenamelength.rawAddress, packagename.rawAddress, packagepublisheridlength.rawAddress, packagepublisherid.rawAddress).toUInt()

public actual fun parseApplicationUserModelId(applicationusermodelid: Pcwstr, packagefamilynamelength: MutPtr<UInt>, packagefamilyname: Pwstr, packagerelativeapplicationidlength: MutPtr<UInt>, packagerelativeapplicationid: Pwstr): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssysWindowsWin32StoragePackagingAppxParseApplicationUserModelId(applicationusermodelid.rawAddress, packagefamilynamelength.rawAddress, packagefamilyname.rawAddress, packagerelativeapplicationidlength.rawAddress, packagerelativeapplicationid.rawAddress).toUInt()

public actual fun releasePackageVirtualizationContext(context: PackageVirtualizationContextHandle) {
    WindowsWin32StoragePackagingAppxJniBridge.windowssysWindowsWin32StoragePackagingAppxReleasePackageVirtualizationContext(context.rawAddress)
}

public actual fun removePackageDependency(packagedependencycontext: PackagedependencyContext): Hresult =
    WindowsWin32StoragePackagingAppxJniBridge.windowssysWindowsWin32StoragePackagingAppxRemovePackageDependency(packagedependencycontext.rawAddress)

public actual fun tryCreatePackageDependency(user: Psid, packagefamilyname: Pcwstr, minversion: PackageVersion, packagedependencyprocessorarchitectures: PackageDependencyProcessorArchitectures, lifetimekind: PackageDependencyLifetimeKind, lifetimeartifact: Pcwstr, options: CreatePackageDependencyOptions, packagedependencyid: MutPtr<Pwstr>): Hresult =
    0

public actual fun verifyApplicationUserModelId(applicationusermodelid: Pcwstr): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssysWindowsWin32StoragePackagingAppxVerifyApplicationUserModelId(applicationusermodelid.rawAddress).toUInt()

public actual fun verifyPackageFamilyName(packagefamilyname: Pcwstr): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssysWindowsWin32StoragePackagingAppxVerifyPackageFamilyName(packagefamilyname.rawAddress).toUInt()

public actual fun verifyPackageFullName(packagefullname: Pcwstr): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssysWindowsWin32StoragePackagingAppxVerifyPackageFullName(packagefullname.rawAddress).toUInt()

public actual fun verifyPackageId(packageid: ConstPtr<PackageId>): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssysWindowsWin32StoragePackagingAppxVerifyPackageId(packageid.rawAddress).toUInt()

public actual fun verifyPackageRelativeApplicationId(packagerelativeapplicationid: Pcwstr): Win32Error =
    WindowsWin32StoragePackagingAppxJniBridge.windowssysWindowsWin32StoragePackagingAppxVerifyPackageRelativeApplicationId(packagerelativeapplicationid.rawAddress).toUInt()
