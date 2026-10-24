// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("advpack.dll" "system" fn AddDelBackupEntryA(lpcszfilelist : windows_sys::core::PCSTR, lpcszbackupdir : windows_sys::core::PCSTR, lpcszbasename : windows_sys::core::PCSTR, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("advpack.dll" "system" fn AddDelBackupEntryW(lpcszfilelist : windows_sys::core::PCWSTR, lpcszbackupdir : windows_sys::core::PCWSTR, lpcszbasename : windows_sys::core::PCWSTR, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("advpack.dll" "system" fn AdvInstallFileA(hwnd : super::super::Foundation:: HWND, lpszsourcedir : windows_sys::core::PCSTR, lpszsourcefile : windows_sys::core::PCSTR, lpszdestdir : windows_sys::core::PCSTR, lpszdestfile : windows_sys::core::PCSTR, dwflags : u32, dwreserved : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("advpack.dll" "system" fn AdvInstallFileW(hwnd : super::super::Foundation:: HWND, lpszsourcedir : windows_sys::core::PCWSTR, lpszsourcefile : windows_sys::core::PCWSTR, lpszdestdir : windows_sys::core::PCWSTR, lpszdestfile : windows_sys::core::PCWSTR, dwflags : u32, dwreserved : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("apphelp.dll" "system" fn ApphelpCheckShellObject(objectclsid : *const windows_sys::core::GUID, bshimifnecessary : windows_sys::core::BOOL, pullflags : *mut u64) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn CancelDeviceWakeupRequest(hdevice : super::super::Foundation:: HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("advpack.dll" "system" fn CloseINFEngine(hinf : *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-core-realtime-l1-1-2.dll" "system" fn ConvertAuxiliaryCounterToPerformanceCounter(ullauxiliarycountervalue : u64, lpperformancecountervalue : *mut u64, lpconversionerror : *mut u64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-core-realtime-l1-1-2.dll" "system" fn ConvertPerformanceCounterToAuxiliaryCounter(ullperformancecountervalue : u64, lpauxiliarycountervalue : *mut u64, lpconversionerror : *mut u64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("dciman32.dll" "system" fn DCIBeginAccess(pdci : *mut DCISURFACEINFO, x : i32, y : i32, dx : i32, dy : i32) -> i32);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("dciman32.dll" "system" fn DCICloseProvider(hdc : super::super::Graphics::Gdi:: HDC));

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("dciman32.dll" "system" fn DCICreateOffscreen(hdc : super::super::Graphics::Gdi:: HDC, dwcompression : u32, dwredmask : u32, dwgreenmask : u32, dwbluemask : u32, dwwidth : u32, dwheight : u32, dwdcicaps : u32, dwbitcount : u32, lplpsurface : *mut *mut DCIOFFSCREEN) -> i32);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("dciman32.dll" "system" fn DCICreateOverlay(hdc : super::super::Graphics::Gdi:: HDC, lpoffscreensurf : *mut core::ffi::c_void, lplpsurface : *mut *mut DCIOVERLAY) -> i32);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("dciman32.dll" "system" fn DCICreatePrimary(hdc : super::super::Graphics::Gdi:: HDC, lplpsurface : *mut *mut DCISURFACEINFO) -> i32);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// windows_link::link!("dciman32.dll" "system" fn DCIDestroy(pdci : *mut DCISURFACEINFO));

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// windows_link::link!("dciman32.dll" "system" fn DCIDraw(pdci : *mut DCIOFFSCREEN) -> i32);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// windows_link::link!("dciman32.dll" "system" fn DCIEndAccess(pdci : *mut DCISURFACEINFO));

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("dciman32.dll" "system" fn DCIEnum(hdc : super::super::Graphics::Gdi:: HDC, lprdst : *mut super::super::Foundation:: RECT, lprsrc : *mut super::super::Foundation:: RECT, lpfncallback : *mut core::ffi::c_void, lpcontext : *mut core::ffi::c_void) -> i32);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("dciman32.dll" "system" fn DCIOpenProvider() -> super::super::Graphics::Gdi:: HDC);

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("dciman32.dll" "system" fn DCISetClipList(pdci : *mut DCIOFFSCREEN, prd : *mut super::super::Graphics::Gdi:: RGNDATA) -> i32);

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// windows_link::link!("dciman32.dll" "system" fn DCISetDestination(pdci : *mut DCIOFFSCREEN, dst : *mut super::super::Foundation:: RECT, src : *mut super::super::Foundation:: RECT) -> i32);

// UNSUPPORTED Rust 29:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("dciman32.dll" "system" fn DCISetSrcDestClip(pdci : *mut DCIOFFSCREEN, srcrc : *mut super::super::Foundation:: RECT, destrc : *mut super::super::Foundation:: RECT, prd : *mut super::super::Graphics::Gdi:: RGNDATA) -> i32);

// UNSUPPORTED Rust 31:1: declaration Macro has no candidate rule
// windows_link::link!("advpack.dll" "system" fn DelNodeA(pszfileordirname : windows_sys::core::PCSTR, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 32:1: declaration Macro has no candidate rule
// windows_link::link!("advpack.dll" "system" fn DelNodeRunDLL32W(hwnd : super::super::Foundation:: HWND, hinstance : super::super::Foundation:: HINSTANCE, pszparms : windows_sys::core::PWSTR, nshow : i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 33:1: declaration Macro has no candidate rule
// windows_link::link!("advpack.dll" "system" fn DelNodeW(pszfileordirname : windows_sys::core::PCWSTR, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 34:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn DnsHostnameToComputerNameA(hostname : windows_sys::core::PCSTR, computername : windows_sys::core::PSTR, nsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 35:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn DnsHostnameToComputerNameW(hostname : windows_sys::core::PCWSTR, computername : windows_sys::core::PWSTR, nsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 36:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn DosDateTimeToFileTime(wfatdate : u16, wfattime : u16, lpfiletime : *mut super::super::Foundation:: FILETIME) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 37:1: declaration Macro has no candidate rule
// #[cfg(any(target_arch = "arm64ec", target_arch = "x86", target_arch = "x86_64"))]
// windows_link::link!("kernel32.dll" "system" fn EnableProcessOptionalXStateFeatures(features : u64) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 39:1: declaration Macro has no candidate rule
// windows_link::link!("advpack.dll" "system" fn ExecuteCabA(hwnd : super::super::Foundation:: HWND, pcab : *mut CABINFOA, preserved : *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 40:1: declaration Macro has no candidate rule
// windows_link::link!("advpack.dll" "system" fn ExecuteCabW(hwnd : super::super::Foundation:: HWND, pcab : *mut CABINFOW, preserved : *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 41:1: declaration Macro has no candidate rule
// windows_link::link!("advpack.dll" "system" fn ExtractFilesA(pszcabname : windows_sys::core::PCSTR, pszexpanddir : windows_sys::core::PCSTR, dwflags : u32, pszfilelist : windows_sys::core::PCSTR, lpreserved : *mut core::ffi::c_void, dwreserved : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 42:1: declaration Macro has no candidate rule
// windows_link::link!("advpack.dll" "system" fn ExtractFilesW(pszcabname : windows_sys::core::PCWSTR, pszexpanddir : windows_sys::core::PCWSTR, dwflags : u32, pszfilelist : windows_sys::core::PCWSTR, lpreserved : *mut core::ffi::c_void, dwreserved : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 43:1: declaration Macro has no candidate rule
// windows_link::link!("advpack.dll" "system" fn FileSaveMarkNotExistA(lpfilelist : windows_sys::core::PCSTR, lpdir : windows_sys::core::PCSTR, lpbasename : windows_sys::core::PCSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 44:1: declaration Macro has no candidate rule
// windows_link::link!("advpack.dll" "system" fn FileSaveMarkNotExistW(lpfilelist : windows_sys::core::PCWSTR, lpdir : windows_sys::core::PCWSTR, lpbasename : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 45:1: declaration Macro has no candidate rule
// windows_link::link!("advpack.dll" "system" fn FileSaveRestoreOnINFA(hwnd : super::super::Foundation:: HWND, psztitle : windows_sys::core::PCSTR, pszinf : windows_sys::core::PCSTR, pszsection : windows_sys::core::PCSTR, pszbackupdir : windows_sys::core::PCSTR, pszbasebackupfile : windows_sys::core::PCSTR, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 46:1: declaration Macro has no candidate rule
// windows_link::link!("advpack.dll" "system" fn FileSaveRestoreOnINFW(hwnd : super::super::Foundation:: HWND, psztitle : windows_sys::core::PCWSTR, pszinf : windows_sys::core::PCWSTR, pszsection : windows_sys::core::PCWSTR, pszbackupdir : windows_sys::core::PCWSTR, pszbasebackupfile : windows_sys::core::PCWSTR, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 47:1: declaration Macro has no candidate rule
// windows_link::link!("advpack.dll" "system" fn FileSaveRestoreW(hdlg : super::super::Foundation:: HWND, lpfilelist : windows_sys::core::PCWSTR, lpdir : windows_sys::core::PCWSTR, lpbasename : windows_sys::core::PCWSTR, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 48:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn FileTimeToDosDateTime(lpfiletime : *const super::super::Foundation:: FILETIME, lpfatdate : *mut u16, lpfattime : *mut u16) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 49:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-dx-d3dkmt-l1-1-0.dll" "system" fn GdiEntry13() -> u32);

// UNSUPPORTED Rust 50:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetComputerNameA(lpbuffer : windows_sys::core::PSTR, nsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 51:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetComputerNameW(lpbuffer : windows_sys::core::PWSTR, nsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 52:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn GetCurrentHwProfileA(lphwprofileinfo : *mut HW_PROFILE_INFOA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 53:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn GetCurrentHwProfileW(lphwprofileinfo : *mut HW_PROFILE_INFOW) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 54:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("dciman32.dll" "system" fn GetDCRegionData(hdc : super::super::Graphics::Gdi:: HDC, size : u32, prd : *mut super::super::Graphics::Gdi:: RGNDATA) -> u32);

// UNSUPPORTED Rust 56:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-core-featurestaging-l1-1-0.dll" "system" fn GetFeatureEnabledState(featureid : u32, changetime : FEATURE_CHANGE_TIME) -> FEATURE_ENABLED_STATE);

// UNSUPPORTED Rust 57:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-core-featurestaging-l1-1-1.dll" "system" fn GetFeatureVariant(featureid : u32, changetime : FEATURE_CHANGE_TIME, payloadid : *mut u32, hasnotification : *mut windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 58:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetFirmwareEnvironmentVariableA(lpname : windows_sys::core::PCSTR, lpguid : windows_sys::core::PCSTR, pbuffer : *mut core::ffi::c_void, nsize : u32) -> u32);

// UNSUPPORTED Rust 59:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetFirmwareEnvironmentVariableExA(lpname : windows_sys::core::PCSTR, lpguid : windows_sys::core::PCSTR, pbuffer : *mut core::ffi::c_void, nsize : u32, pdwattribubutes : *mut u32) -> u32);

// UNSUPPORTED Rust 60:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetFirmwareEnvironmentVariableExW(lpname : windows_sys::core::PCWSTR, lpguid : windows_sys::core::PCWSTR, pbuffer : *mut core::ffi::c_void, nsize : u32, pdwattribubutes : *mut u32) -> u32);

// UNSUPPORTED Rust 61:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetFirmwareEnvironmentVariableW(lpname : windows_sys::core::PCWSTR, lpguid : windows_sys::core::PCWSTR, pbuffer : *mut core::ffi::c_void, nsize : u32) -> u32);

// UNSUPPORTED Rust 62:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetPrivateProfileIntA(lpappname : windows_sys::core::PCSTR, lpkeyname : windows_sys::core::PCSTR, ndefault : i32, lpfilename : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 63:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetPrivateProfileIntW(lpappname : windows_sys::core::PCWSTR, lpkeyname : windows_sys::core::PCWSTR, ndefault : i32, lpfilename : windows_sys::core::PCWSTR) -> i32);

// UNSUPPORTED Rust 64:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetPrivateProfileSectionA(lpappname : windows_sys::core::PCSTR, lpreturnedstring : windows_sys::core::PSTR, nsize : u32, lpfilename : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 65:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetPrivateProfileSectionNamesA(lpszreturnbuffer : windows_sys::core::PSTR, nsize : u32, lpfilename : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 66:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetPrivateProfileSectionNamesW(lpszreturnbuffer : windows_sys::core::PWSTR, nsize : u32, lpfilename : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 67:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetPrivateProfileSectionW(lpappname : windows_sys::core::PCWSTR, lpreturnedstring : windows_sys::core::PWSTR, nsize : u32, lpfilename : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 68:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetPrivateProfileStringA(lpappname : windows_sys::core::PCSTR, lpkeyname : windows_sys::core::PCSTR, lpdefault : windows_sys::core::PCSTR, lpreturnedstring : windows_sys::core::PSTR, nsize : u32, lpfilename : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 69:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetPrivateProfileStringW(lpappname : windows_sys::core::PCWSTR, lpkeyname : windows_sys::core::PCWSTR, lpdefault : windows_sys::core::PCWSTR, lpreturnedstring : windows_sys::core::PWSTR, nsize : u32, lpfilename : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 70:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetPrivateProfileStructA(lpszsection : windows_sys::core::PCSTR, lpszkey : windows_sys::core::PCSTR, lpstruct : *mut core::ffi::c_void, usizestruct : u32, szfile : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 71:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetPrivateProfileStructW(lpszsection : windows_sys::core::PCWSTR, lpszkey : windows_sys::core::PCWSTR, lpstruct : *mut core::ffi::c_void, usizestruct : u32, szfile : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 72:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetProfileIntA(lpappname : windows_sys::core::PCSTR, lpkeyname : windows_sys::core::PCSTR, ndefault : i32) -> u32);

// UNSUPPORTED Rust 73:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetProfileIntW(lpappname : windows_sys::core::PCWSTR, lpkeyname : windows_sys::core::PCWSTR, ndefault : i32) -> u32);

// UNSUPPORTED Rust 74:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetProfileSectionA(lpappname : windows_sys::core::PCSTR, lpreturnedstring : windows_sys::core::PSTR, nsize : u32) -> u32);

// UNSUPPORTED Rust 75:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetProfileSectionW(lpappname : windows_sys::core::PCWSTR, lpreturnedstring : windows_sys::core::PWSTR, nsize : u32) -> u32);

// UNSUPPORTED Rust 76:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetProfileStringA(lpappname : windows_sys::core::PCSTR, lpkeyname : windows_sys::core::PCSTR, lpdefault : windows_sys::core::PCSTR, lpreturnedstring : windows_sys::core::PSTR, nsize : u32) -> u32);

// UNSUPPORTED Rust 77:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetProfileStringW(lpappname : windows_sys::core::PCWSTR, lpkeyname : windows_sys::core::PCWSTR, lpdefault : windows_sys::core::PCWSTR, lpreturnedstring : windows_sys::core::PWSTR, nsize : u32) -> u32);

// UNSUPPORTED Rust 78:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetSystemRegistryQuota(pdwquotaallowed : *mut u32, pdwquotaused : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 79:1: declaration Macro has no candidate rule
// #[cfg(any(target_arch = "arm64ec", target_arch = "x86", target_arch = "x86_64"))]
// windows_link::link!("kernel32.dll" "system" fn GetThreadEnabledXStateFeatures() -> u64);

// UNSUPPORTED Rust 81:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn GetUserNameA(lpbuffer : windows_sys::core::PSTR, pcbbuffer : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 82:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn GetUserNameW(lpbuffer : windows_sys::core::PWSTR, pcbbuffer : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 83:1: declaration Macro has no candidate rule
// windows_link::link!("advpack.dll" "system" fn GetVersionFromFileA(lpszfilename : windows_sys::core::PCSTR, pdwmsver : *mut u32, pdwlsver : *mut u32, bversion : windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 84:1: declaration Macro has no candidate rule
// windows_link::link!("advpack.dll" "system" fn GetVersionFromFileExA(lpszfilename : windows_sys::core::PCSTR, pdwmsver : *mut u32, pdwlsver : *mut u32, bversion : windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 85:1: declaration Macro has no candidate rule
// windows_link::link!("advpack.dll" "system" fn GetVersionFromFileExW(lpszfilename : windows_sys::core::PCWSTR, pdwmsver : *mut u32, pdwlsver : *mut u32, bversion : windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 86:1: declaration Macro has no candidate rule
// windows_link::link!("advpack.dll" "system" fn GetVersionFromFileW(lpszfilename : windows_sys::core::PCWSTR, pdwmsver : *mut u32, pdwlsver : *mut u32, bversion : windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 87:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("dciman32.dll" "system" fn GetWindowRegionData(hwnd : super::super::Foundation:: HWND, size : u32, prd : *mut super::super::Graphics::Gdi:: RGNDATA) -> u32);

// UNSUPPORTED Rust 89:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GlobalCompact(dwminfree : u32) -> usize);

// UNSUPPORTED Rust 90:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GlobalFix(hmem : super::super::Foundation:: HGLOBAL));

// UNSUPPORTED Rust 91:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GlobalUnWire(hmem : super::super::Foundation:: HGLOBAL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 92:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GlobalUnfix(hmem : super::super::Foundation:: HGLOBAL));

