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
// UNSUPPORTED Rust 12:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_DeviceInterface_Serial_PortName: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x4c6bf15c_4c03_4aac_91f5_64c0f852bcf4), pid: 4 };

// UNSUPPORTED Rust 13:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_DeviceInterface_Serial_UsbProductId: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0x4c6bf15c_4c03_4aac_91f5_64c0f852bcf4), pid: 3 };

// UNSUPPORTED Rust 14:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SERENUM_PORT_DESC` (
    public var `Size`: UInt,
    public var `PortHandle`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `PortAddress`: Long,
    public var `Reserved`: UShortArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `SERENUM_PORT_DESC`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `SERENUM_PORT_DESC`.Companion.`default`() : `SERENUM_PORT_DESC` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SERENUM_PORT_PARAMETERS` (
    public var `Size`: UInt,
    public var `ReadAccessor`: `PSERENUM_READPORT`,
    public var `WriteAccessor`: `PSERENUM_WRITEPORT`,
    public var `SerPortAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `HardwareHandle`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Portion`: `SERENUM_PORTION`,
    public var `NumberAxis`: UShort,
    public var `Reserved`: UShortArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `SERENUM_PORT_PARAMETERS`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `SERENUM_PORT_PARAMETERS`.Companion.`default`() : `SERENUM_PORT_PARAMETERS` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SERIALCONFIG` (
    public var `Size`: UInt,
    public var `Version`: UShort,
    public var `SubType`: UInt,
    public var `ProvOffset`: UInt,
    public var `ProviderSize`: UInt,
    public var `ProviderData`: UShortArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `SERIALCONFIG`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `SERIALCONFIG`.Companion.`default`() : `SERIALCONFIG` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SERIAL_COMMPROP` (
    public var `PacketLength`: UShort,
    public var `PacketVersion`: UShort,
    public var `ServiceMask`: UInt,
    public var `Reserved1`: UInt,
    public var `MaxTxQueue`: UInt,
    public var `MaxRxQueue`: UInt,
    public var `MaxBaud`: UInt,
    public var `ProvSubType`: UInt,
    public var `ProvCapabilities`: UInt,
    public var `SettableParams`: UInt,
    public var `SettableBaud`: UInt,
    public var `SettableData`: UShort,
    public var `SettableStopParity`: UShort,
    public var `CurrentTxQueue`: UInt,
    public var `CurrentRxQueue`: UInt,
    public var `ProvSpec1`: UInt,
    public var `ProvSpec2`: UInt,
    public var `ProvChar`: UShortArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `SERIAL_COMMPROP`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `SERIAL_COMMPROP`.Companion.`default`() : `SERIAL_COMMPROP` {
        return run { `core`.`mem`.`zeroed`() }
    }

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
