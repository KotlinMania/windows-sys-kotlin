// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("imgutil.dll" "system" fn ComputeInvCMAP(prgbcolors : *const super::super::Graphics::Gdi:: RGBQUAD, ncolors : u32, pinvtable : *mut u8, cbtable : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("imgutil.dll" "system" fn CreateMIMEMap(ppmap : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("imgutil.dll" "system" fn DecodeImage(pstream : * mut core::ffi::c_void, pmap : * mut core::ffi::c_void, peventsink : * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("imgutil.dll" "system" fn DecodeImageEx(pstream : * mut core::ffi::c_void, pmap : * mut core::ffi::c_void, peventsink : * mut core::ffi::c_void, pszmimetypeparam : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("imgutil.dll" "system" fn DitherTo8(pdestbits : *mut u8, ndestpitch : i32, psrcbits : *mut u8, nsrcpitch : i32, bfidsrc : *const windows_sys::core::GUID, prgbdestcolors : *mut super::super::Graphics::Gdi:: RGBQUAD, prgbsrccolors : *mut super::super::Graphics::Gdi:: RGBQUAD, pbdestinvmap : *mut u8, x : i32, y : i32, cx : i32, cy : i32, ldesttrans : i32, lsrctrans : i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("imgutil.dll" "system" fn GetMaxMIMEIDBytes(pnmaxbytes : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("ieframe.dll" "system" fn IEAssociateThreadWithTab(dwtabthreadid : u32, dwassociatedthreadid : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// windows_link::link!("ieframe.dll" "system" fn IECancelSaveFile(hstate : super::super::Foundation:: HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ieframe.dll" "system" fn IECreateDirectory(lppathname : windows_sys::core::PCWSTR, lpsecurityattributes : *const super::super::Security:: SECURITY_ATTRIBUTES) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("ieframe.dll" "system" fn IECreateFile(lpfilename : windows_sys::core::PCWSTR, dwdesiredaccess : u32, dwsharemode : u32, lpsecurityattributes : *const super::super::Security:: SECURITY_ATTRIBUTES, dwcreationdisposition : u32, dwflagsandattributes : u32, htemplatefile : super::super::Foundation:: HANDLE) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// windows_link::link!("ieframe.dll" "system" fn IEDeleteFile(lpfilename : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// windows_link::link!("ieframe.dll" "system" fn IEDisassociateThreadWithTab(dwtabthreadid : u32, dwassociatedthreadid : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Storage_FileSystem")]
// windows_link::link!("ieframe.dll" "system" fn IEFindFirstFile(lpfilename : windows_sys::core::PCWSTR, lpfindfiledata : *const super::super::Storage::FileSystem:: WIN32_FIND_DATAA) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Storage_FileSystem")]
// windows_link::link!("ieframe.dll" "system" fn IEGetFileAttributesEx(lpfilename : windows_sys::core::PCWSTR, finfolevelid : super::super::Storage::FileSystem:: GET_FILEEX_INFO_LEVELS, lpfileinformation : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// windows_link::link!("ieframe.dll" "system" fn IEGetProtectedModeCookie(lpszurl : windows_sys::core::PCWSTR, lpszcookiename : windows_sys::core::PCWSTR, lpszcookiedata : windows_sys::core::PWSTR, pcchcookiedata : *mut u32, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// windows_link::link!("ieframe.dll" "system" fn IEGetWriteableFolderPath(clsidfolderid : *const windows_sys::core::GUID, lppwstrpath : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("ieframe.dll" "system" fn IEGetWriteableLowHKCU(phkey : *mut super::super::System::Registry:: HKEY) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// windows_link::link!("ieframe.dll" "system" fn IEInPrivateFilteringEnabled() -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// windows_link::link!("ieframe.dll" "system" fn IEIsInPrivateBrowsing() -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 29:1: declaration Macro has no candidate rule
// windows_link::link!("ieframe.dll" "system" fn IEIsProtectedModeProcess(pbresult : *mut windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 30:1: declaration Macro has no candidate rule
// windows_link::link!("ieframe.dll" "system" fn IEIsProtectedModeURL(lpwstrurl : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 31:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Threading")]
// windows_link::link!("ieframe.dll" "system" fn IELaunchURL(lpwstrurl : windows_sys::core::PCWSTR, lpprocinfo : *mut super::super::System::Threading:: PROCESS_INFORMATION, lpinfo : *const core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 33:1: declaration Macro has no candidate rule
// windows_link::link!("ieframe.dll" "system" fn IEMoveFileEx(lpexistingfilename : windows_sys::core::PCWSTR, lpnewfilename : windows_sys::core::PCWSTR, dwflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 34:1: declaration Macro has no candidate rule
// windows_link::link!("ieframe.dll" "system" fn IERefreshElevationPolicy() -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 35:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_Security", feature = "Win32_System_Registry"))]
// windows_link::link!("ieframe.dll" "system" fn IERegCreateKeyEx(lpsubkey : windows_sys::core::PCWSTR, reserved : u32, lpclass : windows_sys::core::PCWSTR, dwoptions : u32, samdesired : u32, lpsecurityattributes : *const super::super::Security:: SECURITY_ATTRIBUTES, phkresult : *mut super::super::System::Registry:: HKEY, lpdwdisposition : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 37:1: declaration Macro has no candidate rule
// windows_link::link!("ieframe.dll" "system" fn IERegSetValueEx(lpsubkey : windows_sys::core::PCWSTR, lpvaluename : windows_sys::core::PCWSTR, reserved : u32, dwtype : u32, lpdata : *const u8, cbdata : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 38:1: declaration Macro has no candidate rule
// windows_link::link!("ieframe.dll" "system" fn IERegisterWritableRegistryKey(guid : windows_sys::core::GUID, lpsubkey : windows_sys::core::PCWSTR, fsubkeyallowed : windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 39:1: declaration Macro has no candidate rule
// windows_link::link!("ieframe.dll" "system" fn IERegisterWritableRegistryValue(guid : windows_sys::core::GUID, lppath : windows_sys::core::PCWSTR, lpvaluename : windows_sys::core::PCWSTR, dwtype : u32, lpdata : *const u8, cbmaxdata : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 40:1: declaration Macro has no candidate rule
// windows_link::link!("ieframe.dll" "system" fn IERemoveDirectory(lppathname : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 41:1: declaration Macro has no candidate rule
// windows_link::link!("ieframe.dll" "system" fn IESaveFile(hstate : super::super::Foundation:: HANDLE, lpwstrsourcefile : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 42:1: declaration Macro has no candidate rule
// windows_link::link!("ieframe.dll" "system" fn IESetProtectedModeCookie(lpszurl : windows_sys::core::PCWSTR, lpszcookiename : windows_sys::core::PCWSTR, lpszcookiedata : windows_sys::core::PCWSTR, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 43:1: declaration Macro has no candidate rule
// windows_link::link!("ieframe.dll" "system" fn IEShowOpenFileDialog(hwnd : super::super::Foundation:: HWND, lpwstrfilename : windows_sys::core::PWSTR, cchmaxfilename : u32, lpwstrinitialdir : windows_sys::core::PCWSTR, lpwstrfilter : windows_sys::core::PCWSTR, lpwstrdefext : windows_sys::core::PCWSTR, dwfilterindex : u32, dwflags : u32, phfile : *mut super::super::Foundation:: HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 44:1: declaration Macro has no candidate rule
// windows_link::link!("ieframe.dll" "system" fn IEShowSaveFileDialog(hwnd : super::super::Foundation:: HWND, lpwstrinitialfilename : windows_sys::core::PCWSTR, lpwstrinitialdir : windows_sys::core::PCWSTR, lpwstrfilter : windows_sys::core::PCWSTR, lpwstrdefext : windows_sys::core::PCWSTR, dwfilterindex : u32, dwflags : u32, lppwstrdestinationfilepath : *mut windows_sys::core::PWSTR, phstate : *mut super::super::Foundation:: HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 45:1: declaration Macro has no candidate rule
// windows_link::link!("ieframe.dll" "system" fn IETrackingProtectionEnabled() -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 46:1: declaration Macro has no candidate rule
// windows_link::link!("ieframe.dll" "system" fn IEUnregisterWritableRegistry(guid : windows_sys::core::GUID) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 47:1: declaration Macro has no candidate rule
// windows_link::link!("imgutil.dll" "system" fn IdentifyMIMEType(pbbytes : *const u8, nbytes : u32, pnformat : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 48:1: declaration Macro has no candidate rule
// windows_link::link!("msrating.dll" "system" fn RatingAccessDeniedDialog(hdlg : super::super::Foundation:: HWND, pszusername : windows_sys::core::PCSTR, pszcontentdescription : windows_sys::core::PCSTR, pratingdetails : *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 49:1: declaration Macro has no candidate rule
// windows_link::link!("msrating.dll" "system" fn RatingAccessDeniedDialog2(hdlg : super::super::Foundation:: HWND, pszusername : windows_sys::core::PCSTR, pratingdetails : *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 50:1: declaration Macro has no candidate rule
// windows_link::link!("msrating.dll" "system" fn RatingAccessDeniedDialog2W(hdlg : super::super::Foundation:: HWND, pszusername : windows_sys::core::PCWSTR, pratingdetails : *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 51:1: declaration Macro has no candidate rule
// windows_link::link!("msrating.dll" "system" fn RatingAccessDeniedDialogW(hdlg : super::super::Foundation:: HWND, pszusername : windows_sys::core::PCWSTR, pszcontentdescription : windows_sys::core::PCWSTR, pratingdetails : *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 52:1: declaration Macro has no candidate rule
// windows_link::link!("msrating.dll" "system" fn RatingAddToApprovedSites(hdlg : super::super::Foundation:: HWND, cbpasswordblob : u32, pbpasswordblob : *mut u8, lpszurl : windows_sys::core::PCWSTR, falwaysnever : windows_sys::core::BOOL, fsitepage : windows_sys::core::BOOL, fapprovedsitesenforced : windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 53:1: declaration Macro has no candidate rule
// windows_link::link!("msrating.dll" "system" fn RatingCheckUserAccess(pszusername : windows_sys::core::PCSTR, pszurl : windows_sys::core::PCSTR, pszratinginfo : windows_sys::core::PCSTR, pdata : *const u8, cbdata : u32, ppratingdetails : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 54:1: declaration Macro has no candidate rule
// windows_link::link!("msrating.dll" "system" fn RatingCheckUserAccessW(pszusername : windows_sys::core::PCWSTR, pszurl : windows_sys::core::PCWSTR, pszratinginfo : windows_sys::core::PCWSTR, pdata : *const u8, cbdata : u32, ppratingdetails : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 55:1: declaration Macro has no candidate rule
// windows_link::link!("msrating.dll" "system" fn RatingClickedOnPRFInternal(hwndowner : super::super::Foundation:: HWND, param1 : super::super::Foundation:: HINSTANCE, lpszfilename : windows_sys::core::PCSTR, nshow : i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 56:1: declaration Macro has no candidate rule
// windows_link::link!("msrating.dll" "system" fn RatingClickedOnRATInternal(hwndowner : super::super::Foundation:: HWND, param1 : super::super::Foundation:: HINSTANCE, lpszfilename : windows_sys::core::PCSTR, nshow : i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 57:1: declaration Macro has no candidate rule
// windows_link::link!("msrating.dll" "system" fn RatingEnable(hwndparent : super::super::Foundation:: HWND, pszusername : windows_sys::core::PCSTR, fenable : windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 58:1: declaration Macro has no candidate rule
// windows_link::link!("msrating.dll" "system" fn RatingEnableW(hwndparent : super::super::Foundation:: HWND, pszusername : windows_sys::core::PCWSTR, fenable : windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 59:1: declaration Macro has no candidate rule
// windows_link::link!("msrating.dll" "system" fn RatingEnabledQuery() -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 60:1: declaration Macro has no candidate rule
// windows_link::link!("msrating.dll" "system" fn RatingFreeDetails(pratingdetails : *const core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 61:1: declaration Macro has no candidate rule
// windows_link::link!("msrating.dll" "system" fn RatingInit() -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 62:1: declaration Macro has no candidate rule
// windows_link::link!("msrating.dll" "system" fn RatingObtainCancel(hratingobtainquery : super::super::Foundation:: HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 63:1: declaration Macro has no candidate rule
// windows_link::link!("msrating.dll" "system" fn RatingObtainQuery(psztargeturl : windows_sys::core::PCSTR, dwuserdata : u32, fcallback : isize, phratingobtainquery : *mut super::super::Foundation:: HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 64:1: declaration Macro has no candidate rule
// windows_link::link!("msrating.dll" "system" fn RatingObtainQueryW(psztargeturl : windows_sys::core::PCWSTR, dwuserdata : u32, fcallback : isize, phratingobtainquery : *mut super::super::Foundation:: HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 65:1: declaration Macro has no candidate rule
// windows_link::link!("msrating.dll" "system" fn RatingSetupUI(hdlg : super::super::Foundation:: HWND, pszusername : windows_sys::core::PCSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 66:1: declaration Macro has no candidate rule
// windows_link::link!("msrating.dll" "system" fn RatingSetupUIW(hdlg : super::super::Foundation:: HWND, pszusername : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 67:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("imgutil.dll" "system" fn SniffStream(pinstream : * mut core::ffi::c_void, pnformat : *mut u32, ppoutstream : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

