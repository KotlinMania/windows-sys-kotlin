// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ninput.dll, ABI=system, export=AddPointerInteractionContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AddPointerInteractionContext`(`interactioncontext` : `HINTERACTIONCONTEXT`, `pointerid` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ninput.dll, ABI=system, export=BufferPointerPacketsInteractionContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_UI_Input_Pointer", feature = "Win32_UI_WindowsAndMessaging"))]
public external fun `BufferPointerPacketsInteractionContext`(`interactioncontext` : `HINTERACTIONCONTEXT`, `entriescount` : UInt, `pointerinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Input`.`Pointer`.`POINTER_INFO`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ninput.dll, ABI=system, export=CreateInteractionContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateInteractionContext`(`interactioncontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HINTERACTIONCONTEXT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ninput.dll, ABI=system, export=DestroyInteractionContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DestroyInteractionContext`(`interactioncontext` : `HINTERACTIONCONTEXT`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ninput.dll, ABI=system, export=GetCrossSlideParameterInteractionContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetCrossSlideParameterInteractionContext`(`interactioncontext` : `HINTERACTIONCONTEXT`, `threshold` : `CROSS_SLIDE_THRESHOLD`, `distance` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ninput.dll, ABI=system, export=GetHoldParameterInteractionContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetHoldParameterInteractionContext`(`interactioncontext` : `HINTERACTIONCONTEXT`, `parameter` : `HOLD_PARAMETER`, `value` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ninput.dll, ABI=system, export=GetInertiaParameterInteractionContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetInertiaParameterInteractionContext`(`interactioncontext` : `HINTERACTIONCONTEXT`, `inertiaparameter` : `INERTIA_PARAMETER`, `value` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ninput.dll, ABI=system, export=GetInteractionConfigurationInteractionContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetInteractionConfigurationInteractionContext`(`interactioncontext` : `HINTERACTIONCONTEXT`, `configurationcount` : UInt, `configuration` : /* Rust *mut */ kotlinx.cinterop.CPointer<`INTERACTION_CONTEXT_CONFIGURATION`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ninput.dll, ABI=system, export=GetMouseWheelParameterInteractionContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetMouseWheelParameterInteractionContext`(`interactioncontext` : `HINTERACTIONCONTEXT`, `parameter` : `MOUSE_WHEEL_PARAMETER`, `value` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ninput.dll, ABI=system, export=GetPropertyInteractionContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetPropertyInteractionContext`(`interactioncontext` : `HINTERACTIONCONTEXT`, `contextproperty` : `INTERACTION_CONTEXT_PROPERTY`, `value` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ninput.dll, ABI=system, export=GetStateInteractionContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_UI_Input_Pointer", feature = "Win32_UI_WindowsAndMessaging"))]
public external fun `GetStateInteractionContext`(`interactioncontext` : `HINTERACTIONCONTEXT`, `pointerinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Input`.`Pointer`.`POINTER_INFO`>?, `state` : /* Rust *mut */ kotlinx.cinterop.CPointer<`INTERACTION_STATE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ninput.dll, ABI=system, export=GetTapParameterInteractionContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetTapParameterInteractionContext`(`interactioncontext` : `HINTERACTIONCONTEXT`, `parameter` : `TAP_PARAMETER`, `value` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ninput.dll, ABI=system, export=GetTranslationParameterInteractionContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetTranslationParameterInteractionContext`(`interactioncontext` : `HINTERACTIONCONTEXT`, `parameter` : `TRANSLATION_PARAMETER`, `value` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ninput.dll, ABI=system, export=ProcessBufferedPacketsInteractionContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ProcessBufferedPacketsInteractionContext`(`interactioncontext` : `HINTERACTIONCONTEXT`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ninput.dll, ABI=system, export=ProcessInertiaInteractionContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ProcessInertiaInteractionContext`(`interactioncontext` : `HINTERACTIONCONTEXT`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ninput.dll, ABI=system, export=ProcessPointerFramesInteractionContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_UI_Input_Pointer", feature = "Win32_UI_WindowsAndMessaging"))]
public external fun `ProcessPointerFramesInteractionContext`(`interactioncontext` : `HINTERACTIONCONTEXT`, `entriescount` : UInt, `pointercount` : UInt, `pointerinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Input`.`Pointer`.`POINTER_INFO`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ninput.dll, ABI=system, export=RegisterOutputCallbackInteractionContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `RegisterOutputCallbackInteractionContext`(`interactioncontext` : `HINTERACTIONCONTEXT`, `outputcallback` : `INTERACTION_CONTEXT_OUTPUT_CALLBACK`, `clientdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ninput.dll, ABI=system, export=RegisterOutputCallbackInteractionContext2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `RegisterOutputCallbackInteractionContext2`(`interactioncontext` : `HINTERACTIONCONTEXT`, `outputcallback` : `INTERACTION_CONTEXT_OUTPUT_CALLBACK2`, `clientdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ninput.dll, ABI=system, export=RemovePointerInteractionContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RemovePointerInteractionContext`(`interactioncontext` : `HINTERACTIONCONTEXT`, `pointerid` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ninput.dll, ABI=system, export=ResetInteractionContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ResetInteractionContext`(`interactioncontext` : `HINTERACTIONCONTEXT`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ninput.dll, ABI=system, export=SetCrossSlideParametersInteractionContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetCrossSlideParametersInteractionContext`(`interactioncontext` : `HINTERACTIONCONTEXT`, `parametercount` : UInt, `crossslideparameters` : /* Rust *const */ kotlinx.cinterop.CPointer<`CROSS_SLIDE_PARAMETER`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ninput.dll, ABI=system, export=SetHoldParameterInteractionContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetHoldParameterInteractionContext`(`interactioncontext` : `HINTERACTIONCONTEXT`, `parameter` : `HOLD_PARAMETER`, `value` : Float) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ninput.dll, ABI=system, export=SetInertiaParameterInteractionContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetInertiaParameterInteractionContext`(`interactioncontext` : `HINTERACTIONCONTEXT`, `inertiaparameter` : `INERTIA_PARAMETER`, `value` : Float) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ninput.dll, ABI=system, export=SetInteractionConfigurationInteractionContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetInteractionConfigurationInteractionContext`(`interactioncontext` : `HINTERACTIONCONTEXT`, `configurationcount` : UInt, `configuration` : /* Rust *const */ kotlinx.cinterop.CPointer<`INTERACTION_CONTEXT_CONFIGURATION`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ninput.dll, ABI=system, export=SetMouseWheelParameterInteractionContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetMouseWheelParameterInteractionContext`(`interactioncontext` : `HINTERACTIONCONTEXT`, `parameter` : `MOUSE_WHEEL_PARAMETER`, `value` : Float) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ninput.dll, ABI=system, export=SetPivotInteractionContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetPivotInteractionContext`(`interactioncontext` : `HINTERACTIONCONTEXT`, `x` : Float, `y` : Float, `radius` : Float) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ninput.dll, ABI=system, export=SetPropertyInteractionContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetPropertyInteractionContext`(`interactioncontext` : `HINTERACTIONCONTEXT`, `contextproperty` : `INTERACTION_CONTEXT_PROPERTY`, `value` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ninput.dll, ABI=system, export=SetTapParameterInteractionContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetTapParameterInteractionContext`(`interactioncontext` : `HINTERACTIONCONTEXT`, `parameter` : `TAP_PARAMETER`, `value` : Float) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ninput.dll, ABI=system, export=SetTranslationParameterInteractionContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetTranslationParameterInteractionContext`(`interactioncontext` : `HINTERACTIONCONTEXT`, `parameter` : `TRANSLATION_PARAMETER`, `value` : Float) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ninput.dll, ABI=system, export=StopInteractionContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `StopInteractionContext`(`interactioncontext` : `HINTERACTIONCONTEXT`) : `windows_sys`.`core`.`HRESULT`
public typealias `CROSS_SLIDE_FLAGS` = UInt;
public const val `CROSS_SLIDE_FLAGS_MAX`: `CROSS_SLIDE_FLAGS` = 4294967295u;
public const val `CROSS_SLIDE_FLAGS_NONE`: `CROSS_SLIDE_FLAGS` = 0u;
public const val `CROSS_SLIDE_FLAGS_REARRANGE`: `CROSS_SLIDE_FLAGS` = 4u;
public const val `CROSS_SLIDE_FLAGS_SELECT`: `CROSS_SLIDE_FLAGS` = 1u;
public const val `CROSS_SLIDE_FLAGS_SPEED_BUMP`: `CROSS_SLIDE_FLAGS` = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CROSS_SLIDE_PARAMETER` (
    public var `threshold`: `CROSS_SLIDE_THRESHOLD`,
    public var `distance`: Float,
)
public typealias `CROSS_SLIDE_THRESHOLD` = Int;
public const val `CROSS_SLIDE_THRESHOLD_COUNT`: `CROSS_SLIDE_THRESHOLD` = 4;
public const val `CROSS_SLIDE_THRESHOLD_MAX`: `CROSS_SLIDE_THRESHOLD` = -1;
public const val `CROSS_SLIDE_THRESHOLD_REARRANGE_START`: `CROSS_SLIDE_THRESHOLD` = 3;
public const val `CROSS_SLIDE_THRESHOLD_SELECT_START`: `CROSS_SLIDE_THRESHOLD` = 0;
public const val `CROSS_SLIDE_THRESHOLD_SPEED_BUMP_END`: `CROSS_SLIDE_THRESHOLD` = 2;
public const val `CROSS_SLIDE_THRESHOLD_SPEED_BUMP_START`: `CROSS_SLIDE_THRESHOLD` = 1;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HINTERACTIONCONTEXT` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
public typealias `HOLD_PARAMETER` = Int;
public const val `HOLD_PARAMETER_MAX`: `HOLD_PARAMETER` = -1;
public const val `HOLD_PARAMETER_MAX_CONTACT_COUNT`: `HOLD_PARAMETER` = 1;
public const val `HOLD_PARAMETER_MIN_CONTACT_COUNT`: `HOLD_PARAMETER` = 0;
public const val `HOLD_PARAMETER_THRESHOLD_RADIUS`: `HOLD_PARAMETER` = 2;
public const val `HOLD_PARAMETER_THRESHOLD_START_DELAY`: `HOLD_PARAMETER` = 3;
public typealias `INERTIA_PARAMETER` = Int;
public const val `INERTIA_PARAMETER_EXPANSION_DECELERATION`: `INERTIA_PARAMETER` = 5;
public const val `INERTIA_PARAMETER_EXPANSION_EXPANSION`: `INERTIA_PARAMETER` = 6;
public const val `INERTIA_PARAMETER_MAX`: `INERTIA_PARAMETER` = -1;
public const val `INERTIA_PARAMETER_ROTATION_ANGLE`: `INERTIA_PARAMETER` = 4;
public const val `INERTIA_PARAMETER_ROTATION_DECELERATION`: `INERTIA_PARAMETER` = 3;
public const val `INERTIA_PARAMETER_TRANSLATION_DECELERATION`: `INERTIA_PARAMETER` = 1;
public const val `INERTIA_PARAMETER_TRANSLATION_DISPLACEMENT`: `INERTIA_PARAMETER` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `INTERACTION_ARGUMENTS_CROSS_SLIDE` (
    public var `flags`: `CROSS_SLIDE_FLAGS`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `INTERACTION_ARGUMENTS_MANIPULATION` (
    public var `delta`: `MANIPULATION_TRANSFORM`,
    public var `cumulative`: `MANIPULATION_TRANSFORM`,
    public var `velocity`: `MANIPULATION_VELOCITY`,
    public var `railsState`: `MANIPULATION_RAILS_STATE`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `INTERACTION_ARGUMENTS_TAP` (
    public var `count`: UInt,
)
public typealias `INTERACTION_CONFIGURATION_FLAGS` = UInt;
public const val `INTERACTION_CONFIGURATION_FLAG_CROSS_SLIDE`: `INTERACTION_CONFIGURATION_FLAGS` = 1u;
public const val `INTERACTION_CONFIGURATION_FLAG_CROSS_SLIDE_EXACT`: `INTERACTION_CONFIGURATION_FLAGS` = 32u;
public const val `INTERACTION_CONFIGURATION_FLAG_CROSS_SLIDE_HORIZONTAL`: `INTERACTION_CONFIGURATION_FLAGS` = 2u;
public const val `INTERACTION_CONFIGURATION_FLAG_CROSS_SLIDE_REARRANGE`: `INTERACTION_CONFIGURATION_FLAGS` = 16u;
public const val `INTERACTION_CONFIGURATION_FLAG_CROSS_SLIDE_SELECT`: `INTERACTION_CONFIGURATION_FLAGS` = 4u;
public const val `INTERACTION_CONFIGURATION_FLAG_CROSS_SLIDE_SPEED_BUMP`: `INTERACTION_CONFIGURATION_FLAGS` = 8u;
public const val `INTERACTION_CONFIGURATION_FLAG_DRAG`: `INTERACTION_CONFIGURATION_FLAGS` = 1u;
public const val `INTERACTION_CONFIGURATION_FLAG_HOLD`: `INTERACTION_CONFIGURATION_FLAGS` = 1u;
public const val `INTERACTION_CONFIGURATION_FLAG_HOLD_MOUSE`: `INTERACTION_CONFIGURATION_FLAGS` = 2u;
public const val `INTERACTION_CONFIGURATION_FLAG_HOLD_MULTIPLE_FINGER`: `INTERACTION_CONFIGURATION_FLAGS` = 4u;
public const val `INTERACTION_CONFIGURATION_FLAG_MANIPULATION`: `INTERACTION_CONFIGURATION_FLAGS` = 1u;
public const val `INTERACTION_CONFIGURATION_FLAG_MANIPULATION_EXACT`: `INTERACTION_CONFIGURATION_FLAGS` = 1024u;
public const val `INTERACTION_CONFIGURATION_FLAG_MANIPULATION_MULTIPLE_FINGER_PANNING`: `INTERACTION_CONFIGURATION_FLAGS` = 2048u;
public const val `INTERACTION_CONFIGURATION_FLAG_MANIPULATION_RAILS_X`: `INTERACTION_CONFIGURATION_FLAGS` = 256u;
public const val `INTERACTION_CONFIGURATION_FLAG_MANIPULATION_RAILS_Y`: `INTERACTION_CONFIGURATION_FLAGS` = 512u;
public const val `INTERACTION_CONFIGURATION_FLAG_MANIPULATION_ROTATION`: `INTERACTION_CONFIGURATION_FLAGS` = 8u;
public const val `INTERACTION_CONFIGURATION_FLAG_MANIPULATION_ROTATION_INERTIA`: `INTERACTION_CONFIGURATION_FLAGS` = 64u;
public const val `INTERACTION_CONFIGURATION_FLAG_MANIPULATION_SCALING`: `INTERACTION_CONFIGURATION_FLAGS` = 16u;
public const val `INTERACTION_CONFIGURATION_FLAG_MANIPULATION_SCALING_INERTIA`: `INTERACTION_CONFIGURATION_FLAGS` = 128u;
public const val `INTERACTION_CONFIGURATION_FLAG_MANIPULATION_TRANSLATION_INERTIA`: `INTERACTION_CONFIGURATION_FLAGS` = 32u;
public const val `INTERACTION_CONFIGURATION_FLAG_MANIPULATION_TRANSLATION_X`: `INTERACTION_CONFIGURATION_FLAGS` = 2u;
public const val `INTERACTION_CONFIGURATION_FLAG_MANIPULATION_TRANSLATION_Y`: `INTERACTION_CONFIGURATION_FLAGS` = 4u;
public const val `INTERACTION_CONFIGURATION_FLAG_MAX`: `INTERACTION_CONFIGURATION_FLAGS` = 4294967295u;
public const val `INTERACTION_CONFIGURATION_FLAG_NONE`: `INTERACTION_CONFIGURATION_FLAGS` = 0u;
public const val `INTERACTION_CONFIGURATION_FLAG_SECONDARY_TAP`: `INTERACTION_CONFIGURATION_FLAGS` = 1u;
public const val `INTERACTION_CONFIGURATION_FLAG_TAP`: `INTERACTION_CONFIGURATION_FLAGS` = 1u;
public const val `INTERACTION_CONFIGURATION_FLAG_TAP_DOUBLE`: `INTERACTION_CONFIGURATION_FLAGS` = 2u;
public const val `INTERACTION_CONFIGURATION_FLAG_TAP_MULTIPLE_FINGER`: `INTERACTION_CONFIGURATION_FLAGS` = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `INTERACTION_CONTEXT_CONFIGURATION` (
    public var `interactionId`: `INTERACTION_ID`,
    public var `enable`: `INTERACTION_CONFIGURATION_FLAGS`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `INTERACTION_CONTEXT_OUTPUT` (
    public var `interactionId`: `INTERACTION_ID`,
    public var `interactionFlags`: `INTERACTION_FLAGS`,
    public var `inputType`: `super`.`WindowsAndMessaging`.`POINTER_INPUT_TYPE`,
    public var `x`: Float,
    public var `y`: Float,
    public var `arguments`: `INTERACTION_CONTEXT_OUTPUT_0`,
)
// UNSUPPORTED Rust 134:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// impl Default for INTERACTION_CONTEXT_OUTPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 140:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// #[derive(Clone, Copy)]
// pub union INTERACTION_CONTEXT_OUTPUT_0 {
//     pub manipulation: INTERACTION_ARGUMENTS_MANIPULATION,
//     pub tap: INTERACTION_ARGUMENTS_TAP,
//     pub crossSlide: INTERACTION_ARGUMENTS_CROSS_SLIDE,
// }

// UNSUPPORTED Rust 148:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// impl Default for INTERACTION_CONTEXT_OUTPUT_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `INTERACTION_CONTEXT_OUTPUT2` (
    public var `interactionId`: `INTERACTION_ID`,
    public var `interactionFlags`: `INTERACTION_FLAGS`,
    public var `inputType`: `super`.`WindowsAndMessaging`.`POINTER_INPUT_TYPE`,
    public var `contactCount`: UInt,
    public var `currentContactCount`: UInt,
    public var `x`: Float,
    public var `y`: Float,
    public var `arguments`: `INTERACTION_CONTEXT_OUTPUT2_0`,
)
// UNSUPPORTED Rust 167:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// impl Default for INTERACTION_CONTEXT_OUTPUT2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 173:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// #[derive(Clone, Copy)]
// pub union INTERACTION_CONTEXT_OUTPUT2_0 {
//     pub manipulation: INTERACTION_ARGUMENTS_MANIPULATION,
//     pub tap: INTERACTION_ARGUMENTS_TAP,
//     pub crossSlide: INTERACTION_ARGUMENTS_CROSS_SLIDE,
// }

// UNSUPPORTED Rust 181:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// impl Default for INTERACTION_CONTEXT_OUTPUT2_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public typealias `INTERACTION_CONTEXT_OUTPUT_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`INTERACTION_CONTEXT_OUTPUT`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public typealias `INTERACTION_CONTEXT_OUTPUT_CALLBACK2` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`INTERACTION_CONTEXT_OUTPUT2`>?) -> Unit>>>;
public typealias `INTERACTION_CONTEXT_PROPERTY` = Int;
public const val `INTERACTION_CONTEXT_PROPERTY_FILTER_POINTERS`: `INTERACTION_CONTEXT_PROPERTY` = 3;
public const val `INTERACTION_CONTEXT_PROPERTY_INTERACTION_UI_FEEDBACK`: `INTERACTION_CONTEXT_PROPERTY` = 2;
public const val `INTERACTION_CONTEXT_PROPERTY_MAX`: `INTERACTION_CONTEXT_PROPERTY` = -1;
public const val `INTERACTION_CONTEXT_PROPERTY_MEASUREMENT_UNITS`: `INTERACTION_CONTEXT_PROPERTY` = 1;
public typealias `INTERACTION_FLAGS` = UInt;
public const val `INTERACTION_FLAG_BEGIN`: `INTERACTION_FLAGS` = 1u;
public const val `INTERACTION_FLAG_CANCEL`: `INTERACTION_FLAGS` = 4u;
public const val `INTERACTION_FLAG_END`: `INTERACTION_FLAGS` = 2u;
public const val `INTERACTION_FLAG_INERTIA`: `INTERACTION_FLAGS` = 8u;
public const val `INTERACTION_FLAG_MAX`: `INTERACTION_FLAGS` = 4294967295u;
public const val `INTERACTION_FLAG_NONE`: `INTERACTION_FLAGS` = 0u;
public typealias `INTERACTION_ID` = Int;
public const val `INTERACTION_ID_CROSS_SLIDE`: `INTERACTION_ID` = 6;
public const val `INTERACTION_ID_DRAG`: `INTERACTION_ID` = 5;
public const val `INTERACTION_ID_HOLD`: `INTERACTION_ID` = 4;
public const val `INTERACTION_ID_MANIPULATION`: `INTERACTION_ID` = 1;
public const val `INTERACTION_ID_MAX`: `INTERACTION_ID` = -1;
public const val `INTERACTION_ID_NONE`: `INTERACTION_ID` = 0;
public const val `INTERACTION_ID_SECONDARY_TAP`: `INTERACTION_ID` = 3;
public const val `INTERACTION_ID_TAP`: `INTERACTION_ID` = 2;
public typealias `INTERACTION_STATE` = Int;
public const val `INTERACTION_STATE_IDLE`: `INTERACTION_STATE` = 0;
public const val `INTERACTION_STATE_IN_INTERACTION`: `INTERACTION_STATE` = 1;
public const val `INTERACTION_STATE_MAX`: `INTERACTION_STATE` = -1;
public const val `INTERACTION_STATE_POSSIBLE_DOUBLE_TAP`: `INTERACTION_STATE` = 2;
public typealias `MANIPULATION_RAILS_STATE` = Int;
public const val `MANIPULATION_RAILS_STATE_FREE`: `MANIPULATION_RAILS_STATE` = 1;
public const val `MANIPULATION_RAILS_STATE_MAX`: `MANIPULATION_RAILS_STATE` = -1;
public const val `MANIPULATION_RAILS_STATE_RAILED`: `MANIPULATION_RAILS_STATE` = 2;
public const val `MANIPULATION_RAILS_STATE_UNDECIDED`: `MANIPULATION_RAILS_STATE` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MANIPULATION_TRANSFORM` (
    public var `translationX`: Float,
    public var `translationY`: Float,
    public var `scale`: Float,
    public var `expansion`: Float,
    public var `rotation`: Float,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MANIPULATION_VELOCITY` (
    public var `velocityX`: Float,
    public var `velocityY`: Float,
    public var `velocityExpansion`: Float,
    public var `velocityAngular`: Float,
)
public typealias `MOUSE_WHEEL_PARAMETER` = Int;
public const val `MOUSE_WHEEL_PARAMETER_CHAR_TRANSLATION_X`: `MOUSE_WHEEL_PARAMETER` = 1;
public const val `MOUSE_WHEEL_PARAMETER_CHAR_TRANSLATION_Y`: `MOUSE_WHEEL_PARAMETER` = 2;
public const val `MOUSE_WHEEL_PARAMETER_DELTA_ROTATION`: `MOUSE_WHEEL_PARAMETER` = 4;
public const val `MOUSE_WHEEL_PARAMETER_DELTA_SCALE`: `MOUSE_WHEEL_PARAMETER` = 3;
public const val `MOUSE_WHEEL_PARAMETER_MAX`: `MOUSE_WHEEL_PARAMETER` = -1;
public const val `MOUSE_WHEEL_PARAMETER_PAGE_TRANSLATION_X`: `MOUSE_WHEEL_PARAMETER` = 5;
public const val `MOUSE_WHEEL_PARAMETER_PAGE_TRANSLATION_Y`: `MOUSE_WHEEL_PARAMETER` = 6;
public typealias `TAP_PARAMETER` = Int;
public const val `TAP_PARAMETER_MAX`: `TAP_PARAMETER` = -1;
public const val `TAP_PARAMETER_MAX_CONTACT_COUNT`: `TAP_PARAMETER` = 1;
public const val `TAP_PARAMETER_MIN_CONTACT_COUNT`: `TAP_PARAMETER` = 0;
public typealias `TRANSLATION_PARAMETER` = Int;
public const val `TRANSLATION_PARAMETER_MAX`: `TRANSLATION_PARAMETER` = -1;
public const val `TRANSLATION_PARAMETER_MAX_CONTACT_COUNT`: `TRANSLATION_PARAMETER` = 1;
public const val `TRANSLATION_PARAMETER_MIN_CONTACT_COUNT`: `TRANSLATION_PARAMETER` = 0;
