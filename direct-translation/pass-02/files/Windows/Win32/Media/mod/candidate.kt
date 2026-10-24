// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Mod has no candidate rule
// #[cfg(feature = "Win32_Media_Audio")]
// pub mod Audio;

// UNSUPPORTED Rust 3:1: declaration Mod has no candidate rule
// #[cfg(feature = "Win32_Media_DxMediaObjects")]
// pub mod DxMediaObjects;

// UNSUPPORTED Rust 5:1: declaration Mod has no candidate rule
// #[cfg(feature = "Win32_Media_KernelStreaming")]
// pub mod KernelStreaming;

// UNSUPPORTED Rust 7:1: declaration Mod has no candidate rule
// #[cfg(feature = "Win32_Media_Multimedia")]
// pub mod Multimedia;

// UNSUPPORTED Rust 9:1: declaration Mod has no candidate rule
// #[cfg(feature = "Win32_Media_Streaming")]
// pub mod Streaming;

// UNSUPPORTED Rust 11:1: declaration Mod has no candidate rule
// #[cfg(feature = "Win32_Media_WindowsMediaFormat")]
// pub mod WindowsMediaFormat;

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// windows_link::link!("winmm.dll" "system" fn timeBeginPeriod(uperiod : u32) -> u32);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// windows_link::link!("winmm.dll" "system" fn timeEndPeriod(uperiod : u32) -> u32);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// windows_link::link!("winmm.dll" "system" fn timeGetDevCaps(ptc : *mut TIMECAPS, cbtc : u32) -> u32);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// windows_link::link!("winmm.dll" "system" fn timeGetSystemTime(pmmt : *mut MMTIME, cbmmt : u32) -> u32);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// windows_link::link!("winmm.dll" "system" fn timeGetTime() -> u32);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// windows_link::link!("winmm.dll" "system" fn timeKillEvent(utimerid : u32) -> u32);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// windows_link::link!("winmm.dll" "system" fn timeSetEvent(udelay : u32, uresolution : u32, fptc : LPTIMECALLBACK, dwuser : usize, fuevent : u32) -> u32);

public const val `ED_DEVCAP_ATN_READ`: `TIMECODE_SAMPLE_FLAGS` = 5047u;
public const val `ED_DEVCAP_RTC_READ`: `TIMECODE_SAMPLE_FLAGS` = 5050u;
public const val `ED_DEVCAP_TIMECODE_READ`: `TIMECODE_SAMPLE_FLAGS` = 4121u;
// UNSUPPORTED Rust 23:1: non-scalar type Ptr unsupported
// pub type HTASK = *mut core::ffi::c_void;

public const val `JOYERR_BASE`: UInt = 160u;
// UNSUPPORTED Rust 25:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_Media_Multimedia")]
// pub type LPDRVCALLBACK = Option<unsafe extern "system" fn(hdrvr: Multimedia::HDRVR, umsg: u32, dwuser: usize, dw1: usize, dw2: usize)>;

// UNSUPPORTED Rust 27:1: generic scalar type unsupported
// pub type LPTIMECALLBACK = Option<unsafe extern "system" fn(utimerid: u32, umsg: u32, dwuser: usize, dw1: usize, dw2: usize)>;

