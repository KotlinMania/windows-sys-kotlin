// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-devices-query-l1-1-0.dll" "system" fn DevCloseObjectQuery(hdevquery : HDEVQUERY));

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Devices_Properties")]
// windows_link::link!("api-ms-win-devices-query-l1-1-0.dll" "system" fn DevCreateObjectQuery(objecttype : DEV_OBJECT_TYPE, queryflags : u32, crequestedproperties : u32, prequestedproperties : *const super::Properties:: DEVPROPCOMPKEY, cfilterexpressioncount : u32, pfilter : *const DEVPROP_FILTER_EXPRESSION, pcallback : PDEV_QUERY_RESULT_CALLBACK, pcontext : *const core::ffi::c_void, phdevquery : *mut HDEVQUERY) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Devices_Properties")]
// windows_link::link!("api-ms-win-devices-query-l1-1-1.dll" "system" fn DevCreateObjectQueryEx(objecttype : DEV_OBJECT_TYPE, queryflags : u32, crequestedproperties : u32, prequestedproperties : *const super::Properties:: DEVPROPCOMPKEY, cfilterexpressioncount : u32, pfilter : *const DEVPROP_FILTER_EXPRESSION, cextendedparametercount : u32, pextendedparameters : *const DEV_QUERY_PARAMETER, pcallback : PDEV_QUERY_RESULT_CALLBACK, pcontext : *const core::ffi::c_void, phdevquery : *mut HDEVQUERY) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Devices_Properties")]
// windows_link::link!("api-ms-win-devices-query-l1-1-0.dll" "system" fn DevCreateObjectQueryFromId(objecttype : DEV_OBJECT_TYPE, pszobjectid : windows_sys::core::PCWSTR, queryflags : u32, crequestedproperties : u32, prequestedproperties : *const super::Properties:: DEVPROPCOMPKEY, cfilterexpressioncount : u32, pfilter : *const DEVPROP_FILTER_EXPRESSION, pcallback : PDEV_QUERY_RESULT_CALLBACK, pcontext : *const core::ffi::c_void, phdevquery : *mut HDEVQUERY) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Devices_Properties")]
// windows_link::link!("api-ms-win-devices-query-l1-1-1.dll" "system" fn DevCreateObjectQueryFromIdEx(objecttype : DEV_OBJECT_TYPE, pszobjectid : windows_sys::core::PCWSTR, queryflags : u32, crequestedproperties : u32, prequestedproperties : *const super::Properties:: DEVPROPCOMPKEY, cfilterexpressioncount : u32, pfilter : *const DEVPROP_FILTER_EXPRESSION, cextendedparametercount : u32, pextendedparameters : *const DEV_QUERY_PARAMETER, pcallback : PDEV_QUERY_RESULT_CALLBACK, pcontext : *const core::ffi::c_void, phdevquery : *mut HDEVQUERY) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Devices_Properties")]
// windows_link::link!("api-ms-win-devices-query-l1-1-0.dll" "system" fn DevCreateObjectQueryFromIds(objecttype : DEV_OBJECT_TYPE, pszzobjectids : windows_sys::core::PCWSTR, queryflags : u32, crequestedproperties : u32, prequestedproperties : *const super::Properties:: DEVPROPCOMPKEY, cfilterexpressioncount : u32, pfilter : *const DEVPROP_FILTER_EXPRESSION, pcallback : PDEV_QUERY_RESULT_CALLBACK, pcontext : *const core::ffi::c_void, phdevquery : *mut HDEVQUERY) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Devices_Properties")]
// windows_link::link!("api-ms-win-devices-query-l1-1-1.dll" "system" fn DevCreateObjectQueryFromIdsEx(objecttype : DEV_OBJECT_TYPE, pszzobjectids : windows_sys::core::PCWSTR, queryflags : u32, crequestedproperties : u32, prequestedproperties : *const super::Properties:: DEVPROPCOMPKEY, cfilterexpressioncount : u32, pfilter : *const DEVPROP_FILTER_EXPRESSION, cextendedparametercount : u32, pextendedparameters : *const DEV_QUERY_PARAMETER, pcallback : PDEV_QUERY_RESULT_CALLBACK, pcontext : *const core::ffi::c_void, phdevquery : *mut HDEVQUERY) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Devices_Properties")]
// windows_link::link!("api-ms-win-devices-query-l1-1-0.dll" "system" fn DevFindProperty(pkey : *const super::super::Foundation:: DEVPROPKEY, store : super::Properties:: DEVPROPSTORE, pszlocalename : windows_sys::core::PCWSTR, cproperties : u32, pproperties : *const super::Properties:: DEVPROPERTY) -> *mut super::Properties:: DEVPROPERTY);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Devices_Properties")]
// windows_link::link!("api-ms-win-devices-query-l1-1-0.dll" "system" fn DevFreeObjectProperties(cpropertycount : u32, pproperties : *const super::Properties:: DEVPROPERTY));

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Devices_Properties")]
// windows_link::link!("api-ms-win-devices-query-l1-1-0.dll" "system" fn DevFreeObjects(cobjectcount : u32, pobjects : *const DEV_OBJECT));

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Devices_Properties")]
// windows_link::link!("api-ms-win-devices-query-l1-1-0.dll" "system" fn DevGetObjectProperties(objecttype : DEV_OBJECT_TYPE, pszobjectid : windows_sys::core::PCWSTR, queryflags : u32, crequestedproperties : u32, prequestedproperties : *const super::Properties:: DEVPROPCOMPKEY, pcpropertycount : *mut u32, ppproperties : *mut *mut super::Properties:: DEVPROPERTY) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Devices_Properties")]
// windows_link::link!("api-ms-win-devices-query-l1-1-1.dll" "system" fn DevGetObjectPropertiesEx(objecttype : DEV_OBJECT_TYPE, pszobjectid : windows_sys::core::PCWSTR, queryflags : u32, crequestedproperties : u32, prequestedproperties : *const super::Properties:: DEVPROPCOMPKEY, cextendedparametercount : u32, pextendedparameters : *const DEV_QUERY_PARAMETER, pcpropertycount : *mut u32, ppproperties : *mut *mut super::Properties:: DEVPROPERTY) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Devices_Properties")]
// windows_link::link!("api-ms-win-devices-query-l1-1-0.dll" "system" fn DevGetObjects(objecttype : DEV_OBJECT_TYPE, queryflags : u32, crequestedproperties : u32, prequestedproperties : *const super::Properties:: DEVPROPCOMPKEY, cfilterexpressioncount : u32, pfilter : *const DEVPROP_FILTER_EXPRESSION, pcobjectcount : *mut u32, ppobjects : *mut *mut DEV_OBJECT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Devices_Properties")]
// windows_link::link!("api-ms-win-devices-query-l1-1-1.dll" "system" fn DevGetObjectsEx(objecttype : DEV_OBJECT_TYPE, queryflags : u32, crequestedproperties : u32, prequestedproperties : *const super::Properties:: DEVPROPCOMPKEY, cfilterexpressioncount : u32, pfilter : *const DEVPROP_FILTER_EXPRESSION, cextendedparametercount : u32, pextendedparameters : *const DEV_QUERY_PARAMETER, pcobjectcount : *mut u32, ppobjects : *mut *mut DEV_OBJECT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 28:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Devices_Properties")]
// #[derive(Clone, Copy, Default)]
// pub struct DEVPROP_FILTER_EXPRESSION {
//     pub Operator: DEVPROP_OPERATOR,
//     pub Property: super::Properties::DEVPROPERTY,
// }

