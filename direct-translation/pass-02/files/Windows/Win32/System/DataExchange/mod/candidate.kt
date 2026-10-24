// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn AddAtomA(lpstring : windows_sys::core::PCSTR) -> u16);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn AddAtomW(lpstring : windows_sys::core::PCWSTR) -> u16);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn AddClipboardFormatListener(hwnd : super::super::Foundation:: HWND) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn ChangeClipboardChain(hwndremove : super::super::Foundation:: HWND, hwndnewnext : super::super::Foundation:: HWND) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn CloseClipboard() -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn CountClipboardFormats() -> i32);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn DdeAbandonTransaction(idinst : u32, hconv : HCONV, idtransaction : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn DdeAccessData(hdata : HDDEDATA, pcbdatasize : *mut u32) -> *mut u8);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn DdeAddData(hdata : HDDEDATA, psrc : *const u8, cb : u32, cboff : u32) -> HDDEDATA);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn DdeClientTransaction(pdata : *const u8, cbdata : u32, hconv : HCONV, hszitem : HSZ, wfmt : u32, wtype : DDE_CLIENT_TRANSACTION_TYPE, dwtimeout : u32, pdwresult : *mut u32) -> HDDEDATA);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn DdeCmpStringHandles(hsz1 : HSZ, hsz2 : HSZ) -> i32);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("user32.dll" "system" fn DdeConnect(idinst : u32, hszservice : HSZ, hsztopic : HSZ, pcc : *const CONVCONTEXT) -> HCONV);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("user32.dll" "system" fn DdeConnectList(idinst : u32, hszservice : HSZ, hsztopic : HSZ, hconvlist : HCONVLIST, pcc : *const CONVCONTEXT) -> HCONVLIST);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn DdeCreateDataHandle(idinst : u32, psrc : *const u8, cb : u32, cboff : u32, hszitem : HSZ, wfmt : u32, afcmd : u32) -> HDDEDATA);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn DdeCreateStringHandleA(idinst : u32, psz : windows_sys::core::PCSTR, icodepage : i32) -> HSZ);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn DdeCreateStringHandleW(idinst : u32, psz : windows_sys::core::PCWSTR, icodepage : i32) -> HSZ);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn DdeDisconnect(hconv : HCONV) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn DdeDisconnectList(hconvlist : HCONVLIST) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn DdeEnableCallback(idinst : u32, hconv : HCONV, wcmd : DDE_ENABLE_CALLBACK_CMD) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn DdeFreeDataHandle(hdata : HDDEDATA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn DdeFreeStringHandle(idinst : u32, hsz : HSZ) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn DdeGetData(hdata : HDDEDATA, pdst : *mut u8, cbmax : u32, cboff : u32) -> u32);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn DdeGetLastError(idinst : u32) -> u32);

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn DdeImpersonateClient(hconv : HCONV) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn DdeInitializeA(pidinst : *mut u32, pfncallback : PFNCALLBACK, afcmd : DDE_INITIALIZE_COMMAND, ulres : u32) -> u32);

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn DdeInitializeW(pidinst : *mut u32, pfncallback : PFNCALLBACK, afcmd : DDE_INITIALIZE_COMMAND, ulres : u32) -> u32);

// UNSUPPORTED Rust 29:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn DdeKeepStringHandle(idinst : u32, hsz : HSZ) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 30:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn DdeNameService(idinst : u32, hsz1 : HSZ, hsz2 : HSZ, afcmd : DDE_NAME_SERVICE_CMD) -> HDDEDATA);

// UNSUPPORTED Rust 31:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn DdePostAdvise(idinst : u32, hsztopic : HSZ, hszitem : HSZ) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 32:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("user32.dll" "system" fn DdeQueryConvInfo(hconv : HCONV, idtransaction : u32, pconvinfo : *mut CONVINFO) -> u32);

// UNSUPPORTED Rust 34:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn DdeQueryNextServer(hconvlist : HCONVLIST, hconvprev : HCONV) -> HCONV);

// UNSUPPORTED Rust 35:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn DdeQueryStringA(idinst : u32, hsz : HSZ, psz : windows_sys::core::PSTR, cchmax : u32, icodepage : i32) -> u32);

