// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole"))]
// windows_link::link!("activeds.dll" "system" fn ADsBuildEnumerator(padscontainer : * mut core::ffi::c_void, ppenumvariant : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
// windows_link::link!("activeds.dll" "system" fn ADsBuildVarArrayInt(lpdwobjecttypes : *mut u32, dwobjecttypes : u32, pvar : *mut super::super::System::Variant:: VARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
// windows_link::link!("activeds.dll" "system" fn ADsBuildVarArrayStr(lpppathnames : *const windows_sys::core::PCWSTR, dwpathnames : u32, pvar : *mut super::super::System::Variant:: VARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("activeds.dll" "system" fn ADsDecodeBinaryData(szsrcdata : windows_sys::core::PCWSTR, ppbdestdata : *mut *mut u8, pdwdestlen : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("activeds.dll" "system" fn ADsEncodeBinaryData(pbsrcdata : *mut u8, dwsrclen : u32, ppszdestdata : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
// windows_link::link!("activeds.dll" "system" fn ADsEnumerateNext(penumvariant : * mut core::ffi::c_void, celements : u32, pvar : *mut super::super::System::Variant:: VARIANT, pcelementsfetched : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Ole")]
// windows_link::link!("activeds.dll" "system" fn ADsFreeEnumerator(penumvariant : * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// windows_link::link!("activeds.dll" "system" fn ADsGetLastError(lperror : *mut u32, lperrorbuf : windows_sys::core::PWSTR, dwerrorbuflen : u32, lpnamebuf : windows_sys::core::PWSTR, dwnamebuflen : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// windows_link::link!("activeds.dll" "system" fn ADsGetObject(lpszpathname : windows_sys::core::PCWSTR, riid : *const windows_sys::core::GUID, ppobject : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// windows_link::link!("activeds.dll" "system" fn ADsOpenObject(lpszpathname : windows_sys::core::PCWSTR, lpszusername : windows_sys::core::PCWSTR, lpszpassword : windows_sys::core::PCWSTR, dwreserved : ADS_AUTHENTICATION_ENUM, riid : *const windows_sys::core::GUID, ppobject : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// windows_link::link!("dsprop.dll" "system" fn ADsPropCheckIfWritable(pwzattr : windows_sys::core::PCWSTR, pwritableattrs : *const ADS_ATTR_INFO) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("dsprop.dll" "system" fn ADsPropCreateNotifyObj(pappthddataobj : * mut core::ffi::c_void, pwzadsobjname : windows_sys::core::PCWSTR, phnotifyobj : *mut super::super::Foundation:: HWND) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// windows_link::link!("dsprop.dll" "system" fn ADsPropGetInitInfo(hnotifyobj : super::super::Foundation:: HWND, pinitparams : *mut ADSPROPINITPARAMS) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// windows_link::link!("dsprop.dll" "system" fn ADsPropSendErrorMessage(hnotifyobj : super::super::Foundation:: HWND, perror : *mut ADSPROPERROR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// windows_link::link!("dsprop.dll" "system" fn ADsPropSetHwnd(hnotifyobj : super::super::Foundation:: HWND, hpage : super::super::Foundation:: HWND) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// windows_link::link!("dsprop.dll" "system" fn ADsPropSetHwndWithTitle(hnotifyobj : super::super::Foundation:: HWND, hpage : super::super::Foundation:: HWND, ptztitle : *const i8) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// windows_link::link!("dsprop.dll" "system" fn ADsPropShowErrorDialog(hnotifyobj : super::super::Foundation:: HWND, hpage : super::super::Foundation:: HWND) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// windows_link::link!("activeds.dll" "system" fn ADsSetLastError(dwerr : u32, pszerror : windows_sys::core::PCWSTR, pszprovider : windows_sys::core::PCWSTR));

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// windows_link::link!("activeds.dll" "system" fn AdsFreeAdsValues(padsvalues : *mut ADSVALUE, dwnumvalues : u32));

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
// windows_link::link!("activeds.dll" "system" fn AdsTypeToPropVariant(padsvalues : *mut ADSVALUE, dwnumvalues : u32, pvariant : *mut super::super::System::Variant:: VARIANT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// windows_link::link!("activeds.dll" "system" fn AllocADsMem(cb : u32) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 29:1: declaration Macro has no candidate rule
// windows_link::link!("activeds.dll" "system" fn AllocADsStr(pstr : windows_sys::core::PCWSTR) -> windows_sys::core::PWSTR);

// UNSUPPORTED Rust 30:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_Security", feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
// windows_link::link!("activeds.dll" "system" fn BinarySDToSecurityDescriptor(psecuritydescriptor : super::super::Security:: PSECURITY_DESCRIPTOR, pvarsec : *mut super::super::System::Variant:: VARIANT, pszservername : windows_sys::core::PCWSTR, username : windows_sys::core::PCWSTR, password : windows_sys::core::PCWSTR, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 32:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsAddSidHistoryA(hds : super::super::Foundation:: HANDLE, flags : u32, srcdomain : windows_sys::core::PCSTR, srcprincipal : windows_sys::core::PCSTR, srcdomaincontroller : windows_sys::core::PCSTR, srcdomaincreds : *const core::ffi::c_void, dstdomain : windows_sys::core::PCSTR, dstprincipal : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 33:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsAddSidHistoryW(hds : super::super::Foundation:: HANDLE, flags : u32, srcdomain : windows_sys::core::PCWSTR, srcprincipal : windows_sys::core::PCWSTR, srcdomaincontroller : windows_sys::core::PCWSTR, srcdomaincreds : *const core::ffi::c_void, dstdomain : windows_sys::core::PCWSTR, dstprincipal : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 34:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// windows_link::link!("netapi32.dll" "system" fn DsAddressToSiteNamesA(computername : windows_sys::core::PCSTR, entrycount : u32, socketaddresses : *const super::WinSock:: SOCKET_ADDRESS, sitenames : *mut *mut windows_sys::core::PSTR) -> u32);

// UNSUPPORTED Rust 36:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// windows_link::link!("netapi32.dll" "system" fn DsAddressToSiteNamesExA(computername : windows_sys::core::PCSTR, entrycount : u32, socketaddresses : *const super::WinSock:: SOCKET_ADDRESS, sitenames : *mut *mut windows_sys::core::PSTR, subnetnames : *mut *mut windows_sys::core::PSTR) -> u32);

// UNSUPPORTED Rust 38:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// windows_link::link!("netapi32.dll" "system" fn DsAddressToSiteNamesExW(computername : windows_sys::core::PCWSTR, entrycount : u32, socketaddresses : *const super::WinSock:: SOCKET_ADDRESS, sitenames : *mut *mut windows_sys::core::PWSTR, subnetnames : *mut *mut windows_sys::core::PWSTR) -> u32);

// UNSUPPORTED Rust 40:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// windows_link::link!("netapi32.dll" "system" fn DsAddressToSiteNamesW(computername : windows_sys::core::PCWSTR, entrycount : u32, socketaddresses : *const super::WinSock:: SOCKET_ADDRESS, sitenames : *mut *mut windows_sys::core::PWSTR) -> u32);

// UNSUPPORTED Rust 42:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsBindA(domaincontrollername : windows_sys::core::PCSTR, dnsdomainname : windows_sys::core::PCSTR, phds : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 43:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsBindByInstanceA(servername : windows_sys::core::PCSTR, annotation : windows_sys::core::PCSTR, instanceguid : *const windows_sys::core::GUID, dnsdomainname : windows_sys::core::PCSTR, authidentity : *const core::ffi::c_void, serviceprincipalname : windows_sys::core::PCSTR, bindflags : u32, phds : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 44:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsBindByInstanceW(servername : windows_sys::core::PCWSTR, annotation : windows_sys::core::PCWSTR, instanceguid : *const windows_sys::core::GUID, dnsdomainname : windows_sys::core::PCWSTR, authidentity : *const core::ffi::c_void, serviceprincipalname : windows_sys::core::PCWSTR, bindflags : u32, phds : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 45:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsBindToISTGA(sitename : windows_sys::core::PCSTR, phds : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 46:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsBindToISTGW(sitename : windows_sys::core::PCWSTR, phds : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 47:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsBindW(domaincontrollername : windows_sys::core::PCWSTR, dnsdomainname : windows_sys::core::PCWSTR, phds : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 48:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsBindWithCredA(domaincontrollername : windows_sys::core::PCSTR, dnsdomainname : windows_sys::core::PCSTR, authidentity : *const core::ffi::c_void, phds : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 49:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsBindWithCredW(domaincontrollername : windows_sys::core::PCWSTR, dnsdomainname : windows_sys::core::PCWSTR, authidentity : *const core::ffi::c_void, phds : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 50:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsBindWithSpnA(domaincontrollername : windows_sys::core::PCSTR, dnsdomainname : windows_sys::core::PCSTR, authidentity : *const core::ffi::c_void, serviceprincipalname : windows_sys::core::PCSTR, phds : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 51:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsBindWithSpnExA(domaincontrollername : windows_sys::core::PCSTR, dnsdomainname : windows_sys::core::PCSTR, authidentity : *const core::ffi::c_void, serviceprincipalname : windows_sys::core::PCSTR, bindflags : u32, phds : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 52:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsBindWithSpnExW(domaincontrollername : windows_sys::core::PCWSTR, dnsdomainname : windows_sys::core::PCWSTR, authidentity : *const core::ffi::c_void, serviceprincipalname : windows_sys::core::PCWSTR, bindflags : u32, phds : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 53:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsBindWithSpnW(domaincontrollername : windows_sys::core::PCWSTR, dnsdomainname : windows_sys::core::PCWSTR, authidentity : *const core::ffi::c_void, serviceprincipalname : windows_sys::core::PCWSTR, phds : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 54:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsBindingSetTimeout(hds : super::super::Foundation:: HANDLE, ctimeoutsecs : u32) -> u32);

// UNSUPPORTED Rust 55:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_Shell")]
// windows_link::link!("dsuiext.dll" "system" fn DsBrowseForContainerA(pinfo : *mut DSBROWSEINFOA) -> i32);

// UNSUPPORTED Rust 57:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_Shell")]
// windows_link::link!("dsuiext.dll" "system" fn DsBrowseForContainerW(pinfo : *mut DSBROWSEINFOW) -> i32);

// UNSUPPORTED Rust 59:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsClientMakeSpnForTargetServerA(serviceclass : windows_sys::core::PCSTR, servicename : windows_sys::core::PCSTR, pcspnlength : *mut u32, pszspn : windows_sys::core::PSTR) -> u32);

// UNSUPPORTED Rust 60:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsClientMakeSpnForTargetServerW(serviceclass : windows_sys::core::PCWSTR, servicename : windows_sys::core::PCWSTR, pcspnlength : *mut u32, pszspn : windows_sys::core::PWSTR) -> u32);

// UNSUPPORTED Rust 61:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsCrackNamesA(hds : super::super::Foundation:: HANDLE, flags : DS_NAME_FLAGS, formatoffered : DS_NAME_FORMAT, formatdesired : DS_NAME_FORMAT, cnames : u32, rpnames : *const windows_sys::core::PCSTR, ppresult : *mut *mut DS_NAME_RESULTA) -> u32);

// UNSUPPORTED Rust 62:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsCrackNamesW(hds : super::super::Foundation:: HANDLE, flags : DS_NAME_FLAGS, formatoffered : DS_NAME_FORMAT, formatdesired : DS_NAME_FORMAT, cnames : u32, rpnames : *const windows_sys::core::PCWSTR, ppresult : *mut *mut DS_NAME_RESULTW) -> u32);

// UNSUPPORTED Rust 63:1: declaration Macro has no candidate rule
// windows_link::link!("dsparse.dll" "system" fn DsCrackSpn2A(pszspn : windows_sys::core::PCSTR, cspn : u32, pcserviceclass : *mut u32, serviceclass : windows_sys::core::PSTR, pcservicename : *mut u32, servicename : windows_sys::core::PSTR, pcinstancename : *mut u32, instancename : windows_sys::core::PSTR, pinstanceport : *mut u16) -> u32);

// UNSUPPORTED Rust 64:1: declaration Macro has no candidate rule
// windows_link::link!("dsparse.dll" "system" fn DsCrackSpn2W(pszspn : windows_sys::core::PCWSTR, cspn : u32, pcserviceclass : *mut u32, serviceclass : windows_sys::core::PWSTR, pcservicename : *mut u32, servicename : windows_sys::core::PWSTR, pcinstancename : *mut u32, instancename : windows_sys::core::PWSTR, pinstanceport : *mut u16) -> u32);

// UNSUPPORTED Rust 65:1: declaration Macro has no candidate rule
// windows_link::link!("dsparse.dll" "system" fn DsCrackSpn3W(pszspn : windows_sys::core::PCWSTR, cspn : u32, pchostname : *mut u32, hostname : windows_sys::core::PWSTR, pcinstancename : *mut u32, instancename : windows_sys::core::PWSTR, pportnumber : *mut u16, pcdomainname : *mut u32, domainname : windows_sys::core::PWSTR, pcrealmname : *mut u32, realmname : windows_sys::core::PWSTR) -> u32);

// UNSUPPORTED Rust 66:1: declaration Macro has no candidate rule
// windows_link::link!("dsparse.dll" "system" fn DsCrackSpn4W(pszspn : windows_sys::core::PCWSTR, cspn : u32, pchostname : *mut u32, hostname : windows_sys::core::PWSTR, pcinstancename : *mut u32, instancename : windows_sys::core::PWSTR, pcportname : *mut u32, portname : windows_sys::core::PWSTR, pcdomainname : *mut u32, domainname : windows_sys::core::PWSTR, pcrealmname : *mut u32, realmname : windows_sys::core::PWSTR) -> u32);

// UNSUPPORTED Rust 67:1: declaration Macro has no candidate rule
// windows_link::link!("dsparse.dll" "system" fn DsCrackSpnA(pszspn : windows_sys::core::PCSTR, pcserviceclass : *mut u32, serviceclass : windows_sys::core::PSTR, pcservicename : *mut u32, servicename : windows_sys::core::PSTR, pcinstancename : *mut u32, instancename : windows_sys::core::PSTR, pinstanceport : *mut u16) -> u32);

// UNSUPPORTED Rust 68:1: declaration Macro has no candidate rule
// windows_link::link!("dsparse.dll" "system" fn DsCrackSpnW(pszspn : windows_sys::core::PCWSTR, pcserviceclass : *mut u32, serviceclass : windows_sys::core::PWSTR, pcservicename : *mut u32, servicename : windows_sys::core::PWSTR, pcinstancename : *mut u32, instancename : windows_sys::core::PWSTR, pinstanceport : *mut u16) -> u32);

// UNSUPPORTED Rust 69:1: declaration Macro has no candidate rule
// windows_link::link!("dsparse.dll" "system" fn DsCrackUnquotedMangledRdnA(pszrdn : windows_sys::core::PCSTR, cchrdn : u32, pguid : *mut windows_sys::core::GUID, pedsmanglefor : *mut DS_MANGLE_FOR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 70:1: declaration Macro has no candidate rule
// windows_link::link!("dsparse.dll" "system" fn DsCrackUnquotedMangledRdnW(pszrdn : windows_sys::core::PCWSTR, cchrdn : u32, pguid : *mut windows_sys::core::GUID, pedsmanglefor : *mut DS_MANGLE_FOR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 71:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn DsDeregisterDnsHostRecordsA(servername : windows_sys::core::PCSTR, dnsdomainname : windows_sys::core::PCSTR, domainguid : *const windows_sys::core::GUID, dsaguid : *const windows_sys::core::GUID, dnshostname : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 72:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn DsDeregisterDnsHostRecordsW(servername : windows_sys::core::PCWSTR, dnsdomainname : windows_sys::core::PCWSTR, domainguid : *const windows_sys::core::GUID, dsaguid : *const windows_sys::core::GUID, dnshostname : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 73:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("netapi32.dll" "system" fn DsEnumerateDomainTrustsA(servername : windows_sys::core::PCSTR, flags : u32, domains : *mut *mut DS_DOMAIN_TRUSTSA, domaincount : *mut u32) -> u32);

// UNSUPPORTED Rust 75:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("netapi32.dll" "system" fn DsEnumerateDomainTrustsW(servername : windows_sys::core::PCWSTR, flags : u32, domains : *mut *mut DS_DOMAIN_TRUSTSW, domaincount : *mut u32) -> u32);

// UNSUPPORTED Rust 77:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsFreeDomainControllerInfoA(infolevel : u32, cinfo : u32, pinfo : *const core::ffi::c_void));

// UNSUPPORTED Rust 78:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsFreeDomainControllerInfoW(infolevel : u32, cinfo : u32, pinfo : *const core::ffi::c_void));

// UNSUPPORTED Rust 79:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsFreeNameResultA(presult : *const DS_NAME_RESULTA));

// UNSUPPORTED Rust 80:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsFreeNameResultW(presult : *const DS_NAME_RESULTW));

// UNSUPPORTED Rust 81:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsFreePasswordCredentials(authidentity : *const core::ffi::c_void));

// UNSUPPORTED Rust 82:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsFreeSchemaGuidMapA(pguidmap : *const DS_SCHEMA_GUID_MAPA));

// UNSUPPORTED Rust 83:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsFreeSchemaGuidMapW(pguidmap : *const DS_SCHEMA_GUID_MAPW));

// UNSUPPORTED Rust 84:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsFreeSpnArrayA(cspn : u32, rpszspn : *mut windows_sys::core::PSTR));

// UNSUPPORTED Rust 85:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsFreeSpnArrayW(cspn : u32, rpszspn : *mut windows_sys::core::PWSTR));

// UNSUPPORTED Rust 86:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn DsGetDcCloseW(getdccontexthandle : super::super::Foundation:: HANDLE));

// UNSUPPORTED Rust 87:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn DsGetDcNameA(computername : windows_sys::core::PCSTR, domainname : windows_sys::core::PCSTR, domainguid : *const windows_sys::core::GUID, sitename : windows_sys::core::PCSTR, flags : u32, domaincontrollerinfo : *mut *mut DOMAIN_CONTROLLER_INFOA) -> u32);

// UNSUPPORTED Rust 88:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn DsGetDcNameW(computername : windows_sys::core::PCWSTR, domainname : windows_sys::core::PCWSTR, domainguid : *const windows_sys::core::GUID, sitename : windows_sys::core::PCWSTR, flags : u32, domaincontrollerinfo : *mut *mut DOMAIN_CONTROLLER_INFOW) -> u32);

// UNSUPPORTED Rust 89:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// windows_link::link!("netapi32.dll" "system" fn DsGetDcNextA(getdccontexthandle : super::super::Foundation:: HANDLE, sockaddresscount : *mut u32, sockaddresses : *mut *mut super::WinSock:: SOCKET_ADDRESS, dnshostname : *mut windows_sys::core::PSTR) -> u32);

// UNSUPPORTED Rust 91:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// windows_link::link!("netapi32.dll" "system" fn DsGetDcNextW(getdccontexthandle : super::super::Foundation:: HANDLE, sockaddresscount : *mut u32, sockaddresses : *mut *mut super::WinSock:: SOCKET_ADDRESS, dnshostname : *mut windows_sys::core::PWSTR) -> u32);

// UNSUPPORTED Rust 93:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn DsGetDcOpenA(dnsname : windows_sys::core::PCSTR, optionflags : u32, sitename : windows_sys::core::PCSTR, domainguid : *const windows_sys::core::GUID, dnsforestname : windows_sys::core::PCSTR, dcflags : u32, retgetdccontext : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 94:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn DsGetDcOpenW(dnsname : windows_sys::core::PCWSTR, optionflags : u32, sitename : windows_sys::core::PCWSTR, domainguid : *const windows_sys::core::GUID, dnsforestname : windows_sys::core::PCWSTR, dcflags : u32, retgetdccontext : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 95:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn DsGetDcSiteCoverageA(servername : windows_sys::core::PCSTR, entrycount : *mut u32, sitenames : *mut *mut windows_sys::core::PSTR) -> u32);

// UNSUPPORTED Rust 96:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn DsGetDcSiteCoverageW(servername : windows_sys::core::PCWSTR, entrycount : *mut u32, sitenames : *mut *mut windows_sys::core::PWSTR) -> u32);

// UNSUPPORTED Rust 97:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsGetDomainControllerInfoA(hds : super::super::Foundation:: HANDLE, domainname : windows_sys::core::PCSTR, infolevel : u32, pcout : *mut u32, ppinfo : *mut *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 98:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsGetDomainControllerInfoW(hds : super::super::Foundation:: HANDLE, domainname : windows_sys::core::PCWSTR, infolevel : u32, pcout : *mut u32, ppinfo : *mut *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 99:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Authentication_Identity")]
// windows_link::link!("netapi32.dll" "system" fn DsGetForestTrustInformationW(servername : windows_sys::core::PCWSTR, trusteddomainname : windows_sys::core::PCWSTR, flags : u32, foresttrustinfo : *mut *mut super::super::Security::Authentication::Identity:: LSA_FOREST_TRUST_INFORMATION) -> u32);

// UNSUPPORTED Rust 101:1: declaration Macro has no candidate rule
// windows_link::link!("dsuiext.dll" "system" fn DsGetFriendlyClassName(pszobjectclass : windows_sys::core::PCWSTR, pszbuffer : windows_sys::core::PWSTR, cchbuffer : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 102:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// windows_link::link!("dsuiext.dll" "system" fn DsGetIcon(dwflags : u32, pszobjectclass : windows_sys::core::PCWSTR, cximage : i32, cyimage : i32) -> super::super::UI::WindowsAndMessaging:: HICON);

// UNSUPPORTED Rust 104:1: declaration Macro has no candidate rule
// windows_link::link!("dsparse.dll" "system" fn DsGetRdnW(ppdn : *mut windows_sys::core::PWSTR, pcdn : *mut u32, ppkey : *mut windows_sys::core::PWSTR, pckey : *mut u32, ppval : *mut windows_sys::core::PWSTR, pcval : *mut u32) -> u32);

// UNSUPPORTED Rust 105:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn DsGetSiteNameA(computername : windows_sys::core::PCSTR, sitename : *mut windows_sys::core::PSTR) -> u32);

// UNSUPPORTED Rust 106:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn DsGetSiteNameW(computername : windows_sys::core::PCWSTR, sitename : *mut windows_sys::core::PWSTR) -> u32);

// UNSUPPORTED Rust 107:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsGetSpnA(servicetype : DS_SPN_NAME_TYPE, serviceclass : windows_sys::core::PCSTR, servicename : windows_sys::core::PCSTR, instanceport : u16, cinstancenames : u16, pinstancenames : *const windows_sys::core::PCSTR, pinstanceports : *const u16, pcspn : *mut u32, prpszspn : *mut *mut windows_sys::core::PSTR) -> u32);

// UNSUPPORTED Rust 108:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsGetSpnW(servicetype : DS_SPN_NAME_TYPE, serviceclass : windows_sys::core::PCWSTR, servicename : windows_sys::core::PCWSTR, instanceport : u16, cinstancenames : u16, pinstancenames : *const windows_sys::core::PCWSTR, pinstanceports : *const u16, pcspn : *mut u32, prpszspn : *mut *mut windows_sys::core::PWSTR) -> u32);

// UNSUPPORTED Rust 109:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsInheritSecurityIdentityA(hds : super::super::Foundation:: HANDLE, flags : u32, srcprincipal : windows_sys::core::PCSTR, dstprincipal : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 110:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsInheritSecurityIdentityW(hds : super::super::Foundation:: HANDLE, flags : u32, srcprincipal : windows_sys::core::PCWSTR, dstprincipal : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 111:1: declaration Macro has no candidate rule
// windows_link::link!("dsparse.dll" "system" fn DsIsMangledDnA(pszdn : windows_sys::core::PCSTR, edsmanglefor : DS_MANGLE_FOR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 112:1: declaration Macro has no candidate rule
// windows_link::link!("dsparse.dll" "system" fn DsIsMangledDnW(pszdn : windows_sys::core::PCWSTR, edsmanglefor : DS_MANGLE_FOR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 113:1: declaration Macro has no candidate rule
// windows_link::link!("dsparse.dll" "system" fn DsIsMangledRdnValueA(pszrdn : windows_sys::core::PCSTR, crdn : u32, edsmanglefordesired : DS_MANGLE_FOR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 114:1: declaration Macro has no candidate rule
// windows_link::link!("dsparse.dll" "system" fn DsIsMangledRdnValueW(pszrdn : windows_sys::core::PCWSTR, crdn : u32, edsmanglefordesired : DS_MANGLE_FOR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 115:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsListDomainsInSiteA(hds : super::super::Foundation:: HANDLE, site : windows_sys::core::PCSTR, ppdomains : *mut *mut DS_NAME_RESULTA) -> u32);

// UNSUPPORTED Rust 116:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsListDomainsInSiteW(hds : super::super::Foundation:: HANDLE, site : windows_sys::core::PCWSTR, ppdomains : *mut *mut DS_NAME_RESULTW) -> u32);

// UNSUPPORTED Rust 117:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsListInfoForServerA(hds : super::super::Foundation:: HANDLE, server : windows_sys::core::PCSTR, ppinfo : *mut *mut DS_NAME_RESULTA) -> u32);

// UNSUPPORTED Rust 118:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsListInfoForServerW(hds : super::super::Foundation:: HANDLE, server : windows_sys::core::PCWSTR, ppinfo : *mut *mut DS_NAME_RESULTW) -> u32);

// UNSUPPORTED Rust 119:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsListRolesA(hds : super::super::Foundation:: HANDLE, pproles : *mut *mut DS_NAME_RESULTA) -> u32);

// UNSUPPORTED Rust 120:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsListRolesW(hds : super::super::Foundation:: HANDLE, pproles : *mut *mut DS_NAME_RESULTW) -> u32);

