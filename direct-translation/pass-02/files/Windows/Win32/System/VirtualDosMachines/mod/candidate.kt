// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
public const val `DBG_ATTACH`: UInt = 14u;
public const val `DBG_BREAK`: UInt = 6u;
public const val `DBG_DIVOVERFLOW`: UInt = 8u;
public const val `DBG_DLLSTART`: UInt = 12u;
public const val `DBG_DLLSTOP`: UInt = 13u;
public const val `DBG_GPFAULT`: UInt = 7u;
public const val `DBG_GPFAULT2`: UInt = 21u;
public const val `DBG_INIT`: UInt = 20u;
public const val `DBG_INSTRFAULT`: UInt = 9u;
public const val `DBG_MODFREE`: UInt = 4u;
public const val `DBG_MODLOAD`: UInt = 3u;
public const val `DBG_MODMOVE`: UInt = 19u;
public const val `DBG_SEGFREE`: UInt = 2u;
public const val `DBG_SEGLOAD`: UInt = 0u;
public const val `DBG_SEGMOVE`: UInt = 1u;
public const val `DBG_SINGLESTEP`: UInt = 5u;
public const val `DBG_STACKFAULT`: UInt = 16u;
public const val `DBG_TASKSTART`: UInt = 10u;
public const val `DBG_TASKSTOP`: UInt = 11u;
public const val `DBG_TEMPBP`: UInt = 18u;
public const val `DBG_TOOLHELP`: UInt = 15u;
public const val `DBG_WOWINIT`: UInt = 17u;
// UNSUPPORTED Rust 23:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Win32_System_Diagnostics_Debug", feature = "Win32_System_Threading"))]
// pub type DEBUGEVENTPROC = Option<unsafe extern "system" fn(param0: *mut super::Diagnostics::Debug::DEBUG_EVENT, param1: *mut core::ffi::c_void) -> u32>;

public const val `GD_ACCELERATORS`: UInt = 9u;
public const val `GD_BITMAP`: UInt = 2u;
public const val `GD_CURSOR`: UInt = 12u;
public const val `GD_CURSORCOMPONENT`: UInt = 1u;
public const val `GD_DIALOG`: UInt = 5u;
public const val `GD_ERRTABLE`: UInt = 11u;
public const val `GD_FONT`: UInt = 8u;
public const val `GD_FONTDIR`: UInt = 7u;
public const val `GD_ICON`: UInt = 14u;
public const val `GD_ICONCOMPONENT`: UInt = 3u;
public const val `GD_MAX_RESOURCE`: UInt = 15u;
public const val `GD_MENU`: UInt = 4u;
public const val `GD_NAMETABLE`: UInt = 15u;
public const val `GD_RCDATA`: UInt = 10u;
public const val `GD_STRING`: UInt = 6u;
public const val `GD_USERDEFINED`: UInt = 0u;
// UNSUPPORTED Rust 41:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[derive(Clone, Copy)]
// pub struct GLOBALENTRY {
//     pub dwSize: u32,
//     pub dwAddress: u32,
//     pub dwBlockSize: u32,
//     pub hBlock: super::super::Foundation::HANDLE,
//     pub wcLock: u16,
//     pub wcPageLock: u16,
//     pub wFlags: u16,
//     pub wHeapPresent: windows_sys::core::BOOL,
//     pub hOwner: super::super::Foundation::HANDLE,
//     pub wType: u16,
//     pub wData: u16,
//     pub dwNext: u32,
//     pub dwNextAlt: u32,
// }

// UNSUPPORTED Rust 58:1: declaration Impl has no candidate rule
// impl Default for GLOBALENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `GLOBAL_ALL`: UInt = 0u;
public const val `GLOBAL_FREE`: UInt = 2u;
public const val `GLOBAL_LRU`: UInt = 1u;
public const val `GT_BURGERMASTER`: UInt = 10u;
public const val `GT_CODE`: UInt = 3u;
public const val `GT_DATA`: UInt = 2u;
public const val `GT_DGROUP`: UInt = 1u;
public const val `GT_FREE`: UInt = 7u;
public const val `GT_INTERNAL`: UInt = 8u;
public const val `GT_MODULE`: UInt = 6u;
public const val `GT_RESOURCE`: UInt = 5u;
public const val `GT_SENTINEL`: UInt = 9u;
public const val `GT_TASK`: UInt = 4u;
public const val `GT_UNKNOWN`: UInt = 0u;
// UNSUPPORTED Rust 77:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IMAGE_NOTE {
//     pub Module: [i8; 10],
//     pub FileName: [i8; 256],
//     pub hModule: u16,
//     pub hTask: u16,
// }