// UNSUPPORTED Rust 93:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GlobalWire(hmem : super::super::Foundation:: HGLOBAL) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 94:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn IMPGetIMEA(param0 : super::super::Foundation:: HWND, param1 : *mut IMEPROA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 95:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn IMPGetIMEW(param0 : super::super::Foundation:: HWND, param1 : *mut IMEPROW) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 96:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn IMPQueryIMEA(param0 : *mut IMEPROA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 97:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn IMPQueryIMEW(param0 : *mut IMEPROW) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 98:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn IMPSetIMEA(param0 : super::super::Foundation:: HWND, param1 : *mut IMEPROA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 99:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn IMPSetIMEW(param0 : super::super::Foundation:: HWND, param1 : *mut IMEPROW) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 100:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-core-apiquery-l2-1-0.dll" "system" fn IsApiSetImplemented(contract : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 101:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn IsBadHugeReadPtr(lp : *const core::ffi::c_void, ucb : usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 102:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn IsBadHugeWritePtr(lp : *const core::ffi::c_void, ucb : usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 103:1: declaration Macro has no candidate rule
// windows_link::link!("advpack.dll" "system" fn IsNTAdmin(dwreserved : u32, lpdwreserved : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 104:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn IsNativeVhdBoot(nativevhdboot : *mut windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 105:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn IsTokenUntrusted(tokenhandle : super::super::Foundation:: HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 106:1: declaration Macro has no candidate rule
// windows_link::link!("advpack.dll" "system" fn LaunchINFSectionExW(hwnd : super::super::Foundation:: HWND, hinstance : super::super::Foundation:: HINSTANCE, pszparms : windows_sys::core::PCWSTR, nshow : i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 107:1: declaration Macro has no candidate rule
// windows_link::link!("advpack.dll" "system" fn LaunchINFSectionW(hwndowner : super::super::Foundation:: HWND, hinstance : super::super::Foundation:: HINSTANCE, pszparams : windows_sys::core::PWSTR, nshow : i32) -> i32);

// UNSUPPORTED Rust 108:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn LocalCompact(uminfree : u32) -> usize);

// UNSUPPORTED Rust 109:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn LocalShrink(hmem : super::super::Foundation:: HLOCAL, cbnewsize : u32) -> usize);

// UNSUPPORTED Rust 110:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn MulDiv(nnumber : i32, nnumerator : i32, ndenominator : i32) -> i32);

// UNSUPPORTED Rust 111:1: declaration Macro has no candidate rule
// windows_link::link!("advpack.dll" "system" fn NeedReboot(dwrebootcheck : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 112:1: declaration Macro has no candidate rule
// windows_link::link!("advpack.dll" "system" fn NeedRebootInit() -> u32);

// UNSUPPORTED Rust 113:1: declaration Macro has no candidate rule
// windows_link::link!("advpack.dll" "system" fn OpenINFEngineA(pszinffilename : windows_sys::core::PCSTR, pszinstallsection : windows_sys::core::PCSTR, dwflags : u32, phinf : *mut *mut core::ffi::c_void, pvreserved : *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 114:1: declaration Macro has no candidate rule
// windows_link::link!("advpack.dll" "system" fn OpenINFEngineW(pszinffilename : windows_sys::core::PCWSTR, pszinstallsection : windows_sys::core::PCWSTR, dwflags : u32, phinf : *mut *mut core::ffi::c_void, pvreserved : *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 115:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn OpenMutexA(dwdesiredaccess : u32, binherithandle : windows_sys::core::BOOL, lpname : windows_sys::core::PCSTR) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 116:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn OpenSemaphoreA(dwdesiredaccess : u32, binherithandle : windows_sys::core::BOOL, lpname : windows_sys::core::PCSTR) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 117:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-core-realtime-l1-1-2.dll" "system" fn QueryAuxiliaryCounterFrequency(lpauxiliarycounterfrequency : *mut u64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 118:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn QueryIdleProcessorCycleTime(bufferlength : *mut u32, processoridlecycletime : *mut u64) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 119:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn QueryIdleProcessorCycleTimeEx(group : u16, bufferlength : *mut u32, processoridlecycletime : *mut u64) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 120:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-core-realtime-l1-1-1.dll" "system" fn QueryInterruptTime(lpinterrupttime : *mut u64));

// UNSUPPORTED Rust 121:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-core-realtime-l1-1-1.dll" "system" fn QueryInterruptTimePrecise(lpinterrupttimeprecise : *mut u64));

// UNSUPPORTED Rust 122:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn QueryProcessCycleTime(processhandle : super::super::Foundation:: HANDLE, cycletime : *mut u64) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 123:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn QueryThreadCycleTime(threadhandle : super::super::Foundation:: HANDLE, cycletime : *mut u64) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 124:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn QueryUnbiasedInterruptTime(unbiasedtime : *mut u64) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 125:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-core-realtime-l1-1-1.dll" "system" fn QueryUnbiasedInterruptTimePrecise(lpunbiasedinterrupttimeprecise : *mut u64));

// UNSUPPORTED Rust 126:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-core-backgroundtask-l1-1-0.dll" "system" fn RaiseCustomSystemEventTrigger(customsystemeventtriggerconfig : *const CUSTOM_SYSTEM_EVENT_TRIGGER_CONFIG) -> u32);

// UNSUPPORTED Rust 127:1: declaration Macro has no candidate rule
// windows_link::link!("advpack.dll" "system" fn RebootCheckOnInstallA(hwnd : super::super::Foundation:: HWND, pszinf : windows_sys::core::PCSTR, pszsec : windows_sys::core::PCSTR, dwreserved : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 128:1: declaration Macro has no candidate rule
// windows_link::link!("advpack.dll" "system" fn RebootCheckOnInstallW(hwnd : super::super::Foundation:: HWND, pszinf : windows_sys::core::PCWSTR, pszsec : windows_sys::core::PCWSTR, dwreserved : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 129:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-core-featurestaging-l1-1-0.dll" "system" fn RecordFeatureError(featureid : u32, error : *const FEATURE_ERROR));

// UNSUPPORTED Rust 130:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-core-featurestaging-l1-1-0.dll" "system" fn RecordFeatureUsage(featureid : u32, kind : u32, addend : u32, originname : windows_sys::core::PCSTR));

// UNSUPPORTED Rust 131:1: declaration Macro has no candidate rule
// windows_link::link!("advpack.dll" "system" fn RegInstallA(hmod : super::super::Foundation:: HMODULE, pszsection : windows_sys::core::PCSTR, psttable : *const STRTABLEA) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 132:1: declaration Macro has no candidate rule
// windows_link::link!("advpack.dll" "system" fn RegInstallW(hmod : super::super::Foundation:: HMODULE, pszsection : windows_sys::core::PCWSTR, psttable : *const STRTABLEW) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 133:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("advpack.dll" "system" fn RegRestoreAllA(hwnd : super::super::Foundation:: HWND, psztitlestring : windows_sys::core::PCSTR, hkbckupkey : super::Registry:: HKEY) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 135:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("advpack.dll" "system" fn RegRestoreAllW(hwnd : super::super::Foundation:: HWND, psztitlestring : windows_sys::core::PCWSTR, hkbckupkey : super::Registry:: HKEY) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 137:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("advpack.dll" "system" fn RegSaveRestoreA(hwnd : super::super::Foundation:: HWND, psztitlestring : windows_sys::core::PCSTR, hkbckupkey : super::Registry:: HKEY, pcszrootkey : windows_sys::core::PCSTR, pcszsubkey : windows_sys::core::PCSTR, pcszvaluename : windows_sys::core::PCSTR, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 139:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("advpack.dll" "system" fn RegSaveRestoreOnINFA(hwnd : super::super::Foundation:: HWND, psztitle : windows_sys::core::PCSTR, pszinf : windows_sys::core::PCSTR, pszsection : windows_sys::core::PCSTR, hhklmbackkey : super::Registry:: HKEY, hhkcubackkey : super::Registry:: HKEY, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 141:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("advpack.dll" "system" fn RegSaveRestoreOnINFW(hwnd : super::super::Foundation:: HWND, psztitle : windows_sys::core::PCWSTR, pszinf : windows_sys::core::PCWSTR, pszsection : windows_sys::core::PCWSTR, hhklmbackkey : super::Registry:: HKEY, hhkcubackkey : super::Registry:: HKEY, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 143:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("advpack.dll" "system" fn RegSaveRestoreW(hwnd : super::super::Foundation:: HWND, psztitlestring : windows_sys::core::PCWSTR, hkbckupkey : super::Registry:: HKEY, pcszrootkey : windows_sys::core::PCWSTR, pcszsubkey : windows_sys::core::PCWSTR, pcszvaluename : windows_sys::core::PCWSTR, dwflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 145:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn ReplacePartitionUnit(targetpartition : windows_sys::core::PCWSTR, sparepartition : windows_sys::core::PCWSTR, flags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 146:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn RequestDeviceWakeup(hdevice : super::super::Foundation:: HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 147:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Kernel")]
// windows_link::link!("ntdll.dll" "system" fn RtlAnsiStringToUnicodeString(destinationstring : *mut super::super::Foundation:: UNICODE_STRING, sourcestring : *mut super::Kernel:: STRING, allocatedestinationstring : bool) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 149:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlCharToInteger(string : *mut i8, base : u32, value : *mut u32) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 150:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Kernel")]
// windows_link::link!("ntdll.dll" "system" fn RtlFreeAnsiString(ansistring : *mut super::Kernel:: STRING));

// UNSUPPORTED Rust 152:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Kernel")]
// windows_link::link!("ntdll.dll" "system" fn RtlFreeOemString(oemstring : *mut super::Kernel:: STRING));

// UNSUPPORTED Rust 154:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlFreeUnicodeString(unicodestring : *mut super::super::Foundation:: UNICODE_STRING));

// UNSUPPORTED Rust 155:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlGetReturnAddressHijackTarget() -> usize);

// UNSUPPORTED Rust 156:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Kernel")]
// windows_link::link!("ntdll.dll" "system" fn RtlInitAnsiString(destinationstring : *mut super::Kernel:: STRING, sourcestring : *mut i8));

// UNSUPPORTED Rust 158:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Kernel")]
// windows_link::link!("ntdll.dll" "system" fn RtlInitAnsiStringEx(destinationstring : *mut super::Kernel:: STRING, sourcestring : *mut i8) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 160:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Kernel")]
// windows_link::link!("ntdll.dll" "system" fn RtlInitString(destinationstring : *mut super::Kernel:: STRING, sourcestring : *mut i8));

// UNSUPPORTED Rust 162:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Kernel")]
// windows_link::link!("ntdll.dll" "system" fn RtlInitStringEx(destinationstring : *mut super::Kernel:: STRING, sourcestring : *mut i8) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 164:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlInitUnicodeString(destinationstring : *mut super::super::Foundation:: UNICODE_STRING, sourcestring : windows_sys::core::PCWSTR));

// UNSUPPORTED Rust 165:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Kernel")]
// windows_link::link!("ntdll.dll" "system" fn RtlIsNameLegalDOS8Dot3(name : *mut super::super::Foundation:: UNICODE_STRING, oemname : *mut super::Kernel:: STRING, namecontainsspaces : *mut bool) -> bool);

// UNSUPPORTED Rust 167:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlLocalTimeToSystemTime(localtime : *mut i64, systemtime : *mut i64) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 168:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlRaiseCustomSystemEventTrigger(triggerconfig : *const CUSTOM_SYSTEM_EVENT_TRIGGER_CONFIG) -> u32);

// UNSUPPORTED Rust 169:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlTimeToSecondsSince1970(time : *mut i64, elapsedseconds : *mut u32) -> bool);

// UNSUPPORTED Rust 170:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Kernel")]
// windows_link::link!("ntdll.dll" "system" fn RtlUnicodeStringToAnsiString(destinationstring : *mut super::Kernel:: STRING, sourcestring : *mut super::super::Foundation:: UNICODE_STRING, allocatedestinationstring : bool) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 172:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Kernel")]
// windows_link::link!("ntdll.dll" "system" fn RtlUnicodeStringToOemString(destinationstring : *mut super::Kernel:: STRING, sourcestring : *mut super::super::Foundation:: UNICODE_STRING, allocatedestinationstring : bool) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 174:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlUnicodeToMultiByteSize(bytesinmultibytestring : *mut u32, unicodestring : windows_sys::core::PCWSTR, bytesinunicodestring : u32) -> super::super::Foundation:: NTSTATUS);

// UNSUPPORTED Rust 175:1: declaration Macro has no candidate rule
// windows_link::link!("ntdll.dll" "system" fn RtlUniform(seed : *mut u32) -> u32);

// UNSUPPORTED Rust 176:1: declaration Macro has no candidate rule
// windows_link::link!("advpack.dll" "system" fn RunSetupCommandA(hwnd : super::super::Foundation:: HWND, szcmdname : windows_sys::core::PCSTR, szinfsection : windows_sys::core::PCSTR, szdir : windows_sys::core::PCSTR, lpsztitle : windows_sys::core::PCSTR, phexe : *mut super::super::Foundation:: HANDLE, dwflags : u32, pvreserved : *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 177:1: declaration Macro has no candidate rule
// windows_link::link!("advpack.dll" "system" fn RunSetupCommandW(hwnd : super::super::Foundation:: HWND, szcmdname : windows_sys::core::PCWSTR, szinfsection : windows_sys::core::PCWSTR, szdir : windows_sys::core::PCWSTR, lpsztitle : windows_sys::core::PCWSTR, phexe : *mut super::super::Foundation:: HANDLE, dwflags : u32, pvreserved : *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 178:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn SendIMEMessageExA(param0 : super::super::Foundation:: HWND, param1 : super::super::Foundation:: LPARAM) -> super::super::Foundation:: LRESULT);

// UNSUPPORTED Rust 179:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn SendIMEMessageExW(param0 : super::super::Foundation:: HWND, param1 : super::super::Foundation:: LPARAM) -> super::super::Foundation:: LRESULT);

// UNSUPPORTED Rust 180:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn SetEnvironmentStringsA(newenvironment : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 181:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn SetFirmwareEnvironmentVariableA(lpname : windows_sys::core::PCSTR, lpguid : windows_sys::core::PCSTR, pvalue : *const core::ffi::c_void, nsize : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 182:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn SetFirmwareEnvironmentVariableExA(lpname : windows_sys::core::PCSTR, lpguid : windows_sys::core::PCSTR, pvalue : *const core::ffi::c_void, nsize : u32, dwattributes : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 183:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn SetFirmwareEnvironmentVariableExW(lpname : windows_sys::core::PCWSTR, lpguid : windows_sys::core::PCWSTR, pvalue : *const core::ffi::c_void, nsize : u32, dwattributes : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 184:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn SetFirmwareEnvironmentVariableW(lpname : windows_sys::core::PCWSTR, lpguid : windows_sys::core::PCWSTR, pvalue : *const core::ffi::c_void, nsize : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 185:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn SetHandleCount(unumber : u32) -> u32);

// UNSUPPORTED Rust 186:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn SetMessageWaitingIndicator(hmsgindicator : super::super::Foundation:: HANDLE, ulmsgcount : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 187:1: declaration Macro has no candidate rule
// windows_link::link!("advpack.dll" "system" fn SetPerUserSecValuesA(pperuser : *mut PERUSERSECTIONA) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 188:1: declaration Macro has no candidate rule
// windows_link::link!("advpack.dll" "system" fn SetPerUserSecValuesW(pperuser : *mut PERUSERSECTIONW) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 189:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-core-featurestaging-l1-1-0.dll" "system" fn SubscribeFeatureStateChangeNotification(subscription : *mut FEATURE_STATE_CHANGE_SUBSCRIPTION, callback : PFEATURE_STATE_CHANGE_CALLBACK, context : *const core::ffi::c_void));

// UNSUPPORTED Rust 190:1: declaration Macro has no candidate rule
// windows_link::link!("advpack.dll" "system" fn TranslateInfStringA(pszinffilename : windows_sys::core::PCSTR, pszinstallsection : windows_sys::core::PCSTR, psztranslatesection : windows_sys::core::PCSTR, psztranslatekey : windows_sys::core::PCSTR, pszbuffer : windows_sys::core::PSTR, cchbuffer : u32, pdwrequiredsize : *mut u32, pvreserved : *const core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 191:1: declaration Macro has no candidate rule
// windows_link::link!("advpack.dll" "system" fn TranslateInfStringExA(hinf : *mut core::ffi::c_void, pszinffilename : windows_sys::core::PCSTR, psztranslatesection : windows_sys::core::PCSTR, psztranslatekey : windows_sys::core::PCSTR, pszbuffer : windows_sys::core::PSTR, dwbuffersize : u32, pdwrequiredsize : *mut u32, pvreserved : *const core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 192:1: declaration Macro has no candidate rule
// windows_link::link!("advpack.dll" "system" fn TranslateInfStringExW(hinf : *mut core::ffi::c_void, pszinffilename : windows_sys::core::PCWSTR, psztranslatesection : windows_sys::core::PCWSTR, psztranslatekey : windows_sys::core::PCWSTR, pszbuffer : windows_sys::core::PWSTR, dwbuffersize : u32, pdwrequiredsize : *mut u32, pvreserved : *const core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 193:1: declaration Macro has no candidate rule
// windows_link::link!("advpack.dll" "system" fn TranslateInfStringW(pszinffilename : windows_sys::core::PCWSTR, pszinstallsection : windows_sys::core::PCWSTR, psztranslatesection : windows_sys::core::PCWSTR, psztranslatekey : windows_sys::core::PCWSTR, pszbuffer : windows_sys::core::PWSTR, cchbuffer : u32, pdwrequiredsize : *mut u32, pvreserved : *const core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 194:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-core-featurestaging-l1-1-0.dll" "system" fn UnsubscribeFeatureStateChangeNotification(subscription : FEATURE_STATE_CHANGE_SUBSCRIPTION));

