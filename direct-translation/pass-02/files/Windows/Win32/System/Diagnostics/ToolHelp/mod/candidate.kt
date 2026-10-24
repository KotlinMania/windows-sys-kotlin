// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn CreateToolhelp32Snapshot(dwflags : CREATE_TOOLHELP_SNAPSHOT_FLAGS, th32processid : u32) -> super::super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn Heap32First(lphe : *mut HEAPENTRY32, th32processid : u32, th32heapid : usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn Heap32ListFirst(hsnapshot : super::super::super::Foundation:: HANDLE, lphl : *mut HEAPLIST32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn Heap32ListNext(hsnapshot : super::super::super::Foundation:: HANDLE, lphl : *mut HEAPLIST32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn Heap32Next(lphe : *mut HEAPENTRY32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn Module32First(hsnapshot : super::super::super::Foundation:: HANDLE, lpme : *mut MODULEENTRY32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn Module32FirstW(hsnapshot : super::super::super::Foundation:: HANDLE, lpme : *mut MODULEENTRY32W) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn Module32Next(hsnapshot : super::super::super::Foundation:: HANDLE, lpme : *mut MODULEENTRY32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn Module32NextW(hsnapshot : super::super::super::Foundation:: HANDLE, lpme : *mut MODULEENTRY32W) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn Process32First(hsnapshot : super::super::super::Foundation:: HANDLE, lppe : *mut PROCESSENTRY32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn Process32FirstW(hsnapshot : super::super::super::Foundation:: HANDLE, lppe : *mut PROCESSENTRY32W) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn Process32Next(hsnapshot : super::super::super::Foundation:: HANDLE, lppe : *mut PROCESSENTRY32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn Process32NextW(hsnapshot : super::super::super::Foundation:: HANDLE, lppe : *mut PROCESSENTRY32W) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn Thread32First(hsnapshot : super::super::super::Foundation:: HANDLE, lpte : *mut THREADENTRY32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn Thread32Next(hsnapshot : super::super::super::Foundation:: HANDLE, lpte : *mut THREADENTRY32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn Toolhelp32ReadProcessMemory(th32processid : u32, lpbaseaddress : *const core::ffi::c_void, lpbuffer : *mut core::ffi::c_void, cbread : usize, lpnumberofbytesread : *mut usize) -> windows_sys::core::BOOL);

public typealias `CREATE_TOOLHELP_SNAPSHOT_FLAGS` = UInt;
// UNSUPPORTED Rust 18:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct HEAPENTRY32 {
//     pub dwSize: usize,
//     pub hHandle: super::super::super::Foundation::HANDLE,
//     pub dwAddress: usize,
//     pub dwBlockSize: usize,
//     pub dwFlags: HEAPENTRY32_FLAGS,
//     pub dwLockCount: u32,
//     pub dwResvd: u32,
//     pub th32ProcessID: u32,
//     pub th32HeapID: usize,
// }

// UNSUPPORTED Rust 31:1: declaration Impl has no candidate rule
// impl Default for HEAPENTRY32 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `HEAPENTRY32_FLAGS` = UInt;
// UNSUPPORTED Rust 37:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct HEAPLIST32 {
//     pub dwSize: usize,
//     pub th32ProcessID: u32,
//     pub th32HeapID: usize,
//     pub dwFlags: u32,
// }

public const val `HF32_DEFAULT`: UInt = 1u;
public const val `HF32_SHARED`: UInt = 2u;
public const val `LF32_FIXED`: `HEAPENTRY32_FLAGS` = 1u;
public const val `LF32_FREE`: `HEAPENTRY32_FLAGS` = 2u;
public const val `LF32_MOVEABLE`: `HEAPENTRY32_FLAGS` = 4u;
public const val `MAX_MODULE_NAME32`: UInt = 255u;
// UNSUPPORTED Rust 51:1: declaration Struct has no candidate rule
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

// UNSUPPORTED Rust 65:1: declaration Impl has no candidate rule
// impl Default for MODULEENTRY32 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 70:1: declaration Struct has no candidate rule
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

// UNSUPPORTED Rust 84:1: declaration Impl has no candidate rule
// impl Default for MODULEENTRY32W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 89:1: declaration Struct has no candidate rule
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

// UNSUPPORTED Rust 103:1: declaration Impl has no candidate rule
// impl Default for PROCESSENTRY32 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 108:1: declaration Struct has no candidate rule
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

// UNSUPPORTED Rust 122:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 134:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct THREADENTRY32 {
//     pub dwSize: u32,
//     pub cntUsage: u32,
//     pub th32ThreadID: u32,
//     pub th32OwnerProcessID: u32,
//     pub tpBasePri: i32,
//     pub tpDeltaPri: i32,
//     pub dwFlags: u32,
// }