// UNSUPPORTED Rust 85:1: declaration Impl has no candidate rule
// impl Default for IMAGE_NOTE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MAX_MODULE_NAME`: UInt = 9u;
public const val `MAX_PATH16`: UInt = 255u;
// UNSUPPORTED Rust 92:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[derive(Clone, Copy)]
// pub struct MODULEENTRY {
//     pub dwSize: u32,
//     pub szModule: [i8; 10],
//     pub hModule: super::super::Foundation::HANDLE,
//     pub wcUsage: u16,
//     pub szExePath: [i8; 256],
//     pub wNext: u16,
// }

// UNSUPPORTED Rust 102:1: declaration Impl has no candidate rule
// impl Default for MODULEENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 107:1: generic scalar type unsupported
// pub type PROCESSENUMPROC = Option<unsafe extern "system" fn(dwprocessid: u32, dwattributes: u32, lpuserdefined: super::super::Foundation::LPARAM) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 108:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SEGMENT_NOTE {
//     pub Selector1: u16,
//     pub Selector2: u16,
//     pub Segment: u16,
//     pub Module: [i8; 10],
//     pub FileName: [i8; 256],
//     pub Type: u16,
//     pub Length: u32,
// }

// UNSUPPORTED Rust 119:1: declaration Impl has no candidate rule
// impl Default for SEGMENT_NOTE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SN_CODE`: UInt = 0u;
public const val `SN_DATA`: UInt = 1u;
public const val `SN_V86`: UInt = 2u;
public const val `STATUS_VDM_EVENT`: Int = 1073741829;
// UNSUPPORTED Rust 128:1: generic scalar type unsupported
// pub type TASKENUMPROC = Option<unsafe extern "system" fn(dwthreadid: u32, hmod16: u16, htask16: u16, lpuserdefined: super::super::Foundation::LPARAM) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 129:1: generic scalar type unsupported
// pub type TASKENUMPROCEX = Option<unsafe extern "system" fn(dwthreadid: u32, hmod16: u16, htask16: u16, pszmodname: *mut i8, pszfilename: *mut i8, lpuserdefined: super::super::Foundation::LPARAM) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 130:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TEMP_BP_NOTE {
//     pub Seg: u16,
//     pub Offset: u32,
//     pub bPM: windows_sys::core::BOOL,
// }

public const val `V86FLAGS_ALIGNMENT`: UInt = 262144u;
public const val `V86FLAGS_AUXCARRY`: UInt = 16u;
public const val `V86FLAGS_CARRY`: UInt = 1u;
public const val `V86FLAGS_DIRECTION`: UInt = 1024u;
public const val `V86FLAGS_INTERRUPT`: UInt = 512u;
public const val `V86FLAGS_IOPL`: UInt = 12288u;
public const val `V86FLAGS_IOPL_BITS`: UInt = 18u;
public const val `V86FLAGS_OVERFLOW`: UInt = 2048u;
public const val `V86FLAGS_PARITY`: UInt = 4u;
public const val `V86FLAGS_RESUME`: UInt = 65536u;
public const val `V86FLAGS_SIGN`: UInt = 128u;
public const val `V86FLAGS_TRACE`: UInt = 256u;
public const val `V86FLAGS_V86`: UInt = 131072u;
public const val `V86FLAGS_ZERO`: UInt = 64u;
public const val `VDMADDR_PM16`: UInt = 4u;
public const val `VDMADDR_PM32`: UInt = 16u;
public const val `VDMADDR_V86`: UInt = 2u;
// UNSUPPORTED Rust 154:1: generic scalar type unsupported
// pub type VDMBREAKTHREADPROC = Option<unsafe extern "system" fn(param0: super::super::Foundation::HANDLE) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 155:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[cfg(feature = "Win32_System_Kernel")]
// #[derive(Clone, Copy)]
// pub struct VDMCONTEXT {
//     pub ContextFlags: u32,
//     pub Dr0: u32,
//     pub Dr1: u32,
//     pub Dr2: u32,
//     pub Dr3: u32,
//     pub Dr6: u32,
//     pub Dr7: u32,
//     pub FloatSave: super::Kernel::FLOATING_SAVE_AREA,
//     pub SegGs: u32,
//     pub SegFs: u32,
//     pub SegEs: u32,
//     pub SegDs: u32,
//     pub Edi: u32,
//     pub Esi: u32,
//     pub Ebx: u32,
//     pub Edx: u32,
//     pub Ecx: u32,
//     pub Eax: u32,
//     pub Ebp: u32,
//     pub Eip: u32,
//     pub SegCs: u32,
//     pub EFlags: u32,
//     pub Esp: u32,
//     pub SegSs: u32,
//     pub ExtendedRegisters: [u8; 512],
// }

