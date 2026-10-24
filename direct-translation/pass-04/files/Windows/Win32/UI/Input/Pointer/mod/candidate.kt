// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=EnableMouseInPointer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnableMouseInPointer`(`fenable` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetPointerCursorId; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetPointerCursorId`(`pointerid` : UInt, `cursorid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetPointerDevice; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_Controls"))]
public external fun `GetPointerDevice`(`device` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `pointerdevice` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Controls`.`POINTER_DEVICE_INFO`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetPointerDeviceCursors; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_Controls")]
public external fun `GetPointerDeviceCursors`(`device` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `cursorcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `devicecursors` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Controls`.`POINTER_DEVICE_CURSOR_INFO`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetPointerDeviceProperties; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_Controls")]
public external fun `GetPointerDeviceProperties`(`device` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `propertycount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pointerproperties` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Controls`.`POINTER_DEVICE_PROPERTY`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetPointerDeviceRects; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetPointerDeviceRects`(`device` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `pointerdevicerect` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`RECT`>?, `displayrect` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`RECT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetPointerDevices; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_Controls"))]
public external fun `GetPointerDevices`(`devicecount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pointerdevices` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Controls`.`POINTER_DEVICE_INFO`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetPointerFrameInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `GetPointerFrameInfo`(`pointerid` : UInt, `pointercount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pointerinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`POINTER_INFO`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetPointerFrameInfoHistory; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `GetPointerFrameInfoHistory`(`pointerid` : UInt, `entriescount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pointercount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pointerinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`POINTER_INFO`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetPointerFramePenInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `GetPointerFramePenInfo`(`pointerid` : UInt, `pointercount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `peninfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`POINTER_PEN_INFO`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetPointerFramePenInfoHistory; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `GetPointerFramePenInfoHistory`(`pointerid` : UInt, `entriescount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pointercount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `peninfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`POINTER_PEN_INFO`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetPointerFrameTouchInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `GetPointerFrameTouchInfo`(`pointerid` : UInt, `pointercount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `touchinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`POINTER_TOUCH_INFO`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetPointerFrameTouchInfoHistory; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `GetPointerFrameTouchInfoHistory`(`pointerid` : UInt, `entriescount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pointercount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `touchinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`POINTER_TOUCH_INFO`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetPointerInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `GetPointerInfo`(`pointerid` : UInt, `pointerinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`POINTER_INFO`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetPointerInfoHistory; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `GetPointerInfoHistory`(`pointerid` : UInt, `entriescount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pointerinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`POINTER_INFO`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetPointerInputTransform; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetPointerInputTransform`(`pointerid` : UInt, `historycount` : UInt, `inputtransform` : /* Rust *mut */ kotlinx.cinterop.CPointer<`INPUT_TRANSFORM`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetPointerPenInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `GetPointerPenInfo`(`pointerid` : UInt, `peninfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`POINTER_PEN_INFO`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetPointerPenInfoHistory; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `GetPointerPenInfoHistory`(`pointerid` : UInt, `entriescount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `peninfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`POINTER_PEN_INFO`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetPointerTouchInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `GetPointerTouchInfo`(`pointerid` : UInt, `touchinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`POINTER_TOUCH_INFO`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetPointerTouchInfoHistory; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `GetPointerTouchInfoHistory`(`pointerid` : UInt, `entriescount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `touchinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`POINTER_TOUCH_INFO`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetPointerType; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `GetPointerType`(`pointerid` : UInt, `pointertype` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`WindowsAndMessaging`.`POINTER_INPUT_TYPE`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetRawPointerDeviceData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_Controls")]
public external fun `GetRawPointerDeviceData`(`pointerid` : UInt, `historycount` : UInt, `propertiescount` : UInt, `pproperties` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Controls`.`POINTER_DEVICE_PROPERTY`>?, `pvalues` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetUnpredictedMessagePos; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetUnpredictedMessagePos`() : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=InitializeTouchInjection; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InitializeTouchInjection`(`maxcount` : UInt, `dwmode` : `TOUCH_FEEDBACK_MODE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=InjectSyntheticPointerInput; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_UI_Controls", feature = "Win32_UI_WindowsAndMessaging"))]
public external fun `InjectSyntheticPointerInput`(`device` : `super`.`super`.`Controls`.`HSYNTHETICPOINTERDEVICE`, `pointerinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Controls`.`POINTER_TYPE_INFO`>?, `count` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=InjectTouchInput; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `InjectTouchInput`(`count` : UInt, `contacts` : /* Rust *const */ kotlinx.cinterop.CPointer<`POINTER_TOUCH_INFO`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=IsMouseInPointerEnabled; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsMouseInPointerEnabled`() : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SkipPointerFrameMessages; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SkipPointerFrameMessages`(`pointerid` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `INPUT_INJECTION_VALUE` (
    public var `page`: UShort,
    public var `usage`: UShort,
    public var `value`: Int,
    public var `index`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `INPUT_TRANSFORM` (
    public var `Anonymous`: `INPUT_TRANSFORM_0`,
)
// UNSUPPORTED Rust 62:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for INPUT_TRANSFORM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 67:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union INPUT_TRANSFORM_0 {
//     pub Anonymous: INPUT_TRANSFORM_0_0,
//     pub m: [f32; 16],
// }

// UNSUPPORTED Rust 73:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for INPUT_TRANSFORM_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `INPUT_TRANSFORM_0_0` (
    public var `_11`: Float,
    public var `_12`: Float,
    public var `_13`: Float,
    public var `_14`: Float,
    public var `_21`: Float,
    public var `_22`: Float,
    public var `_23`: Float,
    public var `_24`: Float,
    public var `_31`: Float,
    public var `_32`: Float,
    public var `_33`: Float,
    public var `_34`: Float,
    public var `_41`: Float,
    public var `_42`: Float,
    public var `_43`: Float,
    public var `_44`: Float,
)
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `POINTER_INFO` (
    public var `pointerType`: `super`.`super`.`WindowsAndMessaging`.`POINTER_INPUT_TYPE`,
    public var `pointerId`: UInt,
    public var `frameId`: UInt,
    public var `pointerFlags`: `POINTER_FLAGS`,
    public var `sourceDevice`: `super`.`super`.`super`.`Foundation`.`HANDLE`,
    public var `hwndTarget`: `super`.`super`.`super`.`Foundation`.`HWND`,
    public var `ptPixelLocation`: `super`.`super`.`super`.`Foundation`.`POINT`,
    public var `ptHimetricLocation`: `super`.`super`.`super`.`Foundation`.`POINT`,
    public var `ptPixelLocationRaw`: `super`.`super`.`super`.`Foundation`.`POINT`,
    public var `ptHimetricLocationRaw`: `super`.`super`.`super`.`Foundation`.`POINT`,
    public var `dwTime`: UInt,
    public var `historyCount`: UInt,
    public var `InputData`: Int,
    public var `dwKeyStates`: UInt,
    public var `PerformanceCount`: ULong,
    public var `ButtonChangeType`: `POINTER_BUTTON_CHANGE_TYPE`,
)
// UNSUPPORTED Rust 151:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// impl Default for POINTER_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `POINTER_PEN_INFO` (
    public var `pointerInfo`: `POINTER_INFO`,
    public var `penFlags`: UInt,
    public var `penMask`: UInt,
    public var `pressure`: UInt,
    public var `rotation`: UInt,
    public var `tiltX`: Int,
    public var `tiltY`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `POINTER_TOUCH_INFO` (
    public var `pointerInfo`: `POINTER_INFO`,
    public var `touchFlags`: UInt,
    public var `touchMask`: UInt,
    public var `rcContact`: `super`.`super`.`super`.`Foundation`.`RECT`,
    public var `rcContactRaw`: `super`.`super`.`super`.`Foundation`.`RECT`,
    public var `orientation`: UInt,
    public var `pressure`: UInt,
)
public const val `TOUCH_FEEDBACK_DEFAULT`: `TOUCH_FEEDBACK_MODE` = 1u;
public const val `TOUCH_FEEDBACK_INDIRECT`: `TOUCH_FEEDBACK_MODE` = 2u;
public typealias `TOUCH_FEEDBACK_MODE` = UInt;
public const val `TOUCH_FEEDBACK_NONE`: `TOUCH_FEEDBACK_MODE` = 3u;