// UNSUPPORTED Rust 195:1: declaration Macro has no candidate rule
// windows_link::link!("advpack.dll" "system" fn UserInstStubWrapperA(hwnd : super::super::Foundation:: HWND, hinstance : super::super::Foundation:: HINSTANCE, pszparms : windows_sys::core::PCSTR, nshow : i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 196:1: declaration Macro has no candidate rule
// windows_link::link!("advpack.dll" "system" fn UserInstStubWrapperW(hwnd : super::super::Foundation:: HWND, hinstance : super::super::Foundation:: HINSTANCE, pszparms : windows_sys::core::PCWSTR, nshow : i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 197:1: declaration Macro has no candidate rule
// windows_link::link!("advpack.dll" "system" fn UserUnInstStubWrapperA(hwnd : super::super::Foundation:: HWND, hinstance : super::super::Foundation:: HINSTANCE, pszparms : windows_sys::core::PCSTR, nshow : i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 198:1: declaration Macro has no candidate rule
// windows_link::link!("advpack.dll" "system" fn UserUnInstStubWrapperW(hwnd : super::super::Foundation:: HWND, hinstance : super::super::Foundation:: HINSTANCE, pszparms : windows_sys::core::PCWSTR, nshow : i32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 199:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn WINNLSEnableIME(param0 : super::super::Foundation:: HWND, param1 : windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 200:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn WINNLSGetEnableStatus(param0 : super::super::Foundation:: HWND) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 201:1: declaration Macro has no candidate rule
// windows_link::link!("user32.dll" "system" fn WINNLSGetIMEHotkey(param0 : super::super::Foundation:: HWND) -> u32);

// UNSUPPORTED Rust 202:1: declaration Macro has no candidate rule
// windows_link::link!("dciman32.dll" "system" fn WinWatchClose(hww : HWINWATCH));

// UNSUPPORTED Rust 203:1: declaration Macro has no candidate rule
// windows_link::link!("dciman32.dll" "system" fn WinWatchDidStatusChange(hww : HWINWATCH) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 204:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("dciman32.dll" "system" fn WinWatchGetClipList(hww : HWINWATCH, prc : *mut super::super::Foundation:: RECT, size : u32, prd : *mut super::super::Graphics::Gdi:: RGNDATA) -> u32);

// UNSUPPORTED Rust 206:1: declaration Macro has no candidate rule
// windows_link::link!("dciman32.dll" "system" fn WinWatchNotify(hww : HWINWATCH, notifycallback : WINWATCHNOTIFYPROC, notifyparam : super::super::Foundation:: LPARAM) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 207:1: declaration Macro has no candidate rule
// windows_link::link!("dciman32.dll" "system" fn WinWatchOpen(hwnd : super::super::Foundation:: HWND) -> HWINWATCH);

// UNSUPPORTED Rust 208:1: declaration Macro has no candidate rule
// windows_link::link!("wldp.dll" "system" fn WldpCanExecuteBuffer(host : *const windows_sys::core::GUID, options : WLDP_EXECUTION_EVALUATION_OPTIONS, buffer : *const u8, buffersize : u32, auditinfo : windows_sys::core::PCWSTR, result : *mut WLDP_EXECUTION_POLICY) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 209:1: declaration Macro has no candidate rule
// windows_link::link!("wldp.dll" "system" fn WldpCanExecuteFile(host : *const windows_sys::core::GUID, options : WLDP_EXECUTION_EVALUATION_OPTIONS, filehandle : super::super::Foundation:: HANDLE, auditinfo : windows_sys::core::PCWSTR, result : *mut WLDP_EXECUTION_POLICY) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 210:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("wldp.dll" "system" fn WldpCanExecuteStream(host : *const windows_sys::core::GUID, options : WLDP_EXECUTION_EVALUATION_OPTIONS, stream : * mut core::ffi::c_void, auditinfo : windows_sys::core::PCWSTR, result : *mut WLDP_EXECUTION_POLICY) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 212:1: declaration Macro has no candidate rule
// windows_link::link!("wldp.dll" "system" fn WldpGetLockdownPolicy(hostinformation : *const WLDP_HOST_INFORMATION, lockdownstate : *mut u32, lockdownflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 213:1: declaration Macro has no candidate rule
// windows_link::link!("wldp.dll" "system" fn WldpIsClassInApprovedList(classid : *const windows_sys::core::GUID, hostinformation : *const WLDP_HOST_INFORMATION, isapproved : *mut windows_sys::core::BOOL, optionalflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 214:1: declaration Macro has no candidate rule
// windows_link::link!("wldp.dll" "system" fn WldpIsDynamicCodePolicyEnabled(isenabled : *mut windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 215:1: declaration Macro has no candidate rule
// windows_link::link!("wldp.dll" "system" fn WldpQueryDeviceSecurityInformation(information : *mut WLDP_DEVICE_SECURITY_INFORMATION, informationlength : u32, returnlength : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 216:1: declaration Macro has no candidate rule
// windows_link::link!("wldp.dll" "system" fn WldpQueryDynamicCodeTrust(filehandle : super::super::Foundation:: HANDLE, baseimage : *const core::ffi::c_void, imagesize : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 217:1: declaration Macro has no candidate rule
// windows_link::link!("wldp.dll" "system" fn WldpSetDynamicCodeTrust(filehandle : super::super::Foundation:: HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 218:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn WritePrivateProfileSectionA(lpappname : windows_sys::core::PCSTR, lpstring : windows_sys::core::PCSTR, lpfilename : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 219:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn WritePrivateProfileSectionW(lpappname : windows_sys::core::PCWSTR, lpstring : windows_sys::core::PCWSTR, lpfilename : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 220:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn WritePrivateProfileStringA(lpappname : windows_sys::core::PCSTR, lpkeyname : windows_sys::core::PCSTR, lpstring : windows_sys::core::PCSTR, lpfilename : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 221:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn WritePrivateProfileStringW(lpappname : windows_sys::core::PCWSTR, lpkeyname : windows_sys::core::PCWSTR, lpstring : windows_sys::core::PCWSTR, lpfilename : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 222:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn WritePrivateProfileStructA(lpszsection : windows_sys::core::PCSTR, lpszkey : windows_sys::core::PCSTR, lpstruct : *const core::ffi::c_void, usizestruct : u32, szfile : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 223:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn WritePrivateProfileStructW(lpszsection : windows_sys::core::PCWSTR, lpszkey : windows_sys::core::PCWSTR, lpstruct : *const core::ffi::c_void, usizestruct : u32, szfile : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 224:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn WriteProfileSectionA(lpappname : windows_sys::core::PCSTR, lpstring : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 225:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn WriteProfileSectionW(lpappname : windows_sys::core::PCWSTR, lpstring : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 226:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn WriteProfileStringA(lpappname : windows_sys::core::PCSTR, lpkeyname : windows_sys::core::PCSTR, lpstring : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 227:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn WriteProfileStringW(lpappname : windows_sys::core::PCWSTR, lpkeyname : windows_sys::core::PCWSTR, lpstring : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 228:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn _hread(hfile : i32, lpbuffer : *mut core::ffi::c_void, lbytes : i32) -> i32);

// UNSUPPORTED Rust 229:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn _hwrite(hfile : i32, lpbuffer : windows_sys::core::PCSTR, lbytes : i32) -> i32);

// UNSUPPORTED Rust 230:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn _lclose(hfile : i32) -> i32);

// UNSUPPORTED Rust 231:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn _lcreat(lppathname : windows_sys::core::PCSTR, iattribute : i32) -> i32);

// UNSUPPORTED Rust 232:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn _llseek(hfile : i32, loffset : i32, iorigin : i32) -> i32);

// UNSUPPORTED Rust 233:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn _lopen(lppathname : windows_sys::core::PCSTR, ireadwrite : i32) -> i32);

// UNSUPPORTED Rust 234:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn _lread(hfile : i32, lpbuffer : *mut core::ffi::c_void, ubytes : u32) -> u32);

// UNSUPPORTED Rust 235:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn _lwrite(hfile : i32, lpbuffer : windows_sys::core::PCSTR, ubytes : u32) -> u32);

// UNSUPPORTED Rust 236:1: declaration Macro has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// windows_link::link!("kernel32.dll" "system" fn uaw_lstrcmpW(string1 : *const u16, string2 : *const u16) -> i32);

// UNSUPPORTED Rust 238:1: declaration Macro has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// windows_link::link!("kernel32.dll" "system" fn uaw_lstrcmpiW(string1 : *const u16, string2 : *const u16) -> i32);

// UNSUPPORTED Rust 240:1: declaration Macro has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// windows_link::link!("kernel32.dll" "system" fn uaw_lstrlenW(string : *const u16) -> i32);

// UNSUPPORTED Rust 242:1: declaration Macro has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// windows_link::link!("kernel32.dll" "system" fn uaw_wcschr(string : *const u16, character : u16) -> *mut u16);

// UNSUPPORTED Rust 244:1: declaration Macro has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// windows_link::link!("kernel32.dll" "system" fn uaw_wcscpy(destination : *mut u16, source : *const u16) -> *mut u16);

// UNSUPPORTED Rust 246:1: declaration Macro has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// windows_link::link!("kernel32.dll" "system" fn uaw_wcsicmp(string1 : *const u16, string2 : *const u16) -> i32);

// UNSUPPORTED Rust 248:1: declaration Macro has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// windows_link::link!("kernel32.dll" "system" fn uaw_wcslen(string : *const u16) -> usize);

// UNSUPPORTED Rust 250:1: declaration Macro has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// windows_link::link!("kernel32.dll" "system" fn uaw_wcsrchr(string : *const u16, character : u16) -> *mut u16);

public const val `AADBE_ADD_ENTRY`: UInt = 1u;
public const val `AADBE_DEL_ENTRY`: UInt = 2u;
public const val `ACTCTX_FLAG_APPLICATION_NAME_VALID`: UInt = 32u;
public const val `ACTCTX_FLAG_ASSEMBLY_DIRECTORY_VALID`: UInt = 4u;
public const val `ACTCTX_FLAG_HMODULE_VALID`: UInt = 128u;
public const val `ACTCTX_FLAG_LANGID_VALID`: UInt = 2u;
public const val `ACTCTX_FLAG_PROCESSOR_ARCHITECTURE_VALID`: UInt = 1u;
public const val `ACTCTX_FLAG_RESOURCE_NAME_VALID`: UInt = 8u;
public const val `ACTCTX_FLAG_SET_PROCESS_DEFAULT`: UInt = 16u;
public const val `ACTCTX_FLAG_SOURCE_IS_ASSEMBLYREF`: UInt = 64u;
// UNSUPPORTED Rust 262:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ACTCTX_SECTION_KEYED_DATA_2600 {
//     pub cbSize: u32,
//     pub ulDataFormatVersion: u32,
//     pub lpData: *mut core::ffi::c_void,
//     pub ulLength: u32,
//     pub lpSectionGlobalData: *mut core::ffi::c_void,
//     pub ulSectionGlobalDataLength: u32,
//     pub lpSectionBase: *mut core::ffi::c_void,
//     pub ulSectionTotalLength: u32,
//     pub hActCtx: super::super::Foundation::HANDLE,
//     pub ulAssemblyRosterIndex: u32,
// }

// UNSUPPORTED Rust 276:1: declaration Impl has no candidate rule
// impl Default for ACTCTX_SECTION_KEYED_DATA_2600 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 281:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ACTCTX_SECTION_KEYED_DATA_ASSEMBLY_METADATA {
//     pub lpInformation: *mut core::ffi::c_void,
//     pub lpSectionBase: *mut core::ffi::c_void,
//     pub ulSectionLength: u32,
//     pub lpSectionGlobalDataBase: *mut core::ffi::c_void,
//     pub ulSectionGlobalDataLength: u32,
// }

// UNSUPPORTED Rust 290:1: declaration Impl has no candidate rule
// impl Default for ACTCTX_SECTION_KEYED_DATA_ASSEMBLY_METADATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 295:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ACTIVATION_CONTEXT_BASIC_INFORMATION {
//     pub hActCtx: super::super::Foundation::HANDLE,
//     pub dwFlags: u32,
// }

// UNSUPPORTED Rust 301:1: declaration Impl has no candidate rule
// impl Default for ACTIVATION_CONTEXT_BASIC_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ACTIVATION_CONTEXT_BASIC_INFORMATION_DEFINED`: UInt = 1u;
public const val `AC_LINE_BACKUP_POWER`: UInt = 2u;
public const val `AC_LINE_OFFLINE`: UInt = 0u;
public const val `AC_LINE_ONLINE`: UInt = 1u;
public const val `AC_LINE_UNKNOWN`: UInt = 255u;
public const val `ADN_DEL_IF_EMPTY`: UInt = 1u;
public const val `ADN_DEL_UNC_PATHS`: UInt = 8u;
public const val `ADN_DONT_DEL_DIR`: UInt = 4u;
public const val `ADN_DONT_DEL_SUBDIRS`: UInt = 2u;
public const val `AFSR_BACKNEW`: UInt = 2u;
public const val `AFSR_EXTRAINCREFCNT`: UInt = 2048u;
public const val `AFSR_NODELETENEW`: UInt = 4u;
public const val `AFSR_NOMESSAGES`: UInt = 8u;
public const val `AFSR_NOPROGRESS`: UInt = 16u;
public const val `AFSR_RESTORE`: UInt = 1u;
public const val `AFSR_UPDREFCNT`: UInt = 512u;
public const val `AFSR_USEREFCNT`: UInt = 1024u;
public const val `AIF_FORCE_FILE_IN_USE`: UInt = 8u;
public const val `AIF_NOLANGUAGECHECK`: UInt = 268435456u;
public const val `AIF_NOOVERWRITE`: UInt = 16u;
public const val `AIF_NOSKIP`: UInt = 2u;
public const val `AIF_NOVERSIONCHECK`: UInt = 4u;
public const val `AIF_NO_VERSION_DIALOG`: UInt = 32u;
public const val `AIF_QUIET`: UInt = 536870912u;
public const val `AIF_REPLACEONLY`: UInt = 1024u;
public const val `AIF_WARNIFSKIP`: UInt = 1u;
public const val `ALINF_BKINSTALL`: UInt = 32u;
public const val `ALINF_CHECKBKDATA`: UInt = 128u;
public const val `ALINF_DELAYREGISTEROCX`: UInt = 512u;
public const val `ALINF_NGCONV`: UInt = 8u;
public const val `ALINF_QUIET`: UInt = 4u;
public const val `ALINF_ROLLBACK`: UInt = 64u;
public const val `ALINF_ROLLBKDOALL`: UInt = 256u;
public const val `ALINF_UPDHLPDLLS`: UInt = 16u;
// UNSUPPORTED Rust 340:1: generic scalar type unsupported
// pub type APPLICATION_RECOVERY_CALLBACK = Option<unsafe extern "system" fn(pvparameter: *mut core::ffi::c_void) -> u32>;

public const val `ARSR_NOMESSAGES`: UInt = 8u;
public const val `ARSR_REGSECTION`: UInt = 128u;
public const val `ARSR_REMOVREGBKDATA`: UInt = 4096u;
public const val `ARSR_RESTORE`: UInt = 1u;
public const val `ATOM_FLAG_GLOBAL`: UInt = 2u;
public const val `AT_ARP`: UInt = 640u;
public const val `AT_ENTITY`: `TDIENTITY_ENTITY_TYPE` = 640u;
public const val `AT_NULL`: UInt = 642u;
public const val `BACKUP_GHOSTED_FILE_EXTENTS`: UInt = 11u;
public const val `BACKUP_INVALID`: UInt = 0u;
public const val `BASE_SEARCH_PATH_DISABLE_SAFE_SEARCHMODE`: UInt = 65536u;
public const val `BASE_SEARCH_PATH_ENABLE_SAFE_SEARCHMODE`: UInt = 1u;
public const val `BASE_SEARCH_PATH_PERMANENT`: UInt = 32768u;
public const val `BATTERY_FLAG_CHARGING`: UInt = 8u;
public const val `BATTERY_FLAG_CRITICAL`: UInt = 4u;
public const val `BATTERY_FLAG_HIGH`: UInt = 1u;
public const val `BATTERY_FLAG_LOW`: UInt = 2u;
public const val `BATTERY_FLAG_NO_BATTERY`: UInt = 128u;
public const val `BATTERY_FLAG_UNKNOWN`: UInt = 255u;
public const val `BATTERY_LIFE_UNKNOWN`: UInt = 4294967295u;
public const val `BATTERY_PERCENTAGE_UNKNOWN`: UInt = 255u;
public const val `BAUD_075`: UInt = 1u;
public const val `BAUD_110`: UInt = 2u;
public const val `BAUD_115200`: UInt = 131072u;
public const val `BAUD_1200`: UInt = 64u;
public const val `BAUD_128K`: UInt = 65536u;
public const val `BAUD_134_5`: UInt = 4u;
public const val `BAUD_14400`: UInt = 4096u;
public const val `BAUD_150`: UInt = 8u;
public const val `BAUD_1800`: UInt = 128u;
public const val `BAUD_19200`: UInt = 8192u;
public const val `BAUD_2400`: UInt = 256u;
public const val `BAUD_300`: UInt = 16u;
public const val `BAUD_38400`: UInt = 16384u;
public const val `BAUD_4800`: UInt = 512u;
public const val `BAUD_56K`: UInt = 32768u;
public const val `BAUD_57600`: UInt = 262144u;
public const val `BAUD_600`: UInt = 32u;
public const val `BAUD_7200`: UInt = 1024u;
public const val `BAUD_9600`: UInt = 2048u;
public const val `BAUD_USER`: UInt = 268435456u;
// UNSUPPORTED Rust 382:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CABINFOA {
//     pub pszCab: windows_sys::core::PSTR,
//     pub pszInf: windows_sys::core::PSTR,
//     pub pszSection: windows_sys::core::PSTR,
//     pub szSrcPath: [i8; 260],
//     pub dwFlags: u32,
// }

