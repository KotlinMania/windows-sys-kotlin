// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
public const val `ComponentTypeEnforcementClientRp`: UInt = 2u;
public const val `ComponentTypeEnforcementClientSoH`: UInt = 1u;
// UNSUPPORTED Rust 3:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CorrelationId {
//     pub connId: windows_sys::core::GUID,
//     pub timeStamp: super::super::Foundation::FILETIME,
// }

// UNSUPPORTED Rust 9:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CountedString {
//     pub length: u16,
//     pub string: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 15:1: declaration Impl has no candidate rule
// impl Default for CountedString {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `ExtendedIsolationState` = Int;
public typealias `FailureCategory` = Int;
// UNSUPPORTED Rust 22:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FailureCategoryMapping {
//     pub mappingCompliance: [windows_sys::core::BOOL; 5],
// }

// UNSUPPORTED Rust 27:1: declaration Impl has no candidate rule
// impl Default for FailureCategoryMapping {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 32:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FixupInfo {
//     pub state: FixupState,
//     pub percentage: u8,
//     pub resultCodes: ResultCodes,
//     pub fixupMsgId: u32,
// }

public typealias `FixupState` = Int;
// UNSUPPORTED Rust 41:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct Ipv4Address {
//     pub addr: [u8; 4],
// }

// UNSUPPORTED Rust 46:1: declaration Impl has no candidate rule
// impl Default for Ipv4Address {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 51:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct Ipv6Address {
//     pub addr: [u8; 16],
// }

// UNSUPPORTED Rust 56:1: declaration Impl has no candidate rule
// impl Default for Ipv6Address {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 61:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IsolationInfo {
//     pub isolationState: IsolationState,
//     pub probEndTime: super::super::Foundation::FILETIME,
//     pub failureUrl: CountedString,
// }

// UNSUPPORTED Rust 68:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IsolationInfoEx {
//     pub isolationState: IsolationState,
//     pub extendedIsolationState: ExtendedIsolationState,
//     pub probEndTime: super::super::Foundation::FILETIME,
//     pub failureUrl: CountedString,
// }

public typealias `IsolationState` = Int;
// UNSUPPORTED Rust 77:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NapComponentRegistrationInfo {
//     pub id: u32,
//     pub friendlyName: CountedString,
//     pub description: CountedString,
//     pub version: CountedString,
//     pub vendorName: CountedString,
//     pub infoClsid: windows_sys::core::GUID,
//     pub configClsid: windows_sys::core::GUID,
//     pub registrationDate: super::super::Foundation::FILETIME,
//     pub componentType: u32,
// }

public typealias `NapNotifyType` = Int;
public typealias `NapTracingLevel` = Int;
// UNSUPPORTED Rust 92:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NetworkSoH {
//     pub size: u16,
//     pub data: *mut u8,
// }

// UNSUPPORTED Rust 98:1: declaration Impl has no candidate rule
// impl Default for NetworkSoH {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 103:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PrivateData {
//     pub size: u16,
//     pub data: *mut u8,
// }

// UNSUPPORTED Rust 109:1: declaration Impl has no candidate rule
// impl Default for PrivateData {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `RemoteConfigurationType` = Int;
// UNSUPPORTED Rust 115:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ResultCodes {
//     pub count: u16,
//     pub results: *mut windows_sys::core::HRESULT,
// }

// UNSUPPORTED Rust 121:1: declaration Impl has no candidate rule
// impl Default for ResultCodes {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 126:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SoH {
//     pub count: u16,
//     pub attributes: *mut SoHAttribute,
// }

// UNSUPPORTED Rust 132:1: declaration Impl has no candidate rule
// impl Default for SoH {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 137:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SoHAttribute {
//     pub r#type: u16,
//     pub size: u16,
//     pub value: *mut u8,
// }

// UNSUPPORTED Rust 144:1: declaration Impl has no candidate rule
// impl Default for SoHAttribute {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 149:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SystemHealthAgentState {
//     pub id: u32,
//     pub shaResultCodes: ResultCodes,
//     pub failureCategory: FailureCategory,
//     pub fixupInfo: FixupInfo,
// }

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
