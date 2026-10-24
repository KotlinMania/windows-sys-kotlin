// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("fxsutility.dll" "system" fn CanSendToFaxRecipient() -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("winfax.dll" "system" fn FaxAbort(faxhandle : super::super::Foundation:: HANDLE, jobid : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("winfax.dll" "system" fn FaxAccessCheck(faxhandle : super::super::Foundation:: HANDLE, accessmask : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("winfax.dll" "system" fn FaxClose(faxhandle : super::super::Foundation:: HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("winfax.dll" "system" fn FaxCompleteJobParamsA(jobparams : *mut *mut FAX_JOB_PARAMA, coverpageinfo : *mut *mut FAX_COVERPAGE_INFOA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("winfax.dll" "system" fn FaxCompleteJobParamsW(jobparams : *mut *mut FAX_JOB_PARAMW, coverpageinfo : *mut *mut FAX_COVERPAGE_INFOW) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("winfax.dll" "system" fn FaxConnectFaxServerA(machinename : windows_sys::core::PCSTR, faxhandle : *mut super::super::Foundation:: HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("winfax.dll" "system" fn FaxConnectFaxServerW(machinename : windows_sys::core::PCWSTR, faxhandle : *mut super::super::Foundation:: HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("winfax.dll" "system" fn FaxEnableRoutingMethodA(faxporthandle : super::super::Foundation:: HANDLE, routingguid : windows_sys::core::PCSTR, enabled : windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("winfax.dll" "system" fn FaxEnableRoutingMethodW(faxporthandle : super::super::Foundation:: HANDLE, routingguid : windows_sys::core::PCWSTR, enabled : windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("winfax.dll" "system" fn FaxEnumGlobalRoutingInfoA(faxhandle : super::super::Foundation:: HANDLE, routinginfo : *mut *mut FAX_GLOBAL_ROUTING_INFOA, methodsreturned : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// windows_link::link!("winfax.dll" "system" fn FaxEnumGlobalRoutingInfoW(faxhandle : super::super::Foundation:: HANDLE, routinginfo : *mut *mut FAX_GLOBAL_ROUTING_INFOW, methodsreturned : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// windows_link::link!("winfax.dll" "system" fn FaxEnumJobsA(faxhandle : super::super::Foundation:: HANDLE, jobentry : *mut *mut FAX_JOB_ENTRYA, jobsreturned : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// windows_link::link!("winfax.dll" "system" fn FaxEnumJobsW(faxhandle : super::super::Foundation:: HANDLE, jobentry : *mut *mut FAX_JOB_ENTRYW, jobsreturned : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// windows_link::link!("winfax.dll" "system" fn FaxEnumPortsA(faxhandle : super::super::Foundation:: HANDLE, portinfo : *mut *mut FAX_PORT_INFOA, portsreturned : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// windows_link::link!("winfax.dll" "system" fn FaxEnumPortsW(faxhandle : super::super::Foundation:: HANDLE, portinfo : *mut *mut FAX_PORT_INFOW, portsreturned : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// windows_link::link!("winfax.dll" "system" fn FaxEnumRoutingMethodsA(faxporthandle : super::super::Foundation:: HANDLE, routingmethod : *mut *mut FAX_ROUTING_METHODA, methodsreturned : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// windows_link::link!("winfax.dll" "system" fn FaxEnumRoutingMethodsW(faxporthandle : super::super::Foundation:: HANDLE, routingmethod : *mut *mut FAX_ROUTING_METHODW, methodsreturned : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// windows_link::link!("winfax.dll" "system" fn FaxFreeBuffer(buffer : *mut core::ffi::c_void));

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// windows_link::link!("winfax.dll" "system" fn FaxGetConfigurationA(faxhandle : super::super::Foundation:: HANDLE, faxconfig : *mut *mut FAX_CONFIGURATIONA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// windows_link::link!("winfax.dll" "system" fn FaxGetConfigurationW(faxhandle : super::super::Foundation:: HANDLE, faxconfig : *mut *mut FAX_CONFIGURATIONW) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// windows_link::link!("winfax.dll" "system" fn FaxGetDeviceStatusA(faxporthandle : super::super::Foundation:: HANDLE, devicestatus : *mut *mut FAX_DEVICE_STATUSA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// windows_link::link!("winfax.dll" "system" fn FaxGetDeviceStatusW(faxporthandle : super::super::Foundation:: HANDLE, devicestatus : *mut *mut FAX_DEVICE_STATUSW) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// windows_link::link!("winfax.dll" "system" fn FaxGetJobA(faxhandle : super::super::Foundation:: HANDLE, jobid : u32, jobentry : *mut *mut FAX_JOB_ENTRYA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// windows_link::link!("winfax.dll" "system" fn FaxGetJobW(faxhandle : super::super::Foundation:: HANDLE, jobid : u32, jobentry : *mut *mut FAX_JOB_ENTRYW) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// windows_link::link!("winfax.dll" "system" fn FaxGetLoggingCategoriesA(faxhandle : super::super::Foundation:: HANDLE, categories : *mut *mut FAX_LOG_CATEGORYA, numbercategories : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// windows_link::link!("winfax.dll" "system" fn FaxGetLoggingCategoriesW(faxhandle : super::super::Foundation:: HANDLE, categories : *mut *mut FAX_LOG_CATEGORYW, numbercategories : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// windows_link::link!("winfax.dll" "system" fn FaxGetPageData(faxhandle : super::super::Foundation:: HANDLE, jobid : u32, buffer : *mut *mut u8, buffersize : *mut u32, imagewidth : *mut u32, imageheight : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 29:1: declaration Macro has no candidate rule
// windows_link::link!("winfax.dll" "system" fn FaxGetPortA(faxporthandle : super::super::Foundation:: HANDLE, portinfo : *mut *mut FAX_PORT_INFOA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 30:1: declaration Macro has no candidate rule
// windows_link::link!("winfax.dll" "system" fn FaxGetPortW(faxporthandle : super::super::Foundation:: HANDLE, portinfo : *mut *mut FAX_PORT_INFOW) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 31:1: declaration Macro has no candidate rule
// windows_link::link!("winfax.dll" "system" fn FaxGetRoutingInfoA(faxporthandle : super::super::Foundation:: HANDLE, routingguid : windows_sys::core::PCSTR, routinginfobuffer : *mut *mut u8, routinginfobuffersize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 32:1: declaration Macro has no candidate rule
// windows_link::link!("winfax.dll" "system" fn FaxGetRoutingInfoW(faxporthandle : super::super::Foundation:: HANDLE, routingguid : windows_sys::core::PCWSTR, routinginfobuffer : *mut *mut u8, routinginfobuffersize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 33:1: declaration Macro has no candidate rule
// windows_link::link!("winfax.dll" "system" fn FaxInitializeEventQueue(faxhandle : super::super::Foundation:: HANDLE, completionport : super::super::Foundation:: HANDLE, completionkey : usize, hwnd : super::super::Foundation:: HWND, messagestart : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 34:1: declaration Macro has no candidate rule
// windows_link::link!("winfax.dll" "system" fn FaxOpenPort(faxhandle : super::super::Foundation:: HANDLE, deviceid : u32, flags : u32, faxporthandle : *mut super::super::Foundation:: HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 35:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("winfax.dll" "system" fn FaxPrintCoverPageA(faxcontextinfo : *const FAX_CONTEXT_INFOA, coverpageinfo : *const FAX_COVERPAGE_INFOA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 37:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("winfax.dll" "system" fn FaxPrintCoverPageW(faxcontextinfo : *const FAX_CONTEXT_INFOW, coverpageinfo : *const FAX_COVERPAGE_INFOW) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 39:1: declaration Macro has no candidate rule
// windows_link::link!("winfax.dll" "system" fn FaxRegisterRoutingExtensionW(faxhandle : super::super::Foundation:: HANDLE, extensionname : windows_sys::core::PCWSTR, friendlyname : windows_sys::core::PCWSTR, imagename : windows_sys::core::PCWSTR, callback : PFAX_ROUTING_INSTALLATION_CALLBACKW, context : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 40:1: declaration Macro has no candidate rule
// windows_link::link!("winfax.dll" "system" fn FaxRegisterServiceProviderW(deviceprovider : windows_sys::core::PCWSTR, friendlyname : windows_sys::core::PCWSTR, imagename : windows_sys::core::PCWSTR, tspname : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 41:1: declaration Macro has no candidate rule
// windows_link::link!("winfax.dll" "system" fn FaxSendDocumentA(faxhandle : super::super::Foundation:: HANDLE, filename : windows_sys::core::PCSTR, jobparams : *const FAX_JOB_PARAMA, coverpageinfo : *const FAX_COVERPAGE_INFOA, faxjobid : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 42:1: declaration Macro has no candidate rule
// windows_link::link!("winfax.dll" "system" fn FaxSendDocumentForBroadcastA(faxhandle : super::super::Foundation:: HANDLE, filename : windows_sys::core::PCSTR, faxjobid : *mut u32, faxrecipientcallback : PFAX_RECIPIENT_CALLBACKA, context : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 43:1: declaration Macro has no candidate rule
// windows_link::link!("winfax.dll" "system" fn FaxSendDocumentForBroadcastW(faxhandle : super::super::Foundation:: HANDLE, filename : windows_sys::core::PCWSTR, faxjobid : *mut u32, faxrecipientcallback : PFAX_RECIPIENT_CALLBACKW, context : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 44:1: declaration Macro has no candidate rule
// windows_link::link!("winfax.dll" "system" fn FaxSendDocumentW(faxhandle : super::super::Foundation:: HANDLE, filename : windows_sys::core::PCWSTR, jobparams : *const FAX_JOB_PARAMW, coverpageinfo : *const FAX_COVERPAGE_INFOW, faxjobid : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 45:1: declaration Macro has no candidate rule
// windows_link::link!("winfax.dll" "system" fn FaxSetConfigurationA(faxhandle : super::super::Foundation:: HANDLE, faxconfig : *const FAX_CONFIGURATIONA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 46:1: declaration Macro has no candidate rule
// windows_link::link!("winfax.dll" "system" fn FaxSetConfigurationW(faxhandle : super::super::Foundation:: HANDLE, faxconfig : *const FAX_CONFIGURATIONW) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 47:1: declaration Macro has no candidate rule
// windows_link::link!("winfax.dll" "system" fn FaxSetGlobalRoutingInfoA(faxhandle : super::super::Foundation:: HANDLE, routinginfo : *const FAX_GLOBAL_ROUTING_INFOA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 48:1: declaration Macro has no candidate rule
// windows_link::link!("winfax.dll" "system" fn FaxSetGlobalRoutingInfoW(faxhandle : super::super::Foundation:: HANDLE, routinginfo : *const FAX_GLOBAL_ROUTING_INFOW) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 49:1: declaration Macro has no candidate rule
// windows_link::link!("winfax.dll" "system" fn FaxSetJobA(faxhandle : super::super::Foundation:: HANDLE, jobid : u32, command : u32, jobentry : *const FAX_JOB_ENTRYA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 50:1: declaration Macro has no candidate rule
// windows_link::link!("winfax.dll" "system" fn FaxSetJobW(faxhandle : super::super::Foundation:: HANDLE, jobid : u32, command : u32, jobentry : *const FAX_JOB_ENTRYW) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 51:1: declaration Macro has no candidate rule
// windows_link::link!("winfax.dll" "system" fn FaxSetLoggingCategoriesA(faxhandle : super::super::Foundation:: HANDLE, categories : *const FAX_LOG_CATEGORYA, numbercategories : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 52:1: declaration Macro has no candidate rule
// windows_link::link!("winfax.dll" "system" fn FaxSetLoggingCategoriesW(faxhandle : super::super::Foundation:: HANDLE, categories : *const FAX_LOG_CATEGORYW, numbercategories : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 53:1: declaration Macro has no candidate rule
// windows_link::link!("winfax.dll" "system" fn FaxSetPortA(faxporthandle : super::super::Foundation:: HANDLE, portinfo : *const FAX_PORT_INFOA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 54:1: declaration Macro has no candidate rule
// windows_link::link!("winfax.dll" "system" fn FaxSetPortW(faxporthandle : super::super::Foundation:: HANDLE, portinfo : *const FAX_PORT_INFOW) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 55:1: declaration Macro has no candidate rule
// windows_link::link!("winfax.dll" "system" fn FaxSetRoutingInfoA(faxporthandle : super::super::Foundation:: HANDLE, routingguid : windows_sys::core::PCSTR, routinginfobuffer : *const u8, routinginfobuffersize : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 56:1: declaration Macro has no candidate rule
// windows_link::link!("winfax.dll" "system" fn FaxSetRoutingInfoW(faxporthandle : super::super::Foundation:: HANDLE, routingguid : windows_sys::core::PCWSTR, routinginfobuffer : *const u8, routinginfobuffersize : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 57:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("winfax.dll" "system" fn FaxStartPrintJobA(printername : windows_sys::core::PCSTR, printinfo : *const FAX_PRINT_INFOA, faxjobid : *mut u32, faxcontextinfo : *mut FAX_CONTEXT_INFOA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 59:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("winfax.dll" "system" fn FaxStartPrintJobW(printername : windows_sys::core::PCWSTR, printinfo : *const FAX_PRINT_INFOW, faxjobid : *mut u32, faxcontextinfo : *mut FAX_CONTEXT_INFOW) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 61:1: declaration Macro has no candidate rule
// windows_link::link!("winfax.dll" "system" fn FaxUnregisterServiceProviderW(deviceprovider : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 62:1: declaration Macro has no candidate rule
// windows_link::link!("fxsutility.dll" "system" fn SendToFaxRecipient(sndmode : SendToMode, lpfilename : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 63:1: declaration Macro has no candidate rule
// windows_link::link!("sti.dll" "system" fn StiCreateInstanceW(hinst : super::super::Foundation:: HINSTANCE, dwver : u32, ppsti : *mut * mut core::ffi::c_void, punkouter : * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 64:1: non-scalar type Ptr unsupported
// pub const CF_MSFAXSRV_DEVICE_ID: windows_sys::core::PCWSTR = windows_sys::core::w!("FAXSRV_DeviceID");

// UNSUPPORTED Rust 65:1: non-scalar type Ptr unsupported
// pub const CF_MSFAXSRV_FSP_GUID: windows_sys::core::PCWSTR = windows_sys::core::w!("FAXSRV_FSPGuid");

// UNSUPPORTED Rust 66:1: non-scalar type Ptr unsupported
// pub const CF_MSFAXSRV_ROUTEEXT_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("FAXSRV_RoutingExtName");

// UNSUPPORTED Rust 67:1: non-scalar type Ptr unsupported
// pub const CF_MSFAXSRV_ROUTING_METHOD_GUID: windows_sys::core::PCWSTR = windows_sys::core::w!("FAXSRV_RoutingMethodGuid");

