// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("dnsapi.dll" "system" fn DnsAcquireContextHandle_A(credentialflags : u32, credentials : *const core::ffi::c_void, pcontext : *mut super::super::Foundation:: HANDLE) -> i32);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("dnsapi.dll" "system" fn DnsAcquireContextHandle_W(credentialflags : u32, credentials : *const core::ffi::c_void, pcontext : *mut super::super::Foundation:: HANDLE) -> i32);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("dnsapi.dll" "system" fn DnsCancelQuery(pcancelhandle : *const DNS_QUERY_CANCEL) -> i32);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("dnsapi.dll" "system" fn DnsCancelQueryRaw(cancelhandle : *const DNS_QUERY_RAW_CANCEL) -> i32);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("dnsapi.dll" "system" fn DnsConnectionDeletePolicyEntries(policyentrytag : DNS_CONNECTION_POLICY_TAG) -> u32);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("dnsapi.dll" "system" fn DnsConnectionDeleteProxyInfo(pwszconnectionname : windows_sys::core::PCWSTR, r#type : DNS_CONNECTION_PROXY_TYPE) -> u32);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("dnsapi.dll" "system" fn DnsConnectionFreeNameList(pnamelist : *mut DNS_CONNECTION_NAME_LIST));

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("dnsapi.dll" "system" fn DnsConnectionFreeProxyInfo(pproxyinfo : *mut DNS_CONNECTION_PROXY_INFO));

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("dnsapi.dll" "system" fn DnsConnectionFreeProxyInfoEx(pproxyinfoex : *mut DNS_CONNECTION_PROXY_INFO_EX));

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("dnsapi.dll" "system" fn DnsConnectionFreeProxyList(pproxylist : *mut DNS_CONNECTION_PROXY_LIST));

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("dnsapi.dll" "system" fn DnsConnectionGetNameList(pnamelist : *mut DNS_CONNECTION_NAME_LIST) -> u32);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// windows_link::link!("dnsapi.dll" "system" fn DnsConnectionGetProxyInfo(pwszconnectionname : windows_sys::core::PCWSTR, r#type : DNS_CONNECTION_PROXY_TYPE, pproxyinfo : *mut DNS_CONNECTION_PROXY_INFO) -> u32);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// windows_link::link!("dnsapi.dll" "system" fn DnsConnectionGetProxyInfoForHostUrl(pwszhosturl : windows_sys::core::PCWSTR, pselectioncontext : *const u8, dwselectioncontextlength : u32, dwexplicitinterfaceindex : u32, pproxyinfoex : *mut DNS_CONNECTION_PROXY_INFO_EX) -> u32);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// windows_link::link!("dnsapi.dll" "system" fn DnsConnectionGetProxyInfoForHostUrlEx(pwszhosturl : windows_sys::core::PCWSTR, pselectioncontext : *const u8, dwselectioncontextlength : u32, dwexplicitinterfaceindex : u32, pwszconnectionname : windows_sys::core::PCWSTR, pproxyinfoex : *mut DNS_CONNECTION_PROXY_INFO_EX) -> u32);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// windows_link::link!("dnsapi.dll" "system" fn DnsConnectionGetProxyList(pwszconnectionname : windows_sys::core::PCWSTR, pproxylist : *mut DNS_CONNECTION_PROXY_LIST) -> u32);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// windows_link::link!("dnsapi.dll" "system" fn DnsConnectionSetPolicyEntries(policyentrytag : DNS_CONNECTION_POLICY_TAG, ppolicyentrylist : *const DNS_CONNECTION_POLICY_ENTRY_LIST) -> u32);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// windows_link::link!("dnsapi.dll" "system" fn DnsConnectionSetProxyInfo(pwszconnectionname : windows_sys::core::PCWSTR, r#type : DNS_CONNECTION_PROXY_TYPE, pproxyinfo : *const DNS_CONNECTION_PROXY_INFO) -> u32);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// windows_link::link!("dnsapi.dll" "system" fn DnsConnectionUpdateIfIndexTable(pconnectionifindexentries : *const DNS_CONNECTION_IFINDEX_LIST) -> u32);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// windows_link::link!("dnsapi.dll" "system" fn DnsExtractRecordsFromMessage_UTF8(pdnsbuffer : *const DNS_MESSAGE_BUFFER, wmessagelength : u16, pprecord : *mut *mut DNS_RECORDA) -> i32);

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// windows_link::link!("dnsapi.dll" "system" fn DnsExtractRecordsFromMessage_W(pdnsbuffer : *const DNS_MESSAGE_BUFFER, wmessagelength : u16, pprecord : *mut *mut DNS_RECORDA) -> i32);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// windows_link::link!("dnsapi.dll" "system" fn DnsFree(pdata : *const core::ffi::c_void, freetype : DNS_FREE_TYPE));

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// windows_link::link!("dnsapi.dll" "system" fn DnsFreeCustomServers(pcservers : *mut u32, ppservers : *mut *mut DNS_CUSTOM_SERVER));

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// windows_link::link!("dnsapi.dll" "system" fn DnsFreeProxyName(proxyname : windows_sys::core::PCWSTR));

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// windows_link::link!("dnsapi.dll" "system" fn DnsGetApplicationSettings(pcservers : *mut u32, ppdefaultservers : *mut *mut DNS_CUSTOM_SERVER, psettings : *mut DNS_APPLICATION_SETTINGS) -> u32);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// windows_link::link!("dnsapi.dll" "system" fn DnsGetProxyInformation(hostname : windows_sys::core::PCWSTR, proxyinformation : *mut DNS_PROXY_INFORMATION, defaultproxyinformation : *mut DNS_PROXY_INFORMATION, completionroutine : DNS_PROXY_COMPLETION_ROUTINE, completioncontext : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// windows_link::link!("dnsapi.dll" "system" fn DnsModifyRecordsInSet_A(paddrecords : *const DNS_RECORDA, pdeleterecords : *const DNS_RECORDA, options : u32, hcredentials : super::super::Foundation:: HANDLE, pextralist : *mut core::ffi::c_void, preserved : *mut core::ffi::c_void) -> i32);

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// windows_link::link!("dnsapi.dll" "system" fn DnsModifyRecordsInSet_UTF8(paddrecords : *const DNS_RECORDA, pdeleterecords : *const DNS_RECORDA, options : u32, hcredentials : super::super::Foundation:: HANDLE, pextralist : *mut core::ffi::c_void, preserved : *mut core::ffi::c_void) -> i32);

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// windows_link::link!("dnsapi.dll" "system" fn DnsModifyRecordsInSet_W(paddrecords : *const DNS_RECORDA, pdeleterecords : *const DNS_RECORDA, options : u32, hcredentials : super::super::Foundation:: HANDLE, pextralist : *mut core::ffi::c_void, preserved : *mut core::ffi::c_void) -> i32);

// UNSUPPORTED Rust 29:1: declaration Macro has no candidate rule
// windows_link::link!("dnsapi.dll" "system" fn DnsNameCompare_A(pname1 : windows_sys::core::PCSTR, pname2 : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 30:1: declaration Macro has no candidate rule
// windows_link::link!("dnsapi.dll" "system" fn DnsNameCompare_W(pname1 : windows_sys::core::PCWSTR, pname2 : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 31:1: declaration Macro has no candidate rule
// windows_link::link!("dnsapi.dll" "system" fn DnsQueryConfig(config : DNS_CONFIG_TYPE, flag : u32, pwsadaptername : windows_sys::core::PCWSTR, preserved : *const core::ffi::c_void, pbuffer : *mut core::ffi::c_void, pbuflen : *mut u32) -> i32);

// UNSUPPORTED Rust 32:1: declaration Macro has no candidate rule
// windows_link::link!("dnsapi.dll" "system" fn DnsQueryEx(pqueryrequest : *const DNS_QUERY_REQUEST, pqueryresults : *mut DNS_QUERY_RESULT, pcancelhandle : *mut DNS_QUERY_CANCEL) -> i32);

// UNSUPPORTED Rust 33:1: declaration Macro has no candidate rule
// windows_link::link!("dnsapi.dll" "system" fn DnsQueryRaw(queryrequest : *const DNS_QUERY_RAW_REQUEST, cancelhandle : *mut DNS_QUERY_RAW_CANCEL) -> i32);

// UNSUPPORTED Rust 34:1: declaration Macro has no candidate rule
// windows_link::link!("dnsapi.dll" "system" fn DnsQueryRawResultFree(queryresults : *const DNS_QUERY_RAW_RESULT));

// UNSUPPORTED Rust 35:1: declaration Macro has no candidate rule
// windows_link::link!("dnsapi.dll" "system" fn DnsQuery_A(pszname : windows_sys::core::PCSTR, wtype : DNS_TYPE, options : DNS_QUERY_OPTIONS, pextra : *mut core::ffi::c_void, ppqueryresults : *mut *mut DNS_RECORDA, preserved : *mut *mut core::ffi::c_void) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 36:1: declaration Macro has no candidate rule
// windows_link::link!("dnsapi.dll" "system" fn DnsQuery_UTF8(pszname : windows_sys::core::PCSTR, wtype : DNS_TYPE, options : DNS_QUERY_OPTIONS, pextra : *mut core::ffi::c_void, ppqueryresults : *mut *mut DNS_RECORDA, preserved : *mut *mut core::ffi::c_void) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 37:1: declaration Macro has no candidate rule
// windows_link::link!("dnsapi.dll" "system" fn DnsQuery_W(pszname : windows_sys::core::PCWSTR, wtype : DNS_TYPE, options : DNS_QUERY_OPTIONS, pextra : *mut core::ffi::c_void, ppqueryresults : *mut *mut DNS_RECORDA, preserved : *mut *mut core::ffi::c_void) -> super::super::Foundation:: WIN32_ERROR);

// UNSUPPORTED Rust 38:1: declaration Macro has no candidate rule
// windows_link::link!("dnsapi.dll" "system" fn DnsRecordCompare(precord1 : *const DNS_RECORDA, precord2 : *const DNS_RECORDA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 39:1: declaration Macro has no candidate rule
// windows_link::link!("dnsapi.dll" "system" fn DnsRecordCopyEx(precord : *const DNS_RECORDA, charsetin : DNS_CHARSET, charsetout : DNS_CHARSET) -> *mut DNS_RECORDA);

// UNSUPPORTED Rust 40:1: declaration Macro has no candidate rule
// windows_link::link!("dnsapi.dll" "system" fn DnsRecordSetCompare(prr1 : *mut DNS_RECORDA, prr2 : *mut DNS_RECORDA, ppdiff1 : *mut *mut DNS_RECORDA, ppdiff2 : *mut *mut DNS_RECORDA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 41:1: declaration Macro has no candidate rule
// windows_link::link!("dnsapi.dll" "system" fn DnsRecordSetCopyEx(precordset : *const DNS_RECORDA, charsetin : DNS_CHARSET, charsetout : DNS_CHARSET) -> *mut DNS_RECORDA);

// UNSUPPORTED Rust 42:1: declaration Macro has no candidate rule
// windows_link::link!("dnsapi.dll" "system" fn DnsRecordSetDetach(precordlist : *mut DNS_RECORDA) -> *mut DNS_RECORDA);

// UNSUPPORTED Rust 43:1: declaration Macro has no candidate rule
// windows_link::link!("dnsapi.dll" "system" fn DnsReleaseContextHandle(hcontext : super::super::Foundation:: HANDLE));

// UNSUPPORTED Rust 44:1: declaration Macro has no candidate rule
// windows_link::link!("dnsapi.dll" "system" fn DnsReplaceRecordSetA(preplaceset : *const DNS_RECORDA, options : u32, hcontext : super::super::Foundation:: HANDLE, pextrainfo : *mut core::ffi::c_void, preserved : *mut core::ffi::c_void) -> i32);

// UNSUPPORTED Rust 45:1: declaration Macro has no candidate rule
// windows_link::link!("dnsapi.dll" "system" fn DnsReplaceRecordSetUTF8(preplaceset : *const DNS_RECORDA, options : u32, hcontext : super::super::Foundation:: HANDLE, pextrainfo : *mut core::ffi::c_void, preserved : *mut core::ffi::c_void) -> i32);

// UNSUPPORTED Rust 46:1: declaration Macro has no candidate rule
// windows_link::link!("dnsapi.dll" "system" fn DnsReplaceRecordSetW(preplaceset : *const DNS_RECORDA, options : u32, hcontext : super::super::Foundation:: HANDLE, pextrainfo : *mut core::ffi::c_void, preserved : *mut core::ffi::c_void) -> i32);

// UNSUPPORTED Rust 47:1: declaration Macro has no candidate rule
// windows_link::link!("dnsapi.dll" "system" fn DnsServiceBrowse(prequest : *const DNS_SERVICE_BROWSE_REQUEST, pcancel : *mut DNS_SERVICE_CANCEL) -> i32);

// UNSUPPORTED Rust 48:1: declaration Macro has no candidate rule
// windows_link::link!("dnsapi.dll" "system" fn DnsServiceBrowseCancel(pcancelhandle : *const DNS_SERVICE_CANCEL) -> i32);

// UNSUPPORTED Rust 49:1: declaration Macro has no candidate rule
// windows_link::link!("dnsapi.dll" "system" fn DnsServiceConstructInstance(pservicename : windows_sys::core::PCWSTR, phostname : windows_sys::core::PCWSTR, pip4 : *const u32, pip6 : *const IP6_ADDRESS, wport : u16, wpriority : u16, wweight : u16, dwpropertiescount : u32, keys : *const windows_sys::core::PCWSTR, values : *const windows_sys::core::PCWSTR) -> *mut DNS_SERVICE_INSTANCE);

