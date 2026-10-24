// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("wsnmp32.dll" "system" fn SnmpCancelMsg(session : isize, reqid : i32) -> u32);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("wsnmp32.dll" "system" fn SnmpCleanup() -> u32);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("wsnmp32.dll" "system" fn SnmpCleanupEx() -> u32);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("wsnmp32.dll" "system" fn SnmpClose(session : isize) -> u32);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("wsnmp32.dll" "system" fn SnmpContextToStr(context : isize, string : *mut smiOCTETS) -> u32);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("wsnmp32.dll" "system" fn SnmpCountVbl(vbl : isize) -> u32);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("wsnmp32.dll" "system" fn SnmpCreatePdu(session : isize, pdu_type : SNMP_PDU_TYPE, request_id : i32, error_status : i32, error_index : i32, varbindlist : isize) -> isize);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("wsnmp32.dll" "system" fn SnmpCreateSession(hwnd : super::super::Foundation:: HWND, wmsg : u32, fcallback : SNMPAPI_CALLBACK, lpclientdata : *mut core::ffi::c_void) -> isize);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("wsnmp32.dll" "system" fn SnmpCreateVbl(session : isize, name : *mut smiOID, value : *mut smiVALUE) -> isize);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("wsnmp32.dll" "system" fn SnmpDecodeMsg(session : isize, srcentity : *mut isize, dstentity : *mut isize, context : *mut isize, pdu : *mut isize, msgbufdesc : *mut smiOCTETS) -> u32);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("wsnmp32.dll" "system" fn SnmpDeleteVb(vbl : isize, index : u32) -> u32);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// windows_link::link!("wsnmp32.dll" "system" fn SnmpDuplicatePdu(session : isize, pdu : isize) -> isize);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// windows_link::link!("wsnmp32.dll" "system" fn SnmpDuplicateVbl(session : isize, vbl : isize) -> isize);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// windows_link::link!("wsnmp32.dll" "system" fn SnmpEncodeMsg(session : isize, srcentity : isize, dstentity : isize, context : isize, pdu : isize, msgbufdesc : *mut smiOCTETS) -> u32);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// windows_link::link!("wsnmp32.dll" "system" fn SnmpEntityToStr(entity : isize, size : u32, string : windows_sys::core::PSTR) -> u32);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// windows_link::link!("wsnmp32.dll" "system" fn SnmpFreeContext(context : isize) -> u32);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// windows_link::link!("wsnmp32.dll" "system" fn SnmpFreeDescriptor(syntax : u32, descriptor : *mut smiOCTETS) -> u32);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// windows_link::link!("wsnmp32.dll" "system" fn SnmpFreeEntity(entity : isize) -> u32);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// windows_link::link!("wsnmp32.dll" "system" fn SnmpFreePdu(pdu : isize) -> u32);

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// windows_link::link!("wsnmp32.dll" "system" fn SnmpFreeVbl(vbl : isize) -> u32);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// windows_link::link!("wsnmp32.dll" "system" fn SnmpGetLastError(session : isize) -> u32);

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// windows_link::link!("wsnmp32.dll" "system" fn SnmpGetPduData(pdu : isize, pdu_type : *mut SNMP_PDU_TYPE, request_id : *mut i32, error_status : *mut SNMP_ERROR, error_index : *mut i32, varbindlist : *mut isize) -> u32);

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// windows_link::link!("wsnmp32.dll" "system" fn SnmpGetRetransmitMode(nretransmitmode : *mut SNMP_STATUS) -> u32);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// windows_link::link!("wsnmp32.dll" "system" fn SnmpGetRetry(hentity : isize, npolicyretry : *mut u32, nactualretry : *mut u32) -> u32);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// windows_link::link!("wsnmp32.dll" "system" fn SnmpGetTimeout(hentity : isize, npolicytimeout : *mut u32, nactualtimeout : *mut u32) -> u32);

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// windows_link::link!("wsnmp32.dll" "system" fn SnmpGetTranslateMode(ntranslatemode : *mut SNMP_API_TRANSLATE_MODE) -> u32);

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// windows_link::link!("wsnmp32.dll" "system" fn SnmpGetVb(vbl : isize, index : u32, name : *mut smiOID, value : *mut smiVALUE) -> u32);

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// windows_link::link!("wsnmp32.dll" "system" fn SnmpGetVendorInfo(vendorinfo : *mut smiVENDORINFO) -> u32);

// UNSUPPORTED Rust 29:1: declaration Macro has no candidate rule
// windows_link::link!("wsnmp32.dll" "system" fn SnmpListen(hentity : isize, lstatus : SNMP_STATUS) -> u32);

// UNSUPPORTED Rust 30:1: declaration Macro has no candidate rule
// windows_link::link!("wsnmp32.dll" "system" fn SnmpListenEx(hentity : isize, lstatus : u32, nuseentityaddr : u32) -> u32);