public const val `MAXERRORLENGTH`: UInt = 256u;
public const val `MAXPNAMELEN`: UInt = 32u;
public const val `MCIERR_BASE`: UInt = 256u;
public const val `MCI_CD_OFFSET`: UInt = 1088u;
public const val `MCI_SEQ_OFFSET`: UInt = 1216u;
public const val `MCI_STRING_OFFSET`: UInt = 512u;
public const val `MCI_VD_OFFSET`: UInt = 1024u;
public const val `MCI_WAVE_OFFSET`: UInt = 1152u;
public const val `MIDIERR_BASE`: UInt = 64u;
public const val `MIXERR_BASE`: UInt = 1024u;
public const val `MMSYSERR_ALLOCATED`: UInt = 4u;
public const val `MMSYSERR_BADDB`: UInt = 14u;
public const val `MMSYSERR_BADDEVICEID`: UInt = 2u;
public const val `MMSYSERR_BADERRNUM`: UInt = 9u;
public const val `MMSYSERR_BASE`: UInt = 0u;
public const val `MMSYSERR_DELETEERROR`: UInt = 18u;
public const val `MMSYSERR_ERROR`: UInt = 1u;
public const val `MMSYSERR_HANDLEBUSY`: UInt = 12u;
public const val `MMSYSERR_INVALFLAG`: UInt = 10u;
public const val `MMSYSERR_INVALHANDLE`: UInt = 5u;
public const val `MMSYSERR_INVALIDALIAS`: UInt = 13u;
public const val `MMSYSERR_INVALPARAM`: UInt = 11u;
public const val `MMSYSERR_KEYNOTFOUND`: UInt = 15u;
public const val `MMSYSERR_LASTERROR`: UInt = 21u;
public const val `MMSYSERR_MOREDATA`: UInt = 21u;
public const val `MMSYSERR_NODRIVER`: UInt = 6u;
public const val `MMSYSERR_NODRIVERCB`: UInt = 20u;
public const val `MMSYSERR_NOERROR`: UInt = 0u;
public const val `MMSYSERR_NOMEM`: UInt = 7u;
public const val `MMSYSERR_NOTENABLED`: UInt = 3u;
public const val `MMSYSERR_NOTSUPPORTED`: UInt = 8u;
public const val `MMSYSERR_READERROR`: UInt = 16u;
public const val `MMSYSERR_VALNOTFOUND`: UInt = 19u;
public const val `MMSYSERR_WRITEERROR`: UInt = 17u;
// UNSUPPORTED Rust 62:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct MMTIME {
//     pub wType: u32,
//     pub u: MMTIME_0,
// }

// UNSUPPORTED Rust 68:1: declaration Impl has no candidate rule
// impl Default for MMTIME {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 73:1: declaration Union has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union MMTIME_0 {
//     pub ms: u32,
//     pub sample: u32,
//     pub cb: u32,
//     pub ticks: u32,
//     pub smpte: MMTIME_0_0,
//     pub midi: MMTIME_0_1,
// }

// UNSUPPORTED Rust 83:1: declaration Impl has no candidate rule
// impl Default for MMTIME_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 88:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct MMTIME_0_1 {
//     pub songptrpos: u32,
// }

// UNSUPPORTED Rust 93:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MMTIME_0_0 {
//     pub hour: u8,
//     pub min: u8,
//     pub sec: u8,
//     pub frame: u8,
//     pub fps: u8,
//     pub dummy: u8,
//     pub pad: [u8; 2],
// }

