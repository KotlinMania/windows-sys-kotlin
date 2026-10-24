// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=SaferCloseLevel; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SaferCloseLevel`(`hlevelhandle` : `super`.`SAFER_LEVEL_HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=SaferComputeTokenFromLevel; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SaferComputeTokenFromLevel`(`levelhandle` : `super`.`SAFER_LEVEL_HANDLE`, `inaccesstoken` : `super`.`super`.`Foundation`.`HANDLE`, `outaccesstoken` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?, `dwflags` : `SAFER_COMPUTE_TOKEN_FROM_LEVEL_FLAGS`, `lpreserved` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=SaferCreateLevel; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SaferCreateLevel`(`dwscopeid` : UInt, `dwlevelid` : UInt, `openflags` : UInt, `plevelhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`SAFER_LEVEL_HANDLE`>?, `lpreserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=SaferGetLevelInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SaferGetLevelInformation`(`levelhandle` : `super`.`SAFER_LEVEL_HANDLE`, `dwinfotype` : `SAFER_OBJECT_INFO_CLASS`, `lpquerybuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwinbuffersize` : UInt, `lpdwoutbuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=SaferGetPolicyInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SaferGetPolicyInformation`(`dwscopeid` : UInt, `saferpolicyinfoclass` : `SAFER_POLICY_INFO_CLASS`, `infobuffersize` : UInt, `infobuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `infobufferretsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpreserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=SaferIdentifyLevel; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
public external fun `SaferIdentifyLevel`(`dwnumproperties` : UInt, `pcodeproperties` : /* Rust *const */ kotlinx.cinterop.CPointer<`SAFER_CODE_PROPERTIES_V2`>?, `plevelhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`SAFER_LEVEL_HANDLE`>?, `lpreserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=SaferRecordEventLogEntry; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SaferRecordEventLogEntry`(`hlevel` : `super`.`SAFER_LEVEL_HANDLE`, `sztargetpath` : `windows_sys`.`core`.`PCWSTR`, `lpreserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=SaferSetLevelInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SaferSetLevelInformation`(`levelhandle` : `super`.`SAFER_LEVEL_HANDLE`, `dwinfotype` : `SAFER_OBJECT_INFO_CLASS`, `lpquerybuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwinbuffersize` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=SaferSetPolicyInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SaferSetPolicyInformation`(`dwscopeid` : UInt, `saferpolicyinfoclass` : `SAFER_POLICY_INFO_CLASS`, `infobuffersize` : UInt, `infobuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpreserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=SaferiIsExecutableFileType; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SaferiIsExecutableFileType`(`szfullpathname` : `windows_sys`.`core`.`PCWSTR`, `bfromshellexecute` : Boolean) : `windows_sys`.`core`.`BOOL`
// UNSUPPORTED Rust 12:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
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

// UNSUPPORTED Rust 29:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for SAFER_CODE_PROPERTIES_V1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 35:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
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

// UNSUPPORTED Rust 57:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// UNSUPPORTED Rust 71:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
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

// UNSUPPORTED Rust 84:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for SAFER_HASH_IDENTIFICATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 90:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography")]
// #[derive(Clone, Copy)]
// pub struct SAFER_HASH_IDENTIFICATION2 {
//     pub hashIdentification: SAFER_HASH_IDENTIFICATION,
//     pub HashSize: u32,
//     pub ImageHash: [u8; 64],
//     pub HashAlgorithm: super::Cryptography::ALG_ID,
// }

// UNSUPPORTED Rust 99:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for SAFER_HASH_IDENTIFICATION2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SAFER_IDENTIFICATION_HEADER` (
    public var `dwIdentificationType`: `SAFER_IDENTIFICATION_TYPES`,
    public var `cbStructSize`: UInt,
    public var `IdentificationGuid`: `windows_sys`.`core`.`GUID`,
    public var `lastModified`: `super`.`super`.`Foundation`.`FILETIME`,
)
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
// UNSUPPORTED Rust 124:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SAFER_PATHNAME_IDENTIFICATION {
//     pub header: SAFER_IDENTIFICATION_HEADER,
//     pub Description: [u16; 256],
//     pub ImageName: windows_sys::core::PWSTR,
//     pub dwSaferFlags: u32,
// }

// UNSUPPORTED Rust 132:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SAFER_URLZONE_IDENTIFICATION` (
    public var `header`: `SAFER_IDENTIFICATION_HEADER`,
    public var `UrlZoneId`: UInt,
    public var `dwSaferFlags`: UInt,
)
// UNSUPPORTED Rust 163:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SRP_POLICY_APPX: windows_sys::core::PCWSTR = windows_sys::core::w!("APPX");

// UNSUPPORTED Rust 164:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SRP_POLICY_DLL: windows_sys::core::PCWSTR = windows_sys::core::w!("DLL");

// UNSUPPORTED Rust 165:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SRP_POLICY_EXE: windows_sys::core::PCWSTR = windows_sys::core::w!("EXE");

// UNSUPPORTED Rust 166:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SRP_POLICY_MANAGEDINSTALLER: windows_sys::core::PCWSTR = windows_sys::core::w!("MANAGEDINSTALLER");

// UNSUPPORTED Rust 167:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SRP_POLICY_MSI: windows_sys::core::PCWSTR = windows_sys::core::w!("MSI");

// UNSUPPORTED Rust 168:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SRP_POLICY_NOV2: windows_sys::core::PCWSTR = windows_sys::core::w!("IGNORESRPV2");

// UNSUPPORTED Rust 169:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SRP_POLICY_SCRIPT: windows_sys::core::PCWSTR = windows_sys::core::w!("SCRIPT");

// UNSUPPORTED Rust 170:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SRP_POLICY_SHELL: windows_sys::core::PCWSTR = windows_sys::core::w!("SHELL");

// UNSUPPORTED Rust 171:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SRP_POLICY_WLDPCONFIGCI: windows_sys::core::PCWSTR = windows_sys::core::w!("WLDPCONFIGCI");

// UNSUPPORTED Rust 172:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const SRP_POLICY_WLDPMSI: windows_sys::core::PCWSTR = windows_sys::core::w!("WLDPMSI");

// UNSUPPORTED Rust 173:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
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