// UNSUPPORTED Rust 391:1: declaration Impl has no candidate rule
// impl Default for CABINFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 396:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CABINFOW {
//     pub pszCab: windows_sys::core::PWSTR,
//     pub pszInf: windows_sys::core::PWSTR,
//     pub pszSection: windows_sys::core::PWSTR,
//     pub szSrcPath: [u16; 260],
//     pub dwFlags: u32,
// }

// UNSUPPORTED Rust 405:1: declaration Impl has no candidate rule
// impl Default for CABINFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 410:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CATID_DeleteBrowsingHistory: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x31caf6e4_d6aa_4090_a050_a5ac8972e9ef);

public const val `CBR_110`: UInt = 110u;
public const val `CBR_115200`: UInt = 115200u;
public const val `CBR_1200`: UInt = 1200u;
public const val `CBR_128000`: UInt = 128000u;
public const val `CBR_14400`: UInt = 14400u;
public const val `CBR_19200`: UInt = 19200u;
public const val `CBR_2400`: UInt = 2400u;
public const val `CBR_256000`: UInt = 256000u;
public const val `CBR_300`: UInt = 300u;
public const val `CBR_38400`: UInt = 38400u;
public const val `CBR_4800`: UInt = 4800u;
public const val `CBR_56000`: UInt = 56000u;
public const val `CBR_57600`: UInt = 57600u;
public const val `CBR_600`: UInt = 600u;
public const val `CBR_9600`: UInt = 9600u;
public const val `CE_DNS`: UInt = 2048u;
public const val `CE_IOE`: UInt = 1024u;
public const val `CE_MODE`: UInt = 32768u;
public const val `CE_OOP`: UInt = 4096u;
public const val `CE_PTO`: UInt = 512u;
public const val `CE_TXFULL`: UInt = 256u;
// UNSUPPORTED Rust 432:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLIENT_ID {
//     pub UniqueProcess: super::super::Foundation::HANDLE,
//     pub UniqueThread: super::super::Foundation::HANDLE,
// }

// UNSUPPORTED Rust 438:1: declaration Impl has no candidate rule
// impl Default for CLIENT_ID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CL_NL_ENTITY`: `TDIENTITY_ENTITY_TYPE` = 769u;
public const val `CL_NL_IP`: UInt = 771u;
public const val `CL_NL_IPX`: UInt = 769u;
public const val `CL_TL_ENTITY`: `TDIENTITY_ENTITY_TYPE` = 1025u;
public const val `CL_TL_NBF`: UInt = 1025u;
public const val `CL_TL_UDP`: UInt = 1027u;
public const val `CODEINTEGRITY_OPTION_DEBUGMODE_ENABLED`: UInt = 128u;
public const val `CODEINTEGRITY_OPTION_ENABLED`: UInt = 1u;
public const val `CODEINTEGRITY_OPTION_FLIGHTING_ENABLED`: UInt = 512u;
public const val `CODEINTEGRITY_OPTION_FLIGHT_BUILD`: UInt = 256u;
public const val `CODEINTEGRITY_OPTION_HVCI_IUM_ENABLED`: UInt = 8192u;
public const val `CODEINTEGRITY_OPTION_HVCI_KMCI_AUDITMODE_ENABLED`: UInt = 2048u;
public const val `CODEINTEGRITY_OPTION_HVCI_KMCI_ENABLED`: UInt = 1024u;
public const val `CODEINTEGRITY_OPTION_HVCI_KMCI_STRICTMODE_ENABLED`: UInt = 4096u;
public const val `CODEINTEGRITY_OPTION_PREPRODUCTION_BUILD`: UInt = 64u;
public const val `CODEINTEGRITY_OPTION_TESTSIGN`: UInt = 2u;
public const val `CODEINTEGRITY_OPTION_TEST_BUILD`: UInt = 32u;
public const val `CODEINTEGRITY_OPTION_UMCI_AUDITMODE_ENABLED`: UInt = 8u;
public const val `CODEINTEGRITY_OPTION_UMCI_ENABLED`: UInt = 4u;
public const val `CODEINTEGRITY_OPTION_UMCI_EXCLUSIONPATHS_ENABLED`: UInt = 16u;
public const val `COMMPROP_INITIALIZED`: UInt = 3879531822u;
public const val `CONTEXT_SIZE`: UInt = 16u;
public const val `CO_NL_ENTITY`: `TDIENTITY_ENTITY_TYPE` = 768u;
public const val `CO_TL_ENTITY`: `TDIENTITY_ENTITY_TYPE` = 1024u;
public const val `CO_TL_NBF`: UInt = 1024u;
public const val `CO_TL_SPP`: UInt = 1030u;
public const val `CO_TL_SPX`: UInt = 1026u;
public const val `CO_TL_TCP`: UInt = 1028u;
public const val `CP_DIRECT`: UInt = 2u;
public const val `CP_HWND`: UInt = 0u;
public const val `CP_LEVEL`: UInt = 3u;
public const val `CP_OPEN`: UInt = 1u;
public const val `CREATE_FOR_DIR`: UInt = 2u;
public const val `CREATE_FOR_IMPORT`: UInt = 1u;
public const val `CRITICAL_SECTION_NO_DEBUG_INFO`: UInt = 16777216u;
// UNSUPPORTED Rust 478:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CUSTOM_SYSTEM_EVENT_TRIGGER_CONFIG {
//     pub Size: u32,
//     pub TriggerId: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 484:1: declaration Impl has no candidate rule
// impl Default for CUSTOM_SYSTEM_EVENT_TRIGGER_CONFIG {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 489:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CameraUIControl: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x16d5a2be_b1c5_47b3_8eae_ccbcf452c7e8);

// UNSUPPORTED Rust 490:1: declaration Struct has no candidate rule
// #[repr(transparent)]
// #[derive(Clone, Copy)]
// pub struct CameraUIControlCaptureMode(pub i32);

// UNSUPPORTED Rust 493:1: declaration Impl has no candidate rule
// impl CameraUIControlCaptureMode {
//     pub const PhotoOrVideo: Self = Self(0i32);
//     pub const Photo: Self = Self(1i32);
//     pub const Video: Self = Self(2i32);
// }

// UNSUPPORTED Rust 498:1: declaration Struct has no candidate rule
// #[repr(transparent)]
// #[derive(Clone, Copy)]
// pub struct CameraUIControlLinearSelectionMode(pub i32);

// UNSUPPORTED Rust 501:1: declaration Impl has no candidate rule
// impl CameraUIControlLinearSelectionMode {
//     pub const Single: Self = Self(0i32);
//     pub const Multiple: Self = Self(1i32);
// }

// UNSUPPORTED Rust 505:1: declaration Struct has no candidate rule
// #[repr(transparent)]
// #[derive(Clone, Copy)]
// pub struct CameraUIControlMode(pub i32);

// UNSUPPORTED Rust 508:1: declaration Impl has no candidate rule
// impl CameraUIControlMode {
//     pub const Browse: Self = Self(0i32);
//     pub const Linear: Self = Self(1i32);
// }

// UNSUPPORTED Rust 512:1: declaration Struct has no candidate rule
// #[repr(transparent)]
// #[derive(Clone, Copy)]
// pub struct CameraUIControlPhotoFormat(pub i32);

// UNSUPPORTED Rust 515:1: declaration Impl has no candidate rule
// impl CameraUIControlPhotoFormat {
//     pub const Jpeg: Self = Self(0i32);
//     pub const Png: Self = Self(1i32);
//     pub const JpegXR: Self = Self(2i32);
// }

// UNSUPPORTED Rust 520:1: declaration Struct has no candidate rule
// #[repr(transparent)]
// #[derive(Clone, Copy)]
// pub struct CameraUIControlVideoFormat(pub i32);

// UNSUPPORTED Rust 523:1: declaration Impl has no candidate rule
// impl CameraUIControlVideoFormat {
//     pub const Mp4: Self = Self(0i32);
//     pub const Wmv: Self = Self(1i32);
// }

// UNSUPPORTED Rust 527:1: declaration Struct has no candidate rule
// #[repr(transparent)]
// #[derive(Clone, Copy)]
// pub struct CameraUIControlViewType(pub i32);

// UNSUPPORTED Rust 530:1: declaration Impl has no candidate rule
// impl CameraUIControlViewType {
//     pub const SingleItem: Self = Self(0i32);
//     pub const ItemList: Self = Self(1i32);
// }

// UNSUPPORTED Rust 534:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DATETIME {
//     pub year: u16,
//     pub month: u16,
//     pub day: u16,
//     pub hour: u16,
//     pub min: u16,
//     pub sec: u16,
// }

// UNSUPPORTED Rust 544:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DCICMD {
//     pub dwCommand: u32,
//     pub dwParam1: u32,
//     pub dwParam2: u32,
//     pub dwVersion: u32,
//     pub dwReserved: u32,
// }

// UNSUPPORTED Rust 553:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DCICREATEINPUT {
//     pub cmd: DCICMD,
//     pub dwCompression: u32,
//     pub dwMask: [u32; 3],
//     pub dwWidth: u32,
//     pub dwHeight: u32,
//     pub dwDCICaps: u32,
//     pub dwBitCount: u32,
//     pub lpSurface: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 565:1: declaration Impl has no candidate rule
// impl Default for DCICREATEINPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DCICREATEOFFSCREENSURFACE`: UInt = 2u;
public const val `DCICREATEOVERLAYSURFACE`: UInt = 3u;
public const val `DCICREATEPRIMARYSURFACE`: UInt = 1u;
// UNSUPPORTED Rust 573:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DCIENUMINPUT {
//     pub cmd: DCICMD,
//     pub rSrc: super::super::Foundation::RECT,
//     pub rDst: super::super::Foundation::RECT,
//     pub EnumCallback: isize,
//     pub lpContext: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 582:1: declaration Impl has no candidate rule
// impl Default for DCIENUMINPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DCIENUMSURFACE`: UInt = 4u;
public const val `DCIESCAPE`: UInt = 5u;
// UNSUPPORTED Rust 589:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DCIOFFSCREEN {
//     pub dciInfo: DCISURFACEINFO,
//     pub Draw: isize,
//     pub SetClipList: isize,
//     pub SetDestination: isize,
// }

// UNSUPPORTED Rust 597:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DCIOVERLAY {
//     pub dciInfo: DCISURFACEINFO,
//     pub dwChromakeyValue: u32,
//     pub dwChromakeyMask: u32,
// }

// UNSUPPORTED Rust 604:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DCISURFACEINFO {
//     pub dwSize: u32,
//     pub dwDCICaps: u32,
//     pub dwCompression: u32,
//     pub dwMask: [u32; 3],
//     pub dwWidth: u32,
//     pub dwHeight: u32,
//     pub lStride: i32,
//     pub dwBitCount: u32,
//     pub dwOffSurface: usize,
//     pub wSelSurface: u16,
//     pub wReserved: u16,
//     pub dwReserved1: u32,
//     pub dwReserved2: u32,
//     pub dwReserved3: u32,
//     pub BeginAccess: isize,
//     pub EndAccess: isize,
//     pub DestroySurface: isize,
// }

// UNSUPPORTED Rust 625:1: declaration Impl has no candidate rule
// impl Default for DCISURFACEINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DCI_1632_ACCESS`: UInt = 64u;
public const val `DCI_ASYNC`: UInt = 1024u;
public const val `DCI_CANOVERLAY`: UInt = 65536u;
public const val `DCI_CAN_STRETCHX`: UInt = 4096u;
public const val `DCI_CAN_STRETCHXN`: UInt = 16384u;
public const val `DCI_CAN_STRETCHY`: UInt = 8192u;
public const val `DCI_CAN_STRETCHYN`: UInt = 32768u;
public const val `DCI_CHROMAKEY`: UInt = 32u;
public const val `DCI_DWORDALIGN`: UInt = 256u;
public const val `DCI_DWORDSIZE`: UInt = 128u;
public const val `DCI_ERR_CURRENTLYNOTAVAIL`: Int = -5;
public const val `DCI_ERR_HEIGHTALIGN`: Int = -21;
public const val `DCI_ERR_INVALIDCLIPLIST`: Int = -15;
public const val `DCI_ERR_INVALIDPOSITION`: Int = -13;
public const val `DCI_ERR_INVALIDRECT`: Int = -6;
public const val `DCI_ERR_INVALIDSTRETCH`: Int = -14;
public const val `DCI_ERR_OUTOFMEMORY`: Int = -12;
public const val `DCI_ERR_SURFACEISOBSCURED`: Int = -16;
public const val `DCI_ERR_TOOBIGHEIGHT`: Int = -9;
public const val `DCI_ERR_TOOBIGSIZE`: Int = -11;
public const val `DCI_ERR_TOOBIGWIDTH`: Int = -10;
public const val `DCI_ERR_UNSUPPORTEDFORMAT`: Int = -7;
public const val `DCI_ERR_UNSUPPORTEDMASK`: Int = -8;
public const val `DCI_ERR_WIDTHALIGN`: Int = -20;
public const val `DCI_ERR_XALIGN`: Int = -17;
public const val `DCI_ERR_XYALIGN`: Int = -19;
public const val `DCI_ERR_YALIGN`: Int = -18;
public const val `DCI_FAIL_GENERIC`: Int = -1;
public const val `DCI_FAIL_INVALIDSURFACE`: Int = -3;
public const val `DCI_FAIL_UNSUPPORTED`: Int = -4;
public const val `DCI_FAIL_UNSUPPORTEDVERSION`: Int = -2;
public const val `DCI_OFFSCREEN`: UInt = 1u;
public const val `DCI_OK`: UInt = 0u;
public const val `DCI_OVERLAY`: UInt = 2u;
public const val `DCI_PRIMARY`: UInt = 0u;
public const val `DCI_STATUS_CHROMAKEYCHANGED`: UInt = 16u;
public const val `DCI_STATUS_FORMATCHANGED`: UInt = 4u;
public const val `DCI_STATUS_POINTERCHANGED`: UInt = 1u;
public const val `DCI_STATUS_STRIDECHANGED`: UInt = 2u;
public const val `DCI_STATUS_SURFACEINFOCHANGED`: UInt = 8u;
public const val `DCI_STATUS_WASSTILLDRAWING`: UInt = 32u;
public const val `DCI_SURFACE_TYPE`: UInt = 15u;
public const val `DCI_VERSION`: UInt = 256u;
public const val `DCI_VISIBLE`: UInt = 16u;
public const val `DCI_WRITEONLY`: UInt = 512u;
public const val `DEACTIVATE_ACTCTX_FLAG_FORCE_EARLY_DEACTIVATION`: UInt = 1u;
public typealias `DECISION_LOCATION` = Int;
public const val `DECISION_LOCATION_AUDIT`: `DECISION_LOCATION` = 2;
public const val `DECISION_LOCATION_ENFORCE_STATE_LIST`: `DECISION_LOCATION` = 7;
public const val `DECISION_LOCATION_ENTERPRISE_DEFINED_CLASS_ID`: `DECISION_LOCATION` = 4;
public const val `DECISION_LOCATION_FAILED_CONVERT_GUID`: `DECISION_LOCATION` = 3;
public const val `DECISION_LOCATION_GLOBAL_BUILT_IN_LIST`: `DECISION_LOCATION` = 5;
public const val `DECISION_LOCATION_NOT_FOUND`: `DECISION_LOCATION` = 8;
public const val `DECISION_LOCATION_PARAMETER_VALIDATION`: `DECISION_LOCATION` = 1;
public const val `DECISION_LOCATION_PROVIDER_BUILT_IN_LIST`: `DECISION_LOCATION` = 6;
public const val `DECISION_LOCATION_REFRESH_GLOBAL_DATA`: `DECISION_LOCATION` = 0;
public const val `DECISION_LOCATION_UNKNOWN`: `DECISION_LOCATION` = 9;
public const val `DELAYLOAD_GPA_FAILURE`: UInt = 4u;
// UNSUPPORTED Rust 688:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct DELAYLOAD_INFO {
//     pub Size: u32,
//     pub DelayloadDescriptor: *mut IMAGE_DELAYLOAD_DESCRIPTOR,
//     pub ThunkAddress: *mut IMAGE_THUNK_DATA32,
//     pub TargetDllName: windows_sys::core::PCSTR,
//     pub TargetApiDescriptor: DELAYLOAD_PROC_DESCRIPTOR,
//     pub TargetModuleBase: *mut core::ffi::c_void,
//     pub Unused: *mut core::ffi::c_void,
//     pub LastError: u32,
// }

// UNSUPPORTED Rust 701:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for DELAYLOAD_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 707:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct DELAYLOAD_INFO {
//     pub Size: u32,
//     pub DelayloadDescriptor: *mut IMAGE_DELAYLOAD_DESCRIPTOR,
//     pub ThunkAddress: *mut IMAGE_THUNK_DATA64,
//     pub TargetDllName: windows_sys::core::PCSTR,
//     pub TargetApiDescriptor: DELAYLOAD_PROC_DESCRIPTOR,
//     pub TargetModuleBase: *mut core::ffi::c_void,
//     pub Unused: *mut core::ffi::c_void,
//     pub LastError: u32,
// }

// UNSUPPORTED Rust 720:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for DELAYLOAD_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 726:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DELAYLOAD_PROC_DESCRIPTOR {
//     pub ImportDescribedByName: u32,
//     pub Description: DELAYLOAD_PROC_DESCRIPTOR_0,
// }

// UNSUPPORTED Rust 732:1: declaration Impl has no candidate rule
// impl Default for DELAYLOAD_PROC_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 737:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DELAYLOAD_PROC_DESCRIPTOR_0 {
//     pub Name: windows_sys::core::PCSTR,
//     pub Ordinal: u32,
// }

