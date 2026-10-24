// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpAddFilterV4(serveripaddress : windows_sys::core::PCWSTR, addfilterinfo : *const DHCP_FILTER_ADD_INFO, forceflag : windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpAddSecurityGroup(pserver : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpAddServer(flags : u32, idinfo : *mut core::ffi::c_void, newserver : *mut DHCPDS_SERVER, callbackfn : *mut core::ffi::c_void, callbackdata : *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpAddSubnetElement(serveripaddress : windows_sys::core::PCWSTR, subnetaddress : u32, addelementinfo : *const DHCP_SUBNET_ELEMENT_DATA) -> u32);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpAddSubnetElementV4(serveripaddress : windows_sys::core::PCWSTR, subnetaddress : u32, addelementinfo : *const DHCP_SUBNET_ELEMENT_DATA_V4) -> u32);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpAddSubnetElementV5(serveripaddress : windows_sys::core::PCWSTR, subnetaddress : u32, addelementinfo : *const DHCP_SUBNET_ELEMENT_DATA_V5) -> u32);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpAddSubnetElementV6(serveripaddress : windows_sys::core::PCWSTR, subnetaddress : DHCP_IPV6_ADDRESS, addelementinfo : *mut DHCP_SUBNET_ELEMENT_DATA_V6) -> u32);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpAuditLogGetParams(serveripaddress : windows_sys::core::PCWSTR, flags : u32, auditlogdir : *mut windows_sys::core::PWSTR, diskcheckinterval : *mut u32, maxlogfilessize : *mut u32, minspaceondisk : *mut u32) -> u32);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpAuditLogSetParams(serveripaddress : windows_sys::core::PCWSTR, flags : u32, auditlogdir : windows_sys::core::PCWSTR, diskcheckinterval : u32, maxlogfilessize : u32, minspaceondisk : u32) -> u32);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpcsvc.dll" "system" fn DhcpCApiCleanup());

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpcsvc.dll" "system" fn DhcpCApiInitialize(version : *mut u32) -> u32);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpCreateClass(serveripaddress : windows_sys::core::PCWSTR, reservedmustbezero : u32, classinfo : *mut DHCP_CLASS_INFO) -> u32);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpCreateClassV6(serveripaddress : windows_sys::core::PCWSTR, reservedmustbezero : u32, classinfo : *mut DHCP_CLASS_INFO_V6) -> u32);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpCreateClientInfo(serveripaddress : windows_sys::core::PCWSTR, clientinfo : *const DHCP_CLIENT_INFO) -> u32);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpCreateClientInfoV4(serveripaddress : windows_sys::core::PCWSTR, clientinfo : *const DHCP_CLIENT_INFO_V4) -> u32);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpCreateClientInfoVQ(serveripaddress : windows_sys::core::PCWSTR, clientinfo : *const DHCP_CLIENT_INFO_VQ) -> u32);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpCreateOption(serveripaddress : windows_sys::core::PCWSTR, optionid : u32, optioninfo : *const DHCP_OPTION) -> u32);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpCreateOptionV5(serveripaddress : windows_sys::core::PCWSTR, flags : u32, optionid : u32, classname : windows_sys::core::PCWSTR, vendorname : windows_sys::core::PCWSTR, optioninfo : *mut DHCP_OPTION) -> u32);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpCreateOptionV6(serveripaddress : windows_sys::core::PCWSTR, flags : u32, optionid : u32, classname : windows_sys::core::PCWSTR, vendorname : windows_sys::core::PCWSTR, optioninfo : *mut DHCP_OPTION) -> u32);

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpCreateSubnet(serveripaddress : windows_sys::core::PCWSTR, subnetaddress : u32, subnetinfo : *const DHCP_SUBNET_INFO) -> u32);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpCreateSubnetV6(serveripaddress : windows_sys::core::PCWSTR, subnetaddress : DHCP_IPV6_ADDRESS, subnetinfo : *mut DHCP_SUBNET_INFO_V6) -> u32);

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpCreateSubnetVQ(serveripaddress : windows_sys::core::PCWSTR, subnetaddress : u32, subnetinfo : *const DHCP_SUBNET_INFO_VQ) -> u32);

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpcsvc.dll" "system" fn DhcpDeRegisterParamChange(flags : u32, reserved : *mut core::ffi::c_void, event : *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpDeleteClass(serveripaddress : windows_sys::core::PCWSTR, reservedmustbezero : u32, classname : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpDeleteClassV6(serveripaddress : windows_sys::core::PCWSTR, reservedmustbezero : u32, classname : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpDeleteClientInfo(serveripaddress : windows_sys::core::PCWSTR, clientinfo : *const DHCP_SEARCH_INFO) -> u32);

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpDeleteClientInfoV6(serveripaddress : windows_sys::core::PCWSTR, clientinfo : *const DHCP_SEARCH_INFO_V6) -> u32);

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpDeleteFilterV4(serveripaddress : windows_sys::core::PCWSTR, deletefilterinfo : *const DHCP_ADDR_PATTERN) -> u32);

// UNSUPPORTED Rust 29:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpDeleteServer(flags : u32, idinfo : *mut core::ffi::c_void, newserver : *mut DHCPDS_SERVER, callbackfn : *mut core::ffi::c_void, callbackdata : *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 30:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpDeleteSubnet(serveripaddress : windows_sys::core::PCWSTR, subnetaddress : u32, forceflag : DHCP_FORCE_FLAG) -> u32);

// UNSUPPORTED Rust 31:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpDeleteSubnetV6(serveripaddress : windows_sys::core::PCWSTR, subnetaddress : DHCP_IPV6_ADDRESS, forceflag : DHCP_FORCE_FLAG) -> u32);

// UNSUPPORTED Rust 32:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpDeleteSuperScopeV4(serveripaddress : windows_sys::core::PCWSTR, superscopename : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 33:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpDsCleanup());

// UNSUPPORTED Rust 34:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpDsInit() -> u32);

// UNSUPPORTED Rust 35:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpEnumClasses(serveripaddress : windows_sys::core::PCWSTR, reservedmustbezero : u32, resumehandle : *mut u32, preferredmaximum : u32, classinfoarray : *mut *mut DHCP_CLASS_INFO_ARRAY, nread : *mut u32, ntotal : *mut u32) -> u32);

// UNSUPPORTED Rust 36:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpEnumClassesV6(serveripaddress : windows_sys::core::PCWSTR, reservedmustbezero : u32, resumehandle : *mut u32, preferredmaximum : u32, classinfoarray : *mut *mut DHCP_CLASS_INFO_ARRAY_V6, nread : *mut u32, ntotal : *mut u32) -> u32);

// UNSUPPORTED Rust 37:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpEnumFilterV4(serveripaddress : windows_sys::core::PCWSTR, resumehandle : *mut DHCP_ADDR_PATTERN, preferredmaximum : u32, listtype : DHCP_FILTER_LIST_TYPE, enumfilterinfo : *mut *mut DHCP_FILTER_ENUM_INFO, elementsread : *mut u32, elementstotal : *mut u32) -> u32);

// UNSUPPORTED Rust 38:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpEnumOptionValues(serveripaddress : windows_sys::core::PCWSTR, scopeinfo : *const DHCP_OPTION_SCOPE_INFO, resumehandle : *mut u32, preferredmaximum : u32, optionvalues : *mut *mut DHCP_OPTION_VALUE_ARRAY, optionsread : *mut u32, optionstotal : *mut u32) -> u32);

// UNSUPPORTED Rust 39:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpEnumOptionValuesV5(serveripaddress : windows_sys::core::PCWSTR, flags : u32, classname : windows_sys::core::PCWSTR, vendorname : windows_sys::core::PCWSTR, scopeinfo : *mut DHCP_OPTION_SCOPE_INFO, resumehandle : *mut u32, preferredmaximum : u32, optionvalues : *mut *mut DHCP_OPTION_VALUE_ARRAY, optionsread : *mut u32, optionstotal : *mut u32) -> u32);

// UNSUPPORTED Rust 40:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpEnumOptionValuesV6(serveripaddress : windows_sys::core::PCWSTR, flags : u32, classname : windows_sys::core::PCWSTR, vendorname : windows_sys::core::PCWSTR, scopeinfo : *mut DHCP_OPTION_SCOPE_INFO6, resumehandle : *mut u32, preferredmaximum : u32, optionvalues : *mut *mut DHCP_OPTION_VALUE_ARRAY, optionsread : *mut u32, optionstotal : *mut u32) -> u32);

// UNSUPPORTED Rust 41:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpEnumOptions(serveripaddress : windows_sys::core::PCWSTR, resumehandle : *mut u32, preferredmaximum : u32, options : *mut *mut DHCP_OPTION_ARRAY, optionsread : *mut u32, optionstotal : *mut u32) -> u32);

// UNSUPPORTED Rust 42:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpEnumOptionsV5(serveripaddress : windows_sys::core::PCWSTR, flags : u32, classname : windows_sys::core::PCWSTR, vendorname : windows_sys::core::PCWSTR, resumehandle : *mut u32, preferredmaximum : u32, options : *mut *mut DHCP_OPTION_ARRAY, optionsread : *mut u32, optionstotal : *mut u32) -> u32);

// UNSUPPORTED Rust 43:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpEnumOptionsV6(serveripaddress : windows_sys::core::PCWSTR, flags : u32, classname : windows_sys::core::PCWSTR, vendorname : windows_sys::core::PCWSTR, resumehandle : *mut u32, preferredmaximum : u32, options : *mut *mut DHCP_OPTION_ARRAY, optionsread : *mut u32, optionstotal : *mut u32) -> u32);

// UNSUPPORTED Rust 44:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpEnumServers(flags : u32, idinfo : *mut core::ffi::c_void, servers : *mut *mut DHCPDS_SERVERS, callbackfn : *mut core::ffi::c_void, callbackdata : *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 45:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpEnumSubnetClients(serveripaddress : windows_sys::core::PCWSTR, subnetaddress : u32, resumehandle : *mut u32, preferredmaximum : u32, clientinfo : *mut *mut DHCP_CLIENT_INFO_ARRAY, clientsread : *mut u32, clientstotal : *mut u32) -> u32);

// UNSUPPORTED Rust 46:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpEnumSubnetClientsFilterStatusInfo(serveripaddress : windows_sys::core::PCWSTR, subnetaddress : u32, resumehandle : *mut u32, preferredmaximum : u32, clientinfo : *mut *mut DHCP_CLIENT_FILTER_STATUS_INFO_ARRAY, clientsread : *mut u32, clientstotal : *mut u32) -> u32);

// UNSUPPORTED Rust 47:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpEnumSubnetClientsV4(serveripaddress : windows_sys::core::PCWSTR, subnetaddress : u32, resumehandle : *mut u32, preferredmaximum : u32, clientinfo : *mut *mut DHCP_CLIENT_INFO_ARRAY_V4, clientsread : *mut u32, clientstotal : *mut u32) -> u32);

// UNSUPPORTED Rust 48:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpEnumSubnetClientsV5(serveripaddress : windows_sys::core::PCWSTR, subnetaddress : u32, resumehandle : *mut u32, preferredmaximum : u32, clientinfo : *mut *mut DHCP_CLIENT_INFO_ARRAY_V5, clientsread : *mut u32, clientstotal : *mut u32) -> u32);

// UNSUPPORTED Rust 49:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpEnumSubnetClientsV6(serveripaddress : windows_sys::core::PCWSTR, subnetaddress : DHCP_IPV6_ADDRESS, resumehandle : *mut DHCP_IPV6_ADDRESS, preferredmaximum : u32, clientinfo : *mut *mut DHCP_CLIENT_INFO_ARRAY_V6, clientsread : *mut u32, clientstotal : *mut u32) -> u32);

// UNSUPPORTED Rust 50:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpEnumSubnetClientsVQ(serveripaddress : windows_sys::core::PCWSTR, subnetaddress : u32, resumehandle : *mut u32, preferredmaximum : u32, clientinfo : *mut *mut DHCP_CLIENT_INFO_ARRAY_VQ, clientsread : *mut u32, clientstotal : *mut u32) -> u32);

// UNSUPPORTED Rust 51:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpEnumSubnetElements(serveripaddress : windows_sys::core::PCWSTR, subnetaddress : u32, enumelementtype : DHCP_SUBNET_ELEMENT_TYPE, resumehandle : *mut u32, preferredmaximum : u32, enumelementinfo : *mut *mut DHCP_SUBNET_ELEMENT_INFO_ARRAY, elementsread : *mut u32, elementstotal : *mut u32) -> u32);

// UNSUPPORTED Rust 52:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpEnumSubnetElementsV4(serveripaddress : windows_sys::core::PCWSTR, subnetaddress : u32, enumelementtype : DHCP_SUBNET_ELEMENT_TYPE, resumehandle : *mut u32, preferredmaximum : u32, enumelementinfo : *mut *mut DHCP_SUBNET_ELEMENT_INFO_ARRAY_V4, elementsread : *mut u32, elementstotal : *mut u32) -> u32);

// UNSUPPORTED Rust 53:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpEnumSubnetElementsV5(serveripaddress : windows_sys::core::PCWSTR, subnetaddress : u32, enumelementtype : DHCP_SUBNET_ELEMENT_TYPE, resumehandle : *mut u32, preferredmaximum : u32, enumelementinfo : *mut *mut DHCP_SUBNET_ELEMENT_INFO_ARRAY_V5, elementsread : *mut u32, elementstotal : *mut u32) -> u32);

// UNSUPPORTED Rust 54:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpEnumSubnetElementsV6(serveripaddress : windows_sys::core::PCWSTR, subnetaddress : DHCP_IPV6_ADDRESS, enumelementtype : DHCP_SUBNET_ELEMENT_TYPE_V6, resumehandle : *mut u32, preferredmaximum : u32, enumelementinfo : *mut *mut DHCP_SUBNET_ELEMENT_INFO_ARRAY_V6, elementsread : *mut u32, elementstotal : *mut u32) -> u32);

// UNSUPPORTED Rust 55:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpEnumSubnets(serveripaddress : windows_sys::core::PCWSTR, resumehandle : *mut u32, preferredmaximum : u32, enuminfo : *mut *mut DHCP_IP_ARRAY, elementsread : *mut u32, elementstotal : *mut u32) -> u32);

// UNSUPPORTED Rust 56:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpEnumSubnetsV6(serveripaddress : windows_sys::core::PCWSTR, resumehandle : *mut u32, preferredmaximum : u32, enuminfo : *mut *mut DHCPV6_IP_ARRAY, elementsread : *mut u32, elementstotal : *mut u32) -> u32);

// UNSUPPORTED Rust 57:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpGetAllOptionValues(serveripaddress : windows_sys::core::PCWSTR, flags : u32, scopeinfo : *mut DHCP_OPTION_SCOPE_INFO, values : *mut *mut DHCP_ALL_OPTION_VALUES) -> u32);

// UNSUPPORTED Rust 58:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpGetAllOptionValuesV6(serveripaddress : windows_sys::core::PCWSTR, flags : u32, scopeinfo : *mut DHCP_OPTION_SCOPE_INFO6, values : *mut *mut DHCP_ALL_OPTION_VALUES) -> u32);

// UNSUPPORTED Rust 59:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpGetAllOptions(serveripaddress : windows_sys::core::PCWSTR, flags : u32, optionstruct : *mut *mut DHCP_ALL_OPTIONS) -> u32);

// UNSUPPORTED Rust 60:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpGetAllOptionsV6(serveripaddress : windows_sys::core::PCWSTR, flags : u32, optionstruct : *mut *mut DHCP_ALL_OPTIONS) -> u32);

// UNSUPPORTED Rust 61:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpGetClassInfo(serveripaddress : windows_sys::core::PCWSTR, reservedmustbezero : u32, partialclassinfo : *mut DHCP_CLASS_INFO, filledclassinfo : *mut *mut DHCP_CLASS_INFO) -> u32);

// UNSUPPORTED Rust 62:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpGetClientInfo(serveripaddress : windows_sys::core::PCWSTR, searchinfo : *const DHCP_SEARCH_INFO, clientinfo : *mut *mut DHCP_CLIENT_INFO) -> u32);

// UNSUPPORTED Rust 63:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpGetClientInfoV4(serveripaddress : windows_sys::core::PCWSTR, searchinfo : *const DHCP_SEARCH_INFO, clientinfo : *mut *mut DHCP_CLIENT_INFO_V4) -> u32);

// UNSUPPORTED Rust 64:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpGetClientInfoV6(serveripaddress : windows_sys::core::PCWSTR, searchinfo : *const DHCP_SEARCH_INFO_V6, clientinfo : *mut *mut DHCP_CLIENT_INFO_V6) -> u32);

// UNSUPPORTED Rust 65:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpGetClientInfoVQ(serveripaddress : windows_sys::core::PCWSTR, searchinfo : *const DHCP_SEARCH_INFO, clientinfo : *mut *mut DHCP_CLIENT_INFO_VQ) -> u32);

// UNSUPPORTED Rust 66:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpGetClientOptions(serveripaddress : windows_sys::core::PCWSTR, clientipaddress : u32, clientsubnetmask : u32, clientoptions : *mut *mut DHCP_OPTION_LIST) -> u32);

// UNSUPPORTED Rust 67:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpGetFilterV4(serveripaddress : windows_sys::core::PCWSTR, globalfilterinfo : *mut DHCP_FILTER_GLOBAL_INFO) -> u32);

// UNSUPPORTED Rust 68:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpGetMibInfo(serveripaddress : windows_sys::core::PCWSTR, mibinfo : *mut *mut DHCP_MIB_INFO) -> u32);

// UNSUPPORTED Rust 69:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpGetMibInfoV5(serveripaddress : windows_sys::core::PCWSTR, mibinfo : *mut *mut DHCP_MIB_INFO_V5) -> u32);

// UNSUPPORTED Rust 70:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpGetMibInfoV6(serveripaddress : windows_sys::core::PCWSTR, mibinfo : *mut *mut DHCP_MIB_INFO_V6) -> u32);

// UNSUPPORTED Rust 71:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpGetOptionInfo(serveripaddress : windows_sys::core::PCWSTR, optionid : u32, optioninfo : *mut *mut DHCP_OPTION) -> u32);

// UNSUPPORTED Rust 72:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpGetOptionInfoV5(serveripaddress : windows_sys::core::PCWSTR, flags : u32, optionid : u32, classname : windows_sys::core::PCWSTR, vendorname : windows_sys::core::PCWSTR, optioninfo : *mut *mut DHCP_OPTION) -> u32);

// UNSUPPORTED Rust 73:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpGetOptionInfoV6(serveripaddress : windows_sys::core::PCWSTR, flags : u32, optionid : u32, classname : windows_sys::core::PCWSTR, vendorname : windows_sys::core::PCWSTR, optioninfo : *mut *mut DHCP_OPTION) -> u32);

// UNSUPPORTED Rust 74:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpGetOptionValue(serveripaddress : windows_sys::core::PCWSTR, optionid : u32, scopeinfo : *const DHCP_OPTION_SCOPE_INFO, optionvalue : *mut *mut DHCP_OPTION_VALUE) -> u32);

// UNSUPPORTED Rust 75:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpGetOptionValueV5(serveripaddress : windows_sys::core::PCWSTR, flags : u32, optionid : u32, classname : windows_sys::core::PCWSTR, vendorname : windows_sys::core::PCWSTR, scopeinfo : *mut DHCP_OPTION_SCOPE_INFO, optionvalue : *mut *mut DHCP_OPTION_VALUE) -> u32);

// UNSUPPORTED Rust 76:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpGetOptionValueV6(serveripaddress : windows_sys::core::PCWSTR, flags : u32, optionid : u32, classname : windows_sys::core::PCWSTR, vendorname : windows_sys::core::PCWSTR, scopeinfo : *mut DHCP_OPTION_SCOPE_INFO6, optionvalue : *mut *mut DHCP_OPTION_VALUE) -> u32);

