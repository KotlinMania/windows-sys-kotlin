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
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `HEAPENTRY32`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `HEAPENTRY32`.Companion.`default`() : `HEAPENTRY32` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 260 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MODULEENTRY32` (
    public var `dwSize`: UInt,
    public var `th32ModuleID`: UInt,
    public var `th32ProcessID`: UInt,
    public var `GlblcntUsage`: UInt,
    public var `ProccntUsage`: UInt,
    public var `modBaseAddr`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `modBaseSize`: UInt,
    public var `hModule`: `super`.`super`.`super`.`Foundation`.`HMODULE`,
    public var `szModule`: ByteArray,
    public var `szExePath`: ByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MODULEENTRY32`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MODULEENTRY32`.Companion.`default`() : `MODULEENTRY32` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 260 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MODULEENTRY32W` (
    public var `dwSize`: UInt,
    public var `th32ModuleID`: UInt,
    public var `th32ProcessID`: UInt,
    public var `GlblcntUsage`: UInt,
    public var `ProccntUsage`: UInt,
    public var `modBaseAddr`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `modBaseSize`: UInt,
    public var `hModule`: `super`.`super`.`super`.`Foundation`.`HMODULE`,
    public var `szModule`: UShortArray,
    public var `szExePath`: UShortArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MODULEENTRY32W`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MODULEENTRY32W`.Companion.`default`() : `MODULEENTRY32W` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 260 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PROCESSENTRY32` (
    public var `dwSize`: UInt,
    public var `cntUsage`: UInt,
    public var `th32ProcessID`: UInt,
    public var `th32DefaultHeapID`: ULong,
    public var `th32ModuleID`: UInt,
    public var `cntThreads`: UInt,
    public var `th32ParentProcessID`: UInt,
    public var `pcPriClassBase`: Int,
    public var `dwFlags`: UInt,
    public var `szExeFile`: ByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PROCESSENTRY32`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `PROCESSENTRY32`.Companion.`default`() : `PROCESSENTRY32` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 260 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PROCESSENTRY32W` (
    public var `dwSize`: UInt,
    public var `cntUsage`: UInt,
    public var `th32ProcessID`: UInt,
    public var `th32DefaultHeapID`: ULong,
    public var `th32ModuleID`: UInt,
    public var `cntThreads`: UInt,
    public var `th32ParentProcessID`: UInt,
    public var `pcPriClassBase`: Int,
    public var `dwFlags`: UInt,
    public var `szExeFile`: UShortArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PROCESSENTRY32W`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `PROCESSENTRY32W`.Companion.`default`() : `PROCESSENTRY32W` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
