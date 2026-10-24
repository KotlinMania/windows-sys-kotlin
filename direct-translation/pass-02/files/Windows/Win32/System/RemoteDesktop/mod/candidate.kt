// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn ProcessIdToSessionId(dwprocessid : u32, psessionid : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("wtsapi32.dll" "system" fn WTSCloseServer(hserver : super::super::Foundation:: HANDLE));

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("wtsapi32.dll" "system" fn WTSConnectSessionA(logonid : u32, targetlogonid : u32, ppassword : windows_sys::core::PCSTR, bwait : windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("wtsapi32.dll" "system" fn WTSConnectSessionW(logonid : u32, targetlogonid : u32, ppassword : windows_sys::core::PCWSTR, bwait : windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("wtsapi32.dll" "system" fn WTSCreateListenerA(hserver : super::super::Foundation:: HANDLE, preserved : *const core::ffi::c_void, reserved : u32, plistenername : windows_sys::core::PCSTR, pbuffer : *const WTSLISTENERCONFIGA, flag : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("wtsapi32.dll" "system" fn WTSCreateListenerW(hserver : super::super::Foundation:: HANDLE, preserved : *const core::ffi::c_void, reserved : u32, plistenername : windows_sys::core::PCWSTR, pbuffer : *const WTSLISTENERCONFIGW, flag : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("wtsapi32.dll" "system" fn WTSDisconnectSession(hserver : super::super::Foundation:: HANDLE, sessionid : u32, bwait : windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("wtsapi32.dll" "system" fn WTSEnableChildSessions(benable : windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("wtsapi32.dll" "system" fn WTSEnumerateListenersA(hserver : super::super::Foundation:: HANDLE, preserved : *const core::ffi::c_void, reserved : u32, plisteners : *mut *mut i8, pcount : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("wtsapi32.dll" "system" fn WTSEnumerateListenersW(hserver : super::super::Foundation:: HANDLE, preserved : *const core::ffi::c_void, reserved : u32, plisteners : *mut *mut u16, pcount : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("wtsapi32.dll" "system" fn WTSEnumerateProcessesA(hserver : super::super::Foundation:: HANDLE, reserved : u32, version : u32, ppprocessinfo : *mut *mut WTS_PROCESS_INFOA, pcount : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// windows_link::link!("wtsapi32.dll" "system" fn WTSEnumerateProcessesExA(hserver : super::super::Foundation:: HANDLE, plevel : *mut u32, sessionid : u32, ppprocessinfo : *mut windows_sys::core::PSTR, pcount : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// windows_link::link!("wtsapi32.dll" "system" fn WTSEnumerateProcessesExW(hserver : super::super::Foundation:: HANDLE, plevel : *mut u32, sessionid : u32, ppprocessinfo : *mut windows_sys::core::PWSTR, pcount : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("wtsapi32.dll" "system" fn WTSEnumerateProcessesW(hserver : super::super::Foundation:: HANDLE, reserved : u32, version : u32, ppprocessinfo : *mut *mut WTS_PROCESS_INFOW, pcount : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// windows_link::link!("wtsapi32.dll" "system" fn WTSEnumerateServersA(pdomainname : windows_sys::core::PCSTR, reserved : u32, version : u32, ppserverinfo : *mut *mut WTS_SERVER_INFOA, pcount : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// windows_link::link!("wtsapi32.dll" "system" fn WTSEnumerateServersW(pdomainname : windows_sys::core::PCWSTR, reserved : u32, version : u32, ppserverinfo : *mut *mut WTS_SERVER_INFOW, pcount : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// windows_link::link!("wtsapi32.dll" "system" fn WTSEnumerateSessionsA(hserver : super::super::Foundation:: HANDLE, reserved : u32, version : u32, ppsessioninfo : *mut *mut WTS_SESSION_INFOA, pcount : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// windows_link::link!("wtsapi32.dll" "system" fn WTSEnumerateSessionsExA(hserver : super::super::Foundation:: HANDLE, plevel : *mut u32, filter : u32, ppsessioninfo : *mut *mut WTS_SESSION_INFO_1A, pcount : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// windows_link::link!("wtsapi32.dll" "system" fn WTSEnumerateSessionsExW(hserver : super::super::Foundation:: HANDLE, plevel : *mut u32, filter : u32, ppsessioninfo : *mut *mut WTS_SESSION_INFO_1W, pcount : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// windows_link::link!("wtsapi32.dll" "system" fn WTSEnumerateSessionsW(hserver : super::super::Foundation:: HANDLE, reserved : u32, version : u32, ppsessioninfo : *mut *mut WTS_SESSION_INFOW, pcount : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// windows_link::link!("wtsapi32.dll" "system" fn WTSFreeMemory(pmemory : *mut core::ffi::c_void));

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// windows_link::link!("wtsapi32.dll" "system" fn WTSFreeMemoryExA(wtstypeclass : WTS_TYPE_CLASS, pmemory : *const core::ffi::c_void, numberofentries : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// windows_link::link!("wtsapi32.dll" "system" fn WTSFreeMemoryExW(wtstypeclass : WTS_TYPE_CLASS, pmemory : *const core::ffi::c_void, numberofentries : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn WTSGetActiveConsoleSessionId() -> u32);

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// windows_link::link!("wtsapi32.dll" "system" fn WTSGetChildSessionId(psessionid : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("wtsapi32.dll" "system" fn WTSGetListenerSecurityA(hserver : super::super::Foundation:: HANDLE, preserved : *const core::ffi::c_void, reserved : u32, plistenername : windows_sys::core::PCSTR, securityinformation : super::super::Security:: OBJECT_SECURITY_INFORMATION, psecuritydescriptor : super::super::Security:: PSECURITY_DESCRIPTOR, nlength : u32, lpnlengthneeded : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 30:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("wtsapi32.dll" "system" fn WTSGetListenerSecurityW(hserver : super::super::Foundation:: HANDLE, preserved : *const core::ffi::c_void, reserved : u32, plistenername : windows_sys::core::PCWSTR, securityinformation : super::super::Security:: OBJECT_SECURITY_INFORMATION, psecuritydescriptor : super::super::Security:: PSECURITY_DESCRIPTOR, nlength : u32, lpnlengthneeded : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 32:1: declaration Macro has no candidate rule
// windows_link::link!("wtsapi32.dll" "system" fn WTSIsChildSessionsEnabled(pbenabled : *mut windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 33:1: declaration Macro has no candidate rule
// windows_link::link!("wtsapi32.dll" "system" fn WTSLogoffSession(hserver : super::super::Foundation:: HANDLE, sessionid : u32, bwait : windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 34:1: declaration Macro has no candidate rule
// windows_link::link!("wtsapi32.dll" "system" fn WTSOpenServerA(pservername : windows_sys::core::PCSTR) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 35:1: declaration Macro has no candidate rule
// windows_link::link!("wtsapi32.dll" "system" fn WTSOpenServerExA(pservername : windows_sys::core::PCSTR) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 36:1: declaration Macro has no candidate rule
// windows_link::link!("wtsapi32.dll" "system" fn WTSOpenServerExW(pservername : windows_sys::core::PCWSTR) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 37:1: declaration Macro has no candidate rule
// windows_link::link!("wtsapi32.dll" "system" fn WTSOpenServerW(pservername : windows_sys::core::PCWSTR) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 38:1: declaration Macro has no candidate rule
// windows_link::link!("wtsapi32.dll" "system" fn WTSQueryListenerConfigA(hserver : super::super::Foundation:: HANDLE, preserved : *const core::ffi::c_void, reserved : u32, plistenername : windows_sys::core::PCSTR, pbuffer : *mut WTSLISTENERCONFIGA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 39:1: declaration Macro has no candidate rule
// windows_link::link!("wtsapi32.dll" "system" fn WTSQueryListenerConfigW(hserver : super::super::Foundation:: HANDLE, preserved : *const core::ffi::c_void, reserved : u32, plistenername : windows_sys::core::PCWSTR, pbuffer : *mut WTSLISTENERCONFIGW) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 40:1: declaration Macro has no candidate rule
// windows_link::link!("wtsapi32.dll" "system" fn WTSQuerySessionInformationA(hserver : super::super::Foundation:: HANDLE, sessionid : u32, wtsinfoclass : WTS_INFO_CLASS, ppbuffer : *mut windows_sys::core::PSTR, pbytesreturned : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 41:1: declaration Macro has no candidate rule
// windows_link::link!("wtsapi32.dll" "system" fn WTSQuerySessionInformationW(hserver : super::super::Foundation:: HANDLE, sessionid : u32, wtsinfoclass : WTS_INFO_CLASS, ppbuffer : *mut windows_sys::core::PWSTR, pbytesreturned : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 42:1: declaration Macro has no candidate rule
// windows_link::link!("wtsapi32.dll" "system" fn WTSQueryUserConfigA(pservername : windows_sys::core::PCSTR, pusername : windows_sys::core::PCSTR, wtsconfigclass : WTS_CONFIG_CLASS, ppbuffer : *mut windows_sys::core::PSTR, pbytesreturned : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 43:1: declaration Macro has no candidate rule
// windows_link::link!("wtsapi32.dll" "system" fn WTSQueryUserConfigW(pservername : windows_sys::core::PCWSTR, pusername : windows_sys::core::PCWSTR, wtsconfigclass : WTS_CONFIG_CLASS, ppbuffer : *mut windows_sys::core::PWSTR, pbytesreturned : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 44:1: declaration Macro has no candidate rule
// windows_link::link!("wtsapi32.dll" "system" fn WTSQueryUserToken(sessionid : u32, phtoken : *mut super::super::Foundation:: HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 45:1: declaration Macro has no candidate rule
// windows_link::link!("wtsapi32.dll" "system" fn WTSRegisterSessionNotification(hwnd : super::super::Foundation:: HWND, dwflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 46:1: declaration Macro has no candidate rule
// windows_link::link!("wtsapi32.dll" "system" fn WTSRegisterSessionNotificationEx(hserver : super::super::Foundation:: HANDLE, hwnd : super::super::Foundation:: HWND, dwflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 47:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// windows_link::link!("wtsapi32.dll" "system" fn WTSSendMessageA(hserver : super::super::Foundation:: HANDLE, sessionid : u32, ptitle : windows_sys::core::PCSTR, titlelength : u32, pmessage : windows_sys::core::PCSTR, messagelength : u32, style : super::super::UI::WindowsAndMessaging:: MESSAGEBOX_STYLE, timeout : u32, presponse : *mut super::super::UI::WindowsAndMessaging:: MESSAGEBOX_RESULT, bwait : windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 49:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// windows_link::link!("wtsapi32.dll" "system" fn WTSSendMessageW(hserver : super::super::Foundation:: HANDLE, sessionid : u32, ptitle : windows_sys::core::PCWSTR, titlelength : u32, pmessage : windows_sys::core::PCWSTR, messagelength : u32, style : super::super::UI::WindowsAndMessaging:: MESSAGEBOX_STYLE, timeout : u32, presponse : *mut super::super::UI::WindowsAndMessaging:: MESSAGEBOX_RESULT, bwait : windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 51:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("wtsapi32.dll" "system" fn WTSSetListenerSecurityA(hserver : super::super::Foundation:: HANDLE, preserved : *const core::ffi::c_void, reserved : u32, plistenername : windows_sys::core::PCSTR, securityinformation : super::super::Security:: OBJECT_SECURITY_INFORMATION, psecuritydescriptor : super::super::Security:: PSECURITY_DESCRIPTOR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 53:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("wtsapi32.dll" "system" fn WTSSetListenerSecurityW(hserver : super::super::Foundation:: HANDLE, preserved : *const core::ffi::c_void, reserved : u32, plistenername : windows_sys::core::PCWSTR, securityinformation : super::super::Security:: OBJECT_SECURITY_INFORMATION, psecuritydescriptor : super::super::Security:: PSECURITY_DESCRIPTOR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 55:1: declaration Macro has no candidate rule
// windows_link::link!("wtsapi32.dll" "system" fn WTSSetRenderHint(prenderhintid : *mut u64, hwndowner : super::super::Foundation:: HWND, renderhinttype : u32, cbhintdatalength : u32, phintdata : *const u8) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 56:1: declaration Macro has no candidate rule
// windows_link::link!("wtsapi32.dll" "system" fn WTSSetUserConfigA(pservername : windows_sys::core::PCSTR, pusername : windows_sys::core::PCSTR, wtsconfigclass : WTS_CONFIG_CLASS, pbuffer : windows_sys::core::PCSTR, datalength : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 57:1: declaration Macro has no candidate rule
// windows_link::link!("wtsapi32.dll" "system" fn WTSSetUserConfigW(pservername : windows_sys::core::PCWSTR, pusername : windows_sys::core::PCWSTR, wtsconfigclass : WTS_CONFIG_CLASS, pbuffer : windows_sys::core::PCWSTR, datalength : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 58:1: declaration Macro has no candidate rule
// windows_link::link!("wtsapi32.dll" "system" fn WTSShutdownSystem(hserver : super::super::Foundation:: HANDLE, shutdownflag : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 59:1: declaration Macro has no candidate rule
// windows_link::link!("wtsapi32.dll" "system" fn WTSStartRemoteControlSessionA(ptargetservername : windows_sys::core::PCSTR, targetlogonid : u32, hotkeyvk : u8, hotkeymodifiers : u16) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 60:1: declaration Macro has no candidate rule
// windows_link::link!("wtsapi32.dll" "system" fn WTSStartRemoteControlSessionW(ptargetservername : windows_sys::core::PCWSTR, targetlogonid : u32, hotkeyvk : u8, hotkeymodifiers : u16) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 61:1: declaration Macro has no candidate rule
// windows_link::link!("wtsapi32.dll" "system" fn WTSStopRemoteControlSession(logonid : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 62:1: declaration Macro has no candidate rule
// windows_link::link!("wtsapi32.dll" "system" fn WTSTerminateProcess(hserver : super::super::Foundation:: HANDLE, processid : u32, exitcode : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 63:1: declaration Macro has no candidate rule
// windows_link::link!("wtsapi32.dll" "system" fn WTSUnRegisterSessionNotification(hwnd : super::super::Foundation:: HWND) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 64:1: declaration Macro has no candidate rule
// windows_link::link!("wtsapi32.dll" "system" fn WTSUnRegisterSessionNotificationEx(hserver : super::super::Foundation:: HANDLE, hwnd : super::super::Foundation:: HWND) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 65:1: declaration Macro has no candidate rule
// windows_link::link!("wtsapi32.dll" "system" fn WTSVirtualChannelClose(hchannelhandle : super::super::Foundation:: HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 66:1: declaration Macro has no candidate rule
// windows_link::link!("wtsapi32.dll" "system" fn WTSVirtualChannelOpen(hserver : super::super::Foundation:: HANDLE, sessionid : u32, pvirtualname : windows_sys::core::PCSTR) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 67:1: declaration Macro has no candidate rule
// windows_link::link!("wtsapi32.dll" "system" fn WTSVirtualChannelOpenEx(sessionid : u32, pvirtualname : windows_sys::core::PCSTR, flags : u32) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 68:1: declaration Macro has no candidate rule
// windows_link::link!("wtsapi32.dll" "system" fn WTSVirtualChannelPurgeInput(hchannelhandle : super::super::Foundation:: HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 69:1: declaration Macro has no candidate rule
// windows_link::link!("wtsapi32.dll" "system" fn WTSVirtualChannelPurgeOutput(hchannelhandle : super::super::Foundation:: HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 70:1: declaration Macro has no candidate rule
// windows_link::link!("wtsapi32.dll" "system" fn WTSVirtualChannelQuery(hchannelhandle : super::super::Foundation:: HANDLE, param1 : WTS_VIRTUAL_CLASS, ppbuffer : *mut *mut core::ffi::c_void, pbytesreturned : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 71:1: declaration Macro has no candidate rule
// windows_link::link!("wtsapi32.dll" "system" fn WTSVirtualChannelRead(hchannelhandle : super::super::Foundation:: HANDLE, timeout : u32, buffer : windows_sys::core::PSTR, buffersize : u32, pbytesread : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 72:1: declaration Macro has no candidate rule
// windows_link::link!("wtsapi32.dll" "system" fn WTSVirtualChannelWrite(hchannelhandle : super::super::Foundation:: HANDLE, buffer : windows_sys::core::PCSTR, length : u32, pbyteswritten : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 73:1: declaration Macro has no candidate rule
// windows_link::link!("wtsapi32.dll" "system" fn WTSWaitSystemEvent(hserver : super::super::Foundation:: HANDLE, eventmask : u32, peventflags : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 74:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct AAAccountingData {
//     pub userName: windows_sys::core::BSTR,
//     pub clientName: windows_sys::core::BSTR,
//     pub authType: AAAuthSchemes,
//     pub resourceName: windows_sys::core::BSTR,
//     pub portNumber: i32,
//     pub protocolName: windows_sys::core::BSTR,
//     pub numberOfBytesReceived: i32,
//     pub numberOfBytesTransfered: i32,
//     pub reasonForDisconnect: windows_sys::core::BSTR,
//     pub mainSessionId: windows_sys::core::GUID,
//     pub subSessionId: i32,
// }

// UNSUPPORTED Rust 89:1: declaration Impl has no candidate rule
// impl Default for AAAccountingData {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `AAAccountingDataType` = Int;
public typealias `AAAuthSchemes` = Int;
public typealias `AATrustClassID` = Int;
public const val `AA_AUTH_ANY`: `AAAuthSchemes` = 6;
public const val `AA_AUTH_BASIC`: `AAAuthSchemes` = 1;
public const val `AA_AUTH_CONID`: `AAAuthSchemes` = 10;
public const val `AA_AUTH_COOKIE`: `AAAuthSchemes` = 7;
public const val `AA_AUTH_DIGEST`: `AAAuthSchemes` = 8;
public const val `AA_AUTH_LOGGEDONCREDENTIALS`: `AAAuthSchemes` = 4;
public const val `AA_AUTH_MAX`: `AAAuthSchemes` = 12;
public const val `AA_AUTH_MIN`: `AAAuthSchemes` = 0;
public const val `AA_AUTH_NEGOTIATE`: `AAAuthSchemes` = 5;
public const val `AA_AUTH_NTLM`: `AAAuthSchemes` = 2;
public const val `AA_AUTH_ORGID`: `AAAuthSchemes` = 9;
public const val `AA_AUTH_SC`: `AAAuthSchemes` = 3;
public const val `AA_AUTH_SSPI_NTLM`: `AAAuthSchemes` = 11;
public const val `AA_MAIN_SESSION_CLOSED`: `AAAccountingDataType` = 3;
public const val `AA_MAIN_SESSION_CREATION`: `AAAccountingDataType` = 0;
public const val `AA_SUB_SESSION_CLOSED`: `AAAccountingDataType` = 2;
public const val `AA_SUB_SESSION_CREATION`: `AAAccountingDataType` = 1;
public const val `AA_TRUSTEDUSER_TRUSTEDCLIENT`: `AATrustClassID` = 2;
public const val `AA_TRUSTEDUSER_UNTRUSTEDCLIENT`: `AATrustClassID` = 1;
public const val `AA_UNTRUSTED`: `AATrustClassID` = 0;
public const val `ACQUIRE_TARGET_LOCK_TIMEOUT`: UInt = 300000u;
// UNSUPPORTED Rust 118:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const ADsTSUserEx: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe2e9cae6_1e7b_4b8e_babd_e9bf6292ac29);

// UNSUPPORTED Rust 119:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct AE_CURRENT_POSITION {
//     pub u64DevicePosition: u64,
//     pub u64StreamPosition: u64,
//     pub u64PaddingFrames: u64,
//     pub hnsQPCPosition: i64,
//     pub f32FramesPerSecond: f32,
//     pub Flag: AE_POSITION_FLAGS,
// }

public typealias `AE_POSITION_FLAGS` = Int;
public const val `AllowOnlySDRServers`: `PolicyAttributeType` = 7;
// UNSUPPORTED Rust 131:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct BITMAP_RENDERER_STATISTICS {
//     pub dwFramesDelivered: u32,
//     pub dwFramesDropped: u32,
// }

public const val `CHANNEL_BUFFER_SIZE`: UInt = 65535u;
public const val `CHANNEL_CHUNK_LENGTH`: UInt = 1600u;
// UNSUPPORTED Rust 139:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct CHANNEL_DEF {
//     pub name: [i8; 8],
//     pub options: u32,
// }

// UNSUPPORTED Rust 145:1: declaration Impl has no candidate rule
// impl Default for CHANNEL_DEF {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 150:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CHANNEL_ENTRY_POINTS {
//     pub cbSize: u32,
//     pub protocolVersion: u32,
//     pub pVirtualChannelInit: PVIRTUALCHANNELINIT,
//     pub pVirtualChannelOpen: PVIRTUALCHANNELOPEN,
//     pub pVirtualChannelClose: PVIRTUALCHANNELCLOSE,
//     pub pVirtualChannelWrite: PVIRTUALCHANNELWRITE,
// }

public const val `CHANNEL_EVENT_CONNECTED`: UInt = 1u;
public const val `CHANNEL_EVENT_DATA_RECEIVED`: UInt = 10u;
public const val `CHANNEL_EVENT_DISCONNECTED`: UInt = 3u;
public const val `CHANNEL_EVENT_INITIALIZED`: UInt = 0u;
public const val `CHANNEL_EVENT_TERMINATED`: UInt = 4u;
public const val `CHANNEL_EVENT_V1_CONNECTED`: UInt = 2u;
public const val `CHANNEL_EVENT_WRITE_CANCELLED`: UInt = 12u;
public const val `CHANNEL_EVENT_WRITE_COMPLETE`: UInt = 11u;
public const val `CHANNEL_FLAG_FAIL`: UInt = 256u;
public const val `CHANNEL_FLAG_FIRST`: UInt = 1u;
public const val `CHANNEL_FLAG_LAST`: UInt = 2u;
public const val `CHANNEL_FLAG_MIDDLE`: UInt = 0u;
public const val `CHANNEL_MAX_COUNT`: UInt = 30u;
public const val `CHANNEL_NAME_LEN`: UInt = 7u;
public const val `CHANNEL_OPTION_COMPRESS`: UInt = 4194304u;
public const val `CHANNEL_OPTION_COMPRESS_RDP`: UInt = 8388608u;
public const val `CHANNEL_OPTION_ENCRYPT_CS`: UInt = 268435456u;
public const val `CHANNEL_OPTION_ENCRYPT_RDP`: UInt = 1073741824u;
public const val `CHANNEL_OPTION_ENCRYPT_SC`: UInt = 536870912u;
public const val `CHANNEL_OPTION_INITIALIZED`: UInt = 2147483648u;
public const val `CHANNEL_OPTION_PRI_HIGH`: UInt = 134217728u;
public const val `CHANNEL_OPTION_PRI_LOW`: UInt = 33554432u;
public const val `CHANNEL_OPTION_PRI_MED`: UInt = 67108864u;
public const val `CHANNEL_OPTION_REMOTE_CONTROL_PERSISTENT`: UInt = 1048576u;
public const val `CHANNEL_OPTION_SHOW_PROTOCOL`: UInt = 2097152u;
// UNSUPPORTED Rust 185:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CHANNEL_PDU_HEADER {
//     pub length: u32,
//     pub flags: u32,
// }

public const val `CHANNEL_RC_ALREADY_CONNECTED`: UInt = 3u;
public const val `CHANNEL_RC_ALREADY_INITIALIZED`: UInt = 1u;
public const val `CHANNEL_RC_ALREADY_OPEN`: UInt = 14u;
public const val `CHANNEL_RC_BAD_CHANNEL`: UInt = 6u;
public const val `CHANNEL_RC_BAD_CHANNEL_HANDLE`: UInt = 7u;
public const val `CHANNEL_RC_BAD_INIT_HANDLE`: UInt = 9u;
public const val `CHANNEL_RC_BAD_PROC`: UInt = 11u;
public const val `CHANNEL_RC_INITIALIZATION_ERROR`: UInt = 20u;
public const val `CHANNEL_RC_INVALID_INSTANCE`: UInt = 18u;
public const val `CHANNEL_RC_NOT_CONNECTED`: UInt = 4u;
public const val `CHANNEL_RC_NOT_INITIALIZED`: UInt = 2u;
public const val `CHANNEL_RC_NOT_IN_VIRTUALCHANNELENTRY`: UInt = 15u;
public const val `CHANNEL_RC_NOT_OPEN`: UInt = 10u;
public const val `CHANNEL_RC_NO_BUFFER`: UInt = 8u;
public const val `CHANNEL_RC_NO_MEMORY`: UInt = 12u;
public const val `CHANNEL_RC_NULL_DATA`: UInt = 16u;
public const val `CHANNEL_RC_OK`: UInt = 0u;
public const val `CHANNEL_RC_TOO_MANY_CHANNELS`: UInt = 5u;
public const val `CHANNEL_RC_UNKNOWN_CHANNEL_NAME`: UInt = 13u;
public const val `CHANNEL_RC_UNSUPPORTED_VERSION`: UInt = 19u;
public const val `CHANNEL_RC_ZERO_LENGTH`: UInt = 17u;
public const val `CLIENTADDRESS_LENGTH`: UInt = 30u;
public const val `CLIENTNAME_LENGTH`: UInt = 20u;
// UNSUPPORTED Rust 214:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CLIENT_DISPLAY {
//     pub HorizontalResolution: u32,
//     pub VerticalResolution: u32,
//     pub ColorDepth: u32,
// }

public const val `CLIENT_MESSAGE_CONNECTION_ERROR`: `CLIENT_MESSAGE_TYPE` = 2;
public const val `CLIENT_MESSAGE_CONNECTION_INVALID`: `CLIENT_MESSAGE_TYPE` = 0;
public const val `CLIENT_MESSAGE_CONNECTION_STATUS`: `CLIENT_MESSAGE_TYPE` = 1;
public typealias `CLIENT_MESSAGE_TYPE` = Int;
public typealias `CONNECTION_CHANGE_NOTIFICATION` = Int;
// UNSUPPORTED Rust 226:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CONNECTION_PROPERTY_CURSOR_BLINK_DISABLED: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4b150580_fea4_4d3c_9de4_7433a66618f7);

// UNSUPPORTED Rust 227:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CONNECTION_PROPERTY_IDLE_TIME_WARNING: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x693f7ff5_0c4e_4d17_b8e0_1f70325e5d58);

public const val `CONNECTION_REQUEST_CANCELLED`: `CONNECTION_CHANGE_NOTIFICATION` = 5;
public const val `CONNECTION_REQUEST_FAILED`: `CONNECTION_CHANGE_NOTIFICATION` = 2;
public const val `CONNECTION_REQUEST_INVALID`: `CONNECTION_CHANGE_NOTIFICATION` = 0;
public const val `CONNECTION_REQUEST_LB_COMPLETED`: `CONNECTION_CHANGE_NOTIFICATION` = 6;
public const val `CONNECTION_REQUEST_ORCH_COMPLETED`: `CONNECTION_CHANGE_NOTIFICATION` = 8;
public const val `CONNECTION_REQUEST_PENDING`: `CONNECTION_CHANGE_NOTIFICATION` = 1;
public const val `CONNECTION_REQUEST_QUERY_PL_COMPLETED`: `CONNECTION_CHANGE_NOTIFICATION` = 7;
public const val `CONNECTION_REQUEST_SUCCEEDED`: `CONNECTION_CHANGE_NOTIFICATION` = 4;
public const val `CONNECTION_REQUEST_TIMEDOUT`: `CONNECTION_CHANGE_NOTIFICATION` = 3;
public const val `ClipboardRedirectionDisabled`: `PolicyAttributeType` = 5;
public const val `DISPID_AX_ADMINMESSAGERECEIVED`: UInt = 760u;
public const val `DISPID_AX_AUTORECONNECTED`: UInt = 756u;
public const val `DISPID_AX_AUTORECONNECTING`: UInt = 755u;
public const val `DISPID_AX_CONNECTED`: UInt = 751u;
public const val `DISPID_AX_CONNECTING`: UInt = 750u;
public const val `DISPID_AX_DIALOGDISMISSED`: UInt = 758u;
public const val `DISPID_AX_DIALOGDISPLAYING`: UInt = 757u;
public const val `DISPID_AX_DISCONNECTED`: UInt = 753u;
public const val `DISPID_AX_KEYCOMBINATIONPRESSED`: UInt = 761u;
public const val `DISPID_AX_LOGINCOMPLETED`: UInt = 752u;
public const val `DISPID_AX_NETWORKSTATUSCHANGED`: UInt = 759u;
public const val `DISPID_AX_REMOTEDESKTOPSIZECHANGED`: UInt = 762u;
public const val `DISPID_AX_STATUSCHANGED`: UInt = 754u;
public const val `DISPID_AX_TOUCHPOINTERCURSORMOVED`: UInt = 800u;
public const val `DISPID_METHOD_REMOTEDESKTOPCLIENT_APPLY_SETTINGS`: UInt = 722u;
public const val `DISPID_METHOD_REMOTEDESKTOPCLIENT_ATTACH_EVENT`: UInt = 706u;
public const val `DISPID_METHOD_REMOTEDESKTOPCLIENT_CONNECT`: UInt = 701u;
public const val `DISPID_METHOD_REMOTEDESKTOPCLIENT_DELETE_SAVED_CREDENTIALS`: UInt = 704u;
public const val `DISPID_METHOD_REMOTEDESKTOPCLIENT_DETACH_EVENT`: UInt = 707u;
public const val `DISPID_METHOD_REMOTEDESKTOPCLIENT_DISCONNECT`: UInt = 702u;
public const val `DISPID_METHOD_REMOTEDESKTOPCLIENT_EXECUTE_REMOTE_ACTION`: UInt = 732u;
public const val `DISPID_METHOD_REMOTEDESKTOPCLIENT_GET_RDPPROPERTY`: UInt = 721u;
public const val `DISPID_METHOD_REMOTEDESKTOPCLIENT_GET_SNAPSHOT`: UInt = 733u;
public const val `DISPID_METHOD_REMOTEDESKTOPCLIENT_RECONNECT`: UInt = 703u;
public const val `DISPID_METHOD_REMOTEDESKTOPCLIENT_RESUME_SCREEN_UPDATES`: UInt = 731u;
public const val `DISPID_METHOD_REMOTEDESKTOPCLIENT_RETRIEVE_SETTINGS`: UInt = 723u;
public const val `DISPID_METHOD_REMOTEDESKTOPCLIENT_SET_RDPPROPERTY`: UInt = 720u;
public const val `DISPID_METHOD_REMOTEDESKTOPCLIENT_SUSPEND_SCREEN_UPDATES`: UInt = 730u;
public const val `DISPID_METHOD_REMOTEDESKTOPCLIENT_UPDATE_SESSION_DISPLAYSETTINGS`: UInt = 705u;
public const val `DISPID_PROP_REMOTEDESKTOPCLIENT_ACTIONS`: UInt = 711u;
public const val `DISPID_PROP_REMOTEDESKTOPCLIENT_SETTINGS`: UInt = 710u;
public const val `DISPID_PROP_REMOTEDESKTOPCLIENT_TOUCHPOINTER_ENABLED`: UInt = 740u;
public const val `DISPID_PROP_REMOTEDESKTOPCLIENT_TOUCHPOINTER_EVENTSENABLED`: UInt = 741u;
public const val `DISPID_PROP_REMOTEDESKTOPCLIENT_TOUCHPOINTER_POINTERSPEED`: UInt = 742u;
public const val `DISPID_PROP_REMOTEDESKTOPCLIENT_TOUCH_POINTER`: UInt = 712u;
public const val `DOMAIN_LENGTH`: UInt = 17u;
public const val `DisableAllRedirections`: `PolicyAttributeType` = 1;
public const val `DriveRedirectionDisabled`: `PolicyAttributeType` = 2;
public const val `EnableAllRedirections`: `PolicyAttributeType` = 0;
public const val `FARM`: `TARGET_TYPE` = 1;
public const val `FORCE_REJOIN`: UInt = 2u;
public const val `FORCE_REJOIN_IN_CLUSTERMODE`: UInt = 3u;
public const val `KEEP_EXISTING_SESSIONS`: UInt = 8u;
public const val `KeyCombinationDown`: `KeyCombinationType` = 4;
public const val `KeyCombinationHome`: `KeyCombinationType` = 0;
public const val `KeyCombinationLeft`: `KeyCombinationType` = 1;
public const val `KeyCombinationRight`: `KeyCombinationType` = 3;
public const val `KeyCombinationScroll`: `KeyCombinationType` = 5;
public typealias `KeyCombinationType` = Int;
public const val `KeyCombinationUp`: `KeyCombinationType` = 2;
public const val `LOAD_BALANCING_PLUGIN`: `PLUGIN_TYPE` = 4;
public const val `MAX_DATE_TIME_LENGTH`: UInt = 56u;
public const val `MAX_ELAPSED_TIME_LENGTH`: UInt = 15u;
public const val `MAX_POLICY_ATTRIBUTES`: UInt = 20u;
public const val `MaxAppName_Len`: UInt = 256u;
public const val `MaxDomainName_Len`: UInt = 256u;
public const val `MaxFQDN_Len`: UInt = 256u;
public const val `MaxFarm_Len`: UInt = 256u;
public const val `MaxNetBiosName_Len`: UInt = 16u;
public const val `MaxNumOfExposed_IPs`: UInt = 12u;
public const val `MaxUserName_Len`: UInt = 104u;
public const val `NONFARM`: `TARGET_TYPE` = 2;
public const val `NOTIFY_FOR_ALL_SESSIONS`: UInt = 1u;
public const val `NOTIFY_FOR_THIS_SESSION`: UInt = 0u;
public const val `ORCHESTRATION_PLUGIN`: `PLUGIN_TYPE` = 16;
public const val `OWNER_MS_TS_PLUGIN`: `TARGET_OWNER` = 1;
public const val `OWNER_MS_VM_PLUGIN`: `TARGET_OWNER` = 2;
public const val `OWNER_UNKNOWN`: `TARGET_OWNER` = 0;
// UNSUPPORTED Rust 306:1: generic scalar type unsupported
// pub type PCHANNEL_INIT_EVENT_FN = Option<unsafe extern "system" fn(pinithandle: *mut core::ffi::c_void, event: u32, pdata: *mut core::ffi::c_void, datalength: u32)>;

// UNSUPPORTED Rust 307:1: generic scalar type unsupported
// pub type PCHANNEL_OPEN_EVENT_FN = Option<unsafe extern "system" fn(openhandle: u32, event: u32, pdata: *mut core::ffi::c_void, datalength: u32, totallength: u32, dataflags: u32)>;

public const val `PLACEMENT_PLUGIN`: `PLUGIN_TYPE` = 8;
public const val `PLUGIN_CAPABILITY_EXTERNAL_REDIRECTION`: UInt = 1u;
public typealias `PLUGIN_TYPE` = Int;
public const val `POLICY_PLUGIN`: `PLUGIN_TYPE` = 1;
public const val `POSITION_CONTINUOUS`: `AE_POSITION_FLAGS` = 2;
public const val `POSITION_DISCONTINUOUS`: `AE_POSITION_FLAGS` = 1;
public const val `POSITION_INVALID`: `AE_POSITION_FLAGS` = 0;
public const val `POSITION_QPC_ERROR`: `AE_POSITION_FLAGS` = 4;
public const val `PRODUCTINFO_COMPANYNAME_LENGTH`: UInt = 256u;
public const val `PRODUCTINFO_PRODUCTID_LENGTH`: UInt = 4u;
// UNSUPPORTED Rust 318:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PRODUCT_INFOA {
//     pub CompanyName: [i8; 256],
//     pub ProductID: [i8; 4],
// }

// UNSUPPORTED Rust 324:1: declaration Impl has no candidate rule
// impl Default for PRODUCT_INFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 329:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PRODUCT_INFOW {
//     pub CompanyName: [u16; 256],
//     pub ProductID: [u16; 4],
// }

// UNSUPPORTED Rust 335:1: declaration Impl has no candidate rule
// impl Default for PRODUCT_INFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 340:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const PROPERTY_DYNAMIC_TIME_ZONE_INFORMATION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0cdfd28e_d0b9_4c1f_a5eb_6d1f6c6535b9);

// UNSUPPORTED Rust 341:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const PROPERTY_TYPE_ENABLE_UNIVERSAL_APPS_FOR_CUSTOM_SHELL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xed2c3fda_338d_4d3f_81a3_e767310d908e);

// UNSUPPORTED Rust 342:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const PROPERTY_TYPE_GET_FAST_RECONNECT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6212d757_0043_4862_99c3_9f3059ac2a3b);

// UNSUPPORTED Rust 343:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const PROPERTY_TYPE_GET_FAST_RECONNECT_USER_SID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x197c427a_0135_4b6d_9c5e_e6579a0ab625);

public const val `PROVISIONING_PLUGIN`: `PLUGIN_TYPE` = 32;
// UNSUPPORTED Rust 345:1: generic scalar type unsupported
// pub type PVIRTUALCHANNELCLOSE = Option<unsafe extern "system" fn(openhandle: u32) -> u32>;

// UNSUPPORTED Rust 346:1: generic scalar type unsupported
// pub type PVIRTUALCHANNELENTRY = Option<unsafe extern "system" fn(pentrypoints: *mut CHANNEL_ENTRY_POINTS) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 347:1: generic scalar type unsupported
// pub type PVIRTUALCHANNELINIT = Option<unsafe extern "system" fn(ppinithandle: *mut *mut core::ffi::c_void, pchannel: *mut CHANNEL_DEF, channelcount: i32, versionrequested: u32, pchanneliniteventproc: PCHANNEL_INIT_EVENT_FN) -> u32>;

// UNSUPPORTED Rust 348:1: generic scalar type unsupported
// pub type PVIRTUALCHANNELOPEN = Option<unsafe extern "system" fn(pinithandle: *mut core::ffi::c_void, popenhandle: *mut u32, pchannelname: windows_sys::core::PCSTR, pchannelopeneventproc: PCHANNEL_OPEN_EVENT_FN) -> u32>;

// UNSUPPORTED Rust 349:1: generic scalar type unsupported
// pub type PVIRTUALCHANNELWRITE = Option<unsafe extern "system" fn(openhandle: u32, pdata: *mut core::ffi::c_void, datalength: u32, puserdata: *mut core::ffi::c_void) -> u32>;

public typealias `PasswordEncodingType` = Int;
public const val `PasswordEncodingUTF16BE`: `PasswordEncodingType` = 2;
public const val `PasswordEncodingUTF16LE`: `PasswordEncodingType` = 1;
public const val `PasswordEncodingUTF8`: `PasswordEncodingType` = 0;
public const val `PnpRedirectionDisabled`: `PolicyAttributeType` = 6;
public typealias `PolicyAttributeType` = Int;
public const val `PortRedirectionDisabled`: `PolicyAttributeType` = 4;
public const val `PrinterRedirectionDisabled`: `PolicyAttributeType` = 3;
// UNSUPPORTED Rust 358:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const RDCLIENT_BITMAP_RENDER_SERVICE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe4cc08cb_942e_4b19_8504_bd5a89a747f5);

public typealias `RDV_TASK_STATUS` = Int;
public const val `RDV_TASK_STATUS_APPLYING`: `RDV_TASK_STATUS` = 3;
public const val `RDV_TASK_STATUS_DOWNLOADING`: `RDV_TASK_STATUS` = 2;
public const val `RDV_TASK_STATUS_FAILED`: `RDV_TASK_STATUS` = 7;
public const val `RDV_TASK_STATUS_REBOOTED`: `RDV_TASK_STATUS` = 5;
public const val `RDV_TASK_STATUS_REBOOTING`: `RDV_TASK_STATUS` = 4;
public const val `RDV_TASK_STATUS_SEARCHING`: `RDV_TASK_STATUS` = 1;
public const val `RDV_TASK_STATUS_SUCCESS`: `RDV_TASK_STATUS` = 6;
public const val `RDV_TASK_STATUS_TIMEOUT`: `RDV_TASK_STATUS` = 8;
public const val `RDV_TASK_STATUS_UNKNOWN`: `RDV_TASK_STATUS` = 0;
public const val `RD_FARM_AUTO_PERSONAL_RDSH`: `RD_FARM_TYPE` = 5;
public const val `RD_FARM_AUTO_PERSONAL_VM`: `RD_FARM_TYPE` = 3;
public const val `RD_FARM_MANUAL_PERSONAL_RDSH`: `RD_FARM_TYPE` = 4;
public const val `RD_FARM_MANUAL_PERSONAL_VM`: `RD_FARM_TYPE` = 2;
public const val `RD_FARM_RDSH`: `RD_FARM_TYPE` = 0;
public const val `RD_FARM_TEMP_VM`: `RD_FARM_TYPE` = 1;
public typealias `RD_FARM_TYPE` = Int;
public const val `RD_FARM_TYPE_UNKNOWN`: `RD_FARM_TYPE` = -1;
public const val `REMOTECONTROL_KBDALT_HOTKEY`: UInt = 4u;
public const val `REMOTECONTROL_KBDCTRL_HOTKEY`: UInt = 2u;
public const val `REMOTECONTROL_KBDSHIFT_HOTKEY`: UInt = 1u;
public const val `RENDER_HINT_CLEAR`: UInt = 0u;
public const val `RENDER_HINT_MAPPEDWINDOW`: UInt = 2u;
public const val `RENDER_HINT_VIDEO`: UInt = 1u;
public const val `RESERVED_FOR_LEGACY`: UInt = 4u;
public const val `RESOURCE_PLUGIN`: `PLUGIN_TYPE` = 2;
public const val `RFX_CLIENT_ID_LENGTH`: UInt = 32u;
public const val `RFX_GFX_MAX_SUPPORTED_MONITORS`: UInt = 16u;
// UNSUPPORTED Rust 387:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct RFX_GFX_MONITOR_INFO {
//     pub left: i32,
//     pub top: i32,
//     pub right: i32,
//     pub bottom: i32,
//     pub physicalWidth: u32,
//     pub physicalHeight: u32,
//     pub orientation: u32,
//     pub primary: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 399:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct RFX_GFX_MSG_CLIENT_DESKTOP_INFO_REQUEST {
//     pub channelHdr: RFX_GFX_MSG_HEADER,
// }

// UNSUPPORTED Rust 404:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct RFX_GFX_MSG_CLIENT_DESKTOP_INFO_RESPONSE {
//     pub channelHdr: RFX_GFX_MSG_HEADER,
//     pub reserved: u32,
//     pub monitorCount: u32,
//     pub MonitorData: [RFX_GFX_MONITOR_INFO; 16],
//     pub clientUniqueId: [u16; 32],
// }

// UNSUPPORTED Rust 413:1: declaration Impl has no candidate rule
// impl Default for RFX_GFX_MSG_CLIENT_DESKTOP_INFO_RESPONSE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 418:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct RFX_GFX_MSG_DESKTOP_CONFIG_CHANGE_CONFIRM {
//     pub channelHdr: RFX_GFX_MSG_HEADER,
// }

// UNSUPPORTED Rust 423:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct RFX_GFX_MSG_DESKTOP_CONFIG_CHANGE_NOTIFY {
//     pub channelHdr: RFX_GFX_MSG_HEADER,
//     pub ulWidth: u32,
//     pub ulHeight: u32,
//     pub ulBpp: u32,
//     pub Reserved: u32,
// }

// UNSUPPORTED Rust 432:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct RFX_GFX_MSG_DESKTOP_INPUT_RESET {
//     pub channelHdr: RFX_GFX_MSG_HEADER,
//     pub ulWidth: u32,
//     pub ulHeight: u32,
// }

// UNSUPPORTED Rust 439:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct RFX_GFX_MSG_DESKTOP_RESEND_REQUEST {
//     pub channelHdr: RFX_GFX_MSG_HEADER,
//     pub RedrawRect: RFX_GFX_RECT,
// }

// UNSUPPORTED Rust 445:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct RFX_GFX_MSG_DISCONNECT_NOTIFY {
//     pub channelHdr: RFX_GFX_MSG_HEADER,
//     pub DisconnectReason: u32,
// }

// UNSUPPORTED Rust 451:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct RFX_GFX_MSG_HEADER {
//     pub uMSGType: u16,
//     pub cbSize: u16,
// }

public const val `RFX_GFX_MSG_PREFIX`: UInt = 48u;
public const val `RFX_GFX_MSG_PREFIX_MASK`: UInt = 48u;
// UNSUPPORTED Rust 459:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RFX_GFX_MSG_RDP_DATA {
//     pub channelHdr: RFX_GFX_MSG_HEADER,
//     pub rdpData: [u8; 1],
// }

// UNSUPPORTED Rust 465:1: declaration Impl has no candidate rule
// impl Default for RFX_GFX_MSG_RDP_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 470:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct RFX_GFX_RECT {
//     pub left: i32,
//     pub top: i32,
//     pub right: i32,
//     pub bottom: i32,
// }

public const val `RFX_RDP_MSG_PREFIX`: UInt = 0u;
public const val `RemoteActionAppSwitch`: `RemoteActionType` = 4;
public const val `RemoteActionAppbar`: `RemoteActionType` = 1;
public const val `RemoteActionCharms`: `RemoteActionType` = 0;
public const val `RemoteActionSnap`: `RemoteActionType` = 2;
public const val `RemoteActionStartScreen`: `RemoteActionType` = 3;
public typealias `RemoteActionType` = Int;
public const val `SB_SYNCH_CONFLICT_MAX_WRITE_ATTEMPTS`: UInt = 100u;
public const val `SESSION_TIMEOUT_ACTION_DISCONNECT`: `SESSION_TIMEOUT_ACTION_TYPE` = 0;
public const val `SESSION_TIMEOUT_ACTION_SILENT_REAUTH`: `SESSION_TIMEOUT_ACTION_TYPE` = 1;
public typealias `SESSION_TIMEOUT_ACTION_TYPE` = Int;
public const val `SINGLE_SESSION`: UInt = 1u;
public const val `STATE_ACTIVE`: `TSSESSION_STATE` = 0;
public const val `STATE_CONNECTED`: `TSSESSION_STATE` = 1;
public const val `STATE_CONNECTQUERY`: `TSSESSION_STATE` = 2;
public const val `STATE_DISCONNECTED`: `TSSESSION_STATE` = 4;
public const val `STATE_DOWN`: `TSSESSION_STATE` = 8;
public const val `STATE_IDLE`: `TSSESSION_STATE` = 5;
public const val `STATE_INIT`: `TSSESSION_STATE` = 9;
public const val `STATE_INVALID`: `TSSESSION_STATE` = -1;
public const val `STATE_LISTEN`: `TSSESSION_STATE` = 6;
public const val `STATE_MAX`: `TSSESSION_STATE` = 10;
public const val `STATE_RESET`: `TSSESSION_STATE` = 7;
public const val `STATE_SHADOW`: `TSSESSION_STATE` = 3;
public const val `SnapshotEncodingDataUri`: `SnapshotEncodingType` = 0;
public typealias `SnapshotEncodingType` = Int;
public const val `SnapshotFormatBmp`: `SnapshotFormatType` = 2;
public const val `SnapshotFormatJpeg`: `SnapshotFormatType` = 1;
public const val `SnapshotFormatPng`: `SnapshotFormatType` = 0;
public typealias `SnapshotFormatType` = Int;
public typealias `TARGET_CHANGE_TYPE` = Int;
public const val `TARGET_CHANGE_UNSPEC`: `TARGET_CHANGE_TYPE` = 1;
public const val `TARGET_CHECKED_OUT`: `TARGET_STATE` = 6;
public const val `TARGET_DOWN`: `TARGET_STATE` = 4;
public const val `TARGET_EXTERNALIP_CHANGED`: `TARGET_CHANGE_TYPE` = 2;
public const val `TARGET_FARM_MEMBERSHIP_CHANGED`: `TARGET_CHANGE_TYPE` = 1024;
public const val `TARGET_HIBERNATED`: `TARGET_STATE` = 5;
public const val `TARGET_IDLE`: `TARGET_CHANGE_TYPE` = 64;
public const val `TARGET_INITIALIZING`: `TARGET_STATE` = 2;
public const val `TARGET_INTERNALIP_CHANGED`: `TARGET_CHANGE_TYPE` = 4;
public const val `TARGET_INUSE`: `TARGET_CHANGE_TYPE` = 256;
public const val `TARGET_INVALID`: `TARGET_STATE` = 8;
public const val `TARGET_JOINED`: `TARGET_CHANGE_TYPE` = 8;
public const val `TARGET_MAXSTATE`: `TARGET_STATE` = 11;
public typealias `TARGET_OWNER` = Int;
public const val `TARGET_PATCH_COMPLETED`: `TARGET_PATCH_STATE` = 3;
public const val `TARGET_PATCH_FAILED`: `TARGET_PATCH_STATE` = 4;
public const val `TARGET_PATCH_IN_PROGRESS`: `TARGET_PATCH_STATE` = 2;
public const val `TARGET_PATCH_NOT_STARTED`: `TARGET_PATCH_STATE` = 1;
public typealias `TARGET_PATCH_STATE` = Int;
public const val `TARGET_PATCH_STATE_CHANGED`: `TARGET_CHANGE_TYPE` = 512;
public const val `TARGET_PATCH_UNKNOWN`: `TARGET_PATCH_STATE` = 0;
public const val `TARGET_PENDING`: `TARGET_CHANGE_TYPE` = 128;
public const val `TARGET_REMOVED`: `TARGET_CHANGE_TYPE` = 16;
public const val `TARGET_RUNNING`: `TARGET_STATE` = 3;
public const val `TARGET_STARTING`: `TARGET_STATE` = 9;
public typealias `TARGET_STATE` = Int;
public const val `TARGET_STATE_CHANGED`: `TARGET_CHANGE_TYPE` = 32;
public const val `TARGET_STOPPED`: `TARGET_STATE` = 7;
public const val `TARGET_STOPPING`: `TARGET_STATE` = 10;
public typealias `TARGET_TYPE` = Int;
public const val `TARGET_UNKNOWN`: `TARGET_STATE` = 1;
public const val `TASK_PLUGIN`: `PLUGIN_TYPE` = 64;
public const val `TSPUB_PLUGIN_PD_ASSIGNMENT_EXISTING`: `TSPUB_PLUGIN_PD_ASSIGNMENT_TYPE` = 1;
public const val `TSPUB_PLUGIN_PD_ASSIGNMENT_NEW`: `TSPUB_PLUGIN_PD_ASSIGNMENT_TYPE` = 0;
public typealias `TSPUB_PLUGIN_PD_ASSIGNMENT_TYPE` = Int;
public const val `TSPUB_PLUGIN_PD_QUERY_EXISTING`: `TSPUB_PLUGIN_PD_RESOLUTION_TYPE` = 1;
public const val `TSPUB_PLUGIN_PD_QUERY_OR_CREATE`: `TSPUB_PLUGIN_PD_RESOLUTION_TYPE` = 0;
public typealias `TSPUB_PLUGIN_PD_RESOLUTION_TYPE` = Int;
public typealias `TSSB_NOTIFICATION_TYPE` = Int;
public const val `TSSB_NOTIFY_CONNECTION_REQUEST_CHANGE`: `TSSB_NOTIFICATION_TYPE` = 4;
public const val `TSSB_NOTIFY_INVALID`: `TSSB_NOTIFICATION_TYPE` = 0;
public const val `TSSB_NOTIFY_SESSION_CHANGE`: `TSSB_NOTIFICATION_TYPE` = 2;
public const val `TSSB_NOTIFY_TARGET_CHANGE`: `TSSB_NOTIFICATION_TYPE` = 1;
public const val `TSSD_ADDR_IPv4`: `TSSD_AddrV46Type` = 4;
public const val `TSSD_ADDR_IPv6`: `TSSD_AddrV46Type` = 6;
public const val `TSSD_ADDR_UNDEFINED`: `TSSD_AddrV46Type` = 0;
public typealias `TSSD_AddrV46Type` = Int;
// UNSUPPORTED Rust 556:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct TSSD_ConnectionPoint {
//     pub ServerAddressB: [u8; 16],
//     pub AddressType: TSSD_AddrV46Type,
//     pub PortNumber: u16,
//     pub AddressScope: u32,
// }

// UNSUPPORTED Rust 564:1: declaration Impl has no candidate rule
// impl Default for TSSD_ConnectionPoint {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `TSSESSION_STATE` = Int;
// UNSUPPORTED Rust 570:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const TSUserExInterfaces: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0910dd01_df8c_11d1_ae27_00c04fa35813);

public typealias `TS_SB_SORT_BY` = Int;
public const val `TS_SB_SORT_BY_NAME`: `TS_SB_SORT_BY` = 1;
public const val `TS_SB_SORT_BY_NONE`: `TS_SB_SORT_BY` = 0;
public const val `TS_SB_SORT_BY_PROP`: `TS_SB_SORT_BY` = 2;
public const val `TS_VC_LISTENER_STATIC_CHANNEL`: UInt = 1u;
public const val `UNKNOWN`: `TARGET_TYPE` = 0;
public const val `UNKNOWN_PLUGIN`: `PLUGIN_TYPE` = 0;
public const val `USERNAME_LENGTH`: UInt = 20u;
public const val `VALIDATIONINFORMATION_HARDWAREID_LENGTH`: UInt = 20u;
public const val `VALIDATIONINFORMATION_LICENSE_LENGTH`: UInt = 16384u;
public const val `VIRTUAL_CHANNEL_VERSION_WIN2000`: UInt = 1u;
public typealias `VM_HOST_NOTIFY_STATUS` = Int;
public const val `VM_HOST_STATUS_INIT_COMPLETE`: `VM_HOST_NOTIFY_STATUS` = 2;
public const val `VM_HOST_STATUS_INIT_FAILED`: `VM_HOST_NOTIFY_STATUS` = 3;
public const val `VM_HOST_STATUS_INIT_IN_PROGRESS`: `VM_HOST_NOTIFY_STATUS` = 1;
public const val `VM_HOST_STATUS_INIT_PENDING`: `VM_HOST_NOTIFY_STATUS` = 0;
// UNSUPPORTED Rust 587:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct VM_NOTIFY_ENTRY {
//     pub VmName: [u16; 128],
//     pub VmHost: [u16; 128],
// }

// UNSUPPORTED Rust 593:1: declaration Impl has no candidate rule
// impl Default for VM_NOTIFY_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 598:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct VM_NOTIFY_INFO {
//     pub dwNumEntries: u32,
//     pub ppVmEntries: *mut *mut VM_NOTIFY_ENTRY,
// }

// UNSUPPORTED Rust 604:1: declaration Impl has no candidate rule
// impl Default for VM_NOTIFY_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `VM_NOTIFY_STATUS` = Int;
public const val `VM_NOTIFY_STATUS_CANCELED`: `VM_NOTIFY_STATUS` = 4;
public const val `VM_NOTIFY_STATUS_COMPLETE`: `VM_NOTIFY_STATUS` = 2;
public const val `VM_NOTIFY_STATUS_FAILED`: `VM_NOTIFY_STATUS` = 3;
public const val `VM_NOTIFY_STATUS_IN_PROGRESS`: `VM_NOTIFY_STATUS` = 1;
public const val `VM_NOTIFY_STATUS_PENDING`: `VM_NOTIFY_STATUS` = 0;
// UNSUPPORTED Rust 615:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct VM_PATCH_INFO {
//     pub dwNumEntries: u32,
//     pub pVmNames: *mut windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 621:1: declaration Impl has no candidate rule
// impl Default for VM_PATCH_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WINSTATIONNAME_LENGTH`: UInt = 32u;
public const val `WKS_FLAG_CLEAR_CREDS_ON_LAST_RESOURCE`: UInt = 1u;
public const val `WKS_FLAG_CREDS_AUTHENTICATED`: UInt = 4u;
public const val `WKS_FLAG_PASSWORD_ENCRYPTED`: UInt = 2u;
public const val `WRDS_CLIENTADDRESS_LENGTH`: UInt = 30u;
public const val `WRDS_CLIENTNAME_LENGTH`: UInt = 20u;
public const val `WRDS_CLIENT_PRODUCT_ID_LENGTH`: UInt = 32u;
// UNSUPPORTED Rust 633:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WRDS_CONNECTION_SETTING {
//     pub WRdsConnectionSettings1: WRDS_CONNECTION_SETTINGS_1,
// }

// UNSUPPORTED Rust 638:1: declaration Impl has no candidate rule
// impl Default for WRDS_CONNECTION_SETTING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 643:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WRDS_CONNECTION_SETTINGS {
//     pub WRdsConnectionSettingLevel: WRDS_CONNECTION_SETTING_LEVEL,
//     pub WRdsConnectionSetting: WRDS_CONNECTION_SETTING,
// }

// UNSUPPORTED Rust 649:1: declaration Impl has no candidate rule
// impl Default for WRDS_CONNECTION_SETTINGS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 654:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WRDS_CONNECTION_SETTINGS_1 {
//     pub fInheritInitialProgram: bool,
//     pub fInheritColorDepth: bool,
//     pub fHideTitleBar: bool,
//     pub fInheritAutoLogon: bool,
//     pub fMaximizeShell: bool,
//     pub fDisablePNP: bool,
//     pub fPasswordIsScPin: bool,
//     pub fPromptForPassword: bool,
//     pub fDisableCpm: bool,
//     pub fDisableCdm: bool,
//     pub fDisableCcm: bool,
//     pub fDisableLPT: bool,
//     pub fDisableClip: bool,
//     pub fResetBroken: bool,
//     pub fDisableEncryption: bool,
//     pub fDisableAutoReconnect: bool,
//     pub fDisableCtrlAltDel: bool,
//     pub fDoubleClickDetect: bool,
//     pub fEnableWindowsKey: bool,
//     pub fUsingSavedCreds: bool,
//     pub fMouse: bool,
//     pub fNoAudioPlayback: bool,
//     pub fRemoteConsoleAudio: bool,
//     pub EncryptionLevel: u8,
//     pub ColorDepth: u16,
//     pub ProtocolType: u16,
//     pub HRes: u16,
//     pub VRes: u16,
//     pub ClientProductId: u16,
//     pub OutBufCountHost: u16,
//     pub OutBufCountClient: u16,
//     pub OutBufLength: u16,
//     pub KeyboardLayout: u32,
//     pub MaxConnectionTime: u32,
//     pub MaxDisconnectionTime: u32,
//     pub MaxIdleTime: u32,
//     pub PerformanceFlags: u32,
//     pub KeyboardType: u32,
//     pub KeyboardSubType: u32,
//     pub KeyboardFunctionKey: u32,
//     pub ActiveInputLocale: u32,
//     pub SerialNumber: u32,
//     pub ClientAddressFamily: u32,
//     pub ClientBuildNumber: u32,
//     pub ClientSessionId: u32,
//     pub WorkDirectory: [u16; 257],
//     pub InitialProgram: [u16; 257],
//     pub UserName: [u16; 256],
//     pub Domain: [u16; 256],
//     pub Password: [u16; 256],
//     pub ProtocolName: [u16; 9],
//     pub DisplayDriverName: [u16; 9],
//     pub DisplayDeviceName: [u16; 20],
//     pub imeFileName: [u16; 33],
//     pub AudioDriverName: [u16; 9],
//     pub ClientName: [u16; 21],
//     pub ClientAddress: [u16; 31],
//     pub ClientDirectory: [u16; 257],
//     pub ClientDigProductId: [u16; 33],
//     pub ClientSockAddress: WTS_SOCKADDR,
//     pub ClientTimeZone: WTS_TIME_ZONE_INFORMATION,
//     pub WRdsListenerSettings: WRDS_LISTENER_SETTINGS,
//     pub EventLogActivityId: windows_sys::core::GUID,
//     pub ContextSize: u32,
//     pub ContextData: *mut u8,
// }

// UNSUPPORTED Rust 723:1: declaration Impl has no candidate rule
// impl Default for WRDS_CONNECTION_SETTINGS_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WRDS_CONNECTION_SETTING_LEVEL` = Int;
public const val `WRDS_CONNECTION_SETTING_LEVEL_1`: `WRDS_CONNECTION_SETTING_LEVEL` = 1;
public const val `WRDS_CONNECTION_SETTING_LEVEL_INVALID`: `WRDS_CONNECTION_SETTING_LEVEL` = 0;
public const val `WRDS_DEVICE_NAME_LENGTH`: UInt = 19u;
public const val `WRDS_DIRECTORY_LENGTH`: UInt = 256u;
public const val `WRDS_DOMAIN_LENGTH`: UInt = 255u;
public const val `WRDS_DRIVER_NAME_LENGTH`: UInt = 8u;
// UNSUPPORTED Rust 735:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WRDS_DYNAMIC_TIME_ZONE_INFORMATION {
//     pub Bias: i32,
//     pub StandardName: [u16; 32],
//     pub StandardDate: WTS_SYSTEMTIME,
//     pub StandardBias: i32,
//     pub DaylightName: [u16; 32],
//     pub DaylightDate: WTS_SYSTEMTIME,
//     pub DaylightBias: i32,
//     pub TimeZoneKeyName: [u16; 128],
//     pub DynamicDaylightTimeDisabled: u16,
// }

// UNSUPPORTED Rust 748:1: declaration Impl has no candidate rule
// impl Default for WRDS_DYNAMIC_TIME_ZONE_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WRDS_IMEFILENAME_LENGTH`: UInt = 32u;
public const val `WRDS_INITIALPROGRAM_LENGTH`: UInt = 256u;
public const val `WRDS_KEY_EXCHANGE_ALG_DH`: UInt = 2u;
public const val `WRDS_KEY_EXCHANGE_ALG_RSA`: UInt = 1u;
public const val `WRDS_LICENSE_PREAMBLE_VERSION`: UInt = 3u;
public const val `WRDS_LICENSE_PROTOCOL_VERSION`: UInt = 65536u;
// UNSUPPORTED Rust 759:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WRDS_LISTENER_SETTING {
//     pub WRdsListenerSettings1: WRDS_LISTENER_SETTINGS_1,
// }

// UNSUPPORTED Rust 764:1: declaration Impl has no candidate rule
// impl Default for WRDS_LISTENER_SETTING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 769:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WRDS_LISTENER_SETTINGS {
//     pub WRdsListenerSettingLevel: WRDS_LISTENER_SETTING_LEVEL,
//     pub WRdsListenerSetting: WRDS_LISTENER_SETTING,
// }

// UNSUPPORTED Rust 775:1: declaration Impl has no candidate rule
// impl Default for WRDS_LISTENER_SETTINGS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 780:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WRDS_LISTENER_SETTINGS_1 {
//     pub MaxProtocolListenerConnectionCount: u32,
//     pub SecurityDescriptorSize: u32,
//     pub pSecurityDescriptor: *mut u8,
// }

// UNSUPPORTED Rust 787:1: declaration Impl has no candidate rule
// impl Default for WRDS_LISTENER_SETTINGS_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WRDS_LISTENER_SETTING_LEVEL` = Int;
public const val `WRDS_LISTENER_SETTING_LEVEL_1`: `WRDS_LISTENER_SETTING_LEVEL` = 1;
public const val `WRDS_LISTENER_SETTING_LEVEL_INVALID`: `WRDS_LISTENER_SETTING_LEVEL` = 0;
public const val `WRDS_MAX_CACHE_RESERVED`: UInt = 20u;
public const val `WRDS_MAX_COUNTERS`: UInt = 100u;
public const val `WRDS_MAX_DISPLAY_IOCTL_DATA`: UInt = 256u;
public const val `WRDS_MAX_PROTOCOL_CACHE`: UInt = 4u;
public const val `WRDS_MAX_RESERVED`: UInt = 100u;
public const val `WRDS_PASSWORD_LENGTH`: UInt = 255u;
public const val `WRDS_PERF_DISABLE_CURSORSETTINGS`: UInt = 64u;
public const val `WRDS_PERF_DISABLE_CURSOR_SHADOW`: UInt = 32u;
public const val `WRDS_PERF_DISABLE_FULLWINDOWDRAG`: UInt = 2u;
public const val `WRDS_PERF_DISABLE_MENUANIMATIONS`: UInt = 4u;
public const val `WRDS_PERF_DISABLE_NOTHING`: UInt = 0u;
public const val `WRDS_PERF_DISABLE_THEMING`: UInt = 8u;
public const val `WRDS_PERF_DISABLE_WALLPAPER`: UInt = 1u;
public const val `WRDS_PERF_ENABLE_DESKTOP_COMPOSITION`: UInt = 256u;
public const val `WRDS_PERF_ENABLE_ENHANCED_GRAPHICS`: UInt = 16u;
public const val `WRDS_PERF_ENABLE_FONT_SMOOTHING`: UInt = 128u;
public const val `WRDS_PROTOCOL_NAME_LENGTH`: UInt = 8u;
// UNSUPPORTED Rust 812:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const WRDS_SERVICE_ID_GRAPHICS_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd2993f4d_02cf_4280_8c48_1624b44f8706);

// UNSUPPORTED Rust 813:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WRDS_SETTING {
//     pub WRdsSettings1: WRDS_SETTINGS_1,
// }

// UNSUPPORTED Rust 818:1: declaration Impl has no candidate rule
// impl Default for WRDS_SETTING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 823:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WRDS_SETTINGS {
//     pub WRdsSettingType: WRDS_SETTING_TYPE,
//     pub WRdsSettingLevel: WRDS_SETTING_LEVEL,
//     pub WRdsSetting: WRDS_SETTING,
// }

// UNSUPPORTED Rust 830:1: declaration Impl has no candidate rule
// impl Default for WRDS_SETTINGS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 835:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WRDS_SETTINGS_1 {
//     pub WRdsDisableClipStatus: WRDS_SETTING_STATUS,
//     pub WRdsDisableClipValue: u32,
//     pub WRdsDisableLPTStatus: WRDS_SETTING_STATUS,
//     pub WRdsDisableLPTValue: u32,
//     pub WRdsDisableCcmStatus: WRDS_SETTING_STATUS,
//     pub WRdsDisableCcmValue: u32,
//     pub WRdsDisableCdmStatus: WRDS_SETTING_STATUS,
//     pub WRdsDisableCdmValue: u32,
//     pub WRdsDisableCpmStatus: WRDS_SETTING_STATUS,
//     pub WRdsDisableCpmValue: u32,
//     pub WRdsDisablePnpStatus: WRDS_SETTING_STATUS,
//     pub WRdsDisablePnpValue: u32,
//     pub WRdsEncryptionLevelStatus: WRDS_SETTING_STATUS,
//     pub WRdsEncryptionValue: u32,
//     pub WRdsColorDepthStatus: WRDS_SETTING_STATUS,
//     pub WRdsColorDepthValue: u32,
//     pub WRdsDisableAutoReconnecetStatus: WRDS_SETTING_STATUS,
//     pub WRdsDisableAutoReconnecetValue: u32,
//     pub WRdsDisableEncryptionStatus: WRDS_SETTING_STATUS,
//     pub WRdsDisableEncryptionValue: u32,
//     pub WRdsResetBrokenStatus: WRDS_SETTING_STATUS,
//     pub WRdsResetBrokenValue: u32,
//     pub WRdsMaxIdleTimeStatus: WRDS_SETTING_STATUS,
//     pub WRdsMaxIdleTimeValue: u32,
//     pub WRdsMaxDisconnectTimeStatus: WRDS_SETTING_STATUS,
//     pub WRdsMaxDisconnectTimeValue: u32,
//     pub WRdsMaxConnectTimeStatus: WRDS_SETTING_STATUS,
//     pub WRdsMaxConnectTimeValue: u32,
//     pub WRdsKeepAliveStatus: WRDS_SETTING_STATUS,
//     pub WRdsKeepAliveStartValue: bool,
//     pub WRdsKeepAliveIntervalValue: u32,
// }

public typealias `WRDS_SETTING_LEVEL` = Int;
public const val `WRDS_SETTING_LEVEL_1`: `WRDS_SETTING_LEVEL` = 1;
public const val `WRDS_SETTING_LEVEL_INVALID`: `WRDS_SETTING_LEVEL` = 0;
public typealias `WRDS_SETTING_STATUS` = Int;
public const val `WRDS_SETTING_STATUS_DISABLED`: `WRDS_SETTING_STATUS` = 0;
public const val `WRDS_SETTING_STATUS_ENABLED`: `WRDS_SETTING_STATUS` = 1;
public const val `WRDS_SETTING_STATUS_NOTAPPLICABLE`: `WRDS_SETTING_STATUS` = -1;
public const val `WRDS_SETTING_STATUS_NOTCONFIGURED`: `WRDS_SETTING_STATUS` = 2;
public typealias `WRDS_SETTING_TYPE` = Int;
public const val `WRDS_SETTING_TYPE_INVALID`: `WRDS_SETTING_TYPE` = 0;
public const val `WRDS_SETTING_TYPE_MACHINE`: `WRDS_SETTING_TYPE` = 1;
public const val `WRDS_SETTING_TYPE_SAM`: `WRDS_SETTING_TYPE` = 3;
public const val `WRDS_SETTING_TYPE_USER`: `WRDS_SETTING_TYPE` = 2;
public const val `WRDS_USERNAME_LENGTH`: UInt = 255u;
public const val `WRDS_VALUE_TYPE_BINARY`: UInt = 3u;
public const val `WRDS_VALUE_TYPE_GUID`: UInt = 4u;
public const val `WRDS_VALUE_TYPE_STRING`: UInt = 2u;
public const val `WRDS_VALUE_TYPE_ULONG`: UInt = 1u;
public typealias `WRdsGraphicsChannelType` = Int;
public const val `WRdsGraphicsChannelType_BestEffortDelivery`: `WRdsGraphicsChannelType` = 1;
public const val `WRdsGraphicsChannelType_GuaranteedDelivery`: `WRdsGraphicsChannelType` = 0;
public const val `WRdsGraphicsChannels_LossyChannelMaxMessageSize`: UInt = 988u;
public const val `WTSActive`: `WTS_CONNECTSTATE_CLASS` = 0;
public const val `WTSApplicationName`: `WTS_INFO_CLASS` = 1;
// UNSUPPORTED Rust 894:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WTSCLIENTA {
//     pub ClientName: [i8; 21],
//     pub Domain: [i8; 18],
//     pub UserName: [i8; 21],
//     pub WorkDirectory: [i8; 261],
//     pub InitialProgram: [i8; 261],
//     pub EncryptionLevel: u8,
//     pub ClientAddressFamily: u32,
//     pub ClientAddress: [u16; 31],
//     pub HRes: u16,
//     pub VRes: u16,
//     pub ColorDepth: u16,
//     pub ClientDirectory: [i8; 261],
//     pub ClientBuildNumber: u32,
//     pub ClientHardwareId: u32,
//     pub ClientProductId: u16,
//     pub OutBufCountHost: u16,
//     pub OutBufCountClient: u16,
//     pub OutBufLength: u16,
//     pub DeviceId: [i8; 261],
// }

// UNSUPPORTED Rust 917:1: declaration Impl has no candidate rule
// impl Default for WTSCLIENTA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 922:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WTSCLIENTW {
//     pub ClientName: [u16; 21],
//     pub Domain: [u16; 18],
//     pub UserName: [u16; 21],
//     pub WorkDirectory: [u16; 261],
//     pub InitialProgram: [u16; 261],
//     pub EncryptionLevel: u8,
//     pub ClientAddressFamily: u32,
//     pub ClientAddress: [u16; 31],
//     pub HRes: u16,
//     pub VRes: u16,
//     pub ColorDepth: u16,
//     pub ClientDirectory: [u16; 261],
//     pub ClientBuildNumber: u32,
//     pub ClientHardwareId: u32,
//     pub ClientProductId: u16,
//     pub OutBufCountHost: u16,
//     pub OutBufCountClient: u16,
//     pub OutBufLength: u16,
//     pub DeviceId: [u16; 261],
// }

// UNSUPPORTED Rust 945:1: declaration Impl has no candidate rule
// impl Default for WTSCLIENTW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 950:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WTSCONFIGINFOA {
//     pub version: u32,
//     pub fConnectClientDrivesAtLogon: u32,
//     pub fConnectPrinterAtLogon: u32,
//     pub fDisablePrinterRedirection: u32,
//     pub fDisableDefaultMainClientPrinter: u32,
//     pub ShadowSettings: u32,
//     pub LogonUserName: [i8; 21],
//     pub LogonDomain: [i8; 18],
//     pub WorkDirectory: [i8; 261],
//     pub InitialProgram: [i8; 261],
//     pub ApplicationName: [i8; 261],
// }

// UNSUPPORTED Rust 965:1: declaration Impl has no candidate rule
// impl Default for WTSCONFIGINFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 970:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WTSCONFIGINFOW {
//     pub version: u32,
//     pub fConnectClientDrivesAtLogon: u32,
//     pub fConnectPrinterAtLogon: u32,
//     pub fDisablePrinterRedirection: u32,
//     pub fDisableDefaultMainClientPrinter: u32,
//     pub ShadowSettings: u32,
//     pub LogonUserName: [u16; 21],
//     pub LogonDomain: [u16; 18],
//     pub WorkDirectory: [u16; 261],
//     pub InitialProgram: [u16; 261],
//     pub ApplicationName: [u16; 261],
// }

// UNSUPPORTED Rust 985:1: declaration Impl has no candidate rule
// impl Default for WTSCONFIGINFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WTSClientAddress`: `WTS_INFO_CLASS` = 14;
public const val `WTSClientBuildNumber`: `WTS_INFO_CLASS` = 9;
public const val `WTSClientDirectory`: `WTS_INFO_CLASS` = 11;
public const val `WTSClientDisplay`: `WTS_INFO_CLASS` = 15;
public const val `WTSClientHardwareId`: `WTS_INFO_CLASS` = 13;
public const val `WTSClientInfo`: `WTS_INFO_CLASS` = 23;
public const val `WTSClientName`: `WTS_INFO_CLASS` = 10;
public const val `WTSClientProductId`: `WTS_INFO_CLASS` = 12;
public const val `WTSClientProtocolType`: `WTS_INFO_CLASS` = 16;
public const val `WTSConfigInfo`: `WTS_INFO_CLASS` = 26;
public const val `WTSConnectQuery`: `WTS_CONNECTSTATE_CLASS` = 2;
public const val `WTSConnectState`: `WTS_INFO_CLASS` = 8;
public const val `WTSConnected`: `WTS_CONNECTSTATE_CLASS` = 1;
public const val `WTSDisconnected`: `WTS_CONNECTSTATE_CLASS` = 4;
public const val `WTSDomainName`: `WTS_INFO_CLASS` = 7;
public const val `WTSDown`: `WTS_CONNECTSTATE_CLASS` = 8;
// UNSUPPORTED Rust 1006:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WTSINFOA {
//     pub State: WTS_CONNECTSTATE_CLASS,
//     pub SessionId: u32,
//     pub IncomingBytes: u32,
//     pub OutgoingBytes: u32,
//     pub IncomingFrames: u32,
//     pub OutgoingFrames: u32,
//     pub IncomingCompressedBytes: u32,
//     pub OutgoingCompressedBy: u32,
//     pub WinStationName: [i8; 32],
//     pub Domain: [i8; 17],
//     pub UserName: [i8; 21],
//     pub ConnectTime: i64,
//     pub DisconnectTime: i64,
//     pub LastInputTime: i64,
//     pub LogonTime: i64,
//     pub CurrentTime: i64,
// }

// UNSUPPORTED Rust 1026:1: declaration Impl has no candidate rule
// impl Default for WTSINFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1031:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WTSINFOEXA {
//     pub Level: u32,
//     pub Data: WTSINFOEX_LEVEL_A,
// }

// UNSUPPORTED Rust 1037:1: declaration Impl has no candidate rule
// impl Default for WTSINFOEXA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1042:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WTSINFOEXW {
//     pub Level: u32,
//     pub Data: WTSINFOEX_LEVEL_W,
// }

// UNSUPPORTED Rust 1048:1: declaration Impl has no candidate rule
// impl Default for WTSINFOEXW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1053:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WTSINFOEX_LEVEL1_A {
//     pub SessionId: u32,
//     pub SessionState: WTS_CONNECTSTATE_CLASS,
//     pub SessionFlags: i32,
//     pub WinStationName: [i8; 33],
//     pub UserName: [i8; 21],
//     pub DomainName: [i8; 18],
//     pub LogonTime: i64,
//     pub ConnectTime: i64,
//     pub DisconnectTime: i64,
//     pub LastInputTime: i64,
//     pub CurrentTime: i64,
//     pub IncomingBytes: u32,
//     pub OutgoingBytes: u32,
//     pub IncomingFrames: u32,
//     pub OutgoingFrames: u32,
//     pub IncomingCompressedBytes: u32,
//     pub OutgoingCompressedBytes: u32,
// }

// UNSUPPORTED Rust 1074:1: declaration Impl has no candidate rule
// impl Default for WTSINFOEX_LEVEL1_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1079:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WTSINFOEX_LEVEL1_W {
//     pub SessionId: u32,
//     pub SessionState: WTS_CONNECTSTATE_CLASS,
//     pub SessionFlags: i32,
//     pub WinStationName: [u16; 33],
//     pub UserName: [u16; 21],
//     pub DomainName: [u16; 18],
//     pub LogonTime: i64,
//     pub ConnectTime: i64,
//     pub DisconnectTime: i64,
//     pub LastInputTime: i64,
//     pub CurrentTime: i64,
//     pub IncomingBytes: u32,
//     pub OutgoingBytes: u32,
//     pub IncomingFrames: u32,
//     pub OutgoingFrames: u32,
//     pub IncomingCompressedBytes: u32,
//     pub OutgoingCompressedBytes: u32,
// }

// UNSUPPORTED Rust 1100:1: declaration Impl has no candidate rule
// impl Default for WTSINFOEX_LEVEL1_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1105:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WTSINFOEX_LEVEL_A {
//     pub WTSInfoExLevel1: WTSINFOEX_LEVEL1_A,
// }

// UNSUPPORTED Rust 1110:1: declaration Impl has no candidate rule
// impl Default for WTSINFOEX_LEVEL_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1115:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WTSINFOEX_LEVEL_W {
//     pub WTSInfoExLevel1: WTSINFOEX_LEVEL1_W,
// }

// UNSUPPORTED Rust 1120:1: declaration Impl has no candidate rule
// impl Default for WTSINFOEX_LEVEL_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1125:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WTSINFOW {
//     pub State: WTS_CONNECTSTATE_CLASS,
//     pub SessionId: u32,
//     pub IncomingBytes: u32,
//     pub OutgoingBytes: u32,
//     pub IncomingFrames: u32,
//     pub OutgoingFrames: u32,
//     pub IncomingCompressedBytes: u32,
//     pub OutgoingCompressedBytes: u32,
//     pub WinStationName: [u16; 32],
//     pub Domain: [u16; 17],
//     pub UserName: [u16; 21],
//     pub ConnectTime: i64,
//     pub DisconnectTime: i64,
//     pub LastInputTime: i64,
//     pub LogonTime: i64,
//     pub CurrentTime: i64,
// }

// UNSUPPORTED Rust 1145:1: declaration Impl has no candidate rule
// impl Default for WTSINFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WTSIdle`: `WTS_CONNECTSTATE_CLASS` = 5;
public const val `WTSIdleTime`: `WTS_INFO_CLASS` = 17;
public const val `WTSIncomingBytes`: `WTS_INFO_CLASS` = 19;
public const val `WTSIncomingFrames`: `WTS_INFO_CLASS` = 21;
public const val `WTSInit`: `WTS_CONNECTSTATE_CLASS` = 9;
public const val `WTSInitialProgram`: `WTS_INFO_CLASS` = 0;
public const val `WTSIsRemoteSession`: `WTS_INFO_CLASS` = 29;
// UNSUPPORTED Rust 1157:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WTSLISTENERCONFIGA {
//     pub version: u32,
//     pub fEnableListener: u32,
//     pub MaxConnectionCount: u32,
//     pub fPromptForPassword: u32,
//     pub fInheritColorDepth: u32,
//     pub ColorDepth: u32,
//     pub fInheritBrokenTimeoutSettings: u32,
//     pub BrokenTimeoutSettings: u32,
//     pub fDisablePrinterRedirection: u32,
//     pub fDisableDriveRedirection: u32,
//     pub fDisableComPortRedirection: u32,
//     pub fDisableLPTPortRedirection: u32,
//     pub fDisableClipboardRedirection: u32,
//     pub fDisableAudioRedirection: u32,
//     pub fDisablePNPRedirection: u32,
//     pub fDisableDefaultMainClientPrinter: u32,
//     pub LanAdapter: u32,
//     pub PortNumber: u32,
//     pub fInheritShadowSettings: u32,
//     pub ShadowSettings: u32,
//     pub TimeoutSettingsConnection: u32,
//     pub TimeoutSettingsDisconnection: u32,
//     pub TimeoutSettingsIdle: u32,
//     pub SecurityLayer: u32,
//     pub MinEncryptionLevel: u32,
//     pub UserAuthentication: u32,
//     pub Comment: [i8; 61],
//     pub LogonUserName: [i8; 21],
//     pub LogonDomain: [i8; 18],
//     pub WorkDirectory: [i8; 261],
//     pub InitialProgram: [i8; 261],
// }

// UNSUPPORTED Rust 1192:1: declaration Impl has no candidate rule
// impl Default for WTSLISTENERCONFIGA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1197:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WTSLISTENERCONFIGW {
//     pub version: u32,
//     pub fEnableListener: u32,
//     pub MaxConnectionCount: u32,
//     pub fPromptForPassword: u32,
//     pub fInheritColorDepth: u32,
//     pub ColorDepth: u32,
//     pub fInheritBrokenTimeoutSettings: u32,
//     pub BrokenTimeoutSettings: u32,
//     pub fDisablePrinterRedirection: u32,
//     pub fDisableDriveRedirection: u32,
//     pub fDisableComPortRedirection: u32,
//     pub fDisableLPTPortRedirection: u32,
//     pub fDisableClipboardRedirection: u32,
//     pub fDisableAudioRedirection: u32,
//     pub fDisablePNPRedirection: u32,
//     pub fDisableDefaultMainClientPrinter: u32,
//     pub LanAdapter: u32,
//     pub PortNumber: u32,
//     pub fInheritShadowSettings: u32,
//     pub ShadowSettings: u32,
//     pub TimeoutSettingsConnection: u32,
//     pub TimeoutSettingsDisconnection: u32,
//     pub TimeoutSettingsIdle: u32,
//     pub SecurityLayer: u32,
//     pub MinEncryptionLevel: u32,
//     pub UserAuthentication: u32,
//     pub Comment: [u16; 61],
//     pub LogonUserName: [u16; 21],
//     pub LogonDomain: [u16; 18],
//     pub WorkDirectory: [u16; 261],
//     pub InitialProgram: [u16; 261],
// }

// UNSUPPORTED Rust 1232:1: declaration Impl has no candidate rule
// impl Default for WTSLISTENERCONFIGW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WTSListen`: `WTS_CONNECTSTATE_CLASS` = 6;
public const val `WTSLogonTime`: `WTS_INFO_CLASS` = 18;
public const val `WTSOEMId`: `WTS_INFO_CLASS` = 3;
public const val `WTSOutgoingBytes`: `WTS_INFO_CLASS` = 20;
public const val `WTSOutgoingFrames`: `WTS_INFO_CLASS` = 22;
public const val `WTSReset`: `WTS_CONNECTSTATE_CLASS` = 7;
public typealias `WTSSBX_ADDRESS_FAMILY` = Int;
public const val `WTSSBX_ADDRESS_FAMILY_AF_INET`: `WTSSBX_ADDRESS_FAMILY` = 1;
public const val `WTSSBX_ADDRESS_FAMILY_AF_INET6`: `WTSSBX_ADDRESS_FAMILY` = 2;
public const val `WTSSBX_ADDRESS_FAMILY_AF_IPX`: `WTSSBX_ADDRESS_FAMILY` = 3;
public const val `WTSSBX_ADDRESS_FAMILY_AF_NETBIOS`: `WTSSBX_ADDRESS_FAMILY` = 4;
public const val `WTSSBX_ADDRESS_FAMILY_AF_UNSPEC`: `WTSSBX_ADDRESS_FAMILY` = 0;
// UNSUPPORTED Rust 1249:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WTSSBX_IP_ADDRESS {
//     pub AddressFamily: WTSSBX_ADDRESS_FAMILY,
//     pub Address: [u8; 16],
//     pub PortNumber: u16,
//     pub dwScope: u32,
// }

// UNSUPPORTED Rust 1257:1: declaration Impl has no candidate rule
// impl Default for WTSSBX_IP_ADDRESS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1262:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WTSSBX_MACHINE_CONNECT_INFO {
//     pub wczMachineFQDN: [u16; 257],
//     pub wczMachineNetBiosName: [u16; 17],
//     pub dwNumOfIPAddr: u32,
//     pub IPaddr: [WTSSBX_IP_ADDRESS; 12],
// }

// UNSUPPORTED Rust 1270:1: declaration Impl has no candidate rule
// impl Default for WTSSBX_MACHINE_CONNECT_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WTSSBX_MACHINE_DRAIN` = Int;
public const val `WTSSBX_MACHINE_DRAIN_OFF`: `WTSSBX_MACHINE_DRAIN` = 1;
public const val `WTSSBX_MACHINE_DRAIN_ON`: `WTSSBX_MACHINE_DRAIN` = 2;
public const val `WTSSBX_MACHINE_DRAIN_UNSPEC`: `WTSSBX_MACHINE_DRAIN` = 0;
// UNSUPPORTED Rust 1279:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WTSSBX_MACHINE_INFO {
//     pub ClientConnectInfo: WTSSBX_MACHINE_CONNECT_INFO,
//     pub wczFarmName: [u16; 257],
//     pub InternalIPAddress: WTSSBX_IP_ADDRESS,
//     pub dwMaxSessionsLimit: u32,
//     pub ServerWeight: u32,
//     pub SingleSessionMode: WTSSBX_MACHINE_SESSION_MODE,
//     pub InDrain: WTSSBX_MACHINE_DRAIN,
//     pub MachineState: WTSSBX_MACHINE_STATE,
// }

// UNSUPPORTED Rust 1291:1: declaration Impl has no candidate rule
// impl Default for WTSSBX_MACHINE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WTSSBX_MACHINE_SESSION_MODE` = Int;
public const val `WTSSBX_MACHINE_SESSION_MODE_MULTIPLE`: `WTSSBX_MACHINE_SESSION_MODE` = 2;
public const val `WTSSBX_MACHINE_SESSION_MODE_SINGLE`: `WTSSBX_MACHINE_SESSION_MODE` = 1;
public const val `WTSSBX_MACHINE_SESSION_MODE_UNSPEC`: `WTSSBX_MACHINE_SESSION_MODE` = 0;
public typealias `WTSSBX_MACHINE_STATE` = Int;
public const val `WTSSBX_MACHINE_STATE_READY`: `WTSSBX_MACHINE_STATE` = 1;
public const val `WTSSBX_MACHINE_STATE_SYNCHRONIZING`: `WTSSBX_MACHINE_STATE` = 2;
public const val `WTSSBX_MACHINE_STATE_UNSPEC`: `WTSSBX_MACHINE_STATE` = 0;
public const val `WTSSBX_NOTIFICATION_ADDED`: `WTSSBX_NOTIFICATION_TYPE` = 4;
public const val `WTSSBX_NOTIFICATION_CHANGED`: `WTSSBX_NOTIFICATION_TYPE` = 2;
public const val `WTSSBX_NOTIFICATION_REMOVED`: `WTSSBX_NOTIFICATION_TYPE` = 1;
public const val `WTSSBX_NOTIFICATION_RESYNC`: `WTSSBX_NOTIFICATION_TYPE` = 8;
public typealias `WTSSBX_NOTIFICATION_TYPE` = Int;
// UNSUPPORTED Rust 1309:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WTSSBX_SESSION_INFO {
//     pub wszUserName: [u16; 105],
//     pub wszDomainName: [u16; 257],
//     pub ApplicationType: [u16; 257],
//     pub dwSessionId: u32,
//     pub CreateTime: super::super::Foundation::FILETIME,
//     pub DisconnectTime: super::super::Foundation::FILETIME,
//     pub SessionState: WTSSBX_SESSION_STATE,
// }

// UNSUPPORTED Rust 1320:1: declaration Impl has no candidate rule
// impl Default for WTSSBX_SESSION_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WTSSBX_SESSION_STATE` = Int;
public const val `WTSSBX_SESSION_STATE_ACTIVE`: `WTSSBX_SESSION_STATE` = 1;
public const val `WTSSBX_SESSION_STATE_DISCONNECTED`: `WTSSBX_SESSION_STATE` = 2;
public const val `WTSSBX_SESSION_STATE_UNSPEC`: `WTSSBX_SESSION_STATE` = 0;
// UNSUPPORTED Rust 1329:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WTSSESSION_NOTIFICATION {
//     pub cbSize: u32,
//     pub dwSessionId: u32,
// }

public const val `WTSSessionAddressV4`: `WTS_INFO_CLASS` = 28;
public const val `WTSSessionId`: `WTS_INFO_CLASS` = 4;
public const val `WTSSessionInfo`: `WTS_INFO_CLASS` = 24;
public const val `WTSSessionInfoEx`: `WTS_INFO_CLASS` = 25;
public const val `WTSShadow`: `WTS_CONNECTSTATE_CLASS` = 3;
public const val `WTSTypeProcessInfoLevel0`: `WTS_TYPE_CLASS` = 0;
public const val `WTSTypeProcessInfoLevel1`: `WTS_TYPE_CLASS` = 1;
public const val `WTSTypeSessionInfoLevel1`: `WTS_TYPE_CLASS` = 2;
// UNSUPPORTED Rust 1343:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WTSUSERCONFIGA {
//     pub Source: u32,
//     pub InheritInitialProgram: u32,
//     pub AllowLogonTerminalServer: u32,
//     pub TimeoutSettingsConnections: u32,
//     pub TimeoutSettingsDisconnections: u32,
//     pub TimeoutSettingsIdle: u32,
//     pub DeviceClientDrives: u32,
//     pub DeviceClientPrinters: u32,
//     pub ClientDefaultPrinter: u32,
//     pub BrokenTimeoutSettings: u32,
//     pub ReconnectSettings: u32,
//     pub ShadowingSettings: u32,
//     pub TerminalServerRemoteHomeDir: u32,
//     pub InitialProgram: [i8; 261],
//     pub WorkDirectory: [i8; 261],
//     pub TerminalServerProfilePath: [i8; 261],
//     pub TerminalServerHomeDir: [i8; 261],
//     pub TerminalServerHomeDirDrive: [i8; 4],
// }

// UNSUPPORTED Rust 1365:1: declaration Impl has no candidate rule
// impl Default for WTSUSERCONFIGA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1370:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WTSUSERCONFIGW {
//     pub Source: u32,
//     pub InheritInitialProgram: u32,
//     pub AllowLogonTerminalServer: u32,
//     pub TimeoutSettingsConnections: u32,
//     pub TimeoutSettingsDisconnections: u32,
//     pub TimeoutSettingsIdle: u32,
//     pub DeviceClientDrives: u32,
//     pub DeviceClientPrinters: u32,
//     pub ClientDefaultPrinter: u32,
//     pub BrokenTimeoutSettings: u32,
//     pub ReconnectSettings: u32,
//     pub ShadowingSettings: u32,
//     pub TerminalServerRemoteHomeDir: u32,
//     pub InitialProgram: [u16; 261],
//     pub WorkDirectory: [u16; 261],
//     pub TerminalServerProfilePath: [u16; 261],
//     pub TerminalServerHomeDir: [u16; 261],
//     pub TerminalServerHomeDirDrive: [u16; 4],
// }

// UNSUPPORTED Rust 1392:1: declaration Impl has no candidate rule
// impl Default for WTSUSERCONFIGW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WTSUserConfigBrokenTimeoutSettings`: `WTS_CONFIG_CLASS` = 10;
public const val `WTSUserConfigInitialProgram`: `WTS_CONFIG_CLASS` = 0;
public const val `WTSUserConfigModemCallbackPhoneNumber`: `WTS_CONFIG_CLASS` = 13;
public const val `WTSUserConfigModemCallbackSettings`: `WTS_CONFIG_CLASS` = 12;
public const val `WTSUserConfigReconnectSettings`: `WTS_CONFIG_CLASS` = 11;
public const val `WTSUserConfigShadowingSettings`: `WTS_CONFIG_CLASS` = 14;
public const val `WTSUserConfigSourceSAM`: `WTS_CONFIG_SOURCE` = 0;
public const val `WTSUserConfigTerminalServerHomeDir`: `WTS_CONFIG_CLASS` = 16;
public const val `WTSUserConfigTerminalServerHomeDirDrive`: `WTS_CONFIG_CLASS` = 17;
public const val `WTSUserConfigTerminalServerProfilePath`: `WTS_CONFIG_CLASS` = 15;
public const val `WTSUserConfigTimeoutSettingsConnections`: `WTS_CONFIG_CLASS` = 4;
public const val `WTSUserConfigTimeoutSettingsDisconnections`: `WTS_CONFIG_CLASS` = 5;
public const val `WTSUserConfigTimeoutSettingsIdle`: `WTS_CONFIG_CLASS` = 6;
public const val `WTSUserConfigUser`: `WTS_CONFIG_CLASS` = 19;
public const val `WTSUserConfigWorkingDirectory`: `WTS_CONFIG_CLASS` = 1;
public const val `WTSUserConfigfAllowLogonTerminalServer`: `WTS_CONFIG_CLASS` = 3;
public const val `WTSUserConfigfDeviceClientDefaultPrinter`: `WTS_CONFIG_CLASS` = 9;
public const val `WTSUserConfigfDeviceClientDrives`: `WTS_CONFIG_CLASS` = 7;
public const val `WTSUserConfigfDeviceClientPrinters`: `WTS_CONFIG_CLASS` = 8;
public const val `WTSUserConfigfInheritInitialProgram`: `WTS_CONFIG_CLASS` = 2;
public const val `WTSUserConfigfTerminalServerRemoteHomeDir`: `WTS_CONFIG_CLASS` = 18;
public const val `WTSUserName`: `WTS_INFO_CLASS` = 5;
public const val `WTSValidationInfo`: `WTS_INFO_CLASS` = 27;
public const val `WTSVirtualClientData`: `WTS_VIRTUAL_CLASS` = 0;
public const val `WTSVirtualFileHandle`: `WTS_VIRTUAL_CLASS` = 1;
public const val `WTSWinStationName`: `WTS_INFO_CLASS` = 6;
public const val `WTSWorkingDirectory`: `WTS_INFO_CLASS` = 2;
// UNSUPPORTED Rust 1424:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WTS_CACHE_STATS {
//     pub Specific: u32,
//     pub Data: WTS_CACHE_STATS_UN,
//     pub ProtocolType: u16,
//     pub Length: u16,
// }

// UNSUPPORTED Rust 1432:1: declaration Impl has no candidate rule
// impl Default for WTS_CACHE_STATS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1437:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WTS_CACHE_STATS_UN {
//     pub ProtocolCache: [WTS_PROTOCOL_CACHE; 4],
//     pub TShareCacheStats: u32,
//     pub Reserved: [u32; 20],
// }

// UNSUPPORTED Rust 1444:1: declaration Impl has no candidate rule
// impl Default for WTS_CACHE_STATS_UN {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WTS_CERT_TYPE` = Int;
public const val `WTS_CERT_TYPE_INVALID`: `WTS_CERT_TYPE` = 0;
public const val `WTS_CERT_TYPE_PROPRIETORY`: `WTS_CERT_TYPE` = 1;
public const val `WTS_CERT_TYPE_X509`: `WTS_CERT_TYPE` = 2;
public const val `WTS_CHANNEL_OPTION_DYNAMIC`: UInt = 1u;
public const val `WTS_CHANNEL_OPTION_DYNAMIC_NO_COMPRESS`: UInt = 8u;
public const val `WTS_CHANNEL_OPTION_DYNAMIC_PRI_HIGH`: UInt = 4u;
public const val `WTS_CHANNEL_OPTION_DYNAMIC_PRI_LOW`: UInt = 0u;
public const val `WTS_CHANNEL_OPTION_DYNAMIC_PRI_MED`: UInt = 2u;
public const val `WTS_CHANNEL_OPTION_DYNAMIC_PRI_REAL`: UInt = 6u;
public const val `WTS_CLIENTADDRESS_LENGTH`: UInt = 30u;
public const val `WTS_CLIENTNAME_LENGTH`: UInt = 20u;
// UNSUPPORTED Rust 1461:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WTS_CLIENT_ADDRESS {
//     pub AddressFamily: u32,
//     pub Address: [u8; 20],
// }

// UNSUPPORTED Rust 1467:1: declaration Impl has no candidate rule
// impl Default for WTS_CLIENT_ADDRESS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1472:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WTS_CLIENT_DATA {
//     pub fDisableCtrlAltDel: bool,
//     pub fDoubleClickDetect: bool,
//     pub fEnableWindowsKey: bool,
//     pub fHideTitleBar: bool,
//     pub fInheritAutoLogon: windows_sys::core::BOOL,
//     pub fPromptForPassword: bool,
//     pub fUsingSavedCreds: bool,
//     pub Domain: [u16; 256],
//     pub UserName: [u16; 256],
//     pub Password: [u16; 256],
//     pub fPasswordIsScPin: bool,
//     pub fInheritInitialProgram: windows_sys::core::BOOL,
//     pub WorkDirectory: [u16; 257],
//     pub InitialProgram: [u16; 257],
//     pub fMaximizeShell: bool,
//     pub EncryptionLevel: u8,
//     pub PerformanceFlags: u32,
//     pub ProtocolName: [u16; 9],
//     pub ProtocolType: u16,
//     pub fInheritColorDepth: windows_sys::core::BOOL,
//     pub HRes: u16,
//     pub VRes: u16,
//     pub ColorDepth: u16,
//     pub DisplayDriverName: [u16; 9],
//     pub DisplayDeviceName: [u16; 20],
//     pub fMouse: bool,
//     pub KeyboardLayout: u32,
//     pub KeyboardType: u32,
//     pub KeyboardSubType: u32,
//     pub KeyboardFunctionKey: u32,
//     pub imeFileName: [u16; 33],
//     pub ActiveInputLocale: u32,
//     pub fNoAudioPlayback: bool,
//     pub fRemoteConsoleAudio: bool,
//     pub AudioDriverName: [u16; 9],
//     pub ClientTimeZone: WTS_TIME_ZONE_INFORMATION,
//     pub ClientName: [u16; 21],
//     pub SerialNumber: u32,
//     pub ClientAddressFamily: u32,
//     pub ClientAddress: [u16; 31],
//     pub ClientSockAddress: WTS_SOCKADDR,
//     pub ClientDirectory: [u16; 257],
//     pub ClientBuildNumber: u32,
//     pub ClientProductId: u16,
//     pub OutBufCountHost: u16,
//     pub OutBufCountClient: u16,
//     pub OutBufLength: u16,
//     pub ClientSessionId: u32,
//     pub ClientDigProductId: [u16; 33],
//     pub fDisableCpm: bool,
//     pub fDisableCdm: bool,
//     pub fDisableCcm: bool,
//     pub fDisableLPT: bool,
//     pub fDisableClip: bool,
//     pub fDisablePNP: bool,
// }

// UNSUPPORTED Rust 1531:1: declaration Impl has no candidate rule
// impl Default for WTS_CLIENT_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1536:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WTS_CLIENT_DISPLAY {
//     pub HorizontalResolution: u32,
//     pub VerticalResolution: u32,
//     pub ColorDepth: u32,
// }

public const val `WTS_CLIENT_PRODUCT_ID_LENGTH`: UInt = 32u;
public const val `WTS_COMMENT_LENGTH`: UInt = 60u;
public typealias `WTS_CONFIG_CLASS` = Int;
public typealias `WTS_CONFIG_SOURCE` = Int;
public typealias `WTS_CONNECTSTATE_CLASS` = Int;
// UNSUPPORTED Rust 1548:1: qualified type requires source-backed binding: super::super::Foundation::HANDLE
// pub const WTS_CURRENT_SERVER: super::super::Foundation::HANDLE = 0i32 as _;

// UNSUPPORTED Rust 1549:1: qualified type requires source-backed binding: super::super::Foundation::HANDLE
// pub const WTS_CURRENT_SERVER_HANDLE: super::super::Foundation::HANDLE = 0i32 as _;

// UNSUPPORTED Rust 1550:1: non-scalar type Ptr unsupported
// pub const WTS_CURRENT_SERVER_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("");

public const val `WTS_CURRENT_SESSION`: UInt = 4294967295u;
public const val `WTS_DEVICE_NAME_LENGTH`: UInt = 19u;
public const val `WTS_DIRECTORY_LENGTH`: UInt = 256u;
// UNSUPPORTED Rust 1554:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WTS_DISPLAY_IOCTL {
//     pub pDisplayIOCtlData: [u8; 256],
//     pub cbDisplayIOCtlData: u32,
// }

// UNSUPPORTED Rust 1560:1: declaration Impl has no candidate rule
// impl Default for WTS_DISPLAY_IOCTL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WTS_DOMAIN_LENGTH`: UInt = 255u;
public const val `WTS_DRAIN_IN_DRAIN`: `WTS_RCM_DRAIN_STATE` = 1;
public const val `WTS_DRAIN_NOT_IN_DRAIN`: `WTS_RCM_DRAIN_STATE` = 2;
public const val `WTS_DRAIN_STATE_NONE`: `WTS_RCM_DRAIN_STATE` = 0;
public const val `WTS_DRIVER_NAME_LENGTH`: UInt = 8u;
public const val `WTS_DRIVE_LENGTH`: UInt = 3u;
public const val `WTS_EVENT_ALL`: UInt = 2147483647u;
public const val `WTS_EVENT_CONNECT`: UInt = 8u;
public const val `WTS_EVENT_CREATE`: UInt = 1u;
public const val `WTS_EVENT_DELETE`: UInt = 2u;
public const val `WTS_EVENT_DISCONNECT`: UInt = 16u;
public const val `WTS_EVENT_FLUSH`: UInt = 2147483648u;
public const val `WTS_EVENT_LICENSE`: UInt = 256u;
public const val `WTS_EVENT_LOGOFF`: UInt = 64u;
public const val `WTS_EVENT_LOGON`: UInt = 32u;
public const val `WTS_EVENT_NONE`: UInt = 0u;
public const val `WTS_EVENT_RENAME`: UInt = 4u;
public const val `WTS_EVENT_STATECHANGE`: UInt = 128u;
public const val `WTS_IMEFILENAME_LENGTH`: UInt = 32u;
public typealias `WTS_INFO_CLASS` = Int;
public const val `WTS_INITIALPROGRAM_LENGTH`: UInt = 256u;
public const val `WTS_KEY_EXCHANGE_ALG_DH`: UInt = 2u;
public const val `WTS_KEY_EXCHANGE_ALG_RSA`: UInt = 1u;
// UNSUPPORTED Rust 1588:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WTS_LICENSE_CAPABILITIES {
//     pub KeyExchangeAlg: u32,
//     pub ProtocolVer: u32,
//     pub fAuthenticateServer: windows_sys::core::BOOL,
//     pub CertType: WTS_CERT_TYPE,
//     pub cbClientName: u32,
//     pub rgbClientName: [u8; 42],
// }

// UNSUPPORTED Rust 1598:1: declaration Impl has no candidate rule
// impl Default for WTS_LICENSE_CAPABILITIES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WTS_LICENSE_PREAMBLE_VERSION`: UInt = 3u;
public const val `WTS_LICENSE_PROTOCOL_VERSION`: UInt = 65536u;
public const val `WTS_LISTENER_CREATE`: UInt = 1u;
public const val `WTS_LISTENER_NAME_LENGTH`: UInt = 32u;
public const val `WTS_LISTENER_UPDATE`: UInt = 16u;
public typealias `WTS_LOGON_ERROR_REDIRECTOR_RESPONSE` = Int;
public const val `WTS_LOGON_ERR_HANDLED_DONT_SHOW`: `WTS_LOGON_ERROR_REDIRECTOR_RESPONSE` = 3;
public const val `WTS_LOGON_ERR_HANDLED_DONT_SHOW_START_OVER`: `WTS_LOGON_ERROR_REDIRECTOR_RESPONSE` = 4;
public const val `WTS_LOGON_ERR_HANDLED_SHOW`: `WTS_LOGON_ERROR_REDIRECTOR_RESPONSE` = 2;
public const val `WTS_LOGON_ERR_INVALID`: `WTS_LOGON_ERROR_REDIRECTOR_RESPONSE` = 0;
public const val `WTS_LOGON_ERR_NOT_HANDLED`: `WTS_LOGON_ERROR_REDIRECTOR_RESPONSE` = 1;
public const val `WTS_MAX_CACHE_RESERVED`: UInt = 20u;
public const val `WTS_MAX_COUNTERS`: UInt = 100u;
public const val `WTS_MAX_DISPLAY_IOCTL_DATA`: UInt = 256u;
public const val `WTS_MAX_PROTOCOL_CACHE`: UInt = 4u;
public const val `WTS_MAX_RESERVED`: UInt = 100u;
public const val `WTS_PASSWORD_LENGTH`: UInt = 255u;
public const val `WTS_PERF_DISABLE_CURSORSETTINGS`: UInt = 64u;
public const val `WTS_PERF_DISABLE_CURSOR_SHADOW`: UInt = 32u;
public const val `WTS_PERF_DISABLE_FULLWINDOWDRAG`: UInt = 2u;
public const val `WTS_PERF_DISABLE_MENUANIMATIONS`: UInt = 4u;
public const val `WTS_PERF_DISABLE_NOTHING`: UInt = 0u;
public const val `WTS_PERF_DISABLE_THEMING`: UInt = 8u;
public const val `WTS_PERF_DISABLE_WALLPAPER`: UInt = 1u;
public const val `WTS_PERF_ENABLE_DESKTOP_COMPOSITION`: UInt = 256u;
public const val `WTS_PERF_ENABLE_ENHANCED_GRAPHICS`: UInt = 16u;
public const val `WTS_PERF_ENABLE_FONT_SMOOTHING`: UInt = 128u;
// UNSUPPORTED Rust 1630:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WTS_POLICY_DATA {
//     pub fDisableEncryption: bool,
//     pub fDisableAutoReconnect: bool,
//     pub ColorDepth: u32,
//     pub MinEncryptionLevel: u8,
//     pub fDisableCpm: bool,
//     pub fDisableCdm: bool,
//     pub fDisableCcm: bool,
//     pub fDisableLPT: bool,
//     pub fDisableClip: bool,
//     pub fDisablePNPRedir: bool,
// }

// UNSUPPORTED Rust 1644:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct WTS_PROCESS_INFOA {
//     pub SessionId: u32,
//     pub ProcessId: u32,
//     pub pProcessName: windows_sys::core::PSTR,
//     pub pUserSid: super::super::Security::PSID,
// }

// UNSUPPORTED Rust 1653:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for WTS_PROCESS_INFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1659:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct WTS_PROCESS_INFOW {
//     pub SessionId: u32,
//     pub ProcessId: u32,
//     pub pProcessName: windows_sys::core::PWSTR,
//     pub pUserSid: super::super::Security::PSID,
// }

// UNSUPPORTED Rust 1668:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for WTS_PROCESS_INFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1674:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct WTS_PROCESS_INFO_EXA {
//     pub SessionId: u32,
//     pub ProcessId: u32,
//     pub pProcessName: windows_sys::core::PSTR,
//     pub pUserSid: super::super::Security::PSID,
//     pub NumberOfThreads: u32,
//     pub HandleCount: u32,
//     pub PagefileUsage: u32,
//     pub PeakPagefileUsage: u32,
//     pub WorkingSetSize: u32,
//     pub PeakWorkingSetSize: u32,
//     pub UserTime: i64,
//     pub KernelTime: i64,
// }

// UNSUPPORTED Rust 1691:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for WTS_PROCESS_INFO_EXA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1697:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct WTS_PROCESS_INFO_EXW {
//     pub SessionId: u32,
//     pub ProcessId: u32,
//     pub pProcessName: windows_sys::core::PWSTR,
//     pub pUserSid: super::super::Security::PSID,
//     pub NumberOfThreads: u32,
//     pub HandleCount: u32,
//     pub PagefileUsage: u32,
//     pub PeakPagefileUsage: u32,
//     pub WorkingSetSize: u32,
//     pub PeakWorkingSetSize: u32,
//     pub UserTime: i64,
//     pub KernelTime: i64,
// }

// UNSUPPORTED Rust 1714:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for WTS_PROCESS_INFO_EXW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WTS_PROCESS_INFO_LEVEL_0`: UInt = 0u;
public const val `WTS_PROCESS_INFO_LEVEL_1`: UInt = 1u;
// UNSUPPORTED Rust 1722:1: non-scalar type Ptr unsupported
// pub const WTS_PROPERTY_DEFAULT_CONFIG: windows_sys::core::PCWSTR = windows_sys::core::w!("DefaultConfig");

// UNSUPPORTED Rust 1723:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WTS_PROPERTY_VALUE {
//     pub Type: u16,
//     pub u: WTS_PROPERTY_VALUE_0,
// }

// UNSUPPORTED Rust 1729:1: declaration Impl has no candidate rule
// impl Default for WTS_PROPERTY_VALUE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1734:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WTS_PROPERTY_VALUE_0 {
//     pub ulVal: u32,
//     pub strVal: WTS_PROPERTY_VALUE_0_0,
//     pub bVal: WTS_PROPERTY_VALUE_0_1,
//     pub guidVal: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 1742:1: declaration Impl has no candidate rule
// impl Default for WTS_PROPERTY_VALUE_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1747:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WTS_PROPERTY_VALUE_0_1 {
//     pub size: u32,
//     pub pbVal: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 1753:1: declaration Impl has no candidate rule
// impl Default for WTS_PROPERTY_VALUE_0_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1758:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WTS_PROPERTY_VALUE_0_0 {
//     pub size: u32,
//     pub pstrVal: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 1764:1: declaration Impl has no candidate rule
// impl Default for WTS_PROPERTY_VALUE_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1769:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WTS_PROTOCOL_CACHE {
//     pub CacheReads: u32,
//     pub CacheHits: u32,
// }

// UNSUPPORTED Rust 1775:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WTS_PROTOCOL_COUNTERS {
//     pub WdBytes: u32,
//     pub WdFrames: u32,
//     pub WaitForOutBuf: u32,
//     pub Frames: u32,
//     pub Bytes: u32,
//     pub CompressedBytes: u32,
//     pub CompressFlushes: u32,
//     pub Errors: u32,
//     pub Timeouts: u32,
//     pub AsyncFramingError: u32,
//     pub AsyncOverrunError: u32,
//     pub AsyncOverflowError: u32,
//     pub AsyncParityError: u32,
//     pub TdErrors: u32,
//     pub ProtocolType: u16,
//     pub Length: u16,
//     pub Specific: u16,
//     pub Reserved: [u32; 100],
// }

// UNSUPPORTED Rust 1797:1: declaration Impl has no candidate rule
// impl Default for WTS_PROTOCOL_COUNTERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WTS_PROTOCOL_NAME_LENGTH`: UInt = 8u;
// UNSUPPORTED Rust 1803:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WTS_PROTOCOL_STATUS {
//     pub Output: WTS_PROTOCOL_COUNTERS,
//     pub Input: WTS_PROTOCOL_COUNTERS,
//     pub Cache: WTS_CACHE_STATS,
//     pub AsyncSignal: u32,
//     pub AsyncSignalMask: u32,
//     pub Counters: [i64; 100],
// }

// UNSUPPORTED Rust 1813:1: declaration Impl has no candidate rule
// impl Default for WTS_PROTOCOL_STATUS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WTS_PROTOCOL_TYPE_CONSOLE`: UInt = 0u;
public const val `WTS_PROTOCOL_TYPE_ICA`: UInt = 1u;
public const val `WTS_PROTOCOL_TYPE_RDP`: UInt = 2u;
// UNSUPPORTED Rust 1821:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const WTS_QUERY_ALLOWED_INITIAL_APP: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc77d1b30_5be1_4c6b_a0e1_bd6d2e5c9fcc);

// UNSUPPORTED Rust 1822:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const WTS_QUERY_AUDIOENUM_DLL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9bf4fa97_c883_4c2a_80ab_5a39c9af00db);

// UNSUPPORTED Rust 1823:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const WTS_QUERY_LOGON_SCREEN_SIZE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8b8e0fe7_0804_4a0e_b279_8660b1df0049);

// UNSUPPORTED Rust 1824:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const WTS_QUERY_MF_FORMAT_SUPPORT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x41869ad0_6332_4dc8_95d5_db749e2f1d94);

public typealias `WTS_RCM_DRAIN_STATE` = Int;
public typealias `WTS_RCM_SERVICE_STATE` = Int;
public const val `WTS_SECURITY_ALL_ACCESS`: `WTS_SECURITY_FLAGS` = 983999u;
public const val `WTS_SECURITY_CONNECT`: `WTS_SECURITY_FLAGS` = 256u;
public const val `WTS_SECURITY_CURRENT_GUEST_ACCESS`: `WTS_SECURITY_FLAGS` = 72u;
public const val `WTS_SECURITY_CURRENT_USER_ACCESS`: `WTS_SECURITY_FLAGS` = 590u;
public const val `WTS_SECURITY_DISCONNECT`: `WTS_SECURITY_FLAGS` = 512u;
public typealias `WTS_SECURITY_FLAGS` = UInt;
public const val `WTS_SECURITY_GUEST_ACCESS`: `WTS_SECURITY_FLAGS` = 32u;
public const val `WTS_SECURITY_LOGOFF`: `WTS_SECURITY_FLAGS` = 64u;
public const val `WTS_SECURITY_LOGON`: `WTS_SECURITY_FLAGS` = 32u;
public const val `WTS_SECURITY_MESSAGE`: `WTS_SECURITY_FLAGS` = 128u;
public const val `WTS_SECURITY_QUERY_INFORMATION`: `WTS_SECURITY_FLAGS` = 1u;
public const val `WTS_SECURITY_REMOTE_CONTROL`: `WTS_SECURITY_FLAGS` = 16u;
public const val `WTS_SECURITY_RESET`: `WTS_SECURITY_FLAGS` = 4u;
public const val `WTS_SECURITY_SET_INFORMATION`: `WTS_SECURITY_FLAGS` = 2u;
public const val `WTS_SECURITY_USER_ACCESS`: `WTS_SECURITY_FLAGS` = 329u;
public const val `WTS_SECURITY_VIRTUAL_CHANNELS`: `WTS_SECURITY_FLAGS` = 8u;
// UNSUPPORTED Rust 1843:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WTS_SERVER_INFOA {
//     pub pServerName: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 1848:1: declaration Impl has no candidate rule
// impl Default for WTS_SERVER_INFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1853:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WTS_SERVER_INFOW {
//     pub pServerName: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 1858:1: declaration Impl has no candidate rule
// impl Default for WTS_SERVER_INFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WTS_SERVICE_NONE`: `WTS_RCM_SERVICE_STATE` = 0;
public const val `WTS_SERVICE_START`: `WTS_RCM_SERVICE_STATE` = 1;
// UNSUPPORTED Rust 1865:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WTS_SERVICE_STATE {
//     pub RcmServiceState: WTS_RCM_SERVICE_STATE,
//     pub RcmDrainState: WTS_RCM_DRAIN_STATE,
// }

public const val `WTS_SERVICE_STOP`: `WTS_RCM_SERVICE_STATE` = 2;
public const val `WTS_SESSIONSTATE_LOCK`: UInt = 0u;
public const val `WTS_SESSIONSTATE_UNKNOWN`: UInt = 4294967295u;
public const val `WTS_SESSIONSTATE_UNLOCK`: UInt = 1u;
// UNSUPPORTED Rust 1875:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WTS_SESSION_ADDRESS {
//     pub AddressFamily: u32,
//     pub Address: [u8; 20],
// }

// UNSUPPORTED Rust 1881:1: declaration Impl has no candidate rule
// impl Default for WTS_SESSION_ADDRESS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1886:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WTS_SESSION_ID {
//     pub SessionUniqueGuid: windows_sys::core::GUID,
//     pub SessionId: u32,
// }

// UNSUPPORTED Rust 1892:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WTS_SESSION_INFOA {
//     pub SessionId: u32,
//     pub pWinStationName: windows_sys::core::PSTR,
//     pub State: WTS_CONNECTSTATE_CLASS,
// }

// UNSUPPORTED Rust 1899:1: declaration Impl has no candidate rule
// impl Default for WTS_SESSION_INFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1904:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WTS_SESSION_INFOW {
//     pub SessionId: u32,
//     pub pWinStationName: windows_sys::core::PWSTR,
//     pub State: WTS_CONNECTSTATE_CLASS,
// }

// UNSUPPORTED Rust 1911:1: declaration Impl has no candidate rule
// impl Default for WTS_SESSION_INFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1916:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WTS_SESSION_INFO_1A {
//     pub ExecEnvId: u32,
//     pub State: WTS_CONNECTSTATE_CLASS,
//     pub SessionId: u32,
//     pub pSessionName: windows_sys::core::PSTR,
//     pub pHostName: windows_sys::core::PSTR,
//     pub pUserName: windows_sys::core::PSTR,
//     pub pDomainName: windows_sys::core::PSTR,
//     pub pFarmName: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 1928:1: declaration Impl has no candidate rule
// impl Default for WTS_SESSION_INFO_1A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1933:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WTS_SESSION_INFO_1W {
//     pub ExecEnvId: u32,
//     pub State: WTS_CONNECTSTATE_CLASS,
//     pub SessionId: u32,
//     pub pSessionName: windows_sys::core::PWSTR,
//     pub pHostName: windows_sys::core::PWSTR,
//     pub pUserName: windows_sys::core::PWSTR,
//     pub pDomainName: windows_sys::core::PWSTR,
//     pub pFarmName: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 1945:1: declaration Impl has no candidate rule
// impl Default for WTS_SESSION_INFO_1W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1950:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WTS_SMALL_RECT {
//     pub Left: i16,
//     pub Top: i16,
//     pub Right: i16,
//     pub Bottom: i16,
// }

// UNSUPPORTED Rust 1958:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WTS_SOCKADDR {
//     pub sin_family: u16,
//     pub u: WTS_SOCKADDR_0,
// }

// UNSUPPORTED Rust 1964:1: declaration Impl has no candidate rule
// impl Default for WTS_SOCKADDR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1969:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WTS_SOCKADDR_0 {
//     pub ipv4: WTS_SOCKADDR_0_0,
//     pub ipv6: WTS_SOCKADDR_0_1,
// }

// UNSUPPORTED Rust 1975:1: declaration Impl has no candidate rule
// impl Default for WTS_SOCKADDR_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1980:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WTS_SOCKADDR_0_0 {
//     pub sin_port: u16,
//     pub IN_ADDR: u32,
//     pub sin_zero: [u8; 8],
// }

// UNSUPPORTED Rust 1987:1: declaration Impl has no candidate rule
// impl Default for WTS_SOCKADDR_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1992:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WTS_SOCKADDR_0_1 {
//     pub sin6_port: u16,
//     pub sin6_flowinfo: u32,
//     pub sin6_addr: [u16; 8],
//     pub sin6_scope_id: u32,
// }

// UNSUPPORTED Rust 2000:1: declaration Impl has no candidate rule
// impl Default for WTS_SOCKADDR_0_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2005:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WTS_SYSTEMTIME {
//     pub wYear: u16,
//     pub wMonth: u16,
//     pub wDayOfWeek: u16,
//     pub wDay: u16,
//     pub wHour: u16,
//     pub wMinute: u16,
//     pub wSecond: u16,
//     pub wMilliseconds: u16,
// }

// UNSUPPORTED Rust 2017:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WTS_TIME_ZONE_INFORMATION {
//     pub Bias: i32,
//     pub StandardName: [u16; 32],
//     pub StandardDate: WTS_SYSTEMTIME,
//     pub StandardBias: i32,
//     pub DaylightName: [u16; 32],
//     pub DaylightDate: WTS_SYSTEMTIME,
//     pub DaylightBias: i32,
// }

// UNSUPPORTED Rust 2028:1: declaration Impl has no candidate rule
// impl Default for WTS_TIME_ZONE_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WTS_TYPE_CLASS` = Int;
public const val `WTS_USERNAME_LENGTH`: UInt = 255u;
// UNSUPPORTED Rust 2035:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WTS_USER_CREDENTIAL {
//     pub UserName: [u16; 256],
//     pub Password: [u16; 256],
//     pub Domain: [u16; 256],
// }

// UNSUPPORTED Rust 2042:1: declaration Impl has no candidate rule
// impl Default for WTS_USER_CREDENTIAL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2047:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WTS_USER_DATA {
//     pub WorkDirectory: [u16; 257],
//     pub InitialProgram: [u16; 257],
//     pub UserTimeZone: WTS_TIME_ZONE_INFORMATION,
// }

// UNSUPPORTED Rust 2054:1: declaration Impl has no candidate rule
// impl Default for WTS_USER_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2059:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WTS_VALIDATION_INFORMATIONA {
//     pub ProductInfo: PRODUCT_INFOA,
//     pub License: [u8; 16384],
//     pub LicenseLength: u32,
//     pub HardwareID: [u8; 20],
//     pub HardwareIDLength: u32,
// }

// UNSUPPORTED Rust 2068:1: declaration Impl has no candidate rule
// impl Default for WTS_VALIDATION_INFORMATIONA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2073:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WTS_VALIDATION_INFORMATIONW {
//     pub ProductInfo: PRODUCT_INFOW,
//     pub License: [u8; 16384],
//     pub LicenseLength: u32,
//     pub HardwareID: [u8; 20],
//     pub HardwareIDLength: u32,
// }

// UNSUPPORTED Rust 2082:1: declaration Impl has no candidate rule
// impl Default for WTS_VALIDATION_INFORMATIONW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WTS_VALUE_TYPE_BINARY`: UInt = 3u;
public const val `WTS_VALUE_TYPE_GUID`: UInt = 4u;
public const val `WTS_VALUE_TYPE_STRING`: UInt = 2u;
public const val `WTS_VALUE_TYPE_ULONG`: UInt = 1u;
public typealias `WTS_VIRTUAL_CLASS` = Int;
public const val `WTS_WSD_FASTREBOOT`: UInt = 16u;
public const val `WTS_WSD_LOGOFF`: UInt = 1u;
public const val `WTS_WSD_POWEROFF`: UInt = 8u;
public const val `WTS_WSD_REBOOT`: UInt = 4u;
public const val `WTS_WSD_SHUTDOWN`: UInt = 2u;
// UNSUPPORTED Rust 2097:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Workspace: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4f1dfca6_3aad_48e1_8406_4bc21a501d7c);

// UNSUPPORTED Rust 2098:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct pluginResource {
//     pub alias: [u16; 256],
//     pub name: [u16; 256],
//     pub resourceFileContents: windows_sys::core::PWSTR,
//     pub fileExtension: [u16; 256],
//     pub resourcePluginType: [u16; 256],
//     pub isDiscoverable: u8,
//     pub resourceType: i32,
//     pub pceIconSize: u32,
//     pub iconContents: *mut u8,
//     pub pcePluginBlobSize: u32,
//     pub blobContents: *mut u8,
// }

// UNSUPPORTED Rust 2113:1: declaration Impl has no candidate rule
// impl Default for pluginResource {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2118:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct pluginResource2 {
//     pub resourceV1: pluginResource,
//     pub pceFileAssocListSize: u32,
//     pub fileAssocList: *mut pluginResource2FileAssociation,
//     pub securityDescriptor: windows_sys::core::PWSTR,
//     pub pceFolderListSize: u32,
//     pub folderList: *mut *mut u16,
// }

// UNSUPPORTED Rust 2128:1: declaration Impl has no candidate rule
// impl Default for pluginResource2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2133:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct pluginResource2FileAssociation {
//     pub extName: [u16; 256],
//     pub primaryHandler: u8,
//     pub pceIconSize: u32,
//     pub iconContents: *mut u8,
// }

// UNSUPPORTED Rust 2141:1: declaration Impl has no candidate rule
// impl Default for pluginResource2FileAssociation {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

