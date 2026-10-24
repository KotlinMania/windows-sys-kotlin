// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("dbgmodel.dll" "system" fn CreateDataModelManager(debughost : * mut core::ffi::c_void, manager : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("dbgeng.dll" "system" fn DebugConnect(remoteoptions : windows_sys::core::PCSTR, interfaceid : *const windows_sys::core::GUID, interface : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("dbgeng.dll" "system" fn DebugConnectWide(remoteoptions : windows_sys::core::PCWSTR, interfaceid : *const windows_sys::core::GUID, interface : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("dbgeng.dll" "system" fn DebugCreate(interfaceid : *const windows_sys::core::GUID, interface : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("dbgeng.dll" "system" fn DebugCreateEx(interfaceid : *const windows_sys::core::GUID, dbgengoptions : u32, interface : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

public const val `ADDRESS_TYPE_INDEX_NOT_FOUND`: UInt = 11u;
public const val `Ambiguous`: `SignatureComparison` = 1;
// UNSUPPORTED Rust 8:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ArrayDimension {
//     pub LowerBound: i64,
//     pub Length: u64,
//     pub Stride: u64,
// }

// UNSUPPORTED Rust 15:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct BUSDATA {
//     pub BusDataType: u32,
//     pub BusNumber: u32,
//     pub SlotNumber: u32,
//     pub Buffer: *mut core::ffi::c_void,
//     pub Offset: u32,
//     pub Length: u32,
// }

// UNSUPPORTED Rust 25:1: declaration Impl has no candidate rule
// impl Default for BUSDATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CANNOT_ALLOCATE_MEMORY`: UInt = 9u;
// UNSUPPORTED Rust 31:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CKCL_DATA {
//     pub NextLogEvent: *mut core::ffi::c_void,
//     pub TAnalyzeString: windows_sys::core::PSTR,
//     pub TAnalyzeReturnType: TANALYZE_RETURN,
// }

// UNSUPPORTED Rust 38:1: declaration Impl has no candidate rule
// impl Default for CKCL_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 43:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CKCL_LISTHEAD {
//     pub LogEventListHead: *mut CKCL_DATA,
//     pub Heap: super::super::super::super::Foundation::HANDLE,
// }

// UNSUPPORTED Rust 49:1: declaration Impl has no candidate rule
// impl Default for CKCL_LISTHEAD {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 54:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CLSID_DebugFailureAnalysisBasic: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb74eed7f_1c7d_4c1b_959f_b96dd9175aa4);

// UNSUPPORTED Rust 55:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CLSID_DebugFailureAnalysisKernel: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xee433078_64af_4c33_ab2f_ecad7f2a002d);

// UNSUPPORTED Rust 56:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CLSID_DebugFailureAnalysisTarget: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xba9bfb05_ef75_4bbd_a745_a6b5529458b8);

// UNSUPPORTED Rust 57:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CLSID_DebugFailureAnalysisUser: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe60b0c93_cf49_4a32_8147_0362202dc56b);

// UNSUPPORTED Rust 58:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CLSID_DebugFailureAnalysisWinCE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x67d5e86f_f5e2_462a_9233_1bd616fcc7e8);

// UNSUPPORTED Rust 59:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CLSID_DebugFailureAnalysisXBox360: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x901625bb_95f1_4318_ac80_9d733cee8c8b);

// UNSUPPORTED Rust 60:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CPU_INFO {
//     pub Type: u32,
//     pub NumCPUs: u32,
//     pub CurrentProc: u32,
//     pub ProcInfo: [DEBUG_PROCESSOR_IDENTIFICATION_ALL; 2048],
//     pub Mhz: u32,
// }

// UNSUPPORTED Rust 69:1: declaration Impl has no candidate rule
// impl Default for CPU_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 74:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CPU_INFO_v1 {
//     pub Type: u32,
//     pub NumCPUs: u32,
//     pub CurrentProc: u32,
//     pub ProcInfo: [DEBUG_PROCESSOR_IDENTIFICATION_ALL; 32],
//     pub Mhz: u32,
// }

// UNSUPPORTED Rust 83:1: declaration Impl has no candidate rule
// impl Default for CPU_INFO_v1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 88:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CPU_INFO_v2 {
//     pub Type: u32,
//     pub NumCPUs: u32,
//     pub CurrentProc: u32,
//     pub ProcInfo: [DEBUG_PROCESSOR_IDENTIFICATION_ALL; 1280],
//     pub Mhz: u32,
// }

// UNSUPPORTED Rust 97:1: declaration Impl has no candidate rule
// impl Default for CPU_INFO_v2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CROSS_PLATFORM_MAXIMUM_PROCESSORS`: UInt = 2048u;
public const val `CURRENT_KD_SECONDARY_VERSION`: UInt = 2u;
public const val `CallingConventionCDecl`: `CallingConventionKind` = 1;
public const val `CallingConventionFastCall`: `CallingConventionKind` = 2;
public typealias `CallingConventionKind` = Int;
public const val `CallingConventionStdCall`: `CallingConventionKind` = 3;
public const val `CallingConventionSysCall`: `CallingConventionKind` = 4;
public const val `CallingConventionThisCall`: `CallingConventionKind` = 5;
public const val `CallingConventionUnknown`: `CallingConventionKind` = 0;
// UNSUPPORTED Rust 111:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Kernel")]
// #[derive(Clone, Copy, Default)]
// pub struct DBGKD_DEBUG_DATA_HEADER32 {
//     pub List: super::super::super::Kernel::LIST_ENTRY32,
//     pub OwnerTag: u32,
//     pub Size: u32,
// }

// UNSUPPORTED Rust 119:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Kernel")]
// #[derive(Clone, Copy, Default)]
// pub struct DBGKD_DEBUG_DATA_HEADER64 {
//     pub List: super::super::super::Kernel::LIST_ENTRY64,
//     pub OwnerTag: u32,
//     pub Size: u32,
// }

// UNSUPPORTED Rust 127:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DBGKD_GET_VERSION32 {
//     pub MajorVersion: u16,
//     pub MinorVersion: u16,
//     pub ProtocolVersion: u16,
//     pub Flags: u16,
//     pub KernBase: u32,
//     pub PsLoadedModuleList: u32,
//     pub MachineType: u16,
//     pub ThCallbackStack: u16,
//     pub NextCallback: u16,
//     pub FramePointer: u16,
//     pub KiCallUserMode: u32,
//     pub KeUserCallbackDispatcher: u32,
//     pub BreakpointWithStatus: u32,
//     pub DebuggerDataList: u32,
// }

// UNSUPPORTED Rust 145:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DBGKD_GET_VERSION64 {
//     pub MajorVersion: u16,
//     pub MinorVersion: u16,
//     pub ProtocolVersion: u8,
//     pub KdSecondaryVersion: u8,
//     pub Flags: u16,
//     pub MachineType: u16,
//     pub MaxPacketType: u8,
//     pub MaxStateChange: u8,
//     pub MaxManipulate: u8,
//     pub Simulation: u8,
//     pub Unused: [u16; 1],
//     pub KernBase: u64,
//     pub PsLoadedModuleList: u64,
//     pub DebuggerDataList: u64,
// }

// UNSUPPORTED Rust 163:1: declaration Impl has no candidate rule
// impl Default for DBGKD_GET_VERSION64 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DBGKD_MAJOR_BIG`: `DBGKD_MAJOR_TYPES` = 2;
public const val `DBGKD_MAJOR_CE`: `DBGKD_MAJOR_TYPES` = 10;
public const val `DBGKD_MAJOR_COUNT`: `DBGKD_MAJOR_TYPES` = 11;
public const val `DBGKD_MAJOR_EFI`: `DBGKD_MAJOR_TYPES` = 5;
public const val `DBGKD_MAJOR_EXDI`: `DBGKD_MAJOR_TYPES` = 3;
public const val `DBGKD_MAJOR_HYPERVISOR`: `DBGKD_MAJOR_TYPES` = 8;
public const val `DBGKD_MAJOR_MIDORI`: `DBGKD_MAJOR_TYPES` = 9;
public const val `DBGKD_MAJOR_NT`: `DBGKD_MAJOR_TYPES` = 0;
public const val `DBGKD_MAJOR_NTBD`: `DBGKD_MAJOR_TYPES` = 4;
public const val `DBGKD_MAJOR_SINGULARITY`: `DBGKD_MAJOR_TYPES` = 7;
public const val `DBGKD_MAJOR_TNT`: `DBGKD_MAJOR_TYPES` = 6;
public typealias `DBGKD_MAJOR_TYPES` = Int;
public const val `DBGKD_MAJOR_XBOX`: `DBGKD_MAJOR_TYPES` = 1;
public const val `DBGKD_SIMULATION_EXDI`: Int = 1;
public const val `DBGKD_SIMULATION_NONE`: Int = 0;
public const val `DBGKD_VERS_FLAG_DATA`: UInt = 2u;
public const val `DBGKD_VERS_FLAG_HAL_IN_NTOS`: UInt = 64u;
public const val `DBGKD_VERS_FLAG_HSS`: UInt = 16u;
public const val `DBGKD_VERS_FLAG_MP`: UInt = 1u;
public const val `DBGKD_VERS_FLAG_NOMM`: UInt = 8u;
public const val `DBGKD_VERS_FLAG_PARTITIONS`: UInt = 32u;
public const val `DBGKD_VERS_FLAG_PTR64`: UInt = 4u;
public const val `DBG_DUMP_ADDRESS_AT_END`: UInt = 131072u;
public const val `DBG_DUMP_ADDRESS_OF_FIELD`: UInt = 65536u;
public const val `DBG_DUMP_ARRAY`: UInt = 32768u;
public const val `DBG_DUMP_BLOCK_RECURSE`: UInt = 2097152u;
public const val `DBG_DUMP_CALL_FOR_EACH`: UInt = 8u;
public const val `DBG_DUMP_COMPACT_OUT`: UInt = 8192u;
public const val `DBG_DUMP_COPY_TYPE_DATA`: UInt = 262144u;
public const val `DBG_DUMP_FIELD_ARRAY`: UInt = 16u;
public const val `DBG_DUMP_FIELD_CALL_BEFORE_PRINT`: UInt = 1u;
public const val `DBG_DUMP_FIELD_COPY_FIELD_DATA`: UInt = 32u;
public const val `DBG_DUMP_FIELD_DEFAULT_STRING`: UInt = 65536u;
public const val `DBG_DUMP_FIELD_FULL_NAME`: UInt = 8u;
public const val `DBG_DUMP_FIELD_GUID_STRING`: UInt = 524288u;
public const val `DBG_DUMP_FIELD_MULTI_STRING`: UInt = 262144u;
public const val `DBG_DUMP_FIELD_NO_CALLBACK_REQ`: UInt = 2u;
public const val `DBG_DUMP_FIELD_NO_PRINT`: UInt = 16384u;
public const val `DBG_DUMP_FIELD_RECUR_ON_THIS`: UInt = 4u;
public const val `DBG_DUMP_FIELD_RETURN_ADDRESS`: UInt = 4096u;
public const val `DBG_DUMP_FIELD_SIZE_IN_BITS`: UInt = 8192u;
public const val `DBG_DUMP_FIELD_UTF32_STRING`: UInt = 1048576u;
public const val `DBG_DUMP_FIELD_WCHAR_STRING`: UInt = 131072u;
public const val `DBG_DUMP_FUNCTION_FORMAT`: UInt = 1048576u;
public const val `DBG_DUMP_GET_SIZE_ONLY`: UInt = 128u;
public const val `DBG_DUMP_LIST`: UInt = 32u;
public const val `DBG_DUMP_MATCH_SIZE`: UInt = 4194304u;
public const val `DBG_DUMP_NO_INDENT`: UInt = 1u;
public const val `DBG_DUMP_NO_OFFSET`: UInt = 2u;
public const val `DBG_DUMP_NO_PRINT`: UInt = 64u;
public const val `DBG_DUMP_READ_PHYSICAL`: UInt = 524288u;
public const val `DBG_DUMP_VERBOSE`: UInt = 4u;
public const val `DBG_FRAME_DEFAULT`: UInt = 0u;
public const val `DBG_FRAME_IGNORE_INLINE`: UInt = 4294967295u;
public const val `DBG_RETURN_SUBTYPES`: UInt = 0u;
public const val `DBG_RETURN_TYPE`: UInt = 0u;
public const val `DBG_RETURN_TYPE_VALUES`: UInt = 0u;
// UNSUPPORTED Rust 225:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DBG_THREAD_ATTRIBUTES {
//     pub ThreadIndex: u32,
//     pub ProcessID: u64,
//     pub ThreadID: u64,
//     pub AttributeBits: u64,
//     pub BoolBits: u32,
//     pub BlockedOnPID: u64,
//     pub BlockedOnTID: u64,
//     pub CritSecAddress: u64,
//     pub Timeout_msec: u32,
//     pub StringData: [i8; 100],
//     pub SymName: [i8; 100],
// }

// UNSUPPORTED Rust 240:1: declaration Impl has no candidate rule
// impl Default for DBG_THREAD_ATTRIBUTES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DEBUG_ADDSYNTHMOD_DEFAULT`: UInt = 0u;
public const val `DEBUG_ADDSYNTHMOD_ZEROBASE`: UInt = 1u;
public const val `DEBUG_ADDSYNTHSYM_DEFAULT`: UInt = 0u;
// UNSUPPORTED Rust 248:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DEBUG_ANALYSIS_PROCESSOR_INFO {
//     pub SizeOfStruct: u32,
//     pub Model: u32,
//     pub Family: u32,
//     pub Stepping: u32,
//     pub Architecture: u32,
//     pub Revision: u32,
//     pub CurrentClockSpeed: u32,
//     pub CurrentVoltage: u32,
//     pub MaxClockSpeed: u32,
//     pub ProcessorType: u32,
//     pub DeviceID: [i8; 32],
//     pub Manufacturer: [i8; 64],
//     pub Name: [i8; 64],
//     pub Version: [i8; 64],
//     pub Description: [i8; 64],
// }

// UNSUPPORTED Rust 267:1: declaration Impl has no candidate rule
// impl Default for DEBUG_ANALYSIS_PROCESSOR_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DEBUG_ANY_ID`: UInt = 4294967295u;
public const val `DEBUG_ASMOPT_DEFAULT`: UInt = 0u;
public const val `DEBUG_ASMOPT_IGNORE_OUTPUT_WIDTH`: UInt = 4u;
public const val `DEBUG_ASMOPT_NO_CODE_BYTES`: UInt = 2u;
public const val `DEBUG_ASMOPT_SOURCE_LINE_NUMBER`: UInt = 8u;
public const val `DEBUG_ASMOPT_VERBOSE`: UInt = 1u;
public const val `DEBUG_ATTACH_DEFAULT`: UInt = 0u;
public const val `DEBUG_ATTACH_EXDI_DRIVER`: UInt = 2u;
public const val `DEBUG_ATTACH_EXISTING`: UInt = 2u;
public const val `DEBUG_ATTACH_INSTALL_DRIVER`: UInt = 4u;
public const val `DEBUG_ATTACH_INVASIVE_NO_INITIAL_BREAK`: UInt = 8u;
public const val `DEBUG_ATTACH_INVASIVE_RESUME_PROCESS`: UInt = 16u;
public const val `DEBUG_ATTACH_KERNEL_CONNECTION`: UInt = 0u;
public const val `DEBUG_ATTACH_LOCAL_KERNEL`: UInt = 1u;
public const val `DEBUG_ATTACH_NONINVASIVE`: UInt = 1u;
public const val `DEBUG_ATTACH_NONINVASIVE_ALLOW_PARTIAL`: UInt = 32u;
public const val `DEBUG_ATTACH_NONINVASIVE_NO_SUSPEND`: UInt = 4u;
public const val `DEBUG_BREAKPOINT_ADDER_ONLY`: UInt = 8u;
public const val `DEBUG_BREAKPOINT_CODE`: UInt = 0u;
public const val `DEBUG_BREAKPOINT_DATA`: UInt = 1u;
public const val `DEBUG_BREAKPOINT_DEFERRED`: UInt = 2u;
public const val `DEBUG_BREAKPOINT_ENABLED`: UInt = 4u;
public const val `DEBUG_BREAKPOINT_GO_ONLY`: UInt = 1u;
public const val `DEBUG_BREAKPOINT_INLINE`: UInt = 3u;
public const val `DEBUG_BREAKPOINT_ONE_SHOT`: UInt = 16u;
// UNSUPPORTED Rust 297:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DEBUG_BREAKPOINT_PARAMETERS {
//     pub Offset: u64,
//     pub Id: u32,
//     pub BreakType: u32,
//     pub ProcType: u32,
//     pub Flags: u32,
//     pub DataSize: u32,
//     pub DataAccessType: u32,
//     pub PassCount: u32,
//     pub CurrentPassCount: u32,
//     pub MatchThread: u32,
//     pub CommandSize: u32,
//     pub OffsetExpressionSize: u32,
// }

public const val `DEBUG_BREAKPOINT_TIME`: UInt = 2u;
public const val `DEBUG_BREAK_EXECUTE`: UInt = 4u;
public const val `DEBUG_BREAK_IO`: UInt = 8u;
public const val `DEBUG_BREAK_READ`: UInt = 1u;
public const val `DEBUG_BREAK_WRITE`: UInt = 2u;
// UNSUPPORTED Rust 318:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DEBUG_CACHED_SYMBOL_INFO {
//     pub ModBase: u64,
//     pub Arg1: u64,
//     pub Arg2: u64,
//     pub Id: u32,
//     pub Arg3: u32,
// }

public const val `DEBUG_CDS_ALL`: UInt = 4294967295u;
public const val `DEBUG_CDS_DATA`: UInt = 2u;
public const val `DEBUG_CDS_REFRESH`: UInt = 4u;
public const val `DEBUG_CDS_REFRESH_ADDBREAKPOINT`: UInt = 4u;
public const val `DEBUG_CDS_REFRESH_EVALUATE`: UInt = 1u;
public const val `DEBUG_CDS_REFRESH_EXECUTE`: UInt = 2u;
public const val `DEBUG_CDS_REFRESH_EXECUTECOMMANDFILE`: UInt = 3u;
public const val `DEBUG_CDS_REFRESH_INLINESTEP`: UInt = 16u;
public const val `DEBUG_CDS_REFRESH_INLINESTEP_PSEUDO`: UInt = 17u;
public const val `DEBUG_CDS_REFRESH_REMOVEBREAKPOINT`: UInt = 5u;
public const val `DEBUG_CDS_REFRESH_SETSCOPE`: UInt = 12u;
public const val `DEBUG_CDS_REFRESH_SETSCOPEFRAMEBYINDEX`: UInt = 13u;
public const val `DEBUG_CDS_REFRESH_SETSCOPEFROMJITDEBUGINFO`: UInt = 14u;
public const val `DEBUG_CDS_REFRESH_SETSCOPEFROMSTOREDEVENT`: UInt = 15u;
public const val `DEBUG_CDS_REFRESH_SETVALUE`: UInt = 10u;
public const val `DEBUG_CDS_REFRESH_SETVALUE2`: UInt = 11u;
public const val `DEBUG_CDS_REFRESH_WRITEPHYSICAL`: UInt = 8u;
public const val `DEBUG_CDS_REFRESH_WRITEPHYSICAL2`: UInt = 9u;
public const val `DEBUG_CDS_REFRESH_WRITEVIRTUAL`: UInt = 6u;
public const val `DEBUG_CDS_REFRESH_WRITEVIRTUALUNCACHED`: UInt = 7u;
public const val `DEBUG_CDS_REGISTERS`: UInt = 1u;
public const val `DEBUG_CES_ALL`: UInt = 4294967295u;
public const val `DEBUG_CES_ASSEMBLY_OPTIONS`: UInt = 4096u;
public const val `DEBUG_CES_BREAKPOINTS`: UInt = 4u;
public const val `DEBUG_CES_CODE_LEVEL`: UInt = 8u;
public const val `DEBUG_CES_CURRENT_THREAD`: UInt = 1u;
public const val `DEBUG_CES_EFFECTIVE_PROCESSOR`: UInt = 2u;
public const val `DEBUG_CES_ENGINE_OPTIONS`: UInt = 32u;
public const val `DEBUG_CES_EVENT_FILTERS`: UInt = 256u;
public const val `DEBUG_CES_EXECUTION_STATUS`: UInt = 16u;
public const val `DEBUG_CES_EXPRESSION_SYNTAX`: UInt = 8192u;
public const val `DEBUG_CES_EXTENSIONS`: UInt = 1024u;
public const val `DEBUG_CES_LOG_FILE`: UInt = 64u;
public const val `DEBUG_CES_PROCESS_OPTIONS`: UInt = 512u;
public const val `DEBUG_CES_RADIX`: UInt = 128u;
public const val `DEBUG_CES_SYSTEMS`: UInt = 2048u;
public const val `DEBUG_CES_TEXT_REPLACEMENTS`: UInt = 16384u;
public const val `DEBUG_CLASS_IMAGE_FILE`: UInt = 3u;
public const val `DEBUG_CLASS_KERNEL`: UInt = 1u;
public const val `DEBUG_CLASS_UNINITIALIZED`: UInt = 0u;
public const val `DEBUG_CLASS_USER_WINDOWS`: UInt = 2u;
public const val `DEBUG_CLIENT_CDB`: UInt = 4u;
// UNSUPPORTED Rust 369:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DEBUG_CLIENT_CONTEXT {
//     pub cbSize: u32,
//     pub eClient: u32,
// }

public const val `DEBUG_CLIENT_KD`: UInt = 5u;
public const val `DEBUG_CLIENT_NTKD`: UInt = 3u;
public const val `DEBUG_CLIENT_NTSD`: UInt = 2u;
public const val `DEBUG_CLIENT_UNKNOWN`: UInt = 0u;
public const val `DEBUG_CLIENT_VSINT`: UInt = 1u;
public const val `DEBUG_CLIENT_WINDBG`: UInt = 6u;
public const val `DEBUG_CLIENT_WINIDE`: UInt = 7u;
public const val `DEBUG_CMDEX_ADD_EVENT_STRING`: UInt = 1u;
public const val `DEBUG_CMDEX_INVALID`: UInt = 0u;
public const val `DEBUG_CMDEX_RESET_EVENT_STRINGS`: UInt = 2u;
public const val `DEBUG_COMMAND_EXCEPTION_ID`: UInt = 3688893886u;
public const val `DEBUG_CONNECT_SESSION_DEFAULT`: UInt = 0u;
public const val `DEBUG_CONNECT_SESSION_NO_ANNOUNCE`: UInt = 2u;
public const val `DEBUG_CONNECT_SESSION_NO_VERSION`: UInt = 1u;
// UNSUPPORTED Rust 389:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DEBUG_CPU_MICROCODE_VERSION {
//     pub SizeOfStruct: u32,
//     pub CachedSignature: i64,
//     pub InitialSignature: i64,
//     pub ProcessorModel: u32,
//     pub ProcessorFamily: u32,
//     pub ProcessorStepping: u32,
//     pub ProcessorArchRev: u32,
// }

// UNSUPPORTED Rust 400:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DEBUG_CPU_SPEED_INFO {
//     pub SizeOfStruct: u32,
//     pub CurrentSpeed: u32,
//     pub RatedSpeed: u32,
//     pub NameString: [u16; 256],
// }

// UNSUPPORTED Rust 408:1: declaration Impl has no candidate rule
// impl Default for DEBUG_CPU_SPEED_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 413:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DEBUG_CREATE_PROCESS_OPTIONS {
//     pub CreateFlags: u32,
//     pub EngCreateFlags: u32,
//     pub VerifierFlags: u32,
//     pub Reserved: u32,
// }

public const val `DEBUG_CSS_ALL`: UInt = 4294967295u;
public const val `DEBUG_CSS_COLLAPSE_CHILDREN`: UInt = 64u;
public const val `DEBUG_CSS_LOADS`: UInt = 1u;
public const val `DEBUG_CSS_PATHS`: UInt = 8u;
public const val `DEBUG_CSS_SCOPE`: UInt = 4u;
public const val `DEBUG_CSS_SYMBOL_OPTIONS`: UInt = 16u;
public const val `DEBUG_CSS_TYPE_OPTIONS`: UInt = 32u;
public const val `DEBUG_CSS_UNLOADS`: UInt = 2u;
public const val `DEBUG_CURRENT_DEFAULT`: UInt = 15u;
public const val `DEBUG_CURRENT_DISASM`: UInt = 2u;
public const val `DEBUG_CURRENT_REGISTERS`: UInt = 4u;
public const val `DEBUG_CURRENT_SOURCE_LINE`: UInt = 8u;
public const val `DEBUG_CURRENT_SYMBOL`: UInt = 1u;
public const val `DEBUG_DATA_BASE_TRANSLATION_VIRTUAL_OFFSET`: UInt = 3u;
public const val `DEBUG_DATA_BreakpointWithStatusAddr`: UInt = 32u;
public const val `DEBUG_DATA_CmNtCSDVersionAddr`: UInt = 616u;
public const val `DEBUG_DATA_DumpAttributes`: UInt = 100072u;
public const val `DEBUG_DATA_DumpFormatVersion`: UInt = 100040u;
public const val `DEBUG_DATA_DumpMmStorage`: UInt = 100064u;
public const val `DEBUG_DATA_DumpPowerState`: UInt = 100056u;
public const val `DEBUG_DATA_DumpWriterStatus`: UInt = 100032u;
public const val `DEBUG_DATA_DumpWriterVersion`: UInt = 100048u;
public const val `DEBUG_DATA_EtwpDebuggerData`: UInt = 816u;
public const val `DEBUG_DATA_ExpNumberOfPagedPoolsAddr`: UInt = 112u;
public const val `DEBUG_DATA_ExpPagedPoolDescriptorAddr`: UInt = 104u;
public const val `DEBUG_DATA_ExpSystemResourcesListAddr`: UInt = 96u;
public const val `DEBUG_DATA_IopErrorLogListHeadAddr`: UInt = 144u;
public const val `DEBUG_DATA_KPCR_OFFSET`: UInt = 0u;
public const val `DEBUG_DATA_KPRCB_OFFSET`: UInt = 1u;
public const val `DEBUG_DATA_KTHREAD_OFFSET`: UInt = 2u;
public const val `DEBUG_DATA_KdPrintBufferSizeAddr`: UInt = 720u;
public const val `DEBUG_DATA_KdPrintCircularBufferAddr`: UInt = 480u;
public const val `DEBUG_DATA_KdPrintCircularBufferEndAddr`: UInt = 488u;
public const val `DEBUG_DATA_KdPrintCircularBufferPtrAddr`: UInt = 712u;
public const val `DEBUG_DATA_KdPrintRolloverCountAddr`: UInt = 504u;
public const val `DEBUG_DATA_KdPrintWritePointerAddr`: UInt = 496u;
public const val `DEBUG_DATA_KeBugCheckCallbackListHeadAddr`: UInt = 128u;
public const val `DEBUG_DATA_KeTimeIncrementAddr`: UInt = 120u;
public const val `DEBUG_DATA_KeUserCallbackDispatcherAddr`: UInt = 64u;
public const val `DEBUG_DATA_KernBase`: UInt = 24u;
public const val `DEBUG_DATA_KernelVerifierAddr`: UInt = 576u;
public const val `DEBUG_DATA_KiBugcheckDataAddr`: UInt = 136u;
public const val `DEBUG_DATA_KiCallUserModeAddr`: UInt = 56u;
public const val `DEBUG_DATA_KiNormalSystemCall`: UInt = 528u;
public const val `DEBUG_DATA_KiProcessorBlockAddr`: UInt = 536u;
public const val `DEBUG_DATA_MmAllocatedNonPagedPoolAddr`: UInt = 592u;
public const val `DEBUG_DATA_MmAvailablePagesAddr`: UInt = 424u;
public const val `DEBUG_DATA_MmBadPagesDetected`: UInt = 800u;
public const val `DEBUG_DATA_MmDriverCommitAddr`: UInt = 352u;
public const val `DEBUG_DATA_MmExtendedCommitAddr`: UInt = 376u;
public const val `DEBUG_DATA_MmFreePageListHeadAddr`: UInt = 392u;
public const val `DEBUG_DATA_MmHighestPhysicalPageAddr`: UInt = 240u;
public const val `DEBUG_DATA_MmHighestUserAddressAddr`: UInt = 456u;
public const val `DEBUG_DATA_MmLastUnloadedDriverAddr`: UInt = 552u;
public const val `DEBUG_DATA_MmLoadedUserImageListAddr`: UInt = 512u;
public const val `DEBUG_DATA_MmLowestPhysicalPageAddr`: UInt = 232u;
public const val `DEBUG_DATA_MmMaximumNonPagedPoolInBytesAddr`: UInt = 256u;
public const val `DEBUG_DATA_MmModifiedNoWritePageListHeadAddr`: UInt = 416u;
public const val `DEBUG_DATA_MmModifiedPageListHeadAddr`: UInt = 408u;
public const val `DEBUG_DATA_MmNonPagedPoolEndAddr`: UInt = 280u;
public const val `DEBUG_DATA_MmNonPagedPoolStartAddr`: UInt = 272u;
public const val `DEBUG_DATA_MmNonPagedSystemStartAddr`: UInt = 264u;
public const val `DEBUG_DATA_MmNumberOfPagingFilesAddr`: UInt = 224u;
public const val `DEBUG_DATA_MmNumberOfPhysicalPagesAddr`: UInt = 248u;
public const val `DEBUG_DATA_MmPageSize`: UInt = 312u;
public const val `DEBUG_DATA_MmPagedPoolCommitAddr`: UInt = 368u;
public const val `DEBUG_DATA_MmPagedPoolEndAddr`: UInt = 296u;
public const val `DEBUG_DATA_MmPagedPoolInformationAddr`: UInt = 304u;
public const val `DEBUG_DATA_MmPagedPoolStartAddr`: UInt = 288u;
public const val `DEBUG_DATA_MmPeakCommitmentAddr`: UInt = 600u;
public const val `DEBUG_DATA_MmPfnDatabaseAddr`: UInt = 192u;
public const val `DEBUG_DATA_MmPhysicalMemoryBlockAddr`: UInt = 624u;
public const val `DEBUG_DATA_MmProcessCommitAddr`: UInt = 360u;
public const val `DEBUG_DATA_MmResidentAvailablePagesAddr`: UInt = 432u;
public const val `DEBUG_DATA_MmSessionBase`: UInt = 632u;
public const val `DEBUG_DATA_MmSessionSize`: UInt = 640u;
public const val `DEBUG_DATA_MmSharedCommitAddr`: UInt = 344u;
public const val `DEBUG_DATA_MmSizeOfPagedPoolInBytesAddr`: UInt = 320u;
public const val `DEBUG_DATA_MmSpecialPoolTagAddr`: UInt = 568u;
public const val `DEBUG_DATA_MmStandbyPageListHeadAddr`: UInt = 400u;
public const val `DEBUG_DATA_MmSubsectionBaseAddr`: UInt = 216u;
public const val `DEBUG_DATA_MmSystemCacheEndAddr`: UInt = 176u;
public const val `DEBUG_DATA_MmSystemCacheStartAddr`: UInt = 168u;
public const val `DEBUG_DATA_MmSystemCacheWsAddr`: UInt = 184u;
public const val `DEBUG_DATA_MmSystemParentTablePage`: UInt = 648u;
public const val `DEBUG_DATA_MmSystemPtesEndAddr`: UInt = 208u;
public const val `DEBUG_DATA_MmSystemPtesStartAddr`: UInt = 200u;
public const val `DEBUG_DATA_MmSystemRangeStartAddr`: UInt = 464u;
public const val `DEBUG_DATA_MmTotalCommitLimitAddr`: UInt = 328u;
public const val `DEBUG_DATA_MmTotalCommitLimitMaximumAddr`: UInt = 608u;
public const val `DEBUG_DATA_MmTotalCommittedPagesAddr`: UInt = 336u;
public const val `DEBUG_DATA_MmTriageActionTakenAddr`: UInt = 560u;
public const val `DEBUG_DATA_MmUnloadedDriversAddr`: UInt = 544u;
public const val `DEBUG_DATA_MmUserProbeAddressAddr`: UInt = 472u;
public const val `DEBUG_DATA_MmVerifierDataAddr`: UInt = 584u;
public const val `DEBUG_DATA_MmVirtualTranslationBase`: UInt = 656u;
public const val `DEBUG_DATA_MmZeroedPageListHeadAddr`: UInt = 384u;
public const val `DEBUG_DATA_NonPagedPoolDescriptorAddr`: UInt = 448u;
public const val `DEBUG_DATA_NtBuildLabAddr`: UInt = 520u;
public const val `DEBUG_DATA_ObpRootDirectoryObjectAddr`: UInt = 152u;
public const val `DEBUG_DATA_ObpTypeObjectTypeAddr`: UInt = 160u;
public const val `DEBUG_DATA_OffsetEprocessDirectoryTableBase`: UInt = 686u;
public const val `DEBUG_DATA_OffsetEprocessParentCID`: UInt = 684u;
public const val `DEBUG_DATA_OffsetEprocessPeb`: UInt = 682u;
public const val `DEBUG_DATA_OffsetKThreadApcProcess`: UInt = 672u;
public const val `DEBUG_DATA_OffsetKThreadBStore`: UInt = 676u;
public const val `DEBUG_DATA_OffsetKThreadBStoreLimit`: UInt = 678u;
public const val `DEBUG_DATA_OffsetKThreadInitialStack`: UInt = 670u;
public const val `DEBUG_DATA_OffsetKThreadKernelStack`: UInt = 668u;
public const val `DEBUG_DATA_OffsetKThreadNextProcessor`: UInt = 664u;
public const val `DEBUG_DATA_OffsetKThreadState`: UInt = 674u;
public const val `DEBUG_DATA_OffsetKThreadTeb`: UInt = 666u;
public const val `DEBUG_DATA_OffsetPrcbCpuType`: UInt = 696u;
public const val `DEBUG_DATA_OffsetPrcbCurrentThread`: UInt = 692u;
public const val `DEBUG_DATA_OffsetPrcbDpcRoutine`: UInt = 690u;
public const val `DEBUG_DATA_OffsetPrcbMhz`: UInt = 694u;
public const val `DEBUG_DATA_OffsetPrcbNumber`: UInt = 702u;
public const val `DEBUG_DATA_OffsetPrcbProcessorState`: UInt = 700u;
public const val `DEBUG_DATA_OffsetPrcbVendorString`: UInt = 698u;
public const val `DEBUG_DATA_PROCESSOR_IDENTIFICATION`: UInt = 4u;
public const val `DEBUG_DATA_PROCESSOR_SPEED`: UInt = 5u;
public const val `DEBUG_DATA_PaeEnabled`: UInt = 100000u;
public const val `DEBUG_DATA_PagingLevels`: UInt = 100080u;
public const val `DEBUG_DATA_PoolTrackTableAddr`: UInt = 440u;
public const val `DEBUG_DATA_ProductType`: UInt = 100016u;
public const val `DEBUG_DATA_PsActiveProcessHeadAddr`: UInt = 80u;
public const val `DEBUG_DATA_PsLoadedModuleListAddr`: UInt = 72u;
public const val `DEBUG_DATA_PspCidTableAddr`: UInt = 88u;
public const val `DEBUG_DATA_PteBase`: UInt = 864u;
public const val `DEBUG_DATA_SPACE_BUS_DATA`: UInt = 5u;
public const val `DEBUG_DATA_SPACE_CONTROL`: UInt = 2u;
public const val `DEBUG_DATA_SPACE_COUNT`: UInt = 7u;
public const val `DEBUG_DATA_SPACE_DEBUGGER_DATA`: UInt = 6u;
public const val `DEBUG_DATA_SPACE_IO`: UInt = 3u;
public const val `DEBUG_DATA_SPACE_MSR`: UInt = 4u;
public const val `DEBUG_DATA_SPACE_PHYSICAL`: UInt = 1u;
public const val `DEBUG_DATA_SPACE_VIRTUAL`: UInt = 0u;
public const val `DEBUG_DATA_SavedContextAddr`: UInt = 40u;
public const val `DEBUG_DATA_SharedUserData`: UInt = 100008u;
public const val `DEBUG_DATA_SizeEProcess`: UInt = 680u;
public const val `DEBUG_DATA_SizeEThread`: UInt = 704u;
public const val `DEBUG_DATA_SizePrcb`: UInt = 688u;
public const val `DEBUG_DATA_SuiteMask`: UInt = 100024u;
// UNSUPPORTED Rust 564:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DEBUG_DECODE_ERROR {
//     pub SizeOfStruct: u32,
//     pub Code: u32,
//     pub TreatAsStatus: windows_sys::core::BOOL,
//     pub Source: [i8; 64],
//     pub Message: [i8; 260],
// }

// UNSUPPORTED Rust 573:1: declaration Impl has no candidate rule
// impl Default for DEBUG_DECODE_ERROR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 578:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DEBUG_DEVICE_OBJECT_INFO {
//     pub SizeOfStruct: u32,
//     pub DevObjAddress: u64,
//     pub ReferenceCount: u32,
//     pub QBusy: windows_sys::core::BOOL,
//     pub DriverObject: u64,
//     pub CurrentIrp: u64,
//     pub DevExtension: u64,
//     pub DevObjExtension: u64,
// }

public const val `DEBUG_DISASM_EFFECTIVE_ADDRESS`: UInt = 1u;
public const val `DEBUG_DISASM_MATCHING_SYMBOLS`: UInt = 2u;
public const val `DEBUG_DISASM_SOURCE_FILE_NAME`: UInt = 8u;
public const val `DEBUG_DISASM_SOURCE_LINE_NUMBER`: UInt = 4u;
// UNSUPPORTED Rust 594:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DEBUG_DRIVER_OBJECT_INFO {
//     pub SizeOfStruct: u32,
//     pub DriverSize: u32,
//     pub DriverObjAddress: u64,
//     pub DriverStart: u64,
//     pub DriverExtension: u64,
//     pub DeviceObject: u64,
//     pub DriverName: DEBUG_DRIVER_OBJECT_INFO_0,
// }

// UNSUPPORTED Rust 605:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DEBUG_DRIVER_OBJECT_INFO_0 {
//     pub Length: u16,
//     pub MaximumLength: u16,
//     pub Buffer: u64,
// }