// UNSUPPORTED Rust 31:1: declaration Macro has no candidate rule
// windows_link::link!("mgmtapi.dll" "system" fn SnmpMgrClose(session : *mut core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 32:1: declaration Macro has no candidate rule
// windows_link::link!("mgmtapi.dll" "system" fn SnmpMgrCtl(session : *mut core::ffi::c_void, dwctlcode : u32, lpvinbuffer : *mut core::ffi::c_void, cbinbuffer : u32, lpvoutbuffer : *mut core::ffi::c_void, cboutbuffer : u32, lpcbbytesreturned : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 33:1: declaration Macro has no candidate rule
// windows_link::link!("mgmtapi.dll" "system" fn SnmpMgrGetTrap(enterprise : *mut AsnObjectIdentifier, ipaddress : *mut AsnOctetString, generictrap : *mut SNMP_GENERICTRAP, specifictrap : *mut i32, timestamp : *mut u32, variablebindings : *mut SnmpVarBindList) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 34:1: declaration Macro has no candidate rule
// windows_link::link!("mgmtapi.dll" "system" fn SnmpMgrGetTrapEx(enterprise : *mut AsnObjectIdentifier, agentaddress : *mut AsnOctetString, sourceaddress : *mut AsnOctetString, generictrap : *mut SNMP_GENERICTRAP, specifictrap : *mut i32, community : *mut AsnOctetString, timestamp : *mut u32, variablebindings : *mut SnmpVarBindList) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 35:1: declaration Macro has no candidate rule
// windows_link::link!("mgmtapi.dll" "system" fn SnmpMgrOidToStr(oid : *mut AsnObjectIdentifier, string : *mut windows_sys::core::PSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 36:1: declaration Macro has no candidate rule
// windows_link::link!("mgmtapi.dll" "system" fn SnmpMgrOpen(lpagentaddress : windows_sys::core::PCSTR, lpagentcommunity : windows_sys::core::PCSTR, ntimeout : i32, nretries : i32) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 37:1: declaration Macro has no candidate rule
// windows_link::link!("mgmtapi.dll" "system" fn SnmpMgrRequest(session : *mut core::ffi::c_void, requesttype : u8, variablebindings : *mut SnmpVarBindList, errorstatus : *mut SNMP_ERROR_STATUS, errorindex : *mut i32) -> i32);

// UNSUPPORTED Rust 38:1: declaration Macro has no candidate rule
// windows_link::link!("mgmtapi.dll" "system" fn SnmpMgrStrToOid(string : windows_sys::core::PCSTR, oid : *mut AsnObjectIdentifier) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 39:1: declaration Macro has no candidate rule
// windows_link::link!("mgmtapi.dll" "system" fn SnmpMgrTrapListen(phtrapavailable : *mut super::super::Foundation:: HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 40:1: declaration Macro has no candidate rule
// windows_link::link!("wsnmp32.dll" "system" fn SnmpOidCompare(xoid : *mut smiOID, yoid : *mut smiOID, maxlen : u32, result : *mut i32) -> u32);

// UNSUPPORTED Rust 41:1: declaration Macro has no candidate rule
// windows_link::link!("wsnmp32.dll" "system" fn SnmpOidCopy(srcoid : *mut smiOID, dstoid : *mut smiOID) -> u32);

// UNSUPPORTED Rust 42:1: declaration Macro has no candidate rule
// windows_link::link!("wsnmp32.dll" "system" fn SnmpOidToStr(srcoid : *const smiOID, size : u32, string : windows_sys::core::PSTR) -> u32);

// UNSUPPORTED Rust 43:1: declaration Macro has no candidate rule
// windows_link::link!("wsnmp32.dll" "system" fn SnmpOpen(hwnd : super::super::Foundation:: HWND, wmsg : u32) -> isize);

// UNSUPPORTED Rust 44:1: declaration Macro has no candidate rule
// windows_link::link!("wsnmp32.dll" "system" fn SnmpRecvMsg(session : isize, srcentity : *mut isize, dstentity : *mut isize, context : *mut isize, pdu : *mut isize) -> u32);

// UNSUPPORTED Rust 45:1: declaration Macro has no candidate rule
// windows_link::link!("wsnmp32.dll" "system" fn SnmpRegister(session : isize, srcentity : isize, dstentity : isize, context : isize, notification : *mut smiOID, state : SNMP_STATUS) -> u32);

// UNSUPPORTED Rust 46:1: declaration Macro has no candidate rule
// windows_link::link!("wsnmp32.dll" "system" fn SnmpSendMsg(session : isize, srcentity : isize, dstentity : isize, context : isize, pdu : isize) -> u32);

// UNSUPPORTED Rust 47:1: declaration Macro has no candidate rule
// windows_link::link!("wsnmp32.dll" "system" fn SnmpSetPduData(pdu : isize, pdu_type : *const i32, request_id : *const i32, non_repeaters : *const i32, max_repetitions : *const i32, varbindlist : *const isize) -> u32);

// UNSUPPORTED Rust 48:1: declaration Macro has no candidate rule
// windows_link::link!("wsnmp32.dll" "system" fn SnmpSetPort(hentity : isize, nport : u32) -> u32);

// UNSUPPORTED Rust 49:1: declaration Macro has no candidate rule
// windows_link::link!("wsnmp32.dll" "system" fn SnmpSetRetransmitMode(nretransmitmode : SNMP_STATUS) -> u32);

// UNSUPPORTED Rust 50:1: declaration Macro has no candidate rule
// windows_link::link!("wsnmp32.dll" "system" fn SnmpSetRetry(hentity : isize, npolicyretry : u32) -> u32);