// UNSUPPORTED Rust 121:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsListServersForDomainInSiteA(hds : super::super::Foundation:: HANDLE, domain : windows_sys::core::PCSTR, site : windows_sys::core::PCSTR, ppservers : *mut *mut DS_NAME_RESULTA) -> u32);

// UNSUPPORTED Rust 122:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsListServersForDomainInSiteW(hds : super::super::Foundation:: HANDLE, domain : windows_sys::core::PCWSTR, site : windows_sys::core::PCWSTR, ppservers : *mut *mut DS_NAME_RESULTW) -> u32);

// UNSUPPORTED Rust 123:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsListServersInSiteA(hds : super::super::Foundation:: HANDLE, site : windows_sys::core::PCSTR, ppservers : *mut *mut DS_NAME_RESULTA) -> u32);

// UNSUPPORTED Rust 124:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsListServersInSiteW(hds : super::super::Foundation:: HANDLE, site : windows_sys::core::PCWSTR, ppservers : *mut *mut DS_NAME_RESULTW) -> u32);

// UNSUPPORTED Rust 125:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsListSitesA(hds : super::super::Foundation:: HANDLE, ppsites : *mut *mut DS_NAME_RESULTA) -> u32);

// UNSUPPORTED Rust 126:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsListSitesW(hds : super::super::Foundation:: HANDLE, ppsites : *mut *mut DS_NAME_RESULTW) -> u32);

// UNSUPPORTED Rust 127:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsMakePasswordCredentialsA(user : windows_sys::core::PCSTR, domain : windows_sys::core::PCSTR, password : windows_sys::core::PCSTR, pauthidentity : *mut *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 128:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsMakePasswordCredentialsW(user : windows_sys::core::PCWSTR, domain : windows_sys::core::PCWSTR, password : windows_sys::core::PCWSTR, pauthidentity : *mut *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 129:1: declaration Macro has no candidate rule
// windows_link::link!("dsparse.dll" "system" fn DsMakeSpnA(serviceclass : windows_sys::core::PCSTR, servicename : windows_sys::core::PCSTR, instancename : windows_sys::core::PCSTR, instanceport : u16, referrer : windows_sys::core::PCSTR, pcspnlength : *mut u32, pszspn : windows_sys::core::PSTR) -> u32);

// UNSUPPORTED Rust 130:1: declaration Macro has no candidate rule
// windows_link::link!("dsparse.dll" "system" fn DsMakeSpnW(serviceclass : windows_sys::core::PCWSTR, servicename : windows_sys::core::PCWSTR, instancename : windows_sys::core::PCWSTR, instanceport : u16, referrer : windows_sys::core::PCWSTR, pcspnlength : *mut u32, pszspn : windows_sys::core::PWSTR) -> u32);

// UNSUPPORTED Rust 131:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsMapSchemaGuidsA(hds : super::super::Foundation:: HANDLE, cguids : u32, rguids : *const windows_sys::core::GUID, ppguidmap : *mut *mut DS_SCHEMA_GUID_MAPA) -> u32);

// UNSUPPORTED Rust 132:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsMapSchemaGuidsW(hds : super::super::Foundation:: HANDLE, cguids : u32, rguids : *const windows_sys::core::GUID, ppguidmap : *mut *mut DS_SCHEMA_GUID_MAPW) -> u32);

// UNSUPPORTED Rust 133:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Authentication_Identity")]
// windows_link::link!("netapi32.dll" "system" fn DsMergeForestTrustInformationW(domainname : windows_sys::core::PCWSTR, newforesttrustinfo : *const super::super::Security::Authentication::Identity:: LSA_FOREST_TRUST_INFORMATION, oldforesttrustinfo : *const super::super::Security::Authentication::Identity:: LSA_FOREST_TRUST_INFORMATION, mergedforesttrustinfo : *mut *mut super::super::Security::Authentication::Identity:: LSA_FOREST_TRUST_INFORMATION) -> u32);

// UNSUPPORTED Rust 135:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsQuerySitesByCostA(hds : super::super::Foundation:: HANDLE, pszfromsite : windows_sys::core::PCSTR, rgsztosites : *const windows_sys::core::PCSTR, ctosites : u32, dwflags : u32, prgsiteinfo : *mut *mut DS_SITE_COST_INFO) -> u32);

// UNSUPPORTED Rust 136:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsQuerySitesByCostW(hds : super::super::Foundation:: HANDLE, pwszfromsite : windows_sys::core::PCWSTR, rgwsztosites : *const windows_sys::core::PCWSTR, ctosites : u32, dwflags : u32, prgsiteinfo : *mut *mut DS_SITE_COST_INFO) -> u32);

// UNSUPPORTED Rust 137:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsQuerySitesFree(rgsiteinfo : *const DS_SITE_COST_INFO));

// UNSUPPORTED Rust 138:1: declaration Macro has no candidate rule
// windows_link::link!("dsparse.dll" "system" fn DsQuoteRdnValueA(cunquotedrdnvaluelength : u32, psunquotedrdnvalue : windows_sys::core::PCSTR, pcquotedrdnvaluelength : *mut u32, psquotedrdnvalue : windows_sys::core::PSTR) -> u32);

// UNSUPPORTED Rust 139:1: declaration Macro has no candidate rule
// windows_link::link!("dsparse.dll" "system" fn DsQuoteRdnValueW(cunquotedrdnvaluelength : u32, psunquotedrdnvalue : windows_sys::core::PCWSTR, pcquotedrdnvaluelength : *mut u32, psquotedrdnvalue : windows_sys::core::PWSTR) -> u32);

// UNSUPPORTED Rust 140:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsRemoveDsDomainA(hds : super::super::Foundation:: HANDLE, domaindn : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 141:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsRemoveDsDomainW(hds : super::super::Foundation:: HANDLE, domaindn : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 142:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsRemoveDsServerA(hds : super::super::Foundation:: HANDLE, serverdn : windows_sys::core::PCSTR, domaindn : windows_sys::core::PCSTR, flastdcindomain : *mut windows_sys::core::BOOL, fcommit : windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 143:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsRemoveDsServerW(hds : super::super::Foundation:: HANDLE, serverdn : windows_sys::core::PCWSTR, domaindn : windows_sys::core::PCWSTR, flastdcindomain : *mut windows_sys::core::BOOL, fcommit : windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 144:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsReplicaAddA(hds : super::super::Foundation:: HANDLE, namecontext : windows_sys::core::PCSTR, sourcedsadn : windows_sys::core::PCSTR, transportdn : windows_sys::core::PCSTR, sourcedsaaddress : windows_sys::core::PCSTR, pschedule : *const SCHEDULE, options : u32) -> u32);

// UNSUPPORTED Rust 145:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsReplicaAddW(hds : super::super::Foundation:: HANDLE, namecontext : windows_sys::core::PCWSTR, sourcedsadn : windows_sys::core::PCWSTR, transportdn : windows_sys::core::PCWSTR, sourcedsaaddress : windows_sys::core::PCWSTR, pschedule : *const SCHEDULE, options : u32) -> u32);

// UNSUPPORTED Rust 146:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsReplicaConsistencyCheck(hds : super::super::Foundation:: HANDLE, taskid : DS_KCC_TASKID, dwflags : u32) -> u32);

// UNSUPPORTED Rust 147:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsReplicaDelA(hds : super::super::Foundation:: HANDLE, namecontext : windows_sys::core::PCSTR, dsasrc : windows_sys::core::PCSTR, options : u32) -> u32);

// UNSUPPORTED Rust 148:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsReplicaDelW(hds : super::super::Foundation:: HANDLE, namecontext : windows_sys::core::PCWSTR, dsasrc : windows_sys::core::PCWSTR, options : u32) -> u32);

// UNSUPPORTED Rust 149:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsReplicaFreeInfo(infotype : DS_REPL_INFO_TYPE, pinfo : *const core::ffi::c_void));

// UNSUPPORTED Rust 150:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsReplicaGetInfo2W(hds : super::super::Foundation:: HANDLE, infotype : DS_REPL_INFO_TYPE, pszobject : windows_sys::core::PCWSTR, puuidforsourcedsaobjguid : *const windows_sys::core::GUID, pszattributename : windows_sys::core::PCWSTR, pszvalue : windows_sys::core::PCWSTR, dwflags : u32, dwenumerationcontext : u32, ppinfo : *mut *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 151:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsReplicaGetInfoW(hds : super::super::Foundation:: HANDLE, infotype : DS_REPL_INFO_TYPE, pszobject : windows_sys::core::PCWSTR, puuidforsourcedsaobjguid : *const windows_sys::core::GUID, ppinfo : *mut *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 152:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsReplicaModifyA(hds : super::super::Foundation:: HANDLE, namecontext : windows_sys::core::PCSTR, puuidsourcedsa : *const windows_sys::core::GUID, transportdn : windows_sys::core::PCSTR, sourcedsaaddress : windows_sys::core::PCSTR, pschedule : *const SCHEDULE, replicaflags : u32, modifyfields : u32, options : u32) -> u32);

// UNSUPPORTED Rust 153:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsReplicaModifyW(hds : super::super::Foundation:: HANDLE, namecontext : windows_sys::core::PCWSTR, puuidsourcedsa : *const windows_sys::core::GUID, transportdn : windows_sys::core::PCWSTR, sourcedsaaddress : windows_sys::core::PCWSTR, pschedule : *const SCHEDULE, replicaflags : u32, modifyfields : u32, options : u32) -> u32);

// UNSUPPORTED Rust 154:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsReplicaSyncA(hds : super::super::Foundation:: HANDLE, namecontext : windows_sys::core::PCSTR, puuiddsasrc : *const windows_sys::core::GUID, options : u32) -> u32);

// UNSUPPORTED Rust 155:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsReplicaSyncAllA(hds : super::super::Foundation:: HANDLE, psznamecontext : windows_sys::core::PCSTR, ulflags : u32, pfncallback : isize, pcallbackdata : *const core::ffi::c_void, perrors : *mut *mut *mut DS_REPSYNCALL_ERRINFOA) -> u32);

// UNSUPPORTED Rust 156:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsReplicaSyncAllW(hds : super::super::Foundation:: HANDLE, psznamecontext : windows_sys::core::PCWSTR, ulflags : u32, pfncallback : isize, pcallbackdata : *const core::ffi::c_void, perrors : *mut *mut *mut DS_REPSYNCALL_ERRINFOW) -> u32);

// UNSUPPORTED Rust 157:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsReplicaSyncW(hds : super::super::Foundation:: HANDLE, namecontext : windows_sys::core::PCWSTR, puuiddsasrc : *const windows_sys::core::GUID, options : u32) -> u32);

// UNSUPPORTED Rust 158:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsReplicaUpdateRefsA(hds : super::super::Foundation:: HANDLE, namecontext : windows_sys::core::PCSTR, dsadest : windows_sys::core::PCSTR, puuiddsadest : *const windows_sys::core::GUID, options : u32) -> u32);

// UNSUPPORTED Rust 159:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsReplicaUpdateRefsW(hds : super::super::Foundation:: HANDLE, namecontext : windows_sys::core::PCWSTR, dsadest : windows_sys::core::PCWSTR, puuiddsadest : *const windows_sys::core::GUID, options : u32) -> u32);

// UNSUPPORTED Rust 160:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsReplicaVerifyObjectsA(hds : super::super::Foundation:: HANDLE, namecontext : windows_sys::core::PCSTR, puuiddsasrc : *const windows_sys::core::GUID, uloptions : u32) -> u32);

// UNSUPPORTED Rust 161:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsReplicaVerifyObjectsW(hds : super::super::Foundation:: HANDLE, namecontext : windows_sys::core::PCWSTR, puuiddsasrc : *const windows_sys::core::GUID, uloptions : u32) -> u32);

// UNSUPPORTED Rust 162:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn DsRoleFreeMemory(buffer : *mut core::ffi::c_void));

// UNSUPPORTED Rust 163:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn DsRoleGetPrimaryDomainInformation(lpserver : windows_sys::core::PCWSTR, infolevel : DSROLE_PRIMARY_DOMAIN_INFO_LEVEL, buffer : *mut *mut u8) -> u32);

// UNSUPPORTED Rust 164:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsServerRegisterSpnA(operation : DS_SPN_WRITE_OP, serviceclass : windows_sys::core::PCSTR, userobjectdn : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 165:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsServerRegisterSpnW(operation : DS_SPN_WRITE_OP, serviceclass : windows_sys::core::PCWSTR, userobjectdn : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 166:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsUnBindA(phds : *const super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 167:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsUnBindW(phds : *const super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 168:1: declaration Macro has no candidate rule
// windows_link::link!("dsparse.dll" "system" fn DsUnquoteRdnValueA(cquotedrdnvaluelength : u32, psquotedrdnvalue : windows_sys::core::PCSTR, pcunquotedrdnvaluelength : *mut u32, psunquotedrdnvalue : windows_sys::core::PSTR) -> u32);

// UNSUPPORTED Rust 169:1: declaration Macro has no candidate rule
// windows_link::link!("dsparse.dll" "system" fn DsUnquoteRdnValueW(cquotedrdnvaluelength : u32, psquotedrdnvalue : windows_sys::core::PCWSTR, pcunquotedrdnvaluelength : *mut u32, psunquotedrdnvalue : windows_sys::core::PWSTR) -> u32);

// UNSUPPORTED Rust 170:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn DsValidateSubnetNameA(subnetname : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 171:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn DsValidateSubnetNameW(subnetname : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 172:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsWriteAccountSpnA(hds : super::super::Foundation:: HANDLE, operation : DS_SPN_WRITE_OP, pszaccount : windows_sys::core::PCSTR, cspn : u32, rpszspn : *const windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 173:1: declaration Macro has no candidate rule
// windows_link::link!("ntdsapi.dll" "system" fn DsWriteAccountSpnW(hds : super::super::Foundation:: HANDLE, operation : DS_SPN_WRITE_OP, pszaccount : windows_sys::core::PCWSTR, cspn : u32, rpszspn : *const windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 174:1: declaration Macro has no candidate rule
// windows_link::link!("activeds.dll" "system" fn FreeADsMem(pmem : *mut core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 175:1: declaration Macro has no candidate rule
// windows_link::link!("activeds.dll" "system" fn FreeADsStr(pstr : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 176:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
// windows_link::link!("activeds.dll" "system" fn PropVariantToAdsType(pvariant : *mut super::super::System::Variant:: VARIANT, dwnumvariant : u32, ppadsvalues : *mut *mut ADSVALUE, pdwnumvalues : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 178:1: declaration Macro has no candidate rule
// windows_link::link!("activeds.dll" "system" fn ReallocADsMem(poldmem : *mut core::ffi::c_void, cbold : u32, cbnew : u32) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 179:1: declaration Macro has no candidate rule
// windows_link::link!("activeds.dll" "system" fn ReallocADsStr(ppstr : *mut windows_sys::core::PWSTR, pstr : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 180:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_Security", feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
// windows_link::link!("activeds.dll" "system" fn SecurityDescriptorToBinarySD(vvarsecdes : super::super::System::Variant:: VARIANT, ppsecuritydescriptor : *mut super::super::Security:: PSECURITY_DESCRIPTOR, pdwsdlength : *mut u32, pszservername : windows_sys::core::PCWSTR, username : windows_sys::core::PCWSTR, password : windows_sys::core::PCWSTR, dwflags : u32) -> windows_sys::core::HRESULT);

public const val `ACTRL_DS_CONTROL_ACCESS`: UInt = 256u;
public const val `ACTRL_DS_CREATE_CHILD`: UInt = 1u;
public const val `ACTRL_DS_DELETE_CHILD`: UInt = 2u;
public const val `ACTRL_DS_DELETE_TREE`: UInt = 64u;
public const val `ACTRL_DS_LIST`: UInt = 4u;
public const val `ACTRL_DS_LIST_OBJECT`: UInt = 128u;
public const val `ACTRL_DS_OPEN`: UInt = 0u;
public const val `ACTRL_DS_READ_PROP`: UInt = 16u;
public const val `ACTRL_DS_SELF`: UInt = 8u;
public const val `ACTRL_DS_WRITE_PROP`: UInt = 32u;
public const val `ADAM_REPL_AUTHENTICATION_MODE_MUTUAL_AUTH_REQUIRED`: UInt = 2u;
public const val `ADAM_REPL_AUTHENTICATION_MODE_NEGOTIATE`: UInt = 1u;
public const val `ADAM_REPL_AUTHENTICATION_MODE_NEGOTIATE_PASS_THROUGH`: UInt = 0u;
// UNSUPPORTED Rust 195:1: non-scalar type Ptr unsupported
// pub const ADAM_SCP_FSMO_NAMING_STRING: windows_sys::core::PCSTR = windows_sys::core::s!("naming");

// UNSUPPORTED Rust 196:1: non-scalar type Ptr unsupported
// pub const ADAM_SCP_FSMO_NAMING_STRING_W: windows_sys::core::PCWSTR = windows_sys::core::w!("naming");

// UNSUPPORTED Rust 197:1: non-scalar type Ptr unsupported
// pub const ADAM_SCP_FSMO_SCHEMA_STRING: windows_sys::core::PCSTR = windows_sys::core::s!("schema");

// UNSUPPORTED Rust 198:1: non-scalar type Ptr unsupported
// pub const ADAM_SCP_FSMO_SCHEMA_STRING_W: windows_sys::core::PCWSTR = windows_sys::core::w!("schema");

// UNSUPPORTED Rust 199:1: non-scalar type Ptr unsupported
// pub const ADAM_SCP_FSMO_STRING: windows_sys::core::PCSTR = windows_sys::core::s!("fsmo:");

// UNSUPPORTED Rust 200:1: non-scalar type Ptr unsupported
// pub const ADAM_SCP_FSMO_STRING_W: windows_sys::core::PCWSTR = windows_sys::core::w!("fsmo:");

// UNSUPPORTED Rust 201:1: non-scalar type Ptr unsupported
// pub const ADAM_SCP_INSTANCE_NAME_STRING: windows_sys::core::PCSTR = windows_sys::core::s!("instance:");

// UNSUPPORTED Rust 202:1: non-scalar type Ptr unsupported
// pub const ADAM_SCP_INSTANCE_NAME_STRING_W: windows_sys::core::PCWSTR = windows_sys::core::w!("instance:");

// UNSUPPORTED Rust 203:1: non-scalar type Ptr unsupported
// pub const ADAM_SCP_PARTITION_STRING: windows_sys::core::PCSTR = windows_sys::core::s!("partition:");

// UNSUPPORTED Rust 204:1: non-scalar type Ptr unsupported
// pub const ADAM_SCP_PARTITION_STRING_W: windows_sys::core::PCWSTR = windows_sys::core::w!("partition:");

// UNSUPPORTED Rust 205:1: non-scalar type Ptr unsupported
// pub const ADAM_SCP_SITE_NAME_STRING: windows_sys::core::PCSTR = windows_sys::core::s!("site:");

// UNSUPPORTED Rust 206:1: non-scalar type Ptr unsupported
// pub const ADAM_SCP_SITE_NAME_STRING_W: windows_sys::core::PCWSTR = windows_sys::core::w!("site:");

public const val `ADSIPROP_ADSIFLAG`: `ADS_PREFERENCES_ENUM` = 12;
public const val `ADSIPROP_ASYNCHRONOUS`: `ADS_PREFERENCES_ENUM` = 0;
public const val `ADSIPROP_ATTRIBTYPES_ONLY`: `ADS_PREFERENCES_ENUM` = 4;
public const val `ADSIPROP_CACHE_RESULTS`: `ADS_PREFERENCES_ENUM` = 11;
public const val `ADSIPROP_CHASE_REFERRALS`: `ADS_PREFERENCES_ENUM` = 9;
public const val `ADSIPROP_DEREF_ALIASES`: `ADS_PREFERENCES_ENUM` = 1;
public const val `ADSIPROP_PAGED_TIME_LIMIT`: `ADS_PREFERENCES_ENUM` = 8;
public const val `ADSIPROP_PAGESIZE`: `ADS_PREFERENCES_ENUM` = 7;
public const val `ADSIPROP_SEARCH_SCOPE`: `ADS_PREFERENCES_ENUM` = 5;
public const val `ADSIPROP_SIZE_LIMIT`: `ADS_PREFERENCES_ENUM` = 2;
public const val `ADSIPROP_SORT_ON`: `ADS_PREFERENCES_ENUM` = 10;
public const val `ADSIPROP_TIMEOUT`: `ADS_PREFERENCES_ENUM` = 6;
public const val `ADSIPROP_TIME_LIMIT`: `ADS_PREFERENCES_ENUM` = 3;
public typealias `ADSI_DIALECT_ENUM` = Int;
public const val `ADSI_DIALECT_LDAP`: `ADSI_DIALECT_ENUM` = 0;
public const val `ADSI_DIALECT_SQL`: `ADSI_DIALECT_ENUM` = 1;
// UNSUPPORTED Rust 223:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ADSPROPERROR {
//     pub hwndPage: super::super::Foundation::HWND,
//     pub pszPageTitle: windows_sys::core::PWSTR,
//     pub pszObjPath: windows_sys::core::PWSTR,
//     pub pszObjClass: windows_sys::core::PWSTR,
//     pub hr: windows_sys::core::HRESULT,
//     pub pszError: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 233:1: declaration Impl has no candidate rule
// impl Default for ADSPROPERROR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 238:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ADSPROPINITPARAMS {
//     pub dwSize: u32,
//     pub dwFlags: u32,
//     pub hr: windows_sys::core::HRESULT,
//     pub pDsObj: *mut core::ffi::c_void,
//     pub pwzCN: windows_sys::core::PWSTR,
//     pub pWritableAttrs: *mut ADS_ATTR_INFO,
// }

// UNSUPPORTED Rust 248:1: declaration Impl has no candidate rule
// impl Default for ADSPROPINITPARAMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `ADSTYPE` = Int;
public const val `ADSTYPE_BACKLINK`: `ADSTYPE` = 18;
public const val `ADSTYPE_BOOLEAN`: `ADSTYPE` = 6;
public const val `ADSTYPE_CASEIGNORE_LIST`: `ADSTYPE` = 13;
public const val `ADSTYPE_CASE_EXACT_STRING`: `ADSTYPE` = 2;
public const val `ADSTYPE_CASE_IGNORE_STRING`: `ADSTYPE` = 3;
public const val `ADSTYPE_DN_STRING`: `ADSTYPE` = 1;
public const val `ADSTYPE_DN_WITH_BINARY`: `ADSTYPE` = 27;
public const val `ADSTYPE_DN_WITH_STRING`: `ADSTYPE` = 28;
public const val `ADSTYPE_EMAIL`: `ADSTYPE` = 24;
public const val `ADSTYPE_FAXNUMBER`: `ADSTYPE` = 23;
public const val `ADSTYPE_HOLD`: `ADSTYPE` = 20;
public const val `ADSTYPE_INTEGER`: `ADSTYPE` = 7;
public const val `ADSTYPE_INVALID`: `ADSTYPE` = 0;
public const val `ADSTYPE_LARGE_INTEGER`: `ADSTYPE` = 10;
public const val `ADSTYPE_NETADDRESS`: `ADSTYPE` = 21;
public const val `ADSTYPE_NT_SECURITY_DESCRIPTOR`: `ADSTYPE` = 25;
public const val `ADSTYPE_NUMERIC_STRING`: `ADSTYPE` = 5;
public const val `ADSTYPE_OBJECT_CLASS`: `ADSTYPE` = 12;
public const val `ADSTYPE_OCTET_LIST`: `ADSTYPE` = 14;
public const val `ADSTYPE_OCTET_STRING`: `ADSTYPE` = 8;
public const val `ADSTYPE_PATH`: `ADSTYPE` = 15;
public const val `ADSTYPE_POSTALADDRESS`: `ADSTYPE` = 16;
public const val `ADSTYPE_PRINTABLE_STRING`: `ADSTYPE` = 4;
public const val `ADSTYPE_PROV_SPECIFIC`: `ADSTYPE` = 11;
public const val `ADSTYPE_REPLICAPOINTER`: `ADSTYPE` = 22;
public const val `ADSTYPE_TIMESTAMP`: `ADSTYPE` = 17;
public const val `ADSTYPE_TYPEDNAME`: `ADSTYPE` = 19;
public const val `ADSTYPE_UNKNOWN`: `ADSTYPE` = 26;
public const val `ADSTYPE_UTC_TIME`: `ADSTYPE` = 9;
// UNSUPPORTED Rust 283:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ADSVALUE {
//     pub dwType: ADSTYPE,
//     pub Anonymous: ADSVALUE_0,
// }

// UNSUPPORTED Rust 289:1: declaration Impl has no candidate rule
// impl Default for ADSVALUE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 294:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union ADSVALUE_0 {
//     pub DNString: *mut u16,
//     pub CaseExactString: *mut u16,
//     pub CaseIgnoreString: *mut u16,
//     pub PrintableString: *mut u16,
//     pub NumericString: *mut u16,
//     pub Boolean: u32,
//     pub Integer: u32,
//     pub OctetString: ADS_OCTET_STRING,
//     pub UTCTime: super::super::Foundation::SYSTEMTIME,
//     pub LargeInteger: i64,
//     pub ClassName: *mut u16,
//     pub ProviderSpecific: ADS_PROV_SPECIFIC,
//     pub pCaseIgnoreList: *mut ADS_CASEIGNORE_LIST,
//     pub pOctetList: *mut ADS_OCTET_LIST,
//     pub pPath: *mut ADS_PATH,
//     pub pPostalAddress: *mut ADS_POSTALADDRESS,
//     pub Timestamp: ADS_TIMESTAMP,
//     pub BackLink: ADS_BACKLINK,
//     pub pTypedName: *mut ADS_TYPEDNAME,
//     pub Hold: ADS_HOLD,
//     pub pNetAddress: *mut ADS_NETADDRESS,
//     pub pReplicaPointer: *mut ADS_REPLICAPOINTER,
//     pub pFaxNumber: *mut ADS_FAXNUMBER,
//     pub Email: ADS_EMAIL,
//     pub SecurityDescriptor: ADS_NT_SECURITY_DESCRIPTOR,
//     pub pDNWithBinary: *mut ADS_DN_WITH_BINARY,
//     pub pDNWithString: *mut ADS_DN_WITH_STRING,
// }

