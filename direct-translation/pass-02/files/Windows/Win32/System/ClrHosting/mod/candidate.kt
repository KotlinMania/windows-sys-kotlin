// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("mscoree.dll" "system" fn CLRCreateInstance(clsid : *const windows_sys::core::GUID, riid : *const windows_sys::core::GUID, ppinterface : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("mscoree.dll" "system" fn CallFunctionShim(szdllname : windows_sys::core::PCWSTR, szfunctionname : windows_sys::core::PCSTR, lpvargument1 : *mut core::ffi::c_void, lpvargument2 : *mut core::ffi::c_void, szversion : windows_sys::core::PCWSTR, pvreserved : *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("mscoree.dll" "system" fn ClrCreateManagedInstance(ptypename : windows_sys::core::PCWSTR, riid : *const windows_sys::core::GUID, ppobject : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("mscoree.dll" "system" fn CorBindToCurrentRuntime(pwszfilename : windows_sys::core::PCWSTR, rclsid : *const windows_sys::core::GUID, riid : *const windows_sys::core::GUID, ppv : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("mscoree.dll" "system" fn CorBindToRuntime(pwszversion : windows_sys::core::PCWSTR, pwszbuildflavor : windows_sys::core::PCWSTR, rclsid : *const windows_sys::core::GUID, riid : *const windows_sys::core::GUID, ppv : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("mscoree.dll" "system" fn CorBindToRuntimeByCfg(pcfgstream : * mut core::ffi::c_void, reserved : u32, startupflags : u32, rclsid : *const windows_sys::core::GUID, riid : *const windows_sys::core::GUID, ppv : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("mscoree.dll" "system" fn CorBindToRuntimeEx(pwszversion : windows_sys::core::PCWSTR, pwszbuildflavor : windows_sys::core::PCWSTR, startupflags : u32, rclsid : *const windows_sys::core::GUID, riid : *const windows_sys::core::GUID, ppv : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("mscoree.dll" "system" fn CorBindToRuntimeHost(pwszversion : windows_sys::core::PCWSTR, pwszbuildflavor : windows_sys::core::PCWSTR, pwszhostconfigfile : windows_sys::core::PCWSTR, preserved : *mut core::ffi::c_void, startupflags : u32, rclsid : *const windows_sys::core::GUID, riid : *const windows_sys::core::GUID, ppv : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("mscoree.dll" "system" fn CorExitProcess(exitcode : i32));

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Threading")]
// windows_link::link!("mscoree.dll" "system" fn CorLaunchApplication(dwclickoncehost : HOST_TYPE, pwzappfullname : windows_sys::core::PCWSTR, dwmanifestpaths : u32, ppwzmanifestpaths : *const windows_sys::core::PCWSTR, dwactivationdata : u32, ppwzactivationdata : *const windows_sys::core::PCWSTR, lpprocessinformation : *mut super::Threading:: PROCESS_INFORMATION) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// windows_link::link!("mscoree.dll" "system" fn CorMarkThreadInThreadPool());

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// windows_link::link!("mscoree.dll" "system" fn CreateDebuggingInterfaceFromVersion(idebuggerversion : i32, szdebuggeeversion : windows_sys::core::PCWSTR, ppcordb : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// windows_link::link!("mscoree.dll" "system" fn GetCLRIdentityManager(riid : *const windows_sys::core::GUID, ppmanager : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// windows_link::link!("mscoree.dll" "system" fn GetCORRequiredVersion(pbuffer : windows_sys::core::PWSTR, cchbuffer : u32, dwlength : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// windows_link::link!("mscoree.dll" "system" fn GetCORSystemDirectory(pbuffer : windows_sys::core::PWSTR, cchbuffer : u32, dwlength : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// windows_link::link!("mscoree.dll" "system" fn GetCORVersion(pbbuffer : windows_sys::core::PWSTR, cchbuffer : u32, dwlength : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// windows_link::link!("mscoree.dll" "system" fn GetFileVersion(szfilename : windows_sys::core::PCWSTR, szbuffer : windows_sys::core::PWSTR, cchbuffer : u32, dwlength : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// windows_link::link!("mscoree.dll" "system" fn GetRealProcAddress(pwszprocname : windows_sys::core::PCSTR, ppv : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// windows_link::link!("mscoree.dll" "system" fn GetRequestedRuntimeInfo(pexe : windows_sys::core::PCWSTR, pwszversion : windows_sys::core::PCWSTR, pconfigurationfile : windows_sys::core::PCWSTR, startupflags : u32, runtimeinfoflags : u32, pdirectory : windows_sys::core::PWSTR, dwdirectory : u32, dwdirectorylength : *mut u32, pversion : windows_sys::core::PWSTR, cchbuffer : u32, dwlength : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// windows_link::link!("mscoree.dll" "system" fn GetRequestedRuntimeVersion(pexe : windows_sys::core::PCWSTR, pversion : windows_sys::core::PWSTR, cchbuffer : u32, dwlength : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// windows_link::link!("mscoree.dll" "system" fn GetRequestedRuntimeVersionForCLSID(rclsid : *const windows_sys::core::GUID, pversion : windows_sys::core::PWSTR, cchbuffer : u32, dwlength : *mut u32, dwresolutionflags : CLSID_RESOLUTION_FLAGS) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// windows_link::link!("mscoree.dll" "system" fn GetVersionFromProcess(hprocess : super::super::Foundation:: HANDLE, pversion : windows_sys::core::PWSTR, cchbuffer : u32, dwlength : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// windows_link::link!("mscoree.dll" "system" fn LoadLibraryShim(szdllname : windows_sys::core::PCWSTR, szversion : windows_sys::core::PCWSTR, pvreserved : *mut core::ffi::c_void, phmoddll : *mut super::super::Foundation:: HMODULE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// windows_link::link!("mscoree.dll" "system" fn LoadStringRC(iresouceid : u32, szbuffer : windows_sys::core::PWSTR, imax : i32, bquiet : i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// windows_link::link!("mscoree.dll" "system" fn LoadStringRCEx(lcid : u32, iresouceid : u32, szbuffer : windows_sys::core::PWSTR, imax : i32, bquiet : i32, pcwchused : *mut i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// windows_link::link!("mscoree.dll" "system" fn LockClrVersion(hostcallback : FLockClrVersionCallback, pbeginhostsetup : *mut FLockClrVersionCallback, pendhostsetup : *mut FLockClrVersionCallback) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 29:1: declaration Macro has no candidate rule
// windows_link::link!("mscoree.dll" "system" fn RunDll32ShimW(hwnd : super::super::Foundation:: HWND, hinst : super::super::Foundation:: HINSTANCE, lpszcmdline : windows_sys::core::PCWSTR, ncmdshow : i32) -> windows_sys::core::HRESULT);