// UNSUPPORTED Rust 51:1: declaration Macro has no candidate rule
// windows_link::link!("wsnmp32.dll" "system" fn SnmpSetTimeout(hentity : isize, npolicytimeout : u32) -> u32);

// UNSUPPORTED Rust 52:1: declaration Macro has no candidate rule
// windows_link::link!("wsnmp32.dll" "system" fn SnmpSetTranslateMode(ntranslatemode : SNMP_API_TRANSLATE_MODE) -> u32);

// UNSUPPORTED Rust 53:1: declaration Macro has no candidate rule
// windows_link::link!("wsnmp32.dll" "system" fn SnmpSetVb(vbl : isize, index : u32, name : *mut smiOID, value : *mut smiVALUE) -> u32);

// UNSUPPORTED Rust 54:1: declaration Macro has no candidate rule
// windows_link::link!("wsnmp32.dll" "system" fn SnmpStartup(nmajorversion : *mut u32, nminorversion : *mut u32, nlevel : *mut u32, ntranslatemode : *mut SNMP_API_TRANSLATE_MODE, nretransmitmode : *mut SNMP_STATUS) -> u32);

// UNSUPPORTED Rust 55:1: declaration Macro has no candidate rule
// windows_link::link!("wsnmp32.dll" "system" fn SnmpStartupEx(nmajorversion : *mut u32, nminorversion : *mut u32, nlevel : *mut u32, ntranslatemode : *mut SNMP_API_TRANSLATE_MODE, nretransmitmode : *mut SNMP_STATUS) -> u32);

// UNSUPPORTED Rust 56:1: declaration Macro has no candidate rule
// windows_link::link!("wsnmp32.dll" "system" fn SnmpStrToContext(session : isize, string : *mut smiOCTETS) -> isize);

// UNSUPPORTED Rust 57:1: declaration Macro has no candidate rule
// windows_link::link!("wsnmp32.dll" "system" fn SnmpStrToEntity(session : isize, string : windows_sys::core::PCSTR) -> isize);

// UNSUPPORTED Rust 58:1: declaration Macro has no candidate rule
// windows_link::link!("wsnmp32.dll" "system" fn SnmpStrToOid(string : windows_sys::core::PCSTR, dstoid : *mut smiOID) -> u32);

// UNSUPPORTED Rust 59:1: declaration Macro has no candidate rule
// windows_link::link!("snmpapi.dll" "system" fn SnmpSvcGetUptime() -> u32);

// UNSUPPORTED Rust 60:1: declaration Macro has no candidate rule
// windows_link::link!("snmpapi.dll" "system" fn SnmpSvcSetLogLevel(nloglevel : SNMP_LOG));

// UNSUPPORTED Rust 61:1: declaration Macro has no candidate rule
// windows_link::link!("snmpapi.dll" "system" fn SnmpSvcSetLogType(nlogtype : i32));

// UNSUPPORTED Rust 62:1: declaration Macro has no candidate rule
// windows_link::link!("snmpapi.dll" "system" fn SnmpUtilAsnAnyCpy(panydst : *mut AsnAny, panysrc : *mut AsnAny) -> i32);

// UNSUPPORTED Rust 63:1: declaration Macro has no candidate rule
// windows_link::link!("snmpapi.dll" "system" fn SnmpUtilAsnAnyFree(pany : *mut AsnAny));

// UNSUPPORTED Rust 64:1: declaration Macro has no candidate rule
// windows_link::link!("snmpapi.dll" "C" fn SnmpUtilDbgPrint(nloglevel : SNMP_LOG, szformat : windows_sys::core::PCSTR, ...));

// UNSUPPORTED Rust 65:1: declaration Macro has no candidate rule
// windows_link::link!("snmpapi.dll" "system" fn SnmpUtilIdsToA(ids : *mut u32, idlength : u32) -> windows_sys::core::PSTR);

// UNSUPPORTED Rust 66:1: declaration Macro has no candidate rule
// windows_link::link!("snmpapi.dll" "system" fn SnmpUtilMemAlloc(nbytes : u32) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 67:1: declaration Macro has no candidate rule
// windows_link::link!("snmpapi.dll" "system" fn SnmpUtilMemFree(pmem : *mut core::ffi::c_void));

// UNSUPPORTED Rust 68:1: declaration Macro has no candidate rule
// windows_link::link!("snmpapi.dll" "system" fn SnmpUtilMemReAlloc(pmem : *mut core::ffi::c_void, nbytes : u32) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 69:1: declaration Macro has no candidate rule
// windows_link::link!("snmpapi.dll" "system" fn SnmpUtilOctetsCmp(poctets1 : *mut AsnOctetString, poctets2 : *mut AsnOctetString) -> i32);

// UNSUPPORTED Rust 70:1: declaration Macro has no candidate rule
// windows_link::link!("snmpapi.dll" "system" fn SnmpUtilOctetsCpy(poctetsdst : *mut AsnOctetString, poctetssrc : *mut AsnOctetString) -> i32);

// UNSUPPORTED Rust 71:1: declaration Macro has no candidate rule
// windows_link::link!("snmpapi.dll" "system" fn SnmpUtilOctetsFree(poctets : *mut AsnOctetString));

