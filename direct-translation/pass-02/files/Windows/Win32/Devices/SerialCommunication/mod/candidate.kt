// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("msports.dll" "system" fn ComDBClaimNextFreePort(hcomdb : HCOMDB, comnumber : *mut u32) -> i32);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("msports.dll" "system" fn ComDBClaimPort(hcomdb : HCOMDB, comnumber : u32, forceclaim : windows_sys::core::BOOL, forced : *mut windows_sys::core::BOOL) -> i32);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("msports.dll" "system" fn ComDBClose(hcomdb : HCOMDB) -> i32);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("msports.dll" "system" fn ComDBGetCurrentPortUsage(hcomdb : HCOMDB, buffer : *mut u8, buffersize : u32, reporttype : u32, maxportsreported : *mut u32) -> i32);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("msports.dll" "system" fn ComDBOpen(phcomdb : *mut HCOMDB) -> i32);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("msports.dll" "system" fn ComDBReleasePort(hcomdb : HCOMDB, comnumber : u32) -> i32);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("msports.dll" "system" fn ComDBResizeDatabase(hcomdb : HCOMDB, newsize : u32) -> i32);

public const val `CDB_REPORT_BITS`: UInt = 0u;
public const val `CDB_REPORT_BYTES`: UInt = 1u;
public const val `COMDB_MAX_PORTS_ARBITRATED`: UInt = 4096u;
public const val `COMDB_MIN_PORTS_ARBITRATED`: UInt = 256u;
// UNSUPPORTED Rust 12:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_DeviceInterface_Serial_PortName: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x4c6bf15c_4c03_4aac_91f5_64c0f852bcf4), pid: 4 };

// UNSUPPORTED Rust 13:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_DeviceInterface_Serial_UsbProductId: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x4c6bf15c_4c03_4aac_91f5_64c0f852bcf4), pid: 3 };

// UNSUPPORTED Rust 14:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY
// pub const DEVPKEY_DeviceInterface_Serial_UsbVendorId: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x4c6bf15c_4c03_4aac_91f5_64c0f852bcf4), pid: 2 };

public const val `EVEN_PARITY`: UInt = 2u;
// UNSUPPORTED Rust 16:1: non-scalar type Ptr unsupported
// pub type HCOMDB = *mut core::ffi::c_void;

public const val `IOCTL_INTERNAL_SERENUM_REMOVE_SELF`: UInt = 3604999u;
public const val `IOCTL_SERIAL_APPLY_DEFAULT_CONFIGURATION`: UInt = 1769632u;
public const val `IOCTL_SERIAL_CLEAR_STATS`: UInt = 1769616u;
public const val `IOCTL_SERIAL_CLR_DTR`: UInt = 1769512u;
public const val `IOCTL_SERIAL_CLR_RTS`: UInt = 1769524u;
public const val `IOCTL_SERIAL_CONFIG_SIZE`: UInt = 1769600u;
public const val `IOCTL_SERIAL_GET_BAUD_RATE`: UInt = 1769552u;
public const val `IOCTL_SERIAL_GET_CHARS`: UInt = 1769560u;
public const val `IOCTL_SERIAL_GET_COMMCONFIG`: UInt = 1769604u;
public const val `IOCTL_SERIAL_GET_COMMSTATUS`: UInt = 1769580u;
public const val `IOCTL_SERIAL_GET_DTRRTS`: UInt = 1769592u;
public const val `IOCTL_SERIAL_GET_HANDFLOW`: UInt = 1769568u;
public const val `IOCTL_SERIAL_GET_LINE_CONTROL`: UInt = 1769556u;
public const val `IOCTL_SERIAL_GET_MODEMSTATUS`: UInt = 1769576u;
public const val `IOCTL_SERIAL_GET_MODEM_CONTROL`: UInt = 1769620u;
public const val `IOCTL_SERIAL_GET_PROPERTIES`: UInt = 1769588u;
public const val `IOCTL_SERIAL_GET_STATS`: UInt = 1769612u;
public const val `IOCTL_SERIAL_GET_TIMEOUTS`: UInt = 1769504u;
public const val `IOCTL_SERIAL_GET_WAIT_MASK`: UInt = 1769536u;
public const val `IOCTL_SERIAL_IMMEDIATE_CHAR`: UInt = 1769496u;
public const val `IOCTL_SERIAL_INTERNAL_BASIC_SETTINGS`: UInt = 1769484u;
public const val `IOCTL_SERIAL_INTERNAL_CANCEL_WAIT_WAKE`: UInt = 1769480u;
public const val `IOCTL_SERIAL_INTERNAL_DO_WAIT_WAKE`: UInt = 1769476u;
public const val `IOCTL_SERIAL_INTERNAL_RESTORE_SETTINGS`: UInt = 1769488u;
public const val `IOCTL_SERIAL_PURGE`: UInt = 1769548u;
public const val `IOCTL_SERIAL_RESET_DEVICE`: UInt = 1769516u;
public const val `IOCTL_SERIAL_SET_BAUD_RATE`: UInt = 1769476u;
public const val `IOCTL_SERIAL_SET_BREAK_OFF`: UInt = 1769492u;
public const val `IOCTL_SERIAL_SET_BREAK_ON`: UInt = 1769488u;
public const val `IOCTL_SERIAL_SET_CHARS`: UInt = 1769564u;
public const val `IOCTL_SERIAL_SET_COMMCONFIG`: UInt = 1769608u;
public const val `IOCTL_SERIAL_SET_DTR`: UInt = 1769508u;
public const val `IOCTL_SERIAL_SET_FIFO_CONTROL`: UInt = 1769628u;
public const val `IOCTL_SERIAL_SET_HANDFLOW`: UInt = 1769572u;
public const val `IOCTL_SERIAL_SET_INTERVAL_TIMER_RESOLUTION`: UInt = 1769636u;
public const val `IOCTL_SERIAL_SET_LINE_CONTROL`: UInt = 1769484u;
public const val `IOCTL_SERIAL_SET_MODEM_CONTROL`: UInt = 1769624u;
public const val `IOCTL_SERIAL_SET_QUEUE_SIZE`: UInt = 1769480u;
public const val `IOCTL_SERIAL_SET_RTS`: UInt = 1769520u;
public const val `IOCTL_SERIAL_SET_TIMEOUTS`: UInt = 1769500u;
public const val `IOCTL_SERIAL_SET_WAIT_MASK`: UInt = 1769540u;
public const val `IOCTL_SERIAL_SET_XOFF`: UInt = 1769528u;
public const val `IOCTL_SERIAL_SET_XON`: UInt = 1769532u;
public const val `IOCTL_SERIAL_WAIT_ON_MASK`: UInt = 1769544u;
public const val `IOCTL_SERIAL_XOFF_COUNTER`: UInt = 1769584u;
public const val `MARK_PARITY`: UInt = 3u;
public const val `NO_PARITY`: UInt = 0u;
public const val `ODD_PARITY`: UInt = 1u;
// UNSUPPORTED Rust 65:1: generic scalar type unsupported
// pub type PSERENUM_READPORT = Option<unsafe extern "system" fn(serportaddress: *const core::ffi::c_void) -> u8>;

