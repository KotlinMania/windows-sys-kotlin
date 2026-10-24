// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("gpedit.dll" "system" fn BrowseForGPO(lpbrowseinfo : *mut GPOBROWSEINFO) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CommandLineFromMsiDescriptor(descriptor : windows_sys::core::PCWSTR, commandline : windows_sys::core::PWSTR, commandlinelength : *mut u32) -> u32);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("gpedit.dll" "system" fn CreateGPOLink(lpgpo : windows_sys::core::PCWSTR, lpcontainer : windows_sys::core::PCWSTR, fhighpriority : windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("gpedit.dll" "system" fn DeleteAllGPOLinks(lpcontainer : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("gpedit.dll" "system" fn DeleteGPOLink(lpgpo : windows_sys::core::PCWSTR, lpcontainer : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("userenv.dll" "system" fn EnterCriticalPolicySection(bmachine : windows_sys::core::BOOL) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("gpedit.dll" "system" fn ExportRSoPData(lpnamespace : windows_sys::core::PCWSTR, lpfilename : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("userenv.dll" "system" fn FreeGPOListA(pgpolist : *const GROUP_POLICY_OBJECTA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("userenv.dll" "system" fn FreeGPOListW(pgpolist : *const GROUP_POLICY_OBJECTW) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("userenv.dll" "system" fn GenerateGPNotification(bmachine : windows_sys::core::BOOL, lpwszmgmtproduct : windows_sys::core::PCWSTR, dwmgmtproductoptions : u32) -> u32);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("userenv.dll" "system" fn GetAppliedGPOListA(dwflags : u32, pmachinename : windows_sys::core::PCSTR, psiduser : super::super::Security:: PSID, pguidextension : *const windows_sys::core::GUID, ppgpolist : *mut *mut GROUP_POLICY_OBJECTA) -> u32);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("userenv.dll" "system" fn GetAppliedGPOListW(dwflags : u32, pmachinename : windows_sys::core::PCWSTR, psiduser : super::super::Security:: PSID, pguidextension : *const windows_sys::core::GUID, ppgpolist : *mut *mut GROUP_POLICY_OBJECTW) -> u32);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// windows_link::link!("userenv.dll" "system" fn GetGPOListA(htoken : super::super::Foundation:: HANDLE, lpname : windows_sys::core::PCSTR, lphostname : windows_sys::core::PCSTR, lpcomputername : windows_sys::core::PCSTR, dwflags : u32, pgpolist : *mut *mut GROUP_POLICY_OBJECTA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// windows_link::link!("userenv.dll" "system" fn GetGPOListW(htoken : super::super::Foundation:: HANDLE, lpname : windows_sys::core::PCWSTR, lphostname : windows_sys::core::PCWSTR, lpcomputername : windows_sys::core::PCWSTR, dwflags : u32, pgpolist : *mut *mut GROUP_POLICY_OBJECTW) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn GetLocalManagedApplicationData(productcode : windows_sys::core::PCWSTR, displayname : *mut windows_sys::core::PWSTR, supporturl : *mut windows_sys::core::PWSTR));

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn GetLocalManagedApplications(buserapps : windows_sys::core::BOOL, pdwapps : *mut u32, prglocalapps : *mut *mut LOCALMANAGEDAPPLICATION) -> u32);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_Shell")]
// windows_link::link!("advapi32.dll" "system" fn GetManagedApplicationCategories(dwreserved : u32, pappcategory : *mut super::super::UI::Shell:: APPCATEGORYINFOLIST) -> u32);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn GetManagedApplications(pcategory : *const windows_sys::core::GUID, dwqueryflags : u32, dwinfolevel : u32, pdwapps : *mut u32, prgmanagedapps : *mut *mut MANAGEDAPPLICATION) -> u32);

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// windows_link::link!("gpedit.dll" "system" fn ImportRSoPData(lpnamespace : windows_sys::core::PCWSTR, lpfilename : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn InstallApplication(pinstallinfo : *const INSTALLDATA) -> u32);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// windows_link::link!("userenv.dll" "system" fn LeaveCriticalPolicySection(hsection : super::super::Foundation:: HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// windows_link::link!("userenv.dll" "system" fn ProcessGroupPolicyCompleted(extensionid : *const windows_sys::core::GUID, pasynchandle : usize, dwstatus : u32) -> u32);

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// windows_link::link!("userenv.dll" "system" fn ProcessGroupPolicyCompletedEx(extensionid : *const windows_sys::core::GUID, pasynchandle : usize, dwstatus : u32, rsopstatus : windows_sys::core::HRESULT) -> u32);

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// windows_link::link!("userenv.dll" "system" fn RefreshPolicy(bmachine : windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// windows_link::link!("userenv.dll" "system" fn RefreshPolicyEx(bmachine : windows_sys::core::BOOL, dwoptions : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 29:1: declaration Macro has no candidate rule
// windows_link::link!("userenv.dll" "system" fn RegisterGPNotification(hevent : super::super::Foundation:: HANDLE, bmachine : windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 30:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("userenv.dll" "system" fn RsopAccessCheckByType(psecuritydescriptor : super::super::Security:: PSECURITY_DESCRIPTOR, pprincipalselfsid : super::super::Security:: PSID, prsoptoken : *const core::ffi::c_void, dwdesiredaccessmask : u32, pobjecttypelist : *const super::super::Security:: OBJECT_TYPE_LIST, objecttypelistlength : u32, pgenericmapping : *const super::super::Security:: GENERIC_MAPPING, pprivilegeset : *const super::super::Security:: PRIVILEGE_SET, pdwprivilegesetlength : *const u32, pdwgrantedaccessmask : *mut u32, pbaccessstatus : *mut windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 32:1: declaration Macro has no candidate rule
// windows_link::link!("userenv.dll" "system" fn RsopFileAccessCheck(pszfilename : windows_sys::core::PCWSTR, prsoptoken : *const core::ffi::c_void, dwdesiredaccessmask : u32, pdwgrantedaccessmask : *mut u32, pbaccessstatus : *mut windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 33:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Wmi")]
// windows_link::link!("userenv.dll" "system" fn RsopResetPolicySettingStatus(dwflags : u32, pservices : * mut core::ffi::c_void, psettinginstance : * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 35:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Wmi")]
// windows_link::link!("userenv.dll" "system" fn RsopSetPolicySettingStatus(dwflags : u32, pservices : * mut core::ffi::c_void, psettinginstance : * mut core::ffi::c_void, ninfo : u32, pstatus : *const POLICYSETTINGSTATUSINFO) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 37:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn UninstallApplication(productcode : windows_sys::core::PCWSTR, dwstatus : u32) -> u32);