// UNSUPPORTED Rust 72:1: declaration Macro has no candidate rule
// windows_link::link!("snmpapi.dll" "system" fn SnmpUtilOctetsNCmp(poctets1 : *mut AsnOctetString, poctets2 : *mut AsnOctetString, nchars : u32) -> i32);

// UNSUPPORTED Rust 73:1: declaration Macro has no candidate rule
// windows_link::link!("snmpapi.dll" "system" fn SnmpUtilOidAppend(poiddst : *mut AsnObjectIdentifier, poidsrc : *mut AsnObjectIdentifier) -> i32);

// UNSUPPORTED Rust 74:1: declaration Macro has no candidate rule
// windows_link::link!("snmpapi.dll" "system" fn SnmpUtilOidCmp(poid1 : *mut AsnObjectIdentifier, poid2 : *mut AsnObjectIdentifier) -> i32);

// UNSUPPORTED Rust 75:1: declaration Macro has no candidate rule
// windows_link::link!("snmpapi.dll" "system" fn SnmpUtilOidCpy(poiddst : *mut AsnObjectIdentifier, poidsrc : *mut AsnObjectIdentifier) -> i32);

// UNSUPPORTED Rust 76:1: declaration Macro has no candidate rule
// windows_link::link!("snmpapi.dll" "system" fn SnmpUtilOidFree(poid : *mut AsnObjectIdentifier));

// UNSUPPORTED Rust 77:1: declaration Macro has no candidate rule
// windows_link::link!("snmpapi.dll" "system" fn SnmpUtilOidNCmp(poid1 : *mut AsnObjectIdentifier, poid2 : *mut AsnObjectIdentifier, nsubids : u32) -> i32);

// UNSUPPORTED Rust 78:1: declaration Macro has no candidate rule
// windows_link::link!("snmpapi.dll" "system" fn SnmpUtilOidToA(oid : *mut AsnObjectIdentifier) -> windows_sys::core::PSTR);

// UNSUPPORTED Rust 79:1: declaration Macro has no candidate rule
// windows_link::link!("snmpapi.dll" "system" fn SnmpUtilPrintAsnAny(pany : *mut AsnAny));

// UNSUPPORTED Rust 80:1: declaration Macro has no candidate rule
// windows_link::link!("snmpapi.dll" "system" fn SnmpUtilPrintOid(oid : *mut AsnObjectIdentifier));

// UNSUPPORTED Rust 81:1: declaration Macro has no candidate rule
// windows_link::link!("snmpapi.dll" "system" fn SnmpUtilVarBindCpy(pvbdst : *mut SnmpVarBind, pvbsrc : *mut SnmpVarBind) -> i32);

// UNSUPPORTED Rust 82:1: declaration Macro has no candidate rule
// windows_link::link!("snmpapi.dll" "system" fn SnmpUtilVarBindFree(pvb : *mut SnmpVarBind));

// UNSUPPORTED Rust 83:1: declaration Macro has no candidate rule
// windows_link::link!("snmpapi.dll" "system" fn SnmpUtilVarBindListCpy(pvbldst : *mut SnmpVarBindList, pvblsrc : *mut SnmpVarBindList) -> i32);

// UNSUPPORTED Rust 84:1: declaration Macro has no candidate rule
// windows_link::link!("snmpapi.dll" "system" fn SnmpUtilVarBindListFree(pvbl : *mut SnmpVarBindList));

public const val `ASN_APPLICATION`: UInt = 64u;
public const val `ASN_CONSTRUCTOR`: UInt = 32u;
public const val `ASN_CONTEXT`: UInt = 128u;
public const val `ASN_CONTEXTSPECIFIC`: UInt = 128u;
public const val `ASN_PRIMATIVE`: UInt = 0u;
public const val `ASN_PRIMITIVE`: UInt = 0u;
public const val `ASN_PRIVATE`: UInt = 192u;
public const val `ASN_UNIVERSAL`: UInt = 0u;
// UNSUPPORTED Rust 93:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[derive(Clone, Copy)]
// pub struct AsnAny {
//     pub asnType: u8,
//     pub asnValue: AsnAny_0,
// }

// UNSUPPORTED Rust 99:1: declaration Impl has no candidate rule
// impl Default for AsnAny {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 104:1: declaration Union has no candidate rule
// #[repr(C, packed(4))]
// #[derive(Clone, Copy)]
// pub union AsnAny_0 {
//     pub number: i32,
//     pub unsigned32: u32,
//     pub counter64: u64,
//     pub string: AsnOctetString,
//     pub bits: AsnOctetString,
//     pub object: AsnObjectIdentifier,
//     pub sequence: AsnOctetString,
//     pub address: AsnOctetString,
//     pub counter: u32,
//     pub gauge: u32,
//     pub ticks: u32,
//     pub arbitrary: AsnOctetString,
// }

// UNSUPPORTED Rust 120:1: declaration Impl has no candidate rule
// impl Default for AsnAny_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 125:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct AsnObjectIdentifier {
//     pub idLength: u32,
//     pub ids: *mut u32,
// }

// UNSUPPORTED Rust 132:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for AsnObjectIdentifier {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 138:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct AsnObjectIdentifier {
//     pub idLength: u32,
//     pub ids: *mut u32,
// }