public typealias `DEVPROP_OPERATOR` = UInt;
public const val `DEVPROP_OPERATOR_AND_CLOSE`: `DEVPROP_OPERATOR` = 2097152u;
public const val `DEVPROP_OPERATOR_AND_OPEN`: `DEVPROP_OPERATOR` = 1048576u;
public const val `DEVPROP_OPERATOR_ARRAY_CONTAINS`: `DEVPROP_OPERATOR` = 268435456u;
public const val `DEVPROP_OPERATOR_BEGINS_WITH`: `DEVPROP_OPERATOR` = 9u;
public const val `DEVPROP_OPERATOR_BEGINS_WITH_IGNORE_CASE`: `DEVPROP_OPERATOR` = 131081u;
public const val `DEVPROP_OPERATOR_BITWISE_AND`: `DEVPROP_OPERATOR` = 7u;
public const val `DEVPROP_OPERATOR_BITWISE_OR`: `DEVPROP_OPERATOR` = 8u;
public const val `DEVPROP_OPERATOR_CONTAINS`: `DEVPROP_OPERATOR` = 11u;
public const val `DEVPROP_OPERATOR_CONTAINS_IGNORE_CASE`: `DEVPROP_OPERATOR` = 131083u;
public const val `DEVPROP_OPERATOR_ENDS_WITH`: `DEVPROP_OPERATOR` = 10u;
public const val `DEVPROP_OPERATOR_ENDS_WITH_IGNORE_CASE`: `DEVPROP_OPERATOR` = 131082u;
public const val `DEVPROP_OPERATOR_EQUALS`: `DEVPROP_OPERATOR` = 2u;
public const val `DEVPROP_OPERATOR_EQUALS_IGNORE_CASE`: `DEVPROP_OPERATOR` = 131074u;
public const val `DEVPROP_OPERATOR_EXISTS`: `DEVPROP_OPERATOR` = 1u;
public const val `DEVPROP_OPERATOR_GREATER_THAN`: `DEVPROP_OPERATOR` = 3u;
public const val `DEVPROP_OPERATOR_GREATER_THAN_EQUALS`: `DEVPROP_OPERATOR` = 5u;
public const val `DEVPROP_OPERATOR_LESS_THAN`: `DEVPROP_OPERATOR` = 4u;
public const val `DEVPROP_OPERATOR_LESS_THAN_EQUALS`: `DEVPROP_OPERATOR` = 6u;
public const val `DEVPROP_OPERATOR_LIST_CONTAINS`: `DEVPROP_OPERATOR` = 4096u;
public const val `DEVPROP_OPERATOR_LIST_CONTAINS_IGNORE_CASE`: `DEVPROP_OPERATOR` = 135168u;
public const val `DEVPROP_OPERATOR_LIST_ELEMENT_BEGINS_WITH`: `DEVPROP_OPERATOR` = 8192u;
public const val `DEVPROP_OPERATOR_LIST_ELEMENT_BEGINS_WITH_IGNORE_CASE`: `DEVPROP_OPERATOR` = 139264u;
public const val `DEVPROP_OPERATOR_LIST_ELEMENT_CONTAINS`: `DEVPROP_OPERATOR` = 16384u;
public const val `DEVPROP_OPERATOR_LIST_ELEMENT_CONTAINS_IGNORE_CASE`: `DEVPROP_OPERATOR` = 147456u;
public const val `DEVPROP_OPERATOR_LIST_ELEMENT_ENDS_WITH`: `DEVPROP_OPERATOR` = 12288u;
public const val `DEVPROP_OPERATOR_LIST_ELEMENT_ENDS_WITH_IGNORE_CASE`: `DEVPROP_OPERATOR` = 143360u;
public const val `DEVPROP_OPERATOR_MASK_ARRAY`: `DEVPROP_OPERATOR` = 4026531840u;
public const val `DEVPROP_OPERATOR_MASK_EVAL`: `DEVPROP_OPERATOR` = 4095u;
public const val `DEVPROP_OPERATOR_MASK_LIST`: `DEVPROP_OPERATOR` = 61440u;
public const val `DEVPROP_OPERATOR_MASK_LOGICAL`: `DEVPROP_OPERATOR` = 267386880u;
public const val `DEVPROP_OPERATOR_MASK_MODIFIER`: `DEVPROP_OPERATOR` = 983040u;
public const val `DEVPROP_OPERATOR_MASK_NOT_LOGICAL`: `DEVPROP_OPERATOR` = 4027580415u;
public const val `DEVPROP_OPERATOR_MODIFIER_IGNORE_CASE`: `DEVPROP_OPERATOR` = 131072u;
public const val `DEVPROP_OPERATOR_MODIFIER_NOT`: `DEVPROP_OPERATOR` = 65536u;
public const val `DEVPROP_OPERATOR_NONE`: `DEVPROP_OPERATOR` = 0u;
public const val `DEVPROP_OPERATOR_NOT_CLOSE`: `DEVPROP_OPERATOR` = 6291456u;
public const val `DEVPROP_OPERATOR_NOT_EQUALS`: `DEVPROP_OPERATOR` = 65538u;
public const val `DEVPROP_OPERATOR_NOT_EQUALS_IGNORE_CASE`: `DEVPROP_OPERATOR` = 196610u;
public const val `DEVPROP_OPERATOR_NOT_EXISTS`: `DEVPROP_OPERATOR` = 65537u;
public const val `DEVPROP_OPERATOR_NOT_OPEN`: `DEVPROP_OPERATOR` = 5242880u;
public const val `DEVPROP_OPERATOR_OR_CLOSE`: `DEVPROP_OPERATOR` = 4194304u;
public const val `DEVPROP_OPERATOR_OR_OPEN`: `DEVPROP_OPERATOR` = 3145728u;
// UNSUPPORTED Rust 78:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Devices_Properties")]
// #[derive(Clone, Copy)]
// pub struct DEV_OBJECT {
//     pub ObjectType: DEV_OBJECT_TYPE,
//     pub pszObjectId: windows_sys::core::PCWSTR,
//     pub cPropertyCount: u32,
//     pub pProperties: *const super::Properties::DEVPROPERTY,
// }

