// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// windows_link::link!("user32.dll" "system" fn AdjustWindowRectExForDpi(lprect : *mut super::super::Foundation:: RECT, dwstyle : super::WindowsAndMessaging:: WINDOW_STYLE, bmenu : windows_sys::core::BOOL, dwexstyle : super::WindowsAndMessaging:: WINDOW_EX_STYLE, dpi : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn AreDpiAwarenessContextsEqual(dpicontexta : DPI_AWARENESS_CONTEXT, dpicontextb : DPI_AWARENESS_CONTEXT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn EnableNonClientDpiScaling(hwnd : super::super::Foundation:: HWND) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn GetAwarenessFromDpiAwarenessContext(value : DPI_AWARENESS_CONTEXT) -> DPI_AWARENESS);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn GetDialogControlDpiChangeBehavior(hwnd : super::super::Foundation:: HWND) -> DIALOG_CONTROL_DPI_CHANGE_BEHAVIORS);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn GetDialogDpiChangeBehavior(hdlg : super::super::Foundation:: HWND) -> DIALOG_DPI_CHANGE_BEHAVIORS);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn GetDpiAwarenessContextForProcess(hprocess : super::super::Foundation:: HANDLE) -> DPI_AWARENESS_CONTEXT);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("api-ms-win-shcore-scaling-l1-1-1.dll" "system" fn GetDpiForMonitor(hmonitor : super::super::Graphics::Gdi:: HMONITOR, dpitype : MONITOR_DPI_TYPE, dpix : *mut u32, dpiy : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn GetDpiForSystem() -> u32);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn GetDpiForWindow(hwnd : super::super::Foundation:: HWND) -> u32);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn GetDpiFromDpiAwarenessContext(value : DPI_AWARENESS_CONTEXT) -> u32);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-shcore-scaling-l1-1-1.dll" "system" fn GetProcessDpiAwareness(hprocess : super::super::Foundation:: HANDLE, value : *mut PROCESS_DPI_AWARENESS) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn GetSystemDpiForProcess(hprocess : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// windows_link::link!("user32.dll" "system" fn GetSystemMetricsForDpi(nindex : super::WindowsAndMessaging:: SYSTEM_METRICS_INDEX, dpi : u32) -> i32);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn GetThreadDpiAwarenessContext() -> DPI_AWARENESS_CONTEXT);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn GetThreadDpiHostingBehavior() -> DPI_HOSTING_BEHAVIOR);

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn GetWindowDpiAwarenessContext(hwnd : super::super::Foundation:: HWND) -> DPI_AWARENESS_CONTEXT);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn GetWindowDpiHostingBehavior(hwnd : super::super::Foundation:: HWND) -> DPI_HOSTING_BEHAVIOR);

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn IsValidDpiAwarenessContext(value : DPI_AWARENESS_CONTEXT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn LogicalToPhysicalPointForPerMonitorDPI(hwnd : super::super::Foundation:: HWND, lppoint : *mut super::super::Foundation:: POINT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_Controls")]
// windows_link::link!("uxtheme.dll" "system" fn OpenThemeDataForDpi(hwnd : super::super::Foundation:: HWND, pszclasslist : windows_sys::core::PCWSTR, dpi : u32) -> super::Controls:: HTHEME);

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn PhysicalToLogicalPointForPerMonitorDPI(hwnd : super::super::Foundation:: HWND, lppoint : *mut super::super::Foundation:: POINT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn SetDialogControlDpiChangeBehavior(hwnd : super::super::Foundation:: HWND, mask : DIALOG_CONTROL_DPI_CHANGE_BEHAVIORS, values : DIALOG_CONTROL_DPI_CHANGE_BEHAVIORS) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn SetDialogDpiChangeBehavior(hdlg : super::super::Foundation:: HWND, mask : DIALOG_DPI_CHANGE_BEHAVIORS, values : DIALOG_DPI_CHANGE_BEHAVIORS) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 29:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-shcore-scaling-l1-1-1.dll" "system" fn SetProcessDpiAwareness(value : PROCESS_DPI_AWARENESS) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 30:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn SetProcessDpiAwarenessContext(value : DPI_AWARENESS_CONTEXT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 31:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn SetThreadDpiAwarenessContext(dpicontext : DPI_AWARENESS_CONTEXT) -> DPI_AWARENESS_CONTEXT);

// UNSUPPORTED Rust 32:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn SetThreadDpiHostingBehavior(value : DPI_HOSTING_BEHAVIOR) -> DPI_HOSTING_BEHAVIOR);

// UNSUPPORTED Rust 33:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn SystemParametersInfoForDpi(uiaction : u32, uiparam : u32, pvparam : *mut core::ffi::c_void, fwinini : u32, dpi : u32) -> windows_sys::core::BOOL);

public const val `DCDC_DEFAULT`: `DIALOG_CONTROL_DPI_CHANGE_BEHAVIORS` = 0;
public const val `DCDC_DISABLE_FONT_UPDATE`: `DIALOG_CONTROL_DPI_CHANGE_BEHAVIORS` = 1;
public const val `DCDC_DISABLE_RELAYOUT`: `DIALOG_CONTROL_DPI_CHANGE_BEHAVIORS` = 2;
public const val `DDC_DEFAULT`: `DIALOG_DPI_CHANGE_BEHAVIORS` = 0;
public const val `DDC_DISABLE_ALL`: `DIALOG_DPI_CHANGE_BEHAVIORS` = 1;
public const val `DDC_DISABLE_CONTROL_RELAYOUT`: `DIALOG_DPI_CHANGE_BEHAVIORS` = 4;
public const val `DDC_DISABLE_RESIZE`: `DIALOG_DPI_CHANGE_BEHAVIORS` = 2;
public typealias `DIALOG_CONTROL_DPI_CHANGE_BEHAVIORS` = Int;
public typealias `DIALOG_DPI_CHANGE_BEHAVIORS` = Int;
public typealias `DPI_AWARENESS` = Int;
// UNSUPPORTED Rust 44:1: non-scalar type Ptr unsupported
// pub type DPI_AWARENESS_CONTEXT = *mut core::ffi::c_void;

// UNSUPPORTED Rust 45:1: non-scalar type Ptr unsupported
// pub const DPI_AWARENESS_CONTEXT_PER_MONITOR_AWARE: DPI_AWARENESS_CONTEXT = -3i32 as _;

// UNSUPPORTED Rust 46:1: non-scalar type Ptr unsupported
// pub const DPI_AWARENESS_CONTEXT_PER_MONITOR_AWARE_V2: DPI_AWARENESS_CONTEXT = -4i32 as _;

// UNSUPPORTED Rust 47:1: non-scalar type Ptr unsupported
// pub const DPI_AWARENESS_CONTEXT_SYSTEM_AWARE: DPI_AWARENESS_CONTEXT = -2i32 as _;

// UNSUPPORTED Rust 48:1: non-scalar type Ptr unsupported
// pub const DPI_AWARENESS_CONTEXT_UNAWARE: DPI_AWARENESS_CONTEXT = -1i32 as _;

// UNSUPPORTED Rust 49:1: non-scalar type Ptr unsupported
// pub const DPI_AWARENESS_CONTEXT_UNAWARE_GDISCALED: DPI_AWARENESS_CONTEXT = -5i32 as _;

public const val `DPI_AWARENESS_INVALID`: `DPI_AWARENESS` = -1;
public const val `DPI_AWARENESS_PER_MONITOR_AWARE`: `DPI_AWARENESS` = 2;
public const val `DPI_AWARENESS_SYSTEM_AWARE`: `DPI_AWARENESS` = 1;
public const val `DPI_AWARENESS_UNAWARE`: `DPI_AWARENESS` = 0;
public typealias `DPI_HOSTING_BEHAVIOR` = Int;
public const val `DPI_HOSTING_BEHAVIOR_DEFAULT`: `DPI_HOSTING_BEHAVIOR` = 0;
public const val `DPI_HOSTING_BEHAVIOR_INVALID`: `DPI_HOSTING_BEHAVIOR` = -1;
public const val `DPI_HOSTING_BEHAVIOR_MIXED`: `DPI_HOSTING_BEHAVIOR` = 1;
public const val `MDT_ANGULAR_DPI`: `MONITOR_DPI_TYPE` = 1;
public const val `MDT_DEFAULT`: `MONITOR_DPI_TYPE` = 0;
public const val `MDT_EFFECTIVE_DPI`: `MONITOR_DPI_TYPE` = 0;
public const val `MDT_RAW_DPI`: `MONITOR_DPI_TYPE` = 2;
public typealias `MONITOR_DPI_TYPE` = Int;
public typealias `PROCESS_DPI_AWARENESS` = Int;
public const val `PROCESS_DPI_UNAWARE`: `PROCESS_DPI_AWARENESS` = 0;
public const val `PROCESS_PER_MONITOR_DPI_AWARE`: `PROCESS_DPI_AWARENESS` = 2;
public const val `PROCESS_SYSTEM_DPI_AWARE`: `PROCESS_DPI_AWARENESS` = 1;
