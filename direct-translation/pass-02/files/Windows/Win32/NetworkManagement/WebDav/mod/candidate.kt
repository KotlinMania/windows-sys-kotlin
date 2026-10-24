// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn DavAddConnection(connectionhandle : *mut super::super::Foundation:: HANDLE, remotename : windows_sys::core::PCWSTR, username : windows_sys::core::PCWSTR, password : windows_sys::core::PCWSTR, clientcert : *const u8, certsize : u32) -> u32);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("davclnt.dll" "system" fn DavCancelConnectionsToServer(lpname : windows_sys::core::PCWSTR, fforce : windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn DavDeleteConnection(connectionhandle : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn DavFlushFile(hfile : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn DavGetExtendedError(hfile : super::super::Foundation:: HANDLE, exterror : *mut u32, exterrorstring : windows_sys::core::PWSTR, cchsize : *mut u32) -> u32);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn DavGetHTTPFromUNCPath(uncpath : windows_sys::core::PCWSTR, url : windows_sys::core::PWSTR, lpsize : *mut u32) -> u32);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("davclnt.dll" "system" fn DavGetTheLockOwnerOfTheFile(filename : windows_sys::core::PCWSTR, lockownername : windows_sys::core::PWSTR, lockownernamelengthinbytes : *mut u32) -> u32);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("netapi32.dll" "system" fn DavGetUNCFromHTTPPath(url : windows_sys::core::PCWSTR, uncpath : windows_sys::core::PWSTR, lpsize : *mut u32) -> u32);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("davclnt.dll" "system" fn DavInvalidateCache(urlname : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("davclnt.dll" "system" fn DavRegisterAuthCallback(callback : PFNDAVAUTHCALLBACK, version : u32) -> u32);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("davclnt.dll" "system" fn DavUnregisterAuthCallback(hcallback : u32));

public typealias `AUTHNEXTSTEP` = Int;
public const val `CancelRequest`: `AUTHNEXTSTEP` = 2;
public const val `DAV_AUTHN_SCHEME_BASIC`: UInt = 1u;
public const val `DAV_AUTHN_SCHEME_CERT`: UInt = 65536u;
public const val `DAV_AUTHN_SCHEME_DIGEST`: UInt = 8u;
public const val `DAV_AUTHN_SCHEME_FBA`: UInt = 1048576u;
public const val `DAV_AUTHN_SCHEME_NEGOTIATE`: UInt = 16u;
public const val `DAV_AUTHN_SCHEME_NTLM`: UInt = 2u;
public const val `DAV_AUTHN_SCHEME_PASSPORT`: UInt = 4u;
// UNSUPPORTED Rust 21:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DAV_CALLBACK_AUTH_BLOB {
//     pub pBuffer: *mut core::ffi::c_void,
//     pub ulSize: u32,
//     pub ulType: u32,
// }

// UNSUPPORTED Rust 28:1: declaration Impl has no candidate rule
// impl Default for DAV_CALLBACK_AUTH_BLOB {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 33:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DAV_CALLBACK_AUTH_UNP {
//     pub pszUserName: windows_sys::core::PWSTR,
//     pub ulUserNameLength: u32,
//     pub pszPassword: windows_sys::core::PWSTR,
//     pub ulPasswordLength: u32,
// }

// UNSUPPORTED Rust 41:1: declaration Impl has no candidate rule
// impl Default for DAV_CALLBACK_AUTH_UNP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 46:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DAV_CALLBACK_CRED {
//     pub AuthBlob: DAV_CALLBACK_AUTH_BLOB,
//     pub UNPBlob: DAV_CALLBACK_AUTH_UNP,
//     pub bAuthBlobValid: windows_sys::core::BOOL,
//     pub bSave: windows_sys::core::BOOL,
// }

public const val `DefaultBehavior`: `AUTHNEXTSTEP` = 0;
// UNSUPPORTED Rust 55:1: generic scalar type unsupported
// pub type PFNDAVAUTHCALLBACK = Option<unsafe extern "system" fn(lpwzservername: windows_sys::core::PCWSTR, lpwzremotename: windows_sys::core::PCWSTR, dwauthscheme: u32, dwflags: u32, pcallbackcred: *mut DAV_CALLBACK_CRED, nextstep: *mut AUTHNEXTSTEP, pfreecred: *mut PFNDAVAUTHCALLBACK_FREECRED) -> u32>;

// UNSUPPORTED Rust 56:1: generic scalar type unsupported
// pub type PFNDAVAUTHCALLBACK_FREECRED = Option<unsafe extern "system" fn(pbuffer: *const core::ffi::c_void) -> u32>;

public const val `RetryRequest`: `AUTHNEXTSTEP` = 1;
