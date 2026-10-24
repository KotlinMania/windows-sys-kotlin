// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn ActivatePackageVirtualizationContext(context : PACKAGE_VIRTUALIZATION_CONTEXT_HANDLE, cookie : *mut usize) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("kernelbase.dll" "system" fn AddPackageDependency(packagedependencyid : windows_sys::core::PCWSTR, rank : i32, options : AddPackageDependencyOptions, packagedependencycontext : *mut PACKAGEDEPENDENCY_CONTEXT, packagefullname : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn AppPolicyGetClrCompat(processtoken : super::super::super::Foundation:: HANDLE, policy : *mut AppPolicyClrCompat) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn AppPolicyGetCreateFileAccess(processtoken : super::super::super::Foundation:: HANDLE, policy : *mut AppPolicyCreateFileAccess) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn AppPolicyGetLifecycleManagement(processtoken : super::super::super::Foundation:: HANDLE, policy : *mut AppPolicyLifecycleManagement) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn AppPolicyGetMediaFoundationCodecLoading(processtoken : super::super::super::Foundation:: HANDLE, policy : *mut AppPolicyMediaFoundationCodecLoading) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn AppPolicyGetProcessTerminationMethod(processtoken : super::super::super::Foundation:: HANDLE, policy : *mut AppPolicyProcessTerminationMethod) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn AppPolicyGetShowDeveloperDiagnostic(processtoken : super::super::super::Foundation:: HANDLE, policy : *mut AppPolicyShowDeveloperDiagnostic) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn AppPolicyGetThreadInitializationType(processtoken : super::super::super::Foundation:: HANDLE, policy : *mut AppPolicyThreadInitializationType) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn AppPolicyGetWindowingModel(processtoken : super::super::super::Foundation:: HANDLE, policy : *mut AppPolicyWindowingModel) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn CheckIsMSIXPackage(packagefullname : windows_sys::core::PCWSTR, ismsixpackage : *mut windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn ClosePackageInfo(packageinforeference : *const _PACKAGE_INFO_REFERENCE) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn CreatePackageVirtualizationContext(packagefamilyname : windows_sys::core::PCWSTR, context : *mut PACKAGE_VIRTUALIZATION_CONTEXT_HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn DeactivatePackageVirtualizationContext(cookie : usize));

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// windows_link::link!("kernelbase.dll" "system" fn DeletePackageDependency(packagedependencyid : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn DuplicatePackageVirtualizationContext(sourcecontext : PACKAGE_VIRTUALIZATION_CONTEXT_HANDLE, destcontext : *mut PACKAGE_VIRTUALIZATION_CONTEXT_HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn FindPackagesByPackageFamily(packagefamilyname : windows_sys::core::PCWSTR, packagefilters : u32, count : *mut u32, packagefullnames : *mut windows_sys::core::PWSTR, bufferlength : *mut u32, buffer : windows_sys::core::PWSTR, packageproperties : *mut u32) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn FormatApplicationUserModelId(packagefamilyname : windows_sys::core::PCWSTR, packagerelativeapplicationid : windows_sys::core::PCWSTR, applicationusermodelidlength : *mut u32, applicationusermodelid : windows_sys::core::PWSTR) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetApplicationUserModelId(hprocess : super::super::super::Foundation:: HANDLE, applicationusermodelidlength : *mut u32, applicationusermodelid : windows_sys::core::PWSTR) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-appmodel-runtime-l1-1-1.dll" "system" fn GetApplicationUserModelIdFromToken(token : super::super::super::Foundation:: HANDLE, applicationusermodelidlength : *mut u32, applicationusermodelid : windows_sys::core::PWSTR) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetCurrentApplicationUserModelId(applicationusermodelidlength : *mut u32, applicationusermodelid : windows_sys::core::PWSTR) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetCurrentPackageFamilyName(packagefamilynamelength : *mut u32, packagefamilyname : windows_sys::core::PWSTR) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetCurrentPackageFullName(packagefullnamelength : *mut u32, packagefullname : windows_sys::core::PWSTR) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetCurrentPackageId(bufferlength : *mut u32, buffer : *mut u8) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetCurrentPackageInfo(flags : u32, bufferlength : *mut u32, buffer : *mut u8, count : *mut u32) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-appmodel-runtime-l1-1-3.dll" "system" fn GetCurrentPackageInfo2(flags : u32, packagepathtype : PackagePathType, bufferlength : *mut u32, buffer : *mut u8, count : *mut u32) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetCurrentPackageInfo3(flags : u32, packageinfotype : PackageInfo3Type, bufferlength : *mut u32, buffer : *mut core::ffi::c_void, count : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetCurrentPackagePath(pathlength : *mut u32, path : windows_sys::core::PWSTR) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 29:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-appmodel-runtime-l1-1-3.dll" "system" fn GetCurrentPackagePath2(packagepathtype : PackagePathType, pathlength : *mut u32, path : windows_sys::core::PWSTR) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 30:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetCurrentPackageVirtualizationContext() -> PACKAGE_VIRTUALIZATION_CONTEXT_HANDLE);

