// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("xinput1_4.dll" "system" fn XInputEnable(enable : windows_sys::core::BOOL));

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("xinput1_4.dll" "system" fn XInputGetAudioDeviceIds(dwuserindex : u32, prenderdeviceid : windows_sys::core::PWSTR, prendercount : *mut u32, pcapturedeviceid : windows_sys::core::PWSTR, pcapturecount : *mut u32) -> u32);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("xinput1_4.dll" "system" fn XInputGetBatteryInformation(dwuserindex : u32, devtype : BATTERY_DEVTYPE, pbatteryinformation : *mut XINPUT_BATTERY_INFORMATION) -> u32);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("xinput1_4.dll" "system" fn XInputGetCapabilities(dwuserindex : u32, dwflags : XINPUT_FLAG, pcapabilities : *mut XINPUT_CAPABILITIES) -> u32);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("xinput1_4.dll" "system" fn XInputGetKeystroke(dwuserindex : u32, dwreserved : u32, pkeystroke : *mut XINPUT_KEYSTROKE) -> u32);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("xinput1_4.dll" "system" fn XInputGetState(dwuserindex : u32, pstate : *mut XINPUT_STATE) -> u32);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("xinput1_4.dll" "system" fn XInputSetState(dwuserindex : u32, pvibration : *const XINPUT_VIBRATION) -> u32);

public typealias `BATTERY_DEVTYPE` = UByte;
public const val `BATTERY_DEVTYPE_GAMEPAD`: `BATTERY_DEVTYPE` = 0u;
public const val `BATTERY_DEVTYPE_HEADSET`: `BATTERY_DEVTYPE` = 1u;
public typealias `BATTERY_LEVEL` = UByte;
public const val `BATTERY_LEVEL_EMPTY`: `BATTERY_LEVEL` = 0u;
public const val `BATTERY_LEVEL_FULL`: `BATTERY_LEVEL` = 3u;
public const val `BATTERY_LEVEL_LOW`: `BATTERY_LEVEL` = 1u;
public const val `BATTERY_LEVEL_MEDIUM`: `BATTERY_LEVEL` = 2u;
public typealias `BATTERY_TYPE` = UByte;
public const val `BATTERY_TYPE_ALKALINE`: `BATTERY_TYPE` = 2u;
public const val `BATTERY_TYPE_DISCONNECTED`: `BATTERY_TYPE` = 0u;
public const val `BATTERY_TYPE_NIMH`: `BATTERY_TYPE` = 3u;
public const val `BATTERY_TYPE_UNKNOWN`: `BATTERY_TYPE` = 255u;
public const val `BATTERY_TYPE_WIRED`: `BATTERY_TYPE` = 1u;
public const val `VK_PAD_A`: `XINPUT_VIRTUAL_KEY` = 22528u;
public const val `VK_PAD_B`: `XINPUT_VIRTUAL_KEY` = 22529u;
public const val `VK_PAD_BACK`: `XINPUT_VIRTUAL_KEY` = 22549u;
public const val `VK_PAD_DPAD_DOWN`: `XINPUT_VIRTUAL_KEY` = 22545u;
public const val `VK_PAD_DPAD_LEFT`: `XINPUT_VIRTUAL_KEY` = 22546u;
public const val `VK_PAD_DPAD_RIGHT`: `XINPUT_VIRTUAL_KEY` = 22547u;
public const val `VK_PAD_DPAD_UP`: `XINPUT_VIRTUAL_KEY` = 22544u;
public const val `VK_PAD_LSHOULDER`: `XINPUT_VIRTUAL_KEY` = 22533u;
public const val `VK_PAD_LTHUMB_DOWN`: `XINPUT_VIRTUAL_KEY` = 22561u;
public const val `VK_PAD_LTHUMB_DOWNLEFT`: `XINPUT_VIRTUAL_KEY` = 22567u;
public const val `VK_PAD_LTHUMB_DOWNRIGHT`: `XINPUT_VIRTUAL_KEY` = 22566u;
public const val `VK_PAD_LTHUMB_LEFT`: `XINPUT_VIRTUAL_KEY` = 22563u;
public const val `VK_PAD_LTHUMB_PRESS`: `XINPUT_VIRTUAL_KEY` = 22550u;
public const val `VK_PAD_LTHUMB_RIGHT`: `XINPUT_VIRTUAL_KEY` = 22562u;
public const val `VK_PAD_LTHUMB_UP`: `XINPUT_VIRTUAL_KEY` = 22560u;
public const val `VK_PAD_LTHUMB_UPLEFT`: `XINPUT_VIRTUAL_KEY` = 22564u;
public const val `VK_PAD_LTHUMB_UPRIGHT`: `XINPUT_VIRTUAL_KEY` = 22565u;
public const val `VK_PAD_LTRIGGER`: `XINPUT_VIRTUAL_KEY` = 22534u;
public const val `VK_PAD_RSHOULDER`: `XINPUT_VIRTUAL_KEY` = 22532u;
public const val `VK_PAD_RTHUMB_DOWN`: `XINPUT_VIRTUAL_KEY` = 22577u;
public const val `VK_PAD_RTHUMB_DOWNLEFT`: `XINPUT_VIRTUAL_KEY` = 22583u;
public const val `VK_PAD_RTHUMB_DOWNRIGHT`: `XINPUT_VIRTUAL_KEY` = 22582u;
public const val `VK_PAD_RTHUMB_LEFT`: `XINPUT_VIRTUAL_KEY` = 22579u;
public const val `VK_PAD_RTHUMB_PRESS`: `XINPUT_VIRTUAL_KEY` = 22551u;
public const val `VK_PAD_RTHUMB_RIGHT`: `XINPUT_VIRTUAL_KEY` = 22578u;
public const val `VK_PAD_RTHUMB_UP`: `XINPUT_VIRTUAL_KEY` = 22576u;
public const val `VK_PAD_RTHUMB_UPLEFT`: `XINPUT_VIRTUAL_KEY` = 22580u;
public const val `VK_PAD_RTHUMB_UPRIGHT`: `XINPUT_VIRTUAL_KEY` = 22581u;
public const val `VK_PAD_RTRIGGER`: `XINPUT_VIRTUAL_KEY` = 22535u;
public const val `VK_PAD_START`: `XINPUT_VIRTUAL_KEY` = 22548u;
public const val `VK_PAD_X`: `XINPUT_VIRTUAL_KEY` = 22530u;
public const val `VK_PAD_Y`: `XINPUT_VIRTUAL_KEY` = 22531u;
// UNSUPPORTED Rust 54:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct XINPUT_BATTERY_INFORMATION {
//     pub BatteryType: BATTERY_TYPE,
//     pub BatteryLevel: BATTERY_LEVEL,
// }

