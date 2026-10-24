// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn EnableMouseInPointer(fenable : windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn GetPointerCursorId(pointerid : u32, cursorid : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_Controls"))]
// windows_link::link!("user32.dll" "system" fn GetPointerDevice(device : super::super::super::Foundation:: HANDLE, pointerdevice : *mut super::super::Controls:: POINTER_DEVICE_INFO) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_Controls")]
// windows_link::link!("user32.dll" "system" fn GetPointerDeviceCursors(device : super::super::super::Foundation:: HANDLE, cursorcount : *mut u32, devicecursors : *mut super::super::Controls:: POINTER_DEVICE_CURSOR_INFO) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_Controls")]
// windows_link::link!("user32.dll" "system" fn GetPointerDeviceProperties(device : super::super::super::Foundation:: HANDLE, propertycount : *mut u32, pointerproperties : *mut super::super::Controls:: POINTER_DEVICE_PROPERTY) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn GetPointerDeviceRects(device : super::super::super::Foundation:: HANDLE, pointerdevicerect : *mut super::super::super::Foundation:: RECT, displayrect : *mut super::super::super::Foundation:: RECT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_Controls"))]
// windows_link::link!("user32.dll" "system" fn GetPointerDevices(devicecount : *mut u32, pointerdevices : *mut super::super::Controls:: POINTER_DEVICE_INFO) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// windows_link::link!("user32.dll" "system" fn GetPointerFrameInfo(pointerid : u32, pointercount : *mut u32, pointerinfo : *mut POINTER_INFO) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// windows_link::link!("user32.dll" "system" fn GetPointerFrameInfoHistory(pointerid : u32, entriescount : *mut u32, pointercount : *mut u32, pointerinfo : *mut POINTER_INFO) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// windows_link::link!("user32.dll" "system" fn GetPointerFramePenInfo(pointerid : u32, pointercount : *mut u32, peninfo : *mut POINTER_PEN_INFO) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// windows_link::link!("user32.dll" "system" fn GetPointerFramePenInfoHistory(pointerid : u32, entriescount : *mut u32, pointercount : *mut u32, peninfo : *mut POINTER_PEN_INFO) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// windows_link::link!("user32.dll" "system" fn GetPointerFrameTouchInfo(pointerid : u32, pointercount : *mut u32, touchinfo : *mut POINTER_TOUCH_INFO) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// windows_link::link!("user32.dll" "system" fn GetPointerFrameTouchInfoHistory(pointerid : u32, entriescount : *mut u32, pointercount : *mut u32, touchinfo : *mut POINTER_TOUCH_INFO) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// windows_link::link!("user32.dll" "system" fn GetPointerInfo(pointerid : u32, pointerinfo : *mut POINTER_INFO) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// windows_link::link!("user32.dll" "system" fn GetPointerInfoHistory(pointerid : u32, entriescount : *mut u32, pointerinfo : *mut POINTER_INFO) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn GetPointerInputTransform(pointerid : u32, historycount : u32, inputtransform : *mut INPUT_TRANSFORM) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 29:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// windows_link::link!("user32.dll" "system" fn GetPointerPenInfo(pointerid : u32, peninfo : *mut POINTER_PEN_INFO) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 31:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// windows_link::link!("user32.dll" "system" fn GetPointerPenInfoHistory(pointerid : u32, entriescount : *mut u32, peninfo : *mut POINTER_PEN_INFO) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 33:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// windows_link::link!("user32.dll" "system" fn GetPointerTouchInfo(pointerid : u32, touchinfo : *mut POINTER_TOUCH_INFO) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 35:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// windows_link::link!("user32.dll" "system" fn GetPointerTouchInfoHistory(pointerid : u32, entriescount : *mut u32, touchinfo : *mut POINTER_TOUCH_INFO) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 37:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// windows_link::link!("user32.dll" "system" fn GetPointerType(pointerid : u32, pointertype : *mut super::super::WindowsAndMessaging:: POINTER_INPUT_TYPE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 39:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_Controls")]
// windows_link::link!("user32.dll" "system" fn GetRawPointerDeviceData(pointerid : u32, historycount : u32, propertiescount : u32, pproperties : *const super::super::Controls:: POINTER_DEVICE_PROPERTY, pvalues : *mut i32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 41:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn GetUnpredictedMessagePos() -> u32);