// UNSUPPORTED Rust 50:1: declaration Macro has no candidate rule
// windows_link::link!("dnsapi.dll" "system" fn DnsServiceCopyInstance(porig : *const DNS_SERVICE_INSTANCE) -> *mut DNS_SERVICE_INSTANCE);

// UNSUPPORTED Rust 51:1: declaration Macro has no candidate rule
// windows_link::link!("dnsapi.dll" "system" fn DnsServiceDeRegister(prequest : *const DNS_SERVICE_REGISTER_REQUEST, pcancel : *mut DNS_SERVICE_CANCEL) -> u32);

// UNSUPPORTED Rust 52:1: declaration Macro has no candidate rule
// windows_link::link!("dnsapi.dll" "system" fn DnsServiceFreeInstance(pinstance : *const DNS_SERVICE_INSTANCE));

// UNSUPPORTED Rust 53:1: declaration Macro has no candidate rule
// windows_link::link!("dnsapi.dll" "system" fn DnsServiceRegister(prequest : *const DNS_SERVICE_REGISTER_REQUEST, pcancel : *mut DNS_SERVICE_CANCEL) -> u32);

// UNSUPPORTED Rust 54:1: declaration Macro has no candidate rule
// windows_link::link!("dnsapi.dll" "system" fn DnsServiceRegisterCancel(pcancelhandle : *const DNS_SERVICE_CANCEL) -> u32);

// UNSUPPORTED Rust 55:1: declaration Macro has no candidate rule
// windows_link::link!("dnsapi.dll" "system" fn DnsServiceResolve(prequest : *const DNS_SERVICE_RESOLVE_REQUEST, pcancel : *mut DNS_SERVICE_CANCEL) -> i32);

// UNSUPPORTED Rust 56:1: declaration Macro has no candidate rule
// windows_link::link!("dnsapi.dll" "system" fn DnsServiceResolveCancel(pcancelhandle : *const DNS_SERVICE_CANCEL) -> i32);

// UNSUPPORTED Rust 57:1: declaration Macro has no candidate rule
// windows_link::link!("dnsapi.dll" "system" fn DnsSetApplicationSettings(cservers : u32, pservers : *const DNS_CUSTOM_SERVER, psettings : *const DNS_APPLICATION_SETTINGS) -> u32);

// UNSUPPORTED Rust 58:1: declaration Macro has no candidate rule
// windows_link::link!("dnsapi.dll" "system" fn DnsStartMulticastQuery(pqueryrequest : *const MDNS_QUERY_REQUEST, phandle : *mut MDNS_QUERY_HANDLE) -> i32);

// UNSUPPORTED Rust 59:1: declaration Macro has no candidate rule
// windows_link::link!("dnsapi.dll" "system" fn DnsStopMulticastQuery(phandle : *mut MDNS_QUERY_HANDLE) -> i32);

// UNSUPPORTED Rust 60:1: declaration Macro has no candidate rule
// windows_link::link!("dnsapi.dll" "system" fn DnsValidateName_A(pszname : windows_sys::core::PCSTR, format : DNS_NAME_FORMAT) -> i32);

// UNSUPPORTED Rust 61:1: declaration Macro has no candidate rule
// windows_link::link!("dnsapi.dll" "system" fn DnsValidateName_UTF8(pszname : windows_sys::core::PCSTR, format : DNS_NAME_FORMAT) -> i32);

// UNSUPPORTED Rust 62:1: declaration Macro has no candidate rule
// windows_link::link!("dnsapi.dll" "system" fn DnsValidateName_W(pszname : windows_sys::core::PCWSTR, format : DNS_NAME_FORMAT) -> i32);

// UNSUPPORTED Rust 63:1: declaration Macro has no candidate rule
// windows_link::link!("dnsapi.dll" "system" fn DnsWriteQuestionToBuffer_UTF8(pdnsbuffer : *mut DNS_MESSAGE_BUFFER, pdwbuffersize : *mut u32, pszname : windows_sys::core::PCSTR, wtype : u16, xid : u16, frecursiondesired : windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 64:1: declaration Macro has no candidate rule
// windows_link::link!("dnsapi.dll" "system" fn DnsWriteQuestionToBuffer_W(pdnsbuffer : *mut DNS_MESSAGE_BUFFER, pdwbuffersize : *mut u32, pszname : windows_sys::core::PCWSTR, wtype : u16, xid : u16, frecursiondesired : windows_sys::core::BOOL) -> windows_sys::core::BOOL);

public const val `DDR_MAX_IP_HINTS`: UInt = 4u;
public const val `DNSREC_ADDITIONAL`: UInt = 3u;
public const val `DNSREC_ANSWER`: UInt = 1u;
public const val `DNSREC_AUTHORITY`: UInt = 2u;
public const val `DNSREC_DELETE`: UInt = 4u;
public const val `DNSREC_NOEXIST`: UInt = 4u;
public const val `DNSREC_PREREQ`: UInt = 1u;
public const val `DNSREC_QUESTION`: UInt = 0u;
public const val `DNSREC_SECTION`: UInt = 3u;
public const val `DNSREC_UPDATE`: UInt = 2u;
public const val `DNSREC_ZONE`: UInt = 0u;
public const val `DNSSEC_ALGORITHM_ECDSAP256_SHA256`: UInt = 13u;
public const val `DNSSEC_ALGORITHM_ECDSAP384_SHA384`: UInt = 14u;
public const val `DNSSEC_ALGORITHM_NULL`: UInt = 253u;
public const val `DNSSEC_ALGORITHM_PRIVATE`: UInt = 254u;
public const val `DNSSEC_ALGORITHM_RSAMD5`: UInt = 1u;
public const val `DNSSEC_ALGORITHM_RSASHA1`: UInt = 5u;
public const val `DNSSEC_ALGORITHM_RSASHA1_NSEC3`: UInt = 7u;
public const val `DNSSEC_ALGORITHM_RSASHA256`: UInt = 8u;
public const val `DNSSEC_ALGORITHM_RSASHA512`: UInt = 10u;
public const val `DNSSEC_DIGEST_ALGORITHM_SHA1`: UInt = 1u;
public const val `DNSSEC_DIGEST_ALGORITHM_SHA256`: UInt = 2u;
public const val `DNSSEC_DIGEST_ALGORITHM_SHA384`: UInt = 4u;
public const val `DNSSEC_KEY_FLAG_EXTEND`: UInt = 8u;
public const val `DNSSEC_KEY_FLAG_FLAG10`: UInt = 1024u;
public const val `DNSSEC_KEY_FLAG_FLAG11`: UInt = 2048u;
public const val `DNSSEC_KEY_FLAG_FLAG2`: UInt = 4u;
public const val `DNSSEC_KEY_FLAG_FLAG4`: UInt = 16u;
public const val `DNSSEC_KEY_FLAG_FLAG5`: UInt = 32u;
public const val `DNSSEC_KEY_FLAG_FLAG8`: UInt = 256u;
public const val `DNSSEC_KEY_FLAG_FLAG9`: UInt = 512u;
public const val `DNSSEC_KEY_FLAG_HOST`: UInt = 128u;
public const val `DNSSEC_KEY_FLAG_NOAUTH`: UInt = 1u;
public const val `DNSSEC_KEY_FLAG_NOCONF`: UInt = 2u;
public const val `DNSSEC_KEY_FLAG_NTPE3`: UInt = 192u;
public const val `DNSSEC_KEY_FLAG_SIG0`: UInt = 0u;
public const val `DNSSEC_KEY_FLAG_SIG1`: UInt = 4096u;
public const val `DNSSEC_KEY_FLAG_SIG10`: UInt = 40960u;
public const val `DNSSEC_KEY_FLAG_SIG11`: UInt = 45056u;
public const val `DNSSEC_KEY_FLAG_SIG12`: UInt = 49152u;
public const val `DNSSEC_KEY_FLAG_SIG13`: UInt = 53248u;
public const val `DNSSEC_KEY_FLAG_SIG14`: UInt = 57344u;
public const val `DNSSEC_KEY_FLAG_SIG15`: UInt = 61440u;
public const val `DNSSEC_KEY_FLAG_SIG2`: UInt = 8192u;
public const val `DNSSEC_KEY_FLAG_SIG3`: UInt = 12288u;
public const val `DNSSEC_KEY_FLAG_SIG4`: UInt = 16384u;
public const val `DNSSEC_KEY_FLAG_SIG5`: UInt = 20480u;
public const val `DNSSEC_KEY_FLAG_SIG6`: UInt = 24576u;
public const val `DNSSEC_KEY_FLAG_SIG7`: UInt = 28672u;
public const val `DNSSEC_KEY_FLAG_SIG8`: UInt = 32768u;
public const val `DNSSEC_KEY_FLAG_SIG9`: UInt = 36864u;
public const val `DNSSEC_KEY_FLAG_USER`: UInt = 0u;
public const val `DNSSEC_KEY_FLAG_ZONE`: UInt = 64u;
public const val `DNSSEC_PROTOCOL_DNSSEC`: UInt = 3u;
public const val `DNSSEC_PROTOCOL_EMAIL`: UInt = 2u;
public const val `DNSSEC_PROTOCOL_IPSEC`: UInt = 4u;
public const val `DNSSEC_PROTOCOL_NONE`: UInt = 0u;
public const val `DNSSEC_PROTOCOL_TLS`: UInt = 1u;
// UNSUPPORTED Rust 123:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_AAAA_DATA {
//     pub Ip6Address: IP6_ADDRESS,
// }

// UNSUPPORTED Rust 128:1: declaration Impl has no candidate rule
// impl Default for DNS_AAAA_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 133:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_ADDR {
//     pub MaxSa: [i8; 32],
//     pub Data: DNS_ADDR_0,
// }

// UNSUPPORTED Rust 139:1: declaration Impl has no candidate rule
// impl Default for DNS_ADDR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 144:1: declaration Union has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union DNS_ADDR_0 {
//     pub DnsAddrUserDword: [u32; 8],
// }

// UNSUPPORTED Rust 149:1: declaration Impl has no candidate rule
// impl Default for DNS_ADDR_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DNS_ADDRESS_STRING_LENGTH`: UInt = 65u;
// UNSUPPORTED Rust 155:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct DNS_ADDR_ARRAY {
//     pub MaxCount: u32,
//     pub AddrCount: u32,
//     pub Tag: u32,
//     pub Family: u16,
//     pub WordReserved: u16,
//     pub Flags: u32,
//     pub MatchFlag: u32,
//     pub Reserved1: u32,
//     pub Reserved2: u32,
//     pub AddrArray: [DNS_ADDR; 1],
// }

// UNSUPPORTED Rust 169:1: declaration Impl has no candidate rule
// impl Default for DNS_ADDR_ARRAY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DNS_ADDR_MAX_SOCKADDR_LENGTH`: UInt = 32u;
// UNSUPPORTED Rust 175:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DNS_APPLICATION_SETTINGS {
//     pub Version: u32,
//     pub Flags: u64,
// }

public const val `DNS_APP_SETTINGS_EXCLUSIVE_SERVERS`: UInt = 1u;
public const val `DNS_APP_SETTINGS_VERSION1`: UInt = 1u;
public const val `DNS_ATMA_AESA_ADDR_LENGTH`: UInt = 20u;
// UNSUPPORTED Rust 184:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_ATMA_DATA {
//     pub AddressType: u8,
//     pub Address: [u8; 20],
// }

// UNSUPPORTED Rust 190:1: declaration Impl has no candidate rule
// impl Default for DNS_ATMA_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DNS_ATMA_FORMAT_AESA`: UInt = 2u;
public const val `DNS_ATMA_FORMAT_E164`: UInt = 1u;
public const val `DNS_ATMA_MAX_ADDR_LENGTH`: UInt = 20u;
public const val `DNS_ATMA_MAX_RECORD_LENGTH`: UInt = 21u;
// UNSUPPORTED Rust 199:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DNS_A_DATA {
//     pub IpAddress: u32,
// }

public typealias `DNS_CHARSET` = Int;
public const val `DNS_CLASS_ALL`: UInt = 255u;
public const val `DNS_CLASS_ANY`: UInt = 255u;
public const val `DNS_CLASS_CHAOS`: UInt = 3u;
public const val `DNS_CLASS_CSNET`: UInt = 2u;
public const val `DNS_CLASS_HESIOD`: UInt = 4u;
public const val `DNS_CLASS_INTERNET`: UInt = 1u;
public const val `DNS_CLASS_NONE`: UInt = 254u;
public const val `DNS_CLASS_UNICAST_RESPONSE`: UInt = 32768u;
public const val `DNS_COMPRESSED_QUESTION_NAME`: UInt = 49164u;
public const val `DNS_CONFIG_FLAG_ALLOC`: UInt = 1u;
public typealias `DNS_CONFIG_TYPE` = Int;
// UNSUPPORTED Rust 216:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_CONNECTION_IFINDEX_ENTRY {
//     pub pwszConnectionName: windows_sys::core::PCWSTR,
//     pub dwIfIndex: u32,
// }

// UNSUPPORTED Rust 222:1: declaration Impl has no candidate rule
// impl Default for DNS_CONNECTION_IFINDEX_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 227:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_CONNECTION_IFINDEX_LIST {
//     pub pConnectionIfIndexEntries: *mut DNS_CONNECTION_IFINDEX_ENTRY,
//     pub nEntries: u32,
// }