// UNSUPPORTED Rust 36:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn DdeQueryStringW(idinst : u32, hsz : HSZ, psz : windows_sys::core::PWSTR, cchmax : u32, icodepage : i32) -> u32);

// UNSUPPORTED Rust 37:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn DdeReconnect(hconv : HCONV) -> HCONV);

// UNSUPPORTED Rust 38:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("user32.dll" "system" fn DdeSetQualityOfService(hwndclient : super::super::Foundation:: HWND, pqosnew : *const super::super::Security:: SECURITY_QUALITY_OF_SERVICE, pqosprev : *mut super::super::Security:: SECURITY_QUALITY_OF_SERVICE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 40:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn DdeSetUserHandle(hconv : HCONV, id : u32, huser : usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 41:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn DdeUnaccessData(hdata : HDDEDATA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 42:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn DdeUninitialize(idinst : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 43:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn DeleteAtom(natom : u16) -> u16);

// UNSUPPORTED Rust 44:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn EmptyClipboard() -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 45:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn EnumClipboardFormats(format : u32) -> u32);

// UNSUPPORTED Rust 46:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn FindAtomA(lpstring : windows_sys::core::PCSTR) -> u16);

// UNSUPPORTED Rust 47:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn FindAtomW(lpstring : windows_sys::core::PCWSTR) -> u16);

// UNSUPPORTED Rust 48:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn FreeDDElParam(msg : u32, lparam : super::super::Foundation:: LPARAM) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 49:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetAtomNameA(natom : u16, lpbuffer : windows_sys::core::PSTR, nsize : i32) -> u32);

// UNSUPPORTED Rust 50:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetAtomNameW(natom : u16, lpbuffer : windows_sys::core::PWSTR, nsize : i32) -> u32);

// UNSUPPORTED Rust 51:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn GetClipboardData(uformat : u32) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 52:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn GetClipboardFormatNameA(format : u32, lpszformatname : windows_sys::core::PSTR, cchmaxcount : i32) -> i32);

// UNSUPPORTED Rust 53:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn GetClipboardFormatNameW(format : u32, lpszformatname : windows_sys::core::PWSTR, cchmaxcount : i32) -> i32);

// UNSUPPORTED Rust 54:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn GetClipboardOwner() -> super::super::Foundation:: HWND);

// UNSUPPORTED Rust 55:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn GetClipboardSequenceNumber() -> u32);

// UNSUPPORTED Rust 56:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn GetClipboardViewer() -> super::super::Foundation:: HWND);

// UNSUPPORTED Rust 57:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn GetOpenClipboardWindow() -> super::super::Foundation:: HWND);

// UNSUPPORTED Rust 58:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn GetPriorityClipboardFormat(paformatprioritylist : *const u32, cformats : i32) -> i32);

// UNSUPPORTED Rust 59:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn GetUpdatedClipboardFormats(lpuiformats : *mut u32, cformats : u32, pcformatsout : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 60:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GlobalAddAtomA(lpstring : windows_sys::core::PCSTR) -> u16);

// UNSUPPORTED Rust 61:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GlobalAddAtomExA(lpstring : windows_sys::core::PCSTR, flags : u32) -> u16);

// UNSUPPORTED Rust 62:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GlobalAddAtomExW(lpstring : windows_sys::core::PCWSTR, flags : u32) -> u16);

// UNSUPPORTED Rust 63:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GlobalAddAtomW(lpstring : windows_sys::core::PCWSTR) -> u16);

// UNSUPPORTED Rust 64:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GlobalDeleteAtom(natom : u16) -> u16);

// UNSUPPORTED Rust 65:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GlobalFindAtomA(lpstring : windows_sys::core::PCSTR) -> u16);

// UNSUPPORTED Rust 66:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GlobalFindAtomW(lpstring : windows_sys::core::PCWSTR) -> u16);

// UNSUPPORTED Rust 67:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GlobalGetAtomNameA(natom : u16, lpbuffer : windows_sys::core::PSTR, nsize : i32) -> u32);

// UNSUPPORTED Rust 68:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GlobalGetAtomNameW(natom : u16, lpbuffer : windows_sys::core::PWSTR, nsize : i32) -> u32);

