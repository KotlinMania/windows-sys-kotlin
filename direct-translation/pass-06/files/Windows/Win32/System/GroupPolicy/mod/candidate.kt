// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gpedit.dll, ABI=system, export=BrowseForGPO; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `BrowseForGPO`(`lpbrowseinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GPOBROWSEINFO`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=CommandLineFromMsiDescriptor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CommandLineFromMsiDescriptor`(`descriptor` : `windows_sys`.`core`.`PCWSTR`, `commandline` : `windows_sys`.`core`.`PWSTR`, `commandlinelength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gpedit.dll, ABI=system, export=CreateGPOLink; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateGPOLink`(`lpgpo` : `windows_sys`.`core`.`PCWSTR`, `lpcontainer` : `windows_sys`.`core`.`PCWSTR`, `fhighpriority` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gpedit.dll, ABI=system, export=DeleteAllGPOLinks; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeleteAllGPOLinks`(`lpcontainer` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gpedit.dll, ABI=system, export=DeleteGPOLink; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeleteGPOLink`(`lpgpo` : `windows_sys`.`core`.`PCWSTR`, `lpcontainer` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=userenv.dll, ABI=system, export=EnterCriticalPolicySection; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnterCriticalPolicySection`(`bmachine` : `windows_sys`.`core`.`BOOL`) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gpedit.dll, ABI=system, export=ExportRSoPData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ExportRSoPData`(`lpnamespace` : `windows_sys`.`core`.`PCWSTR`, `lpfilename` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=userenv.dll, ABI=system, export=FreeGPOListA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FreeGPOListA`(`pgpolist` : /* Rust *const */ kotlinx.cinterop.CPointer<`GROUP_POLICY_OBJECTA`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=userenv.dll, ABI=system, export=FreeGPOListW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FreeGPOListW`(`pgpolist` : /* Rust *const */ kotlinx.cinterop.CPointer<`GROUP_POLICY_OBJECTW`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=userenv.dll, ABI=system, export=GenerateGPNotification; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GenerateGPNotification`(`bmachine` : `windows_sys`.`core`.`BOOL`, `lpwszmgmtproduct` : `windows_sys`.`core`.`PCWSTR`, `dwmgmtproductoptions` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=userenv.dll, ABI=system, export=GetAppliedGPOListA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `GetAppliedGPOListA`(`dwflags` : UInt, `pmachinename` : `windows_sys`.`core`.`PCSTR`, `psiduser` : `super`.`super`.`Security`.`PSID`, `pguidextension` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ppgpolist` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GROUP_POLICY_OBJECTA`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=userenv.dll, ABI=system, export=GetAppliedGPOListW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `GetAppliedGPOListW`(`dwflags` : UInt, `pmachinename` : `windows_sys`.`core`.`PCWSTR`, `psiduser` : `super`.`super`.`Security`.`PSID`, `pguidextension` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ppgpolist` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GROUP_POLICY_OBJECTW`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=userenv.dll, ABI=system, export=GetGPOListA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetGPOListA`(`htoken` : `super`.`super`.`Foundation`.`HANDLE`, `lpname` : `windows_sys`.`core`.`PCSTR`, `lphostname` : `windows_sys`.`core`.`PCSTR`, `lpcomputername` : `windows_sys`.`core`.`PCSTR`, `dwflags` : UInt, `pgpolist` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GROUP_POLICY_OBJECTA`>>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=userenv.dll, ABI=system, export=GetGPOListW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetGPOListW`(`htoken` : `super`.`super`.`Foundation`.`HANDLE`, `lpname` : `windows_sys`.`core`.`PCWSTR`, `lphostname` : `windows_sys`.`core`.`PCWSTR`, `lpcomputername` : `windows_sys`.`core`.`PCWSTR`, `dwflags` : UInt, `pgpolist` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GROUP_POLICY_OBJECTW`>>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=GetLocalManagedApplicationData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetLocalManagedApplicationData`(`productcode` : `windows_sys`.`core`.`PCWSTR`, `displayname` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?, `supporturl` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=GetLocalManagedApplications; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetLocalManagedApplications`(`buserapps` : `windows_sys`.`core`.`BOOL`, `pdwapps` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `prglocalapps` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`LOCALMANAGEDAPPLICATION`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=GetManagedApplicationCategories; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_Shell")]
public external fun `GetManagedApplicationCategories`(`dwreserved` : UInt, `pappcategory` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`UI`.`Shell`.`APPCATEGORYINFOLIST`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=GetManagedApplications; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetManagedApplications`(`pcategory` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `dwqueryflags` : UInt, `dwinfolevel` : UInt, `pdwapps` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `prgmanagedapps` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`MANAGEDAPPLICATION`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gpedit.dll, ABI=system, export=ImportRSoPData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImportRSoPData`(`lpnamespace` : `windows_sys`.`core`.`PCWSTR`, `lpfilename` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=InstallApplication; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InstallApplication`(`pinstallinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`INSTALLDATA`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=userenv.dll, ABI=system, export=LeaveCriticalPolicySection; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LeaveCriticalPolicySection`(`hsection` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=userenv.dll, ABI=system, export=ProcessGroupPolicyCompleted; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ProcessGroupPolicyCompleted`(`extensionid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `pasynchandle` : ULong, `dwstatus` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=userenv.dll, ABI=system, export=ProcessGroupPolicyCompletedEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ProcessGroupPolicyCompletedEx`(`extensionid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `pasynchandle` : ULong, `dwstatus` : UInt, `rsopstatus` : `windows_sys`.`core`.`HRESULT`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=userenv.dll, ABI=system, export=RefreshPolicy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RefreshPolicy`(`bmachine` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=userenv.dll, ABI=system, export=RefreshPolicyEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RefreshPolicyEx`(`bmachine` : `windows_sys`.`core`.`BOOL`, `dwoptions` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=userenv.dll, ABI=system, export=RegisterGPNotification; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegisterGPNotification`(`hevent` : `super`.`super`.`Foundation`.`HANDLE`, `bmachine` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=userenv.dll, ABI=system, export=RsopAccessCheckByType; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `RsopAccessCheckByType`(`psecuritydescriptor` : `super`.`super`.`Security`.`PSECURITY_DESCRIPTOR`, `pprincipalselfsid` : `super`.`super`.`Security`.`PSID`, `prsoptoken` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwdesiredaccessmask` : UInt, `pobjecttypelist` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`OBJECT_TYPE_LIST`>?, `objecttypelistlength` : UInt, `pgenericmapping` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`GENERIC_MAPPING`>?, `pprivilegeset` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`PRIVILEGE_SET`>?, `pdwprivilegesetlength` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pdwgrantedaccessmask` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pbaccessstatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=userenv.dll, ABI=system, export=RsopFileAccessCheck; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RsopFileAccessCheck`(`pszfilename` : `windows_sys`.`core`.`PCWSTR`, `prsoptoken` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwdesiredaccessmask` : UInt, `pdwgrantedaccessmask` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pbaccessstatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=userenv.dll, ABI=system, export=RsopResetPolicySettingStatus; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Wmi")]
public external fun `RsopResetPolicySettingStatus`(`dwflags` : UInt, `pservices` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `psettinginstance` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=userenv.dll, ABI=system, export=RsopSetPolicySettingStatus; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Wmi")]
public external fun `RsopSetPolicySettingStatus`(`dwflags` : UInt, `pservices` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `psettinginstance` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ninfo` : UInt, `pstatus` : /* Rust *const */ kotlinx.cinterop.CPointer<`POLICYSETTINGSTATUSINFO`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=UninstallApplication; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UninstallApplication`(`productcode` : `windows_sys`.`core`.`PCWSTR`, `dwstatus` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=userenv.dll, ABI=system, export=UnregisterGPNotification; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UnregisterGPNotification`(`hevent` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
public const val `ABSENT`: `APPSTATE` = 0;
// UNSUPPORTED Rust 40:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const ADMXCOMMENTS_EXTENSION_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6c5a2a86_9eb3_42b9_aa83_a7371ba011b9);

public const val `APPNAME`: `INSTALLSPECTYPE` = 1;
public typealias `APPSTATE` = Int;
public const val `ASSIGNED`: `APPSTATE` = 1;
// UNSUPPORTED Rust 44:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CLSID_GPESnapIn: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8fc0b734_a0e1_11d1_a7d3_0000f87571e3);

// UNSUPPORTED Rust 45:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CLSID_GroupPolicyObject: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xea502722_a23d_11d1_a7d3_0000f87571e3);

// UNSUPPORTED Rust 46:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
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
// UNSUPPORTED Rust 71:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GPM: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf5694708_88fe_4b35_babf_e56162d5fbc8);

// UNSUPPORTED Rust 72:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GPMAsyncCancel: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x372796a9_76ec_479d_ad6c_556318ed5f9d);

// UNSUPPORTED Rust 73:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GPMBackup: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xed1a54b8_5efa_482a_93c0_8ad86f0d68c3);

// UNSUPPORTED Rust 74:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GPMBackupCollection: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xeb8f035b_70db_4a9f_9676_37c25994e9dc);

// UNSUPPORTED Rust 75:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GPMBackupDir: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfce4a59d_0f21_4afa_b859_e6d0c62cd10c);

// UNSUPPORTED Rust 76:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GPMBackupDirEx: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe8c0988a_cf03_4c5b_8be2_2aa9ad32aada);

public typealias `GPMBackupType` = Int;
// UNSUPPORTED Rust 78:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GPMCSECollection: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcf92b828_2d44_4b61_b10a_b327afd42da8);

// UNSUPPORTED Rust 79:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GPMClientSideExtension: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc1a2e70e_659c_4b1a_940b_f88b0af9c8a4);

// UNSUPPORTED Rust 80:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GPMConstants: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3855e880_cd9e_4d0c_9eaf_1579283a1888);

public typealias `GPMDestinationOption` = Int;
// UNSUPPORTED Rust 82:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GPMDomain: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x710901be_1050_4cb1_838a_c5cff259e183);

public typealias `GPMEntryType` = Int;
// UNSUPPORTED Rust 84:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GPMGPO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd2ce2994_59b5_4064_b581_4d68486a16c4);

// UNSUPPORTED Rust 85:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GPMGPOCollection: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7a057325_832d_4de3_a41f_c780436a4e09);

// UNSUPPORTED Rust 86:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GPMGPOLink: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc1df9880_5303_42c6_8a3c_0488e1bf7364);

// UNSUPPORTED Rust 87:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GPMGPOLinksCollection: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf6ed581a_49a5_47e2_b771_fd8dc02b6259);

// UNSUPPORTED Rust 88:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GPMMapEntry: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8c975253_5431_4471_b35d_0626c928258a);

// UNSUPPORTED Rust 89:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GPMMapEntryCollection: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cf75d5b_a3a1_4c55_b4fe_9e149c41f66d);

// UNSUPPORTED Rust 90:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GPMMigrationTable: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x55af4043_2a06_4f72_abef_631b44079c76);

// UNSUPPORTED Rust 91:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GPMPermission: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5871a40a_e9c0_46ec_913e_944ef9225a94);

public typealias `GPMPermissionType` = Int;
// UNSUPPORTED Rust 93:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GPMRSOP: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x489b0caf_9ec2_4eb7_91f5_b6f71d43da8c);

public typealias `GPMRSOPMode` = Int;
public typealias `GPMReportType` = Int;
public typealias `GPMReportingOptions` = Int;
// UNSUPPORTED Rust 97:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GPMResult: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x92101ac0_9287_4206_a3b2_4bdb73d225f6);

// UNSUPPORTED Rust 98:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GPMSOM: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x32d93fac_450e_44cf_829c_8b22ff6bdae1);

// UNSUPPORTED Rust 99:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GPMSOMCollection: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x24c1f147_3720_4f5b_a9c3_06b4e4f931d2);

public typealias `GPMSOMType` = Int;
// UNSUPPORTED Rust 101:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GPMSearchCriteria: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x17aaca26_5ce0_44fa_8cc0_5259e6483566);

public typealias `GPMSearchOperation` = Int;
public typealias `GPMSearchProperty` = Int;
// UNSUPPORTED Rust 104:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GPMSecurityInfo: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x547a5e8f_9162_4516_a4df_9ddb9686d846);

// UNSUPPORTED Rust 105:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GPMSitesContainer: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x229f5c42_852c_4b30_945f_c522be9bd386);

// UNSUPPORTED Rust 106:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GPMStarterGPOBackup: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x389e400a_d8ef_455b_a861_5f9ca34a6a02);

// UNSUPPORTED Rust 107:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GPMStarterGPOBackupCollection: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe75ea59d_1aeb_4cb5_a78a_281daa582406);

// UNSUPPORTED Rust 108:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GPMStarterGPOCollection: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x82f8aa8b_49ba_43b2_956e_3397f9b94c3a);

public typealias `GPMStarterGPOType` = Int;
// UNSUPPORTED Rust 110:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GPMStatusMessage: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4b77cc94_d255_409b_bc62_370881715a19);

// UNSUPPORTED Rust 111:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GPMStatusMsgCollection: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2824e4be_4bcc_4cac_9e60_0e3ed7f12496);

// UNSUPPORTED Rust 112:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GPMTemplate: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xecf1d454_71da_4e2f_a8c0_8185465911d9);

// UNSUPPORTED Rust 113:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GPMTrustee: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc54a700d_19b6_4211_bcb0_e8e2475e471e);

// UNSUPPORTED Rust 114:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GPMWMIFilter: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x626745d8_0dea_4062_bf60_cfc5b1ca1286);

// UNSUPPORTED Rust 115:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GPMWMIFilterCollection: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x74dc6d28_e820_47d6_a0b8_f08d93d7fa33);

public const val `GPM_DONOTUSE_W2KDC`: UInt = 2u;
public const val `GPM_DONOT_VALIDATEDC`: UInt = 1u;
public const val `GPM_MIGRATIONTABLE_ONLY`: UInt = 1u;
public const val `GPM_PROCESS_SECURITY`: UInt = 2u;
public const val `GPM_USE_ANYDC`: UInt = 1u;
public const val `GPM_USE_PDC`: UInt = 0u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `GPOBROWSEINFO` (
    public var `dwSize`: UInt,
    public var `dwFlags`: UInt,
    public var `hwndOwner`: `super`.`super`.`Foundation`.`HWND`,
    public var `lpTitle`: `windows_sys`.`core`.`PWSTR`,
    public var `lpInitialOU`: `windows_sys`.`core`.`PWSTR`,
    public var `lpDSPath`: `windows_sys`.`core`.`PWSTR`,
    public var `dwDSPathSize`: UInt,
    public var `lpName`: `windows_sys`.`core`.`PWSTR`,
    public var `dwNameSize`: UInt,
    public var `gpoType`: `GROUP_POLICY_OBJECT_TYPE`,
    public var `gpoHint`: `GROUP_POLICY_HINT_TYPE`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `GPOBROWSEINFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `GPOBROWSEINFO`.Companion.`default`() : `GPOBROWSEINFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `GP_DLLNAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DllName");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `GP_ENABLEASYNCHRONOUSPROCESSING`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("EnableAsynchronousProcessing");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `GP_MAXNOGPOLISTCHANGESINTERVAL`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("MaxNoGPOListChangesInterval");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `GP_NOBACKGROUNDPOLICY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("NoBackgroundPolicy");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `GP_NOGPOLISTCHANGES`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("NoGPOListChanges");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `GP_NOMACHINEPOLICY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("NoMachinePolicy");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `GP_NOSLOWLINK`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("NoSlowLink");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `GP_NOTIFYLINKTRANSITION`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("NotifyLinkTransition");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `GP_NOUSERPOLICY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("NoUserPolicy");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `GP_PERUSERLOCALSETTINGS`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("PerUserLocalSettings");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `GP_PROCESSGROUPPOLICY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("ProcessGroupPolicy");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `GP_REQUIRESSUCCESSFULREGISTRY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RequiresSuccessfulRegistry");
public typealias `GROUP_POLICY_HINT_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 50 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `GROUP_POLICY_OBJECTA` (
    public var `dwOptions`: UInt,
    public var `dwVersion`: UInt,
    public var `lpDSPath`: `windows_sys`.`core`.`PSTR`,
    public var `lpFileSysPath`: `windows_sys`.`core`.`PSTR`,
    public var `lpDisplayName`: `windows_sys`.`core`.`PSTR`,
    public var `szGPOName`: ByteArray,
    public var `GPOLink`: `GPO_LINK`,
    public var `lParam`: `super`.`super`.`Foundation`.`LPARAM`,
    public var `pNext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`GROUP_POLICY_OBJECTA`>?,
    public var `pPrev`: /* Rust *mut */ kotlinx.cinterop.CPointer<`GROUP_POLICY_OBJECTA`>?,
    public var `lpExtensions`: `windows_sys`.`core`.`PSTR`,
    public var `lParam2`: `super`.`super`.`Foundation`.`LPARAM`,
    public var `lpLink`: `windows_sys`.`core`.`PSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `GROUP_POLICY_OBJECTA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `GROUP_POLICY_OBJECTA`.Companion.`default`() : `GROUP_POLICY_OBJECTA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 50 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `GROUP_POLICY_OBJECTW` (
    public var `dwOptions`: UInt,
    public var `dwVersion`: UInt,
    public var `lpDSPath`: `windows_sys`.`core`.`PWSTR`,
    public var `lpFileSysPath`: `windows_sys`.`core`.`PWSTR`,
    public var `lpDisplayName`: `windows_sys`.`core`.`PWSTR`,
    public var `szGPOName`: UShortArray,
    public var `GPOLink`: `GPO_LINK`,
    public var `lParam`: `super`.`super`.`Foundation`.`LPARAM`,
    public var `pNext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`GROUP_POLICY_OBJECTW`>?,
    public var `pPrev`: /* Rust *mut */ kotlinx.cinterop.CPointer<`GROUP_POLICY_OBJECTW`>?,
    public var `lpExtensions`: `windows_sys`.`core`.`PWSTR`,
    public var `lParam2`: `super`.`super`.`Foundation`.`LPARAM`,
    public var `lpLink`: `windows_sys`.`core`.`PWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `GROUP_POLICY_OBJECTW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `GROUP_POLICY_OBJECTW`.Companion.`default`() : `GROUP_POLICY_OBJECTW` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `GROUP_POLICY_OBJECT_TYPE` = Int;
// UNSUPPORTED Rust 239:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GROUP_POLICY_TRIGGER_EVENT_PROVIDER_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbd2f4252_5e1e_49fc_9a30_f3978ad89ee2);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `INSTALLDATA` (
    public var `Type`: `INSTALLSPECTYPE`,
    public var `Spec`: `INSTALLSPEC`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `INSTALLDATA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `INSTALLDATA`.Companion.`default`() : `INSTALLDATA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 251:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union INSTALLSPEC {
//     pub AppName: INSTALLSPEC_0,
//     pub FileExt: windows_sys::core::PWSTR,
//     pub ProgId: windows_sys::core::PWSTR,
//     pub COMClass: INSTALLSPEC_1,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `INSTALLSPEC`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `INSTALLSPEC`.Companion.`default`() : `INSTALLSPEC` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `INSTALLSPEC_0` (
    public var `Name`: `windows_sys`.`core`.`PWSTR`,
    public var `GPOId`: `windows_sys`.`core`.`GUID`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `INSTALLSPEC_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `INSTALLSPEC_0`.Companion.`default`() : `INSTALLSPEC_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `INSTALLSPEC_1` (
    public var `Clsid`: `windows_sys`.`core`.`GUID`,
    public var `ClsCtx`: UInt,
)
public typealias `INSTALLSPECTYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LOCALMANAGEDAPPLICATION` (
    public var `pszDeploymentName`: `windows_sys`.`core`.`PWSTR`,
    public var `pszPolicyName`: `windows_sys`.`core`.`PWSTR`,
    public var `pszProductId`: `windows_sys`.`core`.`PWSTR`,
    public var `dwState`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `LOCALMANAGEDAPPLICATION`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `LOCALMANAGEDAPPLICATION`.Companion.`default`() : `LOCALMANAGEDAPPLICATION` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `LOCALSTATE_ASSIGNED`: UInt = 1u;
public const val `LOCALSTATE_ORPHANED`: UInt = 32u;
public const val `LOCALSTATE_POLICYREMOVE_ORPHAN`: UInt = 8u;
public const val `LOCALSTATE_POLICYREMOVE_UNINSTALL`: UInt = 16u;
public const val `LOCALSTATE_PUBLISHED`: UInt = 2u;
public const val `LOCALSTATE_UNINSTALLED`: UInt = 64u;
public const val `LOCALSTATE_UNINSTALL_UNMANAGED`: UInt = 4u;
// UNSUPPORTED Rust 302:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const MACHINE_POLICY_PRESENT_TRIGGER_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x659fcae6_5bdb_4da9_b1ff_ca2a178d46e0);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MANAGEDAPPLICATION` (
    public var `pszPackageName`: `windows_sys`.`core`.`PWSTR`,
    public var `pszPublisher`: `windows_sys`.`core`.`PWSTR`,
    public var `dwVersionHi`: UInt,
    public var `dwVersionLo`: UInt,
    public var `dwRevision`: UInt,
    public var `GpoId`: `windows_sys`.`core`.`GUID`,
    public var `pszPolicyName`: `windows_sys`.`core`.`PWSTR`,
    public var `ProductId`: `windows_sys`.`core`.`GUID`,
    public var `Language`: UShort,
    public var `pszOwner`: `windows_sys`.`core`.`PWSTR`,
    public var `pszCompany`: `windows_sys`.`core`.`PWSTR`,
    public var `pszComments`: `windows_sys`.`core`.`PWSTR`,
    public var `pszContact`: `windows_sys`.`core`.`PWSTR`,
    public var `pszSupportUrl`: `windows_sys`.`core`.`PWSTR`,
    public var `dwPathType`: UInt,
    public var `bInstalled`: `windows_sys`.`core`.`BOOL`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MANAGEDAPPLICATION`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MANAGEDAPPLICATION`.Companion.`default`() : `MANAGEDAPPLICATION` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `MANAGED_APPS_FROMCATEGORY`: UInt = 2u;
public const val `MANAGED_APPS_INFOLEVEL_DEFAULT`: UInt = 65536u;
public const val `MANAGED_APPS_USERAPPLICATIONS`: UInt = 1u;
public const val `MANAGED_APPTYPE_SETUPEXE`: UInt = 2u;
public const val `MANAGED_APPTYPE_UNSUPPORTED`: UInt = 3u;
public const val `MANAGED_APPTYPE_WINDOWSINSTALLER`: UInt = 1u;
// UNSUPPORTED Rust 334:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const NODEID_Machine: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8fc0b737_a0e1_11d1_a7d3_0000f87571e3);

// UNSUPPORTED Rust 335:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const NODEID_MachineSWSettings: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8fc0b73a_a0e1_11d1_a7d3_0000f87571e3);

// UNSUPPORTED Rust 336:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const NODEID_RSOPMachine: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbd4c1a2e_0b7a_4a62_a6b0_c0577539c97e);

// UNSUPPORTED Rust 337:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const NODEID_RSOPMachineSWSettings: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6a76273e_eb8e_45db_94c5_25663a5f2c1a);

// UNSUPPORTED Rust 338:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const NODEID_RSOPUser: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xab87364f_0cec_4cd8_9bf8_898f34628fb8);

// UNSUPPORTED Rust 339:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const NODEID_RSOPUserSWSettings: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe52c5ce3_fd27_4402_84de_d9a5f2858910);

// UNSUPPORTED Rust 340:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const NODEID_User: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8fc0b738_a0e1_11d1_a7d3_0000f87571e3);

// UNSUPPORTED Rust 341:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const NODEID_UserSWSettings: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8fc0b73c_a0e1_11d1_a7d3_0000f87571e3);

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Wmi"))]
public typealias `PFNGENERATEGROUPPOLICY` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?, `windows_sys`.`core`.`PCWSTR`, /* Rust *const */ kotlinx.cinterop.CPointer<`RSOP_TARGET`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`RSOP_TARGET`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Registry")]
public typealias `PFNPROCESSGROUPPOLICY` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, `super`.`super`.`Foundation`.`HANDLE`, `super`.`Registry`.`HKEY`, /* Rust *const */ kotlinx.cinterop.CPointer<`GROUP_POLICY_OBJECTA`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`GROUP_POLICY_OBJECTA`>?, ULong, /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?, `PFNSTATUSMESSAGECALLBACK`) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Registry", feature = "Win32_System_Wmi"))]
public typealias `PFNPROCESSGROUPPOLICYEX` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, `super`.`super`.`Foundation`.`HANDLE`, `super`.`Registry`.`HKEY`, /* Rust *const */ kotlinx.cinterop.CPointer<`GROUP_POLICY_OBJECTA`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`GROUP_POLICY_OBJECTA`>?, ULong, /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?, `PFNSTATUSMESSAGECALLBACK`, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`HRESULT`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNSTATUSMESSAGECALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`BOOL`, `windows_sys`.`core`.`PCWSTR`) -> UInt>>>;
public const val `PI_APPLYPOLICY`: UInt = 2u;
public const val `PI_NOUI`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `POLICYSETTINGSTATUSINFO` (
    public var `szKey`: `windows_sys`.`core`.`PWSTR`,
    public var `szEventSource`: `windows_sys`.`core`.`PWSTR`,
    public var `szEventLogName`: `windows_sys`.`core`.`PWSTR`,
    public var `dwEventID`: UInt,
    public var `dwErrorCode`: UInt,
    public var `status`: `SETTINGSTATUS`,
    public var `timeLogged`: `super`.`super`.`Foundation`.`SYSTEMTIME`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `POLICYSETTINGSTATUSINFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `POLICYSETTINGSTATUSINFO`.Companion.`default`() : `POLICYSETTINGSTATUSINFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `PROGID`: `INSTALLSPECTYPE` = 3;
public const val `PT_MANDATORY`: UInt = 4u;
public const val `PT_ROAMING`: UInt = 2u;
public const val `PT_ROAMING_PREEXISTING`: UInt = 8u;
public const val `PT_TEMPORARY`: UInt = 1u;
public const val `PUBLISHED`: `APPSTATE` = 2;
// UNSUPPORTED Rust 373:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Wmi"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RSOP_TARGET` (
    public var `pwszAccountName`: `windows_sys`.`core`.`PWSTR`,
    public var `pwszNewSOM`: `windows_sys`.`core`.`PWSTR`,
    public var `psaSecurityGroups`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Com`.`SAFEARRAY`>?,
    public var `pRsopToken`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `pGPOList`: /* Rust *mut */ kotlinx.cinterop.CPointer<`GROUP_POLICY_OBJECTA`>?,
    public var `pWbemServices`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `RSOP_TARGET`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Wmi"))]

    public fun `RSOP_TARGET`.Companion.`default`() : `RSOP_TARGET` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `RSOP_TEMPNAMESPACE_EXISTS`: UInt = 4u;
public const val `RSOP_USER_ACCESS_DENIED`: UInt = 1u;
public typealias `SETTINGSTATUS` = Int;
// UNSUPPORTED Rust 410:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
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