// UNSUPPORTED Rust 325:1: declaration Impl has no candidate rule
// impl Default for ADSVALUE_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `ADS_ACEFLAG_ENUM` = Int;
public const val `ADS_ACEFLAG_FAILED_ACCESS`: `ADS_ACEFLAG_ENUM` = 128;
public const val `ADS_ACEFLAG_INHERITED_ACE`: `ADS_ACEFLAG_ENUM` = 16;
public const val `ADS_ACEFLAG_INHERIT_ACE`: `ADS_ACEFLAG_ENUM` = 2;
public const val `ADS_ACEFLAG_INHERIT_ONLY_ACE`: `ADS_ACEFLAG_ENUM` = 8;
public const val `ADS_ACEFLAG_NO_PROPAGATE_INHERIT_ACE`: `ADS_ACEFLAG_ENUM` = 4;
public const val `ADS_ACEFLAG_SUCCESSFUL_ACCESS`: `ADS_ACEFLAG_ENUM` = 64;
public const val `ADS_ACEFLAG_VALID_INHERIT_FLAGS`: `ADS_ACEFLAG_ENUM` = 31;
public const val `ADS_ACETYPE_ACCESS_ALLOWED`: `ADS_ACETYPE_ENUM` = 0;
public const val `ADS_ACETYPE_ACCESS_ALLOWED_CALLBACK`: `ADS_ACETYPE_ENUM` = 9;
public const val `ADS_ACETYPE_ACCESS_ALLOWED_CALLBACK_OBJECT`: `ADS_ACETYPE_ENUM` = 11;
public const val `ADS_ACETYPE_ACCESS_ALLOWED_OBJECT`: `ADS_ACETYPE_ENUM` = 5;
public const val `ADS_ACETYPE_ACCESS_DENIED`: `ADS_ACETYPE_ENUM` = 1;
public const val `ADS_ACETYPE_ACCESS_DENIED_CALLBACK`: `ADS_ACETYPE_ENUM` = 10;
public const val `ADS_ACETYPE_ACCESS_DENIED_CALLBACK_OBJECT`: `ADS_ACETYPE_ENUM` = 12;
public const val `ADS_ACETYPE_ACCESS_DENIED_OBJECT`: `ADS_ACETYPE_ENUM` = 6;
public typealias `ADS_ACETYPE_ENUM` = Int;
public const val `ADS_ACETYPE_SYSTEM_ALARM_CALLBACK`: `ADS_ACETYPE_ENUM` = 14;
public const val `ADS_ACETYPE_SYSTEM_ALARM_CALLBACK_OBJECT`: `ADS_ACETYPE_ENUM` = 16;
public const val `ADS_ACETYPE_SYSTEM_ALARM_OBJECT`: `ADS_ACETYPE_ENUM` = 8;
public const val `ADS_ACETYPE_SYSTEM_AUDIT`: `ADS_ACETYPE_ENUM` = 2;
public const val `ADS_ACETYPE_SYSTEM_AUDIT_CALLBACK`: `ADS_ACETYPE_ENUM` = 13;
public const val `ADS_ACETYPE_SYSTEM_AUDIT_CALLBACK_OBJECT`: `ADS_ACETYPE_ENUM` = 15;
public const val `ADS_ACETYPE_SYSTEM_AUDIT_OBJECT`: `ADS_ACETYPE_ENUM` = 7;
public const val `ADS_ATTR_APPEND`: UInt = 3u;
public const val `ADS_ATTR_CLEAR`: UInt = 1u;
// UNSUPPORTED Rust 356:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ADS_ATTR_DEF {
//     pub pszAttrName: windows_sys::core::PWSTR,
//     pub dwADsType: ADSTYPE,
//     pub dwMinRange: u32,
//     pub dwMaxRange: u32,
//     pub fMultiValued: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 365:1: declaration Impl has no candidate rule
// impl Default for ADS_ATTR_DEF {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ADS_ATTR_DELETE`: UInt = 4u;
// UNSUPPORTED Rust 371:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ADS_ATTR_INFO {
//     pub pszAttrName: windows_sys::core::PWSTR,
//     pub dwControlCode: u32,
//     pub dwADsType: ADSTYPE,
//     pub pADsValues: *mut ADSVALUE,
//     pub dwNumValues: u32,
// }

// UNSUPPORTED Rust 380:1: declaration Impl has no candidate rule
// impl Default for ADS_ATTR_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ADS_ATTR_UPDATE`: UInt = 2u;
public typealias `ADS_AUTHENTICATION_ENUM` = UInt;
public const val `ADS_AUTH_RESERVED`: `ADS_AUTHENTICATION_ENUM` = 2147483648u;
// UNSUPPORTED Rust 388:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ADS_BACKLINK {
//     pub RemoteID: u32,
//     pub ObjectName: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 394:1: declaration Impl has no candidate rule
// impl Default for ADS_BACKLINK {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 399:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ADS_CASEIGNORE_LIST {
//     pub Next: *mut ADS_CASEIGNORE_LIST,
//     pub String: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 405:1: declaration Impl has no candidate rule
// impl Default for ADS_CASEIGNORE_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ADS_CHASE_REFERRALS_ALWAYS`: `ADS_CHASE_REFERRALS_ENUM` = 96;
public typealias `ADS_CHASE_REFERRALS_ENUM` = Int;
public const val `ADS_CHASE_REFERRALS_EXTERNAL`: `ADS_CHASE_REFERRALS_ENUM` = 64;
public const val `ADS_CHASE_REFERRALS_NEVER`: `ADS_CHASE_REFERRALS_ENUM` = 0;
public const val `ADS_CHASE_REFERRALS_SUBORDINATE`: `ADS_CHASE_REFERRALS_ENUM` = 32;
// UNSUPPORTED Rust 415:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ADS_CLASS_DEF {
//     pub pszClassName: windows_sys::core::PWSTR,
//     pub dwMandatoryAttrs: u32,
//     pub ppszMandatoryAttrs: *mut windows_sys::core::PWSTR,
//     pub optionalAttrs: u32,
//     pub ppszOptionalAttrs: *mut *mut windows_sys::core::PWSTR,
//     pub dwNamingAttrs: u32,
//     pub ppszNamingAttrs: *mut *mut windows_sys::core::PWSTR,
//     pub dwSuperClasses: u32,
//     pub ppszSuperClasses: *mut *mut windows_sys::core::PWSTR,
//     pub fIsContainer: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 429:1: declaration Impl has no candidate rule
// impl Default for ADS_CLASS_DEF {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `ADS_DEREFENUM` = Int;
public const val `ADS_DEREF_ALWAYS`: `ADS_DEREFENUM` = 3;
public const val `ADS_DEREF_FINDING`: `ADS_DEREFENUM` = 2;
public const val `ADS_DEREF_NEVER`: `ADS_DEREFENUM` = 0;
public const val `ADS_DEREF_SEARCHING`: `ADS_DEREFENUM` = 1;
public typealias `ADS_DISPLAY_ENUM` = Int;
public const val `ADS_DISPLAY_FULL`: `ADS_DISPLAY_ENUM` = 1;
public const val `ADS_DISPLAY_VALUE_ONLY`: `ADS_DISPLAY_ENUM` = 2;
// UNSUPPORTED Rust 442:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ADS_DN_WITH_BINARY {
//     pub dwLength: u32,
//     pub lpBinaryValue: *mut u8,
//     pub pszDNString: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 449:1: declaration Impl has no candidate rule
// impl Default for ADS_DN_WITH_BINARY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 454:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ADS_DN_WITH_STRING {
//     pub pszStringValue: windows_sys::core::PWSTR,
//     pub pszDNString: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 460:1: declaration Impl has no candidate rule
// impl Default for ADS_DN_WITH_STRING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 465:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ADS_EMAIL {
//     pub Address: windows_sys::core::PWSTR,
//     pub Type: u32,
// }

// UNSUPPORTED Rust 471:1: declaration Impl has no candidate rule
// impl Default for ADS_EMAIL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ADS_ESCAPEDMODE_DEFAULT`: `ADS_ESCAPE_MODE_ENUM` = 1;
public const val `ADS_ESCAPEDMODE_OFF`: `ADS_ESCAPE_MODE_ENUM` = 3;
public const val `ADS_ESCAPEDMODE_OFF_EX`: `ADS_ESCAPE_MODE_ENUM` = 4;
public const val `ADS_ESCAPEDMODE_ON`: `ADS_ESCAPE_MODE_ENUM` = 2;
public typealias `ADS_ESCAPE_MODE_ENUM` = Int;
public const val `ADS_EXT_INITCREDENTIALS`: UInt = 1u;
public const val `ADS_EXT_INITIALIZE_COMPLETE`: UInt = 2u;
public const val `ADS_EXT_MAXEXTDISPID`: UInt = 16777215u;
public const val `ADS_EXT_MINEXTDISPID`: UInt = 1u;
public const val `ADS_FAST_BIND`: `ADS_AUTHENTICATION_ENUM` = 32u;
// UNSUPPORTED Rust 486:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ADS_FAXNUMBER {
//     pub TelephoneNumber: windows_sys::core::PWSTR,
//     pub NumberOfBits: u32,
//     pub Parameters: *mut u8,
// }

// UNSUPPORTED Rust 493:1: declaration Impl has no candidate rule
// impl Default for ADS_FAXNUMBER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `ADS_FLAGTYPE_ENUM` = Int;
public const val `ADS_FLAG_INHERITED_OBJECT_TYPE_PRESENT`: `ADS_FLAGTYPE_ENUM` = 2;
public const val `ADS_FLAG_OBJECT_TYPE_PRESENT`: `ADS_FLAGTYPE_ENUM` = 1;
public typealias `ADS_FORMAT_ENUM` = Int;
public const val `ADS_FORMAT_LEAF`: `ADS_FORMAT_ENUM` = 11;
public const val `ADS_FORMAT_PROVIDER`: `ADS_FORMAT_ENUM` = 10;
public const val `ADS_FORMAT_SERVER`: `ADS_FORMAT_ENUM` = 9;
public const val `ADS_FORMAT_WINDOWS`: `ADS_FORMAT_ENUM` = 1;
public const val `ADS_FORMAT_WINDOWS_DN`: `ADS_FORMAT_ENUM` = 3;
public const val `ADS_FORMAT_WINDOWS_NO_SERVER`: `ADS_FORMAT_ENUM` = 2;
public const val `ADS_FORMAT_WINDOWS_PARENT`: `ADS_FORMAT_ENUM` = 4;
public const val `ADS_FORMAT_X500`: `ADS_FORMAT_ENUM` = 5;
public const val `ADS_FORMAT_X500_DN`: `ADS_FORMAT_ENUM` = 7;
public const val `ADS_FORMAT_X500_NO_SERVER`: `ADS_FORMAT_ENUM` = 6;
public const val `ADS_FORMAT_X500_PARENT`: `ADS_FORMAT_ENUM` = 8;
public const val `ADS_GROUP_TYPE_DOMAIN_LOCAL_GROUP`: `ADS_GROUP_TYPE_ENUM` = 4;
public typealias `ADS_GROUP_TYPE_ENUM` = Int;
public const val `ADS_GROUP_TYPE_GLOBAL_GROUP`: `ADS_GROUP_TYPE_ENUM` = 2;
public const val `ADS_GROUP_TYPE_LOCAL_GROUP`: `ADS_GROUP_TYPE_ENUM` = 4;
public const val `ADS_GROUP_TYPE_SECURITY_ENABLED`: `ADS_GROUP_TYPE_ENUM` = -2147483648;
public const val `ADS_GROUP_TYPE_UNIVERSAL_GROUP`: `ADS_GROUP_TYPE_ENUM` = 8;
// UNSUPPORTED Rust 519:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ADS_HOLD {
//     pub ObjectName: windows_sys::core::PWSTR,
//     pub Amount: u32,
// }

// UNSUPPORTED Rust 525:1: declaration Impl has no candidate rule
// impl Default for ADS_HOLD {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ADS_NAME_INITTYPE_DOMAIN`: `ADS_NAME_INITTYPE_ENUM` = 1;
public typealias `ADS_NAME_INITTYPE_ENUM` = Int;
public const val `ADS_NAME_INITTYPE_GC`: `ADS_NAME_INITTYPE_ENUM` = 3;
public const val `ADS_NAME_INITTYPE_SERVER`: `ADS_NAME_INITTYPE_ENUM` = 2;
public const val `ADS_NAME_TYPE_1779`: `ADS_NAME_TYPE_ENUM` = 1;
public const val `ADS_NAME_TYPE_CANONICAL`: `ADS_NAME_TYPE_ENUM` = 2;
public const val `ADS_NAME_TYPE_CANONICAL_EX`: `ADS_NAME_TYPE_ENUM` = 10;
public const val `ADS_NAME_TYPE_DISPLAY`: `ADS_NAME_TYPE_ENUM` = 4;
public const val `ADS_NAME_TYPE_DOMAIN_SIMPLE`: `ADS_NAME_TYPE_ENUM` = 5;
public const val `ADS_NAME_TYPE_ENTERPRISE_SIMPLE`: `ADS_NAME_TYPE_ENUM` = 6;
public typealias `ADS_NAME_TYPE_ENUM` = Int;
public const val `ADS_NAME_TYPE_GUID`: `ADS_NAME_TYPE_ENUM` = 7;
public const val `ADS_NAME_TYPE_NT4`: `ADS_NAME_TYPE_ENUM` = 3;
public const val `ADS_NAME_TYPE_SERVICE_PRINCIPAL_NAME`: `ADS_NAME_TYPE_ENUM` = 11;
public const val `ADS_NAME_TYPE_SID_OR_SID_HISTORY_NAME`: `ADS_NAME_TYPE_ENUM` = 12;
public const val `ADS_NAME_TYPE_UNKNOWN`: `ADS_NAME_TYPE_ENUM` = 8;
public const val `ADS_NAME_TYPE_USER_PRINCIPAL_NAME`: `ADS_NAME_TYPE_ENUM` = 9;
// UNSUPPORTED Rust 547:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ADS_NETADDRESS {
//     pub AddressType: u32,
//     pub AddressLength: u32,
//     pub Address: *mut u8,
// }

// UNSUPPORTED Rust 554:1: declaration Impl has no candidate rule
// impl Default for ADS_NETADDRESS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ADS_NO_AUTHENTICATION`: `ADS_AUTHENTICATION_ENUM` = 16u;
public const val `ADS_NO_REFERRAL_CHASING`: `ADS_AUTHENTICATION_ENUM` = 1024u;
// UNSUPPORTED Rust 561:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ADS_NT_SECURITY_DESCRIPTOR {
//     pub dwLength: u32,
//     pub lpValue: *mut u8,
// }

// UNSUPPORTED Rust 567:1: declaration Impl has no candidate rule
// impl Default for ADS_NT_SECURITY_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 572:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ADS_OBJECT_INFO {
//     pub pszRDN: windows_sys::core::PWSTR,
//     pub pszObjectDN: windows_sys::core::PWSTR,
//     pub pszParentDN: windows_sys::core::PWSTR,
//     pub pszSchemaDN: windows_sys::core::PWSTR,
//     pub pszClassName: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 581:1: declaration Impl has no candidate rule
// impl Default for ADS_OBJECT_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 586:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ADS_OCTET_LIST {
//     pub Next: *mut ADS_OCTET_LIST,
//     pub Length: u32,
//     pub Data: *mut u8,
// }

// UNSUPPORTED Rust 593:1: declaration Impl has no candidate rule
// impl Default for ADS_OCTET_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 598:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ADS_OCTET_STRING {
//     pub dwLength: u32,
//     pub lpValue: *mut u8,
// }

// UNSUPPORTED Rust 604:1: declaration Impl has no candidate rule
// impl Default for ADS_OCTET_STRING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ADS_OPTION_ACCUMULATIVE_MODIFICATION`: `ADS_OPTION_ENUM` = 8;
public typealias `ADS_OPTION_ENUM` = Int;
public const val `ADS_OPTION_MUTUAL_AUTH_STATUS`: `ADS_OPTION_ENUM` = 4;
public const val `ADS_OPTION_PAGE_SIZE`: `ADS_OPTION_ENUM` = 2;
public const val `ADS_OPTION_PASSWORD_METHOD`: `ADS_OPTION_ENUM` = 7;
public const val `ADS_OPTION_PASSWORD_PORTNUMBER`: `ADS_OPTION_ENUM` = 6;
public const val `ADS_OPTION_QUOTA`: `ADS_OPTION_ENUM` = 5;
public const val `ADS_OPTION_REFERRALS`: `ADS_OPTION_ENUM` = 1;
public const val `ADS_OPTION_SECURITY_MASK`: `ADS_OPTION_ENUM` = 3;
public const val `ADS_OPTION_SERVERNAME`: `ADS_OPTION_ENUM` = 0;
public const val `ADS_OPTION_SKIP_SID_LOOKUP`: `ADS_OPTION_ENUM` = 9;
public const val `ADS_PASSWORD_ENCODE_CLEAR`: `ADS_PASSWORD_ENCODING_ENUM` = 1;
public const val `ADS_PASSWORD_ENCODE_REQUIRE_SSL`: `ADS_PASSWORD_ENCODING_ENUM` = 0;
public typealias `ADS_PASSWORD_ENCODING_ENUM` = Int;
// UNSUPPORTED Rust 623:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ADS_PATH {
//     pub Type: u32,
//     pub VolumeName: windows_sys::core::PWSTR,
//     pub Path: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 630:1: declaration Impl has no candidate rule
// impl Default for ADS_PATH {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `ADS_PATHTYPE_ENUM` = Int;
public const val `ADS_PATH_FILE`: `ADS_PATHTYPE_ENUM` = 1;
public const val `ADS_PATH_FILESHARE`: `ADS_PATHTYPE_ENUM` = 2;
public const val `ADS_PATH_REGISTRY`: `ADS_PATHTYPE_ENUM` = 3;
// UNSUPPORTED Rust 639:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ADS_POSTALADDRESS {
//     pub PostalAddress: [windows_sys::core::PWSTR; 6],
// }

// UNSUPPORTED Rust 644:1: declaration Impl has no candidate rule
// impl Default for ADS_POSTALADDRESS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `ADS_PREFERENCES_ENUM` = Int;
public const val `ADS_PROMPT_CREDENTIALS`: `ADS_AUTHENTICATION_ENUM` = 8u;
public const val `ADS_PROPERTY_APPEND`: `ADS_PROPERTY_OPERATION_ENUM` = 3;
public const val `ADS_PROPERTY_CLEAR`: `ADS_PROPERTY_OPERATION_ENUM` = 1;
public const val `ADS_PROPERTY_DELETE`: `ADS_PROPERTY_OPERATION_ENUM` = 4;
public typealias `ADS_PROPERTY_OPERATION_ENUM` = Int;
public const val `ADS_PROPERTY_UPDATE`: `ADS_PROPERTY_OPERATION_ENUM` = 2;
// UNSUPPORTED Rust 656:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ADS_PROV_SPECIFIC {
//     pub dwLength: u32,
//     pub lpValue: *mut u8,
// }

// UNSUPPORTED Rust 662:1: declaration Impl has no candidate rule
// impl Default for ADS_PROV_SPECIFIC {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ADS_READONLY_SERVER`: `ADS_AUTHENTICATION_ENUM` = 4u;
// UNSUPPORTED Rust 668:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ADS_REPLICAPOINTER {
//     pub ServerName: windows_sys::core::PWSTR,
//     pub ReplicaType: u32,
//     pub ReplicaNumber: u32,
//     pub Count: u32,
//     pub ReplicaAddressHints: *mut ADS_NETADDRESS,
// }

// UNSUPPORTED Rust 677:1: declaration Impl has no candidate rule
// impl Default for ADS_REPLICAPOINTER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `ADS_RIGHTS_ENUM` = Int;
public const val `ADS_RIGHT_ACCESS_SYSTEM_SECURITY`: `ADS_RIGHTS_ENUM` = 16777216;
public const val `ADS_RIGHT_ACTRL_DS_LIST`: `ADS_RIGHTS_ENUM` = 4;
public const val `ADS_RIGHT_DELETE`: `ADS_RIGHTS_ENUM` = 65536;
public const val `ADS_RIGHT_DS_CONTROL_ACCESS`: `ADS_RIGHTS_ENUM` = 256;
public const val `ADS_RIGHT_DS_CREATE_CHILD`: `ADS_RIGHTS_ENUM` = 1;
public const val `ADS_RIGHT_DS_DELETE_CHILD`: `ADS_RIGHTS_ENUM` = 2;
public const val `ADS_RIGHT_DS_DELETE_TREE`: `ADS_RIGHTS_ENUM` = 64;
public const val `ADS_RIGHT_DS_LIST_OBJECT`: `ADS_RIGHTS_ENUM` = 128;
public const val `ADS_RIGHT_DS_READ_PROP`: `ADS_RIGHTS_ENUM` = 16;
public const val `ADS_RIGHT_DS_SELF`: `ADS_RIGHTS_ENUM` = 8;
public const val `ADS_RIGHT_DS_WRITE_PROP`: `ADS_RIGHTS_ENUM` = 32;
public const val `ADS_RIGHT_GENERIC_ALL`: `ADS_RIGHTS_ENUM` = 268435456;
public const val `ADS_RIGHT_GENERIC_EXECUTE`: `ADS_RIGHTS_ENUM` = 536870912;
public const val `ADS_RIGHT_GENERIC_READ`: `ADS_RIGHTS_ENUM` = -2147483648;
public const val `ADS_RIGHT_GENERIC_WRITE`: `ADS_RIGHTS_ENUM` = 1073741824;
public const val `ADS_RIGHT_READ_CONTROL`: `ADS_RIGHTS_ENUM` = 131072;
public const val `ADS_RIGHT_SYNCHRONIZE`: `ADS_RIGHTS_ENUM` = 1048576;
public const val `ADS_RIGHT_WRITE_DAC`: `ADS_RIGHTS_ENUM` = 262144;
public const val `ADS_RIGHT_WRITE_OWNER`: `ADS_RIGHTS_ENUM` = 524288;
public typealias `ADS_SCOPEENUM` = Int;
public const val `ADS_SCOPE_BASE`: `ADS_SCOPEENUM` = 0;
public const val `ADS_SCOPE_ONELEVEL`: `ADS_SCOPEENUM` = 1;
public const val `ADS_SCOPE_SUBTREE`: `ADS_SCOPEENUM` = 2;
public typealias `ADS_SD_CONTROL_ENUM` = Int;
public const val `ADS_SD_CONTROL_SE_DACL_AUTO_INHERITED`: `ADS_SD_CONTROL_ENUM` = 1024;
public const val `ADS_SD_CONTROL_SE_DACL_AUTO_INHERIT_REQ`: `ADS_SD_CONTROL_ENUM` = 256;
public const val `ADS_SD_CONTROL_SE_DACL_DEFAULTED`: `ADS_SD_CONTROL_ENUM` = 8;
public const val `ADS_SD_CONTROL_SE_DACL_PRESENT`: `ADS_SD_CONTROL_ENUM` = 4;
public const val `ADS_SD_CONTROL_SE_DACL_PROTECTED`: `ADS_SD_CONTROL_ENUM` = 4096;
public const val `ADS_SD_CONTROL_SE_GROUP_DEFAULTED`: `ADS_SD_CONTROL_ENUM` = 2;
public const val `ADS_SD_CONTROL_SE_OWNER_DEFAULTED`: `ADS_SD_CONTROL_ENUM` = 1;
public const val `ADS_SD_CONTROL_SE_SACL_AUTO_INHERITED`: `ADS_SD_CONTROL_ENUM` = 2048;
public const val `ADS_SD_CONTROL_SE_SACL_AUTO_INHERIT_REQ`: `ADS_SD_CONTROL_ENUM` = 512;
public const val `ADS_SD_CONTROL_SE_SACL_DEFAULTED`: `ADS_SD_CONTROL_ENUM` = 32;
public const val `ADS_SD_CONTROL_SE_SACL_PRESENT`: `ADS_SD_CONTROL_ENUM` = 16;
public const val `ADS_SD_CONTROL_SE_SACL_PROTECTED`: `ADS_SD_CONTROL_ENUM` = 8192;
public const val `ADS_SD_CONTROL_SE_SELF_RELATIVE`: `ADS_SD_CONTROL_ENUM` = 32768;
public typealias `ADS_SD_FORMAT_ENUM` = Int;
public const val `ADS_SD_FORMAT_HEXSTRING`: `ADS_SD_FORMAT_ENUM` = 3;
public const val `ADS_SD_FORMAT_IID`: `ADS_SD_FORMAT_ENUM` = 1;
public const val `ADS_SD_FORMAT_RAW`: `ADS_SD_FORMAT_ENUM` = 2;
public const val `ADS_SD_REVISION_DS`: `ADS_SD_REVISION_ENUM` = 4;
public typealias `ADS_SD_REVISION_ENUM` = Int;
public const val `ADS_SEARCHPREF_ASYNCHRONOUS`: `ADS_SEARCHPREF_ENUM` = 0;
public const val `ADS_SEARCHPREF_ATTRIBTYPES_ONLY`: `ADS_SEARCHPREF_ENUM` = 4;
public const val `ADS_SEARCHPREF_ATTRIBUTE_QUERY`: `ADS_SEARCHPREF_ENUM` = 15;
public const val `ADS_SEARCHPREF_CACHE_RESULTS`: `ADS_SEARCHPREF_ENUM` = 11;
public const val `ADS_SEARCHPREF_CHASE_REFERRALS`: `ADS_SEARCHPREF_ENUM` = 9;
public const val `ADS_SEARCHPREF_DEREF_ALIASES`: `ADS_SEARCHPREF_ENUM` = 1;
public const val `ADS_SEARCHPREF_DIRSYNC`: `ADS_SEARCHPREF_ENUM` = 12;
public const val `ADS_SEARCHPREF_DIRSYNC_FLAG`: `ADS_SEARCHPREF_ENUM` = 17;
public typealias `ADS_SEARCHPREF_ENUM` = Int;
public const val `ADS_SEARCHPREF_EXTENDED_DN`: `ADS_SEARCHPREF_ENUM` = 18;
// UNSUPPORTED Rust 736:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ADS_SEARCHPREF_INFO {
//     pub dwSearchPref: ADS_SEARCHPREF_ENUM,
//     pub vValue: ADSVALUE,
//     pub dwStatus: ADS_STATUSENUM,
// }