public const val `ADDRESSBAND`: UInt = 2u;
public const val `ADDURL_ADDTOCACHE`: `ADDURL_FLAG` = 1;
public const val `ADDURL_ADDTOHISTORYANDCACHE`: `ADDURL_FLAG` = 0;
public const val `ADDURL_FIRST`: `ADDURL_FLAG` = 0;
public typealias `ADDURL_FLAG` = Int;
public const val `ADDURL_Max`: `ADDURL_FLAG` = 2147483647;
public const val `ActivityContentCount`: `OpenServiceActivityContentType` = 3;
public const val `ActivityContentDocument`: `OpenServiceActivityContentType` = 0;
public const val `ActivityContentLink`: `OpenServiceActivityContentType` = 2;
public const val `ActivityContentNone`: `OpenServiceActivityContentType` = -1;
public const val `ActivityContentSelection`: `OpenServiceActivityContentType` = 1;
// UNSUPPORTED Rust 80:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const AnchorClick: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x13d5413c_33b9_11d2_95a7_00c04f8ecb02);

// UNSUPPORTED Rust 81:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CATID_MSOfficeAntiVirus: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x56ffcc30_d398_11d0_b2ae_00a0c908fa49);

// UNSUPPORTED Rust 82:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CDeviceRect: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3050f6d4_98b5_11cf_bb82_00aa00bdce0b);

// UNSUPPORTED Rust 83:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CDownloadBehavior: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3050f5be_98b5_11cf_bb82_00aa00bdce0b);

// UNSUPPORTED Rust 84:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CHeaderFooter: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3050f6cd_98b5_11cf_bb82_00aa00bdce0b);

// UNSUPPORTED Rust 85:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CLayoutRect: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3050f664_98b5_11cf_bb82_00aa00bdce0b);

public const val `COLOR_NO_TRANSPARENT`: UInt = 4294967295u;
// UNSUPPORTED Rust 87:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CPersistDataPeer: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3050f487_98b5_11cf_bb82_00aa00bdce0b);

// UNSUPPORTED Rust 88:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CPersistHistory: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3050f4c8_98b5_11cf_bb82_00aa00bdce0b);

// UNSUPPORTED Rust 89:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CPersistShortcut: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3050f4c6_98b5_11cf_bb82_00aa00bdce0b);

// UNSUPPORTED Rust 90:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CPersistSnapshot: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3050f4c9_98b5_11cf_bb82_00aa00bdce0b);

// UNSUPPORTED Rust 91:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CPersistUserData: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3050f48e_98b5_11cf_bb82_00aa00bdce0b);

// UNSUPPORTED Rust 92:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CoDitherToRGB8: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa860ce50_3910_11d0_86fc_00a0c913f750);

// UNSUPPORTED Rust 93:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CoMapMIMEToCLSID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x30c3b080_30fb_11d0_b724_00aa006c1a01);

// UNSUPPORTED Rust 94:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CoSniffStream: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6a01fda0_30df_11d0_b724_00aa006c1a01);