// UNSUPPORTED Rust 69:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn ImpersonateDdeClientWindow(hwndclient : super::super::Foundation:: HWND, hwndserver : super::super::Foundation:: HWND) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 70:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn InitAtomTable(nsize : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 71:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn IsClipboardFormatAvailable(format : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 72:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn OpenClipboard(hwndnewowner : super::super::Foundation:: HWND) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 73:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn PackDDElParam(msg : u32, uilo : usize, uihi : usize) -> super::super::Foundation:: LPARAM);

// UNSUPPORTED Rust 74:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn RegisterClipboardFormatA(lpszformat : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 75:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn RegisterClipboardFormatW(lpszformat : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 76:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn RemoveClipboardFormatListener(hwnd : super::super::Foundation:: HWND) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 77:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn ReuseDDElParam(lparam : super::super::Foundation:: LPARAM, msgin : u32, msgout : u32, uilo : usize, uihi : usize) -> super::super::Foundation:: LPARAM);

// UNSUPPORTED Rust 78:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn SetClipboardData(uformat : u32, hmem : super::super::Foundation:: HANDLE) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 79:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn SetClipboardViewer(hwndnewviewer : super::super::Foundation:: HWND) -> super::super::Foundation:: HWND);

// UNSUPPORTED Rust 80:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("gdi32.dll" "system" fn SetWinMetaFileBits(nsize : u32, lpmeta16data : *const u8, hdcref : super::super::Graphics::Gdi:: HDC, lpmfp : *const METAFILEPICT) -> super::super::Graphics::Gdi:: HENHMETAFILE);

// UNSUPPORTED Rust 82:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn UnpackDDElParam(msg : u32, lparam : super::super::Foundation:: LPARAM, puilo : *mut usize, puihi : *mut usize) -> windows_sys::core::BOOL);

public const val `APPCLASS_MASK`: Int = 15;
public const val `APPCLASS_MONITOR`: `DDE_INITIALIZE_COMMAND` = 1u;
public const val `APPCLASS_STANDARD`: `DDE_INITIALIZE_COMMAND` = 0u;
public const val `APPCMD_CLIENTONLY`: `DDE_INITIALIZE_COMMAND` = 16u;
public const val `APPCMD_FILTERINITS`: `DDE_INITIALIZE_COMMAND` = 32u;
public const val `APPCMD_MASK`: Int = 4080;
public const val `CADV_LATEACK`: UInt = 65535u;
public const val `CBF_FAIL_ADVISES`: `DDE_INITIALIZE_COMMAND` = 16384u;
public const val `CBF_FAIL_ALLSVRXACTIONS`: `DDE_INITIALIZE_COMMAND` = 258048u;
public const val `CBF_FAIL_CONNECTIONS`: `DDE_INITIALIZE_COMMAND` = 8192u;
public const val `CBF_FAIL_EXECUTES`: `DDE_INITIALIZE_COMMAND` = 32768u;
public const val `CBF_FAIL_POKES`: `DDE_INITIALIZE_COMMAND` = 65536u;
public const val `CBF_FAIL_REQUESTS`: `DDE_INITIALIZE_COMMAND` = 131072u;
public const val `CBF_FAIL_SELFCONNECTIONS`: `DDE_INITIALIZE_COMMAND` = 4096u;
public const val `CBF_SKIP_ALLNOTIFICATIONS`: `DDE_INITIALIZE_COMMAND` = 3932160u;
public const val `CBF_SKIP_CONNECT_CONFIRMS`: `DDE_INITIALIZE_COMMAND` = 262144u;
public const val `CBF_SKIP_DISCONNECTS`: `DDE_INITIALIZE_COMMAND` = 2097152u;
public const val `CBF_SKIP_REGISTRATIONS`: `DDE_INITIALIZE_COMMAND` = 524288u;
public const val `CBF_SKIP_UNREGISTRATIONS`: `DDE_INITIALIZE_COMMAND` = 1048576u;
// UNSUPPORTED Rust 102:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy, Default)]
// pub struct CONVCONTEXT {
//     pub cb: u32,
//     pub wFlags: u32,
//     pub wCountryID: u32,
//     pub iCodePage: i32,
//     pub dwLangID: u32,
//     pub dwSecurity: u32,
//     pub qos: super::super::Security::SECURITY_QUALITY_OF_SERVICE,
// }

