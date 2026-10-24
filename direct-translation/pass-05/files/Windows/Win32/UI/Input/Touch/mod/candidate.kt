// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=CloseGestureInfoHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CloseGestureInfoHandle`(`hgestureinfo` : `HGESTUREINFO`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=CloseTouchInputHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CloseTouchInputHandle`(`htouchinput` : `HTOUCHINPUT`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetGestureConfig; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetGestureConfig`(`hwnd` : `super`.`super`.`super`.`Foundation`.`HWND`, `dwreserved` : UInt, `dwflags` : UInt, `pcids` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pgestureconfig` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GESTURECONFIG`>?, `cbsize` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetGestureExtraArgs; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetGestureExtraArgs`(`hgestureinfo` : `HGESTUREINFO`, `cbextraargs` : UInt, `pextraargs` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetGestureInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetGestureInfo`(`hgestureinfo` : `HGESTUREINFO`, `pgestureinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GESTUREINFO`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetTouchInputInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetTouchInputInfo`(`htouchinput` : `HTOUCHINPUT`, `cinputs` : UInt, `pinputs` : /* Rust *mut */ kotlinx.cinterop.CPointer<`TOUCHINPUT`>?, `cbsize` : Int) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=IsTouchWindow; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsTouchWindow`(`hwnd` : `super`.`super`.`super`.`Foundation`.`HWND`, `pulflags` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=RegisterTouchWindow; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegisterTouchWindow`(`hwnd` : `super`.`super`.`super`.`Foundation`.`HWND`, `ulflags` : `REGISTER_TOUCH_WINDOW_FLAGS`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetGestureConfig; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetGestureConfig`(`hwnd` : `super`.`super`.`super`.`Foundation`.`HWND`, `dwreserved` : UInt, `cids` : UInt, `pgestureconfig` : /* Rust *const */ kotlinx.cinterop.CPointer<`GESTURECONFIG`>?, `cbsize` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=UnregisterTouchWindow; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UnregisterTouchWindow`(`hwnd` : `super`.`super`.`super`.`Foundation`.`HWND`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `GESTURECONFIG` (
    public var `dwID`: `GESTURECONFIG_ID`,
    public var `dwWant`: UInt,
    public var `dwBlock`: UInt,
)
public typealias `GESTURECONFIG_ID` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `GESTUREINFO` (
    public var `cbSize`: UInt,
    public var `dwFlags`: UInt,
    public var `dwID`: UInt,
    public var `hwndTarget`: `super`.`super`.`super`.`Foundation`.`HWND`,
    public var `ptsLocation`: `super`.`super`.`super`.`Foundation`.`POINTS`,
    public var `dwInstanceID`: UInt,
    public var `dwSequenceID`: UInt,
    public var `ullArguments`: ULong,
    public var `cbExtraArgs`: UInt,
)
// UNSUPPORTED Rust 32:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for GESTUREINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `GESTURENOTIFYSTRUCT` (
    public var `cbSize`: UInt,
    public var `dwFlags`: UInt,
    public var `hwndTarget`: `super`.`super`.`super`.`Foundation`.`HWND`,
    public var `ptsLocation`: `super`.`super`.`super`.`Foundation`.`POINTS`,
    public var `dwInstanceID`: UInt,
)
// UNSUPPORTED Rust 46:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HGESTUREINFO` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HTOUCHINPUT` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// UNSUPPORTED Rust 61:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const InertiaProcessor: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xabb27087_4ce0_4e58_a0cb_e24df96814be);

public const val `MANIPULATION_ALL`: `MANIPULATION_PROCESSOR_MANIPULATIONS` = 15;
public const val `MANIPULATION_NONE`: `MANIPULATION_PROCESSOR_MANIPULATIONS` = 0;
public typealias `MANIPULATION_PROCESSOR_MANIPULATIONS` = Int;
public const val `MANIPULATION_ROTATE`: `MANIPULATION_PROCESSOR_MANIPULATIONS` = 8;
public const val `MANIPULATION_SCALE`: `MANIPULATION_PROCESSOR_MANIPULATIONS` = 4;
public const val `MANIPULATION_TRANSLATE_X`: `MANIPULATION_PROCESSOR_MANIPULATIONS` = 1;
public const val `MANIPULATION_TRANSLATE_Y`: `MANIPULATION_PROCESSOR_MANIPULATIONS` = 2;
// UNSUPPORTED Rust 69:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TOUCHINPUT` (
    public var `x`: Int,
    public var `y`: Int,
    public var `hSource`: `super`.`super`.`super`.`Foundation`.`HANDLE`,
    public var `dwID`: UInt,
    public var `dwFlags`: `TOUCHEVENTF_FLAGS`,
    public var `dwMask`: `TOUCHINPUTMASKF_MASK`,
    public var `dwTime`: UInt,
    public var `dwExtraInfo`: ULong,
    public var `cxContact`: UInt,
    public var `cyContact`: UInt,
)
// UNSUPPORTED Rust 94:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