// UNSUPPORTED Rust 233:1: declaration Impl has no candidate rule
// impl Default for DNS_CONNECTION_IFINDEX_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 238:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_CONNECTION_NAME {
//     pub wszName: [u16; 65],
// }

// UNSUPPORTED Rust 243:1: declaration Impl has no candidate rule
// impl Default for DNS_CONNECTION_NAME {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 248:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_CONNECTION_NAME_LIST {
//     pub cNames: u32,
//     pub pNames: *mut DNS_CONNECTION_NAME,
// }

// UNSUPPORTED Rust 254:1: declaration Impl has no candidate rule
// impl Default for DNS_CONNECTION_NAME_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DNS_CONNECTION_NAME_MAX_LENGTH`: UInt = 64u;
// UNSUPPORTED Rust 260:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_CONNECTION_POLICY_ENTRY {
//     pub pwszHost: windows_sys::core::PCWSTR,
//     pub pwszAppId: windows_sys::core::PCWSTR,
//     pub cbAppSid: u32,
//     pub pbAppSid: *mut u8,
//     pub nConnections: u32,
//     pub ppwszConnections: *const windows_sys::core::PCWSTR,
//     pub dwPolicyEntryFlags: u32,
// }

// UNSUPPORTED Rust 271:1: declaration Impl has no candidate rule
// impl Default for DNS_CONNECTION_POLICY_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 276:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_CONNECTION_POLICY_ENTRY_LIST {
//     pub pPolicyEntries: *mut DNS_CONNECTION_POLICY_ENTRY,
//     pub nEntries: u32,
// }

// UNSUPPORTED Rust 282:1: declaration Impl has no candidate rule
// impl Default for DNS_CONNECTION_POLICY_ENTRY_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DNS_CONNECTION_POLICY_ENTRY_ONDEMAND`: UInt = 1u;
public typealias `DNS_CONNECTION_POLICY_TAG` = Int;
// UNSUPPORTED Rust 289:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_CONNECTION_PROXY_ELEMENT {
//     pub Type: DNS_CONNECTION_PROXY_TYPE,
//     pub Info: DNS_CONNECTION_PROXY_INFO,
// }

// UNSUPPORTED Rust 295:1: declaration Impl has no candidate rule
// impl Default for DNS_CONNECTION_PROXY_ELEMENT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 300:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_CONNECTION_PROXY_INFO {
//     pub Version: u32,
//     pub pwszFriendlyName: windows_sys::core::PWSTR,
//     pub Flags: u32,
//     pub Switch: DNS_CONNECTION_PROXY_INFO_SWITCH,
//     pub Anonymous: DNS_CONNECTION_PROXY_INFO_0,
// }

// UNSUPPORTED Rust 309:1: declaration Impl has no candidate rule
// impl Default for DNS_CONNECTION_PROXY_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 314:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DNS_CONNECTION_PROXY_INFO_0 {
//     pub Config: DNS_CONNECTION_PROXY_INFO_0_0,
//     pub Script: DNS_CONNECTION_PROXY_INFO_0_1,
// }

// UNSUPPORTED Rust 320:1: declaration Impl has no candidate rule
// impl Default for DNS_CONNECTION_PROXY_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 325:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_CONNECTION_PROXY_INFO_0_0 {
//     pub pwszServer: windows_sys::core::PWSTR,
//     pub pwszUsername: windows_sys::core::PWSTR,
//     pub pwszPassword: windows_sys::core::PWSTR,
//     pub pwszException: windows_sys::core::PWSTR,
//     pub pwszExtraInfo: windows_sys::core::PWSTR,
//     pub Port: u16,
// }

// UNSUPPORTED Rust 335:1: declaration Impl has no candidate rule
// impl Default for DNS_CONNECTION_PROXY_INFO_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 340:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_CONNECTION_PROXY_INFO_0_1 {
//     pub pwszScript: windows_sys::core::PWSTR,
//     pub pwszUsername: windows_sys::core::PWSTR,
//     pub pwszPassword: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 347:1: declaration Impl has no candidate rule
// impl Default for DNS_CONNECTION_PROXY_INFO_0_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DNS_CONNECTION_PROXY_INFO_CURRENT_VERSION`: UInt = 1u;
// UNSUPPORTED Rust 353:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_CONNECTION_PROXY_INFO_EX {
//     pub ProxyInfo: DNS_CONNECTION_PROXY_INFO,
//     pub dwInterfaceIndex: u32,
//     pub pwszConnectionName: windows_sys::core::PWSTR,
//     pub fDirectConfiguration: windows_sys::core::BOOL,
//     pub hConnection: super::super::Foundation::HANDLE,
// }

// UNSUPPORTED Rust 362:1: declaration Impl has no candidate rule
// impl Default for DNS_CONNECTION_PROXY_INFO_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DNS_CONNECTION_PROXY_INFO_EXCEPTION_MAX_LENGTH`: UInt = 1024u;
public const val `DNS_CONNECTION_PROXY_INFO_EXTRA_INFO_MAX_LENGTH`: UInt = 1024u;
public const val `DNS_CONNECTION_PROXY_INFO_FLAG_BYPASSLOCAL`: UInt = 2u;
public const val `DNS_CONNECTION_PROXY_INFO_FLAG_DISABLED`: UInt = 1u;
public const val `DNS_CONNECTION_PROXY_INFO_FRIENDLY_NAME_MAX_LENGTH`: UInt = 64u;
public const val `DNS_CONNECTION_PROXY_INFO_PASSWORD_MAX_LENGTH`: UInt = 128u;
public const val `DNS_CONNECTION_PROXY_INFO_SERVER_MAX_LENGTH`: UInt = 256u;
public typealias `DNS_CONNECTION_PROXY_INFO_SWITCH` = Int;
public const val `DNS_CONNECTION_PROXY_INFO_SWITCH_CONFIG`: `DNS_CONNECTION_PROXY_INFO_SWITCH` = 0;
public const val `DNS_CONNECTION_PROXY_INFO_SWITCH_SCRIPT`: `DNS_CONNECTION_PROXY_INFO_SWITCH` = 1;
public const val `DNS_CONNECTION_PROXY_INFO_SWITCH_WPAD`: `DNS_CONNECTION_PROXY_INFO_SWITCH` = 2;
public const val `DNS_CONNECTION_PROXY_INFO_USERNAME_MAX_LENGTH`: UInt = 128u;
// UNSUPPORTED Rust 379:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_CONNECTION_PROXY_LIST {
//     pub cProxies: u32,
//     pub pProxies: *mut DNS_CONNECTION_PROXY_ELEMENT,
// }

// UNSUPPORTED Rust 385:1: declaration Impl has no candidate rule
// impl Default for DNS_CONNECTION_PROXY_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DNS_CONNECTION_PROXY_TYPE` = Int;
public const val `DNS_CONNECTION_PROXY_TYPE_HTTP`: `DNS_CONNECTION_PROXY_TYPE` = 1;
public const val `DNS_CONNECTION_PROXY_TYPE_NULL`: `DNS_CONNECTION_PROXY_TYPE` = 0;
public const val `DNS_CONNECTION_PROXY_TYPE_SOCKS4`: `DNS_CONNECTION_PROXY_TYPE` = 4;
public const val `DNS_CONNECTION_PROXY_TYPE_SOCKS5`: `DNS_CONNECTION_PROXY_TYPE` = 5;
public const val `DNS_CONNECTION_PROXY_TYPE_WAP`: `DNS_CONNECTION_PROXY_TYPE` = 2;
// UNSUPPORTED Rust 396:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_CUSTOM_SERVER {
//     pub dwServerType: u32,
//     pub ullFlags: u64,
//     pub Anonymous1: DNS_CUSTOM_SERVER_0,
//     pub Anonymous2: DNS_CUSTOM_SERVER_1,
// }

// UNSUPPORTED Rust 404:1: declaration Impl has no candidate rule
// impl Default for DNS_CUSTOM_SERVER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 409:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DNS_CUSTOM_SERVER_0 {
//     pub pwszTemplate: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 414:1: declaration Impl has no candidate rule
// impl Default for DNS_CUSTOM_SERVER_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 419:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DNS_CUSTOM_SERVER_1 {
//     pub MaxSa: [i8; 32],
// }

// UNSUPPORTED Rust 424:1: declaration Impl has no candidate rule
// impl Default for DNS_CUSTOM_SERVER_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DNS_CUSTOM_SERVER_TYPE_DOH`: UInt = 2u;
public const val `DNS_CUSTOM_SERVER_TYPE_UDP`: UInt = 1u;
public const val `DNS_CUSTOM_SERVER_UDP_FALLBACK`: UInt = 1u;
// UNSUPPORTED Rust 432:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_DHCID_DATA {
//     pub dwByteCount: u32,
//     pub DHCID: [u8; 1],
// }

// UNSUPPORTED Rust 438:1: declaration Impl has no candidate rule
// impl Default for DNS_DHCID_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 443:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_DS_DATA {
//     pub wKeyTag: u16,
//     pub chAlgorithm: u8,
//     pub chDigestType: u8,
//     pub wDigestLength: u16,
//     pub wPad: u16,
//     pub Digest: [u8; 1],
// }

// UNSUPPORTED Rust 453:1: declaration Impl has no candidate rule
// impl Default for DNS_DS_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DNS_FREE_TYPE` = Int;
// UNSUPPORTED Rust 459:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct DNS_HEADER {
//     pub Xid: u16,
//     pub _bitfield1: u8,
//     pub _bitfield2: u8,
//     pub QuestionCount: u16,
//     pub AnswerCount: u16,
//     pub NameServerCount: u16,
//     pub AdditionalCount: u16,
// }

// UNSUPPORTED Rust 470:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct DNS_HEADER_EXT {
//     pub _bitfield: u16,
//     pub chRcode: u8,
//     pub chVersion: u8,
// }

// UNSUPPORTED Rust 477:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_KEY_DATA {
//     pub wFlags: u16,
//     pub chProtocol: u8,
//     pub chAlgorithm: u8,
//     pub wKeyLength: u16,
//     pub wPad: u16,
//     pub Key: [u8; 1],
// }

// UNSUPPORTED Rust 487:1: declaration Impl has no candidate rule
// impl Default for DNS_KEY_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 492:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DNS_LOC_DATA {
//     pub wVersion: u16,
//     pub wSize: u16,
//     pub wHorPrec: u16,
//     pub wVerPrec: u16,
//     pub dwLatitude: u32,
//     pub dwLongitude: u32,
//     pub dwAltitude: u32,
// }

public const val `DNS_MAX_IP4_REVERSE_NAME_BUFFER_LENGTH`: UInt = 31u;
public const val `DNS_MAX_IP4_REVERSE_NAME_LENGTH`: UInt = 31u;
public const val `DNS_MAX_IP6_REVERSE_NAME_BUFFER_LENGTH`: UInt = 75u;
public const val `DNS_MAX_IP6_REVERSE_NAME_LENGTH`: UInt = 75u;
public const val `DNS_MAX_LABEL_BUFFER_LENGTH`: UInt = 64u;
public const val `DNS_MAX_LABEL_LENGTH`: UInt = 63u;
public const val `DNS_MAX_NAME_BUFFER_LENGTH`: UInt = 256u;
public const val `DNS_MAX_NAME_LENGTH`: UInt = 255u;
public const val `DNS_MAX_REVERSE_NAME_BUFFER_LENGTH`: UInt = 75u;
public const val `DNS_MAX_REVERSE_NAME_LENGTH`: UInt = 75u;
public const val `DNS_MAX_TEXT_STRING_LENGTH`: UInt = 255u;
// UNSUPPORTED Rust 514:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_MESSAGE_BUFFER {
//     pub MessageHead: DNS_HEADER,
//     pub MessageBody: [i8; 1],
// }

// UNSUPPORTED Rust 520:1: declaration Impl has no candidate rule
// impl Default for DNS_MESSAGE_BUFFER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 525:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_MINFO_DATAA {
//     pub pNameMailbox: windows_sys::core::PSTR,
//     pub pNameErrorsMailbox: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 531:1: declaration Impl has no candidate rule
// impl Default for DNS_MINFO_DATAA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 536:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_MINFO_DATAW {
//     pub pNameMailbox: windows_sys::core::PWSTR,
//     pub pNameErrorsMailbox: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 542:1: declaration Impl has no candidate rule
// impl Default for DNS_MINFO_DATAW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 547:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_MX_DATAA {
//     pub pNameExchange: windows_sys::core::PSTR,
//     pub wPreference: u16,
//     pub Pad: u16,
// }

// UNSUPPORTED Rust 554:1: declaration Impl has no candidate rule
// impl Default for DNS_MX_DATAA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 559:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_MX_DATAW {
//     pub pNameExchange: windows_sys::core::PWSTR,
//     pub wPreference: u16,
//     pub Pad: u16,
// }

