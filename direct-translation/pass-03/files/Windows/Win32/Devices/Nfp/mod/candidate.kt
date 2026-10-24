// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: no per-file syntax rule for Const
// pub const DEVPKEY_NFP_Capabilities: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0xfb3842cd_9e2a_4f83_8fcc_4b0761139ae9), pid: 2 };

// UNSUPPORTED Rust 2:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_DEVINTERFACE_NFP: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfb3842cd_9e2a_4f83_8fcc_4b0761139ae9);

public const val `IOCTL_NFP_DISABLE`: UInt = 5308492u;
public const val `IOCTL_NFP_ENABLE`: UInt = 5308496u;
public const val `IOCTL_NFP_GET_KILO_BYTES_PER_SECOND`: UInt = 5308548u;
public const val `IOCTL_NFP_GET_MAX_MESSAGE_BYTES`: UInt = 5308544u;
public const val `IOCTL_NFP_GET_NEXT_SUBSCRIBED_MESSAGE`: UInt = 5308480u;
public const val `IOCTL_NFP_GET_NEXT_TRANSMITTED_MESSAGE`: UInt = 5308488u;
public const val `IOCTL_NFP_SET_PAYLOAD`: UInt = 5308484u;
// UNSUPPORTED Rust 10:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SUBSCRIBED_MESSAGE {
//     pub cbPayloadHint: u32,
//     pub payload: [u8; 1],
// }

// UNSUPPORTED Rust 16:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SUBSCRIBED_MESSAGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

