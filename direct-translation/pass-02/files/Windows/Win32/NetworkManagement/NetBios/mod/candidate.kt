// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn Netbios(pncb : *mut NCB) -> u8);

// UNSUPPORTED Rust 2:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ACTION_HEADER {
//     pub transport_id: u32,
//     pub action_code: u16,
//     pub reserved: u16,
// }

// UNSUPPORTED Rust 9:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ADAPTER_STATUS {
//     pub adapter_address: [u8; 6],
//     pub rev_major: u8,
//     pub reserved0: u8,
//     pub adapter_type: u8,
//     pub rev_minor: u8,
//     pub duration: u16,
//     pub frmr_recv: u16,
//     pub frmr_xmit: u16,
//     pub iframe_recv_err: u16,
//     pub xmit_aborts: u16,
//     pub xmit_success: u32,
//     pub recv_success: u32,
//     pub iframe_xmit_err: u16,
//     pub recv_buff_unavail: u16,
//     pub t1_timeouts: u16,
//     pub ti_timeouts: u16,
//     pub reserved1: u32,
//     pub free_ncbs: u16,
//     pub max_cfg_ncbs: u16,
//     pub max_ncbs: u16,
//     pub xmit_buf_unavail: u16,
//     pub max_dgram_size: u16,
//     pub pending_sess: u16,
//     pub max_cfg_sess: u16,
//     pub max_sess: u16,
//     pub max_sess_pkt_size: u16,
//     pub name_count: u16,
// }

// UNSUPPORTED Rust 40:1: declaration Impl has no candidate rule
// impl Default for ADAPTER_STATUS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 45:1: non-scalar type Ptr unsupported
// pub const ALL_TRANSPORTS: windows_sys::core::PCSTR = windows_sys::core::s!("M\u{0}\u{0}\u{0}");

public const val `ASYNCH`: UInt = 128u;
public const val `CALL_PENDING`: UInt = 2u;
public const val `DEREGISTERED`: UInt = 5u;
public const val `DUPLICATE`: UInt = 6u;
public const val `DUPLICATE_DEREG`: UInt = 7u;
// UNSUPPORTED Rust 51:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FIND_NAME_BUFFER {
//     pub length: u8,
//     pub access_control: u8,
//     pub frame_control: u8,
//     pub destination_addr: [u8; 6],
//     pub source_addr: [u8; 6],
//     pub routing_info: [u8; 18],
// }

// UNSUPPORTED Rust 61:1: declaration Impl has no candidate rule
// impl Default for FIND_NAME_BUFFER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 66:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FIND_NAME_HEADER {
//     pub node_count: u16,
//     pub reserved: u8,
//     pub unique_group: u8,
// }

public const val `GROUP_NAME`: UInt = 128u;
public const val `HANGUP_COMPLETE`: UInt = 5u;
public const val `HANGUP_PENDING`: UInt = 4u;
// UNSUPPORTED Rust 76:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct LANA_ENUM {
//     pub length: u8,
//     pub lana: [u8; 255],
// }

// UNSUPPORTED Rust 82:1: declaration Impl has no candidate rule
// impl Default for LANA_ENUM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `LISTEN_OUTSTANDING`: UInt = 1u;
public const val `MAX_LANA`: UInt = 254u;
// UNSUPPORTED Rust 89:1: non-scalar type Ptr unsupported
// pub const MS_NBF: windows_sys::core::PCSTR = windows_sys::core::s!("MNBF");

// UNSUPPORTED Rust 90:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NAME_BUFFER {
//     pub name: [u8; 16],
//     pub name_num: u8,
//     pub name_flags: u8,
// }

// UNSUPPORTED Rust 97:1: declaration Impl has no candidate rule
// impl Default for NAME_BUFFER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NAME_FLAGS_MASK`: UInt = 135u;
// UNSUPPORTED Rust 103:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct NCB {
//     pub ncb_command: u8,
//     pub ncb_retcode: u8,
//     pub ncb_lsn: u8,
//     pub ncb_num: u8,
//     pub ncb_buffer: *mut u8,
//     pub ncb_length: u16,
//     pub ncb_callname: [u8; 16],
//     pub ncb_name: [u8; 16],
//     pub ncb_rto: u8,
//     pub ncb_sto: u8,
//     pub ncb_post: isize,
//     pub ncb_lana_num: u8,
//     pub ncb_cmd_cplt: u8,
//     pub ncb_reserve: [u8; 10],
//     pub ncb_event: super::super::Foundation::HANDLE,
// }

// UNSUPPORTED Rust 123:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for NCB {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 129:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct NCB {
//     pub ncb_command: u8,
//     pub ncb_retcode: u8,
//     pub ncb_lsn: u8,
//     pub ncb_num: u8,
//     pub ncb_buffer: *mut u8,
//     pub ncb_length: u16,
//     pub ncb_callname: [u8; 16],
//     pub ncb_name: [u8; 16],
//     pub ncb_rto: u8,
//     pub ncb_sto: u8,
//     pub ncb_post: isize,
//     pub ncb_lana_num: u8,
//     pub ncb_cmd_cplt: u8,
//     pub ncb_reserve: [u8; 18],
//     pub ncb_event: super::super::Foundation::HANDLE,
// }

