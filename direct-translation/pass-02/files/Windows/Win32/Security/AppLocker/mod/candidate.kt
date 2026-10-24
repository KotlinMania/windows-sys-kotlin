// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn SaferCloseLevel(hlevelhandle : super:: SAFER_LEVEL_HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn SaferComputeTokenFromLevel(levelhandle : super:: SAFER_LEVEL_HANDLE, inaccesstoken : super::super::Foundation:: HANDLE, outaccesstoken : *mut super::super::Foundation:: HANDLE, dwflags : SAFER_COMPUTE_TOKEN_FROM_LEVEL_FLAGS, lpreserved : *mut core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn SaferCreateLevel(dwscopeid : u32, dwlevelid : u32, openflags : u32, plevelhandle : *mut super:: SAFER_LEVEL_HANDLE, lpreserved : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn SaferGetLevelInformation(levelhandle : super:: SAFER_LEVEL_HANDLE, dwinfotype : SAFER_OBJECT_INFO_CLASS, lpquerybuffer : *mut core::ffi::c_void, dwinbuffersize : u32, lpdwoutbuffersize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn SaferGetPolicyInformation(dwscopeid : u32, saferpolicyinfoclass : SAFER_POLICY_INFO_CLASS, infobuffersize : u32, infobuffer : *mut core::ffi::c_void, infobufferretsize : *mut u32, lpreserved : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// windows_link::link!("advapi32.dll" "system" fn SaferIdentifyLevel(dwnumproperties : u32, pcodeproperties : *const SAFER_CODE_PROPERTIES_V2, plevelhandle : *mut super:: SAFER_LEVEL_HANDLE, lpreserved : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn SaferRecordEventLogEntry(hlevel : super:: SAFER_LEVEL_HANDLE, sztargetpath : windows_sys::core::PCWSTR, lpreserved : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn SaferSetLevelInformation(levelhandle : super:: SAFER_LEVEL_HANDLE, dwinfotype : SAFER_OBJECT_INFO_CLASS, lpquerybuffer : *const core::ffi::c_void, dwinbuffersize : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn SaferSetPolicyInformation(dwscopeid : u32, saferpolicyinfoclass : SAFER_POLICY_INFO_CLASS, infobuffersize : u32, infobuffer : *const core::ffi::c_void, lpreserved : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn SaferiIsExecutableFileType(szfullpathname : windows_sys::core::PCWSTR, bfromshellexecute : bool) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 12:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography")]
// #[derive(Clone, Copy)]
// pub struct SAFER_CODE_PROPERTIES_V1 {
//     pub cbSize: u32,
//     pub dwCheckFlags: u32,
//     pub ImagePath: windows_sys::core::PCWSTR,
//     pub hImageFileHandle: super::super::Foundation::HANDLE,
//     pub UrlZoneId: u32,
//     pub ImageHash: [u8; 64],
//     pub dwImageHashSize: u32,
//     pub ImageSize: i64,
//     pub HashAlgorithm: super::Cryptography::ALG_ID,
//     pub pByteBlock: *mut u8,
//     pub hWndParent: super::super::Foundation::HWND,
//     pub dwWVTUIChoice: u32,
// }