// UNSUPPORTED Rust 145:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for AsnObjectIdentifier {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 151:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct AsnOctetString {
//     pub stream: *mut u8,
//     pub length: u32,
//     pub dynamic: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 159:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for AsnOctetString {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 165:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct AsnOctetString {
//     pub stream: *mut u8,
//     pub length: u32,
//     pub dynamic: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 173:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for AsnOctetString {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DEFAULT_SNMPTRAP_PORT_IPX`: UInt = 36880u;
public const val `DEFAULT_SNMPTRAP_PORT_UDP`: UInt = 162u;
public const val `DEFAULT_SNMP_PORT_IPX`: UInt = 36879u;
public const val `DEFAULT_SNMP_PORT_UDP`: UInt = 161u;
public const val `MAXOBJIDSIZE`: UInt = 128u;
public const val `MAXOBJIDSTRSIZE`: UInt = 1408u;
public const val `MAXVENDORINFO`: UInt = 32u;
public const val `MGMCTL_SETAGENTPORT`: UInt = 1u;
// UNSUPPORTED Rust 187:1: generic scalar type unsupported
// pub type PFNSNMPCLEANUPEX = Option<unsafe extern "system" fn() -> u32>;

// UNSUPPORTED Rust 188:1: generic scalar type unsupported
// pub type PFNSNMPEXTENSIONCLOSE = Option<unsafe extern "system" fn()>;

// UNSUPPORTED Rust 189:1: generic scalar type unsupported
// pub type PFNSNMPEXTENSIONINIT = Option<unsafe extern "system" fn(dwuptimereference: u32, phsubagenttrapevent: *mut super::super::Foundation::HANDLE, pfirstsupportedregion: *mut AsnObjectIdentifier) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 190:1: generic scalar type unsupported
// pub type PFNSNMPEXTENSIONINITEX = Option<unsafe extern "system" fn(pnextsupportedregion: *mut AsnObjectIdentifier) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 191:1: generic scalar type unsupported
// pub type PFNSNMPEXTENSIONMONITOR = Option<unsafe extern "system" fn(pagentmgmtdata: *mut core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 192:1: generic scalar type unsupported
// pub type PFNSNMPEXTENSIONQUERY = Option<unsafe extern "system" fn(bpdutype: u8, pvarbindlist: *mut SnmpVarBindList, perrorstatus: *mut i32, perrorindex: *mut i32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 193:1: generic scalar type unsupported
// pub type PFNSNMPEXTENSIONQUERYEX = Option<unsafe extern "system" fn(nrequesttype: u32, ntransactionid: u32, pvarbindlist: *mut SnmpVarBindList, pcontextinfo: *mut AsnOctetString, perrorstatus: *mut i32, perrorindex: *mut i32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 194:1: generic scalar type unsupported
// pub type PFNSNMPEXTENSIONTRAP = Option<unsafe extern "system" fn(penterpriseoid: *mut AsnObjectIdentifier, pgenerictrapid: *mut i32, pspecifictrapid: *mut i32, ptimestamp: *mut u32, pvarbindlist: *mut SnmpVarBindList) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 195:1: generic scalar type unsupported
// pub type PFNSNMPSTARTUPEX = Option<unsafe extern "system" fn(param0: *mut u32, param1: *mut u32, param2: *mut u32, param3: *mut u32, param4: *mut u32) -> u32>;

public const val `SNMPAPI_ALLOC_ERROR`: UInt = 2u;
// UNSUPPORTED Rust 197:1: generic scalar type unsupported
// pub type SNMPAPI_CALLBACK = Option<unsafe extern "system" fn(hsession: isize, hwnd: super::super::Foundation::HWND, wmsg: u32, wparam: super::super::Foundation::WPARAM, lparam: super::super::Foundation::LPARAM, lpclientdata: *mut core::ffi::c_void) -> u32>;

