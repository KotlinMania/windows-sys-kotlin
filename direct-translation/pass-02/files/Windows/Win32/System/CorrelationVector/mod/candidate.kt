// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlExtendCorrelationVector(correlationvector : *mut CORRELATION_VECTOR) -> u32);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlIncrementCorrelationVector(correlationvector : *mut CORRELATION_VECTOR) -> u32);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlInitializeCorrelationVector(correlationvector : *mut CORRELATION_VECTOR, version : i32, guid : *const windows_sys::core::GUID) -> u32);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlValidateCorrelationVector(vector : *const CORRELATION_VECTOR) -> u32);

// UNSUPPORTED Rust 5:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CORRELATION_VECTOR {
//     pub Version: i8,
//     pub Vector: [i8; 129],
// }

// UNSUPPORTED Rust 11:1: declaration Impl has no candidate rule
// impl Default for CORRELATION_VECTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `RTL_CORRELATION_VECTOR_STRING_LENGTH`: UInt = 129u;
public const val `RTL_CORRELATION_VECTOR_V1_LENGTH`: UInt = 64u;
public const val `RTL_CORRELATION_VECTOR_V1_PREFIX_LENGTH`: UInt = 16u;
public const val `RTL_CORRELATION_VECTOR_V2_LENGTH`: UInt = 128u;
public const val `RTL_CORRELATION_VECTOR_V2_PREFIX_LENGTH`: UInt = 22u;
