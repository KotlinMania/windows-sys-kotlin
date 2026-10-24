// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn AppCacheCheckManifest(pwszmasterurl : windows_sys::core::PCWSTR, pwszmanifesturl : windows_sys::core::PCWSTR, pbmanifestdata : *const u8, dwmanifestdatasize : u32, pbmanifestresponseheaders : *const u8, dwmanifestresponseheaderssize : u32, pestate : *mut APP_CACHE_STATE, phnewappcache : *mut *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn AppCacheCloseHandle(happcache : *const core::ffi::c_void));

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn AppCacheCreateAndCommitFile(happcache : *const core::ffi::c_void, pwszsourcefilepath : windows_sys::core::PCWSTR, pwszurl : windows_sys::core::PCWSTR, pbresponseheaders : *const u8, dwresponseheaderssize : u32) -> u32);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn AppCacheDeleteGroup(pwszmanifesturl : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn AppCacheDeleteIEGroup(pwszmanifesturl : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn AppCacheDuplicateHandle(happcache : *const core::ffi::c_void, phduplicatedappcache : *mut *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn AppCacheFinalize(happcache : *const core::ffi::c_void, pbmanifestdata : *const u8, dwmanifestdatasize : u32, pestate : *mut APP_CACHE_FINALIZE_STATE) -> u32);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn AppCacheFreeDownloadList(pdownloadlist : *mut APP_CACHE_DOWNLOAD_LIST));

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn AppCacheFreeGroupList(pappcachegrouplist : *mut APP_CACHE_GROUP_LIST));

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn AppCacheFreeIESpace(ftcutoff : super::super::Foundation:: FILETIME) -> u32);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn AppCacheFreeSpace(ftcutoff : super::super::Foundation:: FILETIME) -> u32);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn AppCacheGetDownloadList(happcache : *const core::ffi::c_void, pdownloadlist : *mut APP_CACHE_DOWNLOAD_LIST) -> u32);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn AppCacheGetFallbackUrl(happcache : *const core::ffi::c_void, pwszurl : windows_sys::core::PCWSTR, ppwszfallbackurl : *mut windows_sys::core::PWSTR) -> u32);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn AppCacheGetGroupList(pappcachegrouplist : *mut APP_CACHE_GROUP_LIST) -> u32);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn AppCacheGetIEGroupList(pappcachegrouplist : *mut APP_CACHE_GROUP_LIST) -> u32);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn AppCacheGetInfo(happcache : *const core::ffi::c_void, pappcacheinfo : *mut APP_CACHE_GROUP_INFO) -> u32);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn AppCacheGetManifestUrl(happcache : *const core::ffi::c_void, ppwszmanifesturl : *mut windows_sys::core::PWSTR) -> u32);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn AppCacheLookup(pwszurl : windows_sys::core::PCWSTR, dwflags : u32, phappcache : *mut *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn CommitUrlCacheEntryA(lpszurlname : windows_sys::core::PCSTR, lpszlocalfilename : windows_sys::core::PCSTR, expiretime : super::super::Foundation:: FILETIME, lastmodifiedtime : super::super::Foundation:: FILETIME, cacheentrytype : u32, lpheaderinfo : *const u8, cchheaderinfo : u32, lpszfileextension : windows_sys::core::PCSTR, lpszoriginalurl : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn CommitUrlCacheEntryBinaryBlob(pwszurlname : windows_sys::core::PCWSTR, dwtype : u32, ftexpiretime : super::super::Foundation:: FILETIME, ftmodifiedtime : super::super::Foundation:: FILETIME, pbblob : *const u8, cbblob : u32) -> u32);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn CommitUrlCacheEntryW(lpszurlname : windows_sys::core::PCWSTR, lpszlocalfilename : windows_sys::core::PCWSTR, expiretime : super::super::Foundation:: FILETIME, lastmodifiedtime : super::super::Foundation:: FILETIME, cacheentrytype : u32, lpszheaderinfo : windows_sys::core::PCWSTR, cchheaderinfo : u32, lpszfileextension : windows_sys::core::PCWSTR, lpszoriginalurl : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn CreateMD5SSOHash(pszchallengeinfo : windows_sys::core::PCWSTR, pwszrealm : windows_sys::core::PCWSTR, pwsztarget : windows_sys::core::PCWSTR, pbhexhash : *mut u8) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn CreateUrlCacheContainerA(name : windows_sys::core::PCSTR, lpcacheprefix : windows_sys::core::PCSTR, lpszcachepath : windows_sys::core::PCSTR, kbcachelimit : u32, dwcontainertype : u32, dwoptions : u32, pvbuffer : *const core::ffi::c_void, cbbuffer : *const u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn CreateUrlCacheContainerW(name : windows_sys::core::PCWSTR, lpcacheprefix : windows_sys::core::PCWSTR, lpszcachepath : windows_sys::core::PCWSTR, kbcachelimit : u32, dwcontainertype : u32, dwoptions : u32, pvbuffer : *const core::ffi::c_void, cbbuffer : *const u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn CreateUrlCacheEntryA(lpszurlname : windows_sys::core::PCSTR, dwexpectedfilesize : u32, lpszfileextension : windows_sys::core::PCSTR, lpszfilename : windows_sys::core::PSTR, dwreserved : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn CreateUrlCacheEntryExW(lpszurlname : windows_sys::core::PCWSTR, dwexpectedfilesize : u32, lpszfileextension : windows_sys::core::PCWSTR, lpszfilename : windows_sys::core::PWSTR, dwreserved : u32, fpreserveincomingfilename : windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn CreateUrlCacheEntryW(lpszurlname : windows_sys::core::PCWSTR, dwexpectedfilesize : u32, lpszfileextension : windows_sys::core::PCWSTR, lpszfilename : windows_sys::core::PWSTR, dwreserved : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn CreateUrlCacheGroup(dwflags : u32, lpreserved : *const core::ffi::c_void) -> i64);

// UNSUPPORTED Rust 29:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn DeleteIE3Cache(hwnd : super::super::Foundation:: HWND, hinst : super::super::Foundation:: HINSTANCE, lpszcmd : windows_sys::core::PCSTR, ncmdshow : i32) -> u32);

// UNSUPPORTED Rust 30:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn DeleteUrlCacheContainerA(name : windows_sys::core::PCSTR, dwoptions : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 31:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn DeleteUrlCacheContainerW(name : windows_sys::core::PCWSTR, dwoptions : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 32:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn DeleteUrlCacheEntry(lpszurlname : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 33:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn DeleteUrlCacheEntryA(lpszurlname : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 34:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn DeleteUrlCacheEntryW(lpszurlname : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 35:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn DeleteUrlCacheGroup(groupid : i64, dwflags : u32, lpreserved : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 36:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn DeleteWpadCacheForNetworks(param0 : WPAD_CACHE_DELETE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 37:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn DetectAutoProxyUrl(pszautoproxyurl : windows_sys::core::PSTR, cchautoproxyurl : u32, dwdetectflags : PROXY_AUTO_DETECT_TYPE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 38:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn DoConnectoidsExist() -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 39:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn ExportCookieFileA(szfilename : windows_sys::core::PCSTR, fappend : windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 40:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn ExportCookieFileW(szfilename : windows_sys::core::PCWSTR, fappend : windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 41:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn FindCloseUrlCache(henumhandle : super::super::Foundation:: HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 42:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn FindFirstUrlCacheContainerA(pdwmodified : *mut u32, lpcontainerinfo : *mut INTERNET_CACHE_CONTAINER_INFOA, lpcbcontainerinfo : *mut u32, dwoptions : u32) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 43:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn FindFirstUrlCacheContainerW(pdwmodified : *mut u32, lpcontainerinfo : *mut INTERNET_CACHE_CONTAINER_INFOW, lpcbcontainerinfo : *mut u32, dwoptions : u32) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 44:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn FindFirstUrlCacheEntryA(lpszurlsearchpattern : windows_sys::core::PCSTR, lpfirstcacheentryinfo : *mut INTERNET_CACHE_ENTRY_INFOA, lpcbcacheentryinfo : *mut u32) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 45:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn FindFirstUrlCacheEntryExA(lpszurlsearchpattern : windows_sys::core::PCSTR, dwflags : u32, dwfilter : u32, groupid : i64, lpfirstcacheentryinfo : *mut INTERNET_CACHE_ENTRY_INFOA, lpcbcacheentryinfo : *mut u32, lpgroupattributes : *const core::ffi::c_void, lpcbgroupattributes : *const u32, lpreserved : *const core::ffi::c_void) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 46:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn FindFirstUrlCacheEntryExW(lpszurlsearchpattern : windows_sys::core::PCWSTR, dwflags : u32, dwfilter : u32, groupid : i64, lpfirstcacheentryinfo : *mut INTERNET_CACHE_ENTRY_INFOW, lpcbcacheentryinfo : *mut u32, lpgroupattributes : *const core::ffi::c_void, lpcbgroupattributes : *const u32, lpreserved : *const core::ffi::c_void) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 47:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn FindFirstUrlCacheEntryW(lpszurlsearchpattern : windows_sys::core::PCWSTR, lpfirstcacheentryinfo : *mut INTERNET_CACHE_ENTRY_INFOW, lpcbcacheentryinfo : *mut u32) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 48:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn FindFirstUrlCacheGroup(dwflags : u32, dwfilter : u32, lpsearchcondition : *const core::ffi::c_void, dwsearchcondition : u32, lpgroupid : *mut i64, lpreserved : *const core::ffi::c_void) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 49:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn FindNextUrlCacheContainerA(henumhandle : super::super::Foundation:: HANDLE, lpcontainerinfo : *mut INTERNET_CACHE_CONTAINER_INFOA, lpcbcontainerinfo : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 50:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn FindNextUrlCacheContainerW(henumhandle : super::super::Foundation:: HANDLE, lpcontainerinfo : *mut INTERNET_CACHE_CONTAINER_INFOW, lpcbcontainerinfo : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 51:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn FindNextUrlCacheEntryA(henumhandle : super::super::Foundation:: HANDLE, lpnextcacheentryinfo : *mut INTERNET_CACHE_ENTRY_INFOA, lpcbcacheentryinfo : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 52:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn FindNextUrlCacheEntryExA(henumhandle : super::super::Foundation:: HANDLE, lpnextcacheentryinfo : *mut INTERNET_CACHE_ENTRY_INFOA, lpcbcacheentryinfo : *mut u32, lpgroupattributes : *const core::ffi::c_void, lpcbgroupattributes : *const u32, lpreserved : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 53:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn FindNextUrlCacheEntryExW(henumhandle : super::super::Foundation:: HANDLE, lpnextcacheentryinfo : *mut INTERNET_CACHE_ENTRY_INFOW, lpcbcacheentryinfo : *mut u32, lpgroupattributes : *const core::ffi::c_void, lpcbgroupattributes : *const u32, lpreserved : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 54:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn FindNextUrlCacheEntryW(henumhandle : super::super::Foundation:: HANDLE, lpnextcacheentryinfo : *mut INTERNET_CACHE_ENTRY_INFOW, lpcbcacheentryinfo : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 55:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn FindNextUrlCacheGroup(hfind : super::super::Foundation:: HANDLE, lpgroupid : *mut i64, lpreserved : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 56:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn FindP3PPolicySymbol(pszsymbol : windows_sys::core::PCSTR) -> i32);

// UNSUPPORTED Rust 57:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn FreeUrlCacheSpaceA(lpszcachepath : windows_sys::core::PCSTR, dwsize : u32, dwfilter : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 58:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn FreeUrlCacheSpaceW(lpszcachepath : windows_sys::core::PCWSTR, dwsize : u32, dwfilter : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 59:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn FtpCommandA(hconnect : *const core::ffi::c_void, fexpectresponse : windows_sys::core::BOOL, dwflags : FTP_FLAGS, lpszcommand : windows_sys::core::PCSTR, dwcontext : usize, phftpcommand : *mut *mut core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 60:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn FtpCommandW(hconnect : *const core::ffi::c_void, fexpectresponse : windows_sys::core::BOOL, dwflags : FTP_FLAGS, lpszcommand : windows_sys::core::PCWSTR, dwcontext : usize, phftpcommand : *mut *mut core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 61:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn FtpCreateDirectoryA(hconnect : *const core::ffi::c_void, lpszdirectory : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 62:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn FtpCreateDirectoryW(hconnect : *const core::ffi::c_void, lpszdirectory : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 63:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn FtpDeleteFileA(hconnect : *const core::ffi::c_void, lpszfilename : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 64:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn FtpDeleteFileW(hconnect : *const core::ffi::c_void, lpszfilename : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 65:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Storage_FileSystem")]
// windows_link::link!("wininet.dll" "system" fn FtpFindFirstFileA(hconnect : *const core::ffi::c_void, lpszsearchfile : windows_sys::core::PCSTR, lpfindfiledata : *mut super::super::Storage::FileSystem:: WIN32_FIND_DATAA, dwflags : u32, dwcontext : usize) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 67:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Storage_FileSystem")]
// windows_link::link!("wininet.dll" "system" fn FtpFindFirstFileW(hconnect : *const core::ffi::c_void, lpszsearchfile : windows_sys::core::PCWSTR, lpfindfiledata : *mut super::super::Storage::FileSystem:: WIN32_FIND_DATAW, dwflags : u32, dwcontext : usize) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 69:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn FtpGetCurrentDirectoryA(hconnect : *const core::ffi::c_void, lpszcurrentdirectory : windows_sys::core::PSTR, lpdwcurrentdirectory : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 70:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn FtpGetCurrentDirectoryW(hconnect : *const core::ffi::c_void, lpszcurrentdirectory : windows_sys::core::PWSTR, lpdwcurrentdirectory : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 71:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn FtpGetFileA(hconnect : *const core::ffi::c_void, lpszremotefile : windows_sys::core::PCSTR, lpsznewfile : windows_sys::core::PCSTR, ffailifexists : windows_sys::core::BOOL, dwflagsandattributes : u32, dwflags : u32, dwcontext : usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 72:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn FtpGetFileEx(hftpsession : *const core::ffi::c_void, lpszremotefile : windows_sys::core::PCSTR, lpsznewfile : windows_sys::core::PCWSTR, ffailifexists : windows_sys::core::BOOL, dwflagsandattributes : u32, dwflags : u32, dwcontext : usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 73:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn FtpGetFileSize(hfile : *const core::ffi::c_void, lpdwfilesizehigh : *mut u32) -> u32);

// UNSUPPORTED Rust 74:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn FtpGetFileW(hconnect : *const core::ffi::c_void, lpszremotefile : windows_sys::core::PCWSTR, lpsznewfile : windows_sys::core::PCWSTR, ffailifexists : windows_sys::core::BOOL, dwflagsandattributes : u32, dwflags : u32, dwcontext : usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 75:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn FtpOpenFileA(hconnect : *const core::ffi::c_void, lpszfilename : windows_sys::core::PCSTR, dwaccess : u32, dwflags : FTP_FLAGS, dwcontext : usize) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 76:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn FtpOpenFileW(hconnect : *const core::ffi::c_void, lpszfilename : windows_sys::core::PCWSTR, dwaccess : u32, dwflags : FTP_FLAGS, dwcontext : usize) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 77:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn FtpPutFileA(hconnect : *const core::ffi::c_void, lpszlocalfile : windows_sys::core::PCSTR, lpsznewremotefile : windows_sys::core::PCSTR, dwflags : FTP_FLAGS, dwcontext : usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 78:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn FtpPutFileEx(hftpsession : *const core::ffi::c_void, lpszlocalfile : windows_sys::core::PCWSTR, lpsznewremotefile : windows_sys::core::PCSTR, dwflags : u32, dwcontext : usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 79:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn FtpPutFileW(hconnect : *const core::ffi::c_void, lpszlocalfile : windows_sys::core::PCWSTR, lpsznewremotefile : windows_sys::core::PCWSTR, dwflags : FTP_FLAGS, dwcontext : usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 80:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn FtpRemoveDirectoryA(hconnect : *const core::ffi::c_void, lpszdirectory : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 81:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn FtpRemoveDirectoryW(hconnect : *const core::ffi::c_void, lpszdirectory : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 82:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn FtpRenameFileA(hconnect : *const core::ffi::c_void, lpszexisting : windows_sys::core::PCSTR, lpsznew : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 83:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn FtpRenameFileW(hconnect : *const core::ffi::c_void, lpszexisting : windows_sys::core::PCWSTR, lpsznew : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 84:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn FtpSetCurrentDirectoryA(hconnect : *const core::ffi::c_void, lpszdirectory : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 85:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn FtpSetCurrentDirectoryW(hconnect : *const core::ffi::c_void, lpszdirectory : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 86:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn GetDiskInfoA(pszpath : windows_sys::core::PCSTR, pdwclustersize : *mut u32, pdlavail : *mut u64, pdltotal : *mut u64) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 87:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn GetUrlCacheConfigInfoA(lpcacheconfiginfo : *mut INTERNET_CACHE_CONFIG_INFOA, lpcbcacheconfiginfo : *const u32, dwfieldcontrol : CACHE_CONFIG) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 88:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn GetUrlCacheConfigInfoW(lpcacheconfiginfo : *mut INTERNET_CACHE_CONFIG_INFOW, lpcbcacheconfiginfo : *const u32, dwfieldcontrol : CACHE_CONFIG) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 89:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn GetUrlCacheEntryBinaryBlob(pwszurlname : windows_sys::core::PCWSTR, dwtype : *mut u32, pftexpiretime : *mut super::super::Foundation:: FILETIME, pftaccesstime : *mut super::super::Foundation:: FILETIME, pftmodifiedtime : *mut super::super::Foundation:: FILETIME, ppbblob : *mut *mut u8, pcbblob : *mut u32) -> u32);

// UNSUPPORTED Rust 90:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn GetUrlCacheEntryInfoA(lpszurlname : windows_sys::core::PCSTR, lpcacheentryinfo : *mut INTERNET_CACHE_ENTRY_INFOA, lpcbcacheentryinfo : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 91:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn GetUrlCacheEntryInfoExA(lpszurl : windows_sys::core::PCSTR, lpcacheentryinfo : *mut INTERNET_CACHE_ENTRY_INFOA, lpcbcacheentryinfo : *mut u32, lpszredirecturl : windows_sys::core::PCSTR, lpcbredirecturl : *const u32, lpreserved : *const core::ffi::c_void, dwflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 92:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn GetUrlCacheEntryInfoExW(lpszurl : windows_sys::core::PCWSTR, lpcacheentryinfo : *mut INTERNET_CACHE_ENTRY_INFOW, lpcbcacheentryinfo : *mut u32, lpszredirecturl : windows_sys::core::PCWSTR, lpcbredirecturl : *const u32, lpreserved : *const core::ffi::c_void, dwflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 93:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn GetUrlCacheEntryInfoW(lpszurlname : windows_sys::core::PCWSTR, lpcacheentryinfo : *mut INTERNET_CACHE_ENTRY_INFOW, lpcbcacheentryinfo : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 94:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn GetUrlCacheGroupAttributeA(gid : i64, dwflags : u32, dwattributes : u32, lpgroupinfo : *mut INTERNET_CACHE_GROUP_INFOA, lpcbgroupinfo : *mut u32, lpreserved : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 95:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn GetUrlCacheGroupAttributeW(gid : i64, dwflags : u32, dwattributes : u32, lpgroupinfo : *mut INTERNET_CACHE_GROUP_INFOW, lpcbgroupinfo : *mut u32, lpreserved : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 96:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn GetUrlCacheHeaderData(nidx : u32, lpdwdata : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 97:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn GopherCreateLocatorA(lpszhost : windows_sys::core::PCSTR, nserverport : u16, lpszdisplaystring : windows_sys::core::PCSTR, lpszselectorstring : windows_sys::core::PCSTR, dwgophertype : u32, lpszlocator : windows_sys::core::PSTR, lpdwbufferlength : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 98:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn GopherCreateLocatorW(lpszhost : windows_sys::core::PCWSTR, nserverport : u16, lpszdisplaystring : windows_sys::core::PCWSTR, lpszselectorstring : windows_sys::core::PCWSTR, dwgophertype : u32, lpszlocator : windows_sys::core::PWSTR, lpdwbufferlength : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 99:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn GopherFindFirstFileA(hconnect : *const core::ffi::c_void, lpszlocator : windows_sys::core::PCSTR, lpszsearchstring : windows_sys::core::PCSTR, lpfinddata : *mut GOPHER_FIND_DATAA, dwflags : u32, dwcontext : usize) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 100:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn GopherFindFirstFileW(hconnect : *const core::ffi::c_void, lpszlocator : windows_sys::core::PCWSTR, lpszsearchstring : windows_sys::core::PCWSTR, lpfinddata : *mut GOPHER_FIND_DATAW, dwflags : u32, dwcontext : usize) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 101:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn GopherGetAttributeA(hconnect : *const core::ffi::c_void, lpszlocator : windows_sys::core::PCSTR, lpszattributename : windows_sys::core::PCSTR, lpbuffer : *mut u8, dwbufferlength : u32, lpdwcharactersreturned : *mut u32, lpfnenumerator : GOPHER_ATTRIBUTE_ENUMERATOR, dwcontext : usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 102:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn GopherGetAttributeW(hconnect : *const core::ffi::c_void, lpszlocator : windows_sys::core::PCWSTR, lpszattributename : windows_sys::core::PCWSTR, lpbuffer : *mut u8, dwbufferlength : u32, lpdwcharactersreturned : *mut u32, lpfnenumerator : GOPHER_ATTRIBUTE_ENUMERATOR, dwcontext : usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 103:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn GopherGetLocatorTypeA(lpszlocator : windows_sys::core::PCSTR, lpdwgophertype : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 104:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn GopherGetLocatorTypeW(lpszlocator : windows_sys::core::PCWSTR, lpdwgophertype : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 105:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn GopherOpenFileA(hconnect : *const core::ffi::c_void, lpszlocator : windows_sys::core::PCSTR, lpszview : windows_sys::core::PCSTR, dwflags : u32, dwcontext : usize) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 106:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn GopherOpenFileW(hconnect : *const core::ffi::c_void, lpszlocator : windows_sys::core::PCWSTR, lpszview : windows_sys::core::PCWSTR, dwflags : u32, dwcontext : usize) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 107:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn HttpAddRequestHeadersA(hrequest : *const core::ffi::c_void, lpszheaders : windows_sys::core::PCSTR, dwheaderslength : u32, dwmodifiers : HTTP_ADDREQ_FLAG) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 108:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn HttpAddRequestHeadersW(hrequest : *const core::ffi::c_void, lpszheaders : windows_sys::core::PCWSTR, dwheaderslength : u32, dwmodifiers : HTTP_ADDREQ_FLAG) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 109:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn HttpCheckDavComplianceA(lpszurl : windows_sys::core::PCSTR, lpszcompliancetoken : windows_sys::core::PCSTR, lpffound : *mut windows_sys::core::BOOL, hwnd : super::super::Foundation:: HWND, lpvreserved : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 110:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn HttpCheckDavComplianceW(lpszurl : windows_sys::core::PCWSTR, lpszcompliancetoken : windows_sys::core::PCWSTR, lpffound : *mut windows_sys::core::BOOL, hwnd : super::super::Foundation:: HWND, lpvreserved : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 111:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn HttpCloseDependencyHandle(hdependencyhandle : *const core::ffi::c_void));

// UNSUPPORTED Rust 112:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn HttpDuplicateDependencyHandle(hdependencyhandle : *const core::ffi::c_void, phduplicateddependencyhandle : *mut *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 113:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn HttpEndRequestA(hrequest : *const core::ffi::c_void, lpbuffersout : *mut INTERNET_BUFFERSA, dwflags : u32, dwcontext : usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 114:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn HttpEndRequestW(hrequest : *const core::ffi::c_void, lpbuffersout : *mut INTERNET_BUFFERSW, dwflags : u32, dwcontext : usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 115:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn HttpGetServerCredentials(pwszurl : windows_sys::core::PCWSTR, ppwszusername : *mut windows_sys::core::PWSTR, ppwszpassword : *mut windows_sys::core::PWSTR) -> u32);

// UNSUPPORTED Rust 116:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn HttpIndicatePageLoadComplete(hdependencyhandle : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 117:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn HttpIsHostHstsEnabled(pcwszurl : windows_sys::core::PCWSTR, pfishsts : *mut windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 118:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn HttpOpenDependencyHandle(hrequesthandle : *const core::ffi::c_void, fbackground : windows_sys::core::BOOL, phdependencyhandle : *mut *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 119:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn HttpOpenRequestA(hconnect : *const core::ffi::c_void, lpszverb : windows_sys::core::PCSTR, lpszobjectname : windows_sys::core::PCSTR, lpszversion : windows_sys::core::PCSTR, lpszreferrer : windows_sys::core::PCSTR, lplpszaccepttypes : *const windows_sys::core::PCSTR, dwflags : u32, dwcontext : usize) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 120:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn HttpOpenRequestW(hconnect : *const core::ffi::c_void, lpszverb : windows_sys::core::PCWSTR, lpszobjectname : windows_sys::core::PCWSTR, lpszversion : windows_sys::core::PCWSTR, lpszreferrer : windows_sys::core::PCWSTR, lplpszaccepttypes : *const windows_sys::core::PCWSTR, dwflags : u32, dwcontext : usize) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 121:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn HttpPushClose(hwait : HTTP_PUSH_WAIT_HANDLE));

// UNSUPPORTED Rust 122:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn HttpPushEnable(hrequest : *const core::ffi::c_void, ptransportsetting : *const HTTP_PUSH_TRANSPORT_SETTING, phwait : *mut HTTP_PUSH_WAIT_HANDLE) -> u32);

// UNSUPPORTED Rust 123:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn HttpPushWait(hwait : HTTP_PUSH_WAIT_HANDLE, etype : HTTP_PUSH_WAIT_TYPE, pnotificationstatus : *mut HTTP_PUSH_NOTIFICATION_STATUS) -> u32);

// UNSUPPORTED Rust 124:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn HttpQueryInfoA(hrequest : *const core::ffi::c_void, dwinfolevel : u32, lpbuffer : *mut core::ffi::c_void, lpdwbufferlength : *mut u32, lpdwindex : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 125:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn HttpQueryInfoW(hrequest : *const core::ffi::c_void, dwinfolevel : u32, lpbuffer : *mut core::ffi::c_void, lpdwbufferlength : *mut u32, lpdwindex : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 126:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn HttpSendRequestA(hrequest : *const core::ffi::c_void, lpszheaders : windows_sys::core::PCSTR, dwheaderslength : u32, lpoptional : *const core::ffi::c_void, dwoptionallength : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 127:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn HttpSendRequestExA(hrequest : *const core::ffi::c_void, lpbuffersin : *const INTERNET_BUFFERSA, lpbuffersout : *mut INTERNET_BUFFERSA, dwflags : u32, dwcontext : usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 128:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn HttpSendRequestExW(hrequest : *const core::ffi::c_void, lpbuffersin : *const INTERNET_BUFFERSW, lpbuffersout : *mut INTERNET_BUFFERSW, dwflags : u32, dwcontext : usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 129:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn HttpSendRequestW(hrequest : *const core::ffi::c_void, lpszheaders : windows_sys::core::PCWSTR, dwheaderslength : u32, lpoptional : *const core::ffi::c_void, dwoptionallength : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 130:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn HttpWebSocketClose(hwebsocket : *const core::ffi::c_void, usstatus : u16, pvreason : *const core::ffi::c_void, dwreasonlength : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 131:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn HttpWebSocketCompleteUpgrade(hrequest : *const core::ffi::c_void, dwcontext : usize) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 132:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn HttpWebSocketQueryCloseStatus(hwebsocket : *const core::ffi::c_void, pusstatus : *mut u16, pvreason : *mut core::ffi::c_void, dwreasonlength : u32, pdwreasonlengthconsumed : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 133:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn HttpWebSocketReceive(hwebsocket : *const core::ffi::c_void, pvbuffer : *mut core::ffi::c_void, dwbufferlength : u32, pdwbytesread : *mut u32, pbuffertype : *mut HTTP_WEB_SOCKET_BUFFER_TYPE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 134:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn HttpWebSocketSend(hwebsocket : *const core::ffi::c_void, buffertype : HTTP_WEB_SOCKET_BUFFER_TYPE, pvbuffer : *const core::ffi::c_void, dwbufferlength : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 135:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn HttpWebSocketShutdown(hwebsocket : *const core::ffi::c_void, usstatus : u16, pvreason : *const core::ffi::c_void, dwreasonlength : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 136:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn ImportCookieFileA(szfilename : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 137:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn ImportCookieFileW(szfilename : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 138:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn IncrementUrlCacheHeaderData(nidx : u32, lpdwdata : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 139:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternalInternetGetCookie(lpszurl : windows_sys::core::PCSTR, lpszcookiedata : windows_sys::core::PSTR, lpdwdatasize : *mut u32) -> u32);

// UNSUPPORTED Rust 140:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// windows_link::link!("wininet.dll" "system" fn InternetAlgIdToStringA(ai : super::super::Security::Cryptography:: ALG_ID, lpstr : windows_sys::core::PSTR, lpdwstrlength : *mut u32, dwreserved : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 142:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// windows_link::link!("wininet.dll" "system" fn InternetAlgIdToStringW(ai : super::super::Security::Cryptography:: ALG_ID, lpstr : windows_sys::core::PWSTR, lpdwstrlength : *mut u32, dwreserved : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 144:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetAttemptConnect(dwreserved : u32) -> u32);

// UNSUPPORTED Rust 145:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetAutodial(dwflags : INTERNET_AUTODIAL, hwndparent : super::super::Foundation:: HWND) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 146:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetAutodialHangup(dwreserved : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 147:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetCanonicalizeUrlA(lpszurl : windows_sys::core::PCSTR, lpszbuffer : windows_sys::core::PSTR, lpdwbufferlength : *mut u32, dwflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 148:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetCanonicalizeUrlW(lpszurl : windows_sys::core::PCWSTR, lpszbuffer : windows_sys::core::PWSTR, lpdwbufferlength : *mut u32, dwflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 149:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetCheckConnectionA(lpszurl : windows_sys::core::PCSTR, dwflags : u32, dwreserved : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 150:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetCheckConnectionW(lpszurl : windows_sys::core::PCWSTR, dwflags : u32, dwreserved : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 151:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetClearAllPerSiteCookieDecisions() -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 152:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetCloseHandle(hinternet : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 153:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetCombineUrlA(lpszbaseurl : windows_sys::core::PCSTR, lpszrelativeurl : windows_sys::core::PCSTR, lpszbuffer : windows_sys::core::PSTR, lpdwbufferlength : *mut u32, dwflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 154:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetCombineUrlW(lpszbaseurl : windows_sys::core::PCWSTR, lpszrelativeurl : windows_sys::core::PCWSTR, lpszbuffer : windows_sys::core::PWSTR, lpdwbufferlength : *mut u32, dwflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 155:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetConfirmZoneCrossing(hwnd : super::super::Foundation:: HWND, szurlprev : windows_sys::core::PCSTR, szurlnew : windows_sys::core::PCSTR, bpost : windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 156:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetConfirmZoneCrossingA(hwnd : super::super::Foundation:: HWND, szurlprev : windows_sys::core::PCSTR, szurlnew : windows_sys::core::PCSTR, bpost : windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 157:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetConfirmZoneCrossingW(hwnd : super::super::Foundation:: HWND, szurlprev : windows_sys::core::PCWSTR, szurlnew : windows_sys::core::PCWSTR, bpost : windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 158:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetConnectA(hinternet : *const core::ffi::c_void, lpszservername : windows_sys::core::PCSTR, nserverport : u16, lpszusername : windows_sys::core::PCSTR, lpszpassword : windows_sys::core::PCSTR, dwservice : u32, dwflags : u32, dwcontext : usize) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 159:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetConnectW(hinternet : *const core::ffi::c_void, lpszservername : windows_sys::core::PCWSTR, nserverport : u16, lpszusername : windows_sys::core::PCWSTR, lpszpassword : windows_sys::core::PCWSTR, dwservice : u32, dwflags : u32, dwcontext : usize) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 160:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetConvertUrlFromWireToWideChar(pcszurl : windows_sys::core::PCSTR, cchurl : u32, pcwszbaseurl : windows_sys::core::PCWSTR, dwcodepagehost : u32, dwcodepagepath : u32, fencodepathextra : windows_sys::core::BOOL, dwcodepageextra : u32, ppwszconvertedurl : *mut windows_sys::core::PWSTR) -> u32);

// UNSUPPORTED Rust 161:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Networking_WinHttp")]
// windows_link::link!("wininet.dll" "system" fn InternetCrackUrlA(lpszurl : windows_sys::core::PCSTR, dwurllength : u32, dwflags : super::WinHttp:: WIN_HTTP_CREATE_URL_FLAGS, lpurlcomponents : *mut URL_COMPONENTSA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 163:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Networking_WinHttp")]
// windows_link::link!("wininet.dll" "system" fn InternetCrackUrlW(lpszurl : windows_sys::core::PCWSTR, dwurllength : u32, dwflags : super::WinHttp:: WIN_HTTP_CREATE_URL_FLAGS, lpurlcomponents : *mut URL_COMPONENTSW) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 165:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetCreateUrlA(lpurlcomponents : *const URL_COMPONENTSA, dwflags : u32, lpszurl : windows_sys::core::PSTR, lpdwurllength : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 166:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetCreateUrlW(lpurlcomponents : *const URL_COMPONENTSW, dwflags : u32, lpszurl : windows_sys::core::PWSTR, lpdwurllength : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 167:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetDial(hwndparent : super::super::Foundation:: HWND, lpszconnectoid : windows_sys::core::PCSTR, dwflags : u32, lpdwconnection : *mut u32, dwreserved : u32) -> u32);

// UNSUPPORTED Rust 168:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetDialA(hwndparent : super::super::Foundation:: HWND, lpszconnectoid : windows_sys::core::PCSTR, dwflags : u32, lpdwconnection : *mut usize, dwreserved : u32) -> u32);

// UNSUPPORTED Rust 169:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetDialW(hwndparent : super::super::Foundation:: HWND, lpszconnectoid : windows_sys::core::PCWSTR, dwflags : u32, lpdwconnection : *mut usize, dwreserved : u32) -> u32);

// UNSUPPORTED Rust 170:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetEnumPerSiteCookieDecisionA(pszsitename : windows_sys::core::PSTR, pcsitenamesize : *mut u32, pdwdecision : *mut u32, dwindex : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 171:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetEnumPerSiteCookieDecisionW(pszsitename : windows_sys::core::PWSTR, pcsitenamesize : *mut u32, pdwdecision : *mut u32, dwindex : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 172:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetErrorDlg(hwnd : super::super::Foundation:: HWND, hrequest : *mut core::ffi::c_void, dwerror : u32, dwflags : u32, lppvdata : *mut *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 173:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetFindNextFileA(hfind : *const core::ffi::c_void, lpvfinddata : *mut core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 174:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetFindNextFileW(hfind : *const core::ffi::c_void, lpvfinddata : *mut core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 175:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetFortezzaCommand(dwcommand : u32, hwnd : super::super::Foundation:: HWND, dwreserved : usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 176:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetFreeCookies(pcookies : *mut INTERNET_COOKIE2, dwcookiecount : u32));

// UNSUPPORTED Rust 177:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetFreeProxyInfoList(pproxyinfolist : *mut WININET_PROXY_INFO_LIST));

// UNSUPPORTED Rust 178:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetGetConnectedState(lpdwflags : *mut INTERNET_CONNECTION, dwreserved : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 179:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetGetConnectedStateEx(lpdwflags : *mut INTERNET_CONNECTION, lpszconnectionname : windows_sys::core::PSTR, dwnamelen : u32, dwreserved : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 180:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetGetConnectedStateExA(lpdwflags : *mut INTERNET_CONNECTION, lpszconnectionname : windows_sys::core::PSTR, cchnamelen : u32, dwreserved : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 181:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetGetConnectedStateExW(lpdwflags : *mut INTERNET_CONNECTION, lpszconnectionname : windows_sys::core::PWSTR, cchnamelen : u32, dwreserved : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 182:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetGetCookieA(lpszurl : windows_sys::core::PCSTR, lpszcookiename : windows_sys::core::PCSTR, lpszcookiedata : windows_sys::core::PSTR, lpdwsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 183:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetGetCookieEx2(pcwszurl : windows_sys::core::PCWSTR, pcwszcookiename : windows_sys::core::PCWSTR, dwflags : u32, ppcookies : *mut *mut INTERNET_COOKIE2, pdwcookiecount : *mut u32) -> u32);

// UNSUPPORTED Rust 184:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetGetCookieExA(lpszurl : windows_sys::core::PCSTR, lpszcookiename : windows_sys::core::PCSTR, lpszcookiedata : windows_sys::core::PCSTR, lpdwsize : *mut u32, dwflags : INTERNET_COOKIE_FLAGS, lpreserved : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 185:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetGetCookieExW(lpszurl : windows_sys::core::PCWSTR, lpszcookiename : windows_sys::core::PCWSTR, lpszcookiedata : windows_sys::core::PCWSTR, lpdwsize : *mut u32, dwflags : INTERNET_COOKIE_FLAGS, lpreserved : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 186:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetGetCookieW(lpszurl : windows_sys::core::PCWSTR, lpszcookiename : windows_sys::core::PCWSTR, lpszcookiedata : windows_sys::core::PWSTR, lpdwsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 187:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetGetLastResponseInfoA(lpdwerror : *mut u32, lpszbuffer : windows_sys::core::PSTR, lpdwbufferlength : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 188:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetGetLastResponseInfoW(lpdwerror : *mut u32, lpszbuffer : windows_sys::core::PWSTR, lpdwbufferlength : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 189:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetGetPerSiteCookieDecisionA(pchhostname : windows_sys::core::PCSTR, presult : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 190:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetGetPerSiteCookieDecisionW(pchhostname : windows_sys::core::PCWSTR, presult : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 191:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetGetProxyForUrl(hinternet : *const core::ffi::c_void, pcwszurl : windows_sys::core::PCWSTR, pproxyinfolist : *mut WININET_PROXY_INFO_LIST) -> u32);

// UNSUPPORTED Rust 192:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// windows_link::link!("wininet.dll" "system" fn InternetGetSecurityInfoByURL(lpszurl : windows_sys::core::PCSTR, ppcertchain : *mut *mut super::super::Security::Cryptography:: CERT_CHAIN_CONTEXT, pdwsecureflags : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 194:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// windows_link::link!("wininet.dll" "system" fn InternetGetSecurityInfoByURLA(lpszurl : windows_sys::core::PCSTR, ppcertchain : *mut *mut super::super::Security::Cryptography:: CERT_CHAIN_CONTEXT, pdwsecureflags : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 196:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_Cryptography")]
// windows_link::link!("wininet.dll" "system" fn InternetGetSecurityInfoByURLW(lpszurl : windows_sys::core::PCWSTR, ppcertchain : *mut *mut super::super::Security::Cryptography:: CERT_CHAIN_CONTEXT, pdwsecureflags : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 198:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetGoOnline(lpszurl : windows_sys::core::PCSTR, hwndparent : super::super::Foundation:: HWND, dwflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 199:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetGoOnlineA(lpszurl : windows_sys::core::PCSTR, hwndparent : super::super::Foundation:: HWND, dwflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 200:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetGoOnlineW(lpszurl : windows_sys::core::PCWSTR, hwndparent : super::super::Foundation:: HWND, dwflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 201:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetHangUp(dwconnection : usize, dwreserved : u32) -> u32);

// UNSUPPORTED Rust 202:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetInitializeAutoProxyDll(dwreserved : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 203:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetLockRequestFile(hinternet : *const core::ffi::c_void, lphlockrequestinfo : *mut super::super::Foundation:: HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 204:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetOpenA(lpszagent : windows_sys::core::PCSTR, dwaccesstype : u32, lpszproxy : windows_sys::core::PCSTR, lpszproxybypass : windows_sys::core::PCSTR, dwflags : u32) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 205:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetOpenUrlA(hinternet : *const core::ffi::c_void, lpszurl : windows_sys::core::PCSTR, lpszheaders : windows_sys::core::PCSTR, dwheaderslength : u32, dwflags : u32, dwcontext : usize) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 206:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetOpenUrlW(hinternet : *const core::ffi::c_void, lpszurl : windows_sys::core::PCWSTR, lpszheaders : windows_sys::core::PCWSTR, dwheaderslength : u32, dwflags : u32, dwcontext : usize) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 207:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetOpenW(lpszagent : windows_sys::core::PCWSTR, dwaccesstype : u32, lpszproxy : windows_sys::core::PCWSTR, lpszproxybypass : windows_sys::core::PCWSTR, dwflags : u32) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 208:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetQueryDataAvailable(hfile : *const core::ffi::c_void, lpdwnumberofbytesavailable : *mut u32, dwflags : u32, dwcontext : usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 209:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetQueryFortezzaStatus(pdwstatus : *mut u32, dwreserved : usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 210:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetQueryOptionA(hinternet : *const core::ffi::c_void, dwoption : u32, lpbuffer : *mut core::ffi::c_void, lpdwbufferlength : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 211:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetQueryOptionW(hinternet : *const core::ffi::c_void, dwoption : u32, lpbuffer : *mut core::ffi::c_void, lpdwbufferlength : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 212:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetReadFile(hfile : *const core::ffi::c_void, lpbuffer : *mut core::ffi::c_void, dwnumberofbytestoread : u32, lpdwnumberofbytesread : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 213:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetReadFileExA(hfile : *const core::ffi::c_void, lpbuffersout : *mut INTERNET_BUFFERSA, dwflags : u32, dwcontext : usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 214:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetReadFileExW(hfile : *const core::ffi::c_void, lpbuffersout : *mut INTERNET_BUFFERSW, dwflags : u32, dwcontext : usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 215:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetSecurityProtocolToStringA(dwprotocol : u32, lpstr : windows_sys::core::PSTR, lpdwstrlength : *mut u32, dwreserved : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 216:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetSecurityProtocolToStringW(dwprotocol : u32, lpstr : windows_sys::core::PWSTR, lpdwstrlength : *mut u32, dwreserved : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 217:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetSetCookieA(lpszurl : windows_sys::core::PCSTR, lpszcookiename : windows_sys::core::PCSTR, lpszcookiedata : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 218:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetSetCookieEx2(pcwszurl : windows_sys::core::PCWSTR, pcookie : *const INTERNET_COOKIE2, pcwszp3ppolicy : windows_sys::core::PCWSTR, dwflags : u32, pdwcookiestate : *mut u32) -> u32);

// UNSUPPORTED Rust 219:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetSetCookieExA(lpszurl : windows_sys::core::PCSTR, lpszcookiename : windows_sys::core::PCSTR, lpszcookiedata : windows_sys::core::PCSTR, dwflags : u32, dwreserved : usize) -> u32);

// UNSUPPORTED Rust 220:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetSetCookieExW(lpszurl : windows_sys::core::PCWSTR, lpszcookiename : windows_sys::core::PCWSTR, lpszcookiedata : windows_sys::core::PCWSTR, dwflags : u32, dwreserved : usize) -> u32);

// UNSUPPORTED Rust 221:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetSetCookieW(lpszurl : windows_sys::core::PCWSTR, lpszcookiename : windows_sys::core::PCWSTR, lpszcookiedata : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 222:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetSetDialState(lpszconnectoid : windows_sys::core::PCSTR, dwstate : u32, dwreserved : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 223:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetSetDialStateA(lpszconnectoid : windows_sys::core::PCSTR, dwstate : u32, dwreserved : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 224:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetSetDialStateW(lpszconnectoid : windows_sys::core::PCWSTR, dwstate : u32, dwreserved : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 225:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetSetFilePointer(hfile : *const core::ffi::c_void, ldistancetomove : i32, lpdistancetomovehigh : *mut i32, dwmovemethod : u32, dwcontext : usize) -> u32);

// UNSUPPORTED Rust 226:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetSetOptionA(hinternet : *const core::ffi::c_void, dwoption : u32, lpbuffer : *const core::ffi::c_void, dwbufferlength : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 227:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetSetOptionExA(hinternet : *const core::ffi::c_void, dwoption : u32, lpbuffer : *const core::ffi::c_void, dwbufferlength : u32, dwflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 228:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetSetOptionExW(hinternet : *const core::ffi::c_void, dwoption : u32, lpbuffer : *const core::ffi::c_void, dwbufferlength : u32, dwflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 229:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetSetOptionW(hinternet : *const core::ffi::c_void, dwoption : u32, lpbuffer : *const core::ffi::c_void, dwbufferlength : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 230:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetSetPerSiteCookieDecisionA(pchhostname : windows_sys::core::PCSTR, dwdecision : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 231:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetSetPerSiteCookieDecisionW(pchhostname : windows_sys::core::PCWSTR, dwdecision : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 232:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetSetStatusCallback(hinternet : *const core::ffi::c_void, lpfninternetcallback : LPINTERNET_STATUS_CALLBACK) -> LPINTERNET_STATUS_CALLBACK);

// UNSUPPORTED Rust 233:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetSetStatusCallbackA(hinternet : *const core::ffi::c_void, lpfninternetcallback : LPINTERNET_STATUS_CALLBACK) -> LPINTERNET_STATUS_CALLBACK);

// UNSUPPORTED Rust 234:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetSetStatusCallbackW(hinternet : *const core::ffi::c_void, lpfninternetcallback : LPINTERNET_STATUS_CALLBACK) -> LPINTERNET_STATUS_CALLBACK);

// UNSUPPORTED Rust 235:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetShowSecurityInfoByURL(lpszurl : windows_sys::core::PCSTR, hwndparent : super::super::Foundation:: HWND) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 236:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetShowSecurityInfoByURLA(lpszurl : windows_sys::core::PCSTR, hwndparent : super::super::Foundation:: HWND) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 237:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetShowSecurityInfoByURLW(lpszurl : windows_sys::core::PCWSTR, hwndparent : super::super::Foundation:: HWND) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 238:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetTimeFromSystemTime(pst : *const super::super::Foundation:: SYSTEMTIME, dwrfc : u32, lpsztime : windows_sys::core::PSTR, cbtime : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 239:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetTimeFromSystemTimeA(pst : *const super::super::Foundation:: SYSTEMTIME, dwrfc : u32, lpsztime : windows_sys::core::PSTR, cbtime : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 240:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetTimeFromSystemTimeW(pst : *const super::super::Foundation:: SYSTEMTIME, dwrfc : u32, lpsztime : windows_sys::core::PWSTR, cbtime : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 241:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetTimeToSystemTime(lpsztime : windows_sys::core::PCSTR, pst : *mut super::super::Foundation:: SYSTEMTIME, dwreserved : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 242:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetTimeToSystemTimeA(lpsztime : windows_sys::core::PCSTR, pst : *mut super::super::Foundation:: SYSTEMTIME, dwreserved : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 243:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetTimeToSystemTimeW(lpsztime : windows_sys::core::PCWSTR, pst : *mut super::super::Foundation:: SYSTEMTIME, dwreserved : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 244:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetUnlockRequestFile(hlockrequestinfo : super::super::Foundation:: HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 245:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetWriteFile(hfile : *const core::ffi::c_void, lpbuffer : *const core::ffi::c_void, dwnumberofbytestowrite : u32, lpdwnumberofbyteswritten : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 246:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetWriteFileExA(hfile : *const core::ffi::c_void, lpbuffersin : *const INTERNET_BUFFERSA, dwflags : u32, dwcontext : usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 247:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn InternetWriteFileExW(hfile : *const core::ffi::c_void, lpbuffersin : *const INTERNET_BUFFERSW, dwflags : u32, dwcontext : usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 248:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn IsDomainLegalCookieDomainA(pchdomain : windows_sys::core::PCSTR, pchfulldomain : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 249:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn IsDomainLegalCookieDomainW(pchdomain : windows_sys::core::PCWSTR, pchfulldomain : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 250:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn IsHostInProxyBypassList(tscheme : INTERNET_SCHEME, lpszhost : windows_sys::core::PCSTR, cchhost : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 251:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn IsProfilesEnabled() -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 252:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn IsUrlCacheEntryExpiredA(lpszurlname : windows_sys::core::PCSTR, dwflags : u32, pftlastmodified : *mut super::super::Foundation:: FILETIME) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 253:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn IsUrlCacheEntryExpiredW(lpszurlname : windows_sys::core::PCWSTR, dwflags : u32, pftlastmodified : *mut super::super::Foundation:: FILETIME) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 254:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn LoadUrlCacheContent() -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 255:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn ParseX509EncodedCertificateForListBoxEntry(lpcert : *const u8, cbcert : u32, lpszlistboxentry : windows_sys::core::PSTR, lpdwlistboxentry : *mut u32) -> u32);

// UNSUPPORTED Rust 256:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn PerformOperationOverUrlCacheA(pszurlsearchpattern : windows_sys::core::PCSTR, dwflags : u32, dwfilter : u32, groupid : i64, preserved1 : *const core::ffi::c_void, pdwreserved2 : *const u32, preserved3 : *const core::ffi::c_void, op : CACHE_OPERATOR, poperatordata : *mut core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 257:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn PrivacyGetZonePreferenceW(dwzone : u32, dwtype : u32, pdwtemplate : *mut u32, pszbuffer : windows_sys::core::PWSTR, pdwbufferlength : *mut u32) -> u32);

// UNSUPPORTED Rust 258:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn PrivacySetZonePreferenceW(dwzone : u32, dwtype : u32, dwtemplate : u32, pszpreference : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 259:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn ReadGuidsForConnectedNetworks(pcnetworks : *mut u32, pppwsznetworkguids : *mut *mut windows_sys::core::PWSTR, pppbstrnetworknames : *mut *mut windows_sys::core::BSTR, pppwszgwmacs : *mut *mut windows_sys::core::PWSTR, pcgatewaymacs : *mut u32, pdwflags : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 260:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn ReadUrlCacheEntryStream(hurlcachestream : super::super::Foundation:: HANDLE, dwlocation : u32, lpbuffer : *mut core::ffi::c_void, lpdwlen : *mut u32, reserved : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 261:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn ReadUrlCacheEntryStreamEx(hurlcachestream : super::super::Foundation:: HANDLE, qwlocation : u64, lpbuffer : *mut core::ffi::c_void, lpdwlen : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 262:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn RegisterUrlCacheNotification(hwnd : super::super::Foundation:: HWND, umsg : u32, gid : i64, dwopsfilter : u32, dwreserved : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 263:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn ResumeSuspendedDownload(hrequest : *const core::ffi::c_void, dwresultcode : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 264:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn RetrieveUrlCacheEntryFileA(lpszurlname : windows_sys::core::PCSTR, lpcacheentryinfo : *mut INTERNET_CACHE_ENTRY_INFOA, lpcbcacheentryinfo : *mut u32, dwreserved : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 265:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn RetrieveUrlCacheEntryFileW(lpszurlname : windows_sys::core::PCWSTR, lpcacheentryinfo : *mut INTERNET_CACHE_ENTRY_INFOW, lpcbcacheentryinfo : *mut u32, dwreserved : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 266:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn RetrieveUrlCacheEntryStreamA(lpszurlname : windows_sys::core::PCSTR, lpcacheentryinfo : *mut INTERNET_CACHE_ENTRY_INFOA, lpcbcacheentryinfo : *mut u32, frandomread : windows_sys::core::BOOL, dwreserved : u32) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 267:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn RetrieveUrlCacheEntryStreamW(lpszurlname : windows_sys::core::PCWSTR, lpcacheentryinfo : *mut INTERNET_CACHE_ENTRY_INFOW, lpcbcacheentryinfo : *mut u32, frandomread : windows_sys::core::BOOL, dwreserved : u32) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 268:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn RunOnceUrlCache(hwnd : super::super::Foundation:: HWND, hinst : super::super::Foundation:: HINSTANCE, lpszcmd : windows_sys::core::PCSTR, ncmdshow : i32) -> u32);

// UNSUPPORTED Rust 269:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn SetUrlCacheConfigInfoA(lpcacheconfiginfo : *const INTERNET_CACHE_CONFIG_INFOA, dwfieldcontrol : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 270:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn SetUrlCacheConfigInfoW(lpcacheconfiginfo : *const INTERNET_CACHE_CONFIG_INFOW, dwfieldcontrol : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 271:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn SetUrlCacheEntryGroup(lpszurlname : windows_sys::core::PCSTR, dwflags : u32, groupid : i64, pbgroupattributes : *const u8, cbgroupattributes : u32, lpreserved : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 272:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn SetUrlCacheEntryGroupA(lpszurlname : windows_sys::core::PCSTR, dwflags : u32, groupid : i64, pbgroupattributes : *const u8, cbgroupattributes : u32, lpreserved : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 273:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn SetUrlCacheEntryGroupW(lpszurlname : windows_sys::core::PCWSTR, dwflags : u32, groupid : i64, pbgroupattributes : *const u8, cbgroupattributes : u32, lpreserved : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 274:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn SetUrlCacheEntryInfoA(lpszurlname : windows_sys::core::PCSTR, lpcacheentryinfo : *const INTERNET_CACHE_ENTRY_INFOA, dwfieldcontrol : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 275:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn SetUrlCacheEntryInfoW(lpszurlname : windows_sys::core::PCWSTR, lpcacheentryinfo : *const INTERNET_CACHE_ENTRY_INFOW, dwfieldcontrol : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 276:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn SetUrlCacheGroupAttributeA(gid : i64, dwflags : u32, dwattributes : u32, lpgroupinfo : *const INTERNET_CACHE_GROUP_INFOA, lpreserved : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 277:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn SetUrlCacheGroupAttributeW(gid : i64, dwflags : u32, dwattributes : u32, lpgroupinfo : *const INTERNET_CACHE_GROUP_INFOW, lpreserved : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 278:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn SetUrlCacheHeaderData(nidx : u32, dwdata : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 279:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn ShowClientAuthCerts(hwndparent : super::super::Foundation:: HWND) -> u32);

// UNSUPPORTED Rust 280:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_Security_Authentication_Identity", feature = "Win32_Security_Cryptography"))]
// windows_link::link!("wininet.dll" "system" fn ShowSecurityInfo(hwndparent : super::super::Foundation:: HWND, psecurityinfo : *const INTERNET_SECURITY_INFO) -> u32);

// UNSUPPORTED Rust 282:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn ShowX509EncodedCertificate(hwndparent : super::super::Foundation:: HWND, lpcert : *const u8, cbcert : u32) -> u32);

// UNSUPPORTED Rust 283:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn UnlockUrlCacheEntryFile(lpszurlname : windows_sys::core::PCSTR, dwreserved : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 284:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn UnlockUrlCacheEntryFileA(lpszurlname : windows_sys::core::PCSTR, dwreserved : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 285:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn UnlockUrlCacheEntryFileW(lpszurlname : windows_sys::core::PCWSTR, dwreserved : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 286:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn UnlockUrlCacheEntryStream(hurlcachestream : super::super::Foundation:: HANDLE, reserved : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 287:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn UpdateUrlCacheContentPath(sznewpath : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 288:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn UrlCacheCheckEntriesExist(rgpwszurls : *const windows_sys::core::PCWSTR, centries : u32, rgfexist : *mut windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 289:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn UrlCacheCloseEntryHandle(hentryfile : *const core::ffi::c_void));

// UNSUPPORTED Rust 290:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn UrlCacheContainerSetEntryMaximumAge(pwszprefix : windows_sys::core::PCWSTR, dwentrymaxage : u32) -> u32);

// UNSUPPORTED Rust 291:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn UrlCacheCreateContainer(pwszname : windows_sys::core::PCWSTR, pwszprefix : windows_sys::core::PCWSTR, pwszdirectory : windows_sys::core::PCWSTR, ulllimit : u64, dwoptions : u32) -> u32);

// UNSUPPORTED Rust 292:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn UrlCacheFindFirstEntry(pwszprefix : windows_sys::core::PCWSTR, dwflags : u32, dwfilter : u32, groupid : i64, pcacheentryinfo : *mut URLCACHE_ENTRY_INFO, phfind : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 293:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn UrlCacheFindNextEntry(hfind : super::super::Foundation:: HANDLE, pcacheentryinfo : *mut URLCACHE_ENTRY_INFO) -> u32);

// UNSUPPORTED Rust 294:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn UrlCacheFreeEntryInfo(pcacheentryinfo : *mut URLCACHE_ENTRY_INFO));

// UNSUPPORTED Rust 295:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn UrlCacheFreeGlobalSpace(ulltargetsize : u64, dwfilter : u32) -> u32);

// UNSUPPORTED Rust 296:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn UrlCacheGetContentPaths(pppwszdirectories : *mut *mut windows_sys::core::PWSTR, pcdirectories : *mut u32) -> u32);

// UNSUPPORTED Rust 297:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn UrlCacheGetEntryInfo(happcache : *const core::ffi::c_void, pcwszurl : windows_sys::core::PCWSTR, pcacheentryinfo : *mut URLCACHE_ENTRY_INFO) -> u32);

// UNSUPPORTED Rust 298:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn UrlCacheGetGlobalCacheSize(dwfilter : u32, pullsize : *mut u64, pulllimit : *mut u64) -> u32);

// UNSUPPORTED Rust 299:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn UrlCacheGetGlobalLimit(limittype : URL_CACHE_LIMIT_TYPE, pulllimit : *mut u64) -> u32);

// UNSUPPORTED Rust 300:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn UrlCacheReadEntryStream(hurlcachestream : *const core::ffi::c_void, ulllocation : u64, pbuffer : *mut core::ffi::c_void, dwbufferlen : u32, pdwbufferlen : *mut u32) -> u32);

// UNSUPPORTED Rust 301:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn UrlCacheReloadSettings() -> u32);

// UNSUPPORTED Rust 302:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn UrlCacheRetrieveEntryFile(happcache : *const core::ffi::c_void, pcwszurl : windows_sys::core::PCWSTR, pcacheentryinfo : *mut URLCACHE_ENTRY_INFO, phentryfile : *mut *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 303:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn UrlCacheRetrieveEntryStream(happcache : *const core::ffi::c_void, pcwszurl : windows_sys::core::PCWSTR, frandomread : windows_sys::core::BOOL, pcacheentryinfo : *mut URLCACHE_ENTRY_INFO, phentrystream : *mut *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 304:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn UrlCacheServer() -> u32);

// UNSUPPORTED Rust 305:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn UrlCacheSetGlobalLimit(limittype : URL_CACHE_LIMIT_TYPE, ulllimit : u64) -> u32);

// UNSUPPORTED Rust 306:1: declaration Macro has no candidate rule
// windows_link::link!("wininet.dll" "system" fn UrlCacheUpdateEntryExtraData(happcache : *const core::ffi::c_void, pcwszurl : windows_sys::core::PCWSTR, pbextradata : *const u8, cbextradata : u32) -> u32);

public const val `ANY_CACHE_ENTRY`: UInt = 4294967295u;
// UNSUPPORTED Rust 308:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct APP_CACHE_DOWNLOAD_ENTRY {
//     pub pwszUrl: windows_sys::core::PWSTR,
//     pub dwEntryType: u32,
// }

// UNSUPPORTED Rust 314:1: declaration Impl has no candidate rule
// impl Default for APP_CACHE_DOWNLOAD_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 319:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct APP_CACHE_DOWNLOAD_LIST {
//     pub dwEntryCount: u32,
//     pub pEntries: *mut APP_CACHE_DOWNLOAD_ENTRY,
// }

// UNSUPPORTED Rust 325:1: declaration Impl has no candidate rule
// impl Default for APP_CACHE_DOWNLOAD_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `APP_CACHE_ENTRY_TYPE_EXPLICIT`: UInt = 2u;
public const val `APP_CACHE_ENTRY_TYPE_FALLBACK`: UInt = 4u;
public const val `APP_CACHE_ENTRY_TYPE_FOREIGN`: UInt = 8u;
public const val `APP_CACHE_ENTRY_TYPE_MANIFEST`: UInt = 16u;
public const val `APP_CACHE_ENTRY_TYPE_MASTER`: UInt = 1u;
public typealias `APP_CACHE_FINALIZE_STATE` = Int;
// UNSUPPORTED Rust 336:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct APP_CACHE_GROUP_INFO {
//     pub pwszManifestUrl: windows_sys::core::PWSTR,
//     pub ftLastAccessTime: super::super::Foundation::FILETIME,
//     pub ullSize: u64,
// }

// UNSUPPORTED Rust 343:1: declaration Impl has no candidate rule
// impl Default for APP_CACHE_GROUP_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 348:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct APP_CACHE_GROUP_LIST {
//     pub dwAppCacheGroupCount: u32,
//     pub pAppCacheGroups: *mut APP_CACHE_GROUP_INFO,
// }

// UNSUPPORTED Rust 354:1: declaration Impl has no candidate rule
// impl Default for APP_CACHE_GROUP_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `APP_CACHE_LOOKUP_NO_MASTER_ONLY`: UInt = 1u;
public typealias `APP_CACHE_STATE` = Int;
public const val `AUTH_FLAG_DISABLE_BASIC_CLEARCHANNEL`: UInt = 4u;
public const val `AUTH_FLAG_DISABLE_NEGOTIATE`: UInt = 1u;
public const val `AUTH_FLAG_DISABLE_SERVER_AUTH`: UInt = 8u;
public const val `AUTH_FLAG_ENABLE_NEGOTIATE`: UInt = 2u;
public const val `AUTH_FLAG_RESET`: UInt = 0u;
public const val `AUTODIAL_MODE_ALWAYS`: UInt = 2u;
public const val `AUTODIAL_MODE_NEVER`: UInt = 1u;
public const val `AUTODIAL_MODE_NO_NETWORK_PRESENT`: UInt = 4u;
public const val `AUTO_PROXY_FLAG_ALWAYS_DETECT`: UInt = 2u;
public const val `AUTO_PROXY_FLAG_CACHE_INIT_RUN`: UInt = 32u;
public const val `AUTO_PROXY_FLAG_DETECTION_RUN`: UInt = 4u;
public const val `AUTO_PROXY_FLAG_DETECTION_SUSPECT`: UInt = 64u;
public const val `AUTO_PROXY_FLAG_DONT_CACHE_PROXY_RESULT`: UInt = 16u;
public const val `AUTO_PROXY_FLAG_MIGRATED`: UInt = 8u;
public const val `AUTO_PROXY_FLAG_USER_SET`: UInt = 1u;
// UNSUPPORTED Rust 376:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct AUTO_PROXY_SCRIPT_BUFFER {
//     pub dwStructSize: u32,
//     pub lpszScriptBuffer: windows_sys::core::PSTR,
//     pub dwScriptBufferSize: u32,
// }

// UNSUPPORTED Rust 383:1: declaration Impl has no candidate rule
// impl Default for AUTO_PROXY_SCRIPT_BUFFER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `AppCacheFinalizeStateComplete`: `APP_CACHE_FINALIZE_STATE` = 2;
public const val `AppCacheFinalizeStateIncomplete`: `APP_CACHE_FINALIZE_STATE` = 0;
public const val `AppCacheFinalizeStateManifestChange`: `APP_CACHE_FINALIZE_STATE` = 1;
public const val `AppCacheStateNoUpdateNeeded`: `APP_CACHE_STATE` = 0;
public const val `AppCacheStateUpdateNeeded`: `APP_CACHE_STATE` = 1;
public const val `AppCacheStateUpdateNeededMasterOnly`: `APP_CACHE_STATE` = 3;
public const val `AppCacheStateUpdateNeededNew`: `APP_CACHE_STATE` = 2;
// UNSUPPORTED Rust 395:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct AutoProxyHelperFunctions {
//     pub lpVtbl: *const AutoProxyHelperVtbl,
// }

// UNSUPPORTED Rust 400:1: declaration Impl has no candidate rule
// impl Default for AutoProxyHelperFunctions {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 405:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct AutoProxyHelperVtbl {
//     pub IsResolvable: isize,
//     pub GetIPAddress: isize,
//     pub ResolveHostName: isize,
//     pub IsInNet: isize,
//     pub IsResolvableEx: isize,
//     pub GetIPAddressEx: isize,
//     pub ResolveHostNameEx: isize,
//     pub IsInNetEx: isize,
//     pub SortIpList: isize,
// }

public const val `CACHEGROUP_ATTRIBUTE_BASIC`: UInt = 1u;
public const val `CACHEGROUP_ATTRIBUTE_FLAG`: UInt = 2u;
public const val `CACHEGROUP_ATTRIBUTE_GET_ALL`: UInt = 4294967295u;
public const val `CACHEGROUP_ATTRIBUTE_GROUPNAME`: UInt = 16u;
public const val `CACHEGROUP_ATTRIBUTE_QUOTA`: UInt = 8u;
public const val `CACHEGROUP_ATTRIBUTE_STORAGE`: UInt = 32u;
public const val `CACHEGROUP_ATTRIBUTE_TYPE`: UInt = 4u;
public const val `CACHEGROUP_FLAG_FLUSHURL_ONDELETE`: UInt = 2u;
public const val `CACHEGROUP_FLAG_GIDONLY`: UInt = 4u;
public const val `CACHEGROUP_FLAG_NONPURGEABLE`: UInt = 1u;
public const val `CACHEGROUP_FLAG_VALID`: UInt = 7u;
public const val `CACHEGROUP_ID_BUILTIN_STICKY`: ULong = 1152921504606846983uL;
public const val `CACHEGROUP_SEARCH_ALL`: UInt = 0u;
public const val `CACHEGROUP_SEARCH_BYURL`: UInt = 1u;
public const val `CACHEGROUP_TYPE_INVALID`: UInt = 1u;
public typealias `CACHE_CONFIG` = UInt;
public const val `CACHE_CONFIG_APPCONTAINER_CONTENT_QUOTA_FC`: UInt = 131072u;
public const val `CACHE_CONFIG_APPCONTAINER_TOTAL_CONTENT_QUOTA_FC`: UInt = 262144u;
public const val `CACHE_CONFIG_CONTENT_PATHS_FC`: `CACHE_CONFIG` = 256u;
public const val `CACHE_CONFIG_CONTENT_QUOTA_FC`: UInt = 32768u;
public const val `CACHE_CONFIG_CONTENT_USAGE_FC`: `CACHE_CONFIG` = 8192u;
public const val `CACHE_CONFIG_COOKIES_PATHS_FC`: `CACHE_CONFIG` = 512u;
public const val `CACHE_CONFIG_DISK_CACHE_PATHS_FC`: `CACHE_CONFIG` = 64u;
public const val `CACHE_CONFIG_FORCE_CLEANUP_FC`: `CACHE_CONFIG` = 32u;
public const val `CACHE_CONFIG_HISTORY_PATHS_FC`: `CACHE_CONFIG` = 1024u;
public const val `CACHE_CONFIG_QUOTA_FC`: `CACHE_CONFIG` = 2048u;
public const val `CACHE_CONFIG_STICKY_CONTENT_USAGE_FC`: `CACHE_CONFIG` = 16384u;
public const val `CACHE_CONFIG_SYNC_MODE_FC`: `CACHE_CONFIG` = 128u;
public const val `CACHE_CONFIG_TOTAL_CONTENT_QUOTA_FC`: UInt = 65536u;
public const val `CACHE_CONFIG_USER_MODE_FC`: `CACHE_CONFIG` = 4096u;
public const val `CACHE_ENTRY_ACCTIME_FC`: UInt = 256u;
public const val `CACHE_ENTRY_ATTRIBUTE_FC`: UInt = 4u;
public const val `CACHE_ENTRY_EXEMPT_DELTA_FC`: UInt = 2048u;
public const val `CACHE_ENTRY_EXPTIME_FC`: UInt = 128u;
public const val `CACHE_ENTRY_HEADERINFO_FC`: UInt = 1024u;
public const val `CACHE_ENTRY_HITRATE_FC`: UInt = 16u;
public const val `CACHE_ENTRY_MODIFY_DATA_FC`: UInt = 2147483648u;
public const val `CACHE_ENTRY_MODTIME_FC`: UInt = 64u;
public const val `CACHE_ENTRY_SYNCTIME_FC`: UInt = 512u;
public const val `CACHE_ENTRY_TYPE_FC`: UInt = 4096u;
public const val `CACHE_FIND_CONTAINER_RETURN_NOCHANGE`: UInt = 1u;
public const val `CACHE_HEADER_DATA_CACHE_READ_COUNT_SINCE_LAST_SCAVENGE`: UInt = 9u;
public const val `CACHE_HEADER_DATA_CACHE_RESERVED_12`: UInt = 12u;
public const val `CACHE_HEADER_DATA_CACHE_RESERVED_13`: UInt = 13u;
public const val `CACHE_HEADER_DATA_CACHE_RESERVED_15`: UInt = 15u;
public const val `CACHE_HEADER_DATA_CACHE_RESERVED_16`: UInt = 16u;
public const val `CACHE_HEADER_DATA_CACHE_RESERVED_17`: UInt = 17u;
public const val `CACHE_HEADER_DATA_CACHE_RESERVED_18`: UInt = 18u;
public const val `CACHE_HEADER_DATA_CACHE_RESERVED_19`: UInt = 19u;
public const val `CACHE_HEADER_DATA_CACHE_RESERVED_20`: UInt = 20u;
public const val `CACHE_HEADER_DATA_CACHE_RESERVED_23`: UInt = 23u;
public const val `CACHE_HEADER_DATA_CACHE_RESERVED_24`: UInt = 24u;
public const val `CACHE_HEADER_DATA_CACHE_RESERVED_25`: UInt = 25u;
public const val `CACHE_HEADER_DATA_CACHE_RESERVED_26`: UInt = 26u;
public const val `CACHE_HEADER_DATA_CACHE_RESERVED_28`: UInt = 28u;
public const val `CACHE_HEADER_DATA_CACHE_RESERVED_29`: UInt = 29u;
public const val `CACHE_HEADER_DATA_CACHE_RESERVED_30`: UInt = 30u;
public const val `CACHE_HEADER_DATA_CACHE_RESERVED_31`: UInt = 31u;
public const val `CACHE_HEADER_DATA_CACHE_WRITE_COUNT_SINCE_LAST_SCAVENGE`: UInt = 10u;
public const val `CACHE_HEADER_DATA_CONLIST_CHANGE_COUNT`: UInt = 1u;
public const val `CACHE_HEADER_DATA_COOKIE_CHANGE_COUNT`: UInt = 2u;
public const val `CACHE_HEADER_DATA_CURRENT_SETTINGS_VERSION`: UInt = 0u;
public const val `CACHE_HEADER_DATA_DOWNLOAD_PARTIAL`: UInt = 14u;
public const val `CACHE_HEADER_DATA_GID_HIGH`: UInt = 7u;
public const val `CACHE_HEADER_DATA_GID_LOW`: UInt = 6u;
public const val `CACHE_HEADER_DATA_HSTS_CHANGE_COUNT`: UInt = 11u;
public const val `CACHE_HEADER_DATA_LAST`: UInt = 31u;
public const val `CACHE_HEADER_DATA_LAST_SCAVENGE_TIMESTAMP`: UInt = 8u;
public const val `CACHE_HEADER_DATA_NOTIFICATION_FILTER`: UInt = 21u;
public const val `CACHE_HEADER_DATA_NOTIFICATION_HWND`: UInt = 3u;
public const val `CACHE_HEADER_DATA_NOTIFICATION_MESG`: UInt = 4u;
public const val `CACHE_HEADER_DATA_ROOTGROUP_OFFSET`: UInt = 5u;
public const val `CACHE_HEADER_DATA_ROOT_GROUPLIST_OFFSET`: UInt = 27u;
public const val `CACHE_HEADER_DATA_ROOT_LEAK_OFFSET`: UInt = 22u;
public const val `CACHE_HEADER_DATA_SSL_STATE_COUNT`: UInt = 14u;
public const val `CACHE_NOTIFY_ADD_URL`: UInt = 1u;
public const val `CACHE_NOTIFY_DELETE_ALL`: UInt = 8u;
public const val `CACHE_NOTIFY_DELETE_URL`: UInt = 2u;
public const val `CACHE_NOTIFY_FILTER_CHANGED`: UInt = 268435456u;
public const val `CACHE_NOTIFY_SET_OFFLINE`: UInt = 512u;
public const val `CACHE_NOTIFY_SET_ONLINE`: UInt = 256u;
public const val `CACHE_NOTIFY_UPDATE_URL`: UInt = 4u;
public const val `CACHE_NOTIFY_URL_SET_STICKY`: UInt = 16u;
public const val `CACHE_NOTIFY_URL_UNSET_STICKY`: UInt = 32u;
// UNSUPPORTED Rust 502:1: generic scalar type unsupported
// pub type CACHE_OPERATOR = Option<unsafe extern "system" fn(pcei: *mut INTERNET_CACHE_ENTRY_INFOA, pcbcei: *mut u32, popdata: *mut core::ffi::c_void) -> windows_sys::core::BOOL>;

public const val `COOKIE_ACCEPTED_CACHE_ENTRY`: UInt = 4096u;
public const val `COOKIE_ALLOW`: UInt = 2u;
public const val `COOKIE_ALLOW_ALL`: UInt = 4u;
public const val `COOKIE_CACHE_ENTRY`: UInt = 1048576u;
// UNSUPPORTED Rust 507:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct COOKIE_DLG_INFO {
//     pub pszServer: windows_sys::core::PWSTR,
//     pub pic: *mut INTERNET_COOKIE,
//     pub dwStopWarning: u32,
//     pub cx: i32,
//     pub cy: i32,
//     pub pszHeader: windows_sys::core::PWSTR,
//     pub dwOperation: u32,
// }

// UNSUPPORTED Rust 518:1: declaration Impl has no candidate rule
// impl Default for COOKIE_DLG_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `COOKIE_DONT_ALLOW`: UInt = 1u;
public const val `COOKIE_DONT_ALLOW_ALL`: UInt = 8u;
public const val `COOKIE_DOWNGRADED_CACHE_ENTRY`: UInt = 16384u;
public const val `COOKIE_LEASHED_CACHE_ENTRY`: UInt = 8192u;
public const val `COOKIE_OP_3RD_PARTY`: UInt = 32u;
public const val `COOKIE_OP_GET`: UInt = 4u;
public const val `COOKIE_OP_MODIFY`: UInt = 2u;
public const val `COOKIE_OP_PERSISTENT`: UInt = 16u;
public const val `COOKIE_OP_SESSION`: UInt = 8u;
public const val `COOKIE_OP_SET`: UInt = 1u;
public const val `COOKIE_REJECTED_CACHE_ENTRY`: UInt = 32768u;
public const val `COOKIE_STATE_ACCEPT`: `InternetCookieState` = 1;
public const val `COOKIE_STATE_DOWNGRADE`: `InternetCookieState` = 4;
public const val `COOKIE_STATE_LB`: UInt = 0u;
public const val `COOKIE_STATE_LEASH`: `InternetCookieState` = 3;
public const val `COOKIE_STATE_MAX`: `InternetCookieState` = 5;
public const val `COOKIE_STATE_PROMPT`: `InternetCookieState` = 2;
public const val `COOKIE_STATE_REJECT`: `InternetCookieState` = 5;
public const val `COOKIE_STATE_UB`: UInt = 5u;
public const val `COOKIE_STATE_UNKNOWN`: `InternetCookieState` = 0;
public const val `ConnectionEstablishmentEnd`: `REQUEST_TIMES` = 3;
public const val `ConnectionEstablishmentStart`: `REQUEST_TIMES` = 2;
// UNSUPPORTED Rust 545:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CookieDecision {
//     pub dwCookieState: u32,
//     pub fAllowSession: windows_sys::core::BOOL,
// }

public const val `DIALENG_OperationComplete`: UInt = 65536u;
public const val `DIALENG_RedialAttempt`: UInt = 65537u;
public const val `DIALENG_RedialWait`: UInt = 65538u;
// UNSUPPORTED Rust 554:1: non-scalar type Ptr unsupported
// pub const DIALPROP_DOMAIN: windows_sys::core::PCWSTR = windows_sys::core::w!("Domain");

// UNSUPPORTED Rust 555:1: non-scalar type Ptr unsupported
// pub const DIALPROP_LASTERROR: windows_sys::core::PCWSTR = windows_sys::core::w!("LastError");

// UNSUPPORTED Rust 556:1: non-scalar type Ptr unsupported
// pub const DIALPROP_PASSWORD: windows_sys::core::PCWSTR = windows_sys::core::w!("Password");

// UNSUPPORTED Rust 557:1: non-scalar type Ptr unsupported
// pub const DIALPROP_PHONENUMBER: windows_sys::core::PCWSTR = windows_sys::core::w!("PhoneNumber");

// UNSUPPORTED Rust 558:1: non-scalar type Ptr unsupported
// pub const DIALPROP_REDIALCOUNT: windows_sys::core::PCWSTR = windows_sys::core::w!("RedialCount");

// UNSUPPORTED Rust 559:1: non-scalar type Ptr unsupported
// pub const DIALPROP_REDIALINTERVAL: windows_sys::core::PCWSTR = windows_sys::core::w!("RedialInterval");

// UNSUPPORTED Rust 560:1: non-scalar type Ptr unsupported
// pub const DIALPROP_RESOLVEDPHONE: windows_sys::core::PCWSTR = windows_sys::core::w!("ResolvedPhone");

// UNSUPPORTED Rust 561:1: non-scalar type Ptr unsupported
// pub const DIALPROP_SAVEPASSWORD: windows_sys::core::PCWSTR = windows_sys::core::w!("SavePassword");

// UNSUPPORTED Rust 562:1: non-scalar type Ptr unsupported
// pub const DIALPROP_USERNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("UserName");

public const val `DLG_FLAGS_INSECURE_FALLBACK`: UInt = 4194304u;
public const val `DLG_FLAGS_INVALID_CA`: UInt = 16777216u;
public const val `DLG_FLAGS_SEC_CERT_CN_INVALID`: UInt = 33554432u;
public const val `DLG_FLAGS_SEC_CERT_DATE_INVALID`: UInt = 67108864u;
public const val `DLG_FLAGS_SEC_CERT_REV_FAILED`: UInt = 8388608u;
public const val `DLG_FLAGS_WEAK_SIGNATURE`: UInt = 2097152u;
public const val `DOWNLOAD_CACHE_ENTRY`: UInt = 1024u;
public const val `DUO_PROTOCOL_FLAG_SPDY3`: UInt = 1u;
public const val `DUO_PROTOCOL_MASK`: UInt = 1u;
public const val `EDITED_CACHE_ENTRY`: UInt = 8u;
public const val `ERROR_FTP_DROPPED`: UInt = 12111u;
public const val `ERROR_FTP_NO_PASSIVE_MODE`: UInt = 12112u;
public const val `ERROR_FTP_TRANSFER_IN_PROGRESS`: UInt = 12110u;
public const val `ERROR_GOPHER_ATTRIBUTE_NOT_FOUND`: UInt = 12137u;
public const val `ERROR_GOPHER_DATA_ERROR`: UInt = 12132u;
public const val `ERROR_GOPHER_END_OF_DATA`: UInt = 12133u;
public const val `ERROR_GOPHER_INCORRECT_LOCATOR_TYPE`: UInt = 12135u;
public const val `ERROR_GOPHER_INVALID_LOCATOR`: UInt = 12134u;
public const val `ERROR_GOPHER_NOT_FILE`: UInt = 12131u;
public const val `ERROR_GOPHER_NOT_GOPHER_PLUS`: UInt = 12136u;
public const val `ERROR_GOPHER_PROTOCOL_ERROR`: UInt = 12130u;
public const val `ERROR_GOPHER_UNKNOWN_LOCATOR`: UInt = 12138u;
public const val `ERROR_HTTP_COOKIE_DECLINED`: UInt = 12162u;
public const val `ERROR_HTTP_COOKIE_NEEDS_CONFIRMATION`: UInt = 12161u;
public const val `ERROR_HTTP_COOKIE_NEEDS_CONFIRMATION_EX`: UInt = 12907u;
public const val `ERROR_HTTP_DOWNLEVEL_SERVER`: UInt = 12151u;
public const val `ERROR_HTTP_HEADER_ALREADY_EXISTS`: UInt = 12155u;
public const val `ERROR_HTTP_HEADER_NOT_FOUND`: UInt = 12150u;
public const val `ERROR_HTTP_HSTS_REDIRECT_REQUIRED`: UInt = 12060u;
public const val `ERROR_HTTP_INVALID_HEADER`: UInt = 12153u;
public const val `ERROR_HTTP_INVALID_QUERY_REQUEST`: UInt = 12154u;
public const val `ERROR_HTTP_INVALID_SERVER_RESPONSE`: UInt = 12152u;
public const val `ERROR_HTTP_NOT_REDIRECTED`: UInt = 12160u;
public const val `ERROR_HTTP_PUSH_ENABLE_FAILED`: UInt = 12149u;
public const val `ERROR_HTTP_PUSH_RETRY_NOT_SUPPORTED`: UInt = 12148u;
public const val `ERROR_HTTP_PUSH_STATUS_CODE_NOT_SUPPORTED`: UInt = 12147u;
public const val `ERROR_HTTP_REDIRECT_FAILED`: UInt = 12156u;
public const val `ERROR_HTTP_REDIRECT_NEEDS_CONFIRMATION`: UInt = 12168u;
public const val `ERROR_INTERNET_ASYNC_THREAD_FAILED`: UInt = 12047u;
public const val `ERROR_INTERNET_BAD_AUTO_PROXY_SCRIPT`: UInt = 12166u;
public const val `ERROR_INTERNET_BAD_OPTION_LENGTH`: UInt = 12010u;
public const val `ERROR_INTERNET_BAD_REGISTRY_PARAMETER`: UInt = 12022u;
public const val `ERROR_INTERNET_CACHE_SUCCESS`: UInt = 12906u;
public const val `ERROR_INTERNET_CANNOT_CONNECT`: UInt = 12029u;
public const val `ERROR_INTERNET_CHG_POST_IS_NON_SECURE`: UInt = 12042u;
public const val `ERROR_INTERNET_CLIENT_AUTH_CERT_NEEDED`: UInt = 12044u;
public const val `ERROR_INTERNET_CLIENT_AUTH_CERT_NEEDED_PROXY`: UInt = 12187u;
public const val `ERROR_INTERNET_CLIENT_AUTH_NOT_SETUP`: UInt = 12046u;
public const val `ERROR_INTERNET_CONNECTION_ABORTED`: UInt = 12030u;
public const val `ERROR_INTERNET_CONNECTION_AVAILABLE`: UInt = 12902u;
public const val `ERROR_INTERNET_CONNECTION_RESET`: UInt = 12031u;
public const val `ERROR_INTERNET_DECODING_FAILED`: UInt = 12175u;
public const val `ERROR_INTERNET_DIALOG_PENDING`: UInt = 12049u;
public const val `ERROR_INTERNET_DISALLOW_INPRIVATE`: UInt = 12189u;
public const val `ERROR_INTERNET_DISCONNECTED`: UInt = 12163u;
public const val `ERROR_INTERNET_EXTENDED_ERROR`: UInt = 12003u;
public const val `ERROR_INTERNET_FAILED_DUETOSECURITYCHECK`: UInt = 12171u;
public const val `ERROR_INTERNET_FEATURE_DISABLED`: UInt = 12192u;
public const val `ERROR_INTERNET_FORCE_RETRY`: UInt = 12032u;
public const val `ERROR_INTERNET_FORTEZZA_LOGIN_NEEDED`: UInt = 12054u;
public const val `ERROR_INTERNET_GLOBAL_CALLBACK_FAILED`: UInt = 12191u;
public const val `ERROR_INTERNET_HANDLE_EXISTS`: UInt = 12036u;
public const val `ERROR_INTERNET_HTTPS_HTTP_SUBMIT_REDIR`: UInt = 12052u;
public const val `ERROR_INTERNET_HTTPS_TO_HTTP_ON_REDIR`: UInt = 12040u;
public const val `ERROR_INTERNET_HTTP_PROTOCOL_MISMATCH`: UInt = 12190u;
public const val `ERROR_INTERNET_HTTP_TO_HTTPS_ON_REDIR`: UInt = 12039u;
public const val `ERROR_INTERNET_INCORRECT_FORMAT`: UInt = 12027u;
public const val `ERROR_INTERNET_INCORRECT_HANDLE_STATE`: UInt = 12019u;
public const val `ERROR_INTERNET_INCORRECT_HANDLE_TYPE`: UInt = 12018u;
public const val `ERROR_INTERNET_INCORRECT_PASSWORD`: UInt = 12014u;
public const val `ERROR_INTERNET_INCORRECT_USER_NAME`: UInt = 12013u;
public const val `ERROR_INTERNET_INSECURE_FALLBACK_REQUIRED`: UInt = 12059u;
public const val `ERROR_INTERNET_INSERT_CDROM`: UInt = 12053u;
public const val `ERROR_INTERNET_INTERNAL_ERROR`: UInt = 12004u;
public const val `ERROR_INTERNET_INTERNAL_SOCKET_ERROR`: UInt = 12901u;
public const val `ERROR_INTERNET_INVALID_CA`: UInt = 12045u;
public const val `ERROR_INTERNET_INVALID_OPERATION`: UInt = 12016u;
public const val `ERROR_INTERNET_INVALID_OPTION`: UInt = 12009u;
public const val `ERROR_INTERNET_INVALID_PROXY_REQUEST`: UInt = 12033u;
public const val `ERROR_INTERNET_INVALID_URL`: UInt = 12005u;
public const val `ERROR_INTERNET_ITEM_NOT_FOUND`: UInt = 12028u;
public const val `ERROR_INTERNET_LOGIN_FAILURE`: UInt = 12015u;
public const val `ERROR_INTERNET_LOGIN_FAILURE_DISPLAY_ENTITY_BODY`: UInt = 12174u;
public const val `ERROR_INTERNET_MIXED_SECURITY`: UInt = 12041u;
public const val `ERROR_INTERNET_NAME_NOT_RESOLVED`: UInt = 12007u;
public const val `ERROR_INTERNET_NEED_MSN_SSPI_PKG`: UInt = 12173u;
public const val `ERROR_INTERNET_NEED_UI`: UInt = 12034u;
public const val `ERROR_INTERNET_NOT_INITIALIZED`: UInt = 12172u;
public const val `ERROR_INTERNET_NOT_PROXY_REQUEST`: UInt = 12020u;
public const val `ERROR_INTERNET_NO_CALLBACK`: UInt = 12025u;
public const val `ERROR_INTERNET_NO_CM_CONNECTION`: UInt = 12080u;
public const val `ERROR_INTERNET_NO_CONTEXT`: UInt = 12024u;
public const val `ERROR_INTERNET_NO_DIRECT_ACCESS`: UInt = 12023u;
public const val `ERROR_INTERNET_NO_KNOWN_SERVERS`: UInt = 12903u;
public const val `ERROR_INTERNET_NO_NEW_CONTAINERS`: UInt = 12051u;
public const val `ERROR_INTERNET_NO_PING_SUPPORT`: UInt = 12905u;
public const val `ERROR_INTERNET_OFFLINE`: UInt = 12163u;
public const val `ERROR_INTERNET_OPERATION_CANCELLED`: UInt = 12017u;
public const val `ERROR_INTERNET_OPTION_NOT_SETTABLE`: UInt = 12011u;
public const val `ERROR_INTERNET_OUT_OF_HANDLES`: UInt = 12001u;
public const val `ERROR_INTERNET_PING_FAILED`: UInt = 12904u;
public const val `ERROR_INTERNET_POST_IS_NON_SECURE`: UInt = 12043u;
public const val `ERROR_INTERNET_PROTOCOL_NOT_FOUND`: UInt = 12008u;
public const val `ERROR_INTERNET_PROXY_ALERT`: UInt = 12061u;
public const val `ERROR_INTERNET_PROXY_SERVER_UNREACHABLE`: UInt = 12165u;
public const val `ERROR_INTERNET_REDIRECT_SCHEME_CHANGE`: UInt = 12048u;
public const val `ERROR_INTERNET_REGISTRY_VALUE_NOT_FOUND`: UInt = 12021u;
public const val `ERROR_INTERNET_REQUEST_PENDING`: UInt = 12026u;
public const val `ERROR_INTERNET_RETRY_DIALOG`: UInt = 12050u;
public const val `ERROR_INTERNET_SECURE_FAILURE_PROXY`: UInt = 12188u;
public const val `ERROR_INTERNET_SECURITY_CHANNEL_ERROR`: UInt = 12157u;
public const val `ERROR_INTERNET_SEC_CERT_CN_INVALID`: UInt = 12038u;
public const val `ERROR_INTERNET_SEC_CERT_DATE_INVALID`: UInt = 12037u;
public const val `ERROR_INTERNET_SEC_CERT_ERRORS`: UInt = 12055u;
public const val `ERROR_INTERNET_SEC_CERT_NO_REV`: UInt = 12056u;
public const val `ERROR_INTERNET_SEC_CERT_REVOKED`: UInt = 12170u;
public const val `ERROR_INTERNET_SEC_CERT_REV_FAILED`: UInt = 12057u;
public const val `ERROR_INTERNET_SEC_CERT_WEAK_SIGNATURE`: UInt = 12062u;
public const val `ERROR_INTERNET_SEC_INVALID_CERT`: UInt = 12169u;
public const val `ERROR_INTERNET_SERVER_UNREACHABLE`: UInt = 12164u;
public const val `ERROR_INTERNET_SHUTDOWN`: UInt = 12012u;
public const val `ERROR_INTERNET_SOURCE_PORT_IN_USE`: UInt = 12058u;
public const val `ERROR_INTERNET_TCPIP_NOT_INSTALLED`: UInt = 12159u;
public const val `ERROR_INTERNET_TIMEOUT`: UInt = 12002u;
public const val `ERROR_INTERNET_UNABLE_TO_CACHE_FILE`: UInt = 12158u;
public const val `ERROR_INTERNET_UNABLE_TO_DOWNLOAD_SCRIPT`: UInt = 12167u;
public const val `ERROR_INTERNET_UNRECOGNIZED_SCHEME`: UInt = 12006u;
public const val `FLAGS_ERROR_UI_FILTER_FOR_ERRORS`: UInt = 1u;
public const val `FLAGS_ERROR_UI_FLAGS_CHANGE_OPTIONS`: UInt = 2u;
public const val `FLAGS_ERROR_UI_FLAGS_GENERATE_DATA`: UInt = 4u;
public const val `FLAGS_ERROR_UI_FLAGS_NO_UI`: UInt = 8u;
public const val `FLAGS_ERROR_UI_SERIALIZE_DIALOGS`: UInt = 16u;
public const val `FLAGS_ERROR_UI_SHOW_IDN_HOSTNAME`: UInt = 32u;
public const val `FLAG_ICC_FORCE_CONNECTION`: UInt = 1u;
public typealias `FORTCMD` = Int;
public const val `FORTCMD_CHG_PERSONALITY`: `FORTCMD` = 3;
public const val `FORTCMD_LOGOFF`: `FORTCMD` = 2;
public const val `FORTCMD_LOGON`: `FORTCMD` = 1;
public typealias `FORTSTAT` = Int;
public const val `FORTSTAT_INSTALLED`: `FORTSTAT` = 1;
public const val `FORTSTAT_LOGGEDON`: `FORTSTAT` = 2;
public typealias `FTP_FLAGS` = UInt;
public const val `FTP_TRANSFER_TYPE_ASCII`: `FTP_FLAGS` = 1u;
public const val `FTP_TRANSFER_TYPE_BINARY`: `FTP_FLAGS` = 2u;
public const val `FTP_TRANSFER_TYPE_UNKNOWN`: `FTP_FLAGS` = 0u;
// UNSUPPORTED Rust 708:1: non-scalar type Ptr unsupported
// pub const GOPHER_ABSTRACT_ATTRIBUTE: windows_sys::core::PCWSTR = windows_sys::core::w!("Abstract");

// UNSUPPORTED Rust 709:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct GOPHER_ABSTRACT_ATTRIBUTE_TYPE {
//     pub ShortAbstract: *mut i8,
//     pub AbstractFile: *mut i8,
// }

// UNSUPPORTED Rust 715:1: declaration Impl has no candidate rule
// impl Default for GOPHER_ABSTRACT_ATTRIBUTE_TYPE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 720:1: non-scalar type Ptr unsupported
// pub const GOPHER_ABSTRACT_CATEGORY: windows_sys::core::PCWSTR = windows_sys::core::w!("+ABSTRACT");

// UNSUPPORTED Rust 721:1: non-scalar type Ptr unsupported
// pub const GOPHER_ADMIN_ATTRIBUTE: windows_sys::core::PCWSTR = windows_sys::core::w!("Admin");

// UNSUPPORTED Rust 722:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct GOPHER_ADMIN_ATTRIBUTE_TYPE {
//     pub Comment: *mut i8,
//     pub EmailAddress: *mut i8,
// }

// UNSUPPORTED Rust 728:1: declaration Impl has no candidate rule
// impl Default for GOPHER_ADMIN_ATTRIBUTE_TYPE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 733:1: non-scalar type Ptr unsupported
// pub const GOPHER_ADMIN_CATEGORY: windows_sys::core::PCWSTR = windows_sys::core::w!("+ADMIN");

// UNSUPPORTED Rust 734:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct GOPHER_ASK_ATTRIBUTE_TYPE {
//     pub QuestionType: *mut i8,
//     pub QuestionText: *mut i8,
// }

// UNSUPPORTED Rust 740:1: declaration Impl has no candidate rule
// impl Default for GOPHER_ASK_ATTRIBUTE_TYPE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 745:1: generic scalar type unsupported
// pub type GOPHER_ATTRIBUTE_ENUMERATOR = Option<unsafe extern "system" fn(lpattributeinfo: *const GOPHER_ATTRIBUTE_TYPE, dwerror: u32) -> windows_sys::core::BOOL>;

public const val `GOPHER_ATTRIBUTE_ID_ABSTRACT`: UInt = 2882325526u;
public const val `GOPHER_ATTRIBUTE_ID_ADMIN`: UInt = 2882325514u;
public const val `GOPHER_ATTRIBUTE_ID_ALL`: UInt = 2882325513u;
public const val `GOPHER_ATTRIBUTE_ID_BASE`: UInt = 2882325504u;
public const val `GOPHER_ATTRIBUTE_ID_GEOG`: UInt = 2882325522u;
public const val `GOPHER_ATTRIBUTE_ID_LOCATION`: UInt = 2882325521u;
public const val `GOPHER_ATTRIBUTE_ID_MOD_DATE`: UInt = 2882325515u;
public const val `GOPHER_ATTRIBUTE_ID_ORG`: UInt = 2882325520u;
public const val `GOPHER_ATTRIBUTE_ID_PROVIDER`: UInt = 2882325524u;
public const val `GOPHER_ATTRIBUTE_ID_RANGE`: UInt = 2882325518u;
public const val `GOPHER_ATTRIBUTE_ID_SCORE`: UInt = 2882325517u;
public const val `GOPHER_ATTRIBUTE_ID_SITE`: UInt = 2882325519u;
public const val `GOPHER_ATTRIBUTE_ID_TIMEZONE`: UInt = 2882325523u;
public const val `GOPHER_ATTRIBUTE_ID_TREEWALK`: UInt = 2882325528u;
public const val `GOPHER_ATTRIBUTE_ID_TTL`: UInt = 2882325516u;
public const val `GOPHER_ATTRIBUTE_ID_UNKNOWN`: UInt = 2882325529u;
public const val `GOPHER_ATTRIBUTE_ID_VERSION`: UInt = 2882325525u;
public const val `GOPHER_ATTRIBUTE_ID_VIEW`: UInt = 2882325527u;
// UNSUPPORTED Rust 764:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct GOPHER_ATTRIBUTE_TYPE {
//     pub CategoryId: u32,
//     pub AttributeId: u32,
//     pub AttributeType: GOPHER_ATTRIBUTE_TYPE_0,
// }

// UNSUPPORTED Rust 771:1: declaration Impl has no candidate rule
// impl Default for GOPHER_ATTRIBUTE_TYPE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 776:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union GOPHER_ATTRIBUTE_TYPE_0 {
//     pub Admin: GOPHER_ADMIN_ATTRIBUTE_TYPE,
//     pub ModDate: GOPHER_MOD_DATE_ATTRIBUTE_TYPE,
//     pub Ttl: GOPHER_TTL_ATTRIBUTE_TYPE,
//     pub Score: GOPHER_SCORE_ATTRIBUTE_TYPE,
//     pub ScoreRange: GOPHER_SCORE_RANGE_ATTRIBUTE_TYPE,
//     pub Site: GOPHER_SITE_ATTRIBUTE_TYPE,
//     pub Organization: GOPHER_ORGANIZATION_ATTRIBUTE_TYPE,
//     pub Location: GOPHER_LOCATION_ATTRIBUTE_TYPE,
//     pub GeographicalLocation: GOPHER_GEOGRAPHICAL_LOCATION_ATTRIBUTE_TYPE,
//     pub TimeZone: GOPHER_TIMEZONE_ATTRIBUTE_TYPE,
//     pub Provider: GOPHER_PROVIDER_ATTRIBUTE_TYPE,
//     pub Version: GOPHER_VERSION_ATTRIBUTE_TYPE,
//     pub Abstract: GOPHER_ABSTRACT_ATTRIBUTE_TYPE,
//     pub View: GOPHER_VIEW_ATTRIBUTE_TYPE,
//     pub Veronica: GOPHER_VERONICA_ATTRIBUTE_TYPE,
//     pub Ask: GOPHER_ASK_ATTRIBUTE_TYPE,
//     pub Unknown: GOPHER_UNKNOWN_ATTRIBUTE_TYPE,
// }

// UNSUPPORTED Rust 797:1: declaration Impl has no candidate rule
// impl Default for GOPHER_ATTRIBUTE_TYPE_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `GOPHER_CATEGORY_ID_ABSTRACT`: UInt = 2882325509u;
public const val `GOPHER_CATEGORY_ID_ADMIN`: UInt = 2882325507u;
public const val `GOPHER_CATEGORY_ID_ALL`: UInt = 2882325505u;
public const val `GOPHER_CATEGORY_ID_ASK`: UInt = 2882325511u;
public const val `GOPHER_CATEGORY_ID_INFO`: UInt = 2882325506u;
public const val `GOPHER_CATEGORY_ID_UNKNOWN`: UInt = 2882325512u;
public const val `GOPHER_CATEGORY_ID_VERONICA`: UInt = 2882325510u;
public const val `GOPHER_CATEGORY_ID_VIEWS`: UInt = 2882325508u;
// UNSUPPORTED Rust 810:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct GOPHER_FIND_DATAA {
//     pub DisplayString: [i8; 129],
//     pub GopherType: GOPHER_TYPE,
//     pub SizeLow: u32,
//     pub SizeHigh: u32,
//     pub LastModificationTime: super::super::Foundation::FILETIME,
//     pub Locator: [i8; 654],
// }

// UNSUPPORTED Rust 820:1: declaration Impl has no candidate rule
// impl Default for GOPHER_FIND_DATAA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 825:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct GOPHER_FIND_DATAW {
//     pub DisplayString: [u16; 129],
//     pub GopherType: GOPHER_TYPE,
//     pub SizeLow: u32,
//     pub SizeHigh: u32,
//     pub LastModificationTime: super::super::Foundation::FILETIME,
//     pub Locator: [u16; 654],
// }

// UNSUPPORTED Rust 835:1: declaration Impl has no candidate rule
// impl Default for GOPHER_FIND_DATAW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 840:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct GOPHER_GEOGRAPHICAL_LOCATION_ATTRIBUTE_TYPE {
//     pub DegreesNorth: i32,
//     pub MinutesNorth: i32,
//     pub SecondsNorth: i32,
//     pub DegreesEast: i32,
//     pub MinutesEast: i32,
//     pub SecondsEast: i32,
// }

// UNSUPPORTED Rust 850:1: non-scalar type Ptr unsupported
// pub const GOPHER_GEOG_ATTRIBUTE: windows_sys::core::PCWSTR = windows_sys::core::w!("Geog");

// UNSUPPORTED Rust 851:1: non-scalar type Ptr unsupported
// pub const GOPHER_INFO_CATEGORY: windows_sys::core::PCWSTR = windows_sys::core::w!("+INFO");

// UNSUPPORTED Rust 852:1: non-scalar type Ptr unsupported
// pub const GOPHER_LOCATION_ATTRIBUTE: windows_sys::core::PCWSTR = windows_sys::core::w!("Loc");

// UNSUPPORTED Rust 853:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct GOPHER_LOCATION_ATTRIBUTE_TYPE {
//     pub Location: *mut i8,
// }

// UNSUPPORTED Rust 858:1: declaration Impl has no candidate rule
// impl Default for GOPHER_LOCATION_ATTRIBUTE_TYPE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 863:1: non-scalar type Ptr unsupported
// pub const GOPHER_MOD_DATE_ATTRIBUTE: windows_sys::core::PCWSTR = windows_sys::core::w!("Mod-Date");

// UNSUPPORTED Rust 864:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct GOPHER_MOD_DATE_ATTRIBUTE_TYPE {
//     pub DateAndTime: super::super::Foundation::FILETIME,
// }

// UNSUPPORTED Rust 869:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct GOPHER_ORGANIZATION_ATTRIBUTE_TYPE {
//     pub Organization: *mut i8,
// }

// UNSUPPORTED Rust 874:1: declaration Impl has no candidate rule
// impl Default for GOPHER_ORGANIZATION_ATTRIBUTE_TYPE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 879:1: non-scalar type Ptr unsupported
// pub const GOPHER_ORG_ATTRIBUTE: windows_sys::core::PCWSTR = windows_sys::core::w!("Org");

// UNSUPPORTED Rust 880:1: non-scalar type Ptr unsupported
// pub const GOPHER_PROVIDER_ATTRIBUTE: windows_sys::core::PCWSTR = windows_sys::core::w!("Provider");

// UNSUPPORTED Rust 881:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct GOPHER_PROVIDER_ATTRIBUTE_TYPE {
//     pub Provider: *mut i8,
// }

// UNSUPPORTED Rust 886:1: declaration Impl has no candidate rule
// impl Default for GOPHER_PROVIDER_ATTRIBUTE_TYPE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 891:1: non-scalar type Ptr unsupported
// pub const GOPHER_RANGE_ATTRIBUTE: windows_sys::core::PCWSTR = windows_sys::core::w!("Score-range");

// UNSUPPORTED Rust 892:1: non-scalar type Ptr unsupported
// pub const GOPHER_SCORE_ATTRIBUTE: windows_sys::core::PCWSTR = windows_sys::core::w!("Score");

// UNSUPPORTED Rust 893:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct GOPHER_SCORE_ATTRIBUTE_TYPE {
//     pub Score: i32,
// }

// UNSUPPORTED Rust 898:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct GOPHER_SCORE_RANGE_ATTRIBUTE_TYPE {
//     pub LowerBound: i32,
//     pub UpperBound: i32,
// }

// UNSUPPORTED Rust 904:1: non-scalar type Ptr unsupported
// pub const GOPHER_SITE_ATTRIBUTE: windows_sys::core::PCWSTR = windows_sys::core::w!("Site");

// UNSUPPORTED Rust 905:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct GOPHER_SITE_ATTRIBUTE_TYPE {
//     pub Site: *mut i8,
// }

// UNSUPPORTED Rust 910:1: declaration Impl has no candidate rule
// impl Default for GOPHER_SITE_ATTRIBUTE_TYPE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 915:1: non-scalar type Ptr unsupported
// pub const GOPHER_TIMEZONE_ATTRIBUTE: windows_sys::core::PCWSTR = windows_sys::core::w!("TZ");

// UNSUPPORTED Rust 916:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct GOPHER_TIMEZONE_ATTRIBUTE_TYPE {
//     pub Zone: i32,
// }

// UNSUPPORTED Rust 921:1: non-scalar type Ptr unsupported
// pub const GOPHER_TREEWALK_ATTRIBUTE: windows_sys::core::PCWSTR = windows_sys::core::w!("treewalk");

// UNSUPPORTED Rust 922:1: non-scalar type Ptr unsupported
// pub const GOPHER_TTL_ATTRIBUTE: windows_sys::core::PCWSTR = windows_sys::core::w!("TTL");

// UNSUPPORTED Rust 923:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct GOPHER_TTL_ATTRIBUTE_TYPE {
//     pub Ttl: u32,
// }

public typealias `GOPHER_TYPE` = UInt;
public const val `GOPHER_TYPE_ASK`: `GOPHER_TYPE` = 1073741824u;
public const val `GOPHER_TYPE_BINARY`: `GOPHER_TYPE` = 512u;
public const val `GOPHER_TYPE_BITMAP`: `GOPHER_TYPE` = 16384u;
public const val `GOPHER_TYPE_CALENDAR`: `GOPHER_TYPE` = 524288u;
public const val `GOPHER_TYPE_CSO`: `GOPHER_TYPE` = 4u;
public const val `GOPHER_TYPE_DIRECTORY`: `GOPHER_TYPE` = 2u;
public const val `GOPHER_TYPE_DOS_ARCHIVE`: `GOPHER_TYPE` = 32u;
public const val `GOPHER_TYPE_ERROR`: `GOPHER_TYPE` = 8u;
public const val `GOPHER_TYPE_GIF`: `GOPHER_TYPE` = 4096u;
public const val `GOPHER_TYPE_GOPHER_PLUS`: `GOPHER_TYPE` = 2147483648u;
public const val `GOPHER_TYPE_HTML`: `GOPHER_TYPE` = 131072u;
public const val `GOPHER_TYPE_IMAGE`: `GOPHER_TYPE` = 8192u;
public const val `GOPHER_TYPE_INDEX_SERVER`: `GOPHER_TYPE` = 128u;
public const val `GOPHER_TYPE_INLINE`: `GOPHER_TYPE` = 1048576u;
public const val `GOPHER_TYPE_MAC_BINHEX`: `GOPHER_TYPE` = 16u;
public const val `GOPHER_TYPE_MOVIE`: `GOPHER_TYPE` = 32768u;
public const val `GOPHER_TYPE_PDF`: `GOPHER_TYPE` = 262144u;
public const val `GOPHER_TYPE_REDUNDANT`: `GOPHER_TYPE` = 1024u;
public const val `GOPHER_TYPE_SOUND`: `GOPHER_TYPE` = 65536u;
public const val `GOPHER_TYPE_TELNET`: `GOPHER_TYPE` = 256u;
public const val `GOPHER_TYPE_TEXT_FILE`: `GOPHER_TYPE` = 1u;
public const val `GOPHER_TYPE_TN3270`: `GOPHER_TYPE` = 2048u;
public const val `GOPHER_TYPE_UNIX_UUENCODED`: `GOPHER_TYPE` = 64u;
public const val `GOPHER_TYPE_UNKNOWN`: `GOPHER_TYPE` = 536870912u;
// UNSUPPORTED Rust 953:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct GOPHER_UNKNOWN_ATTRIBUTE_TYPE {
//     pub Text: *mut i8,
// }

// UNSUPPORTED Rust 958:1: declaration Impl has no candidate rule
// impl Default for GOPHER_UNKNOWN_ATTRIBUTE_TYPE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 963:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct GOPHER_VERONICA_ATTRIBUTE_TYPE {
//     pub TreeWalk: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 968:1: non-scalar type Ptr unsupported
// pub const GOPHER_VERONICA_CATEGORY: windows_sys::core::PCWSTR = windows_sys::core::w!("+VERONICA");

// UNSUPPORTED Rust 969:1: non-scalar type Ptr unsupported
// pub const GOPHER_VERSION_ATTRIBUTE: windows_sys::core::PCWSTR = windows_sys::core::w!("Version");

// UNSUPPORTED Rust 970:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct GOPHER_VERSION_ATTRIBUTE_TYPE {
//     pub Version: *mut i8,
// }

// UNSUPPORTED Rust 975:1: declaration Impl has no candidate rule
// impl Default for GOPHER_VERSION_ATTRIBUTE_TYPE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 980:1: non-scalar type Ptr unsupported
// pub const GOPHER_VIEWS_CATEGORY: windows_sys::core::PCWSTR = windows_sys::core::w!("+VIEWS");

// UNSUPPORTED Rust 981:1: non-scalar type Ptr unsupported
// pub const GOPHER_VIEW_ATTRIBUTE: windows_sys::core::PCWSTR = windows_sys::core::w!("View");

// UNSUPPORTED Rust 982:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct GOPHER_VIEW_ATTRIBUTE_TYPE {
//     pub ContentType: *mut i8,
//     pub Language: *mut i8,
//     pub Size: u32,
// }

// UNSUPPORTED Rust 989:1: declaration Impl has no candidate rule
// impl Default for GOPHER_VIEW_ATTRIBUTE_TYPE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `GROUPNAME_MAX_LENGTH`: UInt = 120u;
public const val `GROUP_OWNER_STORAGE_SIZE`: UInt = 4u;
public const val `HSR_ASYNC`: UInt = 1u;
public const val `HSR_CHUNKED`: UInt = 32u;
public const val `HSR_DOWNLOAD`: UInt = 16u;
public const val `HSR_INITIATE`: UInt = 8u;
public const val `HSR_SYNC`: UInt = 4u;
public const val `HSR_USE_CONTEXT`: UInt = 8u;
public const val `HTTP_1_1_CACHE_ENTRY`: UInt = 64u;
public typealias `HTTP_ADDREQ_FLAG` = UInt;
public const val `HTTP_ADDREQ_FLAGS_MASK`: UInt = 4294901760u;
public const val `HTTP_ADDREQ_FLAG_ADD`: `HTTP_ADDREQ_FLAG` = 536870912u;
public const val `HTTP_ADDREQ_FLAG_ADD_IF_NEW`: `HTTP_ADDREQ_FLAG` = 268435456u;
public const val `HTTP_ADDREQ_FLAG_ALLOW_EMPTY_VALUES`: UInt = 67108864u;
public const val `HTTP_ADDREQ_FLAG_COALESCE`: `HTTP_ADDREQ_FLAG` = 1073741824u;
public const val `HTTP_ADDREQ_FLAG_COALESCE_WITH_COMMA`: `HTTP_ADDREQ_FLAG` = 1073741824u;
public const val `HTTP_ADDREQ_FLAG_COALESCE_WITH_SEMICOLON`: `HTTP_ADDREQ_FLAG` = 16777216u;
public const val `HTTP_ADDREQ_FLAG_REPLACE`: `HTTP_ADDREQ_FLAG` = 2147483648u;
public const val `HTTP_ADDREQ_FLAG_RESPONSE_HEADERS`: UInt = 33554432u;
public const val `HTTP_ADDREQ_INDEX_MASK`: UInt = 65535u;
public const val `HTTP_COOKIES_SAME_SITE_LEVEL_CROSS_SITE`: UInt = 3u;
public const val `HTTP_COOKIES_SAME_SITE_LEVEL_CROSS_SITE_LAX`: UInt = 2u;
public const val `HTTP_COOKIES_SAME_SITE_LEVEL_MAX`: UInt = 3u;
public const val `HTTP_COOKIES_SAME_SITE_LEVEL_SAME_SITE`: UInt = 1u;
public const val `HTTP_COOKIES_SAME_SITE_LEVEL_UNKNOWN`: UInt = 0u;
public const val `HTTP_MAJOR_VERSION`: UInt = 1u;
public const val `HTTP_MINOR_VERSION`: UInt = 0u;
// UNSUPPORTED Rust 1021:1: generic scalar type unsupported
// pub type HTTP_POLICY_EXTENSION_INIT = Option<unsafe extern "system" fn(version: HTTP_POLICY_EXTENSION_VERSION, r#type: HTTP_POLICY_EXTENSION_TYPE, pvdata: *const core::ffi::c_void, cbdata: u32) -> u32>;

// UNSUPPORTED Rust 1022:1: generic scalar type unsupported
// pub type HTTP_POLICY_EXTENSION_SHUTDOWN = Option<unsafe extern "system" fn(r#type: HTTP_POLICY_EXTENSION_TYPE) -> u32>;

public typealias `HTTP_POLICY_EXTENSION_TYPE` = Int;
public typealias `HTTP_POLICY_EXTENSION_VERSION` = Int;
public const val `HTTP_PROTOCOL_FLAG_HTTP2`: UInt = 2u;
public const val `HTTP_PROTOCOL_MASK`: UInt = 2u;
// UNSUPPORTED Rust 1027:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct HTTP_PUSH_NOTIFICATION_STATUS {
//     pub ChannelStatusValid: windows_sys::core::BOOL,
//     pub ChannelStatus: u32,
// }

// UNSUPPORTED Rust 1033:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct HTTP_PUSH_TRANSPORT_SETTING {
//     pub TransportSettingId: windows_sys::core::GUID,
//     pub BrokerEventId: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 1039:1: non-scalar type Ptr unsupported
// pub type HTTP_PUSH_WAIT_HANDLE = *mut core::ffi::c_void;

public typealias `HTTP_PUSH_WAIT_TYPE` = Int;
public const val `HTTP_QUERY_ACCEPT`: UInt = 24u;
public const val `HTTP_QUERY_ACCEPT_CHARSET`: UInt = 25u;
public const val `HTTP_QUERY_ACCEPT_ENCODING`: UInt = 26u;
public const val `HTTP_QUERY_ACCEPT_LANGUAGE`: UInt = 27u;
public const val `HTTP_QUERY_ACCEPT_RANGES`: UInt = 42u;
public const val `HTTP_QUERY_AGE`: UInt = 48u;
public const val `HTTP_QUERY_ALLOW`: UInt = 7u;
public const val `HTTP_QUERY_AUTHENTICATION_INFO`: UInt = 76u;
public const val `HTTP_QUERY_AUTHORIZATION`: UInt = 28u;
public const val `HTTP_QUERY_CACHE_CONTROL`: UInt = 49u;
public const val `HTTP_QUERY_CONNECTION`: UInt = 23u;
public const val `HTTP_QUERY_CONTENT_BASE`: UInt = 50u;
public const val `HTTP_QUERY_CONTENT_DESCRIPTION`: UInt = 4u;
public const val `HTTP_QUERY_CONTENT_DISPOSITION`: UInt = 47u;
public const val `HTTP_QUERY_CONTENT_ENCODING`: UInt = 29u;
public const val `HTTP_QUERY_CONTENT_ID`: UInt = 3u;
public const val `HTTP_QUERY_CONTENT_LANGUAGE`: UInt = 6u;
public const val `HTTP_QUERY_CONTENT_LENGTH`: UInt = 5u;
public const val `HTTP_QUERY_CONTENT_LOCATION`: UInt = 51u;
public const val `HTTP_QUERY_CONTENT_MD5`: UInt = 52u;
public const val `HTTP_QUERY_CONTENT_RANGE`: UInt = 53u;
public const val `HTTP_QUERY_CONTENT_TRANSFER_ENCODING`: UInt = 2u;
public const val `HTTP_QUERY_CONTENT_TYPE`: UInt = 1u;
public const val `HTTP_QUERY_COOKIE`: UInt = 44u;
public const val `HTTP_QUERY_COST`: UInt = 15u;
public const val `HTTP_QUERY_CUSTOM`: UInt = 65535u;
public const val `HTTP_QUERY_DATE`: UInt = 9u;
public const val `HTTP_QUERY_DEFAULT_STYLE`: UInt = 84u;
public const val `HTTP_QUERY_DERIVED_FROM`: UInt = 14u;
public const val `HTTP_QUERY_DO_NOT_TRACK`: UInt = 88u;
public const val `HTTP_QUERY_ECHO_HEADERS`: UInt = 73u;
public const val `HTTP_QUERY_ECHO_HEADERS_CRLF`: UInt = 74u;
public const val `HTTP_QUERY_ECHO_REPLY`: UInt = 72u;
public const val `HTTP_QUERY_ECHO_REQUEST`: UInt = 71u;
public const val `HTTP_QUERY_ETAG`: UInt = 54u;
public const val `HTTP_QUERY_EXPECT`: UInt = 68u;
public const val `HTTP_QUERY_EXPIRES`: UInt = 10u;
public const val `HTTP_QUERY_FLAG_COALESCE`: UInt = 268435456u;
public const val `HTTP_QUERY_FLAG_COALESCE_WITH_COMMA`: UInt = 67108864u;
public const val `HTTP_QUERY_FLAG_NUMBER`: UInt = 536870912u;
public const val `HTTP_QUERY_FLAG_NUMBER64`: UInt = 134217728u;
public const val `HTTP_QUERY_FLAG_REQUEST_HEADERS`: UInt = 2147483648u;
public const val `HTTP_QUERY_FLAG_SYSTEMTIME`: UInt = 1073741824u;
public const val `HTTP_QUERY_FORWARDED`: UInt = 30u;
public const val `HTTP_QUERY_FROM`: UInt = 31u;
public const val `HTTP_QUERY_HOST`: UInt = 55u;
public const val `HTTP_QUERY_HTTP2_SETTINGS`: UInt = 90u;
public const val `HTTP_QUERY_IF_MATCH`: UInt = 56u;
public const val `HTTP_QUERY_IF_MODIFIED_SINCE`: UInt = 32u;
public const val `HTTP_QUERY_IF_NONE_MATCH`: UInt = 57u;
public const val `HTTP_QUERY_IF_RANGE`: UInt = 58u;
public const val `HTTP_QUERY_IF_UNMODIFIED_SINCE`: UInt = 59u;
public const val `HTTP_QUERY_INCLUDE_REFERER_TOKEN_BINDING_ID`: UInt = 93u;
public const val `HTTP_QUERY_INCLUDE_REFERRED_TOKEN_BINDING_ID`: UInt = 93u;
public const val `HTTP_QUERY_KEEP_ALIVE`: UInt = 89u;
public const val `HTTP_QUERY_LAST_MODIFIED`: UInt = 11u;
public const val `HTTP_QUERY_LINK`: UInt = 16u;
public const val `HTTP_QUERY_LOCATION`: UInt = 33u;
public const val `HTTP_QUERY_MAX`: UInt = 95u;
public const val `HTTP_QUERY_MAX_FORWARDS`: UInt = 60u;
public const val `HTTP_QUERY_MESSAGE_ID`: UInt = 12u;
public const val `HTTP_QUERY_MIME_VERSION`: UInt = 0u;
public const val `HTTP_QUERY_ORIG_URI`: UInt = 34u;
public const val `HTTP_QUERY_P3P`: UInt = 80u;
public const val `HTTP_QUERY_PASSPORT_CONFIG`: UInt = 78u;
public const val `HTTP_QUERY_PASSPORT_URLS`: UInt = 77u;
public const val `HTTP_QUERY_PRAGMA`: UInt = 17u;
public const val `HTTP_QUERY_PROXY_AUTHENTICATE`: UInt = 41u;
public const val `HTTP_QUERY_PROXY_AUTHORIZATION`: UInt = 61u;
public const val `HTTP_QUERY_PROXY_CONNECTION`: UInt = 69u;
public const val `HTTP_QUERY_PROXY_SUPPORT`: UInt = 75u;
public const val `HTTP_QUERY_PUBLIC`: UInt = 8u;
public const val `HTTP_QUERY_PUBLIC_KEY_PINS`: UInt = 94u;
public const val `HTTP_QUERY_PUBLIC_KEY_PINS_REPORT_ONLY`: UInt = 95u;
public const val `HTTP_QUERY_RANGE`: UInt = 62u;
public const val `HTTP_QUERY_RAW_HEADERS`: UInt = 21u;
public const val `HTTP_QUERY_RAW_HEADERS_CRLF`: UInt = 22u;
public const val `HTTP_QUERY_REFERER`: UInt = 35u;
public const val `HTTP_QUERY_REFRESH`: UInt = 46u;
public const val `HTTP_QUERY_REQUEST_METHOD`: UInt = 45u;
public const val `HTTP_QUERY_RETRY_AFTER`: UInt = 36u;
public const val `HTTP_QUERY_SERVER`: UInt = 37u;
public const val `HTTP_QUERY_SET_COOKIE`: UInt = 43u;
public const val `HTTP_QUERY_SET_COOKIE2`: UInt = 87u;
public const val `HTTP_QUERY_STATUS_CODE`: UInt = 19u;
public const val `HTTP_QUERY_STATUS_TEXT`: UInt = 20u;
public const val `HTTP_QUERY_STRICT_TRANSPORT_SECURITY`: UInt = 91u;
public const val `HTTP_QUERY_TITLE`: UInt = 38u;
public const val `HTTP_QUERY_TOKEN_BINDING`: UInt = 92u;
public const val `HTTP_QUERY_TRANSFER_ENCODING`: UInt = 63u;
public const val `HTTP_QUERY_TRANSLATE`: UInt = 82u;
public const val `HTTP_QUERY_UNLESS_MODIFIED_SINCE`: UInt = 70u;
public const val `HTTP_QUERY_UPGRADE`: UInt = 64u;
public const val `HTTP_QUERY_URI`: UInt = 13u;
public const val `HTTP_QUERY_USER_AGENT`: UInt = 39u;
public const val `HTTP_QUERY_VARY`: UInt = 65u;
public const val `HTTP_QUERY_VERSION`: UInt = 18u;
public const val `HTTP_QUERY_VIA`: UInt = 66u;
public const val `HTTP_QUERY_WARNING`: UInt = 67u;
public const val `HTTP_QUERY_WWW_AUTHENTICATE`: UInt = 40u;
public const val `HTTP_QUERY_X_CONTENT_TYPE_OPTIONS`: UInt = 79u;
public const val `HTTP_QUERY_X_FRAME_OPTIONS`: UInt = 85u;
public const val `HTTP_QUERY_X_P2P_PEERDIST`: UInt = 81u;
public const val `HTTP_QUERY_X_UA_COMPATIBLE`: UInt = 83u;
public const val `HTTP_QUERY_X_XSS_PROTECTION`: UInt = 86u;
// UNSUPPORTED Rust 1146:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct HTTP_REQUEST_TIMES {
//     pub cTimes: u32,
//     pub rgTimes: [u64; 32],
// }

// UNSUPPORTED Rust 1152:1: declaration Impl has no candidate rule
// impl Default for HTTP_REQUEST_TIMES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `HTTP_STATUS_MISDIRECTED_REQUEST`: UInt = 421u;
// UNSUPPORTED Rust 1158:1: non-scalar type Ptr unsupported
// pub const HTTP_VERSIONA: windows_sys::core::PCSTR = windows_sys::core::s!("HTTP/1.0");

// UNSUPPORTED Rust 1159:1: non-scalar type Ptr unsupported
// pub const HTTP_VERSIONW: windows_sys::core::PCWSTR = windows_sys::core::w!("HTTP/1.0");

public const val `HTTP_WEB_SOCKET_ABORTED_CLOSE_STATUS`: `HTTP_WEB_SOCKET_CLOSE_STATUS` = 1006;
// UNSUPPORTED Rust 1161:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct HTTP_WEB_SOCKET_ASYNC_RESULT {
//     pub AsyncResult: INTERNET_ASYNC_RESULT,
//     pub Operation: HTTP_WEB_SOCKET_OPERATION,
//     pub BufferType: HTTP_WEB_SOCKET_BUFFER_TYPE,
//     pub dwBytesTransferred: u32,
// }

public const val `HTTP_WEB_SOCKET_BINARY_FRAGMENT_TYPE`: `HTTP_WEB_SOCKET_BUFFER_TYPE` = 1;
public const val `HTTP_WEB_SOCKET_BINARY_MESSAGE_TYPE`: `HTTP_WEB_SOCKET_BUFFER_TYPE` = 0;
public typealias `HTTP_WEB_SOCKET_BUFFER_TYPE` = Int;
public const val `HTTP_WEB_SOCKET_CLOSE_OPERATION`: `HTTP_WEB_SOCKET_OPERATION` = 2;
public typealias `HTTP_WEB_SOCKET_CLOSE_STATUS` = Int;
public const val `HTTP_WEB_SOCKET_CLOSE_TYPE`: `HTTP_WEB_SOCKET_BUFFER_TYPE` = 4;
public const val `HTTP_WEB_SOCKET_EMPTY_CLOSE_STATUS`: `HTTP_WEB_SOCKET_CLOSE_STATUS` = 1005;
public const val `HTTP_WEB_SOCKET_ENDPOINT_TERMINATED_CLOSE_STATUS`: `HTTP_WEB_SOCKET_CLOSE_STATUS` = 1001;
public const val `HTTP_WEB_SOCKET_INVALID_DATA_TYPE_CLOSE_STATUS`: `HTTP_WEB_SOCKET_CLOSE_STATUS` = 1003;
public const val `HTTP_WEB_SOCKET_INVALID_PAYLOAD_CLOSE_STATUS`: `HTTP_WEB_SOCKET_CLOSE_STATUS` = 1007;
public const val `HTTP_WEB_SOCKET_MAX_CLOSE_REASON_LENGTH`: UInt = 123u;
public const val `HTTP_WEB_SOCKET_MESSAGE_TOO_BIG_CLOSE_STATUS`: `HTTP_WEB_SOCKET_CLOSE_STATUS` = 1009;
public const val `HTTP_WEB_SOCKET_MIN_KEEPALIVE_VALUE`: UInt = 10000u;
public typealias `HTTP_WEB_SOCKET_OPERATION` = Int;
public const val `HTTP_WEB_SOCKET_PING_TYPE`: `HTTP_WEB_SOCKET_BUFFER_TYPE` = 5;
public const val `HTTP_WEB_SOCKET_POLICY_VIOLATION_CLOSE_STATUS`: `HTTP_WEB_SOCKET_CLOSE_STATUS` = 1008;
public const val `HTTP_WEB_SOCKET_PROTOCOL_ERROR_CLOSE_STATUS`: `HTTP_WEB_SOCKET_CLOSE_STATUS` = 1002;
public const val `HTTP_WEB_SOCKET_RECEIVE_OPERATION`: `HTTP_WEB_SOCKET_OPERATION` = 1;
public const val `HTTP_WEB_SOCKET_SECURE_HANDSHAKE_ERROR_CLOSE_STATUS`: `HTTP_WEB_SOCKET_CLOSE_STATUS` = 1015;
public const val `HTTP_WEB_SOCKET_SEND_OPERATION`: `HTTP_WEB_SOCKET_OPERATION` = 0;
public const val `HTTP_WEB_SOCKET_SERVER_ERROR_CLOSE_STATUS`: `HTTP_WEB_SOCKET_CLOSE_STATUS` = 1011;
public const val `HTTP_WEB_SOCKET_SHUTDOWN_OPERATION`: `HTTP_WEB_SOCKET_OPERATION` = 3;
public const val `HTTP_WEB_SOCKET_SUCCESS_CLOSE_STATUS`: `HTTP_WEB_SOCKET_CLOSE_STATUS` = 1000;
public const val `HTTP_WEB_SOCKET_UNSUPPORTED_EXTENSIONS_CLOSE_STATUS`: `HTTP_WEB_SOCKET_CLOSE_STATUS` = 1010;
public const val `HTTP_WEB_SOCKET_UTF8_FRAGMENT_TYPE`: `HTTP_WEB_SOCKET_BUFFER_TYPE` = 3;
public const val `HTTP_WEB_SOCKET_UTF8_MESSAGE_TYPE`: `HTTP_WEB_SOCKET_BUFFER_TYPE` = 2;
public const val `HttpPushWaitEnableComplete`: `HTTP_PUSH_WAIT_TYPE` = 0;
public const val `HttpPushWaitReceiveComplete`: `HTTP_PUSH_WAIT_TYPE` = 1;
public const val `HttpPushWaitSendComplete`: `HTTP_PUSH_WAIT_TYPE` = 2;
public const val `HttpRequestTimeMax`: `REQUEST_TIMES` = 32;
public const val `ICU_USERNAME`: UInt = 1073741824u;
public const val `IDENTITY_CACHE_ENTRY`: UInt = 2147483648u;
public const val `IDSI_FLAG_KEEP_ALIVE`: UInt = 1u;
public const val `IDSI_FLAG_PROXY`: UInt = 4u;
public const val `IDSI_FLAG_SECURE`: UInt = 2u;
public const val `IDSI_FLAG_TUNNEL`: UInt = 8u;
public const val `IMMUTABLE_CACHE_ENTRY`: UInt = 524288u;
public const val `INSTALLED_CACHE_ENTRY`: UInt = 268435456u;
public const val `INTERENT_GOONLINE_MASK`: UInt = 3u;
public const val `INTERENT_GOONLINE_NOPROMPT`: UInt = 2u;
public const val `INTERENT_GOONLINE_REFRESH`: UInt = 1u;
public typealias `INTERNET_ACCESS_TYPE` = UInt;
// UNSUPPORTED Rust 1211:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct INTERNET_ASYNC_RESULT {
//     pub dwResult: usize,
//     pub dwError: u32,
// }

// UNSUPPORTED Rust 1217:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct INTERNET_AUTH_NOTIFY_DATA {
//     pub cbStruct: u32,
//     pub dwOptions: u32,
//     pub pfnNotify: PFN_AUTH_NOTIFY,
//     pub dwContext: usize,
// }

public const val `INTERNET_AUTH_SCHEME_BASIC`: UInt = 0u;
public const val `INTERNET_AUTH_SCHEME_DIGEST`: UInt = 1u;
public const val `INTERNET_AUTH_SCHEME_KERBEROS`: UInt = 3u;
public const val `INTERNET_AUTH_SCHEME_NEGOTIATE`: UInt = 4u;
public const val `INTERNET_AUTH_SCHEME_NTLM`: UInt = 2u;
public const val `INTERNET_AUTH_SCHEME_PASSPORT`: UInt = 5u;
public const val `INTERNET_AUTH_SCHEME_UNKNOWN`: UInt = 6u;
public typealias `INTERNET_AUTODIAL` = UInt;
public const val `INTERNET_AUTODIAL_FAILIFSECURITYCHECK`: `INTERNET_AUTODIAL` = 4u;
public const val `INTERNET_AUTODIAL_FORCE_ONLINE`: `INTERNET_AUTODIAL` = 1u;
public const val `INTERNET_AUTODIAL_FORCE_UNATTENDED`: `INTERNET_AUTODIAL` = 2u;
public const val `INTERNET_AUTODIAL_OVERRIDE_NET_PRESENT`: `INTERNET_AUTODIAL` = 8u;
public const val `INTERNET_AUTOPROXY_INIT_DEFAULT`: UInt = 1u;
public const val `INTERNET_AUTOPROXY_INIT_DOWNLOADSYNC`: UInt = 2u;
public const val `INTERNET_AUTOPROXY_INIT_ONLYQUERY`: UInt = 8u;
public const val `INTERNET_AUTOPROXY_INIT_QUERYSTATE`: UInt = 4u;
// UNSUPPORTED Rust 1241:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct INTERNET_BUFFERSA {
//     pub dwStructSize: u32,
//     pub Next: *mut INTERNET_BUFFERSA,
//     pub lpcszHeader: windows_sys::core::PCSTR,
//     pub dwHeadersLength: u32,
//     pub dwHeadersTotal: u32,
//     pub lpvBuffer: *mut core::ffi::c_void,
//     pub dwBufferLength: u32,
//     pub dwBufferTotal: u32,
//     pub dwOffsetLow: u32,
//     pub dwOffsetHigh: u32,
// }

// UNSUPPORTED Rust 1255:1: declaration Impl has no candidate rule
// impl Default for INTERNET_BUFFERSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1260:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct INTERNET_BUFFERSW {
//     pub dwStructSize: u32,
//     pub Next: *mut INTERNET_BUFFERSW,
//     pub lpcszHeader: windows_sys::core::PCWSTR,
//     pub dwHeadersLength: u32,
//     pub dwHeadersTotal: u32,
//     pub lpvBuffer: *mut core::ffi::c_void,
//     pub dwBufferLength: u32,
//     pub dwBufferTotal: u32,
//     pub dwOffsetLow: u32,
//     pub dwOffsetHigh: u32,
// }

// UNSUPPORTED Rust 1274:1: declaration Impl has no candidate rule
// impl Default for INTERNET_BUFFERSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1279:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct INTERNET_CACHE_CONFIG_INFOA {
//     pub dwStructSize: u32,
//     pub dwContainer: u32,
//     pub dwQuota: u32,
//     pub dwReserved4: u32,
//     pub fPerUser: windows_sys::core::BOOL,
//     pub dwSyncMode: u32,
//     pub dwNumCachePaths: u32,
//     pub Anonymous: INTERNET_CACHE_CONFIG_INFOA_0,
//     pub dwNormalUsage: u32,
//     pub dwExemptUsage: u32,
// }

// UNSUPPORTED Rust 1293:1: declaration Impl has no candidate rule
// impl Default for INTERNET_CACHE_CONFIG_INFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1298:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union INTERNET_CACHE_CONFIG_INFOA_0 {
//     pub Anonymous: INTERNET_CACHE_CONFIG_INFOA_0_0,
//     pub CachePaths: [INTERNET_CACHE_CONFIG_PATH_ENTRYA; 1],
// }

// UNSUPPORTED Rust 1304:1: declaration Impl has no candidate rule
// impl Default for INTERNET_CACHE_CONFIG_INFOA_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1309:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct INTERNET_CACHE_CONFIG_INFOA_0_0 {
//     pub CachePath: [i8; 260],
//     pub dwCacheSize: u32,
// }

// UNSUPPORTED Rust 1315:1: declaration Impl has no candidate rule
// impl Default for INTERNET_CACHE_CONFIG_INFOA_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1320:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct INTERNET_CACHE_CONFIG_INFOW {
//     pub dwStructSize: u32,
//     pub dwContainer: u32,
//     pub dwQuota: u32,
//     pub dwReserved4: u32,
//     pub fPerUser: windows_sys::core::BOOL,
//     pub dwSyncMode: u32,
//     pub dwNumCachePaths: u32,
//     pub Anonymous: INTERNET_CACHE_CONFIG_INFOW_0,
//     pub dwNormalUsage: u32,
//     pub dwExemptUsage: u32,
// }

// UNSUPPORTED Rust 1334:1: declaration Impl has no candidate rule
// impl Default for INTERNET_CACHE_CONFIG_INFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1339:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union INTERNET_CACHE_CONFIG_INFOW_0 {
//     pub Anonymous: INTERNET_CACHE_CONFIG_INFOW_0_0,
//     pub CachePaths: [INTERNET_CACHE_CONFIG_PATH_ENTRYW; 1],
// }

// UNSUPPORTED Rust 1345:1: declaration Impl has no candidate rule
// impl Default for INTERNET_CACHE_CONFIG_INFOW_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1350:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct INTERNET_CACHE_CONFIG_INFOW_0_0 {
//     pub CachePath: [u16; 260],
//     pub dwCacheSize: u32,
// }

// UNSUPPORTED Rust 1356:1: declaration Impl has no candidate rule
// impl Default for INTERNET_CACHE_CONFIG_INFOW_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1361:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct INTERNET_CACHE_CONFIG_PATH_ENTRYA {
//     pub CachePath: [i8; 260],
//     pub dwCacheSize: u32,
// }

// UNSUPPORTED Rust 1367:1: declaration Impl has no candidate rule
// impl Default for INTERNET_CACHE_CONFIG_PATH_ENTRYA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1372:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct INTERNET_CACHE_CONFIG_PATH_ENTRYW {
//     pub CachePath: [u16; 260],
//     pub dwCacheSize: u32,
// }

// UNSUPPORTED Rust 1378:1: declaration Impl has no candidate rule
// impl Default for INTERNET_CACHE_CONFIG_PATH_ENTRYW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `INTERNET_CACHE_CONTAINER_AUTODELETE`: UInt = 2u;
public const val `INTERNET_CACHE_CONTAINER_BLOOM_FILTER`: UInt = 32u;
// UNSUPPORTED Rust 1385:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct INTERNET_CACHE_CONTAINER_INFOA {
//     pub dwCacheVersion: u32,
//     pub lpszName: windows_sys::core::PSTR,
//     pub lpszCachePrefix: windows_sys::core::PSTR,
//     pub lpszVolumeLabel: windows_sys::core::PSTR,
//     pub lpszVolumeTitle: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 1394:1: declaration Impl has no candidate rule
// impl Default for INTERNET_CACHE_CONTAINER_INFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1399:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct INTERNET_CACHE_CONTAINER_INFOW {
//     pub dwCacheVersion: u32,
//     pub lpszName: windows_sys::core::PWSTR,
//     pub lpszCachePrefix: windows_sys::core::PWSTR,
//     pub lpszVolumeLabel: windows_sys::core::PWSTR,
//     pub lpszVolumeTitle: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 1408:1: declaration Impl has no candidate rule
// impl Default for INTERNET_CACHE_CONTAINER_INFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `INTERNET_CACHE_CONTAINER_MAP_ENABLED`: UInt = 16u;
public const val `INTERNET_CACHE_CONTAINER_NODESKTOPINIT`: UInt = 8u;
public const val `INTERNET_CACHE_CONTAINER_NOSUBDIRS`: UInt = 1u;
public const val `INTERNET_CACHE_CONTAINER_RESERVED1`: UInt = 4u;
public const val `INTERNET_CACHE_CONTAINER_SHARE_READ`: UInt = 256u;
public const val `INTERNET_CACHE_CONTAINER_SHARE_READ_WRITE`: UInt = 768u;
// UNSUPPORTED Rust 1419:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct INTERNET_CACHE_ENTRY_INFOA {
//     pub dwStructSize: u32,
//     pub lpszSourceUrlName: windows_sys::core::PSTR,
//     pub lpszLocalFileName: windows_sys::core::PSTR,
//     pub CacheEntryType: u32,
//     pub dwUseCount: u32,
//     pub dwHitRate: u32,
//     pub dwSizeLow: u32,
//     pub dwSizeHigh: u32,
//     pub LastModifiedTime: super::super::Foundation::FILETIME,
//     pub ExpireTime: super::super::Foundation::FILETIME,
//     pub LastAccessTime: super::super::Foundation::FILETIME,
//     pub LastSyncTime: super::super::Foundation::FILETIME,
//     pub lpHeaderInfo: windows_sys::core::PSTR,
//     pub dwHeaderInfoSize: u32,
//     pub lpszFileExtension: windows_sys::core::PSTR,
//     pub Anonymous: INTERNET_CACHE_ENTRY_INFOA_0,
// }

// UNSUPPORTED Rust 1439:1: declaration Impl has no candidate rule
// impl Default for INTERNET_CACHE_ENTRY_INFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1444:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union INTERNET_CACHE_ENTRY_INFOA_0 {
//     pub dwReserved: u32,
//     pub dwExemptDelta: u32,
// }

// UNSUPPORTED Rust 1450:1: declaration Impl has no candidate rule
// impl Default for INTERNET_CACHE_ENTRY_INFOA_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1455:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct INTERNET_CACHE_ENTRY_INFOW {
//     pub dwStructSize: u32,
//     pub lpszSourceUrlName: windows_sys::core::PWSTR,
//     pub lpszLocalFileName: windows_sys::core::PWSTR,
//     pub CacheEntryType: u32,
//     pub dwUseCount: u32,
//     pub dwHitRate: u32,
//     pub dwSizeLow: u32,
//     pub dwSizeHigh: u32,
//     pub LastModifiedTime: super::super::Foundation::FILETIME,
//     pub ExpireTime: super::super::Foundation::FILETIME,
//     pub LastAccessTime: super::super::Foundation::FILETIME,
//     pub LastSyncTime: super::super::Foundation::FILETIME,
//     pub lpHeaderInfo: windows_sys::core::PWSTR,
//     pub dwHeaderInfoSize: u32,
//     pub lpszFileExtension: windows_sys::core::PWSTR,
//     pub Anonymous: INTERNET_CACHE_ENTRY_INFOW_0,
// }

// UNSUPPORTED Rust 1475:1: declaration Impl has no candidate rule
// impl Default for INTERNET_CACHE_ENTRY_INFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1480:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union INTERNET_CACHE_ENTRY_INFOW_0 {
//     pub dwReserved: u32,
//     pub dwExemptDelta: u32,
// }

// UNSUPPORTED Rust 1486:1: declaration Impl has no candidate rule
// impl Default for INTERNET_CACHE_ENTRY_INFOW_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `INTERNET_CACHE_FLAG_ADD_FILENAME_ONLY`: UInt = 2048u;
public const val `INTERNET_CACHE_FLAG_ALLOW_COLLISIONS`: UInt = 256u;
public const val `INTERNET_CACHE_FLAG_ENTRY_OR_MAPPING`: UInt = 1024u;
public const val `INTERNET_CACHE_FLAG_GET_STRUCT_ONLY`: UInt = 4096u;
public const val `INTERNET_CACHE_FLAG_INSTALLED_ENTRY`: UInt = 512u;
public const val `INTERNET_CACHE_GROUP_ADD`: UInt = 0u;
// UNSUPPORTED Rust 1497:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct INTERNET_CACHE_GROUP_INFOA {
//     pub dwGroupSize: u32,
//     pub dwGroupFlags: u32,
//     pub dwGroupType: u32,
//     pub dwDiskUsage: u32,
//     pub dwDiskQuota: u32,
//     pub dwOwnerStorage: [u32; 4],
//     pub szGroupName: [i8; 120],
// }

// UNSUPPORTED Rust 1508:1: declaration Impl has no candidate rule
// impl Default for INTERNET_CACHE_GROUP_INFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1513:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct INTERNET_CACHE_GROUP_INFOW {
//     pub dwGroupSize: u32,
//     pub dwGroupFlags: u32,
//     pub dwGroupType: u32,
//     pub dwDiskUsage: u32,
//     pub dwDiskQuota: u32,
//     pub dwOwnerStorage: [u32; 4],
//     pub szGroupName: [u16; 120],
// }

// UNSUPPORTED Rust 1524:1: declaration Impl has no candidate rule
// impl Default for INTERNET_CACHE_GROUP_INFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `INTERNET_CACHE_GROUP_REMOVE`: UInt = 1u;
// UNSUPPORTED Rust 1530:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct INTERNET_CACHE_TIMESTAMPS {
//     pub ftExpires: super::super::Foundation::FILETIME,
//     pub ftLastModified: super::super::Foundation::FILETIME,
// }

// UNSUPPORTED Rust 1536:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct INTERNET_CALLBACK_COOKIE {
//     pub pcwszName: windows_sys::core::PCWSTR,
//     pub pcwszValue: windows_sys::core::PCWSTR,
//     pub pcwszDomain: windows_sys::core::PCWSTR,
//     pub pcwszPath: windows_sys::core::PCWSTR,
//     pub ftExpires: super::super::Foundation::FILETIME,
//     pub dwFlags: u32,
// }

// UNSUPPORTED Rust 1546:1: declaration Impl has no candidate rule
// impl Default for INTERNET_CALLBACK_COOKIE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1551:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct INTERNET_CERTIFICATE_INFO {
//     pub ftExpiry: super::super::Foundation::FILETIME,
//     pub ftStart: super::super::Foundation::FILETIME,
//     pub lpszSubjectInfo: *mut i8,
//     pub lpszIssuerInfo: *mut i8,
//     pub lpszProtocolName: *mut i8,
//     pub lpszSignatureAlgName: *mut i8,
//     pub lpszEncryptionAlgName: *mut i8,
//     pub dwKeySize: u32,
// }

// UNSUPPORTED Rust 1563:1: declaration Impl has no candidate rule
// impl Default for INTERNET_CERTIFICATE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1568:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct INTERNET_CONNECTED_INFO {
//     pub dwConnectedState: INTERNET_STATE,
//     pub dwFlags: u32,
// }

public typealias `INTERNET_CONNECTION` = UInt;
public const val `INTERNET_CONNECTION_CONFIGURED`: `INTERNET_CONNECTION` = 64u;
public const val `INTERNET_CONNECTION_LAN`: `INTERNET_CONNECTION` = 2u;
public const val `INTERNET_CONNECTION_MODEM`: `INTERNET_CONNECTION` = 1u;
public const val `INTERNET_CONNECTION_MODEM_BUSY`: `INTERNET_CONNECTION` = 8u;
public const val `INTERNET_CONNECTION_OFFLINE`: `INTERNET_CONNECTION` = 32u;
public const val `INTERNET_CONNECTION_PROXY`: `INTERNET_CONNECTION` = 4u;
// UNSUPPORTED Rust 1581:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct INTERNET_COOKIE {
//     pub cbSize: u32,
//     pub pszName: windows_sys::core::PSTR,
//     pub pszData: windows_sys::core::PSTR,
//     pub pszDomain: windows_sys::core::PSTR,
//     pub pszPath: windows_sys::core::PSTR,
//     pub pftExpires: *mut super::super::Foundation::FILETIME,
//     pub dwFlags: u32,
//     pub pszUrl: windows_sys::core::PSTR,
//     pub pszP3PPolicy: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 1594:1: declaration Impl has no candidate rule
// impl Default for INTERNET_COOKIE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1599:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct INTERNET_COOKIE2 {
//     pub pwszName: windows_sys::core::PWSTR,
//     pub pwszValue: windows_sys::core::PWSTR,
//     pub pwszDomain: windows_sys::core::PWSTR,
//     pub pwszPath: windows_sys::core::PWSTR,
//     pub dwFlags: u32,
//     pub ftExpires: super::super::Foundation::FILETIME,
//     pub fExpiresSet: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 1610:1: declaration Impl has no candidate rule
// impl Default for INTERNET_COOKIE2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `INTERNET_COOKIE_ALL_COOKIES`: UInt = 536870912u;
public const val `INTERNET_COOKIE_APPLY_HOST_ONLY`: UInt = 32768u;
public const val `INTERNET_COOKIE_APPLY_P3P`: UInt = 128u;
public const val `INTERNET_COOKIE_ECTX_3RDPARTY`: UInt = 2147483648u;
public const val `INTERNET_COOKIE_EDGE_COOKIES`: UInt = 262144u;
public const val `INTERNET_COOKIE_EVALUATE_P3P`: UInt = 64u;
public typealias `INTERNET_COOKIE_FLAGS` = UInt;
public const val `INTERNET_COOKIE_HOST_ONLY`: UInt = 16384u;
public const val `INTERNET_COOKIE_HOST_ONLY_APPLIED`: UInt = 524288u;
public const val `INTERNET_COOKIE_HTTPONLY`: `INTERNET_COOKIE_FLAGS` = 8192u;
public const val `INTERNET_COOKIE_IE6`: UInt = 1024u;
public const val `INTERNET_COOKIE_IS_LEGACY`: UInt = 2048u;
public const val `INTERNET_COOKIE_IS_RESTRICTED`: UInt = 512u;
public const val `INTERNET_COOKIE_IS_SECURE`: UInt = 1u;
public const val `INTERNET_COOKIE_IS_SESSION`: UInt = 2u;
public const val `INTERNET_COOKIE_NON_SCRIPT`: UInt = 4096u;
public const val `INTERNET_COOKIE_NO_CALLBACK`: UInt = 1073741824u;
public const val `INTERNET_COOKIE_P3P_ENABLED`: UInt = 256u;
public const val `INTERNET_COOKIE_PERSISTENT_HOST_ONLY`: UInt = 65536u;
public const val `INTERNET_COOKIE_PROMPT_REQUIRED`: UInt = 32u;
public const val `INTERNET_COOKIE_RESTRICTED_ZONE`: UInt = 131072u;
public const val `INTERNET_COOKIE_SAME_SITE_LAX`: UInt = 2097152u;
public const val `INTERNET_COOKIE_SAME_SITE_LEVEL_CROSS_SITE`: UInt = 4194304u;
public const val `INTERNET_COOKIE_SAME_SITE_STRICT`: UInt = 1048576u;
public const val `INTERNET_COOKIE_THIRD_PARTY`: `INTERNET_COOKIE_FLAGS` = 16u;
// UNSUPPORTED Rust 1640:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct INTERNET_CREDENTIALS {
//     pub lpcwszHostName: windows_sys::core::PCWSTR,
//     pub dwPort: u32,
//     pub dwScheme: u32,
//     pub lpcwszUrl: windows_sys::core::PCWSTR,
//     pub lpcwszRealm: windows_sys::core::PCWSTR,
//     pub fAuthIdentity: windows_sys::core::BOOL,
//     pub Anonymous: INTERNET_CREDENTIALS_0,
// }

// UNSUPPORTED Rust 1651:1: declaration Impl has no candidate rule
// impl Default for INTERNET_CREDENTIALS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1656:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union INTERNET_CREDENTIALS_0 {
//     pub Anonymous: INTERNET_CREDENTIALS_0_0,
//     pub pAuthIdentityOpaque: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 1662:1: declaration Impl has no candidate rule
// impl Default for INTERNET_CREDENTIALS_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1667:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct INTERNET_CREDENTIALS_0_0 {
//     pub lpcwszUserName: windows_sys::core::PCWSTR,
//     pub lpcwszPassword: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 1673:1: declaration Impl has no candidate rule
// impl Default for INTERNET_CREDENTIALS_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `INTERNET_CUSTOMDIAL_CAN_HANGUP`: UInt = 4u;
public const val `INTERNET_CUSTOMDIAL_CONNECT`: UInt = 0u;
public const val `INTERNET_CUSTOMDIAL_DISCONNECT`: UInt = 2u;
public const val `INTERNET_CUSTOMDIAL_SAFE_FOR_UNATTENDED`: UInt = 1u;
public const val `INTERNET_CUSTOMDIAL_SHOWOFFLINE`: UInt = 4u;
public const val `INTERNET_CUSTOMDIAL_UNATTENDED`: UInt = 1u;
public const val `INTERNET_CUSTOMDIAL_WILL_SUPPLY_STATE`: UInt = 2u;
public const val `INTERNET_DEFAULT_FTP_PORT`: UShort = 21u;
public const val `INTERNET_DEFAULT_GOPHER_PORT`: UShort = 70u;
public const val `INTERNET_DEFAULT_SOCKS_PORT`: UShort = 1080u;
// UNSUPPORTED Rust 1688:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct INTERNET_DIAGNOSTIC_SOCKET_INFO {
//     pub Socket: usize,
//     pub SourcePort: u32,
//     pub DestPort: u32,
//     pub Flags: u32,
// }

public const val `INTERNET_DIALSTATE_DISCONNECTED`: UInt = 1u;
public const val `INTERNET_DIAL_FORCE_PROMPT`: UInt = 8192u;
public const val `INTERNET_DIAL_SHOW_OFFLINE`: UInt = 16384u;
public const val `INTERNET_DIAL_UNATTENDED`: UInt = 32768u;
// UNSUPPORTED Rust 1700:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct INTERNET_DOWNLOAD_MODE_HANDLE {
//     pub pcwszFileName: windows_sys::core::PCWSTR,
//     pub phFile: *mut super::super::Foundation::HANDLE,
// }

// UNSUPPORTED Rust 1706:1: declaration Impl has no candidate rule
// impl Default for INTERNET_DOWNLOAD_MODE_HANDLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1711:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct INTERNET_END_BROWSER_SESSION_DATA {
//     pub lpBuffer: *mut core::ffi::c_void,
//     pub dwBufferLength: u32,
// }

// UNSUPPORTED Rust 1717:1: declaration Impl has no candidate rule
// impl Default for INTERNET_END_BROWSER_SESSION_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `INTERNET_ERROR_BASE`: UInt = 12000u;
public const val `INTERNET_ERROR_LAST`: UInt = 12192u;
public const val `INTERNET_ERROR_MASK_COMBINED_SEC_CERT`: UInt = 2u;
public const val `INTERNET_ERROR_MASK_INSERT_CDROM`: UInt = 1u;
public const val `INTERNET_ERROR_MASK_LOGIN_FAILURE_DISPLAY_ENTITY_BODY`: UInt = 8u;
public const val `INTERNET_ERROR_MASK_NEED_MSN_SSPI_PKG`: UInt = 4u;
public const val `INTERNET_FIRST_OPTION`: UInt = 1u;
public const val `INTERNET_FLAG_ASYNC`: UInt = 268435456u;
public const val `INTERNET_FLAG_BGUPDATE`: UInt = 8u;
public const val `INTERNET_FLAG_CACHE_ASYNC`: UInt = 128u;
public const val `INTERNET_FLAG_CACHE_IF_NET_FAIL`: UInt = 65536u;
public const val `INTERNET_FLAG_DONT_CACHE`: UInt = 67108864u;
public const val `INTERNET_FLAG_EXISTING_CONNECT`: UInt = 536870912u;
public const val `INTERNET_FLAG_FORMS_SUBMIT`: UInt = 64u;
public const val `INTERNET_FLAG_FROM_CACHE`: UInt = 16777216u;
public const val `INTERNET_FLAG_FTP_FOLDER_VIEW`: UInt = 4u;
public const val `INTERNET_FLAG_FWD_BACK`: UInt = 32u;
public const val `INTERNET_FLAG_HYPERLINK`: UInt = 1024u;
public const val `INTERNET_FLAG_IDN_DIRECT`: UInt = 1u;
public const val `INTERNET_FLAG_IDN_PROXY`: UInt = 2u;
public const val `INTERNET_FLAG_IGNORE_CERT_CN_INVALID`: UInt = 4096u;
public const val `INTERNET_FLAG_IGNORE_CERT_DATE_INVALID`: UInt = 8192u;
public const val `INTERNET_FLAG_IGNORE_REDIRECT_TO_HTTP`: UInt = 32768u;
public const val `INTERNET_FLAG_IGNORE_REDIRECT_TO_HTTPS`: UInt = 16384u;
public const val `INTERNET_FLAG_KEEP_CONNECTION`: UInt = 4194304u;
public const val `INTERNET_FLAG_MAKE_PERSISTENT`: UInt = 33554432u;
public const val `INTERNET_FLAG_MUST_CACHE_REQUEST`: UInt = 16u;
public const val `INTERNET_FLAG_NEED_FILE`: UInt = 16u;
public const val `INTERNET_FLAG_NO_AUTH`: UInt = 262144u;
public const val `INTERNET_FLAG_NO_AUTO_REDIRECT`: UInt = 2097152u;
public const val `INTERNET_FLAG_NO_CACHE_WRITE`: UInt = 67108864u;
public const val `INTERNET_FLAG_NO_COOKIES`: UInt = 524288u;
public const val `INTERNET_FLAG_NO_UI`: UInt = 512u;
public const val `INTERNET_FLAG_OFFLINE`: UInt = 16777216u;
public const val `INTERNET_FLAG_PASSIVE`: UInt = 134217728u;
public const val `INTERNET_FLAG_PRAGMA_NOCACHE`: UInt = 256u;
public const val `INTERNET_FLAG_RAW_DATA`: UInt = 1073741824u;
public const val `INTERNET_FLAG_READ_PREFETCH`: UInt = 1048576u;
public const val `INTERNET_FLAG_RELOAD`: UInt = 2147483648u;
public const val `INTERNET_FLAG_RESTRICTED_ZONE`: `INTERNET_COOKIE_FLAGS` = 131072u;
public const val `INTERNET_FLAG_RESYNCHRONIZE`: UInt = 2048u;
public const val `INTERNET_FLAG_SECURE`: UInt = 8388608u;
public const val `INTERNET_FLAG_TRANSFER_ASCII`: `FTP_FLAGS` = 1u;
public const val `INTERNET_FLAG_TRANSFER_BINARY`: `FTP_FLAGS` = 2u;
public const val `INTERNET_GLOBAL_CALLBACK_DETECTING_PROXY`: UInt = 2u;
public const val `INTERNET_GLOBAL_CALLBACK_SENDING_HTTP_HEADERS`: UInt = 1u;
public const val `INTERNET_HANDLE_TYPE_CONNECT_FTP`: UInt = 2u;
public const val `INTERNET_HANDLE_TYPE_CONNECT_GOPHER`: UInt = 3u;
public const val `INTERNET_HANDLE_TYPE_CONNECT_HTTP`: UInt = 4u;
public const val `INTERNET_HANDLE_TYPE_FILE_REQUEST`: UInt = 14u;
public const val `INTERNET_HANDLE_TYPE_FTP_FILE`: UInt = 7u;
public const val `INTERNET_HANDLE_TYPE_FTP_FILE_HTML`: UInt = 8u;
public const val `INTERNET_HANDLE_TYPE_FTP_FIND`: UInt = 5u;
public const val `INTERNET_HANDLE_TYPE_FTP_FIND_HTML`: UInt = 6u;
public const val `INTERNET_HANDLE_TYPE_GOPHER_FILE`: UInt = 11u;
public const val `INTERNET_HANDLE_TYPE_GOPHER_FILE_HTML`: UInt = 12u;
public const val `INTERNET_HANDLE_TYPE_GOPHER_FIND`: UInt = 9u;
public const val `INTERNET_HANDLE_TYPE_GOPHER_FIND_HTML`: UInt = 10u;
public const val `INTERNET_HANDLE_TYPE_HTTP_REQUEST`: UInt = 13u;
public const val `INTERNET_HANDLE_TYPE_INTERNET`: UInt = 1u;
public const val `INTERNET_IDENTITY_FLAG_CLEAR_CONTENT`: UInt = 32u;
public const val `INTERNET_IDENTITY_FLAG_CLEAR_COOKIES`: UInt = 8u;
public const val `INTERNET_IDENTITY_FLAG_CLEAR_DATA`: UInt = 4u;
public const val `INTERNET_IDENTITY_FLAG_CLEAR_HISTORY`: UInt = 16u;
public const val `INTERNET_IDENTITY_FLAG_PRIVATE_CACHE`: UInt = 1u;
public const val `INTERNET_IDENTITY_FLAG_SHARED_CACHE`: UInt = 2u;
public const val `INTERNET_INTERNAL_ERROR_BASE`: UInt = 12900u;
public const val `INTERNET_INVALID_PORT_NUMBER`: UInt = 0u;
public const val `INTERNET_KEEP_ALIVE_DISABLED`: UInt = 0u;
public const val `INTERNET_KEEP_ALIVE_ENABLED`: UInt = 1u;
public const val `INTERNET_KEEP_ALIVE_UNKNOWN`: UInt = 4294967295u;
public const val `INTERNET_LAST_OPTION`: UInt = 193u;
public const val `INTERNET_LAST_OPTION_INTERNAL`: UInt = 193u;
public const val `INTERNET_MAX_HOST_NAME_LENGTH`: UInt = 256u;
public const val `INTERNET_MAX_PASSWORD_LENGTH`: UInt = 128u;
public const val `INTERNET_MAX_PORT_NUMBER_LENGTH`: UInt = 5u;
public const val `INTERNET_MAX_PORT_NUMBER_VALUE`: UInt = 65535u;
public const val `INTERNET_MAX_USER_NAME_LENGTH`: UInt = 128u;
public const val `INTERNET_NO_CALLBACK`: UInt = 0u;
public const val `INTERNET_OPEN_TYPE_DIRECT`: `INTERNET_ACCESS_TYPE` = 1u;
public const val `INTERNET_OPEN_TYPE_PRECONFIG`: `INTERNET_ACCESS_TYPE` = 0u;
public const val `INTERNET_OPEN_TYPE_PRECONFIG_WITH_NO_AUTOPROXY`: UInt = 4u;
public const val `INTERNET_OPEN_TYPE_PROXY`: `INTERNET_ACCESS_TYPE` = 3u;
public const val `INTERNET_OPTION_ACTIVATE_WORKER_THREADS`: UInt = 92u;
public const val `INTERNET_OPTION_ACTIVITY_ID`: UInt = 185u;
public const val `INTERNET_OPTION_ALLOW_FAILED_CONNECT_CONTENT`: UInt = 110u;
public const val `INTERNET_OPTION_ALLOW_INSECURE_FALLBACK`: UInt = 161u;
public const val `INTERNET_OPTION_ALTER_IDENTITY`: UInt = 80u;
public const val `INTERNET_OPTION_APP_CACHE`: UInt = 130u;
public const val `INTERNET_OPTION_ASYNC`: UInt = 30u;
public const val `INTERNET_OPTION_ASYNC_ID`: UInt = 15u;
public const val `INTERNET_OPTION_ASYNC_PRIORITY`: UInt = 16u;
public const val `INTERNET_OPTION_AUTH_FLAGS`: UInt = 85u;
public const val `INTERNET_OPTION_AUTH_SCHEME_SELECTED`: UInt = 183u;
public const val `INTERNET_OPTION_AUTODIAL_CONNECTION`: UInt = 83u;
public const val `INTERNET_OPTION_AUTODIAL_HWND`: UInt = 112u;
public const val `INTERNET_OPTION_AUTODIAL_MODE`: UInt = 82u;
public const val `INTERNET_OPTION_BACKGROUND_CONNECTIONS`: UInt = 121u;
public const val `INTERNET_OPTION_BYPASS_EDITED_ENTRY`: UInt = 64u;
public const val `INTERNET_OPTION_CACHE_ENTRY_EXTRA_DATA`: UInt = 139u;
public const val `INTERNET_OPTION_CACHE_PARTITION`: UInt = 111u;
public const val `INTERNET_OPTION_CACHE_STREAM_HANDLE`: UInt = 27u;
public const val `INTERNET_OPTION_CACHE_TIMESTAMPS`: UInt = 69u;
public const val `INTERNET_OPTION_CALLBACK`: UInt = 1u;
public const val `INTERNET_OPTION_CALLBACK_FILTER`: UInt = 54u;
public const val `INTERNET_OPTION_CALLER_MODULE`: UInt = 192u;
public const val `INTERNET_OPTION_CANCEL_CACHE_WRITE`: UInt = 182u;
public const val `INTERNET_OPTION_CERT_ERROR_FLAGS`: UInt = 98u;
public const val `INTERNET_OPTION_CHUNK_ENCODE_REQUEST`: UInt = 150u;
public const val `INTERNET_OPTION_CLIENT_CERT_CONTEXT`: UInt = 84u;
public const val `INTERNET_OPTION_CLIENT_CERT_ISSUER_LIST`: UInt = 153u;
public const val `INTERNET_OPTION_CM_HANDLE_COPY_REF`: UInt = 118u;
public const val `INTERNET_OPTION_CODEPAGE`: UInt = 68u;
public const val `INTERNET_OPTION_CODEPAGE_EXTRA`: UInt = 101u;
public const val `INTERNET_OPTION_CODEPAGE_PATH`: UInt = 100u;
public const val `INTERNET_OPTION_COMPRESSED_CONTENT_LENGTH`: UInt = 147u;
public const val `INTERNET_OPTION_CONNECTED_STATE`: UInt = 50u;
public const val `INTERNET_OPTION_CONNECTION_FILTER`: UInt = 162u;
public const val `INTERNET_OPTION_CONNECTION_INFO`: UInt = 120u;
public const val `INTERNET_OPTION_CONNECT_BACKOFF`: UInt = 4u;
public const val `INTERNET_OPTION_CONNECT_LIMIT`: UInt = 46u;
public const val `INTERNET_OPTION_CONNECT_RETRIES`: UInt = 3u;
public const val `INTERNET_OPTION_CONNECT_TIME`: UInt = 55u;
public const val `INTERNET_OPTION_CONNECT_TIMEOUT`: UInt = 2u;
public const val `INTERNET_OPTION_CONTEXT_VALUE`: UInt = 45u;
public const val `INTERNET_OPTION_CONTEXT_VALUE_OLD`: UInt = 10u;
public const val `INTERNET_OPTION_CONTROL_RECEIVE_TIMEOUT`: UInt = 6u;
public const val `INTERNET_OPTION_CONTROL_SEND_TIMEOUT`: UInt = 5u;
public const val `INTERNET_OPTION_COOKIES_3RD_PARTY`: UInt = 86u;
public const val `INTERNET_OPTION_COOKIES_APPLY_HOST_ONLY`: UInt = 179u;
public const val `INTERNET_OPTION_COOKIES_SAME_SITE_LEVEL`: UInt = 187u;
public const val `INTERNET_OPTION_DATAFILE_EXT`: UInt = 96u;
public const val `INTERNET_OPTION_DATAFILE_NAME`: UInt = 33u;
public const val `INTERNET_OPTION_DATA_RECEIVE_TIMEOUT`: UInt = 8u;
public const val `INTERNET_OPTION_DATA_SEND_TIMEOUT`: UInt = 7u;
public const val `INTERNET_OPTION_DEPENDENCY_HANDLE`: UInt = 131u;
public const val `INTERNET_OPTION_DETECT_POST_SEND`: UInt = 71u;
public const val `INTERNET_OPTION_DIAGNOSTIC_SOCKET_INFO`: UInt = 67u;
public const val `INTERNET_OPTION_DIGEST_AUTH_UNLOAD`: UInt = 76u;
public const val `INTERNET_OPTION_DISABLE_AUTODIAL`: UInt = 70u;
public const val `INTERNET_OPTION_DISABLE_INSECURE_FALLBACK`: UInt = 160u;
public const val `INTERNET_OPTION_DISABLE_NTLM_PREAUTH`: UInt = 72u;
public const val `INTERNET_OPTION_DISABLE_PASSPORT_AUTH`: UInt = 87u;
public const val `INTERNET_OPTION_DISABLE_PROXY_LINK_LOCAL_NAME_RESOLUTION`: UInt = 190u;
public const val `INTERNET_OPTION_DISALLOW_PREMATURE_EOF`: UInt = 137u;
public const val `INTERNET_OPTION_DISCONNECTED_TIMEOUT`: UInt = 49u;
public const val `INTERNET_OPTION_DOWNLOAD_MODE`: UInt = 116u;
public const val `INTERNET_OPTION_DOWNLOAD_MODE_HANDLE`: UInt = 165u;
public const val `INTERNET_OPTION_DO_NOT_TRACK`: UInt = 123u;
public const val `INTERNET_OPTION_DUO_USED`: UInt = 149u;
public const val `INTERNET_OPTION_EDGE_COOKIES`: UInt = 166u;
public const val `INTERNET_OPTION_EDGE_COOKIES_TEMP`: UInt = 175u;
public const val `INTERNET_OPTION_EDGE_MODE`: UInt = 180u;
public const val `INTERNET_OPTION_ENABLE_DUO`: UInt = 148u;
public const val `INTERNET_OPTION_ENABLE_HEADER_CALLBACKS`: UInt = 168u;
public const val `INTERNET_OPTION_ENABLE_HTTP_PROTOCOL`: UInt = 148u;
public const val `INTERNET_OPTION_ENABLE_PASSPORT_AUTH`: UInt = 90u;
public const val `INTERNET_OPTION_ENABLE_REDIRECT_CACHE_READ`: UInt = 122u;
public const val `INTERNET_OPTION_ENABLE_TEST_SIGNING`: UInt = 189u;
public const val `INTERNET_OPTION_ENABLE_WBOEXT`: UInt = 158u;
public const val `INTERNET_OPTION_ENABLE_ZLIB_DEFLATE`: UInt = 173u;
public const val `INTERNET_OPTION_ENCODE_EXTRA`: UInt = 155u;
public const val `INTERNET_OPTION_ENCODE_FALLBACK_FOR_REDIRECT_URI`: UInt = 174u;
public const val `INTERNET_OPTION_END_BROWSER_SESSION`: UInt = 42u;
public const val `INTERNET_OPTION_ENTERPRISE_CONTEXT`: UInt = 159u;
public const val `INTERNET_OPTION_ERROR_MASK`: UInt = 62u;
public const val `INTERNET_OPTION_EXEMPT_CONNECTION_LIMIT`: UInt = 89u;
public const val `INTERNET_OPTION_EXTENDED_CALLBACKS`: UInt = 108u;
public const val `INTERNET_OPTION_EXTENDED_ERROR`: UInt = 24u;
public const val `INTERNET_OPTION_FAIL_ON_CACHE_WRITE_ERROR`: UInt = 115u;
public const val `INTERNET_OPTION_FALSE_START`: UInt = 141u;
public const val `INTERNET_OPTION_FLUSH_STATE`: UInt = 135u;
public const val `INTERNET_OPTION_FORCE_DECODE`: UInt = 178u;
public const val `INTERNET_OPTION_FROM_CACHE_TIMEOUT`: UInt = 63u;
public const val `INTERNET_OPTION_GLOBAL_CALLBACK`: UInt = 188u;
public const val `INTERNET_OPTION_HANDLE_TYPE`: UInt = 9u;
public const val `INTERNET_OPTION_HIBERNATE_INACTIVE_WORKER_THREADS`: UInt = 91u;
public const val `INTERNET_OPTION_HSTS`: UInt = 157u;
public const val `INTERNET_OPTION_HTTP_09`: UInt = 191u;
public const val `INTERNET_OPTION_HTTP_DECODING`: UInt = 65u;
public const val `INTERNET_OPTION_HTTP_PROTOCOL_USED`: UInt = 149u;
public const val `INTERNET_OPTION_HTTP_VERSION`: UInt = 59u;
public const val `INTERNET_OPTION_IDENTITY`: UInt = 78u;
public const val `INTERNET_OPTION_IDLE_STATE`: UInt = 51u;
public const val `INTERNET_OPTION_IDN`: UInt = 102u;
public const val `INTERNET_OPTION_IGNORE_CERT_ERROR_FLAGS`: UInt = 99u;
public const val `INTERNET_OPTION_IGNORE_OFFLINE`: UInt = 77u;
public const val `INTERNET_OPTION_KEEP_CONNECTION`: UInt = 22u;
public const val `INTERNET_OPTION_LINE_STATE`: UInt = 50u;
public const val `INTERNET_OPTION_LISTEN_TIMEOUT`: UInt = 11u;
public const val `INTERNET_OPTION_MAX_CONNS_PER_1_0_SERVER`: UInt = 74u;
public const val `INTERNET_OPTION_MAX_CONNS_PER_PROXY`: UInt = 103u;
public const val `INTERNET_OPTION_MAX_CONNS_PER_SERVER`: UInt = 73u;
public const val `INTERNET_OPTION_MAX_QUERY_BUFFER_SIZE`: UInt = 140u;
public const val `INTERNET_OPTION_NET_SPEED`: UInt = 61u;
public const val `INTERNET_OPTION_NOCACHE_WRITE_IN_PRIVATE`: UInt = 184u;
public const val `INTERNET_OPTION_NOTIFY_SENDING_COOKIE`: UInt = 152u;
public const val `INTERNET_OPTION_NO_HTTP_SERVER_AUTH`: UInt = 167u;
public const val `INTERNET_OPTION_OFFLINE_MODE`: UInt = 26u;
public const val `INTERNET_OPTION_OFFLINE_SEMANTICS`: UInt = 52u;
public const val `INTERNET_OPTION_OFFLINE_TIMEOUT`: UInt = 49u;
public const val `INTERNET_OPTION_OPT_IN_WEAK_SIGNATURE`: UInt = 176u;
public const val `INTERNET_OPTION_ORIGINAL_CONNECT_FLAGS`: UInt = 97u;
public const val `INTERNET_OPTION_PARENT_HANDLE`: UInt = 21u;
public const val `INTERNET_OPTION_PARSE_LINE_FOLDING`: UInt = 177u;
public const val `INTERNET_OPTION_PASSWORD`: UInt = 29u;
public const val `INTERNET_OPTION_PER_CONNECTION_OPTION`: UInt = 75u;
public const val `INTERNET_OPTION_POLICY`: UInt = 48u;
public const val `INTERNET_OPTION_PRESERVE_REFERER_ON_HTTPS_TO_HTTP_REDIRECT`: UInt = 170u;
public const val `INTERNET_OPTION_PRESERVE_REQUEST_SERVER_CREDENTIALS_ON_REDIRECT`: UInt = 169u;
public const val `INTERNET_OPTION_PROXY`: UInt = 38u;
public const val `INTERNET_OPTION_PROXY_AUTH_SCHEME`: UInt = 144u;
public const val `INTERNET_OPTION_PROXY_CREDENTIALS`: UInt = 107u;
public const val `INTERNET_OPTION_PROXY_FROM_REQUEST`: UInt = 109u;
public const val `INTERNET_OPTION_PROXY_PASSWORD`: UInt = 44u;
public const val `INTERNET_OPTION_PROXY_SETTINGS_CHANGED`: UInt = 95u;
public const val `INTERNET_OPTION_PROXY_USERNAME`: UInt = 43u;
public const val `INTERNET_OPTION_READ_BUFFER_SIZE`: UInt = 12u;
public const val `INTERNET_OPTION_RECEIVE_THROUGHPUT`: UInt = 57u;
public const val `INTERNET_OPTION_RECEIVE_TIMEOUT`: UInt = 6u;
public const val `INTERNET_OPTION_REFERER_TOKEN_BINDING_HOSTNAME`: UInt = 163u;
public const val `INTERNET_OPTION_REFRESH`: UInt = 37u;
public const val `INTERNET_OPTION_REMOVE_IDENTITY`: UInt = 79u;
public const val `INTERNET_OPTION_REQUEST_ANNOTATION`: UInt = 193u;
public const val `INTERNET_OPTION_REQUEST_ANNOTATION_MAX_LENGTH`: UInt = 64000u;
public const val `INTERNET_OPTION_REQUEST_FLAGS`: UInt = 23u;
public const val `INTERNET_OPTION_REQUEST_PRIORITY`: UInt = 58u;
public const val `INTERNET_OPTION_REQUEST_TIMES`: UInt = 186u;
public const val `INTERNET_OPTION_RESET`: UInt = 154u;
public const val `INTERNET_OPTION_RESET_URLCACHE_SESSION`: UInt = 60u;
public const val `INTERNET_OPTION_RESPONSE_RESUMABLE`: UInt = 117u;
public const val `INTERNET_OPTION_RESTORE_WORKER_THREAD_DEFAULTS`: UInt = 93u;
public const val `INTERNET_OPTION_SECONDARY_CACHE_KEY`: UInt = 53u;
public const val `INTERNET_OPTION_SECURE_FAILURE`: UInt = 151u;
public const val `INTERNET_OPTION_SECURITY_CERTIFICATE`: UInt = 35u;
public const val `INTERNET_OPTION_SECURITY_CERTIFICATE_STRUCT`: UInt = 32u;
public const val `INTERNET_OPTION_SECURITY_CONNECTION_INFO`: UInt = 66u;
public const val `INTERNET_OPTION_SECURITY_FLAGS`: UInt = 31u;
public const val `INTERNET_OPTION_SECURITY_KEY_BITNESS`: UInt = 36u;
public const val `INTERNET_OPTION_SECURITY_SELECT_CLIENT_CERT`: UInt = 47u;
public const val `INTERNET_OPTION_SEND_THROUGHPUT`: UInt = 56u;
public const val `INTERNET_OPTION_SEND_TIMEOUT`: UInt = 5u;
public const val `INTERNET_OPTION_SEND_UTF8_SERVERNAME_TO_PROXY`: UInt = 88u;
public const val `INTERNET_OPTION_SERVER_ADDRESS_INFO`: UInt = 156u;
public const val `INTERNET_OPTION_SERVER_AUTH_SCHEME`: UInt = 143u;
public const val `INTERNET_OPTION_SERVER_CERT_CHAIN_CONTEXT`: UInt = 105u;
public const val `INTERNET_OPTION_SERVER_CREDENTIALS`: UInt = 113u;
public const val `INTERNET_OPTION_SESSION_START_TIME`: UInt = 106u;
public const val `INTERNET_OPTION_SETTINGS_CHANGED`: UInt = 39u;
public const val `INTERNET_OPTION_SET_IN_PRIVATE`: UInt = 164u;
public const val `INTERNET_OPTION_SOCKET_NODELAY`: UInt = 129u;
public const val `INTERNET_OPTION_SOCKET_NOTIFICATION_IOCTL`: UInt = 138u;
public const val `INTERNET_OPTION_SOCKET_SEND_BUFFER_LENGTH`: UInt = 94u;
public const val `INTERNET_OPTION_SOURCE_PORT`: UInt = 146u;
public const val `INTERNET_OPTION_SUPPRESS_BEHAVIOR`: UInt = 81u;
public const val `INTERNET_OPTION_SUPPRESS_SERVER_AUTH`: UInt = 104u;
public const val `INTERNET_OPTION_SYNC_MODE_AUTOMATIC_SESSION_DISABLED`: UInt = 172u;
public const val `INTERNET_OPTION_TCP_FAST_OPEN`: UInt = 171u;
public const val `INTERNET_OPTION_TIMED_CONNECTION_LIMIT_BYPASS`: UInt = 133u;
public const val `INTERNET_OPTION_TOKEN_BINDING_PUBLIC_KEY`: UInt = 181u;
public const val `INTERNET_OPTION_TUNNEL_ONLY`: UInt = 145u;
public const val `INTERNET_OPTION_UNLOAD_NOTIFY_EVENT`: UInt = 128u;
public const val `INTERNET_OPTION_UPGRADE_TO_WEB_SOCKET`: UInt = 126u;
public const val `INTERNET_OPTION_URL`: UInt = 34u;
public const val `INTERNET_OPTION_USERNAME`: UInt = 28u;
public const val `INTERNET_OPTION_USER_AGENT`: UInt = 41u;
public const val `INTERNET_OPTION_USER_PASS_SERVER_ONLY`: UInt = 142u;
public const val `INTERNET_OPTION_USE_FIRST_AVAILABLE_CONNECTION`: UInt = 132u;
public const val `INTERNET_OPTION_USE_MODIFIED_HEADER_FILTER`: UInt = 124u;
public const val `INTERNET_OPTION_VERSION`: UInt = 40u;
public const val `INTERNET_OPTION_WEB_SOCKET_CLOSE_TIMEOUT`: UInt = 134u;
public const val `INTERNET_OPTION_WEB_SOCKET_KEEPALIVE_INTERVAL`: UInt = 127u;
public const val `INTERNET_OPTION_WPAD_SLEEP`: UInt = 114u;
public const val `INTERNET_OPTION_WRITE_BUFFER_SIZE`: UInt = 13u;
public const val `INTERNET_OPTION_WWA_MODE`: UInt = 125u;
public typealias `INTERNET_PER_CONN` = UInt;
public const val `INTERNET_PER_CONN_AUTOCONFIG_LAST_DETECT_TIME`: `INTERNET_PER_CONN` = 8u;
public const val `INTERNET_PER_CONN_AUTOCONFIG_LAST_DETECT_URL`: `INTERNET_PER_CONN` = 9u;
public const val `INTERNET_PER_CONN_AUTOCONFIG_RELOAD_DELAY_MINS`: `INTERNET_PER_CONN` = 7u;
public const val `INTERNET_PER_CONN_AUTOCONFIG_SECONDARY_URL`: `INTERNET_PER_CONN` = 6u;
public const val `INTERNET_PER_CONN_AUTOCONFIG_URL`: `INTERNET_PER_CONN` = 4u;
public const val `INTERNET_PER_CONN_AUTODISCOVERY_FLAGS`: `INTERNET_PER_CONN` = 5u;
public const val `INTERNET_PER_CONN_FLAGS`: `INTERNET_PER_CONN` = 1u;
public const val `INTERNET_PER_CONN_FLAGS_UI`: UInt = 10u;
// UNSUPPORTED Rust 2006:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct INTERNET_PER_CONN_OPTIONA {
//     pub dwOption: INTERNET_PER_CONN,
//     pub Value: INTERNET_PER_CONN_OPTIONA_0,
// }

// UNSUPPORTED Rust 2012:1: declaration Impl has no candidate rule
// impl Default for INTERNET_PER_CONN_OPTIONA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2017:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union INTERNET_PER_CONN_OPTIONA_0 {
//     pub dwValue: u32,
//     pub pszValue: windows_sys::core::PSTR,
//     pub ftValue: super::super::Foundation::FILETIME,
// }

// UNSUPPORTED Rust 2024:1: declaration Impl has no candidate rule
// impl Default for INTERNET_PER_CONN_OPTIONA_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2029:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct INTERNET_PER_CONN_OPTIONW {
//     pub dwOption: INTERNET_PER_CONN,
//     pub Value: INTERNET_PER_CONN_OPTIONW_0,
// }

// UNSUPPORTED Rust 2035:1: declaration Impl has no candidate rule
// impl Default for INTERNET_PER_CONN_OPTIONW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2040:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union INTERNET_PER_CONN_OPTIONW_0 {
//     pub dwValue: u32,
//     pub pszValue: windows_sys::core::PWSTR,
//     pub ftValue: super::super::Foundation::FILETIME,
// }

// UNSUPPORTED Rust 2047:1: declaration Impl has no candidate rule
// impl Default for INTERNET_PER_CONN_OPTIONW_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2052:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct INTERNET_PER_CONN_OPTION_LISTA {
//     pub dwSize: u32,
//     pub pszConnection: windows_sys::core::PSTR,
//     pub dwOptionCount: u32,
//     pub dwOptionError: u32,
//     pub pOptions: *mut INTERNET_PER_CONN_OPTIONA,
// }

// UNSUPPORTED Rust 2061:1: declaration Impl has no candidate rule
// impl Default for INTERNET_PER_CONN_OPTION_LISTA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2066:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct INTERNET_PER_CONN_OPTION_LISTW {
//     pub dwSize: u32,
//     pub pszConnection: windows_sys::core::PWSTR,
//     pub dwOptionCount: u32,
//     pub dwOptionError: u32,
//     pub pOptions: *mut INTERNET_PER_CONN_OPTIONW,
// }

// UNSUPPORTED Rust 2075:1: declaration Impl has no candidate rule
// impl Default for INTERNET_PER_CONN_OPTION_LISTW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `INTERNET_PER_CONN_PROXY_BYPASS`: `INTERNET_PER_CONN` = 3u;
public const val `INTERNET_PER_CONN_PROXY_SERVER`: `INTERNET_PER_CONN` = 2u;
public const val `INTERNET_PREFETCH_ABORTED`: UInt = 2u;
public const val `INTERNET_PREFETCH_COMPLETE`: UInt = 1u;
public const val `INTERNET_PREFETCH_PROGRESS`: UInt = 0u;
// UNSUPPORTED Rust 2085:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct INTERNET_PREFETCH_STATUS {
//     pub dwStatus: u32,
//     pub dwSize: u32,
// }

public const val `INTERNET_PRIORITY_FOREGROUND`: UInt = 1000u;
// UNSUPPORTED Rust 2092:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct INTERNET_PROXY_INFO {
//     pub dwAccessType: INTERNET_ACCESS_TYPE,
//     pub lpszProxy: *mut i8,
//     pub lpszProxyBypass: *mut i8,
// }

// UNSUPPORTED Rust 2099:1: declaration Impl has no candidate rule
// impl Default for INTERNET_PROXY_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `INTERNET_RAS_INSTALLED`: `INTERNET_CONNECTION` = 16u;
public const val `INTERNET_REQFLAG_ASYNC`: UInt = 2u;
public const val `INTERNET_REQFLAG_CACHE_WRITE_DISABLED`: UInt = 64u;
public const val `INTERNET_REQFLAG_FROM_APP_CACHE`: UInt = 256u;
public const val `INTERNET_REQFLAG_FROM_CACHE`: UInt = 1u;
public const val `INTERNET_REQFLAG_NET_TIMEOUT`: UInt = 128u;
public const val `INTERNET_REQFLAG_NO_HEADERS`: UInt = 8u;
public const val `INTERNET_REQFLAG_PASSIVE`: UInt = 16u;
public const val `INTERNET_REQFLAG_VIA_PROXY`: UInt = 4u;
public const val `INTERNET_RFC1123_BUFSIZE`: UInt = 30u;
public const val `INTERNET_RFC1123_FORMAT`: UInt = 0u;
public typealias `INTERNET_SCHEME` = Int;
public const val `INTERNET_SCHEME_DEFAULT`: `INTERNET_SCHEME` = 0;
public const val `INTERNET_SCHEME_FILE`: `INTERNET_SCHEME` = 5;
public const val `INTERNET_SCHEME_FIRST`: `INTERNET_SCHEME` = 1;
public const val `INTERNET_SCHEME_FTP`: `INTERNET_SCHEME` = 1;
public const val `INTERNET_SCHEME_GOPHER`: `INTERNET_SCHEME` = 2;
public const val `INTERNET_SCHEME_HTTP`: `INTERNET_SCHEME` = 3;
public const val `INTERNET_SCHEME_HTTPS`: `INTERNET_SCHEME` = 4;
public const val `INTERNET_SCHEME_JAVASCRIPT`: `INTERNET_SCHEME` = 9;
public const val `INTERNET_SCHEME_LAST`: `INTERNET_SCHEME` = 11;
public const val `INTERNET_SCHEME_MAILTO`: `INTERNET_SCHEME` = 7;
public const val `INTERNET_SCHEME_NEWS`: `INTERNET_SCHEME` = 6;
public const val `INTERNET_SCHEME_PARTIAL`: `INTERNET_SCHEME` = -2;
public const val `INTERNET_SCHEME_RES`: `INTERNET_SCHEME` = 11;
public const val `INTERNET_SCHEME_SOCKS`: `INTERNET_SCHEME` = 8;
public const val `INTERNET_SCHEME_UNKNOWN`: `INTERNET_SCHEME` = -1;
public const val `INTERNET_SCHEME_VBSCRIPT`: `INTERNET_SCHEME` = 10;
// UNSUPPORTED Rust 2132:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_Security_Authentication_Identity", feature = "Win32_Security_Cryptography"))]
// #[derive(Clone, Copy, Default)]
// pub struct INTERNET_SECURITY_CONNECTION_INFO {
//     pub dwSize: u32,
//     pub fSecure: windows_sys::core::BOOL,
//     pub connectionInfo: super::super::Security::Authentication::Identity::SecPkgContext_ConnectionInfo,
//     pub cipherInfo: super::super::Security::Authentication::Identity::SecPkgContext_CipherInfo,
// }

// UNSUPPORTED Rust 2141:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_Security_Authentication_Identity", feature = "Win32_Security_Cryptography"))]
// #[derive(Clone, Copy)]
// pub struct INTERNET_SECURITY_INFO {
//     pub dwSize: u32,
//     pub pCertificate: *const super::super::Security::Cryptography::CERT_CONTEXT,
//     pub pcCertChain: *mut super::super::Security::Cryptography::CERT_CHAIN_CONTEXT,
//     pub connectionInfo: super::super::Security::Authentication::Identity::SecPkgContext_ConnectionInfo,
//     pub cipherInfo: super::super::Security::Authentication::Identity::SecPkgContext_CipherInfo,
//     pub pcUnverifiedCertChain: *mut super::super::Security::Cryptography::CERT_CHAIN_CONTEXT,
//     pub channelBindingToken: super::super::Security::Authentication::Identity::SecPkgContext_Bindings,
// }

// UNSUPPORTED Rust 2153:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_Security_Authentication_Identity", feature = "Win32_Security_Cryptography"))]
// impl Default for INTERNET_SECURITY_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2159:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct INTERNET_SERVER_CONNECTION_STATE {
//     pub lpcwszHostName: windows_sys::core::PCWSTR,
//     pub fProxy: windows_sys::core::BOOL,
//     pub dwCounter: u32,
//     pub dwConnectionLimit: u32,
//     pub dwAvailableCreates: u32,
//     pub dwAvailableKeepAlives: u32,
//     pub dwActiveConnections: u32,
//     pub dwWaiters: u32,
// }

// UNSUPPORTED Rust 2171:1: declaration Impl has no candidate rule
// impl Default for INTERNET_SERVER_CONNECTION_STATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `INTERNET_SERVICE_FTP`: UInt = 1u;
public const val `INTERNET_SERVICE_GOPHER`: UInt = 2u;
public const val `INTERNET_SERVICE_HTTP`: UInt = 3u;
public const val `INTERNET_SERVICE_URL`: UInt = 0u;
public typealias `INTERNET_STATE` = UInt;
public const val `INTERNET_STATE_BUSY`: `INTERNET_STATE` = 512u;
public const val `INTERNET_STATE_CONNECTED`: `INTERNET_STATE` = 1u;
public const val `INTERNET_STATE_DISCONNECTED`: `INTERNET_STATE` = 2u;
public const val `INTERNET_STATE_DISCONNECTED_BY_USER`: `INTERNET_STATE` = 16u;
public const val `INTERNET_STATE_IDLE`: `INTERNET_STATE` = 256u;
public const val `INTERNET_STATUS_CLOSING_CONNECTION`: UInt = 50u;
public const val `INTERNET_STATUS_CONNECTED_TO_SERVER`: UInt = 21u;
public const val `INTERNET_STATUS_CONNECTING_TO_SERVER`: UInt = 20u;
public const val `INTERNET_STATUS_CONNECTION_CLOSED`: UInt = 51u;
public const val `INTERNET_STATUS_COOKIE`: UInt = 430u;
public const val `INTERNET_STATUS_COOKIE_HISTORY`: UInt = 327u;
public const val `INTERNET_STATUS_COOKIE_RECEIVED`: UInt = 321u;
public const val `INTERNET_STATUS_COOKIE_SENT`: UInt = 320u;
public const val `INTERNET_STATUS_CTL_RESPONSE_RECEIVED`: UInt = 42u;
public const val `INTERNET_STATUS_DETECTING_PROXY`: UInt = 80u;
public const val `INTERNET_STATUS_END_BROWSER_SESSION`: UInt = 420u;
public const val `INTERNET_STATUS_FILTER_CLOSED`: UInt = 512u;
public const val `INTERNET_STATUS_FILTER_CLOSING`: UInt = 256u;
public const val `INTERNET_STATUS_FILTER_CONNECTED`: UInt = 8u;
public const val `INTERNET_STATUS_FILTER_CONNECTING`: UInt = 4u;
public const val `INTERNET_STATUS_FILTER_HANDLE_CLOSING`: UInt = 2048u;
public const val `INTERNET_STATUS_FILTER_HANDLE_CREATED`: UInt = 1024u;
public const val `INTERNET_STATUS_FILTER_PREFETCH`: UInt = 4096u;
public const val `INTERNET_STATUS_FILTER_RECEIVED`: UInt = 128u;
public const val `INTERNET_STATUS_FILTER_RECEIVING`: UInt = 64u;
public const val `INTERNET_STATUS_FILTER_REDIRECT`: UInt = 8192u;
public const val `INTERNET_STATUS_FILTER_RESOLVED`: UInt = 2u;
public const val `INTERNET_STATUS_FILTER_RESOLVING`: UInt = 1u;
public const val `INTERNET_STATUS_FILTER_SENDING`: UInt = 16u;
public const val `INTERNET_STATUS_FILTER_SENT`: UInt = 32u;
public const val `INTERNET_STATUS_FILTER_STATE_CHANGE`: UInt = 16384u;
public const val `INTERNET_STATUS_HANDLE_CLOSING`: UInt = 70u;
public const val `INTERNET_STATUS_HANDLE_CREATED`: UInt = 60u;
public const val `INTERNET_STATUS_INTERMEDIATE_RESPONSE`: UInt = 120u;
public const val `INTERNET_STATUS_NAME_RESOLVED`: UInt = 11u;
public const val `INTERNET_STATUS_P3P_HEADER`: UInt = 325u;
public const val `INTERNET_STATUS_P3P_POLICYREF`: UInt = 326u;
public const val `INTERNET_STATUS_PREFETCH`: UInt = 43u;
public const val `INTERNET_STATUS_PRIVACY_IMPACTED`: UInt = 324u;
public const val `INTERNET_STATUS_PROXY_CREDENTIALS`: UInt = 400u;
public const val `INTERNET_STATUS_RECEIVING_RESPONSE`: UInt = 40u;
public const val `INTERNET_STATUS_REDIRECT`: UInt = 110u;
public const val `INTERNET_STATUS_REQUEST_COMPLETE`: UInt = 100u;
public const val `INTERNET_STATUS_REQUEST_HEADERS_SET`: UInt = 329u;
public const val `INTERNET_STATUS_REQUEST_SENT`: UInt = 31u;
public const val `INTERNET_STATUS_RESOLVING_NAME`: UInt = 10u;
public const val `INTERNET_STATUS_RESPONSE_HEADERS_SET`: UInt = 330u;
public const val `INTERNET_STATUS_RESPONSE_RECEIVED`: UInt = 41u;
public const val `INTERNET_STATUS_SENDING_COOKIE`: UInt = 328u;
public const val `INTERNET_STATUS_SENDING_REQUEST`: UInt = 30u;
public const val `INTERNET_STATUS_SERVER_CONNECTION_STATE`: UInt = 410u;
public const val `INTERNET_STATUS_SERVER_CREDENTIALS`: UInt = 401u;
public const val `INTERNET_STATUS_STATE_CHANGE`: UInt = 200u;
public const val `INTERNET_STATUS_USER_INPUT_REQUIRED`: UInt = 140u;
public const val `INTERNET_SUPPRESS_COOKIE_PERSIST`: UInt = 3u;
public const val `INTERNET_SUPPRESS_COOKIE_PERSIST_RESET`: UInt = 4u;
public const val `INTERNET_SUPPRESS_COOKIE_POLICY`: UInt = 1u;
public const val `INTERNET_SUPPRESS_COOKIE_POLICY_RESET`: UInt = 2u;
public const val `INTERNET_SUPPRESS_RESET_ALL`: UInt = 0u;
// UNSUPPORTED Rust 2240:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct INTERNET_VERSION_INFO {
//     pub dwMajorVersion: u32,
//     pub dwMinorVersion: u32,
// }

public const val `IRF_ASYNC`: UInt = 1u;
public const val `IRF_NO_WAIT`: UInt = 8u;
public const val `IRF_SYNC`: UInt = 4u;
public const val `IRF_USE_CONTEXT`: UInt = 8u;
public const val `ISO_FORCE_DISCONNECTED`: UInt = 1u;
public const val `ISO_FORCE_OFFLINE`: UInt = 1u;
public const val `ISO_GLOBAL`: UInt = 1u;
public const val `ISO_REGISTRY`: UInt = 2u;
// UNSUPPORTED Rust 2254:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IncomingCookieState {
//     pub cSession: i32,
//     pub cPersistent: i32,
//     pub cAccepted: i32,
//     pub cLeashed: i32,
//     pub cDowngraded: i32,
//     pub cBlocked: i32,
//     pub pszLocation: windows_sys::core::PCSTR,
// }

// UNSUPPORTED Rust 2265:1: declaration Impl has no candidate rule
// impl Default for IncomingCookieState {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2270:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct InternetCookieHistory {
//     pub fAccepted: windows_sys::core::BOOL,
//     pub fLeashed: windows_sys::core::BOOL,
//     pub fDowngraded: windows_sys::core::BOOL,
//     pub fRejected: windows_sys::core::BOOL,
// }

public typealias `InternetCookieState` = Int;
// UNSUPPORTED Rust 2279:1: non-scalar type Ptr unsupported
// pub const LOCAL_NAMESPACE_PREFIX: windows_sys::core::PCSTR = windows_sys::core::s!("Local\\");

// UNSUPPORTED Rust 2280:1: non-scalar type Ptr unsupported
// pub const LOCAL_NAMESPACE_PREFIX_W: windows_sys::core::PCWSTR = windows_sys::core::w!("Local\\");

// UNSUPPORTED Rust 2281:1: generic scalar type unsupported
// pub type LPINTERNET_STATUS_CALLBACK = Option<unsafe extern "system" fn(hinternet: *const core::ffi::c_void, dwcontext: usize, dwinternetstatus: u32, lpvstatusinformation: *const core::ffi::c_void, dwstatusinformationlength: u32)>;

public const val `MAX_CACHE_ENTRY_INFO_SIZE`: UInt = 4096u;
public const val `MAX_GOPHER_ATTRIBUTE_NAME`: UInt = 128u;
public const val `MAX_GOPHER_CATEGORY_NAME`: UInt = 128u;
public const val `MAX_GOPHER_DISPLAY_TEXT`: UInt = 128u;
public const val `MAX_GOPHER_HOST_NAME`: UInt = 256u;
public const val `MAX_GOPHER_SELECTOR_TEXT`: UInt = 256u;
public const val `MIN_GOPHER_ATTRIBUTE_LENGTH`: UInt = 256u;
public const val `MUST_REVALIDATE_CACHE_ENTRY`: UInt = 256u;
public const val `MaxPrivacySettings`: UInt = 16384u;
public const val `NORMAL_CACHE_ENTRY`: UInt = 1u;
public const val `NameResolutionEnd`: `REQUEST_TIMES` = 1;
public const val `NameResolutionStart`: `REQUEST_TIMES` = 0;
public const val `OTHER_USER_CACHE_ENTRY`: UInt = 8388608u;
// UNSUPPORTED Rust 2295:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct OutgoingCookieState {
//     pub cSent: i32,
//     pub cSuppressed: i32,
//     pub pszLocation: windows_sys::core::PCSTR,
// }

// UNSUPPORTED Rust 2302:1: declaration Impl has no candidate rule
// impl Default for OutgoingCookieState {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PENDING_DELETE_CACHE_ENTRY`: UInt = 4194304u;
// UNSUPPORTED Rust 2308:1: generic scalar type unsupported
// pub type PFN_AUTH_NOTIFY = Option<unsafe extern "system" fn(param0: usize, param1: u32, param2: *mut core::ffi::c_void) -> u32>;

// UNSUPPORTED Rust 2309:1: generic scalar type unsupported
// pub type PFN_DIAL_HANDLER = Option<unsafe extern "system" fn(param0: super::super::Foundation::HWND, param1: windows_sys::core::PCSTR, param2: u32, param3: *mut u32) -> u32>;

public const val `POLICY_EXTENSION_TYPE_NONE`: `HTTP_POLICY_EXTENSION_TYPE` = 0;
public const val `POLICY_EXTENSION_TYPE_WINHTTP`: `HTTP_POLICY_EXTENSION_TYPE` = 1;
public const val `POLICY_EXTENSION_TYPE_WININET`: `HTTP_POLICY_EXTENSION_TYPE` = 2;
public const val `POLICY_EXTENSION_VERSION1`: `HTTP_POLICY_EXTENSION_VERSION` = 1;
public const val `POST_CHECK_CACHE_ENTRY`: UInt = 536870912u;
public const val `POST_RESPONSE_CACHE_ENTRY`: UInt = 67108864u;
public const val `PRIVACY_IMPACTED_CACHE_ENTRY`: UInt = 33554432u;
public const val `PRIVACY_MODE_CACHE_ENTRY`: UInt = 131072u;
public const val `PRIVACY_TEMPLATE_ADVANCED`: UInt = 101u;
public const val `PRIVACY_TEMPLATE_CUSTOM`: UInt = 100u;
public const val `PRIVACY_TEMPLATE_HIGH`: UInt = 1u;
public const val `PRIVACY_TEMPLATE_LOW`: UInt = 5u;
public const val `PRIVACY_TEMPLATE_MAX`: UInt = 5u;
public const val `PRIVACY_TEMPLATE_MEDIUM`: UInt = 3u;
public const val `PRIVACY_TEMPLATE_MEDIUM_HIGH`: UInt = 2u;
public const val `PRIVACY_TEMPLATE_MEDIUM_LOW`: UInt = 4u;
public const val `PRIVACY_TEMPLATE_NO_COOKIES`: UInt = 0u;
public const val `PRIVACY_TYPE_FIRST_PARTY`: UInt = 0u;
public const val `PRIVACY_TYPE_THIRD_PARTY`: UInt = 1u;
public typealias `PROXY_AUTO_DETECT_TYPE` = UInt;
public const val `PROXY_AUTO_DETECT_TYPE_DHCP`: `PROXY_AUTO_DETECT_TYPE` = 1u;
public const val `PROXY_AUTO_DETECT_TYPE_DNS_A`: `PROXY_AUTO_DETECT_TYPE` = 2u;
public const val `PROXY_TYPE_AUTO_DETECT`: UInt = 8u;
public const val `PROXY_TYPE_AUTO_PROXY_URL`: UInt = 4u;
public const val `PROXY_TYPE_DIRECT`: UInt = 1u;
public const val `PROXY_TYPE_PROXY`: UInt = 2u;
// UNSUPPORTED Rust 2336:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ProofOfPossessionCookieInfo {
//     pub name: windows_sys::core::PWSTR,
//     pub data: windows_sys::core::PWSTR,
//     pub flags: u32,
//     pub p3pHeader: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 2344:1: declaration Impl has no candidate rule
// impl Default for ProofOfPossessionCookieInfo {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2349:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const ProofOfPossessionCookieInfoManager: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa9927f85_a304_4390_8b23_a75f1c668600);

public const val `REDIRECT_CACHE_ENTRY`: UInt = 2048u;
// UNSUPPORTED Rust 2351:1: non-scalar type Ptr unsupported
// pub const REGSTR_DIAL_AUTOCONNECT: windows_sys::core::PCSTR = windows_sys::core::s!("AutoConnect");

// UNSUPPORTED Rust 2352:1: non-scalar type Ptr unsupported
// pub const REGSTR_LEASH_LEGACY_COOKIES: windows_sys::core::PCSTR = windows_sys::core::s!("LeashLegacyCookies");

public typealias `REQUEST_TIMES` = Int;
public const val `SECURITY_FLAG_128BIT`: UInt = 536870912u;
public const val `SECURITY_FLAG_40BIT`: UInt = 268435456u;
public const val `SECURITY_FLAG_56BIT`: UInt = 1073741824u;
public const val `SECURITY_FLAG_FORTEZZA`: UInt = 134217728u;
public const val `SECURITY_FLAG_IETFSSL4`: UInt = 32u;
public const val `SECURITY_FLAG_IGNORE_REDIRECT_TO_HTTP`: UInt = 32768u;
public const val `SECURITY_FLAG_IGNORE_REDIRECT_TO_HTTPS`: UInt = 16384u;
public const val `SECURITY_FLAG_IGNORE_REVOCATION`: UInt = 128u;
public const val `SECURITY_FLAG_IGNORE_WEAK_SIGNATURE`: UInt = 65536u;
public const val `SECURITY_FLAG_IGNORE_WRONG_USAGE`: UInt = 512u;
public const val `SECURITY_FLAG_NORMALBITNESS`: UInt = 268435456u;
public const val `SECURITY_FLAG_OPT_IN_WEAK_SIGNATURE`: UInt = 131072u;
public const val `SECURITY_FLAG_PCT`: UInt = 8u;
public const val `SECURITY_FLAG_PCT4`: UInt = 16u;
public const val `SECURITY_FLAG_SSL`: UInt = 2u;
public const val `SECURITY_FLAG_SSL3`: UInt = 4u;
public const val `SECURITY_FLAG_UNKNOWNBIT`: UInt = 2147483648u;
public const val `SHORTPATH_CACHE_ENTRY`: UInt = 512u;
public const val `SPARSE_CACHE_ENTRY`: UInt = 65536u;
public const val `STATIC_CACHE_ENTRY`: UInt = 128u;
public const val `STICKY_CACHE_ENTRY`: UInt = 4u;
public const val `TLSHandshakeEnd`: `REQUEST_TIMES` = 5;
public const val `TLSHandshakeStart`: `REQUEST_TIMES` = 4;
public const val `TRACK_OFFLINE_CACHE_ENTRY`: UInt = 16u;
public const val `TRACK_ONLINE_CACHE_ENTRY`: UInt = 32u;
// UNSUPPORTED Rust 2379:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct URLCACHE_ENTRY_INFO {
//     pub pwszSourceUrlName: windows_sys::core::PWSTR,
//     pub pwszLocalFileName: windows_sys::core::PWSTR,
//     pub dwCacheEntryType: u32,
//     pub dwUseCount: u32,
//     pub dwHitRate: u32,
//     pub dwSizeLow: u32,
//     pub dwSizeHigh: u32,
//     pub ftLastModifiedTime: super::super::Foundation::FILETIME,
//     pub ftExpireTime: super::super::Foundation::FILETIME,
//     pub ftLastAccessTime: super::super::Foundation::FILETIME,
//     pub ftLastSyncTime: super::super::Foundation::FILETIME,
//     pub pbHeaderInfo: *mut u8,
//     pub cbHeaderInfoSize: u32,
//     pub pbExtraData: *mut u8,
//     pub cbExtraDataSize: u32,
// }

// UNSUPPORTED Rust 2398:1: declaration Impl has no candidate rule
// impl Default for URLCACHE_ENTRY_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `URLHISTORY_CACHE_ENTRY`: UInt = 2097152u;
public typealias `URL_CACHE_LIMIT_TYPE` = Int;
// UNSUPPORTED Rust 2405:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct URL_COMPONENTSA {
//     pub dwStructSize: u32,
//     pub lpszScheme: windows_sys::core::PSTR,
//     pub dwSchemeLength: u32,
//     pub nScheme: INTERNET_SCHEME,
//     pub lpszHostName: windows_sys::core::PSTR,
//     pub dwHostNameLength: u32,
//     pub nPort: u16,
//     pub lpszUserName: windows_sys::core::PSTR,
//     pub dwUserNameLength: u32,
//     pub lpszPassword: windows_sys::core::PSTR,
//     pub dwPasswordLength: u32,
//     pub lpszUrlPath: windows_sys::core::PSTR,
//     pub dwUrlPathLength: u32,
//     pub lpszExtraInfo: windows_sys::core::PSTR,
//     pub dwExtraInfoLength: u32,
// }

// UNSUPPORTED Rust 2424:1: declaration Impl has no candidate rule
// impl Default for URL_COMPONENTSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2429:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct URL_COMPONENTSW {
//     pub dwStructSize: u32,
//     pub lpszScheme: windows_sys::core::PWSTR,
//     pub dwSchemeLength: u32,
//     pub nScheme: INTERNET_SCHEME,
//     pub lpszHostName: windows_sys::core::PWSTR,
//     pub dwHostNameLength: u32,
//     pub nPort: u16,
//     pub lpszUserName: windows_sys::core::PWSTR,
//     pub dwUserNameLength: u32,
//     pub lpszPassword: windows_sys::core::PWSTR,
//     pub dwPasswordLength: u32,
//     pub lpszUrlPath: windows_sys::core::PWSTR,
//     pub dwUrlPathLength: u32,
//     pub lpszExtraInfo: windows_sys::core::PWSTR,
//     pub dwExtraInfoLength: u32,
// }

// UNSUPPORTED Rust 2448:1: declaration Impl has no candidate rule
// impl Default for URL_COMPONENTSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `UrlCacheLimitTypeAppContainer`: `URL_CACHE_LIMIT_TYPE` = 2;
public const val `UrlCacheLimitTypeAppContainerTotal`: `URL_CACHE_LIMIT_TYPE` = 3;
public const val `UrlCacheLimitTypeIE`: `URL_CACHE_LIMIT_TYPE` = 0;
public const val `UrlCacheLimitTypeIETotal`: `URL_CACHE_LIMIT_TYPE` = 1;
public const val `UrlCacheLimitTypeNum`: `URL_CACHE_LIMIT_TYPE` = 4;
public const val `WININET_API_FLAG_ASYNC`: UInt = 1u;
public const val `WININET_API_FLAG_SYNC`: UInt = 4u;
public const val `WININET_API_FLAG_USE_CONTEXT`: UInt = 8u;
// UNSUPPORTED Rust 2461:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WININET_PROXY_INFO {
//     pub fProxy: windows_sys::core::BOOL,
//     pub fBypass: windows_sys::core::BOOL,
//     pub ProxyScheme: INTERNET_SCHEME,
//     pub pwszProxy: windows_sys::core::PWSTR,
//     pub ProxyPort: u16,
// }

// UNSUPPORTED Rust 2470:1: declaration Impl has no candidate rule
// impl Default for WININET_PROXY_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2475:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WININET_PROXY_INFO_LIST {
//     pub dwProxyInfoCount: u32,
//     pub pProxyInfo: *mut WININET_PROXY_INFO,
// }

// UNSUPPORTED Rust 2481:1: declaration Impl has no candidate rule
// impl Default for WININET_PROXY_INFO_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WININET_SYNC_MODE` = Int;
public const val `WININET_SYNC_MODE_ALWAYS`: `WININET_SYNC_MODE` = 3;
public const val `WININET_SYNC_MODE_AUTOMATIC`: `WININET_SYNC_MODE` = 4;
public const val `WININET_SYNC_MODE_DEFAULT`: `WININET_SYNC_MODE` = 4;
public const val `WININET_SYNC_MODE_NEVER`: `WININET_SYNC_MODE` = 0;
public const val `WININET_SYNC_MODE_ONCE_PER_SESSION`: `WININET_SYNC_MODE` = 2;
public const val `WININET_SYNC_MODE_ON_EXPIRY`: `WININET_SYNC_MODE` = 1;
public typealias `WPAD_CACHE_DELETE` = Int;
public const val `WPAD_CACHE_DELETE_ALL`: `WPAD_CACHE_DELETE` = 1;
public const val `WPAD_CACHE_DELETE_CURRENT`: `WPAD_CACHE_DELETE` = 0;
public const val `XDR_CACHE_ENTRY`: UInt = 262144u;
// UNSUPPORTED Rust 2497:1: generic scalar type unsupported
// pub type pfnInternetDeInitializeAutoProxyDll = Option<unsafe extern "system" fn(lpszmime: windows_sys::core::PCSTR, dwreserved: u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 2498:1: generic scalar type unsupported
// pub type pfnInternetGetProxyInfo = Option<unsafe extern "system" fn(lpszurl: windows_sys::core::PCSTR, dwurllength: u32, lpszurlhostname: windows_sys::core::PCSTR, dwurlhostnamelength: u32, lplpszproxyhostname: *mut windows_sys::core::PSTR, lpdwproxyhostnamelength: *mut u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 2499:1: generic scalar type unsupported
// pub type pfnInternetInitializeAutoProxyDll = Option<unsafe extern "system" fn(dwversion: u32, lpszdownloadedtempfile: windows_sys::core::PCSTR, lpszmime: windows_sys::core::PCSTR, lpautoproxycallbacks: *mut AutoProxyHelperFunctions, lpautoproxyscriptbuffer: *mut AUTO_PROXY_SCRIPT_BUFFER) -> windows_sys::core::BOOL>;

