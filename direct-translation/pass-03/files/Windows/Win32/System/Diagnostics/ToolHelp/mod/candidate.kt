// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=CreateToolhelp32Snapshot; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateToolhelp32Snapshot`(`dwflags` : `CREATE_TOOLHELP_SNAPSHOT_FLAGS`, `th32processid` : UInt) : `super`.`super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=Heap32First; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `Heap32First`(`lphe` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HEAPENTRY32`>?, `th32processid` : UInt, `th32heapid` : ULong) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=Heap32ListFirst; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `Heap32ListFirst`(`hsnapshot` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `lphl` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HEAPLIST32`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=Heap32ListNext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `Heap32ListNext`(`hsnapshot` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `lphl` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HEAPLIST32`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=Heap32Next; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `Heap32Next`(`lphe` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HEAPENTRY32`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=Module32First; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `Module32First`(`hsnapshot` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `lpme` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MODULEENTRY32`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=Module32FirstW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `Module32FirstW`(`hsnapshot` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `lpme` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MODULEENTRY32W`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=Module32Next; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `Module32Next`(`hsnapshot` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `lpme` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MODULEENTRY32`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=Module32NextW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `Module32NextW`(`hsnapshot` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `lpme` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MODULEENTRY32W`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=Process32First; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `Process32First`(`hsnapshot` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `lppe` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PROCESSENTRY32`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=Process32FirstW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `Process32FirstW`(`hsnapshot` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `lppe` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PROCESSENTRY32W`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=Process32Next; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `Process32Next`(`hsnapshot` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `lppe` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PROCESSENTRY32`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=Process32NextW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `Process32NextW`(`hsnapshot` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `lppe` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PROCESSENTRY32W`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=Thread32First; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `Thread32First`(`hsnapshot` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `lpte` : /* Rust *mut */ kotlinx.cinterop.CPointer<`THREADENTRY32`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=Thread32Next; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `Thread32Next`(`hsnapshot` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `lpte` : /* Rust *mut */ kotlinx.cinterop.CPointer<`THREADENTRY32`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=Toolhelp32ReadProcessMemory; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `Toolhelp32ReadProcessMemory`(`th32processid` : UInt, `lpbaseaddress` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbread` : ULong, `lpnumberofbytesread` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `windows_sys`.`core`.`BOOL`
public typealias `CREATE_TOOLHELP_SNAPSHOT_FLAGS` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HEAPENTRY32` (
    public var `dwSize`: ULong,
    public var `hHandle`: `super`.`super`.`super`.`Foundation`.`HANDLE`,
    public var `dwAddress`: ULong,
    public var `dwBlockSize`: ULong,
    public var `dwFlags`: `HEAPENTRY32_FLAGS`,
    public var `dwLockCount`: UInt,
    public var `dwResvd`: UInt,
    public var `th32ProcessID`: UInt,
    public var `th32HeapID`: ULong,
)
// UNSUPPORTED Rust 31:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HEAPENTRY32 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `HEAPENTRY32_FLAGS` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HEAPLIST32` (
    public var `dwSize`: ULong,
    public var `th32ProcessID`: UInt,
    public var `th32HeapID`: ULong,
    public var `dwFlags`: UInt,
)
public const val `HF32_DEFAULT`: UInt = 1u;
public const val `HF32_SHARED`: UInt = 2u;
public const val `LF32_FIXED`: `HEAPENTRY32_FLAGS` = 1u;
public const val `LF32_FREE`: `HEAPENTRY32_FLAGS` = 2u;
public const val `LF32_MOVEABLE`: `HEAPENTRY32_FLAGS` = 4u;
public const val `MAX_MODULE_NAME32`: UInt = 255u;
// UNSUPPORTED Rust 51:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MODULEENTRY32 {
//     pub dwSize: u32,
//     pub th32ModuleID: u32,
//     pub th32ProcessID: u32,
//     pub GlblcntUsage: u32,
//     pub ProccntUsage: u32,
//     pub modBaseAddr: *mut u8,
//     pub modBaseSize: u32,
//     pub hModule: super::super::super::Foundation::HMODULE,
//     pub szModule: [i8; 256],
//     pub szExePath: [i8; 260],
// }

// UNSUPPORTED Rust 65:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MODULEENTRY32 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 70:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MODULEENTRY32W {
//     pub dwSize: u32,
//     pub th32ModuleID: u32,
//     pub th32ProcessID: u32,
//     pub GlblcntUsage: u32,
//     pub ProccntUsage: u32,
//     pub modBaseAddr: *mut u8,
//     pub modBaseSize: u32,
//     pub hModule: super::super::super::Foundation::HMODULE,
//     pub szModule: [u16; 256],
//     pub szExePath: [u16; 260],
// }

// UNSUPPORTED Rust 84:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MODULEENTRY32W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 89:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PROCESSENTRY32 {
//     pub dwSize: u32,
//     pub cntUsage: u32,
//     pub th32ProcessID: u32,
//     pub th32DefaultHeapID: usize,
//     pub th32ModuleID: u32,
//     pub cntThreads: u32,
//     pub th32ParentProcessID: u32,
//     pub pcPriClassBase: i32,
//     pub dwFlags: u32,
//     pub szExeFile: [i8; 260],
// }

// UNSUPPORTED Rust 103:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROCESSENTRY32 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 108:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PROCESSENTRY32W {
//     pub dwSize: u32,
//     pub cntUsage: u32,
//     pub th32ProcessID: u32,
//     pub th32DefaultHeapID: usize,
//     pub th32ModuleID: u32,
//     pub cntThreads: u32,
//     pub th32ParentProcessID: u32,
//     pub pcPriClassBase: i32,
//     pub dwFlags: u32,
//     pub szExeFile: [u16; 260],
// }

// UNSUPPORTED Rust 122:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROCESSENTRY32W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `TH32CS_INHERIT`: `CREATE_TOOLHELP_SNAPSHOT_FLAGS` = 2147483648u;
public const val `TH32CS_SNAPALL`: `CREATE_TOOLHELP_SNAPSHOT_FLAGS` = 15u;
public const val `TH32CS_SNAPHEAPLIST`: `CREATE_TOOLHELP_SNAPSHOT_FLAGS` = 1u;
public const val `TH32CS_SNAPMODULE`: `CREATE_TOOLHELP_SNAPSHOT_FLAGS` = 8u;
public const val `TH32CS_SNAPMODULE32`: `CREATE_TOOLHELP_SNAPSHOT_FLAGS` = 16u;
public const val `TH32CS_SNAPPROCESS`: `CREATE_TOOLHELP_SNAPSHOT_FLAGS` = 2u;
public const val `TH32CS_SNAPTHREAD`: `CREATE_TOOLHELP_SNAPSHOT_FLAGS` = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `THREADENTRY32` (
    public var `dwSize`: UInt,
    public var `cntUsage`: UInt,
    public var `th32ThreadID`: UInt,
    public var `th32OwnerProcessID`: UInt,
    public var `tpBasePri`: Int,
    public var `tpDeltaPri`: Int,
    public var `dwFlags`: UInt,
)
