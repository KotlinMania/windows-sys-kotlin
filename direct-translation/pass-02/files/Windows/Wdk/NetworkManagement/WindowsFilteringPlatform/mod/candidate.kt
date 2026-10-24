// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
// windows_link::link!("fwpkclnt.sys" "system" fn FwpmBfeStateGet0() -> super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: FWPM_SERVICE_STATE);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
// windows_link::link!("fwpkclnt.sys" "system" fn FwpmBfeStateSubscribeChanges0(deviceobject : *mut core::ffi::c_void, callback : FWPM_SERVICE_STATE_CHANGE_CALLBACK0, context : *const core::ffi::c_void, changehandle : *mut super::super::super::Win32::Foundation:: HANDLE) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("fwpkclnt.sys" "system" fn FwpmBfeStateUnsubscribeChanges0(changehandle : super::super::super::Win32::Foundation:: HANDLE) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmCalloutAdd0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, callout : *const super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: FWPM_CALLOUT0, sd : super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR, id : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmCalloutCreateEnumHandle0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, enumtemplate : *const super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: FWPM_CALLOUT_ENUM_TEMPLATE0, enumhandle : *mut super::super::super::Win32::Foundation:: HANDLE) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmCalloutDeleteById0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, id : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmCalloutDeleteByKey0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, key : *const windows_sys::core::GUID) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmCalloutDestroyEnumHandle0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, enumhandle : super::super::super::Win32::Foundation:: HANDLE) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmCalloutEnum0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, enumhandle : super::super::super::Win32::Foundation:: HANDLE, numentriesrequested : u32, entries : *mut *mut *mut super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: FWPM_CALLOUT0, numentriesreturned : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmCalloutGetById0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, id : u32, callout : *mut *mut super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: FWPM_CALLOUT0) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmCalloutGetByKey0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, key : *const windows_sys::core::GUID, callout : *mut *mut super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: FWPM_CALLOUT0) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmCalloutGetSecurityInfoByKey0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, key : *const windows_sys::core::GUID, securityinfo : u32, sidowner : *mut super::super::super::Win32::Security:: PSID, sidgroup : *mut super::super::super::Win32::Security:: PSID, dacl : *mut *mut super::super::super::Win32::Security:: ACL, sacl : *mut *mut super::super::super::Win32::Security:: ACL, securitydescriptor : *mut super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmCalloutSetSecurityInfoByKey0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, key : *const windows_sys::core::GUID, securityinfo : u32, sidowner : *const super::super::super::Win32::Security:: SID, sidgroup : *const super::super::super::Win32::Security:: SID, dacl : *const super::super::super::Win32::Security:: ACL, sacl : *const super::super::super::Win32::Security:: ACL) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmConnectionCreateEnumHandle0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, enumtemplate : *const super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: FWPM_CONNECTION_ENUM_TEMPLATE0, enumhandle : *mut super::super::super::Win32::Foundation:: HANDLE) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmConnectionDestroyEnumHandle0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, enumhandle : super::super::super::Win32::Foundation:: HANDLE) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmConnectionEnum0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, enumhandle : super::super::super::Win32::Foundation:: HANDLE, numentriesrequested : u32, entries : *mut *mut *mut super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: FWPM_CONNECTION0, numentriesreturned : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmConnectionGetById0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, id : u64, connection : *mut *mut super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: FWPM_CONNECTION0) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 30:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmConnectionGetSecurityInfo0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, securityinfo : u32, sidowner : *mut super::super::super::Win32::Security:: PSID, sidgroup : *mut super::super::super::Win32::Security:: PSID, dacl : *mut *mut super::super::super::Win32::Security:: ACL, sacl : *mut *mut super::super::super::Win32::Security:: ACL, securitydescriptor : *mut super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 32:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmConnectionSetSecurityInfo0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, securityinfo : u32, sidowner : *const super::super::super::Win32::Security:: SID, sidgroup : *const super::super::super::Win32::Security:: SID, dacl : *const super::super::super::Win32::Security:: ACL, sacl : *const super::super::super::Win32::Security:: ACL) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 34:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmEngineClose0(enginehandle : super::super::super::Win32::Foundation:: HANDLE) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 35:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmEngineGetOption0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, option : super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: FWPM_ENGINE_OPTION, value : *mut *mut super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: FWP_VALUE0) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 37:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmEngineGetSecurityInfo0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, securityinfo : u32, sidowner : *mut super::super::super::Win32::Security:: PSID, sidgroup : *mut super::super::super::Win32::Security:: PSID, dacl : *mut *mut super::super::super::Win32::Security:: ACL, sacl : *mut *mut super::super::super::Win32::Security:: ACL, securitydescriptor : *mut super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 39:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security", feature = "Win32_System_Rpc"))]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmEngineOpen0(servername : windows_sys::core::PCWSTR, authnservice : u32, authidentity : *const super::super::super::Win32::System::Rpc:: SEC_WINNT_AUTH_IDENTITY_W, session : *const super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: FWPM_SESSION0, enginehandle : *mut super::super::super::Win32::Foundation:: HANDLE) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 41:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmEngineSetOption0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, option : super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: FWPM_ENGINE_OPTION, newvalue : *const super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: FWP_VALUE0) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 43:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmEngineSetSecurityInfo0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, securityinfo : u32, sidowner : *const super::super::super::Win32::Security:: SID, sidgroup : *const super::super::super::Win32::Security:: SID, dacl : *const super::super::super::Win32::Security:: ACL, sacl : *const super::super::super::Win32::Security:: ACL) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 45:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmFilterAdd0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, filter : *const super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: FWPM_FILTER0, sd : super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR, id : *mut u64) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 47:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmFilterCreateEnumHandle0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, enumtemplate : *const super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: FWPM_FILTER_ENUM_TEMPLATE0, enumhandle : *mut super::super::super::Win32::Foundation:: HANDLE) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 49:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmFilterDeleteById0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, id : u64) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 50:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmFilterDeleteByKey0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, key : *const windows_sys::core::GUID) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 51:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmFilterDestroyEnumHandle0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, enumhandle : super::super::super::Win32::Foundation:: HANDLE) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 52:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmFilterEnum0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, enumhandle : super::super::super::Win32::Foundation:: HANDLE, numentriesrequested : u32, entries : *mut *mut *mut super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: FWPM_FILTER0, numentriesreturned : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 54:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmFilterGetById0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, id : u64, filter : *mut *mut super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: FWPM_FILTER0) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 56:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmFilterGetByKey0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, key : *const windows_sys::core::GUID, filter : *mut *mut super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: FWPM_FILTER0) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 58:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmFilterGetSecurityInfoByKey0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, key : *const windows_sys::core::GUID, securityinfo : u32, sidowner : *mut super::super::super::Win32::Security:: PSID, sidgroup : *mut super::super::super::Win32::Security:: PSID, dacl : *mut *mut super::super::super::Win32::Security:: ACL, sacl : *mut *mut super::super::super::Win32::Security:: ACL, securitydescriptor : *mut super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 60:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmFilterSetSecurityInfoByKey0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, key : *const windows_sys::core::GUID, securityinfo : u32, sidowner : *const super::super::super::Win32::Security:: SID, sidgroup : *const super::super::super::Win32::Security:: SID, dacl : *const super::super::super::Win32::Security:: ACL, sacl : *const super::super::super::Win32::Security:: ACL) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 62:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmFreeMemory0(p : *mut *mut core::ffi::c_void));