// UNSUPPORTED Rust 77:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpcsvc.dll" "system" fn DhcpGetOriginalSubnetMask(sadaptername : windows_sys::core::PCWSTR, dwsubnetmask : *mut u32) -> u32);

// UNSUPPORTED Rust 78:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpGetServerBindingInfo(serveripaddress : windows_sys::core::PCWSTR, flags : u32, bindelementsinfo : *mut *mut DHCP_BIND_ELEMENT_ARRAY) -> u32);

// UNSUPPORTED Rust 79:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpGetServerBindingInfoV6(serveripaddress : windows_sys::core::PCWSTR, flags : u32, bindelementsinfo : *mut *mut DHCPV6_BIND_ELEMENT_ARRAY) -> u32);

// UNSUPPORTED Rust 80:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpGetServerSpecificStrings(serveripaddress : windows_sys::core::PCWSTR, serverspecificstrings : *mut *mut DHCP_SERVER_SPECIFIC_STRINGS) -> u32);

// UNSUPPORTED Rust 81:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpGetSubnetDelayOffer(serveripaddress : windows_sys::core::PCWSTR, subnetaddress : u32, timedelayinmilliseconds : *mut u16) -> u32);

// UNSUPPORTED Rust 82:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpGetSubnetInfo(serveripaddress : windows_sys::core::PCWSTR, subnetaddress : u32, subnetinfo : *mut *mut DHCP_SUBNET_INFO) -> u32);

// UNSUPPORTED Rust 83:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpGetSubnetInfoV6(serveripaddress : windows_sys::core::PCWSTR, subnetaddress : DHCP_IPV6_ADDRESS, subnetinfo : *mut *mut DHCP_SUBNET_INFO_V6) -> u32);

// UNSUPPORTED Rust 84:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpGetSubnetInfoVQ(serveripaddress : windows_sys::core::PCWSTR, subnetaddress : u32, subnetinfo : *mut *mut DHCP_SUBNET_INFO_VQ) -> u32);

// UNSUPPORTED Rust 85:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpGetSuperScopeInfoV4(serveripaddress : windows_sys::core::PCWSTR, superscopetable : *mut *mut DHCP_SUPER_SCOPE_TABLE) -> u32);

// UNSUPPORTED Rust 86:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpGetThreadOptions(pflags : *mut u32, reserved : *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 87:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpGetVersion(serveripaddress : windows_sys::core::PCWSTR, majorversion : *mut u32, minorversion : *mut u32) -> u32);

// UNSUPPORTED Rust 88:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpHlprAddV4PolicyCondition(policy : *mut DHCP_POLICY, parentexpr : u32, r#type : DHCP_POL_ATTR_TYPE, optionid : u32, suboptionid : u32, vendorname : windows_sys::core::PCWSTR, operator : DHCP_POL_COMPARATOR, value : *const u8, valuelength : u32, conditionindex : *mut u32) -> u32);

// UNSUPPORTED Rust 89:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpHlprAddV4PolicyExpr(policy : *mut DHCP_POLICY, parentexpr : u32, operator : DHCP_POL_LOGIC_OPER, exprindex : *mut u32) -> u32);

// UNSUPPORTED Rust 90:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpHlprAddV4PolicyRange(policy : *mut DHCP_POLICY, range : *const DHCP_IP_RANGE) -> u32);

// UNSUPPORTED Rust 91:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpHlprCreateV4Policy(policyname : windows_sys::core::PCWSTR, fglobalpolicy : windows_sys::core::BOOL, subnet : u32, processingorder : u32, rootoperator : DHCP_POL_LOGIC_OPER, description : windows_sys::core::PCWSTR, enabled : windows_sys::core::BOOL, policy : *mut *mut DHCP_POLICY) -> u32);

// UNSUPPORTED Rust 92:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpHlprCreateV4PolicyEx(policyname : windows_sys::core::PCWSTR, fglobalpolicy : windows_sys::core::BOOL, subnet : u32, processingorder : u32, rootoperator : DHCP_POL_LOGIC_OPER, description : windows_sys::core::PCWSTR, enabled : windows_sys::core::BOOL, policy : *mut *mut DHCP_POLICY_EX) -> u32);

// UNSUPPORTED Rust 93:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpHlprFindV4DhcpProperty(propertyarray : *const DHCP_PROPERTY_ARRAY, id : DHCP_PROPERTY_ID, r#type : DHCP_PROPERTY_TYPE) -> *mut DHCP_PROPERTY);

// UNSUPPORTED Rust 94:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpHlprFreeV4DhcpProperty(property : *mut DHCP_PROPERTY));

// UNSUPPORTED Rust 95:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpHlprFreeV4DhcpPropertyArray(propertyarray : *mut DHCP_PROPERTY_ARRAY));

// UNSUPPORTED Rust 96:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpHlprFreeV4Policy(policy : *mut DHCP_POLICY));

// UNSUPPORTED Rust 97:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpHlprFreeV4PolicyArray(policyarray : *mut DHCP_POLICY_ARRAY));

// UNSUPPORTED Rust 98:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpHlprFreeV4PolicyEx(policyex : *mut DHCP_POLICY_EX));

// UNSUPPORTED Rust 99:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpHlprFreeV4PolicyExArray(policyexarray : *mut DHCP_POLICY_EX_ARRAY));

// UNSUPPORTED Rust 100:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpHlprIsV4PolicySingleUC(policy : *const DHCP_POLICY) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 101:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpHlprIsV4PolicyValid(ppolicy : *const DHCP_POLICY) -> u32);

// UNSUPPORTED Rust 102:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpHlprIsV4PolicyWellFormed(ppolicy : *const DHCP_POLICY) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 103:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpHlprModifyV4PolicyExpr(policy : *mut DHCP_POLICY, operator : DHCP_POL_LOGIC_OPER) -> u32);

// UNSUPPORTED Rust 104:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpHlprResetV4PolicyExpr(policy : *mut DHCP_POLICY) -> u32);

// UNSUPPORTED Rust 105:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpModifyClass(serveripaddress : windows_sys::core::PCWSTR, reservedmustbezero : u32, classinfo : *mut DHCP_CLASS_INFO) -> u32);

// UNSUPPORTED Rust 106:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpModifyClassV6(serveripaddress : windows_sys::core::PCWSTR, reservedmustbezero : u32, classinfo : *mut DHCP_CLASS_INFO_V6) -> u32);

// UNSUPPORTED Rust 107:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpcsvc.dll" "system" fn DhcpRegisterParamChange(flags : u32, reserved : *const core::ffi::c_void, adaptername : windows_sys::core::PCWSTR, classid : *mut DHCPCAPI_CLASSID, params : DHCPCAPI_PARAMS_ARRAY, handle : *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 108:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpcsvc.dll" "system" fn DhcpRemoveDNSRegistrations() -> u32);

// UNSUPPORTED Rust 109:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpRemoveOption(serveripaddress : windows_sys::core::PCWSTR, optionid : u32) -> u32);

// UNSUPPORTED Rust 110:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpRemoveOptionV5(serveripaddress : windows_sys::core::PCWSTR, flags : u32, optionid : u32, classname : windows_sys::core::PCWSTR, vendorname : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 111:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpRemoveOptionV6(serveripaddress : windows_sys::core::PCWSTR, flags : u32, optionid : u32, classname : windows_sys::core::PCWSTR, vendorname : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 112:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpRemoveOptionValue(serveripaddress : windows_sys::core::PCWSTR, optionid : u32, scopeinfo : *const DHCP_OPTION_SCOPE_INFO) -> u32);

// UNSUPPORTED Rust 113:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpRemoveOptionValueV5(serveripaddress : windows_sys::core::PCWSTR, flags : u32, optionid : u32, classname : windows_sys::core::PCWSTR, vendorname : windows_sys::core::PCWSTR, scopeinfo : *mut DHCP_OPTION_SCOPE_INFO) -> u32);

// UNSUPPORTED Rust 114:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpRemoveOptionValueV6(serveripaddress : windows_sys::core::PCWSTR, flags : u32, optionid : u32, classname : windows_sys::core::PCWSTR, vendorname : windows_sys::core::PCWSTR, scopeinfo : *mut DHCP_OPTION_SCOPE_INFO6) -> u32);

// UNSUPPORTED Rust 115:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpRemoveSubnetElement(serveripaddress : windows_sys::core::PCWSTR, subnetaddress : u32, removeelementinfo : *const DHCP_SUBNET_ELEMENT_DATA, forceflag : DHCP_FORCE_FLAG) -> u32);

// UNSUPPORTED Rust 116:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpRemoveSubnetElementV4(serveripaddress : windows_sys::core::PCWSTR, subnetaddress : u32, removeelementinfo : *const DHCP_SUBNET_ELEMENT_DATA_V4, forceflag : DHCP_FORCE_FLAG) -> u32);

// UNSUPPORTED Rust 117:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpRemoveSubnetElementV5(serveripaddress : windows_sys::core::PCWSTR, subnetaddress : u32, removeelementinfo : *const DHCP_SUBNET_ELEMENT_DATA_V5, forceflag : DHCP_FORCE_FLAG) -> u32);

// UNSUPPORTED Rust 118:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpRemoveSubnetElementV6(serveripaddress : windows_sys::core::PCWSTR, subnetaddress : DHCP_IPV6_ADDRESS, removeelementinfo : *mut DHCP_SUBNET_ELEMENT_DATA_V6, forceflag : DHCP_FORCE_FLAG) -> u32);

// UNSUPPORTED Rust 119:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpcsvc.dll" "system" fn DhcpRequestParams(flags : u32, reserved : *mut core::ffi::c_void, adaptername : windows_sys::core::PCWSTR, classid : *mut DHCPCAPI_CLASSID, sendparams : DHCPCAPI_PARAMS_ARRAY, recdparams : DHCPCAPI_PARAMS_ARRAY, buffer : *mut u8, psize : *mut u32, requestidstr : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 120:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpRpcFreeMemory(bufferpointer : *mut core::ffi::c_void));

// UNSUPPORTED Rust 121:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpScanDatabase(serveripaddress : windows_sys::core::PCWSTR, subnetaddress : u32, fixflag : u32, scanlist : *mut *mut DHCP_SCAN_LIST) -> u32);

// UNSUPPORTED Rust 122:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpServerAuditlogParamsFree(configinfo : *mut DHCP_SERVER_CONFIG_INFO_VQ));

// UNSUPPORTED Rust 123:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpServerBackupDatabase(serveripaddress : windows_sys::core::PCWSTR, path : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 124:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpServerGetConfig(serveripaddress : windows_sys::core::PCWSTR, configinfo : *mut *mut DHCP_SERVER_CONFIG_INFO) -> u32);

// UNSUPPORTED Rust 125:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpServerGetConfigV4(serveripaddress : windows_sys::core::PCWSTR, configinfo : *mut *mut DHCP_SERVER_CONFIG_INFO_V4) -> u32);

// UNSUPPORTED Rust 126:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpServerGetConfigV6(serveripaddress : windows_sys::core::PCWSTR, scopeinfo : *mut DHCP_OPTION_SCOPE_INFO6, configinfo : *mut *mut DHCP_SERVER_CONFIG_INFO_V6) -> u32);

// UNSUPPORTED Rust 127:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpServerGetConfigVQ(serveripaddress : windows_sys::core::PCWSTR, configinfo : *mut *mut DHCP_SERVER_CONFIG_INFO_VQ) -> u32);

// UNSUPPORTED Rust 128:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpServerQueryAttribute(serveripaddr : windows_sys::core::PCWSTR, dwreserved : u32, dhcpattribid : u32, pdhcpattrib : *mut *mut DHCP_ATTRIB) -> u32);

// UNSUPPORTED Rust 129:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpServerQueryAttributes(serveripaddr : windows_sys::core::PCWSTR, dwreserved : u32, dwattribcount : u32, pdhcpattribs : *mut u32, pdhcpattribarr : *mut *mut DHCP_ATTRIB_ARRAY) -> u32);

// UNSUPPORTED Rust 130:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpServerQueryDnsRegCredentials(serveripaddress : windows_sys::core::PCWSTR, unamesize : u32, uname : windows_sys::core::PWSTR, domainsize : u32, domain : windows_sys::core::PWSTR) -> u32);

// UNSUPPORTED Rust 131:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpServerRedoAuthorization(serveripaddr : windows_sys::core::PCWSTR, dwreserved : u32) -> u32);

// UNSUPPORTED Rust 132:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpServerRestoreDatabase(serveripaddress : windows_sys::core::PCWSTR, path : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 133:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpServerSetConfig(serveripaddress : windows_sys::core::PCWSTR, fieldstoset : u32, configinfo : *mut DHCP_SERVER_CONFIG_INFO) -> u32);

// UNSUPPORTED Rust 134:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpServerSetConfigV4(serveripaddress : windows_sys::core::PCWSTR, fieldstoset : u32, configinfo : *mut DHCP_SERVER_CONFIG_INFO_V4) -> u32);

// UNSUPPORTED Rust 135:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpServerSetConfigV6(serveripaddress : windows_sys::core::PCWSTR, scopeinfo : *mut DHCP_OPTION_SCOPE_INFO6, fieldstoset : u32, configinfo : *mut DHCP_SERVER_CONFIG_INFO_V6) -> u32);

// UNSUPPORTED Rust 136:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpServerSetConfigVQ(serveripaddress : windows_sys::core::PCWSTR, fieldstoset : u32, configinfo : *mut DHCP_SERVER_CONFIG_INFO_VQ) -> u32);

// UNSUPPORTED Rust 137:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpServerSetDnsRegCredentials(serveripaddress : windows_sys::core::PCWSTR, uname : windows_sys::core::PCWSTR, domain : windows_sys::core::PCWSTR, passwd : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 138:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpServerSetDnsRegCredentialsV5(serveripaddress : windows_sys::core::PCWSTR, uname : windows_sys::core::PCWSTR, domain : windows_sys::core::PCWSTR, passwd : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 139:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpSetClientInfo(serveripaddress : windows_sys::core::PCWSTR, clientinfo : *const DHCP_CLIENT_INFO) -> u32);

// UNSUPPORTED Rust 140:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpSetClientInfoV4(serveripaddress : windows_sys::core::PCWSTR, clientinfo : *const DHCP_CLIENT_INFO_V4) -> u32);

// UNSUPPORTED Rust 141:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpSetClientInfoV6(serveripaddress : windows_sys::core::PCWSTR, clientinfo : *const DHCP_CLIENT_INFO_V6) -> u32);

// UNSUPPORTED Rust 142:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpSetClientInfoVQ(serveripaddress : windows_sys::core::PCWSTR, clientinfo : *const DHCP_CLIENT_INFO_VQ) -> u32);

// UNSUPPORTED Rust 143:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpSetFilterV4(serveripaddress : windows_sys::core::PCWSTR, globalfilterinfo : *const DHCP_FILTER_GLOBAL_INFO) -> u32);

// UNSUPPORTED Rust 144:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpSetOptionInfo(serveripaddress : windows_sys::core::PCWSTR, optionid : u32, optioninfo : *const DHCP_OPTION) -> u32);

// UNSUPPORTED Rust 145:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpSetOptionInfoV5(serveripaddress : windows_sys::core::PCWSTR, flags : u32, optionid : u32, classname : windows_sys::core::PCWSTR, vendorname : windows_sys::core::PCWSTR, optioninfo : *mut DHCP_OPTION) -> u32);

// UNSUPPORTED Rust 146:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpSetOptionInfoV6(serveripaddress : windows_sys::core::PCWSTR, flags : u32, optionid : u32, classname : windows_sys::core::PCWSTR, vendorname : windows_sys::core::PCWSTR, optioninfo : *mut DHCP_OPTION) -> u32);

// UNSUPPORTED Rust 147:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpSetOptionValue(serveripaddress : windows_sys::core::PCWSTR, optionid : u32, scopeinfo : *const DHCP_OPTION_SCOPE_INFO, optionvalue : *const DHCP_OPTION_DATA) -> u32);

// UNSUPPORTED Rust 148:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpSetOptionValueV5(serveripaddress : windows_sys::core::PCWSTR, flags : u32, optionid : u32, classname : windows_sys::core::PCWSTR, vendorname : windows_sys::core::PCWSTR, scopeinfo : *mut DHCP_OPTION_SCOPE_INFO, optionvalue : *mut DHCP_OPTION_DATA) -> u32);

// UNSUPPORTED Rust 149:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpSetOptionValueV6(serveripaddress : windows_sys::core::PCWSTR, flags : u32, optionid : u32, classname : windows_sys::core::PCWSTR, vendorname : windows_sys::core::PCWSTR, scopeinfo : *mut DHCP_OPTION_SCOPE_INFO6, optionvalue : *mut DHCP_OPTION_DATA) -> u32);

// UNSUPPORTED Rust 150:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpSetOptionValues(serveripaddress : windows_sys::core::PCWSTR, scopeinfo : *const DHCP_OPTION_SCOPE_INFO, optionvalues : *const DHCP_OPTION_VALUE_ARRAY) -> u32);

// UNSUPPORTED Rust 151:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpSetOptionValuesV5(serveripaddress : windows_sys::core::PCWSTR, flags : u32, classname : windows_sys::core::PCWSTR, vendorname : windows_sys::core::PCWSTR, scopeinfo : *mut DHCP_OPTION_SCOPE_INFO, optionvalues : *mut DHCP_OPTION_VALUE_ARRAY) -> u32);

// UNSUPPORTED Rust 152:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpSetServerBindingInfo(serveripaddress : windows_sys::core::PCWSTR, flags : u32, bindelementinfo : *mut DHCP_BIND_ELEMENT_ARRAY) -> u32);

// UNSUPPORTED Rust 153:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpSetServerBindingInfoV6(serveripaddress : windows_sys::core::PCWSTR, flags : u32, bindelementinfo : *mut DHCPV6_BIND_ELEMENT_ARRAY) -> u32);

// UNSUPPORTED Rust 154:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpSetSubnetDelayOffer(serveripaddress : windows_sys::core::PCWSTR, subnetaddress : u32, timedelayinmilliseconds : u16) -> u32);

// UNSUPPORTED Rust 155:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpSetSubnetInfo(serveripaddress : windows_sys::core::PCWSTR, subnetaddress : u32, subnetinfo : *const DHCP_SUBNET_INFO) -> u32);

// UNSUPPORTED Rust 156:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpSetSubnetInfoV6(serveripaddress : windows_sys::core::PCWSTR, subnetaddress : DHCP_IPV6_ADDRESS, subnetinfo : *mut DHCP_SUBNET_INFO_V6) -> u32);

// UNSUPPORTED Rust 157:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpSetSubnetInfoVQ(serveripaddress : windows_sys::core::PCWSTR, subnetaddress : u32, subnetinfo : *const DHCP_SUBNET_INFO_VQ) -> u32);

// UNSUPPORTED Rust 158:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpSetSuperScopeV4(serveripaddress : windows_sys::core::PCWSTR, subnetaddress : u32, superscopename : windows_sys::core::PCWSTR, changeexisting : windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 159:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpSetThreadOptions(flags : u32, reserved : *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 160:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpcsvc.dll" "system" fn DhcpUndoRequestParams(flags : u32, reserved : *const core::ffi::c_void, adaptername : windows_sys::core::PCWSTR, requestidstr : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 161:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpV4AddPolicyRange(serveripaddress : windows_sys::core::PCWSTR, subnetaddress : u32, policyname : windows_sys::core::PCWSTR, range : *const DHCP_IP_RANGE) -> u32);