// UNSUPPORTED Rust 114:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct CONVINFO {
//     pub cb: u32,
//     pub hUser: usize,
//     pub hConvPartner: HCONV,
//     pub hszSvcPartner: HSZ,
//     pub hszServiceReq: HSZ,
//     pub hszTopic: HSZ,
//     pub hszItem: HSZ,
//     pub wFmt: u32,
//     pub wType: DDE_CLIENT_TRANSACTION_TYPE,
//     pub wStatus: CONVINFO_STATUS,
//     pub wConvst: CONVINFO_CONVERSATION_STATE,
//     pub wLastError: u32,
//     pub hConvList: HCONVLIST,
//     pub ConvCtxt: CONVCONTEXT,
//     pub hwnd: super::super::Foundation::HWND,
//     pub hwndPartner: super::super::Foundation::HWND,
// }

// UNSUPPORTED Rust 135:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for CONVINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `CONVINFO_CONVERSATION_STATE` = UInt;
public typealias `CONVINFO_STATUS` = UInt;
// UNSUPPORTED Rust 143:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct COPYDATASTRUCT {
//     pub dwData: usize,
//     pub cbData: u32,
//     pub lpData: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 150:1: declaration Impl has no candidate rule
// impl Default for COPYDATASTRUCT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CP_WINANSI`: Int = 1004;
public const val `CP_WINNEUTRAL`: Int = 1200;
public const val `CP_WINUNICODE`: Int = 1200;
// UNSUPPORTED Rust 158:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DDEACK {
//     pub _bitfield: u16,
// }

// UNSUPPORTED Rust 163:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DDEADVISE {
//     pub _bitfield: u16,
//     pub cfFormat: i16,
// }

// UNSUPPORTED Rust 169:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DDEDATA {
//     pub _bitfield: u16,
//     pub cfFormat: i16,
//     pub Value: [u8; 1],
// }

// UNSUPPORTED Rust 176:1: declaration Impl has no candidate rule
// impl Default for DDEDATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 181:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DDELN {
//     pub _bitfield: u16,
//     pub cfFormat: i16,
// }

// UNSUPPORTED Rust 187:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DDEML_MSG_HOOK_DATA {
//     pub uiLo: usize,
//     pub uiHi: usize,
//     pub cbData: u32,
//     pub Data: [u32; 8],
// }

// UNSUPPORTED Rust 195:1: declaration Impl has no candidate rule
// impl Default for DDEML_MSG_HOOK_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 200:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DDEPOKE {
//     pub _bitfield: u16,
//     pub cfFormat: i16,
//     pub Value: [u8; 1],
// }

// UNSUPPORTED Rust 207:1: declaration Impl has no candidate rule
// impl Default for DDEPOKE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 212:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DDEUP {
//     pub _bitfield: u16,
//     pub cfFormat: i16,
//     pub rgb: [u8; 1],
// }

