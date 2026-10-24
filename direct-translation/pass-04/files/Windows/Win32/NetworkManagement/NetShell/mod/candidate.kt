// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netsh.dll, ABI=system, export=MatchEnumTag; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MatchEnumTag`(`hmodule` : `super`.`super`.`Foundation`.`HANDLE`, `pwcarg` : `windows_sys`.`core`.`PCWSTR`, `dwnumarg` : UInt, `penumtable` : /* Rust *const */ kotlinx.cinterop.CPointer<`TOKEN_VALUE`>?, `pdwvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netsh.dll, ABI=system, export=MatchToken; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MatchToken`(`pwszusertoken` : `windows_sys`.`core`.`PCWSTR`, `pwszcmdtoken` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netsh.dll, ABI=system, export=PreprocessCommand; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PreprocessCommand`(`hmodule` : `super`.`super`.`Foundation`.`HANDLE`, `ppwcarguments` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?, `dwcurrentindex` : UInt, `dwargcount` : UInt, `ptttags` : /* Rust *mut */ kotlinx.cinterop.CPointer<`TAG_TYPE`>?, `dwtagcount` : UInt, `dwminargs` : UInt, `dwmaxargs` : UInt, `pdwtagtype` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// UNSUPPORTED Rust 4:1: foreign declaration requires explicit native target and interop package; syntax: foreign signature shape unsupported
// windows_link::link!("netsh.dll" "C" fn PrintError(hmodule : super::super::Foundation:: HANDLE, dwerrid : u32, ...) -> u32);

// UNSUPPORTED Rust 5:1: foreign declaration requires explicit native target and interop package; syntax: foreign signature shape unsupported
// windows_link::link!("netsh.dll" "C" fn PrintMessage(pwszformat : windows_sys::core::PCWSTR, ...) -> u32);

// UNSUPPORTED Rust 6:1: foreign declaration requires explicit native target and interop package; syntax: foreign signature shape unsupported
// windows_link::link!("netsh.dll" "C" fn PrintMessageFromModule(hmodule : super::super::Foundation:: HANDLE, dwmsgid : u32, ...) -> u32);

// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netsh.dll, ABI=system, export=RegisterContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegisterContext`(`pchildcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`NS_CONTEXT_ATTRIBUTES`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netsh.dll, ABI=system, export=RegisterHelper; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegisterHelper`(`pguidparentcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `pfnregistersubcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`NS_HELPER_ATTRIBUTES`>?) : UInt
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CMD_ENTRY` (
    public var `pwszCmdToken`: `windows_sys`.`core`.`PCWSTR`,
    public var `pfnCmdHandler`: `PFN_HANDLE_CMD`,
    public var `dwShortCmdHelpToken`: UInt,
    public var `dwCmdHlpToken`: UInt,
    public var `dwFlags`: UInt,
    public var `pOsVersionCheck`: `PNS_OSVERSIONCHECK`,
    public var `pfnCustomHelpFn`: `PFN_CUSTOM_HELP`,
)
// UNSUPPORTED Rust 20:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CMD_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CMD_FLAG_HIDDEN`: `NS_CMD_FLAGS` = 32;
public const val `CMD_FLAG_INTERACTIVE`: `NS_CMD_FLAGS` = 2;
public const val `CMD_FLAG_LIMIT_MASK`: `NS_CMD_FLAGS` = 65535;
public const val `CMD_FLAG_LOCAL`: `NS_CMD_FLAGS` = 8;
public const val `CMD_FLAG_ONLINE`: `NS_CMD_FLAGS` = 16;
public const val `CMD_FLAG_PRIORITY`: `NS_CMD_FLAGS` = -2147483648;
public const val `CMD_FLAG_PRIVATE`: `NS_CMD_FLAGS` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CMD_GROUP_ENTRY` (
    public var `pwszCmdGroupToken`: `windows_sys`.`core`.`PCWSTR`,
    public var `dwShortCmdHelpToken`: UInt,
    public var `ulCmdGroupSize`: UInt,
    public var `dwFlags`: UInt,
    public var `pCmdGroup`: /* Rust *mut */ kotlinx.cinterop.CPointer<`CMD_ENTRY`>?,
    public var `pOsVersionCheck`: `PNS_OSVERSIONCHECK`,
)
// UNSUPPORTED Rust 42:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CMD_GROUP_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DEFAULT_CONTEXT_PRIORITY`: UInt = 100u;
public const val `ERROR_CMD_NOT_FOUND`: UInt = 15004u;
public const val `ERROR_CONTEXT_ALREADY_REGISTERED`: UInt = 15019u;
public const val `ERROR_CONTINUE_IN_PARENT_CONTEXT`: UInt = 15016u;
public const val `ERROR_DLL_LOAD_FAILED`: UInt = 15006u;
public const val `ERROR_ENTRY_PT_NOT_FOUND`: UInt = 15005u;
public const val `ERROR_HELPER_ALREADY_REGISTERED`: UInt = 15018u;
public const val `ERROR_INIT_DISPLAY`: UInt = 15007u;
public const val `ERROR_INVALID_OPTION_TAG`: UInt = 15009u;
public const val `ERROR_INVALID_OPTION_VALUE`: UInt = 15014u;
public const val `ERROR_INVALID_SYNTAX`: UInt = 15001u;
public const val `ERROR_MISSING_OPTION`: UInt = 15011u;
public const val `ERROR_NO_CHANGE`: UInt = 15003u;
public const val `ERROR_NO_ENTRIES`: UInt = 15000u;
public const val `ERROR_NO_TAG`: UInt = 15010u;
public const val `ERROR_OKAY`: UInt = 15015u;
public const val `ERROR_PARSING_FAILURE`: UInt = 15020u;
public const val `ERROR_PROTOCOL_NOT_IN_TRANSPORT`: UInt = 15002u;
public const val `ERROR_SHOW_USAGE`: UInt = 15013u;
public const val `ERROR_SUPPRESS_OUTPUT`: UInt = 15017u;
public const val `ERROR_TAG_ALREADY_PRESENT`: UInt = 15008u;
public const val `ERROR_TRANSPORT_NOT_PRESENT`: UInt = 15012u;
// UNSUPPORTED Rust 69:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const GET_RESOURCE_STRING_FN_NAME: windows_sys::core::PCSTR = windows_sys::core::s!("GetResourceString");

public const val `MAX_NAME_LEN`: UInt = 48u;
// UNSUPPORTED Rust 71:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const NETSH_ARG_DELIMITER: windows_sys::core::PCWSTR = windows_sys::core::w!("=");

// UNSUPPORTED Rust 72:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const NETSH_CMD_DELIMITER: windows_sys::core::PCWSTR = windows_sys::core::w!(" ");