// UNSUPPORTED Rust 162:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpV4CreateClientInfo(serveripaddress : windows_sys::core::PCWSTR, clientinfo : *const DHCP_CLIENT_INFO_PB) -> u32);

// UNSUPPORTED Rust 163:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpV4CreateClientInfoEx(serveripaddress : windows_sys::core::PCWSTR, clientinfo : *const DHCP_CLIENT_INFO_EX) -> u32);

// UNSUPPORTED Rust 164:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpV4CreatePolicy(serveripaddress : windows_sys::core::PCWSTR, ppolicy : *const DHCP_POLICY) -> u32);

// UNSUPPORTED Rust 165:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpV4CreatePolicyEx(serveripaddress : windows_sys::core::PCWSTR, policyex : *const DHCP_POLICY_EX) -> u32);

// UNSUPPORTED Rust 166:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpV4DeletePolicy(serveripaddress : windows_sys::core::PCWSTR, fglobalpolicy : windows_sys::core::BOOL, subnetaddress : u32, policyname : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 167:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpV4EnumPolicies(serveripaddress : windows_sys::core::PCWSTR, resumehandle : *mut u32, preferredmaximum : u32, fglobalpolicy : windows_sys::core::BOOL, subnetaddress : u32, enuminfo : *mut *mut DHCP_POLICY_ARRAY, elementsread : *mut u32, elementstotal : *mut u32) -> u32);

// UNSUPPORTED Rust 168:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpV4EnumPoliciesEx(serveripaddress : windows_sys::core::PCWSTR, resumehandle : *mut u32, preferredmaximum : u32, globalpolicy : windows_sys::core::BOOL, subnetaddress : u32, enuminfo : *mut *mut DHCP_POLICY_EX_ARRAY, elementsread : *mut u32, elementstotal : *mut u32) -> u32);

// UNSUPPORTED Rust 169:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpV4EnumSubnetClients(serveripaddress : windows_sys::core::PCWSTR, subnetaddress : u32, resumehandle : *mut u32, preferredmaximum : u32, clientinfo : *mut *mut DHCP_CLIENT_INFO_PB_ARRAY, clientsread : *mut u32, clientstotal : *mut u32) -> u32);

// UNSUPPORTED Rust 170:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpV4EnumSubnetClientsEx(serveripaddress : windows_sys::core::PCWSTR, subnetaddress : u32, resumehandle : *mut u32, preferredmaximum : u32, clientinfo : *mut *mut DHCP_CLIENT_INFO_EX_ARRAY, clientsread : *mut u32, clientstotal : *mut u32) -> u32);

// UNSUPPORTED Rust 171:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpV4EnumSubnetReservations(serveripaddress : windows_sys::core::PCWSTR, subnetaddress : u32, resumehandle : *mut u32, preferredmaximum : u32, enumelementinfo : *mut *mut DHCP_RESERVATION_INFO_ARRAY, elementsread : *mut u32, elementstotal : *mut u32) -> u32);

// UNSUPPORTED Rust 172:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpV4FailoverAddScopeToRelationship(serveripaddress : windows_sys::core::PCWSTR, prelationship : *const DHCP_FAILOVER_RELATIONSHIP) -> u32);

// UNSUPPORTED Rust 173:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpV4FailoverCreateRelationship(serveripaddress : windows_sys::core::PCWSTR, prelationship : *const DHCP_FAILOVER_RELATIONSHIP) -> u32);

// UNSUPPORTED Rust 174:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpV4FailoverDeleteRelationship(serveripaddress : windows_sys::core::PCWSTR, prelationshipname : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 175:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpV4FailoverDeleteScopeFromRelationship(serveripaddress : windows_sys::core::PCWSTR, prelationship : *const DHCP_FAILOVER_RELATIONSHIP) -> u32);

// UNSUPPORTED Rust 176:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpV4FailoverEnumRelationship(serveripaddress : windows_sys::core::PCWSTR, resumehandle : *mut u32, preferredmaximum : u32, prelationship : *mut *mut DHCP_FAILOVER_RELATIONSHIP_ARRAY, relationshipread : *mut u32, relationshiptotal : *mut u32) -> u32);

// UNSUPPORTED Rust 177:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpV4FailoverGetAddressStatus(serveripaddress : windows_sys::core::PCWSTR, subnetaddress : u32, pstatus : *mut u32) -> u32);

// UNSUPPORTED Rust 178:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpV4FailoverGetClientInfo(serveripaddress : windows_sys::core::PCWSTR, searchinfo : *const DHCP_SEARCH_INFO, clientinfo : *mut *mut DHCPV4_FAILOVER_CLIENT_INFO) -> u32);

// UNSUPPORTED Rust 179:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpV4FailoverGetRelationship(serveripaddress : windows_sys::core::PCWSTR, prelationshipname : windows_sys::core::PCWSTR, prelationship : *mut *mut DHCP_FAILOVER_RELATIONSHIP) -> u32);

// UNSUPPORTED Rust 180:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpV4FailoverGetScopeRelationship(serveripaddress : windows_sys::core::PCWSTR, scopeid : u32, prelationship : *mut *mut DHCP_FAILOVER_RELATIONSHIP) -> u32);

// UNSUPPORTED Rust 181:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpV4FailoverGetScopeStatistics(serveripaddress : windows_sys::core::PCWSTR, scopeid : u32, pstats : *mut *mut DHCP_FAILOVER_STATISTICS) -> u32);

// UNSUPPORTED Rust 182:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpV4FailoverGetSystemTime(serveripaddress : windows_sys::core::PCWSTR, ptime : *mut u32, pmaxalloweddeltatime : *mut u32) -> u32);

// UNSUPPORTED Rust 183:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpV4FailoverSetRelationship(serveripaddress : windows_sys::core::PCWSTR, flags : u32, prelationship : *const DHCP_FAILOVER_RELATIONSHIP) -> u32);

// UNSUPPORTED Rust 184:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpV4FailoverTriggerAddrAllocation(serveripaddress : windows_sys::core::PCWSTR, pfailrelname : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 185:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpV4GetAllOptionValues(serveripaddress : windows_sys::core::PCWSTR, flags : u32, scopeinfo : *mut DHCP_OPTION_SCOPE_INFO, values : *mut *mut DHCP_ALL_OPTION_VALUES_PB) -> u32);

// UNSUPPORTED Rust 186:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpV4GetClientInfo(serveripaddress : windows_sys::core::PCWSTR, searchinfo : *const DHCP_SEARCH_INFO, clientinfo : *mut *mut DHCP_CLIENT_INFO_PB) -> u32);

// UNSUPPORTED Rust 187:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpV4GetClientInfoEx(serveripaddress : windows_sys::core::PCWSTR, searchinfo : *const DHCP_SEARCH_INFO, clientinfo : *mut *mut DHCP_CLIENT_INFO_EX) -> u32);

// UNSUPPORTED Rust 188:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpV4GetFreeIPAddress(serveripaddress : windows_sys::core::PCWSTR, scopeid : u32, startip : u32, endip : u32, numfreeaddrreq : u32, ipaddrlist : *mut *mut DHCP_IP_ARRAY) -> u32);

// UNSUPPORTED Rust 189:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpV4GetOptionValue(serveripaddress : windows_sys::core::PCWSTR, flags : u32, optionid : u32, policyname : windows_sys::core::PCWSTR, vendorname : windows_sys::core::PCWSTR, scopeinfo : *mut DHCP_OPTION_SCOPE_INFO, optionvalue : *mut *mut DHCP_OPTION_VALUE) -> u32);

// UNSUPPORTED Rust 190:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpV4GetPolicy(serveripaddress : windows_sys::core::PCWSTR, fglobalpolicy : windows_sys::core::BOOL, subnetaddress : u32, policyname : windows_sys::core::PCWSTR, policy : *mut *mut DHCP_POLICY) -> u32);

// UNSUPPORTED Rust 191:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpV4GetPolicyEx(serveripaddress : windows_sys::core::PCWSTR, globalpolicy : windows_sys::core::BOOL, subnetaddress : u32, policyname : windows_sys::core::PCWSTR, policy : *mut *mut DHCP_POLICY_EX) -> u32);

// UNSUPPORTED Rust 192:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpV4QueryPolicyEnforcement(serveripaddress : windows_sys::core::PCWSTR, fglobalpolicy : windows_sys::core::BOOL, subnetaddress : u32, enabled : *mut windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 193:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpV4RemoveOptionValue(serveripaddress : windows_sys::core::PCWSTR, flags : u32, optionid : u32, policyname : windows_sys::core::PCWSTR, vendorname : windows_sys::core::PCWSTR, scopeinfo : *mut DHCP_OPTION_SCOPE_INFO) -> u32);

// UNSUPPORTED Rust 194:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpV4RemovePolicyRange(serveripaddress : windows_sys::core::PCWSTR, subnetaddress : u32, policyname : windows_sys::core::PCWSTR, range : *const DHCP_IP_RANGE) -> u32);

// UNSUPPORTED Rust 195:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpV4SetOptionValue(serveripaddress : windows_sys::core::PCWSTR, flags : u32, optionid : u32, policyname : windows_sys::core::PCWSTR, vendorname : windows_sys::core::PCWSTR, scopeinfo : *mut DHCP_OPTION_SCOPE_INFO, optionvalue : *mut DHCP_OPTION_DATA) -> u32);

// UNSUPPORTED Rust 196:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpV4SetOptionValues(serveripaddress : windows_sys::core::PCWSTR, flags : u32, policyname : windows_sys::core::PCWSTR, vendorname : windows_sys::core::PCWSTR, scopeinfo : *mut DHCP_OPTION_SCOPE_INFO, optionvalues : *mut DHCP_OPTION_VALUE_ARRAY) -> u32);

// UNSUPPORTED Rust 197:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpV4SetPolicy(serveripaddress : windows_sys::core::PCWSTR, fieldsmodified : u32, fglobalpolicy : windows_sys::core::BOOL, subnetaddress : u32, policyname : windows_sys::core::PCWSTR, policy : *const DHCP_POLICY) -> u32);

// UNSUPPORTED Rust 198:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpV4SetPolicyEnforcement(serveripaddress : windows_sys::core::PCWSTR, fglobalpolicy : windows_sys::core::BOOL, subnetaddress : u32, enable : windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 199:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpV4SetPolicyEx(serveripaddress : windows_sys::core::PCWSTR, fieldsmodified : u32, globalpolicy : windows_sys::core::BOOL, subnetaddress : u32, policyname : windows_sys::core::PCWSTR, policy : *const DHCP_POLICY_EX) -> u32);

// UNSUPPORTED Rust 200:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpV6CreateClientInfo(serveripaddress : windows_sys::core::PCWSTR, clientinfo : *const DHCP_CLIENT_INFO_V6) -> u32);

// UNSUPPORTED Rust 201:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpV6GetFreeIPAddress(serveripaddress : windows_sys::core::PCWSTR, scopeid : DHCP_IPV6_ADDRESS, startip : DHCP_IPV6_ADDRESS, endip : DHCP_IPV6_ADDRESS, numfreeaddrreq : u32, ipaddrlist : *mut *mut DHCPV6_IP_ARRAY) -> u32);

// UNSUPPORTED Rust 202:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpV6GetStatelessStatistics(serveripaddress : windows_sys::core::PCWSTR, statelessstats : *mut *mut DHCPV6_STATELESS_STATS) -> u32);

// UNSUPPORTED Rust 203:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpV6GetStatelessStoreParams(serveripaddress : windows_sys::core::PCWSTR, fserverlevel : windows_sys::core::BOOL, subnetaddress : DHCP_IPV6_ADDRESS, params : *mut *mut DHCPV6_STATELESS_PARAMS) -> u32);

// UNSUPPORTED Rust 204:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpsapi.dll" "system" fn DhcpV6SetStatelessStoreParams(serveripaddress : windows_sys::core::PCWSTR, fserverlevel : windows_sys::core::BOOL, subnetaddress : DHCP_IPV6_ADDRESS, fieldmodified : u32, params : *const DHCPV6_STATELESS_PARAMS) -> u32);

// UNSUPPORTED Rust 205:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpcsvc6.dll" "system" fn Dhcpv6CApiCleanup());

// UNSUPPORTED Rust 206:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpcsvc6.dll" "system" fn Dhcpv6CApiInitialize(version : *mut u32));

// UNSUPPORTED Rust 207:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpcsvc6.dll" "system" fn Dhcpv6ReleasePrefix(adaptername : windows_sys::core::PCWSTR, classid : *mut DHCPV6CAPI_CLASSID, leaseinfo : *mut DHCPV6PrefixLeaseInformation) -> u32);

// UNSUPPORTED Rust 208:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpcsvc6.dll" "system" fn Dhcpv6RenewPrefix(adaptername : windows_sys::core::PCWSTR, pclassid : *mut DHCPV6CAPI_CLASSID, prefixleaseinfo : *mut DHCPV6PrefixLeaseInformation, pdwtimetowait : *mut u32, bvalidateprefix : u32) -> u32);

// UNSUPPORTED Rust 209:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpcsvc6.dll" "system" fn Dhcpv6RequestParams(forcenewinform : windows_sys::core::BOOL, reserved : *mut core::ffi::c_void, adaptername : windows_sys::core::PCWSTR, classid : *mut DHCPV6CAPI_CLASSID, recdparams : DHCPV6CAPI_PARAMS_ARRAY, buffer : *mut u8, psize : *mut u32) -> u32);

// UNSUPPORTED Rust 210:1: declaration Macro has no candidate rule
// windows_link::link!("dhcpcsvc6.dll" "system" fn Dhcpv6RequestPrefix(adaptername : windows_sys::core::PCWSTR, pclassid : *mut DHCPV6CAPI_CLASSID, prefixleaseinfo : *mut DHCPV6PrefixLeaseInformation, pdwtimetowait : *mut u32) -> u32);

public const val `ADDRESS_TYPE_IANA`: UInt = 0u;
public const val `ADDRESS_TYPE_IATA`: UInt = 1u;
public const val `Allow`: `DHCP_FILTER_LIST_TYPE` = 1;
public const val `CHANGESTATE`: UInt = 4u;
public const val `CLIENT_TYPE_BOOTP`: UInt = 2u;
public const val `CLIENT_TYPE_DHCP`: UInt = 1u;
public const val `CLIENT_TYPE_NONE`: UInt = 100u;
public const val `CLIENT_TYPE_RESERVATION_FLAG`: UInt = 4u;
public const val `CLIENT_TYPE_UNSPECIFIED`: UInt = 0u;
public const val `COMMUNICATION_INT`: `FSM_STATE` = 4;
public const val `CONFLICT_DONE`: `FSM_STATE` = 7;
// UNSUPPORTED Rust 222:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DATE_TIME {
//     pub dwLowDateTime: u32,
//     pub dwHighDateTime: u32,
// }

public const val `DEFAULTQUARSETTING`: `QuarantineStatus` = 5;
// UNSUPPORTED Rust 229:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCPAPI_PARAMS {
//     pub Flags: u32,
//     pub OptionId: u32,
//     pub IsVendor: windows_sys::core::BOOL,
//     pub Data: *mut u8,
//     pub nBytesData: u32,
// }

// UNSUPPORTED Rust 238:1: declaration Impl has no candidate rule
// impl Default for DHCPAPI_PARAMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 243:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCPCAPI_CLASSID {
//     pub Flags: u32,
//     pub Data: *mut u8,
//     pub nBytesData: u32,
// }

// UNSUPPORTED Rust 250:1: declaration Impl has no candidate rule
// impl Default for DHCPCAPI_CLASSID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DHCPCAPI_DEREGISTER_HANDLE_EVENT`: UInt = 1u;
// UNSUPPORTED Rust 256:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCPCAPI_PARAMS_ARRAY {
//     pub nParams: u32,
//     pub Params: *mut DHCPAPI_PARAMS,
// }

// UNSUPPORTED Rust 262:1: declaration Impl has no candidate rule
// impl Default for DHCPCAPI_PARAMS_ARRAY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DHCPCAPI_REGISTER_HANDLE_EVENT`: UInt = 1u;
public const val `DHCPCAPI_REQUEST_ASYNCHRONOUS`: UInt = 4u;
public const val `DHCPCAPI_REQUEST_CANCEL`: UInt = 8u;
public const val `DHCPCAPI_REQUEST_MASK`: UInt = 15u;
public const val `DHCPCAPI_REQUEST_PERSISTENT`: UInt = 1u;
public const val `DHCPCAPI_REQUEST_SYNCHRONOUS`: UInt = 2u;
// UNSUPPORTED Rust 273:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCPDS_SERVER {
//     pub Version: u32,
//     pub ServerName: windows_sys::core::PWSTR,
//     pub ServerAddress: u32,
//     pub Flags: u32,
//     pub State: u32,
//     pub DsLocation: windows_sys::core::PWSTR,
//     pub DsLocType: u32,
// }

// UNSUPPORTED Rust 284:1: declaration Impl has no candidate rule
// impl Default for DHCPDS_SERVER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 289:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCPDS_SERVERS {
//     pub Flags: u32,
//     pub NumElements: u32,
//     pub Servers: *mut DHCPDS_SERVER,
// }

// UNSUPPORTED Rust 296:1: declaration Impl has no candidate rule
// impl Default for DHCPDS_SERVERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 301:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCPV4_FAILOVER_CLIENT_INFO {
//     pub ClientIpAddress: u32,
//     pub SubnetMask: u32,
//     pub ClientHardwareAddress: DHCP_BINARY_DATA,
//     pub ClientName: windows_sys::core::PWSTR,
//     pub ClientComment: windows_sys::core::PWSTR,
//     pub ClientLeaseExpires: DATE_TIME,
//     pub OwnerHost: DHCP_HOST_INFO,
//     pub bClientType: u8,
//     pub AddressState: u8,
//     pub Status: QuarantineStatus,
//     pub ProbationEnds: DATE_TIME,
//     pub QuarantineCapable: windows_sys::core::BOOL,
//     pub SentPotExpTime: u32,
//     pub AckPotExpTime: u32,
//     pub RecvPotExpTime: u32,
//     pub StartTime: u32,
//     pub CltLastTransTime: u32,
//     pub LastBndUpdTime: u32,
//     pub BndMsgStatus: u32,
//     pub PolicyName: windows_sys::core::PWSTR,
//     pub Flags: u8,
// }

// UNSUPPORTED Rust 326:1: declaration Impl has no candidate rule
// impl Default for DHCPV4_FAILOVER_CLIENT_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 331:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCPV4_FAILOVER_CLIENT_INFO_ARRAY {
//     pub NumElements: u32,
//     pub Clients: *mut *mut DHCPV4_FAILOVER_CLIENT_INFO,
// }

// UNSUPPORTED Rust 337:1: declaration Impl has no candidate rule
// impl Default for DHCPV4_FAILOVER_CLIENT_INFO_ARRAY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 342:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCPV4_FAILOVER_CLIENT_INFO_EX {
//     pub ClientIpAddress: u32,
//     pub SubnetMask: u32,
//     pub ClientHardwareAddress: DHCP_BINARY_DATA,
//     pub ClientName: windows_sys::core::PWSTR,
//     pub ClientComment: windows_sys::core::PWSTR,
//     pub ClientLeaseExpires: DATE_TIME,
//     pub OwnerHost: DHCP_HOST_INFO,
//     pub bClientType: u8,
//     pub AddressState: u8,
//     pub Status: QuarantineStatus,
//     pub ProbationEnds: DATE_TIME,
//     pub QuarantineCapable: windows_sys::core::BOOL,
//     pub SentPotExpTime: u32,
//     pub AckPotExpTime: u32,
//     pub RecvPotExpTime: u32,
//     pub StartTime: u32,
//     pub CltLastTransTime: u32,
//     pub LastBndUpdTime: u32,
//     pub BndMsgStatus: u32,
//     pub PolicyName: windows_sys::core::PWSTR,
//     pub Flags: u8,
//     pub AddressStateEx: u32,
// }