// UNSUPPORTED Rust 38:1: declaration Macro has no candidate rule
// windows_link::link!("userenv.dll" "system" fn UnregisterGPNotification(hevent : super::super::Foundation:: HANDLE) -> windows_sys::core::BOOL);

public const val `ABSENT`: `APPSTATE` = 0;
// UNSUPPORTED Rust 40:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const ADMXCOMMENTS_EXTENSION_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6c5a2a86_9eb3_42b9_aa83_a7371ba011b9);

public const val `APPNAME`: `INSTALLSPECTYPE` = 1;
public typealias `APPSTATE` = Int;
public const val `ASSIGNED`: `APPSTATE` = 1;
// UNSUPPORTED Rust 44:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CLSID_GPESnapIn: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8fc0b734_a0e1_11d1_a7d3_0000f87571e3);

// UNSUPPORTED Rust 45:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CLSID_GroupPolicyObject: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xea502722_a23d_11d1_a7d3_0000f87571e3);

// UNSUPPORTED Rust 46:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CLSID_RSOPSnapIn: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6dc3804b_7212_458d_adb0_9a07e2ae1fa2);

public const val `COMCLASS`: `INSTALLSPECTYPE` = 4;
public const val `FILEEXT`: `INSTALLSPECTYPE` = 2;
public const val `FLAG_ASSUME_COMP_WQLFILTER_TRUE`: UInt = 33554432u;
public const val `FLAG_ASSUME_SLOW_LINK`: UInt = 536870912u;
public const val `FLAG_ASSUME_USER_WQLFILTER_TRUE`: UInt = 67108864u;
public const val `FLAG_FORCE_CREATENAMESPACE`: UInt = 4u;
public const val `FLAG_LOOPBACK_MERGE`: UInt = 268435456u;
public const val `FLAG_LOOPBACK_REPLACE`: UInt = 134217728u;
public const val `FLAG_NO_COMPUTER`: UInt = 2u;
public const val `FLAG_NO_CSE_INVOKE`: UInt = 1073741824u;
public const val `FLAG_NO_GPO_FILTER`: UInt = 2147483648u;
public const val `FLAG_NO_USER`: UInt = 1u;
public const val `FLAG_PLANNING_MODE`: UInt = 16777216u;
public const val `GPC_BLOCK_POLICY`: UInt = 1u;
public const val `GPHintDomain`: `GROUP_POLICY_HINT_TYPE` = 3;
public const val `GPHintMachine`: `GROUP_POLICY_HINT_TYPE` = 1;
public const val `GPHintOrganizationalUnit`: `GROUP_POLICY_HINT_TYPE` = 4;
public const val `GPHintSite`: `GROUP_POLICY_HINT_TYPE` = 2;
public const val `GPHintUnknown`: `GROUP_POLICY_HINT_TYPE` = 0;
public const val `GPLinkDomain`: `GPO_LINK` = 3;
public const val `GPLinkMachine`: `GPO_LINK` = 1;
public const val `GPLinkOrganizationalUnit`: `GPO_LINK` = 4;
public const val `GPLinkSite`: `GPO_LINK` = 2;
public const val `GPLinkUnknown`: `GPO_LINK` = 0;
// UNSUPPORTED Rust 71:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GPM: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf5694708_88fe_4b35_babf_e56162d5fbc8);

// UNSUPPORTED Rust 72:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GPMAsyncCancel: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x372796a9_76ec_479d_ad6c_556318ed5f9d);