// UNSUPPORTED Rust 743:1: declaration Impl has no candidate rule
// impl Default for DELAYLOAD_PROC_DESCRIPTOR_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DELETE_BROWSING_HISTORY_COOKIES`: UInt = 2u;
public const val `DELETE_BROWSING_HISTORY_DOWNLOADHISTORY`: UInt = 64u;
public const val `DELETE_BROWSING_HISTORY_FORMDATA`: UInt = 8u;
public const val `DELETE_BROWSING_HISTORY_HISTORY`: UInt = 1u;
public const val `DELETE_BROWSING_HISTORY_PASSWORDS`: UInt = 16u;
public const val `DELETE_BROWSING_HISTORY_PRESERVEFAVORITES`: UInt = 32u;
public const val `DELETE_BROWSING_HISTORY_TIF`: UInt = 4u;
public const val `DOCKINFO_DOCKED`: UInt = 2u;
public const val `DOCKINFO_UNDOCKED`: UInt = 1u;
public const val `DOCKINFO_USER_SUPPLIED`: UInt = 4u;
public const val `DRIVE_CDROM`: UInt = 5u;
public const val `DRIVE_FIXED`: UInt = 3u;
public const val `DRIVE_NO_ROOT_DIR`: UInt = 1u;
public const val `DRIVE_RAMDISK`: UInt = 6u;
public const val `DRIVE_REMOTE`: UInt = 4u;
public const val `DRIVE_REMOVABLE`: UInt = 2u;
public const val `DRIVE_UNKNOWN`: UInt = 0u;
public const val `DTR_CONTROL_DISABLE`: UInt = 0u;
public const val `DTR_CONTROL_ENABLE`: UInt = 1u;
public const val `DTR_CONTROL_HANDSHAKE`: UInt = 2u;
// UNSUPPORTED Rust 768:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const DefaultBrowserSyncSettings: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3ac83423_3112_4aa6_9b5b_1feb23d0c5f9);

public const val `EFSRPC_SECURE_ONLY`: UInt = 8u;
public const val `EFS_DROP_ALTERNATE_STREAMS`: UInt = 16u;
public const val `EFS_USE_RECOVERY_KEYS`: UInt = 1u;
public const val `ENTITY_LIST_ID`: UInt = 0u;
public const val `ENTITY_TYPE_ID`: UInt = 1u;
// UNSUPPORTED Rust 774:1: generic scalar type unsupported
// pub type ENUM_CALLBACK = Option<unsafe extern "system" fn(lpsurfaceinfo: *mut DCISURFACEINFO, lpcontext: *mut core::ffi::c_void)>;

public const val `ER_ENTITY`: `TDIENTITY_ENTITY_TYPE` = 896u;
public const val `ER_ICMP`: UInt = 896u;
public const val `EVENTLOG_FULL_INFO`: UInt = 0u;
// UNSUPPORTED Rust 778:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const EditionUpgradeBroker: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc4270827_4f39_45df_9288_12ff6b85a921);

// UNSUPPORTED Rust 779:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const EditionUpgradeHelper: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x01776df3_b9af_4e50_9b1c_56e93116d704);

public const val `EndpointIoControlType`: `TDI_TL_IO_CONTROL_TYPE` = 0;
public const val `FAIL_FAST_GENERATE_EXCEPTION_ADDRESS`: UInt = 1u;
public const val `FAIL_FAST_NO_HARD_ERROR_DLG`: UInt = 2u;
public typealias `FEATURE_CHANGE_TIME` = Int;
public const val `FEATURE_CHANGE_TIME_MODULE_RELOAD`: `FEATURE_CHANGE_TIME` = 1;
public const val `FEATURE_CHANGE_TIME_READ`: `FEATURE_CHANGE_TIME` = 0;
public const val `FEATURE_CHANGE_TIME_REBOOT`: `FEATURE_CHANGE_TIME` = 3;
public const val `FEATURE_CHANGE_TIME_SESSION`: `FEATURE_CHANGE_TIME` = 2;
public typealias `FEATURE_ENABLED_STATE` = Int;
public const val `FEATURE_ENABLED_STATE_DEFAULT`: `FEATURE_ENABLED_STATE` = 0;
public const val `FEATURE_ENABLED_STATE_DISABLED`: `FEATURE_ENABLED_STATE` = 1;
public const val `FEATURE_ENABLED_STATE_ENABLED`: `FEATURE_ENABLED_STATE` = 2;
// UNSUPPORTED Rust 792:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FEATURE_ERROR {
//     pub hr: windows_sys::core::HRESULT,
//     pub lineNumber: u16,
//     pub file: windows_sys::core::PCSTR,
//     pub process: windows_sys::core::PCSTR,
//     pub module: windows_sys::core::PCSTR,
//     pub callerReturnAddressOffset: u32,
//     pub callerModule: windows_sys::core::PCSTR,
//     pub message: windows_sys::core::PCSTR,
//     pub originLineNumber: u16,
//     pub originFile: windows_sys::core::PCSTR,
//     pub originModule: windows_sys::core::PCSTR,
//     pub originCallerReturnAddressOffset: u32,
//     pub originCallerModule: windows_sys::core::PCSTR,
//     pub originName: windows_sys::core::PCSTR,
// }

// UNSUPPORTED Rust 810:1: declaration Impl has no candidate rule
// impl Default for FEATURE_ERROR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 815:1: non-scalar type Ptr unsupported
// pub type FEATURE_STATE_CHANGE_SUBSCRIPTION = *mut core::ffi::c_void;

public const val `FIBER_FLAG_FLOAT_SWITCH`: UInt = 1u;
public const val `FILE_CREATED`: UInt = 2u;
public const val `FILE_DIR_DISALLOWED`: UInt = 9u;
public const val `FILE_DOES_NOT_EXIST`: UInt = 5u;
public const val `FILE_ENCRYPTABLE`: UInt = 0u;
public const val `FILE_EXISTS`: UInt = 4u;
public const val `FILE_FLAG_IGNORE_IMPERSONATED_DEVICEMAP`: UInt = 131072u;
public const val `FILE_FLAG_OPEN_REQUIRING_OPLOCK`: UInt = 262144u;
public const val `FILE_IS_ENCRYPTED`: UInt = 1u;
public const val `FILE_MAXIMUM_DISPOSITION`: UInt = 5u;
public const val `FILE_NO_COMPRESSION`: UInt = 32768u;
public const val `FILE_OPENED`: UInt = 1u;
public const val `FILE_OPEN_NO_RECALL`: UInt = 4194304u;
public const val `FILE_OPEN_REMOTE_INSTANCE`: UInt = 1024u;
public const val `FILE_OVERWRITTEN`: UInt = 3u;
public const val `FILE_READ_ONLY`: UInt = 8u;
public const val `FILE_RENAME_FLAG_POSIX_SEMANTICS`: UInt = 2u;
public const val `FILE_RENAME_FLAG_REPLACE_IF_EXISTS`: UInt = 1u;
public const val `FILE_RENAME_FLAG_SUPPRESS_PIN_STATE_INHERITANCE`: UInt = 4u;
public const val `FILE_ROOT_DIR`: UInt = 3u;
public const val `FILE_SKIP_COMPLETION_PORT_ON_SUCCESS`: UInt = 1u;
public const val `FILE_SKIP_SET_EVENT_ON_HANDLE`: UInt = 2u;
public const val `FILE_SUPERSEDED`: UInt = 0u;
public const val `FILE_SYSTEM_ATTR`: UInt = 2u;
public const val `FILE_SYSTEM_DIR`: UInt = 4u;
public const val `FILE_SYSTEM_NOT_SUPPORT`: UInt = 6u;
public const val `FILE_UNKNOWN`: UInt = 5u;
public const val `FILE_USER_DISALLOWED`: UInt = 7u;
public const val `FILE_VALID_MAILSLOT_OPTION_FLAGS`: UInt = 50u;
public const val `FILE_VALID_OPTION_FLAGS`: UInt = 16777215u;
public const val `FILE_VALID_PIPE_OPTION_FLAGS`: UInt = 50u;
public const val `FILE_VALID_SET_FLAGS`: UInt = 54u;
public const val `FIND_ACTCTX_SECTION_KEY_RETURN_ASSEMBLY_METADATA`: UInt = 4u;
public const val `FIND_ACTCTX_SECTION_KEY_RETURN_FLAGS`: UInt = 2u;
public const val `FIND_ACTCTX_SECTION_KEY_RETURN_HACTCTX`: UInt = 1u;
public const val `FORMAT_MESSAGE_MAX_WIDTH_MASK`: UInt = 255u;
public const val `FS_CASE_IS_PRESERVED`: UInt = 2u;
public const val `FS_CASE_SENSITIVE`: UInt = 1u;
public const val `FS_FILE_COMPRESSION`: UInt = 16u;
public const val `FS_FILE_ENCRYPTION`: UInt = 131072u;
public const val `FS_PERSISTENT_ACLS`: UInt = 8u;
public const val `FS_UNICODE_STORED_ON_DISK`: UInt = 4u;
public const val `FS_VOL_IS_COMPRESSED`: UInt = 32768u;
public const val `GENERIC_ENTITY`: `TDIENTITY_ENTITY_TYPE` = 0u;
// UNSUPPORTED Rust 860:1: non-scalar type Ptr unsupported
// pub const GET_SYSTEM_WOW64_DIRECTORY_NAME_A_A: windows_sys::core::PCSTR = windows_sys::core::s!("GetSystemWow64DirectoryA");

// UNSUPPORTED Rust 861:1: non-scalar type Ptr unsupported
// pub const GET_SYSTEM_WOW64_DIRECTORY_NAME_A_T: windows_sys::core::PCWSTR = windows_sys::core::w!("GetSystemWow64DirectoryA");

// UNSUPPORTED Rust 862:1: non-scalar type Ptr unsupported
// pub const GET_SYSTEM_WOW64_DIRECTORY_NAME_A_W: windows_sys::core::PCWSTR = windows_sys::core::w!("GetSystemWow64DirectoryA");

// UNSUPPORTED Rust 863:1: non-scalar type Ptr unsupported
// pub const GET_SYSTEM_WOW64_DIRECTORY_NAME_T_A: windows_sys::core::PCWSTR = windows_sys::core::w!("GetSystemWow64DirectoryW");

// UNSUPPORTED Rust 864:1: non-scalar type Ptr unsupported
// pub const GET_SYSTEM_WOW64_DIRECTORY_NAME_T_T: windows_sys::core::PCWSTR = windows_sys::core::w!("GetSystemWow64DirectoryW");

// UNSUPPORTED Rust 865:1: non-scalar type Ptr unsupported
// pub const GET_SYSTEM_WOW64_DIRECTORY_NAME_T_W: windows_sys::core::PCWSTR = windows_sys::core::w!("GetSystemWow64DirectoryW");

// UNSUPPORTED Rust 866:1: non-scalar type Ptr unsupported
// pub const GET_SYSTEM_WOW64_DIRECTORY_NAME_W_A: windows_sys::core::PCSTR = windows_sys::core::s!("GetSystemWow64DirectoryW");

// UNSUPPORTED Rust 867:1: non-scalar type Ptr unsupported
// pub const GET_SYSTEM_WOW64_DIRECTORY_NAME_W_T: windows_sys::core::PCWSTR = windows_sys::core::w!("GetSystemWow64DirectoryW");

// UNSUPPORTED Rust 868:1: non-scalar type Ptr unsupported
// pub const GET_SYSTEM_WOW64_DIRECTORY_NAME_W_W: windows_sys::core::PCWSTR = windows_sys::core::w!("GetSystemWow64DirectoryW");

public const val `GMEM_DDESHARE`: UInt = 8192u;
public const val `GMEM_DISCARDABLE`: UInt = 256u;
public const val `GMEM_DISCARDED`: UInt = 16384u;
public const val `GMEM_INVALID_HANDLE`: UInt = 32768u;
public const val `GMEM_LOCKCOUNT`: UInt = 255u;
public const val `GMEM_LOWER`: UInt = 4096u;
public const val `GMEM_MODIFY`: UInt = 128u;
public const val `GMEM_NOCOMPACT`: UInt = 16u;
public const val `GMEM_NODISCARD`: UInt = 32u;
public const val `GMEM_NOTIFY`: UInt = 16384u;
public const val `GMEM_NOT_BANKED`: UInt = 4096u;
public const val `GMEM_SHARE`: UInt = 8192u;
public const val `GMEM_VALID_FLAGS`: UInt = 32626u;
public const val `GetSockOptIoControlType`: `TDI_TL_IO_CONTROL_TYPE` = 2;
public const val `HANJA_WINDOW`: UInt = 2u;
public const val `HINSTANCE_ERROR`: UInt = 32u;
// UNSUPPORTED Rust 885:1: non-scalar type Ptr unsupported
// pub type HWINWATCH = *mut core::ffi::c_void;

public const val `HW_PROFILE_GUIDLEN`: UInt = 39u;
// UNSUPPORTED Rust 887:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct HW_PROFILE_INFOA {
//     pub dwDockInfo: u32,
//     pub szHwProfileGuid: [i8; 39],
//     pub szHwProfileName: [i8; 80],
// }

// UNSUPPORTED Rust 894:1: declaration Impl has no candidate rule
// impl Default for HW_PROFILE_INFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 899:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct HW_PROFILE_INFOW {
//     pub dwDockInfo: u32,
//     pub szHwProfileGuid: [u16; 39],
//     pub szHwProfileName: [u16; 80],
// }

// UNSUPPORTED Rust 906:1: declaration Impl has no candidate rule
// impl Default for HW_PROFILE_INFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IE4_BACKNEW`: UInt = 2u;
public const val `IE4_EXTRAINCREFCNT`: UInt = 2048u;
public const val `IE4_FRDOALL`: UInt = 256u;
public const val `IE4_NODELETENEW`: UInt = 4u;
public const val `IE4_NOENUMKEY`: UInt = 32u;
public const val `IE4_NOMESSAGES`: UInt = 8u;
public const val `IE4_NOPROGRESS`: UInt = 16u;
public const val `IE4_NO_CRC_MAPPING`: UInt = 64u;
public const val `IE4_REGSECTION`: UInt = 128u;
public const val `IE4_REMOVREGBKDATA`: UInt = 4096u;
public const val `IE4_RESTORE`: UInt = 1u;
public const val `IE4_UPDREFCNT`: UInt = 512u;
public const val `IE4_USEREFCNT`: UInt = 1024u;
public const val `IE_BADID`: Int = -1;
public const val `IE_BAUDRATE`: Int = -12;
public const val `IE_BYTESIZE`: Int = -11;
public const val `IE_DEFAULT`: Int = -5;
public const val `IE_HARDWARE`: Int = -10;
public const val `IE_MEMORY`: Int = -4;
public const val `IE_NOPEN`: Int = -3;
public const val `IE_OPEN`: Int = -2;
public const val `IF_ENTITY`: `TDIENTITY_ENTITY_TYPE` = 512u;
public const val `IF_GENERIC`: UInt = 512u;
public const val `IF_MIB`: UInt = 514u;
public const val `IGNORE`: UInt = 0u;
// UNSUPPORTED Rust 936:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IMAGE_DELAYLOAD_DESCRIPTOR {
//     pub Attributes: IMAGE_DELAYLOAD_DESCRIPTOR_0,
//     pub DllNameRVA: u32,
//     pub ModuleHandleRVA: u32,
//     pub ImportAddressTableRVA: u32,
//     pub ImportNameTableRVA: u32,
//     pub BoundImportAddressTableRVA: u32,
//     pub UnloadInformationTableRVA: u32,
//     pub TimeDateStamp: u32,
// }

// UNSUPPORTED Rust 948:1: declaration Impl has no candidate rule
// impl Default for IMAGE_DELAYLOAD_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 953:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IMAGE_DELAYLOAD_DESCRIPTOR_0 {
//     pub AllAttributes: u32,
//     pub Anonymous: IMAGE_DELAYLOAD_DESCRIPTOR_0_0,
// }

// UNSUPPORTED Rust 959:1: declaration Impl has no candidate rule
// impl Default for IMAGE_DELAYLOAD_DESCRIPTOR_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 964:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IMAGE_DELAYLOAD_DESCRIPTOR_0_0 {
//     pub _bitfield: u32,
// }

// UNSUPPORTED Rust 969:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IMAGE_THUNK_DATA32 {
//     pub u1: IMAGE_THUNK_DATA32_0,
// }

// UNSUPPORTED Rust 974:1: declaration Impl has no candidate rule
// impl Default for IMAGE_THUNK_DATA32 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 979:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IMAGE_THUNK_DATA32_0 {
//     pub ForwarderString: u32,
//     pub Function: u32,
//     pub Ordinal: u32,
//     pub AddressOfData: u32,
// }

// UNSUPPORTED Rust 987:1: declaration Impl has no candidate rule
// impl Default for IMAGE_THUNK_DATA32_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 992:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IMAGE_THUNK_DATA64 {
//     pub u1: IMAGE_THUNK_DATA64_0,
// }

// UNSUPPORTED Rust 997:1: declaration Impl has no candidate rule
// impl Default for IMAGE_THUNK_DATA64 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1002:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IMAGE_THUNK_DATA64_0 {
//     pub ForwarderString: u64,
//     pub Function: u64,
//     pub Ordinal: u64,
//     pub AddressOfData: u64,
// }

