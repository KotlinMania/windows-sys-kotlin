// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Mod has no candidate rule; syntax: no per-file syntax rule for Mod
// #[cfg(feature = "Win32_UI_Input_Ime")]
// pub mod Ime;

// UNSUPPORTED Rust 3:1: declaration Mod has no candidate rule; syntax: no per-file syntax rule for Mod
// #[cfg(feature = "Win32_UI_Input_KeyboardAndMouse")]
// pub mod KeyboardAndMouse;

// UNSUPPORTED Rust 5:1: declaration Mod has no candidate rule; syntax: no per-file syntax rule for Mod
// #[cfg(feature = "Win32_UI_Input_Pointer")]
// pub mod Pointer;

// UNSUPPORTED Rust 7:1: declaration Mod has no candidate rule; syntax: no per-file syntax rule for Mod
// #[cfg(feature = "Win32_UI_Input_Touch")]
// pub mod Touch;

// UNSUPPORTED Rust 9:1: declaration Mod has no candidate rule; syntax: no per-file syntax rule for Mod
// #[cfg(feature = "Win32_UI_Input_XboxController")]
// pub mod XboxController;

// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=DefRawInputProc; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DefRawInputProc`(`parawinput` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`RAWINPUT`>>?, `ninput` : Int, `cbsizeheader` : UInt) : `super`.`super`.`Foundation`.`LRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetCIMSSM; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetCIMSSM`(`inputmessagesource` : /* Rust *mut */ kotlinx.cinterop.CPointer<`INPUT_MESSAGE_SOURCE`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetCurrentInputMessageSource; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetCurrentInputMessageSource`(`inputmessagesource` : /* Rust *mut */ kotlinx.cinterop.CPointer<`INPUT_MESSAGE_SOURCE`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetRawInputBuffer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetRawInputBuffer`(`pdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RAWINPUT`>?, `pcbsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `cbsizeheader` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetRawInputData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetRawInputData`(`hrawinput` : `HRAWINPUT`, `uicommand` : `RAW_INPUT_DATA_COMMAND_FLAGS`, `pdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pcbsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `cbsizeheader` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetRawInputDeviceInfoA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetRawInputDeviceInfoA`(`hdevice` : `super`.`super`.`Foundation`.`HANDLE`, `uicommand` : `RAW_INPUT_DEVICE_INFO_COMMAND`, `pdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pcbsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetRawInputDeviceInfoW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetRawInputDeviceInfoW`(`hdevice` : `super`.`super`.`Foundation`.`HANDLE`, `uicommand` : `RAW_INPUT_DEVICE_INFO_COMMAND`, `pdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pcbsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetRawInputDeviceList; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetRawInputDeviceList`(`prawinputdevicelist` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RAWINPUTDEVICELIST`>?, `puinumdevices` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `cbsize` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetRegisteredRawInputDevices; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetRegisteredRawInputDevices`(`prawinputdevices` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RAWINPUTDEVICE`>?, `puinumdevices` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `cbsize` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=RegisterRawInputDevices; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegisterRawInputDevices`(`prawinputdevices` : /* Rust *const */ kotlinx.cinterop.CPointer<`RAWINPUTDEVICE`>?, `uinumdevices` : UInt, `cbsize` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HRAWINPUT` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `INPUT_MESSAGE_SOURCE` (
    public var `deviceType`: `INPUT_MESSAGE_DEVICE_TYPE`,
    public var `originId`: `INPUT_MESSAGE_ORIGIN_ID`,
)
public const val `MOUSE_ATTRIBUTES_CHANGED`: `MOUSE_STATE` = 4u;
public const val `MOUSE_MOVE_ABSOLUTE`: `MOUSE_STATE` = 1u;
public const val `MOUSE_MOVE_NOCOALESCE`: `MOUSE_STATE` = 8u;
public const val `MOUSE_MOVE_RELATIVE`: `MOUSE_STATE` = 0u;
public typealias `MOUSE_STATE` = UShort;
public const val `MOUSE_VIRTUAL_DESKTOP`: `MOUSE_STATE` = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RAWHID` (
    public var `dwSizeHid`: UInt,
    public var `dwCount`: UInt,
    public var `bRawData`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `RAWHID`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `RAWHID`.Companion.`default`() : `RAWHID` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RAWINPUT` (
    public var `header`: `RAWINPUTHEADER`,
    public var `data`: `RAWINPUT_0`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `RAWINPUT`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `RAWINPUT`.Companion.`default`() : `RAWINPUT` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 69:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union RAWINPUT_0 {
//     pub mouse: RAWMOUSE,
//     pub keyboard: RAWKEYBOARD,
//     pub hid: RAWHID,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `RAWINPUT_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `RAWINPUT_0`.Companion.`default`() : `RAWINPUT_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RAWINPUTDEVICE` (
    public var `usUsagePage`: UShort,
    public var `usUsage`: UShort,
    public var `dwFlags`: `RAWINPUTDEVICE_FLAGS`,
    public var `hwndTarget`: `super`.`super`.`Foundation`.`HWND`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `RAWINPUTDEVICE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `RAWINPUTDEVICE`.Companion.`default`() : `RAWINPUTDEVICE` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RAWINPUTDEVICELIST` (
    public var `hDevice`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `dwType`: `RID_DEVICE_INFO_TYPE`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `RAWINPUTDEVICELIST`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `RAWINPUTDEVICELIST`.Companion.`default`() : `RAWINPUTDEVICELIST` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `RAWINPUTDEVICE_FLAGS` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RAWINPUTHEADER` (
    public var `dwType`: UInt,
    public var `dwSize`: UInt,
    public var `hDevice`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `wParam`: `super`.`super`.`Foundation`.`WPARAM`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `RAWINPUTHEADER`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `RAWINPUTHEADER`.Companion.`default`() : `RAWINPUTHEADER` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `RAWKEYBOARD` (
    public var `MakeCode`: UShort,
    public var `Flags`: UShort,
    public var `Reserved`: UShort,
    public var `VKey`: UShort,
    public var `Message`: UInt,
    public var `ExtraInformation`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RAWMOUSE` (
    public var `usFlags`: `MOUSE_STATE`,
    public var `Anonymous`: `RAWMOUSE_0`,
    public var `ulRawButtons`: UInt,
    public var `lLastX`: Int,
    public var `lLastY`: Int,
    public var `ulExtraInformation`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `RAWMOUSE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `RAWMOUSE`.Companion.`default`() : `RAWMOUSE` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 144:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union RAWMOUSE_0 {
//     pub ulButtons: u32,
//     pub Anonymous: RAWMOUSE_0_0,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `RAWMOUSE_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `RAWMOUSE_0`.Companion.`default`() : `RAWMOUSE_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `RAWMOUSE_0_0` (
    public var `usButtonFlags`: UShort,
    public var `usButtonData`: UShort,
)
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RID_DEVICE_INFO` (
    public var `cbSize`: UInt,
    public var `dwType`: `RID_DEVICE_INFO_TYPE`,
    public var `Anonymous`: `RID_DEVICE_INFO_0`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `RID_DEVICE_INFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `RID_DEVICE_INFO`.Companion.`default`() : `RID_DEVICE_INFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 188:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union RID_DEVICE_INFO_0 {
//     pub mouse: RID_DEVICE_INFO_MOUSE,
//     pub keyboard: RID_DEVICE_INFO_KEYBOARD,
//     pub hid: RID_DEVICE_INFO_HID,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `RID_DEVICE_INFO_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `RID_DEVICE_INFO_0`.Companion.`default`() : `RID_DEVICE_INFO_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `RID_DEVICE_INFO_HID` (
    public var `dwVendorId`: UInt,
    public var `dwProductId`: UInt,
    public var `dwVersionNumber`: UInt,
    public var `usUsagePage`: UShort,
    public var `usUsage`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `RID_DEVICE_INFO_KEYBOARD` (
    public var `dwType`: UInt,
    public var `dwSubType`: UInt,
    public var `dwKeyboardMode`: UInt,
    public var `dwNumberOfFunctionKeys`: UInt,
    public var `dwNumberOfIndicators`: UInt,
    public var `dwNumberOfKeysTotal`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `RID_DEVICE_INFO_MOUSE` (
    public var `dwId`: UInt,
    public var `dwNumberOfButtons`: UInt,
    public var `dwSampleRate`: UInt,
    public var `fHasHorizontalWheel`: `windows_sys`.`core`.`BOOL`,
)
public typealias `RID_DEVICE_INFO_TYPE` = UInt;
public const val `RID_HEADER`: `RAW_INPUT_DATA_COMMAND_FLAGS` = 268435461u;
public const val `RID_INPUT`: `RAW_INPUT_DATA_COMMAND_FLAGS` = 268435459u;
public const val `RIM_TYPEHID`: `RID_DEVICE_INFO_TYPE` = 2u;
public const val `RIM_TYPEKEYBOARD`: `RID_DEVICE_INFO_TYPE` = 1u;
public const val `RIM_TYPEMOUSE`: `RID_DEVICE_INFO_TYPE` = 0u;