public const val `DISPID_ACTIVEXFILTERINGENABLED`: UInt = 61u;
public const val `DISPID_ADDCHANNEL`: UInt = 5u;
public const val `DISPID_ADDDESKTOPCOMPONENT`: UInt = 6u;
public const val `DISPID_ADDFAVORITE`: UInt = 4u;
public const val `DISPID_ADDSEARCHPROVIDER`: UInt = 14u;
public const val `DISPID_ADDSERVICE`: UInt = 30u;
public const val `DISPID_ADDSITEMODE`: UInt = 49u;
public const val `DISPID_ADDTHUMBNAILBUTTONS`: UInt = 48u;
public const val `DISPID_ADDTOFAVORITESBAR`: UInt = 32u;
public const val `DISPID_ADDTRACKINGPROTECTIONLIST`: UInt = 57u;
public const val `DISPID_ADVANCEERROR`: UInt = 10u;
public const val `DISPID_AMBIENT_OFFLINEIFNOTCONNECTED`: Int = -5501;
public const val `DISPID_AMBIENT_SILENT`: Int = -5502;
public const val `DISPID_AUTOCOMPLETEATTACH`: UInt = 12u;
public const val `DISPID_AUTOCOMPLETESAVEFORM`: UInt = 10u;
public const val `DISPID_AUTOSCAN`: UInt = 11u;
public const val `DISPID_BEFORENAVIGATE`: UInt = 100u;
public const val `DISPID_BEFORENAVIGATE2`: UInt = 250u;
public const val `DISPID_BEFORESCRIPTEXECUTE`: UInt = 290u;
public const val `DISPID_BRANDIMAGEURI`: UInt = 20u;
public const val `DISPID_BUILDNEWTABPAGE`: UInt = 33u;
public const val `DISPID_CANADVANCEERROR`: UInt = 12u;
public const val `DISPID_CANRETREATERROR`: UInt = 13u;
public const val `DISPID_CHANGEDEFAULTBROWSER`: UInt = 68u;
public const val `DISPID_CLEARNOTIFICATION`: UInt = 71u;
public const val `DISPID_CLEARSITEMODEICONOVERLAY`: UInt = 45u;
public const val `DISPID_CLIENTTOHOSTWINDOW`: UInt = 268u;
public const val `DISPID_COMMANDSTATECHANGE`: UInt = 105u;
public const val `DISPID_CONTENTDISCOVERYRESET`: UInt = 36u;
public const val `DISPID_COUNTVIEWTYPES`: UInt = 22u;
public const val `DISPID_CREATESUBSCRIPTION`: UInt = 11u;
public const val `DISPID_CUSTOMIZECLEARTYPE`: UInt = 23u;
public const val `DISPID_CUSTOMIZESETTINGS`: UInt = 17u;
public const val `DISPID_DEFAULTSEARCHPROVIDER`: UInt = 26u;
public const val `DISPID_DELETESUBSCRIPTION`: UInt = 12u;
public const val `DISPID_DEPTH`: UInt = 17u;
public const val `DISPID_DIAGNOSECONNECTION`: UInt = 22u;
public const val `DISPID_DIAGNOSECONNECTIONUILESS`: UInt = 66u;
public const val `DISPID_DOCUMENTCOMPLETE`: UInt = 259u;
public const val `DISPID_DOUBLECLICK`: UInt = 3u;
public const val `DISPID_DOWNLOADBEGIN`: UInt = 106u;
public const val `DISPID_DOWNLOADCOMPLETE`: UInt = 104u;
public const val `DISPID_ENABLENOTIFICATIONQUEUE`: UInt = 72u;
public const val `DISPID_ENABLENOTIFICATIONQUEUELARGE`: UInt = 78u;
public const val `DISPID_ENABLENOTIFICATIONQUEUESQUARE`: UInt = 76u;
public const val `DISPID_ENABLENOTIFICATIONQUEUEWIDE`: UInt = 77u;
public const val `DISPID_ENABLESUGGESTEDSITES`: UInt = 39u;
public const val `DISPID_ENUMOPTIONS`: UInt = 14u;
public const val `DISPID_EXPAND`: UInt = 25u;
public const val `DISPID_EXPORT`: UInt = 7u;
public const val `DISPID_FAVSELECTIONCHANGE`: UInt = 1u;
public const val `DISPID_FILEDOWNLOAD`: UInt = 270u;
public const val `DISPID_FLAGS`: UInt = 19u;
public const val `DISPID_FRAMEBEFORENAVIGATE`: UInt = 200u;
public const val `DISPID_FRAMENAVIGATECOMPLETE`: UInt = 201u;
public const val `DISPID_FRAMENEWWINDOW`: UInt = 204u;
public const val `DISPID_GETALWAYSSHOWLOCKSTATE`: UInt = 23u;
public const val `DISPID_GETCVLISTDATA`: UInt = 93u;
public const val `DISPID_GETCVLISTLOCALDATA`: UInt = 94u;
public const val `DISPID_GETDETAILSSTATE`: UInt = 19u;
public const val `DISPID_GETEMIELISTDATA`: UInt = 95u;
public const val `DISPID_GETEMIELISTLOCALDATA`: UInt = 96u;
public const val `DISPID_GETERRORCHAR`: UInt = 15u;
public const val `DISPID_GETERRORCODE`: UInt = 16u;
public const val `DISPID_GETERRORLINE`: UInt = 14u;
public const val `DISPID_GETERRORMSG`: UInt = 17u;
public const val `DISPID_GETERRORURL`: UInt = 18u;
public const val `DISPID_GETEXPERIMENTALFLAG`: UInt = 85u;
public const val `DISPID_GETEXPERIMENTALVALUE`: UInt = 87u;
public const val `DISPID_GETNEEDHVSIAUTOLAUNCHFLAG`: UInt = 100u;
public const val `DISPID_GETNEEDIEAUTOLAUNCHFLAG`: UInt = 89u;
public const val `DISPID_GETOSSKU`: UInt = 103u;
public const val `DISPID_GETPERERRSTATE`: UInt = 21u;
public const val `DISPID_HASNEEDHVSIAUTOLAUNCHFLAG`: UInt = 102u;
public const val `DISPID_HASNEEDIEAUTOLAUNCHFLAG`: UInt = 88u;
public const val `DISPID_IMPORT`: UInt = 6u;
public const val `DISPID_IMPORTEXPORTFAVORITES`: UInt = 9u;
public const val `DISPID_INITIALIZED`: UInt = 4u;
public const val `DISPID_INPRIVATEFILTERINGENABLED`: UInt = 37u;
public const val `DISPID_INVOKECONTEXTMENU`: UInt = 8u;
public const val `DISPID_ISMETAREFERRERAVAILABLE`: UInt = 83u;
public const val `DISPID_ISSEARCHMIGRATED`: UInt = 25u;
public const val `DISPID_ISSEARCHPROVIDERINSTALLED`: UInt = 24u;
public const val `DISPID_ISSERVICEINSTALLED`: UInt = 31u;
public const val `DISPID_ISSITEMODE`: UInt = 43u;
public const val `DISPID_ISSITEMODEFIRSTRUN`: UInt = 59u;
public const val `DISPID_ISSUBSCRIBED`: UInt = 7u;
public const val `DISPID_LAUNCHIE`: UInt = 91u;
public const val `DISPID_LAUNCHINHVSI`: UInt = 99u;
public const val `DISPID_LAUNCHINTERNETOPTIONS`: UInt = 74u;
public const val `DISPID_LAUNCHNETWORKCLIENTHELP`: UInt = 67u;
public const val `DISPID_MODE`: UInt = 18u;
public const val `DISPID_MOVESELECTIONDOWN`: UInt = 2u;
public const val `DISPID_MOVESELECTIONTO`: UInt = 9u;
public const val `DISPID_MOVESELECTIONUP`: UInt = 1u;
public const val `DISPID_NAVIGATEANDFIND`: UInt = 8u;
public const val `DISPID_NAVIGATECOMPLETE`: UInt = 101u;
public const val `DISPID_NAVIGATECOMPLETE2`: UInt = 252u;
public const val `DISPID_NAVIGATEERROR`: UInt = 271u;
public const val `DISPID_NAVIGATETOSUGGESTEDSITES`: UInt = 40u;
public const val `DISPID_NEWFOLDER`: UInt = 4u;
public const val `DISPID_NEWPROCESS`: UInt = 284u;
public const val `DISPID_NEWWINDOW`: UInt = 107u;
public const val `DISPID_NEWWINDOW2`: UInt = 251u;
public const val `DISPID_NEWWINDOW3`: UInt = 273u;
public const val `DISPID_NSCOLUMNS`: UInt = 21u;
public const val `DISPID_ONADDRESSBAR`: UInt = 261u;
public const val `DISPID_ONFULLSCREEN`: UInt = 258u;
public const val `DISPID_ONMENUBAR`: UInt = 256u;
public const val `DISPID_ONQUIT`: UInt = 253u;
public const val `DISPID_ONSTATUSBAR`: UInt = 257u;
public const val `DISPID_ONTHEATERMODE`: UInt = 260u;
public const val `DISPID_ONTOOLBAR`: UInt = 255u;
public const val `DISPID_ONVISIBLE`: UInt = 254u;
public const val `DISPID_OPENFAVORITESPANE`: UInt = 97u;
public const val `DISPID_OPENFAVORITESSETTINGS`: UInt = 98u;
public const val `DISPID_PHISHINGENABLED`: UInt = 19u;
public const val `DISPID_PINNEDSITESTATE`: UInt = 73u;
public const val `DISPID_PRINTTEMPLATEINSTANTIATION`: UInt = 225u;
public const val `DISPID_PRINTTEMPLATETEARDOWN`: UInt = 226u;
public const val `DISPID_PRIVACYIMPACTEDSTATECHANGE`: UInt = 272u;
public const val `DISPID_PROGRESSCHANGE`: UInt = 108u;
public const val `DISPID_PROPERTYCHANGE`: UInt = 112u;
public const val `DISPID_PROVISIONNETWORKS`: UInt = 62u;
public const val `DISPID_QUIT`: UInt = 103u;
public const val `DISPID_REDIRECTXDOMAINBLOCKED`: UInt = 286u;
public const val `DISPID_REFRESHOFFLINEDESKTOP`: UInt = 3u;
public const val `DISPID_REMOVESCHEDULEDTILENOTIFICATION`: UInt = 80u;
public const val `DISPID_REPORTSAFEURL`: UInt = 63u;
public const val `DISPID_RESETEXPERIMENTALFLAGS`: UInt = 92u;
public const val `DISPID_RESETFIRSTBOOTMODE`: UInt = 1u;
public const val `DISPID_RESETSAFEMODE`: UInt = 2u;
public const val `DISPID_RESETSORT`: UInt = 3u;
public const val `DISPID_RETREATERROR`: UInt = 11u;
public const val `DISPID_ROOT`: UInt = 16u;
public const val `DISPID_RUNONCEHASSHOWN`: UInt = 28u;
public const val `DISPID_RUNONCEREQUIREDSETTINGSCOMPLETE`: UInt = 27u;
public const val `DISPID_RUNONCESHOWN`: UInt = 15u;
public const val `DISPID_SCHEDULEDTILENOTIFICATION`: UInt = 79u;
public const val `DISPID_SEARCHGUIDEURL`: UInt = 29u;
public const val `DISPID_SELECTEDITEM`: UInt = 15u;
public const val `DISPID_SELECTEDITEMS`: UInt = 24u;
public const val `DISPID_SELECTIONCHANGE`: UInt = 2u;
public const val `DISPID_SETACTIVITIESVISIBLE`: UInt = 35u;
public const val `DISPID_SETDETAILSSTATE`: UInt = 20u;
public const val `DISPID_SETEXPERIMENTALFLAG`: UInt = 84u;
public const val `DISPID_SETEXPERIMENTALVALUE`: UInt = 86u;
public const val `DISPID_SETMSDEFAULTS`: UInt = 104u;
public const val `DISPID_SETNEEDHVSIAUTOLAUNCHFLAG`: UInt = 101u;
public const val `DISPID_SETNEEDIEAUTOLAUNCHFLAG`: UInt = 90u;
public const val `DISPID_SETPERERRSTATE`: UInt = 22u;
public const val `DISPID_SETPHISHINGFILTERSTATUS`: UInt = 282u;
public const val `DISPID_SETRECENTLYCLOSEDVISIBLE`: UInt = 34u;
public const val `DISPID_SETROOT`: UInt = 13u;
public const val `DISPID_SETSECURELOCKICON`: UInt = 269u;
public const val `DISPID_SETSITEMODEICONOVERLAY`: UInt = 44u;
public const val `DISPID_SETSITEMODEPROPERTIES`: UInt = 50u;
public const val `DISPID_SETTHUMBNAILBUTTONS`: UInt = 47u;
public const val `DISPID_SETVIEWTYPE`: UInt = 23u;
public const val `DISPID_SHELLUIHELPERLAST`: UInt = 105u;
public const val `DISPID_SHOWBROWSERUI`: UInt = 13u;
public const val `DISPID_SHOWINPRIVATEHELP`: UInt = 42u;
public const val `DISPID_SHOWTABSHELP`: UInt = 41u;
public const val `DISPID_SITEMODEACTIVATE`: UInt = 58u;
public const val `DISPID_SITEMODEADDBUTTONSTYLE`: UInt = 54u;
public const val `DISPID_SITEMODEADDJUMPLISTITEM`: UInt = 52u;
public const val `DISPID_SITEMODECLEARBADGE`: UInt = 65u;
public const val `DISPID_SITEMODECLEARJUMPLIST`: UInt = 53u;
public const val `DISPID_SITEMODECREATEJUMPLIST`: UInt = 51u;
public const val `DISPID_SITEMODEREFRESHBADGE`: UInt = 64u;
public const val `DISPID_SITEMODESHOWBUTTONSTYLE`: UInt = 55u;
public const val `DISPID_SITEMODESHOWJUMPLIST`: UInt = 56u;
public const val `DISPID_SKIPRUNONCE`: UInt = 16u;
public const val `DISPID_SKIPTABSWELCOME`: UInt = 21u;
public const val `DISPID_SQMENABLED`: UInt = 18u;
public const val `DISPID_STARTBADGEUPDATE`: UInt = 81u;
public const val `DISPID_STARTPERIODICUPDATE`: UInt = 70u;
public const val `DISPID_STARTPERIODICUPDATEBATCH`: UInt = 75u;
public const val `DISPID_STATUSTEXTCHANGE`: UInt = 102u;
public const val `DISPID_STOPBADGEUPDATE`: UInt = 82u;
public const val `DISPID_STOPPERIODICUPDATE`: UInt = 69u;
public const val `DISPID_SUBSCRIPTIONSENABLED`: UInt = 10u;
public const val `DISPID_SUGGESTEDSITESENABLED`: UInt = 38u;
public const val `DISPID_SYNCHRONIZE`: UInt = 5u;
public const val `DISPID_THIRDPARTYURLBLOCKED`: UInt = 285u;
public const val `DISPID_TITLECHANGE`: UInt = 113u;
public const val `DISPID_TITLEICONCHANGE`: UInt = 114u;
public const val `DISPID_TRACKINGPROTECTIONENABLED`: UInt = 60u;
public const val `DISPID_TVFLAGS`: UInt = 20u;
public const val `DISPID_UNSELECTALL`: UInt = 26u;
public const val `DISPID_UPDATEPAGESTATUS`: UInt = 227u;
public const val `DISPID_UPDATETHUMBNAILBUTTON`: UInt = 46u;
public const val `DISPID_VIEWUPDATE`: UInt = 281u;
public const val `DISPID_WEBWORKERFINISHED`: UInt = 289u;
public const val `DISPID_WEBWORKERSTARTED`: UInt = 288u;
public const val `DISPID_WINDOWACTIVATE`: UInt = 111u;
public const val `DISPID_WINDOWCLOSING`: UInt = 263u;
public const val `DISPID_WINDOWMOVE`: UInt = 109u;
public const val `DISPID_WINDOWREGISTERED`: UInt = 200u;
public const val `DISPID_WINDOWRESIZE`: UInt = 110u;
public const val `DISPID_WINDOWREVOKED`: UInt = 201u;
public const val `DISPID_WINDOWSETHEIGHT`: UInt = 267u;
public const val `DISPID_WINDOWSETLEFT`: UInt = 264u;
public const val `DISPID_WINDOWSETRESIZABLE`: UInt = 262u;
public const val `DISPID_WINDOWSETTOP`: UInt = 265u;
public const val `DISPID_WINDOWSETWIDTH`: UInt = 266u;
public const val `DISPID_WINDOWSTATECHANGED`: UInt = 283u;
public const val `E_SURFACE_DISCARDED`: Int = -2147434493;
public const val `E_SURFACE_NODC`: Int = -2147434492;
public const val `E_SURFACE_NOSURFACE`: Int = -2147434496;
public const val `E_SURFACE_NOTMYDC`: Int = -2147434491;
public const val `E_SURFACE_NOTMYPOINTER`: Int = -2147434494;
public const val `E_SURFACE_UNKNOWN_FORMAT`: Int = -2147434495;
public const val `ExtensionValidationContextDynamic`: `ExtensionValidationContexts` = 1;
public const val `ExtensionValidationContextNone`: `ExtensionValidationContexts` = 0;
public const val `ExtensionValidationContextParsed`: `ExtensionValidationContexts` = 2;
public typealias `ExtensionValidationContexts` = Int;
public const val `ExtensionValidationResultArrestPageLoad`: `ExtensionValidationResults` = 2;
public const val `ExtensionValidationResultDoNotInstantiate`: `ExtensionValidationResults` = 1;
public const val `ExtensionValidationResultNone`: `ExtensionValidationResults` = 0;
public typealias `ExtensionValidationResults` = Int;
public typealias `FINDFRAME_FLAGS` = Int;
public const val `FINDFRAME_INTERNAL`: `FINDFRAME_FLAGS` = -2147483648;
public const val `FINDFRAME_JUSTTESTEXISTENCE`: `FINDFRAME_FLAGS` = 1;
public const val `FINDFRAME_NONE`: `FINDFRAME_FLAGS` = 0;
public const val `FRAMEOPTIONS_BROWSERBAND`: `FRAMEOPTIONS_FLAGS` = 64;
public const val `FRAMEOPTIONS_DESKTOP`: `FRAMEOPTIONS_FLAGS` = 32;
public typealias `FRAMEOPTIONS_FLAGS` = Int;
public const val `FRAMEOPTIONS_NO3DBORDER`: `FRAMEOPTIONS_FLAGS` = 16;
public const val `FRAMEOPTIONS_NORESIZE`: `FRAMEOPTIONS_FLAGS` = 8;
public const val `FRAMEOPTIONS_SCROLL_AUTO`: `FRAMEOPTIONS_FLAGS` = 4;
public const val `FRAMEOPTIONS_SCROLL_NO`: `FRAMEOPTIONS_FLAGS` = 2;
public const val `FRAMEOPTIONS_SCROLL_YES`: `FRAMEOPTIONS_FLAGS` = 1;
// UNSUPPORTED Rust 328:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const HomePage: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x766bf2ae_d650_11d1_9811_00c04fc31d2e);

