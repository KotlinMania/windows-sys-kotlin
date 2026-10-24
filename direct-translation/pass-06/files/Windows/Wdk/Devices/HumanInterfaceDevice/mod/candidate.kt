// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=vhfum.dll, ABI=system, export=VhfAsyncOperationComplete; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VhfAsyncOperationComplete`(`vhfoperationhandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `completionstatus` : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=vhfum.dll, ABI=system, export=VhfCreate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VhfCreate`(`vhfconfig` : /* Rust *const */ kotlinx.cinterop.CPointer<`VHF_CONFIG`>?, `vhfhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=vhfum.dll, ABI=system, export=VhfDelete; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VhfDelete`(`vhfhandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `wait` : Boolean)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=vhfum.dll, ABI=system, export=VhfReadReportSubmit; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VhfReadReportSubmit`(`vhfhandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `hidtransferpacket` : /* Rust *const */ kotlinx.cinterop.CPointer<`HID_XFER_PACKET`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=vhfum.dll, ABI=system, export=VhfStart; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VhfStart`(`vhfhandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `EVT_VHF_ASYNC_OPERATION` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`HID_XFER_PACKET`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `EVT_VHF_CLEANUP` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `EVT_VHF_READY_FOR_NEXT_READ_REPORT` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HID_XFER_PACKET` (
    public var `reportBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `reportBufferLen`: UInt,
    public var `reportId`: UByte,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `HID_XFER_PACKET`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `HID_XFER_PACKET`.Companion.`default`() : `HID_XFER_PACKET` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `VHF_CONFIG` (
    public var `Size`: UInt,
    public var `VhfClientContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `OperationContextSize`: UInt,
    public var `FileHandle`: `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`,
    public var `VendorID`: UShort,
    public var `ProductID`: UShort,
    public var `VersionNumber`: UShort,
    public var `ContainerID`: `windows_sys`.`core`.`GUID`,
    public var `InstanceIDLength`: UShort,
    public var `InstanceID`: `windows_sys`.`core`.`PWSTR`,
    public var `ReportDescriptorLength`: UShort,
    public var `ReportDescriptor`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `EvtVhfReadyForNextReadReport`: `EVT_VHF_READY_FOR_NEXT_READ_REPORT`,
    public var `EvtVhfAsyncOperationGetFeature`: `EVT_VHF_ASYNC_OPERATION`,
    public var `EvtVhfAsyncOperationSetFeature`: `EVT_VHF_ASYNC_OPERATION`,
    public var `EvtVhfAsyncOperationWriteReport`: `EVT_VHF_ASYNC_OPERATION`,
    public var `EvtVhfAsyncOperationGetInputReport`: `EVT_VHF_ASYNC_OPERATION`,
    public var `EvtVhfCleanup`: `EVT_VHF_CLEANUP`,
    public var `HardwareIDsLength`: UShort,
    public var `HardwareIDs`: `windows_sys`.`core`.`PWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `VHF_CONFIG`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `VHF_CONFIG`.Companion.`default`() : `VHF_CONFIG` {
        return run { `core`.`mem`.`zeroed`() }
    }