public const val `APPDOMAIN_FORCE_TRIVIAL_WAIT_OPERATIONS`: `APPDOMAIN_SECURITY_FLAGS` = 8;
public const val `APPDOMAIN_SECURITY_DEFAULT`: `APPDOMAIN_SECURITY_FLAGS` = 0;
public typealias `APPDOMAIN_SECURITY_FLAGS` = Int;
public const val `APPDOMAIN_SECURITY_FORBID_CROSSAD_REVERSE_PINVOKE`: `APPDOMAIN_SECURITY_FLAGS` = 2;
public const val `APPDOMAIN_SECURITY_SANDBOXED`: `APPDOMAIN_SECURITY_FLAGS` = 1;
// UNSUPPORTED Rust 35:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct AssemblyBindInfo {
//     pub dwAppDomainId: u32,
//     pub lpReferencedIdentity: windows_sys::core::PCWSTR,
//     pub lpPostPolicyIdentity: windows_sys::core::PCWSTR,
//     pub ePolicyLevel: u32,
// }

// UNSUPPORTED Rust 43:1: declaration Impl has no candidate rule
// impl Default for AssemblyBindInfo {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `BucketParamLength`: UInt = 255u;
public typealias `BucketParameterIndex` = Int;
// UNSUPPORTED Rust 50:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct BucketParameters {
//     pub fInited: windows_sys::core::BOOL,
//     pub pszEventTypeName: [u16; 255],
//     pub pszParams: [u16; 2550],
// }