// UNSUPPORTED Rust 29:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for SAFER_CODE_PROPERTIES_V1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 35:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography")]
// #[derive(Clone, Copy)]
// pub struct SAFER_CODE_PROPERTIES_V2 {
//     pub cbSize: u32,
//     pub dwCheckFlags: u32,
//     pub ImagePath: windows_sys::core::PCWSTR,
//     pub hImageFileHandle: super::super::Foundation::HANDLE,
//     pub UrlZoneId: u32,
//     pub ImageHash: [u8; 64],
//     pub dwImageHashSize: u32,
//     pub ImageSize: i64,
//     pub HashAlgorithm: super::Cryptography::ALG_ID,
//     pub pByteBlock: *mut u8,
//     pub hWndParent: super::super::Foundation::HWND,
//     pub dwWVTUIChoice: u32,
//     pub PackageMoniker: windows_sys::core::PCWSTR,
//     pub PackagePublisher: windows_sys::core::PCWSTR,
//     pub PackageName: windows_sys::core::PCWSTR,
//     pub PackageVersion: u64,
//     pub PackageIsFramework: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 57:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for SAFER_CODE_PROPERTIES_V2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `SAFER_COMPUTE_TOKEN_FROM_LEVEL_FLAGS` = UInt;
public const val `SAFER_CRITERIA_APPX_PACKAGE`: UInt = 32u;
public const val `SAFER_CRITERIA_AUTHENTICODE`: UInt = 8u;
public const val `SAFER_CRITERIA_IMAGEHASH`: UInt = 4u;
public const val `SAFER_CRITERIA_IMAGEPATH`: UInt = 1u;
public const val `SAFER_CRITERIA_IMAGEPATH_NT`: UInt = 4096u;
public const val `SAFER_CRITERIA_NOSIGNEDHASH`: UInt = 2u;
public const val `SAFER_CRITERIA_URLZONE`: UInt = 16u;
// UNSUPPORTED Rust 71:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography")]
// #[derive(Clone, Copy)]
// pub struct SAFER_HASH_IDENTIFICATION {
//     pub header: SAFER_IDENTIFICATION_HEADER,
//     pub Description: [u16; 256],
//     pub FriendlyName: [u16; 256],
//     pub HashSize: u32,
//     pub ImageHash: [u8; 64],
//     pub HashAlgorithm: super::Cryptography::ALG_ID,
//     pub ImageSize: i64,
//     pub dwSaferFlags: u32,
// }

// UNSUPPORTED Rust 84:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for SAFER_HASH_IDENTIFICATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 90:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography")]
// #[derive(Clone, Copy)]
// pub struct SAFER_HASH_IDENTIFICATION2 {
//     pub hashIdentification: SAFER_HASH_IDENTIFICATION,
//     pub HashSize: u32,
//     pub ImageHash: [u8; 64],
//     pub HashAlgorithm: super::Cryptography::ALG_ID,
// }

// UNSUPPORTED Rust 99:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for SAFER_HASH_IDENTIFICATION2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 105:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SAFER_IDENTIFICATION_HEADER {
//     pub dwIdentificationType: SAFER_IDENTIFICATION_TYPES,
//     pub cbStructSize: u32,
//     pub IdentificationGuid: windows_sys::core::GUID,
//     pub lastModified: super::super::Foundation::FILETIME,
// }

public typealias `SAFER_IDENTIFICATION_TYPES` = Int;
public const val `SAFER_LEVELID_CONSTRAINED`: UInt = 65536u;
public const val `SAFER_LEVELID_DISALLOWED`: UInt = 0u;
public const val `SAFER_LEVELID_FULLYTRUSTED`: UInt = 262144u;
public const val `SAFER_LEVELID_NORMALUSER`: UInt = 131072u;
public const val `SAFER_LEVELID_UNTRUSTED`: UInt = 4096u;
public const val `SAFER_LEVEL_OPEN`: UInt = 1u;
public const val `SAFER_MAX_DESCRIPTION_SIZE`: UInt = 256u;
public const val `SAFER_MAX_FRIENDLYNAME_SIZE`: UInt = 256u;
public const val `SAFER_MAX_HASH_SIZE`: UInt = 64u;
public typealias `SAFER_OBJECT_INFO_CLASS` = Int;
// UNSUPPORTED Rust 124:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SAFER_PATHNAME_IDENTIFICATION {
//     pub header: SAFER_IDENTIFICATION_HEADER,
//     pub Description: [u16; 256],
//     pub ImageName: windows_sys::core::PWSTR,
//     pub dwSaferFlags: u32,
// }

