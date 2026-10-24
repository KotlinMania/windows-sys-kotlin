// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmCalloutAdd0(enginehandle : super::super::Foundation:: HANDLE, callout : *const FWPM_CALLOUT0, sd : super::super::Security:: PSECURITY_DESCRIPTOR, id : *mut u32) -> u32);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmCalloutCreateEnumHandle0(enginehandle : super::super::Foundation:: HANDLE, enumtemplate : *const FWPM_CALLOUT_ENUM_TEMPLATE0, enumhandle : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmCalloutDeleteById0(enginehandle : super::super::Foundation:: HANDLE, id : u32) -> u32);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmCalloutDeleteByKey0(enginehandle : super::super::Foundation:: HANDLE, key : *const windows_sys::core::GUID) -> u32);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmCalloutDestroyEnumHandle0(enginehandle : super::super::Foundation:: HANDLE, enumhandle : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmCalloutEnum0(enginehandle : super::super::Foundation:: HANDLE, enumhandle : super::super::Foundation:: HANDLE, numentriesrequested : u32, entries : *mut *mut *mut FWPM_CALLOUT0, numentriesreturned : *mut u32) -> u32);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmCalloutGetById0(enginehandle : super::super::Foundation:: HANDLE, id : u32, callout : *mut *mut FWPM_CALLOUT0) -> u32);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmCalloutGetByKey0(enginehandle : super::super::Foundation:: HANDLE, key : *const windows_sys::core::GUID, callout : *mut *mut FWPM_CALLOUT0) -> u32);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmCalloutGetSecurityInfoByKey0(enginehandle : super::super::Foundation:: HANDLE, key : *const windows_sys::core::GUID, securityinfo : u32, sidowner : *mut super::super::Security:: PSID, sidgroup : *mut super::super::Security:: PSID, dacl : *mut *mut super::super::Security:: ACL, sacl : *mut *mut super::super::Security:: ACL, securitydescriptor : *mut super::super::Security:: PSECURITY_DESCRIPTOR) -> u32);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmCalloutSetSecurityInfoByKey0(enginehandle : super::super::Foundation:: HANDLE, key : *const windows_sys::core::GUID, securityinfo : u32, sidowner : *const super::super::Security:: SID, sidgroup : *const super::super::Security:: SID, dacl : *const super::super::Security:: ACL, sacl : *const super::super::Security:: ACL) -> u32);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmCalloutSubscribeChanges0(enginehandle : super::super::Foundation:: HANDLE, subscription : *const FWPM_CALLOUT_SUBSCRIPTION0, callback : FWPM_CALLOUT_CHANGE_CALLBACK0, context : *const core::ffi::c_void, changehandle : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmCalloutSubscriptionsGet0(enginehandle : super::super::Foundation:: HANDLE, entries : *mut *mut *mut FWPM_CALLOUT_SUBSCRIPTION0, numentries : *mut u32) -> u32);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmCalloutUnsubscribeChanges0(enginehandle : super::super::Foundation:: HANDLE, changehandle : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmConnectionCreateEnumHandle0(enginehandle : super::super::Foundation:: HANDLE, enumtemplate : *const FWPM_CONNECTION_ENUM_TEMPLATE0, enumhandle : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmConnectionDestroyEnumHandle0(enginehandle : super::super::Foundation:: HANDLE, enumhandle : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmConnectionEnum0(enginehandle : super::super::Foundation:: HANDLE, enumhandle : super::super::Foundation:: HANDLE, numentriesrequested : u32, entries : *mut *mut *mut FWPM_CONNECTION0, numentriesreturned : *mut u32) -> u32);

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmConnectionGetById0(enginehandle : super::super::Foundation:: HANDLE, id : u64, connection : *mut *mut FWPM_CONNECTION0) -> u32);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmConnectionGetSecurityInfo0(enginehandle : super::super::Foundation:: HANDLE, securityinfo : u32, sidowner : *mut super::super::Security:: PSID, sidgroup : *mut super::super::Security:: PSID, dacl : *mut *mut super::super::Security:: ACL, sacl : *mut *mut super::super::Security:: ACL, securitydescriptor : *mut super::super::Security:: PSECURITY_DESCRIPTOR) -> u32);

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmConnectionSetSecurityInfo0(enginehandle : super::super::Foundation:: HANDLE, securityinfo : u32, sidowner : *const super::super::Security:: SID, sidgroup : *const super::super::Security:: SID, dacl : *const super::super::Security:: ACL, sacl : *const super::super::Security:: ACL) -> u32);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmConnectionSubscribe0(enginehandle : super::super::Foundation:: HANDLE, subscription : *const FWPM_CONNECTION_SUBSCRIPTION0, callback : FWPM_CONNECTION_CALLBACK0, context : *const core::ffi::c_void, eventshandle : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmConnectionUnsubscribe0(enginehandle : super::super::Foundation:: HANDLE, eventshandle : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmDynamicKeywordSubscribe0(flags : u32, callback : FWPM_DYNAMIC_KEYWORD_CALLBACK0, context : *const core::ffi::c_void, subscriptionhandle : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmDynamicKeywordUnsubscribe0(subscriptionhandle : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 29:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmEngineClose0(enginehandle : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 30:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmEngineGetOption0(enginehandle : super::super::Foundation:: HANDLE, option : FWPM_ENGINE_OPTION, value : *mut *mut FWP_VALUE0) -> u32);

// UNSUPPORTED Rust 32:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmEngineGetSecurityInfo0(enginehandle : super::super::Foundation:: HANDLE, securityinfo : u32, sidowner : *mut super::super::Security:: PSID, sidgroup : *mut super::super::Security:: PSID, dacl : *mut *mut super::super::Security:: ACL, sacl : *mut *mut super::super::Security:: ACL, securitydescriptor : *mut super::super::Security:: PSECURITY_DESCRIPTOR) -> u32);

// UNSUPPORTED Rust 34:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_Security", feature = "Win32_System_Rpc"))]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmEngineOpen0(servername : windows_sys::core::PCWSTR, authnservice : u32, authidentity : *const super::super::System::Rpc:: SEC_WINNT_AUTH_IDENTITY_W, session : *const FWPM_SESSION0, enginehandle : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 36:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmEngineSetOption0(enginehandle : super::super::Foundation:: HANDLE, option : FWPM_ENGINE_OPTION, newvalue : *const FWP_VALUE0) -> u32);

// UNSUPPORTED Rust 38:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmEngineSetSecurityInfo0(enginehandle : super::super::Foundation:: HANDLE, securityinfo : u32, sidowner : *const super::super::Security:: SID, sidgroup : *const super::super::Security:: SID, dacl : *const super::super::Security:: ACL, sacl : *const super::super::Security:: ACL) -> u32);

// UNSUPPORTED Rust 40:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmFilterAdd0(enginehandle : super::super::Foundation:: HANDLE, filter : *const FWPM_FILTER0, sd : super::super::Security:: PSECURITY_DESCRIPTOR, id : *mut u64) -> u32);

// UNSUPPORTED Rust 42:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmFilterCreateEnumHandle0(enginehandle : super::super::Foundation:: HANDLE, enumtemplate : *const FWPM_FILTER_ENUM_TEMPLATE0, enumhandle : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 44:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmFilterDeleteById0(enginehandle : super::super::Foundation:: HANDLE, id : u64) -> u32);

// UNSUPPORTED Rust 45:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmFilterDeleteByKey0(enginehandle : super::super::Foundation:: HANDLE, key : *const windows_sys::core::GUID) -> u32);

// UNSUPPORTED Rust 46:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmFilterDestroyEnumHandle0(enginehandle : super::super::Foundation:: HANDLE, enumhandle : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 47:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmFilterEnum0(enginehandle : super::super::Foundation:: HANDLE, enumhandle : super::super::Foundation:: HANDLE, numentriesrequested : u32, entries : *mut *mut *mut FWPM_FILTER0, numentriesreturned : *mut u32) -> u32);

// UNSUPPORTED Rust 49:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmFilterGetById0(enginehandle : super::super::Foundation:: HANDLE, id : u64, filter : *mut *mut FWPM_FILTER0) -> u32);

// UNSUPPORTED Rust 51:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmFilterGetByKey0(enginehandle : super::super::Foundation:: HANDLE, key : *const windows_sys::core::GUID, filter : *mut *mut FWPM_FILTER0) -> u32);

// UNSUPPORTED Rust 53:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmFilterGetSecurityInfoByKey0(enginehandle : super::super::Foundation:: HANDLE, key : *const windows_sys::core::GUID, securityinfo : u32, sidowner : *mut super::super::Security:: PSID, sidgroup : *mut super::super::Security:: PSID, dacl : *mut *mut super::super::Security:: ACL, sacl : *mut *mut super::super::Security:: ACL, securitydescriptor : *mut super::super::Security:: PSECURITY_DESCRIPTOR) -> u32);

// UNSUPPORTED Rust 55:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmFilterSetSecurityInfoByKey0(enginehandle : super::super::Foundation:: HANDLE, key : *const windows_sys::core::GUID, securityinfo : u32, sidowner : *const super::super::Security:: SID, sidgroup : *const super::super::Security:: SID, dacl : *const super::super::Security:: ACL, sacl : *const super::super::Security:: ACL) -> u32);

// UNSUPPORTED Rust 57:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmFilterSubscribeChanges0(enginehandle : super::super::Foundation:: HANDLE, subscription : *const FWPM_FILTER_SUBSCRIPTION0, callback : FWPM_FILTER_CHANGE_CALLBACK0, context : *const core::ffi::c_void, changehandle : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 59:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmFilterSubscriptionsGet0(enginehandle : super::super::Foundation:: HANDLE, entries : *mut *mut *mut FWPM_FILTER_SUBSCRIPTION0, numentries : *mut u32) -> u32);

// UNSUPPORTED Rust 61:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmFilterUnsubscribeChanges0(enginehandle : super::super::Foundation:: HANDLE, changehandle : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 62:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmFreeMemory0(p : *mut *mut core::ffi::c_void));

// UNSUPPORTED Rust 63:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmGetAppIdFromFileName0(filename : windows_sys::core::PCWSTR, appid : *mut *mut FWP_BYTE_BLOB) -> u32);

// UNSUPPORTED Rust 64:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmIPsecTunnelAdd0(enginehandle : super::super::Foundation:: HANDLE, flags : u32, mainmodepolicy : *const FWPM_PROVIDER_CONTEXT0, tunnelpolicy : *const FWPM_PROVIDER_CONTEXT0, numfilterconditions : u32, filterconditions : *const FWPM_FILTER_CONDITION0, sd : super::super::Security:: PSECURITY_DESCRIPTOR) -> u32);

// UNSUPPORTED Rust 66:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmIPsecTunnelAdd1(enginehandle : super::super::Foundation:: HANDLE, flags : u32, mainmodepolicy : *const FWPM_PROVIDER_CONTEXT1, tunnelpolicy : *const FWPM_PROVIDER_CONTEXT1, numfilterconditions : u32, filterconditions : *const FWPM_FILTER_CONDITION0, keymodkey : *const windows_sys::core::GUID, sd : super::super::Security:: PSECURITY_DESCRIPTOR) -> u32);

// UNSUPPORTED Rust 68:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmIPsecTunnelAdd2(enginehandle : super::super::Foundation:: HANDLE, flags : u32, mainmodepolicy : *const FWPM_PROVIDER_CONTEXT2, tunnelpolicy : *const FWPM_PROVIDER_CONTEXT2, numfilterconditions : u32, filterconditions : *const FWPM_FILTER_CONDITION0, keymodkey : *const windows_sys::core::GUID, sd : super::super::Security:: PSECURITY_DESCRIPTOR) -> u32);

// UNSUPPORTED Rust 70:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmIPsecTunnelAdd3(enginehandle : super::super::Foundation:: HANDLE, flags : u32, mainmodepolicy : *const FWPM_PROVIDER_CONTEXT3, tunnelpolicy : *const FWPM_PROVIDER_CONTEXT3, numfilterconditions : u32, filterconditions : *const FWPM_FILTER_CONDITION0, keymodkey : *const windows_sys::core::GUID, sd : super::super::Security:: PSECURITY_DESCRIPTOR) -> u32);

// UNSUPPORTED Rust 72:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmIPsecTunnelDeleteByKey0(enginehandle : super::super::Foundation:: HANDLE, key : *const windows_sys::core::GUID) -> u32);

// UNSUPPORTED Rust 73:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmLayerCreateEnumHandle0(enginehandle : super::super::Foundation:: HANDLE, enumtemplate : *const FWPM_LAYER_ENUM_TEMPLATE0, enumhandle : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 74:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmLayerDestroyEnumHandle0(enginehandle : super::super::Foundation:: HANDLE, enumhandle : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 75:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmLayerEnum0(enginehandle : super::super::Foundation:: HANDLE, enumhandle : super::super::Foundation:: HANDLE, numentriesrequested : u32, entries : *mut *mut *mut FWPM_LAYER0, numentriesreturned : *mut u32) -> u32);

// UNSUPPORTED Rust 76:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmLayerGetById0(enginehandle : super::super::Foundation:: HANDLE, id : u16, layer : *mut *mut FWPM_LAYER0) -> u32);

// UNSUPPORTED Rust 77:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmLayerGetByKey0(enginehandle : super::super::Foundation:: HANDLE, key : *const windows_sys::core::GUID, layer : *mut *mut FWPM_LAYER0) -> u32);

// UNSUPPORTED Rust 78:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmLayerGetSecurityInfoByKey0(enginehandle : super::super::Foundation:: HANDLE, key : *const windows_sys::core::GUID, securityinfo : u32, sidowner : *mut super::super::Security:: PSID, sidgroup : *mut super::super::Security:: PSID, dacl : *mut *mut super::super::Security:: ACL, sacl : *mut *mut super::super::Security:: ACL, securitydescriptor : *mut super::super::Security:: PSECURITY_DESCRIPTOR) -> u32);

// UNSUPPORTED Rust 80:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmLayerSetSecurityInfoByKey0(enginehandle : super::super::Foundation:: HANDLE, key : *const windows_sys::core::GUID, securityinfo : u32, sidowner : *const super::super::Security:: SID, sidgroup : *const super::super::Security:: SID, dacl : *const super::super::Security:: ACL, sacl : *const super::super::Security:: ACL) -> u32);

// UNSUPPORTED Rust 82:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmNetEventCreateEnumHandle0(enginehandle : super::super::Foundation:: HANDLE, enumtemplate : *const FWPM_NET_EVENT_ENUM_TEMPLATE0, enumhandle : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 84:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmNetEventDestroyEnumHandle0(enginehandle : super::super::Foundation:: HANDLE, enumhandle : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 85:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmNetEventEnum0(enginehandle : super::super::Foundation:: HANDLE, enumhandle : super::super::Foundation:: HANDLE, numentriesrequested : u32, entries : *mut *mut *mut FWPM_NET_EVENT0, numentriesreturned : *mut u32) -> u32);

// UNSUPPORTED Rust 87:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmNetEventEnum1(enginehandle : super::super::Foundation:: HANDLE, enumhandle : super::super::Foundation:: HANDLE, numentriesrequested : u32, entries : *mut *mut *mut FWPM_NET_EVENT1, numentriesreturned : *mut u32) -> u32);

// UNSUPPORTED Rust 89:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmNetEventEnum2(enginehandle : super::super::Foundation:: HANDLE, enumhandle : super::super::Foundation:: HANDLE, numentriesrequested : u32, entries : *mut *mut *mut FWPM_NET_EVENT2, numentriesreturned : *mut u32) -> u32);

// UNSUPPORTED Rust 91:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmNetEventEnum3(enginehandle : super::super::Foundation:: HANDLE, enumhandle : super::super::Foundation:: HANDLE, numentriesrequested : u32, entries : *mut *mut *mut FWPM_NET_EVENT3, numentriesreturned : *mut u32) -> u32);

// UNSUPPORTED Rust 93:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmNetEventEnum4(enginehandle : super::super::Foundation:: HANDLE, enumhandle : super::super::Foundation:: HANDLE, numentriesrequested : u32, entries : *mut *mut *mut FWPM_NET_EVENT4, numentriesreturned : *mut u32) -> u32);

// UNSUPPORTED Rust 95:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmNetEventEnum5(enginehandle : super::super::Foundation:: HANDLE, enumhandle : super::super::Foundation:: HANDLE, numentriesrequested : u32, entries : *mut *mut *mut FWPM_NET_EVENT5, numentriesreturned : *mut u32) -> u32);

// UNSUPPORTED Rust 97:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmNetEventSubscribe0(enginehandle : super::super::Foundation:: HANDLE, subscription : *const FWPM_NET_EVENT_SUBSCRIPTION0, callback : FWPM_NET_EVENT_CALLBACK0, context : *const core::ffi::c_void, eventshandle : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 99:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmNetEventSubscribe1(enginehandle : super::super::Foundation:: HANDLE, subscription : *const FWPM_NET_EVENT_SUBSCRIPTION0, callback : FWPM_NET_EVENT_CALLBACK1, context : *const core::ffi::c_void, eventshandle : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 101:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmNetEventSubscribe2(enginehandle : super::super::Foundation:: HANDLE, subscription : *const FWPM_NET_EVENT_SUBSCRIPTION0, callback : FWPM_NET_EVENT_CALLBACK2, context : *const core::ffi::c_void, eventshandle : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 103:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmNetEventSubscribe3(enginehandle : super::super::Foundation:: HANDLE, subscription : *const FWPM_NET_EVENT_SUBSCRIPTION0, callback : FWPM_NET_EVENT_CALLBACK3, context : *const core::ffi::c_void, eventshandle : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 105:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmNetEventSubscribe4(enginehandle : super::super::Foundation:: HANDLE, subscription : *const FWPM_NET_EVENT_SUBSCRIPTION0, callback : FWPM_NET_EVENT_CALLBACK4, context : *const core::ffi::c_void, eventshandle : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 107:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmNetEventSubscriptionsGet0(enginehandle : super::super::Foundation:: HANDLE, entries : *mut *mut *mut FWPM_NET_EVENT_SUBSCRIPTION0, numentries : *mut u32) -> u32);

// UNSUPPORTED Rust 109:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmNetEventUnsubscribe0(enginehandle : super::super::Foundation:: HANDLE, eventshandle : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 110:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmNetEventsGetSecurityInfo0(enginehandle : super::super::Foundation:: HANDLE, securityinfo : u32, sidowner : *mut super::super::Security:: PSID, sidgroup : *mut super::super::Security:: PSID, dacl : *mut *mut super::super::Security:: ACL, sacl : *mut *mut super::super::Security:: ACL, securitydescriptor : *mut super::super::Security:: PSECURITY_DESCRIPTOR) -> u32);

// UNSUPPORTED Rust 112:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmNetEventsSetSecurityInfo0(enginehandle : super::super::Foundation:: HANDLE, securityinfo : u32, sidowner : *const super::super::Security:: SID, sidgroup : *const super::super::Security:: SID, dacl : *const super::super::Security:: ACL, sacl : *const super::super::Security:: ACL) -> u32);

// UNSUPPORTED Rust 114:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmProviderAdd0(enginehandle : super::super::Foundation:: HANDLE, provider : *const FWPM_PROVIDER0, sd : super::super::Security:: PSECURITY_DESCRIPTOR) -> u32);

// UNSUPPORTED Rust 116:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmProviderContextAdd0(enginehandle : super::super::Foundation:: HANDLE, providercontext : *const FWPM_PROVIDER_CONTEXT0, sd : super::super::Security:: PSECURITY_DESCRIPTOR, id : *mut u64) -> u32);

// UNSUPPORTED Rust 118:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmProviderContextAdd1(enginehandle : super::super::Foundation:: HANDLE, providercontext : *const FWPM_PROVIDER_CONTEXT1, sd : super::super::Security:: PSECURITY_DESCRIPTOR, id : *mut u64) -> u32);

// UNSUPPORTED Rust 120:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmProviderContextAdd2(enginehandle : super::super::Foundation:: HANDLE, providercontext : *const FWPM_PROVIDER_CONTEXT2, sd : super::super::Security:: PSECURITY_DESCRIPTOR, id : *mut u64) -> u32);

// UNSUPPORTED Rust 122:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmProviderContextAdd3(enginehandle : super::super::Foundation:: HANDLE, providercontext : *const FWPM_PROVIDER_CONTEXT3, sd : super::super::Security:: PSECURITY_DESCRIPTOR, id : *mut u64) -> u32);

// UNSUPPORTED Rust 124:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmProviderContextCreateEnumHandle0(enginehandle : super::super::Foundation:: HANDLE, enumtemplate : *const FWPM_PROVIDER_CONTEXT_ENUM_TEMPLATE0, enumhandle : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 125:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmProviderContextDeleteById0(enginehandle : super::super::Foundation:: HANDLE, id : u64) -> u32);

// UNSUPPORTED Rust 126:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmProviderContextDeleteByKey0(enginehandle : super::super::Foundation:: HANDLE, key : *const windows_sys::core::GUID) -> u32);

// UNSUPPORTED Rust 127:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmProviderContextDestroyEnumHandle0(enginehandle : super::super::Foundation:: HANDLE, enumhandle : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 128:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmProviderContextEnum0(enginehandle : super::super::Foundation:: HANDLE, enumhandle : super::super::Foundation:: HANDLE, numentriesrequested : u32, entries : *mut *mut *mut FWPM_PROVIDER_CONTEXT0, numentriesreturned : *mut u32) -> u32);

// UNSUPPORTED Rust 130:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmProviderContextEnum1(enginehandle : super::super::Foundation:: HANDLE, enumhandle : super::super::Foundation:: HANDLE, numentriesrequested : u32, entries : *mut *mut *mut FWPM_PROVIDER_CONTEXT1, numentriesreturned : *mut u32) -> u32);

// UNSUPPORTED Rust 132:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmProviderContextEnum2(enginehandle : super::super::Foundation:: HANDLE, enumhandle : super::super::Foundation:: HANDLE, numentriesrequested : u32, entries : *mut *mut *mut FWPM_PROVIDER_CONTEXT2, numentriesreturned : *mut u32) -> u32);

// UNSUPPORTED Rust 134:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmProviderContextEnum3(enginehandle : super::super::Foundation:: HANDLE, enumhandle : super::super::Foundation:: HANDLE, numentriesrequested : u32, entries : *mut *mut *mut FWPM_PROVIDER_CONTEXT3, numentriesreturned : *mut u32) -> u32);

// UNSUPPORTED Rust 136:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmProviderContextGetById0(enginehandle : super::super::Foundation:: HANDLE, id : u64, providercontext : *mut *mut FWPM_PROVIDER_CONTEXT0) -> u32);

// UNSUPPORTED Rust 138:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmProviderContextGetById1(enginehandle : super::super::Foundation:: HANDLE, id : u64, providercontext : *mut *mut FWPM_PROVIDER_CONTEXT1) -> u32);

// UNSUPPORTED Rust 140:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmProviderContextGetById2(enginehandle : super::super::Foundation:: HANDLE, id : u64, providercontext : *mut *mut FWPM_PROVIDER_CONTEXT2) -> u32);

// UNSUPPORTED Rust 142:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmProviderContextGetById3(enginehandle : super::super::Foundation:: HANDLE, id : u64, providercontext : *mut *mut FWPM_PROVIDER_CONTEXT3) -> u32);

// UNSUPPORTED Rust 144:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmProviderContextGetByKey0(enginehandle : super::super::Foundation:: HANDLE, key : *const windows_sys::core::GUID, providercontext : *mut *mut FWPM_PROVIDER_CONTEXT0) -> u32);

// UNSUPPORTED Rust 146:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmProviderContextGetByKey1(enginehandle : super::super::Foundation:: HANDLE, key : *const windows_sys::core::GUID, providercontext : *mut *mut FWPM_PROVIDER_CONTEXT1) -> u32);

// UNSUPPORTED Rust 148:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmProviderContextGetByKey2(enginehandle : super::super::Foundation:: HANDLE, key : *const windows_sys::core::GUID, providercontext : *mut *mut FWPM_PROVIDER_CONTEXT2) -> u32);

// UNSUPPORTED Rust 150:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmProviderContextGetByKey3(enginehandle : super::super::Foundation:: HANDLE, key : *const windows_sys::core::GUID, providercontext : *mut *mut FWPM_PROVIDER_CONTEXT3) -> u32);

// UNSUPPORTED Rust 152:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmProviderContextGetSecurityInfoByKey0(enginehandle : super::super::Foundation:: HANDLE, key : *const windows_sys::core::GUID, securityinfo : u32, sidowner : *mut super::super::Security:: PSID, sidgroup : *mut super::super::Security:: PSID, dacl : *mut *mut super::super::Security:: ACL, sacl : *mut *mut super::super::Security:: ACL, securitydescriptor : *mut super::super::Security:: PSECURITY_DESCRIPTOR) -> u32);

// UNSUPPORTED Rust 154:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmProviderContextSetSecurityInfoByKey0(enginehandle : super::super::Foundation:: HANDLE, key : *const windows_sys::core::GUID, securityinfo : u32, sidowner : *const super::super::Security:: SID, sidgroup : *const super::super::Security:: SID, dacl : *const super::super::Security:: ACL, sacl : *const super::super::Security:: ACL) -> u32);

// UNSUPPORTED Rust 156:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmProviderContextSubscribeChanges0(enginehandle : super::super::Foundation:: HANDLE, subscription : *const FWPM_PROVIDER_CONTEXT_SUBSCRIPTION0, callback : FWPM_PROVIDER_CONTEXT_CHANGE_CALLBACK0, context : *const core::ffi::c_void, changehandle : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 157:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmProviderContextSubscriptionsGet0(enginehandle : super::super::Foundation:: HANDLE, entries : *mut *mut *mut FWPM_PROVIDER_CONTEXT_SUBSCRIPTION0, numentries : *mut u32) -> u32);

// UNSUPPORTED Rust 158:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmProviderContextUnsubscribeChanges0(enginehandle : super::super::Foundation:: HANDLE, changehandle : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 159:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmProviderCreateEnumHandle0(enginehandle : super::super::Foundation:: HANDLE, enumtemplate : *const FWPM_PROVIDER_ENUM_TEMPLATE0, enumhandle : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 160:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmProviderDeleteByKey0(enginehandle : super::super::Foundation:: HANDLE, key : *const windows_sys::core::GUID) -> u32);

// UNSUPPORTED Rust 161:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmProviderDestroyEnumHandle0(enginehandle : super::super::Foundation:: HANDLE, enumhandle : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 162:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmProviderEnum0(enginehandle : super::super::Foundation:: HANDLE, enumhandle : super::super::Foundation:: HANDLE, numentriesrequested : u32, entries : *mut *mut *mut FWPM_PROVIDER0, numentriesreturned : *mut u32) -> u32);

// UNSUPPORTED Rust 163:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmProviderGetByKey0(enginehandle : super::super::Foundation:: HANDLE, key : *const windows_sys::core::GUID, provider : *mut *mut FWPM_PROVIDER0) -> u32);

// UNSUPPORTED Rust 164:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmProviderGetSecurityInfoByKey0(enginehandle : super::super::Foundation:: HANDLE, key : *const windows_sys::core::GUID, securityinfo : u32, sidowner : *mut super::super::Security:: PSID, sidgroup : *mut super::super::Security:: PSID, dacl : *mut *mut super::super::Security:: ACL, sacl : *mut *mut super::super::Security:: ACL, securitydescriptor : *mut super::super::Security:: PSECURITY_DESCRIPTOR) -> u32);

// UNSUPPORTED Rust 166:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmProviderSetSecurityInfoByKey0(enginehandle : super::super::Foundation:: HANDLE, key : *const windows_sys::core::GUID, securityinfo : u32, sidowner : *const super::super::Security:: SID, sidgroup : *const super::super::Security:: SID, dacl : *const super::super::Security:: ACL, sacl : *const super::super::Security:: ACL) -> u32);

// UNSUPPORTED Rust 168:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmProviderSubscribeChanges0(enginehandle : super::super::Foundation:: HANDLE, subscription : *const FWPM_PROVIDER_SUBSCRIPTION0, callback : FWPM_PROVIDER_CHANGE_CALLBACK0, context : *const core::ffi::c_void, changehandle : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 169:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmProviderSubscriptionsGet0(enginehandle : super::super::Foundation:: HANDLE, entries : *mut *mut *mut FWPM_PROVIDER_SUBSCRIPTION0, numentries : *mut u32) -> u32);

// UNSUPPORTED Rust 170:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmProviderUnsubscribeChanges0(enginehandle : super::super::Foundation:: HANDLE, changehandle : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 171:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmSessionCreateEnumHandle0(enginehandle : super::super::Foundation:: HANDLE, enumtemplate : *const FWPM_SESSION_ENUM_TEMPLATE0, enumhandle : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 172:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmSessionDestroyEnumHandle0(enginehandle : super::super::Foundation:: HANDLE, enumhandle : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 173:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmSessionEnum0(enginehandle : super::super::Foundation:: HANDLE, enumhandle : super::super::Foundation:: HANDLE, numentriesrequested : u32, entries : *mut *mut *mut FWPM_SESSION0, numentriesreturned : *mut u32) -> u32);

// UNSUPPORTED Rust 175:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmSubLayerAdd0(enginehandle : super::super::Foundation:: HANDLE, sublayer : *const FWPM_SUBLAYER0, sd : super::super::Security:: PSECURITY_DESCRIPTOR) -> u32);

// UNSUPPORTED Rust 177:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmSubLayerCreateEnumHandle0(enginehandle : super::super::Foundation:: HANDLE, enumtemplate : *const FWPM_SUBLAYER_ENUM_TEMPLATE0, enumhandle : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 178:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmSubLayerDeleteByKey0(enginehandle : super::super::Foundation:: HANDLE, key : *const windows_sys::core::GUID) -> u32);

// UNSUPPORTED Rust 179:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmSubLayerDestroyEnumHandle0(enginehandle : super::super::Foundation:: HANDLE, enumhandle : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 180:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmSubLayerEnum0(enginehandle : super::super::Foundation:: HANDLE, enumhandle : super::super::Foundation:: HANDLE, numentriesrequested : u32, entries : *mut *mut *mut FWPM_SUBLAYER0, numentriesreturned : *mut u32) -> u32);

// UNSUPPORTED Rust 181:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmSubLayerGetByKey0(enginehandle : super::super::Foundation:: HANDLE, key : *const windows_sys::core::GUID, sublayer : *mut *mut FWPM_SUBLAYER0) -> u32);

// UNSUPPORTED Rust 182:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmSubLayerGetSecurityInfoByKey0(enginehandle : super::super::Foundation:: HANDLE, key : *const windows_sys::core::GUID, securityinfo : u32, sidowner : *mut super::super::Security:: PSID, sidgroup : *mut super::super::Security:: PSID, dacl : *mut *mut super::super::Security:: ACL, sacl : *mut *mut super::super::Security:: ACL, securitydescriptor : *mut super::super::Security:: PSECURITY_DESCRIPTOR) -> u32);

// UNSUPPORTED Rust 184:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmSubLayerSetSecurityInfoByKey0(enginehandle : super::super::Foundation:: HANDLE, key : *const windows_sys::core::GUID, securityinfo : u32, sidowner : *const super::super::Security:: SID, sidgroup : *const super::super::Security:: SID, dacl : *const super::super::Security:: ACL, sacl : *const super::super::Security:: ACL) -> u32);

// UNSUPPORTED Rust 186:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmSubLayerSubscribeChanges0(enginehandle : super::super::Foundation:: HANDLE, subscription : *const FWPM_SUBLAYER_SUBSCRIPTION0, callback : FWPM_SUBLAYER_CHANGE_CALLBACK0, context : *const core::ffi::c_void, changehandle : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 187:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmSubLayerSubscriptionsGet0(enginehandle : super::super::Foundation:: HANDLE, entries : *mut *mut *mut FWPM_SUBLAYER_SUBSCRIPTION0, numentries : *mut u32) -> u32);

// UNSUPPORTED Rust 188:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmSubLayerUnsubscribeChanges0(enginehandle : super::super::Foundation:: HANDLE, changehandle : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 189:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmSystemPortsGet0(enginehandle : super::super::Foundation:: HANDLE, sysports : *mut *mut FWPM_SYSTEM_PORTS0) -> u32);

// UNSUPPORTED Rust 190:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmSystemPortsSubscribe0(enginehandle : super::super::Foundation:: HANDLE, reserved : *const core::ffi::c_void, callback : FWPM_SYSTEM_PORTS_CALLBACK0, context : *const core::ffi::c_void, sysportshandle : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 191:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmSystemPortsUnsubscribe0(enginehandle : super::super::Foundation:: HANDLE, sysportshandle : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 192:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmTransactionAbort0(enginehandle : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 193:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmTransactionBegin0(enginehandle : super::super::Foundation:: HANDLE, flags : u32) -> u32);

// UNSUPPORTED Rust 194:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmTransactionCommit0(enginehandle : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 195:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmvSwitchEventSubscribe0(enginehandle : super::super::Foundation:: HANDLE, subscription : *const FWPM_VSWITCH_EVENT_SUBSCRIPTION0, callback : FWPM_VSWITCH_EVENT_CALLBACK0, context : *const core::ffi::c_void, subscriptionhandle : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 196:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmvSwitchEventUnsubscribe0(enginehandle : super::super::Foundation:: HANDLE, subscriptionhandle : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 197:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmvSwitchEventsGetSecurityInfo0(enginehandle : super::super::Foundation:: HANDLE, securityinfo : u32, sidowner : *mut super::super::Security:: PSID, sidgroup : *mut super::super::Security:: PSID, dacl : *mut *mut super::super::Security:: ACL, sacl : *mut *mut super::super::Security:: ACL, securitydescriptor : *mut super::super::Security:: PSECURITY_DESCRIPTOR) -> u32);

// UNSUPPORTED Rust 199:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmvSwitchEventsSetSecurityInfo0(enginehandle : super::super::Foundation:: HANDLE, securityinfo : u32, sidowner : *const super::super::Security:: SID, sidgroup : *const super::super::Security:: SID, dacl : *const super::super::Security:: ACL, sacl : *const super::super::Security:: ACL) -> u32);

// UNSUPPORTED Rust 201:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecDospGetSecurityInfo0(enginehandle : super::super::Foundation:: HANDLE, securityinfo : u32, sidowner : *mut super::super::Security:: PSID, sidgroup : *mut super::super::Security:: PSID, dacl : *mut *mut super::super::Security:: ACL, sacl : *mut *mut super::super::Security:: ACL, securitydescriptor : *mut super::super::Security:: PSECURITY_DESCRIPTOR) -> u32);

// UNSUPPORTED Rust 203:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecDospGetStatistics0(enginehandle : super::super::Foundation:: HANDLE, idpstatistics : *mut IPSEC_DOSP_STATISTICS0) -> u32);

// UNSUPPORTED Rust 204:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecDospSetSecurityInfo0(enginehandle : super::super::Foundation:: HANDLE, securityinfo : u32, sidowner : *const super::super::Security:: SID, sidgroup : *const super::super::Security:: SID, dacl : *const super::super::Security:: ACL, sacl : *const super::super::Security:: ACL) -> u32);

// UNSUPPORTED Rust 206:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecDospStateCreateEnumHandle0(enginehandle : super::super::Foundation:: HANDLE, enumtemplate : *const IPSEC_DOSP_STATE_ENUM_TEMPLATE0, enumhandle : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 207:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecDospStateDestroyEnumHandle0(enginehandle : super::super::Foundation:: HANDLE, enumhandle : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 208:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecDospStateEnum0(enginehandle : super::super::Foundation:: HANDLE, enumhandle : super::super::Foundation:: HANDLE, numentriesrequested : u32, entries : *mut *mut *mut IPSEC_DOSP_STATE0, numentries : *mut u32) -> u32);

// UNSUPPORTED Rust 209:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecGetStatistics0(enginehandle : super::super::Foundation:: HANDLE, ipsecstatistics : *mut IPSEC_STATISTICS0) -> u32);

// UNSUPPORTED Rust 210:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecGetStatistics1(enginehandle : super::super::Foundation:: HANDLE, ipsecstatistics : *mut IPSEC_STATISTICS1) -> u32);

// UNSUPPORTED Rust 211:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecKeyManagerAddAndRegister0(enginehandle : super::super::Foundation:: HANDLE, keymanager : *const IPSEC_KEY_MANAGER0, keymanagercallbacks : *const IPSEC_KEY_MANAGER_CALLBACKS0, keymgmthandle : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 213:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecKeyManagerGetSecurityInfoByKey0(enginehandle : super::super::Foundation:: HANDLE, reserved : *const core::ffi::c_void, securityinfo : u32, sidowner : *mut super::super::Security:: PSID, sidgroup : *mut super::super::Security:: PSID, dacl : *mut *mut super::super::Security:: ACL, sacl : *mut *mut super::super::Security:: ACL, securitydescriptor : *mut super::super::Security:: PSECURITY_DESCRIPTOR) -> u32);

// UNSUPPORTED Rust 215:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecKeyManagerSetSecurityInfoByKey0(enginehandle : super::super::Foundation:: HANDLE, reserved : *const core::ffi::c_void, securityinfo : u32, sidowner : *const super::super::Security:: SID, sidgroup : *const super::super::Security:: SID, dacl : *const super::super::Security:: ACL, sacl : *const super::super::Security:: ACL) -> u32);

// UNSUPPORTED Rust 217:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecKeyManagerUnregisterAndDelete0(enginehandle : super::super::Foundation:: HANDLE, keymgmthandle : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 218:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecKeyManagersGet0(enginehandle : super::super::Foundation:: HANDLE, entries : *mut *mut *mut IPSEC_KEY_MANAGER0, numentries : *mut u32) -> u32);

// UNSUPPORTED Rust 219:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecSaContextAddInbound0(enginehandle : super::super::Foundation:: HANDLE, id : u64, inboundbundle : *const IPSEC_SA_BUNDLE0) -> u32);

// UNSUPPORTED Rust 220:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecSaContextAddInbound1(enginehandle : super::super::Foundation:: HANDLE, id : u64, inboundbundle : *const IPSEC_SA_BUNDLE1) -> u32);

// UNSUPPORTED Rust 221:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecSaContextAddOutbound0(enginehandle : super::super::Foundation:: HANDLE, id : u64, outboundbundle : *const IPSEC_SA_BUNDLE0) -> u32);

// UNSUPPORTED Rust 222:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecSaContextAddOutbound1(enginehandle : super::super::Foundation:: HANDLE, id : u64, outboundbundle : *const IPSEC_SA_BUNDLE1) -> u32);

// UNSUPPORTED Rust 223:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecSaContextCreate0(enginehandle : super::super::Foundation:: HANDLE, outboundtraffic : *const IPSEC_TRAFFIC0, inboundfilterid : *mut u64, id : *mut u64) -> u32);

// UNSUPPORTED Rust 224:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecSaContextCreate1(enginehandle : super::super::Foundation:: HANDLE, outboundtraffic : *const IPSEC_TRAFFIC1, virtualiftunnelinfo : *const IPSEC_VIRTUAL_IF_TUNNEL_INFO0, inboundfilterid : *mut u64, id : *mut u64) -> u32);

// UNSUPPORTED Rust 225:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecSaContextCreateEnumHandle0(enginehandle : super::super::Foundation:: HANDLE, enumtemplate : *const IPSEC_SA_CONTEXT_ENUM_TEMPLATE0, enumhandle : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 227:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecSaContextDeleteById0(enginehandle : super::super::Foundation:: HANDLE, id : u64) -> u32);

// UNSUPPORTED Rust 228:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecSaContextDestroyEnumHandle0(enginehandle : super::super::Foundation:: HANDLE, enumhandle : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 229:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecSaContextEnum0(enginehandle : super::super::Foundation:: HANDLE, enumhandle : super::super::Foundation:: HANDLE, numentriesrequested : u32, entries : *mut *mut *mut IPSEC_SA_CONTEXT0, numentriesreturned : *mut u32) -> u32);

// UNSUPPORTED Rust 231:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecSaContextEnum1(enginehandle : super::super::Foundation:: HANDLE, enumhandle : super::super::Foundation:: HANDLE, numentriesrequested : u32, entries : *mut *mut *mut IPSEC_SA_CONTEXT1, numentriesreturned : *mut u32) -> u32);

// UNSUPPORTED Rust 233:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecSaContextExpire0(enginehandle : super::super::Foundation:: HANDLE, id : u64) -> u32);

// UNSUPPORTED Rust 234:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecSaContextGetById0(enginehandle : super::super::Foundation:: HANDLE, id : u64, sacontext : *mut *mut IPSEC_SA_CONTEXT0) -> u32);

// UNSUPPORTED Rust 236:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecSaContextGetById1(enginehandle : super::super::Foundation:: HANDLE, id : u64, sacontext : *mut *mut IPSEC_SA_CONTEXT1) -> u32);

// UNSUPPORTED Rust 238:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecSaContextGetSpi0(enginehandle : super::super::Foundation:: HANDLE, id : u64, getspi : *const IPSEC_GETSPI0, inboundspi : *mut u32) -> u32);

// UNSUPPORTED Rust 239:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecSaContextGetSpi1(enginehandle : super::super::Foundation:: HANDLE, id : u64, getspi : *const IPSEC_GETSPI1, inboundspi : *mut u32) -> u32);

// UNSUPPORTED Rust 240:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecSaContextSetSpi0(enginehandle : super::super::Foundation:: HANDLE, id : u64, getspi : *const IPSEC_GETSPI1, inboundspi : u32) -> u32);

// UNSUPPORTED Rust 241:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecSaContextSubscribe0(enginehandle : super::super::Foundation:: HANDLE, subscription : *const IPSEC_SA_CONTEXT_SUBSCRIPTION0, callback : IPSEC_SA_CONTEXT_CALLBACK0, context : *const core::ffi::c_void, eventshandle : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 243:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecSaContextSubscriptionsGet0(enginehandle : super::super::Foundation:: HANDLE, entries : *mut *mut *mut IPSEC_SA_CONTEXT_SUBSCRIPTION0, numentries : *mut u32) -> u32);

// UNSUPPORTED Rust 245:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecSaContextUnsubscribe0(enginehandle : super::super::Foundation:: HANDLE, eventshandle : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 246:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecSaContextUpdate0(enginehandle : super::super::Foundation:: HANDLE, flags : u64, newvalues : *const IPSEC_SA_CONTEXT1) -> u32);

// UNSUPPORTED Rust 248:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecSaCreateEnumHandle0(enginehandle : super::super::Foundation:: HANDLE, enumtemplate : *const IPSEC_SA_ENUM_TEMPLATE0, enumhandle : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 249:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecSaDbGetSecurityInfo0(enginehandle : super::super::Foundation:: HANDLE, securityinfo : u32, sidowner : *mut super::super::Security:: PSID, sidgroup : *mut super::super::Security:: PSID, dacl : *mut *mut super::super::Security:: ACL, sacl : *mut *mut super::super::Security:: ACL, securitydescriptor : *mut super::super::Security:: PSECURITY_DESCRIPTOR) -> u32);

// UNSUPPORTED Rust 251:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecSaDbSetSecurityInfo0(enginehandle : super::super::Foundation:: HANDLE, securityinfo : u32, sidowner : *const super::super::Security:: SID, sidgroup : *const super::super::Security:: SID, dacl : *const super::super::Security:: ACL, sacl : *const super::super::Security:: ACL) -> u32);

// UNSUPPORTED Rust 253:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecSaDestroyEnumHandle0(enginehandle : super::super::Foundation:: HANDLE, enumhandle : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 254:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecSaEnum0(enginehandle : super::super::Foundation:: HANDLE, enumhandle : super::super::Foundation:: HANDLE, numentriesrequested : u32, entries : *mut *mut *mut IPSEC_SA_DETAILS0, numentriesreturned : *mut u32) -> u32);

// UNSUPPORTED Rust 256:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecSaEnum1(enginehandle : super::super::Foundation:: HANDLE, enumhandle : super::super::Foundation:: HANDLE, numentriesrequested : u32, entries : *mut *mut *mut IPSEC_SA_DETAILS1, numentriesreturned : *mut u32) -> u32);

// UNSUPPORTED Rust 258:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn IkeextGetStatistics0(enginehandle : super::super::Foundation:: HANDLE, ikeextstatistics : *mut IKEEXT_STATISTICS0) -> u32);

// UNSUPPORTED Rust 259:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn IkeextGetStatistics1(enginehandle : super::super::Foundation:: HANDLE, ikeextstatistics : *mut IKEEXT_STATISTICS1) -> u32);

// UNSUPPORTED Rust 260:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn IkeextSaCreateEnumHandle0(enginehandle : super::super::Foundation:: HANDLE, enumtemplate : *const IKEEXT_SA_ENUM_TEMPLATE0, enumhandle : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 262:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn IkeextSaDbGetSecurityInfo0(enginehandle : super::super::Foundation:: HANDLE, securityinfo : u32, sidowner : *mut super::super::Security:: PSID, sidgroup : *mut super::super::Security:: PSID, dacl : *mut *mut super::super::Security:: ACL, sacl : *mut *mut super::super::Security:: ACL, securitydescriptor : *mut super::super::Security:: PSECURITY_DESCRIPTOR) -> u32);

// UNSUPPORTED Rust 264:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn IkeextSaDbSetSecurityInfo0(enginehandle : super::super::Foundation:: HANDLE, securityinfo : u32, sidowner : *const super::super::Security:: SID, sidgroup : *const super::super::Security:: SID, dacl : *const super::super::Security:: ACL, sacl : *const super::super::Security:: ACL) -> u32);

// UNSUPPORTED Rust 266:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn IkeextSaDeleteById0(enginehandle : super::super::Foundation:: HANDLE, id : u64) -> u32);

// UNSUPPORTED Rust 267:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn IkeextSaDestroyEnumHandle0(enginehandle : super::super::Foundation:: HANDLE, enumhandle : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 268:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn IkeextSaEnum0(enginehandle : super::super::Foundation:: HANDLE, enumhandle : super::super::Foundation:: HANDLE, numentriesrequested : u32, entries : *mut *mut *mut IKEEXT_SA_DETAILS0, numentriesreturned : *mut u32) -> u32);

// UNSUPPORTED Rust 269:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn IkeextSaEnum1(enginehandle : super::super::Foundation:: HANDLE, enumhandle : super::super::Foundation:: HANDLE, numentriesrequested : u32, entries : *mut *mut *mut IKEEXT_SA_DETAILS1, numentriesreturned : *mut u32) -> u32);

// UNSUPPORTED Rust 270:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn IkeextSaEnum2(enginehandle : super::super::Foundation:: HANDLE, enumhandle : super::super::Foundation:: HANDLE, numentriesrequested : u32, entries : *mut *mut *mut IKEEXT_SA_DETAILS2, numentriesreturned : *mut u32) -> u32);

// UNSUPPORTED Rust 271:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn IkeextSaGetById0(enginehandle : super::super::Foundation:: HANDLE, id : u64, sa : *mut *mut IKEEXT_SA_DETAILS0) -> u32);

// UNSUPPORTED Rust 272:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn IkeextSaGetById1(enginehandle : super::super::Foundation:: HANDLE, id : u64, salookupcontext : *const windows_sys::core::GUID, sa : *mut *mut IKEEXT_SA_DETAILS1) -> u32);

// UNSUPPORTED Rust 273:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn IkeextSaGetById2(enginehandle : super::super::Foundation:: HANDLE, id : u64, salookupcontext : *const windows_sys::core::GUID, sa : *mut *mut IKEEXT_SA_DETAILS2) -> u32);

public typealias `DL_ADDRESS_TYPE` = Int;
public const val `DlBroadcast`: `DL_ADDRESS_TYPE` = 2;
public const val `DlMulticast`: `DL_ADDRESS_TYPE` = 1;
public const val `DlUnicast`: `DL_ADDRESS_TYPE` = 0;
// UNSUPPORTED Rust 278:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FWPM_ACTION0 {
//     pub r#type: FWP_ACTION_TYPE,
//     pub Anonymous: FWPM_ACTION0_0,
// }

// UNSUPPORTED Rust 284:1: declaration Impl has no candidate rule
// impl Default for FWPM_ACTION0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 289:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union FWPM_ACTION0_0 {
//     pub filterType: windows_sys::core::GUID,
//     pub calloutKey: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 295:1: declaration Impl has no candidate rule
// impl Default for FWPM_ACTION0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FWPM_ACTRL_ADD`: UInt = 1u;
public const val `FWPM_ACTRL_ADD_LINK`: UInt = 2u;
public const val `FWPM_ACTRL_BEGIN_READ_TXN`: UInt = 4u;
public const val `FWPM_ACTRL_BEGIN_WRITE_TXN`: UInt = 8u;
public const val `FWPM_ACTRL_CLASSIFY`: UInt = 16u;
public const val `FWPM_ACTRL_ENUM`: UInt = 32u;
public const val `FWPM_ACTRL_OPEN`: UInt = 64u;
public const val `FWPM_ACTRL_READ`: UInt = 128u;
public const val `FWPM_ACTRL_READ_STATS`: UInt = 256u;
public const val `FWPM_ACTRL_SUBSCRIBE`: UInt = 512u;
public const val `FWPM_ACTRL_WRITE`: UInt = 1024u;
public const val `FWPM_APPC_NETWORK_CAPABILITY_INTERNET_CLIENT`: `FWPM_APPC_NETWORK_CAPABILITY_TYPE` = 0;
public const val `FWPM_APPC_NETWORK_CAPABILITY_INTERNET_CLIENT_SERVER`: `FWPM_APPC_NETWORK_CAPABILITY_TYPE` = 1;
public const val `FWPM_APPC_NETWORK_CAPABILITY_INTERNET_PRIVATE_NETWORK`: `FWPM_APPC_NETWORK_CAPABILITY_TYPE` = 2;
public typealias `FWPM_APPC_NETWORK_CAPABILITY_TYPE` = Int;
public const val `FWPM_AUTO_WEIGHT_BITS`: UInt = 60u;
// UNSUPPORTED Rust 316:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FWPM_CALLOUT0 {
//     pub calloutKey: windows_sys::core::GUID,
//     pub displayData: FWPM_DISPLAY_DATA0,
//     pub flags: u32,
//     pub providerKey: *mut windows_sys::core::GUID,
//     pub providerData: FWP_BYTE_BLOB,
//     pub applicableLayer: windows_sys::core::GUID,
//     pub calloutId: u32,
// }

// UNSUPPORTED Rust 327:1: declaration Impl has no candidate rule
// impl Default for FWPM_CALLOUT0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 332:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CALLOUT_BUILT_IN_RESERVED_1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x779719a4_e695_47b6_a199_7999fec9163b);

// UNSUPPORTED Rust 333:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CALLOUT_BUILT_IN_RESERVED_2: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xef9661b6_7c5e_48fd_a130_96678ceacc41);

// UNSUPPORTED Rust 334:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CALLOUT_BUILT_IN_RESERVED_3: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x18729c7a_2f62_4be0_966f_974b21b86df1);

// UNSUPPORTED Rust 335:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CALLOUT_BUILT_IN_RESERVED_4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6c3fb801_daff_40e9_91e6_f7ff7e52f7d9);

// UNSUPPORTED Rust 336:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FWPM_CALLOUT_CHANGE0 {
//     pub changeType: FWPM_CHANGE_TYPE,
//     pub calloutKey: windows_sys::core::GUID,
//     pub calloutId: u32,
// }

// UNSUPPORTED Rust 343:1: generic scalar type unsupported
// pub type FWPM_CALLOUT_CHANGE_CALLBACK0 = Option<unsafe extern "system" fn(context: *mut core::ffi::c_void, change: *const FWPM_CALLOUT_CHANGE0)>;

// UNSUPPORTED Rust 344:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CALLOUT_EDGE_TRAVERSAL_ALE_LISTEN_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x33486ab5_6d5e_4e65_a00b_a7afed0ba9a1);

// UNSUPPORTED Rust 345:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CALLOUT_EDGE_TRAVERSAL_ALE_RESOURCE_ASSIGNMENT_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x079b1010_f1c5_4fcd_ae05_da41107abd0b);

// UNSUPPORTED Rust 346:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FWPM_CALLOUT_ENUM_TEMPLATE0 {
//     pub providerKey: *mut windows_sys::core::GUID,
//     pub layerKey: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 352:1: declaration Impl has no candidate rule
// impl Default for FWPM_CALLOUT_ENUM_TEMPLATE0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FWPM_CALLOUT_FLAG_PERSISTENT`: UInt = 65536u;
public const val `FWPM_CALLOUT_FLAG_REGISTERED`: UInt = 262144u;
public const val `FWPM_CALLOUT_FLAG_USES_PROVIDER_CONTEXT`: UInt = 131072u;
// UNSUPPORTED Rust 360:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CALLOUT_HTTP_TEMPLATE_SSL_HANDSHAKE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb3423249_8d09_4858_9210_95c7fda8e30f);

// UNSUPPORTED Rust 361:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CALLOUT_IPSEC_ALE_CONNECT_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6ac141fc_f75d_4203_b9c8_48e6149c2712);

// UNSUPPORTED Rust 362:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CALLOUT_IPSEC_ALE_CONNECT_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4c0dda05_e31f_4666_90b0_b3dfad34129a);

// UNSUPPORTED Rust 363:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CALLOUT_IPSEC_DOSP_FORWARD_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2fcb56ec_cd37_4b4f_b108_62c2b1850a0c);

// UNSUPPORTED Rust 364:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CALLOUT_IPSEC_DOSP_FORWARD_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6d08a342_db9e_4fbe_9ed2_57374ce89f79);

// UNSUPPORTED Rust 365:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CALLOUT_IPSEC_FORWARD_INBOUND_TUNNEL_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x28829633_c4f0_4e66_873f_844db2a899c7);

// UNSUPPORTED Rust 366:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CALLOUT_IPSEC_FORWARD_INBOUND_TUNNEL_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xaf50bec2_c686_429a_884d_b74443e7b0b4);

// UNSUPPORTED Rust 367:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CALLOUT_IPSEC_FORWARD_OUTBOUND_TUNNEL_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfb532136_15cb_440b_937c_1717ca320c40);

// UNSUPPORTED Rust 368:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CALLOUT_IPSEC_FORWARD_OUTBOUND_TUNNEL_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdae640cc_e021_4bee_9eb6_a48b275c8c1d);

// UNSUPPORTED Rust 369:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CALLOUT_IPSEC_INBOUND_INITIATE_SECURE_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7dff309b_ba7d_4aba_91aa_ae5c6640c944);

// UNSUPPORTED Rust 370:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CALLOUT_IPSEC_INBOUND_INITIATE_SECURE_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa9a0d6d9_c58c_474e_8aeb_3cfe99d6d53d);

// UNSUPPORTED Rust 371:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CALLOUT_IPSEC_INBOUND_TRANSPORT_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5132900d_5e84_4b5f_80e4_01741e81ff10);

// UNSUPPORTED Rust 372:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CALLOUT_IPSEC_INBOUND_TRANSPORT_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x49d3ac92_2a6c_4dcf_955f_1c3be009dd99);

// UNSUPPORTED Rust 373:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CALLOUT_IPSEC_INBOUND_TUNNEL_ALE_ACCEPT_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3df6e7de_fd20_48f2_9f26_f854444cba79);

// UNSUPPORTED Rust 374:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CALLOUT_IPSEC_INBOUND_TUNNEL_ALE_ACCEPT_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa1e392d3_72ac_47bb_87a7_0122c69434ab);

// UNSUPPORTED Rust 375:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CALLOUT_IPSEC_INBOUND_TUNNEL_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x191a8a46_0bf8_46cf_b045_4b45dfa6a324);

// UNSUPPORTED Rust 376:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CALLOUT_IPSEC_INBOUND_TUNNEL_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x80c342e3_1e53_4d6f_9b44_03df5aeee154);

// UNSUPPORTED Rust 377:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CALLOUT_IPSEC_OUTBOUND_TRANSPORT_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4b46bf0a_4523_4e57_aa38_a87987c910d9);

// UNSUPPORTED Rust 378:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CALLOUT_IPSEC_OUTBOUND_TRANSPORT_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x38d87722_ad83_4f11_a91f_df0fb077225b);

// UNSUPPORTED Rust 379:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CALLOUT_IPSEC_OUTBOUND_TUNNEL_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x70a4196c_835b_4fb0_98e8_075f4d977d46);

// UNSUPPORTED Rust 380:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CALLOUT_IPSEC_OUTBOUND_TUNNEL_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf1835363_a6a5_4e62_b180_23db789d8da6);

// UNSUPPORTED Rust 381:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CALLOUT_OUTBOUND_NETWORK_CONNECTION_POLICY_LAYER_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x103090d4_8e28_4fd6_9894_d1d67d6b10c9);

// UNSUPPORTED Rust 382:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CALLOUT_OUTBOUND_NETWORK_CONNECTION_POLICY_LAYER_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4ed3446d_8dc7_459b_b09f_c1cb7a8f8689);

// UNSUPPORTED Rust 383:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CALLOUT_POLICY_SILENT_MODE_AUTH_CONNECT_LAYER_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5fbfc31d_a51c_44dc_acb6_0624a030a700);

// UNSUPPORTED Rust 384:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CALLOUT_POLICY_SILENT_MODE_AUTH_CONNECT_LAYER_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5fbfc31d_a51c_44dc_acb6_0624a030a701);

// UNSUPPORTED Rust 385:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CALLOUT_POLICY_SILENT_MODE_AUTH_RECV_ACCEPT_LAYER_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5fbfc31d_a51c_44dc_acb6_0624a030a702);

// UNSUPPORTED Rust 386:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CALLOUT_POLICY_SILENT_MODE_AUTH_RECV_ACCEPT_LAYER_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5fbfc31d_a51c_44dc_acb6_0624a030a703);

// UNSUPPORTED Rust 387:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CALLOUT_RESERVED_AUTH_CONNECT_LAYER_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x288b524d_0566_4e19_b612_8f441a2e5949);

// UNSUPPORTED Rust 388:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CALLOUT_RESERVED_AUTH_CONNECT_LAYER_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00b84b92_2b5e_4b71_ab0e_aaca43e387e6);

// UNSUPPORTED Rust 389:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CALLOUT_SET_OPTIONS_AUTH_CONNECT_LAYER_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbc582280_1677_41e9_94ab_c2fcb15c2eeb);

// UNSUPPORTED Rust 390:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CALLOUT_SET_OPTIONS_AUTH_CONNECT_LAYER_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x98e5373c_b884_490f_b65f_2f6a4a575195);

// UNSUPPORTED Rust 391:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CALLOUT_SET_OPTIONS_AUTH_RECV_ACCEPT_LAYER_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2d55f008_0c01_4f92_b26e_a08a94569b8d);

// UNSUPPORTED Rust 392:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CALLOUT_SET_OPTIONS_AUTH_RECV_ACCEPT_LAYER_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x63018537_f281_4dc4_83d3_8dec18b7ade2);

// UNSUPPORTED Rust 393:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FWPM_CALLOUT_SUBSCRIPTION0 {
//     pub enumTemplate: *mut FWPM_CALLOUT_ENUM_TEMPLATE0,
//     pub flags: u32,
//     pub sessionKey: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 400:1: declaration Impl has no candidate rule
// impl Default for FWPM_CALLOUT_SUBSCRIPTION0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 405:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CALLOUT_TCP_CHIMNEY_ACCEPT_LAYER_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe183ecb2_3a7f_4b54_8ad9_76050ed880ca);

// UNSUPPORTED Rust 406:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CALLOUT_TCP_CHIMNEY_ACCEPT_LAYER_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0378cf41_bf98_4603_81f2_7f12586079f6);

// UNSUPPORTED Rust 407:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CALLOUT_TCP_CHIMNEY_CONNECT_LAYER_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf3e10ab3_2c25_4279_ac36_c30fc181bec4);

// UNSUPPORTED Rust 408:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CALLOUT_TCP_CHIMNEY_CONNECT_LAYER_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x39e22085_a341_42fc_a279_aec94e689c56);

// UNSUPPORTED Rust 409:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CALLOUT_TCP_TEMPLATES_ACCEPT_LAYER_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2f23f5d0_40c4_4c41_a254_46d8dba8957c);

// UNSUPPORTED Rust 410:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CALLOUT_TCP_TEMPLATES_ACCEPT_LAYER_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb25152f0_991c_4f53_bbe7_d24b45fe632c);

// UNSUPPORTED Rust 411:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CALLOUT_TCP_TEMPLATES_CONNECT_LAYER_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x215a0b39_4b7e_4eda_8ce4_179679df6224);

// UNSUPPORTED Rust 412:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CALLOUT_TCP_TEMPLATES_CONNECT_LAYER_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x838b37a1_5c12_4d34_8b38_078728b2d25c);

// UNSUPPORTED Rust 413:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CALLOUT_TEREDO_ALE_LISTEN_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x81a434e7_f60c_4378_bab8_c625a30f0197);

// UNSUPPORTED Rust 414:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CALLOUT_TEREDO_ALE_RESOURCE_ASSIGNMENT_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x31b95392_066e_42a2_b7db_92f8acdd56f9);

// UNSUPPORTED Rust 415:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CALLOUT_WFP_TRANSPORT_LAYER_V4_SILENT_DROP: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xeda08606_2494_4d78_89bc_67837c03b969);

// UNSUPPORTED Rust 416:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CALLOUT_WFP_TRANSPORT_LAYER_V6_SILENT_DROP: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8693cc74_a075_4156_b476_9286eece814e);

public const val `FWPM_CHANGE_ADD`: `FWPM_CHANGE_TYPE` = 1;
public const val `FWPM_CHANGE_DELETE`: `FWPM_CHANGE_TYPE` = 2;
public typealias `FWPM_CHANGE_TYPE` = Int;
public const val `FWPM_CHANGE_TYPE_MAX`: `FWPM_CHANGE_TYPE` = 3;
// UNSUPPORTED Rust 421:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct FWPM_CLASSIFY_OPTION0 {
//     pub r#type: FWP_CLASSIFY_OPTION_TYPE,
//     pub value: FWP_VALUE0,
// }

// UNSUPPORTED Rust 428:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_CLASSIFY_OPTION0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 434:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct FWPM_CLASSIFY_OPTIONS0 {
//     pub numOptions: u32,
//     pub options: *mut FWPM_CLASSIFY_OPTION0,
// }

// UNSUPPORTED Rust 441:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_CLASSIFY_OPTIONS0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FWPM_CLASSIFY_OPTIONS_CONTEXT`: `FWPM_PROVIDER_CONTEXT_TYPE` = 7;
// UNSUPPORTED Rust 448:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_ALE_APP_ID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd78e1e87_8644_4ea5_9437_d809ecefc971);

// UNSUPPORTED Rust 449:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_ALE_EFFECTIVE_NAME: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb1277b9a_b781_40fc_9671_e5f1b989f34e);

// UNSUPPORTED Rust 450:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_ALE_NAP_CONTEXT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x46275a9d_c03f_4d77_b784_1c57f4d02753);

// UNSUPPORTED Rust 451:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_ALE_ORIGINAL_APP_ID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0e6cd086_e1fb_4212_842f_8a9f993fb3f6);

// UNSUPPORTED Rust 452:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_ALE_PACKAGE_ID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x71bc78fa_f17c_4997_a602_6abb261f351c);

// UNSUPPORTED Rust 453:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_ALE_PROMISCUOUS_MODE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1c974776_7182_46e9_afd3_b02910e30334);

// UNSUPPORTED Rust 454:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_ALE_REAUTH_REASON: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb482d227_1979_4a98_8044_18bbe6237542);

// UNSUPPORTED Rust 455:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_ALE_REMOTE_MACHINE_ID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1aa47f51_7f93_4508_a271_81abb00c9cab);

// UNSUPPORTED Rust 456:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_ALE_REMOTE_USER_ID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf63073b7_0189_4ab0_95a4_6123cbfab862);

// UNSUPPORTED Rust 457:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_ALE_SECURITY_ATTRIBUTE_FQBN_VALUE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x37a57699_5883_4963_92b8_3e704688b0ad);

// UNSUPPORTED Rust 458:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_ALE_SIO_FIREWALL_SYSTEM_PORT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb9f4e088_cb98_4efb_a2c7_ad07332643db);

// UNSUPPORTED Rust 459:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_ALE_USER_ID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xaf043a0a_b34d_4f86_979c_c90371af6e66);

// UNSUPPORTED Rust 460:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_ARRIVAL_INTERFACE_INDEX: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcc088db3_1792_4a71_b0f9_037d21cd828b);

// UNSUPPORTED Rust 461:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_ARRIVAL_INTERFACE_PROFILE_ID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcdfe6aab_c083_4142_8679_c08f95329c61);

// UNSUPPORTED Rust 462:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_ARRIVAL_INTERFACE_TYPE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x89f990de_e798_4e6d_ab76_7c9558292e6f);

// UNSUPPORTED Rust 463:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_ARRIVAL_TUNNEL_TYPE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x511166dc_7a8c_4aa7_b533_95ab59fb0340);

// UNSUPPORTED Rust 464:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_AUTHENTICATION_TYPE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xeb458cd5_da7b_4ef9_8d43_7b0a840332f2);

// UNSUPPORTED Rust 465:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_CLIENT_CERT_KEY_LENGTH: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa3ec00c7_05f4_4df7_91f2_5f60d91ff443);

// UNSUPPORTED Rust 466:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_CLIENT_CERT_OID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc491ad5e_f882_4283_b916_436b103ff4ad);

// UNSUPPORTED Rust 467:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_CLIENT_TOKEN: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc228fc1e_403a_4478_be05_c9baa4c05ace);

// UNSUPPORTED Rust 468:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_COMPARTMENT_ID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x35a791ab_04ac_4ff2_a6bb_da6cfac71806);

// UNSUPPORTED Rust 469:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_CURRENT_PROFILE_ID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xab3033c9_c0e3_4759_937d_5758c65d4ae3);

// UNSUPPORTED Rust 470:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_DCOM_APP_ID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xff2e7b4d_3112_4770_b636_4d24ae3a6af2);

// UNSUPPORTED Rust 471:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_DESTINATION_INTERFACE_INDEX: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x35cf6522_4139_45ee_a0d5_67b80949d879);

// UNSUPPORTED Rust 472:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_DESTINATION_SUB_INTERFACE_INDEX: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2b7d4399_d4c7_4738_a2f5_e994b43da388);

// UNSUPPORTED Rust 473:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_DIRECTION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8784c146_ca97_44d6_9fd1_19fb1840cbf7);

// UNSUPPORTED Rust 474:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_EMBEDDED_LOCAL_ADDRESS_TYPE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4672a468_8a0a_4202_abb4_849e92e66809);

// UNSUPPORTED Rust 475:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_EMBEDDED_LOCAL_PORT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbfca394d_acdb_484e_b8e6_2aff79757345);

// UNSUPPORTED Rust 476:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_EMBEDDED_PROTOCOL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x07784107_a29e_4c7b_9ec7_29c44afafdbc);

// UNSUPPORTED Rust 477:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_EMBEDDED_REMOTE_ADDRESS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x77ee4b39_3273_4671_b63b_ab6feb66eeb6);

// UNSUPPORTED Rust 478:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_EMBEDDED_REMOTE_PORT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcae4d6a1_2968_40ed_a4ce_547160dda88d);

// UNSUPPORTED Rust 479:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_ETHER_TYPE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfd08948d_a219_4d52_bb98_1a5540ee7b4e);

// UNSUPPORTED Rust 480:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_FLAGS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x632ce23b_5167_435c_86d7_e903684aa80c);

// UNSUPPORTED Rust 481:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_IMAGE_NAME: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd024de4d_deaa_4317_9c85_e40ef6e140c3);

// UNSUPPORTED Rust 482:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_INTERFACE_INDEX: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x667fd755_d695_434a_8af5_d3835a1259bc);

// UNSUPPORTED Rust 483:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_INTERFACE_MAC_ADDRESS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf6e63dce_1f4b_4c6b_b6ef_1165e71f8ee7);

// UNSUPPORTED Rust 484:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_INTERFACE_QUARANTINE_EPOCH: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcce68d5e_053b_43a8_9a6f_33384c28e4f6);

// UNSUPPORTED Rust 485:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_INTERFACE_TYPE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdaf8cd14_e09e_4c93_a5ae_c5c13b73ffca);

// UNSUPPORTED Rust 486:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_IPSEC_POLICY_KEY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xad37dee3_722f_45cc_a4e3_068048124452);

// UNSUPPORTED Rust 487:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_IPSEC_SECURITY_REALM_ID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x37a57700_5884_4964_92b8_3e704688b0ad);

// UNSUPPORTED Rust 488:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_IP_ARRIVAL_INTERFACE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x618a9b6d_386b_4136_ad6e_b51587cfb1cd);

// UNSUPPORTED Rust 489:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_IP_DESTINATION_ADDRESS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2d79133b_b390_45c6_8699_acaceaafed33);

// UNSUPPORTED Rust 490:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_IP_DESTINATION_ADDRESS_TYPE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1ec1b7c9_4eea_4f5e_b9ef_76beaaaf17ee);

// UNSUPPORTED Rust 491:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_IP_DESTINATION_PORT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xce6def45_60fb_4a7b_a304_af30a117000e);

// UNSUPPORTED Rust 492:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_IP_FORWARD_INTERFACE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1076b8a5_6323_4c5e_9810_e8d3fc9e6136);

// UNSUPPORTED Rust 493:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_IP_LOCAL_ADDRESS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd9ee00de_c1ef_4617_bfe3_ffd8f5a08957);

// UNSUPPORTED Rust 494:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_IP_LOCAL_ADDRESS_TYPE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6ec7f6c4_376b_45d7_9e9c_d337cedcd237);

// UNSUPPORTED Rust 495:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_IP_LOCAL_ADDRESS_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x03a629cb_6e52_49f8_9c41_5709633c09cf);

// UNSUPPORTED Rust 496:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_IP_LOCAL_ADDRESS_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2381be84_7524_45b3_a05b_1e637d9c7a6a);

// UNSUPPORTED Rust 497:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_IP_LOCAL_INTERFACE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4cd62a49_59c3_4969_b7f3_bda5d32890a4);

// UNSUPPORTED Rust 498:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_IP_LOCAL_PORT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0c1ba1af_5765_453f_af22_a8f791ac775b);

// UNSUPPORTED Rust 499:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_IP_NEXTHOP_ADDRESS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xeabe448a_a711_4d64_85b7_3f76b65299c7);

// UNSUPPORTED Rust 500:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_IP_NEXTHOP_INTERFACE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x93ae8f5b_7f6f_4719_98c8_14e97429ef04);

// UNSUPPORTED Rust 501:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_IP_PHYSICAL_ARRIVAL_INTERFACE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xda50d5c8_fa0d_4c89_b032_6e62136d1e96);

// UNSUPPORTED Rust 502:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_IP_PHYSICAL_NEXTHOP_INTERFACE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf09bd5ce_5150_48be_b098_c25152fb1f92);

// UNSUPPORTED Rust 503:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_IP_PROTOCOL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3971ef2b_623e_4f9a_8cb1_6e79b806b9a7);

// UNSUPPORTED Rust 504:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_IP_REMOTE_ADDRESS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb235ae9a_1d64_49b8_a44c_5ff3d9095045);

// UNSUPPORTED Rust 505:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_IP_REMOTE_ADDRESS_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1febb610_3bcc_45e1_bc36_2e067e2cb186);

// UNSUPPORTED Rust 506:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_IP_REMOTE_ADDRESS_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x246e1d8c_8bee_4018_9b98_31d4582f3361);

// UNSUPPORTED Rust 507:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_IP_REMOTE_PORT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc35a604d_d22b_4e1a_91b4_68f674ee674b);

// UNSUPPORTED Rust 508:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_IP_SOURCE_ADDRESS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xae96897e_2e94_4bc9_b313_b27ee80e574d);

// UNSUPPORTED Rust 509:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_IP_SOURCE_PORT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa6afef91_3df4_4730_a214_f5426aebf821);

// UNSUPPORTED Rust 510:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_KM_AUTH_NAP_CONTEXT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x35d0ea0e_15ca_492b_900e_97fd46352cce);

// UNSUPPORTED Rust 511:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_KM_MODE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfeef4582_ef8f_4f7b_858b_9077d122de47);

// UNSUPPORTED Rust 512:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_KM_TYPE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xff0f5f49_0ceb_481b_8638_1479791f3f2c);

// UNSUPPORTED Rust 513:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_L2_FLAGS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7bc43cbf_37ba_45f1_b74a_82ff518eeb10);

// UNSUPPORTED Rust 514:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_LOCAL_INTERFACE_PROFILE_ID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4ebf7562_9f18_4d06_9941_a7a625744d71);

// UNSUPPORTED Rust 515:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_MAC_DESTINATION_ADDRESS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x04ea2a93_858c_4027_b613_b43180c7859e);

// UNSUPPORTED Rust 516:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_MAC_DESTINATION_ADDRESS_TYPE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xae052932_ef42_4e99_b129_f3b3139e34f7);

// UNSUPPORTED Rust 517:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_MAC_LOCAL_ADDRESS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd999e981_7948_4c83_b742_c84e3b678f8f);

// UNSUPPORTED Rust 518:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_MAC_LOCAL_ADDRESS_TYPE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcc31355c_3073_4ffb_a14f_79415cb1ead1);

// UNSUPPORTED Rust 519:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_MAC_REMOTE_ADDRESS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x408f2ed4_3a70_4b4d_92a6_415ac20e2f12);

// UNSUPPORTED Rust 520:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_MAC_REMOTE_ADDRESS_TYPE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x027fedb4_f1c1_4030_b564_ee777fd867ea);

// UNSUPPORTED Rust 521:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_MAC_SOURCE_ADDRESS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7b795451_f1f6_4d05_b7cb_21779d802336);

// UNSUPPORTED Rust 522:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_MAC_SOURCE_ADDRESS_TYPE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5c1b72e4_299e_4437_a298_bc3f014b3dc2);

// UNSUPPORTED Rust 523:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_NDIS_MEDIA_TYPE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcb31cef1_791d_473b_89d1_61c5984304a0);

// UNSUPPORTED Rust 524:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_NDIS_PHYSICAL_MEDIA_TYPE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x34c79823_c229_44f2_b83c_74020882ae77);

// UNSUPPORTED Rust 525:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_NDIS_PORT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdb7bb42b_2dac_4cd4_a59a_e0bdce1e6834);

// UNSUPPORTED Rust 526:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_NET_EVENT_TYPE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x206e9996_490e_40cf_b831_b38641eb6fcb);

// UNSUPPORTED Rust 527:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_NEXTHOP_INTERFACE_INDEX: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x138e6888_7ab8_4d65_9ee8_0591bcf6a494);

// UNSUPPORTED Rust 528:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_NEXTHOP_INTERFACE_PROFILE_ID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd7ff9a56_cdaa_472b_84db_d23963c1d1bf);

// UNSUPPORTED Rust 529:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_NEXTHOP_INTERFACE_TYPE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x97537c6c_d9a3_4767_a381_e942675cd920);

// UNSUPPORTED Rust 530:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_NEXTHOP_SUB_INTERFACE_INDEX: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xef8a6122_0577_45a7_9aaf_825fbeb4fb95);

// UNSUPPORTED Rust 531:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_NEXTHOP_TUNNEL_TYPE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x72b1a111_987b_4720_99dd_c7c576fa2d4c);

// UNSUPPORTED Rust 532:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_ORIGINAL_ICMP_TYPE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x076dfdbe_c56c_4f72_ae8a_2cfe7e5c8286);

// UNSUPPORTED Rust 533:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_ORIGINAL_PROFILE_ID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x46ea1551_2255_492b_8019_aabeee349f40);

// UNSUPPORTED Rust 534:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_PEER_NAME: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9b539082_eb90_4186_a6cc_de5b63235016);

// UNSUPPORTED Rust 535:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_PIPE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1bd0741d_e3df_4e24_8634_762046eef6eb);

// UNSUPPORTED Rust 536:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_PROCESS_WITH_RPC_IF_UUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe31180a8_bbbd_4d14_a65e_7157b06233bb);

// UNSUPPORTED Rust 537:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_QM_MODE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf64fc6d1_f9cb_43d2_8a5f_e13bc894f265);

// UNSUPPORTED Rust 538:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_REAUTHORIZE_REASON: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x11205e8c_11ae_457a_8a44_477026dd764a);

// UNSUPPORTED Rust 539:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_REMOTE_ID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf68166fd_0682_4c89_b8f5_86436c7ef9b7);

// UNSUPPORTED Rust 540:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_REMOTE_USER_TOKEN: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9bf0ee66_06c9_41b9_84da_288cb43af51f);

// UNSUPPORTED Rust 541:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_RESERVED0: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x678f4deb_45af_4882_93fe_19d4729d9834);

// UNSUPPORTED Rust 542:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_RESERVED1: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd818f827_5c69_48eb_bf80_d86b17755f97);

// UNSUPPORTED Rust 543:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_RESERVED10: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb979e282_d621_4c8c_b184_b105a61c36ce);

// UNSUPPORTED Rust 544:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_RESERVED11: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2d62ee4d_023d_411f_9582_43acbb795975);

// UNSUPPORTED Rust 545:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_RESERVED12: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa3677c32_7e35_4ddc_93da_e8c33fc923c7);

// UNSUPPORTED Rust 546:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_RESERVED13: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x335a3e90_84aa_42f5_9e6f_59309536a44c);

// UNSUPPORTED Rust 547:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_RESERVED14: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x30e44da2_2f1a_4116_a559_f907de83604a);

// UNSUPPORTED Rust 548:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_RESERVED15: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbab8340f_afe0_43d1_80d8_5ca456962de3);

// UNSUPPORTED Rust 549:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_RESERVED2: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x53d4123d_e15b_4e84_b7a8_dce16f7b62d9);

// UNSUPPORTED Rust 550:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_RESERVED3: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7f6e8ca3_6606_4932_97c7_e1f20710af3b);

// UNSUPPORTED Rust 551:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_RESERVED4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5f58e642_b937_495e_a94b_f6b051a49250);

// UNSUPPORTED Rust 552:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_RESERVED5: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9ba8f6cd_f77c_43e6_8847_11939dc5db5a);

// UNSUPPORTED Rust 553:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_RESERVED6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf13d84bd_59d5_44c4_8817_5ecdae1805bd);

// UNSUPPORTED Rust 554:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_RESERVED7: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x65a0f930_45dd_4983_aa33_efc7b611af08);

// UNSUPPORTED Rust 555:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_RESERVED8: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4f424974_0c12_4816_9b47_9a547db39a32);

// UNSUPPORTED Rust 556:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_RESERVED9: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xce78e10f_13ff_4c70_8643_36ad1879afa3);

// UNSUPPORTED Rust 557:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_RPC_AUTH_LEVEL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe5a0aed5_59ac_46ea_be05_a5f05ecf446e);

// UNSUPPORTED Rust 558:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_RPC_AUTH_TYPE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdaba74ab_0d67_43e7_986e_75b84f82f594);

// UNSUPPORTED Rust 559:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_RPC_EP_FLAGS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x218b814a_0a39_49b8_8e71_c20c39c7dd2e);

// UNSUPPORTED Rust 560:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_RPC_EP_VALUE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdccea0b9_0886_4360_9c6a_ab043a24fba9);

// UNSUPPORTED Rust 561:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_RPC_IF_FLAG: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x238a8a32_3199_467d_871c_272621ab3896);

// UNSUPPORTED Rust 562:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_RPC_IF_UUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7c9c7d9f_0075_4d35_a0d1_8311c4cf6af1);

// UNSUPPORTED Rust 563:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_RPC_IF_VERSION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xeabfd9b7_1262_4a2e_adaa_5f96f6fe326d);

// UNSUPPORTED Rust 564:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_RPC_PROTOCOL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2717bc74_3a35_4ce7_b7ef_c838fabdec45);

// UNSUPPORTED Rust 565:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_RPC_PROXY_AUTH_TYPE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x40953fe2_8565_4759_8488_1771b4b4b5db);

// UNSUPPORTED Rust 566:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_RPC_SERVER_NAME: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb605a225_c3b3_48c7_9833_7aefa9527546);

// UNSUPPORTED Rust 567:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_RPC_SERVER_PORT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8090f645_9ad5_4e3b_9f9f_8023ca097909);

// UNSUPPORTED Rust 568:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_SEC_ENCRYPT_ALGORITHM: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0d306ef0_e974_4f74_b5c7_591b0da7d562);

// UNSUPPORTED Rust 569:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_SEC_KEY_SIZE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4772183b_ccf8_4aeb_bce1_c6c6161c8fe4);

// UNSUPPORTED Rust 570:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_SOURCE_INTERFACE_INDEX: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2311334d_c92d_45bf_9496_edf447820e2d);

// UNSUPPORTED Rust 571:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_SOURCE_SUB_INTERFACE_INDEX: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x055edd9d_acd2_4361_8dab_f9525d97662f);

// UNSUPPORTED Rust 572:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_SUB_INTERFACE_INDEX: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cd42473_d621_4be3_ae8c_72a348d283e1);

// UNSUPPORTED Rust 573:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_TUNNEL_TYPE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x77a40437_8779_4868_a261_f5a902f1c0cd);

// UNSUPPORTED Rust 574:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_VLAN_ID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x938eab21_3618_4e64_9ca5_2141ebda1ca2);

// UNSUPPORTED Rust 575:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_VSWITCH_DESTINATION_INTERFACE_ID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8ed48be4_c926_49f6_a4f6_ef3030e3fc16);

// UNSUPPORTED Rust 576:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_VSWITCH_DESTINATION_INTERFACE_TYPE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfa9b3f06_2f1a_4c57_9e68_a7098b28dbfe);

// UNSUPPORTED Rust 577:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_VSWITCH_DESTINATION_VM_ID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6106aace_4de1_4c84_9671_3637f8bcf731);

// UNSUPPORTED Rust 578:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_VSWITCH_ID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc4a414ba_437b_4de6_9946_d99c1b95b312);

// UNSUPPORTED Rust 579:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_VSWITCH_NETWORK_TYPE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x11d48b4b_e77a_40b4_9155_392c906c2608);

// UNSUPPORTED Rust 580:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_VSWITCH_SOURCE_INTERFACE_ID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7f4ef24b_b2c1_4938_ba33_a1ecbed512ba);

// UNSUPPORTED Rust 581:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_VSWITCH_SOURCE_INTERFACE_TYPE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe6b040a2_edaf_4c36_908b_f2f58ae43807);

// UNSUPPORTED Rust 582:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_VSWITCH_SOURCE_VM_ID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9c2a9ec2_9fc6_42bc_bdd8_406d4da0be64);

// UNSUPPORTED Rust 583:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_CONDITION_VSWITCH_TENANT_NETWORK_ID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdc04843c_79e6_4e44_a025_65b9bb0f9f94);

// UNSUPPORTED Rust 584:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FWPM_CONNECTION0 {
//     pub connectionId: u64,
//     pub ipVersion: FWP_IP_VERSION,
//     pub Anonymous1: FWPM_CONNECTION0_0,
//     pub Anonymous2: FWPM_CONNECTION0_1,
//     pub providerKey: *mut windows_sys::core::GUID,
//     pub ipsecTrafficModeType: IPSEC_TRAFFIC_TYPE,
//     pub keyModuleType: IKEEXT_KEY_MODULE_TYPE,
//     pub mmCrypto: IKEEXT_PROPOSAL0,
//     pub mmPeer: IKEEXT_CREDENTIAL2,
//     pub emPeer: IKEEXT_CREDENTIAL2,
//     pub bytesTransferredIn: u64,
//     pub bytesTransferredOut: u64,
//     pub bytesTransferredTotal: u64,
//     pub startSysTime: super::super::Foundation::FILETIME,
// }

// UNSUPPORTED Rust 602:1: declaration Impl has no candidate rule
// impl Default for FWPM_CONNECTION0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 607:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union FWPM_CONNECTION0_0 {
//     pub localV4Address: u32,
//     pub localV6Address: [u8; 16],
// }

// UNSUPPORTED Rust 613:1: declaration Impl has no candidate rule
// impl Default for FWPM_CONNECTION0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 618:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union FWPM_CONNECTION0_1 {
//     pub remoteV4Address: u32,
//     pub remoteV6Address: [u8; 16],
// }

// UNSUPPORTED Rust 624:1: declaration Impl has no candidate rule
// impl Default for FWPM_CONNECTION0_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 629:1: generic scalar type unsupported
// pub type FWPM_CONNECTION_CALLBACK0 = Option<unsafe extern "system" fn(context: *mut core::ffi::c_void, eventtype: FWPM_CONNECTION_EVENT_TYPE, connection: *const FWPM_CONNECTION0)>;

public const val `FWPM_CONNECTION_ENUM_FLAG_QUERY_BYTES_TRANSFERRED`: UInt = 1u;
// UNSUPPORTED Rust 631:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FWPM_CONNECTION_ENUM_TEMPLATE0 {
//     pub connectionId: u64,
//     pub flags: u32,
// }

public const val `FWPM_CONNECTION_EVENT_ADD`: `FWPM_CONNECTION_EVENT_TYPE` = 0;
public const val `FWPM_CONNECTION_EVENT_DELETE`: `FWPM_CONNECTION_EVENT_TYPE` = 1;
public const val `FWPM_CONNECTION_EVENT_MAX`: `FWPM_CONNECTION_EVENT_TYPE` = 2;
public typealias `FWPM_CONNECTION_EVENT_TYPE` = Int;
// UNSUPPORTED Rust 641:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FWPM_CONNECTION_SUBSCRIPTION0 {
//     pub enumTemplate: *mut FWPM_CONNECTION_ENUM_TEMPLATE0,
//     pub flags: u32,
//     pub sessionKey: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 648:1: declaration Impl has no candidate rule
// impl Default for FWPM_CONNECTION_SUBSCRIPTION0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 653:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FWPM_DISPLAY_DATA0 {
//     pub name: windows_sys::core::PWSTR,
//     pub description: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 659:1: declaration Impl has no candidate rule
// impl Default for FWPM_DISPLAY_DATA0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 664:1: generic scalar type unsupported
// pub type FWPM_DYNAMIC_KEYWORD_CALLBACK0 = Option<unsafe extern "system" fn(notification: *mut core::ffi::c_void, context: *mut core::ffi::c_void)>;

public const val `FWPM_ENGINE_COLLECT_NET_EVENTS`: `FWPM_ENGINE_OPTION` = 0;
public const val `FWPM_ENGINE_MONITOR_IPSEC_CONNECTIONS`: `FWPM_ENGINE_OPTION` = 3;
public const val `FWPM_ENGINE_NAME_CACHE`: `FWPM_ENGINE_OPTION` = 2;
public const val `FWPM_ENGINE_NET_EVENT_MATCH_ANY_KEYWORDS`: `FWPM_ENGINE_OPTION` = 1;
public typealias `FWPM_ENGINE_OPTION` = Int;
public const val `FWPM_ENGINE_OPTION_MAX`: `FWPM_ENGINE_OPTION` = 6;
public const val `FWPM_ENGINE_OPTION_PACKET_BATCH_INBOUND`: UInt = 4u;
public const val `FWPM_ENGINE_OPTION_PACKET_QUEUE_FORWARD`: UInt = 2u;
public const val `FWPM_ENGINE_OPTION_PACKET_QUEUE_INBOUND`: UInt = 1u;
public const val `FWPM_ENGINE_OPTION_PACKET_QUEUE_NONE`: UInt = 0u;
public const val `FWPM_ENGINE_PACKET_QUEUING`: `FWPM_ENGINE_OPTION` = 4;
public const val `FWPM_ENGINE_TXN_WATCHDOG_TIMEOUT_IN_MSEC`: `FWPM_ENGINE_OPTION` = 5;
// UNSUPPORTED Rust 677:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FWPM_FIELD0 {
//     pub fieldKey: *mut windows_sys::core::GUID,
//     pub r#type: FWPM_FIELD_TYPE,
//     pub dataType: FWP_DATA_TYPE,
// }

// UNSUPPORTED Rust 684:1: declaration Impl has no candidate rule
// impl Default for FWPM_FIELD0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FWPM_FIELD_FLAGS`: `FWPM_FIELD_TYPE` = 2;
public const val `FWPM_FIELD_IP_ADDRESS`: `FWPM_FIELD_TYPE` = 1;
public const val `FWPM_FIELD_RAW_DATA`: `FWPM_FIELD_TYPE` = 0;
public typealias `FWPM_FIELD_TYPE` = Int;
public const val `FWPM_FIELD_TYPE_MAX`: `FWPM_FIELD_TYPE` = 3;
// UNSUPPORTED Rust 694:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct FWPM_FILTER0 {
//     pub filterKey: windows_sys::core::GUID,
//     pub displayData: FWPM_DISPLAY_DATA0,
//     pub flags: FWPM_FILTER_FLAGS,
//     pub providerKey: *mut windows_sys::core::GUID,
//     pub providerData: FWP_BYTE_BLOB,
//     pub layerKey: windows_sys::core::GUID,
//     pub subLayerKey: windows_sys::core::GUID,
//     pub weight: FWP_VALUE0,
//     pub numFilterConditions: u32,
//     pub filterCondition: *mut FWPM_FILTER_CONDITION0,
//     pub action: FWPM_ACTION0,
//     pub Anonymous: FWPM_FILTER0_0,
//     pub reserved: *mut windows_sys::core::GUID,
//     pub filterId: u64,
//     pub effectiveWeight: FWP_VALUE0,
// }

// UNSUPPORTED Rust 714:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_FILTER0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 720:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub union FWPM_FILTER0_0 {
//     pub rawContext: u64,
//     pub providerContextKey: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 727:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_FILTER0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 733:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FWPM_FILTER_CHANGE0 {
//     pub changeType: FWPM_CHANGE_TYPE,
//     pub filterKey: windows_sys::core::GUID,
//     pub filterId: u64,
// }

// UNSUPPORTED Rust 740:1: generic scalar type unsupported
// pub type FWPM_FILTER_CHANGE_CALLBACK0 = Option<unsafe extern "system" fn(context: *mut core::ffi::c_void, change: *const FWPM_FILTER_CHANGE0)>;

// UNSUPPORTED Rust 741:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct FWPM_FILTER_CONDITION0 {
//     pub fieldKey: windows_sys::core::GUID,
//     pub matchType: FWP_MATCH_TYPE,
//     pub conditionValue: FWP_CONDITION_VALUE0,
// }

// UNSUPPORTED Rust 749:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_FILTER_CONDITION0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 755:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct FWPM_FILTER_ENUM_TEMPLATE0 {
//     pub providerKey: *mut windows_sys::core::GUID,
//     pub layerKey: windows_sys::core::GUID,
//     pub enumType: FWP_FILTER_ENUM_TYPE,
//     pub flags: u32,
//     pub providerContextTemplate: *mut FWPM_PROVIDER_CONTEXT_ENUM_TEMPLATE0,
//     pub numFilterConditions: u32,
//     pub filterCondition: *mut FWPM_FILTER_CONDITION0,
//     pub actionMask: u32,
//     pub calloutKey: *mut windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 769:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_FILTER_ENUM_TEMPLATE0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `FWPM_FILTER_FLAGS` = UInt;
public const val `FWPM_FILTER_FLAG_BOOTTIME`: `FWPM_FILTER_FLAGS` = 2u;
public const val `FWPM_FILTER_FLAG_CLEAR_ACTION_RIGHT`: `FWPM_FILTER_FLAGS` = 8u;
public const val `FWPM_FILTER_FLAG_DISABLED`: `FWPM_FILTER_FLAGS` = 32u;
public const val `FWPM_FILTER_FLAG_GAMEOS_ONLY`: UInt = 512u;
public const val `FWPM_FILTER_FLAG_HAS_PROVIDER_CONTEXT`: `FWPM_FILTER_FLAGS` = 4u;
public const val `FWPM_FILTER_FLAG_HAS_SECURITY_REALM_PROVIDER_CONTEXT`: UInt = 128u;
public const val `FWPM_FILTER_FLAG_INDEXED`: `FWPM_FILTER_FLAGS` = 64u;
public const val `FWPM_FILTER_FLAG_IPSEC_NO_ACQUIRE_INITIATE`: UInt = 2048u;
public const val `FWPM_FILTER_FLAG_NONE`: `FWPM_FILTER_FLAGS` = 0u;
public const val `FWPM_FILTER_FLAG_PERMIT_IF_CALLOUT_UNREGISTERED`: `FWPM_FILTER_FLAGS` = 16u;
public const val `FWPM_FILTER_FLAG_PERSISTENT`: `FWPM_FILTER_FLAGS` = 1u;
public const val `FWPM_FILTER_FLAG_RESERVED0`: UInt = 4096u;
public const val `FWPM_FILTER_FLAG_RESERVED1`: UInt = 8192u;
public const val `FWPM_FILTER_FLAG_SILENT_MODE`: UInt = 1024u;
public const val `FWPM_FILTER_FLAG_SYSTEMOS_ONLY`: UInt = 256u;
// UNSUPPORTED Rust 791:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct FWPM_FILTER_SUBSCRIPTION0 {
//     pub enumTemplate: *mut FWPM_FILTER_ENUM_TEMPLATE0,
//     pub flags: u32,
//     pub sessionKey: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 799:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_FILTER_SUBSCRIPTION0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FWPM_GENERAL_CONTEXT`: `FWPM_PROVIDER_CONTEXT_TYPE` = 8;
public const val `FWPM_IPSEC_AUTHIP_MM_CONTEXT`: `FWPM_PROVIDER_CONTEXT_TYPE` = 6;
public const val `FWPM_IPSEC_AUTHIP_QM_TRANSPORT_CONTEXT`: `FWPM_PROVIDER_CONTEXT_TYPE` = 3;
public const val `FWPM_IPSEC_AUTHIP_QM_TUNNEL_CONTEXT`: `FWPM_PROVIDER_CONTEXT_TYPE` = 4;
public const val `FWPM_IPSEC_DOSP_CONTEXT`: `FWPM_PROVIDER_CONTEXT_TYPE` = 11;
public const val `FWPM_IPSEC_IKEV2_MM_CONTEXT`: `FWPM_PROVIDER_CONTEXT_TYPE` = 10;
public const val `FWPM_IPSEC_IKEV2_QM_TRANSPORT_CONTEXT`: `FWPM_PROVIDER_CONTEXT_TYPE` = 12;
public const val `FWPM_IPSEC_IKEV2_QM_TUNNEL_CONTEXT`: `FWPM_PROVIDER_CONTEXT_TYPE` = 9;
public const val `FWPM_IPSEC_IKE_MM_CONTEXT`: `FWPM_PROVIDER_CONTEXT_TYPE` = 5;
public const val `FWPM_IPSEC_IKE_QM_TRANSPORT_CONTEXT`: `FWPM_PROVIDER_CONTEXT_TYPE` = 1;
public const val `FWPM_IPSEC_IKE_QM_TUNNEL_CONTEXT`: `FWPM_PROVIDER_CONTEXT_TYPE` = 2;
public const val `FWPM_IPSEC_KEYING_CONTEXT`: `FWPM_PROVIDER_CONTEXT_TYPE` = 0;
// UNSUPPORTED Rust 817:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_KEYING_MODULE_AUTHIP: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x11e3dae0_dd26_4590_857d_ab4b28d1a095);

// UNSUPPORTED Rust 818:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_KEYING_MODULE_IKE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa9bbf787_82a8_45bb_a400_5d7e5952c7a9);

// UNSUPPORTED Rust 819:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_KEYING_MODULE_IKEV2: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x041792cc_8f07_419d_a394_716968cb1647);

// UNSUPPORTED Rust 820:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FWPM_LAYER0 {
//     pub layerKey: windows_sys::core::GUID,
//     pub displayData: FWPM_DISPLAY_DATA0,
//     pub flags: u32,
//     pub numFields: u32,
//     pub field: *mut FWPM_FIELD0,
//     pub defaultSubLayerKey: windows_sys::core::GUID,
//     pub layerId: u16,
// }

// UNSUPPORTED Rust 831:1: declaration Impl has no candidate rule
// impl Default for FWPM_LAYER0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 836:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_ALE_AUTH_CONNECT_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc38d57d1_05a7_4c33_904f_7fbceee60e82);

// UNSUPPORTED Rust 837:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_ALE_AUTH_CONNECT_V4_DISCARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd632a801_f5ba_4ad6_96e3_607017d9836a);

// UNSUPPORTED Rust 838:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_ALE_AUTH_CONNECT_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4a72393b_319f_44bc_84c3_ba54dcb3b6b4);

// UNSUPPORTED Rust 839:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_ALE_AUTH_CONNECT_V6_DISCARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc97bc3b8_c9a3_4e33_8695_8e17aad4de09);

// UNSUPPORTED Rust 840:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_ALE_AUTH_LISTEN_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x88bb5dad_76d7_4227_9c71_df0a3ed7be7e);

// UNSUPPORTED Rust 841:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_ALE_AUTH_LISTEN_V4_DISCARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x371dfada_9f26_45fd_b4eb_c29eb212893f);

// UNSUPPORTED Rust 842:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_ALE_AUTH_LISTEN_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7ac9de24_17dd_4814_b4bd_a9fbc95a321b);

// UNSUPPORTED Rust 843:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_ALE_AUTH_LISTEN_V6_DISCARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x60703b07_63c8_48e9_ada3_12b1af40a617);

// UNSUPPORTED Rust 844:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_ALE_AUTH_RECV_ACCEPT_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe1cd9fe7_f4b5_4273_96c0_592e487b8650);

// UNSUPPORTED Rust 845:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_ALE_AUTH_RECV_ACCEPT_V4_DISCARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9eeaa99b_bd22_4227_919f_0073c63357b1);

// UNSUPPORTED Rust 846:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_ALE_AUTH_RECV_ACCEPT_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa3b42c97_9f04_4672_b87e_cee9c483257f);

// UNSUPPORTED Rust 847:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_ALE_AUTH_RECV_ACCEPT_V6_DISCARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x89455b97_dbe1_453f_a224_13da895af396);

// UNSUPPORTED Rust 848:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_ALE_BIND_REDIRECT_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x66978cad_c704_42ac_86ac_7c1a231bd253);

// UNSUPPORTED Rust 849:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_ALE_BIND_REDIRECT_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbef02c9c_606b_4536_8c26_1c2fc7b631d4);

// UNSUPPORTED Rust 850:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_ALE_CONNECT_REDIRECT_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc6e63c8c_b784_4562_aa7d_0a67cfcaf9a3);

// UNSUPPORTED Rust 851:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_ALE_CONNECT_REDIRECT_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x587e54a7_8046_42ba_a0aa_b716250fc7fd);

// UNSUPPORTED Rust 852:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_ALE_ENDPOINT_CLOSURE_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb4766427_e2a2_467a_bd7e_dbcd1bd85a09);

// UNSUPPORTED Rust 853:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_ALE_ENDPOINT_CLOSURE_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbb536ccd_4755_4ba9_9ff7_f9edf8699c7b);

// UNSUPPORTED Rust 854:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_ALE_FLOW_ESTABLISHED_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xaf80470a_5596_4c13_9992_539e6fe57967);

// UNSUPPORTED Rust 855:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_ALE_FLOW_ESTABLISHED_V4_DISCARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x146ae4a9_a1d2_4d43_a31a_4c42682b8e4f);

// UNSUPPORTED Rust 856:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_ALE_FLOW_ESTABLISHED_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7021d2b3_dfa4_406e_afeb_6afaf7e70efd);

// UNSUPPORTED Rust 857:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_ALE_FLOW_ESTABLISHED_V6_DISCARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x46928636_bbca_4b76_941d_0fa7f5d7d372);

// UNSUPPORTED Rust 858:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_ALE_RESOURCE_ASSIGNMENT_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1247d66d_0b60_4a15_8d44_7155d0f53a0c);

// UNSUPPORTED Rust 859:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_ALE_RESOURCE_ASSIGNMENT_V4_DISCARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0b5812a2_c3ff_4eca_b88d_c79e20ac6322);

// UNSUPPORTED Rust 860:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_ALE_RESOURCE_ASSIGNMENT_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x55a650e1_5f0a_4eca_a653_88f53b26aa8c);

// UNSUPPORTED Rust 861:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_ALE_RESOURCE_ASSIGNMENT_V6_DISCARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcbc998bb_c51f_4c1a_bb4f_9775fcacab2f);

// UNSUPPORTED Rust 862:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_ALE_RESOURCE_RELEASE_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x74365cce_ccb0_401a_bfc1_b89934ad7e15);

// UNSUPPORTED Rust 863:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_ALE_RESOURCE_RELEASE_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf4e5ce80_edcc_4e13_8a2f_b91454bb057b);

// UNSUPPORTED Rust 864:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_DATAGRAM_DATA_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3d08bf4e_45f6_4930_a922_417098e20027);

// UNSUPPORTED Rust 865:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_DATAGRAM_DATA_V4_DISCARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x18e330c6_7248_4e52_aaab_472ed67704fd);

// UNSUPPORTED Rust 866:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_DATAGRAM_DATA_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfa45fe2f_3cba_4427_87fc_57b9a4b10d00);

// UNSUPPORTED Rust 867:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_DATAGRAM_DATA_V6_DISCARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x09d1dfe1_9b86_4a42_be9d_8c315b92a5d0);

// UNSUPPORTED Rust 868:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_EGRESS_VSWITCH_ETHERNET: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x86c872b0_76fa_4b79_93a4_0750530ae292);

// UNSUPPORTED Rust 869:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_EGRESS_VSWITCH_TRANSPORT_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb92350b6_91f0_46b6_bdc4_871dfd4a7c98);

// UNSUPPORTED Rust 870:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_EGRESS_VSWITCH_TRANSPORT_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1b2def23_1881_40bd_82f4_4254e63141cb);

// UNSUPPORTED Rust 871:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FWPM_LAYER_ENUM_TEMPLATE0 {
//     pub reserved: u64,
// }

public const val `FWPM_LAYER_FLAG_BUFFERED`: UInt = 8u;
public const val `FWPM_LAYER_FLAG_BUILTIN`: UInt = 2u;
public const val `FWPM_LAYER_FLAG_CLASSIFY_MOSTLY`: UInt = 4u;
public const val `FWPM_LAYER_FLAG_KERNEL`: UInt = 1u;
// UNSUPPORTED Rust 880:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_IKEEXT_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb14b7bdb_dbbd_473e_bed4_8b4708d4f270);

// UNSUPPORTED Rust 881:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_IKEEXT_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb64786b3_f687_4eb9_89d2_8ef32acdabe2);

// UNSUPPORTED Rust 882:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_INBOUND_ICMP_ERROR_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x61499990_3cb6_4e84_b950_53b94b6964f3);

// UNSUPPORTED Rust 883:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_INBOUND_ICMP_ERROR_V4_DISCARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa6b17075_ebaf_4053_a4e7_213c8121ede5);

// UNSUPPORTED Rust 884:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_INBOUND_ICMP_ERROR_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x65f9bdff_3b2d_4e5d_b8c6_c720651fe898);

// UNSUPPORTED Rust 885:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_INBOUND_ICMP_ERROR_V6_DISCARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa6e7ccc0_08fb_468d_a472_9771d5595e09);

// UNSUPPORTED Rust 886:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_INBOUND_IPPACKET_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc86fd1bf_21cd_497e_a0bb_17425c885c58);

// UNSUPPORTED Rust 887:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_INBOUND_IPPACKET_V4_DISCARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb5a230d0_a8c0_44f2_916e_991b53ded1f7);

// UNSUPPORTED Rust 888:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_INBOUND_IPPACKET_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf52032cb_991c_46e7_971d_2601459a91ca);

// UNSUPPORTED Rust 889:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_INBOUND_IPPACKET_V6_DISCARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbb24c279_93b4_47a2_83ad_ae1698b50885);

// UNSUPPORTED Rust 890:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_INBOUND_MAC_FRAME_ETHERNET: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xeffb7edb_0055_4f9a_a231_4ff8131ad191);

// UNSUPPORTED Rust 891:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_INBOUND_MAC_FRAME_NATIVE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd4220bd3_62ce_4f08_ae88_b56e8526df50);

// UNSUPPORTED Rust 892:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_INBOUND_MAC_FRAME_NATIVE_FAST: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x853aaa8e_2b78_4d24_a804_36db08b29711);

// UNSUPPORTED Rust 893:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_INBOUND_RESERVED2: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf4fb8d55_c076_46d8_a2c7_6a4c722ca4ed);

// UNSUPPORTED Rust 894:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_INBOUND_TRANSPORT_FAST: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe41d2719_05c7_40f0_8983_ea8d17bbc2f6);

// UNSUPPORTED Rust 895:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_INBOUND_TRANSPORT_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5926dfc8_e3cf_4426_a283_dc393f5d0f9d);

// UNSUPPORTED Rust 896:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_INBOUND_TRANSPORT_V4_DISCARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xac4a9833_f69d_4648_b261_6dc84835ef39);

// UNSUPPORTED Rust 897:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_INBOUND_TRANSPORT_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x634a869f_fc23_4b90_b0c1_bf620a36ae6f);

// UNSUPPORTED Rust 898:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_INBOUND_TRANSPORT_V6_DISCARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2a6ff955_3b2b_49d2_9848_ad9d72dcaab7);

// UNSUPPORTED Rust 899:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_INGRESS_VSWITCH_ETHERNET: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7d98577a_9a87_41ec_9718_7cf589c9f32d);

// UNSUPPORTED Rust 900:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_INGRESS_VSWITCH_TRANSPORT_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb2696ff6_774f_4554_9f7d_3da3945f8e85);

// UNSUPPORTED Rust 901:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_INGRESS_VSWITCH_TRANSPORT_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5ee314fc_7d8a_47f4_b7e3_291a36da4e12);

// UNSUPPORTED Rust 902:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_IPFORWARD_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa82acc24_4ee1_4ee1_b465_fd1d25cb10a4);

// UNSUPPORTED Rust 903:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_IPFORWARD_V4_DISCARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9e9ea773_2fae_4210_8f17_34129ef369eb);

// UNSUPPORTED Rust 904:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_IPFORWARD_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7b964818_19c7_493a_b71f_832c3684d28c);

// UNSUPPORTED Rust 905:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_IPFORWARD_V6_DISCARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x31524a5d_1dfe_472f_bb93_518ee945d8a2);

// UNSUPPORTED Rust 906:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_IPSEC_KM_DEMUX_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf02b1526_a459_4a51_b9e3_759de52b9d2c);

// UNSUPPORTED Rust 907:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_IPSEC_KM_DEMUX_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2f755cf6_2fd4_4e88_b3e4_a91bca495235);

// UNSUPPORTED Rust 908:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_IPSEC_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xeda65c74_610d_4bc5_948f_3c4f89556867);

// UNSUPPORTED Rust 909:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_IPSEC_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x13c48442_8d87_4261_9a29_59d2abc348b4);

// UNSUPPORTED Rust 910:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_KM_AUTHORIZATION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4aa226e9_9020_45fb_956a_c0249d841195);

// UNSUPPORTED Rust 911:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_NAME_RESOLUTION_CACHE_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0c2aa681_905b_4ccd_a467_4dd811d07b7b);

// UNSUPPORTED Rust 912:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_NAME_RESOLUTION_CACHE_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x92d592fa_6b01_434a_9dea_d1e96ea97da9);

// UNSUPPORTED Rust 913:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_OUTBOUND_ICMP_ERROR_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x41390100_564c_4b32_bc1d_718048354d7c);

// UNSUPPORTED Rust 914:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_OUTBOUND_ICMP_ERROR_V4_DISCARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb3598d36_0561_4588_a6bf_e955e3f6264b);

// UNSUPPORTED Rust 915:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_OUTBOUND_ICMP_ERROR_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7fb03b60_7b8d_4dfa_badd_980176fc4e12);

// UNSUPPORTED Rust 916:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_OUTBOUND_ICMP_ERROR_V6_DISCARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x65f2e647_8d0c_4f47_b19b_33a4d3f1357c);

// UNSUPPORTED Rust 917:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_OUTBOUND_IPPACKET_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1e5c9fae_8a84_4135_a331_950b54229ecd);

// UNSUPPORTED Rust 918:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_OUTBOUND_IPPACKET_V4_DISCARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x08e4bcb5_b647_48f3_953c_e5ddbd03937e);

// UNSUPPORTED Rust 919:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_OUTBOUND_IPPACKET_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa3b3ab6b_3564_488c_9117_f34e82142763);

// UNSUPPORTED Rust 920:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_OUTBOUND_IPPACKET_V6_DISCARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9513d7c4_a934_49dc_91a7_6ccb80cc02e3);

// UNSUPPORTED Rust 921:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_OUTBOUND_MAC_FRAME_ETHERNET: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x694673bc_d6db_4870_adee_0acdbdb7f4b2);

// UNSUPPORTED Rust 922:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_OUTBOUND_MAC_FRAME_NATIVE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x94c44912_9d6f_4ebf_b995_05ab8a088d1b);

// UNSUPPORTED Rust 923:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_OUTBOUND_MAC_FRAME_NATIVE_FAST: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x470df946_c962_486f_9446_8293cbc75eb8);

// UNSUPPORTED Rust 924:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_OUTBOUND_NETWORK_CONNECTION_POLICY_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x037f317a_d696_494a_bba5_bffc265e6052);

// UNSUPPORTED Rust 925:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_OUTBOUND_NETWORK_CONNECTION_POLICY_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x22a4fdb1_6d7e_48ae_ae77_3742525c3119);

// UNSUPPORTED Rust 926:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_OUTBOUND_TRANSPORT_FAST: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x13ed4388_a070_4815_9935_7a9be6408b78);

// UNSUPPORTED Rust 927:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_OUTBOUND_TRANSPORT_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x09e61aea_d214_46e2_9b21_b26b0b2f28c8);

// UNSUPPORTED Rust 928:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_OUTBOUND_TRANSPORT_V4_DISCARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc5f10551_bdb0_43d7_a313_50e211f4d68a);

// UNSUPPORTED Rust 929:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_OUTBOUND_TRANSPORT_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe1735bde_013f_4655_b351_a49e15762df0);

// UNSUPPORTED Rust 930:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_OUTBOUND_TRANSPORT_V6_DISCARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf433df69_ccbd_482e_b9b2_57165658c3b3);

// UNSUPPORTED Rust 931:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_RPC_EPMAP: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9247bc61_eb07_47ee_872c_bfd78bfd1616);

// UNSUPPORTED Rust 932:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_RPC_EP_ADD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x618dffc7_c450_4943_95db_99b4c16a55d4);

// UNSUPPORTED Rust 933:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_RPC_PROXY_CONN: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x94a4b50b_ba5c_4f27_907a_229fac0c2a7a);

// UNSUPPORTED Rust 934:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_RPC_PROXY_IF: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf8a38615_e12c_41ac_98df_121ad981aade);

// UNSUPPORTED Rust 935:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_RPC_UM: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x75a89dda_95e4_40f3_adc7_7688a9c847e1);

// UNSUPPORTED Rust 936:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FWPM_LAYER_STATISTICS0 {
//     pub layerId: windows_sys::core::GUID,
//     pub classifyPermitCount: u32,
//     pub classifyBlockCount: u32,
//     pub classifyVetoCount: u32,
//     pub numCacheEntries: u32,
// }

// UNSUPPORTED Rust 945:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_STREAM_PACKET_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xaf52d8ec_cb2d_44e5_ad92_f8dc38d2eb29);

// UNSUPPORTED Rust 946:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_STREAM_PACKET_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x779a8ca3_f099_468f_b5d4_83535c461c02);

// UNSUPPORTED Rust 947:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_STREAM_V4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3b89653c_c170_49e4_b1cd_e0eeeee19a3e);

// UNSUPPORTED Rust 948:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_STREAM_V4_DISCARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x25c4c2c2_25ff_4352_82f9_c54a4a4726dc);

// UNSUPPORTED Rust 949:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_STREAM_V6: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x47c9137a_7ec4_46b3_b6e4_48e926b1eda4);

// UNSUPPORTED Rust 950:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_LAYER_STREAM_V6_DISCARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x10a59fc7_b628_4c41_9eb8_cf37d55103cf);

public const val `FWPM_NETWORK_CONNECTION_POLICY_CONTEXT`: `FWPM_PROVIDER_CONTEXT_TYPE` = 13;
// UNSUPPORTED Rust 952:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct FWPM_NETWORK_CONNECTION_POLICY_SETTING0 {
//     pub r#type: FWP_NETWORK_CONNECTION_POLICY_SETTING_TYPE,
//     pub value: FWP_VALUE0,
// }

// UNSUPPORTED Rust 959:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NETWORK_CONNECTION_POLICY_SETTING0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 965:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct FWPM_NETWORK_CONNECTION_POLICY_SETTINGS0 {
//     pub numSettings: u32,
//     pub settings: *mut FWPM_NETWORK_CONNECTION_POLICY_SETTING0,
// }

// UNSUPPORTED Rust 972:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NETWORK_CONNECTION_POLICY_SETTINGS0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 978:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct FWPM_NET_EVENT0 {
//     pub header: FWPM_NET_EVENT_HEADER0,
//     pub r#type: FWPM_NET_EVENT_TYPE,
//     pub Anonymous: FWPM_NET_EVENT0_0,
// }

// UNSUPPORTED Rust 986:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 992:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub union FWPM_NET_EVENT0_0 {
//     pub ikeMmFailure: *mut FWPM_NET_EVENT_IKEEXT_MM_FAILURE0,
//     pub ikeQmFailure: *mut FWPM_NET_EVENT_IKEEXT_QM_FAILURE0,
//     pub ikeEmFailure: *mut FWPM_NET_EVENT_IKEEXT_EM_FAILURE0,
//     pub classifyDrop: *mut FWPM_NET_EVENT_CLASSIFY_DROP0,
//     pub ipsecDrop: *mut FWPM_NET_EVENT_IPSEC_KERNEL_DROP0,
//     pub idpDrop: *mut FWPM_NET_EVENT_IPSEC_DOSP_DROP0,
// }

// UNSUPPORTED Rust 1003:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1009:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct FWPM_NET_EVENT1 {
//     pub header: FWPM_NET_EVENT_HEADER1,
//     pub r#type: FWPM_NET_EVENT_TYPE,
//     pub Anonymous: FWPM_NET_EVENT1_0,
// }

// UNSUPPORTED Rust 1017:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1023:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub union FWPM_NET_EVENT1_0 {
//     pub ikeMmFailure: *mut FWPM_NET_EVENT_IKEEXT_MM_FAILURE1,
//     pub ikeQmFailure: *mut FWPM_NET_EVENT_IKEEXT_QM_FAILURE0,
//     pub ikeEmFailure: *mut FWPM_NET_EVENT_IKEEXT_EM_FAILURE1,
//     pub classifyDrop: *mut FWPM_NET_EVENT_CLASSIFY_DROP1,
//     pub ipsecDrop: *mut FWPM_NET_EVENT_IPSEC_KERNEL_DROP0,
//     pub idpDrop: *mut FWPM_NET_EVENT_IPSEC_DOSP_DROP0,
// }

// UNSUPPORTED Rust 1034:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT1_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1040:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct FWPM_NET_EVENT2 {
//     pub header: FWPM_NET_EVENT_HEADER2,
//     pub r#type: FWPM_NET_EVENT_TYPE,
//     pub Anonymous: FWPM_NET_EVENT2_0,
// }

// UNSUPPORTED Rust 1048:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1054:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub union FWPM_NET_EVENT2_0 {
//     pub ikeMmFailure: *mut FWPM_NET_EVENT_IKEEXT_MM_FAILURE1,
//     pub ikeQmFailure: *mut FWPM_NET_EVENT_IKEEXT_QM_FAILURE0,
//     pub ikeEmFailure: *mut FWPM_NET_EVENT_IKEEXT_EM_FAILURE1,
//     pub classifyDrop: *mut FWPM_NET_EVENT_CLASSIFY_DROP2,
//     pub ipsecDrop: *mut FWPM_NET_EVENT_IPSEC_KERNEL_DROP0,
//     pub idpDrop: *mut FWPM_NET_EVENT_IPSEC_DOSP_DROP0,
//     pub classifyAllow: *mut FWPM_NET_EVENT_CLASSIFY_ALLOW0,
//     pub capabilityDrop: *mut FWPM_NET_EVENT_CAPABILITY_DROP0,
//     pub capabilityAllow: *mut FWPM_NET_EVENT_CAPABILITY_ALLOW0,
//     pub classifyDropMac: *mut FWPM_NET_EVENT_CLASSIFY_DROP_MAC0,
// }

// UNSUPPORTED Rust 1069:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT2_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1075:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct FWPM_NET_EVENT3 {
//     pub header: FWPM_NET_EVENT_HEADER3,
//     pub r#type: FWPM_NET_EVENT_TYPE,
//     pub Anonymous: FWPM_NET_EVENT3_0,
// }

// UNSUPPORTED Rust 1083:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1089:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub union FWPM_NET_EVENT3_0 {
//     pub ikeMmFailure: *mut FWPM_NET_EVENT_IKEEXT_MM_FAILURE1,
//     pub ikeQmFailure: *mut FWPM_NET_EVENT_IKEEXT_QM_FAILURE0,
//     pub ikeEmFailure: *mut FWPM_NET_EVENT_IKEEXT_EM_FAILURE1,
//     pub classifyDrop: *mut FWPM_NET_EVENT_CLASSIFY_DROP2,
//     pub ipsecDrop: *mut FWPM_NET_EVENT_IPSEC_KERNEL_DROP0,
//     pub idpDrop: *mut FWPM_NET_EVENT_IPSEC_DOSP_DROP0,
//     pub classifyAllow: *mut FWPM_NET_EVENT_CLASSIFY_ALLOW0,
//     pub capabilityDrop: *mut FWPM_NET_EVENT_CAPABILITY_DROP0,
//     pub capabilityAllow: *mut FWPM_NET_EVENT_CAPABILITY_ALLOW0,
//     pub classifyDropMac: *mut FWPM_NET_EVENT_CLASSIFY_DROP_MAC0,
// }

// UNSUPPORTED Rust 1104:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT3_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1110:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct FWPM_NET_EVENT4 {
//     pub header: FWPM_NET_EVENT_HEADER3,
//     pub r#type: FWPM_NET_EVENT_TYPE,
//     pub Anonymous: FWPM_NET_EVENT4_0,
// }

// UNSUPPORTED Rust 1118:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT4 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1124:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub union FWPM_NET_EVENT4_0 {
//     pub ikeMmFailure: *mut FWPM_NET_EVENT_IKEEXT_MM_FAILURE2,
//     pub ikeQmFailure: *mut FWPM_NET_EVENT_IKEEXT_QM_FAILURE1,
//     pub ikeEmFailure: *mut FWPM_NET_EVENT_IKEEXT_EM_FAILURE1,
//     pub classifyDrop: *mut FWPM_NET_EVENT_CLASSIFY_DROP2,
//     pub ipsecDrop: *mut FWPM_NET_EVENT_IPSEC_KERNEL_DROP0,
//     pub idpDrop: *mut FWPM_NET_EVENT_IPSEC_DOSP_DROP0,
//     pub classifyAllow: *mut FWPM_NET_EVENT_CLASSIFY_ALLOW0,
//     pub capabilityDrop: *mut FWPM_NET_EVENT_CAPABILITY_DROP0,
//     pub capabilityAllow: *mut FWPM_NET_EVENT_CAPABILITY_ALLOW0,
//     pub classifyDropMac: *mut FWPM_NET_EVENT_CLASSIFY_DROP_MAC0,
// }

// UNSUPPORTED Rust 1139:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT4_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1145:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct FWPM_NET_EVENT5 {
//     pub header: FWPM_NET_EVENT_HEADER3,
//     pub r#type: FWPM_NET_EVENT_TYPE,
//     pub Anonymous: FWPM_NET_EVENT5_0,
// }

// UNSUPPORTED Rust 1153:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT5 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1159:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub union FWPM_NET_EVENT5_0 {
//     pub ikeMmFailure: *mut FWPM_NET_EVENT_IKEEXT_MM_FAILURE2,
//     pub ikeQmFailure: *mut FWPM_NET_EVENT_IKEEXT_QM_FAILURE1,
//     pub ikeEmFailure: *mut FWPM_NET_EVENT_IKEEXT_EM_FAILURE1,
//     pub classifyDrop: *mut FWPM_NET_EVENT_CLASSIFY_DROP2,
//     pub ipsecDrop: *mut FWPM_NET_EVENT_IPSEC_KERNEL_DROP0,
//     pub idpDrop: *mut FWPM_NET_EVENT_IPSEC_DOSP_DROP0,
//     pub classifyAllow: *mut FWPM_NET_EVENT_CLASSIFY_ALLOW0,
//     pub capabilityDrop: *mut FWPM_NET_EVENT_CAPABILITY_DROP0,
//     pub capabilityAllow: *mut FWPM_NET_EVENT_CAPABILITY_ALLOW0,
//     pub classifyDropMac: *mut FWPM_NET_EVENT_CLASSIFY_DROP_MAC0,
//     pub lpmPacketArrival: *mut FWPM_NET_EVENT_LPM_PACKET_ARRIVAL0,
// }

// UNSUPPORTED Rust 1175:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT5_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1181:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Security")]
// pub type FWPM_NET_EVENT_CALLBACK0 = Option<unsafe extern "system" fn(context: *mut core::ffi::c_void, event: *const FWPM_NET_EVENT1)>;

// UNSUPPORTED Rust 1183:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Security")]
// pub type FWPM_NET_EVENT_CALLBACK1 = Option<unsafe extern "system" fn(context: *mut core::ffi::c_void, event: *const FWPM_NET_EVENT2)>;

// UNSUPPORTED Rust 1185:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Security")]
// pub type FWPM_NET_EVENT_CALLBACK2 = Option<unsafe extern "system" fn(context: *mut core::ffi::c_void, event: *const FWPM_NET_EVENT3)>;

// UNSUPPORTED Rust 1187:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Security")]
// pub type FWPM_NET_EVENT_CALLBACK3 = Option<unsafe extern "system" fn(context: *mut core::ffi::c_void, event: *const FWPM_NET_EVENT4)>;

// UNSUPPORTED Rust 1189:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Security")]
// pub type FWPM_NET_EVENT_CALLBACK4 = Option<unsafe extern "system" fn(context: *mut core::ffi::c_void, event: *const FWPM_NET_EVENT5)>;

// UNSUPPORTED Rust 1191:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FWPM_NET_EVENT_CAPABILITY_ALLOW0 {
//     pub networkCapabilityId: FWPM_APPC_NETWORK_CAPABILITY_TYPE,
//     pub filterId: u64,
//     pub isLoopback: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 1198:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FWPM_NET_EVENT_CAPABILITY_DROP0 {
//     pub networkCapabilityId: FWPM_APPC_NETWORK_CAPABILITY_TYPE,
//     pub filterId: u64,
//     pub isLoopback: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 1205:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FWPM_NET_EVENT_CLASSIFY_ALLOW0 {
//     pub filterId: u64,
//     pub layerId: u16,
//     pub reauthReason: u32,
//     pub originalProfile: u32,
//     pub currentProfile: u32,
//     pub msFwpDirection: u32,
//     pub isLoopback: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 1216:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FWPM_NET_EVENT_CLASSIFY_DROP0 {
//     pub filterId: u64,
//     pub layerId: u16,
// }

// UNSUPPORTED Rust 1222:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FWPM_NET_EVENT_CLASSIFY_DROP1 {
//     pub filterId: u64,
//     pub layerId: u16,
//     pub reauthReason: u32,
//     pub originalProfile: u32,
//     pub currentProfile: u32,
//     pub msFwpDirection: u32,
//     pub isLoopback: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 1233:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FWPM_NET_EVENT_CLASSIFY_DROP2 {
//     pub filterId: u64,
//     pub layerId: u16,
//     pub reauthReason: u32,
//     pub originalProfile: u32,
//     pub currentProfile: u32,
//     pub msFwpDirection: u32,
//     pub isLoopback: windows_sys::core::BOOL,
//     pub vSwitchId: FWP_BYTE_BLOB,
//     pub vSwitchSourcePort: u32,
//     pub vSwitchDestinationPort: u32,
// }

// UNSUPPORTED Rust 1247:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FWPM_NET_EVENT_CLASSIFY_DROP_MAC0 {
//     pub localMacAddr: FWP_BYTE_ARRAY6,
//     pub remoteMacAddr: FWP_BYTE_ARRAY6,
//     pub mediaType: u32,
//     pub ifType: u32,
//     pub etherType: u16,
//     pub ndisPortNumber: u32,
//     pub reserved: u32,
//     pub vlanTag: u16,
//     pub ifLuid: u64,
//     pub filterId: u64,
//     pub layerId: u16,
//     pub reauthReason: u32,
//     pub originalProfile: u32,
//     pub currentProfile: u32,
//     pub msFwpDirection: u32,
//     pub isLoopback: windows_sys::core::BOOL,
//     pub vSwitchId: FWP_BYTE_BLOB,
//     pub vSwitchSourcePort: u32,
//     pub vSwitchDestinationPort: u32,
// }

// UNSUPPORTED Rust 1270:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct FWPM_NET_EVENT_ENUM_TEMPLATE0 {
//     pub startTime: super::super::Foundation::FILETIME,
//     pub endTime: super::super::Foundation::FILETIME,
//     pub numFilterConditions: u32,
//     pub filterCondition: *mut FWPM_FILTER_CONDITION0,
// }

// UNSUPPORTED Rust 1279:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT_ENUM_TEMPLATE0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FWPM_NET_EVENT_FLAG_APP_ID_SET`: UInt = 32u;
public const val `FWPM_NET_EVENT_FLAG_EFFECTIVE_NAME_SET`: UInt = 8192u;
public const val `FWPM_NET_EVENT_FLAG_ENTERPRISE_ID_SET`: UInt = 2048u;
public const val `FWPM_NET_EVENT_FLAG_IP_PROTOCOL_SET`: UInt = 1u;
public const val `FWPM_NET_EVENT_FLAG_IP_VERSION_SET`: UInt = 256u;
public const val `FWPM_NET_EVENT_FLAG_LOCAL_ADDR_SET`: UInt = 2u;
public const val `FWPM_NET_EVENT_FLAG_LOCAL_PORT_SET`: UInt = 8u;
public const val `FWPM_NET_EVENT_FLAG_PACKAGE_ID_SET`: UInt = 1024u;
public const val `FWPM_NET_EVENT_FLAG_POLICY_FLAGS_SET`: UInt = 4096u;
public const val `FWPM_NET_EVENT_FLAG_REAUTH_REASON_SET`: UInt = 512u;
public const val `FWPM_NET_EVENT_FLAG_REMOTE_ADDR_SET`: UInt = 4u;
public const val `FWPM_NET_EVENT_FLAG_REMOTE_PORT_SET`: UInt = 16u;
public const val `FWPM_NET_EVENT_FLAG_SCOPE_ID_SET`: UInt = 128u;
public const val `FWPM_NET_EVENT_FLAG_USER_ID_SET`: UInt = 64u;
// UNSUPPORTED Rust 1299:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct FWPM_NET_EVENT_HEADER0 {
//     pub timeStamp: super::super::Foundation::FILETIME,
//     pub flags: u32,
//     pub ipVersion: FWP_IP_VERSION,
//     pub ipProtocol: u8,
//     pub Anonymous1: FWPM_NET_EVENT_HEADER0_0,
//     pub Anonymous2: FWPM_NET_EVENT_HEADER0_1,
//     pub localPort: u16,
//     pub remotePort: u16,
//     pub scopeId: u32,
//     pub appId: FWP_BYTE_BLOB,
//     pub userId: *mut super::super::Security::SID,
// }

// UNSUPPORTED Rust 1315:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT_HEADER0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1321:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub union FWPM_NET_EVENT_HEADER0_0 {
//     pub localAddrV4: u32,
//     pub localAddrV6: FWP_BYTE_ARRAY16,
// }

// UNSUPPORTED Rust 1328:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT_HEADER0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1334:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub union FWPM_NET_EVENT_HEADER0_1 {
//     pub remoteAddrV4: u32,
//     pub remoteAddrV6: FWP_BYTE_ARRAY16,
// }

// UNSUPPORTED Rust 1341:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT_HEADER0_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1347:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct FWPM_NET_EVENT_HEADER1 {
//     pub timeStamp: super::super::Foundation::FILETIME,
//     pub flags: u32,
//     pub ipVersion: FWP_IP_VERSION,
//     pub ipProtocol: u8,
//     pub Anonymous1: FWPM_NET_EVENT_HEADER1_0,
//     pub Anonymous2: FWPM_NET_EVENT_HEADER1_1,
//     pub localPort: u16,
//     pub remotePort: u16,
//     pub scopeId: u32,
//     pub appId: FWP_BYTE_BLOB,
//     pub userId: *mut super::super::Security::SID,
//     pub Anonymous3: FWPM_NET_EVENT_HEADER1_2,
// }

// UNSUPPORTED Rust 1364:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT_HEADER1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1370:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub union FWPM_NET_EVENT_HEADER1_0 {
//     pub localAddrV4: u32,
//     pub localAddrV6: FWP_BYTE_ARRAY16,
// }

// UNSUPPORTED Rust 1377:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT_HEADER1_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1383:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub union FWPM_NET_EVENT_HEADER1_1 {
//     pub remoteAddrV4: u32,
//     pub remoteAddrV6: FWP_BYTE_ARRAY16,
// }

// UNSUPPORTED Rust 1390:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT_HEADER1_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1396:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub union FWPM_NET_EVENT_HEADER1_2 {
//     pub Anonymous: FWPM_NET_EVENT_HEADER1_2_0,
// }

// UNSUPPORTED Rust 1402:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT_HEADER1_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1408:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct FWPM_NET_EVENT_HEADER1_2_0 {
//     pub reserved1: FWP_AF,
//     pub Anonymous: FWPM_NET_EVENT_HEADER1_2_0_0,
// }

// UNSUPPORTED Rust 1415:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT_HEADER1_2_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1421:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub union FWPM_NET_EVENT_HEADER1_2_0_0 {
//     pub Anonymous: FWPM_NET_EVENT_HEADER1_2_0_0_0,
// }

// UNSUPPORTED Rust 1427:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT_HEADER1_2_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1433:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy, Default)]
// pub struct FWPM_NET_EVENT_HEADER1_2_0_0_0 {
//     pub reserved2: FWP_BYTE_ARRAY6,
//     pub reserved3: FWP_BYTE_ARRAY6,
//     pub reserved4: u32,
//     pub reserved5: u32,
//     pub reserved6: u16,
//     pub reserved7: u32,
//     pub reserved8: u32,
//     pub reserved9: u16,
//     pub reserved10: u64,
// }

// UNSUPPORTED Rust 1447:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct FWPM_NET_EVENT_HEADER2 {
//     pub timeStamp: super::super::Foundation::FILETIME,
//     pub flags: u32,
//     pub ipVersion: FWP_IP_VERSION,
//     pub ipProtocol: u8,
//     pub Anonymous1: FWPM_NET_EVENT_HEADER2_0,
//     pub Anonymous2: FWPM_NET_EVENT_HEADER2_1,
//     pub localPort: u16,
//     pub remotePort: u16,
//     pub scopeId: u32,
//     pub appId: FWP_BYTE_BLOB,
//     pub userId: *mut super::super::Security::SID,
//     pub addressFamily: FWP_AF,
//     pub packageSid: *mut super::super::Security::SID,
// }

// UNSUPPORTED Rust 1465:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT_HEADER2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1471:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub union FWPM_NET_EVENT_HEADER2_0 {
//     pub localAddrV4: u32,
//     pub localAddrV6: FWP_BYTE_ARRAY16,
// }

// UNSUPPORTED Rust 1478:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT_HEADER2_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1484:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub union FWPM_NET_EVENT_HEADER2_1 {
//     pub remoteAddrV4: u32,
//     pub remoteAddrV6: FWP_BYTE_ARRAY16,
// }

// UNSUPPORTED Rust 1491:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT_HEADER2_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1497:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct FWPM_NET_EVENT_HEADER3 {
//     pub timeStamp: super::super::Foundation::FILETIME,
//     pub flags: u32,
//     pub ipVersion: FWP_IP_VERSION,
//     pub ipProtocol: u8,
//     pub Anonymous1: FWPM_NET_EVENT_HEADER3_0,
//     pub Anonymous2: FWPM_NET_EVENT_HEADER3_1,
//     pub localPort: u16,
//     pub remotePort: u16,
//     pub scopeId: u32,
//     pub appId: FWP_BYTE_BLOB,
//     pub userId: *mut super::super::Security::SID,
//     pub addressFamily: FWP_AF,
//     pub packageSid: *mut super::super::Security::SID,
//     pub enterpriseId: windows_sys::core::PWSTR,
//     pub policyFlags: u64,
//     pub effectiveName: FWP_BYTE_BLOB,
// }

// UNSUPPORTED Rust 1518:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT_HEADER3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1524:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub union FWPM_NET_EVENT_HEADER3_0 {
//     pub localAddrV4: u32,
//     pub localAddrV6: FWP_BYTE_ARRAY16,
// }

// UNSUPPORTED Rust 1531:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT_HEADER3_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1537:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub union FWPM_NET_EVENT_HEADER3_1 {
//     pub remoteAddrV4: u32,
//     pub remoteAddrV6: FWP_BYTE_ARRAY16,
// }

// UNSUPPORTED Rust 1544:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT_HEADER3_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1550:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FWPM_NET_EVENT_IKEEXT_EM_FAILURE0 {
//     pub failureErrorCode: u32,
//     pub failurePoint: IPSEC_FAILURE_POINT,
//     pub flags: u32,
//     pub emState: IKEEXT_EM_SA_STATE,
//     pub saRole: IKEEXT_SA_ROLE,
//     pub emAuthMethod: IKEEXT_AUTHENTICATION_METHOD_TYPE,
//     pub endCertHash: [u8; 20],
//     pub mmId: u64,
//     pub qmFilterId: u64,
// }

// UNSUPPORTED Rust 1563:1: declaration Impl has no candidate rule
// impl Default for FWPM_NET_EVENT_IKEEXT_EM_FAILURE0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1568:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FWPM_NET_EVENT_IKEEXT_EM_FAILURE1 {
//     pub failureErrorCode: u32,
//     pub failurePoint: IPSEC_FAILURE_POINT,
//     pub flags: u32,
//     pub emState: IKEEXT_EM_SA_STATE,
//     pub saRole: IKEEXT_SA_ROLE,
//     pub emAuthMethod: IKEEXT_AUTHENTICATION_METHOD_TYPE,
//     pub endCertHash: [u8; 20],
//     pub mmId: u64,
//     pub qmFilterId: u64,
//     pub localPrincipalNameForAuth: windows_sys::core::PWSTR,
//     pub remotePrincipalNameForAuth: windows_sys::core::PWSTR,
//     pub numLocalPrincipalGroupSids: u32,
//     pub localPrincipalGroupSids: *mut windows_sys::core::PWSTR,
//     pub numRemotePrincipalGroupSids: u32,
//     pub remotePrincipalGroupSids: *mut windows_sys::core::PWSTR,
//     pub saTrafficType: IPSEC_TRAFFIC_TYPE,
// }

// UNSUPPORTED Rust 1588:1: declaration Impl has no candidate rule
// impl Default for FWPM_NET_EVENT_IKEEXT_EM_FAILURE1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FWPM_NET_EVENT_IKEEXT_EM_FAILURE_FLAG_BENIGN`: UInt = 2u;
public const val `FWPM_NET_EVENT_IKEEXT_EM_FAILURE_FLAG_MULTIPLE`: UInt = 1u;
// UNSUPPORTED Rust 1595:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FWPM_NET_EVENT_IKEEXT_MM_FAILURE0 {
//     pub failureErrorCode: u32,
//     pub failurePoint: IPSEC_FAILURE_POINT,
//     pub flags: u32,
//     pub keyingModuleType: IKEEXT_KEY_MODULE_TYPE,
//     pub mmState: IKEEXT_MM_SA_STATE,
//     pub saRole: IKEEXT_SA_ROLE,
//     pub mmAuthMethod: IKEEXT_AUTHENTICATION_METHOD_TYPE,
//     pub endCertHash: [u8; 20],
//     pub mmId: u64,
//     pub mmFilterId: u64,
// }

// UNSUPPORTED Rust 1609:1: declaration Impl has no candidate rule
// impl Default for FWPM_NET_EVENT_IKEEXT_MM_FAILURE0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1614:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FWPM_NET_EVENT_IKEEXT_MM_FAILURE1 {
//     pub failureErrorCode: u32,
//     pub failurePoint: IPSEC_FAILURE_POINT,
//     pub flags: u32,
//     pub keyingModuleType: IKEEXT_KEY_MODULE_TYPE,
//     pub mmState: IKEEXT_MM_SA_STATE,
//     pub saRole: IKEEXT_SA_ROLE,
//     pub mmAuthMethod: IKEEXT_AUTHENTICATION_METHOD_TYPE,
//     pub endCertHash: [u8; 20],
//     pub mmId: u64,
//     pub mmFilterId: u64,
//     pub localPrincipalNameForAuth: windows_sys::core::PWSTR,
//     pub remotePrincipalNameForAuth: windows_sys::core::PWSTR,
//     pub numLocalPrincipalGroupSids: u32,
//     pub localPrincipalGroupSids: *mut windows_sys::core::PWSTR,
//     pub numRemotePrincipalGroupSids: u32,
//     pub remotePrincipalGroupSids: *mut windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 1634:1: declaration Impl has no candidate rule
// impl Default for FWPM_NET_EVENT_IKEEXT_MM_FAILURE1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1639:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FWPM_NET_EVENT_IKEEXT_MM_FAILURE2 {
//     pub failureErrorCode: u32,
//     pub failurePoint: IPSEC_FAILURE_POINT,
//     pub flags: u32,
//     pub keyingModuleType: IKEEXT_KEY_MODULE_TYPE,
//     pub mmState: IKEEXT_MM_SA_STATE,
//     pub saRole: IKEEXT_SA_ROLE,
//     pub mmAuthMethod: IKEEXT_AUTHENTICATION_METHOD_TYPE,
//     pub endCertHash: [u8; 20],
//     pub mmId: u64,
//     pub mmFilterId: u64,
//     pub localPrincipalNameForAuth: windows_sys::core::PWSTR,
//     pub remotePrincipalNameForAuth: windows_sys::core::PWSTR,
//     pub numLocalPrincipalGroupSids: u32,
//     pub localPrincipalGroupSids: *mut windows_sys::core::PWSTR,
//     pub numRemotePrincipalGroupSids: u32,
//     pub remotePrincipalGroupSids: *mut windows_sys::core::PWSTR,
//     pub providerContextKey: *mut windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 1660:1: declaration Impl has no candidate rule
// impl Default for FWPM_NET_EVENT_IKEEXT_MM_FAILURE2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FWPM_NET_EVENT_IKEEXT_MM_FAILURE_FLAG_BENIGN`: UInt = 1u;
public const val `FWPM_NET_EVENT_IKEEXT_MM_FAILURE_FLAG_MULTIPLE`: UInt = 2u;
// UNSUPPORTED Rust 1667:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct FWPM_NET_EVENT_IKEEXT_QM_FAILURE0 {
//     pub failureErrorCode: u32,
//     pub failurePoint: IPSEC_FAILURE_POINT,
//     pub keyingModuleType: IKEEXT_KEY_MODULE_TYPE,
//     pub qmState: IKEEXT_QM_SA_STATE,
//     pub saRole: IKEEXT_SA_ROLE,
//     pub saTrafficType: IPSEC_TRAFFIC_TYPE,
//     pub Anonymous1: FWPM_NET_EVENT_IKEEXT_QM_FAILURE0_0,
//     pub Anonymous2: FWPM_NET_EVENT_IKEEXT_QM_FAILURE0_1,
//     pub qmFilterId: u64,
// }

// UNSUPPORTED Rust 1681:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT_IKEEXT_QM_FAILURE0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1687:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub union FWPM_NET_EVENT_IKEEXT_QM_FAILURE0_0 {
//     pub localSubNet: FWP_CONDITION_VALUE0,
// }

// UNSUPPORTED Rust 1693:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT_IKEEXT_QM_FAILURE0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1699:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub union FWPM_NET_EVENT_IKEEXT_QM_FAILURE0_1 {
//     pub remoteSubNet: FWP_CONDITION_VALUE0,
// }

// UNSUPPORTED Rust 1705:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT_IKEEXT_QM_FAILURE0_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1711:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct FWPM_NET_EVENT_IKEEXT_QM_FAILURE1 {
//     pub failureErrorCode: u32,
//     pub failurePoint: IPSEC_FAILURE_POINT,
//     pub keyingModuleType: IKEEXT_KEY_MODULE_TYPE,
//     pub qmState: IKEEXT_QM_SA_STATE,
//     pub saRole: IKEEXT_SA_ROLE,
//     pub saTrafficType: IPSEC_TRAFFIC_TYPE,
//     pub Anonymous1: FWPM_NET_EVENT_IKEEXT_QM_FAILURE1_0,
//     pub Anonymous2: FWPM_NET_EVENT_IKEEXT_QM_FAILURE1_1,
//     pub qmFilterId: u64,
//     pub mmSaLuid: u64,
//     pub mmProviderContextKey: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 1727:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT_IKEEXT_QM_FAILURE1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1733:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub union FWPM_NET_EVENT_IKEEXT_QM_FAILURE1_0 {
//     pub localSubNet: FWP_CONDITION_VALUE0,
// }

// UNSUPPORTED Rust 1739:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT_IKEEXT_QM_FAILURE1_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1745:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub union FWPM_NET_EVENT_IKEEXT_QM_FAILURE1_1 {
//     pub remoteSubNet: FWP_CONDITION_VALUE0,
// }

// UNSUPPORTED Rust 1751:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT_IKEEXT_QM_FAILURE1_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1757:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FWPM_NET_EVENT_IPSEC_DOSP_DROP0 {
//     pub ipVersion: FWP_IP_VERSION,
//     pub Anonymous1: FWPM_NET_EVENT_IPSEC_DOSP_DROP0_0,
//     pub Anonymous2: FWPM_NET_EVENT_IPSEC_DOSP_DROP0_1,
//     pub failureStatus: i32,
//     pub direction: FWP_DIRECTION,
// }

// UNSUPPORTED Rust 1766:1: declaration Impl has no candidate rule
// impl Default for FWPM_NET_EVENT_IPSEC_DOSP_DROP0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1771:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union FWPM_NET_EVENT_IPSEC_DOSP_DROP0_0 {
//     pub publicHostV4Addr: u32,
//     pub publicHostV6Addr: [u8; 16],
// }

// UNSUPPORTED Rust 1777:1: declaration Impl has no candidate rule
// impl Default for FWPM_NET_EVENT_IPSEC_DOSP_DROP0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1782:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union FWPM_NET_EVENT_IPSEC_DOSP_DROP0_1 {
//     pub internalHostV4Addr: u32,
//     pub internalHostV6Addr: [u8; 16],
// }

// UNSUPPORTED Rust 1788:1: declaration Impl has no candidate rule
// impl Default for FWPM_NET_EVENT_IPSEC_DOSP_DROP0_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1793:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FWPM_NET_EVENT_IPSEC_KERNEL_DROP0 {
//     pub failureStatus: i32,
//     pub direction: FWP_DIRECTION,
//     pub spi: u32,
//     pub filterId: u64,
//     pub layerId: u16,
// }

public const val `FWPM_NET_EVENT_KEYWORD_CAPABILITY_ALLOW`: UInt = 8u;
public const val `FWPM_NET_EVENT_KEYWORD_CAPABILITY_DROP`: UInt = 4u;
public const val `FWPM_NET_EVENT_KEYWORD_CLASSIFY_ALLOW`: UInt = 16u;
public const val `FWPM_NET_EVENT_KEYWORD_INBOUND_BCAST`: UInt = 2u;
public const val `FWPM_NET_EVENT_KEYWORD_INBOUND_MCAST`: UInt = 1u;
public const val `FWPM_NET_EVENT_KEYWORD_PORT_SCANNING_DROP`: UInt = 32u;
// UNSUPPORTED Rust 1808:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FWPM_NET_EVENT_LPM_PACKET_ARRIVAL0 {
//     pub spi: u32,
// }

// UNSUPPORTED Rust 1813:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct FWPM_NET_EVENT_SUBSCRIPTION0 {
//     pub enumTemplate: *mut FWPM_NET_EVENT_ENUM_TEMPLATE0,
//     pub flags: u32,
//     pub sessionKey: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 1821:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_NET_EVENT_SUBSCRIPTION0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `FWPM_NET_EVENT_TYPE` = Int;
public const val `FWPM_NET_EVENT_TYPE_CAPABILITY_ALLOW`: `FWPM_NET_EVENT_TYPE` = 8;
public const val `FWPM_NET_EVENT_TYPE_CAPABILITY_DROP`: `FWPM_NET_EVENT_TYPE` = 7;
public const val `FWPM_NET_EVENT_TYPE_CLASSIFY_ALLOW`: `FWPM_NET_EVENT_TYPE` = 6;
public const val `FWPM_NET_EVENT_TYPE_CLASSIFY_DROP`: `FWPM_NET_EVENT_TYPE` = 3;
public const val `FWPM_NET_EVENT_TYPE_CLASSIFY_DROP_MAC`: `FWPM_NET_EVENT_TYPE` = 9;
public const val `FWPM_NET_EVENT_TYPE_IKEEXT_EM_FAILURE`: `FWPM_NET_EVENT_TYPE` = 2;
public const val `FWPM_NET_EVENT_TYPE_IKEEXT_MM_FAILURE`: `FWPM_NET_EVENT_TYPE` = 0;
public const val `FWPM_NET_EVENT_TYPE_IKEEXT_QM_FAILURE`: `FWPM_NET_EVENT_TYPE` = 1;
public const val `FWPM_NET_EVENT_TYPE_IPSEC_DOSP_DROP`: `FWPM_NET_EVENT_TYPE` = 5;
public const val `FWPM_NET_EVENT_TYPE_IPSEC_KERNEL_DROP`: `FWPM_NET_EVENT_TYPE` = 4;
public const val `FWPM_NET_EVENT_TYPE_LPM_PACKET_ARRIVAL`: `FWPM_NET_EVENT_TYPE` = 10;
public const val `FWPM_NET_EVENT_TYPE_MAX`: `FWPM_NET_EVENT_TYPE` = 11;
// UNSUPPORTED Rust 1840:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FWPM_PROVIDER0 {
//     pub providerKey: windows_sys::core::GUID,
//     pub displayData: FWPM_DISPLAY_DATA0,
//     pub flags: u32,
//     pub providerData: FWP_BYTE_BLOB,
//     pub serviceName: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 1849:1: declaration Impl has no candidate rule
// impl Default for FWPM_PROVIDER0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1854:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FWPM_PROVIDER_CHANGE0 {
//     pub changeType: FWPM_CHANGE_TYPE,
//     pub providerKey: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 1860:1: generic scalar type unsupported
// pub type FWPM_PROVIDER_CHANGE_CALLBACK0 = Option<unsafe extern "system" fn(context: *mut core::ffi::c_void, change: *const FWPM_PROVIDER_CHANGE0)>;

// UNSUPPORTED Rust 1861:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct FWPM_PROVIDER_CONTEXT0 {
//     pub providerContextKey: windows_sys::core::GUID,
//     pub displayData: FWPM_DISPLAY_DATA0,
//     pub flags: u32,
//     pub providerKey: *mut windows_sys::core::GUID,
//     pub providerData: FWP_BYTE_BLOB,
//     pub r#type: FWPM_PROVIDER_CONTEXT_TYPE,
//     pub Anonymous: FWPM_PROVIDER_CONTEXT0_0,
//     pub providerContextId: u64,
// }

// UNSUPPORTED Rust 1874:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_PROVIDER_CONTEXT0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1880:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub union FWPM_PROVIDER_CONTEXT0_0 {
//     pub keyingPolicy: *mut IPSEC_KEYING_POLICY0,
//     pub ikeQmTransportPolicy: *mut IPSEC_TRANSPORT_POLICY0,
//     pub ikeQmTunnelPolicy: *mut IPSEC_TUNNEL_POLICY0,
//     pub authipQmTransportPolicy: *mut IPSEC_TRANSPORT_POLICY0,
//     pub authipQmTunnelPolicy: *mut IPSEC_TUNNEL_POLICY0,
//     pub ikeMmPolicy: *mut IKEEXT_POLICY0,
//     pub authIpMmPolicy: *mut IKEEXT_POLICY0,
//     pub dataBuffer: *mut FWP_BYTE_BLOB,
//     pub classifyOptions: *mut FWPM_CLASSIFY_OPTIONS0,
// }

// UNSUPPORTED Rust 1894:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_PROVIDER_CONTEXT0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1900:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct FWPM_PROVIDER_CONTEXT1 {
//     pub providerContextKey: windows_sys::core::GUID,
//     pub displayData: FWPM_DISPLAY_DATA0,
//     pub flags: u32,
//     pub providerKey: *mut windows_sys::core::GUID,
//     pub providerData: FWP_BYTE_BLOB,
//     pub r#type: FWPM_PROVIDER_CONTEXT_TYPE,
//     pub Anonymous: FWPM_PROVIDER_CONTEXT1_0,
//     pub providerContextId: u64,
// }

// UNSUPPORTED Rust 1913:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_PROVIDER_CONTEXT1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1919:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub union FWPM_PROVIDER_CONTEXT1_0 {
//     pub keyingPolicy: *mut IPSEC_KEYING_POLICY0,
//     pub ikeQmTransportPolicy: *mut IPSEC_TRANSPORT_POLICY1,
//     pub ikeQmTunnelPolicy: *mut IPSEC_TUNNEL_POLICY1,
//     pub authipQmTransportPolicy: *mut IPSEC_TRANSPORT_POLICY1,
//     pub authipQmTunnelPolicy: *mut IPSEC_TUNNEL_POLICY1,
//     pub ikeMmPolicy: *mut IKEEXT_POLICY1,
//     pub authIpMmPolicy: *mut IKEEXT_POLICY1,
//     pub dataBuffer: *mut FWP_BYTE_BLOB,
//     pub classifyOptions: *mut FWPM_CLASSIFY_OPTIONS0,
//     pub ikeV2QmTunnelPolicy: *mut IPSEC_TUNNEL_POLICY1,
//     pub ikeV2MmPolicy: *mut IKEEXT_POLICY1,
//     pub idpOptions: *mut IPSEC_DOSP_OPTIONS0,
// }

// UNSUPPORTED Rust 1936:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_PROVIDER_CONTEXT1_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1942:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct FWPM_PROVIDER_CONTEXT2 {
//     pub providerContextKey: windows_sys::core::GUID,
//     pub displayData: FWPM_DISPLAY_DATA0,
//     pub flags: u32,
//     pub providerKey: *mut windows_sys::core::GUID,
//     pub providerData: FWP_BYTE_BLOB,
//     pub r#type: FWPM_PROVIDER_CONTEXT_TYPE,
//     pub Anonymous: FWPM_PROVIDER_CONTEXT2_0,
//     pub providerContextId: u64,
// }

// UNSUPPORTED Rust 1955:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_PROVIDER_CONTEXT2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1961:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub union FWPM_PROVIDER_CONTEXT2_0 {
//     pub keyingPolicy: *mut IPSEC_KEYING_POLICY1,
//     pub ikeQmTransportPolicy: *mut IPSEC_TRANSPORT_POLICY2,
//     pub ikeQmTunnelPolicy: *mut IPSEC_TUNNEL_POLICY2,
//     pub authipQmTransportPolicy: *mut IPSEC_TRANSPORT_POLICY2,
//     pub authipQmTunnelPolicy: *mut IPSEC_TUNNEL_POLICY2,
//     pub ikeMmPolicy: *mut IKEEXT_POLICY2,
//     pub authIpMmPolicy: *mut IKEEXT_POLICY2,
//     pub dataBuffer: *mut FWP_BYTE_BLOB,
//     pub classifyOptions: *mut FWPM_CLASSIFY_OPTIONS0,
//     pub ikeV2QmTunnelPolicy: *mut IPSEC_TUNNEL_POLICY2,
//     pub ikeV2QmTransportPolicy: *mut IPSEC_TRANSPORT_POLICY2,
//     pub ikeV2MmPolicy: *mut IKEEXT_POLICY2,
//     pub idpOptions: *mut IPSEC_DOSP_OPTIONS0,
// }

// UNSUPPORTED Rust 1979:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_PROVIDER_CONTEXT2_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1985:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct FWPM_PROVIDER_CONTEXT3 {
//     pub providerContextKey: windows_sys::core::GUID,
//     pub displayData: FWPM_DISPLAY_DATA0,
//     pub flags: u32,
//     pub providerKey: *mut windows_sys::core::GUID,
//     pub providerData: FWP_BYTE_BLOB,
//     pub r#type: FWPM_PROVIDER_CONTEXT_TYPE,
//     pub Anonymous: FWPM_PROVIDER_CONTEXT3_0,
//     pub providerContextId: u64,
// }

// UNSUPPORTED Rust 1998:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_PROVIDER_CONTEXT3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2004:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub union FWPM_PROVIDER_CONTEXT3_0 {
//     pub keyingPolicy: *mut IPSEC_KEYING_POLICY1,
//     pub ikeQmTransportPolicy: *mut IPSEC_TRANSPORT_POLICY2,
//     pub ikeQmTunnelPolicy: *mut IPSEC_TUNNEL_POLICY3,
//     pub authipQmTransportPolicy: *mut IPSEC_TRANSPORT_POLICY2,
//     pub authipQmTunnelPolicy: *mut IPSEC_TUNNEL_POLICY3,
//     pub ikeMmPolicy: *mut IKEEXT_POLICY2,
//     pub authIpMmPolicy: *mut IKEEXT_POLICY2,
//     pub dataBuffer: *mut FWP_BYTE_BLOB,
//     pub classifyOptions: *mut FWPM_CLASSIFY_OPTIONS0,
//     pub ikeV2QmTunnelPolicy: *mut IPSEC_TUNNEL_POLICY3,
//     pub ikeV2QmTransportPolicy: *mut IPSEC_TRANSPORT_POLICY2,
//     pub ikeV2MmPolicy: *mut IKEEXT_POLICY2,
//     pub idpOptions: *mut IPSEC_DOSP_OPTIONS0,
//     pub networkConnectionPolicy: *mut FWPM_NETWORK_CONNECTION_POLICY_SETTINGS0,
// }

// UNSUPPORTED Rust 2023:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_PROVIDER_CONTEXT3_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2029:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FWPM_PROVIDER_CONTEXT_CHANGE0 {
//     pub changeType: FWPM_CHANGE_TYPE,
//     pub providerContextKey: windows_sys::core::GUID,
//     pub providerContextId: u64,
// }

// UNSUPPORTED Rust 2036:1: generic scalar type unsupported
// pub type FWPM_PROVIDER_CONTEXT_CHANGE_CALLBACK0 = Option<unsafe extern "system" fn(context: *mut core::ffi::c_void, change: *const FWPM_PROVIDER_CONTEXT_CHANGE0)>;

// UNSUPPORTED Rust 2037:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FWPM_PROVIDER_CONTEXT_ENUM_TEMPLATE0 {
//     pub providerKey: *mut windows_sys::core::GUID,
//     pub providerContextType: FWPM_PROVIDER_CONTEXT_TYPE,
// }

// UNSUPPORTED Rust 2043:1: declaration Impl has no candidate rule
// impl Default for FWPM_PROVIDER_CONTEXT_ENUM_TEMPLATE0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FWPM_PROVIDER_CONTEXT_FLAG_DOWNLEVEL`: UInt = 2u;
public const val `FWPM_PROVIDER_CONTEXT_FLAG_PERSISTENT`: UInt = 1u;
// UNSUPPORTED Rust 2050:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_PROVIDER_CONTEXT_SECURE_SOCKET_AUTHIP: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb25ea800_0d02_46ed_92bd_7fa84bb73e9d);

// UNSUPPORTED Rust 2051:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_PROVIDER_CONTEXT_SECURE_SOCKET_IPSEC: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8c2d4144_f8e0_42c0_94ce_7ccfc63b2f9b);

// UNSUPPORTED Rust 2052:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FWPM_PROVIDER_CONTEXT_SUBSCRIPTION0 {
//     pub enumTemplate: *mut FWPM_PROVIDER_CONTEXT_ENUM_TEMPLATE0,
//     pub flags: FWPM_SUBSCRIPTION_FLAGS,
//     pub sessionKey: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 2059:1: declaration Impl has no candidate rule
// impl Default for FWPM_PROVIDER_CONTEXT_SUBSCRIPTION0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `FWPM_PROVIDER_CONTEXT_TYPE` = Int;
public const val `FWPM_PROVIDER_CONTEXT_TYPE_MAX`: `FWPM_PROVIDER_CONTEXT_TYPE` = 14;
// UNSUPPORTED Rust 2066:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FWPM_PROVIDER_ENUM_TEMPLATE0 {
//     pub reserved: u64,
// }

public const val `FWPM_PROVIDER_FLAG_DISABLED`: UInt = 16u;
public const val `FWPM_PROVIDER_FLAG_PERSISTENT`: UInt = 1u;
// UNSUPPORTED Rust 2073:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_PROVIDER_IKEEXT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x10ad9216_ccde_456c_8b16_e9f04e60a90b);

// UNSUPPORTED Rust 2074:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_PROVIDER_IPSEC_DOSP_CONFIG: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3c6c05a9_c05c_4bb9_8338_2327814ce8bf);

// UNSUPPORTED Rust 2075:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_PROVIDER_MPSSVC_APP_ISOLATION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3cc2631f_2d5d_43a0_b174_614837d863a1);

// UNSUPPORTED Rust 2076:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_PROVIDER_MPSSVC_EDP: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa90296f7_46b8_4457_8f84_b05e05d3c622);

// UNSUPPORTED Rust 2077:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_PROVIDER_MPSSVC_TENANT_RESTRICTIONS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd0718ff9_44da_4f50_9dc2_c963a4247613);

// UNSUPPORTED Rust 2078:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_PROVIDER_MPSSVC_WF: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdecc16ca_3f33_4346_be1e_8fb4ae0f3d62);

// UNSUPPORTED Rust 2079:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_PROVIDER_MPSSVC_WSH: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4b153735_1049_4480_aab4_d1b9bdc03710);

// UNSUPPORTED Rust 2080:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FWPM_PROVIDER_SUBSCRIPTION0 {
//     pub enumTemplate: *mut FWPM_PROVIDER_ENUM_TEMPLATE0,
//     pub flags: u32,
//     pub sessionKey: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 2087:1: declaration Impl has no candidate rule
// impl Default for FWPM_PROVIDER_SUBSCRIPTION0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2092:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_PROVIDER_TCP_CHIMNEY_OFFLOAD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x896aa19e_9a34_4bcb_ae79_beb9127c84b9);

// UNSUPPORTED Rust 2093:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_PROVIDER_TCP_TEMPLATES: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x76cfcd30_3394_432d_bed3_441ae50e63c3);

public const val `FWPM_SERVICE_RUNNING`: `FWPM_SERVICE_STATE` = 3;
public const val `FWPM_SERVICE_START_PENDING`: `FWPM_SERVICE_STATE` = 1;
public typealias `FWPM_SERVICE_STATE` = Int;
public const val `FWPM_SERVICE_STATE_MAX`: `FWPM_SERVICE_STATE` = 4;
public const val `FWPM_SERVICE_STOPPED`: `FWPM_SERVICE_STATE` = 0;
public const val `FWPM_SERVICE_STOP_PENDING`: `FWPM_SERVICE_STATE` = 2;
// UNSUPPORTED Rust 2100:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct FWPM_SESSION0 {
//     pub sessionKey: windows_sys::core::GUID,
//     pub displayData: FWPM_DISPLAY_DATA0,
//     pub flags: u32,
//     pub txnWaitTimeoutInMSec: u32,
//     pub processId: u32,
//     pub sid: *mut super::super::Security::SID,
//     pub username: windows_sys::core::PWSTR,
//     pub kernelMode: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 2113:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for FWPM_SESSION0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2119:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FWPM_SESSION_ENUM_TEMPLATE0 {
//     pub reserved: u64,
// }

public const val `FWPM_SESSION_FLAG_DYNAMIC`: UInt = 1u;
public const val `FWPM_SESSION_FLAG_RESERVED`: UInt = 268435456u;
// UNSUPPORTED Rust 2126:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FWPM_STATISTICS0 {
//     pub numLayerStatistics: u32,
//     pub layerStatistics: *mut FWPM_LAYER_STATISTICS0,
//     pub inboundAllowedConnectionsV4: u32,
//     pub inboundBlockedConnectionsV4: u32,
//     pub outboundAllowedConnectionsV4: u32,
//     pub outboundBlockedConnectionsV4: u32,
//     pub inboundAllowedConnectionsV6: u32,
//     pub inboundBlockedConnectionsV6: u32,
//     pub outboundAllowedConnectionsV6: u32,
//     pub outboundBlockedConnectionsV6: u32,
//     pub inboundActiveConnectionsV4: u32,
//     pub outboundActiveConnectionsV4: u32,
//     pub inboundActiveConnectionsV6: u32,
//     pub outboundActiveConnectionsV6: u32,
//     pub reauthDirInbound: u64,
//     pub reauthDirOutbound: u64,
//     pub reauthFamilyV4: u64,
//     pub reauthFamilyV6: u64,
//     pub reauthProtoOther: u64,
//     pub reauthProtoIPv4: u64,
//     pub reauthProtoIPv6: u64,
//     pub reauthProtoICMP: u64,
//     pub reauthProtoICMP6: u64,
//     pub reauthProtoUDP: u64,
//     pub reauthProtoTCP: u64,
//     pub reauthReasonPolicyChange: u64,
//     pub reauthReasonNewArrivalInterface: u64,
//     pub reauthReasonNewNextHopInterface: u64,
//     pub reauthReasonProfileCrossing: u64,
//     pub reauthReasonClassifyCompletion: u64,
//     pub reauthReasonIPSecPropertiesChanged: u64,
//     pub reauthReasonMidStreamInspection: u64,
//     pub reauthReasonSocketPropertyChanged: u64,
//     pub reauthReasonNewInboundMCastBCastPacket: u64,
//     pub reauthReasonEDPPolicyChanged: u64,
//     pub reauthReasonProxyHandleChanged: u64,
// }

// UNSUPPORTED Rust 2166:1: declaration Impl has no candidate rule
// impl Default for FWPM_STATISTICS0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2171:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FWPM_SUBLAYER0 {
//     pub subLayerKey: windows_sys::core::GUID,
//     pub displayData: FWPM_DISPLAY_DATA0,
//     pub flags: u32,
//     pub providerKey: *mut windows_sys::core::GUID,
//     pub providerData: FWP_BYTE_BLOB,
//     pub weight: u16,
// }

// UNSUPPORTED Rust 2181:1: declaration Impl has no candidate rule
// impl Default for FWPM_SUBLAYER0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2186:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FWPM_SUBLAYER_CHANGE0 {
//     pub changeType: FWPM_CHANGE_TYPE,
//     pub subLayerKey: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 2192:1: generic scalar type unsupported
// pub type FWPM_SUBLAYER_CHANGE_CALLBACK0 = Option<unsafe extern "system" fn(context: *mut core::ffi::c_void, change: *const FWPM_SUBLAYER_CHANGE0)>;

// UNSUPPORTED Rust 2193:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FWPM_SUBLAYER_ENUM_TEMPLATE0 {
//     pub providerKey: *mut windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 2198:1: declaration Impl has no candidate rule
// impl Default for FWPM_SUBLAYER_ENUM_TEMPLATE0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FWPM_SUBLAYER_FLAG_PERSISTENT`: UInt = 1u;
// UNSUPPORTED Rust 2204:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_SUBLAYER_INSPECTION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x877519e1_e6a9_41a5_81b4_8c4f118e4a60);

// UNSUPPORTED Rust 2205:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_SUBLAYER_IPSEC_DOSP: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe076d572_5d3d_48ef_802b_909eddb098bd);

// UNSUPPORTED Rust 2206:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_SUBLAYER_IPSEC_FORWARD_OUTBOUND_TUNNEL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa5082e73_8f71_4559_8a9a_101cea04ef87);

// UNSUPPORTED Rust 2207:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_SUBLAYER_IPSEC_SECURITY_REALM: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x37a57701_5884_4964_92b8_3e704688b0ad);

// UNSUPPORTED Rust 2208:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_SUBLAYER_IPSEC_TUNNEL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x83f299ed_9ff4_4967_aff4_c309f4dab827);

// UNSUPPORTED Rust 2209:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_SUBLAYER_LIPS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1b75c0ce_ff60_4711_a70f_b4958cc3b2d0);

// UNSUPPORTED Rust 2210:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_SUBLAYER_MPSSVC_APP_ISOLATION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xffe221c3_92a8_4564_a59f_dafb70756020);

// UNSUPPORTED Rust 2211:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_SUBLAYER_MPSSVC_EDP: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x09a47e38_fa97_471b_b123_18bcd7e65071);

// UNSUPPORTED Rust 2212:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_SUBLAYER_MPSSVC_QUARANTINE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb3cdd441_af90_41ba_a745_7c6008ff2302);

// UNSUPPORTED Rust 2213:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_SUBLAYER_MPSSVC_TENANT_RESTRICTIONS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1ec6c7e1_fdd9_478a_b55f_ff8ba1d2c17d);

// UNSUPPORTED Rust 2214:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_SUBLAYER_MPSSVC_WF: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb3cdd441_af90_41ba_a745_7c6008ff2301);

// UNSUPPORTED Rust 2215:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_SUBLAYER_MPSSVC_WSH: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb3cdd441_af90_41ba_a745_7c6008ff2300);

// UNSUPPORTED Rust 2216:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_SUBLAYER_RPC_AUDIT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x758c84f4_fb48_4de9_9aeb_3ed9551ab1fd);

// UNSUPPORTED Rust 2217:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_SUBLAYER_SECURE_SOCKET: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x15a66e17_3f3c_4f7b_aa6c_812aa613dd82);

// UNSUPPORTED Rust 2218:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FWPM_SUBLAYER_SUBSCRIPTION0 {
//     pub enumTemplate: *mut FWPM_SUBLAYER_ENUM_TEMPLATE0,
//     pub flags: FWPM_SUBSCRIPTION_FLAGS,
//     pub sessionKey: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 2225:1: declaration Impl has no candidate rule
// impl Default for FWPM_SUBLAYER_SUBSCRIPTION0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2230:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_SUBLAYER_TCP_CHIMNEY_OFFLOAD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x337608b9_b7d5_4d5f_82f9_3618618bc058);

// UNSUPPORTED Rust 2231:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_SUBLAYER_TCP_TEMPLATES: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x24421dcf_0ac5_4caa_9e14_50f6e3636af0);

// UNSUPPORTED Rust 2232:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_SUBLAYER_TEREDO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xba69dc66_5176_4979_9c89_26a7b46a8327);

// UNSUPPORTED Rust 2233:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FWPM_SUBLAYER_UNIVERSAL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xeebecc03_ced4_4380_819a_2734397b2b74);

public typealias `FWPM_SUBSCRIPTION_FLAGS` = UInt;
public const val `FWPM_SUBSCRIPTION_FLAG_NOTIFY_ON_ADD`: `FWPM_SUBSCRIPTION_FLAGS` = 1u;
public const val `FWPM_SUBSCRIPTION_FLAG_NOTIFY_ON_DELETE`: `FWPM_SUBSCRIPTION_FLAGS` = 2u;
// UNSUPPORTED Rust 2237:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FWPM_SYSTEM_PORTS0 {
//     pub numTypes: u32,
//     pub types: *mut FWPM_SYSTEM_PORTS_BY_TYPE0,
// }

// UNSUPPORTED Rust 2243:1: declaration Impl has no candidate rule
// impl Default for FWPM_SYSTEM_PORTS0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2248:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FWPM_SYSTEM_PORTS_BY_TYPE0 {
//     pub r#type: FWPM_SYSTEM_PORT_TYPE,
//     pub numPorts: u32,
//     pub ports: *mut u16,
// }

// UNSUPPORTED Rust 2255:1: declaration Impl has no candidate rule
// impl Default for FWPM_SYSTEM_PORTS_BY_TYPE0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2260:1: generic scalar type unsupported
// pub type FWPM_SYSTEM_PORTS_CALLBACK0 = Option<unsafe extern "system" fn(context: *mut core::ffi::c_void, sysports: *const FWPM_SYSTEM_PORTS0)>;

public const val `FWPM_SYSTEM_PORT_IPHTTPS_IN`: `FWPM_SYSTEM_PORT_TYPE` = 2;
public const val `FWPM_SYSTEM_PORT_IPHTTPS_OUT`: `FWPM_SYSTEM_PORT_TYPE` = 3;
public const val `FWPM_SYSTEM_PORT_RPC_EPMAP`: `FWPM_SYSTEM_PORT_TYPE` = 0;
public const val `FWPM_SYSTEM_PORT_TEREDO`: `FWPM_SYSTEM_PORT_TYPE` = 1;
public typealias `FWPM_SYSTEM_PORT_TYPE` = Int;
public const val `FWPM_SYSTEM_PORT_TYPE_MAX`: `FWPM_SYSTEM_PORT_TYPE` = 4;
public const val `FWPM_TUNNEL_FLAG_ENABLE_VIRTUAL_IF_TUNNELING`: UInt = 2u;
public const val `FWPM_TUNNEL_FLAG_POINT_TO_POINT`: UInt = 1u;
public const val `FWPM_TUNNEL_FLAG_RESERVED0`: UInt = 4u;
public const val `FWPM_TXN_READ_ONLY`: UInt = 1u;
// UNSUPPORTED Rust 2271:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FWPM_VSWITCH_EVENT0 {
//     pub eventType: FWPM_VSWITCH_EVENT_TYPE,
//     pub vSwitchId: windows_sys::core::PWSTR,
//     pub Anonymous: FWPM_VSWITCH_EVENT0_0,
// }

// UNSUPPORTED Rust 2278:1: declaration Impl has no candidate rule
// impl Default for FWPM_VSWITCH_EVENT0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2283:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union FWPM_VSWITCH_EVENT0_0 {
//     pub positionInfo: FWPM_VSWITCH_EVENT0_0_0,
//     pub reorderInfo: FWPM_VSWITCH_EVENT0_0_1,
// }

// UNSUPPORTED Rust 2289:1: declaration Impl has no candidate rule
// impl Default for FWPM_VSWITCH_EVENT0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2294:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FWPM_VSWITCH_EVENT0_0_0 {
//     pub numvSwitchFilterExtensions: u32,
//     pub vSwitchFilterExtensions: *mut windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 2300:1: declaration Impl has no candidate rule
// impl Default for FWPM_VSWITCH_EVENT0_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2305:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FWPM_VSWITCH_EVENT0_0_1 {
//     pub inRequiredPosition: windows_sys::core::BOOL,
//     pub numvSwitchFilterExtensions: u32,
//     pub vSwitchFilterExtensions: *mut windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 2312:1: declaration Impl has no candidate rule
// impl Default for FWPM_VSWITCH_EVENT0_0_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2317:1: generic scalar type unsupported
// pub type FWPM_VSWITCH_EVENT_CALLBACK0 = Option<unsafe extern "system" fn(context: *mut core::ffi::c_void, vswitchevent: *const FWPM_VSWITCH_EVENT0) -> u32>;

public const val `FWPM_VSWITCH_EVENT_DISABLED_FOR_INSPECTION`: `FWPM_VSWITCH_EVENT_TYPE` = 3;
public const val `FWPM_VSWITCH_EVENT_ENABLED_FOR_INSPECTION`: `FWPM_VSWITCH_EVENT_TYPE` = 2;
public const val `FWPM_VSWITCH_EVENT_FILTER_ADD_TO_INCOMPLETE_LAYER`: `FWPM_VSWITCH_EVENT_TYPE` = 0;
public const val `FWPM_VSWITCH_EVENT_FILTER_ENGINE_NOT_IN_REQUIRED_POSITION`: `FWPM_VSWITCH_EVENT_TYPE` = 1;
public const val `FWPM_VSWITCH_EVENT_FILTER_ENGINE_REORDER`: `FWPM_VSWITCH_EVENT_TYPE` = 4;
public const val `FWPM_VSWITCH_EVENT_MAX`: `FWPM_VSWITCH_EVENT_TYPE` = 5;
// UNSUPPORTED Rust 2324:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FWPM_VSWITCH_EVENT_SUBSCRIPTION0 {
//     pub flags: u32,
//     pub sessionKey: windows_sys::core::GUID,
// }

public typealias `FWPM_VSWITCH_EVENT_TYPE` = Int;
public const val `FWPM_WEIGHT_RANGE_IKE_EXEMPTIONS`: UInt = 12u;
public const val `FWPM_WEIGHT_RANGE_IPSEC`: UInt = 0u;
public const val `FWPS_ALE_ENDPOINT_FLAG_IPSEC_SECURED`: UInt = 1u;
public const val `FWPS_CLASSIFY_OUT_FLAG_ABSORB`: UInt = 1u;
public const val `FWPS_CLASSIFY_OUT_FLAG_ALE_FAST_CACHE_CHECK`: UInt = 8u;
public const val `FWPS_CLASSIFY_OUT_FLAG_ALE_FAST_CACHE_POSSIBLE`: UInt = 16u;
public const val `FWPS_CLASSIFY_OUT_FLAG_BUFFER_LIMIT_REACHED`: UInt = 2u;
public const val `FWPS_CLASSIFY_OUT_FLAG_NO_MORE_DATA`: UInt = 4u;
public const val `FWPS_FILTER_FLAG_CLEAR_ACTION_RIGHT`: UInt = 1u;
public const val `FWPS_FILTER_FLAG_HAS_SECURITY_REALM_PROVIDER_CONTEXT`: UInt = 8u;
public const val `FWPS_FILTER_FLAG_IPSEC_NO_ACQUIRE_INITIATE`: UInt = 32u;
public const val `FWPS_FILTER_FLAG_OR_CONDITIONS`: UInt = 4u;
public const val `FWPS_FILTER_FLAG_PERMIT_IF_CALLOUT_UNREGISTERED`: UInt = 2u;
public const val `FWPS_FILTER_FLAG_RESERVED0`: UInt = 64u;
public const val `FWPS_FILTER_FLAG_RESERVED1`: UInt = 128u;
public const val `FWPS_FILTER_FLAG_SILENT_MODE`: UInt = 16u;
public const val `FWPS_INCOMING_FLAG_ABSORB`: UInt = 4u;
public const val `FWPS_INCOMING_FLAG_CACHE_SAFE`: UInt = 1u;
public const val `FWPS_INCOMING_FLAG_CONNECTION_FAILING_INDICATION`: UInt = 8u;
public const val `FWPS_INCOMING_FLAG_ENFORCE_QUERY`: UInt = 2u;
public const val `FWPS_INCOMING_FLAG_IS_LOCAL_ONLY_FLOW`: UInt = 128u;
public const val `FWPS_INCOMING_FLAG_IS_LOOSE_SOURCE_FLOW`: UInt = 64u;
public const val `FWPS_INCOMING_FLAG_MID_STREAM_INSPECTION`: UInt = 16u;
public const val `FWPS_INCOMING_FLAG_RECLASSIFY`: UInt = 32u;
public const val `FWPS_INCOMING_FLAG_RESERVED0`: UInt = 256u;
public const val `FWPS_L2_INCOMING_FLAG_IS_RAW_IPV4_FRAMING`: UInt = 1u;
public const val `FWPS_L2_INCOMING_FLAG_IS_RAW_IPV6_FRAMING`: UInt = 2u;
public const val `FWPS_L2_INCOMING_FLAG_RECLASSIFY_MULTI_DESTINATION`: UInt = 8u;
public const val `FWPS_L2_METADATA_FIELD_ETHERNET_MAC_HEADER_SIZE`: UInt = 1u;
public const val `FWPS_L2_METADATA_FIELD_RESERVED`: UInt = 2147483648u;
public const val `FWPS_L2_METADATA_FIELD_VSWITCH_DESTINATION_PORT_ID`: UInt = 32u;
public const val `FWPS_L2_METADATA_FIELD_VSWITCH_PACKET_CONTEXT`: UInt = 16u;
public const val `FWPS_L2_METADATA_FIELD_VSWITCH_SOURCE_NIC_INDEX`: UInt = 8u;
public const val `FWPS_L2_METADATA_FIELD_VSWITCH_SOURCE_PORT_ID`: UInt = 4u;
public const val `FWPS_L2_METADATA_FIELD_WIFI_OPERATION_MODE`: UInt = 2u;
public const val `FWPS_METADATA_FIELD_ALE_CLASSIFY_REQUIRED`: UInt = 4194304u;
public const val `FWPS_METADATA_FIELD_COMPARTMENT_ID`: UInt = 2048u;
public const val `FWPS_METADATA_FIELD_COMPLETION_HANDLE`: UInt = 16384u;
public const val `FWPS_METADATA_FIELD_DESTINATION_INTERFACE_INDEX`: UInt = 512u;
public const val `FWPS_METADATA_FIELD_DESTINATION_PREFIX`: UInt = 16777216u;
public const val `FWPS_METADATA_FIELD_DISCARD_REASON`: UInt = 1u;
public const val `FWPS_METADATA_FIELD_ETHER_FRAME_LENGTH`: UInt = 33554432u;
public const val `FWPS_METADATA_FIELD_FLOW_HANDLE`: UInt = 2u;
public const val `FWPS_METADATA_FIELD_FORWARD_LAYER_INBOUND_PASS_THRU`: UInt = 2097152u;
public const val `FWPS_METADATA_FIELD_FORWARD_LAYER_OUTBOUND_PASS_THRU`: UInt = 1048576u;
public const val `FWPS_METADATA_FIELD_FRAGMENT_DATA`: UInt = 4096u;
public const val `FWPS_METADATA_FIELD_ICMP_ID_AND_SEQUENCE`: UInt = 134217728u;
public const val `FWPS_METADATA_FIELD_IP_HEADER_SIZE`: UInt = 4u;
public const val `FWPS_METADATA_FIELD_LOCAL_REDIRECT_TARGET_PID`: UInt = 268435456u;
public const val `FWPS_METADATA_FIELD_ORIGINAL_DESTINATION`: UInt = 536870912u;
public const val `FWPS_METADATA_FIELD_PACKET_DIRECTION`: UInt = 262144u;
public const val `FWPS_METADATA_FIELD_PACKET_SYSTEM_CRITICAL`: UInt = 524288u;
public const val `FWPS_METADATA_FIELD_PARENT_ENDPOINT_HANDLE`: UInt = 67108864u;
public const val `FWPS_METADATA_FIELD_PATH_MTU`: UInt = 8192u;
public const val `FWPS_METADATA_FIELD_PROCESS_ID`: UInt = 32u;
public const val `FWPS_METADATA_FIELD_PROCESS_PATH`: UInt = 8u;
public const val `FWPS_METADATA_FIELD_REDIRECT_RECORD_HANDLE`: UInt = 1073741824u;
public const val `FWPS_METADATA_FIELD_REMOTE_SCOPE_ID`: UInt = 131072u;
public const val `FWPS_METADATA_FIELD_RESERVED`: UInt = 128u;
public const val `FWPS_METADATA_FIELD_SOURCE_INTERFACE_INDEX`: UInt = 256u;
public const val `FWPS_METADATA_FIELD_SUB_PROCESS_TAG`: UInt = 2147483648u;
public const val `FWPS_METADATA_FIELD_SYSTEM_FLAGS`: UInt = 64u;
public const val `FWPS_METADATA_FIELD_TOKEN`: UInt = 16u;
public const val `FWPS_METADATA_FIELD_TRANSPORT_CONTROL_DATA`: UInt = 65536u;
public const val `FWPS_METADATA_FIELD_TRANSPORT_ENDPOINT_HANDLE`: UInt = 32768u;
public const val `FWPS_METADATA_FIELD_TRANSPORT_HEADER_INCLUDE_HEADER`: UInt = 8388608u;
public const val `FWPS_METADATA_FIELD_TRANSPORT_HEADER_SIZE`: UInt = 1024u;
public const val `FWPS_RIGHT_ACTION_WRITE`: UInt = 1u;
public const val `FWP_ACTION_BLOCK`: `FWP_ACTION_TYPE` = 4097u;
public const val `FWP_ACTION_CALLOUT_INSPECTION`: `FWP_ACTION_TYPE` = 24580u;
public const val `FWP_ACTION_CALLOUT_TERMINATING`: `FWP_ACTION_TYPE` = 20483u;
public const val `FWP_ACTION_CALLOUT_UNKNOWN`: `FWP_ACTION_TYPE` = 16389u;
public const val `FWP_ACTION_CONTINUE`: `FWP_ACTION_TYPE` = 8198u;
public const val `FWP_ACTION_FLAG_CALLOUT`: UInt = 16384u;
public const val `FWP_ACTION_FLAG_NON_TERMINATING`: UInt = 8192u;
public const val `FWP_ACTION_FLAG_TERMINATING`: UInt = 4096u;
public const val `FWP_ACTION_NONE`: `FWP_ACTION_TYPE` = 7u;
public const val `FWP_ACTION_NONE_NO_MATCH`: `FWP_ACTION_TYPE` = 8u;
public const val `FWP_ACTION_PERMIT`: `FWP_ACTION_TYPE` = 4098u;
public typealias `FWP_ACTION_TYPE` = UInt;
public const val `FWP_ACTRL_MATCH_FILTER`: UInt = 1u;
public typealias `FWP_AF` = Int;
public const val `FWP_AF_ETHER`: `FWP_AF` = 2;
public const val `FWP_AF_INET`: `FWP_AF` = 0;
public const val `FWP_AF_INET6`: `FWP_AF` = 1;
public const val `FWP_AF_NONE`: `FWP_AF` = 3;
public const val `FWP_BYTEMAP_ARRAY64_SIZE`: UInt = 8u;
// UNSUPPORTED Rust 2418:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FWP_BYTE_ARRAY16 {
//     pub byteArray16: [u8; 16],
// }

// UNSUPPORTED Rust 2423:1: declaration Impl has no candidate rule
// impl Default for FWP_BYTE_ARRAY16 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FWP_BYTE_ARRAY16_TYPE`: `FWP_DATA_TYPE` = 11;
// UNSUPPORTED Rust 2429:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FWP_BYTE_ARRAY6 {
//     pub byteArray6: [u8; 6],
// }

// UNSUPPORTED Rust 2434:1: declaration Impl has no candidate rule
// impl Default for FWP_BYTE_ARRAY6 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FWP_BYTE_ARRAY6_SIZE`: UInt = 6u;
public const val `FWP_BYTE_ARRAY6_TYPE`: `FWP_DATA_TYPE` = 18;
// UNSUPPORTED Rust 2441:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FWP_BYTE_BLOB {
//     pub size: u32,
//     pub data: *mut u8,
// }

// UNSUPPORTED Rust 2447:1: declaration Impl has no candidate rule
// impl Default for FWP_BYTE_BLOB {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FWP_BYTE_BLOB_TYPE`: `FWP_DATA_TYPE` = 12;
public const val `FWP_CALLOUT_FLAG_ALLOW_L2_BATCH_CLASSIFY`: UInt = 128u;
public const val `FWP_CALLOUT_FLAG_ALLOW_MID_STREAM_INSPECTION`: UInt = 8u;
public const val `FWP_CALLOUT_FLAG_ALLOW_OFFLOAD`: UInt = 2u;
public const val `FWP_CALLOUT_FLAG_ALLOW_RECLASSIFY`: UInt = 16u;
public const val `FWP_CALLOUT_FLAG_ALLOW_RSC`: UInt = 64u;
public const val `FWP_CALLOUT_FLAG_ALLOW_URO`: UInt = 512u;
public const val `FWP_CALLOUT_FLAG_ALLOW_USO`: UInt = 256u;
public const val `FWP_CALLOUT_FLAG_CONDITIONAL_ON_FLOW`: UInt = 1u;
public const val `FWP_CALLOUT_FLAG_ENABLE_COMMIT_ADD_NOTIFY`: UInt = 4u;
public const val `FWP_CALLOUT_FLAG_RESERVED1`: UInt = 32u;
public const val `FWP_CALLOUT_FLAG_RESERVED2`: UInt = 1024u;
public const val `FWP_CLASSIFY_OPTION_LOCAL_ONLY_MAPPING`: `FWP_CLASSIFY_OPTION_TYPE` = 7;
public const val `FWP_CLASSIFY_OPTION_LOOSE_SOURCE_MAPPING`: `FWP_CLASSIFY_OPTION_TYPE` = 1;
public const val `FWP_CLASSIFY_OPTION_MAX`: `FWP_CLASSIFY_OPTION_TYPE` = 8;
public const val `FWP_CLASSIFY_OPTION_MCAST_BCAST_LIFETIME`: `FWP_CLASSIFY_OPTION_TYPE` = 3;
public const val `FWP_CLASSIFY_OPTION_MULTICAST_STATE`: `FWP_CLASSIFY_OPTION_TYPE` = 0;
public const val `FWP_CLASSIFY_OPTION_SECURE_SOCKET_AUTHIP_MM_POLICY_KEY`: `FWP_CLASSIFY_OPTION_TYPE` = 5;
public const val `FWP_CLASSIFY_OPTION_SECURE_SOCKET_AUTHIP_QM_POLICY_KEY`: `FWP_CLASSIFY_OPTION_TYPE` = 6;
public const val `FWP_CLASSIFY_OPTION_SECURE_SOCKET_SECURITY_FLAGS`: `FWP_CLASSIFY_OPTION_TYPE` = 4;
public typealias `FWP_CLASSIFY_OPTION_TYPE` = Int;
public const val `FWP_CLASSIFY_OPTION_UNICAST_LIFETIME`: `FWP_CLASSIFY_OPTION_TYPE` = 2;
public const val `FWP_CONDITION_FLAG_IS_APPCONTAINER_LOOPBACK`: UInt = 4194304u;
public const val `FWP_CONDITION_FLAG_IS_AUTH_FW`: UInt = 65536u;
public const val `FWP_CONDITION_FLAG_IS_CONNECTION_REDIRECTED`: UInt = 1048576u;
public const val `FWP_CONDITION_FLAG_IS_FRAGMENT`: UInt = 32u;
public const val `FWP_CONDITION_FLAG_IS_FRAGMENT_GROUP`: UInt = 64u;
public const val `FWP_CONDITION_FLAG_IS_HONORING_POLICY_AUTHORIZE`: UInt = 33554432u;
public const val `FWP_CONDITION_FLAG_IS_IMPLICIT_BIND`: UInt = 512u;
public const val `FWP_CONDITION_FLAG_IS_INBOUND_PASS_THRU`: UInt = 524288u;
public const val `FWP_CONDITION_FLAG_IS_IPSEC_NATT_RECLASSIFY`: UInt = 128u;
public const val `FWP_CONDITION_FLAG_IS_IPSEC_SECURED`: UInt = 2u;
public const val `FWP_CONDITION_FLAG_IS_LOOPBACK`: UInt = 1u;
public const val `FWP_CONDITION_FLAG_IS_NAME_APP_SPECIFIED`: UInt = 16384u;
public const val `FWP_CONDITION_FLAG_IS_NON_APPCONTAINER_LOOPBACK`: UInt = 8388608u;
public const val `FWP_CONDITION_FLAG_IS_OUTBOUND_PASS_THRU`: UInt = 262144u;
public const val `FWP_CONDITION_FLAG_IS_PROMISCUOUS`: UInt = 32768u;
public const val `FWP_CONDITION_FLAG_IS_PROXY_CONNECTION`: UInt = 2097152u;
public const val `FWP_CONDITION_FLAG_IS_RAW_ENDPOINT`: UInt = 16u;
public const val `FWP_CONDITION_FLAG_IS_REASSEMBLED`: UInt = 1024u;
public const val `FWP_CONDITION_FLAG_IS_REAUTHORIZE`: UInt = 4u;
public const val `FWP_CONDITION_FLAG_IS_RECLASSIFY`: UInt = 131072u;
public const val `FWP_CONDITION_FLAG_IS_RESERVED`: UInt = 16777216u;
public const val `FWP_CONDITION_FLAG_IS_WILDCARD_BIND`: UInt = 8u;
public const val `FWP_CONDITION_FLAG_REQUIRES_ALE_CLASSIFY`: UInt = 256u;
public const val `FWP_CONDITION_L2_IF_CONNECTOR_PRESENT`: UInt = 128u;
public const val `FWP_CONDITION_L2_IS_IP_FRAGMENT_GROUP`: UInt = 64u;
public const val `FWP_CONDITION_L2_IS_MALFORMED_PACKET`: UInt = 32u;
public const val `FWP_CONDITION_L2_IS_MOBILE_BROADBAND`: UInt = 4u;
public const val `FWP_CONDITION_L2_IS_NATIVE_ETHERNET`: UInt = 1u;
public const val `FWP_CONDITION_L2_IS_VM2VM`: UInt = 16u;
public const val `FWP_CONDITION_L2_IS_WIFI`: UInt = 2u;
public const val `FWP_CONDITION_L2_IS_WIFI_DIRECT_DATA`: UInt = 8u;
public const val `FWP_CONDITION_REAUTHORIZE_REASON_CHECK_OFFLOAD`: UInt = 65536u;
public const val `FWP_CONDITION_REAUTHORIZE_REASON_CLASSIFY_COMPLETION`: UInt = 16u;
public const val `FWP_CONDITION_REAUTHORIZE_REASON_EDP_POLICY_CHANGED`: UInt = 512u;
public const val `FWP_CONDITION_REAUTHORIZE_REASON_IPSEC_PROPERTIES_CHANGED`: UInt = 32u;
public const val `FWP_CONDITION_REAUTHORIZE_REASON_MID_STREAM_INSPECTION`: UInt = 64u;
public const val `FWP_CONDITION_REAUTHORIZE_REASON_NEW_ARRIVAL_INTERFACE`: UInt = 2u;
public const val `FWP_CONDITION_REAUTHORIZE_REASON_NEW_INBOUND_MCAST_BCAST_PACKET`: UInt = 256u;
public const val `FWP_CONDITION_REAUTHORIZE_REASON_NEW_NEXTHOP_INTERFACE`: UInt = 4u;
public const val `FWP_CONDITION_REAUTHORIZE_REASON_POLICY_CHANGE`: UInt = 1u;
public const val `FWP_CONDITION_REAUTHORIZE_REASON_PROFILE_CROSSING`: UInt = 8u;
public const val `FWP_CONDITION_REAUTHORIZE_REASON_PROXY_HANDLE_CHANGED`: UInt = 16384u;
public const val `FWP_CONDITION_REAUTHORIZE_REASON_SOCKET_PROPERTY_CHANGED`: UInt = 128u;
public const val `FWP_CONDITION_SOCKET_PROPERTY_FLAG_ALLOW_EDGE_TRAFFIC`: UInt = 2u;
public const val `FWP_CONDITION_SOCKET_PROPERTY_FLAG_DENY_EDGE_TRAFFIC`: UInt = 4u;
public const val `FWP_CONDITION_SOCKET_PROPERTY_FLAG_IS_SYSTEM_PORT_RPC`: UInt = 1u;
// UNSUPPORTED Rust 2520:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct FWP_CONDITION_VALUE0 {
//     pub r#type: FWP_DATA_TYPE,
//     pub Anonymous: FWP_CONDITION_VALUE0_0,
// }

// UNSUPPORTED Rust 2527:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for FWP_CONDITION_VALUE0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2533:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub union FWP_CONDITION_VALUE0_0 {
//     pub uint8: u8,
//     pub uint16: u16,
//     pub uint32: u32,
//     pub uint64: *mut u64,
//     pub int8: i8,
//     pub int16: i16,
//     pub int32: i32,
//     pub int64: *mut i64,
//     pub float32: f32,
//     pub double64: *mut f64,
//     pub byteArray16: *mut FWP_BYTE_ARRAY16,
//     pub byteBlob: *mut FWP_BYTE_BLOB,
//     pub sid: *mut super::super::Security::SID,
//     pub sd: *mut FWP_BYTE_BLOB,
//     pub tokenInformation: *mut FWP_TOKEN_INFORMATION,
//     pub tokenAccessInformation: *mut FWP_BYTE_BLOB,
//     pub unicodeString: windows_sys::core::PWSTR,
//     pub byteArray6: *mut FWP_BYTE_ARRAY6,
//     pub v4AddrMask: *mut FWP_V4_ADDR_AND_MASK,
//     pub v6AddrMask: *mut FWP_V6_ADDR_AND_MASK,
//     pub rangeValue: *mut FWP_RANGE0,
// }

// UNSUPPORTED Rust 2559:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for FWP_CONDITION_VALUE0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `FWP_DATA_TYPE` = Int;
public const val `FWP_DATA_TYPE_MAX`: `FWP_DATA_TYPE` = 259;
public typealias `FWP_DIRECTION` = Int;
public const val `FWP_DIRECTION_INBOUND`: `FWP_DIRECTION` = 1;
public const val `FWP_DIRECTION_MAX`: `FWP_DIRECTION` = 2;
public const val `FWP_DIRECTION_OUTBOUND`: `FWP_DIRECTION` = 0;
public const val `FWP_DOUBLE`: `FWP_DATA_TYPE` = 10;
public const val `FWP_EMPTY`: `FWP_DATA_TYPE` = 0;
public typealias `FWP_ETHER_ENCAP_METHOD` = Int;
public const val `FWP_ETHER_ENCAP_METHOD_ETHER_V2`: `FWP_ETHER_ENCAP_METHOD` = 0;
public const val `FWP_ETHER_ENCAP_METHOD_SNAP`: `FWP_ETHER_ENCAP_METHOD` = 1;
public const val `FWP_ETHER_ENCAP_METHOD_SNAP_W_OUI_ZERO`: `FWP_ETHER_ENCAP_METHOD` = 3;
public const val `FWP_FILTER_ENUM_FLAG_BEST_TERMINATING_MATCH`: UInt = 1u;
public const val `FWP_FILTER_ENUM_FLAG_BOOTTIME_ONLY`: UInt = 4u;
public const val `FWP_FILTER_ENUM_FLAG_INCLUDE_BOOTTIME`: UInt = 8u;
public const val `FWP_FILTER_ENUM_FLAG_INCLUDE_DISABLED`: UInt = 16u;
public const val `FWP_FILTER_ENUM_FLAG_RESERVED1`: UInt = 32u;
public const val `FWP_FILTER_ENUM_FLAG_SORTED`: UInt = 2u;
public const val `FWP_FILTER_ENUM_FULLY_CONTAINED`: `FWP_FILTER_ENUM_TYPE` = 0;
public const val `FWP_FILTER_ENUM_OVERLAPPING`: `FWP_FILTER_ENUM_TYPE` = 1;
public typealias `FWP_FILTER_ENUM_TYPE` = Int;
public const val `FWP_FILTER_ENUM_TYPE_MAX`: `FWP_FILTER_ENUM_TYPE` = 2;
public const val `FWP_FLOAT`: `FWP_DATA_TYPE` = 9;
public const val `FWP_INT16`: `FWP_DATA_TYPE` = 6;
public const val `FWP_INT32`: `FWP_DATA_TYPE` = 7;
public const val `FWP_INT64`: `FWP_DATA_TYPE` = 8;
public const val `FWP_INT8`: `FWP_DATA_TYPE` = 5;
public typealias `FWP_IP_VERSION` = Int;
public const val `FWP_IP_VERSION_MAX`: `FWP_IP_VERSION` = 3;
public const val `FWP_IP_VERSION_NONE`: `FWP_IP_VERSION` = 2;
public const val `FWP_IP_VERSION_V4`: `FWP_IP_VERSION` = 0;
public const val `FWP_IP_VERSION_V6`: `FWP_IP_VERSION` = 1;
public const val `FWP_MATCH_EQUAL`: `FWP_MATCH_TYPE` = 0;
public const val `FWP_MATCH_EQUAL_CASE_INSENSITIVE`: `FWP_MATCH_TYPE` = 9;
public const val `FWP_MATCH_FLAGS_ALL_SET`: `FWP_MATCH_TYPE` = 6;
public const val `FWP_MATCH_FLAGS_ANY_SET`: `FWP_MATCH_TYPE` = 7;
public const val `FWP_MATCH_FLAGS_NONE_SET`: `FWP_MATCH_TYPE` = 8;
public const val `FWP_MATCH_GREATER`: `FWP_MATCH_TYPE` = 1;
public const val `FWP_MATCH_GREATER_OR_EQUAL`: `FWP_MATCH_TYPE` = 3;
public const val `FWP_MATCH_LESS`: `FWP_MATCH_TYPE` = 2;
public const val `FWP_MATCH_LESS_OR_EQUAL`: `FWP_MATCH_TYPE` = 4;
public const val `FWP_MATCH_NOT_EQUAL`: `FWP_MATCH_TYPE` = 10;
public const val `FWP_MATCH_NOT_PREFIX`: `FWP_MATCH_TYPE` = 12;
public const val `FWP_MATCH_PREFIX`: `FWP_MATCH_TYPE` = 11;
public const val `FWP_MATCH_RANGE`: `FWP_MATCH_TYPE` = 5;
public typealias `FWP_MATCH_TYPE` = Int;
public const val `FWP_MATCH_TYPE_MAX`: `FWP_MATCH_TYPE` = 13;
public const val `FWP_NETWORK_CONNECTION_POLICY_MAX`: `FWP_NETWORK_CONNECTION_POLICY_SETTING_TYPE` = 3;
public const val `FWP_NETWORK_CONNECTION_POLICY_NEXT_HOP`: `FWP_NETWORK_CONNECTION_POLICY_SETTING_TYPE` = 2;
public const val `FWP_NETWORK_CONNECTION_POLICY_NEXT_HOP_INTERFACE`: `FWP_NETWORK_CONNECTION_POLICY_SETTING_TYPE` = 1;
public typealias `FWP_NETWORK_CONNECTION_POLICY_SETTING_TYPE` = Int;
public const val `FWP_NETWORK_CONNECTION_POLICY_SOURCE_ADDRESS`: `FWP_NETWORK_CONNECTION_POLICY_SETTING_TYPE` = 0;
public const val `FWP_OPTION_VALUE_ALLOW_GLOBAL_MULTICAST_STATE`: UInt = 2u;
public const val `FWP_OPTION_VALUE_ALLOW_MULTICAST_STATE`: UInt = 0u;
public const val `FWP_OPTION_VALUE_DENY_MULTICAST_STATE`: UInt = 1u;
public const val `FWP_OPTION_VALUE_DISABLE_LOCAL_ONLY_MAPPING`: UInt = 0u;
public const val `FWP_OPTION_VALUE_DISABLE_LOOSE_SOURCE`: UInt = 0u;
public const val `FWP_OPTION_VALUE_ENABLE_LOCAL_ONLY_MAPPING`: UInt = 1u;
public const val `FWP_OPTION_VALUE_ENABLE_LOOSE_SOURCE`: UInt = 1u;
// UNSUPPORTED Rust 2624:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct FWP_RANGE0 {
//     pub valueLow: FWP_VALUE0,
//     pub valueHigh: FWP_VALUE0,
// }

// UNSUPPORTED Rust 2631:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for FWP_RANGE0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FWP_RANGE_TYPE`: `FWP_DATA_TYPE` = 258;
public const val `FWP_SECURITY_DESCRIPTOR_TYPE`: `FWP_DATA_TYPE` = 14;
public const val `FWP_SID`: `FWP_DATA_TYPE` = 13;
public const val `FWP_SINGLE_DATA_TYPE_MAX`: `FWP_DATA_TYPE` = 255;
public const val `FWP_TOKEN_ACCESS_INFORMATION_TYPE`: `FWP_DATA_TYPE` = 16;
// UNSUPPORTED Rust 2642:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct FWP_TOKEN_INFORMATION {
//     pub sidCount: u32,
//     pub sids: *mut super::super::Security::SID_AND_ATTRIBUTES,
//     pub restrictedSidCount: u32,
//     pub restrictedSids: *mut super::super::Security::SID_AND_ATTRIBUTES,
// }

// UNSUPPORTED Rust 2651:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for FWP_TOKEN_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FWP_TOKEN_INFORMATION_TYPE`: `FWP_DATA_TYPE` = 15;
public const val `FWP_UINT16`: `FWP_DATA_TYPE` = 2;
public const val `FWP_UINT32`: `FWP_DATA_TYPE` = 3;
public const val `FWP_UINT64`: `FWP_DATA_TYPE` = 4;
public const val `FWP_UINT8`: `FWP_DATA_TYPE` = 1;
public const val `FWP_UNICODE_STRING_TYPE`: `FWP_DATA_TYPE` = 17;
// UNSUPPORTED Rust 2663:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FWP_V4_ADDR_AND_MASK {
//     pub addr: u32,
//     pub mask: u32,
// }

public const val `FWP_V4_ADDR_MASK`: `FWP_DATA_TYPE` = 256;
// UNSUPPORTED Rust 2670:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FWP_V6_ADDR_AND_MASK {
//     pub addr: [u8; 16],
//     pub prefixLength: u8,
// }

// UNSUPPORTED Rust 2676:1: declaration Impl has no candidate rule
// impl Default for FWP_V6_ADDR_AND_MASK {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FWP_V6_ADDR_MASK`: `FWP_DATA_TYPE` = 257;
public const val `FWP_V6_ADDR_SIZE`: UInt = 16u;
// UNSUPPORTED Rust 2683:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct FWP_VALUE0 {
//     pub r#type: FWP_DATA_TYPE,
//     pub Anonymous: FWP_VALUE0_0,
// }

// UNSUPPORTED Rust 2690:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for FWP_VALUE0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2696:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub union FWP_VALUE0_0 {
//     pub uint8: u8,
//     pub uint16: u16,
//     pub uint32: u32,
//     pub uint64: *mut u64,
//     pub int8: i8,
//     pub int16: i16,
//     pub int32: i32,
//     pub int64: *mut i64,
//     pub float32: f32,
//     pub double64: *mut f64,
//     pub byteArray16: *mut FWP_BYTE_ARRAY16,
//     pub byteBlob: *mut FWP_BYTE_BLOB,
//     pub sid: *mut super::super::Security::SID,
//     pub sd: *mut FWP_BYTE_BLOB,
//     pub tokenInformation: *mut FWP_TOKEN_INFORMATION,
//     pub tokenAccessInformation: *mut FWP_BYTE_BLOB,
//     pub unicodeString: windows_sys::core::PWSTR,
//     pub byteArray6: *mut FWP_BYTE_ARRAY6,
// }

// UNSUPPORTED Rust 2719:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for FWP_VALUE0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `FWP_VSWITCH_NETWORK_TYPE` = Int;
public const val `FWP_VSWITCH_NETWORK_TYPE_EXTERNAL`: `FWP_VSWITCH_NETWORK_TYPE` = 3;
public const val `FWP_VSWITCH_NETWORK_TYPE_INTERNAL`: `FWP_VSWITCH_NETWORK_TYPE` = 2;
public const val `FWP_VSWITCH_NETWORK_TYPE_PRIVATE`: `FWP_VSWITCH_NETWORK_TYPE` = 1;
public const val `FWP_VSWITCH_NETWORK_TYPE_UNKNOWN`: `FWP_VSWITCH_NETWORK_TYPE` = 0;
public const val `IKEEXT_ANONYMOUS`: `IKEEXT_AUTHENTICATION_METHOD_TYPE` = 3;
public typealias `IKEEXT_AUTHENTICATION_IMPERSONATION_TYPE` = Int;
// UNSUPPORTED Rust 2732:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IKEEXT_AUTHENTICATION_METHOD0 {
//     pub authenticationMethodType: IKEEXT_AUTHENTICATION_METHOD_TYPE,
//     pub Anonymous: IKEEXT_AUTHENTICATION_METHOD0_0,
// }

// UNSUPPORTED Rust 2738:1: declaration Impl has no candidate rule
// impl Default for IKEEXT_AUTHENTICATION_METHOD0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2743:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IKEEXT_AUTHENTICATION_METHOD0_0 {
//     pub presharedKeyAuthentication: IKEEXT_PRESHARED_KEY_AUTHENTICATION0,
//     pub certificateAuthentication: IKEEXT_CERTIFICATE_AUTHENTICATION0,
//     pub kerberosAuthentication: IKEEXT_KERBEROS_AUTHENTICATION0,
//     pub ntlmV2Authentication: IKEEXT_NTLM_V2_AUTHENTICATION0,
//     pub sslAuthentication: IKEEXT_CERTIFICATE_AUTHENTICATION0,
//     pub cgaAuthentication: IKEEXT_IPV6_CGA_AUTHENTICATION0,
// }

// UNSUPPORTED Rust 2753:1: declaration Impl has no candidate rule
// impl Default for IKEEXT_AUTHENTICATION_METHOD0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2758:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IKEEXT_AUTHENTICATION_METHOD1 {
//     pub authenticationMethodType: IKEEXT_AUTHENTICATION_METHOD_TYPE,
//     pub Anonymous: IKEEXT_AUTHENTICATION_METHOD1_0,
// }

// UNSUPPORTED Rust 2764:1: declaration Impl has no candidate rule
// impl Default for IKEEXT_AUTHENTICATION_METHOD1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2769:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IKEEXT_AUTHENTICATION_METHOD1_0 {
//     pub presharedKeyAuthentication: IKEEXT_PRESHARED_KEY_AUTHENTICATION1,
//     pub certificateAuthentication: IKEEXT_CERTIFICATE_AUTHENTICATION1,
//     pub kerberosAuthentication: IKEEXT_KERBEROS_AUTHENTICATION0,
//     pub ntlmV2Authentication: IKEEXT_NTLM_V2_AUTHENTICATION0,
//     pub sslAuthentication: IKEEXT_CERTIFICATE_AUTHENTICATION1,
//     pub cgaAuthentication: IKEEXT_IPV6_CGA_AUTHENTICATION0,
//     pub eapAuthentication: IKEEXT_EAP_AUTHENTICATION0,
// }

// UNSUPPORTED Rust 2780:1: declaration Impl has no candidate rule
// impl Default for IKEEXT_AUTHENTICATION_METHOD1_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2785:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IKEEXT_AUTHENTICATION_METHOD2 {
//     pub authenticationMethodType: IKEEXT_AUTHENTICATION_METHOD_TYPE,
//     pub Anonymous: IKEEXT_AUTHENTICATION_METHOD2_0,
// }

// UNSUPPORTED Rust 2791:1: declaration Impl has no candidate rule
// impl Default for IKEEXT_AUTHENTICATION_METHOD2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2796:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IKEEXT_AUTHENTICATION_METHOD2_0 {
//     pub presharedKeyAuthentication: IKEEXT_PRESHARED_KEY_AUTHENTICATION1,
//     pub certificateAuthentication: IKEEXT_CERTIFICATE_AUTHENTICATION2,
//     pub kerberosAuthentication: IKEEXT_KERBEROS_AUTHENTICATION1,
//     pub reservedAuthentication: IKEEXT_RESERVED_AUTHENTICATION0,
//     pub ntlmV2Authentication: IKEEXT_NTLM_V2_AUTHENTICATION0,
//     pub sslAuthentication: IKEEXT_CERTIFICATE_AUTHENTICATION2,
//     pub cgaAuthentication: IKEEXT_IPV6_CGA_AUTHENTICATION0,
//     pub eapAuthentication: IKEEXT_EAP_AUTHENTICATION0,
// }

// UNSUPPORTED Rust 2808:1: declaration Impl has no candidate rule
// impl Default for IKEEXT_AUTHENTICATION_METHOD2_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `IKEEXT_AUTHENTICATION_METHOD_TYPE` = Int;
public const val `IKEEXT_AUTHENTICATION_METHOD_TYPE_MAX`: `IKEEXT_AUTHENTICATION_METHOD_TYPE` = 13;
public const val `IKEEXT_CERTIFICATE`: `IKEEXT_AUTHENTICATION_METHOD_TYPE` = 1;
// UNSUPPORTED Rust 2816:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IKEEXT_CERTIFICATE_AUTHENTICATION0 {
//     pub inboundConfigType: IKEEXT_CERT_CONFIG_TYPE,
//     pub Anonymous1: IKEEXT_CERTIFICATE_AUTHENTICATION0_0,
//     pub outboundConfigType: IKEEXT_CERT_CONFIG_TYPE,
//     pub Anonymous2: IKEEXT_CERTIFICATE_AUTHENTICATION0_1,
//     pub flags: IKEEXT_CERT_AUTH,
// }

// UNSUPPORTED Rust 2825:1: declaration Impl has no candidate rule
// impl Default for IKEEXT_CERTIFICATE_AUTHENTICATION0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2830:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IKEEXT_CERTIFICATE_AUTHENTICATION0_0 {
//     pub Anonymous: IKEEXT_CERTIFICATE_AUTHENTICATION0_0_0,
//     pub inboundEnterpriseStoreConfig: *mut IKEEXT_CERT_ROOT_CONFIG0,
//     pub inboundTrustedRootStoreConfig: *mut IKEEXT_CERT_ROOT_CONFIG0,
// }

// UNSUPPORTED Rust 2837:1: declaration Impl has no candidate rule
// impl Default for IKEEXT_CERTIFICATE_AUTHENTICATION0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2842:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IKEEXT_CERTIFICATE_AUTHENTICATION0_0_0 {
//     pub inboundRootArraySize: u32,
//     pub inboundRootArray: *mut IKEEXT_CERT_ROOT_CONFIG0,
// }

// UNSUPPORTED Rust 2848:1: declaration Impl has no candidate rule
// impl Default for IKEEXT_CERTIFICATE_AUTHENTICATION0_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2853:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IKEEXT_CERTIFICATE_AUTHENTICATION0_1 {
//     pub Anonymous: IKEEXT_CERTIFICATE_AUTHENTICATION0_1_0,
//     pub outboundEnterpriseStoreConfig: *mut IKEEXT_CERT_ROOT_CONFIG0,
//     pub outboundTrustedRootStoreConfig: *mut IKEEXT_CERT_ROOT_CONFIG0,
// }

// UNSUPPORTED Rust 2860:1: declaration Impl has no candidate rule
// impl Default for IKEEXT_CERTIFICATE_AUTHENTICATION0_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2865:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IKEEXT_CERTIFICATE_AUTHENTICATION0_1_0 {
//     pub outboundRootArraySize: u32,
//     pub outboundRootArray: *mut IKEEXT_CERT_ROOT_CONFIG0,
// }

// UNSUPPORTED Rust 2871:1: declaration Impl has no candidate rule
// impl Default for IKEEXT_CERTIFICATE_AUTHENTICATION0_1_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2876:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IKEEXT_CERTIFICATE_AUTHENTICATION1 {
//     pub inboundConfigType: IKEEXT_CERT_CONFIG_TYPE,
//     pub Anonymous1: IKEEXT_CERTIFICATE_AUTHENTICATION1_0,
//     pub outboundConfigType: IKEEXT_CERT_CONFIG_TYPE,
//     pub Anonymous2: IKEEXT_CERTIFICATE_AUTHENTICATION1_1,
//     pub flags: IKEEXT_CERT_AUTH,
//     pub localCertLocationUrl: FWP_BYTE_BLOB,
// }

// UNSUPPORTED Rust 2886:1: declaration Impl has no candidate rule
// impl Default for IKEEXT_CERTIFICATE_AUTHENTICATION1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2891:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IKEEXT_CERTIFICATE_AUTHENTICATION1_0 {
//     pub Anonymous: IKEEXT_CERTIFICATE_AUTHENTICATION1_0_0,
//     pub inboundEnterpriseStoreConfig: *mut IKEEXT_CERT_ROOT_CONFIG0,
//     pub inboundTrustedRootStoreConfig: *mut IKEEXT_CERT_ROOT_CONFIG0,
// }

// UNSUPPORTED Rust 2898:1: declaration Impl has no candidate rule
// impl Default for IKEEXT_CERTIFICATE_AUTHENTICATION1_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2903:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IKEEXT_CERTIFICATE_AUTHENTICATION1_0_0 {
//     pub inboundRootArraySize: u32,
//     pub inboundRootArray: *mut IKEEXT_CERT_ROOT_CONFIG0,
// }

// UNSUPPORTED Rust 2909:1: declaration Impl has no candidate rule
// impl Default for IKEEXT_CERTIFICATE_AUTHENTICATION1_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2914:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IKEEXT_CERTIFICATE_AUTHENTICATION1_1 {
//     pub Anonymous: IKEEXT_CERTIFICATE_AUTHENTICATION1_1_0,
//     pub outboundEnterpriseStoreConfig: *mut IKEEXT_CERT_ROOT_CONFIG0,
//     pub outboundTrustedRootStoreConfig: *mut IKEEXT_CERT_ROOT_CONFIG0,
// }

// UNSUPPORTED Rust 2921:1: declaration Impl has no candidate rule
// impl Default for IKEEXT_CERTIFICATE_AUTHENTICATION1_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2926:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IKEEXT_CERTIFICATE_AUTHENTICATION1_1_0 {
//     pub outboundRootArraySize: u32,
//     pub outboundRootArray: *mut IKEEXT_CERT_ROOT_CONFIG0,
// }

// UNSUPPORTED Rust 2932:1: declaration Impl has no candidate rule
// impl Default for IKEEXT_CERTIFICATE_AUTHENTICATION1_1_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2937:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IKEEXT_CERTIFICATE_AUTHENTICATION2 {
//     pub inboundConfigType: IKEEXT_CERT_CONFIG_TYPE,
//     pub Anonymous1: IKEEXT_CERTIFICATE_AUTHENTICATION2_0,
//     pub outboundConfigType: IKEEXT_CERT_CONFIG_TYPE,
//     pub Anonymous2: IKEEXT_CERTIFICATE_AUTHENTICATION2_1,
//     pub flags: IKEEXT_CERT_AUTH,
//     pub localCertLocationUrl: FWP_BYTE_BLOB,
// }

// UNSUPPORTED Rust 2947:1: declaration Impl has no candidate rule
// impl Default for IKEEXT_CERTIFICATE_AUTHENTICATION2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2952:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IKEEXT_CERTIFICATE_AUTHENTICATION2_0 {
//     pub Anonymous1: IKEEXT_CERTIFICATE_AUTHENTICATION2_0_0,
//     pub Anonymous2: IKEEXT_CERTIFICATE_AUTHENTICATION2_0_1,
//     pub Anonymous3: IKEEXT_CERTIFICATE_AUTHENTICATION2_0_2,
// }

// UNSUPPORTED Rust 2959:1: declaration Impl has no candidate rule
// impl Default for IKEEXT_CERTIFICATE_AUTHENTICATION2_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2964:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IKEEXT_CERTIFICATE_AUTHENTICATION2_0_0 {
//     pub inboundRootArraySize: u32,
//     pub inboundRootCriteria: *mut IKEEXT_CERTIFICATE_CRITERIA0,
// }

// UNSUPPORTED Rust 2970:1: declaration Impl has no candidate rule
// impl Default for IKEEXT_CERTIFICATE_AUTHENTICATION2_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2975:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IKEEXT_CERTIFICATE_AUTHENTICATION2_0_1 {
//     pub inboundEnterpriseStoreArraySize: u32,
//     pub inboundEnterpriseStoreCriteria: *mut IKEEXT_CERTIFICATE_CRITERIA0,
// }

// UNSUPPORTED Rust 2981:1: declaration Impl has no candidate rule
// impl Default for IKEEXT_CERTIFICATE_AUTHENTICATION2_0_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2986:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IKEEXT_CERTIFICATE_AUTHENTICATION2_0_2 {
//     pub inboundRootStoreArraySize: u32,
//     pub inboundTrustedRootStoreCriteria: *mut IKEEXT_CERTIFICATE_CRITERIA0,
// }

// UNSUPPORTED Rust 2992:1: declaration Impl has no candidate rule
// impl Default for IKEEXT_CERTIFICATE_AUTHENTICATION2_0_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2997:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IKEEXT_CERTIFICATE_AUTHENTICATION2_1 {
//     pub Anonymous1: IKEEXT_CERTIFICATE_AUTHENTICATION2_1_0,
//     pub Anonymous2: IKEEXT_CERTIFICATE_AUTHENTICATION2_1_1,
//     pub Anonymous3: IKEEXT_CERTIFICATE_AUTHENTICATION2_1_2,
// }

// UNSUPPORTED Rust 3004:1: declaration Impl has no candidate rule
// impl Default for IKEEXT_CERTIFICATE_AUTHENTICATION2_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3009:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IKEEXT_CERTIFICATE_AUTHENTICATION2_1_0 {
//     pub outboundRootArraySize: u32,
//     pub outboundRootCriteria: *mut IKEEXT_CERTIFICATE_CRITERIA0,
// }

// UNSUPPORTED Rust 3015:1: declaration Impl has no candidate rule
// impl Default for IKEEXT_CERTIFICATE_AUTHENTICATION2_1_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3020:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IKEEXT_CERTIFICATE_AUTHENTICATION2_1_1 {
//     pub outboundEnterpriseStoreArraySize: u32,
//     pub outboundEnterpriseStoreCriteria: *mut IKEEXT_CERTIFICATE_CRITERIA0,
// }

// UNSUPPORTED Rust 3026:1: declaration Impl has no candidate rule
// impl Default for IKEEXT_CERTIFICATE_AUTHENTICATION2_1_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3031:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IKEEXT_CERTIFICATE_AUTHENTICATION2_1_2 {
//     pub outboundRootStoreArraySize: u32,
//     pub outboundTrustedRootStoreCriteria: *mut IKEEXT_CERTIFICATE_CRITERIA0,
// }

// UNSUPPORTED Rust 3037:1: declaration Impl has no candidate rule
// impl Default for IKEEXT_CERTIFICATE_AUTHENTICATION2_1_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3042:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IKEEXT_CERTIFICATE_CREDENTIAL0 {
//     pub subjectName: FWP_BYTE_BLOB,
//     pub certHash: FWP_BYTE_BLOB,
//     pub flags: u32,
// }

// UNSUPPORTED Rust 3049:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IKEEXT_CERTIFICATE_CREDENTIAL1 {
//     pub subjectName: FWP_BYTE_BLOB,
//     pub certHash: FWP_BYTE_BLOB,
//     pub flags: u32,
//     pub certificate: FWP_BYTE_BLOB,
// }

// UNSUPPORTED Rust 3057:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IKEEXT_CERTIFICATE_CRITERIA0 {
//     pub certData: FWP_BYTE_BLOB,
//     pub certHash: FWP_BYTE_BLOB,
//     pub eku: *mut IKEEXT_CERT_EKUS0,
//     pub name: *mut IKEEXT_CERT_NAME0,
//     pub flags: u32,
// }

// UNSUPPORTED Rust 3066:1: declaration Impl has no candidate rule
// impl Default for IKEEXT_CERTIFICATE_CRITERIA0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IKEEXT_CERTIFICATE_ECDSA_P256`: `IKEEXT_AUTHENTICATION_METHOD_TYPE` = 7;
public const val `IKEEXT_CERTIFICATE_ECDSA_P384`: `IKEEXT_AUTHENTICATION_METHOD_TYPE` = 8;
public typealias `IKEEXT_CERT_AUTH` = UInt;
public const val `IKEEXT_CERT_AUTH_ALLOW_HTTP_CERT_LOOKUP`: `IKEEXT_CERT_AUTH` = 16u;
public const val `IKEEXT_CERT_AUTH_DISABLE_SSL_CERT_VALIDATION`: `IKEEXT_CERT_AUTH` = 8u;
public const val `IKEEXT_CERT_AUTH_ENABLE_CRL_CHECK_STRONG`: `IKEEXT_CERT_AUTH` = 4u;
public const val `IKEEXT_CERT_AUTH_FLAG_DISABLE_CRL_CHECK`: UInt = 2u;
public const val `IKEEXT_CERT_AUTH_FLAG_DISABLE_REQUEST_PAYLOAD`: UInt = 64u;
public const val `IKEEXT_CERT_AUTH_FLAG_SSL_ONE_WAY`: `IKEEXT_CERT_AUTH` = 1u;
public const val `IKEEXT_CERT_AUTH_URL_CONTAINS_BUNDLE`: `IKEEXT_CERT_AUTH` = 32u;
public const val `IKEEXT_CERT_CONFIG_ENTERPRISE_STORE`: `IKEEXT_CERT_CONFIG_TYPE` = 1;
public const val `IKEEXT_CERT_CONFIG_EXPLICIT_TRUST_LIST`: `IKEEXT_CERT_CONFIG_TYPE` = 0;
public const val `IKEEXT_CERT_CONFIG_TRUSTED_ROOT_STORE`: `IKEEXT_CERT_CONFIG_TYPE` = 2;
public typealias `IKEEXT_CERT_CONFIG_TYPE` = Int;
public const val `IKEEXT_CERT_CONFIG_TYPE_MAX`: `IKEEXT_CERT_CONFIG_TYPE` = 4;
public const val `IKEEXT_CERT_CONFIG_UNSPECIFIED`: `IKEEXT_CERT_CONFIG_TYPE` = 3;
public const val `IKEEXT_CERT_CREDENTIAL_FLAG_NAP_CERT`: UInt = 1u;
public const val `IKEEXT_CERT_CRITERIA_CN`: `IKEEXT_CERT_CRITERIA_NAME_TYPE` = 3;
public const val `IKEEXT_CERT_CRITERIA_DC`: `IKEEXT_CERT_CRITERIA_NAME_TYPE` = 6;
public const val `IKEEXT_CERT_CRITERIA_DNS`: `IKEEXT_CERT_CRITERIA_NAME_TYPE` = 0;
public typealias `IKEEXT_CERT_CRITERIA_NAME_TYPE` = Int;
public const val `IKEEXT_CERT_CRITERIA_NAME_TYPE_MAX`: `IKEEXT_CERT_CRITERIA_NAME_TYPE` = 7;
public const val `IKEEXT_CERT_CRITERIA_O`: `IKEEXT_CERT_CRITERIA_NAME_TYPE` = 5;
public const val `IKEEXT_CERT_CRITERIA_OU`: `IKEEXT_CERT_CRITERIA_NAME_TYPE` = 4;
public const val `IKEEXT_CERT_CRITERIA_RFC822`: `IKEEXT_CERT_CRITERIA_NAME_TYPE` = 2;
public const val `IKEEXT_CERT_CRITERIA_UPN`: `IKEEXT_CERT_CRITERIA_NAME_TYPE` = 1;
// UNSUPPORTED Rust 3097:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IKEEXT_CERT_EKUS0 {
//     pub numEku: u32,
//     pub eku: *mut windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 3103:1: declaration Impl has no candidate rule
// impl Default for IKEEXT_CERT_EKUS0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `IKEEXT_CERT_FLAGS` = UInt;
public const val `IKEEXT_CERT_FLAG_DISABLE_REQUEST_PAYLOAD`: `IKEEXT_CERT_FLAGS` = 2u;
public const val `IKEEXT_CERT_FLAG_ENABLE_ACCOUNT_MAPPING`: `IKEEXT_CERT_FLAGS` = 1u;
public const val `IKEEXT_CERT_FLAG_FOLLOW_RENEWAL_CERTIFICATE`: `IKEEXT_CERT_FLAGS` = 256u;
public const val `IKEEXT_CERT_FLAG_IGNORE_INIT_CERT_MAP_FAILURE`: `IKEEXT_CERT_FLAGS` = 16u;
public const val `IKEEXT_CERT_FLAG_INTERMEDIATE_CA`: `IKEEXT_CERT_FLAGS` = 8u;
public const val `IKEEXT_CERT_FLAG_PREFER_NAP_CERTIFICATE_OUTBOUND`: `IKEEXT_CERT_FLAGS` = 32u;
public const val `IKEEXT_CERT_FLAG_SELECT_NAP_CERTIFICATE`: `IKEEXT_CERT_FLAGS` = 64u;
public const val `IKEEXT_CERT_FLAG_USE_NAP_CERTIFICATE`: `IKEEXT_CERT_FLAGS` = 4u;
public const val `IKEEXT_CERT_FLAG_VERIFY_NAP_CERTIFICATE`: `IKEEXT_CERT_FLAGS` = 128u;
public const val `IKEEXT_CERT_HASH_LEN`: UInt = 20u;
// UNSUPPORTED Rust 3119:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IKEEXT_CERT_NAME0 {
//     pub nameType: IKEEXT_CERT_CRITERIA_NAME_TYPE,
//     pub certName: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 3125:1: declaration Impl has no candidate rule
// impl Default for IKEEXT_CERT_NAME0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3130:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IKEEXT_CERT_ROOT_CONFIG0 {
//     pub certData: FWP_BYTE_BLOB,
//     pub flags: IKEEXT_CERT_FLAGS,
// }

public const val `IKEEXT_CIPHER_3DES`: `IKEEXT_CIPHER_TYPE` = 1;
public const val `IKEEXT_CIPHER_AES_128`: `IKEEXT_CIPHER_TYPE` = 2;
public const val `IKEEXT_CIPHER_AES_192`: `IKEEXT_CIPHER_TYPE` = 3;
public const val `IKEEXT_CIPHER_AES_256`: `IKEEXT_CIPHER_TYPE` = 4;
public const val `IKEEXT_CIPHER_AES_GCM_128_16ICV`: `IKEEXT_CIPHER_TYPE` = 5;
public const val `IKEEXT_CIPHER_AES_GCM_256_16ICV`: `IKEEXT_CIPHER_TYPE` = 6;
// UNSUPPORTED Rust 3142:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IKEEXT_CIPHER_ALGORITHM0 {
//     pub algoIdentifier: IKEEXT_CIPHER_TYPE,
//     pub keyLen: u32,
//     pub rounds: u32,
// }

public const val `IKEEXT_CIPHER_DES`: `IKEEXT_CIPHER_TYPE` = 0;
public typealias `IKEEXT_CIPHER_TYPE` = Int;
public const val `IKEEXT_CIPHER_TYPE_MAX`: `IKEEXT_CIPHER_TYPE` = 7;
// UNSUPPORTED Rust 3152:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IKEEXT_COMMON_STATISTICS0 {
//     pub v4Statistics: IKEEXT_IP_VERSION_SPECIFIC_COMMON_STATISTICS0,
//     pub v6Statistics: IKEEXT_IP_VERSION_SPECIFIC_COMMON_STATISTICS0,
//     pub totalPacketsReceived: u32,
//     pub totalInvalidPacketsReceived: u32,
//     pub currentQueuedWorkitems: u32,
// }

// UNSUPPORTED Rust 3161:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IKEEXT_COMMON_STATISTICS1 {
//     pub v4Statistics: IKEEXT_IP_VERSION_SPECIFIC_COMMON_STATISTICS1,
//     pub v6Statistics: IKEEXT_IP_VERSION_SPECIFIC_COMMON_STATISTICS1,
//     pub totalPacketsReceived: u32,
//     pub totalInvalidPacketsReceived: u32,
//     pub currentQueuedWorkitems: u32,
// }

// UNSUPPORTED Rust 3170:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IKEEXT_COOKIE_PAIR0 {
//     pub initiator: u64,
//     pub responder: u64,
// }

// UNSUPPORTED Rust 3176:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IKEEXT_CREDENTIAL0 {
//     pub authenticationMethodType: IKEEXT_AUTHENTICATION_METHOD_TYPE,
//     pub impersonationType: IKEEXT_AUTHENTICATION_IMPERSONATION_TYPE,
//     pub Anonymous: IKEEXT_CREDENTIAL0_0,
// }

// UNSUPPORTED Rust 3183:1: declaration Impl has no candidate rule
// impl Default for IKEEXT_CREDENTIAL0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3188:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IKEEXT_CREDENTIAL0_0 {
//     pub presharedKey: *mut IKEEXT_PRESHARED_KEY_AUTHENTICATION0,
//     pub certificate: *mut IKEEXT_CERTIFICATE_CREDENTIAL0,
//     pub name: *mut IKEEXT_NAME_CREDENTIAL0,
// }

// UNSUPPORTED Rust 3195:1: declaration Impl has no candidate rule
// impl Default for IKEEXT_CREDENTIAL0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3200:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IKEEXT_CREDENTIAL1 {
//     pub authenticationMethodType: IKEEXT_AUTHENTICATION_METHOD_TYPE,
//     pub impersonationType: IKEEXT_AUTHENTICATION_IMPERSONATION_TYPE,
//     pub Anonymous: IKEEXT_CREDENTIAL1_0,
// }

// UNSUPPORTED Rust 3207:1: declaration Impl has no candidate rule
// impl Default for IKEEXT_CREDENTIAL1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3212:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IKEEXT_CREDENTIAL1_0 {
//     pub presharedKey: *mut IKEEXT_PRESHARED_KEY_AUTHENTICATION1,
//     pub certificate: *mut IKEEXT_CERTIFICATE_CREDENTIAL1,
//     pub name: *mut IKEEXT_NAME_CREDENTIAL0,
// }

// UNSUPPORTED Rust 3219:1: declaration Impl has no candidate rule
// impl Default for IKEEXT_CREDENTIAL1_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3224:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IKEEXT_CREDENTIAL2 {
//     pub authenticationMethodType: IKEEXT_AUTHENTICATION_METHOD_TYPE,
//     pub impersonationType: IKEEXT_AUTHENTICATION_IMPERSONATION_TYPE,
//     pub Anonymous: IKEEXT_CREDENTIAL2_0,
// }

// UNSUPPORTED Rust 3231:1: declaration Impl has no candidate rule
// impl Default for IKEEXT_CREDENTIAL2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3236:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IKEEXT_CREDENTIAL2_0 {
//     pub presharedKey: *mut IKEEXT_PRESHARED_KEY_AUTHENTICATION1,
//     pub certificate: *mut IKEEXT_CERTIFICATE_CREDENTIAL1,
//     pub name: *mut IKEEXT_NAME_CREDENTIAL0,
// }

// UNSUPPORTED Rust 3243:1: declaration Impl has no candidate rule
// impl Default for IKEEXT_CREDENTIAL2_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3248:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IKEEXT_CREDENTIALS0 {
//     pub numCredentials: u32,
//     pub credentials: *mut IKEEXT_CREDENTIAL_PAIR0,
// }

// UNSUPPORTED Rust 3254:1: declaration Impl has no candidate rule
// impl Default for IKEEXT_CREDENTIALS0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3259:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IKEEXT_CREDENTIALS1 {
//     pub numCredentials: u32,
//     pub credentials: *mut IKEEXT_CREDENTIAL_PAIR1,
// }

// UNSUPPORTED Rust 3265:1: declaration Impl has no candidate rule
// impl Default for IKEEXT_CREDENTIALS1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3270:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IKEEXT_CREDENTIALS2 {
//     pub numCredentials: u32,
//     pub credentials: *mut IKEEXT_CREDENTIAL_PAIR2,
// }

// UNSUPPORTED Rust 3276:1: declaration Impl has no candidate rule
// impl Default for IKEEXT_CREDENTIALS2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3281:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IKEEXT_CREDENTIAL_PAIR0 {
//     pub localCredentials: IKEEXT_CREDENTIAL0,
//     pub peerCredentials: IKEEXT_CREDENTIAL0,
// }

// UNSUPPORTED Rust 3287:1: declaration Impl has no candidate rule
// impl Default for IKEEXT_CREDENTIAL_PAIR0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3292:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IKEEXT_CREDENTIAL_PAIR1 {
//     pub localCredentials: IKEEXT_CREDENTIAL1,
//     pub peerCredentials: IKEEXT_CREDENTIAL1,
// }

// UNSUPPORTED Rust 3298:1: declaration Impl has no candidate rule
// impl Default for IKEEXT_CREDENTIAL_PAIR1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3303:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IKEEXT_CREDENTIAL_PAIR2 {
//     pub localCredentials: IKEEXT_CREDENTIAL2,
//     pub peerCredentials: IKEEXT_CREDENTIAL2,
// }

// UNSUPPORTED Rust 3309:1: declaration Impl has no candidate rule
// impl Default for IKEEXT_CREDENTIAL_PAIR2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IKEEXT_DH_ECP_256`: `IKEEXT_DH_GROUP` = 4;
public const val `IKEEXT_DH_ECP_384`: `IKEEXT_DH_GROUP` = 5;
public typealias `IKEEXT_DH_GROUP` = Int;
public const val `IKEEXT_DH_GROUP_1`: `IKEEXT_DH_GROUP` = 1;
public const val `IKEEXT_DH_GROUP_14`: `IKEEXT_DH_GROUP` = 3;
public const val `IKEEXT_DH_GROUP_2`: `IKEEXT_DH_GROUP` = 2;
public const val `IKEEXT_DH_GROUP_2048`: `IKEEXT_DH_GROUP` = 3;
public const val `IKEEXT_DH_GROUP_24`: `IKEEXT_DH_GROUP` = 6;
public const val `IKEEXT_DH_GROUP_MAX`: `IKEEXT_DH_GROUP` = 7;
public const val `IKEEXT_DH_GROUP_NONE`: `IKEEXT_DH_GROUP` = 0;
public const val `IKEEXT_EAP`: `IKEEXT_AUTHENTICATION_METHOD_TYPE` = 11;
// UNSUPPORTED Rust 3325:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IKEEXT_EAP_AUTHENTICATION0 {
//     pub flags: IKEEXT_EAP_AUTHENTICATION_FLAGS,
// }

public typealias `IKEEXT_EAP_AUTHENTICATION_FLAGS` = UInt;
public const val `IKEEXT_EAP_FLAG_LOCAL_AUTH_ONLY`: `IKEEXT_EAP_AUTHENTICATION_FLAGS` = 1u;
public const val `IKEEXT_EAP_FLAG_REMOTE_AUTH_ONLY`: `IKEEXT_EAP_AUTHENTICATION_FLAGS` = 2u;
// UNSUPPORTED Rust 3333:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IKEEXT_EM_POLICY0 {
//     pub numAuthenticationMethods: u32,
//     pub authenticationMethods: *mut IKEEXT_AUTHENTICATION_METHOD0,
//     pub initiatorImpersonationType: IKEEXT_AUTHENTICATION_IMPERSONATION_TYPE,
// }

// UNSUPPORTED Rust 3340:1: declaration Impl has no candidate rule
// impl Default for IKEEXT_EM_POLICY0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3345:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IKEEXT_EM_POLICY1 {
//     pub numAuthenticationMethods: u32,
//     pub authenticationMethods: *mut IKEEXT_AUTHENTICATION_METHOD1,
//     pub initiatorImpersonationType: IKEEXT_AUTHENTICATION_IMPERSONATION_TYPE,
// }

// UNSUPPORTED Rust 3352:1: declaration Impl has no candidate rule
// impl Default for IKEEXT_EM_POLICY1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3357:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IKEEXT_EM_POLICY2 {
//     pub numAuthenticationMethods: u32,
//     pub authenticationMethods: *mut IKEEXT_AUTHENTICATION_METHOD2,
//     pub initiatorImpersonationType: IKEEXT_AUTHENTICATION_IMPERSONATION_TYPE,
// }

// UNSUPPORTED Rust 3364:1: declaration Impl has no candidate rule
// impl Default for IKEEXT_EM_POLICY2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `IKEEXT_EM_SA_STATE` = Int;
public const val `IKEEXT_EM_SA_STATE_AUTH_COMPLETE`: `IKEEXT_EM_SA_STATE` = 3;
public const val `IKEEXT_EM_SA_STATE_COMPLETE`: `IKEEXT_EM_SA_STATE` = 5;
public const val `IKEEXT_EM_SA_STATE_FINAL`: `IKEEXT_EM_SA_STATE` = 4;
public const val `IKEEXT_EM_SA_STATE_MAX`: `IKEEXT_EM_SA_STATE` = 6;
public const val `IKEEXT_EM_SA_STATE_NONE`: `IKEEXT_EM_SA_STATE` = 0;
public const val `IKEEXT_EM_SA_STATE_SENT_ATTS`: `IKEEXT_EM_SA_STATE` = 1;
public const val `IKEEXT_EM_SA_STATE_SSPI_SENT`: `IKEEXT_EM_SA_STATE` = 2;
public const val `IKEEXT_IMPERSONATION_MAX`: `IKEEXT_AUTHENTICATION_IMPERSONATION_TYPE` = 2;
public const val `IKEEXT_IMPERSONATION_NONE`: `IKEEXT_AUTHENTICATION_IMPERSONATION_TYPE` = 0;
public const val `IKEEXT_IMPERSONATION_SOCKET_PRINCIPAL`: `IKEEXT_AUTHENTICATION_IMPERSONATION_TYPE` = 1;
// UNSUPPORTED Rust 3380:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IKEEXT_INTEGRITY_ALGORITHM0 {
//     pub algoIdentifier: IKEEXT_INTEGRITY_TYPE,
// }

public const val `IKEEXT_INTEGRITY_MD5`: `IKEEXT_INTEGRITY_TYPE` = 0;
public const val `IKEEXT_INTEGRITY_SHA1`: `IKEEXT_INTEGRITY_TYPE` = 1;
public const val `IKEEXT_INTEGRITY_SHA_256`: `IKEEXT_INTEGRITY_TYPE` = 2;
public const val `IKEEXT_INTEGRITY_SHA_384`: `IKEEXT_INTEGRITY_TYPE` = 3;
public typealias `IKEEXT_INTEGRITY_TYPE` = Int;
public const val `IKEEXT_INTEGRITY_TYPE_MAX`: `IKEEXT_INTEGRITY_TYPE` = 4;
public const val `IKEEXT_IPV6_CGA`: `IKEEXT_AUTHENTICATION_METHOD_TYPE` = 6;
// UNSUPPORTED Rust 3392:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IKEEXT_IPV6_CGA_AUTHENTICATION0 {
//     pub keyContainerName: windows_sys::core::PWSTR,
//     pub cspName: windows_sys::core::PWSTR,
//     pub cspType: u32,
//     pub cgaModifier: FWP_BYTE_ARRAY16,
//     pub cgaCollisionCount: u8,
// }

// UNSUPPORTED Rust 3401:1: declaration Impl has no candidate rule
// impl Default for IKEEXT_IPV6_CGA_AUTHENTICATION0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3406:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IKEEXT_IP_VERSION_SPECIFIC_COMMON_STATISTICS0 {
//     pub totalSocketReceiveFailures: u32,
//     pub totalSocketSendFailures: u32,
// }

// UNSUPPORTED Rust 3412:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IKEEXT_IP_VERSION_SPECIFIC_COMMON_STATISTICS1 {
//     pub totalSocketReceiveFailures: u32,
//     pub totalSocketSendFailures: u32,
// }

// UNSUPPORTED Rust 3418:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IKEEXT_IP_VERSION_SPECIFIC_KEYMODULE_STATISTICS0 {
//     pub currentActiveMainModes: u32,
//     pub totalMainModesStarted: u32,
//     pub totalSuccessfulMainModes: u32,
//     pub totalFailedMainModes: u32,
//     pub totalResponderMainModes: u32,
//     pub currentNewResponderMainModes: u32,
//     pub currentActiveQuickModes: u32,
//     pub totalQuickModesStarted: u32,
//     pub totalSuccessfulQuickModes: u32,
//     pub totalFailedQuickModes: u32,
//     pub totalAcquires: u32,
//     pub totalReinitAcquires: u32,
//     pub currentActiveExtendedModes: u32,
//     pub totalExtendedModesStarted: u32,
//     pub totalSuccessfulExtendedModes: u32,
//     pub totalFailedExtendedModes: u32,
//     pub totalImpersonationExtendedModes: u32,
//     pub totalImpersonationMainModes: u32,
// }

// UNSUPPORTED Rust 3440:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IKEEXT_IP_VERSION_SPECIFIC_KEYMODULE_STATISTICS1 {
//     pub currentActiveMainModes: u32,
//     pub totalMainModesStarted: u32,
//     pub totalSuccessfulMainModes: u32,
//     pub totalFailedMainModes: u32,
//     pub totalResponderMainModes: u32,
//     pub currentNewResponderMainModes: u32,
//     pub currentActiveQuickModes: u32,
//     pub totalQuickModesStarted: u32,
//     pub totalSuccessfulQuickModes: u32,
//     pub totalFailedQuickModes: u32,
//     pub totalAcquires: u32,
//     pub totalReinitAcquires: u32,
//     pub currentActiveExtendedModes: u32,
//     pub totalExtendedModesStarted: u32,
//     pub totalSuccessfulExtendedModes: u32,
//     pub totalFailedExtendedModes: u32,
//     pub totalImpersonationExtendedModes: u32,
//     pub totalImpersonationMainModes: u32,
// }

public const val `IKEEXT_KERBEROS`: `IKEEXT_AUTHENTICATION_METHOD_TYPE` = 2;
// UNSUPPORTED Rust 3463:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IKEEXT_KERBEROS_AUTHENTICATION0 {
//     pub flags: IKEEXT_KERBEROS_AUTHENTICATION_FLAGS,
// }

// UNSUPPORTED Rust 3468:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IKEEXT_KERBEROS_AUTHENTICATION1 {
//     pub flags: IKEEXT_KERBEROS_AUTHENTICATION_FLAGS,
//     pub proxyServer: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 3474:1: declaration Impl has no candidate rule
// impl Default for IKEEXT_KERBEROS_AUTHENTICATION1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `IKEEXT_KERBEROS_AUTHENTICATION_FLAGS` = UInt;
public const val `IKEEXT_KERB_AUTH_DISABLE_INITIATOR_TOKEN_GENERATION`: `IKEEXT_KERBEROS_AUTHENTICATION_FLAGS` = 1u;
public const val `IKEEXT_KERB_AUTH_DONT_ACCEPT_EXPLICIT_CREDENTIALS`: `IKEEXT_KERBEROS_AUTHENTICATION_FLAGS` = 2u;
public const val `IKEEXT_KERB_AUTH_FORCE_PROXY_ON_INITIATOR`: UInt = 4u;
// UNSUPPORTED Rust 3483:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IKEEXT_KEYMODULE_STATISTICS0 {
//     pub v4Statistics: IKEEXT_IP_VERSION_SPECIFIC_KEYMODULE_STATISTICS0,
//     pub v6Statistics: IKEEXT_IP_VERSION_SPECIFIC_KEYMODULE_STATISTICS0,
//     pub errorFrequencyTable: [u32; 97],
//     pub mainModeNegotiationTime: u32,
//     pub quickModeNegotiationTime: u32,
//     pub extendedModeNegotiationTime: u32,
// }

// UNSUPPORTED Rust 3493:1: declaration Impl has no candidate rule
// impl Default for IKEEXT_KEYMODULE_STATISTICS0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3498:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IKEEXT_KEYMODULE_STATISTICS1 {
//     pub v4Statistics: IKEEXT_IP_VERSION_SPECIFIC_KEYMODULE_STATISTICS1,
//     pub v6Statistics: IKEEXT_IP_VERSION_SPECIFIC_KEYMODULE_STATISTICS1,
//     pub errorFrequencyTable: [u32; 97],
//     pub mainModeNegotiationTime: u32,
//     pub quickModeNegotiationTime: u32,
//     pub extendedModeNegotiationTime: u32,
// }

// UNSUPPORTED Rust 3508:1: declaration Impl has no candidate rule
// impl Default for IKEEXT_KEYMODULE_STATISTICS1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IKEEXT_KEY_MODULE_AUTHIP`: `IKEEXT_KEY_MODULE_TYPE` = 1;
public const val `IKEEXT_KEY_MODULE_IKE`: `IKEEXT_KEY_MODULE_TYPE` = 0;
public const val `IKEEXT_KEY_MODULE_IKEV2`: `IKEEXT_KEY_MODULE_TYPE` = 2;
public const val `IKEEXT_KEY_MODULE_MAX`: `IKEEXT_KEY_MODULE_TYPE` = 3;
public typealias `IKEEXT_KEY_MODULE_TYPE` = Int;
public typealias `IKEEXT_MM_SA_STATE` = Int;
public const val `IKEEXT_MM_SA_STATE_COMPLETE`: `IKEEXT_MM_SA_STATE` = 5;
public const val `IKEEXT_MM_SA_STATE_FINAL`: `IKEEXT_MM_SA_STATE` = 3;
public const val `IKEEXT_MM_SA_STATE_FINAL_SENT`: `IKEEXT_MM_SA_STATE` = 4;
public const val `IKEEXT_MM_SA_STATE_MAX`: `IKEEXT_MM_SA_STATE` = 6;
public const val `IKEEXT_MM_SA_STATE_NONE`: `IKEEXT_MM_SA_STATE` = 0;
public const val `IKEEXT_MM_SA_STATE_SA_SENT`: `IKEEXT_MM_SA_STATE` = 1;
public const val `IKEEXT_MM_SA_STATE_SSPI_SENT`: `IKEEXT_MM_SA_STATE` = 2;
// UNSUPPORTED Rust 3526:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IKEEXT_NAME_CREDENTIAL0 {
//     pub principalName: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 3531:1: declaration Impl has no candidate rule
// impl Default for IKEEXT_NAME_CREDENTIAL0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IKEEXT_NTLM_V2`: `IKEEXT_AUTHENTICATION_METHOD_TYPE` = 5;
// UNSUPPORTED Rust 3537:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IKEEXT_NTLM_V2_AUTHENTICATION0 {
//     pub flags: u32,
// }

public const val `IKEEXT_NTLM_V2_AUTH_DONT_ACCEPT_EXPLICIT_CREDENTIALS`: UInt = 1u;
// UNSUPPORTED Rust 3543:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IKEEXT_POLICY0 {
//     pub softExpirationTime: u32,
//     pub numAuthenticationMethods: u32,
//     pub authenticationMethods: *mut IKEEXT_AUTHENTICATION_METHOD0,
//     pub initiatorImpersonationType: IKEEXT_AUTHENTICATION_IMPERSONATION_TYPE,
//     pub numIkeProposals: u32,
//     pub ikeProposals: *mut IKEEXT_PROPOSAL0,
//     pub flags: IKEEXT_POLICY_FLAG,
//     pub maxDynamicFilters: u32,
// }

// UNSUPPORTED Rust 3555:1: declaration Impl has no candidate rule
// impl Default for IKEEXT_POLICY0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3560:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IKEEXT_POLICY1 {
//     pub softExpirationTime: u32,
//     pub numAuthenticationMethods: u32,
//     pub authenticationMethods: *mut IKEEXT_AUTHENTICATION_METHOD1,
//     pub initiatorImpersonationType: IKEEXT_AUTHENTICATION_IMPERSONATION_TYPE,
//     pub numIkeProposals: u32,
//     pub ikeProposals: *mut IKEEXT_PROPOSAL0,
//     pub flags: IKEEXT_POLICY_FLAG,
//     pub maxDynamicFilters: u32,
//     pub retransmitDurationSecs: u32,
// }

// UNSUPPORTED Rust 3573:1: declaration Impl has no candidate rule
// impl Default for IKEEXT_POLICY1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3578:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IKEEXT_POLICY2 {
//     pub softExpirationTime: u32,
//     pub numAuthenticationMethods: u32,
//     pub authenticationMethods: *mut IKEEXT_AUTHENTICATION_METHOD2,
//     pub initiatorImpersonationType: IKEEXT_AUTHENTICATION_IMPERSONATION_TYPE,
//     pub numIkeProposals: u32,
//     pub ikeProposals: *mut IKEEXT_PROPOSAL0,
//     pub flags: IKEEXT_POLICY_FLAG,
//     pub maxDynamicFilters: u32,
//     pub retransmitDurationSecs: u32,
// }

// UNSUPPORTED Rust 3591:1: declaration Impl has no candidate rule
// impl Default for IKEEXT_POLICY2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IKEEXT_POLICY_ENABLE_IKEV2_FRAGMENTATION`: UInt = 128u;
public typealias `IKEEXT_POLICY_FLAG` = UInt;
public const val `IKEEXT_POLICY_FLAG_DISABLE_DIAGNOSTICS`: `IKEEXT_POLICY_FLAG` = 1u;
public const val `IKEEXT_POLICY_FLAG_ENABLE_OPTIONAL_DH`: `IKEEXT_POLICY_FLAG` = 8u;
public const val `IKEEXT_POLICY_FLAG_IMS_VPN`: UInt = 64u;
public const val `IKEEXT_POLICY_FLAG_MOBIKE_NOT_SUPPORTED`: UInt = 16u;
public const val `IKEEXT_POLICY_FLAG_NO_IMPERSONATION_LUID_VERIFY`: `IKEEXT_POLICY_FLAG` = 4u;
public const val `IKEEXT_POLICY_FLAG_NO_MACHINE_LUID_VERIFY`: `IKEEXT_POLICY_FLAG` = 2u;
public const val `IKEEXT_POLICY_FLAG_SITE_TO_SITE`: UInt = 32u;
public const val `IKEEXT_POLICY_SUPPORT_LOW_POWER_MODE`: UInt = 256u;
public const val `IKEEXT_PRESHARED_KEY`: `IKEEXT_AUTHENTICATION_METHOD_TYPE` = 0;
// UNSUPPORTED Rust 3607:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IKEEXT_PRESHARED_KEY_AUTHENTICATION0 {
//     pub presharedKey: FWP_BYTE_BLOB,
// }

// UNSUPPORTED Rust 3612:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IKEEXT_PRESHARED_KEY_AUTHENTICATION1 {
//     pub presharedKey: FWP_BYTE_BLOB,
//     pub flags: IKEEXT_PRESHARED_KEY_AUTHENTICATION_FLAGS,
// }

public typealias `IKEEXT_PRESHARED_KEY_AUTHENTICATION_FLAGS` = UInt;
// UNSUPPORTED Rust 3619:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IKEEXT_PROPOSAL0 {
//     pub cipherAlgorithm: IKEEXT_CIPHER_ALGORITHM0,
//     pub integrityAlgorithm: IKEEXT_INTEGRITY_ALGORITHM0,
//     pub maxLifetimeSeconds: u32,
//     pub dhGroup: IKEEXT_DH_GROUP,
//     pub quickModeLimit: u32,
// }

public const val `IKEEXT_PSK_FLAG_LOCAL_AUTH_ONLY`: `IKEEXT_PRESHARED_KEY_AUTHENTICATION_FLAGS` = 1u;
public const val `IKEEXT_PSK_FLAG_REMOTE_AUTH_ONLY`: `IKEEXT_PRESHARED_KEY_AUTHENTICATION_FLAGS` = 2u;
public typealias `IKEEXT_QM_SA_STATE` = Int;
public const val `IKEEXT_QM_SA_STATE_COMPLETE`: `IKEEXT_QM_SA_STATE` = 3;
public const val `IKEEXT_QM_SA_STATE_FINAL`: `IKEEXT_QM_SA_STATE` = 2;
public const val `IKEEXT_QM_SA_STATE_INITIAL`: `IKEEXT_QM_SA_STATE` = 1;
public const val `IKEEXT_QM_SA_STATE_MAX`: `IKEEXT_QM_SA_STATE` = 4;
public const val `IKEEXT_QM_SA_STATE_NONE`: `IKEEXT_QM_SA_STATE` = 0;
public const val `IKEEXT_RESERVED`: `IKEEXT_AUTHENTICATION_METHOD_TYPE` = 12;
// UNSUPPORTED Rust 3637:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IKEEXT_RESERVED_AUTHENTICATION0 {
//     pub flags: IKEEXT_RESERVED_AUTHENTICATION_FLAGS,
// }

public typealias `IKEEXT_RESERVED_AUTHENTICATION_FLAGS` = UInt;
public const val `IKEEXT_RESERVED_AUTH_DISABLE_INITIATOR_TOKEN_GENERATION`: `IKEEXT_RESERVED_AUTHENTICATION_FLAGS` = 1u;
// UNSUPPORTED Rust 3644:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IKEEXT_SA_DETAILS0 {
//     pub saId: u64,
//     pub keyModuleType: IKEEXT_KEY_MODULE_TYPE,
//     pub ipVersion: FWP_IP_VERSION,
//     pub Anonymous: IKEEXT_SA_DETAILS0_0,
//     pub ikeTraffic: IKEEXT_TRAFFIC0,
//     pub ikeProposal: IKEEXT_PROPOSAL0,
//     pub cookiePair: IKEEXT_COOKIE_PAIR0,
//     pub ikeCredentials: IKEEXT_CREDENTIALS0,
//     pub ikePolicyKey: windows_sys::core::GUID,
//     pub virtualIfTunnelId: u64,
// }

// UNSUPPORTED Rust 3658:1: declaration Impl has no candidate rule
// impl Default for IKEEXT_SA_DETAILS0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3663:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IKEEXT_SA_DETAILS0_0 {
//     pub v4UdpEncapsulation: *mut IPSEC_V4_UDP_ENCAPSULATION0,
// }

// UNSUPPORTED Rust 3668:1: declaration Impl has no candidate rule
// impl Default for IKEEXT_SA_DETAILS0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3673:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IKEEXT_SA_DETAILS1 {
//     pub saId: u64,
//     pub keyModuleType: IKEEXT_KEY_MODULE_TYPE,
//     pub ipVersion: FWP_IP_VERSION,
//     pub Anonymous: IKEEXT_SA_DETAILS1_0,
//     pub ikeTraffic: IKEEXT_TRAFFIC0,
//     pub ikeProposal: IKEEXT_PROPOSAL0,
//     pub cookiePair: IKEEXT_COOKIE_PAIR0,
//     pub ikeCredentials: IKEEXT_CREDENTIALS1,
//     pub ikePolicyKey: windows_sys::core::GUID,
//     pub virtualIfTunnelId: u64,
//     pub correlationKey: FWP_BYTE_BLOB,
// }

// UNSUPPORTED Rust 3688:1: declaration Impl has no candidate rule
// impl Default for IKEEXT_SA_DETAILS1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3693:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IKEEXT_SA_DETAILS1_0 {
//     pub v4UdpEncapsulation: *mut IPSEC_V4_UDP_ENCAPSULATION0,
// }

// UNSUPPORTED Rust 3698:1: declaration Impl has no candidate rule
// impl Default for IKEEXT_SA_DETAILS1_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3703:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IKEEXT_SA_DETAILS2 {
//     pub saId: u64,
//     pub keyModuleType: IKEEXT_KEY_MODULE_TYPE,
//     pub ipVersion: FWP_IP_VERSION,
//     pub Anonymous: IKEEXT_SA_DETAILS2_0,
//     pub ikeTraffic: IKEEXT_TRAFFIC0,
//     pub ikeProposal: IKEEXT_PROPOSAL0,
//     pub cookiePair: IKEEXT_COOKIE_PAIR0,
//     pub ikeCredentials: IKEEXT_CREDENTIALS2,
//     pub ikePolicyKey: windows_sys::core::GUID,
//     pub virtualIfTunnelId: u64,
//     pub correlationKey: FWP_BYTE_BLOB,
// }

// UNSUPPORTED Rust 3718:1: declaration Impl has no candidate rule
// impl Default for IKEEXT_SA_DETAILS2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3723:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IKEEXT_SA_DETAILS2_0 {
//     pub v4UdpEncapsulation: *mut IPSEC_V4_UDP_ENCAPSULATION0,
// }

// UNSUPPORTED Rust 3728:1: declaration Impl has no candidate rule
// impl Default for IKEEXT_SA_DETAILS2_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3733:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct IKEEXT_SA_ENUM_TEMPLATE0 {
//     pub localSubNet: FWP_CONDITION_VALUE0,
//     pub remoteSubNet: FWP_CONDITION_VALUE0,
//     pub localMainModeCertHash: FWP_BYTE_BLOB,
// }

// UNSUPPORTED Rust 3741:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for IKEEXT_SA_ENUM_TEMPLATE0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `IKEEXT_SA_ROLE` = Int;
public const val `IKEEXT_SA_ROLE_INITIATOR`: `IKEEXT_SA_ROLE` = 0;
public const val `IKEEXT_SA_ROLE_MAX`: `IKEEXT_SA_ROLE` = 2;
public const val `IKEEXT_SA_ROLE_RESPONDER`: `IKEEXT_SA_ROLE` = 1;
public const val `IKEEXT_SSL`: `IKEEXT_AUTHENTICATION_METHOD_TYPE` = 4;
public const val `IKEEXT_SSL_ECDSA_P256`: `IKEEXT_AUTHENTICATION_METHOD_TYPE` = 9;
public const val `IKEEXT_SSL_ECDSA_P384`: `IKEEXT_AUTHENTICATION_METHOD_TYPE` = 10;
// UNSUPPORTED Rust 3754:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IKEEXT_STATISTICS0 {
//     pub ikeStatistics: IKEEXT_KEYMODULE_STATISTICS0,
//     pub authipStatistics: IKEEXT_KEYMODULE_STATISTICS0,
//     pub commonStatistics: IKEEXT_COMMON_STATISTICS0,
// }

// UNSUPPORTED Rust 3761:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IKEEXT_STATISTICS1 {
//     pub ikeStatistics: IKEEXT_KEYMODULE_STATISTICS1,
//     pub authipStatistics: IKEEXT_KEYMODULE_STATISTICS1,
//     pub ikeV2Statistics: IKEEXT_KEYMODULE_STATISTICS1,
//     pub commonStatistics: IKEEXT_COMMON_STATISTICS1,
// }

// UNSUPPORTED Rust 3769:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IKEEXT_TRAFFIC0 {
//     pub ipVersion: FWP_IP_VERSION,
//     pub Anonymous1: IKEEXT_TRAFFIC0_0,
//     pub Anonymous2: IKEEXT_TRAFFIC0_1,
//     pub authIpFilterId: u64,
// }

// UNSUPPORTED Rust 3777:1: declaration Impl has no candidate rule
// impl Default for IKEEXT_TRAFFIC0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3782:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IKEEXT_TRAFFIC0_0 {
//     pub localV4Address: u32,
//     pub localV6Address: [u8; 16],
// }

// UNSUPPORTED Rust 3788:1: declaration Impl has no candidate rule
// impl Default for IKEEXT_TRAFFIC0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3793:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IKEEXT_TRAFFIC0_1 {
//     pub remoteV4Address: u32,
//     pub remoteV6Address: [u8; 16],
// }

// UNSUPPORTED Rust 3799:1: declaration Impl has no candidate rule
// impl Default for IKEEXT_TRAFFIC0_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3804:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IPSEC_ADDRESS_INFO0 {
//     pub numV4Addresses: u32,
//     pub v4Addresses: *mut u32,
//     pub numV6Addresses: u32,
//     pub v6Addresses: *mut FWP_BYTE_ARRAY16,
// }

// UNSUPPORTED Rust 3812:1: declaration Impl has no candidate rule
// impl Default for IPSEC_ADDRESS_INFO0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3817:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IPSEC_AGGREGATE_DROP_PACKET_STATISTICS0 {
//     pub invalidSpisOnInbound: u32,
//     pub decryptionFailuresOnInbound: u32,
//     pub authenticationFailuresOnInbound: u32,
//     pub udpEspValidationFailuresOnInbound: u32,
//     pub replayCheckFailuresOnInbound: u32,
//     pub invalidClearTextInbound: u32,
//     pub saNotInitializedOnInbound: u32,
//     pub receiveOverIncorrectSaInbound: u32,
//     pub secureReceivesNotMatchingFilters: u32,
// }

// UNSUPPORTED Rust 3830:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IPSEC_AGGREGATE_DROP_PACKET_STATISTICS1 {
//     pub invalidSpisOnInbound: u32,
//     pub decryptionFailuresOnInbound: u32,
//     pub authenticationFailuresOnInbound: u32,
//     pub udpEspValidationFailuresOnInbound: u32,
//     pub replayCheckFailuresOnInbound: u32,
//     pub invalidClearTextInbound: u32,
//     pub saNotInitializedOnInbound: u32,
//     pub receiveOverIncorrectSaInbound: u32,
//     pub secureReceivesNotMatchingFilters: u32,
//     pub totalDropPacketsInbound: u32,
// }

// UNSUPPORTED Rust 3844:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IPSEC_AGGREGATE_SA_STATISTICS0 {
//     pub activeSas: u32,
//     pub pendingSaNegotiations: u32,
//     pub totalSasAdded: u32,
//     pub totalSasDeleted: u32,
//     pub successfulRekeys: u32,
//     pub activeTunnels: u32,
//     pub offloadedSas: u32,
// }

// UNSUPPORTED Rust 3855:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IPSEC_AH_DROP_PACKET_STATISTICS0 {
//     pub invalidSpisOnInbound: u32,
//     pub authenticationFailuresOnInbound: u32,
//     pub replayCheckFailuresOnInbound: u32,
//     pub saNotInitializedOnInbound: u32,
// }

public const val `IPSEC_AUTH_AES_128`: `IPSEC_AUTH_TYPE` = 3;
public const val `IPSEC_AUTH_AES_192`: `IPSEC_AUTH_TYPE` = 4;
public const val `IPSEC_AUTH_AES_256`: `IPSEC_AUTH_TYPE` = 5;
// UNSUPPORTED Rust 3866:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IPSEC_AUTH_AND_CIPHER_TRANSFORM0 {
//     pub authTransform: IPSEC_AUTH_TRANSFORM0,
//     pub cipherTransform: IPSEC_CIPHER_TRANSFORM0,
// }

public const val `IPSEC_AUTH_CONFIG_GCM_AES_128`: UInt = 3u;
public const val `IPSEC_AUTH_CONFIG_GCM_AES_192`: UInt = 4u;
public const val `IPSEC_AUTH_CONFIG_GCM_AES_256`: UInt = 5u;
public const val `IPSEC_AUTH_CONFIG_HMAC_MD5_96`: UInt = 0u;
public const val `IPSEC_AUTH_CONFIG_HMAC_SHA_1_96`: UInt = 1u;
public const val `IPSEC_AUTH_CONFIG_HMAC_SHA_256_128`: UInt = 2u;
public const val `IPSEC_AUTH_CONFIG_MAX`: UInt = 6u;
public const val `IPSEC_AUTH_MAX`: `IPSEC_AUTH_TYPE` = 6;
public const val `IPSEC_AUTH_MD5`: `IPSEC_AUTH_TYPE` = 0;
public const val `IPSEC_AUTH_SHA_1`: `IPSEC_AUTH_TYPE` = 1;
public const val `IPSEC_AUTH_SHA_256`: `IPSEC_AUTH_TYPE` = 2;
// UNSUPPORTED Rust 3883:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IPSEC_AUTH_TRANSFORM0 {
//     pub authTransformId: IPSEC_AUTH_TRANSFORM_ID0,
//     pub cryptoModuleId: *mut windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 3889:1: declaration Impl has no candidate rule
// impl Default for IPSEC_AUTH_TRANSFORM0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3894:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IPSEC_AUTH_TRANSFORM_ID0 {
//     pub authType: IPSEC_AUTH_TYPE,
//     pub authConfig: u8,
// }

public typealias `IPSEC_AUTH_TYPE` = Int;
public const val `IPSEC_CIPHER_CONFIG_CBC_3DES`: UInt = 2u;
public const val `IPSEC_CIPHER_CONFIG_CBC_AES_128`: UInt = 3u;
public const val `IPSEC_CIPHER_CONFIG_CBC_AES_192`: UInt = 4u;
public const val `IPSEC_CIPHER_CONFIG_CBC_AES_256`: UInt = 5u;
public const val `IPSEC_CIPHER_CONFIG_CBC_DES`: UInt = 1u;
public const val `IPSEC_CIPHER_CONFIG_GCM_AES_128`: UInt = 6u;
public const val `IPSEC_CIPHER_CONFIG_GCM_AES_192`: UInt = 7u;
public const val `IPSEC_CIPHER_CONFIG_GCM_AES_256`: UInt = 8u;
public const val `IPSEC_CIPHER_CONFIG_MAX`: UInt = 9u;
// UNSUPPORTED Rust 3910:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IPSEC_CIPHER_TRANSFORM0 {
//     pub cipherTransformId: IPSEC_CIPHER_TRANSFORM_ID0,
//     pub cryptoModuleId: *mut windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 3916:1: declaration Impl has no candidate rule
// impl Default for IPSEC_CIPHER_TRANSFORM0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3921:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IPSEC_CIPHER_TRANSFORM_ID0 {
//     pub cipherType: IPSEC_CIPHER_TYPE,
//     pub cipherConfig: u8,
// }

public typealias `IPSEC_CIPHER_TYPE` = Int;
public const val `IPSEC_CIPHER_TYPE_3DES`: `IPSEC_CIPHER_TYPE` = 2;
public const val `IPSEC_CIPHER_TYPE_AES_128`: `IPSEC_CIPHER_TYPE` = 3;
public const val `IPSEC_CIPHER_TYPE_AES_192`: `IPSEC_CIPHER_TYPE` = 4;
public const val `IPSEC_CIPHER_TYPE_AES_256`: `IPSEC_CIPHER_TYPE` = 5;
public const val `IPSEC_CIPHER_TYPE_DES`: `IPSEC_CIPHER_TYPE` = 1;
public const val `IPSEC_CIPHER_TYPE_MAX`: `IPSEC_CIPHER_TYPE` = 6;
public const val `IPSEC_DOSP_DSCP_DISABLE_VALUE`: UInt = 255u;
public typealias `IPSEC_DOSP_FLAGS` = UInt;
public const val `IPSEC_DOSP_FLAG_DISABLE_AUTHIP`: `IPSEC_DOSP_FLAGS` = 4u;
public const val `IPSEC_DOSP_FLAG_DISABLE_DEFAULT_BLOCK`: `IPSEC_DOSP_FLAGS` = 8u;
public const val `IPSEC_DOSP_FLAG_ENABLE_IKEV1`: `IPSEC_DOSP_FLAGS` = 1u;
public const val `IPSEC_DOSP_FLAG_ENABLE_IKEV2`: `IPSEC_DOSP_FLAGS` = 2u;
public const val `IPSEC_DOSP_FLAG_FILTER_BLOCK`: `IPSEC_DOSP_FLAGS` = 16u;
public const val `IPSEC_DOSP_FLAG_FILTER_EXEMPT`: `IPSEC_DOSP_FLAGS` = 32u;
// UNSUPPORTED Rust 3942:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IPSEC_DOSP_OPTIONS0 {
//     pub stateIdleTimeoutSeconds: u32,
//     pub perIPRateLimitQueueIdleTimeoutSeconds: u32,
//     pub ipV6IPsecUnauthDscp: u8,
//     pub ipV6IPsecUnauthRateLimitBytesPerSec: u32,
//     pub ipV6IPsecUnauthPerIPRateLimitBytesPerSec: u32,
//     pub ipV6IPsecAuthDscp: u8,
//     pub ipV6IPsecAuthRateLimitBytesPerSec: u32,
//     pub icmpV6Dscp: u8,
//     pub icmpV6RateLimitBytesPerSec: u32,
//     pub ipV6FilterExemptDscp: u8,
//     pub ipV6FilterExemptRateLimitBytesPerSec: u32,
//     pub defBlockExemptDscp: u8,
//     pub defBlockExemptRateLimitBytesPerSec: u32,
//     pub maxStateEntries: u32,
//     pub maxPerIPRateLimitQueues: u32,
//     pub flags: IPSEC_DOSP_FLAGS,
//     pub numPublicIFLuids: u32,
//     pub publicIFLuids: *mut u64,
//     pub numInternalIFLuids: u32,
//     pub internalIFLuids: *mut u64,
//     pub publicV6AddrMask: FWP_V6_ADDR_AND_MASK,
//     pub internalV6AddrMask: FWP_V6_ADDR_AND_MASK,
// }

// UNSUPPORTED Rust 3968:1: declaration Impl has no candidate rule
// impl Default for IPSEC_DOSP_OPTIONS0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IPSEC_DOSP_RATE_LIMIT_DISABLE_VALUE`: UInt = 0u;
// UNSUPPORTED Rust 3974:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IPSEC_DOSP_STATE0 {
//     pub publicHostV6Addr: [u8; 16],
//     pub internalHostV6Addr: [u8; 16],
//     pub totalInboundIPv6IPsecAuthPackets: u64,
//     pub totalOutboundIPv6IPsecAuthPackets: u64,
//     pub durationSecs: u32,
// }

// UNSUPPORTED Rust 3983:1: declaration Impl has no candidate rule
// impl Default for IPSEC_DOSP_STATE0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3988:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IPSEC_DOSP_STATE_ENUM_TEMPLATE0 {
//     pub publicV6AddrMask: FWP_V6_ADDR_AND_MASK,
//     pub internalV6AddrMask: FWP_V6_ADDR_AND_MASK,
// }

// UNSUPPORTED Rust 3994:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IPSEC_DOSP_STATISTICS0 {
//     pub totalStateEntriesCreated: u64,
//     pub currentStateEntries: u64,
//     pub totalInboundAllowedIPv6IPsecUnauthPkts: u64,
//     pub totalInboundRatelimitDiscardedIPv6IPsecUnauthPkts: u64,
//     pub totalInboundPerIPRatelimitDiscardedIPv6IPsecUnauthPkts: u64,
//     pub totalInboundOtherDiscardedIPv6IPsecUnauthPkts: u64,
//     pub totalInboundAllowedIPv6IPsecAuthPkts: u64,
//     pub totalInboundRatelimitDiscardedIPv6IPsecAuthPkts: u64,
//     pub totalInboundOtherDiscardedIPv6IPsecAuthPkts: u64,
//     pub totalInboundAllowedICMPv6Pkts: u64,
//     pub totalInboundRatelimitDiscardedICMPv6Pkts: u64,
//     pub totalInboundAllowedIPv6FilterExemptPkts: u64,
//     pub totalInboundRatelimitDiscardedIPv6FilterExemptPkts: u64,
//     pub totalInboundDiscardedIPv6FilterBlockPkts: u64,
//     pub totalInboundAllowedDefBlockExemptPkts: u64,
//     pub totalInboundRatelimitDiscardedDefBlockExemptPkts: u64,
//     pub totalInboundDiscardedDefBlockPkts: u64,
//     pub currentInboundIPv6IPsecUnauthPerIPRateLimitQueues: u64,
// }

// UNSUPPORTED Rust 4016:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IPSEC_ESP_DROP_PACKET_STATISTICS0 {
//     pub invalidSpisOnInbound: u32,
//     pub decryptionFailuresOnInbound: u32,
//     pub authenticationFailuresOnInbound: u32,
//     pub replayCheckFailuresOnInbound: u32,
//     pub saNotInitializedOnInbound: u32,
// }

public const val `IPSEC_FAILURE_ME`: `IPSEC_FAILURE_POINT` = 1;
public const val `IPSEC_FAILURE_NONE`: `IPSEC_FAILURE_POINT` = 0;
public const val `IPSEC_FAILURE_PEER`: `IPSEC_FAILURE_POINT` = 2;
public typealias `IPSEC_FAILURE_POINT` = Int;
public const val `IPSEC_FAILURE_POINT_MAX`: `IPSEC_FAILURE_POINT` = 3;
// UNSUPPORTED Rust 4030:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IPSEC_GETSPI0 {
//     pub inboundIpsecTraffic: IPSEC_TRAFFIC0,
//     pub ipVersion: FWP_IP_VERSION,
//     pub Anonymous: IPSEC_GETSPI0_0,
//     pub rngCryptoModuleID: *mut windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 4038:1: declaration Impl has no candidate rule
// impl Default for IPSEC_GETSPI0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4043:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IPSEC_GETSPI0_0 {
//     pub inboundUdpEncapsulation: *mut IPSEC_V4_UDP_ENCAPSULATION0,
// }

// UNSUPPORTED Rust 4048:1: declaration Impl has no candidate rule
// impl Default for IPSEC_GETSPI0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4053:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IPSEC_GETSPI1 {
//     pub inboundIpsecTraffic: IPSEC_TRAFFIC1,
//     pub ipVersion: FWP_IP_VERSION,
//     pub Anonymous: IPSEC_GETSPI1_0,
//     pub rngCryptoModuleID: *mut windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 4061:1: declaration Impl has no candidate rule
// impl Default for IPSEC_GETSPI1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4066:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IPSEC_GETSPI1_0 {
//     pub inboundUdpEncapsulation: *mut IPSEC_V4_UDP_ENCAPSULATION0,
// }

// UNSUPPORTED Rust 4071:1: declaration Impl has no candidate rule
// impl Default for IPSEC_GETSPI1_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4076:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IPSEC_ID0 {
//     pub mmTargetName: windows_sys::core::PWSTR,
//     pub emTargetName: windows_sys::core::PWSTR,
//     pub numTokens: u32,
//     pub tokens: *mut IPSEC_TOKEN0,
//     pub explicitCredentials: u64,
//     pub logonId: u64,
// }

// UNSUPPORTED Rust 4086:1: declaration Impl has no candidate rule
// impl Default for IPSEC_ID0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4091:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IPSEC_KEYING_POLICY0 {
//     pub numKeyMods: u32,
//     pub keyModKeys: *mut windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 4097:1: declaration Impl has no candidate rule
// impl Default for IPSEC_KEYING_POLICY0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4102:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IPSEC_KEYING_POLICY1 {
//     pub numKeyMods: u32,
//     pub keyModKeys: *mut windows_sys::core::GUID,
//     pub flags: u32,
// }

// UNSUPPORTED Rust 4109:1: declaration Impl has no candidate rule
// impl Default for IPSEC_KEYING_POLICY1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IPSEC_KEYING_POLICY_FLAG_TERMINATING_MATCH`: UInt = 1u;
// UNSUPPORTED Rust 4115:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IPSEC_KEYMODULE_STATE0 {
//     pub keyModuleKey: windows_sys::core::GUID,
//     pub stateBlob: FWP_BYTE_BLOB,
// }

// UNSUPPORTED Rust 4121:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IPSEC_KEY_MANAGER0 {
//     pub keyManagerKey: windows_sys::core::GUID,
//     pub displayData: FWPM_DISPLAY_DATA0,
//     pub flags: u32,
//     pub keyDictationTimeoutHint: u8,
// }

// UNSUPPORTED Rust 4129:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy, Default)]
// pub struct IPSEC_KEY_MANAGER_CALLBACKS0 {
//     pub reserved: windows_sys::core::GUID,
//     pub flags: u32,
//     pub keyDictationCheck: IPSEC_KEY_MANAGER_KEY_DICTATION_CHECK0,
//     pub keyDictation: IPSEC_KEY_MANAGER_DICTATE_KEY0,
//     pub keyNotify: IPSEC_KEY_MANAGER_NOTIFY_KEY0,
// }

// UNSUPPORTED Rust 4139:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Security")]
// pub type IPSEC_KEY_MANAGER_DICTATE_KEY0 = Option<unsafe extern "system" fn(inboundsadetails: *mut IPSEC_SA_DETAILS1, outboundsadetails: *mut IPSEC_SA_DETAILS1, keyingmodulegenkey: *mut windows_sys::core::BOOL) -> u32>;

public const val `IPSEC_KEY_MANAGER_FLAG_DICTATE_KEY`: UInt = 1u;
// UNSUPPORTED Rust 4142:1: generic scalar type unsupported
// pub type IPSEC_KEY_MANAGER_KEY_DICTATION_CHECK0 = Option<unsafe extern "system" fn(iketraffic: *const IKEEXT_TRAFFIC0, willdictatekey: *mut windows_sys::core::BOOL, weight: *mut u32)>;

// UNSUPPORTED Rust 4143:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Security")]
// pub type IPSEC_KEY_MANAGER_NOTIFY_KEY0 = Option<unsafe extern "system" fn(inboundsa: *const IPSEC_SA_DETAILS1, outboundsa: *const IPSEC_SA_DETAILS1)>;

public const val `IPSEC_PFS_1`: `IPSEC_PFS_GROUP` = 1;
public const val `IPSEC_PFS_14`: `IPSEC_PFS_GROUP` = 3;
public const val `IPSEC_PFS_2`: `IPSEC_PFS_GROUP` = 2;
public const val `IPSEC_PFS_2048`: `IPSEC_PFS_GROUP` = 3;
public const val `IPSEC_PFS_24`: `IPSEC_PFS_GROUP` = 7;
public const val `IPSEC_PFS_ECP_256`: `IPSEC_PFS_GROUP` = 4;
public const val `IPSEC_PFS_ECP_384`: `IPSEC_PFS_GROUP` = 5;
public typealias `IPSEC_PFS_GROUP` = Int;
public const val `IPSEC_PFS_MAX`: `IPSEC_PFS_GROUP` = 8;
public const val `IPSEC_PFS_MM`: `IPSEC_PFS_GROUP` = 6;
public const val `IPSEC_PFS_NONE`: `IPSEC_PFS_GROUP` = 0;
public typealias `IPSEC_POLICY_FLAG` = UInt;
public const val `IPSEC_POLICY_FLAG_BANDWIDTH1`: UInt = 268435456u;
public const val `IPSEC_POLICY_FLAG_BANDWIDTH2`: UInt = 536870912u;
public const val `IPSEC_POLICY_FLAG_BANDWIDTH3`: UInt = 1073741824u;
public const val `IPSEC_POLICY_FLAG_BANDWIDTH4`: UInt = 2147483648u;
public const val `IPSEC_POLICY_FLAG_CLEAR_DF_ON_TUNNEL`: `IPSEC_POLICY_FLAG` = 8u;
public const val `IPSEC_POLICY_FLAG_DONT_NEGOTIATE_BYTE_LIFETIME`: `IPSEC_POLICY_FLAG` = 128u;
public const val `IPSEC_POLICY_FLAG_DONT_NEGOTIATE_SECOND_LIFETIME`: `IPSEC_POLICY_FLAG` = 64u;
public const val `IPSEC_POLICY_FLAG_ENABLE_SERVER_ADDR_ASSIGNMENT`: `IPSEC_POLICY_FLAG` = 512u;
public const val `IPSEC_POLICY_FLAG_ENABLE_V6_IN_V4_TUNNELING`: `IPSEC_POLICY_FLAG` = 256u;
public const val `IPSEC_POLICY_FLAG_KEY_MANAGER_ALLOW_DICTATE_KEY`: `IPSEC_POLICY_FLAG` = 8192u;
public const val `IPSEC_POLICY_FLAG_KEY_MANAGER_ALLOW_NOTIFY_KEY`: UInt = 16384u;
public const val `IPSEC_POLICY_FLAG_NAT_ENCAP_ALLOW_GENERAL_NAT_TRAVERSAL`: `IPSEC_POLICY_FLAG` = 32u;
public const val `IPSEC_POLICY_FLAG_NAT_ENCAP_ALLOW_PEER_BEHIND_NAT`: `IPSEC_POLICY_FLAG` = 16u;
public const val `IPSEC_POLICY_FLAG_ND_BOUNDARY`: `IPSEC_POLICY_FLAG` = 4u;
public const val `IPSEC_POLICY_FLAG_ND_SECURE`: `IPSEC_POLICY_FLAG` = 2u;
public const val `IPSEC_POLICY_FLAG_RESERVED1`: UInt = 32768u;
public const val `IPSEC_POLICY_FLAG_SITE_TO_SITE_TUNNEL`: UInt = 65536u;
public const val `IPSEC_POLICY_FLAG_TUNNEL_ALLOW_OUTBOUND_CLEAR_CONNECTION`: `IPSEC_POLICY_FLAG` = 1024u;
public const val `IPSEC_POLICY_FLAG_TUNNEL_BYPASS_ALREADY_SECURE_CONNECTION`: `IPSEC_POLICY_FLAG` = 2048u;
public const val `IPSEC_POLICY_FLAG_TUNNEL_BYPASS_ICMPV6`: `IPSEC_POLICY_FLAG` = 4096u;
// UNSUPPORTED Rust 4177:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IPSEC_PROPOSAL0 {
//     pub lifetime: IPSEC_SA_LIFETIME0,
//     pub numSaTransforms: u32,
//     pub saTransforms: *mut IPSEC_SA_TRANSFORM0,
//     pub pfsGroup: IPSEC_PFS_GROUP,
// }

// UNSUPPORTED Rust 4185:1: declaration Impl has no candidate rule
// impl Default for IPSEC_PROPOSAL0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4190:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IPSEC_SA0 {
//     pub spi: u32,
//     pub saTransformType: IPSEC_TRANSFORM_TYPE,
//     pub Anonymous: IPSEC_SA0_0,
// }

// UNSUPPORTED Rust 4197:1: declaration Impl has no candidate rule
// impl Default for IPSEC_SA0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4202:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IPSEC_SA0_0 {
//     pub ahInformation: *mut IPSEC_SA_AUTH_INFORMATION0,
//     pub espAuthInformation: *mut IPSEC_SA_AUTH_INFORMATION0,
//     pub espCipherInformation: *mut IPSEC_SA_CIPHER_INFORMATION0,
//     pub espAuthAndCipherInformation: *mut IPSEC_SA_AUTH_AND_CIPHER_INFORMATION0,
//     pub espAuthFwInformation: *mut IPSEC_SA_AUTH_INFORMATION0,
// }

// UNSUPPORTED Rust 4211:1: declaration Impl has no candidate rule
// impl Default for IPSEC_SA0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4216:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IPSEC_SA_AUTH_AND_CIPHER_INFORMATION0 {
//     pub saCipherInformation: IPSEC_SA_CIPHER_INFORMATION0,
//     pub saAuthInformation: IPSEC_SA_AUTH_INFORMATION0,
// }

// UNSUPPORTED Rust 4222:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IPSEC_SA_AUTH_INFORMATION0 {
//     pub authTransform: IPSEC_AUTH_TRANSFORM0,
//     pub authKey: FWP_BYTE_BLOB,
// }

// UNSUPPORTED Rust 4228:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IPSEC_SA_BUNDLE0 {
//     pub flags: IPSEC_SA_BUNDLE_FLAGS,
//     pub lifetime: IPSEC_SA_LIFETIME0,
//     pub idleTimeoutSeconds: u32,
//     pub ndAllowClearTimeoutSeconds: u32,
//     pub ipsecId: *mut IPSEC_ID0,
//     pub napContext: u32,
//     pub qmSaId: u32,
//     pub numSAs: u32,
//     pub saList: *mut IPSEC_SA0,
//     pub keyModuleState: *mut IPSEC_KEYMODULE_STATE0,
//     pub ipVersion: FWP_IP_VERSION,
//     pub Anonymous: IPSEC_SA_BUNDLE0_0,
//     pub mmSaId: u64,
//     pub pfsGroup: IPSEC_PFS_GROUP,
// }

// UNSUPPORTED Rust 4246:1: declaration Impl has no candidate rule
// impl Default for IPSEC_SA_BUNDLE0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4251:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IPSEC_SA_BUNDLE0_0 {
//     pub peerV4PrivateAddress: u32,
// }

// UNSUPPORTED Rust 4256:1: declaration Impl has no candidate rule
// impl Default for IPSEC_SA_BUNDLE0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4261:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IPSEC_SA_BUNDLE1 {
//     pub flags: IPSEC_SA_BUNDLE_FLAGS,
//     pub lifetime: IPSEC_SA_LIFETIME0,
//     pub idleTimeoutSeconds: u32,
//     pub ndAllowClearTimeoutSeconds: u32,
//     pub ipsecId: *mut IPSEC_ID0,
//     pub napContext: u32,
//     pub qmSaId: u32,
//     pub numSAs: u32,
//     pub saList: *mut IPSEC_SA0,
//     pub keyModuleState: *mut IPSEC_KEYMODULE_STATE0,
//     pub ipVersion: FWP_IP_VERSION,
//     pub Anonymous: IPSEC_SA_BUNDLE1_0,
//     pub mmSaId: u64,
//     pub pfsGroup: IPSEC_PFS_GROUP,
//     pub saLookupContext: windows_sys::core::GUID,
//     pub qmFilterId: u64,
// }

// UNSUPPORTED Rust 4281:1: declaration Impl has no candidate rule
// impl Default for IPSEC_SA_BUNDLE1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4286:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IPSEC_SA_BUNDLE1_0 {
//     pub peerV4PrivateAddress: u32,
// }

// UNSUPPORTED Rust 4291:1: declaration Impl has no candidate rule
// impl Default for IPSEC_SA_BUNDLE1_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `IPSEC_SA_BUNDLE_FLAGS` = UInt;
public const val `IPSEC_SA_BUNDLE_FLAG_ALLOW_NULL_TARGET_NAME_MATCH`: `IPSEC_SA_BUNDLE_FLAGS` = 512u;
public const val `IPSEC_SA_BUNDLE_FLAG_ASSUME_UDP_CONTEXT_OUTBOUND`: `IPSEC_SA_BUNDLE_FLAGS` = 2048u;
public const val `IPSEC_SA_BUNDLE_FLAG_CLEAR_DF_ON_TUNNEL`: `IPSEC_SA_BUNDLE_FLAGS` = 1024u;
public const val `IPSEC_SA_BUNDLE_FLAG_ENABLE_OPTIONAL_ASYMMETRIC_IDLE`: UInt = 262144u;
public const val `IPSEC_SA_BUNDLE_FLAG_FORCE_INBOUND_CONNECTIONS`: UInt = 32768u;
public const val `IPSEC_SA_BUNDLE_FLAG_FORCE_OUTBOUND_CONNECTIONS`: UInt = 65536u;
public const val `IPSEC_SA_BUNDLE_FLAG_FORWARD_PATH_INITIATOR`: UInt = 131072u;
public const val `IPSEC_SA_BUNDLE_FLAG_GUARANTEE_ENCRYPTION`: `IPSEC_SA_BUNDLE_FLAGS` = 8u;
public const val `IPSEC_SA_BUNDLE_FLAG_IP_IN_IP_PKT`: UInt = 4194304u;
public const val `IPSEC_SA_BUNDLE_FLAG_LOCALLY_DICTATED_KEYS`: UInt = 1048576u;
public const val `IPSEC_SA_BUNDLE_FLAG_LOW_POWER_MODE_SUPPORT`: UInt = 8388608u;
public const val `IPSEC_SA_BUNDLE_FLAG_ND_BOUNDARY`: `IPSEC_SA_BUNDLE_FLAGS` = 2u;
public const val `IPSEC_SA_BUNDLE_FLAG_ND_PEER_BOUNDARY`: `IPSEC_SA_BUNDLE_FLAGS` = 4096u;
public const val `IPSEC_SA_BUNDLE_FLAG_ND_PEER_NAT_BOUNDARY`: `IPSEC_SA_BUNDLE_FLAGS` = 4u;
public const val `IPSEC_SA_BUNDLE_FLAG_ND_SECURE`: `IPSEC_SA_BUNDLE_FLAGS` = 1u;
public const val `IPSEC_SA_BUNDLE_FLAG_NLB`: UInt = 16u;
public const val `IPSEC_SA_BUNDLE_FLAG_NO_EXPLICIT_CRED_MATCH`: UInt = 128u;
public const val `IPSEC_SA_BUNDLE_FLAG_NO_IMPERSONATION_LUID_VERIFY`: UInt = 64u;
public const val `IPSEC_SA_BUNDLE_FLAG_NO_MACHINE_LUID_VERIFY`: UInt = 32u;
public const val `IPSEC_SA_BUNDLE_FLAG_PEER_SUPPORTS_GUARANTEE_ENCRYPTION`: `IPSEC_SA_BUNDLE_FLAGS` = 16384u;
public const val `IPSEC_SA_BUNDLE_FLAG_SA_OFFLOADED`: UInt = 2097152u;
public const val `IPSEC_SA_BUNDLE_FLAG_SUPPRESS_DUPLICATE_DELETION`: `IPSEC_SA_BUNDLE_FLAGS` = 8192u;
public const val `IPSEC_SA_BUNDLE_FLAG_TUNNEL_BANDWIDTH1`: UInt = 268435456u;
public const val `IPSEC_SA_BUNDLE_FLAG_TUNNEL_BANDWIDTH2`: UInt = 536870912u;
public const val `IPSEC_SA_BUNDLE_FLAG_TUNNEL_BANDWIDTH3`: UInt = 1073741824u;
public const val `IPSEC_SA_BUNDLE_FLAG_TUNNEL_BANDWIDTH4`: UInt = 2147483648u;
public const val `IPSEC_SA_BUNDLE_FLAG_USING_DICTATED_KEYS`: UInt = 524288u;
// UNSUPPORTED Rust 4324:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IPSEC_SA_CIPHER_INFORMATION0 {
//     pub cipherTransform: IPSEC_CIPHER_TRANSFORM0,
//     pub cipherKey: FWP_BYTE_BLOB,
// }

// UNSUPPORTED Rust 4330:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct IPSEC_SA_CONTEXT0 {
//     pub saContextId: u64,
//     pub inboundSa: *mut IPSEC_SA_DETAILS0,
//     pub outboundSa: *mut IPSEC_SA_DETAILS0,
// }

// UNSUPPORTED Rust 4338:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for IPSEC_SA_CONTEXT0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4344:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct IPSEC_SA_CONTEXT1 {
//     pub saContextId: u64,
//     pub inboundSa: *mut IPSEC_SA_DETAILS1,
//     pub outboundSa: *mut IPSEC_SA_DETAILS1,
// }

// UNSUPPORTED Rust 4352:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for IPSEC_SA_CONTEXT1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4358:1: generic scalar type unsupported
// pub type IPSEC_SA_CONTEXT_CALLBACK0 = Option<unsafe extern "system" fn(context: *mut core::ffi::c_void, change: *const IPSEC_SA_CONTEXT_CHANGE0)>;

// UNSUPPORTED Rust 4359:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IPSEC_SA_CONTEXT_CHANGE0 {
//     pub changeType: IPSEC_SA_CONTEXT_EVENT_TYPE0,
//     pub saContextId: u64,
// }

// UNSUPPORTED Rust 4365:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct IPSEC_SA_CONTEXT_ENUM_TEMPLATE0 {
//     pub localSubNet: FWP_CONDITION_VALUE0,
//     pub remoteSubNet: FWP_CONDITION_VALUE0,
// }

// UNSUPPORTED Rust 4372:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for IPSEC_SA_CONTEXT_ENUM_TEMPLATE0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IPSEC_SA_CONTEXT_EVENT_ADD`: `IPSEC_SA_CONTEXT_EVENT_TYPE0` = 1;
public const val `IPSEC_SA_CONTEXT_EVENT_DELETE`: `IPSEC_SA_CONTEXT_EVENT_TYPE0` = 2;
public const val `IPSEC_SA_CONTEXT_EVENT_MAX`: `IPSEC_SA_CONTEXT_EVENT_TYPE0` = 3;
public typealias `IPSEC_SA_CONTEXT_EVENT_TYPE0` = Int;
// UNSUPPORTED Rust 4382:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct IPSEC_SA_CONTEXT_SUBSCRIPTION0 {
//     pub enumTemplate: *mut IPSEC_SA_CONTEXT_ENUM_TEMPLATE0,
//     pub flags: u32,
//     pub sessionKey: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 4390:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for IPSEC_SA_CONTEXT_SUBSCRIPTION0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4396:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct IPSEC_SA_DETAILS0 {
//     pub ipVersion: FWP_IP_VERSION,
//     pub saDirection: FWP_DIRECTION,
//     pub traffic: IPSEC_TRAFFIC0,
//     pub saBundle: IPSEC_SA_BUNDLE0,
//     pub Anonymous: IPSEC_SA_DETAILS0_0,
//     pub transportFilter: *mut FWPM_FILTER0,
// }

// UNSUPPORTED Rust 4407:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for IPSEC_SA_DETAILS0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4413:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub union IPSEC_SA_DETAILS0_0 {
//     pub udpEncapsulation: *mut IPSEC_V4_UDP_ENCAPSULATION0,
// }

// UNSUPPORTED Rust 4419:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for IPSEC_SA_DETAILS0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4425:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct IPSEC_SA_DETAILS1 {
//     pub ipVersion: FWP_IP_VERSION,
//     pub saDirection: FWP_DIRECTION,
//     pub traffic: IPSEC_TRAFFIC1,
//     pub saBundle: IPSEC_SA_BUNDLE1,
//     pub Anonymous: IPSEC_SA_DETAILS1_0,
//     pub transportFilter: *mut FWPM_FILTER0,
//     pub virtualIfTunnelInfo: IPSEC_VIRTUAL_IF_TUNNEL_INFO0,
// }

// UNSUPPORTED Rust 4437:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for IPSEC_SA_DETAILS1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4443:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub union IPSEC_SA_DETAILS1_0 {
//     pub udpEncapsulation: *mut IPSEC_V4_UDP_ENCAPSULATION0,
// }

// UNSUPPORTED Rust 4449:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for IPSEC_SA_DETAILS1_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4455:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IPSEC_SA_ENUM_TEMPLATE0 {
//     pub saDirection: FWP_DIRECTION,
// }

// UNSUPPORTED Rust 4460:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IPSEC_SA_IDLE_TIMEOUT0 {
//     pub idleTimeoutSeconds: u32,
//     pub idleTimeoutSecondsFailOver: u32,
// }

// UNSUPPORTED Rust 4466:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IPSEC_SA_LIFETIME0 {
//     pub lifetimeSeconds: u32,
//     pub lifetimeKilobytes: u32,
//     pub lifetimePackets: u32,
// }

// UNSUPPORTED Rust 4473:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IPSEC_SA_TRANSFORM0 {
//     pub ipsecTransformType: IPSEC_TRANSFORM_TYPE,
//     pub Anonymous: IPSEC_SA_TRANSFORM0_0,
// }

// UNSUPPORTED Rust 4479:1: declaration Impl has no candidate rule
// impl Default for IPSEC_SA_TRANSFORM0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4484:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IPSEC_SA_TRANSFORM0_0 {
//     pub ahTransform: *mut IPSEC_AUTH_TRANSFORM0,
//     pub espAuthTransform: *mut IPSEC_AUTH_TRANSFORM0,
//     pub espCipherTransform: *mut IPSEC_CIPHER_TRANSFORM0,
//     pub espAuthAndCipherTransform: *mut IPSEC_AUTH_AND_CIPHER_TRANSFORM0,
//     pub espAuthFwTransform: *mut IPSEC_AUTH_TRANSFORM0,
// }

// UNSUPPORTED Rust 4493:1: declaration Impl has no candidate rule
// impl Default for IPSEC_SA_TRANSFORM0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4498:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IPSEC_STATISTICS0 {
//     pub aggregateSaStatistics: IPSEC_AGGREGATE_SA_STATISTICS0,
//     pub espDropPacketStatistics: IPSEC_ESP_DROP_PACKET_STATISTICS0,
//     pub ahDropPacketStatistics: IPSEC_AH_DROP_PACKET_STATISTICS0,
//     pub aggregateDropPacketStatistics: IPSEC_AGGREGATE_DROP_PACKET_STATISTICS0,
//     pub inboundTrafficStatistics: IPSEC_TRAFFIC_STATISTICS0,
//     pub outboundTrafficStatistics: IPSEC_TRAFFIC_STATISTICS0,
// }

// UNSUPPORTED Rust 4508:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IPSEC_STATISTICS1 {
//     pub aggregateSaStatistics: IPSEC_AGGREGATE_SA_STATISTICS0,
//     pub espDropPacketStatistics: IPSEC_ESP_DROP_PACKET_STATISTICS0,
//     pub ahDropPacketStatistics: IPSEC_AH_DROP_PACKET_STATISTICS0,
//     pub aggregateDropPacketStatistics: IPSEC_AGGREGATE_DROP_PACKET_STATISTICS1,
//     pub inboundTrafficStatistics: IPSEC_TRAFFIC_STATISTICS1,
//     pub outboundTrafficStatistics: IPSEC_TRAFFIC_STATISTICS1,
// }

// UNSUPPORTED Rust 4518:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IPSEC_TOKEN0 {
//     pub r#type: IPSEC_TOKEN_TYPE,
//     pub principal: IPSEC_TOKEN_PRINCIPAL,
//     pub mode: IPSEC_TOKEN_MODE,
//     pub token: u64,
// }

public typealias `IPSEC_TOKEN_MODE` = Int;
public const val `IPSEC_TOKEN_MODE_EXTENDED`: `IPSEC_TOKEN_MODE` = 1;
public const val `IPSEC_TOKEN_MODE_MAIN`: `IPSEC_TOKEN_MODE` = 0;
public const val `IPSEC_TOKEN_MODE_MAX`: `IPSEC_TOKEN_MODE` = 2;
public typealias `IPSEC_TOKEN_PRINCIPAL` = Int;
public const val `IPSEC_TOKEN_PRINCIPAL_LOCAL`: `IPSEC_TOKEN_PRINCIPAL` = 0;
public const val `IPSEC_TOKEN_PRINCIPAL_MAX`: `IPSEC_TOKEN_PRINCIPAL` = 2;
public const val `IPSEC_TOKEN_PRINCIPAL_PEER`: `IPSEC_TOKEN_PRINCIPAL` = 1;
public typealias `IPSEC_TOKEN_TYPE` = Int;
public const val `IPSEC_TOKEN_TYPE_IMPERSONATION`: `IPSEC_TOKEN_TYPE` = 1;
public const val `IPSEC_TOKEN_TYPE_MACHINE`: `IPSEC_TOKEN_TYPE` = 0;
public const val `IPSEC_TOKEN_TYPE_MAX`: `IPSEC_TOKEN_TYPE` = 2;
// UNSUPPORTED Rust 4538:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IPSEC_TRAFFIC0 {
//     pub ipVersion: FWP_IP_VERSION,
//     pub Anonymous1: IPSEC_TRAFFIC0_0,
//     pub Anonymous2: IPSEC_TRAFFIC0_1,
//     pub trafficType: IPSEC_TRAFFIC_TYPE,
//     pub Anonymous3: IPSEC_TRAFFIC0_2,
//     pub remotePort: u16,
// }

// UNSUPPORTED Rust 4548:1: declaration Impl has no candidate rule
// impl Default for IPSEC_TRAFFIC0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4553:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IPSEC_TRAFFIC0_0 {
//     pub localV4Address: u32,
//     pub localV6Address: [u8; 16],
// }

// UNSUPPORTED Rust 4559:1: declaration Impl has no candidate rule
// impl Default for IPSEC_TRAFFIC0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4564:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IPSEC_TRAFFIC0_1 {
//     pub remoteV4Address: u32,
//     pub remoteV6Address: [u8; 16],
// }

// UNSUPPORTED Rust 4570:1: declaration Impl has no candidate rule
// impl Default for IPSEC_TRAFFIC0_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4575:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IPSEC_TRAFFIC0_2 {
//     pub ipsecFilterId: u64,
//     pub tunnelPolicyId: u64,
// }

// UNSUPPORTED Rust 4581:1: declaration Impl has no candidate rule
// impl Default for IPSEC_TRAFFIC0_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4586:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IPSEC_TRAFFIC1 {
//     pub ipVersion: FWP_IP_VERSION,
//     pub Anonymous1: IPSEC_TRAFFIC1_0,
//     pub Anonymous2: IPSEC_TRAFFIC1_1,
//     pub trafficType: IPSEC_TRAFFIC_TYPE,
//     pub Anonymous3: IPSEC_TRAFFIC1_2,
//     pub remotePort: u16,
//     pub localPort: u16,
//     pub ipProtocol: u8,
//     pub localIfLuid: u64,
//     pub realIfProfileId: u32,
// }

// UNSUPPORTED Rust 4600:1: declaration Impl has no candidate rule
// impl Default for IPSEC_TRAFFIC1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4605:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IPSEC_TRAFFIC1_0 {
//     pub localV4Address: u32,
//     pub localV6Address: [u8; 16],
// }

// UNSUPPORTED Rust 4611:1: declaration Impl has no candidate rule
// impl Default for IPSEC_TRAFFIC1_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4616:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IPSEC_TRAFFIC1_1 {
//     pub remoteV4Address: u32,
//     pub remoteV6Address: [u8; 16],
// }

// UNSUPPORTED Rust 4622:1: declaration Impl has no candidate rule
// impl Default for IPSEC_TRAFFIC1_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4627:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IPSEC_TRAFFIC1_2 {
//     pub ipsecFilterId: u64,
//     pub tunnelPolicyId: u64,
// }

// UNSUPPORTED Rust 4633:1: declaration Impl has no candidate rule
// impl Default for IPSEC_TRAFFIC1_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4638:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IPSEC_TRAFFIC_SELECTOR0 {
//     pub protocolId: u8,
//     pub portStart: u16,
//     pub portEnd: u16,
//     pub ipVersion: FWP_IP_VERSION,
//     pub Anonymous1: IPSEC_TRAFFIC_SELECTOR0_0,
//     pub Anonymous2: IPSEC_TRAFFIC_SELECTOR0_1,
// }

// UNSUPPORTED Rust 4648:1: declaration Impl has no candidate rule
// impl Default for IPSEC_TRAFFIC_SELECTOR0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4653:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IPSEC_TRAFFIC_SELECTOR0_0 {
//     pub startV4Address: u32,
//     pub startV6Address: [u8; 16],
// }

// UNSUPPORTED Rust 4659:1: declaration Impl has no candidate rule
// impl Default for IPSEC_TRAFFIC_SELECTOR0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4664:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IPSEC_TRAFFIC_SELECTOR0_1 {
//     pub endV4Address: u32,
//     pub endV6Address: [u8; 16],
// }

// UNSUPPORTED Rust 4670:1: declaration Impl has no candidate rule
// impl Default for IPSEC_TRAFFIC_SELECTOR0_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4675:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IPSEC_TRAFFIC_SELECTOR_POLICY0 {
//     pub flags: u32,
//     pub numLocalTrafficSelectors: u32,
//     pub localTrafficSelectors: *mut IPSEC_TRAFFIC_SELECTOR0,
//     pub numRemoteTrafficSelectors: u32,
//     pub remoteTrafficSelectors: *mut IPSEC_TRAFFIC_SELECTOR0,
// }

// UNSUPPORTED Rust 4684:1: declaration Impl has no candidate rule
// impl Default for IPSEC_TRAFFIC_SELECTOR_POLICY0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4689:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IPSEC_TRAFFIC_STATISTICS0 {
//     pub encryptedByteCount: u64,
//     pub authenticatedAHByteCount: u64,
//     pub authenticatedESPByteCount: u64,
//     pub transportByteCount: u64,
//     pub tunnelByteCount: u64,
//     pub offloadByteCount: u64,
// }

// UNSUPPORTED Rust 4699:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IPSEC_TRAFFIC_STATISTICS1 {
//     pub encryptedByteCount: u64,
//     pub authenticatedAHByteCount: u64,
//     pub authenticatedESPByteCount: u64,
//     pub transportByteCount: u64,
//     pub tunnelByteCount: u64,
//     pub offloadByteCount: u64,
//     pub totalSuccessfulPackets: u64,
// }

public typealias `IPSEC_TRAFFIC_TYPE` = Int;
public const val `IPSEC_TRAFFIC_TYPE_MAX`: `IPSEC_TRAFFIC_TYPE` = 2;
public const val `IPSEC_TRAFFIC_TYPE_TRANSPORT`: `IPSEC_TRAFFIC_TYPE` = 0;
public const val `IPSEC_TRAFFIC_TYPE_TUNNEL`: `IPSEC_TRAFFIC_TYPE` = 1;
public const val `IPSEC_TRANSFORM_AH`: `IPSEC_TRANSFORM_TYPE` = 1;
public const val `IPSEC_TRANSFORM_ESP_AUTH`: `IPSEC_TRANSFORM_TYPE` = 2;
public const val `IPSEC_TRANSFORM_ESP_AUTH_AND_CIPHER`: `IPSEC_TRANSFORM_TYPE` = 4;
public const val `IPSEC_TRANSFORM_ESP_AUTH_FW`: `IPSEC_TRANSFORM_TYPE` = 5;
public const val `IPSEC_TRANSFORM_ESP_CIPHER`: `IPSEC_TRANSFORM_TYPE` = 3;
public typealias `IPSEC_TRANSFORM_TYPE` = Int;
public const val `IPSEC_TRANSFORM_TYPE_MAX`: `IPSEC_TRANSFORM_TYPE` = 6;
// UNSUPPORTED Rust 4721:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IPSEC_TRANSPORT_POLICY0 {
//     pub numIpsecProposals: u32,
//     pub ipsecProposals: *mut IPSEC_PROPOSAL0,
//     pub flags: IPSEC_POLICY_FLAG,
//     pub ndAllowClearTimeoutSeconds: u32,
//     pub saIdleTimeout: IPSEC_SA_IDLE_TIMEOUT0,
//     pub emPolicy: *mut IKEEXT_EM_POLICY0,
// }

// UNSUPPORTED Rust 4731:1: declaration Impl has no candidate rule
// impl Default for IPSEC_TRANSPORT_POLICY0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4736:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IPSEC_TRANSPORT_POLICY1 {
//     pub numIpsecProposals: u32,
//     pub ipsecProposals: *mut IPSEC_PROPOSAL0,
//     pub flags: IPSEC_POLICY_FLAG,
//     pub ndAllowClearTimeoutSeconds: u32,
//     pub saIdleTimeout: IPSEC_SA_IDLE_TIMEOUT0,
//     pub emPolicy: *mut IKEEXT_EM_POLICY1,
// }

// UNSUPPORTED Rust 4746:1: declaration Impl has no candidate rule
// impl Default for IPSEC_TRANSPORT_POLICY1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4751:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IPSEC_TRANSPORT_POLICY2 {
//     pub numIpsecProposals: u32,
//     pub ipsecProposals: *mut IPSEC_PROPOSAL0,
//     pub flags: IPSEC_POLICY_FLAG,
//     pub ndAllowClearTimeoutSeconds: u32,
//     pub saIdleTimeout: IPSEC_SA_IDLE_TIMEOUT0,
//     pub emPolicy: *mut IKEEXT_EM_POLICY2,
// }

// UNSUPPORTED Rust 4761:1: declaration Impl has no candidate rule
// impl Default for IPSEC_TRANSPORT_POLICY2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4766:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IPSEC_TUNNEL_ENDPOINT0 {
//     pub ipVersion: FWP_IP_VERSION,
//     pub Anonymous: IPSEC_TUNNEL_ENDPOINT0_0,
// }

// UNSUPPORTED Rust 4772:1: declaration Impl has no candidate rule
// impl Default for IPSEC_TUNNEL_ENDPOINT0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4777:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IPSEC_TUNNEL_ENDPOINT0_0 {
//     pub v4Address: u32,
//     pub v6Address: [u8; 16],
// }

// UNSUPPORTED Rust 4783:1: declaration Impl has no candidate rule
// impl Default for IPSEC_TUNNEL_ENDPOINT0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4788:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IPSEC_TUNNEL_ENDPOINTS0 {
//     pub ipVersion: FWP_IP_VERSION,
//     pub Anonymous1: IPSEC_TUNNEL_ENDPOINTS0_0,
//     pub Anonymous2: IPSEC_TUNNEL_ENDPOINTS0_1,
// }

// UNSUPPORTED Rust 4795:1: declaration Impl has no candidate rule
// impl Default for IPSEC_TUNNEL_ENDPOINTS0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4800:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IPSEC_TUNNEL_ENDPOINTS0_0 {
//     pub localV4Address: u32,
//     pub localV6Address: [u8; 16],
// }

// UNSUPPORTED Rust 4806:1: declaration Impl has no candidate rule
// impl Default for IPSEC_TUNNEL_ENDPOINTS0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4811:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IPSEC_TUNNEL_ENDPOINTS0_1 {
//     pub remoteV4Address: u32,
//     pub remoteV6Address: [u8; 16],
// }

// UNSUPPORTED Rust 4817:1: declaration Impl has no candidate rule
// impl Default for IPSEC_TUNNEL_ENDPOINTS0_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4822:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IPSEC_TUNNEL_ENDPOINTS1 {
//     pub ipVersion: FWP_IP_VERSION,
//     pub Anonymous1: IPSEC_TUNNEL_ENDPOINTS1_0,
//     pub Anonymous2: IPSEC_TUNNEL_ENDPOINTS1_1,
//     pub localIfLuid: u64,
// }

// UNSUPPORTED Rust 4830:1: declaration Impl has no candidate rule
// impl Default for IPSEC_TUNNEL_ENDPOINTS1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4835:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IPSEC_TUNNEL_ENDPOINTS1_0 {
//     pub localV4Address: u32,
//     pub localV6Address: [u8; 16],
// }

// UNSUPPORTED Rust 4841:1: declaration Impl has no candidate rule
// impl Default for IPSEC_TUNNEL_ENDPOINTS1_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4846:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IPSEC_TUNNEL_ENDPOINTS1_1 {
//     pub remoteV4Address: u32,
//     pub remoteV6Address: [u8; 16],
// }

// UNSUPPORTED Rust 4852:1: declaration Impl has no candidate rule
// impl Default for IPSEC_TUNNEL_ENDPOINTS1_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4857:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IPSEC_TUNNEL_ENDPOINTS2 {
//     pub ipVersion: FWP_IP_VERSION,
//     pub Anonymous1: IPSEC_TUNNEL_ENDPOINTS2_0,
//     pub Anonymous2: IPSEC_TUNNEL_ENDPOINTS2_1,
//     pub localIfLuid: u64,
//     pub remoteFqdn: windows_sys::core::PWSTR,
//     pub numAddresses: u32,
//     pub remoteAddresses: *mut IPSEC_TUNNEL_ENDPOINT0,
// }

// UNSUPPORTED Rust 4868:1: declaration Impl has no candidate rule
// impl Default for IPSEC_TUNNEL_ENDPOINTS2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4873:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IPSEC_TUNNEL_ENDPOINTS2_0 {
//     pub localV4Address: u32,
//     pub localV6Address: [u8; 16],
// }

// UNSUPPORTED Rust 4879:1: declaration Impl has no candidate rule
// impl Default for IPSEC_TUNNEL_ENDPOINTS2_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4884:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IPSEC_TUNNEL_ENDPOINTS2_1 {
//     pub remoteV4Address: u32,
//     pub remoteV6Address: [u8; 16],
// }

// UNSUPPORTED Rust 4890:1: declaration Impl has no candidate rule
// impl Default for IPSEC_TUNNEL_ENDPOINTS2_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4895:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IPSEC_TUNNEL_POLICY0 {
//     pub flags: IPSEC_POLICY_FLAG,
//     pub numIpsecProposals: u32,
//     pub ipsecProposals: *mut IPSEC_PROPOSAL0,
//     pub tunnelEndpoints: IPSEC_TUNNEL_ENDPOINTS0,
//     pub saIdleTimeout: IPSEC_SA_IDLE_TIMEOUT0,
//     pub emPolicy: *mut IKEEXT_EM_POLICY0,
// }

// UNSUPPORTED Rust 4905:1: declaration Impl has no candidate rule
// impl Default for IPSEC_TUNNEL_POLICY0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4910:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IPSEC_TUNNEL_POLICY1 {
//     pub flags: IPSEC_POLICY_FLAG,
//     pub numIpsecProposals: u32,
//     pub ipsecProposals: *mut IPSEC_PROPOSAL0,
//     pub tunnelEndpoints: IPSEC_TUNNEL_ENDPOINTS1,
//     pub saIdleTimeout: IPSEC_SA_IDLE_TIMEOUT0,
//     pub emPolicy: *mut IKEEXT_EM_POLICY1,
// }

// UNSUPPORTED Rust 4920:1: declaration Impl has no candidate rule
// impl Default for IPSEC_TUNNEL_POLICY1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4925:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IPSEC_TUNNEL_POLICY2 {
//     pub flags: IPSEC_POLICY_FLAG,
//     pub numIpsecProposals: u32,
//     pub ipsecProposals: *mut IPSEC_PROPOSAL0,
//     pub tunnelEndpoints: IPSEC_TUNNEL_ENDPOINTS2,
//     pub saIdleTimeout: IPSEC_SA_IDLE_TIMEOUT0,
//     pub emPolicy: *mut IKEEXT_EM_POLICY2,
//     pub fwdPathSaLifetime: u32,
// }

// UNSUPPORTED Rust 4936:1: declaration Impl has no candidate rule
// impl Default for IPSEC_TUNNEL_POLICY2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4941:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IPSEC_TUNNEL_POLICY3 {
//     pub flags: u32,
//     pub numIpsecProposals: u32,
//     pub ipsecProposals: *mut IPSEC_PROPOSAL0,
//     pub tunnelEndpoints: IPSEC_TUNNEL_ENDPOINTS2,
//     pub saIdleTimeout: IPSEC_SA_IDLE_TIMEOUT0,
//     pub emPolicy: *mut IKEEXT_EM_POLICY2,
//     pub fwdPathSaLifetime: u32,
//     pub compartmentId: u32,
//     pub numTrafficSelectorPolicy: u32,
//     pub trafficSelectorPolicies: *mut IPSEC_TRAFFIC_SELECTOR_POLICY0,
// }

// UNSUPPORTED Rust 4955:1: declaration Impl has no candidate rule
// impl Default for IPSEC_TUNNEL_POLICY3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4960:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IPSEC_V4_UDP_ENCAPSULATION0 {
//     pub localUdpEncapPort: u16,
//     pub remoteUdpEncapPort: u16,
// }

// UNSUPPORTED Rust 4966:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IPSEC_VIRTUAL_IF_TUNNEL_INFO0 {
//     pub virtualIfTunnelId: u64,
//     pub trafficSelectorId: u64,
// }

