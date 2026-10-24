// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn ActivateActCtx(hactctx : super::super::Foundation:: HANDLE, lpcookie : *mut usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn AddRefActCtx(hactctx : super::super::Foundation:: HANDLE));

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("msdelta.dll" "system" fn ApplyDeltaA(applyflags : i64, lpsourcename : windows_sys::core::PCSTR, lpdeltaname : windows_sys::core::PCSTR, lptargetname : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("msdelta.dll" "system" fn ApplyDeltaB(applyflags : i64, source : DELTA_INPUT, delta : DELTA_INPUT, lptarget : *mut DELTA_OUTPUT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("msdelta.dll" "system" fn ApplyDeltaGetReverseB(applyflags : i64, source : DELTA_INPUT, delta : DELTA_INPUT, lpreversefiletime : *const super::super::Foundation:: FILETIME, lptarget : *mut DELTA_OUTPUT, lptargetreverse : *mut DELTA_OUTPUT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("msdelta.dll" "system" fn ApplyDeltaProvidedB(applyflags : i64, source : DELTA_INPUT, delta : DELTA_INPUT, lptarget : *mut core::ffi::c_void, utargetsize : usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("msdelta.dll" "system" fn ApplyDeltaW(applyflags : i64, lpsourcename : windows_sys::core::PCWSTR, lpdeltaname : windows_sys::core::PCWSTR, lptargetname : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("mspatcha.dll" "system" fn ApplyPatchToFileA(patchfilename : windows_sys::core::PCSTR, oldfilename : windows_sys::core::PCSTR, newfilename : windows_sys::core::PCSTR, applyoptionflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("mspatcha.dll" "system" fn ApplyPatchToFileByBuffers(patchfilemapped : *const u8, patchfilesize : u32, oldfilemapped : *const u8, oldfilesize : u32, newfilebuffer : *mut *mut u8, newfilebuffersize : u32, newfileactualsize : *mut u32, newfiletime : *mut super::super::Foundation:: FILETIME, applyoptionflags : u32, progresscallback : PPATCH_PROGRESS_CALLBACK, callbackcontext : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("mspatcha.dll" "system" fn ApplyPatchToFileByHandles(patchfilehandle : super::super::Foundation:: HANDLE, oldfilehandle : super::super::Foundation:: HANDLE, newfilehandle : super::super::Foundation:: HANDLE, applyoptionflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("mspatcha.dll" "system" fn ApplyPatchToFileByHandlesEx(patchfilehandle : super::super::Foundation:: HANDLE, oldfilehandle : super::super::Foundation:: HANDLE, newfilehandle : super::super::Foundation:: HANDLE, applyoptionflags : u32, progresscallback : PPATCH_PROGRESS_CALLBACK, callbackcontext : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// windows_link::link!("mspatcha.dll" "system" fn ApplyPatchToFileExA(patchfilename : windows_sys::core::PCSTR, oldfilename : windows_sys::core::PCSTR, newfilename : windows_sys::core::PCSTR, applyoptionflags : u32, progresscallback : PPATCH_PROGRESS_CALLBACK, callbackcontext : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// windows_link::link!("mspatcha.dll" "system" fn ApplyPatchToFileExW(patchfilename : windows_sys::core::PCWSTR, oldfilename : windows_sys::core::PCWSTR, newfilename : windows_sys::core::PCWSTR, applyoptionflags : u32, progresscallback : PPATCH_PROGRESS_CALLBACK, callbackcontext : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// windows_link::link!("mspatcha.dll" "system" fn ApplyPatchToFileW(patchfilename : windows_sys::core::PCWSTR, oldfilename : windows_sys::core::PCWSTR, newfilename : windows_sys::core::PCWSTR, applyoptionflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn CreateActCtxA(pactctx : *const ACTCTXA) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn CreateActCtxW(pactctx : *const ACTCTXW) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// windows_link::link!("msdelta.dll" "system" fn CreateDeltaA(filetypeset : i64, setflags : i64, resetflags : i64, lpsourcename : windows_sys::core::PCSTR, lptargetname : windows_sys::core::PCSTR, lpsourceoptionsname : windows_sys::core::PCSTR, lptargetoptionsname : windows_sys::core::PCSTR, globaloptions : DELTA_INPUT, lptargetfiletime : *const super::super::Foundation:: FILETIME, hashalgid : super::super::Security::Cryptography:: ALG_ID, lpdeltaname : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// windows_link::link!("msdelta.dll" "system" fn CreateDeltaB(filetypeset : i64, setflags : i64, resetflags : i64, source : DELTA_INPUT, target : DELTA_INPUT, sourceoptions : DELTA_INPUT, targetoptions : DELTA_INPUT, globaloptions : DELTA_INPUT, lptargetfiletime : *const super::super::Foundation:: FILETIME, hashalgid : super::super::Security::Cryptography:: ALG_ID, lpdelta : *mut DELTA_OUTPUT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// windows_link::link!("msdelta.dll" "system" fn CreateDeltaW(filetypeset : i64, setflags : i64, resetflags : i64, lpsourcename : windows_sys::core::PCWSTR, lptargetname : windows_sys::core::PCWSTR, lpsourceoptionsname : windows_sys::core::PCWSTR, lptargetoptionsname : windows_sys::core::PCWSTR, globaloptions : DELTA_INPUT, lptargetfiletime : *const super::super::Foundation:: FILETIME, hashalgid : super::super::Security::Cryptography:: ALG_ID, lpdeltaname : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// windows_link::link!("mspatchc.dll" "system" fn CreatePatchFileA(oldfilename : windows_sys::core::PCSTR, newfilename : windows_sys::core::PCSTR, patchfilename : windows_sys::core::PCSTR, optionflags : u32, optiondata : *const PATCH_OPTION_DATA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// windows_link::link!("mspatchc.dll" "system" fn CreatePatchFileByHandles(oldfilehandle : super::super::Foundation:: HANDLE, newfilehandle : super::super::Foundation:: HANDLE, patchfilehandle : super::super::Foundation:: HANDLE, optionflags : u32, optiondata : *const PATCH_OPTION_DATA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// windows_link::link!("mspatchc.dll" "system" fn CreatePatchFileByHandlesEx(oldfilecount : u32, oldfileinfoarray : *const PATCH_OLD_FILE_INFO_H, newfilehandle : super::super::Foundation:: HANDLE, patchfilehandle : super::super::Foundation:: HANDLE, optionflags : u32, optiondata : *const PATCH_OPTION_DATA, progresscallback : PPATCH_PROGRESS_CALLBACK, callbackcontext : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// windows_link::link!("mspatchc.dll" "system" fn CreatePatchFileExA(oldfilecount : u32, oldfileinfoarray : *const PATCH_OLD_FILE_INFO_A, newfilename : windows_sys::core::PCSTR, patchfilename : windows_sys::core::PCSTR, optionflags : u32, optiondata : *const PATCH_OPTION_DATA, progresscallback : PPATCH_PROGRESS_CALLBACK, callbackcontext : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// windows_link::link!("mspatchc.dll" "system" fn CreatePatchFileExW(oldfilecount : u32, oldfileinfoarray : *const PATCH_OLD_FILE_INFO_W, newfilename : windows_sys::core::PCWSTR, patchfilename : windows_sys::core::PCWSTR, optionflags : u32, optiondata : *const PATCH_OPTION_DATA, progresscallback : PPATCH_PROGRESS_CALLBACK, callbackcontext : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// windows_link::link!("mspatchc.dll" "system" fn CreatePatchFileW(oldfilename : windows_sys::core::PCWSTR, newfilename : windows_sys::core::PCWSTR, patchfilename : windows_sys::core::PCWSTR, optionflags : u32, optiondata : *const PATCH_OPTION_DATA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 29:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn DeactivateActCtx(dwflags : u32, ulcookie : usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 30:1: declaration Macro has no candidate rule
// windows_link::link!("msdelta.dll" "system" fn DeltaFree(lpmemory : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 31:1: declaration Macro has no candidate rule
// windows_link::link!("msdelta.dll" "system" fn DeltaNormalizeProvidedB(filetypeset : i64, normalizeflags : i64, normalizeoptions : DELTA_INPUT, lpsource : *mut core::ffi::c_void, usourcesize : usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 32:1: declaration Macro has no candidate rule
// windows_link::link!("mspatchc.dll" "system" fn ExtractPatchHeaderToFileA(patchfilename : windows_sys::core::PCSTR, patchheaderfilename : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 33:1: declaration Macro has no candidate rule
// windows_link::link!("mspatchc.dll" "system" fn ExtractPatchHeaderToFileByHandles(patchfilehandle : super::super::Foundation:: HANDLE, patchheaderfilehandle : super::super::Foundation:: HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 34:1: declaration Macro has no candidate rule
// windows_link::link!("mspatchc.dll" "system" fn ExtractPatchHeaderToFileW(patchfilename : windows_sys::core::PCWSTR, patchheaderfilename : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 35:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_WindowsProgramming")]
// windows_link::link!("kernel32.dll" "system" fn FindActCtxSectionGuid(dwflags : u32, lpextensionguid : *const windows_sys::core::GUID, ulsectionid : u32, lpguidtofind : *const windows_sys::core::GUID, returneddata : *mut ACTCTX_SECTION_KEYED_DATA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 37:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_WindowsProgramming")]
// windows_link::link!("kernel32.dll" "system" fn FindActCtxSectionStringA(dwflags : u32, lpextensionguid : *const windows_sys::core::GUID, ulsectionid : u32, lpstringtofind : windows_sys::core::PCSTR, returneddata : *mut ACTCTX_SECTION_KEYED_DATA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 39:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_WindowsProgramming")]
// windows_link::link!("kernel32.dll" "system" fn FindActCtxSectionStringW(dwflags : u32, lpextensionguid : *const windows_sys::core::GUID, ulsectionid : u32, lpstringtofind : windows_sys::core::PCWSTR, returneddata : *mut ACTCTX_SECTION_KEYED_DATA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 41:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetCurrentActCtx(lphactctx : *mut super::super::Foundation:: HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 42:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// windows_link::link!("msdelta.dll" "system" fn GetDeltaInfoA(lpdeltaname : windows_sys::core::PCSTR, lpheaderinfo : *mut DELTA_HEADER_INFO) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 44:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// windows_link::link!("msdelta.dll" "system" fn GetDeltaInfoB(delta : DELTA_INPUT, lpheaderinfo : *mut DELTA_HEADER_INFO) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 46:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// windows_link::link!("msdelta.dll" "system" fn GetDeltaInfoW(lpdeltaname : windows_sys::core::PCWSTR, lpheaderinfo : *mut DELTA_HEADER_INFO) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 48:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// windows_link::link!("msdelta.dll" "system" fn GetDeltaSignatureA(filetypeset : i64, hashalgid : super::super::Security::Cryptography:: ALG_ID, lpsourcename : windows_sys::core::PCSTR, lphash : *mut DELTA_HASH) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 50:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// windows_link::link!("msdelta.dll" "system" fn GetDeltaSignatureB(filetypeset : i64, hashalgid : super::super::Security::Cryptography:: ALG_ID, source : DELTA_INPUT, lphash : *mut DELTA_HASH) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 52:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// windows_link::link!("msdelta.dll" "system" fn GetDeltaSignatureW(filetypeset : i64, hashalgid : super::super::Security::Cryptography:: ALG_ID, lpsourcename : windows_sys::core::PCWSTR, lphash : *mut DELTA_HASH) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 54:1: declaration Macro has no candidate rule
// windows_link::link!("mspatcha.dll" "system" fn GetFilePatchSignatureA(filename : windows_sys::core::PCSTR, optionflags : u32, optiondata : *const core::ffi::c_void, ignorerangecount : u32, ignorerangearray : *const PATCH_IGNORE_RANGE, retainrangecount : u32, retainrangearray : *const PATCH_RETAIN_RANGE, signaturebuffersize : u32, signaturebuffer : windows_sys::core::PSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 55:1: declaration Macro has no candidate rule
// windows_link::link!("mspatcha.dll" "system" fn GetFilePatchSignatureByBuffer(filebufferwritable : *mut u8, filesize : u32, optionflags : u32, optiondata : *const core::ffi::c_void, ignorerangecount : u32, ignorerangearray : *const PATCH_IGNORE_RANGE, retainrangecount : u32, retainrangearray : *const PATCH_RETAIN_RANGE, signaturebuffersize : u32, signaturebuffer : windows_sys::core::PSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 56:1: declaration Macro has no candidate rule
// windows_link::link!("mspatcha.dll" "system" fn GetFilePatchSignatureByHandle(filehandle : super::super::Foundation:: HANDLE, optionflags : u32, optiondata : *const core::ffi::c_void, ignorerangecount : u32, ignorerangearray : *const PATCH_IGNORE_RANGE, retainrangecount : u32, retainrangearray : *const PATCH_RETAIN_RANGE, signaturebuffersize : u32, signaturebuffer : windows_sys::core::PSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 57:1: declaration Macro has no candidate rule
// windows_link::link!("mspatcha.dll" "system" fn GetFilePatchSignatureW(filename : windows_sys::core::PCWSTR, optionflags : u32, optiondata : *const core::ffi::c_void, ignorerangecount : u32, ignorerangearray : *const PATCH_IGNORE_RANGE, retainrangecount : u32, retainrangearray : *const PATCH_RETAIN_RANGE, signaturebuffersize : u32, signaturebuffer : windows_sys::core::PWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 58:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiAdvertiseProductA(szpackagepath : windows_sys::core::PCSTR, szscriptfilepath : windows_sys::core::PCSTR, sztransforms : windows_sys::core::PCSTR, lgidlanguage : u16) -> u32);

// UNSUPPORTED Rust 59:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiAdvertiseProductExA(szpackagepath : windows_sys::core::PCSTR, szscriptfilepath : windows_sys::core::PCSTR, sztransforms : windows_sys::core::PCSTR, lgidlanguage : u16, dwplatform : u32, dwoptions : u32) -> u32);

// UNSUPPORTED Rust 60:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiAdvertiseProductExW(szpackagepath : windows_sys::core::PCWSTR, szscriptfilepath : windows_sys::core::PCWSTR, sztransforms : windows_sys::core::PCWSTR, lgidlanguage : u16, dwplatform : u32, dwoptions : u32) -> u32);

// UNSUPPORTED Rust 61:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiAdvertiseProductW(szpackagepath : windows_sys::core::PCWSTR, szscriptfilepath : windows_sys::core::PCWSTR, sztransforms : windows_sys::core::PCWSTR, lgidlanguage : u16) -> u32);

// UNSUPPORTED Rust 62:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("msi.dll" "system" fn MsiAdvertiseScriptA(szscriptfile : windows_sys::core::PCSTR, dwflags : u32, phregdata : *const super::Registry:: HKEY, fremoveitems : windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 64:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("msi.dll" "system" fn MsiAdvertiseScriptW(szscriptfile : windows_sys::core::PCWSTR, dwflags : u32, phregdata : *const super::Registry:: HKEY, fremoveitems : windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 66:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiApplyMultiplePatchesA(szpatchpackages : windows_sys::core::PCSTR, szproductcode : windows_sys::core::PCSTR, szpropertieslist : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 67:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiApplyMultiplePatchesW(szpatchpackages : windows_sys::core::PCWSTR, szproductcode : windows_sys::core::PCWSTR, szpropertieslist : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 68:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiApplyPatchA(szpatchpackage : windows_sys::core::PCSTR, szinstallpackage : windows_sys::core::PCSTR, einstalltype : INSTALLTYPE, szcommandline : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 69:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiApplyPatchW(szpatchpackage : windows_sys::core::PCWSTR, szinstallpackage : windows_sys::core::PCWSTR, einstalltype : INSTALLTYPE, szcommandline : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 70:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiBeginTransactionA(szname : windows_sys::core::PCSTR, dwtransactionattributes : u32, phtransactionhandle : *mut MSIHANDLE, phchangeofownerevent : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 71:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiBeginTransactionW(szname : windows_sys::core::PCWSTR, dwtransactionattributes : u32, phtransactionhandle : *mut MSIHANDLE, phchangeofownerevent : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 72:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiCloseAllHandles() -> u32);

// UNSUPPORTED Rust 73:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiCloseHandle(hany : MSIHANDLE) -> u32);

// UNSUPPORTED Rust 74:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiCollectUserInfoA(szproduct : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 75:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiCollectUserInfoW(szproduct : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 76:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiConfigureFeatureA(szproduct : windows_sys::core::PCSTR, szfeature : windows_sys::core::PCSTR, einstallstate : INSTALLSTATE) -> u32);

// UNSUPPORTED Rust 77:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiConfigureFeatureW(szproduct : windows_sys::core::PCWSTR, szfeature : windows_sys::core::PCWSTR, einstallstate : INSTALLSTATE) -> u32);

// UNSUPPORTED Rust 78:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiConfigureProductA(szproduct : windows_sys::core::PCSTR, iinstalllevel : INSTALLLEVEL, einstallstate : INSTALLSTATE) -> u32);

// UNSUPPORTED Rust 79:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiConfigureProductExA(szproduct : windows_sys::core::PCSTR, iinstalllevel : INSTALLLEVEL, einstallstate : INSTALLSTATE, szcommandline : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 80:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiConfigureProductExW(szproduct : windows_sys::core::PCWSTR, iinstalllevel : INSTALLLEVEL, einstallstate : INSTALLSTATE, szcommandline : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 81:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiConfigureProductW(szproduct : windows_sys::core::PCWSTR, iinstalllevel : INSTALLLEVEL, einstallstate : INSTALLSTATE) -> u32);

// UNSUPPORTED Rust 82:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiCreateRecord(cparams : u32) -> MSIHANDLE);

// UNSUPPORTED Rust 83:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiCreateTransformSummaryInfoA(hdatabase : MSIHANDLE, hdatabasereference : MSIHANDLE, sztransformfile : windows_sys::core::PCSTR, ierrorconditions : MSITRANSFORM_ERROR, ivalidation : MSITRANSFORM_VALIDATE) -> u32);

// UNSUPPORTED Rust 84:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiCreateTransformSummaryInfoW(hdatabase : MSIHANDLE, hdatabasereference : MSIHANDLE, sztransformfile : windows_sys::core::PCWSTR, ierrorconditions : MSITRANSFORM_ERROR, ivalidation : MSITRANSFORM_VALIDATE) -> u32);

// UNSUPPORTED Rust 85:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiDatabaseApplyTransformA(hdatabase : MSIHANDLE, sztransformfile : windows_sys::core::PCSTR, ierrorconditions : MSITRANSFORM_ERROR) -> u32);

// UNSUPPORTED Rust 86:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiDatabaseApplyTransformW(hdatabase : MSIHANDLE, sztransformfile : windows_sys::core::PCWSTR, ierrorconditions : MSITRANSFORM_ERROR) -> u32);

// UNSUPPORTED Rust 87:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiDatabaseCommit(hdatabase : MSIHANDLE) -> u32);

// UNSUPPORTED Rust 88:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiDatabaseExportA(hdatabase : MSIHANDLE, sztablename : windows_sys::core::PCSTR, szfolderpath : windows_sys::core::PCSTR, szfilename : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 89:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiDatabaseExportW(hdatabase : MSIHANDLE, sztablename : windows_sys::core::PCWSTR, szfolderpath : windows_sys::core::PCWSTR, szfilename : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 90:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiDatabaseGenerateTransformA(hdatabase : MSIHANDLE, hdatabasereference : MSIHANDLE, sztransformfile : windows_sys::core::PCSTR, ireserved1 : i32, ireserved2 : i32) -> u32);

// UNSUPPORTED Rust 91:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiDatabaseGenerateTransformW(hdatabase : MSIHANDLE, hdatabasereference : MSIHANDLE, sztransformfile : windows_sys::core::PCWSTR, ireserved1 : i32, ireserved2 : i32) -> u32);

// UNSUPPORTED Rust 92:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiDatabaseGetPrimaryKeysA(hdatabase : MSIHANDLE, sztablename : windows_sys::core::PCSTR, phrecord : *mut MSIHANDLE) -> u32);

// UNSUPPORTED Rust 93:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiDatabaseGetPrimaryKeysW(hdatabase : MSIHANDLE, sztablename : windows_sys::core::PCWSTR, phrecord : *mut MSIHANDLE) -> u32);

// UNSUPPORTED Rust 94:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiDatabaseImportA(hdatabase : MSIHANDLE, szfolderpath : windows_sys::core::PCSTR, szfilename : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 95:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiDatabaseImportW(hdatabase : MSIHANDLE, szfolderpath : windows_sys::core::PCWSTR, szfilename : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 96:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiDatabaseIsTablePersistentA(hdatabase : MSIHANDLE, sztablename : windows_sys::core::PCSTR) -> MSICONDITION);

// UNSUPPORTED Rust 97:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiDatabaseIsTablePersistentW(hdatabase : MSIHANDLE, sztablename : windows_sys::core::PCWSTR) -> MSICONDITION);

// UNSUPPORTED Rust 98:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiDatabaseMergeA(hdatabase : MSIHANDLE, hdatabasemerge : MSIHANDLE, sztablename : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 99:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiDatabaseMergeW(hdatabase : MSIHANDLE, hdatabasemerge : MSIHANDLE, sztablename : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 100:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiDatabaseOpenViewA(hdatabase : MSIHANDLE, szquery : windows_sys::core::PCSTR, phview : *mut MSIHANDLE) -> u32);

// UNSUPPORTED Rust 101:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiDatabaseOpenViewW(hdatabase : MSIHANDLE, szquery : windows_sys::core::PCWSTR, phview : *mut MSIHANDLE) -> u32);

// UNSUPPORTED Rust 102:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiDetermineApplicablePatchesA(szproductpackagepath : windows_sys::core::PCSTR, cpatchinfo : u32, ppatchinfo : *mut MSIPATCHSEQUENCEINFOA) -> u32);

// UNSUPPORTED Rust 103:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiDetermineApplicablePatchesW(szproductpackagepath : windows_sys::core::PCWSTR, cpatchinfo : u32, ppatchinfo : *mut MSIPATCHSEQUENCEINFOW) -> u32);

// UNSUPPORTED Rust 104:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiDeterminePatchSequenceA(szproductcode : windows_sys::core::PCSTR, szusersid : windows_sys::core::PCSTR, dwcontext : MSIINSTALLCONTEXT, cpatchinfo : u32, ppatchinfo : *mut MSIPATCHSEQUENCEINFOA) -> u32);

// UNSUPPORTED Rust 105:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiDeterminePatchSequenceW(szproductcode : windows_sys::core::PCWSTR, szusersid : windows_sys::core::PCWSTR, dwcontext : MSIINSTALLCONTEXT, cpatchinfo : u32, ppatchinfo : *mut MSIPATCHSEQUENCEINFOW) -> u32);

// UNSUPPORTED Rust 106:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiDoActionA(hinstall : MSIHANDLE, szaction : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 107:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiDoActionW(hinstall : MSIHANDLE, szaction : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 108:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiEnableLogA(dwlogmode : u32, szlogfile : windows_sys::core::PCSTR, dwlogattributes : u32) -> u32);

// UNSUPPORTED Rust 109:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiEnableLogW(dwlogmode : u32, szlogfile : windows_sys::core::PCWSTR, dwlogattributes : u32) -> u32);

// UNSUPPORTED Rust 110:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiEnableUIPreview(hdatabase : MSIHANDLE, phpreview : *mut MSIHANDLE) -> u32);

// UNSUPPORTED Rust 111:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiEndTransaction(dwtransactionstate : MSITRANSACTIONSTATE) -> u32);

// UNSUPPORTED Rust 112:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiEnumClientsA(szcomponent : windows_sys::core::PCSTR, iproductindex : u32, lpproductbuf : windows_sys::core::PSTR) -> u32);

// UNSUPPORTED Rust 113:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiEnumClientsExA(szcomponent : windows_sys::core::PCSTR, szusersid : windows_sys::core::PCSTR, dwcontext : u32, dwproductindex : u32, szproductbuf : windows_sys::core::PSTR, pdwinstalledcontext : *mut MSIINSTALLCONTEXT, szsid : windows_sys::core::PSTR, pcchsid : *mut u32) -> u32);

// UNSUPPORTED Rust 114:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiEnumClientsExW(szcomponent : windows_sys::core::PCWSTR, szusersid : windows_sys::core::PCWSTR, dwcontext : u32, dwproductindex : u32, szproductbuf : windows_sys::core::PWSTR, pdwinstalledcontext : *mut MSIINSTALLCONTEXT, szsid : windows_sys::core::PWSTR, pcchsid : *mut u32) -> u32);

// UNSUPPORTED Rust 115:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiEnumClientsW(szcomponent : windows_sys::core::PCWSTR, iproductindex : u32, lpproductbuf : windows_sys::core::PWSTR) -> u32);

// UNSUPPORTED Rust 116:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiEnumComponentCostsA(hinstall : MSIHANDLE, szcomponent : windows_sys::core::PCSTR, dwindex : u32, istate : INSTALLSTATE, szdrivebuf : windows_sys::core::PSTR, pcchdrivebuf : *mut u32, picost : *mut i32, pitempcost : *mut i32) -> u32);

// UNSUPPORTED Rust 117:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiEnumComponentCostsW(hinstall : MSIHANDLE, szcomponent : windows_sys::core::PCWSTR, dwindex : u32, istate : INSTALLSTATE, szdrivebuf : windows_sys::core::PWSTR, pcchdrivebuf : *mut u32, picost : *mut i32, pitempcost : *mut i32) -> u32);

// UNSUPPORTED Rust 118:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiEnumComponentQualifiersA(szcomponent : windows_sys::core::PCSTR, iindex : u32, lpqualifierbuf : windows_sys::core::PSTR, pcchqualifierbuf : *mut u32, lpapplicationdatabuf : windows_sys::core::PSTR, pcchapplicationdatabuf : *mut u32) -> u32);

// UNSUPPORTED Rust 119:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiEnumComponentQualifiersW(szcomponent : windows_sys::core::PCWSTR, iindex : u32, lpqualifierbuf : windows_sys::core::PWSTR, pcchqualifierbuf : *mut u32, lpapplicationdatabuf : windows_sys::core::PWSTR, pcchapplicationdatabuf : *mut u32) -> u32);

// UNSUPPORTED Rust 120:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiEnumComponentsA(icomponentindex : u32, lpcomponentbuf : windows_sys::core::PSTR) -> u32);

// UNSUPPORTED Rust 121:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiEnumComponentsExA(szusersid : windows_sys::core::PCSTR, dwcontext : u32, dwindex : u32, szinstalledcomponentcode : windows_sys::core::PSTR, pdwinstalledcontext : *mut MSIINSTALLCONTEXT, szsid : windows_sys::core::PSTR, pcchsid : *mut u32) -> u32);

// UNSUPPORTED Rust 122:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiEnumComponentsExW(szusersid : windows_sys::core::PCWSTR, dwcontext : u32, dwindex : u32, szinstalledcomponentcode : windows_sys::core::PWSTR, pdwinstalledcontext : *mut MSIINSTALLCONTEXT, szsid : windows_sys::core::PWSTR, pcchsid : *mut u32) -> u32);

// UNSUPPORTED Rust 123:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiEnumComponentsW(icomponentindex : u32, lpcomponentbuf : windows_sys::core::PWSTR) -> u32);

// UNSUPPORTED Rust 124:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiEnumFeaturesA(szproduct : windows_sys::core::PCSTR, ifeatureindex : u32, lpfeaturebuf : windows_sys::core::PSTR, lpparentbuf : windows_sys::core::PSTR) -> u32);

// UNSUPPORTED Rust 125:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiEnumFeaturesW(szproduct : windows_sys::core::PCWSTR, ifeatureindex : u32, lpfeaturebuf : windows_sys::core::PWSTR, lpparentbuf : windows_sys::core::PWSTR) -> u32);

// UNSUPPORTED Rust 126:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiEnumPatchesA(szproduct : windows_sys::core::PCSTR, ipatchindex : u32, lppatchbuf : windows_sys::core::PSTR, lptransformsbuf : windows_sys::core::PSTR, pcchtransformsbuf : *mut u32) -> u32);

// UNSUPPORTED Rust 127:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiEnumPatchesExA(szproductcode : windows_sys::core::PCSTR, szusersid : windows_sys::core::PCSTR, dwcontext : u32, dwfilter : u32, dwindex : u32, szpatchcode : windows_sys::core::PSTR, sztargetproductcode : windows_sys::core::PSTR, pdwtargetproductcontext : *mut MSIINSTALLCONTEXT, sztargetusersid : windows_sys::core::PSTR, pcchtargetusersid : *mut u32) -> u32);

// UNSUPPORTED Rust 128:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiEnumPatchesExW(szproductcode : windows_sys::core::PCWSTR, szusersid : windows_sys::core::PCWSTR, dwcontext : u32, dwfilter : u32, dwindex : u32, szpatchcode : windows_sys::core::PWSTR, sztargetproductcode : windows_sys::core::PWSTR, pdwtargetproductcontext : *mut MSIINSTALLCONTEXT, sztargetusersid : windows_sys::core::PWSTR, pcchtargetusersid : *mut u32) -> u32);

// UNSUPPORTED Rust 129:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiEnumPatchesW(szproduct : windows_sys::core::PCWSTR, ipatchindex : u32, lppatchbuf : windows_sys::core::PWSTR, lptransformsbuf : windows_sys::core::PWSTR, pcchtransformsbuf : *mut u32) -> u32);

// UNSUPPORTED Rust 130:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiEnumProductsA(iproductindex : u32, lpproductbuf : windows_sys::core::PSTR) -> u32);

// UNSUPPORTED Rust 131:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiEnumProductsExA(szproductcode : windows_sys::core::PCSTR, szusersid : windows_sys::core::PCSTR, dwcontext : u32, dwindex : u32, szinstalledproductcode : windows_sys::core::PSTR, pdwinstalledcontext : *mut MSIINSTALLCONTEXT, szsid : windows_sys::core::PSTR, pcchsid : *mut u32) -> u32);

// UNSUPPORTED Rust 132:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiEnumProductsExW(szproductcode : windows_sys::core::PCWSTR, szusersid : windows_sys::core::PCWSTR, dwcontext : u32, dwindex : u32, szinstalledproductcode : windows_sys::core::PWSTR, pdwinstalledcontext : *mut MSIINSTALLCONTEXT, szsid : windows_sys::core::PWSTR, pcchsid : *mut u32) -> u32);

// UNSUPPORTED Rust 133:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiEnumProductsW(iproductindex : u32, lpproductbuf : windows_sys::core::PWSTR) -> u32);

// UNSUPPORTED Rust 134:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiEnumRelatedProductsA(lpupgradecode : windows_sys::core::PCSTR, dwreserved : u32, iproductindex : u32, lpproductbuf : windows_sys::core::PSTR) -> u32);

// UNSUPPORTED Rust 135:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiEnumRelatedProductsW(lpupgradecode : windows_sys::core::PCWSTR, dwreserved : u32, iproductindex : u32, lpproductbuf : windows_sys::core::PWSTR) -> u32);

// UNSUPPORTED Rust 136:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiEvaluateConditionA(hinstall : MSIHANDLE, szcondition : windows_sys::core::PCSTR) -> MSICONDITION);

// UNSUPPORTED Rust 137:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiEvaluateConditionW(hinstall : MSIHANDLE, szcondition : windows_sys::core::PCWSTR) -> MSICONDITION);

// UNSUPPORTED Rust 138:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiExtractPatchXMLDataA(szpatchpath : windows_sys::core::PCSTR, dwreserved : u32, szxmldata : windows_sys::core::PSTR, pcchxmldata : *mut u32) -> u32);

// UNSUPPORTED Rust 139:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiExtractPatchXMLDataW(szpatchpath : windows_sys::core::PCWSTR, dwreserved : u32, szxmldata : windows_sys::core::PWSTR, pcchxmldata : *mut u32) -> u32);

// UNSUPPORTED Rust 140:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiFormatRecordA(hinstall : MSIHANDLE, hrecord : MSIHANDLE, szresultbuf : windows_sys::core::PSTR, pcchresultbuf : *mut u32) -> u32);

// UNSUPPORTED Rust 141:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiFormatRecordW(hinstall : MSIHANDLE, hrecord : MSIHANDLE, szresultbuf : windows_sys::core::PWSTR, pcchresultbuf : *mut u32) -> u32);

// UNSUPPORTED Rust 142:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiGetActiveDatabase(hinstall : MSIHANDLE) -> MSIHANDLE);

// UNSUPPORTED Rust 143:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiGetComponentPathA(szproduct : windows_sys::core::PCSTR, szcomponent : windows_sys::core::PCSTR, lppathbuf : windows_sys::core::PSTR, pcchbuf : *mut u32) -> INSTALLSTATE);

// UNSUPPORTED Rust 144:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiGetComponentPathExA(szproductcode : windows_sys::core::PCSTR, szcomponentcode : windows_sys::core::PCSTR, szusersid : windows_sys::core::PCSTR, dwcontext : MSIINSTALLCONTEXT, lpoutpathbuffer : windows_sys::core::PSTR, pcchoutpathbuffer : *mut u32) -> INSTALLSTATE);

// UNSUPPORTED Rust 145:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiGetComponentPathExW(szproductcode : windows_sys::core::PCWSTR, szcomponentcode : windows_sys::core::PCWSTR, szusersid : windows_sys::core::PCWSTR, dwcontext : MSIINSTALLCONTEXT, lpoutpathbuffer : windows_sys::core::PWSTR, pcchoutpathbuffer : *mut u32) -> INSTALLSTATE);

// UNSUPPORTED Rust 146:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiGetComponentPathW(szproduct : windows_sys::core::PCWSTR, szcomponent : windows_sys::core::PCWSTR, lppathbuf : windows_sys::core::PWSTR, pcchbuf : *mut u32) -> INSTALLSTATE);

// UNSUPPORTED Rust 147:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiGetComponentStateA(hinstall : MSIHANDLE, szcomponent : windows_sys::core::PCSTR, piinstalled : *mut INSTALLSTATE, piaction : *mut INSTALLSTATE) -> u32);

// UNSUPPORTED Rust 148:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiGetComponentStateW(hinstall : MSIHANDLE, szcomponent : windows_sys::core::PCWSTR, piinstalled : *mut INSTALLSTATE, piaction : *mut INSTALLSTATE) -> u32);

// UNSUPPORTED Rust 149:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiGetDatabaseState(hdatabase : MSIHANDLE) -> MSIDBSTATE);

// UNSUPPORTED Rust 150:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiGetFeatureCostA(hinstall : MSIHANDLE, szfeature : windows_sys::core::PCSTR, icosttree : MSICOSTTREE, istate : INSTALLSTATE, picost : *mut i32) -> u32);

// UNSUPPORTED Rust 151:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiGetFeatureCostW(hinstall : MSIHANDLE, szfeature : windows_sys::core::PCWSTR, icosttree : MSICOSTTREE, istate : INSTALLSTATE, picost : *mut i32) -> u32);

// UNSUPPORTED Rust 152:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiGetFeatureInfoA(hproduct : MSIHANDLE, szfeature : windows_sys::core::PCSTR, lpattributes : *mut u32, lptitlebuf : windows_sys::core::PSTR, pcchtitlebuf : *mut u32, lphelpbuf : windows_sys::core::PSTR, pcchhelpbuf : *mut u32) -> u32);

// UNSUPPORTED Rust 153:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiGetFeatureInfoW(hproduct : MSIHANDLE, szfeature : windows_sys::core::PCWSTR, lpattributes : *mut u32, lptitlebuf : windows_sys::core::PWSTR, pcchtitlebuf : *mut u32, lphelpbuf : windows_sys::core::PWSTR, pcchhelpbuf : *mut u32) -> u32);

// UNSUPPORTED Rust 154:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiGetFeatureStateA(hinstall : MSIHANDLE, szfeature : windows_sys::core::PCSTR, piinstalled : *mut INSTALLSTATE, piaction : *mut INSTALLSTATE) -> u32);

// UNSUPPORTED Rust 155:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiGetFeatureStateW(hinstall : MSIHANDLE, szfeature : windows_sys::core::PCWSTR, piinstalled : *mut INSTALLSTATE, piaction : *mut INSTALLSTATE) -> u32);

// UNSUPPORTED Rust 156:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiGetFeatureUsageA(szproduct : windows_sys::core::PCSTR, szfeature : windows_sys::core::PCSTR, pdwusecount : *mut u32, pwdateused : *mut u16) -> u32);

// UNSUPPORTED Rust 157:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiGetFeatureUsageW(szproduct : windows_sys::core::PCWSTR, szfeature : windows_sys::core::PCWSTR, pdwusecount : *mut u32, pwdateused : *mut u16) -> u32);

// UNSUPPORTED Rust 158:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiGetFeatureValidStatesA(hinstall : MSIHANDLE, szfeature : windows_sys::core::PCSTR, lpinstallstates : *mut u32) -> u32);

// UNSUPPORTED Rust 159:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiGetFeatureValidStatesW(hinstall : MSIHANDLE, szfeature : windows_sys::core::PCWSTR, lpinstallstates : *mut u32) -> u32);

// UNSUPPORTED Rust 160:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiGetFileHashA(szfilepath : windows_sys::core::PCSTR, dwoptions : u32, phash : *mut MSIFILEHASHINFO) -> u32);

// UNSUPPORTED Rust 161:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiGetFileHashW(szfilepath : windows_sys::core::PCWSTR, dwoptions : u32, phash : *mut MSIFILEHASHINFO) -> u32);

// UNSUPPORTED Rust 162:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// windows_link::link!("msi.dll" "system" fn MsiGetFileSignatureInformationA(szsignedobjectpath : windows_sys::core::PCSTR, dwflags : u32, ppccertcontext : *mut *mut super::super::Security::Cryptography:: CERT_CONTEXT, pbhashdata : *mut u8, pcbhashdata : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 164:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// windows_link::link!("msi.dll" "system" fn MsiGetFileSignatureInformationW(szsignedobjectpath : windows_sys::core::PCWSTR, dwflags : u32, ppccertcontext : *mut *mut super::super::Security::Cryptography:: CERT_CONTEXT, pbhashdata : *mut u8, pcbhashdata : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 166:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiGetFileVersionA(szfilepath : windows_sys::core::PCSTR, lpversionbuf : windows_sys::core::PSTR, pcchversionbuf : *mut u32, lplangbuf : windows_sys::core::PSTR, pcchlangbuf : *mut u32) -> u32);

// UNSUPPORTED Rust 167:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiGetFileVersionW(szfilepath : windows_sys::core::PCWSTR, lpversionbuf : windows_sys::core::PWSTR, pcchversionbuf : *mut u32, lplangbuf : windows_sys::core::PWSTR, pcchlangbuf : *mut u32) -> u32);

// UNSUPPORTED Rust 168:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiGetLanguage(hinstall : MSIHANDLE) -> u16);

// UNSUPPORTED Rust 169:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiGetLastErrorRecord() -> MSIHANDLE);

// UNSUPPORTED Rust 170:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiGetMode(hinstall : MSIHANDLE, erunmode : MSIRUNMODE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 171:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiGetPatchFileListA(szproductcode : windows_sys::core::PCSTR, szpatchpackages : windows_sys::core::PCSTR, pcfiles : *mut u32, pphfilerecords : *mut *mut MSIHANDLE) -> u32);

// UNSUPPORTED Rust 172:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiGetPatchFileListW(szproductcode : windows_sys::core::PCWSTR, szpatchpackages : windows_sys::core::PCWSTR, pcfiles : *mut u32, pphfilerecords : *mut *mut MSIHANDLE) -> u32);

// UNSUPPORTED Rust 173:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiGetPatchInfoA(szpatch : windows_sys::core::PCSTR, szattribute : windows_sys::core::PCSTR, lpvaluebuf : windows_sys::core::PSTR, pcchvaluebuf : *mut u32) -> u32);

// UNSUPPORTED Rust 174:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiGetPatchInfoExA(szpatchcode : windows_sys::core::PCSTR, szproductcode : windows_sys::core::PCSTR, szusersid : windows_sys::core::PCSTR, dwcontext : MSIINSTALLCONTEXT, szproperty : windows_sys::core::PCSTR, lpvalue : windows_sys::core::PSTR, pcchvalue : *mut u32) -> u32);

// UNSUPPORTED Rust 175:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiGetPatchInfoExW(szpatchcode : windows_sys::core::PCWSTR, szproductcode : windows_sys::core::PCWSTR, szusersid : windows_sys::core::PCWSTR, dwcontext : MSIINSTALLCONTEXT, szproperty : windows_sys::core::PCWSTR, lpvalue : windows_sys::core::PWSTR, pcchvalue : *mut u32) -> u32);

// UNSUPPORTED Rust 176:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiGetPatchInfoW(szpatch : windows_sys::core::PCWSTR, szattribute : windows_sys::core::PCWSTR, lpvaluebuf : windows_sys::core::PWSTR, pcchvaluebuf : *mut u32) -> u32);

// UNSUPPORTED Rust 177:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiGetProductCodeA(szcomponent : windows_sys::core::PCSTR, lpbuf39 : windows_sys::core::PSTR) -> u32);

// UNSUPPORTED Rust 178:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiGetProductCodeW(szcomponent : windows_sys::core::PCWSTR, lpbuf39 : windows_sys::core::PWSTR) -> u32);

// UNSUPPORTED Rust 179:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiGetProductInfoA(szproduct : windows_sys::core::PCSTR, szattribute : windows_sys::core::PCSTR, lpvaluebuf : windows_sys::core::PSTR, pcchvaluebuf : *mut u32) -> u32);

// UNSUPPORTED Rust 180:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiGetProductInfoExA(szproductcode : windows_sys::core::PCSTR, szusersid : windows_sys::core::PCSTR, dwcontext : MSIINSTALLCONTEXT, szproperty : windows_sys::core::PCSTR, szvalue : windows_sys::core::PSTR, pcchvalue : *mut u32) -> u32);

// UNSUPPORTED Rust 181:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiGetProductInfoExW(szproductcode : windows_sys::core::PCWSTR, szusersid : windows_sys::core::PCWSTR, dwcontext : MSIINSTALLCONTEXT, szproperty : windows_sys::core::PCWSTR, szvalue : windows_sys::core::PWSTR, pcchvalue : *mut u32) -> u32);

// UNSUPPORTED Rust 182:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiGetProductInfoFromScriptA(szscriptfile : windows_sys::core::PCSTR, lpproductbuf39 : windows_sys::core::PSTR, plgidlanguage : *mut u16, pdwversion : *mut u32, lpnamebuf : windows_sys::core::PSTR, pcchnamebuf : *mut u32, lppackagebuf : windows_sys::core::PSTR, pcchpackagebuf : *mut u32) -> u32);

// UNSUPPORTED Rust 183:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiGetProductInfoFromScriptW(szscriptfile : windows_sys::core::PCWSTR, lpproductbuf39 : windows_sys::core::PWSTR, plgidlanguage : *mut u16, pdwversion : *mut u32, lpnamebuf : windows_sys::core::PWSTR, pcchnamebuf : *mut u32, lppackagebuf : windows_sys::core::PWSTR, pcchpackagebuf : *mut u32) -> u32);

// UNSUPPORTED Rust 184:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiGetProductInfoW(szproduct : windows_sys::core::PCWSTR, szattribute : windows_sys::core::PCWSTR, lpvaluebuf : windows_sys::core::PWSTR, pcchvaluebuf : *mut u32) -> u32);

// UNSUPPORTED Rust 185:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiGetProductPropertyA(hproduct : MSIHANDLE, szproperty : windows_sys::core::PCSTR, lpvaluebuf : windows_sys::core::PSTR, pcchvaluebuf : *mut u32) -> u32);

// UNSUPPORTED Rust 186:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiGetProductPropertyW(hproduct : MSIHANDLE, szproperty : windows_sys::core::PCWSTR, lpvaluebuf : windows_sys::core::PWSTR, pcchvaluebuf : *mut u32) -> u32);

// UNSUPPORTED Rust 187:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiGetPropertyA(hinstall : MSIHANDLE, szname : windows_sys::core::PCSTR, szvaluebuf : windows_sys::core::PSTR, pcchvaluebuf : *mut u32) -> u32);

// UNSUPPORTED Rust 188:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiGetPropertyW(hinstall : MSIHANDLE, szname : windows_sys::core::PCWSTR, szvaluebuf : windows_sys::core::PWSTR, pcchvaluebuf : *mut u32) -> u32);

// UNSUPPORTED Rust 189:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiGetShortcutTargetA(szshortcutpath : windows_sys::core::PCSTR, szproductcode : windows_sys::core::PSTR, szfeatureid : windows_sys::core::PSTR, szcomponentcode : windows_sys::core::PSTR) -> u32);

// UNSUPPORTED Rust 190:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiGetShortcutTargetW(szshortcutpath : windows_sys::core::PCWSTR, szproductcode : windows_sys::core::PWSTR, szfeatureid : windows_sys::core::PWSTR, szcomponentcode : windows_sys::core::PWSTR) -> u32);

// UNSUPPORTED Rust 191:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiGetSourcePathA(hinstall : MSIHANDLE, szfolder : windows_sys::core::PCSTR, szpathbuf : windows_sys::core::PSTR, pcchpathbuf : *mut u32) -> u32);

// UNSUPPORTED Rust 192:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiGetSourcePathW(hinstall : MSIHANDLE, szfolder : windows_sys::core::PCWSTR, szpathbuf : windows_sys::core::PWSTR, pcchpathbuf : *mut u32) -> u32);

// UNSUPPORTED Rust 193:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiGetSummaryInformationA(hdatabase : MSIHANDLE, szdatabasepath : windows_sys::core::PCSTR, uiupdatecount : u32, phsummaryinfo : *mut MSIHANDLE) -> u32);

// UNSUPPORTED Rust 194:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiGetSummaryInformationW(hdatabase : MSIHANDLE, szdatabasepath : windows_sys::core::PCWSTR, uiupdatecount : u32, phsummaryinfo : *mut MSIHANDLE) -> u32);

// UNSUPPORTED Rust 195:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiGetTargetPathA(hinstall : MSIHANDLE, szfolder : windows_sys::core::PCSTR, szpathbuf : windows_sys::core::PSTR, pcchpathbuf : *mut u32) -> u32);

// UNSUPPORTED Rust 196:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiGetTargetPathW(hinstall : MSIHANDLE, szfolder : windows_sys::core::PCWSTR, szpathbuf : windows_sys::core::PWSTR, pcchpathbuf : *mut u32) -> u32);

// UNSUPPORTED Rust 197:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiGetUserInfoA(szproduct : windows_sys::core::PCSTR, lpusernamebuf : windows_sys::core::PSTR, pcchusernamebuf : *mut u32, lporgnamebuf : windows_sys::core::PSTR, pcchorgnamebuf : *mut u32, lpserialbuf : windows_sys::core::PSTR, pcchserialbuf : *mut u32) -> USERINFOSTATE);

// UNSUPPORTED Rust 198:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiGetUserInfoW(szproduct : windows_sys::core::PCWSTR, lpusernamebuf : windows_sys::core::PWSTR, pcchusernamebuf : *mut u32, lporgnamebuf : windows_sys::core::PWSTR, pcchorgnamebuf : *mut u32, lpserialbuf : windows_sys::core::PWSTR, pcchserialbuf : *mut u32) -> USERINFOSTATE);

// UNSUPPORTED Rust 199:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiInstallMissingComponentA(szproduct : windows_sys::core::PCSTR, szcomponent : windows_sys::core::PCSTR, einstallstate : INSTALLSTATE) -> u32);

// UNSUPPORTED Rust 200:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiInstallMissingComponentW(szproduct : windows_sys::core::PCWSTR, szcomponent : windows_sys::core::PCWSTR, einstallstate : INSTALLSTATE) -> u32);

// UNSUPPORTED Rust 201:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiInstallMissingFileA(szproduct : windows_sys::core::PCSTR, szfile : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 202:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiInstallMissingFileW(szproduct : windows_sys::core::PCWSTR, szfile : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 203:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiInstallProductA(szpackagepath : windows_sys::core::PCSTR, szcommandline : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 204:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiInstallProductW(szpackagepath : windows_sys::core::PCWSTR, szcommandline : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 205:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiIsProductElevatedA(szproduct : windows_sys::core::PCSTR, pfelevated : *mut windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 206:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiIsProductElevatedW(szproduct : windows_sys::core::PCWSTR, pfelevated : *mut windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 207:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiJoinTransaction(htransactionhandle : MSIHANDLE, dwtransactionattributes : u32, phchangeofownerevent : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 208:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiLocateComponentA(szcomponent : windows_sys::core::PCSTR, lppathbuf : windows_sys::core::PSTR, pcchbuf : *mut u32) -> INSTALLSTATE);

// UNSUPPORTED Rust 209:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiLocateComponentW(szcomponent : windows_sys::core::PCWSTR, lppathbuf : windows_sys::core::PWSTR, pcchbuf : *mut u32) -> INSTALLSTATE);

// UNSUPPORTED Rust 210:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiNotifySidChangeA(poldsid : windows_sys::core::PCSTR, pnewsid : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 211:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiNotifySidChangeW(poldsid : windows_sys::core::PCWSTR, pnewsid : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 212:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiOpenDatabaseA(szdatabasepath : windows_sys::core::PCSTR, szpersist : windows_sys::core::PCSTR, phdatabase : *mut MSIHANDLE) -> u32);

// UNSUPPORTED Rust 213:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiOpenDatabaseW(szdatabasepath : windows_sys::core::PCWSTR, szpersist : windows_sys::core::PCWSTR, phdatabase : *mut MSIHANDLE) -> u32);

// UNSUPPORTED Rust 214:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiOpenPackageA(szpackagepath : windows_sys::core::PCSTR, hproduct : *mut MSIHANDLE) -> u32);

// UNSUPPORTED Rust 215:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiOpenPackageExA(szpackagepath : windows_sys::core::PCSTR, dwoptions : u32, hproduct : *mut MSIHANDLE) -> u32);

// UNSUPPORTED Rust 216:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiOpenPackageExW(szpackagepath : windows_sys::core::PCWSTR, dwoptions : u32, hproduct : *mut MSIHANDLE) -> u32);

// UNSUPPORTED Rust 217:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiOpenPackageW(szpackagepath : windows_sys::core::PCWSTR, hproduct : *mut MSIHANDLE) -> u32);

// UNSUPPORTED Rust 218:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiOpenProductA(szproduct : windows_sys::core::PCSTR, hproduct : *mut MSIHANDLE) -> u32);

// UNSUPPORTED Rust 219:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiOpenProductW(szproduct : windows_sys::core::PCWSTR, hproduct : *mut MSIHANDLE) -> u32);

// UNSUPPORTED Rust 220:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiPreviewBillboardA(hpreview : MSIHANDLE, szcontrolname : windows_sys::core::PCSTR, szbillboard : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 221:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiPreviewBillboardW(hpreview : MSIHANDLE, szcontrolname : windows_sys::core::PCWSTR, szbillboard : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 222:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiPreviewDialogA(hpreview : MSIHANDLE, szdialogname : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 223:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiPreviewDialogW(hpreview : MSIHANDLE, szdialogname : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 224:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("msi.dll" "system" fn MsiProcessAdvertiseScriptA(szscriptfile : windows_sys::core::PCSTR, sziconfolder : windows_sys::core::PCSTR, hregdata : super::Registry:: HKEY, fshortcuts : windows_sys::core::BOOL, fremoveitems : windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 226:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("msi.dll" "system" fn MsiProcessAdvertiseScriptW(szscriptfile : windows_sys::core::PCWSTR, sziconfolder : windows_sys::core::PCWSTR, hregdata : super::Registry:: HKEY, fshortcuts : windows_sys::core::BOOL, fremoveitems : windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 228:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiProcessMessage(hinstall : MSIHANDLE, emessagetype : INSTALLMESSAGE, hrecord : MSIHANDLE) -> i32);

// UNSUPPORTED Rust 229:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiProvideAssemblyA(szassemblyname : windows_sys::core::PCSTR, szappcontext : windows_sys::core::PCSTR, dwinstallmode : u32, dwassemblyinfo : MSIASSEMBLYINFO, lppathbuf : windows_sys::core::PSTR, pcchpathbuf : *mut u32) -> u32);

// UNSUPPORTED Rust 230:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiProvideAssemblyW(szassemblyname : windows_sys::core::PCWSTR, szappcontext : windows_sys::core::PCWSTR, dwinstallmode : u32, dwassemblyinfo : MSIASSEMBLYINFO, lppathbuf : windows_sys::core::PWSTR, pcchpathbuf : *mut u32) -> u32);

// UNSUPPORTED Rust 231:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiProvideComponentA(szproduct : windows_sys::core::PCSTR, szfeature : windows_sys::core::PCSTR, szcomponent : windows_sys::core::PCSTR, dwinstallmode : u32, lppathbuf : windows_sys::core::PSTR, pcchpathbuf : *mut u32) -> u32);

// UNSUPPORTED Rust 232:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiProvideComponentW(szproduct : windows_sys::core::PCWSTR, szfeature : windows_sys::core::PCWSTR, szcomponent : windows_sys::core::PCWSTR, dwinstallmode : u32, lppathbuf : windows_sys::core::PWSTR, pcchpathbuf : *mut u32) -> u32);

// UNSUPPORTED Rust 233:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiProvideQualifiedComponentA(szcategory : windows_sys::core::PCSTR, szqualifier : windows_sys::core::PCSTR, dwinstallmode : u32, lppathbuf : windows_sys::core::PSTR, pcchpathbuf : *mut u32) -> u32);

// UNSUPPORTED Rust 234:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiProvideQualifiedComponentExA(szcategory : windows_sys::core::PCSTR, szqualifier : windows_sys::core::PCSTR, dwinstallmode : u32, szproduct : windows_sys::core::PCSTR, dwunused1 : u32, dwunused2 : u32, lppathbuf : windows_sys::core::PSTR, pcchpathbuf : *mut u32) -> u32);

// UNSUPPORTED Rust 235:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiProvideQualifiedComponentExW(szcategory : windows_sys::core::PCWSTR, szqualifier : windows_sys::core::PCWSTR, dwinstallmode : u32, szproduct : windows_sys::core::PCWSTR, dwunused1 : u32, dwunused2 : u32, lppathbuf : windows_sys::core::PWSTR, pcchpathbuf : *mut u32) -> u32);

// UNSUPPORTED Rust 236:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiProvideQualifiedComponentW(szcategory : windows_sys::core::PCWSTR, szqualifier : windows_sys::core::PCWSTR, dwinstallmode : u32, lppathbuf : windows_sys::core::PWSTR, pcchpathbuf : *mut u32) -> u32);

// UNSUPPORTED Rust 237:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiQueryComponentStateA(szproductcode : windows_sys::core::PCSTR, szusersid : windows_sys::core::PCSTR, dwcontext : MSIINSTALLCONTEXT, szcomponentcode : windows_sys::core::PCSTR, pdwstate : *mut INSTALLSTATE) -> u32);

// UNSUPPORTED Rust 238:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiQueryComponentStateW(szproductcode : windows_sys::core::PCWSTR, szusersid : windows_sys::core::PCWSTR, dwcontext : MSIINSTALLCONTEXT, szcomponentcode : windows_sys::core::PCWSTR, pdwstate : *mut INSTALLSTATE) -> u32);

// UNSUPPORTED Rust 239:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiQueryFeatureStateA(szproduct : windows_sys::core::PCSTR, szfeature : windows_sys::core::PCSTR) -> INSTALLSTATE);

// UNSUPPORTED Rust 240:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiQueryFeatureStateExA(szproductcode : windows_sys::core::PCSTR, szusersid : windows_sys::core::PCSTR, dwcontext : MSIINSTALLCONTEXT, szfeature : windows_sys::core::PCSTR, pdwstate : *mut INSTALLSTATE) -> u32);

// UNSUPPORTED Rust 241:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiQueryFeatureStateExW(szproductcode : windows_sys::core::PCWSTR, szusersid : windows_sys::core::PCWSTR, dwcontext : MSIINSTALLCONTEXT, szfeature : windows_sys::core::PCWSTR, pdwstate : *mut INSTALLSTATE) -> u32);

// UNSUPPORTED Rust 242:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiQueryFeatureStateW(szproduct : windows_sys::core::PCWSTR, szfeature : windows_sys::core::PCWSTR) -> INSTALLSTATE);

// UNSUPPORTED Rust 243:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiQueryProductStateA(szproduct : windows_sys::core::PCSTR) -> INSTALLSTATE);

// UNSUPPORTED Rust 244:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiQueryProductStateW(szproduct : windows_sys::core::PCWSTR) -> INSTALLSTATE);

// UNSUPPORTED Rust 245:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiRecordClearData(hrecord : MSIHANDLE) -> u32);

// UNSUPPORTED Rust 246:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiRecordDataSize(hrecord : MSIHANDLE, ifield : u32) -> u32);

// UNSUPPORTED Rust 247:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiRecordGetFieldCount(hrecord : MSIHANDLE) -> u32);

// UNSUPPORTED Rust 248:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiRecordGetInteger(hrecord : MSIHANDLE, ifield : u32) -> i32);

// UNSUPPORTED Rust 249:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiRecordGetStringA(hrecord : MSIHANDLE, ifield : u32, szvaluebuf : windows_sys::core::PSTR, pcchvaluebuf : *mut u32) -> u32);

// UNSUPPORTED Rust 250:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiRecordGetStringW(hrecord : MSIHANDLE, ifield : u32, szvaluebuf : windows_sys::core::PWSTR, pcchvaluebuf : *mut u32) -> u32);

// UNSUPPORTED Rust 251:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiRecordIsNull(hrecord : MSIHANDLE, ifield : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 252:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiRecordReadStream(hrecord : MSIHANDLE, ifield : u32, szdatabuf : windows_sys::core::PSTR, pcbdatabuf : *mut u32) -> u32);

// UNSUPPORTED Rust 253:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiRecordSetInteger(hrecord : MSIHANDLE, ifield : u32, ivalue : i32) -> u32);

// UNSUPPORTED Rust 254:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiRecordSetStreamA(hrecord : MSIHANDLE, ifield : u32, szfilepath : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 255:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiRecordSetStreamW(hrecord : MSIHANDLE, ifield : u32, szfilepath : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 256:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiRecordSetStringA(hrecord : MSIHANDLE, ifield : u32, szvalue : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 257:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiRecordSetStringW(hrecord : MSIHANDLE, ifield : u32, szvalue : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 258:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiReinstallFeatureA(szproduct : windows_sys::core::PCSTR, szfeature : windows_sys::core::PCSTR, dwreinstallmode : u32) -> u32);

// UNSUPPORTED Rust 259:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiReinstallFeatureW(szproduct : windows_sys::core::PCWSTR, szfeature : windows_sys::core::PCWSTR, dwreinstallmode : u32) -> u32);

// UNSUPPORTED Rust 260:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiReinstallProductA(szproduct : windows_sys::core::PCSTR, szreinstallmode : u32) -> u32);

// UNSUPPORTED Rust 261:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiReinstallProductW(szproduct : windows_sys::core::PCWSTR, szreinstallmode : u32) -> u32);

// UNSUPPORTED Rust 262:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiRemovePatchesA(szpatchlist : windows_sys::core::PCSTR, szproductcode : windows_sys::core::PCSTR, euninstalltype : INSTALLTYPE, szpropertylist : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 263:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiRemovePatchesW(szpatchlist : windows_sys::core::PCWSTR, szproductcode : windows_sys::core::PCWSTR, euninstalltype : INSTALLTYPE, szpropertylist : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 264:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiSequenceA(hinstall : MSIHANDLE, sztable : windows_sys::core::PCSTR, isequencemode : i32) -> u32);

// UNSUPPORTED Rust 265:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiSequenceW(hinstall : MSIHANDLE, sztable : windows_sys::core::PCWSTR, isequencemode : i32) -> u32);

// UNSUPPORTED Rust 266:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiSetComponentStateA(hinstall : MSIHANDLE, szcomponent : windows_sys::core::PCSTR, istate : INSTALLSTATE) -> u32);

// UNSUPPORTED Rust 267:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiSetComponentStateW(hinstall : MSIHANDLE, szcomponent : windows_sys::core::PCWSTR, istate : INSTALLSTATE) -> u32);

// UNSUPPORTED Rust 268:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiSetExternalUIA(puihandler : INSTALLUI_HANDLERA, dwmessagefilter : u32, pvcontext : *const core::ffi::c_void) -> INSTALLUI_HANDLERA);

// UNSUPPORTED Rust 269:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiSetExternalUIRecord(puihandler : PINSTALLUI_HANDLER_RECORD, dwmessagefilter : u32, pvcontext : *const core::ffi::c_void, ppuiprevhandler : PINSTALLUI_HANDLER_RECORD) -> u32);

// UNSUPPORTED Rust 270:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiSetExternalUIW(puihandler : INSTALLUI_HANDLERW, dwmessagefilter : u32, pvcontext : *const core::ffi::c_void) -> INSTALLUI_HANDLERW);

// UNSUPPORTED Rust 271:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiSetFeatureAttributesA(hinstall : MSIHANDLE, szfeature : windows_sys::core::PCSTR, dwattributes : u32) -> u32);

// UNSUPPORTED Rust 272:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiSetFeatureAttributesW(hinstall : MSIHANDLE, szfeature : windows_sys::core::PCWSTR, dwattributes : u32) -> u32);

// UNSUPPORTED Rust 273:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiSetFeatureStateA(hinstall : MSIHANDLE, szfeature : windows_sys::core::PCSTR, istate : INSTALLSTATE) -> u32);

// UNSUPPORTED Rust 274:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiSetFeatureStateW(hinstall : MSIHANDLE, szfeature : windows_sys::core::PCWSTR, istate : INSTALLSTATE) -> u32);

// UNSUPPORTED Rust 275:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiSetInstallLevel(hinstall : MSIHANDLE, iinstalllevel : i32) -> u32);

// UNSUPPORTED Rust 276:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiSetInternalUI(dwuilevel : INSTALLUILEVEL, phwnd : *mut super::super::Foundation:: HWND) -> INSTALLUILEVEL);

// UNSUPPORTED Rust 277:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiSetMode(hinstall : MSIHANDLE, erunmode : MSIRUNMODE, fstate : windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 278:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiSetPropertyA(hinstall : MSIHANDLE, szname : windows_sys::core::PCSTR, szvalue : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 279:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiSetPropertyW(hinstall : MSIHANDLE, szname : windows_sys::core::PCWSTR, szvalue : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 280:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiSetTargetPathA(hinstall : MSIHANDLE, szfolder : windows_sys::core::PCSTR, szfolderpath : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 281:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiSetTargetPathW(hinstall : MSIHANDLE, szfolder : windows_sys::core::PCWSTR, szfolderpath : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 282:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiSourceListAddMediaDiskA(szproductcodeorpatchcode : windows_sys::core::PCSTR, szusersid : windows_sys::core::PCSTR, dwcontext : MSIINSTALLCONTEXT, dwoptions : u32, dwdiskid : u32, szvolumelabel : windows_sys::core::PCSTR, szdiskprompt : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 283:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiSourceListAddMediaDiskW(szproductcodeorpatchcode : windows_sys::core::PCWSTR, szusersid : windows_sys::core::PCWSTR, dwcontext : MSIINSTALLCONTEXT, dwoptions : u32, dwdiskid : u32, szvolumelabel : windows_sys::core::PCWSTR, szdiskprompt : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 284:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiSourceListAddSourceA(szproduct : windows_sys::core::PCSTR, szusername : windows_sys::core::PCSTR, dwreserved : u32, szsource : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 285:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiSourceListAddSourceExA(szproductcodeorpatchcode : windows_sys::core::PCSTR, szusersid : windows_sys::core::PCSTR, dwcontext : MSIINSTALLCONTEXT, dwoptions : u32, szsource : windows_sys::core::PCSTR, dwindex : u32) -> u32);

// UNSUPPORTED Rust 286:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiSourceListAddSourceExW(szproductcodeorpatchcode : windows_sys::core::PCWSTR, szusersid : windows_sys::core::PCWSTR, dwcontext : MSIINSTALLCONTEXT, dwoptions : u32, szsource : windows_sys::core::PCWSTR, dwindex : u32) -> u32);

// UNSUPPORTED Rust 287:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiSourceListAddSourceW(szproduct : windows_sys::core::PCWSTR, szusername : windows_sys::core::PCWSTR, dwreserved : u32, szsource : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 288:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiSourceListClearAllA(szproduct : windows_sys::core::PCSTR, szusername : windows_sys::core::PCSTR, dwreserved : u32) -> u32);

// UNSUPPORTED Rust 289:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiSourceListClearAllExA(szproductcodeorpatchcode : windows_sys::core::PCSTR, szusersid : windows_sys::core::PCSTR, dwcontext : MSIINSTALLCONTEXT, dwoptions : u32) -> u32);

// UNSUPPORTED Rust 290:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiSourceListClearAllExW(szproductcodeorpatchcode : windows_sys::core::PCWSTR, szusersid : windows_sys::core::PCWSTR, dwcontext : MSIINSTALLCONTEXT, dwoptions : u32) -> u32);

// UNSUPPORTED Rust 291:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiSourceListClearAllW(szproduct : windows_sys::core::PCWSTR, szusername : windows_sys::core::PCWSTR, dwreserved : u32) -> u32);

// UNSUPPORTED Rust 292:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiSourceListClearMediaDiskA(szproductcodeorpatchcode : windows_sys::core::PCSTR, szusersid : windows_sys::core::PCSTR, dwcontext : MSIINSTALLCONTEXT, dwoptions : u32, dwdiskid : u32) -> u32);

// UNSUPPORTED Rust 293:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiSourceListClearMediaDiskW(szproductcodeorpatchcode : windows_sys::core::PCWSTR, szusersid : windows_sys::core::PCWSTR, dwcontext : MSIINSTALLCONTEXT, dwoptions : u32, dwdiskid : u32) -> u32);

// UNSUPPORTED Rust 294:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiSourceListClearSourceA(szproductcodeorpatchcode : windows_sys::core::PCSTR, szusersid : windows_sys::core::PCSTR, dwcontext : MSIINSTALLCONTEXT, dwoptions : u32, szsource : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 295:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiSourceListClearSourceW(szproductcodeorpatchcode : windows_sys::core::PCWSTR, szusersid : windows_sys::core::PCWSTR, dwcontext : MSIINSTALLCONTEXT, dwoptions : u32, szsource : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 296:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiSourceListEnumMediaDisksA(szproductcodeorpatchcode : windows_sys::core::PCSTR, szusersid : windows_sys::core::PCSTR, dwcontext : MSIINSTALLCONTEXT, dwoptions : u32, dwindex : u32, pdwdiskid : *mut u32, szvolumelabel : windows_sys::core::PSTR, pcchvolumelabel : *mut u32, szdiskprompt : windows_sys::core::PSTR, pcchdiskprompt : *mut u32) -> u32);

// UNSUPPORTED Rust 297:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiSourceListEnumMediaDisksW(szproductcodeorpatchcode : windows_sys::core::PCWSTR, szusersid : windows_sys::core::PCWSTR, dwcontext : MSIINSTALLCONTEXT, dwoptions : u32, dwindex : u32, pdwdiskid : *mut u32, szvolumelabel : windows_sys::core::PWSTR, pcchvolumelabel : *mut u32, szdiskprompt : windows_sys::core::PWSTR, pcchdiskprompt : *mut u32) -> u32);

// UNSUPPORTED Rust 298:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiSourceListEnumSourcesA(szproductcodeorpatchcode : windows_sys::core::PCSTR, szusersid : windows_sys::core::PCSTR, dwcontext : MSIINSTALLCONTEXT, dwoptions : u32, dwindex : u32, szsource : windows_sys::core::PSTR, pcchsource : *mut u32) -> u32);

// UNSUPPORTED Rust 299:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiSourceListEnumSourcesW(szproductcodeorpatchcode : windows_sys::core::PCWSTR, szusersid : windows_sys::core::PCWSTR, dwcontext : MSIINSTALLCONTEXT, dwoptions : u32, dwindex : u32, szsource : windows_sys::core::PWSTR, pcchsource : *mut u32) -> u32);

// UNSUPPORTED Rust 300:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiSourceListForceResolutionA(szproduct : windows_sys::core::PCSTR, szusername : windows_sys::core::PCSTR, dwreserved : u32) -> u32);

// UNSUPPORTED Rust 301:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiSourceListForceResolutionExA(szproductcodeorpatchcode : windows_sys::core::PCSTR, szusersid : windows_sys::core::PCSTR, dwcontext : MSIINSTALLCONTEXT, dwoptions : u32) -> u32);

// UNSUPPORTED Rust 302:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiSourceListForceResolutionExW(szproductcodeorpatchcode : windows_sys::core::PCWSTR, szusersid : windows_sys::core::PCWSTR, dwcontext : MSIINSTALLCONTEXT, dwoptions : u32) -> u32);

// UNSUPPORTED Rust 303:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiSourceListForceResolutionW(szproduct : windows_sys::core::PCWSTR, szusername : windows_sys::core::PCWSTR, dwreserved : u32) -> u32);

// UNSUPPORTED Rust 304:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiSourceListGetInfoA(szproductcodeorpatchcode : windows_sys::core::PCSTR, szusersid : windows_sys::core::PCSTR, dwcontext : MSIINSTALLCONTEXT, dwoptions : u32, szproperty : windows_sys::core::PCSTR, szvalue : windows_sys::core::PSTR, pcchvalue : *mut u32) -> u32);

// UNSUPPORTED Rust 305:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiSourceListGetInfoW(szproductcodeorpatchcode : windows_sys::core::PCWSTR, szusersid : windows_sys::core::PCWSTR, dwcontext : MSIINSTALLCONTEXT, dwoptions : u32, szproperty : windows_sys::core::PCWSTR, szvalue : windows_sys::core::PWSTR, pcchvalue : *mut u32) -> u32);

// UNSUPPORTED Rust 306:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiSourceListSetInfoA(szproductcodeorpatchcode : windows_sys::core::PCSTR, szusersid : windows_sys::core::PCSTR, dwcontext : MSIINSTALLCONTEXT, dwoptions : u32, szproperty : windows_sys::core::PCSTR, szvalue : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 307:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiSourceListSetInfoW(szproductcodeorpatchcode : windows_sys::core::PCWSTR, szusersid : windows_sys::core::PCWSTR, dwcontext : MSIINSTALLCONTEXT, dwoptions : u32, szproperty : windows_sys::core::PCWSTR, szvalue : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 308:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiSummaryInfoGetPropertyA(hsummaryinfo : MSIHANDLE, uiproperty : u32, puidatatype : *mut u32, pivalue : *mut i32, pftvalue : *mut super::super::Foundation:: FILETIME, szvaluebuf : windows_sys::core::PSTR, pcchvaluebuf : *mut u32) -> u32);

// UNSUPPORTED Rust 309:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiSummaryInfoGetPropertyCount(hsummaryinfo : MSIHANDLE, puipropertycount : *mut u32) -> u32);

// UNSUPPORTED Rust 310:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiSummaryInfoGetPropertyW(hsummaryinfo : MSIHANDLE, uiproperty : u32, puidatatype : *mut u32, pivalue : *mut i32, pftvalue : *mut super::super::Foundation:: FILETIME, szvaluebuf : windows_sys::core::PWSTR, pcchvaluebuf : *mut u32) -> u32);

// UNSUPPORTED Rust 311:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiSummaryInfoPersist(hsummaryinfo : MSIHANDLE) -> u32);

// UNSUPPORTED Rust 312:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiSummaryInfoSetPropertyA(hsummaryinfo : MSIHANDLE, uiproperty : u32, uidatatype : u32, ivalue : i32, pftvalue : *mut super::super::Foundation:: FILETIME, szvalue : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 313:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiSummaryInfoSetPropertyW(hsummaryinfo : MSIHANDLE, uiproperty : u32, uidatatype : u32, ivalue : i32, pftvalue : *mut super::super::Foundation:: FILETIME, szvalue : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 314:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiUseFeatureA(szproduct : windows_sys::core::PCSTR, szfeature : windows_sys::core::PCSTR) -> INSTALLSTATE);

// UNSUPPORTED Rust 315:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiUseFeatureExA(szproduct : windows_sys::core::PCSTR, szfeature : windows_sys::core::PCSTR, dwinstallmode : u32, dwreserved : u32) -> INSTALLSTATE);

// UNSUPPORTED Rust 316:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiUseFeatureExW(szproduct : windows_sys::core::PCWSTR, szfeature : windows_sys::core::PCWSTR, dwinstallmode : u32, dwreserved : u32) -> INSTALLSTATE);

// UNSUPPORTED Rust 317:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiUseFeatureW(szproduct : windows_sys::core::PCWSTR, szfeature : windows_sys::core::PCWSTR) -> INSTALLSTATE);

// UNSUPPORTED Rust 318:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiVerifyDiskSpace(hinstall : MSIHANDLE) -> u32);

// UNSUPPORTED Rust 319:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiVerifyPackageA(szpackagepath : windows_sys::core::PCSTR) -> u32);

// UNSUPPORTED Rust 320:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiVerifyPackageW(szpackagepath : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 321:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiViewClose(hview : MSIHANDLE) -> u32);

// UNSUPPORTED Rust 322:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiViewExecute(hview : MSIHANDLE, hrecord : MSIHANDLE) -> u32);

// UNSUPPORTED Rust 323:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiViewFetch(hview : MSIHANDLE, phrecord : *mut MSIHANDLE) -> u32);

// UNSUPPORTED Rust 324:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiViewGetColumnInfo(hview : MSIHANDLE, ecolumninfo : MSICOLINFO, phrecord : *mut MSIHANDLE) -> u32);

// UNSUPPORTED Rust 325:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiViewGetErrorA(hview : MSIHANDLE, szcolumnnamebuffer : windows_sys::core::PSTR, pcchbuf : *mut u32) -> MSIDBERROR);

// UNSUPPORTED Rust 326:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiViewGetErrorW(hview : MSIHANDLE, szcolumnnamebuffer : windows_sys::core::PWSTR, pcchbuf : *mut u32) -> MSIDBERROR);

// UNSUPPORTED Rust 327:1: declaration Macro has no candidate rule
// windows_link::link!("msi.dll" "system" fn MsiViewModify(hview : MSIHANDLE, emodifymode : MSIMODIFY, hrecord : MSIHANDLE) -> u32);

// UNSUPPORTED Rust 328:1: declaration Macro has no candidate rule
// windows_link::link!("mspatcha.dll" "system" fn NormalizeFileForPatchSignature(filebuffer : *mut core::ffi::c_void, filesize : u32, optionflags : u32, optiondata : *const PATCH_OPTION_DATA, newfilecoffbase : u32, newfilecofftime : u32, ignorerangecount : u32, ignorerangearray : *const PATCH_IGNORE_RANGE, retainrangecount : u32, retainrangearray : *const PATCH_RETAIN_RANGE) -> i32);

// UNSUPPORTED Rust 329:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn QueryActCtxSettingsW(dwflags : u32, hactctx : super::super::Foundation:: HANDLE, settingsnamespace : windows_sys::core::PCWSTR, settingname : windows_sys::core::PCWSTR, pvbuffer : windows_sys::core::PWSTR, dwbuffer : usize, pdwwrittenorrequired : *mut usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 330:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn QueryActCtxW(dwflags : u32, hactctx : super::super::Foundation:: HANDLE, pvsubinstance : *const core::ffi::c_void, ulinfoclass : u32, pvbuffer : *mut core::ffi::c_void, cbbuffer : usize, pcbwrittenorrequired : *mut usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 331:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn ReleaseActCtx(hactctx : super::super::Foundation:: HANDLE));

// UNSUPPORTED Rust 332:1: declaration Macro has no candidate rule
// windows_link::link!("sfc.dll" "system" fn SfcGetNextProtectedFile(rpchandle : super::super::Foundation:: HANDLE, protfiledata : *mut PROTECTED_FILE_DATA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 333:1: declaration Macro has no candidate rule
// windows_link::link!("sfc.dll" "system" fn SfcIsFileProtected(rpchandle : super::super::Foundation:: HANDLE, protfilename : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 334:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("sfc.dll" "system" fn SfcIsKeyProtected(keyhandle : super::Registry:: HKEY, subkeyname : windows_sys::core::PCWSTR, keysam : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 336:1: declaration Macro has no candidate rule
// windows_link::link!("sfc.dll" "system" fn SfpVerifyFile(pszfilename : windows_sys::core::PCSTR, pszerror : windows_sys::core::PCSTR, dwerrsize : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 337:1: declaration Macro has no candidate rule
// windows_link::link!("mspatcha.dll" "system" fn TestApplyPatchToFileA(patchfilename : windows_sys::core::PCSTR, oldfilename : windows_sys::core::PCSTR, applyoptionflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 338:1: declaration Macro has no candidate rule
// windows_link::link!("mspatcha.dll" "system" fn TestApplyPatchToFileByBuffers(patchfilebuffer : *const u8, patchfilesize : u32, oldfilebuffer : *const u8, oldfilesize : u32, newfilesize : *mut u32, applyoptionflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 339:1: declaration Macro has no candidate rule
// windows_link::link!("mspatcha.dll" "system" fn TestApplyPatchToFileByHandles(patchfilehandle : super::super::Foundation:: HANDLE, oldfilehandle : super::super::Foundation:: HANDLE, applyoptionflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 340:1: declaration Macro has no candidate rule
// windows_link::link!("mspatcha.dll" "system" fn TestApplyPatchToFileW(patchfilename : windows_sys::core::PCWSTR, oldfilename : windows_sys::core::PCWSTR, applyoptionflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 341:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn ZombifyActCtx(hactctx : super::super::Foundation:: HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 342:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ACTCTXA {
//     pub cbSize: u32,
//     pub dwFlags: u32,
//     pub lpSource: windows_sys::core::PCSTR,
//     pub wProcessorArchitecture: u16,
//     pub wLangId: u16,
//     pub lpAssemblyDirectory: windows_sys::core::PCSTR,
//     pub lpResourceName: windows_sys::core::PCSTR,
//     pub lpApplicationName: windows_sys::core::PCSTR,
//     pub hModule: super::super::Foundation::HMODULE,
// }

// UNSUPPORTED Rust 355:1: declaration Impl has no candidate rule
// impl Default for ACTCTXA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 360:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ACTCTXW {
//     pub cbSize: u32,
//     pub dwFlags: u32,
//     pub lpSource: windows_sys::core::PCWSTR,
//     pub wProcessorArchitecture: u16,
//     pub wLangId: u16,
//     pub lpAssemblyDirectory: windows_sys::core::PCWSTR,
//     pub lpResourceName: windows_sys::core::PCWSTR,
//     pub lpApplicationName: windows_sys::core::PCWSTR,
//     pub hModule: super::super::Foundation::HMODULE,
// }

// UNSUPPORTED Rust 373:1: declaration Impl has no candidate rule
// impl Default for ACTCTXW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `ACTCTX_COMPATIBILITY_ELEMENT_TYPE` = Int;
public const val `ACTCTX_COMPATIBILITY_ELEMENT_TYPE_MAXVERSIONTESTED`: `ACTCTX_COMPATIBILITY_ELEMENT_TYPE` = 3;
public const val `ACTCTX_COMPATIBILITY_ELEMENT_TYPE_MITIGATION`: `ACTCTX_COMPATIBILITY_ELEMENT_TYPE` = 2;
public const val `ACTCTX_COMPATIBILITY_ELEMENT_TYPE_OS`: `ACTCTX_COMPATIBILITY_ELEMENT_TYPE` = 1;
public const val `ACTCTX_COMPATIBILITY_ELEMENT_TYPE_UNKNOWN`: `ACTCTX_COMPATIBILITY_ELEMENT_TYPE` = 0;
public typealias `ACTCTX_REQUESTED_RUN_LEVEL` = Int;
public const val `ACTCTX_RUN_LEVEL_AS_INVOKER`: `ACTCTX_REQUESTED_RUN_LEVEL` = 1;
public const val `ACTCTX_RUN_LEVEL_HIGHEST_AVAILABLE`: `ACTCTX_REQUESTED_RUN_LEVEL` = 2;
public const val `ACTCTX_RUN_LEVEL_NUMBERS`: `ACTCTX_REQUESTED_RUN_LEVEL` = 4;
public const val `ACTCTX_RUN_LEVEL_REQUIRE_ADMIN`: `ACTCTX_REQUESTED_RUN_LEVEL` = 3;
public const val `ACTCTX_RUN_LEVEL_UNSPECIFIED`: `ACTCTX_REQUESTED_RUN_LEVEL` = 0;
// UNSUPPORTED Rust 389:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_WindowsProgramming")]
// #[derive(Clone, Copy)]
// pub struct ACTCTX_SECTION_KEYED_DATA {
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
//     pub ulFlags: u32,
//     pub AssemblyMetadata: super::WindowsProgramming::ACTCTX_SECTION_KEYED_DATA_ASSEMBLY_METADATA,
// }

// UNSUPPORTED Rust 406:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_WindowsProgramming")]
// impl Default for ACTCTX_SECTION_KEYED_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 412:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION {
//     pub ulFlags: u32,
//     pub ulEncodedAssemblyIdentityLength: u32,
//     pub ulManifestPathType: u32,
//     pub ulManifestPathLength: u32,
//     pub liManifestLastWriteTime: i64,
//     pub ulPolicyPathType: u32,
//     pub ulPolicyPathLength: u32,
//     pub liPolicyLastWriteTime: i64,
//     pub ulMetadataSatelliteRosterIndex: u32,
//     pub ulManifestVersionMajor: u32,
//     pub ulManifestVersionMinor: u32,
//     pub ulPolicyVersionMajor: u32,
//     pub ulPolicyVersionMinor: u32,
//     pub ulAssemblyDirectoryNameLength: u32,
//     pub lpAssemblyEncodedAssemblyIdentity: windows_sys::core::PCWSTR,
//     pub lpAssemblyManifestPath: windows_sys::core::PCWSTR,
//     pub lpAssemblyPolicyPath: windows_sys::core::PCWSTR,
//     pub lpAssemblyDirectoryName: windows_sys::core::PCWSTR,
//     pub ulFileCount: u32,
// }

// UNSUPPORTED Rust 435:1: declaration Impl has no candidate rule
// impl Default for ACTIVATION_CONTEXT_ASSEMBLY_DETAILED_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 440:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ACTIVATION_CONTEXT_COMPATIBILITY_INFORMATION {
//     pub ElementCount: u32,
//     pub Elements: [COMPATIBILITY_CONTEXT_ELEMENT; 1],
// }

// UNSUPPORTED Rust 446:1: declaration Impl has no candidate rule
// impl Default for ACTIVATION_CONTEXT_COMPATIBILITY_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 451:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ACTIVATION_CONTEXT_DETAILED_INFORMATION {
//     pub dwFlags: u32,
//     pub ulFormatVersion: u32,
//     pub ulAssemblyCount: u32,
//     pub ulRootManifestPathType: u32,
//     pub ulRootManifestPathChars: u32,
//     pub ulRootConfigurationPathType: u32,
//     pub ulRootConfigurationPathChars: u32,
//     pub ulAppDirPathType: u32,
//     pub ulAppDirPathChars: u32,
//     pub lpRootManifestPath: windows_sys::core::PCWSTR,
//     pub lpRootConfigurationPath: windows_sys::core::PCWSTR,
//     pub lpAppDirPath: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 467:1: declaration Impl has no candidate rule
// impl Default for ACTIVATION_CONTEXT_DETAILED_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 472:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ACTIVATION_CONTEXT_QUERY_INDEX {
//     pub ulAssemblyIndex: u32,
//     pub ulFileIndexInAssembly: u32,
// }

// UNSUPPORTED Rust 478:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ACTIVATION_CONTEXT_RUN_LEVEL_INFORMATION {
//     pub ulFlags: u32,
//     pub RunLevel: ACTCTX_REQUESTED_RUN_LEVEL,
//     pub UiAccess: u32,
// }

public typealias `ADVERTISEFLAGS` = Int;
public const val `ADVERTISEFLAGS_MACHINEASSIGN`: `ADVERTISEFLAGS` = 0;
public const val `ADVERTISEFLAGS_USERASSIGN`: `ADVERTISEFLAGS` = 1;
public const val `APPLY_OPTION_FAIL_IF_CLOSE`: UInt = 2u;
public const val `APPLY_OPTION_FAIL_IF_EXACT`: UInt = 1u;
public const val `APPLY_OPTION_TEST_ONLY`: UInt = 4u;
public const val `APPLY_OPTION_VALID_FLAGS`: UInt = 7u;
public const val `ASM_BINDF_BINPATH_PROBE_ONLY`: `ASM_BIND_FLAGS` = 8;
public const val `ASM_BINDF_FORCE_CACHE_INSTALL`: `ASM_BIND_FLAGS` = 1;
public const val `ASM_BINDF_PARENT_ASM_HINT`: `ASM_BIND_FLAGS` = 32;
public const val `ASM_BINDF_RFS_INTEGRITY_CHECK`: `ASM_BIND_FLAGS` = 2;
public const val `ASM_BINDF_RFS_MODULE_CHECK`: `ASM_BIND_FLAGS` = 4;
public const val `ASM_BINDF_SHARED_BINPATH_HINT`: `ASM_BIND_FLAGS` = 16;
public typealias `ASM_BIND_FLAGS` = Int;
public const val `ASM_CMPF_ALL`: `ASM_CMP_FLAGS` = 255;
public const val `ASM_CMPF_BUILD_NUMBER`: `ASM_CMP_FLAGS` = 8;
public const val `ASM_CMPF_CULTURE`: `ASM_CMP_FLAGS` = 64;
public const val `ASM_CMPF_CUSTOM`: `ASM_CMP_FLAGS` = 128;
public const val `ASM_CMPF_DEFAULT`: `ASM_CMP_FLAGS` = 256;
public const val `ASM_CMPF_MAJOR_VERSION`: `ASM_CMP_FLAGS` = 2;
public const val `ASM_CMPF_MINOR_VERSION`: `ASM_CMP_FLAGS` = 4;
public const val `ASM_CMPF_NAME`: `ASM_CMP_FLAGS` = 1;
public const val `ASM_CMPF_PUBLIC_KEY_TOKEN`: `ASM_CMP_FLAGS` = 32;
public const val `ASM_CMPF_REVISION_NUMBER`: `ASM_CMP_FLAGS` = 16;
public typealias `ASM_CMP_FLAGS` = Int;
public const val `ASM_DISPLAYF_CULTURE`: `ASM_DISPLAY_FLAGS` = 2;
public const val `ASM_DISPLAYF_CUSTOM`: `ASM_DISPLAY_FLAGS` = 16;
public const val `ASM_DISPLAYF_LANGUAGEID`: `ASM_DISPLAY_FLAGS` = 64;
public const val `ASM_DISPLAYF_PROCESSORARCHITECTURE`: `ASM_DISPLAY_FLAGS` = 32;
public const val `ASM_DISPLAYF_PUBLIC_KEY`: `ASM_DISPLAY_FLAGS` = 8;
public const val `ASM_DISPLAYF_PUBLIC_KEY_TOKEN`: `ASM_DISPLAY_FLAGS` = 4;
public const val `ASM_DISPLAYF_VERSION`: `ASM_DISPLAY_FLAGS` = 1;
public typealias `ASM_DISPLAY_FLAGS` = Int;
public typealias `ASM_NAME` = Int;
public const val `ASM_NAME_ALIAS`: `ASM_NAME` = 12;
public const val `ASM_NAME_BUILD_NUMBER`: `ASM_NAME` = 6;
public const val `ASM_NAME_CODEBASE_LASTMOD`: `ASM_NAME` = 14;
public const val `ASM_NAME_CODEBASE_URL`: `ASM_NAME` = 13;
public const val `ASM_NAME_CULTURE`: `ASM_NAME` = 8;
public const val `ASM_NAME_CUSTOM`: `ASM_NAME` = 17;
public const val `ASM_NAME_HASH_ALGID`: `ASM_NAME` = 11;
public const val `ASM_NAME_HASH_VALUE`: `ASM_NAME` = 2;
public const val `ASM_NAME_MAJOR_VERSION`: `ASM_NAME` = 4;
public const val `ASM_NAME_MAX_PARAMS`: `ASM_NAME` = 20;
public const val `ASM_NAME_MINOR_VERSION`: `ASM_NAME` = 5;
public const val `ASM_NAME_MVID`: `ASM_NAME` = 19;
public const val `ASM_NAME_NAME`: `ASM_NAME` = 3;
public const val `ASM_NAME_NULL_CUSTOM`: `ASM_NAME` = 18;
public const val `ASM_NAME_NULL_PUBLIC_KEY`: `ASM_NAME` = 15;
public const val `ASM_NAME_NULL_PUBLIC_KEY_TOKEN`: `ASM_NAME` = 16;
public const val `ASM_NAME_OSINFO_ARRAY`: `ASM_NAME` = 10;
public const val `ASM_NAME_PROCESSOR_ID_ARRAY`: `ASM_NAME` = 9;
public const val `ASM_NAME_PUBLIC_KEY`: `ASM_NAME` = 0;
public const val `ASM_NAME_PUBLIC_KEY_TOKEN`: `ASM_NAME` = 1;
public const val `ASM_NAME_REVISION_NUMBER`: `ASM_NAME` = 7;
public const val `ASSEMBLYINFO_FLAG_INSTALLED`: UInt = 1u;
public const val `ASSEMBLYINFO_FLAG_PAYLOADRESIDENT`: UInt = 2u;
// UNSUPPORTED Rust 542:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ASSEMBLY_FILE_DETAILED_INFORMATION {
//     pub ulFlags: u32,
//     pub ulFilenameLength: u32,
//     pub ulPathLength: u32,
//     pub lpFileName: windows_sys::core::PCWSTR,
//     pub lpFilePath: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 551:1: declaration Impl has no candidate rule
// impl Default for ASSEMBLY_FILE_DETAILED_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 556:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ASSEMBLY_INFO {
//     pub cbAssemblyInfo: u32,
//     pub dwAssemblyFlags: u32,
//     pub uliAssemblySizeInKB: u64,
//     pub pszCurrentAssemblyPathBuf: windows_sys::core::PWSTR,
//     pub cchBuf: u32,
// }

// UNSUPPORTED Rust 565:1: declaration Impl has no candidate rule
// impl Default for ASSEMBLY_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CANOF_PARSE_DISPLAY_NAME`: `CREATE_ASM_NAME_OBJ_FLAGS` = 1;
public const val `CANOF_SET_DEFAULT_VALUES`: `CREATE_ASM_NAME_OBJ_FLAGS` = 2;
// UNSUPPORTED Rust 572:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CLSID_EvalCom2: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6e5e1910_8053_4660_b795_6b612e29bc58);

// UNSUPPORTED Rust 573:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const CLSID_MsmMerge2: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf94985d5_29f9_4743_9805_99bc3f35b678);

// UNSUPPORTED Rust 574:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct COMPATIBILITY_CONTEXT_ELEMENT {
//     pub Id: windows_sys::core::GUID,
//     pub Type: ACTCTX_COMPATIBILITY_ELEMENT_TYPE,
//     pub MaxVersionTested: u64,
// }

public typealias `CREATE_ASM_NAME_OBJ_FLAGS` = Int;
public const val `DEFAULT_DISK_ID`: UInt = 2u;
public const val `DEFAULT_FILE_SEQUENCE_START`: UInt = 2u;
public const val `DEFAULT_MINIMUM_REQUIRED_MSI_VERSION`: UInt = 100u;
// UNSUPPORTED Rust 585:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DELTA_HASH {
//     pub HashSize: u32,
//     pub HashValue: [u8; 32],
// }

// UNSUPPORTED Rust 591:1: declaration Impl has no candidate rule
// impl Default for DELTA_HASH {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 596:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security_Cryptography")]
// #[derive(Clone, Copy, Default)]
// pub struct DELTA_HEADER_INFO {
//     pub FileTypeSet: i64,
//     pub FileType: i64,
//     pub Flags: i64,
//     pub TargetSize: usize,
//     pub TargetFileTime: super::super::Foundation::FILETIME,
//     pub TargetHashAlgId: super::super::Security::Cryptography::ALG_ID,
//     pub TargetHash: DELTA_HASH,
// }

// UNSUPPORTED Rust 608:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DELTA_INPUT {
//     pub Anonymous: DELTA_INPUT_0,
//     pub uSize: usize,
//     pub Editable: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 615:1: declaration Impl has no candidate rule
// impl Default for DELTA_INPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 620:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DELTA_INPUT_0 {
//     pub lpcStart: *const core::ffi::c_void,
//     pub lpStart: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 626:1: declaration Impl has no candidate rule
// impl Default for DELTA_INPUT_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DELTA_MAX_HASH_SIZE`: UInt = 32u;
// UNSUPPORTED Rust 632:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DELTA_OUTPUT {
//     pub lpStart: *mut core::ffi::c_void,
//     pub uSize: usize,
// }

// UNSUPPORTED Rust 638:1: declaration Impl has no candidate rule
// impl Default for DELTA_OUTPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ERROR_PATCH_BIGGER_THAN_COMPRESSED`: UInt = 3222155525u;
public const val `ERROR_PATCH_CORRUPT`: UInt = 3222159618u;
public const val `ERROR_PATCH_DECODE_FAILURE`: UInt = 3222159617u;
public const val `ERROR_PATCH_ENCODE_FAILURE`: UInt = 3222155521u;
public const val `ERROR_PATCH_IMAGEHLP_FAILURE`: UInt = 3222155526u;
public const val `ERROR_PATCH_INVALID_OPTIONS`: UInt = 3222155522u;
public const val `ERROR_PATCH_NEWER_FORMAT`: UInt = 3222159619u;
public const val `ERROR_PATCH_NOT_AVAILABLE`: UInt = 3222159622u;
public const val `ERROR_PATCH_NOT_NECESSARY`: UInt = 3222159621u;
public const val `ERROR_PATCH_RETAIN_RANGES_DIFFER`: UInt = 3222155524u;
public const val `ERROR_PATCH_SAME_FILE`: UInt = 3222155523u;
public const val `ERROR_PATCH_WRONG_FILE`: UInt = 3222159620u;
public const val `ERROR_PCW_BAD_API_PATCHING_SYMBOL_FLAGS`: UInt = 3222163725u;
public const val `ERROR_PCW_BAD_FAMILY_RANGE_NAME`: UInt = 3222163801u;
public const val `ERROR_PCW_BAD_FILE_SEQUENCE_START`: UInt = 3222163770u;
public const val `ERROR_PCW_BAD_GUIDS_TO_REPLACE`: UInt = 3222163721u;
public const val `ERROR_PCW_BAD_IMAGE_FAMILY_DISKID`: UInt = 3222163773u;
public const val `ERROR_PCW_BAD_IMAGE_FAMILY_FILESEQSTART`: UInt = 3222163774u;
public const val `ERROR_PCW_BAD_IMAGE_FAMILY_NAME`: UInt = 3222163748u;
public const val `ERROR_PCW_BAD_IMAGE_FAMILY_SRC_PROP`: UInt = 3222163750u;
public const val `ERROR_PCW_BAD_MAJOR_VERSION`: UInt = 3222163853u;
public const val `ERROR_PCW_BAD_PATCH_GUID`: UInt = 3222163720u;
public const val `ERROR_PCW_BAD_PRODUCTVERSION_VALIDATION`: UInt = 3222163844u;
public const val `ERROR_PCW_BAD_SEQUENCE`: UInt = 3222163848u;
public const val `ERROR_PCW_BAD_SUPERCEDENCE`: UInt = 3222163847u;
public const val `ERROR_PCW_BAD_TARGET`: UInt = 3222163849u;
public const val `ERROR_PCW_BAD_TARGET_IMAGE_NAME`: UInt = 3222163736u;
public const val `ERROR_PCW_BAD_TARGET_IMAGE_PRODUCT_CODE`: UInt = 3222163834u;
public const val `ERROR_PCW_BAD_TARGET_IMAGE_PRODUCT_VERSION`: UInt = 3222163835u;
public const val `ERROR_PCW_BAD_TARGET_IMAGE_UPGRADED`: UInt = 3222163776u;
public const val `ERROR_PCW_BAD_TARGET_IMAGE_UPGRADE_CODE`: UInt = 3222163836u;
public const val `ERROR_PCW_BAD_TARGET_PRODUCT_CODE_LIST`: UInt = 3222163722u;
public const val `ERROR_PCW_BAD_TGT_UPD_IMAGES`: UInt = 3222163846u;
public const val `ERROR_PCW_BAD_TRANSFORMSET`: UInt = 3222163845u;
public const val `ERROR_PCW_BAD_UPGRADED_IMAGE_FAMILY`: UInt = 3222163775u;
public const val `ERROR_PCW_BAD_UPGRADED_IMAGE_NAME`: UInt = 3222163728u;
public const val `ERROR_PCW_BAD_UPGRADED_IMAGE_PRODUCT_CODE`: UInt = 3222163831u;
public const val `ERROR_PCW_BAD_UPGRADED_IMAGE_PRODUCT_VERSION`: UInt = 3222163832u;
public const val `ERROR_PCW_BAD_UPGRADED_IMAGE_UPGRADE_CODE`: UInt = 3222163833u;
public const val `ERROR_PCW_BAD_VERSION_STRING`: UInt = 3222163852u;
public const val `ERROR_PCW_BASE`: UInt = 3222163713u;
public const val `ERROR_PCW_CANNOT_CREATE_TABLE`: UInt = 3222163841u;
public const val `ERROR_PCW_CANNOT_RUN_MAKECAB`: UInt = 3222163782u;
public const val `ERROR_PCW_CANNOT_WRITE_DDF`: UInt = 3222163781u;
public const val `ERROR_PCW_CANT_COPY_FILE_TO_TEMP_FOLDER`: UInt = 3222163771u;
public const val `ERROR_PCW_CANT_CREATE_ONE_PATCH_FILE`: UInt = 3222163772u;
public const val `ERROR_PCW_CANT_CREATE_PATCH_FILE`: UInt = 3222163718u;
public const val `ERROR_PCW_CANT_CREATE_SUMMARY_INFO`: UInt = 3222163828u;
public const val `ERROR_PCW_CANT_CREATE_SUMMARY_INFO_POUND`: UInt = 3222163830u;
public const val `ERROR_PCW_CANT_CREATE_TEMP_FOLDER`: UInt = 3222163715u;
public const val `ERROR_PCW_CANT_DELETE_TEMP_FOLDER`: UInt = 3222163974u;
public const val `ERROR_PCW_CANT_GENERATE_SEQUENCEINFO_MAJORUPGD`: UInt = 3222163842u;
public const val `ERROR_PCW_CANT_GENERATE_TRANSFORM`: UInt = 3222163827u;
public const val `ERROR_PCW_CANT_GENERATE_TRANSFORM_POUND`: UInt = 3222163829u;
public const val `ERROR_PCW_CANT_OVERWRITE_PATCH`: UInt = 3222163717u;
public const val `ERROR_PCW_CANT_READ_FILE`: UInt = 3222163978u;
public const val `ERROR_PCW_CREATEFILE_LOG_FAILED`: UInt = 3222163861u;
public const val `ERROR_PCW_DUPLICATE_SEQUENCE_RECORD`: UInt = 3222163858u;
public const val `ERROR_PCW_DUP_IMAGE_FAMILY_NAME`: UInt = 3222163749u;
public const val `ERROR_PCW_DUP_TARGET_IMAGE_NAME`: UInt = 3222163737u;
public const val `ERROR_PCW_DUP_TARGET_IMAGE_PACKCODE`: UInt = 3222163777u;
public const val `ERROR_PCW_DUP_UPGRADED_IMAGE_NAME`: UInt = 3222163729u;
public const val `ERROR_PCW_DUP_UPGRADED_IMAGE_PACKCODE`: UInt = 3222163795u;
public const val `ERROR_PCW_ERROR_WRITING_TO_LOG`: UInt = 3222163864u;
public const val `ERROR_PCW_EXECUTE_VIEW`: UInt = 3222163870u;
public const val `ERROR_PCW_EXTFILE_BAD_FAMILY_FIELD`: UInt = 3222163756u;
public const val `ERROR_PCW_EXTFILE_BAD_IGNORE_LENGTHS`: UInt = 3222163814u;
public const val `ERROR_PCW_EXTFILE_BAD_IGNORE_OFFSETS`: UInt = 3222163812u;
public const val `ERROR_PCW_EXTFILE_BAD_RETAIN_OFFSETS`: UInt = 3222163817u;
public const val `ERROR_PCW_EXTFILE_BLANK_FILE_TABLE_KEY`: UInt = 3222163755u;
public const val `ERROR_PCW_EXTFILE_BLANK_PATH_TO_FILE`: UInt = 3222163758u;
public const val `ERROR_PCW_EXTFILE_IGNORE_COUNT_MISMATCH`: UInt = 3222163815u;
public const val `ERROR_PCW_EXTFILE_LONG_FILE_TABLE_KEY`: UInt = 3222163754u;
public const val `ERROR_PCW_EXTFILE_LONG_IGNORE_LENGTHS`: UInt = 3222163813u;
public const val `ERROR_PCW_EXTFILE_LONG_IGNORE_OFFSETS`: UInt = 3222163811u;
public const val `ERROR_PCW_EXTFILE_LONG_PATH_TO_FILE`: UInt = 3222163757u;
public const val `ERROR_PCW_EXTFILE_LONG_RETAIN_OFFSETS`: UInt = 3222163816u;
public const val `ERROR_PCW_EXTFILE_MISSING_FILE`: UInt = 3222163759u;
public const val `ERROR_PCW_FAILED_CREATE_TRANSFORM`: UInt = 3222163973u;
public const val `ERROR_PCW_FAILED_EXPAND_PATH`: UInt = 3222163872u;
public const val `ERROR_PCW_FAMILY_RANGE_BAD_RETAIN_LENGTHS`: UInt = 3222163809u;
public const val `ERROR_PCW_FAMILY_RANGE_BAD_RETAIN_OFFSETS`: UInt = 3222163806u;
public const val `ERROR_PCW_FAMILY_RANGE_BLANK_FILE_TABLE_KEY`: UInt = 3222163803u;
public const val `ERROR_PCW_FAMILY_RANGE_BLANK_RETAIN_LENGTHS`: UInt = 3222163808u;
public const val `ERROR_PCW_FAMILY_RANGE_BLANK_RETAIN_OFFSETS`: UInt = 3222163805u;
public const val `ERROR_PCW_FAMILY_RANGE_COUNT_MISMATCH`: UInt = 3222163810u;
public const val `ERROR_PCW_FAMILY_RANGE_LONG_FILE_TABLE_KEY`: UInt = 3222163802u;
public const val `ERROR_PCW_FAMILY_RANGE_LONG_RETAIN_LENGTHS`: UInt = 3222163807u;
public const val `ERROR_PCW_FAMILY_RANGE_LONG_RETAIN_OFFSETS`: UInt = 3222163804u;
public const val `ERROR_PCW_FAMILY_RANGE_NAME_TOO_LONG`: UInt = 3222163800u;
public const val `ERROR_PCW_IMAGE_FAMILY_NAME_TOO_LONG`: UInt = 3222163747u;
public const val `ERROR_PCW_IMAGE_PATH_NOT_EXIST`: UInt = 3222163988u;
public const val `ERROR_PCW_INTERNAL_ERROR`: UInt = 3222163969u;
public const val `ERROR_PCW_INVALID_LOG_LEVEL`: UInt = 3222163862u;
public const val `ERROR_PCW_INVALID_MAJOR_VERSION`: UInt = 3222163990u;
public const val `ERROR_PCW_INVALID_PARAMETER`: UInt = 3222163860u;
public const val `ERROR_PCW_INVALID_PATCHMETADATA_PROP`: UInt = 3222163856u;
public const val `ERROR_PCW_INVALID_PATCH_TYPE_SEQUENCING`: UInt = 3222163977u;
public const val `ERROR_PCW_INVALID_PCP_EXTERNALFILES`: UInt = 3222163982u;
public const val `ERROR_PCW_INVALID_PCP_FAMILYFILERANGES`: UInt = 3222163992u;
public const val `ERROR_PCW_INVALID_PCP_IMAGEFAMILIES`: UInt = 3222163983u;
public const val `ERROR_PCW_INVALID_PCP_PATCHSEQUENCE`: UInt = 3222163984u;
public const val `ERROR_PCW_INVALID_PCP_PROPERTIES`: UInt = 3222163991u;
public const val `ERROR_PCW_INVALID_PCP_PROPERTY`: UInt = 3222163970u;
public const val `ERROR_PCW_INVALID_PCP_TARGETFILES_OPTIONALDATA`: UInt = 3222163985u;
public const val `ERROR_PCW_INVALID_PCP_TARGETIMAGES`: UInt = 3222163971u;
public const val `ERROR_PCW_INVALID_PCP_UPGRADEDFILESTOIGNORE`: UInt = 3222163980u;
public const val `ERROR_PCW_INVALID_PCP_UPGRADEDFILES_OPTIONALDATA`: UInt = 3222163986u;
public const val `ERROR_PCW_INVALID_PCP_UPGRADEDIMAGES`: UInt = 3222163981u;
public const val `ERROR_PCW_INVALID_RANGE_ELEMENT`: UInt = 3222163989u;
public const val `ERROR_PCW_INVALID_SUPERCEDENCE`: UInt = 3222163857u;
public const val `ERROR_PCW_INVALID_SUPERSEDENCE_VALUE`: UInt = 3222163976u;
public const val `ERROR_PCW_INVALID_UI_LEVEL`: UInt = 3222163863u;
public const val `ERROR_PCW_LAX_VALIDATION_FLAGS`: UInt = 3222163972u;
public const val `ERROR_PCW_MAJOR_UPGD_WITHOUT_SEQUENCING`: UInt = 3222163843u;
public const val `ERROR_PCW_MATCHED_PRODUCT_VERSIONS`: UInt = 3222163837u;
public const val `ERROR_PCW_MISMATCHED_PRODUCT_CODES`: UInt = 3222163779u;
public const val `ERROR_PCW_MISMATCHED_PRODUCT_VERSIONS`: UInt = 3222163780u;
public const val `ERROR_PCW_MISSING_DIRECTORY_TABLE`: UInt = 3222163975u;
public const val `ERROR_PCW_MISSING_PATCHMETADATA`: UInt = 3222163987u;
public const val `ERROR_PCW_MISSING_PATCH_GUID`: UInt = 3222163719u;
public const val `ERROR_PCW_MISSING_PATCH_PATH`: UInt = 3222163716u;
public const val `ERROR_PCW_NO_UPGRADED_IMAGES_TO_PATCH`: UInt = 3222163723u;
public const val `ERROR_PCW_NULL_PATCHFAMILY`: UInt = 3222163850u;
public const val `ERROR_PCW_NULL_SEQUENCE_NUMBER`: UInt = 3222163851u;
public const val `ERROR_PCW_OBSOLETION_WITH_MSI30`: UInt = 3222163839u;
public const val `ERROR_PCW_OBSOLETION_WITH_PATCHSEQUENCE`: UInt = 3222163840u;
public const val `ERROR_PCW_OBSOLETION_WITH_SEQUENCE_DATA`: UInt = 3222163838u;
public const val `ERROR_PCW_OODS_COPYING_MSI`: UInt = 3222163726u;
public const val `ERROR_PCW_OPEN_VIEW`: UInt = 3222163869u;
public const val `ERROR_PCW_OUT_OF_MEMORY`: UInt = 3222163865u;
public const val `ERROR_PCW_PATCHMETADATA_PROP_NOT_SET`: UInt = 3222163855u;
public const val `ERROR_PCW_PCP_BAD_FORMAT`: UInt = 3222163714u;
public const val `ERROR_PCW_PCP_DOESNT_EXIST`: UInt = 3222163713u;
public const val `ERROR_PCW_SEQUENCING_BAD_TARGET`: UInt = 3222163854u;
public const val `ERROR_PCW_TARGET_BAD_PROD_CODE_VAL`: UInt = 3222163744u;
public const val `ERROR_PCW_TARGET_BAD_PROD_VALIDATE`: UInt = 3222163743u;
public const val `ERROR_PCW_TARGET_IMAGE_COMPRESSED`: UInt = 3222163742u;
public const val `ERROR_PCW_TARGET_IMAGE_NAME_TOO_LONG`: UInt = 3222163735u;
public const val `ERROR_PCW_TARGET_IMAGE_PATH_EMPTY`: UInt = 3222163739u;
public const val `ERROR_PCW_TARGET_IMAGE_PATH_NOT_EXIST`: UInt = 3222163740u;
public const val `ERROR_PCW_TARGET_IMAGE_PATH_NOT_MSI`: UInt = 3222163741u;
public const val `ERROR_PCW_TARGET_IMAGE_PATH_TOO_LONG`: UInt = 3222163738u;
public const val `ERROR_PCW_TARGET_MISSING_SRC_FILES`: UInt = 3222163746u;
public const val `ERROR_PCW_TARGET_WRONG_PRODUCT_VERSION_COMP`: UInt = 3222163979u;
public const val `ERROR_PCW_TFILEDATA_BAD_IGNORE_LENGTHS`: UInt = 3222163822u;
public const val `ERROR_PCW_TFILEDATA_BAD_IGNORE_OFFSETS`: UInt = 3222163820u;
public const val `ERROR_PCW_TFILEDATA_BAD_RETAIN_OFFSETS`: UInt = 3222163825u;
public const val `ERROR_PCW_TFILEDATA_BAD_TARGET_FIELD`: UInt = 3222163791u;
public const val `ERROR_PCW_TFILEDATA_BLANK_FILE_TABLE_KEY`: UInt = 3222163789u;
public const val `ERROR_PCW_TFILEDATA_IGNORE_COUNT_MISMATCH`: UInt = 3222163823u;
public const val `ERROR_PCW_TFILEDATA_LONG_FILE_TABLE_KEY`: UInt = 3222163788u;
public const val `ERROR_PCW_TFILEDATA_LONG_IGNORE_LENGTHS`: UInt = 3222163821u;
public const val `ERROR_PCW_TFILEDATA_LONG_IGNORE_OFFSETS`: UInt = 3222163819u;
public const val `ERROR_PCW_TFILEDATA_LONG_RETAIN_OFFSETS`: UInt = 3222163824u;
public const val `ERROR_PCW_TFILEDATA_MISSING_FILE_TABLE_KEY`: UInt = 3222163790u;
public const val `ERROR_PCW_UFILEDATA_BAD_UPGRADED_FIELD`: UInt = 3222163778u;
public const val `ERROR_PCW_UFILEDATA_BLANK_FILE_TABLE_KEY`: UInt = 3222163752u;
public const val `ERROR_PCW_UFILEDATA_LONG_FILE_TABLE_KEY`: UInt = 3222163751u;
public const val `ERROR_PCW_UFILEDATA_MISSING_FILE_TABLE_KEY`: UInt = 3222163753u;
public const val `ERROR_PCW_UFILEIGNORE_BAD_FILE_TABLE_KEY`: UInt = 3222163799u;
public const val `ERROR_PCW_UFILEIGNORE_BAD_UPGRADED_FIELD`: UInt = 3222163796u;
public const val `ERROR_PCW_UFILEIGNORE_BLANK_FILE_TABLE_KEY`: UInt = 3222163798u;
public const val `ERROR_PCW_UFILEIGNORE_LONG_FILE_TABLE_KEY`: UInt = 3222163797u;
public const val `ERROR_PCW_UNKNOWN_ERROR`: UInt = 3222163866u;
public const val `ERROR_PCW_UNKNOWN_INFO`: UInt = 3222163867u;
public const val `ERROR_PCW_UNKNOWN_WARN`: UInt = 3222163868u;
public const val `ERROR_PCW_UPGRADED_IMAGE_COMPRESSED`: UInt = 3222163734u;
public const val `ERROR_PCW_UPGRADED_IMAGE_NAME_TOO_LONG`: UInt = 3222163727u;
public const val `ERROR_PCW_UPGRADED_IMAGE_PATCH_PATH_NOT_EXIST`: UInt = 3222163793u;
public const val `ERROR_PCW_UPGRADED_IMAGE_PATCH_PATH_NOT_MSI`: UInt = 3222163794u;
public const val `ERROR_PCW_UPGRADED_IMAGE_PATCH_PATH_TOO_LONG`: UInt = 3222163792u;
public const val `ERROR_PCW_UPGRADED_IMAGE_PATH_EMPTY`: UInt = 3222163731u;
public const val `ERROR_PCW_UPGRADED_IMAGE_PATH_NOT_EXIST`: UInt = 3222163732u;
public const val `ERROR_PCW_UPGRADED_IMAGE_PATH_NOT_MSI`: UInt = 3222163733u;
public const val `ERROR_PCW_UPGRADED_IMAGE_PATH_TOO_LONG`: UInt = 3222163730u;
public const val `ERROR_PCW_UPGRADED_MISSING_SRC_FILES`: UInt = 3222163745u;
public const val `ERROR_PCW_VIEW_FETCH`: UInt = 3222163871u;
public const val `ERROR_PCW_WRITE_SUMMARY_PROPERTIES`: UInt = 3222163787u;
public const val `ERROR_PCW_WRONG_PATCHMETADATA_STRD_PROP`: UInt = 3222163859u;
public const val `ERROR_ROLLBACK_DISABLED`: UInt = 1653u;
// UNSUPPORTED Rust 824:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FUSION_INSTALL_REFERENCE {
//     pub cbSize: u32,
//     pub dwFlags: u32,
//     pub guidScheme: windows_sys::core::GUID,
//     pub szIdentifier: windows_sys::core::PCWSTR,
//     pub szNonCannonicalData: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 833:1: declaration Impl has no candidate rule
// impl Default for FUSION_INSTALL_REFERENCE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 838:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FUSION_REFCOUNT_FILEPATH_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb02f9d65_fb77_4f7a_afa5_b391309f11c9);

// UNSUPPORTED Rust 839:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FUSION_REFCOUNT_OPAQUE_STRING_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2ec93463_b0c3_45e1_8364_327e96aea856);

// UNSUPPORTED Rust 840:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const FUSION_REFCOUNT_UNINSTALL_SUBKEY_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8cedc215_ac4b_488b_93c0_a50a49cb2fb8);

// UNSUPPORTED Rust 841:1: non-scalar type Ptr unsupported
// pub const IACTIONNAME_ADMIN: windows_sys::core::PCWSTR = windows_sys::core::w!("ADMIN");

// UNSUPPORTED Rust 842:1: non-scalar type Ptr unsupported
// pub const IACTIONNAME_ADVERTISE: windows_sys::core::PCWSTR = windows_sys::core::w!("ADVERTISE");

// UNSUPPORTED Rust 843:1: non-scalar type Ptr unsupported
// pub const IACTIONNAME_COLLECTUSERINFO: windows_sys::core::PCWSTR = windows_sys::core::w!("CollectUserInfo");

// UNSUPPORTED Rust 844:1: non-scalar type Ptr unsupported
// pub const IACTIONNAME_FIRSTRUN: windows_sys::core::PCWSTR = windows_sys::core::w!("FirstRun");

// UNSUPPORTED Rust 845:1: non-scalar type Ptr unsupported
// pub const IACTIONNAME_INSTALL: windows_sys::core::PCWSTR = windows_sys::core::w!("INSTALL");

// UNSUPPORTED Rust 846:1: non-scalar type Ptr unsupported
// pub const IACTIONNAME_SEQUENCE: windows_sys::core::PCWSTR = windows_sys::core::w!("SEQUENCE");

public const val `IASSEMBLYCACHEITEM_COMMIT_DISPOSITION_ALREADY_INSTALLED`: UInt = 3u;
public const val `IASSEMBLYCACHEITEM_COMMIT_DISPOSITION_INSTALLED`: UInt = 1u;
public const val `IASSEMBLYCACHEITEM_COMMIT_DISPOSITION_REFRESHED`: UInt = 2u;
public const val `IASSEMBLYCACHEITEM_COMMIT_FLAG_REFRESH`: UInt = 1u;
public typealias `IASSEMBLYCACHE_UNINSTALL_DISPOSITION` = UInt;
public const val `IASSEMBLYCACHE_UNINSTALL_DISPOSITION_ALREADY_UNINSTALLED`: `IASSEMBLYCACHE_UNINSTALL_DISPOSITION` = 3u;
public const val `IASSEMBLYCACHE_UNINSTALL_DISPOSITION_DELETE_PENDING`: `IASSEMBLYCACHE_UNINSTALL_DISPOSITION` = 4u;
public const val `IASSEMBLYCACHE_UNINSTALL_DISPOSITION_STILL_IN_USE`: `IASSEMBLYCACHE_UNINSTALL_DISPOSITION` = 2u;
public const val `IASSEMBLYCACHE_UNINSTALL_DISPOSITION_UNINSTALLED`: `IASSEMBLYCACHE_UNINSTALL_DISPOSITION` = 1u;
public const val `INFO_BASE`: UInt = 3222229249u;
public const val `INFO_ENTERING_PHASE_I`: UInt = 3222229251u;
public const val `INFO_ENTERING_PHASE_II`: UInt = 3222229256u;
public const val `INFO_ENTERING_PHASE_III`: UInt = 3222229257u;
public const val `INFO_ENTERING_PHASE_IV`: UInt = 3222229258u;
public const val `INFO_ENTERING_PHASE_I_VALIDATION`: UInt = 3222229250u;
public const val `INFO_ENTERING_PHASE_V`: UInt = 3222229259u;
public const val `INFO_GENERATING_METADATA`: UInt = 3222229265u;
public const val `INFO_PASSED_MAIN_CONTROL`: UInt = 3222229249u;
public const val `INFO_PATCHCACHE_FILEINFO_FAILURE`: UInt = 3222229267u;
public const val `INFO_PATCHCACHE_PCI_READFAILURE`: UInt = 3222229268u;
public const val `INFO_PATCHCACHE_PCI_WRITEFAILURE`: UInt = 3222229269u;
public const val `INFO_PCP_PATH`: UInt = 3222229252u;
public const val `INFO_PROPERTY`: UInt = 3222229255u;
public const val `INFO_SET_OPTIONS`: UInt = 3222229254u;
public const val `INFO_SUCCESSFUL_PATCH_CREATION`: UInt = 3222229271u;
public const val `INFO_TEMP_DIR`: UInt = 3222229253u;
public const val `INFO_TEMP_DIR_CLEANUP`: UInt = 3222229266u;
public const val `INFO_USING_USER_MSI_FOR_PATCH_TABLES`: UInt = 3222229270u;
public typealias `INSTALLFEATUREATTRIBUTE` = Int;
public const val `INSTALLFEATUREATTRIBUTE_DISALLOWADVERTISE`: `INSTALLFEATUREATTRIBUTE` = 16;
public const val `INSTALLFEATUREATTRIBUTE_FAVORADVERTISE`: `INSTALLFEATUREATTRIBUTE` = 8;
public const val `INSTALLFEATUREATTRIBUTE_FAVORLOCAL`: `INSTALLFEATUREATTRIBUTE` = 1;
public const val `INSTALLFEATUREATTRIBUTE_FAVORSOURCE`: `INSTALLFEATUREATTRIBUTE` = 2;
public const val `INSTALLFEATUREATTRIBUTE_FOLLOWPARENT`: `INSTALLFEATUREATTRIBUTE` = 4;
public const val `INSTALLFEATUREATTRIBUTE_NOUNSUPPORTEDADVERTISE`: `INSTALLFEATUREATTRIBUTE` = 32;
public typealias `INSTALLLEVEL` = Int;
public const val `INSTALLLEVEL_DEFAULT`: `INSTALLLEVEL` = 0;
public const val `INSTALLLEVEL_MAXIMUM`: `INSTALLLEVEL` = 65535;
public const val `INSTALLLEVEL_MINIMUM`: `INSTALLLEVEL` = 1;
public typealias `INSTALLLOGATTRIBUTES` = Int;
public const val `INSTALLLOGATTRIBUTES_APPEND`: `INSTALLLOGATTRIBUTES` = 1;
public const val `INSTALLLOGATTRIBUTES_FLUSHEACHLINE`: `INSTALLLOGATTRIBUTES` = 2;
public typealias `INSTALLLOGMODE` = Int;
public const val `INSTALLLOGMODE_ACTIONDATA`: `INSTALLLOGMODE` = 512;
public const val `INSTALLLOGMODE_ACTIONSTART`: `INSTALLLOGMODE` = 256;
public const val `INSTALLLOGMODE_COMMONDATA`: `INSTALLLOGMODE` = 2048;
public const val `INSTALLLOGMODE_ERROR`: `INSTALLLOGMODE` = 2;
public const val `INSTALLLOGMODE_EXTRADEBUG`: `INSTALLLOGMODE` = 8192;
public const val `INSTALLLOGMODE_FATALEXIT`: `INSTALLLOGMODE` = 1;
public const val `INSTALLLOGMODE_FILESINUSE`: `INSTALLLOGMODE` = 32;
public const val `INSTALLLOGMODE_INFO`: `INSTALLLOGMODE` = 16;
public const val `INSTALLLOGMODE_INITIALIZE`: `INSTALLLOGMODE` = 4096;
public const val `INSTALLLOGMODE_INSTALLEND`: `INSTALLLOGMODE` = 134217728;
public const val `INSTALLLOGMODE_INSTALLSTART`: `INSTALLLOGMODE` = 67108864;
public const val `INSTALLLOGMODE_LOGONLYONERROR`: `INSTALLLOGMODE` = 16384;
public const val `INSTALLLOGMODE_LOGPERFORMANCE`: `INSTALLLOGMODE` = 32768;
public const val `INSTALLLOGMODE_OUTOFDISKSPACE`: `INSTALLLOGMODE` = 128;
public const val `INSTALLLOGMODE_PROGRESS`: `INSTALLLOGMODE` = 1024;
public const val `INSTALLLOGMODE_PROPERTYDUMP`: `INSTALLLOGMODE` = 1024;
public const val `INSTALLLOGMODE_RESOLVESOURCE`: `INSTALLLOGMODE` = 64;
public const val `INSTALLLOGMODE_RMFILESINUSE`: `INSTALLLOGMODE` = 33554432;
public const val `INSTALLLOGMODE_SHOWDIALOG`: `INSTALLLOGMODE` = 16384;
public const val `INSTALLLOGMODE_TERMINATE`: `INSTALLLOGMODE` = 8192;
public const val `INSTALLLOGMODE_USER`: `INSTALLLOGMODE` = 8;
public const val `INSTALLLOGMODE_VERBOSE`: `INSTALLLOGMODE` = 4096;
public const val `INSTALLLOGMODE_WARNING`: `INSTALLLOGMODE` = 4;
public typealias `INSTALLMESSAGE` = Int;
public const val `INSTALLMESSAGE_ACTIONDATA`: `INSTALLMESSAGE` = 150994944;
public const val `INSTALLMESSAGE_ACTIONSTART`: `INSTALLMESSAGE` = 134217728;
public const val `INSTALLMESSAGE_COMMONDATA`: `INSTALLMESSAGE` = 184549376;
public const val `INSTALLMESSAGE_ERROR`: `INSTALLMESSAGE` = 16777216;
public const val `INSTALLMESSAGE_FATALEXIT`: `INSTALLMESSAGE` = 0;
public const val `INSTALLMESSAGE_FILESINUSE`: `INSTALLMESSAGE` = 83886080;
public const val `INSTALLMESSAGE_INFO`: `INSTALLMESSAGE` = 67108864;
public const val `INSTALLMESSAGE_INITIALIZE`: `INSTALLMESSAGE` = 201326592;
public const val `INSTALLMESSAGE_INSTALLEND`: `INSTALLMESSAGE` = 452984832;
public const val `INSTALLMESSAGE_INSTALLSTART`: `INSTALLMESSAGE` = 436207616;
public const val `INSTALLMESSAGE_OUTOFDISKSPACE`: `INSTALLMESSAGE` = 117440512;
public const val `INSTALLMESSAGE_PERFORMANCE`: `INSTALLMESSAGE` = 251658240;
public const val `INSTALLMESSAGE_PROGRESS`: `INSTALLMESSAGE` = 167772160;
public const val `INSTALLMESSAGE_RESOLVESOURCE`: `INSTALLMESSAGE` = 100663296;
public const val `INSTALLMESSAGE_RMFILESINUSE`: `INSTALLMESSAGE` = 419430400;
public const val `INSTALLMESSAGE_SHOWDIALOG`: `INSTALLMESSAGE` = 234881024;
public const val `INSTALLMESSAGE_TERMINATE`: `INSTALLMESSAGE` = 218103808;
public const val `INSTALLMESSAGE_TYPEMASK`: Int = -16777216;
public const val `INSTALLMESSAGE_USER`: `INSTALLMESSAGE` = 50331648;
public const val `INSTALLMESSAGE_WARNING`: `INSTALLMESSAGE` = 33554432;
public typealias `INSTALLMODE` = Int;
public const val `INSTALLMODE_DEFAULT`: `INSTALLMODE` = 0;
public const val `INSTALLMODE_EXISTING`: `INSTALLMODE` = -1;
public const val `INSTALLMODE_NODETECTION`: `INSTALLMODE` = -2;
public const val `INSTALLMODE_NODETECTION_ANY`: `INSTALLMODE` = -4;
public const val `INSTALLMODE_NOSOURCERESOLUTION`: `INSTALLMODE` = -3;
// UNSUPPORTED Rust 940:1: non-scalar type Ptr unsupported
// pub const INSTALLPROPERTY_ASSIGNMENTTYPE: windows_sys::core::PCWSTR = windows_sys::core::w!("AssignmentType");

// UNSUPPORTED Rust 941:1: non-scalar type Ptr unsupported
// pub const INSTALLPROPERTY_AUTHORIZED_LUA_APP: windows_sys::core::PCWSTR = windows_sys::core::w!("AuthorizedLUAApp");

// UNSUPPORTED Rust 942:1: non-scalar type Ptr unsupported
// pub const INSTALLPROPERTY_DISKPROMPT: windows_sys::core::PCWSTR = windows_sys::core::w!("DiskPrompt");

// UNSUPPORTED Rust 943:1: non-scalar type Ptr unsupported
// pub const INSTALLPROPERTY_DISPLAYNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("DisplayName");

// UNSUPPORTED Rust 944:1: non-scalar type Ptr unsupported
// pub const INSTALLPROPERTY_HELPLINK: windows_sys::core::PCWSTR = windows_sys::core::w!("HelpLink");

// UNSUPPORTED Rust 945:1: non-scalar type Ptr unsupported
// pub const INSTALLPROPERTY_HELPTELEPHONE: windows_sys::core::PCWSTR = windows_sys::core::w!("HelpTelephone");

// UNSUPPORTED Rust 946:1: non-scalar type Ptr unsupported
// pub const INSTALLPROPERTY_INSTALLDATE: windows_sys::core::PCWSTR = windows_sys::core::w!("InstallDate");

// UNSUPPORTED Rust 947:1: non-scalar type Ptr unsupported
// pub const INSTALLPROPERTY_INSTALLEDLANGUAGE: windows_sys::core::PCWSTR = windows_sys::core::w!("InstalledLanguage");

// UNSUPPORTED Rust 948:1: non-scalar type Ptr unsupported
// pub const INSTALLPROPERTY_INSTALLEDPRODUCTNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("InstalledProductName");

// UNSUPPORTED Rust 949:1: non-scalar type Ptr unsupported
// pub const INSTALLPROPERTY_INSTALLLOCATION: windows_sys::core::PCWSTR = windows_sys::core::w!("InstallLocation");

// UNSUPPORTED Rust 950:1: non-scalar type Ptr unsupported
// pub const INSTALLPROPERTY_INSTALLSOURCE: windows_sys::core::PCWSTR = windows_sys::core::w!("InstallSource");

// UNSUPPORTED Rust 951:1: non-scalar type Ptr unsupported
// pub const INSTALLPROPERTY_INSTANCETYPE: windows_sys::core::PCWSTR = windows_sys::core::w!("InstanceType");

// UNSUPPORTED Rust 952:1: non-scalar type Ptr unsupported
// pub const INSTALLPROPERTY_LANGUAGE: windows_sys::core::PCWSTR = windows_sys::core::w!("Language");

// UNSUPPORTED Rust 953:1: non-scalar type Ptr unsupported
// pub const INSTALLPROPERTY_LASTUSEDSOURCE: windows_sys::core::PCWSTR = windows_sys::core::w!("LastUsedSource");

// UNSUPPORTED Rust 954:1: non-scalar type Ptr unsupported
// pub const INSTALLPROPERTY_LASTUSEDTYPE: windows_sys::core::PCWSTR = windows_sys::core::w!("LastUsedType");

// UNSUPPORTED Rust 955:1: non-scalar type Ptr unsupported
// pub const INSTALLPROPERTY_LOCALPACKAGE: windows_sys::core::PCWSTR = windows_sys::core::w!("LocalPackage");

// UNSUPPORTED Rust 956:1: non-scalar type Ptr unsupported
// pub const INSTALLPROPERTY_LUAENABLED: windows_sys::core::PCWSTR = windows_sys::core::w!("LUAEnabled");

// UNSUPPORTED Rust 957:1: non-scalar type Ptr unsupported
// pub const INSTALLPROPERTY_MEDIAPACKAGEPATH: windows_sys::core::PCWSTR = windows_sys::core::w!("MediaPackagePath");

// UNSUPPORTED Rust 958:1: non-scalar type Ptr unsupported
// pub const INSTALLPROPERTY_MOREINFOURL: windows_sys::core::PCWSTR = windows_sys::core::w!("MoreInfoURL");

// UNSUPPORTED Rust 959:1: non-scalar type Ptr unsupported
// pub const INSTALLPROPERTY_PACKAGECODE: windows_sys::core::PCWSTR = windows_sys::core::w!("PackageCode");

// UNSUPPORTED Rust 960:1: non-scalar type Ptr unsupported
// pub const INSTALLPROPERTY_PACKAGENAME: windows_sys::core::PCWSTR = windows_sys::core::w!("PackageName");

// UNSUPPORTED Rust 961:1: non-scalar type Ptr unsupported
// pub const INSTALLPROPERTY_PATCHSTATE: windows_sys::core::PCWSTR = windows_sys::core::w!("State");

// UNSUPPORTED Rust 962:1: non-scalar type Ptr unsupported
// pub const INSTALLPROPERTY_PATCHTYPE: windows_sys::core::PCWSTR = windows_sys::core::w!("PatchType");

// UNSUPPORTED Rust 963:1: non-scalar type Ptr unsupported
// pub const INSTALLPROPERTY_PRODUCTICON: windows_sys::core::PCWSTR = windows_sys::core::w!("ProductIcon");

// UNSUPPORTED Rust 964:1: non-scalar type Ptr unsupported
// pub const INSTALLPROPERTY_PRODUCTID: windows_sys::core::PCWSTR = windows_sys::core::w!("ProductID");

// UNSUPPORTED Rust 965:1: non-scalar type Ptr unsupported
// pub const INSTALLPROPERTY_PRODUCTNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("ProductName");

// UNSUPPORTED Rust 966:1: non-scalar type Ptr unsupported
// pub const INSTALLPROPERTY_PRODUCTSTATE: windows_sys::core::PCWSTR = windows_sys::core::w!("State");

// UNSUPPORTED Rust 967:1: non-scalar type Ptr unsupported
// pub const INSTALLPROPERTY_PUBLISHER: windows_sys::core::PCWSTR = windows_sys::core::w!("Publisher");

// UNSUPPORTED Rust 968:1: non-scalar type Ptr unsupported
// pub const INSTALLPROPERTY_REGCOMPANY: windows_sys::core::PCWSTR = windows_sys::core::w!("RegCompany");

// UNSUPPORTED Rust 969:1: non-scalar type Ptr unsupported
// pub const INSTALLPROPERTY_REGOWNER: windows_sys::core::PCWSTR = windows_sys::core::w!("RegOwner");

// UNSUPPORTED Rust 970:1: non-scalar type Ptr unsupported
// pub const INSTALLPROPERTY_TRANSFORMS: windows_sys::core::PCWSTR = windows_sys::core::w!("Transforms");

// UNSUPPORTED Rust 971:1: non-scalar type Ptr unsupported
// pub const INSTALLPROPERTY_UNINSTALLABLE: windows_sys::core::PCWSTR = windows_sys::core::w!("Uninstallable");

// UNSUPPORTED Rust 972:1: non-scalar type Ptr unsupported
// pub const INSTALLPROPERTY_URLINFOABOUT: windows_sys::core::PCWSTR = windows_sys::core::w!("URLInfoAbout");

// UNSUPPORTED Rust 973:1: non-scalar type Ptr unsupported
// pub const INSTALLPROPERTY_URLUPDATEINFO: windows_sys::core::PCWSTR = windows_sys::core::w!("URLUpdateInfo");

// UNSUPPORTED Rust 974:1: non-scalar type Ptr unsupported
// pub const INSTALLPROPERTY_VERSION: windows_sys::core::PCWSTR = windows_sys::core::w!("Version");

// UNSUPPORTED Rust 975:1: non-scalar type Ptr unsupported
// pub const INSTALLPROPERTY_VERSIONMAJOR: windows_sys::core::PCWSTR = windows_sys::core::w!("VersionMajor");

// UNSUPPORTED Rust 976:1: non-scalar type Ptr unsupported
// pub const INSTALLPROPERTY_VERSIONMINOR: windows_sys::core::PCWSTR = windows_sys::core::w!("VersionMinor");

// UNSUPPORTED Rust 977:1: non-scalar type Ptr unsupported
// pub const INSTALLPROPERTY_VERSIONSTRING: windows_sys::core::PCWSTR = windows_sys::core::w!("VersionString");

public typealias `INSTALLSTATE` = Int;
public const val `INSTALLSTATE_ABSENT`: `INSTALLSTATE` = 2;
public const val `INSTALLSTATE_ADVERTISED`: `INSTALLSTATE` = 1;
public const val `INSTALLSTATE_BADCONFIG`: `INSTALLSTATE` = -6;
public const val `INSTALLSTATE_BROKEN`: `INSTALLSTATE` = 0;
public const val `INSTALLSTATE_DEFAULT`: `INSTALLSTATE` = 5;
public const val `INSTALLSTATE_INCOMPLETE`: `INSTALLSTATE` = -5;
public const val `INSTALLSTATE_INVALIDARG`: `INSTALLSTATE` = -2;
public const val `INSTALLSTATE_LOCAL`: `INSTALLSTATE` = 3;
public const val `INSTALLSTATE_MOREDATA`: `INSTALLSTATE` = -3;
public const val `INSTALLSTATE_NOTUSED`: `INSTALLSTATE` = -7;
public const val `INSTALLSTATE_REMOVED`: `INSTALLSTATE` = 1;
public const val `INSTALLSTATE_SOURCE`: `INSTALLSTATE` = 4;
public const val `INSTALLSTATE_SOURCEABSENT`: `INSTALLSTATE` = -4;
public const val `INSTALLSTATE_UNKNOWN`: `INSTALLSTATE` = -1;
public typealias `INSTALLTYPE` = Int;
public const val `INSTALLTYPE_DEFAULT`: `INSTALLTYPE` = 0;
public const val `INSTALLTYPE_NETWORK_IMAGE`: `INSTALLTYPE` = 1;
public const val `INSTALLTYPE_SINGLE_INSTANCE`: `INSTALLTYPE` = 2;
public typealias `INSTALLUILEVEL` = Int;
public const val `INSTALLUILEVEL_BASIC`: `INSTALLUILEVEL` = 3;
public const val `INSTALLUILEVEL_DEFAULT`: `INSTALLUILEVEL` = 1;
public const val `INSTALLUILEVEL_ENDDIALOG`: `INSTALLUILEVEL` = 128;
public const val `INSTALLUILEVEL_FULL`: `INSTALLUILEVEL` = 5;
public const val `INSTALLUILEVEL_HIDECANCEL`: `INSTALLUILEVEL` = 32;
public const val `INSTALLUILEVEL_NOCHANGE`: `INSTALLUILEVEL` = 0;
public const val `INSTALLUILEVEL_NONE`: `INSTALLUILEVEL` = 2;
public const val `INSTALLUILEVEL_PROGRESSONLY`: `INSTALLUILEVEL` = 64;
public const val `INSTALLUILEVEL_REDUCED`: `INSTALLUILEVEL` = 4;
public const val `INSTALLUILEVEL_SOURCERESONLY`: `INSTALLUILEVEL` = 256;
public const val `INSTALLUILEVEL_UACONLY`: `INSTALLUILEVEL` = 512;
// UNSUPPORTED Rust 1009:1: generic scalar type unsupported
// pub type INSTALLUI_HANDLERA = Option<unsafe extern "system" fn(pvcontext: *mut core::ffi::c_void, imessagetype: u32, szmessage: windows_sys::core::PCSTR) -> i32>;

// UNSUPPORTED Rust 1010:1: generic scalar type unsupported
// pub type INSTALLUI_HANDLERW = Option<unsafe extern "system" fn(pvcontext: *mut core::ffi::c_void, imessagetype: u32, szmessage: windows_sys::core::PCWSTR) -> i32>;

// UNSUPPORTED Rust 1011:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_ACTION: windows_sys::core::PCWSTR = windows_sys::core::w!("ACTION");

// UNSUPPORTED Rust 1012:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_ADMINTOOLS_FOLDER: windows_sys::core::PCWSTR = windows_sys::core::w!("AdminToolsFolder");

// UNSUPPORTED Rust 1013:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_ADMINUSER: windows_sys::core::PCWSTR = windows_sys::core::w!("AdminUser");

// UNSUPPORTED Rust 1014:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_ADMIN_PROPERTIES: windows_sys::core::PCWSTR = windows_sys::core::w!("AdminProperties");

// UNSUPPORTED Rust 1015:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_AFTERREBOOT: windows_sys::core::PCWSTR = windows_sys::core::w!("AFTERREBOOT");

// UNSUPPORTED Rust 1016:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_ALLOWEDPROPERTIES: windows_sys::core::PCWSTR = windows_sys::core::w!("SecureCustomProperties");

// UNSUPPORTED Rust 1017:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_ALLUSERS: windows_sys::core::PCWSTR = windows_sys::core::w!("ALLUSERS");

// UNSUPPORTED Rust 1018:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_APPDATA_FOLDER: windows_sys::core::PCWSTR = windows_sys::core::w!("AppDataFolder");

// UNSUPPORTED Rust 1019:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_ARM: windows_sys::core::PCWSTR = windows_sys::core::w!("Arm");

// UNSUPPORTED Rust 1020:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_ARM64: windows_sys::core::PCWSTR = windows_sys::core::w!("Arm64");

// UNSUPPORTED Rust 1021:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_ARPAUTHORIZEDCDFPREFIX: windows_sys::core::PCWSTR = windows_sys::core::w!("ARPAUTHORIZEDCDFPREFIX");

// UNSUPPORTED Rust 1022:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_ARPCOMMENTS: windows_sys::core::PCWSTR = windows_sys::core::w!("ARPCOMMENTS");

// UNSUPPORTED Rust 1023:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_ARPCONTACT: windows_sys::core::PCWSTR = windows_sys::core::w!("ARPCONTACT");

// UNSUPPORTED Rust 1024:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_ARPHELPLINK: windows_sys::core::PCWSTR = windows_sys::core::w!("ARPHELPLINK");

// UNSUPPORTED Rust 1025:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_ARPHELPTELEPHONE: windows_sys::core::PCWSTR = windows_sys::core::w!("ARPHELPTELEPHONE");

// UNSUPPORTED Rust 1026:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_ARPINSTALLLOCATION: windows_sys::core::PCWSTR = windows_sys::core::w!("ARPINSTALLLOCATION");

// UNSUPPORTED Rust 1027:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_ARPNOMODIFY: windows_sys::core::PCWSTR = windows_sys::core::w!("ARPNOMODIFY");

// UNSUPPORTED Rust 1028:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_ARPNOREMOVE: windows_sys::core::PCWSTR = windows_sys::core::w!("ARPNOREMOVE");

// UNSUPPORTED Rust 1029:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_ARPNOREPAIR: windows_sys::core::PCWSTR = windows_sys::core::w!("ARPNOREPAIR");

// UNSUPPORTED Rust 1030:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_ARPPRODUCTICON: windows_sys::core::PCWSTR = windows_sys::core::w!("ARPPRODUCTICON");

// UNSUPPORTED Rust 1031:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_ARPREADME: windows_sys::core::PCWSTR = windows_sys::core::w!("ARPREADME");

// UNSUPPORTED Rust 1032:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_ARPSETTINGSIDENTIFIER: windows_sys::core::PCWSTR = windows_sys::core::w!("MSIARPSETTINGSIDENTIFIER");

// UNSUPPORTED Rust 1033:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_ARPSHIMFLAGS: windows_sys::core::PCWSTR = windows_sys::core::w!("SHIMFLAGS");

// UNSUPPORTED Rust 1034:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_ARPSHIMSERVICEPACKLEVEL: windows_sys::core::PCWSTR = windows_sys::core::w!("SHIMSERVICEPACKLEVEL");

// UNSUPPORTED Rust 1035:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_ARPSHIMVERSIONNT: windows_sys::core::PCWSTR = windows_sys::core::w!("SHIMVERSIONNT");

// UNSUPPORTED Rust 1036:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_ARPSIZE: windows_sys::core::PCWSTR = windows_sys::core::w!("ARPSIZE");

// UNSUPPORTED Rust 1037:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_ARPSYSTEMCOMPONENT: windows_sys::core::PCWSTR = windows_sys::core::w!("ARPSYSTEMCOMPONENT");

// UNSUPPORTED Rust 1038:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_ARPURLINFOABOUT: windows_sys::core::PCWSTR = windows_sys::core::w!("ARPURLINFOABOUT");

// UNSUPPORTED Rust 1039:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_ARPURLUPDATEINFO: windows_sys::core::PCWSTR = windows_sys::core::w!("ARPURLUPDATEINFO");

// UNSUPPORTED Rust 1040:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_AVAILABLEFREEREG: windows_sys::core::PCWSTR = windows_sys::core::w!("AVAILABLEFREEREG");

// UNSUPPORTED Rust 1041:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_BORDERSIDE: windows_sys::core::PCWSTR = windows_sys::core::w!("BorderSide");

// UNSUPPORTED Rust 1042:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_BORDERTOP: windows_sys::core::PCWSTR = windows_sys::core::w!("BorderTop");

// UNSUPPORTED Rust 1043:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_CAPTIONHEIGHT: windows_sys::core::PCWSTR = windows_sys::core::w!("CaptionHeight");

// UNSUPPORTED Rust 1044:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_CARRYINGNDP: windows_sys::core::PCWSTR = windows_sys::core::w!("CARRYINGNDP");

// UNSUPPORTED Rust 1045:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_CHECKCRCS: windows_sys::core::PCWSTR = windows_sys::core::w!("MSICHECKCRCS");

// UNSUPPORTED Rust 1046:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_COLORBITS: windows_sys::core::PCWSTR = windows_sys::core::w!("ColorBits");

// UNSUPPORTED Rust 1047:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_COMMONAPPDATA_FOLDER: windows_sys::core::PCWSTR = windows_sys::core::w!("CommonAppDataFolder");

// UNSUPPORTED Rust 1048:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_COMMONFILES64_FOLDER: windows_sys::core::PCWSTR = windows_sys::core::w!("CommonFiles64Folder");

// UNSUPPORTED Rust 1049:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_COMMONFILES_FOLDER: windows_sys::core::PCWSTR = windows_sys::core::w!("CommonFilesFolder");

// UNSUPPORTED Rust 1050:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_COMPANYNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("COMPANYNAME");

// UNSUPPORTED Rust 1051:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_COMPONENTADDDEFAULT: windows_sys::core::PCWSTR = windows_sys::core::w!("COMPADDDEFAULT");

// UNSUPPORTED Rust 1052:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_COMPONENTADDLOCAL: windows_sys::core::PCWSTR = windows_sys::core::w!("COMPADDLOCAL");

// UNSUPPORTED Rust 1053:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_COMPONENTADDSOURCE: windows_sys::core::PCWSTR = windows_sys::core::w!("COMPADDSOURCE");

// UNSUPPORTED Rust 1054:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_COMPUTERNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("ComputerName");

// UNSUPPORTED Rust 1055:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_COSTINGCOMPLETE: windows_sys::core::PCWSTR = windows_sys::core::w!("CostingComplete");

// UNSUPPORTED Rust 1056:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_CUSTOMACTIONDATA: windows_sys::core::PCWSTR = windows_sys::core::w!("CustomActionData");

// UNSUPPORTED Rust 1057:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_DATE: windows_sys::core::PCWSTR = windows_sys::core::w!("Date");

// UNSUPPORTED Rust 1058:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_DATETIME: windows_sys::core::PCWSTR = windows_sys::core::w!("DateTime");

// UNSUPPORTED Rust 1059:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_DEFAULTUIFONT: windows_sys::core::PCWSTR = windows_sys::core::w!("DefaultUIFont");

// UNSUPPORTED Rust 1060:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_DESKTOP_FOLDER: windows_sys::core::PCWSTR = windows_sys::core::w!("DesktopFolder");

// UNSUPPORTED Rust 1061:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_DISABLEADVTSHORTCUTS: windows_sys::core::PCWSTR = windows_sys::core::w!("DISABLEADVTSHORTCUTS");

// UNSUPPORTED Rust 1062:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_DISABLEROLLBACK: windows_sys::core::PCWSTR = windows_sys::core::w!("DISABLEROLLBACK");

// UNSUPPORTED Rust 1063:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_DISKPROMPT: windows_sys::core::PCWSTR = windows_sys::core::w!("DiskPrompt");

// UNSUPPORTED Rust 1064:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_ENABLEUSERCONTROL: windows_sys::core::PCWSTR = windows_sys::core::w!("EnableUserControl");

// UNSUPPORTED Rust 1065:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_ENFORCE_UPGRADE_COMPONENT_RULES: windows_sys::core::PCWSTR = windows_sys::core::w!("MSIENFORCEUPGRADECOMPONENTRULES");

// UNSUPPORTED Rust 1066:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_EXECUTEACTION: windows_sys::core::PCWSTR = windows_sys::core::w!("EXECUTEACTION");

// UNSUPPORTED Rust 1067:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_EXECUTEMODE: windows_sys::core::PCWSTR = windows_sys::core::w!("EXECUTEMODE");

// UNSUPPORTED Rust 1068:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_FAVORITES_FOLDER: windows_sys::core::PCWSTR = windows_sys::core::w!("FavoritesFolder");

// UNSUPPORTED Rust 1069:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_FEATUREADDDEFAULT: windows_sys::core::PCWSTR = windows_sys::core::w!("ADDDEFAULT");

// UNSUPPORTED Rust 1070:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_FEATUREADDLOCAL: windows_sys::core::PCWSTR = windows_sys::core::w!("ADDLOCAL");

// UNSUPPORTED Rust 1071:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_FEATUREADDSOURCE: windows_sys::core::PCWSTR = windows_sys::core::w!("ADDSOURCE");

// UNSUPPORTED Rust 1072:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_FEATUREADVERTISE: windows_sys::core::PCWSTR = windows_sys::core::w!("ADVERTISE");

// UNSUPPORTED Rust 1073:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_FEATUREREMOVE: windows_sys::core::PCWSTR = windows_sys::core::w!("REMOVE");

// UNSUPPORTED Rust 1074:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_FILEADDDEFAULT: windows_sys::core::PCWSTR = windows_sys::core::w!("FILEADDDEFAULT");

// UNSUPPORTED Rust 1075:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_FILEADDLOCAL: windows_sys::core::PCWSTR = windows_sys::core::w!("FILEADDLOCAL");

// UNSUPPORTED Rust 1076:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_FILEADDSOURCE: windows_sys::core::PCWSTR = windows_sys::core::w!("FILEADDSOURCE");

// UNSUPPORTED Rust 1077:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_FONTS_FOLDER: windows_sys::core::PCWSTR = windows_sys::core::w!("FontsFolder");

// UNSUPPORTED Rust 1078:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_HIDDEN_PROPERTIES: windows_sys::core::PCWSTR = windows_sys::core::w!("MsiHiddenProperties");

// UNSUPPORTED Rust 1079:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_HIDECANCEL: windows_sys::core::PCWSTR = windows_sys::core::w!("MsiUIHideCancel");

// UNSUPPORTED Rust 1080:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_IA64: windows_sys::core::PCWSTR = windows_sys::core::w!("IA64");

// UNSUPPORTED Rust 1081:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_INSTALLED: windows_sys::core::PCWSTR = windows_sys::core::w!("Installed");

// UNSUPPORTED Rust 1082:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_INSTALLLANGUAGE: windows_sys::core::PCWSTR = windows_sys::core::w!("ProductLanguage");

// UNSUPPORTED Rust 1083:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_INSTALLLEVEL: windows_sys::core::PCWSTR = windows_sys::core::w!("INSTALLLEVEL");

// UNSUPPORTED Rust 1084:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_INSTALLPERUSER: windows_sys::core::PCWSTR = windows_sys::core::w!("MSIINSTALLPERUSER");

// UNSUPPORTED Rust 1085:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_INTEL: windows_sys::core::PCWSTR = windows_sys::core::w!("Intel");

// UNSUPPORTED Rust 1086:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_INTEL64: windows_sys::core::PCWSTR = windows_sys::core::w!("Intel64");

// UNSUPPORTED Rust 1087:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_INTERNALINSTALLEDPERUSER: windows_sys::core::PCWSTR = windows_sys::core::w!("MSIINTERNALINSTALLEDPERUSER");

// UNSUPPORTED Rust 1088:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_ISADMINPACKAGE: windows_sys::core::PCWSTR = windows_sys::core::w!("IsAdminPackage");

// UNSUPPORTED Rust 1089:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_LEFTUNIT: windows_sys::core::PCWSTR = windows_sys::core::w!("LeftUnit");

// UNSUPPORTED Rust 1090:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_LIMITUI: windows_sys::core::PCWSTR = windows_sys::core::w!("LIMITUI");

// UNSUPPORTED Rust 1091:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_LOCALAPPDATA_FOLDER: windows_sys::core::PCWSTR = windows_sys::core::w!("LocalAppDataFolder");

// UNSUPPORTED Rust 1092:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_LOGACTION: windows_sys::core::PCWSTR = windows_sys::core::w!("LOGACTION");

// UNSUPPORTED Rust 1093:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_LOGONUSER: windows_sys::core::PCWSTR = windows_sys::core::w!("LogonUser");

// UNSUPPORTED Rust 1094:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_MANUFACTURER: windows_sys::core::PCWSTR = windows_sys::core::w!("Manufacturer");

// UNSUPPORTED Rust 1095:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_MSIAMD64: windows_sys::core::PCWSTR = windows_sys::core::w!("MsiAMD64");

// UNSUPPORTED Rust 1096:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_MSIDISABLEEEUI: windows_sys::core::PCWSTR = windows_sys::core::w!("MSIDISABLEEEUI");

// UNSUPPORTED Rust 1097:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_MSIDISABLELUAPATCHING: windows_sys::core::PCWSTR = windows_sys::core::w!("MSIDISABLELUAPATCHING");

// UNSUPPORTED Rust 1098:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_MSIINSTANCEGUID: windows_sys::core::PCWSTR = windows_sys::core::w!("MSIINSTANCEGUID");

// UNSUPPORTED Rust 1099:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_MSILOGFILELOCATION: windows_sys::core::PCWSTR = windows_sys::core::w!("MsiLogFileLocation");

// UNSUPPORTED Rust 1100:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_MSILOGGINGMODE: windows_sys::core::PCWSTR = windows_sys::core::w!("MsiLogging");

// UNSUPPORTED Rust 1101:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_MSINEWINSTANCE: windows_sys::core::PCWSTR = windows_sys::core::w!("MSINEWINSTANCE");

// UNSUPPORTED Rust 1102:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_MSINODISABLEMEDIA: windows_sys::core::PCWSTR = windows_sys::core::w!("MSINODISABLEMEDIA");

// UNSUPPORTED Rust 1103:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_MSIPACKAGEDOWNLOADLOCALCOPY: windows_sys::core::PCWSTR = windows_sys::core::w!("MSIPACKAGEDOWNLOADLOCALCOPY");

// UNSUPPORTED Rust 1104:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_MSIPATCHDOWNLOADLOCALCOPY: windows_sys::core::PCWSTR = windows_sys::core::w!("MSIPATCHDOWNLOADLOCALCOPY");

// UNSUPPORTED Rust 1105:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_MSIPATCHREMOVE: windows_sys::core::PCWSTR = windows_sys::core::w!("MSIPATCHREMOVE");

// UNSUPPORTED Rust 1106:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_MSITABLETPC: windows_sys::core::PCWSTR = windows_sys::core::w!("MsiTabletPC");

// UNSUPPORTED Rust 1107:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_MSIX64: windows_sys::core::PCWSTR = windows_sys::core::w!("Msix64");

// UNSUPPORTED Rust 1108:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_MSI_FASTINSTALL: windows_sys::core::PCWSTR = windows_sys::core::w!("MSIFASTINSTALL");

// UNSUPPORTED Rust 1109:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_MSI_REBOOT_PENDING: windows_sys::core::PCWSTR = windows_sys::core::w!("MsiSystemRebootPending");

// UNSUPPORTED Rust 1110:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_MSI_RM_CONTROL: windows_sys::core::PCWSTR = windows_sys::core::w!("MSIRESTARTMANAGERCONTROL");

// UNSUPPORTED Rust 1111:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_MSI_RM_DISABLE_RESTART: windows_sys::core::PCWSTR = windows_sys::core::w!("MSIDISABLERMRESTART");

// UNSUPPORTED Rust 1112:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_MSI_RM_SESSION_KEY: windows_sys::core::PCWSTR = windows_sys::core::w!("MsiRestartManagerSessionKey");

// UNSUPPORTED Rust 1113:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_MSI_RM_SHUTDOWN: windows_sys::core::PCWSTR = windows_sys::core::w!("MSIRMSHUTDOWN");

// UNSUPPORTED Rust 1114:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_MSI_UAC_DEPLOYMENT_COMPLIANT: windows_sys::core::PCWSTR = windows_sys::core::w!("MSIDEPLOYMENTCOMPLIANT");

// UNSUPPORTED Rust 1115:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_MSI_UNINSTALL_SUPERSEDED_COMPONENTS: windows_sys::core::PCWSTR = windows_sys::core::w!("MSIUNINSTALLSUPERSEDEDCOMPONENTS");

// UNSUPPORTED Rust 1116:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_MSI_USE_REAL_ADMIN_DETECTION: windows_sys::core::PCWSTR = windows_sys::core::w!("MSIUSEREALADMINDETECTION");

// UNSUPPORTED Rust 1117:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_MYPICTURES_FOLDER: windows_sys::core::PCWSTR = windows_sys::core::w!("MyPicturesFolder");

// UNSUPPORTED Rust 1118:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_NETASSEMBLYSUPPORT: windows_sys::core::PCWSTR = windows_sys::core::w!("MsiNetAssemblySupport");

// UNSUPPORTED Rust 1119:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_NETHOOD_FOLDER: windows_sys::core::PCWSTR = windows_sys::core::w!("NetHoodFolder");

// UNSUPPORTED Rust 1120:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_NOCOMPANYNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("NOCOMPANYNAME");

// UNSUPPORTED Rust 1121:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_NOUSERNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("NOUSERNAME");

// UNSUPPORTED Rust 1122:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_NTPRODUCTTYPE: windows_sys::core::PCWSTR = windows_sys::core::w!("MsiNTProductType");

// UNSUPPORTED Rust 1123:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_NTSUITEBACKOFFICE: windows_sys::core::PCWSTR = windows_sys::core::w!("MsiNTSuiteBackOffice");

// UNSUPPORTED Rust 1124:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_NTSUITEDATACENTER: windows_sys::core::PCWSTR = windows_sys::core::w!("MsiNTSuiteDataCenter");

// UNSUPPORTED Rust 1125:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_NTSUITEENTERPRISE: windows_sys::core::PCWSTR = windows_sys::core::w!("MsiNTSuiteEnterprise");

// UNSUPPORTED Rust 1126:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_NTSUITEPERSONAL: windows_sys::core::PCWSTR = windows_sys::core::w!("MsiNTSuitePersonal");

// UNSUPPORTED Rust 1127:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_NTSUITESMALLBUSINESS: windows_sys::core::PCWSTR = windows_sys::core::w!("MsiNTSuiteSmallBusiness");

// UNSUPPORTED Rust 1128:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_NTSUITESMALLBUSINESSRESTRICTED: windows_sys::core::PCWSTR = windows_sys::core::w!("MsiNTSuiteSmallBusinessRestricted");

// UNSUPPORTED Rust 1129:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_NTSUITEWEBSERVER: windows_sys::core::PCWSTR = windows_sys::core::w!("MsiNTSuiteWebServer");

// UNSUPPORTED Rust 1130:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_OLEADVTSUPPORT: windows_sys::core::PCWSTR = windows_sys::core::w!("OLEAdvtSupport");

// UNSUPPORTED Rust 1131:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_OUTOFDISKSPACE: windows_sys::core::PCWSTR = windows_sys::core::w!("OutOfDiskSpace");

// UNSUPPORTED Rust 1132:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_OUTOFNORBDISKSPACE: windows_sys::core::PCWSTR = windows_sys::core::w!("OutOfNoRbDiskSpace");

// UNSUPPORTED Rust 1133:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_PATCH: windows_sys::core::PCWSTR = windows_sys::core::w!("PATCH");

// UNSUPPORTED Rust 1134:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_PATCHNEWPACKAGECODE: windows_sys::core::PCWSTR = windows_sys::core::w!("PATCHNEWPACKAGECODE");

// UNSUPPORTED Rust 1135:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_PATCHNEWSUMMARYCOMMENTS: windows_sys::core::PCWSTR = windows_sys::core::w!("PATCHNEWSUMMARYCOMMENTS");

// UNSUPPORTED Rust 1136:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_PATCHNEWSUMMARYSUBJECT: windows_sys::core::PCWSTR = windows_sys::core::w!("PATCHNEWSUMMARYSUBJECT");

// UNSUPPORTED Rust 1137:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_PERSONAL_FOLDER: windows_sys::core::PCWSTR = windows_sys::core::w!("PersonalFolder");

// UNSUPPORTED Rust 1138:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_PHYSICALMEMORY: windows_sys::core::PCWSTR = windows_sys::core::w!("PhysicalMemory");

// UNSUPPORTED Rust 1139:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_PIDKEY: windows_sys::core::PCWSTR = windows_sys::core::w!("PIDKEY");

// UNSUPPORTED Rust 1140:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_PIDTEMPLATE: windows_sys::core::PCWSTR = windows_sys::core::w!("PIDTemplate");

// UNSUPPORTED Rust 1141:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_PRESELECTED: windows_sys::core::PCWSTR = windows_sys::core::w!("Preselected");

// UNSUPPORTED Rust 1142:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_PRIMARYFOLDER: windows_sys::core::PCWSTR = windows_sys::core::w!("PRIMARYFOLDER");

// UNSUPPORTED Rust 1143:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_PRIMARYFOLDER_PATH: windows_sys::core::PCWSTR = windows_sys::core::w!("PrimaryVolumePath");

// UNSUPPORTED Rust 1144:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_PRIMARYFOLDER_SPACEAVAILABLE: windows_sys::core::PCWSTR = windows_sys::core::w!("PrimaryVolumeSpaceAvailable");

// UNSUPPORTED Rust 1145:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_PRIMARYFOLDER_SPACEREMAINING: windows_sys::core::PCWSTR = windows_sys::core::w!("PrimaryVolumeSpaceRemaining");

// UNSUPPORTED Rust 1146:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_PRIMARYFOLDER_SPACEREQUIRED: windows_sys::core::PCWSTR = windows_sys::core::w!("PrimaryVolumeSpaceRequired");

// UNSUPPORTED Rust 1147:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_PRINTHOOD_FOLDER: windows_sys::core::PCWSTR = windows_sys::core::w!("PrintHoodFolder");

// UNSUPPORTED Rust 1148:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_PRIVILEGED: windows_sys::core::PCWSTR = windows_sys::core::w!("Privileged");

// UNSUPPORTED Rust 1149:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_PRODUCTCODE: windows_sys::core::PCWSTR = windows_sys::core::w!("ProductCode");

// UNSUPPORTED Rust 1150:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_PRODUCTID: windows_sys::core::PCWSTR = windows_sys::core::w!("ProductID");

// UNSUPPORTED Rust 1151:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_PRODUCTLANGUAGE: windows_sys::core::PCWSTR = windows_sys::core::w!("PRODUCTLANGUAGE");

// UNSUPPORTED Rust 1152:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_PRODUCTNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("ProductName");

// UNSUPPORTED Rust 1153:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_PRODUCTSTATE: windows_sys::core::PCWSTR = windows_sys::core::w!("ProductState");

// UNSUPPORTED Rust 1154:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_PRODUCTVERSION: windows_sys::core::PCWSTR = windows_sys::core::w!("ProductVersion");

// UNSUPPORTED Rust 1155:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_PROGRAMFILES64_FOLDER: windows_sys::core::PCWSTR = windows_sys::core::w!("ProgramFiles64Folder");

// UNSUPPORTED Rust 1156:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_PROGRAMFILES_FOLDER: windows_sys::core::PCWSTR = windows_sys::core::w!("ProgramFilesFolder");

// UNSUPPORTED Rust 1157:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_PROGRAMMENU_FOLDER: windows_sys::core::PCWSTR = windows_sys::core::w!("ProgramMenuFolder");

// UNSUPPORTED Rust 1158:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_PROGRESSONLY: windows_sys::core::PCWSTR = windows_sys::core::w!("MsiUIProgressOnly");

// UNSUPPORTED Rust 1159:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_PROMPTROLLBACKCOST: windows_sys::core::PCWSTR = windows_sys::core::w!("PROMPTROLLBACKCOST");

// UNSUPPORTED Rust 1160:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_REBOOT: windows_sys::core::PCWSTR = windows_sys::core::w!("REBOOT");

// UNSUPPORTED Rust 1161:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_REBOOTPROMPT: windows_sys::core::PCWSTR = windows_sys::core::w!("REBOOTPROMPT");

// UNSUPPORTED Rust 1162:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_RECENT_FOLDER: windows_sys::core::PCWSTR = windows_sys::core::w!("RecentFolder");

// UNSUPPORTED Rust 1163:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_REDIRECTEDDLLSUPPORT: windows_sys::core::PCWSTR = windows_sys::core::w!("RedirectedDllSupport");

// UNSUPPORTED Rust 1164:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_REINSTALL: windows_sys::core::PCWSTR = windows_sys::core::w!("REINSTALL");

// UNSUPPORTED Rust 1165:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_REINSTALLMODE: windows_sys::core::PCWSTR = windows_sys::core::w!("REINSTALLMODE");

// UNSUPPORTED Rust 1166:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_REMOTEADMINTS: windows_sys::core::PCWSTR = windows_sys::core::w!("RemoteAdminTS");

// UNSUPPORTED Rust 1167:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_REPLACEDINUSEFILES: windows_sys::core::PCWSTR = windows_sys::core::w!("ReplacedInUseFiles");

// UNSUPPORTED Rust 1168:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_RESTRICTEDUSERCONTROL: windows_sys::core::PCWSTR = windows_sys::core::w!("RestrictedUserControl");

// UNSUPPORTED Rust 1169:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_RESUME: windows_sys::core::PCWSTR = windows_sys::core::w!("RESUME");

// UNSUPPORTED Rust 1170:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_ROLLBACKDISABLED: windows_sys::core::PCWSTR = windows_sys::core::w!("RollbackDisabled");

// UNSUPPORTED Rust 1171:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_ROOTDRIVE: windows_sys::core::PCWSTR = windows_sys::core::w!("ROOTDRIVE");

// UNSUPPORTED Rust 1172:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_RUNNINGELEVATED: windows_sys::core::PCWSTR = windows_sys::core::w!("MsiRunningElevated");

// UNSUPPORTED Rust 1173:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_SCREENX: windows_sys::core::PCWSTR = windows_sys::core::w!("ScreenX");

// UNSUPPORTED Rust 1174:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_SCREENY: windows_sys::core::PCWSTR = windows_sys::core::w!("ScreenY");

// UNSUPPORTED Rust 1175:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_SENDTO_FOLDER: windows_sys::core::PCWSTR = windows_sys::core::w!("SendToFolder");

// UNSUPPORTED Rust 1176:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_SEQUENCE: windows_sys::core::PCWSTR = windows_sys::core::w!("SEQUENCE");

// UNSUPPORTED Rust 1177:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_SERVICEPACKLEVEL: windows_sys::core::PCWSTR = windows_sys::core::w!("ServicePackLevel");

// UNSUPPORTED Rust 1178:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_SERVICEPACKLEVELMINOR: windows_sys::core::PCWSTR = windows_sys::core::w!("ServicePackLevelMinor");

// UNSUPPORTED Rust 1179:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_SHAREDWINDOWS: windows_sys::core::PCWSTR = windows_sys::core::w!("SharedWindows");

// UNSUPPORTED Rust 1180:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_SHELLADVTSUPPORT: windows_sys::core::PCWSTR = windows_sys::core::w!("ShellAdvtSupport");

// UNSUPPORTED Rust 1181:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_SHORTFILENAMES: windows_sys::core::PCWSTR = windows_sys::core::w!("SHORTFILENAMES");

// UNSUPPORTED Rust 1182:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_SOURCEDIR: windows_sys::core::PCWSTR = windows_sys::core::w!("SourceDir");

// UNSUPPORTED Rust 1183:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_SOURCELIST: windows_sys::core::PCWSTR = windows_sys::core::w!("SOURCELIST");

// UNSUPPORTED Rust 1184:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_SOURCERESONLY: windows_sys::core::PCWSTR = windows_sys::core::w!("MsiUISourceResOnly");

// UNSUPPORTED Rust 1185:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_STARTMENU_FOLDER: windows_sys::core::PCWSTR = windows_sys::core::w!("StartMenuFolder");

// UNSUPPORTED Rust 1186:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_STARTUP_FOLDER: windows_sys::core::PCWSTR = windows_sys::core::w!("StartupFolder");

// UNSUPPORTED Rust 1187:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_SYSTEM16_FOLDER: windows_sys::core::PCWSTR = windows_sys::core::w!("System16Folder");

// UNSUPPORTED Rust 1188:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_SYSTEM64_FOLDER: windows_sys::core::PCWSTR = windows_sys::core::w!("System64Folder");

// UNSUPPORTED Rust 1189:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_SYSTEMLANGUAGEID: windows_sys::core::PCWSTR = windows_sys::core::w!("SystemLanguageID");

// UNSUPPORTED Rust 1190:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_SYSTEM_FOLDER: windows_sys::core::PCWSTR = windows_sys::core::w!("SystemFolder");

// UNSUPPORTED Rust 1191:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_TARGETDIR: windows_sys::core::PCWSTR = windows_sys::core::w!("TARGETDIR");

// UNSUPPORTED Rust 1192:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_TEMPLATE_AMD64: windows_sys::core::PCWSTR = windows_sys::core::w!("AMD64");

// UNSUPPORTED Rust 1193:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_TEMPLATE_FOLDER: windows_sys::core::PCWSTR = windows_sys::core::w!("TemplateFolder");

// UNSUPPORTED Rust 1194:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_TEMPLATE_X64: windows_sys::core::PCWSTR = windows_sys::core::w!("x64");

// UNSUPPORTED Rust 1195:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_TEMP_FOLDER: windows_sys::core::PCWSTR = windows_sys::core::w!("TempFolder");

// UNSUPPORTED Rust 1196:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_TERMSERVER: windows_sys::core::PCWSTR = windows_sys::core::w!("TerminalServer");

// UNSUPPORTED Rust 1197:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_TEXTHEIGHT: windows_sys::core::PCWSTR = windows_sys::core::w!("TextHeight");

// UNSUPPORTED Rust 1198:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_TEXTHEIGHT_CORRECTION: windows_sys::core::PCWSTR = windows_sys::core::w!("TextHeightCorrection");

// UNSUPPORTED Rust 1199:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_TEXTINTERNALLEADING: windows_sys::core::PCWSTR = windows_sys::core::w!("TextInternalLeading");

// UNSUPPORTED Rust 1200:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_TIME: windows_sys::core::PCWSTR = windows_sys::core::w!("Time");

// UNSUPPORTED Rust 1201:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_TRANSFORMS: windows_sys::core::PCWSTR = windows_sys::core::w!("TRANSFORMS");

// UNSUPPORTED Rust 1202:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_TRANSFORMSATSOURCE: windows_sys::core::PCWSTR = windows_sys::core::w!("TRANSFORMSATSOURCE");

// UNSUPPORTED Rust 1203:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_TRANSFORMSSECURE: windows_sys::core::PCWSTR = windows_sys::core::w!("TRANSFORMSSECURE");

// UNSUPPORTED Rust 1204:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_TRUEADMINUSER: windows_sys::core::PCWSTR = windows_sys::core::w!("MsiTrueAdminUser");

// UNSUPPORTED Rust 1205:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_TTCSUPPORT: windows_sys::core::PCWSTR = windows_sys::core::w!("TTCSupport");

// UNSUPPORTED Rust 1206:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_UACONLY: windows_sys::core::PCWSTR = windows_sys::core::w!("MsiUIUACOnly");

// UNSUPPORTED Rust 1207:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_UPDATESTARTED: windows_sys::core::PCWSTR = windows_sys::core::w!("UpdateStarted");

// UNSUPPORTED Rust 1208:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_UPGRADECODE: windows_sys::core::PCWSTR = windows_sys::core::w!("UpgradeCode");

// UNSUPPORTED Rust 1209:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_USERLANGUAGEID: windows_sys::core::PCWSTR = windows_sys::core::w!("UserLanguageID");

// UNSUPPORTED Rust 1210:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_USERNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("USERNAME");

// UNSUPPORTED Rust 1211:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_USERSID: windows_sys::core::PCWSTR = windows_sys::core::w!("UserSID");

// UNSUPPORTED Rust 1212:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_VERSION9X: windows_sys::core::PCWSTR = windows_sys::core::w!("Version9X");

// UNSUPPORTED Rust 1213:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_VERSIONNT: windows_sys::core::PCWSTR = windows_sys::core::w!("VersionNT");

// UNSUPPORTED Rust 1214:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_VERSIONNT64: windows_sys::core::PCWSTR = windows_sys::core::w!("VersionNT64");

// UNSUPPORTED Rust 1215:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_VIRTUALMEMORY: windows_sys::core::PCWSTR = windows_sys::core::w!("VirtualMemory");

// UNSUPPORTED Rust 1216:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_WIN32ASSEMBLYSUPPORT: windows_sys::core::PCWSTR = windows_sys::core::w!("MsiWin32AssemblySupport");

// UNSUPPORTED Rust 1217:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_WINDOWSBUILD: windows_sys::core::PCWSTR = windows_sys::core::w!("WindowsBuild");

// UNSUPPORTED Rust 1218:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_WINDOWS_FOLDER: windows_sys::core::PCWSTR = windows_sys::core::w!("WindowsFolder");

// UNSUPPORTED Rust 1219:1: non-scalar type Ptr unsupported
// pub const IPROPNAME_WINDOWS_VOLUME: windows_sys::core::PCWSTR = windows_sys::core::w!("WindowsVolume");

// UNSUPPORTED Rust 1220:1: non-scalar type Ptr unsupported
// pub const IPROPVALUE_EXECUTEMODE_NONE: windows_sys::core::PCWSTR = windows_sys::core::w!("NONE");

// UNSUPPORTED Rust 1221:1: non-scalar type Ptr unsupported
// pub const IPROPVALUE_EXECUTEMODE_SCRIPT: windows_sys::core::PCWSTR = windows_sys::core::w!("SCRIPT");

// UNSUPPORTED Rust 1222:1: non-scalar type Ptr unsupported
// pub const IPROPVALUE_FEATURE_ALL: windows_sys::core::PCWSTR = windows_sys::core::w!("ALL");

// UNSUPPORTED Rust 1223:1: non-scalar type Ptr unsupported
// pub const IPROPVALUE_MSI_RM_CONTROL_DISABLE: windows_sys::core::PCWSTR = windows_sys::core::w!("Disable");

// UNSUPPORTED Rust 1224:1: non-scalar type Ptr unsupported
// pub const IPROPVALUE_MSI_RM_CONTROL_DISABLESHUTDOWN: windows_sys::core::PCWSTR = windows_sys::core::w!("DisableShutdown");

// UNSUPPORTED Rust 1225:1: non-scalar type Ptr unsupported
// pub const IPROPVALUE_RBCOST_FAIL: windows_sys::core::PCWSTR = windows_sys::core::w!("F");

// UNSUPPORTED Rust 1226:1: non-scalar type Ptr unsupported
// pub const IPROPVALUE_RBCOST_PROMPT: windows_sys::core::PCWSTR = windows_sys::core::w!("P");

// UNSUPPORTED Rust 1227:1: non-scalar type Ptr unsupported
// pub const IPROPVALUE_RBCOST_SILENT: windows_sys::core::PCWSTR = windows_sys::core::w!("D");

// UNSUPPORTED Rust 1228:1: non-scalar type Ptr unsupported
// pub const IPROPVALUE__CARRYINGNDP_URTREINSTALL: windows_sys::core::PCWSTR = windows_sys::core::w!("URTREINSTALL");

// UNSUPPORTED Rust 1229:1: non-scalar type Ptr unsupported
// pub const IPROPVALUE__CARRYINGNDP_URTUPGRADE: windows_sys::core::PCWSTR = windows_sys::core::w!("URTUPGRADE");

// UNSUPPORTED Rust 1230:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const LIBID_MsmMergeTypeLib: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0adda82f_2c26_11d2_ad65_00a0c9af11a6);

public const val `LOGALL`: UInt = 15u;
public const val `LOGERR`: UInt = 4u;
public const val `LOGINFO`: UInt = 1u;
public const val `LOGNONE`: UInt = 0u;
public const val `LOGPERFMESSAGES`: UInt = 8u;
public const val `LOGTOKEN_NO_LOG`: UInt = 1u;
public const val `LOGTOKEN_SETUPAPI_APPLOG`: UInt = 2u;
public const val `LOGTOKEN_SETUPAPI_DEVLOG`: UInt = 3u;
public const val `LOGTOKEN_TYPE_MASK`: UInt = 3u;
public const val `LOGTOKEN_UNSPECIFIED`: UInt = 0u;
public const val `LOGWARN`: UInt = 2u;
// UNSUPPORTED Rust 1242:1: generic scalar type unsupported
// pub type LPDISPLAYVAL = Option<unsafe extern "system" fn(pcontext: *mut core::ffi::c_void, uitype: RESULTTYPES, szwval: windows_sys::core::PCWSTR, szwdescription: windows_sys::core::PCWSTR, szwlocation: windows_sys::core::PCWSTR) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 1243:1: generic scalar type unsupported
// pub type LPEVALCOMCALLBACK = Option<unsafe extern "system" fn(istatus: STATUSTYPES, szdata: windows_sys::core::PCWSTR, pcontext: *mut core::ffi::c_void) -> windows_sys::core::BOOL>;

public const val `MAX_FEATURE_CHARS`: UInt = 38u;
public const val `MAX_GUID_CHARS`: UInt = 38u;
public typealias `MSIADVERTISEOPTIONFLAGS` = Int;
public const val `MSIADVERTISEOPTIONFLAGS_INSTANCE`: `MSIADVERTISEOPTIONFLAGS` = 1;
public typealias `MSIARCHITECTUREFLAGS` = Int;
public const val `MSIARCHITECTUREFLAGS_AMD64`: `MSIARCHITECTUREFLAGS` = 4;
public const val `MSIARCHITECTUREFLAGS_ARM`: `MSIARCHITECTUREFLAGS` = 8;
public const val `MSIARCHITECTUREFLAGS_IA64`: `MSIARCHITECTUREFLAGS` = 2;
public const val `MSIARCHITECTUREFLAGS_X86`: `MSIARCHITECTUREFLAGS` = 1;
public typealias `MSIASSEMBLYINFO` = UInt;
public const val `MSIASSEMBLYINFO_NETASSEMBLY`: `MSIASSEMBLYINFO` = 0u;
public const val `MSIASSEMBLYINFO_WIN32ASSEMBLY`: `MSIASSEMBLYINFO` = 1u;
public typealias `MSICODE` = Int;
public const val `MSICODE_PATCH`: `MSICODE` = 1073741824;
public const val `MSICODE_PRODUCT`: `MSICODE` = 0;
public typealias `MSICOLINFO` = Int;
public const val `MSICOLINFO_NAMES`: `MSICOLINFO` = 0;
public const val `MSICOLINFO_TYPES`: `MSICOLINFO` = 1;
public typealias `MSICONDITION` = Int;
public const val `MSICONDITION_ERROR`: `MSICONDITION` = 3;
public const val `MSICONDITION_FALSE`: `MSICONDITION` = 0;
public const val `MSICONDITION_NONE`: `MSICONDITION` = 2;
public const val `MSICONDITION_TRUE`: `MSICONDITION` = 1;
public typealias `MSICOSTTREE` = Int;
public const val `MSICOSTTREE_CHILDREN`: `MSICOSTTREE` = 1;
public const val `MSICOSTTREE_PARENTS`: `MSICOSTTREE` = 2;
public const val `MSICOSTTREE_RESERVED`: `MSICOSTTREE` = 3;
public const val `MSICOSTTREE_SELFONLY`: `MSICOSTTREE` = 0;
public typealias `MSIDBERROR` = Int;
public const val `MSIDBERROR_BADCABINET`: `MSIDBERROR` = 26;
public const val `MSIDBERROR_BADCASE`: `MSIDBERROR` = 8;
public const val `MSIDBERROR_BADCATEGORY`: `MSIDBERROR` = 23;
public const val `MSIDBERROR_BADCONDITION`: `MSIDBERROR` = 15;
public const val `MSIDBERROR_BADCUSTOMSOURCE`: `MSIDBERROR` = 20;
public const val `MSIDBERROR_BADDEFAULTDIR`: `MSIDBERROR` = 18;
public const val `MSIDBERROR_BADFILENAME`: `MSIDBERROR` = 13;
public const val `MSIDBERROR_BADFORMATTED`: `MSIDBERROR` = 16;
public const val `MSIDBERROR_BADGUID`: `MSIDBERROR` = 9;
public const val `MSIDBERROR_BADIDENTIFIER`: `MSIDBERROR` = 11;
public const val `MSIDBERROR_BADKEYTABLE`: `MSIDBERROR` = 24;
public const val `MSIDBERROR_BADLANGUAGE`: `MSIDBERROR` = 12;
public const val `MSIDBERROR_BADLINK`: `MSIDBERROR` = 3;
public const val `MSIDBERROR_BADLOCALIZEATTRIB`: `MSIDBERROR` = 29;
public const val `MSIDBERROR_BADMAXMINVALUES`: `MSIDBERROR` = 25;
public const val `MSIDBERROR_BADPATH`: `MSIDBERROR` = 14;
public const val `MSIDBERROR_BADPROPERTY`: `MSIDBERROR` = 21;
public const val `MSIDBERROR_BADREGPATH`: `MSIDBERROR` = 19;
public const val `MSIDBERROR_BADSHORTCUT`: `MSIDBERROR` = 27;
public const val `MSIDBERROR_BADTEMPLATE`: `MSIDBERROR` = 17;
public const val `MSIDBERROR_BADVERSION`: `MSIDBERROR` = 7;
public const val `MSIDBERROR_BADWILDCARD`: `MSIDBERROR` = 10;
public const val `MSIDBERROR_DUPLICATEKEY`: `MSIDBERROR` = 1;
public const val `MSIDBERROR_FUNCTIONERROR`: `MSIDBERROR` = -1;
public const val `MSIDBERROR_INVALIDARG`: `MSIDBERROR` = -3;
public const val `MSIDBERROR_MISSINGDATA`: `MSIDBERROR` = 22;
public const val `MSIDBERROR_MOREDATA`: `MSIDBERROR` = -2;
public const val `MSIDBERROR_NOERROR`: `MSIDBERROR` = 0;
public const val `MSIDBERROR_NOTINSET`: `MSIDBERROR` = 6;
public const val `MSIDBERROR_OVERFLOW`: `MSIDBERROR` = 4;
public const val `MSIDBERROR_REQUIRED`: `MSIDBERROR` = 2;
public const val `MSIDBERROR_STRINGOVERFLOW`: `MSIDBERROR` = 28;
public const val `MSIDBERROR_UNDERFLOW`: `MSIDBERROR` = 5;
// UNSUPPORTED Rust 1306:1: non-scalar type Ptr unsupported
// pub const MSIDBOPEN_CREATE: windows_sys::core::PCWSTR = 3i32 as _;

// UNSUPPORTED Rust 1307:1: non-scalar type Ptr unsupported
// pub const MSIDBOPEN_CREATEDIRECT: windows_sys::core::PCWSTR = 4i32 as _;

// UNSUPPORTED Rust 1308:1: non-scalar type Ptr unsupported
// pub const MSIDBOPEN_DIRECT: windows_sys::core::PCWSTR = 2i32 as _;

public const val `MSIDBOPEN_PATCHFILE`: Int = 16;
// UNSUPPORTED Rust 1310:1: non-scalar type Ptr unsupported
// pub const MSIDBOPEN_READONLY: windows_sys::core::PCWSTR = 0i32 as _;

// UNSUPPORTED Rust 1311:1: non-scalar type Ptr unsupported
// pub const MSIDBOPEN_TRANSACT: windows_sys::core::PCWSTR = 1i32 as _;

public typealias `MSIDBSTATE` = Int;
public const val `MSIDBSTATE_ERROR`: `MSIDBSTATE` = -1;
public const val `MSIDBSTATE_READ`: `MSIDBSTATE` = 0;
public const val `MSIDBSTATE_WRITE`: `MSIDBSTATE` = 1;
// UNSUPPORTED Rust 1316:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MSIFILEHASHINFO {
//     pub dwFileHashInfoSize: u32,
//     pub dwData: [u32; 4],
// }

// UNSUPPORTED Rust 1322:1: declaration Impl has no candidate rule
// impl Default for MSIFILEHASHINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `MSIHANDLE` = UInt;
public typealias `MSIINSTALLCONTEXT` = Int;
public const val `MSIINSTALLCONTEXT_ALL`: `MSIINSTALLCONTEXT` = 7;
public const val `MSIINSTALLCONTEXT_ALLUSERMANAGED`: `MSIINSTALLCONTEXT` = 8;
public const val `MSIINSTALLCONTEXT_FIRSTVISIBLE`: `MSIINSTALLCONTEXT` = 0;
public const val `MSIINSTALLCONTEXT_MACHINE`: `MSIINSTALLCONTEXT` = 4;
public const val `MSIINSTALLCONTEXT_NONE`: `MSIINSTALLCONTEXT` = 0;
public const val `MSIINSTALLCONTEXT_USERMANAGED`: `MSIINSTALLCONTEXT` = 1;
public const val `MSIINSTALLCONTEXT_USERUNMANAGED`: `MSIINSTALLCONTEXT` = 2;
public typealias `MSIMODIFY` = Int;
public const val `MSIMODIFY_ASSIGN`: `MSIMODIFY` = 3;
public const val `MSIMODIFY_DELETE`: `MSIMODIFY` = 6;
public const val `MSIMODIFY_INSERT`: `MSIMODIFY` = 1;
public const val `MSIMODIFY_INSERT_TEMPORARY`: `MSIMODIFY` = 7;
public const val `MSIMODIFY_MERGE`: `MSIMODIFY` = 5;
public const val `MSIMODIFY_REFRESH`: `MSIMODIFY` = 0;
public const val `MSIMODIFY_REPLACE`: `MSIMODIFY` = 4;
public const val `MSIMODIFY_SEEK`: `MSIMODIFY` = -1;
public const val `MSIMODIFY_UPDATE`: `MSIMODIFY` = 2;
public const val `MSIMODIFY_VALIDATE`: `MSIMODIFY` = 8;
public const val `MSIMODIFY_VALIDATE_DELETE`: `MSIMODIFY` = 11;
public const val `MSIMODIFY_VALIDATE_FIELD`: `MSIMODIFY` = 10;
public const val `MSIMODIFY_VALIDATE_NEW`: `MSIMODIFY` = 9;
public typealias `MSIOPENPACKAGEFLAGS` = Int;
public const val `MSIOPENPACKAGEFLAGS_IGNOREMACHINESTATE`: `MSIOPENPACKAGEFLAGS` = 1;
public typealias `MSIPATCHDATATYPE` = Int;
// UNSUPPORTED Rust 1353:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MSIPATCHSEQUENCEINFOA {
//     pub szPatchData: windows_sys::core::PCSTR,
//     pub ePatchDataType: MSIPATCHDATATYPE,
//     pub dwOrder: u32,
//     pub uStatus: u32,
// }

// UNSUPPORTED Rust 1361:1: declaration Impl has no candidate rule
// impl Default for MSIPATCHSEQUENCEINFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1366:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MSIPATCHSEQUENCEINFOW {
//     pub szPatchData: windows_sys::core::PCWSTR,
//     pub ePatchDataType: MSIPATCHDATATYPE,
//     pub dwOrder: u32,
//     pub uStatus: u32,
// }

// UNSUPPORTED Rust 1374:1: declaration Impl has no candidate rule
// impl Default for MSIPATCHSEQUENCEINFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `MSIPATCHSTATE` = Int;
public const val `MSIPATCHSTATE_ALL`: `MSIPATCHSTATE` = 15;
public const val `MSIPATCHSTATE_APPLIED`: `MSIPATCHSTATE` = 1;
public const val `MSIPATCHSTATE_INVALID`: `MSIPATCHSTATE` = 0;
public const val `MSIPATCHSTATE_OBSOLETED`: `MSIPATCHSTATE` = 4;
public const val `MSIPATCHSTATE_REGISTERED`: `MSIPATCHSTATE` = 8;
public const val `MSIPATCHSTATE_SUPERSEDED`: `MSIPATCHSTATE` = 2;
public const val `MSIPATCH_DATATYPE_PATCHFILE`: `MSIPATCHDATATYPE` = 0;
public const val `MSIPATCH_DATATYPE_XMLBLOB`: `MSIPATCHDATATYPE` = 2;
public const val `MSIPATCH_DATATYPE_XMLPATH`: `MSIPATCHDATATYPE` = 1;
public typealias `MSIRUNMODE` = Int;
public const val `MSIRUNMODE_ADMIN`: `MSIRUNMODE` = 0;
public const val `MSIRUNMODE_ADVERTISE`: `MSIRUNMODE` = 1;
public const val `MSIRUNMODE_CABINET`: `MSIRUNMODE` = 8;
public const val `MSIRUNMODE_COMMIT`: `MSIRUNMODE` = 18;
public const val `MSIRUNMODE_LOGENABLED`: `MSIRUNMODE` = 4;
public const val `MSIRUNMODE_MAINTENANCE`: `MSIRUNMODE` = 2;
public const val `MSIRUNMODE_OPERATIONS`: `MSIRUNMODE` = 5;
public const val `MSIRUNMODE_REBOOTATEND`: `MSIRUNMODE` = 6;
public const val `MSIRUNMODE_REBOOTNOW`: `MSIRUNMODE` = 7;
public const val `MSIRUNMODE_RESERVED11`: `MSIRUNMODE` = 11;
public const val `MSIRUNMODE_RESERVED14`: `MSIRUNMODE` = 14;
public const val `MSIRUNMODE_RESERVED15`: `MSIRUNMODE` = 15;
public const val `MSIRUNMODE_ROLLBACK`: `MSIRUNMODE` = 17;
public const val `MSIRUNMODE_ROLLBACKENABLED`: `MSIRUNMODE` = 3;
public const val `MSIRUNMODE_SCHEDULED`: `MSIRUNMODE` = 16;
public const val `MSIRUNMODE_SOURCESHORTNAMES`: `MSIRUNMODE` = 9;
public const val `MSIRUNMODE_TARGETSHORTNAMES`: `MSIRUNMODE` = 10;
public const val `MSIRUNMODE_WINDOWS9X`: `MSIRUNMODE` = 12;
public const val `MSIRUNMODE_ZAWENABLED`: `MSIRUNMODE` = 13;
public typealias `MSISOURCETYPE` = Int;
public const val `MSISOURCETYPE_MEDIA`: `MSISOURCETYPE` = 4;
public const val `MSISOURCETYPE_NETWORK`: `MSISOURCETYPE` = 1;
public const val `MSISOURCETYPE_UNKNOWN`: `MSISOURCETYPE` = 0;
public const val `MSISOURCETYPE_URL`: `MSISOURCETYPE` = 2;
public typealias `MSITRANSACTION` = Int;
public typealias `MSITRANSACTIONSTATE` = UInt;
public const val `MSITRANSACTIONSTATE_COMMIT`: `MSITRANSACTIONSTATE` = 1u;
public const val `MSITRANSACTIONSTATE_ROLLBACK`: `MSITRANSACTIONSTATE` = 0u;
public const val `MSITRANSACTION_CHAIN_EMBEDDEDUI`: `MSITRANSACTION` = 1;
public const val `MSITRANSACTION_JOIN_EXISTING_EMBEDDEDUI`: `MSITRANSACTION` = 2;
public typealias `MSITRANSFORM_ERROR` = Int;
public const val `MSITRANSFORM_ERROR_ADDEXISTINGROW`: `MSITRANSFORM_ERROR` = 1;
public const val `MSITRANSFORM_ERROR_ADDEXISTINGTABLE`: `MSITRANSFORM_ERROR` = 4;
public const val `MSITRANSFORM_ERROR_CHANGECODEPAGE`: `MSITRANSFORM_ERROR` = 32;
public const val `MSITRANSFORM_ERROR_DELMISSINGROW`: `MSITRANSFORM_ERROR` = 2;
public const val `MSITRANSFORM_ERROR_DELMISSINGTABLE`: `MSITRANSFORM_ERROR` = 8;
public const val `MSITRANSFORM_ERROR_NONE`: `MSITRANSFORM_ERROR` = 0;
public const val `MSITRANSFORM_ERROR_UPDATEMISSINGROW`: `MSITRANSFORM_ERROR` = 16;
public const val `MSITRANSFORM_ERROR_VIEWTRANSFORM`: `MSITRANSFORM_ERROR` = 256;
public typealias `MSITRANSFORM_VALIDATE` = Int;
public const val `MSITRANSFORM_VALIDATE_LANGUAGE`: `MSITRANSFORM_VALIDATE` = 1;
public const val `MSITRANSFORM_VALIDATE_MAJORVERSION`: `MSITRANSFORM_VALIDATE` = 8;
public const val `MSITRANSFORM_VALIDATE_MINORVERSION`: `MSITRANSFORM_VALIDATE` = 16;
public const val `MSITRANSFORM_VALIDATE_NEWEQUALBASEVERSION`: `MSITRANSFORM_VALIDATE` = 256;
public const val `MSITRANSFORM_VALIDATE_NEWGREATERBASEVERSION`: `MSITRANSFORM_VALIDATE` = 1024;
public const val `MSITRANSFORM_VALIDATE_NEWGREATEREQUALBASEVERSION`: `MSITRANSFORM_VALIDATE` = 512;
public const val `MSITRANSFORM_VALIDATE_NEWLESSBASEVERSION`: `MSITRANSFORM_VALIDATE` = 64;
public const val `MSITRANSFORM_VALIDATE_NEWLESSEQUALBASEVERSION`: `MSITRANSFORM_VALIDATE` = 128;
public const val `MSITRANSFORM_VALIDATE_PLATFORM`: `MSITRANSFORM_VALIDATE` = 4;
public const val `MSITRANSFORM_VALIDATE_PRODUCT`: `MSITRANSFORM_VALIDATE` = 2;
public const val `MSITRANSFORM_VALIDATE_UPDATEVERSION`: `MSITRANSFORM_VALIDATE` = 32;
public const val `MSITRANSFORM_VALIDATE_UPGRADECODE`: `MSITRANSFORM_VALIDATE` = 2048;
public const val `MSI_INVALID_HASH_IS_FATAL`: UInt = 1u;
public const val `MSI_NULL_INTEGER`: UInt = 2147483648u;
// UNSUPPORTED Rust 1444:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const MsmMerge: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0adda830_2c26_11d2_ad65_00a0c9af11a6);

public typealias `PACKMAN_RUNTIME` = Int;
public const val `PACKMAN_RUNTIME_INVALID`: `PACKMAN_RUNTIME` = 6;
public const val `PACKMAN_RUNTIME_JUPITER`: `PACKMAN_RUNTIME` = 5;
public const val `PACKMAN_RUNTIME_MODERN_NATIVE`: `PACKMAN_RUNTIME` = 4;
public const val `PACKMAN_RUNTIME_NATIVE`: `PACKMAN_RUNTIME` = 1;
public const val `PACKMAN_RUNTIME_SILVERLIGHTMOBILE`: `PACKMAN_RUNTIME` = 2;
public const val `PACKMAN_RUNTIME_XNA`: `PACKMAN_RUNTIME` = 3;
// UNSUPPORTED Rust 1452:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PATCH_IGNORE_RANGE {
//     pub OffsetInOldFile: u32,
//     pub LengthInBytes: u32,
// }

// UNSUPPORTED Rust 1458:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PATCH_INTERLEAVE_MAP {
//     pub CountRanges: u32,
//     pub Range: [PATCH_INTERLEAVE_MAP_0; 1],
// }

// UNSUPPORTED Rust 1464:1: declaration Impl has no candidate rule
// impl Default for PATCH_INTERLEAVE_MAP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1469:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PATCH_INTERLEAVE_MAP_0 {
//     pub OldOffset: u32,
//     pub OldLength: u32,
//     pub NewLength: u32,
// }

// UNSUPPORTED Rust 1476:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PATCH_OLD_FILE_INFO {
//     pub SizeOfThisStruct: u32,
//     pub Anonymous: PATCH_OLD_FILE_INFO_0,
//     pub IgnoreRangeCount: u32,
//     pub IgnoreRangeArray: *mut PATCH_IGNORE_RANGE,
//     pub RetainRangeCount: u32,
//     pub RetainRangeArray: *mut PATCH_RETAIN_RANGE,
// }

// UNSUPPORTED Rust 1486:1: declaration Impl has no candidate rule
// impl Default for PATCH_OLD_FILE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1491:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union PATCH_OLD_FILE_INFO_0 {
//     pub OldFileNameA: windows_sys::core::PCSTR,
//     pub OldFileNameW: windows_sys::core::PCWSTR,
//     pub OldFileHandle: super::super::Foundation::HANDLE,
// }

// UNSUPPORTED Rust 1498:1: declaration Impl has no candidate rule
// impl Default for PATCH_OLD_FILE_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1503:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PATCH_OLD_FILE_INFO_A {
//     pub SizeOfThisStruct: u32,
//     pub OldFileName: windows_sys::core::PCSTR,
//     pub IgnoreRangeCount: u32,
//     pub IgnoreRangeArray: *mut PATCH_IGNORE_RANGE,
//     pub RetainRangeCount: u32,
//     pub RetainRangeArray: *mut PATCH_RETAIN_RANGE,
// }

// UNSUPPORTED Rust 1513:1: declaration Impl has no candidate rule
// impl Default for PATCH_OLD_FILE_INFO_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1518:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PATCH_OLD_FILE_INFO_H {
//     pub SizeOfThisStruct: u32,
//     pub OldFileHandle: super::super::Foundation::HANDLE,
//     pub IgnoreRangeCount: u32,
//     pub IgnoreRangeArray: *mut PATCH_IGNORE_RANGE,
//     pub RetainRangeCount: u32,
//     pub RetainRangeArray: *mut PATCH_RETAIN_RANGE,
// }

// UNSUPPORTED Rust 1528:1: declaration Impl has no candidate rule
// impl Default for PATCH_OLD_FILE_INFO_H {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1533:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PATCH_OLD_FILE_INFO_W {
//     pub SizeOfThisStruct: u32,
//     pub OldFileName: windows_sys::core::PCWSTR,
//     pub IgnoreRangeCount: u32,
//     pub IgnoreRangeArray: *mut PATCH_IGNORE_RANGE,
//     pub RetainRangeCount: u32,
//     pub RetainRangeArray: *mut PATCH_RETAIN_RANGE,
// }

// UNSUPPORTED Rust 1543:1: declaration Impl has no candidate rule
// impl Default for PATCH_OLD_FILE_INFO_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1548:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PATCH_OPTION_DATA {
//     pub SizeOfThisStruct: u32,
//     pub SymbolOptionFlags: u32,
//     pub NewFileSymbolPath: windows_sys::core::PCSTR,
//     pub OldFileSymbolPathArray: *const windows_sys::core::PCSTR,
//     pub ExtendedOptionFlags: u32,
//     pub SymLoadCallback: PPATCH_SYMLOAD_CALLBACK,
//     pub SymLoadContext: *mut core::ffi::c_void,
//     pub InterleaveMapArray: *mut *mut PATCH_INTERLEAVE_MAP,
//     pub MaxLzxWindowSize: u32,
// }

// UNSUPPORTED Rust 1561:1: declaration Impl has no candidate rule
// impl Default for PATCH_OPTION_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PATCH_OPTION_FAIL_IF_BIGGER`: UInt = 1048576u;
public const val `PATCH_OPTION_FAIL_IF_SAME_FILE`: UInt = 524288u;
public const val `PATCH_OPTION_INTERLEAVE_FILES`: UInt = 1073741824u;
public const val `PATCH_OPTION_NO_BINDFIX`: UInt = 65536u;
public const val `PATCH_OPTION_NO_CHECKSUM`: UInt = 2097152u;
public const val `PATCH_OPTION_NO_LOCKFIX`: UInt = 131072u;
public const val `PATCH_OPTION_NO_REBASE`: UInt = 262144u;
public const val `PATCH_OPTION_NO_RESTIMEFIX`: UInt = 4194304u;
public const val `PATCH_OPTION_NO_TIMESTAMP`: UInt = 8388608u;
public const val `PATCH_OPTION_RESERVED1`: UInt = 2147483648u;
public const val `PATCH_OPTION_SIGNATURE_MD5`: UInt = 16777216u;
public const val `PATCH_OPTION_USE_BEST`: UInt = 0u;
public const val `PATCH_OPTION_USE_LZX_A`: UInt = 1u;
public const val `PATCH_OPTION_USE_LZX_B`: UInt = 2u;
public const val `PATCH_OPTION_USE_LZX_BEST`: UInt = 3u;
public const val `PATCH_OPTION_USE_LZX_LARGE`: UInt = 4u;
public const val `PATCH_OPTION_VALID_FLAGS`: UInt = 3237937159u;
// UNSUPPORTED Rust 1583:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PATCH_RETAIN_RANGE {
//     pub OffsetInOldFile: u32,
//     pub LengthInBytes: u32,
//     pub OffsetInNewFile: u32,
// }

public const val `PATCH_SYMBOL_NO_FAILURES`: UInt = 2u;
public const val `PATCH_SYMBOL_NO_IMAGEHLP`: UInt = 1u;
public const val `PATCH_SYMBOL_RESERVED1`: UInt = 2147483648u;
public const val `PATCH_SYMBOL_UNDECORATED_TOO`: UInt = 4u;
public const val `PATCH_TRANSFORM_PE_IRELOC_2`: UInt = 512u;
public const val `PATCH_TRANSFORM_PE_RESOURCE_2`: UInt = 256u;
public const val `PID_APPNAME`: UInt = 18u;
public const val `PID_AUTHOR`: UInt = 4u;
public const val `PID_CHARCOUNT`: UInt = 16u;
public const val `PID_COMMENTS`: UInt = 6u;
public const val `PID_CREATE_DTM`: UInt = 12u;
public const val `PID_EDITTIME`: UInt = 10u;
public const val `PID_KEYWORDS`: UInt = 5u;
public const val `PID_LASTAUTHOR`: UInt = 8u;
public const val `PID_LASTPRINTED`: UInt = 11u;
public const val `PID_LASTSAVE_DTM`: UInt = 13u;
public const val `PID_MSIRESTRICT`: UInt = 16u;
public const val `PID_MSISOURCE`: UInt = 15u;
public const val `PID_MSIVERSION`: UInt = 14u;
public const val `PID_PAGECOUNT`: UInt = 14u;
public const val `PID_REVNUMBER`: UInt = 9u;
public const val `PID_SUBJECT`: UInt = 3u;
public const val `PID_TEMPLATE`: UInt = 7u;
public const val `PID_THUMBNAIL`: UInt = 17u;
public const val `PID_TITLE`: UInt = 2u;
public const val `PID_WORDCOUNT`: UInt = 15u;
// UNSUPPORTED Rust 1616:1: generic scalar type unsupported
// pub type PINSTALLUI_HANDLER_RECORD = Option<unsafe extern "system" fn(pvcontext: *mut core::ffi::c_void, imessagetype: u32, hrecord: MSIHANDLE) -> i32>;

// UNSUPPORTED Rust 1617:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PMSIHANDLE {
//     pub m_h: MSIHANDLE,
// }

// UNSUPPORTED Rust 1622:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const PMSvc: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb9e511fc_e364_497a_a121_b7b3612cedce);

public typealias `PM_ACTIVATION_POLICY` = Int;
public const val `PM_ACTIVATION_POLICY_INVALID`: `PM_ACTIVATION_POLICY` = 7;
public const val `PM_ACTIVATION_POLICY_MULTISESSION`: `PM_ACTIVATION_POLICY` = 4;
public const val `PM_ACTIVATION_POLICY_REPLACE`: `PM_ACTIVATION_POLICY` = 2;
public const val `PM_ACTIVATION_POLICY_REPLACESAMEPARAMS`: `PM_ACTIVATION_POLICY` = 3;
public const val `PM_ACTIVATION_POLICY_REPLACE_IGNOREFOREGROUND`: `PM_ACTIVATION_POLICY` = 5;
public const val `PM_ACTIVATION_POLICY_RESUME`: `PM_ACTIVATION_POLICY` = 0;
public const val `PM_ACTIVATION_POLICY_RESUMESAMEPARAMS`: `PM_ACTIVATION_POLICY` = 1;
public const val `PM_ACTIVATION_POLICY_UNKNOWN`: `PM_ACTIVATION_POLICY` = 6;
public typealias `PM_APPLICATION_HUBTYPE` = Int;
public const val `PM_APPLICATION_HUBTYPE_INVALID`: `PM_APPLICATION_HUBTYPE` = 2;
public const val `PM_APPLICATION_HUBTYPE_MUSIC`: `PM_APPLICATION_HUBTYPE` = 1;
public const val `PM_APPLICATION_HUBTYPE_NONMUSIC`: `PM_APPLICATION_HUBTYPE` = 0;
public const val `PM_APPLICATION_INSTALL_DEBUG`: `PM_APPLICATION_INSTALL_TYPE` = 3;
public const val `PM_APPLICATION_INSTALL_ENTERPRISE`: `PM_APPLICATION_INSTALL_TYPE` = 4;
public const val `PM_APPLICATION_INSTALL_INVALID`: `PM_APPLICATION_INSTALL_TYPE` = 5;
public const val `PM_APPLICATION_INSTALL_IN_ROM`: `PM_APPLICATION_INSTALL_TYPE` = 1;
public const val `PM_APPLICATION_INSTALL_NORMAL`: `PM_APPLICATION_INSTALL_TYPE` = 0;
public const val `PM_APPLICATION_INSTALL_PA`: `PM_APPLICATION_INSTALL_TYPE` = 2;
public typealias `PM_APPLICATION_INSTALL_TYPE` = Int;
public typealias `PM_APPLICATION_STATE` = Int;
public const val `PM_APPLICATION_STATE_DISABLED_BACKING_UP`: `PM_APPLICATION_STATE` = 9;
public const val `PM_APPLICATION_STATE_DISABLED_ENTERPRISE`: `PM_APPLICATION_STATE` = 8;
public const val `PM_APPLICATION_STATE_DISABLED_MDIL_BINDING`: `PM_APPLICATION_STATE` = 10;
public const val `PM_APPLICATION_STATE_DISABLED_SD_CARD`: `PM_APPLICATION_STATE` = 7;
public const val `PM_APPLICATION_STATE_INSTALLED`: `PM_APPLICATION_STATE` = 1;
public const val `PM_APPLICATION_STATE_INSTALLING`: `PM_APPLICATION_STATE` = 2;
public const val `PM_APPLICATION_STATE_INVALID`: `PM_APPLICATION_STATE` = 11;
public const val `PM_APPLICATION_STATE_LICENSE_UPDATING`: `PM_APPLICATION_STATE` = 5;
public const val `PM_APPLICATION_STATE_MAX`: `PM_APPLICATION_STATE` = 10;
public const val `PM_APPLICATION_STATE_MIN`: `PM_APPLICATION_STATE` = 0;
public const val `PM_APPLICATION_STATE_MOVING`: `PM_APPLICATION_STATE` = 6;
public const val `PM_APPLICATION_STATE_UNINSTALLING`: `PM_APPLICATION_STATE` = 4;
public const val `PM_APPLICATION_STATE_UPDATING`: `PM_APPLICATION_STATE` = 3;
// UNSUPPORTED Rust 1657:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PM_APPTASKTYPE {
//     pub ProductID: windows_sys::core::GUID,
//     pub TaskType: PM_TASK_TYPE,
// }

public const val `PM_APP_FILTER_ALL`: `PM_ENUM_APP_FILTER` = 0;
public const val `PM_APP_FILTER_ALL_INCLUDE_MODERN`: `PM_ENUM_APP_FILTER` = 6;
public const val `PM_APP_FILTER_FRAMEWORK`: `PM_ENUM_APP_FILTER` = 7;
public const val `PM_APP_FILTER_GENRE`: `PM_ENUM_APP_FILTER` = 2;
public const val `PM_APP_FILTER_HUBTYPE`: `PM_ENUM_APP_FILTER` = 4;
public const val `PM_APP_FILTER_MAX`: `PM_ENUM_APP_FILTER` = 8;
public const val `PM_APP_FILTER_NONGAMES`: `PM_ENUM_APP_FILTER` = 3;
public const val `PM_APP_FILTER_PINABLEONKIDZONE`: `PM_ENUM_APP_FILTER` = 5;
public const val `PM_APP_FILTER_VISIBLE`: `PM_ENUM_APP_FILTER` = 1;
public typealias `PM_APP_GENRE` = Int;
public const val `PM_APP_GENRE_GAMES`: `PM_APP_GENRE` = 0;
public const val `PM_APP_GENRE_INVALID`: `PM_APP_GENRE` = 2;
public const val `PM_APP_GENRE_OTHER`: `PM_APP_GENRE` = 1;
// UNSUPPORTED Rust 1676:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PM_BSATASKID {
//     pub ProductID: windows_sys::core::GUID,
//     pub TaskID: windows_sys::core::BSTR,
// }

// UNSUPPORTED Rust 1682:1: declaration Impl has no candidate rule
// impl Default for PM_BSATASKID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1687:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PM_BWTASKID {
//     pub ProductID: windows_sys::core::GUID,
//     pub TaskID: windows_sys::core::BSTR,
// }

// UNSUPPORTED Rust 1693:1: declaration Impl has no candidate rule
// impl Default for PM_BWTASKID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `PM_ENUM_APP_FILTER` = Int;
public typealias `PM_ENUM_BSA_FILTER` = Int;
public const val `PM_ENUM_BSA_FILTER_ALL`: `PM_ENUM_BSA_FILTER` = 26;
public const val `PM_ENUM_BSA_FILTER_BY_ALL_LAUNCHONBOOT`: `PM_ENUM_BSA_FILTER` = 30;
public const val `PM_ENUM_BSA_FILTER_BY_PERIODIC`: `PM_ENUM_BSA_FILTER` = 29;
public const val `PM_ENUM_BSA_FILTER_BY_PRODUCTID`: `PM_ENUM_BSA_FILTER` = 28;
public const val `PM_ENUM_BSA_FILTER_BY_TASKID`: `PM_ENUM_BSA_FILTER` = 27;
public const val `PM_ENUM_BSA_FILTER_MAX`: `PM_ENUM_BSA_FILTER` = 31;
public typealias `PM_ENUM_BW_FILTER` = Int;
public const val `PM_ENUM_BW_FILTER_BOOTWORKER_ALL`: `PM_ENUM_BW_FILTER` = 31;
public const val `PM_ENUM_BW_FILTER_BY_TASKID`: `PM_ENUM_BW_FILTER` = 32;
public const val `PM_ENUM_BW_FILTER_MAX`: `PM_ENUM_BW_FILTER` = 33;
public typealias `PM_ENUM_EXTENSION_FILTER` = Int;
public const val `PM_ENUM_EXTENSION_FILTER_APPCONNECT`: `PM_ENUM_EXTENSION_FILTER` = 17;
public const val `PM_ENUM_EXTENSION_FILTER_BY_CONSUMER`: `PM_ENUM_EXTENSION_FILTER` = 17;
public const val `PM_ENUM_EXTENSION_FILTER_CACHEDFILEUPDATER_ALL`: `PM_ENUM_EXTENSION_FILTER` = 25;
public const val `PM_ENUM_EXTENSION_FILTER_FILEOPENPICKER_ALL`: `PM_ENUM_EXTENSION_FILTER` = 23;
public const val `PM_ENUM_EXTENSION_FILTER_FILESAVEPICKER_ALL`: `PM_ENUM_EXTENSION_FILTER` = 24;
public const val `PM_ENUM_EXTENSION_FILTER_FTASSOC_APPLICATION_ALL`: `PM_ENUM_EXTENSION_FILTER` = 21;
public const val `PM_ENUM_EXTENSION_FILTER_FTASSOC_CONTENTTYPE_ALL`: `PM_ENUM_EXTENSION_FILTER` = 20;
public const val `PM_ENUM_EXTENSION_FILTER_FTASSOC_FILETYPE_ALL`: `PM_ENUM_EXTENSION_FILTER` = 19;
public const val `PM_ENUM_EXTENSION_FILTER_MAX`: `PM_ENUM_EXTENSION_FILTER` = 26;
public const val `PM_ENUM_EXTENSION_FILTER_PROTOCOL_ALL`: `PM_ENUM_EXTENSION_FILTER` = 18;
public const val `PM_ENUM_EXTENSION_FILTER_SHARETARGET_ALL`: `PM_ENUM_EXTENSION_FILTER` = 22;
// UNSUPPORTED Rust 1722:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PM_ENUM_FILTER {
//     pub FilterType: i32,
//     pub FilterParameter: PM_ENUM_FILTER_0,
// }

// UNSUPPORTED Rust 1728:1: declaration Impl has no candidate rule
// impl Default for PM_ENUM_FILTER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1733:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union PM_ENUM_FILTER_0 {
//     pub Dummy: i32,
//     pub Genre: PM_APP_GENRE,
//     pub AppHubType: PM_APPLICATION_HUBTYPE,
//     pub HubType: PM_TILE_HUBTYPE,
//     pub Tasktype: PM_TASK_TYPE,
//     pub TaskProductID: windows_sys::core::GUID,
//     pub TileProductID: windows_sys::core::GUID,
//     pub AppTaskType: PM_APPTASKTYPE,
//     pub Consumer: PM_EXTENSIONCONSUMER,
//     pub BSATask: PM_BSATASKID,
//     pub BSAProductID: windows_sys::core::GUID,
//     pub BWTask: PM_BWTASKID,
//     pub ProtocolName: windows_sys::core::BSTR,
//     pub FileType: windows_sys::core::BSTR,
//     pub ContentType: windows_sys::core::BSTR,
//     pub AppSupportedFileExtPID: windows_sys::core::GUID,
//     pub ShareTargetFileType: windows_sys::core::BSTR,
// }

// UNSUPPORTED Rust 1754:1: declaration Impl has no candidate rule
// impl Default for PM_ENUM_FILTER_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `PM_ENUM_TASK_FILTER` = Int;
public typealias `PM_ENUM_TILE_FILTER` = Int;
// UNSUPPORTED Rust 1761:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PM_EXTENSIONCONSUMER {
//     pub ConsumerPID: windows_sys::core::GUID,
//     pub ExtensionID: windows_sys::core::BSTR,
// }

// UNSUPPORTED Rust 1767:1: declaration Impl has no candidate rule
// impl Default for PM_EXTENSIONCONSUMER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1772:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PM_INSTALLINFO {
//     pub ProductID: windows_sys::core::GUID,
//     pub PackagePath: windows_sys::core::BSTR,
//     pub InstanceID: windows_sys::core::GUID,
//     pub pbLicense: *mut u8,
//     pub cbLicense: u32,
//     pub IsUninstallDisabled: windows_sys::core::BOOL,
//     pub DeploymentOptions: u32,
//     pub OfferID: windows_sys::core::GUID,
//     pub MarketplaceAppVersion: windows_sys::core::BSTR,
// }

// UNSUPPORTED Rust 1785:1: declaration Impl has no candidate rule
// impl Default for PM_INSTALLINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1790:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PM_INVOCATIONINFO {
//     pub URIBaseOrAUMID: windows_sys::core::BSTR,
//     pub URIFragmentOrArgs: windows_sys::core::BSTR,
// }

// UNSUPPORTED Rust 1796:1: declaration Impl has no candidate rule
// impl Default for PM_INVOCATIONINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `PM_LIVETILE_RECURRENCE_TYPE` = Int;
public const val `PM_LIVETILE_RECURRENCE_TYPE_INSTANT`: `PM_LIVETILE_RECURRENCE_TYPE` = 0;
public const val `PM_LIVETILE_RECURRENCE_TYPE_INTERVAL`: `PM_LIVETILE_RECURRENCE_TYPE` = 2;
public const val `PM_LIVETILE_RECURRENCE_TYPE_MAX`: `PM_LIVETILE_RECURRENCE_TYPE` = 2;
public const val `PM_LIVETILE_RECURRENCE_TYPE_ONETIME`: `PM_LIVETILE_RECURRENCE_TYPE` = 1;
public typealias `PM_LOGO_SIZE` = Int;
public const val `PM_LOGO_SIZE_INVALID`: `PM_LOGO_SIZE` = 3;
public const val `PM_LOGO_SIZE_LARGE`: `PM_LOGO_SIZE` = 2;
public const val `PM_LOGO_SIZE_MEDIUM`: `PM_LOGO_SIZE` = 1;
public const val `PM_LOGO_SIZE_SMALL`: `PM_LOGO_SIZE` = 0;
// UNSUPPORTED Rust 1811:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PM_STARTAPPBLOB {
//     pub cbSize: u32,
//     pub ProductID: windows_sys::core::GUID,
//     pub AppTitle: windows_sys::core::BSTR,
//     pub IconPath: windows_sys::core::BSTR,
//     pub IsUninstallable: windows_sys::core::BOOL,
//     pub AppInstallType: PM_APPLICATION_INSTALL_TYPE,
//     pub InstanceID: windows_sys::core::GUID,
//     pub State: PM_APPLICATION_STATE,
//     pub IsModern: windows_sys::core::BOOL,
//     pub IsModernLightUp: windows_sys::core::BOOL,
//     pub LightUpSupportMask: u16,
// }

// UNSUPPORTED Rust 1826:1: declaration Impl has no candidate rule
// impl Default for PM_STARTAPPBLOB {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1831:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PM_STARTTILEBLOB {
//     pub cbSize: u32,
//     pub ProductID: windows_sys::core::GUID,
//     pub TileID: windows_sys::core::BSTR,
//     pub TemplateType: TILE_TEMPLATE_TYPE,
//     pub HubPosition: [u32; 32],
//     pub HubVisibilityBitmask: u32,
//     pub IsDefault: windows_sys::core::BOOL,
//     pub TileType: PM_STARTTILE_TYPE,
//     pub pbPropBlob: *mut u8,
//     pub cbPropBlob: u32,
//     pub IsRestoring: windows_sys::core::BOOL,
//     pub IsModern: windows_sys::core::BOOL,
//     pub InvocationInfo: PM_INVOCATIONINFO,
// }

// UNSUPPORTED Rust 1848:1: declaration Impl has no candidate rule
// impl Default for PM_STARTTILEBLOB {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `PM_STARTTILE_TYPE` = Int;
public const val `PM_STARTTILE_TYPE_APPLIST`: `PM_STARTTILE_TYPE` = 3;
public const val `PM_STARTTILE_TYPE_APPLISTPRIMARY`: `PM_STARTTILE_TYPE` = 4;
public const val `PM_STARTTILE_TYPE_INVALID`: `PM_STARTTILE_TYPE` = 5;
public const val `PM_STARTTILE_TYPE_PRIMARY`: `PM_STARTTILE_TYPE` = 1;
public const val `PM_STARTTILE_TYPE_SECONDARY`: `PM_STARTTILE_TYPE` = 2;
public const val `PM_TASK_FILTER_APP_ALL`: `PM_ENUM_TASK_FILTER` = 12;
public const val `PM_TASK_FILTER_APP_TASK_TYPE`: `PM_ENUM_TASK_FILTER` = 15;
public const val `PM_TASK_FILTER_BGEXECUTION`: `PM_ENUM_TASK_FILTER` = 16;
public const val `PM_TASK_FILTER_DEHYD_SUPRESSING`: `PM_ENUM_TASK_FILTER` = 14;
public const val `PM_TASK_FILTER_MAX`: `PM_ENUM_TASK_FILTER` = 17;
public const val `PM_TASK_FILTER_TASK_TYPE`: `PM_ENUM_TASK_FILTER` = 13;
public typealias `PM_TASK_TRANSITION` = Int;
public const val `PM_TASK_TRANSITION_CUSTOM`: `PM_TASK_TRANSITION` = 6;
public const val `PM_TASK_TRANSITION_DEFAULT`: `PM_TASK_TRANSITION` = 0;
public const val `PM_TASK_TRANSITION_INVALID`: `PM_TASK_TRANSITION` = 7;
public const val `PM_TASK_TRANSITION_NONE`: `PM_TASK_TRANSITION` = 1;
public const val `PM_TASK_TRANSITION_READERBOARD`: `PM_TASK_TRANSITION` = 5;
public const val `PM_TASK_TRANSITION_SLIDE`: `PM_TASK_TRANSITION` = 3;
public const val `PM_TASK_TRANSITION_SWIVEL`: `PM_TASK_TRANSITION` = 4;
public const val `PM_TASK_TRANSITION_TURNSTILE`: `PM_TASK_TRANSITION` = 2;
public typealias `PM_TASK_TYPE` = Int;
public const val `PM_TASK_TYPE_BACKGROUNDSERVICEAGENT`: `PM_TASK_TYPE` = 3;
public const val `PM_TASK_TYPE_BACKGROUNDWORKER`: `PM_TASK_TYPE` = 4;
public const val `PM_TASK_TYPE_DEFAULT`: `PM_TASK_TYPE` = 1;
public const val `PM_TASK_TYPE_INVALID`: `PM_TASK_TYPE` = 5;
public const val `PM_TASK_TYPE_NORMAL`: `PM_TASK_TYPE` = 0;
public const val `PM_TASK_TYPE_SETTINGS`: `PM_TASK_TYPE` = 2;
public const val `PM_TILE_FILTER_APPLIST`: `PM_ENUM_TILE_FILTER` = 8;
public const val `PM_TILE_FILTER_APP_ALL`: `PM_ENUM_TILE_FILTER` = 11;
public const val `PM_TILE_FILTER_HUBTYPE`: `PM_ENUM_TILE_FILTER` = 10;
public const val `PM_TILE_FILTER_MAX`: `PM_ENUM_TILE_FILTER` = 12;
public const val `PM_TILE_FILTER_PINNED`: `PM_ENUM_TILE_FILTER` = 9;
public typealias `PM_TILE_HUBTYPE` = Int;
public const val `PM_TILE_HUBTYPE_APPLIST`: `PM_TILE_HUBTYPE` = 1073741824;
public const val `PM_TILE_HUBTYPE_CACHED`: `PM_TILE_HUBTYPE` = 67108864;
public const val `PM_TILE_HUBTYPE_GAMES`: `PM_TILE_HUBTYPE` = 536870912;
public const val `PM_TILE_HUBTYPE_INVALID`: `PM_TILE_HUBTYPE` = 67108865;
public const val `PM_TILE_HUBTYPE_KIDZONE`: `PM_TILE_HUBTYPE` = 33554432;
public const val `PM_TILE_HUBTYPE_LOCKSCREEN`: `PM_TILE_HUBTYPE` = 16777216;
public const val `PM_TILE_HUBTYPE_MOSETTINGS`: `PM_TILE_HUBTYPE` = 268435456;
public const val `PM_TILE_HUBTYPE_MUSIC`: `PM_TILE_HUBTYPE` = 1;
public const val `PM_TILE_HUBTYPE_STARTMENU`: `PM_TILE_HUBTYPE` = -2147483648;
public typealias `PM_TILE_SIZE` = Int;
public const val `PM_TILE_SIZE_INVALID`: `PM_TILE_SIZE` = 5;
public const val `PM_TILE_SIZE_LARGE`: `PM_TILE_SIZE` = 2;
public const val `PM_TILE_SIZE_MEDIUM`: `PM_TILE_SIZE` = 1;
public const val `PM_TILE_SIZE_SMALL`: `PM_TILE_SIZE` = 0;
public const val `PM_TILE_SIZE_SQUARE310X310`: `PM_TILE_SIZE` = 3;
public const val `PM_TILE_SIZE_TALL150X310`: `PM_TILE_SIZE` = 4;
// UNSUPPORTED Rust 1903:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PM_UPDATEINFO {
//     pub ProductID: windows_sys::core::GUID,
//     pub PackagePath: windows_sys::core::BSTR,
//     pub InstanceID: windows_sys::core::GUID,
//     pub pbLicense: *mut u8,
//     pub cbLicense: u32,
//     pub MarketplaceAppVersion: windows_sys::core::BSTR,
//     pub DeploymentOptions: u32,
// }

// UNSUPPORTED Rust 1914:1: declaration Impl has no candidate rule
// impl Default for PM_UPDATEINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1919:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PM_UPDATEINFO_LEGACY {
//     pub ProductID: windows_sys::core::GUID,
//     pub PackagePath: windows_sys::core::BSTR,
//     pub InstanceID: windows_sys::core::GUID,
//     pub pbLicense: *mut u8,
//     pub cbLicense: u32,
//     pub MarketplaceAppVersion: windows_sys::core::BSTR,
// }

// UNSUPPORTED Rust 1929:1: declaration Impl has no candidate rule
// impl Default for PM_UPDATEINFO_LEGACY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1934:1: generic scalar type unsupported
// pub type PPATCH_PROGRESS_CALLBACK = Option<unsafe extern "system" fn(callbackcontext: *mut core::ffi::c_void, currentposition: u32, maximumposition: u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 1935:1: generic scalar type unsupported
// pub type PPATCH_SYMLOAD_CALLBACK = Option<unsafe extern "system" fn(whichfile: u32, symbolfilename: windows_sys::core::PCSTR, symtype: u32, symbolfilechecksum: u32, symbolfiletimedate: u32, imagefilechecksum: u32, imagefiletimedate: u32, callbackcontext: *mut core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 1936:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PROTECTED_FILE_DATA {
//     pub FileName: [u16; 260],
//     pub FileNumber: u32,
// }

// UNSUPPORTED Rust 1942:1: declaration Impl has no candidate rule
// impl Default for PROTECTED_FILE_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `QUERYASMINFO_FLAGS` = UInt;
public const val `QUERYASMINFO_FLAG_VALIDATE`: `QUERYASMINFO_FLAGS` = 1u;
public typealias `REINSTALLMODE` = Int;
public const val `REINSTALLMODE_FILEEQUALVERSION`: `REINSTALLMODE` = 8;
public const val `REINSTALLMODE_FILEEXACT`: `REINSTALLMODE` = 16;
public const val `REINSTALLMODE_FILEMISSING`: `REINSTALLMODE` = 2;
public const val `REINSTALLMODE_FILEOLDERVERSION`: `REINSTALLMODE` = 4;
public const val `REINSTALLMODE_FILEREPLACE`: `REINSTALLMODE` = 64;
public const val `REINSTALLMODE_FILEVERIFY`: `REINSTALLMODE` = 32;
public const val `REINSTALLMODE_MACHINEDATA`: `REINSTALLMODE` = 128;
public const val `REINSTALLMODE_PACKAGE`: `REINSTALLMODE` = 1024;
public const val `REINSTALLMODE_REPAIR`: `REINSTALLMODE` = 1;
public const val `REINSTALLMODE_SHORTCUT`: `REINSTALLMODE` = 512;
public const val `REINSTALLMODE_USERDATA`: `REINSTALLMODE` = 256;
public typealias `RESULTTYPES` = Int;
public typealias `SCRIPTFLAGS` = Int;
public const val `SCRIPTFLAGS_CACHEINFO`: `SCRIPTFLAGS` = 1;
public const val `SCRIPTFLAGS_MACHINEASSIGN`: `SCRIPTFLAGS` = 8;
public const val `SCRIPTFLAGS_REGDATA`: `SCRIPTFLAGS` = 416;
public const val `SCRIPTFLAGS_REGDATA_APPINFO`: `SCRIPTFLAGS` = 384;
public const val `SCRIPTFLAGS_REGDATA_CLASSINFO`: `SCRIPTFLAGS` = 128;
public const val `SCRIPTFLAGS_REGDATA_CNFGINFO`: `SCRIPTFLAGS` = 32;
public const val `SCRIPTFLAGS_REGDATA_EXTENSIONINFO`: `SCRIPTFLAGS` = 256;
public const val `SCRIPTFLAGS_SHORTCUTS`: `SCRIPTFLAGS` = 4;
public const val `SCRIPTFLAGS_VALIDATE_TRANSFORMS_LIST`: `SCRIPTFLAGS` = 64;
public const val `SFC_DISABLE_ASK`: UInt = 1u;
public const val `SFC_DISABLE_NOPOPUPS`: UInt = 4u;
public const val `SFC_DISABLE_NORMAL`: UInt = 0u;
public const val `SFC_DISABLE_ONCE`: UInt = 2u;
public const val `SFC_DISABLE_SETUP`: UInt = 3u;
// UNSUPPORTED Rust 1977:1: non-scalar type Ptr unsupported
// pub const SFC_IDLE_TRIGGER: windows_sys::core::PCWSTR = windows_sys::core::w!("WFP_IDLE_TRIGGER");

public const val `SFC_QUOTA_DEFAULT`: UInt = 50u;
public const val `SFC_SCAN_ALWAYS`: UInt = 1u;
public const val `SFC_SCAN_IMMEDIATE`: UInt = 3u;
public const val `SFC_SCAN_NORMAL`: UInt = 0u;
public const val `SFC_SCAN_ONCE`: UInt = 2u;
public typealias `STATUSTYPES` = Int;
public const val `STREAM_FORMAT_COMPLIB_MANIFEST`: UInt = 1u;
public const val `STREAM_FORMAT_COMPLIB_MODULE`: UInt = 0u;
public const val `STREAM_FORMAT_WIN32_MANIFEST`: UInt = 4u;
public const val `STREAM_FORMAT_WIN32_MODULE`: UInt = 2u;
public const val `TILE_TEMPLATE_AGILESTORE`: `TILE_TEMPLATE_TYPE` = 2;
public const val `TILE_TEMPLATE_ALL`: `TILE_TEMPLATE_TYPE` = 100;
public const val `TILE_TEMPLATE_BADGE`: `TILE_TEMPLATE_TYPE` = 16;
public const val `TILE_TEMPLATE_BLOCK`: `TILE_TEMPLATE_TYPE` = 17;
public const val `TILE_TEMPLATE_BLOCKANDTEXT01`: `TILE_TEMPLATE_TYPE` = 33;
public const val `TILE_TEMPLATE_BLOCKANDTEXT02`: `TILE_TEMPLATE_TYPE` = 34;
public const val `TILE_TEMPLATE_CALENDAR`: `TILE_TEMPLATE_TYPE` = 4;
public const val `TILE_TEMPLATE_CONTACT`: `TILE_TEMPLATE_TYPE` = 11;
public const val `TILE_TEMPLATE_CYCLE`: `TILE_TEMPLATE_TYPE` = 14;
public const val `TILE_TEMPLATE_DEEPLINK`: `TILE_TEMPLATE_TYPE` = 13;
public const val `TILE_TEMPLATE_DEFAULT`: `TILE_TEMPLATE_TYPE` = 15;
public const val `TILE_TEMPLATE_FLIP`: `TILE_TEMPLATE_TYPE` = 5;
public const val `TILE_TEMPLATE_FOLDER`: `TILE_TEMPLATE_TYPE` = 59;
public const val `TILE_TEMPLATE_GAMES`: `TILE_TEMPLATE_TYPE` = 3;
public const val `TILE_TEMPLATE_GROUP`: `TILE_TEMPLATE_TYPE` = 12;
public const val `TILE_TEMPLATE_IMAGE`: `TILE_TEMPLATE_TYPE` = 29;
public const val `TILE_TEMPLATE_IMAGEANDTEXT01`: `TILE_TEMPLATE_TYPE` = 31;
public const val `TILE_TEMPLATE_IMAGEANDTEXT02`: `TILE_TEMPLATE_TYPE` = 32;
public const val `TILE_TEMPLATE_IMAGECOLLECTION`: `TILE_TEMPLATE_TYPE` = 30;
public const val `TILE_TEMPLATE_INVALID`: `TILE_TEMPLATE_TYPE` = 0;
public const val `TILE_TEMPLATE_METROCOUNT`: `TILE_TEMPLATE_TYPE` = 1;
public const val `TILE_TEMPLATE_METROCOUNTQUEUE`: `TILE_TEMPLATE_TYPE` = 56;
public const val `TILE_TEMPLATE_MUSICVIDEO`: `TILE_TEMPLATE_TYPE` = 7;
public const val `TILE_TEMPLATE_PEEKIMAGE01`: `TILE_TEMPLATE_TYPE` = 39;
public const val `TILE_TEMPLATE_PEEKIMAGE02`: `TILE_TEMPLATE_TYPE` = 40;
public const val `TILE_TEMPLATE_PEEKIMAGE03`: `TILE_TEMPLATE_TYPE` = 41;
public const val `TILE_TEMPLATE_PEEKIMAGE04`: `TILE_TEMPLATE_TYPE` = 42;
public const val `TILE_TEMPLATE_PEEKIMAGE05`: `TILE_TEMPLATE_TYPE` = 43;
public const val `TILE_TEMPLATE_PEEKIMAGE06`: `TILE_TEMPLATE_TYPE` = 44;
public const val `TILE_TEMPLATE_PEEKIMAGEANDTEXT01`: `TILE_TEMPLATE_TYPE` = 35;
public const val `TILE_TEMPLATE_PEEKIMAGEANDTEXT02`: `TILE_TEMPLATE_TYPE` = 36;
public const val `TILE_TEMPLATE_PEEKIMAGEANDTEXT03`: `TILE_TEMPLATE_TYPE` = 37;
public const val `TILE_TEMPLATE_PEEKIMAGEANDTEXT04`: `TILE_TEMPLATE_TYPE` = 38;
public const val `TILE_TEMPLATE_PEEKIMAGECOLLECTION01`: `TILE_TEMPLATE_TYPE` = 45;
public const val `TILE_TEMPLATE_PEEKIMAGECOLLECTION02`: `TILE_TEMPLATE_TYPE` = 46;
public const val `TILE_TEMPLATE_PEEKIMAGECOLLECTION03`: `TILE_TEMPLATE_TYPE` = 47;
public const val `TILE_TEMPLATE_PEEKIMAGECOLLECTION04`: `TILE_TEMPLATE_TYPE` = 48;
public const val `TILE_TEMPLATE_PEEKIMAGECOLLECTION05`: `TILE_TEMPLATE_TYPE` = 49;
public const val `TILE_TEMPLATE_PEEKIMAGECOLLECTION06`: `TILE_TEMPLATE_TYPE` = 50;
public const val `TILE_TEMPLATE_PEOPLE`: `TILE_TEMPLATE_TYPE` = 10;
public const val `TILE_TEMPLATE_SEARCH`: `TILE_TEMPLATE_TYPE` = 57;
public const val `TILE_TEMPLATE_SMALLIMAGEANDTEXT01`: `TILE_TEMPLATE_TYPE` = 51;
public const val `TILE_TEMPLATE_SMALLIMAGEANDTEXT02`: `TILE_TEMPLATE_TYPE` = 52;
public const val `TILE_TEMPLATE_SMALLIMAGEANDTEXT03`: `TILE_TEMPLATE_TYPE` = 53;
public const val `TILE_TEMPLATE_SMALLIMAGEANDTEXT04`: `TILE_TEMPLATE_TYPE` = 54;
public const val `TILE_TEMPLATE_SMALLIMAGEANDTEXT05`: `TILE_TEMPLATE_TYPE` = 55;
public const val `TILE_TEMPLATE_TEXT01`: `TILE_TEMPLATE_TYPE` = 18;
public const val `TILE_TEMPLATE_TEXT02`: `TILE_TEMPLATE_TYPE` = 19;
public const val `TILE_TEMPLATE_TEXT03`: `TILE_TEMPLATE_TYPE` = 20;
public const val `TILE_TEMPLATE_TEXT04`: `TILE_TEMPLATE_TYPE` = 21;
public const val `TILE_TEMPLATE_TEXT05`: `TILE_TEMPLATE_TYPE` = 22;
public const val `TILE_TEMPLATE_TEXT06`: `TILE_TEMPLATE_TYPE` = 23;
public const val `TILE_TEMPLATE_TEXT07`: `TILE_TEMPLATE_TYPE` = 24;
public const val `TILE_TEMPLATE_TEXT08`: `TILE_TEMPLATE_TYPE` = 25;
public const val `TILE_TEMPLATE_TEXT09`: `TILE_TEMPLATE_TYPE` = 26;
public const val `TILE_TEMPLATE_TEXT10`: `TILE_TEMPLATE_TYPE` = 27;
public const val `TILE_TEMPLATE_TEXT11`: `TILE_TEMPLATE_TYPE` = 28;
public const val `TILE_TEMPLATE_TILEFLYOUT01`: `TILE_TEMPLATE_TYPE` = 58;
public typealias `TILE_TEMPLATE_TYPE` = Int;
public const val `TXTLOG_BACKUP`: UInt = 128u;
public const val `TXTLOG_CMI`: UInt = 268435456u;
public const val `TXTLOG_COPYFILES`: UInt = 8u;
public const val `TXTLOG_DEPTH_DECR`: UInt = 262144u;
public const val `TXTLOG_DEPTH_INCR`: UInt = 131072u;
public const val `TXTLOG_DETAILS`: UInt = 5u;
public const val `TXTLOG_DEVINST`: UInt = 1u;
public const val `TXTLOG_DEVMGR`: UInt = 536870912u;
public const val `TXTLOG_DRIVER_STORE`: UInt = 67108864u;
public const val `TXTLOG_DRVSETUP`: UInt = 4194304u;
public const val `TXTLOG_ERROR`: UInt = 1u;
public const val `TXTLOG_FILEQ`: UInt = 4u;
public const val `TXTLOG_FLUSH_FILE`: UInt = 1048576u;
public const val `TXTLOG_INF`: UInt = 2u;
public const val `TXTLOG_INFDB`: UInt = 1024u;
public const val `TXTLOG_INSTALLER`: UInt = 1073741824u;
public const val `TXTLOG_NEWDEV`: UInt = 16777216u;
public const val `TXTLOG_POLICY`: UInt = 8388608u;
public const val `TXTLOG_RESERVED_FLAGS`: UInt = 65520u;
public const val `TXTLOG_SETUP`: UInt = 134217728u;
public const val `TXTLOG_SETUPAPI_BITS`: UInt = 3u;
public const val `TXTLOG_SETUPAPI_CMDLINE`: UInt = 2u;
public const val `TXTLOG_SETUPAPI_DEVLOG`: UInt = 1u;
public const val `TXTLOG_SIGVERIF`: UInt = 32u;
public const val `TXTLOG_SUMMARY`: UInt = 4u;
public const val `TXTLOG_SYSTEM_STATE_CHANGE`: UInt = 3u;
public const val `TXTLOG_TAB_1`: UInt = 524288u;
public const val `TXTLOG_TIMESTAMP`: UInt = 65536u;
public const val `TXTLOG_UI`: UInt = 256u;
public const val `TXTLOG_UMPNPMGR`: UInt = 33554432u;
public const val `TXTLOG_UTIL`: UInt = 512u;
public const val `TXTLOG_VENDOR`: UInt = 2147483648u;
public const val `TXTLOG_VERBOSE`: UInt = 6u;
public const val `TXTLOG_VERY_VERBOSE`: UInt = 7u;
public const val `TXTLOG_WARNING`: UInt = 2u;
public const val `UIALL`: UInt = 32768u;
public const val `UILOGBITS`: UInt = 15u;
public const val `UINONE`: UInt = 0u;
public typealias `USERINFOSTATE` = Int;
public const val `USERINFOSTATE_ABSENT`: `USERINFOSTATE` = 0;
public const val `USERINFOSTATE_INVALIDARG`: `USERINFOSTATE` = -2;
public const val `USERINFOSTATE_MOREDATA`: `USERINFOSTATE` = -3;
public const val `USERINFOSTATE_PRESENT`: `USERINFOSTATE` = 1;
public const val `USERINFOSTATE_UNKNOWN`: `USERINFOSTATE` = -1;
public const val `WARN_BAD_MAJOR_VERSION`: UInt = 3222294792u;
public const val `WARN_BASE`: UInt = 3222294785u;
public const val `WARN_EQUAL_FILE_VERSION`: UInt = 3222294794u;
public const val `WARN_FILE_VERSION_DOWNREV`: UInt = 3222294793u;
public const val `WARN_IMPROPER_TRANSFORM_VALIDATION`: UInt = 3222294788u;
public const val `WARN_INVALID_TRANSFORM_VALIDATION`: UInt = 3222294791u;
public const val `WARN_MAJOR_UPGRADE_PATCH`: UInt = 3222294785u;
public const val `WARN_OBSOLETION_WITH_MSI30`: UInt = 3222294801u;
public const val `WARN_OBSOLETION_WITH_PATCHSEQUENCE`: UInt = 3222294803u;
public const val `WARN_OBSOLETION_WITH_SEQUENCE_DATA`: UInt = 3222294802u;
public const val `WARN_PATCHPROPERTYNOTSET`: UInt = 3222294795u;
public const val `WARN_PCW_MISMATCHED_PRODUCT_CODES`: UInt = 3222294789u;
public const val `WARN_PCW_MISMATCHED_PRODUCT_VERSIONS`: UInt = 3222294790u;
public const val `WARN_SEQUENCE_DATA_GENERATION_DISABLED`: UInt = 3222294786u;
public const val `WARN_SEQUENCE_DATA_SUPERSEDENCE_IGNORED`: UInt = 3222294787u;
public const val `_WIN32_MSI`: UInt = 500u;
public const val `_WIN32_MSM`: UInt = 100u;
public const val `cchMaxInteger`: Int = 12;
public const val `ieError`: `RESULTTYPES` = 1;
public const val `ieInfo`: `RESULTTYPES` = 3;
public const val `ieStatusCancel`: `STATUSTYPES` = 10;
public const val `ieStatusCreateEngine`: `STATUSTYPES` = 4;
public const val `ieStatusFail`: `STATUSTYPES` = 9;
public const val `ieStatusGetCUB`: `STATUSTYPES` = 0;
public const val `ieStatusICECount`: `STATUSTYPES` = 1;
public const val `ieStatusMerge`: `STATUSTYPES` = 2;
public const val `ieStatusRunICE`: `STATUSTYPES` = 6;
public const val `ieStatusShutdown`: `STATUSTYPES` = 7;
public const val `ieStatusStarting`: `STATUSTYPES` = 5;
public const val `ieStatusSuccess`: `STATUSTYPES` = 8;
public const val `ieStatusSummaryInfo`: `STATUSTYPES` = 3;
public const val `ieUnknown`: `RESULTTYPES` = 0;
public const val `ieWarning`: `RESULTTYPES` = 2;
public typealias `msidbAssemblyAttributes` = Int;
public const val `msidbAssemblyAttributesURT`: `msidbAssemblyAttributes` = 0;
public const val `msidbAssemblyAttributesWin32`: `msidbAssemblyAttributes` = 1;
public typealias `msidbClassAttributes` = Int;
public const val `msidbClassAttributesRelativePath`: `msidbClassAttributes` = 1;
public typealias `msidbComponentAttributes` = Int;
public const val `msidbComponentAttributes64bit`: `msidbComponentAttributes` = 256;
public const val `msidbComponentAttributesDisableRegistryReflection`: `msidbComponentAttributes` = 512;
public const val `msidbComponentAttributesLocalOnly`: `msidbComponentAttributes` = 0;
public const val `msidbComponentAttributesNeverOverwrite`: `msidbComponentAttributes` = 128;
public const val `msidbComponentAttributesODBCDataSource`: `msidbComponentAttributes` = 32;
public const val `msidbComponentAttributesOptional`: `msidbComponentAttributes` = 2;
public const val `msidbComponentAttributesPermanent`: `msidbComponentAttributes` = 16;
public const val `msidbComponentAttributesRegistryKeyPath`: `msidbComponentAttributes` = 4;
public const val `msidbComponentAttributesShared`: `msidbComponentAttributes` = 2048;
public const val `msidbComponentAttributesSharedDllRefCount`: `msidbComponentAttributes` = 8;
public const val `msidbComponentAttributesSourceOnly`: `msidbComponentAttributes` = 1;
public const val `msidbComponentAttributesTransitive`: `msidbComponentAttributes` = 64;
public const val `msidbComponentAttributesUninstallOnSupersedence`: `msidbComponentAttributes` = 1024;
public typealias `msidbControlAttributes` = Int;
public const val `msidbControlAttributesBiDi`: `msidbControlAttributes` = 224;
public const val `msidbControlAttributesBitmap`: `msidbControlAttributes` = 262144;
public const val `msidbControlAttributesCDROMVolume`: `msidbControlAttributes` = 524288;
public const val `msidbControlAttributesComboList`: `msidbControlAttributes` = 131072;
public const val `msidbControlAttributesElevationShield`: `msidbControlAttributes` = 8388608;
public const val `msidbControlAttributesEnabled`: `msidbControlAttributes` = 2;
public const val `msidbControlAttributesFixedSize`: `msidbControlAttributes` = 1048576;
public const val `msidbControlAttributesFixedVolume`: `msidbControlAttributes` = 131072;
public const val `msidbControlAttributesFloppyVolume`: `msidbControlAttributes` = 2097152;
public const val `msidbControlAttributesFormatSize`: `msidbControlAttributes` = 524288;
public const val `msidbControlAttributesHasBorder`: `msidbControlAttributes` = 16777216;
public const val `msidbControlAttributesIcon`: `msidbControlAttributes` = 524288;
public const val `msidbControlAttributesIconSize16`: `msidbControlAttributes` = 2097152;
public const val `msidbControlAttributesIconSize32`: `msidbControlAttributes` = 4194304;
public const val `msidbControlAttributesIconSize48`: `msidbControlAttributes` = 6291456;
public const val `msidbControlAttributesImageHandle`: `msidbControlAttributes` = 65536;
public const val `msidbControlAttributesIndirect`: `msidbControlAttributes` = 8;
public const val `msidbControlAttributesInteger`: `msidbControlAttributes` = 16;
public const val `msidbControlAttributesLeftScroll`: `msidbControlAttributes` = 128;
public const val `msidbControlAttributesMultiline`: `msidbControlAttributes` = 65536;
public const val `msidbControlAttributesNoPrefix`: `msidbControlAttributes` = 131072;
public const val `msidbControlAttributesNoWrap`: `msidbControlAttributes` = 262144;
public const val `msidbControlAttributesPasswordInput`: `msidbControlAttributes` = 2097152;
public const val `msidbControlAttributesProgress95`: `msidbControlAttributes` = 65536;
public const val `msidbControlAttributesPushLike`: `msidbControlAttributes` = 131072;
public const val `msidbControlAttributesRAMDiskVolume`: `msidbControlAttributes` = 1048576;
public const val `msidbControlAttributesRTLRO`: `msidbControlAttributes` = 32;
public const val `msidbControlAttributesRemoteVolume`: `msidbControlAttributes` = 262144;
public const val `msidbControlAttributesRemovableVolume`: `msidbControlAttributes` = 65536;
public const val `msidbControlAttributesRightAligned`: `msidbControlAttributes` = 64;
public const val `msidbControlAttributesSorted`: `msidbControlAttributes` = 65536;
public const val `msidbControlAttributesSunken`: `msidbControlAttributes` = 4;
public const val `msidbControlAttributesTransparent`: `msidbControlAttributes` = 65536;
public const val `msidbControlAttributesUsersLanguage`: `msidbControlAttributes` = 1048576;
public const val `msidbControlAttributesVisible`: `msidbControlAttributes` = 1;
public const val `msidbControlShowRollbackCost`: `msidbControlAttributes` = 4194304;
public typealias `msidbCustomActionType` = Int;
public const val `msidbCustomActionType64BitScript`: `msidbCustomActionType` = 4096;
public const val `msidbCustomActionTypeAsync`: `msidbCustomActionType` = 128;
public const val `msidbCustomActionTypeBinaryData`: `msidbCustomActionType` = 0;
public const val `msidbCustomActionTypeClientRepeat`: `msidbCustomActionType` = 768;
public const val `msidbCustomActionTypeCommit`: `msidbCustomActionType` = 512;
public const val `msidbCustomActionTypeContinue`: `msidbCustomActionType` = 64;
public const val `msidbCustomActionTypeDirectory`: `msidbCustomActionType` = 32;
public const val `msidbCustomActionTypeDll`: `msidbCustomActionType` = 1;
public const val `msidbCustomActionTypeExe`: `msidbCustomActionType` = 2;
public const val `msidbCustomActionTypeFirstSequence`: `msidbCustomActionType` = 256;
public const val `msidbCustomActionTypeHideTarget`: `msidbCustomActionType` = 8192;
public const val `msidbCustomActionTypeInScript`: `msidbCustomActionType` = 1024;
public const val `msidbCustomActionTypeInstall`: `msidbCustomActionType` = 7;
public const val `msidbCustomActionTypeJScript`: `msidbCustomActionType` = 5;
public const val `msidbCustomActionTypeNoImpersonate`: `msidbCustomActionType` = 2048;
public const val `msidbCustomActionTypeOncePerProcess`: `msidbCustomActionType` = 512;
public const val `msidbCustomActionTypePatchUninstall`: `msidbCustomActionType` = 32768;
public const val `msidbCustomActionTypeProperty`: `msidbCustomActionType` = 48;
public const val `msidbCustomActionTypeRollback`: `msidbCustomActionType` = 256;
public const val `msidbCustomActionTypeSourceFile`: `msidbCustomActionType` = 16;
public const val `msidbCustomActionTypeTSAware`: `msidbCustomActionType` = 16384;
public const val `msidbCustomActionTypeTextData`: `msidbCustomActionType` = 3;
public const val `msidbCustomActionTypeVBScript`: `msidbCustomActionType` = 6;
public typealias `msidbDialogAttributes` = Int;
public const val `msidbDialogAttributesBiDi`: `msidbDialogAttributes` = 896;
public const val `msidbDialogAttributesError`: `msidbDialogAttributes` = 65536;
public const val `msidbDialogAttributesKeepModeless`: `msidbDialogAttributes` = 16;
public const val `msidbDialogAttributesLeftScroll`: `msidbDialogAttributes` = 512;
public const val `msidbDialogAttributesMinimize`: `msidbDialogAttributes` = 4;
public const val `msidbDialogAttributesModal`: `msidbDialogAttributes` = 2;
public const val `msidbDialogAttributesRTLRO`: `msidbDialogAttributes` = 128;
public const val `msidbDialogAttributesRightAligned`: `msidbDialogAttributes` = 256;
public const val `msidbDialogAttributesSysModal`: `msidbDialogAttributes` = 8;
public const val `msidbDialogAttributesTrackDiskSpace`: `msidbDialogAttributes` = 32;
public const val `msidbDialogAttributesUseCustomPalette`: `msidbDialogAttributes` = 64;
public const val `msidbDialogAttributesVisible`: `msidbDialogAttributes` = 1;
public const val `msidbEmbeddedHandlesBasic`: `msidbEmbeddedUIAttributes` = 2;
public const val `msidbEmbeddedUI`: `msidbEmbeddedUIAttributes` = 1;
public typealias `msidbEmbeddedUIAttributes` = Int;
public typealias `msidbFeatureAttributes` = Int;
public const val `msidbFeatureAttributesDisallowAdvertise`: `msidbFeatureAttributes` = 8;
public const val `msidbFeatureAttributesFavorAdvertise`: `msidbFeatureAttributes` = 4;
public const val `msidbFeatureAttributesFavorLocal`: `msidbFeatureAttributes` = 0;
public const val `msidbFeatureAttributesFavorSource`: `msidbFeatureAttributes` = 1;
public const val `msidbFeatureAttributesFollowParent`: `msidbFeatureAttributes` = 2;
public const val `msidbFeatureAttributesNoUnsupportedAdvertise`: `msidbFeatureAttributes` = 32;
public const val `msidbFeatureAttributesUIDisallowAbsent`: `msidbFeatureAttributes` = 16;
public typealias `msidbFileAttributes` = Int;
public const val `msidbFileAttributesChecksum`: `msidbFileAttributes` = 1024;
public const val `msidbFileAttributesCompressed`: `msidbFileAttributes` = 16384;
public const val `msidbFileAttributesHidden`: `msidbFileAttributes` = 2;
public const val `msidbFileAttributesIsolatedComp`: `msidbFileAttributes` = 16;
public const val `msidbFileAttributesNoncompressed`: `msidbFileAttributes` = 8192;
public const val `msidbFileAttributesPatchAdded`: `msidbFileAttributes` = 4096;
public const val `msidbFileAttributesReadOnly`: `msidbFileAttributes` = 1;
public const val `msidbFileAttributesReserved0`: `msidbFileAttributes` = 8;
public const val `msidbFileAttributesReserved1`: `msidbFileAttributes` = 64;
public const val `msidbFileAttributesReserved2`: `msidbFileAttributes` = 128;
public const val `msidbFileAttributesReserved3`: `msidbFileAttributes` = 256;
public const val `msidbFileAttributesReserved4`: `msidbFileAttributes` = 32768;
public const val `msidbFileAttributesSystem`: `msidbFileAttributes` = 4;
public const val `msidbFileAttributesVital`: `msidbFileAttributes` = 512;
public typealias `msidbIniFileAction` = Int;
public const val `msidbIniFileActionAddLine`: `msidbIniFileAction` = 0;
public const val `msidbIniFileActionAddTag`: `msidbIniFileAction` = 3;
public const val `msidbIniFileActionCreateLine`: `msidbIniFileAction` = 1;
public const val `msidbIniFileActionRemoveLine`: `msidbIniFileAction` = 2;
public const val `msidbIniFileActionRemoveTag`: `msidbIniFileAction` = 4;
public typealias `msidbLocatorType` = Int;
public const val `msidbLocatorType64bit`: `msidbLocatorType` = 16;
public const val `msidbLocatorTypeDirectory`: `msidbLocatorType` = 0;
public const val `msidbLocatorTypeFileName`: `msidbLocatorType` = 1;
public const val `msidbLocatorTypeRawValue`: `msidbLocatorType` = 2;
public typealias `msidbMoveFileOptions` = Int;
public const val `msidbMoveFileOptionsMove`: `msidbMoveFileOptions` = 1;
public typealias `msidbODBCDataSourceRegistration` = Int;
public const val `msidbODBCDataSourceRegistrationPerMachine`: `msidbODBCDataSourceRegistration` = 0;
public const val `msidbODBCDataSourceRegistrationPerUser`: `msidbODBCDataSourceRegistration` = 1;
public typealias `msidbPatchAttributes` = Int;
public const val `msidbPatchAttributesNonVital`: `msidbPatchAttributes` = 1;
public typealias `msidbRegistryRoot` = Int;
public const val `msidbRegistryRootClassesRoot`: `msidbRegistryRoot` = 0;
public const val `msidbRegistryRootCurrentUser`: `msidbRegistryRoot` = 1;
public const val `msidbRegistryRootLocalMachine`: `msidbRegistryRoot` = 2;
public const val `msidbRegistryRootUsers`: `msidbRegistryRoot` = 3;
public typealias `msidbRemoveFileInstallMode` = Int;
public const val `msidbRemoveFileInstallModeOnBoth`: `msidbRemoveFileInstallMode` = 3;
public const val `msidbRemoveFileInstallModeOnInstall`: `msidbRemoveFileInstallMode` = 1;
public const val `msidbRemoveFileInstallModeOnRemove`: `msidbRemoveFileInstallMode` = 2;
public typealias `msidbServiceConfigEvent` = Int;
public const val `msidbServiceConfigEventInstall`: `msidbServiceConfigEvent` = 1;
public const val `msidbServiceConfigEventReinstall`: `msidbServiceConfigEvent` = 4;
public const val `msidbServiceConfigEventUninstall`: `msidbServiceConfigEvent` = 2;
public typealias `msidbServiceControlEvent` = Int;
public const val `msidbServiceControlEventDelete`: `msidbServiceControlEvent` = 8;
public const val `msidbServiceControlEventStart`: `msidbServiceControlEvent` = 1;
public const val `msidbServiceControlEventStop`: `msidbServiceControlEvent` = 2;
public const val `msidbServiceControlEventUninstallDelete`: `msidbServiceControlEvent` = 128;
public const val `msidbServiceControlEventUninstallStart`: `msidbServiceControlEvent` = 16;
public const val `msidbServiceControlEventUninstallStop`: `msidbServiceControlEvent` = 32;
public typealias `msidbServiceInstallErrorControl` = Int;
public const val `msidbServiceInstallErrorControlVital`: `msidbServiceInstallErrorControl` = 32768;
public typealias `msidbSumInfoSourceType` = Int;
public const val `msidbSumInfoSourceTypeAdminImage`: `msidbSumInfoSourceType` = 4;
public const val `msidbSumInfoSourceTypeCompressed`: `msidbSumInfoSourceType` = 2;
public const val `msidbSumInfoSourceTypeLUAPackage`: `msidbSumInfoSourceType` = 8;
public const val `msidbSumInfoSourceTypeSFN`: `msidbSumInfoSourceType` = 1;
public typealias `msidbTextStyleStyleBits` = Int;
public const val `msidbTextStyleStyleBitsBold`: `msidbTextStyleStyleBits` = 1;
public const val `msidbTextStyleStyleBitsItalic`: `msidbTextStyleStyleBits` = 2;
public const val `msidbTextStyleStyleBitsStrike`: `msidbTextStyleStyleBits` = 8;
public const val `msidbTextStyleStyleBitsUnderline`: `msidbTextStyleStyleBits` = 4;
public typealias `msidbUpgradeAttributes` = Int;
public const val `msidbUpgradeAttributesIgnoreRemoveFailure`: `msidbUpgradeAttributes` = 4;
public const val `msidbUpgradeAttributesLanguagesExclusive`: `msidbUpgradeAttributes` = 1024;
public const val `msidbUpgradeAttributesMigrateFeatures`: `msidbUpgradeAttributes` = 1;
public const val `msidbUpgradeAttributesOnlyDetect`: `msidbUpgradeAttributes` = 2;
public const val `msidbUpgradeAttributesVersionMaxInclusive`: `msidbUpgradeAttributes` = 512;
public const val `msidbUpgradeAttributesVersionMinInclusive`: `msidbUpgradeAttributes` = 256;
public typealias `msifiFastInstallBits` = Int;
public const val `msifiFastInstallLessPrgMsg`: `msifiFastInstallBits` = 4;
public const val `msifiFastInstallNoSR`: `msifiFastInstallBits` = 1;
public const val `msifiFastInstallQuickCosting`: `msifiFastInstallBits` = 2;
public const val `msirbRebootCustomActionReason`: `msirbRebootReason` = 4;
public const val `msirbRebootDeferred`: `msirbRebootType` = 2;
public const val `msirbRebootForceRebootReason`: `msirbRebootReason` = 3;
public const val `msirbRebootImmediate`: `msirbRebootType` = 1;
public const val `msirbRebootInUseFilesReason`: `msirbRebootReason` = 1;
public typealias `msirbRebootReason` = Int;
public const val `msirbRebootScheduleRebootReason`: `msirbRebootReason` = 2;
public typealias `msirbRebootType` = Int;
public const val `msirbRebootUndeterminedReason`: `msirbRebootReason` = 0;
public const val `msmErrorDirCreate`: `msmErrorType` = 7;
public const val `msmErrorExclusion`: `msmErrorType` = 3;
public const val `msmErrorFeatureRequired`: `msmErrorType` = 8;
public const val `msmErrorFileCreate`: `msmErrorType` = 6;
public const val `msmErrorLanguageFailed`: `msmErrorType` = 2;
public const val `msmErrorLanguageUnsupported`: `msmErrorType` = 1;
public const val `msmErrorResequenceMerge`: `msmErrorType` = 5;
public const val `msmErrorTableMerge`: `msmErrorType` = 4;
public typealias `msmErrorType` = Int;