// UNSUPPORTED Rust 57:1: declaration Impl has no candidate rule
// impl Default for BucketParameters {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `BucketParamsCount`: UInt = 10u;
// UNSUPPORTED Rust 63:1: generic scalar type unsupported
// pub type CLRCreateInstanceFnPtr = Option<unsafe extern "system" fn(clsid: *const windows_sys::core::GUID, riid: *const windows_sys::core::GUID, ppinterface: *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 64:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CLRRuntimeHost: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x90f1a06e_7712_4762_86b5_7a5eba6bdb02);

public const val `CLR_ASSEMBLY_BUILD_VERSION`: UInt = 0u;
public const val `CLR_ASSEMBLY_IDENTITY_FLAGS_DEFAULT`: `ECLRAssemblyIdentityFlags` = 0;
public const val `CLR_ASSEMBLY_MAJOR_VERSION`: UInt = 4u;
public const val `CLR_ASSEMBLY_MINOR_VERSION`: UInt = 0u;
public const val `CLR_BUILD_VERSION`: UInt = 22220u;
public const val `CLR_DEBUGGING_MANAGED_EVENT_DEBUGGER_LAUNCH`: `CLR_DEBUGGING_PROCESS_FLAGS` = 2;
public const val `CLR_DEBUGGING_MANAGED_EVENT_PENDING`: `CLR_DEBUGGING_PROCESS_FLAGS` = 1;
public typealias `CLR_DEBUGGING_PROCESS_FLAGS` = Int;
// UNSUPPORTED Rust 73:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CLR_DEBUGGING_VERSION {
//     pub wStructVersion: u16,
//     pub wMajor: u16,
//     pub wMinor: u16,
//     pub wBuild: u16,
//     pub wRevision: u16,
// }

public const val `CLR_MAJOR_VERSION`: UInt = 4u;
public const val `CLR_MINOR_VERSION`: UInt = 0u;
// UNSUPPORTED Rust 84:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CLSID_CLRDebugging: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbacc578d_fbdd_48a4_969f_02d932b74634);

// UNSUPPORTED Rust 85:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CLSID_CLRDebuggingLegacy: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdf8395b5_a4ba_450b_a77c_a9a47762c520);

// UNSUPPORTED Rust 86:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CLSID_CLRMetaHost: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9280188d_0e8e_4867_b30c_7fa83884e8de);

// UNSUPPORTED Rust 87:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CLSID_CLRMetaHostPolicy: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2ebcd49a_1b47_4a61_b13a_4a03701e594b);

// UNSUPPORTED Rust 88:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CLSID_CLRProfiling: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbd097ed8_733e_43fe_8ed7_a95ff9a8448c);

// UNSUPPORTED Rust 89:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CLSID_CLRStrongName: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb79b0acd_f5cd_409b_b5a5_a16244610b92);

public const val `CLSID_RESOLUTION_DEFAULT`: `CLSID_RESOLUTION_FLAGS` = 0;
public typealias `CLSID_RESOLUTION_FLAGS` = Int;
public const val `CLSID_RESOLUTION_REGISTERED`: `CLSID_RESOLUTION_FLAGS` = 1;
public const val `COR_GC_COUNTS`: `COR_GC_STAT_TYPES` = 1;
public const val `COR_GC_MEMORYUSAGE`: `COR_GC_STAT_TYPES` = 2;
// UNSUPPORTED Rust 95:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct COR_GC_STATS {
//     pub Flags: u32,
//     pub ExplicitGCCount: usize,
//     pub GenCollectionsTaken: [usize; 3],
//     pub CommittedKBytes: usize,
//     pub ReservedKBytes: usize,
//     pub Gen0HeapSizeKBytes: usize,
//     pub Gen1HeapSizeKBytes: usize,
//     pub Gen2HeapSizeKBytes: usize,
//     pub LargeObjectHeapSizeKBytes: usize,
//     pub KBytesPromotedFromGen0: usize,
//     pub KBytesPromotedFromGen1: usize,
// }