// UNSUPPORTED Rust 329:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const HomePageSetting: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x374cede0_873a_4c4f_bc86_bcc8cf5116a3);

public const val `IECMDID_ARG_CLEAR_FORMS_ALL`: UInt = 0u;
public const val `IECMDID_ARG_CLEAR_FORMS_ALL_BUT_PASSWORDS`: UInt = 1u;
public const val `IECMDID_ARG_CLEAR_FORMS_PASSWORDS_ONLY`: UInt = 2u;
public const val `IECMDID_BEFORENAVIGATE_DOEXTERNALBROWSE`: UInt = 3u;
public const val `IECMDID_BEFORENAVIGATE_GETIDLIST`: UInt = 4u;
public const val `IECMDID_BEFORENAVIGATE_GETSHELLBROWSE`: UInt = 2u;
public const val `IECMDID_CLEAR_AUTOCOMPLETE_FOR_FORMS`: UInt = 0u;
public const val `IECMDID_GET_INVOKE_DEFAULT_BROWSER_ON_NEW_WINDOW`: UInt = 6u;
public const val `IECMDID_SETID_AUTOCOMPLETE_FOR_FORMS`: UInt = 1u;
public const val `IECMDID_SET_INVOKE_DEFAULT_BROWSER_ON_NEW_WINDOW`: UInt = 5u;
// UNSUPPORTED Rust 340:1: non-scalar type Ptr unsupported
// pub const IEGetProcessModule_PROC_NAME: windows_sys::core::PCSTR = windows_sys::core::s!("IEGetProcessModule");

// UNSUPPORTED Rust 341:1: non-scalar type Ptr unsupported
// pub const IEGetTabWindowExports_PROC_NAME: windows_sys::core::PCSTR = windows_sys::core::s!("IEGetTabWindowExports");

public typealias `IELAUNCHOPTION_FLAGS` = Int;
public const val `IELAUNCHOPTION_FORCE_COMPAT`: `IELAUNCHOPTION_FLAGS` = 2;
public const val `IELAUNCHOPTION_FORCE_EDGE`: `IELAUNCHOPTION_FLAGS` = 4;
public const val `IELAUNCHOPTION_LOCK_ENGINE`: `IELAUNCHOPTION_FLAGS` = 8;
public const val `IELAUNCHOPTION_SCRIPTDEBUG`: `IELAUNCHOPTION_FLAGS` = 1;
// UNSUPPORTED Rust 347:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IELAUNCHURLINFO {
//     pub cbSize: u32,
//     pub dwCreationFlags: u32,
//     pub dwLaunchOptionFlags: u32,
// }