public const val `SNMPAPI_CONTEXT_INVALID`: UInt = 3u;
public const val `SNMPAPI_CONTEXT_UNKNOWN`: UInt = 4u;
public const val `SNMPAPI_ENTITY_INVALID`: UInt = 5u;
public const val `SNMPAPI_ENTITY_UNKNOWN`: UInt = 6u;
public const val `SNMPAPI_ERROR`: UInt = 0u;
public const val `SNMPAPI_FAILURE`: UInt = 0u;
public const val `SNMPAPI_HWND_INVALID`: UInt = 20u;
public const val `SNMPAPI_INDEX_INVALID`: UInt = 7u;
public const val `SNMPAPI_M2M_SUPPORT`: UInt = 3u;
public const val `SNMPAPI_MESSAGE_INVALID`: UInt = 19u;
public const val `SNMPAPI_MODE_INVALID`: UInt = 16u;
public const val `SNMPAPI_NOERROR`: UInt = 1u;
public const val `SNMPAPI_NOOP`: UInt = 8u;
public const val `SNMPAPI_NOT_INITIALIZED`: UInt = 18u;
public const val `SNMPAPI_NO_SUPPORT`: UInt = 0u;
public const val `SNMPAPI_OFF`: `SNMP_STATUS` = 0u;
public const val `SNMPAPI_OID_INVALID`: UInt = 9u;
public const val `SNMPAPI_ON`: `SNMP_STATUS` = 1u;
public const val `SNMPAPI_OPERATION_INVALID`: UInt = 10u;
public const val `SNMPAPI_OTHER_ERROR`: UInt = 99u;
public const val `SNMPAPI_OUTPUT_TRUNCATED`: UInt = 11u;
public const val `SNMPAPI_PDU_INVALID`: UInt = 12u;
public const val `SNMPAPI_SESSION_INVALID`: UInt = 13u;
public const val `SNMPAPI_SIZE_INVALID`: UInt = 17u;
public const val `SNMPAPI_SUCCESS`: UInt = 1u;
public const val `SNMPAPI_SYNTAX_INVALID`: UInt = 14u;
public const val `SNMPAPI_TL_INVALID_PARAM`: UInt = 106u;
public const val `SNMPAPI_TL_IN_USE`: UInt = 107u;
public const val `SNMPAPI_TL_NOT_AVAILABLE`: UInt = 102u;
public const val `SNMPAPI_TL_NOT_INITIALIZED`: UInt = 100u;
public const val `SNMPAPI_TL_NOT_SUPPORTED`: UInt = 101u;
public const val `SNMPAPI_TL_OTHER`: UInt = 199u;
public const val `SNMPAPI_TL_PDU_TOO_BIG`: UInt = 109u;
public const val `SNMPAPI_TL_RESOURCE_ERROR`: UInt = 103u;
public const val `SNMPAPI_TL_SRC_INVALID`: UInt = 105u;
public const val `SNMPAPI_TL_TIMEOUT`: UInt = 108u;
public const val `SNMPAPI_TL_UNDELIVERABLE`: UInt = 104u;
public const val `SNMPAPI_TRANSLATED`: `SNMP_API_TRANSLATE_MODE` = 0u;
public const val `SNMPAPI_UNTRANSLATED_V1`: `SNMP_API_TRANSLATE_MODE` = 1u;
public const val `SNMPAPI_UNTRANSLATED_V2`: `SNMP_API_TRANSLATE_MODE` = 2u;
public const val `SNMPAPI_V1_SUPPORT`: UInt = 1u;
public const val `SNMPAPI_V2_SUPPORT`: UInt = 2u;
public const val `SNMPAPI_VBL_INVALID`: UInt = 15u;
public const val `SNMPLISTEN_ALL_ADDR`: UInt = 1u;
public const val `SNMPLISTEN_USEENTITY_ADDR`: UInt = 0u;
public const val `SNMP_ACCESS_NONE`: UInt = 0u;
public const val `SNMP_ACCESS_NOTIFY`: UInt = 1u;
public const val `SNMP_ACCESS_READ_CREATE`: UInt = 4u;
public const val `SNMP_ACCESS_READ_ONLY`: UInt = 2u;
public const val `SNMP_ACCESS_READ_WRITE`: UInt = 3u;
public typealias `SNMP_API_TRANSLATE_MODE` = UInt;
public const val `SNMP_AUTHAPI_INVALID_MSG_TYPE`: UInt = 31u;
public const val `SNMP_AUTHAPI_INVALID_VERSION`: UInt = 30u;
public const val `SNMP_AUTHAPI_TRIV_AUTH_FAILED`: UInt = 32u;
public const val `SNMP_BERAPI_INVALID_LENGTH`: UInt = 10u;
public const val `SNMP_BERAPI_INVALID_OBJELEM`: UInt = 14u;
public const val `SNMP_BERAPI_INVALID_TAG`: UInt = 11u;
public const val `SNMP_BERAPI_OVERFLOW`: UInt = 12u;
public const val `SNMP_BERAPI_SHORT_BUFFER`: UInt = 13u;
public typealias `SNMP_ERROR` = UInt;
public const val `SNMP_ERRORSTATUS_AUTHORIZATIONERROR`: `SNMP_ERROR_STATUS` = 16u;
public const val `SNMP_ERRORSTATUS_BADVALUE`: `SNMP_ERROR_STATUS` = 3u;
public const val `SNMP_ERRORSTATUS_COMMITFAILED`: `SNMP_ERROR_STATUS` = 14u;
public const val `SNMP_ERRORSTATUS_GENERR`: `SNMP_ERROR_STATUS` = 5u;
public const val `SNMP_ERRORSTATUS_INCONSISTENTNAME`: `SNMP_ERROR_STATUS` = 18u;
public const val `SNMP_ERRORSTATUS_INCONSISTENTVALUE`: `SNMP_ERROR_STATUS` = 12u;
public const val `SNMP_ERRORSTATUS_NOACCESS`: `SNMP_ERROR_STATUS` = 6u;
public const val `SNMP_ERRORSTATUS_NOCREATION`: `SNMP_ERROR_STATUS` = 11u;
public const val `SNMP_ERRORSTATUS_NOERROR`: `SNMP_ERROR_STATUS` = 0u;
public const val `SNMP_ERRORSTATUS_NOSUCHNAME`: `SNMP_ERROR_STATUS` = 2u;
public const val `SNMP_ERRORSTATUS_NOTWRITABLE`: `SNMP_ERROR_STATUS` = 17u;
public const val `SNMP_ERRORSTATUS_READONLY`: `SNMP_ERROR_STATUS` = 4u;
public const val `SNMP_ERRORSTATUS_RESOURCEUNAVAILABLE`: `SNMP_ERROR_STATUS` = 13u;
public const val `SNMP_ERRORSTATUS_TOOBIG`: `SNMP_ERROR_STATUS` = 1u;
public const val `SNMP_ERRORSTATUS_UNDOFAILED`: `SNMP_ERROR_STATUS` = 15u;
public const val `SNMP_ERRORSTATUS_WRONGENCODING`: `SNMP_ERROR_STATUS` = 9u;
public const val `SNMP_ERRORSTATUS_WRONGLENGTH`: `SNMP_ERROR_STATUS` = 8u;
public const val `SNMP_ERRORSTATUS_WRONGTYPE`: `SNMP_ERROR_STATUS` = 7u;
public const val `SNMP_ERRORSTATUS_WRONGVALUE`: `SNMP_ERROR_STATUS` = 10u;
public const val `SNMP_ERROR_AUTHORIZATIONERROR`: `SNMP_ERROR` = 16u;
public const val `SNMP_ERROR_BADVALUE`: `SNMP_ERROR` = 3u;
public const val `SNMP_ERROR_COMMITFAILED`: `SNMP_ERROR` = 14u;
public const val `SNMP_ERROR_GENERR`: `SNMP_ERROR` = 5u;
public const val `SNMP_ERROR_INCONSISTENTNAME`: `SNMP_ERROR` = 18u;
public const val `SNMP_ERROR_INCONSISTENTVALUE`: `SNMP_ERROR` = 12u;
public const val `SNMP_ERROR_NOACCESS`: `SNMP_ERROR` = 6u;
public const val `SNMP_ERROR_NOCREATION`: `SNMP_ERROR` = 11u;
public const val `SNMP_ERROR_NOERROR`: `SNMP_ERROR` = 0u;
public const val `SNMP_ERROR_NOSUCHNAME`: `SNMP_ERROR` = 2u;
public const val `SNMP_ERROR_NOTWRITABLE`: `SNMP_ERROR` = 17u;
public const val `SNMP_ERROR_READONLY`: `SNMP_ERROR` = 4u;
public const val `SNMP_ERROR_RESOURCEUNAVAILABLE`: `SNMP_ERROR` = 13u;
public typealias `SNMP_ERROR_STATUS` = UInt;
public const val `SNMP_ERROR_TOOBIG`: `SNMP_ERROR` = 1u;
public const val `SNMP_ERROR_UNDOFAILED`: `SNMP_ERROR` = 15u;
public const val `SNMP_ERROR_WRONGENCODING`: `SNMP_ERROR` = 9u;
public const val `SNMP_ERROR_WRONGLENGTH`: `SNMP_ERROR` = 8u;
public const val `SNMP_ERROR_WRONGTYPE`: `SNMP_ERROR` = 7u;
public const val `SNMP_ERROR_WRONGVALUE`: `SNMP_ERROR` = 10u;
public const val `SNMP_EXTENSION_GET`: `SNMP_EXTENSION_REQUEST_TYPE` = 160u;
public const val `SNMP_EXTENSION_GET_NEXT`: `SNMP_EXTENSION_REQUEST_TYPE` = 161u;
public typealias `SNMP_EXTENSION_REQUEST_TYPE` = UInt;
public const val `SNMP_EXTENSION_SET_CLEANUP`: `SNMP_EXTENSION_REQUEST_TYPE` = 226u;
public const val `SNMP_EXTENSION_SET_COMMIT`: `SNMP_EXTENSION_REQUEST_TYPE` = 163u;
public const val `SNMP_EXTENSION_SET_TEST`: `SNMP_EXTENSION_REQUEST_TYPE` = 224u;
public const val `SNMP_EXTENSION_SET_UNDO`: `SNMP_EXTENSION_REQUEST_TYPE` = 225u;
public typealias `SNMP_GENERICTRAP` = UInt;
public const val `SNMP_GENERICTRAP_AUTHFAILURE`: `SNMP_GENERICTRAP` = 4u;
public const val `SNMP_GENERICTRAP_COLDSTART`: `SNMP_GENERICTRAP` = 0u;
public const val `SNMP_GENERICTRAP_EGPNEIGHLOSS`: `SNMP_GENERICTRAP` = 5u;
public const val `SNMP_GENERICTRAP_ENTERSPECIFIC`: `SNMP_GENERICTRAP` = 6u;
public const val `SNMP_GENERICTRAP_LINKDOWN`: `SNMP_GENERICTRAP` = 2u;
public const val `SNMP_GENERICTRAP_LINKUP`: `SNMP_GENERICTRAP` = 3u;
public const val `SNMP_GENERICTRAP_WARMSTART`: `SNMP_GENERICTRAP` = 1u;
public typealias `SNMP_LOG` = Int;
public const val `SNMP_LOG_ERROR`: `SNMP_LOG` = 2;
public const val `SNMP_LOG_FATAL`: `SNMP_LOG` = 1;
public const val `SNMP_LOG_SILENT`: `SNMP_LOG` = 0;
public const val `SNMP_LOG_TRACE`: `SNMP_LOG` = 4;
public const val `SNMP_LOG_VERBOSE`: `SNMP_LOG` = 5;
public const val `SNMP_LOG_WARNING`: `SNMP_LOG` = 3;
public const val `SNMP_MAX_OID_LEN`: UInt = 128u;
public const val `SNMP_MEM_ALLOC_ERROR`: UInt = 1u;
public const val `SNMP_MGMTAPI_AGAIN`: UInt = 45u;
public const val `SNMP_MGMTAPI_INVALID_BUFFER`: UInt = 48u;
public const val `SNMP_MGMTAPI_INVALID_CTL`: UInt = 46u;
public const val `SNMP_MGMTAPI_INVALID_SESSION`: UInt = 47u;
public const val `SNMP_MGMTAPI_NOTRAPS`: UInt = 44u;
public const val `SNMP_MGMTAPI_SELECT_FDERRORS`: UInt = 41u;
public const val `SNMP_MGMTAPI_TIMEOUT`: UInt = 40u;
public const val `SNMP_MGMTAPI_TRAP_DUPINIT`: UInt = 43u;
public const val `SNMP_MGMTAPI_TRAP_ERRORS`: UInt = 42u;
public typealias `SNMP_OUTPUT_LOG_TYPE` = UInt;
public const val `SNMP_OUTPUT_TO_CONSOLE`: `SNMP_OUTPUT_LOG_TYPE` = 1u;
public const val `SNMP_OUTPUT_TO_DEBUGGER`: `SNMP_OUTPUT_LOG_TYPE` = 8u;
public const val `SNMP_OUTPUT_TO_EVENTLOG`: UInt = 4u;
public const val `SNMP_OUTPUT_TO_LOGFILE`: `SNMP_OUTPUT_LOG_TYPE` = 2u;
public const val `SNMP_PDUAPI_INVALID_ES`: UInt = 21u;
public const val `SNMP_PDUAPI_INVALID_GT`: UInt = 22u;
public const val `SNMP_PDUAPI_UNRECOGNIZED_PDU`: UInt = 20u;
public const val `SNMP_PDU_GET`: `SNMP_PDU_TYPE` = 160u;
public const val `SNMP_PDU_GETBULK`: `SNMP_PDU_TYPE` = 165u;
public const val `SNMP_PDU_GETNEXT`: `SNMP_PDU_TYPE` = 161u;
public const val `SNMP_PDU_RESPONSE`: `SNMP_PDU_TYPE` = 162u;
public const val `SNMP_PDU_SET`: `SNMP_PDU_TYPE` = 163u;
public const val `SNMP_PDU_TRAP`: `SNMP_PDU_TYPE` = 167u;
public typealias `SNMP_PDU_TYPE` = UInt;
public typealias `SNMP_STATUS` = UInt;
public const val `SNMP_TRAP_AUTHFAIL`: UInt = 4u;
public const val `SNMP_TRAP_COLDSTART`: UInt = 0u;
public const val `SNMP_TRAP_EGPNEIGHBORLOSS`: UInt = 5u;
public const val `SNMP_TRAP_ENTERPRISESPECIFIC`: UInt = 6u;
public const val `SNMP_TRAP_LINKDOWN`: UInt = 2u;
public const val `SNMP_TRAP_LINKUP`: UInt = 3u;
public const val `SNMP_TRAP_WARMSTART`: UInt = 1u;
// UNSUPPORTED Rust 353:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[derive(Clone, Copy)]
// pub struct SnmpVarBind {
//     pub name: AsnObjectIdentifier,
//     pub value: AsnAny,
// }