// UNSUPPORTED Rust 110:1: declaration Impl has no candidate rule
// impl Default for COR_GC_STATS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `COR_GC_STAT_TYPES` = Int;
public const val `COR_GC_THREAD_HAS_PROMOTED_BYTES`: `COR_GC_THREAD_STATS_TYPES` = 1;
// UNSUPPORTED Rust 117:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct COR_GC_THREAD_STATS {
//     pub PerThreadAllocation: u64,
//     pub Flags: u32,
// }

public typealias `COR_GC_THREAD_STATS_TYPES` = Int;
// UNSUPPORTED Rust 124:1: generic scalar type unsupported
// pub type CallbackThreadSetFnPtr = Option<unsafe extern "system" fn() -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 125:1: generic scalar type unsupported
// pub type CallbackThreadUnsetFnPtr = Option<unsafe extern "system" fn() -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 126:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const ComCallUnmarshal: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3f281000_e95a_11d2_886b_00c04f869f04);

// UNSUPPORTED Rust 127:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const ComCallUnmarshalV4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x45fb4600_e6e8_4928_b25e_50476ff79425);

// UNSUPPORTED Rust 128:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CorRuntimeHost: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcb2f6723_ab3a_11d2_9c40_00c04fa30a3e);

// UNSUPPORTED Rust 129:1: generic scalar type unsupported
// pub type CreateInterfaceFnPtr = Option<unsafe extern "system" fn(clsid: *const windows_sys::core::GUID, riid: *const windows_sys::core::GUID, ppinterface: *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 130:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CustomDumpItem {
//     pub itemKind: ECustomDumpItemKind,
//     pub Anonymous: CustomDumpItem_0,
// }

// UNSUPPORTED Rust 136:1: declaration Impl has no candidate rule
// impl Default for CustomDumpItem {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 141:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union CustomDumpItem_0 {
//     pub pReserved: usize,
// }

// UNSUPPORTED Rust 146:1: declaration Impl has no candidate rule
// impl Default for CustomDumpItem_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 151:1: non-scalar type Ptr unsupported
// pub const DEPRECATED_CLR_API_MESG: windows_sys::core::PCSTR = windows_sys::core::s!("This API has been deprecated. Refer to https://go.microsoft.com/fwlink/?LinkId=143720 for more details.");

public const val `DUMP_FLAVOR_CriticalCLRState`: `ECustomDumpFlavor` = 1;
public const val `DUMP_FLAVOR_Default`: `ECustomDumpFlavor` = 0;
public const val `DUMP_FLAVOR_Mini`: `ECustomDumpFlavor` = 0;
public const val `DUMP_FLAVOR_NonHeapCLRState`: `ECustomDumpFlavor` = 2;
public const val `DUMP_ITEM_None`: `ECustomDumpItemKind` = 0;
public typealias `EApiCategories` = Int;
public typealias `EBindPolicyLevels` = Int;
public typealias `ECLRAssemblyIdentityFlags` = Int;
public typealias `EClrEvent` = Int;
public typealias `EClrFailure` = Int;
public typealias `EClrOperation` = Int;
public typealias `EClrUnhandledException` = Int;
public typealias `EContextType` = Int;
public typealias `ECustomDumpFlavor` = Int;
public typealias `ECustomDumpItemKind` = Int;
public typealias `EHostApplicationPolicy` = Int;
public typealias `EHostBindingPolicyModifyFlags` = Int;
public typealias `EInitializeNewDomainFlags` = Int;
public typealias `EMemoryAvailable` = Int;
public typealias `EMemoryCriticalLevel` = Int;
public typealias `EPolicyAction` = Int;
public typealias `ESymbolReadingPolicy` = Int;
public typealias `ETaskType` = Int;
public const val `Event_ClrDisabled`: `EClrEvent` = 1;
public const val `Event_DomainUnload`: `EClrEvent` = 0;
public const val `Event_MDAFired`: `EClrEvent` = 2;
public const val `Event_StackOverflow`: `EClrEvent` = 3;
public const val `FAIL_AccessViolation`: `EClrFailure` = 5;
public const val `FAIL_CodeContract`: `EClrFailure` = 6;
public const val `FAIL_CriticalResource`: `EClrFailure` = 1;
public const val `FAIL_FatalRuntime`: `EClrFailure` = 2;
public const val `FAIL_NonCriticalResource`: `EClrFailure` = 0;
public const val `FAIL_OrphanedLock`: `EClrFailure` = 3;
public const val `FAIL_StackOverflow`: `EClrFailure` = 4;
// UNSUPPORTED Rust 186:1: generic scalar type unsupported
// pub type FExecuteInAppDomainCallback = Option<unsafe extern "system" fn(cookie: *mut core::ffi::c_void) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 187:1: generic scalar type unsupported
// pub type FLockClrVersionCallback = Option<unsafe extern "system" fn() -> windows_sys::core::HRESULT>;