// UNSUPPORTED Rust 66:1: generic scalar type unsupported
// pub type PSERENUM_WRITEPORT = Option<unsafe extern "system" fn(serportaddress: *const core::ffi::c_void, value: u8)>;

public typealias `SERENUM_PORTION` = Int;
// UNSUPPORTED Rust 68:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SERENUM_PORT_DESC {
//     pub Size: u32,
//     pub PortHandle: *mut core::ffi::c_void,
//     pub PortAddress: i64,
//     pub Reserved: [u16; 1],
// }

// UNSUPPORTED Rust 76:1: declaration Impl has no candidate rule
// impl Default for SERENUM_PORT_DESC {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 81:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SERENUM_PORT_PARAMETERS {
//     pub Size: u32,
//     pub ReadAccessor: PSERENUM_READPORT,
//     pub WriteAccessor: PSERENUM_WRITEPORT,
//     pub SerPortAddress: *mut core::ffi::c_void,
//     pub HardwareHandle: *mut core::ffi::c_void,
//     pub Portion: SERENUM_PORTION,
//     pub NumberAxis: u16,
//     pub Reserved: [u16; 3],
// }

// UNSUPPORTED Rust 93:1: declaration Impl has no candidate rule
// impl Default for SERENUM_PORT_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 98:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SERIALCONFIG {
//     pub Size: u32,
//     pub Version: u16,
//     pub SubType: u32,
//     pub ProvOffset: u32,
//     pub ProviderSize: u32,
//     pub ProviderData: [u16; 1],
// }

// UNSUPPORTED Rust 108:1: declaration Impl has no candidate rule
// impl Default for SERIALCONFIG {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 113:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERIALPERF_STATS {
//     pub ReceivedCount: u32,
//     pub TransmittedCount: u32,
//     pub FrameErrorCount: u32,
//     pub SerialOverrunErrorCount: u32,
//     pub BufferOverrunErrorCount: u32,
//     pub ParityErrorCount: u32,
// }

// UNSUPPORTED Rust 123:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERIAL_BASIC_SETTINGS {
//     pub Timeouts: SERIAL_TIMEOUTS,
//     pub HandFlow: SERIAL_HANDFLOW,
//     pub RxFifo: u32,
//     pub TxFifo: u32,
// }

// UNSUPPORTED Rust 131:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERIAL_BAUD_RATE {
//     pub BaudRate: u32,
// }