// UNSUPPORTED Rust 743:1: declaration Impl has no candidate rule
// impl Default for ADS_SEARCHPREF_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ADS_SEARCHPREF_PAGED_TIME_LIMIT`: `ADS_SEARCHPREF_ENUM` = 8;
public const val `ADS_SEARCHPREF_PAGESIZE`: `ADS_SEARCHPREF_ENUM` = 7;
public const val `ADS_SEARCHPREF_SEARCH_SCOPE`: `ADS_SEARCHPREF_ENUM` = 5;
public const val `ADS_SEARCHPREF_SECURITY_MASK`: `ADS_SEARCHPREF_ENUM` = 16;
public const val `ADS_SEARCHPREF_SIZE_LIMIT`: `ADS_SEARCHPREF_ENUM` = 2;
public const val `ADS_SEARCHPREF_SORT_ON`: `ADS_SEARCHPREF_ENUM` = 10;
public const val `ADS_SEARCHPREF_TIMEOUT`: `ADS_SEARCHPREF_ENUM` = 6;
public const val `ADS_SEARCHPREF_TIME_LIMIT`: `ADS_SEARCHPREF_ENUM` = 3;
public const val `ADS_SEARCHPREF_TOMBSTONE`: `ADS_SEARCHPREF_ENUM` = 13;
public const val `ADS_SEARCHPREF_VLV`: `ADS_SEARCHPREF_ENUM` = 14;
// UNSUPPORTED Rust 758:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ADS_SEARCH_COLUMN {
//     pub pszAttrName: windows_sys::core::PWSTR,
//     pub dwADsType: ADSTYPE,
//     pub pADsValues: *mut ADSVALUE,
//     pub dwNumValues: u32,
//     pub hReserved: super::super::Foundation::HANDLE,
// }

// UNSUPPORTED Rust 767:1: declaration Impl has no candidate rule
// impl Default for ADS_SEARCH_COLUMN {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `ADS_SEARCH_HANDLE` = Long;
public const val `ADS_SECURE_AUTHENTICATION`: `ADS_AUTHENTICATION_ENUM` = 1u;
public const val `ADS_SECURITY_INFO_DACL`: `ADS_SECURITY_INFO_ENUM` = 4;
public typealias `ADS_SECURITY_INFO_ENUM` = Int;
public const val `ADS_SECURITY_INFO_GROUP`: `ADS_SECURITY_INFO_ENUM` = 2;
public const val `ADS_SECURITY_INFO_OWNER`: `ADS_SECURITY_INFO_ENUM` = 1;
public const val `ADS_SECURITY_INFO_SACL`: `ADS_SECURITY_INFO_ENUM` = 8;
public const val `ADS_SERVER_BIND`: `ADS_AUTHENTICATION_ENUM` = 512u;
public const val `ADS_SETTYPE_DN`: `ADS_SETTYPE_ENUM` = 4;
public typealias `ADS_SETTYPE_ENUM` = Int;
public const val `ADS_SETTYPE_FULL`: `ADS_SETTYPE_ENUM` = 1;
public const val `ADS_SETTYPE_PROVIDER`: `ADS_SETTYPE_ENUM` = 2;
public const val `ADS_SETTYPE_SERVER`: `ADS_SETTYPE_ENUM` = 3;
// UNSUPPORTED Rust 785:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ADS_SORTKEY {
//     pub pszAttrType: windows_sys::core::PWSTR,
//     pub pszReserved: windows_sys::core::PWSTR,
//     pub fReverseorder: bool,
// }

// UNSUPPORTED Rust 792:1: declaration Impl has no candidate rule
// impl Default for ADS_SORTKEY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `ADS_STATUSENUM` = Int;
public const val `ADS_STATUS_INVALID_SEARCHPREF`: `ADS_STATUSENUM` = 1;
public const val `ADS_STATUS_INVALID_SEARCHPREFVALUE`: `ADS_STATUSENUM` = 2;
public const val `ADS_STATUS_S_OK`: `ADS_STATUSENUM` = 0;
public const val `ADS_SYSTEMFLAG_ATTR_IS_CONSTRUCTED`: `ADS_SYSTEMFLAG_ENUM` = 4;
public const val `ADS_SYSTEMFLAG_ATTR_NOT_REPLICATED`: `ADS_SYSTEMFLAG_ENUM` = 1;
public const val `ADS_SYSTEMFLAG_CONFIG_ALLOW_LIMITED_MOVE`: `ADS_SYSTEMFLAG_ENUM` = 268435456;
public const val `ADS_SYSTEMFLAG_CONFIG_ALLOW_MOVE`: `ADS_SYSTEMFLAG_ENUM` = 536870912;
public const val `ADS_SYSTEMFLAG_CONFIG_ALLOW_RENAME`: `ADS_SYSTEMFLAG_ENUM` = 1073741824;
public const val `ADS_SYSTEMFLAG_CR_NTDS_DOMAIN`: `ADS_SYSTEMFLAG_ENUM` = 2;
public const val `ADS_SYSTEMFLAG_CR_NTDS_NC`: `ADS_SYSTEMFLAG_ENUM` = 1;
public const val `ADS_SYSTEMFLAG_DISALLOW_DELETE`: `ADS_SYSTEMFLAG_ENUM` = -2147483648;
public const val `ADS_SYSTEMFLAG_DOMAIN_DISALLOW_MOVE`: `ADS_SYSTEMFLAG_ENUM` = 67108864;
public const val `ADS_SYSTEMFLAG_DOMAIN_DISALLOW_RENAME`: `ADS_SYSTEMFLAG_ENUM` = 134217728;
public typealias `ADS_SYSTEMFLAG_ENUM` = Int;
// UNSUPPORTED Rust 812:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ADS_TIMESTAMP {
//     pub WholeSeconds: u32,
//     pub EventID: u32,
// }

// UNSUPPORTED Rust 818:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ADS_TYPEDNAME {
//     pub ObjectName: windows_sys::core::PWSTR,
//     pub Level: u32,
//     pub Interval: u32,
// }

// UNSUPPORTED Rust 825:1: declaration Impl has no candidate rule
// impl Default for ADS_TYPEDNAME {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ADS_UF_ACCOUNTDISABLE`: `ADS_USER_FLAG_ENUM` = 2;
public const val `ADS_UF_DONT_EXPIRE_PASSWD`: `ADS_USER_FLAG_ENUM` = 65536;
public const val `ADS_UF_DONT_REQUIRE_PREAUTH`: `ADS_USER_FLAG_ENUM` = 4194304;
public const val `ADS_UF_ENCRYPTED_TEXT_PASSWORD_ALLOWED`: `ADS_USER_FLAG_ENUM` = 128;
public const val `ADS_UF_HOMEDIR_REQUIRED`: `ADS_USER_FLAG_ENUM` = 8;
public const val `ADS_UF_INTERDOMAIN_TRUST_ACCOUNT`: `ADS_USER_FLAG_ENUM` = 2048;
public const val `ADS_UF_LOCKOUT`: `ADS_USER_FLAG_ENUM` = 16;
public const val `ADS_UF_MNS_LOGON_ACCOUNT`: `ADS_USER_FLAG_ENUM` = 131072;
public const val `ADS_UF_NORMAL_ACCOUNT`: `ADS_USER_FLAG_ENUM` = 512;
public const val `ADS_UF_NOT_DELEGATED`: `ADS_USER_FLAG_ENUM` = 1048576;
public const val `ADS_UF_PASSWD_CANT_CHANGE`: `ADS_USER_FLAG_ENUM` = 64;
public const val `ADS_UF_PASSWD_NOTREQD`: `ADS_USER_FLAG_ENUM` = 32;
public const val `ADS_UF_PASSWORD_EXPIRED`: `ADS_USER_FLAG_ENUM` = 8388608;
public const val `ADS_UF_SCRIPT`: `ADS_USER_FLAG_ENUM` = 1;
public const val `ADS_UF_SERVER_TRUST_ACCOUNT`: `ADS_USER_FLAG_ENUM` = 8192;
public const val `ADS_UF_SMARTCARD_REQUIRED`: `ADS_USER_FLAG_ENUM` = 262144;
public const val `ADS_UF_TEMP_DUPLICATE_ACCOUNT`: `ADS_USER_FLAG_ENUM` = 256;
public const val `ADS_UF_TRUSTED_FOR_DELEGATION`: `ADS_USER_FLAG_ENUM` = 524288;
public const val `ADS_UF_TRUSTED_TO_AUTHENTICATE_FOR_DELEGATION`: `ADS_USER_FLAG_ENUM` = 16777216;
public const val `ADS_UF_USE_DES_KEY_ONLY`: `ADS_USER_FLAG_ENUM` = 2097152;
public const val `ADS_UF_WORKSTATION_TRUST_ACCOUNT`: `ADS_USER_FLAG_ENUM` = 4096;
public typealias `ADS_USER_FLAG_ENUM` = Int;
public const val `ADS_USE_DELEGATION`: `ADS_AUTHENTICATION_ENUM` = 256u;
public const val `ADS_USE_ENCRYPTION`: `ADS_AUTHENTICATION_ENUM` = 2u;
public const val `ADS_USE_SEALING`: `ADS_AUTHENTICATION_ENUM` = 128u;
public const val `ADS_USE_SIGNING`: `ADS_AUTHENTICATION_ENUM` = 64u;
public const val `ADS_USE_SSL`: `ADS_AUTHENTICATION_ENUM` = 2u;
// UNSUPPORTED Rust 857:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ADS_VLV {
//     pub dwBeforeCount: u32,
//     pub dwAfterCount: u32,
//     pub dwOffset: u32,
//     pub dwContentCount: u32,
//     pub pszTarget: windows_sys::core::PWSTR,
//     pub dwContextIDLength: u32,
//     pub lpContextID: *mut u8,
// }

// UNSUPPORTED Rust 868:1: declaration Impl has no candidate rule
// impl Default for ADS_VLV {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 873:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const ADSystemInfo: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x50b6327f_afd1_11d2_9cb9_0000f87a369e);

// UNSUPPORTED Rust 874:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const ADsSecurityUtility: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf270c64a_ffb8_4ae4_85fe_3a75e5347966);

// UNSUPPORTED Rust 875:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const AccessControlEntry: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb75ac000_9bdd_11d0_852c_00c04fd8d503);

// UNSUPPORTED Rust 876:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const AccessControlList: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb85ea052_9bdd_11d0_852c_00c04fd8d503);

// UNSUPPORTED Rust 877:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const BackLink: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfcbf906f_4080_11d1_a3ac_00c04fb950dc);

// UNSUPPORTED Rust 878:1: non-scalar type Ptr unsupported
// pub const CFSTR_DSDISPLAYSPECOPTIONS: windows_sys::core::PCWSTR = windows_sys::core::w!("DsDisplaySpecOptions");

// UNSUPPORTED Rust 879:1: non-scalar type Ptr unsupported
// pub const CFSTR_DSOBJECTNAMES: windows_sys::core::PCWSTR = windows_sys::core::w!("DsObjectNames");

// UNSUPPORTED Rust 880:1: non-scalar type Ptr unsupported
// pub const CFSTR_DSOP_DS_SELECTION_LIST: windows_sys::core::PCWSTR = windows_sys::core::w!("CFSTR_DSOP_DS_SELECTION_LIST");

// UNSUPPORTED Rust 881:1: non-scalar type Ptr unsupported
// pub const CFSTR_DSPROPERTYPAGEINFO: windows_sys::core::PCWSTR = windows_sys::core::w!("DsPropPageInfo");

// UNSUPPORTED Rust 882:1: non-scalar type Ptr unsupported
// pub const CFSTR_DSQUERYPARAMS: windows_sys::core::PCWSTR = windows_sys::core::w!("DsQueryParameters");

// UNSUPPORTED Rust 883:1: non-scalar type Ptr unsupported
// pub const CFSTR_DSQUERYSCOPE: windows_sys::core::PCWSTR = windows_sys::core::w!("DsQueryScope");

// UNSUPPORTED Rust 884:1: non-scalar type Ptr unsupported
// pub const CFSTR_DS_DISPLAY_SPEC_OPTIONS: windows_sys::core::PCWSTR = windows_sys::core::w!("DsDisplaySpecOptions");

// UNSUPPORTED Rust 885:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CLSID_CommonQuery: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x83bc5ec0_6f2a_11d0_a1c4_00aa00c16e65);

// UNSUPPORTED Rust 886:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CLSID_DsAdminCreateObj: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe301a009_f901_11d2_82b9_00c04f68928b);

// UNSUPPORTED Rust 887:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CLSID_DsDisplaySpecifier: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1ab4a8c0_6a0b_11d2_ad49_00c04fa31a86);

// UNSUPPORTED Rust 888:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CLSID_DsDomainTreeBrowser: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1698790a_e2b4_11d0_b0b1_00c04fd8dca6);

// UNSUPPORTED Rust 889:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CLSID_DsFindAdvanced: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x83ee3fe3_57d9_11d0_b932_00a024ab2dbb);

// UNSUPPORTED Rust 890:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CLSID_DsFindComputer: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x16006700_87ad_11d0_9140_00aa00c16e65);

// UNSUPPORTED Rust 891:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CLSID_DsFindContainer: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc1b3cbf2_886a_11d0_9140_00aa00c16e65);

// UNSUPPORTED Rust 892:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CLSID_DsFindDomainController: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x538c7b7e_d25e_11d0_9742_00a0c906af45);

// UNSUPPORTED Rust 893:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CLSID_DsFindFrsMembers: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x94ce4b18_b3d3_11d1_b9b4_00c04fd8d5b0);

// UNSUPPORTED Rust 894:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CLSID_DsFindObjects: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x83ee3fe1_57d9_11d0_b932_00a024ab2dbb);

// UNSUPPORTED Rust 895:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CLSID_DsFindPeople: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x83ee3fe2_57d9_11d0_b932_00a024ab2dbb);

// UNSUPPORTED Rust 896:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CLSID_DsFindPrinter: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb577f070_7ee2_11d0_913f_00aa00c16e65);

// UNSUPPORTED Rust 897:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CLSID_DsFindVolume: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc1b3cbf1_886a_11d0_9140_00aa00c16e65);

// UNSUPPORTED Rust 898:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CLSID_DsFindWriteableDomainController: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7cbef079_aa84_444b_bc70_68e41283eabc);

// UNSUPPORTED Rust 899:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CLSID_DsFolderProperties: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9e51e0d0_6e0f_11d2_9601_00c04fa31a86);

// UNSUPPORTED Rust 900:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CLSID_DsObjectPicker: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x17d6ccd8_3b7b_11d2_b9e0_00c04fd8dbf7);

// UNSUPPORTED Rust 901:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CLSID_DsPropertyPages: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0d45d530_764b_11d0_a1ca_00aa00c16e65);

// UNSUPPORTED Rust 902:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CLSID_DsQuery: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8a23e65e_31c2_11d0_891c_00a024ab2dbb);

// UNSUPPORTED Rust 903:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CLSID_MicrosoftDS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfe1290f0_cfbd_11cf_a330_00aa00c16e65);

public const val `CQFF_ISOPTIONAL`: UInt = 2u;
public const val `CQFF_NOGLOBALPAGES`: UInt = 1u;
// UNSUPPORTED Rust 906:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// #[derive(Clone, Copy)]
// pub struct CQFORM {
//     pub cbStruct: u32,
//     pub dwFlags: u32,
//     pub clsid: windows_sys::core::GUID,
//     pub hIcon: super::super::UI::WindowsAndMessaging::HICON,
//     pub pszTitle: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 916:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// impl Default for CQFORM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 922:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// #[derive(Clone, Copy)]
// pub struct CQPAGE {
//     pub cbStruct: u32,
//     pub dwFlags: u32,
//     pub pPageProc: LPCQPAGEPROC,
//     pub hInstance: super::super::Foundation::HINSTANCE,
//     pub idPageName: i32,
//     pub idPageTemplate: i32,
//     pub pDlgProc: super::super::UI::WindowsAndMessaging::DLGPROC,
//     pub lParam: super::super::Foundation::LPARAM,
// }

// UNSUPPORTED Rust 935:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// impl Default for CQPAGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CQPM_CLEARFORM`: UInt = 6u;
public const val `CQPM_ENABLE`: UInt = 3u;
public const val `CQPM_GETPARAMETERS`: UInt = 5u;
public const val `CQPM_HANDLERSPECIFIC`: UInt = 268435456u;
public const val `CQPM_HELP`: UInt = 8u;
public const val `CQPM_INITIALIZE`: UInt = 1u;
public const val `CQPM_PERSIST`: UInt = 7u;
public const val `CQPM_RELEASE`: UInt = 2u;
public const val `CQPM_SETDEFAULTPARAMETERS`: UInt = 9u;
// UNSUPPORTED Rust 950:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CaseIgnoreList: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x15f88a55_4680_11d1_a3b4_00c04fb950dc);

public const val `DBDTF_RETURNEXTERNAL`: UInt = 4u;
public const val `DBDTF_RETURNFQDN`: UInt = 1u;
public const val `DBDTF_RETURNINBOUND`: UInt = 8u;
public const val `DBDTF_RETURNINOUTBOUND`: UInt = 16u;
public const val `DBDTF_RETURNMIXEDDOMAINS`: UInt = 2u;
// UNSUPPORTED Rust 956:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const DNWithBinary: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7e99c0a3_f935_11d2_ba96_00c04fb6d0d1);

// UNSUPPORTED Rust 957:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const DNWithString: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x334857cc_f934_11d2_ba96_00c04fb6d0d1);

// UNSUPPORTED Rust 958:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOMAINDESC {
//     pub pszName: windows_sys::core::PWSTR,
//     pub pszPath: windows_sys::core::PWSTR,
//     pub pszNCName: windows_sys::core::PWSTR,
//     pub pszTrustParent: windows_sys::core::PWSTR,
//     pub pszObjectClass: windows_sys::core::PWSTR,
//     pub ulFlags: u32,
//     pub fDownLevel: windows_sys::core::BOOL,
//     pub pdChildList: *mut DOMAINDESC,
//     pub pdNextSibling: *mut DOMAINDESC,
// }

// UNSUPPORTED Rust 971:1: declaration Impl has no candidate rule
// impl Default for DOMAINDESC {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 976:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOMAIN_CONTROLLER_INFOA {
//     pub DomainControllerName: windows_sys::core::PSTR,
//     pub DomainControllerAddress: windows_sys::core::PSTR,
//     pub DomainControllerAddressType: u32,
//     pub DomainGuid: windows_sys::core::GUID,
//     pub DomainName: windows_sys::core::PSTR,
//     pub DnsForestName: windows_sys::core::PSTR,
//     pub Flags: u32,
//     pub DcSiteName: windows_sys::core::PSTR,
//     pub ClientSiteName: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 989:1: declaration Impl has no candidate rule
// impl Default for DOMAIN_CONTROLLER_INFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 994:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOMAIN_CONTROLLER_INFOW {
//     pub DomainControllerName: windows_sys::core::PWSTR,
//     pub DomainControllerAddress: windows_sys::core::PWSTR,
//     pub DomainControllerAddressType: u32,
//     pub DomainGuid: windows_sys::core::GUID,
//     pub DomainName: windows_sys::core::PWSTR,
//     pub DnsForestName: windows_sys::core::PWSTR,
//     pub Flags: u32,
//     pub DcSiteName: windows_sys::core::PWSTR,
//     pub ClientSiteName: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 1007:1: declaration Impl has no candidate rule
// impl Default for DOMAIN_CONTROLLER_INFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1012:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOMAIN_TREE {
//     pub dsSize: u32,
//     pub dwCount: u32,
//     pub aDomains: [DOMAINDESC; 1],
// }

// UNSUPPORTED Rust 1019:1: declaration Impl has no candidate rule
// impl Default for DOMAIN_TREE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DSA_NEWOBJ_CTX_CLEANUP`: UInt = 4u;
public const val `DSA_NEWOBJ_CTX_COMMIT`: UInt = 2u;
public const val `DSA_NEWOBJ_CTX_POSTCOMMIT`: UInt = 3u;
public const val `DSA_NEWOBJ_CTX_PRECOMMIT`: UInt = 1u;
// UNSUPPORTED Rust 1028:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// #[derive(Clone, Copy)]
// pub struct DSA_NEWOBJ_DISPINFO {
//     pub dwSize: u32,
//     pub hObjClassIcon: super::super::UI::WindowsAndMessaging::HICON,
//     pub lpszWizTitle: windows_sys::core::PWSTR,
//     pub lpszContDisplayName: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 1037:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// impl Default for DSA_NEWOBJ_DISPINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DSA_NOTIFY_DEL`: UInt = 1u;
public const val `DSA_NOTIFY_FLAG_ADDITIONAL_DATA`: UInt = 2u;
public const val `DSA_NOTIFY_FLAG_FORCE_ADDITIONAL_DATA`: UInt = 1u;
public const val `DSA_NOTIFY_MOV`: UInt = 4u;
public const val `DSA_NOTIFY_PROP`: UInt = 8u;
public const val `DSA_NOTIFY_REN`: UInt = 2u;
public const val `DSBF_DISPLAYNAME`: UInt = 4u;
public const val `DSBF_ICONLOCATION`: UInt = 2u;
public const val `DSBF_STATE`: UInt = 1u;
public const val `DSBID_BANNER`: UInt = 256u;
public const val `DSBID_CONTAINERLIST`: UInt = 257u;
// UNSUPPORTED Rust 1054:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DSBITEMA {
//     pub cbStruct: u32,
//     pub pszADsPath: windows_sys::core::PCWSTR,
//     pub pszClass: windows_sys::core::PCWSTR,
//     pub dwMask: u32,
//     pub dwState: u32,
//     pub dwStateMask: u32,
//     pub szDisplayName: [i8; 64],
//     pub szIconLocation: [i8; 260],
//     pub iIconResID: i32,
// }

// UNSUPPORTED Rust 1067:1: declaration Impl has no candidate rule
// impl Default for DSBITEMA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1072:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DSBITEMW {
//     pub cbStruct: u32,
//     pub pszADsPath: windows_sys::core::PCWSTR,
//     pub pszClass: windows_sys::core::PCWSTR,
//     pub dwMask: u32,
//     pub dwState: u32,
//     pub dwStateMask: u32,
//     pub szDisplayName: [u16; 64],
//     pub szIconLocation: [u16; 260],
//     pub iIconResID: i32,
// }

// UNSUPPORTED Rust 1085:1: declaration Impl has no candidate rule
// impl Default for DSBITEMW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DSBI_CHECKBOXES`: UInt = 256u;
public const val `DSBI_DONTSIGNSEAL`: UInt = 33554432u;
public const val `DSBI_ENTIREDIRECTORY`: UInt = 589824u;
public const val `DSBI_EXPANDONOPEN`: UInt = 262144u;
public const val `DSBI_HASCREDENTIALS`: UInt = 2097152u;
public const val `DSBI_IGNORETREATASLEAF`: UInt = 4194304u;
public const val `DSBI_INCLUDEHIDDEN`: UInt = 131072u;
public const val `DSBI_NOBUTTONS`: UInt = 1u;
public const val `DSBI_NOLINES`: UInt = 2u;
public const val `DSBI_NOLINESATROOT`: UInt = 4u;
public const val `DSBI_NOROOT`: UInt = 65536u;
public const val `DSBI_RETURNOBJECTCLASS`: UInt = 16777216u;
public const val `DSBI_RETURN_FORMAT`: UInt = 1048576u;
public const val `DSBI_SIMPLEAUTHENTICATE`: UInt = 8388608u;
public const val `DSBM_CHANGEIMAGESTATE`: UInt = 102u;
public const val `DSBM_CONTEXTMENU`: UInt = 104u;
public const val `DSBM_HELP`: UInt = 103u;
public const val `DSBM_QUERYINSERT`: UInt = 100u;
public const val `DSBM_QUERYINSERTA`: UInt = 101u;
public const val `DSBM_QUERYINSERTW`: UInt = 100u;
// UNSUPPORTED Rust 1110:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_UI_Shell")]
// #[derive(Clone, Copy)]
// pub struct DSBROWSEINFOA {
//     pub cbStruct: u32,
//     pub hwndOwner: super::super::Foundation::HWND,
//     pub pszCaption: windows_sys::core::PCSTR,
//     pub pszTitle: windows_sys::core::PCSTR,
//     pub pszRoot: windows_sys::core::PCWSTR,
//     pub pszPath: windows_sys::core::PWSTR,
//     pub cchPath: u32,
//     pub dwFlags: u32,
//     pub pfnCallback: super::super::UI::Shell::BFFCALLBACK,
//     pub lParam: super::super::Foundation::LPARAM,
//     pub dwReturnFormat: u32,
//     pub pUserName: windows_sys::core::PCWSTR,
//     pub pPassword: windows_sys::core::PCWSTR,
//     pub pszObjectClass: windows_sys::core::PWSTR,
//     pub cchObjectClass: u32,
// }