public const val `HOST_APPLICATION_BINDING_POLICY`: `EHostApplicationPolicy` = 1;
public const val `HOST_BINDING_POLICY_MODIFY_CHAIN`: `EHostBindingPolicyModifyFlags` = 1;
public const val `HOST_BINDING_POLICY_MODIFY_DEFAULT`: `EHostBindingPolicyModifyFlags` = 0;
public const val `HOST_BINDING_POLICY_MODIFY_MAX`: `EHostBindingPolicyModifyFlags` = 3;
public const val `HOST_BINDING_POLICY_MODIFY_REMOVE`: `EHostBindingPolicyModifyFlags` = 2;
public typealias `HOST_TYPE` = Int;
public const val `HOST_TYPE_APPLAUNCH`: `HOST_TYPE` = 1;
public const val `HOST_TYPE_CORFLAG`: `HOST_TYPE` = 2;
public const val `HOST_TYPE_DEFAULT`: `HOST_TYPE` = 0;
public const val `InvalidBucketParamIndex`: `BucketParameterIndex` = 9;
// UNSUPPORTED Rust 198:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const LIBID_mscoree: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5477469e_83b1_11d2_8b49_00a0c9b7c9c4);

public const val `MALLOC_EXECUTABLE`: `MALLOC_TYPE` = 2;
public const val `MALLOC_THREADSAFE`: `MALLOC_TYPE` = 1;
public typealias `MALLOC_TYPE` = Int;
// UNSUPPORTED Rust 202:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MDAInfo {
//     pub lpMDACaption: windows_sys::core::PCWSTR,
//     pub lpMDAMessage: windows_sys::core::PCWSTR,
//     pub lpStackTrace: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 209:1: declaration Impl has no candidate rule
// impl Default for MDAInfo {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `METAHOST_CONFIG_FLAGS` = Int;
public const val `METAHOST_CONFIG_FLAGS_LEGACY_V2_ACTIVATION_POLICY_FALSE`: `METAHOST_CONFIG_FLAGS` = 2;
public const val `METAHOST_CONFIG_FLAGS_LEGACY_V2_ACTIVATION_POLICY_MASK`: `METAHOST_CONFIG_FLAGS` = 3;
public const val `METAHOST_CONFIG_FLAGS_LEGACY_V2_ACTIVATION_POLICY_TRUE`: `METAHOST_CONFIG_FLAGS` = 1;
public const val `METAHOST_CONFIG_FLAGS_LEGACY_V2_ACTIVATION_POLICY_UNSET`: `METAHOST_CONFIG_FLAGS` = 0;
public const val `METAHOST_POLICY_APPLY_UPGRADE_POLICY`: `METAHOST_POLICY_FLAGS` = 8;
public const val `METAHOST_POLICY_EMULATE_EXE_LAUNCH`: `METAHOST_POLICY_FLAGS` = 16;
public const val `METAHOST_POLICY_ENSURE_SKU_SUPPORTED`: `METAHOST_POLICY_FLAGS` = 128;
public typealias `METAHOST_POLICY_FLAGS` = Int;
public const val `METAHOST_POLICY_HIGHCOMPAT`: `METAHOST_POLICY_FLAGS` = 0;
public const val `METAHOST_POLICY_IGNORE_ERROR_MODE`: `METAHOST_POLICY_FLAGS` = 4096;
public const val `METAHOST_POLICY_SHOW_ERROR_DIALOG`: `METAHOST_POLICY_FLAGS` = 32;
public const val `METAHOST_POLICY_USE_PROCESS_IMAGE_PATH`: `METAHOST_POLICY_FLAGS` = 64;
public const val `MaxClrEvent`: `EClrEvent` = 4;
public const val `MaxClrFailure`: `EClrFailure` = 7;
public const val `MaxClrOperation`: `EClrOperation` = 7;
public const val `MaxPolicyAction`: `EPolicyAction` = 10;
// UNSUPPORTED Rust 231:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ModuleBindInfo {
//     pub dwAppDomainId: u32,
//     pub lpAssemblyIdentity: windows_sys::core::PCWSTR,
//     pub lpModuleName: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 238:1: declaration Impl has no candidate rule
// impl Default for ModuleBindInfo {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `OPR_AppDomainRudeUnload`: `EClrOperation` = 4;
public const val `OPR_AppDomainUnload`: `EClrOperation` = 3;
public const val `OPR_FinalizerRun`: `EClrOperation` = 6;
public const val `OPR_ProcessExit`: `EClrOperation` = 5;
public const val `OPR_ThreadAbort`: `EClrOperation` = 0;
public const val `OPR_ThreadRudeAbortInCriticalRegion`: `EClrOperation` = 2;
public const val `OPR_ThreadRudeAbortInNonCriticalRegion`: `EClrOperation` = 1;
// UNSUPPORTED Rust 250:1: generic scalar type unsupported
// pub type PTLS_CALLBACK_FUNCTION = Option<unsafe extern "system" fn(__midl____midl_itf_mscoree_0000_00040005: *mut core::ffi::c_void)>;