// UNSUPPORTED Rust 219:1: declaration Impl has no candidate rule
// impl Default for DDEUP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DDE_CLIENT_TRANSACTION_TYPE` = UInt;
public typealias `DDE_ENABLE_CALLBACK_CMD` = UInt;
public const val `DDE_FACK`: UInt = 32768u;
public const val `DDE_FACKREQ`: UInt = 32768u;
public const val `DDE_FAPPSTATUS`: UInt = 255u;
public const val `DDE_FBUSY`: UInt = 16384u;
public const val `DDE_FDEFERUPD`: UInt = 16384u;
public const val `DDE_FNOTPROCESSED`: UInt = 0u;
public const val `DDE_FRELEASE`: UInt = 8192u;
public const val `DDE_FREQUESTED`: UInt = 4096u;
public typealias `DDE_INITIALIZE_COMMAND` = UInt;
public typealias `DDE_NAME_SERVICE_CMD` = UInt;
public const val `DMLERR_ADVACKTIMEOUT`: UInt = 16384u;
public const val `DMLERR_BUSY`: UInt = 16385u;
public const val `DMLERR_DATAACKTIMEOUT`: UInt = 16386u;
public const val `DMLERR_DLL_NOT_INITIALIZED`: UInt = 16387u;
public const val `DMLERR_DLL_USAGE`: UInt = 16388u;
public const val `DMLERR_EXECACKTIMEOUT`: UInt = 16389u;
public const val `DMLERR_FIRST`: UInt = 16384u;
public const val `DMLERR_INVALIDPARAMETER`: UInt = 16390u;
public const val `DMLERR_LAST`: UInt = 16401u;
public const val `DMLERR_LOW_MEMORY`: UInt = 16391u;
public const val `DMLERR_MEMORY_ERROR`: UInt = 16392u;
public const val `DMLERR_NOTPROCESSED`: UInt = 16393u;
public const val `DMLERR_NO_CONV_ESTABLISHED`: UInt = 16394u;
public const val `DMLERR_NO_ERROR`: UInt = 0u;
public const val `DMLERR_POKEACKTIMEOUT`: UInt = 16395u;
public const val `DMLERR_POSTMSG_FAILED`: UInt = 16396u;
public const val `DMLERR_REENTRANCY`: UInt = 16397u;
public const val `DMLERR_SERVER_DIED`: UInt = 16398u;
public const val `DMLERR_SYS_ERROR`: UInt = 16399u;
public const val `DMLERR_UNADVACKTIMEOUT`: UInt = 16400u;
public const val `DMLERR_UNFOUND_QUEUE_ID`: UInt = 16401u;
public const val `DNS_FILTEROFF`: `DDE_NAME_SERVICE_CMD` = 8u;
public const val `DNS_FILTERON`: `DDE_NAME_SERVICE_CMD` = 4u;
public const val `DNS_REGISTER`: `DDE_NAME_SERVICE_CMD` = 1u;
public const val `DNS_UNREGISTER`: `DDE_NAME_SERVICE_CMD` = 2u;
public const val `EC_DISABLE`: `DDE_ENABLE_CALLBACK_CMD` = 8u;
public const val `EC_ENABLEALL`: `DDE_ENABLE_CALLBACK_CMD` = 0u;
public const val `EC_ENABLEONE`: `DDE_ENABLE_CALLBACK_CMD` = 128u;
public const val `EC_QUERYWAITING`: `DDE_ENABLE_CALLBACK_CMD` = 2u;
// UNSUPPORTED Rust 265:1: non-scalar type Ptr unsupported
// pub type HCONV = *mut core::ffi::c_void;

// UNSUPPORTED Rust 266:1: non-scalar type Ptr unsupported
// pub type HCONVLIST = *mut core::ffi::c_void;

public const val `HDATA_APPOWNED`: UInt = 1u;
// UNSUPPORTED Rust 268:1: non-scalar type Ptr unsupported
// pub type HDDEDATA = *mut core::ffi::c_void;

// UNSUPPORTED Rust 269:1: non-scalar type Ptr unsupported
// pub type HSZ = *mut core::ffi::c_void;

// UNSUPPORTED Rust 270:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct HSZPAIR {
//     pub hszSvc: HSZ,
//     pub hszTopic: HSZ,
// }

// UNSUPPORTED Rust 276:1: declaration Impl has no candidate rule
// impl Default for HSZPAIR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MAX_MONITORS`: UInt = 4u;
// UNSUPPORTED Rust 282:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// #[derive(Clone, Copy)]
// pub struct METAFILEPICT {
//     pub mm: i32,
//     pub xExt: i32,
//     pub yExt: i32,
//     pub hMF: super::super::Graphics::Gdi::HMETAFILE,
// }