// UNSUPPORTED Rust 368:1: declaration Impl has no candidate rule
// impl Default for DHCPV4_FAILOVER_CLIENT_INFO_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 373:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCPV6CAPI_CLASSID {
//     pub Flags: u32,
//     pub Data: *mut u8,
//     pub nBytesData: u32,
// }

// UNSUPPORTED Rust 380:1: declaration Impl has no candidate rule
// impl Default for DHCPV6CAPI_CLASSID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 385:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCPV6CAPI_PARAMS {
//     pub Flags: u32,
//     pub OptionId: u32,
//     pub IsVendor: windows_sys::core::BOOL,
//     pub Data: *mut u8,
//     pub nBytesData: u32,
// }

// UNSUPPORTED Rust 394:1: declaration Impl has no candidate rule
// impl Default for DHCPV6CAPI_PARAMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 399:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCPV6CAPI_PARAMS_ARRAY {
//     pub nParams: u32,
//     pub Params: *mut DHCPV6CAPI_PARAMS,
// }

// UNSUPPORTED Rust 405:1: declaration Impl has no candidate rule
// impl Default for DHCPV6CAPI_PARAMS_ARRAY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 410:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCPV6Prefix {
//     pub prefix: [u8; 16],
//     pub prefixLength: u32,
//     pub preferredLifeTime: u32,
//     pub validLifeTime: u32,
//     pub status: StatusCode,
// }

// UNSUPPORTED Rust 419:1: declaration Impl has no candidate rule
// impl Default for DHCPV6Prefix {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 424:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCPV6PrefixLeaseInformation {
//     pub nPrefixes: u32,
//     pub prefixArray: *mut DHCPV6Prefix,
//     pub iaid: u32,
//     pub T1: i64,
//     pub T2: i64,
//     pub MaxLeaseExpirationTime: i64,
//     pub LastRenewalTime: i64,
//     pub status: StatusCode,
//     pub ServerId: *mut u8,
//     pub ServerIdLen: u32,
// }

// UNSUPPORTED Rust 438:1: declaration Impl has no candidate rule
// impl Default for DHCPV6PrefixLeaseInformation {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 443:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCPV6_BIND_ELEMENT {
//     pub Flags: u32,
//     pub fBoundToDHCPServer: windows_sys::core::BOOL,
//     pub AdapterPrimaryAddress: DHCP_IPV6_ADDRESS,
//     pub AdapterSubnetAddress: DHCP_IPV6_ADDRESS,
//     pub IfDescription: windows_sys::core::PWSTR,
//     pub IpV6IfIndex: u32,
//     pub IfIdSize: u32,
//     pub IfId: *mut u8,
// }

// UNSUPPORTED Rust 455:1: declaration Impl has no candidate rule
// impl Default for DHCPV6_BIND_ELEMENT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 460:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCPV6_BIND_ELEMENT_ARRAY {
//     pub NumElements: u32,
//     pub Elements: *mut DHCPV6_BIND_ELEMENT,
// }

// UNSUPPORTED Rust 466:1: declaration Impl has no candidate rule
// impl Default for DHCPV6_BIND_ELEMENT_ARRAY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 471:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCPV6_IP_ARRAY {
//     pub NumElements: u32,
//     pub Elements: *mut DHCP_IPV6_ADDRESS,
// }

// UNSUPPORTED Rust 477:1: declaration Impl has no candidate rule
// impl Default for DHCPV6_IP_ARRAY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DHCPV6_OPTION_CLIENTID`: UInt = 1u;
public const val `DHCPV6_OPTION_DNS_SERVERS`: UInt = 23u;
public const val `DHCPV6_OPTION_DOMAIN_LIST`: UInt = 24u;
public const val `DHCPV6_OPTION_IA_NA`: UInt = 3u;
public const val `DHCPV6_OPTION_IA_PD`: UInt = 25u;
public const val `DHCPV6_OPTION_IA_TA`: UInt = 4u;
public const val `DHCPV6_OPTION_NISP_DOMAIN_NAME`: UInt = 30u;
public const val `DHCPV6_OPTION_NISP_SERVERS`: UInt = 28u;
public const val `DHCPV6_OPTION_NIS_DOMAIN_NAME`: UInt = 29u;
public const val `DHCPV6_OPTION_NIS_SERVERS`: UInt = 27u;
public const val `DHCPV6_OPTION_ORO`: UInt = 6u;
public const val `DHCPV6_OPTION_PREFERENCE`: UInt = 7u;
public const val `DHCPV6_OPTION_RAPID_COMMIT`: UInt = 14u;
public const val `DHCPV6_OPTION_RECONF_MSG`: UInt = 19u;
public const val `DHCPV6_OPTION_SERVERID`: UInt = 2u;
public const val `DHCPV6_OPTION_SIP_SERVERS_ADDRS`: UInt = 22u;
public const val `DHCPV6_OPTION_SIP_SERVERS_NAMES`: UInt = 21u;
public const val `DHCPV6_OPTION_UNICAST`: UInt = 12u;
public const val `DHCPV6_OPTION_USER_CLASS`: UInt = 15u;
public const val `DHCPV6_OPTION_VENDOR_CLASS`: UInt = 16u;
public const val `DHCPV6_OPTION_VENDOR_OPTS`: UInt = 17u;
// UNSUPPORTED Rust 503:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DHCPV6_STATELESS_PARAMS {
//     pub Status: windows_sys::core::BOOL,
//     pub PurgeInterval: u32,
// }

public typealias `DHCPV6_STATELESS_PARAM_TYPE` = Int;
// UNSUPPORTED Rust 510:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DHCPV6_STATELESS_SCOPE_STATS {
//     pub SubnetAddress: DHCP_IPV6_ADDRESS,
//     pub NumStatelessClientsAdded: u64,
//     pub NumStatelessClientsRemoved: u64,
// }

// UNSUPPORTED Rust 517:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCPV6_STATELESS_STATS {
//     pub NumScopes: u32,
//     pub ScopeStats: *mut DHCPV6_STATELESS_SCOPE_STATS,
// }

// UNSUPPORTED Rust 523:1: declaration Impl has no candidate rule
// impl Default for DHCPV6_STATELESS_STATS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 528:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_ADDR_PATTERN {
//     pub MatchHWType: windows_sys::core::BOOL,
//     pub HWType: u8,
//     pub IsWildcard: windows_sys::core::BOOL,
//     pub Length: u8,
//     pub Pattern: [u8; 255],
// }

// UNSUPPORTED Rust 537:1: declaration Impl has no candidate rule
// impl Default for DHCP_ADDR_PATTERN {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 542:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_ALL_OPTIONS {
//     pub Flags: u32,
//     pub NonVendorOptions: *mut DHCP_OPTION_ARRAY,
//     pub NumVendorOptions: u32,
//     pub VendorOptions: *mut DHCP_ALL_OPTIONS_0,
// }

// UNSUPPORTED Rust 550:1: declaration Impl has no candidate rule
// impl Default for DHCP_ALL_OPTIONS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 555:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_ALL_OPTIONS_0 {
//     pub Option: DHCP_OPTION,
//     pub VendorName: windows_sys::core::PWSTR,
//     pub ClassName: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 562:1: declaration Impl has no candidate rule
// impl Default for DHCP_ALL_OPTIONS_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 567:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_ALL_OPTION_VALUES {
//     pub Flags: u32,
//     pub NumElements: u32,
//     pub Options: *mut DHCP_ALL_OPTION_VALUES_0,
// }

// UNSUPPORTED Rust 574:1: declaration Impl has no candidate rule
// impl Default for DHCP_ALL_OPTION_VALUES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 579:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_ALL_OPTION_VALUES_0 {
//     pub ClassName: windows_sys::core::PWSTR,
//     pub VendorName: windows_sys::core::PWSTR,
//     pub IsVendor: windows_sys::core::BOOL,
//     pub OptionsArray: *mut DHCP_OPTION_VALUE_ARRAY,
// }

// UNSUPPORTED Rust 587:1: declaration Impl has no candidate rule
// impl Default for DHCP_ALL_OPTION_VALUES_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 592:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_ALL_OPTION_VALUES_PB {
//     pub Flags: u32,
//     pub NumElements: u32,
//     pub Options: *mut DHCP_ALL_OPTION_VALUES_PB_0,
// }

// UNSUPPORTED Rust 599:1: declaration Impl has no candidate rule
// impl Default for DHCP_ALL_OPTION_VALUES_PB {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 604:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_ALL_OPTION_VALUES_PB_0 {
//     pub PolicyName: windows_sys::core::PWSTR,
//     pub VendorName: windows_sys::core::PWSTR,
//     pub IsVendor: windows_sys::core::BOOL,
//     pub OptionsArray: *mut DHCP_OPTION_VALUE_ARRAY,
// }

// UNSUPPORTED Rust 612:1: declaration Impl has no candidate rule
// impl Default for DHCP_ALL_OPTION_VALUES_PB_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 617:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_ATTRIB {
//     pub DhcpAttribId: u32,
//     pub DhcpAttribType: u32,
//     pub Anonymous: DHCP_ATTRIB_0,
// }

// UNSUPPORTED Rust 624:1: declaration Impl has no candidate rule
// impl Default for DHCP_ATTRIB {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 629:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DHCP_ATTRIB_0 {
//     pub DhcpAttribBool: windows_sys::core::BOOL,
//     pub DhcpAttribUlong: u32,
// }

// UNSUPPORTED Rust 635:1: declaration Impl has no candidate rule
// impl Default for DHCP_ATTRIB_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 640:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_ATTRIB_ARRAY {
//     pub NumElements: u32,
//     pub DhcpAttribs: *mut DHCP_ATTRIB,
// }

// UNSUPPORTED Rust 646:1: declaration Impl has no candidate rule
// impl Default for DHCP_ATTRIB_ARRAY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DHCP_ATTRIB_BOOL_IS_ADMIN`: UInt = 5u;
public const val `DHCP_ATTRIB_BOOL_IS_BINDING_AWARE`: UInt = 4u;
public const val `DHCP_ATTRIB_BOOL_IS_DYNBOOTP`: UInt = 2u;
public const val `DHCP_ATTRIB_BOOL_IS_PART_OF_DSDC`: UInt = 3u;
public const val `DHCP_ATTRIB_BOOL_IS_ROGUE`: UInt = 1u;
public const val `DHCP_ATTRIB_TYPE_BOOL`: UInt = 1u;
public const val `DHCP_ATTRIB_TYPE_ULONG`: UInt = 2u;
public const val `DHCP_ATTRIB_ULONG_RESTORE_STATUS`: UInt = 6u;
// UNSUPPORTED Rust 659:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_BINARY_DATA {
//     pub DataLength: u32,
//     pub Data: *mut u8,
// }

// UNSUPPORTED Rust 665:1: declaration Impl has no candidate rule
// impl Default for DHCP_BINARY_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 670:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_BIND_ELEMENT {
//     pub Flags: u32,
//     pub fBoundToDHCPServer: windows_sys::core::BOOL,
//     pub AdapterPrimaryAddress: u32,
//     pub AdapterSubnetAddress: u32,
//     pub IfDescription: windows_sys::core::PWSTR,
//     pub IfIdSize: u32,
//     pub IfId: *mut u8,
// }

// UNSUPPORTED Rust 681:1: declaration Impl has no candidate rule
// impl Default for DHCP_BIND_ELEMENT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 686:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_BIND_ELEMENT_ARRAY {
//     pub NumElements: u32,
//     pub Elements: *mut DHCP_BIND_ELEMENT,
// }

// UNSUPPORTED Rust 692:1: declaration Impl has no candidate rule
// impl Default for DHCP_BIND_ELEMENT_ARRAY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 697:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DHCP_BOOTP_IP_RANGE {
//     pub StartAddress: u32,
//     pub EndAddress: u32,
//     pub BootpAllocated: u32,
//     pub MaxBootpAllowed: u32,
// }

// UNSUPPORTED Rust 705:1: non-scalar type Ptr unsupported
// pub const DHCP_CALLOUT_ENTRY_POINT: windows_sys::core::PCSTR = windows_sys::core::s!("DhcpServerCalloutEntry");

// UNSUPPORTED Rust 706:1: non-scalar type Ptr unsupported
// pub const DHCP_CALLOUT_LIST_KEY: windows_sys::core::PCWSTR = windows_sys::core::w!("System\\CurrentControlSet\\Services\\DHCPServer\\Parameters");

// UNSUPPORTED Rust 707:1: non-scalar type Ptr unsupported
// pub const DHCP_CALLOUT_LIST_VALUE: windows_sys::core::PCWSTR = windows_sys::core::w!("CalloutDlls");

// UNSUPPORTED Rust 708:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_CALLOUT_TABLE {
//     pub DhcpControlHook: LPDHCP_CONTROL,
//     pub DhcpNewPktHook: LPDHCP_NEWPKT,
//     pub DhcpPktDropHook: LPDHCP_DROP_SEND,
//     pub DhcpPktSendHook: LPDHCP_DROP_SEND,
//     pub DhcpAddressDelHook: LPDHCP_PROB,
//     pub DhcpAddressOfferHook: LPDHCP_GIVE_ADDRESS,
//     pub DhcpHandleOptionsHook: LPDHCP_HANDLE_OPTIONS,
//     pub DhcpDeleteClientHook: LPDHCP_DELETE_CLIENT,
//     pub DhcpExtensionHook: *mut core::ffi::c_void,
//     pub DhcpReservedHook: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 722:1: declaration Impl has no candidate rule
// impl Default for DHCP_CALLOUT_TABLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 727:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_CLASS_INFO {
//     pub ClassName: windows_sys::core::PWSTR,
//     pub ClassComment: windows_sys::core::PWSTR,
//     pub ClassDataLength: u32,
//     pub IsVendor: windows_sys::core::BOOL,
//     pub Flags: u32,
//     pub ClassData: *mut u8,
// }

// UNSUPPORTED Rust 737:1: declaration Impl has no candidate rule
// impl Default for DHCP_CLASS_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 742:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_CLASS_INFO_ARRAY {
//     pub NumElements: u32,
//     pub Classes: *mut DHCP_CLASS_INFO,
// }

// UNSUPPORTED Rust 748:1: declaration Impl has no candidate rule
// impl Default for DHCP_CLASS_INFO_ARRAY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 753:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_CLASS_INFO_ARRAY_V6 {
//     pub NumElements: u32,
//     pub Classes: *mut DHCP_CLASS_INFO_V6,
// }

// UNSUPPORTED Rust 759:1: declaration Impl has no candidate rule
// impl Default for DHCP_CLASS_INFO_ARRAY_V6 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 764:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_CLASS_INFO_V6 {
//     pub ClassName: windows_sys::core::PWSTR,
//     pub ClassComment: windows_sys::core::PWSTR,
//     pub ClassDataLength: u32,
//     pub IsVendor: windows_sys::core::BOOL,
//     pub EnterpriseNumber: u32,
//     pub Flags: u32,
//     pub ClassData: *mut u8,
// }

// UNSUPPORTED Rust 775:1: declaration Impl has no candidate rule
// impl Default for DHCP_CLASS_INFO_V6 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DHCP_CLIENT_BOOTP`: UInt = 805306371u;
public const val `DHCP_CLIENT_DHCP`: UInt = 805306372u;
// UNSUPPORTED Rust 782:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_CLIENT_FILTER_STATUS_INFO {
//     pub ClientIpAddress: u32,
//     pub SubnetMask: u32,
//     pub ClientHardwareAddress: DHCP_BINARY_DATA,
//     pub ClientName: windows_sys::core::PWSTR,
//     pub ClientComment: windows_sys::core::PWSTR,
//     pub ClientLeaseExpires: DATE_TIME,
//     pub OwnerHost: DHCP_HOST_INFO,
//     pub bClientType: u8,
//     pub AddressState: u8,
//     pub Status: QuarantineStatus,
//     pub ProbationEnds: DATE_TIME,
//     pub QuarantineCapable: windows_sys::core::BOOL,
//     pub FilterStatus: u32,
// }

// UNSUPPORTED Rust 799:1: declaration Impl has no candidate rule
// impl Default for DHCP_CLIENT_FILTER_STATUS_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 804:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_CLIENT_FILTER_STATUS_INFO_ARRAY {
//     pub NumElements: u32,
//     pub Clients: *mut *mut DHCP_CLIENT_FILTER_STATUS_INFO,
// }

// UNSUPPORTED Rust 810:1: declaration Impl has no candidate rule
// impl Default for DHCP_CLIENT_FILTER_STATUS_INFO_ARRAY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 815:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_CLIENT_INFO {
//     pub ClientIpAddress: u32,
//     pub SubnetMask: u32,
//     pub ClientHardwareAddress: DHCP_BINARY_DATA,
//     pub ClientName: windows_sys::core::PWSTR,
//     pub ClientComment: windows_sys::core::PWSTR,
//     pub ClientLeaseExpires: DATE_TIME,
//     pub OwnerHost: DHCP_HOST_INFO,
// }

// UNSUPPORTED Rust 826:1: declaration Impl has no candidate rule
// impl Default for DHCP_CLIENT_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 831:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_CLIENT_INFO_ARRAY {
//     pub NumElements: u32,
//     pub Clients: *mut *mut DHCP_CLIENT_INFO,
// }

// UNSUPPORTED Rust 837:1: declaration Impl has no candidate rule
// impl Default for DHCP_CLIENT_INFO_ARRAY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 842:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_CLIENT_INFO_ARRAY_V4 {
//     pub NumElements: u32,
//     pub Clients: *mut *mut DHCP_CLIENT_INFO_V4,
// }

// UNSUPPORTED Rust 848:1: declaration Impl has no candidate rule
// impl Default for DHCP_CLIENT_INFO_ARRAY_V4 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 853:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_CLIENT_INFO_ARRAY_V5 {
//     pub NumElements: u32,
//     pub Clients: *mut *mut DHCP_CLIENT_INFO_V5,
// }

// UNSUPPORTED Rust 859:1: declaration Impl has no candidate rule
// impl Default for DHCP_CLIENT_INFO_ARRAY_V5 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 864:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_CLIENT_INFO_ARRAY_V6 {
//     pub NumElements: u32,
//     pub Clients: *mut *mut DHCP_CLIENT_INFO_V6,
// }

// UNSUPPORTED Rust 870:1: declaration Impl has no candidate rule
// impl Default for DHCP_CLIENT_INFO_ARRAY_V6 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 875:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_CLIENT_INFO_ARRAY_VQ {
//     pub NumElements: u32,
//     pub Clients: *mut *mut DHCP_CLIENT_INFO_VQ,
// }

// UNSUPPORTED Rust 881:1: declaration Impl has no candidate rule
// impl Default for DHCP_CLIENT_INFO_ARRAY_VQ {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 886:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_CLIENT_INFO_EX {
//     pub ClientIpAddress: u32,
//     pub SubnetMask: u32,
//     pub ClientHardwareAddress: DHCP_BINARY_DATA,
//     pub ClientName: windows_sys::core::PWSTR,
//     pub ClientComment: windows_sys::core::PWSTR,
//     pub ClientLeaseExpires: DATE_TIME,
//     pub OwnerHost: DHCP_HOST_INFO,
//     pub bClientType: u8,
//     pub AddressState: u8,
//     pub Status: QuarantineStatus,
//     pub ProbationEnds: DATE_TIME,
//     pub QuarantineCapable: windows_sys::core::BOOL,
//     pub FilterStatus: u32,
//     pub PolicyName: windows_sys::core::PWSTR,
//     pub Properties: *mut DHCP_PROPERTY_ARRAY,
// }