public const val `NETSH_COMMIT`: `NS_MODE_CHANGE` = 0;
public const val `NETSH_COMMIT_STATE`: `NS_MODE_CHANGE` = 3;
public const val `NETSH_ERROR_BASE`: UInt = 15000u;
public const val `NETSH_ERROR_END`: UInt = 15019u;
public const val `NETSH_FLUSH`: `NS_MODE_CHANGE` = 2;
public const val `NETSH_MAX_CMD_TOKEN_LENGTH`: UInt = 128u;
public const val `NETSH_MAX_TOKEN_LENGTH`: UInt = 64u;
public const val `NETSH_SAVE`: `NS_MODE_CHANGE` = 4;
public const val `NETSH_UNCOMMIT`: `NS_MODE_CHANGE` = 1;
public const val `NETSH_VERSION_50`: UInt = 20480u;
public typealias `NS_CMD_FLAGS` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NS_CONTEXT_ATTRIBUTES` (
    public var `Anonymous`: `NS_CONTEXT_ATTRIBUTES_0`,
    public var `pwszContext`: `windows_sys`.`core`.`PWSTR`,
    public var `guidHelper`: `windows_sys`.`core`.`GUID`,
    public var `dwFlags`: UInt,
    public var `ulPriority`: UInt,
    public var `ulNumTopCmds`: UInt,
    public var `pTopCmds`: /* Rust *mut */ kotlinx.cinterop.CPointer<`CMD_ENTRY`>?,
    public var `ulNumGroups`: UInt,
    public var `pCmdGroups`: /* Rust *mut */ kotlinx.cinterop.CPointer<`CMD_GROUP_ENTRY`>?,
    public var `pfnCommitFn`: `PNS_CONTEXT_COMMIT_FN`,
    public var `pfnDumpFn`: `PNS_CONTEXT_DUMP_FN`,
    public var `pfnConnectFn`: `PNS_CONTEXT_CONNECT_FN`,
    public var `pReserved`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `pfnOsVersionCheck`: `PNS_OSVERSIONCHECK`,
)
// UNSUPPORTED Rust 102:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NS_CONTEXT_ATTRIBUTES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 107:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NS_CONTEXT_ATTRIBUTES_0 {
//     pub Anonymous: NS_CONTEXT_ATTRIBUTES_0_0,
//     pub _ullAlign: u64,
// }

// UNSUPPORTED Rust 113:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NS_CONTEXT_ATTRIBUTES_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NS_CONTEXT_ATTRIBUTES_0_0` (
    public var `dwVersion`: UInt,
    public var `dwReserved`: UInt,
)
public typealias `NS_EVENTS` = Int;
public const val `NS_EVENT_FROM_N`: `NS_EVENTS` = 4;
public const val `NS_EVENT_FROM_START`: `NS_EVENTS` = 8;
public const val `NS_EVENT_LAST_N`: `NS_EVENTS` = 1;
public const val `NS_EVENT_LAST_SECS`: `NS_EVENTS` = 2;
public const val `NS_EVENT_LOOP`: `NS_EVENTS` = 65536;
// UNSUPPORTED Rust 130:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const NS_GET_EVENT_IDS_FN_NAME: windows_sys::core::PCSTR = windows_sys::core::s!("GetEventIds");

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NS_HELPER_ATTRIBUTES` (
    public var `Anonymous`: `NS_HELPER_ATTRIBUTES_0`,
    public var `guidHelper`: `windows_sys`.`core`.`GUID`,
    public var `pfnStart`: `PNS_HELPER_START_FN`,
    public var `pfnStop`: `PNS_HELPER_STOP_FN`,
)
// UNSUPPORTED Rust 139:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NS_HELPER_ATTRIBUTES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 144:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NS_HELPER_ATTRIBUTES_0 {
//     pub Anonymous: NS_HELPER_ATTRIBUTES_0_0,
//     pub _ullAlign: u64,
// }

// UNSUPPORTED Rust 150:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NS_HELPER_ATTRIBUTES_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NS_HELPER_ATTRIBUTES_0_0` (
    public var `dwVersion`: UInt,
    public var `dwReserved`: UInt,
)
public typealias `NS_MODE_CHANGE` = Int;
public typealias `NS_REQS` = Int;
public const val `NS_REQ_ALLOW_MULTIPLE`: `NS_REQS` = 2;
public const val `NS_REQ_ONE_OR_MORE`: `NS_REQS` = 3;
public const val `NS_REQ_PRESENT`: `NS_REQS` = 1;
public const val `NS_REQ_ZERO`: `NS_REQS` = 0;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_CUSTOM_HELP` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, `windows_sys`.`core`.`PCWSTR`) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_HANDLE_CMD` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?, UInt, UInt, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PGET_RESOURCE_STRING_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, `windows_sys`.`core`.`PCWSTR`, UInt) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PNS_CONTEXT_COMMIT_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PNS_CONTEXT_CONNECT_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PNS_CONTEXT_DUMP_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCWSTR`>?, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PNS_DLL_INIT_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PNS_DLL_STOP_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PNS_HELPER_START_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, UInt) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PNS_HELPER_STOP_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PNS_OSVERSIONCHECK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, UInt, `windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PCWSTR`, UInt, UInt) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TAG_TYPE` (
    public var `pwszTag`: `windows_sys`.`core`.`PCWSTR`,
    public var `dwRequired`: UInt,
    public var `bPresent`: `windows_sys`.`core`.`BOOL`,
)
// UNSUPPORTED Rust 185:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TAG_TYPE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TOKEN_VALUE` (
    public var `pwszToken`: `windows_sys`.`core`.`PCWSTR`,
    public var `dwValue`: UInt,
)
// UNSUPPORTED Rust 196:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TOKEN_VALUE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