// UNSUPPORTED Rust 42:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn InitializeTouchInjection(maxcount : u32, dwmode : TOUCH_FEEDBACK_MODE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 43:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_UI_Controls", feature = "Win32_UI_WindowsAndMessaging"))]
// windows_link::link!("user32.dll" "system" fn InjectSyntheticPointerInput(device : super::super::Controls:: HSYNTHETICPOINTERDEVICE, pointerinfo : *const super::super::Controls:: POINTER_TYPE_INFO, count : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 45:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// windows_link::link!("user32.dll" "system" fn InjectTouchInput(count : u32, contacts : *const POINTER_TOUCH_INFO) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 47:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn IsMouseInPointerEnabled() -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 48:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn SkipPointerFrameMessages(pointerid : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 49:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct INPUT_INJECTION_VALUE {
//     pub page: u16,
//     pub usage: u16,
//     pub value: i32,
//     pub index: u16,
// }

// UNSUPPORTED Rust 57:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct INPUT_TRANSFORM {
//     pub Anonymous: INPUT_TRANSFORM_0,
// }

// UNSUPPORTED Rust 62:1: declaration Impl has no candidate rule
// impl Default for INPUT_TRANSFORM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 67:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union INPUT_TRANSFORM_0 {
//     pub Anonymous: INPUT_TRANSFORM_0_0,
//     pub m: [f32; 16],
// }

// UNSUPPORTED Rust 73:1: declaration Impl has no candidate rule
// impl Default for INPUT_TRANSFORM_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 78:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct INPUT_TRANSFORM_0_0 {
//     pub _11: f32,
//     pub _12: f32,
//     pub _13: f32,
//     pub _14: f32,
//     pub _21: f32,
//     pub _22: f32,
//     pub _23: f32,
//     pub _24: f32,
//     pub _31: f32,
//     pub _32: f32,
//     pub _33: f32,
//     pub _34: f32,
//     pub _41: f32,
//     pub _42: f32,
//     pub _43: f32,
//     pub _44: f32,
// }