// UNSUPPORTED Rust 186:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[cfg(feature = "Win32_System_Kernel")]
// impl Default for VDMCONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 193:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Kernel")]
// #[derive(Clone, Copy, Default)]
// pub struct VDMCONTEXT_WITHOUT_XSAVE {
//     pub ContextFlags: u32,
//     pub Dr0: u32,
//     pub Dr1: u32,
//     pub Dr2: u32,
//     pub Dr3: u32,
//     pub Dr6: u32,
//     pub Dr7: u32,
//     pub FloatSave: super::Kernel::FLOATING_SAVE_AREA,
//     pub SegGs: u32,
//     pub SegFs: u32,
//     pub SegEs: u32,
//     pub SegDs: u32,
//     pub Edi: u32,
//     pub Esi: u32,
//     pub Ebx: u32,
//     pub Edx: u32,
//     pub Ecx: u32,
//     pub Eax: u32,
//     pub Ebp: u32,
//     pub Eip: u32,
//     pub SegCs: u32,
//     pub EFlags: u32,
//     pub Esp: u32,
//     pub SegSs: u32,
// }

public const val `VDMCONTEXT_i386`: UInt = 65536u;
public const val `VDMCONTEXT_i486`: UInt = 65536u;
public const val `VDMDBG_BREAK_DEBUGGER`: UInt = 16u;
public const val `VDMDBG_BREAK_DIVIDEBYZERO`: UInt = 256u;
public const val `VDMDBG_BREAK_DOSTASK`: UInt = 1u;
public const val `VDMDBG_BREAK_EXCEPTIONS`: UInt = 8u;
public const val `VDMDBG_BREAK_LOADDLL`: UInt = 4u;
public const val `VDMDBG_BREAK_WOWTASK`: UInt = 2u;
public const val `VDMDBG_INITIAL_FLAGS`: UInt = 256u;
public const val `VDMDBG_MAX_SYMBOL_BUFFER`: UInt = 256u;
public const val `VDMDBG_TRACE_HISTORY`: UInt = 128u;
// UNSUPPORTED Rust 233:1: generic scalar type unsupported
// pub type VDMDETECTWOWPROC = Option<unsafe extern "system" fn() -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 234:1: generic scalar type unsupported
// pub type VDMENUMPROCESSWOWPROC = Option<unsafe extern "system" fn(param0: PROCESSENUMPROC, param1: super::super::Foundation::LPARAM) -> i32>;

// UNSUPPORTED Rust 235:1: generic scalar type unsupported
// pub type VDMENUMTASKWOWEXPROC = Option<unsafe extern "system" fn(param0: u32, param1: TASKENUMPROCEX, param2: super::super::Foundation::LPARAM) -> i32>;

// UNSUPPORTED Rust 236:1: generic scalar type unsupported
// pub type VDMENUMTASKWOWPROC = Option<unsafe extern "system" fn(param0: u32, param1: TASKENUMPROC, param2: super::super::Foundation::LPARAM) -> i32>;

