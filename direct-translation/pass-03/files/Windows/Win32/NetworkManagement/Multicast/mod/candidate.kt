// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpcsvc.dll, ABI=system, export=McastApiCleanup; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `McastApiCleanup`()
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpcsvc.dll, ABI=system, export=McastApiStartup; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `McastApiStartup`(`version` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpcsvc.dll, ABI=system, export=McastEnumerateScopes; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `McastEnumerateScopes`(`addrfamily` : UShort, `requery` : `windows_sys`.`core`.`BOOL`, `pscopelist` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MCAST_SCOPE_ENTRY`>?, `pscopelen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pscopecount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpcsvc.dll, ABI=system, export=McastGenUID; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `McastGenUID`(`prequestid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MCAST_CLIENT_UID`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpcsvc.dll, ABI=system, export=McastReleaseAddress; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `McastReleaseAddress`(`addrfamily` : UShort, `prequestid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MCAST_CLIENT_UID`>?, `preleaserequest` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MCAST_LEASE_REQUEST`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpcsvc.dll, ABI=system, export=McastRenewAddress; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `McastRenewAddress`(`addrfamily` : UShort, `prequestid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MCAST_CLIENT_UID`>?, `prenewrequest` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MCAST_LEASE_REQUEST`>?, `prenewresponse` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MCAST_LEASE_RESPONSE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dhcpcsvc.dll, ABI=system, export=McastRequestAddress; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `McastRequestAddress`(`addrfamily` : UShort, `prequestid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MCAST_CLIENT_UID`>?, `pscopectx` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MCAST_SCOPE_CTX`>?, `paddrrequest` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MCAST_LEASE_REQUEST`>?, `paddrresponse` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MCAST_LEASE_RESPONSE`>?) : UInt
// UNSUPPORTED Rust 8:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IPNG_ADDRESS {
//     pub IpAddrV4: u32,
//     pub IpAddrV6: [u8; 16],
// }

// UNSUPPORTED Rust 14:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IPNG_ADDRESS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MCAST_API_CURRENT_VERSION`: Int = 1;
public const val `MCAST_API_VERSION_0`: Int = 0;
public const val `MCAST_API_VERSION_1`: Int = 1;
public const val `MCAST_CLIENT_ID_LEN`: UInt = 17u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MCAST_CLIENT_UID` (
    public var `ClientUID`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `ClientUIDLength`: UInt,
)
// UNSUPPORTED Rust 29:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MCAST_CLIENT_UID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MCAST_LEASE_REQUEST` (
    public var `LeaseStartTime`: Int,
    public var `MaxLeaseStartTime`: Int,
    public var `LeaseDuration`: UInt,
    public var `MinLeaseDuration`: UInt,
    public var `ServerAddress`: `IPNG_ADDRESS`,
    public var `MinAddrCount`: UShort,
    public var `AddrCount`: UShort,
    public var `pAddrBuf`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 46:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MCAST_LEASE_REQUEST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MCAST_LEASE_RESPONSE` (
    public var `LeaseStartTime`: Int,
    public var `LeaseEndTime`: Int,
    public var `ServerAddress`: `IPNG_ADDRESS`,
    public var `AddrCount`: UShort,
    public var `pAddrBuf`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 60:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MCAST_LEASE_RESPONSE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MCAST_SCOPE_CTX` (
    public var `ScopeID`: `IPNG_ADDRESS`,
    public var `Interface`: `IPNG_ADDRESS`,
    public var `ServerID`: `IPNG_ADDRESS`,
)
// UNSUPPORTED Rust 72:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MCAST_SCOPE_CTX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MCAST_SCOPE_ENTRY` (
    public var `ScopeCtx`: `MCAST_SCOPE_CTX`,
    public var `LastAddr`: `IPNG_ADDRESS`,
    public var `TTL`: UInt,
    public var `ScopeDesc`: `super`.`super`.`Foundation`.`UNICODE_STRING`,
)
// UNSUPPORTED Rust 85:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MCAST_SCOPE_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

