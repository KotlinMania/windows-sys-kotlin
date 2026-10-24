// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msports.dll, ABI=system, export=ComDBClaimNextFreePort; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ComDBClaimNextFreePort`(`hcomdb` : `HCOMDB`, `comnumber` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msports.dll, ABI=system, export=ComDBClaimPort; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ComDBClaimPort`(`hcomdb` : `HCOMDB`, `comnumber` : UInt, `forceclaim` : `windows_sys`.`core`.`BOOL`, `forced` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msports.dll, ABI=system, export=ComDBClose; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ComDBClose`(`hcomdb` : `HCOMDB`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msports.dll, ABI=system, export=ComDBGetCurrentPortUsage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ComDBGetCurrentPortUsage`(`hcomdb` : `HCOMDB`, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `buffersize` : UInt, `reporttype` : UInt, `maxportsreported` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msports.dll, ABI=system, export=ComDBOpen; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ComDBOpen`(`phcomdb` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HCOMDB`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msports.dll, ABI=system, export=ComDBReleasePort; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ComDBReleasePort`(`hcomdb` : `HCOMDB`, `comnumber` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=msports.dll, ABI=system, export=ComDBResizeDatabase; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ComDBResizeDatabase`(`hcomdb` : `HCOMDB`, `newsize` : UInt) : Int
public const val `CDB_REPORT_BITS`: UInt = 0u;
public const val `CDB_REPORT_BYTES`: UInt = 1u;
public const val `COMDB_MAX_PORTS_ARBITRATED`: UInt = 4096u;
public const val `COMDB_MIN_PORTS_ARBITRATED`: UInt = 256u;
// UNSUPPORTED Rust 12:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: no per-file syntax rule for Const
// pub const DEVPKEY_DeviceInterface_Serial_PortName: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x4c6bf15c_4c03_4aac_91f5_64c0f852bcf4), pid: 4 };

// UNSUPPORTED Rust 13:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: no per-file syntax rule for Const
// pub const DEVPKEY_DeviceInterface_Serial_UsbProductId: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x4c6bf15c_4c03_4aac_91f5_64c0f852bcf4), pid: 3 };

// UNSUPPORTED Rust 14:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: no per-file syntax rule for Const
// pub const DEVPKEY_DeviceInterface_Serial_UsbVendorId: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x4c6bf15c_4c03_4aac_91f5_64c0f852bcf4), pid: 2 };

public const val `EVEN_PARITY`: UInt = 2u;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HCOMDB` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
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
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PSERENUM_READPORT` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> UByte>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PSERENUM_WRITEPORT` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UByte) -> Unit>>>;
public typealias `SERENUM_PORTION` = Int;
// UNSUPPORTED Rust 68:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SERENUM_PORT_DESC {
//     pub Size: u32,
//     pub PortHandle: *mut core::ffi::c_void,
//     pub PortAddress: i64,
//     pub Reserved: [u16; 1],
// }

// UNSUPPORTED Rust 76:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SERENUM_PORT_DESC {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 81:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
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

// UNSUPPORTED Rust 93:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SERENUM_PORT_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 98:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
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

// UNSUPPORTED Rust 108:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SERIALCONFIG {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SERIALPERF_STATS` (
    public var `ReceivedCount`: UInt,
    public var `TransmittedCount`: UInt,
    public var `FrameErrorCount`: UInt,
    public var `SerialOverrunErrorCount`: UInt,
    public var `BufferOverrunErrorCount`: UInt,
    public var `ParityErrorCount`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SERIAL_BASIC_SETTINGS` (
    public var `Timeouts`: `SERIAL_TIMEOUTS`,
    public var `HandFlow`: `SERIAL_HANDFLOW`,
    public var `RxFifo`: UInt,
    public var `TxFifo`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SERIAL_BAUD_RATE` (
    public var `BaudRate`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SERIAL_CHARS` (
    public var `EofChar`: UByte,
    public var `ErrorChar`: UByte,
    public var `BreakChar`: UByte,
    public var `EventChar`: UByte,
    public var `XonChar`: UByte,
    public var `XoffChar`: UByte,
)
// UNSUPPORTED Rust 146:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
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

// UNSUPPORTED Rust 168:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SERIAL_HANDFLOW` (
    public var `ControlHandShake`: UInt,
    public var `FlowReplace`: UInt,
    public var `XonLimit`: Int,
    public var `XoffLimit`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SERIAL_LINE_CONTROL` (
    public var `StopBits`: UByte,
    public var `Parity`: UByte,
    public var `WordLength`: UByte,
)
public const val `SERIAL_LSRMST_ESCAPE`: UShort = 0u;
public const val `SERIAL_LSRMST_LSR_DATA`: UShort = 1u;
public const val `SERIAL_LSRMST_LSR_NODATA`: UShort = 2u;
public const val `SERIAL_LSRMST_MST`: UShort = 3u;
public const val `SERIAL_PURGE_RXABORT`: UInt = 2u;
public const val `SERIAL_PURGE_RXCLEAR`: UInt = 8u;
public const val `SERIAL_PURGE_TXABORT`: UInt = 1u;
public const val `SERIAL_PURGE_TXCLEAR`: UInt = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SERIAL_QUEUE_SIZE` (
    public var `InSize`: UInt,
    public var `OutSize`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SERIAL_STATUS` (
    public var `Errors`: UInt,
    public var `HoldReasons`: UInt,
    public var `AmountInInQueue`: UInt,
    public var `AmountInOutQueue`: UInt,
    public var `EofReceived`: Boolean,
    public var `WaitForImmediate`: Boolean,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SERIAL_TIMEOUTS` (
    public var `ReadIntervalTimeout`: UInt,
    public var `ReadTotalTimeoutMultiplier`: UInt,
    public var `ReadTotalTimeoutConstant`: UInt,
    public var `WriteTotalTimeoutMultiplier`: UInt,
    public var `WriteTotalTimeoutConstant`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SERIAL_XOFF_COUNTER` (
    public var `Timeout`: UInt,
    public var `Counter`: Int,
    public var `XoffChar`: UByte,
)
public const val `SPACE_PARITY`: UInt = 4u;
public const val `STOP_BITS_1_5`: UInt = 1u;
public const val `STOP_BITS_2`: UInt = 2u;
public const val `STOP_BIT_1`: UInt = 0u;
public const val `SerenumFirstHalf`: `SERENUM_PORTION` = 0;
public const val `SerenumSecondHalf`: `SERENUM_PORTION` = 1;
public const val `SerenumWhole`: `SERENUM_PORTION` = 2;