public typealias `POINTER_BUTTON_CHANGE_TYPE` = Int;
public const val `POINTER_CHANGE_FIFTHBUTTON_DOWN`: `POINTER_BUTTON_CHANGE_TYPE` = 9;
public const val `POINTER_CHANGE_FIFTHBUTTON_UP`: `POINTER_BUTTON_CHANGE_TYPE` = 10;
public const val `POINTER_CHANGE_FIRSTBUTTON_DOWN`: `POINTER_BUTTON_CHANGE_TYPE` = 1;
public const val `POINTER_CHANGE_FIRSTBUTTON_UP`: `POINTER_BUTTON_CHANGE_TYPE` = 2;
public const val `POINTER_CHANGE_FOURTHBUTTON_DOWN`: `POINTER_BUTTON_CHANGE_TYPE` = 7;
public const val `POINTER_CHANGE_FOURTHBUTTON_UP`: `POINTER_BUTTON_CHANGE_TYPE` = 8;
public const val `POINTER_CHANGE_NONE`: `POINTER_BUTTON_CHANGE_TYPE` = 0;
public const val `POINTER_CHANGE_SECONDBUTTON_DOWN`: `POINTER_BUTTON_CHANGE_TYPE` = 3;
public const val `POINTER_CHANGE_SECONDBUTTON_UP`: `POINTER_BUTTON_CHANGE_TYPE` = 4;
public const val `POINTER_CHANGE_THIRDBUTTON_DOWN`: `POINTER_BUTTON_CHANGE_TYPE` = 5;
public const val `POINTER_CHANGE_THIRDBUTTON_UP`: `POINTER_BUTTON_CHANGE_TYPE` = 6;
public typealias `POINTER_FLAGS` = UInt;
public const val `POINTER_FLAG_CANCELED`: `POINTER_FLAGS` = 32768u;
public const val `POINTER_FLAG_CAPTURECHANGED`: `POINTER_FLAGS` = 2097152u;
public const val `POINTER_FLAG_CONFIDENCE`: `POINTER_FLAGS` = 16384u;
public const val `POINTER_FLAG_DOWN`: `POINTER_FLAGS` = 65536u;
public const val `POINTER_FLAG_FIFTHBUTTON`: `POINTER_FLAGS` = 256u;
public const val `POINTER_FLAG_FIRSTBUTTON`: `POINTER_FLAGS` = 16u;
public const val `POINTER_FLAG_FOURTHBUTTON`: `POINTER_FLAGS` = 128u;
public const val `POINTER_FLAG_HASTRANSFORM`: `POINTER_FLAGS` = 4194304u;
public const val `POINTER_FLAG_HWHEEL`: `POINTER_FLAGS` = 1048576u;
public const val `POINTER_FLAG_INCONTACT`: `POINTER_FLAGS` = 4u;
public const val `POINTER_FLAG_INRANGE`: `POINTER_FLAGS` = 2u;
public const val `POINTER_FLAG_NEW`: `POINTER_FLAGS` = 1u;
public const val `POINTER_FLAG_NONE`: `POINTER_FLAGS` = 0u;
public const val `POINTER_FLAG_PRIMARY`: `POINTER_FLAGS` = 8192u;
public const val `POINTER_FLAG_SECONDBUTTON`: `POINTER_FLAGS` = 32u;
public const val `POINTER_FLAG_THIRDBUTTON`: `POINTER_FLAGS` = 64u;
public const val `POINTER_FLAG_UP`: `POINTER_FLAGS` = 262144u;
public const val `POINTER_FLAG_UPDATE`: `POINTER_FLAGS` = 131072u;
public const val `POINTER_FLAG_WHEEL`: `POINTER_FLAGS` = 524288u;
// UNSUPPORTED Rust 130:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// #[derive(Clone, Copy)]
// pub struct POINTER_INFO {
//     pub pointerType: super::super::WindowsAndMessaging::POINTER_INPUT_TYPE,
//     pub pointerId: u32,
//     pub frameId: u32,
//     pub pointerFlags: POINTER_FLAGS,
//     pub sourceDevice: super::super::super::Foundation::HANDLE,
//     pub hwndTarget: super::super::super::Foundation::HWND,
//     pub ptPixelLocation: super::super::super::Foundation::POINT,
//     pub ptHimetricLocation: super::super::super::Foundation::POINT,
//     pub ptPixelLocationRaw: super::super::super::Foundation::POINT,
//     pub ptHimetricLocationRaw: super::super::super::Foundation::POINT,
//     pub dwTime: u32,
//     pub historyCount: u32,
//     pub InputData: i32,
//     pub dwKeyStates: u32,
//     pub PerformanceCount: u64,
//     pub ButtonChangeType: POINTER_BUTTON_CHANGE_TYPE,
// }

// UNSUPPORTED Rust 151:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// impl Default for POINTER_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 157:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// #[derive(Clone, Copy, Default)]
// pub struct POINTER_PEN_INFO {
//     pub pointerInfo: POINTER_INFO,
//     pub penFlags: u32,
//     pub penMask: u32,
//     pub pressure: u32,
//     pub rotation: u32,
//     pub tiltX: i32,
//     pub tiltY: i32,
// }

// UNSUPPORTED Rust 169:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// #[derive(Clone, Copy, Default)]
// pub struct POINTER_TOUCH_INFO {
//     pub pointerInfo: POINTER_INFO,
//     pub touchFlags: u32,
//     pub touchMask: u32,
//     pub rcContact: super::super::super::Foundation::RECT,
//     pub rcContactRaw: super::super::super::Foundation::RECT,
//     pub orientation: u32,
//     pub pressure: u32,
// }

public const val `TOUCH_FEEDBACK_DEFAULT`: `TOUCH_FEEDBACK_MODE` = 1u;
public const val `TOUCH_FEEDBACK_INDIRECT`: `TOUCH_FEEDBACK_MODE` = 2u;
public typealias `TOUCH_FEEDBACK_MODE` = UInt;
public const val `TOUCH_FEEDBACK_NONE`: `TOUCH_FEEDBACK_MODE` = 3u;
