// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetDfsAdd(dfsentrypath : windows_sys::core::PCWSTR, servername : windows_sys::core::PCWSTR, sharename : windows_sys::core::PCWSTR, comment : windows_sys::core::PCWSTR, flags : u32) -> u32);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetDfsAddFtRoot(servername : windows_sys::core::PCWSTR, rootshare : windows_sys::core::PCWSTR, ftdfsname : windows_sys::core::PCWSTR, comment : windows_sys::core::PCWSTR, flags : u32) -> u32);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetDfsAddRootTarget(pdfspath : windows_sys::core::PCWSTR, ptargetpath : windows_sys::core::PCWSTR, majorversion : u32, pcomment : windows_sys::core::PCWSTR, flags : u32) -> u32);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetDfsAddStdRoot(servername : windows_sys::core::PCWSTR, rootshare : windows_sys::core::PCWSTR, comment : windows_sys::core::PCWSTR, flags : u32) -> u32);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetDfsEnum(dfsname : windows_sys::core::PCWSTR, level : u32, prefmaxlen : u32, buffer : *mut *mut u8, entriesread : *mut u32, resumehandle : *mut u32) -> u32);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetDfsGetClientInfo(dfsentrypath : windows_sys::core::PCWSTR, servername : windows_sys::core::PCWSTR, sharename : windows_sys::core::PCWSTR, level : u32, buffer : *mut *mut u8) -> u32);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("netapi32.dll" "system" fn NetDfsGetFtContainerSecurity(domainname : windows_sys::core::PCWSTR, securityinformation : u32, ppsecuritydescriptor : *mut super::super::Security:: PSECURITY_DESCRIPTOR, lpcbsecuritydescriptor : *mut u32) -> u32);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetDfsGetInfo(dfsentrypath : windows_sys::core::PCWSTR, servername : windows_sys::core::PCWSTR, sharename : windows_sys::core::PCWSTR, level : u32, buffer : *mut *mut u8) -> u32);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("netapi32.dll" "system" fn NetDfsGetSecurity(dfsentrypath : windows_sys::core::PCWSTR, securityinformation : u32, ppsecuritydescriptor : *mut super::super::Security:: PSECURITY_DESCRIPTOR, lpcbsecuritydescriptor : *mut u32) -> u32);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("netapi32.dll" "system" fn NetDfsGetStdContainerSecurity(machinename : windows_sys::core::PCWSTR, securityinformation : u32, ppsecuritydescriptor : *mut super::super::Security:: PSECURITY_DESCRIPTOR, lpcbsecuritydescriptor : *mut u32) -> u32);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetDfsGetSupportedNamespaceVersion(origin : DFS_NAMESPACE_VERSION_ORIGIN, pname : windows_sys::core::PCWSTR, ppversioninfo : *mut *mut DFS_SUPPORTED_NAMESPACE_VERSION_INFO) -> u32);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetDfsMove(olddfsentrypath : windows_sys::core::PCWSTR, newdfsentrypath : windows_sys::core::PCWSTR, flags : u32) -> u32);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetDfsRemove(dfsentrypath : windows_sys::core::PCWSTR, servername : windows_sys::core::PCWSTR, sharename : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetDfsRemoveFtRoot(servername : windows_sys::core::PCWSTR, rootshare : windows_sys::core::PCWSTR, ftdfsname : windows_sys::core::PCWSTR, flags : u32) -> u32);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetDfsRemoveFtRootForced(domainname : windows_sys::core::PCWSTR, servername : windows_sys::core::PCWSTR, rootshare : windows_sys::core::PCWSTR, ftdfsname : windows_sys::core::PCWSTR, flags : u32) -> u32);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetDfsRemoveRootTarget(pdfspath : windows_sys::core::PCWSTR, ptargetpath : windows_sys::core::PCWSTR, flags : u32) -> u32);

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetDfsRemoveStdRoot(servername : windows_sys::core::PCWSTR, rootshare : windows_sys::core::PCWSTR, flags : u32) -> u32);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetDfsSetClientInfo(dfsentrypath : windows_sys::core::PCWSTR, servername : windows_sys::core::PCWSTR, sharename : windows_sys::core::PCWSTR, level : u32, buffer : *const u8) -> u32);

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("netapi32.dll" "system" fn NetDfsSetFtContainerSecurity(domainname : windows_sys::core::PCWSTR, securityinformation : u32, psecuritydescriptor : super::super::Security:: PSECURITY_DESCRIPTOR) -> u32);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn NetDfsSetInfo(dfsentrypath : windows_sys::core::PCWSTR, servername : windows_sys::core::PCWSTR, sharename : windows_sys::core::PCWSTR, level : u32, buffer : *const u8) -> u32);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("netapi32.dll" "system" fn NetDfsSetSecurity(dfsentrypath : windows_sys::core::PCWSTR, securityinformation : u32, psecuritydescriptor : super::super::Security:: PSECURITY_DESCRIPTOR) -> u32);

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("netapi32.dll" "system" fn NetDfsSetStdContainerSecurity(machinename : windows_sys::core::PCWSTR, securityinformation : u32, psecuritydescriptor : super::super::Security:: PSECURITY_DESCRIPTOR) -> u32);