// UNSUPPORTED Rust 1130:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_UI_Shell")]
// impl Default for DSBROWSEINFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1136:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_UI_Shell")]
// #[derive(Clone, Copy)]
// pub struct DSBROWSEINFOW {
//     pub cbStruct: u32,
//     pub hwndOwner: super::super::Foundation::HWND,
//     pub pszCaption: windows_sys::core::PCWSTR,
//     pub pszTitle: windows_sys::core::PCWSTR,
//     pub pszRoot: windows_sys::core::PCWSTR,
//     pub pszPath: windows_sys::core::PWSTR,
//     pub cchPath: u32,
//     pub dwFlags: u32,
//     pub pfnCallback: super::super::UI::Shell::BFFCALLBACK,
//     pub lParam: super::super::Foundation::LPARAM,
//     pub dwReturnFormat: u32,
//     pub pUserName: windows_sys::core::PCWSTR,
//     pub pPassword: windows_sys::core::PCWSTR,
//     pub pszObjectClass: windows_sys::core::PWSTR,
//     pub cchObjectClass: u32,
// }

// UNSUPPORTED Rust 1156:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_UI_Shell")]
// impl Default for DSBROWSEINFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DSBS_CHECKED`: UInt = 1u;
public const val `DSBS_HIDDEN`: UInt = 2u;
public const val `DSBS_ROOT`: UInt = 4u;
public const val `DSB_MAX_DISPLAYNAME_CHARS`: UInt = 64u;
public const val `DSCCIF_HASWIZARDDIALOG`: UInt = 1u;
public const val `DSCCIF_HASWIZARDPRIMARYPAGE`: UInt = 2u;
// UNSUPPORTED Rust 1168:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DSCLASSCREATIONINFO {
//     pub dwFlags: u32,
//     pub clsidWizardDialog: windows_sys::core::GUID,
//     pub clsidWizardPrimaryPage: windows_sys::core::GUID,
//     pub cWizardExtensions: u32,
//     pub aWizardExtensions: [windows_sys::core::GUID; 1],
// }

// UNSUPPORTED Rust 1177:1: declaration Impl has no candidate rule
// impl Default for DSCLASSCREATIONINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1182:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DSCOLUMN {
//     pub dwFlags: u32,
//     pub fmt: i32,
//     pub cx: i32,
//     pub idsName: i32,
//     pub offsetProperty: i32,
//     pub dwReserved: u32,
// }

// UNSUPPORTED Rust 1192:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DSDISPLAYSPECOPTIONS {
//     pub dwSize: u32,
//     pub dwFlags: u32,
//     pub offsetAttribPrefix: u32,
//     pub offsetUserName: u32,
//     pub offsetPassword: u32,
//     pub offsetServer: u32,
//     pub offsetServerConfigPath: u32,
// }

public const val `DSDSOF_DONTSIGNSEAL`: UInt = 4u;
public const val `DSDSOF_DSAVAILABLE`: UInt = 1073741824u;
public const val `DSDSOF_HASUSERANDSERVERINFO`: UInt = 1u;
public const val `DSDSOF_SIMPLEAUTHENTICATE`: UInt = 2u;
public const val `DSECAF_NOTLISTED`: UInt = 1u;
public const val `DSGIF_DEFAULTISCONTAINER`: UInt = 32u;
public const val `DSGIF_GETDEFAULTICON`: UInt = 16u;
public const val `DSGIF_ISDISABLED`: UInt = 2u;
public const val `DSGIF_ISMASK`: UInt = 15u;
public const val `DSGIF_ISNORMAL`: UInt = 0u;
public const val `DSGIF_ISOPEN`: UInt = 1u;
public const val `DSICCF_IGNORETREATASLEAF`: UInt = 1u;
// UNSUPPORTED Rust 1215:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DSOBJECT {
//     pub dwFlags: u32,
//     pub dwProviderFlags: u32,
//     pub offsetName: u32,
//     pub offsetClass: u32,
// }

// UNSUPPORTED Rust 1223:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DSOBJECTNAMES {
//     pub clsidNamespace: windows_sys::core::GUID,
//     pub cItems: u32,
//     pub aObjects: [DSOBJECT; 1],
// }

// UNSUPPORTED Rust 1230:1: declaration Impl has no candidate rule
// impl Default for DSOBJECTNAMES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DSOBJECT_ISCONTAINER`: UInt = 1u;
public const val `DSOBJECT_READONLYPAGES`: UInt = 2147483648u;
public const val `DSOP_DOWNLEVEL_FILTER_ALL_APP_PACKAGES`: UInt = 2281701376u;
public const val `DSOP_DOWNLEVEL_FILTER_ALL_WELLKNOWN_SIDS`: UInt = 2147614720u;
public const val `DSOP_DOWNLEVEL_FILTER_ANONYMOUS`: UInt = 2147483712u;
public const val `DSOP_DOWNLEVEL_FILTER_AUTHENTICATED_USER`: UInt = 2147483680u;
public const val `DSOP_DOWNLEVEL_FILTER_BATCH`: UInt = 2147483776u;
public const val `DSOP_DOWNLEVEL_FILTER_COMPUTERS`: UInt = 2147483656u;
public const val `DSOP_DOWNLEVEL_FILTER_CREATOR_GROUP`: UInt = 2147484160u;
public const val `DSOP_DOWNLEVEL_FILTER_CREATOR_OWNER`: UInt = 2147483904u;
public const val `DSOP_DOWNLEVEL_FILTER_DIALUP`: UInt = 2147484672u;
public const val `DSOP_DOWNLEVEL_FILTER_EXCLUDE_BUILTIN_GROUPS`: UInt = 2147516416u;
public const val `DSOP_DOWNLEVEL_FILTER_GLOBAL_GROUPS`: UInt = 2147483652u;
public const val `DSOP_DOWNLEVEL_FILTER_IIS_APP_POOL`: UInt = 2214592512u;
public const val `DSOP_DOWNLEVEL_FILTER_INTERACTIVE`: UInt = 2147485696u;
public const val `DSOP_DOWNLEVEL_FILTER_INTERNET_USER`: UInt = 2149580800u;
public const val `DSOP_DOWNLEVEL_FILTER_LOCAL_ACCOUNTS`: UInt = 2415919104u;
public const val `DSOP_DOWNLEVEL_FILTER_LOCAL_GROUPS`: UInt = 2147483650u;
public const val `DSOP_DOWNLEVEL_FILTER_LOCAL_LOGON`: UInt = 2164260864u;
public const val `DSOP_DOWNLEVEL_FILTER_LOCAL_SERVICE`: UInt = 2147745792u;
public const val `DSOP_DOWNLEVEL_FILTER_NETWORK`: UInt = 2147487744u;
public const val `DSOP_DOWNLEVEL_FILTER_NETWORK_SERVICE`: UInt = 2148007936u;
public const val `DSOP_DOWNLEVEL_FILTER_OWNER_RIGHTS`: UInt = 2151677952u;
public const val `DSOP_DOWNLEVEL_FILTER_REMOTE_LOGON`: UInt = 2148532224u;
public const val `DSOP_DOWNLEVEL_FILTER_SERVICE`: UInt = 2147491840u;
public const val `DSOP_DOWNLEVEL_FILTER_SERVICES`: UInt = 2155872256u;
public const val `DSOP_DOWNLEVEL_FILTER_SYSTEM`: UInt = 2147500032u;
public const val `DSOP_DOWNLEVEL_FILTER_TERMINAL_SERVER`: UInt = 2147549184u;
public const val `DSOP_DOWNLEVEL_FILTER_THIS_ORG_CERT`: UInt = 2181038080u;
public const val `DSOP_DOWNLEVEL_FILTER_USERS`: UInt = 2147483649u;
public const val `DSOP_DOWNLEVEL_FILTER_WORLD`: UInt = 2147483664u;
public const val `DSOP_FILTER_BUILTIN_GROUPS`: UInt = 4u;
public const val `DSOP_FILTER_COMPUTERS`: UInt = 2048u;
public const val `DSOP_FILTER_CONTACTS`: UInt = 1024u;
public const val `DSOP_FILTER_DOMAIN_LOCAL_GROUPS_DL`: UInt = 256u;
public const val `DSOP_FILTER_DOMAIN_LOCAL_GROUPS_SE`: UInt = 512u;
// UNSUPPORTED Rust 1271:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DSOP_FILTER_FLAGS {
//     pub Uplevel: DSOP_UPLEVEL_FILTER_FLAGS,
//     pub flDownlevel: u32,
// }

public const val `DSOP_FILTER_GLOBAL_GROUPS_DL`: UInt = 64u;
public const val `DSOP_FILTER_GLOBAL_GROUPS_SE`: UInt = 128u;
public const val `DSOP_FILTER_INCLUDE_ADVANCED_VIEW`: UInt = 1u;
public const val `DSOP_FILTER_PASSWORDSETTINGS_OBJECTS`: UInt = 8192u;
public const val `DSOP_FILTER_SERVICE_ACCOUNTS`: UInt = 4096u;
public const val `DSOP_FILTER_UNIVERSAL_GROUPS_DL`: UInt = 16u;
public const val `DSOP_FILTER_UNIVERSAL_GROUPS_SE`: UInt = 32u;
public const val `DSOP_FILTER_USERS`: UInt = 2u;
public const val `DSOP_FILTER_WELL_KNOWN_PRINCIPALS`: UInt = 8u;
public const val `DSOP_FLAG_MULTISELECT`: UInt = 1u;
public const val `DSOP_FLAG_SKIP_TARGET_COMPUTER_DC_CHECK`: UInt = 2u;
// UNSUPPORTED Rust 1288:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DSOP_INIT_INFO {
//     pub cbSize: u32,
//     pub pwzTargetComputer: windows_sys::core::PCWSTR,
//     pub cDsScopeInfos: u32,
//     pub aDsScopeInfos: *mut DSOP_SCOPE_INIT_INFO,
//     pub flOptions: u32,
//     pub cAttributesToFetch: u32,
//     pub apwzAttributeNames: *const windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 1299:1: declaration Impl has no candidate rule
// impl Default for DSOP_INIT_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DSOP_SCOPE_FLAG_DEFAULT_FILTER_COMPUTERS`: UInt = 256u;
public const val `DSOP_SCOPE_FLAG_DEFAULT_FILTER_CONTACTS`: UInt = 512u;
public const val `DSOP_SCOPE_FLAG_DEFAULT_FILTER_GROUPS`: UInt = 128u;
public const val `DSOP_SCOPE_FLAG_DEFAULT_FILTER_PASSWORDSETTINGS_OBJECTS`: UInt = 2048u;
public const val `DSOP_SCOPE_FLAG_DEFAULT_FILTER_SERVICE_ACCOUNTS`: UInt = 1024u;
public const val `DSOP_SCOPE_FLAG_DEFAULT_FILTER_USERS`: UInt = 64u;
public const val `DSOP_SCOPE_FLAG_STARTING_SCOPE`: UInt = 1u;
public const val `DSOP_SCOPE_FLAG_WANT_DOWNLEVEL_BUILTIN_PATH`: UInt = 32u;
public const val `DSOP_SCOPE_FLAG_WANT_PROVIDER_GC`: UInt = 8u;
public const val `DSOP_SCOPE_FLAG_WANT_PROVIDER_LDAP`: UInt = 4u;
public const val `DSOP_SCOPE_FLAG_WANT_PROVIDER_WINNT`: UInt = 2u;
public const val `DSOP_SCOPE_FLAG_WANT_SID_PATH`: UInt = 16u;
// UNSUPPORTED Rust 1316:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DSOP_SCOPE_INIT_INFO {
//     pub cbSize: u32,
//     pub flType: u32,
//     pub flScope: u32,
//     pub FilterFlags: DSOP_FILTER_FLAGS,
//     pub pwzDcName: windows_sys::core::PCWSTR,
//     pub pwzADsPath: windows_sys::core::PCWSTR,
//     pub hr: windows_sys::core::HRESULT,
// }

// UNSUPPORTED Rust 1327:1: declaration Impl has no candidate rule
// impl Default for DSOP_SCOPE_INIT_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DSOP_SCOPE_TYPE_DOWNLEVEL_JOINED_DOMAIN`: UInt = 4u;
public const val `DSOP_SCOPE_TYPE_ENTERPRISE_DOMAIN`: UInt = 8u;
public const val `DSOP_SCOPE_TYPE_EXTERNAL_DOWNLEVEL_DOMAIN`: UInt = 64u;
public const val `DSOP_SCOPE_TYPE_EXTERNAL_UPLEVEL_DOMAIN`: UInt = 32u;
public const val `DSOP_SCOPE_TYPE_GLOBAL_CATALOG`: UInt = 16u;
public const val `DSOP_SCOPE_TYPE_TARGET_COMPUTER`: UInt = 1u;
public const val `DSOP_SCOPE_TYPE_UPLEVEL_JOINED_DOMAIN`: UInt = 2u;
public const val `DSOP_SCOPE_TYPE_USER_ENTERED_DOWNLEVEL_SCOPE`: UInt = 512u;
public const val `DSOP_SCOPE_TYPE_USER_ENTERED_UPLEVEL_SCOPE`: UInt = 256u;
public const val `DSOP_SCOPE_TYPE_WORKGROUP`: UInt = 128u;
// UNSUPPORTED Rust 1342:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DSOP_UPLEVEL_FILTER_FLAGS {
//     pub flBothModes: u32,
//     pub flMixedModeOnly: u32,
//     pub flNativeModeOnly: u32,
// }

// UNSUPPORTED Rust 1349:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DSPROPERTYPAGEINFO {
//     pub offsetString: u32,
// }

// UNSUPPORTED Rust 1354:1: non-scalar type Ptr unsupported
// pub const DSPROP_ATTRCHANGED_MSG: windows_sys::core::PCWSTR = windows_sys::core::w!("DsPropAttrChanged");

public const val `DSPROVIDER_ADVANCED`: UInt = 16u;
public const val `DSPROVIDER_AD_LDS`: UInt = 32u;
public const val `DSPROVIDER_UNUSED_0`: UInt = 1u;
public const val `DSPROVIDER_UNUSED_1`: UInt = 2u;
public const val `DSPROVIDER_UNUSED_2`: UInt = 4u;
public const val `DSPROVIDER_UNUSED_3`: UInt = 8u;
public const val `DSQPF_ENABLEADMINFEATURES`: UInt = 8u;
public const val `DSQPF_ENABLEADVANCEDFEATURES`: UInt = 16u;
public const val `DSQPF_HASCREDENTIALS`: UInt = 32u;
public const val `DSQPF_NOCHOOSECOLUMNS`: UInt = 64u;
public const val `DSQPF_NOSAVE`: UInt = 1u;
public const val `DSQPF_SAVELOCATION`: UInt = 2u;
public const val `DSQPF_SHOWHIDDENOBJECTS`: UInt = 4u;
public const val `DSQPM_GETCLASSLIST`: UInt = 268435456u;
public const val `DSQPM_HELPTOPICS`: UInt = 268435457u;
// UNSUPPORTED Rust 1370:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DSQUERYCLASSLIST {
//     pub cbStruct: u32,
//     pub cClasses: i32,
//     pub offsetClass: [u32; 1],
// }

// UNSUPPORTED Rust 1377:1: declaration Impl has no candidate rule
// impl Default for DSQUERYCLASSLIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1382:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DSQUERYINITPARAMS {
//     pub cbStruct: u32,
//     pub dwFlags: u32,
//     pub pDefaultScope: windows_sys::core::PWSTR,
//     pub pDefaultSaveLocation: windows_sys::core::PWSTR,
//     pub pUserName: windows_sys::core::PWSTR,
//     pub pPassword: windows_sys::core::PWSTR,
//     pub pServer: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 1393:1: declaration Impl has no candidate rule
// impl Default for DSQUERYINITPARAMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1398:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DSQUERYPARAMS {
//     pub cbStruct: u32,
//     pub dwFlags: u32,
//     pub hInstance: super::super::Foundation::HINSTANCE,
//     pub offsetQuery: i32,
//     pub iColumns: i32,
//     pub dwReserved: u32,
//     pub aColumns: [DSCOLUMN; 1],
// }

// UNSUPPORTED Rust 1409:1: declaration Impl has no candidate rule
// impl Default for DSQUERYPARAMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DSROLE_MACHINE_ROLE` = Int;
public typealias `DSROLE_OPERATION_STATE` = Int;
// UNSUPPORTED Rust 1416:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DSROLE_OPERATION_STATE_INFO {
//     pub OperationState: DSROLE_OPERATION_STATE,
// }

public const val `DSROLE_PRIMARY_DOMAIN_GUID_PRESENT`: UInt = 16777216u;
// UNSUPPORTED Rust 1422:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DSROLE_PRIMARY_DOMAIN_INFO_BASIC {
//     pub MachineRole: DSROLE_MACHINE_ROLE,
//     pub Flags: u32,
//     pub DomainNameFlat: windows_sys::core::PWSTR,
//     pub DomainNameDns: windows_sys::core::PWSTR,
//     pub DomainForestName: windows_sys::core::PWSTR,
//     pub DomainGuid: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 1432:1: declaration Impl has no candidate rule
// impl Default for DSROLE_PRIMARY_DOMAIN_INFO_BASIC {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DSROLE_PRIMARY_DOMAIN_INFO_LEVEL` = Int;
public const val `DSROLE_PRIMARY_DS_MIXED_MODE`: UInt = 2u;
public const val `DSROLE_PRIMARY_DS_READONLY`: UInt = 8u;
public const val `DSROLE_PRIMARY_DS_RUNNING`: UInt = 1u;
public typealias `DSROLE_SERVER_STATE` = Int;
public const val `DSROLE_UPGRADE_IN_PROGRESS`: UInt = 4u;
// UNSUPPORTED Rust 1443:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DSROLE_UPGRADE_STATUS_INFO {
//     pub OperationState: u32,
//     pub PreviousServerState: DSROLE_SERVER_STATE,
// }

public const val `DSSSF_DONTSIGNSEAL`: UInt = 2u;
public const val `DSSSF_DSAVAILABLE`: UInt = 2147483648u;
public const val `DSSSF_SIMPLEAUTHENTICATE`: UInt = 1u;
public const val `DS_AVOID_SELF`: UInt = 16384u;
public const val `DS_BACKGROUND_ONLY`: UInt = 256u;
public const val `DS_BEHAVIOR_LONGHORN`: UInt = 3u;
public const val `DS_BEHAVIOR_WIN2000`: UInt = 0u;
public const val `DS_BEHAVIOR_WIN2003`: UInt = 2u;
public const val `DS_BEHAVIOR_WIN2003_WITH_MIXED_DOMAINS`: UInt = 1u;
public const val `DS_BEHAVIOR_WIN2008`: UInt = 3u;
public const val `DS_BEHAVIOR_WIN2008R2`: UInt = 4u;
public const val `DS_BEHAVIOR_WIN2012`: UInt = 5u;
public const val `DS_BEHAVIOR_WIN2012R2`: UInt = 6u;
public const val `DS_BEHAVIOR_WIN2016`: UInt = 7u;
public const val `DS_BEHAVIOR_WIN7`: UInt = 4u;
public const val `DS_BEHAVIOR_WIN8`: UInt = 5u;
public const val `DS_BEHAVIOR_WINBLUE`: UInt = 6u;
public const val `DS_BEHAVIOR_WINTHRESHOLD`: UInt = 7u;
public const val `DS_CANONICAL_NAME`: `DS_NAME_FORMAT` = 7;
public const val `DS_CANONICAL_NAME_EX`: `DS_NAME_FORMAT` = 9;
public const val `DS_CLOSEST_FLAG`: UInt = 128u;
public const val `DS_DIRECTORY_SERVICE_10_REQUIRED`: UInt = 8388608u;
public const val `DS_DIRECTORY_SERVICE_6_REQUIRED`: UInt = 524288u;
public const val `DS_DIRECTORY_SERVICE_8_REQUIRED`: UInt = 2097152u;
public const val `DS_DIRECTORY_SERVICE_9_REQUIRED`: UInt = 4194304u;
public const val `DS_DIRECTORY_SERVICE_PREFERRED`: UInt = 32u;
public const val `DS_DIRECTORY_SERVICE_REQUIRED`: UInt = 16u;
public const val `DS_DISPLAY_NAME`: `DS_NAME_FORMAT` = 3;
public const val `DS_DNS_CONTROLLER_FLAG`: UInt = 536870912u;
public const val `DS_DNS_DOMAIN_FLAG`: UInt = 1073741824u;
public const val `DS_DNS_DOMAIN_NAME`: `DS_NAME_FORMAT` = 12;
public const val `DS_DNS_FOREST_FLAG`: UInt = 2147483648u;
// UNSUPPORTED Rust 1481:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DS_DOMAIN_CONTROLLER_INFO_1A {
//     pub NetbiosName: windows_sys::core::PSTR,
//     pub DnsHostName: windows_sys::core::PSTR,
//     pub SiteName: windows_sys::core::PSTR,
//     pub ComputerObjectName: windows_sys::core::PSTR,
//     pub ServerObjectName: windows_sys::core::PSTR,
//     pub fIsPdc: windows_sys::core::BOOL,
//     pub fDsEnabled: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 1492:1: declaration Impl has no candidate rule
// impl Default for DS_DOMAIN_CONTROLLER_INFO_1A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1497:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DS_DOMAIN_CONTROLLER_INFO_1W {
//     pub NetbiosName: windows_sys::core::PWSTR,
//     pub DnsHostName: windows_sys::core::PWSTR,
//     pub SiteName: windows_sys::core::PWSTR,
//     pub ComputerObjectName: windows_sys::core::PWSTR,
//     pub ServerObjectName: windows_sys::core::PWSTR,
//     pub fIsPdc: windows_sys::core::BOOL,
//     pub fDsEnabled: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 1508:1: declaration Impl has no candidate rule
// impl Default for DS_DOMAIN_CONTROLLER_INFO_1W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1513:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DS_DOMAIN_CONTROLLER_INFO_2A {
//     pub NetbiosName: windows_sys::core::PSTR,
//     pub DnsHostName: windows_sys::core::PSTR,
//     pub SiteName: windows_sys::core::PSTR,
//     pub SiteObjectName: windows_sys::core::PSTR,
//     pub ComputerObjectName: windows_sys::core::PSTR,
//     pub ServerObjectName: windows_sys::core::PSTR,
//     pub NtdsDsaObjectName: windows_sys::core::PSTR,
//     pub fIsPdc: windows_sys::core::BOOL,
//     pub fDsEnabled: windows_sys::core::BOOL,
//     pub fIsGc: windows_sys::core::BOOL,
//     pub SiteObjectGuid: windows_sys::core::GUID,
//     pub ComputerObjectGuid: windows_sys::core::GUID,
//     pub ServerObjectGuid: windows_sys::core::GUID,
//     pub NtdsDsaObjectGuid: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 1531:1: declaration Impl has no candidate rule
// impl Default for DS_DOMAIN_CONTROLLER_INFO_2A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1536:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DS_DOMAIN_CONTROLLER_INFO_2W {
//     pub NetbiosName: windows_sys::core::PWSTR,
//     pub DnsHostName: windows_sys::core::PWSTR,
//     pub SiteName: windows_sys::core::PWSTR,
//     pub SiteObjectName: windows_sys::core::PWSTR,
//     pub ComputerObjectName: windows_sys::core::PWSTR,
//     pub ServerObjectName: windows_sys::core::PWSTR,
//     pub NtdsDsaObjectName: windows_sys::core::PWSTR,
//     pub fIsPdc: windows_sys::core::BOOL,
//     pub fDsEnabled: windows_sys::core::BOOL,
//     pub fIsGc: windows_sys::core::BOOL,
//     pub SiteObjectGuid: windows_sys::core::GUID,
//     pub ComputerObjectGuid: windows_sys::core::GUID,
//     pub ServerObjectGuid: windows_sys::core::GUID,
//     pub NtdsDsaObjectGuid: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 1554:1: declaration Impl has no candidate rule
// impl Default for DS_DOMAIN_CONTROLLER_INFO_2W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1559:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DS_DOMAIN_CONTROLLER_INFO_3A {
//     pub NetbiosName: windows_sys::core::PSTR,
//     pub DnsHostName: windows_sys::core::PSTR,
//     pub SiteName: windows_sys::core::PSTR,
//     pub SiteObjectName: windows_sys::core::PSTR,
//     pub ComputerObjectName: windows_sys::core::PSTR,
//     pub ServerObjectName: windows_sys::core::PSTR,
//     pub NtdsDsaObjectName: windows_sys::core::PSTR,
//     pub fIsPdc: windows_sys::core::BOOL,
//     pub fDsEnabled: windows_sys::core::BOOL,
//     pub fIsGc: windows_sys::core::BOOL,
//     pub fIsRodc: windows_sys::core::BOOL,
//     pub SiteObjectGuid: windows_sys::core::GUID,
//     pub ComputerObjectGuid: windows_sys::core::GUID,
//     pub ServerObjectGuid: windows_sys::core::GUID,
//     pub NtdsDsaObjectGuid: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 1578:1: declaration Impl has no candidate rule
// impl Default for DS_DOMAIN_CONTROLLER_INFO_3A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1583:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DS_DOMAIN_CONTROLLER_INFO_3W {
//     pub NetbiosName: windows_sys::core::PWSTR,
//     pub DnsHostName: windows_sys::core::PWSTR,
//     pub SiteName: windows_sys::core::PWSTR,
//     pub SiteObjectName: windows_sys::core::PWSTR,
//     pub ComputerObjectName: windows_sys::core::PWSTR,
//     pub ServerObjectName: windows_sys::core::PWSTR,
//     pub NtdsDsaObjectName: windows_sys::core::PWSTR,
//     pub fIsPdc: windows_sys::core::BOOL,
//     pub fDsEnabled: windows_sys::core::BOOL,
//     pub fIsGc: windows_sys::core::BOOL,
//     pub fIsRodc: windows_sys::core::BOOL,
//     pub SiteObjectGuid: windows_sys::core::GUID,
//     pub ComputerObjectGuid: windows_sys::core::GUID,
//     pub ServerObjectGuid: windows_sys::core::GUID,
//     pub NtdsDsaObjectGuid: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 1602:1: declaration Impl has no candidate rule
// impl Default for DS_DOMAIN_CONTROLLER_INFO_3W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DS_DOMAIN_DIRECT_INBOUND`: UInt = 32u;
public const val `DS_DOMAIN_DIRECT_OUTBOUND`: UInt = 2u;
public const val `DS_DOMAIN_IN_FOREST`: UInt = 1u;
public const val `DS_DOMAIN_NATIVE_MODE`: UInt = 16u;
public const val `DS_DOMAIN_PRIMARY`: UInt = 8u;
public const val `DS_DOMAIN_TREE_ROOT`: UInt = 4u;
// UNSUPPORTED Rust 1613:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct DS_DOMAIN_TRUSTSA {
//     pub NetbiosDomainName: windows_sys::core::PSTR,
//     pub DnsDomainName: windows_sys::core::PSTR,
//     pub Flags: u32,
//     pub ParentIndex: u32,
//     pub TrustType: u32,
//     pub TrustAttributes: u32,
//     pub DomainSid: super::super::Security::PSID,
//     pub DomainGuid: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 1626:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for DS_DOMAIN_TRUSTSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1632:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct DS_DOMAIN_TRUSTSW {
//     pub NetbiosDomainName: windows_sys::core::PWSTR,
//     pub DnsDomainName: windows_sys::core::PWSTR,
//     pub Flags: u32,
//     pub ParentIndex: u32,
//     pub TrustType: u32,
//     pub TrustAttributes: u32,
//     pub DomainSid: super::super::Security::PSID,
//     pub DomainGuid: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 1645:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for DS_DOMAIN_TRUSTSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DS_DS_10_FLAG`: UInt = 65536u;
public const val `DS_DS_8_FLAG`: UInt = 16384u;
public const val `DS_DS_9_FLAG`: UInt = 32768u;
public const val `DS_DS_FLAG`: UInt = 16u;
public const val `DS_EXIST_ADVISORY_MODE`: UInt = 1u;
public const val `DS_FORCE_REDISCOVERY`: UInt = 1u;
public const val `DS_FQDN_1779_NAME`: `DS_NAME_FORMAT` = 1;
public const val `DS_FULL_SECRET_DOMAIN_6_FLAG`: UInt = 4096u;
public const val `DS_GC_FLAG`: UInt = 4u;
public const val `DS_GC_SERVER_REQUIRED`: UInt = 64u;
public const val `DS_GFTI_UPDATE_TDO`: UInt = 1u;
public const val `DS_GFTI_VALID_FLAGS`: UInt = 1u;
public const val `DS_GOOD_TIMESERV_FLAG`: UInt = 512u;
public const val `DS_GOOD_TIMESERV_PREFERRED`: UInt = 8192u;
public const val `DS_INSTANCETYPE_IS_NC_HEAD`: UInt = 1u;
public const val `DS_INSTANCETYPE_NC_COMING`: UInt = 16u;
public const val `DS_INSTANCETYPE_NC_GOING`: UInt = 32u;
public const val `DS_INSTANCETYPE_NC_IS_WRITEABLE`: UInt = 4u;
public const val `DS_IP_REQUIRED`: UInt = 512u;
public const val `DS_IS_DNS_NAME`: UInt = 131072u;
public const val `DS_IS_FLAT_NAME`: UInt = 65536u;
public const val `DS_KCC_FLAG_ASYNC_OP`: UInt = 1u;
public const val `DS_KCC_FLAG_DAMPED`: UInt = 2u;
public typealias `DS_KCC_TASKID` = Int;
public const val `DS_KCC_TASKID_UPDATE_TOPOLOGY`: `DS_KCC_TASKID` = 0;
public const val `DS_KDC_FLAG`: UInt = 32u;
public const val `DS_KDC_REQUIRED`: UInt = 1024u;
public const val `DS_KEY_LIST_FLAG`: UInt = 131072u;
public const val `DS_KEY_LIST_SUPPORT_REQUIRED`: UInt = 16777216u;
public const val `DS_LDAP_FLAG`: UInt = 8u;
public const val `DS_LIST_ACCOUNT_OBJECT_FOR_SERVER`: UInt = 2u;
public const val `DS_LIST_DNS_HOST_NAME_FOR_SERVER`: UInt = 1u;
public const val `DS_LIST_DSA_OBJECT_FOR_SERVER`: UInt = 0u;
public typealias `DS_MANGLE_FOR` = Int;
public const val `DS_MANGLE_OBJECT_RDN_FOR_DELETION`: `DS_MANGLE_FOR` = 1;
public const val `DS_MANGLE_OBJECT_RDN_FOR_NAME_CONFLICT`: `DS_MANGLE_FOR` = 2;
public const val `DS_MANGLE_UNKNOWN`: `DS_MANGLE_FOR` = 0;
public typealias `DS_NAME_ERROR` = Int;
public const val `DS_NAME_ERROR_DOMAIN_ONLY`: `DS_NAME_ERROR` = 5;
public const val `DS_NAME_ERROR_NOT_FOUND`: `DS_NAME_ERROR` = 2;
public const val `DS_NAME_ERROR_NOT_UNIQUE`: `DS_NAME_ERROR` = 3;
public const val `DS_NAME_ERROR_NO_MAPPING`: `DS_NAME_ERROR` = 4;
public const val `DS_NAME_ERROR_NO_SYNTACTICAL_MAPPING`: `DS_NAME_ERROR` = 6;
public const val `DS_NAME_ERROR_RESOLVING`: `DS_NAME_ERROR` = 1;
public const val `DS_NAME_ERROR_TRUST_REFERRAL`: `DS_NAME_ERROR` = 7;
public typealias `DS_NAME_FLAGS` = Int;
public const val `DS_NAME_FLAG_EVAL_AT_DC`: `DS_NAME_FLAGS` = 2;
public const val `DS_NAME_FLAG_GCVERIFY`: `DS_NAME_FLAGS` = 4;
public const val `DS_NAME_FLAG_SYNTACTICAL_ONLY`: `DS_NAME_FLAGS` = 1;
public const val `DS_NAME_FLAG_TRUST_REFERRAL`: `DS_NAME_FLAGS` = 8;
public typealias `DS_NAME_FORMAT` = Int;
public const val `DS_NAME_NO_ERROR`: `DS_NAME_ERROR` = 0;
public const val `DS_NAME_NO_FLAGS`: `DS_NAME_FLAGS` = 0;
// UNSUPPORTED Rust 1704:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DS_NAME_RESULTA {
//     pub cItems: u32,
//     pub rItems: *mut DS_NAME_RESULT_ITEMA,
// }