public const val `VDMEVENT_ALLFLAGS`: UInt = 57344u;
public const val `VDMEVENT_NEEDS_INTERACTIVE`: UInt = 32768u;
public const val `VDMEVENT_PE`: UInt = 8192u;
public const val `VDMEVENT_PM16`: UInt = 2u;
public const val `VDMEVENT_V86`: UInt = 1u;
public const val `VDMEVENT_VERBOSE`: UInt = 16384u;
// UNSUPPORTED Rust 243:1: generic scalar type unsupported
// pub type VDMGETADDREXPRESSIONPROC = Option<unsafe extern "system" fn(param0: windows_sys::core::PCSTR, param1: windows_sys::core::PCSTR, param2: *mut u16, param3: *mut u32, param4: *mut u16) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 244:1: attribute cfg requires explicit semantics/configuration
// #[cfg(target_arch = "x86")]
// #[cfg(all(feature = "Win32_System_Diagnostics_Debug", feature = "Win32_System_Kernel"))]
// pub type VDMGETCONTEXTPROC = Option<unsafe extern "system" fn(param0: super::super::Foundation::HANDLE, param1: super::super::Foundation::HANDLE, param2: *mut super::Diagnostics::Debug::CONTEXT) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 247:1: attribute cfg requires explicit semantics/configuration
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[cfg(feature = "Win32_System_Kernel")]
// pub type VDMGETCONTEXTPROC = Option<unsafe extern "system" fn(param0: super::super::Foundation::HANDLE, param1: super::super::Foundation::HANDLE, param2: *mut VDMCONTEXT) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 250:1: generic scalar type unsupported
// pub type VDMGETDBGFLAGSPROC = Option<unsafe extern "system" fn(param0: super::super::Foundation::HANDLE) -> u32>;

// UNSUPPORTED Rust 251:1: generic scalar type unsupported
// pub type VDMGETMODULESELECTORPROC = Option<unsafe extern "system" fn(param0: super::super::Foundation::HANDLE, param1: super::super::Foundation::HANDLE, param2: u32, param3: windows_sys::core::PCSTR, param4: *mut u16) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 252:1: generic scalar type unsupported
// pub type VDMGETPOINTERPROC = Option<unsafe extern "system" fn(param0: super::super::Foundation::HANDLE, param1: super::super::Foundation::HANDLE, param2: u16, param3: u32, param4: windows_sys::core::BOOL) -> u32>;

// UNSUPPORTED Rust 253:1: generic scalar type unsupported
// pub type VDMGETSEGMENTINFOPROC = Option<unsafe extern "system" fn(param0: u16, param1: u32, param2: windows_sys::core::BOOL, param3: VDM_SEGINFO) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 254:1: generic scalar type unsupported
// pub type VDMGETSELECTORMODULEPROC = Option<unsafe extern "system" fn(param0: super::super::Foundation::HANDLE, param1: super::super::Foundation::HANDLE, param2: u16, param3: *mut u32, param4: windows_sys::core::PCSTR, param5: u32, param6: windows_sys::core::PCSTR, param7: u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 255:1: generic scalar type unsupported
// pub type VDMGETSYMBOLPROC = Option<unsafe extern "system" fn(param0: windows_sys::core::PCSTR, param1: u16, param2: u32, param3: windows_sys::core::BOOL, param4: windows_sys::core::BOOL, param5: windows_sys::core::PSTR, param6: *mut u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 256:1: attribute cfg requires explicit semantics/configuration
// #[cfg(target_arch = "x86")]
// #[cfg(feature = "Win32_System_Diagnostics_Debug")]
// pub type VDMGETTHREADSELECTORENTRYPROC = Option<unsafe extern "system" fn(param0: super::super::Foundation::HANDLE, param1: super::super::Foundation::HANDLE, param2: u32, param3: *mut super::Diagnostics::Debug::LDT_ENTRY) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 259:1: attribute cfg requires explicit semantics/configuration
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// pub type VDMGETTHREADSELECTORENTRYPROC = Option<unsafe extern "system" fn(param0: super::super::Foundation::HANDLE, param1: super::super::Foundation::HANDLE, param2: u32, param3: *mut VDMLDT_ENTRY) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 261:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Win32_System_Diagnostics_Debug", feature = "Win32_System_Threading"))]
// pub type VDMGLOBALFIRSTPROC = Option<unsafe extern "system" fn(param0: super::super::Foundation::HANDLE, param1: super::super::Foundation::HANDLE, param2: *mut GLOBALENTRY, param3: u16, param4: DEBUGEVENTPROC, param5: *mut core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 263:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Win32_System_Diagnostics_Debug", feature = "Win32_System_Threading"))]
// pub type VDMGLOBALNEXTPROC = Option<unsafe extern "system" fn(param0: super::super::Foundation::HANDLE, param1: super::super::Foundation::HANDLE, param2: *mut GLOBALENTRY, param3: u16, param4: DEBUGEVENTPROC, param5: *mut core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 265:1: generic scalar type unsupported
// pub type VDMISMODULELOADEDPROC = Option<unsafe extern "system" fn(param0: windows_sys::core::PCSTR) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 266:1: generic scalar type unsupported
// pub type VDMKILLWOWPROC = Option<unsafe extern "system" fn() -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 267:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct VDMLDT_ENTRY {
//     pub LimitLow: u16,
//     pub BaseLow: u16,
//     pub HighWord: VDMLDT_ENTRY_0,
// }

