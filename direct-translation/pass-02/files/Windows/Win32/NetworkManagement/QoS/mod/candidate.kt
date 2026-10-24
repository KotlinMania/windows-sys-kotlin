// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// windows_link::link!("qwave.dll" "system" fn QOSAddSocketToFlow(qoshandle : super::super::Foundation:: HANDLE, socket : super::super::Networking::WinSock:: SOCKET, destaddr : *const super::super::Networking::WinSock:: SOCKADDR, traffictype : QOS_TRAFFIC_TYPE, flags : u32, flowid : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("qwave.dll" "system" fn QOSCancel(qoshandle : super::super::Foundation:: HANDLE, overlapped : *const super::super::System::IO:: OVERLAPPED) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("qwave.dll" "system" fn QOSCloseHandle(qoshandle : super::super::Foundation:: HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("qwave.dll" "system" fn QOSCreateHandle(version : *const QOS_VERSION, qoshandle : *mut super::super::Foundation:: HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("qwave.dll" "system" fn QOSEnumerateFlows(qoshandle : super::super::Foundation:: HANDLE, size : *mut u32, buffer : *mut core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("qwave.dll" "system" fn QOSNotifyFlow(qoshandle : super::super::Foundation:: HANDLE, flowid : u32, operation : QOS_NOTIFY_FLOW, size : *mut u32, buffer : *mut core::ffi::c_void, flags : u32, overlapped : *mut super::super::System::IO:: OVERLAPPED) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("qwave.dll" "system" fn QOSQueryFlow(qoshandle : super::super::Foundation:: HANDLE, flowid : u32, operation : QOS_QUERY_FLOW, size : *mut u32, buffer : *mut core::ffi::c_void, flags : u32, overlapped : *mut super::super::System::IO:: OVERLAPPED) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// windows_link::link!("qwave.dll" "system" fn QOSRemoveSocketFromFlow(qoshandle : super::super::Foundation:: HANDLE, socket : super::super::Networking::WinSock:: SOCKET, flowid : u32, flags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("qwave.dll" "system" fn QOSSetFlow(qoshandle : super::super::Foundation:: HANDLE, flowid : u32, operation : QOS_SET_FLOW, size : u32, buffer : *const core::ffi::c_void, flags : u32, overlapped : *mut super::super::System::IO:: OVERLAPPED) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// windows_link::link!("qwave.dll" "system" fn QOSStartTrackingClient(qoshandle : super::super::Foundation:: HANDLE, destaddr : *const super::super::Networking::WinSock:: SOCKADDR, flags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// windows_link::link!("qwave.dll" "system" fn QOSStopTrackingClient(qoshandle : super::super::Foundation:: HANDLE, destaddr : *const super::super::Networking::WinSock:: SOCKADDR, flags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// windows_link::link!("traffic.dll" "system" fn TcAddFilter(flowhandle : super::super::Foundation:: HANDLE, pgenericfilter : *const TC_GEN_FILTER, pfilterhandle : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// windows_link::link!("traffic.dll" "system" fn TcAddFlow(ifchandle : super::super::Foundation:: HANDLE, clflowctx : super::super::Foundation:: HANDLE, flags : u32, pgenericflow : *const TC_GEN_FLOW, pflowhandle : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// windows_link::link!("traffic.dll" "system" fn TcCloseInterface(ifchandle : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// windows_link::link!("traffic.dll" "system" fn TcDeleteFilter(filterhandle : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// windows_link::link!("traffic.dll" "system" fn TcDeleteFlow(flowhandle : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// windows_link::link!("traffic.dll" "system" fn TcDeregisterClient(clienthandle : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// windows_link::link!("traffic.dll" "system" fn TcEnumerateFlows(ifchandle : super::super::Foundation:: HANDLE, penumhandle : *mut super::super::Foundation:: HANDLE, pflowcount : *mut u32, pbufsize : *mut u32, buffer : *mut ENUMERATION_BUFFER) -> u32);

// UNSUPPORTED Rust 29:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// windows_link::link!("traffic.dll" "system" fn TcEnumerateInterfaces(clienthandle : super::super::Foundation:: HANDLE, pbuffersize : *mut u32, interfacebuffer : *mut TC_IFC_DESCRIPTOR) -> u32);

// UNSUPPORTED Rust 31:1: declaration Macro has no candidate rule
// windows_link::link!("traffic.dll" "system" fn TcGetFlowNameA(flowhandle : super::super::Foundation:: HANDLE, strsize : u32, pflowname : windows_sys::core::PSTR) -> u32);

// UNSUPPORTED Rust 32:1: declaration Macro has no candidate rule
// windows_link::link!("traffic.dll" "system" fn TcGetFlowNameW(flowhandle : super::super::Foundation:: HANDLE, strsize : u32, pflowname : windows_sys::core::PWSTR) -> u32);

// UNSUPPORTED Rust 33:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// windows_link::link!("traffic.dll" "system" fn TcModifyFlow(flowhandle : super::super::Foundation:: HANDLE, pgenericflow : *const TC_GEN_FLOW) -> u32);

// UNSUPPORTED Rust 35:1: declaration Macro has no candidate rule
// windows_link::link!("traffic.dll" "system" fn TcOpenInterfaceA(pinterfacename : windows_sys::core::PCSTR, clienthandle : super::super::Foundation:: HANDLE, clifcctx : super::super::Foundation:: HANDLE, pifchandle : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 36:1: declaration Macro has no candidate rule
// windows_link::link!("traffic.dll" "system" fn TcOpenInterfaceW(pinterfacename : windows_sys::core::PCWSTR, clienthandle : super::super::Foundation:: HANDLE, clifcctx : super::super::Foundation:: HANDLE, pifchandle : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 37:1: declaration Macro has no candidate rule
// windows_link::link!("traffic.dll" "system" fn TcQueryFlowA(pflowname : windows_sys::core::PCSTR, pguidparam : *const windows_sys::core::GUID, pbuffersize : *mut u32, buffer : *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 38:1: declaration Macro has no candidate rule
// windows_link::link!("traffic.dll" "system" fn TcQueryFlowW(pflowname : windows_sys::core::PCWSTR, pguidparam : *const windows_sys::core::GUID, pbuffersize : *mut u32, buffer : *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 39:1: declaration Macro has no candidate rule
// windows_link::link!("traffic.dll" "system" fn TcQueryInterface(ifchandle : super::super::Foundation:: HANDLE, pguidparam : *const windows_sys::core::GUID, notifychange : bool, pbuffersize : *mut u32, buffer : *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 40:1: declaration Macro has no candidate rule
// windows_link::link!("traffic.dll" "system" fn TcRegisterClient(tciversion : u32, clregctx : super::super::Foundation:: HANDLE, clienthandlerlist : *const TCI_CLIENT_FUNC_LIST, pclienthandle : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 41:1: declaration Macro has no candidate rule
// windows_link::link!("traffic.dll" "system" fn TcSetFlowA(pflowname : windows_sys::core::PCSTR, pguidparam : *const windows_sys::core::GUID, buffersize : u32, buffer : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 42:1: declaration Macro has no candidate rule
// windows_link::link!("traffic.dll" "system" fn TcSetFlowW(pflowname : windows_sys::core::PCWSTR, pguidparam : *const windows_sys::core::GUID, buffersize : u32, buffer : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 43:1: declaration Macro has no candidate rule
// windows_link::link!("traffic.dll" "system" fn TcSetInterface(ifchandle : super::super::Foundation:: HANDLE, pguidparam : *const windows_sys::core::GUID, buffersize : u32, buffer : *const core::ffi::c_void) -> u32);

public const val `ABLE_TO_RECV_RSVP`: UInt = 50002u;
// UNSUPPORTED Rust 45:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy, Default)]
// pub struct ADDRESS_LIST_DESCRIPTOR {
//     pub MediaType: u32,
//     pub AddressList: super::Ndis::NETWORK_ADDRESS_LIST,
// }

public const val `ADM_CTRL_FAILED`: UInt = 3u;
// UNSUPPORTED Rust 53:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ADSPEC {
//     pub adspec_header: RsvpObjHdr,
//     pub adspec_body: IS_ADSPEC_BODY,
// }

public const val `AD_FLAG_BREAK_BIT`: UInt = 1u;
// UNSUPPORTED Rust 60:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct AD_GENERAL_PARAMS {
//     pub IntServAwareHopCount: u32,
//     pub PathBandwidthEstimate: u32,
//     pub MinimumLatency: u32,
//     pub PathMTU: u32,
//     pub Flags: u32,
// }

// UNSUPPORTED Rust 69:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct AD_GUARANTEED {
//     pub CTotal: u32,
//     pub DTotal: u32,
//     pub CSum: u32,
//     pub DSum: u32,
// }

public const val `ALLOWED_TO_SEND_DATA`: UInt = 50001u;
public const val `ANY_DEST_ADDR`: UInt = 4294967295u;
// UNSUPPORTED Rust 79:1: generic scalar type unsupported
// pub type CBADMITRESULT = Option<unsafe extern "system" fn(lpmhandle: LPM_HANDLE, requesthandle: RHANDLE, ulpcmactionflags: u32, lpmerror: i32, policydecisionscount: i32, ppolicydecisions: *mut POLICY_DECISION) -> *mut u32>;

// UNSUPPORTED Rust 80:1: generic scalar type unsupported
// pub type CBGETRSVPOBJECTS = Option<unsafe extern "system" fn(lpmhandle: LPM_HANDLE, requesthandle: RHANDLE, lpmerror: i32, rsvpobjectscount: i32, pprsvpobjects: *mut *mut RsvpObjHdr) -> *mut u32>;

public const val `CONTROLLED_DELAY_SERV`: UInt = 4u;
public const val `CONTROLLED_LOAD_SERV`: UInt = 5u;
// UNSUPPORTED Rust 83:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CONTROL_SERVICE {
//     pub Length: u32,
//     pub Service: u32,
//     pub Overrides: AD_GENERAL_PARAMS,
//     pub Anonymous: CONTROL_SERVICE_0,
// }

// UNSUPPORTED Rust 91:1: declaration Impl has no candidate rule
// impl Default for CONTROL_SERVICE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 96:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union CONTROL_SERVICE_0 {
//     pub Guaranteed: AD_GUARANTEED,
//     pub ParamBuffer: [PARAM_BUFFER; 1],
// }

// UNSUPPORTED Rust 102:1: declaration Impl has no candidate rule
// impl Default for CONTROL_SERVICE_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CREDENTIAL_SUB_TYPE_ASCII_ID`: UInt = 1u;
public const val `CREDENTIAL_SUB_TYPE_KERBEROS_TKT`: UInt = 3u;
public const val `CREDENTIAL_SUB_TYPE_PGP_CERT`: UInt = 5u;
public const val `CREDENTIAL_SUB_TYPE_UNICODE_ID`: UInt = 2u;
public const val `CREDENTIAL_SUB_TYPE_X509_V3_CERT`: UInt = 4u;
public const val `CURRENT_TCI_VERSION`: UInt = 2u;
// UNSUPPORTED Rust 113:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CtrlLoadFlowspec {
//     pub CL_spec_serv_hdr: IntServServiceHdr,
//     pub CL_spec_parm_hdr: IntServParmHdr,
//     pub CL_spec_parms: GenTspecParms,
// }

// UNSUPPORTED Rust 120:1: non-scalar type Ptr unsupported
// pub const DD_TCP_DEVICE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("\\Device\\Tcp");

public const val `DUP_RESULTS`: UInt = 4u;
public const val `END_TO_END_QOSABILITY`: UInt = 50006u;
// UNSUPPORTED Rust 123:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct ENUMERATION_BUFFER {
//     pub Length: u32,
//     pub OwnerProcessId: u32,
//     pub FlowNameLength: u16,
//     pub FlowName: [u16; 256],
//     pub pFlow: *mut TC_GEN_FLOW,
//     pub NumberOfFilters: u32,
//     pub GenericFilter: [TC_GEN_FILTER; 1],
// }

