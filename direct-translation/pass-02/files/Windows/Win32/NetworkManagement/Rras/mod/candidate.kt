// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn MgmAddGroupMembershipEntry(hprotocol : super::super::Foundation:: HANDLE, dwsourceaddr : u32, dwsourcemask : u32, dwgroupaddr : u32, dwgroupmask : u32, dwifindex : u32, dwifnexthopipaddr : u32, dwflags : u32) -> u32);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn MgmDeRegisterMProtocol(hprotocol : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn MgmDeleteGroupMembershipEntry(hprotocol : super::super::Foundation:: HANDLE, dwsourceaddr : u32, dwsourcemask : u32, dwgroupaddr : u32, dwgroupmask : u32, dwifindex : u32, dwifnexthopipaddr : u32, dwflags : u32) -> u32);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn MgmGetFirstMfe(pdwbuffersize : *mut u32, pbbuffer : *mut u8, pdwnumentries : *mut u32) -> u32);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn MgmGetFirstMfeStats(pdwbuffersize : *mut u32, pbbuffer : *mut u8, pdwnumentries : *mut u32, dwflags : u32) -> u32);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_IpHelper")]
// windows_link::link!("rtm.dll" "system" fn MgmGetMfe(pimm : *mut super::IpHelper:: MIB_IPMCAST_MFE, pdwbuffersize : *mut u32, pbbuffer : *mut u8) -> u32);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_IpHelper")]
// windows_link::link!("rtm.dll" "system" fn MgmGetMfeStats(pimm : *mut super::IpHelper:: MIB_IPMCAST_MFE, pdwbuffersize : *mut u32, pbbuffer : *mut u8, dwflags : u32) -> u32);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_IpHelper")]
// windows_link::link!("rtm.dll" "system" fn MgmGetNextMfe(pimmstart : *mut super::IpHelper:: MIB_IPMCAST_MFE, pdwbuffersize : *mut u32, pbbuffer : *mut u8, pdwnumentries : *mut u32) -> u32);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_IpHelper")]
// windows_link::link!("rtm.dll" "system" fn MgmGetNextMfeStats(pimmstart : *mut super::IpHelper:: MIB_IPMCAST_MFE, pdwbuffersize : *mut u32, pbbuffer : *mut u8, pdwnumentries : *mut u32, dwflags : u32) -> u32);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn MgmGetProtocolOnInterface(dwifindex : u32, dwifnexthopaddr : u32, pdwifprotocolid : *mut u32, pdwifcomponentid : *mut u32) -> u32);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn MgmGroupEnumerationEnd(henum : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn MgmGroupEnumerationGetNext(henum : super::super::Foundation:: HANDLE, pdwbuffersize : *mut u32, pbbuffer : *mut u8, pdwnumentries : *mut u32) -> u32);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn MgmGroupEnumerationStart(hprotocol : super::super::Foundation:: HANDLE, metenumtype : MGM_ENUM_TYPES, phenumhandle : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn MgmRegisterMProtocol(prpiinfo : *mut ROUTING_PROTOCOL_CONFIG, dwprotocolid : u32, dwcomponentid : u32, phprotocol : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn MgmReleaseInterfaceOwnership(hprotocol : super::super::Foundation:: HANDLE, dwifindex : u32, dwifnexthopaddr : u32) -> u32);

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn MgmTakeInterfaceOwnership(hprotocol : super::super::Foundation:: HANDLE, dwifindex : u32, dwifnexthopaddr : u32) -> u32);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprAdminBufferFree(pbuffer : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprAdminConnectionClearStats(hrasserver : isize, hrasconnection : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprAdminConnectionEnum(hrasserver : isize, dwlevel : u32, lplpbbuffer : *mut *mut u8, dwprefmaxlen : u32, lpdwentriesread : *mut u32, lpdwtotalentries : *mut u32, lpdwresumehandle : *const u32) -> u32);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprAdminConnectionEnumEx(hrasserver : isize, pobjectheader : *const MPRAPI_OBJECT_HEADER, dwpreferedmaxlen : u32, lpdwentriesread : *mut u32, lpdwtotalentries : *mut u32, pprasconn : *mut *mut RAS_CONNECTION_EX, lpdwresumehandle : *const u32) -> u32);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprAdminConnectionGetInfo(hrasserver : isize, dwlevel : u32, hrasconnection : super::super::Foundation:: HANDLE, lplpbbuffer : *mut *mut u8) -> u32);

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprAdminConnectionGetInfoEx(hrasserver : isize, hrasconnection : super::super::Foundation:: HANDLE, prasconnection : *mut RAS_CONNECTION_EX) -> u32);

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprAdminConnectionRemoveQuarantine(hrasserver : super::super::Foundation:: HANDLE, hrasconnection : super::super::Foundation:: HANDLE, fisipaddress : windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprAdminDeregisterConnectionNotification(hmprserver : isize, heventnotification : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 29:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprAdminDeviceEnum(hmprserver : isize, dwlevel : u32, lplpbbuffer : *mut *mut u8, lpdwtotalentries : *mut u32) -> u32);

// UNSUPPORTED Rust 30:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprAdminEstablishDomainRasServer(pszdomain : windows_sys::core::PCWSTR, pszmachine : windows_sys::core::PCWSTR, benable : windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 31:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprAdminGetErrorString(dwerror : u32, lplpwserrorstring : *mut windows_sys::core::PWSTR) -> u32);

// UNSUPPORTED Rust 32:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprAdminGetPDCServer(lpszdomain : windows_sys::core::PCWSTR, lpszserver : windows_sys::core::PCWSTR, lpszpdcserver : windows_sys::core::PWSTR) -> u32);

// UNSUPPORTED Rust 33:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprAdminInterfaceConnect(hmprserver : isize, hinterface : super::super::Foundation:: HANDLE, hevent : super::super::Foundation:: HANDLE, fsynchronous : windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 34:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprAdminInterfaceCreate(hmprserver : isize, dwlevel : u32, lpbbuffer : *const u8, phinterface : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 35:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprAdminInterfaceDelete(hmprserver : isize, hinterface : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 36:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprAdminInterfaceDeviceGetInfo(hmprserver : isize, hinterface : super::super::Foundation:: HANDLE, dwindex : u32, dwlevel : u32, lplpbuffer : *mut *mut u8) -> u32);

// UNSUPPORTED Rust 37:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprAdminInterfaceDeviceSetInfo(hmprserver : isize, hinterface : super::super::Foundation:: HANDLE, dwindex : u32, dwlevel : u32, lpbbuffer : *const u8) -> u32);

// UNSUPPORTED Rust 38:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprAdminInterfaceDisconnect(hmprserver : isize, hinterface : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 39:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprAdminInterfaceEnum(hmprserver : isize, dwlevel : u32, lplpbbuffer : *mut *mut u8, dwprefmaxlen : u32, lpdwentriesread : *mut u32, lpdwtotalentries : *mut u32, lpdwresumehandle : *const u32) -> u32);

// UNSUPPORTED Rust 40:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprAdminInterfaceGetCredentials(lpwsserver : windows_sys::core::PCWSTR, lpwsinterfacename : windows_sys::core::PCWSTR, lpwsusername : windows_sys::core::PWSTR, lpwspassword : windows_sys::core::PWSTR, lpwsdomainname : windows_sys::core::PWSTR) -> u32);

// UNSUPPORTED Rust 41:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprAdminInterfaceGetCredentialsEx(hmprserver : isize, hinterface : super::super::Foundation:: HANDLE, dwlevel : u32, lplpbbuffer : *mut *mut u8) -> u32);

// UNSUPPORTED Rust 42:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_Networking_WinSock", feature = "Win32_Security_Cryptography"))]
// windows_link::link!("mprapi.dll" "system" fn MprAdminInterfaceGetCustomInfoEx(hmprserver : isize, hinterface : super::super::Foundation:: HANDLE, pcustominfo : *mut MPR_IF_CUSTOMINFOEX2) -> u32);

// UNSUPPORTED Rust 44:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprAdminInterfaceGetHandle(hmprserver : isize, lpwsinterfacename : windows_sys::core::PCWSTR, phinterface : *mut super::super::Foundation:: HANDLE, fincludeclientinterfaces : windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 45:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprAdminInterfaceGetInfo(hmprserver : isize, hinterface : super::super::Foundation:: HANDLE, dwlevel : u32, lplpbbuffer : *const *const u8) -> u32);

// UNSUPPORTED Rust 46:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprAdminInterfaceQueryUpdateResult(hmprserver : isize, hinterface : super::super::Foundation:: HANDLE, dwprotocolid : u32, lpdwupdateresult : *mut u32) -> u32);

// UNSUPPORTED Rust 47:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprAdminInterfaceSetCredentials(lpwsserver : windows_sys::core::PCWSTR, lpwsinterfacename : windows_sys::core::PCWSTR, lpwsusername : windows_sys::core::PCWSTR, lpwsdomainname : windows_sys::core::PCWSTR, lpwspassword : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 48:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprAdminInterfaceSetCredentialsEx(hmprserver : isize, hinterface : super::super::Foundation:: HANDLE, dwlevel : u32, lpbbuffer : *const u8) -> u32);

// UNSUPPORTED Rust 49:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_Networking_WinSock", feature = "Win32_Security_Cryptography"))]
// windows_link::link!("mprapi.dll" "system" fn MprAdminInterfaceSetCustomInfoEx(hmprserver : isize, hinterface : super::super::Foundation:: HANDLE, pcustominfo : *const MPR_IF_CUSTOMINFOEX2) -> u32);

// UNSUPPORTED Rust 51:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprAdminInterfaceSetInfo(hmprserver : isize, hinterface : super::super::Foundation:: HANDLE, dwlevel : u32, lpbbuffer : *const u8) -> u32);

// UNSUPPORTED Rust 52:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprAdminInterfaceTransportAdd(hmprserver : isize, hinterface : super::super::Foundation:: HANDLE, dwtransportid : u32, pinterfaceinfo : *const u8, dwinterfaceinfosize : u32) -> u32);

// UNSUPPORTED Rust 53:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprAdminInterfaceTransportGetInfo(hmprserver : isize, hinterface : super::super::Foundation:: HANDLE, dwtransportid : u32, ppinterfaceinfo : *mut *mut u8, lpdwinterfaceinfosize : *mut u32) -> u32);

// UNSUPPORTED Rust 54:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprAdminInterfaceTransportRemove(hmprserver : isize, hinterface : super::super::Foundation:: HANDLE, dwtransportid : u32) -> u32);

// UNSUPPORTED Rust 55:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprAdminInterfaceTransportSetInfo(hmprserver : isize, hinterface : super::super::Foundation:: HANDLE, dwtransportid : u32, pinterfaceinfo : *const u8, dwinterfaceinfosize : u32) -> u32);

// UNSUPPORTED Rust 56:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprAdminInterfaceUpdatePhonebookInfo(hmprserver : isize, hinterface : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 57:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprAdminInterfaceUpdateRoutes(hmprserver : isize, hinterface : super::super::Foundation:: HANDLE, dwprotocolid : u32, hevent : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 58:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprAdminIsDomainRasServer(pszdomain : windows_sys::core::PCWSTR, pszmachine : windows_sys::core::PCWSTR, pbisrasserver : *mut windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 59:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprAdminIsServiceInitialized(lpwsservername : windows_sys::core::PCWSTR, fisserviceinitialized : *const windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 60:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprAdminIsServiceRunning(lpwsservername : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 61:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprAdminMIBBufferFree(pbuffer : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 62:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprAdminMIBEntryCreate(hmibserver : isize, dwpid : u32, dwroutingpid : u32, lpentry : *const core::ffi::c_void, dwentrysize : u32) -> u32);

// UNSUPPORTED Rust 63:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprAdminMIBEntryDelete(hmibserver : isize, dwprotocolid : u32, dwroutingpid : u32, lpentry : *const core::ffi::c_void, dwentrysize : u32) -> u32);

// UNSUPPORTED Rust 64:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprAdminMIBEntryGet(hmibserver : isize, dwprotocolid : u32, dwroutingpid : u32, lpinentry : *const core::ffi::c_void, dwinentrysize : u32, lplpoutentry : *mut *mut core::ffi::c_void, lpoutentrysize : *mut u32) -> u32);

// UNSUPPORTED Rust 65:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprAdminMIBEntryGetFirst(hmibserver : isize, dwprotocolid : u32, dwroutingpid : u32, lpinentry : *const core::ffi::c_void, dwinentrysize : u32, lplpoutentry : *mut *mut core::ffi::c_void, lpoutentrysize : *mut u32) -> u32);

// UNSUPPORTED Rust 66:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprAdminMIBEntryGetNext(hmibserver : isize, dwprotocolid : u32, dwroutingpid : u32, lpinentry : *const core::ffi::c_void, dwinentrysize : u32, lplpoutentry : *mut *mut core::ffi::c_void, lpoutentrysize : *mut u32) -> u32);

// UNSUPPORTED Rust 67:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprAdminMIBEntrySet(hmibserver : isize, dwprotocolid : u32, dwroutingpid : u32, lpentry : *const core::ffi::c_void, dwentrysize : u32) -> u32);

// UNSUPPORTED Rust 68:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprAdminMIBServerConnect(lpwsservername : windows_sys::core::PCWSTR, phmibserver : *mut isize) -> u32);

// UNSUPPORTED Rust 69:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprAdminMIBServerDisconnect(hmibserver : isize));

// UNSUPPORTED Rust 70:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprAdminPortClearStats(hrasserver : isize, hport : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 71:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprAdminPortDisconnect(hrasserver : isize, hport : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 72:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprAdminPortEnum(hrasserver : isize, dwlevel : u32, hrasconnection : super::super::Foundation:: HANDLE, lplpbbuffer : *mut *mut u8, dwprefmaxlen : u32, lpdwentriesread : *mut u32, lpdwtotalentries : *mut u32, lpdwresumehandle : *const u32) -> u32);

// UNSUPPORTED Rust 73:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprAdminPortGetInfo(hrasserver : isize, dwlevel : u32, hport : super::super::Foundation:: HANDLE, lplpbbuffer : *mut *mut u8) -> u32);

// UNSUPPORTED Rust 74:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprAdminPortReset(hrasserver : isize, hport : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 75:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprAdminRegisterConnectionNotification(hmprserver : isize, heventnotification : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 76:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprAdminSendUserMessage(hmprserver : isize, hconnection : super::super::Foundation:: HANDLE, lpwszmessage : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 77:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprAdminServerConnect(lpwsservername : windows_sys::core::PCWSTR, phmprserver : *mut isize) -> u32);

// UNSUPPORTED Rust 78:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprAdminServerDisconnect(hmprserver : isize));

// UNSUPPORTED Rust 79:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprAdminServerGetCredentials(hmprserver : isize, dwlevel : u32, lplpbbuffer : *const *const u8) -> u32);

// UNSUPPORTED Rust 80:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprAdminServerGetInfo(hmprserver : isize, dwlevel : u32, lplpbbuffer : *mut *mut u8) -> u32);

// UNSUPPORTED Rust 81:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// windows_link::link!("mprapi.dll" "system" fn MprAdminServerGetInfoEx(hmprserver : isize, pserverinfo : *mut MPR_SERVER_EX1) -> u32);

// UNSUPPORTED Rust 83:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprAdminServerSetCredentials(hmprserver : isize, dwlevel : u32, lpbbuffer : *const u8) -> u32);

// UNSUPPORTED Rust 84:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprAdminServerSetInfo(hmprserver : isize, dwlevel : u32, lpbbuffer : *const u8) -> u32);

// UNSUPPORTED Rust 85:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// windows_link::link!("mprapi.dll" "system" fn MprAdminServerSetInfoEx(hmprserver : isize, pserverinfo : *const MPR_SERVER_SET_CONFIG_EX1) -> u32);

// UNSUPPORTED Rust 87:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprAdminTransportCreate(hmprserver : isize, dwtransportid : u32, lpwstransportname : windows_sys::core::PCWSTR, pglobalinfo : *const u8, dwglobalinfosize : u32, pclientinterfaceinfo : *const u8, dwclientinterfaceinfosize : u32, lpwsdllpath : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 88:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprAdminTransportGetInfo(hmprserver : isize, dwtransportid : u32, ppglobalinfo : *mut *mut u8, lpdwglobalinfosize : *mut u32, ppclientinterfaceinfo : *mut *mut u8, lpdwclientinterfaceinfosize : *mut u32) -> u32);

// UNSUPPORTED Rust 89:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprAdminTransportSetInfo(hmprserver : isize, dwtransportid : u32, pglobalinfo : *const u8, dwglobalinfosize : u32, pclientinterfaceinfo : *const u8, dwclientinterfaceinfosize : u32) -> u32);

// UNSUPPORTED Rust 90:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprAdminUpdateConnection(hrasserver : isize, hrasconnection : super::super::Foundation:: HANDLE, prasupdateconnection : *const RAS_UPDATE_CONNECTION) -> u32);

// UNSUPPORTED Rust 91:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprAdminUserGetInfo(lpszserver : windows_sys::core::PCWSTR, lpszuser : windows_sys::core::PCWSTR, dwlevel : u32, lpbbuffer : *mut u8) -> u32);

// UNSUPPORTED Rust 92:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprAdminUserSetInfo(lpszserver : windows_sys::core::PCWSTR, lpszuser : windows_sys::core::PCWSTR, dwlevel : u32, lpbbuffer : *const u8) -> u32);

// UNSUPPORTED Rust 93:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprConfigBufferFree(pbuffer : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 94:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprConfigFilterGetInfo(hmprconfig : super::super::Foundation:: HANDLE, dwlevel : u32, dwtransportid : u32, lpbuffer : *mut u8) -> u32);

// UNSUPPORTED Rust 95:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprConfigFilterSetInfo(hmprconfig : super::super::Foundation:: HANDLE, dwlevel : u32, dwtransportid : u32, lpbuffer : *const u8) -> u32);

// UNSUPPORTED Rust 96:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprConfigGetFriendlyName(hmprconfig : super::super::Foundation:: HANDLE, pszguidname : windows_sys::core::PCWSTR, pszbuffer : windows_sys::core::PWSTR, dwbuffersize : u32) -> u32);

// UNSUPPORTED Rust 97:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprConfigGetGuidName(hmprconfig : super::super::Foundation:: HANDLE, pszfriendlyname : windows_sys::core::PCWSTR, pszbuffer : windows_sys::core::PWSTR, dwbuffersize : u32) -> u32);

// UNSUPPORTED Rust 98:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprConfigInterfaceCreate(hmprconfig : super::super::Foundation:: HANDLE, dwlevel : u32, lpbbuffer : *const u8, phrouterinterface : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 99:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprConfigInterfaceDelete(hmprconfig : super::super::Foundation:: HANDLE, hrouterinterface : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 100:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprConfigInterfaceEnum(hmprconfig : super::super::Foundation:: HANDLE, dwlevel : u32, lplpbuffer : *mut *mut u8, dwprefmaxlen : u32, lpdwentriesread : *mut u32, lpdwtotalentries : *mut u32, lpdwresumehandle : *mut u32) -> u32);

// UNSUPPORTED Rust 101:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_Networking_WinSock", feature = "Win32_Security_Cryptography"))]
// windows_link::link!("mprapi.dll" "system" fn MprConfigInterfaceGetCustomInfoEx(hmprconfig : super::super::Foundation:: HANDLE, hrouterinterface : super::super::Foundation:: HANDLE, pcustominfo : *mut MPR_IF_CUSTOMINFOEX2) -> u32);

// UNSUPPORTED Rust 103:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprConfigInterfaceGetHandle(hmprconfig : super::super::Foundation:: HANDLE, lpwsinterfacename : windows_sys::core::PCWSTR, phrouterinterface : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 104:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprConfigInterfaceGetInfo(hmprconfig : super::super::Foundation:: HANDLE, hrouterinterface : super::super::Foundation:: HANDLE, dwlevel : u32, lplpbuffer : *mut *mut u8, lpdwbuffersize : *mut u32) -> u32);

// UNSUPPORTED Rust 105:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_Networking_WinSock", feature = "Win32_Security_Cryptography"))]
// windows_link::link!("mprapi.dll" "system" fn MprConfigInterfaceSetCustomInfoEx(hmprconfig : super::super::Foundation:: HANDLE, hrouterinterface : super::super::Foundation:: HANDLE, pcustominfo : *const MPR_IF_CUSTOMINFOEX2) -> u32);

// UNSUPPORTED Rust 107:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprConfigInterfaceSetInfo(hmprconfig : super::super::Foundation:: HANDLE, hrouterinterface : super::super::Foundation:: HANDLE, dwlevel : u32, lpbbuffer : *const u8) -> u32);

// UNSUPPORTED Rust 108:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprConfigInterfaceTransportAdd(hmprconfig : super::super::Foundation:: HANDLE, hrouterinterface : super::super::Foundation:: HANDLE, dwtransportid : u32, lpwstransportname : windows_sys::core::PCWSTR, pinterfaceinfo : *const u8, dwinterfaceinfosize : u32, phrouteriftransport : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 109:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprConfigInterfaceTransportEnum(hmprconfig : super::super::Foundation:: HANDLE, hrouterinterface : super::super::Foundation:: HANDLE, dwlevel : u32, lplpbuffer : *mut *mut u8, dwprefmaxlen : u32, lpdwentriesread : *mut u32, lpdwtotalentries : *mut u32, lpdwresumehandle : *mut u32) -> u32);

// UNSUPPORTED Rust 110:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprConfigInterfaceTransportGetHandle(hmprconfig : super::super::Foundation:: HANDLE, hrouterinterface : super::super::Foundation:: HANDLE, dwtransportid : u32, phrouteriftransport : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 111:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprConfigInterfaceTransportGetInfo(hmprconfig : super::super::Foundation:: HANDLE, hrouterinterface : super::super::Foundation:: HANDLE, hrouteriftransport : super::super::Foundation:: HANDLE, ppinterfaceinfo : *mut *mut u8, lpdwinterfaceinfosize : *mut u32) -> u32);

// UNSUPPORTED Rust 112:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprConfigInterfaceTransportRemove(hmprconfig : super::super::Foundation:: HANDLE, hrouterinterface : super::super::Foundation:: HANDLE, hrouteriftransport : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 113:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprConfigInterfaceTransportSetInfo(hmprconfig : super::super::Foundation:: HANDLE, hrouterinterface : super::super::Foundation:: HANDLE, hrouteriftransport : super::super::Foundation:: HANDLE, pinterfaceinfo : *const u8, dwinterfaceinfosize : u32) -> u32);

// UNSUPPORTED Rust 114:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprConfigServerBackup(hmprconfig : super::super::Foundation:: HANDLE, lpwspath : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 115:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprConfigServerConnect(lpwsservername : windows_sys::core::PCWSTR, phmprconfig : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 116:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprConfigServerDisconnect(hmprconfig : super::super::Foundation:: HANDLE));

// UNSUPPORTED Rust 117:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprConfigServerGetInfo(hmprconfig : super::super::Foundation:: HANDLE, dwlevel : u32, lplpbbuffer : *mut *mut u8) -> u32);

// UNSUPPORTED Rust 118:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// windows_link::link!("mprapi.dll" "system" fn MprConfigServerGetInfoEx(hmprconfig : super::super::Foundation:: HANDLE, pserverinfo : *mut MPR_SERVER_EX1) -> u32);

// UNSUPPORTED Rust 120:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprConfigServerInstall(dwlevel : u32, pbuffer : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 121:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprConfigServerRefresh(hmprconfig : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 122:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprConfigServerRestore(hmprconfig : super::super::Foundation:: HANDLE, lpwspath : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 123:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprConfigServerSetInfo(hmprserver : isize, dwlevel : u32, lpbbuffer : *const u8) -> u32);

// UNSUPPORTED Rust 124:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// windows_link::link!("mprapi.dll" "system" fn MprConfigServerSetInfoEx(hmprconfig : super::super::Foundation:: HANDLE, psetserverconfig : *const MPR_SERVER_SET_CONFIG_EX1) -> u32);

// UNSUPPORTED Rust 126:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprConfigTransportCreate(hmprconfig : super::super::Foundation:: HANDLE, dwtransportid : u32, lpwstransportname : windows_sys::core::PCWSTR, pglobalinfo : *const u8, dwglobalinfosize : u32, pclientinterfaceinfo : *const u8, dwclientinterfaceinfosize : u32, lpwsdllpath : windows_sys::core::PCWSTR, phroutertransport : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 127:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprConfigTransportDelete(hmprconfig : super::super::Foundation:: HANDLE, hroutertransport : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 128:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprConfigTransportEnum(hmprconfig : super::super::Foundation:: HANDLE, dwlevel : u32, lplpbuffer : *mut *mut u8, dwprefmaxlen : u32, lpdwentriesread : *mut u32, lpdwtotalentries : *mut u32, lpdwresumehandle : *mut u32) -> u32);

// UNSUPPORTED Rust 129:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprConfigTransportGetHandle(hmprconfig : super::super::Foundation:: HANDLE, dwtransportid : u32, phroutertransport : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 130:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprConfigTransportGetInfo(hmprconfig : super::super::Foundation:: HANDLE, hroutertransport : super::super::Foundation:: HANDLE, ppglobalinfo : *mut *mut u8, lpdwglobalinfosize : *mut u32, ppclientinterfaceinfo : *mut *mut u8, lpdwclientinterfaceinfosize : *mut u32, lplpwsdllpath : *mut windows_sys::core::PWSTR) -> u32);

// UNSUPPORTED Rust 131:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprConfigTransportSetInfo(hmprconfig : super::super::Foundation:: HANDLE, hroutertransport : super::super::Foundation:: HANDLE, pglobalinfo : *const u8, dwglobalinfosize : u32, pclientinterfaceinfo : *const u8, dwclientinterfaceinfosize : u32, lpwsdllpath : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 132:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprInfoBlockAdd(lpheader : *const core::ffi::c_void, dwinfotype : u32, dwitemsize : u32, dwitemcount : u32, lpitemdata : *const u8, lplpnewheader : *mut *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 133:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprInfoBlockFind(lpheader : *const core::ffi::c_void, dwinfotype : u32, lpdwitemsize : *mut u32, lpdwitemcount : *mut u32, lplpitemdata : *mut *mut u8) -> u32);

// UNSUPPORTED Rust 134:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprInfoBlockQuerySize(lpheader : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 135:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprInfoBlockRemove(lpheader : *const core::ffi::c_void, dwinfotype : u32, lplpnewheader : *mut *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 136:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprInfoBlockSet(lpheader : *const core::ffi::c_void, dwinfotype : u32, dwitemsize : u32, dwitemcount : u32, lpitemdata : *const u8, lplpnewheader : *mut *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 137:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprInfoCreate(dwversion : u32, lplpnewheader : *mut *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 138:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprInfoDelete(lpheader : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 139:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprInfoDuplicate(lpheader : *const core::ffi::c_void, lplpnewheader : *mut *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 140:1: declaration Macro has no candidate rule
// windows_link::link!("mprapi.dll" "system" fn MprInfoRemoveAll(lpheader : *const core::ffi::c_void, lplpnewheader : *mut *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 141:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasClearConnectionStatistics(hrasconn : HRASCONN) -> u32);

// UNSUPPORTED Rust 142:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasClearLinkStatistics(hrasconn : HRASCONN, dwsubentry : u32) -> u32);

// UNSUPPORTED Rust 143:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasConnectionNotificationA(param0 : HRASCONN, param1 : super::super::Foundation:: HANDLE, param2 : u32) -> u32);

// UNSUPPORTED Rust 144:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasConnectionNotificationW(param0 : HRASCONN, param1 : super::super::Foundation:: HANDLE, param2 : u32) -> u32);

// UNSUPPORTED Rust 145:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasCreatePhonebookEntryA(param0 : super::super::Foundation:: HWND, param1 : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 146:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasCreatePhonebookEntryW(param0 : super::super::Foundation:: HWND, param1 : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 147:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasDeleteEntryA(param0 : windows_sys::core::PCSTR, param1 : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 148:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasDeleteEntryW(param0 : windows_sys::core::PCWSTR, param1 : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 149:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasDeleteSubEntryA(pszphonebook : windows_sys::core::PCSTR, pszentry : windows_sys::core::PCSTR, dwsubentryid : u32) -> u32);

// UNSUPPORTED Rust 150:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasDeleteSubEntryW(pszphonebook : windows_sys::core::PCWSTR, pszentry : windows_sys::core::PCWSTR, dwsubentryid : u32) -> u32);

// UNSUPPORTED Rust 151:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasDialA(param0 : *const RASDIALEXTENSIONS, param1 : windows_sys::core::PCSTR, param2 : *const RASDIALPARAMSA, param3 : u32, param4 : *const core::ffi::c_void, param5 : *mut HRASCONN) -> u32);

// UNSUPPORTED Rust 152:1: declaration Macro has no candidate rule
// windows_link::link!("rasdlg.dll" "system" fn RasDialDlgA(lpszphonebook : windows_sys::core::PCSTR, lpszentry : windows_sys::core::PCSTR, lpszphonenumber : windows_sys::core::PCSTR, lpinfo : *mut RASDIALDLG) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 153:1: declaration Macro has no candidate rule
// windows_link::link!("rasdlg.dll" "system" fn RasDialDlgW(lpszphonebook : windows_sys::core::PCWSTR, lpszentry : windows_sys::core::PCWSTR, lpszphonenumber : windows_sys::core::PCWSTR, lpinfo : *mut RASDIALDLG) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 154:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasDialW(param0 : *const RASDIALEXTENSIONS, param1 : windows_sys::core::PCWSTR, param2 : *const RASDIALPARAMSW, param3 : u32, param4 : *const core::ffi::c_void, param5 : *mut HRASCONN) -> u32);

// UNSUPPORTED Rust 155:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasEditPhonebookEntryA(param0 : super::super::Foundation:: HWND, param1 : windows_sys::core::PCSTR, param2 : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 156:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasEditPhonebookEntryW(param0 : super::super::Foundation:: HWND, param1 : windows_sys::core::PCWSTR, param2 : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 157:1: declaration Macro has no candidate rule
// windows_link::link!("rasdlg.dll" "system" fn RasEntryDlgA(lpszphonebook : windows_sys::core::PCSTR, lpszentry : windows_sys::core::PCSTR, lpinfo : *mut RASENTRYDLGA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 158:1: declaration Macro has no candidate rule
// windows_link::link!("rasdlg.dll" "system" fn RasEntryDlgW(lpszphonebook : windows_sys::core::PCWSTR, lpszentry : windows_sys::core::PCWSTR, lpinfo : *mut RASENTRYDLGW) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 159:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasEnumAutodialAddressesA(lpprasautodialaddresses : *mut windows_sys::core::PSTR, lpdwcbrasautodialaddresses : *mut u32, lpdwcrasautodialaddresses : *mut u32) -> u32);

// UNSUPPORTED Rust 160:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasEnumAutodialAddressesW(lpprasautodialaddresses : *mut windows_sys::core::PWSTR, lpdwcbrasautodialaddresses : *mut u32, lpdwcrasautodialaddresses : *mut u32) -> u32);

// UNSUPPORTED Rust 161:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasEnumConnectionsA(param0 : *mut RASCONNA, param1 : *mut u32, param2 : *mut u32) -> u32);

// UNSUPPORTED Rust 162:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasEnumConnectionsW(param0 : *mut RASCONNW, param1 : *mut u32, param2 : *mut u32) -> u32);

// UNSUPPORTED Rust 163:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasEnumDevicesA(param0 : *mut RASDEVINFOA, param1 : *mut u32, param2 : *mut u32) -> u32);

// UNSUPPORTED Rust 164:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasEnumDevicesW(param0 : *mut RASDEVINFOW, param1 : *mut u32, param2 : *mut u32) -> u32);

// UNSUPPORTED Rust 165:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasEnumEntriesA(param0 : windows_sys::core::PCSTR, param1 : windows_sys::core::PCSTR, param2 : *mut RASENTRYNAMEA, param3 : *mut u32, param4 : *mut u32) -> u32);

// UNSUPPORTED Rust 166:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasEnumEntriesW(param0 : windows_sys::core::PCWSTR, param1 : windows_sys::core::PCWSTR, param2 : *mut RASENTRYNAMEW, param3 : *mut u32, param4 : *mut u32) -> u32);

// UNSUPPORTED Rust 167:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasFreeEapUserIdentityA(praseapuseridentity : *const RASEAPUSERIDENTITYA));

// UNSUPPORTED Rust 168:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasFreeEapUserIdentityW(praseapuseridentity : *const RASEAPUSERIDENTITYW));

// UNSUPPORTED Rust 169:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasGetAutodialAddressA(param0 : windows_sys::core::PCSTR, param1 : *const u32, param2 : *mut RASAUTODIALENTRYA, param3 : *mut u32, param4 : *mut u32) -> u32);

// UNSUPPORTED Rust 170:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasGetAutodialAddressW(param0 : windows_sys::core::PCWSTR, param1 : *const u32, param2 : *mut RASAUTODIALENTRYW, param3 : *mut u32, param4 : *mut u32) -> u32);

// UNSUPPORTED Rust 171:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasGetAutodialEnableA(param0 : u32, param1 : *mut windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 172:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasGetAutodialEnableW(param0 : u32, param1 : *mut windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 173:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasGetAutodialParamA(param0 : u32, param1 : *mut core::ffi::c_void, param2 : *mut u32) -> u32);

// UNSUPPORTED Rust 174:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasGetAutodialParamW(param0 : u32, param1 : *mut core::ffi::c_void, param2 : *mut u32) -> u32);

// UNSUPPORTED Rust 175:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// windows_link::link!("rasapi32.dll" "system" fn RasGetConnectStatusA(param0 : HRASCONN, param1 : *mut RASCONNSTATUSA) -> u32);

// UNSUPPORTED Rust 177:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// windows_link::link!("rasapi32.dll" "system" fn RasGetConnectStatusW(param0 : HRASCONN, param1 : *mut RASCONNSTATUSW) -> u32);

// UNSUPPORTED Rust 179:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasGetConnectionStatistics(hrasconn : HRASCONN, lpstatistics : *mut RAS_STATS) -> u32);

// UNSUPPORTED Rust 180:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasGetCountryInfoA(param0 : *mut RASCTRYINFO, param1 : *mut u32) -> u32);

// UNSUPPORTED Rust 181:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasGetCountryInfoW(param0 : *mut RASCTRYINFO, param1 : *mut u32) -> u32);

// UNSUPPORTED Rust 182:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasGetCredentialsA(param0 : windows_sys::core::PCSTR, param1 : windows_sys::core::PCSTR, param2 : *mut RASCREDENTIALSA) -> u32);

// UNSUPPORTED Rust 183:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasGetCredentialsW(param0 : windows_sys::core::PCWSTR, param1 : windows_sys::core::PCWSTR, param2 : *mut RASCREDENTIALSW) -> u32);

// UNSUPPORTED Rust 184:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasGetCustomAuthDataA(pszphonebook : windows_sys::core::PCSTR, pszentry : windows_sys::core::PCSTR, pbcustomauthdata : *mut u8, pdwsizeofcustomauthdata : *mut u32) -> u32);

// UNSUPPORTED Rust 185:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasGetCustomAuthDataW(pszphonebook : windows_sys::core::PCWSTR, pszentry : windows_sys::core::PCWSTR, pbcustomauthdata : *mut u8, pdwsizeofcustomauthdata : *mut u32) -> u32);

// UNSUPPORTED Rust 186:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasGetEapUserDataA(htoken : super::super::Foundation:: HANDLE, pszphonebook : windows_sys::core::PCSTR, pszentry : windows_sys::core::PCSTR, pbeapdata : *mut u8, pdwsizeofeapdata : *mut u32) -> u32);

// UNSUPPORTED Rust 187:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasGetEapUserDataW(htoken : super::super::Foundation:: HANDLE, pszphonebook : windows_sys::core::PCWSTR, pszentry : windows_sys::core::PCWSTR, pbeapdata : *mut u8, pdwsizeofeapdata : *mut u32) -> u32);

// UNSUPPORTED Rust 188:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasGetEapUserIdentityA(pszphonebook : windows_sys::core::PCSTR, pszentry : windows_sys::core::PCSTR, dwflags : u32, hwnd : super::super::Foundation:: HWND, ppraseapuseridentity : *mut *mut RASEAPUSERIDENTITYA) -> u32);

// UNSUPPORTED Rust 189:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasGetEapUserIdentityW(pszphonebook : windows_sys::core::PCWSTR, pszentry : windows_sys::core::PCWSTR, dwflags : u32, hwnd : super::super::Foundation:: HWND, ppraseapuseridentity : *mut *mut RASEAPUSERIDENTITYW) -> u32);

// UNSUPPORTED Rust 190:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasGetEntryDialParamsA(param0 : windows_sys::core::PCSTR, param1 : *mut RASDIALPARAMSA, param2 : *mut windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 191:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasGetEntryDialParamsW(param0 : windows_sys::core::PCWSTR, param1 : *mut RASDIALPARAMSW, param2 : *mut windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 192:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// windows_link::link!("rasapi32.dll" "system" fn RasGetEntryPropertiesA(param0 : windows_sys::core::PCSTR, param1 : windows_sys::core::PCSTR, param2 : *mut RASENTRYA, param3 : *mut u32, param4 : *mut u8, param5 : *mut u32) -> u32);

// UNSUPPORTED Rust 194:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// windows_link::link!("rasapi32.dll" "system" fn RasGetEntryPropertiesW(param0 : windows_sys::core::PCWSTR, param1 : windows_sys::core::PCWSTR, param2 : *mut RASENTRYW, param3 : *mut u32, param4 : *mut u8, param5 : *mut u32) -> u32);

// UNSUPPORTED Rust 196:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasGetErrorStringA(resourceid : u32, lpszstring : windows_sys::core::PSTR, inbufsize : u32) -> u32);

// UNSUPPORTED Rust 197:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasGetErrorStringW(resourceid : u32, lpszstring : windows_sys::core::PWSTR, inbufsize : u32) -> u32);

// UNSUPPORTED Rust 198:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasGetLinkStatistics(hrasconn : HRASCONN, dwsubentry : u32, lpstatistics : *mut RAS_STATS) -> u32);

// UNSUPPORTED Rust 199:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasGetPCscf(lpszpcscf : windows_sys::core::PWSTR) -> u32);

// UNSUPPORTED Rust 200:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasGetProjectionInfoA(param0 : HRASCONN, param1 : RASPROJECTION, param2 : *mut core::ffi::c_void, param3 : *mut u32) -> u32);

// UNSUPPORTED Rust 201:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// windows_link::link!("rasapi32.dll" "system" fn RasGetProjectionInfoEx(hrasconn : HRASCONN, prasprojection : *mut RAS_PROJECTION_INFO, lpdwsize : *mut u32) -> u32);

// UNSUPPORTED Rust 203:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasGetProjectionInfoW(param0 : HRASCONN, param1 : RASPROJECTION, param2 : *mut core::ffi::c_void, param3 : *mut u32) -> u32);

// UNSUPPORTED Rust 204:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasGetSubEntryHandleA(param0 : HRASCONN, param1 : u32, param2 : *mut HRASCONN) -> u32);

// UNSUPPORTED Rust 205:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasGetSubEntryHandleW(param0 : HRASCONN, param1 : u32, param2 : *mut HRASCONN) -> u32);

// UNSUPPORTED Rust 206:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasGetSubEntryPropertiesA(param0 : windows_sys::core::PCSTR, param1 : windows_sys::core::PCSTR, param2 : u32, param3 : *mut RASSUBENTRYA, param4 : *mut u32, param5 : *mut u8, param6 : *mut u32) -> u32);

// UNSUPPORTED Rust 207:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasGetSubEntryPropertiesW(param0 : windows_sys::core::PCWSTR, param1 : windows_sys::core::PCWSTR, param2 : u32, param3 : *mut RASSUBENTRYW, param4 : *mut u32, param5 : *mut u8, param6 : *mut u32) -> u32);

// UNSUPPORTED Rust 208:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasHangUpA(param0 : HRASCONN) -> u32);

// UNSUPPORTED Rust 209:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasHangUpW(param0 : HRASCONN) -> u32);

// UNSUPPORTED Rust 210:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasInvokeEapUI(param0 : HRASCONN, param1 : u32, param2 : *const RASDIALEXTENSIONS, param3 : super::super::Foundation:: HWND) -> u32);

// UNSUPPORTED Rust 211:1: declaration Macro has no candidate rule
// windows_link::link!("rasdlg.dll" "system" fn RasPhonebookDlgA(lpszphonebook : windows_sys::core::PCSTR, lpszentry : windows_sys::core::PCSTR, lpinfo : *mut RASPBDLGA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 212:1: declaration Macro has no candidate rule
// windows_link::link!("rasdlg.dll" "system" fn RasPhonebookDlgW(lpszphonebook : windows_sys::core::PCWSTR, lpszentry : windows_sys::core::PCWSTR, lpinfo : *mut RASPBDLGW) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 213:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasRenameEntryA(param0 : windows_sys::core::PCSTR, param1 : windows_sys::core::PCSTR, param2 : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 214:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasRenameEntryW(param0 : windows_sys::core::PCWSTR, param1 : windows_sys::core::PCWSTR, param2 : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 215:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasSetAutodialAddressA(param0 : windows_sys::core::PCSTR, param1 : u32, param2 : *const RASAUTODIALENTRYA, param3 : u32, param4 : u32) -> u32);

// UNSUPPORTED Rust 216:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasSetAutodialAddressW(param0 : windows_sys::core::PCWSTR, param1 : u32, param2 : *const RASAUTODIALENTRYW, param3 : u32, param4 : u32) -> u32);

// UNSUPPORTED Rust 217:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasSetAutodialEnableA(param0 : u32, param1 : windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 218:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasSetAutodialEnableW(param0 : u32, param1 : windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 219:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasSetAutodialParamA(param0 : u32, param1 : *const core::ffi::c_void, param2 : u32) -> u32);

// UNSUPPORTED Rust 220:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasSetAutodialParamW(param0 : u32, param1 : *const core::ffi::c_void, param2 : u32) -> u32);

// UNSUPPORTED Rust 221:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasSetCredentialsA(param0 : windows_sys::core::PCSTR, param1 : windows_sys::core::PCSTR, param2 : *const RASCREDENTIALSA, param3 : windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 222:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasSetCredentialsW(param0 : windows_sys::core::PCWSTR, param1 : windows_sys::core::PCWSTR, param2 : *const RASCREDENTIALSW, param3 : windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 223:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasSetCustomAuthDataA(pszphonebook : windows_sys::core::PCSTR, pszentry : windows_sys::core::PCSTR, pbcustomauthdata : *const u8, dwsizeofcustomauthdata : u32) -> u32);

// UNSUPPORTED Rust 224:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasSetCustomAuthDataW(pszphonebook : windows_sys::core::PCWSTR, pszentry : windows_sys::core::PCWSTR, pbcustomauthdata : *const u8, dwsizeofcustomauthdata : u32) -> u32);

// UNSUPPORTED Rust 225:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasSetEapUserDataA(htoken : super::super::Foundation:: HANDLE, pszphonebook : windows_sys::core::PCSTR, pszentry : windows_sys::core::PCSTR, pbeapdata : *const u8, dwsizeofeapdata : u32) -> u32);

// UNSUPPORTED Rust 226:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasSetEapUserDataW(htoken : super::super::Foundation:: HANDLE, pszphonebook : windows_sys::core::PCWSTR, pszentry : windows_sys::core::PCWSTR, pbeapdata : *const u8, dwsizeofeapdata : u32) -> u32);

// UNSUPPORTED Rust 227:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasSetEntryDialParamsA(param0 : windows_sys::core::PCSTR, param1 : *const RASDIALPARAMSA, param2 : windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 228:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasSetEntryDialParamsW(param0 : windows_sys::core::PCWSTR, param1 : *const RASDIALPARAMSW, param2 : windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 229:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// windows_link::link!("rasapi32.dll" "system" fn RasSetEntryPropertiesA(param0 : windows_sys::core::PCSTR, param1 : windows_sys::core::PCSTR, param2 : *const RASENTRYA, param3 : u32, param4 : *const u8, param5 : u32) -> u32);

// UNSUPPORTED Rust 231:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// windows_link::link!("rasapi32.dll" "system" fn RasSetEntryPropertiesW(param0 : windows_sys::core::PCWSTR, param1 : windows_sys::core::PCWSTR, param2 : *const RASENTRYW, param3 : u32, param4 : *const u8, param5 : u32) -> u32);

// UNSUPPORTED Rust 233:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasSetSubEntryPropertiesA(param0 : windows_sys::core::PCSTR, param1 : windows_sys::core::PCSTR, param2 : u32, param3 : *const RASSUBENTRYA, param4 : u32, param5 : *const u8, param6 : u32) -> u32);

// UNSUPPORTED Rust 234:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasSetSubEntryPropertiesW(param0 : windows_sys::core::PCWSTR, param1 : windows_sys::core::PCWSTR, param2 : u32, param3 : *const RASSUBENTRYW, param4 : u32, param5 : *const u8, param6 : u32) -> u32);

// UNSUPPORTED Rust 235:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// windows_link::link!("rasapi32.dll" "system" fn RasUpdateConnection(hrasconn : HRASCONN, lprasupdateconn : *const RASUPDATECONN) -> u32);

// UNSUPPORTED Rust 237:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasValidateEntryNameA(param0 : windows_sys::core::PCSTR, param1 : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 238:1: declaration Macro has no candidate rule
// windows_link::link!("rasapi32.dll" "system" fn RasValidateEntryNameW(param0 : windows_sys::core::PCWSTR, param1 : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 239:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn RtmAddNextHop(rtmreghandle : isize, nexthopinfo : *mut RTM_NEXTHOP_INFO, nexthophandle : *mut isize, changeflags : *mut u32) -> u32);

// UNSUPPORTED Rust 240:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn RtmAddRouteToDest(rtmreghandle : isize, routehandle : *mut isize, destaddress : *mut RTM_NET_ADDRESS, routeinfo : *mut RTM_ROUTE_INFO, timetolive : u32, routelisthandle : isize, notifytype : u32, notifyhandle : isize, changeflags : *mut u32) -> u32);

// UNSUPPORTED Rust 241:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn RtmBlockMethods(rtmreghandle : isize, targethandle : super::super::Foundation:: HANDLE, targettype : u8, blockingflag : u32) -> u32);

// UNSUPPORTED Rust 242:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// windows_link::link!("rtm.dll" "system" fn RtmConvertIpv6AddressAndLengthToNetAddress(pnetaddress : *mut RTM_NET_ADDRESS, address : super::super::Networking::WinSock:: IN6_ADDR, dwlength : u32, dwaddresssize : u32) -> u32);

// UNSUPPORTED Rust 244:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// windows_link::link!("rtm.dll" "system" fn RtmConvertNetAddressToIpv6AddressAndLength(pnetaddress : *mut RTM_NET_ADDRESS, paddress : *mut super::super::Networking::WinSock:: IN6_ADDR, plength : *mut u32, dwaddresssize : u32) -> u32);

// UNSUPPORTED Rust 246:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn RtmCreateDestEnum(rtmreghandle : isize, targetviews : u32, enumflags : u32, netaddress : *mut RTM_NET_ADDRESS, protocolid : u32, rtmenumhandle : *mut isize) -> u32);

// UNSUPPORTED Rust 247:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn RtmCreateNextHopEnum(rtmreghandle : isize, enumflags : u32, netaddress : *mut RTM_NET_ADDRESS, rtmenumhandle : *mut isize) -> u32);

// UNSUPPORTED Rust 248:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn RtmCreateRouteEnum(rtmreghandle : isize, desthandle : isize, targetviews : u32, enumflags : u32, startdest : *mut RTM_NET_ADDRESS, matchingflags : u32, criteriaroute : *mut RTM_ROUTE_INFO, criteriainterface : u32, rtmenumhandle : *mut isize) -> u32);

// UNSUPPORTED Rust 249:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn RtmCreateRouteList(rtmreghandle : isize, routelisthandle : *mut isize) -> u32);

// UNSUPPORTED Rust 250:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn RtmCreateRouteListEnum(rtmreghandle : isize, routelisthandle : isize, rtmenumhandle : *mut isize) -> u32);

// UNSUPPORTED Rust 251:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn RtmDeleteEnumHandle(rtmreghandle : isize, enumhandle : isize) -> u32);

// UNSUPPORTED Rust 252:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn RtmDeleteNextHop(rtmreghandle : isize, nexthophandle : isize, nexthopinfo : *mut RTM_NEXTHOP_INFO) -> u32);

// UNSUPPORTED Rust 253:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn RtmDeleteRouteList(rtmreghandle : isize, routelisthandle : isize) -> u32);

// UNSUPPORTED Rust 254:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn RtmDeleteRouteToDest(rtmreghandle : isize, routehandle : isize, changeflags : *mut u32) -> u32);

// UNSUPPORTED Rust 255:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn RtmDeregisterEntity(rtmreghandle : isize) -> u32);

// UNSUPPORTED Rust 256:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn RtmDeregisterFromChangeNotification(rtmreghandle : isize, notifyhandle : isize) -> u32);

// UNSUPPORTED Rust 257:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn RtmFindNextHop(rtmreghandle : isize, nexthopinfo : *mut RTM_NEXTHOP_INFO, nexthophandle : *mut isize, nexthoppointer : *mut *mut RTM_NEXTHOP_INFO) -> u32);

// UNSUPPORTED Rust 258:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn RtmGetChangeStatus(rtmreghandle : isize, notifyhandle : isize, desthandle : isize, changestatus : *mut windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 259:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn RtmGetChangedDests(rtmreghandle : isize, notifyhandle : isize, numdests : *mut u32, changeddests : *mut RTM_DEST_INFO) -> u32);

// UNSUPPORTED Rust 260:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn RtmGetDestInfo(rtmreghandle : isize, desthandle : isize, protocolid : u32, targetviews : u32, destinfo : *mut RTM_DEST_INFO) -> u32);

// UNSUPPORTED Rust 261:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn RtmGetEntityInfo(rtmreghandle : isize, entityhandle : isize, entityinfo : *mut RTM_ENTITY_INFO) -> u32);

// UNSUPPORTED Rust 262:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn RtmGetEntityMethods(rtmreghandle : isize, entityhandle : isize, nummethods : *mut u32, exptmethods : *mut RTM_ENTITY_EXPORT_METHOD) -> u32);

// UNSUPPORTED Rust 263:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn RtmGetEnumDests(rtmreghandle : isize, enumhandle : isize, numdests : *mut u32, destinfos : *mut RTM_DEST_INFO) -> u32);

// UNSUPPORTED Rust 264:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn RtmGetEnumNextHops(rtmreghandle : isize, enumhandle : isize, numnexthops : *mut u32, nexthophandles : *mut isize) -> u32);

// UNSUPPORTED Rust 265:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn RtmGetEnumRoutes(rtmreghandle : isize, enumhandle : isize, numroutes : *mut u32, routehandles : *mut isize) -> u32);

// UNSUPPORTED Rust 266:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn RtmGetExactMatchDestination(rtmreghandle : isize, destaddress : *mut RTM_NET_ADDRESS, protocolid : u32, targetviews : u32, destinfo : *mut RTM_DEST_INFO) -> u32);

// UNSUPPORTED Rust 267:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn RtmGetExactMatchRoute(rtmreghandle : isize, destaddress : *mut RTM_NET_ADDRESS, matchingflags : u32, routeinfo : *mut RTM_ROUTE_INFO, interfaceindex : u32, targetviews : u32, routehandle : *mut isize) -> u32);

// UNSUPPORTED Rust 268:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn RtmGetLessSpecificDestination(rtmreghandle : isize, desthandle : isize, protocolid : u32, targetviews : u32, destinfo : *mut RTM_DEST_INFO) -> u32);

// UNSUPPORTED Rust 269:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn RtmGetListEnumRoutes(rtmreghandle : isize, enumhandle : isize, numroutes : *mut u32, routehandles : *mut isize) -> u32);

// UNSUPPORTED Rust 270:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn RtmGetMostSpecificDestination(rtmreghandle : isize, destaddress : *mut RTM_NET_ADDRESS, protocolid : u32, targetviews : u32, destinfo : *mut RTM_DEST_INFO) -> u32);

// UNSUPPORTED Rust 271:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn RtmGetNextHopInfo(rtmreghandle : isize, nexthophandle : isize, nexthopinfo : *mut RTM_NEXTHOP_INFO) -> u32);

// UNSUPPORTED Rust 272:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn RtmGetNextHopPointer(rtmreghandle : isize, nexthophandle : isize, nexthoppointer : *mut *mut RTM_NEXTHOP_INFO) -> u32);

// UNSUPPORTED Rust 273:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn RtmGetOpaqueInformationPointer(rtmreghandle : isize, desthandle : isize, opaqueinfopointer : *mut *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 274:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn RtmGetRegisteredEntities(rtmreghandle : isize, numentities : *mut u32, entityhandles : *mut isize, entityinfos : *mut RTM_ENTITY_INFO) -> u32);

// UNSUPPORTED Rust 275:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn RtmGetRouteInfo(rtmreghandle : isize, routehandle : isize, routeinfo : *mut RTM_ROUTE_INFO, destaddress : *mut RTM_NET_ADDRESS) -> u32);

// UNSUPPORTED Rust 276:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn RtmGetRoutePointer(rtmreghandle : isize, routehandle : isize, routepointer : *mut *mut RTM_ROUTE_INFO) -> u32);

// UNSUPPORTED Rust 277:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn RtmHoldDestination(rtmreghandle : isize, desthandle : isize, targetviews : u32, holdtime : u32) -> u32);

// UNSUPPORTED Rust 278:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn RtmIgnoreChangedDests(rtmreghandle : isize, notifyhandle : isize, numdests : u32, changeddests : *mut isize) -> u32);

// UNSUPPORTED Rust 279:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn RtmInsertInRouteList(rtmreghandle : isize, routelisthandle : isize, numroutes : u32, routehandles : *mut isize) -> u32);

// UNSUPPORTED Rust 280:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn RtmInvokeMethod(rtmreghandle : isize, entityhandle : isize, input : *mut RTM_ENTITY_METHOD_INPUT, outputsize : *mut u32, output : *mut RTM_ENTITY_METHOD_OUTPUT) -> u32);

// UNSUPPORTED Rust 281:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn RtmIsBestRoute(rtmreghandle : isize, routehandle : isize, bestinviews : *mut u32) -> u32);

// UNSUPPORTED Rust 282:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn RtmIsMarkedForChangeNotification(rtmreghandle : isize, notifyhandle : isize, desthandle : isize, destmarked : *mut windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 283:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn RtmLockDestination(rtmreghandle : isize, desthandle : isize, exclusive : windows_sys::core::BOOL, lockdest : windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 284:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn RtmLockNextHop(rtmreghandle : isize, nexthophandle : isize, exclusive : windows_sys::core::BOOL, locknexthop : windows_sys::core::BOOL, nexthoppointer : *mut *mut RTM_NEXTHOP_INFO) -> u32);

// UNSUPPORTED Rust 285:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn RtmLockRoute(rtmreghandle : isize, routehandle : isize, exclusive : windows_sys::core::BOOL, lockroute : windows_sys::core::BOOL, routepointer : *mut *mut RTM_ROUTE_INFO) -> u32);

// UNSUPPORTED Rust 286:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn RtmMarkDestForChangeNotification(rtmreghandle : isize, notifyhandle : isize, desthandle : isize, markdest : windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 287:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn RtmReferenceHandles(rtmreghandle : isize, numhandles : u32, rtmhandles : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 288:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn RtmRegisterEntity(rtmentityinfo : *mut RTM_ENTITY_INFO, exportmethods : *mut RTM_ENTITY_EXPORT_METHODS, eventcallback : RTM_EVENT_CALLBACK, reserveopaquepointer : windows_sys::core::BOOL, rtmregprofile : *mut RTM_REGN_PROFILE, rtmreghandle : *mut isize) -> u32);

// UNSUPPORTED Rust 289:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn RtmRegisterForChangeNotification(rtmreghandle : isize, targetviews : u32, notifyflags : u32, notifycontext : *mut core::ffi::c_void, notifyhandle : *mut isize) -> u32);

// UNSUPPORTED Rust 290:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn RtmReleaseChangedDests(rtmreghandle : isize, notifyhandle : isize, numdests : u32, changeddests : *mut RTM_DEST_INFO) -> u32);

// UNSUPPORTED Rust 291:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn RtmReleaseDestInfo(rtmreghandle : isize, destinfo : *mut RTM_DEST_INFO) -> u32);

// UNSUPPORTED Rust 292:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn RtmReleaseDests(rtmreghandle : isize, numdests : u32, destinfos : *mut RTM_DEST_INFO) -> u32);

// UNSUPPORTED Rust 293:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn RtmReleaseEntities(rtmreghandle : isize, numentities : u32, entityhandles : *mut isize) -> u32);

// UNSUPPORTED Rust 294:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn RtmReleaseEntityInfo(rtmreghandle : isize, entityinfo : *mut RTM_ENTITY_INFO) -> u32);

// UNSUPPORTED Rust 295:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn RtmReleaseNextHopInfo(rtmreghandle : isize, nexthopinfo : *mut RTM_NEXTHOP_INFO) -> u32);

// UNSUPPORTED Rust 296:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn RtmReleaseNextHops(rtmreghandle : isize, numnexthops : u32, nexthophandles : *mut isize) -> u32);

// UNSUPPORTED Rust 297:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn RtmReleaseRouteInfo(rtmreghandle : isize, routeinfo : *mut RTM_ROUTE_INFO) -> u32);

// UNSUPPORTED Rust 298:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn RtmReleaseRoutes(rtmreghandle : isize, numroutes : u32, routehandles : *mut isize) -> u32);

// UNSUPPORTED Rust 299:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn RtmUpdateAndUnlockRoute(rtmreghandle : isize, routehandle : isize, timetolive : u32, routelisthandle : isize, notifytype : u32, notifyhandle : isize, changeflags : *mut u32) -> u32);

public const val `ALLOW_NO_AUTH`: UInt = 1u;
public const val `ALL_SOURCES`: `MGM_ENUM_TYPES` = 1;
public const val `ANY_SOURCE`: `MGM_ENUM_TYPES` = 0;
public const val `ATADDRESSLEN`: UInt = 32u;
// UNSUPPORTED Rust 304:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct AUTH_VALIDATION_EX {
//     pub Header: MPRAPI_OBJECT_HEADER,
//     pub hRasConnection: super::super::Foundation::HANDLE,
//     pub wszUserName: [u16; 257],
//     pub wszLogonDomain: [u16; 16],
//     pub AuthInfoSize: u32,
//     pub AuthInfo: [u8; 1],
// }

// UNSUPPORTED Rust 314:1: declaration Impl has no candidate rule
// impl Default for AUTH_VALIDATION_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DO_NOT_ALLOW_NO_AUTH`: UInt = 0u;
public const val `ERROR_ACCESSING_TCPCFGDLL`: UInt = 727u;
public const val `ERROR_ACCT_DISABLED`: UInt = 647u;
public const val `ERROR_ACCT_EXPIRED`: UInt = 708u;
public const val `ERROR_ACTION_REQUIRED`: UInt = 877u;
public const val `ERROR_ALLOCATING_MEMORY`: UInt = 664u;
public const val `ERROR_ALREADY_DISCONNECTING`: UInt = 617u;
public const val `ERROR_ASYNC_REQUEST_PENDING`: UInt = 616u;
public const val `ERROR_AUTHENTICATION_FAILURE`: UInt = 691u;
public const val `ERROR_AUTH_INTERNAL`: UInt = 645u;
public const val `ERROR_AUTOMATIC_VPN_FAILED`: UInt = 800u;
public const val `ERROR_BAD_ADDRESS_SPECIFIED`: UInt = 769u;
public const val `ERROR_BAD_CALLBACK_NUMBER`: UInt = 704u;
public const val `ERROR_BAD_PHONE_NUMBER`: UInt = 749u;
public const val `ERROR_BAD_STRING`: UInt = 637u;
public const val `ERROR_BAD_USAGE_IN_INI_FILE`: UInt = 669u;
public const val `ERROR_BIPLEX_PORT_NOT_AVAILABLE`: UInt = 712u;
public const val `ERROR_BLOCKED`: UInt = 775u;
public const val `ERROR_BROADBAND_ACTIVE`: UInt = 813u;
public const val `ERROR_BROADBAND_NO_NIC`: UInt = 814u;
public const val `ERROR_BROADBAND_TIMEOUT`: UInt = 815u;
public const val `ERROR_BUFFER_INVALID`: UInt = 610u;
public const val `ERROR_BUFFER_TOO_SMALL`: UInt = 603u;
public const val `ERROR_BUNDLE_NOT_FOUND`: UInt = 754u;
public const val `ERROR_CANNOT_DELETE`: UInt = 817u;
public const val `ERROR_CANNOT_DO_CUSTOMDIAL`: UInt = 755u;
public const val `ERROR_CANNOT_FIND_PHONEBOOK_ENTRY`: UInt = 623u;
public const val `ERROR_CANNOT_GET_LANA`: UInt = 639u;
public const val `ERROR_CANNOT_INITIATE_MOBIKE_UPDATE`: UInt = 844u;
public const val `ERROR_CANNOT_LOAD_PHONEBOOK`: UInt = 622u;
public const val `ERROR_CANNOT_LOAD_STRING`: UInt = 626u;
public const val `ERROR_CANNOT_OPEN_PHONEBOOK`: UInt = 621u;
public const val `ERROR_CANNOT_PROJECT_CLIENT`: UInt = 634u;
public const val `ERROR_CANNOT_SET_PORT_INFO`: UInt = 605u;
public const val `ERROR_CANNOT_SHARE_CONNECTION`: UInt = 763u;
public const val `ERROR_CANNOT_USE_LOGON_CREDENTIALS`: UInt = 739u;
public const val `ERROR_CANNOT_WRITE_PHONEBOOK`: UInt = 624u;
public const val `ERROR_CERT_FOR_ENCRYPTION_NOT_FOUND`: UInt = 781u;
public const val `ERROR_CHANGING_PASSWORD`: UInt = 709u;
public const val `ERROR_CMD_TOO_LONG`: UInt = 700u;
public const val `ERROR_CONGESTION`: UInt = 771u;
public const val `ERROR_CONNECTING_DEVICE_NOT_FOUND`: UInt = 797u;
public const val `ERROR_CONNECTION_ALREADY_SHARED`: UInt = 758u;
public const val `ERROR_CONNECTION_REJECT`: UInt = 770u;
public const val `ERROR_CORRUPT_PHONEBOOK`: UInt = 625u;
public const val `ERROR_DCB_NOT_FOUND`: UInt = 694u;
public const val `ERROR_DEFAULTOFF_MACRO_NOT_FOUND`: UInt = 656u;
public const val `ERROR_DEVICENAME_NOT_FOUND`: UInt = 659u;
public const val `ERROR_DEVICENAME_TOO_LONG`: UInt = 658u;
public const val `ERROR_DEVICETYPE_DOES_NOT_EXIST`: UInt = 609u;
public const val `ERROR_DEVICE_COMPLIANCE`: UInt = 875u;
public const val `ERROR_DEVICE_DOES_NOT_EXIST`: UInt = 608u;
public const val `ERROR_DEVICE_NOT_READY`: UInt = 666u;
public const val `ERROR_DIAL_ALREADY_IN_PROGRESS`: UInt = 756u;
public const val `ERROR_DISCONNECTION`: UInt = 628u;
public const val `ERROR_DNSNAME_NOT_RESOLVABLE`: UInt = 868u;
public const val `ERROR_DONOTDISTURB`: UInt = 776u;
public const val `ERROR_EAPTLS_CACHE_CREDENTIALS_INVALID`: UInt = 826u;
public const val `ERROR_EAPTLS_PASSWD_INVALID`: UInt = 869u;
public const val `ERROR_EAPTLS_SCARD_CACHE_CREDENTIALS_INVALID`: UInt = 847u;
public const val `ERROR_EAP_METHOD_DOES_NOT_SUPPORT_SSO`: UInt = 851u;
public const val `ERROR_EAP_METHOD_NOT_INSTALLED`: UInt = 850u;
public const val `ERROR_EAP_METHOD_OPERATION_NOT_SUPPORTED`: UInt = 852u;
public const val `ERROR_EAP_SERVER_CERT_EXPIRED`: UInt = 858u;
public const val `ERROR_EAP_SERVER_CERT_INVALID`: UInt = 857u;
public const val `ERROR_EAP_SERVER_CERT_OTHER_ERROR`: UInt = 860u;
public const val `ERROR_EAP_SERVER_CERT_REVOKED`: UInt = 859u;
public const val `ERROR_EAP_SERVER_ROOT_CERT_INVALID`: UInt = 865u;
public const val `ERROR_EAP_SERVER_ROOT_CERT_NAME_REQUIRED`: UInt = 866u;
public const val `ERROR_EAP_SERVER_ROOT_CERT_NOT_FOUND`: UInt = 864u;
public const val `ERROR_EAP_USER_CERT_EXPIRED`: UInt = 854u;
public const val `ERROR_EAP_USER_CERT_INVALID`: UInt = 853u;
public const val `ERROR_EAP_USER_CERT_OTHER_ERROR`: UInt = 856u;
public const val `ERROR_EAP_USER_CERT_REVOKED`: UInt = 855u;
public const val `ERROR_EAP_USER_ROOT_CERT_EXPIRED`: UInt = 863u;
public const val `ERROR_EAP_USER_ROOT_CERT_INVALID`: UInt = 862u;
public const val `ERROR_EAP_USER_ROOT_CERT_NOT_FOUND`: UInt = 861u;
public const val `ERROR_EMPTY_INI_FILE`: UInt = 690u;
public const val `ERROR_EVENT_INVALID`: UInt = 607u;
public const val `ERROR_FAILED_CP_REQUIRED`: UInt = 841u;
public const val `ERROR_FAILED_TO_ENCRYPT`: UInt = 768u;
public const val `ERROR_FAST_USER_SWITCH`: UInt = 831u;
public const val `ERROR_FEATURE_DEPRECATED`: UInt = 816u;
public const val `ERROR_FILE_COULD_NOT_BE_OPENED`: UInt = 657u;
public const val `ERROR_FROM_DEVICE`: UInt = 651u;
public const val `ERROR_HANGUP_FAILED`: UInt = 753u;
public const val `ERROR_HARDWARE_FAILURE`: UInt = 630u;
public const val `ERROR_HIBERNATION`: UInt = 832u;
public const val `ERROR_IDLE_TIMEOUT`: UInt = 828u;
public const val `ERROR_IKEV2_PSK_INTERFACE_ALREADY_EXISTS`: UInt = 870u;
public const val `ERROR_INCOMPATIBLE`: UInt = 772u;
public const val `ERROR_INTERACTIVE_MODE`: UInt = 703u;
public const val `ERROR_INTERNAL_ADDRESS_FAILURE`: UInt = 840u;
public const val `ERROR_INVALID_AUTH_STATE`: UInt = 705u;
public const val `ERROR_INVALID_CALLBACK_NUMBER`: UInt = 751u;
public const val `ERROR_INVALID_COMPRESSION_SPECIFIED`: UInt = 613u;
public const val `ERROR_INVALID_DESTINATION_IP`: UInt = 871u;
public const val `ERROR_INVALID_FUNCTION_FOR_ENTRY`: UInt = 780u;
public const val `ERROR_INVALID_INTERFACE_CONFIG`: UInt = 872u;
public const val `ERROR_INVALID_MSCHAPV2_CONFIG`: UInt = 805u;
public const val `ERROR_INVALID_PEAP_COOKIE_ATTRIBUTES`: UInt = 849u;
public const val `ERROR_INVALID_PEAP_COOKIE_CONFIG`: UInt = 803u;
public const val `ERROR_INVALID_PEAP_COOKIE_USER`: UInt = 804u;
public const val `ERROR_INVALID_PORT_HANDLE`: UInt = 601u;
public const val `ERROR_INVALID_PREFERENCES`: UInt = 846u;
public const val `ERROR_INVALID_SERVER_CERT`: UInt = 835u;
public const val `ERROR_INVALID_SIZE`: UInt = 632u;
public const val `ERROR_INVALID_SMM`: UInt = 745u;
public const val `ERROR_INVALID_TUNNELID`: UInt = 837u;
public const val `ERROR_INVALID_VPNSTRATEGY`: UInt = 825u;
public const val `ERROR_IN_COMMAND`: UInt = 681u;
public const val `ERROR_IPSEC_SERVICE_STOPPED`: UInt = 827u;
public const val `ERROR_IPXCP_DIALOUT_ALREADY_ACTIVE`: UInt = 726u;
public const val `ERROR_IPXCP_NET_NUMBER_CONFLICT`: UInt = 744u;
public const val `ERROR_IPXCP_NO_DIALIN_CONFIGURED`: UInt = 725u;
public const val `ERROR_IPXCP_NO_DIALOUT_CONFIGURED`: UInt = 724u;
public const val `ERROR_IP_CONFIGURATION`: UInt = 716u;
public const val `ERROR_KEY_NOT_FOUND`: UInt = 627u;
public const val `ERROR_LINE_BUSY`: UInt = 676u;
public const val `ERROR_LINK_FAILURE`: UInt = 829u;
public const val `ERROR_MACRO_NOT_DEFINED`: UInt = 654u;
public const val `ERROR_MACRO_NOT_FOUND`: UInt = 653u;
public const val `ERROR_MESSAGE_MACRO_NOT_FOUND`: UInt = 655u;
public const val `ERROR_MOBIKE_DISABLED`: UInt = 843u;
public const val `ERROR_NAME_EXISTS_ON_NET`: UInt = 642u;
public const val `ERROR_NETBIOS_ERROR`: UInt = 640u;
public const val `ERROR_NOT_BINARY_MACRO`: UInt = 693u;
public const val `ERROR_NOT_NAP_CAPABLE`: UInt = 836u;
public const val `ERROR_NO_ACTIVE_ISDN_LINES`: UInt = 713u;
public const val `ERROR_NO_ANSWER`: UInt = 678u;
public const val `ERROR_NO_CARRIER`: UInt = 679u;
public const val `ERROR_NO_CERTIFICATE`: UInt = 766u;
public const val `ERROR_NO_COMMAND_FOUND`: UInt = 661u;
public const val `ERROR_NO_CONNECTION`: UInt = 668u;
public const val `ERROR_NO_DIALIN_PERMISSION`: UInt = 649u;
public const val `ERROR_NO_DIALTONE`: UInt = 680u;
public const val `ERROR_NO_DIFF_USER_AT_LOGON`: UInt = 784u;
public const val `ERROR_NO_EAPTLS_CERTIFICATE`: UInt = 798u;
public const val `ERROR_NO_ENDPOINTS`: UInt = 620u;
public const val `ERROR_NO_IP_ADDRESSES`: UInt = 717u;
public const val `ERROR_NO_IP_RAS_ADAPTER`: UInt = 728u;
public const val `ERROR_NO_ISDN_CHANNELS_AVAILABLE`: UInt = 714u;
public const val `ERROR_NO_LOCAL_ENCRYPTION`: UInt = 741u;
public const val `ERROR_NO_MAC_FOR_PORT`: UInt = 747u;
public const val `ERROR_NO_REG_CERT_AT_LOGON`: UInt = 785u;
public const val `ERROR_NO_REMOTE_ENCRYPTION`: UInt = 742u;
public const val `ERROR_NO_RESPONSES`: UInt = 660u;
public const val `ERROR_NO_SMART_CARD_READER`: UInt = 764u;
public const val `ERROR_NUMBERCHANGED`: UInt = 773u;
public const val `ERROR_OAKLEY_ATTRIB_FAIL`: UInt = 788u;
public const val `ERROR_OAKLEY_AUTH_FAIL`: UInt = 787u;
public const val `ERROR_OAKLEY_ERROR`: UInt = 793u;
public const val `ERROR_OAKLEY_GENERAL_PROCESSING`: UInt = 789u;
public const val `ERROR_OAKLEY_NO_CERT`: UInt = 786u;
public const val `ERROR_OAKLEY_NO_PEER_CERT`: UInt = 790u;
public const val `ERROR_OAKLEY_NO_POLICY`: UInt = 791u;
public const val `ERROR_OAKLEY_TIMED_OUT`: UInt = 792u;
public const val `ERROR_OUTOFORDER`: UInt = 777u;
public const val `ERROR_OUT_OF_BUFFERS`: UInt = 614u;
public const val `ERROR_OVERRUN`: UInt = 710u;
public const val `ERROR_PARTIAL_RESPONSE_LOOPING`: UInt = 697u;
public const val `ERROR_PASSWD_EXPIRED`: UInt = 648u;
public const val `ERROR_PEAP_CRYPTOBINDING_INVALID`: UInt = 823u;
public const val `ERROR_PEAP_CRYPTOBINDING_NOTRECEIVED`: UInt = 824u;
public const val `ERROR_PEAP_IDENTITY_MISMATCH`: UInt = 867u;
public const val `ERROR_PEAP_SERVER_REJECTED_CLIENT_TLV`: UInt = 845u;
public const val `ERROR_PHONE_NUMBER_TOO_LONG`: UInt = 723u;
public const val `ERROR_PLUGIN_NOT_INSTALLED`: UInt = 876u;
public const val `ERROR_PORT_ALREADY_OPEN`: UInt = 602u;
public const val `ERROR_PORT_DISCONNECTED`: UInt = 619u;
public const val `ERROR_PORT_NOT_AVAILABLE`: UInt = 633u;
public const val `ERROR_PORT_NOT_CONFIGURED`: UInt = 665u;
public const val `ERROR_PORT_NOT_CONNECTED`: UInt = 606u;
public const val `ERROR_PORT_NOT_FOUND`: UInt = 615u;
public const val `ERROR_PORT_NOT_OPEN`: UInt = 618u;
public const val `ERROR_PORT_OR_DEVICE`: UInt = 692u;
public const val `ERROR_PPP_CP_REJECTED`: UInt = 733u;
public const val `ERROR_PPP_INVALID_PACKET`: UInt = 722u;
public const val `ERROR_PPP_LCP_TERMINATED`: UInt = 734u;
public const val `ERROR_PPP_LOOPBACK_DETECTED`: UInt = 737u;
public const val `ERROR_PPP_NCP_TERMINATED`: UInt = 736u;
public const val `ERROR_PPP_NOT_CONVERGING`: UInt = 732u;
public const val `ERROR_PPP_NO_ADDRESS_ASSIGNED`: UInt = 738u;
public const val `ERROR_PPP_NO_PROTOCOLS_CONFIGURED`: UInt = 720u;
public const val `ERROR_PPP_NO_RESPONSE`: UInt = 721u;
public const val `ERROR_PPP_REMOTE_TERMINATED`: UInt = 719u;
public const val `ERROR_PPP_REQUIRED_ADDRESS_REJECTED`: UInt = 735u;
public const val `ERROR_PPP_TIMEOUT`: UInt = 718u;
public const val `ERROR_PROJECTION_NOT_COMPLETE`: UInt = 730u;
public const val `ERROR_PROTOCOL_ENGINE_DISABLED`: UInt = 839u;
public const val `ERROR_PROTOCOL_NOT_CONFIGURED`: UInt = 731u;
public const val `ERROR_RASAUTO_CANNOT_INITIALIZE`: UInt = 757u;
public const val `ERROR_RASMAN_CANNOT_INITIALIZE`: UInt = 711u;
public const val `ERROR_RASMAN_SERVICE_STOPPED`: UInt = 834u;
public const val `ERROR_RASQEC_CONN_DOESNOTEXIST`: UInt = 821u;
public const val `ERROR_RASQEC_NAPAGENT_NOT_CONNECTED`: UInt = 820u;
public const val `ERROR_RASQEC_NAPAGENT_NOT_ENABLED`: UInt = 819u;
public const val `ERROR_RASQEC_RESOURCE_CREATION_FAILED`: UInt = 818u;
public const val `ERROR_RASQEC_TIMEOUT`: UInt = 822u;
public const val `ERROR_READING_DEFAULTOFF`: UInt = 689u;
public const val `ERROR_READING_DEVICENAME`: UInt = 672u;
public const val `ERROR_READING_DEVICETYPE`: UInt = 671u;
public const val `ERROR_READING_INI_FILE`: UInt = 667u;
public const val `ERROR_READING_MAXCARRIERBPS`: UInt = 675u;
public const val `ERROR_READING_MAXCONNECTBPS`: UInt = 674u;
public const val `ERROR_READING_SCARD`: UInt = 802u;
public const val `ERROR_READING_SECTIONNAME`: UInt = 670u;
public const val `ERROR_READING_USAGE`: UInt = 673u;
public const val `ERROR_RECV_BUF_FULL`: UInt = 699u;
public const val `ERROR_REMOTE_DISCONNECTION`: UInt = 629u;
public const val `ERROR_REMOTE_REQUIRES_ENCRYPTION`: UInt = 743u;
public const val `ERROR_REQUEST_TIMEOUT`: UInt = 638u;
public const val `ERROR_RESTRICTED_LOGON_HOURS`: UInt = 646u;
public const val `ERROR_ROUTE_NOT_ALLOCATED`: UInt = 612u;
public const val `ERROR_ROUTE_NOT_AVAILABLE`: UInt = 611u;
public const val `ERROR_SCRIPT_SYNTAX`: UInt = 752u;
public const val `ERROR_SERVER_GENERAL_NET_FAILURE`: UInt = 643u;
public const val `ERROR_SERVER_NOT_RESPONDING`: UInt = 650u;
public const val `ERROR_SERVER_OUT_OF_RESOURCES`: UInt = 641u;
public const val `ERROR_SERVER_POLICY`: UInt = 812u;
public const val `ERROR_SHARE_CONNECTION_FAILED`: UInt = 761u;
public const val `ERROR_SHARING_ADDRESS_EXISTS`: UInt = 765u;
public const val `ERROR_SHARING_CHANGE_FAILED`: UInt = 759u;
public const val `ERROR_SHARING_HOST_ADDRESS_CONFLICT`: UInt = 799u;
public const val `ERROR_SHARING_MULTIPLE_ADDRESSES`: UInt = 767u;
public const val `ERROR_SHARING_NO_PRIVATE_LAN`: UInt = 783u;
public const val `ERROR_SHARING_PRIVATE_INSTALL`: UInt = 762u;
public const val `ERROR_SHARING_ROUTER_INSTALL`: UInt = 760u;
public const val `ERROR_SHARING_RRAS_CONFLICT`: UInt = 782u;
public const val `ERROR_SLIP_REQUIRES_IP`: UInt = 729u;
public const val `ERROR_SMART_CARD_REQUIRED`: UInt = 779u;
public const val `ERROR_SMM_TIMEOUT`: UInt = 748u;
public const val `ERROR_SMM_UNINITIALIZED`: UInt = 746u;
public const val `ERROR_SSO_CERT_MISSING`: UInt = 874u;
public const val `ERROR_SSTP_COOKIE_SET_FAILURE`: UInt = 848u;
public const val `ERROR_STATE_MACHINES_ALREADY_STARTED`: UInt = 696u;
public const val `ERROR_STATE_MACHINES_NOT_STARTED`: UInt = 695u;
public const val `ERROR_SYSTEM_SUSPENDED`: UInt = 833u;
public const val `ERROR_TAPI_CONFIGURATION`: UInt = 740u;
public const val `ERROR_TEMPFAILURE`: UInt = 774u;
public const val `ERROR_TOO_MANY_LINE_ERRORS`: UInt = 715u;
public const val `ERROR_TS_UNACCEPTABLE`: UInt = 842u;
public const val `ERROR_UNABLE_TO_AUTHENTICATE_SERVER`: UInt = 778u;
public const val `ERROR_UNEXPECTED_RESPONSE`: UInt = 702u;
public const val `ERROR_UNKNOWN`: UInt = 635u;
public const val `ERROR_UNKNOWN_DEVICE_TYPE`: UInt = 663u;
public const val `ERROR_UNKNOWN_FRAMED_PROTOCOL`: UInt = 794u;
public const val `ERROR_UNKNOWN_RESPONSE_KEY`: UInt = 698u;
public const val `ERROR_UNKNOWN_SERVICE_TYPE`: UInt = 796u;
public const val `ERROR_UNRECOGNIZED_RESPONSE`: UInt = 652u;
public const val `ERROR_UNSUPPORTED_BPS`: UInt = 701u;
public const val `ERROR_UPDATECONNECTION_REQUEST_IN_PROCESS`: UInt = 838u;
public const val `ERROR_USER_DISCONNECTION`: UInt = 631u;
public const val `ERROR_USER_LOGOFF`: UInt = 830u;
public const val `ERROR_VALIDATING_SERVER_CERT`: UInt = 801u;
public const val `ERROR_VOICE_ANSWER`: UInt = 677u;
public const val `ERROR_VPN_BAD_CERT`: UInt = 810u;
public const val `ERROR_VPN_BAD_PSK`: UInt = 811u;
public const val `ERROR_VPN_DISCONNECT`: UInt = 807u;
public const val `ERROR_VPN_GRE_BLOCKED`: UInt = 806u;
public const val `ERROR_VPN_PLUGIN_GENERIC`: UInt = 873u;
public const val `ERROR_VPN_REFUSED`: UInt = 808u;
public const val `ERROR_VPN_TIMEOUT`: UInt = 809u;
public const val `ERROR_WRITING_DEFAULTOFF`: UInt = 688u;
public const val `ERROR_WRITING_DEVICENAME`: UInt = 684u;
public const val `ERROR_WRITING_DEVICETYPE`: UInt = 683u;
public const val `ERROR_WRITING_INITBPS`: UInt = 706u;
public const val `ERROR_WRITING_MAXCARRIERBPS`: UInt = 686u;
public const val `ERROR_WRITING_MAXCONNECTBPS`: UInt = 685u;
public const val `ERROR_WRITING_SECTIONNAME`: UInt = 682u;
public const val `ERROR_WRITING_USAGE`: UInt = 687u;
public const val `ERROR_WRONG_DEVICE_ATTACHED`: UInt = 636u;
public const val `ERROR_WRONG_INFO_SPECIFIED`: UInt = 604u;
public const val `ERROR_WRONG_KEY_SPECIFIED`: UInt = 662u;
public const val `ERROR_WRONG_MODULE`: UInt = 750u;
public const val `ERROR_WRONG_TUNNEL_TYPE`: UInt = 795u;
public const val `ERROR_X25_DIAGNOSTIC`: UInt = 707u;
public const val `ET_None`: UInt = 0u;
public const val `ET_Optional`: UInt = 3u;
public const val `ET_Require`: UInt = 1u;
public const val `ET_RequireMax`: UInt = 2u;
// UNSUPPORTED Rust 600:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct GRE_CONFIG_PARAMS0 {
//     pub dwNumPorts: u32,
//     pub dwPortFlags: u32,
// }

// UNSUPPORTED Rust 606:1: non-scalar type Ptr unsupported
// pub type HRASCONN = *mut core::ffi::c_void;

// UNSUPPORTED Rust 607:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography")]
// #[derive(Clone, Copy, Default)]
// pub struct IKEV2_CONFIG_PARAMS {
//     pub dwNumPorts: u32,
//     pub dwPortFlags: u32,
//     pub dwTunnelConfigParamFlags: u32,
//     pub TunnelConfigParams: IKEV2_TUNNEL_CONFIG_PARAMS4,
// }

public typealias `IKEV2_ID_PAYLOAD_TYPE` = Int;
public const val `IKEV2_ID_PAYLOAD_TYPE_DER_ASN1_DN`: `IKEV2_ID_PAYLOAD_TYPE` = 9;
public const val `IKEV2_ID_PAYLOAD_TYPE_DER_ASN1_GN`: `IKEV2_ID_PAYLOAD_TYPE` = 10;
public const val `IKEV2_ID_PAYLOAD_TYPE_FQDN`: `IKEV2_ID_PAYLOAD_TYPE` = 2;
public const val `IKEV2_ID_PAYLOAD_TYPE_ID_IPV6_ADDR`: `IKEV2_ID_PAYLOAD_TYPE` = 5;
public const val `IKEV2_ID_PAYLOAD_TYPE_INVALID`: `IKEV2_ID_PAYLOAD_TYPE` = 0;
public const val `IKEV2_ID_PAYLOAD_TYPE_IPV4_ADDR`: `IKEV2_ID_PAYLOAD_TYPE` = 1;
public const val `IKEV2_ID_PAYLOAD_TYPE_KEY_ID`: `IKEV2_ID_PAYLOAD_TYPE` = 11;
public const val `IKEV2_ID_PAYLOAD_TYPE_MAX`: `IKEV2_ID_PAYLOAD_TYPE` = 12;
public const val `IKEV2_ID_PAYLOAD_TYPE_RESERVED1`: `IKEV2_ID_PAYLOAD_TYPE` = 4;
public const val `IKEV2_ID_PAYLOAD_TYPE_RESERVED2`: `IKEV2_ID_PAYLOAD_TYPE` = 6;
public const val `IKEV2_ID_PAYLOAD_TYPE_RESERVED3`: `IKEV2_ID_PAYLOAD_TYPE` = 7;
public const val `IKEV2_ID_PAYLOAD_TYPE_RESERVED4`: `IKEV2_ID_PAYLOAD_TYPE` = 8;
public const val `IKEV2_ID_PAYLOAD_TYPE_RFC822_ADDR`: `IKEV2_ID_PAYLOAD_TYPE` = 3;
// UNSUPPORTED Rust 630:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IKEV2_PROJECTION_INFO {
//     pub dwIPv4NegotiationError: u32,
//     pub wszAddress: [u16; 16],
//     pub wszRemoteAddress: [u16; 16],
//     pub IPv4SubInterfaceIndex: u64,
//     pub dwIPv6NegotiationError: u32,
//     pub bInterfaceIdentifier: [u8; 8],
//     pub bRemoteInterfaceIdentifier: [u8; 8],
//     pub bPrefix: [u8; 8],
//     pub dwPrefixLength: u32,
//     pub IPv6SubInterfaceIndex: u64,
//     pub dwOptions: u32,
//     pub dwAuthenticationProtocol: u32,
//     pub dwEapTypeId: u32,
//     pub dwCompressionAlgorithm: u32,
//     pub dwEncryptionMethod: u32,
// }

// UNSUPPORTED Rust 649:1: declaration Impl has no candidate rule
// impl Default for IKEV2_PROJECTION_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 654:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IKEV2_PROJECTION_INFO2 {
//     pub dwIPv4NegotiationError: u32,
//     pub wszAddress: [u16; 16],
//     pub wszRemoteAddress: [u16; 16],
//     pub IPv4SubInterfaceIndex: u64,
//     pub dwIPv6NegotiationError: u32,
//     pub bInterfaceIdentifier: [u8; 8],
//     pub bRemoteInterfaceIdentifier: [u8; 8],
//     pub bPrefix: [u8; 8],
//     pub dwPrefixLength: u32,
//     pub IPv6SubInterfaceIndex: u64,
//     pub dwOptions: u32,
//     pub dwAuthenticationProtocol: u32,
//     pub dwEapTypeId: u32,
//     pub dwEmbeddedEAPTypeId: u32,
//     pub dwCompressionAlgorithm: u32,
//     pub dwEncryptionMethod: u32,
// }

// UNSUPPORTED Rust 674:1: declaration Impl has no candidate rule
// impl Default for IKEV2_PROJECTION_INFO2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 679:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography")]
// #[derive(Clone, Copy)]
// pub struct IKEV2_TUNNEL_CONFIG_PARAMS2 {
//     pub dwIdleTimeout: u32,
//     pub dwNetworkBlackoutTime: u32,
//     pub dwSaLifeTime: u32,
//     pub dwSaDataSizeForRenegotiation: u32,
//     pub dwConfigOptions: u32,
//     pub dwTotalCertificates: u32,
//     pub certificateNames: *mut super::super::Security::Cryptography::CRYPT_INTEGER_BLOB,
//     pub machineCertificateName: super::super::Security::Cryptography::CRYPT_INTEGER_BLOB,
//     pub dwEncryptionType: u32,
//     pub customPolicy: *mut ROUTER_CUSTOM_IKEv2_POLICY0,
// }

// UNSUPPORTED Rust 694:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for IKEV2_TUNNEL_CONFIG_PARAMS2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 700:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography")]
// #[derive(Clone, Copy)]
// pub struct IKEV2_TUNNEL_CONFIG_PARAMS3 {
//     pub dwIdleTimeout: u32,
//     pub dwNetworkBlackoutTime: u32,
//     pub dwSaLifeTime: u32,
//     pub dwSaDataSizeForRenegotiation: u32,
//     pub dwConfigOptions: u32,
//     pub dwTotalCertificates: u32,
//     pub certificateNames: *mut super::super::Security::Cryptography::CRYPT_INTEGER_BLOB,
//     pub machineCertificateName: super::super::Security::Cryptography::CRYPT_INTEGER_BLOB,
//     pub dwEncryptionType: u32,
//     pub customPolicy: *mut ROUTER_CUSTOM_IKEv2_POLICY0,
//     pub dwTotalEkus: u32,
//     pub certificateEKUs: *mut MPR_CERT_EKU,
//     pub machineCertificateHash: super::super::Security::Cryptography::CRYPT_INTEGER_BLOB,
// }

// UNSUPPORTED Rust 718:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for IKEV2_TUNNEL_CONFIG_PARAMS3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 724:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography")]
// #[derive(Clone, Copy)]
// pub struct IKEV2_TUNNEL_CONFIG_PARAMS4 {
//     pub dwIdleTimeout: u32,
//     pub dwNetworkBlackoutTime: u32,
//     pub dwSaLifeTime: u32,
//     pub dwSaDataSizeForRenegotiation: u32,
//     pub dwConfigOptions: u32,
//     pub dwTotalCertificates: u32,
//     pub certificateNames: *mut super::super::Security::Cryptography::CRYPT_INTEGER_BLOB,
//     pub machineCertificateName: super::super::Security::Cryptography::CRYPT_INTEGER_BLOB,
//     pub dwEncryptionType: u32,
//     pub customPolicy: *mut ROUTER_CUSTOM_IKEv2_POLICY0,
//     pub dwTotalEkus: u32,
//     pub certificateEKUs: *mut MPR_CERT_EKU,
//     pub machineCertificateHash: super::super::Security::Cryptography::CRYPT_INTEGER_BLOB,
//     pub dwMmSaLifeTime: u32,
// }

// UNSUPPORTED Rust 743:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for IKEV2_TUNNEL_CONFIG_PARAMS4 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IPADDRESSLEN`: UInt = 15u;
public const val `IPV6_ADDRESS_LEN_IN_BYTES`: UInt = 16u;
public const val `IPXADDRESSLEN`: UInt = 22u;
// UNSUPPORTED Rust 752:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct L2TP_CONFIG_PARAMS0 {
//     pub dwNumPorts: u32,
//     pub dwPortFlags: u32,
// }

// UNSUPPORTED Rust 758:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct L2TP_CONFIG_PARAMS1 {
//     pub dwNumPorts: u32,
//     pub dwPortFlags: u32,
//     pub dwTunnelConfigParamFlags: u32,
//     pub TunnelConfigParams: L2TP_TUNNEL_CONFIG_PARAMS2,
// }

// UNSUPPORTED Rust 766:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct L2TP_TUNNEL_CONFIG_PARAMS1 {
//     pub dwIdleTimeout: u32,
//     pub dwEncryptionType: u32,
//     pub dwSaLifeTime: u32,
//     pub dwSaDataSizeForRenegotiation: u32,
//     pub customPolicy: *mut ROUTER_CUSTOM_IKEv2_POLICY0,
// }

// UNSUPPORTED Rust 775:1: declaration Impl has no candidate rule
// impl Default for L2TP_TUNNEL_CONFIG_PARAMS1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 780:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct L2TP_TUNNEL_CONFIG_PARAMS2 {
//     pub dwIdleTimeout: u32,
//     pub dwEncryptionType: u32,
//     pub dwSaLifeTime: u32,
//     pub dwSaDataSizeForRenegotiation: u32,
//     pub customPolicy: *mut ROUTER_CUSTOM_IKEv2_POLICY0,
//     pub dwMmSaLifeTime: u32,
// }

// UNSUPPORTED Rust 790:1: declaration Impl has no candidate rule
// impl Default for L2TP_TUNNEL_CONFIG_PARAMS2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MAXIPADRESSLEN`: UInt = 64u;
public const val `MAX_SSTP_HASH_SIZE`: UInt = 32u;
public const val `METHOD_BGP4_AS_PATH`: UInt = 1u;
public const val `METHOD_BGP4_NEXTHOP_ATTR`: UInt = 8u;
public const val `METHOD_BGP4_PA_ORIGIN`: UInt = 4u;
public const val `METHOD_BGP4_PEER_ID`: UInt = 2u;
public const val `METHOD_RIP2_NEIGHBOUR_ADDR`: UInt = 1u;
public const val `METHOD_RIP2_OUTBOUND_INTF`: UInt = 2u;
public const val `METHOD_RIP2_ROUTE_TAG`: UInt = 4u;
public const val `METHOD_RIP2_ROUTE_TIMESTAMP`: UInt = 8u;
public const val `METHOD_TYPE_ALL_METHODS`: UInt = 4294967295u;
public typealias `MGM_ENUM_TYPES` = Int;
public const val `MGM_FORWARD_STATE_FLAG`: UInt = 2u;
// UNSUPPORTED Rust 808:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MGM_IF_ENTRY {
//     pub dwIfIndex: u32,
//     pub dwIfNextHopAddr: u32,
//     pub bIGMP: windows_sys::core::BOOL,
//     pub bIsEnabled: windows_sys::core::BOOL,
// }

public const val `MGM_JOIN_STATE_FLAG`: UInt = 1u;
public const val `MGM_MFE_STATS_0`: UInt = 1u;
public const val `MGM_MFE_STATS_1`: UInt = 2u;
// UNSUPPORTED Rust 819:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy, Default)]
// pub struct MPRAPI_ADMIN_DLL_CALLBACKS {
//     pub revision: u8,
//     pub lpfnMprAdminGetIpAddressForUser: PMPRADMINGETIPADDRESSFORUSER,
//     pub lpfnMprAdminReleaseIpAddress: PMPRADMINRELEASEIPADRESS,
//     pub lpfnMprAdminGetIpv6AddressForUser: PMPRADMINGETIPV6ADDRESSFORUSER,
//     pub lpfnMprAdminReleaseIpV6AddressForUser: PMPRADMINRELEASEIPV6ADDRESSFORUSER,
//     pub lpfnRasAdminAcceptNewLink: PMPRADMINACCEPTNEWLINK,
//     pub lpfnRasAdminLinkHangupNotification: PMPRADMINLINKHANGUPNOTIFICATION,
//     pub lpfnRasAdminTerminateDll: PMPRADMINTERMINATEDLL,
//     pub lpfnRasAdminAcceptNewConnectionEx: PMPRADMINACCEPTNEWCONNECTIONEX,
//     pub lpfnRasAdminAcceptEndpointChangeEx: PMPRADMINACCEPTTUNNELENDPOINTCHANGEEX,
//     pub lpfnRasAdminAcceptReauthenticationEx: PMPRADMINACCEPTREAUTHENTICATIONEX,
//     pub lpfnRasAdminConnectionHangupNotificationEx: PMPRADMINCONNECTIONHANGUPNOTIFICATIONEX,
//     pub lpfnRASValidatePreAuthenticatedConnectionEx: PMPRADMINRASVALIDATEPREAUTHENTICATEDCONNECTIONEX,
// }

public const val `MPRAPI_ADMIN_DLL_VERSION_1`: UInt = 1u;
public const val `MPRAPI_ADMIN_DLL_VERSION_2`: UInt = 2u;
public const val `MPRAPI_IF_CUSTOM_CONFIG_FOR_IKEV2`: UInt = 1u;
public const val `MPRAPI_IKEV2_AUTH_USING_CERT`: UInt = 1u;
public const val `MPRAPI_IKEV2_AUTH_USING_EAP`: UInt = 2u;
public const val `MPRAPI_IKEV2_PROJECTION_INFO_TYPE`: UInt = 2u;
public const val `MPRAPI_IKEV2_SET_TUNNEL_CONFIG_PARAMS`: UInt = 1u;
public const val `MPRAPI_L2TP_SET_TUNNEL_CONFIG_PARAMS`: UInt = 1u;
public const val `MPRAPI_MPR_IF_CUSTOM_CONFIG_OBJECT_REVISION_1`: UInt = 1u;
public const val `MPRAPI_MPR_IF_CUSTOM_CONFIG_OBJECT_REVISION_2`: UInt = 2u;
public const val `MPRAPI_MPR_IF_CUSTOM_CONFIG_OBJECT_REVISION_3`: UInt = 3u;
public const val `MPRAPI_MPR_SERVER_OBJECT_REVISION_1`: UInt = 1u;
public const val `MPRAPI_MPR_SERVER_OBJECT_REVISION_2`: UInt = 2u;
public const val `MPRAPI_MPR_SERVER_OBJECT_REVISION_3`: UInt = 3u;
public const val `MPRAPI_MPR_SERVER_OBJECT_REVISION_4`: UInt = 4u;
public const val `MPRAPI_MPR_SERVER_OBJECT_REVISION_5`: UInt = 5u;
public const val `MPRAPI_MPR_SERVER_SET_CONFIG_OBJECT_REVISION_1`: UInt = 1u;
public const val `MPRAPI_MPR_SERVER_SET_CONFIG_OBJECT_REVISION_2`: UInt = 2u;
public const val `MPRAPI_MPR_SERVER_SET_CONFIG_OBJECT_REVISION_3`: UInt = 3u;
public const val `MPRAPI_MPR_SERVER_SET_CONFIG_OBJECT_REVISION_4`: UInt = 4u;
public const val `MPRAPI_MPR_SERVER_SET_CONFIG_OBJECT_REVISION_5`: UInt = 5u;
// UNSUPPORTED Rust 858:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MPRAPI_OBJECT_HEADER {
//     pub revision: u8,
//     pub r#type: u8,
//     pub size: u16,
// }

public typealias `MPRAPI_OBJECT_TYPE` = Int;
public const val `MPRAPI_OBJECT_TYPE_AUTH_VALIDATION_OBJECT`: `MPRAPI_OBJECT_TYPE` = 4;
public const val `MPRAPI_OBJECT_TYPE_IF_CUSTOM_CONFIG_OBJECT`: `MPRAPI_OBJECT_TYPE` = 6;
public const val `MPRAPI_OBJECT_TYPE_MPR_SERVER_OBJECT`: `MPRAPI_OBJECT_TYPE` = 2;
public const val `MPRAPI_OBJECT_TYPE_MPR_SERVER_SET_CONFIG_OBJECT`: `MPRAPI_OBJECT_TYPE` = 3;
public const val `MPRAPI_OBJECT_TYPE_RAS_CONNECTION_OBJECT`: `MPRAPI_OBJECT_TYPE` = 1;
public const val `MPRAPI_OBJECT_TYPE_UPDATE_CONNECTION_OBJECT`: `MPRAPI_OBJECT_TYPE` = 5;
public const val `MPRAPI_PPP_PROJECTION_INFO_TYPE`: UInt = 1u;
public const val `MPRAPI_RAS_CONNECTION_OBJECT_REVISION_1`: UInt = 1u;
public const val `MPRAPI_RAS_UPDATE_CONNECTION_OBJECT_REVISION_1`: UInt = 1u;
public const val `MPRAPI_SET_CONFIG_PROTOCOL_FOR_GRE`: UInt = 16u;
public const val `MPRAPI_SET_CONFIG_PROTOCOL_FOR_IKEV2`: UInt = 8u;
public const val `MPRAPI_SET_CONFIG_PROTOCOL_FOR_L2TP`: UInt = 2u;
public const val `MPRAPI_SET_CONFIG_PROTOCOL_FOR_PPTP`: UInt = 1u;
public const val `MPRAPI_SET_CONFIG_PROTOCOL_FOR_SSTP`: UInt = 4u;
// UNSUPPORTED Rust 880:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography")]
// #[derive(Clone, Copy, Default)]
// pub struct MPRAPI_TUNNEL_CONFIG_PARAMS0 {
//     pub IkeConfigParams: IKEV2_CONFIG_PARAMS,
//     pub PptpConfigParams: PPTP_CONFIG_PARAMS,
//     pub L2tpConfigParams: L2TP_CONFIG_PARAMS1,
//     pub SstpConfigParams: SSTP_CONFIG_PARAMS,
// }

// UNSUPPORTED Rust 889:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography")]
// #[derive(Clone, Copy, Default)]
// pub struct MPRAPI_TUNNEL_CONFIG_PARAMS1 {
//     pub IkeConfigParams: IKEV2_CONFIG_PARAMS,
//     pub PptpConfigParams: PPTP_CONFIG_PARAMS,
//     pub L2tpConfigParams: L2TP_CONFIG_PARAMS1,
//     pub SstpConfigParams: SSTP_CONFIG_PARAMS,
//     pub GREConfigParams: GRE_CONFIG_PARAMS0,
// }

public const val `MPRDM_DialAll`: `MPR_INTERFACE_DIAL_MODE` = 1u;
public const val `MPRDM_DialAsNeeded`: `MPR_INTERFACE_DIAL_MODE` = 2u;
public const val `MPRDM_DialFirst`: `MPR_INTERFACE_DIAL_MODE` = 0u;
// UNSUPPORTED Rust 902:1: non-scalar type Ptr unsupported
// pub const MPRDT_Atm: windows_sys::core::PCWSTR = windows_sys::core::w!("ATM");

// UNSUPPORTED Rust 903:1: non-scalar type Ptr unsupported
// pub const MPRDT_FrameRelay: windows_sys::core::PCWSTR = windows_sys::core::w!("FRAMERELAY");

// UNSUPPORTED Rust 904:1: non-scalar type Ptr unsupported
// pub const MPRDT_Generic: windows_sys::core::PCWSTR = windows_sys::core::w!("GENERIC");

// UNSUPPORTED Rust 905:1: non-scalar type Ptr unsupported
// pub const MPRDT_Irda: windows_sys::core::PCWSTR = windows_sys::core::w!("IRDA");

// UNSUPPORTED Rust 906:1: non-scalar type Ptr unsupported
// pub const MPRDT_Isdn: windows_sys::core::PCWSTR = windows_sys::core::w!("isdn");

// UNSUPPORTED Rust 907:1: non-scalar type Ptr unsupported
// pub const MPRDT_Modem: windows_sys::core::PCWSTR = windows_sys::core::w!("modem");

// UNSUPPORTED Rust 908:1: non-scalar type Ptr unsupported
// pub const MPRDT_Pad: windows_sys::core::PCWSTR = windows_sys::core::w!("pad");

// UNSUPPORTED Rust 909:1: non-scalar type Ptr unsupported
// pub const MPRDT_Parallel: windows_sys::core::PCWSTR = windows_sys::core::w!("PARALLEL");

// UNSUPPORTED Rust 910:1: non-scalar type Ptr unsupported
// pub const MPRDT_SW56: windows_sys::core::PCWSTR = windows_sys::core::w!("SW56");

// UNSUPPORTED Rust 911:1: non-scalar type Ptr unsupported
// pub const MPRDT_Serial: windows_sys::core::PCWSTR = windows_sys::core::w!("SERIAL");

// UNSUPPORTED Rust 912:1: non-scalar type Ptr unsupported
// pub const MPRDT_Sonet: windows_sys::core::PCWSTR = windows_sys::core::w!("SONET");

// UNSUPPORTED Rust 913:1: non-scalar type Ptr unsupported
// pub const MPRDT_Vpn: windows_sys::core::PCWSTR = windows_sys::core::w!("vpn");

// UNSUPPORTED Rust 914:1: non-scalar type Ptr unsupported
// pub const MPRDT_X25: windows_sys::core::PCWSTR = windows_sys::core::w!("x25");

public const val `MPRET_Direct`: UInt = 3u;
public const val `MPRET_Phone`: UInt = 1u;
public const val `MPRET_Vpn`: UInt = 2u;
public const val `MPRIDS_Disabled`: UInt = 4294967295u;
public const val `MPRIDS_UseGlobalValue`: UInt = 0u;
public const val `MPRIO_DisableLcpExtensions`: UInt = 32u;
public const val `MPRIO_IpHeaderCompression`: UInt = 8u;
public const val `MPRIO_IpSecPreSharedKey`: UInt = 2147483648u;
public const val `MPRIO_NetworkLogon`: UInt = 8192u;
public const val `MPRIO_PromoteAlternates`: UInt = 32768u;
public const val `MPRIO_RemoteDefaultGateway`: UInt = 16u;
public const val `MPRIO_RequireCHAP`: UInt = 134217728u;
public const val `MPRIO_RequireDataEncryption`: UInt = 4096u;
public const val `MPRIO_RequireEAP`: UInt = 131072u;
public const val `MPRIO_RequireEncryptedPw`: UInt = 1024u;
public const val `MPRIO_RequireMachineCertificates`: UInt = 16777216u;
public const val `MPRIO_RequireMsCHAP`: UInt = 268435456u;
public const val `MPRIO_RequireMsCHAP2`: UInt = 536870912u;
public const val `MPRIO_RequireMsEncryptedPw`: UInt = 2048u;
public const val `MPRIO_RequirePAP`: UInt = 262144u;
public const val `MPRIO_RequireSPAP`: UInt = 524288u;
public const val `MPRIO_SecureLocalFiles`: UInt = 65536u;
public const val `MPRIO_SharedPhoneNumbers`: UInt = 8388608u;
public const val `MPRIO_SpecificIpAddr`: UInt = 2u;
public const val `MPRIO_SpecificNameServers`: UInt = 4u;
public const val `MPRIO_SwCompression`: UInt = 512u;
public const val `MPRIO_UsePreSharedKeyForIkev2Initiator`: UInt = 33554432u;
public const val `MPRIO_UsePreSharedKeyForIkev2Responder`: UInt = 67108864u;
public const val `MPRNP_Ip`: UInt = 4u;
public const val `MPRNP_Ipv6`: UInt = 8u;
public const val `MPRNP_Ipx`: UInt = 2u;
// UNSUPPORTED Rust 946:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MPR_CERT_EKU {
//     pub dwSize: u32,
//     pub IsEKUOID: windows_sys::core::BOOL,
//     pub pwszEKU: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 953:1: declaration Impl has no candidate rule
// impl Default for MPR_CERT_EKU {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 958:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MPR_CREDENTIALSEX_0 {
//     pub dwSize: u32,
//     pub lpbCredentialsInfo: *mut u8,
// }

// UNSUPPORTED Rust 964:1: declaration Impl has no candidate rule
// impl Default for MPR_CREDENTIALSEX_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 969:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MPR_CREDENTIALSEX_1 {
//     pub dwSize: u32,
//     pub lpbCredentialsInfo: *mut u8,
// }

// UNSUPPORTED Rust 975:1: declaration Impl has no candidate rule
// impl Default for MPR_CREDENTIALSEX_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 980:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MPR_DEVICE_0 {
//     pub szDeviceType: [u16; 17],
//     pub szDeviceName: [u16; 129],
// }

// UNSUPPORTED Rust 986:1: declaration Impl has no candidate rule
// impl Default for MPR_DEVICE_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 991:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MPR_DEVICE_1 {
//     pub szDeviceType: [u16; 17],
//     pub szDeviceName: [u16; 129],
//     pub szLocalPhoneNumber: [u16; 129],
//     pub szAlternates: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 999:1: declaration Impl has no candidate rule
// impl Default for MPR_DEVICE_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MPR_ENABLE_RAS_ON_DEVICE`: UInt = 1u;
public const val `MPR_ENABLE_ROUTING_ON_DEVICE`: UInt = 2u;
public typealias `MPR_ET` = UInt;
public const val `MPR_ET_None`: `MPR_ET` = 0u;
public const val `MPR_ET_Optional`: `MPR_ET` = 3u;
public const val `MPR_ET_Require`: `MPR_ET` = 1u;
public const val `MPR_ET_RequireMax`: `MPR_ET` = 2u;
// UNSUPPORTED Rust 1011:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MPR_FILTER_0 {
//     pub fEnable: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 1016:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MPR_IFTRANSPORT_0 {
//     pub dwTransportId: u32,
//     pub hIfTransport: super::super::Foundation::HANDLE,
//     pub wszIfTransportName: [u16; 41],
// }

// UNSUPPORTED Rust 1023:1: declaration Impl has no candidate rule
// impl Default for MPR_IFTRANSPORT_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1028:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography")]
// #[derive(Clone, Copy, Default)]
// pub struct MPR_IF_CUSTOMINFOEX0 {
//     pub Header: MPRAPI_OBJECT_HEADER,
//     pub dwFlags: u32,
//     pub customIkev2Config: ROUTER_IKEv2_IF_CUSTOM_CONFIG0,
// }

// UNSUPPORTED Rust 1036:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography")]
// #[derive(Clone, Copy, Default)]
// pub struct MPR_IF_CUSTOMINFOEX1 {
//     pub Header: MPRAPI_OBJECT_HEADER,
//     pub dwFlags: u32,
//     pub customIkev2Config: ROUTER_IKEv2_IF_CUSTOM_CONFIG1,
// }

// UNSUPPORTED Rust 1044:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_Networking_WinSock", feature = "Win32_Security_Cryptography"))]
// #[derive(Clone, Copy, Default)]
// pub struct MPR_IF_CUSTOMINFOEX2 {
//     pub Header: MPRAPI_OBJECT_HEADER,
//     pub dwFlags: u32,
//     pub customIkev2Config: ROUTER_IKEv2_IF_CUSTOM_CONFIG2,
// }

// UNSUPPORTED Rust 1052:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MPR_INTERFACE_0 {
//     pub wszInterfaceName: [u16; 257],
//     pub hInterface: super::super::Foundation::HANDLE,
//     pub fEnabled: windows_sys::core::BOOL,
//     pub dwIfType: ROUTER_INTERFACE_TYPE,
//     pub dwConnectionState: ROUTER_CONNECTION_STATE,
//     pub fUnReachabilityReasons: u32,
//     pub dwLastError: u32,
// }

// UNSUPPORTED Rust 1063:1: declaration Impl has no candidate rule
// impl Default for MPR_INTERFACE_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1068:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MPR_INTERFACE_1 {
//     pub wszInterfaceName: [u16; 257],
//     pub hInterface: super::super::Foundation::HANDLE,
//     pub fEnabled: windows_sys::core::BOOL,
//     pub dwIfType: ROUTER_INTERFACE_TYPE,
//     pub dwConnectionState: ROUTER_CONNECTION_STATE,
//     pub fUnReachabilityReasons: u32,
//     pub dwLastError: u32,
//     pub lpwsDialoutHoursRestriction: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 1080:1: declaration Impl has no candidate rule
// impl Default for MPR_INTERFACE_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1085:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MPR_INTERFACE_2 {
//     pub wszInterfaceName: [u16; 257],
//     pub hInterface: super::super::Foundation::HANDLE,
//     pub fEnabled: windows_sys::core::BOOL,
//     pub dwIfType: ROUTER_INTERFACE_TYPE,
//     pub dwConnectionState: ROUTER_CONNECTION_STATE,
//     pub fUnReachabilityReasons: u32,
//     pub dwLastError: u32,
//     pub dwfOptions: u32,
//     pub szLocalPhoneNumber: [u16; 129],
//     pub szAlternates: windows_sys::core::PWSTR,
//     pub ipaddr: u32,
//     pub ipaddrDns: u32,
//     pub ipaddrDnsAlt: u32,
//     pub ipaddrWins: u32,
//     pub ipaddrWinsAlt: u32,
//     pub dwfNetProtocols: u32,
//     pub szDeviceType: [u16; 17],
//     pub szDeviceName: [u16; 129],
//     pub szX25PadType: [u16; 33],
//     pub szX25Address: [u16; 201],
//     pub szX25Facilities: [u16; 201],
//     pub szX25UserData: [u16; 201],
//     pub dwChannels: u32,
//     pub dwSubEntries: u32,
//     pub dwDialMode: MPR_INTERFACE_DIAL_MODE,
//     pub dwDialExtraPercent: u32,
//     pub dwDialExtraSampleSeconds: u32,
//     pub dwHangUpExtraPercent: u32,
//     pub dwHangUpExtraSampleSeconds: u32,
//     pub dwIdleDisconnectSeconds: u32,
//     pub dwType: u32,
//     pub dwEncryptionType: MPR_ET,
//     pub dwCustomAuthKey: u32,
//     pub dwCustomAuthDataSize: u32,
//     pub lpbCustomAuthData: *mut u8,
//     pub guidId: windows_sys::core::GUID,
//     pub dwVpnStrategy: MPR_VS,
// }

// UNSUPPORTED Rust 1126:1: declaration Impl has no candidate rule
// impl Default for MPR_INTERFACE_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1131:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct MPR_INTERFACE_3 {
//     pub wszInterfaceName: [u16; 257],
//     pub hInterface: super::super::Foundation::HANDLE,
//     pub fEnabled: windows_sys::core::BOOL,
//     pub dwIfType: ROUTER_INTERFACE_TYPE,
//     pub dwConnectionState: ROUTER_CONNECTION_STATE,
//     pub fUnReachabilityReasons: u32,
//     pub dwLastError: u32,
//     pub dwfOptions: u32,
//     pub szLocalPhoneNumber: [u16; 129],
//     pub szAlternates: windows_sys::core::PWSTR,
//     pub ipaddr: u32,
//     pub ipaddrDns: u32,
//     pub ipaddrDnsAlt: u32,
//     pub ipaddrWins: u32,
//     pub ipaddrWinsAlt: u32,
//     pub dwfNetProtocols: u32,
//     pub szDeviceType: [u16; 17],
//     pub szDeviceName: [u16; 129],
//     pub szX25PadType: [u16; 33],
//     pub szX25Address: [u16; 201],
//     pub szX25Facilities: [u16; 201],
//     pub szX25UserData: [u16; 201],
//     pub dwChannels: u32,
//     pub dwSubEntries: u32,
//     pub dwDialMode: MPR_INTERFACE_DIAL_MODE,
//     pub dwDialExtraPercent: u32,
//     pub dwDialExtraSampleSeconds: u32,
//     pub dwHangUpExtraPercent: u32,
//     pub dwHangUpExtraSampleSeconds: u32,
//     pub dwIdleDisconnectSeconds: u32,
//     pub dwType: u32,
//     pub dwEncryptionType: MPR_ET,
//     pub dwCustomAuthKey: u32,
//     pub dwCustomAuthDataSize: u32,
//     pub lpbCustomAuthData: *mut u8,
//     pub guidId: windows_sys::core::GUID,
//     pub dwVpnStrategy: MPR_VS,
//     pub AddressCount: u32,
//     pub ipv6addrDns: super::super::Networking::WinSock::IN6_ADDR,
//     pub ipv6addrDnsAlt: super::super::Networking::WinSock::IN6_ADDR,
//     pub ipv6addr: *mut super::super::Networking::WinSock::IN6_ADDR,
// }

// UNSUPPORTED Rust 1177:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for MPR_INTERFACE_3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MPR_INTERFACE_ADMIN_DISABLED`: UInt = 2u;
public const val `MPR_INTERFACE_CONNECTION_FAILURE`: UInt = 4u;
public const val `MPR_INTERFACE_DIALOUT_HOURS_RESTRICTION`: UInt = 16u;
public typealias `MPR_INTERFACE_DIAL_MODE` = UInt;
public const val `MPR_INTERFACE_NO_DEVICE`: UInt = 64u;
public const val `MPR_INTERFACE_NO_MEDIA_SENSE`: UInt = 32u;
public const val `MPR_INTERFACE_OUT_OF_RESOURCES`: UInt = 1u;
public const val `MPR_INTERFACE_SERVICE_PAUSED`: UInt = 8u;
// UNSUPPORTED Rust 1191:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MPR_IPINIP_INTERFACE_0 {
//     pub wszFriendlyName: [u16; 257],
//     pub Guid: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 1197:1: declaration Impl has no candidate rule
// impl Default for MPR_IPINIP_INTERFACE_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MPR_MaxAreaCode`: UInt = 10u;
public const val `MPR_MaxCallbackNumber`: UInt = 128u;
public const val `MPR_MaxDeviceName`: UInt = 128u;
public const val `MPR_MaxDeviceType`: UInt = 16u;
public const val `MPR_MaxEntryName`: UInt = 256u;
public const val `MPR_MaxFacilities`: UInt = 200u;
public const val `MPR_MaxIpAddress`: UInt = 15u;
public const val `MPR_MaxIpxAddress`: UInt = 21u;
public const val `MPR_MaxPadType`: UInt = 32u;
public const val `MPR_MaxPhoneNumber`: UInt = 128u;
public const val `MPR_MaxUserData`: UInt = 200u;
public const val `MPR_MaxX25Address`: UInt = 200u;
// UNSUPPORTED Rust 1214:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MPR_SERVER_0 {
//     pub fLanOnlyMode: windows_sys::core::BOOL,
//     pub dwUpTime: u32,
//     pub dwTotalPorts: u32,
//     pub dwPortsInUse: u32,
// }

// UNSUPPORTED Rust 1222:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MPR_SERVER_1 {
//     pub dwNumPptpPorts: u32,
//     pub dwPptpPortFlags: u32,
//     pub dwNumL2tpPorts: u32,
//     pub dwL2tpPortFlags: u32,
// }

// UNSUPPORTED Rust 1230:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MPR_SERVER_2 {
//     pub dwNumPptpPorts: u32,
//     pub dwPptpPortFlags: u32,
//     pub dwNumL2tpPorts: u32,
//     pub dwL2tpPortFlags: u32,
//     pub dwNumSstpPorts: u32,
//     pub dwSstpPortFlags: u32,
// }

// UNSUPPORTED Rust 1240:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography")]
// #[derive(Clone, Copy, Default)]
// pub struct MPR_SERVER_EX0 {
//     pub Header: MPRAPI_OBJECT_HEADER,
//     pub fLanOnlyMode: u32,
//     pub dwUpTime: u32,
//     pub dwTotalPorts: u32,
//     pub dwPortsInUse: u32,
//     pub Reserved: u32,
//     pub ConfigParams: MPRAPI_TUNNEL_CONFIG_PARAMS0,
// }

// UNSUPPORTED Rust 1252:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography")]
// #[derive(Clone, Copy, Default)]
// pub struct MPR_SERVER_EX1 {
//     pub Header: MPRAPI_OBJECT_HEADER,
//     pub fLanOnlyMode: u32,
//     pub dwUpTime: u32,
//     pub dwTotalPorts: u32,
//     pub dwPortsInUse: u32,
//     pub Reserved: u32,
//     pub ConfigParams: MPRAPI_TUNNEL_CONFIG_PARAMS1,
// }

// UNSUPPORTED Rust 1264:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography")]
// #[derive(Clone, Copy, Default)]
// pub struct MPR_SERVER_SET_CONFIG_EX0 {
//     pub Header: MPRAPI_OBJECT_HEADER,
//     pub setConfigForProtocols: u32,
//     pub ConfigParams: MPRAPI_TUNNEL_CONFIG_PARAMS0,
// }

// UNSUPPORTED Rust 1272:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography")]
// #[derive(Clone, Copy, Default)]
// pub struct MPR_SERVER_SET_CONFIG_EX1 {
//     pub Header: MPRAPI_OBJECT_HEADER,
//     pub setConfigForProtocols: u32,
//     pub ConfigParams: MPRAPI_TUNNEL_CONFIG_PARAMS1,
// }

// UNSUPPORTED Rust 1280:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MPR_TRANSPORT_0 {
//     pub dwTransportId: u32,
//     pub hTransport: super::super::Foundation::HANDLE,
//     pub wszTransportName: [u16; 41],
// }

// UNSUPPORTED Rust 1287:1: declaration Impl has no candidate rule
// impl Default for MPR_TRANSPORT_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1292:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct MPR_VPN_TRAFFIC_SELECTOR {
//     pub r#type: MPR_VPN_TS_TYPE,
//     pub protocolId: u8,
//     pub portStart: u16,
//     pub portEnd: u16,
//     pub tsPayloadId: u16,
//     pub addrStart: VPN_TS_IP_ADDRESS,
//     pub addrEnd: VPN_TS_IP_ADDRESS,
// }

// UNSUPPORTED Rust 1304:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for MPR_VPN_TRAFFIC_SELECTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1310:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct MPR_VPN_TRAFFIC_SELECTORS {
//     pub numTsi: u32,
//     pub numTsr: u32,
//     pub tsI: *mut MPR_VPN_TRAFFIC_SELECTOR,
//     pub tsR: *mut MPR_VPN_TRAFFIC_SELECTOR,
// }

// UNSUPPORTED Rust 1319:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for MPR_VPN_TRAFFIC_SELECTORS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MPR_VPN_TS_IPv4_ADDR_RANGE`: `MPR_VPN_TS_TYPE` = 7;
public const val `MPR_VPN_TS_IPv6_ADDR_RANGE`: `MPR_VPN_TS_TYPE` = 8;
public typealias `MPR_VPN_TS_TYPE` = Int;
public typealias `MPR_VS` = UInt;
public const val `MPR_VS_Default`: `MPR_VS` = 0u;
public const val `MPR_VS_Ikev2First`: UInt = 8u;
public const val `MPR_VS_Ikev2Only`: UInt = 7u;
public const val `MPR_VS_L2tpFirst`: `MPR_VS` = 4u;
public const val `MPR_VS_L2tpOnly`: `MPR_VS` = 3u;
public const val `MPR_VS_PptpFirst`: `MPR_VS` = 2u;
public const val `MPR_VS_PptpOnly`: `MPR_VS` = 1u;
// UNSUPPORTED Rust 1336:1: generic scalar type unsupported
// pub type ORASADFUNC = Option<unsafe extern "system" fn(param0: super::super::Foundation::HWND, param1: windows_sys::core::PCSTR, param2: u32, param3: *mut u32) -> windows_sys::core::BOOL>;

public const val `PENDING`: UInt = 600u;
// UNSUPPORTED Rust 1338:1: generic scalar type unsupported
// pub type PFNRASFREEBUFFER = Option<unsafe extern "system" fn(pbufer: *mut u8) -> u32>;

// UNSUPPORTED Rust 1339:1: generic scalar type unsupported
// pub type PFNRASGETBUFFER = Option<unsafe extern "system" fn(ppbuffer: *mut *mut u8, pdwsize: *mut u32) -> u32>;

// UNSUPPORTED Rust 1340:1: generic scalar type unsupported
// pub type PFNRASRECEIVEBUFFER = Option<unsafe extern "system" fn(hport: super::super::Foundation::HANDLE, pbuffer: *mut u8, pdwsize: *mut u32, dwtimeout: u32, hevent: super::super::Foundation::HANDLE) -> u32>;

// UNSUPPORTED Rust 1341:1: generic scalar type unsupported
// pub type PFNRASRETRIEVEBUFFER = Option<unsafe extern "system" fn(hport: super::super::Foundation::HANDLE, pbuffer: *mut u8, pdwsize: *mut u32) -> u32>;

// UNSUPPORTED Rust 1342:1: generic scalar type unsupported
// pub type PFNRASSENDBUFFER = Option<unsafe extern "system" fn(hport: super::super::Foundation::HANDLE, pbuffer: *mut u8, dwsize: u32) -> u32>;

// UNSUPPORTED Rust 1343:1: generic scalar type unsupported
// pub type PFNRASSETCOMMSETTINGS = Option<unsafe extern "system" fn(hport: super::super::Foundation::HANDLE, prascommsettings: *mut RASCOMMSETTINGS, pvreserved: *mut core::ffi::c_void) -> u32>;

public const val `PID_ATALK`: UInt = 41u;
public const val `PID_IP`: UInt = 33u;
public const val `PID_IPV6`: UInt = 87u;
public const val `PID_IPX`: UInt = 43u;
public const val `PID_NBF`: UInt = 63u;
// UNSUPPORTED Rust 1349:1: generic scalar type unsupported
// pub type PMGM_CREATION_ALERT_CALLBACK = Option<unsafe extern "system" fn(dwsourceaddr: u32, dwsourcemask: u32, dwgroupaddr: u32, dwgroupmask: u32, dwinifindex: u32, dwinifnexthopaddr: u32, dwifcount: u32, pmieoutiflist: *mut MGM_IF_ENTRY) -> u32>;

// UNSUPPORTED Rust 1350:1: generic scalar type unsupported
// pub type PMGM_DISABLE_IGMP_CALLBACK = Option<unsafe extern "system" fn(dwifindex: u32, dwifnexthopaddr: u32) -> u32>;

// UNSUPPORTED Rust 1351:1: generic scalar type unsupported
// pub type PMGM_ENABLE_IGMP_CALLBACK = Option<unsafe extern "system" fn(dwifindex: u32, dwifnexthopaddr: u32) -> u32>;

// UNSUPPORTED Rust 1352:1: generic scalar type unsupported
// pub type PMGM_JOIN_ALERT_CALLBACK = Option<unsafe extern "system" fn(dwsourceaddr: u32, dwsourcemask: u32, dwgroupaddr: u32, dwgroupmask: u32, bmemberupdate: windows_sys::core::BOOL) -> u32>;

// UNSUPPORTED Rust 1353:1: generic scalar type unsupported
// pub type PMGM_LOCAL_JOIN_CALLBACK = Option<unsafe extern "system" fn(dwsourceaddr: u32, dwsourcemask: u32, dwgroupaddr: u32, dwgroupmask: u32, dwifindex: u32, dwifnexthopaddr: u32) -> u32>;

// UNSUPPORTED Rust 1354:1: generic scalar type unsupported
// pub type PMGM_LOCAL_LEAVE_CALLBACK = Option<unsafe extern "system" fn(dwsourceaddr: u32, dwsourcemask: u32, dwgroupaddr: u32, dwgroupmask: u32, dwifindex: u32, dwifnexthopaddr: u32) -> u32>;

// UNSUPPORTED Rust 1355:1: generic scalar type unsupported
// pub type PMGM_PRUNE_ALERT_CALLBACK = Option<unsafe extern "system" fn(dwsourceaddr: u32, dwsourcemask: u32, dwgroupaddr: u32, dwgroupmask: u32, dwifindex: u32, dwifnexthopaddr: u32, bmemberdelete: windows_sys::core::BOOL, pdwtimeout: *mut u32) -> u32>;

// UNSUPPORTED Rust 1356:1: generic scalar type unsupported
// pub type PMGM_RPF_CALLBACK = Option<unsafe extern "system" fn(dwsourceaddr: u32, dwsourcemask: u32, dwgroupaddr: u32, dwgroupmask: u32, pdwinifindex: *mut u32, pdwinifnexthopaddr: *mut u32, pdwupstreamnbr: *mut u32, dwhdrsize: u32, pbpackethdr: *mut u8, pbroute: *mut u8) -> u32>;

// UNSUPPORTED Rust 1357:1: generic scalar type unsupported
// pub type PMGM_WRONG_IF_CALLBACK = Option<unsafe extern "system" fn(dwsourceaddr: u32, dwgroupaddr: u32, dwifindex: u32, dwifnexthopaddr: u32, dwhdrsize: u32, pbpackethdr: *mut u8) -> u32>;

// UNSUPPORTED Rust 1358:1: generic scalar type unsupported
// pub type PMPRADMINACCEPTNEWCONNECTION = Option<unsafe extern "system" fn(param0: *mut RAS_CONNECTION_0, param1: *mut RAS_CONNECTION_1) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 1359:1: generic scalar type unsupported
// pub type PMPRADMINACCEPTNEWCONNECTION2 = Option<unsafe extern "system" fn(param0: *mut RAS_CONNECTION_0, param1: *mut RAS_CONNECTION_1, param2: *mut RAS_CONNECTION_2) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 1360:1: generic scalar type unsupported
// pub type PMPRADMINACCEPTNEWCONNECTION3 = Option<unsafe extern "system" fn(param0: *mut RAS_CONNECTION_0, param1: *mut RAS_CONNECTION_1, param2: *mut RAS_CONNECTION_2, param3: *mut RAS_CONNECTION_3) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 1361:1: generic scalar type unsupported
// pub type PMPRADMINACCEPTNEWCONNECTIONEX = Option<unsafe extern "system" fn(param0: *mut RAS_CONNECTION_EX) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 1362:1: generic scalar type unsupported
// pub type PMPRADMINACCEPTNEWLINK = Option<unsafe extern "system" fn(param0: *mut RAS_PORT_0, param1: *mut RAS_PORT_1) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 1363:1: generic scalar type unsupported
// pub type PMPRADMINACCEPTREAUTHENTICATION = Option<unsafe extern "system" fn(param0: *mut RAS_CONNECTION_0, param1: *mut RAS_CONNECTION_1, param2: *mut RAS_CONNECTION_2, param3: *mut RAS_CONNECTION_3) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 1364:1: generic scalar type unsupported
// pub type PMPRADMINACCEPTREAUTHENTICATIONEX = Option<unsafe extern "system" fn(param0: *mut RAS_CONNECTION_EX) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 1365:1: generic scalar type unsupported
// pub type PMPRADMINACCEPTTUNNELENDPOINTCHANGEEX = Option<unsafe extern "system" fn(param0: *mut RAS_CONNECTION_EX) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 1366:1: generic scalar type unsupported
// pub type PMPRADMINCONNECTIONHANGUPNOTIFICATION = Option<unsafe extern "system" fn(param0: *mut RAS_CONNECTION_0, param1: *mut RAS_CONNECTION_1)>;

// UNSUPPORTED Rust 1367:1: generic scalar type unsupported
// pub type PMPRADMINCONNECTIONHANGUPNOTIFICATION2 = Option<unsafe extern "system" fn(param0: *mut RAS_CONNECTION_0, param1: *mut RAS_CONNECTION_1, param2: *mut RAS_CONNECTION_2)>;

// UNSUPPORTED Rust 1368:1: generic scalar type unsupported
// pub type PMPRADMINCONNECTIONHANGUPNOTIFICATION3 = Option<unsafe extern "system" fn(param0: *mut RAS_CONNECTION_0, param1: *mut RAS_CONNECTION_1, param2: *mut RAS_CONNECTION_2, param3: *mut RAS_CONNECTION_3)>;

// UNSUPPORTED Rust 1369:1: generic scalar type unsupported
// pub type PMPRADMINCONNECTIONHANGUPNOTIFICATIONEX = Option<unsafe extern "system" fn(param0: *mut RAS_CONNECTION_EX)>;

// UNSUPPORTED Rust 1370:1: generic scalar type unsupported
// pub type PMPRADMINGETIPADDRESSFORUSER = Option<unsafe extern "system" fn(param0: windows_sys::core::PCWSTR, param1: windows_sys::core::PCWSTR, param2: *mut u32, param3: *mut windows_sys::core::BOOL) -> u32>;

// UNSUPPORTED Rust 1371:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Networking_WinSock")]
// pub type PMPRADMINGETIPV6ADDRESSFORUSER = Option<unsafe extern "system" fn(param0: windows_sys::core::PCWSTR, param1: windows_sys::core::PCWSTR, param2: *mut super::super::Networking::WinSock::IN6_ADDR, param3: *mut windows_sys::core::BOOL) -> u32>;

// UNSUPPORTED Rust 1373:1: generic scalar type unsupported
// pub type PMPRADMINLINKHANGUPNOTIFICATION = Option<unsafe extern "system" fn(param0: *mut RAS_PORT_0, param1: *mut RAS_PORT_1)>;

// UNSUPPORTED Rust 1374:1: generic scalar type unsupported
// pub type PMPRADMINRASVALIDATEPREAUTHENTICATEDCONNECTIONEX = Option<unsafe extern "system" fn(param0: *mut AUTH_VALIDATION_EX) -> u32>;

// UNSUPPORTED Rust 1375:1: generic scalar type unsupported
// pub type PMPRADMINRELEASEIPADRESS = Option<unsafe extern "system" fn(param0: windows_sys::core::PCWSTR, param1: windows_sys::core::PCWSTR, param2: *mut u32)>;

// UNSUPPORTED Rust 1376:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Networking_WinSock")]
// pub type PMPRADMINRELEASEIPV6ADDRESSFORUSER = Option<unsafe extern "system" fn(param0: windows_sys::core::PCWSTR, param1: windows_sys::core::PCWSTR, param2: *mut super::super::Networking::WinSock::IN6_ADDR)>;

// UNSUPPORTED Rust 1378:1: generic scalar type unsupported
// pub type PMPRADMINTERMINATEDLL = Option<unsafe extern "system" fn() -> u32>;

// UNSUPPORTED Rust 1379:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PPP_ATCP_INFO {
//     pub dwError: u32,
//     pub wszAddress: [u16; 33],
// }

// UNSUPPORTED Rust 1385:1: declaration Impl has no candidate rule
// impl Default for PPP_ATCP_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PPP_CCP_COMPRESSION`: UInt = 1u;
public const val `PPP_CCP_ENCRYPTION128BIT`: UInt = 64u;
public const val `PPP_CCP_ENCRYPTION40BIT`: UInt = 32u;
public const val `PPP_CCP_ENCRYPTION40BITOLD`: UInt = 16u;
public const val `PPP_CCP_ENCRYPTION56BIT`: UInt = 128u;
public const val `PPP_CCP_HISTORYLESS`: UInt = 16777216u;
// UNSUPPORTED Rust 1396:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PPP_CCP_INFO {
//     pub dwError: u32,
//     pub dwCompressionAlgorithm: u32,
//     pub dwOptions: u32,
//     pub dwRemoteCompressionAlgorithm: u32,
//     pub dwRemoteOptions: u32,
// }

// UNSUPPORTED Rust 1405:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PPP_INFO {
//     pub nbf: PPP_NBFCP_INFO,
//     pub ip: PPP_IPCP_INFO,
//     pub ipx: PPP_IPXCP_INFO,
//     pub at: PPP_ATCP_INFO,
// }

// UNSUPPORTED Rust 1413:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PPP_INFO_2 {
//     pub nbf: PPP_NBFCP_INFO,
//     pub ip: PPP_IPCP_INFO2,
//     pub ipx: PPP_IPXCP_INFO,
//     pub at: PPP_ATCP_INFO,
//     pub ccp: PPP_CCP_INFO,
//     pub lcp: PPP_LCP_INFO,
// }

// UNSUPPORTED Rust 1423:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PPP_INFO_3 {
//     pub nbf: PPP_NBFCP_INFO,
//     pub ip: PPP_IPCP_INFO2,
//     pub ipv6: PPP_IPV6_CP_INFO,
//     pub ccp: PPP_CCP_INFO,
//     pub lcp: PPP_LCP_INFO,
// }

// UNSUPPORTED Rust 1432:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PPP_IPCP_INFO {
//     pub dwError: u32,
//     pub wszAddress: [u16; 16],
//     pub wszRemoteAddress: [u16; 16],
// }

// UNSUPPORTED Rust 1439:1: declaration Impl has no candidate rule
// impl Default for PPP_IPCP_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1444:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PPP_IPCP_INFO2 {
//     pub dwError: u32,
//     pub wszAddress: [u16; 16],
//     pub wszRemoteAddress: [u16; 16],
//     pub dwOptions: u32,
//     pub dwRemoteOptions: u32,
// }

// UNSUPPORTED Rust 1453:1: declaration Impl has no candidate rule
// impl Default for PPP_IPCP_INFO2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PPP_IPCP_VJ`: UInt = 1u;
// UNSUPPORTED Rust 1459:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PPP_IPV6_CP_INFO {
//     pub dwVersion: u32,
//     pub dwSize: u32,
//     pub dwError: u32,
//     pub bInterfaceIdentifier: [u8; 8],
//     pub bRemoteInterfaceIdentifier: [u8; 8],
//     pub dwOptions: u32,
//     pub dwRemoteOptions: u32,
//     pub bPrefix: [u8; 8],
//     pub dwPrefixLength: u32,
// }

// UNSUPPORTED Rust 1472:1: declaration Impl has no candidate rule
// impl Default for PPP_IPV6_CP_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1477:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PPP_IPXCP_INFO {
//     pub dwError: u32,
//     pub wszAddress: [u16; 23],
// }

// UNSUPPORTED Rust 1483:1: declaration Impl has no candidate rule
// impl Default for PPP_IPXCP_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `PPP_LCP` = UInt;
public const val `PPP_LCP_3_DES`: UInt = 32u;
public const val `PPP_LCP_ACFC`: UInt = 4u;
public const val `PPP_LCP_AES_128`: UInt = 64u;
public const val `PPP_LCP_AES_192`: UInt = 256u;
public const val `PPP_LCP_AES_256`: UInt = 128u;
public const val `PPP_LCP_CHAP`: `PPP_LCP` = 49699u;
public const val `PPP_LCP_CHAP_MD5`: `PPP_LCP_INFO_AUTH_DATA` = 5u;
public const val `PPP_LCP_CHAP_MS`: `PPP_LCP_INFO_AUTH_DATA` = 128u;
public const val `PPP_LCP_CHAP_MSV2`: `PPP_LCP_INFO_AUTH_DATA` = 129u;
public const val `PPP_LCP_DES_56`: UInt = 16u;
public const val `PPP_LCP_EAP`: `PPP_LCP` = 49703u;
public const val `PPP_LCP_GCM_AES_128`: UInt = 512u;
public const val `PPP_LCP_GCM_AES_192`: UInt = 1024u;
public const val `PPP_LCP_GCM_AES_256`: UInt = 2048u;
// UNSUPPORTED Rust 1503:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PPP_LCP_INFO {
//     pub dwError: u32,
//     pub dwAuthenticationProtocol: PPP_LCP,
//     pub dwAuthenticationData: PPP_LCP_INFO_AUTH_DATA,
//     pub dwRemoteAuthenticationProtocol: u32,
//     pub dwRemoteAuthenticationData: u32,
//     pub dwTerminateReason: u32,
//     pub dwRemoteTerminateReason: u32,
//     pub dwOptions: u32,
//     pub dwRemoteOptions: u32,
//     pub dwEapTypeId: u32,
//     pub dwRemoteEapTypeId: u32,
// }

public typealias `PPP_LCP_INFO_AUTH_DATA` = UInt;
public const val `PPP_LCP_MULTILINK_FRAMING`: UInt = 1u;
public const val `PPP_LCP_PAP`: `PPP_LCP` = 49187u;
public const val `PPP_LCP_PFC`: UInt = 2u;
public const val `PPP_LCP_SPAP`: `PPP_LCP` = 49191u;
public const val `PPP_LCP_SSHF`: UInt = 8u;
// UNSUPPORTED Rust 1524:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PPP_NBFCP_INFO {
//     pub dwError: u32,
//     pub wszWksta: [u16; 17],
// }

// UNSUPPORTED Rust 1530:1: declaration Impl has no candidate rule
// impl Default for PPP_NBFCP_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1535:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PPP_PROJECTION_INFO {
//     pub dwIPv4NegotiationError: u32,
//     pub wszAddress: [u16; 16],
//     pub wszRemoteAddress: [u16; 16],
//     pub dwIPv4Options: u32,
//     pub dwIPv4RemoteOptions: u32,
//     pub IPv4SubInterfaceIndex: u64,
//     pub dwIPv6NegotiationError: u32,
//     pub bInterfaceIdentifier: [u8; 8],
//     pub bRemoteInterfaceIdentifier: [u8; 8],
//     pub bPrefix: [u8; 8],
//     pub dwPrefixLength: u32,
//     pub IPv6SubInterfaceIndex: u64,
//     pub dwLcpError: u32,
//     pub dwAuthenticationProtocol: PPP_LCP,
//     pub dwAuthenticationData: PPP_LCP_INFO_AUTH_DATA,
//     pub dwRemoteAuthenticationProtocol: PPP_LCP,
//     pub dwRemoteAuthenticationData: PPP_LCP_INFO_AUTH_DATA,
//     pub dwLcpTerminateReason: u32,
//     pub dwLcpRemoteTerminateReason: u32,
//     pub dwLcpOptions: u32,
//     pub dwLcpRemoteOptions: u32,
//     pub dwEapTypeId: u32,
//     pub dwRemoteEapTypeId: u32,
//     pub dwCcpError: u32,
//     pub dwCompressionAlgorithm: u32,
//     pub dwCcpOptions: u32,
//     pub dwRemoteCompressionAlgorithm: u32,
//     pub dwCcpRemoteOptions: u32,
// }

// UNSUPPORTED Rust 1567:1: declaration Impl has no candidate rule
// impl Default for PPP_PROJECTION_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1572:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PPP_PROJECTION_INFO2 {
//     pub dwIPv4NegotiationError: u32,
//     pub wszAddress: [u16; 16],
//     pub wszRemoteAddress: [u16; 16],
//     pub dwIPv4Options: u32,
//     pub dwIPv4RemoteOptions: u32,
//     pub IPv4SubInterfaceIndex: u64,
//     pub dwIPv6NegotiationError: u32,
//     pub bInterfaceIdentifier: [u8; 8],
//     pub bRemoteInterfaceIdentifier: [u8; 8],
//     pub bPrefix: [u8; 8],
//     pub dwPrefixLength: u32,
//     pub IPv6SubInterfaceIndex: u64,
//     pub dwLcpError: u32,
//     pub dwAuthenticationProtocol: PPP_LCP,
//     pub dwAuthenticationData: PPP_LCP_INFO_AUTH_DATA,
//     pub dwRemoteAuthenticationProtocol: PPP_LCP,
//     pub dwRemoteAuthenticationData: PPP_LCP_INFO_AUTH_DATA,
//     pub dwLcpTerminateReason: u32,
//     pub dwLcpRemoteTerminateReason: u32,
//     pub dwLcpOptions: u32,
//     pub dwLcpRemoteOptions: u32,
//     pub dwEapTypeId: u32,
//     pub dwEmbeddedEAPTypeId: u32,
//     pub dwRemoteEapTypeId: u32,
//     pub dwCcpError: u32,
//     pub dwCompressionAlgorithm: u32,
//     pub dwCcpOptions: u32,
//     pub dwRemoteCompressionAlgorithm: u32,
//     pub dwCcpRemoteOptions: u32,
// }

// UNSUPPORTED Rust 1605:1: declaration Impl has no candidate rule
// impl Default for PPP_PROJECTION_INFO2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1610:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PPTP_CONFIG_PARAMS {
//     pub dwNumPorts: u32,
//     pub dwPortFlags: u32,
// }

// UNSUPPORTED Rust 1616:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PROJECTION_INFO {
//     pub projectionInfoType: u8,
//     pub Anonymous: PROJECTION_INFO_0,
// }

// UNSUPPORTED Rust 1622:1: declaration Impl has no candidate rule
// impl Default for PROJECTION_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1627:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union PROJECTION_INFO_0 {
//     pub PppProjectionInfo: PPP_PROJECTION_INFO,
//     pub Ikev2ProjectionInfo: IKEV2_PROJECTION_INFO,
// }

// UNSUPPORTED Rust 1633:1: declaration Impl has no candidate rule
// impl Default for PROJECTION_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1638:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PROJECTION_INFO2 {
//     pub projectionInfoType: u8,
//     pub Anonymous: PROJECTION_INFO2_0,
// }

// UNSUPPORTED Rust 1644:1: declaration Impl has no candidate rule
// impl Default for PROJECTION_INFO2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1649:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union PROJECTION_INFO2_0 {
//     pub PppProjectionInfo: PPP_PROJECTION_INFO2,
//     pub Ikev2ProjectionInfo: IKEV2_PROJECTION_INFO2,
// }

// UNSUPPORTED Rust 1655:1: declaration Impl has no candidate rule
// impl Default for PROJECTION_INFO2_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PROJECTION_INFO_TYPE_IKEv2`: `RASPROJECTION_INFO_TYPE` = 2;
public const val `PROJECTION_INFO_TYPE_PPP`: `RASPROJECTION_INFO_TYPE` = 1;
public const val `RASADFLG_PositionDlg`: UInt = 1u;
// UNSUPPORTED Rust 1663:1: generic scalar type unsupported
// pub type RASADFUNCA = Option<unsafe extern "system" fn(param0: windows_sys::core::PCSTR, param1: windows_sys::core::PCSTR, param2: *mut RASADPARAMS, param3: *mut u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 1664:1: generic scalar type unsupported
// pub type RASADFUNCW = Option<unsafe extern "system" fn(param0: windows_sys::core::PCWSTR, param1: windows_sys::core::PCWSTR, param2: *mut RASADPARAMS, param3: *mut u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 1665:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[derive(Clone, Copy)]
// pub struct RASADPARAMS {
//     pub dwSize: u32,
//     pub hwndOwner: super::super::Foundation::HWND,
//     pub dwFlags: u32,
//     pub xDlg: i32,
//     pub yDlg: i32,
// }

// UNSUPPORTED Rust 1674:1: declaration Impl has no candidate rule
// impl Default for RASADPARAMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `RASADP_ConnectionQueryTimeout`: UInt = 4u;
public const val `RASADP_DisableConnectionQuery`: UInt = 0u;
public const val `RASADP_FailedConnectionTimeout`: UInt = 3u;
public const val `RASADP_LoginSessionDisable`: UInt = 1u;
public const val `RASADP_SavedAddressesLimit`: UInt = 2u;
// UNSUPPORTED Rust 1684:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RASAMBA {
//     pub dwSize: u32,
//     pub dwError: u32,
//     pub szNetBiosError: [i8; 17],
//     pub bLana: u8,
// }

// UNSUPPORTED Rust 1692:1: declaration Impl has no candidate rule
// impl Default for RASAMBA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1697:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RASAMBW {
//     pub dwSize: u32,
//     pub dwError: u32,
//     pub szNetBiosError: [u16; 17],
//     pub bLana: u8,
// }

// UNSUPPORTED Rust 1705:1: declaration Impl has no candidate rule
// impl Default for RASAMBW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `RASAPIVERSION` = Int;
public const val `RASAPIVERSION_500`: `RASAPIVERSION` = 1;
public const val `RASAPIVERSION_501`: `RASAPIVERSION` = 2;
public const val `RASAPIVERSION_600`: `RASAPIVERSION` = 3;
public const val `RASAPIVERSION_601`: `RASAPIVERSION` = 4;
// UNSUPPORTED Rust 1715:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RASAUTODIALENTRYA {
//     pub dwSize: u32,
//     pub dwFlags: u32,
//     pub dwDialingLocation: u32,
//     pub szEntry: [i8; 257],
// }

// UNSUPPORTED Rust 1723:1: declaration Impl has no candidate rule
// impl Default for RASAUTODIALENTRYA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1728:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RASAUTODIALENTRYW {
//     pub dwSize: u32,
//     pub dwFlags: u32,
//     pub dwDialingLocation: u32,
//     pub szEntry: [u16; 257],
// }

// UNSUPPORTED Rust 1736:1: declaration Impl has no candidate rule
// impl Default for RASAUTODIALENTRYW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `RASBASE`: UInt = 600u;
public const val `RASBASEEND`: UInt = 877u;
public const val `RASCCPCA_MPPC`: UInt = 6u;
public const val `RASCCPCA_STAC`: UInt = 5u;
public const val `RASCCPO_Compression`: UInt = 1u;
public const val `RASCCPO_Encryption128bit`: UInt = 64u;
public const val `RASCCPO_Encryption40bit`: UInt = 32u;
public const val `RASCCPO_Encryption56bit`: UInt = 16u;
public const val `RASCCPO_HistoryLess`: UInt = 2u;
public const val `RASCF_AllUsers`: UInt = 1u;
public const val `RASCF_GlobalCreds`: UInt = 2u;
public const val `RASCF_OwnerKnown`: UInt = 4u;
public const val `RASCF_OwnerMatch`: UInt = 8u;
public const val `RASCM_DDMPreSharedKey`: UInt = 64u;
public const val `RASCM_DefaultCreds`: UInt = 8u;
public const val `RASCM_Domain`: UInt = 4u;
public const val `RASCM_Password`: UInt = 2u;
public const val `RASCM_PreSharedKey`: UInt = 16u;
public const val `RASCM_ServerPreSharedKey`: UInt = 32u;
public const val `RASCM_UserName`: UInt = 1u;
public const val `RASCN_BandwidthAdded`: UInt = 4u;
public const val `RASCN_BandwidthRemoved`: UInt = 8u;
public const val `RASCN_Connection`: UInt = 1u;
public const val `RASCN_Disconnection`: UInt = 2u;
public const val `RASCN_Dormant`: UInt = 16u;
public const val `RASCN_EPDGPacketArrival`: UInt = 64u;
public const val `RASCN_ReConnection`: UInt = 32u;
// UNSUPPORTED Rust 1768:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct RASCOMMSETTINGS {
//     pub dwSize: u32,
//     pub bParity: u8,
//     pub bStop: u8,
//     pub bByteSize: u8,
//     pub bAlign: u8,
// }

// UNSUPPORTED Rust 1777:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct RASCONNA {
//     pub dwSize: u32,
//     pub hrasconn: HRASCONN,
//     pub szEntryName: [i8; 257],
//     pub szDeviceType: [i8; 17],
//     pub szDeviceName: [i8; 129],
//     pub szPhonebook: [i8; 260],
//     pub dwSubEntry: u32,
//     pub guidEntry: windows_sys::core::GUID,
//     pub dwFlags: u32,
//     pub luid: super::super::Foundation::LUID,
//     pub guidCorrelationId: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 1793:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for RASCONNA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1799:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct RASCONNA {
//     pub dwSize: u32,
//     pub hrasconn: HRASCONN,
//     pub szEntryName: [i8; 257],
//     pub szDeviceType: [i8; 17],
//     pub szDeviceName: [i8; 129],
//     pub szPhonebook: [i8; 260],
//     pub dwSubEntry: u32,
//     pub guidEntry: windows_sys::core::GUID,
//     pub dwFlags: u32,
//     pub luid: super::super::Foundation::LUID,
//     pub guidCorrelationId: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 1815:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for RASCONNA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `RASCONNSTATE` = Int;
// UNSUPPORTED Rust 1822:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct RASCONNSTATUSA {
//     pub dwSize: u32,
//     pub rasconnstate: RASCONNSTATE,
//     pub dwError: u32,
//     pub szDeviceType: [i8; 17],
//     pub szDeviceName: [i8; 129],
//     pub szPhoneNumber: [i8; 129],
//     pub localEndPoint: RASTUNNELENDPOINT,
//     pub remoteEndPoint: RASTUNNELENDPOINT,
//     pub rasconnsubstate: RASCONNSUBSTATE,
// }

// UNSUPPORTED Rust 1836:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for RASCONNSTATUSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1842:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct RASCONNSTATUSW {
//     pub dwSize: u32,
//     pub rasconnstate: RASCONNSTATE,
//     pub dwError: u32,
//     pub szDeviceType: [u16; 17],
//     pub szDeviceName: [u16; 129],
//     pub szPhoneNumber: [u16; 129],
//     pub localEndPoint: RASTUNNELENDPOINT,
//     pub remoteEndPoint: RASTUNNELENDPOINT,
//     pub rasconnsubstate: RASCONNSUBSTATE,
// }

// UNSUPPORTED Rust 1856:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for RASCONNSTATUSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `RASCONNSUBSTATE` = Int;
// UNSUPPORTED Rust 1863:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct RASCONNW {
//     pub dwSize: u32,
//     pub hrasconn: HRASCONN,
//     pub szEntryName: [u16; 257],
//     pub szDeviceType: [u16; 17],
//     pub szDeviceName: [u16; 129],
//     pub szPhonebook: [u16; 260],
//     pub dwSubEntry: u32,
//     pub guidEntry: windows_sys::core::GUID,
//     pub dwFlags: u32,
//     pub luid: super::super::Foundation::LUID,
//     pub guidCorrelationId: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 1879:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for RASCONNW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1885:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct RASCONNW {
//     pub dwSize: u32,
//     pub hrasconn: HRASCONN,
//     pub szEntryName: [u16; 257],
//     pub szDeviceType: [u16; 17],
//     pub szDeviceName: [u16; 129],
//     pub szPhonebook: [u16; 260],
//     pub dwSubEntry: u32,
//     pub guidEntry: windows_sys::core::GUID,
//     pub dwFlags: u32,
//     pub luid: super::super::Foundation::LUID,
//     pub guidCorrelationId: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 1901:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for RASCONNW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1907:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RASCREDENTIALSA {
//     pub dwSize: u32,
//     pub dwMask: u32,
//     pub szUserName: [i8; 257],
//     pub szPassword: [i8; 257],
//     pub szDomain: [i8; 16],
// }

// UNSUPPORTED Rust 1916:1: declaration Impl has no candidate rule
// impl Default for RASCREDENTIALSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1921:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RASCREDENTIALSW {
//     pub dwSize: u32,
//     pub dwMask: u32,
//     pub szUserName: [u16; 257],
//     pub szPassword: [u16; 257],
//     pub szDomain: [u16; 16],
// }

// UNSUPPORTED Rust 1930:1: declaration Impl has no candidate rule
// impl Default for RASCREDENTIALSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `RASCSS_DONE`: UInt = 8192u;
public const val `RASCSS_Dormant`: `RASCONNSUBSTATE` = 1;
public const val `RASCSS_None`: `RASCONNSUBSTATE` = 0;
public const val `RASCSS_Reconnected`: `RASCONNSUBSTATE` = 8192;
public const val `RASCSS_Reconnecting`: `RASCONNSUBSTATE` = 2;
public const val `RASCS_AllDevicesConnected`: `RASCONNSTATE` = 4;
public const val `RASCS_ApplySettings`: `RASCONNSTATE` = 24;
public const val `RASCS_AuthAck`: `RASCONNSTATE` = 12;
public const val `RASCS_AuthCallback`: `RASCONNSTATE` = 8;
public const val `RASCS_AuthChangePassword`: `RASCONNSTATE` = 9;
public const val `RASCS_AuthLinkSpeed`: `RASCONNSTATE` = 11;
public const val `RASCS_AuthNotify`: `RASCONNSTATE` = 6;
public const val `RASCS_AuthProject`: `RASCONNSTATE` = 10;
public const val `RASCS_AuthRetry`: `RASCONNSTATE` = 7;
public const val `RASCS_Authenticate`: `RASCONNSTATE` = 5;
public const val `RASCS_Authenticated`: `RASCONNSTATE` = 14;
public const val `RASCS_CallbackComplete`: `RASCONNSTATE` = 20;
public const val `RASCS_CallbackSetByCaller`: `RASCONNSTATE` = 4098;
public const val `RASCS_ConnectDevice`: `RASCONNSTATE` = 2;
public const val `RASCS_Connected`: `RASCONNSTATE` = 8192;
public const val `RASCS_DONE`: UInt = 8192u;
public const val `RASCS_DeviceConnected`: `RASCONNSTATE` = 3;
public const val `RASCS_Disconnected`: `RASCONNSTATE` = 8193;
public const val `RASCS_Interactive`: `RASCONNSTATE` = 4096;
public const val `RASCS_InvokeEapUI`: `RASCONNSTATE` = 4100;
public const val `RASCS_LogonNetwork`: `RASCONNSTATE` = 21;
public const val `RASCS_OpenPort`: `RASCONNSTATE` = 0;
public const val `RASCS_PAUSED`: UInt = 4096u;
public const val `RASCS_PasswordExpired`: `RASCONNSTATE` = 4099;
public const val `RASCS_PortOpened`: `RASCONNSTATE` = 1;
public const val `RASCS_PrepareForCallback`: `RASCONNSTATE` = 15;
public const val `RASCS_Projected`: `RASCONNSTATE` = 18;
public const val `RASCS_ReAuthenticate`: `RASCONNSTATE` = 13;
public const val `RASCS_RetryAuthentication`: `RASCONNSTATE` = 4097;
public const val `RASCS_StartAuthentication`: `RASCONNSTATE` = 19;
public const val `RASCS_SubEntryConnected`: `RASCONNSTATE` = 22;
public const val `RASCS_SubEntryDisconnected`: `RASCONNSTATE` = 23;
public const val `RASCS_WaitForCallback`: `RASCONNSTATE` = 17;
public const val `RASCS_WaitForModemReset`: `RASCONNSTATE` = 16;
// UNSUPPORTED Rust 1974:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct RASCTRYINFO {
//     pub dwSize: u32,
//     pub dwCountryID: u32,
//     pub dwNextCountryID: u32,
//     pub dwCountryCode: u32,
//     pub dwCountryNameOffset: u32,
// }

// UNSUPPORTED Rust 1983:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[derive(Clone, Copy, Default)]
// pub struct RASCUSTOMSCRIPTEXTENSIONS {
//     pub dwSize: u32,
//     pub pfnRasSetCommSettings: PFNRASSETCOMMSETTINGS,
// }

public const val `RASDDFLAG_AoacRedial`: UInt = 4u;
public const val `RASDDFLAG_LinkFailure`: UInt = 2147483648u;
public const val `RASDDFLAG_NoPrompt`: UInt = 2u;
public const val `RASDDFLAG_PositionDlg`: UInt = 1u;
// UNSUPPORTED Rust 1993:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RASDEVINFOA {
//     pub dwSize: u32,
//     pub szDeviceType: [i8; 17],
//     pub szDeviceName: [i8; 129],
// }

// UNSUPPORTED Rust 2000:1: declaration Impl has no candidate rule
// impl Default for RASDEVINFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2005:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RASDEVINFOW {
//     pub dwSize: u32,
//     pub szDeviceType: [u16; 17],
//     pub szDeviceName: [u16; 129],
// }

// UNSUPPORTED Rust 2012:1: declaration Impl has no candidate rule
// impl Default for RASDEVINFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2017:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct RASDEVSPECIFICINFO {
//     pub dwSize: u32,
//     pub pbDevSpecificInfo: *mut u8,
// }

// UNSUPPORTED Rust 2024:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for RASDEVSPECIFICINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2030:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct RASDEVSPECIFICINFO {
//     pub dwSize: u32,
//     pub pbDevSpecificInfo: *mut u8,
// }

// UNSUPPORTED Rust 2037:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for RASDEVSPECIFICINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2043:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[derive(Clone, Copy)]
// pub struct RASDIALDLG {
//     pub dwSize: u32,
//     pub hwndOwner: super::super::Foundation::HWND,
//     pub dwFlags: u32,
//     pub xDlg: i32,
//     pub yDlg: i32,
//     pub dwSubEntry: u32,
//     pub dwError: u32,
//     pub reserved: usize,
//     pub reserved2: usize,
// }

// UNSUPPORTED Rust 2056:1: declaration Impl has no candidate rule
// impl Default for RASDIALDLG {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2061:1: non-scalar type Ptr unsupported
// pub const RASDIALEVENT: windows_sys::core::PCSTR = windows_sys::core::s!("RasDialEvent");

// UNSUPPORTED Rust 2062:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[derive(Clone, Copy)]
// pub struct RASDIALEXTENSIONS {
//     pub dwSize: u32,
//     pub dwfOptions: u32,
//     pub hwndParent: super::super::Foundation::HWND,
//     pub reserved: usize,
//     pub reserved1: usize,
//     pub RasEapInfo: RASEAPINFO,
//     pub fSkipPppAuth: windows_sys::core::BOOL,
//     pub RasDevSpecificInfo: RASDEVSPECIFICINFO,
// }

// UNSUPPORTED Rust 2074:1: declaration Impl has no candidate rule
// impl Default for RASDIALEXTENSIONS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2079:1: generic scalar type unsupported
// pub type RASDIALFUNC = Option<unsafe extern "system" fn(param0: u32, param1: RASCONNSTATE, param2: u32)>;

// UNSUPPORTED Rust 2080:1: generic scalar type unsupported
// pub type RASDIALFUNC1 = Option<unsafe extern "system" fn(param0: HRASCONN, param1: u32, param2: RASCONNSTATE, param3: u32, param4: u32)>;

// UNSUPPORTED Rust 2081:1: generic scalar type unsupported
// pub type RASDIALFUNC2 = Option<unsafe extern "system" fn(param0: usize, param1: u32, param2: HRASCONN, param3: u32, param4: RASCONNSTATE, param5: u32, param6: u32) -> u32>;

// UNSUPPORTED Rust 2082:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct RASDIALPARAMSA {
//     pub dwSize: u32,
//     pub szEntryName: [i8; 257],
//     pub szPhoneNumber: [i8; 129],
//     pub szCallbackNumber: [i8; 129],
//     pub szUserName: [i8; 257],
//     pub szPassword: [i8; 257],
//     pub szDomain: [i8; 16],
//     pub dwSubEntry: u32,
//     pub dwCallbackId: usize,
//     pub dwIfIndex: u32,
//     pub szEncPassword: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 2098:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for RASDIALPARAMSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2104:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct RASDIALPARAMSA {
//     pub dwSize: u32,
//     pub szEntryName: [i8; 257],
//     pub szPhoneNumber: [i8; 129],
//     pub szCallbackNumber: [i8; 129],
//     pub szUserName: [i8; 257],
//     pub szPassword: [i8; 257],
//     pub szDomain: [i8; 16],
//     pub dwSubEntry: u32,
//     pub dwCallbackId: usize,
//     pub dwIfIndex: u32,
//     pub szEncPassword: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 2120:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for RASDIALPARAMSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2126:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct RASDIALPARAMSW {
//     pub dwSize: u32,
//     pub szEntryName: [u16; 257],
//     pub szPhoneNumber: [u16; 129],
//     pub szCallbackNumber: [u16; 129],
//     pub szUserName: [u16; 257],
//     pub szPassword: [u16; 257],
//     pub szDomain: [u16; 16],
//     pub dwSubEntry: u32,
//     pub dwCallbackId: usize,
//     pub dwIfIndex: u32,
//     pub szEncPassword: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 2142:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for RASDIALPARAMSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2148:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct RASDIALPARAMSW {
//     pub dwSize: u32,
//     pub szEntryName: [u16; 257],
//     pub szPhoneNumber: [u16; 129],
//     pub szCallbackNumber: [u16; 129],
//     pub szUserName: [u16; 257],
//     pub szPassword: [u16; 257],
//     pub szDomain: [u16; 16],
//     pub dwSubEntry: u32,
//     pub dwCallbackId: usize,
//     pub dwIfIndex: u32,
//     pub szEncPassword: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 2164:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for RASDIALPARAMSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2170:1: non-scalar type Ptr unsupported
// pub const RASDT_Atm: windows_sys::core::PCWSTR = windows_sys::core::w!("ATM");

// UNSUPPORTED Rust 2171:1: non-scalar type Ptr unsupported
// pub const RASDT_FrameRelay: windows_sys::core::PCWSTR = windows_sys::core::w!("FRAMERELAY");

// UNSUPPORTED Rust 2172:1: non-scalar type Ptr unsupported
// pub const RASDT_Generic: windows_sys::core::PCWSTR = windows_sys::core::w!("GENERIC");

// UNSUPPORTED Rust 2173:1: non-scalar type Ptr unsupported
// pub const RASDT_Irda: windows_sys::core::PCWSTR = windows_sys::core::w!("IRDA");

// UNSUPPORTED Rust 2174:1: non-scalar type Ptr unsupported
// pub const RASDT_Isdn: windows_sys::core::PCWSTR = windows_sys::core::w!("isdn");

// UNSUPPORTED Rust 2175:1: non-scalar type Ptr unsupported
// pub const RASDT_Modem: windows_sys::core::PCWSTR = windows_sys::core::w!("modem");

// UNSUPPORTED Rust 2176:1: non-scalar type Ptr unsupported
// pub const RASDT_PPPoE: windows_sys::core::PCWSTR = windows_sys::core::w!("PPPoE");

// UNSUPPORTED Rust 2177:1: non-scalar type Ptr unsupported
// pub const RASDT_Pad: windows_sys::core::PCWSTR = windows_sys::core::w!("pad");

// UNSUPPORTED Rust 2178:1: non-scalar type Ptr unsupported
// pub const RASDT_Parallel: windows_sys::core::PCWSTR = windows_sys::core::w!("PARALLEL");

// UNSUPPORTED Rust 2179:1: non-scalar type Ptr unsupported
// pub const RASDT_SW56: windows_sys::core::PCWSTR = windows_sys::core::w!("SW56");

// UNSUPPORTED Rust 2180:1: non-scalar type Ptr unsupported
// pub const RASDT_Serial: windows_sys::core::PCWSTR = windows_sys::core::w!("SERIAL");

// UNSUPPORTED Rust 2181:1: non-scalar type Ptr unsupported
// pub const RASDT_Sonet: windows_sys::core::PCWSTR = windows_sys::core::w!("SONET");

// UNSUPPORTED Rust 2182:1: non-scalar type Ptr unsupported
// pub const RASDT_Vpn: windows_sys::core::PCWSTR = windows_sys::core::w!("vpn");

// UNSUPPORTED Rust 2183:1: non-scalar type Ptr unsupported
// pub const RASDT_X25: windows_sys::core::PCWSTR = windows_sys::core::w!("x25");

public const val `RASEAPF_Logon`: UInt = 4u;
public const val `RASEAPF_NonInteractive`: UInt = 2u;
public const val `RASEAPF_Preview`: UInt = 8u;
// UNSUPPORTED Rust 2187:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[derive(Clone, Copy)]
// pub struct RASEAPINFO {
//     pub dwSizeofEapInfo: u32,
//     pub pbEapInfo: *mut u8,
// }

// UNSUPPORTED Rust 2193:1: declaration Impl has no candidate rule
// impl Default for RASEAPINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2198:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RASEAPUSERIDENTITYA {
//     pub szUserName: [i8; 257],
//     pub dwSizeofEapInfo: u32,
//     pub pbEapInfo: [u8; 1],
// }

// UNSUPPORTED Rust 2205:1: declaration Impl has no candidate rule
// impl Default for RASEAPUSERIDENTITYA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2210:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RASEAPUSERIDENTITYW {
//     pub szUserName: [u16; 257],
//     pub dwSizeofEapInfo: u32,
//     pub pbEapInfo: [u8; 1],
// }

// UNSUPPORTED Rust 2217:1: declaration Impl has no candidate rule
// impl Default for RASEAPUSERIDENTITYW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `RASEDFLAG_CloneEntry`: UInt = 4u;
public const val `RASEDFLAG_IncomingConnection`: UInt = 1024u;
public const val `RASEDFLAG_InternetEntry`: UInt = 256u;
public const val `RASEDFLAG_NAT`: UInt = 512u;
public const val `RASEDFLAG_NewBroadbandEntry`: UInt = 128u;
public const val `RASEDFLAG_NewDirectEntry`: UInt = 64u;
public const val `RASEDFLAG_NewEntry`: UInt = 2u;
public const val `RASEDFLAG_NewPhoneEntry`: UInt = 16u;
public const val `RASEDFLAG_NewTunnelEntry`: UInt = 32u;
public const val `RASEDFLAG_NoRename`: UInt = 8u;
public const val `RASEDFLAG_PositionDlg`: UInt = 1u;
public const val `RASEDFLAG_ShellOwned`: UInt = 1073741824u;
public const val `RASEDM_DialAll`: `RASENTRY_DIAL_MODE` = 1u;
public const val `RASEDM_DialAsNeeded`: `RASENTRY_DIAL_MODE` = 2u;
// UNSUPPORTED Rust 2236:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct RASENTRYA {
//     pub dwSize: u32,
//     pub dwfOptions: u32,
//     pub dwCountryID: u32,
//     pub dwCountryCode: u32,
//     pub szAreaCode: [i8; 11],
//     pub szLocalPhoneNumber: [i8; 129],
//     pub dwAlternateOffset: u32,
//     pub ipaddr: RASIPADDR,
//     pub ipaddrDns: RASIPADDR,
//     pub ipaddrDnsAlt: RASIPADDR,
//     pub ipaddrWins: RASIPADDR,
//     pub ipaddrWinsAlt: RASIPADDR,
//     pub dwFrameSize: u32,
//     pub dwfNetProtocols: u32,
//     pub dwFramingProtocol: u32,
//     pub szScript: [i8; 260],
//     pub szAutodialDll: [i8; 260],
//     pub szAutodialFunc: [i8; 260],
//     pub szDeviceType: [i8; 17],
//     pub szDeviceName: [i8; 129],
//     pub szX25PadType: [i8; 33],
//     pub szX25Address: [i8; 201],
//     pub szX25Facilities: [i8; 201],
//     pub szX25UserData: [i8; 201],
//     pub dwChannels: u32,
//     pub dwReserved1: u32,
//     pub dwReserved2: u32,
//     pub dwSubEntries: u32,
//     pub dwDialMode: RASENTRY_DIAL_MODE,
//     pub dwDialExtraPercent: u32,
//     pub dwDialExtraSampleSeconds: u32,
//     pub dwHangUpExtraPercent: u32,
//     pub dwHangUpExtraSampleSeconds: u32,
//     pub dwIdleDisconnectSeconds: u32,
//     pub dwType: u32,
//     pub dwEncryptionType: u32,
//     pub dwCustomAuthKey: u32,
//     pub guidId: windows_sys::core::GUID,
//     pub szCustomDialDll: [i8; 260],
//     pub dwVpnStrategy: u32,
//     pub dwfOptions2: u32,
//     pub dwfOptions3: u32,
//     pub szDnsSuffix: [i8; 256],
//     pub dwTcpWindowSize: u32,
//     pub szPrerequisitePbk: [i8; 260],
//     pub szPrerequisiteEntry: [i8; 257],
//     pub dwRedialCount: u32,
//     pub dwRedialPause: u32,
//     pub ipv6addrDns: super::super::Networking::WinSock::IN6_ADDR,
//     pub ipv6addrDnsAlt: super::super::Networking::WinSock::IN6_ADDR,
//     pub dwIPv4InterfaceMetric: u32,
//     pub dwIPv6InterfaceMetric: u32,
//     pub ipv6addr: super::super::Networking::WinSock::IN6_ADDR,
//     pub dwIPv6PrefixLength: u32,
//     pub dwNetworkOutageTime: u32,
//     pub szIDi: [i8; 257],
//     pub szIDr: [i8; 257],
//     pub fIsImsConfig: windows_sys::core::BOOL,
//     pub IdiType: IKEV2_ID_PAYLOAD_TYPE,
//     pub IdrType: IKEV2_ID_PAYLOAD_TYPE,
//     pub fDisableIKEv2Fragmentation: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 2302:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for RASENTRYA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2308:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct RASENTRYDLGA {
//     pub dwSize: u32,
//     pub hwndOwner: super::super::Foundation::HWND,
//     pub dwFlags: u32,
//     pub xDlg: i32,
//     pub yDlg: i32,
//     pub szEntry: [i8; 257],
//     pub dwError: u32,
//     pub reserved: usize,
//     pub reserved2: usize,
// }

// UNSUPPORTED Rust 2322:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for RASENTRYDLGA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2328:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct RASENTRYDLGA {
//     pub dwSize: u32,
//     pub hwndOwner: super::super::Foundation::HWND,
//     pub dwFlags: u32,
//     pub xDlg: i32,
//     pub yDlg: i32,
//     pub szEntry: [i8; 257],
//     pub dwError: u32,
//     pub reserved: usize,
//     pub reserved2: usize,
// }

// UNSUPPORTED Rust 2342:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for RASENTRYDLGA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2348:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct RASENTRYDLGW {
//     pub dwSize: u32,
//     pub hwndOwner: super::super::Foundation::HWND,
//     pub dwFlags: u32,
//     pub xDlg: i32,
//     pub yDlg: i32,
//     pub szEntry: [u16; 257],
//     pub dwError: u32,
//     pub reserved: usize,
//     pub reserved2: usize,
// }

// UNSUPPORTED Rust 2362:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for RASENTRYDLGW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2368:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct RASENTRYDLGW {
//     pub dwSize: u32,
//     pub hwndOwner: super::super::Foundation::HWND,
//     pub dwFlags: u32,
//     pub xDlg: i32,
//     pub yDlg: i32,
//     pub szEntry: [u16; 257],
//     pub dwError: u32,
//     pub reserved: usize,
//     pub reserved2: usize,
// }

// UNSUPPORTED Rust 2382:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for RASENTRYDLGW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2388:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RASENTRYNAMEA {
//     pub dwSize: u32,
//     pub szEntryName: [i8; 257],
//     pub dwFlags: u32,
//     pub szPhonebookPath: [i8; 261],
// }

// UNSUPPORTED Rust 2396:1: declaration Impl has no candidate rule
// impl Default for RASENTRYNAMEA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2401:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RASENTRYNAMEW {
//     pub dwSize: u32,
//     pub szEntryName: [u16; 257],
//     pub dwFlags: u32,
//     pub szPhonebookPath: [u16; 261],
// }

// UNSUPPORTED Rust 2409:1: declaration Impl has no candidate rule
// impl Default for RASENTRYNAMEW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2414:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct RASENTRYW {
//     pub dwSize: u32,
//     pub dwfOptions: u32,
//     pub dwCountryID: u32,
//     pub dwCountryCode: u32,
//     pub szAreaCode: [u16; 11],
//     pub szLocalPhoneNumber: [u16; 129],
//     pub dwAlternateOffset: u32,
//     pub ipaddr: RASIPADDR,
//     pub ipaddrDns: RASIPADDR,
//     pub ipaddrDnsAlt: RASIPADDR,
//     pub ipaddrWins: RASIPADDR,
//     pub ipaddrWinsAlt: RASIPADDR,
//     pub dwFrameSize: u32,
//     pub dwfNetProtocols: u32,
//     pub dwFramingProtocol: u32,
//     pub szScript: [u16; 260],
//     pub szAutodialDll: [u16; 260],
//     pub szAutodialFunc: [u16; 260],
//     pub szDeviceType: [u16; 17],
//     pub szDeviceName: [u16; 129],
//     pub szX25PadType: [u16; 33],
//     pub szX25Address: [u16; 201],
//     pub szX25Facilities: [u16; 201],
//     pub szX25UserData: [u16; 201],
//     pub dwChannels: u32,
//     pub dwReserved1: u32,
//     pub dwReserved2: u32,
//     pub dwSubEntries: u32,
//     pub dwDialMode: RASENTRY_DIAL_MODE,
//     pub dwDialExtraPercent: u32,
//     pub dwDialExtraSampleSeconds: u32,
//     pub dwHangUpExtraPercent: u32,
//     pub dwHangUpExtraSampleSeconds: u32,
//     pub dwIdleDisconnectSeconds: u32,
//     pub dwType: u32,
//     pub dwEncryptionType: u32,
//     pub dwCustomAuthKey: u32,
//     pub guidId: windows_sys::core::GUID,
//     pub szCustomDialDll: [u16; 260],
//     pub dwVpnStrategy: u32,
//     pub dwfOptions2: u32,
//     pub dwfOptions3: u32,
//     pub szDnsSuffix: [u16; 256],
//     pub dwTcpWindowSize: u32,
//     pub szPrerequisitePbk: [u16; 260],
//     pub szPrerequisiteEntry: [u16; 257],
//     pub dwRedialCount: u32,
//     pub dwRedialPause: u32,
//     pub ipv6addrDns: super::super::Networking::WinSock::IN6_ADDR,
//     pub ipv6addrDnsAlt: super::super::Networking::WinSock::IN6_ADDR,
//     pub dwIPv4InterfaceMetric: u32,
//     pub dwIPv6InterfaceMetric: u32,
//     pub ipv6addr: super::super::Networking::WinSock::IN6_ADDR,
//     pub dwIPv6PrefixLength: u32,
//     pub dwNetworkOutageTime: u32,
//     pub szIDi: [u16; 257],
//     pub szIDr: [u16; 257],
//     pub fIsImsConfig: windows_sys::core::BOOL,
//     pub IdiType: IKEV2_ID_PAYLOAD_TYPE,
//     pub IdrType: IKEV2_ID_PAYLOAD_TYPE,
//     pub fDisableIKEv2Fragmentation: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 2480:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for RASENTRYW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `RASENTRY_DIAL_MODE` = UInt;
public const val `RASEO2_AuthTypeIsOtp`: UInt = 268435456u;
public const val `RASEO2_AutoTriggerCapable`: UInt = 67108864u;
public const val `RASEO2_CacheCredentials`: UInt = 33554432u;
public const val `RASEO2_DisableClassBasedStaticRoute`: UInt = 524288u;
public const val `RASEO2_DisableIKENameEkuCheck`: UInt = 262144u;
public const val `RASEO2_DisableMobility`: UInt = 2097152u;
public const val `RASEO2_DisableNbtOverIP`: UInt = 64u;
public const val `RASEO2_DontNegotiateMultilink`: UInt = 4u;
public const val `RASEO2_DontUseRasCredentials`: UInt = 8u;
public const val `RASEO2_IPv4ExplicitMetric`: UInt = 65536u;
public const val `RASEO2_IPv6ExplicitMetric`: UInt = 131072u;
public const val `RASEO2_IPv6RemoteDefaultGateway`: UInt = 8192u;
public const val `RASEO2_IPv6SpecificNameServers`: UInt = 4096u;
public const val `RASEO2_Internet`: UInt = 32u;
public const val `RASEO2_IsAlwaysOn`: UInt = 536870912u;
public const val `RASEO2_IsPrivateNetwork`: UInt = 1073741824u;
public const val `RASEO2_IsThirdPartyProfile`: UInt = 134217728u;
public const val `RASEO2_PlumbIKEv2TSAsRoutes`: UInt = 2147483648u;
public const val `RASEO2_ReconnectIfDropped`: UInt = 256u;
public const val `RASEO2_RegisterIpWithDNS`: UInt = 16384u;
public const val `RASEO2_RequireMachineCertificates`: UInt = 4194304u;
public const val `RASEO2_SecureClientForMSNet`: UInt = 2u;
public const val `RASEO2_SecureFileAndPrint`: UInt = 1u;
public const val `RASEO2_SecureRoutingCompartment`: UInt = 1024u;
public const val `RASEO2_SharePhoneNumbers`: UInt = 512u;
public const val `RASEO2_SpecificIPv6Addr`: UInt = 1048576u;
public const val `RASEO2_UseDNSSuffixForRegistration`: UInt = 32768u;
public const val `RASEO2_UseGlobalDeviceSettings`: UInt = 128u;
public const val `RASEO2_UsePreSharedKey`: UInt = 16u;
public const val `RASEO2_UsePreSharedKeyForIkev2Initiator`: UInt = 8388608u;
public const val `RASEO2_UsePreSharedKeyForIkev2Responder`: UInt = 16777216u;
public const val `RASEO2_UseTypicalSettings`: UInt = 2048u;
public const val `RASEO_Custom`: UInt = 1048576u;
public const val `RASEO_CustomScript`: UInt = 2147483648u;
public const val `RASEO_DisableLcpExtensions`: UInt = 32u;
public const val `RASEO_IpHeaderCompression`: UInt = 8u;
public const val `RASEO_ModemLights`: UInt = 256u;
public const val `RASEO_NetworkLogon`: UInt = 8192u;
public const val `RASEO_PreviewDomain`: UInt = 33554432u;
public const val `RASEO_PreviewPhoneNumber`: UInt = 2097152u;
public const val `RASEO_PreviewUserPw`: UInt = 16777216u;
public const val `RASEO_PromoteAlternates`: UInt = 32768u;
public const val `RASEO_RemoteDefaultGateway`: UInt = 16u;
public const val `RASEO_RequireCHAP`: UInt = 134217728u;
public const val `RASEO_RequireDataEncryption`: UInt = 4096u;
public const val `RASEO_RequireEAP`: UInt = 131072u;
public const val `RASEO_RequireEncryptedPw`: UInt = 1024u;
public const val `RASEO_RequireMsCHAP`: UInt = 268435456u;
public const val `RASEO_RequireMsCHAP2`: UInt = 536870912u;
public const val `RASEO_RequireMsEncryptedPw`: UInt = 2048u;
public const val `RASEO_RequirePAP`: UInt = 262144u;
public const val `RASEO_RequireSPAP`: UInt = 524288u;
public const val `RASEO_RequireW95MSCHAP`: UInt = 1073741824u;
public const val `RASEO_SecureLocalFiles`: UInt = 65536u;
public const val `RASEO_SharedPhoneNumbers`: UInt = 8388608u;
public const val `RASEO_ShowDialingProgress`: UInt = 67108864u;
public const val `RASEO_SpecificIpAddr`: UInt = 2u;
public const val `RASEO_SpecificNameServers`: UInt = 4u;
public const val `RASEO_SwCompression`: UInt = 512u;
public const val `RASEO_TerminalAfterDial`: UInt = 128u;
public const val `RASEO_TerminalBeforeDial`: UInt = 64u;
public const val `RASEO_UseCountryAndAreaCodes`: UInt = 1u;
public const val `RASEO_UseLogonCredentials`: UInt = 16384u;
public const val `RASET_Broadband`: UInt = 5u;
public const val `RASET_Direct`: UInt = 3u;
public const val `RASET_Internet`: UInt = 4u;
public const val `RASET_Phone`: UInt = 1u;
public const val `RASET_Vpn`: UInt = 2u;
public const val `RASFP_Ppp`: UInt = 1u;
public const val `RASFP_Ras`: UInt = 4u;
public const val `RASFP_Slip`: UInt = 2u;
public const val `RASIDS_Disabled`: UInt = 4294967295u;
public const val `RASIDS_UseGlobalValue`: UInt = 0u;
// UNSUPPORTED Rust 2560:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(target_arch = "x86")]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct RASIKEV2_PROJECTION_INFO {
//     pub dwIPv4NegotiationError: u32,
//     pub ipv4Address: super::super::Networking::WinSock::IN_ADDR,
//     pub ipv4ServerAddress: super::super::Networking::WinSock::IN_ADDR,
//     pub dwIPv6NegotiationError: u32,
//     pub ipv6Address: super::super::Networking::WinSock::IN6_ADDR,
//     pub ipv6ServerAddress: super::super::Networking::WinSock::IN6_ADDR,
//     pub dwPrefixLength: u32,
//     pub dwAuthenticationProtocol: u32,
//     pub dwEapTypeId: u32,
//     pub dwFlags: RASIKEV_PROJECTION_INFO_FLAGS,
//     pub dwEncryptionMethod: u32,
//     pub numIPv4ServerAddresses: u32,
//     pub ipv4ServerAddresses: *mut super::super::Networking::WinSock::IN_ADDR,
//     pub numIPv6ServerAddresses: u32,
//     pub ipv6ServerAddresses: *mut super::super::Networking::WinSock::IN6_ADDR,
// }

// UNSUPPORTED Rust 2581:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for RASIKEV2_PROJECTION_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2588:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct RASIKEV2_PROJECTION_INFO {
//     pub dwIPv4NegotiationError: u32,
//     pub ipv4Address: super::super::Networking::WinSock::IN_ADDR,
//     pub ipv4ServerAddress: super::super::Networking::WinSock::IN_ADDR,
//     pub dwIPv6NegotiationError: u32,
//     pub ipv6Address: super::super::Networking::WinSock::IN6_ADDR,
//     pub ipv6ServerAddress: super::super::Networking::WinSock::IN6_ADDR,
//     pub dwPrefixLength: u32,
//     pub dwAuthenticationProtocol: u32,
//     pub dwEapTypeId: u32,
//     pub dwFlags: RASIKEV_PROJECTION_INFO_FLAGS,
//     pub dwEncryptionMethod: u32,
//     pub numIPv4ServerAddresses: u32,
//     pub ipv4ServerAddresses: *mut super::super::Networking::WinSock::IN_ADDR,
//     pub numIPv6ServerAddresses: u32,
//     pub ipv6ServerAddresses: *mut super::super::Networking::WinSock::IN6_ADDR,
// }

// UNSUPPORTED Rust 2609:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for RASIKEV2_PROJECTION_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `RASIKEV_PROJECTION_INFO_FLAGS` = UInt;
public const val `RASIKEv2_AUTH_EAP`: UInt = 2u;
public const val `RASIKEv2_AUTH_MACHINECERTIFICATES`: UInt = 1u;
public const val `RASIKEv2_AUTH_PSK`: UInt = 3u;
public const val `RASIKEv2_FLAGS_BEHIND_NAT`: `RASIKEV_PROJECTION_INFO_FLAGS` = 2u;
public const val `RASIKEv2_FLAGS_MOBIKESUPPORTED`: `RASIKEV_PROJECTION_INFO_FLAGS` = 1u;
public const val `RASIKEv2_FLAGS_SERVERBEHIND_NAT`: `RASIKEV_PROJECTION_INFO_FLAGS` = 4u;
// UNSUPPORTED Rust 2623:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct RASIPADDR {
//     pub a: u8,
//     pub b: u8,
//     pub c: u8,
//     pub d: u8,
// }

public const val `RASIPO_VJ`: UInt = 1u;
// UNSUPPORTED Rust 2632:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RASIPXW {
//     pub dwSize: u32,
//     pub dwError: u32,
//     pub szIpxAddress: [u16; 22],
// }

// UNSUPPORTED Rust 2639:1: declaration Impl has no candidate rule
// impl Default for RASIPXW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `RASLCPAD_CHAP_MD5`: `RASPPP_PROJECTION_INFO_SERVER_AUTH_DATA` = 5u;
public const val `RASLCPAD_CHAP_MS`: `RASPPP_PROJECTION_INFO_SERVER_AUTH_DATA` = 128u;
public const val `RASLCPAD_CHAP_MSV2`: `RASPPP_PROJECTION_INFO_SERVER_AUTH_DATA` = 129u;
public const val `RASLCPAP_CHAP`: `RASPPP_PROJECTION_INFO_SERVER_AUTH_PROTOCOL` = 49699u;
public const val `RASLCPAP_EAP`: `RASPPP_PROJECTION_INFO_SERVER_AUTH_PROTOCOL` = 49703u;
public const val `RASLCPAP_PAP`: `RASPPP_PROJECTION_INFO_SERVER_AUTH_PROTOCOL` = 49187u;
public const val `RASLCPAP_SPAP`: `RASPPP_PROJECTION_INFO_SERVER_AUTH_PROTOCOL` = 49191u;
public const val `RASLCPO_3_DES`: UInt = 16u;
public const val `RASLCPO_ACFC`: UInt = 2u;
public const val `RASLCPO_AES_128`: UInt = 32u;
public const val `RASLCPO_AES_192`: UInt = 128u;
public const val `RASLCPO_AES_256`: UInt = 64u;
public const val `RASLCPO_DES_56`: UInt = 8u;
public const val `RASLCPO_GCM_AES_128`: UInt = 256u;
public const val `RASLCPO_GCM_AES_192`: UInt = 512u;
public const val `RASLCPO_GCM_AES_256`: UInt = 1024u;
public const val `RASLCPO_PFC`: UInt = 1u;
public const val `RASLCPO_SSHF`: UInt = 4u;
public const val `RASNAP_ProbationTime`: UInt = 1u;
// UNSUPPORTED Rust 2663:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RASNOUSERA {
//     pub dwSize: u32,
//     pub dwFlags: u32,
//     pub dwTimeoutMs: u32,
//     pub szUserName: [i8; 257],
//     pub szPassword: [i8; 257],
//     pub szDomain: [i8; 16],
// }

// UNSUPPORTED Rust 2673:1: declaration Impl has no candidate rule
// impl Default for RASNOUSERA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2678:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RASNOUSERW {
//     pub dwSize: u32,
//     pub dwFlags: u32,
//     pub dwTimeoutMs: u32,
//     pub szUserName: [u16; 257],
//     pub szPassword: [u16; 257],
//     pub szDomain: [u16; 16],
// }

// UNSUPPORTED Rust 2688:1: declaration Impl has no candidate rule
// impl Default for RASNOUSERW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `RASNOUSER_SmartCard`: UInt = 1u;
public const val `RASNP_Ip`: UInt = 4u;
public const val `RASNP_Ipv6`: UInt = 8u;
public const val `RASNP_Ipx`: UInt = 2u;
public const val `RASNP_NetBEUI`: UInt = 1u;
public const val `RASPBDEVENT_AddEntry`: UInt = 1u;
public const val `RASPBDEVENT_DialEntry`: UInt = 4u;
public const val `RASPBDEVENT_EditEntry`: UInt = 2u;
public const val `RASPBDEVENT_EditGlobals`: UInt = 5u;
public const val `RASPBDEVENT_NoUser`: UInt = 6u;
public const val `RASPBDEVENT_NoUserEdit`: UInt = 7u;
public const val `RASPBDEVENT_RemoveEntry`: UInt = 3u;
public const val `RASPBDFLAG_ForceCloseOnDial`: UInt = 2u;
public const val `RASPBDFLAG_NoUser`: UInt = 16u;
public const val `RASPBDFLAG_PositionDlg`: UInt = 1u;
public const val `RASPBDFLAG_UpdateDefaults`: UInt = 2147483648u;
// UNSUPPORTED Rust 2709:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct RASPBDLGA {
//     pub dwSize: u32,
//     pub hwndOwner: super::super::Foundation::HWND,
//     pub dwFlags: u32,
//     pub xDlg: i32,
//     pub yDlg: i32,
//     pub dwCallbackId: usize,
//     pub pCallback: RASPBDLGFUNCA,
//     pub dwError: u32,
//     pub reserved: usize,
//     pub reserved2: usize,
// }

// UNSUPPORTED Rust 2724:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for RASPBDLGA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2730:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct RASPBDLGA {
//     pub dwSize: u32,
//     pub hwndOwner: super::super::Foundation::HWND,
//     pub dwFlags: u32,
//     pub xDlg: i32,
//     pub yDlg: i32,
//     pub dwCallbackId: usize,
//     pub pCallback: RASPBDLGFUNCA,
//     pub dwError: u32,
//     pub reserved: usize,
//     pub reserved2: usize,
// }

// UNSUPPORTED Rust 2745:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for RASPBDLGA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2751:1: generic scalar type unsupported
// pub type RASPBDLGFUNCA = Option<unsafe extern "system" fn(param0: usize, param1: u32, param2: windows_sys::core::PCSTR, param3: *mut core::ffi::c_void)>;

// UNSUPPORTED Rust 2752:1: generic scalar type unsupported
// pub type RASPBDLGFUNCW = Option<unsafe extern "system" fn(param0: usize, param1: u32, param2: windows_sys::core::PCWSTR, param3: *mut core::ffi::c_void)>;

// UNSUPPORTED Rust 2753:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct RASPBDLGW {
//     pub dwSize: u32,
//     pub hwndOwner: super::super::Foundation::HWND,
//     pub dwFlags: u32,
//     pub xDlg: i32,
//     pub yDlg: i32,
//     pub dwCallbackId: usize,
//     pub pCallback: RASPBDLGFUNCW,
//     pub dwError: u32,
//     pub reserved: usize,
//     pub reserved2: usize,
// }

// UNSUPPORTED Rust 2768:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for RASPBDLGW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2774:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct RASPBDLGW {
//     pub dwSize: u32,
//     pub hwndOwner: super::super::Foundation::HWND,
//     pub dwFlags: u32,
//     pub xDlg: i32,
//     pub yDlg: i32,
//     pub dwCallbackId: usize,
//     pub pCallback: RASPBDLGFUNCW,
//     pub dwError: u32,
//     pub reserved: usize,
//     pub reserved2: usize,
// }

// UNSUPPORTED Rust 2789:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for RASPBDLGW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2795:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct RASPPPCCP {
//     pub dwSize: u32,
//     pub dwError: u32,
//     pub dwCompressionAlgorithm: u32,
//     pub dwOptions: u32,
//     pub dwServerCompressionAlgorithm: u32,
//     pub dwServerOptions: u32,
// }

// UNSUPPORTED Rust 2805:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RASPPPIPA {
//     pub dwSize: u32,
//     pub dwError: u32,
//     pub szIpAddress: [i8; 16],
//     pub szServerIpAddress: [i8; 16],
//     pub dwOptions: u32,
//     pub dwServerOptions: u32,
// }

// UNSUPPORTED Rust 2815:1: declaration Impl has no candidate rule
// impl Default for RASPPPIPA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2820:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RASPPPIPV6 {
//     pub dwSize: u32,
//     pub dwError: u32,
//     pub bLocalInterfaceIdentifier: [u8; 8],
//     pub bPeerInterfaceIdentifier: [u8; 8],
//     pub bLocalCompressionProtocol: [u8; 2],
//     pub bPeerCompressionProtocol: [u8; 2],
// }

// UNSUPPORTED Rust 2830:1: declaration Impl has no candidate rule
// impl Default for RASPPPIPV6 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2835:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RASPPPIPW {
//     pub dwSize: u32,
//     pub dwError: u32,
//     pub szIpAddress: [u16; 16],
//     pub szServerIpAddress: [u16; 16],
//     pub dwOptions: u32,
//     pub dwServerOptions: u32,
// }

// UNSUPPORTED Rust 2845:1: declaration Impl has no candidate rule
// impl Default for RASPPPIPW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2850:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RASPPPIPXA {
//     pub dwSize: u32,
//     pub dwError: u32,
//     pub szIpxAddress: [i8; 22],
// }

// UNSUPPORTED Rust 2857:1: declaration Impl has no candidate rule
// impl Default for RASPPPIPXA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2862:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RASPPPLCPA {
//     pub dwSize: u32,
//     pub fBundled: windows_sys::core::BOOL,
//     pub dwError: u32,
//     pub dwAuthenticationProtocol: u32,
//     pub dwAuthenticationData: u32,
//     pub dwEapTypeId: u32,
//     pub dwServerAuthenticationProtocol: u32,
//     pub dwServerAuthenticationData: u32,
//     pub dwServerEapTypeId: u32,
//     pub fMultilink: windows_sys::core::BOOL,
//     pub dwTerminateReason: u32,
//     pub dwServerTerminateReason: u32,
//     pub szReplyMessage: [i8; 1024],
//     pub dwOptions: u32,
//     pub dwServerOptions: u32,
// }

// UNSUPPORTED Rust 2881:1: declaration Impl has no candidate rule
// impl Default for RASPPPLCPA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2886:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RASPPPLCPW {
//     pub dwSize: u32,
//     pub fBundled: windows_sys::core::BOOL,
//     pub dwError: u32,
//     pub dwAuthenticationProtocol: u32,
//     pub dwAuthenticationData: u32,
//     pub dwEapTypeId: u32,
//     pub dwServerAuthenticationProtocol: u32,
//     pub dwServerAuthenticationData: u32,
//     pub dwServerEapTypeId: u32,
//     pub fMultilink: windows_sys::core::BOOL,
//     pub dwTerminateReason: u32,
//     pub dwServerTerminateReason: u32,
//     pub szReplyMessage: [u16; 1024],
//     pub dwOptions: u32,
//     pub dwServerOptions: u32,
// }

// UNSUPPORTED Rust 2905:1: declaration Impl has no candidate rule
// impl Default for RASPPPLCPW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2910:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RASPPPNBFA {
//     pub dwSize: u32,
//     pub dwError: u32,
//     pub dwNetBiosError: u32,
//     pub szNetBiosError: [i8; 17],
//     pub szWorkstationName: [i8; 17],
//     pub bLana: u8,
// }

// UNSUPPORTED Rust 2920:1: declaration Impl has no candidate rule
// impl Default for RASPPPNBFA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2925:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RASPPPNBFW {
//     pub dwSize: u32,
//     pub dwError: u32,
//     pub dwNetBiosError: u32,
//     pub szNetBiosError: [u16; 17],
//     pub szWorkstationName: [u16; 17],
//     pub bLana: u8,
// }

// UNSUPPORTED Rust 2935:1: declaration Impl has no candidate rule
// impl Default for RASPPPNBFW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2940:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct RASPPP_PROJECTION_INFO {
//     pub dwIPv4NegotiationError: u32,
//     pub ipv4Address: super::super::Networking::WinSock::IN_ADDR,
//     pub ipv4ServerAddress: super::super::Networking::WinSock::IN_ADDR,
//     pub dwIPv4Options: u32,
//     pub dwIPv4ServerOptions: u32,
//     pub dwIPv6NegotiationError: u32,
//     pub bInterfaceIdentifier: [u8; 8],
//     pub bServerInterfaceIdentifier: [u8; 8],
//     pub fBundled: windows_sys::core::BOOL,
//     pub fMultilink: windows_sys::core::BOOL,
//     pub dwAuthenticationProtocol: RASPPP_PROJECTION_INFO_SERVER_AUTH_PROTOCOL,
//     pub dwAuthenticationData: RASPPP_PROJECTION_INFO_SERVER_AUTH_DATA,
//     pub dwServerAuthenticationProtocol: RASPPP_PROJECTION_INFO_SERVER_AUTH_PROTOCOL,
//     pub dwServerAuthenticationData: RASPPP_PROJECTION_INFO_SERVER_AUTH_DATA,
//     pub dwEapTypeId: u32,
//     pub dwServerEapTypeId: u32,
//     pub dwLcpOptions: u32,
//     pub dwLcpServerOptions: u32,
//     pub dwCcpError: u32,
//     pub dwCcpCompressionAlgorithm: u32,
//     pub dwCcpServerCompressionAlgorithm: u32,
//     pub dwCcpOptions: u32,
//     pub dwCcpServerOptions: u32,
// }

// UNSUPPORTED Rust 2968:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for RASPPP_PROJECTION_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `RASPPP_PROJECTION_INFO_SERVER_AUTH_DATA` = UInt;
public typealias `RASPPP_PROJECTION_INFO_SERVER_AUTH_PROTOCOL` = UInt;
public const val `RASPRIV2_DialinPolicy`: UInt = 1u;
public const val `RASPRIV_AdminSetCallback`: UInt = 2u;
public const val `RASPRIV_CallerSetCallback`: UInt = 4u;
public const val `RASPRIV_DialinPrivilege`: UInt = 8u;
public const val `RASPRIV_NoCallback`: UInt = 1u;
public typealias `RASPROJECTION` = Int;
public typealias `RASPROJECTION_INFO_TYPE` = Int;
public const val `RASP_Amb`: `RASPROJECTION` = 65536;
public const val `RASP_PppCcp`: `RASPROJECTION` = 33021;
public const val `RASP_PppIp`: `RASPROJECTION` = 32801;
public const val `RASP_PppIpv6`: `RASPROJECTION` = 32855;
public const val `RASP_PppIpx`: `RASPROJECTION` = 32811;
public const val `RASP_PppLcp`: `RASPROJECTION` = 49185;
public const val `RASP_PppNbf`: `RASPROJECTION` = 32831;
// UNSUPPORTED Rust 2990:1: generic scalar type unsupported
// pub type RASSECURITYPROC = Option<unsafe extern "system" fn() -> u32>;

// UNSUPPORTED Rust 2991:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RASSUBENTRYA {
//     pub dwSize: u32,
//     pub dwfFlags: u32,
//     pub szDeviceType: [i8; 17],
//     pub szDeviceName: [i8; 129],
//     pub szLocalPhoneNumber: [i8; 129],
//     pub dwAlternateOffset: u32,
// }

// UNSUPPORTED Rust 3001:1: declaration Impl has no candidate rule
// impl Default for RASSUBENTRYA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3006:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RASSUBENTRYW {
//     pub dwSize: u32,
//     pub dwfFlags: u32,
//     pub szDeviceType: [u16; 17],
//     pub szDeviceName: [u16; 129],
//     pub szLocalPhoneNumber: [u16; 129],
//     pub dwAlternateOffset: u32,
// }

// UNSUPPORTED Rust 3016:1: declaration Impl has no candidate rule
// impl Default for RASSUBENTRYW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3021:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct RASTUNNELENDPOINT {
//     pub dwType: u32,
//     pub Anonymous: RASTUNNELENDPOINT_0,
// }

// UNSUPPORTED Rust 3028:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for RASTUNNELENDPOINT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3034:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub union RASTUNNELENDPOINT_0 {
//     pub ipv4: super::super::Networking::WinSock::IN_ADDR,
//     pub ipv6: super::super::Networking::WinSock::IN6_ADDR,
// }

// UNSUPPORTED Rust 3041:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for RASTUNNELENDPOINT_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `RASTUNNELENDPOINT_IPv4`: UInt = 1u;
public const val `RASTUNNELENDPOINT_IPv6`: UInt = 2u;
public const val `RASTUNNELENDPOINT_UNKNOWN`: UInt = 0u;
// UNSUPPORTED Rust 3050:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct RASUPDATECONN {
//     pub version: RASAPIVERSION,
//     pub dwSize: u32,
//     pub dwFlags: u32,
//     pub dwIfIndex: u32,
//     pub localEndPoint: RASTUNNELENDPOINT,
//     pub remoteEndPoint: RASTUNNELENDPOINT,
// }

// UNSUPPORTED Rust 3061:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for RASUPDATECONN {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3067:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RAS_CONNECTION_0 {
//     pub hConnection: super::super::Foundation::HANDLE,
//     pub hInterface: super::super::Foundation::HANDLE,
//     pub dwConnectDuration: u32,
//     pub dwInterfaceType: ROUTER_INTERFACE_TYPE,
//     pub dwConnectionFlags: RAS_FLAGS,
//     pub wszInterfaceName: [u16; 257],
//     pub wszUserName: [u16; 257],
//     pub wszLogonDomain: [u16; 16],
//     pub wszRemoteComputer: [u16; 17],
// }

// UNSUPPORTED Rust 3080:1: declaration Impl has no candidate rule
// impl Default for RAS_CONNECTION_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3085:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RAS_CONNECTION_1 {
//     pub hConnection: super::super::Foundation::HANDLE,
//     pub hInterface: super::super::Foundation::HANDLE,
//     pub PppInfo: PPP_INFO,
//     pub dwBytesXmited: u32,
//     pub dwBytesRcved: u32,
//     pub dwFramesXmited: u32,
//     pub dwFramesRcved: u32,
//     pub dwCrcErr: u32,
//     pub dwTimeoutErr: u32,
//     pub dwAlignmentErr: u32,
//     pub dwHardwareOverrunErr: u32,
//     pub dwFramingErr: u32,
//     pub dwBufferOverrunErr: u32,
//     pub dwCompressionRatioIn: u32,
//     pub dwCompressionRatioOut: u32,
// }

// UNSUPPORTED Rust 3104:1: declaration Impl has no candidate rule
// impl Default for RAS_CONNECTION_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3109:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RAS_CONNECTION_2 {
//     pub hConnection: super::super::Foundation::HANDLE,
//     pub wszUserName: [u16; 257],
//     pub dwInterfaceType: ROUTER_INTERFACE_TYPE,
//     pub guid: windows_sys::core::GUID,
//     pub PppInfo2: PPP_INFO_2,
// }

// UNSUPPORTED Rust 3118:1: declaration Impl has no candidate rule
// impl Default for RAS_CONNECTION_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3123:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RAS_CONNECTION_3 {
//     pub dwVersion: u32,
//     pub dwSize: u32,
//     pub hConnection: super::super::Foundation::HANDLE,
//     pub wszUserName: [u16; 257],
//     pub dwInterfaceType: ROUTER_INTERFACE_TYPE,
//     pub guid: windows_sys::core::GUID,
//     pub PppInfo3: PPP_INFO_3,
//     pub rasQuarState: RAS_QUARANTINE_STATE,
//     pub timer: super::super::Foundation::FILETIME,
// }

// UNSUPPORTED Rust 3136:1: declaration Impl has no candidate rule
// impl Default for RAS_CONNECTION_3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3141:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RAS_CONNECTION_4 {
//     pub dwConnectDuration: u32,
//     pub dwInterfaceType: ROUTER_INTERFACE_TYPE,
//     pub dwConnectionFlags: RAS_FLAGS,
//     pub wszInterfaceName: [u16; 257],
//     pub wszUserName: [u16; 257],
//     pub wszLogonDomain: [u16; 16],
//     pub wszRemoteComputer: [u16; 17],
//     pub guid: windows_sys::core::GUID,
//     pub rasQuarState: RAS_QUARANTINE_STATE,
//     pub probationTime: super::super::Foundation::FILETIME,
//     pub connectionStartTime: super::super::Foundation::FILETIME,
//     pub ullBytesXmited: u64,
//     pub ullBytesRcved: u64,
//     pub dwFramesXmited: u32,
//     pub dwFramesRcved: u32,
//     pub dwCrcErr: u32,
//     pub dwTimeoutErr: u32,
//     pub dwAlignmentErr: u32,
//     pub dwHardwareOverrunErr: u32,
//     pub dwFramingErr: u32,
//     pub dwBufferOverrunErr: u32,
//     pub dwCompressionRatioIn: u32,
//     pub dwCompressionRatioOut: u32,
//     pub dwNumSwitchOvers: u32,
//     pub wszRemoteEndpointAddress: [u16; 65],
//     pub wszLocalEndpointAddress: [u16; 65],
//     pub ProjectionInfo: PROJECTION_INFO2,
//     pub hConnection: super::super::Foundation::HANDLE,
//     pub hInterface: super::super::Foundation::HANDLE,
//     pub dwDeviceType: u32,
// }

// UNSUPPORTED Rust 3175:1: declaration Impl has no candidate rule
// impl Default for RAS_CONNECTION_4 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3180:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RAS_CONNECTION_EX {
//     pub Header: MPRAPI_OBJECT_HEADER,
//     pub dwConnectDuration: u32,
//     pub dwInterfaceType: ROUTER_INTERFACE_TYPE,
//     pub dwConnectionFlags: RAS_FLAGS,
//     pub wszInterfaceName: [u16; 257],
//     pub wszUserName: [u16; 257],
//     pub wszLogonDomain: [u16; 16],
//     pub wszRemoteComputer: [u16; 17],
//     pub guid: windows_sys::core::GUID,
//     pub rasQuarState: RAS_QUARANTINE_STATE,
//     pub probationTime: super::super::Foundation::FILETIME,
//     pub dwBytesXmited: u32,
//     pub dwBytesRcved: u32,
//     pub dwFramesXmited: u32,
//     pub dwFramesRcved: u32,
//     pub dwCrcErr: u32,
//     pub dwTimeoutErr: u32,
//     pub dwAlignmentErr: u32,
//     pub dwHardwareOverrunErr: u32,
//     pub dwFramingErr: u32,
//     pub dwBufferOverrunErr: u32,
//     pub dwCompressionRatioIn: u32,
//     pub dwCompressionRatioOut: u32,
//     pub dwNumSwitchOvers: u32,
//     pub wszRemoteEndpointAddress: [u16; 65],
//     pub wszLocalEndpointAddress: [u16; 65],
//     pub ProjectionInfo: PROJECTION_INFO,
//     pub hConnection: super::super::Foundation::HANDLE,
//     pub hInterface: super::super::Foundation::HANDLE,
// }

// UNSUPPORTED Rust 3213:1: declaration Impl has no candidate rule
// impl Default for RAS_CONNECTION_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `RAS_FLAGS` = UInt;
public const val `RAS_FLAGS_ARAP_CONNECTION`: `RAS_FLAGS` = 16u;
public const val `RAS_FLAGS_DORMANT`: `RAS_FLAGS` = 32u;
public const val `RAS_FLAGS_IKEV2_CONNECTION`: `RAS_FLAGS` = 16u;
public const val `RAS_FLAGS_MESSENGER_PRESENT`: `RAS_FLAGS` = 2u;
public const val `RAS_FLAGS_PPP_CONNECTION`: `RAS_FLAGS` = 1u;
public const val `RAS_FLAGS_QUARANTINE_PRESENT`: `RAS_FLAGS` = 8u;
public const val `RAS_FLAGS_RAS_CONNECTION`: UInt = 4u;
public typealias `RAS_HARDWARE_CONDITION` = Int;
public const val `RAS_HARDWARE_FAILURE`: `RAS_HARDWARE_CONDITION` = 1;
public const val `RAS_HARDWARE_OPERATIONAL`: `RAS_HARDWARE_CONDITION` = 0;
public const val `RAS_MaxAreaCode`: UInt = 10u;
public const val `RAS_MaxCallbackNumber`: UInt = 128u;
public const val `RAS_MaxDeviceName`: UInt = 128u;
public const val `RAS_MaxDeviceType`: UInt = 16u;
public const val `RAS_MaxDnsSuffix`: UInt = 256u;
public const val `RAS_MaxEntryName`: UInt = 256u;
public const val `RAS_MaxFacilities`: UInt = 200u;
public const val `RAS_MaxIDSize`: UInt = 256u;
public const val `RAS_MaxIpAddress`: UInt = 15u;
public const val `RAS_MaxIpxAddress`: UInt = 21u;
public const val `RAS_MaxPadType`: UInt = 32u;
public const val `RAS_MaxPhoneNumber`: UInt = 128u;
public const val `RAS_MaxReplyMessage`: UInt = 1024u;
public const val `RAS_MaxUserData`: UInt = 200u;
public const val `RAS_MaxX25Address`: UInt = 200u;
// UNSUPPORTED Rust 3244:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RAS_PORT_0 {
//     pub hPort: super::super::Foundation::HANDLE,
//     pub hConnection: super::super::Foundation::HANDLE,
//     pub dwPortCondition: RAS_PORT_CONDITION,
//     pub dwTotalNumberOfCalls: u32,
//     pub dwConnectDuration: u32,
//     pub wszPortName: [u16; 17],
//     pub wszMediaName: [u16; 17],
//     pub wszDeviceName: [u16; 129],
//     pub wszDeviceType: [u16; 17],
// }

// UNSUPPORTED Rust 3257:1: declaration Impl has no candidate rule
// impl Default for RAS_PORT_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3262:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RAS_PORT_1 {
//     pub hPort: super::super::Foundation::HANDLE,
//     pub hConnection: super::super::Foundation::HANDLE,
//     pub dwHardwareCondition: RAS_HARDWARE_CONDITION,
//     pub dwLineSpeed: u32,
//     pub dwBytesXmited: u32,
//     pub dwBytesRcved: u32,
//     pub dwFramesXmited: u32,
//     pub dwFramesRcved: u32,
//     pub dwCrcErr: u32,
//     pub dwTimeoutErr: u32,
//     pub dwAlignmentErr: u32,
//     pub dwHardwareOverrunErr: u32,
//     pub dwFramingErr: u32,
//     pub dwBufferOverrunErr: u32,
//     pub dwCompressionRatioIn: u32,
//     pub dwCompressionRatioOut: u32,
// }

// UNSUPPORTED Rust 3282:1: declaration Impl has no candidate rule
// impl Default for RAS_PORT_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3287:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RAS_PORT_2 {
//     pub hPort: super::super::Foundation::HANDLE,
//     pub hConnection: super::super::Foundation::HANDLE,
//     pub dwConn_State: u32,
//     pub wszPortName: [u16; 17],
//     pub wszMediaName: [u16; 17],
//     pub wszDeviceName: [u16; 129],
//     pub wszDeviceType: [u16; 17],
//     pub dwHardwareCondition: RAS_HARDWARE_CONDITION,
//     pub dwLineSpeed: u32,
//     pub dwCrcErr: u32,
//     pub dwSerialOverRunErrs: u32,
//     pub dwTimeoutErr: u32,
//     pub dwAlignmentErr: u32,
//     pub dwHardwareOverrunErr: u32,
//     pub dwFramingErr: u32,
//     pub dwBufferOverrunErr: u32,
//     pub dwCompressionRatioIn: u32,
//     pub dwCompressionRatioOut: u32,
//     pub dwTotalErrors: u32,
//     pub ullBytesXmited: u64,
//     pub ullBytesRcved: u64,
//     pub ullFramesXmited: u64,
//     pub ullFramesRcved: u64,
//     pub ullBytesTxUncompressed: u64,
//     pub ullBytesTxCompressed: u64,
//     pub ullBytesRcvUncompressed: u64,
//     pub ullBytesRcvCompressed: u64,
// }

// UNSUPPORTED Rust 3318:1: declaration Impl has no candidate rule
// impl Default for RAS_PORT_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `RAS_PORT_AUTHENTICATED`: `RAS_PORT_CONDITION` = 5;
public const val `RAS_PORT_AUTHENTICATING`: `RAS_PORT_CONDITION` = 4;
public const val `RAS_PORT_CALLING_BACK`: `RAS_PORT_CONDITION` = 2;
public typealias `RAS_PORT_CONDITION` = Int;
public const val `RAS_PORT_DISCONNECTED`: `RAS_PORT_CONDITION` = 1;
public const val `RAS_PORT_INITIALIZING`: `RAS_PORT_CONDITION` = 6;
public const val `RAS_PORT_LISTENING`: `RAS_PORT_CONDITION` = 3;
public const val `RAS_PORT_NON_OPERATIONAL`: `RAS_PORT_CONDITION` = 0;
// UNSUPPORTED Rust 3331:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct RAS_PROJECTION_INFO {
//     pub version: RASAPIVERSION,
//     pub r#type: RASPROJECTION_INFO_TYPE,
//     pub Anonymous: RAS_PROJECTION_INFO_0,
// }

// UNSUPPORTED Rust 3339:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for RAS_PROJECTION_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3345:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub union RAS_PROJECTION_INFO_0 {
//     pub ppp: RASPPP_PROJECTION_INFO,
//     pub ikev2: RASIKEV2_PROJECTION_INFO,
// }

// UNSUPPORTED Rust 3352:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for RAS_PROJECTION_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `RAS_QUARANTINE_STATE` = Int;
public const val `RAS_QUAR_STATE_NORMAL`: `RAS_QUARANTINE_STATE` = 0;
public const val `RAS_QUAR_STATE_NOT_CAPABLE`: `RAS_QUARANTINE_STATE` = 3;
public const val `RAS_QUAR_STATE_PROBATION`: `RAS_QUARANTINE_STATE` = 2;
public const val `RAS_QUAR_STATE_QUARANTINE`: `RAS_QUARANTINE_STATE` = 1;
// UNSUPPORTED Rust 3363:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RAS_SECURITY_INFO {
//     pub LastError: u32,
//     pub BytesReceived: u32,
//     pub DeviceName: [i8; 129],
// }

// UNSUPPORTED Rust 3370:1: declaration Impl has no candidate rule
// impl Default for RAS_SECURITY_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3375:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct RAS_STATS {
//     pub dwSize: u32,
//     pub dwBytesXmited: u32,
//     pub dwBytesRcved: u32,
//     pub dwFramesXmited: u32,
//     pub dwFramesRcved: u32,
//     pub dwCrcErr: u32,
//     pub dwTimeoutErr: u32,
//     pub dwAlignmentErr: u32,
//     pub dwHardwareOverrunErr: u32,
//     pub dwFramingErr: u32,
//     pub dwBufferOverrunErr: u32,
//     pub dwCompressionRatioIn: u32,
//     pub dwCompressionRatioOut: u32,
//     pub dwBps: u32,
//     pub dwConnectDuration: u32,
// }

// UNSUPPORTED Rust 3394:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RAS_UPDATE_CONNECTION {
//     pub Header: MPRAPI_OBJECT_HEADER,
//     pub dwIfIndex: u32,
//     pub wszLocalEndpointAddress: [u16; 65],
//     pub wszRemoteEndpointAddress: [u16; 65],
// }

// UNSUPPORTED Rust 3402:1: declaration Impl has no candidate rule
// impl Default for RAS_UPDATE_CONNECTION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3407:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RAS_USER_0 {
//     pub bfPrivilege: u8,
//     pub wszPhoneNumber: [u16; 129],
// }

// UNSUPPORTED Rust 3413:1: declaration Impl has no candidate rule
// impl Default for RAS_USER_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3418:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RAS_USER_1 {
//     pub bfPrivilege: u8,
//     pub wszPhoneNumber: [u16; 129],
//     pub bfPrivilege2: u8,
// }

// UNSUPPORTED Rust 3425:1: declaration Impl has no candidate rule
// impl Default for RAS_USER_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `RCD_AllUsers`: UInt = 1u;
public const val `RCD_Eap`: UInt = 2u;
public const val `RCD_Logon`: UInt = 4u;
public const val `RCD_SingleUser`: UInt = 0u;
public const val `RDEOPT_CustomDial`: UInt = 4096u;
public const val `RDEOPT_DisableConnectedUI`: UInt = 64u;
public const val `RDEOPT_DisableReconnect`: UInt = 256u;
public const val `RDEOPT_DisableReconnectUI`: UInt = 128u;
public const val `RDEOPT_EapInfoCryptInCapable`: UInt = 32768u;
public const val `RDEOPT_IgnoreModemSpeaker`: UInt = 4u;
public const val `RDEOPT_IgnoreSoftwareCompression`: UInt = 16u;
public const val `RDEOPT_InvokeAutoTriggerCredentialUI`: UInt = 16384u;
public const val `RDEOPT_NoUser`: UInt = 512u;
public const val `RDEOPT_PauseOnScript`: UInt = 1024u;
public const val `RDEOPT_PausedStates`: UInt = 2u;
public const val `RDEOPT_Router`: UInt = 2048u;
public const val `RDEOPT_SetModemSpeaker`: UInt = 8u;
public const val `RDEOPT_SetSoftwareCompression`: UInt = 32u;
public const val `RDEOPT_UseCustomScripting`: UInt = 8192u;
public const val `RDEOPT_UsePrefixSuffix`: UInt = 1u;
public const val `REN_AllUsers`: UInt = 1u;
public const val `REN_User`: UInt = 0u;
public typealias `ROUTER_CONNECTION_STATE` = Int;
// UNSUPPORTED Rust 3453:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ROUTER_CUSTOM_IKEv2_POLICY0 {
//     pub dwIntegrityMethod: u32,
//     pub dwEncryptionMethod: u32,
//     pub dwCipherTransformConstant: u32,
//     pub dwAuthTransformConstant: u32,
//     pub dwPfsGroup: u32,
//     pub dwDhGroup: u32,
// }

public const val `ROUTER_IF_STATE_CONNECTED`: `ROUTER_CONNECTION_STATE` = 3;
public const val `ROUTER_IF_STATE_CONNECTING`: `ROUTER_CONNECTION_STATE` = 2;
public const val `ROUTER_IF_STATE_DISCONNECTED`: `ROUTER_CONNECTION_STATE` = 1;
public const val `ROUTER_IF_STATE_UNREACHABLE`: `ROUTER_CONNECTION_STATE` = 0;
public const val `ROUTER_IF_TYPE_CLIENT`: `ROUTER_INTERFACE_TYPE` = 0;
public const val `ROUTER_IF_TYPE_DEDICATED`: `ROUTER_INTERFACE_TYPE` = 3;
public const val `ROUTER_IF_TYPE_DIALOUT`: `ROUTER_INTERFACE_TYPE` = 7;
public const val `ROUTER_IF_TYPE_FULL_ROUTER`: `ROUTER_INTERFACE_TYPE` = 2;
public const val `ROUTER_IF_TYPE_HOME_ROUTER`: `ROUTER_INTERFACE_TYPE` = 1;
public const val `ROUTER_IF_TYPE_INTERNAL`: `ROUTER_INTERFACE_TYPE` = 4;
public const val `ROUTER_IF_TYPE_LOOPBACK`: `ROUTER_INTERFACE_TYPE` = 5;
public const val `ROUTER_IF_TYPE_MAX`: `ROUTER_INTERFACE_TYPE` = 8;
public const val `ROUTER_IF_TYPE_TUNNEL1`: `ROUTER_INTERFACE_TYPE` = 6;
// UNSUPPORTED Rust 3476:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography")]
// #[derive(Clone, Copy)]
// pub struct ROUTER_IKEv2_IF_CUSTOM_CONFIG0 {
//     pub dwSaLifeTime: u32,
//     pub dwSaDataSize: u32,
//     pub certificateName: super::super::Security::Cryptography::CRYPT_INTEGER_BLOB,
//     pub customPolicy: *mut ROUTER_CUSTOM_IKEv2_POLICY0,
// }

// UNSUPPORTED Rust 3485:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for ROUTER_IKEv2_IF_CUSTOM_CONFIG0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3491:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography")]
// #[derive(Clone, Copy)]
// pub struct ROUTER_IKEv2_IF_CUSTOM_CONFIG1 {
//     pub dwSaLifeTime: u32,
//     pub dwSaDataSize: u32,
//     pub certificateName: super::super::Security::Cryptography::CRYPT_INTEGER_BLOB,
//     pub customPolicy: *mut ROUTER_CUSTOM_IKEv2_POLICY0,
//     pub certificateHash: super::super::Security::Cryptography::CRYPT_INTEGER_BLOB,
// }

// UNSUPPORTED Rust 3501:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// impl Default for ROUTER_IKEv2_IF_CUSTOM_CONFIG1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3507:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_Networking_WinSock", feature = "Win32_Security_Cryptography"))]
// #[derive(Clone, Copy)]
// pub struct ROUTER_IKEv2_IF_CUSTOM_CONFIG2 {
//     pub dwSaLifeTime: u32,
//     pub dwSaDataSize: u32,
//     pub certificateName: super::super::Security::Cryptography::CRYPT_INTEGER_BLOB,
//     pub customPolicy: *mut ROUTER_CUSTOM_IKEv2_POLICY0,
//     pub certificateHash: super::super::Security::Cryptography::CRYPT_INTEGER_BLOB,
//     pub dwMmSaLifeTime: u32,
//     pub vpnTrafficSelectors: MPR_VPN_TRAFFIC_SELECTORS,
// }

// UNSUPPORTED Rust 3519:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_Networking_WinSock", feature = "Win32_Security_Cryptography"))]
// impl Default for ROUTER_IKEv2_IF_CUSTOM_CONFIG2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `ROUTER_INTERFACE_TYPE` = Int;
// UNSUPPORTED Rust 3526:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ROUTING_PROTOCOL_CONFIG {
//     pub dwCallbackFlags: u32,
//     pub pfnRpfCallback: PMGM_RPF_CALLBACK,
//     pub pfnCreationAlertCallback: PMGM_CREATION_ALERT_CALLBACK,
//     pub pfnPruneAlertCallback: PMGM_PRUNE_ALERT_CALLBACK,
//     pub pfnJoinAlertCallback: PMGM_JOIN_ALERT_CALLBACK,
//     pub pfnWrongIfCallback: PMGM_WRONG_IF_CALLBACK,
//     pub pfnLocalJoinCallback: PMGM_LOCAL_JOIN_CALLBACK,
//     pub pfnLocalLeaveCallback: PMGM_LOCAL_LEAVE_CALLBACK,
//     pub pfnDisableIgmpCallback: PMGM_DISABLE_IGMP_CALLBACK,
//     pub pfnEnableIgmpCallback: PMGM_ENABLE_IGMP_CALLBACK,
// }

// UNSUPPORTED Rust 3540:1: non-scalar type Ptr unsupported
// pub const RRAS_SERVICE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("RemoteAccess");

public const val `RTM_BLOCK_METHODS`: UInt = 1u;
public const val `RTM_CHANGE_NOTIFICATION`: `RTM_EVENT_TYPE` = 3;
public const val `RTM_CHANGE_TYPE_ALL`: UInt = 1u;
public const val `RTM_CHANGE_TYPE_BEST`: UInt = 2u;
public const val `RTM_CHANGE_TYPE_FORWARDING`: UInt = 4u;
public const val `RTM_DEST_FLAG_DONT_FORWARD`: UInt = 4u;
public const val `RTM_DEST_FLAG_FWD_ENGIN_ADD`: UInt = 2u;
public const val `RTM_DEST_FLAG_NATURAL_NET`: UInt = 1u;
// UNSUPPORTED Rust 3549:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RTM_DEST_INFO {
//     pub DestHandle: isize,
//     pub DestAddress: RTM_NET_ADDRESS,
//     pub LastChanged: super::super::Foundation::FILETIME,
//     pub BelongsToViews: u32,
//     pub NumberOfViews: u32,
//     pub ViewInfo: [RTM_DEST_INFO_0; 1],
// }

// UNSUPPORTED Rust 3559:1: declaration Impl has no candidate rule
// impl Default for RTM_DEST_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3564:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct RTM_DEST_INFO_0 {
//     pub ViewId: i32,
//     pub NumRoutes: u32,
//     pub Route: isize,
//     pub Owner: isize,
//     pub DestFlags: u32,
//     pub HoldRoute: isize,
// }

public const val `RTM_ENTITY_DEREGISTERED`: `RTM_EVENT_TYPE` = 1;
// UNSUPPORTED Rust 3575:1: generic scalar type unsupported
// pub type RTM_ENTITY_EXPORT_METHOD = Option<unsafe extern "system" fn(callerhandle: isize, calleehandle: isize, input: *mut RTM_ENTITY_METHOD_INPUT, output: *mut RTM_ENTITY_METHOD_OUTPUT)>;

// UNSUPPORTED Rust 3576:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RTM_ENTITY_EXPORT_METHODS {
//     pub NumMethods: u32,
//     pub Methods: [RTM_ENTITY_EXPORT_METHOD; 1],
// }

// UNSUPPORTED Rust 3582:1: declaration Impl has no candidate rule
// impl Default for RTM_ENTITY_EXPORT_METHODS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3587:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RTM_ENTITY_ID {
//     pub Anonymous: RTM_ENTITY_ID_0,
// }

// UNSUPPORTED Rust 3592:1: declaration Impl has no candidate rule
// impl Default for RTM_ENTITY_ID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3597:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union RTM_ENTITY_ID_0 {
//     pub Anonymous: RTM_ENTITY_ID_0_0,
//     pub EntityId: u64,
// }

// UNSUPPORTED Rust 3603:1: declaration Impl has no candidate rule
// impl Default for RTM_ENTITY_ID_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3608:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct RTM_ENTITY_ID_0_0 {
//     pub EntityProtocolId: u32,
//     pub EntityInstanceId: u32,
// }

// UNSUPPORTED Rust 3614:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RTM_ENTITY_INFO {
//     pub RtmInstanceId: u16,
//     pub AddressFamily: u16,
//     pub EntityId: RTM_ENTITY_ID,
// }

// UNSUPPORTED Rust 3621:1: declaration Impl has no candidate rule
// impl Default for RTM_ENTITY_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3626:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RTM_ENTITY_METHOD_INPUT {
//     pub MethodType: u32,
//     pub InputSize: u32,
//     pub InputData: [u8; 1],
// }

// UNSUPPORTED Rust 3633:1: declaration Impl has no candidate rule
// impl Default for RTM_ENTITY_METHOD_INPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3638:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RTM_ENTITY_METHOD_OUTPUT {
//     pub MethodType: u32,
//     pub MethodStatus: u32,
//     pub OutputSize: u32,
//     pub OutputData: [u8; 1],
// }

// UNSUPPORTED Rust 3646:1: declaration Impl has no candidate rule
// impl Default for RTM_ENTITY_METHOD_OUTPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `RTM_ENTITY_REGISTERED`: `RTM_EVENT_TYPE` = 0;
public const val `RTM_ENUM_ALL_DESTS`: UInt = 0u;
public const val `RTM_ENUM_ALL_ROUTES`: UInt = 0u;
public const val `RTM_ENUM_NEXT`: UInt = 1u;
public const val `RTM_ENUM_OWN_DESTS`: UInt = 16777216u;
public const val `RTM_ENUM_OWN_ROUTES`: UInt = 65536u;
public const val `RTM_ENUM_RANGE`: UInt = 2u;
public const val `RTM_ENUM_START`: UInt = 0u;
// UNSUPPORTED Rust 3659:1: generic scalar type unsupported
// pub type RTM_EVENT_CALLBACK = Option<unsafe extern "system" fn(rtmreghandle: isize, eventtype: RTM_EVENT_TYPE, context1: *mut core::ffi::c_void, context2: *mut core::ffi::c_void) -> u32>;

public typealias `RTM_EVENT_TYPE` = Int;
public const val `RTM_MATCH_FULL`: UInt = 65535u;
public const val `RTM_MATCH_INTERFACE`: UInt = 16u;
public const val `RTM_MATCH_NEIGHBOUR`: UInt = 2u;
public const val `RTM_MATCH_NEXTHOP`: UInt = 8u;
public const val `RTM_MATCH_NONE`: UInt = 0u;
public const val `RTM_MATCH_OWNER`: UInt = 1u;
public const val `RTM_MATCH_PREF`: UInt = 4u;
public const val `RTM_MAX_ADDRESS_SIZE`: UInt = 16u;
public const val `RTM_MAX_VIEWS`: UInt = 32u;
// UNSUPPORTED Rust 3670:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RTM_NET_ADDRESS {
//     pub AddressFamily: u16,
//     pub NumBits: u16,
//     pub AddrBits: [u8; 16],
// }

// UNSUPPORTED Rust 3677:1: declaration Impl has no candidate rule
// impl Default for RTM_NET_ADDRESS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `RTM_NEXTHOP_CHANGE_NEW`: UInt = 1u;
public const val `RTM_NEXTHOP_FLAGS_DOWN`: UInt = 2u;
public const val `RTM_NEXTHOP_FLAGS_REMOTE`: UInt = 1u;
// UNSUPPORTED Rust 3685:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RTM_NEXTHOP_INFO {
//     pub NextHopAddress: RTM_NET_ADDRESS,
//     pub NextHopOwner: isize,
//     pub InterfaceIndex: u32,
//     pub State: u16,
//     pub Flags: u16,
//     pub EntitySpecificInfo: *mut core::ffi::c_void,
//     pub RemoteNextHop: isize,
// }

// UNSUPPORTED Rust 3696:1: declaration Impl has no candidate rule
// impl Default for RTM_NEXTHOP_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3701:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RTM_NEXTHOP_LIST {
//     pub NumNextHops: u16,
//     pub NextHops: [isize; 1],
// }

// UNSUPPORTED Rust 3707:1: declaration Impl has no candidate rule
// impl Default for RTM_NEXTHOP_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `RTM_NEXTHOP_STATE_CREATED`: UInt = 0u;
public const val `RTM_NEXTHOP_STATE_DELETED`: UInt = 1u;
public const val `RTM_NOTIFY_ONLY_MARKED_DESTS`: UInt = 65536u;
public const val `RTM_NUM_CHANGE_TYPES`: UInt = 3u;
// UNSUPPORTED Rust 3716:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct RTM_PREF_INFO {
//     pub Metric: u32,
//     pub Preference: u32,
// }

// UNSUPPORTED Rust 3722:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct RTM_REGN_PROFILE {
//     pub MaxNextHopsInRoute: u32,
//     pub MaxHandlesInEnum: u32,
//     pub ViewsSupported: u32,
//     pub NumberOfViews: u32,
// }

public const val `RTM_RESUME_METHODS`: UInt = 0u;
public const val `RTM_ROUTE_CHANGE_BEST`: UInt = 65536u;
public const val `RTM_ROUTE_CHANGE_FIRST`: UInt = 1u;
public const val `RTM_ROUTE_CHANGE_NEW`: UInt = 2u;
public const val `RTM_ROUTE_EXPIRED`: `RTM_EVENT_TYPE` = 2;
public const val `RTM_ROUTE_FLAGS_BLACKHOLE`: UInt = 2u;
public const val `RTM_ROUTE_FLAGS_DISCARD`: UInt = 4u;
public const val `RTM_ROUTE_FLAGS_INACTIVE`: UInt = 8u;
public const val `RTM_ROUTE_FLAGS_LIMITED_BC`: UInt = 1024u;
public const val `RTM_ROUTE_FLAGS_LOCAL`: UInt = 16u;
public const val `RTM_ROUTE_FLAGS_LOCAL_MCAST`: UInt = 512u;
public const val `RTM_ROUTE_FLAGS_LOOPBACK`: UInt = 128u;
public const val `RTM_ROUTE_FLAGS_MARTIAN`: UInt = 1u;
public const val `RTM_ROUTE_FLAGS_MCAST`: UInt = 256u;
public const val `RTM_ROUTE_FLAGS_MYSELF`: UInt = 64u;
public const val `RTM_ROUTE_FLAGS_ONES_NETBC`: UInt = 16384u;
public const val `RTM_ROUTE_FLAGS_ONES_SUBNETBC`: UInt = 32768u;
public const val `RTM_ROUTE_FLAGS_REMOTE`: UInt = 32u;
public const val `RTM_ROUTE_FLAGS_ZEROS_NETBC`: UInt = 4096u;
public const val `RTM_ROUTE_FLAGS_ZEROS_SUBNETBC`: UInt = 8192u;
// UNSUPPORTED Rust 3750:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RTM_ROUTE_INFO {
//     pub DestHandle: isize,
//     pub RouteOwner: isize,
//     pub Neighbour: isize,
//     pub State: u8,
//     pub Flags1: u8,
//     pub Flags: u16,
//     pub PrefInfo: RTM_PREF_INFO,
//     pub BelongsToViews: u32,
//     pub EntitySpecificInfo: *mut core::ffi::c_void,
//     pub NextHopsList: RTM_NEXTHOP_LIST,
// }

// UNSUPPORTED Rust 3764:1: declaration Impl has no candidate rule
// impl Default for RTM_ROUTE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `RTM_ROUTE_STATE_CREATED`: UInt = 0u;
public const val `RTM_ROUTE_STATE_DELETED`: UInt = 2u;
public const val `RTM_ROUTE_STATE_DELETING`: UInt = 1u;
public const val `RTM_VIEW_ID_MCAST`: UInt = 1u;
public const val `RTM_VIEW_ID_UCAST`: UInt = 0u;
public const val `RTM_VIEW_MASK_ALL`: UInt = 4294967295u;
public const val `RTM_VIEW_MASK_ANY`: UInt = 0u;
public const val `RTM_VIEW_MASK_MCAST`: UInt = 2u;
public const val `RTM_VIEW_MASK_NONE`: UInt = 0u;
public const val `RTM_VIEW_MASK_SIZE`: UInt = 32u;
public const val `RTM_VIEW_MASK_UCAST`: UInt = 1u;
// UNSUPPORTED Rust 3780:1: generic scalar type unsupported
// pub type RasCustomDeleteEntryNotifyFn = Option<unsafe extern "system" fn(lpszphonebook: windows_sys::core::PCWSTR, lpszentry: windows_sys::core::PCWSTR, dwflags: u32) -> u32>;

// UNSUPPORTED Rust 3781:1: generic scalar type unsupported
// pub type RasCustomDialDlgFn = Option<unsafe extern "system" fn(hinstdll: super::super::Foundation::HINSTANCE, dwflags: u32, lpszphonebook: windows_sys::core::PCWSTR, lpszentry: windows_sys::core::PCWSTR, lpszphonenumber: windows_sys::core::PCWSTR, lpinfo: *mut RASDIALDLG, pvinfo: *mut core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 3782:1: generic scalar type unsupported
// pub type RasCustomDialFn = Option<unsafe extern "system" fn(hinstdll: super::super::Foundation::HINSTANCE, lprasdialextensions: *mut RASDIALEXTENSIONS, lpszphonebook: windows_sys::core::PCWSTR, lprasdialparams: *mut RASDIALPARAMSA, dwnotifiertype: u32, lpvnotifier: *mut core::ffi::c_void, lphrasconn: *mut HRASCONN, dwflags: u32) -> u32>;

// UNSUPPORTED Rust 3783:1: generic scalar type unsupported
// pub type RasCustomEntryDlgFn = Option<unsafe extern "system" fn(hinstdll: super::super::Foundation::HINSTANCE, lpszphonebook: windows_sys::core::PCWSTR, lpszentry: windows_sys::core::PCWSTR, lpinfo: *mut RASENTRYDLGA, dwflags: u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 3784:1: generic scalar type unsupported
// pub type RasCustomHangUpFn = Option<unsafe extern "system" fn(hrasconn: HRASCONN) -> u32>;

// UNSUPPORTED Rust 3785:1: generic scalar type unsupported
// pub type RasCustomScriptExecuteFn = Option<unsafe extern "system" fn(hport: super::super::Foundation::HANDLE, lpszphonebook: windows_sys::core::PCWSTR, lpszentryname: windows_sys::core::PCWSTR, pfnrasgetbuffer: PFNRASGETBUFFER, pfnrasfreebuffer: PFNRASFREEBUFFER, pfnrassendbuffer: PFNRASSENDBUFFER, pfnrasreceivebuffer: PFNRASRECEIVEBUFFER, pfnrasretrievebuffer: PFNRASRETRIEVEBUFFER, hwnd: super::super::Foundation::HWND, prasdialparams: *mut RASDIALPARAMSA, pvreserved: *mut core::ffi::c_void) -> u32>;

public const val `SECURITYMSG_ERROR`: `SECURITY_MESSAGE_MSG_ID` = 3u;
public const val `SECURITYMSG_FAILURE`: `SECURITY_MESSAGE_MSG_ID` = 2u;
public const val `SECURITYMSG_SUCCESS`: `SECURITY_MESSAGE_MSG_ID` = 1u;
// UNSUPPORTED Rust 3789:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SECURITY_MESSAGE {
//     pub dwMsgId: SECURITY_MESSAGE_MSG_ID,
//     pub hPort: isize,
//     pub dwError: u32,
//     pub UserName: [i8; 257],
//     pub Domain: [i8; 16],
// }

// UNSUPPORTED Rust 3798:1: declaration Impl has no candidate rule
// impl Default for SECURITY_MESSAGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `SECURITY_MESSAGE_MSG_ID` = UInt;
// UNSUPPORTED Rust 3804:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SOURCE_GROUP_ENTRY {
//     pub dwSourceAddr: u32,
//     pub dwSourceMask: u32,
//     pub dwGroupAddr: u32,
//     pub dwGroupMask: u32,
// }

// UNSUPPORTED Rust 3812:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography")]
// #[derive(Clone, Copy, Default)]
// pub struct SSTP_CERT_INFO {
//     pub isDefault: windows_sys::core::BOOL,
//     pub certBlob: super::super::Security::Cryptography::CRYPT_INTEGER_BLOB,
// }

// UNSUPPORTED Rust 3819:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography")]
// #[derive(Clone, Copy, Default)]
// pub struct SSTP_CONFIG_PARAMS {
//     pub dwNumPorts: u32,
//     pub dwPortFlags: u32,
//     pub isUseHttps: windows_sys::core::BOOL,
//     pub certAlgorithm: u32,
//     pub sstpCertDetails: SSTP_CERT_INFO,
// }

// UNSUPPORTED Rust 3829:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct VPN_TS_IP_ADDRESS {
//     pub Type: u16,
//     pub Anonymous: VPN_TS_IP_ADDRESS_0,
// }

// UNSUPPORTED Rust 3836:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for VPN_TS_IP_ADDRESS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3842:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub union VPN_TS_IP_ADDRESS_0 {
//     pub v4: super::super::Networking::WinSock::IN_ADDR,
//     pub v6: super::super::Networking::WinSock::IN6_ADDR,
// }

// UNSUPPORTED Rust 3849:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for VPN_TS_IP_ADDRESS_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `VS_Default`: UInt = 0u;
public const val `VS_GREOnly`: UInt = 9u;
public const val `VS_Ikev2First`: UInt = 8u;
public const val `VS_Ikev2Only`: UInt = 7u;
public const val `VS_Ikev2Sstp`: UInt = 14u;
public const val `VS_L2tpFirst`: UInt = 4u;
public const val `VS_L2tpOnly`: UInt = 3u;
public const val `VS_L2tpSstp`: UInt = 13u;
public const val `VS_PptpFirst`: UInt = 2u;
public const val `VS_PptpOnly`: UInt = 1u;
public const val `VS_PptpSstp`: UInt = 12u;
public const val `VS_ProtocolList`: UInt = 15u;
public const val `VS_SstpFirst`: UInt = 6u;
public const val `VS_SstpOnly`: UInt = 5u;
public const val `WARNING_MSG_ALIAS_NOT_ADDED`: UInt = 644u;
public const val `WM_RASDIALEVENT`: UInt = 52429u;
