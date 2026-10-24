// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("ninput.dll" "system" fn AddPointerInteractionContext(interactioncontext : HINTERACTIONCONTEXT, pointerid : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_UI_Input_Pointer", feature = "Win32_UI_WindowsAndMessaging"))]
// windows_link::link!("ninput.dll" "system" fn BufferPointerPacketsInteractionContext(interactioncontext : HINTERACTIONCONTEXT, entriescount : u32, pointerinfo : *const super::Input::Pointer:: POINTER_INFO) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("ninput.dll" "system" fn CreateInteractionContext(interactioncontext : *mut HINTERACTIONCONTEXT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("ninput.dll" "system" fn DestroyInteractionContext(interactioncontext : HINTERACTIONCONTEXT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("ninput.dll" "system" fn GetCrossSlideParameterInteractionContext(interactioncontext : HINTERACTIONCONTEXT, threshold : CROSS_SLIDE_THRESHOLD, distance : *mut f32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("ninput.dll" "system" fn GetHoldParameterInteractionContext(interactioncontext : HINTERACTIONCONTEXT, parameter : HOLD_PARAMETER, value : *mut f32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("ninput.dll" "system" fn GetInertiaParameterInteractionContext(interactioncontext : HINTERACTIONCONTEXT, inertiaparameter : INERTIA_PARAMETER, value : *mut f32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("ninput.dll" "system" fn GetInteractionConfigurationInteractionContext(interactioncontext : HINTERACTIONCONTEXT, configurationcount : u32, configuration : *mut INTERACTION_CONTEXT_CONFIGURATION) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("ninput.dll" "system" fn GetMouseWheelParameterInteractionContext(interactioncontext : HINTERACTIONCONTEXT, parameter : MOUSE_WHEEL_PARAMETER, value : *mut f32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("ninput.dll" "system" fn GetPropertyInteractionContext(interactioncontext : HINTERACTIONCONTEXT, contextproperty : INTERACTION_CONTEXT_PROPERTY, value : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_UI_Input_Pointer", feature = "Win32_UI_WindowsAndMessaging"))]
// windows_link::link!("ninput.dll" "system" fn GetStateInteractionContext(interactioncontext : HINTERACTIONCONTEXT, pointerinfo : *const super::Input::Pointer:: POINTER_INFO, state : *mut INTERACTION_STATE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// windows_link::link!("ninput.dll" "system" fn GetTapParameterInteractionContext(interactioncontext : HINTERACTIONCONTEXT, parameter : TAP_PARAMETER, value : *mut f32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// windows_link::link!("ninput.dll" "system" fn GetTranslationParameterInteractionContext(interactioncontext : HINTERACTIONCONTEXT, parameter : TRANSLATION_PARAMETER, value : *mut f32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// windows_link::link!("ninput.dll" "system" fn ProcessBufferedPacketsInteractionContext(interactioncontext : HINTERACTIONCONTEXT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// windows_link::link!("ninput.dll" "system" fn ProcessInertiaInteractionContext(interactioncontext : HINTERACTIONCONTEXT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_UI_Input_Pointer", feature = "Win32_UI_WindowsAndMessaging"))]
// windows_link::link!("ninput.dll" "system" fn ProcessPointerFramesInteractionContext(interactioncontext : HINTERACTIONCONTEXT, entriescount : u32, pointercount : u32, pointerinfo : *const super::Input::Pointer:: POINTER_INFO) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// windows_link::link!("ninput.dll" "system" fn RegisterOutputCallbackInteractionContext(interactioncontext : HINTERACTIONCONTEXT, outputcallback : INTERACTION_CONTEXT_OUTPUT_CALLBACK, clientdata : *const core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// windows_link::link!("ninput.dll" "system" fn RegisterOutputCallbackInteractionContext2(interactioncontext : HINTERACTIONCONTEXT, outputcallback : INTERACTION_CONTEXT_OUTPUT_CALLBACK2, clientdata : *const core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// windows_link::link!("ninput.dll" "system" fn RemovePointerInteractionContext(interactioncontext : HINTERACTIONCONTEXT, pointerid : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// windows_link::link!("ninput.dll" "system" fn ResetInteractionContext(interactioncontext : HINTERACTIONCONTEXT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// windows_link::link!("ninput.dll" "system" fn SetCrossSlideParametersInteractionContext(interactioncontext : HINTERACTIONCONTEXT, parametercount : u32, crossslideparameters : *const CROSS_SLIDE_PARAMETER) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// windows_link::link!("ninput.dll" "system" fn SetHoldParameterInteractionContext(interactioncontext : HINTERACTIONCONTEXT, parameter : HOLD_PARAMETER, value : f32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// windows_link::link!("ninput.dll" "system" fn SetInertiaParameterInteractionContext(interactioncontext : HINTERACTIONCONTEXT, inertiaparameter : INERTIA_PARAMETER, value : f32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 29:1: declaration Macro has no candidate rule
// windows_link::link!("ninput.dll" "system" fn SetInteractionConfigurationInteractionContext(interactioncontext : HINTERACTIONCONTEXT, configurationcount : u32, configuration : *const INTERACTION_CONTEXT_CONFIGURATION) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 30:1: declaration Macro has no candidate rule
// windows_link::link!("ninput.dll" "system" fn SetMouseWheelParameterInteractionContext(interactioncontext : HINTERACTIONCONTEXT, parameter : MOUSE_WHEEL_PARAMETER, value : f32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 31:1: declaration Macro has no candidate rule
// windows_link::link!("ninput.dll" "system" fn SetPivotInteractionContext(interactioncontext : HINTERACTIONCONTEXT, x : f32, y : f32, radius : f32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 32:1: declaration Macro has no candidate rule
// windows_link::link!("ninput.dll" "system" fn SetPropertyInteractionContext(interactioncontext : HINTERACTIONCONTEXT, contextproperty : INTERACTION_CONTEXT_PROPERTY, value : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 33:1: declaration Macro has no candidate rule
// windows_link::link!("ninput.dll" "system" fn SetTapParameterInteractionContext(interactioncontext : HINTERACTIONCONTEXT, parameter : TAP_PARAMETER, value : f32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 34:1: declaration Macro has no candidate rule
// windows_link::link!("ninput.dll" "system" fn SetTranslationParameterInteractionContext(interactioncontext : HINTERACTIONCONTEXT, parameter : TRANSLATION_PARAMETER, value : f32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 35:1: declaration Macro has no candidate rule
// windows_link::link!("ninput.dll" "system" fn StopInteractionContext(interactioncontext : HINTERACTIONCONTEXT) -> windows_sys::core::HRESULT);