// UNSUPPORTED Rust 135:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for ENUMERATION_BUFFER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ERROR_ADDRESS_TYPE_NOT_SUPPORTED`: UInt = 7511u;
public const val `ERROR_DS_MAPPING_EXISTS`: UInt = 7518u;
public const val `ERROR_DUPLICATE_FILTER`: UInt = 7509u;
public const val `ERROR_FILTER_CONFLICT`: UInt = 7510u;
public const val `ERROR_INCOMPATABLE_QOS`: UInt = 7513u;
public const val `ERROR_INCOMPATIBLE_TCI_VERSION`: UInt = 7501u;
public const val `ERROR_INVALID_ADDRESS_TYPE`: UInt = 7508u;
public const val `ERROR_INVALID_DIFFSERV_FLOW`: UInt = 7517u;
public const val `ERROR_INVALID_DS_CLASS`: UInt = 7520u;
public const val `ERROR_INVALID_FLOW_MODE`: UInt = 7516u;
public const val `ERROR_INVALID_PEAK_RATE`: UInt = 7504u;
public const val `ERROR_INVALID_QOS_PRIORITY`: UInt = 7506u;
public const val `ERROR_INVALID_SD_MODE`: UInt = 7505u;
public const val `ERROR_INVALID_SERVICE_TYPE`: UInt = 7502u;
public const val `ERROR_INVALID_SHAPE_RATE`: UInt = 7519u;
public const val `ERROR_INVALID_TOKEN_RATE`: UInt = 7503u;
public const val `ERROR_INVALID_TRAFFIC_CLASS`: UInt = 7507u;
public const val `ERROR_NO_MORE_INFO`: UInt = 1u;
// UNSUPPORTED Rust 159:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct ERROR_SPEC {
//     pub errs_header: RsvpObjHdr,
//     pub errs_u: ERROR_SPEC_0,
// }

// UNSUPPORTED Rust 166:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for ERROR_SPEC {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 172:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub union ERROR_SPEC_0 {
//     pub errs_ipv4: Error_Spec_IPv4,
// }

// UNSUPPORTED Rust 178:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for ERROR_SPEC_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ERROR_SPECF_InPlace`: UInt = 1u;
public const val `ERROR_SPECF_NotGuilty`: UInt = 2u;
public const val `ERROR_TC_NOT_SUPPORTED`: UInt = 7514u;
public const val `ERROR_TC_OBJECT_LENGTH_INVALID`: UInt = 7515u;
public const val `ERROR_TC_SUPPORTED_OBJECTS_EXIST`: UInt = 7512u;
public const val `ERROR_TOO_MANY_CLIENTS`: UInt = 7521u;
public const val `ERR_FORWARD_OK`: UInt = 32768u;
public const val `ERR_Usage_globl`: UInt = 0u;
public const val `ERR_Usage_local`: UInt = 16u;
public const val `ERR_Usage_serv`: UInt = 17u;
public const val `ERR_global_mask`: UInt = 4095u;
public const val `EXPIRED_CREDENTIAL`: UInt = 4u;
// UNSUPPORTED Rust 196:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct Error_Spec_IPv4 {
//     pub errs_errnode: super::super::Networking::WinSock::IN_ADDR,
//     pub errs_flags: u8,
//     pub errs_code: u8,
//     pub errs_value: u16,
// }

// UNSUPPORTED Rust 205:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for Error_Spec_IPv4 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FILTERSPECV4`: `FilterType` = 1;
public const val `FILTERSPECV4_GPI`: `FilterType` = 4;
public const val `FILTERSPECV6`: `FilterType` = 2;
public const val `FILTERSPECV6_FLOW`: `FilterType` = 3;
public const val `FILTERSPECV6_GPI`: `FilterType` = 5;
public const val `FILTERSPEC_END`: `FilterType` = 6;
// UNSUPPORTED Rust 217:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct FILTER_SPEC {
//     pub filt_header: RsvpObjHdr,
//     pub filt_u: FILTER_SPEC_0,
// }

// UNSUPPORTED Rust 224:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for FILTER_SPEC {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 230:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub union FILTER_SPEC_0 {
//     pub filt_ipv4: Filter_Spec_IPv4,
//     pub filt_ipv4gpi: Filter_Spec_IPv4GPI,
// }

// UNSUPPORTED Rust 237:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for FILTER_SPEC_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 243:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct FLOWDESCRIPTOR {
//     pub FlowSpec: super::super::Networking::WinSock::FLOWSPEC,
//     pub NumFilters: u32,
//     pub FilterList: *mut RSVP_FILTERSPEC,
// }

// UNSUPPORTED Rust 251:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for FLOWDESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 257:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct FLOW_DESC {
//     pub u1: FLOW_DESC_0,
//     pub u2: FLOW_DESC_1,
// }

// UNSUPPORTED Rust 264:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for FLOW_DESC {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 270:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub union FLOW_DESC_0 {
//     pub stspec: *mut SENDER_TSPEC,
//     pub isflow: *mut IS_FLOWSPEC,
// }

// UNSUPPORTED Rust 277:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for FLOW_DESC_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 283:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub union FLOW_DESC_1 {
//     pub stemp: *mut FILTER_SPEC,
//     pub fspec: *mut FILTER_SPEC,
// }

// UNSUPPORTED Rust 290:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for FLOW_DESC_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FLOW_DURATION`: UInt = 5u;
public const val `FORCE_IMMEDIATE_REFRESH`: UInt = 1u;
public const val `FSCTL_TCP_BASE`: UInt = 18u;
public const val `FVEB_UNLOCK_FLAG_AUK_OSFVEINFO`: UInt = 512u;
public const val `FVEB_UNLOCK_FLAG_CACHED`: UInt = 1u;
public const val `FVEB_UNLOCK_FLAG_EXTERNAL`: UInt = 32u;
public const val `FVEB_UNLOCK_FLAG_MEDIA`: UInt = 2u;
public const val `FVEB_UNLOCK_FLAG_NBP`: UInt = 256u;
public const val `FVEB_UNLOCK_FLAG_NONE`: UInt = 0u;
public const val `FVEB_UNLOCK_FLAG_PASSPHRASE`: UInt = 128u;
public const val `FVEB_UNLOCK_FLAG_PIN`: UInt = 16u;
public const val `FVEB_UNLOCK_FLAG_RECOVERY`: UInt = 64u;
public const val `FVEB_UNLOCK_FLAG_TPM`: UInt = 4u;
public typealias `FilterType` = Int;
// UNSUPPORTED Rust 310:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct Filter_Spec_IPv4 {
//     pub filt_ipaddr: super::super::Networking::WinSock::IN_ADDR,
//     pub filt_unused: u16,
//     pub filt_port: u16,
// }

// UNSUPPORTED Rust 318:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for Filter_Spec_IPv4 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 324:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct Filter_Spec_IPv4GPI {
//     pub filt_ipaddr: super::super::Networking::WinSock::IN_ADDR,
//     pub filt_gpi: u32,
// }

// UNSUPPORTED Rust 331:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for Filter_Spec_IPv4GPI {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `GENERAL_INFO`: UInt = 1u;
public const val `GQOS_API`: UInt = 56400u;
public const val `GQOS_ERRORCODE_UNKNOWN`: UInt = 4294967295u;
public const val `GQOS_ERRORVALUE_UNKNOWN`: UInt = 4294967295u;
public const val `GQOS_KERNEL_TC`: UInt = 56700u;
public const val `GQOS_KERNEL_TC_SYS`: UInt = 56500u;
public const val `GQOS_NET_ADMISSION`: UInt = 56100u;
public const val `GQOS_NET_POLICY`: UInt = 56200u;
public const val `GQOS_NO_ERRORCODE`: UInt = 0u;
public const val `GQOS_NO_ERRORVALUE`: UInt = 0u;
public const val `GQOS_RSVP`: UInt = 56300u;
public const val `GQOS_RSVP_SYS`: UInt = 56600u;
public const val `GUARANTEED_SERV`: UInt = 2u;
public const val `GUAR_ADSPARM_C`: Int = 131;
public const val `GUAR_ADSPARM_Csum`: Int = 135;
public const val `GUAR_ADSPARM_Ctot`: Int = 133;
public const val `GUAR_ADSPARM_D`: Int = 132;
public const val `GUAR_ADSPARM_Dsum`: Int = 136;
public const val `GUAR_ADSPARM_Dtot`: Int = 134;
// UNSUPPORTED Rust 356:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_QOS_BESTEFFORT_BANDWIDTH: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xed885290_40ec_11d1_2c91_00aa00574915);

// UNSUPPORTED Rust 357:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_QOS_ENABLE_AVG_STATS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbafb6d11_27c4_4801_a46f_ef8080c188c8);

// UNSUPPORTED Rust 358:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_QOS_ENABLE_WINDOW_ADJUSTMENT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xaa966725_d3e9_4c55_b335_2a00279a1e64);

// UNSUPPORTED Rust 359:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_QOS_FLOW_8021P_CONFORMING: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x08c1e013_fcd2_11d2_be1e_00a0c99ee63b);

// UNSUPPORTED Rust 360:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_QOS_FLOW_8021P_NONCONFORMING: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x09023f91_fcd2_11d2_be1e_00a0c99ee63b);

// UNSUPPORTED Rust 361:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_QOS_FLOW_COUNT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1147f880_40ed_11d1_2c91_00aa00574915);

// UNSUPPORTED Rust 362:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_QOS_FLOW_IP_CONFORMING: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x07f99a8b_fcd2_11d2_be1e_00a0c99ee63b);

// UNSUPPORTED Rust 363:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_QOS_FLOW_IP_NONCONFORMING: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x087a5987_fcd2_11d2_be1e_00a0c99ee63b);

// UNSUPPORTED Rust 364:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_QOS_FLOW_MODE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5c82290a_515a_11d2_8e58_00c04fc9bfcb);

// UNSUPPORTED Rust 365:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_QOS_ISSLOW_FLOW: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xabf273a4_ee07_11d2_be1b_00a0c99ee63b);

// UNSUPPORTED Rust 366:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_QOS_LATENCY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfc408ef0_40ec_11d1_2c91_00aa00574915);

// UNSUPPORTED Rust 367:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_QOS_MAX_OUTSTANDING_SENDS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x161ffa86_6120_11d1_2c91_00aa00574915);

// UNSUPPORTED Rust 368:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_QOS_NON_BESTEFFORT_LIMIT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x185c44e0_40ed_11d1_2c91_00aa00574915);

// UNSUPPORTED Rust 369:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_QOS_REMAINING_BANDWIDTH: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc4c51720_40ec_11d1_2c91_00aa00574915);

// UNSUPPORTED Rust 370:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_QOS_STATISTICS_BUFFER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbb2c0980_e900_11d1_b07e_0080c71382bf);

// UNSUPPORTED Rust 371:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_QOS_TIMER_RESOLUTION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xba10cc88_f13e_11d2_be1b_00a0c99ee63b);

// UNSUPPORTED Rust 372:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct Gads_parms_t {
//     pub Gads_serv_hdr: IntServServiceHdr,
//     pub Gads_Ctot_hdr: IntServParmHdr,
//     pub Gads_Ctot: u32,
//     pub Gads_Dtot_hdr: IntServParmHdr,
//     pub Gads_Dtot: u32,
//     pub Gads_Csum_hdr: IntServParmHdr,
//     pub Gads_Csum: u32,
//     pub Gads_Dsum_hdr: IntServParmHdr,
//     pub Gads_Dsum: u32,
// }