// UNSUPPORTED Rust 73:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GPMBackup: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xed1a54b8_5efa_482a_93c0_8ad86f0d68c3);

// UNSUPPORTED Rust 74:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GPMBackupCollection: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xeb8f035b_70db_4a9f_9676_37c25994e9dc);

// UNSUPPORTED Rust 75:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GPMBackupDir: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfce4a59d_0f21_4afa_b859_e6d0c62cd10c);

// UNSUPPORTED Rust 76:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GPMBackupDirEx: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe8c0988a_cf03_4c5b_8be2_2aa9ad32aada);

public typealias `GPMBackupType` = Int;
// UNSUPPORTED Rust 78:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GPMCSECollection: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcf92b828_2d44_4b61_b10a_b327afd42da8);

// UNSUPPORTED Rust 79:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GPMClientSideExtension: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc1a2e70e_659c_4b1a_940b_f88b0af9c8a4);

// UNSUPPORTED Rust 80:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GPMConstants: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3855e880_cd9e_4d0c_9eaf_1579283a1888);

public typealias `GPMDestinationOption` = Int;
// UNSUPPORTED Rust 82:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GPMDomain: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x710901be_1050_4cb1_838a_c5cff259e183);

public typealias `GPMEntryType` = Int;
// UNSUPPORTED Rust 84:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GPMGPO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd2ce2994_59b5_4064_b581_4d68486a16c4);

// UNSUPPORTED Rust 85:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GPMGPOCollection: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7a057325_832d_4de3_a41f_c780436a4e09);

// UNSUPPORTED Rust 86:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GPMGPOLink: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc1df9880_5303_42c6_8a3c_0488e1bf7364);

// UNSUPPORTED Rust 87:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GPMGPOLinksCollection: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf6ed581a_49a5_47e2_b771_fd8dc02b6259);

// UNSUPPORTED Rust 88:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GPMMapEntry: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8c975253_5431_4471_b35d_0626c928258a);

// UNSUPPORTED Rust 89:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GPMMapEntryCollection: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cf75d5b_a3a1_4c55_b4fe_9e149c41f66d);

// UNSUPPORTED Rust 90:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GPMMigrationTable: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x55af4043_2a06_4f72_abef_631b44079c76);

// UNSUPPORTED Rust 91:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GPMPermission: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5871a40a_e9c0_46ec_913e_944ef9225a94);

public typealias `GPMPermissionType` = Int;
// UNSUPPORTED Rust 93:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GPMRSOP: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x489b0caf_9ec2_4eb7_91f5_b6f71d43da8c);

public typealias `GPMRSOPMode` = Int;
public typealias `GPMReportType` = Int;
public typealias `GPMReportingOptions` = Int;
// UNSUPPORTED Rust 97:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GPMResult: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x92101ac0_9287_4206_a3b2_4bdb73d225f6);

// UNSUPPORTED Rust 98:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GPMSOM: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x32d93fac_450e_44cf_829c_8b22ff6bdae1);

// UNSUPPORTED Rust 99:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GPMSOMCollection: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x24c1f147_3720_4f5b_a9c3_06b4e4f931d2);

public typealias `GPMSOMType` = Int;
// UNSUPPORTED Rust 101:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GPMSearchCriteria: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x17aaca26_5ce0_44fa_8cc0_5259e6483566);

public typealias `GPMSearchOperation` = Int;
public typealias `GPMSearchProperty` = Int;
// UNSUPPORTED Rust 104:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GPMSecurityInfo: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x547a5e8f_9162_4516_a4df_9ddb9686d846);

// UNSUPPORTED Rust 105:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GPMSitesContainer: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x229f5c42_852c_4b30_945f_c522be9bd386);

// UNSUPPORTED Rust 106:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GPMStarterGPOBackup: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x389e400a_d8ef_455b_a861_5f9ca34a6a02);

// UNSUPPORTED Rust 107:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GPMStarterGPOBackupCollection: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe75ea59d_1aeb_4cb5_a78a_281daa582406);

// UNSUPPORTED Rust 108:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GPMStarterGPOCollection: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x82f8aa8b_49ba_43b2_956e_3397f9b94c3a);

public typealias `GPMStarterGPOType` = Int;
// UNSUPPORTED Rust 110:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GPMStatusMessage: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4b77cc94_d255_409b_bc62_370881715a19);

// UNSUPPORTED Rust 111:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GPMStatusMsgCollection: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2824e4be_4bcc_4cac_9e60_0e3ed7f12496);

// UNSUPPORTED Rust 112:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GPMTemplate: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xecf1d454_71da_4e2f_a8c0_8185465911d9);

// UNSUPPORTED Rust 113:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GPMTrustee: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc54a700d_19b6_4211_bcb0_e8e2475e471e);

// UNSUPPORTED Rust 114:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GPMWMIFilter: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x626745d8_0dea_4062_bf60_cfc5b1ca1286);

// UNSUPPORTED Rust 115:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GPMWMIFilterCollection: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x74dc6d28_e820_47d6_a0b8_f08d93d7fa33);