public const val `DFS_ADD_VOLUME`: UInt = 1u;
public const val `DFS_FORCE_REMOVE`: UInt = 2147483648u;
// UNSUPPORTED Rust 31:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DFS_GET_PKT_ENTRY_STATE_ARG {
//     pub DfsEntryPathLen: u16,
//     pub ServerNameLen: u16,
//     pub ShareNameLen: u16,
//     pub Level: u32,
//     pub Buffer: [u16; 1],
// }

// UNSUPPORTED Rust 40:1: declaration Impl has no candidate rule
// impl Default for DFS_GET_PKT_ENTRY_STATE_ARG {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 45:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DFS_INFO_1 {
//     pub EntryPath: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 50:1: declaration Impl has no candidate rule
// impl Default for DFS_INFO_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 55:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DFS_INFO_100 {
//     pub Comment: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 60:1: declaration Impl has no candidate rule
// impl Default for DFS_INFO_100 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 65:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DFS_INFO_101 {
//     pub State: u32,
// }

// UNSUPPORTED Rust 70:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DFS_INFO_102 {
//     pub Timeout: u32,
// }

// UNSUPPORTED Rust 75:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DFS_INFO_103 {
//     pub PropertyFlagMask: u32,
//     pub PropertyFlags: u32,
// }

// UNSUPPORTED Rust 81:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DFS_INFO_104 {
//     pub TargetPriority: DFS_TARGET_PRIORITY,
// }

// UNSUPPORTED Rust 86:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DFS_INFO_105 {
//     pub Comment: windows_sys::core::PWSTR,
//     pub State: u32,
//     pub Timeout: u32,
//     pub PropertyFlagMask: u32,
//     pub PropertyFlags: u32,
// }

// UNSUPPORTED Rust 95:1: declaration Impl has no candidate rule
// impl Default for DFS_INFO_105 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 100:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DFS_INFO_106 {
//     pub State: u32,
//     pub TargetPriority: DFS_TARGET_PRIORITY,
// }

// UNSUPPORTED Rust 106:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct DFS_INFO_107 {
//     pub Comment: windows_sys::core::PWSTR,
//     pub State: u32,
//     pub Timeout: u32,
//     pub PropertyFlagMask: u32,
//     pub PropertyFlags: u32,
//     pub SdLengthReserved: u32,
//     pub pSecurityDescriptor: super::super::Security::PSECURITY_DESCRIPTOR,
// }

// UNSUPPORTED Rust 118:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for DFS_INFO_107 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 124:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct DFS_INFO_150 {
//     pub SdLengthReserved: u32,
//     pub pSecurityDescriptor: super::super::Security::PSECURITY_DESCRIPTOR,
// }