// UNSUPPORTED Rust 68:1: non-scalar type Ptr unsupported
// pub const CF_MSFAXSRV_SERVER_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("FAXSRV_ServerName");

// UNSUPPORTED Rust 69:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CLSID_Sti: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb323f8e0_2e68_11d0_90ea_00aa0060f86c);

// UNSUPPORTED Rust 70:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_WIA_DeviceType: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x6bdd1fc6_810f_11d0_bec7_08002be2092f), pid: 2 };

// UNSUPPORTED Rust 71:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_WIA_USDClassId: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x6bdd1fc6_810f_11d0_bec7_08002be2092f), pid: 3 };

public const val `DEV_ID_SRC_FAX`: `FAX_ENUM_DEVICE_ID_SOURCE` = 0;
public const val `DEV_ID_SRC_TAPI`: `FAX_ENUM_DEVICE_ID_SOURCE` = 1;
public const val `DRT_EMAIL`: `FAX_ENUM_DELIVERY_REPORT_TYPES` = 1;
public const val `DRT_INBOX`: `FAX_ENUM_DELIVERY_REPORT_TYPES` = 2;
public const val `DRT_NONE`: `FAX_ENUM_DELIVERY_REPORT_TYPES` = 0;
public const val `FAXDEVRECEIVE_SIZE`: UInt = 4096u;
public const val `FAXDEVREPORTSTATUS_SIZE`: UInt = 4096u;
public const val `FAXLOG_CATEGORY_INBOUND`: `FAX_ENUM_LOG_CATEGORIES` = 3;
public const val `FAXLOG_CATEGORY_INIT`: `FAX_ENUM_LOG_CATEGORIES` = 1;
public const val `FAXLOG_CATEGORY_OUTBOUND`: `FAX_ENUM_LOG_CATEGORIES` = 2;
public const val `FAXLOG_CATEGORY_UNKNOWN`: `FAX_ENUM_LOG_CATEGORIES` = 4;
public const val `FAXLOG_LEVEL_MAX`: `FAX_ENUM_LOG_LEVELS` = 3;
public const val `FAXLOG_LEVEL_MED`: `FAX_ENUM_LOG_LEVELS` = 2;
public const val `FAXLOG_LEVEL_MIN`: `FAX_ENUM_LOG_LEVELS` = 1;
public const val `FAXLOG_LEVEL_NONE`: `FAX_ENUM_LOG_LEVELS` = 0;
public typealias `FAXROUTE_ENABLE` = Int;
// UNSUPPORTED Rust 88:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FAXSRV_DEVICE_NODETYPE_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3115a19a_6251_46ac_9425_14782858b8c9);

// UNSUPPORTED Rust 89:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FAXSRV_DEVICE_PROVIDER_NODETYPE_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbd38e2ac_b926_4161_8640_0f6956ee2ba3);

// UNSUPPORTED Rust 90:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FAXSRV_ROUTING_METHOD_NODETYPE_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x220d2cb0_85a9_4a43_b6e8_9d66b44f1af5);

public typealias `FAX_ACCESS_RIGHTS_ENUM` = Int;
public typealias `FAX_ACCESS_RIGHTS_ENUM_2` = Int;
public typealias `FAX_ACCOUNT_EVENTS_TYPE_ENUM` = Int;
// UNSUPPORTED Rust 94:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FAX_CONFIGURATIONA {
//     pub SizeOfStruct: u32,
//     pub Retries: u32,
//     pub RetryDelay: u32,
//     pub DirtyDays: u32,
//     pub Branding: windows_sys::core::BOOL,
//     pub UseDeviceTsid: windows_sys::core::BOOL,
//     pub ServerCp: windows_sys::core::BOOL,
//     pub PauseServerQueue: windows_sys::core::BOOL,
//     pub StartCheapTime: FAX_TIME,
//     pub StopCheapTime: FAX_TIME,
//     pub ArchiveOutgoingFaxes: windows_sys::core::BOOL,
//     pub ArchiveDirectory: windows_sys::core::PCSTR,
//     pub Reserved: windows_sys::core::PCSTR,
// }

// UNSUPPORTED Rust 111:1: declaration Impl has no candidate rule
// impl Default for FAX_CONFIGURATIONA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 116:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FAX_CONFIGURATIONW {
//     pub SizeOfStruct: u32,
//     pub Retries: u32,
//     pub RetryDelay: u32,
//     pub DirtyDays: u32,
//     pub Branding: windows_sys::core::BOOL,
//     pub UseDeviceTsid: windows_sys::core::BOOL,
//     pub ServerCp: windows_sys::core::BOOL,
//     pub PauseServerQueue: windows_sys::core::BOOL,
//     pub StartCheapTime: FAX_TIME,
//     pub StopCheapTime: FAX_TIME,
//     pub ArchiveOutgoingFaxes: windows_sys::core::BOOL,
//     pub ArchiveDirectory: windows_sys::core::PCWSTR,
//     pub Reserved: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 133:1: declaration Impl has no candidate rule
// impl Default for FAX_CONFIGURATIONW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FAX_CONFIG_QUERY`: UInt = 4u;
public const val `FAX_CONFIG_SET`: UInt = 8u;
// UNSUPPORTED Rust 140:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// #[derive(Clone, Copy)]
// pub struct FAX_CONTEXT_INFOA {
//     pub SizeOfStruct: u32,
//     pub hDC: super::super::Graphics::Gdi::HDC,
//     pub ServerName: [i8; 16],
// }

// UNSUPPORTED Rust 148:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for FAX_CONTEXT_INFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 154:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// #[derive(Clone, Copy)]
// pub struct FAX_CONTEXT_INFOW {
//     pub SizeOfStruct: u32,
//     pub hDC: super::super::Graphics::Gdi::HDC,
//     pub ServerName: [u16; 16],
// }

// UNSUPPORTED Rust 162:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for FAX_CONTEXT_INFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 168:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FAX_COVERPAGE_INFOA {
//     pub SizeOfStruct: u32,
//     pub CoverPageName: windows_sys::core::PCSTR,
//     pub UseServerCoverPage: windows_sys::core::BOOL,
//     pub RecName: windows_sys::core::PCSTR,
//     pub RecFaxNumber: windows_sys::core::PCSTR,
//     pub RecCompany: windows_sys::core::PCSTR,
//     pub RecStreetAddress: windows_sys::core::PCSTR,
//     pub RecCity: windows_sys::core::PCSTR,
//     pub RecState: windows_sys::core::PCSTR,
//     pub RecZip: windows_sys::core::PCSTR,
//     pub RecCountry: windows_sys::core::PCSTR,
//     pub RecTitle: windows_sys::core::PCSTR,
//     pub RecDepartment: windows_sys::core::PCSTR,
//     pub RecOfficeLocation: windows_sys::core::PCSTR,
//     pub RecHomePhone: windows_sys::core::PCSTR,
//     pub RecOfficePhone: windows_sys::core::PCSTR,
//     pub SdrName: windows_sys::core::PCSTR,
//     pub SdrFaxNumber: windows_sys::core::PCSTR,
//     pub SdrCompany: windows_sys::core::PCSTR,
//     pub SdrAddress: windows_sys::core::PCSTR,
//     pub SdrTitle: windows_sys::core::PCSTR,
//     pub SdrDepartment: windows_sys::core::PCSTR,
//     pub SdrOfficeLocation: windows_sys::core::PCSTR,
//     pub SdrHomePhone: windows_sys::core::PCSTR,
//     pub SdrOfficePhone: windows_sys::core::PCSTR,
//     pub Note: windows_sys::core::PCSTR,
//     pub Subject: windows_sys::core::PCSTR,
//     pub TimeSent: super::super::Foundation::SYSTEMTIME,
//     pub PageCount: u32,
// }

// UNSUPPORTED Rust 201:1: declaration Impl has no candidate rule
// impl Default for FAX_COVERPAGE_INFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 206:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FAX_COVERPAGE_INFOW {
//     pub SizeOfStruct: u32,
//     pub CoverPageName: windows_sys::core::PCWSTR,
//     pub UseServerCoverPage: windows_sys::core::BOOL,
//     pub RecName: windows_sys::core::PCWSTR,
//     pub RecFaxNumber: windows_sys::core::PCWSTR,
//     pub RecCompany: windows_sys::core::PCWSTR,
//     pub RecStreetAddress: windows_sys::core::PCWSTR,
//     pub RecCity: windows_sys::core::PCWSTR,
//     pub RecState: windows_sys::core::PCWSTR,
//     pub RecZip: windows_sys::core::PCWSTR,
//     pub RecCountry: windows_sys::core::PCWSTR,
//     pub RecTitle: windows_sys::core::PCWSTR,
//     pub RecDepartment: windows_sys::core::PCWSTR,
//     pub RecOfficeLocation: windows_sys::core::PCWSTR,
//     pub RecHomePhone: windows_sys::core::PCWSTR,
//     pub RecOfficePhone: windows_sys::core::PCWSTR,
//     pub SdrName: windows_sys::core::PCWSTR,
//     pub SdrFaxNumber: windows_sys::core::PCWSTR,
//     pub SdrCompany: windows_sys::core::PCWSTR,
//     pub SdrAddress: windows_sys::core::PCWSTR,
//     pub SdrTitle: windows_sys::core::PCWSTR,
//     pub SdrDepartment: windows_sys::core::PCWSTR,
//     pub SdrOfficeLocation: windows_sys::core::PCWSTR,
//     pub SdrHomePhone: windows_sys::core::PCWSTR,
//     pub SdrOfficePhone: windows_sys::core::PCWSTR,
//     pub Note: windows_sys::core::PCWSTR,
//     pub Subject: windows_sys::core::PCWSTR,
//     pub TimeSent: super::super::Foundation::SYSTEMTIME,
//     pub PageCount: u32,
// }

// UNSUPPORTED Rust 239:1: declaration Impl has no candidate rule
// impl Default for FAX_COVERPAGE_INFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `FAX_COVERPAGE_TYPE_ENUM` = Int;
public typealias `FAX_DEVICE_RECEIVE_MODE_ENUM` = Int;
// UNSUPPORTED Rust 246:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FAX_DEVICE_STATUSA {
//     pub SizeOfStruct: u32,
//     pub CallerId: windows_sys::core::PCSTR,
//     pub Csid: windows_sys::core::PCSTR,
//     pub CurrentPage: u32,
//     pub DeviceId: u32,
//     pub DeviceName: windows_sys::core::PCSTR,
//     pub DocumentName: windows_sys::core::PCSTR,
//     pub JobType: u32,
//     pub PhoneNumber: windows_sys::core::PCSTR,
//     pub RoutingString: windows_sys::core::PCSTR,
//     pub SenderName: windows_sys::core::PCSTR,
//     pub RecipientName: windows_sys::core::PCSTR,
//     pub Size: u32,
//     pub StartTime: super::super::Foundation::FILETIME,
//     pub Status: u32,
//     pub StatusString: windows_sys::core::PCSTR,
//     pub SubmittedTime: super::super::Foundation::FILETIME,
//     pub TotalPages: u32,
//     pub Tsid: windows_sys::core::PCSTR,
//     pub UserName: windows_sys::core::PCSTR,
// }

// UNSUPPORTED Rust 270:1: declaration Impl has no candidate rule
// impl Default for FAX_DEVICE_STATUSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 275:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FAX_DEVICE_STATUSW {
//     pub SizeOfStruct: u32,
//     pub CallerId: windows_sys::core::PCWSTR,
//     pub Csid: windows_sys::core::PCWSTR,
//     pub CurrentPage: u32,
//     pub DeviceId: u32,
//     pub DeviceName: windows_sys::core::PCWSTR,
//     pub DocumentName: windows_sys::core::PCWSTR,
//     pub JobType: u32,
//     pub PhoneNumber: windows_sys::core::PCWSTR,
//     pub RoutingString: windows_sys::core::PCWSTR,
//     pub SenderName: windows_sys::core::PCWSTR,
//     pub RecipientName: windows_sys::core::PCWSTR,
//     pub Size: u32,
//     pub StartTime: super::super::Foundation::FILETIME,
//     pub Status: u32,
//     pub StatusString: windows_sys::core::PCWSTR,
//     pub SubmittedTime: super::super::Foundation::FILETIME,
//     pub TotalPages: u32,
//     pub Tsid: windows_sys::core::PCWSTR,
//     pub UserName: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 299:1: declaration Impl has no candidate rule
// impl Default for FAX_DEVICE_STATUSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 304:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FAX_DEV_STATUS {
//     pub SizeOfStruct: u32,
//     pub StatusId: u32,
//     pub StringId: u32,
//     pub PageCount: u32,
//     pub CSI: windows_sys::core::PWSTR,
//     pub CallerId: windows_sys::core::PWSTR,
//     pub RoutingInfo: windows_sys::core::PWSTR,
//     pub ErrorCode: u32,
//     pub Reserved: [u32; 3],
// }

// UNSUPPORTED Rust 317:1: declaration Impl has no candidate rule
// impl Default for FAX_DEV_STATUS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `FAX_ENUM_DELIVERY_REPORT_TYPES` = Int;
public typealias `FAX_ENUM_DEVICE_ID_SOURCE` = Int;
public typealias `FAX_ENUM_JOB_COMMANDS` = Int;
public typealias `FAX_ENUM_JOB_SEND_ATTRIBUTES` = Int;
public typealias `FAX_ENUM_LOG_CATEGORIES` = Int;
public typealias `FAX_ENUM_LOG_LEVELS` = Int;
public typealias `FAX_ENUM_PORT_OPEN_TYPE` = Int;
public const val `FAX_ERR_BAD_GROUP_CONFIGURATION`: Int = 7003;
public const val `FAX_ERR_DEVICE_NUM_LIMIT_EXCEEDED`: Int = 7010;
public const val `FAX_ERR_DIRECTORY_IN_USE`: Int = 7007;
public const val `FAX_ERR_END`: Int = 7013;
public const val `FAX_ERR_FILE_ACCESS_DENIED`: Int = 7008;
public const val `FAX_ERR_GROUP_IN_USE`: Int = 7004;
public const val `FAX_ERR_GROUP_NOT_FOUND`: Int = 7002;
public const val `FAX_ERR_MESSAGE_NOT_FOUND`: Int = 7009;
public const val `FAX_ERR_NOT_NTFS`: Int = 7006;
public const val `FAX_ERR_NOT_SUPPORTED_ON_THIS_SKU`: Int = 7011;
public const val `FAX_ERR_RECIPIENTS_LIMIT`: Int = 7013;
public const val `FAX_ERR_RULE_NOT_FOUND`: Int = 7005;
public const val `FAX_ERR_SRV_OUTOFMEMORY`: Int = 7001;
public const val `FAX_ERR_START`: Int = 7001;
public const val `FAX_ERR_VERSION_MISMATCH`: Int = 7012;
// UNSUPPORTED Rust 344:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FAX_EVENTA {
//     pub SizeOfStruct: u32,
//     pub TimeStamp: super::super::Foundation::FILETIME,
//     pub DeviceId: u32,
//     pub EventId: u32,
//     pub JobId: u32,
// }