// UNSUPPORTED Rust 1710:1: declaration Impl has no candidate rule
// impl Default for DS_NAME_RESULTA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1715:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DS_NAME_RESULTW {
//     pub cItems: u32,
//     pub rItems: *mut DS_NAME_RESULT_ITEMW,
// }

// UNSUPPORTED Rust 1721:1: declaration Impl has no candidate rule
// impl Default for DS_NAME_RESULTW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1726:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DS_NAME_RESULT_ITEMA {
//     pub status: u32,
//     pub pDomain: windows_sys::core::PSTR,
//     pub pName: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 1733:1: declaration Impl has no candidate rule
// impl Default for DS_NAME_RESULT_ITEMA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1738:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DS_NAME_RESULT_ITEMW {
//     pub status: u32,
//     pub pDomain: windows_sys::core::PWSTR,
//     pub pName: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 1745:1: declaration Impl has no candidate rule
// impl Default for DS_NAME_RESULT_ITEMW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DS_NDNC_FLAG`: UInt = 1024u;
public const val `DS_NOTIFY_AFTER_SITE_RECORDS`: UInt = 2u;
public const val `DS_NT4_ACCOUNT_NAME`: `DS_NAME_FORMAT` = 2;
public const val `DS_ONLY_DO_SITE_NAME`: UInt = 1u;
public const val `DS_ONLY_LDAP_NEEDED`: UInt = 32768u;
public const val `DS_PDC_FLAG`: UInt = 1u;
public const val `DS_PDC_REQUIRED`: UInt = 128u;
public const val `DS_PING_FLAGS`: UInt = 1048575u;
// UNSUPPORTED Rust 1758:1: non-scalar type Ptr unsupported
// pub const DS_PROP_ADMIN_PREFIX: windows_sys::core::PCWSTR = windows_sys::core::w!("admin");

// UNSUPPORTED Rust 1759:1: non-scalar type Ptr unsupported
// pub const DS_PROP_SHELL_PREFIX: windows_sys::core::PCWSTR = windows_sys::core::w!("shell");

public const val `DS_REPADD_ASYNCHRONOUS_OPERATION`: UInt = 1u;
public const val `DS_REPADD_ASYNCHRONOUS_REPLICA`: UInt = 32u;
public const val `DS_REPADD_CRITICAL`: UInt = 2048u;
public const val `DS_REPADD_DISABLE_NOTIFICATION`: UInt = 64u;
public const val `DS_REPADD_DISABLE_PERIODIC`: UInt = 128u;
public const val `DS_REPADD_INITIAL`: UInt = 4u;
public const val `DS_REPADD_INTERSITE_MESSAGING`: UInt = 16u;
public const val `DS_REPADD_NEVER_NOTIFY`: UInt = 512u;
public const val `DS_REPADD_NONGC_RO_REPLICA`: UInt = 16777216u;
public const val `DS_REPADD_PERIODIC`: UInt = 8u;
public const val `DS_REPADD_SELECT_SECRETS`: UInt = 4096u;
public const val `DS_REPADD_TWO_WAY`: UInt = 1024u;
public const val `DS_REPADD_USE_COMPRESSION`: UInt = 256u;
public const val `DS_REPADD_WRITEABLE`: UInt = 2u;
public const val `DS_REPDEL_ASYNCHRONOUS_OPERATION`: UInt = 1u;
public const val `DS_REPDEL_IGNORE_ERRORS`: UInt = 8u;
public const val `DS_REPDEL_INTERSITE_MESSAGING`: UInt = 4u;
public const val `DS_REPDEL_LOCAL_ONLY`: UInt = 16u;
public const val `DS_REPDEL_NO_SOURCE`: UInt = 32u;
public const val `DS_REPDEL_REF_OK`: UInt = 64u;
public const val `DS_REPDEL_WRITEABLE`: UInt = 2u;
// UNSUPPORTED Rust 1781:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DS_REPL_ATTR_META_DATA {
//     pub pszAttributeName: windows_sys::core::PWSTR,
//     pub dwVersion: u32,
//     pub ftimeLastOriginatingChange: super::super::Foundation::FILETIME,
//     pub uuidLastOriginatingDsaInvocationID: windows_sys::core::GUID,
//     pub usnOriginatingChange: i64,
//     pub usnLocalChange: i64,
// }

// UNSUPPORTED Rust 1791:1: declaration Impl has no candidate rule
// impl Default for DS_REPL_ATTR_META_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1796:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DS_REPL_ATTR_META_DATA_2 {
//     pub pszAttributeName: windows_sys::core::PWSTR,
//     pub dwVersion: u32,
//     pub ftimeLastOriginatingChange: super::super::Foundation::FILETIME,
//     pub uuidLastOriginatingDsaInvocationID: windows_sys::core::GUID,
//     pub usnOriginatingChange: i64,
//     pub usnLocalChange: i64,
//     pub pszLastOriginatingDsaDN: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 1807:1: declaration Impl has no candidate rule
// impl Default for DS_REPL_ATTR_META_DATA_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1812:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DS_REPL_ATTR_META_DATA_BLOB {
//     pub oszAttributeName: u32,
//     pub dwVersion: u32,
//     pub ftimeLastOriginatingChange: super::super::Foundation::FILETIME,
//     pub uuidLastOriginatingDsaInvocationID: windows_sys::core::GUID,
//     pub usnOriginatingChange: i64,
//     pub usnLocalChange: i64,
//     pub oszLastOriginatingDsaDN: u32,
// }

// UNSUPPORTED Rust 1823:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DS_REPL_ATTR_VALUE_META_DATA {
//     pub cNumEntries: u32,
//     pub dwEnumerationContext: u32,
//     pub rgMetaData: [DS_REPL_VALUE_META_DATA; 1],
// }

// UNSUPPORTED Rust 1830:1: declaration Impl has no candidate rule
// impl Default for DS_REPL_ATTR_VALUE_META_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1835:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DS_REPL_ATTR_VALUE_META_DATA_2 {
//     pub cNumEntries: u32,
//     pub dwEnumerationContext: u32,
//     pub rgMetaData: [DS_REPL_VALUE_META_DATA_2; 1],
// }

// UNSUPPORTED Rust 1842:1: declaration Impl has no candidate rule
// impl Default for DS_REPL_ATTR_VALUE_META_DATA_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1847:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DS_REPL_ATTR_VALUE_META_DATA_EXT {
//     pub cNumEntries: u32,
//     pub dwEnumerationContext: u32,
//     pub rgMetaData: [DS_REPL_VALUE_META_DATA_EXT; 1],
// }

// UNSUPPORTED Rust 1854:1: declaration Impl has no candidate rule
// impl Default for DS_REPL_ATTR_VALUE_META_DATA_EXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1859:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DS_REPL_CURSOR {
//     pub uuidSourceDsaInvocationID: windows_sys::core::GUID,
//     pub usnAttributeFilter: i64,
// }

// UNSUPPORTED Rust 1865:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DS_REPL_CURSORS {
//     pub cNumCursors: u32,
//     pub dwReserved: u32,
//     pub rgCursor: [DS_REPL_CURSOR; 1],
// }

// UNSUPPORTED Rust 1872:1: declaration Impl has no candidate rule
// impl Default for DS_REPL_CURSORS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1877:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DS_REPL_CURSORS_2 {
//     pub cNumCursors: u32,
//     pub dwEnumerationContext: u32,
//     pub rgCursor: [DS_REPL_CURSOR_2; 1],
// }

// UNSUPPORTED Rust 1884:1: declaration Impl has no candidate rule
// impl Default for DS_REPL_CURSORS_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1889:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DS_REPL_CURSORS_3W {
//     pub cNumCursors: u32,
//     pub dwEnumerationContext: u32,
//     pub rgCursor: [DS_REPL_CURSOR_3W; 1],
// }

// UNSUPPORTED Rust 1896:1: declaration Impl has no candidate rule
// impl Default for DS_REPL_CURSORS_3W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1901:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DS_REPL_CURSOR_2 {
//     pub uuidSourceDsaInvocationID: windows_sys::core::GUID,
//     pub usnAttributeFilter: i64,
//     pub ftimeLastSyncSuccess: super::super::Foundation::FILETIME,
// }

// UNSUPPORTED Rust 1908:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DS_REPL_CURSOR_3W {
//     pub uuidSourceDsaInvocationID: windows_sys::core::GUID,
//     pub usnAttributeFilter: i64,
//     pub ftimeLastSyncSuccess: super::super::Foundation::FILETIME,
//     pub pszSourceDsaDN: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 1916:1: declaration Impl has no candidate rule
// impl Default for DS_REPL_CURSOR_3W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1921:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DS_REPL_CURSOR_BLOB {
//     pub uuidSourceDsaInvocationID: windows_sys::core::GUID,
//     pub usnAttributeFilter: i64,
//     pub ftimeLastSyncSuccess: super::super::Foundation::FILETIME,
//     pub oszSourceDsaDN: u32,
// }

public const val `DS_REPL_INFO_CURSORS_2_FOR_NC`: `DS_REPL_INFO_TYPE` = 7;
public const val `DS_REPL_INFO_CURSORS_3_FOR_NC`: `DS_REPL_INFO_TYPE` = 8;
public const val `DS_REPL_INFO_CURSORS_FOR_NC`: `DS_REPL_INFO_TYPE` = 1;
public const val `DS_REPL_INFO_FLAG_IMPROVE_LINKED_ATTRS`: UInt = 1u;
public const val `DS_REPL_INFO_KCC_DSA_CONNECT_FAILURES`: `DS_REPL_INFO_TYPE` = 3;
public const val `DS_REPL_INFO_KCC_DSA_LINK_FAILURES`: `DS_REPL_INFO_TYPE` = 4;
public const val `DS_REPL_INFO_METADATA_2_FOR_ATTR_VALUE`: `DS_REPL_INFO_TYPE` = 10;
public const val `DS_REPL_INFO_METADATA_2_FOR_OBJ`: `DS_REPL_INFO_TYPE` = 9;
public const val `DS_REPL_INFO_METADATA_EXT_FOR_ATTR_VALUE`: `DS_REPL_INFO_TYPE` = 11;
public const val `DS_REPL_INFO_METADATA_FOR_ATTR_VALUE`: `DS_REPL_INFO_TYPE` = 6;
public const val `DS_REPL_INFO_METADATA_FOR_OBJ`: `DS_REPL_INFO_TYPE` = 2;
public const val `DS_REPL_INFO_NEIGHBORS`: `DS_REPL_INFO_TYPE` = 0;
public const val `DS_REPL_INFO_PENDING_OPS`: `DS_REPL_INFO_TYPE` = 5;
public typealias `DS_REPL_INFO_TYPE` = Int;
public const val `DS_REPL_INFO_TYPE_MAX`: `DS_REPL_INFO_TYPE` = 12;
// UNSUPPORTED Rust 1944:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DS_REPL_KCC_DSA_FAILURESW {
//     pub cNumEntries: u32,
//     pub dwReserved: u32,
//     pub rgDsaFailure: [DS_REPL_KCC_DSA_FAILUREW; 1],
// }

// UNSUPPORTED Rust 1951:1: declaration Impl has no candidate rule
// impl Default for DS_REPL_KCC_DSA_FAILURESW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1956:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DS_REPL_KCC_DSA_FAILUREW {
//     pub pszDsaDN: windows_sys::core::PWSTR,
//     pub uuidDsaObjGuid: windows_sys::core::GUID,
//     pub ftimeFirstFailure: super::super::Foundation::FILETIME,
//     pub cNumFailures: u32,
//     pub dwLastResult: u32,
// }

// UNSUPPORTED Rust 1965:1: declaration Impl has no candidate rule
// impl Default for DS_REPL_KCC_DSA_FAILUREW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1970:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DS_REPL_KCC_DSA_FAILUREW_BLOB {
//     pub oszDsaDN: u32,
//     pub uuidDsaObjGuid: windows_sys::core::GUID,
//     pub ftimeFirstFailure: super::super::Foundation::FILETIME,
//     pub cNumFailures: u32,
//     pub dwLastResult: u32,
// }

public const val `DS_REPL_NBR_COMPRESS_CHANGES`: UInt = 268435456u;
public const val `DS_REPL_NBR_DISABLE_SCHEDULED_SYNC`: UInt = 134217728u;
public const val `DS_REPL_NBR_DO_SCHEDULED_SYNCS`: UInt = 64u;
public const val `DS_REPL_NBR_FULL_SYNC_IN_PROGRESS`: UInt = 65536u;
public const val `DS_REPL_NBR_FULL_SYNC_NEXT_PACKET`: UInt = 131072u;
public const val `DS_REPL_NBR_GCSPN`: UInt = 1048576u;
public const val `DS_REPL_NBR_IGNORE_CHANGE_NOTIFICATIONS`: UInt = 67108864u;
public const val `DS_REPL_NBR_NEVER_SYNCED`: UInt = 2097152u;
public const val `DS_REPL_NBR_NONGC_RO_REPLICA`: UInt = 1024u;
public const val `DS_REPL_NBR_NO_CHANGE_NOTIFICATIONS`: UInt = 536870912u;
public const val `DS_REPL_NBR_PARTIAL_ATTRIBUTE_SET`: UInt = 1073741824u;
public const val `DS_REPL_NBR_PREEMPTED`: UInt = 16777216u;
public const val `DS_REPL_NBR_RETURN_OBJECT_PARENTS`: UInt = 2048u;
public const val `DS_REPL_NBR_SELECT_SECRETS`: UInt = 4096u;
public const val `DS_REPL_NBR_SYNC_ON_STARTUP`: UInt = 32u;
public const val `DS_REPL_NBR_TWO_WAY_SYNC`: UInt = 512u;
public const val `DS_REPL_NBR_USE_ASYNC_INTERSITE_TRANSPORT`: UInt = 128u;
public const val `DS_REPL_NBR_WRITEABLE`: UInt = 16u;
// UNSUPPORTED Rust 1997:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DS_REPL_NEIGHBORSW {
//     pub cNumNeighbors: u32,
//     pub dwReserved: u32,
//     pub rgNeighbor: [DS_REPL_NEIGHBORW; 1],
// }

// UNSUPPORTED Rust 2004:1: declaration Impl has no candidate rule
// impl Default for DS_REPL_NEIGHBORSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2009:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DS_REPL_NEIGHBORW {
//     pub pszNamingContext: windows_sys::core::PWSTR,
//     pub pszSourceDsaDN: windows_sys::core::PWSTR,
//     pub pszSourceDsaAddress: windows_sys::core::PWSTR,
//     pub pszAsyncIntersiteTransportDN: windows_sys::core::PWSTR,
//     pub dwReplicaFlags: u32,
//     pub dwReserved: u32,
//     pub uuidNamingContextObjGuid: windows_sys::core::GUID,
//     pub uuidSourceDsaObjGuid: windows_sys::core::GUID,
//     pub uuidSourceDsaInvocationID: windows_sys::core::GUID,
//     pub uuidAsyncIntersiteTransportObjGuid: windows_sys::core::GUID,
//     pub usnLastObjChangeSynced: i64,
//     pub usnAttributeFilter: i64,
//     pub ftimeLastSyncSuccess: super::super::Foundation::FILETIME,
//     pub ftimeLastSyncAttempt: super::super::Foundation::FILETIME,
//     pub dwLastSyncResult: u32,
//     pub cNumConsecutiveSyncFailures: u32,
// }

// UNSUPPORTED Rust 2029:1: declaration Impl has no candidate rule
// impl Default for DS_REPL_NEIGHBORW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2034:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DS_REPL_NEIGHBORW_BLOB {
//     pub oszNamingContext: u32,
//     pub oszSourceDsaDN: u32,
//     pub oszSourceDsaAddress: u32,
//     pub oszAsyncIntersiteTransportDN: u32,
//     pub dwReplicaFlags: u32,
//     pub dwReserved: u32,
//     pub uuidNamingContextObjGuid: windows_sys::core::GUID,
//     pub uuidSourceDsaObjGuid: windows_sys::core::GUID,
//     pub uuidSourceDsaInvocationID: windows_sys::core::GUID,
//     pub uuidAsyncIntersiteTransportObjGuid: windows_sys::core::GUID,
//     pub usnLastObjChangeSynced: i64,
//     pub usnAttributeFilter: i64,
//     pub ftimeLastSyncSuccess: super::super::Foundation::FILETIME,
//     pub ftimeLastSyncAttempt: super::super::Foundation::FILETIME,
//     pub dwLastSyncResult: u32,
//     pub cNumConsecutiveSyncFailures: u32,
// }

// UNSUPPORTED Rust 2054:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DS_REPL_OBJ_META_DATA {
//     pub cNumEntries: u32,
//     pub dwReserved: u32,
//     pub rgMetaData: [DS_REPL_ATTR_META_DATA; 1],
// }

// UNSUPPORTED Rust 2061:1: declaration Impl has no candidate rule
// impl Default for DS_REPL_OBJ_META_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2066:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DS_REPL_OBJ_META_DATA_2 {
//     pub cNumEntries: u32,
//     pub dwReserved: u32,
//     pub rgMetaData: [DS_REPL_ATTR_META_DATA_2; 1],
// }

// UNSUPPORTED Rust 2073:1: declaration Impl has no candidate rule
// impl Default for DS_REPL_OBJ_META_DATA_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2078:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DS_REPL_OPW {
//     pub ftimeEnqueued: super::super::Foundation::FILETIME,
//     pub ulSerialNumber: u32,
//     pub ulPriority: u32,
//     pub OpType: DS_REPL_OP_TYPE,
//     pub ulOptions: u32,
//     pub pszNamingContext: windows_sys::core::PWSTR,
//     pub pszDsaDN: windows_sys::core::PWSTR,
//     pub pszDsaAddress: windows_sys::core::PWSTR,
//     pub uuidNamingContextObjGuid: windows_sys::core::GUID,
//     pub uuidDsaObjGuid: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 2092:1: declaration Impl has no candidate rule
// impl Default for DS_REPL_OPW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2097:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DS_REPL_OPW_BLOB {
//     pub ftimeEnqueued: super::super::Foundation::FILETIME,
//     pub ulSerialNumber: u32,
//     pub ulPriority: u32,
//     pub OpType: DS_REPL_OP_TYPE,
//     pub ulOptions: u32,
//     pub oszNamingContext: u32,
//     pub oszDsaDN: u32,
//     pub oszDsaAddress: u32,
//     pub uuidNamingContextObjGuid: windows_sys::core::GUID,
//     pub uuidDsaObjGuid: windows_sys::core::GUID,
// }

public typealias `DS_REPL_OP_TYPE` = Int;
public const val `DS_REPL_OP_TYPE_ADD`: `DS_REPL_OP_TYPE` = 1;
public const val `DS_REPL_OP_TYPE_DELETE`: `DS_REPL_OP_TYPE` = 2;
public const val `DS_REPL_OP_TYPE_MODIFY`: `DS_REPL_OP_TYPE` = 3;
public const val `DS_REPL_OP_TYPE_SYNC`: `DS_REPL_OP_TYPE` = 0;
public const val `DS_REPL_OP_TYPE_UPDATE_REFS`: `DS_REPL_OP_TYPE` = 4;
// UNSUPPORTED Rust 2117:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DS_REPL_PENDING_OPSW {
//     pub ftimeCurrentOpStarted: super::super::Foundation::FILETIME,
//     pub cNumPendingOps: u32,
//     pub rgPendingOp: [DS_REPL_OPW; 1],
// }