// UNSUPPORTED Rust 131:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for DFS_INFO_150 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 137:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy, Default)]
// pub struct DFS_INFO_1_32 {
//     pub EntryPath: u32,
// }

// UNSUPPORTED Rust 143:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DFS_INFO_2 {
//     pub EntryPath: windows_sys::core::PWSTR,
//     pub Comment: windows_sys::core::PWSTR,
//     pub State: u32,
//     pub NumberOfStorages: u32,
// }

// UNSUPPORTED Rust 151:1: declaration Impl has no candidate rule
// impl Default for DFS_INFO_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 156:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DFS_INFO_200 {
//     pub FtDfsName: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 161:1: declaration Impl has no candidate rule
// impl Default for DFS_INFO_200 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 166:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy, Default)]
// pub struct DFS_INFO_2_32 {
//     pub EntryPath: u32,
//     pub Comment: u32,
//     pub State: u32,
//     pub NumberOfStorages: u32,
// }

// UNSUPPORTED Rust 175:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DFS_INFO_3 {
//     pub EntryPath: windows_sys::core::PWSTR,
//     pub Comment: windows_sys::core::PWSTR,
//     pub State: u32,
//     pub NumberOfStorages: u32,
//     pub Storage: *mut DFS_STORAGE_INFO,
// }

// UNSUPPORTED Rust 184:1: declaration Impl has no candidate rule
// impl Default for DFS_INFO_3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 189:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DFS_INFO_300 {
//     pub Flags: u32,
//     pub DfsName: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 195:1: declaration Impl has no candidate rule
// impl Default for DFS_INFO_300 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 200:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy, Default)]
// pub struct DFS_INFO_3_32 {
//     pub EntryPath: u32,
//     pub Comment: u32,
//     pub State: u32,
//     pub NumberOfStorages: u32,
//     pub Storage: u32,
// }

// UNSUPPORTED Rust 210:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DFS_INFO_4 {
//     pub EntryPath: windows_sys::core::PWSTR,
//     pub Comment: windows_sys::core::PWSTR,
//     pub State: u32,
//     pub Timeout: u32,
//     pub Guid: windows_sys::core::GUID,
//     pub NumberOfStorages: u32,
//     pub Storage: *mut DFS_STORAGE_INFO,
// }

// UNSUPPORTED Rust 221:1: declaration Impl has no candidate rule
// impl Default for DFS_INFO_4 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 226:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy, Default)]
// pub struct DFS_INFO_4_32 {
//     pub EntryPath: u32,
//     pub Comment: u32,
//     pub State: u32,
//     pub Timeout: u32,
//     pub Guid: windows_sys::core::GUID,
//     pub NumberOfStorages: u32,
//     pub Storage: u32,
// }

// UNSUPPORTED Rust 238:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DFS_INFO_5 {
//     pub EntryPath: windows_sys::core::PWSTR,
//     pub Comment: windows_sys::core::PWSTR,
//     pub State: u32,
//     pub Timeout: u32,
//     pub Guid: windows_sys::core::GUID,
//     pub PropertyFlags: u32,
//     pub MetadataSize: u32,
//     pub NumberOfStorages: u32,
// }

// UNSUPPORTED Rust 250:1: declaration Impl has no candidate rule
// impl Default for DFS_INFO_5 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 255:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DFS_INFO_50 {
//     pub NamespaceMajorVersion: u32,
//     pub NamespaceMinorVersion: u32,
//     pub NamespaceCapabilities: u64,
// }

// UNSUPPORTED Rust 262:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DFS_INFO_6 {
//     pub EntryPath: windows_sys::core::PWSTR,
//     pub Comment: windows_sys::core::PWSTR,
//     pub State: u32,
//     pub Timeout: u32,
//     pub Guid: windows_sys::core::GUID,
//     pub PropertyFlags: u32,
//     pub MetadataSize: u32,
//     pub NumberOfStorages: u32,
//     pub Storage: *mut DFS_STORAGE_INFO_1,
// }