// UNSUPPORTED Rust 353:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FAX_EVENTW {
//     pub SizeOfStruct: u32,
//     pub TimeStamp: super::super::Foundation::FILETIME,
//     pub DeviceId: u32,
//     pub EventId: u32,
//     pub JobId: u32,
// }

public const val `FAX_E_BAD_GROUP_CONFIGURATION`: Int = -2147214501;
public const val `FAX_E_DEVICE_NUM_LIMIT_EXCEEDED`: Int = -2147214494;
public const val `FAX_E_DIRECTORY_IN_USE`: Int = -2147214497;
public const val `FAX_E_FILE_ACCESS_DENIED`: Int = -2147214496;
public const val `FAX_E_GROUP_IN_USE`: Int = -2147214500;
public const val `FAX_E_GROUP_NOT_FOUND`: Int = -2147214502;
public const val `FAX_E_MESSAGE_NOT_FOUND`: Int = -2147214495;
public const val `FAX_E_NOT_NTFS`: Int = -2147214498;
public const val `FAX_E_NOT_SUPPORTED_ON_THIS_SKU`: Int = -2147214493;
public const val `FAX_E_RECIPIENTS_LIMIT`: Int = -2147214491;
public const val `FAX_E_RULE_NOT_FOUND`: Int = -2147214499;
public const val `FAX_E_SRV_OUTOFMEMORY`: Int = -2147214503;
public const val `FAX_E_VERSION_MISMATCH`: Int = -2147214492;
// UNSUPPORTED Rust 375:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FAX_GLOBAL_ROUTING_INFOA {
//     pub SizeOfStruct: u32,
//     pub Priority: u32,
//     pub Guid: windows_sys::core::PCSTR,
//     pub FriendlyName: windows_sys::core::PCSTR,
//     pub FunctionName: windows_sys::core::PCSTR,
//     pub ExtensionImageName: windows_sys::core::PCSTR,
//     pub ExtensionFriendlyName: windows_sys::core::PCSTR,
// }

// UNSUPPORTED Rust 386:1: declaration Impl has no candidate rule
// impl Default for FAX_GLOBAL_ROUTING_INFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 391:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FAX_GLOBAL_ROUTING_INFOW {
//     pub SizeOfStruct: u32,
//     pub Priority: u32,
//     pub Guid: windows_sys::core::PCWSTR,
//     pub FriendlyName: windows_sys::core::PCWSTR,
//     pub FunctionName: windows_sys::core::PCWSTR,
//     pub ExtensionImageName: windows_sys::core::PCWSTR,
//     pub ExtensionFriendlyName: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 402:1: declaration Impl has no candidate rule
// impl Default for FAX_GLOBAL_ROUTING_INFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `FAX_GROUP_STATUS_ENUM` = Int;
// UNSUPPORTED Rust 408:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FAX_JOB_ENTRYA {
//     pub SizeOfStruct: u32,
//     pub JobId: u32,
//     pub UserName: windows_sys::core::PCSTR,
//     pub JobType: u32,
//     pub QueueStatus: u32,
//     pub Status: u32,
//     pub Size: u32,
//     pub PageCount: u32,
//     pub RecipientNumber: windows_sys::core::PCSTR,
//     pub RecipientName: windows_sys::core::PCSTR,
//     pub Tsid: windows_sys::core::PCSTR,
//     pub SenderName: windows_sys::core::PCSTR,
//     pub SenderCompany: windows_sys::core::PCSTR,
//     pub SenderDept: windows_sys::core::PCSTR,
//     pub BillingCode: windows_sys::core::PCSTR,
//     pub ScheduleAction: u32,
//     pub ScheduleTime: super::super::Foundation::SYSTEMTIME,
//     pub DeliveryReportType: u32,
//     pub DeliveryReportAddress: windows_sys::core::PCSTR,
//     pub DocumentName: windows_sys::core::PCSTR,
// }

// UNSUPPORTED Rust 432:1: declaration Impl has no candidate rule
// impl Default for FAX_JOB_ENTRYA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 437:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FAX_JOB_ENTRYW {
//     pub SizeOfStruct: u32,
//     pub JobId: u32,
//     pub UserName: windows_sys::core::PCWSTR,
//     pub JobType: u32,
//     pub QueueStatus: u32,
//     pub Status: u32,
//     pub Size: u32,
//     pub PageCount: u32,
//     pub RecipientNumber: windows_sys::core::PCWSTR,
//     pub RecipientName: windows_sys::core::PCWSTR,
//     pub Tsid: windows_sys::core::PCWSTR,
//     pub SenderName: windows_sys::core::PCWSTR,
//     pub SenderCompany: windows_sys::core::PCWSTR,
//     pub SenderDept: windows_sys::core::PCWSTR,
//     pub BillingCode: windows_sys::core::PCWSTR,
//     pub ScheduleAction: u32,
//     pub ScheduleTime: super::super::Foundation::SYSTEMTIME,
//     pub DeliveryReportType: u32,
//     pub DeliveryReportAddress: windows_sys::core::PCWSTR,
//     pub DocumentName: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 461:1: declaration Impl has no candidate rule
// impl Default for FAX_JOB_ENTRYW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `FAX_JOB_EXTENDED_STATUS_ENUM` = Int;
public const val `FAX_JOB_MANAGE`: UInt = 64u;
public typealias `FAX_JOB_OPERATIONS_ENUM` = Int;
// UNSUPPORTED Rust 469:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FAX_JOB_PARAMA {
//     pub SizeOfStruct: u32,
//     pub RecipientNumber: windows_sys::core::PCSTR,
//     pub RecipientName: windows_sys::core::PCSTR,
//     pub Tsid: windows_sys::core::PCSTR,
//     pub SenderName: windows_sys::core::PCSTR,
//     pub SenderCompany: windows_sys::core::PCSTR,
//     pub SenderDept: windows_sys::core::PCSTR,
//     pub BillingCode: windows_sys::core::PCSTR,
//     pub ScheduleAction: u32,
//     pub ScheduleTime: super::super::Foundation::SYSTEMTIME,
//     pub DeliveryReportType: u32,
//     pub DeliveryReportAddress: windows_sys::core::PCSTR,
//     pub DocumentName: windows_sys::core::PCSTR,
//     pub CallHandle: u32,
//     pub Reserved: [usize; 3],
// }

// UNSUPPORTED Rust 488:1: declaration Impl has no candidate rule
// impl Default for FAX_JOB_PARAMA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 493:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FAX_JOB_PARAMW {
//     pub SizeOfStruct: u32,
//     pub RecipientNumber: windows_sys::core::PCWSTR,
//     pub RecipientName: windows_sys::core::PCWSTR,
//     pub Tsid: windows_sys::core::PCWSTR,
//     pub SenderName: windows_sys::core::PCWSTR,
//     pub SenderCompany: windows_sys::core::PCWSTR,
//     pub SenderDept: windows_sys::core::PCWSTR,
//     pub BillingCode: windows_sys::core::PCWSTR,
//     pub ScheduleAction: u32,
//     pub ScheduleTime: super::super::Foundation::SYSTEMTIME,
//     pub DeliveryReportType: u32,
//     pub DeliveryReportAddress: windows_sys::core::PCWSTR,
//     pub DocumentName: windows_sys::core::PCWSTR,
//     pub CallHandle: u32,
//     pub Reserved: [usize; 3],
// }

// UNSUPPORTED Rust 512:1: declaration Impl has no candidate rule
// impl Default for FAX_JOB_PARAMW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FAX_JOB_QUERY`: UInt = 2u;
public typealias `FAX_JOB_STATUS_ENUM` = Int;
public const val `FAX_JOB_SUBMIT`: UInt = 1u;
public typealias `FAX_JOB_TYPE_ENUM` = Int;
// UNSUPPORTED Rust 521:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FAX_LOG_CATEGORYA {
//     pub Name: windows_sys::core::PCSTR,
//     pub Category: u32,
//     pub Level: u32,
// }

// UNSUPPORTED Rust 528:1: declaration Impl has no candidate rule
// impl Default for FAX_LOG_CATEGORYA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 533:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FAX_LOG_CATEGORYW {
//     pub Name: windows_sys::core::PCWSTR,
//     pub Category: u32,
//     pub Level: u32,
// }

// UNSUPPORTED Rust 540:1: declaration Impl has no candidate rule
// impl Default for FAX_LOG_CATEGORYW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `FAX_LOG_LEVEL_ENUM` = Int;
// UNSUPPORTED Rust 546:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FAX_PORT_INFOA {
//     pub SizeOfStruct: u32,
//     pub DeviceId: u32,
//     pub State: u32,
//     pub Flags: u32,
//     pub Rings: u32,
//     pub Priority: u32,
//     pub DeviceName: windows_sys::core::PCSTR,
//     pub Tsid: windows_sys::core::PCSTR,
//     pub Csid: windows_sys::core::PCSTR,
// }

// UNSUPPORTED Rust 559:1: declaration Impl has no candidate rule
// impl Default for FAX_PORT_INFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 564:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FAX_PORT_INFOW {
//     pub SizeOfStruct: u32,
//     pub DeviceId: u32,
//     pub State: u32,
//     pub Flags: u32,
//     pub Rings: u32,
//     pub Priority: u32,
//     pub DeviceName: windows_sys::core::PCWSTR,
//     pub Tsid: windows_sys::core::PCWSTR,
//     pub Csid: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 577:1: declaration Impl has no candidate rule
// impl Default for FAX_PORT_INFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FAX_PORT_QUERY`: UInt = 16u;
public const val `FAX_PORT_SET`: UInt = 32u;
// UNSUPPORTED Rust 584:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FAX_PRINT_INFOA {
//     pub SizeOfStruct: u32,
//     pub DocName: windows_sys::core::PCSTR,
//     pub RecipientName: windows_sys::core::PCSTR,
//     pub RecipientNumber: windows_sys::core::PCSTR,
//     pub SenderName: windows_sys::core::PCSTR,
//     pub SenderCompany: windows_sys::core::PCSTR,
//     pub SenderDept: windows_sys::core::PCSTR,
//     pub SenderBillingCode: windows_sys::core::PCSTR,
//     pub Reserved: windows_sys::core::PCSTR,
//     pub DrEmailAddress: windows_sys::core::PCSTR,
//     pub OutputFileName: windows_sys::core::PCSTR,
// }

// UNSUPPORTED Rust 599:1: declaration Impl has no candidate rule
// impl Default for FAX_PRINT_INFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 604:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FAX_PRINT_INFOW {
//     pub SizeOfStruct: u32,
//     pub DocName: windows_sys::core::PCWSTR,
//     pub RecipientName: windows_sys::core::PCWSTR,
//     pub RecipientNumber: windows_sys::core::PCWSTR,
//     pub SenderName: windows_sys::core::PCWSTR,
//     pub SenderCompany: windows_sys::core::PCWSTR,
//     pub SenderDept: windows_sys::core::PCWSTR,
//     pub SenderBillingCode: windows_sys::core::PCWSTR,
//     pub Reserved: windows_sys::core::PCWSTR,
//     pub DrEmailAddress: windows_sys::core::PCWSTR,
//     pub OutputFileName: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 619:1: declaration Impl has no candidate rule
// impl Default for FAX_PRINT_INFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `FAX_PRIORITY_TYPE_ENUM` = Int;
public typealias `FAX_PROVIDER_STATUS_ENUM` = Int;
public typealias `FAX_RECEIPT_TYPE_ENUM` = Int;
// UNSUPPORTED Rust 627:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FAX_RECEIVE {
//     pub SizeOfStruct: u32,
//     pub FileName: windows_sys::core::PWSTR,
//     pub ReceiverName: windows_sys::core::PWSTR,
//     pub ReceiverNumber: windows_sys::core::PWSTR,
//     pub Reserved: [u32; 4],
// }

// UNSUPPORTED Rust 636:1: declaration Impl has no candidate rule
// impl Default for FAX_RECEIVE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 641:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FAX_ROUTE {
//     pub SizeOfStruct: u32,
//     pub JobId: u32,
//     pub ElapsedTime: u64,
//     pub ReceiveTime: u64,
//     pub PageCount: u32,
//     pub Csid: windows_sys::core::PCWSTR,
//     pub Tsid: windows_sys::core::PCWSTR,
//     pub CallerId: windows_sys::core::PCWSTR,
//     pub RoutingInfo: windows_sys::core::PCWSTR,
//     pub ReceiverName: windows_sys::core::PCWSTR,
//     pub ReceiverNumber: windows_sys::core::PCWSTR,
//     pub DeviceName: windows_sys::core::PCWSTR,
//     pub DeviceId: u32,
//     pub RoutingInfoData: *mut u8,
//     pub RoutingInfoDataSize: u32,
// }

// UNSUPPORTED Rust 660:1: declaration Impl has no candidate rule
// impl Default for FAX_ROUTE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 665:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FAX_ROUTE_CALLBACKROUTINES {
//     pub SizeOfStruct: u32,
//     pub FaxRouteAddFile: PFAXROUTEADDFILE,
//     pub FaxRouteDeleteFile: PFAXROUTEDELETEFILE,
//     pub FaxRouteGetFile: PFAXROUTEGETFILE,
//     pub FaxRouteEnumFiles: PFAXROUTEENUMFILES,
//     pub FaxRouteModifyRoutingData: PFAXROUTEMODIFYROUTINGDATA,
// }

// UNSUPPORTED Rust 675:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FAX_ROUTING_METHODA {
//     pub SizeOfStruct: u32,
//     pub DeviceId: u32,
//     pub Enabled: windows_sys::core::BOOL,
//     pub DeviceName: windows_sys::core::PCSTR,
//     pub Guid: windows_sys::core::PCSTR,
//     pub FriendlyName: windows_sys::core::PCSTR,
//     pub FunctionName: windows_sys::core::PCSTR,
//     pub ExtensionImageName: windows_sys::core::PCSTR,
//     pub ExtensionFriendlyName: windows_sys::core::PCSTR,
// }