// UNSUPPORTED Rust 291:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for METAFILEPICT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MF_CALLBACKS`: `DDE_INITIALIZE_COMMAND` = 134217728u;
public const val `MF_CONV`: `DDE_INITIALIZE_COMMAND` = 1073741824u;
public const val `MF_ERRORS`: `DDE_INITIALIZE_COMMAND` = 268435456u;
public const val `MF_HSZ_INFO`: `DDE_INITIALIZE_COMMAND` = 16777216u;
public const val `MF_LINKS`: `DDE_INITIALIZE_COMMAND` = 536870912u;
public const val `MF_MASK`: UInt = 4278190080u;
public const val `MF_POSTMSGS`: `DDE_INITIALIZE_COMMAND` = 67108864u;
public const val `MF_SENDMSGS`: `DDE_INITIALIZE_COMMAND` = 33554432u;
public const val `MH_CLEANUP`: UInt = 4u;
public const val `MH_CREATE`: UInt = 1u;
public const val `MH_DELETE`: UInt = 3u;
public const val `MH_KEEP`: UInt = 2u;
// UNSUPPORTED Rust 309:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct MONCBSTRUCT {
//     pub cb: u32,
//     pub dwTime: u32,
//     pub hTask: super::super::Foundation::HANDLE,
//     pub dwRet: u32,
//     pub wType: u32,
//     pub wFmt: u32,
//     pub hConv: HCONV,
//     pub hsz1: HSZ,
//     pub hsz2: HSZ,
//     pub hData: HDDEDATA,
//     pub dwData1: usize,
//     pub dwData2: usize,
//     pub cc: CONVCONTEXT,
//     pub cbData: u32,
//     pub Data: [u32; 8],
// }

// UNSUPPORTED Rust 329:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for MONCBSTRUCT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 335:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MONCONVSTRUCT {
//     pub cb: u32,
//     pub fConnect: windows_sys::core::BOOL,
//     pub dwTime: u32,
//     pub hTask: super::super::Foundation::HANDLE,
//     pub hszSvc: HSZ,
//     pub hszTopic: HSZ,
//     pub hConvClient: HCONV,
//     pub hConvServer: HCONV,
// }

// UNSUPPORTED Rust 347:1: declaration Impl has no candidate rule
// impl Default for MONCONVSTRUCT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 352:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MONERRSTRUCT {
//     pub cb: u32,
//     pub wLastError: u32,
//     pub dwTime: u32,
//     pub hTask: super::super::Foundation::HANDLE,
// }

// UNSUPPORTED Rust 360:1: declaration Impl has no candidate rule
// impl Default for MONERRSTRUCT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 365:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MONHSZSTRUCTA {
//     pub cb: u32,
//     pub fsAction: windows_sys::core::BOOL,
//     pub dwTime: u32,
//     pub hsz: HSZ,
//     pub hTask: super::super::Foundation::HANDLE,
//     pub str: [i8; 1],
// }

// UNSUPPORTED Rust 375:1: declaration Impl has no candidate rule
// impl Default for MONHSZSTRUCTA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 380:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MONHSZSTRUCTW {
//     pub cb: u32,
//     pub fsAction: windows_sys::core::BOOL,
//     pub dwTime: u32,
//     pub hsz: HSZ,
//     pub hTask: super::super::Foundation::HANDLE,
//     pub str: [u16; 1],
// }

// UNSUPPORTED Rust 390:1: declaration Impl has no candidate rule
// impl Default for MONHSZSTRUCTW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 395:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MONLINKSTRUCT {
//     pub cb: u32,
//     pub dwTime: u32,
//     pub hTask: super::super::Foundation::HANDLE,
//     pub fEstablished: windows_sys::core::BOOL,
//     pub fNoData: windows_sys::core::BOOL,
//     pub hszSvc: HSZ,
//     pub hszTopic: HSZ,
//     pub hszItem: HSZ,
//     pub wFmt: u32,
//     pub fServer: windows_sys::core::BOOL,
//     pub hConvServer: HCONV,
//     pub hConvClient: HCONV,
// }

// UNSUPPORTED Rust 411:1: declaration Impl has no candidate rule
// impl Default for MONLINKSTRUCT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 416:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MONMSGSTRUCT {
//     pub cb: u32,
//     pub hwndTo: super::super::Foundation::HWND,
//     pub dwTime: u32,
//     pub hTask: super::super::Foundation::HANDLE,
//     pub wMsg: u32,
//     pub wParam: super::super::Foundation::WPARAM,
//     pub lParam: super::super::Foundation::LPARAM,
//     pub dmhd: DDEML_MSG_HOOK_DATA,
// }