// UNSUPPORTED Rust 63:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmIPsecTunnelAdd0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, flags : u32, mainmodepolicy : *const super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: FWPM_PROVIDER_CONTEXT0, tunnelpolicy : *const super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: FWPM_PROVIDER_CONTEXT0, numfilterconditions : u32, filterconditions : *const super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: FWPM_FILTER_CONDITION0, sd : super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 65:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmIPsecTunnelAdd1(enginehandle : super::super::super::Win32::Foundation:: HANDLE, flags : u32, mainmodepolicy : *const super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: FWPM_PROVIDER_CONTEXT1, tunnelpolicy : *const super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: FWPM_PROVIDER_CONTEXT1, numfilterconditions : u32, filterconditions : *const super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: FWPM_FILTER_CONDITION0, keymodkey : *const windows_sys::core::GUID, sd : super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 67:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmIPsecTunnelAdd2(enginehandle : super::super::super::Win32::Foundation:: HANDLE, flags : u32, mainmodepolicy : *const super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: FWPM_PROVIDER_CONTEXT2, tunnelpolicy : *const super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: FWPM_PROVIDER_CONTEXT2, numfilterconditions : u32, filterconditions : *const super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: FWPM_FILTER_CONDITION0, keymodkey : *const windows_sys::core::GUID, sd : super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 69:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmIPsecTunnelAdd3(enginehandle : super::super::super::Win32::Foundation:: HANDLE, flags : u32, mainmodepolicy : *const super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: FWPM_PROVIDER_CONTEXT3, tunnelpolicy : *const super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: FWPM_PROVIDER_CONTEXT3, numfilterconditions : u32, filterconditions : *const super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: FWPM_FILTER_CONDITION0, keymodkey : *const windows_sys::core::GUID, sd : super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 71:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmIPsecTunnelDeleteByKey0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, key : *const windows_sys::core::GUID) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 72:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmLayerCreateEnumHandle0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, enumtemplate : *const super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: FWPM_LAYER_ENUM_TEMPLATE0, enumhandle : *mut super::super::super::Win32::Foundation:: HANDLE) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 74:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmLayerDestroyEnumHandle0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, enumhandle : super::super::super::Win32::Foundation:: HANDLE) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 75:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmLayerEnum0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, enumhandle : super::super::super::Win32::Foundation:: HANDLE, numentriesrequested : u32, entries : *mut *mut *mut super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: FWPM_LAYER0, numentriesreturned : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 77:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmLayerGetById0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, id : u16, layer : *mut *mut super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: FWPM_LAYER0) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 79:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmLayerGetByKey0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, key : *const windows_sys::core::GUID, layer : *mut *mut super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: FWPM_LAYER0) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 81:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmLayerGetSecurityInfoByKey0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, key : *const windows_sys::core::GUID, securityinfo : u32, sidowner : *mut super::super::super::Win32::Security:: PSID, sidgroup : *mut super::super::super::Win32::Security:: PSID, dacl : *mut *mut super::super::super::Win32::Security:: ACL, sacl : *mut *mut super::super::super::Win32::Security:: ACL, securitydescriptor : *mut super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 83:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmLayerSetSecurityInfoByKey0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, key : *const windows_sys::core::GUID, securityinfo : u32, sidowner : *const super::super::super::Win32::Security:: SID, sidgroup : *const super::super::super::Win32::Security:: SID, dacl : *const super::super::super::Win32::Security:: ACL, sacl : *const super::super::super::Win32::Security:: ACL) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 85:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmNetEventCreateEnumHandle0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, enumtemplate : *const super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: FWPM_NET_EVENT_ENUM_TEMPLATE0, enumhandle : *mut super::super::super::Win32::Foundation:: HANDLE) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 87:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmNetEventDestroyEnumHandle0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, enumhandle : super::super::super::Win32::Foundation:: HANDLE) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 88:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmNetEventEnum0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, enumhandle : super::super::super::Win32::Foundation:: HANDLE, numentriesrequested : u32, entries : *mut *mut *mut super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: FWPM_NET_EVENT0, numentriesreturned : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 90:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmNetEventEnum1(enginehandle : super::super::super::Win32::Foundation:: HANDLE, enumhandle : super::super::super::Win32::Foundation:: HANDLE, numentriesrequested : u32, entries : *mut *mut *mut super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: FWPM_NET_EVENT1, numentriesreturned : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 92:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmNetEventEnum2(enginehandle : super::super::super::Win32::Foundation:: HANDLE, enumhandle : super::super::super::Win32::Foundation:: HANDLE, numentriesrequested : u32, entries : *mut *mut *mut super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: FWPM_NET_EVENT2, numentriesreturned : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 94:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmNetEventEnum3(enginehandle : super::super::super::Win32::Foundation:: HANDLE, enumhandle : super::super::super::Win32::Foundation:: HANDLE, numentriesrequested : u32, entries : *mut *mut *mut super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: FWPM_NET_EVENT3, numentriesreturned : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 96:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmNetEventEnum4(enginehandle : super::super::super::Win32::Foundation:: HANDLE, enumhandle : super::super::super::Win32::Foundation:: HANDLE, numentriesrequested : u32, entries : *mut *mut *mut super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: FWPM_NET_EVENT4, numentriesreturned : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 98:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmNetEventEnum5(enginehandle : super::super::super::Win32::Foundation:: HANDLE, enumhandle : super::super::super::Win32::Foundation:: HANDLE, numentriesrequested : u32, entries : *mut *mut *mut super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: FWPM_NET_EVENT5, numentriesreturned : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 100:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmNetEventsGetSecurityInfo0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, securityinfo : u32, sidowner : *mut super::super::super::Win32::Security:: PSID, sidgroup : *mut super::super::super::Win32::Security:: PSID, dacl : *mut *mut super::super::super::Win32::Security:: ACL, sacl : *mut *mut super::super::super::Win32::Security:: ACL, securitydescriptor : *mut super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 102:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmNetEventsSetSecurityInfo0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, securityinfo : u32, sidowner : *const super::super::super::Win32::Security:: SID, sidgroup : *const super::super::super::Win32::Security:: SID, dacl : *const super::super::super::Win32::Security:: ACL, sacl : *const super::super::super::Win32::Security:: ACL) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 104:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmProviderAdd0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, provider : *const super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: FWPM_PROVIDER0, sd : super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 106:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmProviderContextAdd0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, providercontext : *const super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: FWPM_PROVIDER_CONTEXT0, sd : super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR, id : *mut u64) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 108:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmProviderContextAdd1(enginehandle : super::super::super::Win32::Foundation:: HANDLE, providercontext : *const super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: FWPM_PROVIDER_CONTEXT1, sd : super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR, id : *mut u64) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 110:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmProviderContextAdd2(enginehandle : super::super::super::Win32::Foundation:: HANDLE, providercontext : *const super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: FWPM_PROVIDER_CONTEXT2, sd : super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR, id : *mut u64) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 112:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmProviderContextAdd3(enginehandle : super::super::super::Win32::Foundation:: HANDLE, providercontext : *const super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: FWPM_PROVIDER_CONTEXT3, sd : super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR, id : *mut u64) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 114:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmProviderContextCreateEnumHandle0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, enumtemplate : *const super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: FWPM_PROVIDER_CONTEXT_ENUM_TEMPLATE0, enumhandle : *mut super::super::super::Win32::Foundation:: HANDLE) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 116:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmProviderContextDeleteById0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, id : u64) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 117:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmProviderContextDeleteByKey0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, key : *const windows_sys::core::GUID) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 118:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmProviderContextDestroyEnumHandle0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, enumhandle : super::super::super::Win32::Foundation:: HANDLE) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 119:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmProviderContextEnum0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, enumhandle : super::super::super::Win32::Foundation:: HANDLE, numentriesrequested : u32, entries : *mut *mut *mut super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: FWPM_PROVIDER_CONTEXT0, numentriesreturned : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 121:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmProviderContextEnum1(enginehandle : super::super::super::Win32::Foundation:: HANDLE, enumhandle : super::super::super::Win32::Foundation:: HANDLE, numentriesrequested : u32, entries : *mut *mut *mut super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: FWPM_PROVIDER_CONTEXT1, numentriesreturned : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 123:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmProviderContextEnum2(enginehandle : super::super::super::Win32::Foundation:: HANDLE, enumhandle : super::super::super::Win32::Foundation:: HANDLE, numentriesrequested : u32, entries : *mut *mut *mut super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: FWPM_PROVIDER_CONTEXT2, numentriesreturned : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 125:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmProviderContextEnum3(enginehandle : super::super::super::Win32::Foundation:: HANDLE, enumhandle : super::super::super::Win32::Foundation:: HANDLE, numentriesrequested : u32, entries : *mut *mut *mut super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: FWPM_PROVIDER_CONTEXT3, numentriesreturned : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 127:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmProviderContextGetById0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, id : u64, providercontext : *mut *mut super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: FWPM_PROVIDER_CONTEXT0) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 129:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmProviderContextGetById1(enginehandle : super::super::super::Win32::Foundation:: HANDLE, id : u64, providercontext : *mut *mut super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: FWPM_PROVIDER_CONTEXT1) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 131:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmProviderContextGetById2(enginehandle : super::super::super::Win32::Foundation:: HANDLE, id : u64, providercontext : *mut *mut super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: FWPM_PROVIDER_CONTEXT2) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 133:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmProviderContextGetById3(enginehandle : super::super::super::Win32::Foundation:: HANDLE, id : u64, providercontext : *mut *mut super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: FWPM_PROVIDER_CONTEXT3) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 135:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmProviderContextGetByKey0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, key : *const windows_sys::core::GUID, providercontext : *mut *mut super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: FWPM_PROVIDER_CONTEXT0) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 137:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmProviderContextGetByKey1(enginehandle : super::super::super::Win32::Foundation:: HANDLE, key : *const windows_sys::core::GUID, providercontext : *mut *mut super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: FWPM_PROVIDER_CONTEXT1) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 139:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmProviderContextGetByKey2(enginehandle : super::super::super::Win32::Foundation:: HANDLE, key : *const windows_sys::core::GUID, providercontext : *mut *mut super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: FWPM_PROVIDER_CONTEXT2) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 141:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmProviderContextGetByKey3(enginehandle : super::super::super::Win32::Foundation:: HANDLE, key : *const windows_sys::core::GUID, providercontext : *mut *mut super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: FWPM_PROVIDER_CONTEXT3) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 143:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmProviderContextGetSecurityInfoByKey0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, key : *const windows_sys::core::GUID, securityinfo : u32, sidowner : *mut super::super::super::Win32::Security:: PSID, sidgroup : *mut super::super::super::Win32::Security:: PSID, dacl : *mut *mut super::super::super::Win32::Security:: ACL, sacl : *mut *mut super::super::super::Win32::Security:: ACL, securitydescriptor : *mut super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 145:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmProviderContextSetSecurityInfoByKey0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, key : *const windows_sys::core::GUID, securityinfo : u32, sidowner : *const super::super::super::Win32::Security:: SID, sidgroup : *const super::super::super::Win32::Security:: SID, dacl : *const super::super::super::Win32::Security:: ACL, sacl : *const super::super::super::Win32::Security:: ACL) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 147:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmProviderCreateEnumHandle0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, enumtemplate : *const super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: FWPM_PROVIDER_ENUM_TEMPLATE0, enumhandle : *mut super::super::super::Win32::Foundation:: HANDLE) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 149:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmProviderDeleteByKey0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, key : *const windows_sys::core::GUID) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 150:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmProviderDestroyEnumHandle0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, enumhandle : super::super::super::Win32::Foundation:: HANDLE) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 151:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmProviderEnum0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, enumhandle : super::super::super::Win32::Foundation:: HANDLE, numentriesrequested : u32, entries : *mut *mut *mut super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: FWPM_PROVIDER0, numentriesreturned : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 153:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmProviderGetByKey0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, key : *const windows_sys::core::GUID, provider : *mut *mut super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: FWPM_PROVIDER0) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 155:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmProviderGetSecurityInfoByKey0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, key : *const windows_sys::core::GUID, securityinfo : u32, sidowner : *mut super::super::super::Win32::Security:: PSID, sidgroup : *mut super::super::super::Win32::Security:: PSID, dacl : *mut *mut super::super::super::Win32::Security:: ACL, sacl : *mut *mut super::super::super::Win32::Security:: ACL, securitydescriptor : *mut super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 157:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmProviderSetSecurityInfoByKey0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, key : *const windows_sys::core::GUID, securityinfo : u32, sidowner : *const super::super::super::Win32::Security:: SID, sidgroup : *const super::super::super::Win32::Security:: SID, dacl : *const super::super::super::Win32::Security:: ACL, sacl : *const super::super::super::Win32::Security:: ACL) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 159:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmSessionCreateEnumHandle0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, enumtemplate : *const super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: FWPM_SESSION_ENUM_TEMPLATE0, enumhandle : *mut super::super::super::Win32::Foundation:: HANDLE) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 161:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmSessionDestroyEnumHandle0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, enumhandle : super::super::super::Win32::Foundation:: HANDLE) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 162:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmSessionEnum0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, enumhandle : super::super::super::Win32::Foundation:: HANDLE, numentriesrequested : u32, entries : *mut *mut *mut super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: FWPM_SESSION0, numentriesreturned : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 164:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmSubLayerAdd0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, sublayer : *const super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: FWPM_SUBLAYER0, sd : super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 166:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmSubLayerCreateEnumHandle0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, enumtemplate : *const super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: FWPM_SUBLAYER_ENUM_TEMPLATE0, enumhandle : *mut super::super::super::Win32::Foundation:: HANDLE) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 168:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmSubLayerDeleteByKey0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, key : *const windows_sys::core::GUID) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 169:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmSubLayerDestroyEnumHandle0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, enumhandle : super::super::super::Win32::Foundation:: HANDLE) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 170:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmSubLayerEnum0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, enumhandle : super::super::super::Win32::Foundation:: HANDLE, numentriesrequested : u32, entries : *mut *mut *mut super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: FWPM_SUBLAYER0, numentriesreturned : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 172:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmSubLayerGetByKey0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, key : *const windows_sys::core::GUID, sublayer : *mut *mut super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: FWPM_SUBLAYER0) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 174:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmSubLayerGetSecurityInfoByKey0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, key : *const windows_sys::core::GUID, securityinfo : u32, sidowner : *mut super::super::super::Win32::Security:: PSID, sidgroup : *mut super::super::super::Win32::Security:: PSID, dacl : *mut *mut super::super::super::Win32::Security:: ACL, sacl : *mut *mut super::super::super::Win32::Security:: ACL, securitydescriptor : *mut super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 176:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmSubLayerSetSecurityInfoByKey0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, key : *const windows_sys::core::GUID, securityinfo : u32, sidowner : *const super::super::super::Win32::Security:: SID, sidgroup : *const super::super::super::Win32::Security:: SID, dacl : *const super::super::super::Win32::Security:: ACL, sacl : *const super::super::super::Win32::Security:: ACL) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 178:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmTransactionAbort0(enginehandle : super::super::super::Win32::Foundation:: HANDLE) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 179:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmTransactionBegin0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, flags : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 180:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmTransactionCommit0(enginehandle : super::super::super::Win32::Foundation:: HANDLE) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 181:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmvSwitchEventsGetSecurityInfo0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, securityinfo : u32, sidowner : *mut super::super::super::Win32::Security:: PSID, sidgroup : *mut super::super::super::Win32::Security:: PSID, dacl : *mut *mut super::super::super::Win32::Security:: ACL, sacl : *mut *mut super::super::super::Win32::Security:: ACL, securitydescriptor : *mut super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 183:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn FwpmvSwitchEventsSetSecurityInfo0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, securityinfo : u32, sidowner : *const super::super::super::Win32::Security:: SID, sidgroup : *const super::super::super::Win32::Security:: SID, dacl : *const super::super::super::Win32::Security:: ACL, sacl : *const super::super::super::Win32::Security:: ACL) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 185:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecDospGetSecurityInfo0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, securityinfo : u32, sidowner : *mut super::super::super::Win32::Security:: PSID, sidgroup : *mut super::super::super::Win32::Security:: PSID, dacl : *mut *mut super::super::super::Win32::Security:: ACL, sacl : *mut *mut super::super::super::Win32::Security:: ACL, securitydescriptor : *mut super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 187:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecDospGetStatistics0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, idpstatistics : *mut super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: IPSEC_DOSP_STATISTICS0) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 189:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecDospSetSecurityInfo0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, securityinfo : u32, sidowner : *const super::super::super::Win32::Security:: SID, sidgroup : *const super::super::super::Win32::Security:: SID, dacl : *const super::super::super::Win32::Security:: ACL, sacl : *const super::super::super::Win32::Security:: ACL) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 191:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecDospStateCreateEnumHandle0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, enumtemplate : *const super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: IPSEC_DOSP_STATE_ENUM_TEMPLATE0, enumhandle : *mut super::super::super::Win32::Foundation:: HANDLE) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 193:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecDospStateDestroyEnumHandle0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, enumhandle : super::super::super::Win32::Foundation:: HANDLE) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 194:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecDospStateEnum0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, enumhandle : super::super::super::Win32::Foundation:: HANDLE, numentriesrequested : u32, entries : *mut *mut *mut super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: IPSEC_DOSP_STATE0, numentries : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 196:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecGetStatistics0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, ipsecstatistics : *mut super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: IPSEC_STATISTICS0) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 198:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecGetStatistics1(enginehandle : super::super::super::Win32::Foundation:: HANDLE, ipsecstatistics : *mut super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: IPSEC_STATISTICS1) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 200:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecSaContextAddInbound0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, id : u64, inboundbundle : *const super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: IPSEC_SA_BUNDLE0) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 202:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecSaContextAddInbound1(enginehandle : super::super::super::Win32::Foundation:: HANDLE, id : u64, inboundbundle : *const super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: IPSEC_SA_BUNDLE1) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 204:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecSaContextAddOutbound0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, id : u64, outboundbundle : *const super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: IPSEC_SA_BUNDLE0) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 206:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecSaContextAddOutbound1(enginehandle : super::super::super::Win32::Foundation:: HANDLE, id : u64, outboundbundle : *const super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: IPSEC_SA_BUNDLE1) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 208:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecSaContextCreate0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, outboundtraffic : *const super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: IPSEC_TRAFFIC0, inboundfilterid : *mut u64, id : *mut u64) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 210:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecSaContextCreate1(enginehandle : super::super::super::Win32::Foundation:: HANDLE, outboundtraffic : *const super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: IPSEC_TRAFFIC1, virtualiftunnelinfo : *const super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: IPSEC_VIRTUAL_IF_TUNNEL_INFO0, inboundfilterid : *mut u64, id : *mut u64) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 212:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecSaContextCreateEnumHandle0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, enumtemplate : *const super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: IPSEC_SA_CONTEXT_ENUM_TEMPLATE0, enumhandle : *mut super::super::super::Win32::Foundation:: HANDLE) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 214:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecSaContextDeleteById0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, id : u64) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 215:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecSaContextDestroyEnumHandle0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, enumhandle : super::super::super::Win32::Foundation:: HANDLE) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 216:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecSaContextEnum0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, enumhandle : super::super::super::Win32::Foundation:: HANDLE, numentriesrequested : u32, entries : *mut *mut *mut super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: IPSEC_SA_CONTEXT0, numentriesreturned : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 218:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecSaContextEnum1(enginehandle : super::super::super::Win32::Foundation:: HANDLE, enumhandle : super::super::super::Win32::Foundation:: HANDLE, numentriesrequested : u32, entries : *mut *mut *mut super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: IPSEC_SA_CONTEXT1, numentriesreturned : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 220:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecSaContextExpire0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, id : u64) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 221:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecSaContextGetById0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, id : u64, sacontext : *mut *mut super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: IPSEC_SA_CONTEXT0) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 223:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecSaContextGetById1(enginehandle : super::super::super::Win32::Foundation:: HANDLE, id : u64, sacontext : *mut *mut super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: IPSEC_SA_CONTEXT1) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 225:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecSaContextGetSpi0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, id : u64, getspi : *const super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: IPSEC_GETSPI0, inboundspi : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 227:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecSaContextGetSpi1(enginehandle : super::super::super::Win32::Foundation:: HANDLE, id : u64, getspi : *const super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: IPSEC_GETSPI1, inboundspi : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 229:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecSaContextSetSpi0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, id : u64, getspi : *const super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: IPSEC_GETSPI1, inboundspi : u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 231:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecSaContextUpdate0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, flags : u64, newvalues : *const super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: IPSEC_SA_CONTEXT1) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 233:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecSaCreateEnumHandle0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, enumtemplate : *const super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: IPSEC_SA_ENUM_TEMPLATE0, enumhandle : *mut super::super::super::Win32::Foundation:: HANDLE) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 235:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecSaDbGetSecurityInfo0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, securityinfo : u32, sidowner : *mut super::super::super::Win32::Security:: PSID, sidgroup : *mut super::super::super::Win32::Security:: PSID, dacl : *mut *mut super::super::super::Win32::Security:: ACL, sacl : *mut *mut super::super::super::Win32::Security:: ACL, securitydescriptor : *mut super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 237:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecSaDbSetSecurityInfo0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, securityinfo : u32, sidowner : *const super::super::super::Win32::Security:: SID, sidgroup : *const super::super::super::Win32::Security:: SID, dacl : *const super::super::super::Win32::Security:: ACL, sacl : *const super::super::super::Win32::Security:: ACL) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 239:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecSaDestroyEnumHandle0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, enumhandle : super::super::super::Win32::Foundation:: HANDLE) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 240:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecSaEnum0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, enumhandle : super::super::super::Win32::Foundation:: HANDLE, numentriesrequested : u32, entries : *mut *mut *mut super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: IPSEC_SA_DETAILS0, numentriesreturned : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 242:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
// windows_link::link!("fwpuclnt.dll" "system" fn IPsecSaEnum1(enginehandle : super::super::super::Win32::Foundation:: HANDLE, enumhandle : super::super::super::Win32::Foundation:: HANDLE, numentriesrequested : u32, entries : *mut *mut *mut super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: IPSEC_SA_DETAILS1, numentriesreturned : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 244:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
// windows_link::link!("fwpuclnt.dll" "system" fn IkeextGetStatistics0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, ikeextstatistics : *mut super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: IKEEXT_STATISTICS0) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 246:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
// windows_link::link!("fwpuclnt.dll" "system" fn IkeextGetStatistics1(enginehandle : super::super::super::Win32::Foundation:: HANDLE, ikeextstatistics : *mut super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: IKEEXT_STATISTICS1) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 248:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_NetworkManagement_WindowsFilteringPlatform", feature = "Win32_Security"))]
// windows_link::link!("fwpuclnt.dll" "system" fn IkeextSaCreateEnumHandle0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, enumtemplate : *const super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: IKEEXT_SA_ENUM_TEMPLATE0, enumhandle : *mut super::super::super::Win32::Foundation:: HANDLE) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 250:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn IkeextSaDbGetSecurityInfo0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, securityinfo : u32, sidowner : *mut super::super::super::Win32::Security:: PSID, sidgroup : *mut super::super::super::Win32::Security:: PSID, dacl : *mut *mut super::super::super::Win32::Security:: ACL, sacl : *mut *mut super::super::super::Win32::Security:: ACL, securitydescriptor : *mut super::super::super::Win32::Security:: PSECURITY_DESCRIPTOR) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 252:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("fwpuclnt.dll" "system" fn IkeextSaDbSetSecurityInfo0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, securityinfo : u32, sidowner : *const super::super::super::Win32::Security:: SID, sidgroup : *const super::super::super::Win32::Security:: SID, dacl : *const super::super::super::Win32::Security:: ACL, sacl : *const super::super::super::Win32::Security:: ACL) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 254:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn IkeextSaDeleteById0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, id : u64) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 255:1: declaration Macro has no candidate rule
// windows_link::link!("fwpuclnt.dll" "system" fn IkeextSaDestroyEnumHandle0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, enumhandle : super::super::super::Win32::Foundation:: HANDLE) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 256:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
// windows_link::link!("fwpuclnt.dll" "system" fn IkeextSaEnum0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, enumhandle : super::super::super::Win32::Foundation:: HANDLE, numentriesrequested : u32, entries : *mut *mut *mut super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: IKEEXT_SA_DETAILS0, numentriesreturned : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 258:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
// windows_link::link!("fwpuclnt.dll" "system" fn IkeextSaEnum1(enginehandle : super::super::super::Win32::Foundation:: HANDLE, enumhandle : super::super::super::Win32::Foundation:: HANDLE, numentriesrequested : u32, entries : *mut *mut *mut super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: IKEEXT_SA_DETAILS1, numentriesreturned : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 260:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
// windows_link::link!("fwpuclnt.dll" "system" fn IkeextSaEnum2(enginehandle : super::super::super::Win32::Foundation:: HANDLE, enumhandle : super::super::super::Win32::Foundation:: HANDLE, numentriesrequested : u32, entries : *mut *mut *mut super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: IKEEXT_SA_DETAILS2, numentriesreturned : *mut u32) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 262:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
// windows_link::link!("fwpuclnt.dll" "system" fn IkeextSaGetById0(enginehandle : super::super::super::Win32::Foundation:: HANDLE, id : u64, sa : *mut *mut super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: IKEEXT_SA_DETAILS0) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 264:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
// windows_link::link!("fwpuclnt.dll" "system" fn IkeextSaGetById1(enginehandle : super::super::super::Win32::Foundation:: HANDLE, id : u64, salookupcontext : *const windows_sys::core::GUID, sa : *mut *mut super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: IKEEXT_SA_DETAILS1) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 266:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
// windows_link::link!("fwpuclnt.dll" "system" fn IkeextSaGetById2(enginehandle : super::super::super::Win32::Foundation:: HANDLE, id : u64, salookupcontext : *const windows_sys::core::GUID, sa : *mut *mut super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform:: IKEEXT_SA_DETAILS2) -> super::super::super::Win32::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 268:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_NetworkManagement_WindowsFilteringPlatform")]
// pub type FWPM_SERVICE_STATE_CHANGE_CALLBACK0 = Option<unsafe extern "system" fn(context: *mut core::ffi::c_void, newstate: super::super::super::Win32::NetworkManagement::WindowsFilteringPlatform::FWPM_SERVICE_STATE)>;