// UNSUPPORTED Rust 688:1: declaration Impl has no candidate rule
// impl Default for FAX_ROUTING_METHODA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 693:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FAX_ROUTING_METHODW {
//     pub SizeOfStruct: u32,
//     pub DeviceId: u32,
//     pub Enabled: windows_sys::core::BOOL,
//     pub DeviceName: windows_sys::core::PCWSTR,
//     pub Guid: windows_sys::core::PCWSTR,
//     pub FriendlyName: windows_sys::core::PCWSTR,
//     pub FunctionName: windows_sys::core::PCWSTR,
//     pub ExtensionImageName: windows_sys::core::PCWSTR,
//     pub ExtensionFriendlyName: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 706:1: declaration Impl has no candidate rule
// impl Default for FAX_ROUTING_METHODW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `FAX_ROUTING_RULE_CODE_ENUM` = Int;
public typealias `FAX_RULE_STATUS_ENUM` = Int;
public typealias `FAX_SCHEDULE_TYPE_ENUM` = Int;
// UNSUPPORTED Rust 714:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FAX_SEND {
//     pub SizeOfStruct: u32,
//     pub FileName: windows_sys::core::PWSTR,
//     pub CallerName: windows_sys::core::PWSTR,
//     pub CallerNumber: windows_sys::core::PWSTR,
//     pub ReceiverName: windows_sys::core::PWSTR,
//     pub ReceiverNumber: windows_sys::core::PWSTR,
//     pub Branding: windows_sys::core::BOOL,
//     pub CallHandle: u32,
//     pub Reserved: [u32; 3],
// }

// UNSUPPORTED Rust 727:1: declaration Impl has no candidate rule
// impl Default for FAX_SEND {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `FAX_SERVER_APIVERSION_ENUM` = Int;
public typealias `FAX_SERVER_EVENTS_TYPE_ENUM` = Int;
public typealias `FAX_SMTP_AUTHENTICATION_TYPE_ENUM` = Int;
// UNSUPPORTED Rust 735:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FAX_TIME {
//     pub Hour: u16,
//     pub Minute: u16,
// }

public const val `FEI_ABORTING`: UInt = 15u;
public const val `FEI_ANSWERED`: UInt = 21u;
public const val `FEI_BAD_ADDRESS`: UInt = 7u;
public const val `FEI_BUSY`: UInt = 5u;
public const val `FEI_CALL_BLACKLISTED`: UInt = 13u;
public const val `FEI_CALL_DELAYED`: UInt = 12u;
public const val `FEI_COMPLETED`: UInt = 4u;
public const val `FEI_DELETED`: UInt = 23u;
public const val `FEI_DIALING`: UInt = 1u;
public const val `FEI_DISCONNECTED`: UInt = 9u;
public const val `FEI_FATAL_ERROR`: UInt = 10u;
public const val `FEI_FAXSVC_ENDED`: UInt = 20u;
public const val `FEI_FAXSVC_STARTED`: UInt = 27u;
public const val `FEI_HANDLED`: UInt = 26u;
public const val `FEI_IDLE`: UInt = 19u;
public const val `FEI_INITIALIZING`: UInt = 24u;
public const val `FEI_JOB_QUEUED`: UInt = 22u;
public const val `FEI_LINE_UNAVAILABLE`: UInt = 25u;
public const val `FEI_MODEM_POWERED_OFF`: UInt = 18u;
public const val `FEI_MODEM_POWERED_ON`: UInt = 17u;
public const val `FEI_NEVENTS`: UInt = 27u;
public const val `FEI_NOT_FAX_CALL`: UInt = 11u;
public const val `FEI_NO_ANSWER`: UInt = 6u;
public const val `FEI_NO_DIAL_TONE`: UInt = 8u;
public const val `FEI_RECEIVING`: UInt = 3u;
public const val `FEI_RINGING`: UInt = 14u;
public const val `FEI_ROUTING`: UInt = 16u;
public const val `FEI_SENDING`: UInt = 2u;
public const val `FPF_RECEIVE`: UInt = 1u;
public const val `FPF_SEND`: UInt = 2u;
public const val `FPF_VIRTUAL`: UInt = 4u;
public const val `FPS_ABORTING`: UInt = 538968064u;
public const val `FPS_ANSWERED`: UInt = 545259520u;
public const val `FPS_AVAILABLE`: UInt = 537919488u;
public const val `FPS_BAD_ADDRESS`: UInt = 536871168u;
public const val `FPS_BUSY`: UInt = 536870976u;
public const val `FPS_CALL_BLACKLISTED`: UInt = 536887296u;
public const val `FPS_CALL_DELAYED`: UInt = 536879104u;
public const val `FPS_COMPLETED`: UInt = 536870920u;
public const val `FPS_DIALING`: UInt = 536870913u;
public const val `FPS_DISCONNECTED`: UInt = 536871936u;
public const val `FPS_FATAL_ERROR`: UInt = 536872960u;
public const val `FPS_HANDLED`: UInt = 536870928u;
public const val `FPS_INITIALIZING`: UInt = 536903680u;
public const val `FPS_NOT_FAX_CALL`: UInt = 536875008u;
public const val `FPS_NO_ANSWER`: UInt = 536871040u;
public const val `FPS_NO_DIAL_TONE`: UInt = 536871424u;
public const val `FPS_OFFLINE`: UInt = 536936448u;
public const val `FPS_RECEIVING`: UInt = 536870916u;
public const val `FPS_RINGING`: UInt = 537001984u;
public const val `FPS_ROUTING`: UInt = 541065216u;
public const val `FPS_SENDING`: UInt = 536870914u;
public const val `FPS_UNAVAILABLE`: UInt = 536870944u;
public const val `FS_ANSWERED`: UInt = 545259520u;
public const val `FS_BAD_ADDRESS`: UInt = 536871168u;
public const val `FS_BUSY`: UInt = 536870976u;
public const val `FS_CALL_BLACKLISTED`: UInt = 536887296u;
public const val `FS_CALL_DELAYED`: UInt = 536879104u;
public const val `FS_COMPLETED`: UInt = 536870920u;
public const val `FS_DIALING`: UInt = 536870913u;
public const val `FS_DISCONNECTED`: UInt = 536871936u;
public const val `FS_FATAL_ERROR`: UInt = 536872960u;
public const val `FS_HANDLED`: UInt = 536870928u;
public const val `FS_INITIALIZING`: UInt = 536870912u;
public const val `FS_LINE_UNAVAILABLE`: UInt = 536870944u;
public const val `FS_NOT_FAX_CALL`: UInt = 536875008u;
public const val `FS_NO_ANSWER`: UInt = 536871040u;
public const val `FS_NO_DIAL_TONE`: UInt = 536871424u;
public const val `FS_RECEIVING`: UInt = 536870916u;
public const val `FS_TRANSMITTING`: UInt = 536870914u;
public const val `FS_USER_ABORT`: UInt = 538968064u;
// UNSUPPORTED Rust 812:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FaxAccount: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa7e0647f_4524_4464_a56d_b9fe666f715e);

// UNSUPPORTED Rust 813:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FaxAccountFolders: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x85398f49_c034_4a3f_821c_db7d685e8129);

// UNSUPPORTED Rust 814:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FaxAccountIncomingArchive: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x14b33db5_4c40_4ecf_9ef8_a360cbe809ed);

// UNSUPPORTED Rust 815:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FaxAccountIncomingQueue: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9bcf6094_b4da_45f4_b8d6_ddeb2186652c);

// UNSUPPORTED Rust 816:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FaxAccountOutgoingArchive: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x851e7af5_433a_4739_a2df_ad245c2cb98e);

// UNSUPPORTED Rust 817:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FaxAccountOutgoingQueue: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfeeceefb_c149_48ba_bab8_b791e101f62f);

// UNSUPPORTED Rust 818:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FaxAccountSet: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfbc23c4b_79e0_4291_bc56_c12e253bbf3a);

// UNSUPPORTED Rust 819:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FaxAccounts: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xda1f94aa_ee2c_47c0_8f4f_2a217075b76e);

// UNSUPPORTED Rust 820:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FaxActivity: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcfef5d0e_e84d_462e_aabb_87d31eb04fef);

// UNSUPPORTED Rust 821:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FaxActivityLogging: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf0a0294e_3bbd_48b8_8f13_8c591a55bdbc);

// UNSUPPORTED Rust 822:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FaxConfiguration: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5857326f_e7b3_41a7_9c19_a91b463e2d56);

// UNSUPPORTED Rust 823:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FaxDevice: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x59e3a5b2_d676_484b_a6de_720bfa89b5af);

// UNSUPPORTED Rust 824:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FaxDeviceIds: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcdc539ea_7277_460e_8de0_48a0a5760d1f);

// UNSUPPORTED Rust 825:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FaxDeviceProvider: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x17cf1aa3_f5eb_484a_9c9a_4440a5baabfc);

// UNSUPPORTED Rust 826:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FaxDeviceProviders: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xeb8fe768_875a_4f5f_82c5_03f23aac1bd7);

// UNSUPPORTED Rust 827:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FaxDevices: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5589e28e_23cb_4919_8808_e6101846e80d);

// UNSUPPORTED Rust 828:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FaxDocument: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0f3f9f91_c838_415e_a4f3_3e828ca445e0);

// UNSUPPORTED Rust 829:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FaxEventLogging: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa6850930_a0f6_4a6f_95b7_db2ebf3d02e3);

// UNSUPPORTED Rust 830:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FaxFolders: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc35211d7_5776_48cb_af44_c31be3b2cfe5);

// UNSUPPORTED Rust 831:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FaxInboundRouting: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe80248ed_ad65_4218_8108_991924d4e7ed);

// UNSUPPORTED Rust 832:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FaxInboundRoutingExtension: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1d7dfb51_7207_4436_a0d9_24e32ee56988);

// UNSUPPORTED Rust 833:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FaxInboundRoutingExtensions: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x189a48ed_623c_4c0d_80f2_d66c7b9efec2);

// UNSUPPORTED Rust 834:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FaxInboundRoutingMethod: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4b9fd75c_0194_4b72_9ce5_02a8205ac7d4);

// UNSUPPORTED Rust 835:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FaxInboundRoutingMethods: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x25fcb76a_b750_4b82_9266_fbbbae8922ba);

// UNSUPPORTED Rust 836:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FaxIncomingArchive: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8426c56a_35a1_4c6f_af93_fc952422e2c2);

// UNSUPPORTED Rust 837:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FaxIncomingJob: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc47311ec_ae32_41b8_ae4b_3eae0629d0c9);

// UNSUPPORTED Rust 838:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FaxIncomingJobs: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa1bb8a43_8866_4fb7_a15d_6266c875a5cc);

// UNSUPPORTED Rust 839:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FaxIncomingMessage: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1932fcf7_9d43_4d5a_89ff_03861b321736);

// UNSUPPORTED Rust 840:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FaxIncomingMessageIterator: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6088e1d8_3fc8_45c2_87b1_909a29607ea9);

// UNSUPPORTED Rust 841:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FaxIncomingQueue: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x69131717_f3f1_40e3_809d_a6cbf7bd85e5);

// UNSUPPORTED Rust 842:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FaxJobStatus: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7bf222f4_be8d_442f_841d_6132742423bb);

// UNSUPPORTED Rust 843:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FaxLoggingOptions: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1bf9eea6_ece0_4785_a18b_de56e9eef96a);

// UNSUPPORTED Rust 844:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FaxOutboundRouting: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc81b385e_b869_4afd_86c0_616498ed9be2);

// UNSUPPORTED Rust 845:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FaxOutboundRoutingGroup: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0213f3e0_6791_4d77_a271_04d2357c50d6);

// UNSUPPORTED Rust 846:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FaxOutboundRoutingGroups: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xccbea1a5_e2b4_4b57_9421_b04b6289464b);

// UNSUPPORTED Rust 847:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FaxOutboundRoutingRule: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6549eebf_08d1_475a_828b_3bf105952fa0);

// UNSUPPORTED Rust 848:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FaxOutboundRoutingRules: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd385beca_e624_4473_bfaa_9f4000831f54);

// UNSUPPORTED Rust 849:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FaxOutgoingArchive: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x43c28403_e04f_474d_990c_b94669148f59);

// UNSUPPORTED Rust 850:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FaxOutgoingJob: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x71bb429c_0ef9_4915_bec5_a5d897a3e924);

// UNSUPPORTED Rust 851:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FaxOutgoingJobs: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x92bf2a6c_37be_43fa_a37d_cb0e5f753b35);

// UNSUPPORTED Rust 852:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FaxOutgoingMessage: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x91b4a378_4ad8_4aef_a4dc_97d96e939a3a);

// UNSUPPORTED Rust 853:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FaxOutgoingMessageIterator: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8a3224d0_d30b_49de_9813_cb385790fbbb);

// UNSUPPORTED Rust 854:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FaxOutgoingQueue: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7421169e_8c43_4b0d_bb16_645c8fa40357);

// UNSUPPORTED Rust 855:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FaxReceiptOptions: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6982487b_227b_4c96_a61c_248348b05ab6);

// UNSUPPORTED Rust 856:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FaxRecipient: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x60bf3301_7df8_4bd8_9148_7b5801f9efdf);

// UNSUPPORTED Rust 857:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FaxRecipients: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xea9bdf53_10a9_4d4f_a067_63c8f84f01b0);

// UNSUPPORTED Rust 858:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FaxSecurity: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x10c4ddde_abf0_43df_964f_7f3ac21a4c7b);

// UNSUPPORTED Rust 859:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FaxSecurity2: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x735c1248_ec89_4c30_a127_656e92e3c4ea);

// UNSUPPORTED Rust 860:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FaxSender: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x265d84d0_1850_4360_b7c8_758bbb5f0b96);

// UNSUPPORTED Rust 861:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FaxServer: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcda8acb0_8cf5_4f6c_9ba2_5931d40c8cae);

// UNSUPPORTED Rust 862:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DeviceArrivedLaunch: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x740d9ee6_70f1_11d1_ad10_00a02438ad48);

// UNSUPPORTED Rust 863:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_STIUserDefined1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc00eb795_8c6e_11d2_977a_0000f87a926f);

// UNSUPPORTED Rust 864:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_STIUserDefined2: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc77ae9c5_8c6e_11d2_977a_0000f87a926f);

// UNSUPPORTED Rust 865:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_STIUserDefined3: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc77ae9c6_8c6e_11d2_977a_0000f87a926f);

// UNSUPPORTED Rust 866:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_ScanFaxImage: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc00eb793_8c6e_11d2_977a_0000f87a926f);

// UNSUPPORTED Rust 867:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_ScanImage: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa6c5a715_8c6e_11d2_977a_0000f87a926f);

// UNSUPPORTED Rust 868:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_ScanPrintImage: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb441f425_8c6e_11d2_977a_0000f87a926f);

// UNSUPPORTED Rust 869:1: non-scalar type Ptr unsupported
// pub const IS_DIGITAL_CAMERA_STR: windows_sys::core::PCWSTR = windows_sys::core::w!("IsDigitalCamera");