public const val `DEBUG_DUMP_ACTIVE`: UInt = 1030u;
public const val `DEBUG_DUMP_DEFAULT`: UInt = 1025u;
public const val `DEBUG_DUMP_FILE_BASE`: UInt = 4294967295u;
public const val `DEBUG_DUMP_FILE_LOAD_FAILED_INDEX`: UInt = 4294967295u;
public const val `DEBUG_DUMP_FILE_ORIGINAL_CAB_INDEX`: UInt = 4294967294u;
public const val `DEBUG_DUMP_FILE_PAGE_FILE_DUMP`: UInt = 0u;
public const val `DEBUG_DUMP_FULL`: UInt = 1026u;
public const val `DEBUG_DUMP_IMAGE_FILE`: UInt = 1027u;
public const val `DEBUG_DUMP_SMALL`: UInt = 1024u;
public const val `DEBUG_DUMP_TRACE_LOG`: UInt = 1028u;
public const val `DEBUG_DUMP_WINDOWS_CE`: UInt = 1029u;
public const val `DEBUG_ECREATE_PROCESS_DEFAULT`: UInt = 0u;
public const val `DEBUG_ECREATE_PROCESS_INHERIT_HANDLES`: UInt = 1u;
public const val `DEBUG_ECREATE_PROCESS_USE_IMPLICIT_COMMAND_LINE`: UInt = 4u;
public const val `DEBUG_ECREATE_PROCESS_USE_VERIFIER_FLAGS`: UInt = 2u;
public const val `DEBUG_EINDEX_FROM_CURRENT`: UInt = 2u;
public const val `DEBUG_EINDEX_FROM_END`: UInt = 1u;
public const val `DEBUG_EINDEX_FROM_START`: UInt = 0u;
public const val `DEBUG_EINDEX_NAME`: UInt = 0u;
public const val `DEBUG_END_ACTIVE_DETACH`: UInt = 2u;
public const val `DEBUG_END_ACTIVE_TERMINATE`: UInt = 1u;
public const val `DEBUG_END_DISCONNECT`: UInt = 4u;
public const val `DEBUG_END_PASSIVE`: UInt = 0u;
public const val `DEBUG_END_REENTRANT`: UInt = 3u;
public const val `DEBUG_ENGOPT_ALL`: UInt = 32505855u;
public const val `DEBUG_ENGOPT_ALLOW_NETWORK_PATHS`: UInt = 4u;
public const val `DEBUG_ENGOPT_ALLOW_READ_ONLY_BREAKPOINTS`: UInt = 1024u;
public const val `DEBUG_ENGOPT_DEBUGGING_SENSITIVE_DATA`: UInt = 4194304u;
public const val `DEBUG_ENGOPT_DISABLESQM`: UInt = 524288u;
public const val `DEBUG_ENGOPT_DISABLE_EXECUTION_COMMANDS`: UInt = 65536u;
public const val `DEBUG_ENGOPT_DISABLE_MANAGED_SUPPORT`: UInt = 16384u;
public const val `DEBUG_ENGOPT_DISABLE_MODULE_SYMBOL_LOAD`: UInt = 32768u;
public const val `DEBUG_ENGOPT_DISABLE_STEPLINES_OPTIONS`: UInt = 2097152u;
public const val `DEBUG_ENGOPT_DISALLOW_IMAGE_FILE_MAPPING`: UInt = 131072u;
public const val `DEBUG_ENGOPT_DISALLOW_NETWORK_PATHS`: UInt = 8u;
public const val `DEBUG_ENGOPT_DISALLOW_SHELL_COMMANDS`: UInt = 4096u;
public const val `DEBUG_ENGOPT_FAIL_INCOMPLETE_INFORMATION`: UInt = 512u;
public const val `DEBUG_ENGOPT_FINAL_BREAK`: UInt = 128u;
public const val `DEBUG_ENGOPT_IGNORE_DBGHELP_VERSION`: UInt = 1u;
public const val `DEBUG_ENGOPT_IGNORE_EXTENSION_VERSIONS`: UInt = 2u;
public const val `DEBUG_ENGOPT_IGNORE_LOADER_EXCEPTIONS`: UInt = 16u;
public const val `DEBUG_ENGOPT_INITIAL_BREAK`: UInt = 32u;
public const val `DEBUG_ENGOPT_INITIAL_MODULE_BREAK`: UInt = 64u;
public const val `DEBUG_ENGOPT_KD_QUIET_MODE`: UInt = 8192u;
public const val `DEBUG_ENGOPT_NO_EXECUTE_REPEAT`: UInt = 256u;
public const val `DEBUG_ENGOPT_PREFER_DML`: UInt = 262144u;
public const val `DEBUG_ENGOPT_PREFER_TRACE_FILES`: UInt = 8388608u;
public const val `DEBUG_ENGOPT_RESOLVE_SHADOWED_VARIABLES`: UInt = 16777216u;
public const val `DEBUG_ENGOPT_SYNCHRONIZE_BREAKPOINTS`: UInt = 2048u;
public const val `DEBUG_EVENT_BREAKPOINT`: UInt = 1u;
public const val `DEBUG_EVENT_CHANGE_DEBUGGEE_STATE`: UInt = 1024u;
public const val `DEBUG_EVENT_CHANGE_ENGINE_STATE`: UInt = 2048u;
public const val `DEBUG_EVENT_CHANGE_SYMBOL_STATE`: UInt = 4096u;
// UNSUPPORTED Rust 665:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DEBUG_EVENT_CONTEXT {
//     pub Size: u32,
//     pub ProcessEngineId: u32,
//     pub ThreadEngineId: u32,
//     pub FrameEngineId: u32,
// }

public const val `DEBUG_EVENT_CREATE_PROCESS`: UInt = 16u;
public const val `DEBUG_EVENT_CREATE_THREAD`: UInt = 4u;
public const val `DEBUG_EVENT_EXCEPTION`: UInt = 2u;
public const val `DEBUG_EVENT_EXIT_PROCESS`: UInt = 32u;
public const val `DEBUG_EVENT_EXIT_THREAD`: UInt = 8u;
public const val `DEBUG_EVENT_LOAD_MODULE`: UInt = 64u;
public const val `DEBUG_EVENT_SERVICE_EXCEPTION`: UInt = 8192u;
public const val `DEBUG_EVENT_SESSION_STATUS`: UInt = 512u;
public const val `DEBUG_EVENT_SYSTEM_ERROR`: UInt = 256u;
public const val `DEBUG_EVENT_UNLOAD_MODULE`: UInt = 128u;
// UNSUPPORTED Rust 683:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DEBUG_EXCEPTION_FILTER_PARAMETERS {
//     pub ExecutionOption: u32,
//     pub ContinueOption: u32,
//     pub TextSize: u32,
//     pub CommandSize: u32,
//     pub SecondCommandSize: u32,
//     pub ExceptionCode: u32,
// }

