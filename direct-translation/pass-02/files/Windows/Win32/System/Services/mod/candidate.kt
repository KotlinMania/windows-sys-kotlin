// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn ChangeServiceConfig2A(hservice : SC_HANDLE, dwinfolevel : SERVICE_CONFIG, lpinfo : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn ChangeServiceConfig2W(hservice : SC_HANDLE, dwinfolevel : SERVICE_CONFIG, lpinfo : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn ChangeServiceConfigA(hservice : SC_HANDLE, dwservicetype : ENUM_SERVICE_TYPE, dwstarttype : SERVICE_START_TYPE, dwerrorcontrol : SERVICE_ERROR, lpbinarypathname : windows_sys::core::PCSTR, lploadordergroup : windows_sys::core::PCSTR, lpdwtagid : *mut u32, lpdependencies : windows_sys::core::PCSTR, lpservicestartname : windows_sys::core::PCSTR, lppassword : windows_sys::core::PCSTR, lpdisplayname : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn ChangeServiceConfigW(hservice : SC_HANDLE, dwservicetype : ENUM_SERVICE_TYPE, dwstarttype : SERVICE_START_TYPE, dwerrorcontrol : SERVICE_ERROR, lpbinarypathname : windows_sys::core::PCWSTR, lploadordergroup : windows_sys::core::PCWSTR, lpdwtagid : *mut u32, lpdependencies : windows_sys::core::PCWSTR, lpservicestartname : windows_sys::core::PCWSTR, lppassword : windows_sys::core::PCWSTR, lpdisplayname : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CloseServiceHandle(hscobject : SC_HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn ControlService(hservice : SC_HANDLE, dwcontrol : u32, lpservicestatus : *mut SERVICE_STATUS) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn ControlServiceExA(hservice : SC_HANDLE, dwcontrol : u32, dwinfolevel : u32, pcontrolparams : *mut core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn ControlServiceExW(hservice : SC_HANDLE, dwcontrol : u32, dwinfolevel : u32, pcontrolparams : *mut core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CreateServiceA(hscmanager : SC_HANDLE, lpservicename : windows_sys::core::PCSTR, lpdisplayname : windows_sys::core::PCSTR, dwdesiredaccess : u32, dwservicetype : ENUM_SERVICE_TYPE, dwstarttype : SERVICE_START_TYPE, dwerrorcontrol : SERVICE_ERROR, lpbinarypathname : windows_sys::core::PCSTR, lploadordergroup : windows_sys::core::PCSTR, lpdwtagid : *mut u32, lpdependencies : windows_sys::core::PCSTR, lpservicestartname : windows_sys::core::PCSTR, lppassword : windows_sys::core::PCSTR) -> SC_HANDLE);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CreateServiceW(hscmanager : SC_HANDLE, lpservicename : windows_sys::core::PCWSTR, lpdisplayname : windows_sys::core::PCWSTR, dwdesiredaccess : u32, dwservicetype : ENUM_SERVICE_TYPE, dwstarttype : SERVICE_START_TYPE, dwerrorcontrol : SERVICE_ERROR, lpbinarypathname : windows_sys::core::PCWSTR, lploadordergroup : windows_sys::core::PCWSTR, lpdwtagid : *mut u32, lpdependencies : windows_sys::core::PCWSTR, lpservicestartname : windows_sys::core::PCWSTR, lppassword : windows_sys::core::PCWSTR) -> SC_HANDLE);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn DeleteService(hservice : SC_HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn EnumDependentServicesA(hservice : SC_HANDLE, dwservicestate : ENUM_SERVICE_STATE, lpservices : *mut ENUM_SERVICE_STATUSA, cbbufsize : u32, pcbbytesneeded : *mut u32, lpservicesreturned : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn EnumDependentServicesW(hservice : SC_HANDLE, dwservicestate : ENUM_SERVICE_STATE, lpservices : *mut ENUM_SERVICE_STATUSW, cbbufsize : u32, pcbbytesneeded : *mut u32, lpservicesreturned : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn EnumServicesStatusA(hscmanager : SC_HANDLE, dwservicetype : ENUM_SERVICE_TYPE, dwservicestate : ENUM_SERVICE_STATE, lpservices : *mut ENUM_SERVICE_STATUSA, cbbufsize : u32, pcbbytesneeded : *mut u32, lpservicesreturned : *mut u32, lpresumehandle : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn EnumServicesStatusExA(hscmanager : SC_HANDLE, infolevel : SC_ENUM_TYPE, dwservicetype : ENUM_SERVICE_TYPE, dwservicestate : ENUM_SERVICE_STATE, lpservices : *mut u8, cbbufsize : u32, pcbbytesneeded : *mut u32, lpservicesreturned : *mut u32, lpresumehandle : *mut u32, pszgroupname : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn EnumServicesStatusExW(hscmanager : SC_HANDLE, infolevel : SC_ENUM_TYPE, dwservicetype : ENUM_SERVICE_TYPE, dwservicestate : ENUM_SERVICE_STATE, lpservices : *mut u8, cbbufsize : u32, pcbbytesneeded : *mut u32, lpservicesreturned : *mut u32, lpresumehandle : *mut u32, pszgroupname : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn EnumServicesStatusW(hscmanager : SC_HANDLE, dwservicetype : ENUM_SERVICE_TYPE, dwservicestate : ENUM_SERVICE_STATE, lpservices : *mut ENUM_SERVICE_STATUSW, cbbufsize : u32, pcbbytesneeded : *mut u32, lpservicesreturned : *mut u32, lpresumehandle : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-service-core-l1-1-4.dll" "system" fn GetServiceDirectory(hservicestatus : SERVICE_STATUS_HANDLE, edirectorytype : SERVICE_DIRECTORY_TYPE, lppathbuffer : windows_sys::core::PWSTR, cchpathbufferlength : u32, lpcchrequiredbufferlength : *mut u32) -> u32);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn GetServiceDisplayNameA(hscmanager : SC_HANDLE, lpservicename : windows_sys::core::PCSTR, lpdisplayname : windows_sys::core::PSTR, lpcchbuffer : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn GetServiceDisplayNameW(hscmanager : SC_HANDLE, lpservicename : windows_sys::core::PCWSTR, lpdisplayname : windows_sys::core::PWSTR, lpcchbuffer : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn GetServiceKeyNameA(hscmanager : SC_HANDLE, lpdisplayname : windows_sys::core::PCSTR, lpservicename : windows_sys::core::PSTR, lpcchbuffer : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn GetServiceKeyNameW(hscmanager : SC_HANDLE, lpdisplayname : windows_sys::core::PCWSTR, lpservicename : windows_sys::core::PWSTR, lpcchbuffer : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("api-ms-win-service-core-l1-1-3.dll" "system" fn GetServiceRegistryStateKey(servicestatushandle : SERVICE_STATUS_HANDLE, statetype : SERVICE_REGISTRY_STATE_TYPE, accessmask : u32, servicestatekey : *mut super::Registry:: HKEY) -> u32);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-service-core-l1-1-5.dll" "system" fn GetSharedServiceDirectory(servicehandle : SC_HANDLE, directorytype : SERVICE_SHARED_DIRECTORY_TYPE, pathbuffer : windows_sys::core::PWSTR, pathbufferlength : u32, requiredbufferlength : *mut u32) -> u32);

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("api-ms-win-service-core-l1-1-5.dll" "system" fn GetSharedServiceRegistryStateKey(servicehandle : SC_HANDLE, statetype : SERVICE_SHARED_REGISTRY_STATE_TYPE, accessmask : u32, servicestatekey : *mut super::Registry:: HKEY) -> u32);

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn LockServiceDatabase(hscmanager : SC_HANDLE) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 29:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn NotifyBootConfigStatus(bootacceptable : windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 30:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn NotifyServiceStatusChangeA(hservice : SC_HANDLE, dwnotifymask : SERVICE_NOTIFY, pnotifybuffer : *const SERVICE_NOTIFY_2A) -> u32);