// UNSUPPORTED Rust 132:1: declaration Impl has no candidate rule
// impl Default for SAFER_PATHNAME_IDENTIFICATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SAFER_POLICY_BLOCK_CLIENT_UI`: UInt = 8192u;
public const val `SAFER_POLICY_HASH_DUPLICATE`: UInt = 262144u;
public typealias `SAFER_POLICY_INFO_CLASS` = Int;
public const val `SAFER_POLICY_JOBID_CONSTRAINED`: UInt = 67108864u;
public const val `SAFER_POLICY_JOBID_MASK`: UInt = 4278190080u;
public const val `SAFER_POLICY_JOBID_UNTRUSTED`: UInt = 50331648u;
public const val `SAFER_POLICY_ONLY_AUDIT`: UInt = 4096u;
public const val `SAFER_POLICY_ONLY_EXES`: UInt = 65536u;
public const val `SAFER_POLICY_SANDBOX_INERT`: UInt = 131072u;
public const val `SAFER_POLICY_UIFLAGS_HIDDEN`: UInt = 4u;
public const val `SAFER_POLICY_UIFLAGS_INFORMATION_PROMPT`: UInt = 1u;
public const val `SAFER_POLICY_UIFLAGS_MASK`: UInt = 255u;
public const val `SAFER_POLICY_UIFLAGS_OPTION_PROMPT`: UInt = 2u;
public const val `SAFER_SCOPEID_MACHINE`: UInt = 1u;
public const val `SAFER_SCOPEID_USER`: UInt = 2u;
public const val `SAFER_TOKEN_COMPARE_ONLY`: `SAFER_COMPUTE_TOKEN_FROM_LEVEL_FLAGS` = 2u;
public const val `SAFER_TOKEN_MAKE_INERT`: `SAFER_COMPUTE_TOKEN_FROM_LEVEL_FLAGS` = 4u;
public const val `SAFER_TOKEN_NULL_IF_EQUAL`: `SAFER_COMPUTE_TOKEN_FROM_LEVEL_FLAGS` = 1u;
public const val `SAFER_TOKEN_WANT_FLAGS`: `SAFER_COMPUTE_TOKEN_FROM_LEVEL_FLAGS` = 8u;
// UNSUPPORTED Rust 156:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SAFER_URLZONE_IDENTIFICATION {
//     pub header: SAFER_IDENTIFICATION_HEADER,
//     pub UrlZoneId: u32,
//     pub dwSaferFlags: u32,
// }

// UNSUPPORTED Rust 163:1: non-scalar type Ptr unsupported
// pub const SRP_POLICY_APPX: windows_sys::core::PCWSTR = windows_sys::core::w!("APPX");

// UNSUPPORTED Rust 164:1: non-scalar type Ptr unsupported
// pub const SRP_POLICY_DLL: windows_sys::core::PCWSTR = windows_sys::core::w!("DLL");

// UNSUPPORTED Rust 165:1: non-scalar type Ptr unsupported
// pub const SRP_POLICY_EXE: windows_sys::core::PCWSTR = windows_sys::core::w!("EXE");

// UNSUPPORTED Rust 166:1: non-scalar type Ptr unsupported
// pub const SRP_POLICY_MANAGEDINSTALLER: windows_sys::core::PCWSTR = windows_sys::core::w!("MANAGEDINSTALLER");

// UNSUPPORTED Rust 167:1: non-scalar type Ptr unsupported
// pub const SRP_POLICY_MSI: windows_sys::core::PCWSTR = windows_sys::core::w!("MSI");

// UNSUPPORTED Rust 168:1: non-scalar type Ptr unsupported
// pub const SRP_POLICY_NOV2: windows_sys::core::PCWSTR = windows_sys::core::w!("IGNORESRPV2");

// UNSUPPORTED Rust 169:1: non-scalar type Ptr unsupported
// pub const SRP_POLICY_SCRIPT: windows_sys::core::PCWSTR = windows_sys::core::w!("SCRIPT");

// UNSUPPORTED Rust 170:1: non-scalar type Ptr unsupported
// pub const SRP_POLICY_SHELL: windows_sys::core::PCWSTR = windows_sys::core::w!("SHELL");