// UNSUPPORTED Rust 1010:1: declaration Impl has no candidate rule
// impl Default for IMAGE_THUNK_DATA64_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IMEA_INIT`: UInt = 1u;
public const val `IMEA_NEXT`: UInt = 2u;
public const val `IMEA_PREV`: UInt = 3u;
// UNSUPPORTED Rust 1018:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IMEPROA {
//     pub hWnd: super::super::Foundation::HWND,
//     pub InstDate: DATETIME,
//     pub wVersion: u32,
//     pub szDescription: [u8; 50],
//     pub szName: [u8; 80],
//     pub szOptions: [u8; 30],
// }

// UNSUPPORTED Rust 1028:1: declaration Impl has no candidate rule
// impl Default for IMEPROA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1033:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IMEPROW {
//     pub hWnd: super::super::Foundation::HWND,
//     pub InstDate: DATETIME,
//     pub wVersion: u32,
//     pub szDescription: [u16; 50],
//     pub szName: [u16; 80],
//     pub szOptions: [u16; 30],
// }

// UNSUPPORTED Rust 1043:1: declaration Impl has no candidate rule
// impl Default for IMEPROW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1048:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IMESTRUCT {
//     pub fnc: u32,
//     pub wParam: super::super::Foundation::WPARAM,
//     pub wCount: u32,
//     pub dchSource: u32,
//     pub dchDest: u32,
//     pub lParam1: super::super::Foundation::LPARAM,
//     pub lParam2: super::super::Foundation::LPARAM,
//     pub lParam3: super::super::Foundation::LPARAM,
// }

public const val `IME_BANJAtoJUNJA`: UInt = 19u;
public const val `IME_ENABLE_CONVERT`: UInt = 2u;
public const val `IME_ENTERWORDREGISTERMODE`: UInt = 24u;
public const val `IME_GETCONVERSIONMODE`: UInt = 17u;
public const val `IME_GETIMECAPS`: UInt = 3u;
public const val `IME_GETOPEN`: UInt = 5u;
public const val `IME_GETVERSION`: UInt = 7u;
public const val `IME_JOHABtoKS`: UInt = 21u;
public const val `IME_JUNJAtoBANJA`: UInt = 20u;
public const val `IME_KStoJOHAB`: UInt = 22u;
public const val `IME_MAXPROCESS`: UInt = 32u;
public const val `IME_MODE_ALPHANUMERIC`: UInt = 1u;
public const val `IME_MODE_CODEINPUT`: UInt = 128u;
public const val `IME_MODE_DBCSCHAR`: UInt = 16u;
public const val `IME_MODE_HANJACONVERT`: UInt = 4u;
public const val `IME_MODE_HIRAGANA`: UInt = 4u;
public const val `IME_MODE_KATAKANA`: UInt = 2u;
public const val `IME_MODE_NOCODEINPUT`: UInt = 256u;
public const val `IME_MODE_NOROMAN`: UInt = 64u;
public const val `IME_MODE_ROMAN`: UInt = 32u;
public const val `IME_MODE_SBCSCHAR`: UInt = 2u;
public const val `IME_MOVEIMEWINDOW`: UInt = 8u;
public const val `IME_REQUEST_CONVERT`: UInt = 1u;
public const val `IME_RS_DISKERROR`: UInt = 14u;
public const val `IME_RS_ERROR`: UInt = 1u;
public const val `IME_RS_ILLEGAL`: UInt = 6u;
public const val `IME_RS_INVALID`: UInt = 17u;
public const val `IME_RS_NEST`: UInt = 18u;
public const val `IME_RS_NOIME`: UInt = 2u;
public const val `IME_RS_NOROOM`: UInt = 10u;
public const val `IME_RS_NOTFOUND`: UInt = 7u;
public const val `IME_RS_SYSTEMMODAL`: UInt = 19u;
public const val `IME_RS_TOOLONG`: UInt = 5u;
public const val `IME_SENDVKEY`: UInt = 19u;
public const val `IME_SETCONVERSIONFONTEX`: UInt = 25u;
public const val `IME_SETCONVERSIONMODE`: UInt = 16u;
public const val `IME_SETCONVERSIONWINDOW`: UInt = 8u;
public const val `IME_SETOPEN`: UInt = 4u;
public const val `IME_SET_MODE`: UInt = 18u;
public const val `INFO_CLASS_GENERIC`: UInt = 256u;
public const val `INFO_CLASS_IMPLEMENTATION`: UInt = 768u;
public const val `INFO_CLASS_PROTOCOL`: UInt = 512u;
public const val `INFO_TYPE_ADDRESS_OBJECT`: UInt = 512u;
public const val `INFO_TYPE_CONNECTION`: UInt = 768u;
public const val `INFO_TYPE_PROVIDER`: UInt = 256u;
public const val `INTERIM_WINDOW`: UInt = 0u;
public const val `INVALID_ENTITY_INSTANCE`: Int = -1;
public const val `IOCTL_TDI_TL_IO_CONTROL_ENDPOINT`: UInt = 2162744u;
public const val `IR_CHANGECONVERT`: UInt = 289u;
public const val `IR_CLOSECONVERT`: UInt = 290u;
public const val `IR_DBCSCHAR`: UInt = 352u;
public const val `IR_FULLCONVERT`: UInt = 291u;
public const val `IR_IMESELECT`: UInt = 304u;
public const val `IR_MODEINFO`: UInt = 400u;
public const val `IR_OPENCONVERT`: UInt = 288u;
public const val `IR_STRING`: UInt = 320u;
public const val `IR_STRINGEND`: UInt = 257u;
public const val `IR_STRINGEX`: UInt = 384u;
public const val `IR_STRINGSTART`: UInt = 256u;
public const val `IR_UNDETERMINE`: UInt = 368u;
// UNSUPPORTED Rust 1120:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct JAVA_TRUST {
//     pub cbSize: u32,
//     pub flag: u32,
//     pub fAllActiveXPermissions: windows_sys::core::BOOL,
//     pub fAllPermissions: windows_sys::core::BOOL,
//     pub dwEncodingType: u32,
//     pub pbJavaPermissions: *mut u8,
//     pub cbJavaPermissions: u32,
//     pub pbSigner: *mut u8,
//     pub cbSigner: u32,
//     pub pwszZone: windows_sys::core::PCWSTR,
//     pub guidZone: windows_sys::core::GUID,
//     pub hVerify: windows_sys::core::HRESULT,
// }

// UNSUPPORTED Rust 1136:1: declaration Impl has no candidate rule
// impl Default for JAVA_TRUST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1141:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct JIT_DEBUG_INFO {
//     pub dwSize: u32,
//     pub dwProcessorArchitecture: u32,
//     pub dwThreadID: u32,
//     pub dwReserved0: u32,
//     pub lpExceptionAddress: u64,
//     pub lpExceptionRecord: u64,
//     pub lpContextRecord: u64,
// }

public const val `KEY_ALL_KEYS`: `WLDP_KEY` = 2;
public const val `KEY_OVERRIDE`: `WLDP_KEY` = 1;
public const val `KEY_UNKNOWN`: `WLDP_KEY` = 0;
// UNSUPPORTED Rust 1155:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Kernel")]
// #[derive(Clone, Copy)]
// pub struct LDR_DATA_TABLE_ENTRY {
//     pub Reserved1: [*mut core::ffi::c_void; 2],
//     pub InMemoryOrderLinks: super::Kernel::LIST_ENTRY,
//     pub Reserved2: [*mut core::ffi::c_void; 2],
//     pub DllBase: *mut core::ffi::c_void,
//     pub Reserved3: [*mut core::ffi::c_void; 2],
//     pub FullDllName: super::super::Foundation::UNICODE_STRING,
//     pub Reserved4: [u8; 8],
//     pub Reserved5: [*mut core::ffi::c_void; 3],
//     pub Anonymous: LDR_DATA_TABLE_ENTRY_0,
//     pub TimeDateStamp: u32,
// }

// UNSUPPORTED Rust 1170:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Kernel")]
// impl Default for LDR_DATA_TABLE_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1176:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Kernel")]
// #[derive(Clone, Copy)]
// pub union LDR_DATA_TABLE_ENTRY_0 {
//     pub CheckSum: u32,
//     pub Reserved6: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 1183:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Kernel")]
// impl Default for LDR_DATA_TABLE_ENTRY_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `LIS_NOGRPCONV`: UInt = 2u;
public const val `LIS_QUIET`: UInt = 1u;
public const val `LOGON32_PROVIDER_VIRTUAL`: UInt = 4u;
public const val `LOGON32_PROVIDER_WINNT35`: UInt = 1u;
public const val `LOGON_ZERO_PASSWORD_BUFFER`: UInt = 2147483648u;
public const val `LPTx`: UInt = 128u;
public const val `MAXINTATOM`: UInt = 49152u;
public const val `MAX_COMPUTERNAME_LENGTH`: UInt = 15u;
public const val `MAX_TDI_ENTITIES`: UInt = 4096u;
public const val `MCW_DEFAULT`: UInt = 0u;
public const val `MCW_HIDDEN`: UInt = 16u;
public const val `MCW_RECT`: UInt = 1u;
public const val `MCW_SCREEN`: UInt = 4u;
public const val `MCW_VERTICAL`: UInt = 8u;
public const val `MCW_WINDOW`: UInt = 2u;
public const val `MICROSOFT_WINBASE_H_DEFINE_INTERLOCKED_CPLUSPLUS_OVERLOADS`: UInt = 0u;
public const val `MICROSOFT_WINDOWS_WINBASE_H_DEFINE_INTERLOCKED_CPLUSPLUS_OVERLOADS`: UInt = 0u;
public const val `MODE_WINDOW`: UInt = 1u;
public const val `OFS_MAXPATHNAME`: UInt = 128u;
public const val `OPERATION_API_VERSION`: UInt = 1u;
public const val `OVERWRITE_HIDDEN`: UInt = 4u;
public const val `PCF_16BITMODE`: UInt = 512u;
public const val `PCF_DTRDSR`: UInt = 1u;
public const val `PCF_INTTIMEOUTS`: UInt = 128u;
public const val `PCF_PARITY_CHECK`: UInt = 8u;
public const val `PCF_RLSD`: UInt = 4u;
public const val `PCF_RTSCTS`: UInt = 2u;
public const val `PCF_SETXCHAR`: UInt = 32u;
public const val `PCF_SPECIALCHARS`: UInt = 256u;
public const val `PCF_TOTALTIMEOUTS`: UInt = 64u;
public const val `PCF_XONXOFF`: UInt = 16u;
// UNSUPPORTED Rust 1220:1: generic scalar type unsupported
// pub type PDELAYLOAD_FAILURE_DLL_CALLBACK = Option<unsafe extern "system" fn(notificationreason: u32, delayloadinfo: *const DELAYLOAD_INFO) -> *mut core::ffi::c_void>;

// UNSUPPORTED Rust 1221:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PERUSERSECTIONA {
//     pub szGUID: [i8; 59],
//     pub szDispName: [i8; 128],
//     pub szLocale: [i8; 10],
//     pub szStub: [i8; 1040],
//     pub szVersion: [i8; 32],
//     pub szCompID: [i8; 128],
//     pub dwIsInstalled: u32,
//     pub bRollback: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 1233:1: declaration Impl has no candidate rule
// impl Default for PERUSERSECTIONA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1238:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PERUSERSECTIONW {
//     pub szGUID: [u16; 59],
//     pub szDispName: [u16; 128],
//     pub szLocale: [u16; 10],
//     pub szStub: [u16; 1040],
//     pub szVersion: [u16; 32],
//     pub szCompID: [u16; 128],
//     pub dwIsInstalled: u32,
//     pub bRollback: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 1250:1: declaration Impl has no candidate rule
// impl Default for PERUSERSECTIONW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1255:1: generic scalar type unsupported
// pub type PFEATURE_STATE_CHANGE_CALLBACK = Option<unsafe extern "system" fn(context: *const core::ffi::c_void)>;

// UNSUPPORTED Rust 1256:1: generic scalar type unsupported
// pub type PFIBER_CALLOUT_ROUTINE = Option<unsafe extern "system" fn(lpparameter: *mut core::ffi::c_void) -> *mut core::ffi::c_void>;

// UNSUPPORTED Rust 1257:1: generic scalar type unsupported
// pub type PQUERYACTCTXW_FUNC = Option<unsafe extern "system" fn(dwflags: u32, hactctx: super::super::Foundation::HANDLE, pvsubinstance: *const core::ffi::c_void, ulinfoclass: u32, pvbuffer: *mut core::ffi::c_void, cbbuffer: usize, pcbwrittenorrequired: *mut usize) -> windows_sys::core::BOOL>;

public const val `PROCESS_CREATION_ALL_APPLICATION_PACKAGES_OPT_OUT`: UInt = 1u;
public const val `PROCESS_CREATION_CHILD_PROCESS_OVERRIDE`: UInt = 2u;
public const val `PROCESS_CREATION_CHILD_PROCESS_RESTRICTED`: UInt = 1u;
public const val `PROCESS_CREATION_CHILD_PROCESS_RESTRICTED_UNLESS_SECURE`: UInt = 4u;
public const val `PROCESS_CREATION_DESKTOP_APP_BREAKAWAY_DISABLE_PROCESS_TREE`: UInt = 2u;
public const val `PROCESS_CREATION_DESKTOP_APP_BREAKAWAY_ENABLE_PROCESS_TREE`: UInt = 1u;
public const val `PROCESS_CREATION_DESKTOP_APP_BREAKAWAY_OVERRIDE`: UInt = 4u;
public const val `PROCESS_CREATION_MITIGATION_POLICY_DEP_ATL_THUNK_ENABLE`: UInt = 2u;
public const val `PROCESS_CREATION_MITIGATION_POLICY_DEP_ENABLE`: UInt = 1u;
public const val `PROCESS_CREATION_MITIGATION_POLICY_SEHOP_ENABLE`: UInt = 4u;
public const val `PROC_THREAD_ATTRIBUTE_ADDITIVE`: UInt = 262144u;
public const val `PROC_THREAD_ATTRIBUTE_INPUT`: UInt = 131072u;
public const val `PROC_THREAD_ATTRIBUTE_NUMBER`: UInt = 65535u;
public const val `PROC_THREAD_ATTRIBUTE_THREAD`: UInt = 65536u;
public const val `PROTECTION_LEVEL_SAME`: UInt = 4294967295u;
public const val `PST_FAX`: UInt = 33u;
public const val `PST_LAT`: UInt = 257u;
public const val `PST_MODEM`: UInt = 6u;
public const val `PST_NETWORK_BRIDGE`: UInt = 256u;
public const val `PST_PARALLELPORT`: UInt = 2u;
public const val `PST_RS232`: UInt = 1u;
public const val `PST_RS422`: UInt = 3u;
public const val `PST_RS423`: UInt = 4u;
public const val `PST_RS449`: UInt = 5u;
public const val `PST_SCANNER`: UInt = 34u;
public const val `PST_TCPIP_TELNET`: UInt = 258u;
public const val `PST_UNSPECIFIED`: UInt = 0u;
public const val `PST_X25`: UInt = 259u;
// UNSUPPORTED Rust 1286:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PUBLIC_OBJECT_BASIC_INFORMATION {
//     pub Attributes: u32,
//     pub GrantedAccess: u32,
//     pub HandleCount: u32,
//     pub PointerCount: u32,
//     pub Reserved: [u32; 10],
// }

// UNSUPPORTED Rust 1295:1: declaration Impl has no candidate rule
// impl Default for PUBLIC_OBJECT_BASIC_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1300:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PUBLIC_OBJECT_TYPE_INFORMATION {
//     pub TypeName: super::super::Foundation::UNICODE_STRING,
//     pub Reserved: [u32; 22],
// }

// UNSUPPORTED Rust 1306:1: declaration Impl has no candidate rule
// impl Default for PUBLIC_OBJECT_TYPE_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1311:1: generic scalar type unsupported
// pub type PWINSTATIONQUERYINFORMATIONW = Option<unsafe extern "system" fn(param0: super::super::Foundation::HANDLE, param1: u32, param2: WINSTATIONINFOCLASS, param3: *mut core::ffi::c_void, param4: u32, param5: *mut u32) -> bool>;

