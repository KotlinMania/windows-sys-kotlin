// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ondemandconnroutehelper.dll, ABI=system, export=FreeInterfaceContextTable; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FreeInterfaceContextTable`(`interfacecontexttable` : /* Rust *const */ kotlinx.cinterop.CPointer<`NET_INTERFACE_CONTEXT_TABLE`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ondemandconnroutehelper.dll, ABI=system, export=GetInterfaceContextTableForHostName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetInterfaceContextTableForHostName`(`hostname` : `windows_sys`.`core`.`PCWSTR`, `proxyname` : `windows_sys`.`core`.`PCWSTR`, `flags` : UInt, `connectionprofilefilterrawdata` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `connectionprofilefilterrawdatasize` : UInt, `interfacecontexttable` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`NET_INTERFACE_CONTEXT_TABLE`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ondemandconnroutehelper.dll, ABI=system, export=OnDemandGetRoutingHint; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OnDemandGetRoutingHint`(`destinationhostname` : `windows_sys`.`core`.`PCWSTR`, `interfaceindex` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ondemandconnroutehelper.dll, ABI=system, export=OnDemandRegisterNotification; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OnDemandRegisterNotification`(`callback` : `ONDEMAND_NOTIFICATION_CALLBACK`, `callbackcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `registrationhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ondemandconnroutehelper.dll, ABI=system, export=OnDemandUnRegisterNotification; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OnDemandUnRegisterNotification`(`registrationhandle` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wcmapi.dll, ABI=system, export=WcmFreeMemory; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WcmFreeMemory`(`pmemory` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wcmapi.dll, ABI=system, export=WcmGetProfileList; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WcmGetProfileList`(`preserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppprofilelist` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WCM_PROFILE_INFO_LIST`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wcmapi.dll, ABI=system, export=WcmQueryProperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WcmQueryProperty`(`pinterface` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `strprofilename` : `windows_sys`.`core`.`PCWSTR`, `property` : `WCM_PROPERTY`, `preserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pdwdatasize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `ppdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wcmapi.dll, ABI=system, export=WcmSetProfileList; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WcmSetProfileList`(`pprofilelist` : /* Rust *const */ kotlinx.cinterop.CPointer<`WCM_PROFILE_INFO_LIST`>?, `dwposition` : UInt, `fignoreunknownprofiles` : `windows_sys`.`core`.`BOOL`, `preserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wcmapi.dll, ABI=system, export=WcmSetProperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WcmSetProperty`(`pinterface` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `strprofilename` : `windows_sys`.`core`.`PCWSTR`, `property` : `WCM_PROPERTY`, `preserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwdatasize` : UInt, `pbdata` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : UInt
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NET_INTERFACE_CONTEXT` (
    public var `InterfaceIndex`: UInt,
    public var `ConfigurationName`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 17:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NET_INTERFACE_CONTEXT {
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
public class `NET_INTERFACE_CONTEXT_TABLE` (
    public var `InterfaceContextHandle`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `NumberOfEntries`: UInt,
    public var `InterfaceContextArray`: /* Rust *mut */ kotlinx.cinterop.CPointer<`NET_INTERFACE_CONTEXT`>?,
)
// UNSUPPORTED Rust 29:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NET_INTERFACE_CONTEXT_TABLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NET_INTERFACE_FLAG_CONNECT_IF_NEEDED`: UInt = 1u;
public const val `NET_INTERFACE_FLAG_NONE`: UInt = 0u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `ONDEMAND_NOTIFICATION_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
public const val `WCM_API_VERSION`: UInt = 1u;
public const val `WCM_API_VERSION_1_0`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WCM_BILLING_CYCLE_INFO` (
    public var `StartDate`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `Duration`: `WCM_TIME_INTERVAL`,
    public var `Reset`: `windows_sys`.`core`.`BOOL`,
)
public typealias `WCM_CONNECTION_COST` = Int;
public const val `WCM_CONNECTION_COST_APPROACHINGDATALIMIT`: `WCM_CONNECTION_COST` = 524288;
public const val `WCM_CONNECTION_COST_CONGESTED`: `WCM_CONNECTION_COST` = 131072;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WCM_CONNECTION_COST_DATA` (
    public var `ConnectionCost`: UInt,
    public var `CostSource`: `WCM_CONNECTION_COST_SOURCE`,
)
public const val `WCM_CONNECTION_COST_FIXED`: `WCM_CONNECTION_COST` = 2;
public const val `WCM_CONNECTION_COST_OVERDATALIMIT`: `WCM_CONNECTION_COST` = 65536;
public const val `WCM_CONNECTION_COST_ROAMING`: `WCM_CONNECTION_COST` = 262144;
public typealias `WCM_CONNECTION_COST_SOURCE` = Int;
public const val `WCM_CONNECTION_COST_SOURCE_DEFAULT`: `WCM_CONNECTION_COST_SOURCE` = 0;
public const val `WCM_CONNECTION_COST_SOURCE_GP`: `WCM_CONNECTION_COST_SOURCE` = 1;
public const val `WCM_CONNECTION_COST_SOURCE_OPERATOR`: `WCM_CONNECTION_COST_SOURCE` = 3;
public const val `WCM_CONNECTION_COST_SOURCE_USER`: `WCM_CONNECTION_COST_SOURCE` = 2;
public const val `WCM_CONNECTION_COST_UNKNOWN`: `WCM_CONNECTION_COST` = 0;
public const val `WCM_CONNECTION_COST_UNRESTRICTED`: `WCM_CONNECTION_COST` = 1;
public const val `WCM_CONNECTION_COST_VARIABLE`: `WCM_CONNECTION_COST` = 4;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WCM_DATAPLAN_STATUS` (
    public var `UsageData`: `WCM_USAGE_DATA`,
    public var `DataLimitInMegabytes`: UInt,
    public var `InboundBandwidthInKbps`: UInt,
    public var `OutboundBandwidthInKbps`: UInt,
    public var `BillingCycle`: `WCM_BILLING_CYCLE_INFO`,
    public var `MaxTransferSizeInMegabytes`: UInt,
    public var `Reserved`: UInt,
)
public const val `WCM_MAX_PROFILE_NAME`: UInt = 256u;
public typealias `WCM_MEDIA_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WCM_POLICY_VALUE` (
    public var `fValue`: `windows_sys`.`core`.`BOOL`,
    public var `fIsGroupPolicy`: `windows_sys`.`core`.`BOOL`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WCM_PROFILE_INFO` (
    public var `strProfileName`: UShortArray,
    public var `AdapterGUID`: `windows_sys`.`core`.`GUID`,
    public var `Media`: `WCM_MEDIA_TYPE`,
)
// UNSUPPORTED Rust 92:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WCM_PROFILE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WCM_PROFILE_INFO_LIST` (
    public var `dwNumberOfItems`: UInt,
    public var `ProfileInfo`: Array<`WCM_PROFILE_INFO`>,
)
// UNSUPPORTED Rust 103:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WCM_PROFILE_INFO_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WCM_PROPERTY` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WCM_TIME_INTERVAL` (
    public var `wYear`: UShort,
    public var `wMonth`: UShort,
    public var `wDay`: UShort,
    public var `wHour`: UShort,
    public var `wMinute`: UShort,
    public var `wSecond`: UShort,
    public var `wMilliseconds`: UShort,
)
public const val `WCM_UNKNOWN_DATAPLAN_STATUS`: UInt = 4294967295u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WCM_USAGE_DATA` (
    public var `UsageInMegabytes`: UInt,
    public var `LastSyncTime`: `super`.`super`.`Foundation`.`FILETIME`,
)
public const val `wcm_global_property_domain_policy`: `WCM_PROPERTY` = 0;
public const val `wcm_global_property_minimize_policy`: `WCM_PROPERTY` = 1;
public const val `wcm_global_property_powermanagement_policy`: `WCM_PROPERTY` = 3;
public const val `wcm_global_property_roaming_policy`: `WCM_PROPERTY` = 2;
public const val `wcm_intf_property_connection_cost`: `WCM_PROPERTY` = 4;
public const val `wcm_intf_property_dataplan_status`: `WCM_PROPERTY` = 5;
public const val `wcm_intf_property_hotspot_profile`: `WCM_PROPERTY` = 6;
public const val `wcm_media_ethernet`: `WCM_MEDIA_TYPE` = 1;
public const val `wcm_media_invalid`: `WCM_MEDIA_TYPE` = 4;
public const val `wcm_media_max`: `WCM_MEDIA_TYPE` = 5;
public const val `wcm_media_mbn`: `WCM_MEDIA_TYPE` = 3;
public const val `wcm_media_unknown`: `WCM_MEDIA_TYPE` = 0;
public const val `wcm_media_wlan`: `WCM_MEDIA_TYPE` = 2;
