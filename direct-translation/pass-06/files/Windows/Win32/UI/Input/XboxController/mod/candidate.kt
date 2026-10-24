// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=xinput1_4.dll, ABI=system, export=XInputEnable; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `XInputEnable`(`enable` : `windows_sys`.`core`.`BOOL`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=xinput1_4.dll, ABI=system, export=XInputGetAudioDeviceIds; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `XInputGetAudioDeviceIds`(`dwuserindex` : UInt, `prenderdeviceid` : `windows_sys`.`core`.`PWSTR`, `prendercount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pcapturedeviceid` : `windows_sys`.`core`.`PWSTR`, `pcapturecount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=xinput1_4.dll, ABI=system, export=XInputGetBatteryInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `XInputGetBatteryInformation`(`dwuserindex` : UInt, `devtype` : `BATTERY_DEVTYPE`, `pbatteryinformation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`XINPUT_BATTERY_INFORMATION`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=xinput1_4.dll, ABI=system, export=XInputGetCapabilities; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `XInputGetCapabilities`(`dwuserindex` : UInt, `dwflags` : `XINPUT_FLAG`, `pcapabilities` : /* Rust *mut */ kotlinx.cinterop.CPointer<`XINPUT_CAPABILITIES`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=xinput1_4.dll, ABI=system, export=XInputGetKeystroke; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `XInputGetKeystroke`(`dwuserindex` : UInt, `dwreserved` : UInt, `pkeystroke` : /* Rust *mut */ kotlinx.cinterop.CPointer<`XINPUT_KEYSTROKE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=xinput1_4.dll, ABI=system, export=XInputGetState; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `XInputGetState`(`dwuserindex` : UInt, `pstate` : /* Rust *mut */ kotlinx.cinterop.CPointer<`XINPUT_STATE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=xinput1_4.dll, ABI=system, export=XInputSetState; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `XInputSetState`(`dwuserindex` : UInt, `pvibration` : /* Rust *const */ kotlinx.cinterop.CPointer<`XINPUT_VIBRATION`>?) : UInt
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `XINPUT_BATTERY_INFORMATION` (
    public var `BatteryType`: `BATTERY_TYPE`,
    public var `BatteryLevel`: `BATTERY_LEVEL`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `XINPUT_CAPABILITIES` (
    public var `Type`: `XINPUT_DEVTYPE`,
    public var `SubType`: `XINPUT_DEVSUBTYPE`,
    public var `Flags`: `XINPUT_CAPABILITIES_FLAGS`,
    public var `Gamepad`: `XINPUT_GAMEPAD`,
    public var `Vibration`: `XINPUT_VIBRATION`,
)
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
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `XINPUT_DLL`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("xinput1_4.dll");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `XINPUT_DLL_A`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("xinput1_4.dll");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `XINPUT_DLL_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("xinput1_4.dll");
public typealias `XINPUT_FLAG` = UInt;
public const val `XINPUT_FLAG_ALL`: `XINPUT_FLAG` = 0u;
public const val `XINPUT_FLAG_GAMEPAD`: `XINPUT_FLAG` = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `XINPUT_GAMEPAD` (
    public var `wButtons`: `XINPUT_GAMEPAD_BUTTON_FLAGS`,
    public var `bLeftTrigger`: UByte,
    public var `bRightTrigger`: UByte,
    public var `sThumbLX`: Short,
    public var `sThumbLY`: Short,
    public var `sThumbRX`: Short,
    public var `sThumbRY`: Short,
)
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `XINPUT_KEYSTROKE` (
    public var `VirtualKey`: `XINPUT_VIRTUAL_KEY`,
    public var `Unicode`: UShort,
    public var `Flags`: `XINPUT_KEYSTROKE_FLAGS`,
    public var `UserIndex`: UByte,
    public var `HidCode`: UByte,
)
public typealias `XINPUT_KEYSTROKE_FLAGS` = UShort;
public const val `XINPUT_KEYSTROKE_KEYDOWN`: `XINPUT_KEYSTROKE_FLAGS` = 1u;
public const val `XINPUT_KEYSTROKE_KEYUP`: `XINPUT_KEYSTROKE_FLAGS` = 2u;
public const val `XINPUT_KEYSTROKE_REPEAT`: `XINPUT_KEYSTROKE_FLAGS` = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `XINPUT_STATE` (
    public var `dwPacketNumber`: UInt,
    public var `Gamepad`: `XINPUT_GAMEPAD`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `XINPUT_VIBRATION` (
    public var `wLeftMotorSpeed`: UShort,
    public var `wRightMotorSpeed`: UShort,
)
public typealias `XINPUT_VIRTUAL_KEY` = UShort;
public const val `XUSER_INDEX_ANY`: UInt = 255u;
public const val `XUSER_MAX_COUNT`: UInt = 4u;