// UNSUPPORTED Rust 566:1: declaration Impl has no candidate rule
// impl Default for DNS_MX_DATAW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DNS_NAME_FORMAT` = Int;
// UNSUPPORTED Rust 572:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_NAPTR_DATAA {
//     pub wOrder: u16,
//     pub wPreference: u16,
//     pub pFlags: windows_sys::core::PSTR,
//     pub pService: windows_sys::core::PSTR,
//     pub pRegularExpression: windows_sys::core::PSTR,
//     pub pReplacement: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 582:1: declaration Impl has no candidate rule
// impl Default for DNS_NAPTR_DATAA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 587:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_NAPTR_DATAW {
//     pub wOrder: u16,
//     pub wPreference: u16,
//     pub pFlags: windows_sys::core::PWSTR,
//     pub pService: windows_sys::core::PWSTR,
//     pub pRegularExpression: windows_sys::core::PWSTR,
//     pub pReplacement: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 597:1: declaration Impl has no candidate rule
// impl Default for DNS_NAPTR_DATAW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 602:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_NSEC3PARAM_DATA {
//     pub chAlgorithm: u8,
//     pub bFlags: u8,
//     pub wIterations: u16,
//     pub bSaltLength: u8,
//     pub bPad: [u8; 3],
//     pub pbSalt: [u8; 1],
// }

// UNSUPPORTED Rust 612:1: declaration Impl has no candidate rule
// impl Default for DNS_NSEC3PARAM_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 617:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_NSEC3_DATA {
//     pub chAlgorithm: u8,
//     pub bFlags: u8,
//     pub wIterations: u16,
//     pub bSaltLength: u8,
//     pub bHashLength: u8,
//     pub wTypeBitMapsLength: u16,
//     pub chData: [u8; 1],
// }

// UNSUPPORTED Rust 628:1: declaration Impl has no candidate rule
// impl Default for DNS_NSEC3_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 633:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_NSEC_DATAA {
//     pub pNextDomainName: windows_sys::core::PSTR,
//     pub wTypeBitMapsLength: u16,
//     pub wPad: u16,
//     pub TypeBitMaps: [u8; 1],
// }

// UNSUPPORTED Rust 641:1: declaration Impl has no candidate rule
// impl Default for DNS_NSEC_DATAA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 646:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_NSEC_DATAW {
//     pub pNextDomainName: windows_sys::core::PWSTR,
//     pub wTypeBitMapsLength: u16,
//     pub wPad: u16,
//     pub TypeBitMaps: [u8; 1],
// }

// UNSUPPORTED Rust 654:1: declaration Impl has no candidate rule
// impl Default for DNS_NSEC_DATAW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 659:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_NULL_DATA {
//     pub dwByteCount: u32,
//     pub Data: [u8; 1],
// }

// UNSUPPORTED Rust 665:1: declaration Impl has no candidate rule
// impl Default for DNS_NULL_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 670:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_NXT_DATAA {
//     pub pNameNext: windows_sys::core::PSTR,
//     pub wNumTypes: u16,
//     pub wTypes: [u16; 1],
// }

// UNSUPPORTED Rust 677:1: declaration Impl has no candidate rule
// impl Default for DNS_NXT_DATAA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 682:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_NXT_DATAW {
//     pub pNameNext: windows_sys::core::PWSTR,
//     pub wNumTypes: u16,
//     pub wTypes: [u16; 1],
// }

// UNSUPPORTED Rust 689:1: declaration Impl has no candidate rule
// impl Default for DNS_NXT_DATAW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DNS_OPCODE_IQUERY`: UInt = 1u;
public const val `DNS_OPCODE_NOTIFY`: UInt = 4u;
public const val `DNS_OPCODE_QUERY`: UInt = 0u;
public const val `DNS_OPCODE_SERVER_STATUS`: UInt = 2u;
public const val `DNS_OPCODE_UNKNOWN`: UInt = 3u;
public const val `DNS_OPCODE_UPDATE`: UInt = 5u;
// UNSUPPORTED Rust 700:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_OPT_DATA {
//     pub wDataLength: u16,
//     pub wPad: u16,
//     pub Data: [u8; 1],
// }

// UNSUPPORTED Rust 707:1: declaration Impl has no candidate rule
// impl Default for DNS_OPT_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DNS_PORT_HOST_ORDER`: UInt = 53u;
public const val `DNS_PORT_NET_ORDER`: UInt = 13568u;
public const val `DNS_PROTOCOL_DOH`: UInt = 3u;
public const val `DNS_PROTOCOL_NO_WIRE`: UInt = 5u;
public const val `DNS_PROTOCOL_TCP`: UInt = 2u;
public const val `DNS_PROTOCOL_UDP`: UInt = 1u;
public const val `DNS_PROTOCOL_UNSPECIFIED`: UInt = 0u;
// UNSUPPORTED Rust 719:1: generic scalar type unsupported
// pub type DNS_PROXY_COMPLETION_ROUTINE = Option<unsafe extern "system" fn(completioncontext: *const core::ffi::c_void, status: i32)>;

// UNSUPPORTED Rust 720:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_PROXY_INFORMATION {
//     pub version: u32,
//     pub proxyInformationType: DNS_PROXY_INFORMATION_TYPE,
//     pub proxyName: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 727:1: declaration Impl has no candidate rule
// impl Default for DNS_PROXY_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DNS_PROXY_INFORMATION_DEFAULT_SETTINGS`: `DNS_PROXY_INFORMATION_TYPE` = 1;
public const val `DNS_PROXY_INFORMATION_DIRECT`: `DNS_PROXY_INFORMATION_TYPE` = 0;
public const val `DNS_PROXY_INFORMATION_DOES_NOT_EXIST`: `DNS_PROXY_INFORMATION_TYPE` = 3;
public const val `DNS_PROXY_INFORMATION_PROXY_NAME`: `DNS_PROXY_INFORMATION_TYPE` = 2;
public typealias `DNS_PROXY_INFORMATION_TYPE` = Int;
// UNSUPPORTED Rust 737:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_PTR_DATAA {
//     pub pNameHost: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 742:1: declaration Impl has no candidate rule
// impl Default for DNS_PTR_DATAA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 747:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_PTR_DATAW {
//     pub pNameHost: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 752:1: declaration Impl has no candidate rule
// impl Default for DNS_PTR_DATAW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DNS_QUERY_ACCEPT_TRUNCATED_RESPONSE`: `DNS_QUERY_OPTIONS` = 1u;
public const val `DNS_QUERY_ADDRCONFIG`: `DNS_QUERY_OPTIONS` = 8192u;
public const val `DNS_QUERY_APPEND_MULTILABEL`: `DNS_QUERY_OPTIONS` = 8388608u;
public const val `DNS_QUERY_BYPASS_CACHE`: `DNS_QUERY_OPTIONS` = 8u;
public const val `DNS_QUERY_CACHE_ONLY`: `DNS_QUERY_OPTIONS` = 16u;
// UNSUPPORTED Rust 762:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_QUERY_CANCEL {
//     pub Reserved: [i8; 32],
// }

// UNSUPPORTED Rust 767:1: declaration Impl has no candidate rule
// impl Default for DNS_QUERY_CANCEL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DNS_QUERY_DISABLE_IDN_ENCODING`: `DNS_QUERY_OPTIONS` = 2097152u;
public const val `DNS_QUERY_DNSSEC_CHECKING_DISABLED`: `DNS_QUERY_OPTIONS` = 33554432u;
public const val `DNS_QUERY_DNSSEC_OK`: `DNS_QUERY_OPTIONS` = 16777216u;
public const val `DNS_QUERY_DONT_RESET_TTL_VALUES`: `DNS_QUERY_OPTIONS` = 1048576u;
public const val `DNS_QUERY_DUAL_ADDR`: `DNS_QUERY_OPTIONS` = 16384u;
public const val `DNS_QUERY_MULTICAST_ONLY`: `DNS_QUERY_OPTIONS` = 1024u;
public const val `DNS_QUERY_NO_HOSTS_FILE`: `DNS_QUERY_OPTIONS` = 64u;
public const val `DNS_QUERY_NO_LOCAL_NAME`: `DNS_QUERY_OPTIONS` = 32u;
public const val `DNS_QUERY_NO_MULTICAST`: `DNS_QUERY_OPTIONS` = 2048u;
public const val `DNS_QUERY_NO_NETBT`: `DNS_QUERY_OPTIONS` = 128u;
public const val `DNS_QUERY_NO_RECURSION`: `DNS_QUERY_OPTIONS` = 4u;
public const val `DNS_QUERY_NO_WIRE_QUERY`: `DNS_QUERY_OPTIONS` = 16u;
public typealias `DNS_QUERY_OPTIONS` = UInt;
// UNSUPPORTED Rust 785:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_QUERY_RAW_CANCEL {
//     pub reserved: [i8; 32],
// }

// UNSUPPORTED Rust 790:1: declaration Impl has no candidate rule
// impl Default for DNS_QUERY_RAW_CANCEL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 795:1: generic scalar type unsupported
// pub type DNS_QUERY_RAW_COMPLETION_ROUTINE = Option<unsafe extern "system" fn(querycontext: *const core::ffi::c_void, queryresults: *const DNS_QUERY_RAW_RESULT)>;

public const val `DNS_QUERY_RAW_OPTION_BEST_EFFORT_PARSE`: `DNS_QUERY_OPTIONS` = 1u;
// UNSUPPORTED Rust 797:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_QUERY_RAW_REQUEST {
//     pub version: u32,
//     pub resultsVersion: u32,
//     pub dnsQueryRawSize: u32,
//     pub dnsQueryRaw: *mut u8,
//     pub dnsQueryName: windows_sys::core::PWSTR,
//     pub dnsQueryType: u16,
//     pub queryOptions: u64,
//     pub interfaceIndex: u32,
//     pub queryCompletionCallback: DNS_QUERY_RAW_COMPLETION_ROUTINE,
//     pub queryContext: *mut core::ffi::c_void,
//     pub queryRawOptions: u64,
//     pub customServersSize: u32,
//     pub customServers: *mut DNS_CUSTOM_SERVER,
//     pub protocol: u32,
//     pub Anonymous: DNS_QUERY_RAW_REQUEST_0,
// }

// UNSUPPORTED Rust 816:1: declaration Impl has no candidate rule
// impl Default for DNS_QUERY_RAW_REQUEST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 821:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DNS_QUERY_RAW_REQUEST_0 {
//     pub maxSa: [i8; 32],
// }

// UNSUPPORTED Rust 826:1: declaration Impl has no candidate rule
// impl Default for DNS_QUERY_RAW_REQUEST_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DNS_QUERY_RAW_REQUEST_VERSION1`: `DNS_QUERY_OPTIONS` = 1u;
// UNSUPPORTED Rust 832:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_QUERY_RAW_RESULT {
//     pub version: u32,
//     pub queryStatus: i32,
//     pub queryOptions: u64,
//     pub queryRawOptions: u64,
//     pub responseFlags: u64,
//     pub queryRawResponseSize: u32,
//     pub queryRawResponse: *mut u8,
//     pub queryRecords: *mut DNS_RECORDA,
//     pub protocol: u32,
//     pub Anonymous: DNS_QUERY_RAW_RESULT_0,
// }

// UNSUPPORTED Rust 846:1: declaration Impl has no candidate rule
// impl Default for DNS_QUERY_RAW_RESULT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 851:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DNS_QUERY_RAW_RESULT_0 {
//     pub maxSa: [i8; 32],
// }

// UNSUPPORTED Rust 856:1: declaration Impl has no candidate rule
// impl Default for DNS_QUERY_RAW_RESULT_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DNS_QUERY_RAW_RESULTS_VERSION1`: `DNS_QUERY_OPTIONS` = 1u;
// UNSUPPORTED Rust 862:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_QUERY_REQUEST {
//     pub Version: u32,
//     pub QueryName: windows_sys::core::PCWSTR,
//     pub QueryType: u16,
//     pub QueryOptions: u64,
//     pub pDnsServerList: *mut DNS_ADDR_ARRAY,
//     pub InterfaceIndex: u32,
//     pub pQueryCompletionCallback: PDNS_QUERY_COMPLETION_ROUTINE,
//     pub pQueryContext: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 874:1: declaration Impl has no candidate rule
// impl Default for DNS_QUERY_REQUEST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 879:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_QUERY_REQUEST3 {
//     pub Version: u32,
//     pub QueryName: windows_sys::core::PCWSTR,
//     pub QueryType: u16,
//     pub QueryOptions: u64,
//     pub pDnsServerList: *mut DNS_ADDR_ARRAY,
//     pub InterfaceIndex: u32,
//     pub pQueryCompletionCallback: PDNS_QUERY_COMPLETION_ROUTINE,
//     pub pQueryContext: *mut core::ffi::c_void,
//     pub IsNetworkQueryRequired: windows_sys::core::BOOL,
//     pub RequiredNetworkIndex: u32,
//     pub cCustomServers: u32,
//     pub pCustomServers: *mut DNS_CUSTOM_SERVER,
// }