// UNSUPPORTED Rust 428:1: declaration Impl has no candidate rule
// impl Default for MONMSGSTRUCT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MSGF_DDEMGR`: UInt = 32769u;
// UNSUPPORTED Rust 434:1: generic scalar type unsupported
// pub type PFNCALLBACK = Option<unsafe extern "system" fn(wtype: u32, wfmt: u32, hconv: HCONV, hsz1: HSZ, hsz2: HSZ, hdata: HDDEDATA, dwdata1: usize, dwdata2: usize) -> HDDEDATA>;

public const val `QID_SYNC`: UInt = 4294967295u;
public const val `ST_ADVISE`: `CONVINFO_STATUS` = 2u;
public const val `ST_BLOCKED`: `CONVINFO_STATUS` = 8u;
public const val `ST_BLOCKNEXT`: `CONVINFO_STATUS` = 128u;
public const val `ST_CLIENT`: `CONVINFO_STATUS` = 16u;
public const val `ST_CONNECTED`: `CONVINFO_STATUS` = 1u;
public const val `ST_INLIST`: `CONVINFO_STATUS` = 64u;
public const val `ST_ISLOCAL`: `CONVINFO_STATUS` = 4u;
public const val `ST_ISSELF`: `CONVINFO_STATUS` = 256u;
public const val `ST_TERMINATED`: `CONVINFO_STATUS` = 32u;
// UNSUPPORTED Rust 445:1: non-scalar type Ptr unsupported
// pub const SZDDESYS_ITEM_FORMATS: windows_sys::core::PCWSTR = windows_sys::core::w!("Formats");

// UNSUPPORTED Rust 446:1: non-scalar type Ptr unsupported
// pub const SZDDESYS_ITEM_HELP: windows_sys::core::PCWSTR = windows_sys::core::w!("Help");

// UNSUPPORTED Rust 447:1: non-scalar type Ptr unsupported
// pub const SZDDESYS_ITEM_RTNMSG: windows_sys::core::PCWSTR = windows_sys::core::w!("ReturnMessage");

// UNSUPPORTED Rust 448:1: non-scalar type Ptr unsupported
// pub const SZDDESYS_ITEM_STATUS: windows_sys::core::PCWSTR = windows_sys::core::w!("Status");

// UNSUPPORTED Rust 449:1: non-scalar type Ptr unsupported
// pub const SZDDESYS_ITEM_SYSITEMS: windows_sys::core::PCWSTR = windows_sys::core::w!("SysItems");

// UNSUPPORTED Rust 450:1: non-scalar type Ptr unsupported
// pub const SZDDESYS_ITEM_TOPICS: windows_sys::core::PCWSTR = windows_sys::core::w!("Topics");

// UNSUPPORTED Rust 451:1: non-scalar type Ptr unsupported
// pub const SZDDESYS_TOPIC: windows_sys::core::PCWSTR = windows_sys::core::w!("System");

// UNSUPPORTED Rust 452:1: non-scalar type Ptr unsupported
// pub const SZDDE_ITEM_ITEMLIST: windows_sys::core::PCWSTR = windows_sys::core::w!("TopicItemList");

