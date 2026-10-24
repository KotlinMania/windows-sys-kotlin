// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("wlanapi.dll" "system" fn WFDCancelOpenSession(hsessionhandle : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("wlanapi.dll" "system" fn WFDCloseHandle(hclienthandle : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("wlanapi.dll" "system" fn WFDCloseSession(hsessionhandle : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("wlanapi.dll" "system" fn WFDOpenHandle(dwclientversion : u32, pdwnegotiatedversion : *mut u32, phclienthandle : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("wlanapi.dll" "system" fn WFDOpenLegacySession(hclienthandle : super::super::Foundation:: HANDLE, plegacymacaddress : *const *const u8, phsessionhandle : *mut super::super::Foundation:: HANDLE, pguidsessioninterface : *mut windows_sys::core::GUID) -> u32);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("wlanapi.dll" "system" fn WFDStartOpenSession(hclienthandle : super::super::Foundation:: HANDLE, pdeviceaddress : *const *const u8, pvcontext : *const core::ffi::c_void, pfncallback : WFD_OPEN_SESSION_COMPLETE_CALLBACK, phsessionhandle : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("wlanapi.dll" "system" fn WFDUpdateDeviceVisibility(pdeviceaddress : *const *const u8) -> u32);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("wlanapi.dll" "system" fn WlanAllocateMemory(dwmemorysize : u32) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("wlanapi.dll" "system" fn WlanCloseHandle(hclienthandle : super::super::Foundation:: HANDLE, preserved : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// windows_link::link!("wlanapi.dll" "system" fn WlanConnect(hclienthandle : super::super::Foundation:: HANDLE, pinterfaceguid : *const windows_sys::core::GUID, pconnectionparameters : *const WLAN_CONNECTION_PARAMETERS, preserved : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// windows_link::link!("wlanapi.dll" "system" fn WlanConnect2(hclienthandle : super::super::Foundation:: HANDLE, pinterfaceguid : *const windows_sys::core::GUID, pconnectionparameters : *const WLAN_CONNECTION_PARAMETERS_V2, preserved : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// windows_link::link!("wlanapi.dll" "system" fn WlanDeleteProfile(hclienthandle : super::super::Foundation:: HANDLE, pinterfaceguid : *const windows_sys::core::GUID, strprofilename : windows_sys::core::PCWSTR, preserved : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// windows_link::link!("wlanapi.dll" "system" fn WlanDeviceServiceCommand(hclienthandle : super::super::Foundation:: HANDLE, pinterfaceguid : *const windows_sys::core::GUID, pdeviceserviceguid : *const windows_sys::core::GUID, dwopcode : u32, dwinbuffersize : u32, pinbuffer : *const core::ffi::c_void, dwoutbuffersize : u32, poutbuffer : *mut core::ffi::c_void, pdwbytesreturned : *mut u32) -> u32);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// windows_link::link!("wlanapi.dll" "system" fn WlanDisconnect(hclienthandle : super::super::Foundation:: HANDLE, pinterfaceguid : *const windows_sys::core::GUID, preserved : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// windows_link::link!("wlanapi.dll" "system" fn WlanEnumInterfaces(hclienthandle : super::super::Foundation:: HANDLE, preserved : *const core::ffi::c_void, ppinterfacelist : *mut *mut WLAN_INTERFACE_INFO_LIST) -> u32);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// windows_link::link!("wlanapi.dll" "system" fn WlanExtractPsdIEDataList(hclienthandle : super::super::Foundation:: HANDLE, dwiedatasize : u32, prawiedata : *const u8, strformat : windows_sys::core::PCWSTR, preserved : *const core::ffi::c_void, pppsdiedatalist : *mut *mut WLAN_RAW_DATA_LIST) -> u32);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// windows_link::link!("wlanapi.dll" "system" fn WlanFreeMemory(pmemory : *const core::ffi::c_void));

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// windows_link::link!("wlanapi.dll" "system" fn WlanGetAvailableNetworkList(hclienthandle : super::super::Foundation:: HANDLE, pinterfaceguid : *const windows_sys::core::GUID, dwflags : u32, preserved : *const core::ffi::c_void, ppavailablenetworklist : *mut *mut WLAN_AVAILABLE_NETWORK_LIST) -> u32);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// windows_link::link!("wlanapi.dll" "system" fn WlanGetAvailableNetworkList2(hclienthandle : super::super::Foundation:: HANDLE, pinterfaceguid : *const windows_sys::core::GUID, dwflags : u32, preserved : *const core::ffi::c_void, ppavailablenetworklist : *mut *mut WLAN_AVAILABLE_NETWORK_LIST_V2) -> u32);

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// windows_link::link!("wlanapi.dll" "system" fn WlanGetFilterList(hclienthandle : super::super::Foundation:: HANDLE, wlanfilterlisttype : WLAN_FILTER_LIST_TYPE, preserved : *const core::ffi::c_void, ppnetworklist : *mut *mut DOT11_NETWORK_LIST) -> u32);

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// windows_link::link!("wlanapi.dll" "system" fn WlanGetInterfaceCapability(hclienthandle : super::super::Foundation:: HANDLE, pinterfaceguid : *const windows_sys::core::GUID, preserved : *const core::ffi::c_void, ppcapability : *mut *mut WLAN_INTERFACE_CAPABILITY) -> u32);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// windows_link::link!("wlanapi.dll" "system" fn WlanGetNetworkBssList(hclienthandle : super::super::Foundation:: HANDLE, pinterfaceguid : *const windows_sys::core::GUID, pdot11ssid : *const DOT11_SSID, dot11bsstype : DOT11_BSS_TYPE, bsecurityenabled : windows_sys::core::BOOL, preserved : *const core::ffi::c_void, ppwlanbsslist : *mut *mut WLAN_BSS_LIST) -> u32);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// windows_link::link!("wlanapi.dll" "system" fn WlanGetProfile(hclienthandle : super::super::Foundation:: HANDLE, pinterfaceguid : *const windows_sys::core::GUID, strprofilename : windows_sys::core::PCWSTR, preserved : *const core::ffi::c_void, pstrprofilexml : *mut windows_sys::core::PWSTR, pdwflags : *mut u32, pdwgrantedaccess : *mut u32) -> u32);

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// windows_link::link!("wlanapi.dll" "system" fn WlanGetProfileCustomUserData(hclienthandle : super::super::Foundation:: HANDLE, pinterfaceguid : *const windows_sys::core::GUID, strprofilename : windows_sys::core::PCWSTR, preserved : *const core::ffi::c_void, pdwdatasize : *mut u32, ppdata : *mut *mut u8) -> u32);

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// windows_link::link!("wlanapi.dll" "system" fn WlanGetProfileList(hclienthandle : super::super::Foundation:: HANDLE, pinterfaceguid : *const windows_sys::core::GUID, preserved : *const core::ffi::c_void, ppprofilelist : *mut *mut WLAN_PROFILE_INFO_LIST) -> u32);

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// windows_link::link!("wlanapi.dll" "system" fn WlanGetSecuritySettings(hclienthandle : super::super::Foundation:: HANDLE, securableobject : WLAN_SECURABLE_OBJECT, pvaluetype : *mut WLAN_OPCODE_VALUE_TYPE, pstrcurrentsddl : *mut windows_sys::core::PWSTR, pdwgrantedaccess : *mut u32) -> u32);

// UNSUPPORTED Rust 29:1: declaration Macro has no candidate rule
// windows_link::link!("wlanapi.dll" "system" fn WlanGetSupportedDeviceServices(hclienthandle : super::super::Foundation:: HANDLE, pinterfaceguid : *const windows_sys::core::GUID, ppdevsvcguidlist : *mut *mut WLAN_DEVICE_SERVICE_GUID_LIST) -> u32);

// UNSUPPORTED Rust 30:1: declaration Macro has no candidate rule
// windows_link::link!("wlanapi.dll" "system" fn WlanHostedNetworkForceStart(hclienthandle : super::super::Foundation:: HANDLE, pfailreason : *mut WLAN_HOSTED_NETWORK_REASON, pvreserved : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 31:1: declaration Macro has no candidate rule
// windows_link::link!("wlanapi.dll" "system" fn WlanHostedNetworkForceStop(hclienthandle : super::super::Foundation:: HANDLE, pfailreason : *mut WLAN_HOSTED_NETWORK_REASON, pvreserved : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 32:1: declaration Macro has no candidate rule
// windows_link::link!("wlanapi.dll" "system" fn WlanHostedNetworkInitSettings(hclienthandle : super::super::Foundation:: HANDLE, pfailreason : *mut WLAN_HOSTED_NETWORK_REASON, pvreserved : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 33:1: declaration Macro has no candidate rule
// windows_link::link!("wlanapi.dll" "system" fn WlanHostedNetworkQueryProperty(hclienthandle : super::super::Foundation:: HANDLE, opcode : WLAN_HOSTED_NETWORK_OPCODE, pdwdatasize : *mut u32, ppvdata : *mut *mut core::ffi::c_void, pwlanopcodevaluetype : *mut WLAN_OPCODE_VALUE_TYPE, pvreserved : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 34:1: declaration Macro has no candidate rule
// windows_link::link!("wlanapi.dll" "system" fn WlanHostedNetworkQuerySecondaryKey(hclienthandle : super::super::Foundation:: HANDLE, pdwkeylength : *mut u32, ppuckeydata : *mut *mut u8, pbispassphrase : *mut windows_sys::core::BOOL, pbpersistent : *mut windows_sys::core::BOOL, pfailreason : *mut WLAN_HOSTED_NETWORK_REASON, pvreserved : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 35:1: declaration Macro has no candidate rule
// windows_link::link!("wlanapi.dll" "system" fn WlanHostedNetworkQueryStatus(hclienthandle : super::super::Foundation:: HANDLE, ppwlanhostednetworkstatus : *mut *mut WLAN_HOSTED_NETWORK_STATUS, pvreserved : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 36:1: declaration Macro has no candidate rule
// windows_link::link!("wlanapi.dll" "system" fn WlanHostedNetworkRefreshSecuritySettings(hclienthandle : super::super::Foundation:: HANDLE, pfailreason : *mut WLAN_HOSTED_NETWORK_REASON, pvreserved : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 37:1: declaration Macro has no candidate rule
// windows_link::link!("wlanapi.dll" "system" fn WlanHostedNetworkSetProperty(hclienthandle : super::super::Foundation:: HANDLE, opcode : WLAN_HOSTED_NETWORK_OPCODE, dwdatasize : u32, pvdata : *const core::ffi::c_void, pfailreason : *mut WLAN_HOSTED_NETWORK_REASON, pvreserved : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 38:1: declaration Macro has no candidate rule
// windows_link::link!("wlanapi.dll" "system" fn WlanHostedNetworkSetSecondaryKey(hclienthandle : super::super::Foundation:: HANDLE, dwkeylength : u32, puckeydata : *const u8, bispassphrase : windows_sys::core::BOOL, bpersistent : windows_sys::core::BOOL, pfailreason : *mut WLAN_HOSTED_NETWORK_REASON, pvreserved : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 39:1: declaration Macro has no candidate rule
// windows_link::link!("wlanapi.dll" "system" fn WlanHostedNetworkStartUsing(hclienthandle : super::super::Foundation:: HANDLE, pfailreason : *mut WLAN_HOSTED_NETWORK_REASON, pvreserved : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 40:1: declaration Macro has no candidate rule
// windows_link::link!("wlanapi.dll" "system" fn WlanHostedNetworkStopUsing(hclienthandle : super::super::Foundation:: HANDLE, pfailreason : *mut WLAN_HOSTED_NETWORK_REASON, pvreserved : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 41:1: declaration Macro has no candidate rule
// windows_link::link!("wlanapi.dll" "system" fn WlanIhvControl(hclienthandle : super::super::Foundation:: HANDLE, pinterfaceguid : *const windows_sys::core::GUID, r#type : WLAN_IHV_CONTROL_TYPE, dwinbuffersize : u32, pinbuffer : *const core::ffi::c_void, dwoutbuffersize : u32, poutbuffer : *mut core::ffi::c_void, pdwbytesreturned : *mut u32) -> u32);

// UNSUPPORTED Rust 42:1: declaration Macro has no candidate rule
// windows_link::link!("wlanapi.dll" "system" fn WlanOpenHandle(dwclientversion : u32, preserved : *const core::ffi::c_void, pdwnegotiatedversion : *mut u32, phclienthandle : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 43:1: declaration Macro has no candidate rule
// windows_link::link!("wlanapi.dll" "system" fn WlanQueryAutoConfigParameter(hclienthandle : super::super::Foundation:: HANDLE, opcode : WLAN_AUTOCONF_OPCODE, preserved : *const core::ffi::c_void, pdwdatasize : *mut u32, ppdata : *mut *mut core::ffi::c_void, pwlanopcodevaluetype : *mut WLAN_OPCODE_VALUE_TYPE) -> u32);

// UNSUPPORTED Rust 44:1: declaration Macro has no candidate rule
// windows_link::link!("wlanapi.dll" "system" fn WlanQueryInterface(hclienthandle : super::super::Foundation:: HANDLE, pinterfaceguid : *const windows_sys::core::GUID, opcode : WLAN_INTF_OPCODE, preserved : *const core::ffi::c_void, pdwdatasize : *mut u32, ppdata : *mut *mut core::ffi::c_void, pwlanopcodevaluetype : *mut WLAN_OPCODE_VALUE_TYPE) -> u32);

// UNSUPPORTED Rust 45:1: declaration Macro has no candidate rule
// windows_link::link!("wlanapi.dll" "system" fn WlanReasonCodeToString(dwreasoncode : u32, dwbuffersize : u32, pstringbuffer : windows_sys::core::PCWSTR, preserved : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 46:1: declaration Macro has no candidate rule
// windows_link::link!("wlanapi.dll" "system" fn WlanRegisterDeviceServiceNotification(hclienthandle : super::super::Foundation:: HANDLE, pdevsvcguidlist : *const WLAN_DEVICE_SERVICE_GUID_LIST) -> u32);

// UNSUPPORTED Rust 47:1: declaration Macro has no candidate rule
// windows_link::link!("wlanapi.dll" "system" fn WlanRegisterNotification(hclienthandle : super::super::Foundation:: HANDLE, dwnotifsource : WLAN_NOTIFICATION_SOURCES, bignoreduplicate : windows_sys::core::BOOL, funccallback : WLAN_NOTIFICATION_CALLBACK, pcallbackcontext : *const core::ffi::c_void, preserved : *const core::ffi::c_void, pdwprevnotifsource : *mut u32) -> u32);

// UNSUPPORTED Rust 48:1: declaration Macro has no candidate rule
// windows_link::link!("wlanapi.dll" "system" fn WlanRegisterVirtualStationNotification(hclienthandle : super::super::Foundation:: HANDLE, bregister : windows_sys::core::BOOL, preserved : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 49:1: declaration Macro has no candidate rule
// windows_link::link!("wlanapi.dll" "system" fn WlanRenameProfile(hclienthandle : super::super::Foundation:: HANDLE, pinterfaceguid : *const windows_sys::core::GUID, stroldprofilename : windows_sys::core::PCWSTR, strnewprofilename : windows_sys::core::PCWSTR, preserved : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 50:1: declaration Macro has no candidate rule
// windows_link::link!("wlanapi.dll" "system" fn WlanSaveTemporaryProfile(hclienthandle : super::super::Foundation:: HANDLE, pinterfaceguid : *const windows_sys::core::GUID, strprofilename : windows_sys::core::PCWSTR, stralluserprofilesecurity : windows_sys::core::PCWSTR, dwflags : u32, boverwrite : windows_sys::core::BOOL, preserved : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 51:1: declaration Macro has no candidate rule
// windows_link::link!("wlanapi.dll" "system" fn WlanScan(hclienthandle : super::super::Foundation:: HANDLE, pinterfaceguid : *const windows_sys::core::GUID, pdot11ssid : *const DOT11_SSID, piedata : *const WLAN_RAW_DATA, preserved : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 52:1: declaration Macro has no candidate rule
// windows_link::link!("wlanapi.dll" "system" fn WlanSetAutoConfigParameter(hclienthandle : super::super::Foundation:: HANDLE, opcode : WLAN_AUTOCONF_OPCODE, dwdatasize : u32, pdata : *const core::ffi::c_void, preserved : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 53:1: declaration Macro has no candidate rule
// windows_link::link!("wlanapi.dll" "system" fn WlanSetFilterList(hclienthandle : super::super::Foundation:: HANDLE, wlanfilterlisttype : WLAN_FILTER_LIST_TYPE, pnetworklist : *const DOT11_NETWORK_LIST, preserved : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 54:1: declaration Macro has no candidate rule
// windows_link::link!("wlanapi.dll" "system" fn WlanSetInterface(hclienthandle : super::super::Foundation:: HANDLE, pinterfaceguid : *const windows_sys::core::GUID, opcode : WLAN_INTF_OPCODE, dwdatasize : u32, pdata : *const core::ffi::c_void, preserved : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 55:1: declaration Macro has no candidate rule
// windows_link::link!("wlanapi.dll" "system" fn WlanSetProfile(hclienthandle : super::super::Foundation:: HANDLE, pinterfaceguid : *const windows_sys::core::GUID, dwflags : u32, strprofilexml : windows_sys::core::PCWSTR, stralluserprofilesecurity : windows_sys::core::PCWSTR, boverwrite : windows_sys::core::BOOL, preserved : *const core::ffi::c_void, pdwreasoncode : *mut u32) -> u32);

// UNSUPPORTED Rust 56:1: declaration Macro has no candidate rule
// windows_link::link!("wlanapi.dll" "system" fn WlanSetProfileCustomUserData(hclienthandle : super::super::Foundation:: HANDLE, pinterfaceguid : *const windows_sys::core::GUID, strprofilename : windows_sys::core::PCWSTR, dwdatasize : u32, pdata : *const u8, preserved : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 57:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_ExtensibleAuthenticationProtocol")]
// windows_link::link!("wlanapi.dll" "system" fn WlanSetProfileEapUserData(hclienthandle : super::super::Foundation:: HANDLE, pinterfaceguid : *const windows_sys::core::GUID, strprofilename : windows_sys::core::PCWSTR, eaptype : super::super::Security::ExtensibleAuthenticationProtocol:: EAP_METHOD_TYPE, dwflags : WLAN_SET_EAPHOST_FLAGS, dweapuserdatasize : u32, pbeapuserdata : *const u8, preserved : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 59:1: declaration Macro has no candidate rule
// windows_link::link!("wlanapi.dll" "system" fn WlanSetProfileEapXmlUserData(hclienthandle : super::super::Foundation:: HANDLE, pinterfaceguid : *const windows_sys::core::GUID, strprofilename : windows_sys::core::PCWSTR, dwflags : WLAN_SET_EAPHOST_FLAGS, streapxmluserdata : windows_sys::core::PCWSTR, preserved : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 60:1: declaration Macro has no candidate rule
// windows_link::link!("wlanapi.dll" "system" fn WlanSetProfileList(hclienthandle : super::super::Foundation:: HANDLE, pinterfaceguid : *const windows_sys::core::GUID, dwitems : u32, strprofilenames : *const windows_sys::core::PCWSTR, preserved : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 61:1: declaration Macro has no candidate rule
// windows_link::link!("wlanapi.dll" "system" fn WlanSetProfilePosition(hclienthandle : super::super::Foundation:: HANDLE, pinterfaceguid : *const windows_sys::core::GUID, strprofilename : windows_sys::core::PCWSTR, dwposition : u32, preserved : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 62:1: declaration Macro has no candidate rule
// windows_link::link!("wlanapi.dll" "system" fn WlanSetPsdIEDataList(hclienthandle : super::super::Foundation:: HANDLE, strformat : windows_sys::core::PCWSTR, ppsdiedatalist : *const WLAN_RAW_DATA_LIST, preserved : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 63:1: declaration Macro has no candidate rule
// windows_link::link!("wlanapi.dll" "system" fn WlanSetSecuritySettings(hclienthandle : super::super::Foundation:: HANDLE, securableobject : WLAN_SECURABLE_OBJECT, strmodifiedsddl : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 64:1: declaration Macro has no candidate rule
// windows_link::link!("wlanui.dll" "system" fn WlanUIEditProfile(dwclientversion : u32, wstrprofilename : windows_sys::core::PCWSTR, pinterfaceguid : *const windows_sys::core::GUID, hwnd : super::super::Foundation:: HWND, wlstartpage : WL_DISPLAY_PAGES, preserved : *const core::ffi::c_void, pwlanreasoncode : *mut u32) -> u32);

public typealias `CH_DESCRIPTION_TYPE` = Int;
// UNSUPPORTED Rust 66:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_InfraCast_AccessPointBssid: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x1506935d_e3e7_450f_8637_82233ebe5f6e), pid: 19 };

// UNSUPPORTED Rust 67:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_InfraCast_ChallengeAep: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x1506935d_e3e7_450f_8637_82233ebe5f6e), pid: 21 };

// UNSUPPORTED Rust 68:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_InfraCast_DevnodeAep: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x1506935d_e3e7_450f_8637_82233ebe5f6e), pid: 23 };

// UNSUPPORTED Rust 69:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_InfraCast_HostName_ResolutionMode: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x1506935d_e3e7_450f_8637_82233ebe5f6e), pid: 25 };

// UNSUPPORTED Rust 70:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_InfraCast_PinSupported: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x1506935d_e3e7_450f_8637_82233ebe5f6e), pid: 29 };

// UNSUPPORTED Rust 71:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_InfraCast_RtspTcpConnectionParametersSupported: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x1506935d_e3e7_450f_8637_82233ebe5f6e), pid: 30 };

// UNSUPPORTED Rust 72:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_InfraCast_SinkHostName: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x1506935d_e3e7_450f_8637_82233ebe5f6e), pid: 20 };

// UNSUPPORTED Rust 73:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_InfraCast_SinkIpAddress: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x1506935d_e3e7_450f_8637_82233ebe5f6e), pid: 26 };

// UNSUPPORTED Rust 74:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_InfraCast_StreamSecuritySupported: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x1506935d_e3e7_450f_8637_82233ebe5f6e), pid: 18 };

// UNSUPPORTED Rust 75:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_InfraCast_Supported: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x1506935d_e3e7_450f_8637_82233ebe5f6e), pid: 17 };

// UNSUPPORTED Rust 76:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_PciDevice_AERCapabilityPresent: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 17 };

// UNSUPPORTED Rust 77:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_PciDevice_AcsCapabilityRegister: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 32 };

// UNSUPPORTED Rust 78:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_PciDevice_AcsCompatibleUpHierarchy: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 31 };

// UNSUPPORTED Rust 79:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_PciDevice_AcsSupport: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 29 };

// UNSUPPORTED Rust 80:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_PciDevice_AriSupport: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 30 };

// UNSUPPORTED Rust 81:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_PciDevice_AtomicsSupported: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 35 };

// UNSUPPORTED Rust 82:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_PciDevice_AtsSupport: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 33 };

// UNSUPPORTED Rust 83:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_PciDevice_BarTypes: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 16 };

// UNSUPPORTED Rust 84:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_PciDevice_BaseClass: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 3 };

// UNSUPPORTED Rust 85:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_PciDevice_Correctable_Error_Mask: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 21 };

// UNSUPPORTED Rust 86:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_PciDevice_CurrentLinkSpeed: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 9 };

// UNSUPPORTED Rust 87:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_PciDevice_CurrentLinkWidth: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 10 };

// UNSUPPORTED Rust 88:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_PciDevice_CurrentPayloadSize: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 6 };

// UNSUPPORTED Rust 89:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_PciDevice_CurrentSpeedAndMode: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 2 };

// UNSUPPORTED Rust 90:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_PciDevice_D3ColdSupport: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 38 };

// UNSUPPORTED Rust 91:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_PciDevice_DeviceType: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 1 };

// UNSUPPORTED Rust 92:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_PciDevice_ECRC_Errors: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 22 };

// UNSUPPORTED Rust 93:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_PciDevice_Error_Reporting: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 23 };

// UNSUPPORTED Rust 94:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_PciDevice_ExpressSpecVersion: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 13 };

// UNSUPPORTED Rust 95:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_PciDevice_FirmwareErrorHandling: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 18 };

// UNSUPPORTED Rust 96:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_PciDevice_InterruptMessageMaximum: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 15 };

// UNSUPPORTED Rust 97:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_PciDevice_InterruptSupport: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 14 };

// UNSUPPORTED Rust 98:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_PciDevice_Label_Id: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 27 };

// UNSUPPORTED Rust 99:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_PciDevice_Label_String: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 28 };

// UNSUPPORTED Rust 100:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_PciDevice_MaxLinkSpeed: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 11 };

// UNSUPPORTED Rust 101:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_PciDevice_MaxLinkWidth: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 12 };

// UNSUPPORTED Rust 102:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_PciDevice_MaxPayloadSize: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 7 };

// UNSUPPORTED Rust 103:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_PciDevice_MaxReadRequestSize: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 8 };

// UNSUPPORTED Rust 104:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_PciDevice_OnPostPath: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 37 };

// UNSUPPORTED Rust 105:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_PciDevice_ParentSerialNumber: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 45 };

// UNSUPPORTED Rust 106:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_PciDevice_ProgIf: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 5 };

// UNSUPPORTED Rust 107:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_PciDevice_RequiresReservedMemoryRegion: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 34 };

// UNSUPPORTED Rust 108:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_PciDevice_RootError_Reporting: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 24 };

// UNSUPPORTED Rust 109:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_PciDevice_S0WakeupSupported: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 25 };

// UNSUPPORTED Rust 110:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_PciDevice_SerialNumber: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 40 };

// UNSUPPORTED Rust 111:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_PciDevice_SriovSupport: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 26 };

// UNSUPPORTED Rust 112:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_PciDevice_SubClass: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 4 };

// UNSUPPORTED Rust 113:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_PciDevice_SupportedLinkSubState: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 36 };

// UNSUPPORTED Rust 114:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_PciDevice_Uncorrectable_Error_Mask: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 19 };

// UNSUPPORTED Rust 115:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_PciDevice_Uncorrectable_Error_Severity: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 20 };

// UNSUPPORTED Rust 116:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_PciDevice_UsbComponentRelation: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 43 };

// UNSUPPORTED Rust 117:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_PciDevice_UsbDvsecPortSpecificAttributes: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 42 };

// UNSUPPORTED Rust 118:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_PciDevice_UsbDvsecPortType: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 41 };

// UNSUPPORTED Rust 119:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_PciDevice_UsbHostRouterName: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x3ab22e31_8264_4b4e_9af5_a8d2d8e33e62), pid: 44 };

// UNSUPPORTED Rust 120:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_PciRootBus_ASPMSupport: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0xd817fc28_793e_4b9e_9970_469d8be63073), pid: 8 };

// UNSUPPORTED Rust 121:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_PciRootBus_ClockPowerManagementSupport: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0xd817fc28_793e_4b9e_9970_469d8be63073), pid: 9 };

// UNSUPPORTED Rust 122:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_PciRootBus_CurrentSpeedAndMode: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0xd817fc28_793e_4b9e_9970_469d8be63073), pid: 2 };

// UNSUPPORTED Rust 123:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_PciRootBus_DeviceIDMessagingCapable: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0xd817fc28_793e_4b9e_9970_469d8be63073), pid: 4 };

// UNSUPPORTED Rust 124:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_PciRootBus_ExtendedConfigAvailable: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0xd817fc28_793e_4b9e_9970_469d8be63073), pid: 6 };

// UNSUPPORTED Rust 125:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_PciRootBus_ExtendedPCIConfigOpRegionSupport: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0xd817fc28_793e_4b9e_9970_469d8be63073), pid: 7 };

// UNSUPPORTED Rust 126:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_PciRootBus_MSISupport: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0xd817fc28_793e_4b9e_9970_469d8be63073), pid: 11 };

// UNSUPPORTED Rust 127:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_PciRootBus_NativePciExpressControl: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0xd817fc28_793e_4b9e_9970_469d8be63073), pid: 17 };

// UNSUPPORTED Rust 128:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_PciRootBus_PCIExpressAERControl: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0xd817fc28_793e_4b9e_9970_469d8be63073), pid: 15 };

// UNSUPPORTED Rust 129:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_PciRootBus_PCIExpressCapabilityControl: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0xd817fc28_793e_4b9e_9970_469d8be63073), pid: 16 };

// UNSUPPORTED Rust 130:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_PciRootBus_PCIExpressNativeHotPlugControl: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0xd817fc28_793e_4b9e_9970_469d8be63073), pid: 12 };

// UNSUPPORTED Rust 131:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_PciRootBus_PCIExpressNativePMEControl: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0xd817fc28_793e_4b9e_9970_469d8be63073), pid: 14 };

// UNSUPPORTED Rust 132:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_PciRootBus_PCISegmentGroupsSupport: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0xd817fc28_793e_4b9e_9970_469d8be63073), pid: 10 };

// UNSUPPORTED Rust 133:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_PciRootBus_SHPCNativeHotPlugControl: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0xd817fc28_793e_4b9e_9970_469d8be63073), pid: 13 };

// UNSUPPORTED Rust 134:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_PciRootBus_SecondaryBusWidth: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0xd817fc28_793e_4b9e_9970_469d8be63073), pid: 5 };

// UNSUPPORTED Rust 135:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_PciRootBus_SecondaryInterface: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0xd817fc28_793e_4b9e_9970_469d8be63073), pid: 1 };

// UNSUPPORTED Rust 136:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_PciRootBus_SupportedSpeedsAndModes: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0xd817fc28_793e_4b9e_9970_469d8be63073), pid: 3 };

// UNSUPPORTED Rust 137:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_PciRootBus_SystemMsiSupport: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0xd817fc28_793e_4b9e_9970_469d8be63073), pid: 18 };

// UNSUPPORTED Rust 138:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_WiFiDirectServices_AdvertisementId: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x31b37743_7c5e_4005_93e6_e953f92b82e9), pid: 5 };

// UNSUPPORTED Rust 139:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_WiFiDirectServices_RequestServiceInformation: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x31b37743_7c5e_4005_93e6_e953f92b82e9), pid: 7 };

// UNSUPPORTED Rust 140:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_WiFiDirectServices_ServiceAddress: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x31b37743_7c5e_4005_93e6_e953f92b82e9), pid: 2 };

// UNSUPPORTED Rust 141:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_WiFiDirectServices_ServiceConfigMethods: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x31b37743_7c5e_4005_93e6_e953f92b82e9), pid: 6 };

// UNSUPPORTED Rust 142:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_WiFiDirectServices_ServiceInformation: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x31b37743_7c5e_4005_93e6_e953f92b82e9), pid: 4 };

// UNSUPPORTED Rust 143:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_WiFiDirectServices_ServiceName: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x31b37743_7c5e_4005_93e6_e953f92b82e9), pid: 3 };

// UNSUPPORTED Rust 144:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_WiFiDirect_DeviceAddress: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x1506935d_e3e7_450f_8637_82233ebe5f6e), pid: 1 };

// UNSUPPORTED Rust 145:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_WiFiDirect_DeviceAddressCopy: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x1506935d_e3e7_450f_8637_82233ebe5f6e), pid: 13 };

// UNSUPPORTED Rust 146:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_WiFiDirect_FoundWsbService: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x1506935d_e3e7_450f_8637_82233ebe5f6e), pid: 24 };

// UNSUPPORTED Rust 147:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_WiFiDirect_GroupId: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x1506935d_e3e7_450f_8637_82233ebe5f6e), pid: 4 };

// UNSUPPORTED Rust 148:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_WiFiDirect_InformationElements: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x1506935d_e3e7_450f_8637_82233ebe5f6e), pid: 12 };

// UNSUPPORTED Rust 149:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_WiFiDirect_InterfaceAddress: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x1506935d_e3e7_450f_8637_82233ebe5f6e), pid: 2 };

// UNSUPPORTED Rust 150:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_WiFiDirect_InterfaceGuid: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x1506935d_e3e7_450f_8637_82233ebe5f6e), pid: 3 };

// UNSUPPORTED Rust 151:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_WiFiDirect_IsConnected: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x1506935d_e3e7_450f_8637_82233ebe5f6e), pid: 5 };

// UNSUPPORTED Rust 152:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_WiFiDirect_IsDMGCapable: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x1506935d_e3e7_450f_8637_82233ebe5f6e), pid: 22 };

// UNSUPPORTED Rust 153:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_WiFiDirect_IsLegacyDevice: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x1506935d_e3e7_450f_8637_82233ebe5f6e), pid: 7 };

// UNSUPPORTED Rust 154:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_WiFiDirect_IsMiracastLCPSupported: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x1506935d_e3e7_450f_8637_82233ebe5f6e), pid: 9 };

// UNSUPPORTED Rust 155:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_WiFiDirect_IsRecentlyAssociated: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x1506935d_e3e7_450f_8637_82233ebe5f6e), pid: 14 };

// UNSUPPORTED Rust 156:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_WiFiDirect_IsVisible: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x1506935d_e3e7_450f_8637_82233ebe5f6e), pid: 6 };

// UNSUPPORTED Rust 157:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_WiFiDirect_LinkQuality: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x1506935d_e3e7_450f_8637_82233ebe5f6e), pid: 28 };

// UNSUPPORTED Rust 158:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_WiFiDirect_MiracastVersion: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x1506935d_e3e7_450f_8637_82233ebe5f6e), pid: 8 };

// UNSUPPORTED Rust 159:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_WiFiDirect_Miracast_SessionMgmtControlPort: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x1506935d_e3e7_450f_8637_82233ebe5f6e), pid: 31 };

// UNSUPPORTED Rust 160:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_WiFiDirect_NoMiracastAutoProject: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x1506935d_e3e7_450f_8637_82233ebe5f6e), pid: 16 };

// UNSUPPORTED Rust 161:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_WiFiDirect_RtspTcpConnectionParametersSupported: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x1506935d_e3e7_450f_8637_82233ebe5f6e), pid: 32 };

// UNSUPPORTED Rust 162:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_WiFiDirect_Service_Aeps: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x1506935d_e3e7_450f_8637_82233ebe5f6e), pid: 15 };

// UNSUPPORTED Rust 163:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_WiFiDirect_Services: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x1506935d_e3e7_450f_8637_82233ebe5f6e), pid: 10 };

// UNSUPPORTED Rust 164:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_WiFiDirect_SupportedChannelList: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x1506935d_e3e7_450f_8637_82233ebe5f6e), pid: 11 };

// UNSUPPORTED Rust 165:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_WiFiDirect_TransientAssociation: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x1506935d_e3e7_450f_8637_82233ebe5f6e), pid: 27 };

// UNSUPPORTED Rust 166:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_WiFi_InterfaceGuid: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0xef1167eb_cbfc_4341_a568_a7c91a68982c), pid: 2 };

public typealias `DEVPROP_PCIDEVICE_ACSCOMPATIBLEUPHIERARCHY` = UInt;
public typealias `DEVPROP_PCIDEVICE_ACSSUPPORT` = UInt;
public typealias `DEVPROP_PCIDEVICE_CURRENTSPEEDANDMODE` = UInt;
public typealias `DEVPROP_PCIDEVICE_DEVICEBRIDGETYPE` = UInt;
public typealias `DEVPROP_PCIDEVICE_INTERRUPTTYPE` = UInt;
public typealias `DEVPROP_PCIDEVICE_SRIOVSUPPORT` = UInt;
public typealias `DEVPROP_PCIEXPRESSDEVICE_LINKSPEED` = UInt;
public typealias `DEVPROP_PCIEXPRESSDEVICE_LINKWIDTH` = UInt;
public typealias `DEVPROP_PCIEXPRESSDEVICE_PAYLOADORREQUESTSIZE` = UInt;
public typealias `DEVPROP_PCIEXPRESSDEVICE_SPEC_VERSION` = UInt;
public typealias `DEVPROP_PCIROOTBUS_BUSWIDTH` = UInt;
public typealias `DEVPROP_PCIROOTBUS_CURRENTSPEEDANDMODE` = UInt;
public typealias `DEVPROP_PCIROOTBUS_SECONDARYINTERFACE` = UInt;
public typealias `DEVPROP_PCIROOTBUS_SUPPORTEDSPEEDSANDMODES` = UInt;
public const val `DISCOVERY_FILTER_BITMASK_ANY`: UInt = 15u;
public const val `DISCOVERY_FILTER_BITMASK_DEVICE`: UInt = 1u;
public const val `DISCOVERY_FILTER_BITMASK_GO`: UInt = 2u;
// UNSUPPORTED Rust 184:1: generic scalar type unsupported
// pub type DOT11EXTIHV_ADAPTER_RESET = Option<unsafe extern "system" fn(hihvextadapter: super::super::Foundation::HANDLE) -> u32>;

// UNSUPPORTED Rust 185:1: generic scalar type unsupported
// pub type DOT11EXTIHV_CONTROL = Option<unsafe extern "system" fn(hihvextadapter: super::super::Foundation::HANDLE, dwinbuffersize: u32, pinbuffer: *const u8, dwoutbuffersize: u32, poutbuffer: *mut u8, pdwbytesreturned: *mut u32) -> u32>;

// UNSUPPORTED Rust 186:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Security_ExtensibleAuthenticationProtocol")]
// pub type DOT11EXTIHV_CREATE_DISCOVERY_PROFILES = Option<unsafe extern "system" fn(hihvextadapter: super::super::Foundation::HANDLE, binsecure: windows_sys::core::BOOL, pihvprofileparams: *const DOT11EXT_IHV_PROFILE_PARAMS, pconnectablebssid: *const DOT11_BSS_LIST, pihvdiscoveryprofilelist: *mut DOT11EXT_IHV_DISCOVERY_PROFILE_LIST, pdwreasoncode: *mut u32) -> u32>;

// UNSUPPORTED Rust 188:1: generic scalar type unsupported
// pub type DOT11EXTIHV_DEINIT_ADAPTER = Option<unsafe extern "system" fn(hihvextadapter: super::super::Foundation::HANDLE)>;

// UNSUPPORTED Rust 189:1: generic scalar type unsupported
// pub type DOT11EXTIHV_DEINIT_SERVICE = Option<unsafe extern "system" fn()>;

// UNSUPPORTED Rust 190:1: generic scalar type unsupported
// pub type DOT11EXTIHV_GET_VERSION_INFO = Option<unsafe extern "system" fn(pdot11ihvversioninfo: *mut DOT11_IHV_VERSION_INFO) -> u32>;

// UNSUPPORTED Rust 191:1: generic scalar type unsupported
// pub type DOT11EXTIHV_INIT_ADAPTER = Option<unsafe extern "system" fn(pdot11adapter: *const DOT11_ADAPTER, hdot11svchandle: super::super::Foundation::HANDLE, phihvextadapter: *mut super::super::Foundation::HANDLE) -> u32>;

// UNSUPPORTED Rust 192:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Security_ExtensibleAuthenticationProtocol", feature = "Win32_System_RemoteDesktop"))]
// pub type DOT11EXTIHV_INIT_SERVICE = Option<unsafe extern "system" fn(dwvernumused: u32, pdot11extapi: *const DOT11EXT_APIS, pvreserved: *const core::ffi::c_void, pdot11ihvhandlers: *mut DOT11EXT_IHV_HANDLERS) -> u32>;

// UNSUPPORTED Rust 194:1: generic scalar type unsupported
// pub type DOT11EXTIHV_INIT_VIRTUAL_STATION = Option<unsafe extern "system" fn(pdot11extvsapi: *const DOT11EXT_VIRTUAL_STATION_APIS, pvreserved: *const core::ffi::c_void) -> u32>;