// UNSUPPORTED Rust 136:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERIAL_CHARS {
//     pub EofChar: u8,
//     pub ErrorChar: u8,
//     pub BreakChar: u8,
//     pub EventChar: u8,
//     pub XonChar: u8,
//     pub XoffChar: u8,
// }

// UNSUPPORTED Rust 146:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SERIAL_COMMPROP {
//     pub PacketLength: u16,
//     pub PacketVersion: u16,
//     pub ServiceMask: u32,
//     pub Reserved1: u32,
//     pub MaxTxQueue: u32,
//     pub MaxRxQueue: u32,
//     pub MaxBaud: u32,
//     pub ProvSubType: u32,
//     pub ProvCapabilities: u32,
//     pub SettableParams: u32,
//     pub SettableBaud: u32,
//     pub SettableData: u16,
//     pub SettableStopParity: u16,
//     pub CurrentTxQueue: u32,
//     pub CurrentRxQueue: u32,
//     pub ProvSpec1: u32,
//     pub ProvSpec2: u32,
//     pub ProvChar: [u16; 1],
// }

// UNSUPPORTED Rust 168:1: declaration Impl has no candidate rule
// impl Default for SERIAL_COMMPROP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SERIAL_EV_BREAK`: UInt = 64u;
public const val `SERIAL_EV_CTS`: UInt = 8u;
public const val `SERIAL_EV_DSR`: UInt = 16u;
public const val `SERIAL_EV_ERR`: UInt = 128u;
public const val `SERIAL_EV_EVENT1`: UInt = 2048u;
public const val `SERIAL_EV_EVENT2`: UInt = 4096u;
public const val `SERIAL_EV_PERR`: UInt = 512u;
public const val `SERIAL_EV_RING`: UInt = 256u;
public const val `SERIAL_EV_RLSD`: UInt = 32u;
public const val `SERIAL_EV_RX80FULL`: UInt = 1024u;
public const val `SERIAL_EV_RXCHAR`: UInt = 1u;
public const val `SERIAL_EV_RXFLAG`: UInt = 2u;
public const val `SERIAL_EV_TXEMPTY`: UInt = 4u;
// UNSUPPORTED Rust 186:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERIAL_HANDFLOW {
//     pub ControlHandShake: u32,
//     pub FlowReplace: u32,
//     pub XonLimit: i32,
//     pub XoffLimit: i32,
// }

// UNSUPPORTED Rust 194:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERIAL_LINE_CONTROL {
//     pub StopBits: u8,
//     pub Parity: u8,
//     pub WordLength: u8,
// }

public const val `SERIAL_LSRMST_ESCAPE`: UShort = 0u;
public const val `SERIAL_LSRMST_LSR_DATA`: UShort = 1u;
public const val `SERIAL_LSRMST_LSR_NODATA`: UShort = 2u;
public const val `SERIAL_LSRMST_MST`: UShort = 3u;
public const val `SERIAL_PURGE_RXABORT`: UInt = 2u;
public const val `SERIAL_PURGE_RXCLEAR`: UInt = 8u;
public const val `SERIAL_PURGE_TXABORT`: UInt = 1u;
public const val `SERIAL_PURGE_TXCLEAR`: UInt = 4u;
// UNSUPPORTED Rust 209:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERIAL_QUEUE_SIZE {
//     pub InSize: u32,
//     pub OutSize: u32,
// }

// UNSUPPORTED Rust 215:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERIAL_STATUS {
//     pub Errors: u32,
//     pub HoldReasons: u32,
//     pub AmountInInQueue: u32,
//     pub AmountInOutQueue: u32,
//     pub EofReceived: bool,
//     pub WaitForImmediate: bool,
// }

// UNSUPPORTED Rust 225:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERIAL_TIMEOUTS {
//     pub ReadIntervalTimeout: u32,
//     pub ReadTotalTimeoutMultiplier: u32,
//     pub ReadTotalTimeoutConstant: u32,
//     pub WriteTotalTimeoutMultiplier: u32,
//     pub WriteTotalTimeoutConstant: u32,
// }

// UNSUPPORTED Rust 234:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SERIAL_XOFF_COUNTER {
//     pub Timeout: u32,
//     pub Counter: i32,
//     pub XoffChar: u8,
// }

public const val `SPACE_PARITY`: UInt = 4u;
public const val `STOP_BITS_1_5`: UInt = 1u;
public const val `STOP_BITS_2`: UInt = 2u;
public const val `STOP_BIT_1`: UInt = 0u;
public const val `SerenumFirstHalf`: `SERENUM_PORTION` = 0;
public const val `SerenumSecondHalf`: `SERENUM_PORTION` = 1;
public const val `SerenumWhole`: `SERENUM_PORTION` = 2;