public const val `GPM_DONOTUSE_W2KDC`: UInt = 2u;
public const val `GPM_DONOT_VALIDATEDC`: UInt = 1u;
public const val `GPM_MIGRATIONTABLE_ONLY`: UInt = 1u;
public const val `GPM_PROCESS_SECURITY`: UInt = 2u;
public const val `GPM_USE_ANYDC`: UInt = 1u;
public const val `GPM_USE_PDC`: UInt = 0u;
// UNSUPPORTED Rust 122:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct GPOBROWSEINFO {
//     pub dwSize: u32,
//     pub dwFlags: u32,
//     pub hwndOwner: super::super::Foundation::HWND,
//     pub lpTitle: windows_sys::core::PWSTR,
//     pub lpInitialOU: windows_sys::core::PWSTR,
//     pub lpDSPath: windows_sys::core::PWSTR,
//     pub dwDSPathSize: u32,
//     pub lpName: windows_sys::core::PWSTR,
//     pub dwNameSize: u32,
//     pub gpoType: GROUP_POLICY_OBJECT_TYPE,
//     pub gpoHint: GROUP_POLICY_HINT_TYPE,
// }

// UNSUPPORTED Rust 137:1: declaration Impl has no candidate rule
// impl Default for GPOBROWSEINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `GPOTypeDS`: `GROUP_POLICY_OBJECT_TYPE` = 2;
public const val `GPOTypeLocal`: `GROUP_POLICY_OBJECT_TYPE` = 0;
public const val `GPOTypeLocalGroup`: `GROUP_POLICY_OBJECT_TYPE` = 4;
public const val `GPOTypeLocalUser`: `GROUP_POLICY_OBJECT_TYPE` = 3;
public const val `GPOTypeRemote`: `GROUP_POLICY_OBJECT_TYPE` = 1;
public const val `GPO_BROWSE_DISABLENEW`: UInt = 1u;
public const val `GPO_BROWSE_INITTOALL`: UInt = 16u;
public const val `GPO_BROWSE_NOCOMPUTERS`: UInt = 2u;
public const val `GPO_BROWSE_NODSGPOS`: UInt = 4u;
public const val `GPO_BROWSE_NOUSERGPOS`: UInt = 32u;
public const val `GPO_BROWSE_OPENBUTTON`: UInt = 8u;
public const val `GPO_BROWSE_SENDAPPLYONEDIT`: UInt = 64u;
public const val `GPO_FLAG_DISABLE`: UInt = 1u;
public const val `GPO_FLAG_FORCE`: UInt = 2u;
public const val `GPO_INFO_FLAG_ASYNC_FOREGROUND`: UInt = 4096u;
public const val `GPO_INFO_FLAG_BACKGROUND`: UInt = 16u;
public const val `GPO_INFO_FLAG_FORCED_REFRESH`: UInt = 1024u;
public const val `GPO_INFO_FLAG_LINKTRANSITION`: UInt = 256u;
public const val `GPO_INFO_FLAG_LOGRSOP_TRANSITION`: UInt = 512u;
public const val `GPO_INFO_FLAG_MACHINE`: UInt = 1u;
public const val `GPO_INFO_FLAG_NOCHANGES`: UInt = 128u;
public const val `GPO_INFO_FLAG_SAFEMODE_BOOT`: UInt = 2048u;
public const val `GPO_INFO_FLAG_SLOWLINK`: UInt = 32u;
public const val `GPO_INFO_FLAG_VERBOSE`: UInt = 64u;
public typealias `GPO_LINK` = Int;
public const val `GPO_LIST_FLAG_MACHINE`: UInt = 1u;
public const val `GPO_LIST_FLAG_NO_SECURITYFILTERS`: UInt = 8u;
public const val `GPO_LIST_FLAG_NO_WMIFILTERS`: UInt = 4u;
public const val `GPO_LIST_FLAG_SITEONLY`: UInt = 2u;
public typealias `GPO_OPEN_FLAGS` = UInt;
public const val `GPO_OPEN_LOAD_REGISTRY`: `GPO_OPEN_FLAGS` = 1u;
public const val `GPO_OPEN_READ_ONLY`: `GPO_OPEN_FLAGS` = 2u;
public typealias `GPO_OPTIONS` = UInt;
public const val `GPO_OPTION_DISABLE_MACHINE`: `GPO_OPTIONS` = 2u;
public const val `GPO_OPTION_DISABLE_USER`: `GPO_OPTIONS` = 1u;
public typealias `GPO_SECTION` = UInt;
public const val `GPO_SECTION_MACHINE`: `GPO_SECTION` = 2u;
public const val `GPO_SECTION_ROOT`: `GPO_SECTION` = 0u;
public const val `GPO_SECTION_USER`: `GPO_SECTION` = 1u;
// UNSUPPORTED Rust 181:1: non-scalar type Ptr unsupported
// pub const GP_DLLNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("DllName");

// UNSUPPORTED Rust 182:1: non-scalar type Ptr unsupported
// pub const GP_ENABLEASYNCHRONOUSPROCESSING: windows_sys::core::PCWSTR = windows_sys::core::w!("EnableAsynchronousProcessing");