// UNSUPPORTED Rust 31:1: declaration Macro has no candidate rule
// windows_link::link!("kernelbase.dll" "system" fn GetIdForPackageDependencyContext(packagedependencycontext : PACKAGEDEPENDENCY_CONTEXT, packagedependencyid : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 32:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetPackageApplicationIds(packageinforeference : *const _PACKAGE_INFO_REFERENCE, bufferlength : *mut u32, buffer : *mut u8, count : *mut u32) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 33:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetPackageFamilyName(hprocess : super::super::super::Foundation:: HANDLE, packagefamilynamelength : *mut u32, packagefamilyname : windows_sys::core::PWSTR) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 34:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-appmodel-runtime-l1-1-1.dll" "system" fn GetPackageFamilyNameFromToken(token : super::super::super::Foundation:: HANDLE, packagefamilynamelength : *mut u32, packagefamilyname : windows_sys::core::PWSTR) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 35:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetPackageFullName(hprocess : super::super::super::Foundation:: HANDLE, packagefullnamelength : *mut u32, packagefullname : windows_sys::core::PWSTR) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 36:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-appmodel-runtime-l1-1-1.dll" "system" fn GetPackageFullNameFromToken(token : super::super::super::Foundation:: HANDLE, packagefullnamelength : *mut u32, packagefullname : windows_sys::core::PWSTR) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 37:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-appmodel-runtime-l1-1-6.dll" "system" fn GetPackageGraphRevisionId() -> u32);

// UNSUPPORTED Rust 38:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetPackageId(hprocess : super::super::super::Foundation:: HANDLE, bufferlength : *mut u32, buffer : *mut u8) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 39:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetPackageInfo(packageinforeference : *const _PACKAGE_INFO_REFERENCE, flags : u32, bufferlength : *mut u32, buffer : *mut u8, count : *mut u32) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 40:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-appmodel-runtime-l1-1-3.dll" "system" fn GetPackageInfo2(packageinforeference : *const _PACKAGE_INFO_REFERENCE, flags : u32, packagepathtype : PackagePathType, bufferlength : *mut u32, buffer : *mut u8, count : *mut u32) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 41:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetPackagePath(packageid : *const PACKAGE_ID, reserved : u32, pathlength : *mut u32, path : windows_sys::core::PWSTR) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 42:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetPackagePathByFullName(packagefullname : windows_sys::core::PCWSTR, pathlength : *mut u32, path : windows_sys::core::PWSTR) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 43:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-appmodel-runtime-l1-1-3.dll" "system" fn GetPackagePathByFullName2(packagefullname : windows_sys::core::PCWSTR, packagepathtype : PackagePathType, pathlength : *mut u32, path : windows_sys::core::PWSTR) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 44:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetPackagesByPackageFamily(packagefamilyname : windows_sys::core::PCWSTR, count : *mut u32, packagefullnames : *mut windows_sys::core::PWSTR, bufferlength : *mut u32, buffer : windows_sys::core::PWSTR) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 45:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetProcessesInVirtualizationContext(packagefamilyname : windows_sys::core::PCWSTR, count : *mut u32, processes : *mut *mut super::super::super::Foundation:: HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 46:1: declaration Macro has no candidate rule
// windows_link::link!("kernelbase.dll" "system" fn GetResolvedPackageFullNameForPackageDependency(packagedependencyid : windows_sys::core::PCWSTR, packagefullname : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 47:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-appmodel-runtime-l1-1-1.dll" "system" fn GetStagedPackageOrigin(packagefullname : windows_sys::core::PCWSTR, origin : *mut PackageOrigin) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 48:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetStagedPackagePathByFullName(packagefullname : windows_sys::core::PCWSTR, pathlength : *mut u32, path : windows_sys::core::PWSTR) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 49:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-appmodel-runtime-l1-1-3.dll" "system" fn GetStagedPackagePathByFullName2(packagefullname : windows_sys::core::PCWSTR, packagepathtype : PackagePathType, pathlength : *mut u32, path : windows_sys::core::PWSTR) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 50:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn OpenPackageInfoByFullName(packagefullname : windows_sys::core::PCWSTR, reserved : u32, packageinforeference : *mut *mut _PACKAGE_INFO_REFERENCE) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 51:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("api-ms-win-appmodel-runtime-l1-1-1.dll" "system" fn OpenPackageInfoByFullNameForUser(usersid : super::super::super::Security:: PSID, packagefullname : windows_sys::core::PCWSTR, reserved : u32, packageinforeference : *mut *mut _PACKAGE_INFO_REFERENCE) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 53:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn PackageFamilyNameFromFullName(packagefullname : windows_sys::core::PCWSTR, packagefamilynamelength : *mut u32, packagefamilyname : windows_sys::core::PWSTR) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 54:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn PackageFamilyNameFromId(packageid : *const PACKAGE_ID, packagefamilynamelength : *mut u32, packagefamilyname : windows_sys::core::PWSTR) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 55:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn PackageFullNameFromId(packageid : *const PACKAGE_ID, packagefullnamelength : *mut u32, packagefullname : windows_sys::core::PWSTR) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 56:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn PackageIdFromFullName(packagefullname : windows_sys::core::PCWSTR, flags : u32, bufferlength : *mut u32, buffer : *mut u8) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 57:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn PackageNameAndPublisherIdFromFamilyName(packagefamilyname : windows_sys::core::PCWSTR, packagenamelength : *mut u32, packagename : windows_sys::core::PWSTR, packagepublisheridlength : *mut u32, packagepublisherid : windows_sys::core::PWSTR) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 58:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn ParseApplicationUserModelId(applicationusermodelid : windows_sys::core::PCWSTR, packagefamilynamelength : *mut u32, packagefamilyname : windows_sys::core::PWSTR, packagerelativeapplicationidlength : *mut u32, packagerelativeapplicationid : windows_sys::core::PWSTR) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 59:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn ReleasePackageVirtualizationContext(context : PACKAGE_VIRTUALIZATION_CONTEXT_HANDLE));