// UNSUPPORTED Rust 354:1: non-scalar type Ptr unsupported
// pub const IEPROCESS_MODULE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("IERtUtil.dll");

// UNSUPPORTED Rust 355:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const IEWebDriverManager: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x90314af2_5250_47b3_89d8_6295fc23bc22);

public const val `IE_USE_OE_MAIL_HKEY`: Int = -2147483647;
// UNSUPPORTED Rust 357:1: non-scalar type Ptr unsupported
// pub const IE_USE_OE_MAIL_KEY: windows_sys::core::PCWSTR = windows_sys::core::w!("Software\\Microsoft\\Internet Explorer\\Mail");

// UNSUPPORTED Rust 358:1: non-scalar type Ptr unsupported
// pub const IE_USE_OE_MAIL_VALUE: windows_sys::core::PCWSTR = windows_sys::core::w!("Use Outlook Express");

public const val `IE_USE_OE_NEWS_HKEY`: Int = -2147483647;
// UNSUPPORTED Rust 360:1: non-scalar type Ptr unsupported
// pub const IE_USE_OE_NEWS_KEY: windows_sys::core::PCWSTR = windows_sys::core::w!("Software\\Microsoft\\Internet Explorer\\News");

// UNSUPPORTED Rust 361:1: non-scalar type Ptr unsupported
// pub const IE_USE_OE_NEWS_VALUE: windows_sys::core::PCWSTR = windows_sys::core::w!("Use Outlook Express");

public const val `IE_USE_OE_PRESENT_HKEY`: Int = -2147483646;
// UNSUPPORTED Rust 363:1: non-scalar type Ptr unsupported
// pub const IE_USE_OE_PRESENT_KEY: windows_sys::core::PCWSTR = windows_sys::core::w!("Software\\Microsoft\\Windows\\CurrentVersion\\app.paths\\msimn.exe");

public const val `IMGDECODE_EVENT_BEGINBITS`: UInt = 4u;
public const val `IMGDECODE_EVENT_BITSCOMPLETE`: UInt = 8u;
public const val `IMGDECODE_EVENT_PALETTE`: UInt = 2u;
public const val `IMGDECODE_EVENT_PROGRESS`: UInt = 1u;
public const val `IMGDECODE_EVENT_USEDDRAW`: UInt = 16u;
public const val `IMGDECODE_HINT_BOTTOMUP`: UInt = 2u;
public const val `IMGDECODE_HINT_FULLWIDTH`: UInt = 4u;
public const val `IMGDECODE_HINT_TOPDOWN`: UInt = 1u;
public typealias `INTERNETEXPLORERCONFIGURATION` = Int;
public const val `INTERNETEXPLORERCONFIGURATION_HOST`: `INTERNETEXPLORERCONFIGURATION` = 1;
public const val `INTERNETEXPLORERCONFIGURATION_WEB_DRIVER`: `INTERNETEXPLORERCONFIGURATION` = 2;
public const val `INTERNETEXPLORERCONFIGURATION_WEB_DRIVER_EDGE`: `INTERNETEXPLORERCONFIGURATION` = 4;
// UNSUPPORTED Rust 376:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const IntelliForms: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x613ab92e_16bf_11d2_bca5_00c04fd929db);

// UNSUPPORTED Rust 377:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const InternetExplorerManager: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdf4fcc34_067a_4e0a_8352_4a1a5095346e);

public const val `LINKSBAND`: UInt = 4u;
public const val `MAPMIME_CLSID`: UInt = 1u;
public const val `MAPMIME_DEFAULT`: UInt = 0u;
public const val `MAPMIME_DEFAULT_ALWAYS`: UInt = 3u;
public const val `MAPMIME_DISABLE`: UInt = 2u;
public const val `MAX_SEARCH_FORMAT_STRING`: UInt = 255u;
public typealias `MEDIA_ACTIVITY_NOTIFY_TYPE` = Int;
public const val `MediaCasting`: `MEDIA_ACTIVITY_NOTIFY_TYPE` = 2;
public const val `MediaPlayback`: `MEDIA_ACTIVITY_NOTIFY_TYPE` = 0;
public const val `MediaRecording`: `MEDIA_ACTIVITY_NOTIFY_TYPE` = 1;
// UNSUPPORTED Rust 388:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NAVIGATEDATA {
//     pub ulTarget: u32,
//     pub ulURL: u32,
//     pub ulRefURL: u32,
//     pub ulPostData: u32,
//     pub dwFlags: u32,
// }

public typealias `NAVIGATEFRAME_FLAGS` = Int;
public const val `NAVIGATEFRAME_FL_AUTH_FAIL_CACHE_OK`: `NAVIGATEFRAME_FLAGS` = 16;
public const val `NAVIGATEFRAME_FL_NO_DOC_CACHE`: `NAVIGATEFRAME_FLAGS` = 4;
public const val `NAVIGATEFRAME_FL_NO_IMAGE_CACHE`: `NAVIGATEFRAME_FLAGS` = 8;
public const val `NAVIGATEFRAME_FL_POST`: `NAVIGATEFRAME_FLAGS` = 2;
public const val `NAVIGATEFRAME_FL_REALLY_SENDING_FROM_FORM`: `NAVIGATEFRAME_FLAGS` = 64;
public const val `NAVIGATEFRAME_FL_RECORD`: `NAVIGATEFRAME_FLAGS` = 1;
public const val `NAVIGATEFRAME_FL_SENDING_FROM_FORM`: `NAVIGATEFRAME_FLAGS` = 32;
public const val `OS_E_CANCELLED`: `OpenServiceErrors` = -2147471631;
public const val `OS_E_GPDISABLED`: `OpenServiceErrors` = -1072886820;
public const val `OS_E_NOTFOUND`: `OpenServiceErrors` = -2147287038;
public const val `OS_E_NOTSUPPORTED`: `OpenServiceErrors` = -2147467231;
public typealias `OpenServiceActivityContentType` = Int;
// UNSUPPORTED Rust 410:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const OpenServiceActivityManager: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc5efd803_50f8_43cd_9ab8_aafc1394c9e0);

public typealias `OpenServiceErrors` = Int;
// UNSUPPORTED Rust 412:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const OpenServiceManager: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x098870b6_39ea_480b_b8b5_dd0167c4db59);

// UNSUPPORTED Rust 413:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const PeerFactory: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3050f4cf_98b5_11cf_bb82_00aa00bdce0b);

// UNSUPPORTED Rust 414:1: non-scalar type Ptr unsupported
// pub const REGSTRA_VAL_STARTPAGE: windows_sys::core::PCSTR = windows_sys::core::s!("Start Page");

// UNSUPPORTED Rust 415:1: non-scalar type Ptr unsupported
// pub const REGSTR_PATH_CURRENT: windows_sys::core::PCWSTR = windows_sys::core::w!("current");

// UNSUPPORTED Rust 416:1: non-scalar type Ptr unsupported
// pub const REGSTR_PATH_DEFAULT: windows_sys::core::PCWSTR = windows_sys::core::w!("default");

// UNSUPPORTED Rust 417:1: non-scalar type Ptr unsupported
// pub const REGSTR_PATH_INETCPL_RESTRICTIONS: windows_sys::core::PCWSTR = windows_sys::core::w!("Software\\Policies\\Microsoft\\Internet Explorer\\Control Panel");

// UNSUPPORTED Rust 418:1: non-scalar type Ptr unsupported
// pub const REGSTR_PATH_MIME_DATABASE: windows_sys::core::PCWSTR = windows_sys::core::w!("MIME\\Database");

// UNSUPPORTED Rust 419:1: non-scalar type Ptr unsupported
// pub const REGSTR_PATH_REMOTEACCESS: windows_sys::core::PCWSTR = windows_sys::core::w!("RemoteAccess");

// UNSUPPORTED Rust 420:1: non-scalar type Ptr unsupported
// pub const REGSTR_PATH_REMOTEACESS: windows_sys::core::PCWSTR = windows_sys::core::w!("RemoteAccess");

// UNSUPPORTED Rust 421:1: non-scalar type Ptr unsupported
// pub const REGSTR_SHIFTQUICKSUFFIX: windows_sys::core::PCWSTR = windows_sys::core::w!("ShiftQuickCompleteSuffix");

// UNSUPPORTED Rust 422:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_ACCEPT_LANGUAGE: windows_sys::core::PCWSTR = windows_sys::core::w!("AcceptLanguage");

// UNSUPPORTED Rust 423:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_ACCESSMEDIUM: windows_sys::core::PCWSTR = windows_sys::core::w!("AccessMedium");

// UNSUPPORTED Rust 424:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_ACCESSTYPE: windows_sys::core::PCWSTR = windows_sys::core::w!("AccessType");

// UNSUPPORTED Rust 425:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_ALIASTO: windows_sys::core::PCWSTR = windows_sys::core::w!("AliasForCharset");

// UNSUPPORTED Rust 426:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_ANCHORCOLOR: windows_sys::core::PCWSTR = windows_sys::core::w!("Anchor Color");

// UNSUPPORTED Rust 427:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_ANCHORCOLORHOVER: windows_sys::core::PCWSTR = windows_sys::core::w!("Anchor Color Hover");