// UNSUPPORTED Rust 1312:1: generic scalar type unsupported
// pub type PWLDP_CANEXECUTEBUFFER_API = Option<unsafe extern "system" fn(host: *const windows_sys::core::GUID, options: WLDP_EXECUTION_EVALUATION_OPTIONS, buffer: *const u8, buffersize: u32, auditinfo: windows_sys::core::PCWSTR, result: *mut WLDP_EXECUTION_POLICY) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 1313:1: generic scalar type unsupported
// pub type PWLDP_CANEXECUTEFILE_API = Option<unsafe extern "system" fn(host: *const windows_sys::core::GUID, options: WLDP_EXECUTION_EVALUATION_OPTIONS, filehandle: super::super::Foundation::HANDLE, auditinfo: windows_sys::core::PCWSTR, result: *mut WLDP_EXECUTION_POLICY) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 1314:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Com")]
// pub type PWLDP_CANEXECUTESTREAM_API = Option<unsafe extern "system" fn(host: *const windows_sys::core::GUID, options: WLDP_EXECUTION_EVALUATION_OPTIONS, stream: *mut core::ffi::c_void, auditinfo: windows_sys::core::PCWSTR, result: *mut WLDP_EXECUTION_POLICY) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 1316:1: generic scalar type unsupported
// pub type PWLDP_ISAPPAPPROVEDBYPOLICY_API = Option<unsafe extern "system" fn(packagefamilyname: windows_sys::core::PCWSTR, packageversion: u64) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 1317:1: generic scalar type unsupported
// pub type PWLDP_ISDYNAMICCODEPOLICYENABLED_API = Option<unsafe extern "system" fn(pbenabled: *mut windows_sys::core::BOOL) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 1318:1: generic scalar type unsupported
// pub type PWLDP_ISPRODUCTIONCONFIGURATION_API = Option<unsafe extern "system" fn(isproductionconfiguration: *mut windows_sys::core::BOOL) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 1319:1: generic scalar type unsupported
// pub type PWLDP_ISWCOSPRODUCTIONCONFIGURATION_API = Option<unsafe extern "system" fn(isproductionconfiguration: *mut windows_sys::core::BOOL) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 1320:1: generic scalar type unsupported
// pub type PWLDP_QUERYDEVICESECURITYINFORMATION_API = Option<unsafe extern "system" fn(information: *mut WLDP_DEVICE_SECURITY_INFORMATION, informationlength: u32, returnlength: *mut u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 1321:1: generic scalar type unsupported
// pub type PWLDP_QUERYDYNAMICODETRUST_API = Option<unsafe extern "system" fn(filehandle: super::super::Foundation::HANDLE, baseimage: *const core::ffi::c_void, imagesize: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 1322:1: generic scalar type unsupported
// pub type PWLDP_QUERYPOLICYSETTINGENABLED2_API = Option<unsafe extern "system" fn(setting: windows_sys::core::PCWSTR, enabled: *mut windows_sys::core::BOOL) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 1323:1: generic scalar type unsupported
// pub type PWLDP_QUERYPOLICYSETTINGENABLED_API = Option<unsafe extern "system" fn(setting: WLDP_POLICY_SETTING, enabled: *mut windows_sys::core::BOOL) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 1324:1: generic scalar type unsupported
// pub type PWLDP_QUERYWINDOWSLOCKDOWNMODE_API = Option<unsafe extern "system" fn(lockdownmode: *mut WLDP_WINDOWS_LOCKDOWN_MODE) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 1325:1: generic scalar type unsupported
// pub type PWLDP_QUERYWINDOWSLOCKDOWNRESTRICTION_API = Option<unsafe extern "system" fn(lockdownrestriction: *mut WLDP_WINDOWS_LOCKDOWN_RESTRICTION) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 1326:1: generic scalar type unsupported
// pub type PWLDP_RESETPRODUCTIONCONFIGURATION_API = Option<unsafe extern "system" fn() -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 1327:1: generic scalar type unsupported
// pub type PWLDP_RESETWCOSPRODUCTIONCONFIGURATION_API = Option<unsafe extern "system" fn() -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 1328:1: generic scalar type unsupported
// pub type PWLDP_SETDYNAMICCODETRUST_API = Option<unsafe extern "system" fn(hfilehandle: super::super::Foundation::HANDLE) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 1329:1: generic scalar type unsupported
// pub type PWLDP_SETWINDOWSLOCKDOWNRESTRICTION_API = Option<unsafe extern "system" fn(lockdownrestriction: WLDP_WINDOWS_LOCKDOWN_RESTRICTION) -> windows_sys::core::HRESULT>;

public const val `QUERY_ACTCTX_FLAG_ACTCTX_IS_ADDRESS`: UInt = 16u;
public const val `QUERY_ACTCTX_FLAG_ACTCTX_IS_HMODULE`: UInt = 8u;
public const val `QUERY_ACTCTX_FLAG_NO_ADDREF`: UInt = 2147483648u;
public const val `QUERY_ACTCTX_FLAG_USE_ACTIVE_ACTCTX`: UInt = 4u;
public const val `RECOVERY_DEFAULT_PING_INTERVAL`: UInt = 5000u;
// UNSUPPORTED Rust 1335:1: generic scalar type unsupported
// pub type REGINSTALLA = Option<unsafe extern "system" fn(hm: super::super::Foundation::HMODULE, pszsection: windows_sys::core::PCSTR, psttable: *const STRTABLEA) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 1336:1: non-scalar type Ptr unsupported
// pub const REG_RESTORE_LOG_KEY: windows_sys::core::PCWSTR = windows_sys::core::w!("RegRestoreLogFile");

// UNSUPPORTED Rust 1337:1: non-scalar type Ptr unsupported
// pub const REG_SAVE_LOG_KEY: windows_sys::core::PCWSTR = windows_sys::core::w!("RegSaveLogFile");

public const val `REMOTE_PROTOCOL_INFO_FLAG_LOOPBACK`: UInt = 1u;
public const val `REMOTE_PROTOCOL_INFO_FLAG_OFFLINE`: UInt = 2u;
public const val `REMOTE_PROTOCOL_INFO_FLAG_PERSISTENT_HANDLE`: UInt = 4u;
public const val `RESETDEV`: UInt = 7u;
public const val `RESTART_MAX_CMD_LINE`: UInt = 1024u;
public const val `RPI_FLAG_SMB2_SHARECAP_CLUSTER`: UInt = 64u;
public const val `RPI_FLAG_SMB2_SHARECAP_CONTINUOUS_AVAILABILITY`: UInt = 16u;
public const val `RPI_FLAG_SMB2_SHARECAP_DFS`: UInt = 8u;
public const val `RPI_FLAG_SMB2_SHARECAP_SCALEOUT`: UInt = 32u;
public const val `RPI_FLAG_SMB2_SHARECAP_TIMEWARP`: UInt = 2u;
public const val `RPI_SMB2_FLAG_SERVERCAP_DFS`: UInt = 1u;
public const val `RPI_SMB2_FLAG_SERVERCAP_DIRECTORY_LEASING`: UInt = 32u;
public const val `RPI_SMB2_FLAG_SERVERCAP_LARGEMTU`: UInt = 4u;
public const val `RPI_SMB2_FLAG_SERVERCAP_LEASING`: UInt = 2u;
public const val `RPI_SMB2_FLAG_SERVERCAP_MULTICHANNEL`: UInt = 8u;
public const val `RPI_SMB2_FLAG_SERVERCAP_PERSISTENT_HANDLES`: UInt = 16u;
public const val `RPI_SMB2_SHAREFLAG_COMPRESS_DATA`: UInt = 2u;
public const val `RPI_SMB2_SHAREFLAG_ENCRYPT_DATA`: UInt = 1u;
public const val `RSC_FLAG_DELAYREGISTEROCX`: UInt = 512u;
public const val `RSC_FLAG_INF`: UInt = 1u;
public const val `RSC_FLAG_NGCONV`: UInt = 8u;
public const val `RSC_FLAG_QUIET`: UInt = 4u;
public const val `RSC_FLAG_SETUPAPI`: UInt = 1024u;
public const val `RSC_FLAG_SKIPDISKSPACECHECK`: UInt = 2u;
public const val `RSC_FLAG_UPDHLPDLLS`: UInt = 16u;
public const val `RTS_CONTROL_DISABLE`: UInt = 0u;
public const val `RTS_CONTROL_ENABLE`: UInt = 1u;
public const val `RTS_CONTROL_HANDSHAKE`: UInt = 2u;
public const val `RTS_CONTROL_TOGGLE`: UInt = 3u;
public const val `RUNCMDS_DELAYPOSTCMD`: UInt = 4u;
public const val `RUNCMDS_NOWAIT`: UInt = 2u;
public const val `RUNCMDS_QUIET`: UInt = 1u;
public const val `SCS_32BIT_BINARY`: UInt = 0u;
public const val `SCS_64BIT_BINARY`: UInt = 6u;
public const val `SCS_DOS_BINARY`: UInt = 1u;
public const val `SCS_OS216_BINARY`: UInt = 5u;
public const val `SCS_PIF_BINARY`: UInt = 3u;
public const val `SCS_POSIX_BINARY`: UInt = 4u;
public const val `SCS_THIS_PLATFORM_BINARY`: UInt = 6u;
public const val `SCS_WOW_BINARY`: UInt = 2u;
public const val `SHUTDOWN_NORETRY`: UInt = 1u;
public const val `SP_BAUD`: UInt = 2u;
public const val `SP_DATABITS`: UInt = 4u;
public const val `SP_HANDSHAKING`: UInt = 16u;
public const val `SP_PARITY`: UInt = 1u;
public const val `SP_PARITY_CHECK`: UInt = 32u;
public const val `SP_RLSD`: UInt = 64u;
public const val `SP_SERIALCOMM`: UInt = 1u;
public const val `SP_STOPBITS`: UInt = 8u;
public const val `STARTF_HOLOGRAPHIC`: UInt = 262144u;
public const val `STORAGE_INFO_FLAGS_ALIGNED_DEVICE`: UInt = 1u;
public const val `STORAGE_INFO_FLAGS_PARTITION_ALIGNED_ON_DEVICE`: UInt = 2u;
public const val `STORAGE_INFO_OFFSET_UNKNOWN`: UInt = 4294967295u;
public const val `STREAM_CONTAINS_GHOSTED_FILE_EXTENTS`: UInt = 16u;
public const val `STREAM_CONTAINS_PROPERTIES`: UInt = 4u;
public const val `STREAM_CONTAINS_SECURITY`: UInt = 2u;
public const val `STREAM_MODIFIED_WHEN_READ`: UInt = 1u;
public const val `STREAM_NORMAL_ATTRIBUTE`: UInt = 0u;
public const val `STREAM_SPARSE_ATTRIBUTE`: UInt = 8u;
// UNSUPPORTED Rust 1397:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct STRENTRYA {
//     pub pszName: windows_sys::core::PSTR,
//     pub pszValue: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 1403:1: declaration Impl has no candidate rule
// impl Default for STRENTRYA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1408:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct STRENTRYW {
//     pub pszName: windows_sys::core::PWSTR,
//     pub pszValue: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 1414:1: declaration Impl has no candidate rule
// impl Default for STRENTRYW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1419:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct STRINGEXSTRUCT {
//     pub dwSize: u32,
//     pub uDeterminePos: u32,
//     pub uDetermineDelimPos: u32,
//     pub uYomiPos: u32,
//     pub uYomiDelimPos: u32,
// }

// UNSUPPORTED Rust 1428:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct STRTABLEA {
//     pub cEntries: u32,
//     pub pse: *mut STRENTRYA,
// }

// UNSUPPORTED Rust 1434:1: declaration Impl has no candidate rule
// impl Default for STRTABLEA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1439:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct STRTABLEW {
//     pub cEntries: u32,
//     pub pse: *mut STRENTRYW,
// }

// UNSUPPORTED Rust 1445:1: declaration Impl has no candidate rule
// impl Default for STRTABLEW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1450:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SYSTEM_BASIC_INFORMATION {
//     pub Reserved1: [u8; 24],
//     pub Reserved2: [*mut core::ffi::c_void; 4],
//     pub NumberOfProcessors: i8,
// }

// UNSUPPORTED Rust 1457:1: declaration Impl has no candidate rule
// impl Default for SYSTEM_BASIC_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1462:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SYSTEM_CODEINTEGRITY_INFORMATION {
//     pub Length: u32,
//     pub CodeIntegrityOptions: u32,
// }

// UNSUPPORTED Rust 1468:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SYSTEM_EXCEPTION_INFORMATION {
//     pub Reserved1: [u8; 16],
// }

// UNSUPPORTED Rust 1473:1: declaration Impl has no candidate rule
// impl Default for SYSTEM_EXCEPTION_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1478:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SYSTEM_INTERRUPT_INFORMATION {
//     pub Reserved1: [u8; 24],
// }

// UNSUPPORTED Rust 1483:1: declaration Impl has no candidate rule
// impl Default for SYSTEM_INTERRUPT_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1488:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SYSTEM_LOOKASIDE_INFORMATION {
//     pub Reserved1: [u8; 32],
// }

// UNSUPPORTED Rust 1493:1: declaration Impl has no candidate rule
// impl Default for SYSTEM_LOOKASIDE_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1498:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SYSTEM_PERFORMANCE_INFORMATION {
//     pub Reserved1: [u8; 312],
// }

// UNSUPPORTED Rust 1503:1: declaration Impl has no candidate rule
// impl Default for SYSTEM_PERFORMANCE_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1508:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SYSTEM_POLICY_INFORMATION {
//     pub Reserved1: [*mut core::ffi::c_void; 2],
//     pub Reserved2: [u32; 3],
// }

// UNSUPPORTED Rust 1514:1: declaration Impl has no candidate rule
// impl Default for SYSTEM_POLICY_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1519:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SYSTEM_PROCESSOR_PERFORMANCE_INFORMATION {
//     pub IdleTime: i64,
//     pub KernelTime: i64,
//     pub UserTime: i64,
//     pub Reserved1: [i64; 2],
//     pub Reserved2: u32,
// }

// UNSUPPORTED Rust 1528:1: declaration Impl has no candidate rule
// impl Default for SYSTEM_PROCESSOR_PERFORMANCE_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1533:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SYSTEM_PROCESS_INFORMATION {
//     pub NextEntryOffset: u32,
//     pub NumberOfThreads: u32,
//     pub Reserved1: [u8; 48],
//     pub ImageName: super::super::Foundation::UNICODE_STRING,
//     pub BasePriority: i32,
//     pub UniqueProcessId: super::super::Foundation::HANDLE,
//     pub Reserved2: *mut core::ffi::c_void,
//     pub HandleCount: u32,
//     pub SessionId: u32,
//     pub Reserved3: *mut core::ffi::c_void,
//     pub PeakVirtualSize: usize,
//     pub VirtualSize: usize,
//     pub Reserved4: u32,
//     pub PeakWorkingSetSize: usize,
//     pub WorkingSetSize: usize,
//     pub Reserved5: *mut core::ffi::c_void,
//     pub QuotaPagedPoolUsage: usize,
//     pub Reserved6: *mut core::ffi::c_void,
//     pub QuotaNonPagedPoolUsage: usize,
//     pub PagefileUsage: usize,
//     pub PeakPagefileUsage: usize,
//     pub PrivatePageCount: usize,
//     pub Reserved7: [i64; 6],
// }

// UNSUPPORTED Rust 1560:1: declaration Impl has no candidate rule
// impl Default for SYSTEM_PROCESS_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1565:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SYSTEM_REGISTRY_QUOTA_INFORMATION {
//     pub RegistryQuotaAllowed: u32,
//     pub RegistryQuotaUsed: u32,
//     pub Reserved1: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 1572:1: declaration Impl has no candidate rule
// impl Default for SYSTEM_REGISTRY_QUOTA_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SYSTEM_STATUS_FLAG_POWER_SAVING_ON`: UInt = 1u;
// UNSUPPORTED Rust 1578:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SYSTEM_THREAD_INFORMATION {
//     pub Reserved1: [i64; 3],
//     pub Reserved2: u32,
//     pub StartAddress: *mut core::ffi::c_void,
//     pub ClientId: CLIENT_ID,
//     pub Priority: i32,
//     pub BasePriority: i32,
//     pub Reserved3: u32,
//     pub ThreadState: u32,
//     pub WaitReason: u32,
// }

// UNSUPPORTED Rust 1591:1: declaration Impl has no candidate rule
// impl Default for SYSTEM_THREAD_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1596:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SYSTEM_TIMEOFDAY_INFORMATION {
//     pub Reserved1: [u8; 48],
// }

// UNSUPPORTED Rust 1601:1: declaration Impl has no candidate rule
// impl Default for SYSTEM_TIMEOFDAY_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `S_ALLTHRESHOLD`: UInt = 2u;
public const val `S_LEGATO`: UInt = 1u;
public const val `S_NORMAL`: UInt = 0u;
public const val `S_PERIOD1024`: UInt = 1u;
public const val `S_PERIOD2048`: UInt = 2u;
public const val `S_PERIOD512`: UInt = 0u;
public const val `S_PERIODVOICE`: UInt = 3u;
public const val `S_QUEUEEMPTY`: UInt = 0u;
public const val `S_SERBDNT`: Int = -5;
public const val `S_SERDCC`: Int = -7;
public const val `S_SERDDR`: Int = -14;
public const val `S_SERDFQ`: Int = -13;
public const val `S_SERDLN`: Int = -6;
public const val `S_SERDMD`: Int = -10;
public const val `S_SERDPT`: Int = -12;
public const val `S_SERDSH`: Int = -11;
public const val `S_SERDSR`: Int = -15;
public const val `S_SERDST`: Int = -16;
public const val `S_SERDTP`: Int = -8;
public const val `S_SERDVL`: Int = -9;
public const val `S_SERDVNA`: Int = -1;
public const val `S_SERMACT`: Int = -3;
public const val `S_SEROFM`: Int = -2;
public const val `S_SERQFUL`: Int = -4;
public const val `S_STACCATO`: UInt = 2u;
public const val `S_THRESHOLD`: UInt = 1u;
public const val `S_WHITE1024`: UInt = 5u;
public const val `S_WHITE2048`: UInt = 6u;
public const val `S_WHITE512`: UInt = 4u;
public const val `S_WHITEVOICE`: UInt = 7u;
public const val `SetSockOptIoControlType`: `TDI_TL_IO_CONTROL_TYPE` = 1;
public const val `SocketIoControlType`: `TDI_TL_IO_CONTROL_TYPE` = 3;
// UNSUPPORTED Rust 1638:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct TCP_REQUEST_QUERY_INFORMATION_EX32_XP {
//     pub ID: TDIObjectID,
//     pub Context: [u32; 4],
// }

// UNSUPPORTED Rust 1645:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for TCP_REQUEST_QUERY_INFORMATION_EX32_XP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1651:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct TCP_REQUEST_QUERY_INFORMATION_EX_W2K {
//     pub ID: TDIObjectID,
//     pub Context: [u8; 16],
// }

// UNSUPPORTED Rust 1657:1: declaration Impl has no candidate rule
// impl Default for TCP_REQUEST_QUERY_INFORMATION_EX_W2K {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1662:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct TCP_REQUEST_QUERY_INFORMATION_EX_XP {
//     pub ID: TDIObjectID,
//     pub Context: [usize; 4],
// }