// UNSUPPORTED Rust 905:1: declaration Impl has no candidate rule
// impl Default for DHCP_CLIENT_INFO_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 910:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_CLIENT_INFO_EX_ARRAY {
//     pub NumElements: u32,
//     pub Clients: *mut *mut DHCP_CLIENT_INFO_EX,
// }

// UNSUPPORTED Rust 916:1: declaration Impl has no candidate rule
// impl Default for DHCP_CLIENT_INFO_EX_ARRAY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 921:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_CLIENT_INFO_PB {
//     pub ClientIpAddress: u32,
//     pub SubnetMask: u32,
//     pub ClientHardwareAddress: DHCP_BINARY_DATA,
//     pub ClientName: windows_sys::core::PWSTR,
//     pub ClientComment: windows_sys::core::PWSTR,
//     pub ClientLeaseExpires: DATE_TIME,
//     pub OwnerHost: DHCP_HOST_INFO,
//     pub bClientType: u8,
//     pub AddressState: u8,
//     pub Status: QuarantineStatus,
//     pub ProbationEnds: DATE_TIME,
//     pub QuarantineCapable: windows_sys::core::BOOL,
//     pub FilterStatus: u32,
//     pub PolicyName: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 939:1: declaration Impl has no candidate rule
// impl Default for DHCP_CLIENT_INFO_PB {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 944:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_CLIENT_INFO_PB_ARRAY {
//     pub NumElements: u32,
//     pub Clients: *mut *mut DHCP_CLIENT_INFO_PB,
// }

// UNSUPPORTED Rust 950:1: declaration Impl has no candidate rule
// impl Default for DHCP_CLIENT_INFO_PB_ARRAY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 955:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_CLIENT_INFO_V4 {
//     pub ClientIpAddress: u32,
//     pub SubnetMask: u32,
//     pub ClientHardwareAddress: DHCP_BINARY_DATA,
//     pub ClientName: windows_sys::core::PWSTR,
//     pub ClientComment: windows_sys::core::PWSTR,
//     pub ClientLeaseExpires: DATE_TIME,
//     pub OwnerHost: DHCP_HOST_INFO,
//     pub bClientType: u8,
// }

// UNSUPPORTED Rust 967:1: declaration Impl has no candidate rule
// impl Default for DHCP_CLIENT_INFO_V4 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 972:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_CLIENT_INFO_V5 {
//     pub ClientIpAddress: u32,
//     pub SubnetMask: u32,
//     pub ClientHardwareAddress: DHCP_BINARY_DATA,
//     pub ClientName: windows_sys::core::PWSTR,
//     pub ClientComment: windows_sys::core::PWSTR,
//     pub ClientLeaseExpires: DATE_TIME,
//     pub OwnerHost: DHCP_HOST_INFO,
//     pub bClientType: u8,
//     pub AddressState: u8,
// }

// UNSUPPORTED Rust 985:1: declaration Impl has no candidate rule
// impl Default for DHCP_CLIENT_INFO_V5 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 990:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_CLIENT_INFO_V6 {
//     pub ClientIpAddress: DHCP_IPV6_ADDRESS,
//     pub ClientDUID: DHCP_BINARY_DATA,
//     pub AddressType: u32,
//     pub IAID: u32,
//     pub ClientName: windows_sys::core::PWSTR,
//     pub ClientComment: windows_sys::core::PWSTR,
//     pub ClientValidLeaseExpires: DATE_TIME,
//     pub ClientPrefLeaseExpires: DATE_TIME,
//     pub OwnerHost: DHCP_HOST_INFO_V6,
// }

// UNSUPPORTED Rust 1003:1: declaration Impl has no candidate rule
// impl Default for DHCP_CLIENT_INFO_V6 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1008:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_CLIENT_INFO_VQ {
//     pub ClientIpAddress: u32,
//     pub SubnetMask: u32,
//     pub ClientHardwareAddress: DHCP_BINARY_DATA,
//     pub ClientName: windows_sys::core::PWSTR,
//     pub ClientComment: windows_sys::core::PWSTR,
//     pub ClientLeaseExpires: DATE_TIME,
//     pub OwnerHost: DHCP_HOST_INFO,
//     pub bClientType: u8,
//     pub AddressState: u8,
//     pub Status: QuarantineStatus,
//     pub ProbationEnds: DATE_TIME,
//     pub QuarantineCapable: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 1024:1: declaration Impl has no candidate rule
// impl Default for DHCP_CLIENT_INFO_VQ {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DHCP_CONTROL_CONTINUE`: UInt = 4u;
public const val `DHCP_CONTROL_PAUSE`: UInt = 3u;
public const val `DHCP_CONTROL_START`: UInt = 1u;
public const val `DHCP_CONTROL_STOP`: UInt = 2u;
public const val `DHCP_DROP_DUPLICATE`: UInt = 1u;
public const val `DHCP_DROP_GEN_FAILURE`: UInt = 256u;
public const val `DHCP_DROP_INTERNAL_ERROR`: UInt = 3u;
public const val `DHCP_DROP_INVALID`: UInt = 8u;
public const val `DHCP_DROP_NOADDRESS`: UInt = 10u;
public const val `DHCP_DROP_NOMEM`: UInt = 2u;
public const val `DHCP_DROP_NO_SUBNETS`: UInt = 7u;
public const val `DHCP_DROP_PAUSED`: UInt = 6u;
public const val `DHCP_DROP_PROCESSED`: UInt = 11u;
public const val `DHCP_DROP_TIMEOUT`: UInt = 4u;
public const val `DHCP_DROP_UNAUTH`: UInt = 5u;
public const val `DHCP_DROP_WRONG_SERVER`: UInt = 9u;
public const val `DHCP_ENDPOINT_FLAG_CANT_MODIFY`: UInt = 1u;
public const val `DHCP_FAILOVER_DELETE_SCOPES`: UInt = 1u;
public const val `DHCP_FAILOVER_MAX_NUM_ADD_SCOPES`: UInt = 400u;
public const val `DHCP_FAILOVER_MAX_NUM_REL`: UInt = 31u;
public typealias `DHCP_FAILOVER_MODE` = Int;
// UNSUPPORTED Rust 1050:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_FAILOVER_RELATIONSHIP {
//     pub PrimaryServer: u32,
//     pub SecondaryServer: u32,
//     pub Mode: DHCP_FAILOVER_MODE,
//     pub ServerType: DHCP_FAILOVER_SERVER,
//     pub State: FSM_STATE,
//     pub PrevState: FSM_STATE,
//     pub Mclt: u32,
//     pub SafePeriod: u32,
//     pub RelationshipName: windows_sys::core::PWSTR,
//     pub PrimaryServerName: windows_sys::core::PWSTR,
//     pub SecondaryServerName: windows_sys::core::PWSTR,
//     pub pScopes: *mut DHCP_IP_ARRAY,
//     pub Percentage: u8,
//     pub SharedSecret: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 1068:1: declaration Impl has no candidate rule
// impl Default for DHCP_FAILOVER_RELATIONSHIP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1073:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_FAILOVER_RELATIONSHIP_ARRAY {
//     pub NumElements: u32,
//     pub pRelationships: *mut DHCP_FAILOVER_RELATIONSHIP,
// }

// UNSUPPORTED Rust 1079:1: declaration Impl has no candidate rule
// impl Default for DHCP_FAILOVER_RELATIONSHIP_ARRAY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DHCP_FAILOVER_SERVER` = Int;
// UNSUPPORTED Rust 1085:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DHCP_FAILOVER_STATISTICS {
//     pub NumAddr: u32,
//     pub AddrFree: u32,
//     pub AddrInUse: u32,
//     pub PartnerAddrFree: u32,
//     pub ThisAddrFree: u32,
//     pub PartnerAddrInUse: u32,
//     pub ThisAddrInUse: u32,
// }

// UNSUPPORTED Rust 1096:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_FILTER_ADD_INFO {
//     pub AddrPatt: DHCP_ADDR_PATTERN,
//     pub Comment: windows_sys::core::PWSTR,
//     pub ListType: DHCP_FILTER_LIST_TYPE,
// }

// UNSUPPORTED Rust 1103:1: declaration Impl has no candidate rule
// impl Default for DHCP_FILTER_ADD_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1108:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_FILTER_ENUM_INFO {
//     pub NumElements: u32,
//     pub pEnumRecords: *mut DHCP_FILTER_RECORD,
// }

// UNSUPPORTED Rust 1114:1: declaration Impl has no candidate rule
// impl Default for DHCP_FILTER_ENUM_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1119:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DHCP_FILTER_GLOBAL_INFO {
//     pub EnforceAllowList: windows_sys::core::BOOL,
//     pub EnforceDenyList: windows_sys::core::BOOL,
// }

public typealias `DHCP_FILTER_LIST_TYPE` = Int;
// UNSUPPORTED Rust 1126:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_FILTER_RECORD {
//     pub AddrPatt: DHCP_ADDR_PATTERN,
//     pub Comment: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 1132:1: declaration Impl has no candidate rule
// impl Default for DHCP_FILTER_RECORD {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DHCP_FLAGS_DONT_ACCESS_DS`: UInt = 1u;
public const val `DHCP_FLAGS_DONT_DO_RPC`: UInt = 2u;
public const val `DHCP_FLAGS_OPTION_IS_VENDOR`: UInt = 3u;
public typealias `DHCP_FORCE_FLAG` = Int;
public const val `DHCP_GIVE_ADDRESS_NEW`: UInt = 805306369u;
public const val `DHCP_GIVE_ADDRESS_OLD`: UInt = 805306370u;
// UNSUPPORTED Rust 1143:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_HOST_INFO {
//     pub IpAddress: u32,
//     pub NetBiosName: windows_sys::core::PWSTR,
//     pub HostName: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 1150:1: declaration Impl has no candidate rule
// impl Default for DHCP_HOST_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1155:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_HOST_INFO_V6 {
//     pub IpAddress: DHCP_IPV6_ADDRESS,
//     pub NetBiosName: windows_sys::core::PWSTR,
//     pub HostName: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 1162:1: declaration Impl has no candidate rule
// impl Default for DHCP_HOST_INFO_V6 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1167:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DHCP_IPV6_ADDRESS {
//     pub HighOrderBits: u64,
//     pub LowOrderBits: u64,
// }

// UNSUPPORTED Rust 1173:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_IP_ARRAY {
//     pub NumElements: u32,
//     pub Elements: *mut u32,
// }

// UNSUPPORTED Rust 1179:1: declaration Impl has no candidate rule
// impl Default for DHCP_IP_ARRAY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1184:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DHCP_IP_CLUSTER {
//     pub ClusterAddress: u32,
//     pub ClusterMask: u32,
// }

// UNSUPPORTED Rust 1190:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DHCP_IP_RANGE {
//     pub StartAddress: u32,
//     pub EndAddress: u32,
// }

// UNSUPPORTED Rust 1196:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_IP_RANGE_ARRAY {
//     pub NumElements: u32,
//     pub Elements: *mut DHCP_IP_RANGE,
// }

// UNSUPPORTED Rust 1202:1: declaration Impl has no candidate rule
// impl Default for DHCP_IP_RANGE_ARRAY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1207:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DHCP_IP_RANGE_V6 {
//     pub StartAddress: DHCP_IPV6_ADDRESS,
//     pub EndAddress: DHCP_IPV6_ADDRESS,
// }

// UNSUPPORTED Rust 1213:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_IP_RESERVATION {
//     pub ReservedIpAddress: u32,
//     pub ReservedForClient: *mut DHCP_BINARY_DATA,
// }

// UNSUPPORTED Rust 1219:1: declaration Impl has no candidate rule
// impl Default for DHCP_IP_RESERVATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1224:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_IP_RESERVATION_INFO {
//     pub ReservedIpAddress: u32,
//     pub ReservedForClient: DHCP_BINARY_DATA,
//     pub ReservedClientName: windows_sys::core::PWSTR,
//     pub ReservedClientDesc: windows_sys::core::PWSTR,
//     pub bAllowedClientTypes: u8,
//     pub fOptionsPresent: u8,
// }

// UNSUPPORTED Rust 1234:1: declaration Impl has no candidate rule
// impl Default for DHCP_IP_RESERVATION_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1239:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_IP_RESERVATION_V4 {
//     pub ReservedIpAddress: u32,
//     pub ReservedForClient: *mut DHCP_BINARY_DATA,
//     pub bAllowedClientTypes: u8,
// }

// UNSUPPORTED Rust 1246:1: declaration Impl has no candidate rule
// impl Default for DHCP_IP_RESERVATION_V4 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1251:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_IP_RESERVATION_V6 {
//     pub ReservedIpAddress: DHCP_IPV6_ADDRESS,
//     pub ReservedForClient: *mut DHCP_BINARY_DATA,
//     pub InterfaceId: u32,
// }

// UNSUPPORTED Rust 1258:1: declaration Impl has no candidate rule
// impl Default for DHCP_IP_RESERVATION_V6 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DHCP_MAX_DELAY`: UInt = 1000u;
// UNSUPPORTED Rust 1264:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_MIB_INFO {
//     pub Discovers: u32,
//     pub Offers: u32,
//     pub Requests: u32,
//     pub Acks: u32,
//     pub Naks: u32,
//     pub Declines: u32,
//     pub Releases: u32,
//     pub ServerStartTime: DATE_TIME,
//     pub Scopes: u32,
//     pub ScopeInfo: *mut SCOPE_MIB_INFO,
// }

// UNSUPPORTED Rust 1278:1: declaration Impl has no candidate rule
// impl Default for DHCP_MIB_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1283:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_MIB_INFO_V5 {
//     pub Discovers: u32,
//     pub Offers: u32,
//     pub Requests: u32,
//     pub Acks: u32,
//     pub Naks: u32,
//     pub Declines: u32,
//     pub Releases: u32,
//     pub ServerStartTime: DATE_TIME,
//     pub QtnNumLeases: u32,
//     pub QtnPctQtnLeases: u32,
//     pub QtnProbationLeases: u32,
//     pub QtnNonQtnLeases: u32,
//     pub QtnExemptLeases: u32,
//     pub QtnCapableClients: u32,
//     pub QtnIASErrors: u32,
//     pub DelayedOffers: u32,
//     pub ScopesWithDelayedOffers: u32,
//     pub Scopes: u32,
//     pub ScopeInfo: *mut SCOPE_MIB_INFO_V5,
// }

// UNSUPPORTED Rust 1306:1: declaration Impl has no candidate rule
// impl Default for DHCP_MIB_INFO_V5 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1311:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_MIB_INFO_V6 {
//     pub Solicits: u32,
//     pub Advertises: u32,
//     pub Requests: u32,
//     pub Renews: u32,
//     pub Rebinds: u32,
//     pub Replies: u32,
//     pub Confirms: u32,
//     pub Declines: u32,
//     pub Releases: u32,
//     pub Informs: u32,
//     pub ServerStartTime: DATE_TIME,
//     pub Scopes: u32,
//     pub ScopeInfo: *mut SCOPE_MIB_INFO_V6,
// }

// UNSUPPORTED Rust 1328:1: declaration Impl has no candidate rule
// impl Default for DHCP_MIB_INFO_V6 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1333:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_MIB_INFO_VQ {
//     pub Discovers: u32,
//     pub Offers: u32,
//     pub Requests: u32,
//     pub Acks: u32,
//     pub Naks: u32,
//     pub Declines: u32,
//     pub Releases: u32,
//     pub ServerStartTime: DATE_TIME,
//     pub QtnNumLeases: u32,
//     pub QtnPctQtnLeases: u32,
//     pub QtnProbationLeases: u32,
//     pub QtnNonQtnLeases: u32,
//     pub QtnExemptLeases: u32,
//     pub QtnCapableClients: u32,
//     pub QtnIASErrors: u32,
//     pub Scopes: u32,
//     pub ScopeInfo: *mut SCOPE_MIB_INFO_VQ,
// }

// UNSUPPORTED Rust 1354:1: declaration Impl has no candidate rule
// impl Default for DHCP_MIB_INFO_VQ {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DHCP_MIN_DELAY`: UInt = 0u;
// UNSUPPORTED Rust 1360:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_OPTION {
//     pub OptionID: u32,
//     pub OptionName: windows_sys::core::PWSTR,
//     pub OptionComment: windows_sys::core::PWSTR,
//     pub DefaultValue: DHCP_OPTION_DATA,
//     pub OptionType: DHCP_OPTION_TYPE,
// }

// UNSUPPORTED Rust 1369:1: declaration Impl has no candidate rule
// impl Default for DHCP_OPTION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1374:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_OPTION_ARRAY {
//     pub NumElements: u32,
//     pub Options: *mut DHCP_OPTION,
// }

// UNSUPPORTED Rust 1380:1: declaration Impl has no candidate rule
// impl Default for DHCP_OPTION_ARRAY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1385:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_OPTION_DATA {
//     pub NumElements: u32,
//     pub Elements: *mut DHCP_OPTION_DATA_ELEMENT,
// }

// UNSUPPORTED Rust 1391:1: declaration Impl has no candidate rule
// impl Default for DHCP_OPTION_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1396:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_OPTION_DATA_ELEMENT {
//     pub OptionType: DHCP_OPTION_DATA_TYPE,
//     pub Element: DHCP_OPTION_DATA_ELEMENT_0,
// }

// UNSUPPORTED Rust 1402:1: declaration Impl has no candidate rule
// impl Default for DHCP_OPTION_DATA_ELEMENT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1407:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DHCP_OPTION_DATA_ELEMENT_0 {
//     pub ByteOption: u8,
//     pub WordOption: u16,
//     pub DWordOption: u32,
//     pub DWordDWordOption: DWORD_DWORD,
//     pub IpAddressOption: u32,
//     pub StringDataOption: windows_sys::core::PWSTR,
//     pub BinaryDataOption: DHCP_BINARY_DATA,
//     pub EncapsulatedDataOption: DHCP_BINARY_DATA,
//     pub Ipv6AddressDataOption: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 1420:1: declaration Impl has no candidate rule
// impl Default for DHCP_OPTION_DATA_ELEMENT_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DHCP_OPTION_DATA_TYPE` = Int;
// UNSUPPORTED Rust 1426:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_OPTION_LIST {
//     pub NumOptions: u32,
//     pub Options: *mut DHCP_OPTION_VALUE,
// }

// UNSUPPORTED Rust 1432:1: declaration Impl has no candidate rule
// impl Default for DHCP_OPTION_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1437:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_OPTION_SCOPE_INFO {
//     pub ScopeType: DHCP_OPTION_SCOPE_TYPE,
//     pub ScopeInfo: DHCP_OPTION_SCOPE_INFO_0,
// }

// UNSUPPORTED Rust 1443:1: declaration Impl has no candidate rule
// impl Default for DHCP_OPTION_SCOPE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1448:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DHCP_OPTION_SCOPE_INFO_0 {
//     pub DefaultScopeInfo: *mut core::ffi::c_void,
//     pub GlobalScopeInfo: *mut core::ffi::c_void,
//     pub SubnetScopeInfo: u32,
//     pub ReservedScopeInfo: DHCP_RESERVED_SCOPE,
//     pub MScopeInfo: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 1457:1: declaration Impl has no candidate rule
// impl Default for DHCP_OPTION_SCOPE_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1462:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_OPTION_SCOPE_INFO6 {
//     pub ScopeType: DHCP_OPTION_SCOPE_TYPE6,
//     pub ScopeInfo: DHCP_OPTION_SCOPE_INFO6_0,
// }