// UNSUPPORTED Rust 385:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct GenAdspecParams {
//     pub gen_parm_hdr: IntServServiceHdr,
//     pub gen_parm_hopcnt_hdr: IntServParmHdr,
//     pub gen_parm_hopcnt: u32,
//     pub gen_parm_pathbw_hdr: IntServParmHdr,
//     pub gen_parm_path_bw: f32,
//     pub gen_parm_minlat_hdr: IntServParmHdr,
//     pub gen_parm_min_latency: u32,
//     pub gen_parm_compmtu_hdr: IntServParmHdr,
//     pub gen_parm_composed_MTU: u32,
// }

// UNSUPPORTED Rust 398:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct GenTspec {
//     pub gen_Tspec_serv_hdr: IntServServiceHdr,
//     pub gen_Tspec_parm_hdr: IntServParmHdr,
//     pub gen_Tspec_parms: GenTspecParms,
// }

// UNSUPPORTED Rust 405:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct GenTspecParms {
//     pub TB_Tspec_r: f32,
//     pub TB_Tspec_b: f32,
//     pub TB_Tspec_p: f32,
//     pub TB_Tspec_m: u32,
//     pub TB_Tspec_M: u32,
// }

// UNSUPPORTED Rust 414:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct GuarFlowSpec {
//     pub Guar_serv_hdr: IntServServiceHdr,
//     pub Guar_Tspec_hdr: IntServParmHdr,
//     pub Guar_Tspec_parms: GenTspecParms,
//     pub Guar_Rspec_hdr: IntServParmHdr,
//     pub Guar_Rspec: GuarRspec,
// }

// UNSUPPORTED Rust 423:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct GuarRspec {
//     pub Guar_R: f32,
//     pub Guar_S: u32,
// }

public const val `HIGHLY_DELAY_SENSITIVE`: UInt = 4294967294u;
// UNSUPPORTED Rust 430:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct HSP_UPGRADE_IMAGEDATA {
//     pub hashAlgID: u16,
//     pub digestSize: u16,
//     pub digest: [u8; 64],
//     pub fileName: [u16; 64],
// }

// UNSUPPORTED Rust 438:1: declaration Impl has no candidate rule
// impl Default for HSP_UPGRADE_IMAGEDATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IDENTITY_CHANGED`: UInt = 5u;
// UNSUPPORTED Rust 444:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IDPE_ATTR {
//     pub PeAttribLength: u16,
//     pub PeAttribType: u8,
//     pub PeAttribSubType: u8,
//     pub PeAttribValue: [u8; 4],
// }

// UNSUPPORTED Rust 452:1: declaration Impl has no candidate rule
// impl Default for IDPE_ATTR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 457:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ID_ERROR_OBJECT {
//     pub usIdErrLength: u16,
//     pub ucAType: u8,
//     pub ucSubType: u8,
//     pub usReserved: u16,
//     pub usIdErrorValue: u16,
//     pub ucIdErrData: [u8; 4],
// }

// UNSUPPORTED Rust 467:1: declaration Impl has no candidate rule
// impl Default for ID_ERROR_OBJECT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IF_MIB_STATS_ID`: UInt = 1u;
public const val `INFO_NOT_AVAILABLE`: UInt = 4294967295u;
public const val `INSUFFICIENT_PRIVILEGES`: UInt = 3u;
public const val `INTSERV_VERSION0`: UInt = 0u;
public const val `INTSERV_VERS_MASK`: UInt = 240u;
public const val `INV_LPM_HANDLE`: UInt = 1u;
public const val `INV_REQ_HANDLE`: UInt = 3u;
public const val `INV_RESULTS`: UInt = 5u;
// UNSUPPORTED Rust 480:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IN_ADDR_IPV4 {
//     pub Addr: u32,
//     pub AddrBytes: [u8; 4],
// }

// UNSUPPORTED Rust 486:1: declaration Impl has no candidate rule
// impl Default for IN_ADDR_IPV4 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 491:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IN_ADDR_IPV6 {
//     pub Addr: [u8; 16],
// }

// UNSUPPORTED Rust 496:1: declaration Impl has no candidate rule
// impl Default for IN_ADDR_IPV6 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 501:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IPX_PATTERN {
//     pub Src: IPX_PATTERN_0,
//     pub Dest: IPX_PATTERN_0,
// }

// UNSUPPORTED Rust 507:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IPX_PATTERN_0 {
//     pub NetworkAddress: u32,
//     pub NodeAddress: [u8; 6],
//     pub Socket: u16,
// }

// UNSUPPORTED Rust 514:1: declaration Impl has no candidate rule
// impl Default for IPX_PATTERN_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IP_INTFC_INFO_ID`: UInt = 259u;
public const val `IP_MIB_ADDRTABLE_ENTRY_ID`: UInt = 258u;
public const val `IP_MIB_STATS_ID`: UInt = 1u;
// UNSUPPORTED Rust 522:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IP_PATTERN {
//     pub Reserved1: u32,
//     pub Reserved2: u32,
//     pub SrcAddr: u32,
//     pub DstAddr: u32,
//     pub S_un: IP_PATTERN_0,
//     pub ProtocolId: u8,
//     pub Reserved3: [u8; 3],
// }

// UNSUPPORTED Rust 533:1: declaration Impl has no candidate rule
// impl Default for IP_PATTERN {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 538:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IP_PATTERN_0 {
//     pub S_un_ports: IP_PATTERN_0_0,
//     pub S_un_icmp: IP_PATTERN_0_1,
//     pub S_Spi: u32,
// }

// UNSUPPORTED Rust 545:1: declaration Impl has no candidate rule
// impl Default for IP_PATTERN_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 550:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IP_PATTERN_0_1 {
//     pub s_type: u8,
//     pub s_code: u8,
//     pub filler: u16,
// }

// UNSUPPORTED Rust 557:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IP_PATTERN_0_0 {
//     pub s_srcport: u16,
//     pub s_dstport: u16,
// }

public const val `ISPH_FLG_INV`: UInt = 128u;
public const val `ISSH_BREAK_BIT`: UInt = 128u;
// UNSUPPORTED Rust 565:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IS_ADSPEC_BODY {
//     pub adspec_mh: IntServMainHdr,
//     pub adspec_genparms: GenAdspecParams,
// }

// UNSUPPORTED Rust 571:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IS_FLOWSPEC {
//     pub flow_header: RsvpObjHdr,
//     pub flow_body: IntServFlowSpec,
// }

// UNSUPPORTED Rust 577:1: declaration Impl has no candidate rule
// impl Default for IS_FLOWSPEC {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IS_GUAR_RSPEC`: Int = 130;
public const val `IS_WKP_COMPOSED_MTU`: `int_serv_wkp` = 10;
public const val `IS_WKP_HOP_CNT`: `int_serv_wkp` = 4;
public const val `IS_WKP_MIN_LATENCY`: `int_serv_wkp` = 8;
public const val `IS_WKP_PATH_BW`: `int_serv_wkp` = 6;
public const val `IS_WKP_Q_TSPEC`: `int_serv_wkp` = 128;
public const val `IS_WKP_TB_TSPEC`: `int_serv_wkp` = 127;
// UNSUPPORTED Rust 589:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IntServFlowSpec {
//     pub spec_mh: IntServMainHdr,
//     pub spec_u: IntServFlowSpec_0,
// }

// UNSUPPORTED Rust 595:1: declaration Impl has no candidate rule
// impl Default for IntServFlowSpec {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 600:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IntServFlowSpec_0 {
//     pub CL_spec: CtrlLoadFlowspec,
//     pub G_spec: GuarFlowSpec,
//     pub Q_spec: QualAppFlowSpec,
// }

// UNSUPPORTED Rust 607:1: declaration Impl has no candidate rule
// impl Default for IntServFlowSpec_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 612:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IntServMainHdr {
//     pub ismh_version: u8,
//     pub ismh_unused: u8,
//     pub ismh_len32b: u16,
// }

// UNSUPPORTED Rust 619:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IntServParmHdr {
//     pub isph_parm_num: u8,
//     pub isph_flags: u8,
//     pub isph_len32b: u16,
// }

// UNSUPPORTED Rust 626:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IntServServiceHdr {
//     pub issh_service: u8,
//     pub issh_flags: u8,
//     pub issh_len32b: u16,
// }

// UNSUPPORTED Rust 633:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IntServTspecBody {
//     pub st_mh: IntServMainHdr,
//     pub tspec_u: IntServTspecBody_0,
// }

// UNSUPPORTED Rust 639:1: declaration Impl has no candidate rule
// impl Default for IntServTspecBody {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 644:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IntServTspecBody_0 {
//     pub gen_stspec: GenTspec,
//     pub qual_stspec: QualTspec,
// }

// UNSUPPORTED Rust 650:1: declaration Impl has no candidate rule
// impl Default for IntServTspecBody_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `LINE_RATE`: UInt = 50003u;
public const val `LOCAL_QOSABILITY`: UInt = 50005u;
public const val `LOCAL_TRAFFIC_CONTROL`: UInt = 50004u;
// UNSUPPORTED Rust 658:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct LPMIPTABLE {
//     pub ulIfIndex: u32,
//     pub MediaType: u32,
//     pub IfIpAddr: super::super::Networking::WinSock::IN_ADDR,
//     pub IfNetMask: super::super::Networking::WinSock::IN_ADDR,
// }

// UNSUPPORTED Rust 667:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for LPMIPTABLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `LPM_API_VERSION_1`: UInt = 1u;
// UNSUPPORTED Rust 674:1: non-scalar type Ptr unsupported
// pub type LPM_HANDLE = *mut core::ffi::c_void;

// UNSUPPORTED Rust 675:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct LPM_INIT_INFO {
//     pub PcmVersionNumber: u32,
//     pub ResultTimeLimit: u32,
//     pub ConfiguredLpmCount: i32,
//     pub AllocMemory: PALLOCMEM,
//     pub FreeMemory: PFREEMEM,
//     pub PcmAdmitResultCallback: CBADMITRESULT,
//     pub GetRsvpObjectsCallback: CBGETRSVPOBJECTS,
// }

public const val `LPM_OK`: UInt = 0u;
public const val `LPM_PE_ALL_TYPES`: UInt = 0u;
public const val `LPM_PE_APP_IDENTITY`: UInt = 3u;
public const val `LPM_PE_USER_IDENTITY`: UInt = 2u;
public const val `LPM_RESULT_DEFER`: UInt = 1u;
public const val `LPM_RESULT_READY`: UInt = 0u;
public const val `LPM_TIME_OUT`: UInt = 2u;
public const val `LPV_DONT_CARE`: UInt = 65534u;
public const val `LPV_DROP_MSG`: UInt = 65533u;
public const val `LPV_MAX_PRIORITY`: UInt = 65280u;
public const val `LPV_MIN_PRIORITY`: UInt = 1u;
public const val `LPV_REJECT`: UInt = 65535u;
public const val `LPV_RESERVED`: UInt = 0u;
public const val `MAX_HSP_UPGRADE_FILENAME_LENGTH`: UInt = 64u;
public const val `MAX_PHYSADDR_SIZE`: UInt = 8u;
public const val `MAX_STRING_LENGTH`: UInt = 256u;
public const val `MODERATELY_DELAY_SENSITIVE`: UInt = 4294967293u;
public const val `OSDEVICE_TYPE_BLOCKIO_CDROM`: UInt = 65539u;
public const val `OSDEVICE_TYPE_BLOCKIO_FILE`: UInt = 65541u;
public const val `OSDEVICE_TYPE_BLOCKIO_HARDDISK`: UInt = 65537u;
public const val `OSDEVICE_TYPE_BLOCKIO_PARTITION`: UInt = 65540u;
public const val `OSDEVICE_TYPE_BLOCKIO_RAMDISK`: UInt = 65542u;
public const val `OSDEVICE_TYPE_BLOCKIO_REMOVABLEDISK`: UInt = 65538u;
public const val `OSDEVICE_TYPE_BLOCKIO_VIRTUALHARDDISK`: UInt = 65543u;
public const val `OSDEVICE_TYPE_CIMFS`: UInt = 393216u;
public const val `OSDEVICE_TYPE_COMPOSITE`: UInt = 327680u;
public const val `OSDEVICE_TYPE_SERIAL`: UInt = 131072u;
public const val `OSDEVICE_TYPE_UDP`: UInt = 196608u;
public const val `OSDEVICE_TYPE_UNKNOWN`: UInt = 0u;
public const val `OSDEVICE_TYPE_VMBUS`: UInt = 262144u;
public const val `Opt_Distinct`: UInt = 8u;
public const val `Opt_Explicit`: UInt = 2u;
public const val `Opt_Share_mask`: UInt = 24u;
public const val `Opt_Shared`: UInt = 16u;
public const val `Opt_SndSel_mask`: UInt = 7u;
public const val `Opt_Wildcard`: UInt = 1u;
// UNSUPPORTED Rust 722:1: generic scalar type unsupported
// pub type PALLOCMEM = Option<unsafe extern "system" fn(size: u32) -> *mut core::ffi::c_void>;