// UNSUPPORTED Rust 183:1: non-scalar type Ptr unsupported
// pub const GP_MAXNOGPOLISTCHANGESINTERVAL: windows_sys::core::PCWSTR = windows_sys::core::w!("MaxNoGPOListChangesInterval");

// UNSUPPORTED Rust 184:1: non-scalar type Ptr unsupported
// pub const GP_NOBACKGROUNDPOLICY: windows_sys::core::PCWSTR = windows_sys::core::w!("NoBackgroundPolicy");

// UNSUPPORTED Rust 185:1: non-scalar type Ptr unsupported
// pub const GP_NOGPOLISTCHANGES: windows_sys::core::PCWSTR = windows_sys::core::w!("NoGPOListChanges");

// UNSUPPORTED Rust 186:1: non-scalar type Ptr unsupported
// pub const GP_NOMACHINEPOLICY: windows_sys::core::PCWSTR = windows_sys::core::w!("NoMachinePolicy");

// UNSUPPORTED Rust 187:1: non-scalar type Ptr unsupported
// pub const GP_NOSLOWLINK: windows_sys::core::PCWSTR = windows_sys::core::w!("NoSlowLink");

// UNSUPPORTED Rust 188:1: non-scalar type Ptr unsupported
// pub const GP_NOTIFYLINKTRANSITION: windows_sys::core::PCWSTR = windows_sys::core::w!("NotifyLinkTransition");

// UNSUPPORTED Rust 189:1: non-scalar type Ptr unsupported
// pub const GP_NOUSERPOLICY: windows_sys::core::PCWSTR = windows_sys::core::w!("NoUserPolicy");

// UNSUPPORTED Rust 190:1: non-scalar type Ptr unsupported
// pub const GP_PERUSERLOCALSETTINGS: windows_sys::core::PCWSTR = windows_sys::core::w!("PerUserLocalSettings");

// UNSUPPORTED Rust 191:1: non-scalar type Ptr unsupported
// pub const GP_PROCESSGROUPPOLICY: windows_sys::core::PCWSTR = windows_sys::core::w!("ProcessGroupPolicy");

// UNSUPPORTED Rust 192:1: non-scalar type Ptr unsupported
// pub const GP_REQUIRESSUCCESSFULREGISTRY: windows_sys::core::PCWSTR = windows_sys::core::w!("RequiresSuccessfulRegistry");

public typealias `GROUP_POLICY_HINT_TYPE` = Int;
// UNSUPPORTED Rust 194:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct GROUP_POLICY_OBJECTA {
//     pub dwOptions: u32,
//     pub dwVersion: u32,
//     pub lpDSPath: windows_sys::core::PSTR,
//     pub lpFileSysPath: windows_sys::core::PSTR,
//     pub lpDisplayName: windows_sys::core::PSTR,
//     pub szGPOName: [i8; 50],
//     pub GPOLink: GPO_LINK,
//     pub lParam: super::super::Foundation::LPARAM,
//     pub pNext: *mut GROUP_POLICY_OBJECTA,
//     pub pPrev: *mut GROUP_POLICY_OBJECTA,
//     pub lpExtensions: windows_sys::core::PSTR,
//     pub lParam2: super::super::Foundation::LPARAM,
//     pub lpLink: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 211:1: declaration Impl has no candidate rule
// impl Default for GROUP_POLICY_OBJECTA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 216:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct GROUP_POLICY_OBJECTW {
//     pub dwOptions: u32,
//     pub dwVersion: u32,
//     pub lpDSPath: windows_sys::core::PWSTR,
//     pub lpFileSysPath: windows_sys::core::PWSTR,
//     pub lpDisplayName: windows_sys::core::PWSTR,
//     pub szGPOName: [u16; 50],
//     pub GPOLink: GPO_LINK,
//     pub lParam: super::super::Foundation::LPARAM,
//     pub pNext: *mut GROUP_POLICY_OBJECTW,
//     pub pPrev: *mut GROUP_POLICY_OBJECTW,
//     pub lpExtensions: windows_sys::core::PWSTR,
//     pub lParam2: super::super::Foundation::LPARAM,
//     pub lpLink: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 233:1: declaration Impl has no candidate rule
// impl Default for GROUP_POLICY_OBJECTW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `GROUP_POLICY_OBJECT_TYPE` = Int;
// UNSUPPORTED Rust 239:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GROUP_POLICY_TRIGGER_EVENT_PROVIDER_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbd2f4252_5e1e_49fc_9a30_f3978ad89ee2);

// UNSUPPORTED Rust 240:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct INSTALLDATA {
//     pub Type: INSTALLSPECTYPE,
//     pub Spec: INSTALLSPEC,
// }

// UNSUPPORTED Rust 246:1: declaration Impl has no candidate rule
// impl Default for INSTALLDATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 251:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union INSTALLSPEC {
//     pub AppName: INSTALLSPEC_0,
//     pub FileExt: windows_sys::core::PWSTR,
//     pub ProgId: windows_sys::core::PWSTR,
//     pub COMClass: INSTALLSPEC_1,
// }