// UNSUPPORTED Rust 1468:1: declaration Impl has no candidate rule
// impl Default for DHCP_OPTION_SCOPE_INFO6 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1473:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DHCP_OPTION_SCOPE_INFO6_0 {
//     pub DefaultScopeInfo: *mut core::ffi::c_void,
//     pub SubnetScopeInfo: DHCP_IPV6_ADDRESS,
//     pub ReservedScopeInfo: DHCP_RESERVED_SCOPE6,
// }

// UNSUPPORTED Rust 1480:1: declaration Impl has no candidate rule
// impl Default for DHCP_OPTION_SCOPE_INFO6_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DHCP_OPTION_SCOPE_TYPE` = Int;
public typealias `DHCP_OPTION_SCOPE_TYPE6` = Int;
public typealias `DHCP_OPTION_TYPE` = Int;
// UNSUPPORTED Rust 1488:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DHCP_OPTION_VALUE {
//     pub OptionID: u32,
//     pub Value: DHCP_OPTION_DATA,
// }

// UNSUPPORTED Rust 1494:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_OPTION_VALUE_ARRAY {
//     pub NumElements: u32,
//     pub Values: *mut DHCP_OPTION_VALUE,
// }

// UNSUPPORTED Rust 1500:1: declaration Impl has no candidate rule
// impl Default for DHCP_OPTION_VALUE_ARRAY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DHCP_OPT_ENUM_IGNORE_VENDOR`: UInt = 1u;
public const val `DHCP_OPT_ENUM_USE_CLASSNAME`: UInt = 2u;
// UNSUPPORTED Rust 1507:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DHCP_PERF_STATS {
//     pub dwNumPacketsReceived: u32,
//     pub dwNumPacketsDuplicate: u32,
//     pub dwNumPacketsExpired: u32,
//     pub dwNumMilliSecondsProcessed: u32,
//     pub dwNumPacketsInActiveQueue: u32,
//     pub dwNumPacketsInPingQueue: u32,
//     pub dwNumDiscoversReceived: u32,
//     pub dwNumOffersSent: u32,
//     pub dwNumRequestsReceived: u32,
//     pub dwNumInformsReceived: u32,
//     pub dwNumAcksSent: u32,
//     pub dwNumNacksSent: u32,
//     pub dwNumDeclinesReceived: u32,
//     pub dwNumReleasesReceived: u32,
//     pub dwNumDelayedOfferInQueue: u32,
//     pub dwNumPacketsProcessed: u32,
//     pub dwNumPacketsInQuarWaitingQueue: u32,
//     pub dwNumPacketsInQuarReadyQueue: u32,
//     pub dwNumPacketsInQuarDecisionQueue: u32,
// }

// UNSUPPORTED Rust 1530:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_POLICY {
//     pub PolicyName: windows_sys::core::PWSTR,
//     pub IsGlobalPolicy: windows_sys::core::BOOL,
//     pub Subnet: u32,
//     pub ProcessingOrder: u32,
//     pub Conditions: *mut DHCP_POL_COND_ARRAY,
//     pub Expressions: *mut DHCP_POL_EXPR_ARRAY,
//     pub Ranges: *mut DHCP_IP_RANGE_ARRAY,
//     pub Description: windows_sys::core::PWSTR,
//     pub Enabled: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 1543:1: declaration Impl has no candidate rule
// impl Default for DHCP_POLICY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1548:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_POLICY_ARRAY {
//     pub NumElements: u32,
//     pub Elements: *mut DHCP_POLICY,
// }

// UNSUPPORTED Rust 1554:1: declaration Impl has no candidate rule
// impl Default for DHCP_POLICY_ARRAY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1559:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_POLICY_EX {
//     pub PolicyName: windows_sys::core::PWSTR,
//     pub IsGlobalPolicy: windows_sys::core::BOOL,
//     pub Subnet: u32,
//     pub ProcessingOrder: u32,
//     pub Conditions: *mut DHCP_POL_COND_ARRAY,
//     pub Expressions: *mut DHCP_POL_EXPR_ARRAY,
//     pub Ranges: *mut DHCP_IP_RANGE_ARRAY,
//     pub Description: windows_sys::core::PWSTR,
//     pub Enabled: windows_sys::core::BOOL,
//     pub Properties: *mut DHCP_PROPERTY_ARRAY,
// }

// UNSUPPORTED Rust 1573:1: declaration Impl has no candidate rule
// impl Default for DHCP_POLICY_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1578:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_POLICY_EX_ARRAY {
//     pub NumElements: u32,
//     pub Elements: *mut DHCP_POLICY_EX,
// }

// UNSUPPORTED Rust 1584:1: declaration Impl has no candidate rule
// impl Default for DHCP_POLICY_EX_ARRAY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DHCP_POLICY_FIELDS_TO_UPDATE` = Int;
public typealias `DHCP_POL_ATTR_TYPE` = Int;
public typealias `DHCP_POL_COMPARATOR` = Int;
// UNSUPPORTED Rust 1592:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_POL_COND {
//     pub ParentExpr: u32,
//     pub Type: DHCP_POL_ATTR_TYPE,
//     pub OptionID: u32,
//     pub SubOptionID: u32,
//     pub VendorName: windows_sys::core::PWSTR,
//     pub Operator: DHCP_POL_COMPARATOR,
//     pub Value: *mut u8,
//     pub ValueLength: u32,
// }

// UNSUPPORTED Rust 1604:1: declaration Impl has no candidate rule
// impl Default for DHCP_POL_COND {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1609:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_POL_COND_ARRAY {
//     pub NumElements: u32,
//     pub Elements: *mut DHCP_POL_COND,
// }

// UNSUPPORTED Rust 1615:1: declaration Impl has no candidate rule
// impl Default for DHCP_POL_COND_ARRAY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1620:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DHCP_POL_EXPR {
//     pub ParentExpr: u32,
//     pub Operator: DHCP_POL_LOGIC_OPER,
// }

// UNSUPPORTED Rust 1626:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_POL_EXPR_ARRAY {
//     pub NumElements: u32,
//     pub Elements: *mut DHCP_POL_EXPR,
// }

// UNSUPPORTED Rust 1632:1: declaration Impl has no candidate rule
// impl Default for DHCP_POL_EXPR_ARRAY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DHCP_POL_LOGIC_OPER` = Int;
public const val `DHCP_PROB_CONFLICT`: UInt = 536870913u;
public const val `DHCP_PROB_DECLINE`: UInt = 536870914u;
public const val `DHCP_PROB_NACKED`: UInt = 536870916u;
public const val `DHCP_PROB_RELEASE`: UInt = 536870915u;
// UNSUPPORTED Rust 1642:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_PROPERTY {
//     pub ID: DHCP_PROPERTY_ID,
//     pub Type: DHCP_PROPERTY_TYPE,
//     pub Value: DHCP_PROPERTY_0,
// }

// UNSUPPORTED Rust 1649:1: declaration Impl has no candidate rule
// impl Default for DHCP_PROPERTY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1654:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DHCP_PROPERTY_0 {
//     pub ByteValue: u8,
//     pub WordValue: u16,
//     pub DWordValue: u32,
//     pub StringValue: windows_sys::core::PWSTR,
//     pub BinaryValue: DHCP_BINARY_DATA,
// }

// UNSUPPORTED Rust 1663:1: declaration Impl has no candidate rule
// impl Default for DHCP_PROPERTY_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1668:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_PROPERTY_ARRAY {
//     pub NumElements: u32,
//     pub Elements: *mut DHCP_PROPERTY,
// }

// UNSUPPORTED Rust 1674:1: declaration Impl has no candidate rule
// impl Default for DHCP_PROPERTY_ARRAY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DHCP_PROPERTY_ID` = Int;
public typealias `DHCP_PROPERTY_TYPE` = Int;
// UNSUPPORTED Rust 1681:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_RESERVATION_INFO_ARRAY {
//     pub NumElements: u32,
//     pub Elements: *mut *mut DHCP_IP_RESERVATION_INFO,
// }

// UNSUPPORTED Rust 1687:1: declaration Impl has no candidate rule
// impl Default for DHCP_RESERVATION_INFO_ARRAY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1692:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DHCP_RESERVED_SCOPE {
//     pub ReservedIpAddress: u32,
//     pub ReservedIpSubnetAddress: u32,
// }

// UNSUPPORTED Rust 1698:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DHCP_RESERVED_SCOPE6 {
//     pub ReservedIpAddress: DHCP_IPV6_ADDRESS,
//     pub ReservedIpSubnetAddress: DHCP_IPV6_ADDRESS,
// }

public typealias `DHCP_SCAN_FLAG` = Int;
// UNSUPPORTED Rust 1705:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DHCP_SCAN_ITEM {
//     pub IpAddress: u32,
//     pub ScanFlag: DHCP_SCAN_FLAG,
// }

// UNSUPPORTED Rust 1711:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_SCAN_LIST {
//     pub NumScanItems: u32,
//     pub ScanItems: *mut DHCP_SCAN_ITEM,
// }

// UNSUPPORTED Rust 1717:1: declaration Impl has no candidate rule
// impl Default for DHCP_SCAN_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1722:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_SEARCH_INFO {
//     pub SearchType: DHCP_SEARCH_INFO_TYPE,
//     pub SearchInfo: DHCP_SEARCH_INFO_0,
// }

// UNSUPPORTED Rust 1728:1: declaration Impl has no candidate rule
// impl Default for DHCP_SEARCH_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1733:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DHCP_SEARCH_INFO_0 {
//     pub ClientIpAddress: u32,
//     pub ClientHardwareAddress: DHCP_BINARY_DATA,
//     pub ClientName: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 1740:1: declaration Impl has no candidate rule
// impl Default for DHCP_SEARCH_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DHCP_SEARCH_INFO_TYPE` = Int;
public typealias `DHCP_SEARCH_INFO_TYPE_V6` = Int;
// UNSUPPORTED Rust 1747:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_SEARCH_INFO_V6 {
//     pub SearchType: DHCP_SEARCH_INFO_TYPE_V6,
//     pub SearchInfo: DHCP_SEARCH_INFO_V6_0,
// }

// UNSUPPORTED Rust 1753:1: declaration Impl has no candidate rule
// impl Default for DHCP_SEARCH_INFO_V6 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1758:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DHCP_SEARCH_INFO_V6_0 {
//     pub ClientIpAddress: DHCP_IPV6_ADDRESS,
//     pub ClientDUID: DHCP_BINARY_DATA,
//     pub ClientName: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 1765:1: declaration Impl has no candidate rule
// impl Default for DHCP_SEARCH_INFO_V6_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DHCP_SEND_PACKET`: UInt = 268435456u;
// UNSUPPORTED Rust 1771:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_SERVER_CONFIG_INFO {
//     pub APIProtocolSupport: u32,
//     pub DatabaseName: windows_sys::core::PWSTR,
//     pub DatabasePath: windows_sys::core::PWSTR,
//     pub BackupPath: windows_sys::core::PWSTR,
//     pub BackupInterval: u32,
//     pub DatabaseLoggingFlag: u32,
//     pub RestoreFlag: u32,
//     pub DatabaseCleanupInterval: u32,
//     pub DebugFlag: u32,
// }

// UNSUPPORTED Rust 1784:1: declaration Impl has no candidate rule
// impl Default for DHCP_SERVER_CONFIG_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1789:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_SERVER_CONFIG_INFO_V4 {
//     pub APIProtocolSupport: u32,
//     pub DatabaseName: windows_sys::core::PWSTR,
//     pub DatabasePath: windows_sys::core::PWSTR,
//     pub BackupPath: windows_sys::core::PWSTR,
//     pub BackupInterval: u32,
//     pub DatabaseLoggingFlag: u32,
//     pub RestoreFlag: u32,
//     pub DatabaseCleanupInterval: u32,
//     pub DebugFlag: u32,
//     pub dwPingRetries: u32,
//     pub cbBootTableString: u32,
//     pub wszBootTableString: windows_sys::core::PWSTR,
//     pub fAuditLog: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 1806:1: declaration Impl has no candidate rule
// impl Default for DHCP_SERVER_CONFIG_INFO_V4 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1811:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DHCP_SERVER_CONFIG_INFO_V6 {
//     pub UnicastFlag: windows_sys::core::BOOL,
//     pub RapidCommitFlag: windows_sys::core::BOOL,
//     pub PreferredLifetime: u32,
//     pub ValidLifetime: u32,
//     pub T1: u32,
//     pub T2: u32,
//     pub PreferredLifetimeIATA: u32,
//     pub ValidLifetimeIATA: u32,
//     pub fAuditLog: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 1824:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_SERVER_CONFIG_INFO_VQ {
//     pub APIProtocolSupport: u32,
//     pub DatabaseName: windows_sys::core::PWSTR,
//     pub DatabasePath: windows_sys::core::PWSTR,
//     pub BackupPath: windows_sys::core::PWSTR,
//     pub BackupInterval: u32,
//     pub DatabaseLoggingFlag: u32,
//     pub RestoreFlag: u32,
//     pub DatabaseCleanupInterval: u32,
//     pub DebugFlag: u32,
//     pub dwPingRetries: u32,
//     pub cbBootTableString: u32,
//     pub wszBootTableString: windows_sys::core::PWSTR,
//     pub fAuditLog: windows_sys::core::BOOL,
//     pub QuarantineOn: windows_sys::core::BOOL,
//     pub QuarDefFail: u32,
//     pub QuarRuntimeStatus: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 1844:1: declaration Impl has no candidate rule
// impl Default for DHCP_SERVER_CONFIG_INFO_VQ {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1849:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_SERVER_OPTIONS {
//     pub MessageType: *mut u8,
//     pub SubnetMask: *mut u32,
//     pub RequestedAddress: *mut u32,
//     pub RequestLeaseTime: *mut u32,
//     pub OverlayFields: *mut u8,
//     pub RouterAddress: *mut u32,
//     pub Server: *mut u32,
//     pub ParameterRequestList: *mut u8,
//     pub ParameterRequestListLength: u32,
//     pub MachineName: windows_sys::core::PSTR,
//     pub MachineNameLength: u32,
//     pub ClientHardwareAddressType: u8,
//     pub ClientHardwareAddressLength: u8,
//     pub ClientHardwareAddress: *mut u8,
//     pub ClassIdentifier: windows_sys::core::PSTR,
//     pub ClassIdentifierLength: u32,
//     pub VendorClass: *mut u8,
//     pub VendorClassLength: u32,
//     pub DNSFlags: u32,
//     pub DNSNameLength: u32,
//     pub DNSName: *mut u8,
//     pub DSDomainNameRequested: bool,
//     pub DSDomainName: windows_sys::core::PSTR,
//     pub DSDomainNameLen: u32,
//     pub ScopeId: *mut u32,
// }

// UNSUPPORTED Rust 1878:1: declaration Impl has no candidate rule
// impl Default for DHCP_SERVER_OPTIONS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1883:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_SERVER_SPECIFIC_STRINGS {
//     pub DefaultVendorClassName: windows_sys::core::PWSTR,
//     pub DefaultUserClassName: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 1889:1: declaration Impl has no candidate rule
// impl Default for DHCP_SERVER_SPECIFIC_STRINGS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1894:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_SUBNET_ELEMENT_DATA {
//     pub ElementType: DHCP_SUBNET_ELEMENT_TYPE,
//     pub Element: DHCP_SUBNET_ELEMENT_DATA_0,
// }

// UNSUPPORTED Rust 1900:1: declaration Impl has no candidate rule
// impl Default for DHCP_SUBNET_ELEMENT_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1905:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DHCP_SUBNET_ELEMENT_DATA_0 {
//     pub IpRange: *mut DHCP_IP_RANGE,
//     pub SecondaryHost: *mut DHCP_HOST_INFO,
//     pub ReservedIp: *mut DHCP_IP_RESERVATION,
//     pub ExcludeIpRange: *mut DHCP_IP_RANGE,
//     pub IpUsedCluster: *mut DHCP_IP_CLUSTER,
// }

// UNSUPPORTED Rust 1914:1: declaration Impl has no candidate rule
// impl Default for DHCP_SUBNET_ELEMENT_DATA_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1919:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_SUBNET_ELEMENT_DATA_V4 {
//     pub ElementType: DHCP_SUBNET_ELEMENT_TYPE,
//     pub Element: DHCP_SUBNET_ELEMENT_DATA_V4_0,
// }

// UNSUPPORTED Rust 1925:1: declaration Impl has no candidate rule
// impl Default for DHCP_SUBNET_ELEMENT_DATA_V4 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1930:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DHCP_SUBNET_ELEMENT_DATA_V4_0 {
//     pub IpRange: *mut DHCP_IP_RANGE,
//     pub SecondaryHost: *mut DHCP_HOST_INFO,
//     pub ReservedIp: *mut DHCP_IP_RESERVATION_V4,
//     pub ExcludeIpRange: *mut DHCP_IP_RANGE,
//     pub IpUsedCluster: *mut DHCP_IP_CLUSTER,
// }

// UNSUPPORTED Rust 1939:1: declaration Impl has no candidate rule
// impl Default for DHCP_SUBNET_ELEMENT_DATA_V4_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1944:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_SUBNET_ELEMENT_DATA_V5 {
//     pub ElementType: DHCP_SUBNET_ELEMENT_TYPE,
//     pub Element: DHCP_SUBNET_ELEMENT_DATA_V5_0,
// }

// UNSUPPORTED Rust 1950:1: declaration Impl has no candidate rule
// impl Default for DHCP_SUBNET_ELEMENT_DATA_V5 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1955:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DHCP_SUBNET_ELEMENT_DATA_V5_0 {
//     pub IpRange: *mut DHCP_BOOTP_IP_RANGE,
//     pub SecondaryHost: *mut DHCP_HOST_INFO,
//     pub ReservedIp: *mut DHCP_IP_RESERVATION_V4,
//     pub ExcludeIpRange: *mut DHCP_IP_RANGE,
//     pub IpUsedCluster: *mut DHCP_IP_CLUSTER,
// }

// UNSUPPORTED Rust 1964:1: declaration Impl has no candidate rule
// impl Default for DHCP_SUBNET_ELEMENT_DATA_V5_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1969:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_SUBNET_ELEMENT_DATA_V6 {
//     pub ElementType: DHCP_SUBNET_ELEMENT_TYPE_V6,
//     pub Element: DHCP_SUBNET_ELEMENT_DATA_V6_0,
// }

// UNSUPPORTED Rust 1975:1: declaration Impl has no candidate rule
// impl Default for DHCP_SUBNET_ELEMENT_DATA_V6 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1980:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DHCP_SUBNET_ELEMENT_DATA_V6_0 {
//     pub IpRange: *mut DHCP_IP_RANGE_V6,
//     pub ReservedIp: *mut DHCP_IP_RESERVATION_V6,
//     pub ExcludeIpRange: *mut DHCP_IP_RANGE_V6,
// }

// UNSUPPORTED Rust 1987:1: declaration Impl has no candidate rule
// impl Default for DHCP_SUBNET_ELEMENT_DATA_V6_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1992:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_SUBNET_ELEMENT_INFO_ARRAY {
//     pub NumElements: u32,
//     pub Elements: *mut DHCP_SUBNET_ELEMENT_DATA,
// }

// UNSUPPORTED Rust 1998:1: declaration Impl has no candidate rule
// impl Default for DHCP_SUBNET_ELEMENT_INFO_ARRAY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2003:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_SUBNET_ELEMENT_INFO_ARRAY_V4 {
//     pub NumElements: u32,
//     pub Elements: *mut DHCP_SUBNET_ELEMENT_DATA_V4,
// }

// UNSUPPORTED Rust 2009:1: declaration Impl has no candidate rule
// impl Default for DHCP_SUBNET_ELEMENT_INFO_ARRAY_V4 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2014:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_SUBNET_ELEMENT_INFO_ARRAY_V5 {
//     pub NumElements: u32,
//     pub Elements: *mut DHCP_SUBNET_ELEMENT_DATA_V5,
// }

