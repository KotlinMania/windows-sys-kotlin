// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wecapi.dll, ABI=system, export=EcClose; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EcClose`(`object` : Long) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wecapi.dll, ABI=system, export=EcDeleteSubscription; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EcDeleteSubscription`(`subscriptionname` : `windows_sys`.`core`.`PCWSTR`, `flags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wecapi.dll, ABI=system, export=EcEnumNextSubscription; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EcEnumNextSubscription`(`subscriptionenum` : Long, `subscriptionnamebuffersize` : UInt, `subscriptionnamebuffer` : `windows_sys`.`core`.`PWSTR`, `subscriptionnamebufferused` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wecapi.dll, ABI=system, export=EcGetObjectArrayProperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EcGetObjectArrayProperty`(`objectarray` : Long, `propertyid` : `EC_SUBSCRIPTION_PROPERTY_ID`, `arrayindex` : UInt, `flags` : UInt, `propertyvaluebuffersize` : UInt, `propertyvaluebuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`EC_VARIANT`>?, `propertyvaluebufferused` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wecapi.dll, ABI=system, export=EcGetObjectArraySize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EcGetObjectArraySize`(`objectarray` : Long, `objectarraysize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wecapi.dll, ABI=system, export=EcGetSubscriptionProperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EcGetSubscriptionProperty`(`subscription` : Long, `propertyid` : `EC_SUBSCRIPTION_PROPERTY_ID`, `flags` : UInt, `propertyvaluebuffersize` : UInt, `propertyvaluebuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`EC_VARIANT`>?, `propertyvaluebufferused` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wecapi.dll, ABI=system, export=EcGetSubscriptionRunTimeStatus; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EcGetSubscriptionRunTimeStatus`(`subscriptionname` : `windows_sys`.`core`.`PCWSTR`, `statusinfoid` : `EC_SUBSCRIPTION_RUNTIME_STATUS_INFO_ID`, `eventsourcename` : `windows_sys`.`core`.`PCWSTR`, `flags` : UInt, `statusvaluebuffersize` : UInt, `statusvaluebuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`EC_VARIANT`>?, `statusvaluebufferused` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wecapi.dll, ABI=system, export=EcInsertObjectArrayElement; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EcInsertObjectArrayElement`(`objectarray` : Long, `arrayindex` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wecapi.dll, ABI=system, export=EcOpenSubscription; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EcOpenSubscription`(`subscriptionname` : `windows_sys`.`core`.`PCWSTR`, `accessmask` : UInt, `flags` : UInt) : Long
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wecapi.dll, ABI=system, export=EcOpenSubscriptionEnum; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EcOpenSubscriptionEnum`(`flags` : UInt) : Long
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wecapi.dll, ABI=system, export=EcRemoveObjectArrayElement; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EcRemoveObjectArrayElement`(`objectarray` : Long, `arrayindex` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wecapi.dll, ABI=system, export=EcRetrySubscription; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EcRetrySubscription`(`subscriptionname` : `windows_sys`.`core`.`PCWSTR`, `eventsourcename` : `windows_sys`.`core`.`PCWSTR`, `flags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wecapi.dll, ABI=system, export=EcSaveSubscription; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EcSaveSubscription`(`subscription` : Long, `flags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wecapi.dll, ABI=system, export=EcSetObjectArrayProperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EcSetObjectArrayProperty`(`objectarray` : Long, `propertyid` : `EC_SUBSCRIPTION_PROPERTY_ID`, `arrayindex` : UInt, `flags` : UInt, `propertyvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<`EC_VARIANT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wecapi.dll, ABI=system, export=EcSetSubscriptionProperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EcSetSubscriptionProperty`(`subscription` : Long, `propertyid` : `EC_SUBSCRIPTION_PROPERTY_ID`, `flags` : UInt, `propertyvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<`EC_VARIANT`>?) : `windows_sys`.`core`.`BOOL`
public const val `EC_CREATE_NEW`: UInt = 1u;
public const val `EC_OPEN_ALWAYS`: UInt = 0u;
public const val `EC_OPEN_EXISTING`: UInt = 2u;
public const val `EC_READ_ACCESS`: UInt = 1u;
public typealias `EC_SUBSCRIPTION_CONFIGURATION_MODE` = Int;
public typealias `EC_SUBSCRIPTION_CONTENT_FORMAT` = Int;
public typealias `EC_SUBSCRIPTION_CREDENTIALS_TYPE` = Int;
public typealias `EC_SUBSCRIPTION_DELIVERY_MODE` = Int;
public typealias `EC_SUBSCRIPTION_PROPERTY_ID` = Int;
public typealias `EC_SUBSCRIPTION_RUNTIME_STATUS_ACTIVE_STATUS` = Int;
public typealias `EC_SUBSCRIPTION_RUNTIME_STATUS_INFO_ID` = Int;
public typealias `EC_SUBSCRIPTION_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `EC_VARIANT` (
    public var `Anonymous`: `EC_VARIANT_0`,
    public var `Count`: UInt,
    public var `Type`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `EC_VARIANT`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `EC_VARIANT`.Companion.`default`() : `EC_VARIANT` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 40:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union EC_VARIANT_0 {
//     pub BooleanVal: windows_sys::core::BOOL,
//     pub UInt32Val: u32,
//     pub DateTimeVal: u64,
//     pub StringVal: windows_sys::core::PCWSTR,
//     pub BinaryVal: *mut u8,
//     pub BooleanArr: *mut windows_sys::core::BOOL,
//     pub Int32Arr: *mut i32,
//     pub StringArr: *mut windows_sys::core::PWSTR,
//     pub PropertyHandleVal: isize,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `EC_VARIANT_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `EC_VARIANT_0`.Companion.`default`() : `EC_VARIANT_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `EC_VARIANT_TYPE` = Int;
public const val `EC_VARIANT_TYPE_ARRAY`: UInt = 128u;
public const val `EC_VARIANT_TYPE_MASK`: UInt = 127u;
public const val `EC_WRITE_ACCESS`: UInt = 2u;
public const val `EcConfigurationModeCustom`: `EC_SUBSCRIPTION_CONFIGURATION_MODE` = 1;
public const val `EcConfigurationModeMinBandwidth`: `EC_SUBSCRIPTION_CONFIGURATION_MODE` = 3;
public const val `EcConfigurationModeMinLatency`: `EC_SUBSCRIPTION_CONFIGURATION_MODE` = 2;
public const val `EcConfigurationModeNormal`: `EC_SUBSCRIPTION_CONFIGURATION_MODE` = 0;
public const val `EcContentFormatEvents`: `EC_SUBSCRIPTION_CONTENT_FORMAT` = 1;
public const val `EcContentFormatRenderedText`: `EC_SUBSCRIPTION_CONTENT_FORMAT` = 2;
public const val `EcDeliveryModePull`: `EC_SUBSCRIPTION_DELIVERY_MODE` = 1;
public const val `EcDeliveryModePush`: `EC_SUBSCRIPTION_DELIVERY_MODE` = 2;
public const val `EcRuntimeStatusActiveStatusActive`: `EC_SUBSCRIPTION_RUNTIME_STATUS_ACTIVE_STATUS` = 2;
public const val `EcRuntimeStatusActiveStatusDisabled`: `EC_SUBSCRIPTION_RUNTIME_STATUS_ACTIVE_STATUS` = 1;
public const val `EcRuntimeStatusActiveStatusInactive`: `EC_SUBSCRIPTION_RUNTIME_STATUS_ACTIVE_STATUS` = 3;
public const val `EcRuntimeStatusActiveStatusTrying`: `EC_SUBSCRIPTION_RUNTIME_STATUS_ACTIVE_STATUS` = 4;
public const val `EcSubscriptionAllowedIssuerCAs`: `EC_SUBSCRIPTION_PROPERTY_ID` = 28;
public const val `EcSubscriptionAllowedSourceDomainComputers`: `EC_SUBSCRIPTION_PROPERTY_ID` = 31;
public const val `EcSubscriptionAllowedSubjects`: `EC_SUBSCRIPTION_PROPERTY_ID` = 29;
public const val `EcSubscriptionCommonPassword`: `EC_SUBSCRIPTION_PROPERTY_ID` = 23;
public const val `EcSubscriptionCommonUserName`: `EC_SUBSCRIPTION_PROPERTY_ID` = 22;
public const val `EcSubscriptionConfigurationMode`: `EC_SUBSCRIPTION_PROPERTY_ID` = 8;
public const val `EcSubscriptionContentFormat`: `EC_SUBSCRIPTION_PROPERTY_ID` = 18;
public const val `EcSubscriptionCredBasic`: `EC_SUBSCRIPTION_CREDENTIALS_TYPE` = 3;
public const val `EcSubscriptionCredDefault`: `EC_SUBSCRIPTION_CREDENTIALS_TYPE` = 0;
public const val `EcSubscriptionCredDigest`: `EC_SUBSCRIPTION_CREDENTIALS_TYPE` = 2;
public const val `EcSubscriptionCredLocalMachine`: `EC_SUBSCRIPTION_CREDENTIALS_TYPE` = 4;
public const val `EcSubscriptionCredNegotiate`: `EC_SUBSCRIPTION_CREDENTIALS_TYPE` = 1;
public const val `EcSubscriptionCredentialsType`: `EC_SUBSCRIPTION_PROPERTY_ID` = 21;
public const val `EcSubscriptionDeliveryMaxItems`: `EC_SUBSCRIPTION_PROPERTY_ID` = 14;
public const val `EcSubscriptionDeliveryMaxLatencyTime`: `EC_SUBSCRIPTION_PROPERTY_ID` = 15;
public const val `EcSubscriptionDeliveryMode`: `EC_SUBSCRIPTION_PROPERTY_ID` = 13;
public const val `EcSubscriptionDeniedSubjects`: `EC_SUBSCRIPTION_PROPERTY_ID` = 30;
public const val `EcSubscriptionDescription`: `EC_SUBSCRIPTION_PROPERTY_ID` = 6;
public const val `EcSubscriptionDialect`: `EC_SUBSCRIPTION_PROPERTY_ID` = 26;
public const val `EcSubscriptionEnabled`: `EC_SUBSCRIPTION_PROPERTY_ID` = 0;
public const val `EcSubscriptionEventSourceAddress`: `EC_SUBSCRIPTION_PROPERTY_ID` = 2;
public const val `EcSubscriptionEventSourceEnabled`: `EC_SUBSCRIPTION_PROPERTY_ID` = 3;
public const val `EcSubscriptionEventSourcePassword`: `EC_SUBSCRIPTION_PROPERTY_ID` = 5;
public const val `EcSubscriptionEventSourceUserName`: `EC_SUBSCRIPTION_PROPERTY_ID` = 4;
public const val `EcSubscriptionEventSources`: `EC_SUBSCRIPTION_PROPERTY_ID` = 1;
public const val `EcSubscriptionExpires`: `EC_SUBSCRIPTION_PROPERTY_ID` = 9;
public const val `EcSubscriptionHeartbeatInterval`: `EC_SUBSCRIPTION_PROPERTY_ID` = 16;
public const val `EcSubscriptionHostName`: `EC_SUBSCRIPTION_PROPERTY_ID` = 24;
public const val `EcSubscriptionLocale`: `EC_SUBSCRIPTION_PROPERTY_ID` = 17;
public const val `EcSubscriptionLogFile`: `EC_SUBSCRIPTION_PROPERTY_ID` = 19;
public const val `EcSubscriptionPropertyIdEND`: `EC_SUBSCRIPTION_PROPERTY_ID` = 32;
public const val `EcSubscriptionPublisherName`: `EC_SUBSCRIPTION_PROPERTY_ID` = 20;
public const val `EcSubscriptionQuery`: `EC_SUBSCRIPTION_PROPERTY_ID` = 10;
public const val `EcSubscriptionReadExistingEvents`: `EC_SUBSCRIPTION_PROPERTY_ID` = 25;
public const val `EcSubscriptionRunTimeStatusActive`: `EC_SUBSCRIPTION_RUNTIME_STATUS_INFO_ID` = 0;
public const val `EcSubscriptionRunTimeStatusEventSources`: `EC_SUBSCRIPTION_RUNTIME_STATUS_INFO_ID` = 5;
public const val `EcSubscriptionRunTimeStatusInfoIdEND`: `EC_SUBSCRIPTION_RUNTIME_STATUS_INFO_ID` = 7;
public const val `EcSubscriptionRunTimeStatusLastError`: `EC_SUBSCRIPTION_RUNTIME_STATUS_INFO_ID` = 1;
public const val `EcSubscriptionRunTimeStatusLastErrorMessage`: `EC_SUBSCRIPTION_RUNTIME_STATUS_INFO_ID` = 2;
public const val `EcSubscriptionRunTimeStatusLastErrorTime`: `EC_SUBSCRIPTION_RUNTIME_STATUS_INFO_ID` = 3;
public const val `EcSubscriptionRunTimeStatusLastHeartbeatTime`: `EC_SUBSCRIPTION_RUNTIME_STATUS_INFO_ID` = 6;
public const val `EcSubscriptionRunTimeStatusNextRetryTime`: `EC_SUBSCRIPTION_RUNTIME_STATUS_INFO_ID` = 4;
public const val `EcSubscriptionTransportName`: `EC_SUBSCRIPTION_PROPERTY_ID` = 11;
public const val `EcSubscriptionTransportPort`: `EC_SUBSCRIPTION_PROPERTY_ID` = 12;
public const val `EcSubscriptionType`: `EC_SUBSCRIPTION_PROPERTY_ID` = 27;
public const val `EcSubscriptionTypeCollectorInitiated`: `EC_SUBSCRIPTION_TYPE` = 1;
public const val `EcSubscriptionTypeSourceInitiated`: `EC_SUBSCRIPTION_TYPE` = 0;
public const val `EcSubscriptionURI`: `EC_SUBSCRIPTION_PROPERTY_ID` = 7;
public const val `EcVarObjectArrayPropertyHandle`: `EC_VARIANT_TYPE` = 5;
public const val `EcVarTypeBoolean`: `EC_VARIANT_TYPE` = 1;
public const val `EcVarTypeDateTime`: `EC_VARIANT_TYPE` = 3;
public const val `EcVarTypeNull`: `EC_VARIANT_TYPE` = 0;
public const val `EcVarTypeString`: `EC_VARIANT_TYPE` = 4;
public const val `EcVarTypeUInt32`: `EC_VARIANT_TYPE` = 2;