// UNSUPPORTED Rust 31:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn NotifyServiceStatusChangeW(hservice : SC_HANDLE, dwnotifymask : SERVICE_NOTIFY, pnotifybuffer : *const SERVICE_NOTIFY_2W) -> u32);

// UNSUPPORTED Rust 32:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn OpenSCManagerA(lpmachinename : windows_sys::core::PCSTR, lpdatabasename : windows_sys::core::PCSTR, dwdesiredaccess : u32) -> SC_HANDLE);

// UNSUPPORTED Rust 33:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn OpenSCManagerW(lpmachinename : windows_sys::core::PCWSTR, lpdatabasename : windows_sys::core::PCWSTR, dwdesiredaccess : u32) -> SC_HANDLE);

// UNSUPPORTED Rust 34:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn OpenServiceA(hscmanager : SC_HANDLE, lpservicename : windows_sys::core::PCSTR, dwdesiredaccess : u32) -> SC_HANDLE);

// UNSUPPORTED Rust 35:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn OpenServiceW(hscmanager : SC_HANDLE, lpservicename : windows_sys::core::PCWSTR, dwdesiredaccess : u32) -> SC_HANDLE);

// UNSUPPORTED Rust 36:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn QueryServiceConfig2A(hservice : SC_HANDLE, dwinfolevel : SERVICE_CONFIG, lpbuffer : *mut u8, cbbufsize : u32, pcbbytesneeded : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 37:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn QueryServiceConfig2W(hservice : SC_HANDLE, dwinfolevel : SERVICE_CONFIG, lpbuffer : *mut u8, cbbufsize : u32, pcbbytesneeded : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 38:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn QueryServiceConfigA(hservice : SC_HANDLE, lpserviceconfig : *mut QUERY_SERVICE_CONFIGA, cbbufsize : u32, pcbbytesneeded : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 39:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn QueryServiceConfigW(hservice : SC_HANDLE, lpserviceconfig : *mut QUERY_SERVICE_CONFIGW, cbbufsize : u32, pcbbytesneeded : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 40:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn QueryServiceDynamicInformation(hservicestatus : SERVICE_STATUS_HANDLE, dwinfolevel : u32, ppdynamicinfo : *mut *mut core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 41:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn QueryServiceLockStatusA(hscmanager : SC_HANDLE, lplockstatus : *mut QUERY_SERVICE_LOCK_STATUSA, cbbufsize : u32, pcbbytesneeded : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 42:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn QueryServiceLockStatusW(hscmanager : SC_HANDLE, lplockstatus : *mut QUERY_SERVICE_LOCK_STATUSW, cbbufsize : u32, pcbbytesneeded : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 43:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("advapi32.dll" "system" fn QueryServiceObjectSecurity(hservice : SC_HANDLE, dwsecurityinformation : u32, lpsecuritydescriptor : super::super::Security:: PSECURITY_DESCRIPTOR, cbbufsize : u32, pcbbytesneeded : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 45:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn QueryServiceStatus(hservice : SC_HANDLE, lpservicestatus : *mut SERVICE_STATUS) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 46:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn QueryServiceStatusEx(hservice : SC_HANDLE, infolevel : SC_STATUS_TYPE, lpbuffer : *mut u8, cbbufsize : u32, pcbbytesneeded : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 47:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn RegisterServiceCtrlHandlerA(lpservicename : windows_sys::core::PCSTR, lphandlerproc : LPHANDLER_FUNCTION) -> SERVICE_STATUS_HANDLE);

// UNSUPPORTED Rust 48:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn RegisterServiceCtrlHandlerExA(lpservicename : windows_sys::core::PCSTR, lphandlerproc : LPHANDLER_FUNCTION_EX, lpcontext : *const core::ffi::c_void) -> SERVICE_STATUS_HANDLE);

// UNSUPPORTED Rust 49:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn RegisterServiceCtrlHandlerExW(lpservicename : windows_sys::core::PCWSTR, lphandlerproc : LPHANDLER_FUNCTION_EX, lpcontext : *const core::ffi::c_void) -> SERVICE_STATUS_HANDLE);

// UNSUPPORTED Rust 50:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn RegisterServiceCtrlHandlerW(lpservicename : windows_sys::core::PCWSTR, lphandlerproc : LPHANDLER_FUNCTION) -> SERVICE_STATUS_HANDLE);

// UNSUPPORTED Rust 51:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn SetServiceBits(hservicestatus : SERVICE_STATUS_HANDLE, dwservicebits : u32, bsetbitson : windows_sys::core::BOOL, bupdateimmediately : windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 52:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("advapi32.dll" "system" fn SetServiceObjectSecurity(hservice : SC_HANDLE, dwsecurityinformation : super::super::Security:: OBJECT_SECURITY_INFORMATION, lpsecuritydescriptor : super::super::Security:: PSECURITY_DESCRIPTOR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 54:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn SetServiceStatus(hservicestatus : SERVICE_STATUS_HANDLE, lpservicestatus : *const SERVICE_STATUS) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 55:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn StartServiceA(hservice : SC_HANDLE, dwnumserviceargs : u32, lpserviceargvectors : *const windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 56:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn StartServiceCtrlDispatcherA(lpservicestarttable : *const SERVICE_TABLE_ENTRYA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 57:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn StartServiceCtrlDispatcherW(lpservicestarttable : *const SERVICE_TABLE_ENTRYW) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 58:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn StartServiceW(hservice : SC_HANDLE, dwnumserviceargs : u32, lpserviceargvectors : *const windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 59:1: declaration Macro has no candidate rule
// windows_link::link!("sechost.dll" "system" fn SubscribeServiceChangeNotifications(hservice : SC_HANDLE, eeventtype : SC_EVENT_TYPE, pcallback : PSC_NOTIFICATION_CALLBACK, pcallbackcontext : *const core::ffi::c_void, psubscription : *mut PSC_NOTIFICATION_REGISTRATION) -> u32);

// UNSUPPORTED Rust 60:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn UnlockServiceDatabase(sclock : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 61:1: declaration Macro has no candidate rule
// windows_link::link!("sechost.dll" "system" fn UnsubscribeServiceChangeNotifications(psubscription : PSC_NOTIFICATION_REGISTRATION));

// UNSUPPORTED Rust 62:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn WaitServiceState(hservice : SC_HANDLE, dwnotify : u32, dwtimeout : u32, hcancelevent : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 63:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CUSTOM_SYSTEM_STATE_CHANGE_EVENT_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2d7a2816_0c5e_45fc_9ce7_570e5ecde9c9);

