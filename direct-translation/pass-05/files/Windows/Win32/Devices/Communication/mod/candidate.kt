// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=BuildCommDCBA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `BuildCommDCBA`(`lpdef` : `windows_sys`.`core`.`PCSTR`, `lpdcb` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DCB`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=BuildCommDCBAndTimeoutsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `BuildCommDCBAndTimeoutsA`(`lpdef` : `windows_sys`.`core`.`PCSTR`, `lpdcb` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DCB`>?, `lpcommtimeouts` : /* Rust *mut */ kotlinx.cinterop.CPointer<`COMMTIMEOUTS`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=BuildCommDCBAndTimeoutsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `BuildCommDCBAndTimeoutsW`(`lpdef` : `windows_sys`.`core`.`PCWSTR`, `lpdcb` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DCB`>?, `lpcommtimeouts` : /* Rust *mut */ kotlinx.cinterop.CPointer<`COMMTIMEOUTS`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=BuildCommDCBW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `BuildCommDCBW`(`lpdef` : `windows_sys`.`core`.`PCWSTR`, `lpdcb` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DCB`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=ClearCommBreak; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ClearCommBreak`(`hfile` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=ClearCommError; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ClearCommError`(`hfile` : `super`.`super`.`Foundation`.`HANDLE`, `lperrors` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CLEAR_COMM_ERROR_FLAGS`>?, `lpstat` : /* Rust *mut */ kotlinx.cinterop.CPointer<`COMSTAT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=CommConfigDialogA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CommConfigDialogA`(`lpszname` : `windows_sys`.`core`.`PCSTR`, `hwnd` : `super`.`super`.`Foundation`.`HWND`, `lpcc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`COMMCONFIG`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=CommConfigDialogW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CommConfigDialogW`(`lpszname` : `windows_sys`.`core`.`PCWSTR`, `hwnd` : `super`.`super`.`Foundation`.`HWND`, `lpcc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`COMMCONFIG`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=EscapeCommFunction; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EscapeCommFunction`(`hfile` : `super`.`super`.`Foundation`.`HANDLE`, `dwfunc` : `ESCAPE_COMM_FUNCTION`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetCommConfig; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetCommConfig`(`hcommdev` : `super`.`super`.`Foundation`.`HANDLE`, `lpcc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`COMMCONFIG`>?, `lpdwsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetCommMask; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetCommMask`(`hfile` : `super`.`super`.`Foundation`.`HANDLE`, `lpevtmask` : /* Rust *mut */ kotlinx.cinterop.CPointer<`COMM_EVENT_MASK`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetCommModemStatus; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetCommModemStatus`(`hfile` : `super`.`super`.`Foundation`.`HANDLE`, `lpmodemstat` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MODEM_STATUS_FLAGS`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-comm-l1-1-2.dll, ABI=system, export=GetCommPorts; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetCommPorts`(`lpportnumbers` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `uportnumberscount` : UInt, `puportnumbersfound` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetCommProperties; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetCommProperties`(`hfile` : `super`.`super`.`Foundation`.`HANDLE`, `lpcommprop` : /* Rust *mut */ kotlinx.cinterop.CPointer<`COMMPROP`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetCommState; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetCommState`(`hfile` : `super`.`super`.`Foundation`.`HANDLE`, `lpdcb` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DCB`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetCommTimeouts; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetCommTimeouts`(`hfile` : `super`.`super`.`Foundation`.`HANDLE`, `lpcommtimeouts` : /* Rust *mut */ kotlinx.cinterop.CPointer<`COMMTIMEOUTS`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetDefaultCommConfigA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetDefaultCommConfigA`(`lpszname` : `windows_sys`.`core`.`PCSTR`, `lpcc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`COMMCONFIG`>?, `lpdwsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetDefaultCommConfigW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetDefaultCommConfigW`(`lpszname` : `windows_sys`.`core`.`PCWSTR`, `lpcc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`COMMCONFIG`>?, `lpdwsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-comm-l1-1-1.dll, ABI=system, export=OpenCommPort; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OpenCommPort`(`uportnumber` : UInt, `dwdesiredaccess` : UInt, `dwflagsandattributes` : UInt) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=PurgeComm; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PurgeComm`(`hfile` : `super`.`super`.`Foundation`.`HANDLE`, `dwflags` : `PURGE_COMM_FLAGS`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=SetCommBreak; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetCommBreak`(`hfile` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=SetCommConfig; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetCommConfig`(`hcommdev` : `super`.`super`.`Foundation`.`HANDLE`, `lpcc` : /* Rust *const */ kotlinx.cinterop.CPointer<`COMMCONFIG`>?, `dwsize` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=SetCommMask; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetCommMask`(`hfile` : `super`.`super`.`Foundation`.`HANDLE`, `dwevtmask` : `COMM_EVENT_MASK`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=SetCommState; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetCommState`(`hfile` : `super`.`super`.`Foundation`.`HANDLE`, `lpdcb` : /* Rust *const */ kotlinx.cinterop.CPointer<`DCB`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=SetCommTimeouts; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetCommTimeouts`(`hfile` : `super`.`super`.`Foundation`.`HANDLE`, `lpcommtimeouts` : /* Rust *const */ kotlinx.cinterop.CPointer<`COMMTIMEOUTS`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=SetDefaultCommConfigA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetDefaultCommConfigA`(`lpszname` : `windows_sys`.`core`.`PCSTR`, `lpcc` : /* Rust *const */ kotlinx.cinterop.CPointer<`COMMCONFIG`>?, `dwsize` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=SetDefaultCommConfigW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetDefaultCommConfigW`(`lpszname` : `windows_sys`.`core`.`PCWSTR`, `lpcc` : /* Rust *const */ kotlinx.cinterop.CPointer<`COMMCONFIG`>?, `dwsize` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=SetupComm; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetupComm`(`hfile` : `super`.`super`.`Foundation`.`HANDLE`, `dwinqueue` : UInt, `dwoutqueue` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=TransmitCommChar; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TransmitCommChar`(`hfile` : `super`.`super`.`Foundation`.`HANDLE`, `cchar` : Byte) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=WaitCommEvent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `WaitCommEvent`(`hfile` : `super`.`super`.`Foundation`.`HANDLE`, `lpevtmask` : /* Rust *mut */ kotlinx.cinterop.CPointer<`COMM_EVENT_MASK`>?, `lpoverlapped` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : `windows_sys`.`core`.`BOOL`
public const val `CE_BREAK`: `CLEAR_COMM_ERROR_FLAGS` = 16u;
public const val `CE_FRAME`: `CLEAR_COMM_ERROR_FLAGS` = 8u;
public const val `CE_OVERRUN`: `CLEAR_COMM_ERROR_FLAGS` = 2u;
public const val `CE_RXOVER`: `CLEAR_COMM_ERROR_FLAGS` = 1u;
public const val `CE_RXPARITY`: `CLEAR_COMM_ERROR_FLAGS` = 4u;
public typealias `CLEAR_COMM_ERROR_FLAGS` = UInt;
public const val `CLRBREAK`: `ESCAPE_COMM_FUNCTION` = 9u;
public const val `CLRDTR`: `ESCAPE_COMM_FUNCTION` = 6u;
public const val `CLRRTS`: `ESCAPE_COMM_FUNCTION` = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `COMMCONFIG` (
    public var `dwSize`: UInt,
    public var `wVersion`: UShort,
    public var `wReserved`: UShort,
    public var `dcb`: `DCB`,
    public var `dwProviderSubType`: UInt,
    public var `dwProviderOffset`: UInt,
    public var `dwProviderSize`: UInt,
    public var `wcProviderData`: UShortArray,
)
// UNSUPPORTED Rust 53:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for COMMCONFIG {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `COMMPROP` (
    public var `wPacketLength`: UShort,
    public var `wPacketVersion`: UShort,
    public var `dwServiceMask`: UInt,
    public var `dwReserved1`: UInt,
    public var `dwMaxTxQueue`: UInt,
    public var `dwMaxRxQueue`: UInt,
    public var `dwMaxBaud`: UInt,
    public var `dwProvSubType`: UInt,
    public var `dwProvCapabilities`: UInt,
    public var `dwSettableParams`: UInt,
    public var `dwSettableBaud`: UInt,
    public var `wSettableData`: UShort,
    public var `wSettableStopParity`: `COMMPROP_STOP_PARITY`,
    public var `dwCurrentTxQueue`: UInt,
    public var `dwCurrentRxQueue`: UInt,
    public var `dwProvSpec1`: UInt,
    public var `dwProvSpec2`: UInt,
    public var `wcProvChar`: UShortArray,
)
// UNSUPPORTED Rust 80:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for COMMPROP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `COMMPROP_STOP_PARITY` = UShort;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `COMMTIMEOUTS` (
    public var `ReadIntervalTimeout`: UInt,
    public var `ReadTotalTimeoutMultiplier`: UInt,
    public var `ReadTotalTimeoutConstant`: UInt,
    public var `WriteTotalTimeoutMultiplier`: UInt,
    public var `WriteTotalTimeoutConstant`: UInt,
)
public typealias `COMM_EVENT_MASK` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `COMSTAT` (
    public var `_bitfield`: UInt,
    public var `cbInQue`: UInt,
    public var `cbOutQue`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DCB` (
    public var `DCBlength`: UInt,
    public var `BaudRate`: UInt,
    public var `_bitfield`: UInt,
    public var `wReserved`: UShort,
    public var `XonLim`: UShort,
    public var `XoffLim`: UShort,
    public var `ByteSize`: UByte,
    public var `Parity`: `DCB_PARITY`,
    public var `StopBits`: `DCB_STOP_BITS`,
    public var `XonChar`: Byte,
    public var `XoffChar`: Byte,
    public var `ErrorChar`: Byte,
    public var `EofChar`: Byte,
    public var `EvtChar`: Byte,
    public var `wReserved1`: UShort,
)
public typealias `DCB_PARITY` = UByte;
public typealias `DCB_STOP_BITS` = UByte;
public const val `DIALOPTION_BILLING`: `MODEMDEVCAPS_DIAL_OPTIONS` = 64u;
public const val `DIALOPTION_DIALTONE`: `MODEMDEVCAPS_DIAL_OPTIONS` = 256u;
public const val `DIALOPTION_QUIET`: `MODEMDEVCAPS_DIAL_OPTIONS` = 128u;
public typealias `ESCAPE_COMM_FUNCTION` = UInt;
public const val `EVENPARITY`: `DCB_PARITY` = 2u;
public const val `EV_BREAK`: `COMM_EVENT_MASK` = 64u;
public const val `EV_CTS`: `COMM_EVENT_MASK` = 8u;
public const val `EV_DSR`: `COMM_EVENT_MASK` = 16u;
public const val `EV_ERR`: `COMM_EVENT_MASK` = 128u;
public const val `EV_EVENT1`: `COMM_EVENT_MASK` = 2048u;
public const val `EV_EVENT2`: `COMM_EVENT_MASK` = 4096u;
public const val `EV_PERR`: `COMM_EVENT_MASK` = 512u;
public const val `EV_RING`: `COMM_EVENT_MASK` = 256u;
public const val `EV_RLSD`: `COMM_EVENT_MASK` = 32u;
public const val `EV_RX80FULL`: `COMM_EVENT_MASK` = 1024u;
public const val `EV_RXCHAR`: `COMM_EVENT_MASK` = 1u;
public const val `EV_RXFLAG`: `COMM_EVENT_MASK` = 2u;
public const val `EV_TXEMPTY`: `COMM_EVENT_MASK` = 4u;
public const val `MARKPARITY`: `DCB_PARITY` = 3u;
public const val `MAXLENGTH_NAI`: UInt = 72u;
public const val `MAXLENGTH_UICCDATASTORE`: UInt = 10u;
public const val `MDMSPKRFLAG_CALLSETUP`: `MODEMDEVCAPS_SPEAKER_MODE` = 8u;
public const val `MDMSPKRFLAG_DIAL`: `MODEMDEVCAPS_SPEAKER_MODE` = 2u;
public const val `MDMSPKRFLAG_OFF`: `MODEMDEVCAPS_SPEAKER_MODE` = 1u;
public const val `MDMSPKRFLAG_ON`: `MODEMDEVCAPS_SPEAKER_MODE` = 4u;
public const val `MDMSPKR_CALLSETUP`: `MODEMSETTINGS_SPEAKER_MODE` = 8u;
public const val `MDMSPKR_DIAL`: `MODEMSETTINGS_SPEAKER_MODE` = 2u;
public const val `MDMSPKR_OFF`: `MODEMSETTINGS_SPEAKER_MODE` = 1u;
public const val `MDMSPKR_ON`: `MODEMSETTINGS_SPEAKER_MODE` = 4u;
public const val `MDMVOLFLAG_HIGH`: `MODEMDEVCAPS_SPEAKER_VOLUME` = 4u;
public const val `MDMVOLFLAG_LOW`: `MODEMDEVCAPS_SPEAKER_VOLUME` = 1u;
public const val `MDMVOLFLAG_MEDIUM`: `MODEMDEVCAPS_SPEAKER_VOLUME` = 2u;
public const val `MDMVOL_HIGH`: `MODEM_SPEAKER_VOLUME` = 2u;
public const val `MDMVOL_LOW`: `MODEM_SPEAKER_VOLUME` = 0u;
public const val `MDMVOL_MEDIUM`: `MODEM_SPEAKER_VOLUME` = 1u;
public const val `MDM_ANALOG_RLP_OFF`: UInt = 1u;
public const val `MDM_ANALOG_RLP_ON`: UInt = 0u;
public const val `MDM_ANALOG_V34`: UInt = 2u;
public const val `MDM_AUTO_ML_2`: UInt = 2u;
public const val `MDM_AUTO_ML_DEFAULT`: UInt = 0u;
public const val `MDM_AUTO_ML_NONE`: UInt = 1u;
public const val `MDM_AUTO_SPEED_DEFAULT`: UInt = 0u;
public const val `MDM_BEARERMODE_ANALOG`: UInt = 0u;
public const val `MDM_BEARERMODE_GSM`: UInt = 2u;
public const val `MDM_BEARERMODE_ISDN`: UInt = 1u;
public const val `MDM_BLIND_DIAL`: UInt = 512u;
public const val `MDM_CCITT_OVERRIDE`: UInt = 64u;
public const val `MDM_CELLULAR`: UInt = 8u;
public const val `MDM_COMPRESSION`: UInt = 1u;
public const val `MDM_DIAGNOSTICS`: UInt = 2048u;
public const val `MDM_ERROR_CONTROL`: UInt = 2u;
public const val `MDM_FLOWCONTROL_HARD`: UInt = 16u;
public const val `MDM_FLOWCONTROL_SOFT`: UInt = 32u;
public const val `MDM_FORCED_EC`: UInt = 4u;
public const val `MDM_HDLCPPP_AUTH_CHAP`: UInt = 3u;
public const val `MDM_HDLCPPP_AUTH_DEFAULT`: UInt = 0u;
public const val `MDM_HDLCPPP_AUTH_MSCHAP`: UInt = 4u;
public const val `MDM_HDLCPPP_AUTH_NONE`: UInt = 1u;
public const val `MDM_HDLCPPP_AUTH_PAP`: UInt = 2u;
public const val `MDM_HDLCPPP_ML_2`: UInt = 2u;
public const val `MDM_HDLCPPP_ML_DEFAULT`: UInt = 0u;
public const val `MDM_HDLCPPP_ML_NONE`: UInt = 1u;
public const val `MDM_HDLCPPP_SPEED_56K`: UInt = 2u;
public const val `MDM_HDLCPPP_SPEED_64K`: UInt = 1u;
public const val `MDM_HDLCPPP_SPEED_DEFAULT`: UInt = 0u;
public const val `MDM_MASK_AUTO_SPEED`: UInt = 7u;
public const val `MDM_MASK_BEARERMODE`: UInt = 61440u;
public const val `MDM_MASK_HDLCPPP_SPEED`: UInt = 7u;
public const val `MDM_MASK_PROTOCOLDATA`: UInt = 267386880u;
public const val `MDM_MASK_PROTOCOLID`: UInt = 983040u;
public const val `MDM_MASK_V110_SPEED`: UInt = 15u;
public const val `MDM_MASK_V120_SPEED`: UInt = 7u;
public const val `MDM_MASK_X75_DATA`: UInt = 7u;
public const val `MDM_PIAFS_INCOMING`: UInt = 0u;
public const val `MDM_PIAFS_OUTGOING`: UInt = 1u;
public const val `MDM_PROTOCOLID_ANALOG`: UInt = 7u;
public const val `MDM_PROTOCOLID_AUTO`: UInt = 6u;
public const val `MDM_PROTOCOLID_DEFAULT`: UInt = 0u;
public const val `MDM_PROTOCOLID_GPRS`: UInt = 8u;
public const val `MDM_PROTOCOLID_HDLCPPP`: UInt = 1u;
public const val `MDM_PROTOCOLID_PIAFS`: UInt = 9u;
public const val `MDM_PROTOCOLID_V110`: UInt = 4u;
public const val `MDM_PROTOCOLID_V120`: UInt = 5u;
public const val `MDM_PROTOCOLID_V128`: UInt = 2u;
public const val `MDM_PROTOCOLID_X75`: UInt = 3u;
public const val `MDM_SHIFT_AUTO_ML`: UInt = 6u;
public const val `MDM_SHIFT_AUTO_SPEED`: UInt = 0u;
public const val `MDM_SHIFT_BEARERMODE`: UInt = 12u;
public const val `MDM_SHIFT_EXTENDEDINFO`: UInt = 12u;
public const val `MDM_SHIFT_HDLCPPP_AUTH`: UInt = 3u;
public const val `MDM_SHIFT_HDLCPPP_ML`: UInt = 6u;
public const val `MDM_SHIFT_HDLCPPP_SPEED`: UInt = 0u;
public const val `MDM_SHIFT_PROTOCOLDATA`: UInt = 20u;
public const val `MDM_SHIFT_PROTOCOLID`: UInt = 16u;
public const val `MDM_SHIFT_PROTOCOLINFO`: UInt = 16u;
public const val `MDM_SHIFT_V110_SPEED`: UInt = 0u;
public const val `MDM_SHIFT_V120_ML`: UInt = 6u;
public const val `MDM_SHIFT_V120_SPEED`: UInt = 0u;
public const val `MDM_SHIFT_X75_DATA`: UInt = 0u;
public const val `MDM_SPEED_ADJUST`: UInt = 128u;
public const val `MDM_TONE_DIAL`: UInt = 256u;
public const val `MDM_V110_SPEED_12DOT0K`: UInt = 5u;
public const val `MDM_V110_SPEED_14DOT4K`: UInt = 6u;
public const val `MDM_V110_SPEED_19DOT2K`: UInt = 7u;
public const val `MDM_V110_SPEED_1DOT2K`: UInt = 1u;
public const val `MDM_V110_SPEED_28DOT8K`: UInt = 8u;
public const val `MDM_V110_SPEED_2DOT4K`: UInt = 2u;
public const val `MDM_V110_SPEED_38DOT4K`: UInt = 9u;
public const val `MDM_V110_SPEED_4DOT8K`: UInt = 3u;
public const val `MDM_V110_SPEED_57DOT6K`: UInt = 10u;
public const val `MDM_V110_SPEED_9DOT6K`: UInt = 4u;
public const val `MDM_V110_SPEED_DEFAULT`: UInt = 0u;
public const val `MDM_V120_ML_2`: UInt = 2u;
public const val `MDM_V120_ML_DEFAULT`: UInt = 0u;
public const val `MDM_V120_ML_NONE`: UInt = 1u;
public const val `MDM_V120_SPEED_56K`: UInt = 2u;
public const val `MDM_V120_SPEED_64K`: UInt = 1u;
public const val `MDM_V120_SPEED_DEFAULT`: UInt = 0u;
public const val `MDM_V23_OVERRIDE`: UInt = 1024u;
public const val `MDM_X75_DATA_128K`: UInt = 2u;
public const val `MDM_X75_DATA_64K`: UInt = 1u;
public const val `MDM_X75_DATA_BTX`: UInt = 4u;
public const val `MDM_X75_DATA_DEFAULT`: UInt = 0u;
public const val `MDM_X75_DATA_T_70`: UInt = 3u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MODEMDEVCAPS` (
    public var `dwActualSize`: UInt,
    public var `dwRequiredSize`: UInt,
    public var `dwDevSpecificOffset`: UInt,
    public var `dwDevSpecificSize`: UInt,
    public var `dwModemProviderVersion`: UInt,
    public var `dwModemManufacturerOffset`: UInt,
    public var `dwModemManufacturerSize`: UInt,
    public var `dwModemModelOffset`: UInt,
    public var `dwModemModelSize`: UInt,
    public var `dwModemVersionOffset`: UInt,
    public var `dwModemVersionSize`: UInt,
    public var `dwDialOptions`: `MODEMDEVCAPS_DIAL_OPTIONS`,
    public var `dwCallSetupFailTimer`: UInt,
    public var `dwInactivityTimeout`: UInt,
    public var `dwSpeakerVolume`: `MODEMDEVCAPS_SPEAKER_VOLUME`,
    public var `dwSpeakerMode`: `MODEMDEVCAPS_SPEAKER_MODE`,
    public var `dwModemOptions`: UInt,
    public var `dwMaxDTERate`: UInt,
    public var `dwMaxDCERate`: UInt,
    public var `abVariablePortion`: UByteArray,
)
// UNSUPPORTED Rust 272:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MODEMDEVCAPS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `MODEMDEVCAPS_DIAL_OPTIONS` = UInt;
public typealias `MODEMDEVCAPS_SPEAKER_MODE` = UInt;
public typealias `MODEMDEVCAPS_SPEAKER_VOLUME` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MODEMSETTINGS` (
    public var `dwActualSize`: UInt,
    public var `dwRequiredSize`: UInt,
    public var `dwDevSpecificOffset`: UInt,
    public var `dwDevSpecificSize`: UInt,
    public var `dwCallSetupFailTimer`: UInt,
    public var `dwInactivityTimeout`: UInt,
    public var `dwSpeakerVolume`: `MODEM_SPEAKER_VOLUME`,
    public var `dwSpeakerMode`: `MODEMSETTINGS_SPEAKER_MODE`,
    public var `dwPreferredModemOptions`: UInt,
    public var `dwNegotiatedModemOptions`: UInt,
    public var `dwNegotiatedDCERate`: UInt,
    public var `abVariablePortion`: UByteArray,
)
// UNSUPPORTED Rust 296:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MODEMSETTINGS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `MODEMSETTINGS_SPEAKER_MODE` = UInt;
public typealias `MODEM_SPEAKER_VOLUME` = UInt;
public typealias `MODEM_STATUS_FLAGS` = UInt;
public const val `MS_CTS_ON`: `MODEM_STATUS_FLAGS` = 16u;
public const val `MS_DSR_ON`: `MODEM_STATUS_FLAGS` = 32u;
public const val `MS_RING_ON`: `MODEM_STATUS_FLAGS` = 64u;
public const val `MS_RLSD_ON`: `MODEM_STATUS_FLAGS` = 128u;
public const val `NOPARITY`: `DCB_PARITY` = 0u;
public const val `ODDPARITY`: `DCB_PARITY` = 1u;
public const val `ONE5STOPBITS`: `DCB_STOP_BITS` = 1u;
public const val `ONESTOPBIT`: `DCB_STOP_BITS` = 0u;
public const val `PARITY_EVEN`: `COMMPROP_STOP_PARITY` = 1024u;
public const val `PARITY_MARK`: `COMMPROP_STOP_PARITY` = 2048u;
public const val `PARITY_NONE`: `COMMPROP_STOP_PARITY` = 256u;
public const val `PARITY_ODD`: `COMMPROP_STOP_PARITY` = 512u;
public const val `PARITY_SPACE`: `COMMPROP_STOP_PARITY` = 4096u;
public typealias `PURGE_COMM_FLAGS` = UInt;
public const val `PURGE_RXABORT`: `PURGE_COMM_FLAGS` = 2u;
public const val `PURGE_RXCLEAR`: `PURGE_COMM_FLAGS` = 8u;
public const val `PURGE_TXABORT`: `PURGE_COMM_FLAGS` = 1u;
public const val `PURGE_TXCLEAR`: `PURGE_COMM_FLAGS` = 4u;
public const val `SETBREAK`: `ESCAPE_COMM_FUNCTION` = 8u;
public const val `SETDTR`: `ESCAPE_COMM_FUNCTION` = 5u;
public const val `SETRTS`: `ESCAPE_COMM_FUNCTION` = 3u;
public const val `SETXOFF`: `ESCAPE_COMM_FUNCTION` = 1u;
public const val `SETXON`: `ESCAPE_COMM_FUNCTION` = 2u;
// UNSUPPORTED Rust 327:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const SID_3GPP_SUPSVCMODEL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd7d08e07_d767_4478_b14a_eecc87ea12f7);

public const val `SPACEPARITY`: `DCB_PARITY` = 4u;
public const val `STOPBITS_10`: `COMMPROP_STOP_PARITY` = 1u;
public const val `STOPBITS_15`: `COMMPROP_STOP_PARITY` = 2u;
public const val `STOPBITS_20`: `COMMPROP_STOP_PARITY` = 4u;
public const val `TWOSTOPBITS`: `DCB_STOP_BITS` = 2u;