// UNSUPPORTED Rust 2020:1: declaration Impl has no candidate rule
// impl Default for DHCP_SUBNET_ELEMENT_INFO_ARRAY_V5 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2025:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_SUBNET_ELEMENT_INFO_ARRAY_V6 {
//     pub NumElements: u32,
//     pub Elements: *mut DHCP_SUBNET_ELEMENT_DATA_V6,
// }

// UNSUPPORTED Rust 2031:1: declaration Impl has no candidate rule
// impl Default for DHCP_SUBNET_ELEMENT_INFO_ARRAY_V6 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DHCP_SUBNET_ELEMENT_TYPE` = Int;
public typealias `DHCP_SUBNET_ELEMENT_TYPE_V6` = Int;
// UNSUPPORTED Rust 2038:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_SUBNET_INFO {
//     pub SubnetAddress: u32,
//     pub SubnetMask: u32,
//     pub SubnetName: windows_sys::core::PWSTR,
//     pub SubnetComment: windows_sys::core::PWSTR,
//     pub PrimaryHost: DHCP_HOST_INFO,
//     pub SubnetState: DHCP_SUBNET_STATE,
// }

// UNSUPPORTED Rust 2048:1: declaration Impl has no candidate rule
// impl Default for DHCP_SUBNET_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2053:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_SUBNET_INFO_V6 {
//     pub SubnetAddress: DHCP_IPV6_ADDRESS,
//     pub Prefix: u32,
//     pub Preference: u16,
//     pub SubnetName: windows_sys::core::PWSTR,
//     pub SubnetComment: windows_sys::core::PWSTR,
//     pub State: u32,
//     pub ScopeId: u32,
// }

// UNSUPPORTED Rust 2064:1: declaration Impl has no candidate rule
// impl Default for DHCP_SUBNET_INFO_V6 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2069:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_SUBNET_INFO_VQ {
//     pub SubnetAddress: u32,
//     pub SubnetMask: u32,
//     pub SubnetName: windows_sys::core::PWSTR,
//     pub SubnetComment: windows_sys::core::PWSTR,
//     pub PrimaryHost: DHCP_HOST_INFO,
//     pub SubnetState: DHCP_SUBNET_STATE,
//     pub QuarantineOn: u32,
//     pub Reserved1: u32,
//     pub Reserved2: u32,
//     pub Reserved3: i64,
//     pub Reserved4: i64,
// }

// UNSUPPORTED Rust 2084:1: declaration Impl has no candidate rule
// impl Default for DHCP_SUBNET_INFO_VQ {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DHCP_SUBNET_INFO_VQ_FLAG_QUARANTINE`: UInt = 1u;
public typealias `DHCP_SUBNET_STATE` = Int;
// UNSUPPORTED Rust 2091:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_SUPER_SCOPE_TABLE {
//     pub cEntries: u32,
//     pub pEntries: *mut DHCP_SUPER_SCOPE_TABLE_ENTRY,
// }

// UNSUPPORTED Rust 2097:1: declaration Impl has no candidate rule
// impl Default for DHCP_SUPER_SCOPE_TABLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2102:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DHCP_SUPER_SCOPE_TABLE_ENTRY {
//     pub SubnetAddress: u32,
//     pub SuperScopeNumber: u32,
//     pub NextInSuperScope: u32,
//     pub SuperScopeName: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 2110:1: declaration Impl has no candidate rule
// impl Default for DHCP_SUPER_SCOPE_TABLE_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DNS_FLAG_CLEANUP_EXPIRED`: UInt = 4u;
public const val `DNS_FLAG_DISABLE_PTR_UPDATE`: UInt = 64u;
public const val `DNS_FLAG_ENABLED`: UInt = 1u;
public const val `DNS_FLAG_HAS_DNS_SUFFIX`: UInt = 128u;
public const val `DNS_FLAG_UPDATE_BOTH_ALWAYS`: UInt = 16u;
public const val `DNS_FLAG_UPDATE_DHCID`: UInt = 32u;
public const val `DNS_FLAG_UPDATE_DOWNLEVEL`: UInt = 2u;
public const val `DROPPACKET`: `QuarantineStatus` = 2;
// UNSUPPORTED Rust 2123:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DWORD_DWORD {
//     pub DWord1: u32,
//     pub DWord2: u32,
// }

public const val `Deny`: `DHCP_FILTER_LIST_TYPE` = 0;
public const val `DhcpArrayTypeOption`: `DHCP_OPTION_TYPE` = 1;
public const val `DhcpAttrFqdn`: `DHCP_POL_ATTR_TYPE` = 3;
public const val `DhcpAttrFqdnSingleLabel`: `DHCP_POL_ATTR_TYPE` = 4;
public const val `DhcpAttrHWAddr`: `DHCP_POL_ATTR_TYPE` = 0;
public const val `DhcpAttrOption`: `DHCP_POL_ATTR_TYPE` = 1;
public const val `DhcpAttrSubOption`: `DHCP_POL_ATTR_TYPE` = 2;
public const val `DhcpBinaryDataOption`: `DHCP_OPTION_DATA_TYPE` = 6;
public const val `DhcpByteOption`: `DHCP_OPTION_DATA_TYPE` = 0;
public const val `DhcpClientHardwareAddress`: `DHCP_SEARCH_INFO_TYPE` = 1;
public const val `DhcpClientIpAddress`: `DHCP_SEARCH_INFO_TYPE` = 0;
public const val `DhcpClientName`: `DHCP_SEARCH_INFO_TYPE` = 2;
public const val `DhcpCompBeginsWith`: `DHCP_POL_COMPARATOR` = 2;
public const val `DhcpCompEndsWith`: `DHCP_POL_COMPARATOR` = 4;
public const val `DhcpCompEqual`: `DHCP_POL_COMPARATOR` = 0;
public const val `DhcpCompNotBeginWith`: `DHCP_POL_COMPARATOR` = 3;
public const val `DhcpCompNotEndWith`: `DHCP_POL_COMPARATOR` = 5;
public const val `DhcpCompNotEqual`: `DHCP_POL_COMPARATOR` = 1;
public const val `DhcpDWordDWordOption`: `DHCP_OPTION_DATA_TYPE` = 3;
public const val `DhcpDWordOption`: `DHCP_OPTION_DATA_TYPE` = 2;
public const val `DhcpDatabaseFix`: `DHCP_SCAN_FLAG` = 1;
public const val `DhcpDefaultOptions`: `DHCP_OPTION_SCOPE_TYPE` = 0;
public const val `DhcpDefaultOptions6`: `DHCP_OPTION_SCOPE_TYPE6` = 0;
public const val `DhcpEncapsulatedDataOption`: `DHCP_OPTION_DATA_TYPE` = 7;
public const val `DhcpExcludedIpRanges`: `DHCP_SUBNET_ELEMENT_TYPE` = 3;
public const val `DhcpFailoverForce`: `DHCP_FORCE_FLAG` = 2;
public const val `DhcpFullForce`: `DHCP_FORCE_FLAG` = 0;
public const val `DhcpGlobalOptions`: `DHCP_OPTION_SCOPE_TYPE` = 1;
public const val `DhcpGlobalOptions6`: `DHCP_OPTION_SCOPE_TYPE6` = 3;
public const val `DhcpIpAddressOption`: `DHCP_OPTION_DATA_TYPE` = 4;
public const val `DhcpIpRanges`: `DHCP_SUBNET_ELEMENT_TYPE` = 0;
public const val `DhcpIpRangesBootpOnly`: `DHCP_SUBNET_ELEMENT_TYPE` = 7;
public const val `DhcpIpRangesDhcpBootp`: `DHCP_SUBNET_ELEMENT_TYPE` = 6;
public const val `DhcpIpRangesDhcpOnly`: `DHCP_SUBNET_ELEMENT_TYPE` = 5;
public const val `DhcpIpUsedClusters`: `DHCP_SUBNET_ELEMENT_TYPE` = 4;
public const val `DhcpIpv6AddressOption`: `DHCP_OPTION_DATA_TYPE` = 8;
public const val `DhcpLogicalAnd`: `DHCP_POL_LOGIC_OPER` = 1;
public const val `DhcpLogicalOr`: `DHCP_POL_LOGIC_OPER` = 0;
public const val `DhcpMScopeOptions`: `DHCP_OPTION_SCOPE_TYPE` = 4;
public const val `DhcpNoForce`: `DHCP_FORCE_FLAG` = 1;
public const val `DhcpPropIdClientAddressStateEx`: `DHCP_PROPERTY_ID` = 1;
public const val `DhcpPropIdPolicyDnsSuffix`: `DHCP_PROPERTY_ID` = 0;
public const val `DhcpPropTypeBinary`: `DHCP_PROPERTY_TYPE` = 4;
public const val `DhcpPropTypeByte`: `DHCP_PROPERTY_TYPE` = 0;
public const val `DhcpPropTypeDword`: `DHCP_PROPERTY_TYPE` = 2;
public const val `DhcpPropTypeString`: `DHCP_PROPERTY_TYPE` = 3;
public const val `DhcpPropTypeWord`: `DHCP_PROPERTY_TYPE` = 1;
public const val `DhcpRegistryFix`: `DHCP_SCAN_FLAG` = 0;
public const val `DhcpReservedIps`: `DHCP_SUBNET_ELEMENT_TYPE` = 2;
public const val `DhcpReservedOptions`: `DHCP_OPTION_SCOPE_TYPE` = 3;
public const val `DhcpReservedOptions6`: `DHCP_OPTION_SCOPE_TYPE6` = 2;
public const val `DhcpScopeOptions6`: `DHCP_OPTION_SCOPE_TYPE6` = 1;
public const val `DhcpSecondaryHosts`: `DHCP_SUBNET_ELEMENT_TYPE` = 1;
public const val `DhcpStatelessPurgeInterval`: `DHCPV6_STATELESS_PARAM_TYPE` = 1;
public const val `DhcpStatelessStatus`: `DHCPV6_STATELESS_PARAM_TYPE` = 2;
public const val `DhcpStringDataOption`: `DHCP_OPTION_DATA_TYPE` = 5;
public const val `DhcpSubnetDisabled`: `DHCP_SUBNET_STATE` = 1;
public const val `DhcpSubnetDisabledSwitched`: `DHCP_SUBNET_STATE` = 3;
public const val `DhcpSubnetEnabled`: `DHCP_SUBNET_STATE` = 0;
public const val `DhcpSubnetEnabledSwitched`: `DHCP_SUBNET_STATE` = 2;
public const val `DhcpSubnetInvalidState`: `DHCP_SUBNET_STATE` = 4;
public const val `DhcpSubnetOptions`: `DHCP_OPTION_SCOPE_TYPE` = 2;
public const val `DhcpUnaryElementTypeOption`: `DHCP_OPTION_TYPE` = 0;
public const val `DhcpUpdatePolicyDescr`: `DHCP_POLICY_FIELDS_TO_UPDATE` = 16;
public const val `DhcpUpdatePolicyDnsSuffix`: `DHCP_POLICY_FIELDS_TO_UPDATE` = 64;
public const val `DhcpUpdatePolicyExpr`: `DHCP_POLICY_FIELDS_TO_UPDATE` = 4;
public const val `DhcpUpdatePolicyName`: `DHCP_POLICY_FIELDS_TO_UPDATE` = 1;
public const val `DhcpUpdatePolicyOrder`: `DHCP_POLICY_FIELDS_TO_UPDATE` = 2;
public const val `DhcpUpdatePolicyRanges`: `DHCP_POLICY_FIELDS_TO_UPDATE` = 8;
public const val `DhcpUpdatePolicyStatus`: `DHCP_POLICY_FIELDS_TO_UPDATE` = 32;
public const val `DhcpWordOption`: `DHCP_OPTION_DATA_TYPE` = 1;
public const val `Dhcpv6ClientDUID`: `DHCP_SEARCH_INFO_TYPE_V6` = 1;
public const val `Dhcpv6ClientIpAddress`: `DHCP_SEARCH_INFO_TYPE_V6` = 0;
public const val `Dhcpv6ClientName`: `DHCP_SEARCH_INFO_TYPE_V6` = 2;
public const val `Dhcpv6ExcludedIpRanges`: `DHCP_SUBNET_ELEMENT_TYPE_V6` = 2;
public const val `Dhcpv6IpRanges`: `DHCP_SUBNET_ELEMENT_TYPE_V6` = 0;
public const val `Dhcpv6ReservedIps`: `DHCP_SUBNET_ELEMENT_TYPE_V6` = 1;
public const val `ERROR_DDS_CLASS_DOES_NOT_EXIST`: UInt = 20078u;
public const val `ERROR_DDS_CLASS_EXISTS`: UInt = 20077u;
public const val `ERROR_DDS_DHCP_SERVER_NOT_FOUND`: UInt = 20074u;
public const val `ERROR_DDS_NO_DHCP_ROOT`: UInt = 20071u;
public const val `ERROR_DDS_NO_DS_AVAILABLE`: UInt = 20070u;
public const val `ERROR_DDS_OPTION_ALREADY_EXISTS`: UInt = 20075u;
public const val `ERROR_DDS_OPTION_DOES_NOT_EXIST`: UInt = 20076u;
public const val `ERROR_DDS_POSSIBLE_RANGE_CONFLICT`: UInt = 20087u;
public const val `ERROR_DDS_RANGE_DOES_NOT_EXIST`: UInt = 20088u;
public const val `ERROR_DDS_RESERVATION_CONFLICT`: UInt = 20086u;
public const val `ERROR_DDS_RESERVATION_NOT_PRESENT`: UInt = 20085u;
public const val `ERROR_DDS_SERVER_ADDRESS_MISMATCH`: UInt = 20081u;
public const val `ERROR_DDS_SERVER_ALREADY_EXISTS`: UInt = 20079u;
public const val `ERROR_DDS_SERVER_DOES_NOT_EXIST`: UInt = 20080u;
public const val `ERROR_DDS_SUBNET_EXISTS`: UInt = 20082u;
public const val `ERROR_DDS_SUBNET_HAS_DIFF_SSCOPE`: UInt = 20083u;
public const val `ERROR_DDS_SUBNET_NOT_PRESENT`: UInt = 20084u;
public const val `ERROR_DDS_TOO_MANY_ERRORS`: UInt = 20073u;
public const val `ERROR_DDS_UNEXPECTED_ERROR`: UInt = 20072u;
public const val `ERROR_DHCP_ADDRESS_NOT_AVAILABLE`: UInt = 20011u;
public const val `ERROR_DHCP_CANNOT_MODIFY_BINDINGS`: UInt = 20051u;
public const val `ERROR_DHCP_CANT_CHANGE_ATTRIBUTE`: UInt = 20048u;
public const val `ERROR_DHCP_CLASS_ALREADY_EXISTS`: UInt = 20045u;
public const val `ERROR_DHCP_CLASS_NOT_FOUND`: UInt = 20044u;
public const val `ERROR_DHCP_CLIENT_EXISTS`: UInt = 20014u;
public const val `ERROR_DHCP_DATABASE_INIT_FAILED`: UInt = 20001u;
public const val `ERROR_DHCP_DEFAULT_SCOPE_EXITS`: UInt = 20047u;
public const val `ERROR_DHCP_DELETE_BUILTIN_CLASS`: UInt = 20089u;
public const val `ERROR_DHCP_ELEMENT_CANT_REMOVE`: UInt = 20007u;
public const val `ERROR_DHCP_EXEMPTION_EXISTS`: UInt = 20055u;
public const val `ERROR_DHCP_EXEMPTION_NOT_PRESENT`: UInt = 20056u;
public const val `ERROR_DHCP_FO_ADDSCOPE_LEASES_NOT_SYNCED`: UInt = 20127u;
public const val `ERROR_DHCP_FO_BOOT_NOT_SUPPORTED`: UInt = 20131u;
public const val `ERROR_DHCP_FO_FEATURE_NOT_SUPPORTED`: UInt = 20134u;
public const val `ERROR_DHCP_FO_IPRANGE_TYPE_CONV_ILLEGAL`: UInt = 20129u;
public const val `ERROR_DHCP_FO_MAX_ADD_SCOPES`: UInt = 20130u;
public const val `ERROR_DHCP_FO_MAX_RELATIONSHIPS`: UInt = 20128u;
public const val `ERROR_DHCP_FO_NOT_SUPPORTED`: UInt = 20118u;
public const val `ERROR_DHCP_FO_RANGE_PART_OF_REL`: UInt = 20132u;
public const val `ERROR_DHCP_FO_RELATIONSHIP_DOES_NOT_EXIST`: UInt = 20115u;
public const val `ERROR_DHCP_FO_RELATIONSHIP_EXISTS`: UInt = 20114u;
public const val `ERROR_DHCP_FO_RELATIONSHIP_NAME_TOO_LONG`: UInt = 20125u;
public const val `ERROR_DHCP_FO_RELATION_IS_SECONDARY`: UInt = 20117u;
public const val `ERROR_DHCP_FO_SCOPE_ALREADY_IN_RELATIONSHIP`: UInt = 20113u;
public const val `ERROR_DHCP_FO_SCOPE_NOT_IN_RELATIONSHIP`: UInt = 20116u;
public const val `ERROR_DHCP_FO_SCOPE_SYNC_IN_PROGRESS`: UInt = 20133u;
public const val `ERROR_DHCP_FO_STATE_NOT_NORMAL`: UInt = 20120u;
public const val `ERROR_DHCP_FO_TIME_OUT_OF_SYNC`: UInt = 20119u;
public const val `ERROR_DHCP_HARDWARE_ADDRESS_TYPE_ALREADY_EXEMPT`: UInt = 20101u;
public const val `ERROR_DHCP_INVALID_DELAY`: UInt = 20092u;
public const val `ERROR_DHCP_INVALID_DHCP_CLIENT`: UInt = 20016u;
public const val `ERROR_DHCP_INVALID_DHCP_MESSAGE`: UInt = 20015u;
public const val `ERROR_DHCP_INVALID_PARAMETER_OPTION32`: UInt = 20057u;
public const val `ERROR_DHCP_INVALID_POLICY_EXPRESSION`: UInt = 20109u;
public const val `ERROR_DHCP_INVALID_PROCESSING_ORDER`: UInt = 20110u;
public const val `ERROR_DHCP_INVALID_RANGE`: UInt = 20023u;
public const val `ERROR_DHCP_INVALID_SUBNET_PREFIX`: UInt = 20091u;
public const val `ERROR_DHCP_IPRANGE_CONV_ILLEGAL`: UInt = 20049u;
public const val `ERROR_DHCP_IPRANGE_EXITS`: UInt = 20021u;
public const val `ERROR_DHCP_IP_ADDRESS_IN_USE`: UInt = 20032u;
public const val `ERROR_DHCP_JET97_CONV_REQUIRED`: UInt = 20036u;
public const val `ERROR_DHCP_JET_CONV_REQUIRED`: UInt = 20027u;
public const val `ERROR_DHCP_JET_ERROR`: UInt = 20013u;
public const val `ERROR_DHCP_LINKLAYER_ADDRESS_DOES_NOT_EXIST`: UInt = 20095u;
public const val `ERROR_DHCP_LINKLAYER_ADDRESS_EXISTS`: UInt = 20093u;
public const val `ERROR_DHCP_LINKLAYER_ADDRESS_RESERVATION_EXISTS`: UInt = 20094u;
public const val `ERROR_DHCP_LOG_FILE_PATH_TOO_LONG`: UInt = 20033u;
public const val `ERROR_DHCP_MSCOPE_EXISTS`: UInt = 20053u;
public const val `ERROR_DHCP_NAP_NOT_SUPPORTED`: UInt = 20138u;
public const val `ERROR_DHCP_NETWORK_CHANGED`: UInt = 20050u;
public const val `ERROR_DHCP_NETWORK_INIT_FAILED`: UInt = 20003u;
public const val `ERROR_DHCP_NOT_RESERVED_CLIENT`: UInt = 20018u;
public const val `ERROR_DHCP_NO_ADMIN_PERMISSION`: UInt = 20121u;
public const val `ERROR_DHCP_OPTION_EXITS`: UInt = 20009u;
public const val `ERROR_DHCP_OPTION_NOT_PRESENT`: UInt = 20010u;
public const val `ERROR_DHCP_OPTION_TYPE_MISMATCH`: UInt = 20103u;
public const val `ERROR_DHCP_POLICY_BAD_PARENT_EXPR`: UInt = 20104u;
public const val `ERROR_DHCP_POLICY_EDIT_FQDN_UNSUPPORTED`: UInt = 20137u;
public const val `ERROR_DHCP_POLICY_EXISTS`: UInt = 20105u;
public const val `ERROR_DHCP_POLICY_FQDN_OPTION_UNSUPPORTED`: UInt = 20136u;
public const val `ERROR_DHCP_POLICY_FQDN_RANGE_UNSUPPORTED`: UInt = 20135u;
public const val `ERROR_DHCP_POLICY_NOT_FOUND`: UInt = 20111u;
public const val `ERROR_DHCP_POLICY_RANGE_BAD`: UInt = 20107u;
public const val `ERROR_DHCP_POLICY_RANGE_EXISTS`: UInt = 20106u;
public const val `ERROR_DHCP_PRIMARY_NOT_FOUND`: UInt = 20006u;
public const val `ERROR_DHCP_RANGE_EXTENDED`: UInt = 20024u;
public const val `ERROR_DHCP_RANGE_FULL`: UInt = 20012u;
public const val `ERROR_DHCP_RANGE_INVALID_IN_SERVER_POLICY`: UInt = 20108u;
public const val `ERROR_DHCP_RANGE_TOO_SMALL`: UInt = 20020u;
public const val `ERROR_DHCP_REACHED_END_OF_SELECTION`: UInt = 20126u;
public const val `ERROR_DHCP_REGISTRY_INIT_FAILED`: UInt = 20000u;
public const val `ERROR_DHCP_RESERVEDIP_EXITS`: UInt = 20022u;
public const val `ERROR_DHCP_RESERVED_CLIENT`: UInt = 20019u;
public const val `ERROR_DHCP_ROGUE_DS_CONFLICT`: UInt = 20041u;
public const val `ERROR_DHCP_ROGUE_DS_UNREACHABLE`: UInt = 20040u;
public const val `ERROR_DHCP_ROGUE_INIT_FAILED`: UInt = 20037u;
public const val `ERROR_DHCP_ROGUE_NOT_AUTHORIZED`: UInt = 20039u;
public const val `ERROR_DHCP_ROGUE_NOT_OUR_ENTERPRISE`: UInt = 20042u;
public const val `ERROR_DHCP_ROGUE_SAMSHUTDOWN`: UInt = 20038u;
public const val `ERROR_DHCP_ROGUE_STANDALONE_IN_DS`: UInt = 20043u;
public const val `ERROR_DHCP_RPC_INIT_FAILED`: UInt = 20002u;
public const val `ERROR_DHCP_SCOPE_NAME_TOO_LONG`: UInt = 20046u;
public const val `ERROR_DHCP_SERVER_NAME_NOT_RESOLVED`: UInt = 20124u;
public const val `ERROR_DHCP_SERVER_NOT_REACHABLE`: UInt = 20122u;
public const val `ERROR_DHCP_SERVER_NOT_RUNNING`: UInt = 20123u;
public const val `ERROR_DHCP_SERVICE_PAUSED`: UInt = 20017u;
public const val `ERROR_DHCP_SUBNET_EXISTS`: UInt = 20052u;
public const val `ERROR_DHCP_SUBNET_EXITS`: UInt = 20004u;
public const val `ERROR_DHCP_SUBNET_NOT_PRESENT`: UInt = 20005u;
public const val `ERROR_DHCP_SUPER_SCOPE_NAME_TOO_LONG`: UInt = 20030u;
public const val `ERROR_DHCP_UNDEFINED_HARDWARE_ADDRESS_TYPE`: UInt = 20102u;
public const val `ERROR_DHCP_UNSUPPORTED_CLIENT`: UInt = 20034u;
public const val `ERROR_EXTEND_TOO_SMALL`: UInt = 20025u;
public const val `ERROR_LAST_DHCP_SERVER_ERROR`: UInt = 20139u;
public const val `ERROR_MSCOPE_RANGE_TOO_SMALL`: UInt = 20054u;
public const val `ERROR_SCOPE_RANGE_POLICY_RANGE_CONFLICT`: UInt = 20112u;
public const val `ERROR_SERVER_INVALID_BOOT_FILE_TABLE`: UInt = 20028u;
public const val `ERROR_SERVER_UNKNOWN_BOOT_FILE_NAME`: UInt = 20029u;
public const val `EXEMPT`: `QuarantineStatus` = 4;
public const val `FILTER_STATUS_FULL_MATCH_IN_ALLOW_LIST`: UInt = 2u;
public const val `FILTER_STATUS_FULL_MATCH_IN_DENY_LIST`: UInt = 4u;
public const val `FILTER_STATUS_NONE`: UInt = 1u;
public const val `FILTER_STATUS_WILDCARD_MATCH_IN_ALLOW_LIST`: UInt = 8u;
public const val `FILTER_STATUS_WILDCARD_MATCH_IN_DENY_LIST`: UInt = 16u;
public typealias `FSM_STATE` = Int;
public const val `HWTYPE_ETHERNET_10MB`: UInt = 1u;
public const val `HotStandby`: `DHCP_FAILOVER_MODE` = 1;
public const val `INIT`: `FSM_STATE` = 1;
// UNSUPPORTED Rust 2334:1: generic scalar type unsupported
// pub type LPDHCP_CONTROL = Option<unsafe extern "system" fn(dwcontrolcode: u32, lpreserved: *mut core::ffi::c_void) -> u32>;