// UNSUPPORTED Rust 64:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const DOMAIN_JOIN_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1ce20aba_9851_4421_9430_1ddeb766e809);

// UNSUPPORTED Rust 65:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const DOMAIN_LEAVE_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xddaf516e_58c2_4866_9574_c3b615d42ea1);

public typealias `ENUM_SERVICE_STATE` = UInt;
// UNSUPPORTED Rust 67:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ENUM_SERVICE_STATUSA {
//     pub lpServiceName: windows_sys::core::PSTR,
//     pub lpDisplayName: windows_sys::core::PSTR,
//     pub ServiceStatus: SERVICE_STATUS,
// }

// UNSUPPORTED Rust 74:1: declaration Impl has no candidate rule
// impl Default for ENUM_SERVICE_STATUSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 79:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ENUM_SERVICE_STATUSW {
//     pub lpServiceName: windows_sys::core::PWSTR,
//     pub lpDisplayName: windows_sys::core::PWSTR,
//     pub ServiceStatus: SERVICE_STATUS,
// }

// UNSUPPORTED Rust 86:1: declaration Impl has no candidate rule
// impl Default for ENUM_SERVICE_STATUSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 91:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ENUM_SERVICE_STATUS_PROCESSA {
//     pub lpServiceName: windows_sys::core::PSTR,
//     pub lpDisplayName: windows_sys::core::PSTR,
//     pub ServiceStatusProcess: SERVICE_STATUS_PROCESS,
// }

// UNSUPPORTED Rust 98:1: declaration Impl has no candidate rule
// impl Default for ENUM_SERVICE_STATUS_PROCESSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 103:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ENUM_SERVICE_STATUS_PROCESSW {
//     pub lpServiceName: windows_sys::core::PWSTR,
//     pub lpDisplayName: windows_sys::core::PWSTR,
//     pub ServiceStatusProcess: SERVICE_STATUS_PROCESS,
// }

// UNSUPPORTED Rust 110:1: declaration Impl has no candidate rule
// impl Default for ENUM_SERVICE_STATUS_PROCESSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `ENUM_SERVICE_TYPE` = UInt;
// UNSUPPORTED Rust 116:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FIREWALL_PORT_CLOSE_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa144ed38_8e12_4de4_9d96_e64740b1a524);

// UNSUPPORTED Rust 117:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FIREWALL_PORT_OPEN_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb7569e07_8421_4ee0_ad10_86915afdad09);

// UNSUPPORTED Rust 118:1: generic scalar type unsupported
// pub type HANDLER_FUNCTION = Option<unsafe extern "system" fn(dwcontrol: u32)>;

// UNSUPPORTED Rust 119:1: generic scalar type unsupported
// pub type HANDLER_FUNCTION_EX = Option<unsafe extern "system" fn(dwcontrol: u32, dweventtype: u32, lpeventdata: *mut core::ffi::c_void, lpcontext: *mut core::ffi::c_void) -> u32>;

// UNSUPPORTED Rust 120:1: generic scalar type unsupported
// pub type LPHANDLER_FUNCTION = Option<unsafe extern "system" fn(dwcontrol: u32)>;

// UNSUPPORTED Rust 121:1: generic scalar type unsupported
// pub type LPHANDLER_FUNCTION_EX = Option<unsafe extern "system" fn(dwcontrol: u32, dweventtype: u32, lpeventdata: *mut core::ffi::c_void, lpcontext: *mut core::ffi::c_void) -> u32>;

// UNSUPPORTED Rust 122:1: generic scalar type unsupported
// pub type LPSERVICE_MAIN_FUNCTIONA = Option<unsafe extern "system" fn(dwnumservicesargs: u32, lpserviceargvectors: *mut windows_sys::core::PSTR)>;

// UNSUPPORTED Rust 123:1: generic scalar type unsupported
// pub type LPSERVICE_MAIN_FUNCTIONW = Option<unsafe extern "system" fn(dwnumservicesargs: u32, lpserviceargvectors: *mut windows_sys::core::PWSTR)>;

// UNSUPPORTED Rust 124:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const MACHINE_POLICY_PRESENT_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x659fcae6_5bdb_4da9_b1ff_ca2a178d46e0);

public const val `MaxServiceRegistryStateType`: `SERVICE_REGISTRY_STATE_TYPE` = 2;
// UNSUPPORTED Rust 126:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const NAMED_PIPE_EVENT_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1f81d131_3fac_4537_9e0c_7e7b0c2f4b55);

// UNSUPPORTED Rust 127:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const NETWORK_MANAGER_FIRST_IP_ADDRESS_ARRIVAL_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4f27f2de_14e2_430b_a549_7cd48cbc8245);

// UNSUPPORTED Rust 128:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const NETWORK_MANAGER_LAST_IP_ADDRESS_REMOVAL_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcc4ba62a_162e_4648_847a_b6bdf993e335);

// UNSUPPORTED Rust 129:1: generic scalar type unsupported
// pub type PFN_SC_NOTIFY_CALLBACK = Option<unsafe extern "system" fn(pparameter: *const core::ffi::c_void)>;

// UNSUPPORTED Rust 130:1: generic scalar type unsupported
// pub type PSC_NOTIFICATION_CALLBACK = Option<unsafe extern "system" fn(dwnotify: u32, pcallbackcontext: *const core::ffi::c_void)>;

public typealias `PSC_NOTIFICATION_REGISTRATION` = Long;
// UNSUPPORTED Rust 132:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct QUERY_SERVICE_CONFIGA {
//     pub dwServiceType: ENUM_SERVICE_TYPE,
//     pub dwStartType: SERVICE_START_TYPE,
//     pub dwErrorControl: SERVICE_ERROR,
//     pub lpBinaryPathName: windows_sys::core::PSTR,
//     pub lpLoadOrderGroup: windows_sys::core::PSTR,
//     pub dwTagId: u32,
//     pub lpDependencies: windows_sys::core::PSTR,
//     pub lpServiceStartName: windows_sys::core::PSTR,
//     pub lpDisplayName: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 145:1: declaration Impl has no candidate rule
// impl Default for QUERY_SERVICE_CONFIGA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 150:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct QUERY_SERVICE_CONFIGW {
//     pub dwServiceType: ENUM_SERVICE_TYPE,
//     pub dwStartType: SERVICE_START_TYPE,
//     pub dwErrorControl: SERVICE_ERROR,
//     pub lpBinaryPathName: windows_sys::core::PWSTR,
//     pub lpLoadOrderGroup: windows_sys::core::PWSTR,
//     pub dwTagId: u32,
//     pub lpDependencies: windows_sys::core::PWSTR,
//     pub lpServiceStartName: windows_sys::core::PWSTR,
//     pub lpDisplayName: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 163:1: declaration Impl has no candidate rule
// impl Default for QUERY_SERVICE_CONFIGW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 168:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct QUERY_SERVICE_LOCK_STATUSA {
//     pub fIsLocked: u32,
//     pub lpLockOwner: windows_sys::core::PSTR,
//     pub dwLockDuration: u32,
// }

