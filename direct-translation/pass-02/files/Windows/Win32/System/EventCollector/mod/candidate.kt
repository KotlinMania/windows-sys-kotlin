// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("wecapi.dll" "system" fn EcClose(object : isize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("wecapi.dll" "system" fn EcDeleteSubscription(subscriptionname : windows_sys::core::PCWSTR, flags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("wecapi.dll" "system" fn EcEnumNextSubscription(subscriptionenum : isize, subscriptionnamebuffersize : u32, subscriptionnamebuffer : windows_sys::core::PWSTR, subscriptionnamebufferused : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("wecapi.dll" "system" fn EcGetObjectArrayProperty(objectarray : isize, propertyid : EC_SUBSCRIPTION_PROPERTY_ID, arrayindex : u32, flags : u32, propertyvaluebuffersize : u32, propertyvaluebuffer : *mut EC_VARIANT, propertyvaluebufferused : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("wecapi.dll" "system" fn EcGetObjectArraySize(objectarray : isize, objectarraysize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("wecapi.dll" "system" fn EcGetSubscriptionProperty(subscription : isize, propertyid : EC_SUBSCRIPTION_PROPERTY_ID, flags : u32, propertyvaluebuffersize : u32, propertyvaluebuffer : *mut EC_VARIANT, propertyvaluebufferused : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("wecapi.dll" "system" fn EcGetSubscriptionRunTimeStatus(subscriptionname : windows_sys::core::PCWSTR, statusinfoid : EC_SUBSCRIPTION_RUNTIME_STATUS_INFO_ID, eventsourcename : windows_sys::core::PCWSTR, flags : u32, statusvaluebuffersize : u32, statusvaluebuffer : *mut EC_VARIANT, statusvaluebufferused : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("wecapi.dll" "system" fn EcInsertObjectArrayElement(objectarray : isize, arrayindex : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("wecapi.dll" "system" fn EcOpenSubscription(subscriptionname : windows_sys::core::PCWSTR, accessmask : u32, flags : u32) -> isize);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("wecapi.dll" "system" fn EcOpenSubscriptionEnum(flags : u32) -> isize);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("wecapi.dll" "system" fn EcRemoveObjectArrayElement(objectarray : isize, arrayindex : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// windows_link::link!("wecapi.dll" "system" fn EcRetrySubscription(subscriptionname : windows_sys::core::PCWSTR, eventsourcename : windows_sys::core::PCWSTR, flags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// windows_link::link!("wecapi.dll" "system" fn EcSaveSubscription(subscription : isize, flags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// windows_link::link!("wecapi.dll" "system" fn EcSetObjectArrayProperty(objectarray : isize, propertyid : EC_SUBSCRIPTION_PROPERTY_ID, arrayindex : u32, flags : u32, propertyvalue : *mut EC_VARIANT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// windows_link::link!("wecapi.dll" "system" fn EcSetSubscriptionProperty(subscription : isize, propertyid : EC_SUBSCRIPTION_PROPERTY_ID, flags : u32, propertyvalue : *mut EC_VARIANT) -> windows_sys::core::BOOL);

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
// UNSUPPORTED Rust 28:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EC_VARIANT {
//     pub Anonymous: EC_VARIANT_0,
//     pub Count: u32,
//     pub Type: u32,
// }

// UNSUPPORTED Rust 35:1: declaration Impl has no candidate rule
// impl Default for EC_VARIANT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 40:1: declaration Union has no candidate rule
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

// UNSUPPORTED Rust 53:1: declaration Impl has no candidate rule
// impl Default for EC_VARIANT_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

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