public typealias `CROSS_SLIDE_FLAGS` = UInt;
public const val `CROSS_SLIDE_FLAGS_MAX`: `CROSS_SLIDE_FLAGS` = 4294967295u;
public const val `CROSS_SLIDE_FLAGS_NONE`: `CROSS_SLIDE_FLAGS` = 0u;
public const val `CROSS_SLIDE_FLAGS_REARRANGE`: `CROSS_SLIDE_FLAGS` = 4u;
public const val `CROSS_SLIDE_FLAGS_SELECT`: `CROSS_SLIDE_FLAGS` = 1u;
public const val `CROSS_SLIDE_FLAGS_SPEED_BUMP`: `CROSS_SLIDE_FLAGS` = 2u;
// UNSUPPORTED Rust 42:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CROSS_SLIDE_PARAMETER {
//     pub threshold: CROSS_SLIDE_THRESHOLD,
//     pub distance: f32,
// }

public typealias `CROSS_SLIDE_THRESHOLD` = Int;
public const val `CROSS_SLIDE_THRESHOLD_COUNT`: `CROSS_SLIDE_THRESHOLD` = 4;
public const val `CROSS_SLIDE_THRESHOLD_MAX`: `CROSS_SLIDE_THRESHOLD` = -1;
public const val `CROSS_SLIDE_THRESHOLD_REARRANGE_START`: `CROSS_SLIDE_THRESHOLD` = 3;
public const val `CROSS_SLIDE_THRESHOLD_SELECT_START`: `CROSS_SLIDE_THRESHOLD` = 0;
public const val `CROSS_SLIDE_THRESHOLD_SPEED_BUMP_END`: `CROSS_SLIDE_THRESHOLD` = 2;
public const val `CROSS_SLIDE_THRESHOLD_SPEED_BUMP_START`: `CROSS_SLIDE_THRESHOLD` = 1;
// UNSUPPORTED Rust 55:1: non-scalar type Ptr unsupported
// pub type HINTERACTIONCONTEXT = *mut core::ffi::c_void;

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
// UNSUPPORTED Rust 70:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct INTERACTION_ARGUMENTS_CROSS_SLIDE {
//     pub flags: CROSS_SLIDE_FLAGS,
// }