// UNSUPPORTED Rust 175:1: declaration Impl has no candidate rule
// impl Default for QUERY_SERVICE_LOCK_STATUSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 180:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct QUERY_SERVICE_LOCK_STATUSW {
//     pub fIsLocked: u32,
//     pub lpLockOwner: windows_sys::core::PWSTR,
//     pub dwLockDuration: u32,
// }

// UNSUPPORTED Rust 187:1: declaration Impl has no candidate rule
// impl Default for QUERY_SERVICE_LOCK_STATUSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 192:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const RPC_INTERFACE_EVENT_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbc90d167_9470_4139_a9ba_be0bbbf5b74d);

// UNSUPPORTED Rust 193:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SC_ACTION {
//     pub Type: SC_ACTION_TYPE,
//     pub Delay: u32,
// }

public const val `SC_ACTION_NONE`: `SC_ACTION_TYPE` = 0;
public const val `SC_ACTION_OWN_RESTART`: `SC_ACTION_TYPE` = 4;
public const val `SC_ACTION_REBOOT`: `SC_ACTION_TYPE` = 2;
public const val `SC_ACTION_RESTART`: `SC_ACTION_TYPE` = 1;
public const val `SC_ACTION_RUN_COMMAND`: `SC_ACTION_TYPE` = 3;
public typealias `SC_ACTION_TYPE` = Int;
// UNSUPPORTED Rust 205:1: non-scalar type Ptr unsupported
// pub const SC_AGGREGATE_STORAGE_KEY: windows_sys::core::PCWSTR = windows_sys::core::w!("System\\CurrentControlSet\\Control\\ServiceAggregatedEvents");

public const val `SC_ENUM_PROCESS_INFO`: `SC_ENUM_TYPE` = 0;
public typealias `SC_ENUM_TYPE` = Int;
public const val `SC_EVENT_DATABASE_CHANGE`: `SC_EVENT_TYPE` = 0;
public const val `SC_EVENT_PROPERTY_CHANGE`: `SC_EVENT_TYPE` = 1;
public const val `SC_EVENT_STATUS_CHANGE`: `SC_EVENT_TYPE` = 2;
public typealias `SC_EVENT_TYPE` = Int;
// UNSUPPORTED Rust 212:1: non-scalar type Ptr unsupported
// pub type SC_HANDLE = *mut core::ffi::c_void;

public const val `SC_MANAGER_ALL_ACCESS`: UInt = 983103u;
public const val `SC_MANAGER_CONNECT`: UInt = 1u;
public const val `SC_MANAGER_CREATE_SERVICE`: UInt = 2u;
public const val `SC_MANAGER_ENUMERATE_SERVICE`: UInt = 4u;
public const val `SC_MANAGER_LOCK`: UInt = 8u;
public const val `SC_MANAGER_MODIFY_BOOT_CONFIG`: UInt = 32u;
public const val `SC_MANAGER_QUERY_LOCK_STATUS`: UInt = 16u;
public const val `SC_STATUS_PROCESS_INFO`: `SC_STATUS_TYPE` = 0;
public typealias `SC_STATUS_TYPE` = Int;
// UNSUPPORTED Rust 222:1: non-scalar type Ptr unsupported
// pub const SERVICES_ACTIVE_DATABASE: windows_sys::core::PCWSTR = windows_sys::core::w!("ServicesActive");

// UNSUPPORTED Rust 223:1: non-scalar type Ptr unsupported
// pub const SERVICES_ACTIVE_DATABASEA: windows_sys::core::PCSTR = windows_sys::core::s!("ServicesActive");

// UNSUPPORTED Rust 224:1: non-scalar type Ptr unsupported
// pub const SERVICES_ACTIVE_DATABASEW: windows_sys::core::PCWSTR = windows_sys::core::w!("ServicesActive");

// UNSUPPORTED Rust 225:1: non-scalar type Ptr unsupported
// pub const SERVICES_FAILED_DATABASE: windows_sys::core::PCWSTR = windows_sys::core::w!("ServicesFailed");

// UNSUPPORTED Rust 226:1: non-scalar type Ptr unsupported
// pub const SERVICES_FAILED_DATABASEA: windows_sys::core::PCSTR = windows_sys::core::s!("ServicesFailed");

// UNSUPPORTED Rust 227:1: non-scalar type Ptr unsupported
// pub const SERVICES_FAILED_DATABASEW: windows_sys::core::PCWSTR = windows_sys::core::w!("ServicesFailed");

public const val `SERVICE_ACCEPT_HARDWAREPROFILECHANGE`: UInt = 32u;
public const val `SERVICE_ACCEPT_LOWRESOURCES`: UInt = 8192u;
public const val `SERVICE_ACCEPT_NETBINDCHANGE`: UInt = 16u;
public const val `SERVICE_ACCEPT_PARAMCHANGE`: UInt = 8u;
public const val `SERVICE_ACCEPT_PAUSE_CONTINUE`: UInt = 2u;
public const val `SERVICE_ACCEPT_POWEREVENT`: UInt = 64u;
public const val `SERVICE_ACCEPT_PRESHUTDOWN`: UInt = 256u;
public const val `SERVICE_ACCEPT_SESSIONCHANGE`: UInt = 128u;
public const val `SERVICE_ACCEPT_SHUTDOWN`: UInt = 4u;
public const val `SERVICE_ACCEPT_STOP`: UInt = 1u;
public const val `SERVICE_ACCEPT_SYSTEMLOWRESOURCES`: UInt = 16384u;
public const val `SERVICE_ACCEPT_TIMECHANGE`: UInt = 512u;
public const val `SERVICE_ACCEPT_TRIGGEREVENT`: UInt = 1024u;
public const val `SERVICE_ACCEPT_USER_LOGOFF`: UInt = 2048u;
public const val `SERVICE_ACTIVE`: `ENUM_SERVICE_STATE` = 1u;
public const val `SERVICE_ADAPTER`: `ENUM_SERVICE_TYPE` = 4u;
public const val `SERVICE_ALL_ACCESS`: UInt = 983551u;
public const val `SERVICE_AUTO_START`: `SERVICE_START_TYPE` = 2u;
public const val `SERVICE_BOOT_START`: `SERVICE_START_TYPE` = 0u;
public const val `SERVICE_CHANGE_CONFIG`: UInt = 2u;
public typealias `SERVICE_CONFIG` = UInt;
public const val `SERVICE_CONFIG_DELAYED_AUTO_START_INFO`: `SERVICE_CONFIG` = 3u;
public const val `SERVICE_CONFIG_DESCRIPTION`: `SERVICE_CONFIG` = 1u;
public const val `SERVICE_CONFIG_FAILURE_ACTIONS`: `SERVICE_CONFIG` = 2u;
public const val `SERVICE_CONFIG_FAILURE_ACTIONS_FLAG`: `SERVICE_CONFIG` = 4u;
public const val `SERVICE_CONFIG_LAUNCH_PROTECTED`: `SERVICE_CONFIG` = 12u;
public const val `SERVICE_CONFIG_PREFERRED_NODE`: `SERVICE_CONFIG` = 9u;
public const val `SERVICE_CONFIG_PRESHUTDOWN_INFO`: `SERVICE_CONFIG` = 7u;
public const val `SERVICE_CONFIG_REQUIRED_PRIVILEGES_INFO`: `SERVICE_CONFIG` = 6u;
public const val `SERVICE_CONFIG_SERVICE_SID_INFO`: `SERVICE_CONFIG` = 5u;
public const val `SERVICE_CONFIG_TRIGGER_INFO`: `SERVICE_CONFIG` = 8u;
public const val `SERVICE_CONTINUE_PENDING`: `SERVICE_STATUS_CURRENT_STATE` = 5u;
public const val `SERVICE_CONTROL_CONTINUE`: UInt = 3u;
public const val `SERVICE_CONTROL_DEVICEEVENT`: UInt = 11u;
public const val `SERVICE_CONTROL_HARDWAREPROFILECHANGE`: UInt = 12u;
public const val `SERVICE_CONTROL_INTERROGATE`: UInt = 4u;
public const val `SERVICE_CONTROL_LOWRESOURCES`: UInt = 96u;
public const val `SERVICE_CONTROL_NETBINDADD`: UInt = 7u;
public const val `SERVICE_CONTROL_NETBINDDISABLE`: UInt = 10u;
public const val `SERVICE_CONTROL_NETBINDENABLE`: UInt = 9u;
public const val `SERVICE_CONTROL_NETBINDREMOVE`: UInt = 8u;
public const val `SERVICE_CONTROL_PARAMCHANGE`: UInt = 6u;
public const val `SERVICE_CONTROL_PAUSE`: UInt = 2u;
public const val `SERVICE_CONTROL_POWEREVENT`: UInt = 13u;
public const val `SERVICE_CONTROL_PRESHUTDOWN`: UInt = 15u;
public const val `SERVICE_CONTROL_SESSIONCHANGE`: UInt = 14u;
public const val `SERVICE_CONTROL_SHUTDOWN`: UInt = 5u;
public const val `SERVICE_CONTROL_STATUS_REASON_INFO`: UInt = 1u;
// UNSUPPORTED Rust 276:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SERVICE_CONTROL_STATUS_REASON_PARAMSA {
//     pub dwReason: u32,
//     pub pszComment: windows_sys::core::PSTR,
//     pub ServiceStatus: SERVICE_STATUS_PROCESS,
// }