// UNSUPPORTED Rust 428:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_ANCHORCOLORVISITED: windows_sys::core::PCWSTR = windows_sys::core::w!("Anchor Color Visited");

// UNSUPPORTED Rust 429:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_ANCHORUNDERLINE: windows_sys::core::PCWSTR = windows_sys::core::w!("Anchor Underline");

// UNSUPPORTED Rust 430:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_AUTODETECT: windows_sys::core::PCWSTR = windows_sys::core::w!("AutoDetect");

// UNSUPPORTED Rust 431:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_AUTODIALDLLNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("AutodialDllName");

// UNSUPPORTED Rust 432:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_AUTODIALFCNNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("AutodialFcnName");

// UNSUPPORTED Rust 433:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_AUTODIAL_MONITORCLASSNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("MS_AutodialMonitor");

// UNSUPPORTED Rust 434:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_AUTODIAL_TRYONLYONCE: windows_sys::core::PCWSTR = windows_sys::core::w!("TryAutodialOnce");

// UNSUPPORTED Rust 435:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_AUTONAVIGATE: windows_sys::core::PCWSTR = windows_sys::core::w!("SearchForExtensions");

// UNSUPPORTED Rust 436:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_AUTOSEARCH: windows_sys::core::PCWSTR = windows_sys::core::w!("Do404Search");

// UNSUPPORTED Rust 437:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_BACKBITMAP: windows_sys::core::PCWSTR = windows_sys::core::w!("BackBitmap");

// UNSUPPORTED Rust 438:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_BACKGROUNDCOLOR: windows_sys::core::PCWSTR = windows_sys::core::w!("Background Color");

// UNSUPPORTED Rust 439:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_BODYCHARSET: windows_sys::core::PCWSTR = windows_sys::core::w!("BodyCharset");

// UNSUPPORTED Rust 440:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_BYPASSAUTOCONFIG: windows_sys::core::PCWSTR = windows_sys::core::w!("BypassAutoconfig");

// UNSUPPORTED Rust 441:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_CACHEPREFIX: windows_sys::core::PCWSTR = windows_sys::core::w!("CachePrefix");

// UNSUPPORTED Rust 442:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_CHECKASSOC: windows_sys::core::PCWSTR = windows_sys::core::w!("Check_Associations");

// UNSUPPORTED Rust 443:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_CODEDOWNLOAD: windows_sys::core::PCWSTR = windows_sys::core::w!("Code Download");

// UNSUPPORTED Rust 444:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_CODEDOWNLOAD_DEF: windows_sys::core::PCWSTR = windows_sys::core::w!("yes");

// UNSUPPORTED Rust 445:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_CODEPAGE: windows_sys::core::PCWSTR = windows_sys::core::w!("CodePage");

// UNSUPPORTED Rust 446:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_COVEREXCLUDE: windows_sys::core::PCWSTR = windows_sys::core::w!("CoverExclude");

// UNSUPPORTED Rust 447:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_DAYSTOKEEP: windows_sys::core::PCWSTR = windows_sys::core::w!("DaysToKeep");

// UNSUPPORTED Rust 448:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_DEFAULT_CODEPAGE: windows_sys::core::PCWSTR = windows_sys::core::w!("Default_CodePage");

// UNSUPPORTED Rust 449:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_DEFAULT_SCRIPT: windows_sys::core::PCWSTR = windows_sys::core::w!("Default_Script");

// UNSUPPORTED Rust 450:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_DEF_ENCODING: windows_sys::core::PCWSTR = windows_sys::core::w!("Default_Encoding");

// UNSUPPORTED Rust 451:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_DEF_INETENCODING: windows_sys::core::PCWSTR = windows_sys::core::w!("Default_InternetEncoding");

// UNSUPPORTED Rust 452:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_DESCRIPTION: windows_sys::core::PCWSTR = windows_sys::core::w!("Description");

// UNSUPPORTED Rust 453:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_DIRECTORY: windows_sys::core::PCWSTR = windows_sys::core::w!("Directory");

// UNSUPPORTED Rust 454:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_DISCONNECTIDLETIME: windows_sys::core::PCWSTR = windows_sys::core::w!("DisconnectIdleTime");

// UNSUPPORTED Rust 455:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_ENABLEAUTODIAL: windows_sys::core::PCWSTR = windows_sys::core::w!("EnableAutodial");

// UNSUPPORTED Rust 456:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_ENABLEAUTODIALDISCONNECT: windows_sys::core::PCWSTR = windows_sys::core::w!("EnableAutodisconnect");

// UNSUPPORTED Rust 457:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_ENABLEAUTODISCONNECT: windows_sys::core::PCWSTR = windows_sys::core::w!("EnableAutodisconnect");

// UNSUPPORTED Rust 458:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_ENABLEEXITDISCONNECT: windows_sys::core::PCWSTR = windows_sys::core::w!("EnableExitDisconnect");

// UNSUPPORTED Rust 459:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_ENABLESECURITYCHECK: windows_sys::core::PCWSTR = windows_sys::core::w!("EnableSecurityCheck");

// UNSUPPORTED Rust 460:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_ENABLEUNATTENDED: windows_sys::core::PCWSTR = windows_sys::core::w!("EnableUnattended");

// UNSUPPORTED Rust 461:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_ENCODENAME: windows_sys::core::PCWSTR = windows_sys::core::w!("EncodingName");

// UNSUPPORTED Rust 462:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_FAMILY: windows_sys::core::PCWSTR = windows_sys::core::w!("Family");

// UNSUPPORTED Rust 463:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_FIXEDWIDTHFONT: windows_sys::core::PCWSTR = windows_sys::core::w!("FixedWidthFont");

// UNSUPPORTED Rust 464:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_FIXED_FONT: windows_sys::core::PCWSTR = windows_sys::core::w!("IEFixedFontName");

// UNSUPPORTED Rust 465:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_FONT_SCRIPT: windows_sys::core::PCWSTR = windows_sys::core::w!("Script");

// UNSUPPORTED Rust 466:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_FONT_SCRIPTS: windows_sys::core::PCWSTR = windows_sys::core::w!("Scripts");

// UNSUPPORTED Rust 467:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_FONT_SCRIPT_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("Script");

// UNSUPPORTED Rust 468:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_FONT_SIZE: windows_sys::core::PCWSTR = windows_sys::core::w!("IEFontSize");

public const val `REGSTR_VAL_FONT_SIZE_DEF`: UInt = 2u;
// UNSUPPORTED Rust 470:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_HEADERCHARSET: windows_sys::core::PCWSTR = windows_sys::core::w!("HeaderCharset");

// UNSUPPORTED Rust 471:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_HTTP_ERRORS: windows_sys::core::PCWSTR = windows_sys::core::w!("Friendly http errors");

// UNSUPPORTED Rust 472:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_IE_CUSTOMCOLORS: windows_sys::core::PCWSTR = windows_sys::core::w!("Custom Colors");

// UNSUPPORTED Rust 473:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_INETCPL_ADVANCEDTAB: windows_sys::core::PCWSTR = windows_sys::core::w!("AdvancedTab");

// UNSUPPORTED Rust 474:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_INETCPL_CONNECTIONSTAB: windows_sys::core::PCWSTR = windows_sys::core::w!("ConnectionsTab");

// UNSUPPORTED Rust 475:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_INETCPL_CONTENTTAB: windows_sys::core::PCWSTR = windows_sys::core::w!("ContentTab");

// UNSUPPORTED Rust 476:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_INETCPL_GENERALTAB: windows_sys::core::PCWSTR = windows_sys::core::w!("GeneralTab");

// UNSUPPORTED Rust 477:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_INETCPL_IEAK: windows_sys::core::PCWSTR = windows_sys::core::w!("IEAKContext");

// UNSUPPORTED Rust 478:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_INETCPL_PRIVACYTAB: windows_sys::core::PCWSTR = windows_sys::core::w!("PrivacyTab");

// UNSUPPORTED Rust 479:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_INETCPL_PROGRAMSTAB: windows_sys::core::PCWSTR = windows_sys::core::w!("ProgramsTab");

// UNSUPPORTED Rust 480:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_INETCPL_SECURITYTAB: windows_sys::core::PCWSTR = windows_sys::core::w!("SecurityTab");

// UNSUPPORTED Rust 481:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_INETENCODING: windows_sys::core::PCWSTR = windows_sys::core::w!("InternetEncoding");

// UNSUPPORTED Rust 482:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_INTERNETENTRY: windows_sys::core::PCWSTR = windows_sys::core::w!("InternetProfile");

// UNSUPPORTED Rust 483:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_INTERNETENTRYBKUP: windows_sys::core::PCWSTR = windows_sys::core::w!("BackupInternetProfile");

// UNSUPPORTED Rust 484:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_INTERNETPROFILE: windows_sys::core::PCWSTR = windows_sys::core::w!("InternetProfile");

// UNSUPPORTED Rust 485:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_JAVAJIT: windows_sys::core::PCWSTR = windows_sys::core::w!("EnableJIT");

public const val `REGSTR_VAL_JAVAJIT_DEF`: UInt = 0u;
// UNSUPPORTED Rust 487:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_JAVALOGGING: windows_sys::core::PCWSTR = windows_sys::core::w!("EnableLogging");

public const val `REGSTR_VAL_JAVALOGGING_DEF`: UInt = 0u;
// UNSUPPORTED Rust 489:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_LEVEL: windows_sys::core::PCWSTR = windows_sys::core::w!("Level");

// UNSUPPORTED Rust 490:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_LOADIMAGES: windows_sys::core::PCWSTR = windows_sys::core::w!("Display Inline Images");