// UNSUPPORTED Rust 723:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PARAM_BUFFER {
//     pub ParameterId: u32,
//     pub Length: u32,
//     pub Buffer: [u8; 1],
// }

// UNSUPPORTED Rust 730:1: declaration Impl has no candidate rule
// impl Default for PARAM_BUFFER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PCM_VERSION_1`: UInt = 1u;
public const val `PE_ATTRIB_TYPE_CREDENTIAL`: UInt = 2u;
public const val `PE_ATTRIB_TYPE_POLICY_LOCATOR`: UInt = 1u;
public const val `PE_TYPE_APPID`: UInt = 3u;
// UNSUPPORTED Rust 739:1: generic scalar type unsupported
// pub type PFREEMEM = Option<unsafe extern "system" fn(pv: *mut core::ffi::c_void)>;

// UNSUPPORTED Rust 740:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct POLICY_DATA {
//     pub PolicyObjHdr: RsvpObjHdr,
//     pub usPeOffset: u16,
//     pub usReserved: u16,
// }

// UNSUPPORTED Rust 747:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct POLICY_DECISION {
//     pub lpvResult: u32,
//     pub wPolicyErrCode: u16,
//     pub wPolicyErrValue: u16,
// }

// UNSUPPORTED Rust 754:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct POLICY_ELEMENT {
//     pub usPeLength: u16,
//     pub usPeType: u16,
//     pub ucPeData: [u8; 4],
// }

// UNSUPPORTED Rust 761:1: declaration Impl has no candidate rule
// impl Default for POLICY_ELEMENT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `POLICY_ERRV_CRAZY_FLOWSPEC`: UInt = 57u;
public const val `POLICY_ERRV_EXPIRED_CREDENTIALS`: UInt = 4u;
public const val `POLICY_ERRV_EXPIRED_USER_TOKEN`: UInt = 51u;
public const val `POLICY_ERRV_GLOBAL_DEF_FLOW_COUNT`: UInt = 1u;
public const val `POLICY_ERRV_GLOBAL_DEF_FLOW_DURATION`: UInt = 9u;
public const val `POLICY_ERRV_GLOBAL_DEF_FLOW_RATE`: UInt = 17u;
public const val `POLICY_ERRV_GLOBAL_DEF_PEAK_RATE`: UInt = 25u;
public const val `POLICY_ERRV_GLOBAL_DEF_SUM_FLOW_RATE`: UInt = 33u;
public const val `POLICY_ERRV_GLOBAL_DEF_SUM_PEAK_RATE`: UInt = 41u;
public const val `POLICY_ERRV_GLOBAL_GRP_FLOW_COUNT`: UInt = 2u;
public const val `POLICY_ERRV_GLOBAL_GRP_FLOW_DURATION`: UInt = 10u;
public const val `POLICY_ERRV_GLOBAL_GRP_FLOW_RATE`: UInt = 18u;
public const val `POLICY_ERRV_GLOBAL_GRP_PEAK_RATE`: UInt = 26u;
public const val `POLICY_ERRV_GLOBAL_GRP_SUM_FLOW_RATE`: UInt = 34u;
public const val `POLICY_ERRV_GLOBAL_GRP_SUM_PEAK_RATE`: UInt = 42u;
public const val `POLICY_ERRV_GLOBAL_UNAUTH_USER_FLOW_COUNT`: UInt = 4u;
public const val `POLICY_ERRV_GLOBAL_UNAUTH_USER_FLOW_DURATION`: UInt = 12u;
public const val `POLICY_ERRV_GLOBAL_UNAUTH_USER_FLOW_RATE`: UInt = 20u;
public const val `POLICY_ERRV_GLOBAL_UNAUTH_USER_PEAK_RATE`: UInt = 28u;
public const val `POLICY_ERRV_GLOBAL_UNAUTH_USER_SUM_FLOW_RATE`: UInt = 36u;
public const val `POLICY_ERRV_GLOBAL_UNAUTH_USER_SUM_PEAK_RATE`: UInt = 44u;
public const val `POLICY_ERRV_GLOBAL_USER_FLOW_COUNT`: UInt = 3u;
public const val `POLICY_ERRV_GLOBAL_USER_FLOW_DURATION`: UInt = 11u;
public const val `POLICY_ERRV_GLOBAL_USER_FLOW_RATE`: UInt = 19u;
public const val `POLICY_ERRV_GLOBAL_USER_PEAK_RATE`: UInt = 27u;
public const val `POLICY_ERRV_GLOBAL_USER_SUM_FLOW_RATE`: UInt = 35u;
public const val `POLICY_ERRV_GLOBAL_USER_SUM_PEAK_RATE`: UInt = 43u;
public const val `POLICY_ERRV_IDENTITY_CHANGED`: UInt = 5u;
public const val `POLICY_ERRV_INSUFFICIENT_PRIVILEGES`: UInt = 3u;
public const val `POLICY_ERRV_NO_ACCEPTS`: UInt = 55u;
public const val `POLICY_ERRV_NO_MEMORY`: UInt = 56u;
public const val `POLICY_ERRV_NO_MORE_INFO`: UInt = 1u;
public const val `POLICY_ERRV_NO_PRIVILEGES`: UInt = 50u;
public const val `POLICY_ERRV_NO_RESOURCES`: UInt = 52u;
public const val `POLICY_ERRV_PRE_EMPTED`: UInt = 53u;
public const val `POLICY_ERRV_SUBNET_DEF_FLOW_COUNT`: UInt = 5u;
public const val `POLICY_ERRV_SUBNET_DEF_FLOW_DURATION`: UInt = 13u;
public const val `POLICY_ERRV_SUBNET_DEF_FLOW_RATE`: UInt = 21u;
public const val `POLICY_ERRV_SUBNET_DEF_PEAK_RATE`: UInt = 29u;
public const val `POLICY_ERRV_SUBNET_DEF_SUM_FLOW_RATE`: UInt = 37u;
public const val `POLICY_ERRV_SUBNET_DEF_SUM_PEAK_RATE`: UInt = 45u;
public const val `POLICY_ERRV_SUBNET_GRP_FLOW_COUNT`: UInt = 6u;
public const val `POLICY_ERRV_SUBNET_GRP_FLOW_DURATION`: UInt = 14u;
public const val `POLICY_ERRV_SUBNET_GRP_FLOW_RATE`: UInt = 22u;
public const val `POLICY_ERRV_SUBNET_GRP_PEAK_RATE`: UInt = 30u;
public const val `POLICY_ERRV_SUBNET_GRP_SUM_FLOW_RATE`: UInt = 38u;
public const val `POLICY_ERRV_SUBNET_GRP_SUM_PEAK_RATE`: UInt = 46u;
public const val `POLICY_ERRV_SUBNET_UNAUTH_USER_FLOW_COUNT`: UInt = 8u;
public const val `POLICY_ERRV_SUBNET_UNAUTH_USER_FLOW_DURATION`: UInt = 16u;
public const val `POLICY_ERRV_SUBNET_UNAUTH_USER_FLOW_RATE`: UInt = 24u;
public const val `POLICY_ERRV_SUBNET_UNAUTH_USER_PEAK_RATE`: UInt = 32u;
public const val `POLICY_ERRV_SUBNET_UNAUTH_USER_SUM_FLOW_RATE`: UInt = 40u;
public const val `POLICY_ERRV_SUBNET_UNAUTH_USER_SUM_PEAK_RATE`: UInt = 48u;
public const val `POLICY_ERRV_SUBNET_USER_FLOW_COUNT`: UInt = 7u;
public const val `POLICY_ERRV_SUBNET_USER_FLOW_DURATION`: UInt = 15u;
public const val `POLICY_ERRV_SUBNET_USER_FLOW_RATE`: UInt = 23u;
public const val `POLICY_ERRV_SUBNET_USER_PEAK_RATE`: UInt = 31u;
public const val `POLICY_ERRV_SUBNET_USER_SUM_FLOW_RATE`: UInt = 39u;
public const val `POLICY_ERRV_SUBNET_USER_SUM_PEAK_RATE`: UInt = 47u;
public const val `POLICY_ERRV_UNKNOWN`: UInt = 0u;
public const val `POLICY_ERRV_UNKNOWN_USER`: UInt = 49u;
public const val `POLICY_ERRV_UNSUPPORTED_CREDENTIAL_TYPE`: UInt = 2u;
public const val `POLICY_ERRV_USER_CHANGED`: UInt = 54u;
public const val `POLICY_LOCATOR_SUB_TYPE_ASCII_DN`: UInt = 1u;
public const val `POLICY_LOCATOR_SUB_TYPE_ASCII_DN_ENC`: UInt = 3u;
public const val `POLICY_LOCATOR_SUB_TYPE_UNICODE_DN`: UInt = 2u;
public const val `POLICY_LOCATOR_SUB_TYPE_UNICODE_DN_ENC`: UInt = 4u;
public const val `POSITIVE_INFINITY_RATE`: UInt = 4294967294u;
public const val `PREDICTIVE_SERV`: UInt = 3u;
public const val `QOSFlowRateCongestion`: `QOS_FLOWRATE_REASON` = 2;
public const val `QOSFlowRateContentChange`: `QOS_FLOWRATE_REASON` = 1;
public const val `QOSFlowRateHigherContentEncoding`: `QOS_FLOWRATE_REASON` = 3;
public const val `QOSFlowRateNotApplicable`: `QOS_FLOWRATE_REASON` = 0;
public const val `QOSFlowRateUserCaused`: `QOS_FLOWRATE_REASON` = 4;
public const val `QOSNotifyAvailable`: `QOS_NOTIFY_FLOW` = 2;
public const val `QOSNotifyCongested`: `QOS_NOTIFY_FLOW` = 0;
public const val `QOSNotifyUncongested`: `QOS_NOTIFY_FLOW` = 1;
public const val `QOSQueryFlowFundamentals`: `QOS_QUERY_FLOW` = 0;
public const val `QOSQueryOutgoingRate`: `QOS_QUERY_FLOW` = 2;
public const val `QOSQueryPacketPriority`: `QOS_QUERY_FLOW` = 1;
public const val `QOSSPBASE`: UInt = 50000u;
public const val `QOSSP_ERR_BASE`: UInt = 56000u;
public const val `QOSSetOutgoingDSCPValue`: `QOS_SET_FLOW` = 2;
public const val `QOSSetOutgoingRate`: `QOS_SET_FLOW` = 1;
public const val `QOSSetTrafficType`: `QOS_SET_FLOW` = 0;
public const val `QOSShapeAndMark`: `QOS_SHAPING` = 1;
public const val `QOSShapeOnly`: `QOS_SHAPING` = 0;
public const val `QOSTrafficTypeAudioVideo`: `QOS_TRAFFIC_TYPE` = 3;
public const val `QOSTrafficTypeBackground`: `QOS_TRAFFIC_TYPE` = 1;
public const val `QOSTrafficTypeBestEffort`: `QOS_TRAFFIC_TYPE` = 0;
public const val `QOSTrafficTypeControl`: `QOS_TRAFFIC_TYPE` = 5;
public const val `QOSTrafficTypeExcellentEffort`: `QOS_TRAFFIC_TYPE` = 2;
public const val `QOSTrafficTypeVoice`: `QOS_TRAFFIC_TYPE` = 4;
public const val `QOSUseNonConformantMarkings`: `QOS_SHAPING` = 2;
// UNSUPPORTED Rust 860:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct QOS_DESTADDR {
//     pub ObjectHdr: QOS_OBJECT_HDR,
//     pub SocketAddress: *const super::super::Networking::WinSock::SOCKADDR,
//     pub SocketAddressLength: u32,
// }