// UNSUPPORTED Rust 895:1: declaration Impl has no candidate rule
// impl Default for DNS_QUERY_REQUEST3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DNS_QUERY_REQUEST_VERSION1`: `DNS_QUERY_OPTIONS` = 1u;
public const val `DNS_QUERY_REQUEST_VERSION2`: `DNS_QUERY_OPTIONS` = 2u;
public const val `DNS_QUERY_REQUEST_VERSION3`: `DNS_QUERY_OPTIONS` = 3u;
public const val `DNS_QUERY_RESERVED`: `DNS_QUERY_OPTIONS` = 4026531840u;
// UNSUPPORTED Rust 904:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_QUERY_RESULT {
//     pub Version: u32,
//     pub QueryStatus: i32,
//     pub QueryOptions: u64,
//     pub pQueryRecords: *mut DNS_RECORDA,
//     pub Reserved: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 913:1: declaration Impl has no candidate rule
// impl Default for DNS_QUERY_RESULT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DNS_QUERY_RESULTS_VERSION1`: `DNS_QUERY_OPTIONS` = 1u;
public const val `DNS_QUERY_RETURN_MESSAGE`: `DNS_QUERY_OPTIONS` = 512u;
public const val `DNS_QUERY_STANDARD`: `DNS_QUERY_OPTIONS` = 0u;
public const val `DNS_QUERY_TREAT_AS_FQDN`: `DNS_QUERY_OPTIONS` = 4096u;
public const val `DNS_QUERY_USE_TCP_ONLY`: `DNS_QUERY_OPTIONS` = 2u;
public const val `DNS_QUERY_WIRE_ONLY`: `DNS_QUERY_OPTIONS` = 256u;
public const val `DNS_RCLASS_ALL`: UInt = 65280u;
public const val `DNS_RCLASS_ANY`: UInt = 65280u;
public const val `DNS_RCLASS_CHAOS`: UInt = 768u;
public const val `DNS_RCLASS_CSNET`: UInt = 512u;
public const val `DNS_RCLASS_HESIOD`: UInt = 1024u;
public const val `DNS_RCLASS_INTERNET`: UInt = 256u;
public const val `DNS_RCLASS_MDNS_CACHE_FLUSH`: UInt = 128u;
public const val `DNS_RCLASS_NONE`: UInt = 65024u;
public const val `DNS_RCLASS_UNICAST_RESPONSE`: UInt = 128u;
public const val `DNS_RCODE_BADKEY`: UInt = 17u;
public const val `DNS_RCODE_BADSIG`: UInt = 16u;
public const val `DNS_RCODE_BADTIME`: UInt = 18u;
public const val `DNS_RCODE_BADVERS`: UInt = 16u;
public const val `DNS_RCODE_FORMAT_ERROR`: UInt = 1u;
public const val `DNS_RCODE_FORMERR`: UInt = 1u;
public const val `DNS_RCODE_MAX`: UInt = 15u;
public const val `DNS_RCODE_NAME_ERROR`: UInt = 3u;
public const val `DNS_RCODE_NOERROR`: UInt = 0u;
public const val `DNS_RCODE_NOTAUTH`: UInt = 9u;
public const val `DNS_RCODE_NOTIMPL`: UInt = 4u;
public const val `DNS_RCODE_NOTZONE`: UInt = 10u;
public const val `DNS_RCODE_NOT_IMPLEMENTED`: UInt = 4u;
public const val `DNS_RCODE_NO_ERROR`: UInt = 0u;
public const val `DNS_RCODE_NXDOMAIN`: UInt = 3u;
public const val `DNS_RCODE_NXRRSET`: UInt = 8u;
public const val `DNS_RCODE_REFUSED`: UInt = 5u;
public const val `DNS_RCODE_SERVER_FAILURE`: UInt = 2u;
public const val `DNS_RCODE_SERVFAIL`: UInt = 2u;
public const val `DNS_RCODE_YXDOMAIN`: UInt = 6u;
public const val `DNS_RCODE_YXRRSET`: UInt = 7u;
// UNSUPPORTED Rust 954:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_RECORDA {
//     pub pNext: *mut DNS_RECORDA,
//     pub pName: windows_sys::core::PSTR,
//     pub wType: u16,
//     pub wDataLength: u16,
//     pub Flags: DNS_RECORDA_0,
//     pub dwTtl: u32,
//     pub dwReserved: u32,
//     pub Data: DNS_RECORDA_1,
// }

// UNSUPPORTED Rust 966:1: declaration Impl has no candidate rule
// impl Default for DNS_RECORDA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 971:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DNS_RECORDA_1 {
//     pub A: DNS_A_DATA,
//     pub SOA: DNS_SOA_DATAA,
//     pub Soa: DNS_SOA_DATAA,
//     pub PTR: DNS_PTR_DATAA,
//     pub Ptr: DNS_PTR_DATAA,
//     pub NS: DNS_PTR_DATAA,
//     pub Ns: DNS_PTR_DATAA,
//     pub CNAME: DNS_PTR_DATAA,
//     pub Cname: DNS_PTR_DATAA,
//     pub DNAME: DNS_PTR_DATAA,
//     pub Dname: DNS_PTR_DATAA,
//     pub MB: DNS_PTR_DATAA,
//     pub Mb: DNS_PTR_DATAA,
//     pub MD: DNS_PTR_DATAA,
//     pub Md: DNS_PTR_DATAA,
//     pub MF: DNS_PTR_DATAA,
//     pub Mf: DNS_PTR_DATAA,
//     pub MG: DNS_PTR_DATAA,
//     pub Mg: DNS_PTR_DATAA,
//     pub MR: DNS_PTR_DATAA,
//     pub Mr: DNS_PTR_DATAA,
//     pub MINFO: DNS_MINFO_DATAA,
//     pub Minfo: DNS_MINFO_DATAA,
//     pub RP: DNS_MINFO_DATAA,
//     pub Rp: DNS_MINFO_DATAA,
//     pub MX: DNS_MX_DATAA,
//     pub Mx: DNS_MX_DATAA,
//     pub AFSDB: DNS_MX_DATAA,
//     pub Afsdb: DNS_MX_DATAA,
//     pub RT: DNS_MX_DATAA,
//     pub Rt: DNS_MX_DATAA,
//     pub HINFO: DNS_TXT_DATAA,
//     pub Hinfo: DNS_TXT_DATAA,
//     pub ISDN: DNS_TXT_DATAA,
//     pub Isdn: DNS_TXT_DATAA,
//     pub TXT: DNS_TXT_DATAA,
//     pub Txt: DNS_TXT_DATAA,
//     pub X25: DNS_TXT_DATAA,
//     pub Null: DNS_NULL_DATA,
//     pub WKS: DNS_WKS_DATA,
//     pub Wks: DNS_WKS_DATA,
//     pub AAAA: DNS_AAAA_DATA,
//     pub KEY: DNS_KEY_DATA,
//     pub Key: DNS_KEY_DATA,
//     pub SIG: DNS_SIG_DATAA,
//     pub Sig: DNS_SIG_DATAA,
//     pub ATMA: DNS_ATMA_DATA,
//     pub Atma: DNS_ATMA_DATA,
//     pub NXT: DNS_NXT_DATAA,
//     pub Nxt: DNS_NXT_DATAA,
//     pub SRV: DNS_SRV_DATAA,
//     pub Srv: DNS_SRV_DATAA,
//     pub NAPTR: DNS_NAPTR_DATAA,
//     pub Naptr: DNS_NAPTR_DATAA,
//     pub OPT: DNS_OPT_DATA,
//     pub Opt: DNS_OPT_DATA,
//     pub DS: DNS_DS_DATA,
//     pub Ds: DNS_DS_DATA,
//     pub RRSIG: DNS_SIG_DATAA,
//     pub Rrsig: DNS_SIG_DATAA,
//     pub NSEC: DNS_NSEC_DATAA,
//     pub Nsec: DNS_NSEC_DATAA,
//     pub DNSKEY: DNS_KEY_DATA,
//     pub Dnskey: DNS_KEY_DATA,
//     pub TKEY: DNS_TKEY_DATAA,
//     pub Tkey: DNS_TKEY_DATAA,
//     pub TSIG: DNS_TSIG_DATAA,
//     pub Tsig: DNS_TSIG_DATAA,
//     pub WINS: DNS_WINS_DATA,
//     pub Wins: DNS_WINS_DATA,
//     pub WINSR: DNS_WINSR_DATAA,
//     pub WinsR: DNS_WINSR_DATAA,
//     pub NBSTAT: DNS_WINSR_DATAA,
//     pub Nbstat: DNS_WINSR_DATAA,
//     pub DHCID: DNS_DHCID_DATA,
//     pub NSEC3: DNS_NSEC3_DATA,
//     pub Nsec3: DNS_NSEC3_DATA,
//     pub NSEC3PARAM: DNS_NSEC3PARAM_DATA,
//     pub Nsec3Param: DNS_NSEC3PARAM_DATA,
//     pub TLSA: DNS_TLSA_DATA,
//     pub Tlsa: DNS_TLSA_DATA,
//     pub SVCB: DNS_SVCB_DATA,
//     pub Svcb: DNS_SVCB_DATA,
//     pub UNKNOWN: DNS_UNKNOWN_DATA,
//     pub Unknown: DNS_UNKNOWN_DATA,
//     pub pDataPtr: *mut u8,
// }

// UNSUPPORTED Rust 1061:1: declaration Impl has no candidate rule
// impl Default for DNS_RECORDA_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1066:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DNS_RECORDA_0 {
//     pub DW: u32,
//     pub S: DNS_RECORD_FLAGS,
// }

// UNSUPPORTED Rust 1072:1: declaration Impl has no candidate rule
// impl Default for DNS_RECORDA_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1077:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_RECORDW {
//     pub pNext: *mut DNS_RECORDW,
//     pub pName: windows_sys::core::PWSTR,
//     pub wType: u16,
//     pub wDataLength: u16,
//     pub Flags: DNS_RECORDW_0,
//     pub dwTtl: u32,
//     pub dwReserved: u32,
//     pub Data: DNS_RECORDW_1,
// }

// UNSUPPORTED Rust 1089:1: declaration Impl has no candidate rule
// impl Default for DNS_RECORDW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1094:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DNS_RECORDW_1 {
//     pub A: DNS_A_DATA,
//     pub SOA: DNS_SOA_DATAW,
//     pub Soa: DNS_SOA_DATAW,
//     pub PTR: DNS_PTR_DATAW,
//     pub Ptr: DNS_PTR_DATAW,
//     pub NS: DNS_PTR_DATAW,
//     pub Ns: DNS_PTR_DATAW,
//     pub CNAME: DNS_PTR_DATAW,
//     pub Cname: DNS_PTR_DATAW,
//     pub DNAME: DNS_PTR_DATAW,
//     pub Dname: DNS_PTR_DATAW,
//     pub MB: DNS_PTR_DATAW,
//     pub Mb: DNS_PTR_DATAW,
//     pub MD: DNS_PTR_DATAW,
//     pub Md: DNS_PTR_DATAW,
//     pub MF: DNS_PTR_DATAW,
//     pub Mf: DNS_PTR_DATAW,
//     pub MG: DNS_PTR_DATAW,
//     pub Mg: DNS_PTR_DATAW,
//     pub MR: DNS_PTR_DATAW,
//     pub Mr: DNS_PTR_DATAW,
//     pub MINFO: DNS_MINFO_DATAW,
//     pub Minfo: DNS_MINFO_DATAW,
//     pub RP: DNS_MINFO_DATAW,
//     pub Rp: DNS_MINFO_DATAW,
//     pub MX: DNS_MX_DATAW,
//     pub Mx: DNS_MX_DATAW,
//     pub AFSDB: DNS_MX_DATAW,
//     pub Afsdb: DNS_MX_DATAW,
//     pub RT: DNS_MX_DATAW,
//     pub Rt: DNS_MX_DATAW,
//     pub HINFO: DNS_TXT_DATAW,
//     pub Hinfo: DNS_TXT_DATAW,
//     pub ISDN: DNS_TXT_DATAW,
//     pub Isdn: DNS_TXT_DATAW,
//     pub TXT: DNS_TXT_DATAW,
//     pub Txt: DNS_TXT_DATAW,
//     pub X25: DNS_TXT_DATAW,
//     pub Null: DNS_NULL_DATA,
//     pub WKS: DNS_WKS_DATA,
//     pub Wks: DNS_WKS_DATA,
//     pub AAAA: DNS_AAAA_DATA,
//     pub KEY: DNS_KEY_DATA,
//     pub Key: DNS_KEY_DATA,
//     pub SIG: DNS_SIG_DATAW,
//     pub Sig: DNS_SIG_DATAW,
//     pub ATMA: DNS_ATMA_DATA,
//     pub Atma: DNS_ATMA_DATA,
//     pub NXT: DNS_NXT_DATAW,
//     pub Nxt: DNS_NXT_DATAW,
//     pub SRV: DNS_SRV_DATAW,
//     pub Srv: DNS_SRV_DATAW,
//     pub NAPTR: DNS_NAPTR_DATAW,
//     pub Naptr: DNS_NAPTR_DATAW,
//     pub OPT: DNS_OPT_DATA,
//     pub Opt: DNS_OPT_DATA,
//     pub DS: DNS_DS_DATA,
//     pub Ds: DNS_DS_DATA,
//     pub RRSIG: DNS_SIG_DATAW,
//     pub Rrsig: DNS_SIG_DATAW,
//     pub NSEC: DNS_NSEC_DATAW,
//     pub Nsec: DNS_NSEC_DATAW,
//     pub DNSKEY: DNS_KEY_DATA,
//     pub Dnskey: DNS_KEY_DATA,
//     pub TKEY: DNS_TKEY_DATAW,
//     pub Tkey: DNS_TKEY_DATAW,
//     pub TSIG: DNS_TSIG_DATAW,
//     pub Tsig: DNS_TSIG_DATAW,
//     pub WINS: DNS_WINS_DATA,
//     pub Wins: DNS_WINS_DATA,
//     pub WINSR: DNS_WINSR_DATAW,
//     pub WinsR: DNS_WINSR_DATAW,
//     pub NBSTAT: DNS_WINSR_DATAW,
//     pub Nbstat: DNS_WINSR_DATAW,
//     pub DHCID: DNS_DHCID_DATA,
//     pub NSEC3: DNS_NSEC3_DATA,
//     pub Nsec3: DNS_NSEC3_DATA,
//     pub NSEC3PARAM: DNS_NSEC3PARAM_DATA,
//     pub Nsec3Param: DNS_NSEC3PARAM_DATA,
//     pub TLSA: DNS_TLSA_DATA,
//     pub Tlsa: DNS_TLSA_DATA,
//     pub SVCB: DNS_SVCB_DATA,
//     pub Svcb: DNS_SVCB_DATA,
//     pub UNKNOWN: DNS_UNKNOWN_DATA,
//     pub Unknown: DNS_UNKNOWN_DATA,
//     pub pDataPtr: *mut u8,
// }