public const val `Parameter1`: `BucketParameterIndex` = 0;
public const val `Parameter2`: `BucketParameterIndex` = 1;
public const val `Parameter3`: `BucketParameterIndex` = 2;
public const val `Parameter4`: `BucketParameterIndex` = 3;
public const val `Parameter5`: `BucketParameterIndex` = 4;
public const val `Parameter6`: `BucketParameterIndex` = 5;
public const val `Parameter7`: `BucketParameterIndex` = 6;
public const val `Parameter8`: `BucketParameterIndex` = 7;
public const val `Parameter9`: `BucketParameterIndex` = 8;
public const val `RUNTIME_INFO_DONT_RETURN_DIRECTORY`: `RUNTIME_INFO_FLAGS` = 16;
public const val `RUNTIME_INFO_DONT_RETURN_VERSION`: `RUNTIME_INFO_FLAGS` = 32;
public const val `RUNTIME_INFO_DONT_SHOW_ERROR_DIALOG`: `RUNTIME_INFO_FLAGS` = 64;
public typealias `RUNTIME_INFO_FLAGS` = Int;
public const val `RUNTIME_INFO_IGNORE_ERROR_MODE`: `RUNTIME_INFO_FLAGS` = 4096;
public const val `RUNTIME_INFO_REQUEST_AMD64`: `RUNTIME_INFO_FLAGS` = 4;
public const val `RUNTIME_INFO_REQUEST_ARM64`: `RUNTIME_INFO_FLAGS` = 8192;
public const val `RUNTIME_INFO_REQUEST_IA64`: `RUNTIME_INFO_FLAGS` = 2;
public const val `RUNTIME_INFO_REQUEST_X86`: `RUNTIME_INFO_FLAGS` = 8;
public const val `RUNTIME_INFO_UPGRADE_VERSION`: `RUNTIME_INFO_FLAGS` = 1;
// UNSUPPORTED Rust 270:1: generic scalar type unsupported
// pub type RuntimeLoadedCallbackFnPtr = Option<unsafe extern "system" fn(pruntimeinfo: *mut core::ffi::c_void, pfncallbackthreadset: CallbackThreadSetFnPtr, pfncallbackthreadunset: CallbackThreadUnsetFnPtr)>;