// UNSUPPORTED Rust 868:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for QOS_DESTADDR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 874:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct QOS_DIFFSERV {
//     pub ObjectHdr: QOS_OBJECT_HDR,
//     pub DSFieldCount: u32,
//     pub DiffservRule: [u8; 1],
// }

// UNSUPPORTED Rust 881:1: declaration Impl has no candidate rule
// impl Default for QOS_DIFFSERV {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 886:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct QOS_DIFFSERV_RULE {
//     pub InboundDSField: u8,
//     pub ConformingOutboundDSField: u8,
//     pub NonConformingOutboundDSField: u8,
//     pub ConformingUserPriority: u8,
//     pub NonConformingUserPriority: u8,
// }

// UNSUPPORTED Rust 895:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct QOS_DS_CLASS {
//     pub ObjectHdr: QOS_OBJECT_HDR,
//     pub DSField: u32,
// }

// UNSUPPORTED Rust 901:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct QOS_FLOWRATE_OUTGOING {
//     pub Bandwidth: u64,
//     pub ShapingBehavior: QOS_SHAPING,
//     pub Reason: QOS_FLOWRATE_REASON,
// }

public typealias `QOS_FLOWRATE_REASON` = Int;
// UNSUPPORTED Rust 909:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct QOS_FLOW_FUNDAMENTALS {
//     pub BottleneckBandwidthSet: windows_sys::core::BOOL,
//     pub BottleneckBandwidth: u64,
//     pub AvailableBandwidthSet: windows_sys::core::BOOL,
//     pub AvailableBandwidth: u64,
//     pub RTTSet: windows_sys::core::BOOL,
//     pub RTT: u32,
// }

// UNSUPPORTED Rust 919:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct QOS_FRIENDLY_NAME {
//     pub ObjectHdr: QOS_OBJECT_HDR,
//     pub FriendlyName: [u16; 256],
// }

// UNSUPPORTED Rust 925:1: declaration Impl has no candidate rule
// impl Default for QOS_FRIENDLY_NAME {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `QOS_GENERAL_ID_BASE`: UInt = 2000u;
public const val `QOS_MAX_OBJECT_STRING_LENGTH`: UInt = 256u;
public const val `QOS_NON_ADAPTIVE_FLOW`: UInt = 2u;
public typealias `QOS_NOTIFY_FLOW` = Int;
public const val `QOS_NOT_SPECIFIED`: UInt = 4294967295u;
// UNSUPPORTED Rust 935:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct QOS_OBJECT_HDR {
//     pub ObjectType: u32,
//     pub ObjectLength: u32,
// }

public const val `QOS_OUTGOING_DEFAULT_MINIMUM_BANDWIDTH`: UInt = 4294967295u;
// UNSUPPORTED Rust 942:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct QOS_PACKET_PRIORITY {
//     pub ConformantDSCPValue: u32,
//     pub NonConformantDSCPValue: u32,
//     pub ConformantL2Value: u32,
//     pub NonConformantL2Value: u32,
// }

public const val `QOS_QUERYFLOW_FRESH`: UInt = 1u;
public typealias `QOS_QUERY_FLOW` = Int;
// UNSUPPORTED Rust 952:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct QOS_SD_MODE {
//     pub ObjectHdr: QOS_OBJECT_HDR,
//     pub ShapeDiscardMode: u32,
// }

public typealias `QOS_SET_FLOW` = Int;
public typealias `QOS_SHAPING` = Int;
// UNSUPPORTED Rust 960:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct QOS_SHAPING_RATE {
//     pub ObjectHdr: QOS_OBJECT_HDR,
//     pub ShapingRate: u32,
// }

// UNSUPPORTED Rust 966:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct QOS_TCP_TRAFFIC {
//     pub ObjectHdr: QOS_OBJECT_HDR,
// }

// UNSUPPORTED Rust 971:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct QOS_TRAFFIC_CLASS {
//     pub ObjectHdr: QOS_OBJECT_HDR,
//     pub TrafficClass: u32,
// }

public const val `QOS_TRAFFIC_GENERAL_ID_BASE`: UInt = 4000u;
public typealias `QOS_TRAFFIC_TYPE` = Int;
// UNSUPPORTED Rust 979:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct QOS_VERSION {
//     pub MajorVersion: u16,
//     pub MinorVersion: u16,
// }

public const val `QUALITATIVE_SERV`: UInt = 6u;
// UNSUPPORTED Rust 986:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct QualAppFlowSpec {
//     pub Q_spec_serv_hdr: IntServServiceHdr,
//     pub Q_spec_parm_hdr: IntServParmHdr,
//     pub Q_spec_parms: QualTspecParms,
// }

// UNSUPPORTED Rust 993:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct QualTspec {
//     pub qual_Tspec_serv_hdr: IntServServiceHdr,
//     pub qual_Tspec_parm_hdr: IntServParmHdr,
//     pub qual_Tspec_parms: QualTspecParms,
// }

// UNSUPPORTED Rust 1000:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct QualTspecParms {
//     pub TB_Tspec_M: u32,
// }

public const val `RCVD_PATH_TEAR`: UInt = 1u;
public const val `RCVD_RESV_TEAR`: UInt = 2u;
public const val `RESOURCES_ALLOCATED`: UInt = 1u;
public const val `RESOURCES_MODIFIED`: UInt = 2u;
// UNSUPPORTED Rust 1009:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct RESV_STYLE {
//     pub style_header: RsvpObjHdr,
//     pub style_word: u32,
// }

// UNSUPPORTED Rust 1015:1: non-scalar type Ptr unsupported
// pub type RHANDLE = *mut core::ffi::c_void;

// UNSUPPORTED Rust 1016:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RSVP_ADSPEC {
//     pub ObjectHdr: QOS_OBJECT_HDR,
//     pub GeneralParams: AD_GENERAL_PARAMS,
//     pub NumberOfServices: u32,
//     pub Services: [CONTROL_SERVICE; 1],
// }

// UNSUPPORTED Rust 1024:1: declaration Impl has no candidate rule
// impl Default for RSVP_ADSPEC {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `RSVP_DEFAULT_STYLE`: UInt = 0u;
public const val `RSVP_Err_ADMISSION`: UInt = 1u;
public const val `RSVP_Err_AMBIG_FILTER`: UInt = 9u;
public const val `RSVP_Err_API_ERROR`: UInt = 20u;
public const val `RSVP_Err_BAD_DSTPORT`: UInt = 7u;
public const val `RSVP_Err_BAD_SNDPORT`: UInt = 8u;
public const val `RSVP_Err_BAD_STYLE`: UInt = 5u;
public const val `RSVP_Err_NONE`: UInt = 0u;
public const val `RSVP_Err_NO_PATH`: UInt = 3u;
public const val `RSVP_Err_NO_SENDER`: UInt = 4u;
public const val `RSVP_Err_POLICY`: UInt = 2u;
public const val `RSVP_Err_PREEMPTED`: UInt = 12u;
public const val `RSVP_Err_RSVP_SYS_ERROR`: UInt = 23u;
public const val `RSVP_Err_TC_ERROR`: UInt = 21u;
public const val `RSVP_Err_TC_SYS_ERROR`: UInt = 22u;
public const val `RSVP_Err_UNKNOWN_CTYPE`: UInt = 14u;
public const val `RSVP_Err_UNKNOWN_STYLE`: UInt = 6u;
public const val `RSVP_Err_UNKN_OBJ_CLASS`: UInt = 13u;
public const val `RSVP_Erv_API`: UInt = 2u;
public const val `RSVP_Erv_Bandwidth`: UInt = 2u;
public const val `RSVP_Erv_Bucket_szie`: UInt = 32770u;
public const val `RSVP_Erv_Conflict_Serv`: UInt = 1u;
public const val `RSVP_Erv_Crazy_Flowspec`: UInt = 3u;
public const val `RSVP_Erv_Crazy_Tspec`: UInt = 4u;
public const val `RSVP_Erv_DelayBnd`: UInt = 1u;
public const val `RSVP_Erv_Flow_Rate`: UInt = 32769u;
public const val `RSVP_Erv_MEMORY`: UInt = 1u;
public const val `RSVP_Erv_MTU`: UInt = 3u;
public const val `RSVP_Erv_Min_Policied_size`: UInt = 32772u;
public const val `RSVP_Erv_No_Serv`: UInt = 2u;
public const val `RSVP_Erv_Nonev`: UInt = 0u;
public const val `RSVP_Erv_Other`: UInt = 0u;
public const val `RSVP_Erv_Peak_Rate`: UInt = 32771u;
// UNSUPPORTED Rust 1062:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RSVP_FILTERSPEC {
//     pub Type: FilterType,
//     pub Anonymous: RSVP_FILTERSPEC_0,
// }

// UNSUPPORTED Rust 1068:1: declaration Impl has no candidate rule
// impl Default for RSVP_FILTERSPEC {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1073:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union RSVP_FILTERSPEC_0 {
//     pub FilterSpecV4: RSVP_FILTERSPEC_V4,
//     pub FilterSpecV6: RSVP_FILTERSPEC_V6,
//     pub FilterSpecV6Flow: RSVP_FILTERSPEC_V6_FLOW,
//     pub FilterSpecV4Gpi: RSVP_FILTERSPEC_V4_GPI,
//     pub FilterSpecV6Gpi: RSVP_FILTERSPEC_V6_GPI,
// }

// UNSUPPORTED Rust 1082:1: declaration Impl has no candidate rule
// impl Default for RSVP_FILTERSPEC_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1087:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RSVP_FILTERSPEC_V4 {
//     pub Address: IN_ADDR_IPV4,
//     pub Unused: u16,
//     pub Port: u16,
// }

// UNSUPPORTED Rust 1094:1: declaration Impl has no candidate rule
// impl Default for RSVP_FILTERSPEC_V4 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1099:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RSVP_FILTERSPEC_V4_GPI {
//     pub Address: IN_ADDR_IPV4,
//     pub GeneralPortId: u32,
// }

// UNSUPPORTED Rust 1105:1: declaration Impl has no candidate rule
// impl Default for RSVP_FILTERSPEC_V4_GPI {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1110:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct RSVP_FILTERSPEC_V6 {
//     pub Address: IN_ADDR_IPV6,
//     pub UnUsed: u16,
//     pub Port: u16,
// }

// UNSUPPORTED Rust 1117:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RSVP_FILTERSPEC_V6_FLOW {
//     pub Address: IN_ADDR_IPV6,
//     pub UnUsed: u8,
//     pub FlowLabel: [u8; 3],
// }

// UNSUPPORTED Rust 1124:1: declaration Impl has no candidate rule
// impl Default for RSVP_FILTERSPEC_V6_FLOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1129:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct RSVP_FILTERSPEC_V6_GPI {
//     pub Address: IN_ADDR_IPV6,
//     pub GeneralPortId: u32,
// }

