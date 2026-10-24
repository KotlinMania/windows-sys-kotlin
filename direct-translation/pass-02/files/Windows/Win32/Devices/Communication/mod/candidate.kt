// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn BuildCommDCBA(lpdef : windows_sys::core::PCSTR, lpdcb : *mut DCB) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn BuildCommDCBAndTimeoutsA(lpdef : windows_sys::core::PCSTR, lpdcb : *mut DCB, lpcommtimeouts : *mut COMMTIMEOUTS) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn BuildCommDCBAndTimeoutsW(lpdef : windows_sys::core::PCWSTR, lpdcb : *mut DCB, lpcommtimeouts : *mut COMMTIMEOUTS) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn BuildCommDCBW(lpdef : windows_sys::core::PCWSTR, lpdcb : *mut DCB) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn ClearCommBreak(hfile : super::super::Foundation:: HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn ClearCommError(hfile : super::super::Foundation:: HANDLE, lperrors : *mut CLEAR_COMM_ERROR_FLAGS, lpstat : *mut COMSTAT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn CommConfigDialogA(lpszname : windows_sys::core::PCSTR, hwnd : super::super::Foundation:: HWND, lpcc : *mut COMMCONFIG) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn CommConfigDialogW(lpszname : windows_sys::core::PCWSTR, hwnd : super::super::Foundation:: HWND, lpcc : *mut COMMCONFIG) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn EscapeCommFunction(hfile : super::super::Foundation:: HANDLE, dwfunc : ESCAPE_COMM_FUNCTION) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetCommConfig(hcommdev : super::super::Foundation:: HANDLE, lpcc : *mut COMMCONFIG, lpdwsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetCommMask(hfile : super::super::Foundation:: HANDLE, lpevtmask : *mut COMM_EVENT_MASK) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetCommModemStatus(hfile : super::super::Foundation:: HANDLE, lpmodemstat : *mut MODEM_STATUS_FLAGS) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-core-comm-l1-1-2.dll" "system" fn GetCommPorts(lpportnumbers : *mut u32, uportnumberscount : u32, puportnumbersfound : *mut u32) -> u32);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetCommProperties(hfile : super::super::Foundation:: HANDLE, lpcommprop : *mut COMMPROP) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetCommState(hfile : super::super::Foundation:: HANDLE, lpdcb : *mut DCB) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetCommTimeouts(hfile : super::super::Foundation:: HANDLE, lpcommtimeouts : *mut COMMTIMEOUTS) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetDefaultCommConfigA(lpszname : windows_sys::core::PCSTR, lpcc : *mut COMMCONFIG, lpdwsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetDefaultCommConfigW(lpszname : windows_sys::core::PCWSTR, lpcc : *mut COMMCONFIG, lpdwsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-core-comm-l1-1-1.dll" "system" fn OpenCommPort(uportnumber : u32, dwdesiredaccess : u32, dwflagsandattributes : u32) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn PurgeComm(hfile : super::super::Foundation:: HANDLE, dwflags : PURGE_COMM_FLAGS) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn SetCommBreak(hfile : super::super::Foundation:: HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn SetCommConfig(hcommdev : super::super::Foundation:: HANDLE, lpcc : *const COMMCONFIG, dwsize : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn SetCommMask(hfile : super::super::Foundation:: HANDLE, dwevtmask : COMM_EVENT_MASK) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn SetCommState(hfile : super::super::Foundation:: HANDLE, lpdcb : *const DCB) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn SetCommTimeouts(hfile : super::super::Foundation:: HANDLE, lpcommtimeouts : *const COMMTIMEOUTS) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn SetDefaultCommConfigA(lpszname : windows_sys::core::PCSTR, lpcc : *const COMMCONFIG, dwsize : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn SetDefaultCommConfigW(lpszname : windows_sys::core::PCWSTR, lpcc : *const COMMCONFIG, dwsize : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn SetupComm(hfile : super::super::Foundation:: HANDLE, dwinqueue : u32, dwoutqueue : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 29:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn TransmitCommChar(hfile : super::super::Foundation:: HANDLE, cchar : i8) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 30:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_IO")]
// windows_link::link!("kernel32.dll" "system" fn WaitCommEvent(hfile : super::super::Foundation:: HANDLE, lpevtmask : *mut COMM_EVENT_MASK, lpoverlapped : *mut super::super::System::IO:: OVERLAPPED) -> windows_sys::core::BOOL);

public const val `CE_BREAK`: `CLEAR_COMM_ERROR_FLAGS` = 16u;
public const val `CE_FRAME`: `CLEAR_COMM_ERROR_FLAGS` = 8u;
public const val `CE_OVERRUN`: `CLEAR_COMM_ERROR_FLAGS` = 2u;
public const val `CE_RXOVER`: `CLEAR_COMM_ERROR_FLAGS` = 1u;
public const val `CE_RXPARITY`: `CLEAR_COMM_ERROR_FLAGS` = 4u;
public typealias `CLEAR_COMM_ERROR_FLAGS` = UInt;
public const val `CLRBREAK`: `ESCAPE_COMM_FUNCTION` = 9u;
public const val `CLRDTR`: `ESCAPE_COMM_FUNCTION` = 6u;
public const val `CLRRTS`: `ESCAPE_COMM_FUNCTION` = 4u;
// UNSUPPORTED Rust 41:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct COMMCONFIG {
//     pub dwSize: u32,
//     pub wVersion: u16,
//     pub wReserved: u16,
//     pub dcb: DCB,
//     pub dwProviderSubType: u32,
//     pub dwProviderOffset: u32,
//     pub dwProviderSize: u32,
//     pub wcProviderData: [u16; 1],
// }