// UNSUPPORTED Rust 491:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_LOCALPAGE: windows_sys::core::PCWSTR = windows_sys::core::w!("Local Page");

// UNSUPPORTED Rust 492:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_MOSDISCONNECT: windows_sys::core::PCWSTR = windows_sys::core::w!("DisconnectTimeout");

// UNSUPPORTED Rust 493:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_NEWDIRECTORY: windows_sys::core::PCWSTR = windows_sys::core::w!("NewDirectory");

// UNSUPPORTED Rust 494:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_NONETAUTODIAL: windows_sys::core::PCWSTR = windows_sys::core::w!("NoNetAutodial");

// UNSUPPORTED Rust 495:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_PLAYSOUNDS: windows_sys::core::PCWSTR = windows_sys::core::w!("Play_Background_Sounds");

// UNSUPPORTED Rust 496:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_PLAYVIDEOS: windows_sys::core::PCWSTR = windows_sys::core::w!("Display Inline Videos");

// UNSUPPORTED Rust 497:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_PRIVCONVERTER: windows_sys::core::PCWSTR = windows_sys::core::w!("PrivConverter");

// UNSUPPORTED Rust 498:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_PROPORTIONALFONT: windows_sys::core::PCWSTR = windows_sys::core::w!("ProportionalFont");

// UNSUPPORTED Rust 499:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_PROP_FONT: windows_sys::core::PCWSTR = windows_sys::core::w!("IEPropFontName");

// UNSUPPORTED Rust 500:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_PROXYENABLE: windows_sys::core::PCWSTR = windows_sys::core::w!("ProxyEnable");

// UNSUPPORTED Rust 501:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_PROXYOVERRIDE: windows_sys::core::PCWSTR = windows_sys::core::w!("ProxyOverride");

// UNSUPPORTED Rust 502:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_PROXYSERVER: windows_sys::core::PCWSTR = windows_sys::core::w!("ProxyServer");

// UNSUPPORTED Rust 503:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_REDIALATTEMPTS: windows_sys::core::PCWSTR = windows_sys::core::w!("RedialAttempts");

// UNSUPPORTED Rust 504:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_REDIALINTERVAL: windows_sys::core::PCWSTR = windows_sys::core::w!("RedialWait");

// UNSUPPORTED Rust 505:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_RNAINSTALLED: windows_sys::core::PCWSTR = windows_sys::core::w!("Installed");

// UNSUPPORTED Rust 506:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_SAFETYWARNINGLEVEL: windows_sys::core::PCWSTR = windows_sys::core::w!("Safety Warning Level");

// UNSUPPORTED Rust 507:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_SCHANNELENABLEPROTOCOL: windows_sys::core::PCWSTR = windows_sys::core::w!("Enabled");

public const val `REGSTR_VAL_SCHANNELENABLEPROTOCOL_DEF`: UInt = 1u;
// UNSUPPORTED Rust 509:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_SCRIPT_FIXED_FONT: windows_sys::core::PCWSTR = windows_sys::core::w!("IEFixedFontName");

// UNSUPPORTED Rust 510:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_SCRIPT_PROP_FONT: windows_sys::core::PCWSTR = windows_sys::core::w!("IEPropFontName");

// UNSUPPORTED Rust 511:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_SEARCHPAGE: windows_sys::core::PCWSTR = windows_sys::core::w!("Search Page");

// UNSUPPORTED Rust 512:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_SECURITYACTICEXSCRIPTS: windows_sys::core::PCWSTR = windows_sys::core::w!("Security_RunScripts");

public const val `REGSTR_VAL_SECURITYACTICEXSCRIPTS_DEF`: UInt = 1u;
// UNSUPPORTED Rust 514:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_SECURITYACTIVEX: windows_sys::core::PCWSTR = windows_sys::core::w!("Security_RunActiveXControls");

public const val `REGSTR_VAL_SECURITYACTIVEX_DEF`: UInt = 1u;
// UNSUPPORTED Rust 516:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_SECURITYALLOWCOOKIES: windows_sys::core::PCWSTR = windows_sys::core::w!("AllowCookies");

public const val `REGSTR_VAL_SECURITYALLOWCOOKIES_DEF`: UInt = 1u;
// UNSUPPORTED Rust 518:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_SECURITYDISABLECACHINGOFSSLPAGES: windows_sys::core::PCWSTR = windows_sys::core::w!("DisableCachingOfSSLPages");

public const val `REGSTR_VAL_SECURITYDISABLECACHINGOFSSLPAGES_DEF`: UInt = 0u;
// UNSUPPORTED Rust 520:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_SECURITYJAVA: windows_sys::core::PCWSTR = windows_sys::core::w!("Security_RunJavaApplets");

public const val `REGSTR_VAL_SECURITYJAVA_DEF`: UInt = 1u;
// UNSUPPORTED Rust 522:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_SECURITYWARNONBADCERTSENDING: windows_sys::core::PCWSTR = windows_sys::core::w!("WarnOnBadCertSending");

public const val `REGSTR_VAL_SECURITYWARNONBADCERTSENDING_DEF`: UInt = 1u;
// UNSUPPORTED Rust 524:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_SECURITYWARNONBADCERTVIEWING: windows_sys::core::PCWSTR = windows_sys::core::w!("WarnOnBadCertRecving");

public const val `REGSTR_VAL_SECURITYWARNONBADCERTVIEWING_DEF`: UInt = 1u;
// UNSUPPORTED Rust 526:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_SECURITYWARNONSEND: windows_sys::core::PCWSTR = windows_sys::core::w!("WarnOnPost");

// UNSUPPORTED Rust 527:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_SECURITYWARNONSENDALWAYS: windows_sys::core::PCWSTR = windows_sys::core::w!("WarnAlwaysOnPost");

public const val `REGSTR_VAL_SECURITYWARNONSENDALWAYS_DEF`: UInt = 1u;
public const val `REGSTR_VAL_SECURITYWARNONSEND_DEF`: UInt = 1u;
// UNSUPPORTED Rust 530:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_SECURITYWARNONVIEW: windows_sys::core::PCWSTR = windows_sys::core::w!("WarnOnView");

public const val `REGSTR_VAL_SECURITYWARNONVIEW_DEF`: UInt = 1u;
// UNSUPPORTED Rust 532:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_SECURITYWARNONZONECROSSING: windows_sys::core::PCWSTR = windows_sys::core::w!("WarnOnZoneCrossing");

public const val `REGSTR_VAL_SECURITYWARNONZONECROSSING_DEF`: UInt = 1u;
// UNSUPPORTED Rust 534:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_SHOWADDRESSBAR: windows_sys::core::PCWSTR = windows_sys::core::w!("Show_URLToolBar");

// UNSUPPORTED Rust 535:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_SHOWFOCUS: windows_sys::core::PCWSTR = windows_sys::core::w!("Tabstop - MouseDown");

// UNSUPPORTED Rust 536:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_SHOWFOCUS_DEF: windows_sys::core::PCWSTR = windows_sys::core::w!("no");

// UNSUPPORTED Rust 537:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_SHOWFULLURLS: windows_sys::core::PCWSTR = windows_sys::core::w!("Show_FullURL");

// UNSUPPORTED Rust 538:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_SHOWTOOLBAR: windows_sys::core::PCWSTR = windows_sys::core::w!("Show_ToolBar");

// UNSUPPORTED Rust 539:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_SMOOTHSCROLL: windows_sys::core::PCWSTR = windows_sys::core::w!("SmoothScroll");

public const val `REGSTR_VAL_SMOOTHSCROLL_DEF`: UInt = 1u;
// UNSUPPORTED Rust 541:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_STARTPAGE: windows_sys::core::PCWSTR = windows_sys::core::w!("Start Page");

// UNSUPPORTED Rust 542:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_TEXTCOLOR: windows_sys::core::PCWSTR = windows_sys::core::w!("Text Color");

// UNSUPPORTED Rust 543:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_TRUSTWARNINGLEVEL_HIGH: windows_sys::core::PCWSTR = windows_sys::core::w!("High");

// UNSUPPORTED Rust 544:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_TRUSTWARNINGLEVEL_LOW: windows_sys::core::PCWSTR = windows_sys::core::w!("No Security");

// UNSUPPORTED Rust 545:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_TRUSTWARNINGLEVEL_MED: windows_sys::core::PCWSTR = windows_sys::core::w!("Medium");

// UNSUPPORTED Rust 546:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_USEAUTOAPPEND: windows_sys::core::PCWSTR = windows_sys::core::w!("Append Completion");

// UNSUPPORTED Rust 547:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_USEAUTOCOMPLETE: windows_sys::core::PCWSTR = windows_sys::core::w!("Use AutoComplete");

// UNSUPPORTED Rust 548:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_USEAUTOSUGGEST: windows_sys::core::PCWSTR = windows_sys::core::w!("AutoSuggest");

// UNSUPPORTED Rust 549:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_USEDLGCOLORS: windows_sys::core::PCWSTR = windows_sys::core::w!("Use_DlgBox_Colors");

// UNSUPPORTED Rust 550:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_USEHOVERCOLOR: windows_sys::core::PCWSTR = windows_sys::core::w!("Use Anchor Hover Color");

// UNSUPPORTED Rust 551:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_USEIBAR: windows_sys::core::PCWSTR = windows_sys::core::w!("UseBar");

// UNSUPPORTED Rust 552:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_USEICM: windows_sys::core::PCWSTR = windows_sys::core::w!("UseICM");

