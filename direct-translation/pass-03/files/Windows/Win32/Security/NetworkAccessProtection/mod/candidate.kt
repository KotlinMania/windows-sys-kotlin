// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
public const val `ComponentTypeEnforcementClientRp`: UInt = 2u;
public const val `ComponentTypeEnforcementClientSoH`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CorrelationId` (
    public var `connId`: `windows_sys`.`core`.`GUID`,
    public var `timeStamp`: `super`.`super`.`Foundation`.`FILETIME`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CountedString` (
    public var `length`: UShort,
    public var `string`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 15:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CountedString {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `ExtendedIsolationState` = Int;
public typealias `FailureCategory` = Int;
// UNSUPPORTED Rust 22:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FailureCategoryMapping {
//     pub mappingCompliance: [windows_sys::core::BOOL; 5],
// }

// UNSUPPORTED Rust 27:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FailureCategoryMapping {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FixupInfo` (
    public var `state`: `FixupState`,
    public var `percentage`: UByte,
    public var `resultCodes`: `ResultCodes`,
    public var `fixupMsgId`: UInt,
)
public typealias `FixupState` = Int;
// UNSUPPORTED Rust 41:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct Ipv4Address {
//     pub addr: [u8; 4],
// }

// UNSUPPORTED Rust 46:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for Ipv4Address {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 51:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct Ipv6Address {
//     pub addr: [u8; 16],
// }

// UNSUPPORTED Rust 56:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for Ipv6Address {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IsolationInfo` (
    public var `isolationState`: `IsolationState`,
    public var `probEndTime`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `failureUrl`: `CountedString`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IsolationInfoEx` (
    public var `isolationState`: `IsolationState`,
    public var `extendedIsolationState`: `ExtendedIsolationState`,
    public var `probEndTime`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `failureUrl`: `CountedString`,
)
public typealias `IsolationState` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NapComponentRegistrationInfo` (
    public var `id`: UInt,
    public var `friendlyName`: `CountedString`,
    public var `description`: `CountedString`,
    public var `version`: `CountedString`,
    public var `vendorName`: `CountedString`,
    public var `infoClsid`: `windows_sys`.`core`.`GUID`,
    public var `configClsid`: `windows_sys`.`core`.`GUID`,
    public var `registrationDate`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `componentType`: UInt,
)
public typealias `NapNotifyType` = Int;
public typealias `NapTracingLevel` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NetworkSoH` (
    public var `size`: UShort,
    public var `data`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 98:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NetworkSoH {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PrivateData` (
    public var `size`: UShort,
    public var `data`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 109:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PrivateData {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `RemoteConfigurationType` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ResultCodes` (
    public var `count`: UShort,
    public var `results`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`HRESULT`>?,
)
// UNSUPPORTED Rust 121:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ResultCodes {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SoH` (
    public var `count`: UShort,
    public var `attributes`: /* Rust *mut */ kotlinx.cinterop.CPointer<`SoHAttribute`>?,
)
// UNSUPPORTED Rust 132:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SoH {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SoHAttribute` (
    public var `type`: UShort,
    public var `size`: UShort,
    public var `value`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 144:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SoHAttribute {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SystemHealthAgentState` (
    public var `id`: UInt,
    public var `shaResultCodes`: `ResultCodes`,
    public var `failureCategory`: `FailureCategory`,
    public var `fixupInfo`: `FixupInfo`,
)
public const val `extendedIsolationStateInfected`: `ExtendedIsolationState` = 2;
public const val `extendedIsolationStateNoData`: `ExtendedIsolationState` = 0;
public const val `extendedIsolationStateTransition`: `ExtendedIsolationState` = 1;
public const val `extendedIsolationStateUnknown`: `ExtendedIsolationState` = 3;
public const val `failureCategoryClientCommunication`: `FailureCategory` = 3;
public const val `failureCategoryClientComponent`: `FailureCategory` = 2;
public const val `failureCategoryCount`: UInt = 5u;
public const val `failureCategoryNone`: `FailureCategory` = 0;
public const val `failureCategoryOther`: `FailureCategory` = 1;
public const val `failureCategoryServerCommunication`: `FailureCategory` = 5;
public const val `failureCategoryServerComponent`: `FailureCategory` = 4;
public const val `fixupStateCouldNotUpdate`: `FixupState` = 2;
public const val `fixupStateInProgress`: `FixupState` = 1;
public const val `fixupStateSuccess`: `FixupState` = 0;
public const val `freshSoHRequest`: UInt = 1u;
public const val `isolationStateInProbation`: `IsolationState` = 2;
public const val `isolationStateNotRestricted`: `IsolationState` = 1;
public const val `isolationStateRestrictedAccess`: `IsolationState` = 3;
public const val `maxConnectionCountPerEnforcer`: UInt = 20u;
public const val `maxEnforcerCount`: UInt = 20u;
public const val `maxNetworkSoHSize`: UInt = 4000u;
public const val `maxPrivateDataSize`: UInt = 200u;
public const val `maxSoHAttributeCount`: UInt = 100u;
public const val `maxSoHAttributeSize`: UInt = 4000u;
public const val `maxStringLength`: UInt = 1024u;
public const val `maxSystemHealthEntityCount`: UInt = 20u;
public const val `minNetworkSoHSize`: UInt = 12u;
public const val `napNotifyTypeQuarState`: `NapNotifyType` = 2;
public const val `napNotifyTypeServiceState`: `NapNotifyType` = 1;
public const val `napNotifyTypeUnknown`: `NapNotifyType` = 0;
public const val `percentageNotSupported`: UInt = 101u;
public const val `remoteConfigTypeConfigBlob`: `RemoteConfigurationType` = 2;
public const val `remoteConfigTypeMachine`: `RemoteConfigurationType` = 1;
public const val `shaFixup`: UInt = 1u;
public const val `tracingLevelAdvanced`: `NapTracingLevel` = 2;
public const val `tracingLevelBasic`: `NapTracingLevel` = 1;
public const val `tracingLevelDebug`: `NapTracingLevel` = 3;
public const val `tracingLevelUndefined`: `NapTracingLevel` = 0;