public const val `DEBUG_EXECUTE_DEFAULT`: UInt = 0u;
public const val `DEBUG_EXECUTE_ECHO`: UInt = 1u;
public const val `DEBUG_EXECUTE_EVENT`: UInt = 2048u;
public const val `DEBUG_EXECUTE_EXTENSION`: UInt = 32u;
public const val `DEBUG_EXECUTE_HOTKEY`: UInt = 1024u;
public const val `DEBUG_EXECUTE_INTERNAL`: UInt = 64u;
public const val `DEBUG_EXECUTE_MENU`: UInt = 512u;
public const val `DEBUG_EXECUTE_NOT_LOGGED`: UInt = 2u;
public const val `DEBUG_EXECUTE_NO_REPEAT`: UInt = 4u;
public const val `DEBUG_EXECUTE_SCRIPT`: UInt = 128u;
public const val `DEBUG_EXECUTE_TOOLBAR`: UInt = 256u;
public const val `DEBUG_EXECUTE_USER_CLICKED`: UInt = 16u;
public const val `DEBUG_EXECUTE_USER_TYPED`: UInt = 8u;
public const val `DEBUG_EXEC_FLAGS_NONBLOCK`: UInt = 1u;
public const val `DEBUG_EXPR_CPLUSPLUS`: UInt = 1u;
public const val `DEBUG_EXPR_MASM`: UInt = 0u;
public const val `DEBUG_EXTENSION_AT_ENGINE`: UInt = 0u;
public const val `DEBUG_EXTINIT_HAS_COMMAND_HELP`: UInt = 1u;
public const val `DEBUG_EXT_PVALUE_DEFAULT`: UInt = 0u;
public const val `DEBUG_EXT_PVTYPE_IS_POINTER`: UInt = 1u;
public const val `DEBUG_EXT_PVTYPE_IS_VALUE`: UInt = 0u;
public const val `DEBUG_EXT_QVALUE_DEFAULT`: UInt = 0u;
public typealias `DEBUG_FAILURE_TYPE` = Int;
public const val `DEBUG_FA_ENTRY_ANSI_STRING`: `FA_ENTRY_TYPE` = 5;
public const val `DEBUG_FA_ENTRY_ANSI_STRINGs`: `FA_ENTRY_TYPE` = 6;
public const val `DEBUG_FA_ENTRY_ARRAY`: `FA_ENTRY_TYPE` = 32768;
public const val `DEBUG_FA_ENTRY_EXTENSION_CMD`: `FA_ENTRY_TYPE` = 7;
public const val `DEBUG_FA_ENTRY_INSTRUCTION_OFFSET`: `FA_ENTRY_TYPE` = 3;
public const val `DEBUG_FA_ENTRY_NO_TYPE`: `FA_ENTRY_TYPE` = 0;
public const val `DEBUG_FA_ENTRY_POINTER`: `FA_ENTRY_TYPE` = 4;
public const val `DEBUG_FA_ENTRY_STRUCTURED_DATA`: `FA_ENTRY_TYPE` = 8;
public const val `DEBUG_FA_ENTRY_ULONG`: `FA_ENTRY_TYPE` = 1;
public const val `DEBUG_FA_ENTRY_ULONG64`: `FA_ENTRY_TYPE` = 2;
public const val `DEBUG_FA_ENTRY_UNICODE_STRING`: `FA_ENTRY_TYPE` = 9;
public const val `DEBUG_FILTER_BREAK`: UInt = 0u;
public const val `DEBUG_FILTER_CREATE_PROCESS`: UInt = 2u;
public const val `DEBUG_FILTER_CREATE_THREAD`: UInt = 0u;
public const val `DEBUG_FILTER_DEBUGGEE_OUTPUT`: UInt = 9u;
public const val `DEBUG_FILTER_EXIT_PROCESS`: UInt = 3u;
public const val `DEBUG_FILTER_EXIT_THREAD`: UInt = 1u;
public const val `DEBUG_FILTER_GO_HANDLED`: UInt = 0u;
public const val `DEBUG_FILTER_GO_NOT_HANDLED`: UInt = 1u;
public const val `DEBUG_FILTER_IGNORE`: UInt = 3u;
public const val `DEBUG_FILTER_INITIAL_BREAKPOINT`: UInt = 7u;
public const val `DEBUG_FILTER_INITIAL_MODULE_LOAD`: UInt = 8u;
public const val `DEBUG_FILTER_LOAD_MODULE`: UInt = 4u;
public const val `DEBUG_FILTER_OUTPUT`: UInt = 2u;
public const val `DEBUG_FILTER_REMOVE`: UInt = 4u;
public const val `DEBUG_FILTER_SECOND_CHANCE_BREAK`: UInt = 1u;
public const val `DEBUG_FILTER_SYSTEM_ERROR`: UInt = 6u;
public const val `DEBUG_FILTER_UNLOAD_MODULE`: UInt = 5u;
public const val `DEBUG_FIND_SOURCE_BEST_MATCH`: UInt = 2u;
public const val `DEBUG_FIND_SOURCE_DEFAULT`: UInt = 0u;
public const val `DEBUG_FIND_SOURCE_FULL_PATH`: UInt = 1u;
public const val `DEBUG_FIND_SOURCE_NO_SRCSRV`: UInt = 4u;
public const val `DEBUG_FIND_SOURCE_TOKEN_LOOKUP`: UInt = 8u;
public const val `DEBUG_FIND_SOURCE_WITH_CHECKSUM`: UInt = 16u;
public const val `DEBUG_FIND_SOURCE_WITH_CHECKSUM_STRICT`: UInt = 32u;
public const val `DEBUG_FLR_ACPI`: `DEBUG_FLR_PARAM_TYPE` = 24576;
public const val `DEBUG_FLR_ACPI_BLACKBOX`: `DEBUG_FLR_PARAM_TYPE` = 24832;
public const val `DEBUG_FLR_ACPI_EXTENSION`: `DEBUG_FLR_PARAM_TYPE` = 11;
public const val `DEBUG_FLR_ACPI_OBJECT`: `DEBUG_FLR_PARAM_TYPE` = 13;
public const val `DEBUG_FLR_ACPI_RESCONFLICT`: `DEBUG_FLR_PARAM_TYPE` = 12;
public const val `DEBUG_FLR_ADDITIONAL_DEBUGTEXT`: `DEBUG_FLR_PARAM_TYPE` = 65546;
public const val `DEBUG_FLR_ADDITIONAL_XML`: `DEBUG_FLR_PARAM_TYPE` = 1150976;
public const val `DEBUG_FLR_ADD_PROCESS_IN_BUCKET`: `DEBUG_FLR_PARAM_TYPE` = 8219;
public const val `DEBUG_FLR_ALUREON`: `DEBUG_FLR_PARAM_TYPE` = 12372;
public const val `DEBUG_FLR_ANALYSIS_REPROCESS`: `DEBUG_FLR_PARAM_TYPE` = 1052705;
public const val `DEBUG_FLR_ANALYSIS_SESSION_ELAPSED_TIME`: `DEBUG_FLR_PARAM_TYPE` = 1052701;
public const val `DEBUG_FLR_ANALYSIS_SESSION_HOST`: `DEBUG_FLR_PARAM_TYPE` = 1052700;
public const val `DEBUG_FLR_ANALYSIS_SESSION_TIME`: `DEBUG_FLR_PARAM_TYPE` = 1052699;
public const val `DEBUG_FLR_ANALYSIS_VERSION`: `DEBUG_FLR_PARAM_TYPE` = 1052702;
public const val `DEBUG_FLR_ANALYZABLE_POOL_CORRUPTION`: `DEBUG_FLR_PARAM_TYPE` = 8202;
public const val `DEBUG_FLR_APPKILL`: `DEBUG_FLR_PARAM_TYPE` = 8212;
public const val `DEBUG_FLR_APPLICATION_VERIFIER_LOADED`: `DEBUG_FLR_PARAM_TYPE` = 1048626;
public const val `DEBUG_FLR_APPS_NOT_TERMINATED`: `DEBUG_FLR_PARAM_TYPE` = 8258;
public const val `DEBUG_FLR_APPVERIFERFLAGS`: `DEBUG_FLR_PARAM_TYPE` = 1048600;
public const val `DEBUG_FLR_ARM_WRITE_AV_CAVEAT`: `DEBUG_FLR_PARAM_TYPE` = 8241;
public const val `DEBUG_FLR_ASSERT_DATA`: `DEBUG_FLR_PARAM_TYPE` = 768;
public const val `DEBUG_FLR_ASSERT_FILE`: `DEBUG_FLR_PARAM_TYPE` = 769;
public const val `DEBUG_FLR_ASSERT_INSTRUCTION`: `DEBUG_FLR_PARAM_TYPE` = 778;
public const val `DEBUG_FLR_BADPAGES_DETECTED`: `DEBUG_FLR_PARAM_TYPE` = 4109;
public const val `DEBUG_FLR_BAD_HANDLE`: `DEBUG_FLR_PARAM_TYPE` = 17;
public const val `DEBUG_FLR_BAD_MEMORY_REFERENCE`: `DEBUG_FLR_PARAM_TYPE` = 8210;
public const val `DEBUG_FLR_BAD_OBJECT_REFERENCE`: `DEBUG_FLR_PARAM_TYPE` = 8211;
public const val `DEBUG_FLR_BAD_STACK`: `DEBUG_FLR_PARAM_TYPE` = 8193;
public const val `DEBUG_FLR_BLOCKED_THREAD0`: `DEBUG_FLR_PARAM_TYPE` = -1073741818;
public const val `DEBUG_FLR_BLOCKED_THREAD1`: `DEBUG_FLR_PARAM_TYPE` = -1073741817;
public const val `DEBUG_FLR_BLOCKED_THREAD2`: `DEBUG_FLR_PARAM_TYPE` = -1073741816;
public const val `DEBUG_FLR_BLOCKING_PROCESSID`: `DEBUG_FLR_PARAM_TYPE` = -1073741815;
public const val `DEBUG_FLR_BLOCKING_THREAD`: `DEBUG_FLR_PARAM_TYPE` = -1073741820;
public const val `DEBUG_FLR_BOOST_FOLLOWUP_TO_SPECIFIC`: `DEBUG_FLR_PARAM_TYPE` = 8222;
public const val `DEBUG_FLR_BOOTSTAT`: `DEBUG_FLR_PARAM_TYPE` = 28672;
public const val `DEBUG_FLR_BOOTSTAT_BLACKBOX`: `DEBUG_FLR_PARAM_TYPE` = 28928;
public const val `DEBUG_FLR_BUCKET_ID`: `DEBUG_FLR_PARAM_TYPE` = 65536;
public const val `DEBUG_FLR_BUCKET_ID_CHECKSUM`: `DEBUG_FLR_PARAM_TYPE` = 1052684;
public const val `DEBUG_FLR_BUCKET_ID_FLAVOR_STR`: `DEBUG_FLR_PARAM_TYPE` = 1052686;
public const val `DEBUG_FLR_BUCKET_ID_FUNCTION_STR`: `DEBUG_FLR_PARAM_TYPE` = 1052676;
public const val `DEBUG_FLR_BUCKET_ID_FUNC_OFFSET`: `DEBUG_FLR_PARAM_TYPE` = 65589;
public const val `DEBUG_FLR_BUCKET_ID_IMAGE_STR`: `DEBUG_FLR_PARAM_TYPE` = 1052703;
public const val `DEBUG_FLR_BUCKET_ID_MODULE_STR`: `DEBUG_FLR_PARAM_TYPE` = 1052674;
public const val `DEBUG_FLR_BUCKET_ID_MODVER_STR`: `DEBUG_FLR_PARAM_TYPE` = 1052675;
public const val `DEBUG_FLR_BUCKET_ID_OFFSET`: `DEBUG_FLR_PARAM_TYPE` = 1052677;
public const val `DEBUG_FLR_BUCKET_ID_PREFIX_STR`: `DEBUG_FLR_PARAM_TYPE` = 1052673;
public const val `DEBUG_FLR_BUCKET_ID_PRIVATE`: `DEBUG_FLR_PARAM_TYPE` = 1052704;
public const val `DEBUG_FLR_BUCKET_ID_TIMEDATESTAMP`: `DEBUG_FLR_PARAM_TYPE` = 1052683;
public const val `DEBUG_FLR_BUGCHECKING_DRIVER`: `DEBUG_FLR_PARAM_TYPE` = 12292;
public const val `DEBUG_FLR_BUGCHECKING_DRIVER_IDTAG`: `DEBUG_FLR_PARAM_TYPE` = 65559;
public const val `DEBUG_FLR_BUGCHECK_CODE`: `DEBUG_FLR_PARAM_TYPE` = 4108;
public const val `DEBUG_FLR_BUGCHECK_DESC`: `DEBUG_FLR_PARAM_TYPE` = 1538;
public const val `DEBUG_FLR_BUGCHECK_P1`: `DEBUG_FLR_PARAM_TYPE` = 4115;
public const val `DEBUG_FLR_BUGCHECK_P2`: `DEBUG_FLR_PARAM_TYPE` = 4116;
public const val `DEBUG_FLR_BUGCHECK_P3`: `DEBUG_FLR_PARAM_TYPE` = 4117;
public const val `DEBUG_FLR_BUGCHECK_P4`: `DEBUG_FLR_PARAM_TYPE` = 4118;
public const val `DEBUG_FLR_BUGCHECK_SPECIFIER`: `DEBUG_FLR_PARAM_TYPE` = 1537;
public const val `DEBUG_FLR_BUGCHECK_STR`: `DEBUG_FLR_PARAM_TYPE` = 1536;
public const val `DEBUG_FLR_BUILDNAME_IN_BUCKET`: `DEBUG_FLR_PARAM_TYPE` = 12349;
public const val `DEBUG_FLR_BUILDOSVER_STR_deprecated`: `DEBUG_FLR_PARAM_TYPE` = 1052929;
public const val `DEBUG_FLR_BUILD_OS_FULL_VERSION_STRING`: `DEBUG_FLR_PARAM_TYPE` = 65567;
public const val `DEBUG_FLR_BUILD_VERSION_STRING`: `DEBUG_FLR_PARAM_TYPE` = 65566;
public const val `DEBUG_FLR_CANCELLATION_NOT_SUPPORTED`: `DEBUG_FLR_PARAM_TYPE` = 12350;
public const val `DEBUG_FLR_CHKIMG_EXTENSION`: `DEBUG_FLR_PARAM_TYPE` = 19;
public const val `DEBUG_FLR_CHPE_PROCESS`: `DEBUG_FLR_PARAM_TYPE` = -268435433;
public const val `DEBUG_FLR_CLIENT_DRIVER`: `DEBUG_FLR_PARAM_TYPE` = 1031;
public const val `DEBUG_FLR_COLLECT_DATA_FOR_BUCKET`: `DEBUG_FLR_PARAM_TYPE` = 65577;
public const val `DEBUG_FLR_COMPUTER_NAME`: `DEBUG_FLR_PARAM_TYPE` = 65578;
public const val `DEBUG_FLR_CONTEXT`: `DEBUG_FLR_PARAM_TYPE` = -1073741823;
public const val `DEBUG_FLR_CONTEXT_COMMAND`: `DEBUG_FLR_PARAM_TYPE` = 2097164;
public const val `DEBUG_FLR_CONTEXT_FLAGS`: `DEBUG_FLR_PARAM_TYPE` = 2097165;
public const val `DEBUG_FLR_CONTEXT_FOLLOWUP_INDEX`: `DEBUG_FLR_PARAM_TYPE` = 2097191;
public const val `DEBUG_FLR_CONTEXT_ID`: `DEBUG_FLR_PARAM_TYPE` = 2097168;
public const val `DEBUG_FLR_CONTEXT_METADATA`: `DEBUG_FLR_PARAM_TYPE` = 2097211;
public const val `DEBUG_FLR_CONTEXT_ORDER`: `DEBUG_FLR_PARAM_TYPE` = 2097166;
public const val `DEBUG_FLR_CONTEXT_RESTORE_COMMAND`: `DEBUG_FLR_PARAM_TYPE` = 65551;
public const val `DEBUG_FLR_CONTEXT_SYSTEM`: `DEBUG_FLR_PARAM_TYPE` = 2097167;
public const val `DEBUG_FLR_CORRUPTING_POOL_ADDRESS`: `DEBUG_FLR_PARAM_TYPE` = 1026;
public const val `DEBUG_FLR_CORRUPTING_POOL_TAG`: `DEBUG_FLR_PARAM_TYPE` = 1027;
public const val `DEBUG_FLR_CORRUPT_MODULE_LIST`: `DEBUG_FLR_PARAM_TYPE` = 8192;
public const val `DEBUG_FLR_CORRUPT_SERVICE_TABLE`: `DEBUG_FLR_PARAM_TYPE` = 12308;
public const val `DEBUG_FLR_COVERAGE_BUILD`: `DEBUG_FLR_PARAM_TYPE` = 8244;
public const val `DEBUG_FLR_CPU_COUNT`: `DEBUG_FLR_PARAM_TYPE` = 12330;
public const val `DEBUG_FLR_CPU_FAMILY`: `DEBUG_FLR_PARAM_TYPE` = 12333;
public const val `DEBUG_FLR_CPU_MICROCODE_VERSION`: `DEBUG_FLR_PARAM_TYPE` = 12329;
public const val `DEBUG_FLR_CPU_MICROCODE_ZERO_INTEL`: `DEBUG_FLR_PARAM_TYPE` = 8228;
public const val `DEBUG_FLR_CPU_MODEL`: `DEBUG_FLR_PARAM_TYPE` = 12334;
public const val `DEBUG_FLR_CPU_OVERCLOCKED`: `DEBUG_FLR_PARAM_TYPE` = 8198;
public const val `DEBUG_FLR_CPU_SPEED`: `DEBUG_FLR_PARAM_TYPE` = 12331;
public const val `DEBUG_FLR_CPU_STEPPING`: `DEBUG_FLR_PARAM_TYPE` = 12335;
public const val `DEBUG_FLR_CPU_VENDOR`: `DEBUG_FLR_PARAM_TYPE` = 12332;
public const val `DEBUG_FLR_CRITICAL_PROCESS`: `DEBUG_FLR_PARAM_TYPE` = 4119;
public const val `DEBUG_FLR_CRITICAL_PROCESS_REPORTGUID`: `DEBUG_FLR_PARAM_TYPE` = 65628;
public const val `DEBUG_FLR_CRITICAL_SECTION`: `DEBUG_FLR_PARAM_TYPE` = 16;
public const val `DEBUG_FLR_CURRENT_IRQL`: `DEBUG_FLR_PARAM_TYPE` = 512;
public const val `DEBUG_FLR_CUSTOMER_CRASH_COUNT`: `DEBUG_FLR_PARAM_TYPE` = 12299;
public const val `DEBUG_FLR_CUSTOMREPORTTAG`: `DEBUG_FLR_PARAM_TYPE` = -268435454;
public const val `DEBUG_FLR_CUSTOM_ANALYSIS_TAG_MAX`: `DEBUG_FLR_PARAM_TYPE` = -1342177280;
public const val `DEBUG_FLR_CUSTOM_ANALYSIS_TAG_MIN`: `DEBUG_FLR_PARAM_TYPE` = -1610612736;
public const val `DEBUG_FLR_CUSTOM_COMMAND`: `DEBUG_FLR_PARAM_TYPE` = -268435431;
public const val `DEBUG_FLR_CUSTOM_COMMAND_OUTPUT`: `DEBUG_FLR_PARAM_TYPE` = -268435430;
public const val `DEBUG_FLR_DEADLOCK_INPROC`: `DEBUG_FLR_PARAM_TYPE` = 1048589;
public const val `DEBUG_FLR_DEADLOCK_XPROC`: `DEBUG_FLR_PARAM_TYPE` = 1048590;
public const val `DEBUG_FLR_DEBUG_ANALYSIS`: `DEBUG_FLR_PARAM_TYPE` = 1118208;
public const val `DEBUG_FLR_DEFAULT_BUCKET_ID`: `DEBUG_FLR_PARAM_TYPE` = 65544;
public const val `DEBUG_FLR_DEFAULT_SOLUTION_ID`: `DEBUG_FLR_PARAM_TYPE` = 12294;
public const val `DEBUG_FLR_DERIVED_WAIT_CHAIN`: `DEBUG_FLR_PARAM_TYPE` = 1048583;
public const val `DEBUG_FLR_DESKTOP_HEAP_MISSING`: `DEBUG_FLR_PARAM_TYPE` = 1048593;
public const val `DEBUG_FLR_DETOURED_IMAGE`: `DEBUG_FLR_PARAM_TYPE` = 12351;
public const val `DEBUG_FLR_DEVICE_NODE`: `DEBUG_FLR_PARAM_TYPE` = 28;
public const val `DEBUG_FLR_DEVICE_OBJECT`: `DEBUG_FLR_PARAM_TYPE` = 3;
public const val `DEBUG_FLR_DISKIO_READ_FAILURE`: `DEBUG_FLR_PARAM_TYPE` = 12353;
public const val `DEBUG_FLR_DISKIO_WRITE_FAILURE`: `DEBUG_FLR_PARAM_TYPE` = 12354;
public const val `DEBUG_FLR_DISKSEC_ISSUEDESCSTRING_DEPRECATED`: `DEBUG_FLR_PARAM_TYPE` = -268435450;
public const val `DEBUG_FLR_DISKSEC_MFGID_DEPRECATED`: `DEBUG_FLR_PARAM_TYPE` = -268435451;
public const val `DEBUG_FLR_DISKSEC_MODEL_DEPRECATED`: `DEBUG_FLR_PARAM_TYPE` = -268435452;
public const val `DEBUG_FLR_DISKSEC_ORGID_DEPRECATED`: `DEBUG_FLR_PARAM_TYPE` = -268435453;
public const val `DEBUG_FLR_DISKSEC_PRIVATE_DATASIZE_DEPRECATED`: `DEBUG_FLR_PARAM_TYPE` = -268435444;
public const val `DEBUG_FLR_DISKSEC_PRIVATE_OFFSET_DEPRECATED`: `DEBUG_FLR_PARAM_TYPE` = -268435445;
public const val `DEBUG_FLR_DISKSEC_PRIVATE_TOTSIZE_DEPRECATED`: `DEBUG_FLR_PARAM_TYPE` = -268435446;
public const val `DEBUG_FLR_DISKSEC_PUBLIC_DATASIZE_DEPRECATED`: `DEBUG_FLR_PARAM_TYPE` = -268435447;
public const val `DEBUG_FLR_DISKSEC_PUBLIC_OFFSET_DEPRECATED`: `DEBUG_FLR_PARAM_TYPE` = -268435448;
public const val `DEBUG_FLR_DISKSEC_PUBLIC_TOTSIZE_DEPRECATED`: `DEBUG_FLR_PARAM_TYPE` = -268435449;
public const val `DEBUG_FLR_DISKSEC_REASON_DEPRECATED`: `DEBUG_FLR_PARAM_TYPE` = -268435442;
public const val `DEBUG_FLR_DISKSEC_TOTALSIZE_DEPRECATED`: `DEBUG_FLR_PARAM_TYPE` = -268435443;
public const val `DEBUG_FLR_DISK_HARDWARE_ERROR`: `DEBUG_FLR_PARAM_TYPE` = 8206;
public const val `DEBUG_FLR_DPC_RUNTIME`: `DEBUG_FLR_PARAM_TYPE` = 4111;
public const val `DEBUG_FLR_DPC_STACK_BASE`: `DEBUG_FLR_PARAM_TYPE` = -1073741809;
public const val `DEBUG_FLR_DPC_TIMELIMIT`: `DEBUG_FLR_PARAM_TYPE` = 4112;
public const val `DEBUG_FLR_DPC_TIMEOUT_TYPE`: `DEBUG_FLR_PARAM_TYPE` = 4110;
public const val `DEBUG_FLR_DRIVER_HARDWAREID`: `DEBUG_FLR_PARAM_TYPE` = 65552;
public const val `DEBUG_FLR_DRIVER_HARDWARE_DEVICE_ID`: `DEBUG_FLR_PARAM_TYPE` = 65554;
public const val `DEBUG_FLR_DRIVER_HARDWARE_DEVICE_NAME`: `DEBUG_FLR_PARAM_TYPE` = 65633;
public const val `DEBUG_FLR_DRIVER_HARDWARE_ID_BUS_TYPE`: `DEBUG_FLR_PARAM_TYPE` = 65557;
public const val `DEBUG_FLR_DRIVER_HARDWARE_REV_ID`: `DEBUG_FLR_PARAM_TYPE` = 65556;
public const val `DEBUG_FLR_DRIVER_HARDWARE_SUBSYS_ID`: `DEBUG_FLR_PARAM_TYPE` = 65555;
public const val `DEBUG_FLR_DRIVER_HARDWARE_SUBVENDOR_NAME`: `DEBUG_FLR_PARAM_TYPE` = 65632;
public const val `DEBUG_FLR_DRIVER_HARDWARE_VENDOR_ID`: `DEBUG_FLR_PARAM_TYPE` = 65553;
public const val `DEBUG_FLR_DRIVER_HARDWARE_VENDOR_NAME`: `DEBUG_FLR_PARAM_TYPE` = 65631;
public const val `DEBUG_FLR_DRIVER_OBJECT`: `DEBUG_FLR_PARAM_TYPE` = 2;
public const val `DEBUG_FLR_DRIVER_VERIFIER_IO_VIOLATION_TYPE`: `DEBUG_FLR_PARAM_TYPE` = 4096;
public const val `DEBUG_FLR_DRIVER_XML_DESCRIPTION`: `DEBUG_FLR_PARAM_TYPE` = 65562;
public const val `DEBUG_FLR_DRIVER_XML_MANUFACTURER`: `DEBUG_FLR_PARAM_TYPE` = 65564;
public const val `DEBUG_FLR_DRIVER_XML_PRODUCTNAME`: `DEBUG_FLR_PARAM_TYPE` = 65563;
public const val `DEBUG_FLR_DRIVER_XML_VERSION`: `DEBUG_FLR_PARAM_TYPE` = 65565;
public const val `DEBUG_FLR_DRVPOWERSTATE_SUBCODE`: `DEBUG_FLR_PARAM_TYPE` = 4101;
public const val `DEBUG_FLR_DUMPSTREAM_COMMENTA`: `DEBUG_FLR_PARAM_TYPE` = -268435435;
public const val `DEBUG_FLR_DUMPSTREAM_COMMENTW`: `DEBUG_FLR_PARAM_TYPE` = -268435434;
public const val `DEBUG_FLR_DUMP_CLASS`: `DEBUG_FLR_PARAM_TYPE` = 1048627;
public const val `DEBUG_FLR_DUMP_FILE_ATTRIBUTES`: `DEBUG_FLR_PARAM_TYPE` = 4113;
public const val `DEBUG_FLR_DUMP_FLAGS`: `DEBUG_FLR_PARAM_TYPE` = 1048625;
public const val `DEBUG_FLR_DUMP_QUALIFIER`: `DEBUG_FLR_PARAM_TYPE` = 1048628;
public const val `DEBUG_FLR_DUMP_TYPE`: `DEBUG_FLR_PARAM_TYPE` = 1048602;
public const val `DEBUG_FLR_END_MESSAGE`: `DEBUG_FLR_PARAM_TYPE` = 65612;
public const val `DEBUG_FLR_ERESOURCE_ADDRESS`: `DEBUG_FLR_PARAM_TYPE` = 22;
public const val `DEBUG_FLR_EVENT_CODE_DATA_MISMATCH`: `DEBUG_FLR_PARAM_TYPE` = 12338;
public const val `DEBUG_FLR_EXCEPTION_CODE`: `DEBUG_FLR_PARAM_TYPE` = 4097;
public const val `DEBUG_FLR_EXCEPTION_CODE_STR`: `DEBUG_FLR_PARAM_TYPE` = 4098;
public const val `DEBUG_FLR_EXCEPTION_CODE_STR_deprecated`: `DEBUG_FLR_PARAM_TYPE` = 1052672;
public const val `DEBUG_FLR_EXCEPTION_CONTEXT_RECURSION`: `DEBUG_FLR_PARAM_TYPE` = 12352;
public const val `DEBUG_FLR_EXCEPTION_DOESNOT_MATCH_CODE`: `DEBUG_FLR_PARAM_TYPE` = 777;
public const val `DEBUG_FLR_EXCEPTION_MODULE_INFO`: `DEBUG_FLR_PARAM_TYPE` = 2097190;
public const val `DEBUG_FLR_EXCEPTION_PARAMETER1`: `DEBUG_FLR_PARAM_TYPE` = 770;
public const val `DEBUG_FLR_EXCEPTION_PARAMETER2`: `DEBUG_FLR_PARAM_TYPE` = 771;
public const val `DEBUG_FLR_EXCEPTION_PARAMETER3`: `DEBUG_FLR_PARAM_TYPE` = 772;
public const val `DEBUG_FLR_EXCEPTION_PARAMETER4`: `DEBUG_FLR_PARAM_TYPE` = 773;
public const val `DEBUG_FLR_EXCEPTION_RECORD`: `DEBUG_FLR_PARAM_TYPE` = 774;
public const val `DEBUG_FLR_EXCEPTION_STR`: `DEBUG_FLR_PARAM_TYPE` = 776;
public const val `DEBUG_FLR_EXECUTE_ADDRESS`: `DEBUG_FLR_PARAM_TYPE` = 30;
public const val `DEBUG_FLR_FAILED_INSTRUCTION_ADDRESS`: `DEBUG_FLR_PARAM_TYPE` = 9;
public const val `DEBUG_FLR_FAILURE_ANALYSIS_SOURCE`: `DEBUG_FLR_PARAM_TYPE` = 65591;
public const val `DEBUG_FLR_FAILURE_BUCKET_ID`: `DEBUG_FLR_PARAM_TYPE` = 65561;
public const val `DEBUG_FLR_FAILURE_DISPLAY_NAME`: `DEBUG_FLR_PARAM_TYPE` = 2097239;
public const val `DEBUG_FLR_FAILURE_EXCEPTION_CODE`: `DEBUG_FLR_PARAM_TYPE` = 65607;
public const val `DEBUG_FLR_FAILURE_FUNCTION_NAME`: `DEBUG_FLR_PARAM_TYPE` = 65609;
public const val `DEBUG_FLR_FAILURE_ID_HASH`: `DEBUG_FLR_PARAM_TYPE` = 65592;
public const val `DEBUG_FLR_FAILURE_ID_HASH_STRING`: `DEBUG_FLR_PARAM_TYPE` = 65593;
public const val `DEBUG_FLR_FAILURE_ID_REPORT_LINK`: `DEBUG_FLR_PARAM_TYPE` = 65594;
public const val `DEBUG_FLR_FAILURE_IMAGE_NAME`: `DEBUG_FLR_PARAM_TYPE` = 65608;
public const val `DEBUG_FLR_FAILURE_LIST`: `DEBUG_FLR_PARAM_TYPE` = 2097238;
public const val `DEBUG_FLR_FAILURE_MODULE_NAME`: `DEBUG_FLR_PARAM_TYPE` = 65629;
public const val `DEBUG_FLR_FAILURE_PROBLEM_CLASS`: `DEBUG_FLR_PARAM_TYPE` = 65606;
public const val `DEBUG_FLR_FAILURE_SYMBOL_NAME`: `DEBUG_FLR_PARAM_TYPE` = 65610;
public const val `DEBUG_FLR_FAULTING_INSTR_CODE`: `DEBUG_FLR_PARAM_TYPE` = 12297;
public const val `DEBUG_FLR_FAULTING_IP`: `DEBUG_FLR_PARAM_TYPE` = -2147483648;
public const val `DEBUG_FLR_FAULTING_LOCAL_VARIABLE_NAME`: `DEBUG_FLR_PARAM_TYPE` = 1048623;
public const val `DEBUG_FLR_FAULTING_MODULE`: `DEBUG_FLR_PARAM_TYPE` = -2147483647;
public const val `DEBUG_FLR_FAULTING_SERVICE_NAME`: `DEBUG_FLR_PARAM_TYPE` = 65570;
public const val `DEBUG_FLR_FAULTING_SOURCE_CODE`: `DEBUG_FLR_PARAM_TYPE` = 65569;
public const val `DEBUG_FLR_FAULTING_SOURCE_COMMIT_ID`: `DEBUG_FLR_PARAM_TYPE` = 65634;
public const val `DEBUG_FLR_FAULTING_SOURCE_CONTROL_TYPE`: `DEBUG_FLR_PARAM_TYPE` = 65635;
public const val `DEBUG_FLR_FAULTING_SOURCE_FILE`: `DEBUG_FLR_PARAM_TYPE` = 65586;
public const val `DEBUG_FLR_FAULTING_SOURCE_LINE`: `DEBUG_FLR_PARAM_TYPE` = 65585;
public const val `DEBUG_FLR_FAULTING_SOURCE_LINE_NUMBER`: `DEBUG_FLR_PARAM_TYPE` = 65587;
public const val `DEBUG_FLR_FAULTING_SOURCE_PROJECT`: `DEBUG_FLR_PARAM_TYPE` = 65636;
public const val `DEBUG_FLR_FAULTING_SOURCE_REPO_ID`: `DEBUG_FLR_PARAM_TYPE` = 65637;
public const val `DEBUG_FLR_FAULTING_SOURCE_REPO_URL`: `DEBUG_FLR_PARAM_TYPE` = 65638;
public const val `DEBUG_FLR_FAULTING_SOURCE_SRV_COMMAND`: `DEBUG_FLR_PARAM_TYPE` = 65639;
public const val `DEBUG_FLR_FAULTING_THREAD`: `DEBUG_FLR_PARAM_TYPE` = -1073741824;
public const val `DEBUG_FLR_FAULT_THREAD_SHA1_HASH_M`: `DEBUG_FLR_PARAM_TYPE` = 1048597;
public const val `DEBUG_FLR_FAULT_THREAD_SHA1_HASH_MF`: `DEBUG_FLR_PARAM_TYPE` = 1048595;
public const val `DEBUG_FLR_FAULT_THREAD_SHA1_HASH_MFO`: `DEBUG_FLR_PARAM_TYPE` = 1048596;
public const val `DEBUG_FLR_FA_ADHOC_ANALYSIS_ITEMS`: `DEBUG_FLR_PARAM_TYPE` = 2097230;
public const val `DEBUG_FLR_FA_PERF_DATA`: `DEBUG_FLR_PARAM_TYPE` = 2097214;
public const val `DEBUG_FLR_FA_PERF_ELAPSED_MS`: `DEBUG_FLR_PARAM_TYPE` = 2097218;
public const val `DEBUG_FLR_FA_PERF_ITEM`: `DEBUG_FLR_PARAM_TYPE` = 2097215;
public const val `DEBUG_FLR_FA_PERF_ITEM_NAME`: `DEBUG_FLR_PARAM_TYPE` = 2097216;
public const val `DEBUG_FLR_FA_PERF_ITERATIONS`: `DEBUG_FLR_PARAM_TYPE` = 2097217;
public const val `DEBUG_FLR_FEATURE_PATH`: `DEBUG_FLR_PARAM_TYPE` = 65613;
public const val `DEBUG_FLR_FILESYSTEMS_NTFS`: `DEBUG_FLR_PARAM_TYPE` = 30208;
public const val `DEBUG_FLR_FILESYSTEMS_NTFS_BLACKBOX`: `DEBUG_FLR_PARAM_TYPE` = 30448;
public const val `DEBUG_FLR_FILESYSTEMS_REFS`: `DEBUG_FLR_PARAM_TYPE` = 30720;
public const val `DEBUG_FLR_FILESYSTEMS_REFS_BLACKBOX`: `DEBUG_FLR_PARAM_TYPE` = 30960;
public const val `DEBUG_FLR_FILE_ID`: `DEBUG_FLR_PARAM_TYPE` = 1280;
public const val `DEBUG_FLR_FILE_IN_CAB`: `DEBUG_FLR_PARAM_TYPE` = 65571;
public const val `DEBUG_FLR_FILE_LINE`: `DEBUG_FLR_PARAM_TYPE` = 1281;
public const val `DEBUG_FLR_FIXED_IN_OSVERSION`: `DEBUG_FLR_PARAM_TYPE` = 65543;
public const val `DEBUG_FLR_FOLLOWUP_BEFORE_RETRACER`: `DEBUG_FLR_PARAM_TYPE` = 65611;
public const val `DEBUG_FLR_FOLLOWUP_BUCKET_ID`: `DEBUG_FLR_PARAM_TYPE` = -2147483641;
public const val `DEBUG_FLR_FOLLOWUP_CONTEXT`: `DEBUG_FLR_PARAM_TYPE` = 2097153;
public const val `DEBUG_FLR_FOLLOWUP_DRIVER_ONLY`: `DEBUG_FLR_PARAM_TYPE` = 8196;
public const val `DEBUG_FLR_FOLLOWUP_IP`: `DEBUG_FLR_PARAM_TYPE` = -2147483645;
public const val `DEBUG_FLR_FOLLOWUP_NAME`: `DEBUG_FLR_PARAM_TYPE` = 65539;
public const val `DEBUG_FLR_FRAME_ONE_INVALID`: `DEBUG_FLR_PARAM_TYPE` = -2147483644;
public const val `DEBUG_FLR_FRAME_SOURCE_FILE_NAME`: `DEBUG_FLR_PARAM_TYPE` = 2097240;
public const val `DEBUG_FLR_FRAME_SOURCE_FILE_PATH`: `DEBUG_FLR_PARAM_TYPE` = 2097241;
public const val `DEBUG_FLR_FRAME_SOURCE_LINE_NUMBER`: `DEBUG_FLR_PARAM_TYPE` = 2097242;
public const val `DEBUG_FLR_FREED_POOL_TAG`: `DEBUG_FLR_PARAM_TYPE` = 1028;
public const val `DEBUG_FLR_GSFAILURE_ANALYSIS_TEXT`: `DEBUG_FLR_PARAM_TYPE` = 12323;
public const val `DEBUG_FLR_GSFAILURE_COOKIES_MATCH_EXH`: `DEBUG_FLR_PARAM_TYPE` = 12356;
public const val `DEBUG_FLR_GSFAILURE_CORRUPTED_COOKIE`: `DEBUG_FLR_PARAM_TYPE` = 12314;
public const val `DEBUG_FLR_GSFAILURE_CORRUPTED_EBP`: `DEBUG_FLR_PARAM_TYPE` = 12315;
public const val `DEBUG_FLR_GSFAILURE_CORRUPTED_EBPESP`: `DEBUG_FLR_PARAM_TYPE` = 12318;
public const val `DEBUG_FLR_GSFAILURE_FALSE_POSITIVE`: `DEBUG_FLR_PARAM_TYPE` = 8236;
public const val `DEBUG_FLR_GSFAILURE_FRAME_COOKIE`: `DEBUG_FLR_PARAM_TYPE` = 12312;
public const val `DEBUG_FLR_GSFAILURE_FRAME_COOKIE_COMPLEMENT`: `DEBUG_FLR_PARAM_TYPE` = 12313;
public const val `DEBUG_FLR_GSFAILURE_FUNCTION`: `DEBUG_FLR_PARAM_TYPE` = 12310;
public const val `DEBUG_FLR_GSFAILURE_MANAGED`: `DEBUG_FLR_PARAM_TYPE` = 12357;
public const val `DEBUG_FLR_GSFAILURE_MANAGED_FRAMEID`: `DEBUG_FLR_PARAM_TYPE` = 12360;
public const val `DEBUG_FLR_GSFAILURE_MANAGED_THREADID`: `DEBUG_FLR_PARAM_TYPE` = 12359;
public const val `DEBUG_FLR_GSFAILURE_MEMORY_READ_ERROR`: `DEBUG_FLR_PARAM_TYPE` = 12320;
public const val `DEBUG_FLR_GSFAILURE_MISSING_ESTABLISHER_FRAME`: `DEBUG_FLR_PARAM_TYPE` = 12355;
public const val `DEBUG_FLR_GSFAILURE_MODULE_COOKIE`: `DEBUG_FLR_PARAM_TYPE` = 12311;
public const val `DEBUG_FLR_GSFAILURE_NOT_UP2DATE`: `DEBUG_FLR_PARAM_TYPE` = 12326;
public const val `DEBUG_FLR_GSFAILURE_OFF_BY_ONE_OVERRUN`: `DEBUG_FLR_PARAM_TYPE` = 12324;
public const val `DEBUG_FLR_GSFAILURE_OVERRUN_LOCAL`: `DEBUG_FLR_PARAM_TYPE` = 12316;
public const val `DEBUG_FLR_GSFAILURE_OVERRUN_LOCAL_NAME`: `DEBUG_FLR_PARAM_TYPE` = 12317;
public const val `DEBUG_FLR_GSFAILURE_POSITIVELY_CORRUPTED_EBPESP`: `DEBUG_FLR_PARAM_TYPE` = 12319;
public const val `DEBUG_FLR_GSFAILURE_POSITIVE_BUFFER_OVERFLOW`: `DEBUG_FLR_PARAM_TYPE` = 12322;
public const val `DEBUG_FLR_GSFAILURE_PROBABLY_NOT_USING_GS`: `DEBUG_FLR_PARAM_TYPE` = 12321;
public const val `DEBUG_FLR_GSFAILURE_RA_SMASHED`: `DEBUG_FLR_PARAM_TYPE` = 12325;
public const val `DEBUG_FLR_GSFAILURE_UP2DATE_UNKNOWN`: `DEBUG_FLR_PARAM_TYPE` = 12327;
public const val `DEBUG_FLR_HANDLE_VALUE`: `DEBUG_FLR_PARAM_TYPE` = 24;
public const val `DEBUG_FLR_HANG`: `DEBUG_FLR_PARAM_TYPE` = 8209;
public const val `DEBUG_FLR_HANG_DATA_NEEDED`: `DEBUG_FLR_PARAM_TYPE` = 1048584;
public const val `DEBUG_FLR_HANG_REPORT_THREAD_IS_IDLE`: `DEBUG_FLR_PARAM_TYPE` = 1048594;
public const val `DEBUG_FLR_HARDWARE_BUCKET_TAG`: `DEBUG_FLR_PARAM_TYPE` = 65581;
public const val `DEBUG_FLR_HARDWARE_ERROR`: `DEBUG_FLR_PARAM_TYPE` = 8214;
public const val `DEBUG_FLR_HIGH_NONPAGED_POOL_USAGE`: `DEBUG_FLR_PARAM_TYPE` = 8255;
public const val `DEBUG_FLR_HIGH_PAGED_POOL_USAGE`: `DEBUG_FLR_PARAM_TYPE` = 8256;
public const val `DEBUG_FLR_HIGH_PROCESS_COMMIT`: `DEBUG_FLR_PARAM_TYPE` = 8253;
public const val `DEBUG_FLR_HIGH_SERVICE_COMMIT`: `DEBUG_FLR_PARAM_TYPE` = 8254;
public const val `DEBUG_FLR_HIGH_SHARED_COMMIT_USAGE`: `DEBUG_FLR_PARAM_TYPE` = 8257;
public const val `DEBUG_FLR_HOLDINFO`: `DEBUG_FLR_PARAM_TYPE` = 65595;
public const val `DEBUG_FLR_HOLDINFO_ACTIVE_HOLD_COUNT`: `DEBUG_FLR_PARAM_TYPE` = 65596;
public const val `DEBUG_FLR_HOLDINFO_ALWAYS_HOLD`: `DEBUG_FLR_PARAM_TYPE` = 65600;
public const val `DEBUG_FLR_HOLDINFO_ALWAYS_IGNORE`: `DEBUG_FLR_PARAM_TYPE` = 65599;
public const val `DEBUG_FLR_HOLDINFO_HISTORIC_HOLD_COUNT`: `DEBUG_FLR_PARAM_TYPE` = 65598;
public const val `DEBUG_FLR_HOLDINFO_LAST_SEEN_HOLD_DATE`: `DEBUG_FLR_PARAM_TYPE` = 65604;
public const val `DEBUG_FLR_HOLDINFO_MANUAL_HOLD`: `DEBUG_FLR_PARAM_TYPE` = 65602;
public const val `DEBUG_FLR_HOLDINFO_MAX_HOLD_LIMIT`: `DEBUG_FLR_PARAM_TYPE` = 65601;
public const val `DEBUG_FLR_HOLDINFO_NOTIFICATION_ALIASES`: `DEBUG_FLR_PARAM_TYPE` = 65603;
public const val `DEBUG_FLR_HOLDINFO_RECOMMEND_HOLD`: `DEBUG_FLR_PARAM_TYPE` = 65605;
public const val `DEBUG_FLR_HOLDINFO_TENET_SOCRE`: `DEBUG_FLR_PARAM_TYPE` = 65597;
public const val `DEBUG_FLR_IGNORE_BUCKET_ID_OFFSET`: `DEBUG_FLR_PARAM_TYPE` = 8238;
public const val `DEBUG_FLR_IGNORE_LARGE_MODULE_CORRUPTION`: `DEBUG_FLR_PARAM_TYPE` = 8237;
public const val `DEBUG_FLR_IGNORE_MODULE_HARDWARE_ID`: `DEBUG_FLR_PARAM_TYPE` = 8240;
public const val `DEBUG_FLR_IMAGE_CLASS`: `DEBUG_FLR_PARAM_TYPE` = 65579;
public const val `DEBUG_FLR_IMAGE_NAME`: `DEBUG_FLR_PARAM_TYPE` = 65537;
public const val `DEBUG_FLR_IMAGE_TIMESTAMP`: `DEBUG_FLR_PARAM_TYPE` = -2147483646;
public const val `DEBUG_FLR_IMAGE_VERSION`: `DEBUG_FLR_PARAM_TYPE` = -2147483642;
public const val `DEBUG_FLR_INSTR_POINTER_CLIFAULT`: `DEBUG_FLR_PARAM_TYPE` = 12306;
public const val `DEBUG_FLR_INSTR_POINTER_IN_FREE_BLOCK`: `DEBUG_FLR_PARAM_TYPE` = 12343;
public const val `DEBUG_FLR_INSTR_POINTER_IN_MODULE_NOT_IN_LIST`: `DEBUG_FLR_PARAM_TYPE` = 12346;
public const val `DEBUG_FLR_INSTR_POINTER_IN_PAGED_CODE`: `DEBUG_FLR_PARAM_TYPE` = 12370;
public const val `DEBUG_FLR_INSTR_POINTER_IN_RESERVED_BLOCK`: `DEBUG_FLR_PARAM_TYPE` = 12344;
public const val `DEBUG_FLR_INSTR_POINTER_IN_UNLOADED_MODULE`: `DEBUG_FLR_PARAM_TYPE` = 12340;
public const val `DEBUG_FLR_INSTR_POINTER_IN_VM_MAPPED_MODULE`: `DEBUG_FLR_PARAM_TYPE` = 12345;
public const val `DEBUG_FLR_INSTR_POINTER_MISALIGNED`: `DEBUG_FLR_PARAM_TYPE` = 12305;
public const val `DEBUG_FLR_INSTR_POINTER_NOT_IN_STREAM`: `DEBUG_FLR_PARAM_TYPE` = 12347;
public const val `DEBUG_FLR_INSTR_POINTER_ON_HEAP`: `DEBUG_FLR_PARAM_TYPE` = 12337;
public const val `DEBUG_FLR_INSTR_POINTER_ON_STACK`: `DEBUG_FLR_PARAM_TYPE` = 12336;
public const val `DEBUG_FLR_INSTR_SESSION_POOL_TAG`: `DEBUG_FLR_PARAM_TYPE` = 1030;
public const val `DEBUG_FLR_INTEL_CPU_BIOS_UPGRADE_NEEDED`: `DEBUG_FLR_PARAM_TYPE` = 8229;
public const val `DEBUG_FLR_INTERNAL_BUCKET_CONTINUABLE`: `DEBUG_FLR_PARAM_TYPE` = 16389;
public const val `DEBUG_FLR_INTERNAL_BUCKET_HITCOUNT`: `DEBUG_FLR_PARAM_TYPE` = 16387;
public const val `DEBUG_FLR_INTERNAL_BUCKET_STATUS_TEXT`: `DEBUG_FLR_PARAM_TYPE` = 16390;
public const val `DEBUG_FLR_INTERNAL_BUCKET_URL`: `DEBUG_FLR_PARAM_TYPE` = 16385;
public const val `DEBUG_FLR_INTERNAL_RAID_BUG`: `DEBUG_FLR_PARAM_TYPE` = 16384;
public const val `DEBUG_FLR_INTERNAL_RAID_BUG_DATABASE_STRING`: `DEBUG_FLR_PARAM_TYPE` = 16388;
public const val `DEBUG_FLR_INTERNAL_RESPONSE`: `DEBUG_FLR_PARAM_TYPE` = 65550;
public const val `DEBUG_FLR_INTERNAL_SOLUTION_TEXT`: `DEBUG_FLR_PARAM_TYPE` = 16386;
public const val `DEBUG_FLR_INVALID`: `DEBUG_FLR_PARAM_TYPE` = 0;
public const val `DEBUG_FLR_INVALID_DPC_FOUND`: `DEBUG_FLR_PARAM_TYPE` = 7;
public const val `DEBUG_FLR_INVALID_HEAP_ADDRESS`: `DEBUG_FLR_PARAM_TYPE` = 18;
public const val `DEBUG_FLR_INVALID_KERNEL_CONTEXT`: `DEBUG_FLR_PARAM_TYPE` = 8205;
public const val `DEBUG_FLR_INVALID_OPCODE`: `DEBUG_FLR_PARAM_TYPE` = 8218;
public const val `DEBUG_FLR_INVALID_PFN`: `DEBUG_FLR_PARAM_TYPE` = 4;
public const val `DEBUG_FLR_INVALID_USEREVENT`: `DEBUG_FLR_PARAM_TYPE` = 261;
public const val `DEBUG_FLR_INVALID_USER_CONTEXT`: `DEBUG_FLR_PARAM_TYPE` = 8231;
public const val `DEBUG_FLR_IOCONTROL_CODE`: `DEBUG_FLR_PARAM_TYPE` = 4099;
public const val `DEBUG_FLR_IOSB_ADDRESS`: `DEBUG_FLR_PARAM_TYPE` = 260;
public const val `DEBUG_FLR_IO_ERROR_CODE`: `DEBUG_FLR_PARAM_TYPE` = 775;
public const val `DEBUG_FLR_IRP_ADDRESS`: `DEBUG_FLR_PARAM_TYPE` = 256;
public const val `DEBUG_FLR_IRP_CANCEL_ROUTINE`: `DEBUG_FLR_PARAM_TYPE` = 259;
public const val `DEBUG_FLR_IRP_MAJOR_FN`: `DEBUG_FLR_PARAM_TYPE` = 257;
public const val `DEBUG_FLR_IRP_MINOR_FN`: `DEBUG_FLR_PARAM_TYPE` = 258;
public const val `DEBUG_FLR_KERNEL`: `DEBUG_FAILURE_TYPE` = 1;
public const val `DEBUG_FLR_KERNEL_LOG_PROCESS_NAME`: `DEBUG_FLR_PARAM_TYPE` = 65582;
public const val `DEBUG_FLR_KERNEL_LOG_STATUS`: `DEBUG_FLR_PARAM_TYPE` = 65583;
public const val `DEBUG_FLR_KERNEL_VERIFIER_ENABLED`: `DEBUG_FLR_PARAM_TYPE` = 8234;
public const val `DEBUG_FLR_KEYVALUE_ANALYSIS`: `DEBUG_FLR_PARAM_TYPE` = 1122304;
public const val `DEBUG_FLR_KEY_VALUES_STRING`: `DEBUG_FLR_PARAM_TYPE` = 1122560;
public const val `DEBUG_FLR_KEY_VALUES_VARIANT`: `DEBUG_FLR_PARAM_TYPE` = 1122816;
public const val `DEBUG_FLR_KM_MODULE_LIST`: `DEBUG_FLR_PARAM_TYPE` = 1048629;
public const val `DEBUG_FLR_LARGE_TICK_INCREMENT`: `DEBUG_FLR_PARAM_TYPE` = 12369;
public const val `DEBUG_FLR_LAST_CONTROL_TRANSFER`: `DEBUG_FLR_PARAM_TYPE` = 10;
public const val `DEBUG_FLR_LCIE_ISO_AVAILABLE`: `DEBUG_FLR_PARAM_TYPE` = 1048618;
public const val `DEBUG_FLR_LEAKED_SESSION_POOL_TAG`: `DEBUG_FLR_PARAM_TYPE` = 1029;
public const val `DEBUG_FLR_LEGACY_PAGE_TABLE_ACCESS`: `DEBUG_FLR_PARAM_TYPE` = 8252;
public const val `DEBUG_FLR_LIVE_KERNEL_DUMP`: `DEBUG_FLR_PARAM_TYPE` = 8243;
public const val `DEBUG_FLR_LOADERLOCK_BLOCKED_API`: `DEBUG_FLR_PARAM_TYPE` = 1048605;
public const val `DEBUG_FLR_LOADERLOCK_IN_WAIT_CHAIN`: `DEBUG_FLR_PARAM_TYPE` = 1048587;
public const val `DEBUG_FLR_LOADERLOCK_OWNER_API`: `DEBUG_FLR_PARAM_TYPE` = 1048604;
public const val `DEBUG_FLR_LOP_STACKHASH`: `DEBUG_FLR_PARAM_TYPE` = 12309;
public const val `DEBUG_FLR_LOW_SYSTEM_COMMIT`: `DEBUG_FLR_PARAM_TYPE` = 8251;
public const val `DEBUG_FLR_MACHINE_INFO_SHA1_HASH`: `DEBUG_FLR_PARAM_TYPE` = 1048608;
public const val `DEBUG_FLR_MANAGED_ANALYSIS_PROVIDER`: `DEBUG_FLR_PARAM_TYPE` = 1804;
public const val `DEBUG_FLR_MANAGED_BITNESS_MISMATCH`: `DEBUG_FLR_PARAM_TYPE` = 1797;
public const val `DEBUG_FLR_MANAGED_CODE`: `DEBUG_FLR_PARAM_TYPE` = 1792;
public const val `DEBUG_FLR_MANAGED_ENGINE_MODULE`: `DEBUG_FLR_PARAM_TYPE` = 1803;
public const val `DEBUG_FLR_MANAGED_EXCEPTION_ADDRESS`: `DEBUG_FLR_PARAM_TYPE` = 2048;
public const val `DEBUG_FLR_MANAGED_EXCEPTION_CALLSTACK`: `DEBUG_FLR_PARAM_TYPE` = 2052;
public const val `DEBUG_FLR_MANAGED_EXCEPTION_CMD`: `DEBUG_FLR_PARAM_TYPE` = 2288;
public const val `DEBUG_FLR_MANAGED_EXCEPTION_CONTEXT_MESSAGE`: `DEBUG_FLR_PARAM_TYPE` = 1799;
public const val `DEBUG_FLR_MANAGED_EXCEPTION_HRESULT`: `DEBUG_FLR_PARAM_TYPE` = 2049;
public const val `DEBUG_FLR_MANAGED_EXCEPTION_INNER_ADDRESS`: `DEBUG_FLR_PARAM_TYPE` = 2064;
public const val `DEBUG_FLR_MANAGED_EXCEPTION_INNER_CALLSTACK`: `DEBUG_FLR_PARAM_TYPE` = 2068;
public const val `DEBUG_FLR_MANAGED_EXCEPTION_INNER_HRESULT`: `DEBUG_FLR_PARAM_TYPE` = 2065;
public const val `DEBUG_FLR_MANAGED_EXCEPTION_INNER_MESSAGE`: `DEBUG_FLR_PARAM_TYPE` = 2067;
public const val `DEBUG_FLR_MANAGED_EXCEPTION_INNER_TYPE`: `DEBUG_FLR_PARAM_TYPE` = 2066;
public const val `DEBUG_FLR_MANAGED_EXCEPTION_MESSAGE`: `DEBUG_FLR_PARAM_TYPE` = 2051;
public const val `DEBUG_FLR_MANAGED_EXCEPTION_MESSAGE_deprecated`: `DEBUG_FLR_PARAM_TYPE` = 1795;
public const val `DEBUG_FLR_MANAGED_EXCEPTION_NESTED_ADDRESS`: `DEBUG_FLR_PARAM_TYPE` = 2080;
public const val `DEBUG_FLR_MANAGED_EXCEPTION_NESTED_CALLSTACK`: `DEBUG_FLR_PARAM_TYPE` = 2084;
public const val `DEBUG_FLR_MANAGED_EXCEPTION_NESTED_HRESULT`: `DEBUG_FLR_PARAM_TYPE` = 2081;
public const val `DEBUG_FLR_MANAGED_EXCEPTION_NESTED_MESSAGE`: `DEBUG_FLR_PARAM_TYPE` = 2083;
public const val `DEBUG_FLR_MANAGED_EXCEPTION_NESTED_TYPE`: `DEBUG_FLR_PARAM_TYPE` = 2082;
public const val `DEBUG_FLR_MANAGED_EXCEPTION_OBJECT`: `DEBUG_FLR_PARAM_TYPE` = 1794;
public const val `DEBUG_FLR_MANAGED_EXCEPTION_TYPE`: `DEBUG_FLR_PARAM_TYPE` = 2050;
public const val `DEBUG_FLR_MANAGED_FRAME_CHAIN_CORRUPTION`: `DEBUG_FLR_PARAM_TYPE` = 12358;
public const val `DEBUG_FLR_MANAGED_HRESULT_STRING`: `DEBUG_FLR_PARAM_TYPE` = 1802;
public const val `DEBUG_FLR_MANAGED_KERNEL_DEBUGGER`: `DEBUG_FLR_PARAM_TYPE` = 1801;
public const val `DEBUG_FLR_MANAGED_OBJECT`: `DEBUG_FLR_PARAM_TYPE` = 1793;
public const val `DEBUG_FLR_MANAGED_OBJECT_NAME`: `DEBUG_FLR_PARAM_TYPE` = 1798;
public const val `DEBUG_FLR_MANAGED_STACK_COMMAND`: `DEBUG_FLR_PARAM_TYPE` = 1800;
public const val `DEBUG_FLR_MANAGED_STACK_STRING`: `DEBUG_FLR_PARAM_TYPE` = 1796;
public const val `DEBUG_FLR_MANAGED_THREAD_CMD_CALLSTACK`: `DEBUG_FLR_PARAM_TYPE` = 2544;
public const val `DEBUG_FLR_MANAGED_THREAD_CMD_STACKOBJECTS`: `DEBUG_FLR_PARAM_TYPE` = 2545;
public const val `DEBUG_FLR_MANAGED_THREAD_ID`: `DEBUG_FLR_PARAM_TYPE` = 2304;
public const val `DEBUG_FLR_MANUAL_BREAKIN`: `DEBUG_FLR_PARAM_TYPE` = 8208;
public const val `DEBUG_FLR_MARKER_BUCKET`: `DEBUG_FLR_PARAM_TYPE` = 65560;
public const val `DEBUG_FLR_MARKER_FILE`: `DEBUG_FLR_PARAM_TYPE` = 65549;
public const val `DEBUG_FLR_MARKER_MODULE_FILE`: `DEBUG_FLR_PARAM_TYPE` = 65558;
public const val `DEBUG_FLR_MASK_ALL`: `DEBUG_FLR_PARAM_TYPE` = -1;
public const val `DEBUG_FLR_MEMDIAG_LASTRUN_STATUS`: `DEBUG_FLR_PARAM_TYPE` = 12341;
public const val `DEBUG_FLR_MEMDIAG_LASTRUN_TIME`: `DEBUG_FLR_PARAM_TYPE` = 12342;
public const val `DEBUG_FLR_MEMORY_ANALYSIS`: `DEBUG_FLR_PARAM_TYPE` = 1134592;
public const val `DEBUG_FLR_MEMORY_CORRUPTION_SIGNATURE`: `DEBUG_FLR_PARAM_TYPE` = 12348;
public const val `DEBUG_FLR_MEMORY_CORRUPTOR`: `DEBUG_FLR_PARAM_TYPE` = 12289;
public const val `DEBUG_FLR_MILCORE_BREAK`: `DEBUG_FLR_PARAM_TYPE` = 8232;
public const val `DEBUG_FLR_MINUTES_SINCE_LAST_EVENT`: `DEBUG_FLR_PARAM_TYPE` = 1879048225;
public const val `DEBUG_FLR_MINUTES_SINCE_LAST_EVENT_OF_THIS_TYPE`: `DEBUG_FLR_PARAM_TYPE` = 1879048226;
public const val `DEBUG_FLR_MISSING_CLR_SYMBOL`: `DEBUG_FLR_PARAM_TYPE` = 8249;
public const val `DEBUG_FLR_MISSING_IMPORTANT_SYMBOL`: `DEBUG_FLR_PARAM_TYPE` = 8248;
public const val `DEBUG_FLR_MM_INTERNAL_CODE`: `DEBUG_FLR_PARAM_TYPE` = 4100;
public const val `DEBUG_FLR_MODLIST_SHA1_HASH`: `DEBUG_FLR_PARAM_TYPE` = 1048601;
public const val `DEBUG_FLR_MODLIST_TSCHKSUM_SHA1_HASH`: `DEBUG_FLR_PARAM_TYPE` = 1048606;
public const val `DEBUG_FLR_MODLIST_UNLOADED_SHA1_HASH`: `DEBUG_FLR_PARAM_TYPE` = 1048607;
public const val `DEBUG_FLR_MODULE_BUCKET_ID`: `DEBUG_FLR_PARAM_TYPE` = 65545;
public const val `DEBUG_FLR_MODULE_LIST`: `DEBUG_FLR_PARAM_TYPE` = 1048624;
public const val `DEBUG_FLR_MODULE_NAME`: `DEBUG_FLR_PARAM_TYPE` = 65542;
public const val `DEBUG_FLR_MODULE_PRODUCTNAME`: `DEBUG_FLR_PARAM_TYPE` = 65576;
public const val `DEBUG_FLR_MOD_SPECIFIC_DATA_ONLY`: `DEBUG_FLR_PARAM_TYPE` = 8226;
public const val `DEBUG_FLR_NO_ARCH_IN_BUCKET`: `DEBUG_FLR_PARAM_TYPE` = 8239;
public const val `DEBUG_FLR_NO_BUGCHECK_IN_BUCKET`: `DEBUG_FLR_PARAM_TYPE` = 8216;
public const val `DEBUG_FLR_NO_IMAGE_IN_BUCKET`: `DEBUG_FLR_PARAM_TYPE` = 8215;
public const val `DEBUG_FLR_NO_IMAGE_TIMESTAMP_IN_BUCKET`: `DEBUG_FLR_PARAM_TYPE` = 8233;
public const val `DEBUG_FLR_NTGLOBALFLAG`: `DEBUG_FLR_PARAM_TYPE` = 1048599;
public const val `DEBUG_FLR_ON_DPC_STACK`: `DEBUG_FLR_PARAM_TYPE` = 8242;
public const val `DEBUG_FLR_ORIGINAL_CAB_NAME`: `DEBUG_FLR_PARAM_TYPE` = 65568;
public const val `DEBUG_FLR_OSBUILD_deprecated`: `DEBUG_FLR_PARAM_TYPE` = 1052928;
public const val `DEBUG_FLR_OS_BRANCH`: `DEBUG_FLR_PARAM_TYPE` = 1052680;
public const val `DEBUG_FLR_OS_BUILD`: `DEBUG_FLR_PARAM_TYPE` = 1052678;
public const val `DEBUG_FLR_OS_BUILD_LAYERS_XML`: `DEBUG_FLR_PARAM_TYPE` = 1052711;
public const val `DEBUG_FLR_OS_BUILD_STRING`: `DEBUG_FLR_PARAM_TYPE` = 1052708;
public const val `DEBUG_FLR_OS_BUILD_TIMESTAMP_ISO`: `DEBUG_FLR_PARAM_TYPE` = 1052697;
public const val `DEBUG_FLR_OS_BUILD_TIMESTAMP_LAB`: `DEBUG_FLR_PARAM_TYPE` = 1052681;
public const val `DEBUG_FLR_OS_FLAVOR`: `DEBUG_FLR_PARAM_TYPE` = 1052685;
public const val `DEBUG_FLR_OS_LOCALE`: `DEBUG_FLR_PARAM_TYPE` = 1052696;
public const val `DEBUG_FLR_OS_LOCALE_LCID`: `DEBUG_FLR_PARAM_TYPE` = 1052709;
public const val `DEBUG_FLR_OS_MAJOR`: `DEBUG_FLR_PARAM_TYPE` = 1052706;
public const val `DEBUG_FLR_OS_MINOR`: `DEBUG_FLR_PARAM_TYPE` = 1052707;
public const val `DEBUG_FLR_OS_NAME`: `DEBUG_FLR_PARAM_TYPE` = 1052692;
public const val `DEBUG_FLR_OS_NAME_EDITION`: `DEBUG_FLR_PARAM_TYPE` = 1052693;
public const val `DEBUG_FLR_OS_PLATFORM_ARCH`: `DEBUG_FLR_PARAM_TYPE` = 1052694;
public const val `DEBUG_FLR_OS_PLATFORM_ID`: `DEBUG_FLR_PARAM_TYPE` = 1052710;
public const val `DEBUG_FLR_OS_PRODUCT_TYPE`: `DEBUG_FLR_PARAM_TYPE` = 1052688;
public const val `DEBUG_FLR_OS_REVISION`: `DEBUG_FLR_PARAM_TYPE` = 1052691;
public const val `DEBUG_FLR_OS_SERVICEPACK`: `DEBUG_FLR_PARAM_TYPE` = 1052679;
public const val `DEBUG_FLR_OS_SERVICEPACK_deprecated`: `DEBUG_FLR_PARAM_TYPE` = 1052695;
public const val `DEBUG_FLR_OS_SKU`: `DEBUG_FLR_PARAM_TYPE` = 1052687;
public const val `DEBUG_FLR_OS_SUITE_MASK`: `DEBUG_FLR_PARAM_TYPE` = 1052689;
public const val `DEBUG_FLR_OS_VERSION`: `DEBUG_FLR_PARAM_TYPE` = 1052682;
public const val `DEBUG_FLR_OS_VERSION_deprecated`: `DEBUG_FLR_PARAM_TYPE` = 12291;
public const val `DEBUG_FLR_OVERLAPPED_MODULE`: `DEBUG_FLR_PARAM_TYPE` = 8227;
public const val `DEBUG_FLR_OVERLAPPED_UNLOADED_MODULE`: `DEBUG_FLR_PARAM_TYPE` = 8230;
public const val `DEBUG_FLR_PAGE_HASH_ERRORS`: `DEBUG_FLR_PARAM_TYPE` = 4114;
public typealias `DEBUG_FLR_PARAM_TYPE` = Int;
public const val `DEBUG_FLR_PG_MISMATCH`: `DEBUG_FLR_PARAM_TYPE` = 27;
public const val `DEBUG_FLR_PHONE_APPID`: `DEBUG_FLR_PARAM_TYPE` = 1879048215;
public const val `DEBUG_FLR_PHONE_APPVERSION`: `DEBUG_FLR_PARAM_TYPE` = 1879048217;
public const val `DEBUG_FLR_PHONE_BOOTLOADERVERSION`: `DEBUG_FLR_PARAM_TYPE` = 1879048209;
public const val `DEBUG_FLR_PHONE_BUILDBRANCH`: `DEBUG_FLR_PARAM_TYPE` = 1879048196;
public const val `DEBUG_FLR_PHONE_BUILDER`: `DEBUG_FLR_PARAM_TYPE` = 1879048197;
public const val `DEBUG_FLR_PHONE_BUILDNUMBER`: `DEBUG_FLR_PARAM_TYPE` = 1879048194;
public const val `DEBUG_FLR_PHONE_BUILDTIMESTAMP`: `DEBUG_FLR_PARAM_TYPE` = 1879048195;
public const val `DEBUG_FLR_PHONE_FIRMWAREREVISION`: `DEBUG_FLR_PARAM_TYPE` = 1879048202;
public const val `DEBUG_FLR_PHONE_HARDWAREREVISION`: `DEBUG_FLR_PARAM_TYPE` = 1879048206;
public const val `DEBUG_FLR_PHONE_LCID`: `DEBUG_FLR_PARAM_TYPE` = 1879048198;
public const val `DEBUG_FLR_PHONE_MCCMNC`: `DEBUG_FLR_PARAM_TYPE` = 1879048201;
public const val `DEBUG_FLR_PHONE_OPERATOR`: `DEBUG_FLR_PARAM_TYPE` = 1879048200;
public const val `DEBUG_FLR_PHONE_QFE`: `DEBUG_FLR_PARAM_TYPE` = 1879048199;
public const val `DEBUG_FLR_PHONE_RADIOHARDWAREREVISION`: `DEBUG_FLR_PARAM_TYPE` = 1879048207;
public const val `DEBUG_FLR_PHONE_RADIOSOFTWAREREVISION`: `DEBUG_FLR_PARAM_TYPE` = 1879048208;
public const val `DEBUG_FLR_PHONE_RAM`: `DEBUG_FLR_PARAM_TYPE` = 1879048203;
public const val `DEBUG_FLR_PHONE_REPORTGUID`: `DEBUG_FLR_PARAM_TYPE` = 1879048210;
public const val `DEBUG_FLR_PHONE_REPORTTIMESTAMP`: `DEBUG_FLR_PARAM_TYPE` = 1879048214;
public const val `DEBUG_FLR_PHONE_ROMVERSION`: `DEBUG_FLR_PARAM_TYPE` = 1879048204;
public const val `DEBUG_FLR_PHONE_SKUID`: `DEBUG_FLR_PARAM_TYPE` = 1879048216;
public const val `DEBUG_FLR_PHONE_SOCVERSION`: `DEBUG_FLR_PARAM_TYPE` = 1879048205;
public const val `DEBUG_FLR_PHONE_SOURCE`: `DEBUG_FLR_PARAM_TYPE` = 1879048211;
public const val `DEBUG_FLR_PHONE_SOURCEEXTERNAL`: `DEBUG_FLR_PARAM_TYPE` = 1879048212;
public const val `DEBUG_FLR_PHONE_UIF_APPID`: `DEBUG_FLR_PARAM_TYPE` = 1879048220;
public const val `DEBUG_FLR_PHONE_UIF_APPNAME`: `DEBUG_FLR_PARAM_TYPE` = 1879048219;
public const val `DEBUG_FLR_PHONE_UIF_CATEGORY`: `DEBUG_FLR_PARAM_TYPE` = 1879048221;
public const val `DEBUG_FLR_PHONE_UIF_COMMENT`: `DEBUG_FLR_PARAM_TYPE` = 1879048218;
public const val `DEBUG_FLR_PHONE_UIF_ORIGIN`: `DEBUG_FLR_PARAM_TYPE` = 1879048222;
public const val `DEBUG_FLR_PHONE_USERALIAS`: `DEBUG_FLR_PARAM_TYPE` = 1879048213;
public const val `DEBUG_FLR_PHONE_VERSIONMAJOR`: `DEBUG_FLR_PARAM_TYPE` = 1879048192;
public const val `DEBUG_FLR_PHONE_VERSIONMINOR`: `DEBUG_FLR_PARAM_TYPE` = 1879048193;
public const val `DEBUG_FLR_PLATFORM_BUCKET_STRING`: `DEBUG_FLR_PARAM_TYPE` = 65630;
public const val `DEBUG_FLR_PNP`: `DEBUG_FLR_PARAM_TYPE` = 32768;
public const val `DEBUG_FLR_PNP_BLACKBOX`: `DEBUG_FLR_PARAM_TYPE` = 33024;
public const val `DEBUG_FLR_PNP_IRP_ADDRESS`: `DEBUG_FLR_PARAM_TYPE` = 32770;
public const val `DEBUG_FLR_PNP_IRP_ADDRESS_DEPRECATED`: `DEBUG_FLR_PARAM_TYPE` = 264;
public const val `DEBUG_FLR_PNP_TRIAGE_DATA`: `DEBUG_FLR_PARAM_TYPE` = 32769;
public const val `DEBUG_FLR_PNP_TRIAGE_DATA_DEPRECATED`: `DEBUG_FLR_PARAM_TYPE` = 23;
public const val `DEBUG_FLR_POISONED_TB`: `DEBUG_FLR_PARAM_TYPE` = 8200;
public const val `DEBUG_FLR_POOL_ADDRESS`: `DEBUG_FLR_PARAM_TYPE` = 1024;
public const val `DEBUG_FLR_POOL_CORRUPTOR`: `DEBUG_FLR_PARAM_TYPE` = 12288;
public const val `DEBUG_FLR_POSSIBLE_INVALID_CONTROL_TRANSFER`: `DEBUG_FLR_PARAM_TYPE` = 8199;
public const val `DEBUG_FLR_POSSIBLE_STACK_OVERFLOW`: `DEBUG_FLR_PARAM_TYPE` = 8245;
public const val `DEBUG_FLR_POWERREQUEST_ADDRESS`: `DEBUG_FLR_PARAM_TYPE` = 29;
public const val `DEBUG_FLR_PO_BLACKBOX`: `DEBUG_FLR_PARAM_TYPE` = 24833;
public const val `DEBUG_FLR_PREVIOUS_IRQL`: `DEBUG_FLR_PARAM_TYPE` = 513;
public const val `DEBUG_FLR_PREVIOUS_MODE`: `DEBUG_FLR_PARAM_TYPE` = 265;
public const val `DEBUG_FLR_PRIMARY_PROBLEM_CLASS`: `DEBUG_FLR_PARAM_TYPE` = 1048579;
public const val `DEBUG_FLR_PRIMARY_PROBLEM_CLASS_DATA`: `DEBUG_FLR_PARAM_TYPE` = 1048580;
public const val `DEBUG_FLR_PROBLEM_CLASSES`: `DEBUG_FLR_PARAM_TYPE` = 1048578;
public const val `DEBUG_FLR_PROBLEM_CODE_PATH_HASH`: `DEBUG_FLR_PARAM_TYPE` = 1048585;
public const val `DEBUG_FLR_PROCESSES_ANALYSIS`: `DEBUG_FLR_PARAM_TYPE` = 1142784;
public const val `DEBUG_FLR_PROCESSOR_ID`: `DEBUG_FLR_PARAM_TYPE` = -1073741814;
public const val `DEBUG_FLR_PROCESSOR_INFO`: `DEBUG_FLR_PARAM_TYPE` = 12339;
public const val `DEBUG_FLR_PROCESS_BAM_CURRENT_THROTTLED`: `DEBUG_FLR_PARAM_TYPE` = -268435437;
public const val `DEBUG_FLR_PROCESS_BAM_PREVIOUS_THROTTLED`: `DEBUG_FLR_PARAM_TYPE` = -268435436;
public const val `DEBUG_FLR_PROCESS_INFO`: `DEBUG_FLR_PARAM_TYPE` = 2097189;
public const val `DEBUG_FLR_PROCESS_NAME`: `DEBUG_FLR_PARAM_TYPE` = 65547;
public const val `DEBUG_FLR_PROCESS_OBJECT`: `DEBUG_FLR_PARAM_TYPE` = 8;
public const val `DEBUG_FLR_PROCESS_PRODUCTNAME`: `DEBUG_FLR_PARAM_TYPE` = 65575;
public const val `DEBUG_FLR_RAISED_IRQL_USER_FAULT`: `DEBUG_FLR_PARAM_TYPE` = 8220;
public const val `DEBUG_FLR_READ_ADDRESS`: `DEBUG_FLR_PARAM_TYPE` = 14;
public const val `DEBUG_FLR_RECURRING_STACK`: `DEBUG_FLR_PARAM_TYPE` = 12296;
public const val `DEBUG_FLR_REGISTRYTXT_SOURCE`: `DEBUG_FLR_PARAM_TYPE` = 65584;
public const val `DEBUG_FLR_REGISTRYTXT_STRESS_ID`: `DEBUG_FLR_PARAM_TYPE` = 12307;
public const val `DEBUG_FLR_REGISTRY_DATA`: `DEBUG_FLR_PARAM_TYPE` = 3145728;
public const val `DEBUG_FLR_REPORT_INFO_CREATION_TIME`: `DEBUG_FLR_PARAM_TYPE` = 1879048229;
public const val `DEBUG_FLR_REPORT_INFO_GUID`: `DEBUG_FLR_PARAM_TYPE` = 1879048227;
public const val `DEBUG_FLR_REPORT_INFO_SOURCE`: `DEBUG_FLR_PARAM_TYPE` = 1879048228;
public const val `DEBUG_FLR_REQUESTED_IRQL`: `DEBUG_FLR_PARAM_TYPE` = 514;
public const val `DEBUG_FLR_RESERVED`: `DEBUG_FLR_PARAM_TYPE` = 1;
public const val `DEBUG_FLR_RESOURCE_CALL_TYPE`: `DEBUG_FLR_PARAM_TYPE` = 4352;
public const val `DEBUG_FLR_RESOURCE_CALL_TYPE_STR`: `DEBUG_FLR_PARAM_TYPE` = 4353;
public const val `DEBUG_FLR_SCM`: `DEBUG_FLR_PARAM_TYPE` = 20992;
public const val `DEBUG_FLR_SCM_BLACKBOX`: `DEBUG_FLR_PARAM_TYPE` = 21232;
public const val `DEBUG_FLR_SCM_BLACKBOX_ENTRY`: `DEBUG_FLR_PARAM_TYPE` = 21233;
public const val `DEBUG_FLR_SCM_BLACKBOX_ENTRY_CONTROLCODE`: `DEBUG_FLR_PARAM_TYPE` = 21234;
public const val `DEBUG_FLR_SCM_BLACKBOX_ENTRY_SERVICENAME`: `DEBUG_FLR_PARAM_TYPE` = 21236;
public const val `DEBUG_FLR_SCM_BLACKBOX_ENTRY_STARTTIME`: `DEBUG_FLR_PARAM_TYPE` = 21235;
public const val `DEBUG_FLR_SEARCH_HANG`: `DEBUG_FLR_PARAM_TYPE` = 1048614;
public const val `DEBUG_FLR_SECURITY_COOKIES`: `DEBUG_FLR_PARAM_TYPE` = 4105;
public const val `DEBUG_FLR_SERVICE`: `DEBUG_FLR_PARAM_TYPE` = 20480;
public const val `DEBUG_FLR_SERVICETABLE_MODIFIED`: `DEBUG_FLR_PARAM_TYPE` = 12371;
public const val `DEBUG_FLR_SERVICE_ANALYSIS`: `DEBUG_FLR_PARAM_TYPE` = 1146880;
public const val `DEBUG_FLR_SERVICE_DEPENDONGROUP`: `DEBUG_FLR_PARAM_TYPE` = 20486;
public const val `DEBUG_FLR_SERVICE_DEPENDONSERVICE`: `DEBUG_FLR_PARAM_TYPE` = 20485;
public const val `DEBUG_FLR_SERVICE_DESCRIPTION`: `DEBUG_FLR_PARAM_TYPE` = 20484;
public const val `DEBUG_FLR_SERVICE_DISPLAYNAME`: `DEBUG_FLR_PARAM_TYPE` = 20483;
public const val `DEBUG_FLR_SERVICE_GROUP`: `DEBUG_FLR_PARAM_TYPE` = 20482;
public const val `DEBUG_FLR_SERVICE_NAME`: `DEBUG_FLR_PARAM_TYPE` = 20481;
public const val `DEBUG_FLR_SHOW_ERRORLOG`: `DEBUG_FLR_PARAM_TYPE` = 8207;
public const val `DEBUG_FLR_SHOW_LCIE_ISO_DATA`: `DEBUG_FLR_PARAM_TYPE` = 1048619;
public const val `DEBUG_FLR_SIMULTANEOUS_TELSVC_INSTANCES`: `DEBUG_FLR_PARAM_TYPE` = 1879048223;
public const val `DEBUG_FLR_SIMULTANEOUS_TELWP_INSTANCES`: `DEBUG_FLR_PARAM_TYPE` = 1879048224;
public const val `DEBUG_FLR_SINGLE_BIT_ERROR`: `DEBUG_FLR_PARAM_TYPE` = 8203;
public const val `DEBUG_FLR_SINGLE_BIT_PFN_PAGE_ERROR`: `DEBUG_FLR_PARAM_TYPE` = 8213;
public const val `DEBUG_FLR_SKIP_CORRUPT_MODULE_DETECTION`: `DEBUG_FLR_PARAM_TYPE` = 8235;
public const val `DEBUG_FLR_SKIP_MODULE_SPECIFIC_BUCKET_INFO`: `DEBUG_FLR_PARAM_TYPE` = 65588;
public const val `DEBUG_FLR_SKIP_STACK_ANALYSIS`: `DEBUG_FLR_PARAM_TYPE` = 8217;
public const val `DEBUG_FLR_SM_BUFFER_HASH`: `DEBUG_FLR_PARAM_TYPE` = 1342177286;
public const val `DEBUG_FLR_SM_COMPRESSION_FORMAT`: `DEBUG_FLR_PARAM_TYPE` = 1342177280;
public const val `DEBUG_FLR_SM_ONEBIT_SOLUTION_COUNT`: `DEBUG_FLR_PARAM_TYPE` = 1342177287;
public const val `DEBUG_FLR_SM_SOURCE_OFFSET`: `DEBUG_FLR_PARAM_TYPE` = 1342177283;
public const val `DEBUG_FLR_SM_SOURCE_PFN1`: `DEBUG_FLR_PARAM_TYPE` = 1342177281;
public const val `DEBUG_FLR_SM_SOURCE_PFN2`: `DEBUG_FLR_PARAM_TYPE` = 1342177282;
public const val `DEBUG_FLR_SM_SOURCE_SIZE`: `DEBUG_FLR_PARAM_TYPE` = 1342177284;
public const val `DEBUG_FLR_SM_TARGET_PFN`: `DEBUG_FLR_PARAM_TYPE` = 1342177285;
public const val `DEBUG_FLR_SOLUTION_ID`: `DEBUG_FLR_PARAM_TYPE` = 12293;
public const val `DEBUG_FLR_SOLUTION_TYPE`: `DEBUG_FLR_PARAM_TYPE` = 12295;
public const val `DEBUG_FLR_SPECIAL_POOL_CORRUPTION_TYPE`: `DEBUG_FLR_PARAM_TYPE` = 1025;
public const val `DEBUG_FLR_STACK`: `DEBUG_FLR_PARAM_TYPE` = 2097152;
public const val `DEBUG_FLR_STACKHASH_ANALYSIS`: `DEBUG_FLR_PARAM_TYPE` = 1138688;
public const val `DEBUG_FLR_STACKUSAGE_FUNCTION`: `DEBUG_FLR_PARAM_TYPE` = 12363;
public const val `DEBUG_FLR_STACKUSAGE_FUNCTION_SIZE`: `DEBUG_FLR_PARAM_TYPE` = 12364;
public const val `DEBUG_FLR_STACKUSAGE_IMAGE`: `DEBUG_FLR_PARAM_TYPE` = 12361;
public const val `DEBUG_FLR_STACKUSAGE_IMAGE_SIZE`: `DEBUG_FLR_PARAM_TYPE` = 12362;
public const val `DEBUG_FLR_STACKUSAGE_RECURSION_COUNT`: `DEBUG_FLR_PARAM_TYPE` = 12365;
public const val `DEBUG_FLR_STACK_COMMAND`: `DEBUG_FLR_PARAM_TYPE` = 65540;
public const val `DEBUG_FLR_STACK_FRAME`: `DEBUG_FLR_PARAM_TYPE` = 2097155;
public const val `DEBUG_FLR_STACK_FRAMES`: `DEBUG_FLR_PARAM_TYPE` = 2097212;
public const val `DEBUG_FLR_STACK_FRAME_FLAGS`: `DEBUG_FLR_PARAM_TYPE` = 2097163;
public const val `DEBUG_FLR_STACK_FRAME_FUNCTION`: `DEBUG_FLR_PARAM_TYPE` = 2097162;
public const val `DEBUG_FLR_STACK_FRAME_IMAGE`: `DEBUG_FLR_PARAM_TYPE` = 2097161;
public const val `DEBUG_FLR_STACK_FRAME_INSTRUCTION`: `DEBUG_FLR_PARAM_TYPE` = 2097157;
public const val `DEBUG_FLR_STACK_FRAME_MODULE`: `DEBUG_FLR_PARAM_TYPE` = 2097160;
public const val `DEBUG_FLR_STACK_FRAME_MODULE_BASE`: `DEBUG_FLR_PARAM_TYPE` = 2097224;
public const val `DEBUG_FLR_STACK_FRAME_NUMBER`: `DEBUG_FLR_PARAM_TYPE` = 2097156;
public const val `DEBUG_FLR_STACK_FRAME_SRC`: `DEBUG_FLR_PARAM_TYPE` = 2097225;
public const val `DEBUG_FLR_STACK_FRAME_SYMBOL`: `DEBUG_FLR_PARAM_TYPE` = 2097158;
public const val `DEBUG_FLR_STACK_FRAME_SYMBOL_OFFSET`: `DEBUG_FLR_PARAM_TYPE` = 2097159;
public const val `DEBUG_FLR_STACK_OVERFLOW`: `DEBUG_FLR_PARAM_TYPE` = 12301;
public const val `DEBUG_FLR_STACK_POINTER_ERROR`: `DEBUG_FLR_PARAM_TYPE` = 12302;
public const val `DEBUG_FLR_STACK_POINTER_MISALIGNED`: `DEBUG_FLR_PARAM_TYPE` = 12304;
public const val `DEBUG_FLR_STACK_POINTER_ONEBIT_ERROR`: `DEBUG_FLR_PARAM_TYPE` = 12303;
public const val `DEBUG_FLR_STACK_SHA1_HASH_M`: `DEBUG_FLR_PARAM_TYPE` = 2097221;
public const val `DEBUG_FLR_STACK_SHA1_HASH_MF`: `DEBUG_FLR_PARAM_TYPE` = 2097219;
public const val `DEBUG_FLR_STACK_SHA1_HASH_MFO`: `DEBUG_FLR_PARAM_TYPE` = 2097220;
public const val `DEBUG_FLR_STACK_TEXT`: `DEBUG_FLR_PARAM_TYPE` = 65541;
public const val `DEBUG_FLR_STATUS_CODE`: `DEBUG_FLR_PARAM_TYPE` = 4102;
public const val `DEBUG_FLR_STORAGE`: `DEBUG_FLR_PARAM_TYPE` = 29696;
public const val `DEBUG_FLR_STORAGE_BLACKBOX`: `DEBUG_FLR_PARAM_TYPE` = 29936;
public const val `DEBUG_FLR_STORAGE_ISSUEDESCSTRING`: `DEBUG_FLR_PARAM_TYPE` = 29700;
public const val `DEBUG_FLR_STORAGE_MFGID`: `DEBUG_FLR_PARAM_TYPE` = 29699;
public const val `DEBUG_FLR_STORAGE_MODEL`: `DEBUG_FLR_PARAM_TYPE` = 29698;
public const val `DEBUG_FLR_STORAGE_ORGID`: `DEBUG_FLR_PARAM_TYPE` = 29697;
public const val `DEBUG_FLR_STORAGE_PRIVATE_DATASIZE`: `DEBUG_FLR_PARAM_TYPE` = 29706;
public const val `DEBUG_FLR_STORAGE_PRIVATE_OFFSET`: `DEBUG_FLR_PARAM_TYPE` = 29705;
public const val `DEBUG_FLR_STORAGE_PRIVATE_TOTSIZE`: `DEBUG_FLR_PARAM_TYPE` = 29704;
public const val `DEBUG_FLR_STORAGE_PUBLIC_DATASIZE`: `DEBUG_FLR_PARAM_TYPE` = 29703;
public const val `DEBUG_FLR_STORAGE_PUBLIC_OFFSET`: `DEBUG_FLR_PARAM_TYPE` = 29702;
public const val `DEBUG_FLR_STORAGE_PUBLIC_TOTSIZE`: `DEBUG_FLR_PARAM_TYPE` = 29701;
public const val `DEBUG_FLR_STORAGE_REASON`: `DEBUG_FLR_PARAM_TYPE` = 29708;
public const val `DEBUG_FLR_STORAGE_TOTALSIZE`: `DEBUG_FLR_PARAM_TYPE` = 29707;
public const val `DEBUG_FLR_STORE_DEVELOPER_NAME`: `DEBUG_FLR_PARAM_TYPE` = 1610612743;
public const val `DEBUG_FLR_STORE_IS_MICROSOFT_PRODUCT`: `DEBUG_FLR_PARAM_TYPE` = 1610612754;
public const val `DEBUG_FLR_STORE_LEGACY_PARENT_PRODUCT_ID`: `DEBUG_FLR_PARAM_TYPE` = 1610612747;
public const val `DEBUG_FLR_STORE_LEGACY_WINDOWS_PHONE_PRODUCT_ID`: `DEBUG_FLR_PARAM_TYPE` = 1610612749;
public const val `DEBUG_FLR_STORE_LEGACY_WINDOWS_STORE_PRODUCT_ID`: `DEBUG_FLR_PARAM_TYPE` = 1610612748;
public const val `DEBUG_FLR_STORE_LEGACY_XBOX_360_PRODUCT_ID`: `DEBUG_FLR_PARAM_TYPE` = 1610612751;
public const val `DEBUG_FLR_STORE_LEGACY_XBOX_ONE_PRODUCT_ID`: `DEBUG_FLR_PARAM_TYPE` = 1610612750;
public const val `DEBUG_FLR_STORE_PACKAGE_FAMILY_NAME`: `DEBUG_FLR_PARAM_TYPE` = 1610612744;
public const val `DEBUG_FLR_STORE_PACKAGE_IDENTITY_NAME`: `DEBUG_FLR_PARAM_TYPE` = 1610612745;
public const val `DEBUG_FLR_STORE_PREFERRED_SKU_ID`: `DEBUG_FLR_PARAM_TYPE` = 1610612753;
public const val `DEBUG_FLR_STORE_PRIMARY_PARENT_PRODUCT_ID`: `DEBUG_FLR_PARAM_TYPE` = 1610612746;
public const val `DEBUG_FLR_STORE_PRODUCT_DESCRIPTION`: `DEBUG_FLR_PARAM_TYPE` = 1610612738;
public const val `DEBUG_FLR_STORE_PRODUCT_DISPLAY_NAME`: `DEBUG_FLR_PARAM_TYPE` = 1610612737;
public const val `DEBUG_FLR_STORE_PRODUCT_EXTENDED_NAME`: `DEBUG_FLR_PARAM_TYPE` = 1610612739;
public const val `DEBUG_FLR_STORE_PRODUCT_ID`: `DEBUG_FLR_PARAM_TYPE` = 1610612736;
public const val `DEBUG_FLR_STORE_PUBLISHER_CERTIFICATE_NAME`: `DEBUG_FLR_PARAM_TYPE` = 1610612742;
public const val `DEBUG_FLR_STORE_PUBLISHER_ID`: `DEBUG_FLR_PARAM_TYPE` = 1610612740;
public const val `DEBUG_FLR_STORE_PUBLISHER_NAME`: `DEBUG_FLR_PARAM_TYPE` = 1610612741;
public const val `DEBUG_FLR_STORE_URL_APP`: `DEBUG_FLR_PARAM_TYPE` = 1610612755;
public const val `DEBUG_FLR_STORE_URL_APPHEALTH`: `DEBUG_FLR_PARAM_TYPE` = 1610612756;
public const val `DEBUG_FLR_STORE_XBOX_TITLE_ID`: `DEBUG_FLR_PARAM_TYPE` = 1610612752;
public const val `DEBUG_FLR_STREAM_ANALYSIS`: `DEBUG_FLR_PARAM_TYPE` = 1130496;
public const val `DEBUG_FLR_SUSPECT_CODE_PATH_HASH`: `DEBUG_FLR_PARAM_TYPE` = 1048586;
public const val `DEBUG_FLR_SVCHOST`: `DEBUG_FLR_PARAM_TYPE` = 20736;
public const val `DEBUG_FLR_SVCHOST_GROUP`: `DEBUG_FLR_PARAM_TYPE` = 20737;
public const val `DEBUG_FLR_SVCHOST_IMAGEPATH`: `DEBUG_FLR_PARAM_TYPE` = 20738;
public const val `DEBUG_FLR_SVCHOST_SERVICEDLL`: `DEBUG_FLR_PARAM_TYPE` = 20739;
public const val `DEBUG_FLR_SWITCH_PROCESS_CONTEXT`: `DEBUG_FLR_PARAM_TYPE` = 8223;
public const val `DEBUG_FLR_SYMBOL_FROM_RAW_STACK_ADDRESS`: `DEBUG_FLR_PARAM_TYPE` = -2147483643;
public const val `DEBUG_FLR_SYMBOL_NAME`: `DEBUG_FLR_PARAM_TYPE` = 65538;
public const val `DEBUG_FLR_SYMBOL_ON_RAW_STACK`: `DEBUG_FLR_PARAM_TYPE` = 4104;
public const val `DEBUG_FLR_SYMBOL_ROUTINE_NAME`: `DEBUG_FLR_PARAM_TYPE` = 65580;
public const val `DEBUG_FLR_SYMBOL_STACK_INDEX`: `DEBUG_FLR_PARAM_TYPE` = 4103;
public const val `DEBUG_FLR_SYSINFO_BASEBOARD_MANUFACTURER`: `DEBUG_FLR_PARAM_TYPE` = 17156;
public const val `DEBUG_FLR_SYSINFO_BASEBOARD_PRODUCT`: `DEBUG_FLR_PARAM_TYPE` = 17157;
public const val `DEBUG_FLR_SYSINFO_BASEBOARD_VERSION`: `DEBUG_FLR_PARAM_TYPE` = 17158;
public const val `DEBUG_FLR_SYSINFO_BIOS_DATE`: `DEBUG_FLR_PARAM_TYPE` = 17161;
public const val `DEBUG_FLR_SYSINFO_BIOS_VENDOR`: `DEBUG_FLR_PARAM_TYPE` = 17159;
public const val `DEBUG_FLR_SYSINFO_BIOS_VERSION`: `DEBUG_FLR_PARAM_TYPE` = 17160;
public const val `DEBUG_FLR_SYSINFO_SYSTEM_MANUFACTURER`: `DEBUG_FLR_PARAM_TYPE` = 17152;
public const val `DEBUG_FLR_SYSINFO_SYSTEM_PRODUCT`: `DEBUG_FLR_PARAM_TYPE` = 17153;
public const val `DEBUG_FLR_SYSINFO_SYSTEM_SKU`: `DEBUG_FLR_PARAM_TYPE` = 17154;
public const val `DEBUG_FLR_SYSINFO_SYSTEM_VERSION`: `DEBUG_FLR_PARAM_TYPE` = 17155;
public const val `DEBUG_FLR_SYSTEM_LOCALE_deprecated`: `DEBUG_FLR_PARAM_TYPE` = 12298;
public const val `DEBUG_FLR_SYSXML_CHECKSUM`: `DEBUG_FLR_PARAM_TYPE` = 16897;
public const val `DEBUG_FLR_SYSXML_LOCALEID`: `DEBUG_FLR_PARAM_TYPE` = 16896;
public const val `DEBUG_FLR_TARGET_MODE`: `DEBUG_FLR_PARAM_TYPE` = 4107;
public const val `DEBUG_FLR_TARGET_TIME`: `DEBUG_FLR_PARAM_TYPE` = 8250;
public const val `DEBUG_FLR_TESTRESULTGUID`: `DEBUG_FLR_PARAM_TYPE` = -268435455;
public const val `DEBUG_FLR_TESTRESULTSERVER`: `DEBUG_FLR_PARAM_TYPE` = -268435456;
public const val `DEBUG_FLR_THREADPOOL_WAITER`: `DEBUG_FLR_PARAM_TYPE` = 4106;
public const val `DEBUG_FLR_THREAD_ATTRIBUTES`: `DEBUG_FLR_PARAM_TYPE` = 1048577;
public const val `DEBUG_FLR_TIMELINE_ANALYSIS`: `DEBUG_FLR_PARAM_TYPE` = 1126400;
public const val `DEBUG_FLR_TIMELINE_TIMES`: `DEBUG_FLR_PARAM_TYPE` = 1126401;
public const val `DEBUG_FLR_TRAP_FRAME`: `DEBUG_FLR_PARAM_TYPE` = -1073741822;
public const val `DEBUG_FLR_TRAP_FRAME_RECURSION`: `DEBUG_FLR_PARAM_TYPE` = 12300;
public const val `DEBUG_FLR_TRIAGER_OS_BUILD_NAME`: `DEBUG_FLR_PARAM_TYPE` = 12328;
public const val `DEBUG_FLR_TSS`: `DEBUG_FLR_PARAM_TYPE` = -1073741821;
public const val `DEBUG_FLR_TWO_BIT_ERROR`: `DEBUG_FLR_PARAM_TYPE` = 8204;
public const val `DEBUG_FLR_ULS_SCRIPT_EXCEPTION`: `DEBUG_FLR_PARAM_TYPE` = 1048617;
public const val `DEBUG_FLR_UNALIGNED_STACK_POINTER`: `DEBUG_FLR_PARAM_TYPE` = 12290;
public const val `DEBUG_FLR_UNKNOWN`: `DEBUG_FAILURE_TYPE` = 0;
public const val `DEBUG_FLR_UNKNOWN_MODULE`: `DEBUG_FLR_PARAM_TYPE` = 8201;
public const val `DEBUG_FLR_UNRESPONSIVE_UI_FOLLOWUP_NAME`: `DEBUG_FLR_PARAM_TYPE` = 65573;
public const val `DEBUG_FLR_UNRESPONSIVE_UI_PROBLEM_CLASS`: `DEBUG_FLR_PARAM_TYPE` = 1048581;
public const val `DEBUG_FLR_UNRESPONSIVE_UI_PROBLEM_CLASS_DATA`: `DEBUG_FLR_PARAM_TYPE` = 1048582;
public const val `DEBUG_FLR_UNRESPONSIVE_UI_STACK`: `DEBUG_FLR_PARAM_TYPE` = 65574;
public const val `DEBUG_FLR_UNRESPONSIVE_UI_SYMBOL_NAME`: `DEBUG_FLR_PARAM_TYPE` = 65572;
public const val `DEBUG_FLR_UNRESPONSIVE_UI_THREAD`: `DEBUG_FLR_PARAM_TYPE` = -1073741819;
public const val `DEBUG_FLR_UNUSED001`: `DEBUG_FLR_PARAM_TYPE` = 8197;
public const val `DEBUG_FLR_URLS`: `DEBUG_FLR_PARAM_TYPE` = 1048610;
public const val `DEBUG_FLR_URLS_DISCOVERED`: `DEBUG_FLR_PARAM_TYPE` = 1048609;
public const val `DEBUG_FLR_URL_ENTRY`: `DEBUG_FLR_PARAM_TYPE` = 1048611;
public const val `DEBUG_FLR_URL_LCIE_ENTRY`: `DEBUG_FLR_PARAM_TYPE` = 1048620;
public const val `DEBUG_FLR_URL_URLMON_ENTRY`: `DEBUG_FLR_PARAM_TYPE` = 1048621;
public const val `DEBUG_FLR_URL_XMLHTTPREQ_SYNC_ENTRY`: `DEBUG_FLR_PARAM_TYPE` = 1048622;
public const val `DEBUG_FLR_USBPORT_OCADATA`: `DEBUG_FLR_PARAM_TYPE` = 20;
public const val `DEBUG_FLR_USER`: `DEBUG_FAILURE_TYPE` = 2;
public const val `DEBUG_FLR_USERBREAK_PEB_PAGEDOUT`: `DEBUG_FLR_PARAM_TYPE` = 8225;
public const val `DEBUG_FLR_USERMODE_DATA`: `DEBUG_FLR_PARAM_TYPE` = 1048576;
public const val `DEBUG_FLR_USER_GLOBAL_ATTRIBUTES`: `DEBUG_FLR_PARAM_TYPE` = 3153920;
public const val `DEBUG_FLR_USER_LCID`: `DEBUG_FLR_PARAM_TYPE` = 1052690;
public const val `DEBUG_FLR_USER_LCID_STR`: `DEBUG_FLR_PARAM_TYPE` = 1052698;
public const val `DEBUG_FLR_USER_MODE_BUCKET`: `DEBUG_FLR_PARAM_TYPE` = 65614;
public const val `DEBUG_FLR_USER_MODE_BUCKET_EVENTTYPE`: `DEBUG_FLR_PARAM_TYPE` = 65616;
public const val `DEBUG_FLR_USER_MODE_BUCKET_INDEX`: `DEBUG_FLR_PARAM_TYPE` = 65615;
public const val `DEBUG_FLR_USER_MODE_BUCKET_P0`: `DEBUG_FLR_PARAM_TYPE` = 65619;
public const val `DEBUG_FLR_USER_MODE_BUCKET_P1`: `DEBUG_FLR_PARAM_TYPE` = 65620;
public const val `DEBUG_FLR_USER_MODE_BUCKET_P2`: `DEBUG_FLR_PARAM_TYPE` = 65621;
public const val `DEBUG_FLR_USER_MODE_BUCKET_P3`: `DEBUG_FLR_PARAM_TYPE` = 65622;
public const val `DEBUG_FLR_USER_MODE_BUCKET_P4`: `DEBUG_FLR_PARAM_TYPE` = 65623;
public const val `DEBUG_FLR_USER_MODE_BUCKET_P5`: `DEBUG_FLR_PARAM_TYPE` = 65624;
public const val `DEBUG_FLR_USER_MODE_BUCKET_P6`: `DEBUG_FLR_PARAM_TYPE` = 65625;
public const val `DEBUG_FLR_USER_MODE_BUCKET_P7`: `DEBUG_FLR_PARAM_TYPE` = 65626;
public const val `DEBUG_FLR_USER_MODE_BUCKET_REPORTCREATIONTIME`: `DEBUG_FLR_PARAM_TYPE` = 65618;
public const val `DEBUG_FLR_USER_MODE_BUCKET_REPORTGUID`: `DEBUG_FLR_PARAM_TYPE` = 65617;
public const val `DEBUG_FLR_USER_MODE_BUCKET_STRING`: `DEBUG_FLR_PARAM_TYPE` = 65627;
public const val `DEBUG_FLR_USER_NAME`: `DEBUG_FLR_PARAM_TYPE` = 65548;
public const val `DEBUG_FLR_USER_PROBLEM_CLASSES`: `DEBUG_FLR_PARAM_TYPE` = 3162112;
public const val `DEBUG_FLR_USER_THREAD_ATTRIBUTES`: `DEBUG_FLR_PARAM_TYPE` = 3158016;
public const val `DEBUG_FLR_USE_DEFAULT_CONTEXT`: `DEBUG_FLR_PARAM_TYPE` = 8221;
public const val `DEBUG_FLR_VERIFIER_DRIVER_ENTRY`: `DEBUG_FLR_PARAM_TYPE` = 263;
public const val `DEBUG_FLR_VERIFIER_FOUND_DEADLOCK`: `DEBUG_FLR_PARAM_TYPE` = 26;
public const val `DEBUG_FLR_VERIFIER_STOP`: `DEBUG_FLR_PARAM_TYPE` = 8224;
public const val `DEBUG_FLR_VIDEO_TDR_CONTEXT`: `DEBUG_FLR_PARAM_TYPE` = 262;
public const val `DEBUG_FLR_VIRTUAL_MACHINE`: `DEBUG_FLR_PARAM_TYPE` = 17162;
public const val `DEBUG_FLR_WAIT_CHAIN_COMMAND`: `DEBUG_FLR_PARAM_TYPE` = 1048598;
public const val `DEBUG_FLR_WATSON_GENERIC_BUCKETING_00`: `DEBUG_FLR_PARAM_TYPE` = 16648;
public const val `DEBUG_FLR_WATSON_GENERIC_BUCKETING_01`: `DEBUG_FLR_PARAM_TYPE` = 16649;
public const val `DEBUG_FLR_WATSON_GENERIC_BUCKETING_02`: `DEBUG_FLR_PARAM_TYPE` = 16650;
public const val `DEBUG_FLR_WATSON_GENERIC_BUCKETING_03`: `DEBUG_FLR_PARAM_TYPE` = 16651;
public const val `DEBUG_FLR_WATSON_GENERIC_BUCKETING_04`: `DEBUG_FLR_PARAM_TYPE` = 16652;
public const val `DEBUG_FLR_WATSON_GENERIC_BUCKETING_05`: `DEBUG_FLR_PARAM_TYPE` = 16653;
public const val `DEBUG_FLR_WATSON_GENERIC_BUCKETING_06`: `DEBUG_FLR_PARAM_TYPE` = 16654;
public const val `DEBUG_FLR_WATSON_GENERIC_BUCKETING_07`: `DEBUG_FLR_PARAM_TYPE` = 16655;
public const val `DEBUG_FLR_WATSON_GENERIC_BUCKETING_08`: `DEBUG_FLR_PARAM_TYPE` = 16656;
public const val `DEBUG_FLR_WATSON_GENERIC_BUCKETING_09`: `DEBUG_FLR_PARAM_TYPE` = 16657;
public const val `DEBUG_FLR_WATSON_GENERIC_EVENT_NAME`: `DEBUG_FLR_PARAM_TYPE` = 16647;
public const val `DEBUG_FLR_WATSON_IBUCKET`: `DEBUG_FLR_PARAM_TYPE` = 16644;
public const val `DEBUG_FLR_WATSON_IBUCKETTABLE_S1_RESP`: `DEBUG_FLR_PARAM_TYPE` = 1048613;
public const val `DEBUG_FLR_WATSON_IBUCKET_S1_RESP`: `DEBUG_FLR_PARAM_TYPE` = 1048612;
public const val `DEBUG_FLR_WATSON_MODULE`: `DEBUG_FLR_PARAM_TYPE` = 16640;
public const val `DEBUG_FLR_WATSON_MODULE_OFFSET`: `DEBUG_FLR_PARAM_TYPE` = 16642;
public const val `DEBUG_FLR_WATSON_MODULE_TIMESTAMP`: `DEBUG_FLR_PARAM_TYPE` = 16645;
public const val `DEBUG_FLR_WATSON_MODULE_VERSION`: `DEBUG_FLR_PARAM_TYPE` = 16641;
public const val `DEBUG_FLR_WATSON_PROCESS_TIMESTAMP`: `DEBUG_FLR_PARAM_TYPE` = 16646;
public const val `DEBUG_FLR_WATSON_PROCESS_VERSION`: `DEBUG_FLR_PARAM_TYPE` = 16643;
public const val `DEBUG_FLR_WCT_XML_AVAILABLE`: `DEBUG_FLR_PARAM_TYPE` = 1048591;
public const val `DEBUG_FLR_WERCOLLECTION_DEFAULTCOLLECTION_FAILURE`: `DEBUG_FLR_PARAM_TYPE` = -268435438;
public const val `DEBUG_FLR_WERCOLLECTION_MINIDUMP_WRITE_FAILURE`: `DEBUG_FLR_PARAM_TYPE` = -268435439;
public const val `DEBUG_FLR_WERCOLLECTION_PROCESSHEAPDUMP_REQUEST_FAILURE`: `DEBUG_FLR_PARAM_TYPE` = -268435440;
public const val `DEBUG_FLR_WERCOLLECTION_PROCESSTERMINATED`: `DEBUG_FLR_PARAM_TYPE` = -268435441;
public const val `DEBUG_FLR_WER_DATA_COLLECTION_INFO`: `DEBUG_FLR_PARAM_TYPE` = 1048615;
public const val `DEBUG_FLR_WER_MACHINE_ID`: `DEBUG_FLR_PARAM_TYPE` = 1048616;
public const val `DEBUG_FLR_WHEA_ERROR_RECORD`: `DEBUG_FLR_PARAM_TYPE` = 25;
public const val `DEBUG_FLR_WINLOGON_BLACKBOX`: `DEBUG_FLR_PARAM_TYPE` = -268435432;
public const val `DEBUG_FLR_WMI_QUERY_DATA`: `DEBUG_FLR_PARAM_TYPE` = 3149824;
public const val `DEBUG_FLR_WORKER_ROUTINE`: `DEBUG_FLR_PARAM_TYPE` = 5;
public const val `DEBUG_FLR_WORK_ITEM`: `DEBUG_FLR_PARAM_TYPE` = 6;
public const val `DEBUG_FLR_WORK_QUEUE_ITEM`: `DEBUG_FLR_PARAM_TYPE` = 21;
public const val `DEBUG_FLR_WQL_EVENTLOG_INFO`: `DEBUG_FLR_PARAM_TYPE` = 16899;
public const val `DEBUG_FLR_WQL_EVENT_COUNT`: `DEBUG_FLR_PARAM_TYPE` = 16898;
public const val `DEBUG_FLR_WRITE_ADDRESS`: `DEBUG_FLR_PARAM_TYPE` = 15;
public const val `DEBUG_FLR_WRONG_SYMBOLS`: `DEBUG_FLR_PARAM_TYPE` = 8195;
public const val `DEBUG_FLR_WRONG_SYMBOLS_SIZE`: `DEBUG_FLR_PARAM_TYPE` = 8247;
public const val `DEBUG_FLR_WRONG_SYMBOLS_TIMESTAMP`: `DEBUG_FLR_PARAM_TYPE` = 8246;
public const val `DEBUG_FLR_XBOX_LIVE_ENVIRONMENT`: `DEBUG_FLR_PARAM_TYPE` = 12368;
public const val `DEBUG_FLR_XBOX_SYSTEM_CRASHTIME`: `DEBUG_FLR_PARAM_TYPE` = 12367;
public const val `DEBUG_FLR_XBOX_SYSTEM_UPTIME`: `DEBUG_FLR_PARAM_TYPE` = 12366;
public const val `DEBUG_FLR_XCS_PATH`: `DEBUG_FLR_PARAM_TYPE` = 1048603;
public const val `DEBUG_FLR_XDV_HELP_LINK`: `DEBUG_FLR_PARAM_TYPE` = -1073741811;
public const val `DEBUG_FLR_XDV_RULE_INFO`: `DEBUG_FLR_PARAM_TYPE` = -1073741810;
public const val `DEBUG_FLR_XDV_STATE_VARIABLE`: `DEBUG_FLR_PARAM_TYPE` = -1073741812;
public const val `DEBUG_FLR_XDV_VIOLATED_CONDITION`: `DEBUG_FLR_PARAM_TYPE` = -1073741813;
public const val `DEBUG_FLR_XHCI_FIRMWARE_VERSION`: `DEBUG_FLR_PARAM_TYPE` = 65590;
public const val `DEBUG_FLR_XML_APPLICATION_NAME`: `DEBUG_FLR_PARAM_TYPE` = 2097231;
public const val `DEBUG_FLR_XML_ATTRIBUTE`: `DEBUG_FLR_PARAM_TYPE` = 2097194;
public const val `DEBUG_FLR_XML_ATTRIBUTE_D1VALUE`: `DEBUG_FLR_PARAM_TYPE` = 2097197;
public const val `DEBUG_FLR_XML_ATTRIBUTE_D2VALUE`: `DEBUG_FLR_PARAM_TYPE` = 2097198;
public const val `DEBUG_FLR_XML_ATTRIBUTE_DOVALUE`: `DEBUG_FLR_PARAM_TYPE` = 2097199;
public const val `DEBUG_FLR_XML_ATTRIBUTE_FRAME_NUMBER`: `DEBUG_FLR_PARAM_TYPE` = 2097201;
public const val `DEBUG_FLR_XML_ATTRIBUTE_LIST`: `DEBUG_FLR_PARAM_TYPE` = 2097193;
public const val `DEBUG_FLR_XML_ATTRIBUTE_NAME`: `DEBUG_FLR_PARAM_TYPE` = 2097195;
public const val `DEBUG_FLR_XML_ATTRIBUTE_THREAD_INDEX`: `DEBUG_FLR_PARAM_TYPE` = 2097202;
public const val `DEBUG_FLR_XML_ATTRIBUTE_VALUE`: `DEBUG_FLR_PARAM_TYPE` = 2097196;
public const val `DEBUG_FLR_XML_ATTRIBUTE_VALUE_TYPE`: `DEBUG_FLR_PARAM_TYPE` = 2097200;
public const val `DEBUG_FLR_XML_ENCODED_OFFSETS`: `DEBUG_FLR_PARAM_TYPE` = 2097213;
public const val `DEBUG_FLR_XML_EVENTTYPE`: `DEBUG_FLR_PARAM_TYPE` = 2097235;
public const val `DEBUG_FLR_XML_GLOBALATTRIBUTE_LIST`: `DEBUG_FLR_PARAM_TYPE` = 2097192;
public const val `DEBUG_FLR_XML_MODERN_ASYNC_REQUEST_OUTSTANDING`: `DEBUG_FLR_PARAM_TYPE` = 2097234;
public const val `DEBUG_FLR_XML_MODULE_INFO`: `DEBUG_FLR_PARAM_TYPE` = 2097169;
public const val `DEBUG_FLR_XML_MODULE_INFO_BASE`: `DEBUG_FLR_PARAM_TYPE` = 2097186;
public const val `DEBUG_FLR_XML_MODULE_INFO_CHECKSUM`: `DEBUG_FLR_PARAM_TYPE` = 2097174;
public const val `DEBUG_FLR_XML_MODULE_INFO_COMPANY_NAME`: `DEBUG_FLR_PARAM_TYPE` = 2097182;
public const val `DEBUG_FLR_XML_MODULE_INFO_DRIVER_GROUP`: `DEBUG_FLR_PARAM_TYPE` = 2097251;
public const val `DEBUG_FLR_XML_MODULE_INFO_FILE_DESCRIPTION`: `DEBUG_FLR_PARAM_TYPE` = 2097183;
public const val `DEBUG_FLR_XML_MODULE_INFO_FILE_FLAGS`: `DEBUG_FLR_PARAM_TYPE` = 2097223;
public const val `DEBUG_FLR_XML_MODULE_INFO_FIXED_FILE_VER`: `DEBUG_FLR_PARAM_TYPE` = 2097178;
public const val `DEBUG_FLR_XML_MODULE_INFO_FIXED_PROD_VER`: `DEBUG_FLR_PARAM_TYPE` = 2097179;
public const val `DEBUG_FLR_XML_MODULE_INFO_IMAGE_NAME`: `DEBUG_FLR_PARAM_TYPE` = 2097172;
public const val `DEBUG_FLR_XML_MODULE_INFO_IMAGE_PATH`: `DEBUG_FLR_PARAM_TYPE` = 2097173;
public const val `DEBUG_FLR_XML_MODULE_INFO_INDEX`: `DEBUG_FLR_PARAM_TYPE` = 2097170;
public const val `DEBUG_FLR_XML_MODULE_INFO_INTERNAL_NAME`: `DEBUG_FLR_PARAM_TYPE` = 2097184;
public const val `DEBUG_FLR_XML_MODULE_INFO_NAME`: `DEBUG_FLR_PARAM_TYPE` = 2097171;
public const val `DEBUG_FLR_XML_MODULE_INFO_ON_STACK`: `DEBUG_FLR_PARAM_TYPE` = 2097177;
public const val `DEBUG_FLR_XML_MODULE_INFO_ORIG_FILE_NAME`: `DEBUG_FLR_PARAM_TYPE` = 2097185;
public const val `DEBUG_FLR_XML_MODULE_INFO_PRODUCT_NAME`: `DEBUG_FLR_PARAM_TYPE` = 2097188;
public const val `DEBUG_FLR_XML_MODULE_INFO_SIZE`: `DEBUG_FLR_PARAM_TYPE` = 2097187;
public const val `DEBUG_FLR_XML_MODULE_INFO_STRING_FILE_VER`: `DEBUG_FLR_PARAM_TYPE` = 2097180;
public const val `DEBUG_FLR_XML_MODULE_INFO_STRING_PROD_VER`: `DEBUG_FLR_PARAM_TYPE` = 2097181;
public const val `DEBUG_FLR_XML_MODULE_INFO_SYMBOL_TYPE`: `DEBUG_FLR_PARAM_TYPE` = 2097222;
public const val `DEBUG_FLR_XML_MODULE_INFO_SYMSRV_IMAGE_DETAIL`: `DEBUG_FLR_PARAM_TYPE` = 2097245;
public const val `DEBUG_FLR_XML_MODULE_INFO_SYMSRV_IMAGE_ERROR`: `DEBUG_FLR_PARAM_TYPE` = 2097244;
public const val `DEBUG_FLR_XML_MODULE_INFO_SYMSRV_IMAGE_SEC`: `DEBUG_FLR_PARAM_TYPE` = 2097246;
public const val `DEBUG_FLR_XML_MODULE_INFO_SYMSRV_IMAGE_STATUS`: `DEBUG_FLR_PARAM_TYPE` = 2097243;
public const val `DEBUG_FLR_XML_MODULE_INFO_SYMSRV_PDB_DETAIL`: `DEBUG_FLR_PARAM_TYPE` = 2097249;
public const val `DEBUG_FLR_XML_MODULE_INFO_SYMSRV_PDB_ERROR`: `DEBUG_FLR_PARAM_TYPE` = 2097248;
public const val `DEBUG_FLR_XML_MODULE_INFO_SYMSRV_PDB_SEC`: `DEBUG_FLR_PARAM_TYPE` = 2097250;
public const val `DEBUG_FLR_XML_MODULE_INFO_SYMSRV_PDB_STATUS`: `DEBUG_FLR_PARAM_TYPE` = 2097247;
public const val `DEBUG_FLR_XML_MODULE_INFO_TIMESTAMP`: `DEBUG_FLR_PARAM_TYPE` = 2097175;
public const val `DEBUG_FLR_XML_MODULE_INFO_UNLOADED`: `DEBUG_FLR_PARAM_TYPE` = 2097176;
public const val `DEBUG_FLR_XML_MODULE_LIST`: `DEBUG_FLR_PARAM_TYPE` = 2097154;
public const val `DEBUG_FLR_XML_PACKAGE_MONIKER`: `DEBUG_FLR_PARAM_TYPE` = 2097232;
public const val `DEBUG_FLR_XML_PACKAGE_NAME`: `DEBUG_FLR_PARAM_TYPE` = 2097236;
public const val `DEBUG_FLR_XML_PACKAGE_RELATIVE_APPLICATION_ID`: `DEBUG_FLR_PARAM_TYPE` = 2097233;
public const val `DEBUG_FLR_XML_PACKAGE_VERSION`: `DEBUG_FLR_PARAM_TYPE` = 2097237;
public const val `DEBUG_FLR_XML_PROBLEMCLASS`: `DEBUG_FLR_PARAM_TYPE` = 2097204;
public const val `DEBUG_FLR_XML_PROBLEMCLASS_FRAME_NUMBER`: `DEBUG_FLR_PARAM_TYPE` = 2097208;
public const val `DEBUG_FLR_XML_PROBLEMCLASS_LIST`: `DEBUG_FLR_PARAM_TYPE` = 2097203;
public const val `DEBUG_FLR_XML_PROBLEMCLASS_NAME`: `DEBUG_FLR_PARAM_TYPE` = 2097205;
public const val `DEBUG_FLR_XML_PROBLEMCLASS_THREAD_INDEX`: `DEBUG_FLR_PARAM_TYPE` = 2097209;
public const val `DEBUG_FLR_XML_PROBLEMCLASS_VALUE`: `DEBUG_FLR_PARAM_TYPE` = 2097206;
public const val `DEBUG_FLR_XML_PROBLEMCLASS_VALUE_TYPE`: `DEBUG_FLR_PARAM_TYPE` = 2097207;
public const val `DEBUG_FLR_XML_STACK_FRAME_TRIAGE_STATUS`: `DEBUG_FLR_PARAM_TYPE` = 2097210;
public const val `DEBUG_FLR_XML_SYSTEMINFO`: `DEBUG_FLR_PARAM_TYPE` = 2097226;
public const val `DEBUG_FLR_XML_SYSTEMINFO_SYSTEMMANUFACTURER`: `DEBUG_FLR_PARAM_TYPE` = 2097227;
public const val `DEBUG_FLR_XML_SYSTEMINFO_SYSTEMMARKER`: `DEBUG_FLR_PARAM_TYPE` = 2097229;
public const val `DEBUG_FLR_XML_SYSTEMINFO_SYSTEMMODEL`: `DEBUG_FLR_PARAM_TYPE` = 2097228;
public const val `DEBUG_FLR_XPROC_DUMP_AVAILABLE`: `DEBUG_FLR_PARAM_TYPE` = 1048592;
public const val `DEBUG_FLR_XPROC_HANG`: `DEBUG_FLR_PARAM_TYPE` = 1048588;
public const val `DEBUG_FLR_ZEROED_STACK`: `DEBUG_FLR_PARAM_TYPE` = 8194;
public const val `DEBUG_FORMAT_CAB_SECONDARY_ALL_IMAGES`: UInt = 268435456u;
public const val `DEBUG_FORMAT_CAB_SECONDARY_FILES`: UInt = 1073741824u;
public const val `DEBUG_FORMAT_DEFAULT`: UInt = 0u;
public const val `DEBUG_FORMAT_NO_OVERWRITE`: UInt = 2147483648u;
public const val `DEBUG_FORMAT_USER_SMALL_ADD_AVX_XSTATE_CONTEXT`: UInt = 131072u;
public const val `DEBUG_FORMAT_USER_SMALL_CODE_SEGMENTS`: UInt = 4096u;
public const val `DEBUG_FORMAT_USER_SMALL_DATA_SEGMENTS`: UInt = 16u;
public const val `DEBUG_FORMAT_USER_SMALL_FILTER_MEMORY`: UInt = 32u;
public const val `DEBUG_FORMAT_USER_SMALL_FILTER_PATHS`: UInt = 64u;
public const val `DEBUG_FORMAT_USER_SMALL_FILTER_TRIAGE`: UInt = 65536u;
public const val `DEBUG_FORMAT_USER_SMALL_FULL_AUXILIARY_STATE`: UInt = 16384u;
public const val `DEBUG_FORMAT_USER_SMALL_FULL_MEMORY`: UInt = 1u;
public const val `DEBUG_FORMAT_USER_SMALL_FULL_MEMORY_INFO`: UInt = 1024u;
public const val `DEBUG_FORMAT_USER_SMALL_HANDLE_DATA`: UInt = 2u;
public const val `DEBUG_FORMAT_USER_SMALL_IGNORE_INACCESSIBLE_MEM`: UInt = 134217728u;
public const val `DEBUG_FORMAT_USER_SMALL_INDIRECT_MEMORY`: UInt = 8u;
public const val `DEBUG_FORMAT_USER_SMALL_IPT_TRACE`: UInt = 262144u;
public const val `DEBUG_FORMAT_USER_SMALL_MODULE_HEADERS`: UInt = 32768u;
public const val `DEBUG_FORMAT_USER_SMALL_NO_AUXILIARY_STATE`: UInt = 8192u;
public const val `DEBUG_FORMAT_USER_SMALL_NO_OPTIONAL_DATA`: UInt = 512u;
public const val `DEBUG_FORMAT_USER_SMALL_PRIVATE_READ_WRITE_MEMORY`: UInt = 256u;
public const val `DEBUG_FORMAT_USER_SMALL_PROCESS_THREAD_DATA`: UInt = 128u;
public const val `DEBUG_FORMAT_USER_SMALL_SCAN_PARTIAL_PAGES`: UInt = 268435456u;
public const val `DEBUG_FORMAT_USER_SMALL_THREAD_INFO`: UInt = 2048u;
public const val `DEBUG_FORMAT_USER_SMALL_UNLOADED_MODULES`: UInt = 4u;
public const val `DEBUG_FORMAT_WRITE_CAB`: UInt = 536870912u;
public const val `DEBUG_FRAME_DEFAULT`: UInt = 0u;
public const val `DEBUG_FRAME_IGNORE_INLINE`: UInt = 1u;
public const val `DEBUG_GETFNENT_DEFAULT`: UInt = 0u;
public const val `DEBUG_GETFNENT_RAW_ENTRY_ONLY`: UInt = 1u;
public const val `DEBUG_GETMOD_DEFAULT`: UInt = 0u;
public const val `DEBUG_GETMOD_NO_LOADED_MODULES`: UInt = 1u;
public const val `DEBUG_GETMOD_NO_UNLOADED_MODULES`: UInt = 2u;
public const val `DEBUG_GET_PROC_DEFAULT`: UInt = 0u;
public const val `DEBUG_GET_PROC_FULL_MATCH`: UInt = 1u;
public const val `DEBUG_GET_PROC_ONLY_MATCH`: UInt = 2u;
public const val `DEBUG_GET_PROC_SERVICE_NAME`: UInt = 4u;
// UNSUPPORTED Rust 1592:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DEBUG_GET_TEXT_COMPLETIONS_IN {
//     pub Flags: u32,
//     pub MatchCountLimit: u32,
//     pub Reserved: [u64; 3],
// }