// UNSUPPORTED Rust 2124:1: declaration Impl has no candidate rule
// impl Default for DS_REPL_PENDING_OPSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2129:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DS_REPL_QUEUE_STATISTICSW {
//     pub ftimeCurrentOpStarted: super::super::Foundation::FILETIME,
//     pub cNumPendingOps: u32,
//     pub ftimeOldestSync: super::super::Foundation::FILETIME,
//     pub ftimeOldestAdd: super::super::Foundation::FILETIME,
//     pub ftimeOldestMod: super::super::Foundation::FILETIME,
//     pub ftimeOldestDel: super::super::Foundation::FILETIME,
//     pub ftimeOldestUpdRefs: super::super::Foundation::FILETIME,
// }

// UNSUPPORTED Rust 2140:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DS_REPL_VALUE_META_DATA {
//     pub pszAttributeName: windows_sys::core::PWSTR,
//     pub pszObjectDn: windows_sys::core::PWSTR,
//     pub cbData: u32,
//     pub pbData: *mut u8,
//     pub ftimeDeleted: super::super::Foundation::FILETIME,
//     pub ftimeCreated: super::super::Foundation::FILETIME,
//     pub dwVersion: u32,
//     pub ftimeLastOriginatingChange: super::super::Foundation::FILETIME,
//     pub uuidLastOriginatingDsaInvocationID: windows_sys::core::GUID,
//     pub usnOriginatingChange: i64,
//     pub usnLocalChange: i64,
// }

// UNSUPPORTED Rust 2155:1: declaration Impl has no candidate rule
// impl Default for DS_REPL_VALUE_META_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2160:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DS_REPL_VALUE_META_DATA_2 {
//     pub pszAttributeName: windows_sys::core::PWSTR,
//     pub pszObjectDn: windows_sys::core::PWSTR,
//     pub cbData: u32,
//     pub pbData: *mut u8,
//     pub ftimeDeleted: super::super::Foundation::FILETIME,
//     pub ftimeCreated: super::super::Foundation::FILETIME,
//     pub dwVersion: u32,
//     pub ftimeLastOriginatingChange: super::super::Foundation::FILETIME,
//     pub uuidLastOriginatingDsaInvocationID: windows_sys::core::GUID,
//     pub usnOriginatingChange: i64,
//     pub usnLocalChange: i64,
//     pub pszLastOriginatingDsaDN: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 2176:1: declaration Impl has no candidate rule
// impl Default for DS_REPL_VALUE_META_DATA_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2181:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DS_REPL_VALUE_META_DATA_BLOB {
//     pub oszAttributeName: u32,
//     pub oszObjectDn: u32,
//     pub cbData: u32,
//     pub obData: u32,
//     pub ftimeDeleted: super::super::Foundation::FILETIME,
//     pub ftimeCreated: super::super::Foundation::FILETIME,
//     pub dwVersion: u32,
//     pub ftimeLastOriginatingChange: super::super::Foundation::FILETIME,
//     pub uuidLastOriginatingDsaInvocationID: windows_sys::core::GUID,
//     pub usnOriginatingChange: i64,
//     pub usnLocalChange: i64,
//     pub oszLastOriginatingDsaDN: u32,
// }

// UNSUPPORTED Rust 2197:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DS_REPL_VALUE_META_DATA_BLOB_EXT {
//     pub oszAttributeName: u32,
//     pub oszObjectDn: u32,
//     pub cbData: u32,
//     pub obData: u32,
//     pub ftimeDeleted: super::super::Foundation::FILETIME,
//     pub ftimeCreated: super::super::Foundation::FILETIME,
//     pub dwVersion: u32,
//     pub ftimeLastOriginatingChange: super::super::Foundation::FILETIME,
//     pub uuidLastOriginatingDsaInvocationID: windows_sys::core::GUID,
//     pub usnOriginatingChange: i64,
//     pub usnLocalChange: i64,
//     pub oszLastOriginatingDsaDN: u32,
//     pub dwUserIdentifier: u32,
//     pub dwPriorLinkState: u32,
//     pub dwCurrentLinkState: u32,
// }

// UNSUPPORTED Rust 2216:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DS_REPL_VALUE_META_DATA_EXT {
//     pub pszAttributeName: windows_sys::core::PWSTR,
//     pub pszObjectDn: windows_sys::core::PWSTR,
//     pub cbData: u32,
//     pub pbData: *mut u8,
//     pub ftimeDeleted: super::super::Foundation::FILETIME,
//     pub ftimeCreated: super::super::Foundation::FILETIME,
//     pub dwVersion: u32,
//     pub ftimeLastOriginatingChange: super::super::Foundation::FILETIME,
//     pub uuidLastOriginatingDsaInvocationID: windows_sys::core::GUID,
//     pub usnOriginatingChange: i64,
//     pub usnLocalChange: i64,
//     pub pszLastOriginatingDsaDN: windows_sys::core::PWSTR,
//     pub dwUserIdentifier: u32,
//     pub dwPriorLinkState: u32,
//     pub dwCurrentLinkState: u32,
// }

// UNSUPPORTED Rust 2235:1: declaration Impl has no candidate rule
// impl Default for DS_REPL_VALUE_META_DATA_EXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DS_REPMOD_ASYNCHRONOUS_OPERATION`: UInt = 1u;
public const val `DS_REPMOD_UPDATE_ADDRESS`: UInt = 2u;
public const val `DS_REPMOD_UPDATE_FLAGS`: UInt = 1u;
public const val `DS_REPMOD_UPDATE_INSTANCE`: UInt = 2u;
public const val `DS_REPMOD_UPDATE_RESULT`: UInt = 8u;
public const val `DS_REPMOD_UPDATE_SCHEDULE`: UInt = 4u;
public const val `DS_REPMOD_UPDATE_TRANSPORT`: UInt = 16u;
public const val `DS_REPMOD_WRITEABLE`: UInt = 2u;
public const val `DS_REPSYNCALL_ABORT_IF_SERVER_UNAVAILABLE`: UInt = 1u;
public const val `DS_REPSYNCALL_CROSS_SITE_BOUNDARIES`: UInt = 64u;
public const val `DS_REPSYNCALL_DO_NOT_SYNC`: UInt = 8u;
// UNSUPPORTED Rust 2251:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DS_REPSYNCALL_ERRINFOA {
//     pub pszSvrId: windows_sys::core::PSTR,
//     pub error: DS_REPSYNCALL_ERROR,
//     pub dwWin32Err: u32,
//     pub pszSrcId: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 2259:1: declaration Impl has no candidate rule
// impl Default for DS_REPSYNCALL_ERRINFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2264:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DS_REPSYNCALL_ERRINFOW {
//     pub pszSvrId: windows_sys::core::PWSTR,
//     pub error: DS_REPSYNCALL_ERROR,
//     pub dwWin32Err: u32,
//     pub pszSrcId: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 2272:1: declaration Impl has no candidate rule
// impl Default for DS_REPSYNCALL_ERRINFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DS_REPSYNCALL_ERROR` = Int;
public typealias `DS_REPSYNCALL_EVENT` = Int;
public const val `DS_REPSYNCALL_EVENT_ERROR`: `DS_REPSYNCALL_EVENT` = 0;
public const val `DS_REPSYNCALL_EVENT_FINISHED`: `DS_REPSYNCALL_EVENT` = 3;
public const val `DS_REPSYNCALL_EVENT_SYNC_COMPLETED`: `DS_REPSYNCALL_EVENT` = 2;
public const val `DS_REPSYNCALL_EVENT_SYNC_STARTED`: `DS_REPSYNCALL_EVENT` = 1;
public const val `DS_REPSYNCALL_ID_SERVERS_BY_DN`: UInt = 4u;
public const val `DS_REPSYNCALL_NO_OPTIONS`: UInt = 0u;
public const val `DS_REPSYNCALL_PUSH_CHANGES_OUTWARD`: UInt = 32u;
public const val `DS_REPSYNCALL_SERVER_UNREACHABLE`: `DS_REPSYNCALL_ERROR` = 2;
public const val `DS_REPSYNCALL_SKIP_INITIAL_CHECK`: UInt = 16u;
// UNSUPPORTED Rust 2288:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DS_REPSYNCALL_SYNCA {
//     pub pszSrcId: windows_sys::core::PSTR,
//     pub pszDstId: windows_sys::core::PSTR,
//     pub pszNC: windows_sys::core::PSTR,
//     pub pguidSrc: *mut windows_sys::core::GUID,
//     pub pguidDst: *mut windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 2297:1: declaration Impl has no candidate rule
// impl Default for DS_REPSYNCALL_SYNCA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2302:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DS_REPSYNCALL_SYNCW {
//     pub pszSrcId: windows_sys::core::PWSTR,
//     pub pszDstId: windows_sys::core::PWSTR,
//     pub pszNC: windows_sys::core::PWSTR,
//     pub pguidSrc: *mut windows_sys::core::GUID,
//     pub pguidDst: *mut windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 2311:1: declaration Impl has no candidate rule
// impl Default for DS_REPSYNCALL_SYNCW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DS_REPSYNCALL_SYNC_ADJACENT_SERVERS_ONLY`: UInt = 2u;
// UNSUPPORTED Rust 2317:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DS_REPSYNCALL_UPDATEA {
//     pub event: DS_REPSYNCALL_EVENT,
//     pub pErrInfo: *mut DS_REPSYNCALL_ERRINFOA,
//     pub pSync: *mut DS_REPSYNCALL_SYNCA,
// }

// UNSUPPORTED Rust 2324:1: declaration Impl has no candidate rule
// impl Default for DS_REPSYNCALL_UPDATEA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2329:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DS_REPSYNCALL_UPDATEW {
//     pub event: DS_REPSYNCALL_EVENT,
//     pub pErrInfo: *mut DS_REPSYNCALL_ERRINFOW,
//     pub pSync: *mut DS_REPSYNCALL_SYNCW,
// }

// UNSUPPORTED Rust 2336:1: declaration Impl has no candidate rule
// impl Default for DS_REPSYNCALL_UPDATEW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DS_REPSYNCALL_WIN32_ERROR_CONTACTING_SERVER`: `DS_REPSYNCALL_ERROR` = 0;
public const val `DS_REPSYNCALL_WIN32_ERROR_REPLICATING`: `DS_REPSYNCALL_ERROR` = 1;
public const val `DS_REPSYNC_ABANDONED`: UInt = 32768u;
public const val `DS_REPSYNC_ADD_REFERENCE`: UInt = 512u;
public const val `DS_REPSYNC_ASYNCHRONOUS_OPERATION`: UInt = 1u;
public const val `DS_REPSYNC_ASYNCHRONOUS_REPLICA`: UInt = 1048576u;
public const val `DS_REPSYNC_CRITICAL`: UInt = 2097152u;
public const val `DS_REPSYNC_FORCE`: UInt = 256u;
public const val `DS_REPSYNC_FULL`: UInt = 32u;
public const val `DS_REPSYNC_FULL_IN_PROGRESS`: UInt = 4194304u;
public const val `DS_REPSYNC_INITIAL`: UInt = 8192u;
public const val `DS_REPSYNC_INITIAL_IN_PROGRESS`: UInt = 65536u;
public const val `DS_REPSYNC_INTERSITE_MESSAGING`: UInt = 8u;
public const val `DS_REPSYNC_NEVER_COMPLETED`: UInt = 1024u;
public const val `DS_REPSYNC_NEVER_NOTIFY`: UInt = 4096u;
public const val `DS_REPSYNC_NONGC_RO_REPLICA`: UInt = 16777216u;
public const val `DS_REPSYNC_NOTIFICATION`: UInt = 524288u;
public const val `DS_REPSYNC_NO_DISCARD`: UInt = 128u;
public const val `DS_REPSYNC_PARTIAL_ATTRIBUTE_SET`: UInt = 131072u;
public const val `DS_REPSYNC_PERIODIC`: UInt = 4u;
public const val `DS_REPSYNC_PREEMPTED`: UInt = 8388608u;
public const val `DS_REPSYNC_REQUEUE`: UInt = 262144u;
public const val `DS_REPSYNC_SELECT_SECRETS`: UInt = 32768u;
public const val `DS_REPSYNC_TWO_WAY`: UInt = 2048u;
public const val `DS_REPSYNC_URGENT`: UInt = 64u;
public const val `DS_REPSYNC_USE_COMPRESSION`: UInt = 16384u;
public const val `DS_REPSYNC_WRITEABLE`: UInt = 2u;
public const val `DS_REPUPD_ADD_REFERENCE`: UInt = 4u;
public const val `DS_REPUPD_ASYNCHRONOUS_OPERATION`: UInt = 1u;
public const val `DS_REPUPD_DELETE_REFERENCE`: UInt = 8u;
public const val `DS_REPUPD_REFERENCE_GCSPN`: UInt = 16u;
public const val `DS_REPUPD_WRITEABLE`: UInt = 2u;
public const val `DS_RETURN_DNS_NAME`: UInt = 1073741824u;
public const val `DS_RETURN_FLAT_NAME`: UInt = 2147483648u;
public const val `DS_ROLE_DOMAIN_OWNER`: UInt = 1u;
public const val `DS_ROLE_INFRASTRUCTURE_OWNER`: UInt = 4u;
public const val `DS_ROLE_PDC_OWNER`: UInt = 2u;
public const val `DS_ROLE_RID_OWNER`: UInt = 3u;
public const val `DS_ROLE_SCHEMA_OWNER`: UInt = 0u;
public const val `DS_SCHEMA_GUID_ATTR`: UInt = 1u;
public const val `DS_SCHEMA_GUID_ATTR_SET`: UInt = 2u;
public const val `DS_SCHEMA_GUID_CLASS`: UInt = 3u;
public const val `DS_SCHEMA_GUID_CONTROL_RIGHT`: UInt = 4u;
// UNSUPPORTED Rust 2384:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DS_SCHEMA_GUID_MAPA {
//     pub guid: windows_sys::core::GUID,
//     pub guidType: u32,
//     pub pName: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 2391:1: declaration Impl has no candidate rule
// impl Default for DS_SCHEMA_GUID_MAPA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2396:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DS_SCHEMA_GUID_MAPW {
//     pub guid: windows_sys::core::GUID,
//     pub guidType: u32,
//     pub pName: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 2403:1: declaration Impl has no candidate rule
// impl Default for DS_SCHEMA_GUID_MAPW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DS_SCHEMA_GUID_NOT_FOUND`: UInt = 0u;
// UNSUPPORTED Rust 2409:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
// #[derive(Clone, Copy)]
// pub struct DS_SELECTION {
//     pub pwzName: windows_sys::core::PWSTR,
//     pub pwzADsPath: windows_sys::core::PWSTR,
//     pub pwzClass: windows_sys::core::PWSTR,
//     pub pwzUPN: windows_sys::core::PWSTR,
//     pub pvarFetchedAttributes: *mut super::super::System::Variant::VARIANT,
//     pub flScopeType: u32,
// }

// UNSUPPORTED Rust 2420:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
// impl Default for DS_SELECTION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2426:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
// #[derive(Clone, Copy)]
// pub struct DS_SELECTION_LIST {
//     pub cItems: u32,
//     pub cFetchedAttributes: u32,
//     pub aDsSelection: [DS_SELECTION; 1],
// }

// UNSUPPORTED Rust 2434:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
// impl Default for DS_SELECTION_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DS_SELECT_SECRET_DOMAIN_6_FLAG`: UInt = 2048u;
public const val `DS_SERVICE_PRINCIPAL_NAME`: `DS_NAME_FORMAT` = 10;
public const val `DS_SID_OR_SID_HISTORY_NAME`: `DS_NAME_FORMAT` = 11;
// UNSUPPORTED Rust 2443:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DS_SITE_COST_INFO {
//     pub errorCode: u32,
//     pub cost: u32,
// }

public const val `DS_SPN_ADD_SPN_OP`: `DS_SPN_WRITE_OP` = 0;
public const val `DS_SPN_DELETE_SPN_OP`: `DS_SPN_WRITE_OP` = 2;
public const val `DS_SPN_DNS_HOST`: `DS_SPN_NAME_TYPE` = 0;
public const val `DS_SPN_DN_HOST`: `DS_SPN_NAME_TYPE` = 1;
public const val `DS_SPN_DOMAIN`: `DS_SPN_NAME_TYPE` = 3;
public typealias `DS_SPN_NAME_TYPE` = Int;
public const val `DS_SPN_NB_DOMAIN`: `DS_SPN_NAME_TYPE` = 4;
public const val `DS_SPN_NB_HOST`: `DS_SPN_NAME_TYPE` = 2;
public const val `DS_SPN_REPLACE_SPN_OP`: `DS_SPN_WRITE_OP` = 1;
public const val `DS_SPN_SERVICE`: `DS_SPN_NAME_TYPE` = 5;
public typealias `DS_SPN_WRITE_OP` = Int;
// UNSUPPORTED Rust 2460:1: non-scalar type Ptr unsupported
// pub const DS_SYNCED_EVENT_NAME: windows_sys::core::PCSTR = windows_sys::core::s!("NTDSInitialSyncsCompleted");

// UNSUPPORTED Rust 2461:1: non-scalar type Ptr unsupported
// pub const DS_SYNCED_EVENT_NAME_W: windows_sys::core::PCWSTR = windows_sys::core::w!("NTDSInitialSyncsCompleted");

public const val `DS_TIMESERV_FLAG`: UInt = 64u;
public const val `DS_TIMESERV_REQUIRED`: UInt = 2048u;
public const val `DS_TRY_NEXTCLOSEST_SITE`: UInt = 262144u;
public const val `DS_UNIQUE_ID_NAME`: `DS_NAME_FORMAT` = 6;
public const val `DS_UNKNOWN_NAME`: `DS_NAME_FORMAT` = 0;
public const val `DS_USER_PRINCIPAL_NAME`: `DS_NAME_FORMAT` = 8;
public const val `DS_WEB_SERVICE_REQUIRED`: UInt = 1048576u;
public const val `DS_WRITABLE_FLAG`: UInt = 256u;
public const val `DS_WRITABLE_REQUIRED`: UInt = 4096u;
public const val `DS_WS_FLAG`: UInt = 8192u;
public const val `DsRoleOperationActive`: `DSROLE_OPERATION_STATE` = 1;
public const val `DsRoleOperationIdle`: `DSROLE_OPERATION_STATE` = 0;
public const val `DsRoleOperationNeedReboot`: `DSROLE_OPERATION_STATE` = 2;
public const val `DsRoleOperationState`: `DSROLE_PRIMARY_DOMAIN_INFO_LEVEL` = 3;
public const val `DsRolePrimaryDomainInfoBasic`: `DSROLE_PRIMARY_DOMAIN_INFO_LEVEL` = 1;
public const val `DsRoleServerBackup`: `DSROLE_SERVER_STATE` = 2;
public const val `DsRoleServerPrimary`: `DSROLE_SERVER_STATE` = 1;
public const val `DsRoleServerUnknown`: `DSROLE_SERVER_STATE` = 0;
public const val `DsRoleUpgradeStatus`: `DSROLE_PRIMARY_DOMAIN_INFO_LEVEL` = 2;
public const val `DsRole_RoleBackupDomainController`: `DSROLE_MACHINE_ROLE` = 4;
public const val `DsRole_RoleMemberServer`: `DSROLE_MACHINE_ROLE` = 3;
public const val `DsRole_RoleMemberWorkstation`: `DSROLE_MACHINE_ROLE` = 1;
public const val `DsRole_RolePrimaryDomainController`: `DSROLE_MACHINE_ROLE` = 5;
public const val `DsRole_RoleStandaloneServer`: `DSROLE_MACHINE_ROLE` = 2;
public const val `DsRole_RoleStandaloneWorkstation`: `DSROLE_MACHINE_ROLE` = 0;
// UNSUPPORTED Rust 2487:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Email: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8f92a857_478e_11d1_a3b4_00c04fb950dc);

public const val `FACILITY_BACKUP`: UInt = 2047u;
public const val `FACILITY_NTDSB`: UInt = 2048u;
public const val `FACILITY_SYSTEM`: UInt = 0u;
public const val `FLAG_DISABLABLE_OPTIONAL_FEATURE`: UInt = 4u;
public const val `FLAG_DOMAIN_OPTIONAL_FEATURE`: UInt = 2u;
public const val `FLAG_FOREST_OPTIONAL_FEATURE`: UInt = 1u;
public const val `FLAG_SERVER_OPTIONAL_FEATURE`: UInt = 8u;
public const val `FRSCONN_MAX_PRIORITY`: UInt = 8u;
public const val `FRSCONN_PRIORITY_MASK`: UInt = 1879048192u;
// UNSUPPORTED Rust 2497:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FaxNumber: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa5062215_4681_11d1_a3b4_00c04fb950dc);

// UNSUPPORTED Rust 2498:1: non-scalar type Ptr unsupported
// pub const GUID_COMPUTRS_CONTAINER_A: windows_sys::core::PCSTR = windows_sys::core::s!("aa312825768811d1aded00c04fd8d5cd");

// UNSUPPORTED Rust 2499:1: non-scalar type Ptr unsupported
// pub const GUID_COMPUTRS_CONTAINER_W: windows_sys::core::PCWSTR = windows_sys::core::w!("aa312825768811d1aded00c04fd8d5cd");

// UNSUPPORTED Rust 2500:1: non-scalar type Ptr unsupported
// pub const GUID_DELETED_OBJECTS_CONTAINER_A: windows_sys::core::PCSTR = windows_sys::core::s!("18e2ea80684f11d2b9aa00c04f79f805");

// UNSUPPORTED Rust 2501:1: non-scalar type Ptr unsupported
// pub const GUID_DELETED_OBJECTS_CONTAINER_W: windows_sys::core::PCWSTR = windows_sys::core::w!("18e2ea80684f11d2b9aa00c04f79f805");

// UNSUPPORTED Rust 2502:1: non-scalar type Ptr unsupported
// pub const GUID_DOMAIN_CONTROLLERS_CONTAINER_A: windows_sys::core::PCSTR = windows_sys::core::s!("a361b2ffffd211d1aa4b00c04fd7d83a");

// UNSUPPORTED Rust 2503:1: non-scalar type Ptr unsupported
// pub const GUID_DOMAIN_CONTROLLERS_CONTAINER_W: windows_sys::core::PCWSTR = windows_sys::core::w!("a361b2ffffd211d1aa4b00c04fd7d83a");

// UNSUPPORTED Rust 2504:1: non-scalar type Ptr unsupported
// pub const GUID_FOREIGNSECURITYPRINCIPALS_CONTAINER_A: windows_sys::core::PCSTR = windows_sys::core::s!("22b70c67d56e4efb91e9300fca3dc1aa");

// UNSUPPORTED Rust 2505:1: non-scalar type Ptr unsupported
// pub const GUID_FOREIGNSECURITYPRINCIPALS_CONTAINER_W: windows_sys::core::PCWSTR = windows_sys::core::w!("22b70c67d56e4efb91e9300fca3dc1aa");

// UNSUPPORTED Rust 2506:1: non-scalar type Ptr unsupported
// pub const GUID_INFRASTRUCTURE_CONTAINER_A: windows_sys::core::PCSTR = windows_sys::core::s!("2fbac1870ade11d297c400c04fd8d5cd");

// UNSUPPORTED Rust 2507:1: non-scalar type Ptr unsupported
// pub const GUID_INFRASTRUCTURE_CONTAINER_W: windows_sys::core::PCWSTR = windows_sys::core::w!("2fbac1870ade11d297c400c04fd8d5cd");

// UNSUPPORTED Rust 2508:1: non-scalar type Ptr unsupported
// pub const GUID_KEYS_CONTAINER_W: windows_sys::core::PCWSTR = windows_sys::core::w!("683A24E2E8164BD3AF86AC3C2CF3F981");

// UNSUPPORTED Rust 2509:1: non-scalar type Ptr unsupported
// pub const GUID_LOSTANDFOUND_CONTAINER_A: windows_sys::core::PCSTR = windows_sys::core::s!("ab8153b7768811d1aded00c04fd8d5cd");

// UNSUPPORTED Rust 2510:1: non-scalar type Ptr unsupported
// pub const GUID_LOSTANDFOUND_CONTAINER_W: windows_sys::core::PCWSTR = windows_sys::core::w!("ab8153b7768811d1aded00c04fd8d5cd");

// UNSUPPORTED Rust 2511:1: non-scalar type Ptr unsupported
// pub const GUID_MANAGED_SERVICE_ACCOUNTS_CONTAINER_W: windows_sys::core::PCWSTR = windows_sys::core::w!("1EB93889E40C45DF9F0C64D23BBB6237");

// UNSUPPORTED Rust 2512:1: non-scalar type Ptr unsupported
// pub const GUID_MICROSOFT_PROGRAM_DATA_CONTAINER_A: windows_sys::core::PCSTR = windows_sys::core::s!("f4be92a4c777485e878e9421d53087db");

// UNSUPPORTED Rust 2513:1: non-scalar type Ptr unsupported
// pub const GUID_MICROSOFT_PROGRAM_DATA_CONTAINER_W: windows_sys::core::PCWSTR = windows_sys::core::w!("f4be92a4c777485e878e9421d53087db");

// UNSUPPORTED Rust 2514:1: non-scalar type Ptr unsupported
// pub const GUID_NTDS_QUOTAS_CONTAINER_A: windows_sys::core::PCSTR = windows_sys::core::s!("6227f0af1fc2410d8e3bb10615bb5b0f");

// UNSUPPORTED Rust 2515:1: non-scalar type Ptr unsupported
// pub const GUID_NTDS_QUOTAS_CONTAINER_W: windows_sys::core::PCWSTR = windows_sys::core::w!("6227f0af1fc2410d8e3bb10615bb5b0f");

// UNSUPPORTED Rust 2516:1: non-scalar type Ptr unsupported
// pub const GUID_PRIVILEGED_ACCESS_MANAGEMENT_OPTIONAL_FEATURE_A: windows_sys::core::PCSTR = windows_sys::core::s!("73e843ece8cc4046b4ab07ffe4ab5bcd");

