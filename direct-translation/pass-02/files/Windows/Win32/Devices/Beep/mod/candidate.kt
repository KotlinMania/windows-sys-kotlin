// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
public const val `BEEP_FREQUENCY_MAXIMUM`: UInt = 32767u;
public const val `BEEP_FREQUENCY_MINIMUM`: UInt = 37u;
// UNSUPPORTED Rust 3:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct BEEP_SET_PARAMETERS {
//     pub Frequency: u32,
//     pub Duration: u32,
// }

// UNSUPPORTED Rust 9:1: non-scalar type Ptr unsupported
// pub const DD_BEEP_DEVICE_NAME: windows_sys::core::PCSTR = windows_sys::core::s!("\\Device\\Beep");

// UNSUPPORTED Rust 10:1: non-scalar type Ptr unsupported
// pub const DD_BEEP_DEVICE_NAME_U: windows_sys::core::PCWSTR = windows_sys::core::w!("\\Device\\Beep");

public const val `IOCTL_BEEP_SET`: UInt = 65536u;