// UNSUPPORTED Rust 1599:1: declaration Impl has no candidate rule
// impl Default for DEBUG_GET_TEXT_COMPLETIONS_IN {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DEBUG_GET_TEXT_COMPLETIONS_IS_DOT_COMMAND`: UInt = 1u;
public const val `DEBUG_GET_TEXT_COMPLETIONS_IS_EXTENSION_COMMAND`: UInt = 2u;
public const val `DEBUG_GET_TEXT_COMPLETIONS_IS_SYMBOL`: UInt = 4u;
public const val `DEBUG_GET_TEXT_COMPLETIONS_NO_DOT_COMMANDS`: UInt = 1u;
public const val `DEBUG_GET_TEXT_COMPLETIONS_NO_EXTENSION_COMMANDS`: UInt = 2u;
public const val `DEBUG_GET_TEXT_COMPLETIONS_NO_SYMBOLS`: UInt = 4u;
// UNSUPPORTED Rust 1610:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DEBUG_GET_TEXT_COMPLETIONS_OUT {
//     pub Flags: u32,
//     pub ReplaceIndex: u32,
//     pub MatchCount: u32,
//     pub Reserved1: u32,
//     pub Reserved2: [u64; 2],
// }

// UNSUPPORTED Rust 1619:1: declaration Impl has no candidate rule
// impl Default for DEBUG_GET_TEXT_COMPLETIONS_OUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DEBUG_GSEL_ALLOW_HIGHER`: UInt = 4u;
public const val `DEBUG_GSEL_ALLOW_LOWER`: UInt = 2u;
public const val `DEBUG_GSEL_DEFAULT`: UInt = 0u;
public const val `DEBUG_GSEL_INLINE_CALLSITE`: UInt = 16u;
public const val `DEBUG_GSEL_NEAREST_ONLY`: UInt = 8u;
public const val `DEBUG_GSEL_NO_SYMBOL_LOADS`: UInt = 1u;
// UNSUPPORTED Rust 1630:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DEBUG_HANDLE_DATA_BASIC {
//     pub TypeNameSize: u32,
//     pub ObjectNameSize: u32,
//     pub Attributes: u32,
//     pub GrantedAccess: u32,
//     pub HandleCount: u32,
//     pub PointerCount: u32,
// }