// UNSUPPORTED Rust 60:1: declaration Macro has no candidate rule
// windows_link::link!("kernelbase.dll" "system" fn RemovePackageDependency(packagedependencycontext : PACKAGEDEPENDENCY_CONTEXT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 61:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("kernelbase.dll" "system" fn TryCreatePackageDependency(user : super::super::super::Security:: PSID, packagefamilyname : windows_sys::core::PCWSTR, minversion : PACKAGE_VERSION, packagedependencyprocessorarchitectures : PackageDependencyProcessorArchitectures, lifetimekind : PackageDependencyLifetimeKind, lifetimeartifact : windows_sys::core::PCWSTR, options : CreatePackageDependencyOptions, packagedependencyid : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 63:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-appmodel-runtime-l1-1-1.dll" "system" fn VerifyApplicationUserModelId(applicationusermodelid : windows_sys::core::PCWSTR) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 64:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-appmodel-runtime-l1-1-1.dll" "system" fn VerifyPackageFamilyName(packagefamilyname : windows_sys::core::PCWSTR) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 65:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-appmodel-runtime-l1-1-1.dll" "system" fn VerifyPackageFullName(packagefullname : windows_sys::core::PCWSTR) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 66:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-appmodel-runtime-l1-1-1.dll" "system" fn VerifyPackageId(packageid : *const PACKAGE_ID) -> super::super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 67:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-appmodel-runtime-l1-1-1.dll" "system" fn VerifyPackageRelativeApplicationId(packagerelativeapplicationid : windows_sys::core::PCWSTR) -> super::super::super::Foundation:: WIN32_ERROR);