// UNSUPPORTED Rust 87:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Devices_Properties")]
// impl Default for DEV_OBJECT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DEV_OBJECT_TYPE` = Int;
public typealias `DEV_QUERY_FLAGS` = Int;
// UNSUPPORTED Rust 95:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Devices_Properties")]
// #[derive(Clone, Copy)]
// pub struct DEV_QUERY_PARAMETER {
//     pub Key: super::super::Foundation::DEVPROPKEY,
//     pub Type: super::Properties::DEVPROPTYPE,
//     pub BufferSize: u32,
//     pub Buffer: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 104:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Devices_Properties")]
// impl Default for DEV_QUERY_PARAMETER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DEV_QUERY_RESULT_ACTION` = Int;
// UNSUPPORTED Rust 111:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Devices_Properties")]
// #[derive(Clone, Copy)]
// pub struct DEV_QUERY_RESULT_ACTION_DATA {
//     pub Action: DEV_QUERY_RESULT_ACTION,
//     pub Data: DEV_QUERY_RESULT_ACTION_DATA_0,
// }

// UNSUPPORTED Rust 118:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Devices_Properties")]
// impl Default for DEV_QUERY_RESULT_ACTION_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 124:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Devices_Properties")]
// #[derive(Clone, Copy)]
// pub union DEV_QUERY_RESULT_ACTION_DATA_0 {
//     pub State: DEV_QUERY_STATE,
//     pub DeviceObject: DEV_OBJECT,
// }

