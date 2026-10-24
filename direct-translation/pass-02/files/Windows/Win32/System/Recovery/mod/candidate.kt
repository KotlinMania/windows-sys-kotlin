// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn ApplicationRecoveryFinished(bsuccess : windows_sys::core::BOOL));

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn ApplicationRecoveryInProgress(pbcancelled : *mut windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_WindowsProgramming")]
// windows_link::link!("kernel32.dll" "system" fn GetApplicationRecoveryCallback(hprocess : super::super::Foundation:: HANDLE, precoverycallback : *mut super::WindowsProgramming:: APPLICATION_RECOVERY_CALLBACK, ppvparameter : *mut *mut core::ffi::c_void, pdwpinginterval : *mut u32, pdwflags : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetApplicationRestartSettings(hprocess : super::super::Foundation:: HANDLE, pwzcommandline : windows_sys::core::PWSTR, pcchsize : *mut u32, pdwflags : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_WindowsProgramming")]
// windows_link::link!("kernel32.dll" "system" fn RegisterApplicationRecoveryCallback(precoveycallback : super::WindowsProgramming:: APPLICATION_RECOVERY_CALLBACK, pvparameter : *const core::ffi::c_void, dwpinginterval : u32, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn RegisterApplicationRestart(pwzcommandline : windows_sys::core::PCWSTR, dwflags : REGISTER_APPLICATION_RESTART_FLAGS) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn UnregisterApplicationRecoveryCallback() -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn UnregisterApplicationRestart() -> windows_sys::core::HRESULT);

public typealias `REGISTER_APPLICATION_RESTART_FLAGS` = UInt;
public const val `RESTART_NO_CRASH`: `REGISTER_APPLICATION_RESTART_FLAGS` = 1u;
public const val `RESTART_NO_HANG`: `REGISTER_APPLICATION_RESTART_FLAGS` = 2u;
public const val `RESTART_NO_PATCH`: `REGISTER_APPLICATION_RESTART_FLAGS` = 4u;
public const val `RESTART_NO_REBOOT`: `REGISTER_APPLICATION_RESTART_FLAGS` = 8u;