// UNSUPPORTED Rust 195:1: generic scalar type unsupported
// pub type DOT11EXTIHV_IS_UI_REQUEST_PENDING = Option<unsafe extern "system" fn(guiduirequest: windows_sys::core::GUID, pbisrequestpending: *mut windows_sys::core::BOOL) -> u32>;

// UNSUPPORTED Rust 196:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Security_ExtensibleAuthenticationProtocol")]
// pub type DOT11EXTIHV_ONEX_INDICATE_RESULT = Option<unsafe extern "system" fn(hihvextadapter: super::super::Foundation::HANDLE, msonexresult: DOT11_MSONEX_RESULT, pdot11msonexresultparams: *const DOT11_MSONEX_RESULT_PARAMS) -> u32>;

// UNSUPPORTED Rust 198:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Security_ExtensibleAuthenticationProtocol")]
// pub type DOT11EXTIHV_PERFORM_CAPABILITY_MATCH = Option<unsafe extern "system" fn(hihvextadapter: super::super::Foundation::HANDLE, pihvprofileparams: *const DOT11EXT_IHV_PROFILE_PARAMS, pihvconnprofile: *const DOT11EXT_IHV_CONNECTIVITY_PROFILE, pihvsecprofile: *const DOT11EXT_IHV_SECURITY_PROFILE, pconnectablebssid: *const DOT11_BSS_LIST, pdwreasoncode: *mut u32) -> u32>;

// UNSUPPORTED Rust 200:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// pub type DOT11EXTIHV_PERFORM_POST_ASSOCIATE = Option<unsafe extern "system" fn(hihvextadapter: super::super::Foundation::HANDLE, hsecuritysessionid: super::super::Foundation::HANDLE, pportstate: *const DOT11_PORT_STATE, udot11assocparamsbytes: u32, pdot11assocparams: *const DOT11_ASSOCIATION_COMPLETION_PARAMETERS) -> u32>;

// UNSUPPORTED Rust 202:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Security_ExtensibleAuthenticationProtocol")]
// pub type DOT11EXTIHV_PERFORM_PRE_ASSOCIATE = Option<unsafe extern "system" fn(hihvextadapter: super::super::Foundation::HANDLE, hconnectsession: super::super::Foundation::HANDLE, pihvprofileparams: *const DOT11EXT_IHV_PROFILE_PARAMS, pihvconnprofile: *const DOT11EXT_IHV_CONNECTIVITY_PROFILE, pihvsecprofile: *const DOT11EXT_IHV_SECURITY_PROFILE, pconnectablebssid: *const DOT11_BSS_LIST, pdwreasoncode: *mut u32) -> u32>;

// UNSUPPORTED Rust 204:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_RemoteDesktop")]
// pub type DOT11EXTIHV_PROCESS_SESSION_CHANGE = Option<unsafe extern "system" fn(ueventtype: u32, psessionnotification: *const super::super::System::RemoteDesktop::WTSSESSION_NOTIFICATION) -> u32>;

// UNSUPPORTED Rust 206:1: generic scalar type unsupported
// pub type DOT11EXTIHV_PROCESS_UI_RESPONSE = Option<unsafe extern "system" fn(guiduirequest: windows_sys::core::GUID, dwbytecount: u32, pvresponsebuffer: *const core::ffi::c_void) -> u32>;

// UNSUPPORTED Rust 207:1: generic scalar type unsupported
// pub type DOT11EXTIHV_QUERY_UI_REQUEST = Option<unsafe extern "system" fn(hihvextadapter: super::super::Foundation::HANDLE, connectionphase: DOT11EXT_IHV_CONNECTION_PHASE, ppihvuirequest: *mut *mut DOT11EXT_IHV_UI_REQUEST) -> u32>;

// UNSUPPORTED Rust 208:1: generic scalar type unsupported
// pub type DOT11EXTIHV_RECEIVE_INDICATION = Option<unsafe extern "system" fn(hihvextadapter: super::super::Foundation::HANDLE, indicationtype: DOT11EXT_IHV_INDICATION_TYPE, ubufferlength: u32, pvbuffer: *const core::ffi::c_void) -> u32>;

// UNSUPPORTED Rust 209:1: generic scalar type unsupported
// pub type DOT11EXTIHV_RECEIVE_PACKET = Option<unsafe extern "system" fn(hihvextadapter: super::super::Foundation::HANDLE, dwinbuffersize: u32, pvinbuffer: *const core::ffi::c_void) -> u32>;

// UNSUPPORTED Rust 210:1: generic scalar type unsupported
// pub type DOT11EXTIHV_SEND_PACKET_COMPLETION = Option<unsafe extern "system" fn(hsendcompletion: super::super::Foundation::HANDLE) -> u32>;

// UNSUPPORTED Rust 211:1: generic scalar type unsupported
// pub type DOT11EXTIHV_STOP_POST_ASSOCIATE = Option<unsafe extern "system" fn(hihvextadapter: super::super::Foundation::HANDLE, ppeer: *const *const u8, dot11assocstatus: u32) -> u32>;

// UNSUPPORTED Rust 212:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Security_ExtensibleAuthenticationProtocol")]
// pub type DOT11EXTIHV_VALIDATE_PROFILE = Option<unsafe extern "system" fn(hihvextadapter: super::super::Foundation::HANDLE, pihvprofileparams: *const DOT11EXT_IHV_PROFILE_PARAMS, pihvconnprofile: *const DOT11EXT_IHV_CONNECTIVITY_PROFILE, pihvsecprofile: *const DOT11EXT_IHV_SECURITY_PROFILE, pdwreasoncode: *mut u32) -> u32>;

// UNSUPPORTED Rust 214:1: generic scalar type unsupported
// pub type DOT11EXT_ALLOCATE_BUFFER = Option<unsafe extern "system" fn(dwbytecount: u32, ppvbuffer: *mut *mut core::ffi::c_void) -> u32>;

// UNSUPPORTED Rust 215:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Security_ExtensibleAuthenticationProtocol"))]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11EXT_APIS {
//     pub Dot11ExtAllocateBuffer: DOT11EXT_ALLOCATE_BUFFER,
//     pub Dot11ExtFreeBuffer: DOT11EXT_FREE_BUFFER,
//     pub Dot11ExtSetProfileCustomUserData: DOT11EXT_SET_PROFILE_CUSTOM_USER_DATA,
//     pub Dot11ExtGetProfileCustomUserData: DOT11EXT_GET_PROFILE_CUSTOM_USER_DATA,
//     pub Dot11ExtSetCurrentProfile: DOT11EXT_SET_CURRENT_PROFILE,
//     pub Dot11ExtSendUIRequest: DOT11EXT_SEND_UI_REQUEST,
//     pub Dot11ExtPreAssociateCompletion: DOT11EXT_PRE_ASSOCIATE_COMPLETION,
//     pub Dot11ExtPostAssociateCompletion: DOT11EXT_POST_ASSOCIATE_COMPLETION,
//     pub Dot11ExtSendNotification: DOT11EXT_SEND_NOTIFICATION,
//     pub Dot11ExtSendPacket: DOT11EXT_SEND_PACKET,
//     pub Dot11ExtSetEtherTypeHandling: DOT11EXT_SET_ETHERTYPE_HANDLING,
//     pub Dot11ExtSetAuthAlgorithm: DOT11EXT_SET_AUTH_ALGORITHM,
//     pub Dot11ExtSetUnicastCipherAlgorithm: DOT11EXT_SET_UNICAST_CIPHER_ALGORITHM,
//     pub Dot11ExtSetMulticastCipherAlgorithm: DOT11EXT_SET_MULTICAST_CIPHER_ALGORITHM,
//     pub Dot11ExtSetDefaultKey: DOT11EXT_SET_DEFAULT_KEY,
//     pub Dot11ExtSetKeyMappingKey: DOT11EXT_SET_KEY_MAPPING_KEY,
//     pub Dot11ExtSetDefaultKeyId: DOT11EXT_SET_DEFAULT_KEY_ID,
//     pub Dot11ExtNicSpecificExtension: DOT11EXT_NIC_SPECIFIC_EXTENSION,
//     pub Dot11ExtSetExcludeUnencrypted: DOT11EXT_SET_EXCLUDE_UNENCRYPTED,
//     pub Dot11ExtStartOneX: DOT11EXT_ONEX_START,
//     pub Dot11ExtStopOneX: DOT11EXT_ONEX_STOP,
//     pub Dot11ExtProcessSecurityPacket: DOT11EXT_PROCESS_ONEX_PACKET,
// }

// UNSUPPORTED Rust 242:1: generic scalar type unsupported
// pub type DOT11EXT_FREE_BUFFER = Option<unsafe extern "system" fn(pvmemory: *const core::ffi::c_void)>;

// UNSUPPORTED Rust 243:1: generic scalar type unsupported
// pub type DOT11EXT_GET_PROFILE_CUSTOM_USER_DATA = Option<unsafe extern "system" fn(hdot11svchandle: super::super::Foundation::HANDLE, hconnectsession: super::super::Foundation::HANDLE, dwsessionid: u32, pdwdatasize: *mut u32, ppvdata: *mut *mut core::ffi::c_void) -> u32>;

public typealias `DOT11EXT_IHV_CONNECTION_PHASE` = Int;
// UNSUPPORTED Rust 245:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11EXT_IHV_CONNECTIVITY_PROFILE {
//     pub pszXmlFragmentIhvConnectivity: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 250:1: declaration Impl has no candidate rule
// impl Default for DOT11EXT_IHV_CONNECTIVITY_PROFILE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 255:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11EXT_IHV_DISCOVERY_PROFILE {
//     pub IhvConnectivityProfile: DOT11EXT_IHV_CONNECTIVITY_PROFILE,
//     pub IhvSecurityProfile: DOT11EXT_IHV_SECURITY_PROFILE,
// }

// UNSUPPORTED Rust 261:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11EXT_IHV_DISCOVERY_PROFILE_LIST {
//     pub dwCount: u32,
//     pub pIhvDiscoveryProfiles: *mut DOT11EXT_IHV_DISCOVERY_PROFILE,
// }

// UNSUPPORTED Rust 267:1: declaration Impl has no candidate rule
// impl Default for DOT11EXT_IHV_DISCOVERY_PROFILE_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 272:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_NetworkManagement_Ndis", feature = "Win32_Security_ExtensibleAuthenticationProtocol", feature = "Win32_System_RemoteDesktop"))]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11EXT_IHV_HANDLERS {
//     pub Dot11ExtIhvDeinitService: DOT11EXTIHV_DEINIT_SERVICE,
//     pub Dot11ExtIhvInitAdapter: DOT11EXTIHV_INIT_ADAPTER,
//     pub Dot11ExtIhvDeinitAdapter: DOT11EXTIHV_DEINIT_ADAPTER,
//     pub Dot11ExtIhvPerformPreAssociate: DOT11EXTIHV_PERFORM_PRE_ASSOCIATE,
//     pub Dot11ExtIhvAdapterReset: DOT11EXTIHV_ADAPTER_RESET,
//     pub Dot11ExtIhvPerformPostAssociate: DOT11EXTIHV_PERFORM_POST_ASSOCIATE,
//     pub Dot11ExtIhvStopPostAssociate: DOT11EXTIHV_STOP_POST_ASSOCIATE,
//     pub Dot11ExtIhvValidateProfile: DOT11EXTIHV_VALIDATE_PROFILE,
//     pub Dot11ExtIhvPerformCapabilityMatch: DOT11EXTIHV_PERFORM_CAPABILITY_MATCH,
//     pub Dot11ExtIhvCreateDiscoveryProfiles: DOT11EXTIHV_CREATE_DISCOVERY_PROFILES,
//     pub Dot11ExtIhvProcessSessionChange: DOT11EXTIHV_PROCESS_SESSION_CHANGE,
//     pub Dot11ExtIhvReceiveIndication: DOT11EXTIHV_RECEIVE_INDICATION,
//     pub Dot11ExtIhvReceivePacket: DOT11EXTIHV_RECEIVE_PACKET,
//     pub Dot11ExtIhvSendPacketCompletion: DOT11EXTIHV_SEND_PACKET_COMPLETION,
//     pub Dot11ExtIhvIsUIRequestPending: DOT11EXTIHV_IS_UI_REQUEST_PENDING,
//     pub Dot11ExtIhvProcessUIResponse: DOT11EXTIHV_PROCESS_UI_RESPONSE,
//     pub Dot11ExtIhvQueryUIRequest: DOT11EXTIHV_QUERY_UI_REQUEST,
//     pub Dot11ExtIhvOnexIndicateResult: DOT11EXTIHV_ONEX_INDICATE_RESULT,
//     pub Dot11ExtIhvControl: DOT11EXTIHV_CONTROL,
// }

public typealias `DOT11EXT_IHV_INDICATION_TYPE` = Int;
// UNSUPPORTED Rust 297:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_ExtensibleAuthenticationProtocol")]
// #[derive(Clone, Copy)]
// pub struct DOT11EXT_IHV_PARAMS {
//     pub dot11ExtIhvProfileParams: DOT11EXT_IHV_PROFILE_PARAMS,
//     pub wstrProfileName: [u16; 256],
//     pub dwProfileTypeFlags: u32,
//     pub interfaceGuid: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 306:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security_ExtensibleAuthenticationProtocol")]
// impl Default for DOT11EXT_IHV_PARAMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 312:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_ExtensibleAuthenticationProtocol")]
// #[derive(Clone, Copy)]
// pub struct DOT11EXT_IHV_PROFILE_PARAMS {
//     pub pSsidList: *mut DOT11EXT_IHV_SSID_LIST,
//     pub BssType: DOT11_BSS_TYPE,
//     pub pMSSecuritySettings: *mut DOT11_MSSECURITY_SETTINGS,
// }

// UNSUPPORTED Rust 320:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security_ExtensibleAuthenticationProtocol")]
// impl Default for DOT11EXT_IHV_PROFILE_PARAMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 326:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11EXT_IHV_SECURITY_PROFILE {
//     pub pszXmlFragmentIhvSecurity: windows_sys::core::PWSTR,
//     pub bUseMSOnex: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 332:1: declaration Impl has no candidate rule
// impl Default for DOT11EXT_IHV_SECURITY_PROFILE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 337:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11EXT_IHV_SSID_LIST {
//     pub ulCount: u32,
//     pub SSIDs: [DOT11_SSID; 1],
// }

// UNSUPPORTED Rust 343:1: declaration Impl has no candidate rule
// impl Default for DOT11EXT_IHV_SSID_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 348:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11EXT_IHV_UI_REQUEST {
//     pub dwSessionId: u32,
//     pub guidUIRequest: windows_sys::core::GUID,
//     pub UIPageClsid: windows_sys::core::GUID,
//     pub dwByteCount: u32,
//     pub pvUIRequest: *mut u8,
// }

// UNSUPPORTED Rust 357:1: declaration Impl has no candidate rule
// impl Default for DOT11EXT_IHV_UI_REQUEST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 362:1: generic scalar type unsupported
// pub type DOT11EXT_NIC_SPECIFIC_EXTENSION = Option<unsafe extern "system" fn(hdot11svchandle: super::super::Foundation::HANDLE, dwinbuffersize: u32, pvinbuffer: *const core::ffi::c_void, pdwoutbuffersize: *mut u32, pvoutbuffer: *mut core::ffi::c_void) -> u32>;

// UNSUPPORTED Rust 363:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Security_ExtensibleAuthenticationProtocol")]
// pub type DOT11EXT_ONEX_START = Option<unsafe extern "system" fn(hdot11svchandle: super::super::Foundation::HANDLE, peapattributes: *const super::super::Security::ExtensibleAuthenticationProtocol::EAP_ATTRIBUTES) -> u32>;

// UNSUPPORTED Rust 365:1: generic scalar type unsupported
// pub type DOT11EXT_ONEX_STOP = Option<unsafe extern "system" fn(hdot11svchandle: super::super::Foundation::HANDLE) -> u32>;

// UNSUPPORTED Rust 366:1: generic scalar type unsupported
// pub type DOT11EXT_POST_ASSOCIATE_COMPLETION = Option<unsafe extern "system" fn(hdot11svchandle: super::super::Foundation::HANDLE, hsecuritysessionid: super::super::Foundation::HANDLE, ppeer: *const *const u8, dwreasoncode: u32, dwwin32error: u32) -> u32>;

// UNSUPPORTED Rust 367:1: generic scalar type unsupported
// pub type DOT11EXT_PRE_ASSOCIATE_COMPLETION = Option<unsafe extern "system" fn(hdot11svchandle: super::super::Foundation::HANDLE, hconnectsession: super::super::Foundation::HANDLE, dwreasoncode: u32, dwwin32error: u32) -> u32>;

// UNSUPPORTED Rust 368:1: generic scalar type unsupported
// pub type DOT11EXT_PROCESS_ONEX_PACKET = Option<unsafe extern "system" fn(hdot11svchandle: super::super::Foundation::HANDLE, dwinpacketsize: u32, pvinpacket: *const core::ffi::c_void) -> u32>;

public const val `DOT11EXT_PSK_MAX_LENGTH`: UInt = 64u;
// UNSUPPORTED Rust 370:1: generic scalar type unsupported
// pub type DOT11EXT_QUERY_VIRTUAL_STATION_PROPERTIES = Option<unsafe extern "system" fn(hdot11svchandle: super::super::Foundation::HANDLE, pbisvirtualstation: *mut windows_sys::core::BOOL, pgprimary: *mut windows_sys::core::GUID, pvreserved: *const core::ffi::c_void) -> u32>;

// UNSUPPORTED Rust 371:1: generic scalar type unsupported
// pub type DOT11EXT_RELEASE_VIRTUAL_STATION = Option<unsafe extern "system" fn(hdot11primaryhandle: super::super::Foundation::HANDLE, pvreserved: *const core::ffi::c_void) -> u32>;

// UNSUPPORTED Rust 372:1: generic scalar type unsupported
// pub type DOT11EXT_REQUEST_VIRTUAL_STATION = Option<unsafe extern "system" fn(hdot11primaryhandle: super::super::Foundation::HANDLE, pvreserved: *const core::ffi::c_void) -> u32>;

// UNSUPPORTED Rust 373:1: generic scalar type unsupported
// pub type DOT11EXT_SEND_NOTIFICATION = Option<unsafe extern "system" fn(hdot11svchandle: super::super::Foundation::HANDLE, pnotificationdata: *const L2_NOTIFICATION_DATA) -> u32>;

// UNSUPPORTED Rust 374:1: generic scalar type unsupported
// pub type DOT11EXT_SEND_PACKET = Option<unsafe extern "system" fn(hdot11svchandle: super::super::Foundation::HANDLE, upacketlen: u32, pvpacket: *const core::ffi::c_void, hsendcompletion: super::super::Foundation::HANDLE) -> u32>;

// UNSUPPORTED Rust 375:1: generic scalar type unsupported
// pub type DOT11EXT_SEND_UI_REQUEST = Option<unsafe extern "system" fn(hdot11svchandle: super::super::Foundation::HANDLE, pihvuirequest: *const DOT11EXT_IHV_UI_REQUEST) -> u32>;

// UNSUPPORTED Rust 376:1: generic scalar type unsupported
// pub type DOT11EXT_SET_AUTH_ALGORITHM = Option<unsafe extern "system" fn(hdot11svchandle: super::super::Foundation::HANDLE, dwauthalgo: u32) -> u32>;

// UNSUPPORTED Rust 377:1: generic scalar type unsupported
// pub type DOT11EXT_SET_CURRENT_PROFILE = Option<unsafe extern "system" fn(hdot11svchandle: super::super::Foundation::HANDLE, hconnectsession: super::super::Foundation::HANDLE, pihvconnprofile: *const DOT11EXT_IHV_CONNECTIVITY_PROFILE, pihvsecprofile: *const DOT11EXT_IHV_SECURITY_PROFILE) -> u32>;

// UNSUPPORTED Rust 378:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// pub type DOT11EXT_SET_DEFAULT_KEY = Option<unsafe extern "system" fn(hdot11svchandle: super::super::Foundation::HANDLE, pkey: *const DOT11_CIPHER_DEFAULT_KEY_VALUE, dot11direction: DOT11_DIRECTION) -> u32>;

// UNSUPPORTED Rust 380:1: generic scalar type unsupported
// pub type DOT11EXT_SET_DEFAULT_KEY_ID = Option<unsafe extern "system" fn(hdot11svchandle: super::super::Foundation::HANDLE, udefaultkeyid: u32) -> u32>;

// UNSUPPORTED Rust 381:1: generic scalar type unsupported
// pub type DOT11EXT_SET_ETHERTYPE_HANDLING = Option<unsafe extern "system" fn(hdot11svchandle: super::super::Foundation::HANDLE, umaxbacklog: u32, unumofexemption: u32, pexemption: *const DOT11_PRIVACY_EXEMPTION, unumofregistration: u32, pusregistration: *const u16) -> u32>;

// UNSUPPORTED Rust 382:1: generic scalar type unsupported
// pub type DOT11EXT_SET_EXCLUDE_UNENCRYPTED = Option<unsafe extern "system" fn(hdot11svchandle: super::super::Foundation::HANDLE, bexcludeunencrypted: windows_sys::core::BOOL) -> u32>;

// UNSUPPORTED Rust 383:1: generic scalar type unsupported
// pub type DOT11EXT_SET_KEY_MAPPING_KEY = Option<unsafe extern "system" fn(hdot11svchandle: super::super::Foundation::HANDLE, pkey: *const DOT11_CIPHER_KEY_MAPPING_KEY_VALUE) -> u32>;

// UNSUPPORTED Rust 384:1: generic scalar type unsupported
// pub type DOT11EXT_SET_MULTICAST_CIPHER_ALGORITHM = Option<unsafe extern "system" fn(hdot11svchandle: super::super::Foundation::HANDLE, dwmulticastcipheralgo: u32) -> u32>;

// UNSUPPORTED Rust 385:1: generic scalar type unsupported
// pub type DOT11EXT_SET_PROFILE_CUSTOM_USER_DATA = Option<unsafe extern "system" fn(hdot11svchandle: super::super::Foundation::HANDLE, hconnectsession: super::super::Foundation::HANDLE, dwsessionid: u32, dwdatasize: u32, pvdata: *const core::ffi::c_void) -> u32>;

// UNSUPPORTED Rust 386:1: generic scalar type unsupported
// pub type DOT11EXT_SET_UNICAST_CIPHER_ALGORITHM = Option<unsafe extern "system" fn(hdot11svchandle: super::super::Foundation::HANDLE, dwunicastcipheralgo: u32) -> u32>;

// UNSUPPORTED Rust 387:1: generic scalar type unsupported
// pub type DOT11EXT_SET_VIRTUAL_STATION_AP_PROPERTIES = Option<unsafe extern "system" fn(hdot11svchandle: super::super::Foundation::HANDLE, hconnectsession: super::super::Foundation::HANDLE, dwnumproperties: u32, pproperties: *const DOT11EXT_VIRTUAL_STATION_AP_PROPERTY, pvreserved: *const core::ffi::c_void) -> u32>;

// UNSUPPORTED Rust 388:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11EXT_VIRTUAL_STATION_APIS {
//     pub Dot11ExtRequestVirtualStation: DOT11EXT_REQUEST_VIRTUAL_STATION,
//     pub Dot11ExtReleaseVirtualStation: DOT11EXT_RELEASE_VIRTUAL_STATION,
//     pub Dot11ExtQueryVirtualStationProperties: DOT11EXT_QUERY_VIRTUAL_STATION_PROPERTIES,
//     pub Dot11ExtSetVirtualStationAPProperties: DOT11EXT_SET_VIRTUAL_STATION_AP_PROPERTIES,
// }

// UNSUPPORTED Rust 396:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11EXT_VIRTUAL_STATION_AP_PROPERTY {
//     pub dot11SSID: DOT11_SSID,
//     pub dot11AuthAlgo: DOT11_AUTH_ALGORITHM,
//     pub dot11CipherAlgo: DOT11_CIPHER_ALGORITHM,
//     pub bIsPassPhrase: windows_sys::core::BOOL,
//     pub dwKeyLength: u32,
//     pub ucKeyData: [u8; 64],
// }

// UNSUPPORTED Rust 406:1: declaration Impl has no candidate rule
// impl Default for DOT11EXT_VIRTUAL_STATION_AP_PROPERTY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 411:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_ACCESSNETWORKOPTIONS {
//     pub AccessNetworkType: u8,
//     pub Internet: u8,
//     pub ASRA: u8,
//     pub ESR: u8,
//     pub UESA: u8,
// }

public typealias `DOT11_AC_PARAM` = Int;
// UNSUPPORTED Rust 421:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11_ADAPTER {
//     pub gAdapterId: windows_sys::core::GUID,
//     pub pszDescription: windows_sys::core::PWSTR,
//     pub Dot11CurrentOpMode: DOT11_CURRENT_OPERATION_MODE,
// }

// UNSUPPORTED Rust 428:1: declaration Impl has no candidate rule
// impl Default for DOT11_ADAPTER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 433:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_ADDITIONAL_IE {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub uBeaconIEsOffset: u32,
//     pub uBeaconIEsLength: u32,
//     pub uResponseIEsOffset: u32,
//     pub uResponseIEsLength: u32,
// }

public const val `DOT11_ADDITIONAL_IE_REVISION_1`: UInt = 1u;
public typealias `DOT11_ADHOC_AUTH_ALGORITHM` = Int;
public const val `DOT11_ADHOC_AUTH_ALGO_80211_OPEN`: `DOT11_ADHOC_AUTH_ALGORITHM` = 1;
public const val `DOT11_ADHOC_AUTH_ALGO_INVALID`: `DOT11_ADHOC_AUTH_ALGORITHM` = -1;
public const val `DOT11_ADHOC_AUTH_ALGO_RSNA_PSK`: `DOT11_ADHOC_AUTH_ALGORITHM` = 7;
public typealias `DOT11_ADHOC_CIPHER_ALGORITHM` = Int;
public const val `DOT11_ADHOC_CIPHER_ALGO_CCMP`: `DOT11_ADHOC_CIPHER_ALGORITHM` = 4;
public const val `DOT11_ADHOC_CIPHER_ALGO_INVALID`: `DOT11_ADHOC_CIPHER_ALGORITHM` = -1;
public const val `DOT11_ADHOC_CIPHER_ALGO_NONE`: `DOT11_ADHOC_CIPHER_ALGORITHM` = 0;
public const val `DOT11_ADHOC_CIPHER_ALGO_WEP`: `DOT11_ADHOC_CIPHER_ALGORITHM` = 257;
public const val `DOT11_ADHOC_CONNECT_FAIL_DOMAIN_MISMATCH`: `DOT11_ADHOC_CONNECT_FAIL_REASON` = 0;
public const val `DOT11_ADHOC_CONNECT_FAIL_OTHER`: `DOT11_ADHOC_CONNECT_FAIL_REASON` = 2;
public const val `DOT11_ADHOC_CONNECT_FAIL_PASSPHRASE_MISMATCH`: `DOT11_ADHOC_CONNECT_FAIL_REASON` = 1;
public typealias `DOT11_ADHOC_CONNECT_FAIL_REASON` = Int;
public typealias `DOT11_ADHOC_NETWORK_CONNECTION_STATUS` = Int;
public const val `DOT11_ADHOC_NETWORK_CONNECTION_STATUS_CONNECTED`: `DOT11_ADHOC_NETWORK_CONNECTION_STATUS` = 13;
public const val `DOT11_ADHOC_NETWORK_CONNECTION_STATUS_CONNECTING`: `DOT11_ADHOC_NETWORK_CONNECTION_STATUS` = 12;
public const val `DOT11_ADHOC_NETWORK_CONNECTION_STATUS_DISCONNECTED`: `DOT11_ADHOC_NETWORK_CONNECTION_STATUS` = 11;
public const val `DOT11_ADHOC_NETWORK_CONNECTION_STATUS_FORMED`: `DOT11_ADHOC_NETWORK_CONNECTION_STATUS` = 14;
public const val `DOT11_ADHOC_NETWORK_CONNECTION_STATUS_INVALID`: `DOT11_ADHOC_NETWORK_CONNECTION_STATUS` = 0;
// UNSUPPORTED Rust 463:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct DOT11_ANQP_QUERY_COMPLETE_PARAMETERS {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub Status: DOT11_ANQP_QUERY_RESULT,
//     pub hContext: super::super::Foundation::HANDLE,
//     pub uResponseLength: u32,
// }

// UNSUPPORTED Rust 472:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_ANQP_QUERY_COMPLETE_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_ANQP_QUERY_COMPLETE_PARAMETERS_REVISION_1`: UInt = 1u;
public typealias `DOT11_ANQP_QUERY_RESULT` = Int;
// UNSUPPORTED Rust 480:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_AP_JOIN_REQUEST {
//     pub uJoinFailureTimeout: u32,
//     pub OperationalRateSet: DOT11_RATE_SET,
//     pub uChCenterFrequency: u32,
//     pub dot11BSSDescription: DOT11_BSS_DESCRIPTION,
// }

// UNSUPPORTED Rust 488:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct DOT11_ASSOCIATION_COMPLETION_PARAMETERS {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub MacAddr: [u8; 6],
//     pub uStatus: u32,
//     pub bReAssocReq: bool,
//     pub bReAssocResp: bool,
//     pub uAssocReqOffset: u32,
//     pub uAssocReqSize: u32,
//     pub uAssocRespOffset: u32,
//     pub uAssocRespSize: u32,
//     pub uBeaconOffset: u32,
//     pub uBeaconSize: u32,
//     pub uIHVDataOffset: u32,
//     pub uIHVDataSize: u32,
//     pub AuthAlgo: DOT11_AUTH_ALGORITHM,
//     pub UnicastCipher: DOT11_CIPHER_ALGORITHM,
//     pub MulticastCipher: DOT11_CIPHER_ALGORITHM,
//     pub uActivePhyListOffset: u32,
//     pub uActivePhyListSize: u32,
//     pub bFourAddressSupported: bool,
//     pub bPortAuthorized: bool,
//     pub ucActiveQoSProtocol: u8,
//     pub DSInfo: DOT11_DS_INFO,
//     pub uEncapTableOffset: u32,
//     pub uEncapTableSize: u32,
//     pub MulticastMgmtCipher: DOT11_CIPHER_ALGORITHM,
//     pub uAssocComebackTime: u32,
// }

// UNSUPPORTED Rust 519:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_ASSOCIATION_COMPLETION_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_ASSOCIATION_COMPLETION_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `DOT11_ASSOCIATION_COMPLETION_PARAMETERS_REVISION_2`: UInt = 2u;
// UNSUPPORTED Rust 527:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11_ASSOCIATION_INFO_EX {
//     pub PeerMacAddress: [u8; 6],
//     pub BSSID: [u8; 6],
//     pub usCapabilityInformation: u16,
//     pub usListenInterval: u16,
//     pub ucPeerSupportedRates: [u8; 255],
//     pub usAssociationID: u16,
//     pub dot11AssociationState: DOT11_ASSOCIATION_STATE,
//     pub dot11PowerMode: DOT11_POWER_MODE,
//     pub liAssociationUpTime: i64,
//     pub ullNumOfTxPacketSuccesses: u64,
//     pub ullNumOfTxPacketFailures: u64,
//     pub ullNumOfRxPacketSuccesses: u64,
//     pub ullNumOfRxPacketFailures: u64,
// }

// UNSUPPORTED Rust 544:1: declaration Impl has no candidate rule
// impl Default for DOT11_ASSOCIATION_INFO_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 549:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct DOT11_ASSOCIATION_INFO_LIST {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub uNumOfEntries: u32,
//     pub uTotalNumOfEntries: u32,
//     pub dot11AssocInfo: [DOT11_ASSOCIATION_INFO_EX; 1],
// }

// UNSUPPORTED Rust 558:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_ASSOCIATION_INFO_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_ASSOCIATION_INFO_LIST_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 565:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct DOT11_ASSOCIATION_PARAMS {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub BSSID: [u8; 6],
//     pub uAssocRequestIEsOffset: u32,
//     pub uAssocRequestIEsLength: u32,
// }

// UNSUPPORTED Rust 574:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_ASSOCIATION_PARAMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_ASSOCIATION_PARAMS_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 581:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct DOT11_ASSOCIATION_START_PARAMETERS {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub MacAddr: [u8; 6],
//     pub SSID: DOT11_SSID,
//     pub uIHVDataOffset: u32,
//     pub uIHVDataSize: u32,
// }

// UNSUPPORTED Rust 591:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_ASSOCIATION_START_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_ASSOCIATION_START_PARAMETERS_REVISION_1`: UInt = 1u;
public typealias `DOT11_ASSOCIATION_STATE` = Int;
public const val `DOT11_ASSOC_ERROR_SOURCE_OS`: UInt = 0u;
public const val `DOT11_ASSOC_ERROR_SOURCE_OTHER`: UInt = 255u;
public const val `DOT11_ASSOC_ERROR_SOURCE_REMOTE`: UInt = 1u;
public const val `DOT11_ASSOC_STATUS_SUCCESS`: UInt = 0u;
public typealias `DOT11_AUTH_ALGORITHM` = Int;
// UNSUPPORTED Rust 604:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct DOT11_AUTH_ALGORITHM_LIST {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub uNumOfEntries: u32,
//     pub uTotalNumOfEntries: u32,
//     pub AlgorithmIds: [DOT11_AUTH_ALGORITHM; 1],
// }

// UNSUPPORTED Rust 613:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_AUTH_ALGORITHM_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_AUTH_ALGORITHM_LIST_REVISION_1`: UInt = 1u;
public const val `DOT11_AUTH_ALGO_80211_OPEN`: `DOT11_AUTH_ALGORITHM` = 1;
public const val `DOT11_AUTH_ALGO_80211_SHARED_KEY`: `DOT11_AUTH_ALGORITHM` = 2;
public const val `DOT11_AUTH_ALGO_IHV_END`: `DOT11_AUTH_ALGORITHM` = -1;
public const val `DOT11_AUTH_ALGO_IHV_START`: `DOT11_AUTH_ALGORITHM` = -2147483648;
public const val `DOT11_AUTH_ALGO_MICHAEL`: UInt = 1u;
public const val `DOT11_AUTH_ALGO_OWE`: `DOT11_AUTH_ALGORITHM` = 10;
public const val `DOT11_AUTH_ALGO_RSNA`: `DOT11_AUTH_ALGORITHM` = 6;
public const val `DOT11_AUTH_ALGO_RSNA_PSK`: `DOT11_AUTH_ALGORITHM` = 7;
public const val `DOT11_AUTH_ALGO_WPA`: `DOT11_AUTH_ALGORITHM` = 3;
public const val `DOT11_AUTH_ALGO_WPA3`: `DOT11_AUTH_ALGORITHM` = 8;
public const val `DOT11_AUTH_ALGO_WPA3_ENT`: `DOT11_AUTH_ALGORITHM` = 11;
public const val `DOT11_AUTH_ALGO_WPA3_ENT_192`: `DOT11_AUTH_ALGORITHM` = 8;
public const val `DOT11_AUTH_ALGO_WPA3_SAE`: `DOT11_AUTH_ALGORITHM` = 9;
public const val `DOT11_AUTH_ALGO_WPA_NONE`: `DOT11_AUTH_ALGORITHM` = 5;
public const val `DOT11_AUTH_ALGO_WPA_PSK`: `DOT11_AUTH_ALGORITHM` = 4;
// UNSUPPORTED Rust 635:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_AUTH_CIPHER_PAIR {
//     pub AuthAlgoId: DOT11_AUTH_ALGORITHM,
//     pub CipherAlgoId: DOT11_CIPHER_ALGORITHM,
// }

// UNSUPPORTED Rust 641:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct DOT11_AUTH_CIPHER_PAIR_LIST {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub uNumOfEntries: u32,
//     pub uTotalNumOfEntries: u32,
//     pub AuthCipherPairs: [DOT11_AUTH_CIPHER_PAIR; 1],
// }

// UNSUPPORTED Rust 650:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_AUTH_CIPHER_PAIR_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_AUTH_CIPHER_PAIR_LIST_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 657:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct DOT11_AVAILABLE_CHANNEL_LIST {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub uNumOfEntries: u32,
//     pub uTotalNumOfEntries: u32,
//     pub uChannelNumber: [u32; 1],
// }

// UNSUPPORTED Rust 666:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_AVAILABLE_CHANNEL_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_AVAILABLE_CHANNEL_LIST_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 673:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct DOT11_AVAILABLE_FREQUENCY_LIST {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub uNumOfEntries: u32,
//     pub uTotalNumOfEntries: u32,
//     pub uFrequencyValue: [u32; 1],
// }

// UNSUPPORTED Rust 682:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_AVAILABLE_FREQUENCY_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_AVAILABLE_FREQUENCY_LIST_REVISION_1`: UInt = 1u;
public typealias `DOT11_BAND` = Int;
// UNSUPPORTED Rust 690:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11_BSSID_CANDIDATE {
//     pub BSSID: [u8; 6],
//     pub uFlags: u32,
// }

// UNSUPPORTED Rust 696:1: declaration Impl has no candidate rule
// impl Default for DOT11_BSSID_CANDIDATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 701:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct DOT11_BSSID_LIST {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub uNumOfEntries: u32,
//     pub uTotalNumOfEntries: u32,
//     pub BSSIDs: [u8; 6],
// }

// UNSUPPORTED Rust 710:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_BSSID_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_BSSID_LIST_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 717:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11_BSS_DESCRIPTION {
//     pub uReserved: u32,
//     pub dot11BSSID: [u8; 6],
//     pub dot11BSSType: DOT11_BSS_TYPE,
//     pub usBeaconPeriod: u16,
//     pub ullTimestamp: u64,
//     pub usCapabilityInformation: u16,
//     pub uBufferLength: u32,
//     pub ucBuffer: [u8; 1],
// }

// UNSUPPORTED Rust 729:1: declaration Impl has no candidate rule
// impl Default for DOT11_BSS_DESCRIPTION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 734:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11_BSS_ENTRY {
//     pub uPhyId: u32,
//     pub PhySpecificInfo: DOT11_BSS_ENTRY_PHY_SPECIFIC_INFO,
//     pub dot11BSSID: [u8; 6],
//     pub dot11BSSType: DOT11_BSS_TYPE,
//     pub lRSSI: i32,
//     pub uLinkQuality: u32,
//     pub bInRegDomain: bool,
//     pub usBeaconPeriod: u16,
//     pub ullTimestamp: u64,
//     pub ullHostTimestamp: u64,
//     pub usCapabilityInformation: u16,
//     pub uBufferLength: u32,
//     pub ucBuffer: [u8; 1],
// }

// UNSUPPORTED Rust 751:1: declaration Impl has no candidate rule
// impl Default for DOT11_BSS_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_BSS_ENTRY_BYTE_ARRAY_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 757:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DOT11_BSS_ENTRY_PHY_SPECIFIC_INFO {
//     pub uChCenterFrequency: u32,
//     pub FHSS: DOT11_BSS_ENTRY_PHY_SPECIFIC_INFO_0,
// }

// UNSUPPORTED Rust 763:1: declaration Impl has no candidate rule
// impl Default for DOT11_BSS_ENTRY_PHY_SPECIFIC_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 768:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_BSS_ENTRY_PHY_SPECIFIC_INFO_0 {
//     pub uHopPattern: u32,
//     pub uHopSet: u32,
//     pub uDwellTime: u32,
// }

// UNSUPPORTED Rust 775:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11_BSS_LIST {
//     pub uNumOfBytes: u32,
//     pub pucBuffer: *mut u8,
// }