// UNSUPPORTED Rust 283:1: declaration Impl has no candidate rule
// impl Default for SERVICE_CONTROL_STATUS_REASON_PARAMSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 288:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SERVICE_CONTROL_STATUS_REASON_PARAMSW {
//     pub dwReason: u32,
//     pub pszComment: windows_sys::core::PWSTR,
//     pub ServiceStatus: SERVICE_STATUS_PROCESS,
// }

// UNSUPPORTED Rust 295:1: declaration Impl has no candidate rule
// impl Default for SERVICE_CONTROL_STATUS_REASON_PARAMSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SERVICE_CONTROL_STOP`: UInt = 1u;
public const val `SERVICE_CONTROL_SYSTEMLOWRESOURCES`: UInt = 97u;
public const val `SERVICE_CONTROL_TIMECHANGE`: UInt = 16u;
public const val `SERVICE_CONTROL_TRIGGEREVENT`: UInt = 32u;
// UNSUPPORTED Rust 304:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SERVICE_CUSTOM_SYSTEM_STATE_CHANGE_DATA_ITEM {
//     pub u: SERVICE_CUSTOM_SYSTEM_STATE_CHANGE_DATA_ITEM_0,
// }

// UNSUPPORTED Rust 309:1: declaration Impl has no candidate rule
// impl Default for SERVICE_CUSTOM_SYSTEM_STATE_CHANGE_DATA_ITEM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 314:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union SERVICE_CUSTOM_SYSTEM_STATE_CHANGE_DATA_ITEM_0 {
//     pub CustomStateId: SERVICE_TRIGGER_CUSTOM_STATE_ID,
//     pub s: SERVICE_CUSTOM_SYSTEM_STATE_CHANGE_DATA_ITEM_0_0,
// }

// UNSUPPORTED Rust 320:1: declaration Impl has no candidate rule
// impl Default for SERVICE_CUSTOM_SYSTEM_STATE_CHANGE_DATA_ITEM_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 325:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SERVICE_CUSTOM_SYSTEM_STATE_CHANGE_DATA_ITEM_0_0 {
//     pub DataOffset: u32,
//     pub Data: [u8; 1],
// }

// UNSUPPORTED Rust 331:1: declaration Impl has no candidate rule
// impl Default for SERVICE_CUSTOM_SYSTEM_STATE_CHANGE_DATA_ITEM_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 336:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVICE_DELAYED_AUTO_START_INFO {
//     pub fDelayedAutostart: windows_sys::core::BOOL,
// }

public const val `SERVICE_DEMAND_START`: `SERVICE_START_TYPE` = 3u;
// UNSUPPORTED Rust 342:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SERVICE_DESCRIPTIONA {
//     pub lpDescription: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 347:1: declaration Impl has no candidate rule
// impl Default for SERVICE_DESCRIPTIONA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 352:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SERVICE_DESCRIPTIONW {
//     pub lpDescription: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 357:1: declaration Impl has no candidate rule
// impl Default for SERVICE_DESCRIPTIONW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `SERVICE_DIRECTORY_TYPE` = Int;
public const val `SERVICE_DISABLED`: `SERVICE_START_TYPE` = 4u;
public const val `SERVICE_DRIVER`: `ENUM_SERVICE_TYPE` = 11u;
public const val `SERVICE_DYNAMIC_INFORMATION_LEVEL_START_REASON`: UInt = 1u;
public const val `SERVICE_ENUMERATE_DEPENDENTS`: UInt = 8u;
public typealias `SERVICE_ERROR` = UInt;
public const val `SERVICE_ERROR_CRITICAL`: `SERVICE_ERROR` = 3u;
public const val `SERVICE_ERROR_IGNORE`: `SERVICE_ERROR` = 0u;
public const val `SERVICE_ERROR_NORMAL`: `SERVICE_ERROR` = 1u;
public const val `SERVICE_ERROR_SEVERE`: `SERVICE_ERROR` = 2u;
// UNSUPPORTED Rust 372:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SERVICE_FAILURE_ACTIONSA {
//     pub dwResetPeriod: u32,
//     pub lpRebootMsg: windows_sys::core::PSTR,
//     pub lpCommand: windows_sys::core::PSTR,
//     pub cActions: u32,
//     pub lpsaActions: *mut SC_ACTION,
// }

// UNSUPPORTED Rust 381:1: declaration Impl has no candidate rule
// impl Default for SERVICE_FAILURE_ACTIONSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 386:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SERVICE_FAILURE_ACTIONSW {
//     pub dwResetPeriod: u32,
//     pub lpRebootMsg: windows_sys::core::PWSTR,
//     pub lpCommand: windows_sys::core::PWSTR,
//     pub cActions: u32,
//     pub lpsaActions: *mut SC_ACTION,
// }

// UNSUPPORTED Rust 395:1: declaration Impl has no candidate rule
// impl Default for SERVICE_FAILURE_ACTIONSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 400:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVICE_FAILURE_ACTIONS_FLAG {
//     pub fFailureActionsOnNonCrashFailures: windows_sys::core::BOOL,
// }