// UNSUPPORTED Rust 149:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for NCB {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NCBACTION`: UInt = 119u;
public const val `NCBADDGRNAME`: UInt = 54u;
public const val `NCBADDNAME`: UInt = 48u;
public const val `NCBASTAT`: UInt = 51u;
public const val `NCBCALL`: UInt = 16u;
public const val `NCBCANCEL`: UInt = 53u;
public const val `NCBCHAINSEND`: UInt = 23u;
public const val `NCBCHAINSENDNA`: UInt = 114u;
public const val `NCBDELNAME`: UInt = 49u;
public const val `NCBDGRECV`: UInt = 33u;
public const val `NCBDGRECVBC`: UInt = 35u;
public const val `NCBDGSEND`: UInt = 32u;
public const val `NCBDGSENDBC`: UInt = 34u;
public const val `NCBENUM`: UInt = 55u;
public const val `NCBFINDNAME`: UInt = 120u;
public const val `NCBHANGUP`: UInt = 18u;
public const val `NCBLANSTALERT`: UInt = 115u;
public const val `NCBLISTEN`: UInt = 17u;
public const val `NCBNAMSZ`: UInt = 16u;
public const val `NCBRECV`: UInt = 21u;
public const val `NCBRECVANY`: UInt = 22u;
public const val `NCBRESET`: UInt = 50u;
public const val `NCBSEND`: UInt = 20u;
public const val `NCBSENDNA`: UInt = 113u;
public const val `NCBSSTAT`: UInt = 52u;
public const val `NCBTRACE`: UInt = 121u;
public const val `NCBUNLINK`: UInt = 112u;
public const val `NRC_ACTSES`: UInt = 15u;
public const val `NRC_BADDR`: UInt = 7u;
public const val `NRC_BRIDGE`: UInt = 35u;
public const val `NRC_BUFLEN`: UInt = 1u;
public const val `NRC_CANCEL`: UInt = 38u;
public const val `NRC_CANOCCR`: UInt = 36u;
public const val `NRC_CMDCAN`: UInt = 11u;
public const val `NRC_CMDTMO`: UInt = 5u;
public const val `NRC_DUPENV`: UInt = 48u;
public const val `NRC_DUPNAME`: UInt = 13u;
public const val `NRC_ENVNOTDEF`: UInt = 52u;
public const val `NRC_GOODRET`: UInt = 0u;
public const val `NRC_IFBUSY`: UInt = 33u;
public const val `NRC_ILLCMD`: UInt = 3u;
public const val `NRC_ILLNN`: UInt = 19u;
public const val `NRC_INCOMP`: UInt = 6u;
public const val `NRC_INUSE`: UInt = 22u;
public const val `NRC_INVADDRESS`: UInt = 57u;
public const val `NRC_INVDDID`: UInt = 59u;
public const val `NRC_LOCKFAIL`: UInt = 60u;
public const val `NRC_LOCTFUL`: UInt = 17u;
public const val `NRC_MAXAPPS`: UInt = 54u;
public const val `NRC_NAMCONF`: UInt = 25u;
public const val `NRC_NAMERR`: UInt = 23u;
public const val `NRC_NAMTFUL`: UInt = 14u;
public const val `NRC_NOCALL`: UInt = 20u;
public const val `NRC_NORES`: UInt = 9u;
public const val `NRC_NORESOURCES`: UInt = 56u;
public const val `NRC_NOSAPS`: UInt = 55u;
public const val `NRC_NOWILD`: UInt = 21u;
public const val `NRC_OPENERR`: UInt = 63u;
public const val `NRC_OSRESNOTAV`: UInt = 53u;
public const val `NRC_PENDING`: UInt = 255u;
public const val `NRC_REMTFUL`: UInt = 18u;
public const val `NRC_SABORT`: UInt = 24u;
public const val `NRC_SCLOSED`: UInt = 10u;
public const val `NRC_SNUMOUT`: UInt = 8u;
public const val `NRC_SYSTEM`: UInt = 64u;
public const val `NRC_TOOMANY`: UInt = 34u;
public const val `REGISTERED`: UInt = 4u;
public const val `REGISTERING`: UInt = 0u;
public const val `SESSION_ABORTED`: UInt = 6u;
// UNSUPPORTED Rust 224:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SESSION_BUFFER {
//     pub lsn: u8,
//     pub state: u8,
//     pub local_name: [u8; 16],
//     pub remote_name: [u8; 16],
//     pub rcvs_outstanding: u8,
//     pub sends_outstanding: u8,
// }

// UNSUPPORTED Rust 234:1: declaration Impl has no candidate rule
// impl Default for SESSION_BUFFER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SESSION_ESTABLISHED`: UInt = 3u;
// UNSUPPORTED Rust 240:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SESSION_HEADER {
//     pub sess_name: u8,
//     pub num_sess: u8,
//     pub rcv_dg_outstanding: u8,
//     pub rcv_any_outstanding: u8,
// }

public const val `UNIQUE_NAME`: UInt = 0u;
