// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// windows_link::link!("ntdll.dll" "system" fn RtlDrainNonVolatileFlush(nvtoken : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// windows_link::link!("ntdll.dll" "system" fn RtlFillNonVolatileMemory(nvtoken : *const core::ffi::c_void, nvdestination : *mut core::ffi::c_void, size : usize, value : u8, flags : u32) -> u32);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// windows_link::link!("ntdll.dll" "system" fn RtlFlushNonVolatileMemory(nvtoken : *const core::ffi::c_void, nvbuffer : *const core::ffi::c_void, size : usize, flags : u32) -> u32);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// windows_link::link!("ntdll.dll" "system" fn RtlFlushNonVolatileMemoryRanges(nvtoken : *const core::ffi::c_void, nvranges : *const NV_MEMORY_RANGE, numranges : usize, flags : u32) -> u32);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// windows_link::link!("ntdll.dll" "system" fn RtlFreeNonVolatileToken(nvtoken : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// windows_link::link!("ntdll.dll" "system" fn RtlGetNonVolatileToken(nvbuffer : *const core::ffi::c_void, size : usize, nvtoken : *mut *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// windows_link::link!("ntdll.dll" "system" fn RtlWriteNonVolatileMemory(nvtoken : *const core::ffi::c_void, nvdestination : *mut core::ffi::c_void, source : *const core::ffi::c_void, size : usize, flags : u32) -> u32);

// UNSUPPORTED Rust 15:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NV_MEMORY_RANGE {
//     pub BaseAddress: *mut core::ffi::c_void,
//     pub Length: usize,
// }

// UNSUPPORTED Rust 21:1: declaration Impl has no candidate rule
// impl Default for NV_MEMORY_RANGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