// UNSUPPORTED Rust 1184:1: declaration Impl has no candidate rule
// impl Default for DNS_RECORDW_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1189:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DNS_RECORDW_0 {
//     pub DW: u32,
//     pub S: DNS_RECORD_FLAGS,
// }

// UNSUPPORTED Rust 1195:1: declaration Impl has no candidate rule
// impl Default for DNS_RECORDW_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1200:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DNS_RECORD_FLAGS {
//     pub _bitfield: u32,
// }

// UNSUPPORTED Rust 1205:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_RECORD_OPTW {
//     pub pNext: *mut DNS_RECORDW,
//     pub pName: windows_sys::core::PWSTR,
//     pub wType: u16,
//     pub wDataLength: u16,
//     pub Flags: DNS_RECORD_OPTW_0,
//     pub ExtHeader: DNS_HEADER_EXT,
//     pub wPayloadSize: u16,
//     pub wReserved: u16,
//     pub Data: DNS_RECORD_OPTW_1,
// }

// UNSUPPORTED Rust 1218:1: declaration Impl has no candidate rule
// impl Default for DNS_RECORD_OPTW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1223:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DNS_RECORD_OPTW_1 {
//     pub OPT: DNS_OPT_DATA,
//     pub Opt: DNS_OPT_DATA,
// }

// UNSUPPORTED Rust 1229:1: declaration Impl has no candidate rule
// impl Default for DNS_RECORD_OPTW_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1234:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DNS_RECORD_OPTW_0 {
//     pub DW: u32,
//     pub S: DNS_RECORD_FLAGS,
// }

// UNSUPPORTED Rust 1240:1: declaration Impl has no candidate rule
// impl Default for DNS_RECORD_OPTW_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DNS_RFC_MAX_UDP_PACKET_LENGTH`: UInt = 512u;
// UNSUPPORTED Rust 1246:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_RRSET {
//     pub pFirstRR: *mut DNS_RECORDA,
//     pub pLastRR: *mut DNS_RECORDA,
// }

// UNSUPPORTED Rust 1252:1: declaration Impl has no candidate rule
// impl Default for DNS_RRSET {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DNS_RTYPE_A`: UInt = 256u;
public const val `DNS_RTYPE_A6`: UInt = 9728u;
public const val `DNS_RTYPE_AAAA`: UInt = 7168u;
public const val `DNS_RTYPE_AFSDB`: UInt = 4608u;
public const val `DNS_RTYPE_ALL`: UInt = 65280u;
public const val `DNS_RTYPE_ANY`: UInt = 65280u;
public const val `DNS_RTYPE_ATMA`: UInt = 8704u;
public const val `DNS_RTYPE_AXFR`: UInt = 64512u;
public const val `DNS_RTYPE_CERT`: UInt = 9472u;
public const val `DNS_RTYPE_CNAME`: UInt = 1280u;
public const val `DNS_RTYPE_DHCID`: UInt = 12544u;
public const val `DNS_RTYPE_DNAME`: UInt = 9984u;
public const val `DNS_RTYPE_DNSKEY`: UInt = 12288u;
public const val `DNS_RTYPE_DS`: UInt = 11008u;
public const val `DNS_RTYPE_EID`: UInt = 7936u;
public const val `DNS_RTYPE_GID`: UInt = 26112u;
public const val `DNS_RTYPE_GPOS`: UInt = 6912u;
public const val `DNS_RTYPE_HINFO`: UInt = 3328u;
public const val `DNS_RTYPE_ISDN`: UInt = 5120u;
public const val `DNS_RTYPE_IXFR`: UInt = 64256u;
public const val `DNS_RTYPE_KEY`: UInt = 6400u;
public const val `DNS_RTYPE_KX`: UInt = 9216u;
public const val `DNS_RTYPE_LOC`: UInt = 7424u;
public const val `DNS_RTYPE_MAILA`: UInt = 65024u;
public const val `DNS_RTYPE_MAILB`: UInt = 64768u;
public const val `DNS_RTYPE_MB`: UInt = 1792u;
public const val `DNS_RTYPE_MD`: UInt = 768u;
public const val `DNS_RTYPE_MF`: UInt = 1024u;
public const val `DNS_RTYPE_MG`: UInt = 2048u;
public const val `DNS_RTYPE_MINFO`: UInt = 3584u;
public const val `DNS_RTYPE_MR`: UInt = 2304u;
public const val `DNS_RTYPE_MX`: UInt = 3840u;
public const val `DNS_RTYPE_NAPTR`: UInt = 8960u;
public const val `DNS_RTYPE_NIMLOC`: UInt = 8192u;
public const val `DNS_RTYPE_NS`: UInt = 512u;
public const val `DNS_RTYPE_NSAP`: UInt = 5632u;
public const val `DNS_RTYPE_NSAPPTR`: UInt = 5888u;
public const val `DNS_RTYPE_NSEC`: UInt = 12032u;
public const val `DNS_RTYPE_NSEC3`: UInt = 12800u;
public const val `DNS_RTYPE_NSEC3PARAM`: UInt = 13056u;
public const val `DNS_RTYPE_NULL`: UInt = 2560u;
public const val `DNS_RTYPE_NXT`: UInt = 7680u;
public const val `DNS_RTYPE_OPT`: UInt = 10496u;
public const val `DNS_RTYPE_PTR`: UInt = 3072u;
public const val `DNS_RTYPE_PX`: UInt = 6656u;
public const val `DNS_RTYPE_RP`: UInt = 4352u;
public const val `DNS_RTYPE_RRSIG`: UInt = 11776u;
public const val `DNS_RTYPE_RT`: UInt = 5376u;
public const val `DNS_RTYPE_SIG`: UInt = 6144u;
public const val `DNS_RTYPE_SINK`: UInt = 10240u;
public const val `DNS_RTYPE_SOA`: UInt = 1536u;
public const val `DNS_RTYPE_SRV`: UInt = 8448u;
public const val `DNS_RTYPE_TEXT`: UInt = 4096u;
public const val `DNS_RTYPE_TKEY`: UInt = 63744u;
public const val `DNS_RTYPE_TLSA`: UInt = 13312u;
public const val `DNS_RTYPE_TSIG`: UInt = 64000u;
public const val `DNS_RTYPE_UID`: UInt = 25856u;
public const val `DNS_RTYPE_UINFO`: UInt = 25600u;
public const val `DNS_RTYPE_UNSPEC`: UInt = 26368u;
public const val `DNS_RTYPE_WINS`: UInt = 511u;
public const val `DNS_RTYPE_WINSR`: UInt = 767u;
public const val `DNS_RTYPE_WKS`: UInt = 2816u;
public const val `DNS_RTYPE_X25`: UInt = 4864u;
public typealias `DNS_SECTION` = Int;
// UNSUPPORTED Rust 1321:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_SERVICE_BROWSE_REQUEST {
//     pub Version: u32,
//     pub InterfaceIndex: u32,
//     pub QueryName: windows_sys::core::PCWSTR,
//     pub Anonymous: DNS_SERVICE_BROWSE_REQUEST_0,
//     pub pQueryContext: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 1330:1: declaration Impl has no candidate rule
// impl Default for DNS_SERVICE_BROWSE_REQUEST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1335:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DNS_SERVICE_BROWSE_REQUEST_0 {
//     pub pBrowseCallback: PDNS_SERVICE_BROWSE_CALLBACK,
//     pub pBrowseCallbackV2: PDNS_QUERY_COMPLETION_ROUTINE,
// }

// UNSUPPORTED Rust 1341:1: declaration Impl has no candidate rule
// impl Default for DNS_SERVICE_BROWSE_REQUEST_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1346:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_SERVICE_CANCEL {
//     pub reserved: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 1351:1: declaration Impl has no candidate rule
// impl Default for DNS_SERVICE_CANCEL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1356:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_SERVICE_INSTANCE {
//     pub pszInstanceName: windows_sys::core::PWSTR,
//     pub pszHostName: windows_sys::core::PWSTR,
//     pub ip4Address: *mut u32,
//     pub ip6Address: *mut IP6_ADDRESS,
//     pub wPort: u16,
//     pub wPriority: u16,
//     pub wWeight: u16,
//     pub dwPropertyCount: u32,
//     pub keys: *mut windows_sys::core::PWSTR,
//     pub values: *mut windows_sys::core::PWSTR,
//     pub dwInterfaceIndex: u32,
// }

// UNSUPPORTED Rust 1371:1: declaration Impl has no candidate rule
// impl Default for DNS_SERVICE_INSTANCE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1376:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_SERVICE_REGISTER_REQUEST {
//     pub Version: u32,
//     pub InterfaceIndex: u32,
//     pub pServiceInstance: *mut DNS_SERVICE_INSTANCE,
//     pub pRegisterCompletionCallback: PDNS_SERVICE_REGISTER_COMPLETE,
//     pub pQueryContext: *mut core::ffi::c_void,
//     pub hCredentials: super::super::Foundation::HANDLE,
//     pub unicastEnabled: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 1387:1: declaration Impl has no candidate rule
// impl Default for DNS_SERVICE_REGISTER_REQUEST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1392:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_SERVICE_RESOLVE_REQUEST {
//     pub Version: u32,
//     pub InterfaceIndex: u32,
//     pub QueryName: windows_sys::core::PWSTR,
//     pub pResolveCompletionCallback: PDNS_SERVICE_RESOLVE_COMPLETE,
//     pub pQueryContext: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 1401:1: declaration Impl has no candidate rule
// impl Default for DNS_SERVICE_RESOLVE_REQUEST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1406:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_SIG_DATAA {
//     pub wTypeCovered: u16,
//     pub chAlgorithm: u8,
//     pub chLabelCount: u8,
//     pub dwOriginalTtl: u32,
//     pub dwExpiration: u32,
//     pub dwTimeSigned: u32,
//     pub wKeyTag: u16,
//     pub wSignatureLength: u16,
//     pub pNameSigner: windows_sys::core::PSTR,
//     pub Signature: [u8; 1],
// }

// UNSUPPORTED Rust 1420:1: declaration Impl has no candidate rule
// impl Default for DNS_SIG_DATAA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1425:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_SIG_DATAW {
//     pub wTypeCovered: u16,
//     pub chAlgorithm: u8,
//     pub chLabelCount: u8,
//     pub dwOriginalTtl: u32,
//     pub dwExpiration: u32,
//     pub dwTimeSigned: u32,
//     pub wKeyTag: u16,
//     pub wSignatureLength: u16,
//     pub pNameSigner: windows_sys::core::PWSTR,
//     pub Signature: [u8; 1],
// }

// UNSUPPORTED Rust 1439:1: declaration Impl has no candidate rule
// impl Default for DNS_SIG_DATAW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1444:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_SOA_DATAA {
//     pub pNamePrimaryServer: windows_sys::core::PSTR,
//     pub pNameAdministrator: windows_sys::core::PSTR,
//     pub dwSerialNo: u32,
//     pub dwRefresh: u32,
//     pub dwRetry: u32,
//     pub dwExpire: u32,
//     pub dwDefaultTtl: u32,
// }

// UNSUPPORTED Rust 1455:1: declaration Impl has no candidate rule
// impl Default for DNS_SOA_DATAA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1460:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_SOA_DATAW {
//     pub pNamePrimaryServer: windows_sys::core::PWSTR,
//     pub pNameAdministrator: windows_sys::core::PWSTR,
//     pub dwSerialNo: u32,
//     pub dwRefresh: u32,
//     pub dwRetry: u32,
//     pub dwExpire: u32,
//     pub dwDefaultTtl: u32,
// }

// UNSUPPORTED Rust 1471:1: declaration Impl has no candidate rule
// impl Default for DNS_SOA_DATAW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1476:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_SRV_DATAA {
//     pub pNameTarget: windows_sys::core::PSTR,
//     pub wPriority: u16,
//     pub wWeight: u16,
//     pub wPort: u16,
//     pub Pad: u16,
// }

// UNSUPPORTED Rust 1485:1: declaration Impl has no candidate rule
// impl Default for DNS_SRV_DATAA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1490:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_SRV_DATAW {
//     pub pNameTarget: windows_sys::core::PWSTR,
//     pub wPriority: u16,
//     pub wWeight: u16,
//     pub wPort: u16,
//     pub Pad: u16,
// }

// UNSUPPORTED Rust 1499:1: declaration Impl has no candidate rule
// impl Default for DNS_SRV_DATAW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1504:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_SVCB_DATA {
//     pub wSvcPriority: u16,
//     pub pszTargetName: windows_sys::core::PSTR,
//     pub cSvcParams: u16,
//     pub pSvcParams: *mut DNS_SVCB_PARAM,
// }