public const val `IS_DIGITAL_CAMERA_VAL`: UInt = 1u;
public const val `JC_DELETE`: `FAX_ENUM_JOB_COMMANDS` = 1;
public const val `JC_PAUSE`: `FAX_ENUM_JOB_COMMANDS` = 2;
public const val `JC_RESUME`: `FAX_ENUM_JOB_COMMANDS` = 3;
public const val `JC_UNKNOWN`: `FAX_ENUM_JOB_COMMANDS` = 0;
public const val `JSA_DISCOUNT_PERIOD`: `FAX_ENUM_JOB_SEND_ATTRIBUTES` = 2;
public const val `JSA_NOW`: `FAX_ENUM_JOB_SEND_ATTRIBUTES` = 0;
public const val `JSA_SPECIFIC_TIME`: `FAX_ENUM_JOB_SEND_ATTRIBUTES` = 1;
public const val `JS_DELETING`: UInt = 2u;
public const val `JS_FAILED`: UInt = 4u;
public const val `JS_INPROGRESS`: UInt = 1u;
public const val `JS_NOLINE`: UInt = 16u;
public const val `JS_PAUSED`: UInt = 8u;
public const val `JS_PENDING`: UInt = 0u;
public const val `JS_RETRIES_EXCEEDED`: UInt = 64u;
public const val `JS_RETRYING`: UInt = 32u;
public const val `JT_FAIL_RECEIVE`: UInt = 4u;
public const val `JT_RECEIVE`: UInt = 2u;
public const val `JT_ROUTING`: UInt = 3u;
public const val `JT_SEND`: UInt = 1u;
public const val `JT_UNKNOWN`: UInt = 0u;
public const val `MAX_NOTIFICATION_DATA`: UInt = 64u;
// UNSUPPORTED Rust 892:1: non-scalar type Ptr unsupported
// pub const MS_FAXROUTE_EMAIL_GUID: windows_sys::core::PCWSTR = windows_sys::core::w!("{6bbf7bfe-9af2-11d0-abf7-00c04fd91a4e}");

// UNSUPPORTED Rust 893:1: non-scalar type Ptr unsupported
// pub const MS_FAXROUTE_FOLDER_GUID: windows_sys::core::PCWSTR = windows_sys::core::w!("{92041a90-9af2-11d0-abf7-00c04fd91a4e}");

// UNSUPPORTED Rust 894:1: non-scalar type Ptr unsupported
// pub const MS_FAXROUTE_PRINTING_GUID: windows_sys::core::PCWSTR = windows_sys::core::w!("{aec1b37c-9af2-11d0-abf7-00c04fd91a4e}");

// UNSUPPORTED Rust 895:1: generic scalar type unsupported
// pub type PFAXABORT = Option<unsafe extern "system" fn(faxhandle: super::super::Foundation::HANDLE, jobid: u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 896:1: generic scalar type unsupported
// pub type PFAXACCESSCHECK = Option<unsafe extern "system" fn(faxhandle: super::super::Foundation::HANDLE, accessmask: u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 897:1: generic scalar type unsupported
// pub type PFAXCLOSE = Option<unsafe extern "system" fn(faxhandle: super::super::Foundation::HANDLE) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 898:1: generic scalar type unsupported
// pub type PFAXCOMPLETEJOBPARAMSA = Option<unsafe extern "system" fn(jobparams: *mut *mut FAX_JOB_PARAMA, coverpageinfo: *mut *mut FAX_COVERPAGE_INFOA) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 899:1: generic scalar type unsupported
// pub type PFAXCOMPLETEJOBPARAMSW = Option<unsafe extern "system" fn(jobparams: *mut *mut FAX_JOB_PARAMW, coverpageinfo: *mut *mut FAX_COVERPAGE_INFOW) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 900:1: generic scalar type unsupported
// pub type PFAXCONNECTFAXSERVERA = Option<unsafe extern "system" fn(machinename: windows_sys::core::PCSTR, faxhandle: *mut super::super::Foundation::HANDLE) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 901:1: generic scalar type unsupported
// pub type PFAXCONNECTFAXSERVERW = Option<unsafe extern "system" fn(machinename: windows_sys::core::PCWSTR, faxhandle: *mut super::super::Foundation::HANDLE) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 902:1: generic scalar type unsupported
// pub type PFAXDEVABORTOPERATION = Option<unsafe extern "system" fn(param0: super::super::Foundation::HANDLE) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 903:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_UI_Controls")]
// pub type PFAXDEVCONFIGURE = Option<unsafe extern "system" fn(param0: *mut super::super::UI::Controls::HPROPSHEETPAGE) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 905:1: generic scalar type unsupported
// pub type PFAXDEVENDJOB = Option<unsafe extern "system" fn(param0: super::super::Foundation::HANDLE) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 906:1: generic scalar type unsupported
// pub type PFAXDEVINITIALIZE = Option<unsafe extern "system" fn(param0: u32, param1: super::super::Foundation::HANDLE, param2: *mut PFAX_LINECALLBACK, param3: PFAX_SERVICE_CALLBACK) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 907:1: generic scalar type unsupported
// pub type PFAXDEVRECEIVE = Option<unsafe extern "system" fn(param0: super::super::Foundation::HANDLE, param1: u32, param2: *mut FAX_RECEIVE) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 908:1: generic scalar type unsupported
// pub type PFAXDEVREPORTSTATUS = Option<unsafe extern "system" fn(param0: super::super::Foundation::HANDLE, param1: *mut FAX_DEV_STATUS, param2: u32, param3: *mut u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 909:1: generic scalar type unsupported
// pub type PFAXDEVSEND = Option<unsafe extern "system" fn(param0: super::super::Foundation::HANDLE, param1: *mut FAX_SEND, param2: PFAX_SEND_CALLBACK) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 910:1: generic scalar type unsupported
// pub type PFAXDEVSHUTDOWN = Option<unsafe extern "system" fn() -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 911:1: generic scalar type unsupported
// pub type PFAXDEVSTARTJOB = Option<unsafe extern "system" fn(param0: u32, param1: u32, param2: *mut super::super::Foundation::HANDLE, param3: super::super::Foundation::HANDLE, param4: usize) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 912:1: generic scalar type unsupported
// pub type PFAXDEVVIRTUALDEVICECREATION = Option<unsafe extern "system" fn(devicecount: *mut u32, devicenameprefix: windows_sys::core::PWSTR, deviceidprefix: *mut u32, completionport: super::super::Foundation::HANDLE, completionkey: usize) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 913:1: generic scalar type unsupported
// pub type PFAXENABLEROUTINGMETHODA = Option<unsafe extern "system" fn(faxporthandle: super::super::Foundation::HANDLE, routingguid: windows_sys::core::PCSTR, enabled: windows_sys::core::BOOL) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 914:1: generic scalar type unsupported
// pub type PFAXENABLEROUTINGMETHODW = Option<unsafe extern "system" fn(faxporthandle: super::super::Foundation::HANDLE, routingguid: windows_sys::core::PCWSTR, enabled: windows_sys::core::BOOL) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 915:1: generic scalar type unsupported
// pub type PFAXENUMGLOBALROUTINGINFOA = Option<unsafe extern "system" fn(faxhandle: super::super::Foundation::HANDLE, routinginfo: *mut *mut FAX_GLOBAL_ROUTING_INFOA, methodsreturned: *mut u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 916:1: generic scalar type unsupported
// pub type PFAXENUMGLOBALROUTINGINFOW = Option<unsafe extern "system" fn(faxhandle: super::super::Foundation::HANDLE, routinginfo: *mut *mut FAX_GLOBAL_ROUTING_INFOW, methodsreturned: *mut u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 917:1: generic scalar type unsupported
// pub type PFAXENUMJOBSA = Option<unsafe extern "system" fn(faxhandle: super::super::Foundation::HANDLE, jobentry: *mut *mut FAX_JOB_ENTRYA, jobsreturned: *mut u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 918:1: generic scalar type unsupported
// pub type PFAXENUMJOBSW = Option<unsafe extern "system" fn(faxhandle: super::super::Foundation::HANDLE, jobentry: *mut *mut FAX_JOB_ENTRYW, jobsreturned: *mut u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 919:1: generic scalar type unsupported
// pub type PFAXENUMPORTSA = Option<unsafe extern "system" fn(faxhandle: super::super::Foundation::HANDLE, portinfo: *mut *mut FAX_PORT_INFOA, portsreturned: *mut u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 920:1: generic scalar type unsupported
// pub type PFAXENUMPORTSW = Option<unsafe extern "system" fn(faxhandle: super::super::Foundation::HANDLE, portinfo: *mut *mut FAX_PORT_INFOW, portsreturned: *mut u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 921:1: generic scalar type unsupported
// pub type PFAXENUMROUTINGMETHODSA = Option<unsafe extern "system" fn(faxporthandle: super::super::Foundation::HANDLE, routingmethod: *mut *mut FAX_ROUTING_METHODA, methodsreturned: *mut u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 922:1: generic scalar type unsupported
// pub type PFAXENUMROUTINGMETHODSW = Option<unsafe extern "system" fn(faxporthandle: super::super::Foundation::HANDLE, routingmethod: *mut *mut FAX_ROUTING_METHODW, methodsreturned: *mut u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 923:1: generic scalar type unsupported
// pub type PFAXFREEBUFFER = Option<unsafe extern "system" fn(buffer: *mut core::ffi::c_void)>;

// UNSUPPORTED Rust 924:1: generic scalar type unsupported
// pub type PFAXGETCONFIGURATIONA = Option<unsafe extern "system" fn(faxhandle: super::super::Foundation::HANDLE, faxconfig: *mut *mut FAX_CONFIGURATIONA) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 925:1: generic scalar type unsupported
// pub type PFAXGETCONFIGURATIONW = Option<unsafe extern "system" fn(faxhandle: super::super::Foundation::HANDLE, faxconfig: *mut *mut FAX_CONFIGURATIONW) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 926:1: generic scalar type unsupported
// pub type PFAXGETDEVICESTATUSA = Option<unsafe extern "system" fn(faxporthandle: super::super::Foundation::HANDLE, devicestatus: *mut *mut FAX_DEVICE_STATUSA) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 927:1: generic scalar type unsupported
// pub type PFAXGETDEVICESTATUSW = Option<unsafe extern "system" fn(faxporthandle: super::super::Foundation::HANDLE, devicestatus: *mut *mut FAX_DEVICE_STATUSW) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 928:1: generic scalar type unsupported
// pub type PFAXGETJOBA = Option<unsafe extern "system" fn(faxhandle: super::super::Foundation::HANDLE, jobid: u32, jobentry: *mut *mut FAX_JOB_ENTRYA) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 929:1: generic scalar type unsupported
// pub type PFAXGETJOBW = Option<unsafe extern "system" fn(faxhandle: super::super::Foundation::HANDLE, jobid: u32, jobentry: *mut *mut FAX_JOB_ENTRYW) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 930:1: generic scalar type unsupported
// pub type PFAXGETLOGGINGCATEGORIESA = Option<unsafe extern "system" fn(faxhandle: super::super::Foundation::HANDLE, categories: *mut *mut FAX_LOG_CATEGORYA, numbercategories: *mut u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 931:1: generic scalar type unsupported
// pub type PFAXGETLOGGINGCATEGORIESW = Option<unsafe extern "system" fn(faxhandle: super::super::Foundation::HANDLE, categories: *mut *mut FAX_LOG_CATEGORYW, numbercategories: *mut u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 932:1: generic scalar type unsupported
// pub type PFAXGETPAGEDATA = Option<unsafe extern "system" fn(faxhandle: super::super::Foundation::HANDLE, jobid: u32, buffer: *mut *mut u8, buffersize: *mut u32, imagewidth: *mut u32, imageheight: *mut u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 933:1: generic scalar type unsupported
// pub type PFAXGETPORTA = Option<unsafe extern "system" fn(faxporthandle: super::super::Foundation::HANDLE, portinfo: *mut *mut FAX_PORT_INFOA) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 934:1: generic scalar type unsupported
// pub type PFAXGETPORTW = Option<unsafe extern "system" fn(faxporthandle: super::super::Foundation::HANDLE, portinfo: *mut *mut FAX_PORT_INFOW) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 935:1: generic scalar type unsupported
// pub type PFAXGETROUTINGINFOA = Option<unsafe extern "system" fn(faxporthandle: super::super::Foundation::HANDLE, routingguid: windows_sys::core::PCSTR, routinginfobuffer: *mut *mut u8, routinginfobuffersize: *mut u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 936:1: generic scalar type unsupported
// pub type PFAXGETROUTINGINFOW = Option<unsafe extern "system" fn(faxporthandle: super::super::Foundation::HANDLE, routingguid: windows_sys::core::PCWSTR, routinginfobuffer: *mut *mut u8, routinginfobuffersize: *mut u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 937:1: generic scalar type unsupported
// pub type PFAXINITIALIZEEVENTQUEUE = Option<unsafe extern "system" fn(faxhandle: super::super::Foundation::HANDLE, completionport: super::super::Foundation::HANDLE, completionkey: usize, hwnd: super::super::Foundation::HWND, messagestart: u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 938:1: generic scalar type unsupported
// pub type PFAXOPENPORT = Option<unsafe extern "system" fn(faxhandle: super::super::Foundation::HANDLE, deviceid: u32, flags: u32, faxporthandle: *mut super::super::Foundation::HANDLE) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 939:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Graphics_Gdi")]
// pub type PFAXPRINTCOVERPAGEA = Option<unsafe extern "system" fn(faxcontextinfo: *const FAX_CONTEXT_INFOA, coverpageinfo: *const FAX_COVERPAGE_INFOA) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 941:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Graphics_Gdi")]
// pub type PFAXPRINTCOVERPAGEW = Option<unsafe extern "system" fn(faxcontextinfo: *const FAX_CONTEXT_INFOW, coverpageinfo: *const FAX_COVERPAGE_INFOW) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 943:1: generic scalar type unsupported
// pub type PFAXREGISTERROUTINGEXTENSIONW = Option<unsafe extern "system" fn(faxhandle: super::super::Foundation::HANDLE, extensionname: windows_sys::core::PCWSTR, friendlyname: windows_sys::core::PCWSTR, imagename: windows_sys::core::PCWSTR, callback: PFAX_ROUTING_INSTALLATION_CALLBACKW, context: *const core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 944:1: generic scalar type unsupported
// pub type PFAXREGISTERSERVICEPROVIDERW = Option<unsafe extern "system" fn(deviceprovider: windows_sys::core::PCWSTR, friendlyname: windows_sys::core::PCWSTR, imagename: windows_sys::core::PCWSTR, tspname: windows_sys::core::PCWSTR) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 945:1: generic scalar type unsupported
// pub type PFAXROUTEADDFILE = Option<unsafe extern "system" fn(jobid: u32, filename: windows_sys::core::PCWSTR, guid: *mut windows_sys::core::GUID) -> i32>;

// UNSUPPORTED Rust 946:1: generic scalar type unsupported
// pub type PFAXROUTEDELETEFILE = Option<unsafe extern "system" fn(jobid: u32, filename: windows_sys::core::PCWSTR) -> i32>;