// UNSUPPORTED Rust 259:1: declaration Impl has no candidate rule
// impl Default for INSTALLSPEC {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 264:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct INSTALLSPEC_0 {
//     pub Name: windows_sys::core::PWSTR,
//     pub GPOId: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 270:1: declaration Impl has no candidate rule
// impl Default for INSTALLSPEC_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 275:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct INSTALLSPEC_1 {
//     pub Clsid: windows_sys::core::GUID,
//     pub ClsCtx: u32,
// }

public typealias `INSTALLSPECTYPE` = Int;
// UNSUPPORTED Rust 282:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct LOCALMANAGEDAPPLICATION {
//     pub pszDeploymentName: windows_sys::core::PWSTR,
//     pub pszPolicyName: windows_sys::core::PWSTR,
//     pub pszProductId: windows_sys::core::PWSTR,
//     pub dwState: u32,
// }

// UNSUPPORTED Rust 290:1: declaration Impl has no candidate rule
// impl Default for LOCALMANAGEDAPPLICATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `LOCALSTATE_ASSIGNED`: UInt = 1u;
public const val `LOCALSTATE_ORPHANED`: UInt = 32u;
public const val `LOCALSTATE_POLICYREMOVE_ORPHAN`: UInt = 8u;
public const val `LOCALSTATE_POLICYREMOVE_UNINSTALL`: UInt = 16u;
public const val `LOCALSTATE_PUBLISHED`: UInt = 2u;
public const val `LOCALSTATE_UNINSTALLED`: UInt = 64u;
public const val `LOCALSTATE_UNINSTALL_UNMANAGED`: UInt = 4u;
// UNSUPPORTED Rust 302:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const MACHINE_POLICY_PRESENT_TRIGGER_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x659fcae6_5bdb_4da9_b1ff_ca2a178d46e0);

// UNSUPPORTED Rust 303:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MANAGEDAPPLICATION {
//     pub pszPackageName: windows_sys::core::PWSTR,
//     pub pszPublisher: windows_sys::core::PWSTR,
//     pub dwVersionHi: u32,
//     pub dwVersionLo: u32,
//     pub dwRevision: u32,
//     pub GpoId: windows_sys::core::GUID,
//     pub pszPolicyName: windows_sys::core::PWSTR,
//     pub ProductId: windows_sys::core::GUID,
//     pub Language: u16,
//     pub pszOwner: windows_sys::core::PWSTR,
//     pub pszCompany: windows_sys::core::PWSTR,
//     pub pszComments: windows_sys::core::PWSTR,
//     pub pszContact: windows_sys::core::PWSTR,
//     pub pszSupportUrl: windows_sys::core::PWSTR,
//     pub dwPathType: u32,
//     pub bInstalled: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 323:1: declaration Impl has no candidate rule
// impl Default for MANAGEDAPPLICATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MANAGED_APPS_FROMCATEGORY`: UInt = 2u;
public const val `MANAGED_APPS_INFOLEVEL_DEFAULT`: UInt = 65536u;
public const val `MANAGED_APPS_USERAPPLICATIONS`: UInt = 1u;
public const val `MANAGED_APPTYPE_SETUPEXE`: UInt = 2u;
public const val `MANAGED_APPTYPE_UNSUPPORTED`: UInt = 3u;
public const val `MANAGED_APPTYPE_WINDOWSINSTALLER`: UInt = 1u;
// UNSUPPORTED Rust 334:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const NODEID_Machine: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8fc0b737_a0e1_11d1_a7d3_0000f87571e3);

// UNSUPPORTED Rust 335:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const NODEID_MachineSWSettings: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8fc0b73a_a0e1_11d1_a7d3_0000f87571e3);

// UNSUPPORTED Rust 336:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const NODEID_RSOPMachine: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbd4c1a2e_0b7a_4a62_a6b0_c0577539c97e);

// UNSUPPORTED Rust 337:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const NODEID_RSOPMachineSWSettings: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6a76273e_eb8e_45db_94c5_25663a5f2c1a);

// UNSUPPORTED Rust 338:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const NODEID_RSOPUser: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xab87364f_0cec_4cd8_9bf8_898f34628fb8);

// UNSUPPORTED Rust 339:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const NODEID_RSOPUserSWSettings: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe52c5ce3_fd27_4402_84de_d9a5f2858910);

// UNSUPPORTED Rust 340:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const NODEID_User: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8fc0b738_a0e1_11d1_a7d3_0000f87571e3);

// UNSUPPORTED Rust 341:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const NODEID_UserSWSettings: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8fc0b73c_a0e1_11d1_a7d3_0000f87571e3);

// UNSUPPORTED Rust 342:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Wmi"))]
// pub type PFNGENERATEGROUPPOLICY = Option<unsafe extern "system" fn(dwflags: u32, pbabort: *mut windows_sys::core::BOOL, pwszsite: windows_sys::core::PCWSTR, pcomputertarget: *const RSOP_TARGET, pusertarget: *const RSOP_TARGET) -> u32>;