public const val `SO_ClrEngine`: `StackOverflowType` = 1;
public const val `SO_Managed`: `StackOverflowType` = 0;
public const val `SO_Other`: `StackOverflowType` = 2;
public const val `STARTUP_ALWAYSFLOW_IMPERSONATION`: `STARTUP_FLAGS` = 262144;
public const val `STARTUP_ARM`: `STARTUP_FLAGS` = 4194304;
public const val `STARTUP_CONCURRENT_GC`: `STARTUP_FLAGS` = 1;
public const val `STARTUP_DISABLE_COMMITTHREADSTACK`: `STARTUP_FLAGS` = 131072;
public const val `STARTUP_ETW`: `STARTUP_FLAGS` = 1048576;
public typealias `STARTUP_FLAGS` = Int;
public const val `STARTUP_HOARD_GC_VM`: `STARTUP_FLAGS` = 8192;
public const val `STARTUP_LEGACY_IMPERSONATION`: `STARTUP_FLAGS` = 65536;
public const val `STARTUP_LOADER_OPTIMIZATION_MASK`: `STARTUP_FLAGS` = 6;
public const val `STARTUP_LOADER_OPTIMIZATION_MULTI_DOMAIN`: `STARTUP_FLAGS` = 4;
public const val `STARTUP_LOADER_OPTIMIZATION_MULTI_DOMAIN_HOST`: `STARTUP_FLAGS` = 6;
public const val `STARTUP_LOADER_OPTIMIZATION_SINGLE_DOMAIN`: `STARTUP_FLAGS` = 2;
public const val `STARTUP_LOADER_SAFEMODE`: `STARTUP_FLAGS` = 16;
public const val `STARTUP_LOADER_SETPREFERENCE`: `STARTUP_FLAGS` = 256;
public const val `STARTUP_SERVER_GC`: `STARTUP_FLAGS` = 4096;
public const val `STARTUP_SINGLE_VERSION_HOSTING_INTERFACE`: `STARTUP_FLAGS` = 16384;
public const val `STARTUP_TRIM_GC_COMMIT`: `STARTUP_FLAGS` = 524288;
// UNSUPPORTED Rust 291:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_System_Diagnostics_Debug", feature = "Win32_System_Kernel"))]
// #[derive(Clone, Copy)]
// pub struct StackOverflowInfo {
//     pub soType: StackOverflowType,
//     pub pExceptionInfo: *mut super::Diagnostics::Debug::EXCEPTION_POINTERS,
// }

// UNSUPPORTED Rust 298:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_System_Diagnostics_Debug", feature = "Win32_System_Kernel"))]
// impl Default for StackOverflowInfo {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `StackOverflowType` = Int;
public const val `TT_ADUNLOAD`: `ETaskType` = 128;
public const val `TT_DEBUGGERHELPER`: `ETaskType` = 1;
public const val `TT_FINALIZER`: `ETaskType` = 4;
public const val `TT_GC`: `ETaskType` = 2;
public const val `TT_THREADPOOL_GATE`: `ETaskType` = 16;
public const val `TT_THREADPOOL_IOCOMPLETION`: `ETaskType` = 64;
public const val `TT_THREADPOOL_TIMER`: `ETaskType` = 8;
public const val `TT_THREADPOOL_WAIT`: `ETaskType` = 512;
public const val `TT_THREADPOOL_WORKER`: `ETaskType` = 32;
public const val `TT_UNKNOWN`: `ETaskType` = -2147483648;
public const val `TT_USER`: `ETaskType` = 256;
// UNSUPPORTED Rust 316:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const TypeNameFactory: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb81ff171_20f3_11d2_8dcc_00a0c9b00525);