// UNSUPPORTED Rust 275:1: declaration Impl has no candidate rule
// impl Default for DFS_INFO_6 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 280:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DFS_INFO_7 {
//     pub GenerationGuid: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 285:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct DFS_INFO_8 {
//     pub EntryPath: windows_sys::core::PWSTR,
//     pub Comment: windows_sys::core::PWSTR,
//     pub State: u32,
//     pub Timeout: u32,
//     pub Guid: windows_sys::core::GUID,
//     pub PropertyFlags: u32,
//     pub MetadataSize: u32,
//     pub SdLengthReserved: u32,
//     pub pSecurityDescriptor: super::super::Security::PSECURITY_DESCRIPTOR,
//     pub NumberOfStorages: u32,
// }

// UNSUPPORTED Rust 300:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for DFS_INFO_8 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 306:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct DFS_INFO_9 {
//     pub EntryPath: windows_sys::core::PWSTR,
//     pub Comment: windows_sys::core::PWSTR,
//     pub State: u32,
//     pub Timeout: u32,
//     pub Guid: windows_sys::core::GUID,
//     pub PropertyFlags: u32,
//     pub MetadataSize: u32,
//     pub SdLengthReserved: u32,
//     pub pSecurityDescriptor: super::super::Security::PSECURITY_DESCRIPTOR,
//     pub NumberOfStorages: u32,
//     pub Storage: *mut DFS_STORAGE_INFO_1,
// }

// UNSUPPORTED Rust 322:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for DFS_INFO_9 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DFS_MOVE_FLAG_REPLACE_IF_EXISTS`: UInt = 1u;
public typealias `DFS_NAMESPACE_VERSION_ORIGIN` = Int;
public const val `DFS_NAMESPACE_VERSION_ORIGIN_COMBINED`: `DFS_NAMESPACE_VERSION_ORIGIN` = 0;
public const val `DFS_NAMESPACE_VERSION_ORIGIN_DOMAIN`: `DFS_NAMESPACE_VERSION_ORIGIN` = 2;
public const val `DFS_NAMESPACE_VERSION_ORIGIN_SERVER`: `DFS_NAMESPACE_VERSION_ORIGIN` = 1;
public const val `DFS_PROPERTY_FLAG_ABDE`: UInt = 32u;
public const val `DFS_PROPERTY_FLAG_CLUSTER_ENABLED`: UInt = 16u;
public const val `DFS_PROPERTY_FLAG_INSITE_REFERRALS`: UInt = 1u;
public const val `DFS_PROPERTY_FLAG_ROOT_SCALABILITY`: UInt = 2u;
public const val `DFS_PROPERTY_FLAG_SITE_COSTING`: UInt = 4u;
public const val `DFS_PROPERTY_FLAG_TARGET_FAILBACK`: UInt = 8u;
public const val `DFS_RESTORE_VOLUME`: UInt = 2u;
// UNSUPPORTED Rust 340:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DFS_SITELIST_INFO {
//     pub cSites: u32,
//     pub Site: [DFS_SITENAME_INFO; 1],
// }

// UNSUPPORTED Rust 346:1: declaration Impl has no candidate rule
// impl Default for DFS_SITELIST_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 351:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DFS_SITENAME_INFO {
//     pub SiteFlags: u32,
//     pub SiteName: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 357:1: declaration Impl has no candidate rule
// impl Default for DFS_SITENAME_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DFS_SITE_PRIMARY`: UInt = 1u;
public const val `DFS_STORAGE_FLAVOR_UNUSED2`: UInt = 768u;
// UNSUPPORTED Rust 364:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DFS_STORAGE_INFO {
//     pub State: u32,
//     pub ServerName: windows_sys::core::PWSTR,
//     pub ShareName: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 371:1: declaration Impl has no candidate rule
// impl Default for DFS_STORAGE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 376:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy, Default)]
// pub struct DFS_STORAGE_INFO_0_32 {
//     pub State: u32,
//     pub ServerName: u32,
//     pub ShareName: u32,
// }