public const val `RSVP_FIXED_FILTER_STYLE`: UInt = 2u;
// UNSUPPORTED Rust 1136:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct RSVP_HOP {
//     pub hop_header: RsvpObjHdr,
//     pub hop_u: RSVP_HOP_0,
// }

// UNSUPPORTED Rust 1143:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for RSVP_HOP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1149:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub union RSVP_HOP_0 {
//     pub hop_ipv4: Rsvp_Hop_IPv4,
// }

// UNSUPPORTED Rust 1155:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for RSVP_HOP_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1161:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct RSVP_MSG_OBJS {
//     pub RsvpMsgType: i32,
//     pub pRsvpSession: *mut RSVP_SESSION,
//     pub pRsvpFromHop: *mut RSVP_HOP,
//     pub pRsvpToHop: *mut RSVP_HOP,
//     pub pResvStyle: *mut RESV_STYLE,
//     pub pRsvpScope: *mut RSVP_SCOPE,
//     pub FlowDescCount: i32,
//     pub pFlowDescs: *mut FLOW_DESC,
//     pub PdObjectCount: i32,
//     pub ppPdObjects: *mut *mut POLICY_DATA,
//     pub pErrorSpec: *mut ERROR_SPEC,
//     pub pAdspec: *mut ADSPEC,
// }

// UNSUPPORTED Rust 1178:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for RSVP_MSG_OBJS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `RSVP_OBJECT_ID_BASE`: UInt = 1000u;
public const val `RSVP_PATH`: UInt = 1u;
public const val `RSVP_PATH_ERR`: UInt = 3u;
public const val `RSVP_PATH_TEAR`: UInt = 5u;
// UNSUPPORTED Rust 1188:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RSVP_POLICY {
//     pub Len: u16,
//     pub Type: u16,
//     pub Info: [u8; 4],
// }

// UNSUPPORTED Rust 1195:1: declaration Impl has no candidate rule
// impl Default for RSVP_POLICY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1200:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RSVP_POLICY_INFO {
//     pub ObjectHdr: QOS_OBJECT_HDR,
//     pub NumPolicyElement: u32,
//     pub PolicyElement: [RSVP_POLICY; 1],
// }

// UNSUPPORTED Rust 1207:1: declaration Impl has no candidate rule
// impl Default for RSVP_POLICY_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1212:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct RSVP_RESERVE_INFO {
//     pub ObjectHdr: QOS_OBJECT_HDR,
//     pub Style: u32,
//     pub ConfirmRequest: u32,
//     pub PolicyElementList: *mut RSVP_POLICY_INFO,
//     pub NumFlowDesc: u32,
//     pub FlowDescList: *mut FLOWDESCRIPTOR,
// }

// UNSUPPORTED Rust 1223:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for RSVP_RESERVE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `RSVP_RESV`: UInt = 2u;
public const val `RSVP_RESV_ERR`: UInt = 4u;
public const val `RSVP_RESV_TEAR`: UInt = 6u;
// UNSUPPORTED Rust 1232:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct RSVP_SCOPE {
//     pub scopl_header: RsvpObjHdr,
//     pub scope_u: RSVP_SCOPE_0,
// }

// UNSUPPORTED Rust 1239:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for RSVP_SCOPE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1245:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub union RSVP_SCOPE_0 {
//     pub scopl_ipv4: Scope_list_ipv4,
// }

// UNSUPPORTED Rust 1251:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for RSVP_SCOPE_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1257:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct RSVP_SESSION {
//     pub sess_header: RsvpObjHdr,
//     pub sess_u: RSVP_SESSION_0,
// }

// UNSUPPORTED Rust 1264:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for RSVP_SESSION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1270:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub union RSVP_SESSION_0 {
//     pub sess_ipv4: Session_IPv4,
// }

// UNSUPPORTED Rust 1276:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for RSVP_SESSION_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `RSVP_SHARED_EXPLICIT_STYLE`: UInt = 3u;
// UNSUPPORTED Rust 1283:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct RSVP_STATUS_INFO {
//     pub ObjectHdr: QOS_OBJECT_HDR,
//     pub StatusCode: u32,
//     pub ExtendedStatus1: u32,
//     pub ExtendedStatus2: u32,
// }

public const val `RSVP_WILDCARD_STYLE`: UInt = 1u;
// UNSUPPORTED Rust 1292:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct RsvpObjHdr {
//     pub obj_length: u16,
//     pub obj_class: u8,
//     pub obj_ctype: u8,
// }

// UNSUPPORTED Rust 1299:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct Rsvp_Hop_IPv4 {
//     pub hop_ipaddr: super::super::Networking::WinSock::IN_ADDR,
//     pub hop_LIH: u32,
// }

// UNSUPPORTED Rust 1306:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for Rsvp_Hop_IPv4 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1312:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SENDER_TSPEC {
//     pub stspec_header: RsvpObjHdr,
//     pub stspec_body: IntServTspecBody,
// }

// UNSUPPORTED Rust 1318:1: declaration Impl has no candidate rule
// impl Default for SENDER_TSPEC {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SERVICETYPE_BESTEFFORT`: UInt = 1u;
public const val `SERVICETYPE_CONTROLLEDLOAD`: UInt = 2u;
public const val `SERVICETYPE_GENERAL_INFORMATION`: UInt = 5u;
public const val `SERVICETYPE_GUARANTEED`: UInt = 3u;
public const val `SERVICETYPE_NETWORK_CONTROL`: UInt = 10u;
public const val `SERVICETYPE_NETWORK_UNAVAILABLE`: UInt = 4u;
public const val `SERVICETYPE_NOCHANGE`: UInt = 6u;
public const val `SERVICETYPE_NONCONFORMING`: UInt = 9u;
public const val `SERVICETYPE_NOTRAFFIC`: UInt = 0u;
public const val `SERVICETYPE_QUALITATIVE`: UInt = 13u;
public const val `SERVICE_BESTEFFORT`: UInt = 2147549184u;
public const val `SERVICE_CONTROLLEDLOAD`: UInt = 2147614720u;
public const val `SERVICE_GUARANTEED`: UInt = 2147745792u;
public const val `SERVICE_NO_QOS_SIGNALING`: UInt = 1073741824u;
public const val `SERVICE_NO_TRAFFIC_CONTROL`: UInt = 2164260864u;
public const val `SERVICE_QUALITATIVE`: UInt = 2149580800u;
public const val `SESSFLG_E_Police`: UInt = 1u;
public const val `SIPAERROR_FIRMWAREFAILURE`: UInt = 196609u;
public const val `SIPAERROR_INTERNALFAILURE`: UInt = 196611u;
public const val `SIPAEVENTTYPE_AGGREGATION`: UInt = 1073741824u;
public const val `SIPAEVENTTYPE_AUTHORITY`: UInt = 393216u;
public const val `SIPAEVENTTYPE_CONTAINER`: UInt = 65536u;
public const val `SIPAEVENTTYPE_DRTM`: UInt = 786432u;
public const val `SIPAEVENTTYPE_ELAM`: UInt = 589824u;
public const val `SIPAEVENTTYPE_ERROR`: UInt = 196608u;
public const val `SIPAEVENTTYPE_INFORMATION`: UInt = 131072u;
public const val `SIPAEVENTTYPE_KSR`: UInt = 720896u;
public const val `SIPAEVENTTYPE_LOADEDMODULE`: UInt = 458752u;
public const val `SIPAEVENTTYPE_NONMEASURED`: UInt = 2147483648u;
public const val `SIPAEVENTTYPE_OSPARAMETER`: UInt = 327680u;
public const val `SIPAEVENTTYPE_PREOSPARAMETER`: UInt = 262144u;
public const val `SIPAEVENTTYPE_TRUSTPOINT`: UInt = 524288u;
public const val `SIPAEVENTTYPE_VBS`: UInt = 655360u;
public const val `SIPAEVENT_APPLICATION_RETURN`: UInt = 131076u;
public const val `SIPAEVENT_APPLICATION_SVN`: UInt = 131081u;
public const val `SIPAEVENT_AUTHENTICODEHASH`: UInt = 458756u;
public const val `SIPAEVENT_AUTHORITYISSUER`: UInt = 458757u;
public const val `SIPAEVENT_AUTHORITYPUBKEY`: UInt = 393218u;
public const val `SIPAEVENT_AUTHORITYPUBLISHER`: UInt = 458760u;
public const val `SIPAEVENT_AUTHORITYSERIAL`: UInt = 458758u;
public const val `SIPAEVENT_AUTHORITYSHA1THUMBPRINT`: UInt = 458761u;
public const val `SIPAEVENT_BITLOCKER_UNLOCK`: UInt = 131077u;
public const val `SIPAEVENT_BOOTCOUNTER`: UInt = 131074u;
public const val `SIPAEVENT_BOOTDEBUGGING`: UInt = 262145u;
public const val `SIPAEVENT_BOOT_REVOCATION_LIST`: UInt = 262146u;
public const val `SIPAEVENT_CODEINTEGRITY`: UInt = 327682u;
public const val `SIPAEVENT_COUNTERID`: UInt = 131079u;
public const val `SIPAEVENT_DATAEXECUTIONPREVENTION`: UInt = 327684u;
public const val `SIPAEVENT_DRIVER_LOAD_POLICY`: UInt = 327694u;
public const val `SIPAEVENT_DRTM_AMD_SMM_HASH`: UInt = 786435u;
public const val `SIPAEVENT_DRTM_AMD_SMM_SIGNER_KEY`: UInt = 786436u;
public const val `SIPAEVENT_DRTM_SMM_LEVEL`: UInt = 786434u;
public const val `SIPAEVENT_DRTM_STATE_AUTH`: UInt = 786433u;
public const val `SIPAEVENT_DUMPS_DISABLED`: UInt = 327717u;
public const val `SIPAEVENT_DUMP_ENCRYPTION_ENABLED`: UInt = 327718u;
public const val `SIPAEVENT_DUMP_ENCRYPTION_KEY_DIGEST`: UInt = 327719u;
public const val `SIPAEVENT_ELAM_CONFIGURATION`: UInt = 589826u;
public const val `SIPAEVENT_ELAM_KEYNAME`: UInt = 589825u;
public const val `SIPAEVENT_ELAM_MEASURED`: UInt = 589828u;
public const val `SIPAEVENT_ELAM_POLICY`: UInt = 589827u;
public const val `SIPAEVENT_EVENTCOUNTER`: UInt = 131078u;
public const val `SIPAEVENT_FILEPATH`: UInt = 458753u;
public const val `SIPAEVENT_FLIGHTSIGNING`: UInt = 327713u;
public const val `SIPAEVENT_HASHALGORITHMID`: UInt = 458755u;
public const val `SIPAEVENT_HIBERNATION_DISABLED`: UInt = 327716u;
public const val `SIPAEVENT_HYPERVISOR_BOOT_DMA_PROTECTION`: UInt = 327728u;
public const val `SIPAEVENT_HYPERVISOR_DEBUG`: UInt = 327693u;
public const val `SIPAEVENT_HYPERVISOR_IOMMU_POLICY`: UInt = 327692u;
public const val `SIPAEVENT_HYPERVISOR_LAUNCH_TYPE`: UInt = 327690u;
public const val `SIPAEVENT_HYPERVISOR_MMIO_NX_POLICY`: UInt = 327696u;
public const val `SIPAEVENT_HYPERVISOR_MSR_FILTER_POLICY`: UInt = 327697u;
public const val `SIPAEVENT_HYPERVISOR_PATH`: UInt = 327691u;
public const val `SIPAEVENT_IMAGEBASE`: UInt = 458759u;
public const val `SIPAEVENT_IMAGESIZE`: UInt = 458754u;
public const val `SIPAEVENT_IMAGEVALIDATED`: UInt = 458762u;
public const val `SIPAEVENT_INFORMATION`: UInt = 131073u;
public const val `SIPAEVENT_KSR_SIGNATURE`: UInt = 720897u;
// UNSUPPORTED Rust 1400:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct SIPAEVENT_KSR_SIGNATURE_PAYLOAD {
//     pub SignAlgID: u32,
//     pub SignatureLength: u32,
//     pub Signature: [u8; 1],
// }