// UNSUPPORTED Rust 781:1: declaration Impl has no candidate rule
// impl Default for DOT11_BSS_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DOT11_BSS_TYPE` = Int;
// UNSUPPORTED Rust 787:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct DOT11_BYTE_ARRAY {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub uNumOfBytes: u32,
//     pub uTotalNumOfBytes: u32,
//     pub ucBuffer: [u8; 1],
// }

// UNSUPPORTED Rust 796:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_BYTE_ARRAY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 802:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_CAN_SUSTAIN_AP_PARAMETERS {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub ulReason: u32,
// }

public const val `DOT11_CAN_SUSTAIN_AP_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `DOT11_CAN_SUSTAIN_AP_REASON_IHV_END`: UInt = 4294967295u;
public const val `DOT11_CAN_SUSTAIN_AP_REASON_IHV_START`: UInt = 4278190080u;
public const val `DOT11_CAPABILITY_CHANNEL_AGILITY`: UInt = 128u;
public const val `DOT11_CAPABILITY_DSSSOFDM`: UInt = 8192u;
public const val `DOT11_CAPABILITY_INFO_CF_POLLABLE`: UInt = 4u;
public const val `DOT11_CAPABILITY_INFO_CF_POLL_REQ`: UInt = 8u;
public const val `DOT11_CAPABILITY_INFO_ESS`: UInt = 1u;
public const val `DOT11_CAPABILITY_INFO_IBSS`: UInt = 2u;
public const val `DOT11_CAPABILITY_INFO_PRIVACY`: UInt = 16u;
public const val `DOT11_CAPABILITY_PBCC`: UInt = 64u;
public const val `DOT11_CAPABILITY_SHORT_PREAMBLE`: UInt = 32u;
public const val `DOT11_CAPABILITY_SHORT_SLOT_TIME`: UInt = 1024u;
public const val `DOT11_CCA_MODE_CS_ONLY`: UInt = 2u;
public const val `DOT11_CCA_MODE_CS_WITH_TIMER`: UInt = 8u;
public const val `DOT11_CCA_MODE_ED_ONLY`: UInt = 1u;
public const val `DOT11_CCA_MODE_ED_and_CS`: UInt = 4u;
public const val `DOT11_CCA_MODE_HRCS_AND_ED`: UInt = 16u;
// UNSUPPORTED Rust 827:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_CHANNEL_HINT {
//     pub Dot11PhyType: DOT11_PHY_TYPE,
//     pub uChannelNumber: u32,
// }

public typealias `DOT11_CIPHER_ALGORITHM` = Int;
// UNSUPPORTED Rust 834:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct DOT11_CIPHER_ALGORITHM_LIST {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub uNumOfEntries: u32,
//     pub uTotalNumOfEntries: u32,
//     pub AlgorithmIds: [DOT11_CIPHER_ALGORITHM; 1],
// }

// UNSUPPORTED Rust 843:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_CIPHER_ALGORITHM_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_CIPHER_ALGORITHM_LIST_REVISION_1`: UInt = 1u;
public const val `DOT11_CIPHER_ALGO_BIP`: `DOT11_CIPHER_ALGORITHM` = 6;
public const val `DOT11_CIPHER_ALGO_BIP_CMAC_256`: `DOT11_CIPHER_ALGORITHM` = 13;
public const val `DOT11_CIPHER_ALGO_BIP_GMAC_128`: `DOT11_CIPHER_ALGORITHM` = 11;
public const val `DOT11_CIPHER_ALGO_BIP_GMAC_256`: `DOT11_CIPHER_ALGORITHM` = 12;
public const val `DOT11_CIPHER_ALGO_CCMP`: `DOT11_CIPHER_ALGORITHM` = 4;
public const val `DOT11_CIPHER_ALGO_CCMP_256`: `DOT11_CIPHER_ALGORITHM` = 10;
public const val `DOT11_CIPHER_ALGO_GCMP`: `DOT11_CIPHER_ALGORITHM` = 8;
public const val `DOT11_CIPHER_ALGO_GCMP_256`: `DOT11_CIPHER_ALGORITHM` = 9;
public const val `DOT11_CIPHER_ALGO_IHV_END`: `DOT11_CIPHER_ALGORITHM` = -1;
public const val `DOT11_CIPHER_ALGO_IHV_START`: `DOT11_CIPHER_ALGORITHM` = -2147483648;
public const val `DOT11_CIPHER_ALGO_NONE`: `DOT11_CIPHER_ALGORITHM` = 0;
public const val `DOT11_CIPHER_ALGO_RSN_USE_GROUP`: `DOT11_CIPHER_ALGORITHM` = 256;
public const val `DOT11_CIPHER_ALGO_TKIP`: `DOT11_CIPHER_ALGORITHM` = 2;
public const val `DOT11_CIPHER_ALGO_WEP`: `DOT11_CIPHER_ALGORITHM` = 257;
public const val `DOT11_CIPHER_ALGO_WEP104`: `DOT11_CIPHER_ALGORITHM` = 5;
public const val `DOT11_CIPHER_ALGO_WEP40`: `DOT11_CIPHER_ALGORITHM` = 1;
public const val `DOT11_CIPHER_ALGO_WPA_USE_GROUP`: `DOT11_CIPHER_ALGORITHM` = 256;
// UNSUPPORTED Rust 867:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct DOT11_CIPHER_DEFAULT_KEY_VALUE {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub uKeyIndex: u32,
//     pub AlgorithmId: DOT11_CIPHER_ALGORITHM,
//     pub MacAddr: [u8; 6],
//     pub bDelete: bool,
//     pub bStatic: bool,
//     pub usKeyLength: u16,
//     pub ucKey: [u8; 1],
// }

// UNSUPPORTED Rust 880:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_CIPHER_DEFAULT_KEY_VALUE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_CIPHER_DEFAULT_KEY_VALUE_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 887:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11_CIPHER_KEY_MAPPING_KEY_VALUE {
//     pub PeerMacAddr: [u8; 6],
//     pub AlgorithmId: DOT11_CIPHER_ALGORITHM,
//     pub Direction: DOT11_DIRECTION,
//     pub bDelete: bool,
//     pub bStatic: bool,
//     pub usKeyLength: u16,
//     pub ucKey: [u8; 1],
// }

// UNSUPPORTED Rust 898:1: declaration Impl has no candidate rule
// impl Default for DOT11_CIPHER_KEY_MAPPING_KEY_VALUE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_CIPHER_KEY_MAPPING_KEY_VALUE_BYTE_ARRAY_REVISION_1`: UInt = 1u;
public const val `DOT11_CONF_ALGO_TKIP`: UInt = 2u;
public const val `DOT11_CONF_ALGO_WEP_RC4`: UInt = 1u;
// UNSUPPORTED Rust 906:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_CONNECTION_COMPLETION_PARAMETERS {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub uStatus: u32,
// }

public const val `DOT11_CONNECTION_COMPLETION_PARAMETERS_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 914:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct DOT11_CONNECTION_START_PARAMETERS {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub BSSType: DOT11_BSS_TYPE,
//     pub AdhocBSSID: [u8; 6],
//     pub AdhocSSID: DOT11_SSID,
// }

// UNSUPPORTED Rust 923:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_CONNECTION_START_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_CONNECTION_START_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `DOT11_CONNECTION_STATUS_SUCCESS`: UInt = 0u;
// UNSUPPORTED Rust 931:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_COUNTERS_ENTRY {
//     pub uTransmittedFragmentCount: u32,
//     pub uMulticastTransmittedFrameCount: u32,
//     pub uFailedCount: u32,
//     pub uRetryCount: u32,
//     pub uMultipleRetryCount: u32,
//     pub uFrameDuplicateCount: u32,
//     pub uRTSSuccessCount: u32,
//     pub uRTSFailureCount: u32,
//     pub uACKFailureCount: u32,
//     pub uReceivedFragmentCount: u32,
//     pub uMulticastReceivedFrameCount: u32,
//     pub uFCSErrorCount: u32,
//     pub uTransmittedFrameCount: u32,
// }

// UNSUPPORTED Rust 948:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct DOT11_COUNTRY_OR_REGION_STRING_LIST {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub uNumOfEntries: u32,
//     pub uTotalNumOfEntries: u32,
//     pub CountryOrRegionStrings: [u8; 3],
// }

// UNSUPPORTED Rust 957:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_COUNTRY_OR_REGION_STRING_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_COUNTRY_OR_REGION_STRING_LIST_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 964:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_CURRENT_OFFLOAD_CAPABILITY {
//     pub uReserved: u32,
//     pub uFlags: u32,
// }

// UNSUPPORTED Rust 970:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_CURRENT_OPERATION_MODE {
//     pub uReserved: u32,
//     pub uCurrentOpMode: u32,
// }

// UNSUPPORTED Rust 976:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_CURRENT_OPTIONAL_CAPABILITY {
//     pub uReserved: u32,
//     pub bDot11CFPollable: bool,
//     pub bDot11PCF: bool,
//     pub bDot11PCFMPDUTransferToPC: bool,
//     pub bStrictlyOrderedServiceClass: bool,
// }

// UNSUPPORTED Rust 985:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_DATA_RATE_MAPPING_ENTRY {
//     pub ucDataRateIndex: u8,
//     pub ucDataRateFlag: u8,
//     pub usDataRateValue: u16,
// }

// UNSUPPORTED Rust 992:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct DOT11_DATA_RATE_MAPPING_TABLE {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub uDataRateMappingLength: u32,
//     pub DataRateMappingEntries: [DOT11_DATA_RATE_MAPPING_ENTRY; 126],
// }

// UNSUPPORTED Rust 1000:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_DATA_RATE_MAPPING_TABLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_DATA_RATE_MAPPING_TABLE_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 1007:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11_DEFAULT_WEP_OFFLOAD {
//     pub uReserved: u32,
//     pub hOffloadContext: super::super::Foundation::HANDLE,
//     pub hOffload: super::super::Foundation::HANDLE,
//     pub dwIndex: u32,
//     pub dot11OffloadType: DOT11_OFFLOAD_TYPE,
//     pub dwAlgorithm: u32,
//     pub uFlags: u32,
//     pub dot11KeyDirection: DOT11_KEY_DIRECTION,
//     pub ucMacAddress: [u8; 6],
//     pub uNumOfRWsOnMe: u32,
//     pub dot11IV48Counters: [DOT11_IV48_COUNTER; 16],
//     pub usDot11RWBitMaps: [u16; 16],
//     pub usKeyLength: u16,
//     pub ucKey: [u8; 1],
// }

// UNSUPPORTED Rust 1025:1: declaration Impl has no candidate rule
// impl Default for DOT11_DEFAULT_WEP_OFFLOAD {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1030:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11_DEFAULT_WEP_UPLOAD {
//     pub uReserved: u32,
//     pub dot11OffloadType: DOT11_OFFLOAD_TYPE,
//     pub hOffload: super::super::Foundation::HANDLE,
//     pub uNumOfRWsUsed: u32,
//     pub dot11IV48Counters: [DOT11_IV48_COUNTER; 16],
//     pub usDot11RWBitMaps: [u16; 16],
// }

// UNSUPPORTED Rust 1040:1: declaration Impl has no candidate rule
// impl Default for DOT11_DEFAULT_WEP_UPLOAD {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_DEVICE_ENTRY_BYTE_ARRAY_REVISION_1`: UInt = 1u;
public typealias `DOT11_DIRECTION` = Int;
public const val `DOT11_DIR_BOTH`: `DOT11_DIRECTION` = 3;
public const val `DOT11_DIR_INBOUND`: `DOT11_DIRECTION` = 1;
public const val `DOT11_DIR_OUTBOUND`: `DOT11_DIRECTION` = 2;
// UNSUPPORTED Rust 1050:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct DOT11_DISASSOCIATE_PEER_REQUEST {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub PeerMacAddr: [u8; 6],
//     pub usReason: u16,
// }

// UNSUPPORTED Rust 1058:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_DISASSOCIATE_PEER_REQUEST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_DISASSOCIATE_PEER_REQUEST_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 1065:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct DOT11_DISASSOCIATION_PARAMETERS {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub MacAddr: [u8; 6],
//     pub uReason: u32,
//     pub uIHVDataOffset: u32,
//     pub uIHVDataSize: u32,
// }

// UNSUPPORTED Rust 1075:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_DISASSOCIATION_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_DISASSOCIATION_PARAMETERS_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 1082:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_DIVERSITY_SELECTION_RX {
//     pub uAntennaListIndex: u32,
//     pub bDiversitySelectionRX: bool,
// }

// UNSUPPORTED Rust 1088:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11_DIVERSITY_SELECTION_RX_LIST {
//     pub uNumOfEntries: u32,
//     pub uTotalNumOfEntries: u32,
//     pub dot11DiversitySelectionRx: [DOT11_DIVERSITY_SELECTION_RX; 1],
// }

// UNSUPPORTED Rust 1095:1: declaration Impl has no candidate rule
// impl Default for DOT11_DIVERSITY_SELECTION_RX_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DOT11_DIVERSITY_SUPPORT` = Int;
public const val `DOT11_DS_CHANGED`: `DOT11_DS_INFO` = 0;
public typealias `DOT11_DS_INFO` = Int;
public const val `DOT11_DS_UNCHANGED`: `DOT11_DS_INFO` = 1;
public const val `DOT11_DS_UNKNOWN`: `DOT11_DS_INFO` = 2;
// UNSUPPORTED Rust 1105:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_ExtensibleAuthenticationProtocol")]
// #[derive(Clone, Copy)]
// pub struct DOT11_EAP_RESULT {
//     pub dwFailureReasonCode: u32,
//     pub pAttribArray: *mut super::super::Security::ExtensibleAuthenticationProtocol::EAP_ATTRIBUTES,
// }

// UNSUPPORTED Rust 1112:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security_ExtensibleAuthenticationProtocol")]
// impl Default for DOT11_EAP_RESULT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_ENCAP_802_1H`: UInt = 2u;
// UNSUPPORTED Rust 1119:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_ENCAP_ENTRY {
//     pub usEtherType: u16,
//     pub usEncapType: u16,
// }

public const val `DOT11_ENCAP_RFC_1042`: UInt = 1u;
// UNSUPPORTED Rust 1126:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_ERP_PHY_ATTRIBUTES {
//     pub HRDSSSAttributes: DOT11_HRDSSS_PHY_ATTRIBUTES,
//     pub bERPPBCCOptionImplemented: bool,
//     pub bDSSSOFDMOptionImplemented: bool,
//     pub bShortSlotTimeOptionImplemented: bool,
// }

public const val `DOT11_EXEMPT_ALWAYS`: UInt = 1u;
public const val `DOT11_EXEMPT_BOTH`: UInt = 3u;
public const val `DOT11_EXEMPT_MULTICAST`: UInt = 2u;
public const val `DOT11_EXEMPT_NO_EXEMPTION`: UInt = 0u;
public const val `DOT11_EXEMPT_ON_KEY_MAPPING_KEY_UNAVAILABLE`: UInt = 2u;
public const val `DOT11_EXEMPT_UNICAST`: UInt = 1u;
// UNSUPPORTED Rust 1140:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct DOT11_EXTAP_ATTRIBUTES {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub uScanSSIDListSize: u32,
//     pub uDesiredSSIDListSize: u32,
//     pub uPrivacyExemptionListSize: u32,
//     pub uAssociationTableSize: u32,
//     pub uDefaultKeyTableSize: u32,
//     pub uWEPKeyValueMaxLength: u32,
//     pub bStrictlyOrderedServiceClassImplemented: bool,
//     pub uNumSupportedCountryOrRegionStrings: u32,
//     pub pSupportedCountryOrRegionStrings: *mut u8,
//     pub uInfraNumSupportedUcastAlgoPairs: u32,
//     pub pInfraSupportedUcastAlgoPairs: *mut DOT11_AUTH_CIPHER_PAIR,
//     pub uInfraNumSupportedMcastAlgoPairs: u32,
//     pub pInfraSupportedMcastAlgoPairs: *mut DOT11_AUTH_CIPHER_PAIR,
// }

// UNSUPPORTED Rust 1159:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_EXTAP_ATTRIBUTES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_EXTAP_ATTRIBUTES_REVISION_1`: UInt = 1u;
public const val `DOT11_EXTAP_RECV_CONTEXT_REVISION_1`: UInt = 1u;
public const val `DOT11_EXTAP_SEND_CONTEXT_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 1168:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct DOT11_EXTSTA_ATTRIBUTES {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub uScanSSIDListSize: u32,
//     pub uDesiredBSSIDListSize: u32,
//     pub uDesiredSSIDListSize: u32,
//     pub uExcludedMacAddressListSize: u32,
//     pub uPrivacyExemptionListSize: u32,
//     pub uKeyMappingTableSize: u32,
//     pub uDefaultKeyTableSize: u32,
//     pub uWEPKeyValueMaxLength: u32,
//     pub uPMKIDCacheSize: u32,
//     pub uMaxNumPerSTADefaultKeyTables: u32,
//     pub bStrictlyOrderedServiceClassImplemented: bool,
//     pub ucSupportedQoSProtocolFlags: u8,
//     pub bSafeModeImplemented: bool,
//     pub uNumSupportedCountryOrRegionStrings: u32,
//     pub pSupportedCountryOrRegionStrings: *mut u8,
//     pub uInfraNumSupportedUcastAlgoPairs: u32,
//     pub pInfraSupportedUcastAlgoPairs: *mut DOT11_AUTH_CIPHER_PAIR,
//     pub uInfraNumSupportedMcastAlgoPairs: u32,
//     pub pInfraSupportedMcastAlgoPairs: *mut DOT11_AUTH_CIPHER_PAIR,
//     pub uAdhocNumSupportedUcastAlgoPairs: u32,
//     pub pAdhocSupportedUcastAlgoPairs: *mut DOT11_AUTH_CIPHER_PAIR,
//     pub uAdhocNumSupportedMcastAlgoPairs: u32,
//     pub pAdhocSupportedMcastAlgoPairs: *mut DOT11_AUTH_CIPHER_PAIR,
//     pub bAutoPowerSaveMode: bool,
//     pub uMaxNetworkOffloadListSize: u32,
//     pub bMFPCapable: bool,
//     pub uInfraNumSupportedMcastMgmtAlgoPairs: u32,
//     pub pInfraSupportedMcastMgmtAlgoPairs: *mut DOT11_AUTH_CIPHER_PAIR,
//     pub bNeighborReportSupported: bool,
//     pub bAPChannelReportSupported: bool,
//     pub bActionFramesSupported: bool,
//     pub bANQPQueryOffloadSupported: bool,
//     pub bHESSIDConnectionSupported: bool,
// }

// UNSUPPORTED Rust 1207:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_EXTSTA_ATTRIBUTES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_EXTSTA_ATTRIBUTES_REVISION_1`: UInt = 1u;
public const val `DOT11_EXTSTA_ATTRIBUTES_REVISION_2`: UInt = 2u;
public const val `DOT11_EXTSTA_ATTRIBUTES_REVISION_3`: UInt = 3u;
public const val `DOT11_EXTSTA_ATTRIBUTES_REVISION_4`: UInt = 4u;
public const val `DOT11_EXTSTA_ATTRIBUTES_SAFEMODE_CERTIFIED`: UInt = 2u;
public const val `DOT11_EXTSTA_ATTRIBUTES_SAFEMODE_OID_SUPPORTED`: UInt = 1u;
public const val `DOT11_EXTSTA_ATTRIBUTES_SAFEMODE_RESERVED`: UInt = 12u;
// UNSUPPORTED Rust 1220:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_EXTSTA_CAPABILITY {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub uScanSSIDListSize: u32,
//     pub uDesiredBSSIDListSize: u32,
//     pub uDesiredSSIDListSize: u32,
//     pub uExcludedMacAddressListSize: u32,
//     pub uPrivacyExemptionListSize: u32,
//     pub uKeyMappingTableSize: u32,
//     pub uDefaultKeyTableSize: u32,
//     pub uWEPKeyValueMaxLength: u32,
//     pub uPMKIDCacheSize: u32,
//     pub uMaxNumPerSTADefaultKeyTables: u32,
// }

public const val `DOT11_EXTSTA_CAPABILITY_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 1237:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct DOT11_EXTSTA_RECV_CONTEXT {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub uReceiveFlags: u32,
//     pub uPhyId: u32,
//     pub uChCenterFrequency: u32,
//     pub usNumberOfMPDUsReceived: u16,
//     pub lRSSI: i32,
//     pub ucDataRate: u8,
//     pub uSizeMediaSpecificInfo: u32,
//     pub pvMediaSpecificInfo: *mut core::ffi::c_void,
//     pub ullTimestamp: u64,
// }

// UNSUPPORTED Rust 1252:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_EXTSTA_RECV_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_EXTSTA_RECV_CONTEXT_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 1259:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct DOT11_EXTSTA_SEND_CONTEXT {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub usExemptionActionType: u16,
//     pub uPhyId: u32,
//     pub uDelayedSleepValue: u32,
//     pub pvMediaSpecificInfo: *mut core::ffi::c_void,
//     pub uSendFlags: u32,
// }

// UNSUPPORTED Rust 1270:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_EXTSTA_SEND_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_EXTSTA_SEND_CONTEXT_REVISION_1`: UInt = 1u;
public const val `DOT11_FLAGS_80211B_CHANNEL_AGILITY`: UInt = 4u;
public const val `DOT11_FLAGS_80211B_PBCC`: UInt = 2u;
public const val `DOT11_FLAGS_80211B_SHORT_PREAMBLE`: UInt = 1u;
public const val `DOT11_FLAGS_80211G_BARKER_PREAMBLE_MODE`: UInt = 128u;
public const val `DOT11_FLAGS_80211G_DSSS_OFDM`: UInt = 16u;
public const val `DOT11_FLAGS_80211G_NON_ERP_PRESENT`: UInt = 64u;
public const val `DOT11_FLAGS_80211G_USE_PROTECTION`: UInt = 32u;
public const val `DOT11_FLAGS_PS_ON`: UInt = 8u;
// UNSUPPORTED Rust 1285:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_FRAGMENT_DESCRIPTOR {
//     pub uOffset: u32,
//     pub uLength: u32,
// }

public const val `DOT11_FREQUENCY_BANDS_LOWER`: UInt = 1u;
public const val `DOT11_FREQUENCY_BANDS_MIDDLE`: UInt = 2u;
public const val `DOT11_FREQUENCY_BANDS_UPPER`: UInt = 4u;
// UNSUPPORTED Rust 1294:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct DOT11_GO_NEGOTIATION_CONFIRMATION_SEND_COMPLETE_PARAMETERS {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub PeerDeviceAddress: [u8; 6],
//     pub DialogToken: u8,
//     pub Status: i32,
//     pub uIEsOffset: u32,
//     pub uIEsLength: u32,
// }

// UNSUPPORTED Rust 1305:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_GO_NEGOTIATION_CONFIRMATION_SEND_COMPLETE_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_GO_NEGOTIATION_CONFIRMATION_SEND_COMPLETE_PARAMETERS_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 1312:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct DOT11_GO_NEGOTIATION_REQUEST_SEND_COMPLETE_PARAMETERS {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub PeerDeviceAddress: [u8; 6],
//     pub DialogToken: u8,
//     pub Status: i32,
//     pub uIEsOffset: u32,
//     pub uIEsLength: u32,
// }

// UNSUPPORTED Rust 1323:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_GO_NEGOTIATION_REQUEST_SEND_COMPLETE_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_GO_NEGOTIATION_REQUEST_SEND_COMPLETE_PARAMETERS_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 1330:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct DOT11_GO_NEGOTIATION_RESPONSE_SEND_COMPLETE_PARAMETERS {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub PeerDeviceAddress: [u8; 6],
//     pub DialogToken: u8,
//     pub Status: i32,
//     pub uIEsOffset: u32,
//     pub uIEsLength: u32,
// }

// UNSUPPORTED Rust 1341:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_GO_NEGOTIATION_RESPONSE_SEND_COMPLETE_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_GO_NEGOTIATION_RESPONSE_SEND_COMPLETE_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `DOT11_HESSID_LENGTH`: UInt = 6u;
// UNSUPPORTED Rust 1349:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_HOPPING_PATTERN_ENTRY {
//     pub uHoppingPatternIndex: u32,
//     pub uRandomTableFieldNumber: u32,
// }

// UNSUPPORTED Rust 1355:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11_HOPPING_PATTERN_ENTRY_LIST {
//     pub uNumOfEntries: u32,
//     pub uTotalNumOfEntries: u32,
//     pub dot11HoppingPatternEntry: [DOT11_HOPPING_PATTERN_ENTRY; 1],
// }

// UNSUPPORTED Rust 1362:1: declaration Impl has no candidate rule
// impl Default for DOT11_HOPPING_PATTERN_ENTRY_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DOT11_HOP_ALGO_ADOPTED` = Int;
// UNSUPPORTED Rust 1368:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_HRDSSS_PHY_ATTRIBUTES {
//     pub bShortPreambleOptionImplemented: bool,
//     pub bPBCCOptionImplemented: bool,
//     pub bChannelAgilityPresent: bool,
//     pub uHRCCAModeSupported: u32,
// }

public const val `DOT11_HR_CCA_MODE_CS_AND_ED`: UInt = 4u;
public const val `DOT11_HR_CCA_MODE_CS_ONLY`: UInt = 2u;
public const val `DOT11_HR_CCA_MODE_CS_WITH_TIMER`: UInt = 8u;
public const val `DOT11_HR_CCA_MODE_ED_ONLY`: UInt = 1u;
public const val `DOT11_HR_CCA_MODE_HRCS_AND_ED`: UInt = 16u;
public const val `DOT11_HW_DEFRAGMENTATION_SUPPORTED`: UInt = 8u;
public const val `DOT11_HW_FRAGMENTATION_SUPPORTED`: UInt = 4u;
public const val `DOT11_HW_MSDU_AUTH_SUPPORTED_RX`: UInt = 32u;
public const val `DOT11_HW_MSDU_AUTH_SUPPORTED_TX`: UInt = 16u;
public const val `DOT11_HW_WEP_SUPPORTED_RX`: UInt = 2u;
public const val `DOT11_HW_WEP_SUPPORTED_TX`: UInt = 1u;
// UNSUPPORTED Rust 1387:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_IBSS_PARAMS {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub bJoinOnly: bool,
//     pub uIEsOffset: u32,
//     pub uIEsLength: u32,
// }

public const val `DOT11_IBSS_PARAMS_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 1397:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_IHV_VERSION_INFO {
//     pub dwVerMin: u32,
//     pub dwVerMax: u32,
// }

// UNSUPPORTED Rust 1403:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct DOT11_INCOMING_ASSOC_COMPLETION_PARAMETERS {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub PeerMacAddr: [u8; 6],
//     pub uStatus: u32,
//     pub ucErrorSource: u8,
//     pub bReAssocReq: bool,
//     pub bReAssocResp: bool,
//     pub uAssocReqOffset: u32,
//     pub uAssocReqSize: u32,
//     pub uAssocRespOffset: u32,
//     pub uAssocRespSize: u32,
//     pub AuthAlgo: DOT11_AUTH_ALGORITHM,
//     pub UnicastCipher: DOT11_CIPHER_ALGORITHM,
//     pub MulticastCipher: DOT11_CIPHER_ALGORITHM,
//     pub uActivePhyListOffset: u32,
//     pub uActivePhyListSize: u32,
//     pub uBeaconOffset: u32,
//     pub uBeaconSize: u32,
// }

// UNSUPPORTED Rust 1425:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_INCOMING_ASSOC_COMPLETION_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_INCOMING_ASSOC_COMPLETION_PARAMETERS_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 1432:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct DOT11_INCOMING_ASSOC_DECISION {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub PeerMacAddr: [u8; 6],
//     pub bAccept: bool,
//     pub usReasonCode: u16,
//     pub uAssocResponseIEsOffset: u32,
//     pub uAssocResponseIEsLength: u32,
// }

// UNSUPPORTED Rust 1443:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_INCOMING_ASSOC_DECISION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_INCOMING_ASSOC_DECISION_REVISION_1`: UInt = 1u;
public const val `DOT11_INCOMING_ASSOC_DECISION_REVISION_2`: UInt = 2u;
// UNSUPPORTED Rust 1451:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct DOT11_INCOMING_ASSOC_DECISION_V2 {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub PeerMacAddr: [u8; 6],
//     pub bAccept: bool,
//     pub usReasonCode: u16,
//     pub uAssocResponseIEsOffset: u32,
//     pub uAssocResponseIEsLength: u32,
//     pub WFDStatus: u8,
// }

// UNSUPPORTED Rust 1463:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_INCOMING_ASSOC_DECISION_V2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1469:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct DOT11_INCOMING_ASSOC_REQUEST_RECEIVED_PARAMETERS {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub PeerMacAddr: [u8; 6],
//     pub bReAssocReq: bool,
//     pub uAssocReqOffset: u32,
//     pub uAssocReqSize: u32,
// }

// UNSUPPORTED Rust 1479:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_INCOMING_ASSOC_REQUEST_RECEIVED_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_INCOMING_ASSOC_REQUEST_RECEIVED_PARAMETERS_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 1486:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct DOT11_INCOMING_ASSOC_STARTED_PARAMETERS {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub PeerMacAddr: [u8; 6],
// }

// UNSUPPORTED Rust 1493:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_INCOMING_ASSOC_STARTED_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_INCOMING_ASSOC_STARTED_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `DOT11_INVALID_CHANNEL_NUMBER`: UInt = 0u;
// UNSUPPORTED Rust 1501:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct DOT11_INVITATION_REQUEST_SEND_COMPLETE_PARAMETERS {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub PeerDeviceAddress: [u8; 6],
//     pub ReceiverAddress: [u8; 6],
//     pub DialogToken: u8,
//     pub Status: i32,
//     pub uIEsOffset: u32,
//     pub uIEsLength: u32,
// }

// UNSUPPORTED Rust 1513:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_INVITATION_REQUEST_SEND_COMPLETE_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_INVITATION_REQUEST_SEND_COMPLETE_PARAMETERS_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 1520:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct DOT11_INVITATION_RESPONSE_SEND_COMPLETE_PARAMETERS {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub ReceiverDeviceAddress: [u8; 6],
//     pub DialogToken: u8,
//     pub Status: i32,
//     pub uIEsOffset: u32,
//     pub uIEsLength: u32,
// }

// UNSUPPORTED Rust 1531:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_INVITATION_RESPONSE_SEND_COMPLETE_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_INVITATION_RESPONSE_SEND_COMPLETE_PARAMETERS_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 1538:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_IV48_COUNTER {
//     pub uIV32Counter: u32,
//     pub usIV16Counter: u16,
// }

// UNSUPPORTED Rust 1544:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_JOIN_REQUEST {
//     pub uJoinFailureTimeout: u32,
//     pub OperationalRateSet: DOT11_RATE_SET,
//     pub uChCenterFrequency: u32,
//     pub dot11BSSDescription: DOT11_BSS_DESCRIPTION,
// }

// UNSUPPORTED Rust 1552:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11_KEY_ALGO_BIP {
//     pub ucIPN: [u8; 6],
//     pub ulBIPKeyLength: u32,
//     pub ucBIPKey: [u8; 1],
// }

// UNSUPPORTED Rust 1559:1: declaration Impl has no candidate rule
// impl Default for DOT11_KEY_ALGO_BIP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1564:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11_KEY_ALGO_BIP_GMAC_256 {
//     pub ucIPN: [u8; 6],
//     pub ulBIPGmac256KeyLength: u32,
//     pub ucBIPGmac256Key: [u8; 1],
// }

// UNSUPPORTED Rust 1571:1: declaration Impl has no candidate rule
// impl Default for DOT11_KEY_ALGO_BIP_GMAC_256 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1576:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11_KEY_ALGO_CCMP {
//     pub ucIV48Counter: [u8; 6],
//     pub ulCCMPKeyLength: u32,
//     pub ucCCMPKey: [u8; 1],
// }

// UNSUPPORTED Rust 1583:1: declaration Impl has no candidate rule
// impl Default for DOT11_KEY_ALGO_CCMP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1588:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11_KEY_ALGO_GCMP {
//     pub ucIV48Counter: [u8; 6],
//     pub ulGCMPKeyLength: u32,
//     pub ucGCMPKey: [u8; 1],
// }

// UNSUPPORTED Rust 1595:1: declaration Impl has no candidate rule
// impl Default for DOT11_KEY_ALGO_GCMP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1600:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11_KEY_ALGO_GCMP_256 {
//     pub ucIV48Counter: [u8; 6],
//     pub ulGCMP256KeyLength: u32,
//     pub ucGCMP256Key: [u8; 1],
// }

// UNSUPPORTED Rust 1607:1: declaration Impl has no candidate rule
// impl Default for DOT11_KEY_ALGO_GCMP_256 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1612:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11_KEY_ALGO_TKIP_MIC {
//     pub ucIV48Counter: [u8; 6],
//     pub ulTKIPKeyLength: u32,
//     pub ulMICKeyLength: u32,
//     pub ucTKIPMICKeys: [u8; 1],
// }

// UNSUPPORTED Rust 1620:1: declaration Impl has no candidate rule
// impl Default for DOT11_KEY_ALGO_TKIP_MIC {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DOT11_KEY_DIRECTION` = Int;
// UNSUPPORTED Rust 1626:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11_LINK_QUALITY_ENTRY {
//     pub PeerMacAddr: [u8; 6],
//     pub ucLinkQuality: u8,
// }

// UNSUPPORTED Rust 1632:1: declaration Impl has no candidate rule
// impl Default for DOT11_LINK_QUALITY_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1637:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_LINK_QUALITY_PARAMETERS {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub uLinkQualityListSize: u32,
//     pub uLinkQualityListOffset: u32,
// }