public const val `APPLICATION_USER_MODEL_ID_MAX_LENGTH`: UInt = 130u;
public const val `APPLICATION_USER_MODEL_ID_MIN_LENGTH`: UInt = 20u;
public typealias `APPX_BUNDLE_FOOTPRINT_FILE_TYPE` = Int;
public const val `APPX_BUNDLE_FOOTPRINT_FILE_TYPE_BLOCKMAP`: `APPX_BUNDLE_FOOTPRINT_FILE_TYPE` = 1;
public const val `APPX_BUNDLE_FOOTPRINT_FILE_TYPE_FIRST`: `APPX_BUNDLE_FOOTPRINT_FILE_TYPE` = 0;
public const val `APPX_BUNDLE_FOOTPRINT_FILE_TYPE_LAST`: `APPX_BUNDLE_FOOTPRINT_FILE_TYPE` = 2;
public const val `APPX_BUNDLE_FOOTPRINT_FILE_TYPE_MANIFEST`: `APPX_BUNDLE_FOOTPRINT_FILE_TYPE` = 0;
public const val `APPX_BUNDLE_FOOTPRINT_FILE_TYPE_SIGNATURE`: `APPX_BUNDLE_FOOTPRINT_FILE_TYPE` = 2;
public typealias `APPX_BUNDLE_PAYLOAD_PACKAGE_TYPE` = Int;
public const val `APPX_BUNDLE_PAYLOAD_PACKAGE_TYPE_APPLICATION`: `APPX_BUNDLE_PAYLOAD_PACKAGE_TYPE` = 0;
public const val `APPX_BUNDLE_PAYLOAD_PACKAGE_TYPE_RESOURCE`: `APPX_BUNDLE_PAYLOAD_PACKAGE_TYPE` = 1;
public typealias `APPX_CAPABILITIES` = Int;
public const val `APPX_CAPABILITY_APPOINTMENTS`: `APPX_CAPABILITIES` = 1024;
public const val `APPX_CAPABILITY_CLASS_ALL`: `APPX_CAPABILITY_CLASS_TYPE` = 7;
public const val `APPX_CAPABILITY_CLASS_CUSTOM`: `APPX_CAPABILITY_CLASS_TYPE` = 8;
public const val `APPX_CAPABILITY_CLASS_DEFAULT`: `APPX_CAPABILITY_CLASS_TYPE` = 0;
public const val `APPX_CAPABILITY_CLASS_GENERAL`: `APPX_CAPABILITY_CLASS_TYPE` = 1;
public const val `APPX_CAPABILITY_CLASS_RESTRICTED`: `APPX_CAPABILITY_CLASS_TYPE` = 2;
public typealias `APPX_CAPABILITY_CLASS_TYPE` = Int;
public const val `APPX_CAPABILITY_CLASS_WINDOWS`: `APPX_CAPABILITY_CLASS_TYPE` = 4;
public const val `APPX_CAPABILITY_CONTACTS`: `APPX_CAPABILITIES` = 2048;
public const val `APPX_CAPABILITY_DOCUMENTS_LIBRARY`: `APPX_CAPABILITIES` = 8;
public const val `APPX_CAPABILITY_ENTERPRISE_AUTHENTICATION`: `APPX_CAPABILITIES` = 128;
public const val `APPX_CAPABILITY_INTERNET_CLIENT`: `APPX_CAPABILITIES` = 1;
public const val `APPX_CAPABILITY_INTERNET_CLIENT_SERVER`: `APPX_CAPABILITIES` = 2;
public const val `APPX_CAPABILITY_MUSIC_LIBRARY`: `APPX_CAPABILITIES` = 64;
public const val `APPX_CAPABILITY_PICTURES_LIBRARY`: `APPX_CAPABILITIES` = 16;
public const val `APPX_CAPABILITY_PRIVATE_NETWORK_CLIENT_SERVER`: `APPX_CAPABILITIES` = 4;
public const val `APPX_CAPABILITY_REMOVABLE_STORAGE`: `APPX_CAPABILITIES` = 512;
public const val `APPX_CAPABILITY_SHARED_USER_CERTIFICATES`: `APPX_CAPABILITIES` = 256;
public const val `APPX_CAPABILITY_VIDEOS_LIBRARY`: `APPX_CAPABILITIES` = 32;
public typealias `APPX_COMPRESSION_OPTION` = Int;
public const val `APPX_COMPRESSION_OPTION_FAST`: `APPX_COMPRESSION_OPTION` = 3;
public const val `APPX_COMPRESSION_OPTION_MAXIMUM`: `APPX_COMPRESSION_OPTION` = 2;
public const val `APPX_COMPRESSION_OPTION_NONE`: `APPX_COMPRESSION_OPTION` = 0;
public const val `APPX_COMPRESSION_OPTION_NORMAL`: `APPX_COMPRESSION_OPTION` = 1;
public const val `APPX_COMPRESSION_OPTION_SUPERFAST`: `APPX_COMPRESSION_OPTION` = 4;
// UNSUPPORTED Rust 105:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct APPX_ENCRYPTED_EXEMPTIONS {
//     pub count: u32,
//     pub plainTextFiles: *const windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 111:1: declaration Impl has no candidate rule
// impl Default for APPX_ENCRYPTED_EXEMPTIONS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `APPX_ENCRYPTED_PACKAGE_OPTIONS` = Int;
public const val `APPX_ENCRYPTED_PACKAGE_OPTION_DIFFUSION`: `APPX_ENCRYPTED_PACKAGE_OPTIONS` = 1;
public const val `APPX_ENCRYPTED_PACKAGE_OPTION_NONE`: `APPX_ENCRYPTED_PACKAGE_OPTIONS` = 0;
public const val `APPX_ENCRYPTED_PACKAGE_OPTION_PAGE_HASHING`: `APPX_ENCRYPTED_PACKAGE_OPTIONS` = 2;
// UNSUPPORTED Rust 120:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct APPX_ENCRYPTED_PACKAGE_SETTINGS {
//     pub keyLength: u32,
//     pub encryptionAlgorithm: windows_sys::core::PCWSTR,
//     pub useDiffusion: windows_sys::core::BOOL,
//     pub blockMapHashAlgorithm: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 129:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for APPX_ENCRYPTED_PACKAGE_SETTINGS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 135:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct APPX_ENCRYPTED_PACKAGE_SETTINGS2 {
//     pub keyLength: u32,
//     pub encryptionAlgorithm: windows_sys::core::PCWSTR,
//     pub blockMapHashAlgorithm: *mut core::ffi::c_void,
//     pub options: u32,
// }

// UNSUPPORTED Rust 144:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for APPX_ENCRYPTED_PACKAGE_SETTINGS2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `APPX_FOOTPRINT_FILE_TYPE` = Int;
public const val `APPX_FOOTPRINT_FILE_TYPE_BLOCKMAP`: `APPX_FOOTPRINT_FILE_TYPE` = 1;
public const val `APPX_FOOTPRINT_FILE_TYPE_CODEINTEGRITY`: `APPX_FOOTPRINT_FILE_TYPE` = 3;
public const val `APPX_FOOTPRINT_FILE_TYPE_CONTENTGROUPMAP`: `APPX_FOOTPRINT_FILE_TYPE` = 4;
public const val `APPX_FOOTPRINT_FILE_TYPE_MANIFEST`: `APPX_FOOTPRINT_FILE_TYPE` = 0;
public const val `APPX_FOOTPRINT_FILE_TYPE_SIGNATURE`: `APPX_FOOTPRINT_FILE_TYPE` = 2;
// UNSUPPORTED Rust 156:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct APPX_KEY_INFO {
//     pub keyLength: u32,
//     pub keyIdLength: u32,
//     pub key: *mut u8,
//     pub keyId: *mut u8,
// }

