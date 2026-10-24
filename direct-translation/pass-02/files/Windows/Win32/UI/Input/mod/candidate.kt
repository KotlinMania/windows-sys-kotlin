// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Mod has no candidate rule
// #[cfg(feature = "Win32_UI_Input_Ime")]
// pub mod Ime;

// UNSUPPORTED Rust 3:1: declaration Mod has no candidate rule
// #[cfg(feature = "Win32_UI_Input_KeyboardAndMouse")]
// pub mod KeyboardAndMouse;

// UNSUPPORTED Rust 5:1: declaration Mod has no candidate rule
// #[cfg(feature = "Win32_UI_Input_Pointer")]
// pub mod Pointer;

// UNSUPPORTED Rust 7:1: declaration Mod has no candidate rule
// #[cfg(feature = "Win32_UI_Input_Touch")]
// pub mod Touch;

// UNSUPPORTED Rust 9:1: declaration Mod has no candidate rule
// #[cfg(feature = "Win32_UI_Input_XboxController")]
// pub mod XboxController;

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn DefRawInputProc(parawinput : *const *const RAWINPUT, ninput : i32, cbsizeheader : u32) -> super::super::Foundation:: LRESULT);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn GetCIMSSM(inputmessagesource : *mut INPUT_MESSAGE_SOURCE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn GetCurrentInputMessageSource(inputmessagesource : *mut INPUT_MESSAGE_SOURCE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn GetRawInputBuffer(pdata : *mut RAWINPUT, pcbsize : *mut u32, cbsizeheader : u32) -> u32);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn GetRawInputData(hrawinput : HRAWINPUT, uicommand : RAW_INPUT_DATA_COMMAND_FLAGS, pdata : *mut core::ffi::c_void, pcbsize : *mut u32, cbsizeheader : u32) -> u32);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn GetRawInputDeviceInfoA(hdevice : super::super::Foundation:: HANDLE, uicommand : RAW_INPUT_DEVICE_INFO_COMMAND, pdata : *mut core::ffi::c_void, pcbsize : *mut u32) -> u32);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn GetRawInputDeviceInfoW(hdevice : super::super::Foundation:: HANDLE, uicommand : RAW_INPUT_DEVICE_INFO_COMMAND, pdata : *mut core::ffi::c_void, pcbsize : *mut u32) -> u32);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn GetRawInputDeviceList(prawinputdevicelist : *mut RAWINPUTDEVICELIST, puinumdevices : *mut u32, cbsize : u32) -> u32);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn GetRegisteredRawInputDevices(prawinputdevices : *mut RAWINPUTDEVICE, puinumdevices : *mut u32, cbsize : u32) -> u32);

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn RegisterRawInputDevices(prawinputdevices : *const RAWINPUTDEVICE, uinumdevices : u32, cbsize : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 21:1: non-scalar type Ptr unsupported
// pub type HRAWINPUT = *mut core::ffi::c_void;

public const val `IMDT_KEYBOARD`: `INPUT_MESSAGE_DEVICE_TYPE` = 1;
public const val `IMDT_MOUSE`: `INPUT_MESSAGE_DEVICE_TYPE` = 2;
public const val `IMDT_PEN`: `INPUT_MESSAGE_DEVICE_TYPE` = 8;
public const val `IMDT_TOUCH`: `INPUT_MESSAGE_DEVICE_TYPE` = 4;
public const val `IMDT_TOUCHPAD`: `INPUT_MESSAGE_DEVICE_TYPE` = 16;
public const val `IMDT_UNAVAILABLE`: `INPUT_MESSAGE_DEVICE_TYPE` = 0;
public const val `IMO_HARDWARE`: `INPUT_MESSAGE_ORIGIN_ID` = 1;
public const val `IMO_INJECTED`: `INPUT_MESSAGE_ORIGIN_ID` = 2;
public const val `IMO_SYSTEM`: `INPUT_MESSAGE_ORIGIN_ID` = 4;
public const val `IMO_UNAVAILABLE`: `INPUT_MESSAGE_ORIGIN_ID` = 0;
public typealias `INPUT_MESSAGE_DEVICE_TYPE` = Int;
public typealias `INPUT_MESSAGE_ORIGIN_ID` = Int;
// UNSUPPORTED Rust 34:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct INPUT_MESSAGE_SOURCE {
//     pub deviceType: INPUT_MESSAGE_DEVICE_TYPE,
//     pub originId: INPUT_MESSAGE_ORIGIN_ID,
// }

public const val `MOUSE_ATTRIBUTES_CHANGED`: `MOUSE_STATE` = 4u;
public const val `MOUSE_MOVE_ABSOLUTE`: `MOUSE_STATE` = 1u;
public const val `MOUSE_MOVE_NOCOALESCE`: `MOUSE_STATE` = 8u;
public const val `MOUSE_MOVE_RELATIVE`: `MOUSE_STATE` = 0u;
public typealias `MOUSE_STATE` = UShort;
public const val `MOUSE_VIRTUAL_DESKTOP`: `MOUSE_STATE` = 2u;
// UNSUPPORTED Rust 46:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RAWHID {
//     pub dwSizeHid: u32,
//     pub dwCount: u32,
//     pub bRawData: [u8; 1],
// }

// UNSUPPORTED Rust 53:1: declaration Impl has no candidate rule
// impl Default for RAWHID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 58:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RAWINPUT {
//     pub header: RAWINPUTHEADER,
//     pub data: RAWINPUT_0,
// }

// UNSUPPORTED Rust 64:1: declaration Impl has no candidate rule
// impl Default for RAWINPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 69:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union RAWINPUT_0 {
//     pub mouse: RAWMOUSE,
//     pub keyboard: RAWKEYBOARD,
//     pub hid: RAWHID,
// }

// UNSUPPORTED Rust 76:1: declaration Impl has no candidate rule
// impl Default for RAWINPUT_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 81:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RAWINPUTDEVICE {
//     pub usUsagePage: u16,
//     pub usUsage: u16,
//     pub dwFlags: RAWINPUTDEVICE_FLAGS,
//     pub hwndTarget: super::super::Foundation::HWND,
// }

// UNSUPPORTED Rust 89:1: declaration Impl has no candidate rule
// impl Default for RAWINPUTDEVICE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 94:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RAWINPUTDEVICELIST {
//     pub hDevice: super::super::Foundation::HANDLE,
//     pub dwType: RID_DEVICE_INFO_TYPE,
// }

// UNSUPPORTED Rust 100:1: declaration Impl has no candidate rule
// impl Default for RAWINPUTDEVICELIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `RAWINPUTDEVICE_FLAGS` = UInt;
// UNSUPPORTED Rust 106:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RAWINPUTHEADER {
//     pub dwType: u32,
//     pub dwSize: u32,
//     pub hDevice: super::super::Foundation::HANDLE,
//     pub wParam: super::super::Foundation::WPARAM,
// }

// UNSUPPORTED Rust 114:1: declaration Impl has no candidate rule
// impl Default for RAWINPUTHEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 119:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct RAWKEYBOARD {
//     pub MakeCode: u16,
//     pub Flags: u16,
//     pub Reserved: u16,
//     pub VKey: u16,
//     pub Message: u32,
//     pub ExtraInformation: u32,
// }

// UNSUPPORTED Rust 129:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RAWMOUSE {
//     pub usFlags: MOUSE_STATE,
//     pub Anonymous: RAWMOUSE_0,
//     pub ulRawButtons: u32,
//     pub lLastX: i32,
//     pub lLastY: i32,
//     pub ulExtraInformation: u32,
// }

// UNSUPPORTED Rust 139:1: declaration Impl has no candidate rule
// impl Default for RAWMOUSE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 144:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union RAWMOUSE_0 {
//     pub ulButtons: u32,
//     pub Anonymous: RAWMOUSE_0_0,
// }

// UNSUPPORTED Rust 150:1: declaration Impl has no candidate rule
// impl Default for RAWMOUSE_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 155:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct RAWMOUSE_0_0 {
//     pub usButtonFlags: u16,
//     pub usButtonData: u16,
// }

public typealias `RAW_INPUT_DATA_COMMAND_FLAGS` = UInt;
public typealias `RAW_INPUT_DEVICE_INFO_COMMAND` = UInt;
public const val `RIDEV_APPKEYS`: `RAWINPUTDEVICE_FLAGS` = 1024u;
public const val `RIDEV_CAPTUREMOUSE`: `RAWINPUTDEVICE_FLAGS` = 512u;
public const val `RIDEV_DEVNOTIFY`: `RAWINPUTDEVICE_FLAGS` = 8192u;
public const val `RIDEV_EXCLUDE`: `RAWINPUTDEVICE_FLAGS` = 16u;
public const val `RIDEV_EXINPUTSINK`: `RAWINPUTDEVICE_FLAGS` = 4096u;
public const val `RIDEV_INPUTSINK`: `RAWINPUTDEVICE_FLAGS` = 256u;
public const val `RIDEV_NOHOTKEYS`: `RAWINPUTDEVICE_FLAGS` = 512u;
public const val `RIDEV_NOLEGACY`: `RAWINPUTDEVICE_FLAGS` = 48u;
public const val `RIDEV_PAGEONLY`: `RAWINPUTDEVICE_FLAGS` = 32u;
public const val `RIDEV_REMOVE`: `RAWINPUTDEVICE_FLAGS` = 1u;
public const val `RIDI_DEVICEINFO`: `RAW_INPUT_DEVICE_INFO_COMMAND` = 536870923u;
public const val `RIDI_DEVICENAME`: `RAW_INPUT_DEVICE_INFO_COMMAND` = 536870919u;
public const val `RIDI_PREPARSEDDATA`: `RAW_INPUT_DEVICE_INFO_COMMAND` = 536870917u;
// UNSUPPORTED Rust 176:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RID_DEVICE_INFO {
//     pub cbSize: u32,
//     pub dwType: RID_DEVICE_INFO_TYPE,
//     pub Anonymous: RID_DEVICE_INFO_0,
// }

// UNSUPPORTED Rust 183:1: declaration Impl has no candidate rule
// impl Default for RID_DEVICE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 188:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union RID_DEVICE_INFO_0 {
//     pub mouse: RID_DEVICE_INFO_MOUSE,
//     pub keyboard: RID_DEVICE_INFO_KEYBOARD,
//     pub hid: RID_DEVICE_INFO_HID,
// }

// UNSUPPORTED Rust 195:1: declaration Impl has no candidate rule
// impl Default for RID_DEVICE_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 200:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct RID_DEVICE_INFO_HID {
//     pub dwVendorId: u32,
//     pub dwProductId: u32,
//     pub dwVersionNumber: u32,
//     pub usUsagePage: u16,
//     pub usUsage: u16,
// }

// UNSUPPORTED Rust 209:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct RID_DEVICE_INFO_KEYBOARD {
//     pub dwType: u32,
//     pub dwSubType: u32,
//     pub dwKeyboardMode: u32,
//     pub dwNumberOfFunctionKeys: u32,
//     pub dwNumberOfIndicators: u32,
//     pub dwNumberOfKeysTotal: u32,
// }

// UNSUPPORTED Rust 219:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct RID_DEVICE_INFO_MOUSE {
//     pub dwId: u32,
//     pub dwNumberOfButtons: u32,
//     pub dwSampleRate: u32,
//     pub fHasHorizontalWheel: windows_sys::core::BOOL,
// }

public typealias `RID_DEVICE_INFO_TYPE` = UInt;
public const val `RID_HEADER`: `RAW_INPUT_DATA_COMMAND_FLAGS` = 268435461u;
public const val `RID_INPUT`: `RAW_INPUT_DATA_COMMAND_FLAGS` = 268435459u;
public const val `RIM_TYPEHID`: `RID_DEVICE_INFO_TYPE` = 2u;
public const val `RIM_TYPEKEYBOARD`: `RID_DEVICE_INFO_TYPE` = 1u;
public const val `RIM_TYPEMOUSE`: `RID_DEVICE_INFO_TYPE` = 0u;
