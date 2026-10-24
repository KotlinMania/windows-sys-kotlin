// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ualapi.dll, ABI=system, export=UalInstrument; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `UalInstrument`(`data` : /* Rust *const */ kotlinx.cinterop.CPointer<`UAL_DATA_BLOB`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ualapi.dll, ABI=system, export=UalRegisterProduct; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UalRegisterProduct`(`wszproductname` : `windows_sys`.`core`.`PCWSTR`, `wszrolename` : `windows_sys`.`core`.`PCWSTR`, `wszguid` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ualapi.dll, ABI=system, export=UalStart; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `UalStart`(`data` : /* Rust *const */ kotlinx.cinterop.CPointer<`UAL_DATA_BLOB`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ualapi.dll, ABI=system, export=UalStop; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
public external fun `UalStop`(`data` : /* Rust *const */ kotlinx.cinterop.CPointer<`UAL_DATA_BLOB`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 260 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `UAL_DATA_BLOB` (
    public var `Size`: UInt,
    public var `RoleGuid`: `windows_sys`.`core`.`GUID`,
    public var `TenantId`: `windows_sys`.`core`.`GUID`,
    public var `Address`: `super`.`super`.`Networking`.`WinSock`.`SOCKADDR_STORAGE`,
    public var `UserName`: UShortArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `UAL_DATA_BLOB`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]

    public fun `UAL_DATA_BLOB`.Companion.`default`() : `UAL_DATA_BLOB` {
        return run { `core`.`mem`.`zeroed`() }
    }