// UNSUPPORTED Rust 164:1: declaration Impl has no candidate rule
// impl Default for APPX_KEY_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `APPX_PACKAGE_ARCHITECTURE` = Int;
public typealias `APPX_PACKAGE_ARCHITECTURE2` = Int;
public const val `APPX_PACKAGE_ARCHITECTURE2_ARM`: `APPX_PACKAGE_ARCHITECTURE2` = 5;
public const val `APPX_PACKAGE_ARCHITECTURE2_ARM64`: `APPX_PACKAGE_ARCHITECTURE2` = 12;
public const val `APPX_PACKAGE_ARCHITECTURE2_NEUTRAL`: `APPX_PACKAGE_ARCHITECTURE2` = 11;
public const val `APPX_PACKAGE_ARCHITECTURE2_UNKNOWN`: `APPX_PACKAGE_ARCHITECTURE2` = 65535;
public const val `APPX_PACKAGE_ARCHITECTURE2_X64`: `APPX_PACKAGE_ARCHITECTURE2` = 9;
public const val `APPX_PACKAGE_ARCHITECTURE2_X86`: `APPX_PACKAGE_ARCHITECTURE2` = 0;
public const val `APPX_PACKAGE_ARCHITECTURE2_X86_ON_ARM64`: `APPX_PACKAGE_ARCHITECTURE2` = 14;
public const val `APPX_PACKAGE_ARCHITECTURE_ARM`: `APPX_PACKAGE_ARCHITECTURE` = 5;
public const val `APPX_PACKAGE_ARCHITECTURE_ARM64`: `APPX_PACKAGE_ARCHITECTURE` = 12;
public const val `APPX_PACKAGE_ARCHITECTURE_NEUTRAL`: `APPX_PACKAGE_ARCHITECTURE` = 11;
public const val `APPX_PACKAGE_ARCHITECTURE_X64`: `APPX_PACKAGE_ARCHITECTURE` = 9;
public const val `APPX_PACKAGE_ARCHITECTURE_X86`: `APPX_PACKAGE_ARCHITECTURE` = 0;
public typealias `APPX_PACKAGE_EDITOR_UPDATE_PACKAGE_MANIFEST_OPTIONS` = Int;
public const val `APPX_PACKAGE_EDITOR_UPDATE_PACKAGE_MANIFEST_OPTION_LOCALIZED`: `APPX_PACKAGE_EDITOR_UPDATE_PACKAGE_MANIFEST_OPTIONS` = 2;
public const val `APPX_PACKAGE_EDITOR_UPDATE_PACKAGE_MANIFEST_OPTION_NONE`: `APPX_PACKAGE_EDITOR_UPDATE_PACKAGE_MANIFEST_OPTIONS` = 0;
public const val `APPX_PACKAGE_EDITOR_UPDATE_PACKAGE_MANIFEST_OPTION_SKIP_VALIDATION`: `APPX_PACKAGE_EDITOR_UPDATE_PACKAGE_MANIFEST_OPTIONS` = 1;
public typealias `APPX_PACKAGE_EDITOR_UPDATE_PACKAGE_OPTION` = Int;
public const val `APPX_PACKAGE_EDITOR_UPDATE_PACKAGE_OPTION_APPEND_DELTA`: `APPX_PACKAGE_EDITOR_UPDATE_PACKAGE_OPTION` = 0;
// UNSUPPORTED Rust 189:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct APPX_PACKAGE_SETTINGS {
//     pub forceZip32: windows_sys::core::BOOL,
//     pub hashMethod: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 196:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for APPX_PACKAGE_SETTINGS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 202:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct APPX_PACKAGE_WRITER_PAYLOAD_STREAM {
//     pub inputStream: *mut core::ffi::c_void,
//     pub fileName: windows_sys::core::PCWSTR,
//     pub contentType: windows_sys::core::PCWSTR,
//     pub compressionOption: APPX_COMPRESSION_OPTION,
// }

