// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn BroadcastSystemMessageA(flags : u32, lpinfo : *mut u32, msg : u32, wparam : super::super::Foundation:: WPARAM, lparam : super::super::Foundation:: LPARAM) -> i32);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn BroadcastSystemMessageExA(flags : BROADCAST_SYSTEM_MESSAGE_FLAGS, lpinfo : *mut BROADCAST_SYSTEM_MESSAGE_INFO, msg : u32, wparam : super::super::Foundation:: WPARAM, lparam : super::super::Foundation:: LPARAM, pbsminfo : *mut BSMINFO) -> i32);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn BroadcastSystemMessageExW(flags : BROADCAST_SYSTEM_MESSAGE_FLAGS, lpinfo : *mut BROADCAST_SYSTEM_MESSAGE_INFO, msg : u32, wparam : super::super::Foundation:: WPARAM, lparam : super::super::Foundation:: LPARAM, pbsminfo : *mut BSMINFO) -> i32);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn BroadcastSystemMessageW(flags : BROADCAST_SYSTEM_MESSAGE_FLAGS, lpinfo : *mut BROADCAST_SYSTEM_MESSAGE_INFO, msg : u32, wparam : super::super::Foundation:: WPARAM, lparam : super::super::Foundation:: LPARAM) -> i32);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn CloseDesktop(hdesktop : HDESK) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn CloseWindowStation(hwinsta : HWINSTA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_Security"))]
// windows_link::link!("user32.dll" "system" fn CreateDesktopA(lpszdesktop : windows_sys::core::PCSTR, lpszdevice : windows_sys::core::PCSTR, pdevmode : *const super::super::Graphics::Gdi:: DEVMODEA, dwflags : DESKTOP_CONTROL_FLAGS, dwdesiredaccess : u32, lpsa : *const super::super::Security:: SECURITY_ATTRIBUTES) -> HDESK);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_Security"))]
// windows_link::link!("user32.dll" "system" fn CreateDesktopExA(lpszdesktop : windows_sys::core::PCSTR, lpszdevice : windows_sys::core::PCSTR, pdevmode : *const super::super::Graphics::Gdi:: DEVMODEA, dwflags : DESKTOP_CONTROL_FLAGS, dwdesiredaccess : u32, lpsa : *const super::super::Security:: SECURITY_ATTRIBUTES, ulheapsize : u32, pvoid : *const core::ffi::c_void) -> HDESK);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_Security"))]
// windows_link::link!("user32.dll" "system" fn CreateDesktopExW(lpszdesktop : windows_sys::core::PCWSTR, lpszdevice : windows_sys::core::PCWSTR, pdevmode : *const super::super::Graphics::Gdi:: DEVMODEW, dwflags : DESKTOP_CONTROL_FLAGS, dwdesiredaccess : u32, lpsa : *const super::super::Security:: SECURITY_ATTRIBUTES, ulheapsize : u32, pvoid : *const core::ffi::c_void) -> HDESK);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_Security"))]
// windows_link::link!("user32.dll" "system" fn CreateDesktopW(lpszdesktop : windows_sys::core::PCWSTR, lpszdevice : windows_sys::core::PCWSTR, pdevmode : *const super::super::Graphics::Gdi:: DEVMODEW, dwflags : DESKTOP_CONTROL_FLAGS, dwdesiredaccess : u32, lpsa : *const super::super::Security:: SECURITY_ATTRIBUTES) -> HDESK);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("user32.dll" "system" fn CreateWindowStationA(lpwinsta : windows_sys::core::PCSTR, dwflags : u32, dwdesiredaccess : u32, lpsa : *const super::super::Security:: SECURITY_ATTRIBUTES) -> HWINSTA);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("user32.dll" "system" fn CreateWindowStationW(lpwinsta : windows_sys::core::PCWSTR, dwflags : u32, dwdesiredaccess : u32, lpsa : *const super::super::Security:: SECURITY_ATTRIBUTES) -> HWINSTA);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// windows_link::link!("user32.dll" "system" fn EnumDesktopWindows(hdesktop : HDESK, lpfn : super::super::UI::WindowsAndMessaging:: WNDENUMPROC, lparam : super::super::Foundation:: LPARAM) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn EnumDesktopsA(hwinsta : HWINSTA, lpenumfunc : DESKTOPENUMPROCA, lparam : super::super::Foundation:: LPARAM) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn EnumDesktopsW(hwinsta : HWINSTA, lpenumfunc : DESKTOPENUMPROCW, lparam : super::super::Foundation:: LPARAM) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn EnumWindowStationsA(lpenumfunc : WINSTAENUMPROCA, lparam : super::super::Foundation:: LPARAM) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn EnumWindowStationsW(lpenumfunc : WINSTAENUMPROCW, lparam : super::super::Foundation:: LPARAM) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn GetProcessWindowStation() -> HWINSTA);

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn GetThreadDesktop(dwthreadid : u32) -> HDESK);

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn GetUserObjectInformationA(hobj : super::super::Foundation:: HANDLE, nindex : USER_OBJECT_INFORMATION_INDEX, pvinfo : *mut core::ffi::c_void, nlength : u32, lpnlengthneeded : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn GetUserObjectInformationW(hobj : super::super::Foundation:: HANDLE, nindex : USER_OBJECT_INFORMATION_INDEX, pvinfo : *mut core::ffi::c_void, nlength : u32, lpnlengthneeded : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 29:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn OpenDesktopA(lpszdesktop : windows_sys::core::PCSTR, dwflags : DESKTOP_CONTROL_FLAGS, finherit : windows_sys::core::BOOL, dwdesiredaccess : u32) -> HDESK);

// UNSUPPORTED Rust 30:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn OpenDesktopW(lpszdesktop : windows_sys::core::PCWSTR, dwflags : DESKTOP_CONTROL_FLAGS, finherit : windows_sys::core::BOOL, dwdesiredaccess : u32) -> HDESK);

// UNSUPPORTED Rust 31:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn OpenInputDesktop(dwflags : DESKTOP_CONTROL_FLAGS, finherit : windows_sys::core::BOOL, dwdesiredaccess : DESKTOP_ACCESS_FLAGS) -> HDESK);

// UNSUPPORTED Rust 32:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn OpenWindowStationA(lpszwinsta : windows_sys::core::PCSTR, finherit : windows_sys::core::BOOL, dwdesiredaccess : u32) -> HWINSTA);

// UNSUPPORTED Rust 33:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn OpenWindowStationW(lpszwinsta : windows_sys::core::PCWSTR, finherit : windows_sys::core::BOOL, dwdesiredaccess : u32) -> HWINSTA);

// UNSUPPORTED Rust 34:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn SetProcessWindowStation(hwinsta : HWINSTA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 35:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn SetThreadDesktop(hdesktop : HDESK) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 36:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn SetUserObjectInformationA(hobj : super::super::Foundation:: HANDLE, nindex : i32, pvinfo : *const core::ffi::c_void, nlength : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 37:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn SetUserObjectInformationW(hobj : super::super::Foundation:: HANDLE, nindex : i32, pvinfo : *const core::ffi::c_void, nlength : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 38:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn SwitchDesktop(hdesktop : HDESK) -> windows_sys::core::BOOL);

public typealias `BROADCAST_SYSTEM_MESSAGE_FLAGS` = UInt;
public typealias `BROADCAST_SYSTEM_MESSAGE_INFO` = UInt;
public const val `BSF_ALLOWSFW`: `BROADCAST_SYSTEM_MESSAGE_FLAGS` = 128u;
public const val `BSF_FLUSHDISK`: `BROADCAST_SYSTEM_MESSAGE_FLAGS` = 4u;
public const val `BSF_FORCEIFHUNG`: `BROADCAST_SYSTEM_MESSAGE_FLAGS` = 32u;
public const val `BSF_IGNORECURRENTTASK`: `BROADCAST_SYSTEM_MESSAGE_FLAGS` = 2u;
public const val `BSF_LUID`: `BROADCAST_SYSTEM_MESSAGE_FLAGS` = 1024u;
public const val `BSF_NOHANG`: `BROADCAST_SYSTEM_MESSAGE_FLAGS` = 8u;
public const val `BSF_NOTIMEOUTIFNOTHUNG`: `BROADCAST_SYSTEM_MESSAGE_FLAGS` = 64u;
public const val `BSF_POSTMESSAGE`: `BROADCAST_SYSTEM_MESSAGE_FLAGS` = 16u;
public const val `BSF_QUERY`: `BROADCAST_SYSTEM_MESSAGE_FLAGS` = 1u;
public const val `BSF_RETURNHDESK`: `BROADCAST_SYSTEM_MESSAGE_FLAGS` = 512u;
public const val `BSF_SENDNOTIFYMESSAGE`: `BROADCAST_SYSTEM_MESSAGE_FLAGS` = 256u;
// UNSUPPORTED Rust 52:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct BSMINFO {
//     pub cbSize: u32,
//     pub hdesk: HDESK,
//     pub hwnd: super::super::Foundation::HWND,
//     pub luid: super::super::Foundation::LUID,
// }

// UNSUPPORTED Rust 60:1: declaration Impl has no candidate rule
// impl Default for BSMINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `BSM_ALLCOMPONENTS`: `BROADCAST_SYSTEM_MESSAGE_INFO` = 0u;
public const val `BSM_ALLDESKTOPS`: `BROADCAST_SYSTEM_MESSAGE_INFO` = 16u;
public const val `BSM_APPLICATIONS`: `BROADCAST_SYSTEM_MESSAGE_INFO` = 8u;
// UNSUPPORTED Rust 68:1: generic scalar type unsupported
// pub type DESKTOPENUMPROCA = Option<unsafe extern "system" fn(param0: windows_sys::core::PCSTR, param1: super::super::Foundation::LPARAM) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 69:1: generic scalar type unsupported
// pub type DESKTOPENUMPROCW = Option<unsafe extern "system" fn(param0: windows_sys::core::PCWSTR, param1: super::super::Foundation::LPARAM) -> windows_sys::core::BOOL>;

public typealias `DESKTOP_ACCESS_FLAGS` = UInt;
public typealias `DESKTOP_CONTROL_FLAGS` = UInt;
public const val `DESKTOP_CREATEMENU`: `DESKTOP_ACCESS_FLAGS` = 4u;
public const val `DESKTOP_CREATEWINDOW`: `DESKTOP_ACCESS_FLAGS` = 2u;
public const val `DESKTOP_DELETE`: `DESKTOP_ACCESS_FLAGS` = 65536u;
public const val `DESKTOP_ENUMERATE`: `DESKTOP_ACCESS_FLAGS` = 64u;
public const val `DESKTOP_HOOKCONTROL`: `DESKTOP_ACCESS_FLAGS` = 8u;
public const val `DESKTOP_JOURNALPLAYBACK`: `DESKTOP_ACCESS_FLAGS` = 32u;
public const val `DESKTOP_JOURNALRECORD`: `DESKTOP_ACCESS_FLAGS` = 16u;
public const val `DESKTOP_READOBJECTS`: `DESKTOP_ACCESS_FLAGS` = 1u;
public const val `DESKTOP_READ_CONTROL`: `DESKTOP_ACCESS_FLAGS` = 131072u;
public const val `DESKTOP_SWITCHDESKTOP`: `DESKTOP_ACCESS_FLAGS` = 256u;
public const val `DESKTOP_SYNCHRONIZE`: `DESKTOP_ACCESS_FLAGS` = 1048576u;
public const val `DESKTOP_WRITEOBJECTS`: `DESKTOP_ACCESS_FLAGS` = 128u;
public const val `DESKTOP_WRITE_DAC`: `DESKTOP_ACCESS_FLAGS` = 262144u;
public const val `DESKTOP_WRITE_OWNER`: `DESKTOP_ACCESS_FLAGS` = 524288u;
public const val `DF_ALLOWOTHERACCOUNTHOOK`: `DESKTOP_CONTROL_FLAGS` = 1u;
// UNSUPPORTED Rust 87:1: non-scalar type Ptr unsupported
// pub type HDESK = *mut core::ffi::c_void;

// UNSUPPORTED Rust 88:1: non-scalar type Ptr unsupported
// pub type HWINSTA = *mut core::ffi::c_void;

public const val `UOI_FLAGS`: `USER_OBJECT_INFORMATION_INDEX` = 1;
public const val `UOI_HEAPSIZE`: `USER_OBJECT_INFORMATION_INDEX` = 5;
public const val `UOI_IO`: `USER_OBJECT_INFORMATION_INDEX` = 6;
public const val `UOI_NAME`: `USER_OBJECT_INFORMATION_INDEX` = 2;
public const val `UOI_TYPE`: `USER_OBJECT_INFORMATION_INDEX` = 3;
public const val `UOI_USER_SID`: `USER_OBJECT_INFORMATION_INDEX` = 4;
// UNSUPPORTED Rust 95:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct USEROBJECTFLAGS {
//     pub fInherit: windows_sys::core::BOOL,
//     pub fReserved: windows_sys::core::BOOL,
//     pub dwFlags: u32,
// }

public typealias `USER_OBJECT_INFORMATION_INDEX` = Int;
// UNSUPPORTED Rust 103:1: generic scalar type unsupported
// pub type WINSTAENUMPROCA = Option<unsafe extern "system" fn(param0: windows_sys::core::PCSTR, param1: super::super::Foundation::LPARAM) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 104:1: generic scalar type unsupported
// pub type WINSTAENUMPROCW = Option<unsafe extern "system" fn(param0: windows_sys::core::PCWSTR, param1: super::super::Foundation::LPARAM) -> windows_sys::core::BOOL>;

