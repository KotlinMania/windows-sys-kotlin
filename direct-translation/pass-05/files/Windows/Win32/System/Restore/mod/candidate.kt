// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=srclient.dll, ABI=system, export=SRRemoveRestorePoint; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SRRemoveRestorePoint`(`dwrpnum` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=sfc.dll, ABI=system, export=SRSetRestorePointA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SRSetRestorePointA`(`prestoreptspec` : /* Rust *const */ kotlinx.cinterop.CPointer<`RESTOREPOINTINFOA`>?, `psmgrstatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<`STATEMGRSTATUS`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=sfc.dll, ABI=system, export=SRSetRestorePointW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SRSetRestorePointW`(`prestoreptspec` : /* Rust *const */ kotlinx.cinterop.CPointer<`RESTOREPOINTINFOW`>?, `psmgrstatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<`STATEMGRSTATUS`>?) : `windows_sys`.`core`.`BOOL`
public const val `ACCESSIBILITY_SETTING`: UInt = 3u;
public const val `APPLICATION_INSTALL`: `RESTOREPOINTINFO_TYPE` = 0u;
public const val `APPLICATION_RUN`: UInt = 5u;
public const val `APPLICATION_UNINSTALL`: `RESTOREPOINTINFO_TYPE` = 1u;
public const val `BACKUP`: UInt = 15u;
public const val `BACKUP_RECOVERY`: UInt = 14u;
public const val `BEGIN_NESTED_SYSTEM_CHANGE`: `RESTOREPOINTINFO_EVENT_TYPE` = 102u;
public const val `BEGIN_NESTED_SYSTEM_CHANGE_NORP`: UInt = 104u;
public const val `BEGIN_SYSTEM_CHANGE`: `RESTOREPOINTINFO_EVENT_TYPE` = 100u;
public const val `CANCELLED_OPERATION`: `RESTOREPOINTINFO_TYPE` = 13u;
public const val `CHECKPOINT`: UInt = 7u;
public const val `CRITICAL_UPDATE`: UInt = 18u;
public const val `DESKTOP_SETTING`: UInt = 2u;
public const val `DEVICE_DRIVER_INSTALL`: `RESTOREPOINTINFO_TYPE` = 10u;
public const val `END_NESTED_SYSTEM_CHANGE`: `RESTOREPOINTINFO_EVENT_TYPE` = 103u;
public const val `END_SYSTEM_CHANGE`: `RESTOREPOINTINFO_EVENT_TYPE` = 101u;
public const val `FIRSTRUN`: UInt = 11u;
public const val `MANUAL_CHECKPOINT`: UInt = 16u;
public const val `MAX_DESC`: UInt = 64u;
public const val `MAX_DESC_W`: UInt = 256u;
public const val `MAX_EVENT`: UInt = 104u;
public const val `MAX_RPT`: UInt = 18u;
public const val `MIN_EVENT`: UInt = 100u;
public const val `MIN_RPT`: UInt = 0u;
public const val `MODIFY_SETTINGS`: `RESTOREPOINTINFO_TYPE` = 12u;
public const val `OE_SETTING`: UInt = 4u;
public const val `RESTORE`: UInt = 6u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 64 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RESTOREPOINTINFOA` (
    public var `dwEventType`: `RESTOREPOINTINFO_EVENT_TYPE`,
    public var `dwRestorePtType`: `RESTOREPOINTINFO_TYPE`,
    public var `llSequenceNumber`: Long,
    public var `szDescription`: ByteArray,
)
// UNSUPPORTED Rust 39:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RESTOREPOINTINFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RESTOREPOINTINFOEX` (
    public var `ftCreation`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `dwEventType`: UInt,
    public var `dwRestorePtType`: UInt,
    public var `dwRPNum`: UInt,
    public var `szDescription`: UShortArray,
)
// UNSUPPORTED Rust 53:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RESTOREPOINTINFOEX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RESTOREPOINTINFOW` (
    public var `dwEventType`: `RESTOREPOINTINFO_EVENT_TYPE`,
    public var `dwRestorePtType`: `RESTOREPOINTINFO_TYPE`,
    public var `llSequenceNumber`: Long,
    public var `szDescription`: UShortArray,
)
// UNSUPPORTED Rust 66:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RESTOREPOINTINFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `RESTOREPOINTINFO_EVENT_TYPE` = UInt;
public typealias `RESTOREPOINTINFO_TYPE` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STATEMGRSTATUS` (
    public var `nStatus`: `super`.`super`.`Foundation`.`WIN32_ERROR`,
    public var `llSequenceNumber`: Long,
)
public const val `WINDOWS_BOOT`: UInt = 9u;
public const val `WINDOWS_SHUTDOWN`: UInt = 8u;
public const val `WINDOWS_UPDATE`: UInt = 17u;