public const val `DEBUG_HANDLE_DATA_TYPE_ALL_HANDLE_OPERATIONS`: UInt = 10u;
public const val `DEBUG_HANDLE_DATA_TYPE_BASIC`: UInt = 0u;
public const val `DEBUG_HANDLE_DATA_TYPE_HANDLE_COUNT`: UInt = 3u;
public const val `DEBUG_HANDLE_DATA_TYPE_MINI_EVENT_1`: UInt = 13u;
public const val `DEBUG_HANDLE_DATA_TYPE_MINI_MUTANT_1`: UInt = 7u;
public const val `DEBUG_HANDLE_DATA_TYPE_MINI_MUTANT_2`: UInt = 8u;
public const val `DEBUG_HANDLE_DATA_TYPE_MINI_PROCESS_1`: UInt = 11u;
public const val `DEBUG_HANDLE_DATA_TYPE_MINI_PROCESS_2`: UInt = 12u;
public const val `DEBUG_HANDLE_DATA_TYPE_MINI_SECTION_1`: UInt = 14u;
public const val `DEBUG_HANDLE_DATA_TYPE_MINI_SEMAPHORE_1`: UInt = 15u;
public const val `DEBUG_HANDLE_DATA_TYPE_MINI_THREAD_1`: UInt = 6u;
public const val `DEBUG_HANDLE_DATA_TYPE_OBJECT_NAME`: UInt = 2u;
public const val `DEBUG_HANDLE_DATA_TYPE_OBJECT_NAME_WIDE`: UInt = 5u;
public const val `DEBUG_HANDLE_DATA_TYPE_PER_HANDLE_OPERATIONS`: UInt = 9u;
public const val `DEBUG_HANDLE_DATA_TYPE_TYPE_NAME`: UInt = 1u;
public const val `DEBUG_HANDLE_DATA_TYPE_TYPE_NAME_WIDE`: UInt = 4u;
public const val `DEBUG_INTERRUPT_ACTIVE`: UInt = 0u;
public const val `DEBUG_INTERRUPT_EXIT`: UInt = 2u;
public const val `DEBUG_INTERRUPT_PASSIVE`: UInt = 1u;
public const val `DEBUG_IOUTPUT_ADDR_TRANSLATE`: UInt = 134217728u;
public const val `DEBUG_IOUTPUT_BREAKPOINT`: UInt = 536870912u;
public const val `DEBUG_IOUTPUT_EVENT`: UInt = 268435456u;
public const val `DEBUG_IOUTPUT_KD_PROTOCOL`: UInt = 2147483648u;
public const val `DEBUG_IOUTPUT_REMOTING`: UInt = 1073741824u;
// UNSUPPORTED Rust 1664:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DEBUG_IRP_INFO {
//     pub SizeOfStruct: u32,
//     pub IrpAddress: u64,
//     pub IoStatus: u32,
//     pub StackCount: u32,
//     pub CurrentLocation: u32,
//     pub MdlAddress: u64,
//     pub Thread: u64,
//     pub CancelRoutine: u64,
//     pub CurrentStack: DEBUG_IRP_STACK_INFO,
//     pub Stack: [DEBUG_IRP_STACK_INFO; 10],
// }

// UNSUPPORTED Rust 1678:1: declaration Impl has no candidate rule
// impl Default for DEBUG_IRP_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1683:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DEBUG_IRP_STACK_INFO {
//     pub Major: u8,
//     pub Minor: u8,
//     pub DeviceObject: u64,
//     pub FileObject: u64,
//     pub CompletionRoutine: u64,
//     pub StackAddress: u64,
// }

public const val `DEBUG_KERNEL_ACTIVE_DUMP`: UInt = 1030u;
public const val `DEBUG_KERNEL_CONNECTION`: UInt = 0u;
public const val `DEBUG_KERNEL_DUMP`: UInt = 1025u;
public const val `DEBUG_KERNEL_EXDI_DRIVER`: UInt = 2u;
public const val `DEBUG_KERNEL_FULL_DUMP`: UInt = 1026u;
public const val `DEBUG_KERNEL_IDNA`: UInt = 3u;
public const val `DEBUG_KERNEL_INSTALL_DRIVER`: UInt = 4u;
public const val `DEBUG_KERNEL_LOCAL`: UInt = 1u;
public const val `DEBUG_KERNEL_REPT`: UInt = 5u;
public const val `DEBUG_KERNEL_SMALL_DUMP`: UInt = 1024u;
public const val `DEBUG_KERNEL_TRACE_LOG`: UInt = 1028u;
public const val `DEBUG_KNOWN_STRUCT_GET_NAMES`: UInt = 1u;
public const val `DEBUG_KNOWN_STRUCT_GET_SINGLE_LINE_OUTPUT`: UInt = 2u;
public const val `DEBUG_KNOWN_STRUCT_SUPPRESS_TYPE_NAME`: UInt = 3u;
// UNSUPPORTED Rust 1707:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DEBUG_LAST_EVENT_INFO_BREAKPOINT {
//     pub Id: u32,
// }

// UNSUPPORTED Rust 1712:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DEBUG_LAST_EVENT_INFO_EXCEPTION {
//     pub ExceptionRecord: super::EXCEPTION_RECORD64,
//     pub FirstChance: u32,
// }

// UNSUPPORTED Rust 1718:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DEBUG_LAST_EVENT_INFO_EXIT_PROCESS {
//     pub ExitCode: u32,
// }

// UNSUPPORTED Rust 1723:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DEBUG_LAST_EVENT_INFO_EXIT_THREAD {
//     pub ExitCode: u32,
// }

// UNSUPPORTED Rust 1728:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DEBUG_LAST_EVENT_INFO_LOAD_MODULE {
//     pub Base: u64,
// }

// UNSUPPORTED Rust 1733:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DEBUG_LAST_EVENT_INFO_SERVICE_EXCEPTION {
//     pub Kind: u32,
//     pub DataSize: u32,
//     pub Address: u64,
// }

// UNSUPPORTED Rust 1740:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DEBUG_LAST_EVENT_INFO_SYSTEM_ERROR {
//     pub Error: u32,
//     pub Level: u32,
// }

// UNSUPPORTED Rust 1746:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DEBUG_LAST_EVENT_INFO_UNLOAD_MODULE {
//     pub Base: u64,
// }

public const val `DEBUG_LEVEL_ASSEMBLY`: UInt = 1u;
public const val `DEBUG_LEVEL_SOURCE`: UInt = 0u;
public const val `DEBUG_LIVE_USER_NON_INVASIVE`: UInt = 33u;
public const val `DEBUG_LOG_APPEND`: UInt = 1u;
public const val `DEBUG_LOG_DEFAULT`: UInt = 0u;
public const val `DEBUG_LOG_DML`: UInt = 4u;
public const val `DEBUG_LOG_UNICODE`: UInt = 2u;
public const val `DEBUG_MANAGED_ALLOWED`: UInt = 1u;
public const val `DEBUG_MANAGED_DISABLED`: UInt = 0u;
public const val `DEBUG_MANAGED_DLL_LOADED`: UInt = 2u;
public const val `DEBUG_MANRESET_DEFAULT`: UInt = 0u;
public const val `DEBUG_MANRESET_LOAD_DLL`: UInt = 1u;
public const val `DEBUG_MANSTR_LOADED_SUPPORT_DLL`: UInt = 1u;
public const val `DEBUG_MANSTR_LOAD_STATUS`: UInt = 2u;
public const val `DEBUG_MANSTR_NONE`: UInt = 0u;
public const val `DEBUG_MODNAME_IMAGE`: UInt = 0u;
public const val `DEBUG_MODNAME_LOADED_IMAGE`: UInt = 2u;
public const val `DEBUG_MODNAME_MAPPED_IMAGE`: UInt = 4u;
public const val `DEBUG_MODNAME_MODULE`: UInt = 1u;
public const val `DEBUG_MODNAME_SYMBOL_FILE`: UInt = 3u;
// UNSUPPORTED Rust 1771:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DEBUG_MODULE_AND_ID {
//     pub ModuleBase: u64,
//     pub Id: u64,
// }

public const val `DEBUG_MODULE_EXE_MODULE`: UInt = 4u;
public const val `DEBUG_MODULE_EXPLICIT`: UInt = 8u;
public const val `DEBUG_MODULE_LOADED`: UInt = 0u;
// UNSUPPORTED Rust 1780:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DEBUG_MODULE_PARAMETERS {
//     pub Base: u64,
//     pub Size: u32,
//     pub TimeDateStamp: u32,
//     pub Checksum: u32,
//     pub Flags: u32,
//     pub SymbolType: u32,
//     pub ImageNameSize: u32,
//     pub ModuleNameSize: u32,
//     pub LoadedImageNameSize: u32,
//     pub SymbolFileNameSize: u32,
//     pub MappedImageNameSize: u32,
//     pub Reserved: [u64; 2],
// }

// UNSUPPORTED Rust 1796:1: declaration Impl has no candidate rule
// impl Default for DEBUG_MODULE_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DEBUG_MODULE_SECONDARY`: UInt = 16u;
public const val `DEBUG_MODULE_SYM_BAD_CHECKSUM`: UInt = 65536u;
public const val `DEBUG_MODULE_SYNTHETIC`: UInt = 32u;
public const val `DEBUG_MODULE_UNLOADED`: UInt = 1u;
public const val `DEBUG_MODULE_USER_MODE`: UInt = 2u;
public const val `DEBUG_NOTIFY_SESSION_ACCESSIBLE`: UInt = 2u;
public const val `DEBUG_NOTIFY_SESSION_ACTIVE`: UInt = 0u;
public const val `DEBUG_NOTIFY_SESSION_INACCESSIBLE`: UInt = 3u;
public const val `DEBUG_NOTIFY_SESSION_INACTIVE`: UInt = 1u;
// UNSUPPORTED Rust 1810:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DEBUG_OFFSET_REGION {
//     pub Base: u64,
//     pub Size: u64,
// }

public const val `DEBUG_OFFSINFO_VIRTUAL_SOURCE`: UInt = 1u;
public const val `DEBUG_OUTCBF_COMBINED_EXPLICIT_FLUSH`: UInt = 1u;
public const val `DEBUG_OUTCBF_DML_HAS_SPECIAL_CHARACTERS`: UInt = 4u;
public const val `DEBUG_OUTCBF_DML_HAS_TAGS`: UInt = 2u;
public const val `DEBUG_OUTCBI_ANY_FORMAT`: UInt = 6u;
public const val `DEBUG_OUTCBI_DML`: UInt = 4u;
public const val `DEBUG_OUTCBI_EXPLICIT_FLUSH`: UInt = 1u;
public const val `DEBUG_OUTCBI_TEXT`: UInt = 2u;
public const val `DEBUG_OUTCB_DML`: UInt = 1u;
public const val `DEBUG_OUTCB_EXPLICIT_FLUSH`: UInt = 2u;
public const val `DEBUG_OUTCB_TEXT`: UInt = 0u;
public const val `DEBUG_OUTCTL_ALL_CLIENTS`: UInt = 1u;
public const val `DEBUG_OUTCTL_ALL_OTHER_CLIENTS`: UInt = 2u;
public const val `DEBUG_OUTCTL_AMBIENT`: UInt = 4294967295u;
public const val `DEBUG_OUTCTL_AMBIENT_DML`: UInt = 4294967294u;
public const val `DEBUG_OUTCTL_AMBIENT_TEXT`: UInt = 4294967295u;
public const val `DEBUG_OUTCTL_DML`: UInt = 32u;
public const val `DEBUG_OUTCTL_IGNORE`: UInt = 3u;
public const val `DEBUG_OUTCTL_LOG_ONLY`: UInt = 4u;
public const val `DEBUG_OUTCTL_NOT_LOGGED`: UInt = 8u;
public const val `DEBUG_OUTCTL_OVERRIDE_MASK`: UInt = 16u;
public const val `DEBUG_OUTCTL_SEND_MASK`: UInt = 7u;
public const val `DEBUG_OUTCTL_THIS_CLIENT`: UInt = 0u;
public const val `DEBUG_OUTPUT_DEBUGGEE`: UInt = 128u;
public const val `DEBUG_OUTPUT_DEBUGGEE_PROMPT`: UInt = 256u;
public const val `DEBUG_OUTPUT_ERROR`: UInt = 2u;
public const val `DEBUG_OUTPUT_EXTENSION_WARNING`: UInt = 64u;
public const val `DEBUG_OUTPUT_IDENTITY_DEFAULT`: UInt = 0u;
// UNSUPPORTED Rust 1844:1: non-scalar type Ptr unsupported
// pub const DEBUG_OUTPUT_NAME_END: windows_sys::core::PCSTR = windows_sys::core::s!("**NAME**");

// UNSUPPORTED Rust 1845:1: non-scalar type Ptr unsupported
// pub const DEBUG_OUTPUT_NAME_END_T: windows_sys::core::PCWSTR = windows_sys::core::w!("**NAME**");

// UNSUPPORTED Rust 1846:1: non-scalar type Ptr unsupported
// pub const DEBUG_OUTPUT_NAME_END_WIDE: windows_sys::core::PCWSTR = windows_sys::core::w!("**NAME**");

public const val `DEBUG_OUTPUT_NORMAL`: UInt = 1u;
// UNSUPPORTED Rust 1848:1: non-scalar type Ptr unsupported
// pub const DEBUG_OUTPUT_OFFSET_END: windows_sys::core::PCSTR = windows_sys::core::s!("**OFF**");

// UNSUPPORTED Rust 1849:1: non-scalar type Ptr unsupported
// pub const DEBUG_OUTPUT_OFFSET_END_T: windows_sys::core::PCWSTR = windows_sys::core::w!("**OFF**");

// UNSUPPORTED Rust 1850:1: non-scalar type Ptr unsupported
// pub const DEBUG_OUTPUT_OFFSET_END_WIDE: windows_sys::core::PCWSTR = windows_sys::core::w!("**OFF**");

public const val `DEBUG_OUTPUT_PROMPT`: UInt = 16u;
public const val `DEBUG_OUTPUT_PROMPT_REGISTERS`: UInt = 32u;
public const val `DEBUG_OUTPUT_STATUS`: UInt = 1024u;
public const val `DEBUG_OUTPUT_SYMBOLS`: UInt = 512u;
public const val `DEBUG_OUTPUT_SYMBOLS_DEFAULT`: UInt = 0u;
public const val `DEBUG_OUTPUT_SYMBOLS_NO_NAMES`: UInt = 1u;
public const val `DEBUG_OUTPUT_SYMBOLS_NO_OFFSETS`: UInt = 2u;
public const val `DEBUG_OUTPUT_SYMBOLS_NO_TYPES`: UInt = 16u;
public const val `DEBUG_OUTPUT_SYMBOLS_NO_VALUES`: UInt = 4u;
// UNSUPPORTED Rust 1860:1: non-scalar type Ptr unsupported
// pub const DEBUG_OUTPUT_TYPE_END: windows_sys::core::PCSTR = windows_sys::core::s!("**TYPE**");

// UNSUPPORTED Rust 1861:1: non-scalar type Ptr unsupported
// pub const DEBUG_OUTPUT_TYPE_END_T: windows_sys::core::PCWSTR = windows_sys::core::w!("**TYPE**");

// UNSUPPORTED Rust 1862:1: non-scalar type Ptr unsupported
// pub const DEBUG_OUTPUT_TYPE_END_WIDE: windows_sys::core::PCWSTR = windows_sys::core::w!("**TYPE**");

// UNSUPPORTED Rust 1863:1: non-scalar type Ptr unsupported
// pub const DEBUG_OUTPUT_VALUE_END: windows_sys::core::PCSTR = windows_sys::core::s!("**VALUE**");

// UNSUPPORTED Rust 1864:1: non-scalar type Ptr unsupported
// pub const DEBUG_OUTPUT_VALUE_END_T: windows_sys::core::PCWSTR = windows_sys::core::w!("**VALUE**");

// UNSUPPORTED Rust 1865:1: non-scalar type Ptr unsupported
// pub const DEBUG_OUTPUT_VALUE_END_WIDE: windows_sys::core::PCWSTR = windows_sys::core::w!("**VALUE**");

public const val `DEBUG_OUTPUT_VERBOSE`: UInt = 8u;
public const val `DEBUG_OUTPUT_WARNING`: UInt = 4u;
public const val `DEBUG_OUTPUT_XML`: UInt = 2048u;
public const val `DEBUG_OUTSYM_ALLOW_DISPLACEMENT`: UInt = 4u;
public const val `DEBUG_OUTSYM_DEFAULT`: UInt = 0u;
public const val `DEBUG_OUTSYM_FORCE_OFFSET`: UInt = 1u;
public const val `DEBUG_OUTSYM_SOURCE_LINE`: UInt = 2u;
public const val `DEBUG_OUTTYPE_ADDRESS_AT_END`: UInt = 131072u;
public const val `DEBUG_OUTTYPE_ADDRESS_OF_FIELD`: UInt = 65536u;
public const val `DEBUG_OUTTYPE_BLOCK_RECURSE`: UInt = 2097152u;
public const val `DEBUG_OUTTYPE_COMPACT_OUTPUT`: UInt = 8u;
public const val `DEBUG_OUTTYPE_DEFAULT`: UInt = 0u;
public const val `DEBUG_OUTTYPE_NO_INDENT`: UInt = 1u;
public const val `DEBUG_OUTTYPE_NO_OFFSET`: UInt = 2u;
public const val `DEBUG_OUTTYPE_VERBOSE`: UInt = 4u;
public const val `DEBUG_OUT_TEXT_REPL_DEFAULT`: UInt = 0u;
public const val `DEBUG_PHYSICAL_CACHED`: UInt = 1u;
public const val `DEBUG_PHYSICAL_DEFAULT`: UInt = 0u;
public const val `DEBUG_PHYSICAL_UNCACHED`: UInt = 2u;
public const val `DEBUG_PHYSICAL_WRITE_COMBINED`: UInt = 3u;
// UNSUPPORTED Rust 1886:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DEBUG_PNP_TRIAGE_INFO {
//     pub SizeOfStruct: u32,
//     pub Lock_Address: u64,
//     pub Lock_ActiveCount: i32,
//     pub Lock_ContentionCount: u32,
//     pub Lock_NumberOfExclusiveWaiters: u32,
//     pub Lock_NumberOfSharedWaiters: u32,
//     pub Lock_Flag: u16,
//     pub TriagedThread: u64,
//     pub ThreadCount: i32,
//     pub TriagedThread_WaitTime: u64,
// }

// UNSUPPORTED Rust 1900:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DEBUG_POOLTAG_DESCRIPTION {
//     pub SizeOfStruct: u32,
//     pub PoolTag: u32,
//     pub Description: [i8; 260],
//     pub Binary: [i8; 32],
//     pub Owner: [i8; 32],
// }

// UNSUPPORTED Rust 1909:1: declaration Impl has no candidate rule
// impl Default for DEBUG_POOLTAG_DESCRIPTION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1914:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DEBUG_POOL_DATA {
//     pub SizeofStruct: u32,
//     pub PoolBlock: u64,
//     pub Pool: u64,
//     pub PreviousSize: u32,
//     pub Size: u32,
//     pub PoolTag: u32,
//     pub ProcessBilled: u64,
//     pub Anonymous: DEBUG_POOL_DATA_0,
//     pub Reserved2: [u64; 4],
//     pub PoolTagDescription: [i8; 64],
// }

// UNSUPPORTED Rust 1928:1: declaration Impl has no candidate rule
// impl Default for DEBUG_POOL_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1933:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DEBUG_POOL_DATA_0 {
//     pub Anonymous: DEBUG_POOL_DATA_0_0,
//     pub AsUlong: u32,
// }

// UNSUPPORTED Rust 1939:1: declaration Impl has no candidate rule
// impl Default for DEBUG_POOL_DATA_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1944:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DEBUG_POOL_DATA_0_0 {
//     pub _bitfield: u32,
// }

public typealias `DEBUG_POOL_REGION` = Int;
// UNSUPPORTED Rust 1950:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DEBUG_PROCESSOR_IDENTIFICATION_ALL {
//     pub Alpha: DEBUG_PROCESSOR_IDENTIFICATION_ALPHA,
//     pub Amd64: DEBUG_PROCESSOR_IDENTIFICATION_AMD64,
//     pub Ia64: DEBUG_PROCESSOR_IDENTIFICATION_IA64,
//     pub X86: DEBUG_PROCESSOR_IDENTIFICATION_X86,
//     pub Arm: DEBUG_PROCESSOR_IDENTIFICATION_ARM,
//     pub Arm64: DEBUG_PROCESSOR_IDENTIFICATION_ARM64,
// }

// UNSUPPORTED Rust 1960:1: declaration Impl has no candidate rule
// impl Default for DEBUG_PROCESSOR_IDENTIFICATION_ALL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1965:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DEBUG_PROCESSOR_IDENTIFICATION_ALPHA {
//     pub Type: u32,
//     pub Revision: u32,
// }

// UNSUPPORTED Rust 1971:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DEBUG_PROCESSOR_IDENTIFICATION_AMD64 {
//     pub Family: u32,
//     pub Model: u32,
//     pub Stepping: u32,
//     pub VendorString: [i8; 16],
// }

// UNSUPPORTED Rust 1979:1: declaration Impl has no candidate rule
// impl Default for DEBUG_PROCESSOR_IDENTIFICATION_AMD64 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1984:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DEBUG_PROCESSOR_IDENTIFICATION_ARM {
//     pub Model: u32,
//     pub Revision: u32,
//     pub VendorString: [i8; 16],
// }

// UNSUPPORTED Rust 1991:1: declaration Impl has no candidate rule
// impl Default for DEBUG_PROCESSOR_IDENTIFICATION_ARM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1996:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DEBUG_PROCESSOR_IDENTIFICATION_ARM64 {
//     pub Model: u32,
//     pub Revision: u32,
//     pub VendorString: [i8; 16],
// }

// UNSUPPORTED Rust 2003:1: declaration Impl has no candidate rule
// impl Default for DEBUG_PROCESSOR_IDENTIFICATION_ARM64 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2008:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DEBUG_PROCESSOR_IDENTIFICATION_IA64 {
//     pub Model: u32,
//     pub Revision: u32,
//     pub Family: u32,
//     pub ArchRev: u32,
//     pub VendorString: [i8; 16],
// }

// UNSUPPORTED Rust 2017:1: declaration Impl has no candidate rule
// impl Default for DEBUG_PROCESSOR_IDENTIFICATION_IA64 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2022:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DEBUG_PROCESSOR_IDENTIFICATION_X86 {
//     pub Family: u32,
//     pub Model: u32,
//     pub Stepping: u32,
//     pub VendorString: [i8; 16],
// }

