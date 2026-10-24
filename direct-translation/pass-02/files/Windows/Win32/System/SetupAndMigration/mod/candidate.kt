// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn OOBEComplete(isoobecomplete : *mut windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn RegisterWaitUntilOOBECompleted(oobecompletedcallback : OOBE_COMPLETED_CALLBACK, callbackcontext : *const core::ffi::c_void, waithandle : *mut *mut core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn UnregisterWaitUntilOOBECompleted(waithandle : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 4:1: generic scalar type unsupported
// pub type OOBE_COMPLETED_CALLBACK = Option<unsafe extern "system" fn(callbackcontext: *const core::ffi::c_void)>;