// UNSUPPORTED Rust 384:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DFS_STORAGE_INFO_1 {
//     pub State: u32,
//     pub ServerName: windows_sys::core::PWSTR,
//     pub ShareName: windows_sys::core::PWSTR,
//     pub TargetPriority: DFS_TARGET_PRIORITY,
// }

// UNSUPPORTED Rust 392:1: declaration Impl has no candidate rule
// impl Default for DFS_STORAGE_INFO_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DFS_STORAGE_STATES`: UInt = 15u;
public const val `DFS_STORAGE_STATE_ACTIVE`: UInt = 4u;
public const val `DFS_STORAGE_STATE_OFFLINE`: UInt = 1u;
public const val `DFS_STORAGE_STATE_ONLINE`: UInt = 2u;
// UNSUPPORTED Rust 401:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DFS_SUPPORTED_NAMESPACE_VERSION_INFO {
//     pub DomainDfsMajorVersion: u32,
//     pub DomainDfsMinorVersion: u32,
//     pub DomainDfsCapabilities: u64,
//     pub StandaloneDfsMajorVersion: u32,
//     pub StandaloneDfsMinorVersion: u32,
//     pub StandaloneDfsCapabilities: u64,
// }

// UNSUPPORTED Rust 411:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DFS_TARGET_PRIORITY {
//     pub TargetPriorityClass: DFS_TARGET_PRIORITY_CLASS,
//     pub TargetPriorityRank: u16,
//     pub Reserved: u16,
// }

public typealias `DFS_TARGET_PRIORITY_CLASS` = Int;
public const val `DFS_VOLUME_FLAVORS`: UInt = 768u;
public const val `DFS_VOLUME_FLAVOR_AD_BLOB`: UInt = 512u;
public const val `DFS_VOLUME_FLAVOR_STANDALONE`: UInt = 256u;
public const val `DFS_VOLUME_FLAVOR_UNUSED1`: UInt = 0u;
public const val `DFS_VOLUME_STATES`: UInt = 15u;
public const val `DFS_VOLUME_STATE_FORCE_SYNC`: UInt = 64u;
public const val `DFS_VOLUME_STATE_INCONSISTENT`: UInt = 2u;
public const val `DFS_VOLUME_STATE_OFFLINE`: UInt = 3u;
public const val `DFS_VOLUME_STATE_OK`: UInt = 1u;
public const val `DFS_VOLUME_STATE_ONLINE`: UInt = 4u;
public const val `DFS_VOLUME_STATE_RESYNCHRONIZE`: UInt = 16u;
public const val `DFS_VOLUME_STATE_STANDBY`: UInt = 32u;
public const val `DfsGlobalHighPriorityClass`: `DFS_TARGET_PRIORITY_CLASS` = 1;
public const val `DfsGlobalLowPriorityClass`: `DFS_TARGET_PRIORITY_CLASS` = 4;
public const val `DfsInvalidPriorityClass`: `DFS_TARGET_PRIORITY_CLASS` = -1;
public const val `DfsSiteCostHighPriorityClass`: `DFS_TARGET_PRIORITY_CLASS` = 2;
public const val `DfsSiteCostLowPriorityClass`: `DFS_TARGET_PRIORITY_CLASS` = 3;
public const val `DfsSiteCostNormalPriorityClass`: `DFS_TARGET_PRIORITY_CLASS` = 0;
public const val `FSCTL_DFS_BASE`: UInt = 6u;
public const val `FSCTL_DFS_GET_PKT_ENTRY_STATE`: UInt = 401340u;
public const val `NET_DFS_SETDC_FLAGS`: UInt = 0u;
public const val `NET_DFS_SETDC_INITPKT`: UInt = 2u;
public const val `NET_DFS_SETDC_TIMEOUT`: UInt = 1u;