// UNSUPPORTED Rust 2517:1: non-scalar type Ptr unsupported
// pub const GUID_PRIVILEGED_ACCESS_MANAGEMENT_OPTIONAL_FEATURE_W: windows_sys::core::PCWSTR = windows_sys::core::w!("73e843ece8cc4046b4ab07ffe4ab5bcd");

// UNSUPPORTED Rust 2518:1: non-scalar type Ptr unsupported
// pub const GUID_PROGRAM_DATA_CONTAINER_A: windows_sys::core::PCSTR = windows_sys::core::s!("09460c08ae1e4a4ea0f64aee7daa1e5a");

// UNSUPPORTED Rust 2519:1: non-scalar type Ptr unsupported
// pub const GUID_PROGRAM_DATA_CONTAINER_W: windows_sys::core::PCWSTR = windows_sys::core::w!("09460c08ae1e4a4ea0f64aee7daa1e5a");

// UNSUPPORTED Rust 2520:1: non-scalar type Ptr unsupported
// pub const GUID_RECYCLE_BIN_OPTIONAL_FEATURE_A: windows_sys::core::PCSTR = windows_sys::core::s!("d8dc6d76d0ac5e44f3b9a7f9b6744f2a");

// UNSUPPORTED Rust 2521:1: non-scalar type Ptr unsupported
// pub const GUID_RECYCLE_BIN_OPTIONAL_FEATURE_W: windows_sys::core::PCWSTR = windows_sys::core::w!("d8dc6d76d0ac5e44f3b9a7f9b6744f2a");

// UNSUPPORTED Rust 2522:1: non-scalar type Ptr unsupported
// pub const GUID_SYSTEMS_CONTAINER_A: windows_sys::core::PCSTR = windows_sys::core::s!("ab1d30f3768811d1aded00c04fd8d5cd");

// UNSUPPORTED Rust 2523:1: non-scalar type Ptr unsupported
// pub const GUID_SYSTEMS_CONTAINER_W: windows_sys::core::PCWSTR = windows_sys::core::w!("ab1d30f3768811d1aded00c04fd8d5cd");

// UNSUPPORTED Rust 2524:1: non-scalar type Ptr unsupported
// pub const GUID_USERS_CONTAINER_A: windows_sys::core::PCSTR = windows_sys::core::s!("a9d1ca15768811d1aded00c04fd8d5cd");

// UNSUPPORTED Rust 2525:1: non-scalar type Ptr unsupported
// pub const GUID_USERS_CONTAINER_W: windows_sys::core::PCWSTR = windows_sys::core::w!("a9d1ca15768811d1aded00c04fd8d5cd");

// UNSUPPORTED Rust 2526:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Hold: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb3ad3e13_4080_11d1_a3ac_00c04fb950dc);

// UNSUPPORTED Rust 2527:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// pub type LPCQADDFORMSPROC = Option<unsafe extern "system" fn(lparam: super::super::Foundation::LPARAM, pform: *mut CQFORM) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 2529:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// pub type LPCQADDPAGESPROC = Option<unsafe extern "system" fn(lparam: super::super::Foundation::LPARAM, clsidform: *const windows_sys::core::GUID, ppage: *mut CQPAGE) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 2531:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// pub type LPCQPAGEPROC = Option<unsafe extern "system" fn(ppage: *mut CQPAGE, hwnd: super::super::Foundation::HWND, umsg: u32, wparam: super::super::Foundation::WPARAM, lparam: super::super::Foundation::LPARAM) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 2533:1: generic scalar type unsupported
// pub type LPDSENUMATTRIBUTES = Option<unsafe extern "system" fn(lparam: super::super::Foundation::LPARAM, pszattributename: windows_sys::core::PCWSTR, pszdisplayname: windows_sys::core::PCWSTR, dwflags: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 2534:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const LargeInteger: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x927971f5_0939_11d1_8be1_00c04fd8d503);

public const val `NTDSAPI_BIND_ALLOW_DELEGATION`: UInt = 1u;
public const val `NTDSAPI_BIND_FIND_BINDING`: UInt = 2u;
public const val `NTDSAPI_BIND_FORCE_KERBEROS`: UInt = 4u;
public const val `NTDSCONN_KCC_GC_TOPOLOGY`: UInt = 1u;
public const val `NTDSCONN_KCC_INTERSITE_GC_TOPOLOGY`: UInt = 32u;
public const val `NTDSCONN_KCC_INTERSITE_TOPOLOGY`: UInt = 64u;
public const val `NTDSCONN_KCC_MINIMIZE_HOPS_TOPOLOGY`: UInt = 4u;
public const val `NTDSCONN_KCC_NO_REASON`: UInt = 0u;
public const val `NTDSCONN_KCC_OSCILLATING_CONNECTION_TOPOLOGY`: UInt = 16u;
public const val `NTDSCONN_KCC_REDUNDANT_SERVER_TOPOLOGY`: UInt = 512u;
public const val `NTDSCONN_KCC_RING_TOPOLOGY`: UInt = 2u;
public const val `NTDSCONN_KCC_SERVER_FAILOVER_TOPOLOGY`: UInt = 128u;
public const val `NTDSCONN_KCC_SITE_FAILOVER_TOPOLOGY`: UInt = 256u;
public const val `NTDSCONN_KCC_STALE_SERVERS_TOPOLOGY`: UInt = 8u;
public const val `NTDSCONN_OPT_DISABLE_INTERSITE_COMPRESSION`: UInt = 16u;
public const val `NTDSCONN_OPT_IGNORE_SCHEDULE_MASK`: UInt = 2147483648u;
public const val `NTDSCONN_OPT_IS_GENERATED`: UInt = 1u;
public const val `NTDSCONN_OPT_OVERRIDE_NOTIFY_DEFAULT`: UInt = 4u;
public const val `NTDSCONN_OPT_RODC_TOPOLOGY`: UInt = 64u;
public const val `NTDSCONN_OPT_TWOWAY_SYNC`: UInt = 2u;
public const val `NTDSCONN_OPT_USER_OWNED_SCHEDULE`: UInt = 32u;
public const val `NTDSCONN_OPT_USE_NOTIFY`: UInt = 8u;
public const val `NTDSDSA_OPT_BLOCK_RPC`: UInt = 64u;
public const val `NTDSDSA_OPT_DISABLE_INBOUND_REPL`: UInt = 2u;
public const val `NTDSDSA_OPT_DISABLE_NTDSCONN_XLATE`: UInt = 8u;
public const val `NTDSDSA_OPT_DISABLE_OUTBOUND_REPL`: UInt = 4u;
public const val `NTDSDSA_OPT_DISABLE_SPN_REGISTRATION`: UInt = 16u;
public const val `NTDSDSA_OPT_GENERATE_OWN_TOPO`: UInt = 32u;
public const val `NTDSDSA_OPT_IS_GC`: UInt = 1u;
public const val `NTDSSETTINGS_DEFAULT_SERVER_REDUNDANCY`: UInt = 2u;
public const val `NTDSSETTINGS_OPT_FORCE_KCC_W2K_ELECTION`: UInt = 128u;
public const val `NTDSSETTINGS_OPT_FORCE_KCC_WHISTLER_BEHAVIOR`: UInt = 64u;
public const val `NTDSSETTINGS_OPT_IS_AUTO_TOPOLOGY_DISABLED`: UInt = 1u;
public const val `NTDSSETTINGS_OPT_IS_GROUP_CACHING_ENABLED`: UInt = 32u;
public const val `NTDSSETTINGS_OPT_IS_INTER_SITE_AUTO_TOPOLOGY_DISABLED`: UInt = 16u;
public const val `NTDSSETTINGS_OPT_IS_RAND_BH_SELECTION_DISABLED`: UInt = 256u;
public const val `NTDSSETTINGS_OPT_IS_REDUNDANT_SERVER_TOPOLOGY_ENABLED`: UInt = 1024u;
public const val `NTDSSETTINGS_OPT_IS_SCHEDULE_HASHING_ENABLED`: UInt = 512u;
public const val `NTDSSETTINGS_OPT_IS_TOPL_CLEANUP_DISABLED`: UInt = 2u;
public const val `NTDSSETTINGS_OPT_IS_TOPL_DETECT_STALE_DISABLED`: UInt = 8u;
public const val `NTDSSETTINGS_OPT_IS_TOPL_MIN_HOPS_DISABLED`: UInt = 4u;
public const val `NTDSSETTINGS_OPT_W2K3_BRIDGES_REQUIRED`: UInt = 4096u;
public const val `NTDSSETTINGS_OPT_W2K3_IGNORE_SCHEDULES`: UInt = 2048u;
public const val `NTDSSITECONN_OPT_DISABLE_COMPRESSION`: UInt = 4u;
public const val `NTDSSITECONN_OPT_TWOWAY_SYNC`: UInt = 2u;
public const val `NTDSSITECONN_OPT_USE_NOTIFY`: UInt = 1u;
public const val `NTDSSITELINK_OPT_DISABLE_COMPRESSION`: UInt = 4u;
public const val `NTDSSITELINK_OPT_TWOWAY_SYNC`: UInt = 2u;
public const val `NTDSSITELINK_OPT_USE_NOTIFY`: UInt = 1u;
public const val `NTDSTRANSPORT_OPT_BRIDGES_REQUIRED`: UInt = 2u;
public const val `NTDSTRANSPORT_OPT_IGNORE_SCHEDULES`: UInt = 1u;
// UNSUPPORTED Rust 2586:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const NameTranslate: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x274fae1f_3626_11d1_a3a4_00c04fb950dc);

// UNSUPPORTED Rust 2587:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const NetAddress: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb0b71247_4080_11d1_a3ac_00c04fb950dc);

// UNSUPPORTED Rust 2588:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// #[derive(Clone, Copy)]
// pub struct OPENQUERYWINDOW {
//     pub cbStruct: u32,
//     pub dwFlags: u32,
//     pub clsidHandler: windows_sys::core::GUID,
//     pub pHandlerParameters: *mut core::ffi::c_void,
//     pub clsidDefaultForm: windows_sys::core::GUID,
//     pub pPersistQuery: *mut core::ffi::c_void,
//     pub Anonymous: OPENQUERYWINDOW_0,
// }

// UNSUPPORTED Rust 2600:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// impl Default for OPENQUERYWINDOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2606:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// #[derive(Clone, Copy)]
// pub union OPENQUERYWINDOW_0 {
//     pub pFormParameters: *mut core::ffi::c_void,
//     pub ppbFormParameters: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 2613:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// impl Default for OPENQUERYWINDOW_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `OQWF_DEFAULTFORM`: UInt = 2u;
public const val `OQWF_HIDEMENUS`: UInt = 1024u;
public const val `OQWF_HIDESEARCHUI`: UInt = 2048u;
public const val `OQWF_ISSUEONOPEN`: UInt = 64u;
public const val `OQWF_LOADQUERY`: UInt = 8u;
public const val `OQWF_OKCANCEL`: UInt = 1u;
public const val `OQWF_PARAMISPROPERTYBAG`: UInt = 2147483648u;
public const val `OQWF_REMOVEFORMS`: UInt = 32u;
public const val `OQWF_REMOVESCOPES`: UInt = 16u;
public const val `OQWF_SAVEQUERYONOK`: UInt = 512u;
public const val `OQWF_SHOWOPTIONAL`: UInt = 128u;
public const val `OQWF_SINGLESELECT`: UInt = 4u;
// UNSUPPORTED Rust 2631:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const OctetList: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1241400f_4680_11d1_a3b4_00c04fb950dc);

// UNSUPPORTED Rust 2632:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Path: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb2538919_4080_11d1_a3ac_00c04fb950dc);

// UNSUPPORTED Rust 2633:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Pathname: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x080d0d78_f421_11d0_a36e_00c04fb950dc);

// UNSUPPORTED Rust 2634:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const PostalAddress: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0a75afcd_4680_11d1_a3b4_00c04fb950dc);

// UNSUPPORTED Rust 2635:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const PropertyEntry: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x72d3edc2_a4c4_11d0_8533_00c04fd8d503);

// UNSUPPORTED Rust 2636:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const PropertyValue: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7b9e38b0_a97c_11d0_8534_00c04fd8d503);

public const val `QUERYFORM_CHANGESFORMLIST`: ULong = 1uL;
public const val `QUERYFORM_CHANGESOPTFORMLIST`: ULong = 2uL;
// UNSUPPORTED Rust 2639:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const ReplicaPointer: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf5d1badf_4080_11d1_a3ac_00c04fb950dc);

// UNSUPPORTED Rust 2640:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SCHEDULE {
//     pub Size: u32,
//     pub Bandwidth: u32,
//     pub NumberOfSchedules: u32,
//     pub Schedules: [SCHEDULE_HEADER; 1],
// }

// UNSUPPORTED Rust 2648:1: declaration Impl has no candidate rule
// impl Default for SCHEDULE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SCHEDULE_BANDWIDTH`: UInt = 1u;
// UNSUPPORTED Rust 2654:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SCHEDULE_HEADER {
//     pub Type: u32,
//     pub Offset: u32,
// }

public const val `SCHEDULE_INTERVAL`: UInt = 0u;
public const val `SCHEDULE_PRIORITY`: UInt = 2u;
// UNSUPPORTED Rust 2662:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const SecurityDescriptor: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb958f73c_9bdd_11d0_852c_00c04fd8d503);

// UNSUPPORTED Rust 2663:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Timestamp: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb2bed2eb_4080_11d1_a3ac_00c04fb950dc);

// UNSUPPORTED Rust 2664:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const TypedName: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb33143cb_4080_11d1_a3ac_00c04fb950dc);

public const val `WM_ADSPROP_NOTIFY_APPLY`: UInt = 2128u;
public const val `WM_ADSPROP_NOTIFY_CHANGE`: UInt = 2127u;
public const val `WM_ADSPROP_NOTIFY_ERROR`: UInt = 2134u;
public const val `WM_ADSPROP_NOTIFY_EXIT`: UInt = 2131u;
public const val `WM_ADSPROP_NOTIFY_FOREGROUND`: UInt = 2130u;
public const val `WM_ADSPROP_NOTIFY_PAGEHWND`: UInt = 2126u;
public const val `WM_ADSPROP_NOTIFY_PAGEINIT`: UInt = 2125u;
public const val `WM_ADSPROP_NOTIFY_SETFOCUS`: UInt = 2129u;
// UNSUPPORTED Rust 2673:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const WinNTSystemInfo: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x66182ec4_afd1_11d2_9cb9_0000f87a369e);

public const val `hrAccessDenied`: Int = -939522189;
public const val `hrAfterInitialization`: Int = -939522246;
public const val `hrAlreadyInitialized`: Int = -939523066;
public const val `hrAlreadyOpen`: Int = -939589627;
public const val `hrAlreadyPrepared`: Int = -939522489;
public const val `hrBFInUse`: Int = -939523894;
public const val `hrBFNotSynchronous`: Int = -2013265720;
public const val `hrBFPageNotFound`: Int = -2013265719;
public const val `hrBackupDirectoryNotEmpty`: Int = -939523592;
public const val `hrBackupInProgress`: Int = -939523591;
public const val `hrBackupNotAllowedYet`: Int = -939523573;
public const val `hrBadBackupDatabaseSize`: Int = -939523535;
public const val `hrBadCheckpointSignature`: Int = -939523564;
public const val `hrBadColumnId`: Int = -939522579;
public const val `hrBadDbSignature`: Int = -939523565;
public const val `hrBadItagSequence`: Int = -939522578;
public const val `hrBadLogSignature`: Int = -939523566;
public const val `hrBadLogVersion`: Int = -939523582;
public const val `hrBufferTooSmall`: Int = -939523058;
public const val `hrBufferTruncated`: Int = -2013264914;
public const val `hrCannotBeTagged`: Int = -939522575;
public const val `hrCannotRename`: Int = -939522790;
public const val `hrCheckpointCorrupt`: Int = -939523563;
public const val `hrCircularLogging`: Int = -939589621;
public const val `hrColumn2ndSysMaint`: Int = -939522586;
public const val `hrColumnCannotIndex`: Int = -939522583;
public const val `hrColumnDoesNotFit`: Int = -939522593;
public const val `hrColumnDuplicate`: Int = -939522588;
public const val `hrColumnInUse`: Int = -939523050;
public const val `hrColumnIndexed`: Int = -939522591;
public const val `hrColumnLong`: Int = -939522595;
public const val `hrColumnMaxTruncated`: Int = -2013264408;
public const val `hrColumnNotFound`: Int = -939522589;
public const val `hrColumnNotUpdatable`: Int = -939523048;
public const val `hrColumnNull`: Int = -2013264916;
public const val `hrColumnSetNull`: Int = -2013264852;
public const val `hrColumnTooBig`: Int = -939522590;
public const val `hrCommunicationError`: Int = -939589619;
public const val `hrConsistentTimeMismatch`: Int = -939523545;
public const val `hrContainerNotEmpty`: Int = -939523053;
public const val `hrContentsExpired`: Int = -939589615;
public const val `hrCouldNotConnect`: Int = -939589625;
public const val `hrCreateIndexFailed`: Int = -2013264511;
public const val `hrCurrencyStackOutOfMemory`: Int = -939523026;
public const val `hrDatabaseAttached`: Int = -2013264913;
public const val `hrDatabaseCorrupted`: Int = -939522890;
public const val `hrDatabaseDuplicate`: Int = -939522895;
public const val `hrDatabaseInUse`: Int = -939522894;
public const val `hrDatabaseInconsistent`: Int = -939523546;
public const val `hrDatabaseInvalidName`: Int = -939522892;
public const val `hrDatabaseInvalidPages`: Int = -939522891;
public const val `hrDatabaseLocked`: Int = -939522889;
public const val `hrDatabaseNotFound`: Int = -939522893;
public const val `hrDeleteBackupFileFail`: Int = -939523572;
public const val `hrDensityInvalid`: Int = -939522789;
public const val `hrDiskFull`: Int = -939522288;
public const val `hrDiskIO`: Int = -939523074;
public const val `hrError`: Int = -939589630;
public const val `hrExistingLogFileHasBadSignature`: Int = -2013265362;
public const val `hrExistingLogFileIsNotContiguous`: Int = -2013265361;
public const val `hrFLDKeyTooBig`: Int = -2013265520;
public const val `hrFLDNullKey`: Int = -2013265518;
public const val `hrFLDTooManySegments`: Int = -939523695;
public const val `hrFeatureNotAvailable`: Int = -939523095;
public const val `hrFileAccessDenied`: Int = -939523064;
public const val `hrFileClose`: Int = -939523994;
public const val `hrFileNotFound`: Int = -939522285;
public const val `hrFileOpenReadOnly`: Int = -2013264107;
public const val `hrFullBackupNotTaken`: Int = -939589618;
public const val `hrGivenLogFileHasBadSignature`: Int = -939523541;
public const val `hrGivenLogFileIsNotContiguous`: Int = -939523540;
public const val `hrIllegalOperation`: Int = -939522784;
public const val `hrInTransaction`: Int = -939522988;
public const val `hrIncrementalBackupDisabled`: Int = -939589623;
public const val `hrIndexCantBuild`: Int = -939522695;
public const val `hrIndexDuplicate`: Int = -939522693;
public const val `hrIndexHasClustered`: Int = -939522688;
public const val `hrIndexHasPrimary`: Int = -939522694;
public const val `hrIndexInUse`: Int = -939523045;
public const val `hrIndexInvalidDef`: Int = -939522690;
public const val `hrIndexMustStay`: Int = -939522691;
public const val `hrIndexNotFound`: Int = -939522692;
public const val `hrInvalidBackup`: Int = -939523570;
public const val `hrInvalidBackupSequence`: Int = -939523575;
public const val `hrInvalidBookmark`: Int = -939523051;
public const val `hrInvalidBufferSize`: Int = -939523049;
public const val `hrInvalidCodePage`: Int = -939523033;
public const val `hrInvalidColumnType`: Int = -939522585;
public const val `hrInvalidCountry`: Int = -939523035;
public const val `hrInvalidDatabase`: Int = -939523068;
public const val `hrInvalidDatabaseId`: Int = -939523086;
public const val `hrInvalidFilename`: Int = -939523052;
public const val `hrInvalidHandle`: Int = -939589629;
public const val `hrInvalidLanguageId`: Int = -939523034;
public const val `hrInvalidLogSequence`: Int = -939523581;
public const val `hrInvalidName`: Int = -939523094;
public const val `hrInvalidObject`: Int = -939522780;
public const val `hrInvalidOnSort`: Int = -939522394;
public const val `hrInvalidOperation`: Int = -939522190;
public const val `hrInvalidParam`: Int = -939589631;
public const val `hrInvalidParameter`: Int = -939523093;
public const val `hrInvalidPath`: Int = -939523073;
public const val `hrInvalidRecips`: Int = -939589626;
public const val `hrInvalidSesid`: Int = -939522992;
public const val `hrInvalidTableId`: Int = -939522786;
public const val `hrKeyChanged`: Int = -2013264302;
public const val `hrKeyDuplicate`: Int = -939522491;
public const val `hrKeyIsMade`: Int = -939522580;
public const val `hrKeyNotMade`: Int = -939522488;
public const val `hrLogBufferTooSmall`: Int = -939523579;
public const val `hrLogCorrupted`: Int = -939522244;
public const val `hrLogDiskFull`: Int = -939523567;
public const val `hrLogFileCorrupt`: Int = -939523595;
public const val `hrLogFileNotFound`: Int = -939589622;
public const val `hrLogSequenceEnd`: Int = -939523577;
public const val `hrLogWriteFail`: Int = -939523586;
public const val `hrLoggingDisabled`: Int = -939523580;
public const val `hrMakeBackupDirectoryFail`: Int = -939523571;
public const val `hrMissingExpiryToken`: Int = -939589617;
public const val `hrMissingFullBackup`: Int = -939523536;
public const val `hrMissingLogFile`: Int = -939523568;
public const val `hrMissingPreviousLogFile`: Int = -939523587;
public const val `hrMissingRestoreLogFiles`: Int = -939523539;
public const val `hrNoBackup`: Int = -939523576;
public const val `hrNoBackupDirectory`: Int = -939523593;
public const val `hrNoCurrentIndex`: Int = -939522581;
public const val `hrNoCurrentRecord`: Int = -939522493;
public const val `hrNoFullRestore`: Int = -939589620;
public const val `hrNoIdleActivity`: Int = -2013264862;
public const val `hrNoWriteLock`: Int = -2013264853;
public const val `hrNone`: Int = 0;
public const val `hrNotInTransaction`: Int = -939523042;
public const val `hrNotInitialized`: Int = -939523067;
public const val `hrNullInvalid`: Int = -939522592;
public const val `hrNullKeyDisallowed`: Int = -939523043;
public const val `hrNyi`: Int = -1073741823;
public const val `hrObjectDuplicate`: Int = -939522782;
public const val `hrObjectNotFound`: Int = -939522791;
public const val `hrOutOfBuffers`: Int = -939523082;
public const val `hrOutOfCursors`: Int = -939523083;
public const val `hrOutOfDatabaseSpace`: Int = -939523084;
public const val `hrOutOfFileHandles`: Int = -939523076;
public const val `hrOutOfMemory`: Int = -939523085;
public const val `hrOutOfSessions`: Int = -939522995;
public const val `hrOutOfThreads`: Int = -939523993;
public const val `hrPMRecDeleted`: Int = -939523794;
public const val `hrPatchFileMismatch`: Int = -939523544;
public const val `hrPermissionDenied`: Int = -939522287;
public const val `hrReadVerifyFailure`: Int = -939523078;
public const val `hrRecordClusteredChanged`: Int = -939522492;
public const val `hrRecordDeleted`: Int = -939523079;
public const val `hrRecordNotFound`: Int = -939522495;
public const val `hrRecordTooBig`: Int = -939523070;
public const val `hrRecoveredWithErrors`: Int = -939523569;
public const val `hrRemainingVersions`: Int = -2013265599;
public const val `hrRestoreInProgress`: Int = -939589628;
public const val `hrRestoreLogTooHigh`: Int = -939523542;
public const val `hrRestoreLogTooLow`: Int = -939523543;
public const val `hrRestoreMapExists`: Int = -939589624;
public const val `hrSeekNotEqual`: Int = -2013264881;
public const val `hrSessionWriteConflict`: Int = -939522989;
public const val `hrTableDuplicate`: Int = -939522793;
public const val `hrTableEmpty`: Int = -2013264619;
public const val `hrTableInUse`: Int = -939522792;
public const val `hrTableLocked`: Int = -939522794;
public const val `hrTableNotEmpty`: Int = -939522788;
public const val `hrTaggedNotNULL`: Int = -939522582;
public const val `hrTempFileOpenError`: Int = -939522293;
public const val `hrTermInProgress`: Int = -939523096;
public const val `hrTooManyActiveUsers`: Int = -939523037;
public const val `hrTooManyAttachedDatabases`: Int = -939522291;
public const val `hrTooManyColumns`: Int = -939523056;
public const val `hrTooManyIO`: Int = -939523991;
public const val `hrTooManyIndexes`: Int = -939523081;
public const val `hrTooManyKeys`: Int = -939523080;
public const val `hrTooManyOpenDatabases`: Int = -939523069;
public const val `hrTooManyOpenIndexes`: Int = -939522686;
public const val `hrTooManyOpenTables`: Int = -939522785;
public const val `hrTooManySorts`: Int = -939522395;
public const val `hrTransTooDeep`: Int = -939522993;
public const val `hrUnknownExpiryTokenFormat`: Int = -939589616;
public const val `hrUpdateNotPrepared`: Int = -939522487;
public const val `hrVersionStoreOutOfMemory`: Int = -939523027;
public const val `hrWriteConflict`: Int = -939522994;
public const val `hrerrDataHasChanged`: Int = -939522485;
public const val `hrwrnDataHasChanged`: Int = -2013264310;