// UNSUPPORTED Rust 211:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for APPX_PACKAGE_WRITER_PAYLOAD_STREAM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `APPX_PACKAGING_CONTEXT_CHANGE_TYPE` = Int;
public const val `APPX_PACKAGING_CONTEXT_CHANGE_TYPE_CHANGE`: `APPX_PACKAGING_CONTEXT_CHANGE_TYPE` = 1;
public const val `APPX_PACKAGING_CONTEXT_CHANGE_TYPE_DETAILS`: `APPX_PACKAGING_CONTEXT_CHANGE_TYPE` = 2;
public const val `APPX_PACKAGING_CONTEXT_CHANGE_TYPE_END`: `APPX_PACKAGING_CONTEXT_CHANGE_TYPE` = 3;
public const val `APPX_PACKAGING_CONTEXT_CHANGE_TYPE_START`: `APPX_PACKAGING_CONTEXT_CHANGE_TYPE` = 0;
public typealias `AddPackageDependencyOptions` = Int;
public const val `AddPackageDependencyOptions_None`: `AddPackageDependencyOptions` = 0;
public const val `AddPackageDependencyOptions_PrependIfRankCollision`: `AddPackageDependencyOptions` = 1;
public typealias `AppPolicyClrCompat` = Int;
public const val `AppPolicyClrCompat_ClassicDesktop`: `AppPolicyClrCompat` = 1;
public const val `AppPolicyClrCompat_Other`: `AppPolicyClrCompat` = 0;
public const val `AppPolicyClrCompat_PackagedDesktop`: `AppPolicyClrCompat` = 3;
public const val `AppPolicyClrCompat_Universal`: `AppPolicyClrCompat` = 2;
public typealias `AppPolicyCreateFileAccess` = Int;
public const val `AppPolicyCreateFileAccess_Full`: `AppPolicyCreateFileAccess` = 0;
public const val `AppPolicyCreateFileAccess_Limited`: `AppPolicyCreateFileAccess` = 1;
public typealias `AppPolicyLifecycleManagement` = Int;
public const val `AppPolicyLifecycleManagement_Managed`: `AppPolicyLifecycleManagement` = 1;
public const val `AppPolicyLifecycleManagement_Unmanaged`: `AppPolicyLifecycleManagement` = 0;
public typealias `AppPolicyMediaFoundationCodecLoading` = Int;
public const val `AppPolicyMediaFoundationCodecLoading_All`: `AppPolicyMediaFoundationCodecLoading` = 0;
public const val `AppPolicyMediaFoundationCodecLoading_InboxOnly`: `AppPolicyMediaFoundationCodecLoading` = 1;
public typealias `AppPolicyProcessTerminationMethod` = Int;
public const val `AppPolicyProcessTerminationMethod_ExitProcess`: `AppPolicyProcessTerminationMethod` = 0;
public const val `AppPolicyProcessTerminationMethod_TerminateProcess`: `AppPolicyProcessTerminationMethod` = 1;
public typealias `AppPolicyShowDeveloperDiagnostic` = Int;
public const val `AppPolicyShowDeveloperDiagnostic_None`: `AppPolicyShowDeveloperDiagnostic` = 0;
public const val `AppPolicyShowDeveloperDiagnostic_ShowUI`: `AppPolicyShowDeveloperDiagnostic` = 1;
public typealias `AppPolicyThreadInitializationType` = Int;
public const val `AppPolicyThreadInitializationType_InitializeWinRT`: `AppPolicyThreadInitializationType` = 1;
public const val `AppPolicyThreadInitializationType_None`: `AppPolicyThreadInitializationType` = 0;
public typealias `AppPolicyWindowingModel` = Int;
public const val `AppPolicyWindowingModel_ClassicDesktop`: `AppPolicyWindowingModel` = 2;
public const val `AppPolicyWindowingModel_ClassicPhone`: `AppPolicyWindowingModel` = 3;
public const val `AppPolicyWindowingModel_None`: `AppPolicyWindowingModel` = 0;
public const val `AppPolicyWindowingModel_Universal`: `AppPolicyWindowingModel` = 1;
// UNSUPPORTED Rust 253:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const AppxBundleFactory: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x378e0446_5384_43b7_8877_e7dbdd883446);

// UNSUPPORTED Rust 254:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const AppxEncryptionFactory: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdc664fdd_d868_46ee_8780_8d196cb739f7);

// UNSUPPORTED Rust 255:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const AppxFactory: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5842a140_ff9f_4166_8f5c_62f5b7b0c781);

// UNSUPPORTED Rust 256:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const AppxPackageEditor: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf004f2ca_aebc_4b0d_bf58_e516d5bcc0ab);

// UNSUPPORTED Rust 257:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const AppxPackagingDiagnosticEventSinkManager: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x50ca0a46_1588_4161_8ed2_ef9e469ced5d);

public typealias `CreatePackageDependencyOptions` = Int;
public const val `CreatePackageDependencyOptions_DoNotVerifyDependencyResolution`: `CreatePackageDependencyOptions` = 1;
public const val `CreatePackageDependencyOptions_None`: `CreatePackageDependencyOptions` = 0;
public const val `CreatePackageDependencyOptions_ScopeIsSystem`: `CreatePackageDependencyOptions` = 2;
public typealias `DX_FEATURE_LEVEL` = Int;
public const val `DX_FEATURE_LEVEL_10`: `DX_FEATURE_LEVEL` = 2;
public const val `DX_FEATURE_LEVEL_11`: `DX_FEATURE_LEVEL` = 3;
public const val `DX_FEATURE_LEVEL_9`: `DX_FEATURE_LEVEL` = 1;
public const val `DX_FEATURE_LEVEL_UNSPECIFIED`: `DX_FEATURE_LEVEL` = 0;
// UNSUPPORTED Rust 267:1: non-scalar type Ptr unsupported
// pub type PACKAGEDEPENDENCY_CONTEXT = *mut core::ffi::c_void;