// UNSUPPORTED Rust 171:1: non-scalar type Ptr unsupported
// pub const SRP_POLICY_WLDPCONFIGCI: windows_sys::core::PCWSTR = windows_sys::core::w!("WLDPCONFIGCI");

// UNSUPPORTED Rust 172:1: non-scalar type Ptr unsupported
// pub const SRP_POLICY_WLDPMSI: windows_sys::core::PCWSTR = windows_sys::core::w!("WLDPMSI");

// UNSUPPORTED Rust 173:1: non-scalar type Ptr unsupported
// pub const SRP_POLICY_WLDPSCRIPT: windows_sys::core::PCWSTR = windows_sys::core::w!("WLDPSCRIPT");

public const val `SaferIdentityDefault`: `SAFER_IDENTIFICATION_TYPES` = 0;
public const val `SaferIdentityTypeCertificate`: `SAFER_IDENTIFICATION_TYPES` = 4;
public const val `SaferIdentityTypeImageHash`: `SAFER_IDENTIFICATION_TYPES` = 2;
public const val `SaferIdentityTypeImageName`: `SAFER_IDENTIFICATION_TYPES` = 1;
public const val `SaferIdentityTypeUrlZone`: `SAFER_IDENTIFICATION_TYPES` = 3;
public const val `SaferObjectAllIdentificationGuids`: `SAFER_OBJECT_INFO_CLASS` = 14;
public const val `SaferObjectBuiltin`: `SAFER_OBJECT_INFO_CLASS` = 5;
public const val `SaferObjectDefaultOwner`: `SAFER_OBJECT_INFO_CLASS` = 10;
public const val `SaferObjectDeletedPrivileges`: `SAFER_OBJECT_INFO_CLASS` = 9;
public const val `SaferObjectDescription`: `SAFER_OBJECT_INFO_CLASS` = 4;
public const val `SaferObjectDisableMaxPrivilege`: `SAFER_OBJECT_INFO_CLASS` = 7;
public const val `SaferObjectDisallowed`: `SAFER_OBJECT_INFO_CLASS` = 6;
public const val `SaferObjectExtendedError`: `SAFER_OBJECT_INFO_CLASS` = 16;
public const val `SaferObjectFriendlyName`: `SAFER_OBJECT_INFO_CLASS` = 3;
public const val `SaferObjectInvertDeletedPrivileges`: `SAFER_OBJECT_INFO_CLASS` = 8;
public const val `SaferObjectLevelId`: `SAFER_OBJECT_INFO_CLASS` = 1;
public const val `SaferObjectRestrictedSidsAdded`: `SAFER_OBJECT_INFO_CLASS` = 13;
public const val `SaferObjectRestrictedSidsInverted`: `SAFER_OBJECT_INFO_CLASS` = 12;
public const val `SaferObjectScopeId`: `SAFER_OBJECT_INFO_CLASS` = 2;
public const val `SaferObjectSidsToDisable`: `SAFER_OBJECT_INFO_CLASS` = 11;
public const val `SaferObjectSingleIdentification`: `SAFER_OBJECT_INFO_CLASS` = 15;
public const val `SaferPolicyAuthenticodeEnabled`: `SAFER_POLICY_INFO_CLASS` = 7;
public const val `SaferPolicyDefaultLevel`: `SAFER_POLICY_INFO_CLASS` = 3;
public const val `SaferPolicyDefaultLevelFlags`: `SAFER_POLICY_INFO_CLASS` = 6;
public const val `SaferPolicyEnableTransparentEnforcement`: `SAFER_POLICY_INFO_CLASS` = 2;
public const val `SaferPolicyEvaluateUserScope`: `SAFER_POLICY_INFO_CLASS` = 4;
public const val `SaferPolicyLevelList`: `SAFER_POLICY_INFO_CLASS` = 1;
public const val `SaferPolicyScopeFlags`: `SAFER_POLICY_INFO_CLASS` = 5;