// UNSUPPORTED Rust 2030:1: declaration Impl has no candidate rule
// impl Default for DEBUG_PROCESSOR_IDENTIFICATION_X86 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DEBUG_PROCESS_DETACH_ON_EXIT`: UInt = 1u;
public const val `DEBUG_PROCESS_ONLY_THIS_PROCESS`: UInt = 2u;
public const val `DEBUG_PROC_DESC_DEFAULT`: UInt = 0u;
public const val `DEBUG_PROC_DESC_NO_COMMAND_LINE`: UInt = 8u;
public const val `DEBUG_PROC_DESC_NO_MTS_PACKAGES`: UInt = 4u;
public const val `DEBUG_PROC_DESC_NO_PATHS`: UInt = 1u;
public const val `DEBUG_PROC_DESC_NO_SERVICES`: UInt = 2u;
public const val `DEBUG_PROC_DESC_NO_SESSION_ID`: UInt = 16u;
public const val `DEBUG_PROC_DESC_NO_USER_NAME`: UInt = 32u;
public const val `DEBUG_PROC_DESC_WITH_ARCHITECTURE`: UInt = 128u;
public const val `DEBUG_PROC_DESC_WITH_PACKAGEFAMILY`: UInt = 64u;
// UNSUPPORTED Rust 2046:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DEBUG_READ_USER_MINIDUMP_STREAM {
//     pub StreamType: u32,
//     pub Flags: u32,
//     pub Offset: u64,
//     pub Buffer: *mut core::ffi::c_void,
//     pub BufferSize: u32,
//     pub BufferUsed: u32,
// }

// UNSUPPORTED Rust 2056:1: declaration Impl has no candidate rule
// impl Default for DEBUG_READ_USER_MINIDUMP_STREAM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DEBUG_REGISTERS_ALL`: UInt = 7u;
public const val `DEBUG_REGISTERS_DEFAULT`: UInt = 0u;
public const val `DEBUG_REGISTERS_FLOAT`: UInt = 4u;
public const val `DEBUG_REGISTERS_INT32`: UInt = 1u;
public const val `DEBUG_REGISTERS_INT64`: UInt = 2u;
// UNSUPPORTED Rust 2066:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DEBUG_REGISTER_DESCRIPTION {
//     pub Type: u32,
//     pub Flags: u32,
//     pub SubregMaster: u32,
//     pub SubregLength: u32,
//     pub SubregMask: u64,
//     pub SubregShift: u32,
//     pub Reserved0: u32,
// }

public const val `DEBUG_REGISTER_SUB_REGISTER`: UInt = 1u;
public const val `DEBUG_REGSRC_DEBUGGEE`: UInt = 0u;
public const val `DEBUG_REGSRC_EXPLICIT`: UInt = 1u;
public const val `DEBUG_REGSRC_FRAME`: UInt = 2u;
public const val `DEBUG_REQUEST_ADD_CACHED_SYMBOL_INFO`: UInt = 16u;
public const val `DEBUG_REQUEST_CLOSE_TOKEN`: UInt = 30u;
public const val `DEBUG_REQUEST_CURRENT_OUTPUT_CALLBACKS_ARE_DML_AWARE`: UInt = 19u;
public const val `DEBUG_REQUEST_DUPLICATE_TOKEN`: UInt = 28u;
public const val `DEBUG_REQUEST_EXT_TYPED_DATA_ANSI`: UInt = 12u;
public const val `DEBUG_REQUEST_GET_ADDITIONAL_CREATE_OPTIONS`: UInt = 4u;
public const val `DEBUG_REQUEST_GET_CACHED_SYMBOL_INFO`: UInt = 15u;
public const val `DEBUG_REQUEST_GET_CAPTURED_EVENT_CODE_OFFSET`: UInt = 10u;
public const val `DEBUG_REQUEST_GET_DUMP_HEADER`: UInt = 21u;
public const val `DEBUG_REQUEST_GET_EXTENSION_SEARCH_PATH_WIDE`: UInt = 13u;
public const val `DEBUG_REQUEST_GET_IMAGE_ARCHITECTURE`: UInt = 39u;
public const val `DEBUG_REQUEST_GET_INSTRUMENTATION_VERSION`: UInt = 37u;
public const val `DEBUG_REQUEST_GET_MODULE_ARCHITECTURE`: UInt = 38u;
public const val `DEBUG_REQUEST_GET_OFFSET_UNWIND_INFORMATION`: UInt = 20u;
public const val `DEBUG_REQUEST_GET_TEXT_COMPLETIONS_ANSI`: UInt = 18u;
public const val `DEBUG_REQUEST_GET_TEXT_COMPLETIONS_WIDE`: UInt = 14u;
public const val `DEBUG_REQUEST_GET_WIN32_MAJOR_MINOR_VERSIONS`: UInt = 6u;
public const val `DEBUG_REQUEST_INLINE_QUERY`: UInt = 35u;
public const val `DEBUG_REQUEST_MIDORI`: UInt = 23u;
public const val `DEBUG_REQUEST_MISC_INFORMATION`: UInt = 25u;
public const val `DEBUG_REQUEST_OPEN_PROCESS_TOKEN`: UInt = 26u;
public const val `DEBUG_REQUEST_OPEN_THREAD_TOKEN`: UInt = 27u;
public const val `DEBUG_REQUEST_PROCESS_DESCRIPTORS`: UInt = 24u;
public const val `DEBUG_REQUEST_QUERY_INFO_TOKEN`: UInt = 29u;
public const val `DEBUG_REQUEST_READ_CAPTURED_EVENT_CODE_STREAM`: UInt = 11u;
public const val `DEBUG_REQUEST_READ_USER_MINIDUMP_STREAM`: UInt = 7u;
public const val `DEBUG_REQUEST_REMOVE_CACHED_SYMBOL_INFO`: UInt = 17u;
public const val `DEBUG_REQUEST_RESUME_THREAD`: UInt = 34u;
public const val `DEBUG_REQUEST_SET_ADDITIONAL_CREATE_OPTIONS`: UInt = 5u;
public const val `DEBUG_REQUEST_SET_DUMP_HEADER`: UInt = 22u;
public const val `DEBUG_REQUEST_SET_LOCAL_IMPLICIT_COMMAND_LINE`: UInt = 9u;
public const val `DEBUG_REQUEST_SOURCE_PATH_HAS_SOURCE_SERVER`: UInt = 0u;
public const val `DEBUG_REQUEST_TARGET_CAN_DETACH`: UInt = 8u;
public const val `DEBUG_REQUEST_TARGET_EXCEPTION_CONTEXT`: UInt = 1u;
public const val `DEBUG_REQUEST_TARGET_EXCEPTION_RECORD`: UInt = 3u;
public const val `DEBUG_REQUEST_TARGET_EXCEPTION_THREAD`: UInt = 2u;
public const val `DEBUG_REQUEST_TL_INSTRUMENTATION_AWARE`: UInt = 36u;
public const val `DEBUG_REQUEST_WOW_MODULE`: UInt = 32u;
public const val `DEBUG_REQUEST_WOW_PROCESS`: UInt = 31u;
public const val `DEBUG_SCOPE_GROUP_ALL`: UInt = 3u;
public const val `DEBUG_SCOPE_GROUP_ARGUMENTS`: UInt = 1u;
public const val `DEBUG_SCOPE_GROUP_BY_DATAMODEL`: UInt = 4u;
public const val `DEBUG_SCOPE_GROUP_LOCALS`: UInt = 2u;
public const val `DEBUG_SERVERS_ALL`: UInt = 3u;
public const val `DEBUG_SERVERS_DEBUGGER`: UInt = 1u;
public const val `DEBUG_SERVERS_PROCESS`: UInt = 2u;
public const val `DEBUG_SESSION_ACTIVE`: UInt = 0u;
public const val `DEBUG_SESSION_END`: UInt = 4u;
public const val `DEBUG_SESSION_END_SESSION_ACTIVE_DETACH`: UInt = 2u;
public const val `DEBUG_SESSION_END_SESSION_ACTIVE_TERMINATE`: UInt = 1u;
public const val `DEBUG_SESSION_END_SESSION_PASSIVE`: UInt = 3u;
public const val `DEBUG_SESSION_FAILURE`: UInt = 7u;
public const val `DEBUG_SESSION_HIBERNATE`: UInt = 6u;
public const val `DEBUG_SESSION_REBOOT`: UInt = 5u;
// UNSUPPORTED Rust 2135:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DEBUG_SMBIOS_INFO {
//     pub SizeOfStruct: u32,
//     pub SmbiosMajorVersion: u8,
//     pub SmbiosMinorVersion: u8,
//     pub DMIVersion: u8,
//     pub TableSize: u32,
//     pub BiosMajorRelease: u8,
//     pub BiosMinorRelease: u8,
//     pub FirmwareMajorRelease: u8,
//     pub FirmwareMinorRelease: u8,
//     pub BaseBoardManufacturer: [i8; 64],
//     pub BaseBoardProduct: [i8; 64],
//     pub BaseBoardVersion: [i8; 64],
//     pub BiosReleaseDate: [i8; 64],
//     pub BiosVendor: [i8; 64],
//     pub BiosVersion: [i8; 64],
//     pub SystemFamily: [i8; 64],
//     pub SystemManufacturer: [i8; 64],
//     pub SystemProductName: [i8; 64],
//     pub SystemSKU: [i8; 64],
//     pub SystemVersion: [i8; 64],
// }

// UNSUPPORTED Rust 2159:1: declaration Impl has no candidate rule
// impl Default for DEBUG_SMBIOS_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DEBUG_SOURCE_IS_STATEMENT`: UInt = 1u;
// UNSUPPORTED Rust 2165:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DEBUG_SPECIFIC_FILTER_PARAMETERS {
//     pub ExecutionOption: u32,
//     pub ContinueOption: u32,
//     pub TextSize: u32,
//     pub CommandSize: u32,
//     pub ArgumentSize: u32,
// }

public const val `DEBUG_SRCFILE_SYMBOL_CHECKSUMINFO`: UInt = 2u;
public const val `DEBUG_SRCFILE_SYMBOL_TOKEN`: UInt = 0u;
public const val `DEBUG_SRCFILE_SYMBOL_TOKEN_SOURCE_COMMAND_WIDE`: UInt = 1u;
public const val `DEBUG_STACK_ARGUMENTS`: UInt = 1u;
public const val `DEBUG_STACK_COLUMN_NAMES`: UInt = 16u;
public const val `DEBUG_STACK_DML`: UInt = 2048u;
// UNSUPPORTED Rust 2180:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DEBUG_STACK_FRAME {
//     pub InstructionOffset: u64,
//     pub ReturnOffset: u64,
//     pub FrameOffset: u64,
//     pub StackOffset: u64,
//     pub FuncTableEntry: u64,
//     pub Params: [u64; 4],
//     pub Reserved: [u64; 6],
//     pub Virtual: windows_sys::core::BOOL,
//     pub FrameNumber: u32,
// }

// UNSUPPORTED Rust 2193:1: declaration Impl has no candidate rule
// impl Default for DEBUG_STACK_FRAME {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DEBUG_STACK_FRAME_ADDRESSES`: UInt = 8u;
public const val `DEBUG_STACK_FRAME_ADDRESSES_RA_ONLY`: UInt = 256u;
public const val `DEBUG_STACK_FRAME_ARCH`: UInt = 16384u;
// UNSUPPORTED Rust 2201:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DEBUG_STACK_FRAME_EX {
//     pub InstructionOffset: u64,
//     pub ReturnOffset: u64,
//     pub FrameOffset: u64,
//     pub StackOffset: u64,
//     pub FuncTableEntry: u64,
//     pub Params: [u64; 4],
//     pub Reserved: [u64; 6],
//     pub Virtual: windows_sys::core::BOOL,
//     pub FrameNumber: u32,
//     pub InlineFrameContext: u32,
//     pub Reserved1: u32,
// }

// UNSUPPORTED Rust 2216:1: declaration Impl has no candidate rule
// impl Default for DEBUG_STACK_FRAME_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DEBUG_STACK_FRAME_MEMORY_USAGE`: UInt = 512u;
public const val `DEBUG_STACK_FRAME_NUMBERS`: UInt = 64u;
public const val `DEBUG_STACK_FRAME_OFFSETS`: UInt = 4096u;
public const val `DEBUG_STACK_FUNCTION_INFO`: UInt = 2u;
public const val `DEBUG_STACK_NONVOLATILE_REGISTERS`: UInt = 32u;
public const val `DEBUG_STACK_PARAMETERS`: UInt = 128u;
public const val `DEBUG_STACK_PARAMETERS_NEWLINE`: UInt = 1024u;
public const val `DEBUG_STACK_PROVIDER`: UInt = 8192u;
public const val `DEBUG_STACK_SOURCE_LINE`: UInt = 4u;
public const val `DEBUG_STATUS_BREAK`: UInt = 6u;
public const val `DEBUG_STATUS_GO`: UInt = 1u;
public const val `DEBUG_STATUS_GO_HANDLED`: UInt = 2u;
public const val `DEBUG_STATUS_GO_NOT_HANDLED`: UInt = 3u;
public const val `DEBUG_STATUS_IGNORE_EVENT`: UInt = 9u;
public const val `DEBUG_STATUS_INSIDE_WAIT`: ULong = 4294967296uL;
public const val `DEBUG_STATUS_MASK`: UInt = 31u;
public const val `DEBUG_STATUS_NO_CHANGE`: UInt = 0u;
public const val `DEBUG_STATUS_NO_DEBUGGEE`: UInt = 7u;
public const val `DEBUG_STATUS_OUT_OF_SYNC`: UInt = 15u;
public const val `DEBUG_STATUS_RESTART_REQUESTED`: UInt = 10u;
public const val `DEBUG_STATUS_REVERSE_GO`: UInt = 11u;
public const val `DEBUG_STATUS_REVERSE_STEP_BRANCH`: UInt = 12u;
public const val `DEBUG_STATUS_REVERSE_STEP_INTO`: UInt = 14u;
public const val `DEBUG_STATUS_REVERSE_STEP_OVER`: UInt = 13u;
public const val `DEBUG_STATUS_STEP_BRANCH`: UInt = 8u;
public const val `DEBUG_STATUS_STEP_INTO`: UInt = 5u;
public const val `DEBUG_STATUS_STEP_OVER`: UInt = 4u;
public const val `DEBUG_STATUS_TIMEOUT`: UInt = 17u;
public const val `DEBUG_STATUS_WAIT_INPUT`: UInt = 16u;
public const val `DEBUG_STATUS_WAIT_TIMEOUT`: ULong = 8589934592uL;
// UNSUPPORTED Rust 2251:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DEBUG_SYMBOL_ENTRY {
//     pub ModuleBase: u64,
//     pub Offset: u64,
//     pub Id: u64,
//     pub Arg64: u64,
//     pub Size: u32,
//     pub Flags: u32,
//     pub TypeId: u32,
//     pub NameSize: u32,
//     pub Token: u32,
//     pub Tag: u32,
//     pub Arg32: u32,
//     pub Reserved: u32,
// }

public const val `DEBUG_SYMBOL_EXPANDED`: UInt = 16u;
public const val `DEBUG_SYMBOL_EXPANSION_LEVEL_MASK`: UInt = 15u;
public const val `DEBUG_SYMBOL_IS_ARGUMENT`: UInt = 256u;
public const val `DEBUG_SYMBOL_IS_ARRAY`: UInt = 64u;
public const val `DEBUG_SYMBOL_IS_FLOAT`: UInt = 128u;
public const val `DEBUG_SYMBOL_IS_LOCAL`: UInt = 512u;
// UNSUPPORTED Rust 2273:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DEBUG_SYMBOL_PARAMETERS {
//     pub Module: u64,
//     pub TypeId: u32,
//     pub ParentSymbol: u32,
//     pub SubElements: u32,
//     pub Flags: u32,
//     pub Reserved: u64,
// }

public const val `DEBUG_SYMBOL_READ_ONLY`: UInt = 32u;
// UNSUPPORTED Rust 2284:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DEBUG_SYMBOL_SOURCE_ENTRY {
//     pub ModuleBase: u64,
//     pub Offset: u64,
//     pub FileNameId: u64,
//     pub EngineInternal: u64,
//     pub Size: u32,
//     pub Flags: u32,
//     pub FileNameSize: u32,
//     pub StartLine: u32,
//     pub EndLine: u32,
//     pub StartColumn: u32,
//     pub EndColumn: u32,
//     pub Reserved: u32,
// }

public const val `DEBUG_SYMENT_IS_CODE`: UInt = 1u;
public const val `DEBUG_SYMENT_IS_DATA`: UInt = 2u;
public const val `DEBUG_SYMENT_IS_LOCAL`: UInt = 8u;
public const val `DEBUG_SYMENT_IS_MANAGED`: UInt = 16u;
public const val `DEBUG_SYMENT_IS_PARAMETER`: UInt = 4u;
public const val `DEBUG_SYMENT_IS_SYNTHETIC`: UInt = 32u;
public const val `DEBUG_SYMINFO_BREAKPOINT_SOURCE_LINE`: UInt = 0u;
public const val `DEBUG_SYMINFO_GET_MODULE_SYMBOL_NAMES_AND_OFFSETS`: UInt = 3u;
public const val `DEBUG_SYMINFO_GET_SYMBOL_NAME_BY_OFFSET_AND_TAG_WIDE`: UInt = 2u;
public const val `DEBUG_SYMINFO_IMAGEHLP_MODULEW64`: UInt = 1u;
public const val `DEBUG_SYMTYPE_CODEVIEW`: UInt = 2u;
public const val `DEBUG_SYMTYPE_COFF`: UInt = 1u;
public const val `DEBUG_SYMTYPE_DEFERRED`: UInt = 5u;
public const val `DEBUG_SYMTYPE_DIA`: UInt = 7u;
public const val `DEBUG_SYMTYPE_EXPORT`: UInt = 4u;
public const val `DEBUG_SYMTYPE_NONE`: UInt = 0u;
public const val `DEBUG_SYMTYPE_PDB`: UInt = 3u;
public const val `DEBUG_SYMTYPE_SYM`: UInt = 6u;
public const val `DEBUG_SYSOBJINFO_CURRENT_PROCESS_COOKIE`: UInt = 2u;
public const val `DEBUG_SYSOBJINFO_THREAD_BASIC_INFORMATION`: UInt = 0u;
public const val `DEBUG_SYSOBJINFO_THREAD_NAME_WIDE`: UInt = 1u;
public const val `DEBUG_SYSVERSTR_BUILD`: UInt = 1u;
public const val `DEBUG_SYSVERSTR_SERVICE_PACK`: UInt = 0u;
public const val `DEBUG_TBINFO_AFFINITY`: UInt = 32u;
public const val `DEBUG_TBINFO_ALL`: UInt = 63u;
public const val `DEBUG_TBINFO_EXIT_STATUS`: UInt = 1u;
public const val `DEBUG_TBINFO_PRIORITY`: UInt = 4u;
public const val `DEBUG_TBINFO_PRIORITY_CLASS`: UInt = 2u;
public const val `DEBUG_TBINFO_START_OFFSET`: UInt = 16u;
public const val `DEBUG_TBINFO_TIMES`: UInt = 8u;
// UNSUPPORTED Rust 2330:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DEBUG_THREAD_BASIC_INFORMATION {
//     pub Valid: u32,
//     pub ExitStatus: u32,
//     pub PriorityClass: u32,
//     pub Priority: u32,
//     pub CreateTime: u64,
//     pub ExitTime: u64,
//     pub KernelTime: u64,
//     pub UserTime: u64,
//     pub StartOffset: u64,
//     pub Affinity: u64,
// }

// UNSUPPORTED Rust 2344:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DEBUG_TRIAGE_FOLLOWUP_INFO {
//     pub SizeOfStruct: u32,
//     pub OwnerNameSize: u32,
//     pub OwnerName: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 2351:1: declaration Impl has no candidate rule
// impl Default for DEBUG_TRIAGE_FOLLOWUP_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2356:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DEBUG_TRIAGE_FOLLOWUP_INFO_2 {
//     pub SizeOfStruct: u32,
//     pub OwnerNameSize: u32,
//     pub OwnerName: windows_sys::core::PSTR,
//     pub FeaturePathSize: u32,
//     pub FeaturePath: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 2365:1: declaration Impl has no candidate rule
// impl Default for DEBUG_TRIAGE_FOLLOWUP_INFO_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2370:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DEBUG_TYPED_DATA {
//     pub ModBase: u64,
//     pub Offset: u64,
//     pub EngineHandle: u64,
//     pub Data: u64,
//     pub Size: u32,
//     pub Flags: u32,
//     pub TypeId: u32,
//     pub BaseTypeId: u32,
//     pub Tag: u32,
//     pub Register: u32,
//     pub Internal: [u64; 9],
// }

// UNSUPPORTED Rust 2385:1: declaration Impl has no candidate rule
// impl Default for DEBUG_TYPED_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DEBUG_TYPED_DATA_IS_IN_MEMORY`: UInt = 1u;
public const val `DEBUG_TYPED_DATA_PHYSICAL_CACHED`: UInt = 4u;
public const val `DEBUG_TYPED_DATA_PHYSICAL_DEFAULT`: UInt = 2u;
public const val `DEBUG_TYPED_DATA_PHYSICAL_MEMORY`: UInt = 14u;
public const val `DEBUG_TYPED_DATA_PHYSICAL_UNCACHED`: UInt = 6u;
public const val `DEBUG_TYPED_DATA_PHYSICAL_WRITE_COMBINED`: UInt = 8u;
public const val `DEBUG_TYPEOPTS_FORCERADIX_OUTPUT`: UInt = 4u;
public const val `DEBUG_TYPEOPTS_LONGSTATUS_DISPLAY`: UInt = 2u;
public const val `DEBUG_TYPEOPTS_MATCH_MAXSIZE`: UInt = 8u;
public const val `DEBUG_TYPEOPTS_UNICODE_DISPLAY`: UInt = 1u;
public const val `DEBUG_USER_WINDOWS_DUMP`: UInt = 1025u;
public const val `DEBUG_USER_WINDOWS_DUMP_WINDOWS_CE`: UInt = 1029u;
public const val `DEBUG_USER_WINDOWS_IDNA`: UInt = 2u;
public const val `DEBUG_USER_WINDOWS_PROCESS`: UInt = 0u;
public const val `DEBUG_USER_WINDOWS_PROCESS_SERVER`: UInt = 1u;
public const val `DEBUG_USER_WINDOWS_REPT`: UInt = 3u;
public const val `DEBUG_USER_WINDOWS_SMALL_DUMP`: UInt = 1024u;
// UNSUPPORTED Rust 2407:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DEBUG_VALUE {
//     pub Anonymous: DEBUG_VALUE_0,
//     pub TailOfRawBytes: u32,
//     pub Type: u32,
// }

// UNSUPPORTED Rust 2414:1: declaration Impl has no candidate rule
// impl Default for DEBUG_VALUE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2419:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DEBUG_VALUE_0 {
//     pub I8: u8,
//     pub I16: u16,
//     pub I32: u32,
//     pub Anonymous: DEBUG_VALUE_0_0,
//     pub F32: f32,
//     pub F64: f64,
//     pub F80Bytes: [u8; 10],
//     pub F82Bytes: [u8; 11],
//     pub F128Bytes: [u8; 16],
//     pub VI8: [u8; 16],
//     pub VI16: [u16; 8],
//     pub VI32: [u32; 4],
//     pub VI64: [u64; 2],
//     pub VF32: [f32; 4],
//     pub VF64: [f64; 2],
//     pub I64Parts32: DEBUG_VALUE_0_1,
//     pub F128Parts64: DEBUG_VALUE_0_2,
//     pub RawBytes: [u8; 24],
// }

// UNSUPPORTED Rust 2441:1: declaration Impl has no candidate rule
// impl Default for DEBUG_VALUE_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2446:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DEBUG_VALUE_0_0 {
//     pub I64: u64,
//     pub Nat: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 2452:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DEBUG_VALUE_0_2 {
//     pub LowPart: u64,
//     pub HighPart: i64,
// }

// UNSUPPORTED Rust 2458:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DEBUG_VALUE_0_1 {
//     pub LowPart: u32,
//     pub HighPart: u32,
// }

public const val `DEBUG_VALUE_FLOAT128`: UInt = 9u;
public const val `DEBUG_VALUE_FLOAT32`: UInt = 5u;
public const val `DEBUG_VALUE_FLOAT64`: UInt = 6u;
public const val `DEBUG_VALUE_FLOAT80`: UInt = 7u;
public const val `DEBUG_VALUE_FLOAT82`: UInt = 8u;
public const val `DEBUG_VALUE_INT16`: UInt = 2u;
public const val `DEBUG_VALUE_INT32`: UInt = 3u;
public const val `DEBUG_VALUE_INT64`: UInt = 4u;
public const val `DEBUG_VALUE_INT8`: UInt = 1u;
public const val `DEBUG_VALUE_INVALID`: UInt = 0u;
public const val `DEBUG_VALUE_TYPES`: UInt = 12u;
public const val `DEBUG_VALUE_VECTOR128`: UInt = 11u;
public const val `DEBUG_VALUE_VECTOR64`: UInt = 10u;
public const val `DEBUG_VSEARCH_DEFAULT`: UInt = 0u;
public const val `DEBUG_VSEARCH_WRITABLE_ONLY`: UInt = 1u;
public const val `DEBUG_VSOURCE_DEBUGGEE`: UInt = 1u;
public const val `DEBUG_VSOURCE_DUMP_WITHOUT_MEMINFO`: UInt = 3u;
public const val `DEBUG_VSOURCE_INVALID`: UInt = 0u;
public const val `DEBUG_VSOURCE_MAPPED_IMAGE`: UInt = 2u;
public const val `DEBUG_WAIT_DEFAULT`: UInt = 0u;
public const val `DISK_READ_0_BYTES`: `TANALYZE_RETURN` = 3;
public const val `DISK_WRITE`: `TANALYZE_RETURN` = 4;
public const val `DUMP_HANDLE_FLAG_CID_TABLE`: UInt = 32u;
public const val `DUMP_HANDLE_FLAG_KERNEL_TABLE`: UInt = 16u;
public const val `DUMP_HANDLE_FLAG_PRINT_FREE_ENTRY`: UInt = 4u;
public const val `DUMP_HANDLE_FLAG_PRINT_OBJECT`: UInt = 2u;
public const val `DbgPoolRegionMax`: `DEBUG_POOL_REGION` = 6;
public const val `DbgPoolRegionNonPaged`: `DEBUG_POOL_REGION` = 3;
public const val `DbgPoolRegionNonPagedExpansion`: `DEBUG_POOL_REGION` = 4;
public const val `DbgPoolRegionPaged`: `DEBUG_POOL_REGION` = 2;
public const val `DbgPoolRegionSessionPaged`: `DEBUG_POOL_REGION` = 5;
public const val `DbgPoolRegionSpecial`: `DEBUG_POOL_REGION` = 1;
public const val `DbgPoolRegionUnknown`: `DEBUG_POOL_REGION` = 0;
// UNSUPPORTED Rust 2497:1: generic scalar type unsupported
// pub type ENTRY_CALLBACK = Option<unsafe extern "system" fn(entryaddress: u64, context: *mut core::ffi::c_void) -> windows_sys::core::HRESULT>;

public const val `ERROR_DBG_CANCELLED`: UInt = 3221226695u;
public const val `ERROR_DBG_TIMEOUT`: UInt = 3221226932u;
public const val `EXIT_ON_CONTROLC`: UInt = 8u;
public const val `EXIT_STATUS`: `TANALYZE_RETURN` = 2;
public const val `EXTDLL_DATA_QUERY_BUILD_BINDIR`: UInt = 1u;
public const val `EXTDLL_DATA_QUERY_BUILD_BINDIR_SYMSRV`: UInt = 11u;
public const val `EXTDLL_DATA_QUERY_BUILD_SYMDIR`: UInt = 2u;
public const val `EXTDLL_DATA_QUERY_BUILD_SYMDIR_SYMSRV`: UInt = 12u;
public const val `EXTDLL_DATA_QUERY_BUILD_WOW64BINDIR`: UInt = 4u;
public const val `EXTDLL_DATA_QUERY_BUILD_WOW64BINDIR_SYMSRV`: UInt = 14u;
public const val `EXTDLL_DATA_QUERY_BUILD_WOW64SYMDIR`: UInt = 3u;
public const val `EXTDLL_DATA_QUERY_BUILD_WOW64SYMDIR_SYMSRV`: UInt = 13u;
// UNSUPPORTED Rust 2510:1: generic scalar type unsupported
// pub type EXTDLL_ITERATERTLBALANCEDNODES = Option<unsafe extern "system" fn(rootnode: u64, entryoffset: u32, callback: ENTRY_CALLBACK, callbackcontext: *mut core::ffi::c_void)>;

// UNSUPPORTED Rust 2511:1: generic scalar type unsupported
// pub type EXTDLL_QUERYDATABYTAG = Option<unsafe extern "system" fn(client: *mut core::ffi::c_void, dwdatatag: u32, pqueryinfo: *const core::ffi::c_void, pdata: *mut u8, cbdata: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 2512:1: generic scalar type unsupported
// pub type EXTDLL_QUERYDATABYTAGEX = Option<unsafe extern "system" fn(client: *mut core::ffi::c_void, dwdatatag: u32, pqueryinfo: *const core::ffi::c_void, pdata: *mut u8, cbdata: u32, pdataex: *mut u8, cbdataex: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 2513:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EXTSTACKTRACE {
//     pub FramePointer: u32,
//     pub ProgramCounter: u32,
//     pub ReturnAddress: u32,
//     pub Args: [u32; 4],
// }

// UNSUPPORTED Rust 2521:1: declaration Impl has no candidate rule
// impl Default for EXTSTACKTRACE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2526:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EXTSTACKTRACE32 {
//     pub FramePointer: u32,
//     pub ProgramCounter: u32,
//     pub ReturnAddress: u32,
//     pub Args: [u32; 4],
// }

// UNSUPPORTED Rust 2534:1: declaration Impl has no candidate rule
// impl Default for EXTSTACKTRACE32 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2539:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EXTSTACKTRACE64 {
//     pub FramePointer: u64,
//     pub ProgramCounter: u64,
//     pub ReturnAddress: u64,
//     pub Args: [u64; 4],
// }

// UNSUPPORTED Rust 2547:1: declaration Impl has no candidate rule
// impl Default for EXTSTACKTRACE64 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2552:1: generic scalar type unsupported
// pub type EXTS_JOB_PROCESS_CALLBACK = Option<unsafe extern "system" fn(job: u64, process: u64, context: *mut core::ffi::c_void) -> bool>;

// UNSUPPORTED Rust 2553:1: generic scalar type unsupported
// pub type EXTS_TABLE_ENTRY_CALLBACK = Option<unsafe extern "system" fn(entry: u64, context: *mut core::ffi::c_void) -> bool>;

// UNSUPPORTED Rust 2554:1: generic scalar type unsupported
// pub type EXT_ANALYSIS_PLUGIN = Option<unsafe extern "system" fn(client: *mut core::ffi::c_void, callphase: FA_EXTENSION_PLUGIN_PHASE, panalysis: *mut core::ffi::c_void) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 2555:1: generic scalar type unsupported
// pub type EXT_ANALYZER = Option<unsafe extern "system" fn(client: *mut core::ffi::c_void, bucketsuffix: windows_sys::core::PSTR, cbbucketsuffix: u32, debugtext: windows_sys::core::PSTR, cbdebugtext: u32, flags: *const u32, panalysis: *mut core::ffi::c_void) -> windows_sys::core::HRESULT>;

public const val `EXT_ANALYZER_FLAG_ID`: UInt = 2u;
public const val `EXT_ANALYZER_FLAG_MOD`: UInt = 1u;
// UNSUPPORTED Rust 2558:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EXT_API_VERSION {
//     pub MajorVersion: u16,
//     pub MinorVersion: u16,
//     pub Revision: u16,
//     pub Reserved: u16,
// }

public const val `EXT_API_VERSION_NUMBER`: UInt = 5u;
public const val `EXT_API_VERSION_NUMBER32`: UInt = 5u;
public const val `EXT_API_VERSION_NUMBER64`: UInt = 6u;
// UNSUPPORTED Rust 2569:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EXT_CAB_XML_DATA {
//     pub SizeOfStruct: u32,
//     pub XmlObjectTag: windows_sys::core::PCWSTR,
//     pub NumSubTags: u32,
//     pub SubTags: [EXT_CAB_XML_DATA_0; 1],
// }

// UNSUPPORTED Rust 2577:1: declaration Impl has no candidate rule
// impl Default for EXT_CAB_XML_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2582:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EXT_CAB_XML_DATA_0 {
//     pub SubTag: windows_sys::core::PCWSTR,
//     pub MatchPattern: windows_sys::core::PCWSTR,
//     pub ReturnText: windows_sys::core::PWSTR,
//     pub ReturnTextSize: u32,
//     pub _bitfield: u32,
//     pub Reserved2: u32,
// }

// UNSUPPORTED Rust 2592:1: declaration Impl has no candidate rule
// impl Default for EXT_CAB_XML_DATA_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2597:1: generic scalar type unsupported
// pub type EXT_DECODE_ERROR = Option<unsafe extern "system" fn(pdecodeerror: *mut DEBUG_DECODE_ERROR)>;

// UNSUPPORTED Rust 2598:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EXT_FIND_FILE {
//     pub FileName: windows_sys::core::PCWSTR,
//     pub IndexedSize: u64,
//     pub ImageTimeDateStamp: u32,
//     pub ImageCheckSum: u32,
//     pub ExtraInfo: *mut core::ffi::c_void,
//     pub ExtraInfoSize: u32,
//     pub Flags: u32,
//     pub FileMapping: *mut core::ffi::c_void,
//     pub FileMappingSize: u64,
//     pub FileHandle: super::super::super::super::Foundation::HANDLE,
//     pub FoundFileName: windows_sys::core::PWSTR,
//     pub FoundFileNameChars: u32,
// }

// UNSUPPORTED Rust 2614:1: declaration Impl has no candidate rule
// impl Default for EXT_FIND_FILE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `EXT_FIND_FILE_ALLOW_GIVEN_PATH`: UInt = 1u;
// UNSUPPORTED Rust 2620:1: generic scalar type unsupported
// pub type EXT_GET_DEBUG_FAILURE_ANALYSIS = Option<unsafe extern "system" fn(client: *mut core::ffi::c_void, flags: u32, classid: windows_sys::core::GUID, ppanalysis: *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 2621:1: generic scalar type unsupported
// pub type EXT_GET_ENVIRONMENT_VARIABLE = Option<unsafe extern "system" fn(peb: u64, variable: windows_sys::core::PCSTR, buffer: windows_sys::core::PCSTR, buffersize: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 2622:1: generic scalar type unsupported
// pub type EXT_GET_FAILURE_ANALYSIS = Option<unsafe extern "system" fn(client: *mut core::ffi::c_void, flags: u32, ppanalysis: *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 2623:1: generic scalar type unsupported
// pub type EXT_GET_FA_ENTRIES_DATA = Option<unsafe extern "system" fn(client: *mut core::ffi::c_void, count: *mut u32, entries: *mut *mut FA_ENTRY) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 2624:1: generic scalar type unsupported
// pub type EXT_GET_HANDLE_TRACE = Option<unsafe extern "system" fn(client: *mut core::ffi::c_void, tracetype: u32, startindex: u32, handlevalue: *mut u64, stackfunctions: *mut u64, stacktracesize: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 2625:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EXT_MATCH_PATTERN_A {
//     pub Str: windows_sys::core::PCSTR,
//     pub Pattern: windows_sys::core::PCSTR,
//     pub CaseSensitive: u32,
// }

// UNSUPPORTED Rust 2632:1: declaration Impl has no candidate rule
// impl Default for EXT_MATCH_PATTERN_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2637:1: generic scalar type unsupported
// pub type EXT_RELOAD_TRIAGER = Option<unsafe extern "system" fn(client: *mut core::ffi::c_void) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 2638:1: generic scalar type unsupported
// pub type EXT_TARGET_INFO = Option<unsafe extern "system" fn(client: *mut core::ffi::c_void, ptargetinfo: *mut TARGET_DEBUG_INFO) -> windows_sys::core::HRESULT>;

public const val `EXT_TDF_PHYSICAL_CACHED`: UInt = 4u;
public const val `EXT_TDF_PHYSICAL_DEFAULT`: UInt = 2u;
public const val `EXT_TDF_PHYSICAL_MEMORY`: UInt = 14u;
public const val `EXT_TDF_PHYSICAL_UNCACHED`: UInt = 6u;
public const val `EXT_TDF_PHYSICAL_WRITE_COMBINED`: UInt = 8u;
public typealias `EXT_TDOP` = Int;
public const val `EXT_TDOP_COPY`: `EXT_TDOP` = 0;
public const val `EXT_TDOP_COUNT`: `EXT_TDOP` = 19;
public const val `EXT_TDOP_EVALUATE`: `EXT_TDOP` = 5;
public const val `EXT_TDOP_GET_ARRAY_ELEMENT`: `EXT_TDOP` = 12;
public const val `EXT_TDOP_GET_DEREFERENCE`: `EXT_TDOP` = 13;
public const val `EXT_TDOP_GET_FIELD`: `EXT_TDOP` = 4;
public const val `EXT_TDOP_GET_FIELD_OFFSET`: `EXT_TDOP` = 11;
public const val `EXT_TDOP_GET_POINTER_TO`: `EXT_TDOP` = 16;
public const val `EXT_TDOP_GET_TYPE_NAME`: `EXT_TDOP` = 6;
public const val `EXT_TDOP_GET_TYPE_SIZE`: `EXT_TDOP` = 14;
public const val `EXT_TDOP_HAS_FIELD`: `EXT_TDOP` = 10;
public const val `EXT_TDOP_OUTPUT_FULL_VALUE`: `EXT_TDOP` = 9;
public const val `EXT_TDOP_OUTPUT_SIMPLE_VALUE`: `EXT_TDOP` = 8;
public const val `EXT_TDOP_OUTPUT_TYPE_DEFINITION`: `EXT_TDOP` = 15;
public const val `EXT_TDOP_OUTPUT_TYPE_NAME`: `EXT_TDOP` = 7;
public const val `EXT_TDOP_RELEASE`: `EXT_TDOP` = 1;
public const val `EXT_TDOP_SET_FROM_EXPR`: `EXT_TDOP` = 2;
public const val `EXT_TDOP_SET_FROM_TYPE_ID_AND_U64`: `EXT_TDOP` = 17;
public const val `EXT_TDOP_SET_FROM_U64_EXPR`: `EXT_TDOP` = 3;
public const val `EXT_TDOP_SET_PTR_FROM_TYPE_ID_AND_U64`: `EXT_TDOP` = 18;
// UNSUPPORTED Rust 2665:1: generic scalar type unsupported
// pub type EXT_TRIAGE_FOLLOWUP = Option<unsafe extern "system" fn(client: *mut core::ffi::c_void, symbolname: windows_sys::core::PCSTR, ownerinfo: *mut DEBUG_TRIAGE_FOLLOWUP_INFO) -> u32>;