// UNSUPPORTED Rust 947:1: generic scalar type unsupported
// pub type PFAXROUTEDEVICECHANGENOTIFICATION = Option<unsafe extern "system" fn(param0: u32, param1: windows_sys::core::BOOL) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 948:1: generic scalar type unsupported
// pub type PFAXROUTEDEVICEENABLE = Option<unsafe extern "system" fn(param0: windows_sys::core::PCWSTR, param1: u32, param2: i32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 949:1: generic scalar type unsupported
// pub type PFAXROUTEENUMFILE = Option<unsafe extern "system" fn(jobid: u32, guidowner: *mut windows_sys::core::GUID, guidcaller: *mut windows_sys::core::GUID, filename: windows_sys::core::PCWSTR, context: *mut core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 950:1: generic scalar type unsupported
// pub type PFAXROUTEENUMFILES = Option<unsafe extern "system" fn(jobid: u32, guid: *mut windows_sys::core::GUID, fileenumerator: PFAXROUTEENUMFILE, context: *mut core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 951:1: generic scalar type unsupported
// pub type PFAXROUTEGETFILE = Option<unsafe extern "system" fn(jobid: u32, index: u32, filenamebuffer: windows_sys::core::PWSTR, requiredsize: *mut u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 952:1: generic scalar type unsupported
// pub type PFAXROUTEGETROUTINGINFO = Option<unsafe extern "system" fn(param0: windows_sys::core::PCWSTR, param1: u32, param2: *mut u8, param3: *mut u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 953:1: generic scalar type unsupported
// pub type PFAXROUTEINITIALIZE = Option<unsafe extern "system" fn(param0: super::super::Foundation::HANDLE, param1: *mut FAX_ROUTE_CALLBACKROUTINES) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 954:1: generic scalar type unsupported
// pub type PFAXROUTEMETHOD = Option<unsafe extern "system" fn(param0: *const FAX_ROUTE, param1: *mut *mut core::ffi::c_void, param2: *mut u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 955:1: generic scalar type unsupported
// pub type PFAXROUTEMODIFYROUTINGDATA = Option<unsafe extern "system" fn(jobid: u32, routingguid: windows_sys::core::PCWSTR, routingdata: *mut u8, routingdatasize: u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 956:1: generic scalar type unsupported
// pub type PFAXROUTESETROUTINGINFO = Option<unsafe extern "system" fn(param0: windows_sys::core::PCWSTR, param1: u32, param2: *const u8, param3: u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 957:1: generic scalar type unsupported
// pub type PFAXSENDDOCUMENTA = Option<unsafe extern "system" fn(faxhandle: super::super::Foundation::HANDLE, filename: windows_sys::core::PCSTR, jobparams: *const FAX_JOB_PARAMA, coverpageinfo: *const FAX_COVERPAGE_INFOA, faxjobid: *mut u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 958:1: generic scalar type unsupported
// pub type PFAXSENDDOCUMENTFORBROADCASTA = Option<unsafe extern "system" fn(faxhandle: super::super::Foundation::HANDLE, filename: windows_sys::core::PCSTR, faxjobid: *mut u32, faxrecipientcallback: PFAX_RECIPIENT_CALLBACKA, context: *const core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 959:1: generic scalar type unsupported
// pub type PFAXSENDDOCUMENTFORBROADCASTW = Option<unsafe extern "system" fn(faxhandle: super::super::Foundation::HANDLE, filename: windows_sys::core::PCWSTR, faxjobid: *mut u32, faxrecipientcallback: PFAX_RECIPIENT_CALLBACKW, context: *const core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 960:1: generic scalar type unsupported
// pub type PFAXSENDDOCUMENTW = Option<unsafe extern "system" fn(faxhandle: super::super::Foundation::HANDLE, filename: windows_sys::core::PCWSTR, jobparams: *const FAX_JOB_PARAMW, coverpageinfo: *const FAX_COVERPAGE_INFOW, faxjobid: *mut u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 961:1: generic scalar type unsupported
// pub type PFAXSETCONFIGURATIONA = Option<unsafe extern "system" fn(faxhandle: super::super::Foundation::HANDLE, faxconfig: *const FAX_CONFIGURATIONA) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 962:1: generic scalar type unsupported
// pub type PFAXSETCONFIGURATIONW = Option<unsafe extern "system" fn(faxhandle: super::super::Foundation::HANDLE, faxconfig: *const FAX_CONFIGURATIONW) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 963:1: generic scalar type unsupported
// pub type PFAXSETGLOBALROUTINGINFOA = Option<unsafe extern "system" fn(faxporthandle: super::super::Foundation::HANDLE, routinginfo: *const FAX_GLOBAL_ROUTING_INFOA) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 964:1: generic scalar type unsupported
// pub type PFAXSETGLOBALROUTINGINFOW = Option<unsafe extern "system" fn(faxporthandle: super::super::Foundation::HANDLE, routinginfo: *const FAX_GLOBAL_ROUTING_INFOW) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 965:1: generic scalar type unsupported
// pub type PFAXSETJOBA = Option<unsafe extern "system" fn(faxhandle: super::super::Foundation::HANDLE, jobid: u32, command: u32, jobentry: *const FAX_JOB_ENTRYA) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 966:1: generic scalar type unsupported
// pub type PFAXSETJOBW = Option<unsafe extern "system" fn(faxhandle: super::super::Foundation::HANDLE, jobid: u32, command: u32, jobentry: *const FAX_JOB_ENTRYW) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 967:1: generic scalar type unsupported
// pub type PFAXSETLOGGINGCATEGORIESA = Option<unsafe extern "system" fn(faxhandle: super::super::Foundation::HANDLE, categories: *const FAX_LOG_CATEGORYA, numbercategories: u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 968:1: generic scalar type unsupported
// pub type PFAXSETLOGGINGCATEGORIESW = Option<unsafe extern "system" fn(faxhandle: super::super::Foundation::HANDLE, categories: *const FAX_LOG_CATEGORYW, numbercategories: u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 969:1: generic scalar type unsupported
// pub type PFAXSETPORTA = Option<unsafe extern "system" fn(faxporthandle: super::super::Foundation::HANDLE, portinfo: *const FAX_PORT_INFOA) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 970:1: generic scalar type unsupported
// pub type PFAXSETPORTW = Option<unsafe extern "system" fn(faxporthandle: super::super::Foundation::HANDLE, portinfo: *const FAX_PORT_INFOW) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 971:1: generic scalar type unsupported
// pub type PFAXSETROUTINGINFOA = Option<unsafe extern "system" fn(faxporthandle: super::super::Foundation::HANDLE, routingguid: windows_sys::core::PCSTR, routinginfobuffer: *const u8, routinginfobuffersize: u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 972:1: generic scalar type unsupported
// pub type PFAXSETROUTINGINFOW = Option<unsafe extern "system" fn(faxporthandle: super::super::Foundation::HANDLE, routingguid: windows_sys::core::PCWSTR, routinginfobuffer: *const u8, routinginfobuffersize: u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 973:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Graphics_Gdi")]
// pub type PFAXSTARTPRINTJOBA = Option<unsafe extern "system" fn(printername: windows_sys::core::PCSTR, printinfo: *const FAX_PRINT_INFOA, faxjobid: *mut u32, faxcontextinfo: *mut FAX_CONTEXT_INFOA) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 975:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Graphics_Gdi")]
// pub type PFAXSTARTPRINTJOBW = Option<unsafe extern "system" fn(printername: windows_sys::core::PCWSTR, printinfo: *const FAX_PRINT_INFOW, faxjobid: *mut u32, faxcontextinfo: *mut FAX_CONTEXT_INFOW) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 977:1: generic scalar type unsupported
// pub type PFAXUNREGISTERSERVICEPROVIDERW = Option<unsafe extern "system" fn(deviceprovider: windows_sys::core::PCWSTR) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 978:1: generic scalar type unsupported
// pub type PFAX_EXT_CONFIG_CHANGE = Option<unsafe extern "system" fn(param0: u32, param1: windows_sys::core::PCWSTR, param2: *mut u8, param3: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 979:1: generic scalar type unsupported
// pub type PFAX_EXT_FREE_BUFFER = Option<unsafe extern "system" fn(param0: *mut core::ffi::c_void)>;

// UNSUPPORTED Rust 980:1: generic scalar type unsupported
// pub type PFAX_EXT_GET_DATA = Option<unsafe extern "system" fn(param0: u32, param1: FAX_ENUM_DEVICE_ID_SOURCE, param2: windows_sys::core::PCWSTR, param3: *mut *mut u8, param4: *mut u32) -> u32>;

// UNSUPPORTED Rust 981:1: generic scalar type unsupported
// pub type PFAX_EXT_INITIALIZE_CONFIG = Option<unsafe extern "system" fn(param0: PFAX_EXT_GET_DATA, param1: PFAX_EXT_SET_DATA, param2: PFAX_EXT_REGISTER_FOR_EVENTS, param3: PFAX_EXT_UNREGISTER_FOR_EVENTS, param4: PFAX_EXT_FREE_BUFFER) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 982:1: generic scalar type unsupported
// pub type PFAX_EXT_REGISTER_FOR_EVENTS = Option<unsafe extern "system" fn(param0: super::super::Foundation::HINSTANCE, param1: u32, param2: FAX_ENUM_DEVICE_ID_SOURCE, param3: windows_sys::core::PCWSTR, param4: PFAX_EXT_CONFIG_CHANGE) -> super::super::Foundation::HANDLE>;

// UNSUPPORTED Rust 983:1: generic scalar type unsupported
// pub type PFAX_EXT_SET_DATA = Option<unsafe extern "system" fn(param0: super::super::Foundation::HINSTANCE, param1: u32, param2: FAX_ENUM_DEVICE_ID_SOURCE, param3: windows_sys::core::PCWSTR, param4: *mut u8, param5: u32) -> u32>;

// UNSUPPORTED Rust 984:1: generic scalar type unsupported
// pub type PFAX_EXT_UNREGISTER_FOR_EVENTS = Option<unsafe extern "system" fn(param0: super::super::Foundation::HANDLE) -> u32>;

// UNSUPPORTED Rust 985:1: generic scalar type unsupported
// pub type PFAX_LINECALLBACK = Option<unsafe extern "system" fn(faxhandle: super::super::Foundation::HANDLE, hdevice: u32, dwmessage: u32, dwinstance: usize, dwparam1: usize, dwparam2: usize, dwparam3: usize)>;

// UNSUPPORTED Rust 986:1: generic scalar type unsupported
// pub type PFAX_RECIPIENT_CALLBACKA = Option<unsafe extern "system" fn(faxhandle: super::super::Foundation::HANDLE, recipientnumber: u32, context: *const core::ffi::c_void, jobparams: *mut FAX_JOB_PARAMA, coverpageinfo: *mut FAX_COVERPAGE_INFOA) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 987:1: generic scalar type unsupported
// pub type PFAX_RECIPIENT_CALLBACKW = Option<unsafe extern "system" fn(faxhandle: super::super::Foundation::HANDLE, recipientnumber: u32, context: *const core::ffi::c_void, jobparams: *mut FAX_JOB_PARAMW, coverpageinfo: *mut FAX_COVERPAGE_INFOW) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 988:1: generic scalar type unsupported
// pub type PFAX_ROUTING_INSTALLATION_CALLBACKW = Option<unsafe extern "system" fn(faxhandle: super::super::Foundation::HANDLE, context: *const core::ffi::c_void, methodname: windows_sys::core::PWSTR, friendlyname: windows_sys::core::PWSTR, functionname: windows_sys::core::PWSTR, guid: windows_sys::core::PWSTR) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 989:1: generic scalar type unsupported
// pub type PFAX_SEND_CALLBACK = Option<unsafe extern "system" fn(faxhandle: super::super::Foundation::HANDLE, callhandle: u32, reserved1: u32, reserved2: u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 990:1: generic scalar type unsupported
// pub type PFAX_SERVICE_CALLBACK = Option<unsafe extern "system" fn(faxhandle: super::super::Foundation::HANDLE, deviceid: u32, param1: usize, param2: usize, param3: usize) -> windows_sys::core::BOOL>;

public const val `PORT_OPEN_MODIFY`: `FAX_ENUM_PORT_OPEN_TYPE` = 2;
public const val `PORT_OPEN_QUERY`: `FAX_ENUM_PORT_OPEN_TYPE` = 1;
public const val `QUERY_STATUS`: `FAXROUTE_ENABLE` = -1;
// UNSUPPORTED Rust 994:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_BAUDRATE: windows_sys::core::PCWSTR = windows_sys::core::w!("BaudRate");

// UNSUPPORTED Rust 995:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_BAUDRATE_A: windows_sys::core::PCSTR = windows_sys::core::s!("BaudRate");

// UNSUPPORTED Rust 996:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_DATA_W: windows_sys::core::PCWSTR = windows_sys::core::w!("DeviceData");

// UNSUPPORTED Rust 997:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_DEVICESUBTYPE_W: windows_sys::core::PCWSTR = windows_sys::core::w!("DeviceSubType");

// UNSUPPORTED Rust 998:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_DEVICETYPE_W: windows_sys::core::PCWSTR = windows_sys::core::w!("DeviceType");

// UNSUPPORTED Rust 999:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_DEVICE_NAME_W: windows_sys::core::PCWSTR = windows_sys::core::w!("DriverDesc");

// UNSUPPORTED Rust 1000:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_DEV_NAME_W: windows_sys::core::PCWSTR = windows_sys::core::w!("DeviceName");

// UNSUPPORTED Rust 1001:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_DRIVER_DESC_W: windows_sys::core::PCWSTR = windows_sys::core::w!("DriverDesc");

// UNSUPPORTED Rust 1002:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_FRIENDLY_NAME_W: windows_sys::core::PCWSTR = windows_sys::core::w!("FriendlyName");

// UNSUPPORTED Rust 1003:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_GENERIC_CAPS_W: windows_sys::core::PCWSTR = windows_sys::core::w!("Capabilities");

// UNSUPPORTED Rust 1004:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_GUID: windows_sys::core::PCWSTR = windows_sys::core::w!("GUID");

// UNSUPPORTED Rust 1005:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_GUID_W: windows_sys::core::PCWSTR = windows_sys::core::w!("GUID");

// UNSUPPORTED Rust 1006:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_HARDWARE: windows_sys::core::PCWSTR = windows_sys::core::w!("HardwareConfig");

// UNSUPPORTED Rust 1007:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_HARDWARE_W: windows_sys::core::PCWSTR = windows_sys::core::w!("HardwareConfig");

// UNSUPPORTED Rust 1008:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_LAUNCHABLE: windows_sys::core::PCWSTR = windows_sys::core::w!("Launchable");

// UNSUPPORTED Rust 1009:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_LAUNCHABLE_W: windows_sys::core::PCWSTR = windows_sys::core::w!("Launchable");