// UNSUPPORTED Rust 53:1: declaration Impl has no candidate rule
// impl Default for COMMCONFIG {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 58:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct COMMPROP {
//     pub wPacketLength: u16,
//     pub wPacketVersion: u16,
//     pub dwServiceMask: u32,
//     pub dwReserved1: u32,
//     pub dwMaxTxQueue: u32,
//     pub dwMaxRxQueue: u32,
//     pub dwMaxBaud: u32,
//     pub dwProvSubType: u32,
//     pub dwProvCapabilities: u32,
//     pub dwSettableParams: u32,
//     pub dwSettableBaud: u32,
//     pub wSettableData: u16,
//     pub wSettableStopParity: COMMPROP_STOP_PARITY,
//     pub dwCurrentTxQueue: u32,
//     pub dwCurrentRxQueue: u32,
//     pub dwProvSpec1: u32,
//     pub dwProvSpec2: u32,
//     pub wcProvChar: [u16; 1],
// }

// UNSUPPORTED Rust 80:1: declaration Impl has no candidate rule
// impl Default for COMMPROP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `COMMPROP_STOP_PARITY` = UShort;
// UNSUPPORTED Rust 86:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct COMMTIMEOUTS {
//     pub ReadIntervalTimeout: u32,
//     pub ReadTotalTimeoutMultiplier: u32,
//     pub ReadTotalTimeoutConstant: u32,
//     pub WriteTotalTimeoutMultiplier: u32,
//     pub WriteTotalTimeoutConstant: u32,
// }

public typealias `COMM_EVENT_MASK` = UInt;
// UNSUPPORTED Rust 96:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct COMSTAT {
//     pub _bitfield: u32,
//     pub cbInQue: u32,
//     pub cbOutQue: u32,
// }

// UNSUPPORTED Rust 103:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DCB {
//     pub DCBlength: u32,
//     pub BaudRate: u32,
//     pub _bitfield: u32,
//     pub wReserved: u16,
//     pub XonLim: u16,
//     pub XoffLim: u16,
//     pub ByteSize: u8,
//     pub Parity: DCB_PARITY,
//     pub StopBits: DCB_STOP_BITS,
//     pub XonChar: i8,
//     pub XoffChar: i8,
//     pub ErrorChar: i8,
//     pub EofChar: i8,
//     pub EvtChar: i8,
//     pub wReserved1: u16,
// }

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
// UNSUPPORTED Rust 248:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MODEMDEVCAPS {
//     pub dwActualSize: u32,
//     pub dwRequiredSize: u32,
//     pub dwDevSpecificOffset: u32,
//     pub dwDevSpecificSize: u32,
//     pub dwModemProviderVersion: u32,
//     pub dwModemManufacturerOffset: u32,
//     pub dwModemManufacturerSize: u32,
//     pub dwModemModelOffset: u32,
//     pub dwModemModelSize: u32,
//     pub dwModemVersionOffset: u32,
//     pub dwModemVersionSize: u32,
//     pub dwDialOptions: MODEMDEVCAPS_DIAL_OPTIONS,
//     pub dwCallSetupFailTimer: u32,
//     pub dwInactivityTimeout: u32,
//     pub dwSpeakerVolume: MODEMDEVCAPS_SPEAKER_VOLUME,
//     pub dwSpeakerMode: MODEMDEVCAPS_SPEAKER_MODE,
//     pub dwModemOptions: u32,
//     pub dwMaxDTERate: u32,
//     pub dwMaxDCERate: u32,
//     pub abVariablePortion: [u8; 1],
// }

// UNSUPPORTED Rust 272:1: declaration Impl has no candidate rule
// impl Default for MODEMDEVCAPS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `MODEMDEVCAPS_DIAL_OPTIONS` = UInt;
public typealias `MODEMDEVCAPS_SPEAKER_MODE` = UInt;
public typealias `MODEMDEVCAPS_SPEAKER_VOLUME` = UInt;
// UNSUPPORTED Rust 280:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MODEMSETTINGS {
//     pub dwActualSize: u32,
//     pub dwRequiredSize: u32,
//     pub dwDevSpecificOffset: u32,
//     pub dwDevSpecificSize: u32,
//     pub dwCallSetupFailTimer: u32,
//     pub dwInactivityTimeout: u32,
//     pub dwSpeakerVolume: MODEM_SPEAKER_VOLUME,
//     pub dwSpeakerMode: MODEMSETTINGS_SPEAKER_MODE,
//     pub dwPreferredModemOptions: u32,
//     pub dwNegotiatedModemOptions: u32,
//     pub dwNegotiatedDCERate: u32,
//     pub abVariablePortion: [u8; 1],
// }

// UNSUPPORTED Rust 296:1: declaration Impl has no candidate rule
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
// UNSUPPORTED Rust 327:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const SID_3GPP_SUPSVCMODEL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd7d08e07_d767_4478_b14a_eecc87ea12f7);

public const val `SPACEPARITY`: `DCB_PARITY` = 4u;
public const val `STOPBITS_10`: `COMMPROP_STOP_PARITY` = 1u;
public const val `STOPBITS_15`: `COMMPROP_STOP_PARITY` = 2u;
public const val `STOPBITS_20`: `COMMPROP_STOP_PARITY` = 4u;
public const val `TWOSTOPBITS`: `DCB_STOP_BITS` = 2u;