public const val `WAIT_ALERTABLE`: `WAIT_OPTION` = 2;
public const val `WAIT_MSGPUMP`: `WAIT_OPTION` = 1;
public const val `WAIT_NOTINDEADLOCK`: `WAIT_OPTION` = 4;
public typealias `WAIT_OPTION` = Int;
public const val `eAbortThread`: `EPolicyAction` = 2;
public const val `eAll`: `EApiCategories` = 511;
public const val `eAppDomainCritical`: `EMemoryCriticalLevel` = 1;
public const val `eCurrentContext`: `EContextType` = 0;
public const val `eDisableRuntime`: `EPolicyAction` = 9;
public const val `eExitProcess`: `EPolicyAction` = 6;
public const val `eExternalProcessMgmt`: `EApiCategories` = 4;
public const val `eExternalThreading`: `EApiCategories` = 16;
public const val `eFastExitProcess`: `EPolicyAction` = 7;
public const val `eHostDeterminedPolicy`: `EClrUnhandledException` = 1;
public const val `eInitializeNewDomainFlags_NoSecurityChanges`: `EInitializeNewDomainFlags` = 2;
public const val `eInitializeNewDomainFlags_None`: `EInitializeNewDomainFlags` = 0;
public const val `eMayLeakOnAbort`: `EApiCategories` = 256;
public const val `eMemoryAvailableHigh`: `EMemoryAvailable` = 3;
public const val `eMemoryAvailableLow`: `EMemoryAvailable` = 1;
public const val `eMemoryAvailableNeutral`: `EMemoryAvailable` = 2;
public const val `eNoAction`: `EPolicyAction` = 0;
public const val `eNoChecks`: `EApiCategories` = 0;
public const val `ePolicyLevelAdmin`: `EBindPolicyLevels` = 32;
public const val `ePolicyLevelApp`: `EBindPolicyLevels` = 4;
public const val `ePolicyLevelHost`: `EBindPolicyLevels` = 16;
public const val `ePolicyLevelNone`: `EBindPolicyLevels` = 0;
public const val `ePolicyLevelPublisher`: `EBindPolicyLevels` = 8;
public const val `ePolicyLevelRetargetable`: `EBindPolicyLevels` = 1;
public const val `ePolicyPortability`: `EBindPolicyLevels` = 64;
public const val `ePolicyUnifiedToCLR`: `EBindPolicyLevels` = 2;
public const val `eProcessCritical`: `EMemoryCriticalLevel` = 2;
public const val `eRestrictedContext`: `EContextType` = 1;
public const val `eRudeAbortThread`: `EPolicyAction` = 3;
public const val `eRudeExitProcess`: `EPolicyAction` = 8;
public const val `eRudeUnloadAppDomain`: `EPolicyAction` = 5;
public const val `eRuntimeDeterminedPolicy`: `EClrUnhandledException` = 0;
public const val `eSecurityInfrastructure`: `EApiCategories` = 64;
public const val `eSelfAffectingProcessMgmt`: `EApiCategories` = 8;
public const val `eSelfAffectingThreading`: `EApiCategories` = 32;
public const val `eSharedState`: `EApiCategories` = 2;
public const val `eSymbolReadingAlways`: `ESymbolReadingPolicy` = 1;
public const val `eSymbolReadingFullTrustOnly`: `ESymbolReadingPolicy` = 2;
public const val `eSymbolReadingNever`: `ESymbolReadingPolicy` = 0;
public const val `eSynchronization`: `EApiCategories` = 1;
public const val `eTaskCritical`: `EMemoryCriticalLevel` = 0;
public const val `eThrowException`: `EPolicyAction` = 1;
public const val `eUI`: `EApiCategories` = 128;
public const val `eUnloadAppDomain`: `EPolicyAction` = 4;
