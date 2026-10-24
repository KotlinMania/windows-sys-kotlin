// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVINTERFACE_PWM_CONTROLLER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x60824b4c_eed1_4c9c_b49c_1b961461a819);

// UNSUPPORTED Rust 2:1: non-scalar type Ptr unsupported
// pub const GUID_DEVINTERFACE_PWM_CONTROLLER_WSZ: windows_sys::core::PCWSTR = windows_sys::core::w!("{60824B4C-EED1-4C9C-B49C-1B961461A819}");

public const val `IOCTL_PWM_CONTROLLER_GET_ACTUAL_PERIOD`: UInt = 262148u;
public const val `IOCTL_PWM_CONTROLLER_GET_INFO`: UInt = 262144u;
public const val `IOCTL_PWM_CONTROLLER_SET_DESIRED_PERIOD`: UInt = 294920u;
public const val `IOCTL_PWM_PIN_GET_ACTIVE_DUTY_CYCLE_PERCENTAGE`: UInt = 262544u;
public const val `IOCTL_PWM_PIN_GET_POLARITY`: UInt = 262552u;
public const val `IOCTL_PWM_PIN_IS_STARTED`: UInt = 262568u;
public const val `IOCTL_PWM_PIN_SET_ACTIVE_DUTY_CYCLE_PERCENTAGE`: UInt = 295316u;
public const val `IOCTL_PWM_PIN_SET_POLARITY`: UInt = 295324u;
public const val `IOCTL_PWM_PIN_START`: UInt = 295331u;
public const val `IOCTL_PWM_PIN_STOP`: UInt = 295335u;
public const val `PWM_ACTIVE_HIGH`: `PWM_POLARITY` = 0;
public const val `PWM_ACTIVE_LOW`: `PWM_POLARITY` = 1;
// UNSUPPORTED Rust 15:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PWM_CONTROLLER_GET_ACTUAL_PERIOD_OUTPUT {
//     pub ActualPeriod: u64,
// }

// UNSUPPORTED Rust 20:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PWM_CONTROLLER_INFO {
//     pub Size: usize,
//     pub PinCount: u32,
//     pub MinimumPeriod: u64,
//     pub MaximumPeriod: u64,
// }

// UNSUPPORTED Rust 28:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PWM_CONTROLLER_SET_DESIRED_PERIOD_INPUT {
//     pub DesiredPeriod: u64,
// }

// UNSUPPORTED Rust 33:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PWM_CONTROLLER_SET_DESIRED_PERIOD_OUTPUT {
//     pub ActualPeriod: u64,
// }

public const val `PWM_IOCTL_ID_CONTROLLER_GET_ACTUAL_PERIOD`: Int = 1;
public const val `PWM_IOCTL_ID_CONTROLLER_GET_INFO`: Int = 0;
public const val `PWM_IOCTL_ID_CONTROLLER_SET_DESIRED_PERIOD`: Int = 2;
public const val `PWM_IOCTL_ID_PIN_GET_ACTIVE_DUTY_CYCLE_PERCENTAGE`: Int = 100;
public const val `PWM_IOCTL_ID_PIN_GET_POLARITY`: Int = 102;
public const val `PWM_IOCTL_ID_PIN_IS_STARTED`: Int = 106;
public const val `PWM_IOCTL_ID_PIN_SET_ACTIVE_DUTY_CYCLE_PERCENTAGE`: Int = 101;
public const val `PWM_IOCTL_ID_PIN_SET_POLARITY`: Int = 103;
public const val `PWM_IOCTL_ID_PIN_START`: Int = 104;
public const val `PWM_IOCTL_ID_PIN_STOP`: Int = 105;
// UNSUPPORTED Rust 48:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PWM_PIN_GET_ACTIVE_DUTY_CYCLE_PERCENTAGE_OUTPUT {
//     pub Percentage: u64,
// }

// UNSUPPORTED Rust 53:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PWM_PIN_GET_POLARITY_OUTPUT {
//     pub Polarity: PWM_POLARITY,
// }

// UNSUPPORTED Rust 58:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PWM_PIN_IS_STARTED_OUTPUT {
//     pub IsStarted: bool,
// }

// UNSUPPORTED Rust 63:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PWM_PIN_SET_ACTIVE_DUTY_CYCLE_PERCENTAGE_INPUT {
//     pub Percentage: u64,
// }

// UNSUPPORTED Rust 68:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PWM_PIN_SET_POLARITY_INPUT {
//     pub Polarity: PWM_POLARITY,
// }

public typealias `PWM_POLARITY` = Int;