// UNSUPPORTED Rust 60:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct XINPUT_CAPABILITIES {
//     pub Type: XINPUT_DEVTYPE,
//     pub SubType: XINPUT_DEVSUBTYPE,
//     pub Flags: XINPUT_CAPABILITIES_FLAGS,
//     pub Gamepad: XINPUT_GAMEPAD,
//     pub Vibration: XINPUT_VIBRATION,
// }

public typealias `XINPUT_CAPABILITIES_FLAGS` = UShort;
public const val `XINPUT_CAPS_FFB_SUPPORTED`: `XINPUT_CAPABILITIES_FLAGS` = 1u;
public const val `XINPUT_CAPS_NO_NAVIGATION`: `XINPUT_CAPABILITIES_FLAGS` = 16u;
public const val `XINPUT_CAPS_PMD_SUPPORTED`: `XINPUT_CAPABILITIES_FLAGS` = 8u;
public const val `XINPUT_CAPS_VOICE_SUPPORTED`: `XINPUT_CAPABILITIES_FLAGS` = 4u;
public const val `XINPUT_CAPS_WIRELESS`: `XINPUT_CAPABILITIES_FLAGS` = 2u;
public typealias `XINPUT_DEVSUBTYPE` = UByte;
public const val `XINPUT_DEVSUBTYPE_ARCADE_PAD`: `XINPUT_DEVSUBTYPE` = 19u;
public const val `XINPUT_DEVSUBTYPE_ARCADE_STICK`: `XINPUT_DEVSUBTYPE` = 3u;
public const val `XINPUT_DEVSUBTYPE_DANCE_PAD`: `XINPUT_DEVSUBTYPE` = 5u;
public const val `XINPUT_DEVSUBTYPE_DRUM_KIT`: `XINPUT_DEVSUBTYPE` = 8u;
public const val `XINPUT_DEVSUBTYPE_FLIGHT_STICK`: `XINPUT_DEVSUBTYPE` = 4u;
public const val `XINPUT_DEVSUBTYPE_GAMEPAD`: `XINPUT_DEVSUBTYPE` = 1u;
public const val `XINPUT_DEVSUBTYPE_GUITAR`: `XINPUT_DEVSUBTYPE` = 6u;
public const val `XINPUT_DEVSUBTYPE_GUITAR_ALTERNATE`: `XINPUT_DEVSUBTYPE` = 7u;
public const val `XINPUT_DEVSUBTYPE_GUITAR_BASS`: `XINPUT_DEVSUBTYPE` = 11u;
public const val `XINPUT_DEVSUBTYPE_UNKNOWN`: `XINPUT_DEVSUBTYPE` = 0u;
public const val `XINPUT_DEVSUBTYPE_WHEEL`: `XINPUT_DEVSUBTYPE` = 2u;
public typealias `XINPUT_DEVTYPE` = UByte;
public const val `XINPUT_DEVTYPE_GAMEPAD`: `XINPUT_DEVTYPE` = 1u;
// UNSUPPORTED Rust 89:1: non-scalar type Ptr unsupported
// pub const XINPUT_DLL: windows_sys::core::PCWSTR = windows_sys::core::w!("xinput1_4.dll");

// UNSUPPORTED Rust 90:1: non-scalar type Ptr unsupported
// pub const XINPUT_DLL_A: windows_sys::core::PCSTR = windows_sys::core::s!("xinput1_4.dll");