// UNSUPPORTED Rust 2666:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EXT_TYPED_DATA {
//     pub Operation: EXT_TDOP,
//     pub Flags: u32,
//     pub InData: DEBUG_TYPED_DATA,
//     pub OutData: DEBUG_TYPED_DATA,
//     pub InStrIndex: u32,
//     pub In32: u32,
//     pub Out32: u32,
//     pub In64: u64,
//     pub Out64: u64,
//     pub StrBufferIndex: u32,
//     pub StrBufferChars: u32,
//     pub StrCharsNeeded: u32,
//     pub DataBufferIndex: u32,
//     pub DataBufferBytes: u32,
//     pub DataBytesNeeded: u32,
//     pub Status: windows_sys::core::HRESULT,
//     pub Reserved: [u64; 8],
// }

// UNSUPPORTED Rust 2687:1: declaration Impl has no candidate rule
// impl Default for EXT_TYPED_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2692:1: generic scalar type unsupported
// pub type EXT_XML_DATA = Option<unsafe extern "system" fn(client: *mut core::ffi::c_void, pxmpdata: *mut EXT_CAB_XML_DATA) -> windows_sys::core::HRESULT>;

public typealias `ErrorClass` = Int;
public const val `ErrorClassError`: `ErrorClass` = 1;
public const val `ErrorClassWarning`: `ErrorClass` = 0;
public const val `FAILURE_ANALYSIS_ASSUME_HANG`: UInt = 4u;
public const val `FAILURE_ANALYSIS_AUTOBUG_PROCESSING`: UInt = 64u;
public const val `FAILURE_ANALYSIS_AUTOSET_SYMPATH`: UInt = 16384u;
public const val `FAILURE_ANALYSIS_CALLSTACK_XML`: UInt = 256u;
public const val `FAILURE_ANALYSIS_CALLSTACK_XML_FULL_SOURCE_INFO`: UInt = 16777216u;
public const val `FAILURE_ANALYSIS_CREATE_INSTANCE`: UInt = 1048576u;
public const val `FAILURE_ANALYSIS_EXCEPTION_AS_HANG`: UInt = 32u;
public const val `FAILURE_ANALYSIS_HEAP_CORRUPTION_BLAME_FUNCTION`: UInt = 33554432u;
public const val `FAILURE_ANALYSIS_IGNORE_BREAKIN`: UInt = 8u;
public const val `FAILURE_ANALYSIS_LIVE_DEBUG_HOLD_CHECK`: UInt = 2097152u;
public const val `FAILURE_ANALYSIS_MODULE_INFO_XML`: UInt = 4096u;
public const val `FAILURE_ANALYSIS_MULTI_TARGET`: UInt = 131072u;
public const val `FAILURE_ANALYSIS_NO_DB_LOOKUP`: UInt = 1u;
public const val `FAILURE_ANALYSIS_NO_IMAGE_CORRUPTION`: UInt = 8192u;
public const val `FAILURE_ANALYSIS_PERMIT_HEAP_ACCESS_VIOLATIONS`: UInt = 67108864u;
public const val `FAILURE_ANALYSIS_REGISTRY_DATA`: UInt = 512u;
public const val `FAILURE_ANALYSIS_SET_FAILURE_CONTEXT`: UInt = 16u;
public const val `FAILURE_ANALYSIS_SHOW_SOURCE`: UInt = 262144u;
public const val `FAILURE_ANALYSIS_SHOW_WCT_STACKS`: UInt = 524288u;
public const val `FAILURE_ANALYSIS_USER_ATTRIBUTES`: UInt = 2048u;
public const val `FAILURE_ANALYSIS_USER_ATTRIBUTES_ALL`: UInt = 32768u;
public const val `FAILURE_ANALYSIS_USER_ATTRIBUTES_FRAMES`: UInt = 65536u;
public const val `FAILURE_ANALYSIS_VERBOSE`: UInt = 2u;
public const val `FAILURE_ANALYSIS_WMI_QUERY_DATA`: UInt = 1024u;
public const val `FAILURE_ANALYSIS_XML_FILE_OUTPUT`: UInt = 4194304u;
public const val `FAILURE_ANALYSIS_XML_OUTPUT`: UInt = 128u;
public const val `FAILURE_ANALYSIS_XSD_VERIFY`: UInt = 8388608u;
public const val `FAILURE_ANALYSIS_XSLT_FILE_INPUT`: UInt = 268435456u;
public const val `FAILURE_ANALYSIS_XSLT_FILE_OUTPUT`: UInt = 536870912u;
// UNSUPPORTED Rust 2725:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FA_ENTRY {
//     pub Tag: DEBUG_FLR_PARAM_TYPE,
//     pub FullSize: u16,
//     pub DataSize: u16,
// }

public typealias `FA_ENTRY_TYPE` = Int;
public typealias `FA_EXTENSION_PLUGIN_PHASE` = Int;
public const val `FA_PLUGIN_INITIALIZATION`: `FA_EXTENSION_PLUGIN_PHASE` = 1;
public const val `FA_PLUGIN_POST_BUCKETING`: `FA_EXTENSION_PLUGIN_PHASE` = 8;
public const val `FA_PLUGIN_PRE_BUCKETING`: `FA_EXTENSION_PLUGIN_PHASE` = 4;
public const val `FA_PLUGIN_STACK_ANALYSIS`: `FA_EXTENSION_PLUGIN_PHASE` = 2;
public const val `FIELDS_DID_NOT_MATCH`: UInt = 4u;
// UNSUPPORTED Rust 2739:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FIELD_INFO {
//     pub fName: *mut u8,
//     pub printName: *mut u8,
//     pub size: u32,
//     pub fOptions: u32,
//     pub address: u64,
//     pub Anonymous: FIELD_INFO_0,
//     pub TypeId: u32,
//     pub FieldOffset: u32,
//     pub BufferSize: u32,
//     pub BitField: FIELD_INFO_1,
//     pub _bitfield: u32,
// }

// UNSUPPORTED Rust 2754:1: declaration Impl has no candidate rule
// impl Default for FIELD_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2759:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union FIELD_INFO_0 {
//     pub fieldCallBack: *mut core::ffi::c_void,
//     pub pBuffer: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 2765:1: declaration Impl has no candidate rule
// impl Default for FIELD_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2770:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FIELD_INFO_1 {
//     pub Position: u16,
//     pub Size: u16,
// }

public const val `FormatBSTRString`: `PreferredFormat` = 8;
public const val `FormatEnumNameOnly`: `PreferredFormat` = 12;
public const val `FormatEscapedStringWithQuote`: `PreferredFormat` = 13;
public const val `FormatHString`: `PreferredFormat` = 10;
public const val `FormatNone`: `PreferredFormat` = 0;
public const val `FormatQuotedHString`: `PreferredFormat` = 9;
public const val `FormatQuotedString`: `PreferredFormat` = 2;
public const val `FormatQuotedUTF32String`: `PreferredFormat` = 15;
public const val `FormatQuotedUTF8String`: `PreferredFormat` = 6;
public const val `FormatQuotedUnicodeString`: `PreferredFormat` = 4;
public const val `FormatRaw`: `PreferredFormat` = 11;
public const val `FormatSingleCharacter`: `PreferredFormat` = 1;
public const val `FormatString`: `PreferredFormat` = 3;
public const val `FormatUTF32String`: `PreferredFormat` = 14;
public const val `FormatUTF8String`: `PreferredFormat` = 7;
public const val `FormatUnicodeString`: `PreferredFormat` = 5;
// UNSUPPORTED Rust 2792:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct GET_CONTEXT_EX {
//     pub Status: u32,
//     pub ContextSize: u32,
//     pub pContext: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 2799:1: declaration Impl has no candidate rule
// impl Default for GET_CONTEXT_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2804:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct GET_CURRENT_PROCESS_ADDRESS {
//     pub Processor: u32,
//     pub CurrentThread: u64,
//     pub Address: u64,
// }

// UNSUPPORTED Rust 2811:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct GET_CURRENT_THREAD_ADDRESS {
//     pub Processor: u32,
//     pub Address: u64,
// }

// UNSUPPORTED Rust 2817:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct GET_EXPRESSION_EX {
//     pub Expression: windows_sys::core::PCSTR,
//     pub Remainder: windows_sys::core::PCSTR,
//     pub Value: u64,
// }

// UNSUPPORTED Rust 2824:1: declaration Impl has no candidate rule
// impl Default for GET_EXPRESSION_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2829:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct GET_INPUT_LINE {
//     pub Prompt: windows_sys::core::PCSTR,
//     pub Buffer: windows_sys::core::PSTR,
//     pub BufferSize: u32,
//     pub InputSize: u32,
// }

// UNSUPPORTED Rust 2837:1: declaration Impl has no candidate rule
// impl Default for GET_INPUT_LINE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2842:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct GET_PEB_ADDRESS {
//     pub CurrentThread: u64,
//     pub Address: u64,
// }

// UNSUPPORTED Rust 2848:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct GET_SET_SYMPATH {
//     pub Args: windows_sys::core::PCSTR,
//     pub Result: windows_sys::core::PSTR,
//     pub Length: i32,
// }

// UNSUPPORTED Rust 2855:1: declaration Impl has no candidate rule
// impl Default for GET_SET_SYMPATH {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2860:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct GET_TEB_ADDRESS {
//     pub Address: u64,
// }

public const val `IG_DISASSEMBLE_BUFFER`: UInt = 44u;
public const val `IG_DUMP_SYMBOL_INFO`: UInt = 22u;
public const val `IG_FIND_FILE`: UInt = 40u;
public const val `IG_GET_ANY_MODULE_IN_RANGE`: UInt = 45u;
public const val `IG_GET_BUS_DATA`: UInt = 20u;
public const val `IG_GET_CACHE_SIZE`: UInt = 32u;
public const val `IG_GET_CLR_DATA_INTERFACE`: UInt = 38u;
public const val `IG_GET_CONTEXT_EX`: UInt = 48u;
public const val `IG_GET_CURRENT_PROCESS`: UInt = 26u;
public const val `IG_GET_CURRENT_PROCESS_HANDLE`: UInt = 28u;
public const val `IG_GET_CURRENT_THREAD`: UInt = 25u;
public const val `IG_GET_DEBUGGER_DATA`: UInt = 14u;
public const val `IG_GET_EXCEPTION_RECORD`: UInt = 18u;
public const val `IG_GET_EXPRESSION_EX`: UInt = 30u;
public const val `IG_GET_INPUT_LINE`: UInt = 29u;
public const val `IG_GET_KERNEL_VERSION`: UInt = 15u;
public const val `IG_GET_PEB_ADDRESS`: UInt = 129u;
public const val `IG_GET_SET_SYMPATH`: UInt = 17u;
public const val `IG_GET_TEB_ADDRESS`: UInt = 128u;
public const val `IG_GET_THREAD_OS_INFO`: UInt = 37u;
public const val `IG_GET_TYPE_SIZE`: UInt = 27u;
public const val `IG_IS_PTR64`: UInt = 19u;
public const val `IG_KD_CONTEXT`: UInt = 1u;
public const val `IG_KSTACK_HELP`: UInt = 10u;
public const val `IG_LOWMEM_CHECK`: UInt = 23u;
public const val `IG_MATCH_PATTERN_A`: UInt = 39u;
public const val `IG_OBSOLETE_PLACEHOLDER_36`: UInt = 36u;
public const val `IG_PHYSICAL_TO_VIRTUAL`: UInt = 47u;
public const val `IG_POINTER_SEARCH_PHYSICAL`: UInt = 35u;
public const val `IG_QUERY_TARGET_INTERFACE`: UInt = 42u;
public const val `IG_READ_CONTROL_SPACE`: UInt = 2u;
public const val `IG_READ_IO_SPACE`: UInt = 4u;
public const val `IG_READ_IO_SPACE_EX`: UInt = 8u;
public const val `IG_READ_MSR`: UInt = 12u;
public const val `IG_READ_PHYSICAL`: UInt = 6u;
public const val `IG_READ_PHYSICAL_WITH_FLAGS`: UInt = 33u;
public const val `IG_RELOAD_SYMBOLS`: UInt = 16u;
public const val `IG_SEARCH_MEMORY`: UInt = 24u;
public const val `IG_SET_BUS_DATA`: UInt = 21u;
public const val `IG_SET_THREAD`: UInt = 11u;
public const val `IG_TRANSLATE_VIRTUAL_TO_PHYSICAL`: UInt = 31u;
public const val `IG_TYPED_DATA`: UInt = 43u;
public const val `IG_TYPED_DATA_OBSOLETE`: UInt = 41u;
public const val `IG_VIRTUAL_TO_PHYSICAL`: UInt = 46u;
public const val `IG_WRITE_CONTROL_SPACE`: UInt = 3u;
public const val `IG_WRITE_IO_SPACE`: UInt = 5u;
public const val `IG_WRITE_IO_SPACE_EX`: UInt = 9u;
public const val `IG_WRITE_MSR`: UInt = 13u;
public const val `IG_WRITE_PHYSICAL`: UInt = 7u;
public const val `IG_WRITE_PHYSICAL_WITH_FLAGS`: UInt = 34u;
public const val `INCORRECT_VERSION_INFO`: UInt = 7u;
// UNSUPPORTED Rust 2916:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union INLINE_FRAME_CONTEXT {
//     pub ContextValue: u32,
//     pub Anonymous: INLINE_FRAME_CONTEXT_0,
// }

// UNSUPPORTED Rust 2922:1: declaration Impl has no candidate rule
// impl Default for INLINE_FRAME_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2927:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct INLINE_FRAME_CONTEXT_0 {
//     pub FrameId: u8,
//     pub FrameType: u8,
//     pub FrameSignature: u16,
// }

public const val `INSUFFICIENT_SPACE_TO_COPY`: UInt = 10u;
// UNSUPPORTED Rust 2935:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IOSPACE {
//     pub Address: u32,
//     pub Length: u32,
//     pub Data: u32,
// }

// UNSUPPORTED Rust 2942:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IOSPACE32 {
//     pub Address: u32,
//     pub Length: u32,
//     pub Data: u32,
// }

// UNSUPPORTED Rust 2949:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IOSPACE64 {
//     pub Address: u64,
//     pub Length: u32,
//     pub Data: u32,
// }

// UNSUPPORTED Rust 2956:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IOSPACE_EX {
//     pub Address: u32,
//     pub Length: u32,
//     pub Data: u32,
//     pub InterfaceType: u32,
//     pub BusNumber: u32,
//     pub AddressSpace: u32,
// }

// UNSUPPORTED Rust 2966:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IOSPACE_EX32 {
//     pub Address: u32,
//     pub Length: u32,
//     pub Data: u32,
//     pub InterfaceType: u32,
//     pub BusNumber: u32,
//     pub AddressSpace: u32,
// }

// UNSUPPORTED Rust 2976:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IOSPACE_EX64 {
//     pub Address: u64,
//     pub Length: u32,
//     pub Data: u32,
//     pub InterfaceType: u32,
//     pub BusNumber: u32,
//     pub AddressSpace: u32,
// }

public const val `Identical`: `SignatureComparison` = 4;
public const val `IntrinsicBool`: `IntrinsicKind` = 1;
public const val `IntrinsicChar`: `IntrinsicKind` = 2;
public const val `IntrinsicChar16`: `IntrinsicKind` = 10;
public const val `IntrinsicChar32`: `IntrinsicKind` = 11;
public const val `IntrinsicFloat`: `IntrinsicKind` = 8;
public const val `IntrinsicHRESULT`: `IntrinsicKind` = 9;
public const val `IntrinsicInt`: `IntrinsicKind` = 4;
public typealias `IntrinsicKind` = Int;
public const val `IntrinsicLong`: `IntrinsicKind` = 6;
public const val `IntrinsicUInt`: `IntrinsicKind` = 5;
public const val `IntrinsicULong`: `IntrinsicKind` = 7;
public const val `IntrinsicVoid`: `IntrinsicKind` = 0;
public const val `IntrinsicWChar`: `IntrinsicKind` = 3;
// UNSUPPORTED Rust 3000:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Kernel")]
// #[derive(Clone, Copy, Default)]
// pub struct KDDEBUGGER_DATA32 {
//     pub Header: DBGKD_DEBUG_DATA_HEADER32,
//     pub KernBase: u32,
//     pub BreakpointWithStatus: u32,
//     pub SavedContext: u32,
//     pub ThCallbackStack: u16,
//     pub NextCallback: u16,
//     pub FramePointer: u16,
//     pub _bitfield: u16,
//     pub KiCallUserMode: u32,
//     pub KeUserCallbackDispatcher: u32,
//     pub PsLoadedModuleList: u32,
//     pub PsActiveProcessHead: u32,
//     pub PspCidTable: u32,
//     pub ExpSystemResourcesList: u32,
//     pub ExpPagedPoolDescriptor: u32,
//     pub ExpNumberOfPagedPools: u32,
//     pub KeTimeIncrement: u32,
//     pub KeBugCheckCallbackListHead: u32,
//     pub KiBugcheckData: u32,
//     pub IopErrorLogListHead: u32,
//     pub ObpRootDirectoryObject: u32,
//     pub ObpTypeObjectType: u32,
//     pub MmSystemCacheStart: u32,
//     pub MmSystemCacheEnd: u32,
//     pub MmSystemCacheWs: u32,
//     pub MmPfnDatabase: u32,
//     pub MmSystemPtesStart: u32,
//     pub MmSystemPtesEnd: u32,
//     pub MmSubsectionBase: u32,
//     pub MmNumberOfPagingFiles: u32,
//     pub MmLowestPhysicalPage: u32,
//     pub MmHighestPhysicalPage: u32,
//     pub MmNumberOfPhysicalPages: u32,
//     pub MmMaximumNonPagedPoolInBytes: u32,
//     pub MmNonPagedSystemStart: u32,
//     pub MmNonPagedPoolStart: u32,
//     pub MmNonPagedPoolEnd: u32,
//     pub MmPagedPoolStart: u32,
//     pub MmPagedPoolEnd: u32,
//     pub MmPagedPoolInformation: u32,
//     pub MmPageSize: u32,
//     pub MmSizeOfPagedPoolInBytes: u32,
//     pub MmTotalCommitLimit: u32,
//     pub MmTotalCommittedPages: u32,
//     pub MmSharedCommit: u32,
//     pub MmDriverCommit: u32,
//     pub MmProcessCommit: u32,
//     pub MmPagedPoolCommit: u32,
//     pub MmExtendedCommit: u32,
//     pub MmZeroedPageListHead: u32,
//     pub MmFreePageListHead: u32,
//     pub MmStandbyPageListHead: u32,
//     pub MmModifiedPageListHead: u32,
//     pub MmModifiedNoWritePageListHead: u32,
//     pub MmAvailablePages: u32,
//     pub MmResidentAvailablePages: u32,
//     pub PoolTrackTable: u32,
//     pub NonPagedPoolDescriptor: u32,
//     pub MmHighestUserAddress: u32,
//     pub MmSystemRangeStart: u32,
//     pub MmUserProbeAddress: u32,
//     pub KdPrintCircularBuffer: u32,
//     pub KdPrintCircularBufferEnd: u32,
//     pub KdPrintWritePointer: u32,
//     pub KdPrintRolloverCount: u32,
//     pub MmLoadedUserImageList: u32,
// }

// UNSUPPORTED Rust 3071:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Kernel")]
// #[derive(Clone, Copy, Default)]
// pub struct KDDEBUGGER_DATA64 {
//     pub Header: DBGKD_DEBUG_DATA_HEADER64,
//     pub KernBase: u64,
//     pub BreakpointWithStatus: u64,
//     pub SavedContext: u64,
//     pub ThCallbackStack: u16,
//     pub NextCallback: u16,
//     pub FramePointer: u16,
//     pub _bitfield: u16,
//     pub KiCallUserMode: u64,
//     pub KeUserCallbackDispatcher: u64,
//     pub PsLoadedModuleList: u64,
//     pub PsActiveProcessHead: u64,
//     pub PspCidTable: u64,
//     pub ExpSystemResourcesList: u64,
//     pub ExpPagedPoolDescriptor: u64,
//     pub ExpNumberOfPagedPools: u64,
//     pub KeTimeIncrement: u64,
//     pub KeBugCheckCallbackListHead: u64,
//     pub KiBugcheckData: u64,
//     pub IopErrorLogListHead: u64,
//     pub ObpRootDirectoryObject: u64,
//     pub ObpTypeObjectType: u64,
//     pub MmSystemCacheStart: u64,
//     pub MmSystemCacheEnd: u64,
//     pub MmSystemCacheWs: u64,
//     pub MmPfnDatabase: u64,
//     pub MmSystemPtesStart: u64,
//     pub MmSystemPtesEnd: u64,
//     pub MmSubsectionBase: u64,
//     pub MmNumberOfPagingFiles: u64,
//     pub MmLowestPhysicalPage: u64,
//     pub MmHighestPhysicalPage: u64,
//     pub MmNumberOfPhysicalPages: u64,
//     pub MmMaximumNonPagedPoolInBytes: u64,
//     pub MmNonPagedSystemStart: u64,
//     pub MmNonPagedPoolStart: u64,
//     pub MmNonPagedPoolEnd: u64,
//     pub MmPagedPoolStart: u64,
//     pub MmPagedPoolEnd: u64,
//     pub MmPagedPoolInformation: u64,
//     pub MmPageSize: u64,
//     pub MmSizeOfPagedPoolInBytes: u64,
//     pub MmTotalCommitLimit: u64,
//     pub MmTotalCommittedPages: u64,
//     pub MmSharedCommit: u64,
//     pub MmDriverCommit: u64,
//     pub MmProcessCommit: u64,
//     pub MmPagedPoolCommit: u64,
//     pub MmExtendedCommit: u64,
//     pub MmZeroedPageListHead: u64,
//     pub MmFreePageListHead: u64,
//     pub MmStandbyPageListHead: u64,
//     pub MmModifiedPageListHead: u64,
//     pub MmModifiedNoWritePageListHead: u64,
//     pub MmAvailablePages: u64,
//     pub MmResidentAvailablePages: u64,
//     pub PoolTrackTable: u64,
//     pub NonPagedPoolDescriptor: u64,
//     pub MmHighestUserAddress: u64,
//     pub MmSystemRangeStart: u64,
//     pub MmUserProbeAddress: u64,
//     pub KdPrintCircularBuffer: u64,
//     pub KdPrintCircularBufferEnd: u64,
//     pub KdPrintWritePointer: u64,
//     pub KdPrintRolloverCount: u64,
//     pub MmLoadedUserImageList: u64,
//     pub NtBuildLab: u64,
//     pub KiNormalSystemCall: u64,
//     pub KiProcessorBlock: u64,
//     pub MmUnloadedDrivers: u64,
//     pub MmLastUnloadedDriver: u64,
//     pub MmTriageActionTaken: u64,
//     pub MmSpecialPoolTag: u64,
//     pub KernelVerifier: u64,
//     pub MmVerifierData: u64,
//     pub MmAllocatedNonPagedPool: u64,
//     pub MmPeakCommitment: u64,
//     pub MmTotalCommitLimitMaximum: u64,
//     pub CmNtCSDVersion: u64,
//     pub MmPhysicalMemoryBlock: u64,
//     pub MmSessionBase: u64,
//     pub MmSessionSize: u64,
//     pub MmSystemParentTablePage: u64,
//     pub MmVirtualTranslationBase: u64,
//     pub OffsetKThreadNextProcessor: u16,
//     pub OffsetKThreadTeb: u16,
//     pub OffsetKThreadKernelStack: u16,
//     pub OffsetKThreadInitialStack: u16,
//     pub OffsetKThreadApcProcess: u16,
//     pub OffsetKThreadState: u16,
//     pub OffsetKThreadBStore: u16,
//     pub OffsetKThreadBStoreLimit: u16,
//     pub SizeEProcess: u16,
//     pub OffsetEprocessPeb: u16,
//     pub OffsetEprocessParentCID: u16,
//     pub OffsetEprocessDirectoryTableBase: u16,
//     pub SizePrcb: u16,
//     pub OffsetPrcbDpcRoutine: u16,
//     pub OffsetPrcbCurrentThread: u16,
//     pub OffsetPrcbMhz: u16,
//     pub OffsetPrcbCpuType: u16,
//     pub OffsetPrcbVendorString: u16,
//     pub OffsetPrcbProcStateContext: u16,
//     pub OffsetPrcbNumber: u16,
//     pub SizeEThread: u16,
//     pub L1tfHighPhysicalBitIndex: u8,
//     pub L1tfSwizzleBitIndex: u8,
//     pub Padding0: u32,
//     pub KdPrintCircularBufferPtr: u64,
//     pub KdPrintBufferSize: u64,
//     pub KeLoaderBlock: u64,
//     pub SizePcr: u16,
//     pub OffsetPcrSelfPcr: u16,
//     pub OffsetPcrCurrentPrcb: u16,
//     pub OffsetPcrContainedPrcb: u16,
//     pub OffsetPcrInitialBStore: u16,
//     pub OffsetPcrBStoreLimit: u16,
//     pub OffsetPcrInitialStack: u16,
//     pub OffsetPcrStackLimit: u16,
//     pub OffsetPrcbPcrPage: u16,
//     pub OffsetPrcbProcStateSpecialReg: u16,
//     pub GdtR0Code: u16,
//     pub GdtR0Data: u16,
//     pub GdtR0Pcr: u16,
//     pub GdtR3Code: u16,
//     pub GdtR3Data: u16,
//     pub GdtR3Teb: u16,
//     pub GdtLdt: u16,
//     pub GdtTss: u16,
//     pub Gdt64R3CmCode: u16,
//     pub Gdt64R3CmTeb: u16,
//     pub IopNumTriageDumpDataBlocks: u64,
//     pub IopTriageDumpDataBlocks: u64,
//     pub VfCrashDataBlock: u64,
//     pub MmBadPagesDetected: u64,
//     pub MmZeroedPageSingleBitErrorsDetected: u64,
//     pub EtwpDebuggerData: u64,
//     pub OffsetPrcbContext: u16,
//     pub OffsetPrcbMaxBreakpoints: u16,
//     pub OffsetPrcbMaxWatchpoints: u16,
//     pub OffsetKThreadStackLimit: u32,
//     pub OffsetKThreadStackBase: u32,
//     pub OffsetKThreadQueueListEntry: u32,
//     pub OffsetEThreadIrpList: u32,
//     pub OffsetPrcbIdleThread: u16,
//     pub OffsetPrcbNormalDpcState: u16,
//     pub OffsetPrcbDpcStack: u16,
//     pub OffsetPrcbIsrStack: u16,
//     pub SizeKDPC_STACK_FRAME: u16,
//     pub OffsetKPriQueueThreadListHead: u16,
//     pub OffsetKThreadWaitReason: u16,
//     pub Padding1: u16,
//     pub PteBase: u64,
//     pub RetpolineStubFunctionTable: u64,
//     pub RetpolineStubFunctionTableSize: u32,
//     pub RetpolineStubOffset: u32,
//     pub RetpolineStubSize: u32,
//     pub OffsetEProcessMmHotPatchContext: u16,
//     pub OffsetKThreadShadowStackLimit: u32,
//     pub OffsetKThreadShadowStackBase: u32,
//     pub ShadowStackEnabled: u64,
//     pub PointerAuthMask: u64,
//     pub OffsetPrcbExceptionStack: u16,
// }

// UNSUPPORTED Rust 3239:1: generic scalar type unsupported
// pub type KDEXTS_LOCK_CALLBACKROUTINE = Option<unsafe extern "system" fn(plock: *mut KDEXTS_LOCK_INFO, context: *mut core::ffi::c_void) -> windows_sys::core::HRESULT>;

public const val `KDEXTS_LOCK_CALLBACKROUTINE_DEFINED`: UInt = 2u;
// UNSUPPORTED Rust 3241:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct KDEXTS_LOCK_INFO {
//     pub SizeOfStruct: u32,
//     pub Address: u64,
//     pub OwningThread: u64,
//     pub ExclusiveOwned: windows_sys::core::BOOL,
//     pub NumOwners: u32,
//     pub ContentionCount: u32,
//     pub NumExclusiveWaiters: u32,
//     pub NumSharedWaiters: u32,
//     pub pOwnerThreads: *mut u64,
//     pub pWaiterThreads: *mut u64,
// }

// UNSUPPORTED Rust 3255:1: declaration Impl has no candidate rule
// impl Default for KDEXTS_LOCK_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3260:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct KDEXTS_PTE_INFO {
//     pub SizeOfStruct: u32,
//     pub VirtualAddress: u64,
//     pub PpeAddress: u64,
//     pub PdeAddress: u64,
//     pub PteAddress: u64,
//     pub Pfn: u64,
//     pub Levels: u64,
//     pub _bitfield1: u32,
//     pub _bitfield2: u32,
// }

// UNSUPPORTED Rust 3273:1: generic scalar type unsupported
// pub type KDEXT_DUMP_HANDLE_CALLBACK = Option<unsafe extern "system" fn(handleinfo: *const KDEXT_HANDLE_INFORMATION, flags: u32, context: *mut core::ffi::c_void) -> bool>;

// UNSUPPORTED Rust 3274:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct KDEXT_FILELOCK_OWNER {
//     pub Sizeofstruct: u32,
//     pub FileObject: u64,
//     pub OwnerThread: u64,
//     pub WaitIrp: u64,
//     pub DeviceObject: u64,
//     pub BlockingDirver: [i8; 32],
// }

// UNSUPPORTED Rust 3284:1: declaration Impl has no candidate rule
// impl Default for KDEXT_FILELOCK_OWNER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3289:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct KDEXT_HANDLE_INFORMATION {
//     pub HandleTableEntry: u64,
//     pub Handle: u64,
//     pub Object: u64,
//     pub ObjectBody: u64,
//     pub GrantedAccess: u64,
//     pub HandleAttributes: u32,
//     pub PagedOut: bool,
// }

// UNSUPPORTED Rust 3300:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct KDEXT_PROCESS_FIND_PARAMS {
//     pub SizeofStruct: u32,
//     pub Pid: u32,
//     pub Session: u32,
//     pub ImageName: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 3308:1: declaration Impl has no candidate rule
// impl Default for KDEXT_PROCESS_FIND_PARAMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3313:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct KDEXT_THREAD_FIND_PARAMS {
//     pub SizeofStruct: u32,
//     pub StackPointer: u64,
//     pub Cid: u32,
//     pub Thread: u64,
// }

public const val `KD_SECONDARY_VERSION_AMD64_CONTEXT`: UInt = 2u;
public const val `KD_SECONDARY_VERSION_AMD64_OBSOLETE_CONTEXT_1`: UInt = 0u;
public const val `KD_SECONDARY_VERSION_AMD64_OBSOLETE_CONTEXT_2`: UInt = 1u;
public const val `KD_SECONDARY_VERSION_DEFAULT`: UInt = 0u;
public const val `LanguageAssembly`: `LanguageKind` = 3;
public const val `LanguageC`: `LanguageKind` = 1;
public const val `LanguageCPP`: `LanguageKind` = 2;
public typealias `LanguageKind` = Int;
public const val `LanguageUnknown`: `LanguageKind` = 0;
public const val `LessSpecific`: `SignatureComparison` = 2;
// UNSUPPORTED Rust 3331:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct Location {
//     pub HostDefined: u64,
//     pub Offset: u64,
// }

public const val `LocationConstant`: `LocationKind` = 2;
public typealias `LocationKind` = Int;
public const val `LocationMember`: `LocationKind` = 0;
public const val `LocationNone`: `LocationKind` = 3;
public const val `LocationStatic`: `LocationKind` = 1;
public const val `MAX_STACK_IN_BYTES`: UInt = 4096u;
public const val `MEMORY_READ_ERROR`: UInt = 1u;
public const val `MODULE_ORDERS_LOADTIME`: UInt = 268435456u;
public const val `MODULE_ORDERS_MASK`: UInt = 4026531840u;
public const val `MODULE_ORDERS_MODULENAME`: UInt = 536870912u;
public typealias `ModelObjectKind` = Int;
public const val `MoreSpecific`: `SignatureComparison` = 3;
public const val `NO_TYPE`: `TANALYZE_RETURN` = 0;
public const val `NT_STATUS_CODE`: `TANALYZE_RETURN` = 5;
public const val `NULL_FIELD_NAME`: UInt = 6u;
public const val `NULL_SYM_DUMP_PARAM`: UInt = 5u;
// UNSUPPORTED Rust 3353:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct OS_INFO {
//     pub MajorVer: u32,
//     pub MinorVer: u32,
//     pub Build: u32,
//     pub BuildQfe: u32,
//     pub ProductType: u32,
//     pub Suite: u32,
//     pub Revision: u32,
//     pub s: OS_INFO_0,
//     pub SrvPackNumber: u32,
//     pub ServicePackBuild: u32,
//     pub Architecture: u32,
//     pub Lcid: u32,
//     pub Name: [i8; 64],
//     pub FullName: [i8; 256],
//     pub Language: [i8; 30],
//     pub BuildVersion: [i8; 64],
//     pub ServicePackString: [i8; 64],
// }

// UNSUPPORTED Rust 3374:1: declaration Impl has no candidate rule
// impl Default for OS_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3379:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct OS_INFO_0 {
//     pub _bitfield: u32,
// }

// UNSUPPORTED Rust 3384:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct OS_INFO_v1 {
//     pub Type: OS_TYPE,
//     pub Anonymous: OS_INFO_v1_0,
//     pub ProductType: u32,
//     pub Suite: u32,
//     pub s: OS_INFO_v1_1,
//     pub SrvPackNumber: u32,
//     pub Language: [i8; 30],
//     pub OsString: [i8; 64],
//     pub ServicePackString: [i8; 64],
// }

// UNSUPPORTED Rust 3397:1: declaration Impl has no candidate rule
// impl Default for OS_INFO_v1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3402:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union OS_INFO_v1_0 {
//     pub Version: OS_INFO_v1_0_0,
//     pub Ver64: u64,
// }

// UNSUPPORTED Rust 3408:1: declaration Impl has no candidate rule
// impl Default for OS_INFO_v1_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3413:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct OS_INFO_v1_0_0 {
//     pub Major: u32,
//     pub Minor: u32,
// }

// UNSUPPORTED Rust 3419:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct OS_INFO_v1_1 {
//     pub _bitfield: u32,
// }

public typealias `OS_TYPE` = Int;
public const val `ObjectContext`: `ModelObjectKind` = 1;
public const val `ObjectError`: `ModelObjectKind` = 6;
public const val `ObjectIntrinsic`: `ModelObjectKind` = 7;
public const val `ObjectKeyReference`: `ModelObjectKind` = 9;
public const val `ObjectMethod`: `ModelObjectKind` = 8;
public const val `ObjectNoValue`: `ModelObjectKind` = 5;
public const val `ObjectPropertyAccessor`: `ModelObjectKind` = 0;
public const val `ObjectSynthetic`: `ModelObjectKind` = 4;
public const val `ObjectTargetObject`: `ModelObjectKind` = 2;
public const val `ObjectTargetObjectReference`: `ModelObjectKind` = 3;
// UNSUPPORTED Rust 3435:1: generic scalar type unsupported
// pub type PDEBUG_EXTENSION_CALL = Option<unsafe extern "system" fn(client: *mut core::ffi::c_void, args: windows_sys::core::PCSTR) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 3436:1: generic scalar type unsupported
// pub type PDEBUG_EXTENSION_CANUNLOAD = Option<unsafe extern "system" fn() -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 3437:1: generic scalar type unsupported
// pub type PDEBUG_EXTENSION_INITIALIZE = Option<unsafe extern "system" fn(version: *mut u32, flags: *mut u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 3438:1: generic scalar type unsupported
// pub type PDEBUG_EXTENSION_KNOWN_STRUCT = Option<unsafe extern "system" fn(flags: u32, offset: u64, typename: windows_sys::core::PCSTR, buffer: windows_sys::core::PSTR, bufferchars: *mut u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 3439:1: generic scalar type unsupported
// pub type PDEBUG_EXTENSION_KNOWN_STRUCT_EX = Option<unsafe extern "system" fn(client: *mut core::ffi::c_void, flags: u32, offset: u64, typename: windows_sys::core::PCSTR, buffer: windows_sys::core::PSTR, bufferchars: *mut u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 3440:1: generic scalar type unsupported
// pub type PDEBUG_EXTENSION_NOTIFY = Option<unsafe extern "system" fn(notify: u32, argument: u64)>;

// UNSUPPORTED Rust 3441:1: generic scalar type unsupported
// pub type PDEBUG_EXTENSION_PROVIDE_VALUE = Option<unsafe extern "system" fn(client: *mut core::ffi::c_void, flags: u32, name: windows_sys::core::PCWSTR, value: *mut u64, typemodbase: *mut u64, typeid: *mut u32, typeflags: *mut u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 3442:1: generic scalar type unsupported
// pub type PDEBUG_EXTENSION_QUERY_VALUE_NAMES = Option<unsafe extern "system" fn(client: *mut core::ffi::c_void, flags: u32, buffer: windows_sys::core::PWSTR, bufferchars: u32, bufferneeded: *mut u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 3443:1: generic scalar type unsupported
// pub type PDEBUG_EXTENSION_UNINITIALIZE = Option<unsafe extern "system" fn()>;

// UNSUPPORTED Rust 3444:1: generic scalar type unsupported
// pub type PDEBUG_EXTENSION_UNLOAD = Option<unsafe extern "system" fn()>;