// UNSUPPORTED Rust 359:1: declaration Impl has no candidate rule
// impl Default for SnmpVarBind {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 364:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct SnmpVarBindList {
//     pub list: *mut SnmpVarBind,
//     pub len: u32,
// }

// UNSUPPORTED Rust 371:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for SnmpVarBindList {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 377:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct SnmpVarBindList {
//     pub list: *mut SnmpVarBind,
//     pub len: u32,
// }

// UNSUPPORTED Rust 384:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for SnmpVarBindList {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 390:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct smiCNTR64 {
//     pub hipart: u32,
//     pub lopart: u32,
// }

// UNSUPPORTED Rust 396:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct smiOCTETS {
//     pub len: u32,
//     pub ptr: *mut u8,
// }

// UNSUPPORTED Rust 402:1: declaration Impl has no candidate rule
// impl Default for smiOCTETS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 407:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct smiOID {
//     pub len: u32,
//     pub ptr: *mut u32,
// }

// UNSUPPORTED Rust 413:1: declaration Impl has no candidate rule
// impl Default for smiOID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 418:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct smiVALUE {
//     pub syntax: u32,
//     pub value: smiVALUE_0,
// }

// UNSUPPORTED Rust 424:1: declaration Impl has no candidate rule
// impl Default for smiVALUE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 429:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union smiVALUE_0 {
//     pub sNumber: i32,
//     pub uNumber: u32,
//     pub hNumber: smiCNTR64,
//     pub string: smiOCTETS,
//     pub oid: smiOID,
//     pub empty: u8,
// }

// UNSUPPORTED Rust 439:1: declaration Impl has no candidate rule
// impl Default for smiVALUE_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 444:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct smiVENDORINFO {
//     pub vendorName: [i8; 64],
//     pub vendorContact: [i8; 64],
//     pub vendorVersionId: [i8; 32],
//     pub vendorVersionDate: [i8; 32],
//     pub vendorEnterprise: u32,
// }

// UNSUPPORTED Rust 453:1: declaration Impl has no candidate rule
// impl Default for smiVENDORINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