// UNSUPPORTED Rust 275:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for VDMLDT_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 281:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub union VDMLDT_ENTRY_0 {
//     pub Bytes: VDMLDT_ENTRY_0_0,
//     pub Bits: VDMLDT_ENTRY_0_1,
// }

// UNSUPPORTED Rust 288:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for VDMLDT_ENTRY_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 294:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy, Default)]
// pub struct VDMLDT_ENTRY_0_1 {
//     pub _bitfield: u32,
// }

// UNSUPPORTED Rust 300:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy, Default)]
// pub struct VDMLDT_ENTRY_0_0 {
//     pub BaseMid: u8,
//     pub Flags1: u8,
//     pub Flags2: u8,
//     pub BaseHi: u8,
// }

// UNSUPPORTED Rust 309:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Win32_System_Diagnostics_Debug", feature = "Win32_System_Threading"))]
// pub type VDMMODULEFIRSTPROC = Option<unsafe extern "system" fn(param0: super::super::Foundation::HANDLE, param1: super::super::Foundation::HANDLE, param2: *mut MODULEENTRY, param3: DEBUGEVENTPROC, param4: *mut core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 311:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Win32_System_Diagnostics_Debug", feature = "Win32_System_Threading"))]
// pub type VDMMODULENEXTPROC = Option<unsafe extern "system" fn(param0: super::super::Foundation::HANDLE, param1: super::super::Foundation::HANDLE, param2: *mut MODULEENTRY, param3: DEBUGEVENTPROC, param4: *mut core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 313:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Win32_System_Diagnostics_Debug", feature = "Win32_System_Threading"))]
// pub type VDMPROCESSEXCEPTIONPROC = Option<unsafe extern "system" fn(param0: *mut super::Diagnostics::Debug::DEBUG_EVENT) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 315:1: attribute cfg requires explicit semantics/configuration
// #[cfg(target_arch = "x86")]
// #[cfg(all(feature = "Win32_System_Diagnostics_Debug", feature = "Win32_System_Kernel"))]
// pub type VDMSETCONTEXTPROC = Option<unsafe extern "system" fn(param0: super::super::Foundation::HANDLE, param1: super::super::Foundation::HANDLE, param2: *mut super::Diagnostics::Debug::CONTEXT) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 318:1: attribute cfg requires explicit semantics/configuration
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[cfg(feature = "Win32_System_Kernel")]
// pub type VDMSETCONTEXTPROC = Option<unsafe extern "system" fn(param0: super::super::Foundation::HANDLE, param1: super::super::Foundation::HANDLE, param2: *mut VDMCONTEXT) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 321:1: generic scalar type unsupported
// pub type VDMSETDBGFLAGSPROC = Option<unsafe extern "system" fn(param0: super::super::Foundation::HANDLE, param1: u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 322:1: generic scalar type unsupported
// pub type VDMSTARTTASKINWOWPROC = Option<unsafe extern "system" fn(param0: u32, param1: windows_sys::core::PCSTR, param2: u16) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 323:1: generic scalar type unsupported
// pub type VDMTERMINATETASKINWOWPROC = Option<unsafe extern "system" fn(param0: u32, param1: u16) -> windows_sys::core::BOOL>;

public const val `VDM_KGDT_R3_CODE`: UInt = 24u;
public const val `VDM_MAXIMUM_SUPPORTED_EXTENSION`: UInt = 512u;
// UNSUPPORTED Rust 326:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct VDM_SEGINFO {
//     pub Selector: u16,
//     pub SegNumber: u16,
//     pub Length: u32,
//     pub Type: u16,
//     pub ModuleName: [i8; 9],
//     pub FileName: [i8; 255],
// }

// UNSUPPORTED Rust 336:1: declaration Impl has no candidate rule
// impl Default for VDM_SEGINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WOW_SYSTEM`: UInt = 1u;