// UNSUPPORTED Rust 3445:1: generic scalar type unsupported
// pub type PDEBUG_STACK_PROVIDER_BEGINTHREADSTACKRECONSTRUCTION = Option<unsafe extern "system" fn(streamtype: u32, minidumpstreambuffer: *const core::ffi::c_void, buffersize: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 3446:1: generic scalar type unsupported
// pub type PDEBUG_STACK_PROVIDER_ENDTHREADSTACKRECONSTRUCTION = Option<unsafe extern "system" fn() -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 3447:1: generic scalar type unsupported
// pub type PDEBUG_STACK_PROVIDER_FREESTACKSYMFRAMES = Option<unsafe extern "system" fn(stacksymframes: *const STACK_SYM_FRAME_INFO) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 3448:1: generic scalar type unsupported
// pub type PDEBUG_STACK_PROVIDER_RECONSTRUCTSTACK = Option<unsafe extern "system" fn(systemthreadid: u32, nativeframes: *const DEBUG_STACK_FRAME_EX, countnativeframes: u32, stacksymframes: *mut *mut STACK_SYM_FRAME_INFO, stacksymframesfilled: *mut u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 3449:1: generic scalar type unsupported
// pub type PENUMERATE_HANDLES = Option<unsafe extern "system" fn(client: *mut core::ffi::c_void, process: u64, handletodump: u64, flags: u32, callback: KDEXT_DUMP_HANDLE_CALLBACK, context: *const core::ffi::c_void) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 3450:1: generic scalar type unsupported
// pub type PENUMERATE_HASH_TABLE = Option<unsafe extern "system" fn(client: *mut core::ffi::c_void, hashtable: u64, callback: EXTS_TABLE_ENTRY_CALLBACK, context: *mut core::ffi::c_void) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 3451:1: generic scalar type unsupported
// pub type PENUMERATE_JOB_PROCESSES = Option<unsafe extern "system" fn(client: *mut core::ffi::c_void, job: u64, callback: EXTS_JOB_PROCESS_CALLBACK, context: *const core::ffi::c_void) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 3452:1: generic scalar type unsupported
// pub type PENUMERATE_SYSTEM_LOCKS = Option<unsafe extern "system" fn(client: *mut core::ffi::c_void, flags: u32, callback: KDEXTS_LOCK_CALLBACKROUTINE, context: *mut core::ffi::c_void) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 3453:1: generic scalar type unsupported
// pub type PFIND_FILELOCK_OWNERINFO = Option<unsafe extern "system" fn(client: *mut core::ffi::c_void, pfilelockowner: *mut KDEXT_FILELOCK_OWNER) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 3454:1: generic scalar type unsupported
// pub type PFIND_MATCHING_PROCESS = Option<unsafe extern "system" fn(client: *mut core::ffi::c_void, processinfo: *const KDEXT_PROCESS_FIND_PARAMS, process: *mut u64) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 3455:1: generic scalar type unsupported
// pub type PFIND_MATCHING_THREAD = Option<unsafe extern "system" fn(client: *mut core::ffi::c_void, threadinfo: *mut KDEXT_THREAD_FIND_PARAMS) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 3456:1: generic scalar type unsupported
// pub type PGET_CPU_MICROCODE_VERSION = Option<unsafe extern "system" fn(client: *mut core::ffi::c_void, pcpumicrocodeversion: *mut DEBUG_CPU_MICROCODE_VERSION) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 3457:1: generic scalar type unsupported
// pub type PGET_CPU_PSPEED_INFO = Option<unsafe extern "system" fn(client: *mut core::ffi::c_void, pcpuspeedinfo: *mut DEBUG_CPU_SPEED_INFO) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 3458:1: generic scalar type unsupported
// pub type PGET_DEVICE_OBJECT_INFO = Option<unsafe extern "system" fn(client: *mut core::ffi::c_void, deviceobject: u64, pdevobjinfo: *mut DEBUG_DEVICE_OBJECT_INFO) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 3459:1: generic scalar type unsupported
// pub type PGET_DRIVER_OBJECT_INFO = Option<unsafe extern "system" fn(client: *mut core::ffi::c_void, driverobject: u64, pdrvobjinfo: *mut DEBUG_DRIVER_OBJECT_INFO) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 3460:1: generic scalar type unsupported
// pub type PGET_FULL_IMAGE_NAME = Option<unsafe extern "system" fn(client: *mut core::ffi::c_void, process: u64, fullimagename: *mut windows_sys::core::PSTR) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 3461:1: generic scalar type unsupported
// pub type PGET_IRP_INFO = Option<unsafe extern "system" fn(client: *mut core::ffi::c_void, irp: u64, irpinfo: *mut DEBUG_IRP_INFO) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 3462:1: generic scalar type unsupported
// pub type PGET_PNP_TRIAGE_INFO = Option<unsafe extern "system" fn(client: *mut core::ffi::c_void, ppnptriageinfo: *mut DEBUG_PNP_TRIAGE_INFO) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 3463:1: generic scalar type unsupported
// pub type PGET_POOL_DATA = Option<unsafe extern "system" fn(client: *mut core::ffi::c_void, pool: u64, pooldata: *mut DEBUG_POOL_DATA) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 3464:1: generic scalar type unsupported
// pub type PGET_POOL_REGION = Option<unsafe extern "system" fn(client: *mut core::ffi::c_void, pool: u64, poolregion: *mut DEBUG_POOL_REGION) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 3465:1: generic scalar type unsupported
// pub type PGET_POOL_TAG_DESCRIPTION = Option<unsafe extern "system" fn(pooltag: u32, pdescription: *mut DEBUG_POOLTAG_DESCRIPTION) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 3466:1: generic scalar type unsupported
// pub type PGET_PROCESS_COMMIT = Option<unsafe extern "system" fn(client: *mut core::ffi::c_void, totalcommitcharge: *mut u64, numberofprocesses: *mut u32, commitdata: *mut *mut PROCESS_COMMIT_USAGE) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 3467:1: generic scalar type unsupported
// pub type PGET_SMBIOS_INFO = Option<unsafe extern "system" fn(client: *mut core::ffi::c_void, psmbiosinfo: *mut DEBUG_SMBIOS_INFO) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 3468:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PHYSICAL {
//     pub Address: u64,
//     pub BufLen: u32,
//     pub Buf: [u8; 1],
// }

// UNSUPPORTED Rust 3475:1: declaration Impl has no candidate rule
// impl Default for PHYSICAL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3480:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PHYSICAL_TO_VIRTUAL {
//     pub Status: u32,
//     pub Size: u32,
//     pub PdeAddress: u64,
// }

// UNSUPPORTED Rust 3487:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PHYSICAL_WITH_FLAGS {
//     pub Address: u64,
//     pub BufLen: u32,
//     pub Flags: u32,
//     pub Buf: [u8; 1],
// }

// UNSUPPORTED Rust 3495:1: declaration Impl has no candidate rule
// impl Default for PHYSICAL_WITH_FLAGS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PHYS_FLAG_CACHED`: UInt = 1u;
public const val `PHYS_FLAG_DEFAULT`: UInt = 0u;
public const val `PHYS_FLAG_UNCACHED`: UInt = 2u;
public const val `PHYS_FLAG_WRITE_COMBINED`: UInt = 3u;
// UNSUPPORTED Rust 3504:1: generic scalar type unsupported
// pub type PKDEXTS_GET_PTE_INFO = Option<unsafe extern "system" fn(client: *mut core::ffi::c_void, r#virtual: u64, pteinfo: *mut KDEXTS_PTE_INFO) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 3505:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct POINTER_SEARCH_PHYSICAL {
//     pub Offset: u64,
//     pub Length: u64,
//     pub PointerMin: u64,
//     pub PointerMax: u64,
//     pub Flags: u32,
//     pub MatchOffsets: *mut u64,
//     pub MatchOffsetsSize: u32,
//     pub MatchOffsetsCount: u32,
// }

// UNSUPPORTED Rust 3517:1: declaration Impl has no candidate rule
// impl Default for POINTER_SEARCH_PHYSICAL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3522:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PROCESSORINFO {
//     pub Processor: u16,
//     pub NumberProcessors: u16,
// }

// UNSUPPORTED Rust 3528:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PROCESS_COMMIT_USAGE {
//     pub ImageFileName: [u8; 16],
//     pub ClientId: u64,
//     pub ProcessAddress: u64,
//     pub CommitCharge: u64,
//     pub SharedCommitCharge: u64,
//     pub ReleasedCommitDebt: u64,
//     pub Reserved: u64,
// }

// UNSUPPORTED Rust 3539:1: declaration Impl has no candidate rule
// impl Default for PROCESS_COMMIT_USAGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PROCESS_END`: `TANALYZE_RETURN` = 1;
// UNSUPPORTED Rust 3545:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PROCESS_NAME_ENTRY {
//     pub ProcessId: u32,
//     pub NameOffset: u32,
//     pub NameSize: u32,
//     pub NextEntry: u32,
// }

// UNSUPPORTED Rust 3553:1: generic scalar type unsupported
// pub type PSYM_DUMP_FIELD_CALLBACK = Option<unsafe extern "system" fn(pfield: *mut FIELD_INFO, usercontext: *mut core::ffi::c_void) -> u32>;

public const val `PTR_SEARCH_NO_SYMBOL_CHECK`: UInt = 2147483648u;
public const val `PTR_SEARCH_PHYS_ALL_HITS`: UInt = 1u;
public const val `PTR_SEARCH_PHYS_PTE`: UInt = 2u;
public const val `PTR_SEARCH_PHYS_RANGE_CHECK_ONLY`: UInt = 4u;
public const val `PTR_SEARCH_PHYS_SIZE_SHIFT`: UInt = 3u;
// UNSUPPORTED Rust 3559:1: generic scalar type unsupported
// pub type PWINDBG_CHECK_CONTROL_C = Option<unsafe extern "system" fn() -> u32>;

// UNSUPPORTED Rust 3560:1: generic scalar type unsupported
// pub type PWINDBG_CHECK_VERSION = Option<unsafe extern "system" fn() -> u32>;

// UNSUPPORTED Rust 3561:1: generic scalar type unsupported
// pub type PWINDBG_DISASM = Option<unsafe extern "system" fn(lpoffset: *mut usize, lpbuffer: windows_sys::core::PCSTR, fshoweffectiveaddress: u32) -> u32>;

// UNSUPPORTED Rust 3562:1: generic scalar type unsupported
// pub type PWINDBG_DISASM32 = Option<unsafe extern "system" fn(lpoffset: *mut u32, lpbuffer: windows_sys::core::PCSTR, fshoweffectiveaddress: u32) -> u32>;

// UNSUPPORTED Rust 3563:1: generic scalar type unsupported
// pub type PWINDBG_DISASM64 = Option<unsafe extern "system" fn(lpoffset: *mut u64, lpbuffer: windows_sys::core::PCSTR, fshoweffectiveaddress: u32) -> u32>;

// UNSUPPORTED Rust 3564:1: generic scalar type unsupported
// pub type PWINDBG_EXTENSION_API_VERSION = Option<unsafe extern "system" fn() -> *mut EXT_API_VERSION>;

// UNSUPPORTED Rust 3565:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Kernel")]
// pub type PWINDBG_EXTENSION_DLL_INIT = Option<unsafe extern "system" fn(lpextensionapis: *mut WINDBG_EXTENSION_APIS, majorversion: u16, minorversion: u16)>;

// UNSUPPORTED Rust 3567:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Kernel")]
// pub type PWINDBG_EXTENSION_DLL_INIT32 = Option<unsafe extern "system" fn(lpextensionapis: *mut WINDBG_EXTENSION_APIS32, majorversion: u16, minorversion: u16)>;

// UNSUPPORTED Rust 3569:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Kernel")]
// pub type PWINDBG_EXTENSION_DLL_INIT64 = Option<unsafe extern "system" fn(lpextensionapis: *mut WINDBG_EXTENSION_APIS64, majorversion: u16, minorversion: u16)>;

// UNSUPPORTED Rust 3571:1: generic scalar type unsupported
// pub type PWINDBG_EXTENSION_ROUTINE = Option<unsafe extern "system" fn(hcurrentprocess: super::super::super::super::Foundation::HANDLE, hcurrentthread: super::super::super::super::Foundation::HANDLE, dwcurrentpc: u32, dwprocessor: u32, lpargumentstring: windows_sys::core::PCSTR)>;

// UNSUPPORTED Rust 3572:1: generic scalar type unsupported
// pub type PWINDBG_EXTENSION_ROUTINE32 = Option<unsafe extern "system" fn(hcurrentprocess: super::super::super::super::Foundation::HANDLE, hcurrentthread: super::super::super::super::Foundation::HANDLE, dwcurrentpc: u32, dwprocessor: u32, lpargumentstring: windows_sys::core::PCSTR)>;

// UNSUPPORTED Rust 3573:1: generic scalar type unsupported
// pub type PWINDBG_EXTENSION_ROUTINE64 = Option<unsafe extern "system" fn(hcurrentprocess: super::super::super::super::Foundation::HANDLE, hcurrentthread: super::super::super::super::Foundation::HANDLE, dwcurrentpc: u64, dwprocessor: u32, lpargumentstring: windows_sys::core::PCSTR)>;

// UNSUPPORTED Rust 3574:1: generic scalar type unsupported
// pub type PWINDBG_GET_EXPRESSION = Option<unsafe extern "system" fn(lpexpression: windows_sys::core::PCSTR) -> usize>;

// UNSUPPORTED Rust 3575:1: generic scalar type unsupported
// pub type PWINDBG_GET_EXPRESSION32 = Option<unsafe extern "system" fn(lpexpression: windows_sys::core::PCSTR) -> u32>;

// UNSUPPORTED Rust 3576:1: generic scalar type unsupported
// pub type PWINDBG_GET_EXPRESSION64 = Option<unsafe extern "system" fn(lpexpression: windows_sys::core::PCSTR) -> u64>;

// UNSUPPORTED Rust 3577:1: generic scalar type unsupported
// pub type PWINDBG_GET_SYMBOL = Option<unsafe extern "system" fn(offset: *mut core::ffi::c_void, pchbuffer: windows_sys::core::PCSTR, pdisplacement: *mut usize)>;

// UNSUPPORTED Rust 3578:1: generic scalar type unsupported
// pub type PWINDBG_GET_SYMBOL32 = Option<unsafe extern "system" fn(offset: u32, pchbuffer: windows_sys::core::PCSTR, pdisplacement: *mut u32)>;

// UNSUPPORTED Rust 3579:1: generic scalar type unsupported
// pub type PWINDBG_GET_SYMBOL64 = Option<unsafe extern "system" fn(offset: u64, pchbuffer: windows_sys::core::PCSTR, pdisplacement: *mut u64)>;

// UNSUPPORTED Rust 3580:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Kernel")]
// pub type PWINDBG_GET_THREAD_CONTEXT_ROUTINE = Option<unsafe extern "system" fn(processor: u32, lpcontext: *mut super::CONTEXT, cbsizeofcontext: u32) -> u32>;

// UNSUPPORTED Rust 3582:1: generic scalar type unsupported
// pub type PWINDBG_IOCTL_ROUTINE = Option<unsafe extern "system" fn(ioctltype: u16, lpvdata: *mut core::ffi::c_void, cbsize: u32) -> u32>;

// UNSUPPORTED Rust 3583:1: generic scalar type unsupported
// pub type PWINDBG_OLDKD_EXTENSION_ROUTINE = Option<unsafe extern "system" fn(dwcurrentpc: u32, lpextensionapis: *mut WINDBG_OLDKD_EXTENSION_APIS, lpargumentstring: windows_sys::core::PCSTR)>;

// UNSUPPORTED Rust 3584:1: generic scalar type unsupported
// pub type PWINDBG_OLDKD_READ_PHYSICAL_MEMORY = Option<unsafe extern "system" fn(address: u64, buffer: *mut core::ffi::c_void, count: u32, bytesread: *mut u32) -> u32>;

// UNSUPPORTED Rust 3585:1: generic scalar type unsupported
// pub type PWINDBG_OLDKD_WRITE_PHYSICAL_MEMORY = Option<unsafe extern "system" fn(address: u64, buffer: *mut core::ffi::c_void, length: u32, byteswritten: *mut u32) -> u32>;

// UNSUPPORTED Rust 3586:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Kernel")]
// pub type PWINDBG_OLD_EXTENSION_ROUTINE = Option<unsafe extern "system" fn(dwcurrentpc: u32, lpextensionapis: *mut WINDBG_EXTENSION_APIS, lpargumentstring: windows_sys::core::PCSTR)>;

// UNSUPPORTED Rust 3588:1: generic scalar type unsupported
// pub type PWINDBG_OUTPUT_ROUTINE = Option<unsafe extern "system" fn(lpformat: windows_sys::core::PCSTR)>;

// UNSUPPORTED Rust 3589:1: generic scalar type unsupported
// pub type PWINDBG_READ_PROCESS_MEMORY_ROUTINE = Option<unsafe extern "system" fn(offset: usize, lpbuffer: *mut core::ffi::c_void, cb: u32, lpcbbytesread: *mut u32) -> u32>;

// UNSUPPORTED Rust 3590:1: generic scalar type unsupported
// pub type PWINDBG_READ_PROCESS_MEMORY_ROUTINE32 = Option<unsafe extern "system" fn(offset: u32, lpbuffer: *mut core::ffi::c_void, cb: u32, lpcbbytesread: *mut u32) -> u32>;

// UNSUPPORTED Rust 3591:1: generic scalar type unsupported
// pub type PWINDBG_READ_PROCESS_MEMORY_ROUTINE64 = Option<unsafe extern "system" fn(offset: u64, lpbuffer: *mut core::ffi::c_void, cb: u32, lpcbbytesread: *mut u32) -> u32>;

// UNSUPPORTED Rust 3592:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Kernel")]
// pub type PWINDBG_SET_THREAD_CONTEXT_ROUTINE = Option<unsafe extern "system" fn(processor: u32, lpcontext: *mut super::CONTEXT, cbsizeofcontext: u32) -> u32>;

// UNSUPPORTED Rust 3594:1: generic scalar type unsupported
// pub type PWINDBG_STACKTRACE_ROUTINE = Option<unsafe extern "system" fn(framepointer: u32, stackpointer: u32, programcounter: u32, stackframes: *mut EXTSTACKTRACE, frames: u32) -> u32>;

// UNSUPPORTED Rust 3595:1: generic scalar type unsupported
// pub type PWINDBG_STACKTRACE_ROUTINE32 = Option<unsafe extern "system" fn(framepointer: u32, stackpointer: u32, programcounter: u32, stackframes: *mut EXTSTACKTRACE32, frames: u32) -> u32>;

// UNSUPPORTED Rust 3596:1: generic scalar type unsupported
// pub type PWINDBG_STACKTRACE_ROUTINE64 = Option<unsafe extern "system" fn(framepointer: u64, stackpointer: u64, programcounter: u64, stackframes: *mut EXTSTACKTRACE64, frames: u32) -> u32>;

// UNSUPPORTED Rust 3597:1: generic scalar type unsupported
// pub type PWINDBG_WRITE_PROCESS_MEMORY_ROUTINE = Option<unsafe extern "system" fn(offset: usize, lpbuffer: *const core::ffi::c_void, cb: u32, lpcbbyteswritten: *mut u32) -> u32>;

// UNSUPPORTED Rust 3598:1: generic scalar type unsupported
// pub type PWINDBG_WRITE_PROCESS_MEMORY_ROUTINE32 = Option<unsafe extern "system" fn(offset: u32, lpbuffer: *const core::ffi::c_void, cb: u32, lpcbbyteswritten: *mut u32) -> u32>;

// UNSUPPORTED Rust 3599:1: generic scalar type unsupported
// pub type PWINDBG_WRITE_PROCESS_MEMORY_ROUTINE64 = Option<unsafe extern "system" fn(offset: u64, lpbuffer: *const core::ffi::c_void, cb: u32, lpcbbyteswritten: *mut u32) -> u32>;

public const val `PointerCXHat`: `PointerKind` = 3;
public typealias `PointerKind` = Int;
public const val `PointerManagedReference`: `PointerKind` = 4;
public const val `PointerRValueReference`: `PointerKind` = 2;
public const val `PointerReference`: `PointerKind` = 1;
public const val `PointerStandard`: `PointerKind` = 0;
public typealias `PreferredFormat` = Int;
// UNSUPPORTED Rust 3607:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct READCONTROLSPACE {
//     pub Processor: u16,
//     pub Address: u32,
//     pub BufLen: u32,
//     pub Buf: [u8; 1],
// }

// UNSUPPORTED Rust 3615:1: declaration Impl has no candidate rule
// impl Default for READCONTROLSPACE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3620:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct READCONTROLSPACE32 {
//     pub Processor: u16,
//     pub Address: u32,
//     pub BufLen: u32,
//     pub Buf: [u8; 1],
// }

// UNSUPPORTED Rust 3628:1: declaration Impl has no candidate rule
// impl Default for READCONTROLSPACE32 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3633:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct READCONTROLSPACE64 {
//     pub Processor: u16,
//     pub Address: u64,
//     pub BufLen: u32,
//     pub Buf: [u8; 1],
// }

// UNSUPPORTED Rust 3641:1: declaration Impl has no candidate rule
// impl Default for READCONTROLSPACE64 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3646:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct READ_WRITE_MSR {
//     pub Msr: u32,
//     pub Value: i64,
// }

public typealias `RawSearchFlags` = Int;
public const val `RawSearchNoBases`: `RawSearchFlags` = 1;
public const val `RawSearchNone`: `RawSearchFlags` = 0;
// UNSUPPORTED Rust 3655:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SEARCHMEMORY {
//     pub SearchAddress: u64,
//     pub SearchLength: u64,
//     pub FoundAddress: u64,
//     pub PatternLength: u32,
//     pub Pattern: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 3664:1: declaration Impl has no candidate rule
// impl Default for SEARCHMEMORY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `STACK_FRAME_TYPE_IGNORE`: UInt = 255u;
public const val `STACK_FRAME_TYPE_INIT`: UInt = 0u;
public const val `STACK_FRAME_TYPE_INLINE`: UInt = 2u;
public const val `STACK_FRAME_TYPE_RA`: UInt = 128u;
public const val `STACK_FRAME_TYPE_STACK`: UInt = 1u;
// UNSUPPORTED Rust 3674:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct STACK_SRC_INFO {
//     pub ImagePath: windows_sys::core::PCWSTR,
//     pub ModuleName: windows_sys::core::PCWSTR,
//     pub Function: windows_sys::core::PCWSTR,
//     pub Displacement: u32,
//     pub Row: u32,
//     pub Column: u32,
// }

// UNSUPPORTED Rust 3684:1: declaration Impl has no candidate rule
// impl Default for STACK_SRC_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3689:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct STACK_SYM_FRAME_INFO {
//     pub StackFrameEx: DEBUG_STACK_FRAME_EX,
//     pub SrcInfo: STACK_SRC_INFO,
// }

// UNSUPPORTED Rust 3695:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SYMBOL_INFO_EX {
//     pub SizeOfStruct: u32,
//     pub TypeOfInfo: u32,
//     pub Offset: u64,
//     pub Line: u32,
//     pub Displacement: u32,
//     pub Reserved: [u32; 4],
// }

// UNSUPPORTED Rust 3705:1: declaration Impl has no candidate rule
// impl Default for SYMBOL_INFO_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SYMBOL_TYPE_INDEX_NOT_FOUND`: UInt = 2u;
public const val `SYMBOL_TYPE_INFO_NOT_FOUND`: UInt = 3u;
// UNSUPPORTED Rust 3712:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SYM_DUMP_PARAM {
//     pub size: u32,
//     pub sName: *mut u8,
//     pub Options: u32,
//     pub addr: u64,
//     pub listLink: *mut FIELD_INFO,
//     pub Anonymous: SYM_DUMP_PARAM_0,
//     pub CallbackRoutine: PSYM_DUMP_FIELD_CALLBACK,
//     pub nFields: u32,
//     pub Fields: *mut FIELD_INFO,
//     pub ModBase: u64,
//     pub TypeId: u32,
//     pub TypeSize: u32,
//     pub BufferSize: u32,
//     pub _bitfield: u32,
// }

// UNSUPPORTED Rust 3730:1: declaration Impl has no candidate rule
// impl Default for SYM_DUMP_PARAM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3735:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union SYM_DUMP_PARAM_0 {
//     pub Context: *mut core::ffi::c_void,
//     pub pBuffer: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 3741:1: declaration Impl has no candidate rule
// impl Default for SYM_DUMP_PARAM_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `ScriptChangeKind` = Int;
public const val `ScriptDebugAsyncBreak`: `ScriptDebugEvent` = 3;
public const val `ScriptDebugBreak`: `ScriptDebugState` = 3;
public const val `ScriptDebugBreakpoint`: `ScriptDebugEvent` = 0;
public typealias `ScriptDebugEvent` = Int;
public typealias `ScriptDebugEventFilter` = Int;
public const val `ScriptDebugEventFilterAbort`: `ScriptDebugEventFilter` = 3;
public const val `ScriptDebugEventFilterEntry`: `ScriptDebugEventFilter` = 0;
public const val `ScriptDebugEventFilterException`: `ScriptDebugEventFilter` = 1;
public const val `ScriptDebugEventFilterUnhandledException`: `ScriptDebugEventFilter` = 2;
// UNSUPPORTED Rust 3756:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ScriptDebugEventInformation {
//     pub DebugEvent: ScriptDebugEvent,
//     pub EventPosition: ScriptDebugPosition,
//     pub EventSpanEnd: ScriptDebugPosition,
//     pub u: ScriptDebugEventInformation_0,
// }

// UNSUPPORTED Rust 3764:1: declaration Impl has no candidate rule
// impl Default for ScriptDebugEventInformation {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3769:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union ScriptDebugEventInformation_0 {
//     pub ExceptionInformation: ScriptDebugEventInformation_0_0,
//     pub BreakpointInformation: ScriptDebugEventInformation_0_1,
// }

// UNSUPPORTED Rust 3775:1: declaration Impl has no candidate rule
// impl Default for ScriptDebugEventInformation_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3780:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ScriptDebugEventInformation_0_1 {
//     pub BreakpointId: u64,
// }

// UNSUPPORTED Rust 3785:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ScriptDebugEventInformation_0_0 {
//     pub IsUncaught: u8,
// }

public const val `ScriptDebugException`: `ScriptDebugEvent` = 2;
public const val `ScriptDebugExecuting`: `ScriptDebugState` = 2;
public const val `ScriptDebugNoDebugger`: `ScriptDebugState` = 0;
public const val `ScriptDebugNotExecuting`: `ScriptDebugState` = 1;
// UNSUPPORTED Rust 3794:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ScriptDebugPosition {
//     pub Line: u32,
//     pub Column: u32,
// }

public typealias `ScriptDebugState` = Int;
public const val `ScriptDebugStep`: `ScriptDebugEvent` = 1;
public typealias `ScriptExecutionKind` = Int;
public const val `ScriptExecutionNormal`: `ScriptExecutionKind` = 0;
public const val `ScriptExecutionStepIn`: `ScriptExecutionKind` = 1;
public const val `ScriptExecutionStepOut`: `ScriptExecutionKind` = 2;
public const val `ScriptExecutionStepOver`: `ScriptExecutionKind` = 3;
public const val `ScriptRename`: `ScriptChangeKind` = 0;
public typealias `SignatureComparison` = Int;
public const val `Symbol`: `SymbolKind` = 0;
public const val `SymbolBaseClass`: `SymbolKind` = 6;
public const val `SymbolConstant`: `SymbolKind` = 4;
public const val `SymbolData`: `SymbolKind` = 5;
public const val `SymbolField`: `SymbolKind` = 3;
public const val `SymbolFunction`: `SymbolKind` = 8;
public typealias `SymbolKind` = Int;
public const val `SymbolModule`: `SymbolKind` = 1;
public const val `SymbolPublic`: `SymbolKind` = 7;
public const val `SymbolSearchCaseInsensitive`: `SymbolSearchOptions` = 2;
public const val `SymbolSearchCompletion`: `SymbolSearchOptions` = 1;
public const val `SymbolSearchNone`: `SymbolSearchOptions` = 0;
public typealias `SymbolSearchOptions` = Int;
public const val `SymbolType`: `SymbolKind` = 2;
public typealias `TANALYZE_RETURN` = Int;
// UNSUPPORTED Rust 3824:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct TARGET_DEBUG_INFO {
//     pub SizeOfStruct: u32,
//     pub EntryDate: u64,
//     pub DebugeeClass: u32,
//     pub SysUpTime: u64,
//     pub AppUpTime: u64,
//     pub CrashTime: u64,
//     pub OsInfo: OS_INFO,
//     pub Cpu: CPU_INFO,
//     pub DumpFile: [i8; 260],
// }

// UNSUPPORTED Rust 3837:1: declaration Impl has no candidate rule
// impl Default for TARGET_DEBUG_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3842:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct TARGET_DEBUG_INFO_v1 {
//     pub SizeOfStruct: u32,
//     pub Id: u64,
//     pub Source: u64,
//     pub EntryDate: u64,
//     pub SysUpTime: u64,
//     pub AppUpTime: u64,
//     pub CrashTime: u64,
//     pub Mode: u64,
//     pub OsInfo: OS_INFO_v1,
//     pub Cpu: CPU_INFO_v1,
//     pub DumpFile: [i8; 260],
//     pub FailureData: *mut core::ffi::c_void,
//     pub StackTr: [i8; 4096],
// }

// UNSUPPORTED Rust 3859:1: declaration Impl has no candidate rule
// impl Default for TARGET_DEBUG_INFO_v1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3864:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct TARGET_DEBUG_INFO_v2 {
//     pub SizeOfStruct: u32,
//     pub EntryDate: u64,
//     pub DebugeeClass: u32,
//     pub SysUpTime: u64,
//     pub AppUpTime: u64,
//     pub CrashTime: u64,
//     pub OsInfo: OS_INFO,
//     pub Cpu: CPU_INFO_v2,
//     pub DumpFile: [i8; 260],
// }

// UNSUPPORTED Rust 3877:1: declaration Impl has no candidate rule
// impl Default for TARGET_DEBUG_INFO_v2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3882:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TRANSLATE_VIRTUAL_TO_PHYSICAL {
//     pub Virtual: u64,
//     pub Physical: u64,
// }

public const val `TRIAGE_FOLLOWUP_DEFAULT`: UInt = 2u;
public const val `TRIAGE_FOLLOWUP_FAIL`: UInt = 0u;
public const val `TRIAGE_FOLLOWUP_IGNORE`: UInt = 1u;
public const val `TRIAGE_FOLLOWUP_SUCCESS`: UInt = 3u;
public const val `TypeArray`: `TypeKind` = 3;
public const val `TypeEnum`: `TypeKind` = 6;
public const val `TypeExtendedArray`: `TypeKind` = 8;
public const val `TypeFunction`: `TypeKind` = 4;
public const val `TypeIntrinsic`: `TypeKind` = 7;
public typealias `TypeKind` = Int;
public const val `TypeMemberPointer`: `TypeKind` = 2;
public const val `TypePointer`: `TypeKind` = 1;
public const val `TypeTypedef`: `TypeKind` = 5;
public const val `TypeUDT`: `TypeKind` = 0;
public const val `UNAVAILABLE_ERROR`: UInt = 12u;
public const val `Unrelated`: `SignatureComparison` = 0;
// UNSUPPORTED Rust 3904:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct VIRTUAL_TO_PHYSICAL {
//     pub Status: u32,
//     pub Size: u32,
//     pub PdeAddress: u64,
//     pub Virtual: u64,
//     pub Physical: u64,
// }

public const val `VarArgsCStyle`: `VarArgsKind` = 1;
public typealias `VarArgsKind` = Int;
public const val `VarArgsNone`: `VarArgsKind` = 0;
public const val `WDBGEXTS_ADDRESS_DEFAULT`: UInt = 0u;
public const val `WDBGEXTS_ADDRESS_RESERVED0`: UInt = 2147483648u;
public const val `WDBGEXTS_ADDRESS_SEG16`: UInt = 1u;
public const val `WDBGEXTS_ADDRESS_SEG32`: UInt = 2u;
// UNSUPPORTED Rust 3920:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WDBGEXTS_CLR_DATA_INTERFACE {
//     pub Iid: *const windows_sys::core::GUID,
//     pub Iface: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 3926:1: declaration Impl has no candidate rule
// impl Default for WDBGEXTS_CLR_DATA_INTERFACE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3931:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WDBGEXTS_DISASSEMBLE_BUFFER {
//     pub InOffset: u64,
//     pub OutOffset: u64,
//     pub AddrFlags: u32,
//     pub FormatFlags: u32,
//     pub DataBufferBytes: u32,
//     pub DisasmBufferChars: u32,
//     pub DataBuffer: *mut core::ffi::c_void,
//     pub DisasmBuffer: windows_sys::core::PWSTR,
//     pub Reserved0: [u64; 3],
// }

// UNSUPPORTED Rust 3944:1: declaration Impl has no candidate rule
// impl Default for WDBGEXTS_DISASSEMBLE_BUFFER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3949:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WDBGEXTS_MODULE_IN_RANGE {
//     pub Start: u64,
//     pub End: u64,
//     pub FoundModBase: u64,
//     pub FoundModSize: u32,
// }

// UNSUPPORTED Rust 3957:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WDBGEXTS_QUERY_INTERFACE {
//     pub Iid: *const windows_sys::core::GUID,
//     pub Iface: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 3963:1: declaration Impl has no candidate rule
// impl Default for WDBGEXTS_QUERY_INTERFACE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3968:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WDBGEXTS_THREAD_OS_INFO {
//     pub ThreadId: u32,
//     pub ExitStatus: u32,
//     pub PriorityClass: u32,
//     pub Priority: u32,
//     pub CreateTime: u64,
//     pub ExitTime: u64,
//     pub KernelTime: u64,
//     pub UserTime: u64,
//     pub StartOffset: u64,
//     pub Affinity: u64,
// }

// UNSUPPORTED Rust 3982:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Kernel")]
// #[derive(Clone, Copy, Default)]
// pub struct WINDBG_EXTENSION_APIS {
//     pub nSize: u32,
//     pub lpOutputRoutine: PWINDBG_OUTPUT_ROUTINE,
//     pub lpGetExpressionRoutine: PWINDBG_GET_EXPRESSION,
//     pub lpGetSymbolRoutine: PWINDBG_GET_SYMBOL,
//     pub lpDisasmRoutine: PWINDBG_DISASM,
//     pub lpCheckControlCRoutine: PWINDBG_CHECK_CONTROL_C,
//     pub lpReadProcessMemoryRoutine: PWINDBG_READ_PROCESS_MEMORY_ROUTINE,
//     pub lpWriteProcessMemoryRoutine: PWINDBG_WRITE_PROCESS_MEMORY_ROUTINE,
//     pub lpGetThreadContextRoutine: PWINDBG_GET_THREAD_CONTEXT_ROUTINE,
//     pub lpSetThreadContextRoutine: PWINDBG_SET_THREAD_CONTEXT_ROUTINE,
//     pub lpIoctlRoutine: PWINDBG_IOCTL_ROUTINE,
//     pub lpStackTraceRoutine: PWINDBG_STACKTRACE_ROUTINE,
// }

// UNSUPPORTED Rust 3999:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Kernel")]
// #[derive(Clone, Copy, Default)]
// pub struct WINDBG_EXTENSION_APIS32 {
//     pub nSize: u32,
//     pub lpOutputRoutine: PWINDBG_OUTPUT_ROUTINE,
//     pub lpGetExpressionRoutine: PWINDBG_GET_EXPRESSION32,
//     pub lpGetSymbolRoutine: PWINDBG_GET_SYMBOL32,
//     pub lpDisasmRoutine: PWINDBG_DISASM32,
//     pub lpCheckControlCRoutine: PWINDBG_CHECK_CONTROL_C,
//     pub lpReadProcessMemoryRoutine: PWINDBG_READ_PROCESS_MEMORY_ROUTINE32,
//     pub lpWriteProcessMemoryRoutine: PWINDBG_WRITE_PROCESS_MEMORY_ROUTINE32,
//     pub lpGetThreadContextRoutine: PWINDBG_GET_THREAD_CONTEXT_ROUTINE,
//     pub lpSetThreadContextRoutine: PWINDBG_SET_THREAD_CONTEXT_ROUTINE,
//     pub lpIoctlRoutine: PWINDBG_IOCTL_ROUTINE,
//     pub lpStackTraceRoutine: PWINDBG_STACKTRACE_ROUTINE32,
// }

// UNSUPPORTED Rust 4016:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Kernel")]
// #[derive(Clone, Copy, Default)]
// pub struct WINDBG_EXTENSION_APIS64 {
//     pub nSize: u32,
//     pub lpOutputRoutine: PWINDBG_OUTPUT_ROUTINE,
//     pub lpGetExpressionRoutine: PWINDBG_GET_EXPRESSION64,
//     pub lpGetSymbolRoutine: PWINDBG_GET_SYMBOL64,
//     pub lpDisasmRoutine: PWINDBG_DISASM64,
//     pub lpCheckControlCRoutine: PWINDBG_CHECK_CONTROL_C,
//     pub lpReadProcessMemoryRoutine: PWINDBG_READ_PROCESS_MEMORY_ROUTINE64,
//     pub lpWriteProcessMemoryRoutine: PWINDBG_WRITE_PROCESS_MEMORY_ROUTINE64,
//     pub lpGetThreadContextRoutine: PWINDBG_GET_THREAD_CONTEXT_ROUTINE,
//     pub lpSetThreadContextRoutine: PWINDBG_SET_THREAD_CONTEXT_ROUTINE,
//     pub lpIoctlRoutine: PWINDBG_IOCTL_ROUTINE,
//     pub lpStackTraceRoutine: PWINDBG_STACKTRACE_ROUTINE64,
// }

// UNSUPPORTED Rust 4033:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WINDBG_OLDKD_EXTENSION_APIS {
//     pub nSize: u32,
//     pub lpOutputRoutine: PWINDBG_OUTPUT_ROUTINE,
//     pub lpGetExpressionRoutine: PWINDBG_GET_EXPRESSION32,
//     pub lpGetSymbolRoutine: PWINDBG_GET_SYMBOL32,
//     pub lpDisasmRoutine: PWINDBG_DISASM32,
//     pub lpCheckControlCRoutine: PWINDBG_CHECK_CONTROL_C,
//     pub lpReadVirtualMemRoutine: PWINDBG_READ_PROCESS_MEMORY_ROUTINE32,
//     pub lpWriteVirtualMemRoutine: PWINDBG_WRITE_PROCESS_MEMORY_ROUTINE32,
//     pub lpReadPhysicalMemRoutine: PWINDBG_OLDKD_READ_PHYSICAL_MEMORY,
//     pub lpWritePhysicalMemRoutine: PWINDBG_OLDKD_WRITE_PHYSICAL_MEMORY,
// }

// UNSUPPORTED Rust 4047:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WINDBG_OLD_EXTENSION_APIS {
//     pub nSize: u32,
//     pub lpOutputRoutine: PWINDBG_OUTPUT_ROUTINE,
//     pub lpGetExpressionRoutine: PWINDBG_GET_EXPRESSION,
//     pub lpGetSymbolRoutine: PWINDBG_GET_SYMBOL,
//     pub lpDisasmRoutine: PWINDBG_DISASM,
//     pub lpCheckControlCRoutine: PWINDBG_CHECK_CONTROL_C,
// }

public const val `WIN_95`: `OS_TYPE` = 0;
public const val `WIN_98`: `OS_TYPE` = 1;
public const val `WIN_ME`: `OS_TYPE` = 2;
public const val `WIN_NT4`: `OS_TYPE` = 3;
public const val `WIN_NT5`: `OS_TYPE` = 4;
public const val `WIN_NT5_1`: `OS_TYPE` = 5;
public const val `WIN_NT5_2`: `OS_TYPE` = 6;
public const val `WIN_NT6_0`: `OS_TYPE` = 7;
public const val `WIN_NT6_1`: `OS_TYPE` = 8;
public const val `WIN_UNDEFINED`: `OS_TYPE` = 255;
// UNSUPPORTED Rust 4067:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct XML_DRIVER_NODE_INFO {
//     pub FileName: [i8; 64],
//     pub FileSize: u64,
//     pub CreationDate: u64,
//     pub Version: [i8; 64],
//     pub Manufacturer: [i8; 260],
//     pub ProductName: [i8; 260],
//     pub Group: [i8; 260],
//     pub Altitude: [i8; 260],
// }

// UNSUPPORTED Rust 4079:1: declaration Impl has no candidate rule
// impl Default for XML_DRIVER_NODE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `_EXTSAPI_VER_`: UInt = 10u;
// UNSUPPORTED Rust 4085:1: generic scalar type unsupported
// pub type fnDebugFailureAnalysisCreateInstance = Option<unsafe extern "system" fn(client: *mut core::ffi::c_void, args: windows_sys::core::PCWSTR, flags: u32, rclsid: *const windows_sys::core::GUID, riid: *const windows_sys::core::GUID, ppv: *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT>;