// UNSUPPORTED Rust 1010:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_LAUNCH_APPS: windows_sys::core::PCWSTR = windows_sys::core::w!("LaunchApplications");

// UNSUPPORTED Rust 1011:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_LAUNCH_APPS_W: windows_sys::core::PCWSTR = windows_sys::core::w!("LaunchApplications");

// UNSUPPORTED Rust 1012:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_SHUTDOWNDELAY: windows_sys::core::PCWSTR = windows_sys::core::w!("ShutdownIfUnusedDelay");

// UNSUPPORTED Rust 1013:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_SHUTDOWNDELAY_W: windows_sys::core::PCWSTR = windows_sys::core::w!("ShutdownIfUnusedDelay");

// UNSUPPORTED Rust 1014:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_TYPE_W: windows_sys::core::PCWSTR = windows_sys::core::w!("Type");

// UNSUPPORTED Rust 1015:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_VENDOR_NAME_W: windows_sys::core::PCWSTR = windows_sys::core::w!("Vendor");

public const val `SEND_TO_FAX_RECIPIENT_ATTACHMENT`: `SendToMode` = 0;
public const val `STATUS_DISABLE`: `FAXROUTE_ENABLE` = 0;
public const val `STATUS_ENABLE`: `FAXROUTE_ENABLE` = 1;
public const val `STIEDFL_ALLDEVICES`: UInt = 0u;
public const val `STIEDFL_ATTACHEDONLY`: UInt = 1u;
public const val `STIERR_ALREADY_INITIALIZED`: Int = -2147023649;
public const val `STIERR_BADDRIVER`: Int = -2147024777;
public const val `STIERR_BETA_VERSION`: Int = -2147023743;
public const val `STIERR_DEVICENOTREG`: Int = -2147221164;
public const val `STIERR_DEVICE_LOCKED`: Int = -2147024863;
public const val `STIERR_DEVICE_NOTREADY`: Int = -2147024875;
public const val `STIERR_GENERIC`: Int = -2147467259;
public const val `STIERR_HANDLEEXISTS`: Int = -2147024713;
public const val `STIERR_INVALID_DEVICE_NAME`: Int = -2147024773;
public const val `STIERR_INVALID_HW_TYPE`: Int = -2147024883;
public const val `STIERR_INVALID_PARAM`: Int = -2147024809;
public const val `STIERR_NEEDS_LOCK`: Int = -2147024738;
public const val `STIERR_NOEVENTS`: Int = -2147024637;
public const val `STIERR_NOINTERFACE`: Int = -2147467262;
public const val `STIERR_NOTINITIALIZED`: Int = -2147024891;
public const val `STIERR_NOT_INITIALIZED`: Int = -2147024875;
public const val `STIERR_OBJECTNOTFOUND`: Int = -2147024894;
public const val `STIERR_OLD_VERSION`: Int = -2147023746;
public const val `STIERR_OUTOFMEMORY`: Int = -2147024882;
public const val `STIERR_READONLY`: Int = -2147024891;
public const val `STIERR_SHARING_VIOLATION`: Int = -2147024864;
public const val `STIERR_UNSUPPORTED`: Int = -2147467263;
// UNSUPPORTED Rust 1043:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct STINOTIFY {
//     pub dwSize: u32,
//     pub guidNotificationCode: windows_sys::core::GUID,
//     pub abNotificationData: [u8; 64],
// }

// UNSUPPORTED Rust 1050:1: declaration Impl has no candidate rule
// impl Default for STINOTIFY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1055:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct STISUBSCRIBE {
//     pub dwSize: u32,
//     pub dwFlags: u32,
//     pub dwFilter: u32,
//     pub hWndNotify: super::super::Foundation::HWND,
//     pub hEvent: super::super::Foundation::HANDLE,
//     pub uiNotificationMessage: u32,
// }

// UNSUPPORTED Rust 1065:1: declaration Impl has no candidate rule
// impl Default for STISUBSCRIBE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1070:1: non-scalar type Ptr unsupported
// pub const STI_ADD_DEVICE_BROADCAST_ACTION: windows_sys::core::PCSTR = windows_sys::core::s!("Arrival");

// UNSUPPORTED Rust 1071:1: non-scalar type Ptr unsupported
// pub const STI_ADD_DEVICE_BROADCAST_STRING: windows_sys::core::PCSTR = windows_sys::core::s!("STI\\");

public const val `STI_CHANGENOEFFECT`: Int = 1;
public const val `STI_DEVICE_CREATE_BOTH`: UInt = 3u;
public const val `STI_DEVICE_CREATE_DATA`: UInt = 2u;
public const val `STI_DEVICE_CREATE_FOR_MONITOR`: UInt = 16777216u;
public const val `STI_DEVICE_CREATE_MASK`: UInt = 65535u;
public const val `STI_DEVICE_CREATE_STATUS`: UInt = 1u;
// UNSUPPORTED Rust 1078:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct STI_DEVICE_INFORMATIONW {
//     pub dwSize: u32,
//     pub DeviceType: u32,
//     pub szDeviceInternalName: [u16; 128],
//     pub DeviceCapabilitiesA: STI_DEV_CAPS,
//     pub dwHardwareConfiguration: u32,
//     pub pszVendorDescription: windows_sys::core::PWSTR,
//     pub pszDeviceDescription: windows_sys::core::PWSTR,
//     pub pszPortName: windows_sys::core::PWSTR,
//     pub pszPropProvider: windows_sys::core::PWSTR,
//     pub pszLocalName: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 1092:1: declaration Impl has no candidate rule
// impl Default for STI_DEVICE_INFORMATIONW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `STI_DEVICE_MJ_TYPE` = Int;
// UNSUPPORTED Rust 1098:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct STI_DEVICE_STATUS {
//     pub dwSize: u32,
//     pub StatusMask: u32,
//     pub dwOnlineState: u32,
//     pub dwHardwareStatusCode: u32,
//     pub dwEventHandlingState: u32,
//     pub dwPollingInterval: u32,
// }

// UNSUPPORTED Rust 1108:1: non-scalar type Ptr unsupported
// pub const STI_DEVICE_VALUE_DEFAULT_LAUNCHAPP: windows_sys::core::PCWSTR = windows_sys::core::w!("DefaultLaunchApp");

// UNSUPPORTED Rust 1109:1: non-scalar type Ptr unsupported
// pub const STI_DEVICE_VALUE_DEFAULT_LAUNCHAPP_A: windows_sys::core::PCSTR = windows_sys::core::s!("DefaultLaunchApp");

// UNSUPPORTED Rust 1110:1: non-scalar type Ptr unsupported
// pub const STI_DEVICE_VALUE_DISABLE_NOTIFICATIONS: windows_sys::core::PCWSTR = windows_sys::core::w!("DisableNotifications");

// UNSUPPORTED Rust 1111:1: non-scalar type Ptr unsupported
// pub const STI_DEVICE_VALUE_DISABLE_NOTIFICATIONS_A: windows_sys::core::PCSTR = windows_sys::core::s!("DisableNotifications");

// UNSUPPORTED Rust 1112:1: non-scalar type Ptr unsupported
// pub const STI_DEVICE_VALUE_ICM_PROFILE: windows_sys::core::PCWSTR = windows_sys::core::w!("ICMProfile");

// UNSUPPORTED Rust 1113:1: non-scalar type Ptr unsupported
// pub const STI_DEVICE_VALUE_ICM_PROFILE_A: windows_sys::core::PCSTR = windows_sys::core::s!("ICMProfile");

// UNSUPPORTED Rust 1114:1: non-scalar type Ptr unsupported
// pub const STI_DEVICE_VALUE_ISIS_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("ISISDriverName");

// UNSUPPORTED Rust 1115:1: non-scalar type Ptr unsupported
// pub const STI_DEVICE_VALUE_ISIS_NAME_A: windows_sys::core::PCSTR = windows_sys::core::s!("ISISDriverName");

// UNSUPPORTED Rust 1116:1: non-scalar type Ptr unsupported
// pub const STI_DEVICE_VALUE_TIMEOUT: windows_sys::core::PCWSTR = windows_sys::core::w!("PollTimeout");

// UNSUPPORTED Rust 1117:1: non-scalar type Ptr unsupported
// pub const STI_DEVICE_VALUE_TIMEOUT_A: windows_sys::core::PCSTR = windows_sys::core::s!("PollTimeout");

// UNSUPPORTED Rust 1118:1: non-scalar type Ptr unsupported
// pub const STI_DEVICE_VALUE_TWAIN_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("TwainDS");

// UNSUPPORTED Rust 1119:1: non-scalar type Ptr unsupported
// pub const STI_DEVICE_VALUE_TWAIN_NAME_A: windows_sys::core::PCSTR = windows_sys::core::s!("TwainDS");

public const val `STI_DEVSTATUS_EVENTS_STATE`: UInt = 2u;
public const val `STI_DEVSTATUS_ONLINE_STATE`: UInt = 1u;
// UNSUPPORTED Rust 1122:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct STI_DEV_CAPS {
//     pub dwGeneric: u32,
// }

// UNSUPPORTED Rust 1127:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct STI_DIAG {
//     pub dwSize: u32,
//     pub dwBasicDiagCode: u32,
//     pub dwVendorDiagCode: u32,
//     pub dwStatusMask: u32,
//     pub sErrorInfo: _ERROR_INFOW,
// }

public const val `STI_DIAGCODE_HWPRESENCE`: UInt = 1u;
public const val `STI_ERROR_NO_ERROR`: Int = 0;
public const val `STI_EVENTHANDLING_ENABLED`: UInt = 1u;
public const val `STI_EVENTHANDLING_PENDING`: UInt = 4u;
public const val `STI_EVENTHANDLING_POLLING`: UInt = 2u;
public const val `STI_GENCAP_AUTO_PORTSELECT`: UInt = 8u;
public const val `STI_GENCAP_COMMON_MASK`: UInt = 255u;
public const val `STI_GENCAP_GENERATE_ARRIVALEVENT`: UInt = 4u;
public const val `STI_GENCAP_NOTIFICATIONS`: UInt = 1u;
public const val `STI_GENCAP_POLLING_NEEDED`: UInt = 2u;
public const val `STI_GENCAP_SUBSET`: UInt = 32u;
public const val `STI_GENCAP_WIA`: UInt = 16u;
public const val `STI_HW_CONFIG_PARALLEL`: UInt = 16u;
public const val `STI_HW_CONFIG_SCSI`: UInt = 2u;
public const val `STI_HW_CONFIG_SERIAL`: UInt = 8u;
public const val `STI_HW_CONFIG_UNKNOWN`: UInt = 1u;
public const val `STI_HW_CONFIG_USB`: UInt = 4u;
public const val `STI_MAX_INTERNAL_NAME_LENGTH`: UInt = 128u;
public const val `STI_NOTCONNECTED`: Int = 1;
public const val `STI_OK`: Int = 0;
public const val `STI_ONLINESTATE_BUSY`: UInt = 256u;
public const val `STI_ONLINESTATE_ERROR`: UInt = 4u;
public const val `STI_ONLINESTATE_INITIALIZING`: UInt = 1024u;
public const val `STI_ONLINESTATE_IO_ACTIVE`: UInt = 128u;
public const val `STI_ONLINESTATE_OFFLINE`: UInt = 64u;
public const val `STI_ONLINESTATE_OPERATIONAL`: UInt = 1u;
public const val `STI_ONLINESTATE_PAPER_JAM`: UInt = 16u;
public const val `STI_ONLINESTATE_PAPER_PROBLEM`: UInt = 32u;
public const val `STI_ONLINESTATE_PAUSED`: UInt = 8u;
public const val `STI_ONLINESTATE_PENDING`: UInt = 2u;
public const val `STI_ONLINESTATE_POWER_SAVE`: UInt = 8192u;
public const val `STI_ONLINESTATE_TRANSFERRING`: UInt = 512u;
public const val `STI_ONLINESTATE_USER_INTERVENTION`: UInt = 4096u;
public const val `STI_ONLINESTATE_WARMING_UP`: UInt = 2048u;
public const val `STI_RAW_RESERVED`: UInt = 4096u;
// UNSUPPORTED Rust 1171:1: non-scalar type Ptr unsupported
// pub const STI_REMOVE_DEVICE_BROADCAST_ACTION: windows_sys::core::PCSTR = windows_sys::core::s!("Removal");

// UNSUPPORTED Rust 1172:1: non-scalar type Ptr unsupported
// pub const STI_REMOVE_DEVICE_BROADCAST_STRING: windows_sys::core::PCSTR = windows_sys::core::s!("STI\\");

public const val `STI_SUBSCRIBE_FLAG_EVENT`: UInt = 2u;
public const val `STI_SUBSCRIBE_FLAG_WINDOW`: UInt = 1u;
public const val `STI_TRACE_ERROR`: UInt = 4u;
public const val `STI_TRACE_INFORMATION`: UInt = 1u;
public const val `STI_TRACE_WARNING`: UInt = 2u;
public const val `STI_UNICODE`: UInt = 1u;
// UNSUPPORTED Rust 1179:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct STI_USD_CAPS {
//     pub dwVersion: u32,
//     pub dwGenericCaps: u32,
// }

public const val `STI_USD_GENCAP_NATIVE_PUSHSUPPORT`: UInt = 1u;
public const val `STI_VERSION`: UInt = 2u;
public const val `STI_VERSION_FLAG_MASK`: UInt = 4278190080u;
public const val `STI_VERSION_FLAG_UNICODE`: UInt = 16777216u;
public const val `STI_VERSION_MIN_ALLOWED`: UInt = 2u;
public const val `STI_VERSION_REAL`: UInt = 2u;
// UNSUPPORTED Rust 1191:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct STI_WIA_DEVICE_INFORMATIONW {
//     pub dwSize: u32,
//     pub DeviceType: u32,
//     pub szDeviceInternalName: [u16; 128],
//     pub DeviceCapabilitiesA: STI_DEV_CAPS,
//     pub dwHardwareConfiguration: u32,
//     pub pszVendorDescription: windows_sys::core::PWSTR,
//     pub pszDeviceDescription: windows_sys::core::PWSTR,
//     pub pszPortName: windows_sys::core::PWSTR,
//     pub pszPropProvider: windows_sys::core::PWSTR,
//     pub pszLocalName: windows_sys::core::PWSTR,
//     pub pszUiDll: windows_sys::core::PWSTR,
//     pub pszServer: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 1207:1: declaration Impl has no candidate rule
// impl Default for STI_WIA_DEVICE_INFORMATIONW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1212:1: non-scalar type Ptr unsupported
// pub const SUPPORTS_MSCPLUS_STR: windows_sys::core::PCWSTR = windows_sys::core::w!("SupportsMSCPlus");