// UNSUPPORTED Rust 1512:1: declaration Impl has no candidate rule
// impl Default for DNS_SVCB_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1517:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_SVCB_PARAM {
//     pub wSvcParamKey: u16,
//     pub Anonymous: DNS_SVCB_PARAM_0,
// }

// UNSUPPORTED Rust 1523:1: declaration Impl has no candidate rule
// impl Default for DNS_SVCB_PARAM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1528:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DNS_SVCB_PARAM_0 {
//     pub pIpv4Hints: *mut DNS_SVCB_PARAM_IPV4,
//     pub pIpv6Hints: *mut DNS_SVCB_PARAM_IPV6,
//     pub pMandatory: *mut DNS_SVCB_PARAM_MANDATORY,
//     pub pAlpn: *mut DNS_SVCB_PARAM_ALPN,
//     pub wPort: u16,
//     pub pUnknown: *mut DNS_SVCB_PARAM_UNKNOWN,
//     pub pszDohPath: windows_sys::core::PSTR,
//     pub pReserved: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 1540:1: declaration Impl has no candidate rule
// impl Default for DNS_SVCB_PARAM_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1545:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_SVCB_PARAM_ALPN {
//     pub cIds: u16,
//     pub rgIds: [DNS_SVCB_PARAM_ALPN_ID; 1],
// }

// UNSUPPORTED Rust 1551:1: declaration Impl has no candidate rule
// impl Default for DNS_SVCB_PARAM_ALPN {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1556:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_SVCB_PARAM_ALPN_ID {
//     pub cBytes: u8,
//     pub pbId: *mut u8,
// }

// UNSUPPORTED Rust 1562:1: declaration Impl has no candidate rule
// impl Default for DNS_SVCB_PARAM_ALPN_ID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1567:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_SVCB_PARAM_IPV4 {
//     pub cIps: u16,
//     pub rgIps: [u32; 1],
// }

// UNSUPPORTED Rust 1573:1: declaration Impl has no candidate rule
// impl Default for DNS_SVCB_PARAM_IPV4 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1578:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_SVCB_PARAM_IPV6 {
//     pub cIps: u16,
//     pub rgIps: [IP6_ADDRESS; 1],
// }

// UNSUPPORTED Rust 1584:1: declaration Impl has no candidate rule
// impl Default for DNS_SVCB_PARAM_IPV6 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1589:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_SVCB_PARAM_MANDATORY {
//     pub cMandatoryKeys: u16,
//     pub rgwMandatoryKeys: [u16; 1],
// }

// UNSUPPORTED Rust 1595:1: declaration Impl has no candidate rule
// impl Default for DNS_SVCB_PARAM_MANDATORY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DNS_SVCB_PARAM_TYPE` = Int;
// UNSUPPORTED Rust 1601:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_SVCB_PARAM_UNKNOWN {
//     pub cBytes: u16,
//     pub pbSvcParamValue: [u8; 1],
// }

// UNSUPPORTED Rust 1607:1: declaration Impl has no candidate rule
// impl Default for DNS_SVCB_PARAM_UNKNOWN {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1612:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_TKEY_DATAA {
//     pub pNameAlgorithm: windows_sys::core::PSTR,
//     pub pAlgorithmPacket: *mut u8,
//     pub pKey: *mut u8,
//     pub pOtherData: *mut u8,
//     pub dwCreateTime: u32,
//     pub dwExpireTime: u32,
//     pub wMode: u16,
//     pub wError: u16,
//     pub wKeyLength: u16,
//     pub wOtherLength: u16,
//     pub cAlgNameLength: u8,
//     pub bPacketPointers: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 1628:1: declaration Impl has no candidate rule
// impl Default for DNS_TKEY_DATAA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1633:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_TKEY_DATAW {
//     pub pNameAlgorithm: windows_sys::core::PWSTR,
//     pub pAlgorithmPacket: *mut u8,
//     pub pKey: *mut u8,
//     pub pOtherData: *mut u8,
//     pub dwCreateTime: u32,
//     pub dwExpireTime: u32,
//     pub wMode: u16,
//     pub wError: u16,
//     pub wKeyLength: u16,
//     pub wOtherLength: u16,
//     pub cAlgNameLength: u8,
//     pub bPacketPointers: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 1649:1: declaration Impl has no candidate rule
// impl Default for DNS_TKEY_DATAW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DNS_TKEY_MODE_DIFFIE_HELLMAN`: UInt = 2u;
public const val `DNS_TKEY_MODE_GSS`: UInt = 3u;
public const val `DNS_TKEY_MODE_RESOLVER_ASSIGN`: UInt = 4u;
public const val `DNS_TKEY_MODE_SERVER_ASSIGN`: UInt = 1u;
// UNSUPPORTED Rust 1658:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_TLSA_DATA {
//     pub bCertUsage: u8,
//     pub bSelector: u8,
//     pub bMatchingType: u8,
//     pub bCertificateAssociationDataLength: u16,
//     pub bPad: [u8; 3],
//     pub bCertificateAssociationData: [u8; 1],
// }

// UNSUPPORTED Rust 1668:1: declaration Impl has no candidate rule
// impl Default for DNS_TLSA_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1673:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_TSIG_DATAA {
//     pub pNameAlgorithm: windows_sys::core::PSTR,
//     pub pAlgorithmPacket: *mut u8,
//     pub pSignature: *mut u8,
//     pub pOtherData: *mut u8,
//     pub i64CreateTime: i64,
//     pub wFudgeTime: u16,
//     pub wOriginalXid: u16,
//     pub wError: u16,
//     pub wSigLength: u16,
//     pub wOtherLength: u16,
//     pub cAlgNameLength: u8,
//     pub bPacketPointers: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 1689:1: declaration Impl has no candidate rule
// impl Default for DNS_TSIG_DATAA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1694:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_TSIG_DATAW {
//     pub pNameAlgorithm: windows_sys::core::PWSTR,
//     pub pAlgorithmPacket: *mut u8,
//     pub pSignature: *mut u8,
//     pub pOtherData: *mut u8,
//     pub i64CreateTime: i64,
//     pub wFudgeTime: u16,
//     pub wOriginalXid: u16,
//     pub wError: u16,
//     pub wSigLength: u16,
//     pub wOtherLength: u16,
//     pub cAlgNameLength: u8,
//     pub bPacketPointers: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 1710:1: declaration Impl has no candidate rule
// impl Default for DNS_TSIG_DATAW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1715:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_TXT_DATAA {
//     pub dwStringCount: u32,
//     pub pStringArray: [windows_sys::core::PSTR; 1],
// }

// UNSUPPORTED Rust 1721:1: declaration Impl has no candidate rule
// impl Default for DNS_TXT_DATAA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1726:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_TXT_DATAW {
//     pub dwStringCount: u32,
//     pub pStringArray: [windows_sys::core::PWSTR; 1],
// }

// UNSUPPORTED Rust 1732:1: declaration Impl has no candidate rule
// impl Default for DNS_TXT_DATAW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DNS_TYPE` = UShort;
public const val `DNS_TYPE_A`: `DNS_TYPE` = 1u;
public const val `DNS_TYPE_A6`: `DNS_TYPE` = 38u;
public const val `DNS_TYPE_AAAA`: `DNS_TYPE` = 28u;
public const val `DNS_TYPE_ADDRS`: `DNS_TYPE` = 248u;
public const val `DNS_TYPE_AFSDB`: `DNS_TYPE` = 18u;
public const val `DNS_TYPE_ALL`: `DNS_TYPE` = 255u;
public const val `DNS_TYPE_ANY`: `DNS_TYPE` = 255u;
public const val `DNS_TYPE_ATMA`: `DNS_TYPE` = 34u;
public const val `DNS_TYPE_AXFR`: `DNS_TYPE` = 252u;
public const val `DNS_TYPE_CERT`: `DNS_TYPE` = 37u;
public const val `DNS_TYPE_CNAME`: `DNS_TYPE` = 5u;
public const val `DNS_TYPE_DHCID`: `DNS_TYPE` = 49u;
public const val `DNS_TYPE_DNAME`: `DNS_TYPE` = 39u;
public const val `DNS_TYPE_DNSKEY`: `DNS_TYPE` = 48u;
public const val `DNS_TYPE_DS`: `DNS_TYPE` = 43u;
public const val `DNS_TYPE_EID`: `DNS_TYPE` = 31u;
public const val `DNS_TYPE_GID`: `DNS_TYPE` = 102u;
public const val `DNS_TYPE_GPOS`: `DNS_TYPE` = 27u;
public const val `DNS_TYPE_HINFO`: `DNS_TYPE` = 13u;
public const val `DNS_TYPE_HTTPS`: `DNS_TYPE` = 65u;
public const val `DNS_TYPE_ISDN`: `DNS_TYPE` = 20u;
public const val `DNS_TYPE_IXFR`: `DNS_TYPE` = 251u;
public const val `DNS_TYPE_KEY`: `DNS_TYPE` = 25u;
public const val `DNS_TYPE_KX`: `DNS_TYPE` = 36u;
public const val `DNS_TYPE_LOC`: `DNS_TYPE` = 29u;
public const val `DNS_TYPE_MAILA`: `DNS_TYPE` = 254u;
public const val `DNS_TYPE_MAILB`: `DNS_TYPE` = 253u;
public const val `DNS_TYPE_MB`: `DNS_TYPE` = 7u;
public const val `DNS_TYPE_MD`: `DNS_TYPE` = 3u;
public const val `DNS_TYPE_MF`: `DNS_TYPE` = 4u;
public const val `DNS_TYPE_MG`: `DNS_TYPE` = 8u;
public const val `DNS_TYPE_MINFO`: `DNS_TYPE` = 14u;
public const val `DNS_TYPE_MR`: `DNS_TYPE` = 9u;
public const val `DNS_TYPE_MX`: `DNS_TYPE` = 15u;
public const val `DNS_TYPE_NAPTR`: `DNS_TYPE` = 35u;
public const val `DNS_TYPE_NBSTAT`: `DNS_TYPE` = 65282u;
public const val `DNS_TYPE_NIMLOC`: `DNS_TYPE` = 32u;
public const val `DNS_TYPE_NS`: `DNS_TYPE` = 2u;
public const val `DNS_TYPE_NSAP`: `DNS_TYPE` = 22u;
public const val `DNS_TYPE_NSAPPTR`: `DNS_TYPE` = 23u;
public const val `DNS_TYPE_NSEC`: `DNS_TYPE` = 47u;
public const val `DNS_TYPE_NSEC3`: `DNS_TYPE` = 50u;
public const val `DNS_TYPE_NSEC3PARAM`: `DNS_TYPE` = 51u;
public const val `DNS_TYPE_NULL`: `DNS_TYPE` = 10u;
public const val `DNS_TYPE_NXT`: `DNS_TYPE` = 30u;
public const val `DNS_TYPE_OPT`: `DNS_TYPE` = 41u;
public const val `DNS_TYPE_PTR`: `DNS_TYPE` = 12u;
public const val `DNS_TYPE_PX`: `DNS_TYPE` = 26u;
public const val `DNS_TYPE_RP`: `DNS_TYPE` = 17u;
public const val `DNS_TYPE_RRSIG`: `DNS_TYPE` = 46u;
public const val `DNS_TYPE_RT`: `DNS_TYPE` = 21u;
public const val `DNS_TYPE_SIG`: `DNS_TYPE` = 24u;
public const val `DNS_TYPE_SINK`: `DNS_TYPE` = 40u;
public const val `DNS_TYPE_SOA`: `DNS_TYPE` = 6u;
public const val `DNS_TYPE_SRV`: `DNS_TYPE` = 33u;
public const val `DNS_TYPE_SVCB`: `DNS_TYPE` = 64u;
public const val `DNS_TYPE_TEXT`: `DNS_TYPE` = 16u;
public const val `DNS_TYPE_TKEY`: `DNS_TYPE` = 249u;
public const val `DNS_TYPE_TLSA`: `DNS_TYPE` = 52u;
public const val `DNS_TYPE_TSIG`: `DNS_TYPE` = 250u;
public const val `DNS_TYPE_UID`: `DNS_TYPE` = 101u;
public const val `DNS_TYPE_UINFO`: `DNS_TYPE` = 100u;
public const val `DNS_TYPE_UNSPEC`: `DNS_TYPE` = 103u;
public const val `DNS_TYPE_WINS`: `DNS_TYPE` = 65281u;
public const val `DNS_TYPE_WINSR`: `DNS_TYPE` = 65282u;
public const val `DNS_TYPE_WKS`: `DNS_TYPE` = 11u;
public const val `DNS_TYPE_X25`: `DNS_TYPE` = 19u;
public const val `DNS_TYPE_ZERO`: `DNS_TYPE` = 0u;
// UNSUPPORTED Rust 1806:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_UNKNOWN_DATA {
//     pub dwByteCount: u32,
//     pub bData: [u8; 1],
// }