// UNSUPPORTED Rust 1668:1: declaration Impl has no candidate rule
// impl Default for TCP_REQUEST_QUERY_INFORMATION_EX_XP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1673:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct TCP_REQUEST_SET_INFORMATION_EX {
//     pub ID: TDIObjectID,
//     pub BufferSize: u32,
//     pub Buffer: [u8; 1],
// }

// UNSUPPORTED Rust 1680:1: declaration Impl has no candidate rule
// impl Default for TCP_REQUEST_SET_INFORMATION_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `TC_GP_TRAP`: UInt = 2u;
public const val `TC_HARDERR`: UInt = 1u;
public const val `TC_NORMAL`: UInt = 0u;
public const val `TC_SIGNAL`: UInt = 3u;
public typealias `TDIENTITY_ENTITY_TYPE` = UInt;
// UNSUPPORTED Rust 1690:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TDIEntityID {
//     pub tei_entity: TDIENTITY_ENTITY_TYPE,
//     pub tei_instance: u32,
// }

// UNSUPPORTED Rust 1696:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct TDIObjectID {
//     pub toi_entity: TDIEntityID,
//     pub toi_class: u32,
//     pub toi_type: u32,
//     pub toi_id: u32,
// }

// UNSUPPORTED Rust 1704:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct TDI_TL_IO_CONTROL_ENDPOINT {
//     pub Type: TDI_TL_IO_CONTROL_TYPE,
//     pub Level: u32,
//     pub Anonymous: TDI_TL_IO_CONTROL_ENDPOINT_0,
//     pub InputBuffer: *mut core::ffi::c_void,
//     pub InputBufferLength: u32,
//     pub OutputBuffer: *mut core::ffi::c_void,
//     pub OutputBufferLength: u32,
// }

// UNSUPPORTED Rust 1715:1: declaration Impl has no candidate rule
// impl Default for TDI_TL_IO_CONTROL_ENDPOINT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1720:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union TDI_TL_IO_CONTROL_ENDPOINT_0 {
//     pub IoControlCode: u32,
//     pub OptionName: u32,
// }

// UNSUPPORTED Rust 1726:1: declaration Impl has no candidate rule
// impl Default for TDI_TL_IO_CONTROL_ENDPOINT_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `TDI_TL_IO_CONTROL_TYPE` = Int;
// UNSUPPORTED Rust 1732:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct THREAD_NAME_INFORMATION {
//     pub ThreadName: super::super::Foundation::UNICODE_STRING,
// }

public const val `THREAD_PRIORITY_ERROR_RETURN`: UInt = 2147483647u;
public const val `UMS_VERSION`: UInt = 256u;
// UNSUPPORTED Rust 1739:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct UNDETERMINESTRUCT {
//     pub dwSize: u32,
//     pub uDefIMESize: u32,
//     pub uDefIMEPos: u32,
//     pub uUndetTextLen: u32,
//     pub uUndetTextPos: u32,
//     pub uUndetAttrPos: u32,
//     pub uCursorPos: u32,
//     pub uDeltaStart: u32,
//     pub uDetermineTextLen: u32,
//     pub uDetermineTextPos: u32,
//     pub uDetermineDelimPos: u32,
//     pub uYomiTextLen: u32,
//     pub uYomiTextPos: u32,
//     pub uYomiDelimPos: u32,
// }

public typealias `VALUENAME` = Int;
public const val `VALUENAME_BUILT_IN_LIST`: `VALUENAME` = 2;
public const val `VALUENAME_ENTERPRISE_DEFINED_CLASS_ID`: `VALUENAME` = 1;
public const val `VALUENAME_UNKNOWN`: `VALUENAME` = 0;
public typealias `WINSTATIONINFOCLASS` = Int;
// UNSUPPORTED Rust 1762:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WINSTATIONINFORMATIONW {
//     pub Reserved2: [u8; 70],
//     pub LogonId: u32,
//     pub Reserved3: [u8; 1140],
// }

// UNSUPPORTED Rust 1769:1: declaration Impl has no candidate rule
// impl Default for WINSTATIONINFORMATIONW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1774:1: generic scalar type unsupported
// pub type WINWATCHNOTIFYPROC = Option<unsafe extern "system" fn(hww: HWINWATCH, hwnd: super::super::Foundation::HWND, code: u32, lparam: super::super::Foundation::LPARAM)>;

public const val `WINWATCHNOTIFY_CHANGED`: UInt = 4u;
public const val `WINWATCHNOTIFY_CHANGING`: UInt = 3u;
public const val `WINWATCHNOTIFY_DESTROY`: UInt = 2u;
public const val `WINWATCHNOTIFY_START`: UInt = 0u;
public const val `WINWATCHNOTIFY_STOP`: UInt = 1u;
// UNSUPPORTED Rust 1780:1: non-scalar type Ptr unsupported
// pub const WLDP_CANEXECUTEBUFFER_FN: windows_sys::core::PCSTR = windows_sys::core::s!("WldpCanExecuteBuffer");

// UNSUPPORTED Rust 1781:1: non-scalar type Ptr unsupported
// pub const WLDP_CANEXECUTEFILE_FN: windows_sys::core::PCSTR = windows_sys::core::s!("WldpCanExecuteFile");

// UNSUPPORTED Rust 1782:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WLDP_DEVICE_SECURITY_INFORMATION {
//     pub UnlockIdSize: u32,
//     pub UnlockId: *mut u8,
//     pub ManufacturerIDLength: u32,
//     pub ManufacturerID: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 1790:1: declaration Impl has no candidate rule
// impl Default for WLDP_DEVICE_SECURITY_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1795:1: non-scalar type Ptr unsupported
// pub const WLDP_DLL: windows_sys::core::PCWSTR = windows_sys::core::w!("WLDP.DLL");

public typealias `WLDP_EXECUTION_EVALUATION_OPTIONS` = Int;
public const val `WLDP_EXECUTION_EVALUATION_OPTION_EXECUTE_IN_INTERACTIVE_SESSION`: `WLDP_EXECUTION_EVALUATION_OPTIONS` = 1;
public const val `WLDP_EXECUTION_EVALUATION_OPTION_NONE`: `WLDP_EXECUTION_EVALUATION_OPTIONS` = 0;
public typealias `WLDP_EXECUTION_POLICY` = Int;
public const val `WLDP_EXECUTION_POLICY_ALLOWED`: `WLDP_EXECUTION_POLICY` = 1;
public const val `WLDP_EXECUTION_POLICY_BLOCKED`: `WLDP_EXECUTION_POLICY` = 0;
public const val `WLDP_EXECUTION_POLICY_REQUIRE_SANDBOX`: `WLDP_EXECUTION_POLICY` = 2;
public const val `WLDP_FLAGS_SKIPSIGNATUREVALIDATION`: UInt = 256u;
// UNSUPPORTED Rust 1804:1: non-scalar type Ptr unsupported
// pub const WLDP_GETLOCKDOWNPOLICY_FN: windows_sys::core::PCSTR = windows_sys::core::s!("WldpGetLockdownPolicy");

public typealias `WLDP_HOST` = Int;
// UNSUPPORTED Rust 1806:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const WLDP_HOST_CMD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5baea1d6_6f1c_488e_8490_347fa5c5067f);

// UNSUPPORTED Rust 1807:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const WLDP_HOST_HTML: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb35a71b6_fe56_48d6_9543_2dff0ecded66);

public typealias `WLDP_HOST_ID` = Int;
public const val `WLDP_HOST_ID_ALL`: `WLDP_HOST_ID` = 7;
public const val `WLDP_HOST_ID_GLOBAL`: `WLDP_HOST_ID` = 1;
public const val `WLDP_HOST_ID_IE`: `WLDP_HOST_ID` = 5;
public const val `WLDP_HOST_ID_MAX`: `WLDP_HOST_ID` = 8;
public const val `WLDP_HOST_ID_MSI`: `WLDP_HOST_ID` = 6;
public const val `WLDP_HOST_ID_POWERSHELL`: `WLDP_HOST_ID` = 4;
public const val `WLDP_HOST_ID_UNKNOWN`: `WLDP_HOST_ID` = 0;
public const val `WLDP_HOST_ID_VBA`: `WLDP_HOST_ID` = 2;
public const val `WLDP_HOST_ID_WSH`: `WLDP_HOST_ID` = 3;
// UNSUPPORTED Rust 1818:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WLDP_HOST_INFORMATION {
//     pub dwRevision: u32,
//     pub dwHostId: WLDP_HOST_ID,
//     pub szSource: windows_sys::core::PCWSTR,
//     pub hSource: super::super::Foundation::HANDLE,
// }

// UNSUPPORTED Rust 1826:1: declaration Impl has no candidate rule
// impl Default for WLDP_HOST_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WLDP_HOST_INFORMATION_REVISION`: UInt = 1u;
// UNSUPPORTED Rust 1832:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const WLDP_HOST_JAVASCRIPT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5629f0d5_1cca_4fed_a1a3_36a8c18d74c0);

public const val `WLDP_HOST_MAX`: `WLDP_HOST` = 2;
// UNSUPPORTED Rust 1834:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const WLDP_HOST_MSI: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x624eb611_6e7e_4eec_9bfe_f0ecdbfcf390);

// UNSUPPORTED Rust 1835:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const WLDP_HOST_OTHER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x626cbec3_e1fa_4227_9800_ed210274cf7c);

// UNSUPPORTED Rust 1836:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const WLDP_HOST_POWERSHELL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8e9aaa7c_198b_4879_ae41_a50d47ad6458);

// UNSUPPORTED Rust 1837:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const WLDP_HOST_PYTHON: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbfd557ef_2448_42ec_810b_0d9f09352d4a);

public const val `WLDP_HOST_RUNDLL32`: `WLDP_HOST` = 0;
public const val `WLDP_HOST_SVCHOST`: `WLDP_HOST` = 1;
// UNSUPPORTED Rust 1840:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const WLDP_HOST_WINDOWS_SCRIPT_HOST: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd30b84c5_29ce_4ff3_86ec_a30007a82e49);

// UNSUPPORTED Rust 1841:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const WLDP_HOST_XML: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5594be58_c6bf_4295_82f4_d494d20e3a36);

// UNSUPPORTED Rust 1842:1: non-scalar type Ptr unsupported
// pub const WLDP_ISAPPAPPROVEDBYPOLICY_FN: windows_sys::core::PCSTR = windows_sys::core::s!("WldpIsAppApprovedByPolicy");

// UNSUPPORTED Rust 1843:1: non-scalar type Ptr unsupported
// pub const WLDP_ISCLASSINAPPROVEDLIST_FN: windows_sys::core::PCSTR = windows_sys::core::s!("WldpIsClassInApprovedList");

// UNSUPPORTED Rust 1844:1: non-scalar type Ptr unsupported
// pub const WLDP_ISDYNAMICCODEPOLICYENABLED_FN: windows_sys::core::PCSTR = windows_sys::core::s!("WldpIsDynamicCodePolicyEnabled");

// UNSUPPORTED Rust 1845:1: non-scalar type Ptr unsupported
// pub const WLDP_ISPRODUCTIONCONFIGURATION_FN: windows_sys::core::PCSTR = windows_sys::core::s!("WldpIsProductionConfiguration");

// UNSUPPORTED Rust 1846:1: non-scalar type Ptr unsupported
// pub const WLDP_ISWCOSPRODUCTIONCONFIGURATION_FN: windows_sys::core::PCSTR = windows_sys::core::s!("WldpIsWcosProductionConfiguration");

public typealias `WLDP_KEY` = Int;
public const val `WLDP_LOCKDOWN_AUDIT_FLAG`: UInt = 8u;
public const val `WLDP_LOCKDOWN_CONFIG_CI_AUDIT_FLAG`: UInt = 2u;
public const val `WLDP_LOCKDOWN_CONFIG_CI_FLAG`: UInt = 1u;
public const val `WLDP_LOCKDOWN_DEFINED_FLAG`: UInt = 2147483648u;
public const val `WLDP_LOCKDOWN_EXCLUSION_FLAG`: UInt = 16u;
public const val `WLDP_LOCKDOWN_OFF`: UInt = 2147483648u;
public const val `WLDP_LOCKDOWN_UMCIENFORCE_FLAG`: UInt = 4u;
public const val `WLDP_LOCKDOWN_UNDEFINED`: UInt = 0u;
public typealias `WLDP_POLICY_SETTING` = Int;
public const val `WLDP_POLICY_SETTING_AV_PERF_MODE`: `WLDP_POLICY_SETTING` = 1000;
// UNSUPPORTED Rust 1858:1: non-scalar type Ptr unsupported
// pub const WLDP_QUERYDANAMICCODETRUST_FN: windows_sys::core::PCSTR = windows_sys::core::s!("WldpQueryDynamicCodeTrust");

// UNSUPPORTED Rust 1859:1: non-scalar type Ptr unsupported
// pub const WLDP_QUERYDEVICESECURITYINFORMATION_FN: windows_sys::core::PCSTR = windows_sys::core::s!("WldpQueryDeviceSecurityInformation");

// UNSUPPORTED Rust 1860:1: non-scalar type Ptr unsupported
// pub const WLDP_QUERYDYNAMICCODETRUST_FN: windows_sys::core::PCSTR = windows_sys::core::s!("WldpQueryDynamicCodeTrust");

// UNSUPPORTED Rust 1861:1: non-scalar type Ptr unsupported
// pub const WLDP_QUERYPOLICYSETTINGENABLED2_FN: windows_sys::core::PCSTR = windows_sys::core::s!("WldpQueryPolicySettingEnabled2");

// UNSUPPORTED Rust 1862:1: non-scalar type Ptr unsupported
// pub const WLDP_QUERYPOLICYSETTINGENABLED_FN: windows_sys::core::PCSTR = windows_sys::core::s!("WldpQueryPolicySettingEnabled");

// UNSUPPORTED Rust 1863:1: non-scalar type Ptr unsupported
// pub const WLDP_QUERYWINDOWSLOCKDOWNMODE_FN: windows_sys::core::PCSTR = windows_sys::core::s!("WldpQueryWindowsLockdownMode");

// UNSUPPORTED Rust 1864:1: non-scalar type Ptr unsupported
// pub const WLDP_QUERYWINDOWSLOCKDOWNRESTRICTION_FN: windows_sys::core::PCSTR = windows_sys::core::s!("WldpQueryWindowsLockdownRestriction");

// UNSUPPORTED Rust 1865:1: non-scalar type Ptr unsupported
// pub const WLDP_RESETPRODUCTIONCONFIGURATION_FN: windows_sys::core::PCSTR = windows_sys::core::s!("WldpResetProductionConfiguration");

// UNSUPPORTED Rust 1866:1: non-scalar type Ptr unsupported
// pub const WLDP_RESETWCOSPRODUCTIONCONFIGURATION_FN: windows_sys::core::PCSTR = windows_sys::core::s!("WldpResetWcosProductionConfiguration");

// UNSUPPORTED Rust 1867:1: non-scalar type Ptr unsupported
// pub const WLDP_SETDYNAMICCODETRUST_FN: windows_sys::core::PCSTR = windows_sys::core::s!("WldpSetDynamicCodeTrust");

// UNSUPPORTED Rust 1868:1: non-scalar type Ptr unsupported
// pub const WLDP_SETWINDOWSLOCKDOWNRESTRICTION_FN: windows_sys::core::PCSTR = windows_sys::core::s!("WldpSetWindowsLockdownRestriction");

public typealias `WLDP_WINDOWS_LOCKDOWN_MODE` = Int;
public const val `WLDP_WINDOWS_LOCKDOWN_MODE_LOCKED`: `WLDP_WINDOWS_LOCKDOWN_MODE` = 2;
public const val `WLDP_WINDOWS_LOCKDOWN_MODE_MAX`: `WLDP_WINDOWS_LOCKDOWN_MODE` = 3;
public const val `WLDP_WINDOWS_LOCKDOWN_MODE_TRIAL`: `WLDP_WINDOWS_LOCKDOWN_MODE` = 1;
public const val `WLDP_WINDOWS_LOCKDOWN_MODE_UNLOCKED`: `WLDP_WINDOWS_LOCKDOWN_MODE` = 0;
public typealias `WLDP_WINDOWS_LOCKDOWN_RESTRICTION` = Int;
public const val `WLDP_WINDOWS_LOCKDOWN_RESTRICTION_MAX`: `WLDP_WINDOWS_LOCKDOWN_RESTRICTION` = 3;
public const val `WLDP_WINDOWS_LOCKDOWN_RESTRICTION_NONE`: `WLDP_WINDOWS_LOCKDOWN_RESTRICTION` = 0;
public const val `WLDP_WINDOWS_LOCKDOWN_RESTRICTION_NOUNLOCK`: `WLDP_WINDOWS_LOCKDOWN_RESTRICTION` = 1;
public const val `WLDP_WINDOWS_LOCKDOWN_RESTRICTION_NOUNLOCK_PERMANENT`: `WLDP_WINDOWS_LOCKDOWN_RESTRICTION` = 2;
public const val `WM_CONVERTREQUEST`: UInt = 266u;
public const val `WM_CONVERTRESULT`: UInt = 267u;
public const val `WM_IMEKEYDOWN`: UInt = 656u;
public const val `WM_IMEKEYUP`: UInt = 657u;
public const val `WM_IME_REPORT`: UInt = 640u;
public const val `WM_INTERIM`: UInt = 268u;
public const val `WM_WNT_CONVERTREQUESTEX`: UInt = 265u;
public const val `WinStationInformation`: `WINSTATIONINFOCLASS` = 8;