public const val `SUPPORTS_MSCPLUS_VAL`: UInt = 1u;
public typealias `SendToMode` = Int;
public const val `StiDeviceTypeDefault`: `STI_DEVICE_MJ_TYPE` = 0;
public const val `StiDeviceTypeDigitalCamera`: `STI_DEVICE_MJ_TYPE` = 2;
public const val `StiDeviceTypeScanner`: `STI_DEVICE_MJ_TYPE` = 1;
public const val `StiDeviceTypeStreamingVideo`: `STI_DEVICE_MJ_TYPE` = 3;
public const val `WIA_INCOMPAT_XP`: UInt = 1u;
// UNSUPPORTED Rust 1220:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct _ERROR_INFOW {
//     pub dwSize: u32,
//     pub dwGenericError: u32,
//     pub dwVendorError: u32,
//     pub szExtendedErrorText: [u16; 255],
// }

// UNSUPPORTED Rust 1228:1: declaration Impl has no candidate rule
// impl Default for _ERROR_INFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `faetFXSSVC_ENDED`: `FAX_ACCOUNT_EVENTS_TYPE_ENUM` = 16;
public const val `faetIN_ARCHIVE`: `FAX_ACCOUNT_EVENTS_TYPE_ENUM` = 4;
public const val `faetIN_QUEUE`: `FAX_ACCOUNT_EVENTS_TYPE_ENUM` = 1;
public const val `faetNONE`: `FAX_ACCOUNT_EVENTS_TYPE_ENUM` = 0;
public const val `faetOUT_ARCHIVE`: `FAX_ACCOUNT_EVENTS_TYPE_ENUM` = 8;
public const val `faetOUT_QUEUE`: `FAX_ACCOUNT_EVENTS_TYPE_ENUM` = 2;
public const val `far2MANAGE_ARCHIVES`: `FAX_ACCESS_RIGHTS_ENUM_2` = 256;
public const val `far2MANAGE_CONFIG`: `FAX_ACCESS_RIGHTS_ENUM_2` = 64;
public const val `far2MANAGE_OUT_JOBS`: `FAX_ACCESS_RIGHTS_ENUM_2` = 16;
public const val `far2MANAGE_RECEIVE_FOLDER`: `FAX_ACCESS_RIGHTS_ENUM_2` = 512;
public const val `far2QUERY_ARCHIVES`: `FAX_ACCESS_RIGHTS_ENUM_2` = 128;
public const val `far2QUERY_CONFIG`: `FAX_ACCESS_RIGHTS_ENUM_2` = 32;
public const val `far2QUERY_OUT_JOBS`: `FAX_ACCESS_RIGHTS_ENUM_2` = 8;
public const val `far2SUBMIT_HIGH`: `FAX_ACCESS_RIGHTS_ENUM_2` = 4;
public const val `far2SUBMIT_LOW`: `FAX_ACCESS_RIGHTS_ENUM_2` = 1;
public const val `far2SUBMIT_NORMAL`: `FAX_ACCESS_RIGHTS_ENUM_2` = 2;
public const val `farMANAGE_CONFIG`: `FAX_ACCESS_RIGHTS_ENUM` = 64;
public const val `farMANAGE_IN_ARCHIVE`: `FAX_ACCESS_RIGHTS_ENUM` = 256;
public const val `farMANAGE_JOBS`: `FAX_ACCESS_RIGHTS_ENUM` = 16;
public const val `farMANAGE_OUT_ARCHIVE`: `FAX_ACCESS_RIGHTS_ENUM` = 1024;
public const val `farQUERY_CONFIG`: `FAX_ACCESS_RIGHTS_ENUM` = 32;
public const val `farQUERY_IN_ARCHIVE`: `FAX_ACCESS_RIGHTS_ENUM` = 128;
public const val `farQUERY_JOBS`: `FAX_ACCESS_RIGHTS_ENUM` = 8;
public const val `farQUERY_OUT_ARCHIVE`: `FAX_ACCESS_RIGHTS_ENUM` = 512;
public const val `farSUBMIT_HIGH`: `FAX_ACCESS_RIGHTS_ENUM` = 4;
public const val `farSUBMIT_LOW`: `FAX_ACCESS_RIGHTS_ENUM` = 1;
public const val `farSUBMIT_NORMAL`: `FAX_ACCESS_RIGHTS_ENUM` = 2;
public const val `fcptLOCAL`: `FAX_COVERPAGE_TYPE_ENUM` = 1;
public const val `fcptNONE`: `FAX_COVERPAGE_TYPE_ENUM` = 0;
public const val `fcptSERVER`: `FAX_COVERPAGE_TYPE_ENUM` = 2;
public const val `fdrmAUTO_ANSWER`: `FAX_DEVICE_RECEIVE_MODE_ENUM` = 1;
public const val `fdrmMANUAL_ANSWER`: `FAX_DEVICE_RECEIVE_MODE_ENUM` = 2;
public const val `fdrmNO_ANSWER`: `FAX_DEVICE_RECEIVE_MODE_ENUM` = 0;
public const val `fgsALL_DEV_NOT_VALID`: `FAX_GROUP_STATUS_ENUM` = 2;
public const val `fgsALL_DEV_VALID`: `FAX_GROUP_STATUS_ENUM` = 0;
public const val `fgsEMPTY`: `FAX_GROUP_STATUS_ENUM` = 1;
public const val `fgsSOME_DEV_NOT_VALID`: `FAX_GROUP_STATUS_ENUM` = 3;
public const val `fjesANSWERED`: `FAX_JOB_EXTENDED_STATUS_ENUM` = 5;
public const val `fjesBAD_ADDRESS`: `FAX_JOB_EXTENDED_STATUS_ENUM` = 10;
public const val `fjesBUSY`: `FAX_JOB_EXTENDED_STATUS_ENUM` = 8;
public const val `fjesCALL_ABORTED`: `FAX_JOB_EXTENDED_STATUS_ENUM` = 19;
public const val `fjesCALL_BLACKLISTED`: `FAX_JOB_EXTENDED_STATUS_ENUM` = 14;
public const val `fjesCALL_COMPLETED`: `FAX_JOB_EXTENDED_STATUS_ENUM` = 18;
public const val `fjesCALL_DELAYED`: `FAX_JOB_EXTENDED_STATUS_ENUM` = 13;
public const val `fjesDIALING`: `FAX_JOB_EXTENDED_STATUS_ENUM` = 3;
public const val `fjesDISCONNECTED`: `FAX_JOB_EXTENDED_STATUS_ENUM` = 1;
public const val `fjesFATAL_ERROR`: `FAX_JOB_EXTENDED_STATUS_ENUM` = 12;
public const val `fjesHANDLED`: `FAX_JOB_EXTENDED_STATUS_ENUM` = 17;
public const val `fjesINITIALIZING`: `FAX_JOB_EXTENDED_STATUS_ENUM` = 2;
public const val `fjesLINE_UNAVAILABLE`: `FAX_JOB_EXTENDED_STATUS_ENUM` = 7;
public const val `fjesNONE`: `FAX_JOB_EXTENDED_STATUS_ENUM` = 0;
public const val `fjesNOT_FAX_CALL`: `FAX_JOB_EXTENDED_STATUS_ENUM` = 15;
public const val `fjesNO_ANSWER`: `FAX_JOB_EXTENDED_STATUS_ENUM` = 9;
public const val `fjesNO_DIAL_TONE`: `FAX_JOB_EXTENDED_STATUS_ENUM` = 11;
public const val `fjesPARTIALLY_RECEIVED`: `FAX_JOB_EXTENDED_STATUS_ENUM` = 16;
public const val `fjesPROPRIETARY`: `FAX_JOB_EXTENDED_STATUS_ENUM` = 16777216;
public const val `fjesRECEIVING`: `FAX_JOB_EXTENDED_STATUS_ENUM` = 6;
public const val `fjesTRANSMITTING`: `FAX_JOB_EXTENDED_STATUS_ENUM` = 4;
public const val `fjoDELETE`: `FAX_JOB_OPERATIONS_ENUM` = 16;
public const val `fjoPAUSE`: `FAX_JOB_OPERATIONS_ENUM` = 2;
public const val `fjoRECIPIENT_INFO`: `FAX_JOB_OPERATIONS_ENUM` = 32;
public const val `fjoRESTART`: `FAX_JOB_OPERATIONS_ENUM` = 8;
public const val `fjoRESUME`: `FAX_JOB_OPERATIONS_ENUM` = 4;
public const val `fjoSENDER_INFO`: `FAX_JOB_OPERATIONS_ENUM` = 64;
public const val `fjoVIEW`: `FAX_JOB_OPERATIONS_ENUM` = 1;
public const val `fjsCANCELED`: `FAX_JOB_STATUS_ENUM` = 512;
public const val `fjsCANCELING`: `FAX_JOB_STATUS_ENUM` = 1024;
public const val `fjsCOMPLETED`: `FAX_JOB_STATUS_ENUM` = 256;
public const val `fjsFAILED`: `FAX_JOB_STATUS_ENUM` = 8;
public const val `fjsINPROGRESS`: `FAX_JOB_STATUS_ENUM` = 2;
public const val `fjsNOLINE`: `FAX_JOB_STATUS_ENUM` = 32;
public const val `fjsPAUSED`: `FAX_JOB_STATUS_ENUM` = 16;
public const val `fjsPENDING`: `FAX_JOB_STATUS_ENUM` = 1;
public const val `fjsRETRIES_EXCEEDED`: `FAX_JOB_STATUS_ENUM` = 128;
public const val `fjsRETRYING`: `FAX_JOB_STATUS_ENUM` = 64;
public const val `fjsROUTING`: `FAX_JOB_STATUS_ENUM` = 2048;
public const val `fjtRECEIVE`: `FAX_JOB_TYPE_ENUM` = 1;
public const val `fjtROUTING`: `FAX_JOB_TYPE_ENUM` = 2;
public const val `fjtSEND`: `FAX_JOB_TYPE_ENUM` = 0;
public const val `fllMAX`: `FAX_LOG_LEVEL_ENUM` = 3;
public const val `fllMED`: `FAX_LOG_LEVEL_ENUM` = 2;
public const val `fllMIN`: `FAX_LOG_LEVEL_ENUM` = 1;
public const val `fllNONE`: `FAX_LOG_LEVEL_ENUM` = 0;
public const val `fpsBAD_GUID`: `FAX_PROVIDER_STATUS_ENUM` = 2;
public const val `fpsBAD_VERSION`: `FAX_PROVIDER_STATUS_ENUM` = 3;
public const val `fpsCANT_INIT`: `FAX_PROVIDER_STATUS_ENUM` = 6;
public const val `fpsCANT_LINK`: `FAX_PROVIDER_STATUS_ENUM` = 5;
public const val `fpsCANT_LOAD`: `FAX_PROVIDER_STATUS_ENUM` = 4;
public const val `fpsSERVER_ERROR`: `FAX_PROVIDER_STATUS_ENUM` = 1;
public const val `fpsSUCCESS`: `FAX_PROVIDER_STATUS_ENUM` = 0;
public const val `fptHIGH`: `FAX_PRIORITY_TYPE_ENUM` = 2;
public const val `fptLOW`: `FAX_PRIORITY_TYPE_ENUM` = 0;
public const val `fptNORMAL`: `FAX_PRIORITY_TYPE_ENUM` = 1;
public const val `frrcANY_CODE`: `FAX_ROUTING_RULE_CODE_ENUM` = 0;
public const val `frsALL_GROUP_DEV_NOT_VALID`: `FAX_RULE_STATUS_ENUM` = 2;
public const val `frsBAD_DEVICE`: `FAX_RULE_STATUS_ENUM` = 4;
public const val `frsEMPTY_GROUP`: `FAX_RULE_STATUS_ENUM` = 1;
public const val `frsSOME_GROUP_DEV_NOT_VALID`: `FAX_RULE_STATUS_ENUM` = 3;
public const val `frsVALID`: `FAX_RULE_STATUS_ENUM` = 0;
public const val `frtMAIL`: `FAX_RECEIPT_TYPE_ENUM` = 1;
public const val `frtMSGBOX`: `FAX_RECEIPT_TYPE_ENUM` = 4;
public const val `frtNONE`: `FAX_RECEIPT_TYPE_ENUM` = 0;
public const val `fsAPI_VERSION_0`: `FAX_SERVER_APIVERSION_ENUM` = 0;
public const val `fsAPI_VERSION_1`: `FAX_SERVER_APIVERSION_ENUM` = 65536;
public const val `fsAPI_VERSION_2`: `FAX_SERVER_APIVERSION_ENUM` = 131072;
public const val `fsAPI_VERSION_3`: `FAX_SERVER_APIVERSION_ENUM` = 196608;
public const val `fsatANONYMOUS`: `FAX_SMTP_AUTHENTICATION_TYPE_ENUM` = 0;
public const val `fsatBASIC`: `FAX_SMTP_AUTHENTICATION_TYPE_ENUM` = 1;
public const val `fsatNTLM`: `FAX_SMTP_AUTHENTICATION_TYPE_ENUM` = 2;
public const val `fsetACTIVITY`: `FAX_SERVER_EVENTS_TYPE_ENUM` = 8;
public const val `fsetCONFIG`: `FAX_SERVER_EVENTS_TYPE_ENUM` = 4;
public const val `fsetDEVICE_STATUS`: `FAX_SERVER_EVENTS_TYPE_ENUM` = 256;
public const val `fsetFXSSVC_ENDED`: `FAX_SERVER_EVENTS_TYPE_ENUM` = 128;
public const val `fsetINCOMING_CALL`: `FAX_SERVER_EVENTS_TYPE_ENUM` = 512;
public const val `fsetIN_ARCHIVE`: `FAX_SERVER_EVENTS_TYPE_ENUM` = 32;
public const val `fsetIN_QUEUE`: `FAX_SERVER_EVENTS_TYPE_ENUM` = 1;
public const val `fsetNONE`: `FAX_SERVER_EVENTS_TYPE_ENUM` = 0;
public const val `fsetOUT_ARCHIVE`: `FAX_SERVER_EVENTS_TYPE_ENUM` = 64;
public const val `fsetOUT_QUEUE`: `FAX_SERVER_EVENTS_TYPE_ENUM` = 2;
public const val `fsetQUEUE_STATE`: `FAX_SERVER_EVENTS_TYPE_ENUM` = 16;
public const val `fstDISCOUNT_PERIOD`: `FAX_SCHEDULE_TYPE_ENUM` = 2;
public const val `fstNOW`: `FAX_SCHEDULE_TYPE_ENUM` = 0;
public const val `fstSPECIFIC_TIME`: `FAX_SCHEDULE_TYPE_ENUM` = 1;
public const val `lDEFAULT_PREFETCH_SIZE`: Int = 100;
public const val `prv_DEFAULT_PREFETCH_SIZE`: UInt = 100u;
public const val `wcharREASSIGN_RECIPIENTS_DELIMITER`: UShort = 59u;