// UNSUPPORTED Rust 344:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Registry")]
// pub type PFNPROCESSGROUPPOLICY = Option<unsafe extern "system" fn(dwflags: u32, htoken: super::super::Foundation::HANDLE, hkeyroot: super::Registry::HKEY, pdeletedgpolist: *const GROUP_POLICY_OBJECTA, pchangedgpolist: *const GROUP_POLICY_OBJECTA, phandle: usize, pbabort: *mut windows_sys::core::BOOL, pstatuscallback: PFNSTATUSMESSAGECALLBACK) -> u32>;

// UNSUPPORTED Rust 346:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Win32_System_Registry", feature = "Win32_System_Wmi"))]
// pub type PFNPROCESSGROUPPOLICYEX = Option<unsafe extern "system" fn(dwflags: u32, htoken: super::super::Foundation::HANDLE, hkeyroot: super::Registry::HKEY, pdeletedgpolist: *const GROUP_POLICY_OBJECTA, pchangedgpolist: *const GROUP_POLICY_OBJECTA, phandle: usize, pbabort: *mut windows_sys::core::BOOL, pstatuscallback: PFNSTATUSMESSAGECALLBACK, pwbemservices: *mut core::ffi::c_void, prsopstatus: *mut windows_sys::core::HRESULT) -> u32>;

// UNSUPPORTED Rust 348:1: generic scalar type unsupported
// pub type PFNSTATUSMESSAGECALLBACK = Option<unsafe extern "system" fn(bverbose: windows_sys::core::BOOL, lpmessage: windows_sys::core::PCWSTR) -> u32>;

public const val `PI_APPLYPOLICY`: UInt = 2u;
public const val `PI_NOUI`: UInt = 1u;
// UNSUPPORTED Rust 351:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct POLICYSETTINGSTATUSINFO {
//     pub szKey: windows_sys::core::PWSTR,
//     pub szEventSource: windows_sys::core::PWSTR,
//     pub szEventLogName: windows_sys::core::PWSTR,
//     pub dwEventID: u32,
//     pub dwErrorCode: u32,
//     pub status: SETTINGSTATUS,
//     pub timeLogged: super::super::Foundation::SYSTEMTIME,
// }

// UNSUPPORTED Rust 362:1: declaration Impl has no candidate rule
// impl Default for POLICYSETTINGSTATUSINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PROGID`: `INSTALLSPECTYPE` = 3;
public const val `PT_MANDATORY`: UInt = 4u;
public const val `PT_ROAMING`: UInt = 2u;
public const val `PT_ROAMING_PREEXISTING`: UInt = 8u;
public const val `PT_TEMPORARY`: UInt = 1u;
public const val `PUBLISHED`: `APPSTATE` = 2;
// UNSUPPORTED Rust 373:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const REGISTRY_EXTENSION_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x35378eac_683f_11d2_a89a_00c04fbbcfa2);

public const val `RP_FORCE`: UInt = 1u;
public const val `RP_SYNC`: UInt = 2u;
public const val `RSOPApplied`: `SETTINGSTATUS` = 1;
public const val `RSOPFailed`: `SETTINGSTATUS` = 3;
public const val `RSOPIgnored`: `SETTINGSTATUS` = 2;
public const val `RSOPSubsettingFailed`: `SETTINGSTATUS` = 4;
public const val `RSOPUnspecified`: `SETTINGSTATUS` = 0;
public const val `RSOP_COMPUTER_ACCESS_DENIED`: UInt = 2u;
public const val `RSOP_INFO_FLAG_DIAGNOSTIC_MODE`: UInt = 1u;
public const val `RSOP_NO_COMPUTER`: UInt = 65536u;
public const val `RSOP_NO_USER`: UInt = 131072u;
public const val `RSOP_PLANNING_ASSUME_COMP_WQLFILTER_TRUE`: UInt = 16u;
public const val `RSOP_PLANNING_ASSUME_LOOPBACK_MERGE`: UInt = 2u;
public const val `RSOP_PLANNING_ASSUME_LOOPBACK_REPLACE`: UInt = 4u;
public const val `RSOP_PLANNING_ASSUME_SLOW_LINK`: UInt = 1u;
public const val `RSOP_PLANNING_ASSUME_USER_WQLFILTER_TRUE`: UInt = 8u;
// UNSUPPORTED Rust 390:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Wmi"))]
// #[derive(Clone, Copy)]
// pub struct RSOP_TARGET {
//     pub pwszAccountName: windows_sys::core::PWSTR,
//     pub pwszNewSOM: windows_sys::core::PWSTR,
//     pub psaSecurityGroups: *mut super::Com::SAFEARRAY,
//     pub pRsopToken: *mut core::ffi::c_void,
//     pub pGPOList: *mut GROUP_POLICY_OBJECTA,
//     pub pWbemServices: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 401:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Wmi"))]
// impl Default for RSOP_TARGET {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `RSOP_TEMPNAMESPACE_EXISTS`: UInt = 4u;
public const val `RSOP_USER_ACCESS_DENIED`: UInt = 1u;
public typealias `SETTINGSTATUS` = Int;
// UNSUPPORTED Rust 410:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const USER_POLICY_PRESENT_TRIGGER_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x54fb46c8_f089_464c_b1fd_59d1b62c3b50);