// UNSUPPORTED Rust 91:1: non-scalar type Ptr unsupported
// pub const XINPUT_DLL_W: windows_sys::core::PCWSTR = windows_sys::core::w!("xinput1_4.dll");

public typealias `XINPUT_FLAG` = UInt;
public const val `XINPUT_FLAG_ALL`: `XINPUT_FLAG` = 0u;
public const val `XINPUT_FLAG_GAMEPAD`: `XINPUT_FLAG` = 1u;
// UNSUPPORTED Rust 95:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct XINPUT_GAMEPAD {
//     pub wButtons: XINPUT_GAMEPAD_BUTTON_FLAGS,
//     pub bLeftTrigger: u8,
//     pub bRightTrigger: u8,
//     pub sThumbLX: i16,
//     pub sThumbLY: i16,
//     pub sThumbRX: i16,
//     pub sThumbRY: i16,
// }

public const val `XINPUT_GAMEPAD_A`: `XINPUT_GAMEPAD_BUTTON_FLAGS` = 4096u;
public const val `XINPUT_GAMEPAD_B`: `XINPUT_GAMEPAD_BUTTON_FLAGS` = 8192u;
public const val `XINPUT_GAMEPAD_BACK`: `XINPUT_GAMEPAD_BUTTON_FLAGS` = 32u;
public typealias `XINPUT_GAMEPAD_BUTTON_FLAGS` = UShort;
public const val `XINPUT_GAMEPAD_DPAD_DOWN`: `XINPUT_GAMEPAD_BUTTON_FLAGS` = 2u;
public const val `XINPUT_GAMEPAD_DPAD_LEFT`: `XINPUT_GAMEPAD_BUTTON_FLAGS` = 4u;
public const val `XINPUT_GAMEPAD_DPAD_RIGHT`: `XINPUT_GAMEPAD_BUTTON_FLAGS` = 8u;
public const val `XINPUT_GAMEPAD_DPAD_UP`: `XINPUT_GAMEPAD_BUTTON_FLAGS` = 1u;
public const val `XINPUT_GAMEPAD_LEFT_SHOULDER`: `XINPUT_GAMEPAD_BUTTON_FLAGS` = 256u;
public const val `XINPUT_GAMEPAD_LEFT_THUMB`: `XINPUT_GAMEPAD_BUTTON_FLAGS` = 64u;
public const val `XINPUT_GAMEPAD_LEFT_THUMB_DEADZONE`: `XINPUT_GAMEPAD_BUTTON_FLAGS` = 7849u;
public const val `XINPUT_GAMEPAD_RIGHT_SHOULDER`: `XINPUT_GAMEPAD_BUTTON_FLAGS` = 512u;
public const val `XINPUT_GAMEPAD_RIGHT_THUMB`: `XINPUT_GAMEPAD_BUTTON_FLAGS` = 128u;
public const val `XINPUT_GAMEPAD_RIGHT_THUMB_DEADZONE`: `XINPUT_GAMEPAD_BUTTON_FLAGS` = 8689u;
public const val `XINPUT_GAMEPAD_START`: `XINPUT_GAMEPAD_BUTTON_FLAGS` = 16u;
public const val `XINPUT_GAMEPAD_TRIGGER_THRESHOLD`: `XINPUT_GAMEPAD_BUTTON_FLAGS` = 30u;
public const val `XINPUT_GAMEPAD_X`: `XINPUT_GAMEPAD_BUTTON_FLAGS` = 16384u;
public const val `XINPUT_GAMEPAD_Y`: `XINPUT_GAMEPAD_BUTTON_FLAGS` = 32768u;
// UNSUPPORTED Rust 124:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct XINPUT_KEYSTROKE {
//     pub VirtualKey: XINPUT_VIRTUAL_KEY,
//     pub Unicode: u16,
//     pub Flags: XINPUT_KEYSTROKE_FLAGS,
//     pub UserIndex: u8,
//     pub HidCode: u8,
// }

public typealias `XINPUT_KEYSTROKE_FLAGS` = UShort;
public const val `XINPUT_KEYSTROKE_KEYDOWN`: `XINPUT_KEYSTROKE_FLAGS` = 1u;
public const val `XINPUT_KEYSTROKE_KEYUP`: `XINPUT_KEYSTROKE_FLAGS` = 2u;
public const val `XINPUT_KEYSTROKE_REPEAT`: `XINPUT_KEYSTROKE_FLAGS` = 4u;
// UNSUPPORTED Rust 137:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct XINPUT_STATE {
//     pub dwPacketNumber: u32,
//     pub Gamepad: XINPUT_GAMEPAD,
// }

// UNSUPPORTED Rust 143:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct XINPUT_VIBRATION {
//     pub wLeftMotorSpeed: u16,
//     pub wRightMotorSpeed: u16,
// }

public typealias `XINPUT_VIRTUAL_KEY` = UShort;
public const val `XUSER_INDEX_ANY`: UInt = 255u;
public const val `XUSER_MAX_COUNT`: UInt = 4u;
