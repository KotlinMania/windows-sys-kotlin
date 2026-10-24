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
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Diagnostics_Debug", feature = "Win32_System_Threading"))]
public typealias `DEBUGEVENTPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Diagnostics`.`Debug`.`DEBUG_EVENT`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> UInt>>>;
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `GLOBALENTRY` (
    public var `dwSize`: UInt,
    public var `dwAddress`: UInt,
    public var `dwBlockSize`: UInt,
    public var `hBlock`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `wcLock`: UShort,
    public var `wcPageLock`: UShort,
    public var `wFlags`: UShort,
    public var `wHeapPresent`: `windows_sys`.`core`.`BOOL`,
    public var `hOwner`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `wType`: UShort,
    public var `wData`: UShort,
    public var `dwNext`: UInt,
    public var `dwNextAlt`: UInt,
)
// UNSUPPORTED Rust 58:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 10 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGE_NOTE` (
    public var `Module`: ByteArray,
    public var `FileName`: ByteArray,
    public var `hModule`: UShort,
    public var `hTask`: UShort,
)
// UNSUPPORTED Rust 85:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGE_NOTE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MAX_MODULE_NAME`: UInt = 9u;
public const val `MAX_PATH16`: UInt = 255u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 10 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MODULEENTRY` (
    public var `dwSize`: UInt,
    public var `szModule`: ByteArray,
    public var `hModule`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `wcUsage`: UShort,
    public var `szExePath`: ByteArray,
    public var `wNext`: UShort,
)
// UNSUPPORTED Rust 102:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MODULEENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PROCESSENUMPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, UInt, `super`.`super`.`Foundation`.`LPARAM`) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 10 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SEGMENT_NOTE` (
    public var `Selector1`: UShort,
    public var `Selector2`: UShort,
    public var `Segment`: UShort,
    public var `Module`: ByteArray,
    public var `FileName`: ByteArray,
    public var `Type`: UShort,
    public var `Length`: UInt,
)
// UNSUPPORTED Rust 119:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SEGMENT_NOTE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SN_CODE`: UInt = 0u;
public const val `SN_DATA`: UInt = 1u;
public const val `SN_V86`: UInt = 2u;
public const val `STATUS_VDM_EVENT`: Int = 1073741829;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `TASKENUMPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, UShort, UShort, `super`.`super`.`Foundation`.`LPARAM`) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `TASKENUMPROCEX` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, UShort, UShort, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `super`.`super`.`Foundation`.`LPARAM`) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TEMP_BP_NOTE` (
    public var `Seg`: UShort,
    public var `Offset`: UInt,
    public var `bPM`: `windows_sys`.`core`.`BOOL`,
)
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
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `VDMBREAKTHREADPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 512 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `VDMCONTEXT` (
    public var `ContextFlags`: UInt,
    public var `Dr0`: UInt,
    public var `Dr1`: UInt,
    public var `Dr2`: UInt,
    public var `Dr3`: UInt,
    public var `Dr6`: UInt,
    public var `Dr7`: UInt,
    public var `FloatSave`: `super`.`Kernel`.`FLOATING_SAVE_AREA`,
    public var `SegGs`: UInt,
    public var `SegFs`: UInt,
    public var `SegEs`: UInt,
    public var `SegDs`: UInt,
    public var `Edi`: UInt,
    public var `Esi`: UInt,
    public var `Ebx`: UInt,
    public var `Edx`: UInt,
    public var `Ecx`: UInt,
    public var `Eax`: UInt,
    public var `Ebp`: UInt,
    public var `Eip`: UInt,
    public var `SegCs`: UInt,
    public var `EFlags`: UInt,
    public var `Esp`: UInt,
    public var `SegSs`: UInt,
    public var `ExtendedRegisters`: UByteArray,
)
// UNSUPPORTED Rust 186:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[cfg(feature = "Win32_System_Kernel")]
// impl Default for VDMCONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `VDMCONTEXT_WITHOUT_XSAVE` (
    public var `ContextFlags`: UInt,
    public var `Dr0`: UInt,
    public var `Dr1`: UInt,
    public var `Dr2`: UInt,
    public var `Dr3`: UInt,
    public var `Dr6`: UInt,
    public var `Dr7`: UInt,
    public var `FloatSave`: `super`.`Kernel`.`FLOATING_SAVE_AREA`,
    public var `SegGs`: UInt,
    public var `SegFs`: UInt,
    public var `SegEs`: UInt,
    public var `SegDs`: UInt,
    public var `Edi`: UInt,
    public var `Esi`: UInt,
    public var `Ebx`: UInt,
    public var `Edx`: UInt,
    public var `Ecx`: UInt,
    public var `Eax`: UInt,
    public var `Ebp`: UInt,
    public var `Eip`: UInt,
    public var `SegCs`: UInt,
    public var `EFlags`: UInt,
    public var `Esp`: UInt,
    public var `SegSs`: UInt,
)
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
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `VDMDETECTWOWPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `VDMENUMPROCESSWOWPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`PROCESSENUMPROC`, `super`.`super`.`Foundation`.`LPARAM`) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `VDMENUMTASKWOWEXPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, `TASKENUMPROCEX`, `super`.`super`.`Foundation`.`LPARAM`) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `VDMENUMTASKWOWPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, `TASKENUMPROC`, `super`.`super`.`Foundation`.`LPARAM`) -> Int>>>;
public const val `VDMEVENT_ALLFLAGS`: UInt = 57344u;
public const val `VDMEVENT_NEEDS_INTERACTIVE`: UInt = 32768u;
public const val `VDMEVENT_PE`: UInt = 8192u;
public const val `VDMEVENT_PM16`: UInt = 2u;
public const val `VDMEVENT_V86`: UInt = 1u;
public const val `VDMEVENT_VERBOSE`: UInt = 16384u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `VDMGETADDREXPRESSIONPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCSTR`, `windows_sys`.`core`.`PCSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Diagnostics_Debug", feature = "Win32_System_Kernel"))]
public typealias `VDMGETCONTEXTPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, `super`.`super`.`Foundation`.`HANDLE`, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Diagnostics`.`Debug`.`CONTEXT`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
public typealias `VDMGETCONTEXTPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, `super`.`super`.`Foundation`.`HANDLE`, /* Rust *mut */ kotlinx.cinterop.CPointer<`VDMCONTEXT`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `VDMGETDBGFLAGSPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `VDMGETMODULESELECTORPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, `super`.`super`.`Foundation`.`HANDLE`, UInt, `windows_sys`.`core`.`PCSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `VDMGETPOINTERPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, `super`.`super`.`Foundation`.`HANDLE`, UShort, UInt, `windows_sys`.`core`.`BOOL`) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `VDMGETSEGMENTINFOPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UShort, UInt, `windows_sys`.`core`.`BOOL`, `VDM_SEGINFO`) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `VDMGETSELECTORMODULEPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, `super`.`super`.`Foundation`.`HANDLE`, UShort, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `windows_sys`.`core`.`PCSTR`, UInt, `windows_sys`.`core`.`PCSTR`, UInt) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `VDMGETSYMBOLPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCSTR`, UShort, UInt, `windows_sys`.`core`.`BOOL`, `windows_sys`.`core`.`BOOL`, `windows_sys`.`core`.`PSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Diagnostics_Debug")]
public typealias `VDMGETTHREADSELECTORENTRYPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, `super`.`super`.`Foundation`.`HANDLE`, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Diagnostics`.`Debug`.`LDT_ENTRY`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
public typealias `VDMGETTHREADSELECTORENTRYPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, `super`.`super`.`Foundation`.`HANDLE`, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`VDMLDT_ENTRY`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Diagnostics_Debug", feature = "Win32_System_Threading"))]
public typealias `VDMGLOBALFIRSTPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, `super`.`super`.`Foundation`.`HANDLE`, /* Rust *mut */ kotlinx.cinterop.CPointer<`GLOBALENTRY`>?, UShort, `DEBUGEVENTPROC`, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Diagnostics_Debug", feature = "Win32_System_Threading"))]
public typealias `VDMGLOBALNEXTPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, `super`.`super`.`Foundation`.`HANDLE`, /* Rust *mut */ kotlinx.cinterop.CPointer<`GLOBALENTRY`>?, UShort, `DEBUGEVENTPROC`, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `VDMISMODULELOADEDPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCSTR`) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `VDMKILLWOWPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `VDMLDT_ENTRY` (
    public var `LimitLow`: UShort,
    public var `BaseLow`: UShort,
    public var `HighWord`: `VDMLDT_ENTRY_0`,
)
// UNSUPPORTED Rust 275:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for VDMLDT_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 281:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub union VDMLDT_ENTRY_0 {
//     pub Bytes: VDMLDT_ENTRY_0_0,
//     pub Bits: VDMLDT_ENTRY_0_1,
// }