public const val `backupMostRecent`: `GPMSearchProperty` = 9;
public const val `gpoComputerExtensions`: `GPMSearchProperty` = 5;
public const val `gpoDisplayName`: `GPMSearchProperty` = 2;
public const val `gpoDomain`: `GPMSearchProperty` = 8;
public const val `gpoEffectivePermissions`: `GPMSearchProperty` = 1;
public const val `gpoID`: `GPMSearchProperty` = 4;
public const val `gpoPermissions`: `GPMSearchProperty` = 0;
public const val `gpoUserExtensions`: `GPMSearchProperty` = 6;
public const val `gpoWMIFilter`: `GPMSearchProperty` = 3;
public const val `opContains`: `GPMSearchOperation` = 1;
public const val `opDestinationByRelativeName`: `GPMDestinationOption` = 2;
public const val `opDestinationNone`: `GPMDestinationOption` = 1;
public const val `opDestinationSameAsSource`: `GPMDestinationOption` = 0;
public const val `opDestinationSet`: `GPMDestinationOption` = 3;
public const val `opEquals`: `GPMSearchOperation` = 0;
public const val `opNotContains`: `GPMSearchOperation` = 2;
public const val `opNotEquals`: `GPMSearchOperation` = 3;
public const val `opReportComments`: `GPMReportingOptions` = 1;
public const val `opReportLegacy`: `GPMReportingOptions` = 0;
public const val `permGPOApply`: `GPMPermissionType` = 65536;
public const val `permGPOCustom`: `GPMPermissionType` = 65795;
public const val `permGPOEdit`: `GPMPermissionType` = 65793;
public const val `permGPOEditSecurityAndDelete`: `GPMPermissionType` = 65794;
public const val `permGPORead`: `GPMPermissionType` = 65792;
public const val `permSOMGPOCreate`: `GPMPermissionType` = 1049600;
public const val `permSOMLink`: `GPMPermissionType` = 1835008;
public const val `permSOMLogging`: `GPMPermissionType` = 1573120;
public const val `permSOMPlanning`: `GPMPermissionType` = 1573376;
public const val `permSOMStarterGPOCreate`: `GPMPermissionType` = 1049856;
public const val `permSOMWMICreate`: `GPMPermissionType` = 1049344;
public const val `permSOMWMIFullControl`: `GPMPermissionType` = 1049345;
public const val `permStarterGPOCustom`: `GPMPermissionType` = 197891;
public const val `permStarterGPOEdit`: `GPMPermissionType` = 197889;
public const val `permStarterGPOFullControl`: `GPMPermissionType` = 197890;
public const val `permStarterGPORead`: `GPMPermissionType` = 197888;
public const val `permWMIFilterCustom`: `GPMPermissionType` = 131074;
public const val `permWMIFilterEdit`: `GPMPermissionType` = 131072;
public const val `permWMIFilterFullControl`: `GPMPermissionType` = 131073;
public const val `repClientHealthRefreshXML`: `GPMReportType` = 5;
public const val `repClientHealthXML`: `GPMReportType` = 4;
public const val `repHTML`: `GPMReportType` = 1;
public const val `repInfraRefreshXML`: `GPMReportType` = 3;
public const val `repInfraXML`: `GPMReportType` = 2;
public const val `repXML`: `GPMReportType` = 0;
public const val `rsopLogging`: `GPMRSOPMode` = 2;
public const val `rsopPlanning`: `GPMRSOPMode` = 1;
public const val `rsopUnknown`: `GPMRSOPMode` = 0;
public const val `somDomain`: `GPMSOMType` = 1;
public const val `somLinks`: `GPMSearchProperty` = 7;
public const val `somOU`: `GPMSOMType` = 2;
public const val `somSite`: `GPMSOMType` = 0;
public const val `starterGPODisplayName`: `GPMSearchProperty` = 12;
public const val `starterGPODomain`: `GPMSearchProperty` = 14;
public const val `starterGPOEffectivePermissions`: `GPMSearchProperty` = 11;
public const val `starterGPOID`: `GPMSearchProperty` = 13;
public const val `starterGPOPermissions`: `GPMSearchProperty` = 10;
public const val `typeComputer`: `GPMEntryType` = 1;
public const val `typeCustom`: `GPMStarterGPOType` = 1;
public const val `typeGPO`: `GPMBackupType` = 0;
public const val `typeGlobalGroup`: `GPMEntryType` = 3;
public const val `typeLocalGroup`: `GPMEntryType` = 2;
public const val `typeStarterGPO`: `GPMBackupType` = 1;
public const val `typeSystem`: `GPMStarterGPOType` = 0;
public const val `typeUNCPath`: `GPMEntryType` = 5;
public const val `typeUniversalGroup`: `GPMEntryType` = 4;
public const val `typeUnknown`: `GPMEntryType` = 6;
public const val `typeUser`: `GPMEntryType` = 0;
