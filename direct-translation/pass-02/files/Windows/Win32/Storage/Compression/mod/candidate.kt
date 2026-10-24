// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("cabinet.dll" "system" fn CloseCompressor(compressorhandle : COMPRESSOR_HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("cabinet.dll" "system" fn CloseDecompressor(decompressorhandle : DECOMPRESSOR_HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("cabinet.dll" "system" fn Compress(compressorhandle : COMPRESSOR_HANDLE, uncompresseddata : *const core::ffi::c_void, uncompresseddatasize : usize, compressedbuffer : *mut core::ffi::c_void, compressedbuffersize : usize, compresseddatasize : *mut usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("cabinet.dll" "system" fn CreateCompressor(algorithm : COMPRESS_ALGORITHM, allocationroutines : *const COMPRESS_ALLOCATION_ROUTINES, compressorhandle : *mut COMPRESSOR_HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("cabinet.dll" "system" fn CreateDecompressor(algorithm : COMPRESS_ALGORITHM, allocationroutines : *const COMPRESS_ALLOCATION_ROUTINES, decompressorhandle : *mut DECOMPRESSOR_HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("cabinet.dll" "system" fn Decompress(decompressorhandle : DECOMPRESSOR_HANDLE, compresseddata : *const core::ffi::c_void, compresseddatasize : usize, uncompressedbuffer : *mut core::ffi::c_void, uncompressedbuffersize : usize, uncompresseddatasize : *mut usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("cabinet.dll" "system" fn QueryCompressorInformation(compressorhandle : COMPRESSOR_HANDLE, compressinformationclass : COMPRESS_INFORMATION_CLASS, compressinformation : *mut core::ffi::c_void, compressinformationsize : usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("cabinet.dll" "system" fn QueryDecompressorInformation(decompressorhandle : DECOMPRESSOR_HANDLE, compressinformationclass : COMPRESS_INFORMATION_CLASS, compressinformation : *mut core::ffi::c_void, compressinformationsize : usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("cabinet.dll" "system" fn ResetCompressor(compressorhandle : COMPRESSOR_HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("cabinet.dll" "system" fn ResetDecompressor(decompressorhandle : DECOMPRESSOR_HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("cabinet.dll" "system" fn SetCompressorInformation(compressorhandle : COMPRESSOR_HANDLE, compressinformationclass : COMPRESS_INFORMATION_CLASS, compressinformation : *const core::ffi::c_void, compressinformationsize : usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// windows_link::link!("cabinet.dll" "system" fn SetDecompressorInformation(decompressorhandle : DECOMPRESSOR_HANDLE, compressinformationclass : COMPRESS_INFORMATION_CLASS, compressinformation : *const core::ffi::c_void, compressinformationsize : usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 13:1: non-scalar type Ptr unsupported
// pub type COMPRESSOR_HANDLE = *mut core::ffi::c_void;

public typealias `COMPRESS_ALGORITHM` = UInt;
public const val `COMPRESS_ALGORITHM_INVALID`: UInt = 0u;
public const val `COMPRESS_ALGORITHM_LZMS`: `COMPRESS_ALGORITHM` = 5u;
public const val `COMPRESS_ALGORITHM_MAX`: UInt = 6u;
public const val `COMPRESS_ALGORITHM_MSZIP`: `COMPRESS_ALGORITHM` = 2u;
public const val `COMPRESS_ALGORITHM_NULL`: UInt = 1u;
public const val `COMPRESS_ALGORITHM_XPRESS`: `COMPRESS_ALGORITHM` = 3u;
public const val `COMPRESS_ALGORITHM_XPRESS_HUFF`: `COMPRESS_ALGORITHM` = 4u;
// UNSUPPORTED Rust 22:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct COMPRESS_ALLOCATION_ROUTINES {
//     pub Allocate: PFN_COMPRESS_ALLOCATE,
//     pub Free: PFN_COMPRESS_FREE,
//     pub UserContext: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 29:1: declaration Impl has no candidate rule
// impl Default for COMPRESS_ALLOCATION_ROUTINES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `COMPRESS_INFORMATION_CLASS` = Int;
public const val `COMPRESS_INFORMATION_CLASS_BLOCK_SIZE`: `COMPRESS_INFORMATION_CLASS` = 1;
public const val `COMPRESS_INFORMATION_CLASS_INVALID`: `COMPRESS_INFORMATION_CLASS` = 0;
public const val `COMPRESS_INFORMATION_CLASS_LEVEL`: `COMPRESS_INFORMATION_CLASS` = 2;
public const val `COMPRESS_RAW`: UInt = 536870912u;
// UNSUPPORTED Rust 39:1: non-scalar type Ptr unsupported
// pub type DECOMPRESSOR_HANDLE = *mut core::ffi::c_void;

// UNSUPPORTED Rust 40:1: generic scalar type unsupported
// pub type PFN_COMPRESS_ALLOCATE = Option<unsafe extern "system" fn(usercontext: *const core::ffi::c_void, size: usize) -> *mut core::ffi::c_void>;

// UNSUPPORTED Rust 41:1: generic scalar type unsupported
// pub type PFN_COMPRESS_FREE = Option<unsafe extern "system" fn(usercontext: *const core::ffi::c_void, memory: *const core::ffi::c_void)>;