// UNSUPPORTED Rust 288:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for VDMLDT_ENTRY_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `VDMLDT_ENTRY_0_1` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `VDMLDT_ENTRY_0_0` (
    public var `BaseMid`: UByte,
    public var `Flags1`: UByte,
    public var `Flags2`: UByte,
    public var `BaseHi`: UByte,
)
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Diagnostics_Debug", feature = "Win32_System_Threading"))]
public typealias `VDMMODULEFIRSTPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, `super`.`super`.`Foundation`.`HANDLE`, /* Rust *mut */ kotlinx.cinterop.CPointer<`MODULEENTRY`>?, `DEBUGEVENTPROC`, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Diagnostics_Debug", feature = "Win32_System_Threading"))]
public typealias `VDMMODULENEXTPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, `super`.`super`.`Foundation`.`HANDLE`, /* Rust *mut */ kotlinx.cinterop.CPointer<`MODULEENTRY`>?, `DEBUGEVENTPROC`, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Diagnostics_Debug", feature = "Win32_System_Threading"))]
public typealias `VDMPROCESSEXCEPTIONPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Diagnostics`.`Debug`.`DEBUG_EVENT`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Diagnostics_Debug", feature = "Win32_System_Kernel"))]
public typealias `VDMSETCONTEXTPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, `super`.`super`.`Foundation`.`HANDLE`, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Diagnostics`.`Debug`.`CONTEXT`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
public typealias `VDMSETCONTEXTPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, `super`.`super`.`Foundation`.`HANDLE`, /* Rust *mut */ kotlinx.cinterop.CPointer<`VDMCONTEXT`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `VDMSETDBGFLAGSPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, UInt) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `VDMSTARTTASKINWOWPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, `windows_sys`.`core`.`PCSTR`, UShort) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `VDMTERMINATETASKINWOWPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, UShort) -> `windows_sys`.`core`.`BOOL`>>>;
public const val `VDM_KGDT_R3_CODE`: UInt = 24u;
public const val `VDM_MAXIMUM_SUPPORTED_EXTENSION`: UInt = 512u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 9 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 255 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `VDM_SEGINFO` (
    public var `Selector`: UShort,
    public var `SegNumber`: UShort,
    public var `Length`: UInt,
    public var `Type`: UShort,
    public var `ModuleName`: ByteArray,
    public var `FileName`: ByteArray,
)
// UNSUPPORTED Rust 336:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for VDM_SEGINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WOW_SYSTEM`: UInt = 1u;
