// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn OperationEnd(operationendparams : *const OPERATION_END_PARAMETERS) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn OperationStart(operationstartparams : *const OPERATION_START_PARAMETERS) -> windows_sys::core::BOOL);

public const val `OPERATION_END_DISCARD`: `OPERATION_END_PARAMETERS_FLAGS` = 1u;
// UNSUPPORTED Rust 4:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct OPERATION_END_PARAMETERS {
//     pub Version: u32,
//     pub OperationId: u32,
//     pub Flags: OPERATION_END_PARAMETERS_FLAGS,
// }

public typealias `OPERATION_END_PARAMETERS_FLAGS` = UInt;
public typealias `OPERATION_START_FLAGS` = UInt;
// UNSUPPORTED Rust 13:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct OPERATION_START_PARAMETERS {
//     pub Version: u32,
//     pub OperationId: u32,
//     pub Flags: OPERATION_START_FLAGS,
// }

public const val `OPERATION_START_TRACE_CURRENT_THREAD`: `OPERATION_START_FLAGS` = 1u;