public const val `DOT11_LINK_QUALITY_PARAMETERS_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 1646:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct DOT11_MAC_ADDRESS_LIST {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub uNumOfEntries: u32,
//     pub uTotalNumOfEntries: u32,
//     pub MacAddrs: [u8; 6],
// }

// UNSUPPORTED Rust 1655:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_MAC_ADDRESS_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_MAC_ADDRESS_LIST_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 1662:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_MAC_FRAME_STATISTICS {
//     pub ullTransmittedFrameCount: u64,
//     pub ullReceivedFrameCount: u64,
//     pub ullTransmittedFailureFrameCount: u64,
//     pub ullReceivedFailureFrameCount: u64,
//     pub ullWEPExcludedCount: u64,
//     pub ullTKIPLocalMICFailures: u64,
//     pub ullTKIPReplays: u64,
//     pub ullTKIPICVErrorCount: u64,
//     pub ullCCMPReplays: u64,
//     pub ullCCMPDecryptErrors: u64,
//     pub ullWEPUndecryptableCount: u64,
//     pub ullWEPICVErrorCount: u64,
//     pub ullDecryptSuccessCount: u64,
//     pub ullDecryptFailureCount: u64,
// }

// UNSUPPORTED Rust 1680:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11_MAC_INFO {
//     pub uReserved: u32,
//     pub uNdisPortNumber: u32,
//     pub MacAddr: [u8; 6],
// }

// UNSUPPORTED Rust 1687:1: declaration Impl has no candidate rule
// impl Default for DOT11_MAC_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1692:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_MAC_PARAMETERS {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub uOpmodeMask: u32,
// }

public const val `DOT11_MAC_PARAMETERS_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 1700:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct DOT11_MANUFACTURING_CALLBACK_PARAMETERS {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub dot11ManufacturingCallbackType: DOT11_MANUFACTURING_CALLBACK_TYPE,
//     pub uStatus: u32,
//     pub pvContext: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 1709:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_MANUFACTURING_CALLBACK_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_MANUFACTURING_CALLBACK_REVISION_1`: UInt = 1u;
public typealias `DOT11_MANUFACTURING_CALLBACK_TYPE` = Int;
// UNSUPPORTED Rust 1717:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_MANUFACTURING_FUNCTIONAL_TEST_QUERY_ADC {
//     pub Dot11Band: DOT11_BAND,
//     pub uChannel: u32,
//     pub ADCPowerLevel: i32,
// }

// UNSUPPORTED Rust 1724:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_MANUFACTURING_FUNCTIONAL_TEST_RX {
//     pub bEnabled: bool,
//     pub Dot11Band: DOT11_BAND,
//     pub uChannel: u32,
//     pub PowerLevel: i32,
// }

// UNSUPPORTED Rust 1732:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_MANUFACTURING_FUNCTIONAL_TEST_TX {
//     pub bEnable: bool,
//     pub bOpenLoop: bool,
//     pub Dot11Band: DOT11_BAND,
//     pub uChannel: u32,
//     pub uSetPowerLevel: u32,
//     pub ADCPowerLevel: i32,
// }

// UNSUPPORTED Rust 1742:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11_MANUFACTURING_SELF_TEST_QUERY_RESULTS {
//     pub SelfTestType: DOT11_MANUFACTURING_SELF_TEST_TYPE,
//     pub uTestID: u32,
//     pub bResult: bool,
//     pub uPinFailedBitMask: u32,
//     pub pvContext: *mut core::ffi::c_void,
//     pub uBytesWrittenOut: u32,
//     pub ucBufferOut: [u8; 1],
// }

// UNSUPPORTED Rust 1753:1: declaration Impl has no candidate rule
// impl Default for DOT11_MANUFACTURING_SELF_TEST_QUERY_RESULTS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1758:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11_MANUFACTURING_SELF_TEST_SET_PARAMS {
//     pub SelfTestType: DOT11_MANUFACTURING_SELF_TEST_TYPE,
//     pub uTestID: u32,
//     pub uPinBitMask: u32,
//     pub pvContext: *mut core::ffi::c_void,
//     pub uBufferLength: u32,
//     pub ucBufferIn: [u8; 1],
// }

// UNSUPPORTED Rust 1768:1: declaration Impl has no candidate rule
// impl Default for DOT11_MANUFACTURING_SELF_TEST_SET_PARAMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DOT11_MANUFACTURING_SELF_TEST_TYPE` = Int;
public const val `DOT11_MANUFACTURING_SELF_TEST_TYPE_BT_COEXISTENCE`: `DOT11_MANUFACTURING_SELF_TEST_TYPE` = 3;
public const val `DOT11_MANUFACTURING_SELF_TEST_TYPE_INTERFACE`: `DOT11_MANUFACTURING_SELF_TEST_TYPE` = 1;
public const val `DOT11_MANUFACTURING_SELF_TEST_TYPE_RF_INTERFACE`: `DOT11_MANUFACTURING_SELF_TEST_TYPE` = 2;
// UNSUPPORTED Rust 1777:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11_MANUFACTURING_TEST {
//     pub dot11ManufacturingTestType: DOT11_MANUFACTURING_TEST_TYPE,
//     pub uBufferLength: u32,
//     pub ucBuffer: [u8; 1],
// }

// UNSUPPORTED Rust 1784:1: declaration Impl has no candidate rule
// impl Default for DOT11_MANUFACTURING_TEST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1789:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11_MANUFACTURING_TEST_QUERY_DATA {
//     pub uKey: u32,
//     pub uOffset: u32,
//     pub uBufferLength: u32,
//     pub uBytesRead: u32,
//     pub ucBufferOut: [u8; 1],
// }

// UNSUPPORTED Rust 1798:1: declaration Impl has no candidate rule
// impl Default for DOT11_MANUFACTURING_TEST_QUERY_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_MANUFACTURING_TEST_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 1804:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11_MANUFACTURING_TEST_SET_DATA {
//     pub uKey: u32,
//     pub uOffset: u32,
//     pub uBufferLength: u32,
//     pub ucBufferIn: [u8; 1],
// }

// UNSUPPORTED Rust 1812:1: declaration Impl has no candidate rule
// impl Default for DOT11_MANUFACTURING_TEST_SET_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1817:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11_MANUFACTURING_TEST_SLEEP {
//     pub uSleepTime: u32,
//     pub pvContext: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 1823:1: declaration Impl has no candidate rule
// impl Default for DOT11_MANUFACTURING_TEST_SLEEP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DOT11_MANUFACTURING_TEST_TYPE` = Int;
public const val `DOT11_MAX_CHANNEL_HINTS`: UInt = 4u;
public const val `DOT11_MAX_NUM_DEFAULT_KEY`: UInt = 4u;
public const val `DOT11_MAX_NUM_DEFAULT_KEY_MFP`: UInt = 6u;
public const val `DOT11_MAX_NUM_OF_FRAGMENTS`: UInt = 16u;
public const val `DOT11_MAX_PDU_SIZE`: UInt = 2346u;
public const val `DOT11_MAX_REQUESTED_SERVICE_INFORMATION_LENGTH`: UInt = 255u;
// UNSUPPORTED Rust 1835:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11_MD_CAPABILITY_ENTRY_LIST {
//     pub uNumOfEntries: u32,
//     pub uTotalNumOfEntries: u32,
//     pub dot11MDCapabilityEntry: [DOT11_MULTI_DOMAIN_CAPABILITY_ENTRY; 1],
// }

// UNSUPPORTED Rust 1842:1: declaration Impl has no candidate rule
// impl Default for DOT11_MD_CAPABILITY_ENTRY_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_MIN_PDU_SIZE`: UInt = 256u;
// UNSUPPORTED Rust 1848:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_MPDU_MAX_LENGTH_INDICATION {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub uPhyId: u32,
//     pub uMPDUMaxLength: u32,
// }

public const val `DOT11_MPDU_MAX_LENGTH_INDICATION_REVISION_1`: UInt = 1u;
public const val `DOT11_MSONEX_FAILURE`: `DOT11_MSONEX_RESULT` = 1;
public const val `DOT11_MSONEX_IN_PROGRESS`: `DOT11_MSONEX_RESULT` = 2;
public typealias `DOT11_MSONEX_RESULT` = Int;
// UNSUPPORTED Rust 1860:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_ExtensibleAuthenticationProtocol")]
// #[derive(Clone, Copy)]
// pub struct DOT11_MSONEX_RESULT_PARAMS {
//     pub Dot11OnexAuthStatus: ONEX_AUTH_STATUS,
//     pub Dot11OneXReasonCode: ONEX_REASON_CODE,
//     pub pbMPPESendKey: *mut u8,
//     pub dwMPPESendKeyLen: u32,
//     pub pbMPPERecvKey: *mut u8,
//     pub dwMPPERecvKeyLen: u32,
//     pub pDot11EapResult: *mut DOT11_EAP_RESULT,
// }

// UNSUPPORTED Rust 1872:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security_ExtensibleAuthenticationProtocol")]
// impl Default for DOT11_MSONEX_RESULT_PARAMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_MSONEX_SUCCESS`: `DOT11_MSONEX_RESULT` = 0;
// UNSUPPORTED Rust 1879:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_ExtensibleAuthenticationProtocol")]
// #[derive(Clone, Copy)]
// pub struct DOT11_MSSECURITY_SETTINGS {
//     pub dot11AuthAlgorithm: DOT11_AUTH_ALGORITHM,
//     pub dot11CipherAlgorithm: DOT11_CIPHER_ALGORITHM,
//     pub fOneXEnabled: windows_sys::core::BOOL,
//     pub eapMethodType: super::super::Security::ExtensibleAuthenticationProtocol::EAP_METHOD_TYPE,
//     pub dwEapConnectionDataLen: u32,
//     pub pEapConnectionData: *mut u8,
// }

// UNSUPPORTED Rust 1890:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security_ExtensibleAuthenticationProtocol")]
// impl Default for DOT11_MSSECURITY_SETTINGS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1896:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_MULTI_DOMAIN_CAPABILITY_ENTRY {
//     pub uMultiDomainCapabilityIndex: u32,
//     pub uFirstChannelNumber: u32,
//     pub uNumberOfChannels: u32,
//     pub lMaximumTransmitPowerLevel: i32,
// }

// UNSUPPORTED Rust 1904:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_NETWORK {
//     pub dot11Ssid: DOT11_SSID,
//     pub dot11BssType: DOT11_BSS_TYPE,
// }

// UNSUPPORTED Rust 1910:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11_NETWORK_LIST {
//     pub dwNumberOfItems: u32,
//     pub dwIndex: u32,
//     pub Network: [DOT11_NETWORK; 1],
// }

// UNSUPPORTED Rust 1917:1: declaration Impl has no candidate rule
// impl Default for DOT11_NETWORK_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1922:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11_NIC_SPECIFIC_EXTENSION {
//     pub uBufferLength: u32,
//     pub uTotalBufferLength: u32,
//     pub ucBuffer: [u8; 1],
// }

// UNSUPPORTED Rust 1929:1: declaration Impl has no candidate rule
// impl Default for DOT11_NIC_SPECIFIC_EXTENSION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_NLO_FLAG_SCAN_AT_SYSTEM_RESUME`: UInt = 4u;
public const val `DOT11_NLO_FLAG_SCAN_ON_AOAC_PLATFORM`: UInt = 2u;
public const val `DOT11_NLO_FLAG_STOP_NLO_INDICATION`: UInt = 1u;
// UNSUPPORTED Rust 1937:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_OFDM_PHY_ATTRIBUTES {
//     pub uFrequencyBandsSupported: u32,
// }

// UNSUPPORTED Rust 1942:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_OFFLOAD_CAPABILITY {
//     pub uReserved: u32,
//     pub uFlags: u32,
//     pub uSupportedWEPAlgorithms: u32,
//     pub uNumOfReplayWindows: u32,
//     pub uMaxWEPKeyMappingLength: u32,
//     pub uSupportedAuthAlgorithms: u32,
//     pub uMaxAuthKeyMappingLength: u32,
// }

// UNSUPPORTED Rust 1953:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11_OFFLOAD_NETWORK {
//     pub Ssid: DOT11_SSID,
//     pub UnicastCipher: DOT11_CIPHER_ALGORITHM,
//     pub AuthAlgo: DOT11_AUTH_ALGORITHM,
//     pub Dot11ChannelHints: [DOT11_CHANNEL_HINT; 4],
// }

// UNSUPPORTED Rust 1961:1: declaration Impl has no candidate rule
// impl Default for DOT11_OFFLOAD_NETWORK {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1966:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct DOT11_OFFLOAD_NETWORK_LIST_INFO {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub ulFlags: u32,
//     pub FastScanPeriod: u32,
//     pub FastScanIterations: u32,
//     pub SlowScanPeriod: u32,
//     pub uNumOfEntries: u32,
//     pub offloadNetworkList: [DOT11_OFFLOAD_NETWORK; 1],
// }

// UNSUPPORTED Rust 1978:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_OFFLOAD_NETWORK_LIST_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_OFFLOAD_NETWORK_LIST_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 1985:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_OFFLOAD_NETWORK_STATUS_PARAMETERS {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub Status: i32,
// }

public const val `DOT11_OFFLOAD_NETWORK_STATUS_PARAMETERS_REVISION_1`: UInt = 1u;
public typealias `DOT11_OFFLOAD_TYPE` = Int;
// UNSUPPORTED Rust 1994:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11_OI {
//     pub OILength: u16,
//     pub OI: [u8; 5],
// }

// UNSUPPORTED Rust 2000:1: declaration Impl has no candidate rule
// impl Default for DOT11_OI {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_OI_MAX_LENGTH`: UInt = 5u;
public const val `DOT11_OI_MIN_LENGTH`: UInt = 3u;
public const val `DOT11_OPERATION_MODE_AP`: UInt = 2u;
// UNSUPPORTED Rust 2008:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_OPERATION_MODE_CAPABILITY {
//     pub uReserved: u32,
//     pub uMajorVersion: u32,
//     pub uMinorVersion: u32,
//     pub uNumOfTXBuffers: u32,
//     pub uNumOfRXBuffers: u32,
//     pub uOpModeCapability: u32,
// }

public const val `DOT11_OPERATION_MODE_EXTENSIBLE_AP`: UInt = 8u;
public const val `DOT11_OPERATION_MODE_EXTENSIBLE_STATION`: UInt = 4u;
public const val `DOT11_OPERATION_MODE_MANUFACTURING`: UInt = 1073741824u;
public const val `DOT11_OPERATION_MODE_NETWORK_MONITOR`: UInt = 2147483648u;
public const val `DOT11_OPERATION_MODE_STATION`: UInt = 1u;
public const val `DOT11_OPERATION_MODE_UNKNOWN`: UInt = 0u;
public const val `DOT11_OPERATION_MODE_WFD_CLIENT`: UInt = 64u;
public const val `DOT11_OPERATION_MODE_WFD_DEVICE`: UInt = 16u;
public const val `DOT11_OPERATION_MODE_WFD_GROUP_OWNER`: UInt = 32u;
// UNSUPPORTED Rust 2027:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_OPTIONAL_CAPABILITY {
//     pub uReserved: u32,
//     pub bDot11PCF: bool,
//     pub bDot11PCFMPDUTransferToPC: bool,
//     pub bStrictlyOrderedServiceClass: bool,
// }

public const val `DOT11_PACKET_TYPE_ALL_MULTICAST_CTRL`: UInt = 4096u;
public const val `DOT11_PACKET_TYPE_ALL_MULTICAST_DATA`: UInt = 16384u;
public const val `DOT11_PACKET_TYPE_ALL_MULTICAST_MGMT`: UInt = 8192u;
public const val `DOT11_PACKET_TYPE_BROADCAST_CTRL`: UInt = 64u;
public const val `DOT11_PACKET_TYPE_BROADCAST_DATA`: UInt = 256u;
public const val `DOT11_PACKET_TYPE_BROADCAST_MGMT`: UInt = 128u;
public const val `DOT11_PACKET_TYPE_DIRECTED_CTRL`: UInt = 1u;
public const val `DOT11_PACKET_TYPE_DIRECTED_DATA`: UInt = 4u;
public const val `DOT11_PACKET_TYPE_DIRECTED_MGMT`: UInt = 2u;
public const val `DOT11_PACKET_TYPE_MULTICAST_CTRL`: UInt = 8u;
public const val `DOT11_PACKET_TYPE_MULTICAST_DATA`: UInt = 32u;
public const val `DOT11_PACKET_TYPE_MULTICAST_MGMT`: UInt = 16u;
public const val `DOT11_PACKET_TYPE_PROMISCUOUS_CTRL`: UInt = 512u;
public const val `DOT11_PACKET_TYPE_PROMISCUOUS_DATA`: UInt = 2048u;
public const val `DOT11_PACKET_TYPE_PROMISCUOUS_MGMT`: UInt = 1024u;
// UNSUPPORTED Rust 2050:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11_PEER_INFO {
//     pub MacAddress: [u8; 6],
//     pub usCapabilityInformation: u16,
//     pub AuthAlgo: DOT11_AUTH_ALGORITHM,
//     pub UnicastCipherAlgo: DOT11_CIPHER_ALGORITHM,
//     pub MulticastCipherAlgo: DOT11_CIPHER_ALGORITHM,
//     pub bWpsEnabled: bool,
//     pub usListenInterval: u16,
//     pub ucSupportedRates: [u8; 255],
//     pub usAssociationID: u16,
//     pub AssociationState: DOT11_ASSOCIATION_STATE,
//     pub PowerMode: DOT11_POWER_MODE,
//     pub liAssociationUpTime: i64,
//     pub Statistics: DOT11_PEER_STATISTICS,
// }

// UNSUPPORTED Rust 2067:1: declaration Impl has no candidate rule
// impl Default for DOT11_PEER_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2072:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct DOT11_PEER_INFO_LIST {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub uNumOfEntries: u32,
//     pub uTotalNumOfEntries: u32,
//     pub PeerInfo: [DOT11_PEER_INFO; 1],
// }

// UNSUPPORTED Rust 2081:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_PEER_INFO_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_PEER_INFO_LIST_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 2088:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_PEER_STATISTICS {
//     pub ullDecryptSuccessCount: u64,
//     pub ullDecryptFailureCount: u64,
//     pub ullTxPacketSuccessCount: u64,
//     pub ullTxPacketFailureCount: u64,
//     pub ullRxPacketSuccessCount: u64,
//     pub ullRxPacketFailureCount: u64,
// }

// UNSUPPORTED Rust 2098:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_PER_MSDU_COUNTERS {
//     pub uTransmittedFragmentCount: u32,
//     pub uRetryCount: u32,
//     pub uRTSSuccessCount: u32,
//     pub uRTSFailureCount: u32,
//     pub uACKFailureCount: u32,
// }

// UNSUPPORTED Rust 2107:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct DOT11_PHY_ATTRIBUTES {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub PhyType: DOT11_PHY_TYPE,
//     pub bHardwarePhyState: bool,
//     pub bSoftwarePhyState: bool,
//     pub bCFPollable: bool,
//     pub uMPDUMaxLength: u32,
//     pub TempType: DOT11_TEMP_TYPE,
//     pub DiversitySupport: DOT11_DIVERSITY_SUPPORT,
//     pub PhySpecificAttributes: DOT11_PHY_ATTRIBUTES_0,
//     pub uNumberSupportedPowerLevels: u32,
//     pub TxPowerLevels: [u32; 8],
//     pub uNumDataRateMappingEntries: u32,
//     pub DataRateMappingEntries: [DOT11_DATA_RATE_MAPPING_ENTRY; 126],
//     pub SupportedDataRatesValue: DOT11_SUPPORTED_DATA_RATES_VALUE_V2,
// }

// UNSUPPORTED Rust 2126:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_PHY_ATTRIBUTES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2132:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub union DOT11_PHY_ATTRIBUTES_0 {
//     pub HRDSSSAttributes: DOT11_HRDSSS_PHY_ATTRIBUTES,
//     pub OFDMAttributes: DOT11_OFDM_PHY_ATTRIBUTES,
//     pub ERPAttributes: DOT11_ERP_PHY_ATTRIBUTES,
// }

// UNSUPPORTED Rust 2140:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_PHY_ATTRIBUTES_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_PHY_ATTRIBUTES_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 2147:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_PHY_FRAME_STATISTICS {
//     pub ullTransmittedFrameCount: u64,
//     pub ullMulticastTransmittedFrameCount: u64,
//     pub ullFailedCount: u64,
//     pub ullRetryCount: u64,
//     pub ullMultipleRetryCount: u64,
//     pub ullMaxTXLifetimeExceededCount: u64,
//     pub ullTransmittedFragmentCount: u64,
//     pub ullRTSSuccessCount: u64,
//     pub ullRTSFailureCount: u64,
//     pub ullACKFailureCount: u64,
//     pub ullReceivedFrameCount: u64,
//     pub ullMulticastReceivedFrameCount: u64,
//     pub ullPromiscuousReceivedFrameCount: u64,
//     pub ullMaxRXLifetimeExceededCount: u64,
//     pub ullFrameDuplicateCount: u64,
//     pub ullReceivedFragmentCount: u64,
//     pub ullPromiscuousReceivedFragmentCount: u64,
//     pub ullFCSErrorCount: u64,
// }

// UNSUPPORTED Rust 2169:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct DOT11_PHY_FREQUENCY_ADOPTED_PARAMETERS {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub ulPhyId: u32,
//     pub Anonymous: DOT11_PHY_FREQUENCY_ADOPTED_PARAMETERS_0,
// }

// UNSUPPORTED Rust 2177:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_PHY_FREQUENCY_ADOPTED_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2183:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub union DOT11_PHY_FREQUENCY_ADOPTED_PARAMETERS_0 {
//     pub ulChannel: u32,
//     pub ulFrequency: u32,
// }

// UNSUPPORTED Rust 2190:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_PHY_FREQUENCY_ADOPTED_PARAMETERS_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_PHY_FREQUENCY_ADOPTED_PARAMETERS_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 2197:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct DOT11_PHY_ID_LIST {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub uNumOfEntries: u32,
//     pub uTotalNumOfEntries: u32,
//     pub dot11PhyId: [u32; 1],
// }

// UNSUPPORTED Rust 2206:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_PHY_ID_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_PHY_ID_LIST_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 2213:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_PHY_STATE_PARAMETERS {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub uPhyId: u32,
//     pub bHardwarePhyState: bool,
//     pub bSoftwarePhyState: bool,
// }

public const val `DOT11_PHY_STATE_PARAMETERS_REVISION_1`: UInt = 1u;
public typealias `DOT11_PHY_TYPE` = Int;
// UNSUPPORTED Rust 2224:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11_PHY_TYPE_INFO {
//     pub dot11PhyType: DOT11_PHY_TYPE,
//     pub bUseParameters: bool,
//     pub uProbeDelay: u32,
//     pub uMinChannelTime: u32,
//     pub uMaxChannelTime: u32,
//     pub ChDescriptionType: CH_DESCRIPTION_TYPE,
//     pub uChannelListSize: u32,
//     pub ucChannelListBuffer: [u8; 1],
// }

// UNSUPPORTED Rust 2236:1: declaration Impl has no candidate rule
// impl Default for DOT11_PHY_TYPE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2241:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct DOT11_PHY_TYPE_LIST {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub uNumOfEntries: u32,
//     pub uTotalNumOfEntries: u32,
//     pub dot11PhyType: [DOT11_PHY_TYPE; 1],
// }

// UNSUPPORTED Rust 2250:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_PHY_TYPE_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_PHY_TYPE_LIST_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 2257:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_PMKID_CANDIDATE_LIST_PARAMETERS {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub uCandidateListSize: u32,
//     pub uCandidateListOffset: u32,
// }

public const val `DOT11_PMKID_CANDIDATE_LIST_PARAMETERS_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 2266:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11_PMKID_ENTRY {
//     pub BSSID: [u8; 6],
//     pub PMKID: [u8; 16],
//     pub uFlags: u32,
// }

// UNSUPPORTED Rust 2273:1: declaration Impl has no candidate rule
// impl Default for DOT11_PMKID_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2278:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct DOT11_PMKID_LIST {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub uNumOfEntries: u32,
//     pub uTotalNumOfEntries: u32,
//     pub PMKIDs: [DOT11_PMKID_ENTRY; 1],
// }

// UNSUPPORTED Rust 2287:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_PMKID_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_PMKID_LIST_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 2294:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11_PORT_STATE {
//     pub PeerMacAddress: [u8; 6],
//     pub uSessionId: u32,
//     pub bPortControlled: windows_sys::core::BOOL,
//     pub bPortAuthorized: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 2302:1: declaration Impl has no candidate rule
// impl Default for DOT11_PORT_STATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2307:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct DOT11_PORT_STATE_NOTIFICATION {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub PeerMac: [u8; 6],
//     pub bOpen: bool,
// }

// UNSUPPORTED Rust 2315:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_PORT_STATE_NOTIFICATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_PORT_STATE_NOTIFICATION_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 2322:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_POWER_MGMT_AUTO_MODE_ENABLED_INFO {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub bEnabled: bool,
// }

public const val `DOT11_POWER_MGMT_AUTO_MODE_ENABLED_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 2330:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_POWER_MGMT_MODE {
//     pub dot11PowerMode: DOT11_POWER_MODE,
//     pub uPowerSaveLevel: u32,
//     pub usListenInterval: u16,
//     pub usAID: u16,
//     pub bReceiveDTIMs: bool,
// }

// UNSUPPORTED Rust 2339:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_POWER_MGMT_MODE_STATUS_INFO {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub PowerSaveMode: DOT11_POWER_MODE,
//     pub uPowerSaveLevel: u32,
//     pub Reason: DOT11_POWER_MODE_REASON,
// }

public const val `DOT11_POWER_MGMT_MODE_STATUS_INFO_REVISION_1`: UInt = 1u;
public typealias `DOT11_POWER_MODE` = Int;
public typealias `DOT11_POWER_MODE_REASON` = Int;
public const val `DOT11_POWER_SAVE_LEVEL_FAST_PSP`: UInt = 2u;
public const val `DOT11_POWER_SAVE_LEVEL_MAX_PSP`: UInt = 1u;
public const val `DOT11_POWER_SAVING_FAST_PSP`: UInt = 8u;
public const val `DOT11_POWER_SAVING_MAXIMUM_LEVEL`: UInt = 24u;
public const val `DOT11_POWER_SAVING_MAX_PSP`: UInt = 16u;
public const val `DOT11_POWER_SAVING_NO_POWER_SAVING`: UInt = 0u;
public const val `DOT11_PRIORITY_CONTENTION`: UInt = 0u;
public const val `DOT11_PRIORITY_CONTENTION_FREE`: UInt = 1u;
// UNSUPPORTED Rust 2359:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_PRIVACY_EXEMPTION {
//     pub usEtherType: u16,
//     pub usExemptionActionType: u16,
//     pub usExemptionPacketType: u16,
// }

// UNSUPPORTED Rust 2366:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct DOT11_PRIVACY_EXEMPTION_LIST {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub uNumOfEntries: u32,
//     pub uTotalNumOfEntries: u32,
//     pub PrivacyExemptionEntries: [DOT11_PRIVACY_EXEMPTION; 1],
// }

// UNSUPPORTED Rust 2375:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_PRIVACY_EXEMPTION_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_PRIVACY_EXEMPTION_LIST_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 2382:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct DOT11_PROVISION_DISCOVERY_REQUEST_SEND_COMPLETE_PARAMETERS {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub PeerDeviceAddress: [u8; 6],
//     pub ReceiverAddress: [u8; 6],
//     pub DialogToken: u8,
//     pub Status: i32,
//     pub uIEsOffset: u32,
//     pub uIEsLength: u32,
// }

// UNSUPPORTED Rust 2394:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_PROVISION_DISCOVERY_REQUEST_SEND_COMPLETE_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_PROVISION_DISCOVERY_REQUEST_SEND_COMPLETE_PARAMETERS_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 2401:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct DOT11_PROVISION_DISCOVERY_RESPONSE_SEND_COMPLETE_PARAMETERS {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub ReceiverDeviceAddress: [u8; 6],
//     pub DialogToken: u8,
//     pub Status: i32,
//     pub uIEsOffset: u32,
//     pub uIEsLength: u32,
// }

// UNSUPPORTED Rust 2412:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_PROVISION_DISCOVERY_RESPONSE_SEND_COMPLETE_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_PROVISION_DISCOVERY_RESPONSE_SEND_COMPLETE_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `DOT11_PSD_IE_MAX_DATA_SIZE`: UInt = 240u;
public const val `DOT11_PSD_IE_MAX_ENTRY_NUMBER`: UInt = 5u;
// UNSUPPORTED Rust 2421:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_QOS_PARAMS {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub ucEnabledQoSProtocolFlags: u8,
// }

public const val `DOT11_QOS_PARAMS_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 2429:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_QOS_TX_DURATION {
//     pub uNominalMSDUSize: u32,
//     pub uMinPHYRate: u32,
//     pub uDuration: u32,
// }

// UNSUPPORTED Rust 2436:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11_QOS_TX_MEDIUM_TIME {
//     pub dot11PeerAddress: [u8; 6],
//     pub ucQoSPriority: u8,
//     pub uMediumTimeAdmited: u32,
// }

// UNSUPPORTED Rust 2443:1: declaration Impl has no candidate rule
// impl Default for DOT11_QOS_TX_MEDIUM_TIME {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DOT11_RADIO_STATE` = Int;
// UNSUPPORTED Rust 2449:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11_RATE_SET {
//     pub uRateSetLength: u32,
//     pub ucRateSet: [u8; 126],
// }

// UNSUPPORTED Rust 2455:1: declaration Impl has no candidate rule
// impl Default for DOT11_RATE_SET {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_RATE_SET_MAX_LENGTH`: UInt = 126u;
// UNSUPPORTED Rust 2461:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct DOT11_RECEIVED_GO_NEGOTIATION_CONFIRMATION_PARAMETERS {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub PeerDeviceAddress: [u8; 6],
//     pub DialogToken: u8,
//     pub uIEsOffset: u32,
//     pub uIEsLength: u32,
// }

// UNSUPPORTED Rust 2471:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_RECEIVED_GO_NEGOTIATION_CONFIRMATION_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_RECEIVED_GO_NEGOTIATION_CONFIRMATION_PARAMETERS_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 2478:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct DOT11_RECEIVED_GO_NEGOTIATION_REQUEST_PARAMETERS {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub PeerDeviceAddress: [u8; 6],
//     pub DialogToken: u8,
//     pub RequestContext: *mut core::ffi::c_void,
//     pub uIEsOffset: u32,
//     pub uIEsLength: u32,
// }

// UNSUPPORTED Rust 2489:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_RECEIVED_GO_NEGOTIATION_REQUEST_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_RECEIVED_GO_NEGOTIATION_REQUEST_PARAMETERS_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 2496:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct DOT11_RECEIVED_GO_NEGOTIATION_RESPONSE_PARAMETERS {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub PeerDeviceAddress: [u8; 6],
//     pub DialogToken: u8,
//     pub ResponseContext: *mut core::ffi::c_void,
//     pub uIEsOffset: u32,
//     pub uIEsLength: u32,
// }

// UNSUPPORTED Rust 2507:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_RECEIVED_GO_NEGOTIATION_RESPONSE_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_RECEIVED_GO_NEGOTIATION_RESPONSE_PARAMETERS_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 2514:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct DOT11_RECEIVED_INVITATION_REQUEST_PARAMETERS {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub TransmitterDeviceAddress: [u8; 6],
//     pub BSSID: [u8; 6],
//     pub DialogToken: u8,
//     pub RequestContext: *mut core::ffi::c_void,
//     pub uIEsOffset: u32,
//     pub uIEsLength: u32,
// }

// UNSUPPORTED Rust 2526:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_RECEIVED_INVITATION_REQUEST_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_RECEIVED_INVITATION_REQUEST_PARAMETERS_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 2533:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct DOT11_RECEIVED_INVITATION_RESPONSE_PARAMETERS {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub TransmitterDeviceAddress: [u8; 6],
//     pub BSSID: [u8; 6],
//     pub DialogToken: u8,
//     pub uIEsOffset: u32,
//     pub uIEsLength: u32,
// }

// UNSUPPORTED Rust 2544:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_RECEIVED_INVITATION_RESPONSE_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_RECEIVED_INVITATION_RESPONSE_PARAMETERS_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 2551:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct DOT11_RECEIVED_PROVISION_DISCOVERY_REQUEST_PARAMETERS {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub TransmitterDeviceAddress: [u8; 6],
//     pub BSSID: [u8; 6],
//     pub DialogToken: u8,
//     pub RequestContext: *mut core::ffi::c_void,
//     pub uIEsOffset: u32,
//     pub uIEsLength: u32,
// }

// UNSUPPORTED Rust 2563:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_RECEIVED_PROVISION_DISCOVERY_REQUEST_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_RECEIVED_PROVISION_DISCOVERY_REQUEST_PARAMETERS_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 2570:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct DOT11_RECEIVED_PROVISION_DISCOVERY_RESPONSE_PARAMETERS {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub TransmitterDeviceAddress: [u8; 6],
//     pub BSSID: [u8; 6],
//     pub DialogToken: u8,
//     pub uIEsOffset: u32,
//     pub uIEsLength: u32,
// }

// UNSUPPORTED Rust 2581:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_RECEIVED_PROVISION_DISCOVERY_RESPONSE_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_RECEIVED_PROVISION_DISCOVERY_RESPONSE_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `DOT11_RECV_CONTEXT_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 2589:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11_RECV_EXTENSION_INFO {
//     pub uVersion: u32,
//     pub pvReserved: *mut core::ffi::c_void,
//     pub dot11PhyType: DOT11_PHY_TYPE,
//     pub uChCenterFrequency: u32,
//     pub lRSSI: i32,
//     pub lRSSIMin: i32,
//     pub lRSSIMax: i32,
//     pub uRSSI: u32,
//     pub ucPriority: u8,
//     pub ucDataRate: u8,
//     pub ucPeerMacAddress: [u8; 6],
//     pub dwExtendedStatus: u32,
//     pub hWEPOffloadContext: super::super::Foundation::HANDLE,
//     pub hAuthOffloadContext: super::super::Foundation::HANDLE,
//     pub usWEPAppliedMask: u16,
//     pub usWPAMSDUPriority: u16,
//     pub dot11LowestIV48Counter: DOT11_IV48_COUNTER,
//     pub usDot11LeftRWBitMap: u16,
//     pub dot11HighestIV48Counter: DOT11_IV48_COUNTER,
//     pub usDot11RightRWBitMap: u16,
//     pub usNumberOfMPDUsReceived: u16,
//     pub usNumberOfFragments: u16,
//     pub pNdisPackets: [*mut core::ffi::c_void; 1],
// }

// UNSUPPORTED Rust 2616:1: declaration Impl has no candidate rule
// impl Default for DOT11_RECV_EXTENSION_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2621:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11_RECV_EXTENSION_INFO_V2 {
//     pub uVersion: u32,
//     pub pvReserved: *mut core::ffi::c_void,
//     pub dot11PhyType: DOT11_PHY_TYPE,
//     pub uChCenterFrequency: u32,
//     pub lRSSI: i32,
//     pub uRSSI: u32,
//     pub ucPriority: u8,
//     pub ucDataRate: u8,
//     pub ucPeerMacAddress: [u8; 6],
//     pub dwExtendedStatus: u32,
//     pub hWEPOffloadContext: super::super::Foundation::HANDLE,
//     pub hAuthOffloadContext: super::super::Foundation::HANDLE,
//     pub usWEPAppliedMask: u16,
//     pub usWPAMSDUPriority: u16,
//     pub dot11LowestIV48Counter: DOT11_IV48_COUNTER,
//     pub usDot11LeftRWBitMap: u16,
//     pub dot11HighestIV48Counter: DOT11_IV48_COUNTER,
//     pub usDot11RightRWBitMap: u16,
//     pub usNumberOfMPDUsReceived: u16,
//     pub usNumberOfFragments: u16,
//     pub pNdisPackets: [*mut core::ffi::c_void; 1],
// }

// UNSUPPORTED Rust 2646:1: declaration Impl has no candidate rule
// impl Default for DOT11_RECV_EXTENSION_INFO_V2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2651:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_RECV_SENSITIVITY {
//     pub ucDataRate: u8,
//     pub lRSSIMin: i32,
//     pub lRSSIMax: i32,
// }

// UNSUPPORTED Rust 2658:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11_RECV_SENSITIVITY_LIST {
//     pub Anonymous: DOT11_RECV_SENSITIVITY_LIST_0,
//     pub uNumOfEntries: u32,
//     pub uTotalNumOfEntries: u32,
//     pub dot11RecvSensitivity: [DOT11_RECV_SENSITIVITY; 1],
// }

// UNSUPPORTED Rust 2666:1: declaration Impl has no candidate rule
// impl Default for DOT11_RECV_SENSITIVITY_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2671:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DOT11_RECV_SENSITIVITY_LIST_0 {
//     pub dot11PhyType: DOT11_PHY_TYPE,
//     pub uPhyId: u32,
// }

// UNSUPPORTED Rust 2677:1: declaration Impl has no candidate rule
// impl Default for DOT11_RECV_SENSITIVITY_LIST_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2682:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11_REG_DOMAINS_SUPPORT_VALUE {
//     pub uNumOfEntries: u32,
//     pub uTotalNumOfEntries: u32,
//     pub dot11RegDomainValue: [DOT11_REG_DOMAIN_VALUE; 1],
// }

// UNSUPPORTED Rust 2689:1: declaration Impl has no candidate rule
// impl Default for DOT11_REG_DOMAINS_SUPPORT_VALUE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_REG_DOMAIN_DOC`: UInt = 32u;
public const val `DOT11_REG_DOMAIN_ETSI`: UInt = 48u;
public const val `DOT11_REG_DOMAIN_FCC`: UInt = 16u;
public const val `DOT11_REG_DOMAIN_FRANCE`: UInt = 50u;
public const val `DOT11_REG_DOMAIN_MKK`: UInt = 64u;
public const val `DOT11_REG_DOMAIN_OTHER`: UInt = 0u;
public const val `DOT11_REG_DOMAIN_SPAIN`: UInt = 49u;
// UNSUPPORTED Rust 2701:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_REG_DOMAIN_VALUE {
//     pub uRegDomainsSupportIndex: u32,
//     pub uRegDomainsSupportValue: u32,
// }

// UNSUPPORTED Rust 2707:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11_RESET_REQUEST {
//     pub dot11ResetType: DOT11_RESET_TYPE,
//     pub dot11MacAddress: [u8; 6],
//     pub bSetDefaultMIB: bool,
// }

// UNSUPPORTED Rust 2714:1: declaration Impl has no candidate rule
// impl Default for DOT11_RESET_REQUEST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DOT11_RESET_TYPE` = Int;
// UNSUPPORTED Rust 2720:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_ROAMING_COMPLETION_PARAMETERS {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub uStatus: u32,
// }

public const val `DOT11_ROAMING_COMPLETION_PARAMETERS_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 2728:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct DOT11_ROAMING_START_PARAMETERS {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub AdhocBSSID: [u8; 6],
//     pub AdhocSSID: DOT11_SSID,
//     pub uRoamingReason: u32,
// }

// UNSUPPORTED Rust 2737:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_ROAMING_START_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_ROAMING_START_PARAMETERS_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 2744:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_RSSI_RANGE {
//     pub dot11PhyType: DOT11_PHY_TYPE,
//     pub uRSSIMin: u32,
//     pub uRSSIMax: u32,
// }

// UNSUPPORTED Rust 2751:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11_SCAN_REQUEST {
//     pub dot11BSSType: DOT11_BSS_TYPE,
//     pub dot11BSSID: [u8; 6],
//     pub dot11SSID: DOT11_SSID,
//     pub dot11ScanType: DOT11_SCAN_TYPE,
//     pub bRestrictedScan: bool,
//     pub bUseRequestIE: bool,
//     pub uRequestIDsOffset: u32,
//     pub uNumOfRequestIDs: u32,
//     pub uPhyTypesOffset: u32,
//     pub uNumOfPhyTypes: u32,
//     pub uIEsOffset: u32,
//     pub uIEsLength: u32,
//     pub ucBuffer: [u8; 1],
// }

// UNSUPPORTED Rust 2768:1: declaration Impl has no candidate rule
// impl Default for DOT11_SCAN_REQUEST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2773:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11_SCAN_REQUEST_V2 {
//     pub dot11BSSType: DOT11_BSS_TYPE,
//     pub dot11BSSID: [u8; 6],
//     pub dot11ScanType: DOT11_SCAN_TYPE,
//     pub bRestrictedScan: bool,
//     pub udot11SSIDsOffset: u32,
//     pub uNumOfdot11SSIDs: u32,
//     pub bUseRequestIE: bool,
//     pub uRequestIDsOffset: u32,
//     pub uNumOfRequestIDs: u32,
//     pub uPhyTypeInfosOffset: u32,
//     pub uNumOfPhyTypeInfos: u32,
//     pub uIEsOffset: u32,
//     pub uIEsLength: u32,
//     pub ucBuffer: [u8; 1],
// }

// UNSUPPORTED Rust 2791:1: declaration Impl has no candidate rule
// impl Default for DOT11_SCAN_REQUEST_V2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DOT11_SCAN_TYPE` = Int;
// UNSUPPORTED Rust 2797:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct DOT11_SECURITY_PACKET_HEADER {
//     pub PeerMac: [u8; 6],
//     pub usEtherType: u16,
//     pub Data: [u8; 1],
// }

// UNSUPPORTED Rust 2804:1: declaration Impl has no candidate rule
// impl Default for DOT11_SECURITY_PACKET_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_SEND_CONTEXT_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 2810:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct DOT11_SEND_GO_NEGOTIATION_CONFIRMATION_PARAMETERS {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub PeerDeviceAddress: [u8; 6],
//     pub DialogToken: u8,
//     pub ResponseContext: *mut core::ffi::c_void,
//     pub uSendTimeout: u32,
//     pub Status: u8,
//     pub GroupCapability: u8,
//     pub GroupID: DOT11_WFD_GROUP_ID,
//     pub bUseGroupID: bool,
//     pub uIEsOffset: u32,
//     pub uIEsLength: u32,
// }

// UNSUPPORTED Rust 2826:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_SEND_GO_NEGOTIATION_CONFIRMATION_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_SEND_GO_NEGOTIATION_CONFIRMATION_PARAMETERS_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 2833:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct DOT11_SEND_GO_NEGOTIATION_REQUEST_PARAMETERS {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub PeerDeviceAddress: [u8; 6],
//     pub DialogToken: u8,
//     pub uSendTimeout: u32,
//     pub GroupOwnerIntent: DOT11_WFD_GO_INTENT,
//     pub MinimumConfigTimeout: DOT11_WFD_CONFIGURATION_TIMEOUT,
//     pub IntendedInterfaceAddress: [u8; 6],
//     pub GroupCapability: u8,
//     pub uIEsOffset: u32,
//     pub uIEsLength: u32,
// }

// UNSUPPORTED Rust 2848:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_SEND_GO_NEGOTIATION_REQUEST_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_SEND_GO_NEGOTIATION_REQUEST_PARAMETERS_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 2855:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct DOT11_SEND_GO_NEGOTIATION_RESPONSE_PARAMETERS {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub PeerDeviceAddress: [u8; 6],
//     pub DialogToken: u8,
//     pub RequestContext: *mut core::ffi::c_void,
//     pub uSendTimeout: u32,
//     pub Status: u8,
//     pub GroupOwnerIntent: DOT11_WFD_GO_INTENT,
//     pub MinimumConfigTimeout: DOT11_WFD_CONFIGURATION_TIMEOUT,
//     pub IntendedInterfaceAddress: [u8; 6],
//     pub GroupCapability: u8,
//     pub GroupID: DOT11_WFD_GROUP_ID,
//     pub bUseGroupID: bool,
//     pub uIEsOffset: u32,
//     pub uIEsLength: u32,
// }

// UNSUPPORTED Rust 2874:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_SEND_GO_NEGOTIATION_RESPONSE_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_SEND_GO_NEGOTIATION_RESPONSE_PARAMETERS_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 2881:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct DOT11_SEND_INVITATION_REQUEST_PARAMETERS {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub DialogToken: u8,
//     pub PeerDeviceAddress: [u8; 6],
//     pub uSendTimeout: u32,
//     pub MinimumConfigTimeout: DOT11_WFD_CONFIGURATION_TIMEOUT,
//     pub InvitationFlags: DOT11_WFD_INVITATION_FLAGS,
//     pub GroupBSSID: [u8; 6],
//     pub bUseGroupBSSID: bool,
//     pub OperatingChannel: DOT11_WFD_CHANNEL,
//     pub bUseSpecifiedOperatingChannel: bool,
//     pub GroupID: DOT11_WFD_GROUP_ID,
//     pub bLocalGO: bool,
//     pub uIEsOffset: u32,
//     pub uIEsLength: u32,
// }

// UNSUPPORTED Rust 2900:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_SEND_INVITATION_REQUEST_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_SEND_INVITATION_REQUEST_PARAMETERS_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 2907:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct DOT11_SEND_INVITATION_RESPONSE_PARAMETERS {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub ReceiverDeviceAddress: [u8; 6],
//     pub DialogToken: u8,
//     pub RequestContext: *mut core::ffi::c_void,
//     pub uSendTimeout: u32,
//     pub Status: u8,
//     pub MinimumConfigTimeout: DOT11_WFD_CONFIGURATION_TIMEOUT,
//     pub GroupBSSID: [u8; 6],
//     pub bUseGroupBSSID: bool,
//     pub OperatingChannel: DOT11_WFD_CHANNEL,
//     pub bUseSpecifiedOperatingChannel: bool,
//     pub uIEsOffset: u32,
//     pub uIEsLength: u32,
// }

// UNSUPPORTED Rust 2925:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_SEND_INVITATION_RESPONSE_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_SEND_INVITATION_RESPONSE_PARAMETERS_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 2932:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct DOT11_SEND_PROVISION_DISCOVERY_REQUEST_PARAMETERS {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub DialogToken: u8,
//     pub PeerDeviceAddress: [u8; 6],
//     pub uSendTimeout: u32,
//     pub GroupCapability: u8,
//     pub GroupID: DOT11_WFD_GROUP_ID,
//     pub bUseGroupID: bool,
//     pub uIEsOffset: u32,
//     pub uIEsLength: u32,
// }

// UNSUPPORTED Rust 2946:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_SEND_PROVISION_DISCOVERY_REQUEST_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_SEND_PROVISION_DISCOVERY_REQUEST_PARAMETERS_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 2953:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct DOT11_SEND_PROVISION_DISCOVERY_RESPONSE_PARAMETERS {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub ReceiverDeviceAddress: [u8; 6],
//     pub DialogToken: u8,
//     pub RequestContext: *mut core::ffi::c_void,
//     pub uSendTimeout: u32,
//     pub uIEsOffset: u32,
//     pub uIEsLength: u32,
// }

// UNSUPPORTED Rust 2965:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_SEND_PROVISION_DISCOVERY_RESPONSE_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_SEND_PROVISION_DISCOVERY_RESPONSE_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `DOT11_SERVICE_CLASS_REORDERABLE_MULTICAST`: UInt = 0u;
public const val `DOT11_SERVICE_CLASS_STRICTLY_ORDERED`: UInt = 1u;
// UNSUPPORTED Rust 2974:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11_SSID {
//     pub uSSIDLength: u32,
//     pub ucSSID: [u8; 32],
// }

// UNSUPPORTED Rust 2980:1: declaration Impl has no candidate rule
// impl Default for DOT11_SSID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2985:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct DOT11_SSID_LIST {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub uNumOfEntries: u32,
//     pub uTotalNumOfEntries: u32,
//     pub SSIDs: [DOT11_SSID; 1],
// }

// UNSUPPORTED Rust 2994:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_SSID_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_SSID_LIST_REVISION_1`: UInt = 1u;
public const val `DOT11_SSID_MAX_LENGTH`: UInt = 32u;
// UNSUPPORTED Rust 3002:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_START_REQUEST {
//     pub uStartFailureTimeout: u32,
//     pub OperationalRateSet: DOT11_RATE_SET,
//     pub uChCenterFrequency: u32,
//     pub dot11BSSDescription: DOT11_BSS_DESCRIPTION,
// }

// UNSUPPORTED Rust 3010:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct DOT11_STATISTICS {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub ullFourWayHandshakeFailures: u64,
//     pub ullTKIPCounterMeasuresInvoked: u64,
//     pub ullReserved: u64,
//     pub MacUcastCounters: DOT11_MAC_FRAME_STATISTICS,
//     pub MacMcastCounters: DOT11_MAC_FRAME_STATISTICS,
//     pub PhyCounters: [DOT11_PHY_FRAME_STATISTICS; 1],
// }

// UNSUPPORTED Rust 3022:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_STATISTICS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_STATISTICS_REVISION_1`: UInt = 1u;
public const val `DOT11_STATUS_AP_JOIN_CONFIRM`: UInt = 5u;
public const val `DOT11_STATUS_AUTH_FAILED`: UInt = 131072u;
public const val `DOT11_STATUS_AUTH_NOT_VERIFIED`: UInt = 32768u;
public const val `DOT11_STATUS_AUTH_VERIFIED`: UInt = 65536u;
public const val `DOT11_STATUS_ENCRYPTION_FAILED`: UInt = 512u;
public const val `DOT11_STATUS_EXCESSIVE_DATA_LENGTH`: UInt = 256u;
public const val `DOT11_STATUS_GENERATE_AUTH_FAILED`: UInt = 16384u;
public const val `DOT11_STATUS_ICV_VERIFIED`: UInt = 2048u;
// UNSUPPORTED Rust 3037:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_STATUS_INDICATION {
//     pub uStatusType: u32,
//     pub ndisStatus: i32,
// }

public const val `DOT11_STATUS_JOIN_CONFIRM`: UInt = 2u;
public const val `DOT11_STATUS_MPDU_MAX_LENGTH_CHANGED`: UInt = 6u;
public const val `DOT11_STATUS_PACKET_NOT_REASSEMBLED`: UInt = 8192u;
public const val `DOT11_STATUS_PACKET_REASSEMBLED`: UInt = 4096u;
public const val `DOT11_STATUS_PS_LIFETIME_EXPIRED`: UInt = 262144u;
public const val `DOT11_STATUS_RESET_CONFIRM`: UInt = 4u;
public const val `DOT11_STATUS_RETRY_LIMIT_EXCEEDED`: UInt = 2u;
public const val `DOT11_STATUS_SCAN_CONFIRM`: UInt = 1u;
public const val `DOT11_STATUS_START_CONFIRM`: UInt = 3u;
public const val `DOT11_STATUS_SUCCESS`: UInt = 1u;
public const val `DOT11_STATUS_UNAVAILABLE_BSS`: UInt = 128u;
public const val `DOT11_STATUS_UNAVAILABLE_PRIORITY`: UInt = 16u;
public const val `DOT11_STATUS_UNAVAILABLE_SERVICE_CLASS`: UInt = 32u;
public const val `DOT11_STATUS_UNSUPPORTED_PRIORITY`: UInt = 4u;
public const val `DOT11_STATUS_UNSUPPORTED_SERVICE_CLASS`: UInt = 8u;
public const val `DOT11_STATUS_WEP_KEY_UNAVAILABLE`: UInt = 1024u;
public const val `DOT11_STATUS_XMIT_MSDU_TIMER_EXPIRED`: UInt = 64u;
// UNSUPPORTED Rust 3060:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_STOP_AP_PARAMETERS {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub ulReason: u32,
// }

public const val `DOT11_STOP_AP_PARAMETERS_REVISION_1`: UInt = 1u;
public const val `DOT11_STOP_AP_REASON_AP_ACTIVE`: UInt = 3u;
public const val `DOT11_STOP_AP_REASON_CHANNEL_NOT_AVAILABLE`: UInt = 2u;
public const val `DOT11_STOP_AP_REASON_FREQUENCY_NOT_AVAILABLE`: UInt = 1u;
public const val `DOT11_STOP_AP_REASON_IHV_END`: UInt = 4294967295u;
public const val `DOT11_STOP_AP_REASON_IHV_START`: UInt = 4278190080u;
// UNSUPPORTED Rust 3073:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_SUPPORTED_ANTENNA {
//     pub uAntennaListIndex: u32,
//     pub bSupportedAntenna: bool,
// }

// UNSUPPORTED Rust 3079:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11_SUPPORTED_ANTENNA_LIST {
//     pub uNumOfEntries: u32,
//     pub uTotalNumOfEntries: u32,
//     pub dot11SupportedAntenna: [DOT11_SUPPORTED_ANTENNA; 1],
// }

// UNSUPPORTED Rust 3086:1: declaration Impl has no candidate rule
// impl Default for DOT11_SUPPORTED_ANTENNA_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3091:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11_SUPPORTED_DATA_RATES_VALUE {
//     pub ucSupportedTxDataRatesValue: [u8; 8],
//     pub ucSupportedRxDataRatesValue: [u8; 8],
// }

// UNSUPPORTED Rust 3097:1: declaration Impl has no candidate rule
// impl Default for DOT11_SUPPORTED_DATA_RATES_VALUE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3102:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11_SUPPORTED_DATA_RATES_VALUE_V2 {
//     pub ucSupportedTxDataRatesValue: [u8; 255],
//     pub ucSupportedRxDataRatesValue: [u8; 255],
// }

// UNSUPPORTED Rust 3108:1: declaration Impl has no candidate rule
// impl Default for DOT11_SUPPORTED_DATA_RATES_VALUE_V2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3113:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_SUPPORTED_DSSS_CHANNEL {
//     pub uChannel: u32,
// }

// UNSUPPORTED Rust 3118:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11_SUPPORTED_DSSS_CHANNEL_LIST {
//     pub uNumOfEntries: u32,
//     pub uTotalNumOfEntries: u32,
//     pub dot11SupportedDSSSChannel: [DOT11_SUPPORTED_DSSS_CHANNEL; 1],
// }

// UNSUPPORTED Rust 3125:1: declaration Impl has no candidate rule
// impl Default for DOT11_SUPPORTED_DSSS_CHANNEL_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3130:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_SUPPORTED_OFDM_FREQUENCY {
//     pub uCenterFrequency: u32,
// }

// UNSUPPORTED Rust 3135:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11_SUPPORTED_OFDM_FREQUENCY_LIST {
//     pub uNumOfEntries: u32,
//     pub uTotalNumOfEntries: u32,
//     pub dot11SupportedOFDMFrequency: [DOT11_SUPPORTED_OFDM_FREQUENCY; 1],
// }

// UNSUPPORTED Rust 3142:1: declaration Impl has no candidate rule
// impl Default for DOT11_SUPPORTED_OFDM_FREQUENCY_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3147:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11_SUPPORTED_PHY_TYPES {
//     pub uNumOfEntries: u32,
//     pub uTotalNumOfEntries: u32,
//     pub dot11PHYType: [DOT11_PHY_TYPE; 1],
// }

// UNSUPPORTED Rust 3154:1: declaration Impl has no candidate rule
// impl Default for DOT11_SUPPORTED_PHY_TYPES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3159:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11_SUPPORTED_POWER_LEVELS {
//     pub uNumOfSupportedPowerLevels: u32,
//     pub uTxPowerLevelValues: [u32; 8],
// }

// UNSUPPORTED Rust 3165:1: declaration Impl has no candidate rule
// impl Default for DOT11_SUPPORTED_POWER_LEVELS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DOT11_TEMP_TYPE` = Int;
// UNSUPPORTED Rust 3171:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct DOT11_TKIPMIC_FAILURE_PARAMETERS {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub bDefaultKeyFailure: bool,
//     pub uKeyIndex: u32,
//     pub PeerMac: [u8; 6],
// }

// UNSUPPORTED Rust 3180:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_TKIPMIC_FAILURE_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_TKIPMIC_FAILURE_PARAMETERS_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 3187:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11_UPDATE_IE {
//     pub dot11UpdateIEOp: DOT11_UPDATE_IE_OP,
//     pub uBufferLength: u32,
//     pub ucBuffer: [u8; 1],
// }

// UNSUPPORTED Rust 3194:1: declaration Impl has no candidate rule
// impl Default for DOT11_UPDATE_IE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DOT11_UPDATE_IE_OP` = Int;
// UNSUPPORTED Rust 3200:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_VENUEINFO {
//     pub VenueGroup: u8,
//     pub VenueType: u8,
// }

// UNSUPPORTED Rust 3206:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct DOT11_VWIFI_ATTRIBUTES {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub uTotalNumOfEntries: u32,
//     pub Combinations: [DOT11_VWIFI_COMBINATION; 1],
// }

// UNSUPPORTED Rust 3214:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_VWIFI_ATTRIBUTES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_VWIFI_ATTRIBUTES_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 3221:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_VWIFI_COMBINATION {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub uNumInfrastructure: u32,
//     pub uNumAdhoc: u32,
//     pub uNumSoftAP: u32,
// }

public const val `DOT11_VWIFI_COMBINATION_REVISION_1`: UInt = 1u;
public const val `DOT11_VWIFI_COMBINATION_REVISION_2`: UInt = 2u;
public const val `DOT11_VWIFI_COMBINATION_REVISION_3`: UInt = 3u;
// UNSUPPORTED Rust 3233:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_VWIFI_COMBINATION_V2 {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub uNumInfrastructure: u32,
//     pub uNumAdhoc: u32,
//     pub uNumSoftAP: u32,
//     pub uNumVirtualStation: u32,
// }

// UNSUPPORTED Rust 3243:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_VWIFI_COMBINATION_V3 {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub uNumInfrastructure: u32,
//     pub uNumAdhoc: u32,
//     pub uNumSoftAP: u32,
//     pub uNumVirtualStation: u32,
//     pub uNumWFDGroup: u32,
// }

// UNSUPPORTED Rust 3254:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11_WEP_OFFLOAD {
//     pub uReserved: u32,
//     pub hOffloadContext: super::super::Foundation::HANDLE,
//     pub hOffload: super::super::Foundation::HANDLE,
//     pub dot11OffloadType: DOT11_OFFLOAD_TYPE,
//     pub dwAlgorithm: u32,
//     pub bRowIsOutbound: bool,
//     pub bUseDefault: bool,
//     pub uFlags: u32,
//     pub ucMacAddress: [u8; 6],
//     pub uNumOfRWsOnPeer: u32,
//     pub uNumOfRWsOnMe: u32,
//     pub dot11IV48Counters: [DOT11_IV48_COUNTER; 16],
//     pub usDot11RWBitMaps: [u16; 16],
//     pub usKeyLength: u16,
//     pub ucKey: [u8; 1],
// }

// UNSUPPORTED Rust 3273:1: declaration Impl has no candidate rule
// impl Default for DOT11_WEP_OFFLOAD {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3278:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11_WEP_UPLOAD {
//     pub uReserved: u32,
//     pub dot11OffloadType: DOT11_OFFLOAD_TYPE,
//     pub hOffload: super::super::Foundation::HANDLE,
//     pub uNumOfRWsUsed: u32,
//     pub dot11IV48Counters: [DOT11_IV48_COUNTER; 16],
//     pub usDot11RWBitMaps: [u16; 16],
// }

// UNSUPPORTED Rust 3288:1: declaration Impl has no candidate rule
// impl Default for DOT11_WEP_UPLOAD {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3293:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_WFD_ADDITIONAL_IE {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub uBeaconIEsOffset: u32,
//     pub uBeaconIEsLength: u32,
//     pub uProbeResponseIEsOffset: u32,
//     pub uProbeResponseIEsLength: u32,
//     pub uDefaultRequestIEsOffset: u32,
//     pub uDefaultRequestIEsLength: u32,
// }

public const val `DOT11_WFD_ADDITIONAL_IE_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 3306:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11_WFD_ADVERTISED_SERVICE_DESCRIPTOR {
//     pub AdvertisementID: u32,
//     pub ConfigMethods: u16,
//     pub ServiceNameLength: u8,
//     pub ServiceName: [u8; 255],
// }

// UNSUPPORTED Rust 3314:1: declaration Impl has no candidate rule
// impl Default for DOT11_WFD_ADVERTISED_SERVICE_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3319:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11_WFD_ADVERTISED_SERVICE_LIST {
//     pub ServiceCount: u16,
//     pub AdvertisedService: [DOT11_WFD_ADVERTISED_SERVICE_DESCRIPTOR; 1],
// }

// UNSUPPORTED Rust 3325:1: declaration Impl has no candidate rule
// impl Default for DOT11_WFD_ADVERTISED_SERVICE_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3330:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11_WFD_ADVERTISEMENT_ID {
//     pub AdvertisementID: u32,
//     pub ServiceAddress: [u8; 6],
// }

// UNSUPPORTED Rust 3336:1: declaration Impl has no candidate rule
// impl Default for DOT11_WFD_ADVERTISEMENT_ID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_WFD_APS2_SERVICE_TYPE_MAX_LENGTH`: UInt = 21u;
public const val `DOT11_WFD_ASP2_INSTANCE_NAME_MAX_LENGTH`: UInt = 63u;
// UNSUPPORTED Rust 3343:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct DOT11_WFD_ATTRIBUTES {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub uNumConcurrentGORole: u32,
//     pub uNumConcurrentClientRole: u32,
//     pub WPSVersionsSupported: u32,
//     pub bServiceDiscoverySupported: bool,
//     pub bClientDiscoverabilitySupported: bool,
//     pub bInfrastructureManagementSupported: bool,
//     pub uMaxSecondaryDeviceTypeListSize: u32,
//     pub DeviceAddress: [u8; 6],
//     pub uInterfaceAddressListCount: u32,
//     pub pInterfaceAddressList: *mut u8,
//     pub uNumSupportedCountryOrRegionStrings: u32,
//     pub pSupportedCountryOrRegionStrings: *mut u8,
//     pub uDiscoveryFilterListSize: u32,
//     pub uGORoleClientTableSize: u32,
// }

// UNSUPPORTED Rust 3363:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_WFD_ATTRIBUTES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_WFD_ATTRIBUTES_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 3370:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11_WFD_CHANNEL {
//     pub CountryRegionString: [u8; 3],
//     pub OperatingClass: u8,
//     pub ChannelNumber: u8,
// }

// UNSUPPORTED Rust 3377:1: declaration Impl has no candidate rule
// impl Default for DOT11_WFD_CHANNEL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3382:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_WFD_CONFIGURATION_TIMEOUT {
//     pub GOTimeout: u8,
//     pub ClientTimeout: u8,
// }

public const val `DOT11_WFD_DEVICE_AUTO_AVAILABILITY`: UInt = 16u;
public const val `DOT11_WFD_DEVICE_CAPABILITY_CONCURRENT_OPERATION`: UInt = 4u;
// UNSUPPORTED Rust 3390:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_WFD_DEVICE_CAPABILITY_CONFIG {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub bServiceDiscoveryEnabled: bool,
//     pub bClientDiscoverabilityEnabled: bool,
//     pub bConcurrentOperationSupported: bool,
//     pub bInfrastructureManagementEnabled: bool,
//     pub bDeviceLimitReached: bool,
//     pub bInvitationProcedureEnabled: bool,
//     pub WPSVersionsEnabled: u32,
// }

public const val `DOT11_WFD_DEVICE_CAPABILITY_CONFIG_REVISION_1`: UInt = 1u;
public const val `DOT11_WFD_DEVICE_CAPABILITY_P2P_CLIENT_DISCOVERABILITY`: UInt = 2u;
public const val `DOT11_WFD_DEVICE_CAPABILITY_P2P_DEVICE_LIMIT`: UInt = 16u;
public const val `DOT11_WFD_DEVICE_CAPABILITY_P2P_INFRASTRUCTURE_MANAGED`: UInt = 8u;
public const val `DOT11_WFD_DEVICE_CAPABILITY_P2P_INVITATION_PROCEDURE`: UInt = 32u;
public const val `DOT11_WFD_DEVICE_CAPABILITY_RESERVED_6`: UInt = 64u;
public const val `DOT11_WFD_DEVICE_CAPABILITY_RESERVED_7`: UInt = 128u;
public const val `DOT11_WFD_DEVICE_CAPABILITY_SERVICE_DISCOVERY`: UInt = 1u;
// UNSUPPORTED Rust 3411:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11_WFD_DEVICE_ENTRY {
//     pub uPhyId: u32,
//     pub PhySpecificInfo: DOT11_BSS_ENTRY_PHY_SPECIFIC_INFO,
//     pub dot11BSSID: [u8; 6],
//     pub dot11BSSType: DOT11_BSS_TYPE,
//     pub TransmitterAddress: [u8; 6],
//     pub lRSSI: i32,
//     pub uLinkQuality: u32,
//     pub usBeaconPeriod: u16,
//     pub ullTimestamp: u64,
//     pub ullBeaconHostTimestamp: u64,
//     pub ullProbeResponseHostTimestamp: u64,
//     pub usCapabilityInformation: u16,
//     pub uBeaconIEsOffset: u32,
//     pub uBeaconIEsLength: u32,
//     pub uProbeResponseIEsOffset: u32,
//     pub uProbeResponseIEsLength: u32,
// }

// UNSUPPORTED Rust 3431:1: declaration Impl has no candidate rule
// impl Default for DOT11_WFD_DEVICE_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_WFD_DEVICE_HIGH_AVAILABILITY`: UInt = 24u;
// UNSUPPORTED Rust 3437:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct DOT11_WFD_DEVICE_INFO {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub DeviceAddress: [u8; 6],
//     pub ConfigMethods: u16,
//     pub PrimaryDeviceType: DOT11_WFD_DEVICE_TYPE,
//     pub DeviceName: DOT11_WPS_DEVICE_NAME,
// }

// UNSUPPORTED Rust 3447:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_WFD_DEVICE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_WFD_DEVICE_INFO_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 3454:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_WFD_DEVICE_LISTEN_CHANNEL {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub ChannelNumber: u8,
// }

public const val `DOT11_WFD_DEVICE_LISTEN_CHANNEL_REVISION_1`: UInt = 1u;
public const val `DOT11_WFD_DEVICE_NOT_DISCOVERABLE`: UInt = 0u;
// UNSUPPORTED Rust 3463:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11_WFD_DEVICE_TYPE {
//     pub CategoryID: u16,
//     pub SubCategoryID: u16,
//     pub OUI: [u8; 4],
// }

// UNSUPPORTED Rust 3470:1: declaration Impl has no candidate rule
// impl Default for DOT11_WFD_DEVICE_TYPE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_WFD_DISCOVER_COMPLETE_MAX_LIST_SIZE`: UInt = 128u;
// UNSUPPORTED Rust 3476:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_WFD_DISCOVER_COMPLETE_PARAMETERS {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub Status: i32,
//     pub uNumOfEntries: u32,
//     pub uTotalNumOfEntries: u32,
//     pub uListOffset: u32,
//     pub uListLength: u32,
// }

public const val `DOT11_WFD_DISCOVER_COMPLETE_PARAMETERS_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 3488:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11_WFD_DISCOVER_DEVICE_FILTER {
//     pub DeviceID: [u8; 6],
//     pub ucBitmask: u8,
//     pub GroupSSID: DOT11_SSID,
// }

// UNSUPPORTED Rust 3495:1: declaration Impl has no candidate rule
// impl Default for DOT11_WFD_DISCOVER_DEVICE_FILTER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3500:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_WFD_DISCOVER_REQUEST {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub DiscoverType: DOT11_WFD_DISCOVER_TYPE,
//     pub ScanType: DOT11_WFD_SCAN_TYPE,
//     pub uDiscoverTimeout: u32,
//     pub uDeviceFilterListOffset: u32,
//     pub uNumDeviceFilters: u32,
//     pub uIEsOffset: u32,
//     pub uIEsLength: u32,
//     pub bForceScanLegacyNetworks: bool,
// }

public const val `DOT11_WFD_DISCOVER_REQUEST_REVISION_1`: UInt = 1u;
public typealias `DOT11_WFD_DISCOVER_TYPE` = Int;
// UNSUPPORTED Rust 3516:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_WFD_GO_INTENT {
//     pub _bitfield: u8,
// }

public const val `DOT11_WFD_GROUP_CAPABILITY_CROSS_CONNECTION_SUPPORTED`: UInt = 16u;
public const val `DOT11_WFD_GROUP_CAPABILITY_EAPOL_KEY_IP_ADDRESS_ALLOCATION_SUPPORTED`: UInt = 128u;
public const val `DOT11_WFD_GROUP_CAPABILITY_GROUP_LIMIT_REACHED`: UInt = 4u;
public const val `DOT11_WFD_GROUP_CAPABILITY_GROUP_OWNER`: UInt = 1u;
public const val `DOT11_WFD_GROUP_CAPABILITY_INTRABSS_DISTRIBUTION_SUPPORTED`: UInt = 8u;
public const val `DOT11_WFD_GROUP_CAPABILITY_IN_GROUP_FORMATION`: UInt = 64u;
public const val `DOT11_WFD_GROUP_CAPABILITY_NONE`: UInt = 0u;
public const val `DOT11_WFD_GROUP_CAPABILITY_PERSISTENT_GROUP`: UInt = 2u;
public const val `DOT11_WFD_GROUP_CAPABILITY_PERSISTENT_RECONNECT_SUPPORTED`: UInt = 32u;
public const val `DOT11_WFD_GROUP_CAPABILITY_RESERVED_7`: UInt = 128u;
// UNSUPPORTED Rust 3531:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11_WFD_GROUP_ID {
//     pub DeviceAddress: [u8; 6],
//     pub SSID: DOT11_SSID,
// }

// UNSUPPORTED Rust 3537:1: declaration Impl has no candidate rule
// impl Default for DOT11_WFD_GROUP_ID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3542:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_WFD_GROUP_JOIN_PARAMETERS {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub GOOperatingChannel: DOT11_WFD_CHANNEL,
//     pub GOConfigTime: u32,
//     pub bInGroupFormation: bool,
//     pub bWaitForWPSReady: bool,
// }

public const val `DOT11_WFD_GROUP_JOIN_PARAMETERS_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 3553:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_WFD_GROUP_OWNER_CAPABILITY_CONFIG {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub bPersistentGroupEnabled: bool,
//     pub bIntraBSSDistributionSupported: bool,
//     pub bCrossConnectionSupported: bool,
//     pub bPersistentReconnectSupported: bool,
//     pub bGroupFormationEnabled: bool,
//     pub uMaximumGroupLimit: u32,
// }

public const val `DOT11_WFD_GROUP_OWNER_CAPABILITY_CONFIG_REVISION_1`: UInt = 1u;
public const val `DOT11_WFD_GROUP_OWNER_CAPABILITY_CONFIG_REVISION_2`: UInt = 2u;
// UNSUPPORTED Rust 3567:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_WFD_GROUP_OWNER_CAPABILITY_CONFIG_V2 {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub bPersistentGroupEnabled: bool,
//     pub bIntraBSSDistributionSupported: bool,
//     pub bCrossConnectionSupported: bool,
//     pub bPersistentReconnectSupported: bool,
//     pub bGroupFormationEnabled: bool,
//     pub uMaximumGroupLimit: u32,
//     pub bEapolKeyIpAddressAllocationSupported: bool,
// }

// UNSUPPORTED Rust 3580:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_WFD_GROUP_START_PARAMETERS {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub AdvertisedOperatingChannel: DOT11_WFD_CHANNEL,
// }

public const val `DOT11_WFD_GROUP_START_PARAMETERS_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 3588:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_WFD_INVITATION_FLAGS {
//     pub _bitfield: u8,
// }

public const val `DOT11_WFD_MINOR_REASON_DISASSOCIATED_FROM_WLAN_CROSS_CONNECTION_POLICY`: UInt = 1u;
public const val `DOT11_WFD_MINOR_REASON_DISASSOCIATED_INFRASTRUCTURE_MANAGED_POLICY`: UInt = 4u;
public const val `DOT11_WFD_MINOR_REASON_DISASSOCIATED_NOT_MANAGED_INFRASTRUCTURE_CAPABLE`: UInt = 2u;
public const val `DOT11_WFD_MINOR_REASON_DISASSOCIATED_WFD_COEXISTENCE_POLICY`: UInt = 3u;
public const val `DOT11_WFD_MINOR_REASON_SUCCESS`: UInt = 0u;
public typealias `DOT11_WFD_SCAN_TYPE` = Int;
// UNSUPPORTED Rust 3599:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct DOT11_WFD_SECONDARY_DEVICE_TYPE_LIST {
//     pub Header: super::Ndis::NDIS_OBJECT_HEADER,
//     pub uNumOfEntries: u32,
//     pub uTotalNumOfEntries: u32,
//     pub SecondaryDeviceTypes: [DOT11_WFD_DEVICE_TYPE; 1],
// }

// UNSUPPORTED Rust 3608:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for DOT11_WFD_SECONDARY_DEVICE_TYPE_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_WFD_SECONDARY_DEVICE_TYPE_LIST_REVISION_1`: UInt = 1u;
// UNSUPPORTED Rust 3615:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11_WFD_SERVICE_HASH_LIST {
//     pub ServiceHashCount: u16,
//     pub ServiceHash: [u8; 6],
// }

// UNSUPPORTED Rust 3621:1: declaration Impl has no candidate rule
// impl Default for DOT11_WFD_SERVICE_HASH_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_WFD_SERVICE_INFORMATION_MAX_LENGTH`: UInt = 65535u;
public const val `DOT11_WFD_SERVICE_NAME_MAX_LENGTH`: UInt = 255u;
// UNSUPPORTED Rust 3628:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11_WFD_SESSION_ID {
//     pub SessionID: u32,
//     pub SessionAddress: [u8; 6],
// }

// UNSUPPORTED Rust 3634:1: declaration Impl has no candidate rule
// impl Default for DOT11_WFD_SESSION_ID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3639:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11_WFD_SESSION_INFO {
//     pub uSessionInfoLength: u16,
//     pub ucSessionInfo: [u8; 144],
// }

// UNSUPPORTED Rust 3645:1: declaration Impl has no candidate rule
// impl Default for DOT11_WFD_SESSION_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_WFD_SESSION_INFO_MAX_LENGTH`: UInt = 144u;
public const val `DOT11_WFD_STATUS_FAILED_INCOMPATIBLE_PARAMETERS`: UInt = 2u;
public const val `DOT11_WFD_STATUS_FAILED_INCOMPATIBLE_PROVISIONING_METHOD`: UInt = 10u;
public const val `DOT11_WFD_STATUS_FAILED_INFORMATION_IS_UNAVAILABLE`: UInt = 1u;
public const val `DOT11_WFD_STATUS_FAILED_INVALID_PARAMETERS`: UInt = 4u;
public const val `DOT11_WFD_STATUS_FAILED_LIMIT_REACHED`: UInt = 3u;
public const val `DOT11_WFD_STATUS_FAILED_MATCHING_MAX_INTENT`: UInt = 9u;
public const val `DOT11_WFD_STATUS_FAILED_NO_COMMON_CHANNELS`: UInt = 7u;
public const val `DOT11_WFD_STATUS_FAILED_PREVIOUS_PROTOCOL_ERROR`: UInt = 6u;
public const val `DOT11_WFD_STATUS_FAILED_REJECTED_BY_USER`: UInt = 11u;
public const val `DOT11_WFD_STATUS_FAILED_UNABLE_TO_ACCOMODATE_REQUEST`: UInt = 5u;
public const val `DOT11_WFD_STATUS_FAILED_UNKNOWN_WFD_GROUP`: UInt = 8u;
public const val `DOT11_WFD_STATUS_SUCCESS`: UInt = 0u;
public const val `DOT11_WFD_STATUS_SUCCESS_ACCEPTED_BY_USER`: UInt = 12u;
// UNSUPPORTED Rust 3664:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DOT11_WME_AC_PARAMETERS {
//     pub ucAccessCategoryIndex: u8,
//     pub ucAIFSN: u8,
//     pub ucECWmin: u8,
//     pub ucECWmax: u8,
//     pub usTXOPLimit: u16,
// }

// UNSUPPORTED Rust 3673:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11_WME_AC_PARAMETERS_LIST {
//     pub uNumOfEntries: u32,
//     pub uTotalNumOfEntries: u32,
//     pub dot11WMEACParameters: [DOT11_WME_AC_PARAMETERS; 1],
// }

// UNSUPPORTED Rust 3680:1: declaration Impl has no candidate rule
// impl Default for DOT11_WME_AC_PARAMETERS_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_WME_PACKET`: UInt = 256u;
// UNSUPPORTED Rust 3686:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11_WME_UPDATE_IE {
//     pub uParamElemMinBeaconIntervals: u32,
//     pub uWMEInfoElemOffset: u32,
//     pub uWMEInfoElemLength: u32,
//     pub uWMEParamElemOffset: u32,
//     pub uWMEParamElemLength: u32,
//     pub ucBuffer: [u8; 1],
// }

// UNSUPPORTED Rust 3696:1: declaration Impl has no candidate rule
// impl Default for DOT11_WME_UPDATE_IE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3701:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11_WPA_TSC {
//     pub uReserved: u32,
//     pub dot11OffloadType: DOT11_OFFLOAD_TYPE,
//     pub hOffload: super::super::Foundation::HANDLE,
//     pub dot11IV48Counter: DOT11_IV48_COUNTER,
// }

// UNSUPPORTED Rust 3709:1: declaration Impl has no candidate rule
// impl Default for DOT11_WPA_TSC {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DOT11_WPS_CONFIG_METHOD` = Int;
public const val `DOT11_WPS_CONFIG_METHOD_DISPLAY`: `DOT11_WPS_CONFIG_METHOD` = 8;
public const val `DOT11_WPS_CONFIG_METHOD_KEYPAD`: `DOT11_WPS_CONFIG_METHOD` = 256;
public const val `DOT11_WPS_CONFIG_METHOD_NFC_INTERFACE`: `DOT11_WPS_CONFIG_METHOD` = 64;
public const val `DOT11_WPS_CONFIG_METHOD_NFC_TAG`: `DOT11_WPS_CONFIG_METHOD` = 32;
public const val `DOT11_WPS_CONFIG_METHOD_NULL`: `DOT11_WPS_CONFIG_METHOD` = 0;
public const val `DOT11_WPS_CONFIG_METHOD_PUSHBUTTON`: `DOT11_WPS_CONFIG_METHOD` = 128;
public const val `DOT11_WPS_CONFIG_METHOD_WFDS_DEFAULT`: `DOT11_WPS_CONFIG_METHOD` = 4096;
// UNSUPPORTED Rust 3722:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOT11_WPS_DEVICE_NAME {
//     pub uDeviceNameLength: u32,
//     pub ucDeviceName: [u8; 32],
// }

// UNSUPPORTED Rust 3728:1: declaration Impl has no candidate rule
// impl Default for DOT11_WPS_DEVICE_NAME {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DOT11_WPS_DEVICE_NAME_MAX_LENGTH`: UInt = 32u;
public typealias `DOT11_WPS_DEVICE_PASSWORD_ID` = Int;
public const val `DOT11_WPS_MAX_MODEL_NAME_LENGTH`: UInt = 32u;
public const val `DOT11_WPS_MAX_MODEL_NUMBER_LENGTH`: UInt = 32u;
public const val `DOT11_WPS_MAX_PASSKEY_LENGTH`: UInt = 8u;
public const val `DOT11_WPS_PASSWORD_ID_DEFAULT`: `DOT11_WPS_DEVICE_PASSWORD_ID` = 0;
public const val `DOT11_WPS_PASSWORD_ID_MACHINE_SPECIFIED`: `DOT11_WPS_DEVICE_PASSWORD_ID` = 2;
public const val `DOT11_WPS_PASSWORD_ID_NFC_CONNECTION_HANDOVER`: `DOT11_WPS_DEVICE_PASSWORD_ID` = 7;
public const val `DOT11_WPS_PASSWORD_ID_OOB_RANGE_MAX`: `DOT11_WPS_DEVICE_PASSWORD_ID` = 65535;
public const val `DOT11_WPS_PASSWORD_ID_OOB_RANGE_MIN`: `DOT11_WPS_DEVICE_PASSWORD_ID` = 16;
public const val `DOT11_WPS_PASSWORD_ID_PUSHBUTTON`: `DOT11_WPS_DEVICE_PASSWORD_ID` = 4;
public const val `DOT11_WPS_PASSWORD_ID_REGISTRAR_SPECIFIED`: `DOT11_WPS_DEVICE_PASSWORD_ID` = 5;
public const val `DOT11_WPS_PASSWORD_ID_REKEY`: `DOT11_WPS_DEVICE_PASSWORD_ID` = 3;
public const val `DOT11_WPS_PASSWORD_ID_USER_SPECIFIED`: `DOT11_WPS_DEVICE_PASSWORD_ID` = 1;
public const val `DOT11_WPS_PASSWORD_ID_WFD_SERVICES`: `DOT11_WPS_DEVICE_PASSWORD_ID` = 8;
public const val `DOT11_WPS_VERSION_1_0`: UInt = 1u;
public const val `DOT11_WPS_VERSION_2_0`: UInt = 2u;
public const val `DevProp_PciDevice_AcsCompatibleUpHierarchy_Enhanced`: `DEVPROP_PCIDEVICE_ACSCOMPATIBLEUPHIERARCHY` = 4u;
public const val `DevProp_PciDevice_AcsCompatibleUpHierarchy_NoP2PSupported`: `DEVPROP_PCIDEVICE_ACSCOMPATIBLEUPHIERARCHY` = 2u;
public const val `DevProp_PciDevice_AcsCompatibleUpHierarchy_NotSupported`: `DEVPROP_PCIDEVICE_ACSCOMPATIBLEUPHIERARCHY` = 0u;
public const val `DevProp_PciDevice_AcsCompatibleUpHierarchy_SingleFunctionSupported`: `DEVPROP_PCIDEVICE_ACSCOMPATIBLEUPHIERARCHY` = 1u;
public const val `DevProp_PciDevice_AcsCompatibleUpHierarchy_Supported`: `DEVPROP_PCIDEVICE_ACSCOMPATIBLEUPHIERARCHY` = 3u;
public const val `DevProp_PciDevice_AcsSupport_Missing`: `DEVPROP_PCIDEVICE_ACSSUPPORT` = 2u;
public const val `DevProp_PciDevice_AcsSupport_NotNeeded`: `DEVPROP_PCIDEVICE_ACSSUPPORT` = 1u;
public const val `DevProp_PciDevice_AcsSupport_Present`: `DEVPROP_PCIDEVICE_ACSSUPPORT` = 0u;
public const val `DevProp_PciDevice_BridgeType_PciConventional`: `DEVPROP_PCIDEVICE_DEVICEBRIDGETYPE` = 6u;
public const val `DevProp_PciDevice_BridgeType_PciExpressDownstreamSwitchPort`: `DEVPROP_PCIDEVICE_DEVICEBRIDGETYPE` = 10u;
public const val `DevProp_PciDevice_BridgeType_PciExpressEventCollector`: `DEVPROP_PCIDEVICE_DEVICEBRIDGETYPE` = 14u;
public const val `DevProp_PciDevice_BridgeType_PciExpressRootPort`: `DEVPROP_PCIDEVICE_DEVICEBRIDGETYPE` = 8u;
public const val `DevProp_PciDevice_BridgeType_PciExpressToPciXBridge`: `DEVPROP_PCIDEVICE_DEVICEBRIDGETYPE` = 11u;
public const val `DevProp_PciDevice_BridgeType_PciExpressTreatedAsPci`: `DEVPROP_PCIDEVICE_DEVICEBRIDGETYPE` = 13u;
public const val `DevProp_PciDevice_BridgeType_PciExpressUpstreamSwitchPort`: `DEVPROP_PCIDEVICE_DEVICEBRIDGETYPE` = 9u;
public const val `DevProp_PciDevice_BridgeType_PciX`: `DEVPROP_PCIDEVICE_DEVICEBRIDGETYPE` = 7u;
public const val `DevProp_PciDevice_BridgeType_PciXToExpressBridge`: `DEVPROP_PCIDEVICE_DEVICEBRIDGETYPE` = 12u;
public const val `DevProp_PciDevice_CurrentSpeedAndMode_PciX_Mode1_100Mhz`: `DEVPROP_PCIDEVICE_CURRENTSPEEDANDMODE` = 2u;
public const val `DevProp_PciDevice_CurrentSpeedAndMode_PciX_Mode1_133MHZ`: `DEVPROP_PCIDEVICE_CURRENTSPEEDANDMODE` = 3u;
public const val `DevProp_PciDevice_CurrentSpeedAndMode_PciX_Mode1_66Mhz`: `DEVPROP_PCIDEVICE_CURRENTSPEEDANDMODE` = 1u;
public const val `DevProp_PciDevice_CurrentSpeedAndMode_PciX_Mode1_ECC_100Mhz`: `DEVPROP_PCIDEVICE_CURRENTSPEEDANDMODE` = 6u;
public const val `DevProp_PciDevice_CurrentSpeedAndMode_PciX_Mode1_ECC_133Mhz`: `DEVPROP_PCIDEVICE_CURRENTSPEEDANDMODE` = 7u;
public const val `DevProp_PciDevice_CurrentSpeedAndMode_PciX_Mode1_ECC_66Mhz`: `DEVPROP_PCIDEVICE_CURRENTSPEEDANDMODE` = 5u;
public const val `DevProp_PciDevice_CurrentSpeedAndMode_PciX_Mode2_266_100MHz`: `DEVPROP_PCIDEVICE_CURRENTSPEEDANDMODE` = 10u;
public const val `DevProp_PciDevice_CurrentSpeedAndMode_PciX_Mode2_266_133MHz`: `DEVPROP_PCIDEVICE_CURRENTSPEEDANDMODE` = 11u;
public const val `DevProp_PciDevice_CurrentSpeedAndMode_PciX_Mode2_266_66MHz`: `DEVPROP_PCIDEVICE_CURRENTSPEEDANDMODE` = 9u;
public const val `DevProp_PciDevice_CurrentSpeedAndMode_PciX_Mode2_533_100MHz`: `DEVPROP_PCIDEVICE_CURRENTSPEEDANDMODE` = 14u;
public const val `DevProp_PciDevice_CurrentSpeedAndMode_PciX_Mode2_533_133MHz`: `DEVPROP_PCIDEVICE_CURRENTSPEEDANDMODE` = 15u;
public const val `DevProp_PciDevice_CurrentSpeedAndMode_PciX_Mode2_533_66MHz`: `DEVPROP_PCIDEVICE_CURRENTSPEEDANDMODE` = 13u;
public const val `DevProp_PciDevice_CurrentSpeedAndMode_PciX_Mode_Conventional_Pci`: `DEVPROP_PCIDEVICE_CURRENTSPEEDANDMODE` = 0u;
public const val `DevProp_PciDevice_CurrentSpeedAndMode_Pci_Conventional_33MHz`: `DEVPROP_PCIDEVICE_CURRENTSPEEDANDMODE` = 0u;
public const val `DevProp_PciDevice_CurrentSpeedAndMode_Pci_Conventional_66MHz`: `DEVPROP_PCIDEVICE_CURRENTSPEEDANDMODE` = 1u;
public const val `DevProp_PciDevice_DeviceType_PciConventional`: `DEVPROP_PCIDEVICE_DEVICEBRIDGETYPE` = 0u;
public const val `DevProp_PciDevice_DeviceType_PciExpressEndpoint`: `DEVPROP_PCIDEVICE_DEVICEBRIDGETYPE` = 2u;
public const val `DevProp_PciDevice_DeviceType_PciExpressLegacyEndpoint`: `DEVPROP_PCIDEVICE_DEVICEBRIDGETYPE` = 3u;
public const val `DevProp_PciDevice_DeviceType_PciExpressRootComplexIntegratedEndpoint`: `DEVPROP_PCIDEVICE_DEVICEBRIDGETYPE` = 4u;
public const val `DevProp_PciDevice_DeviceType_PciExpressTreatedAsPci`: `DEVPROP_PCIDEVICE_DEVICEBRIDGETYPE` = 5u;
public const val `DevProp_PciDevice_DeviceType_PciX`: `DEVPROP_PCIDEVICE_DEVICEBRIDGETYPE` = 1u;
public const val `DevProp_PciDevice_InterruptType_LineBased`: `DEVPROP_PCIDEVICE_INTERRUPTTYPE` = 1u;
public const val `DevProp_PciDevice_InterruptType_Msi`: `DEVPROP_PCIDEVICE_INTERRUPTTYPE` = 2u;
public const val `DevProp_PciDevice_InterruptType_MsiX`: `DEVPROP_PCIDEVICE_INTERRUPTTYPE` = 4u;
public const val `DevProp_PciDevice_SriovSupport_DidntGetVfBarSpace`: `DEVPROP_PCIDEVICE_SRIOVSUPPORT` = 4u;
public const val `DevProp_PciDevice_SriovSupport_MissingAcs`: `DEVPROP_PCIDEVICE_SRIOVSUPPORT` = 1u;
public const val `DevProp_PciDevice_SriovSupport_MissingPfDriver`: `DEVPROP_PCIDEVICE_SRIOVSUPPORT` = 2u;
public const val `DevProp_PciDevice_SriovSupport_NoBusResource`: `DEVPROP_PCIDEVICE_SRIOVSUPPORT` = 3u;
public const val `DevProp_PciDevice_SriovSupport_Ok`: `DEVPROP_PCIDEVICE_SRIOVSUPPORT` = 0u;
public const val `DevProp_PciExpressDevice_LinkSpeed_Five_Gbps`: `DEVPROP_PCIEXPRESSDEVICE_LINKSPEED` = 2u;
public const val `DevProp_PciExpressDevice_LinkSpeed_TwoAndHalf_Gbps`: `DEVPROP_PCIEXPRESSDEVICE_LINKSPEED` = 1u;
public const val `DevProp_PciExpressDevice_LinkWidth_By_1`: `DEVPROP_PCIEXPRESSDEVICE_LINKWIDTH` = 1u;
public const val `DevProp_PciExpressDevice_LinkWidth_By_12`: `DEVPROP_PCIEXPRESSDEVICE_LINKWIDTH` = 12u;
public const val `DevProp_PciExpressDevice_LinkWidth_By_16`: `DEVPROP_PCIEXPRESSDEVICE_LINKWIDTH` = 16u;
public const val `DevProp_PciExpressDevice_LinkWidth_By_2`: `DEVPROP_PCIEXPRESSDEVICE_LINKWIDTH` = 2u;
public const val `DevProp_PciExpressDevice_LinkWidth_By_32`: `DEVPROP_PCIEXPRESSDEVICE_LINKWIDTH` = 32u;
public const val `DevProp_PciExpressDevice_LinkWidth_By_4`: `DEVPROP_PCIEXPRESSDEVICE_LINKWIDTH` = 4u;
public const val `DevProp_PciExpressDevice_LinkWidth_By_8`: `DEVPROP_PCIEXPRESSDEVICE_LINKWIDTH` = 8u;
public const val `DevProp_PciExpressDevice_PayloadOrRequestSize_1024Bytes`: `DEVPROP_PCIEXPRESSDEVICE_PAYLOADORREQUESTSIZE` = 3u;
public const val `DevProp_PciExpressDevice_PayloadOrRequestSize_128Bytes`: `DEVPROP_PCIEXPRESSDEVICE_PAYLOADORREQUESTSIZE` = 0u;
public const val `DevProp_PciExpressDevice_PayloadOrRequestSize_2048Bytes`: `DEVPROP_PCIEXPRESSDEVICE_PAYLOADORREQUESTSIZE` = 4u;
public const val `DevProp_PciExpressDevice_PayloadOrRequestSize_256Bytes`: `DEVPROP_PCIEXPRESSDEVICE_PAYLOADORREQUESTSIZE` = 1u;
public const val `DevProp_PciExpressDevice_PayloadOrRequestSize_4096Bytes`: `DEVPROP_PCIEXPRESSDEVICE_PAYLOADORREQUESTSIZE` = 5u;
public const val `DevProp_PciExpressDevice_PayloadOrRequestSize_512Bytes`: `DEVPROP_PCIEXPRESSDEVICE_PAYLOADORREQUESTSIZE` = 2u;
public const val `DevProp_PciExpressDevice_Spec_Version_10`: `DEVPROP_PCIEXPRESSDEVICE_SPEC_VERSION` = 1u;
public const val `DevProp_PciExpressDevice_Spec_Version_11`: `DEVPROP_PCIEXPRESSDEVICE_SPEC_VERSION` = 2u;
public const val `DevProp_PciRootBus_BusWidth_32Bits`: `DEVPROP_PCIROOTBUS_BUSWIDTH` = 0u;
public const val `DevProp_PciRootBus_BusWidth_64Bits`: `DEVPROP_PCIROOTBUS_BUSWIDTH` = 1u;
public const val `DevProp_PciRootBus_CurrentSpeedAndMode_Pci_Conventional_33Mhz`: `DEVPROP_PCIROOTBUS_CURRENTSPEEDANDMODE` = 0u;
public const val `DevProp_PciRootBus_CurrentSpeedAndMode_Pci_Conventional_66Mhz`: `DEVPROP_PCIROOTBUS_CURRENTSPEEDANDMODE` = 1u;
public const val `DevProp_PciRootBus_CurrentSpeedAndMode_Pci_X_266_Mode2_100Mhz`: `DEVPROP_PCIROOTBUS_CURRENTSPEEDANDMODE` = 9u;
public const val `DevProp_PciRootBus_CurrentSpeedAndMode_Pci_X_266_Mode2_133Mhz`: `DEVPROP_PCIROOTBUS_CURRENTSPEEDANDMODE` = 10u;
public const val `DevProp_PciRootBus_CurrentSpeedAndMode_Pci_X_266_Mode2_66Mhz`: `DEVPROP_PCIROOTBUS_CURRENTSPEEDANDMODE` = 8u;
public const val `DevProp_PciRootBus_CurrentSpeedAndMode_Pci_X_533_Mode2_100Mhz`: `DEVPROP_PCIROOTBUS_CURRENTSPEEDANDMODE` = 12u;
public const val `DevProp_PciRootBus_CurrentSpeedAndMode_Pci_X_533_Mode2_133Mhz`: `DEVPROP_PCIROOTBUS_CURRENTSPEEDANDMODE` = 13u;
public const val `DevProp_PciRootBus_CurrentSpeedAndMode_Pci_X_533_Mode2_66Mhz`: `DEVPROP_PCIROOTBUS_CURRENTSPEEDANDMODE` = 11u;
public const val `DevProp_PciRootBus_CurrentSpeedAndMode_Pci_X_Mode1_100Mhz`: `DEVPROP_PCIROOTBUS_CURRENTSPEEDANDMODE` = 3u;
public const val `DevProp_PciRootBus_CurrentSpeedAndMode_Pci_X_Mode1_133Mhz`: `DEVPROP_PCIROOTBUS_CURRENTSPEEDANDMODE` = 4u;
public const val `DevProp_PciRootBus_CurrentSpeedAndMode_Pci_X_Mode1_66Mhz`: `DEVPROP_PCIROOTBUS_CURRENTSPEEDANDMODE` = 2u;
public const val `DevProp_PciRootBus_CurrentSpeedAndMode_Pci_X_Mode1_ECC_100Mhz`: `DEVPROP_PCIROOTBUS_CURRENTSPEEDANDMODE` = 6u;
public const val `DevProp_PciRootBus_CurrentSpeedAndMode_Pci_X_Mode1_ECC_133Mhz`: `DEVPROP_PCIROOTBUS_CURRENTSPEEDANDMODE` = 7u;
public const val `DevProp_PciRootBus_CurrentSpeedAndMode_Pci_X_Mode1_ECC_66Mhz`: `DEVPROP_PCIROOTBUS_CURRENTSPEEDANDMODE` = 5u;
public const val `DevProp_PciRootBus_SecondaryInterface_PciConventional`: `DEVPROP_PCIROOTBUS_SECONDARYINTERFACE` = 0u;
public const val `DevProp_PciRootBus_SecondaryInterface_PciExpress`: `DEVPROP_PCIROOTBUS_SECONDARYINTERFACE` = 3u;
public const val `DevProp_PciRootBus_SecondaryInterface_PciXMode1`: `DEVPROP_PCIROOTBUS_SECONDARYINTERFACE` = 1u;
public const val `DevProp_PciRootBus_SecondaryInterface_PciXMode2`: `DEVPROP_PCIROOTBUS_SECONDARYINTERFACE` = 2u;
public const val `DevProp_PciRootBus_SupportedSpeedsAndModes_Pci_Conventional_33Mhz`: `DEVPROP_PCIROOTBUS_SUPPORTEDSPEEDSANDMODES` = 1u;
public const val `DevProp_PciRootBus_SupportedSpeedsAndModes_Pci_Conventional_66Mhz`: `DEVPROP_PCIROOTBUS_SUPPORTEDSPEEDSANDMODES` = 2u;
public const val `DevProp_PciRootBus_SupportedSpeedsAndModes_Pci_X_133Mhz`: `DEVPROP_PCIROOTBUS_SUPPORTEDSPEEDSANDMODES` = 8u;
public const val `DevProp_PciRootBus_SupportedSpeedsAndModes_Pci_X_266Mhz`: `DEVPROP_PCIROOTBUS_SUPPORTEDSPEEDSANDMODES` = 16u;
public const val `DevProp_PciRootBus_SupportedSpeedsAndModes_Pci_X_533Mhz`: `DEVPROP_PCIROOTBUS_SUPPORTEDSPEEDSANDMODES` = 32u;
public const val `DevProp_PciRootBus_SupportedSpeedsAndModes_Pci_X_66Mhz`: `DEVPROP_PCIROOTBUS_SUPPORTEDSPEEDSANDMODES` = 4u;
// UNSUPPORTED Rust 3839:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Dot11AdHocManager: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdd06a84f_83bd_4d01_8ab9_2389fea0869e);

// UNSUPPORTED Rust 3840:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_AEPSERVICE_WIFIDIRECT_DEVICE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcc29827c_9caf_4928_99a9_18f7c2381389);

// UNSUPPORTED Rust 3841:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVINTERFACE_ASP_INFRA_DEVICE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xff823995_7a72_4c80_8757_c67ee13d1a49);

// UNSUPPORTED Rust 3842:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVINTERFACE_WIFIDIRECT_DEVICE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x439b20af_8955_405b_99f0_a62af0c68d43);

// UNSUPPORTED Rust 3843:1: non-scalar type Ptr unsupported
// pub const IHV_INIT_FUNCTION_NAME: windows_sys::core::PCSTR = windows_sys::core::s!("Dot11ExtIhvInitService");

// UNSUPPORTED Rust 3844:1: non-scalar type Ptr unsupported
// pub const IHV_INIT_VS_FUNCTION_NAME: windows_sys::core::PCSTR = windows_sys::core::s!("Dot11ExtIhvInitVirtualStation");

// UNSUPPORTED Rust 3845:1: non-scalar type Ptr unsupported
// pub const IHV_VERSION_FUNCTION_NAME: windows_sys::core::PCSTR = windows_sys::core::s!("Dot11ExtIhvGetVersionInfo");

public const val `IndicationTypeLinkQuality`: `DOT11EXT_IHV_INDICATION_TYPE` = 4;
public const val `IndicationTypeNicSpecificNotification`: `DOT11EXT_IHV_INDICATION_TYPE` = 0;
public const val `IndicationTypePhyStateChange`: `DOT11EXT_IHV_INDICATION_TYPE` = 3;
public const val `IndicationTypePmkidCandidateList`: `DOT11EXT_IHV_INDICATION_TYPE` = 1;
public const val `IndicationTypeTkipMicFailure`: `DOT11EXT_IHV_INDICATION_TYPE` = 2;
public const val `L2_NOTIFICATION_CODE_GROUP_SIZE`: UInt = 4096u;
public const val `L2_NOTIFICATION_CODE_PUBLIC_BEGIN`: UInt = 0u;
// UNSUPPORTED Rust 3853:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct L2_NOTIFICATION_DATA {
//     pub NotificationSource: WLAN_NOTIFICATION_SOURCES,
//     pub NotificationCode: u32,
//     pub InterfaceGuid: windows_sys::core::GUID,
//     pub dwDataSize: u32,
//     pub pData: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 3862:1: declaration Impl has no candidate rule
// impl Default for L2_NOTIFICATION_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `L2_NOTIFICATION_SOURCE_ALL`: UInt = 65535u;
public const val `L2_NOTIFICATION_SOURCE_DOT3_AUTO_CONFIG`: UInt = 1u;
public const val `L2_NOTIFICATION_SOURCE_NONE`: UInt = 0u;
public const val `L2_NOTIFICATION_SOURCE_ONEX`: UInt = 4u;
public const val `L2_NOTIFICATION_SOURCE_SECURITY`: UInt = 2u;
public const val `L2_NOTIFICATION_SOURCE_WCM`: UInt = 256u;
public const val `L2_NOTIFICATION_SOURCE_WCM_CSP`: UInt = 512u;
public const val `L2_NOTIFICATION_SOURCE_WFD`: UInt = 1024u;
public const val `L2_NOTIFICATION_SOURCE_WLAN_ACM`: UInt = 8u;
public const val `L2_NOTIFICATION_SOURCE_WLAN_DEVICE_SERVICE`: UInt = 2048u;
public const val `L2_NOTIFICATION_SOURCE_WLAN_HNWK`: UInt = 128u;
public const val `L2_NOTIFICATION_SOURCE_WLAN_IHV`: UInt = 64u;
public const val `L2_NOTIFICATION_SOURCE_WLAN_MSM`: UInt = 16u;
public const val `L2_NOTIFICATION_SOURCE_WLAN_SECURITY`: UInt = 32u;
public const val `L2_PROFILE_MAX_NAME_LENGTH`: UInt = 256u;
public const val `L2_REASON_CODE_DOT11_AC_BASE`: UInt = 131072u;
public const val `L2_REASON_CODE_DOT11_MSM_BASE`: UInt = 196608u;
public const val `L2_REASON_CODE_DOT11_SECURITY_BASE`: UInt = 262144u;
public const val `L2_REASON_CODE_DOT3_AC_BASE`: UInt = 393216u;
public const val `L2_REASON_CODE_DOT3_MSM_BASE`: UInt = 458752u;
public const val `L2_REASON_CODE_GEN_BASE`: UInt = 65536u;
public const val `L2_REASON_CODE_GROUP_SIZE`: UInt = 65536u;
public const val `L2_REASON_CODE_IHV_BASE`: UInt = 589824u;
public const val `L2_REASON_CODE_ONEX_BASE`: UInt = 327680u;
public const val `L2_REASON_CODE_PROFILE_BASE`: UInt = 524288u;
public const val `L2_REASON_CODE_PROFILE_MISSING`: UInt = 1u;
public const val `L2_REASON_CODE_RESERVED_BASE`: UInt = 720896u;
public const val `L2_REASON_CODE_SUCCESS`: UInt = 0u;
public const val `L2_REASON_CODE_UNKNOWN`: UInt = 65537u;
public const val `L2_REASON_CODE_WIMAX_BASE`: UInt = 655360u;
public const val `MAX_NUM_SUPPORTED_RATES`: UInt = 8u;
public const val `MAX_NUM_SUPPORTED_RATES_V2`: UInt = 255u;
public const val `MS_MAX_PROFILE_NAME_LENGTH`: UInt = 256u;
public const val `MS_PROFILE_GROUP_POLICY`: UInt = 1u;
public const val `MS_PROFILE_USER`: UInt = 2u;
public const val `NDIS_PACKET_TYPE_802_11_ALL_MULTICAST_DATA`: UInt = 4u;
public const val `NDIS_PACKET_TYPE_802_11_BROADCAST_DATA`: UInt = 8u;
public const val `NDIS_PACKET_TYPE_802_11_DIRECTED_DATA`: UInt = 1u;
public const val `NDIS_PACKET_TYPE_802_11_MULTICAST_DATA`: UInt = 2u;
public const val `NDIS_PACKET_TYPE_802_11_PROMISCUOUS_DATA`: UInt = 32u;
public const val `OID_DOT11_AP_JOIN_REQUEST`: UInt = 218170205u;
public const val `OID_DOT11_ATIM_WINDOW`: UInt = 218170122u;
public const val `OID_DOT11_BEACON_PERIOD`: UInt = 218170139u;
public const val `OID_DOT11_CCA_MODE_SUPPORTED`: UInt = 218170166u;
public const val `OID_DOT11_CCA_WATCHDOG_COUNT_MAX`: UInt = 218170170u;
public const val `OID_DOT11_CCA_WATCHDOG_COUNT_MIN`: UInt = 218170172u;
public const val `OID_DOT11_CCA_WATCHDOG_TIMER_MAX`: UInt = 218170169u;
public const val `OID_DOT11_CCA_WATCHDOG_TIMER_MIN`: UInt = 218170171u;
public const val `OID_DOT11_CFP_MAX_DURATION`: UInt = 218170136u;
public const val `OID_DOT11_CFP_PERIOD`: UInt = 218170135u;
public const val `OID_DOT11_CF_POLLABLE`: UInt = 218170134u;
public const val `OID_DOT11_CHANNEL_AGILITY_ENABLED`: UInt = 218170184u;
public const val `OID_DOT11_CHANNEL_AGILITY_PRESENT`: UInt = 218170183u;
public const val `OID_DOT11_COUNTERS_ENTRY`: UInt = 218170149u;
public const val `OID_DOT11_COUNTRY_STRING`: UInt = 218170188u;
public const val `OID_DOT11_CURRENT_ADDRESS`: UInt = 218171138u;
public const val `OID_DOT11_CURRENT_CCA_MODE`: UInt = 218170167u;
public const val `OID_DOT11_CURRENT_CHANNEL`: UInt = 218170165u;
public const val `OID_DOT11_CURRENT_CHANNEL_NUMBER`: UInt = 218170159u;
public const val `OID_DOT11_CURRENT_DWELL_TIME`: UInt = 218170161u;
public const val `OID_DOT11_CURRENT_FREQUENCY`: UInt = 218170178u;
public const val `OID_DOT11_CURRENT_INDEX`: UInt = 218170164u;
public const val `OID_DOT11_CURRENT_OFFLOAD_CAPABILITY`: UInt = 218170113u;
public const val `OID_DOT11_CURRENT_OPERATION_MODE`: UInt = 218170120u;
public const val `OID_DOT11_CURRENT_OPTIONAL_CAPABILITY`: UInt = 218170131u;
public const val `OID_DOT11_CURRENT_PACKET_FILTER`: UInt = 218170121u;
public const val `OID_DOT11_CURRENT_PATTERN`: UInt = 218170163u;
public const val `OID_DOT11_CURRENT_PHY_TYPE`: UInt = 218170124u;
public const val `OID_DOT11_CURRENT_REG_DOMAIN`: UInt = 218170151u;
public const val `OID_DOT11_CURRENT_RX_ANTENNA`: UInt = 218170155u;
public const val `OID_DOT11_CURRENT_SET`: UInt = 218170162u;
public const val `OID_DOT11_CURRENT_TX_ANTENNA`: UInt = 218170153u;
public const val `OID_DOT11_CURRENT_TX_POWER_LEVEL`: UInt = 218170157u;
public const val `OID_DOT11_DEFAULT_WEP_OFFLOAD`: UInt = 218170116u;
public const val `OID_DOT11_DEFAULT_WEP_UPLOAD`: UInt = 218170117u;
public const val `OID_DOT11_DIVERSITY_SELECTION_RX`: UInt = 218170176u;
public const val `OID_DOT11_DIVERSITY_SUPPORT`: UInt = 218170154u;
public const val `OID_DOT11_DSSS_OFDM_OPTION_ENABLED`: UInt = 218170209u;
public const val `OID_DOT11_DSSS_OFDM_OPTION_IMPLEMENTED`: UInt = 218170208u;
public const val `OID_DOT11_DTIM_PERIOD`: UInt = 218170140u;
public const val `OID_DOT11_ED_THRESHOLD`: UInt = 218170168u;
public const val `OID_DOT11_EHCC_CAPABILITY_ENABLED`: UInt = 218170193u;
public const val `OID_DOT11_EHCC_CAPABILITY_IMPLEMENTED`: UInt = 218170192u;
public const val `OID_DOT11_EHCC_NUMBER_OF_CHANNELS_FAMILY_INDEX`: UInt = 218170191u;
public const val `OID_DOT11_EHCC_PRIME_RADIX`: UInt = 218170190u;
public const val `OID_DOT11_ERP_PBCC_OPTION_ENABLED`: UInt = 218170207u;
public const val `OID_DOT11_ERP_PBCC_OPTION_IMPLEMENTED`: UInt = 218170206u;
public const val `OID_DOT11_FRAGMENTATION_THRESHOLD`: UInt = 218170146u;
public const val `OID_DOT11_FREQUENCY_BANDS_SUPPORTED`: UInt = 218170180u;
public const val `OID_DOT11_HOPPING_PATTERN`: UInt = 218170199u;
public const val `OID_DOT11_HOP_ALGORITHM_ADOPTED`: UInt = 218170194u;
public const val `OID_DOT11_HOP_MODULUS`: UInt = 218170197u;
public const val `OID_DOT11_HOP_OFFSET`: UInt = 218170198u;
public const val `OID_DOT11_HOP_TIME`: UInt = 218170158u;
public const val `OID_DOT11_HR_CCA_MODE_SUPPORTED`: UInt = 218170185u;
public const val `OID_DOT11_JOIN_REQUEST`: UInt = 218170125u;
public const val `OID_DOT11_LONG_RETRY_LIMIT`: UInt = 218170145u;
public const val `OID_DOT11_MAC_ADDRESS`: UInt = 218170142u;
public const val `OID_DOT11_MAXIMUM_LIST_SIZE`: UInt = 218171141u;
public const val `OID_DOT11_MAX_DWELL_TIME`: UInt = 218170160u;
public const val `OID_DOT11_MAX_MAC_ADDRESS_STATES`: UInt = 218170212u;
public const val `OID_DOT11_MAX_RECEIVE_LIFETIME`: UInt = 218170148u;
public const val `OID_DOT11_MAX_TRANSMIT_MSDU_LIFETIME`: UInt = 218170147u;
public const val `OID_DOT11_MEDIUM_OCCUPANCY_LIMIT`: UInt = 218170133u;
public const val `OID_DOT11_MPDU_MAX_LENGTH`: UInt = 218170118u;
public const val `OID_DOT11_MULTICAST_LIST`: UInt = 218171140u;
public const val `OID_DOT11_MULTI_DOMAIN_CAPABILITY`: UInt = 218170189u;
public const val `OID_DOT11_MULTI_DOMAIN_CAPABILITY_ENABLED`: UInt = 218170187u;
public const val `OID_DOT11_MULTI_DOMAIN_CAPABILITY_IMPLEMENTED`: UInt = 218170186u;
public const val `OID_DOT11_NDIS_START`: UInt = 218170112u;
public const val `OID_DOT11_NIC_POWER_STATE`: UInt = 218170129u;
public const val `OID_DOT11_NIC_SPECIFIC_EXTENSION`: UInt = 218170204u;
public const val `OID_DOT11_NUMBER_OF_HOPPING_SETS`: UInt = 218170196u;
public const val `OID_DOT11_OFFLOAD_CAPABILITY`: UInt = 218170112u;
public const val `OID_DOT11_OPERATIONAL_RATE_SET`: UInt = 218170138u;
public const val `OID_DOT11_OPERATION_MODE_CAPABILITY`: UInt = 218170119u;
public const val `OID_DOT11_OPTIONAL_CAPABILITY`: UInt = 218170130u;
public const val `OID_DOT11_PBCC_OPTION_IMPLEMENTED`: UInt = 218170182u;
public const val `OID_DOT11_PERMANENT_ADDRESS`: UInt = 218171139u;
public const val `OID_DOT11_POWER_MGMT_MODE`: UInt = 218170137u;
public const val `OID_DOT11_PRIVATE_OIDS_START`: UInt = 218171136u;
public const val `OID_DOT11_QOS_TX_DURATION`: UInt = 218170219u;
public const val `OID_DOT11_QOS_TX_MEDIUM_TIME`: UInt = 218170220u;
public const val `OID_DOT11_QOS_TX_QUEUES_SUPPORTED`: UInt = 218170218u;
public const val `OID_DOT11_RANDOM_TABLE_FIELD_NUMBER`: UInt = 218170200u;
public const val `OID_DOT11_RANDOM_TABLE_FLAG`: UInt = 218170195u;
public const val `OID_DOT11_RECV_SENSITIVITY_LIST`: UInt = 218170213u;
public const val `OID_DOT11_REG_DOMAINS_SUPPORT_VALUE`: UInt = 218170173u;
public const val `OID_DOT11_RESET_REQUEST`: UInt = 218170128u;
public const val `OID_DOT11_RF_USAGE`: UInt = 218170203u;
public const val `OID_DOT11_RSSI_RANGE`: UInt = 218170202u;
public const val `OID_DOT11_RTS_THRESHOLD`: UInt = 218170143u;
public const val `OID_DOT11_SCAN_REQUEST`: UInt = 218170123u;
public const val `OID_DOT11_SHORT_PREAMBLE_OPTION_IMPLEMENTED`: UInt = 218170181u;
public const val `OID_DOT11_SHORT_RETRY_LIMIT`: UInt = 218170144u;
public const val `OID_DOT11_SHORT_SLOT_TIME_OPTION_ENABLED`: UInt = 218170211u;
public const val `OID_DOT11_SHORT_SLOT_TIME_OPTION_IMPLEMENTED`: UInt = 218170210u;
public const val `OID_DOT11_START_REQUEST`: UInt = 218170126u;
public const val `OID_DOT11_STATION_ID`: UInt = 218170132u;
public const val `OID_DOT11_SUPPORTED_DATA_RATES_VALUE`: UInt = 218170177u;
public const val `OID_DOT11_SUPPORTED_DSSS_CHANNEL_LIST`: UInt = 218170222u;
public const val `OID_DOT11_SUPPORTED_OFDM_FREQUENCY_LIST`: UInt = 218170221u;
public const val `OID_DOT11_SUPPORTED_PHY_TYPES`: UInt = 218170150u;
public const val `OID_DOT11_SUPPORTED_POWER_LEVELS`: UInt = 218170156u;
public const val `OID_DOT11_SUPPORTED_RX_ANTENNA`: UInt = 218170175u;
public const val `OID_DOT11_SUPPORTED_TX_ANTENNA`: UInt = 218170174u;
public const val `OID_DOT11_TEMP_TYPE`: UInt = 218170152u;
public const val `OID_DOT11_TI_THRESHOLD`: UInt = 218170179u;
public const val `OID_DOT11_UPDATE_IE`: UInt = 218170127u;
public const val `OID_DOT11_WEP_ICV_ERROR_COUNT`: UInt = 218170141u;
public const val `OID_DOT11_WEP_OFFLOAD`: UInt = 218170114u;
public const val `OID_DOT11_WEP_UPLOAD`: UInt = 218170115u;
public const val `OID_DOT11_WME_AC_PARAMETERS`: UInt = 218170216u;
public const val `OID_DOT11_WME_ENABLED`: UInt = 218170215u;
public const val `OID_DOT11_WME_IMPLEMENTED`: UInt = 218170214u;
public const val `OID_DOT11_WME_UPDATE_IE`: UInt = 218170217u;
public const val `OID_DOT11_WPA_TSC`: UInt = 218170201u;
public const val `ONEX_AUTHENTICATOR_NO_LONGER_PRESENT`: `ONEX_REASON_CODE` = 327686;
public typealias `ONEX_AUTH_IDENTITY` = Int;
// UNSUPPORTED Rust 4026:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ONEX_AUTH_PARAMS {
//     pub fUpdatePending: windows_sys::core::BOOL,
//     pub oneXConnProfile: ONEX_VARIABLE_BLOB,
//     pub authIdentity: ONEX_AUTH_IDENTITY,
//     pub dwQuarantineState: u32,
//     pub _bitfield: u32,
//     pub dwSessionId: u32,
//     pub hUserToken: super::super::Foundation::HANDLE,
//     pub OneXUserProfile: ONEX_VARIABLE_BLOB,
//     pub Identity: ONEX_VARIABLE_BLOB,
//     pub UserName: ONEX_VARIABLE_BLOB,
//     pub Domain: ONEX_VARIABLE_BLOB,
// }

// UNSUPPORTED Rust 4041:1: declaration Impl has no candidate rule
// impl Default for ONEX_AUTH_PARAMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `ONEX_AUTH_RESTART_REASON` = Int;
public typealias `ONEX_AUTH_STATUS` = Int;
// UNSUPPORTED Rust 4048:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_ExtensibleAuthenticationProtocol")]
// #[derive(Clone, Copy, Default)]
// pub struct ONEX_EAP_ERROR {
//     pub dwWinError: u32,
//     pub r#type: super::super::Security::ExtensibleAuthenticationProtocol::EAP_METHOD_TYPE,
//     pub dwReasonCode: u32,
//     pub rootCauseGuid: windows_sys::core::GUID,
//     pub repairGuid: windows_sys::core::GUID,
//     pub helpLinkGuid: windows_sys::core::GUID,
//     pub _bitfield: u32,
//     pub RootCauseString: ONEX_VARIABLE_BLOB,
//     pub RepairString: ONEX_VARIABLE_BLOB,
// }

public const val `ONEX_EAP_FAILURE_RECEIVED`: `ONEX_REASON_CODE` = 327685;
public typealias `ONEX_EAP_METHOD_BACKEND_SUPPORT` = Int;
public const val `ONEX_IDENTITY_NOT_FOUND`: `ONEX_REASON_CODE` = 327682;
public typealias `ONEX_NOTIFICATION_TYPE` = Int;
public const val `ONEX_NO_RESPONSE_TO_IDENTITY`: `ONEX_REASON_CODE` = 327687;
public const val `ONEX_PROFILE_DISALLOWED_EAP_TYPE`: `ONEX_REASON_CODE` = 327690;
public const val `ONEX_PROFILE_EXPIRED_EXPLICIT_CREDENTIALS`: `ONEX_REASON_CODE` = 327699;
public const val `ONEX_PROFILE_INVALID_AUTH_MODE`: `ONEX_REASON_CODE` = 327695;
public const val `ONEX_PROFILE_INVALID_EAP_CONNECTION_PROPERTIES`: `ONEX_REASON_CODE` = 327696;
public const val `ONEX_PROFILE_INVALID_EAP_TYPE_OR_FLAG`: `ONEX_REASON_CODE` = 327691;
public const val `ONEX_PROFILE_INVALID_EXPLICIT_CREDENTIALS`: `ONEX_REASON_CODE` = 327698;
public const val `ONEX_PROFILE_INVALID_LENGTH`: `ONEX_REASON_CODE` = 327689;
public const val `ONEX_PROFILE_INVALID_ONEX_FLAGS`: `ONEX_REASON_CODE` = 327692;
public const val `ONEX_PROFILE_INVALID_SUPPLICANT_MODE`: `ONEX_REASON_CODE` = 327694;
public const val `ONEX_PROFILE_INVALID_TIMER_VALUE`: `ONEX_REASON_CODE` = 327693;
public const val `ONEX_PROFILE_VERSION_NOT_SUPPORTED`: `ONEX_REASON_CODE` = 327688;
public typealias `ONEX_REASON_CODE` = Int;
public const val `ONEX_REASON_CODE_SUCCESS`: `ONEX_REASON_CODE` = 0;
public const val `ONEX_REASON_START`: `ONEX_REASON_CODE` = 327680;
// UNSUPPORTED Rust 4081:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ONEX_RESULT_UPDATE_DATA {
//     pub oneXStatus: ONEX_STATUS,
//     pub BackendSupport: ONEX_EAP_METHOD_BACKEND_SUPPORT,
//     pub fBackendEngaged: windows_sys::core::BOOL,
//     pub _bitfield: u32,
//     pub authParams: ONEX_VARIABLE_BLOB,
//     pub eapError: ONEX_VARIABLE_BLOB,
// }

// UNSUPPORTED Rust 4091:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ONEX_STATUS {
//     pub authStatus: ONEX_AUTH_STATUS,
//     pub dwReason: u32,
//     pub dwError: u32,
// }

public const val `ONEX_UI_CANCELLED`: `ONEX_REASON_CODE` = 327697;
public const val `ONEX_UI_DISABLED`: `ONEX_REASON_CODE` = 327683;
public const val `ONEX_UI_FAILURE`: `ONEX_REASON_CODE` = 327684;
public const val `ONEX_UI_NOT_PERMITTED`: `ONEX_REASON_CODE` = 327700;
public const val `ONEX_UNABLE_TO_IDENTIFY_USER`: `ONEX_REASON_CODE` = 327681;
// UNSUPPORTED Rust 4103:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ONEX_USER_INFO {
//     pub authIdentity: ONEX_AUTH_IDENTITY,
//     pub _bitfield: u32,
//     pub UserName: ONEX_VARIABLE_BLOB,
//     pub DomainName: ONEX_VARIABLE_BLOB,
// }

// UNSUPPORTED Rust 4111:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ONEX_VARIABLE_BLOB {
//     pub dwSize: u32,
//     pub dwOffset: u32,
// }

public const val `OneXAuthFailure`: `ONEX_AUTH_STATUS` = 4;
public const val `OneXAuthIdentityExplicitUser`: `ONEX_AUTH_IDENTITY` = 3;
public const val `OneXAuthIdentityGuest`: `ONEX_AUTH_IDENTITY` = 4;
public const val `OneXAuthIdentityInvalid`: `ONEX_AUTH_IDENTITY` = 5;
public const val `OneXAuthIdentityMachine`: `ONEX_AUTH_IDENTITY` = 1;
public const val `OneXAuthIdentityNone`: `ONEX_AUTH_IDENTITY` = 0;
public const val `OneXAuthIdentityUser`: `ONEX_AUTH_IDENTITY` = 2;
public const val `OneXAuthInProgress`: `ONEX_AUTH_STATUS` = 1;
public const val `OneXAuthInvalid`: `ONEX_AUTH_STATUS` = 5;
public const val `OneXAuthNoAuthenticatorFound`: `ONEX_AUTH_STATUS` = 2;
public const val `OneXAuthNotStarted`: `ONEX_AUTH_STATUS` = 0;
public const val `OneXAuthSuccess`: `ONEX_AUTH_STATUS` = 3;
public const val `OneXEapMethodBackendSupportUnknown`: `ONEX_EAP_METHOD_BACKEND_SUPPORT` = 0;
public const val `OneXEapMethodBackendSupported`: `ONEX_EAP_METHOD_BACKEND_SUPPORT` = 1;
public const val `OneXEapMethodBackendUnsupported`: `ONEX_EAP_METHOD_BACKEND_SUPPORT` = 2;
public const val `OneXNotificationTypeAuthRestarted`: `ONEX_NOTIFICATION_TYPE` = 2;
public const val `OneXNotificationTypeEventInvalid`: `ONEX_NOTIFICATION_TYPE` = 3;
public const val `OneXNotificationTypeResultUpdate`: `ONEX_NOTIFICATION_TYPE` = 1;
public const val `OneXNumNotifications`: `ONEX_NOTIFICATION_TYPE` = 3;
public const val `OneXPublicNotificationBase`: `ONEX_NOTIFICATION_TYPE` = 0;
public const val `OneXRestartReasonAltCredsTrial`: `ONEX_AUTH_RESTART_REASON` = 7;
public const val `OneXRestartReasonInvalid`: `ONEX_AUTH_RESTART_REASON` = 8;
public const val `OneXRestartReasonMsmInitiated`: `ONEX_AUTH_RESTART_REASON` = 1;
public const val `OneXRestartReasonOneXAuthTimeout`: `ONEX_AUTH_RESTART_REASON` = 3;
public const val `OneXRestartReasonOneXConfigurationChanged`: `ONEX_AUTH_RESTART_REASON` = 4;
public const val `OneXRestartReasonOneXHeldStateTimeout`: `ONEX_AUTH_RESTART_REASON` = 2;
public const val `OneXRestartReasonOneXUserChanged`: `ONEX_AUTH_RESTART_REASON` = 5;
public const val `OneXRestartReasonPeerInitiated`: `ONEX_AUTH_RESTART_REASON` = 0;
public const val `OneXRestartReasonQuarantineStateChanged`: `ONEX_AUTH_RESTART_REASON` = 6;
// UNSUPPORTED Rust 4146:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WDIAG_IHV_WLAN_ID {
//     pub strProfileName: [u16; 256],
//     pub Ssid: DOT11_SSID,
//     pub BssType: DOT11_BSS_TYPE,
//     pub dwFlags: u32,
//     pub dwReasonCode: u32,
// }

// UNSUPPORTED Rust 4155:1: declaration Impl has no candidate rule
// impl Default for WDIAG_IHV_WLAN_ID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WDIAG_IHV_WLAN_ID_FLAG_SECURITY_ENABLED`: UInt = 1u;
// UNSUPPORTED Rust 4161:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WFDSVC_CONNECTION_CAPABILITY {
//     pub bNew: bool,
//     pub bClient: bool,
//     pub bGO: bool,
// }

public const val `WFDSVC_CONNECTION_CAPABILITY_CLIENT`: UInt = 2u;
public const val `WFDSVC_CONNECTION_CAPABILITY_GO`: UInt = 4u;
public const val `WFDSVC_CONNECTION_CAPABILITY_NEW`: UInt = 1u;
public const val `WFD_API_VERSION`: UInt = 1u;
public const val `WFD_API_VERSION_1_0`: UInt = 1u;
// UNSUPPORTED Rust 4173:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WFD_GROUP_ID {
//     pub DeviceAddress: [u8; 6],
//     pub GroupSSID: DOT11_SSID,
// }

// UNSUPPORTED Rust 4179:1: declaration Impl has no candidate rule
// impl Default for WFD_GROUP_ID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4184:1: generic scalar type unsupported
// pub type WFD_OPEN_SESSION_COMPLETE_CALLBACK = Option<unsafe extern "system" fn(hsessionhandle: super::super::Foundation::HANDLE, pvcontext: *const core::ffi::c_void, guidsessioninterface: windows_sys::core::GUID, dwerror: u32, dwreasoncode: u32)>;

public typealias `WFD_ROLE_TYPE` = Int;
public const val `WFD_ROLE_TYPE_CLIENT`: `WFD_ROLE_TYPE` = 4;
public const val `WFD_ROLE_TYPE_DEVICE`: `WFD_ROLE_TYPE` = 1;
public const val `WFD_ROLE_TYPE_GROUP_OWNER`: `WFD_ROLE_TYPE` = 2;
public const val `WFD_ROLE_TYPE_MAX`: `WFD_ROLE_TYPE` = 5;
public const val `WFD_ROLE_TYPE_NONE`: `WFD_ROLE_TYPE` = 0;
public typealias `WLAN_ADHOC_NETWORK_STATE` = Int;
public const val `WLAN_API_VERSION`: UInt = 2u;
public const val `WLAN_API_VERSION_1_0`: UInt = 1u;
public const val `WLAN_API_VERSION_2_0`: UInt = 2u;
// UNSUPPORTED Rust 4195:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WLAN_ASSOCIATION_ATTRIBUTES {
//     pub dot11Ssid: DOT11_SSID,
//     pub dot11BssType: DOT11_BSS_TYPE,
//     pub dot11Bssid: [u8; 6],
//     pub dot11PhyType: DOT11_PHY_TYPE,
//     pub uDot11PhyIndex: u32,
//     pub wlanSignalQuality: u32,
//     pub ulRxRate: u32,
//     pub ulTxRate: u32,
// }

// UNSUPPORTED Rust 4207:1: declaration Impl has no candidate rule
// impl Default for WLAN_ASSOCIATION_ATTRIBUTES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4212:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WLAN_AUTH_CIPHER_PAIR_LIST {
//     pub dwNumberOfItems: u32,
//     pub pAuthCipherPairList: [DOT11_AUTH_CIPHER_PAIR; 1],
// }

// UNSUPPORTED Rust 4218:1: declaration Impl has no candidate rule
// impl Default for WLAN_AUTH_CIPHER_PAIR_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WLAN_AUTOCONF_OPCODE` = Int;
// UNSUPPORTED Rust 4224:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WLAN_AVAILABLE_NETWORK {
//     pub strProfileName: [u16; 256],
//     pub dot11Ssid: DOT11_SSID,
//     pub dot11BssType: DOT11_BSS_TYPE,
//     pub uNumberOfBssids: u32,
//     pub bNetworkConnectable: windows_sys::core::BOOL,
//     pub wlanNotConnectableReason: u32,
//     pub uNumberOfPhyTypes: u32,
//     pub dot11PhyTypes: [DOT11_PHY_TYPE; 8],
//     pub bMorePhyTypes: windows_sys::core::BOOL,
//     pub wlanSignalQuality: u32,
//     pub bSecurityEnabled: windows_sys::core::BOOL,
//     pub dot11DefaultAuthAlgorithm: DOT11_AUTH_ALGORITHM,
//     pub dot11DefaultCipherAlgorithm: DOT11_CIPHER_ALGORITHM,
//     pub dwFlags: u32,
//     pub dwReserved: u32,
// }

// UNSUPPORTED Rust 4243:1: declaration Impl has no candidate rule
// impl Default for WLAN_AVAILABLE_NETWORK {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WLAN_AVAILABLE_NETWORK_ANQP_SUPPORTED`: UInt = 32u;
public const val `WLAN_AVAILABLE_NETWORK_AUTO_CONNECT_FAILED`: UInt = 256u;
public const val `WLAN_AVAILABLE_NETWORK_CONNECTED`: UInt = 1u;
public const val `WLAN_AVAILABLE_NETWORK_CONSOLE_USER_PROFILE`: UInt = 4u;
public const val `WLAN_AVAILABLE_NETWORK_HAS_PROFILE`: UInt = 2u;
public const val `WLAN_AVAILABLE_NETWORK_HOTSPOT2_DOMAIN`: UInt = 64u;
public const val `WLAN_AVAILABLE_NETWORK_HOTSPOT2_ENABLED`: UInt = 16u;
public const val `WLAN_AVAILABLE_NETWORK_HOTSPOT2_ROAMING`: UInt = 128u;
public const val `WLAN_AVAILABLE_NETWORK_INCLUDE_ALL_ADHOC_PROFILES`: UInt = 1u;
public const val `WLAN_AVAILABLE_NETWORK_INCLUDE_ALL_MANUAL_HIDDEN_PROFILES`: UInt = 2u;
public const val `WLAN_AVAILABLE_NETWORK_INTERWORKING_SUPPORTED`: UInt = 8u;
// UNSUPPORTED Rust 4259:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WLAN_AVAILABLE_NETWORK_LIST {
//     pub dwNumberOfItems: u32,
//     pub dwIndex: u32,
//     pub Network: [WLAN_AVAILABLE_NETWORK; 1],
// }

// UNSUPPORTED Rust 4266:1: declaration Impl has no candidate rule
// impl Default for WLAN_AVAILABLE_NETWORK_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4271:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WLAN_AVAILABLE_NETWORK_LIST_V2 {
//     pub dwNumberOfItems: u32,
//     pub dwIndex: u32,
//     pub Network: [WLAN_AVAILABLE_NETWORK_V2; 1],
// }

// UNSUPPORTED Rust 4278:1: declaration Impl has no candidate rule
// impl Default for WLAN_AVAILABLE_NETWORK_LIST_V2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4283:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WLAN_AVAILABLE_NETWORK_V2 {
//     pub strProfileName: [u16; 256],
//     pub dot11Ssid: DOT11_SSID,
//     pub dot11BssType: DOT11_BSS_TYPE,
//     pub uNumberOfBssids: u32,
//     pub bNetworkConnectable: windows_sys::core::BOOL,
//     pub wlanNotConnectableReason: u32,
//     pub uNumberOfPhyTypes: u32,
//     pub dot11PhyTypes: [DOT11_PHY_TYPE; 8],
//     pub bMorePhyTypes: windows_sys::core::BOOL,
//     pub wlanSignalQuality: u32,
//     pub bSecurityEnabled: windows_sys::core::BOOL,
//     pub dot11DefaultAuthAlgorithm: DOT11_AUTH_ALGORITHM,
//     pub dot11DefaultCipherAlgorithm: DOT11_CIPHER_ALGORITHM,
//     pub dwFlags: u32,
//     pub AccessNetworkOptions: DOT11_ACCESSNETWORKOPTIONS,
//     pub dot11HESSID: [u8; 6],
//     pub VenueInfo: DOT11_VENUEINFO,
//     pub dwReserved: u32,
// }

// UNSUPPORTED Rust 4305:1: declaration Impl has no candidate rule
// impl Default for WLAN_AVAILABLE_NETWORK_V2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4310:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WLAN_BSS_ENTRY {
//     pub dot11Ssid: DOT11_SSID,
//     pub uPhyId: u32,
//     pub dot11Bssid: [u8; 6],
//     pub dot11BssType: DOT11_BSS_TYPE,
//     pub dot11BssPhyType: DOT11_PHY_TYPE,
//     pub lRssi: i32,
//     pub uLinkQuality: u32,
//     pub bInRegDomain: bool,
//     pub usBeaconPeriod: u16,
//     pub ullTimestamp: u64,
//     pub ullHostTimestamp: u64,
//     pub usCapabilityInformation: u16,
//     pub ulChCenterFrequency: u32,
//     pub wlanRateSet: WLAN_RATE_SET,
//     pub ulIeOffset: u32,
//     pub ulIeSize: u32,
// }

// UNSUPPORTED Rust 4330:1: declaration Impl has no candidate rule
// impl Default for WLAN_BSS_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4335:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WLAN_BSS_LIST {
//     pub dwTotalSize: u32,
//     pub dwNumberOfItems: u32,
//     pub wlanBssEntries: [WLAN_BSS_ENTRY; 1],
// }

// UNSUPPORTED Rust 4342:1: declaration Impl has no candidate rule
// impl Default for WLAN_BSS_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WLAN_CONNECTION_ADHOC_JOIN_ONLY`: UInt = 2u;
// UNSUPPORTED Rust 4348:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WLAN_CONNECTION_ATTRIBUTES {
//     pub isState: WLAN_INTERFACE_STATE,
//     pub wlanConnectionMode: WLAN_CONNECTION_MODE,
//     pub strProfileName: [u16; 256],
//     pub wlanAssociationAttributes: WLAN_ASSOCIATION_ATTRIBUTES,
//     pub wlanSecurityAttributes: WLAN_SECURITY_ATTRIBUTES,
// }

// UNSUPPORTED Rust 4357:1: declaration Impl has no candidate rule
// impl Default for WLAN_CONNECTION_ATTRIBUTES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WLAN_CONNECTION_EAPOL_PASSTHROUGH`: UInt = 8u;
public const val `WLAN_CONNECTION_HIDDEN_NETWORK`: UInt = 1u;
public const val `WLAN_CONNECTION_IGNORE_PRIVACY_BIT`: UInt = 4u;
public typealias `WLAN_CONNECTION_MODE` = Int;
public const val `WLAN_CONNECTION_NOTIFICATION_ADHOC_NETWORK_FORMED`: `WLAN_CONNECTION_NOTIFICATION_FLAGS` = 1u;
public const val `WLAN_CONNECTION_NOTIFICATION_CONSOLE_USER_PROFILE`: `WLAN_CONNECTION_NOTIFICATION_FLAGS` = 4u;
// UNSUPPORTED Rust 4368:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WLAN_CONNECTION_NOTIFICATION_DATA {
//     pub wlanConnectionMode: WLAN_CONNECTION_MODE,
//     pub strProfileName: [u16; 256],
//     pub dot11Ssid: DOT11_SSID,
//     pub dot11BssType: DOT11_BSS_TYPE,
//     pub bSecurityEnabled: windows_sys::core::BOOL,
//     pub wlanReasonCode: u32,
//     pub dwFlags: WLAN_CONNECTION_NOTIFICATION_FLAGS,
//     pub strProfileXml: [u16; 1],
// }

// UNSUPPORTED Rust 4380:1: declaration Impl has no candidate rule
// impl Default for WLAN_CONNECTION_NOTIFICATION_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WLAN_CONNECTION_NOTIFICATION_FLAGS` = UInt;
// UNSUPPORTED Rust 4386:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct WLAN_CONNECTION_PARAMETERS {
//     pub wlanConnectionMode: WLAN_CONNECTION_MODE,
//     pub strProfile: windows_sys::core::PCWSTR,
//     pub pDot11Ssid: *mut DOT11_SSID,
//     pub pDesiredBssidList: *mut DOT11_BSSID_LIST,
//     pub dot11BssType: DOT11_BSS_TYPE,
//     pub dwFlags: u32,
// }

// UNSUPPORTED Rust 4397:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for WLAN_CONNECTION_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4403:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct WLAN_CONNECTION_PARAMETERS_V2 {
//     pub wlanConnectionMode: WLAN_CONNECTION_MODE,
//     pub strProfile: windows_sys::core::PCWSTR,
//     pub pDot11Ssid: *mut DOT11_SSID,
//     pub pDot11Hessid: *mut u8,
//     pub pDesiredBssidList: *mut DOT11_BSSID_LIST,
//     pub dot11BssType: DOT11_BSS_TYPE,
//     pub dwFlags: u32,
//     pub pDot11AccessNetworkOptions: *mut DOT11_ACCESSNETWORKOPTIONS,
// }

// UNSUPPORTED Rust 4416:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for WLAN_CONNECTION_PARAMETERS_V2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WLAN_CONNECTION_PERSIST_DISCOVERY_PROFILE`: UInt = 16u;
public const val `WLAN_CONNECTION_PERSIST_DISCOVERY_PROFILE_CONNECTION_MODE_AUTO`: UInt = 32u;
public const val `WLAN_CONNECTION_PERSIST_DISCOVERY_PROFILE_OVERWRITE_EXISTING`: UInt = 64u;
// UNSUPPORTED Rust 4425:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WLAN_COUNTRY_OR_REGION_STRING_LIST {
//     pub dwNumberOfItems: u32,
//     pub pCountryOrRegionStringList: [u8; 3],
// }

// UNSUPPORTED Rust 4431:1: declaration Impl has no candidate rule
// impl Default for WLAN_COUNTRY_OR_REGION_STRING_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4436:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WLAN_DEVICE_SERVICE_GUID_LIST {
//     pub dwNumberOfItems: u32,
//     pub dwIndex: u32,
//     pub DeviceService: [windows_sys::core::GUID; 1],
// }

// UNSUPPORTED Rust 4443:1: declaration Impl has no candidate rule
// impl Default for WLAN_DEVICE_SERVICE_GUID_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4448:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WLAN_DEVICE_SERVICE_NOTIFICATION_DATA {
//     pub DeviceService: windows_sys::core::GUID,
//     pub dwOpCode: u32,
//     pub dwDataSize: u32,
//     pub DataBlob: [u8; 1],
// }

// UNSUPPORTED Rust 4456:1: declaration Impl has no candidate rule
// impl Default for WLAN_DEVICE_SERVICE_NOTIFICATION_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WLAN_FILTER_LIST_TYPE` = Int;
// UNSUPPORTED Rust 4462:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WLAN_HOSTED_NETWORK_CONNECTION_SETTINGS {
//     pub hostedNetworkSSID: DOT11_SSID,
//     pub dwMaxNumberOfPeers: u32,
// }

// UNSUPPORTED Rust 4468:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WLAN_HOSTED_NETWORK_DATA_PEER_STATE_CHANGE {
//     pub OldState: WLAN_HOSTED_NETWORK_PEER_STATE,
//     pub NewState: WLAN_HOSTED_NETWORK_PEER_STATE,
//     pub PeerStateChangeReason: WLAN_HOSTED_NETWORK_REASON,
// }

public typealias `WLAN_HOSTED_NETWORK_NOTIFICATION_CODE` = Int;
public typealias `WLAN_HOSTED_NETWORK_OPCODE` = Int;
public typealias `WLAN_HOSTED_NETWORK_PEER_AUTH_STATE` = Int;
// UNSUPPORTED Rust 4478:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WLAN_HOSTED_NETWORK_PEER_STATE {
//     pub PeerMacAddress: [u8; 6],
//     pub PeerAuthState: WLAN_HOSTED_NETWORK_PEER_AUTH_STATE,
// }

// UNSUPPORTED Rust 4484:1: declaration Impl has no candidate rule
// impl Default for WLAN_HOSTED_NETWORK_PEER_STATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4489:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WLAN_HOSTED_NETWORK_RADIO_STATE {
//     pub dot11SoftwareRadioState: DOT11_RADIO_STATE,
//     pub dot11HardwareRadioState: DOT11_RADIO_STATE,
// }

public typealias `WLAN_HOSTED_NETWORK_REASON` = Int;
// UNSUPPORTED Rust 4496:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WLAN_HOSTED_NETWORK_SECURITY_SETTINGS {
//     pub dot11AuthAlgo: DOT11_AUTH_ALGORITHM,
//     pub dot11CipherAlgo: DOT11_CIPHER_ALGORITHM,
// }

public typealias `WLAN_HOSTED_NETWORK_STATE` = Int;
// UNSUPPORTED Rust 4503:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WLAN_HOSTED_NETWORK_STATE_CHANGE {
//     pub OldState: WLAN_HOSTED_NETWORK_STATE,
//     pub NewState: WLAN_HOSTED_NETWORK_STATE,
//     pub StateChangeReason: WLAN_HOSTED_NETWORK_REASON,
// }

// UNSUPPORTED Rust 4510:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WLAN_HOSTED_NETWORK_STATUS {
//     pub HostedNetworkState: WLAN_HOSTED_NETWORK_STATE,
//     pub IPDeviceID: windows_sys::core::GUID,
//     pub wlanHostedNetworkBSSID: [u8; 6],
//     pub dot11PhyType: DOT11_PHY_TYPE,
//     pub ulChannelFrequency: u32,
//     pub dwNumberOfPeers: u32,
//     pub PeerList: [WLAN_HOSTED_NETWORK_PEER_STATE; 1],
// }

// UNSUPPORTED Rust 4521:1: declaration Impl has no candidate rule
// impl Default for WLAN_HOSTED_NETWORK_STATUS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WLAN_IHV_CONTROL_TYPE` = Int;
// UNSUPPORTED Rust 4527:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WLAN_INTERFACE_CAPABILITY {
//     pub interfaceType: WLAN_INTERFACE_TYPE,
//     pub bDot11DSupported: windows_sys::core::BOOL,
//     pub dwMaxDesiredSsidListSize: u32,
//     pub dwMaxDesiredBssidListSize: u32,
//     pub dwNumberOfSupportedPhys: u32,
//     pub dot11PhyTypes: [DOT11_PHY_TYPE; 64],
// }

// UNSUPPORTED Rust 4537:1: declaration Impl has no candidate rule
// impl Default for WLAN_INTERFACE_CAPABILITY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4542:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WLAN_INTERFACE_INFO {
//     pub InterfaceGuid: windows_sys::core::GUID,
//     pub strInterfaceDescription: [u16; 256],
//     pub isState: WLAN_INTERFACE_STATE,
// }

// UNSUPPORTED Rust 4549:1: declaration Impl has no candidate rule
// impl Default for WLAN_INTERFACE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4554:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WLAN_INTERFACE_INFO_LIST {
//     pub dwNumberOfItems: u32,
//     pub dwIndex: u32,
//     pub InterfaceInfo: [WLAN_INTERFACE_INFO; 1],
// }

// UNSUPPORTED Rust 4561:1: declaration Impl has no candidate rule
// impl Default for WLAN_INTERFACE_INFO_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WLAN_INTERFACE_STATE` = Int;
public typealias `WLAN_INTERFACE_TYPE` = Int;
public typealias `WLAN_INTF_OPCODE` = Int;
// UNSUPPORTED Rust 4569:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WLAN_MAC_FRAME_STATISTICS {
//     pub ullTransmittedFrameCount: u64,
//     pub ullReceivedFrameCount: u64,
//     pub ullWEPExcludedCount: u64,
//     pub ullTKIPLocalMICFailures: u64,
//     pub ullTKIPReplays: u64,
//     pub ullTKIPICVErrorCount: u64,
//     pub ullCCMPReplays: u64,
//     pub ullCCMPDecryptErrors: u64,
//     pub ullWEPUndecryptableCount: u64,
//     pub ullWEPICVErrorCount: u64,
//     pub ullDecryptSuccessCount: u64,
//     pub ullDecryptFailureCount: u64,
// }

public const val `WLAN_MAX_NAME_LENGTH`: UInt = 256u;
public const val `WLAN_MAX_PHY_INDEX`: UInt = 64u;
public const val `WLAN_MAX_PHY_TYPE_NUMBER`: UInt = 8u;
// UNSUPPORTED Rust 4588:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WLAN_MSM_NOTIFICATION_DATA {
//     pub wlanConnectionMode: WLAN_CONNECTION_MODE,
//     pub strProfileName: [u16; 256],
//     pub dot11Ssid: DOT11_SSID,
//     pub dot11BssType: DOT11_BSS_TYPE,
//     pub dot11MacAddr: [u8; 6],
//     pub bSecurityEnabled: windows_sys::core::BOOL,
//     pub bFirstPeer: windows_sys::core::BOOL,
//     pub bLastPeer: windows_sys::core::BOOL,
//     pub wlanReasonCode: u32,
// }

// UNSUPPORTED Rust 4601:1: declaration Impl has no candidate rule
// impl Default for WLAN_MSM_NOTIFICATION_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WLAN_NOTIFICATION_ACM` = Int;
// UNSUPPORTED Rust 4607:1: generic scalar type unsupported
// pub type WLAN_NOTIFICATION_CALLBACK = Option<unsafe extern "system" fn(param0: *mut L2_NOTIFICATION_DATA, param1: *mut core::ffi::c_void)>;

public typealias `WLAN_NOTIFICATION_MSM` = Int;
public typealias `WLAN_NOTIFICATION_SECURITY` = Int;
public typealias `WLAN_NOTIFICATION_SOURCES` = UInt;
public const val `WLAN_NOTIFICATION_SOURCE_ACM`: `WLAN_NOTIFICATION_SOURCES` = 8u;
public const val `WLAN_NOTIFICATION_SOURCE_ALL`: `WLAN_NOTIFICATION_SOURCES` = 65535u;
public const val `WLAN_NOTIFICATION_SOURCE_DEVICE_SERVICE`: `WLAN_NOTIFICATION_SOURCES` = 2048u;
public const val `WLAN_NOTIFICATION_SOURCE_HNWK`: `WLAN_NOTIFICATION_SOURCES` = 128u;
public const val `WLAN_NOTIFICATION_SOURCE_IHV`: `WLAN_NOTIFICATION_SOURCES` = 64u;
public const val `WLAN_NOTIFICATION_SOURCE_MSM`: `WLAN_NOTIFICATION_SOURCES` = 16u;
public const val `WLAN_NOTIFICATION_SOURCE_NONE`: `WLAN_NOTIFICATION_SOURCES` = 0u;
public const val `WLAN_NOTIFICATION_SOURCE_ONEX`: `WLAN_NOTIFICATION_SOURCES` = 4u;
public const val `WLAN_NOTIFICATION_SOURCE_SECURITY`: `WLAN_NOTIFICATION_SOURCES` = 32u;
public typealias `WLAN_OPCODE_VALUE_TYPE` = Int;
public typealias `WLAN_OPERATIONAL_STATE` = Int;
// UNSUPPORTED Rust 4622:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WLAN_PHY_FRAME_STATISTICS {
//     pub ullTransmittedFrameCount: u64,
//     pub ullMulticastTransmittedFrameCount: u64,
//     pub ullFailedCount: u64,
//     pub ullRetryCount: u64,
//     pub ullMultipleRetryCount: u64,
//     pub ullMaxTXLifetimeExceededCount: u64,
//     pub ullTransmittedFragmentCount: u64,
//     pub ullRTSSuccessCount: u64,
//     pub ullRTSFailureCount: u64,
//     pub ullACKFailureCount: u64,
//     pub ullReceivedFrameCount: u64,
//     pub ullMulticastReceivedFrameCount: u64,
//     pub ullPromiscuousReceivedFrameCount: u64,
//     pub ullMaxRXLifetimeExceededCount: u64,
//     pub ullFrameDuplicateCount: u64,
//     pub ullReceivedFragmentCount: u64,
//     pub ullPromiscuousReceivedFragmentCount: u64,
//     pub ullFCSErrorCount: u64,
// }

// UNSUPPORTED Rust 4644:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WLAN_PHY_RADIO_STATE {
//     pub dwPhyIndex: u32,
//     pub dot11SoftwareRadioState: DOT11_RADIO_STATE,
//     pub dot11HardwareRadioState: DOT11_RADIO_STATE,
// }

public typealias `WLAN_POWER_SETTING` = Int;
public const val `WLAN_PROFILE_CONNECTION_MODE_AUTO`: UInt = 131072u;
public const val `WLAN_PROFILE_CONNECTION_MODE_SET_BY_CLIENT`: UInt = 65536u;
public const val `WLAN_PROFILE_GET_PLAINTEXT_KEY`: UInt = 4u;
public const val `WLAN_PROFILE_GROUP_POLICY`: UInt = 1u;
// UNSUPPORTED Rust 4656:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WLAN_PROFILE_INFO {
//     pub strProfileName: [u16; 256],
//     pub dwFlags: u32,
// }

// UNSUPPORTED Rust 4662:1: declaration Impl has no candidate rule
// impl Default for WLAN_PROFILE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4667:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WLAN_PROFILE_INFO_LIST {
//     pub dwNumberOfItems: u32,
//     pub dwIndex: u32,
//     pub ProfileInfo: [WLAN_PROFILE_INFO; 1],
// }

// UNSUPPORTED Rust 4674:1: declaration Impl has no candidate rule
// impl Default for WLAN_PROFILE_INFO_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WLAN_PROFILE_USER`: UInt = 2u;
// UNSUPPORTED Rust 4680:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WLAN_RADIO_STATE {
//     pub dwNumberOfPhys: u32,
//     pub PhyRadioState: [WLAN_PHY_RADIO_STATE; 64],
// }

// UNSUPPORTED Rust 4686:1: declaration Impl has no candidate rule
// impl Default for WLAN_RADIO_STATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4691:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WLAN_RATE_SET {
//     pub uRateSetLength: u32,
//     pub usRateSet: [u16; 126],
// }

// UNSUPPORTED Rust 4697:1: declaration Impl has no candidate rule
// impl Default for WLAN_RATE_SET {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4702:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WLAN_RAW_DATA {
//     pub dwDataSize: u32,
//     pub DataBlob: [u8; 1],
// }

// UNSUPPORTED Rust 4708:1: declaration Impl has no candidate rule
// impl Default for WLAN_RAW_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4713:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WLAN_RAW_DATA_LIST {
//     pub dwTotalSize: u32,
//     pub dwNumberOfItems: u32,
//     pub DataList: [WLAN_RAW_DATA_LIST_0; 1],
// }

// UNSUPPORTED Rust 4720:1: declaration Impl has no candidate rule
// impl Default for WLAN_RAW_DATA_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4725:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WLAN_RAW_DATA_LIST_0 {
//     pub dwDataOffset: u32,
//     pub dwDataSize: u32,
// }

public const val `WLAN_REASON_CODE_AC_BASE`: UInt = 131072u;
public const val `WLAN_REASON_CODE_AC_CONNECT_BASE`: UInt = 163840u;
public const val `WLAN_REASON_CODE_AC_END`: UInt = 196607u;
public const val `WLAN_REASON_CODE_ADHOC_SECURITY_FAILURE`: UInt = 229386u;
public const val `WLAN_REASON_CODE_AP_PROFILE_NOT_ALLOWED`: UInt = 163856u;
public const val `WLAN_REASON_CODE_AP_PROFILE_NOT_ALLOWED_FOR_CLIENT`: UInt = 163855u;
public const val `WLAN_REASON_CODE_AP_STARTING_FAILURE`: UInt = 229395u;
public const val `WLAN_REASON_CODE_ASSOCIATION_FAILURE`: UInt = 229378u;
public const val `WLAN_REASON_CODE_ASSOCIATION_TIMEOUT`: UInt = 229379u;
public const val `WLAN_REASON_CODE_AUTO_AP_PROFILE_NOT_ALLOWED`: UInt = 524313u;
public const val `WLAN_REASON_CODE_AUTO_CONNECTION_NOT_ALLOWED`: UInt = 524314u;
public const val `WLAN_REASON_CODE_AUTO_SWITCH_SET_FOR_ADHOC`: UInt = 524304u;
public const val `WLAN_REASON_CODE_AUTO_SWITCH_SET_FOR_MANUAL_CONNECTION`: UInt = 524305u;
public const val `WLAN_REASON_CODE_BAD_MAX_NUMBER_OF_CLIENTS_FOR_AP`: UInt = 524310u;
public const val `WLAN_REASON_CODE_BASE`: UInt = 131072u;
public const val `WLAN_REASON_CODE_BSS_TYPE_NOT_ALLOWED`: UInt = 163845u;
public const val `WLAN_REASON_CODE_BSS_TYPE_UNMATCH`: UInt = 196611u;
public const val `WLAN_REASON_CODE_CONFLICT_SECURITY`: UInt = 524299u;
public const val `WLAN_REASON_CODE_CONNECT_CALL_FAIL`: UInt = 163849u;
public const val `WLAN_REASON_CODE_DATARATE_UNMATCH`: UInt = 196613u;
public const val `WLAN_REASON_CODE_DISCONNECT_TIMEOUT`: UInt = 229391u;
public const val `WLAN_REASON_CODE_DRIVER_DISCONNECTED`: UInt = 229387u;
public const val `WLAN_REASON_CODE_DRIVER_OPERATION_FAILURE`: UInt = 229388u;
public const val `WLAN_REASON_CODE_GP_DENIED`: UInt = 163843u;
public const val `WLAN_REASON_CODE_HOTSPOT2_PROFILE_DENIED`: UInt = 163857u;
public const val `WLAN_REASON_CODE_HOTSPOT2_PROFILE_NOT_ALLOWED`: UInt = 524315u;
public const val `WLAN_REASON_CODE_IHV_CONNECTIVITY_NOT_SUPPORTED`: UInt = 524309u;
public const val `WLAN_REASON_CODE_IHV_NOT_AVAILABLE`: UInt = 229389u;
public const val `WLAN_REASON_CODE_IHV_NOT_RESPONDING`: UInt = 229390u;
public const val `WLAN_REASON_CODE_IHV_OUI_MISMATCH`: UInt = 524296u;
public const val `WLAN_REASON_CODE_IHV_OUI_MISSING`: UInt = 524297u;
public const val `WLAN_REASON_CODE_IHV_SECURITY_NOT_SUPPORTED`: UInt = 524295u;
public const val `WLAN_REASON_CODE_IHV_SECURITY_ONEX_MISSING`: UInt = 524306u;
public const val `WLAN_REASON_CODE_IHV_SETTINGS_MISSING`: UInt = 524298u;
public const val `WLAN_REASON_CODE_INTERNAL_FAILURE`: UInt = 229392u;
public const val `WLAN_REASON_CODE_INVALID_ADHOC_CONNECTION_MODE`: UInt = 524302u;
public const val `WLAN_REASON_CODE_INVALID_BSS_TYPE`: UInt = 524301u;
public const val `WLAN_REASON_CODE_INVALID_CHANNEL`: UInt = 524311u;
public const val `WLAN_REASON_CODE_INVALID_PHY_TYPE`: UInt = 524293u;
public const val `WLAN_REASON_CODE_INVALID_PROFILE_NAME`: UInt = 524291u;
public const val `WLAN_REASON_CODE_INVALID_PROFILE_SCHEMA`: UInt = 524289u;
public const val `WLAN_REASON_CODE_INVALID_PROFILE_TYPE`: UInt = 524292u;
public const val `WLAN_REASON_CODE_IN_BLOCKED_LIST`: UInt = 163847u;
public const val `WLAN_REASON_CODE_IN_FAILED_LIST`: UInt = 163846u;
public const val `WLAN_REASON_CODE_KEY_MISMATCH`: UInt = 163853u;
public const val `WLAN_REASON_CODE_MSMSEC_AUTH_START_TIMEOUT`: UInt = 294914u;
public const val `WLAN_REASON_CODE_MSMSEC_AUTH_SUCCESS_TIMEOUT`: UInt = 294915u;
public const val `WLAN_REASON_CODE_MSMSEC_AUTH_WCN_COMPLETED`: UInt = 294937u;
public const val `WLAN_REASON_CODE_MSMSEC_BASE`: UInt = 262144u;
public const val `WLAN_REASON_CODE_MSMSEC_CANCELLED`: UInt = 294929u;
public const val `WLAN_REASON_CODE_MSMSEC_CAPABILITY_DISCOVERY`: UInt = 262165u;
public const val `WLAN_REASON_CODE_MSMSEC_CAPABILITY_MFP_NW_NIC`: UInt = 262181u;
public const val `WLAN_REASON_CODE_MSMSEC_CAPABILITY_NETWORK`: UInt = 262162u;
public const val `WLAN_REASON_CODE_MSMSEC_CAPABILITY_NIC`: UInt = 262163u;
public const val `WLAN_REASON_CODE_MSMSEC_CAPABILITY_PROFILE`: UInt = 262164u;
public const val `WLAN_REASON_CODE_MSMSEC_CAPABILITY_PROFILE_AUTH`: UInt = 262174u;
public const val `WLAN_REASON_CODE_MSMSEC_CAPABILITY_PROFILE_CIPHER`: UInt = 262175u;
public const val `WLAN_REASON_CODE_MSMSEC_CAPABILITY_PROFILE_SAFE_MODE_NIC`: UInt = 262177u;
public const val `WLAN_REASON_CODE_MSMSEC_CAPABILITY_PROFILE_SAFE_MODE_NW`: UInt = 262178u;
public const val `WLAN_REASON_CODE_MSMSEC_CONNECT_BASE`: UInt = 294912u;
public const val `WLAN_REASON_CODE_MSMSEC_DOWNGRADE_DETECTED`: UInt = 294931u;
public const val `WLAN_REASON_CODE_MSMSEC_END`: UInt = 327679u;
public const val `WLAN_REASON_CODE_MSMSEC_FORCED_FAILURE`: UInt = 294933u;
public const val `WLAN_REASON_CODE_MSMSEC_G1_MISSING_GRP_KEY`: UInt = 294925u;
public const val `WLAN_REASON_CODE_MSMSEC_G1_MISSING_KEY_DATA`: UInt = 294924u;
public const val `WLAN_REASON_CODE_MSMSEC_G1_MISSING_MGMT_GRP_KEY`: UInt = 294939u;
public const val `WLAN_REASON_CODE_MSMSEC_KEY_FORMAT`: UInt = 294930u;
public const val `WLAN_REASON_CODE_MSMSEC_KEY_START_TIMEOUT`: UInt = 294916u;
public const val `WLAN_REASON_CODE_MSMSEC_KEY_SUCCESS_TIMEOUT`: UInt = 294917u;
public const val `WLAN_REASON_CODE_MSMSEC_M2_MISSING_IE`: UInt = 294936u;
public const val `WLAN_REASON_CODE_MSMSEC_M2_MISSING_KEY_DATA`: UInt = 294935u;
public const val `WLAN_REASON_CODE_MSMSEC_M3_MISSING_GRP_KEY`: UInt = 294920u;
public const val `WLAN_REASON_CODE_MSMSEC_M3_MISSING_IE`: UInt = 294919u;
public const val `WLAN_REASON_CODE_MSMSEC_M3_MISSING_KEY_DATA`: UInt = 294918u;
public const val `WLAN_REASON_CODE_MSMSEC_M3_MISSING_MGMT_GRP_KEY`: UInt = 294938u;
public const val `WLAN_REASON_CODE_MSMSEC_M3_TOO_MANY_RSNIE`: UInt = 294934u;
public const val `WLAN_REASON_CODE_MSMSEC_MAX`: UInt = 327679u;
public const val `WLAN_REASON_CODE_MSMSEC_MIN`: UInt = 262144u;
public const val `WLAN_REASON_CODE_MSMSEC_MIXED_CELL`: UInt = 262169u;
public const val `WLAN_REASON_CODE_MSMSEC_NIC_FAILURE`: UInt = 294928u;
public const val `WLAN_REASON_CODE_MSMSEC_NO_AUTHENTICATOR`: UInt = 294927u;
public const val `WLAN_REASON_CODE_MSMSEC_NO_PAIRWISE_KEY`: UInt = 294923u;
public const val `WLAN_REASON_CODE_MSMSEC_PEER_INDICATED_INSECURE`: UInt = 294926u;
public const val `WLAN_REASON_CODE_MSMSEC_PROFILE_AUTH_TIMERS_INVALID`: UInt = 262170u;
public const val `WLAN_REASON_CODE_MSMSEC_PROFILE_DUPLICATE_AUTH_CIPHER`: UInt = 262151u;
public const val `WLAN_REASON_CODE_MSMSEC_PROFILE_INVALID_AUTH_CIPHER`: UInt = 262153u;
public const val `WLAN_REASON_CODE_MSMSEC_PROFILE_INVALID_GKEY_INTV`: UInt = 262171u;
public const val `WLAN_REASON_CODE_MSMSEC_PROFILE_INVALID_KEY_INDEX`: UInt = 262145u;
public const val `WLAN_REASON_CODE_MSMSEC_PROFILE_INVALID_PMKCACHE_MODE`: UInt = 262156u;
public const val `WLAN_REASON_CODE_MSMSEC_PROFILE_INVALID_PMKCACHE_SIZE`: UInt = 262157u;
public const val `WLAN_REASON_CODE_MSMSEC_PROFILE_INVALID_PMKCACHE_TTL`: UInt = 262158u;
public const val `WLAN_REASON_CODE_MSMSEC_PROFILE_INVALID_PREAUTH_MODE`: UInt = 262159u;
public const val `WLAN_REASON_CODE_MSMSEC_PROFILE_INVALID_PREAUTH_THROTTLE`: UInt = 262160u;
public const val `WLAN_REASON_CODE_MSMSEC_PROFILE_KEYMATERIAL_CHAR`: UInt = 262167u;
public const val `WLAN_REASON_CODE_MSMSEC_PROFILE_KEY_LENGTH`: UInt = 262147u;
public const val `WLAN_REASON_CODE_MSMSEC_PROFILE_KEY_UNMAPPED_CHAR`: UInt = 262173u;
public const val `WLAN_REASON_CODE_MSMSEC_PROFILE_NO_AUTH_CIPHER_SPECIFIED`: UInt = 262149u;
public const val `WLAN_REASON_CODE_MSMSEC_PROFILE_ONEX_DISABLED`: UInt = 262154u;
public const val `WLAN_REASON_CODE_MSMSEC_PROFILE_ONEX_ENABLED`: UInt = 262155u;
public const val `WLAN_REASON_CODE_MSMSEC_PROFILE_PASSPHRASE_CHAR`: UInt = 262166u;
public const val `WLAN_REASON_CODE_MSMSEC_PROFILE_PREAUTH_ONLY_ENABLED`: UInt = 262161u;
public const val `WLAN_REASON_CODE_MSMSEC_PROFILE_PSK_LENGTH`: UInt = 262148u;
public const val `WLAN_REASON_CODE_MSMSEC_PROFILE_PSK_PRESENT`: UInt = 262146u;
public const val `WLAN_REASON_CODE_MSMSEC_PROFILE_RAWDATA_INVALID`: UInt = 262152u;
public const val `WLAN_REASON_CODE_MSMSEC_PROFILE_SAFE_MODE`: UInt = 262176u;
public const val `WLAN_REASON_CODE_MSMSEC_PROFILE_TOO_MANY_AUTH_CIPHER_SPECIFIED`: UInt = 262150u;
public const val `WLAN_REASON_CODE_MSMSEC_PROFILE_UNSUPPORTED_AUTH`: UInt = 262179u;
public const val `WLAN_REASON_CODE_MSMSEC_PROFILE_UNSUPPORTED_CIPHER`: UInt = 262180u;
public const val `WLAN_REASON_CODE_MSMSEC_PROFILE_WRONG_KEYTYPE`: UInt = 262168u;
public const val `WLAN_REASON_CODE_MSMSEC_PR_IE_MATCHING`: UInt = 294921u;
public const val `WLAN_REASON_CODE_MSMSEC_PSK_MISMATCH_SUSPECTED`: UInt = 294932u;
public const val `WLAN_REASON_CODE_MSMSEC_SEC_IE_MATCHING`: UInt = 294922u;
public const val `WLAN_REASON_CODE_MSMSEC_TRANSITION_NETWORK`: UInt = 262172u;
public const val `WLAN_REASON_CODE_MSMSEC_UI_REQUEST_FAILURE`: UInt = 294913u;
public const val `WLAN_REASON_CODE_MSM_BASE`: UInt = 196608u;
public const val `WLAN_REASON_CODE_MSM_CONNECT_BASE`: UInt = 229376u;
public const val `WLAN_REASON_CODE_MSM_END`: UInt = 262143u;
public const val `WLAN_REASON_CODE_MSM_SECURITY_MISSING`: UInt = 524294u;
public const val `WLAN_REASON_CODE_NETWORK_NOT_AVAILABLE`: UInt = 163851u;
public const val `WLAN_REASON_CODE_NETWORK_NOT_COMPATIBLE`: UInt = 131073u;
public const val `WLAN_REASON_CODE_NON_BROADCAST_SET_FOR_ADHOC`: UInt = 524303u;
public const val `WLAN_REASON_CODE_NOT_VISIBLE`: UInt = 163842u;
public const val `WLAN_REASON_CODE_NO_AUTO_CONNECTION`: UInt = 163841u;
public const val `WLAN_REASON_CODE_NO_VISIBLE_AP`: UInt = 229396u;
public const val `WLAN_REASON_CODE_OPERATION_MODE_NOT_SUPPORTED`: UInt = 524312u;
public const val `WLAN_REASON_CODE_PHY_TYPE_UNMATCH`: UInt = 196612u;
public const val `WLAN_REASON_CODE_PRE_SECURITY_FAILURE`: UInt = 229380u;
public const val `WLAN_REASON_CODE_PROFILE_BASE`: UInt = 524288u;
public const val `WLAN_REASON_CODE_PROFILE_CHANGED_OR_DELETED`: UInt = 163852u;
public const val `WLAN_REASON_CODE_PROFILE_CONNECT_BASE`: UInt = 557056u;
public const val `WLAN_REASON_CODE_PROFILE_END`: UInt = 589823u;
public const val `WLAN_REASON_CODE_PROFILE_MISSING`: UInt = 524290u;
public const val `WLAN_REASON_CODE_PROFILE_NOT_COMPATIBLE`: UInt = 131074u;
public const val `WLAN_REASON_CODE_PROFILE_SSID_INVALID`: UInt = 524307u;
public const val `WLAN_REASON_CODE_RANGE_SIZE`: UInt = 65536u;
public const val `WLAN_REASON_CODE_RESERVED_BASE`: UInt = 720896u;
public const val `WLAN_REASON_CODE_RESERVED_END`: UInt = 786431u;
public const val `WLAN_REASON_CODE_ROAMING_FAILURE`: UInt = 229384u;
public const val `WLAN_REASON_CODE_ROAMING_SECURITY_FAILURE`: UInt = 229385u;
public const val `WLAN_REASON_CODE_SCAN_CALL_FAIL`: UInt = 163850u;
public const val `WLAN_REASON_CODE_SECURITY_FAILURE`: UInt = 229382u;
public const val `WLAN_REASON_CODE_SECURITY_MISSING`: UInt = 524300u;
public const val `WLAN_REASON_CODE_SECURITY_TIMEOUT`: UInt = 229383u;
public const val `WLAN_REASON_CODE_SSID_LIST_TOO_LONG`: UInt = 163848u;
public const val `WLAN_REASON_CODE_START_SECURITY_FAILURE`: UInt = 229381u;
public const val `WLAN_REASON_CODE_SUCCESS`: UInt = 0u;
public const val `WLAN_REASON_CODE_TOO_MANY_SECURITY_ATTEMPTS`: UInt = 229394u;
public const val `WLAN_REASON_CODE_TOO_MANY_SSID`: UInt = 524308u;
public const val `WLAN_REASON_CODE_UI_REQUEST_TIMEOUT`: UInt = 229393u;
public const val `WLAN_REASON_CODE_UNKNOWN`: UInt = 65537u;
public const val `WLAN_REASON_CODE_UNSUPPORTED_SECURITY_SET`: UInt = 196610u;
public const val `WLAN_REASON_CODE_UNSUPPORTED_SECURITY_SET_BY_OS`: UInt = 196609u;
public const val `WLAN_REASON_CODE_USER_CANCELLED`: UInt = 229377u;
public const val `WLAN_REASON_CODE_USER_DENIED`: UInt = 163844u;
public const val `WLAN_REASON_CODE_USER_NOT_RESPOND`: UInt = 163854u;
public typealias `WLAN_SECURABLE_OBJECT` = Int;
public const val `WLAN_SECURABLE_OBJECT_COUNT`: `WLAN_SECURABLE_OBJECT` = 17;
// UNSUPPORTED Rust 4888:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WLAN_SECURITY_ATTRIBUTES {
//     pub bSecurityEnabled: windows_sys::core::BOOL,
//     pub bOneXEnabled: windows_sys::core::BOOL,
//     pub dot11AuthAlgorithm: DOT11_AUTH_ALGORITHM,
//     pub dot11CipherAlgorithm: DOT11_CIPHER_ALGORITHM,
// }

public const val `WLAN_SET_EAPHOST_DATA_ALL_USERS`: `WLAN_SET_EAPHOST_FLAGS` = 1u;
public typealias `WLAN_SET_EAPHOST_FLAGS` = UInt;
// UNSUPPORTED Rust 4898:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WLAN_STATISTICS {
//     pub ullFourWayHandshakeFailures: u64,
//     pub ullTKIPCounterMeasuresInvoked: u64,
//     pub ullReserved: u64,
//     pub MacUcastCounters: WLAN_MAC_FRAME_STATISTICS,
//     pub MacMcastCounters: WLAN_MAC_FRAME_STATISTICS,
//     pub dwNumberOfPhys: u32,
//     pub PhyCounters: [WLAN_PHY_FRAME_STATISTICS; 1],
// }

// UNSUPPORTED Rust 4909:1: declaration Impl has no candidate rule
// impl Default for WLAN_STATISTICS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WLAN_UI_API_INITIAL_VERSION`: UInt = 1u;
public const val `WLAN_UI_API_VERSION`: UInt = 1u;
public const val `WLAdvPage`: `WL_DISPLAY_PAGES` = 2;
public const val `WLConnectionPage`: `WL_DISPLAY_PAGES` = 0;
public const val `WLSecurityPage`: `WL_DISPLAY_PAGES` = 1;
public typealias `WL_DISPLAY_PAGES` = Int;
public const val `ch_description_type_center_frequency`: `CH_DESCRIPTION_TYPE` = 2;
public const val `ch_description_type_logical`: `CH_DESCRIPTION_TYPE` = 1;
public const val `ch_description_type_phy_specific`: `CH_DESCRIPTION_TYPE` = 3;
public const val `connection_phase_any`: `DOT11EXT_IHV_CONNECTION_PHASE` = 0;
public const val `connection_phase_initial_connection`: `DOT11EXT_IHV_CONNECTION_PHASE` = 1;
public const val `connection_phase_post_l3_connection`: `DOT11EXT_IHV_CONNECTION_PHASE` = 2;
public const val `dot11_AC_param_BE`: `DOT11_AC_PARAM` = 0;
public const val `dot11_AC_param_BK`: `DOT11_AC_PARAM` = 1;
public const val `dot11_AC_param_VI`: `DOT11_AC_PARAM` = 2;
public const val `dot11_AC_param_VO`: `DOT11_AC_PARAM` = 3;
public const val `dot11_AC_param_max`: `DOT11_AC_PARAM` = 4;
public const val `dot11_ANQP_query_result_access_issues`: `DOT11_ANQP_QUERY_RESULT` = 7;
public const val `dot11_ANQP_query_result_advertisement_protocol_not_supported_on_remote`: `DOT11_ANQP_QUERY_RESULT` = 4;
public const val `dot11_ANQP_query_result_advertisement_server_not_responding`: `DOT11_ANQP_QUERY_RESULT` = 6;
public const val `dot11_ANQP_query_result_failure`: `DOT11_ANQP_QUERY_RESULT` = 1;
public const val `dot11_ANQP_query_result_gas_protocol_failure`: `DOT11_ANQP_QUERY_RESULT` = 5;
public const val `dot11_ANQP_query_result_resources`: `DOT11_ANQP_QUERY_RESULT` = 3;
public const val `dot11_ANQP_query_result_success`: `DOT11_ANQP_QUERY_RESULT` = 0;
public const val `dot11_ANQP_query_result_timed_out`: `DOT11_ANQP_QUERY_RESULT` = 2;
public const val `dot11_BSS_type_any`: `DOT11_BSS_TYPE` = 3;
public const val `dot11_BSS_type_independent`: `DOT11_BSS_TYPE` = 2;
public const val `dot11_BSS_type_infrastructure`: `DOT11_BSS_TYPE` = 1;
public const val `dot11_assoc_state_auth_assoc`: `DOT11_ASSOCIATION_STATE` = 3;
public const val `dot11_assoc_state_auth_unassoc`: `DOT11_ASSOCIATION_STATE` = 2;
public const val `dot11_assoc_state_unauth_unassoc`: `DOT11_ASSOCIATION_STATE` = 1;
public const val `dot11_assoc_state_zero`: `DOT11_ASSOCIATION_STATE` = 0;
public const val `dot11_band_2p4g`: `DOT11_BAND` = 1;
public const val `dot11_band_4p9g`: `DOT11_BAND` = 2;
public const val `dot11_band_5g`: `DOT11_BAND` = 3;
public const val `dot11_diversity_support_dynamic`: `DOT11_DIVERSITY_SUPPORT` = 3;
public const val `dot11_diversity_support_fixedlist`: `DOT11_DIVERSITY_SUPPORT` = 1;
public const val `dot11_diversity_support_notsupported`: `DOT11_DIVERSITY_SUPPORT` = 2;
public const val `dot11_diversity_support_unknown`: `DOT11_DIVERSITY_SUPPORT` = 0;
public const val `dot11_hop_algo_current`: `DOT11_HOP_ALGO_ADOPTED` = 0;
public const val `dot11_hop_algo_hcc`: `DOT11_HOP_ALGO_ADOPTED` = 2;
public const val `dot11_hop_algo_hop_index`: `DOT11_HOP_ALGO_ADOPTED` = 1;
public const val `dot11_key_direction_both`: `DOT11_KEY_DIRECTION` = 1;
public const val `dot11_key_direction_inbound`: `DOT11_KEY_DIRECTION` = 2;
public const val `dot11_key_direction_outbound`: `DOT11_KEY_DIRECTION` = 3;
public const val `dot11_manufacturing_callback_IHV_end`: `DOT11_MANUFACTURING_CALLBACK_TYPE` = -1;
public const val `dot11_manufacturing_callback_IHV_start`: `DOT11_MANUFACTURING_CALLBACK_TYPE` = -2147483648;
public const val `dot11_manufacturing_callback_self_test_complete`: `DOT11_MANUFACTURING_CALLBACK_TYPE` = 1;
public const val `dot11_manufacturing_callback_sleep_complete`: `DOT11_MANUFACTURING_CALLBACK_TYPE` = 2;
public const val `dot11_manufacturing_callback_unknown`: `DOT11_MANUFACTURING_CALLBACK_TYPE` = 0;
public const val `dot11_manufacturing_test_IHV_end`: `DOT11_MANUFACTURING_TEST_TYPE` = -1;
public const val `dot11_manufacturing_test_IHV_start`: `DOT11_MANUFACTURING_TEST_TYPE` = -2147483648;
public const val `dot11_manufacturing_test_awake`: `DOT11_MANUFACTURING_TEST_TYPE` = 9;
public const val `dot11_manufacturing_test_query_adc`: `DOT11_MANUFACTURING_TEST_TYPE` = 5;
public const val `dot11_manufacturing_test_query_data`: `DOT11_MANUFACTURING_TEST_TYPE` = 7;
public const val `dot11_manufacturing_test_rx`: `DOT11_MANUFACTURING_TEST_TYPE` = 3;
public const val `dot11_manufacturing_test_self_query_result`: `DOT11_MANUFACTURING_TEST_TYPE` = 2;
public const val `dot11_manufacturing_test_self_start`: `DOT11_MANUFACTURING_TEST_TYPE` = 1;
public const val `dot11_manufacturing_test_set_data`: `DOT11_MANUFACTURING_TEST_TYPE` = 6;
public const val `dot11_manufacturing_test_sleep`: `DOT11_MANUFACTURING_TEST_TYPE` = 8;
public const val `dot11_manufacturing_test_tx`: `DOT11_MANUFACTURING_TEST_TYPE` = 4;
public const val `dot11_manufacturing_test_unknown`: `DOT11_MANUFACTURING_TEST_TYPE` = 0;
public const val `dot11_offload_type_auth`: `DOT11_OFFLOAD_TYPE` = 2;
public const val `dot11_offload_type_wep`: `DOT11_OFFLOAD_TYPE` = 1;
public const val `dot11_phy_type_IHV_end`: `DOT11_PHY_TYPE` = -1;
public const val `dot11_phy_type_IHV_start`: `DOT11_PHY_TYPE` = -2147483648;
public const val `dot11_phy_type_any`: `DOT11_PHY_TYPE` = 0;
public const val `dot11_phy_type_dmg`: `DOT11_PHY_TYPE` = 9;
public const val `dot11_phy_type_dsss`: `DOT11_PHY_TYPE` = 2;
public const val `dot11_phy_type_eht`: `DOT11_PHY_TYPE` = 11;
public const val `dot11_phy_type_erp`: `DOT11_PHY_TYPE` = 6;
public const val `dot11_phy_type_fhss`: `DOT11_PHY_TYPE` = 1;
public const val `dot11_phy_type_he`: `DOT11_PHY_TYPE` = 10;
public const val `dot11_phy_type_hrdsss`: `DOT11_PHY_TYPE` = 5;
public const val `dot11_phy_type_ht`: `DOT11_PHY_TYPE` = 7;
public const val `dot11_phy_type_irbaseband`: `DOT11_PHY_TYPE` = 3;
public const val `dot11_phy_type_ofdm`: `DOT11_PHY_TYPE` = 4;
public const val `dot11_phy_type_unknown`: `DOT11_PHY_TYPE` = 0;
public const val `dot11_phy_type_vht`: `DOT11_PHY_TYPE` = 8;
public const val `dot11_power_mode_active`: `DOT11_POWER_MODE` = 1;
public const val `dot11_power_mode_powersave`: `DOT11_POWER_MODE` = 2;
public const val `dot11_power_mode_reason_compliant_AP`: `DOT11_POWER_MODE_REASON` = 3;
public const val `dot11_power_mode_reason_compliant_WFD_device`: `DOT11_POWER_MODE_REASON` = 4;
public const val `dot11_power_mode_reason_legacy_WFD_device`: `DOT11_POWER_MODE_REASON` = 2;
public const val `dot11_power_mode_reason_no_change`: `DOT11_POWER_MODE_REASON` = 0;
public const val `dot11_power_mode_reason_noncompliant_AP`: `DOT11_POWER_MODE_REASON` = 1;
public const val `dot11_power_mode_reason_others`: `DOT11_POWER_MODE_REASON` = 5;
public const val `dot11_power_mode_unknown`: `DOT11_POWER_MODE` = 0;
public const val `dot11_radio_state_off`: `DOT11_RADIO_STATE` = 2;
public const val `dot11_radio_state_on`: `DOT11_RADIO_STATE` = 1;
public const val `dot11_radio_state_unknown`: `DOT11_RADIO_STATE` = 0;
public const val `dot11_reset_type_mac`: `DOT11_RESET_TYPE` = 2;
public const val `dot11_reset_type_phy`: `DOT11_RESET_TYPE` = 1;
public const val `dot11_reset_type_phy_and_mac`: `DOT11_RESET_TYPE` = 3;
public const val `dot11_scan_type_active`: `DOT11_SCAN_TYPE` = 1;
public const val `dot11_scan_type_auto`: `DOT11_SCAN_TYPE` = 3;
public const val `dot11_scan_type_forced`: `DOT11_SCAN_TYPE` = -2147483648;
public const val `dot11_scan_type_passive`: `DOT11_SCAN_TYPE` = 2;
public const val `dot11_temp_type_1`: `DOT11_TEMP_TYPE` = 1;
public const val `dot11_temp_type_2`: `DOT11_TEMP_TYPE` = 2;
public const val `dot11_temp_type_unknown`: `DOT11_TEMP_TYPE` = 0;
public const val `dot11_update_ie_op_create_replace`: `DOT11_UPDATE_IE_OP` = 1;
public const val `dot11_update_ie_op_delete`: `DOT11_UPDATE_IE_OP` = 2;
public const val `dot11_wfd_discover_type_auto`: `DOT11_WFD_DISCOVER_TYPE` = 3;
public const val `dot11_wfd_discover_type_find_only`: `DOT11_WFD_DISCOVER_TYPE` = 2;
public const val `dot11_wfd_discover_type_forced`: `DOT11_WFD_DISCOVER_TYPE` = -2147483648;
public const val `dot11_wfd_discover_type_scan_only`: `DOT11_WFD_DISCOVER_TYPE` = 1;
public const val `dot11_wfd_discover_type_scan_social_channels`: `DOT11_WFD_DISCOVER_TYPE` = 4;
public const val `dot11_wfd_scan_type_active`: `DOT11_WFD_SCAN_TYPE` = 1;
public const val `dot11_wfd_scan_type_auto`: `DOT11_WFD_SCAN_TYPE` = 3;
public const val `dot11_wfd_scan_type_passive`: `DOT11_WFD_SCAN_TYPE` = 2;
public const val `wlan_adhoc_network_state_connected`: `WLAN_ADHOC_NETWORK_STATE` = 1;
public const val `wlan_adhoc_network_state_formed`: `WLAN_ADHOC_NETWORK_STATE` = 0;
public const val `wlan_autoconf_opcode_allow_explicit_creds`: `WLAN_AUTOCONF_OPCODE` = 4;
public const val `wlan_autoconf_opcode_allow_virtual_station_extensibility`: `WLAN_AUTOCONF_OPCODE` = 6;
public const val `wlan_autoconf_opcode_block_period`: `WLAN_AUTOCONF_OPCODE` = 5;
public const val `wlan_autoconf_opcode_end`: `WLAN_AUTOCONF_OPCODE` = 7;
public const val `wlan_autoconf_opcode_only_use_gp_profiles_for_allowed_networks`: `WLAN_AUTOCONF_OPCODE` = 3;
public const val `wlan_autoconf_opcode_power_setting`: `WLAN_AUTOCONF_OPCODE` = 2;
public const val `wlan_autoconf_opcode_show_denied_networks`: `WLAN_AUTOCONF_OPCODE` = 1;
public const val `wlan_autoconf_opcode_start`: `WLAN_AUTOCONF_OPCODE` = 0;
public const val `wlan_connection_mode_auto`: `WLAN_CONNECTION_MODE` = 4;
public const val `wlan_connection_mode_discovery_secure`: `WLAN_CONNECTION_MODE` = 2;
public const val `wlan_connection_mode_discovery_unsecure`: `WLAN_CONNECTION_MODE` = 3;
public const val `wlan_connection_mode_invalid`: `WLAN_CONNECTION_MODE` = 5;
public const val `wlan_connection_mode_profile`: `WLAN_CONNECTION_MODE` = 0;
public const val `wlan_connection_mode_temporary_profile`: `WLAN_CONNECTION_MODE` = 1;
public const val `wlan_filter_list_type_gp_deny`: `WLAN_FILTER_LIST_TYPE` = 1;
public const val `wlan_filter_list_type_gp_permit`: `WLAN_FILTER_LIST_TYPE` = 0;
public const val `wlan_filter_list_type_user_deny`: `WLAN_FILTER_LIST_TYPE` = 3;
public const val `wlan_filter_list_type_user_permit`: `WLAN_FILTER_LIST_TYPE` = 2;
public const val `wlan_hosted_network_active`: `WLAN_HOSTED_NETWORK_STATE` = 2;
public const val `wlan_hosted_network_idle`: `WLAN_HOSTED_NETWORK_STATE` = 1;
public const val `wlan_hosted_network_opcode_connection_settings`: `WLAN_HOSTED_NETWORK_OPCODE` = 0;
public const val `wlan_hosted_network_opcode_enable`: `WLAN_HOSTED_NETWORK_OPCODE` = 3;
public const val `wlan_hosted_network_opcode_security_settings`: `WLAN_HOSTED_NETWORK_OPCODE` = 1;
public const val `wlan_hosted_network_opcode_station_profile`: `WLAN_HOSTED_NETWORK_OPCODE` = 2;
public const val `wlan_hosted_network_peer_state_authenticated`: `WLAN_HOSTED_NETWORK_PEER_AUTH_STATE` = 1;
public const val `wlan_hosted_network_peer_state_change`: `WLAN_HOSTED_NETWORK_NOTIFICATION_CODE` = 4097;
public const val `wlan_hosted_network_peer_state_invalid`: `WLAN_HOSTED_NETWORK_PEER_AUTH_STATE` = 0;
public const val `wlan_hosted_network_radio_state_change`: `WLAN_HOSTED_NETWORK_NOTIFICATION_CODE` = 4098;
public const val `wlan_hosted_network_reason_ap_start_failed`: `WLAN_HOSTED_NETWORK_REASON` = 19;
public const val `wlan_hosted_network_reason_bad_parameters`: `WLAN_HOSTED_NETWORK_REASON` = 2;
public const val `wlan_hosted_network_reason_client_abort`: `WLAN_HOSTED_NETWORK_REASON` = 18;
public const val `wlan_hosted_network_reason_crypt_error`: `WLAN_HOSTED_NETWORK_REASON` = 8;
public const val `wlan_hosted_network_reason_device_change`: `WLAN_HOSTED_NETWORK_REASON` = 25;
public const val `wlan_hosted_network_reason_elevation_required`: `WLAN_HOSTED_NETWORK_REASON` = 5;
public const val `wlan_hosted_network_reason_gp_denied`: `WLAN_HOSTED_NETWORK_REASON` = 23;
public const val `wlan_hosted_network_reason_impersonation`: `WLAN_HOSTED_NETWORK_REASON` = 9;
public const val `wlan_hosted_network_reason_incompatible_connection_started`: `WLAN_HOSTED_NETWORK_REASON` = 15;
public const val `wlan_hosted_network_reason_incompatible_connection_stopped`: `WLAN_HOSTED_NETWORK_REASON` = 16;
public const val `wlan_hosted_network_reason_insufficient_resources`: `WLAN_HOSTED_NETWORK_REASON` = 4;
public const val `wlan_hosted_network_reason_interface_available`: `WLAN_HOSTED_NETWORK_REASON` = 11;
public const val `wlan_hosted_network_reason_interface_unavailable`: `WLAN_HOSTED_NETWORK_REASON` = 12;
public const val `wlan_hosted_network_reason_miniport_started`: `WLAN_HOSTED_NETWORK_REASON` = 14;
public const val `wlan_hosted_network_reason_miniport_stopped`: `WLAN_HOSTED_NETWORK_REASON` = 13;
public const val `wlan_hosted_network_reason_peer_arrived`: `WLAN_HOSTED_NETWORK_REASON` = 20;
public const val `wlan_hosted_network_reason_peer_departed`: `WLAN_HOSTED_NETWORK_REASON` = 21;
public const val `wlan_hosted_network_reason_peer_timeout`: `WLAN_HOSTED_NETWORK_REASON` = 22;
public const val `wlan_hosted_network_reason_persistence_failed`: `WLAN_HOSTED_NETWORK_REASON` = 7;
public const val `wlan_hosted_network_reason_properties_change`: `WLAN_HOSTED_NETWORK_REASON` = 26;
public const val `wlan_hosted_network_reason_read_only`: `WLAN_HOSTED_NETWORK_REASON` = 6;
public const val `wlan_hosted_network_reason_service_available_on_virtual_station`: `WLAN_HOSTED_NETWORK_REASON` = 28;
public const val `wlan_hosted_network_reason_service_shutting_down`: `WLAN_HOSTED_NETWORK_REASON` = 3;
public const val `wlan_hosted_network_reason_service_unavailable`: `WLAN_HOSTED_NETWORK_REASON` = 24;
public const val `wlan_hosted_network_reason_stop_before_start`: `WLAN_HOSTED_NETWORK_REASON` = 10;
public const val `wlan_hosted_network_reason_success`: `WLAN_HOSTED_NETWORK_REASON` = 0;
public const val `wlan_hosted_network_reason_unspecified`: `WLAN_HOSTED_NETWORK_REASON` = 1;
public const val `wlan_hosted_network_reason_user_action`: `WLAN_HOSTED_NETWORK_REASON` = 17;
public const val `wlan_hosted_network_reason_virtual_station_blocking_use`: `WLAN_HOSTED_NETWORK_REASON` = 27;
public const val `wlan_hosted_network_state_change`: `WLAN_HOSTED_NETWORK_NOTIFICATION_CODE` = 4096;
public const val `wlan_hosted_network_unavailable`: `WLAN_HOSTED_NETWORK_STATE` = 0;
public const val `wlan_ihv_control_type_driver`: `WLAN_IHV_CONTROL_TYPE` = 1;
public const val `wlan_ihv_control_type_service`: `WLAN_IHV_CONTROL_TYPE` = 0;
public const val `wlan_interface_state_ad_hoc_network_formed`: `WLAN_INTERFACE_STATE` = 2;
public const val `wlan_interface_state_associating`: `WLAN_INTERFACE_STATE` = 5;
public const val `wlan_interface_state_authenticating`: `WLAN_INTERFACE_STATE` = 7;
public const val `wlan_interface_state_connected`: `WLAN_INTERFACE_STATE` = 1;
public const val `wlan_interface_state_disconnected`: `WLAN_INTERFACE_STATE` = 4;
public const val `wlan_interface_state_disconnecting`: `WLAN_INTERFACE_STATE` = 3;
public const val `wlan_interface_state_discovering`: `WLAN_INTERFACE_STATE` = 6;
public const val `wlan_interface_state_not_ready`: `WLAN_INTERFACE_STATE` = 0;
public const val `wlan_interface_type_emulated_802_11`: `WLAN_INTERFACE_TYPE` = 0;
public const val `wlan_interface_type_invalid`: `WLAN_INTERFACE_TYPE` = 2;
public const val `wlan_interface_type_native_802_11`: `WLAN_INTERFACE_TYPE` = 1;
public const val `wlan_intf_opcode_autoconf_enabled`: `WLAN_INTF_OPCODE` = 1;
public const val `wlan_intf_opcode_autoconf_end`: `WLAN_INTF_OPCODE` = 268435455;
public const val `wlan_intf_opcode_autoconf_start`: `WLAN_INTF_OPCODE` = 0;
public const val `wlan_intf_opcode_background_scan_enabled`: `WLAN_INTF_OPCODE` = 2;
public const val `wlan_intf_opcode_bss_type`: `WLAN_INTF_OPCODE` = 5;
public const val `wlan_intf_opcode_certified_safe_mode`: `WLAN_INTF_OPCODE` = 14;
public const val `wlan_intf_opcode_channel_number`: `WLAN_INTF_OPCODE` = 8;
public const val `wlan_intf_opcode_current_connection`: `WLAN_INTF_OPCODE` = 7;
public const val `wlan_intf_opcode_current_operation_mode`: `WLAN_INTF_OPCODE` = 12;
public const val `wlan_intf_opcode_hosted_network_capable`: `WLAN_INTF_OPCODE` = 15;
public const val `wlan_intf_opcode_ihv_end`: `WLAN_INTF_OPCODE` = 1073741823;
public const val `wlan_intf_opcode_ihv_start`: `WLAN_INTF_OPCODE` = 805306368;
public const val `wlan_intf_opcode_interface_state`: `WLAN_INTF_OPCODE` = 6;
public const val `wlan_intf_opcode_management_frame_protection_capable`: `WLAN_INTF_OPCODE` = 16;
public const val `wlan_intf_opcode_media_streaming_mode`: `WLAN_INTF_OPCODE` = 3;
public const val `wlan_intf_opcode_msm_end`: `WLAN_INTF_OPCODE` = 536870911;
public const val `wlan_intf_opcode_msm_start`: `WLAN_INTF_OPCODE` = 268435712;
public const val `wlan_intf_opcode_radio_state`: `WLAN_INTF_OPCODE` = 4;
public const val `wlan_intf_opcode_rssi`: `WLAN_INTF_OPCODE` = 268435714;
public const val `wlan_intf_opcode_secondary_sta_interfaces`: `WLAN_INTF_OPCODE` = 17;
public const val `wlan_intf_opcode_secondary_sta_synchronized_connections`: `WLAN_INTF_OPCODE` = 18;
public const val `wlan_intf_opcode_security_end`: `WLAN_INTF_OPCODE` = 805306367;
public const val `wlan_intf_opcode_security_start`: `WLAN_INTF_OPCODE` = 536936448;
public const val `wlan_intf_opcode_statistics`: `WLAN_INTF_OPCODE` = 268435713;
public const val `wlan_intf_opcode_supported_adhoc_auth_cipher_pairs`: `WLAN_INTF_OPCODE` = 10;
public const val `wlan_intf_opcode_supported_country_or_region_string_list`: `WLAN_INTF_OPCODE` = 11;
public const val `wlan_intf_opcode_supported_infrastructure_auth_cipher_pairs`: `WLAN_INTF_OPCODE` = 9;
public const val `wlan_intf_opcode_supported_safe_mode`: `WLAN_INTF_OPCODE` = 13;
public const val `wlan_notification_acm_adhoc_network_state_change`: `WLAN_NOTIFICATION_ACM` = 22;
public const val `wlan_notification_acm_autoconf_disabled`: `WLAN_NOTIFICATION_ACM` = 2;
public const val `wlan_notification_acm_autoconf_enabled`: `WLAN_NOTIFICATION_ACM` = 1;
public const val `wlan_notification_acm_background_scan_disabled`: `WLAN_NOTIFICATION_ACM` = 4;
public const val `wlan_notification_acm_background_scan_enabled`: `WLAN_NOTIFICATION_ACM` = 3;
public const val `wlan_notification_acm_bss_type_change`: `WLAN_NOTIFICATION_ACM` = 5;
public const val `wlan_notification_acm_connection_attempt_fail`: `WLAN_NOTIFICATION_ACM` = 11;
public const val `wlan_notification_acm_connection_complete`: `WLAN_NOTIFICATION_ACM` = 10;
public const val `wlan_notification_acm_connection_start`: `WLAN_NOTIFICATION_ACM` = 9;
public const val `wlan_notification_acm_disconnected`: `WLAN_NOTIFICATION_ACM` = 21;
public const val `wlan_notification_acm_disconnecting`: `WLAN_NOTIFICATION_ACM` = 20;
public const val `wlan_notification_acm_end`: `WLAN_NOTIFICATION_ACM` = 28;
public const val `wlan_notification_acm_filter_list_change`: `WLAN_NOTIFICATION_ACM` = 12;
public const val `wlan_notification_acm_interface_arrival`: `WLAN_NOTIFICATION_ACM` = 13;
public const val `wlan_notification_acm_interface_removal`: `WLAN_NOTIFICATION_ACM` = 14;
public const val `wlan_notification_acm_network_available`: `WLAN_NOTIFICATION_ACM` = 19;
public const val `wlan_notification_acm_network_not_available`: `WLAN_NOTIFICATION_ACM` = 18;
public const val `wlan_notification_acm_operational_state_change`: `WLAN_NOTIFICATION_ACM` = 27;
public const val `wlan_notification_acm_power_setting_change`: `WLAN_NOTIFICATION_ACM` = 6;
public const val `wlan_notification_acm_profile_blocked`: `WLAN_NOTIFICATION_ACM` = 25;
public const val `wlan_notification_acm_profile_change`: `WLAN_NOTIFICATION_ACM` = 15;
public const val `wlan_notification_acm_profile_name_change`: `WLAN_NOTIFICATION_ACM` = 16;
public const val `wlan_notification_acm_profile_unblocked`: `WLAN_NOTIFICATION_ACM` = 23;
public const val `wlan_notification_acm_profiles_exhausted`: `WLAN_NOTIFICATION_ACM` = 17;
public const val `wlan_notification_acm_scan_complete`: `WLAN_NOTIFICATION_ACM` = 7;
public const val `wlan_notification_acm_scan_fail`: `WLAN_NOTIFICATION_ACM` = 8;
public const val `wlan_notification_acm_scan_list_refresh`: `WLAN_NOTIFICATION_ACM` = 26;
public const val `wlan_notification_acm_screen_power_change`: `WLAN_NOTIFICATION_ACM` = 24;
public const val `wlan_notification_acm_start`: `WLAN_NOTIFICATION_ACM` = 0;
public const val `wlan_notification_msm_adapter_operation_mode_change`: `WLAN_NOTIFICATION_MSM` = 14;
public const val `wlan_notification_msm_adapter_removal`: `WLAN_NOTIFICATION_MSM` = 13;
public const val `wlan_notification_msm_associated`: `WLAN_NOTIFICATION_MSM` = 2;
public const val `wlan_notification_msm_associating`: `WLAN_NOTIFICATION_MSM` = 1;
public const val `wlan_notification_msm_authenticating`: `WLAN_NOTIFICATION_MSM` = 3;
public const val `wlan_notification_msm_connected`: `WLAN_NOTIFICATION_MSM` = 4;
public const val `wlan_notification_msm_disassociating`: `WLAN_NOTIFICATION_MSM` = 9;
public const val `wlan_notification_msm_disconnected`: `WLAN_NOTIFICATION_MSM` = 10;
public const val `wlan_notification_msm_end`: `WLAN_NOTIFICATION_MSM` = 17;
public const val `wlan_notification_msm_link_degraded`: `WLAN_NOTIFICATION_MSM` = 15;
public const val `wlan_notification_msm_link_improved`: `WLAN_NOTIFICATION_MSM` = 16;
public const val `wlan_notification_msm_peer_join`: `WLAN_NOTIFICATION_MSM` = 11;
public const val `wlan_notification_msm_peer_leave`: `WLAN_NOTIFICATION_MSM` = 12;
public const val `wlan_notification_msm_radio_state_change`: `WLAN_NOTIFICATION_MSM` = 7;
public const val `wlan_notification_msm_roaming_end`: `WLAN_NOTIFICATION_MSM` = 6;
public const val `wlan_notification_msm_roaming_start`: `WLAN_NOTIFICATION_MSM` = 5;
public const val `wlan_notification_msm_signal_quality_change`: `WLAN_NOTIFICATION_MSM` = 8;
public const val `wlan_notification_msm_start`: `WLAN_NOTIFICATION_MSM` = 0;
public const val `wlan_notification_security_end`: `WLAN_NOTIFICATION_SECURITY` = 1;
public const val `wlan_notification_security_start`: `WLAN_NOTIFICATION_SECURITY` = 0;
public const val `wlan_opcode_value_type_invalid`: `WLAN_OPCODE_VALUE_TYPE` = 3;
public const val `wlan_opcode_value_type_query_only`: `WLAN_OPCODE_VALUE_TYPE` = 0;
public const val `wlan_opcode_value_type_set_by_group_policy`: `WLAN_OPCODE_VALUE_TYPE` = 1;
public const val `wlan_opcode_value_type_set_by_user`: `WLAN_OPCODE_VALUE_TYPE` = 2;
public const val `wlan_operational_state_going_off`: `WLAN_OPERATIONAL_STATE` = 3;
public const val `wlan_operational_state_going_on`: `WLAN_OPERATIONAL_STATE` = 4;
public const val `wlan_operational_state_off`: `WLAN_OPERATIONAL_STATE` = 1;
public const val `wlan_operational_state_on`: `WLAN_OPERATIONAL_STATE` = 2;
public const val `wlan_operational_state_unknown`: `WLAN_OPERATIONAL_STATE` = 0;
public const val `wlan_power_setting_invalid`: `WLAN_POWER_SETTING` = 4;
public const val `wlan_power_setting_low_saving`: `WLAN_POWER_SETTING` = 1;
public const val `wlan_power_setting_maximum_saving`: `WLAN_POWER_SETTING` = 3;
public const val `wlan_power_setting_medium_saving`: `WLAN_POWER_SETTING` = 2;
public const val `wlan_power_setting_no_saving`: `WLAN_POWER_SETTING` = 0;
public const val `wlan_secure_ac_enabled`: `WLAN_SECURABLE_OBJECT` = 2;
public const val `wlan_secure_add_new_all_user_profiles`: `WLAN_SECURABLE_OBJECT` = 9;
public const val `wlan_secure_add_new_per_user_profiles`: `WLAN_SECURABLE_OBJECT` = 10;
public const val `wlan_secure_all_user_profiles_order`: `WLAN_SECURABLE_OBJECT` = 8;
public const val `wlan_secure_bc_scan_enabled`: `WLAN_SECURABLE_OBJECT` = 3;
public const val `wlan_secure_bss_type`: `WLAN_SECURABLE_OBJECT` = 4;
public const val `wlan_secure_current_operation_mode`: `WLAN_SECURABLE_OBJECT` = 12;
public const val `wlan_secure_deny_list`: `WLAN_SECURABLE_OBJECT` = 1;
public const val `wlan_secure_get_plaintext_key`: `WLAN_SECURABLE_OBJECT` = 13;
public const val `wlan_secure_hosted_network_elevated_access`: `WLAN_SECURABLE_OBJECT` = 14;
public const val `wlan_secure_ihv_control`: `WLAN_SECURABLE_OBJECT` = 7;
public const val `wlan_secure_interface_properties`: `WLAN_SECURABLE_OBJECT` = 6;
public const val `wlan_secure_media_streaming_mode_enabled`: `WLAN_SECURABLE_OBJECT` = 11;
public const val `wlan_secure_permit_list`: `WLAN_SECURABLE_OBJECT` = 0;
public const val `wlan_secure_show_denied`: `WLAN_SECURABLE_OBJECT` = 5;
public const val `wlan_secure_virtual_station_extensibility`: `WLAN_SECURABLE_OBJECT` = 15;
public const val `wlan_secure_wfd_elevated_access`: `WLAN_SECURABLE_OBJECT` = 16;