public const val `SERVICE_FILE_SYSTEM_DRIVER`: `ENUM_SERVICE_TYPE` = 2u;
public const val `SERVICE_INACTIVE`: `ENUM_SERVICE_STATE` = 2u;
public const val `SERVICE_INTERROGATE`: UInt = 128u;
public const val `SERVICE_KERNEL_DRIVER`: `ENUM_SERVICE_TYPE` = 1u;
public const val `SERVICE_LAUNCH_PROTECTED_ANTIMALWARE_LIGHT`: UInt = 3u;
// UNSUPPORTED Rust 410:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVICE_LAUNCH_PROTECTED_INFO {
//     pub dwLaunchProtected: u32,
// }

public const val `SERVICE_LAUNCH_PROTECTED_NONE`: UInt = 0u;
public const val `SERVICE_LAUNCH_PROTECTED_WINDOWS`: UInt = 1u;
public const val `SERVICE_LAUNCH_PROTECTED_WINDOWS_LIGHT`: UInt = 2u;
// UNSUPPORTED Rust 418:1: generic scalar type unsupported
// pub type SERVICE_MAIN_FUNCTIONA = Option<unsafe extern "system" fn(dwnumservicesargs: u32, lpserviceargvectors: *mut *mut i8)>;

// UNSUPPORTED Rust 419:1: generic scalar type unsupported
// pub type SERVICE_MAIN_FUNCTIONW = Option<unsafe extern "system" fn(dwnumservicesargs: u32, lpserviceargvectors: *mut windows_sys::core::PWSTR)>;

public typealias `SERVICE_NOTIFY` = UInt;
// UNSUPPORTED Rust 421:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SERVICE_NOTIFY_1 {
//     pub dwVersion: u32,
//     pub pfnNotifyCallback: PFN_SC_NOTIFY_CALLBACK,
//     pub pContext: *mut core::ffi::c_void,
//     pub dwNotificationStatus: u32,
//     pub ServiceStatus: SERVICE_STATUS_PROCESS,
// }

// UNSUPPORTED Rust 430:1: declaration Impl has no candidate rule
// impl Default for SERVICE_NOTIFY_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 435:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SERVICE_NOTIFY_2A {
//     pub dwVersion: u32,
//     pub pfnNotifyCallback: PFN_SC_NOTIFY_CALLBACK,
//     pub pContext: *mut core::ffi::c_void,
//     pub dwNotificationStatus: u32,
//     pub ServiceStatus: SERVICE_STATUS_PROCESS,
//     pub dwNotificationTriggered: u32,
//     pub pszServiceNames: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 446:1: declaration Impl has no candidate rule
// impl Default for SERVICE_NOTIFY_2A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 451:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SERVICE_NOTIFY_2W {
//     pub dwVersion: u32,
//     pub pfnNotifyCallback: PFN_SC_NOTIFY_CALLBACK,
//     pub pContext: *mut core::ffi::c_void,
//     pub dwNotificationStatus: u32,
//     pub ServiceStatus: SERVICE_STATUS_PROCESS,
//     pub dwNotificationTriggered: u32,
//     pub pszServiceNames: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 462:1: declaration Impl has no candidate rule
// impl Default for SERVICE_NOTIFY_2W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SERVICE_NOTIFY_CONTINUE_PENDING`: `SERVICE_NOTIFY` = 16u;
public const val `SERVICE_NOTIFY_CREATED`: `SERVICE_NOTIFY` = 128u;
public const val `SERVICE_NOTIFY_DELETED`: `SERVICE_NOTIFY` = 256u;
public const val `SERVICE_NOTIFY_DELETE_PENDING`: `SERVICE_NOTIFY` = 512u;
public const val `SERVICE_NOTIFY_PAUSED`: `SERVICE_NOTIFY` = 64u;
public const val `SERVICE_NOTIFY_PAUSE_PENDING`: `SERVICE_NOTIFY` = 32u;
public const val `SERVICE_NOTIFY_RUNNING`: `SERVICE_NOTIFY` = 8u;
public const val `SERVICE_NOTIFY_START_PENDING`: `SERVICE_NOTIFY` = 2u;
public const val `SERVICE_NOTIFY_STATUS_CHANGE`: UInt = 2u;
public const val `SERVICE_NOTIFY_STATUS_CHANGE_1`: UInt = 1u;
public const val `SERVICE_NOTIFY_STATUS_CHANGE_2`: UInt = 2u;
public const val `SERVICE_NOTIFY_STOPPED`: `SERVICE_NOTIFY` = 1u;
public const val `SERVICE_NOTIFY_STOP_PENDING`: `SERVICE_NOTIFY` = 4u;
public const val `SERVICE_NO_CHANGE`: UInt = 4294967295u;
public const val `SERVICE_PAUSED`: `SERVICE_STATUS_CURRENT_STATE` = 7u;
public const val `SERVICE_PAUSE_CONTINUE`: UInt = 64u;
public const val `SERVICE_PAUSE_PENDING`: `SERVICE_STATUS_CURRENT_STATE` = 6u;
// UNSUPPORTED Rust 484:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVICE_PREFERRED_NODE_INFO {
//     pub usPreferredNode: u16,
//     pub fDelete: bool,
// }

// UNSUPPORTED Rust 490:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVICE_PRESHUTDOWN_INFO {
//     pub dwPreshutdownTimeout: u32,
// }

public const val `SERVICE_QUERY_CONFIG`: UInt = 1u;
public const val `SERVICE_QUERY_STATUS`: UInt = 4u;
public const val `SERVICE_RECOGNIZER_DRIVER`: `ENUM_SERVICE_TYPE` = 8u;
public typealias `SERVICE_REGISTRY_STATE_TYPE` = Int;
// UNSUPPORTED Rust 499:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SERVICE_REQUIRED_PRIVILEGES_INFOA {
//     pub pmszRequiredPrivileges: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 504:1: declaration Impl has no candidate rule
// impl Default for SERVICE_REQUIRED_PRIVILEGES_INFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 509:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SERVICE_REQUIRED_PRIVILEGES_INFOW {
//     pub pmszRequiredPrivileges: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 514:1: declaration Impl has no candidate rule
// impl Default for SERVICE_REQUIRED_PRIVILEGES_INFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SERVICE_RUNNING`: `SERVICE_STATUS_CURRENT_STATE` = 4u;
public const val `SERVICE_RUNS_IN_NON_SYSTEM_OR_NOT_RUNNING`: `SERVICE_RUNS_IN_PROCESS` = 0u;
public typealias `SERVICE_RUNS_IN_PROCESS` = UInt;
public const val `SERVICE_RUNS_IN_SYSTEM_PROCESS`: `SERVICE_RUNS_IN_PROCESS` = 1u;
public typealias `SERVICE_SHARED_DIRECTORY_TYPE` = Int;
public typealias `SERVICE_SHARED_REGISTRY_STATE_TYPE` = Int;
// UNSUPPORTED Rust 525:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVICE_SID_INFO {
//     pub dwServiceSidType: u32,
// }