public const val `PACKAGE_APPLICATIONS_MAX_COUNT`: UInt = 100u;
public const val `PACKAGE_APPLICATIONS_MIN_COUNT`: UInt = 0u;
public const val `PACKAGE_ARCHITECTURE_MAX_LENGTH`: UInt = 7u;
public const val `PACKAGE_ARCHITECTURE_MIN_LENGTH`: UInt = 3u;
public const val `PACKAGE_DEPENDENCY_RANK_DEFAULT`: UInt = 0u;
public const val `PACKAGE_FAMILY_MAX_RESOURCE_PACKAGES`: UInt = 512u;
public const val `PACKAGE_FAMILY_MIN_RESOURCE_PACKAGES`: UInt = 0u;
public const val `PACKAGE_FAMILY_NAME_MAX_LENGTH`: UInt = 64u;
public const val `PACKAGE_FAMILY_NAME_MIN_LENGTH`: UInt = 17u;
public const val `PACKAGE_FILTER_ALL_LOADED`: UInt = 0u;
public const val `PACKAGE_FILTER_BUNDLE`: UInt = 128u;
public const val `PACKAGE_FILTER_DIRECT`: UInt = 32u;
public const val `PACKAGE_FILTER_DYNAMIC`: UInt = 1048576u;
public const val `PACKAGE_FILTER_HEAD`: UInt = 16u;
public const val `PACKAGE_FILTER_HOSTRUNTIME`: UInt = 2097152u;
public const val `PACKAGE_FILTER_IS_IN_RELATED_SET`: UInt = 262144u;
public const val `PACKAGE_FILTER_OPTIONAL`: UInt = 131072u;
public const val `PACKAGE_FILTER_RESOURCE`: UInt = 64u;
public const val `PACKAGE_FILTER_STATIC`: UInt = 524288u;
public const val `PACKAGE_FULL_NAME_MAX_LENGTH`: UInt = 127u;
public const val `PACKAGE_FULL_NAME_MIN_LENGTH`: UInt = 30u;
public const val `PACKAGE_GRAPH_MAX_SIZE`: UInt = 641u;
public const val `PACKAGE_GRAPH_MIN_SIZE`: UInt = 1u;
// UNSUPPORTED Rust 291:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct PACKAGE_ID {
//     pub reserved: u32,
//     pub processorArchitecture: u32,
//     pub version: PACKAGE_VERSION,
//     pub name: windows_sys::core::PWSTR,
//     pub publisher: windows_sys::core::PWSTR,
//     pub resourceId: windows_sys::core::PWSTR,
//     pub publisherId: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 303:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for PACKAGE_ID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 309:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct PACKAGE_ID {
//     pub reserved: u32,
//     pub processorArchitecture: u32,
//     pub version: PACKAGE_VERSION,
//     pub name: windows_sys::core::PWSTR,
//     pub publisher: windows_sys::core::PWSTR,
//     pub resourceId: windows_sys::core::PWSTR,
//     pub publisherId: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 321:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for PACKAGE_ID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 327:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct PACKAGE_INFO {
//     pub reserved: u32,
//     pub flags: u32,
//     pub path: windows_sys::core::PWSTR,
//     pub packageFullName: windows_sys::core::PWSTR,
//     pub packageFamilyName: windows_sys::core::PWSTR,
//     pub packageId: PACKAGE_ID,
// }

// UNSUPPORTED Rust 338:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for PACKAGE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 344:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct PACKAGE_INFO {
//     pub reserved: u32,
//     pub flags: u32,
//     pub path: windows_sys::core::PWSTR,
//     pub packageFullName: windows_sys::core::PWSTR,
//     pub packageFamilyName: windows_sys::core::PWSTR,
//     pub packageId: PACKAGE_ID,
// }

// UNSUPPORTED Rust 355:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for PACKAGE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PACKAGE_INFORMATION_BASIC`: UInt = 0u;
public const val `PACKAGE_INFORMATION_FULL`: UInt = 256u;
public const val `PACKAGE_MAX_DEPENDENCIES`: UInt = 128u;
public const val `PACKAGE_MIN_DEPENDENCIES`: UInt = 0u;
public const val `PACKAGE_NAME_MAX_LENGTH`: UInt = 50u;
public const val `PACKAGE_NAME_MIN_LENGTH`: UInt = 3u;
public const val `PACKAGE_PROPERTY_BUNDLE`: UInt = 4u;
public const val `PACKAGE_PROPERTY_DEVELOPMENT_MODE`: UInt = 65536u;
public const val `PACKAGE_PROPERTY_DYNAMIC`: UInt = 1048576u;
public const val `PACKAGE_PROPERTY_FRAMEWORK`: UInt = 1u;
public const val `PACKAGE_PROPERTY_HOSTRUNTIME`: UInt = 2097152u;
public const val `PACKAGE_PROPERTY_IS_IN_RELATED_SET`: UInt = 262144u;
public const val `PACKAGE_PROPERTY_OPTIONAL`: UInt = 8u;
public const val `PACKAGE_PROPERTY_RESOURCE`: UInt = 2u;
public const val `PACKAGE_PROPERTY_STATIC`: UInt = 524288u;
public const val `PACKAGE_PUBLISHERID_MAX_LENGTH`: UInt = 13u;
public const val `PACKAGE_PUBLISHERID_MIN_LENGTH`: UInt = 13u;
public const val `PACKAGE_PUBLISHER_MAX_LENGTH`: UInt = 8192u;
public const val `PACKAGE_PUBLISHER_MIN_LENGTH`: UInt = 3u;
public const val `PACKAGE_RELATIVE_APPLICATION_ID_MAX_LENGTH`: UInt = 65u;
public const val `PACKAGE_RELATIVE_APPLICATION_ID_MIN_LENGTH`: UInt = 2u;
public const val `PACKAGE_RESOURCEID_MAX_LENGTH`: UInt = 30u;
public const val `PACKAGE_RESOURCEID_MIN_LENGTH`: UInt = 0u;
// UNSUPPORTED Rust 384:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PACKAGE_VERSION {
//     pub Anonymous: PACKAGE_VERSION_0,
// }