// UNSUPPORTED Rust 1407:1: declaration Impl has no candidate rule
// impl Default for SIPAEVENT_KSR_SIGNATURE_PAYLOAD {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SIPAEVENT_LSAISO_CONFIG`: UInt = 327720u;
public const val `SIPAEVENT_MODULE_HSP`: UInt = 458764u;
public const val `SIPAEVENT_MODULE_SVN`: UInt = 458763u;
public const val `SIPAEVENT_MORBIT_API_STATUS`: UInt = 131083u;
public const val `SIPAEVENT_MORBIT_NOT_CANCELABLE`: UInt = 131080u;
public const val `SIPAEVENT_NOAUTHORITY`: UInt = 393217u;
public const val `SIPAEVENT_OSDEVICE`: UInt = 327688u;
public const val `SIPAEVENT_OSKERNELDEBUG`: UInt = 327681u;
public const val `SIPAEVENT_OS_REVOCATION_LIST`: UInt = 327699u;
public const val `SIPAEVENT_PAGEFILE_ENCRYPTION_ENABLED`: UInt = 327714u;
public const val `SIPAEVENT_PHYSICALADDRESSEXTENSION`: UInt = 327687u;
// UNSUPPORTED Rust 1423:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct SIPAEVENT_REVOCATION_LIST_PAYLOAD {
//     pub CreationTime: i64,
//     pub DigestLength: u32,
//     pub HashAlgID: u16,
//     pub Digest: [u8; 1],
// }

// UNSUPPORTED Rust 1431:1: declaration Impl has no candidate rule
// impl Default for SIPAEVENT_REVOCATION_LIST_PAYLOAD {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SIPAEVENT_SAFEMODE`: UInt = 327685u;
public const val `SIPAEVENT_SBCP_INFO`: UInt = 327721u;
// UNSUPPORTED Rust 1438:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct SIPAEVENT_SBCP_INFO_PAYLOAD_V1 {
//     pub PayloadVersion: u32,
//     pub VarDataOffset: u32,
//     pub HashAlgID: u16,
//     pub DigestLength: u16,
//     pub Options: u32,
//     pub SignersCount: u32,
//     pub VarData: [u8; 1],
// }

// UNSUPPORTED Rust 1449:1: declaration Impl has no candidate rule
// impl Default for SIPAEVENT_SBCP_INFO_PAYLOAD_V1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SIPAEVENT_SI_POLICY`: UInt = 327695u;
// UNSUPPORTED Rust 1455:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct SIPAEVENT_SI_POLICY_PAYLOAD {
//     pub PolicyVersion: u64,
//     pub PolicyNameLength: u16,
//     pub HashAlgID: u16,
//     pub DigestLength: u32,
//     pub VarLengthData: [u8; 1],
// }

// UNSUPPORTED Rust 1464:1: declaration Impl has no candidate rule
// impl Default for SIPAEVENT_SI_POLICY_PAYLOAD {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SIPAEVENT_SMT_STATUS`: UInt = 327700u;
public const val `SIPAEVENT_SVN_CHAIN_STATUS`: UInt = 131082u;
public const val `SIPAEVENT_SYSTEMROOT`: UInt = 327689u;
public const val `SIPAEVENT_TESTSIGNING`: UInt = 327683u;
public const val `SIPAEVENT_TRANSFER_CONTROL`: UInt = 131075u;
public const val `SIPAEVENT_VBS_DUMP_USES_AMEROOT`: UInt = 655369u;
public const val `SIPAEVENT_VBS_HVCI_POLICY`: UInt = 655367u;
public const val `SIPAEVENT_VBS_IOMMU_REQUIRED`: UInt = 655363u;
public const val `SIPAEVENT_VBS_MANDATORY_ENFORCEMENT`: UInt = 655366u;
public const val `SIPAEVENT_VBS_MICROSOFT_BOOT_CHAIN_REQUIRED`: UInt = 655368u;
public const val `SIPAEVENT_VBS_MMIO_NX_REQUIRED`: UInt = 655364u;
public const val `SIPAEVENT_VBS_MSR_FILTERING_REQUIRED`: UInt = 655365u;
public const val `SIPAEVENT_VBS_SECUREBOOT_REQUIRED`: UInt = 655362u;
public const val `SIPAEVENT_VBS_VSM_NOSECRETS_ENFORCED`: UInt = 655370u;
public const val `SIPAEVENT_VBS_VSM_REQUIRED`: UInt = 655361u;
public const val `SIPAEVENT_VSM_IDKS_INFO`: UInt = 327715u;
public const val `SIPAEVENT_VSM_IDK_INFO`: UInt = 327712u;
// UNSUPPORTED Rust 1486:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct SIPAEVENT_VSM_IDK_INFO_PAYLOAD {
//     pub KeyAlgID: u32,
//     pub Anonymous: SIPAEVENT_VSM_IDK_INFO_PAYLOAD_0,
// }

// UNSUPPORTED Rust 1492:1: declaration Impl has no candidate rule
// impl Default for SIPAEVENT_VSM_IDK_INFO_PAYLOAD {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1497:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union SIPAEVENT_VSM_IDK_INFO_PAYLOAD_0 {
//     pub RsaKeyInfo: SIPAEVENT_VSM_IDK_RSA_INFO,
// }

// UNSUPPORTED Rust 1502:1: declaration Impl has no candidate rule
// impl Default for SIPAEVENT_VSM_IDK_INFO_PAYLOAD_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1507:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct SIPAEVENT_VSM_IDK_RSA_INFO {
//     pub KeyBitLength: u32,
//     pub PublicExpLengthBytes: u32,
//     pub ModulusSizeBytes: u32,
//     pub PublicKeyData: [u8; 1],
// }

// UNSUPPORTED Rust 1515:1: declaration Impl has no candidate rule
// impl Default for SIPAEVENT_VSM_IDK_RSA_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SIPAEVENT_VSM_LAUNCH_TYPE`: UInt = 327698u;
public const val `SIPAEVENT_WINPE`: UInt = 327686u;
public const val `SIPAEV_ACTION`: UInt = 5u;
public const val `SIPAEV_AMD_SL_EVENT_BASE`: UInt = 32768u;
public const val `SIPAEV_AMD_SL_LOAD`: UInt = 32769u;
public const val `SIPAEV_AMD_SL_LOAD_1`: UInt = 32774u;
public const val `SIPAEV_AMD_SL_PSP_FW_SPLT`: UInt = 32770u;
public const val `SIPAEV_AMD_SL_PUB_KEY`: UInt = 32772u;
public const val `SIPAEV_AMD_SL_SEPARATOR`: UInt = 32775u;
public const val `SIPAEV_AMD_SL_SVN`: UInt = 32773u;
public const val `SIPAEV_AMD_SL_TSME_RB_FUSE`: UInt = 32771u;
public const val `SIPAEV_COMPACT_HASH`: UInt = 12u;
public const val `SIPAEV_CPU_MICROCODE`: UInt = 9u;
public const val `SIPAEV_EFI_ACTION`: UInt = 2147483655u;
public const val `SIPAEV_EFI_BOOT_SERVICES_APPLICATION`: UInt = 2147483651u;
public const val `SIPAEV_EFI_BOOT_SERVICES_DRIVER`: UInt = 2147483652u;
public const val `SIPAEV_EFI_EVENT_BASE`: UInt = 2147483648u;
public const val `SIPAEV_EFI_GPT_EVENT`: UInt = 2147483654u;
public const val `SIPAEV_EFI_HANDOFF_TABLES`: UInt = 2147483657u;
public const val `SIPAEV_EFI_HANDOFF_TABLES2`: UInt = 2147483659u;
public const val `SIPAEV_EFI_HCRTM_EVENT`: UInt = 2147483664u;
public const val `SIPAEV_EFI_PLATFORM_FIRMWARE_BLOB`: UInt = 2147483656u;
public const val `SIPAEV_EFI_PLATFORM_FIRMWARE_BLOB2`: UInt = 2147483658u;
public const val `SIPAEV_EFI_RUNTIME_SERVICES_DRIVER`: UInt = 2147483653u;
public const val `SIPAEV_EFI_SPDM_FIRMWARE_BLOB`: UInt = 2147483873u;
public const val `SIPAEV_EFI_SPDM_FIRMWARE_CONFIG`: UInt = 2147483874u;
public const val `SIPAEV_EFI_VARIABLE_AUTHORITY`: UInt = 2147483872u;
public const val `SIPAEV_EFI_VARIABLE_BOOT`: UInt = 2147483650u;
public const val `SIPAEV_EFI_VARIABLE_BOOT2`: UInt = 2147483660u;
public const val `SIPAEV_EFI_VARIABLE_DRIVER_CONFIG`: UInt = 2147483649u;
public const val `SIPAEV_EVENT_TAG`: UInt = 6u;
public const val `SIPAEV_IPL`: UInt = 13u;
public const val `SIPAEV_IPL_PARTITION_DATA`: UInt = 14u;
public const val `SIPAEV_NONHOST_CODE`: UInt = 15u;
public const val `SIPAEV_NONHOST_CONFIG`: UInt = 16u;
public const val `SIPAEV_NONHOST_INFO`: UInt = 17u;
public const val `SIPAEV_NO_ACTION`: UInt = 3u;
public const val `SIPAEV_OMIT_BOOT_DEVICE_EVENTS`: UInt = 18u;
public const val `SIPAEV_PLATFORM_CONFIG_FLAGS`: UInt = 10u;
public const val `SIPAEV_POST_CODE`: UInt = 1u;
public const val `SIPAEV_PREBOOT_CERT`: UInt = 0u;
public const val `SIPAEV_SEPARATOR`: UInt = 4u;
public const val `SIPAEV_S_CRTM_CONTENTS`: UInt = 7u;
public const val `SIPAEV_S_CRTM_VERSION`: UInt = 8u;
public const val `SIPAEV_TABLE_OF_DEVICES`: UInt = 11u;
public const val `SIPAEV_TXT_BIOSAC_REG_DATA`: UInt = 1034u;
public const val `SIPAEV_TXT_BOOT_POL_HASH`: UInt = 1050u;
public const val `SIPAEV_TXT_BPM_HASH`: UInt = 1047u;
public const val `SIPAEV_TXT_BPM_INFO_HASH`: UInt = 1049u;
public const val `SIPAEV_TXT_CAP_VALUE`: UInt = 1279u;
public const val `SIPAEV_TXT_COLD_BOOT_BIOS_HASH`: UInt = 1045u;
public const val `SIPAEV_TXT_COMBINED_HASH`: UInt = 1027u;
public const val `SIPAEV_TXT_CPU_SCRTM_STAT`: UInt = 1035u;
public const val `SIPAEV_TXT_ELEMENTS_HASH`: UInt = 1037u;
public const val `SIPAEV_TXT_EVENT_BASE`: UInt = 1024u;
public const val `SIPAEV_TXT_HASH_START`: UInt = 1026u;
public const val `SIPAEV_TXT_KM_HASH`: UInt = 1046u;
public const val `SIPAEV_TXT_KM_INFO_HASH`: UInt = 1048u;
public const val `SIPAEV_TXT_LCP_AUTHORITIES_HASH`: UInt = 1043u;
public const val `SIPAEV_TXT_LCP_CONTROL_HASH`: UInt = 1036u;
public const val `SIPAEV_TXT_LCP_DETAILS_HASH`: UInt = 1042u;
public const val `SIPAEV_TXT_LCP_HASH`: UInt = 1041u;
public const val `SIPAEV_TXT_MLE_HASH`: UInt = 1028u;
public const val `SIPAEV_TXT_NV_INFO_HASH`: UInt = 1044u;
public const val `SIPAEV_TXT_OSSINITDATA_CAP_HASH`: UInt = 1039u;
public const val `SIPAEV_TXT_PCR_MAPPING`: UInt = 1025u;
public const val `SIPAEV_TXT_RANDOM_VALUE`: UInt = 1278u;
public const val `SIPAEV_TXT_SINIT_PUBKEY_HASH`: UInt = 1040u;
public const val `SIPAEV_TXT_STM_HASH`: UInt = 1038u;
public const val `SIPAEV_UNUSED`: UInt = 2u;
public const val `SIPAHDRSIGNATURE`: UInt = 1279476311u;
public const val `SIPAKSRHDRSIGNATURE`: UInt = 1297240907u;
public const val `SIPALOGVERSION`: UInt = 1u;
public const val `STATE_TIMEOUT`: UInt = 4u;
// UNSUPPORTED Rust 1594:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct Scope_list_ipv4 {
//     pub scopl_ipaddr: [super::super::Networking::WinSock::IN_ADDR; 1],
// }