public const val `SERVICE_SID_TYPE_NONE`: UInt = 0u;
public const val `SERVICE_SID_TYPE_UNRESTRICTED`: UInt = 1u;
public const val `SERVICE_START`: UInt = 16u;
public const val `SERVICE_START_PENDING`: `SERVICE_STATUS_CURRENT_STATE` = 2u;
// UNSUPPORTED Rust 534:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVICE_START_REASON {
//     pub dwReason: u32,
// }

public const val `SERVICE_START_REASON_AUTO`: UInt = 2u;
public const val `SERVICE_START_REASON_DELAYEDAUTO`: UInt = 16u;
public const val `SERVICE_START_REASON_DEMAND`: UInt = 1u;
public const val `SERVICE_START_REASON_RESTART_ON_FAILURE`: UInt = 8u;
public const val `SERVICE_START_REASON_TRIGGER`: UInt = 4u;
public typealias `SERVICE_START_TYPE` = UInt;
public const val `SERVICE_STATE_ALL`: `ENUM_SERVICE_STATE` = 3u;
// UNSUPPORTED Rust 546:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVICE_STATUS {
//     pub dwServiceType: ENUM_SERVICE_TYPE,
//     pub dwCurrentState: SERVICE_STATUS_CURRENT_STATE,
//     pub dwControlsAccepted: u32,
//     pub dwWin32ExitCode: u32,
//     pub dwServiceSpecificExitCode: u32,
//     pub dwCheckPoint: u32,
//     pub dwWaitHint: u32,
// }

public typealias `SERVICE_STATUS_CURRENT_STATE` = UInt;
// UNSUPPORTED Rust 558:1: non-scalar type Ptr unsupported
// pub type SERVICE_STATUS_HANDLE = *mut core::ffi::c_void;

// UNSUPPORTED Rust 559:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVICE_STATUS_PROCESS {
//     pub dwServiceType: ENUM_SERVICE_TYPE,
//     pub dwCurrentState: SERVICE_STATUS_CURRENT_STATE,
//     pub dwControlsAccepted: u32,
//     pub dwWin32ExitCode: u32,
//     pub dwServiceSpecificExitCode: u32,
//     pub dwCheckPoint: u32,
//     pub dwWaitHint: u32,
//     pub dwProcessId: u32,
//     pub dwServiceFlags: SERVICE_RUNS_IN_PROCESS,
// }

public const val `SERVICE_STOP`: UInt = 32u;
public const val `SERVICE_STOPPED`: `SERVICE_STATUS_CURRENT_STATE` = 1u;
public const val `SERVICE_STOP_PENDING`: `SERVICE_STATUS_CURRENT_STATE` = 3u;
public const val `SERVICE_STOP_REASON_FLAG_CUSTOM`: UInt = 536870912u;
public const val `SERVICE_STOP_REASON_FLAG_MAX`: UInt = 2147483648u;
public const val `SERVICE_STOP_REASON_FLAG_MIN`: UInt = 0u;
public const val `SERVICE_STOP_REASON_FLAG_PLANNED`: UInt = 1073741824u;
public const val `SERVICE_STOP_REASON_FLAG_UNPLANNED`: UInt = 268435456u;
public const val `SERVICE_STOP_REASON_MAJOR_APPLICATION`: UInt = 327680u;
public const val `SERVICE_STOP_REASON_MAJOR_HARDWARE`: UInt = 131072u;
public const val `SERVICE_STOP_REASON_MAJOR_MAX`: UInt = 458752u;
public const val `SERVICE_STOP_REASON_MAJOR_MAX_CUSTOM`: UInt = 16711680u;
public const val `SERVICE_STOP_REASON_MAJOR_MIN`: UInt = 0u;
public const val `SERVICE_STOP_REASON_MAJOR_MIN_CUSTOM`: UInt = 4194304u;
public const val `SERVICE_STOP_REASON_MAJOR_NONE`: UInt = 393216u;
public const val `SERVICE_STOP_REASON_MAJOR_OPERATINGSYSTEM`: UInt = 196608u;
public const val `SERVICE_STOP_REASON_MAJOR_OTHER`: UInt = 65536u;
public const val `SERVICE_STOP_REASON_MAJOR_SOFTWARE`: UInt = 262144u;
public const val `SERVICE_STOP_REASON_MINOR_DISK`: UInt = 8u;
public const val `SERVICE_STOP_REASON_MINOR_ENVIRONMENT`: UInt = 10u;
public const val `SERVICE_STOP_REASON_MINOR_HARDWARE_DRIVER`: UInt = 11u;
public const val `SERVICE_STOP_REASON_MINOR_HUNG`: UInt = 6u;
public const val `SERVICE_STOP_REASON_MINOR_INSTALLATION`: UInt = 3u;
public const val `SERVICE_STOP_REASON_MINOR_MAINTENANCE`: UInt = 2u;
public const val `SERVICE_STOP_REASON_MINOR_MAX`: UInt = 25u;
public const val `SERVICE_STOP_REASON_MINOR_MAX_CUSTOM`: UInt = 65535u;
public const val `SERVICE_STOP_REASON_MINOR_MEMOTYLIMIT`: UInt = 24u;
public const val `SERVICE_STOP_REASON_MINOR_MIN`: UInt = 0u;
public const val `SERVICE_STOP_REASON_MINOR_MIN_CUSTOM`: UInt = 256u;
public const val `SERVICE_STOP_REASON_MINOR_MMC`: UInt = 22u;
public const val `SERVICE_STOP_REASON_MINOR_NETWORKCARD`: UInt = 9u;
public const val `SERVICE_STOP_REASON_MINOR_NETWORK_CONNECTIVITY`: UInt = 17u;
public const val `SERVICE_STOP_REASON_MINOR_NONE`: UInt = 23u;
public const val `SERVICE_STOP_REASON_MINOR_OTHER`: UInt = 1u;
public const val `SERVICE_STOP_REASON_MINOR_OTHERDRIVER`: UInt = 12u;
public const val `SERVICE_STOP_REASON_MINOR_RECONFIG`: UInt = 5u;
public const val `SERVICE_STOP_REASON_MINOR_SECURITY`: UInt = 16u;
public const val `SERVICE_STOP_REASON_MINOR_SECURITYFIX`: UInt = 15u;
public const val `SERVICE_STOP_REASON_MINOR_SECURITYFIX_UNINSTALL`: UInt = 21u;
public const val `SERVICE_STOP_REASON_MINOR_SERVICEPACK`: UInt = 13u;
public const val `SERVICE_STOP_REASON_MINOR_SERVICEPACK_UNINSTALL`: UInt = 19u;
public const val `SERVICE_STOP_REASON_MINOR_SOFTWARE_UPDATE`: UInt = 14u;
public const val `SERVICE_STOP_REASON_MINOR_SOFTWARE_UPDATE_UNINSTALL`: UInt = 20u;
public const val `SERVICE_STOP_REASON_MINOR_UNSTABLE`: UInt = 7u;
public const val `SERVICE_STOP_REASON_MINOR_UPGRADE`: UInt = 4u;
public const val `SERVICE_STOP_REASON_MINOR_WMI`: UInt = 18u;
public const val `SERVICE_SYSTEM_START`: `SERVICE_START_TYPE` = 1u;
// UNSUPPORTED Rust 619:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SERVICE_TABLE_ENTRYA {
//     pub lpServiceName: windows_sys::core::PSTR,
//     pub lpServiceProc: LPSERVICE_MAIN_FUNCTIONA,
// }

