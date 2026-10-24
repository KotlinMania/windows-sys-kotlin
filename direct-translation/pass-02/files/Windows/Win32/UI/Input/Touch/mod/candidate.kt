// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn CloseGestureInfoHandle(hgestureinfo : HGESTUREINFO) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn CloseTouchInputHandle(htouchinput : HTOUCHINPUT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn GetGestureConfig(hwnd : super::super::super::Foundation:: HWND, dwreserved : u32, dwflags : u32, pcids : *const u32, pgestureconfig : *mut GESTURECONFIG, cbsize : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn GetGestureExtraArgs(hgestureinfo : HGESTUREINFO, cbextraargs : u32, pextraargs : *mut u8) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn GetGestureInfo(hgestureinfo : HGESTUREINFO, pgestureinfo : *mut GESTUREINFO) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn GetTouchInputInfo(htouchinput : HTOUCHINPUT, cinputs : u32, pinputs : *mut TOUCHINPUT, cbsize : i32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn IsTouchWindow(hwnd : super::super::super::Foundation:: HWND, pulflags : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn RegisterTouchWindow(hwnd : super::super::super::Foundation:: HWND, ulflags : REGISTER_TOUCH_WINDOW_FLAGS) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn SetGestureConfig(hwnd : super::super::super::Foundation:: HWND, dwreserved : u32, cids : u32, pgestureconfig : *const GESTURECONFIG, cbsize : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn UnregisterTouchWindow(hwnd : super::super::super::Foundation:: HWND) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 11:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct GESTURECONFIG {
//     pub dwID: GESTURECONFIG_ID,
//     pub dwWant: u32,
//     pub dwBlock: u32,
// }

public typealias `GESTURECONFIG_ID` = UInt;
// UNSUPPORTED Rust 19:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct GESTUREINFO {
//     pub cbSize: u32,
//     pub dwFlags: u32,
//     pub dwID: u32,
//     pub hwndTarget: super::super::super::Foundation::HWND,
//     pub ptsLocation: super::super::super::Foundation::POINTS,
//     pub dwInstanceID: u32,
//     pub dwSequenceID: u32,
//     pub ullArguments: u64,
//     pub cbExtraArgs: u32,
// }

// UNSUPPORTED Rust 32:1: declaration Impl has no candidate rule
// impl Default for GESTUREINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 37:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct GESTURENOTIFYSTRUCT {
//     pub cbSize: u32,
//     pub dwFlags: u32,
//     pub hwndTarget: super::super::super::Foundation::HWND,
//     pub ptsLocation: super::super::super::Foundation::POINTS,
//     pub dwInstanceID: u32,
// }

// UNSUPPORTED Rust 46:1: declaration Impl has no candidate rule
// impl Default for GESTURENOTIFYSTRUCT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `GID_BEGIN`: `GESTURECONFIG_ID` = 1u;
public const val `GID_END`: `GESTURECONFIG_ID` = 2u;
public const val `GID_PAN`: `GESTURECONFIG_ID` = 4u;
public const val `GID_PRESSANDTAP`: `GESTURECONFIG_ID` = 7u;
public const val `GID_ROLLOVER`: `GESTURECONFIG_ID` = 7u;
public const val `GID_ROTATE`: `GESTURECONFIG_ID` = 5u;
public const val `GID_TWOFINGERTAP`: `GESTURECONFIG_ID` = 6u;
public const val `GID_ZOOM`: `GESTURECONFIG_ID` = 3u;
// UNSUPPORTED Rust 59:1: non-scalar type Ptr unsupported
// pub type HGESTUREINFO = *mut core::ffi::c_void;

// UNSUPPORTED Rust 60:1: non-scalar type Ptr unsupported
// pub type HTOUCHINPUT = *mut core::ffi::c_void;

// UNSUPPORTED Rust 61:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const InertiaProcessor: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xabb27087_4ce0_4e58_a0cb_e24df96814be);

public const val `MANIPULATION_ALL`: `MANIPULATION_PROCESSOR_MANIPULATIONS` = 15;
public const val `MANIPULATION_NONE`: `MANIPULATION_PROCESSOR_MANIPULATIONS` = 0;
public typealias `MANIPULATION_PROCESSOR_MANIPULATIONS` = Int;
public const val `MANIPULATION_ROTATE`: `MANIPULATION_PROCESSOR_MANIPULATIONS` = 8;
public const val `MANIPULATION_SCALE`: `MANIPULATION_PROCESSOR_MANIPULATIONS` = 4;
public const val `MANIPULATION_TRANSLATE_X`: `MANIPULATION_PROCESSOR_MANIPULATIONS` = 1;
public const val `MANIPULATION_TRANSLATE_Y`: `MANIPULATION_PROCESSOR_MANIPULATIONS` = 2;
// UNSUPPORTED Rust 69:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const ManipulationProcessor: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x597d4fb0_47fd_4aff_89b9_c6cfae8cf08e);

public typealias `REGISTER_TOUCH_WINDOW_FLAGS` = UInt;
public const val `TOUCHEVENTF_DOWN`: `TOUCHEVENTF_FLAGS` = 2u;
public typealias `TOUCHEVENTF_FLAGS` = UInt;
public const val `TOUCHEVENTF_INRANGE`: `TOUCHEVENTF_FLAGS` = 8u;
public const val `TOUCHEVENTF_MOVE`: `TOUCHEVENTF_FLAGS` = 1u;
public const val `TOUCHEVENTF_NOCOALESCE`: `TOUCHEVENTF_FLAGS` = 32u;
public const val `TOUCHEVENTF_PALM`: `TOUCHEVENTF_FLAGS` = 128u;
public const val `TOUCHEVENTF_PEN`: `TOUCHEVENTF_FLAGS` = 64u;
public const val `TOUCHEVENTF_PRIMARY`: `TOUCHEVENTF_FLAGS` = 16u;
public const val `TOUCHEVENTF_UP`: `TOUCHEVENTF_FLAGS` = 4u;
// UNSUPPORTED Rust 80:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct TOUCHINPUT {
//     pub x: i32,
//     pub y: i32,
//     pub hSource: super::super::super::Foundation::HANDLE,
//     pub dwID: u32,
//     pub dwFlags: TOUCHEVENTF_FLAGS,
//     pub dwMask: TOUCHINPUTMASKF_MASK,
//     pub dwTime: u32,
//     pub dwExtraInfo: usize,
//     pub cxContact: u32,
//     pub cyContact: u32,
// }

// UNSUPPORTED Rust 94:1: declaration Impl has no candidate rule
// impl Default for TOUCHINPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `TOUCHINPUTMASKF_CONTACTAREA`: `TOUCHINPUTMASKF_MASK` = 4u;
public const val `TOUCHINPUTMASKF_EXTRAINFO`: `TOUCHINPUTMASKF_MASK` = 2u;
public typealias `TOUCHINPUTMASKF_MASK` = UInt;
public const val `TOUCHINPUTMASKF_TIMEFROMSYSTEM`: `TOUCHINPUTMASKF_MASK` = 1u;
public const val `TWF_FINETOUCH`: `REGISTER_TOUCH_WINDOW_FLAGS` = 1u;
public const val `TWF_WANTPALM`: `REGISTER_TOUCH_WINDOW_FLAGS` = 2u;