// UNSUPPORTED Rust 389:1: declaration Impl has no candidate rule
// impl Default for PACKAGE_VERSION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 394:1: declaration Union has no candidate rule
// #[repr(C, packed(4))]
// #[derive(Clone, Copy)]
// pub union PACKAGE_VERSION_0 {
//     pub Version: u64,
//     pub Anonymous: PACKAGE_VERSION_0_0,
// }

// UNSUPPORTED Rust 400:1: declaration Impl has no candidate rule
// impl Default for PACKAGE_VERSION_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 405:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PACKAGE_VERSION_0_0 {
//     pub Revision: u16,
//     pub Build: u16,
//     pub Minor: u16,
//     pub Major: u16,
// }

public const val `PACKAGE_VERSION_MAX_LENGTH`: UInt = 23u;
public const val `PACKAGE_VERSION_MIN_LENGTH`: UInt = 7u;
// UNSUPPORTED Rust 415:1: non-scalar type Ptr unsupported
// pub type PACKAGE_VIRTUALIZATION_CONTEXT_HANDLE = *mut core::ffi::c_void;

public typealias `PackageDependencyLifetimeKind` = Int;
public const val `PackageDependencyLifetimeKind_FilePath`: `PackageDependencyLifetimeKind` = 1;
public const val `PackageDependencyLifetimeKind_Process`: `PackageDependencyLifetimeKind` = 0;
public const val `PackageDependencyLifetimeKind_RegistryKey`: `PackageDependencyLifetimeKind` = 2;
public typealias `PackageDependencyProcessorArchitectures` = Int;
public const val `PackageDependencyProcessorArchitectures_Arm`: `PackageDependencyProcessorArchitectures` = 8;
public const val `PackageDependencyProcessorArchitectures_Arm64`: `PackageDependencyProcessorArchitectures` = 16;
public const val `PackageDependencyProcessorArchitectures_Neutral`: `PackageDependencyProcessorArchitectures` = 1;
public const val `PackageDependencyProcessorArchitectures_None`: `PackageDependencyProcessorArchitectures` = 0;
public const val `PackageDependencyProcessorArchitectures_X64`: `PackageDependencyProcessorArchitectures` = 4;
public const val `PackageDependencyProcessorArchitectures_X86`: `PackageDependencyProcessorArchitectures` = 2;
public const val `PackageDependencyProcessorArchitectures_X86A64`: `PackageDependencyProcessorArchitectures` = 32;
public typealias `PackageInfo3Type` = Int;
public const val `PackageInfo3Type_PackageInfoGeneration`: `PackageInfo3Type` = 16;
public typealias `PackageOrigin` = Int;
public const val `PackageOrigin_DeveloperSigned`: `PackageOrigin` = 5;
public const val `PackageOrigin_DeveloperUnsigned`: `PackageOrigin` = 4;
public const val `PackageOrigin_Inbox`: `PackageOrigin` = 2;
public const val `PackageOrigin_LineOfBusiness`: `PackageOrigin` = 6;
public const val `PackageOrigin_Store`: `PackageOrigin` = 3;
public const val `PackageOrigin_Unknown`: `PackageOrigin` = 0;
public const val `PackageOrigin_Unsigned`: `PackageOrigin` = 1;
public typealias `PackagePathType` = Int;
public const val `PackagePathType_Effective`: `PackagePathType` = 2;
public const val `PackagePathType_EffectiveExternal`: `PackagePathType` = 5;
public const val `PackagePathType_Install`: `PackagePathType` = 0;
public const val `PackagePathType_MachineExternal`: `PackagePathType` = 3;
public const val `PackagePathType_Mutable`: `PackagePathType` = 1;
public const val `PackagePathType_UserExternal`: `PackagePathType` = 4;
// UNSUPPORTED Rust 445:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct _PACKAGE_INFO_REFERENCE {
//     pub reserved: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 450:1: declaration Impl has no candidate rule
// impl Default for _PACKAGE_INFO_REFERENCE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