public const val `REGSTR_VAL_USEICM_DEF`: UInt = 0u;
// UNSUPPORTED Rust 554:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_USERAGENT: windows_sys::core::PCWSTR = windows_sys::core::w!("User Agent");

// UNSUPPORTED Rust 555:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_USESTYLESHEETS: windows_sys::core::PCWSTR = windows_sys::core::w!("Use Stylesheets");

// UNSUPPORTED Rust 556:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_USESTYLESHEETS_DEF: windows_sys::core::PCWSTR = windows_sys::core::w!("yes");

// UNSUPPORTED Rust 557:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_VISIBLEBANDS: windows_sys::core::PCWSTR = windows_sys::core::w!("VisibleBands");

public const val `REGSTR_VAL_VISIBLEBANDS_DEF`: UInt = 7u;
// UNSUPPORTED Rust 559:1: non-scalar type Ptr unsupported
// pub const REGSTR_VAL_WEBCHARSET: windows_sys::core::PCWSTR = windows_sys::core::w!("WebCharset");

public const val `SCMP_BOTTOM`: `SCROLLABLECONTEXTMENU_PLACEMENT` = 1;
public const val `SCMP_FULL`: `SCROLLABLECONTEXTMENU_PLACEMENT` = 4;
public const val `SCMP_LEFT`: `SCROLLABLECONTEXTMENU_PLACEMENT` = 2;
public const val `SCMP_RIGHT`: `SCROLLABLECONTEXTMENU_PLACEMENT` = 3;
public const val `SCMP_TOP`: `SCROLLABLECONTEXTMENU_PLACEMENT` = 0;
public typealias `SCROLLABLECONTEXTMENU_PLACEMENT` = Int;
// UNSUPPORTED Rust 566:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct STATURL {
//     pub cbSize: u32,
//     pub pwcsUrl: windows_sys::core::PWSTR,
//     pub pwcsTitle: windows_sys::core::PWSTR,
//     pub ftLastVisited: super::super::Foundation::FILETIME,
//     pub ftLastUpdated: super::super::Foundation::FILETIME,
//     pub ftExpires: super::super::Foundation::FILETIME,
//     pub dwFlags: u32,
// }

// UNSUPPORTED Rust 577:1: declaration Impl has no candidate rule
// impl Default for STATURL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `STATURLFLAG_ISCACHED`: UInt = 1u;
public const val `STATURLFLAG_ISTOPLEVEL`: UInt = 2u;
public const val `STATURL_QUERYFLAG_ISCACHED`: UInt = 65536u;
public const val `STATURL_QUERYFLAG_NOTITLE`: UInt = 262144u;
public const val `STATURL_QUERYFLAG_NOURL`: UInt = 131072u;
public const val `STATURL_QUERYFLAG_TOPLEVEL`: UInt = 524288u;
public const val `SURFACE_LOCK_ALLOW_DISCARD`: UInt = 2u;
public const val `SURFACE_LOCK_EXCLUSIVE`: UInt = 1u;
public const val `SURFACE_LOCK_WAIT`: UInt = 4u;
// UNSUPPORTED Rust 591:1: non-scalar type Ptr unsupported
// pub const SZBACKBITMAP: windows_sys::core::PCSTR = windows_sys::core::s!("BackBitmap");

// UNSUPPORTED Rust 592:1: non-scalar type Ptr unsupported
// pub const SZJAVAVMPATH: windows_sys::core::PCSTR = windows_sys::core::s!("\\Java VM");

// UNSUPPORTED Rust 593:1: non-scalar type Ptr unsupported
// pub const SZNOTEXT: windows_sys::core::PCSTR = windows_sys::core::s!("NoText");

// UNSUPPORTED Rust 594:1: non-scalar type Ptr unsupported
// pub const SZTOOLBAR: windows_sys::core::PCSTR = windows_sys::core::s!("\\Toolbar");

// UNSUPPORTED Rust 595:1: non-scalar type Ptr unsupported
// pub const SZTRUSTWARNLEVEL: windows_sys::core::PCSTR = windows_sys::core::s!("Trust Warning Level");

// UNSUPPORTED Rust 596:1: non-scalar type Ptr unsupported
// pub const SZVISIBLE: windows_sys::core::PCSTR = windows_sys::core::s!("VisibleBands");

// UNSUPPORTED Rust 597:1: non-scalar type Ptr unsupported
// pub const SZ_IE_DEFAULT_HTML_EDITOR: windows_sys::core::PCSTR = windows_sys::core::s!("Default HTML Editor");

// UNSUPPORTED Rust 598:1: non-scalar type Ptr unsupported
// pub const SZ_IE_IBAR: windows_sys::core::PCSTR = windows_sys::core::s!("Bar");

// UNSUPPORTED Rust 599:1: non-scalar type Ptr unsupported
// pub const SZ_IE_IBAR_BANDS: windows_sys::core::PCSTR = windows_sys::core::s!("Bands");

// UNSUPPORTED Rust 600:1: non-scalar type Ptr unsupported
// pub const SZ_IE_MAIN: windows_sys::core::PCSTR = windows_sys::core::s!("Main");

// UNSUPPORTED Rust 601:1: non-scalar type Ptr unsupported
// pub const SZ_IE_SEARCHSTRINGS: windows_sys::core::PCSTR = windows_sys::core::s!("UrlTemplate");

// UNSUPPORTED Rust 602:1: non-scalar type Ptr unsupported
// pub const SZ_IE_SECURITY: windows_sys::core::PCSTR = windows_sys::core::s!("Security");

// UNSUPPORTED Rust 603:1: non-scalar type Ptr unsupported
// pub const SZ_IE_SETTINGS: windows_sys::core::PCSTR = windows_sys::core::s!("Settings");

// UNSUPPORTED Rust 604:1: non-scalar type Ptr unsupported
// pub const SZ_IE_THRESHOLDS: windows_sys::core::PCSTR = windows_sys::core::s!("ErrorThresholds");

public const val `S_SURFACE_DISCARDED`: Int = 49155;
// UNSUPPORTED Rust 606:1: non-scalar type Ptr unsupported
// pub const TARGET_NOTIFY_OBJECT_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("863a99a0-21bc-11d0-82b4-00a0c90c29c5");

public const val `TF_NAVIGATE`: UInt = 2142153644u;
public const val `TIMERMODE_NORMAL`: UInt = 0u;
public const val `TIMERMODE_VISIBILITYAWARE`: UInt = 1u;
public const val `TOOLSBAND`: UInt = 1u;
// UNSUPPORTED Rust 611:1: non-scalar type Ptr unsupported
// pub const TSZCALENDARPROTOCOL: windows_sys::core::PCWSTR = windows_sys::core::w!("unk");

// UNSUPPORTED Rust 612:1: non-scalar type Ptr unsupported
// pub const TSZCALLTOPROTOCOL: windows_sys::core::PCWSTR = windows_sys::core::w!("callto");

// UNSUPPORTED Rust 613:1: non-scalar type Ptr unsupported
// pub const TSZINTERNETCLIENTSPATH: windows_sys::core::PCWSTR = windows_sys::core::w!("Software\\Microsoft\\Internet Explorer\\Unix");

// UNSUPPORTED Rust 614:1: non-scalar type Ptr unsupported
// pub const TSZLDAPPROTOCOL: windows_sys::core::PCWSTR = windows_sys::core::w!("ldap");

// UNSUPPORTED Rust 615:1: non-scalar type Ptr unsupported
// pub const TSZMAILTOPROTOCOL: windows_sys::core::PCWSTR = windows_sys::core::w!("mailto");

// UNSUPPORTED Rust 616:1: non-scalar type Ptr unsupported
// pub const TSZMICROSOFTPATH: windows_sys::core::PCWSTR = windows_sys::core::w!("Software\\Microsoft");

// UNSUPPORTED Rust 617:1: non-scalar type Ptr unsupported
// pub const TSZNEWSPROTOCOL: windows_sys::core::PCWSTR = windows_sys::core::w!("news");

// UNSUPPORTED Rust 618:1: non-scalar type Ptr unsupported
// pub const TSZPROTOCOLSPATH: windows_sys::core::PCWSTR = windows_sys::core::w!("Protocols\\");

// UNSUPPORTED Rust 619:1: non-scalar type Ptr unsupported
// pub const TSZSCHANNELPATH: windows_sys::core::PCWSTR = windows_sys::core::w!("SYSTEM\\CurrentControlSet\\Control\\SecurityProviders\\SCHANNEL");

// UNSUPPORTED Rust 620:1: non-scalar type Ptr unsupported
// pub const TSZVSOURCEPROTOCOL: windows_sys::core::PCWSTR = windows_sys::core::w!("view source");

public const val `msodsvFailed`: UInt = 3u;
public const val `msodsvLowSecurityLevel`: UInt = 4u;
public const val `msodsvNoMacros`: UInt = 0u;
public const val `msodsvPassedTrusted`: UInt = 2u;
public const val `msodsvPassedTrustedCert`: UInt = 5u;
public const val `msodsvUnsigned`: UInt = 1u;
public const val `msoedmDisable`: UInt = 2u;
public const val `msoedmDontOpen`: UInt = 3u;
public const val `msoedmEnable`: UInt = 1u;
public const val `msoslHigh`: UInt = 3u;
public const val `msoslMedium`: UInt = 2u;
public const val `msoslNone`: UInt = 1u;
public const val `msoslUndefined`: UInt = 0u;
// UNSUPPORTED Rust 634:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const wfolders: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbae31f9a_1b81_11d2_a97a_00c04f8ecb02);