// UNSUPPORTED Rust 131:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Devices_Properties")]
// impl Default for DEV_QUERY_RESULT_ACTION_DATA_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DEV_QUERY_STATE` = Int;
public const val `DevObjectTypeAEP`: `DEV_OBJECT_TYPE` = 5;
public const val `DevObjectTypeAEPContainer`: `DEV_OBJECT_TYPE` = 6;
public const val `DevObjectTypeAEPService`: `DEV_OBJECT_TYPE` = 10;
public const val `DevObjectTypeDevice`: `DEV_OBJECT_TYPE` = 3;
public const val `DevObjectTypeDeviceContainer`: `DEV_OBJECT_TYPE` = 2;
public const val `DevObjectTypeDeviceContainerDisplay`: `DEV_OBJECT_TYPE` = 9;
public const val `DevObjectTypeDeviceInstallerClass`: `DEV_OBJECT_TYPE` = 7;
public const val `DevObjectTypeDeviceInterface`: `DEV_OBJECT_TYPE` = 1;
public const val `DevObjectTypeDeviceInterfaceClass`: `DEV_OBJECT_TYPE` = 4;
public const val `DevObjectTypeDeviceInterfaceDisplay`: `DEV_OBJECT_TYPE` = 8;
public const val `DevObjectTypeDevicePanel`: `DEV_OBJECT_TYPE` = 11;
public const val `DevObjectTypeUnknown`: `DEV_OBJECT_TYPE` = 0;
public const val `DevQueryFlagAllProperties`: `DEV_QUERY_FLAGS` = 2;
public const val `DevQueryFlagAsyncClose`: `DEV_QUERY_FLAGS` = 8;
public const val `DevQueryFlagLocalize`: `DEV_QUERY_FLAGS` = 4;
public const val `DevQueryFlagNone`: `DEV_QUERY_FLAGS` = 0;
public const val `DevQueryFlagUpdateResults`: `DEV_QUERY_FLAGS` = 1;
public const val `DevQueryResultAdd`: `DEV_QUERY_RESULT_ACTION` = 1;
public const val `DevQueryResultRemove`: `DEV_QUERY_RESULT_ACTION` = 3;
public const val `DevQueryResultStateChange`: `DEV_QUERY_RESULT_ACTION` = 0;
public const val `DevQueryResultUpdate`: `DEV_QUERY_RESULT_ACTION` = 2;
public const val `DevQueryStateAborted`: `DEV_QUERY_STATE` = 2;
public const val `DevQueryStateClosed`: `DEV_QUERY_STATE` = 3;
public const val `DevQueryStateEnumCompleted`: `DEV_QUERY_STATE` = 1;
public const val `DevQueryStateInitialized`: `DEV_QUERY_STATE` = 0;
// UNSUPPORTED Rust 163:1: non-scalar type Ptr unsupported
// pub type HDEVQUERY = *mut core::ffi::c_void;

// UNSUPPORTED Rust 164:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Devices_Properties")]
// pub type PDEV_QUERY_RESULT_CALLBACK = Option<unsafe extern "system" fn(hdevquery: HDEVQUERY, pcontext: *const core::ffi::c_void, pactiondata: *const DEV_QUERY_RESULT_ACTION_DATA)>;