public const val `TIMEOUT_ASYNC`: UInt = 4294967295u;
public const val `WM_DDE_ACK`: UInt = 996u;
public const val `WM_DDE_ADVISE`: UInt = 994u;
public const val `WM_DDE_DATA`: UInt = 997u;
public const val `WM_DDE_EXECUTE`: UInt = 1000u;
public const val `WM_DDE_FIRST`: UInt = 992u;
public const val `WM_DDE_INITIATE`: UInt = 992u;
public const val `WM_DDE_LAST`: UInt = 1000u;
public const val `WM_DDE_POKE`: UInt = 999u;
public const val `WM_DDE_REQUEST`: UInt = 998u;
public const val `WM_DDE_TERMINATE`: UInt = 993u;
public const val `WM_DDE_UNADVISE`: UInt = 995u;
public const val `XCLASS_BOOL`: UInt = 4096u;
public const val `XCLASS_DATA`: UInt = 8192u;
public const val `XCLASS_FLAGS`: UInt = 16384u;
public const val `XCLASS_MASK`: UInt = 64512u;
public const val `XCLASS_NOTIFICATION`: UInt = 32768u;
public const val `XST_ADVACKRCVD`: `CONVINFO_CONVERSATION_STATE` = 13u;
public const val `XST_ADVDATAACKRCVD`: `CONVINFO_CONVERSATION_STATE` = 16u;
public const val `XST_ADVDATASENT`: `CONVINFO_CONVERSATION_STATE` = 15u;
public const val `XST_ADVSENT`: `CONVINFO_CONVERSATION_STATE` = 11u;
public const val `XST_CONNECTED`: `CONVINFO_CONVERSATION_STATE` = 2u;
public const val `XST_DATARCVD`: `CONVINFO_CONVERSATION_STATE` = 6u;
public const val `XST_EXECACKRCVD`: `CONVINFO_CONVERSATION_STATE` = 10u;
public const val `XST_EXECSENT`: `CONVINFO_CONVERSATION_STATE` = 9u;
public const val `XST_INCOMPLETE`: `CONVINFO_CONVERSATION_STATE` = 1u;
public const val `XST_INIT1`: `CONVINFO_CONVERSATION_STATE` = 3u;
public const val `XST_INIT2`: `CONVINFO_CONVERSATION_STATE` = 4u;
public const val `XST_NULL`: `CONVINFO_CONVERSATION_STATE` = 0u;
public const val `XST_POKEACKRCVD`: `CONVINFO_CONVERSATION_STATE` = 8u;
public const val `XST_POKESENT`: `CONVINFO_CONVERSATION_STATE` = 7u;
public const val `XST_REQSENT`: `CONVINFO_CONVERSATION_STATE` = 5u;
public const val `XST_UNADVACKRCVD`: `CONVINFO_CONVERSATION_STATE` = 14u;
public const val `XST_UNADVSENT`: `CONVINFO_CONVERSATION_STATE` = 12u;
public const val `XTYPF_ACKREQ`: UInt = 8u;
public const val `XTYPF_NOBLOCK`: UInt = 2u;
public const val `XTYPF_NODATA`: UInt = 4u;
public const val `XTYP_ADVDATA`: `DDE_CLIENT_TRANSACTION_TYPE` = 16400u;
public const val `XTYP_ADVREQ`: `DDE_CLIENT_TRANSACTION_TYPE` = 8226u;
public const val `XTYP_ADVSTART`: `DDE_CLIENT_TRANSACTION_TYPE` = 4144u;
public const val `XTYP_ADVSTOP`: `DDE_CLIENT_TRANSACTION_TYPE` = 32832u;
public const val `XTYP_CONNECT`: `DDE_CLIENT_TRANSACTION_TYPE` = 4194u;
public const val `XTYP_CONNECT_CONFIRM`: `DDE_CLIENT_TRANSACTION_TYPE` = 32882u;
public const val `XTYP_DISCONNECT`: `DDE_CLIENT_TRANSACTION_TYPE` = 32962u;
public const val `XTYP_EXECUTE`: `DDE_CLIENT_TRANSACTION_TYPE` = 16464u;
public const val `XTYP_MASK`: UInt = 240u;
public const val `XTYP_MONITOR`: `DDE_CLIENT_TRANSACTION_TYPE` = 33010u;
public const val `XTYP_POKE`: `DDE_CLIENT_TRANSACTION_TYPE` = 16528u;
public const val `XTYP_REGISTER`: `DDE_CLIENT_TRANSACTION_TYPE` = 32930u;
public const val `XTYP_REQUEST`: `DDE_CLIENT_TRANSACTION_TYPE` = 8368u;
public const val `XTYP_SHIFT`: UInt = 4u;
public const val `XTYP_UNREGISTER`: `DDE_CLIENT_TRANSACTION_TYPE` = 32978u;
public const val `XTYP_WILDCONNECT`: `DDE_CLIENT_TRANSACTION_TYPE` = 8418u;
public const val `XTYP_XACT_COMPLETE`: `DDE_CLIENT_TRANSACTION_TYPE` = 32896u;
