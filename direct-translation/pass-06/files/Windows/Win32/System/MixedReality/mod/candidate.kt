// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const PERCEPTIONFIELD_StateStream_TimeStamps: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xaa886119_f32f_49bf_92ca_f9ddf784d297);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PERCEPTION_PAYLOAD_FIELD` (
    public var `FieldId`: `windows_sys`.`core`.`GUID`,
    public var `OffsetInBytes`: UInt,
    public var `SizeInBytes`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PERCEPTION_STATE_STREAM_TIMESTAMPS` (
    public var `InputTimestampInQpcCounts`: Long,
    public var `AvailableTimestampInQpcCounts`: Long,
)