// UNSUPPORTED Rust 75:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct INTERACTION_ARGUMENTS_MANIPULATION {
//     pub delta: MANIPULATION_TRANSFORM,
//     pub cumulative: MANIPULATION_TRANSFORM,
//     pub velocity: MANIPULATION_VELOCITY,
//     pub railsState: MANIPULATION_RAILS_STATE,
// }

// UNSUPPORTED Rust 83:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct INTERACTION_ARGUMENTS_TAP {
//     pub count: u32,
// }

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
// UNSUPPORTED Rust 117:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct INTERACTION_CONTEXT_CONFIGURATION {
//     pub interactionId: INTERACTION_ID,
//     pub enable: INTERACTION_CONFIGURATION_FLAGS,
// }

// UNSUPPORTED Rust 123:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// #[derive(Clone, Copy)]
// pub struct INTERACTION_CONTEXT_OUTPUT {
//     pub interactionId: INTERACTION_ID,
//     pub interactionFlags: INTERACTION_FLAGS,
//     pub inputType: super::WindowsAndMessaging::POINTER_INPUT_TYPE,
//     pub x: f32,
//     pub y: f32,
//     pub arguments: INTERACTION_CONTEXT_OUTPUT_0,
// }

// UNSUPPORTED Rust 134:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// impl Default for INTERACTION_CONTEXT_OUTPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 140:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// #[derive(Clone, Copy)]
// pub union INTERACTION_CONTEXT_OUTPUT_0 {
//     pub manipulation: INTERACTION_ARGUMENTS_MANIPULATION,
//     pub tap: INTERACTION_ARGUMENTS_TAP,
//     pub crossSlide: INTERACTION_ARGUMENTS_CROSS_SLIDE,
// }

// UNSUPPORTED Rust 148:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// impl Default for INTERACTION_CONTEXT_OUTPUT_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 154:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// #[derive(Clone, Copy)]
// pub struct INTERACTION_CONTEXT_OUTPUT2 {
//     pub interactionId: INTERACTION_ID,
//     pub interactionFlags: INTERACTION_FLAGS,
//     pub inputType: super::WindowsAndMessaging::POINTER_INPUT_TYPE,
//     pub contactCount: u32,
//     pub currentContactCount: u32,
//     pub x: f32,
//     pub y: f32,
//     pub arguments: INTERACTION_CONTEXT_OUTPUT2_0,
// }

// UNSUPPORTED Rust 167:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// impl Default for INTERACTION_CONTEXT_OUTPUT2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 173:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// #[derive(Clone, Copy)]
// pub union INTERACTION_CONTEXT_OUTPUT2_0 {
//     pub manipulation: INTERACTION_ARGUMENTS_MANIPULATION,
//     pub tap: INTERACTION_ARGUMENTS_TAP,
//     pub crossSlide: INTERACTION_ARGUMENTS_CROSS_SLIDE,
// }

// UNSUPPORTED Rust 181:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// impl Default for INTERACTION_CONTEXT_OUTPUT2_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 187:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// pub type INTERACTION_CONTEXT_OUTPUT_CALLBACK = Option<unsafe extern "system" fn(clientdata: *const core::ffi::c_void, output: *const INTERACTION_CONTEXT_OUTPUT)>;

// UNSUPPORTED Rust 189:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// pub type INTERACTION_CONTEXT_OUTPUT_CALLBACK2 = Option<unsafe extern "system" fn(clientdata: *const core::ffi::c_void, output: *const INTERACTION_CONTEXT_OUTPUT2)>;

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
// UNSUPPORTED Rust 222:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MANIPULATION_TRANSFORM {
//     pub translationX: f32,
//     pub translationY: f32,
//     pub scale: f32,
//     pub expansion: f32,
//     pub rotation: f32,
// }

// UNSUPPORTED Rust 231:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MANIPULATION_VELOCITY {
//     pub velocityX: f32,
//     pub velocityY: f32,
//     pub velocityExpansion: f32,
//     pub velocityAngular: f32,
// }

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