// UNSUPPORTED Rust 104:1: declaration Impl has no candidate rule
// impl Default for MMTIME_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MM_ADLIB`: UInt = 9u;
public const val `MM_DRVM_CLOSE`: UInt = 977u;
public const val `MM_DRVM_DATA`: UInt = 978u;
public const val `MM_DRVM_ERROR`: UInt = 979u;
public const val `MM_DRVM_OPEN`: UInt = 976u;
public const val `MM_JOY1BUTTONDOWN`: UInt = 949u;
public const val `MM_JOY1BUTTONUP`: UInt = 951u;
public const val `MM_JOY1MOVE`: UInt = 928u;
public const val `MM_JOY1ZMOVE`: UInt = 930u;
public const val `MM_JOY2BUTTONDOWN`: UInt = 950u;
public const val `MM_JOY2BUTTONUP`: UInt = 952u;
public const val `MM_JOY2MOVE`: UInt = 929u;
public const val `MM_JOY2ZMOVE`: UInt = 931u;
public const val `MM_MCINOTIFY`: UInt = 953u;
public const val `MM_MCISIGNAL`: UInt = 971u;
public const val `MM_MICROSOFT`: UInt = 1u;
public const val `MM_MIDI_MAPPER`: UInt = 1u;
public const val `MM_MIM_CLOSE`: UInt = 962u;
public const val `MM_MIM_DATA`: UInt = 963u;
public const val `MM_MIM_ERROR`: UInt = 965u;
public const val `MM_MIM_LONGDATA`: UInt = 964u;
public const val `MM_MIM_LONGERROR`: UInt = 966u;
public const val `MM_MIM_MOREDATA`: UInt = 972u;
public const val `MM_MIM_OPEN`: UInt = 961u;
public const val `MM_MIXM_CONTROL_CHANGE`: UInt = 977u;
public const val `MM_MIXM_LINE_CHANGE`: UInt = 976u;
public const val `MM_MOM_CLOSE`: UInt = 968u;
public const val `MM_MOM_DONE`: UInt = 969u;
public const val `MM_MOM_OPEN`: UInt = 967u;
public const val `MM_MOM_POSITIONCB`: UInt = 970u;
public const val `MM_MPU401_MIDIIN`: UInt = 11u;
public const val `MM_MPU401_MIDIOUT`: UInt = 10u;
public const val `MM_PC_JOYSTICK`: UInt = 12u;
public const val `MM_SNDBLST_MIDIIN`: UInt = 4u;
public const val `MM_SNDBLST_MIDIOUT`: UInt = 3u;
public const val `MM_SNDBLST_SYNTH`: UInt = 5u;
public const val `MM_SNDBLST_WAVEIN`: UInt = 7u;
public const val `MM_SNDBLST_WAVEOUT`: UInt = 6u;
public const val `MM_STREAM_CLOSE`: UInt = 981u;
public const val `MM_STREAM_DONE`: UInt = 982u;
public const val `MM_STREAM_ERROR`: UInt = 983u;
public const val `MM_STREAM_OPEN`: UInt = 980u;
public const val `MM_WAVE_MAPPER`: UInt = 2u;
public const val `MM_WIM_CLOSE`: UInt = 959u;
public const val `MM_WIM_DATA`: UInt = 960u;
public const val `MM_WIM_OPEN`: UInt = 958u;
public const val `MM_WOM_CLOSE`: UInt = 956u;
public const val `MM_WOM_DONE`: UInt = 957u;
public const val `MM_WOM_OPEN`: UInt = 955u;
// UNSUPPORTED Rust 158:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TIMECAPS {
//     pub wPeriodMin: u32,
//     pub wPeriodMax: u32,
// }

// UNSUPPORTED Rust 164:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union TIMECODE {
//     pub Anonymous: TIMECODE_0,
//     pub qw: u64,
// }

// UNSUPPORTED Rust 170:1: declaration Impl has no candidate rule
// impl Default for TIMECODE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 175:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TIMECODE_0 {
//     pub wFrameRate: u16,
//     pub wFrameFract: u16,
//     pub dwFrames: u32,
// }

// UNSUPPORTED Rust 182:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct TIMECODE_SAMPLE {
//     pub qwTick: i64,
//     pub timecode: TIMECODE,
//     pub dwUser: u32,
//     pub dwFlags: TIMECODE_SAMPLE_FLAGS,
// }

// UNSUPPORTED Rust 190:1: declaration Impl has no candidate rule
// impl Default for TIMECODE_SAMPLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `TIMECODE_SAMPLE_FLAGS` = UInt;
public const val `TIMERR_BASE`: UInt = 96u;
public const val `TIMERR_NOCANDO`: UInt = 97u;
public const val `TIMERR_NOERROR`: UInt = 0u;
public const val `TIMERR_STRUCT`: UInt = 129u;
public const val `TIME_BYTES`: UInt = 4u;
public const val `TIME_CALLBACK_EVENT_PULSE`: UInt = 32u;
public const val `TIME_CALLBACK_EVENT_SET`: UInt = 16u;
public const val `TIME_CALLBACK_FUNCTION`: UInt = 0u;
public const val `TIME_KILL_SYNCHRONOUS`: UInt = 256u;
public const val `TIME_MIDI`: UInt = 16u;
public const val `TIME_MS`: UInt = 1u;
public const val `TIME_ONESHOT`: UInt = 0u;
public const val `TIME_PERIODIC`: UInt = 1u;
public const val `TIME_SAMPLES`: UInt = 2u;
public const val `TIME_SMPTE`: UInt = 8u;
public const val `TIME_TICKS`: UInt = 32u;
public const val `WAVERR_BASE`: UInt = 32u;