// UNSUPPORTED Rust 625:1: declaration Impl has no candidate rule
// impl Default for SERVICE_TABLE_ENTRYA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 630:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SERVICE_TABLE_ENTRYW {
//     pub lpServiceName: windows_sys::core::PWSTR,
//     pub lpServiceProc: LPSERVICE_MAIN_FUNCTIONW,
// }

// UNSUPPORTED Rust 636:1: declaration Impl has no candidate rule
// impl Default for SERVICE_TABLE_ENTRYW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 641:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERVICE_TIMECHANGE_INFO {
//     pub liNewTime: i64,
//     pub liOldTime: i64,
// }

// UNSUPPORTED Rust 647:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SERVICE_TRIGGER {
//     pub dwTriggerType: SERVICE_TRIGGER_TYPE,
//     pub dwAction: SERVICE_TRIGGER_ACTION,
//     pub pTriggerSubtype: *mut windows_sys::core::GUID,
//     pub cDataItems: u32,
//     pub pDataItems: *mut SERVICE_TRIGGER_SPECIFIC_DATA_ITEM,
// }

// UNSUPPORTED Rust 656:1: declaration Impl has no candidate rule
// impl Default for SERVICE_TRIGGER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `SERVICE_TRIGGER_ACTION` = UInt;
public const val `SERVICE_TRIGGER_ACTION_SERVICE_START`: `SERVICE_TRIGGER_ACTION` = 1u;
public const val `SERVICE_TRIGGER_ACTION_SERVICE_STOP`: `SERVICE_TRIGGER_ACTION` = 2u;
// UNSUPPORTED Rust 664:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SERVICE_TRIGGER_CUSTOM_STATE_ID {
//     pub Data: [u32; 2],
// }

// UNSUPPORTED Rust 669:1: declaration Impl has no candidate rule
// impl Default for SERVICE_TRIGGER_CUSTOM_STATE_ID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SERVICE_TRIGGER_DATA_TYPE_BINARY`: `SERVICE_TRIGGER_SPECIFIC_DATA_ITEM_DATA_TYPE` = 1u;
public const val `SERVICE_TRIGGER_DATA_TYPE_KEYWORD_ALL`: `SERVICE_TRIGGER_SPECIFIC_DATA_ITEM_DATA_TYPE` = 5u;
public const val `SERVICE_TRIGGER_DATA_TYPE_KEYWORD_ANY`: `SERVICE_TRIGGER_SPECIFIC_DATA_ITEM_DATA_TYPE` = 4u;
public const val `SERVICE_TRIGGER_DATA_TYPE_LEVEL`: `SERVICE_TRIGGER_SPECIFIC_DATA_ITEM_DATA_TYPE` = 3u;
public const val `SERVICE_TRIGGER_DATA_TYPE_STRING`: `SERVICE_TRIGGER_SPECIFIC_DATA_ITEM_DATA_TYPE` = 2u;
// UNSUPPORTED Rust 679:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SERVICE_TRIGGER_INFO {
//     pub cTriggers: u32,
//     pub pTriggers: *mut SERVICE_TRIGGER,
//     pub pReserved: *mut u8,
// }

// UNSUPPORTED Rust 686:1: declaration Impl has no candidate rule
// impl Default for SERVICE_TRIGGER_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 691:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SERVICE_TRIGGER_SPECIFIC_DATA_ITEM {
//     pub dwDataType: SERVICE_TRIGGER_SPECIFIC_DATA_ITEM_DATA_TYPE,
//     pub cbData: u32,
//     pub pData: *mut u8,
// }

// UNSUPPORTED Rust 698:1: declaration Impl has no candidate rule
// impl Default for SERVICE_TRIGGER_SPECIFIC_DATA_ITEM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `SERVICE_TRIGGER_SPECIFIC_DATA_ITEM_DATA_TYPE` = UInt;
// UNSUPPORTED Rust 704:1: non-scalar type Ptr unsupported
// pub const SERVICE_TRIGGER_STARTED_ARGUMENT: windows_sys::core::PCWSTR = windows_sys::core::w!("TriggerStarted");

public typealias `SERVICE_TRIGGER_TYPE` = UInt;
public const val `SERVICE_TRIGGER_TYPE_AGGREGATE`: UInt = 30u;
public const val `SERVICE_TRIGGER_TYPE_CUSTOM`: `SERVICE_TRIGGER_TYPE` = 20u;
public const val `SERVICE_TRIGGER_TYPE_CUSTOM_SYSTEM_STATE_CHANGE`: UInt = 7u;
public const val `SERVICE_TRIGGER_TYPE_DEVICE_INTERFACE_ARRIVAL`: `SERVICE_TRIGGER_TYPE` = 1u;
public const val `SERVICE_TRIGGER_TYPE_DOMAIN_JOIN`: `SERVICE_TRIGGER_TYPE` = 3u;
public const val `SERVICE_TRIGGER_TYPE_FIREWALL_PORT_EVENT`: `SERVICE_TRIGGER_TYPE` = 4u;
public const val `SERVICE_TRIGGER_TYPE_GROUP_POLICY`: `SERVICE_TRIGGER_TYPE` = 5u;
public const val `SERVICE_TRIGGER_TYPE_IP_ADDRESS_AVAILABILITY`: `SERVICE_TRIGGER_TYPE` = 2u;
public const val `SERVICE_TRIGGER_TYPE_NETWORK_ENDPOINT`: `SERVICE_TRIGGER_TYPE` = 6u;
public const val `SERVICE_USER_DEFINED_CONTROL`: UInt = 256u;
public const val `SERVICE_USER_OWN_PROCESS`: `ENUM_SERVICE_TYPE` = 80u;
public const val `SERVICE_USER_SHARE_PROCESS`: `ENUM_SERVICE_TYPE` = 96u;
public const val `SERVICE_WIN32`: `ENUM_SERVICE_TYPE` = 48u;
public const val `SERVICE_WIN32_OWN_PROCESS`: `ENUM_SERVICE_TYPE` = 16u;
public const val `SERVICE_WIN32_SHARE_PROCESS`: `ENUM_SERVICE_TYPE` = 32u;
public const val `ServiceDirectoryPersistentState`: `SERVICE_DIRECTORY_TYPE` = 0;
public const val `ServiceDirectoryTypeMax`: `SERVICE_DIRECTORY_TYPE` = 1;
public const val `ServiceRegistryStateParameters`: `SERVICE_REGISTRY_STATE_TYPE` = 0;
public const val `ServiceRegistryStatePersistent`: `SERVICE_REGISTRY_STATE_TYPE` = 1;
public const val `ServiceSharedDirectoryPersistentState`: `SERVICE_SHARED_DIRECTORY_TYPE` = 0;
public const val `ServiceSharedRegistryPersistentState`: `SERVICE_SHARED_REGISTRY_STATE_TYPE` = 0;
// UNSUPPORTED Rust 727:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const USER_POLICY_PRESENT_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x54fb46c8_f089_464c_b1fd_59d1b62c3b50);