// UNSUPPORTED Rust 1600:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for Scope_list_ipv4 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1606:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct Session_IPv4 {
//     pub sess_destaddr: super::super::Networking::WinSock::IN_ADDR,
//     pub sess_protid: u8,
//     pub sess_flags: u8,
//     pub sess_destport: u16,
// }

// UNSUPPORTED Rust 1615:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for Session_IPv4 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `TCBASE`: UInt = 7500u;
// UNSUPPORTED Rust 1622:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct TCG_PCClientPCREventStruct {
//     pub pcrIndex: u32,
//     pub eventType: u32,
//     pub digest: [u8; 20],
//     pub eventDataSize: u32,
//     pub event: [u8; 1],
// }

// UNSUPPORTED Rust 1631:1: declaration Impl has no candidate rule
// impl Default for TCG_PCClientPCREventStruct {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1636:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct TCG_PCClientTaggedEventStruct {
//     pub EventID: u32,
//     pub EventDataSize: u32,
//     pub EventData: [u8; 1],
// }

// UNSUPPORTED Rust 1643:1: declaration Impl has no candidate rule
// impl Default for TCG_PCClientTaggedEventStruct {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1648:1: generic scalar type unsupported
// pub type TCI_ADD_FLOW_COMPLETE_HANDLER = Option<unsafe extern "system" fn(clflowctx: super::super::Foundation::HANDLE, status: u32)>;

// UNSUPPORTED Rust 1649:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TCI_CLIENT_FUNC_LIST {
//     pub ClNotifyHandler: TCI_NOTIFY_HANDLER,
//     pub ClAddFlowCompleteHandler: TCI_ADD_FLOW_COMPLETE_HANDLER,
//     pub ClModifyFlowCompleteHandler: TCI_MOD_FLOW_COMPLETE_HANDLER,
//     pub ClDeleteFlowCompleteHandler: TCI_DEL_FLOW_COMPLETE_HANDLER,
// }

// UNSUPPORTED Rust 1657:1: generic scalar type unsupported
// pub type TCI_DEL_FLOW_COMPLETE_HANDLER = Option<unsafe extern "system" fn(clflowctx: super::super::Foundation::HANDLE, status: u32)>;

// UNSUPPORTED Rust 1658:1: generic scalar type unsupported
// pub type TCI_MOD_FLOW_COMPLETE_HANDLER = Option<unsafe extern "system" fn(clflowctx: super::super::Foundation::HANDLE, status: u32)>;

// UNSUPPORTED Rust 1659:1: generic scalar type unsupported
// pub type TCI_NOTIFY_HANDLER = Option<unsafe extern "system" fn(clregctx: super::super::Foundation::HANDLE, clifcctx: super::super::Foundation::HANDLE, event: u32, subcode: super::super::Foundation::HANDLE, bufsize: u32, buffer: *const core::ffi::c_void)>;

// UNSUPPORTED Rust 1660:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct TC_GEN_FILTER {
//     pub AddressType: u16,
//     pub PatternSize: u32,
//     pub Pattern: *mut core::ffi::c_void,
//     pub Mask: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 1668:1: declaration Impl has no candidate rule
// impl Default for TC_GEN_FILTER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1673:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy)]
// pub struct TC_GEN_FLOW {
//     pub SendingFlowspec: super::super::Networking::WinSock::FLOWSPEC,
//     pub ReceivingFlowspec: super::super::Networking::WinSock::FLOWSPEC,
//     pub TcObjectsLength: u32,
//     pub TcObjects: [QOS_OBJECT_HDR; 1],
// }

// UNSUPPORTED Rust 1682:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Networking_WinSock")]
// impl Default for TC_GEN_FLOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1688:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct TC_IFC_DESCRIPTOR {
//     pub Length: u32,
//     pub pInterfaceName: windows_sys::core::PWSTR,
//     pub pInterfaceID: windows_sys::core::PWSTR,
//     pub AddressListDesc: ADDRESS_LIST_DESCRIPTOR,
// }

// UNSUPPORTED Rust 1697:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for TC_IFC_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `TC_NONCONF_BORROW`: UInt = 0u;
public const val `TC_NONCONF_BORROW_PLUS`: UInt = 3u;
public const val `TC_NONCONF_DISCARD`: UInt = 2u;
public const val `TC_NONCONF_SHAPE`: UInt = 1u;
public const val `TC_NOTIFY_FLOW_CLOSE`: UInt = 5u;
public const val `TC_NOTIFY_IFC_CHANGE`: UInt = 3u;
public const val `TC_NOTIFY_IFC_CLOSE`: UInt = 2u;
public const val `TC_NOTIFY_IFC_UP`: UInt = 1u;
public const val `TC_NOTIFY_PARAM_CHANGED`: UInt = 4u;
// UNSUPPORTED Rust 1712:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// #[derive(Clone, Copy)]
// pub struct TC_SUPPORTED_INFO_BUFFER {
//     pub InstanceIDLength: u16,
//     pub InstanceID: [u16; 256],
//     pub InterfaceLuid: u64,
//     pub AddrListDesc: ADDRESS_LIST_DESCRIPTOR,
// }

// UNSUPPORTED Rust 1721:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_NetworkManagement_Ndis")]
// impl Default for TC_SUPPORTED_INFO_BUFFER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `UNSUPPORTED_CREDENTIAL_TYPE`: UInt = 2u;
public const val `WBCL_DIGEST_ALG_BITMAP_SHA3_256`: UInt = 32u;
public const val `WBCL_DIGEST_ALG_BITMAP_SHA3_384`: UInt = 64u;
public const val `WBCL_DIGEST_ALG_BITMAP_SHA3_512`: UInt = 128u;
public const val `WBCL_DIGEST_ALG_BITMAP_SHA_1`: UInt = 1u;
public const val `WBCL_DIGEST_ALG_BITMAP_SHA_2_256`: UInt = 2u;
public const val `WBCL_DIGEST_ALG_BITMAP_SHA_2_384`: UInt = 4u;
public const val `WBCL_DIGEST_ALG_BITMAP_SHA_2_512`: UInt = 8u;
public const val `WBCL_DIGEST_ALG_BITMAP_SM3_256`: UInt = 16u;
public const val `WBCL_DIGEST_ALG_ID_SHA3_256`: UInt = 39u;
public const val `WBCL_DIGEST_ALG_ID_SHA3_384`: UInt = 40u;
public const val `WBCL_DIGEST_ALG_ID_SHA3_512`: UInt = 41u;
public const val `WBCL_DIGEST_ALG_ID_SHA_1`: UInt = 4u;
public const val `WBCL_DIGEST_ALG_ID_SHA_2_256`: UInt = 11u;
public const val `WBCL_DIGEST_ALG_ID_SHA_2_384`: UInt = 12u;
public const val `WBCL_DIGEST_ALG_ID_SHA_2_512`: UInt = 13u;
public const val `WBCL_DIGEST_ALG_ID_SM3_256`: UInt = 18u;
public const val `WBCL_HASH_LEN_SHA1`: UInt = 20u;
// UNSUPPORTED Rust 1745:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct WBCL_Iterator {
//     pub firstElementPtr: *mut core::ffi::c_void,
//     pub logSize: u32,
//     pub currentElementPtr: *mut core::ffi::c_void,
//     pub currentElementSize: u32,
//     pub digestSize: u16,
//     pub logFormat: u16,
//     pub numberOfDigests: u32,
//     pub digestSizes: *mut core::ffi::c_void,
//     pub supportedAlgorithms: u32,
//     pub hashAlgorithm: u16,
// }

// UNSUPPORTED Rust 1759:1: declaration Impl has no candidate rule
// impl Default for WBCL_Iterator {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1764:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct WBCL_LogHdr {
//     pub signature: u32,
//     pub version: u32,
//     pub entries: u32,
//     pub length: u32,
// }

public const val `WBCL_MAX_HSP_UPGRADE_HASH_LEN`: UInt = 64u;
public const val `class_ADSPEC`: UInt = 13u;
public const val `class_CONFIRM`: UInt = 15u;
public const val `class_ERROR_SPEC`: UInt = 6u;
public const val `class_FILTER_SPEC`: UInt = 10u;
public const val `class_FLOWSPEC`: UInt = 9u;
public const val `class_INTEGRITY`: UInt = 4u;
public const val `class_IS_FLOWSPEC`: UInt = 9u;
public const val `class_MAX`: UInt = 15u;
public const val `class_NULL`: UInt = 0u;
public const val `class_POLICY_DATA`: UInt = 14u;
public const val `class_RSVP_HOP`: UInt = 3u;
public const val `class_SCOPE`: UInt = 7u;
public const val `class_SENDER_TEMPLATE`: UInt = 11u;
public const val `class_SENDER_TSPEC`: UInt = 12u;
public const val `class_SESSION`: UInt = 1u;
public const val `class_SESSION_GROUP`: UInt = 2u;
public const val `class_STYLE`: UInt = 8u;
public const val `class_TIME_VALUES`: UInt = 5u;
public const val `ctype_ADSPEC_INTSERV`: UInt = 2u;
public const val `ctype_ERROR_SPEC_ipv4`: UInt = 1u;
public const val `ctype_FILTER_SPEC_ipv4`: UInt = 1u;
public const val `ctype_FILTER_SPEC_ipv4GPI`: UInt = 4u;
public const val `ctype_FLOWSPEC_Intserv0`: UInt = 2u;
public const val `ctype_POLICY_DATA`: UInt = 1u;
public const val `ctype_RSVP_HOP_ipv4`: UInt = 1u;
public const val `ctype_SCOPE_list_ipv4`: UInt = 1u;
public const val `ctype_SENDER_TEMPLATE_ipv4`: UInt = 1u;
public const val `ctype_SENDER_TEMPLATE_ipv4GPI`: UInt = 4u;
public const val `ctype_SENDER_TSPEC`: UInt = 2u;
public const val `ctype_SESSION_ipv4`: UInt = 1u;
public const val `ctype_SESSION_ipv4GPI`: UInt = 3u;
public const val `ctype_STYLE`: UInt = 1u;
public typealias `int_serv_wkp` = Int;
public const val `ioctl_code`: UInt = 1u;
public const val `mCOMPANY`: UInt = 402653184u;
public const val `mIOC_IN`: UInt = 2147483648u;
public const val `mIOC_OUT`: UInt = 1073741824u;
public const val `mIOC_VENDOR`: UInt = 67108864u;
