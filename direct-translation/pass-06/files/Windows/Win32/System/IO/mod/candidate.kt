// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=BindIoCompletionCallback; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `BindIoCompletionCallback`(`filehandle` : `super`.`super`.`Foundation`.`HANDLE`, `function` : `LPOVERLAPPED_COMPLETION_ROUTINE`, `flags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=CancelIo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CancelIo`(`hfile` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=CancelIoEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CancelIoEx`(`hfile` : `super`.`super`.`Foundation`.`HANDLE`, `lpoverlapped` : /* Rust *const */ kotlinx.cinterop.CPointer<`OVERLAPPED`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=CancelSynchronousIo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CancelSynchronousIo`(`hthread` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=CreateIoCompletionPort; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateIoCompletionPort`(`filehandle` : `super`.`super`.`Foundation`.`HANDLE`, `existingcompletionport` : `super`.`super`.`Foundation`.`HANDLE`, `completionkey` : ULong, `numberofconcurrentthreads` : UInt) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=DeviceIoControl; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeviceIoControl`(`hdevice` : `super`.`super`.`Foundation`.`HANDLE`, `dwiocontrolcode` : UInt, `lpinbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ninbuffersize` : UInt, `lpoutbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `noutbuffersize` : UInt, `lpbytesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpoverlapped` : /* Rust *mut */ kotlinx.cinterop.CPointer<`OVERLAPPED`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetOverlappedResult; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetOverlappedResult`(`hfile` : `super`.`super`.`Foundation`.`HANDLE`, `lpoverlapped` : /* Rust *const */ kotlinx.cinterop.CPointer<`OVERLAPPED`>?, `lpnumberofbytestransferred` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `bwait` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetOverlappedResultEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetOverlappedResultEx`(`hfile` : `super`.`super`.`Foundation`.`HANDLE`, `lpoverlapped` : /* Rust *const */ kotlinx.cinterop.CPointer<`OVERLAPPED`>?, `lpnumberofbytestransferred` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `dwmilliseconds` : UInt, `balertable` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetQueuedCompletionStatus; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetQueuedCompletionStatus`(`completionport` : `super`.`super`.`Foundation`.`HANDLE`, `lpnumberofbytestransferred` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpcompletionkey` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `lpoverlapped` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`OVERLAPPED`>>?, `dwmilliseconds` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetQueuedCompletionStatusEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetQueuedCompletionStatusEx`(`completionport` : `super`.`super`.`Foundation`.`HANDLE`, `lpcompletionportentries` : /* Rust *mut */ kotlinx.cinterop.CPointer<`OVERLAPPED_ENTRY`>?, `ulcount` : UInt, `ulnumentriesremoved` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `dwmilliseconds` : UInt, `falertable` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=PostQueuedCompletionStatus; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PostQueuedCompletionStatus`(`completionport` : `super`.`super`.`Foundation`.`HANDLE`, `dwnumberofbytestransferred` : UInt, `dwcompletionkey` : ULong, `lpoverlapped` : /* Rust *const */ kotlinx.cinterop.CPointer<`OVERLAPPED`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IO_STATUS_BLOCK` (
    public var `Anonymous`: `IO_STATUS_BLOCK_0`,
    public var `Information`: ULong,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `IO_STATUS_BLOCK`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `IO_STATUS_BLOCK`.Companion.`default`() : `IO_STATUS_BLOCK` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 23:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IO_STATUS_BLOCK_0 {
//     pub Status: super::super::Foundation::NTSTATUS,
//     pub Pointer: *mut core::ffi::c_void,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `IO_STATUS_BLOCK_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `IO_STATUS_BLOCK_0`.Companion.`default`() : `IO_STATUS_BLOCK_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPOVERLAPPED_COMPLETION_ROUTINE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`OVERLAPPED`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OVERLAPPED` (
    public var `Internal`: ULong,
    public var `InternalHigh`: ULong,
    public var `Anonymous`: `OVERLAPPED_0`,
    public var `hEvent`: `super`.`super`.`Foundation`.`HANDLE`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `OVERLAPPED`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `OVERLAPPED`.Companion.`default`() : `OVERLAPPED` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 48:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union OVERLAPPED_0 {
//     pub Anonymous: OVERLAPPED_0_0,
//     pub Pointer: *mut core::ffi::c_void,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `OVERLAPPED_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `OVERLAPPED_0`.Companion.`default`() : `OVERLAPPED_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `OVERLAPPED_0_0` (
    public var `Offset`: UInt,
    public var `OffsetHigh`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OVERLAPPED_ENTRY` (
    public var `lpCompletionKey`: ULong,
    public var `lpOverlapped`: /* Rust *mut */ kotlinx.cinterop.CPointer<`OVERLAPPED`>?,
    public var `Internal`: ULong,
    public var `dwNumberOfBytesTransferred`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `OVERLAPPED_ENTRY`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `OVERLAPPED_ENTRY`.Companion.`default`() : `OVERLAPPED_ENTRY` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PIO_APC_ROUTINE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`IO_STATUS_BLOCK`>?, UInt) -> Unit>>>;