// UNSUPPORTED Rust 1812:1: declaration Impl has no candidate rule
// impl Default for DNS_UNKNOWN_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DNS_UPDATE_CACHE_SECURITY_CONTEXT`: UInt = 512u;
public const val `DNS_UPDATE_FORCE_SECURITY_NEGO`: UInt = 2048u;
public const val `DNS_UPDATE_REMOTE_SERVER`: UInt = 16384u;
public const val `DNS_UPDATE_RESERVED`: UInt = 4294901760u;
public const val `DNS_UPDATE_SECURITY_OFF`: UInt = 16u;
public const val `DNS_UPDATE_SECURITY_ON`: UInt = 32u;
public const val `DNS_UPDATE_SECURITY_ONLY`: UInt = 256u;
public const val `DNS_UPDATE_SECURITY_USE_DEFAULT`: UInt = 0u;
public const val `DNS_UPDATE_SKIP_NO_UPDATE_ADAPTERS`: UInt = 8192u;
public const val `DNS_UPDATE_TEST_USE_LOCAL_SYS_ACCT`: UInt = 1024u;
public const val `DNS_UPDATE_TRY_ALL_MASTER_SERVERS`: UInt = 4096u;
public const val `DNS_VALSVR_ERROR_INVALID_ADDR`: UInt = 1u;
public const val `DNS_VALSVR_ERROR_INVALID_NAME`: UInt = 2u;
public const val `DNS_VALSVR_ERROR_NO_AUTH`: UInt = 5u;
public const val `DNS_VALSVR_ERROR_NO_RESPONSE`: UInt = 4u;
public const val `DNS_VALSVR_ERROR_NO_TCP`: UInt = 16u;
public const val `DNS_VALSVR_ERROR_REFUSED`: UInt = 6u;
public const val `DNS_VALSVR_ERROR_UNKNOWN`: UInt = 255u;
public const val `DNS_VALSVR_ERROR_UNREACHABLE`: UInt = 3u;
// UNSUPPORTED Rust 1836:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_WINSR_DATAA {
//     pub dwMappingFlag: u32,
//     pub dwLookupTimeout: u32,
//     pub dwCacheTimeout: u32,
//     pub pNameResultDomain: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 1844:1: declaration Impl has no candidate rule
// impl Default for DNS_WINSR_DATAA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1849:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_WINSR_DATAW {
//     pub dwMappingFlag: u32,
//     pub dwLookupTimeout: u32,
//     pub dwCacheTimeout: u32,
//     pub pNameResultDomain: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 1857:1: declaration Impl has no candidate rule
// impl Default for DNS_WINSR_DATAW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1862:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_WINS_DATA {
//     pub dwMappingFlag: u32,
//     pub dwLookupTimeout: u32,
//     pub dwCacheTimeout: u32,
//     pub cWinsServerCount: u32,
//     pub WinsServers: [u32; 1],
// }

// UNSUPPORTED Rust 1871:1: declaration Impl has no candidate rule
// impl Default for DNS_WINS_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DNS_WINS_FLAG_LOCAL`: UInt = 65536u;
public const val `DNS_WINS_FLAG_SCOPE`: UInt = 2147483648u;
// UNSUPPORTED Rust 1878:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct DNS_WIRE_QUESTION {
//     pub QuestionType: u16,
//     pub QuestionClass: u16,
// }

// UNSUPPORTED Rust 1884:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct DNS_WIRE_RECORD {
//     pub RecordType: u16,
//     pub RecordClass: u16,
//     pub TimeToLive: u32,
//     pub DataLength: u16,
// }

// UNSUPPORTED Rust 1892:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DNS_WKS_DATA {
//     pub IpAddress: u32,
//     pub chProtocol: u8,
//     pub BitMask: [u8; 1],
// }

// UNSUPPORTED Rust 1899:1: declaration Impl has no candidate rule
// impl Default for DNS_WKS_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DnsCharSetAnsi`: `DNS_CHARSET` = 3;
public const val `DnsCharSetUnicode`: `DNS_CHARSET` = 1;
public const val `DnsCharSetUnknown`: `DNS_CHARSET` = 0;
public const val `DnsCharSetUtf8`: `DNS_CHARSET` = 2;
public const val `DnsConfigAdapterDomainName_A`: `DNS_CONFIG_TYPE` = 4;
public const val `DnsConfigAdapterDomainName_UTF8`: `DNS_CONFIG_TYPE` = 5;
public const val `DnsConfigAdapterDomainName_W`: `DNS_CONFIG_TYPE` = 3;
public const val `DnsConfigAdapterHostNameRegistrationEnabled`: `DNS_CONFIG_TYPE` = 10;
public const val `DnsConfigAdapterInfo`: `DNS_CONFIG_TYPE` = 8;
public const val `DnsConfigAddressRegistrationMaxCount`: `DNS_CONFIG_TYPE` = 11;
public const val `DnsConfigDnsServerList`: `DNS_CONFIG_TYPE` = 6;
public const val `DnsConfigFullHostName_A`: `DNS_CONFIG_TYPE` = 16;
public const val `DnsConfigFullHostName_UTF8`: `DNS_CONFIG_TYPE` = 17;
public const val `DnsConfigFullHostName_W`: `DNS_CONFIG_TYPE` = 15;
public const val `DnsConfigHostName_A`: `DNS_CONFIG_TYPE` = 13;
public const val `DnsConfigHostName_UTF8`: `DNS_CONFIG_TYPE` = 14;
public const val `DnsConfigHostName_W`: `DNS_CONFIG_TYPE` = 12;
public const val `DnsConfigNameServer`: `DNS_CONFIG_TYPE` = 18;
public const val `DnsConfigPrimaryDomainName_A`: `DNS_CONFIG_TYPE` = 1;
public const val `DnsConfigPrimaryDomainName_UTF8`: `DNS_CONFIG_TYPE` = 2;
public const val `DnsConfigPrimaryDomainName_W`: `DNS_CONFIG_TYPE` = 0;
public const val `DnsConfigPrimaryHostNameRegistrationEnabled`: `DNS_CONFIG_TYPE` = 9;
public const val `DnsConfigSearchList`: `DNS_CONFIG_TYPE` = 7;
public const val `DnsFreeFlat`: `DNS_FREE_TYPE` = 0;
public const val `DnsFreeParsedMessageFields`: `DNS_FREE_TYPE` = 2;
public const val `DnsFreeRecordList`: `DNS_FREE_TYPE` = 1;
public const val `DnsNameDomain`: `DNS_NAME_FORMAT` = 0;
public const val `DnsNameDomainLabel`: `DNS_NAME_FORMAT` = 1;
public const val `DnsNameHostnameFull`: `DNS_NAME_FORMAT` = 2;
public const val `DnsNameHostnameLabel`: `DNS_NAME_FORMAT` = 3;
public const val `DnsNameSrvRecord`: `DNS_NAME_FORMAT` = 5;
public const val `DnsNameValidateTld`: `DNS_NAME_FORMAT` = 6;
public const val `DnsNameWildcard`: `DNS_NAME_FORMAT` = 4;
public const val `DnsSectionAddtional`: `DNS_SECTION` = 3;
public const val `DnsSectionAnswer`: `DNS_SECTION` = 1;
public const val `DnsSectionAuthority`: `DNS_SECTION` = 2;
public const val `DnsSectionQuestion`: `DNS_SECTION` = 0;
public const val `DnsSvcbParamAlpn`: `DNS_SVCB_PARAM_TYPE` = 1;
public const val `DnsSvcbParamDohPath`: `DNS_SVCB_PARAM_TYPE` = 7;
public const val `DnsSvcbParamDohPathOpenDns`: `DNS_SVCB_PARAM_TYPE` = 65432;
public const val `DnsSvcbParamDohPathQuad9`: `DNS_SVCB_PARAM_TYPE` = 65380;
public const val `DnsSvcbParamEch`: `DNS_SVCB_PARAM_TYPE` = 5;
public const val `DnsSvcbParamIpv4Hint`: `DNS_SVCB_PARAM_TYPE` = 4;
public const val `DnsSvcbParamIpv6Hint`: `DNS_SVCB_PARAM_TYPE` = 6;
public const val `DnsSvcbParamMandatory`: `DNS_SVCB_PARAM_TYPE` = 0;
public const val `DnsSvcbParamNoDefaultAlpn`: `DNS_SVCB_PARAM_TYPE` = 2;
public const val `DnsSvcbParamPort`: `DNS_SVCB_PARAM_TYPE` = 3;
public const val `IP4_ADDRESS_STRING_BUFFER_LENGTH`: UInt = 16u;
public const val `IP4_ADDRESS_STRING_LENGTH`: UInt = 16u;
// UNSUPPORTED Rust 1953:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IP4_ARRAY {
//     pub AddrCount: u32,
//     pub AddrArray: [u32; 1],
// }

// UNSUPPORTED Rust 1959:1: declaration Impl has no candidate rule
// impl Default for IP4_ARRAY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1964:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub union IP6_ADDRESS {
//     pub IP6Dword: [u32; 4],
//     pub IP6Word: [u16; 8],
//     pub IP6Byte: [u8; 16],
// }

// UNSUPPORTED Rust 1972:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for IP6_ADDRESS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1978:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub union IP6_ADDRESS {
//     pub IP6Qword: [u64; 2],
//     pub IP6Dword: [u32; 4],
//     pub IP6Word: [u16; 8],
//     pub IP6Byte: [u8; 16],
// }

// UNSUPPORTED Rust 1987:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for IP6_ADDRESS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IP6_ADDRESS_STRING_BUFFER_LENGTH`: UInt = 65u;
public const val `IP6_ADDRESS_STRING_LENGTH`: UInt = 65u;
// UNSUPPORTED Rust 1995:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MDNS_QUERY_HANDLE {
//     pub nameBuf: [u16; 256],
//     pub wType: u16,
//     pub pSubscription: *mut core::ffi::c_void,
//     pub pWnfCallbackParams: *mut core::ffi::c_void,
//     pub stateNameData: [u32; 2],
// }

// UNSUPPORTED Rust 2004:1: declaration Impl has no candidate rule
// impl Default for MDNS_QUERY_HANDLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2009:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MDNS_QUERY_REQUEST {
//     pub Version: u32,
//     pub ulRefCount: u32,
//     pub Query: windows_sys::core::PCWSTR,
//     pub QueryType: u16,
//     pub QueryOptions: u64,
//     pub InterfaceIndex: u32,
//     pub pQueryCallback: PMDNS_QUERY_CALLBACK,
//     pub pQueryContext: *mut core::ffi::c_void,
//     pub fAnswerReceived: windows_sys::core::BOOL,
//     pub ulResendCount: u32,
// }

// UNSUPPORTED Rust 2023:1: declaration Impl has no candidate rule
// impl Default for MDNS_QUERY_REQUEST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2028:1: generic scalar type unsupported
// pub type PDNS_QUERY_COMPLETION_ROUTINE = Option<unsafe extern "system" fn(pquerycontext: *const core::ffi::c_void, pqueryresults: *mut DNS_QUERY_RESULT)>;

// UNSUPPORTED Rust 2029:1: generic scalar type unsupported
// pub type PDNS_SERVICE_BROWSE_CALLBACK = Option<unsafe extern "system" fn(status: u32, pquerycontext: *const core::ffi::c_void, pdnsrecord: *const DNS_RECORDW)>;

// UNSUPPORTED Rust 2030:1: generic scalar type unsupported
// pub type PDNS_SERVICE_REGISTER_COMPLETE = Option<unsafe extern "system" fn(status: u32, pquerycontext: *const core::ffi::c_void, pinstance: *const DNS_SERVICE_INSTANCE)>;

// UNSUPPORTED Rust 2031:1: generic scalar type unsupported
// pub type PDNS_SERVICE_RESOLVE_COMPLETE = Option<unsafe extern "system" fn(status: u32, pquerycontext: *const core::ffi::c_void, pinstance: *const DNS_SERVICE_INSTANCE)>;

// UNSUPPORTED Rust 2032:1: generic scalar type unsupported
// pub type PMDNS_QUERY_CALLBACK = Option<unsafe extern "system" fn(pquerycontext: *const core::ffi::c_void, pqueryhandle: *mut MDNS_QUERY_HANDLE, pqueryresults: *mut DNS_QUERY_RESULT)>;

public const val `SIZEOF_IP4_ADDRESS`: UInt = 4u;
public const val `TAG_DNS_CONNECTION_POLICY_TAG_CONNECTION_MANAGER`: `DNS_CONNECTION_POLICY_TAG` = 1;
public const val `TAG_DNS_CONNECTION_POLICY_TAG_DEFAULT`: `DNS_CONNECTION_POLICY_TAG` = 0;
public const val `TAG_DNS_CONNECTION_POLICY_TAG_WWWPT`: `DNS_CONNECTION_POLICY_TAG` = 2;
// UNSUPPORTED Rust 2037:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct _DnsRecordOptA {
//     pub pNext: *mut DNS_RECORDA,
//     pub pName: windows_sys::core::PSTR,
//     pub wType: u16,
//     pub wDataLength: u16,
//     pub Flags: _DnsRecordOptA_0,
//     pub ExtHeader: DNS_HEADER_EXT,
//     pub wPayloadSize: u16,
//     pub wReserved: u16,
//     pub Data: _DnsRecordOptA_1,
// }

// UNSUPPORTED Rust 2050:1: declaration Impl has no candidate rule
// impl Default for _DnsRecordOptA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2055:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union _DnsRecordOptA_1 {
//     pub OPT: DNS_OPT_DATA,
//     pub Opt: DNS_OPT_DATA,
// }

// UNSUPPORTED Rust 2061:1: declaration Impl has no candidate rule
// impl Default for _DnsRecordOptA_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2066:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union _DnsRecordOptA_0 {
//     pub DW: u32,
//     pub S: DNS_RECORD_FLAGS,
// }

// UNSUPPORTED Rust 2072:1: declaration Impl has no candidate rule
// impl Default for _DnsRecordOptA_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

