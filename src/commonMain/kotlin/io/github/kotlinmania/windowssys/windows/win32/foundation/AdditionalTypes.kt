// port-lint: source Windows/Win32/Foundation/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.foundation

// Additional type aliases from upstream Windows/Win32/Foundation/mod.rs
// that are not in the focused per-symbol files (Handle.kt, HGlobal.kt,
// HLocal.kt, HModule.kt, NtStatus.kt, DuplicateHandleOptions.kt,
// WinError.kt, WaitEvent.kt, Bool.kt, GenericAccessRights.kt, Luid.kt).

public typealias COLORREF = UInt
public typealias HINSTANCE = Long
public typealias HLSURF = Long
public typealias HRSRC = Long
public typealias HSPRITE = Long
public typealias HSTR = Long
public typealias HUMPD = Long
public typealias HWND = Long
public typealias LPARAM = Long
public typealias LRESULT = Long
public typealias OBJECT_ATTRIBUTE_FLAGS = UInt
public typealias SHANDLE_PTR = Long
public typealias VARIANT_BOOL = Short
public typealias WPARAM = ULong

// Function-pointer type aliases. Upstream uses
// `Option<unsafe extern "system" fn() -> isize>` — Kotlin has no
// `unsafe` or `extern "system"` equivalent, so these are nullable
// functional types returning Long (isize maps to Long).
public typealias FARPROC = (() -> Long)?
public typealias NEARPROC = (() -> Long)?
public typealias PROC = (() -> Long)?
public typealias PAPCFUNC = ((parameter: ULong) -> Unit)?
