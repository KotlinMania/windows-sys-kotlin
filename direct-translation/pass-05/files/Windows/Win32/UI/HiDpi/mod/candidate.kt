// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=AdjustWindowRectExForDpi; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `AdjustWindowRectExForDpi`(`lprect` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `dwstyle` : `super`.`WindowsAndMessaging`.`WINDOW_STYLE`, `bmenu` : `windows_sys`.`core`.`BOOL`, `dwexstyle` : `super`.`WindowsAndMessaging`.`WINDOW_EX_STYLE`, `dpi` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=AreDpiAwarenessContextsEqual; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AreDpiAwarenessContextsEqual`(`dpicontexta` : `DPI_AWARENESS_CONTEXT`, `dpicontextb` : `DPI_AWARENESS_CONTEXT`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=EnableNonClientDpiScaling; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnableNonClientDpiScaling`(`hwnd` : `super`.`super`.`Foundation`.`HWND`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetAwarenessFromDpiAwarenessContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetAwarenessFromDpiAwarenessContext`(`value` : `DPI_AWARENESS_CONTEXT`) : `DPI_AWARENESS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetDialogControlDpiChangeBehavior; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetDialogControlDpiChangeBehavior`(`hwnd` : `super`.`super`.`Foundation`.`HWND`) : `DIALOG_CONTROL_DPI_CHANGE_BEHAVIORS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetDialogDpiChangeBehavior; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetDialogDpiChangeBehavior`(`hdlg` : `super`.`super`.`Foundation`.`HWND`) : `DIALOG_DPI_CHANGE_BEHAVIORS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetDpiAwarenessContextForProcess; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetDpiAwarenessContextForProcess`(`hprocess` : `super`.`super`.`Foundation`.`HANDLE`) : `DPI_AWARENESS_CONTEXT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-shcore-scaling-l1-1-1.dll, ABI=system, export=GetDpiForMonitor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GetDpiForMonitor`(`hmonitor` : `super`.`super`.`Graphics`.`Gdi`.`HMONITOR`, `dpitype` : `MONITOR_DPI_TYPE`, `dpix` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `dpiy` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetDpiForSystem; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetDpiForSystem`() : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetDpiForWindow; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetDpiForWindow`(`hwnd` : `super`.`super`.`Foundation`.`HWND`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetDpiFromDpiAwarenessContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetDpiFromDpiAwarenessContext`(`value` : `DPI_AWARENESS_CONTEXT`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-shcore-scaling-l1-1-1.dll, ABI=system, export=GetProcessDpiAwareness; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetProcessDpiAwareness`(`hprocess` : `super`.`super`.`Foundation`.`HANDLE`, `value` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PROCESS_DPI_AWARENESS`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetSystemDpiForProcess; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetSystemDpiForProcess`(`hprocess` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetSystemMetricsForDpi; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `GetSystemMetricsForDpi`(`nindex` : `super`.`WindowsAndMessaging`.`SYSTEM_METRICS_INDEX`, `dpi` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetThreadDpiAwarenessContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetThreadDpiAwarenessContext`() : `DPI_AWARENESS_CONTEXT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetThreadDpiHostingBehavior; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetThreadDpiHostingBehavior`() : `DPI_HOSTING_BEHAVIOR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetWindowDpiAwarenessContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetWindowDpiAwarenessContext`(`hwnd` : `super`.`super`.`Foundation`.`HWND`) : `DPI_AWARENESS_CONTEXT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=GetWindowDpiHostingBehavior; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetWindowDpiHostingBehavior`(`hwnd` : `super`.`super`.`Foundation`.`HWND`) : `DPI_HOSTING_BEHAVIOR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=IsValidDpiAwarenessContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsValidDpiAwarenessContext`(`value` : `DPI_AWARENESS_CONTEXT`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=LogicalToPhysicalPointForPerMonitorDPI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LogicalToPhysicalPointForPerMonitorDPI`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `lppoint` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=uxtheme.dll, ABI=system, export=OpenThemeDataForDpi; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_Controls")]
public external fun `OpenThemeDataForDpi`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `pszclasslist` : `windows_sys`.`core`.`PCWSTR`, `dpi` : UInt) : `super`.`Controls`.`HTHEME`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=PhysicalToLogicalPointForPerMonitorDPI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PhysicalToLogicalPointForPerMonitorDPI`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `lppoint` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`POINT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetDialogControlDpiChangeBehavior; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetDialogControlDpiChangeBehavior`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `mask` : `DIALOG_CONTROL_DPI_CHANGE_BEHAVIORS`, `values` : `DIALOG_CONTROL_DPI_CHANGE_BEHAVIORS`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetDialogDpiChangeBehavior; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetDialogDpiChangeBehavior`(`hdlg` : `super`.`super`.`Foundation`.`HWND`, `mask` : `DIALOG_DPI_CHANGE_BEHAVIORS`, `values` : `DIALOG_DPI_CHANGE_BEHAVIORS`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-shcore-scaling-l1-1-1.dll, ABI=system, export=SetProcessDpiAwareness; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetProcessDpiAwareness`(`value` : `PROCESS_DPI_AWARENESS`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetProcessDpiAwarenessContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetProcessDpiAwarenessContext`(`value` : `DPI_AWARENESS_CONTEXT`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetThreadDpiAwarenessContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetThreadDpiAwarenessContext`(`dpicontext` : `DPI_AWARENESS_CONTEXT`) : `DPI_AWARENESS_CONTEXT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SetThreadDpiHostingBehavior; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetThreadDpiHostingBehavior`(`value` : `DPI_HOSTING_BEHAVIOR`) : `DPI_HOSTING_BEHAVIOR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SystemParametersInfoForDpi; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SystemParametersInfoForDpi`(`uiaction` : UInt, `uiparam` : UInt, `pvparam` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `fwinini` : UInt, `dpi` : UInt) : `windows_sys`.`core`.`BOOL`
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
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `DPI_AWARENESS_CONTEXT` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// UNSUPPORTED Rust 45:1: non-scalar type Ptr unsupported; syntax: constant expression has no syntax candidate rule
// pub const DPI_AWARENESS_CONTEXT_PER_MONITOR_AWARE: DPI_AWARENESS_CONTEXT = -3i32 as _;

// UNSUPPORTED Rust 46:1: non-scalar type Ptr unsupported; syntax: constant expression has no syntax candidate rule
// pub const DPI_AWARENESS_CONTEXT_PER_MONITOR_AWARE_V2: DPI_AWARENESS_CONTEXT = -4i32 as _;

// UNSUPPORTED Rust 47:1: non-scalar type Ptr unsupported; syntax: constant expression has no syntax candidate rule
// pub const DPI_AWARENESS_CONTEXT_SYSTEM_AWARE: DPI_AWARENESS_CONTEXT = -2i32 as _;

// UNSUPPORTED Rust 48:1: non-scalar type Ptr unsupported; syntax: constant expression has no syntax candidate rule
// pub const DPI_AWARENESS_CONTEXT_UNAWARE: DPI_AWARENESS_CONTEXT = -1i32 as _;

// UNSUPPORTED Rust 49:1: non-scalar type Ptr unsupported; syntax: constant expression has no syntax candidate rule
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