// UNSUPPORTED Rust 2335:1: generic scalar type unsupported
// pub type LPDHCP_DELETE_CLIENT = Option<unsafe extern "system" fn(ipaddress: u32, hwaddress: *mut u8, hwaddresslength: u32, reserved: u32, clienttype: u32) -> u32>;

// UNSUPPORTED Rust 2336:1: generic scalar type unsupported
// pub type LPDHCP_DROP_SEND = Option<unsafe extern "system" fn(packet: *mut *mut u8, packetsize: *mut u32, controlcode: u32, ipaddress: u32, reserved: *mut core::ffi::c_void, pktcontext: *mut core::ffi::c_void) -> u32>;

// UNSUPPORTED Rust 2337:1: generic scalar type unsupported
// pub type LPDHCP_ENTRY_POINT_FUNC = Option<unsafe extern "system" fn(chaindlls: windows_sys::core::PCWSTR, calloutversion: u32, callouttbl: *mut DHCP_CALLOUT_TABLE) -> u32>;

// UNSUPPORTED Rust 2338:1: generic scalar type unsupported
// pub type LPDHCP_GIVE_ADDRESS = Option<unsafe extern "system" fn(packet: *mut u8, packetsize: u32, controlcode: u32, ipaddress: u32, altaddress: u32, addrtype: u32, leasetime: u32, reserved: *mut core::ffi::c_void, pktcontext: *mut core::ffi::c_void) -> u32>;

// UNSUPPORTED Rust 2339:1: generic scalar type unsupported
// pub type LPDHCP_HANDLE_OPTIONS = Option<unsafe extern "system" fn(packet: *mut u8, packetsize: u32, reserved: *mut core::ffi::c_void, pktcontext: *mut core::ffi::c_void, serveroptions: *mut DHCP_SERVER_OPTIONS) -> u32>;

// UNSUPPORTED Rust 2340:1: generic scalar type unsupported
// pub type LPDHCP_NEWPKT = Option<unsafe extern "system" fn(packet: *mut *mut u8, packetsize: *mut u32, ipaddress: u32, reserved: *mut core::ffi::c_void, pktcontext: *mut *mut core::ffi::c_void, processit: *mut windows_sys::core::BOOL) -> u32>;

// UNSUPPORTED Rust 2341:1: generic scalar type unsupported
// pub type LPDHCP_PROB = Option<unsafe extern "system" fn(packet: *mut u8, packetsize: u32, controlcode: u32, ipaddress: u32, altaddress: u32, reserved: *mut core::ffi::c_void, pktcontext: *mut core::ffi::c_void) -> u32>;

public const val `LoadBalance`: `DHCP_FAILOVER_MODE` = 0;
public const val `MAC_ADDRESS_LENGTH`: UInt = 6u;
public const val `MAX_PATTERN_LENGTH`: UInt = 255u;
public const val `MCLT`: UInt = 1u;
public const val `MODE`: UInt = 16u;
public const val `NOQUARANTINE`: `QuarantineStatus` = 0;
public const val `NOQUARINFO`: `QuarantineStatus` = 6;
public const val `NORMAL`: `FSM_STATE` = 3;
public const val `NO_STATE`: `FSM_STATE` = 0;
public const val `OPTION_ALL_SUBNETS_MTU`: UInt = 27u;
public const val `OPTION_ARP_CACHE_TIMEOUT`: UInt = 35u;
public const val `OPTION_BE_A_MASK_SUPPLIER`: UInt = 30u;
public const val `OPTION_BE_A_ROUTER`: UInt = 19u;
public const val `OPTION_BOOTFILE_NAME`: UInt = 67u;
public const val `OPTION_BOOT_FILE_SIZE`: UInt = 13u;
public const val `OPTION_BROADCAST_ADDRESS`: UInt = 28u;
public const val `OPTION_CLIENT_CLASS_INFO`: UInt = 60u;
public const val `OPTION_CLIENT_ID`: UInt = 61u;
public const val `OPTION_COOKIE_SERVERS`: UInt = 8u;
public const val `OPTION_DEFAULT_TTL`: UInt = 23u;
public const val `OPTION_DOMAIN_NAME`: UInt = 15u;
public const val `OPTION_DOMAIN_NAME_SERVERS`: UInt = 6u;
public const val `OPTION_END`: UInt = 255u;
public const val `OPTION_ETHERNET_ENCAPSULATION`: UInt = 36u;
public const val `OPTION_EXTENSIONS_PATH`: UInt = 18u;
public const val `OPTION_HOST_NAME`: UInt = 12u;
public const val `OPTION_IEN116_NAME_SERVERS`: UInt = 5u;
public const val `OPTION_IMPRESS_SERVERS`: UInt = 10u;
public const val `OPTION_KEEP_ALIVE_DATA_SIZE`: UInt = 39u;
public const val `OPTION_KEEP_ALIVE_INTERVAL`: UInt = 38u;
public const val `OPTION_LEASE_TIME`: UInt = 51u;
public const val `OPTION_LOG_SERVERS`: UInt = 7u;
public const val `OPTION_LPR_SERVERS`: UInt = 9u;
public const val `OPTION_MAX_REASSEMBLY_SIZE`: UInt = 22u;
public const val `OPTION_MERIT_DUMP_FILE`: UInt = 14u;
public const val `OPTION_MESSAGE`: UInt = 56u;
public const val `OPTION_MESSAGE_LENGTH`: UInt = 57u;
public const val `OPTION_MESSAGE_TYPE`: UInt = 53u;
public const val `OPTION_MSFT_IE_PROXY`: UInt = 252u;
public const val `OPTION_MTU`: UInt = 26u;
public const val `OPTION_NETBIOS_DATAGRAM_SERVER`: UInt = 45u;
public const val `OPTION_NETBIOS_NAME_SERVER`: UInt = 44u;
public const val `OPTION_NETBIOS_NODE_TYPE`: UInt = 46u;
public const val `OPTION_NETBIOS_SCOPE_OPTION`: UInt = 47u;
public const val `OPTION_NETWORK_INFO_SERVERS`: UInt = 41u;
public const val `OPTION_NETWORK_INFO_SERVICE_DOM`: UInt = 40u;
public const val `OPTION_NETWORK_TIME_SERVERS`: UInt = 42u;
public const val `OPTION_NON_LOCAL_SOURCE_ROUTING`: UInt = 20u;
public const val `OPTION_OK_TO_OVERLAY`: UInt = 52u;
public const val `OPTION_PAD`: UInt = 0u;
public const val `OPTION_PARAMETER_REQUEST_LIST`: UInt = 55u;
public const val `OPTION_PERFORM_MASK_DISCOVERY`: UInt = 29u;
public const val `OPTION_PERFORM_ROUTER_DISCOVERY`: UInt = 31u;
public const val `OPTION_PMTU_AGING_TIMEOUT`: UInt = 24u;
public const val `OPTION_PMTU_PLATEAU_TABLE`: UInt = 25u;
public const val `OPTION_POLICY_FILTER_FOR_NLSR`: UInt = 21u;
public const val `OPTION_REBIND_TIME`: UInt = 59u;
public const val `OPTION_RENEWAL_TIME`: UInt = 58u;
public const val `OPTION_REQUESTED_ADDRESS`: UInt = 50u;
public const val `OPTION_RLP_SERVERS`: UInt = 11u;
public const val `OPTION_ROOT_DISK`: UInt = 17u;
public const val `OPTION_ROUTER_ADDRESS`: UInt = 3u;
public const val `OPTION_ROUTER_SOLICITATION_ADDR`: UInt = 32u;
public const val `OPTION_SERVER_IDENTIFIER`: UInt = 54u;
public const val `OPTION_STATIC_ROUTES`: UInt = 33u;
public const val `OPTION_SUBNET_MASK`: UInt = 1u;
public const val `OPTION_SWAP_SERVER`: UInt = 16u;
public const val `OPTION_TFTP_SERVER_NAME`: UInt = 66u;
public const val `OPTION_TIME_OFFSET`: UInt = 2u;
public const val `OPTION_TIME_SERVERS`: UInt = 4u;
public const val `OPTION_TRAILERS`: UInt = 34u;
public const val `OPTION_TTL`: UInt = 37u;
public const val `OPTION_VENDOR_SPEC_INFO`: UInt = 43u;
public const val `OPTION_XWINDOW_DISPLAY_MANAGER`: UInt = 49u;
public const val `OPTION_XWINDOW_FONT_SERVER`: UInt = 48u;
public const val `PARTNER_DOWN`: `FSM_STATE` = 5;
public const val `PAUSED`: `FSM_STATE` = 12;
public const val `PERCENTAGE`: UInt = 8u;
public const val `POTENTIAL_CONFLICT`: `FSM_STATE` = 6;
public const val `PREVSTATE`: UInt = 32u;
public const val `PROBATION`: `QuarantineStatus` = 3;
public const val `PrimaryServer`: `DHCP_FAILOVER_SERVER` = 0;
public const val `QUARANTINE_CONFIG_OPTION`: UInt = 43222u;
public const val `QUARANTINE_SCOPE_QUARPROFILE_OPTION`: UInt = 43221u;
public const val `QUARANTIN_OPTION_BASE`: UInt = 43220u;
public typealias `QuarantineStatus` = Int;
public const val `RECOVER`: `FSM_STATE` = 9;
public const val `RECOVER_DONE`: `FSM_STATE` = 11;
public const val `RECOVER_WAIT`: `FSM_STATE` = 10;
public const val `RESOLUTION_INT`: `FSM_STATE` = 8;
public const val `RESTRICTEDACCESS`: `QuarantineStatus` = 1;
public const val `SAFEPERIOD`: UInt = 2u;
// UNSUPPORTED Rust 2434:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SCOPE_MIB_INFO {
//     pub Subnet: u32,
//     pub NumAddressesInuse: u32,
//     pub NumAddressesFree: u32,
//     pub NumPendingOffers: u32,
// }

// UNSUPPORTED Rust 2442:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SCOPE_MIB_INFO_V5 {
//     pub Subnet: u32,
//     pub NumAddressesInuse: u32,
//     pub NumAddressesFree: u32,
//     pub NumPendingOffers: u32,
// }

// UNSUPPORTED Rust 2450:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SCOPE_MIB_INFO_V6 {
//     pub Subnet: DHCP_IPV6_ADDRESS,
//     pub NumAddressesInuse: u64,
//     pub NumAddressesFree: u64,
//     pub NumPendingAdvertises: u64,
// }

// UNSUPPORTED Rust 2458:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SCOPE_MIB_INFO_VQ {
//     pub Subnet: u32,
//     pub NumAddressesInuse: u32,
//     pub NumAddressesFree: u32,
//     pub NumPendingOffers: u32,
//     pub QtnNumLeases: u32,
//     pub QtnPctQtnLeases: u32,
//     pub QtnProbationLeases: u32,
//     pub QtnNonQtnLeases: u32,
//     pub QtnExemptLeases: u32,
//     pub QtnCapableClients: u32,
// }

public const val `SHAREDSECRET`: UInt = 64u;
public const val `SHUTDOWN`: `FSM_STATE` = 13;
public const val `STARTUP`: `FSM_STATE` = 2;
public const val `STATUS_NOPREFIX_AVAIL`: `StatusCode` = 6;
public const val `STATUS_NO_BINDING`: `StatusCode` = 3;
public const val `STATUS_NO_ERROR`: `StatusCode` = 0;
public const val `STATUS_UNSPECIFIED_FAILURE`: `StatusCode` = 1;
public const val `SecondaryServer`: `DHCP_FAILOVER_SERVER` = 1;
public const val `Set_APIProtocolSupport`: UInt = 1u;
public const val `Set_AuditLogState`: UInt = 2048u;
public const val `Set_BackupInterval`: UInt = 16u;
public const val `Set_BackupPath`: UInt = 8u;
public const val `Set_BootFileTable`: UInt = 1024u;
public const val `Set_DatabaseCleanupInterval`: UInt = 128u;
public const val `Set_DatabaseLoggingFlag`: UInt = 32u;
public const val `Set_DatabaseName`: UInt = 2u;
public const val `Set_DatabasePath`: UInt = 4u;
public const val `Set_DebugFlag`: UInt = 256u;
public const val `Set_PingRetries`: UInt = 512u;
public const val `Set_PreferredLifetime`: UInt = 4u;
public const val `Set_PreferredLifetimeIATA`: UInt = 64u;
public const val `Set_QuarantineDefFail`: UInt = 8192u;
public const val `Set_QuarantineON`: UInt = 4096u;
public const val `Set_RapidCommitFlag`: UInt = 2u;
public const val `Set_RestoreFlag`: UInt = 64u;
public const val `Set_T1`: UInt = 16u;
public const val `Set_T2`: UInt = 32u;
public const val `Set_UnicastFlag`: UInt = 1u;
public const val `Set_ValidLifetime`: UInt = 8u;
public const val `Set_ValidLifetimeIATA`: UInt = 128u;
public typealias `StatusCode` = Int;
public const val `V5_ADDRESS_BIT_BOTH_REC`: UInt = 32u;
public const val `V5_ADDRESS_BIT_DELETED`: UInt = 128u;
public const val `V5_ADDRESS_BIT_UNREGISTERED`: UInt = 64u;
public const val `V5_ADDRESS_EX_BIT_DISABLE_PTR_RR`: UInt = 1u;
public const val `V5_ADDRESS_STATE_ACTIVE`: UInt = 1u;
public const val `V5_ADDRESS_STATE_DECLINED`: UInt = 2u;
public const val `V5_ADDRESS_STATE_DOOM`: UInt = 3u;
public const val `V5_ADDRESS_STATE_OFFERED`: UInt = 0u;
public const val `WARNING_EXTENDED_LESS`: Int = 20026;
