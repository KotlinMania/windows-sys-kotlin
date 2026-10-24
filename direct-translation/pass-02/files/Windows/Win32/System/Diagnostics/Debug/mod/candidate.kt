// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Mod has no candidate rule
// #[cfg(feature = "Win32_System_Diagnostics_Debug_Extensions")]
// pub mod Extensions;

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Kernel")]
// windows_link::link!("kernel32.dll" "system" fn AddVectoredContinueHandler(first : u32, handler : PVECTORED_EXCEPTION_HANDLER) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Kernel")]
// windows_link::link!("kernel32.dll" "system" fn AddVectoredExceptionHandler(first : u32, handler : PVECTORED_EXCEPTION_HANDLER) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn Beep(dwfreq : u32, dwduration : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("imagehlp.dll" "system" fn BindImage(imagename : windows_sys::core::PCSTR, dllpath : windows_sys::core::PCSTR, symbolpath : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("imagehlp.dll" "system" fn BindImageEx(flags : u32, imagename : windows_sys::core::PCSTR, dllpath : windows_sys::core::PCSTR, symbolpath : windows_sys::core::PCSTR, statusroutine : PIMAGEHLP_STATUS_ROUTINE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn CheckRemoteDebuggerPresent(hprocess : super::super::super::Foundation:: HANDLE, pbdebuggerpresent : *mut windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// #[cfg(target_arch = "x86")]
// #[cfg(feature = "Win32_System_SystemInformation")]
// windows_link::link!("imagehlp.dll" "system" fn CheckSumMappedFile(baseaddress : *const core::ffi::c_void, filelength : u32, headersum : *mut u32, checksum : *mut u32) -> *mut IMAGE_NT_HEADERS32);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[cfg(feature = "Win32_System_SystemInformation")]
// windows_link::link!("imagehlp.dll" "system" fn CheckSumMappedFile(baseaddress : *const core::ffi::c_void, filelength : u32, headersum : *mut u32, checksum : *mut u32) -> *mut IMAGE_NT_HEADERS64);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn CloseThreadWaitChainSession(wcthandle : *const core::ffi::c_void));

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn ContinueDebugEvent(dwprocessid : u32, dwthreadid : u32, dwcontinuestatus : super::super::super::Foundation:: NTSTATUS) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Kernel")]
// windows_link::link!("kernel32.dll" "system" fn CopyContext(destination : *mut CONTEXT, contextflags : CONTEXT_FLAGS, source : *const CONTEXT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn DbgHelpCreateUserDump(filename : windows_sys::core::PCSTR, callback : PDBGHELP_CREATE_USER_DUMP_CALLBACK, userdata : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn DbgHelpCreateUserDumpW(filename : windows_sys::core::PCWSTR, callback : PDBGHELP_CREATE_USER_DUMP_CALLBACK, userdata : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn DebugActiveProcess(dwprocessid : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn DebugActiveProcessStop(dwprocessid : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn DebugBreak());

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn DebugBreakProcess(process : super::super::super::Foundation:: HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn DebugSetProcessKillOnExit(killonexit : windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn DecodePointer(ptr : *const core::ffi::c_void) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 29:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-core-util-l1-1-1.dll" "system" fn DecodeRemotePointer(processhandle : super::super::super::Foundation:: HANDLE, ptr : *const core::ffi::c_void, decodedptr : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 30:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn DecodeSystemPointer(ptr : *const core::ffi::c_void) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 31:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn EncodePointer(ptr : *const core::ffi::c_void) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 32:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-core-util-l1-1-1.dll" "system" fn EncodeRemotePointer(processhandle : super::super::super::Foundation:: HANDLE, ptr : *const core::ffi::c_void, encodedptr : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 33:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn EncodeSystemPointer(ptr : *const core::ffi::c_void) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 34:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn EnumDirTree(hprocess : super::super::super::Foundation:: HANDLE, rootpath : windows_sys::core::PCSTR, inputpathname : windows_sys::core::PCSTR, outputpathbuffer : windows_sys::core::PSTR, cb : PENUMDIRTREE_CALLBACK, data : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 35:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn EnumDirTreeW(hprocess : super::super::super::Foundation:: HANDLE, rootpath : windows_sys::core::PCWSTR, inputpathname : windows_sys::core::PCWSTR, outputpathbuffer : windows_sys::core::PWSTR, cb : PENUMDIRTREE_CALLBACKW, data : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 36:1: declaration Macro has no candidate rule
// #[cfg(target_arch = "x86")]
// windows_link::link!("dbghelp.dll" "system" fn EnumerateLoadedModules(hprocess : super::super::super::Foundation:: HANDLE, enumloadedmodulescallback : PENUMLOADED_MODULES_CALLBACK, usercontext : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 38:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn EnumerateLoadedModules64(hprocess : super::super::super::Foundation:: HANDLE, enumloadedmodulescallback : PENUMLOADED_MODULES_CALLBACK64, usercontext : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 39:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn EnumerateLoadedModulesEx(hprocess : super::super::super::Foundation:: HANDLE, enumloadedmodulescallback : PENUMLOADED_MODULES_CALLBACK64, usercontext : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 40:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn EnumerateLoadedModulesExW(hprocess : super::super::super::Foundation:: HANDLE, enumloadedmodulescallback : PENUMLOADED_MODULES_CALLBACKW64, usercontext : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 41:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn EnumerateLoadedModulesW64(hprocess : super::super::super::Foundation:: HANDLE, enumloadedmodulescallback : PENUMLOADED_MODULES_CALLBACKW64, usercontext : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 42:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn FatalAppExitA(uaction : u32, lpmessagetext : windows_sys::core::PCSTR));

// UNSUPPORTED Rust 43:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn FatalAppExitW(uaction : u32, lpmessagetext : windows_sys::core::PCWSTR));

// UNSUPPORTED Rust 44:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn FatalExit(exitcode : i32) -> !);

// UNSUPPORTED Rust 45:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn FindDebugInfoFile(filename : windows_sys::core::PCSTR, symbolpath : windows_sys::core::PCSTR, debugfilepath : windows_sys::core::PSTR) -> super::super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 46:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn FindDebugInfoFileEx(filename : windows_sys::core::PCSTR, symbolpath : windows_sys::core::PCSTR, debugfilepath : windows_sys::core::PSTR, callback : PFIND_DEBUG_FILE_CALLBACK, callerdata : *const core::ffi::c_void) -> super::super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 47:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn FindDebugInfoFileExW(filename : windows_sys::core::PCWSTR, symbolpath : windows_sys::core::PCWSTR, debugfilepath : windows_sys::core::PWSTR, callback : PFIND_DEBUG_FILE_CALLBACKW, callerdata : *const core::ffi::c_void) -> super::super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 48:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn FindExecutableImage(filename : windows_sys::core::PCSTR, symbolpath : windows_sys::core::PCSTR, imagefilepath : windows_sys::core::PSTR) -> super::super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 49:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn FindExecutableImageEx(filename : windows_sys::core::PCSTR, symbolpath : windows_sys::core::PCSTR, imagefilepath : windows_sys::core::PSTR, callback : PFIND_EXE_FILE_CALLBACK, callerdata : *const core::ffi::c_void) -> super::super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 50:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn FindExecutableImageExW(filename : windows_sys::core::PCWSTR, symbolpath : windows_sys::core::PCWSTR, imagefilepath : windows_sys::core::PWSTR, callback : PFIND_EXE_FILE_CALLBACKW, callerdata : *const core::ffi::c_void) -> super::super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 51:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn FindFileInPath(hprocess : super::super::super::Foundation:: HANDLE, searchpatha : windows_sys::core::PCSTR, filename : windows_sys::core::PCSTR, id : *const core::ffi::c_void, two : u32, three : u32, flags : u32, filepath : windows_sys::core::PSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 52:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn FindFileInSearchPath(hprocess : super::super::super::Foundation:: HANDLE, searchpatha : windows_sys::core::PCSTR, filename : windows_sys::core::PCSTR, one : u32, two : u32, three : u32, filepath : windows_sys::core::PSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 53:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn FlushInstructionCache(hprocess : super::super::super::Foundation:: HANDLE, lpbaseaddress : *const core::ffi::c_void, dwsize : usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 54:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn FormatMessageA(dwflags : FORMAT_MESSAGE_OPTIONS, lpsource : *const core::ffi::c_void, dwmessageid : u32, dwlanguageid : u32, lpbuffer : windows_sys::core::PSTR, nsize : u32, arguments : *const *const i8) -> u32);

// UNSUPPORTED Rust 55:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn FormatMessageW(dwflags : FORMAT_MESSAGE_OPTIONS, lpsource : *const core::ffi::c_void, dwmessageid : u32, dwlanguageid : u32, lpbuffer : windows_sys::core::PWSTR, nsize : u32, arguments : *const *const i8) -> u32);

// UNSUPPORTED Rust 56:1: declaration Macro has no candidate rule
// #[cfg(any(target_arch = "arm64ec", target_arch = "x86", target_arch = "x86_64"))]
// windows_link::link!("kernel32.dll" "system" fn GetEnabledXStateFeatures() -> u64);

// UNSUPPORTED Rust 58:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetErrorMode() -> u32);

// UNSUPPORTED Rust 59:1: declaration Macro has no candidate rule
// #[cfg(target_arch = "x86")]
// #[cfg(all(feature = "Win32_System_Kernel", feature = "Win32_System_SystemInformation"))]
// windows_link::link!("imagehlp.dll" "system" fn GetImageConfigInformation(loadedimage : *const LOADED_IMAGE, imageconfiginformation : *mut IMAGE_LOAD_CONFIG_DIRECTORY32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 62:1: declaration Macro has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[cfg(all(feature = "Win32_System_Kernel", feature = "Win32_System_SystemInformation"))]
// windows_link::link!("imagehlp.dll" "system" fn GetImageConfigInformation(loadedimage : *const LOADED_IMAGE, imageconfiginformation : *mut IMAGE_LOAD_CONFIG_DIRECTORY64) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 65:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Kernel", feature = "Win32_System_SystemInformation"))]
// windows_link::link!("imagehlp.dll" "system" fn GetImageUnusedHeaderBytes(loadedimage : *const LOADED_IMAGE, sizeunusedheaderbytes : *mut u32) -> u32);

// UNSUPPORTED Rust 67:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn GetSymLoadError() -> u32);

// UNSUPPORTED Rust 68:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Kernel")]
// windows_link::link!("kernel32.dll" "system" fn GetThreadContext(hthread : super::super::super::Foundation:: HANDLE, lpcontext : *mut CONTEXT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 70:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetThreadErrorMode() -> u32);

// UNSUPPORTED Rust 71:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn GetThreadSelectorEntry(hthread : super::super::super::Foundation:: HANDLE, dwselector : u32, lpselectorentry : *mut LDT_ENTRY) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 72:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn GetThreadWaitChain(wcthandle : *const core::ffi::c_void, context : usize, flags : WAIT_CHAIN_THREAD_OPTIONS, threadid : u32, nodecount : *mut u32, nodeinfoarray : *mut WAITCHAIN_NODE_INFO, iscycle : *mut windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 73:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn GetTimestampForLoadedLibrary(module : super::super::super::Foundation:: HMODULE) -> u32);

// UNSUPPORTED Rust 74:1: declaration Macro has no candidate rule
// #[cfg(any(target_arch = "arm64ec", target_arch = "x86", target_arch = "x86_64"))]
// #[cfg(feature = "Win32_System_Kernel")]
// windows_link::link!("kernel32.dll" "system" fn GetXStateFeaturesMask(context : *const CONTEXT, featuremask : *mut u64) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 77:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_WinTrust")]
// windows_link::link!("imagehlp.dll" "system" fn ImageAddCertificate(filehandle : super::super::super::Foundation:: HANDLE, certificate : *const super::super::super::Security::WinTrust:: WIN_CERTIFICATE, index : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 79:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn ImageDirectoryEntryToData(base : *const core::ffi::c_void, mappedasimage : bool, directoryentry : IMAGE_DIRECTORY_ENTRY, size : *mut u32) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 80:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn ImageDirectoryEntryToDataEx(base : *const core::ffi::c_void, mappedasimage : bool, directoryentry : IMAGE_DIRECTORY_ENTRY, size : *mut u32, foundheader : *mut *mut IMAGE_SECTION_HEADER) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 81:1: declaration Macro has no candidate rule
// windows_link::link!("imagehlp.dll" "system" fn ImageEnumerateCertificates(filehandle : super::super::super::Foundation:: HANDLE, typefilter : u16, certificatecount : *mut u32, indices : *mut u32, indexcount : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 82:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_WinTrust")]
// windows_link::link!("imagehlp.dll" "system" fn ImageGetCertificateData(filehandle : super::super::super::Foundation:: HANDLE, certificateindex : u32, certificate : *mut super::super::super::Security::WinTrust:: WIN_CERTIFICATE, requiredlength : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 84:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security_WinTrust")]
// windows_link::link!("imagehlp.dll" "system" fn ImageGetCertificateHeader(filehandle : super::super::super::Foundation:: HANDLE, certificateindex : u32, certificateheader : *mut super::super::super::Security::WinTrust:: WIN_CERTIFICATE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 86:1: declaration Macro has no candidate rule
// windows_link::link!("imagehlp.dll" "system" fn ImageGetDigestStream(filehandle : super::super::super::Foundation:: HANDLE, digestlevel : u32, digestfunction : DIGEST_FUNCTION, digesthandle : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 87:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Kernel", feature = "Win32_System_SystemInformation"))]
// windows_link::link!("imagehlp.dll" "system" fn ImageLoad(dllname : windows_sys::core::PCSTR, dllpath : windows_sys::core::PCSTR) -> *mut LOADED_IMAGE);

// UNSUPPORTED Rust 89:1: declaration Macro has no candidate rule
// #[cfg(target_arch = "x86")]
// #[cfg(feature = "Win32_System_SystemInformation")]
// windows_link::link!("dbghelp.dll" "system" fn ImageNtHeader(base : *const core::ffi::c_void) -> *mut IMAGE_NT_HEADERS32);

// UNSUPPORTED Rust 92:1: declaration Macro has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[cfg(feature = "Win32_System_SystemInformation")]
// windows_link::link!("dbghelp.dll" "system" fn ImageNtHeader(base : *const core::ffi::c_void) -> *mut IMAGE_NT_HEADERS64);

// UNSUPPORTED Rust 95:1: declaration Macro has no candidate rule
// windows_link::link!("imagehlp.dll" "system" fn ImageRemoveCertificate(filehandle : super::super::super::Foundation:: HANDLE, index : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 96:1: declaration Macro has no candidate rule
// #[cfg(target_arch = "x86")]
// #[cfg(feature = "Win32_System_SystemInformation")]
// windows_link::link!("dbghelp.dll" "system" fn ImageRvaToSection(ntheaders : *const IMAGE_NT_HEADERS32, base : *const core::ffi::c_void, rva : u32) -> *mut IMAGE_SECTION_HEADER);

// UNSUPPORTED Rust 99:1: declaration Macro has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[cfg(feature = "Win32_System_SystemInformation")]
// windows_link::link!("dbghelp.dll" "system" fn ImageRvaToSection(ntheaders : *const IMAGE_NT_HEADERS64, base : *const core::ffi::c_void, rva : u32) -> *mut IMAGE_SECTION_HEADER);

// UNSUPPORTED Rust 102:1: declaration Macro has no candidate rule
// #[cfg(target_arch = "x86")]
// #[cfg(feature = "Win32_System_SystemInformation")]
// windows_link::link!("dbghelp.dll" "system" fn ImageRvaToVa(ntheaders : *const IMAGE_NT_HEADERS32, base : *const core::ffi::c_void, rva : u32, lastrvasection : *const *const IMAGE_SECTION_HEADER) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 105:1: declaration Macro has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[cfg(feature = "Win32_System_SystemInformation")]
// windows_link::link!("dbghelp.dll" "system" fn ImageRvaToVa(ntheaders : *const IMAGE_NT_HEADERS64, base : *const core::ffi::c_void, rva : u32, lastrvasection : *const *const IMAGE_SECTION_HEADER) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 108:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Kernel", feature = "Win32_System_SystemInformation"))]
// windows_link::link!("imagehlp.dll" "system" fn ImageUnload(loadedimage : *mut LOADED_IMAGE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 110:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn ImagehlpApiVersion() -> *mut API_VERSION);

// UNSUPPORTED Rust 111:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn ImagehlpApiVersionEx(appversion : *const API_VERSION) -> *mut API_VERSION);

// UNSUPPORTED Rust 112:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Kernel")]
// windows_link::link!("kernel32.dll" "system" fn InitializeContext(buffer : *mut core::ffi::c_void, contextflags : CONTEXT_FLAGS, context : *mut *mut CONTEXT, contextlength : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 114:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Kernel")]
// windows_link::link!("kernel32.dll" "system" fn InitializeContext2(buffer : *mut core::ffi::c_void, contextflags : CONTEXT_FLAGS, context : *mut *mut CONTEXT, contextlength : *mut u32, xstatecompactionmask : u64) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 116:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn IsDebuggerPresent() -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 117:1: declaration Macro has no candidate rule
// #[cfg(any(target_arch = "arm64ec", target_arch = "x86", target_arch = "x86_64"))]
// #[cfg(feature = "Win32_System_Kernel")]
// windows_link::link!("kernel32.dll" "system" fn LocateXStateFeature(context : *const CONTEXT, featureid : u32, length : *mut u32) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 120:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn MakeSureDirectoryPathExists(dirpath : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 121:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Kernel", feature = "Win32_System_SystemInformation"))]
// windows_link::link!("imagehlp.dll" "system" fn MapAndLoad(imagename : windows_sys::core::PCSTR, dllpath : windows_sys::core::PCSTR, loadedimage : *mut LOADED_IMAGE, dotdll : windows_sys::core::BOOL, readonly : windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 123:1: declaration Macro has no candidate rule
// windows_link::link!("imagehlp.dll" "system" fn MapFileAndCheckSumA(filename : windows_sys::core::PCSTR, headersum : *mut u32, checksum : *mut u32) -> u32);

// UNSUPPORTED Rust 124:1: declaration Macro has no candidate rule
// windows_link::link!("imagehlp.dll" "system" fn MapFileAndCheckSumW(filename : windows_sys::core::PCWSTR, headersum : *mut u32, checksum : *mut u32) -> u32);

// UNSUPPORTED Rust 125:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// windows_link::link!("user32.dll" "system" fn MessageBeep(utype : super::super::super::UI::WindowsAndMessaging:: MESSAGEBOX_STYLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 127:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn MiniDumpReadDumpStream(baseofdump : *const core::ffi::c_void, streamnumber : u32, dir : *mut *mut MINIDUMP_DIRECTORY, streampointer : *mut *mut core::ffi::c_void, streamsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 128:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_Storage_FileSystem", feature = "Win32_System_Kernel", feature = "Win32_System_Memory"))]
// windows_link::link!("dbghelp.dll" "system" fn MiniDumpWriteDump(hprocess : super::super::super::Foundation:: HANDLE, processid : u32, hfile : super::super::super::Foundation:: HANDLE, dumptype : MINIDUMP_TYPE, exceptionparam : *const MINIDUMP_EXCEPTION_INFORMATION, userstreamparam : *const MINIDUMP_USER_STREAM_INFORMATION, callbackparam : *const MINIDUMP_CALLBACK_INFORMATION) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 130:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn OpenThreadWaitChainSession(flags : OPEN_THREAD_WAIT_CHAIN_SESSION_FLAGS, callback : PWAITCHAINCALLBACK) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 131:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn OutputDebugStringA(lpoutputstring : windows_sys::core::PCSTR));

// UNSUPPORTED Rust 132:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn OutputDebugStringW(lpoutputstring : windows_sys::core::PCWSTR));

// UNSUPPORTED Rust 133:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn RaiseException(dwexceptioncode : u32, dwexceptionflags : u32, nnumberofarguments : u32, lparguments : *const usize));

// UNSUPPORTED Rust 134:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Kernel")]
// windows_link::link!("kernel32.dll" "system" fn RaiseFailFastException(pexceptionrecord : *const EXCEPTION_RECORD, pcontextrecord : *const CONTEXT, dwflags : u32));

// UNSUPPORTED Rust 136:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn RangeMapAddPeImageSections(rmaphandle : *const core::ffi::c_void, imagename : windows_sys::core::PCWSTR, mappedimage : *const core::ffi::c_void, mappingbytes : u32, imagebase : u64, usertag : u64, mappingflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 137:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn RangeMapCreate() -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 138:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn RangeMapFree(rmaphandle : *const core::ffi::c_void));

// UNSUPPORTED Rust 139:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn RangeMapRead(rmaphandle : *const core::ffi::c_void, offset : u64, buffer : *mut core::ffi::c_void, requestbytes : u32, flags : u32, donebytes : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 140:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn RangeMapRemove(rmaphandle : *const core::ffi::c_void, usertag : u64) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 141:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn RangeMapWrite(rmaphandle : *const core::ffi::c_void, offset : u64, buffer : *const core::ffi::c_void, requestbytes : u32, flags : u32, donebytes : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 142:1: declaration Macro has no candidate rule
// windows_link::link!("imagehlp.dll" "system" fn ReBaseImage(currentimagename : windows_sys::core::PCSTR, symbolpath : windows_sys::core::PCSTR, frebase : windows_sys::core::BOOL, frebasesysfileok : windows_sys::core::BOOL, fgoingdown : windows_sys::core::BOOL, checkimagesize : u32, oldimagesize : *mut u32, oldimagebase : *mut usize, newimagesize : *mut u32, newimagebase : *mut usize, timestamp : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 143:1: declaration Macro has no candidate rule
// windows_link::link!("imagehlp.dll" "system" fn ReBaseImage64(currentimagename : windows_sys::core::PCSTR, symbolpath : windows_sys::core::PCSTR, frebase : windows_sys::core::BOOL, frebasesysfileok : windows_sys::core::BOOL, fgoingdown : windows_sys::core::BOOL, checkimagesize : u32, oldimagesize : *mut u32, oldimagebase : *mut u64, newimagesize : *mut u32, newimagebase : *mut u64, timestamp : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 144:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn ReadProcessMemory(hprocess : super::super::super::Foundation:: HANDLE, lpbaseaddress : *const core::ffi::c_void, lpbuffer : *mut core::ffi::c_void, nsize : usize, lpnumberofbytesread : *mut usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 145:1: declaration Macro has no candidate rule
// windows_link::link!("advapi32.dll" "system" fn RegisterWaitChainCOMCallback(callstatecallback : PCOGETCALLSTATE, activationstatecallback : PCOGETACTIVATIONSTATE));

// UNSUPPORTED Rust 146:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn RemoveInvalidModuleList(hprocess : super::super::super::Foundation:: HANDLE));

// UNSUPPORTED Rust 147:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn RemoveVectoredContinueHandler(handle : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 148:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn RemoveVectoredExceptionHandler(handle : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 149:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn ReportSymbolLoadSummary(hprocess : super::super::super::Foundation:: HANDLE, ploadmodule : windows_sys::core::PCWSTR, psymboldata : *const DBGHELP_DATA_REPORT_STRUCT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 150:1: declaration Macro has no candidate rule
// #[cfg(any(target_arch = "arm64ec", target_arch = "x86_64"))]
// windows_link::link!("kernel32.dll" "system" fn RtlAddFunctionTable(functiontable : *const IMAGE_RUNTIME_FUNCTION_ENTRY, entrycount : u32, baseaddress : u64) -> bool);

// UNSUPPORTED Rust 152:1: declaration Macro has no candidate rule
// #[cfg(target_arch = "aarch64")]
// windows_link::link!("kernel32.dll" "system" fn RtlAddFunctionTable(functiontable : *const IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY, entrycount : u32, baseaddress : usize) -> bool);

// UNSUPPORTED Rust 154:1: declaration Macro has no candidate rule
// #[cfg(any(target_arch = "arm64ec", target_arch = "x86_64"))]
// windows_link::link!("ntdll.dll" "system" fn RtlAddGrowableFunctionTable(dynamictable : *mut *mut core::ffi::c_void, functiontable : *const IMAGE_RUNTIME_FUNCTION_ENTRY, entrycount : u32, maximumentrycount : u32, rangebase : usize, rangeend : usize) -> u32);

// UNSUPPORTED Rust 156:1: declaration Macro has no candidate rule
// #[cfg(target_arch = "aarch64")]
// windows_link::link!("ntdll.dll" "system" fn RtlAddGrowableFunctionTable(dynamictable : *mut *mut core::ffi::c_void, functiontable : *const IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY, entrycount : u32, maximumentrycount : u32, rangebase : usize, rangeend : usize) -> u32);

// UNSUPPORTED Rust 158:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Kernel")]
// windows_link::link!("kernel32.dll" "system" fn RtlCaptureContext(contextrecord : *mut CONTEXT));

// UNSUPPORTED Rust 160:1: declaration Macro has no candidate rule
// #[cfg(any(target_arch = "arm64ec", target_arch = "x86_64"))]
// #[cfg(feature = "Win32_System_Kernel")]
// windows_link::link!("kernel32.dll" "system" fn RtlCaptureContext2(contextrecord : *mut CONTEXT));

// UNSUPPORTED Rust 163:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn RtlCaptureStackBackTrace(framestoskip : u32, framestocapture : u32, backtrace : *mut *mut core::ffi::c_void, backtracehash : *mut u32) -> u16);

// UNSUPPORTED Rust 164:1: declaration Macro has no candidate rule
// #[cfg(any(target_arch = "arm64ec", target_arch = "x86_64"))]
// windows_link::link!("kernel32.dll" "system" fn RtlDeleteFunctionTable(functiontable : *const IMAGE_RUNTIME_FUNCTION_ENTRY) -> bool);

// UNSUPPORTED Rust 166:1: declaration Macro has no candidate rule
// #[cfg(target_arch = "aarch64")]
// windows_link::link!("kernel32.dll" "system" fn RtlDeleteFunctionTable(functiontable : *const IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY) -> bool);

// UNSUPPORTED Rust 168:1: declaration Macro has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// windows_link::link!("ntdll.dll" "system" fn RtlDeleteGrowableFunctionTable(dynamictable : *const core::ffi::c_void));

// UNSUPPORTED Rust 170:1: declaration Macro has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// windows_link::link!("ntdll.dll" "system" fn RtlGrowFunctionTable(dynamictable : *mut core::ffi::c_void, newentrycount : u32));

// UNSUPPORTED Rust 172:1: declaration Macro has no candidate rule
// #[cfg(any(target_arch = "arm64ec", target_arch = "x86_64"))]
// windows_link::link!("kernel32.dll" "system" fn RtlInstallFunctionTableCallback(tableidentifier : u64, baseaddress : u64, length : u32, callback : PGET_RUNTIME_FUNCTION_CALLBACK, context : *const core::ffi::c_void, outofprocesscallbackdll : windows_sys::core::PCWSTR) -> bool);

// UNSUPPORTED Rust 174:1: declaration Macro has no candidate rule
// #[cfg(target_arch = "aarch64")]
// windows_link::link!("kernel32.dll" "system" fn RtlInstallFunctionTableCallback(tableidentifier : u64, baseaddress : u64, length : u32, callback : PGET_RUNTIME_FUNCTION_CALLBACK, context : *const core::ffi::c_void, outofprocesscallbackdll : windows_sys::core::PCWSTR) -> bool);

// UNSUPPORTED Rust 176:1: declaration Macro has no candidate rule
// #[cfg(any(target_arch = "arm64ec", target_arch = "x86_64"))]
// windows_link::link!("kernel32.dll" "system" fn RtlLookupFunctionEntry(controlpc : u64, imagebase : *mut u64, historytable : *mut UNWIND_HISTORY_TABLE) -> *mut IMAGE_RUNTIME_FUNCTION_ENTRY);

// UNSUPPORTED Rust 178:1: declaration Macro has no candidate rule
// #[cfg(target_arch = "aarch64")]
// windows_link::link!("kernel32.dll" "system" fn RtlLookupFunctionEntry(controlpc : usize, imagebase : *mut usize, historytable : *mut UNWIND_HISTORY_TABLE) -> *mut IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY);

// UNSUPPORTED Rust 180:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn RtlPcToFileHeader(pcvalue : *const core::ffi::c_void, baseofimage : *mut *mut core::ffi::c_void) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 181:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn RtlRaiseException(exceptionrecord : *const EXCEPTION_RECORD));

// UNSUPPORTED Rust 182:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Kernel")]
// windows_link::link!("kernel32.dll" "C" fn RtlRestoreContext(contextrecord : *const CONTEXT, exceptionrecord : *const EXCEPTION_RECORD));

// UNSUPPORTED Rust 184:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn RtlUnwind(targetframe : *const core::ffi::c_void, targetip : *const core::ffi::c_void, exceptionrecord : *const EXCEPTION_RECORD, returnvalue : *const core::ffi::c_void));

// UNSUPPORTED Rust 185:1: declaration Macro has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[cfg(feature = "Win32_System_Kernel")]
// windows_link::link!("kernel32.dll" "system" fn RtlUnwindEx(targetframe : *const core::ffi::c_void, targetip : *const core::ffi::c_void, exceptionrecord : *const EXCEPTION_RECORD, returnvalue : *const core::ffi::c_void, contextrecord : *const CONTEXT, historytable : *const UNWIND_HISTORY_TABLE));

// UNSUPPORTED Rust 188:1: declaration Macro has no candidate rule
// #[cfg(any(target_arch = "arm64ec", target_arch = "x86_64"))]
// #[cfg(feature = "Win32_System_Kernel")]
// windows_link::link!("kernel32.dll" "system" fn RtlVirtualUnwind(handlertype : RTL_VIRTUAL_UNWIND_HANDLER_TYPE, imagebase : u64, controlpc : u64, functionentry : *const IMAGE_RUNTIME_FUNCTION_ENTRY, contextrecord : *mut CONTEXT, handlerdata : *mut *mut core::ffi::c_void, establisherframe : *mut u64, contextpointers : *mut KNONVOLATILE_CONTEXT_POINTERS) -> super::super::Kernel:: EXCEPTION_ROUTINE);

// UNSUPPORTED Rust 191:1: declaration Macro has no candidate rule
// #[cfg(target_arch = "aarch64")]
// #[cfg(feature = "Win32_System_Kernel")]
// windows_link::link!("kernel32.dll" "system" fn RtlVirtualUnwind(handlertype : RTL_VIRTUAL_UNWIND_HANDLER_TYPE, imagebase : usize, controlpc : usize, functionentry : *const IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY, contextrecord : *mut CONTEXT, handlerdata : *mut *mut core::ffi::c_void, establisherframe : *mut usize, contextpointers : *mut KNONVOLATILE_CONTEXT_POINTERS) -> super::super::Kernel:: EXCEPTION_ROUTINE);

// UNSUPPORTED Rust 194:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SearchTreeForFile(rootpath : windows_sys::core::PCSTR, inputpathname : windows_sys::core::PCSTR, outputpathbuffer : windows_sys::core::PSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 195:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SearchTreeForFileW(rootpath : windows_sys::core::PCWSTR, inputpathname : windows_sys::core::PCWSTR, outputpathbuffer : windows_sys::core::PWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 196:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SetCheckUserInterruptShared(lpstartaddress : LPCALL_BACK_USER_INTERRUPT_ROUTINE));

// UNSUPPORTED Rust 197:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn SetErrorMode(umode : THREAD_ERROR_MODE) -> THREAD_ERROR_MODE);

// UNSUPPORTED Rust 198:1: declaration Macro has no candidate rule
// #[cfg(target_arch = "x86")]
// #[cfg(all(feature = "Win32_System_Kernel", feature = "Win32_System_SystemInformation"))]
// windows_link::link!("imagehlp.dll" "system" fn SetImageConfigInformation(loadedimage : *mut LOADED_IMAGE, imageconfiginformation : *const IMAGE_LOAD_CONFIG_DIRECTORY32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 201:1: declaration Macro has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[cfg(all(feature = "Win32_System_Kernel", feature = "Win32_System_SystemInformation"))]
// windows_link::link!("imagehlp.dll" "system" fn SetImageConfigInformation(loadedimage : *mut LOADED_IMAGE, imageconfiginformation : *const IMAGE_LOAD_CONFIG_DIRECTORY64) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 204:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SetSymLoadError(error : u32));

// UNSUPPORTED Rust 205:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Kernel")]
// windows_link::link!("kernel32.dll" "system" fn SetThreadContext(hthread : super::super::super::Foundation:: HANDLE, lpcontext : *const CONTEXT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 207:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn SetThreadErrorMode(dwnewmode : THREAD_ERROR_MODE, lpoldmode : *mut THREAD_ERROR_MODE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 208:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Kernel")]
// windows_link::link!("kernel32.dll" "system" fn SetUnhandledExceptionFilter(lptoplevelexceptionfilter : LPTOP_LEVEL_EXCEPTION_FILTER) -> LPTOP_LEVEL_EXCEPTION_FILTER);

// UNSUPPORTED Rust 210:1: declaration Macro has no candidate rule
// #[cfg(any(target_arch = "arm64ec", target_arch = "x86", target_arch = "x86_64"))]
// #[cfg(feature = "Win32_System_Kernel")]
// windows_link::link!("kernel32.dll" "system" fn SetXStateFeaturesMask(context : *mut CONTEXT, featuremask : u64) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 213:1: declaration Macro has no candidate rule
// #[cfg(target_arch = "x86")]
// windows_link::link!("dbghelp.dll" "system" fn StackWalk(machinetype : u32, hprocess : super::super::super::Foundation:: HANDLE, hthread : super::super::super::Foundation:: HANDLE, stackframe : *mut STACKFRAME, contextrecord : *mut core::ffi::c_void, readmemoryroutine : PREAD_PROCESS_MEMORY_ROUTINE, functiontableaccessroutine : PFUNCTION_TABLE_ACCESS_ROUTINE, getmodulebaseroutine : PGET_MODULE_BASE_ROUTINE, translateaddress : PTRANSLATE_ADDRESS_ROUTINE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 215:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn StackWalk2(machinetype : u32, hprocess : super::super::super::Foundation:: HANDLE, hthread : super::super::super::Foundation:: HANDLE, stackframe : *mut STACKFRAME_EX, contextrecord : *mut core::ffi::c_void, readmemoryroutine : PREAD_PROCESS_MEMORY_ROUTINE64, functiontableaccessroutine : PFUNCTION_TABLE_ACCESS_ROUTINE64, getmodulebaseroutine : PGET_MODULE_BASE_ROUTINE64, translateaddress : PTRANSLATE_ADDRESS_ROUTINE64, gettargetattributevalue : PGET_TARGET_ATTRIBUTE_VALUE64, flags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 216:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn StackWalk64(machinetype : u32, hprocess : super::super::super::Foundation:: HANDLE, hthread : super::super::super::Foundation:: HANDLE, stackframe : *mut STACKFRAME64, contextrecord : *mut core::ffi::c_void, readmemoryroutine : PREAD_PROCESS_MEMORY_ROUTINE64, functiontableaccessroutine : PFUNCTION_TABLE_ACCESS_ROUTINE64, getmodulebaseroutine : PGET_MODULE_BASE_ROUTINE64, translateaddress : PTRANSLATE_ADDRESS_ROUTINE64) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 217:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn StackWalkEx(machinetype : u32, hprocess : super::super::super::Foundation:: HANDLE, hthread : super::super::super::Foundation:: HANDLE, stackframe : *mut STACKFRAME_EX, contextrecord : *mut core::ffi::c_void, readmemoryroutine : PREAD_PROCESS_MEMORY_ROUTINE64, functiontableaccessroutine : PFUNCTION_TABLE_ACCESS_ROUTINE64, getmodulebaseroutine : PGET_MODULE_BASE_ROUTINE64, translateaddress : PTRANSLATE_ADDRESS_ROUTINE64, flags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 218:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymAddSourceStream(hprocess : super::super::super::Foundation:: HANDLE, base : u64, streamfile : windows_sys::core::PCSTR, buffer : *const u8, size : usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 219:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymAddSourceStreamA(hprocess : super::super::super::Foundation:: HANDLE, base : u64, streamfile : windows_sys::core::PCSTR, buffer : *const u8, size : usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 220:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymAddSourceStreamW(hprocess : super::super::super::Foundation:: HANDLE, base : u64, filespec : windows_sys::core::PCWSTR, buffer : *const u8, size : usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 221:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymAddSymbol(hprocess : super::super::super::Foundation:: HANDLE, baseofdll : u64, name : windows_sys::core::PCSTR, address : u64, size : u32, flags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 222:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymAddSymbolW(hprocess : super::super::super::Foundation:: HANDLE, baseofdll : u64, name : windows_sys::core::PCWSTR, address : u64, size : u32, flags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 223:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymAddrIncludeInlineTrace(hprocess : super::super::super::Foundation:: HANDLE, address : u64) -> u32);

// UNSUPPORTED Rust 224:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymCleanup(hprocess : super::super::super::Foundation:: HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 225:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymCompareInlineTrace(hprocess : super::super::super::Foundation:: HANDLE, address1 : u64, inlinecontext1 : u32, retaddress1 : u64, address2 : u64, retaddress2 : u64) -> u32);

// UNSUPPORTED Rust 226:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymDeleteSymbol(hprocess : super::super::super::Foundation:: HANDLE, baseofdll : u64, name : windows_sys::core::PCSTR, address : u64, flags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 227:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymDeleteSymbolW(hprocess : super::super::super::Foundation:: HANDLE, baseofdll : u64, name : windows_sys::core::PCWSTR, address : u64, flags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 228:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymEnumLines(hprocess : super::super::super::Foundation:: HANDLE, base : u64, obj : windows_sys::core::PCSTR, file : windows_sys::core::PCSTR, enumlinescallback : PSYM_ENUMLINES_CALLBACK, usercontext : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 229:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymEnumLinesW(hprocess : super::super::super::Foundation:: HANDLE, base : u64, obj : windows_sys::core::PCWSTR, file : windows_sys::core::PCWSTR, enumlinescallback : PSYM_ENUMLINES_CALLBACKW, usercontext : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 230:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymEnumProcesses(enumprocessescallback : PSYM_ENUMPROCESSES_CALLBACK, usercontext : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 231:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymEnumSourceFileTokens(hprocess : super::super::super::Foundation:: HANDLE, base : u64, callback : PENUMSOURCEFILETOKENSCALLBACK) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 232:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymEnumSourceFiles(hprocess : super::super::super::Foundation:: HANDLE, modbase : u64, mask : windows_sys::core::PCSTR, cbsrcfiles : PSYM_ENUMSOURCEFILES_CALLBACK, usercontext : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 233:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymEnumSourceFilesW(hprocess : super::super::super::Foundation:: HANDLE, modbase : u64, mask : windows_sys::core::PCWSTR, cbsrcfiles : PSYM_ENUMSOURCEFILES_CALLBACKW, usercontext : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 234:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymEnumSourceLines(hprocess : super::super::super::Foundation:: HANDLE, base : u64, obj : windows_sys::core::PCSTR, file : windows_sys::core::PCSTR, line : u32, flags : u32, enumlinescallback : PSYM_ENUMLINES_CALLBACK, usercontext : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 235:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymEnumSourceLinesW(hprocess : super::super::super::Foundation:: HANDLE, base : u64, obj : windows_sys::core::PCWSTR, file : windows_sys::core::PCWSTR, line : u32, flags : u32, enumlinescallback : PSYM_ENUMLINES_CALLBACKW, usercontext : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 236:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymEnumSym(hprocess : super::super::super::Foundation:: HANDLE, baseofdll : u64, enumsymbolscallback : PSYM_ENUMERATESYMBOLS_CALLBACK, usercontext : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 237:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymEnumSymbols(hprocess : super::super::super::Foundation:: HANDLE, baseofdll : u64, mask : windows_sys::core::PCSTR, enumsymbolscallback : PSYM_ENUMERATESYMBOLS_CALLBACK, usercontext : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 238:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymEnumSymbolsEx(hprocess : super::super::super::Foundation:: HANDLE, baseofdll : u64, mask : windows_sys::core::PCSTR, enumsymbolscallback : PSYM_ENUMERATESYMBOLS_CALLBACK, usercontext : *const core::ffi::c_void, options : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 239:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymEnumSymbolsExW(hprocess : super::super::super::Foundation:: HANDLE, baseofdll : u64, mask : windows_sys::core::PCWSTR, enumsymbolscallback : PSYM_ENUMERATESYMBOLS_CALLBACKW, usercontext : *const core::ffi::c_void, options : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 240:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymEnumSymbolsForAddr(hprocess : super::super::super::Foundation:: HANDLE, address : u64, enumsymbolscallback : PSYM_ENUMERATESYMBOLS_CALLBACK, usercontext : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 241:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymEnumSymbolsForAddrW(hprocess : super::super::super::Foundation:: HANDLE, address : u64, enumsymbolscallback : PSYM_ENUMERATESYMBOLS_CALLBACKW, usercontext : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 242:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymEnumSymbolsW(hprocess : super::super::super::Foundation:: HANDLE, baseofdll : u64, mask : windows_sys::core::PCWSTR, enumsymbolscallback : PSYM_ENUMERATESYMBOLS_CALLBACKW, usercontext : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 243:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymEnumTypes(hprocess : super::super::super::Foundation:: HANDLE, baseofdll : u64, enumsymbolscallback : PSYM_ENUMERATESYMBOLS_CALLBACK, usercontext : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 244:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymEnumTypesByName(hprocess : super::super::super::Foundation:: HANDLE, baseofdll : u64, mask : windows_sys::core::PCSTR, enumsymbolscallback : PSYM_ENUMERATESYMBOLS_CALLBACK, usercontext : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 245:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymEnumTypesByNameW(hprocess : super::super::super::Foundation:: HANDLE, baseofdll : u64, mask : windows_sys::core::PCWSTR, enumsymbolscallback : PSYM_ENUMERATESYMBOLS_CALLBACKW, usercontext : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 246:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymEnumTypesW(hprocess : super::super::super::Foundation:: HANDLE, baseofdll : u64, enumsymbolscallback : PSYM_ENUMERATESYMBOLS_CALLBACKW, usercontext : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 247:1: declaration Macro has no candidate rule
// #[cfg(target_arch = "x86")]
// windows_link::link!("dbghelp.dll" "system" fn SymEnumerateModules(hprocess : super::super::super::Foundation:: HANDLE, enummodulescallback : PSYM_ENUMMODULES_CALLBACK, usercontext : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 249:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymEnumerateModules64(hprocess : super::super::super::Foundation:: HANDLE, enummodulescallback : PSYM_ENUMMODULES_CALLBACK64, usercontext : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 250:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymEnumerateModulesW64(hprocess : super::super::super::Foundation:: HANDLE, enummodulescallback : PSYM_ENUMMODULES_CALLBACKW64, usercontext : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 251:1: declaration Macro has no candidate rule
// #[cfg(target_arch = "x86")]
// windows_link::link!("dbghelp.dll" "system" fn SymEnumerateSymbols(hprocess : super::super::super::Foundation:: HANDLE, baseofdll : u32, enumsymbolscallback : PSYM_ENUMSYMBOLS_CALLBACK, usercontext : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 253:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymEnumerateSymbols64(hprocess : super::super::super::Foundation:: HANDLE, baseofdll : u64, enumsymbolscallback : PSYM_ENUMSYMBOLS_CALLBACK64, usercontext : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 254:1: declaration Macro has no candidate rule
// #[cfg(target_arch = "x86")]
// windows_link::link!("dbghelp.dll" "system" fn SymEnumerateSymbolsW(hprocess : super::super::super::Foundation:: HANDLE, baseofdll : u32, enumsymbolscallback : PSYM_ENUMSYMBOLS_CALLBACKW, usercontext : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 256:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymEnumerateSymbolsW64(hprocess : super::super::super::Foundation:: HANDLE, baseofdll : u64, enumsymbolscallback : PSYM_ENUMSYMBOLS_CALLBACK64W, usercontext : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 257:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymFindDebugInfoFile(hprocess : super::super::super::Foundation:: HANDLE, filename : windows_sys::core::PCSTR, debugfilepath : windows_sys::core::PSTR, callback : PFIND_DEBUG_FILE_CALLBACK, callerdata : *const core::ffi::c_void) -> super::super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 258:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymFindDebugInfoFileW(hprocess : super::super::super::Foundation:: HANDLE, filename : windows_sys::core::PCWSTR, debugfilepath : windows_sys::core::PWSTR, callback : PFIND_DEBUG_FILE_CALLBACKW, callerdata : *const core::ffi::c_void) -> super::super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 259:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymFindExecutableImage(hprocess : super::super::super::Foundation:: HANDLE, filename : windows_sys::core::PCSTR, imagefilepath : windows_sys::core::PSTR, callback : PFIND_EXE_FILE_CALLBACK, callerdata : *const core::ffi::c_void) -> super::super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 260:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymFindExecutableImageW(hprocess : super::super::super::Foundation:: HANDLE, filename : windows_sys::core::PCWSTR, imagefilepath : windows_sys::core::PWSTR, callback : PFIND_EXE_FILE_CALLBACKW, callerdata : *const core::ffi::c_void) -> super::super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 261:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymFindFileInPath(hprocess : super::super::super::Foundation:: HANDLE, searchpatha : windows_sys::core::PCSTR, filename : windows_sys::core::PCSTR, id : *const core::ffi::c_void, two : u32, three : u32, flags : SYM_FIND_ID_OPTION, foundfile : windows_sys::core::PSTR, callback : PFINDFILEINPATHCALLBACK, context : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 262:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymFindFileInPathW(hprocess : super::super::super::Foundation:: HANDLE, searchpatha : windows_sys::core::PCWSTR, filename : windows_sys::core::PCWSTR, id : *const core::ffi::c_void, two : u32, three : u32, flags : SYM_FIND_ID_OPTION, foundfile : windows_sys::core::PWSTR, callback : PFINDFILEINPATHCALLBACKW, context : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 263:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymFromAddr(hprocess : super::super::super::Foundation:: HANDLE, address : u64, displacement : *mut u64, symbol : *mut SYMBOL_INFO) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 264:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymFromAddrW(hprocess : super::super::super::Foundation:: HANDLE, address : u64, displacement : *mut u64, symbol : *mut SYMBOL_INFOW) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 265:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymFromIndex(hprocess : super::super::super::Foundation:: HANDLE, baseofdll : u64, index : u32, symbol : *mut SYMBOL_INFO) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 266:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymFromIndexW(hprocess : super::super::super::Foundation:: HANDLE, baseofdll : u64, index : u32, symbol : *mut SYMBOL_INFOW) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 267:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymFromInlineContext(hprocess : super::super::super::Foundation:: HANDLE, address : u64, inlinecontext : u32, displacement : *mut u64, symbol : *mut SYMBOL_INFO) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 268:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymFromInlineContextW(hprocess : super::super::super::Foundation:: HANDLE, address : u64, inlinecontext : u32, displacement : *mut u64, symbol : *mut SYMBOL_INFOW) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 269:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymFromName(hprocess : super::super::super::Foundation:: HANDLE, name : windows_sys::core::PCSTR, symbol : *mut SYMBOL_INFO) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 270:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymFromNameW(hprocess : super::super::super::Foundation:: HANDLE, name : windows_sys::core::PCWSTR, symbol : *mut SYMBOL_INFOW) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 271:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymFromToken(hprocess : super::super::super::Foundation:: HANDLE, base : u64, token : u32, symbol : *mut SYMBOL_INFO) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 272:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymFromTokenW(hprocess : super::super::super::Foundation:: HANDLE, base : u64, token : u32, symbol : *mut SYMBOL_INFOW) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 273:1: declaration Macro has no candidate rule
// #[cfg(target_arch = "x86")]
// windows_link::link!("dbghelp.dll" "system" fn SymFunctionTableAccess(hprocess : super::super::super::Foundation:: HANDLE, addrbase : u32) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 275:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymFunctionTableAccess64(hprocess : super::super::super::Foundation:: HANDLE, addrbase : u64) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 276:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymFunctionTableAccess64AccessRoutines(hprocess : super::super::super::Foundation:: HANDLE, addrbase : u64, readmemoryroutine : PREAD_PROCESS_MEMORY_ROUTINE64, getmodulebaseroutine : PGET_MODULE_BASE_ROUTINE64) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 277:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymGetExtendedOption(option : IMAGEHLP_EXTENDED_OPTIONS) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 278:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymGetFileLineOffsets64(hprocess : super::super::super::Foundation:: HANDLE, modulename : windows_sys::core::PCSTR, filename : windows_sys::core::PCSTR, buffer : *mut u64, bufferlines : u32) -> u32);

// UNSUPPORTED Rust 279:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymGetHomeDirectory(r#type : u32, dir : windows_sys::core::PSTR, size : usize) -> windows_sys::core::PSTR);

// UNSUPPORTED Rust 280:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymGetHomeDirectoryW(r#type : u32, dir : windows_sys::core::PWSTR, size : usize) -> windows_sys::core::PWSTR);

// UNSUPPORTED Rust 281:1: declaration Macro has no candidate rule
// #[cfg(target_arch = "x86")]
// windows_link::link!("dbghelp.dll" "system" fn SymGetLineFromAddr(hprocess : super::super::super::Foundation:: HANDLE, dwaddr : u32, pdwdisplacement : *mut u32, line : *mut IMAGEHLP_LINE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 283:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymGetLineFromAddr64(hprocess : super::super::super::Foundation:: HANDLE, qwaddr : u64, pdwdisplacement : *mut u32, line64 : *mut IMAGEHLP_LINE64) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 284:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymGetLineFromAddrW64(hprocess : super::super::super::Foundation:: HANDLE, dwaddr : u64, pdwdisplacement : *mut u32, line : *mut IMAGEHLP_LINEW64) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 285:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymGetLineFromInlineContext(hprocess : super::super::super::Foundation:: HANDLE, qwaddr : u64, inlinecontext : u32, qwmodulebaseaddress : u64, pdwdisplacement : *mut u32, line64 : *mut IMAGEHLP_LINE64) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 286:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymGetLineFromInlineContextW(hprocess : super::super::super::Foundation:: HANDLE, dwaddr : u64, inlinecontext : u32, qwmodulebaseaddress : u64, pdwdisplacement : *mut u32, line : *mut IMAGEHLP_LINEW64) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 287:1: declaration Macro has no candidate rule
// #[cfg(target_arch = "x86")]
// windows_link::link!("dbghelp.dll" "system" fn SymGetLineFromName(hprocess : super::super::super::Foundation:: HANDLE, modulename : windows_sys::core::PCSTR, filename : windows_sys::core::PCSTR, dwlinenumber : u32, pldisplacement : *mut i32, line : *mut IMAGEHLP_LINE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 289:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymGetLineFromName64(hprocess : super::super::super::Foundation:: HANDLE, modulename : windows_sys::core::PCSTR, filename : windows_sys::core::PCSTR, dwlinenumber : u32, pldisplacement : *mut i32, line : *mut IMAGEHLP_LINE64) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 290:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymGetLineFromNameW64(hprocess : super::super::super::Foundation:: HANDLE, modulename : windows_sys::core::PCWSTR, filename : windows_sys::core::PCWSTR, dwlinenumber : u32, pldisplacement : *mut i32, line : *mut IMAGEHLP_LINEW64) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 291:1: declaration Macro has no candidate rule
// #[cfg(target_arch = "x86")]
// windows_link::link!("dbghelp.dll" "system" fn SymGetLineNext(hprocess : super::super::super::Foundation:: HANDLE, line : *mut IMAGEHLP_LINE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 293:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymGetLineNext64(hprocess : super::super::super::Foundation:: HANDLE, line : *mut IMAGEHLP_LINE64) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 294:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymGetLineNextW64(hprocess : super::super::super::Foundation:: HANDLE, line : *mut IMAGEHLP_LINEW64) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 295:1: declaration Macro has no candidate rule
// #[cfg(target_arch = "x86")]
// windows_link::link!("dbghelp.dll" "system" fn SymGetLinePrev(hprocess : super::super::super::Foundation:: HANDLE, line : *mut IMAGEHLP_LINE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 297:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymGetLinePrev64(hprocess : super::super::super::Foundation:: HANDLE, line : *mut IMAGEHLP_LINE64) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 298:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymGetLinePrevW64(hprocess : super::super::super::Foundation:: HANDLE, line : *mut IMAGEHLP_LINEW64) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 299:1: declaration Macro has no candidate rule
// #[cfg(target_arch = "x86")]
// windows_link::link!("dbghelp.dll" "system" fn SymGetModuleBase(hprocess : super::super::super::Foundation:: HANDLE, dwaddr : u32) -> u32);

// UNSUPPORTED Rust 301:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymGetModuleBase64(hprocess : super::super::super::Foundation:: HANDLE, qwaddr : u64) -> u64);

// UNSUPPORTED Rust 302:1: declaration Macro has no candidate rule
// #[cfg(target_arch = "x86")]
// windows_link::link!("dbghelp.dll" "system" fn SymGetModuleInfo(hprocess : super::super::super::Foundation:: HANDLE, dwaddr : u32, moduleinfo : *mut IMAGEHLP_MODULE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 304:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymGetModuleInfo64(hprocess : super::super::super::Foundation:: HANDLE, qwaddr : u64, moduleinfo : *mut IMAGEHLP_MODULE64) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 305:1: declaration Macro has no candidate rule
// #[cfg(target_arch = "x86")]
// windows_link::link!("dbghelp.dll" "system" fn SymGetModuleInfoW(hprocess : super::super::super::Foundation:: HANDLE, dwaddr : u32, moduleinfo : *mut IMAGEHLP_MODULEW) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 307:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymGetModuleInfoW64(hprocess : super::super::super::Foundation:: HANDLE, qwaddr : u64, moduleinfo : *mut IMAGEHLP_MODULEW64) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 308:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymGetOmaps(hprocess : super::super::super::Foundation:: HANDLE, baseofdll : u64, omapto : *mut *mut OMAP, comapto : *mut u64, omapfrom : *mut *mut OMAP, comapfrom : *mut u64) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 309:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymGetOptions() -> u32);

// UNSUPPORTED Rust 310:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymGetScope(hprocess : super::super::super::Foundation:: HANDLE, baseofdll : u64, index : u32, symbol : *mut SYMBOL_INFO) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 311:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymGetScopeW(hprocess : super::super::super::Foundation:: HANDLE, baseofdll : u64, index : u32, symbol : *mut SYMBOL_INFOW) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 312:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymGetSearchPath(hprocess : super::super::super::Foundation:: HANDLE, searchpatha : windows_sys::core::PSTR, searchpathlength : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 313:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymGetSearchPathW(hprocess : super::super::super::Foundation:: HANDLE, searchpatha : windows_sys::core::PWSTR, searchpathlength : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 314:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymGetSourceFile(hprocess : super::super::super::Foundation:: HANDLE, base : u64, params : windows_sys::core::PCSTR, filespec : windows_sys::core::PCSTR, filepath : windows_sys::core::PSTR, size : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 315:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymGetSourceFileChecksum(hprocess : super::super::super::Foundation:: HANDLE, base : u64, filespec : windows_sys::core::PCSTR, pchecksumtype : *mut u32, pchecksum : *mut u8, checksumsize : u32, pactualbyteswritten : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 316:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymGetSourceFileChecksumW(hprocess : super::super::super::Foundation:: HANDLE, base : u64, filespec : windows_sys::core::PCWSTR, pchecksumtype : *mut u32, pchecksum : *mut u8, checksumsize : u32, pactualbyteswritten : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 317:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymGetSourceFileFromToken(hprocess : super::super::super::Foundation:: HANDLE, token : *const core::ffi::c_void, params : windows_sys::core::PCSTR, filepath : windows_sys::core::PSTR, size : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 318:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymGetSourceFileFromTokenByTokenName(hprocess : super::super::super::Foundation:: HANDLE, token : *const core::ffi::c_void, tokenname : windows_sys::core::PCSTR, params : windows_sys::core::PCSTR, filepath : windows_sys::core::PSTR, size : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 319:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymGetSourceFileFromTokenByTokenNameW(hprocess : super::super::super::Foundation:: HANDLE, token : *const core::ffi::c_void, tokenname : windows_sys::core::PCWSTR, params : windows_sys::core::PCWSTR, filepath : windows_sys::core::PWSTR, size : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 320:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymGetSourceFileFromTokenW(hprocess : super::super::super::Foundation:: HANDLE, token : *const core::ffi::c_void, params : windows_sys::core::PCWSTR, filepath : windows_sys::core::PWSTR, size : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 321:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymGetSourceFileToken(hprocess : super::super::super::Foundation:: HANDLE, base : u64, filespec : windows_sys::core::PCSTR, token : *mut *mut core::ffi::c_void, size : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 322:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymGetSourceFileTokenByTokenName(hprocess : super::super::super::Foundation:: HANDLE, base : u64, filespec : windows_sys::core::PCSTR, tokenname : windows_sys::core::PCSTR, tokenparameters : windows_sys::core::PCSTR, token : *mut *mut core::ffi::c_void, size : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 323:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymGetSourceFileTokenByTokenNameW(hprocess : super::super::super::Foundation:: HANDLE, base : u64, filespec : windows_sys::core::PCWSTR, tokenname : windows_sys::core::PCWSTR, tokenparameters : windows_sys::core::PCWSTR, token : *mut *mut core::ffi::c_void, size : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 324:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymGetSourceFileTokenW(hprocess : super::super::super::Foundation:: HANDLE, base : u64, filespec : windows_sys::core::PCWSTR, token : *mut *mut core::ffi::c_void, size : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 325:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymGetSourceFileW(hprocess : super::super::super::Foundation:: HANDLE, base : u64, params : windows_sys::core::PCWSTR, filespec : windows_sys::core::PCWSTR, filepath : windows_sys::core::PWSTR, size : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 326:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymGetSourceVarFromToken(hprocess : super::super::super::Foundation:: HANDLE, token : *const core::ffi::c_void, params : windows_sys::core::PCSTR, varname : windows_sys::core::PCSTR, value : windows_sys::core::PSTR, size : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 327:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymGetSourceVarFromTokenW(hprocess : super::super::super::Foundation:: HANDLE, token : *const core::ffi::c_void, params : windows_sys::core::PCWSTR, varname : windows_sys::core::PCWSTR, value : windows_sys::core::PWSTR, size : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 328:1: declaration Macro has no candidate rule
// #[cfg(target_arch = "x86")]
// windows_link::link!("dbghelp.dll" "system" fn SymGetSymFromAddr(hprocess : super::super::super::Foundation:: HANDLE, dwaddr : u32, pdwdisplacement : *mut u32, symbol : *mut IMAGEHLP_SYMBOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 330:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymGetSymFromAddr64(hprocess : super::super::super::Foundation:: HANDLE, qwaddr : u64, pdwdisplacement : *mut u64, symbol : *mut IMAGEHLP_SYMBOL64) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 331:1: declaration Macro has no candidate rule
// #[cfg(target_arch = "x86")]
// windows_link::link!("dbghelp.dll" "system" fn SymGetSymFromName(hprocess : super::super::super::Foundation:: HANDLE, name : windows_sys::core::PCSTR, symbol : *mut IMAGEHLP_SYMBOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 333:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymGetSymFromName64(hprocess : super::super::super::Foundation:: HANDLE, name : windows_sys::core::PCSTR, symbol : *mut IMAGEHLP_SYMBOL64) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 334:1: declaration Macro has no candidate rule
// #[cfg(target_arch = "x86")]
// windows_link::link!("dbghelp.dll" "system" fn SymGetSymNext(hprocess : super::super::super::Foundation:: HANDLE, symbol : *mut IMAGEHLP_SYMBOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 336:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymGetSymNext64(hprocess : super::super::super::Foundation:: HANDLE, symbol : *mut IMAGEHLP_SYMBOL64) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 337:1: declaration Macro has no candidate rule
// #[cfg(target_arch = "x86")]
// windows_link::link!("dbghelp.dll" "system" fn SymGetSymPrev(hprocess : super::super::super::Foundation:: HANDLE, symbol : *mut IMAGEHLP_SYMBOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 339:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymGetSymPrev64(hprocess : super::super::super::Foundation:: HANDLE, symbol : *mut IMAGEHLP_SYMBOL64) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 340:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymGetSymbolFile(hprocess : super::super::super::Foundation:: HANDLE, sympath : windows_sys::core::PCSTR, imagefile : windows_sys::core::PCSTR, r#type : u32, symbolfile : windows_sys::core::PSTR, csymbolfile : usize, dbgfile : windows_sys::core::PSTR, cdbgfile : usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 341:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymGetSymbolFileW(hprocess : super::super::super::Foundation:: HANDLE, sympath : windows_sys::core::PCWSTR, imagefile : windows_sys::core::PCWSTR, r#type : u32, symbolfile : windows_sys::core::PWSTR, csymbolfile : usize, dbgfile : windows_sys::core::PWSTR, cdbgfile : usize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 342:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymGetTypeFromName(hprocess : super::super::super::Foundation:: HANDLE, baseofdll : u64, name : windows_sys::core::PCSTR, symbol : *mut SYMBOL_INFO) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 343:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymGetTypeFromNameW(hprocess : super::super::super::Foundation:: HANDLE, baseofdll : u64, name : windows_sys::core::PCWSTR, symbol : *mut SYMBOL_INFOW) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 344:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymGetTypeInfo(hprocess : super::super::super::Foundation:: HANDLE, modbase : u64, typeid : u32, gettype : IMAGEHLP_SYMBOL_TYPE_INFO, pinfo : *mut core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 345:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymGetTypeInfoEx(hprocess : super::super::super::Foundation:: HANDLE, modbase : u64, params : *mut IMAGEHLP_GET_TYPE_INFO_PARAMS) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 346:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymGetUnwindInfo(hprocess : super::super::super::Foundation:: HANDLE, address : u64, buffer : *mut core::ffi::c_void, size : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 347:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymInitialize(hprocess : super::super::super::Foundation:: HANDLE, usersearchpath : windows_sys::core::PCSTR, finvadeprocess : windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 348:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymInitializeW(hprocess : super::super::super::Foundation:: HANDLE, usersearchpath : windows_sys::core::PCWSTR, finvadeprocess : windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 349:1: declaration Macro has no candidate rule
// #[cfg(target_arch = "x86")]
// windows_link::link!("dbghelp.dll" "system" fn SymLoadModule(hprocess : super::super::super::Foundation:: HANDLE, hfile : super::super::super::Foundation:: HANDLE, imagename : windows_sys::core::PCSTR, modulename : windows_sys::core::PCSTR, baseofdll : u32, sizeofdll : u32) -> u32);

// UNSUPPORTED Rust 351:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymLoadModule64(hprocess : super::super::super::Foundation:: HANDLE, hfile : super::super::super::Foundation:: HANDLE, imagename : windows_sys::core::PCSTR, modulename : windows_sys::core::PCSTR, baseofdll : u64, sizeofdll : u32) -> u64);

// UNSUPPORTED Rust 352:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymLoadModuleEx(hprocess : super::super::super::Foundation:: HANDLE, hfile : super::super::super::Foundation:: HANDLE, imagename : windows_sys::core::PCSTR, modulename : windows_sys::core::PCSTR, baseofdll : u64, dllsize : u32, data : *const MODLOAD_DATA, flags : SYM_LOAD_FLAGS) -> u64);

// UNSUPPORTED Rust 353:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymLoadModuleExW(hprocess : super::super::super::Foundation:: HANDLE, hfile : super::super::super::Foundation:: HANDLE, imagename : windows_sys::core::PCWSTR, modulename : windows_sys::core::PCWSTR, baseofdll : u64, dllsize : u32, data : *const MODLOAD_DATA, flags : SYM_LOAD_FLAGS) -> u64);

// UNSUPPORTED Rust 354:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymMatchFileName(filename : windows_sys::core::PCSTR, r#match : windows_sys::core::PCSTR, filenamestop : *mut windows_sys::core::PSTR, matchstop : *mut windows_sys::core::PSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 355:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymMatchFileNameW(filename : windows_sys::core::PCWSTR, r#match : windows_sys::core::PCWSTR, filenamestop : *mut windows_sys::core::PWSTR, matchstop : *mut windows_sys::core::PWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 356:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymMatchString(string : windows_sys::core::PCSTR, expression : windows_sys::core::PCSTR, fcase : windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 357:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymMatchStringA(string : windows_sys::core::PCSTR, expression : windows_sys::core::PCSTR, fcase : windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 358:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymMatchStringW(string : windows_sys::core::PCWSTR, expression : windows_sys::core::PCWSTR, fcase : windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 359:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymNext(hprocess : super::super::super::Foundation:: HANDLE, si : *mut SYMBOL_INFO) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 360:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymNextW(hprocess : super::super::super::Foundation:: HANDLE, siw : *mut SYMBOL_INFOW) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 361:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymPrev(hprocess : super::super::super::Foundation:: HANDLE, si : *mut SYMBOL_INFO) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 362:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymPrevW(hprocess : super::super::super::Foundation:: HANDLE, siw : *mut SYMBOL_INFOW) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 363:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymQueryInlineTrace(hprocess : super::super::super::Foundation:: HANDLE, startaddress : u64, startcontext : u32, startretaddress : u64, curaddress : u64, curcontext : *mut u32, curframeindex : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 364:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymRefreshModuleList(hprocess : super::super::super::Foundation:: HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 365:1: declaration Macro has no candidate rule
// #[cfg(target_arch = "x86")]
// windows_link::link!("dbghelp.dll" "system" fn SymRegisterCallback(hprocess : super::super::super::Foundation:: HANDLE, callbackfunction : PSYMBOL_REGISTERED_CALLBACK, usercontext : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 367:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymRegisterCallback64(hprocess : super::super::super::Foundation:: HANDLE, callbackfunction : PSYMBOL_REGISTERED_CALLBACK64, usercontext : u64) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 368:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymRegisterCallbackW64(hprocess : super::super::super::Foundation:: HANDLE, callbackfunction : PSYMBOL_REGISTERED_CALLBACK64, usercontext : u64) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 369:1: declaration Macro has no candidate rule
// #[cfg(target_arch = "x86")]
// windows_link::link!("dbghelp.dll" "system" fn SymRegisterFunctionEntryCallback(hprocess : super::super::super::Foundation:: HANDLE, callbackfunction : PSYMBOL_FUNCENTRY_CALLBACK, usercontext : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 371:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymRegisterFunctionEntryCallback64(hprocess : super::super::super::Foundation:: HANDLE, callbackfunction : PSYMBOL_FUNCENTRY_CALLBACK64, usercontext : u64) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 372:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymSearch(hprocess : super::super::super::Foundation:: HANDLE, baseofdll : u64, index : u32, symtag : u32, mask : windows_sys::core::PCSTR, address : u64, enumsymbolscallback : PSYM_ENUMERATESYMBOLS_CALLBACK, usercontext : *const core::ffi::c_void, options : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 373:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymSearchW(hprocess : super::super::super::Foundation:: HANDLE, baseofdll : u64, index : u32, symtag : u32, mask : windows_sys::core::PCWSTR, address : u64, enumsymbolscallback : PSYM_ENUMERATESYMBOLS_CALLBACKW, usercontext : *const core::ffi::c_void, options : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 374:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymSetContext(hprocess : super::super::super::Foundation:: HANDLE, stackframe : *const IMAGEHLP_STACK_FRAME, context : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 375:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymSetExtendedOption(option : IMAGEHLP_EXTENDED_OPTIONS, value : windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 376:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymSetHomeDirectory(hprocess : super::super::super::Foundation:: HANDLE, dir : windows_sys::core::PCSTR) -> windows_sys::core::PSTR);

// UNSUPPORTED Rust 377:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymSetHomeDirectoryW(hprocess : super::super::super::Foundation:: HANDLE, dir : windows_sys::core::PCWSTR) -> windows_sys::core::PWSTR);

// UNSUPPORTED Rust 378:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymSetOptions(symoptions : u32) -> u32);

// UNSUPPORTED Rust 379:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymSetParentWindow(hwnd : super::super::super::Foundation:: HWND) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 380:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymSetScopeFromAddr(hprocess : super::super::super::Foundation:: HANDLE, address : u64) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 381:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymSetScopeFromIndex(hprocess : super::super::super::Foundation:: HANDLE, baseofdll : u64, index : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 382:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymSetScopeFromInlineContext(hprocess : super::super::super::Foundation:: HANDLE, address : u64, inlinecontext : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 383:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymSetSearchPath(hprocess : super::super::super::Foundation:: HANDLE, searchpatha : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 384:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymSetSearchPathW(hprocess : super::super::super::Foundation:: HANDLE, searchpatha : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 385:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymSrvDeltaName(hprocess : super::super::super::Foundation:: HANDLE, sympath : windows_sys::core::PCSTR, r#type : windows_sys::core::PCSTR, file1 : windows_sys::core::PCSTR, file2 : windows_sys::core::PCSTR) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 386:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymSrvDeltaNameW(hprocess : super::super::super::Foundation:: HANDLE, sympath : windows_sys::core::PCWSTR, r#type : windows_sys::core::PCWSTR, file1 : windows_sys::core::PCWSTR, file2 : windows_sys::core::PCWSTR) -> windows_sys::core::PCWSTR);

// UNSUPPORTED Rust 387:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymSrvGetFileIndexInfo(file : windows_sys::core::PCSTR, info : *mut SYMSRV_INDEX_INFO, flags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 388:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymSrvGetFileIndexInfoW(file : windows_sys::core::PCWSTR, info : *mut SYMSRV_INDEX_INFOW, flags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 389:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymSrvGetFileIndexString(hprocess : super::super::super::Foundation:: HANDLE, srvpath : windows_sys::core::PCSTR, file : windows_sys::core::PCSTR, index : windows_sys::core::PSTR, size : usize, flags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 390:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymSrvGetFileIndexStringW(hprocess : super::super::super::Foundation:: HANDLE, srvpath : windows_sys::core::PCWSTR, file : windows_sys::core::PCWSTR, index : windows_sys::core::PWSTR, size : usize, flags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 391:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymSrvGetFileIndexes(file : windows_sys::core::PCSTR, id : *mut windows_sys::core::GUID, val1 : *mut u32, val2 : *mut u32, flags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 392:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymSrvGetFileIndexesW(file : windows_sys::core::PCWSTR, id : *mut windows_sys::core::GUID, val1 : *mut u32, val2 : *mut u32, flags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 393:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymSrvGetSupplement(hprocess : super::super::super::Foundation:: HANDLE, sympath : windows_sys::core::PCSTR, node : windows_sys::core::PCSTR, file : windows_sys::core::PCSTR) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 394:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymSrvGetSupplementW(hprocess : super::super::super::Foundation:: HANDLE, sympath : windows_sys::core::PCWSTR, node : windows_sys::core::PCWSTR, file : windows_sys::core::PCWSTR) -> windows_sys::core::PCWSTR);

// UNSUPPORTED Rust 395:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymSrvIsStore(hprocess : super::super::super::Foundation:: HANDLE, path : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 396:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymSrvIsStoreW(hprocess : super::super::super::Foundation:: HANDLE, path : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 397:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymSrvStoreFile(hprocess : super::super::super::Foundation:: HANDLE, srvpath : windows_sys::core::PCSTR, file : windows_sys::core::PCSTR, flags : SYM_SRV_STORE_FILE_FLAGS) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 398:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymSrvStoreFileW(hprocess : super::super::super::Foundation:: HANDLE, srvpath : windows_sys::core::PCWSTR, file : windows_sys::core::PCWSTR, flags : SYM_SRV_STORE_FILE_FLAGS) -> windows_sys::core::PCWSTR);

// UNSUPPORTED Rust 399:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymSrvStoreSupplement(hprocess : super::super::super::Foundation:: HANDLE, srvpath : windows_sys::core::PCSTR, node : windows_sys::core::PCSTR, file : windows_sys::core::PCSTR, flags : u32) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 400:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymSrvStoreSupplementW(hprocess : super::super::super::Foundation:: HANDLE, sympath : windows_sys::core::PCWSTR, node : windows_sys::core::PCWSTR, file : windows_sys::core::PCWSTR, flags : u32) -> windows_sys::core::PCWSTR);

// UNSUPPORTED Rust 401:1: declaration Macro has no candidate rule
// #[cfg(target_arch = "x86")]
// windows_link::link!("dbghelp.dll" "system" fn SymUnDName(sym : *const IMAGEHLP_SYMBOL, undecname : windows_sys::core::PSTR, undecnamelength : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 403:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymUnDName64(sym : *const IMAGEHLP_SYMBOL64, undecname : windows_sys::core::PSTR, undecnamelength : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 404:1: declaration Macro has no candidate rule
// #[cfg(target_arch = "x86")]
// windows_link::link!("dbghelp.dll" "system" fn SymUnloadModule(hprocess : super::super::super::Foundation:: HANDLE, baseofdll : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 406:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn SymUnloadModule64(hprocess : super::super::super::Foundation:: HANDLE, baseofdll : u64) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 407:1: declaration Macro has no candidate rule
// windows_link::link!("api-ms-win-core-errorhandling-l1-1-3.dll" "system" fn TerminateProcessOnMemoryExhaustion(failedallocationsize : usize));

// UNSUPPORTED Rust 408:1: declaration Macro has no candidate rule
// windows_link::link!("imagehlp.dll" "system" fn TouchFileTimes(filehandle : super::super::super::Foundation:: HANDLE, psystemtime : *const super::super::super::Foundation:: SYSTEMTIME) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 409:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn UnDecorateSymbolName(name : windows_sys::core::PCSTR, outputstring : windows_sys::core::PSTR, maxstringlength : u32, flags : u32) -> u32);

// UNSUPPORTED Rust 410:1: declaration Macro has no candidate rule
// windows_link::link!("dbghelp.dll" "system" fn UnDecorateSymbolNameW(name : windows_sys::core::PCWSTR, outputstring : windows_sys::core::PWSTR, maxstringlength : u32, flags : u32) -> u32);

// UNSUPPORTED Rust 411:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Kernel", feature = "Win32_System_SystemInformation"))]
// windows_link::link!("imagehlp.dll" "system" fn UnMapAndLoad(loadedimage : *mut LOADED_IMAGE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 413:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Kernel")]
// windows_link::link!("kernel32.dll" "system" fn UnhandledExceptionFilter(exceptioninfo : *const EXCEPTION_POINTERS) -> i32);

// UNSUPPORTED Rust 415:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_SystemInformation")]
// windows_link::link!("imagehlp.dll" "system" fn UpdateDebugInfoFile(imagefilename : windows_sys::core::PCSTR, symbolpath : windows_sys::core::PCSTR, debugfilepath : windows_sys::core::PSTR, ntheaders : *const IMAGE_NT_HEADERS32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 417:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_SystemInformation")]
// windows_link::link!("imagehlp.dll" "system" fn UpdateDebugInfoFileEx(imagefilename : windows_sys::core::PCSTR, symbolpath : windows_sys::core::PCSTR, debugfilepath : windows_sys::core::PSTR, ntheaders : *const IMAGE_NT_HEADERS32, oldchecksum : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 419:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Threading")]
// windows_link::link!("kernel32.dll" "system" fn WaitForDebugEvent(lpdebugevent : *mut DEBUG_EVENT, dwmilliseconds : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 421:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Threading")]
// windows_link::link!("kernel32.dll" "system" fn WaitForDebugEventEx(lpdebugevent : *mut DEBUG_EVENT, dwmilliseconds : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 423:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn Wow64GetThreadContext(hthread : super::super::super::Foundation:: HANDLE, lpcontext : *mut WOW64_CONTEXT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 424:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn Wow64GetThreadSelectorEntry(hthread : super::super::super::Foundation:: HANDLE, dwselector : u32, lpselectorentry : *mut WOW64_LDT_ENTRY) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 425:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn Wow64SetThreadContext(hthread : super::super::super::Foundation:: HANDLE, lpcontext : *const WOW64_CONTEXT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 426:1: declaration Macro has no candidate rule
// windows_link::link!("kernel32.dll" "system" fn WriteProcessMemory(hprocess : super::super::super::Foundation:: HANDLE, lpbaseaddress : *const core::ffi::c_void, lpbuffer : *const core::ffi::c_void, nsize : usize, lpnumberofbyteswritten : *mut usize) -> windows_sys::core::BOOL);

public const val `ABNORMAL_RESET_DETECTED`: `BUGCHECK_ERROR` = 327u;
public const val `ACPI_BIOS_ERROR`: `BUGCHECK_ERROR` = 165u;
public const val `ACPI_BIOS_FATAL_ERROR`: `BUGCHECK_ERROR` = 224u;
public const val `ACPI_DRIVER_INTERNAL`: `BUGCHECK_ERROR` = 163u;
public const val `ACPI_FIRMWARE_WATCHDOG_TIMEOUT`: `BUGCHECK_ERROR` = 464u;
public const val `ACTIVE_EX_WORKER_THREAD_TERMINATION`: `BUGCHECK_ERROR` = 233u;
// UNSUPPORTED Rust 433:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy, Default)]
// pub struct ADDRESS {
//     pub Offset: u32,
//     pub Segment: u16,
//     pub Mode: ADDRESS_MODE,
// }

// UNSUPPORTED Rust 441:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ADDRESS64 {
//     pub Offset: u64,
//     pub Segment: u16,
//     pub Mode: ADDRESS_MODE,
// }

public typealias `ADDRESS_MODE` = Int;
// UNSUPPORTED Rust 449:1: declaration Union has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union AER_BRIDGE_DESCRIPTOR_FLAGS {
//     pub Anonymous: AER_BRIDGE_DESCRIPTOR_FLAGS_0,
//     pub AsUSHORT: u16,
// }

// UNSUPPORTED Rust 455:1: declaration Impl has no candidate rule
// impl Default for AER_BRIDGE_DESCRIPTOR_FLAGS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 460:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct AER_BRIDGE_DESCRIPTOR_FLAGS_0 {
//     pub _bitfield: u16,
// }

// UNSUPPORTED Rust 465:1: declaration Union has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union AER_ENDPOINT_DESCRIPTOR_FLAGS {
//     pub Anonymous: AER_ENDPOINT_DESCRIPTOR_FLAGS_0,
//     pub AsUSHORT: u16,
// }

// UNSUPPORTED Rust 471:1: declaration Impl has no candidate rule
// impl Default for AER_ENDPOINT_DESCRIPTOR_FLAGS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 476:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct AER_ENDPOINT_DESCRIPTOR_FLAGS_0 {
//     pub _bitfield: u16,
// }

// UNSUPPORTED Rust 481:1: declaration Union has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union AER_ROOTPORT_DESCRIPTOR_FLAGS {
//     pub Anonymous: AER_ROOTPORT_DESCRIPTOR_FLAGS_0,
//     pub AsUSHORT: u16,
// }

// UNSUPPORTED Rust 487:1: declaration Impl has no candidate rule
// impl Default for AER_ROOTPORT_DESCRIPTOR_FLAGS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 492:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct AER_ROOTPORT_DESCRIPTOR_FLAGS_0 {
//     pub _bitfield: u16,
// }

public const val `AGP_GART_CORRUPTION`: `BUGCHECK_ERROR` = 261u;
public const val `AGP_ILLEGALLY_REPROGRAMMED`: `BUGCHECK_ERROR` = 262u;
public const val `AGP_INTERNAL`: `BUGCHECK_ERROR` = 277u;
public const val `AGP_INVALID_ACCESS`: `BUGCHECK_ERROR` = 260u;
// UNSUPPORTED Rust 501:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Kernel")]
// #[derive(Clone, Copy)]
// pub struct APC_CALLBACK_DATA {
//     pub Parameter: usize,
//     pub ContextRecord: *mut CONTEXT,
//     pub Reserved0: usize,
//     pub Reserved1: usize,
// }

// UNSUPPORTED Rust 510:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Kernel")]
// impl Default for APC_CALLBACK_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `APC_INDEX_MISMATCH`: `BUGCHECK_ERROR` = 1u;
// UNSUPPORTED Rust 517:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct API_VERSION {
//     pub MajorVersion: u16,
//     pub MinorVersion: u16,
//     pub Revision: u16,
//     pub Reserved: u16,
// }

public const val `API_VERSION_NUMBER`: UInt = 12u;
public const val `APP_TAGGING_INITIALIZATION_FAILED`: `BUGCHECK_ERROR` = 266u;
// UNSUPPORTED Rust 527:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "arm64ec", target_arch = "x86", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct ARM64_NT_CONTEXT {
//     pub ContextFlags: u32,
//     pub Cpsr: u32,
//     pub Anonymous: ARM64_NT_CONTEXT_0,
//     pub Sp: u64,
//     pub Pc: u64,
//     pub V: [ARM64_NT_NEON128; 32],
//     pub Fpcr: u32,
//     pub Fpsr: u32,
//     pub Bcr: [u32; 8],
//     pub Bvr: [u64; 8],
//     pub Wcr: [u32; 2],
//     pub Wvr: [u64; 2],
// }

// UNSUPPORTED Rust 544:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "arm64ec", target_arch = "x86", target_arch = "x86_64"))]
// impl Default for ARM64_NT_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 550:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "arm64ec", target_arch = "x86", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub union ARM64_NT_CONTEXT_0 {
//     pub Anonymous: ARM64_NT_CONTEXT_0_0,
//     pub X: [u64; 31],
// }

// UNSUPPORTED Rust 557:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "arm64ec", target_arch = "x86", target_arch = "x86_64"))]
// impl Default for ARM64_NT_CONTEXT_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 563:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "arm64ec", target_arch = "x86", target_arch = "x86_64"))]
// #[derive(Clone, Copy, Default)]
// pub struct ARM64_NT_CONTEXT_0_0 {
//     pub X0: u64,
//     pub X1: u64,
//     pub X2: u64,
//     pub X3: u64,
//     pub X4: u64,
//     pub X5: u64,
//     pub X6: u64,
//     pub X7: u64,
//     pub X8: u64,
//     pub X9: u64,
//     pub X10: u64,
//     pub X11: u64,
//     pub X12: u64,
//     pub X13: u64,
//     pub X14: u64,
//     pub X15: u64,
//     pub X16: u64,
//     pub X17: u64,
//     pub X18: u64,
//     pub X19: u64,
//     pub X20: u64,
//     pub X21: u64,
//     pub X22: u64,
//     pub X23: u64,
//     pub X24: u64,
//     pub X25: u64,
//     pub X26: u64,
//     pub X27: u64,
//     pub X28: u64,
//     pub Fp: u64,
//     pub Lr: u64,
// }

// UNSUPPORTED Rust 599:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union ARM64_NT_NEON128 {
//     pub Anonymous: ARM64_NT_NEON128_0,
//     pub D: [f64; 2],
//     pub S: [f32; 4],
//     pub H: [u16; 8],
//     pub B: [u8; 16],
// }

// UNSUPPORTED Rust 608:1: declaration Impl has no candidate rule
// impl Default for ARM64_NT_NEON128 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 613:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ARM64_NT_NEON128_0 {
//     pub Low: u64,
//     pub High: i64,
// }

public const val `ASSIGN_DRIVE_LETTERS_FAILED`: `BUGCHECK_ERROR` = 114u;
public const val `ATDISK_DRIVER_INTERNAL`: `BUGCHECK_ERROR` = 66u;
public const val `ATTEMPTED_EXECUTE_OF_NOEXECUTE_MEMORY`: `BUGCHECK_ERROR` = 252u;
public const val `ATTEMPTED_SWITCH_FROM_DPC`: `BUGCHECK_ERROR` = 184u;
public const val `ATTEMPTED_WRITE_TO_CM_PROTECTED_STORAGE`: `BUGCHECK_ERROR` = 284u;
public const val `ATTEMPTED_WRITE_TO_READONLY_MEMORY`: `BUGCHECK_ERROR` = 190u;
public const val `AUDIT_FAILURE`: `BUGCHECK_ERROR` = 134u;
public const val `AZURE_DEVICE_FW_DUMP`: `BUGCHECK_ERROR` = 482u;
public const val `AddrMode1616`: `ADDRESS_MODE` = 0;
public const val `AddrMode1632`: `ADDRESS_MODE` = 1;
public const val `AddrModeFlat`: `ADDRESS_MODE` = 3;
public const val `AddrModeReal`: `ADDRESS_MODE` = 2;
public const val `BAD_EXHANDLE`: `BUGCHECK_ERROR` = 167u;
public const val `BAD_OBJECT_HEADER`: `BUGCHECK_ERROR` = 393u;
public const val `BAD_POOL_CALLER`: `BUGCHECK_ERROR` = 194u;
public const val `BAD_POOL_HEADER`: `BUGCHECK_ERROR` = 25u;
public const val `BAD_SYSTEM_CONFIG_INFO`: `BUGCHECK_ERROR` = 116u;
public const val `BC_BLUETOOTH_VERIFIER_FAULT`: `BUGCHECK_ERROR` = 3070u;
public const val `BC_BTHMINI_VERIFIER_FAULT`: `BUGCHECK_ERROR` = 3071u;
public const val `BGI_DETECTED_VIOLATION`: `BUGCHECK_ERROR` = 177u;
public const val `BIND_ALL_IMAGES`: UInt = 4u;
public const val `BIND_CACHE_IMPORT_DLLS`: UInt = 8u;
public const val `BIND_NO_BOUND_IMPORTS`: UInt = 1u;
public const val `BIND_NO_UPDATE`: UInt = 2u;
public const val `BIND_REPORT_64BIT_VA`: UInt = 16u;
public const val `BITLOCKER_FATAL_ERROR`: `BUGCHECK_ERROR` = 288u;
public const val `BLUETOOTH_ERROR_RECOVERY_LIVEDUMP`: `BUGCHECK_ERROR` = 422u;
public const val `BOOTING_IN_SAFEMODE_DSREPAIR`: `BUGCHECK_ERROR` = 170u;
public const val `BOOTING_IN_SAFEMODE_MINIMAL`: `BUGCHECK_ERROR` = 168u;
public const val `BOOTING_IN_SAFEMODE_NETWORK`: `BUGCHECK_ERROR` = 169u;
public const val `BOOTLOG_ENABLED`: `BUGCHECK_ERROR` = 183u;
public const val `BOOTLOG_LOADED`: `BUGCHECK_ERROR` = 181u;
public const val `BOOTLOG_NOT_LOADED`: `BUGCHECK_ERROR` = 182u;
public const val `BOOTPROC_INITIALIZATION_FAILED`: `BUGCHECK_ERROR` = 110u;
public const val `BOUND_IMAGE_UNSUPPORTED`: `BUGCHECK_ERROR` = 151u;
public const val `BREAKAWAY_CABLE_TRANSITION`: `BUGCHECK_ERROR` = 483u;
public const val `BUGCHECK_CONTEXT_MODIFIER`: `BUGCHECK_ERROR` = 2147483648u;
public typealias `BUGCHECK_ERROR` = UInt;
public const val `BUGCODE_ID_DRIVER`: `BUGCHECK_ERROR` = 210u;
public const val `BUGCODE_MBBADAPTER_DRIVER`: `BUGCHECK_ERROR` = 477u;
public const val `BUGCODE_NDIS_DRIVER`: `BUGCHECK_ERROR` = 124u;
public const val `BUGCODE_NDIS_DRIVER_LIVE_DUMP`: `BUGCHECK_ERROR` = 350u;
public const val `BUGCODE_NETADAPTER_DRIVER`: `BUGCHECK_ERROR` = 414u;
public const val `BUGCODE_USB3_DRIVER`: `BUGCHECK_ERROR` = 324u;
public const val `BUGCODE_USB_DRIVER`: `BUGCHECK_ERROR` = 254u;
public const val `BUGCODE_WIFIADAPTER_DRIVER`: `BUGCHECK_ERROR` = 478u;
public const val `BindExpandFileHeaders`: `IMAGEHLP_STATUS_REASON` = 10;
public const val `BindForwarder`: `IMAGEHLP_STATUS_REASON` = 7;
public const val `BindForwarder32`: `IMAGEHLP_STATUS_REASON` = 16;
public const val `BindForwarder64`: `IMAGEHLP_STATUS_REASON` = 17;
public const val `BindForwarderNOT`: `IMAGEHLP_STATUS_REASON` = 8;
public const val `BindForwarderNOT32`: `IMAGEHLP_STATUS_REASON` = 18;
public const val `BindForwarderNOT64`: `IMAGEHLP_STATUS_REASON` = 19;
public const val `BindImageComplete`: `IMAGEHLP_STATUS_REASON` = 11;
public const val `BindImageModified`: `IMAGEHLP_STATUS_REASON` = 9;
public const val `BindImportModule`: `IMAGEHLP_STATUS_REASON` = 5;
public const val `BindImportModuleFailed`: `IMAGEHLP_STATUS_REASON` = 3;
public const val `BindImportProcedure`: `IMAGEHLP_STATUS_REASON` = 6;
public const val `BindImportProcedure32`: `IMAGEHLP_STATUS_REASON` = 14;
public const val `BindImportProcedure64`: `IMAGEHLP_STATUS_REASON` = 15;
public const val `BindImportProcedureFailed`: `IMAGEHLP_STATUS_REASON` = 4;
public const val `BindMismatchedSymbols`: `IMAGEHLP_STATUS_REASON` = 12;
public const val `BindNoRoomInImage`: `IMAGEHLP_STATUS_REASON` = 2;
public const val `BindOutOfMemory`: `IMAGEHLP_STATUS_REASON` = 0;
public const val `BindRvaToVaFailed`: `IMAGEHLP_STATUS_REASON` = 1;
public const val `BindSymbolsNotUpdated`: `IMAGEHLP_STATUS_REASON` = 13;
public const val `CACHE_INITIALIZATION_FAILED`: `BUGCHECK_ERROR` = 102u;
public const val `CACHE_MANAGER`: `BUGCHECK_ERROR` = 52u;
public const val `CALL_HAS_NOT_RETURNED_WATCHDOG_TIMEOUT_LIVEDUMP`: `BUGCHECK_ERROR` = 419u;
public const val `CANCEL_STATE_IN_COMPLETED_IRP`: `BUGCHECK_ERROR` = 72u;
public const val `CANNOT_WRITE_CONFIGURATION`: `BUGCHECK_ERROR` = 117u;
public const val `CBA_CHECK_ARM_MACHINE_THUMB_TYPE_OVERRIDE`: UInt = 2147483648u;
public const val `CBA_CHECK_ENGOPT_DISALLOW_NETWORK_PATHS`: UInt = 1879048192u;
public const val `CBA_DEBUG_INFO`: UInt = 268435456u;
public const val `CBA_DEFERRED_SYMBOL_LOAD_CANCEL`: UInt = 7u;
public const val `CBA_DEFERRED_SYMBOL_LOAD_COMPLETE`: UInt = 2u;
public const val `CBA_DEFERRED_SYMBOL_LOAD_FAILURE`: UInt = 3u;
public const val `CBA_DEFERRED_SYMBOL_LOAD_PARTIAL`: UInt = 32u;
public const val `CBA_DEFERRED_SYMBOL_LOAD_START`: UInt = 1u;
public const val `CBA_DUPLICATE_SYMBOL`: UInt = 5u;
public const val `CBA_ENGINE_PRESENT`: UInt = 1610612736u;
public const val `CBA_EVENT`: UInt = 16u;
public const val `CBA_MAP_JIT_SYMBOL`: UInt = 2684354560u;
public const val `CBA_READ_MEMORY`: UInt = 6u;
public const val `CBA_SET_OPTIONS`: UInt = 8u;
public const val `CBA_SRCSRV_EVENT`: UInt = 1073741824u;
public const val `CBA_SRCSRV_INFO`: UInt = 536870912u;
public const val `CBA_SYMBOLS_UNLOADED`: UInt = 4u;
public const val `CBA_UPDATE_STATUS_BAR`: UInt = 1342177280u;
public const val `CBA_XML_LOG`: UInt = 2415919104u;
public const val `CDFS_FILE_SYSTEM`: `BUGCHECK_ERROR` = 38u;
public const val `CERT_PE_IMAGE_DIGEST_ALL_IMPORT_INFO`: UInt = 4u;
public const val `CERT_PE_IMAGE_DIGEST_DEBUG_INFO`: UInt = 1u;
public const val `CERT_PE_IMAGE_DIGEST_NON_PE_INFO`: UInt = 8u;
public const val `CERT_PE_IMAGE_DIGEST_RESOURCES`: UInt = 2u;
public const val `CERT_SECTION_TYPE_ANY`: UInt = 255u;
public const val `CHECKSUM_MAPVIEW_FAILURE`: UInt = 3u;
public const val `CHECKSUM_MAP_FAILURE`: UInt = 2u;
public const val `CHECKSUM_OPEN_FAILURE`: UInt = 1u;
public const val `CHECKSUM_SUCCESS`: UInt = 0u;
public const val `CHECKSUM_UNICODE_FAILURE`: UInt = 4u;
public const val `CHIPSET_DETECTED_ERROR`: `BUGCHECK_ERROR` = 185u;
public const val `CID_HANDLE_CREATION`: `BUGCHECK_ERROR` = 22u;
public const val `CID_HANDLE_DELETION`: `BUGCHECK_ERROR` = 23u;
public const val `CLOCK_WATCHDOG_TIMEOUT`: `BUGCHECK_ERROR` = 257u;
public const val `CLUSTER_CLUSPORT_STATUS_IO_TIMEOUT_LIVEDUMP`: `BUGCHECK_ERROR` = 377u;
public const val `CLUSTER_CSVFS_LIVEDUMP`: `BUGCHECK_ERROR` = 392u;
public const val `CLUSTER_CSV_CLUSSVC_DISCONNECT_WATCHDOG`: `BUGCHECK_ERROR` = 368u;
public const val `CLUSTER_CSV_CLUSTER_WATCHDOG_LIVEDUMP`: `BUGCHECK_ERROR` = 363u;
public const val `CLUSTER_CSV_SNAPSHOT_DEVICE_INFO_TIMEOUT_LIVEDUMP`: `BUGCHECK_ERROR` = 359u;
public const val `CLUSTER_CSV_STATE_TRANSITION_INTERVAL_TIMEOUT_LIVEDUMP`: `BUGCHECK_ERROR` = 367u;
public const val `CLUSTER_CSV_STATE_TRANSITION_TIMEOUT_LIVEDUMP`: `BUGCHECK_ERROR` = 360u;
public const val `CLUSTER_CSV_STATUS_IO_TIMEOUT_LIVEDUMP`: `BUGCHECK_ERROR` = 357u;
public const val `CLUSTER_CSV_VOLUME_ARRIVAL_LIVEDUMP`: `BUGCHECK_ERROR` = 361u;
public const val `CLUSTER_CSV_VOLUME_REMOVAL_LIVEDUMP`: `BUGCHECK_ERROR` = 362u;
public const val `CLUSTER_RESOURCE_CALL_TIMEOUT_LIVEDUMP`: `BUGCHECK_ERROR` = 358u;
public const val `CLUSTER_SVHDX_LIVEDUMP`: `BUGCHECK_ERROR` = 413u;
public const val `CNSS_FILE_SYSTEM_FILTER`: `BUGCHECK_ERROR` = 164u;
public const val `CONFIG_INITIALIZATION_FAILED`: `BUGCHECK_ERROR` = 103u;
public const val `CONFIG_LIST_FAILED`: `BUGCHECK_ERROR` = 115u;
public const val `CONNECTED_STANDBY_WATCHDOG_TIMEOUT_LIVEDUMP`: `BUGCHECK_ERROR` = 351u;
// UNSUPPORTED Rust 740:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(target_arch = "x86")]
// #[cfg(feature = "Win32_System_Kernel")]
// #[derive(Clone, Copy)]
// pub struct CONTEXT {
//     pub ContextFlags: CONTEXT_FLAGS,
//     pub Dr0: u32,
//     pub Dr1: u32,
//     pub Dr2: u32,
//     pub Dr3: u32,
//     pub Dr6: u32,
//     pub Dr7: u32,
//     pub FloatSave: super::super::Kernel::FLOATING_SAVE_AREA,
//     pub SegGs: u32,
//     pub SegFs: u32,
//     pub SegEs: u32,
//     pub SegDs: u32,
//     pub Edi: u32,
//     pub Esi: u32,
//     pub Ebx: u32,
//     pub Edx: u32,
//     pub Ecx: u32,
//     pub Eax: u32,
//     pub Ebp: u32,
//     pub Eip: u32,
//     pub SegCs: u32,
//     pub EFlags: u32,
//     pub Esp: u32,
//     pub SegSs: u32,
//     pub ExtendedRegisters: [u8; 512],
// }

// UNSUPPORTED Rust 771:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// #[cfg(feature = "Win32_System_Kernel")]
// impl Default for CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 778:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct CONTEXT {
//     pub P1Home: u64,
//     pub P2Home: u64,
//     pub P3Home: u64,
//     pub P4Home: u64,
//     pub P5Home: u64,
//     pub P6Home: u64,
//     pub ContextFlags: CONTEXT_FLAGS,
//     pub MxCsr: u32,
//     pub SegCs: u16,
//     pub SegDs: u16,
//     pub SegEs: u16,
//     pub SegFs: u16,
//     pub SegGs: u16,
//     pub SegSs: u16,
//     pub EFlags: u32,
//     pub Dr0: u64,
//     pub Dr1: u64,
//     pub Dr2: u64,
//     pub Dr3: u64,
//     pub Dr6: u64,
//     pub Dr7: u64,
//     pub Rax: u64,
//     pub Rcx: u64,
//     pub Rdx: u64,
//     pub Rbx: u64,
//     pub Rsp: u64,
//     pub Rbp: u64,
//     pub Rsi: u64,
//     pub Rdi: u64,
//     pub R8: u64,
//     pub R9: u64,
//     pub R10: u64,
//     pub R11: u64,
//     pub R12: u64,
//     pub R13: u64,
//     pub R14: u64,
//     pub R15: u64,
//     pub Rip: u64,
//     pub Anonymous: CONTEXT_0,
//     pub VectorRegister: [M128A; 26],
//     pub VectorControl: u64,
//     pub DebugControl: u64,
//     pub LastBranchToRip: u64,
//     pub LastBranchFromRip: u64,
//     pub LastExceptionToRip: u64,
//     pub LastExceptionFromRip: u64,
// }

// UNSUPPORTED Rust 829:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 835:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub union CONTEXT_0 {
//     pub FltSave: XSAVE_FORMAT,
//     pub Anonymous: CONTEXT_0_0,
// }

// UNSUPPORTED Rust 842:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for CONTEXT_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 848:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct CONTEXT_0_0 {
//     pub Header: [M128A; 2],
//     pub Legacy: [M128A; 8],
//     pub Xmm0: M128A,
//     pub Xmm1: M128A,
//     pub Xmm2: M128A,
//     pub Xmm3: M128A,
//     pub Xmm4: M128A,
//     pub Xmm5: M128A,
//     pub Xmm6: M128A,
//     pub Xmm7: M128A,
//     pub Xmm8: M128A,
//     pub Xmm9: M128A,
//     pub Xmm10: M128A,
//     pub Xmm11: M128A,
//     pub Xmm12: M128A,
//     pub Xmm13: M128A,
//     pub Xmm14: M128A,
//     pub Xmm15: M128A,
// }

// UNSUPPORTED Rust 871:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for CONTEXT_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 877:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(target_arch = "aarch64")]
// #[derive(Clone, Copy)]
// pub struct CONTEXT {
//     pub ContextFlags: CONTEXT_FLAGS,
//     pub Cpsr: u32,
//     pub Anonymous: CONTEXT_0,
//     pub Sp: u64,
//     pub Pc: u64,
//     pub V: [ARM64_NT_NEON128; 32],
//     pub Fpcr: u32,
//     pub Fpsr: u32,
//     pub Bcr: [u32; 8],
//     pub Bvr: [u64; 8],
//     pub Wcr: [u32; 2],
//     pub Wvr: [u64; 2],
// }

// UNSUPPORTED Rust 894:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "aarch64")]
// impl Default for CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 900:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(target_arch = "aarch64")]
// #[derive(Clone, Copy)]
// pub union CONTEXT_0 {
//     pub Anonymous: CONTEXT_0_0,
//     pub X: [u64; 31],
// }

// UNSUPPORTED Rust 907:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "aarch64")]
// impl Default for CONTEXT_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 913:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(target_arch = "aarch64")]
// #[derive(Clone, Copy, Default)]
// pub struct CONTEXT_0_0 {
//     pub X0: u64,
//     pub X1: u64,
//     pub X2: u64,
//     pub X3: u64,
//     pub X4: u64,
//     pub X5: u64,
//     pub X6: u64,
//     pub X7: u64,
//     pub X8: u64,
//     pub X9: u64,
//     pub X10: u64,
//     pub X11: u64,
//     pub X12: u64,
//     pub X13: u64,
//     pub X14: u64,
//     pub X15: u64,
//     pub X16: u64,
//     pub X17: u64,
//     pub X18: u64,
//     pub X19: u64,
//     pub X20: u64,
//     pub X21: u64,
//     pub X22: u64,
//     pub X23: u64,
//     pub X24: u64,
//     pub X25: u64,
//     pub X26: u64,
//     pub X27: u64,
//     pub X28: u64,
//     pub Fp: u64,
//     pub Lr: u64,
// }

public const val `CONTEXT_ALL_AMD64`: `CONTEXT_FLAGS` = 1048607u;
public const val `CONTEXT_ALL_ARM`: `CONTEXT_FLAGS` = 2097167u;
public const val `CONTEXT_ALL_ARM64`: `CONTEXT_FLAGS` = 4194335u;
public const val `CONTEXT_ALL_X86`: `CONTEXT_FLAGS` = 65599u;
public const val `CONTEXT_AMD64`: `CONTEXT_FLAGS` = 1048576u;
public const val `CONTEXT_ARM`: `CONTEXT_FLAGS` = 2097152u;
public const val `CONTEXT_ARM64`: `CONTEXT_FLAGS` = 4194304u;
public const val `CONTEXT_CONTROL_AMD64`: `CONTEXT_FLAGS` = 1048577u;
public const val `CONTEXT_CONTROL_ARM`: `CONTEXT_FLAGS` = 2097153u;
public const val `CONTEXT_CONTROL_ARM64`: `CONTEXT_FLAGS` = 4194305u;
public const val `CONTEXT_CONTROL_X86`: `CONTEXT_FLAGS` = 65537u;
public const val `CONTEXT_DEBUG_REGISTERS_AMD64`: `CONTEXT_FLAGS` = 1048592u;
public const val `CONTEXT_DEBUG_REGISTERS_ARM`: `CONTEXT_FLAGS` = 2097160u;
public const val `CONTEXT_DEBUG_REGISTERS_ARM64`: `CONTEXT_FLAGS` = 4194312u;
public const val `CONTEXT_DEBUG_REGISTERS_X86`: `CONTEXT_FLAGS` = 65552u;
public const val `CONTEXT_EXCEPTION_ACTIVE_AMD64`: `CONTEXT_FLAGS` = 134217728u;
public const val `CONTEXT_EXCEPTION_ACTIVE_ARM`: `CONTEXT_FLAGS` = 134217728u;
public const val `CONTEXT_EXCEPTION_ACTIVE_ARM64`: `CONTEXT_FLAGS` = 134217728u;
public const val `CONTEXT_EXCEPTION_ACTIVE_X86`: `CONTEXT_FLAGS` = 134217728u;
public const val `CONTEXT_EXCEPTION_REPORTING_AMD64`: `CONTEXT_FLAGS` = 2147483648u;
public const val `CONTEXT_EXCEPTION_REPORTING_ARM`: `CONTEXT_FLAGS` = 2147483648u;
public const val `CONTEXT_EXCEPTION_REPORTING_ARM64`: `CONTEXT_FLAGS` = 2147483648u;
public const val `CONTEXT_EXCEPTION_REPORTING_X86`: `CONTEXT_FLAGS` = 2147483648u;
public const val `CONTEXT_EXCEPTION_REQUEST_AMD64`: `CONTEXT_FLAGS` = 1073741824u;
public const val `CONTEXT_EXCEPTION_REQUEST_ARM`: `CONTEXT_FLAGS` = 1073741824u;
public const val `CONTEXT_EXCEPTION_REQUEST_ARM64`: `CONTEXT_FLAGS` = 1073741824u;
public const val `CONTEXT_EXCEPTION_REQUEST_X86`: `CONTEXT_FLAGS` = 1073741824u;
public const val `CONTEXT_EXTENDED_REGISTERS_X86`: `CONTEXT_FLAGS` = 65568u;
public typealias `CONTEXT_FLAGS` = UInt;
public const val `CONTEXT_FLOATING_POINT_AMD64`: `CONTEXT_FLAGS` = 1048584u;
public const val `CONTEXT_FLOATING_POINT_ARM`: `CONTEXT_FLAGS` = 2097156u;
public const val `CONTEXT_FLOATING_POINT_ARM64`: `CONTEXT_FLAGS` = 4194308u;
public const val `CONTEXT_FLOATING_POINT_X86`: `CONTEXT_FLAGS` = 65544u;
public const val `CONTEXT_FULL_AMD64`: `CONTEXT_FLAGS` = 1048587u;
public const val `CONTEXT_FULL_ARM`: `CONTEXT_FLAGS` = 2097159u;
public const val `CONTEXT_FULL_ARM64`: `CONTEXT_FLAGS` = 4194311u;
public const val `CONTEXT_FULL_X86`: `CONTEXT_FLAGS` = 65543u;
public const val `CONTEXT_INTEGER_AMD64`: `CONTEXT_FLAGS` = 1048578u;
public const val `CONTEXT_INTEGER_ARM`: `CONTEXT_FLAGS` = 2097154u;
public const val `CONTEXT_INTEGER_ARM64`: `CONTEXT_FLAGS` = 4194306u;
public const val `CONTEXT_INTEGER_X86`: `CONTEXT_FLAGS` = 65538u;
public const val `CONTEXT_KERNEL_CET_AMD64`: `CONTEXT_FLAGS` = 1048704u;
public const val `CONTEXT_KERNEL_DEBUGGER_AMD64`: `CONTEXT_FLAGS` = 67108864u;
public const val `CONTEXT_RET_TO_GUEST_ARM64`: `CONTEXT_FLAGS` = 1073741824u;
public const val `CONTEXT_SEGMENTS_AMD64`: `CONTEXT_FLAGS` = 1048580u;
public const val `CONTEXT_SEGMENTS_X86`: `CONTEXT_FLAGS` = 65540u;
public const val `CONTEXT_SERVICE_ACTIVE_AMD64`: `CONTEXT_FLAGS` = 268435456u;
public const val `CONTEXT_SERVICE_ACTIVE_ARM`: `CONTEXT_FLAGS` = 268435456u;
public const val `CONTEXT_SERVICE_ACTIVE_ARM64`: `CONTEXT_FLAGS` = 268435456u;
public const val `CONTEXT_SERVICE_ACTIVE_X86`: `CONTEXT_FLAGS` = 268435456u;
public const val `CONTEXT_UNWOUND_TO_CALL_AMD64`: `CONTEXT_FLAGS` = 536870912u;
public const val `CONTEXT_UNWOUND_TO_CALL_ARM`: `CONTEXT_FLAGS` = 536870912u;
public const val `CONTEXT_UNWOUND_TO_CALL_ARM64`: `CONTEXT_FLAGS` = 536870912u;
public const val `CONTEXT_X18_ARM64`: `CONTEXT_FLAGS` = 4194320u;
public const val `CONTEXT_X86`: `CONTEXT_FLAGS` = 65536u;
public const val `CONTEXT_XSTATE_AMD64`: `CONTEXT_FLAGS` = 1048640u;
public const val `CONTEXT_XSTATE_X86`: `CONTEXT_FLAGS` = 65600u;
public const val `COREMSGCALL_INTERNAL_ERROR`: `BUGCHECK_ERROR` = 371u;
public const val `COREMSG_INTERNAL_ERROR`: `BUGCHECK_ERROR` = 372u;
public const val `CORRUPT_ACCESS_TOKEN`: `BUGCHECK_ERROR` = 40u;
// UNSUPPORTED Rust 1009:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union CPU_INFORMATION {
//     pub X86CpuInfo: CPU_INFORMATION_0,
//     pub OtherCpuInfo: CPU_INFORMATION_1,
// }

// UNSUPPORTED Rust 1015:1: declaration Impl has no candidate rule
// impl Default for CPU_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1020:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[derive(Clone, Copy)]
// pub struct CPU_INFORMATION_1 {
//     pub ProcessorFeatures: [u64; 2],
// }

// UNSUPPORTED Rust 1025:1: declaration Impl has no candidate rule
// impl Default for CPU_INFORMATION_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1030:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CPU_INFORMATION_0 {
//     pub VendorId: [u32; 3],
//     pub VersionInformation: u32,
//     pub FeatureInformation: u32,
//     pub AMDExtendedCpuFeatures: u32,
// }

// UNSUPPORTED Rust 1038:1: declaration Impl has no candidate rule
// impl Default for CPU_INFORMATION_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRASHDUMP_WATCHDOG_TIMEOUT`: `BUGCHECK_ERROR` = 486u;
public const val `CREATE_DELETE_LOCK_NOT_LOCKED`: `BUGCHECK_ERROR` = 20u;
public const val `CREATE_PROCESS_DEBUG_EVENT`: `DEBUG_EVENT_CODE` = 3u;
// UNSUPPORTED Rust 1046:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Threading")]
// #[derive(Clone, Copy)]
// pub struct CREATE_PROCESS_DEBUG_INFO {
//     pub hFile: super::super::super::Foundation::HANDLE,
//     pub hProcess: super::super::super::Foundation::HANDLE,
//     pub hThread: super::super::super::Foundation::HANDLE,
//     pub lpBaseOfImage: *mut core::ffi::c_void,
//     pub dwDebugInfoFileOffset: u32,
//     pub nDebugInfoSize: u32,
//     pub lpThreadLocalBase: *mut core::ffi::c_void,
//     pub lpStartAddress: super::super::Threading::LPTHREAD_START_ROUTINE,
//     pub lpImageName: *mut core::ffi::c_void,
//     pub fUnicode: u16,
// }

// UNSUPPORTED Rust 1061:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Threading")]
// impl Default for CREATE_PROCESS_DEBUG_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CREATE_THREAD_DEBUG_EVENT`: `DEBUG_EVENT_CODE` = 2u;
// UNSUPPORTED Rust 1068:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Threading")]
// #[derive(Clone, Copy)]
// pub struct CREATE_THREAD_DEBUG_INFO {
//     pub hThread: super::super::super::Foundation::HANDLE,
//     pub lpThreadLocalBase: *mut core::ffi::c_void,
//     pub lpStartAddress: super::super::Threading::LPTHREAD_START_ROUTINE,
// }

// UNSUPPORTED Rust 1076:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Threading")]
// impl Default for CREATE_THREAD_DEBUG_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRITICAL_INITIALIZATION_FAILURE`: `BUGCHECK_ERROR` = 317u;
public const val `CRITICAL_OBJECT_TERMINATION`: `BUGCHECK_ERROR` = 244u;
public const val `CRITICAL_PROCESS_DIED`: `BUGCHECK_ERROR` = 239u;
public const val `CRITICAL_SERVICE_FAILED`: `BUGCHECK_ERROR` = 90u;
public const val `CRITICAL_STRUCTURE_CORRUPTION`: `BUGCHECK_ERROR` = 265u;
public const val `CRYPTO_LIBRARY_INTERNAL_ERROR`: `BUGCHECK_ERROR` = 369u;
public const val `CRYPTO_SELF_TEST_FAILURE`: `BUGCHECK_ERROR` = 291u;
public const val `CancelCallback`: `MINIDUMP_CALLBACK_TYPE` = 6;
public const val `CommentStreamA`: `MINIDUMP_STREAM_TYPE` = 10;
public const val `CommentStreamW`: `MINIDUMP_STREAM_TYPE` = 11;
public const val `DAM_WATCHDOG_TIMEOUT`: `BUGCHECK_ERROR` = 491u;
public const val `DATA_BUS_ERROR`: `BUGCHECK_ERROR` = 46u;
public const val `DATA_COHERENCY_EXCEPTION`: `BUGCHECK_ERROR` = 85u;
// UNSUPPORTED Rust 1095:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DBGHELP_DATA_REPORT_STRUCT {
//     pub pBinPathNonExist: windows_sys::core::PCWSTR,
//     pub pSymbolPathNonExist: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 1101:1: declaration Impl has no candidate rule
// impl Default for DBGHELP_DATA_REPORT_STRUCT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DBGPROP_ATTRIB_ACCESS_FINAL`: `DBGPROP_ATTRIB_FLAGS` = 32768;
public const val `DBGPROP_ATTRIB_ACCESS_PRIVATE`: `DBGPROP_ATTRIB_FLAGS` = 8192;
public const val `DBGPROP_ATTRIB_ACCESS_PROTECTED`: `DBGPROP_ATTRIB_FLAGS` = 16384;
public const val `DBGPROP_ATTRIB_ACCESS_PUBLIC`: `DBGPROP_ATTRIB_FLAGS` = 4096;
public typealias `DBGPROP_ATTRIB_FLAGS` = Int;
public const val `DBGPROP_ATTRIB_FRAME_INCATCHBLOCK`: `DBGPROP_ATTRIB_FLAGS` = 33554432;
public const val `DBGPROP_ATTRIB_FRAME_INFINALLYBLOCK`: `DBGPROP_ATTRIB_FLAGS` = 67108864;
public const val `DBGPROP_ATTRIB_FRAME_INTRYBLOCK`: `DBGPROP_ATTRIB_FLAGS` = 16777216;
public const val `DBGPROP_ATTRIB_HAS_EXTENDED_ATTRIBS`: `DBGPROP_ATTRIB_FLAGS` = 8388608;
public const val `DBGPROP_ATTRIB_NO_ATTRIB`: `DBGPROP_ATTRIB_FLAGS` = 0;
public const val `DBGPROP_ATTRIB_STORAGE_FIELD`: `DBGPROP_ATTRIB_FLAGS` = 262144;
public const val `DBGPROP_ATTRIB_STORAGE_GLOBAL`: `DBGPROP_ATTRIB_FLAGS` = 65536;
public const val `DBGPROP_ATTRIB_STORAGE_STATIC`: `DBGPROP_ATTRIB_FLAGS` = 131072;
public const val `DBGPROP_ATTRIB_STORAGE_VIRTUAL`: `DBGPROP_ATTRIB_FLAGS` = 524288;
public const val `DBGPROP_ATTRIB_TYPE_IS_CONSTANT`: `DBGPROP_ATTRIB_FLAGS` = 1048576;
public const val `DBGPROP_ATTRIB_TYPE_IS_SYNCHRONIZED`: `DBGPROP_ATTRIB_FLAGS` = 2097152;
public const val `DBGPROP_ATTRIB_TYPE_IS_VOLATILE`: `DBGPROP_ATTRIB_FLAGS` = 4194304;
public const val `DBGPROP_ATTRIB_VALUE_IS_EVENT`: `DBGPROP_ATTRIB_FLAGS` = 512;
public const val `DBGPROP_ATTRIB_VALUE_IS_EXPANDABLE`: `DBGPROP_ATTRIB_FLAGS` = 16;
public const val `DBGPROP_ATTRIB_VALUE_IS_FAKE`: `DBGPROP_ATTRIB_FLAGS` = 32;
public const val `DBGPROP_ATTRIB_VALUE_IS_INVALID`: `DBGPROP_ATTRIB_FLAGS` = 8;
public const val `DBGPROP_ATTRIB_VALUE_IS_METHOD`: `DBGPROP_ATTRIB_FLAGS` = 256;
public const val `DBGPROP_ATTRIB_VALUE_IS_RAW_STRING`: `DBGPROP_ATTRIB_FLAGS` = 1024;
public const val `DBGPROP_ATTRIB_VALUE_IS_RETURN_VALUE`: `DBGPROP_ATTRIB_FLAGS` = 134217728;
public const val `DBGPROP_ATTRIB_VALUE_PENDING_MUTATION`: `DBGPROP_ATTRIB_FLAGS` = 268435456;
public const val `DBGPROP_ATTRIB_VALUE_READONLY`: `DBGPROP_ATTRIB_FLAGS` = 2048;
public typealias `DBGPROP_INFO` = Int;
public const val `DBGPROP_INFO_ATTRIBUTES`: `DBGPROP_INFO` = 8;
public const val `DBGPROP_INFO_AUTOEXPAND`: `DBGPROP_INFO` = 134217728;
public const val `DBGPROP_INFO_BEAUTIFY`: `DBGPROP_INFO` = 33554432;
public const val `DBGPROP_INFO_CALLTOSTRING`: `DBGPROP_INFO` = 67108864;
public const val `DBGPROP_INFO_DEBUGPROP`: `DBGPROP_INFO` = 16;
public const val `DBGPROP_INFO_FULLNAME`: `DBGPROP_INFO` = 32;
public const val `DBGPROP_INFO_NAME`: `DBGPROP_INFO` = 1;
public const val `DBGPROP_INFO_TYPE`: `DBGPROP_INFO` = 2;
public const val `DBGPROP_INFO_VALUE`: `DBGPROP_INFO` = 4;
public const val `DBHHEADER_CVMISC`: `MODLOAD_DATA_TYPE` = 2u;
public const val `DBHHEADER_DEBUGDIRS`: `MODLOAD_DATA_TYPE` = 1u;
public const val `DBHHEADER_PDBGUID`: UInt = 3u;
// UNSUPPORTED Rust 1145:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Threading")]
// #[derive(Clone, Copy)]
// pub struct DEBUG_EVENT {
//     pub dwDebugEventCode: DEBUG_EVENT_CODE,
//     pub dwProcessId: u32,
//     pub dwThreadId: u32,
//     pub u: DEBUG_EVENT_0,
// }

// UNSUPPORTED Rust 1154:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Threading")]
// impl Default for DEBUG_EVENT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1160:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Threading")]
// #[derive(Clone, Copy)]
// pub union DEBUG_EVENT_0 {
//     pub Exception: EXCEPTION_DEBUG_INFO,
//     pub CreateThread: CREATE_THREAD_DEBUG_INFO,
//     pub CreateProcessInfo: CREATE_PROCESS_DEBUG_INFO,
//     pub ExitThread: EXIT_THREAD_DEBUG_INFO,
//     pub ExitProcess: EXIT_PROCESS_DEBUG_INFO,
//     pub LoadDll: LOAD_DLL_DEBUG_INFO,
//     pub UnloadDll: UNLOAD_DLL_DEBUG_INFO,
//     pub DebugString: OUTPUT_DEBUG_STRING_INFO,
//     pub RipInfo: RIP_INFO,
// }

// UNSUPPORTED Rust 1174:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Threading")]
// impl Default for DEBUG_EVENT_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DEBUG_EVENT_CODE` = UInt;
public const val `DEREF_UNKNOWN_LOGON_SESSION`: `BUGCHECK_ERROR` = 70u;
public const val `DEVICE_DIAGNOSTIC_LOG_LIVEDUMP`: `BUGCHECK_ERROR` = 481u;
public const val `DEVICE_QUEUE_NOT_BUSY`: `BUGCHECK_ERROR` = 2u;
public const val `DEVICE_REFERENCE_COUNT_NOT_ZERO`: `BUGCHECK_ERROR` = 54u;
public const val `DFSC_FILE_SYSTEM`: `BUGCHECK_ERROR` = 267u;
public const val `DFS_FILE_SYSTEM`: `BUGCHECK_ERROR` = 130u;
// UNSUPPORTED Rust 1187:1: generic scalar type unsupported
// pub type DIGEST_FUNCTION = Option<unsafe extern "system" fn(refdata: *mut core::ffi::c_void, pdata: *mut u8, dwlength: u32) -> windows_sys::core::BOOL>;

public const val `DIRECTED_FX_TRANSITION_LIVEDUMP`: `BUGCHECK_ERROR` = 425u;
public const val `DIRTY_MAPPED_PAGES_CONGESTION`: `BUGCHECK_ERROR` = 235u;
public const val `DIRTY_NOWRITE_PAGES_CONGESTION`: `BUGCHECK_ERROR` = 253u;
public const val `DISORDERLY_SHUTDOWN`: `BUGCHECK_ERROR` = 243u;
// UNSUPPORTED Rust 1192:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "arm64ec", target_arch = "x86_64"))]
// #[cfg(feature = "Win32_System_Kernel")]
// #[derive(Clone, Copy)]
// pub struct DISPATCHER_CONTEXT {
//     pub ControlPc: u64,
//     pub ImageBase: u64,
//     pub FunctionEntry: *mut IMAGE_RUNTIME_FUNCTION_ENTRY,
//     pub EstablisherFrame: u64,
//     pub TargetIp: u64,
//     pub ContextRecord: *mut CONTEXT,
//     pub LanguageHandler: super::super::Kernel::EXCEPTION_ROUTINE,
//     pub HandlerData: *mut core::ffi::c_void,
//     pub HistoryTable: *mut UNWIND_HISTORY_TABLE,
//     pub ScopeIndex: u32,
//     pub Fill0: u32,
// }

// UNSUPPORTED Rust 1209:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "arm64ec", target_arch = "x86_64"))]
// #[cfg(feature = "Win32_System_Kernel")]
// impl Default for DISPATCHER_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1216:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(target_arch = "aarch64")]
// #[cfg(feature = "Win32_System_Kernel")]
// #[derive(Clone, Copy)]
// pub struct DISPATCHER_CONTEXT {
//     pub ControlPc: usize,
//     pub ImageBase: usize,
//     pub FunctionEntry: *mut IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY,
//     pub EstablisherFrame: usize,
//     pub TargetPc: usize,
//     pub ContextRecord: *mut CONTEXT,
//     pub LanguageHandler: super::super::Kernel::EXCEPTION_ROUTINE,
//     pub HandlerData: *mut core::ffi::c_void,
//     pub HistoryTable: *mut UNWIND_HISTORY_TABLE,
//     pub ScopeIndex: u32,
//     pub ControlPcIsUnwound: bool,
//     pub NonVolatileRegisters: *mut u8,
// }

// UNSUPPORTED Rust 1234:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "aarch64")]
// #[cfg(feature = "Win32_System_Kernel")]
// impl Default for DISPATCHER_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DMA_COMMON_BUFFER_VECTOR_ERROR`: `BUGCHECK_ERROR` = 476u;
public const val `DMP_CONTEXT_RECORD_SIZE_32`: UInt = 1200u;
public const val `DMP_CONTEXT_RECORD_SIZE_64`: UInt = 3000u;
public const val `DMP_HEADER_COMMENT_SIZE`: UInt = 128u;
public const val `DMP_PHYSICAL_MEMORY_BLOCK_SIZE_32`: UInt = 700u;
public const val `DMP_PHYSICAL_MEMORY_BLOCK_SIZE_64`: UInt = 700u;
public const val `DMP_RESERVED_0_SIZE_32`: UInt = 1760u;
public const val `DMP_RESERVED_0_SIZE_64`: UInt = 4008u;
public const val `DMP_RESERVED_2_SIZE_32`: UInt = 16u;
public const val `DMP_RESERVED_3_SIZE_32`: UInt = 56u;
public const val `DPC_WATCHDOG_TIMEOUT`: `BUGCHECK_ERROR` = 258u;
public const val `DPC_WATCHDOG_VIOLATION`: `BUGCHECK_ERROR` = 307u;
public const val `DRIPS_SW_HW_DIVERGENCE_LIVEDUMP`: `BUGCHECK_ERROR` = 420u;
public const val `DRIVER_CAUGHT_MODIFYING_FREED_POOL`: `BUGCHECK_ERROR` = 198u;
public const val `DRIVER_CORRUPTED_EXPOOL`: `BUGCHECK_ERROR` = 197u;
public const val `DRIVER_CORRUPTED_MMPOOL`: `BUGCHECK_ERROR` = 208u;
public const val `DRIVER_CORRUPTED_SYSPTES`: `BUGCHECK_ERROR` = 219u;
public const val `DRIVER_INVALID_CRUNTIME_PARAMETER`: `BUGCHECK_ERROR` = 272u;
public const val `DRIVER_INVALID_STACK_ACCESS`: `BUGCHECK_ERROR` = 220u;
public const val `DRIVER_IRQL_NOT_LESS_OR_EQUAL`: `BUGCHECK_ERROR` = 209u;
public const val `DRIVER_LEFT_LOCKED_PAGES_IN_PROCESS`: `BUGCHECK_ERROR` = 203u;
public const val `DRIVER_OVERRAN_STACK_BUFFER`: `BUGCHECK_ERROR` = 247u;
public const val `DRIVER_PAGE_FAULT_BEYOND_END_OF_ALLOCATION`: `BUGCHECK_ERROR` = 214u;
public const val `DRIVER_PAGE_FAULT_BEYOND_END_OF_ALLOCATION_M`: `BUGCHECK_ERROR` = 268435670u;
public const val `DRIVER_PAGE_FAULT_IN_FREED_SPECIAL_POOL`: `BUGCHECK_ERROR` = 213u;
public const val `DRIVER_PNP_WATCHDOG`: `BUGCHECK_ERROR` = 469u;
public const val `DRIVER_PORTION_MUST_BE_NONPAGED`: `BUGCHECK_ERROR` = 211u;
public const val `DRIVER_POWER_STATE_FAILURE`: `BUGCHECK_ERROR` = 159u;
public const val `DRIVER_RETURNED_HOLDING_CANCEL_LOCK`: `BUGCHECK_ERROR` = 283u;
public const val `DRIVER_RETURNED_STATUS_REPARSE_FOR_VOLUME_OPEN`: `BUGCHECK_ERROR` = 249u;
public const val `DRIVER_UNLOADED_WITHOUT_CANCELLING_PENDING_OPERATIONS`: `BUGCHECK_ERROR` = 206u;
public const val `DRIVER_UNMAPPING_INVALID_VIEW`: `BUGCHECK_ERROR` = 215u;
public const val `DRIVER_USED_EXCESSIVE_PTES`: `BUGCHECK_ERROR` = 216u;
public const val `DRIVER_VERIFIER_DETECTED_VIOLATION`: `BUGCHECK_ERROR` = 196u;
public const val `DRIVER_VERIFIER_DETECTED_VIOLATION_LIVEDUMP`: `BUGCHECK_ERROR` = 452u;
public const val `DRIVER_VERIFIER_DMA_VIOLATION`: `BUGCHECK_ERROR` = 230u;
public const val `DRIVER_VERIFIER_IOMANAGER_VIOLATION`: `BUGCHECK_ERROR` = 201u;
public const val `DRIVER_VERIFIER_TRACKING_LIVE_DUMP`: `BUGCHECK_ERROR` = 485u;
public const val `DRIVER_VIOLATION`: `BUGCHECK_ERROR` = 289u;
public const val `DRIVE_EXTENDER`: `BUGCHECK_ERROR` = 308u;
public const val `DSLFLAG_MISMATCHED_DBG`: UInt = 2u;
public const val `DSLFLAG_MISMATCHED_PDB`: UInt = 1u;
// UNSUPPORTED Rust 1283:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DUMP_FILE_ATTRIBUTES {
//     pub Anonymous: DUMP_FILE_ATTRIBUTES_0,
//     pub Attributes: u32,
// }

// UNSUPPORTED Rust 1289:1: declaration Impl has no candidate rule
// impl Default for DUMP_FILE_ATTRIBUTES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1294:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DUMP_FILE_ATTRIBUTES_0 {
//     pub _bitfield: u32,
// }

// UNSUPPORTED Rust 1299:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DUMP_HEADER32 {
//     pub Signature: u32,
//     pub ValidDump: u32,
//     pub MajorVersion: u32,
//     pub MinorVersion: u32,
//     pub DirectoryTableBase: u32,
//     pub PfnDataBase: u32,
//     pub PsLoadedModuleList: u32,
//     pub PsActiveProcessHead: u32,
//     pub MachineImageType: u32,
//     pub NumberProcessors: u32,
//     pub BugCheckCode: u32,
//     pub BugCheckParameter1: u32,
//     pub BugCheckParameter2: u32,
//     pub BugCheckParameter3: u32,
//     pub BugCheckParameter4: u32,
//     pub VersionUser: [i8; 32],
//     pub PaeEnabled: u8,
//     pub KdSecondaryVersion: u8,
//     pub Spare3: [u8; 2],
//     pub KdDebuggerDataBlock: u32,
//     pub Anonymous: DUMP_HEADER32_0,
//     pub ContextRecord: [u8; 1200],
//     pub Exception: EXCEPTION_RECORD32,
//     pub Comment: [i8; 128],
//     pub Attributes: DUMP_FILE_ATTRIBUTES,
//     pub BootId: u32,
//     pub _reserved0: [u8; 1760],
//     pub DumpType: u32,
//     pub MiniDumpFields: u32,
//     pub SecondaryDataState: u32,
//     pub ProductType: u32,
//     pub SuiteMask: u32,
//     pub WriterStatus: u32,
//     pub RequiredDumpSpace: i64,
//     pub _reserved2: [u8; 16],
//     pub SystemUpTime: i64,
//     pub SystemTime: i64,
//     pub _reserved3: [u8; 56],
// }

// UNSUPPORTED Rust 1341:1: declaration Impl has no candidate rule
// impl Default for DUMP_HEADER32 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1346:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DUMP_HEADER32_0 {
//     pub PhysicalMemoryBlock: PHYSICAL_MEMORY_DESCRIPTOR32,
//     pub PhysicalMemoryBlockBuffer: [u8; 700],
// }

// UNSUPPORTED Rust 1352:1: declaration Impl has no candidate rule
// impl Default for DUMP_HEADER32_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1357:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DUMP_HEADER64 {
//     pub Signature: u32,
//     pub ValidDump: u32,
//     pub MajorVersion: u32,
//     pub MinorVersion: u32,
//     pub DirectoryTableBase: u64,
//     pub PfnDataBase: u64,
//     pub PsLoadedModuleList: u64,
//     pub PsActiveProcessHead: u64,
//     pub MachineImageType: u32,
//     pub NumberProcessors: u32,
//     pub BugCheckCode: u32,
//     pub BugCheckParameter1: u64,
//     pub BugCheckParameter2: u64,
//     pub BugCheckParameter3: u64,
//     pub BugCheckParameter4: u64,
//     pub VersionUser: [i8; 32],
//     pub KdDebuggerDataBlock: u64,
//     pub Anonymous: DUMP_HEADER64_0,
//     pub ContextRecord: [u8; 3000],
//     pub Exception: EXCEPTION_RECORD64,
//     pub DumpType: u32,
//     pub RequiredDumpSpace: i64,
//     pub SystemTime: i64,
//     pub Comment: [i8; 128],
//     pub SystemUpTime: i64,
//     pub MiniDumpFields: u32,
//     pub SecondaryDataState: u32,
//     pub ProductType: u32,
//     pub SuiteMask: u32,
//     pub WriterStatus: u32,
//     pub Unused1: u8,
//     pub KdSecondaryVersion: u8,
//     pub Unused: [u8; 2],
//     pub Attributes: DUMP_FILE_ATTRIBUTES,
//     pub BootId: u32,
//     pub _reserved0: [u8; 4008],
// }

// UNSUPPORTED Rust 1397:1: declaration Impl has no candidate rule
// impl Default for DUMP_HEADER64 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1402:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DUMP_HEADER64_0 {
//     pub PhysicalMemoryBlock: PHYSICAL_MEMORY_DESCRIPTOR64,
//     pub PhysicalMemoryBlockBuffer: [u8; 700],
// }

// UNSUPPORTED Rust 1408:1: declaration Impl has no candidate rule
// impl Default for DUMP_HEADER64_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DUMP_SUMMARY_VALID_CURRENT_USER_VA`: UInt = 2u;
public const val `DUMP_SUMMARY_VALID_KERNEL_VA`: UInt = 1u;
public typealias `DUMP_TYPE` = Int;
public const val `DUMP_TYPE_AUTOMATIC`: `DUMP_TYPE` = 7;
public const val `DUMP_TYPE_BITMAP_FULL`: `DUMP_TYPE` = 5;
public const val `DUMP_TYPE_BITMAP_KERNEL`: `DUMP_TYPE` = 6;
public const val `DUMP_TYPE_FULL`: `DUMP_TYPE` = 1;
public const val `DUMP_TYPE_HEADER`: `DUMP_TYPE` = 3;
public const val `DUMP_TYPE_INVALID`: `DUMP_TYPE` = -1;
public const val `DUMP_TYPE_SUMMARY`: `DUMP_TYPE` = 2;
public const val `DUMP_TYPE_TRIAGE`: `DUMP_TYPE` = 4;
public const val `DUMP_TYPE_UNKNOWN`: `DUMP_TYPE` = 0;
public const val `DYNAMIC_ADD_PROCESSOR_MISMATCH`: `BUGCHECK_ERROR` = 304u;
// UNSUPPORTED Rust 1426:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DebugPropertyInfo {
//     pub m_dwValidFields: u32,
//     pub m_bstrName: windows_sys::core::BSTR,
//     pub m_bstrType: windows_sys::core::BSTR,
//     pub m_bstrValue: windows_sys::core::BSTR,
//     pub m_bstrFullName: windows_sys::core::BSTR,
//     pub m_dwAttrib: u32,
//     pub m_pDebugProp: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 1437:1: declaration Impl has no candidate rule
// impl Default for DebugPropertyInfo {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `EFS_FATAL_ERROR`: `BUGCHECK_ERROR` = 471u;
public const val `ELAM_DRIVER_DETECTED_FATAL_ERROR`: `BUGCHECK_ERROR` = 376u;
public const val `EMPTY_THREAD_REAPER_LIST`: `BUGCHECK_ERROR` = 19u;
public const val `EM_INITIALIZATION_ERROR`: `BUGCHECK_ERROR` = 282u;
public const val `END_OF_NT_EVALUATION_PERIOD`: `BUGCHECK_ERROR` = 152u;
public const val `ERESOURCE_INVALID_RELEASE`: `BUGCHECK_ERROR` = 366u;
public const val `ERRATA_WORKAROUND_UNSUCCESSFUL`: `BUGCHECK_ERROR` = 318u;
public const val `ERROR_IMAGE_NOT_STRIPPED`: UInt = 34816u;
public const val `ERROR_NO_DBG_POINTER`: UInt = 34817u;
public const val `ERROR_NO_PDB_POINTER`: UInt = 34818u;
public const val `ESLFLAG_FULLPATH`: UInt = 1u;
public const val `ESLFLAG_INLINE_SITE`: UInt = 16u;
public const val `ESLFLAG_NEAREST`: UInt = 2u;
public const val `ESLFLAG_NEXT`: UInt = 8u;
public const val `ESLFLAG_PREV`: UInt = 4u;
public const val `EVENT_SRCSPEW`: UInt = 100u;
public const val `EVENT_SRCSPEW_END`: UInt = 199u;
public const val `EVENT_SRCSPEW_START`: UInt = 100u;
public const val `EVENT_TRACING_FATAL_ERROR`: `BUGCHECK_ERROR` = 285u;
public const val `EXCEPTION_CONTINUE_EXECUTION`: Int = -1;
public const val `EXCEPTION_CONTINUE_SEARCH`: Int = 0;
public const val `EXCEPTION_DEBUG_EVENT`: `DEBUG_EVENT_CODE` = 1u;
// UNSUPPORTED Rust 1464:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EXCEPTION_DEBUG_INFO {
//     pub ExceptionRecord: EXCEPTION_RECORD,
//     pub dwFirstChance: u32,
// }

public const val `EXCEPTION_EXECUTE_HANDLER`: Int = 1;
public const val `EXCEPTION_ON_INVALID_STACK`: `BUGCHECK_ERROR` = 426u;
// UNSUPPORTED Rust 1472:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Kernel")]
// #[derive(Clone, Copy)]
// pub struct EXCEPTION_POINTERS {
//     pub ExceptionRecord: *mut EXCEPTION_RECORD,
//     pub ContextRecord: *mut CONTEXT,
// }

// UNSUPPORTED Rust 1479:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Kernel")]
// impl Default for EXCEPTION_POINTERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1485:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EXCEPTION_RECORD {
//     pub ExceptionCode: super::super::super::Foundation::NTSTATUS,
//     pub ExceptionFlags: u32,
//     pub ExceptionRecord: *mut EXCEPTION_RECORD,
//     pub ExceptionAddress: *mut core::ffi::c_void,
//     pub NumberParameters: u32,
//     pub ExceptionInformation: [usize; 15],
// }

// UNSUPPORTED Rust 1495:1: declaration Impl has no candidate rule
// impl Default for EXCEPTION_RECORD {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1500:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EXCEPTION_RECORD32 {
//     pub ExceptionCode: super::super::super::Foundation::NTSTATUS,
//     pub ExceptionFlags: u32,
//     pub ExceptionRecord: u32,
//     pub ExceptionAddress: u32,
//     pub NumberParameters: u32,
//     pub ExceptionInformation: [u32; 15],
// }

// UNSUPPORTED Rust 1510:1: declaration Impl has no candidate rule
// impl Default for EXCEPTION_RECORD32 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1515:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EXCEPTION_RECORD64 {
//     pub ExceptionCode: super::super::super::Foundation::NTSTATUS,
//     pub ExceptionFlags: u32,
//     pub ExceptionRecord: u64,
//     pub ExceptionAddress: u64,
//     pub NumberParameters: u32,
//     pub __unusedAlignment: u32,
//     pub ExceptionInformation: [u64; 15],
// }

// UNSUPPORTED Rust 1526:1: declaration Impl has no candidate rule
// impl Default for EXCEPTION_RECORD64 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `EXCEPTION_SCOPE_INVALID`: `BUGCHECK_ERROR` = 333u;
public const val `EXFAT_FILE_SYSTEM`: `BUGCHECK_ERROR` = 300u;
public const val `EXIT_PROCESS_DEBUG_EVENT`: `DEBUG_EVENT_CODE` = 5u;
// UNSUPPORTED Rust 1534:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EXIT_PROCESS_DEBUG_INFO {
//     pub dwExitCode: u32,
// }

public const val `EXIT_THREAD_DEBUG_EVENT`: `DEBUG_EVENT_CODE` = 4u;
// UNSUPPORTED Rust 1540:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct EXIT_THREAD_DEBUG_INFO {
//     pub dwExitCode: u32,
// }

public const val `EXRESOURCE_TIMEOUT_LIVEDUMP`: `BUGCHECK_ERROR` = 460u;
public const val `EXT_OUTPUT_VER`: UInt = 1u;
public const val `EX_PROP_INFO_DEBUGEXTPROP`: `EX_PROP_INFO_FLAGS` = 4096;
public typealias `EX_PROP_INFO_FLAGS` = Int;
public const val `EX_PROP_INFO_ID`: `EX_PROP_INFO_FLAGS` = 256;
public const val `EX_PROP_INFO_LOCKBYTES`: `EX_PROP_INFO_FLAGS` = 2048;
public const val `EX_PROP_INFO_NTYPE`: `EX_PROP_INFO_FLAGS` = 512;
public const val `EX_PROP_INFO_NVALUE`: `EX_PROP_INFO_FLAGS` = 1024;
public const val `ExceptionStream`: `MINIDUMP_STREAM_TYPE` = 6;
// UNSUPPORTED Rust 1554:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
// #[derive(Clone, Copy)]
// pub struct ExtendedDebugPropertyInfo {
//     pub dwValidFields: u32,
//     pub pszName: windows_sys::core::PWSTR,
//     pub pszType: windows_sys::core::PWSTR,
//     pub pszValue: windows_sys::core::PWSTR,
//     pub pszFullName: windows_sys::core::PWSTR,
//     pub dwAttrib: u32,
//     pub pDebugProp: *mut core::ffi::c_void,
//     pub nDISPID: u32,
//     pub nType: u32,
//     pub varValue: super::super::Variant::VARIANT,
//     pub plbValue: *mut core::ffi::c_void,
//     pub pDebugExtProp: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 1571:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
// impl Default for ExtendedDebugPropertyInfo {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FACILITY_AAF`: `FACILITY_CODE` = 18u;
public const val `FACILITY_ACCELERATOR`: `FACILITY_CODE` = 1536u;
public const val `FACILITY_ACS`: `FACILITY_CODE` = 20u;
public const val `FACILITY_ACTION_QUEUE`: `FACILITY_CODE` = 44u;
public const val `FACILITY_AUDCLNT`: `FACILITY_CODE` = 2185u;
public const val `FACILITY_AUDIO`: `FACILITY_CODE` = 102u;
public const val `FACILITY_AUDIOSTREAMING`: `FACILITY_CODE` = 1094u;
public const val `FACILITY_BACKGROUNDCOPY`: `FACILITY_CODE` = 32u;
public const val `FACILITY_BCD`: `FACILITY_CODE` = 57u;
public const val `FACILITY_BLB`: `FACILITY_CODE` = 120u;
public const val `FACILITY_BLBUI`: `FACILITY_CODE` = 128u;
public const val `FACILITY_BLB_CLI`: `FACILITY_CODE` = 121u;
public const val `FACILITY_BLUETOOTH_ATT`: `FACILITY_CODE` = 101u;
public const val `FACILITY_CERT`: `FACILITY_CODE` = 11u;
public const val `FACILITY_CMI`: `FACILITY_CODE` = 54u;
public typealias `FACILITY_CODE` = UInt;
public const val `FACILITY_COMPLUS`: `FACILITY_CODE` = 17u;
public const val `FACILITY_CONFIGURATION`: `FACILITY_CODE` = 33u;
public const val `FACILITY_CONTROL`: `FACILITY_CODE` = 10u;
public const val `FACILITY_DAF`: `FACILITY_CODE` = 100u;
public const val `FACILITY_DEBUGGERS`: `FACILITY_CODE` = 176u;
public const val `FACILITY_DEFRAG`: `FACILITY_CODE` = 2304u;
public const val `FACILITY_DELIVERY_OPTIMIZATION`: `FACILITY_CODE` = 208u;
public const val `FACILITY_DEPLOYMENT_SERVICES_BINLSVC`: `FACILITY_CODE` = 261u;
public const val `FACILITY_DEPLOYMENT_SERVICES_CONTENT_PROVIDER`: `FACILITY_CODE` = 293u;
public const val `FACILITY_DEPLOYMENT_SERVICES_DRIVER_PROVISIONING`: `FACILITY_CODE` = 278u;
public const val `FACILITY_DEPLOYMENT_SERVICES_IMAGING`: `FACILITY_CODE` = 258u;
public const val `FACILITY_DEPLOYMENT_SERVICES_MANAGEMENT`: `FACILITY_CODE` = 259u;
public const val `FACILITY_DEPLOYMENT_SERVICES_MULTICAST_CLIENT`: `FACILITY_CODE` = 290u;
public const val `FACILITY_DEPLOYMENT_SERVICES_MULTICAST_SERVER`: `FACILITY_CODE` = 289u;
public const val `FACILITY_DEPLOYMENT_SERVICES_PXE`: `FACILITY_CODE` = 263u;
public const val `FACILITY_DEPLOYMENT_SERVICES_SERVER`: `FACILITY_CODE` = 257u;
public const val `FACILITY_DEPLOYMENT_SERVICES_TFTP`: `FACILITY_CODE` = 264u;
public const val `FACILITY_DEPLOYMENT_SERVICES_TRANSPORT_MANAGEMENT`: `FACILITY_CODE` = 272u;
public const val `FACILITY_DEPLOYMENT_SERVICES_UTIL`: `FACILITY_CODE` = 260u;
public const val `FACILITY_DEVICE_UPDATE_AGENT`: `FACILITY_CODE` = 135u;
public const val `FACILITY_DIRECT2D`: `FACILITY_CODE` = 2201u;
public const val `FACILITY_DIRECT3D10`: `FACILITY_CODE` = 2169u;
public const val `FACILITY_DIRECT3D11`: `FACILITY_CODE` = 2172u;
public const val `FACILITY_DIRECT3D11_DEBUG`: `FACILITY_CODE` = 2173u;
public const val `FACILITY_DIRECT3D12`: `FACILITY_CODE` = 2174u;
public const val `FACILITY_DIRECT3D12_DEBUG`: `FACILITY_CODE` = 2175u;
public const val `FACILITY_DIRECTMUSIC`: `FACILITY_CODE` = 2168u;
public const val `FACILITY_DIRECTORYSERVICE`: `FACILITY_CODE` = 37u;
public const val `FACILITY_DISPATCH`: `FACILITY_CODE` = 2u;
public const val `FACILITY_DLS`: `FACILITY_CODE` = 153u;
public const val `FACILITY_DMSERVER`: `FACILITY_CODE` = 256u;
public const val `FACILITY_DPLAY`: `FACILITY_CODE` = 21u;
public const val `FACILITY_DRVSERVICING`: `FACILITY_CODE` = 136u;
public const val `FACILITY_DXCORE`: `FACILITY_CODE` = 2176u;
public const val `FACILITY_DXGI`: `FACILITY_CODE` = 2170u;
public const val `FACILITY_DXGI_DDI`: `FACILITY_CODE` = 2171u;
public const val `FACILITY_EAP`: `FACILITY_CODE` = 66u;
public const val `FACILITY_EAS`: `FACILITY_CODE` = 85u;
public const val `FACILITY_FVE`: `FACILITY_CODE` = 49u;
public const val `FACILITY_FWP`: `FACILITY_CODE` = 50u;
public const val `FACILITY_GAME`: `FACILITY_CODE` = 2340u;
public const val `FACILITY_GRAPHICS`: `FACILITY_CODE` = 38u;
public const val `FACILITY_HSP_SERVICES`: `FACILITY_CODE` = 296u;
public const val `FACILITY_HSP_SOFTWARE`: `FACILITY_CODE` = 297u;
public const val `FACILITY_HTTP`: `FACILITY_CODE` = 25u;
public const val `FACILITY_INPUT`: `FACILITY_CODE` = 64u;
public const val `FACILITY_INTERNET`: `FACILITY_CODE` = 12u;
public const val `FACILITY_IORING`: `FACILITY_CODE` = 70u;
public const val `FACILITY_ITF`: `FACILITY_CODE` = 4u;
public const val `FACILITY_JSCRIPT`: `FACILITY_CODE` = 2306u;
public const val `FACILITY_LEAP`: `FACILITY_CODE` = 2184u;
public const val `FACILITY_LINGUISTIC_SERVICES`: `FACILITY_CODE` = 305u;
public const val `FACILITY_MBN`: `FACILITY_CODE` = 84u;
public const val `FACILITY_MEDIASERVER`: `FACILITY_CODE` = 13u;
public const val `FACILITY_METADIRECTORY`: `FACILITY_CODE` = 35u;
public const val `FACILITY_MOBILE`: `FACILITY_CODE` = 1793u;
public const val `FACILITY_MSMQ`: `FACILITY_CODE` = 14u;
public const val `FACILITY_NAP`: `FACILITY_CODE` = 39u;
public const val `FACILITY_NDIS`: `FACILITY_CODE` = 52u;
public const val `FACILITY_NT_BIT`: `FACILITY_CODE` = 268435456u;
public const val `FACILITY_NULL`: `FACILITY_CODE` = 0u;
public const val `FACILITY_OCP_UPDATE_AGENT`: `FACILITY_CODE` = 173u;
public const val `FACILITY_ONLINE_ID`: `FACILITY_CODE` = 134u;
public const val `FACILITY_OPC`: `FACILITY_CODE` = 81u;
public const val `FACILITY_P2P`: `FACILITY_CODE` = 99u;
public const val `FACILITY_P2P_INT`: `FACILITY_CODE` = 98u;
public const val `FACILITY_PARSE`: `FACILITY_CODE` = 113u;
public const val `FACILITY_PIDGENX`: `FACILITY_CODE` = 2561u;
public const val `FACILITY_PIX`: `FACILITY_CODE` = 2748u;
public const val `FACILITY_PLA`: `FACILITY_CODE` = 48u;
public const val `FACILITY_POWERSHELL`: `FACILITY_CODE` = 84u;
public const val `FACILITY_PRESENTATION`: `FACILITY_CODE` = 2177u;
public const val `FACILITY_QUIC`: `FACILITY_CODE` = 65u;
public const val `FACILITY_RAS`: `FACILITY_CODE` = 83u;
public const val `FACILITY_RESTORE`: `FACILITY_CODE` = 256u;
public const val `FACILITY_RPC`: `FACILITY_CODE` = 1u;
public const val `FACILITY_SCARD`: `FACILITY_CODE` = 16u;
public const val `FACILITY_SCRIPT`: `FACILITY_CODE` = 112u;
public const val `FACILITY_SDIAG`: `FACILITY_CODE` = 60u;
public const val `FACILITY_SECURITY`: `FACILITY_CODE` = 9u;
public const val `FACILITY_SERVICE_FABRIC`: `FACILITY_CODE` = 1968u;
public const val `FACILITY_SETUPAPI`: `FACILITY_CODE` = 15u;
public const val `FACILITY_SHELL`: `FACILITY_CODE` = 39u;
public const val `FACILITY_SOS`: `FACILITY_CODE` = 160u;
public const val `FACILITY_SPP`: `FACILITY_CODE` = 256u;
public const val `FACILITY_SQLITE`: `FACILITY_CODE` = 1967u;
public const val `FACILITY_SSPI`: `FACILITY_CODE` = 9u;
public const val `FACILITY_STATEREPOSITORY`: `FACILITY_CODE` = 103u;
public const val `FACILITY_STATE_MANAGEMENT`: `FACILITY_CODE` = 34u;
public const val `FACILITY_STORAGE`: `FACILITY_CODE` = 3u;
public const val `FACILITY_SXS`: `FACILITY_CODE` = 23u;
public const val `FACILITY_SYNCENGINE`: `FACILITY_CODE` = 2050u;
public const val `FACILITY_TIERING`: `FACILITY_CODE` = 131u;
public const val `FACILITY_TPM_SERVICES`: `FACILITY_CODE` = 40u;
public const val `FACILITY_TPM_SOFTWARE`: `FACILITY_CODE` = 41u;
public const val `FACILITY_TTD`: `FACILITY_CODE` = 1490u;
public const val `FACILITY_UI`: `FACILITY_CODE` = 42u;
public const val `FACILITY_UMI`: `FACILITY_CODE` = 22u;
public const val `FACILITY_URT`: `FACILITY_CODE` = 19u;
public const val `FACILITY_USERMODE_COMMONLOG`: `FACILITY_CODE` = 26u;
public const val `FACILITY_USERMODE_FILTER_MANAGER`: `FACILITY_CODE` = 31u;
public const val `FACILITY_USERMODE_HNS`: `FACILITY_CODE` = 59u;
public const val `FACILITY_USERMODE_HYPERVISOR`: `FACILITY_CODE` = 53u;
public const val `FACILITY_USERMODE_LICENSING`: `FACILITY_CODE` = 234u;
public const val `FACILITY_USERMODE_SDBUS`: `FACILITY_CODE` = 2305u;
public const val `FACILITY_USERMODE_SPACES`: `FACILITY_CODE` = 231u;
public const val `FACILITY_USERMODE_VHD`: `FACILITY_CODE` = 58u;
public const val `FACILITY_USERMODE_VIRTUALIZATION`: `FACILITY_CODE` = 55u;
public const val `FACILITY_USERMODE_VOLMGR`: `FACILITY_CODE` = 56u;
public const val `FACILITY_USERMODE_VOLSNAP`: `FACILITY_CODE` = 130u;
public const val `FACILITY_USER_MODE_SECURITY_CORE`: `FACILITY_CODE` = 232u;
public const val `FACILITY_USN`: `FACILITY_CODE` = 129u;
public const val `FACILITY_UTC`: `FACILITY_CODE` = 1989u;
public const val `FACILITY_VISUALCPP`: `FACILITY_CODE` = 109u;
public const val `FACILITY_WEB`: `FACILITY_CODE` = 885u;
public const val `FACILITY_WEBSERVICES`: `FACILITY_CODE` = 61u;
public const val `FACILITY_WEB_SOCKET`: `FACILITY_CODE` = 886u;
public const val `FACILITY_WEP`: `FACILITY_CODE` = 2049u;
public const val `FACILITY_WER`: `FACILITY_CODE` = 27u;
public const val `FACILITY_WIA`: `FACILITY_CODE` = 33u;
public const val `FACILITY_WIN32`: `FACILITY_CODE` = 7u;
public const val `FACILITY_WINCODEC_DWRITE_DWM`: `FACILITY_CODE` = 2200u;
public const val `FACILITY_WINDOWS`: `FACILITY_CODE` = 8u;
public const val `FACILITY_WINDOWSUPDATE`: `FACILITY_CODE` = 36u;
public const val `FACILITY_WINDOWS_CE`: `FACILITY_CODE` = 24u;
public const val `FACILITY_WINDOWS_DEFENDER`: `FACILITY_CODE` = 80u;
public const val `FACILITY_WINDOWS_SETUP`: `FACILITY_CODE` = 48u;
public const val `FACILITY_WINDOWS_STORE`: `FACILITY_CODE` = 63u;
public const val `FACILITY_WINML`: `FACILITY_CODE` = 2192u;
public const val `FACILITY_WINPE`: `FACILITY_CODE` = 61u;
public const val `FACILITY_WINRM`: `FACILITY_CODE` = 51u;
public const val `FACILITY_WMAAECMA`: `FACILITY_CODE` = 1996u;
public const val `FACILITY_WPN`: `FACILITY_CODE` = 62u;
public const val `FACILITY_WSBAPP`: `FACILITY_CODE` = 122u;
public const val `FACILITY_WSB_ONLINE`: `FACILITY_CODE` = 133u;
public const val `FACILITY_XAML`: `FACILITY_CODE` = 43u;
public const val `FACILITY_XBOX`: `FACILITY_CODE` = 2339u;
public const val `FACILITY_XPS`: `FACILITY_CODE` = 82u;
public const val `FAST_ERESOURCE_PRECONDITION_VIOLATION`: `BUGCHECK_ERROR` = 454u;
public const val `FATAL_ABNORMAL_RESET_ERROR`: `BUGCHECK_ERROR` = 332u;
public const val `FATAL_UNHANDLED_HARD_ERROR`: `BUGCHECK_ERROR` = 76u;
public const val `FAT_FILE_SYSTEM`: `BUGCHECK_ERROR` = 35u;
public const val `FAULTY_HARDWARE_CORRUPTED_PAGE`: `BUGCHECK_ERROR` = 299u;
public const val `FILE_INITIALIZATION_FAILED`: `BUGCHECK_ERROR` = 104u;
public const val `FILE_SYSTEM`: `BUGCHECK_ERROR` = 34u;
public const val `FLAG_ENGINE_PRESENT`: UInt = 4u;
public const val `FLAG_ENGOPT_DISALLOW_NETWORK_PATHS`: UInt = 8u;
public const val `FLAG_OVERRIDE_ARM_MACHINE_TYPE`: UInt = 16u;
public const val `FLOPPY_INTERNAL_ERROR`: `BUGCHECK_ERROR` = 55u;
public const val `FLTMGR_FILE_SYSTEM`: `BUGCHECK_ERROR` = 245u;
public const val `FORMAT_MESSAGE_ALLOCATE_BUFFER`: `FORMAT_MESSAGE_OPTIONS` = 256u;
public const val `FORMAT_MESSAGE_ARGUMENT_ARRAY`: `FORMAT_MESSAGE_OPTIONS` = 8192u;
public const val `FORMAT_MESSAGE_FROM_HMODULE`: `FORMAT_MESSAGE_OPTIONS` = 2048u;
public const val `FORMAT_MESSAGE_FROM_STRING`: `FORMAT_MESSAGE_OPTIONS` = 1024u;
public const val `FORMAT_MESSAGE_FROM_SYSTEM`: `FORMAT_MESSAGE_OPTIONS` = 4096u;
public const val `FORMAT_MESSAGE_IGNORE_INSERTS`: `FORMAT_MESSAGE_OPTIONS` = 512u;
public typealias `FORMAT_MESSAGE_OPTIONS` = UInt;
// UNSUPPORTED Rust 1750:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FPO_DATA {
//     pub ulOffStart: u32,
//     pub cbProcSize: u32,
//     pub cdwLocals: u32,
//     pub cdwParams: u16,
//     pub _bitfield: u16,
// }

public const val `FP_EMULATION_ERROR`: `BUGCHECK_ERROR` = 166u;
public const val `FSRTL_EXTRA_CREATE_PARAMETER_VIOLATION`: `BUGCHECK_ERROR` = 268u;
public const val `FunctionTableStream`: `MINIDUMP_STREAM_TYPE` = 13;
public const val `GPIO_CONTROLLER_DRIVER_ERROR`: `BUGCHECK_ERROR` = 312u;
public const val `HAL1_INITIALIZATION_FAILED`: `BUGCHECK_ERROR` = 97u;
public const val `HAL_BLOCKED_PROCESSOR_INTERNAL_ERROR`: `BUGCHECK_ERROR` = 474u;
public const val `HAL_ILLEGAL_IOMMU_PAGE_FAULT`: `BUGCHECK_ERROR` = 345u;
public const val `HAL_INITIALIZATION_FAILED`: `BUGCHECK_ERROR` = 92u;
public const val `HAL_IOMMU_INTERNAL_ERROR`: `BUGCHECK_ERROR` = 473u;
public const val `HAL_MEMORY_ALLOCATION`: `BUGCHECK_ERROR` = 172u;
public const val `HANDLE_ERROR_ON_CRITICAL_THREAD`: `BUGCHECK_ERROR` = 493u;
public const val `HANDLE_LIVE_DUMP`: `BUGCHECK_ERROR` = 492u;
public const val `HARDWARE_INTERRUPT_STORM`: `BUGCHECK_ERROR` = 242u;
public const val `HARDWARE_PROFILE_DOCKED_STRING`: `BUGCHECK_ERROR` = 1073807362u;
public const val `HARDWARE_PROFILE_UNDOCKED_STRING`: `BUGCHECK_ERROR` = 1073807361u;
public const val `HARDWARE_PROFILE_UNKNOWN_STRING`: `BUGCHECK_ERROR` = 1073807363u;
public const val `HARDWARE_WATCHDOG_TIMEOUT`: `BUGCHECK_ERROR` = 463u;
public const val `HTTP_DRIVER_CORRUPTED`: `BUGCHECK_ERROR` = 250u;
public const val `HYPERGUARD_INITIALIZATION_FAILURE`: `BUGCHECK_ERROR` = 383u;
public const val `HYPERGUARD_VIOLATION`: `BUGCHECK_ERROR` = 396u;
public const val `HYPERVISOR_ERROR`: `BUGCHECK_ERROR` = 131073u;
public const val `HandleDataStream`: `MINIDUMP_STREAM_TYPE` = 12;
public const val `HandleOperationListStream`: `MINIDUMP_STREAM_TYPE` = 18;
public const val `ILLEGAL_ATS_INITIALIZATION`: `BUGCHECK_ERROR` = 489u;
public const val `ILLEGAL_IOMMU_PAGE_FAULT`: `BUGCHECK_ERROR` = 344u;
// UNSUPPORTED Rust 1784:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IMAGEHLP_CBA_EVENT {
//     pub severity: IMAGEHLP_CBA_EVENT_SEVERITY,
//     pub code: u32,
//     pub desc: windows_sys::core::PSTR,
//     pub object: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 1792:1: declaration Impl has no candidate rule
// impl Default for IMAGEHLP_CBA_EVENT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1797:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IMAGEHLP_CBA_EVENTW {
//     pub severity: IMAGEHLP_CBA_EVENT_SEVERITY,
//     pub code: u32,
//     pub desc: windows_sys::core::PCWSTR,
//     pub object: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 1805:1: declaration Impl has no candidate rule
// impl Default for IMAGEHLP_CBA_EVENTW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `IMAGEHLP_CBA_EVENT_SEVERITY` = UInt;
// UNSUPPORTED Rust 1811:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IMAGEHLP_CBA_READ_MEMORY {
//     pub addr: u64,
//     pub buf: *mut core::ffi::c_void,
//     pub bytes: u32,
//     pub bytesread: *mut u32,
// }

// UNSUPPORTED Rust 1819:1: declaration Impl has no candidate rule
// impl Default for IMAGEHLP_CBA_READ_MEMORY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1824:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct IMAGEHLP_DEFERRED_SYMBOL_LOAD {
//     pub SizeOfStruct: u32,
//     pub BaseOfImage: u32,
//     pub CheckSum: u32,
//     pub TimeDateStamp: u32,
//     pub FileName: [i8; 260],
//     pub Reparse: bool,
//     pub hFile: super::super::super::Foundation::HANDLE,
// }

// UNSUPPORTED Rust 1836:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for IMAGEHLP_DEFERRED_SYMBOL_LOAD {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1842:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IMAGEHLP_DEFERRED_SYMBOL_LOAD64 {
//     pub SizeOfStruct: u32,
//     pub BaseOfImage: u64,
//     pub CheckSum: u32,
//     pub TimeDateStamp: u32,
//     pub FileName: [i8; 260],
//     pub Reparse: bool,
//     pub hFile: super::super::super::Foundation::HANDLE,
//     pub Flags: u32,
// }

// UNSUPPORTED Rust 1854:1: declaration Impl has no candidate rule
// impl Default for IMAGEHLP_DEFERRED_SYMBOL_LOAD64 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1859:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IMAGEHLP_DEFERRED_SYMBOL_LOADW64 {
//     pub SizeOfStruct: u32,
//     pub BaseOfImage: u64,
//     pub CheckSum: u32,
//     pub TimeDateStamp: u32,
//     pub FileName: [u16; 261],
//     pub Reparse: bool,
//     pub hFile: super::super::super::Foundation::HANDLE,
//     pub Flags: u32,
// }

// UNSUPPORTED Rust 1871:1: declaration Impl has no candidate rule
// impl Default for IMAGEHLP_DEFERRED_SYMBOL_LOADW64 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1876:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct IMAGEHLP_DUPLICATE_SYMBOL {
//     pub SizeOfStruct: u32,
//     pub NumberOfDups: u32,
//     pub Symbol: *mut IMAGEHLP_SYMBOL,
//     pub SelectedSymbol: u32,
// }

// UNSUPPORTED Rust 1885:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for IMAGEHLP_DUPLICATE_SYMBOL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1891:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IMAGEHLP_DUPLICATE_SYMBOL64 {
//     pub SizeOfStruct: u32,
//     pub NumberOfDups: u32,
//     pub Symbol: *mut IMAGEHLP_SYMBOL64,
//     pub SelectedSymbol: u32,
// }

// UNSUPPORTED Rust 1899:1: declaration Impl has no candidate rule
// impl Default for IMAGEHLP_DUPLICATE_SYMBOL64 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `IMAGEHLP_EXTENDED_OPTIONS` = Int;
public const val `IMAGEHLP_GET_TYPE_INFO_CHILDREN`: `IMAGEHLP_GET_TYPE_INFO_FLAGS` = 2u;
public typealias `IMAGEHLP_GET_TYPE_INFO_FLAGS` = UInt;
// UNSUPPORTED Rust 1907:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IMAGEHLP_GET_TYPE_INFO_PARAMS {
//     pub SizeOfStruct: u32,
//     pub Flags: IMAGEHLP_GET_TYPE_INFO_FLAGS,
//     pub NumIds: u32,
//     pub TypeIds: *mut u32,
//     pub TagFilter: u64,
//     pub NumReqs: u32,
//     pub ReqKinds: *mut IMAGEHLP_SYMBOL_TYPE_INFO,
//     pub ReqOffsets: *mut usize,
//     pub ReqSizes: *mut u32,
//     pub ReqStride: usize,
//     pub BufferSize: usize,
//     pub Buffer: *mut core::ffi::c_void,
//     pub EntriesMatched: u32,
//     pub EntriesFilled: u32,
//     pub TagsFound: u64,
//     pub AllReqsValid: u64,
//     pub NumReqsValid: u32,
//     pub ReqsValid: *mut u64,
// }

// UNSUPPORTED Rust 1929:1: declaration Impl has no candidate rule
// impl Default for IMAGEHLP_GET_TYPE_INFO_PARAMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IMAGEHLP_GET_TYPE_INFO_UNCACHED`: `IMAGEHLP_GET_TYPE_INFO_FLAGS` = 1u;
public typealias `IMAGEHLP_HD_TYPE` = Int;
// UNSUPPORTED Rust 1936:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IMAGEHLP_JIT_SYMBOLMAP {
//     pub SizeOfStruct: u32,
//     pub Address: u64,
//     pub BaseOfImage: u64,
// }

// UNSUPPORTED Rust 1943:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct IMAGEHLP_LINE {
//     pub SizeOfStruct: u32,
//     pub Key: *mut core::ffi::c_void,
//     pub LineNumber: u32,
//     pub FileName: windows_sys::core::PSTR,
//     pub Address: u32,
// }

// UNSUPPORTED Rust 1953:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for IMAGEHLP_LINE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1959:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IMAGEHLP_LINE64 {
//     pub SizeOfStruct: u32,
//     pub Key: *mut core::ffi::c_void,
//     pub LineNumber: u32,
//     pub FileName: windows_sys::core::PSTR,
//     pub Address: u64,
// }

// UNSUPPORTED Rust 1968:1: declaration Impl has no candidate rule
// impl Default for IMAGEHLP_LINE64 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1973:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct IMAGEHLP_LINEW {
//     pub SizeOfStruct: u32,
//     pub Key: *mut core::ffi::c_void,
//     pub LineNumber: u32,
//     pub FileName: windows_sys::core::PSTR,
//     pub Address: u64,
// }

// UNSUPPORTED Rust 1983:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for IMAGEHLP_LINEW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1989:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IMAGEHLP_LINEW64 {
//     pub SizeOfStruct: u32,
//     pub Key: *mut core::ffi::c_void,
//     pub LineNumber: u32,
//     pub FileName: windows_sys::core::PWSTR,
//     pub Address: u64,
// }

// UNSUPPORTED Rust 1998:1: declaration Impl has no candidate rule
// impl Default for IMAGEHLP_LINEW64 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2003:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct IMAGEHLP_MODULE {
//     pub SizeOfStruct: u32,
//     pub BaseOfImage: u32,
//     pub ImageSize: u32,
//     pub TimeDateStamp: u32,
//     pub CheckSum: u32,
//     pub NumSyms: u32,
//     pub SymType: SYM_TYPE,
//     pub ModuleName: [i8; 32],
//     pub ImageName: [i8; 256],
//     pub LoadedImageName: [i8; 256],
// }

// UNSUPPORTED Rust 2018:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for IMAGEHLP_MODULE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2024:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IMAGEHLP_MODULE64 {
//     pub SizeOfStruct: u32,
//     pub BaseOfImage: u64,
//     pub ImageSize: u32,
//     pub TimeDateStamp: u32,
//     pub CheckSum: u32,
//     pub NumSyms: u32,
//     pub SymType: SYM_TYPE,
//     pub ModuleName: [i8; 32],
//     pub ImageName: [i8; 256],
//     pub LoadedImageName: [i8; 256],
//     pub LoadedPdbName: [i8; 256],
//     pub CVSig: u32,
//     pub CVData: [i8; 780],
//     pub PdbSig: u32,
//     pub PdbSig70: windows_sys::core::GUID,
//     pub PdbAge: u32,
//     pub PdbUnmatched: windows_sys::core::BOOL,
//     pub DbgUnmatched: windows_sys::core::BOOL,
//     pub LineNumbers: windows_sys::core::BOOL,
//     pub GlobalSymbols: windows_sys::core::BOOL,
//     pub TypeInfo: windows_sys::core::BOOL,
//     pub SourceIndexed: windows_sys::core::BOOL,
//     pub Publics: windows_sys::core::BOOL,
//     pub MachineType: u32,
//     pub Reserved: u32,
// }

// UNSUPPORTED Rust 2053:1: declaration Impl has no candidate rule
// impl Default for IMAGEHLP_MODULE64 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2058:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IMAGEHLP_MODULE64_EX {
//     pub Module: IMAGEHLP_MODULE64,
//     pub RegionFlags: u32,
// }

// UNSUPPORTED Rust 2064:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct IMAGEHLP_MODULEW {
//     pub SizeOfStruct: u32,
//     pub BaseOfImage: u32,
//     pub ImageSize: u32,
//     pub TimeDateStamp: u32,
//     pub CheckSum: u32,
//     pub NumSyms: u32,
//     pub SymType: SYM_TYPE,
//     pub ModuleName: [u16; 32],
//     pub ImageName: [u16; 256],
//     pub LoadedImageName: [u16; 256],
// }

// UNSUPPORTED Rust 2079:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for IMAGEHLP_MODULEW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2085:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IMAGEHLP_MODULEW64 {
//     pub SizeOfStruct: u32,
//     pub BaseOfImage: u64,
//     pub ImageSize: u32,
//     pub TimeDateStamp: u32,
//     pub CheckSum: u32,
//     pub NumSyms: u32,
//     pub SymType: SYM_TYPE,
//     pub ModuleName: [u16; 32],
//     pub ImageName: [u16; 256],
//     pub LoadedImageName: [u16; 256],
//     pub LoadedPdbName: [u16; 256],
//     pub CVSig: u32,
//     pub CVData: [u16; 780],
//     pub PdbSig: u32,
//     pub PdbSig70: windows_sys::core::GUID,
//     pub PdbAge: u32,
//     pub PdbUnmatched: windows_sys::core::BOOL,
//     pub DbgUnmatched: windows_sys::core::BOOL,
//     pub LineNumbers: windows_sys::core::BOOL,
//     pub GlobalSymbols: windows_sys::core::BOOL,
//     pub TypeInfo: windows_sys::core::BOOL,
//     pub SourceIndexed: windows_sys::core::BOOL,
//     pub Publics: windows_sys::core::BOOL,
//     pub MachineType: u32,
//     pub Reserved: u32,
// }

// UNSUPPORTED Rust 2114:1: declaration Impl has no candidate rule
// impl Default for IMAGEHLP_MODULEW64 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2119:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IMAGEHLP_MODULEW64_EX {
//     pub Module: IMAGEHLP_MODULEW64,
//     pub RegionFlags: u32,
// }

public const val `IMAGEHLP_MODULE_REGION_ADDITIONAL`: UInt = 4u;
public const val `IMAGEHLP_MODULE_REGION_ALL`: UInt = 255u;
public const val `IMAGEHLP_MODULE_REGION_DLLBASE`: UInt = 1u;
public const val `IMAGEHLP_MODULE_REGION_DLLRANGE`: UInt = 2u;
public const val `IMAGEHLP_MODULE_REGION_JIT`: UInt = 8u;
public const val `IMAGEHLP_RMAP_BIG_ENDIAN`: UInt = 2u;
public const val `IMAGEHLP_RMAP_FIXUP_ARM64X`: UInt = 268435456u;
public const val `IMAGEHLP_RMAP_FIXUP_IMAGEBASE`: UInt = 2147483648u;
public const val `IMAGEHLP_RMAP_IGNORE_MISCOMPARE`: UInt = 4u;
public const val `IMAGEHLP_RMAP_LOAD_RW_DATA_SECTIONS`: UInt = 536870912u;
public const val `IMAGEHLP_RMAP_MAPPED_FLAT`: UInt = 1u;
public const val `IMAGEHLP_RMAP_OMIT_SHARED_RW_DATA_SECTIONS`: UInt = 1073741824u;
public typealias `IMAGEHLP_SF_TYPE` = Int;
// UNSUPPORTED Rust 2138:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IMAGEHLP_STACK_FRAME {
//     pub InstructionOffset: u64,
//     pub ReturnOffset: u64,
//     pub FrameOffset: u64,
//     pub StackOffset: u64,
//     pub BackingStoreOffset: u64,
//     pub FuncTableEntry: u64,
//     pub Params: [u64; 4],
//     pub Reserved: [u64; 5],
//     pub Virtual: windows_sys::core::BOOL,
//     pub Reserved2: u32,
// }

// UNSUPPORTED Rust 2152:1: declaration Impl has no candidate rule
// impl Default for IMAGEHLP_STACK_FRAME {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `IMAGEHLP_STATUS_REASON` = Int;
// UNSUPPORTED Rust 2158:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct IMAGEHLP_SYMBOL {
//     pub SizeOfStruct: u32,
//     pub Address: u32,
//     pub Size: u32,
//     pub Flags: u32,
//     pub MaxNameLength: u32,
//     pub Name: [i8; 1],
// }

// UNSUPPORTED Rust 2169:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for IMAGEHLP_SYMBOL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2175:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IMAGEHLP_SYMBOL64 {
//     pub SizeOfStruct: u32,
//     pub Address: u64,
//     pub Size: u32,
//     pub Flags: u32,
//     pub MaxNameLength: u32,
//     pub Name: [i8; 1],
// }

// UNSUPPORTED Rust 2185:1: declaration Impl has no candidate rule
// impl Default for IMAGEHLP_SYMBOL64 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2190:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IMAGEHLP_SYMBOL64_PACKAGE {
//     pub sym: IMAGEHLP_SYMBOL64,
//     pub name: [i8; 2001],
// }

// UNSUPPORTED Rust 2196:1: declaration Impl has no candidate rule
// impl Default for IMAGEHLP_SYMBOL64_PACKAGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2201:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct IMAGEHLP_SYMBOLW {
//     pub SizeOfStruct: u32,
//     pub Address: u32,
//     pub Size: u32,
//     pub Flags: u32,
//     pub MaxNameLength: u32,
//     pub Name: [u16; 1],
// }

// UNSUPPORTED Rust 2212:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for IMAGEHLP_SYMBOLW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2218:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IMAGEHLP_SYMBOLW64 {
//     pub SizeOfStruct: u32,
//     pub Address: u64,
//     pub Size: u32,
//     pub Flags: u32,
//     pub MaxNameLength: u32,
//     pub Name: [u16; 1],
// }

// UNSUPPORTED Rust 2228:1: declaration Impl has no candidate rule
// impl Default for IMAGEHLP_SYMBOLW64 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2233:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IMAGEHLP_SYMBOLW64_PACKAGE {
//     pub sym: IMAGEHLP_SYMBOLW64,
//     pub name: [u16; 2001],
// }

// UNSUPPORTED Rust 2239:1: declaration Impl has no candidate rule
// impl Default for IMAGEHLP_SYMBOLW64_PACKAGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2244:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct IMAGEHLP_SYMBOLW_PACKAGE {
//     pub sym: IMAGEHLP_SYMBOLW,
//     pub name: [u16; 2001],
// }

// UNSUPPORTED Rust 2251:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for IMAGEHLP_SYMBOLW_PACKAGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IMAGEHLP_SYMBOL_FUNCTION`: UInt = 2048u;
public const val `IMAGEHLP_SYMBOL_INFO_CONSTANT`: UInt = 256u;
public const val `IMAGEHLP_SYMBOL_INFO_FRAMERELATIVE`: UInt = 32u;
public const val `IMAGEHLP_SYMBOL_INFO_LOCAL`: UInt = 128u;
public const val `IMAGEHLP_SYMBOL_INFO_PARAMETER`: UInt = 64u;
public const val `IMAGEHLP_SYMBOL_INFO_REGISTER`: UInt = 8u;
public const val `IMAGEHLP_SYMBOL_INFO_REGRELATIVE`: UInt = 16u;
public const val `IMAGEHLP_SYMBOL_INFO_TLSRELATIVE`: UInt = 16384u;
public const val `IMAGEHLP_SYMBOL_INFO_VALUEPRESENT`: UInt = 1u;
// UNSUPPORTED Rust 2266:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct IMAGEHLP_SYMBOL_PACKAGE {
//     pub sym: IMAGEHLP_SYMBOL,
//     pub name: [i8; 2001],
// }

// UNSUPPORTED Rust 2273:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for IMAGEHLP_SYMBOL_PACKAGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2279:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IMAGEHLP_SYMBOL_SRC {
//     pub sizeofstruct: u32,
//     pub r#type: u32,
//     pub file: [i8; 260],
// }

// UNSUPPORTED Rust 2286:1: declaration Impl has no candidate rule
// impl Default for IMAGEHLP_SYMBOL_SRC {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IMAGEHLP_SYMBOL_THUNK`: UInt = 8192u;
public typealias `IMAGEHLP_SYMBOL_TYPE_INFO` = Int;
public const val `IMAGEHLP_SYMBOL_TYPE_INFO_MAX`: `IMAGEHLP_SYMBOL_TYPE_INFO` = 35;
public const val `IMAGEHLP_SYMBOL_VIRTUAL`: UInt = 4096u;
// UNSUPPORTED Rust 2295:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY {
//     pub BeginAddress: u32,
//     pub Anonymous: IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY_0,
// }

// UNSUPPORTED Rust 2301:1: declaration Impl has no candidate rule
// impl Default for IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2306:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY_0 {
//     pub UnwindData: u32,
//     pub Anonymous: IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY_0_0,
// }

// UNSUPPORTED Rust 2312:1: declaration Impl has no candidate rule
// impl Default for IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2317:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY_0_0 {
//     pub _bitfield: u32,
// }

// UNSUPPORTED Rust 2322:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IMAGE_COFF_SYMBOLS_HEADER {
//     pub NumberOfSymbols: u32,
//     pub LvaToFirstSymbol: u32,
//     pub NumberOfLinenumbers: u32,
//     pub LvaToFirstLinenumber: u32,
//     pub RvaToFirstByteOfCode: u32,
//     pub RvaToLastByteOfCode: u32,
//     pub RvaToFirstByteOfData: u32,
//     pub RvaToLastByteOfData: u32,
// }

// UNSUPPORTED Rust 2334:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IMAGE_COR20_HEADER {
//     pub cb: u32,
//     pub MajorRuntimeVersion: u16,
//     pub MinorRuntimeVersion: u16,
//     pub MetaData: IMAGE_DATA_DIRECTORY,
//     pub Flags: u32,
//     pub Anonymous: IMAGE_COR20_HEADER_0,
//     pub Resources: IMAGE_DATA_DIRECTORY,
//     pub StrongNameSignature: IMAGE_DATA_DIRECTORY,
//     pub CodeManagerTable: IMAGE_DATA_DIRECTORY,
//     pub VTableFixups: IMAGE_DATA_DIRECTORY,
//     pub ExportAddressTableJumps: IMAGE_DATA_DIRECTORY,
//     pub ManagedNativeHeader: IMAGE_DATA_DIRECTORY,
// }

// UNSUPPORTED Rust 2350:1: declaration Impl has no candidate rule
// impl Default for IMAGE_COR20_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2355:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IMAGE_COR20_HEADER_0 {
//     pub EntryPointToken: u32,
//     pub EntryPointRVA: u32,
// }

// UNSUPPORTED Rust 2361:1: declaration Impl has no candidate rule
// impl Default for IMAGE_COR20_HEADER_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2366:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IMAGE_DATA_DIRECTORY {
//     pub VirtualAddress: u32,
//     pub Size: u32,
// }

// UNSUPPORTED Rust 2372:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IMAGE_DEBUG_DIRECTORY {
//     pub Characteristics: u32,
//     pub TimeDateStamp: u32,
//     pub MajorVersion: u16,
//     pub MinorVersion: u16,
//     pub Type: IMAGE_DEBUG_TYPE,
//     pub SizeOfData: u32,
//     pub AddressOfRawData: u32,
//     pub PointerToRawData: u32,
// }

// UNSUPPORTED Rust 2384:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(target_arch = "x86")]
// #[cfg(feature = "Win32_System_Kernel")]
// #[derive(Clone, Copy)]
// pub struct IMAGE_DEBUG_INFORMATION {
//     pub List: super::super::Kernel::LIST_ENTRY,
//     pub ReservedSize: u32,
//     pub ReservedMappedBase: *mut core::ffi::c_void,
//     pub ReservedMachine: u16,
//     pub ReservedCharacteristics: u16,
//     pub ReservedCheckSum: u32,
//     pub ImageBase: u32,
//     pub SizeOfImage: u32,
//     pub ReservedNumberOfSections: u32,
//     pub ReservedSections: *mut IMAGE_SECTION_HEADER,
//     pub ReservedExportedNamesSize: u32,
//     pub ReservedExportedNames: windows_sys::core::PSTR,
//     pub ReservedNumberOfFunctionTableEntries: u32,
//     pub ReservedFunctionTableEntries: *mut IMAGE_FUNCTION_ENTRY,
//     pub ReservedLowestFunctionStartingAddress: u32,
//     pub ReservedHighestFunctionEndingAddress: u32,
//     pub ReservedNumberOfFpoTableEntries: u32,
//     pub ReservedFpoTableEntries: *mut FPO_DATA,
//     pub SizeOfCoffSymbols: u32,
//     pub CoffSymbols: *mut IMAGE_COFF_SYMBOLS_HEADER,
//     pub ReservedSizeOfCodeViewSymbols: u32,
//     pub ReservedCodeViewSymbols: *mut core::ffi::c_void,
//     pub ImageFilePath: windows_sys::core::PSTR,
//     pub ImageFileName: windows_sys::core::PSTR,
//     pub ReservedDebugFilePath: windows_sys::core::PSTR,
//     pub ReservedTimeDateStamp: u32,
//     pub ReservedRomImage: windows_sys::core::BOOL,
//     pub ReservedDebugDirectory: *mut IMAGE_DEBUG_DIRECTORY,
//     pub ReservedNumberOfDebugDirectories: u32,
//     pub ReservedOriginalFunctionTableBaseAddress: u32,
//     pub Reserved: [u32; 2],
// }

// UNSUPPORTED Rust 2421:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// #[cfg(feature = "Win32_System_Kernel")]
// impl Default for IMAGE_DEBUG_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `IMAGE_DEBUG_TYPE` = UInt;
public const val `IMAGE_DEBUG_TYPE_BORLAND`: `IMAGE_DEBUG_TYPE` = 9u;
public const val `IMAGE_DEBUG_TYPE_CODEVIEW`: `IMAGE_DEBUG_TYPE` = 2u;
public const val `IMAGE_DEBUG_TYPE_COFF`: `IMAGE_DEBUG_TYPE` = 1u;
public const val `IMAGE_DEBUG_TYPE_EXCEPTION`: `IMAGE_DEBUG_TYPE` = 5u;
public const val `IMAGE_DEBUG_TYPE_FIXUP`: `IMAGE_DEBUG_TYPE` = 6u;
public const val `IMAGE_DEBUG_TYPE_FPO`: `IMAGE_DEBUG_TYPE` = 3u;
public const val `IMAGE_DEBUG_TYPE_MISC`: `IMAGE_DEBUG_TYPE` = 4u;
public const val `IMAGE_DEBUG_TYPE_UNKNOWN`: `IMAGE_DEBUG_TYPE` = 0u;
public typealias `IMAGE_DIRECTORY_ENTRY` = UShort;
public const val `IMAGE_DIRECTORY_ENTRY_ARCHITECTURE`: `IMAGE_DIRECTORY_ENTRY` = 7u;
public const val `IMAGE_DIRECTORY_ENTRY_BASERELOC`: `IMAGE_DIRECTORY_ENTRY` = 5u;
public const val `IMAGE_DIRECTORY_ENTRY_BOUND_IMPORT`: `IMAGE_DIRECTORY_ENTRY` = 11u;
public const val `IMAGE_DIRECTORY_ENTRY_COM_DESCRIPTOR`: `IMAGE_DIRECTORY_ENTRY` = 14u;
public const val `IMAGE_DIRECTORY_ENTRY_DEBUG`: `IMAGE_DIRECTORY_ENTRY` = 6u;
public const val `IMAGE_DIRECTORY_ENTRY_DELAY_IMPORT`: `IMAGE_DIRECTORY_ENTRY` = 13u;
public const val `IMAGE_DIRECTORY_ENTRY_EXCEPTION`: `IMAGE_DIRECTORY_ENTRY` = 3u;
public const val `IMAGE_DIRECTORY_ENTRY_EXPORT`: `IMAGE_DIRECTORY_ENTRY` = 0u;
public const val `IMAGE_DIRECTORY_ENTRY_GLOBALPTR`: `IMAGE_DIRECTORY_ENTRY` = 8u;
public const val `IMAGE_DIRECTORY_ENTRY_IAT`: `IMAGE_DIRECTORY_ENTRY` = 12u;
public const val `IMAGE_DIRECTORY_ENTRY_IMPORT`: `IMAGE_DIRECTORY_ENTRY` = 1u;
public const val `IMAGE_DIRECTORY_ENTRY_LOAD_CONFIG`: `IMAGE_DIRECTORY_ENTRY` = 10u;
public const val `IMAGE_DIRECTORY_ENTRY_RESOURCE`: `IMAGE_DIRECTORY_ENTRY` = 2u;
public const val `IMAGE_DIRECTORY_ENTRY_SECURITY`: `IMAGE_DIRECTORY_ENTRY` = 4u;
public const val `IMAGE_DIRECTORY_ENTRY_TLS`: `IMAGE_DIRECTORY_ENTRY` = 9u;
public const val `IMAGE_DLLCHARACTERISTICS_APPCONTAINER`: `IMAGE_DLL_CHARACTERISTICS` = 4096u;
public const val `IMAGE_DLLCHARACTERISTICS_DYNAMIC_BASE`: `IMAGE_DLL_CHARACTERISTICS` = 64u;
public const val `IMAGE_DLLCHARACTERISTICS_EX_CET_COMPAT`: `IMAGE_DLL_CHARACTERISTICS` = 1u;
public const val `IMAGE_DLLCHARACTERISTICS_EX_CET_COMPAT_STRICT_MODE`: `IMAGE_DLL_CHARACTERISTICS` = 2u;
public const val `IMAGE_DLLCHARACTERISTICS_EX_CET_DYNAMIC_APIS_ALLOW_IN_PROC`: `IMAGE_DLL_CHARACTERISTICS` = 8u;
public const val `IMAGE_DLLCHARACTERISTICS_EX_CET_RESERVED_1`: `IMAGE_DLL_CHARACTERISTICS` = 16u;
public const val `IMAGE_DLLCHARACTERISTICS_EX_CET_RESERVED_2`: `IMAGE_DLL_CHARACTERISTICS` = 32u;
public const val `IMAGE_DLLCHARACTERISTICS_EX_CET_SET_CONTEXT_IP_VALIDATION_RELAXED_MODE`: `IMAGE_DLL_CHARACTERISTICS` = 4u;
public const val `IMAGE_DLLCHARACTERISTICS_FORCE_INTEGRITY`: `IMAGE_DLL_CHARACTERISTICS` = 128u;
public const val `IMAGE_DLLCHARACTERISTICS_GUARD_CF`: `IMAGE_DLL_CHARACTERISTICS` = 16384u;
public const val `IMAGE_DLLCHARACTERISTICS_HIGH_ENTROPY_VA`: `IMAGE_DLL_CHARACTERISTICS` = 32u;
public const val `IMAGE_DLLCHARACTERISTICS_NO_BIND`: `IMAGE_DLL_CHARACTERISTICS` = 2048u;
public const val `IMAGE_DLLCHARACTERISTICS_NO_ISOLATION`: `IMAGE_DLL_CHARACTERISTICS` = 512u;
public const val `IMAGE_DLLCHARACTERISTICS_NO_SEH`: `IMAGE_DLL_CHARACTERISTICS` = 1024u;
public const val `IMAGE_DLLCHARACTERISTICS_NX_COMPAT`: `IMAGE_DLL_CHARACTERISTICS` = 256u;
public const val `IMAGE_DLLCHARACTERISTICS_TERMINAL_SERVER_AWARE`: `IMAGE_DLL_CHARACTERISTICS` = 32768u;
public const val `IMAGE_DLLCHARACTERISTICS_WDM_DRIVER`: `IMAGE_DLL_CHARACTERISTICS` = 8192u;
public typealias `IMAGE_DLL_CHARACTERISTICS` = UShort;
public const val `IMAGE_FILE_32BIT_MACHINE`: `IMAGE_FILE_CHARACTERISTICS` = 256u;
public const val `IMAGE_FILE_32BIT_MACHINE2`: `IMAGE_FILE_CHARACTERISTICS2` = 256u;
public const val `IMAGE_FILE_AGGRESIVE_WS_TRIM`: `IMAGE_FILE_CHARACTERISTICS` = 16u;
public const val `IMAGE_FILE_AGGRESIVE_WS_TRIM2`: `IMAGE_FILE_CHARACTERISTICS2` = 16u;
public const val `IMAGE_FILE_BYTES_REVERSED_HI`: `IMAGE_FILE_CHARACTERISTICS` = 32768u;
public const val `IMAGE_FILE_BYTES_REVERSED_HI_2`: `IMAGE_FILE_CHARACTERISTICS2` = 32768u;
public const val `IMAGE_FILE_BYTES_REVERSED_LO`: `IMAGE_FILE_CHARACTERISTICS` = 128u;
public const val `IMAGE_FILE_BYTES_REVERSED_LO2`: `IMAGE_FILE_CHARACTERISTICS2` = 128u;
public typealias `IMAGE_FILE_CHARACTERISTICS` = UShort;
public typealias `IMAGE_FILE_CHARACTERISTICS2` = UInt;
public const val `IMAGE_FILE_DEBUG_STRIPPED`: `IMAGE_FILE_CHARACTERISTICS` = 512u;
public const val `IMAGE_FILE_DEBUG_STRIPPED2`: `IMAGE_FILE_CHARACTERISTICS2` = 512u;
public const val `IMAGE_FILE_DLL`: `IMAGE_FILE_CHARACTERISTICS` = 8192u;
public const val `IMAGE_FILE_DLL_2`: `IMAGE_FILE_CHARACTERISTICS2` = 8192u;
public const val `IMAGE_FILE_EXECUTABLE_IMAGE`: `IMAGE_FILE_CHARACTERISTICS` = 2u;
public const val `IMAGE_FILE_EXECUTABLE_IMAGE2`: `IMAGE_FILE_CHARACTERISTICS2` = 2u;
// UNSUPPORTED Rust 2487:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_SystemInformation")]
// #[derive(Clone, Copy, Default)]
// pub struct IMAGE_FILE_HEADER {
//     pub Machine: super::super::SystemInformation::IMAGE_FILE_MACHINE,
//     pub NumberOfSections: u16,
//     pub TimeDateStamp: u32,
//     pub PointerToSymbolTable: u32,
//     pub NumberOfSymbols: u32,
//     pub SizeOfOptionalHeader: u16,
//     pub Characteristics: IMAGE_FILE_CHARACTERISTICS,
// }

public const val `IMAGE_FILE_LARGE_ADDRESS_AWARE`: `IMAGE_FILE_CHARACTERISTICS` = 32u;
public const val `IMAGE_FILE_LARGE_ADDRESS_AWARE2`: `IMAGE_FILE_CHARACTERISTICS2` = 32u;
public const val `IMAGE_FILE_LINE_NUMS_STRIPPED`: `IMAGE_FILE_CHARACTERISTICS` = 4u;
public const val `IMAGE_FILE_LINE_NUMS_STRIPPED2`: `IMAGE_FILE_CHARACTERISTICS2` = 4u;
public const val `IMAGE_FILE_LOCAL_SYMS_STRIPPED`: `IMAGE_FILE_CHARACTERISTICS` = 8u;
public const val `IMAGE_FILE_LOCAL_SYMS_STRIPPED2`: `IMAGE_FILE_CHARACTERISTICS2` = 8u;
public const val `IMAGE_FILE_NET_RUN_FROM_SWAP`: `IMAGE_FILE_CHARACTERISTICS` = 2048u;
public const val `IMAGE_FILE_NET_RUN_FROM_SWAP2`: `IMAGE_FILE_CHARACTERISTICS2` = 2048u;
public const val `IMAGE_FILE_RELOCS_STRIPPED`: `IMAGE_FILE_CHARACTERISTICS` = 1u;
public const val `IMAGE_FILE_RELOCS_STRIPPED2`: `IMAGE_FILE_CHARACTERISTICS2` = 1u;
public const val `IMAGE_FILE_REMOVABLE_RUN_FROM_SWAP`: `IMAGE_FILE_CHARACTERISTICS` = 1024u;
public const val `IMAGE_FILE_REMOVABLE_RUN_FROM_SWAP2`: `IMAGE_FILE_CHARACTERISTICS2` = 1024u;
public const val `IMAGE_FILE_SYSTEM`: `IMAGE_FILE_CHARACTERISTICS` = 4096u;
public const val `IMAGE_FILE_SYSTEM_2`: `IMAGE_FILE_CHARACTERISTICS2` = 4096u;
public const val `IMAGE_FILE_UP_SYSTEM_ONLY`: `IMAGE_FILE_CHARACTERISTICS` = 16384u;
public const val `IMAGE_FILE_UP_SYSTEM_ONLY_2`: `IMAGE_FILE_CHARACTERISTICS2` = 16384u;
// UNSUPPORTED Rust 2515:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IMAGE_FUNCTION_ENTRY {
//     pub StartingAddress: u32,
//     pub EndingAddress: u32,
//     pub EndOfPrologue: u32,
// }

// UNSUPPORTED Rust 2522:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[derive(Clone, Copy)]
// pub struct IMAGE_FUNCTION_ENTRY64 {
//     pub StartingAddress: u64,
//     pub EndingAddress: u64,
//     pub Anonymous: IMAGE_FUNCTION_ENTRY64_0,
// }

// UNSUPPORTED Rust 2529:1: declaration Impl has no candidate rule
// impl Default for IMAGE_FUNCTION_ENTRY64 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2534:1: declaration Union has no candidate rule
// #[repr(C, packed(4))]
// #[derive(Clone, Copy)]
// pub union IMAGE_FUNCTION_ENTRY64_0 {
//     pub EndOfPrologue: u64,
//     pub UnwindInfoAddress: u64,
// }

// UNSUPPORTED Rust 2540:1: declaration Impl has no candidate rule
// impl Default for IMAGE_FUNCTION_ENTRY64_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2545:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IMAGE_LOAD_CONFIG_CODE_INTEGRITY {
//     pub Flags: u16,
//     pub Catalog: u16,
//     pub CatalogOffset: u32,
//     pub Reserved: u32,
// }

// UNSUPPORTED Rust 2553:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct IMAGE_LOAD_CONFIG_DIRECTORY32 {
//     pub Size: u32,
//     pub TimeDateStamp: u32,
//     pub MajorVersion: u16,
//     pub MinorVersion: u16,
//     pub GlobalFlagsClear: u32,
//     pub GlobalFlagsSet: u32,
//     pub CriticalSectionDefaultTimeout: u32,
//     pub DeCommitFreeBlockThreshold: u32,
//     pub DeCommitTotalFreeThreshold: u32,
//     pub LockPrefixTable: u32,
//     pub MaximumAllocationSize: u32,
//     pub VirtualMemoryThreshold: u32,
//     pub ProcessHeapFlags: u32,
//     pub ProcessAffinityMask: u32,
//     pub CSDVersion: u16,
//     pub DependentLoadFlags: u16,
//     pub EditList: u32,
//     pub SecurityCookie: u32,
//     pub SEHandlerTable: u32,
//     pub SEHandlerCount: u32,
//     pub GuardCFCheckFunctionPointer: u32,
//     pub GuardCFDispatchFunctionPointer: u32,
//     pub GuardCFFunctionTable: u32,
//     pub GuardCFFunctionCount: u32,
//     pub GuardFlags: u32,
//     pub CodeIntegrity: IMAGE_LOAD_CONFIG_CODE_INTEGRITY,
//     pub GuardAddressTakenIatEntryTable: u32,
//     pub GuardAddressTakenIatEntryCount: u32,
//     pub GuardLongJumpTargetTable: u32,
//     pub GuardLongJumpTargetCount: u32,
//     pub DynamicValueRelocTable: u32,
//     pub CHPEMetadataPointer: u32,
//     pub GuardRFFailureRoutine: u32,
//     pub GuardRFFailureRoutineFunctionPointer: u32,
//     pub DynamicValueRelocTableOffset: u32,
//     pub DynamicValueRelocTableSection: u16,
//     pub Reserved2: u16,
//     pub GuardRFVerifyStackPointerFunctionPointer: u32,
//     pub HotPatchTableOffset: u32,
//     pub Reserved3: u32,
//     pub EnclaveConfigurationPointer: u32,
//     pub VolatileMetadataPointer: u32,
//     pub GuardEHContinuationTable: u32,
//     pub GuardEHContinuationCount: u32,
//     pub GuardXFGCheckFunctionPointer: u32,
//     pub GuardXFGDispatchFunctionPointer: u32,
//     pub GuardXFGTableDispatchFunctionPointer: u32,
//     pub CastGuardOsDeterminedFailureMode: u32,
//     pub GuardMemcpyFunctionPointer: u32,
// }

// UNSUPPORTED Rust 2606:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[derive(Clone, Copy, Default)]
// pub struct IMAGE_LOAD_CONFIG_DIRECTORY64 {
//     pub Size: u32,
//     pub TimeDateStamp: u32,
//     pub MajorVersion: u16,
//     pub MinorVersion: u16,
//     pub GlobalFlagsClear: u32,
//     pub GlobalFlagsSet: u32,
//     pub CriticalSectionDefaultTimeout: u32,
//     pub DeCommitFreeBlockThreshold: u64,
//     pub DeCommitTotalFreeThreshold: u64,
//     pub LockPrefixTable: u64,
//     pub MaximumAllocationSize: u64,
//     pub VirtualMemoryThreshold: u64,
//     pub ProcessAffinityMask: u64,
//     pub ProcessHeapFlags: u32,
//     pub CSDVersion: u16,
//     pub DependentLoadFlags: u16,
//     pub EditList: u64,
//     pub SecurityCookie: u64,
//     pub SEHandlerTable: u64,
//     pub SEHandlerCount: u64,
//     pub GuardCFCheckFunctionPointer: u64,
//     pub GuardCFDispatchFunctionPointer: u64,
//     pub GuardCFFunctionTable: u64,
//     pub GuardCFFunctionCount: u64,
//     pub GuardFlags: u32,
//     pub CodeIntegrity: IMAGE_LOAD_CONFIG_CODE_INTEGRITY,
//     pub GuardAddressTakenIatEntryTable: u64,
//     pub GuardAddressTakenIatEntryCount: u64,
//     pub GuardLongJumpTargetTable: u64,
//     pub GuardLongJumpTargetCount: u64,
//     pub DynamicValueRelocTable: u64,
//     pub CHPEMetadataPointer: u64,
//     pub GuardRFFailureRoutine: u64,
//     pub GuardRFFailureRoutineFunctionPointer: u64,
//     pub DynamicValueRelocTableOffset: u32,
//     pub DynamicValueRelocTableSection: u16,
//     pub Reserved2: u16,
//     pub GuardRFVerifyStackPointerFunctionPointer: u64,
//     pub HotPatchTableOffset: u32,
//     pub Reserved3: u32,
//     pub EnclaveConfigurationPointer: u64,
//     pub VolatileMetadataPointer: u64,
//     pub GuardEHContinuationTable: u64,
//     pub GuardEHContinuationCount: u64,
//     pub GuardXFGCheckFunctionPointer: u64,
//     pub GuardXFGDispatchFunctionPointer: u64,
//     pub GuardXFGTableDispatchFunctionPointer: u64,
//     pub CastGuardOsDeterminedFailureMode: u64,
//     pub GuardMemcpyFunctionPointer: u64,
// }

// UNSUPPORTED Rust 2659:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_SystemInformation")]
// #[derive(Clone, Copy, Default)]
// pub struct IMAGE_NT_HEADERS32 {
//     pub Signature: u32,
//     pub FileHeader: IMAGE_FILE_HEADER,
//     pub OptionalHeader: IMAGE_OPTIONAL_HEADER32,
// }

// UNSUPPORTED Rust 2667:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_SystemInformation")]
// #[derive(Clone, Copy, Default)]
// pub struct IMAGE_NT_HEADERS64 {
//     pub Signature: u32,
//     pub FileHeader: IMAGE_FILE_HEADER,
//     pub OptionalHeader: IMAGE_OPTIONAL_HEADER64,
// }

public const val `IMAGE_NT_OPTIONAL_HDR32_MAGIC`: `IMAGE_OPTIONAL_HEADER_MAGIC` = 267u;
public const val `IMAGE_NT_OPTIONAL_HDR64_MAGIC`: `IMAGE_OPTIONAL_HEADER_MAGIC` = 523u;
public const val `IMAGE_NT_OPTIONAL_HDR_MAGIC`: `IMAGE_OPTIONAL_HEADER_MAGIC` = 523u;
// UNSUPPORTED Rust 2678:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IMAGE_OPTIONAL_HEADER32 {
//     pub Magic: IMAGE_OPTIONAL_HEADER_MAGIC,
//     pub MajorLinkerVersion: u8,
//     pub MinorLinkerVersion: u8,
//     pub SizeOfCode: u32,
//     pub SizeOfInitializedData: u32,
//     pub SizeOfUninitializedData: u32,
//     pub AddressOfEntryPoint: u32,
//     pub BaseOfCode: u32,
//     pub BaseOfData: u32,
//     pub ImageBase: u32,
//     pub SectionAlignment: u32,
//     pub FileAlignment: u32,
//     pub MajorOperatingSystemVersion: u16,
//     pub MinorOperatingSystemVersion: u16,
//     pub MajorImageVersion: u16,
//     pub MinorImageVersion: u16,
//     pub MajorSubsystemVersion: u16,
//     pub MinorSubsystemVersion: u16,
//     pub Win32VersionValue: u32,
//     pub SizeOfImage: u32,
//     pub SizeOfHeaders: u32,
//     pub CheckSum: u32,
//     pub Subsystem: IMAGE_SUBSYSTEM,
//     pub DllCharacteristics: IMAGE_DLL_CHARACTERISTICS,
//     pub SizeOfStackReserve: u32,
//     pub SizeOfStackCommit: u32,
//     pub SizeOfHeapReserve: u32,
//     pub SizeOfHeapCommit: u32,
//     pub LoaderFlags: u32,
//     pub NumberOfRvaAndSizes: u32,
//     pub DataDirectory: [IMAGE_DATA_DIRECTORY; 16],
// }

// UNSUPPORTED Rust 2713:1: declaration Impl has no candidate rule
// impl Default for IMAGE_OPTIONAL_HEADER32 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2718:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[derive(Clone, Copy)]
// pub struct IMAGE_OPTIONAL_HEADER64 {
//     pub Magic: IMAGE_OPTIONAL_HEADER_MAGIC,
//     pub MajorLinkerVersion: u8,
//     pub MinorLinkerVersion: u8,
//     pub SizeOfCode: u32,
//     pub SizeOfInitializedData: u32,
//     pub SizeOfUninitializedData: u32,
//     pub AddressOfEntryPoint: u32,
//     pub BaseOfCode: u32,
//     pub ImageBase: u64,
//     pub SectionAlignment: u32,
//     pub FileAlignment: u32,
//     pub MajorOperatingSystemVersion: u16,
//     pub MinorOperatingSystemVersion: u16,
//     pub MajorImageVersion: u16,
//     pub MinorImageVersion: u16,
//     pub MajorSubsystemVersion: u16,
//     pub MinorSubsystemVersion: u16,
//     pub Win32VersionValue: u32,
//     pub SizeOfImage: u32,
//     pub SizeOfHeaders: u32,
//     pub CheckSum: u32,
//     pub Subsystem: IMAGE_SUBSYSTEM,
//     pub DllCharacteristics: IMAGE_DLL_CHARACTERISTICS,
//     pub SizeOfStackReserve: u64,
//     pub SizeOfStackCommit: u64,
//     pub SizeOfHeapReserve: u64,
//     pub SizeOfHeapCommit: u64,
//     pub LoaderFlags: u32,
//     pub NumberOfRvaAndSizes: u32,
//     pub DataDirectory: [IMAGE_DATA_DIRECTORY; 16],
// }

// UNSUPPORTED Rust 2752:1: declaration Impl has no candidate rule
// impl Default for IMAGE_OPTIONAL_HEADER64 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `IMAGE_OPTIONAL_HEADER_MAGIC` = UShort;
// UNSUPPORTED Rust 2758:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_SystemInformation")]
// #[derive(Clone, Copy, Default)]
// pub struct IMAGE_ROM_HEADERS {
//     pub FileHeader: IMAGE_FILE_HEADER,
//     pub OptionalHeader: IMAGE_ROM_OPTIONAL_HEADER,
// }

public const val `IMAGE_ROM_OPTIONAL_HDR_MAGIC`: `IMAGE_OPTIONAL_HEADER_MAGIC` = 263u;
// UNSUPPORTED Rust 2766:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IMAGE_ROM_OPTIONAL_HEADER {
//     pub Magic: u16,
//     pub MajorLinkerVersion: u8,
//     pub MinorLinkerVersion: u8,
//     pub SizeOfCode: u32,
//     pub SizeOfInitializedData: u32,
//     pub SizeOfUninitializedData: u32,
//     pub AddressOfEntryPoint: u32,
//     pub BaseOfCode: u32,
//     pub BaseOfData: u32,
//     pub BaseOfBss: u32,
//     pub GprMask: u32,
//     pub CprMask: [u32; 4],
//     pub GpValue: u32,
// }

// UNSUPPORTED Rust 2783:1: declaration Impl has no candidate rule
// impl Default for IMAGE_ROM_OPTIONAL_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2788:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IMAGE_RUNTIME_FUNCTION_ENTRY {
//     pub BeginAddress: u32,
//     pub EndAddress: u32,
//     pub Anonymous: IMAGE_RUNTIME_FUNCTION_ENTRY_0,
// }

// UNSUPPORTED Rust 2795:1: declaration Impl has no candidate rule
// impl Default for IMAGE_RUNTIME_FUNCTION_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2800:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IMAGE_RUNTIME_FUNCTION_ENTRY_0 {
//     pub UnwindInfoAddress: u32,
//     pub UnwindData: u32,
// }

// UNSUPPORTED Rust 2806:1: declaration Impl has no candidate rule
// impl Default for IMAGE_RUNTIME_FUNCTION_ENTRY_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IMAGE_SCN_ALIGN_1024BYTES`: `IMAGE_SECTION_CHARACTERISTICS` = 11534336u;
public const val `IMAGE_SCN_ALIGN_128BYTES`: `IMAGE_SECTION_CHARACTERISTICS` = 8388608u;
public const val `IMAGE_SCN_ALIGN_16BYTES`: `IMAGE_SECTION_CHARACTERISTICS` = 5242880u;
public const val `IMAGE_SCN_ALIGN_1BYTES`: `IMAGE_SECTION_CHARACTERISTICS` = 1048576u;
public const val `IMAGE_SCN_ALIGN_2048BYTES`: `IMAGE_SECTION_CHARACTERISTICS` = 12582912u;
public const val `IMAGE_SCN_ALIGN_256BYTES`: `IMAGE_SECTION_CHARACTERISTICS` = 9437184u;
public const val `IMAGE_SCN_ALIGN_2BYTES`: `IMAGE_SECTION_CHARACTERISTICS` = 2097152u;
public const val `IMAGE_SCN_ALIGN_32BYTES`: `IMAGE_SECTION_CHARACTERISTICS` = 6291456u;
public const val `IMAGE_SCN_ALIGN_4096BYTES`: `IMAGE_SECTION_CHARACTERISTICS` = 13631488u;
public const val `IMAGE_SCN_ALIGN_4BYTES`: `IMAGE_SECTION_CHARACTERISTICS` = 3145728u;
public const val `IMAGE_SCN_ALIGN_512BYTES`: `IMAGE_SECTION_CHARACTERISTICS` = 10485760u;
public const val `IMAGE_SCN_ALIGN_64BYTES`: `IMAGE_SECTION_CHARACTERISTICS` = 7340032u;
public const val `IMAGE_SCN_ALIGN_8192BYTES`: `IMAGE_SECTION_CHARACTERISTICS` = 14680064u;
public const val `IMAGE_SCN_ALIGN_8BYTES`: `IMAGE_SECTION_CHARACTERISTICS` = 4194304u;
public const val `IMAGE_SCN_ALIGN_MASK`: `IMAGE_SECTION_CHARACTERISTICS` = 15728640u;
public const val `IMAGE_SCN_CNT_CODE`: `IMAGE_SECTION_CHARACTERISTICS` = 32u;
public const val `IMAGE_SCN_CNT_INITIALIZED_DATA`: `IMAGE_SECTION_CHARACTERISTICS` = 64u;
public const val `IMAGE_SCN_CNT_UNINITIALIZED_DATA`: `IMAGE_SECTION_CHARACTERISTICS` = 128u;
public const val `IMAGE_SCN_GPREL`: `IMAGE_SECTION_CHARACTERISTICS` = 32768u;
public const val `IMAGE_SCN_LNK_COMDAT`: `IMAGE_SECTION_CHARACTERISTICS` = 4096u;
public const val `IMAGE_SCN_LNK_INFO`: `IMAGE_SECTION_CHARACTERISTICS` = 512u;
public const val `IMAGE_SCN_LNK_NRELOC_OVFL`: `IMAGE_SECTION_CHARACTERISTICS` = 16777216u;
public const val `IMAGE_SCN_LNK_OTHER`: `IMAGE_SECTION_CHARACTERISTICS` = 256u;
public const val `IMAGE_SCN_LNK_REMOVE`: `IMAGE_SECTION_CHARACTERISTICS` = 2048u;
public const val `IMAGE_SCN_MEM_16BIT`: `IMAGE_SECTION_CHARACTERISTICS` = 131072u;
public const val `IMAGE_SCN_MEM_DISCARDABLE`: `IMAGE_SECTION_CHARACTERISTICS` = 33554432u;
public const val `IMAGE_SCN_MEM_EXECUTE`: `IMAGE_SECTION_CHARACTERISTICS` = 536870912u;
public const val `IMAGE_SCN_MEM_FARDATA`: `IMAGE_SECTION_CHARACTERISTICS` = 32768u;
public const val `IMAGE_SCN_MEM_LOCKED`: `IMAGE_SECTION_CHARACTERISTICS` = 262144u;
public const val `IMAGE_SCN_MEM_NOT_CACHED`: `IMAGE_SECTION_CHARACTERISTICS` = 67108864u;
public const val `IMAGE_SCN_MEM_NOT_PAGED`: `IMAGE_SECTION_CHARACTERISTICS` = 134217728u;
public const val `IMAGE_SCN_MEM_PRELOAD`: `IMAGE_SECTION_CHARACTERISTICS` = 524288u;
public const val `IMAGE_SCN_MEM_PURGEABLE`: `IMAGE_SECTION_CHARACTERISTICS` = 131072u;
public const val `IMAGE_SCN_MEM_READ`: `IMAGE_SECTION_CHARACTERISTICS` = 1073741824u;
public const val `IMAGE_SCN_MEM_SHARED`: `IMAGE_SECTION_CHARACTERISTICS` = 268435456u;
public const val `IMAGE_SCN_MEM_WRITE`: `IMAGE_SECTION_CHARACTERISTICS` = 2147483648u;
public const val `IMAGE_SCN_NO_DEFER_SPEC_EXC`: `IMAGE_SECTION_CHARACTERISTICS` = 16384u;
public const val `IMAGE_SCN_SCALE_INDEX`: `IMAGE_SECTION_CHARACTERISTICS` = 1u;
public const val `IMAGE_SCN_TYPE_NO_PAD`: `IMAGE_SECTION_CHARACTERISTICS` = 8u;
public typealias `IMAGE_SECTION_CHARACTERISTICS` = UInt;
// UNSUPPORTED Rust 2851:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IMAGE_SECTION_HEADER {
//     pub Name: [u8; 8],
//     pub Misc: IMAGE_SECTION_HEADER_0,
//     pub VirtualAddress: u32,
//     pub SizeOfRawData: u32,
//     pub PointerToRawData: u32,
//     pub PointerToRelocations: u32,
//     pub PointerToLinenumbers: u32,
//     pub NumberOfRelocations: u16,
//     pub NumberOfLinenumbers: u16,
//     pub Characteristics: IMAGE_SECTION_CHARACTERISTICS,
// }

// UNSUPPORTED Rust 2865:1: declaration Impl has no candidate rule
// impl Default for IMAGE_SECTION_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2870:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IMAGE_SECTION_HEADER_0 {
//     pub PhysicalAddress: u32,
//     pub VirtualSize: u32,
// }

// UNSUPPORTED Rust 2876:1: declaration Impl has no candidate rule
// impl Default for IMAGE_SECTION_HEADER_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `IMAGE_SUBSYSTEM` = UShort;
public const val `IMAGE_SUBSYSTEM_EFI_APPLICATION`: `IMAGE_SUBSYSTEM` = 10u;
public const val `IMAGE_SUBSYSTEM_EFI_BOOT_SERVICE_DRIVER`: `IMAGE_SUBSYSTEM` = 11u;
public const val `IMAGE_SUBSYSTEM_EFI_ROM`: `IMAGE_SUBSYSTEM` = 13u;
public const val `IMAGE_SUBSYSTEM_EFI_RUNTIME_DRIVER`: `IMAGE_SUBSYSTEM` = 12u;
public const val `IMAGE_SUBSYSTEM_NATIVE`: `IMAGE_SUBSYSTEM` = 1u;
public const val `IMAGE_SUBSYSTEM_NATIVE_WINDOWS`: `IMAGE_SUBSYSTEM` = 8u;
public const val `IMAGE_SUBSYSTEM_OS2_CUI`: `IMAGE_SUBSYSTEM` = 5u;
public const val `IMAGE_SUBSYSTEM_POSIX_CUI`: `IMAGE_SUBSYSTEM` = 7u;
public const val `IMAGE_SUBSYSTEM_UNKNOWN`: `IMAGE_SUBSYSTEM` = 0u;
public const val `IMAGE_SUBSYSTEM_WINDOWS_BOOT_APPLICATION`: `IMAGE_SUBSYSTEM` = 16u;
public const val `IMAGE_SUBSYSTEM_WINDOWS_CE_GUI`: `IMAGE_SUBSYSTEM` = 9u;
public const val `IMAGE_SUBSYSTEM_WINDOWS_CUI`: `IMAGE_SUBSYSTEM` = 3u;
public const val `IMAGE_SUBSYSTEM_WINDOWS_GUI`: `IMAGE_SUBSYSTEM` = 2u;
public const val `IMAGE_SUBSYSTEM_XBOX`: `IMAGE_SUBSYSTEM` = 14u;
public const val `IMAGE_SUBSYSTEM_XBOX_CODE_CATALOG`: `IMAGE_SUBSYSTEM` = 17u;
public const val `IMPERSONATING_WORKER_THREAD`: `BUGCHECK_ERROR` = 223u;
public const val `INACCESSIBLE_BOOT_DEVICE`: `BUGCHECK_ERROR` = 123u;
public const val `INCONSISTENT_IRP`: `BUGCHECK_ERROR` = 42u;
public const val `INLINE_FRAME_CONTEXT_IGNORE`: UInt = 4294967295u;
public const val `INLINE_FRAME_CONTEXT_INIT`: UInt = 0u;
public const val `INSTALL_MORE_MEMORY`: `BUGCHECK_ERROR` = 125u;
public const val `INSTRUCTION_BUS_ERROR`: `BUGCHECK_ERROR` = 47u;
public const val `INSTRUCTION_COHERENCY_EXCEPTION`: `BUGCHECK_ERROR` = 86u;
public const val `INSUFFICIENT_SYSTEM_MAP_REGS`: `BUGCHECK_ERROR` = 69u;
public const val `INTERFACESAFE_FOR_UNTRUSTED_CALLER`: UInt = 1u;
public const val `INTERFACESAFE_FOR_UNTRUSTED_DATA`: UInt = 2u;
public const val `INTERFACE_USES_DISPEX`: UInt = 4u;
public const val `INTERFACE_USES_SECURITY_MANAGER`: UInt = 8u;
public const val `INTERNAL_POWER_ERROR`: `BUGCHECK_ERROR` = 160u;
public const val `INTERRUPT_EXCEPTION_NOT_HANDLED`: `BUGCHECK_ERROR` = 61u;
public const val `INTERRUPT_UNWIND_ATTEMPTED`: `BUGCHECK_ERROR` = 60u;
public const val `INVALID_AFFINITY_SET`: `BUGCHECK_ERROR` = 3u;
public const val `INVALID_ALTERNATE_SYSTEM_CALL_HANDLER_REGISTRATION`: `BUGCHECK_ERROR` = 480u;
public const val `INVALID_CALLBACK_STACK_ADDRESS`: `BUGCHECK_ERROR` = 461u;
public const val `INVALID_CANCEL_OF_FILE_OPEN`: `BUGCHECK_ERROR` = 232u;
public const val `INVALID_DATA_ACCESS_TRAP`: `BUGCHECK_ERROR` = 4u;
public const val `INVALID_DRIVER_HANDLE`: `BUGCHECK_ERROR` = 287u;
public const val `INVALID_EXTENDED_PROCESSOR_STATE`: `BUGCHECK_ERROR` = 305u;
public const val `INVALID_FLOATING_POINT_STATE`: `BUGCHECK_ERROR` = 231u;
public const val `INVALID_HIBERNATED_STATE`: `BUGCHECK_ERROR` = 189u;
public const val `INVALID_IO_BOOST_STATE`: `BUGCHECK_ERROR` = 316u;
public const val `INVALID_KERNEL_HANDLE`: `BUGCHECK_ERROR` = 147u;
public const val `INVALID_KERNEL_STACK_ADDRESS`: `BUGCHECK_ERROR` = 462u;
public const val `INVALID_MDL_RANGE`: `BUGCHECK_ERROR` = 302u;
public const val `INVALID_PROCESS_ATTACH_ATTEMPT`: `BUGCHECK_ERROR` = 5u;
public const val `INVALID_PROCESS_DETACH_ATTEMPT`: `BUGCHECK_ERROR` = 6u;
public const val `INVALID_PUSH_LOCK_FLAGS`: `BUGCHECK_ERROR` = 338u;
public const val `INVALID_REGION_OR_SEGMENT`: `BUGCHECK_ERROR` = 153u;
public const val `INVALID_RUNDOWN_PROTECTION_FLAGS`: `BUGCHECK_ERROR` = 364u;
public const val `INVALID_SILO_DETACH`: `BUGCHECK_ERROR` = 459u;
public const val `INVALID_SLOT_ALLOCATOR_FLAGS`: `BUGCHECK_ERROR` = 365u;
public const val `INVALID_SOFTWARE_INTERRUPT`: `BUGCHECK_ERROR` = 7u;
public const val `INVALID_THREAD_AFFINITY_STATE`: `BUGCHECK_ERROR` = 488u;
public const val `INVALID_WORK_QUEUE_ITEM`: `BUGCHECK_ERROR` = 150u;
public const val `IO1_INITIALIZATION_FAILED`: `BUGCHECK_ERROR` = 105u;
public const val `IOCTL_IPMI_INTERNAL_RECORD_SEL_EVENT`: UInt = 2232320u;
public const val `IORING`: `BUGCHECK_ERROR` = 499u;
public const val `IO_OBJECT_INVALID`: `BUGCHECK_ERROR` = 328u;
public const val `IO_THREADPOOL_DEADLOCK_LIVEDUMP`: `BUGCHECK_ERROR` = 453u;
public const val `IPI_WATCHDOG_TIMEOUT`: `BUGCHECK_ERROR` = 475u;
public const val `IPMI_IOCTL_INDEX`: UInt = 1024u;
// UNSUPPORTED Rust 2943:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct IPMI_OS_SEL_RECORD {
//     pub Signature: u32,
//     pub Version: u32,
//     pub Length: u32,
//     pub RecordType: IPMI_OS_SEL_RECORD_TYPE,
//     pub DataLength: u32,
//     pub Data: [u8; 1],
// }

// UNSUPPORTED Rust 2953:1: declaration Impl has no candidate rule
// impl Default for IPMI_OS_SEL_RECORD {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IPMI_OS_SEL_RECORD_MASK`: UInt = 65535u;
public typealias `IPMI_OS_SEL_RECORD_TYPE` = Int;
public const val `IPMI_OS_SEL_RECORD_VERSION`: UInt = 1u;
public const val `IPMI_OS_SEL_RECORD_VERSION_1`: UInt = 1u;
public const val `IRQL_GT_ZERO_AT_SYSTEM_SERVICE`: `BUGCHECK_ERROR` = 74u;
public const val `IRQL_NOT_DISPATCH_LEVEL`: `BUGCHECK_ERROR` = 8u;
public const val `IRQL_NOT_GREATER_OR_EQUAL`: `BUGCHECK_ERROR` = 9u;
public const val `IRQL_NOT_LESS_OR_EQUAL`: `BUGCHECK_ERROR` = 10u;
public const val `IRQL_UNEXPECTED_VALUE`: `BUGCHECK_ERROR` = 200u;
public const val `IncludeModuleCallback`: `MINIDUMP_CALLBACK_TYPE` = 4;
public const val `IncludeThreadCallback`: `MINIDUMP_CALLBACK_TYPE` = 3;
public const val `IncludeVmRegionCallback`: `MINIDUMP_CALLBACK_TYPE` = 10;
public const val `IoFinishCallback`: `MINIDUMP_CALLBACK_TYPE` = 13;
public const val `IoStartCallback`: `MINIDUMP_CALLBACK_TYPE` = 11;
public const val `IoWriteAllCallback`: `MINIDUMP_CALLBACK_TYPE` = 12;
public const val `IpmiOsSelRecordTypeBugcheckData`: `IPMI_OS_SEL_RECORD_TYPE` = 9;
public const val `IpmiOsSelRecordTypeBugcheckRecovery`: `IPMI_OS_SEL_RECORD_TYPE` = 8;
public const val `IpmiOsSelRecordTypeDriver`: `IPMI_OS_SEL_RECORD_TYPE` = 7;
public const val `IpmiOsSelRecordTypeMax`: `IPMI_OS_SEL_RECORD_TYPE` = 10;
public const val `IpmiOsSelRecordTypeOther`: `IPMI_OS_SEL_RECORD_TYPE` = 1;
public const val `IpmiOsSelRecordTypeRaw`: `IPMI_OS_SEL_RECORD_TYPE` = 6;
public const val `IpmiOsSelRecordTypeWhea`: `IPMI_OS_SEL_RECORD_TYPE` = 0;
public const val `IpmiOsSelRecordTypeWheaErrorNmi`: `IPMI_OS_SEL_RECORD_TYPE` = 4;
public const val `IpmiOsSelRecordTypeWheaErrorOther`: `IPMI_OS_SEL_RECORD_TYPE` = 5;
public const val `IpmiOsSelRecordTypeWheaErrorPci`: `IPMI_OS_SEL_RECORD_TYPE` = 3;
public const val `IpmiOsSelRecordTypeWheaErrorXpfMca`: `IPMI_OS_SEL_RECORD_TYPE` = 2;
public const val `IptTraceStream`: `MINIDUMP_STREAM_TYPE` = 23;
public const val `IsProcessSnapshotCallback`: `MINIDUMP_CALLBACK_TYPE` = 16;
public const val `JavaScriptDataStream`: `MINIDUMP_STREAM_TYPE` = 20;
public const val `KASAN_ENLIGHTENMENT_VIOLATION`: `BUGCHECK_ERROR` = 497u;
public const val `KASAN_ILLEGAL_ACCESS`: `BUGCHECK_ERROR` = 498u;
// UNSUPPORTED Rust 2989:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct KDHELP {
//     pub Thread: u32,
//     pub ThCallbackStack: u32,
//     pub NextCallback: u32,
//     pub FramePointer: u32,
//     pub KiCallUserMode: u32,
//     pub KeUserCallbackDispatcher: u32,
//     pub SystemRangeStart: u32,
//     pub ThCallbackBStore: u32,
//     pub KiUserExceptionDispatcher: u32,
//     pub StackBase: u32,
//     pub StackLimit: u32,
//     pub Reserved: [u32; 5],
// }

// UNSUPPORTED Rust 3006:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for KDHELP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3012:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct KDHELP64 {
//     pub Thread: u64,
//     pub ThCallbackStack: u32,
//     pub ThCallbackBStore: u32,
//     pub NextCallback: u32,
//     pub FramePointer: u32,
//     pub KiCallUserMode: u64,
//     pub KeUserCallbackDispatcher: u64,
//     pub SystemRangeStart: u64,
//     pub KiUserExceptionDispatcher: u64,
//     pub StackBase: u64,
//     pub StackLimit: u64,
//     pub BuildVersion: u32,
//     pub RetpolineStubFunctionTableSize: u32,
//     pub RetpolineStubFunctionTable: u64,
//     pub RetpolineStubOffset: u32,
//     pub RetpolineStubSize: u32,
//     pub Reserved0: [u64; 2],
// }

// UNSUPPORTED Rust 3033:1: declaration Impl has no candidate rule
// impl Default for KDHELP64 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KERNEL_APC_PENDING_DURING_EXIT`: `BUGCHECK_ERROR` = 32u;
public const val `KERNEL_AUTO_BOOST_INVALID_LOCK_RELEASE`: `BUGCHECK_ERROR` = 354u;
public const val `KERNEL_AUTO_BOOST_LOCK_ACQUISITION_WITH_RAISED_IRQL`: `BUGCHECK_ERROR` = 402u;
public const val `KERNEL_CFG_INIT_FAILURE`: `BUGCHECK_ERROR` = 1058u;
public const val `KERNEL_DATA_INPAGE_ERROR`: `BUGCHECK_ERROR` = 122u;
public const val `KERNEL_EXPAND_STACK_ACTIVE`: `BUGCHECK_ERROR` = 263u;
public const val `KERNEL_LOCK_ENTRY_LEAKED_ON_THREAD_TERMINATION`: `BUGCHECK_ERROR` = 339u;
public const val `KERNEL_MODE_EXCEPTION_NOT_HANDLED`: `BUGCHECK_ERROR` = 142u;
public const val `KERNEL_MODE_EXCEPTION_NOT_HANDLED_M`: `BUGCHECK_ERROR` = 268435598u;
public const val `KERNEL_MODE_HEAP_CORRUPTION`: `BUGCHECK_ERROR` = 314u;
public const val `KERNEL_PARTITION_REFERENCE_VIOLATION`: `BUGCHECK_ERROR` = 398u;
public const val `KERNEL_SECURITY_CHECK_FAILURE`: `BUGCHECK_ERROR` = 313u;
public const val `KERNEL_STACK_INPAGE_ERROR`: `BUGCHECK_ERROR` = 119u;
public const val `KERNEL_STACK_LOCKED_AT_EXIT`: `BUGCHECK_ERROR` = 148u;
public const val `KERNEL_STORAGE_SLOT_IN_USE`: `BUGCHECK_ERROR` = 409u;
public const val `KERNEL_THREAD_PRIORITY_FLOOR_VIOLATION`: `BUGCHECK_ERROR` = 343u;
public const val `KERNEL_WMI_INTERNAL`: `BUGCHECK_ERROR` = 330u;
public const val `KMODE_EXCEPTION_NOT_HANDLED`: `BUGCHECK_ERROR` = 30u;
// UNSUPPORTED Rust 3056:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy, Default)]
// pub struct KNONVOLATILE_CONTEXT_POINTERS {
//     pub Dummy: u32,
// }

// UNSUPPORTED Rust 3062:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct KNONVOLATILE_CONTEXT_POINTERS {
//     pub Anonymous1: KNONVOLATILE_CONTEXT_POINTERS_0,
//     pub Anonymous2: KNONVOLATILE_CONTEXT_POINTERS_1,
// }

// UNSUPPORTED Rust 3069:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for KNONVOLATILE_CONTEXT_POINTERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3075:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub union KNONVOLATILE_CONTEXT_POINTERS_0 {
//     pub FloatingContext: [*mut M128A; 16],
//     pub Anonymous: KNONVOLATILE_CONTEXT_POINTERS_0_0,
// }

// UNSUPPORTED Rust 3082:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for KNONVOLATILE_CONTEXT_POINTERS_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3088:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct KNONVOLATILE_CONTEXT_POINTERS_0_0 {
//     pub Xmm0: *mut M128A,
//     pub Xmm1: *mut M128A,
//     pub Xmm2: *mut M128A,
//     pub Xmm3: *mut M128A,
//     pub Xmm4: *mut M128A,
//     pub Xmm5: *mut M128A,
//     pub Xmm6: *mut M128A,
//     pub Xmm7: *mut M128A,
//     pub Xmm8: *mut M128A,
//     pub Xmm9: *mut M128A,
//     pub Xmm10: *mut M128A,
//     pub Xmm11: *mut M128A,
//     pub Xmm12: *mut M128A,
//     pub Xmm13: *mut M128A,
//     pub Xmm14: *mut M128A,
//     pub Xmm15: *mut M128A,
// }

// UNSUPPORTED Rust 3109:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for KNONVOLATILE_CONTEXT_POINTERS_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3115:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub union KNONVOLATILE_CONTEXT_POINTERS_1 {
//     pub IntegerContext: [*mut u64; 16],
//     pub Anonymous: KNONVOLATILE_CONTEXT_POINTERS_1_0,
// }

// UNSUPPORTED Rust 3122:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for KNONVOLATILE_CONTEXT_POINTERS_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3128:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct KNONVOLATILE_CONTEXT_POINTERS_1_0 {
//     pub Rax: *mut u64,
//     pub Rcx: *mut u64,
//     pub Rdx: *mut u64,
//     pub Rbx: *mut u64,
//     pub Rsp: *mut u64,
//     pub Rbp: *mut u64,
//     pub Rsi: *mut u64,
//     pub Rdi: *mut u64,
//     pub R8: *mut u64,
//     pub R9: *mut u64,
//     pub R10: *mut u64,
//     pub R11: *mut u64,
//     pub R12: *mut u64,
//     pub R13: *mut u64,
//     pub R14: *mut u64,
//     pub R15: *mut u64,
// }

// UNSUPPORTED Rust 3149:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for KNONVOLATILE_CONTEXT_POINTERS_1_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3155:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(target_arch = "aarch64")]
// #[derive(Clone, Copy)]
// pub struct KNONVOLATILE_CONTEXT_POINTERS {
//     pub X19: *mut u64,
//     pub X20: *mut u64,
//     pub X21: *mut u64,
//     pub X22: *mut u64,
//     pub X23: *mut u64,
//     pub X24: *mut u64,
//     pub X25: *mut u64,
//     pub X26: *mut u64,
//     pub X27: *mut u64,
//     pub X28: *mut u64,
//     pub Fp: *mut u64,
//     pub Lr: *mut u64,
//     pub D8: *mut u64,
//     pub D9: *mut u64,
//     pub D10: *mut u64,
//     pub D11: *mut u64,
//     pub D12: *mut u64,
//     pub D13: *mut u64,
//     pub D14: *mut u64,
//     pub D15: *mut u64,
// }

// UNSUPPORTED Rust 3180:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "aarch64")]
// impl Default for KNONVOLATILE_CONTEXT_POINTERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KernelMinidumpStatusCallback`: `MINIDUMP_CALLBACK_TYPE` = 8;
public const val `LAST_CHANCE_CALLED_FROM_KMODE`: `BUGCHECK_ERROR` = 21u;
// UNSUPPORTED Rust 3188:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct LDT_ENTRY {
//     pub LimitLow: u16,
//     pub BaseLow: u16,
//     pub HighWord: LDT_ENTRY_0,
// }

// UNSUPPORTED Rust 3195:1: declaration Impl has no candidate rule
// impl Default for LDT_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3200:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union LDT_ENTRY_0 {
//     pub Bytes: LDT_ENTRY_0_0,
//     pub Bits: LDT_ENTRY_0_1,
// }

// UNSUPPORTED Rust 3206:1: declaration Impl has no candidate rule
// impl Default for LDT_ENTRY_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3211:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct LDT_ENTRY_0_1 {
//     pub _bitfield: u32,
// }

// UNSUPPORTED Rust 3216:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct LDT_ENTRY_0_0 {
//     pub BaseMid: u8,
//     pub Flags1: u8,
//     pub Flags2: u8,
//     pub BaseHi: u8,
// }

public const val `LIVE_SYSTEM_DUMP`: `BUGCHECK_ERROR` = 353u;
public const val `LM_SERVER_INTERNAL_ERROR`: `BUGCHECK_ERROR` = 84u;
// UNSUPPORTED Rust 3226:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(target_arch = "x86")]
// #[cfg(all(feature = "Win32_System_Kernel", feature = "Win32_System_SystemInformation"))]
// #[derive(Clone, Copy)]
// pub struct LOADED_IMAGE {
//     pub ModuleName: windows_sys::core::PSTR,
//     pub hFile: super::super::super::Foundation::HANDLE,
//     pub MappedAddress: *mut u8,
//     pub FileHeader: *mut IMAGE_NT_HEADERS32,
//     pub LastRvaSection: *mut IMAGE_SECTION_HEADER,
//     pub NumberOfSections: u32,
//     pub Sections: *mut IMAGE_SECTION_HEADER,
//     pub Characteristics: IMAGE_FILE_CHARACTERISTICS2,
//     pub fSystemImage: bool,
//     pub fDOSImage: bool,
//     pub fReadOnly: bool,
//     pub Version: u8,
//     pub Links: super::super::Kernel::LIST_ENTRY,
//     pub SizeOfImage: u32,
// }

// UNSUPPORTED Rust 3246:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// #[cfg(all(feature = "Win32_System_Kernel", feature = "Win32_System_SystemInformation"))]
// impl Default for LOADED_IMAGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3253:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[cfg(all(feature = "Win32_System_Kernel", feature = "Win32_System_SystemInformation"))]
// #[derive(Clone, Copy)]
// pub struct LOADED_IMAGE {
//     pub ModuleName: windows_sys::core::PSTR,
//     pub hFile: super::super::super::Foundation::HANDLE,
//     pub MappedAddress: *mut u8,
//     pub FileHeader: *mut IMAGE_NT_HEADERS64,
//     pub LastRvaSection: *mut IMAGE_SECTION_HEADER,
//     pub NumberOfSections: u32,
//     pub Sections: *mut IMAGE_SECTION_HEADER,
//     pub Characteristics: IMAGE_FILE_CHARACTERISTICS2,
//     pub fSystemImage: bool,
//     pub fDOSImage: bool,
//     pub fReadOnly: bool,
//     pub Version: u8,
//     pub Links: super::super::Kernel::LIST_ENTRY,
//     pub SizeOfImage: u32,
// }

// UNSUPPORTED Rust 3273:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[cfg(all(feature = "Win32_System_Kernel", feature = "Win32_System_SystemInformation"))]
// impl Default for LOADED_IMAGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `LOADER_BLOCK_MISMATCH`: `BUGCHECK_ERROR` = 256u;
public const val `LOADER_ROLLBACK_DETECTED`: `BUGCHECK_ERROR` = 406u;
public const val `LOAD_DLL_DEBUG_EVENT`: `DEBUG_EVENT_CODE` = 6u;
// UNSUPPORTED Rust 3283:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct LOAD_DLL_DEBUG_INFO {
//     pub hFile: super::super::super::Foundation::HANDLE,
//     pub lpBaseOfDll: *mut core::ffi::c_void,
//     pub dwDebugInfoFileOffset: u32,
//     pub nDebugInfoSize: u32,
//     pub lpImageName: *mut core::ffi::c_void,
//     pub fUnicode: u16,
// }

// UNSUPPORTED Rust 3293:1: declaration Impl has no candidate rule
// impl Default for LOAD_DLL_DEBUG_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `LOCKED_PAGES_TRACKER_CORRUPTION`: `BUGCHECK_ERROR` = 217u;
// UNSUPPORTED Rust 3299:1: generic scalar type unsupported
// pub type LPCALL_BACK_USER_INTERRUPT_ROUTINE = Option<unsafe extern "system" fn() -> u32>;

public const val `LPC_INITIALIZATION_FAILED`: `BUGCHECK_ERROR` = 106u;
// UNSUPPORTED Rust 3301:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Kernel")]
// pub type LPTOP_LEVEL_EXCEPTION_FILTER = Option<unsafe extern "system" fn(exceptioninfo: *const EXCEPTION_POINTERS) -> i32>;

public const val `LastReservedStream`: `MINIDUMP_STREAM_TYPE` = 65535;
// UNSUPPORTED Rust 3304:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct M128A {
//     pub Low: u64,
//     pub High: i64,
// }

public const val `MACHINE_CHECK_EXCEPTION`: `BUGCHECK_ERROR` = 156u;
public const val `MAILSLOT_FILE_SYSTEM`: `BUGCHECK_ERROR` = 82u;
public const val `MANUALLY_INITIATED_BLACKSCREEN_HOTKEY_LIVE_DUMP`: `BUGCHECK_ERROR` = 8648u;
public const val `MANUALLY_INITIATED_CRASH`: `BUGCHECK_ERROR` = 226u;
public const val `MANUALLY_INITIATED_CRASH1`: `BUGCHECK_ERROR` = 3735936685u;
public const val `MANUALLY_INITIATED_POWER_BUTTON_HOLD`: `BUGCHECK_ERROR` = 456u;
public const val `MANUALLY_INITIATED_POWER_BUTTON_HOLD_LIVE_DUMP`: `BUGCHECK_ERROR` = 4552u;
public const val `MAXIMUM_WAIT_OBJECTS_EXCEEDED`: `BUGCHECK_ERROR` = 12u;
public const val `MAX_SYM_NAME`: UInt = 2000u;
public const val `MBR_CHECKSUM_MISMATCH`: `BUGCHECK_ERROR` = 139u;
public const val `MDL_CACHE`: `BUGCHECK_ERROR` = 500u;
public const val `MEMORY1_INITIALIZATION_FAILED`: `BUGCHECK_ERROR` = 101u;
public const val `MEMORY_IMAGE_CORRUPT`: `BUGCHECK_ERROR` = 162u;
public const val `MEMORY_MANAGEMENT`: `BUGCHECK_ERROR` = 26u;
public const val `MICROCODE_REVISION_MISMATCH`: `BUGCHECK_ERROR` = 382u;
// UNSUPPORTED Rust 3325:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(target_arch = "x86")]
// #[cfg(all(feature = "Win32_Storage_FileSystem", feature = "Win32_System_Kernel", feature = "Win32_System_Memory"))]
// #[derive(Clone, Copy)]
// pub struct MINIDUMP_CALLBACK_INFORMATION {
//     pub CallbackRoutine: MINIDUMP_CALLBACK_ROUTINE,
//     pub CallbackParam: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 3333:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// #[cfg(all(feature = "Win32_Storage_FileSystem", feature = "Win32_System_Kernel", feature = "Win32_System_Memory"))]
// impl Default for MINIDUMP_CALLBACK_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3340:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[cfg(all(feature = "Win32_Storage_FileSystem", feature = "Win32_System_Kernel", feature = "Win32_System_Memory"))]
// #[derive(Clone, Copy)]
// pub struct MINIDUMP_CALLBACK_INFORMATION {
//     pub CallbackRoutine: MINIDUMP_CALLBACK_ROUTINE,
//     pub CallbackParam: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 3348:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[cfg(all(feature = "Win32_Storage_FileSystem", feature = "Win32_System_Kernel", feature = "Win32_System_Memory"))]
// impl Default for MINIDUMP_CALLBACK_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3355:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[cfg(all(feature = "Win32_Storage_FileSystem", feature = "Win32_System_Kernel"))]
// #[derive(Clone, Copy)]
// pub struct MINIDUMP_CALLBACK_INPUT {
//     pub ProcessId: u32,
//     pub ProcessHandle: super::super::super::Foundation::HANDLE,
//     pub CallbackType: u32,
//     pub Anonymous: MINIDUMP_CALLBACK_INPUT_0,
// }

// UNSUPPORTED Rust 3364:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_Storage_FileSystem", feature = "Win32_System_Kernel"))]
// impl Default for MINIDUMP_CALLBACK_INPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3370:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(all(feature = "Win32_Storage_FileSystem", feature = "Win32_System_Kernel"))]
// #[derive(Clone, Copy)]
// pub union MINIDUMP_CALLBACK_INPUT_0 {
//     pub Status: windows_sys::core::HRESULT,
//     pub Thread: MINIDUMP_THREAD_CALLBACK,
//     pub ThreadEx: MINIDUMP_THREAD_EX_CALLBACK,
//     pub Module: MINIDUMP_MODULE_CALLBACK,
//     pub IncludeThread: MINIDUMP_INCLUDE_THREAD_CALLBACK,
//     pub IncludeModule: MINIDUMP_INCLUDE_MODULE_CALLBACK,
//     pub Io: MINIDUMP_IO_CALLBACK,
//     pub ReadMemoryFailure: MINIDUMP_READ_MEMORY_FAILURE_CALLBACK,
//     pub SecondaryFlags: u32,
//     pub VmQuery: MINIDUMP_VM_QUERY_CALLBACK,
//     pub VmPreRead: MINIDUMP_VM_PRE_READ_CALLBACK,
//     pub VmPostRead: MINIDUMP_VM_POST_READ_CALLBACK,
// }

// UNSUPPORTED Rust 3387:1: declaration Impl has no candidate rule
// #[cfg(all(feature = "Win32_Storage_FileSystem", feature = "Win32_System_Kernel"))]
// impl Default for MINIDUMP_CALLBACK_INPUT_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3393:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[cfg(feature = "Win32_System_Memory")]
// #[derive(Clone, Copy)]
// pub struct MINIDUMP_CALLBACK_OUTPUT {
//     pub Anonymous: MINIDUMP_CALLBACK_OUTPUT_0,
// }

// UNSUPPORTED Rust 3399:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Memory")]
// impl Default for MINIDUMP_CALLBACK_OUTPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3405:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Memory")]
// #[derive(Clone, Copy)]
// pub union MINIDUMP_CALLBACK_OUTPUT_0 {
//     pub ModuleWriteFlags: u32,
//     pub ThreadWriteFlags: u32,
//     pub SecondaryFlags: u32,
//     pub Anonymous1: MINIDUMP_CALLBACK_OUTPUT_0_0,
//     pub Anonymous2: MINIDUMP_CALLBACK_OUTPUT_0_1,
//     pub Handle: super::super::super::Foundation::HANDLE,
//     pub Anonymous3: MINIDUMP_CALLBACK_OUTPUT_0_2,
//     pub Anonymous4: MINIDUMP_CALLBACK_OUTPUT_0_3,
//     pub Anonymous5: MINIDUMP_CALLBACK_OUTPUT_0_4,
//     pub Status: windows_sys::core::HRESULT,
// }

// UNSUPPORTED Rust 3420:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Memory")]
// impl Default for MINIDUMP_CALLBACK_OUTPUT_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3426:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[cfg(feature = "Win32_System_Memory")]
// #[derive(Clone, Copy, Default)]
// pub struct MINIDUMP_CALLBACK_OUTPUT_0_0 {
//     pub MemoryBase: u64,
//     pub MemorySize: u32,
// }

// UNSUPPORTED Rust 3433:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Memory")]
// #[derive(Clone, Copy, Default)]
// pub struct MINIDUMP_CALLBACK_OUTPUT_0_1 {
//     pub CheckCancel: windows_sys::core::BOOL,
//     pub Cancel: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 3440:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Memory")]
// #[derive(Clone, Copy, Default)]
// pub struct MINIDUMP_CALLBACK_OUTPUT_0_2 {
//     pub VmRegion: MINIDUMP_MEMORY_INFO,
//     pub Continue: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 3447:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Memory")]
// #[derive(Clone, Copy, Default)]
// pub struct MINIDUMP_CALLBACK_OUTPUT_0_3 {
//     pub VmQueryStatus: windows_sys::core::HRESULT,
//     pub VmQueryResult: MINIDUMP_MEMORY_INFO,
// }

// UNSUPPORTED Rust 3454:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Memory")]
// #[derive(Clone, Copy, Default)]
// pub struct MINIDUMP_CALLBACK_OUTPUT_0_4 {
//     pub VmReadStatus: windows_sys::core::HRESULT,
//     pub VmReadBytesCompleted: u32,
// }

// UNSUPPORTED Rust 3461:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Win32_Storage_FileSystem", feature = "Win32_System_Kernel", feature = "Win32_System_Memory"))]
// pub type MINIDUMP_CALLBACK_ROUTINE = Option<unsafe extern "system" fn(callbackparam: *mut core::ffi::c_void, callbackinput: *const MINIDUMP_CALLBACK_INPUT, callbackoutput: *mut MINIDUMP_CALLBACK_OUTPUT) -> windows_sys::core::BOOL>;

public typealias `MINIDUMP_CALLBACK_TYPE` = Int;
// UNSUPPORTED Rust 3464:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[derive(Clone, Copy, Default)]
// pub struct MINIDUMP_DIRECTORY {
//     pub StreamType: u32,
//     pub Location: MINIDUMP_LOCATION_DESCRIPTOR,
// }

// UNSUPPORTED Rust 3470:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[derive(Clone, Copy)]
// pub struct MINIDUMP_EXCEPTION {
//     pub ExceptionCode: u32,
//     pub ExceptionFlags: u32,
//     pub ExceptionRecord: u64,
//     pub ExceptionAddress: u64,
//     pub NumberParameters: u32,
//     pub __unusedAlignment: u32,
//     pub ExceptionInformation: [u64; 15],
// }

// UNSUPPORTED Rust 3481:1: declaration Impl has no candidate rule
// impl Default for MINIDUMP_EXCEPTION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3486:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(target_arch = "x86")]
// #[cfg(feature = "Win32_System_Kernel")]
// #[derive(Clone, Copy)]
// pub struct MINIDUMP_EXCEPTION_INFORMATION {
//     pub ThreadId: u32,
//     pub ExceptionPointers: *mut EXCEPTION_POINTERS,
//     pub ClientPointers: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 3495:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// #[cfg(feature = "Win32_System_Kernel")]
// impl Default for MINIDUMP_EXCEPTION_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3502:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[cfg(feature = "Win32_System_Kernel")]
// #[derive(Clone, Copy)]
// pub struct MINIDUMP_EXCEPTION_INFORMATION {
//     pub ThreadId: u32,
//     pub ExceptionPointers: *mut EXCEPTION_POINTERS,
//     pub ClientPointers: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 3511:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[cfg(feature = "Win32_System_Kernel")]
// impl Default for MINIDUMP_EXCEPTION_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3518:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[derive(Clone, Copy, Default)]
// pub struct MINIDUMP_EXCEPTION_INFORMATION64 {
//     pub ThreadId: u32,
//     pub ExceptionRecord: u64,
//     pub ContextRecord: u64,
//     pub ClientPointers: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 3526:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[derive(Clone, Copy, Default)]
// pub struct MINIDUMP_EXCEPTION_STREAM {
//     pub ThreadId: u32,
//     pub __alignment: u32,
//     pub ExceptionRecord: MINIDUMP_EXCEPTION,
//     pub ThreadContext: MINIDUMP_LOCATION_DESCRIPTOR,
// }

// UNSUPPORTED Rust 3534:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[derive(Clone, Copy, Default)]
// pub struct MINIDUMP_FUNCTION_TABLE_DESCRIPTOR {
//     pub MinimumAddress: u64,
//     pub MaximumAddress: u64,
//     pub BaseAddress: u64,
//     pub EntryCount: u32,
//     pub SizeOfAlignPad: u32,
// }

// UNSUPPORTED Rust 3543:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[derive(Clone, Copy, Default)]
// pub struct MINIDUMP_FUNCTION_TABLE_STREAM {
//     pub SizeOfHeader: u32,
//     pub SizeOfDescriptor: u32,
//     pub SizeOfNativeDescriptor: u32,
//     pub SizeOfFunctionEntry: u32,
//     pub NumberOfDescriptors: u32,
//     pub SizeOfAlignPad: u32,
// }

// UNSUPPORTED Rust 3553:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[derive(Clone, Copy, Default)]
// pub struct MINIDUMP_HANDLE_DATA_STREAM {
//     pub SizeOfHeader: u32,
//     pub SizeOfDescriptor: u32,
//     pub NumberOfDescriptors: u32,
//     pub Reserved: u32,
// }

// UNSUPPORTED Rust 3561:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[derive(Clone, Copy, Default)]
// pub struct MINIDUMP_HANDLE_DESCRIPTOR {
//     pub Handle: u64,
//     pub TypeNameRva: u32,
//     pub ObjectNameRva: u32,
//     pub Attributes: u32,
//     pub GrantedAccess: u32,
//     pub HandleCount: u32,
//     pub PointerCount: u32,
// }

// UNSUPPORTED Rust 3572:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[derive(Clone, Copy, Default)]
// pub struct MINIDUMP_HANDLE_DESCRIPTOR_2 {
//     pub Handle: u64,
//     pub TypeNameRva: u32,
//     pub ObjectNameRva: u32,
//     pub Attributes: u32,
//     pub GrantedAccess: u32,
//     pub HandleCount: u32,
//     pub PointerCount: u32,
//     pub ObjectInfoRva: u32,
//     pub Reserved0: u32,
// }

// UNSUPPORTED Rust 3585:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[derive(Clone, Copy, Default)]
// pub struct MINIDUMP_HANDLE_OBJECT_INFORMATION {
//     pub NextInfoRva: u32,
//     pub InfoType: u32,
//     pub SizeOfInfo: u32,
// }

public typealias `MINIDUMP_HANDLE_OBJECT_INFORMATION_TYPE` = Int;
// UNSUPPORTED Rust 3593:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[derive(Clone, Copy, Default)]
// pub struct MINIDUMP_HANDLE_OPERATION_LIST {
//     pub SizeOfHeader: u32,
//     pub SizeOfEntry: u32,
//     pub NumberOfEntries: u32,
//     pub Reserved: u32,
// }

// UNSUPPORTED Rust 3601:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[derive(Clone, Copy)]
// pub struct MINIDUMP_HEADER {
//     pub Signature: u32,
//     pub Version: u32,
//     pub NumberOfStreams: u32,
//     pub StreamDirectoryRva: u32,
//     pub CheckSum: u32,
//     pub Anonymous: MINIDUMP_HEADER_0,
//     pub Flags: u64,
// }

// UNSUPPORTED Rust 3612:1: declaration Impl has no candidate rule
// impl Default for MINIDUMP_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3617:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union MINIDUMP_HEADER_0 {
//     pub Reserved: u32,
//     pub TimeDateStamp: u32,
// }

// UNSUPPORTED Rust 3623:1: declaration Impl has no candidate rule
// impl Default for MINIDUMP_HEADER_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3628:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[derive(Clone, Copy, Default)]
// pub struct MINIDUMP_INCLUDE_MODULE_CALLBACK {
//     pub BaseOfImage: u64,
// }

// UNSUPPORTED Rust 3633:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[derive(Clone, Copy, Default)]
// pub struct MINIDUMP_INCLUDE_THREAD_CALLBACK {
//     pub ThreadId: u32,
// }

// UNSUPPORTED Rust 3638:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[derive(Clone, Copy)]
// pub struct MINIDUMP_IO_CALLBACK {
//     pub Handle: super::super::super::Foundation::HANDLE,
//     pub Offset: u64,
//     pub Buffer: *mut core::ffi::c_void,
//     pub BufferBytes: u32,
// }

// UNSUPPORTED Rust 3646:1: declaration Impl has no candidate rule
// impl Default for MINIDUMP_IO_CALLBACK {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3651:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[derive(Clone, Copy, Default)]
// pub struct MINIDUMP_LOCATION_DESCRIPTOR {
//     pub DataSize: u32,
//     pub Rva: u32,
// }

// UNSUPPORTED Rust 3657:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[derive(Clone, Copy, Default)]
// pub struct MINIDUMP_LOCATION_DESCRIPTOR64 {
//     pub DataSize: u64,
//     pub Rva: u64,
// }

// UNSUPPORTED Rust 3663:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[derive(Clone, Copy)]
// pub struct MINIDUMP_MEMORY64_LIST {
//     pub NumberOfMemoryRanges: u64,
//     pub BaseRva: u64,
//     pub MemoryRanges: [MINIDUMP_MEMORY_DESCRIPTOR64; 1],
// }

// UNSUPPORTED Rust 3670:1: declaration Impl has no candidate rule
// impl Default for MINIDUMP_MEMORY64_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3675:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[derive(Clone, Copy, Default)]
// pub struct MINIDUMP_MEMORY_DESCRIPTOR {
//     pub StartOfMemoryRange: u64,
//     pub Memory: MINIDUMP_LOCATION_DESCRIPTOR,
// }

// UNSUPPORTED Rust 3681:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[derive(Clone, Copy, Default)]
// pub struct MINIDUMP_MEMORY_DESCRIPTOR64 {
//     pub StartOfMemoryRange: u64,
//     pub DataSize: u64,
// }

// UNSUPPORTED Rust 3687:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[cfg(feature = "Win32_System_Memory")]
// #[derive(Clone, Copy, Default)]
// pub struct MINIDUMP_MEMORY_INFO {
//     pub BaseAddress: u64,
//     pub AllocationBase: u64,
//     pub AllocationProtect: u32,
//     pub __alignment1: u32,
//     pub RegionSize: u64,
//     pub State: super::super::Memory::VIRTUAL_ALLOCATION_TYPE,
//     pub Protect: u32,
//     pub Type: u32,
//     pub __alignment2: u32,
// }

// UNSUPPORTED Rust 3701:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[derive(Clone, Copy, Default)]
// pub struct MINIDUMP_MEMORY_INFO_LIST {
//     pub SizeOfHeader: u32,
//     pub SizeOfEntry: u32,
//     pub NumberOfEntries: u64,
// }

// UNSUPPORTED Rust 3708:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[derive(Clone, Copy)]
// pub struct MINIDUMP_MEMORY_LIST {
//     pub NumberOfMemoryRanges: u32,
//     pub MemoryRanges: [MINIDUMP_MEMORY_DESCRIPTOR; 1],
// }

// UNSUPPORTED Rust 3714:1: declaration Impl has no candidate rule
// impl Default for MINIDUMP_MEMORY_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MINIDUMP_MISC1_PROCESSOR_POWER_INFO`: UInt = 4u;
public const val `MINIDUMP_MISC1_PROCESS_ID`: `MINIDUMP_MISC_INFO_FLAGS` = 1u;
public const val `MINIDUMP_MISC1_PROCESS_TIMES`: `MINIDUMP_MISC_INFO_FLAGS` = 2u;
public const val `MINIDUMP_MISC3_PROCESS_EXECUTE_FLAGS`: UInt = 32u;
public const val `MINIDUMP_MISC3_PROCESS_INTEGRITY`: UInt = 16u;
public const val `MINIDUMP_MISC3_PROTECTED_PROCESS`: UInt = 128u;
public const val `MINIDUMP_MISC3_TIMEZONE`: UInt = 64u;
public const val `MINIDUMP_MISC4_BUILDSTRING`: UInt = 256u;
public const val `MINIDUMP_MISC5_PROCESS_COOKIE`: UInt = 512u;
// UNSUPPORTED Rust 3728:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[derive(Clone, Copy, Default)]
// pub struct MINIDUMP_MISC_INFO {
//     pub SizeOfInfo: u32,
//     pub Flags1: MINIDUMP_MISC_INFO_FLAGS,
//     pub ProcessId: u32,
//     pub ProcessCreateTime: u32,
//     pub ProcessUserTime: u32,
//     pub ProcessKernelTime: u32,
// }

// UNSUPPORTED Rust 3738:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[derive(Clone, Copy, Default)]
// pub struct MINIDUMP_MISC_INFO_2 {
//     pub SizeOfInfo: u32,
//     pub Flags1: u32,
//     pub ProcessId: u32,
//     pub ProcessCreateTime: u32,
//     pub ProcessUserTime: u32,
//     pub ProcessKernelTime: u32,
//     pub ProcessorMaxMhz: u32,
//     pub ProcessorCurrentMhz: u32,
//     pub ProcessorMhzLimit: u32,
//     pub ProcessorMaxIdleState: u32,
//     pub ProcessorCurrentIdleState: u32,
// }

// UNSUPPORTED Rust 3753:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[cfg(feature = "Win32_System_Time")]
// #[derive(Clone, Copy, Default)]
// pub struct MINIDUMP_MISC_INFO_3 {
//     pub SizeOfInfo: u32,
//     pub Flags1: u32,
//     pub ProcessId: u32,
//     pub ProcessCreateTime: u32,
//     pub ProcessUserTime: u32,
//     pub ProcessKernelTime: u32,
//     pub ProcessorMaxMhz: u32,
//     pub ProcessorCurrentMhz: u32,
//     pub ProcessorMhzLimit: u32,
//     pub ProcessorMaxIdleState: u32,
//     pub ProcessorCurrentIdleState: u32,
//     pub ProcessIntegrityLevel: u32,
//     pub ProcessExecuteFlags: u32,
//     pub ProtectedProcess: u32,
//     pub TimeZoneId: u32,
//     pub TimeZone: super::super::Time::TIME_ZONE_INFORMATION,
// }

// UNSUPPORTED Rust 3774:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[cfg(feature = "Win32_System_Time")]
// #[derive(Clone, Copy)]
// pub struct MINIDUMP_MISC_INFO_4 {
//     pub SizeOfInfo: u32,
//     pub Flags1: u32,
//     pub ProcessId: u32,
//     pub ProcessCreateTime: u32,
//     pub ProcessUserTime: u32,
//     pub ProcessKernelTime: u32,
//     pub ProcessorMaxMhz: u32,
//     pub ProcessorCurrentMhz: u32,
//     pub ProcessorMhzLimit: u32,
//     pub ProcessorMaxIdleState: u32,
//     pub ProcessorCurrentIdleState: u32,
//     pub ProcessIntegrityLevel: u32,
//     pub ProcessExecuteFlags: u32,
//     pub ProtectedProcess: u32,
//     pub TimeZoneId: u32,
//     pub TimeZone: super::super::Time::TIME_ZONE_INFORMATION,
//     pub BuildString: [u16; 260],
//     pub DbgBldStr: [u16; 40],
// }

// UNSUPPORTED Rust 3797:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Time")]
// impl Default for MINIDUMP_MISC_INFO_4 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3803:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[cfg(feature = "Win32_System_Time")]
// #[derive(Clone, Copy)]
// pub struct MINIDUMP_MISC_INFO_5 {
//     pub SizeOfInfo: u32,
//     pub Flags1: u32,
//     pub ProcessId: u32,
//     pub ProcessCreateTime: u32,
//     pub ProcessUserTime: u32,
//     pub ProcessKernelTime: u32,
//     pub ProcessorMaxMhz: u32,
//     pub ProcessorCurrentMhz: u32,
//     pub ProcessorMhzLimit: u32,
//     pub ProcessorMaxIdleState: u32,
//     pub ProcessorCurrentIdleState: u32,
//     pub ProcessIntegrityLevel: u32,
//     pub ProcessExecuteFlags: u32,
//     pub ProtectedProcess: u32,
//     pub TimeZoneId: u32,
//     pub TimeZone: super::super::Time::TIME_ZONE_INFORMATION,
//     pub BuildString: [u16; 260],
//     pub DbgBldStr: [u16; 40],
//     pub XStateData: XSTATE_CONFIG_FEATURE_MSC_INFO,
//     pub ProcessCookie: u32,
// }

// UNSUPPORTED Rust 3828:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Time")]
// impl Default for MINIDUMP_MISC_INFO_5 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `MINIDUMP_MISC_INFO_FLAGS` = UInt;
// UNSUPPORTED Rust 3835:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[cfg(feature = "Win32_Storage_FileSystem")]
// #[derive(Clone, Copy, Default)]
// pub struct MINIDUMP_MODULE {
//     pub BaseOfImage: u64,
//     pub SizeOfImage: u32,
//     pub CheckSum: u32,
//     pub TimeDateStamp: u32,
//     pub ModuleNameRva: u32,
//     pub VersionInfo: super::super::super::Storage::FileSystem::VS_FIXEDFILEINFO,
//     pub CvRecord: MINIDUMP_LOCATION_DESCRIPTOR,
//     pub MiscRecord: MINIDUMP_LOCATION_DESCRIPTOR,
//     pub Reserved0: u64,
//     pub Reserved1: u64,
// }

// UNSUPPORTED Rust 3850:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[cfg(feature = "Win32_Storage_FileSystem")]
// #[derive(Clone, Copy)]
// pub struct MINIDUMP_MODULE_CALLBACK {
//     pub FullPath: windows_sys::core::PWSTR,
//     pub BaseOfImage: u64,
//     pub SizeOfImage: u32,
//     pub CheckSum: u32,
//     pub TimeDateStamp: u32,
//     pub VersionInfo: super::super::super::Storage::FileSystem::VS_FIXEDFILEINFO,
//     pub CvRecord: *mut core::ffi::c_void,
//     pub SizeOfCvRecord: u32,
//     pub MiscRecord: *mut core::ffi::c_void,
//     pub SizeOfMiscRecord: u32,
// }

// UNSUPPORTED Rust 3865:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Storage_FileSystem")]
// impl Default for MINIDUMP_MODULE_CALLBACK {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3871:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[cfg(feature = "Win32_Storage_FileSystem")]
// #[derive(Clone, Copy)]
// pub struct MINIDUMP_MODULE_LIST {
//     pub NumberOfModules: u32,
//     pub Modules: [MINIDUMP_MODULE; 1],
// }

// UNSUPPORTED Rust 3878:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Storage_FileSystem")]
// impl Default for MINIDUMP_MODULE_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MINIDUMP_PROCESS_VM_COUNTERS`: UInt = 1u;
// UNSUPPORTED Rust 3885:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[derive(Clone, Copy, Default)]
// pub struct MINIDUMP_PROCESS_VM_COUNTERS_1 {
//     pub Revision: u16,
//     pub PageFaultCount: u32,
//     pub PeakWorkingSetSize: u64,
//     pub WorkingSetSize: u64,
//     pub QuotaPeakPagedPoolUsage: u64,
//     pub QuotaPagedPoolUsage: u64,
//     pub QuotaPeakNonPagedPoolUsage: u64,
//     pub QuotaNonPagedPoolUsage: u64,
//     pub PagefileUsage: u64,
//     pub PeakPagefileUsage: u64,
//     pub PrivateUsage: u64,
// }

// UNSUPPORTED Rust 3900:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[derive(Clone, Copy, Default)]
// pub struct MINIDUMP_PROCESS_VM_COUNTERS_2 {
//     pub Revision: u16,
//     pub Flags: u16,
//     pub PageFaultCount: u32,
//     pub PeakWorkingSetSize: u64,
//     pub WorkingSetSize: u64,
//     pub QuotaPeakPagedPoolUsage: u64,
//     pub QuotaPagedPoolUsage: u64,
//     pub QuotaPeakNonPagedPoolUsage: u64,
//     pub QuotaNonPagedPoolUsage: u64,
//     pub PagefileUsage: u64,
//     pub PeakPagefileUsage: u64,
//     pub PeakVirtualSize: u64,
//     pub VirtualSize: u64,
//     pub PrivateUsage: u64,
//     pub PrivateWorkingSetSize: u64,
//     pub SharedCommitUsage: u64,
//     pub JobSharedCommitUsage: u64,
//     pub JobPrivateCommitUsage: u64,
//     pub JobPeakPrivateCommitUsage: u64,
//     pub JobPrivateCommitLimit: u64,
//     pub JobTotalCommitLimit: u64,
// }

public const val `MINIDUMP_PROCESS_VM_COUNTERS_EX`: UInt = 4u;
public const val `MINIDUMP_PROCESS_VM_COUNTERS_EX2`: UInt = 8u;
public const val `MINIDUMP_PROCESS_VM_COUNTERS_JOB`: UInt = 16u;
public const val `MINIDUMP_PROCESS_VM_COUNTERS_VIRTUALSIZE`: UInt = 2u;
// UNSUPPORTED Rust 3929:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[derive(Clone, Copy, Default)]
// pub struct MINIDUMP_READ_MEMORY_FAILURE_CALLBACK {
//     pub Offset: u64,
//     pub Bytes: u32,
//     pub FailureStatus: windows_sys::core::HRESULT,
// }

public typealias `MINIDUMP_SECONDARY_FLAGS` = Int;
public typealias `MINIDUMP_STREAM_TYPE` = Int;
// UNSUPPORTED Rust 3938:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[derive(Clone, Copy)]
// pub struct MINIDUMP_STRING {
//     pub Length: u32,
//     pub Buffer: [u16; 1],
// }

// UNSUPPORTED Rust 3944:1: declaration Impl has no candidate rule
// impl Default for MINIDUMP_STRING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MINIDUMP_SYSMEMINFO1_BASICPERF`: UInt = 2u;
public const val `MINIDUMP_SYSMEMINFO1_FILECACHE_TRANSITIONREPURPOSECOUNT_FLAGS`: UInt = 1u;
public const val `MINIDUMP_SYSMEMINFO1_PERF_CCTOTALDIRTYPAGES_CCDIRTYPAGETHRESHOLD`: UInt = 4u;
public const val `MINIDUMP_SYSMEMINFO1_PERF_RESIDENTAVAILABLEPAGES_SHAREDCOMMITPAGES`: UInt = 8u;
// UNSUPPORTED Rust 3953:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[derive(Clone, Copy, Default)]
// pub struct MINIDUMP_SYSTEM_BASIC_INFORMATION {
//     pub TimerResolution: u32,
//     pub PageSize: u32,
//     pub NumberOfPhysicalPages: u32,
//     pub LowestPhysicalPageNumber: u32,
//     pub HighestPhysicalPageNumber: u32,
//     pub AllocationGranularity: u32,
//     pub MinimumUserModeAddress: u64,
//     pub MaximumUserModeAddress: u64,
//     pub ActiveProcessorsAffinityMask: u64,
//     pub NumberOfProcessors: u32,
// }

// UNSUPPORTED Rust 3967:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[derive(Clone, Copy, Default)]
// pub struct MINIDUMP_SYSTEM_BASIC_PERFORMANCE_INFORMATION {
//     pub AvailablePages: u64,
//     pub CommittedPages: u64,
//     pub CommitLimit: u64,
//     pub PeakCommitment: u64,
// }

// UNSUPPORTED Rust 3975:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[derive(Clone, Copy, Default)]
// pub struct MINIDUMP_SYSTEM_FILECACHE_INFORMATION {
//     pub CurrentSize: u64,
//     pub PeakSize: u64,
//     pub PageFaultCount: u32,
//     pub MinimumWorkingSet: u64,
//     pub MaximumWorkingSet: u64,
//     pub CurrentSizeIncludingTransitionInPages: u64,
//     pub PeakSizeIncludingTransitionInPages: u64,
//     pub TransitionRePurposeCount: u32,
//     pub Flags: u32,
// }

// UNSUPPORTED Rust 3988:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[cfg(feature = "Win32_System_SystemInformation")]
// #[derive(Clone, Copy)]
// pub struct MINIDUMP_SYSTEM_INFO {
//     pub ProcessorArchitecture: super::super::SystemInformation::PROCESSOR_ARCHITECTURE,
//     pub ProcessorLevel: u16,
//     pub ProcessorRevision: u16,
//     pub Anonymous1: MINIDUMP_SYSTEM_INFO_0,
//     pub MajorVersion: u32,
//     pub MinorVersion: u32,
//     pub BuildNumber: u32,
//     pub PlatformId: VER_PLATFORM,
//     pub CSDVersionRva: u32,
//     pub Anonymous2: MINIDUMP_SYSTEM_INFO_1,
//     pub Cpu: CPU_INFORMATION,
// }

// UNSUPPORTED Rust 4004:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_SystemInformation")]
// impl Default for MINIDUMP_SYSTEM_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4010:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_SystemInformation")]
// #[derive(Clone, Copy)]
// pub union MINIDUMP_SYSTEM_INFO_0 {
//     pub Reserved0: u16,
//     pub Anonymous: MINIDUMP_SYSTEM_INFO_0_0,
// }

// UNSUPPORTED Rust 4017:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_SystemInformation")]
// impl Default for MINIDUMP_SYSTEM_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4023:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_SystemInformation")]
// #[derive(Clone, Copy, Default)]
// pub struct MINIDUMP_SYSTEM_INFO_0_0 {
//     pub NumberOfProcessors: u8,
//     pub ProductType: u8,
// }

// UNSUPPORTED Rust 4030:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_SystemInformation")]
// #[derive(Clone, Copy)]
// pub union MINIDUMP_SYSTEM_INFO_1 {
//     pub Reserved1: u32,
//     pub Anonymous: MINIDUMP_SYSTEM_INFO_1_0,
// }

// UNSUPPORTED Rust 4037:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_SystemInformation")]
// impl Default for MINIDUMP_SYSTEM_INFO_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4043:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_SystemInformation")]
// #[derive(Clone, Copy, Default)]
// pub struct MINIDUMP_SYSTEM_INFO_1_0 {
//     pub SuiteMask: u16,
//     pub Reserved2: u16,
// }

// UNSUPPORTED Rust 4050:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[derive(Clone, Copy, Default)]
// pub struct MINIDUMP_SYSTEM_MEMORY_INFO_1 {
//     pub Revision: u16,
//     pub Flags: u16,
//     pub BasicInfo: MINIDUMP_SYSTEM_BASIC_INFORMATION,
//     pub FileCacheInfo: MINIDUMP_SYSTEM_FILECACHE_INFORMATION,
//     pub BasicPerfInfo: MINIDUMP_SYSTEM_BASIC_PERFORMANCE_INFORMATION,
//     pub PerfInfo: MINIDUMP_SYSTEM_PERFORMANCE_INFORMATION,
// }

// UNSUPPORTED Rust 4060:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[derive(Clone, Copy, Default)]
// pub struct MINIDUMP_SYSTEM_PERFORMANCE_INFORMATION {
//     pub IdleProcessTime: u64,
//     pub IoReadTransferCount: u64,
//     pub IoWriteTransferCount: u64,
//     pub IoOtherTransferCount: u64,
//     pub IoReadOperationCount: u32,
//     pub IoWriteOperationCount: u32,
//     pub IoOtherOperationCount: u32,
//     pub AvailablePages: u32,
//     pub CommittedPages: u32,
//     pub CommitLimit: u32,
//     pub PeakCommitment: u32,
//     pub PageFaultCount: u32,
//     pub CopyOnWriteCount: u32,
//     pub TransitionCount: u32,
//     pub CacheTransitionCount: u32,
//     pub DemandZeroCount: u32,
//     pub PageReadCount: u32,
//     pub PageReadIoCount: u32,
//     pub CacheReadCount: u32,
//     pub CacheIoCount: u32,
//     pub DirtyPagesWriteCount: u32,
//     pub DirtyWriteIoCount: u32,
//     pub MappedPagesWriteCount: u32,
//     pub MappedWriteIoCount: u32,
//     pub PagedPoolPages: u32,
//     pub NonPagedPoolPages: u32,
//     pub PagedPoolAllocs: u32,
//     pub PagedPoolFrees: u32,
//     pub NonPagedPoolAllocs: u32,
//     pub NonPagedPoolFrees: u32,
//     pub FreeSystemPtes: u32,
//     pub ResidentSystemCodePage: u32,
//     pub TotalSystemDriverPages: u32,
//     pub TotalSystemCodePages: u32,
//     pub NonPagedPoolLookasideHits: u32,
//     pub PagedPoolLookasideHits: u32,
//     pub AvailablePagedPoolPages: u32,
//     pub ResidentSystemCachePage: u32,
//     pub ResidentPagedPoolPage: u32,
//     pub ResidentSystemDriverPage: u32,
//     pub CcFastReadNoWait: u32,
//     pub CcFastReadWait: u32,
//     pub CcFastReadResourceMiss: u32,
//     pub CcFastReadNotPossible: u32,
//     pub CcFastMdlReadNoWait: u32,
//     pub CcFastMdlReadWait: u32,
//     pub CcFastMdlReadResourceMiss: u32,
//     pub CcFastMdlReadNotPossible: u32,
//     pub CcMapDataNoWait: u32,
//     pub CcMapDataWait: u32,
//     pub CcMapDataNoWaitMiss: u32,
//     pub CcMapDataWaitMiss: u32,
//     pub CcPinMappedDataCount: u32,
//     pub CcPinReadNoWait: u32,
//     pub CcPinReadWait: u32,
//     pub CcPinReadNoWaitMiss: u32,
//     pub CcPinReadWaitMiss: u32,
//     pub CcCopyReadNoWait: u32,
//     pub CcCopyReadWait: u32,
//     pub CcCopyReadNoWaitMiss: u32,
//     pub CcCopyReadWaitMiss: u32,
//     pub CcMdlReadNoWait: u32,
//     pub CcMdlReadWait: u32,
//     pub CcMdlReadNoWaitMiss: u32,
//     pub CcMdlReadWaitMiss: u32,
//     pub CcReadAheadIos: u32,
//     pub CcLazyWriteIos: u32,
//     pub CcLazyWritePages: u32,
//     pub CcDataFlushes: u32,
//     pub CcDataPages: u32,
//     pub ContextSwitches: u32,
//     pub FirstLevelTbFills: u32,
//     pub SecondLevelTbFills: u32,
//     pub SystemCalls: u32,
//     pub CcTotalDirtyPages: u64,
//     pub CcDirtyPageThreshold: u64,
//     pub ResidentAvailablePages: i64,
//     pub SharedCommittedPages: u64,
// }

// UNSUPPORTED Rust 4142:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[derive(Clone, Copy, Default)]
// pub struct MINIDUMP_THREAD {
//     pub ThreadId: u32,
//     pub SuspendCount: u32,
//     pub PriorityClass: u32,
//     pub Priority: u32,
//     pub Teb: u64,
//     pub Stack: MINIDUMP_MEMORY_DESCRIPTOR,
//     pub ThreadContext: MINIDUMP_LOCATION_DESCRIPTOR,
// }

// UNSUPPORTED Rust 4153:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[cfg(any(target_arch = "arm64ec", target_arch = "x86", target_arch = "x86_64"))]
// #[cfg(feature = "Win32_System_Kernel")]
// #[derive(Clone, Copy)]
// pub struct MINIDUMP_THREAD_CALLBACK {
//     pub ThreadId: u32,
//     pub ThreadHandle: super::super::super::Foundation::HANDLE,
//     pub Context: CONTEXT,
//     pub SizeOfContext: u32,
//     pub StackBase: u64,
//     pub StackEnd: u64,
// }

// UNSUPPORTED Rust 4165:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "arm64ec", target_arch = "x86", target_arch = "x86_64"))]
// #[cfg(feature = "Win32_System_Kernel")]
// impl Default for MINIDUMP_THREAD_CALLBACK {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4172:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[cfg(target_arch = "aarch64")]
// #[cfg(feature = "Win32_System_Kernel")]
// #[derive(Clone, Copy)]
// pub struct MINIDUMP_THREAD_CALLBACK {
//     pub ThreadId: u32,
//     pub ThreadHandle: super::super::super::Foundation::HANDLE,
//     pub Pad: u32,
//     pub Context: CONTEXT,
//     pub SizeOfContext: u32,
//     pub StackBase: u64,
//     pub StackEnd: u64,
// }

// UNSUPPORTED Rust 4185:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "aarch64")]
// #[cfg(feature = "Win32_System_Kernel")]
// impl Default for MINIDUMP_THREAD_CALLBACK {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4192:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[derive(Clone, Copy, Default)]
// pub struct MINIDUMP_THREAD_EX {
//     pub ThreadId: u32,
//     pub SuspendCount: u32,
//     pub PriorityClass: u32,
//     pub Priority: u32,
//     pub Teb: u64,
//     pub Stack: MINIDUMP_MEMORY_DESCRIPTOR,
//     pub ThreadContext: MINIDUMP_LOCATION_DESCRIPTOR,
//     pub BackingStore: MINIDUMP_MEMORY_DESCRIPTOR,
// }

// UNSUPPORTED Rust 4204:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[cfg(any(target_arch = "arm64ec", target_arch = "x86", target_arch = "x86_64"))]
// #[cfg(feature = "Win32_System_Kernel")]
// #[derive(Clone, Copy)]
// pub struct MINIDUMP_THREAD_EX_CALLBACK {
//     pub ThreadId: u32,
//     pub ThreadHandle: super::super::super::Foundation::HANDLE,
//     pub Context: CONTEXT,
//     pub SizeOfContext: u32,
//     pub StackBase: u64,
//     pub StackEnd: u64,
//     pub BackingStoreBase: u64,
//     pub BackingStoreEnd: u64,
// }

// UNSUPPORTED Rust 4218:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "arm64ec", target_arch = "x86", target_arch = "x86_64"))]
// #[cfg(feature = "Win32_System_Kernel")]
// impl Default for MINIDUMP_THREAD_EX_CALLBACK {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4225:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[cfg(target_arch = "aarch64")]
// #[cfg(feature = "Win32_System_Kernel")]
// #[derive(Clone, Copy)]
// pub struct MINIDUMP_THREAD_EX_CALLBACK {
//     pub ThreadId: u32,
//     pub ThreadHandle: super::super::super::Foundation::HANDLE,
//     pub Pad: u32,
//     pub Context: CONTEXT,
//     pub SizeOfContext: u32,
//     pub StackBase: u64,
//     pub StackEnd: u64,
//     pub BackingStoreBase: u64,
//     pub BackingStoreEnd: u64,
// }

// UNSUPPORTED Rust 4240:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "aarch64")]
// #[cfg(feature = "Win32_System_Kernel")]
// impl Default for MINIDUMP_THREAD_EX_CALLBACK {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4247:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[derive(Clone, Copy)]
// pub struct MINIDUMP_THREAD_EX_LIST {
//     pub NumberOfThreads: u32,
//     pub Threads: [MINIDUMP_THREAD_EX; 1],
// }

// UNSUPPORTED Rust 4253:1: declaration Impl has no candidate rule
// impl Default for MINIDUMP_THREAD_EX_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4258:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[derive(Clone, Copy, Default)]
// pub struct MINIDUMP_THREAD_INFO {
//     pub ThreadId: u32,
//     pub DumpFlags: MINIDUMP_THREAD_INFO_DUMP_FLAGS,
//     pub DumpError: u32,
//     pub ExitStatus: u32,
//     pub CreateTime: u64,
//     pub ExitTime: u64,
//     pub KernelTime: u64,
//     pub UserTime: u64,
//     pub StartAddress: u64,
//     pub Affinity: u64,
// }

public typealias `MINIDUMP_THREAD_INFO_DUMP_FLAGS` = UInt;
public const val `MINIDUMP_THREAD_INFO_ERROR_THREAD`: `MINIDUMP_THREAD_INFO_DUMP_FLAGS` = 1u;
public const val `MINIDUMP_THREAD_INFO_EXITED_THREAD`: `MINIDUMP_THREAD_INFO_DUMP_FLAGS` = 4u;
public const val `MINIDUMP_THREAD_INFO_INVALID_CONTEXT`: `MINIDUMP_THREAD_INFO_DUMP_FLAGS` = 16u;
public const val `MINIDUMP_THREAD_INFO_INVALID_INFO`: `MINIDUMP_THREAD_INFO_DUMP_FLAGS` = 8u;
public const val `MINIDUMP_THREAD_INFO_INVALID_TEB`: `MINIDUMP_THREAD_INFO_DUMP_FLAGS` = 32u;
// UNSUPPORTED Rust 4278:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[derive(Clone, Copy, Default)]
// pub struct MINIDUMP_THREAD_INFO_LIST {
//     pub SizeOfHeader: u32,
//     pub SizeOfEntry: u32,
//     pub NumberOfEntries: u32,
// }

public const val `MINIDUMP_THREAD_INFO_WRITING_THREAD`: `MINIDUMP_THREAD_INFO_DUMP_FLAGS` = 2u;
// UNSUPPORTED Rust 4286:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[derive(Clone, Copy)]
// pub struct MINIDUMP_THREAD_LIST {
//     pub NumberOfThreads: u32,
//     pub Threads: [MINIDUMP_THREAD; 1],
// }

// UNSUPPORTED Rust 4292:1: declaration Impl has no candidate rule
// impl Default for MINIDUMP_THREAD_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4297:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[derive(Clone, Copy, Default)]
// pub struct MINIDUMP_THREAD_NAME {
//     pub ThreadId: u32,
//     pub RvaOfThreadName: u64,
// }

// UNSUPPORTED Rust 4303:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[derive(Clone, Copy)]
// pub struct MINIDUMP_THREAD_NAME_LIST {
//     pub NumberOfThreadNames: u32,
//     pub ThreadNames: [MINIDUMP_THREAD_NAME; 1],
// }

// UNSUPPORTED Rust 4309:1: declaration Impl has no candidate rule
// impl Default for MINIDUMP_THREAD_NAME_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4314:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[derive(Clone, Copy, Default)]
// pub struct MINIDUMP_TOKEN_INFO_HEADER {
//     pub TokenSize: u32,
//     pub TokenId: u32,
//     pub TokenHandle: u64,
// }

// UNSUPPORTED Rust 4321:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[derive(Clone, Copy, Default)]
// pub struct MINIDUMP_TOKEN_INFO_LIST {
//     pub TokenListSize: u32,
//     pub TokenListEntries: u32,
//     pub ListHeaderSize: u32,
//     pub ElementHeaderSize: u32,
// }

public typealias `MINIDUMP_TYPE` = Int;
// UNSUPPORTED Rust 4330:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[derive(Clone, Copy, Default)]
// pub struct MINIDUMP_UNLOADED_MODULE {
//     pub BaseOfImage: u64,
//     pub SizeOfImage: u32,
//     pub CheckSum: u32,
//     pub TimeDateStamp: u32,
//     pub ModuleNameRva: u32,
// }

// UNSUPPORTED Rust 4339:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[derive(Clone, Copy, Default)]
// pub struct MINIDUMP_UNLOADED_MODULE_LIST {
//     pub SizeOfHeader: u32,
//     pub SizeOfEntry: u32,
//     pub NumberOfEntries: u32,
// }

// UNSUPPORTED Rust 4346:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[derive(Clone, Copy, Default)]
// pub struct MINIDUMP_USER_RECORD {
//     pub Type: u32,
//     pub Memory: MINIDUMP_LOCATION_DESCRIPTOR,
// }

// UNSUPPORTED Rust 4352:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct MINIDUMP_USER_STREAM {
//     pub Type: u32,
//     pub BufferSize: u32,
//     pub Buffer: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 4360:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for MINIDUMP_USER_STREAM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4366:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct MINIDUMP_USER_STREAM {
//     pub Type: u32,
//     pub BufferSize: u32,
//     pub Buffer: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 4374:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for MINIDUMP_USER_STREAM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4380:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct MINIDUMP_USER_STREAM_INFORMATION {
//     pub UserStreamCount: u32,
//     pub UserStreamArray: *mut MINIDUMP_USER_STREAM,
// }

// UNSUPPORTED Rust 4387:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for MINIDUMP_USER_STREAM_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4393:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct MINIDUMP_USER_STREAM_INFORMATION {
//     pub UserStreamCount: u32,
//     pub UserStreamArray: *mut MINIDUMP_USER_STREAM,
// }

// UNSUPPORTED Rust 4400:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for MINIDUMP_USER_STREAM_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MINIDUMP_VERSION`: UInt = 42899u;
// UNSUPPORTED Rust 4407:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[derive(Clone, Copy)]
// pub struct MINIDUMP_VM_POST_READ_CALLBACK {
//     pub Offset: u64,
//     pub Buffer: *mut core::ffi::c_void,
//     pub Size: u32,
//     pub Completed: u32,
//     pub Status: windows_sys::core::HRESULT,
// }

// UNSUPPORTED Rust 4416:1: declaration Impl has no candidate rule
// impl Default for MINIDUMP_VM_POST_READ_CALLBACK {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4421:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[derive(Clone, Copy)]
// pub struct MINIDUMP_VM_PRE_READ_CALLBACK {
//     pub Offset: u64,
//     pub Buffer: *mut core::ffi::c_void,
//     pub Size: u32,
// }

// UNSUPPORTED Rust 4428:1: declaration Impl has no candidate rule
// impl Default for MINIDUMP_VM_PRE_READ_CALLBACK {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4433:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[derive(Clone, Copy, Default)]
// pub struct MINIDUMP_VM_QUERY_CALLBACK {
//     pub Offset: u64,
// }

public const val `MISALIGNED_POINTER_PARAMETER`: `BUGCHECK_ERROR` = 502u;
public const val `MISMATCHED_HAL`: `BUGCHECK_ERROR` = 121u;
// UNSUPPORTED Rust 4440:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MODLOAD_CVMISC {
//     pub oCV: u32,
//     pub cCV: usize,
//     pub oMisc: u32,
//     pub cMisc: usize,
//     pub dtImage: u32,
//     pub cImage: u32,
// }

// UNSUPPORTED Rust 4450:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MODLOAD_DATA {
//     pub ssize: u32,
//     pub ssig: MODLOAD_DATA_TYPE,
//     pub data: *mut core::ffi::c_void,
//     pub size: u32,
//     pub flags: u32,
// }

// UNSUPPORTED Rust 4459:1: declaration Impl has no candidate rule
// impl Default for MODLOAD_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `MODLOAD_DATA_TYPE` = UInt;
// UNSUPPORTED Rust 4465:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct MODLOAD_PDBGUID_PDBAGE {
//     pub PdbGuid: windows_sys::core::GUID,
//     pub PdbAge: u32,
// }

// UNSUPPORTED Rust 4471:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MODULE_TYPE_INFO {
//     pub dataLength: u16,
//     pub leaf: u16,
//     pub data: [u8; 1],
// }

// UNSUPPORTED Rust 4478:1: declaration Impl has no candidate rule
// impl Default for MODULE_TYPE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `MODULE_WRITE_FLAGS` = Int;
public const val `MPSDRV_QUERY_USER`: `BUGCHECK_ERROR` = 1073742318u;
public const val `MSRPC_STATE_VIOLATION`: `BUGCHECK_ERROR` = 274u;
public const val `MSSECCORE_ASSERTION_FAILURE`: `BUGCHECK_ERROR` = 503u;
public const val `MUI_NO_VALID_SYSTEM_LANGUAGE`: `BUGCHECK_ERROR` = 298u;
public const val `MULTIPLE_IRP_COMPLETE_REQUESTS`: `BUGCHECK_ERROR` = 68u;
public const val `MULTIPROCESSOR_CONFIGURATION_NOT_SUPPORTED`: `BUGCHECK_ERROR` = 62u;
public const val `MUP_FILE_SYSTEM`: `BUGCHECK_ERROR` = 259u;
public const val `MUST_SUCCEED_POOL_EMPTY`: `BUGCHECK_ERROR` = 65u;
public const val `MUTEX_ALREADY_OWNED`: `BUGCHECK_ERROR` = 191u;
public const val `MUTEX_LEVEL_NUMBER_VIOLATION`: `BUGCHECK_ERROR` = 13u;
public const val `Memory64ListStream`: `MINIDUMP_STREAM_TYPE` = 9;
public const val `MemoryCallback`: `MINIDUMP_CALLBACK_TYPE` = 5;
public const val `MemoryInfoListStream`: `MINIDUMP_STREAM_TYPE` = 16;
public const val `MemoryListStream`: `MINIDUMP_STREAM_TYPE` = 5;
public const val `MiniDumpFilterMemory`: `MINIDUMP_TYPE` = 8;
public const val `MiniDumpFilterModulePaths`: `MINIDUMP_TYPE` = 128;
public const val `MiniDumpFilterTriage`: `MINIDUMP_TYPE` = 1048576;
public const val `MiniDumpFilterWriteCombinedMemory`: `MINIDUMP_TYPE` = 16777216;
public const val `MiniDumpIgnoreInaccessibleMemory`: `MINIDUMP_TYPE` = 131072;
public const val `MiniDumpNormal`: `MINIDUMP_TYPE` = 0;
public const val `MiniDumpScanInaccessiblePartialPages`: `MINIDUMP_TYPE` = 8388608;
public const val `MiniDumpScanMemory`: `MINIDUMP_TYPE` = 16;
public const val `MiniDumpValidTypeFlags`: `MINIDUMP_TYPE` = 33554431;
public const val `MiniDumpWithAvxXStateContext`: `MINIDUMP_TYPE` = 2097152;
public const val `MiniDumpWithCodeSegs`: `MINIDUMP_TYPE` = 8192;
public const val `MiniDumpWithDataSegs`: `MINIDUMP_TYPE` = 1;
public const val `MiniDumpWithFullAuxiliaryState`: `MINIDUMP_TYPE` = 32768;
public const val `MiniDumpWithFullMemory`: `MINIDUMP_TYPE` = 2;
public const val `MiniDumpWithFullMemoryInfo`: `MINIDUMP_TYPE` = 2048;
public const val `MiniDumpWithHandleData`: `MINIDUMP_TYPE` = 4;
public const val `MiniDumpWithIndirectlyReferencedMemory`: `MINIDUMP_TYPE` = 64;
public const val `MiniDumpWithIptTrace`: `MINIDUMP_TYPE` = 4194304;
public const val `MiniDumpWithModuleHeaders`: `MINIDUMP_TYPE` = 524288;
public const val `MiniDumpWithPrivateReadWriteMemory`: `MINIDUMP_TYPE` = 512;
public const val `MiniDumpWithPrivateWriteCopyMemory`: `MINIDUMP_TYPE` = 65536;
public const val `MiniDumpWithProcessThreadData`: `MINIDUMP_TYPE` = 256;
public const val `MiniDumpWithThreadInfo`: `MINIDUMP_TYPE` = 4096;
public const val `MiniDumpWithTokenInformation`: `MINIDUMP_TYPE` = 262144;
public const val `MiniDumpWithUnloadedModules`: `MINIDUMP_TYPE` = 32;
public const val `MiniDumpWithoutAuxiliaryState`: `MINIDUMP_TYPE` = 16384;
public const val `MiniDumpWithoutOptionalData`: `MINIDUMP_TYPE` = 1024;
public const val `MiniEventInformation1`: `MINIDUMP_HANDLE_OBJECT_INFORMATION_TYPE` = 6;
public const val `MiniHandleObjectInformationNone`: `MINIDUMP_HANDLE_OBJECT_INFORMATION_TYPE` = 0;
public const val `MiniHandleObjectInformationTypeMax`: `MINIDUMP_HANDLE_OBJECT_INFORMATION_TYPE` = 9;
public const val `MiniMutantInformation1`: `MINIDUMP_HANDLE_OBJECT_INFORMATION_TYPE` = 2;
public const val `MiniMutantInformation2`: `MINIDUMP_HANDLE_OBJECT_INFORMATION_TYPE` = 3;
public const val `MiniProcessInformation1`: `MINIDUMP_HANDLE_OBJECT_INFORMATION_TYPE` = 4;
public const val `MiniProcessInformation2`: `MINIDUMP_HANDLE_OBJECT_INFORMATION_TYPE` = 5;
public const val `MiniSecondaryValidFlags`: `MINIDUMP_SECONDARY_FLAGS` = 1;
public const val `MiniSecondaryWithoutPowerInfo`: `MINIDUMP_SECONDARY_FLAGS` = 1;
public const val `MiniSectionInformation1`: `MINIDUMP_HANDLE_OBJECT_INFORMATION_TYPE` = 7;
public const val `MiniSemaphoreInformation1`: `MINIDUMP_HANDLE_OBJECT_INFORMATION_TYPE` = 8;
public const val `MiniThreadInformation1`: `MINIDUMP_HANDLE_OBJECT_INFORMATION_TYPE` = 1;
public const val `MiscInfoStream`: `MINIDUMP_STREAM_TYPE` = 15;
public const val `ModuleCallback`: `MINIDUMP_CALLBACK_TYPE` = 0;
public const val `ModuleListStream`: `MINIDUMP_STREAM_TYPE` = 4;
public const val `ModuleReferencedByMemory`: `MODULE_WRITE_FLAGS` = 16;
public const val `ModuleWriteCodeSegs`: `MODULE_WRITE_FLAGS` = 64;
public const val `ModuleWriteCvRecord`: `MODULE_WRITE_FLAGS` = 8;
public const val `ModuleWriteDataSeg`: `MODULE_WRITE_FLAGS` = 2;
public const val `ModuleWriteMiscRecord`: `MODULE_WRITE_FLAGS` = 4;
public const val `ModuleWriteModule`: `MODULE_WRITE_FLAGS` = 1;
public const val `ModuleWriteTlsData`: `MODULE_WRITE_FLAGS` = 32;
public const val `NDIS_INTERNAL_ERROR`: `BUGCHECK_ERROR` = 79u;
public const val `NDIS_NET_BUFFER_LIST_INFO_ILLEGALLY_TRANSFERRED`: `BUGCHECK_ERROR` = 326u;
public const val `NETIO_INVALID_POOL_CALLER`: `BUGCHECK_ERROR` = 294u;
public const val `NETWORK_BOOT_DUPLICATE_ADDRESS`: `BUGCHECK_ERROR` = 188u;
public const val `NETWORK_BOOT_INITIALIZATION_FAILED`: `BUGCHECK_ERROR` = 187u;
public const val `NMI_HARDWARE_FAILURE`: `BUGCHECK_ERROR` = 128u;
public const val `NMR_INVALID_STATE`: `BUGCHECK_ERROR` = 293u;
public const val `NO_BOOT_DEVICE`: `BUGCHECK_ERROR` = 83u;
public const val `NO_EXCEPTION_HANDLING_SUPPORT`: `BUGCHECK_ERROR` = 11u;
public const val `NO_MORE_IRP_STACK_LOCATIONS`: `BUGCHECK_ERROR` = 53u;
public const val `NO_MORE_SYSTEM_PTES`: `BUGCHECK_ERROR` = 63u;
public const val `NO_PAGES_AVAILABLE`: `BUGCHECK_ERROR` = 77u;
public const val `NO_SPIN_LOCK_AVAILABLE`: `BUGCHECK_ERROR` = 29u;
public const val `NO_SUCH_PARTITION`: `BUGCHECK_ERROR` = 67u;
public const val `NO_USER_MODE_CONTEXT`: `BUGCHECK_ERROR` = 14u;
public const val `NPFS_FILE_SYSTEM`: `BUGCHECK_ERROR` = 37u;
public const val `NTFS_FILE_SYSTEM`: `BUGCHECK_ERROR` = 36u;
public const val `NTHV_GUEST_ERROR`: `BUGCHECK_ERROR` = 280u;
public const val `NUM_SSRVOPTS`: UInt = 32u;
public const val `NumSymTypes`: `SYM_TYPE` = 9;
public const val `OBJECT1_INITIALIZATION_FAILED`: `BUGCHECK_ERROR` = 98u;
public const val `OBJECT_ATTRIB_ACCESS_FINAL`: `OBJECT_ATTRIB_FLAGS` = 32768;
public const val `OBJECT_ATTRIB_ACCESS_PRIVATE`: `OBJECT_ATTRIB_FLAGS` = 8192;
public const val `OBJECT_ATTRIB_ACCESS_PROTECTED`: `OBJECT_ATTRIB_FLAGS` = 16384;
public const val `OBJECT_ATTRIB_ACCESS_PUBLIC`: `OBJECT_ATTRIB_FLAGS` = 4096;
public typealias `OBJECT_ATTRIB_FLAGS` = Int;
public const val `OBJECT_ATTRIB_HAS_EXTENDED_ATTRIBS`: `OBJECT_ATTRIB_FLAGS` = 8388608;
public const val `OBJECT_ATTRIB_IS_CLASS`: `OBJECT_ATTRIB_FLAGS` = 16777216;
public const val `OBJECT_ATTRIB_IS_FUNCTION`: `OBJECT_ATTRIB_FLAGS` = 33554432;
public const val `OBJECT_ATTRIB_IS_INHERITED`: `OBJECT_ATTRIB_FLAGS` = 1073741824;
public const val `OBJECT_ATTRIB_IS_INTERFACE`: `OBJECT_ATTRIB_FLAGS` = -2147483648;
public const val `OBJECT_ATTRIB_IS_MACRO`: `OBJECT_ATTRIB_FLAGS` = 268435456;
public const val `OBJECT_ATTRIB_IS_PROPERTY`: `OBJECT_ATTRIB_FLAGS` = 134217728;
public const val `OBJECT_ATTRIB_IS_TYPE`: `OBJECT_ATTRIB_FLAGS` = 536870912;
public const val `OBJECT_ATTRIB_IS_VARIABLE`: `OBJECT_ATTRIB_FLAGS` = 67108864;
public const val `OBJECT_ATTRIB_NO_ATTRIB`: `OBJECT_ATTRIB_FLAGS` = 0;
public const val `OBJECT_ATTRIB_NO_NAME`: `OBJECT_ATTRIB_FLAGS` = 1;
public const val `OBJECT_ATTRIB_NO_TYPE`: `OBJECT_ATTRIB_FLAGS` = 2;
public const val `OBJECT_ATTRIB_NO_VALUE`: `OBJECT_ATTRIB_FLAGS` = 4;
public const val `OBJECT_ATTRIB_OBJECT_IS_EXPANDABLE`: `OBJECT_ATTRIB_FLAGS` = 112;
public const val `OBJECT_ATTRIB_SLOT_IS_CATEGORY`: `OBJECT_ATTRIB_FLAGS` = 1024;
public const val `OBJECT_ATTRIB_STORAGE_FIELD`: `OBJECT_ATTRIB_FLAGS` = 262144;
public const val `OBJECT_ATTRIB_STORAGE_GLOBAL`: `OBJECT_ATTRIB_FLAGS` = 65536;
public const val `OBJECT_ATTRIB_STORAGE_STATIC`: `OBJECT_ATTRIB_FLAGS` = 131072;
public const val `OBJECT_ATTRIB_STORAGE_VIRTUAL`: `OBJECT_ATTRIB_FLAGS` = 524288;
public const val `OBJECT_ATTRIB_TYPE_HAS_CODE`: `OBJECT_ATTRIB_FLAGS` = 512;
public const val `OBJECT_ATTRIB_TYPE_IS_CONSTANT`: `OBJECT_ATTRIB_FLAGS` = 1048576;
public const val `OBJECT_ATTRIB_TYPE_IS_EXPANDABLE`: `OBJECT_ATTRIB_FLAGS` = 256;
public const val `OBJECT_ATTRIB_TYPE_IS_OBJECT`: `OBJECT_ATTRIB_FLAGS` = 256;
public const val `OBJECT_ATTRIB_TYPE_IS_SYNCHRONIZED`: `OBJECT_ATTRIB_FLAGS` = 2097152;
public const val `OBJECT_ATTRIB_TYPE_IS_VOLATILE`: `OBJECT_ATTRIB_FLAGS` = 4194304;
public const val `OBJECT_ATTRIB_VALUE_HAS_CODE`: `OBJECT_ATTRIB_FLAGS` = 128;
public const val `OBJECT_ATTRIB_VALUE_IS_CUSTOM`: `OBJECT_ATTRIB_FLAGS` = 64;
public const val `OBJECT_ATTRIB_VALUE_IS_ENUM`: `OBJECT_ATTRIB_FLAGS` = 32;
public const val `OBJECT_ATTRIB_VALUE_IS_INVALID`: `OBJECT_ATTRIB_FLAGS` = 8;
public const val `OBJECT_ATTRIB_VALUE_IS_OBJECT`: `OBJECT_ATTRIB_FLAGS` = 16;
public const val `OBJECT_ATTRIB_VALUE_READONLY`: `OBJECT_ATTRIB_FLAGS` = 2048;
public const val `OBJECT_INITIALIZATION_FAILED`: `BUGCHECK_ERROR` = 94u;
public const val `OFS_FILE_SYSTEM`: `BUGCHECK_ERROR` = 131u;
// UNSUPPORTED Rust 4606:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct OMAP {
//     pub rva: u32,
//     pub rvaTo: u32,
// }

public typealias `OPEN_THREAD_WAIT_CHAIN_SESSION_FLAGS` = UInt;
public const val `OS_DATA_TAMPERING`: `BUGCHECK_ERROR` = 341u;
public const val `OUTPUT_DEBUG_STRING_EVENT`: `DEBUG_EVENT_CODE` = 8u;
// UNSUPPORTED Rust 4615:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct OUTPUT_DEBUG_STRING_INFO {
//     pub lpDebugStringData: windows_sys::core::PSTR,
//     pub fUnicode: u16,
//     pub nDebugStringLength: u16,
// }

// UNSUPPORTED Rust 4622:1: declaration Impl has no candidate rule
// impl Default for OUTPUT_DEBUG_STRING_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PAGE_FAULT_BEYOND_END_OF_ALLOCATION`: `BUGCHECK_ERROR` = 205u;
public const val `PAGE_FAULT_IN_FREED_SPECIAL_POOL`: `BUGCHECK_ERROR` = 204u;
public const val `PAGE_FAULT_IN_NONPAGED_AREA`: `BUGCHECK_ERROR` = 80u;
public const val `PAGE_FAULT_IN_NONPAGED_AREA_M`: `BUGCHECK_ERROR` = 268435536u;
public const val `PAGE_FAULT_WITH_INTERRUPTS_OFF`: `BUGCHECK_ERROR` = 73u;
public const val `PAGE_NOT_ZERO`: `BUGCHECK_ERROR` = 295u;
public const val `PANIC_STACK_SWITCH`: `BUGCHECK_ERROR` = 43u;
public const val `PASSIVE_INTERRUPT_ERROR`: `BUGCHECK_ERROR` = 315u;
public const val `PCI_BUS_DRIVER_INTERNAL`: `BUGCHECK_ERROR` = 161u;
public const val `PCI_CONFIG_SPACE_ACCESS_FAILURE`: `BUGCHECK_ERROR` = 192u;
public const val `PCI_VERIFIER_DETECTED_VIOLATION`: `BUGCHECK_ERROR` = 246u;
// UNSUPPORTED Rust 4638:1: generic scalar type unsupported
// pub type PCOGETACTIVATIONSTATE = Option<unsafe extern "system" fn(param0: windows_sys::core::GUID, param1: u32, param2: *mut u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 4639:1: generic scalar type unsupported
// pub type PCOGETCALLSTATE = Option<unsafe extern "system" fn(param0: i32, param1: *mut u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 4640:1: generic scalar type unsupported
// pub type PDBGHELP_CREATE_USER_DUMP_CALLBACK = Option<unsafe extern "system" fn(datatype: u32, data: *const *const core::ffi::c_void, datalength: *mut u32, userdata: *const core::ffi::c_void) -> windows_sys::core::BOOL>;

public const val `PDC_LOCK_WATCHDOG_LIVEDUMP`: `BUGCHECK_ERROR` = 380u;
public const val `PDC_PRIVILEGE_CHECK_LIVEDUMP`: `BUGCHECK_ERROR` = 415u;
public const val `PDC_UNEXPECTED_REVOCATION_LIVEDUMP`: `BUGCHECK_ERROR` = 381u;
public const val `PDC_WATCHDOG_TIMEOUT`: `BUGCHECK_ERROR` = 335u;
public const val `PDC_WATCHDOG_TIMEOUT_LIVEDUMP`: `BUGCHECK_ERROR` = 348u;
// UNSUPPORTED Rust 4646:1: generic scalar type unsupported
// pub type PENUMDIRTREE_CALLBACK = Option<unsafe extern "system" fn(filepath: windows_sys::core::PCSTR, callerdata: *const core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 4647:1: generic scalar type unsupported
// pub type PENUMDIRTREE_CALLBACKW = Option<unsafe extern "system" fn(filepath: windows_sys::core::PCWSTR, callerdata: *const core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 4648:1: attribute cfg requires explicit semantics/configuration
// #[cfg(target_arch = "x86")]
// pub type PENUMLOADED_MODULES_CALLBACK = Option<unsafe extern "system" fn(modulename: windows_sys::core::PCSTR, modulebase: u32, modulesize: u32, usercontext: *const core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 4650:1: generic scalar type unsupported
// pub type PENUMLOADED_MODULES_CALLBACK64 = Option<unsafe extern "system" fn(modulename: windows_sys::core::PCSTR, modulebase: u64, modulesize: u32, usercontext: *const core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 4651:1: generic scalar type unsupported
// pub type PENUMLOADED_MODULES_CALLBACKW64 = Option<unsafe extern "system" fn(modulename: windows_sys::core::PCWSTR, modulebase: u64, modulesize: u32, usercontext: *const core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 4652:1: generic scalar type unsupported
// pub type PENUMSOURCEFILETOKENSCALLBACK = Option<unsafe extern "system" fn(token: *const core::ffi::c_void, size: usize) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 4653:1: generic scalar type unsupported
// pub type PFINDFILEINPATHCALLBACK = Option<unsafe extern "system" fn(filename: windows_sys::core::PCSTR, context: *const core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 4654:1: generic scalar type unsupported
// pub type PFINDFILEINPATHCALLBACKW = Option<unsafe extern "system" fn(filename: windows_sys::core::PCWSTR, context: *const core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 4655:1: generic scalar type unsupported
// pub type PFIND_DEBUG_FILE_CALLBACK = Option<unsafe extern "system" fn(filehandle: super::super::super::Foundation::HANDLE, filename: windows_sys::core::PCSTR, callerdata: *const core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 4656:1: generic scalar type unsupported
// pub type PFIND_DEBUG_FILE_CALLBACKW = Option<unsafe extern "system" fn(filehandle: super::super::super::Foundation::HANDLE, filename: windows_sys::core::PCWSTR, callerdata: *const core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 4657:1: generic scalar type unsupported
// pub type PFIND_EXE_FILE_CALLBACK = Option<unsafe extern "system" fn(filehandle: super::super::super::Foundation::HANDLE, filename: windows_sys::core::PCSTR, callerdata: *const core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 4658:1: generic scalar type unsupported
// pub type PFIND_EXE_FILE_CALLBACKW = Option<unsafe extern "system" fn(filehandle: super::super::super::Foundation::HANDLE, filename: windows_sys::core::PCWSTR, callerdata: *const core::ffi::c_void) -> windows_sys::core::BOOL>;

public const val `PFN_LIST_CORRUPT`: `BUGCHECK_ERROR` = 78u;
public const val `PFN_REFERENCE_COUNT`: `BUGCHECK_ERROR` = 28u;
public const val `PFN_SHARE_COUNT`: `BUGCHECK_ERROR` = 27u;
// UNSUPPORTED Rust 4662:1: attribute cfg requires explicit semantics/configuration
// #[cfg(target_arch = "x86")]
// pub type PFUNCTION_TABLE_ACCESS_ROUTINE = Option<unsafe extern "system" fn(hprocess: super::super::super::Foundation::HANDLE, addrbase: u32) -> *mut core::ffi::c_void>;

// UNSUPPORTED Rust 4664:1: generic scalar type unsupported
// pub type PFUNCTION_TABLE_ACCESS_ROUTINE64 = Option<unsafe extern "system" fn(ahprocess: super::super::super::Foundation::HANDLE, addrbase: u64) -> *mut core::ffi::c_void>;

public const val `PF_DETECTED_CORRUPTION`: `BUGCHECK_ERROR` = 401u;
// UNSUPPORTED Rust 4666:1: attribute cfg requires explicit semantics/configuration
// #[cfg(target_arch = "x86")]
// pub type PGET_MODULE_BASE_ROUTINE = Option<unsafe extern "system" fn(hprocess: super::super::super::Foundation::HANDLE, address: u32) -> u32>;

// UNSUPPORTED Rust 4668:1: generic scalar type unsupported
// pub type PGET_MODULE_BASE_ROUTINE64 = Option<unsafe extern "system" fn(hprocess: super::super::super::Foundation::HANDLE, address: u64) -> u64>;

// UNSUPPORTED Rust 4669:1: attribute cfg requires explicit semantics/configuration
// #[cfg(any(target_arch = "arm64ec", target_arch = "x86_64"))]
// pub type PGET_RUNTIME_FUNCTION_CALLBACK = Option<unsafe extern "system" fn(controlpc: u64, context: *const core::ffi::c_void) -> *mut IMAGE_RUNTIME_FUNCTION_ENTRY>;

// UNSUPPORTED Rust 4671:1: attribute cfg requires explicit semantics/configuration
// #[cfg(target_arch = "aarch64")]
// pub type PGET_RUNTIME_FUNCTION_CALLBACK = Option<unsafe extern "system" fn(controlpc: u64, context: *const core::ffi::c_void) -> *mut IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY>;

// UNSUPPORTED Rust 4673:1: generic scalar type unsupported
// pub type PGET_TARGET_ATTRIBUTE_VALUE64 = Option<unsafe extern "system" fn(hprocess: super::super::super::Foundation::HANDLE, attribute: u32, attributedata: u64, attributevalue: *mut u64) -> windows_sys::core::BOOL>;

public const val `PHASE0_EXCEPTION`: `BUGCHECK_ERROR` = 120u;
public const val `PHASE0_INITIALIZATION_FAILED`: `BUGCHECK_ERROR` = 49u;
public const val `PHASE1_INITIALIZATION_FAILED`: `BUGCHECK_ERROR` = 50u;
// UNSUPPORTED Rust 4677:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PHYSICAL_MEMORY_DESCRIPTOR32 {
//     pub NumberOfRuns: u32,
//     pub NumberOfPages: u32,
//     pub Run: [PHYSICAL_MEMORY_RUN32; 1],
// }

// UNSUPPORTED Rust 4684:1: declaration Impl has no candidate rule
// impl Default for PHYSICAL_MEMORY_DESCRIPTOR32 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4689:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct PHYSICAL_MEMORY_DESCRIPTOR64 {
//     pub NumberOfRuns: u32,
//     pub NumberOfPages: u64,
//     pub Run: [PHYSICAL_MEMORY_RUN64; 1],
// }

// UNSUPPORTED Rust 4696:1: declaration Impl has no candidate rule
// impl Default for PHYSICAL_MEMORY_DESCRIPTOR64 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4701:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PHYSICAL_MEMORY_RUN32 {
//     pub BasePage: u32,
//     pub PageCount: u32,
// }

// UNSUPPORTED Rust 4707:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PHYSICAL_MEMORY_RUN64 {
//     pub BasePage: u64,
//     pub PageCount: u64,
// }

// UNSUPPORTED Rust 4713:1: generic scalar type unsupported
// pub type PIMAGEHLP_STATUS_ROUTINE = Option<unsafe extern "system" fn(reason: IMAGEHLP_STATUS_REASON, imagename: windows_sys::core::PCSTR, dllname: windows_sys::core::PCSTR, va: usize, parameter: usize) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 4714:1: generic scalar type unsupported
// pub type PIMAGEHLP_STATUS_ROUTINE32 = Option<unsafe extern "system" fn(reason: IMAGEHLP_STATUS_REASON, imagename: windows_sys::core::PCSTR, dllname: windows_sys::core::PCSTR, va: u32, parameter: usize) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 4715:1: generic scalar type unsupported
// pub type PIMAGEHLP_STATUS_ROUTINE64 = Option<unsafe extern "system" fn(reason: IMAGEHLP_STATUS_REASON, imagename: windows_sys::core::PCSTR, dllname: windows_sys::core::PCSTR, va: u64, parameter: usize) -> windows_sys::core::BOOL>;

public const val `PINBALL_FILE_SYSTEM`: `BUGCHECK_ERROR` = 89u;
public const val `PNP_DETECTED_FATAL_ERROR`: `BUGCHECK_ERROR` = 202u;
public const val `PNP_INTERNAL_ERROR`: `BUGCHECK_ERROR` = 149u;
public const val `POOL_CORRUPTION_IN_FILE_AREA`: `BUGCHECK_ERROR` = 222u;
public const val `PORT_DRIVER_INTERNAL`: `BUGCHECK_ERROR` = 44u;
public const val `POWER_FAILURE_SIMULATE`: `BUGCHECK_ERROR` = 229u;
public const val `PP0_INITIALIZATION_FAILED`: `BUGCHECK_ERROR` = 143u;
public const val `PP1_INITIALIZATION_FAILED`: `BUGCHECK_ERROR` = 144u;
// UNSUPPORTED Rust 4724:1: attribute cfg requires explicit semantics/configuration
// #[cfg(target_arch = "x86")]
// pub type PREAD_PROCESS_MEMORY_ROUTINE = Option<unsafe extern "system" fn(hprocess: super::super::super::Foundation::HANDLE, lpbaseaddress: u32, lpbuffer: *mut core::ffi::c_void, nsize: u32, lpnumberofbytesread: *mut u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 4726:1: generic scalar type unsupported
// pub type PREAD_PROCESS_MEMORY_ROUTINE64 = Option<unsafe extern "system" fn(hprocess: super::super::super::Foundation::HANDLE, qwbaseaddress: u64, lpbuffer: *mut core::ffi::c_void, nsize: u32, lpnumberofbytesread: *mut u32) -> windows_sys::core::BOOL>;

public const val `PREVIOUS_FATAL_ABNORMAL_RESET_ERROR`: `BUGCHECK_ERROR` = 373u;
public const val `PROCESS1_INITIALIZATION_FAILED`: `BUGCHECK_ERROR` = 107u;
public const val `PROCESSOR_DRIVER_INTERNAL`: `BUGCHECK_ERROR` = 323u;
public const val `PROCESSOR_START_TIMEOUT`: `BUGCHECK_ERROR` = 479u;
public const val `PROCESS_HAS_LOCKED_PAGES`: `BUGCHECK_ERROR` = 118u;
public const val `PROCESS_INITIALIZATION_FAILED`: `BUGCHECK_ERROR` = 96u;
public const val `PROFILER_CONFIGURATION_ILLEGAL`: `BUGCHECK_ERROR` = 379u;
public const val `PROP_INFO_ATTRIBUTES`: `PROP_INFO_FLAGS` = 8;
public const val `PROP_INFO_AUTOEXPAND`: `PROP_INFO_FLAGS` = 134217728;
public const val `PROP_INFO_DEBUGPROP`: `PROP_INFO_FLAGS` = 16;
public typealias `PROP_INFO_FLAGS` = Int;
public const val `PROP_INFO_FULLNAME`: `PROP_INFO_FLAGS` = 32;
public const val `PROP_INFO_NAME`: `PROP_INFO_FLAGS` = 1;
public const val `PROP_INFO_TYPE`: `PROP_INFO_FLAGS` = 2;
public const val `PROP_INFO_VALUE`: `PROP_INFO_FLAGS` = 4;
// UNSUPPORTED Rust 4742:1: generic scalar type unsupported
// pub type PSYMBOLSERVERBYINDEXPROC = Option<unsafe extern "system" fn(param0: windows_sys::core::PCSTR, param1: windows_sys::core::PCSTR, param2: windows_sys::core::PCSTR, param3: windows_sys::core::PCSTR) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 4743:1: generic scalar type unsupported
// pub type PSYMBOLSERVERBYINDEXPROCA = Option<unsafe extern "system" fn(param0: windows_sys::core::PCSTR, param1: windows_sys::core::PCSTR, param2: windows_sys::core::PCSTR, param3: windows_sys::core::PCSTR) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 4744:1: generic scalar type unsupported
// pub type PSYMBOLSERVERBYINDEXPROCW = Option<unsafe extern "system" fn(param0: windows_sys::core::PCWSTR, param1: windows_sys::core::PCWSTR, param2: windows_sys::core::PCWSTR, param3: windows_sys::core::PCWSTR) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 4745:1: generic scalar type unsupported
// pub type PSYMBOLSERVERCALLBACKPROC = Option<unsafe extern "system" fn(action: usize, data: u64, context: u64) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 4746:1: generic scalar type unsupported
// pub type PSYMBOLSERVERCLOSEPROC = Option<unsafe extern "system" fn() -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 4747:1: generic scalar type unsupported
// pub type PSYMBOLSERVERDELTANAME = Option<unsafe extern "system" fn(param0: windows_sys::core::PCSTR, param1: *mut core::ffi::c_void, param2: u32, param3: u32, param4: *mut core::ffi::c_void, param5: u32, param6: u32, param7: windows_sys::core::PCSTR, param8: usize) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 4748:1: generic scalar type unsupported
// pub type PSYMBOLSERVERDELTANAMEW = Option<unsafe extern "system" fn(param0: windows_sys::core::PCWSTR, param1: *mut core::ffi::c_void, param2: u32, param3: u32, param4: *mut core::ffi::c_void, param5: u32, param6: u32, param7: windows_sys::core::PCWSTR, param8: usize) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 4749:1: generic scalar type unsupported
// pub type PSYMBOLSERVERGETINDEXSTRING = Option<unsafe extern "system" fn(param0: *mut core::ffi::c_void, param1: u32, param2: u32, param3: windows_sys::core::PCSTR, param4: usize) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 4750:1: generic scalar type unsupported
// pub type PSYMBOLSERVERGETINDEXSTRINGW = Option<unsafe extern "system" fn(param0: *mut core::ffi::c_void, param1: u32, param2: u32, param3: windows_sys::core::PCWSTR, param4: usize) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 4751:1: generic scalar type unsupported
// pub type PSYMBOLSERVERGETOPTIONDATAPROC = Option<unsafe extern "system" fn(param0: usize, param1: *mut u64) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 4752:1: generic scalar type unsupported
// pub type PSYMBOLSERVERGETOPTIONSPROC = Option<unsafe extern "system" fn() -> usize>;

// UNSUPPORTED Rust 4753:1: generic scalar type unsupported
// pub type PSYMBOLSERVERGETSUPPLEMENT = Option<unsafe extern "system" fn(param0: windows_sys::core::PCSTR, param1: windows_sys::core::PCSTR, param2: windows_sys::core::PCSTR, param3: windows_sys::core::PCSTR, param4: usize) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 4754:1: generic scalar type unsupported
// pub type PSYMBOLSERVERGETSUPPLEMENTW = Option<unsafe extern "system" fn(param0: windows_sys::core::PCWSTR, param1: windows_sys::core::PCWSTR, param2: windows_sys::core::PCWSTR, param3: windows_sys::core::PCWSTR, param4: usize) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 4755:1: generic scalar type unsupported
// pub type PSYMBOLSERVERGETVERSION = Option<unsafe extern "system" fn(param0: *mut API_VERSION) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 4756:1: generic scalar type unsupported
// pub type PSYMBOLSERVERISSTORE = Option<unsafe extern "system" fn(param0: windows_sys::core::PCSTR) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 4757:1: generic scalar type unsupported
// pub type PSYMBOLSERVERISSTOREW = Option<unsafe extern "system" fn(param0: windows_sys::core::PCWSTR) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 4758:1: generic scalar type unsupported
// pub type PSYMBOLSERVERMESSAGEPROC = Option<unsafe extern "system" fn(action: usize, data: u64, context: u64) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 4759:1: generic scalar type unsupported
// pub type PSYMBOLSERVEROPENPROC = Option<unsafe extern "system" fn() -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 4760:1: generic scalar type unsupported
// pub type PSYMBOLSERVERPINGPROC = Option<unsafe extern "system" fn(param0: windows_sys::core::PCSTR) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 4761:1: generic scalar type unsupported
// pub type PSYMBOLSERVERPINGPROCA = Option<unsafe extern "system" fn(param0: windows_sys::core::PCSTR) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 4762:1: generic scalar type unsupported
// pub type PSYMBOLSERVERPINGPROCW = Option<unsafe extern "system" fn(param0: windows_sys::core::PCWSTR) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 4763:1: generic scalar type unsupported
// pub type PSYMBOLSERVERPINGPROCWEX = Option<unsafe extern "system" fn(param0: windows_sys::core::PCWSTR) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 4764:1: generic scalar type unsupported
// pub type PSYMBOLSERVERPROC = Option<unsafe extern "system" fn(param0: windows_sys::core::PCSTR, param1: windows_sys::core::PCSTR, param2: *mut core::ffi::c_void, param3: u32, param4: u32, param5: windows_sys::core::PCSTR) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 4765:1: generic scalar type unsupported
// pub type PSYMBOLSERVERPROCA = Option<unsafe extern "system" fn(param0: windows_sys::core::PCSTR, param1: windows_sys::core::PCSTR, param2: *mut core::ffi::c_void, param3: u32, param4: u32, param5: windows_sys::core::PCSTR) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 4766:1: generic scalar type unsupported
// pub type PSYMBOLSERVERPROCW = Option<unsafe extern "system" fn(param0: windows_sys::core::PCWSTR, param1: windows_sys::core::PCWSTR, param2: *mut core::ffi::c_void, param3: u32, param4: u32, param5: windows_sys::core::PCWSTR) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 4767:1: generic scalar type unsupported
// pub type PSYMBOLSERVERSETHTTPAUTHHEADER = Option<unsafe extern "system" fn(pszauthheader: windows_sys::core::PCWSTR) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 4768:1: generic scalar type unsupported
// pub type PSYMBOLSERVERSETOPTIONSPROC = Option<unsafe extern "system" fn(param0: usize, param1: u64) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 4769:1: generic scalar type unsupported
// pub type PSYMBOLSERVERSETOPTIONSWPROC = Option<unsafe extern "system" fn(param0: usize, param1: u64) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 4770:1: generic scalar type unsupported
// pub type PSYMBOLSERVERSTOREFILE = Option<unsafe extern "system" fn(param0: windows_sys::core::PCSTR, param1: windows_sys::core::PCSTR, param2: *mut core::ffi::c_void, param3: u32, param4: u32, param5: windows_sys::core::PCSTR, param6: usize, param7: u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 4771:1: generic scalar type unsupported
// pub type PSYMBOLSERVERSTOREFILEW = Option<unsafe extern "system" fn(param0: windows_sys::core::PCWSTR, param1: windows_sys::core::PCWSTR, param2: *mut core::ffi::c_void, param3: u32, param4: u32, param5: windows_sys::core::PCWSTR, param6: usize, param7: u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 4772:1: generic scalar type unsupported
// pub type PSYMBOLSERVERSTORESUPPLEMENT = Option<unsafe extern "system" fn(param0: windows_sys::core::PCSTR, param1: windows_sys::core::PCSTR, param2: windows_sys::core::PCSTR, param3: windows_sys::core::PCSTR, param4: usize, param5: u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 4773:1: generic scalar type unsupported
// pub type PSYMBOLSERVERSTORESUPPLEMENTW = Option<unsafe extern "system" fn(param0: windows_sys::core::PCWSTR, param1: windows_sys::core::PCWSTR, param2: windows_sys::core::PCWSTR, param3: windows_sys::core::PCWSTR, param4: usize, param5: u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 4774:1: generic scalar type unsupported
// pub type PSYMBOLSERVERVERSION = Option<unsafe extern "system" fn() -> u32>;

// UNSUPPORTED Rust 4775:1: generic scalar type unsupported
// pub type PSYMBOLSERVERWEXPROC = Option<unsafe extern "system" fn(param0: windows_sys::core::PCWSTR, param1: windows_sys::core::PCWSTR, param2: *mut core::ffi::c_void, param3: u32, param4: u32, param5: windows_sys::core::PCWSTR, param6: *mut SYMSRV_EXTENDED_OUTPUT_DATA) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 4776:1: generic scalar type unsupported
// pub type PSYMBOL_FUNCENTRY_CALLBACK = Option<unsafe extern "system" fn(hprocess: super::super::super::Foundation::HANDLE, addrbase: u32, usercontext: *const core::ffi::c_void) -> *mut core::ffi::c_void>;

// UNSUPPORTED Rust 4777:1: generic scalar type unsupported
// pub type PSYMBOL_FUNCENTRY_CALLBACK64 = Option<unsafe extern "system" fn(hprocess: super::super::super::Foundation::HANDLE, addrbase: u64, usercontext: u64) -> *mut core::ffi::c_void>;

// UNSUPPORTED Rust 4778:1: attribute cfg requires explicit semantics/configuration
// #[cfg(target_arch = "x86")]
// pub type PSYMBOL_REGISTERED_CALLBACK = Option<unsafe extern "system" fn(hprocess: super::super::super::Foundation::HANDLE, actioncode: u32, callbackdata: *const core::ffi::c_void, usercontext: *const core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 4780:1: generic scalar type unsupported
// pub type PSYMBOL_REGISTERED_CALLBACK64 = Option<unsafe extern "system" fn(hprocess: super::super::super::Foundation::HANDLE, actioncode: u32, callbackdata: u64, usercontext: u64) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 4781:1: generic scalar type unsupported
// pub type PSYM_ENUMERATESYMBOLS_CALLBACK = Option<unsafe extern "system" fn(psyminfo: *const SYMBOL_INFO, symbolsize: u32, usercontext: *const core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 4782:1: generic scalar type unsupported
// pub type PSYM_ENUMERATESYMBOLS_CALLBACKW = Option<unsafe extern "system" fn(psyminfo: *const SYMBOL_INFOW, symbolsize: u32, usercontext: *const core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 4783:1: generic scalar type unsupported
// pub type PSYM_ENUMLINES_CALLBACK = Option<unsafe extern "system" fn(lineinfo: *const SRCCODEINFO, usercontext: *const core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 4784:1: generic scalar type unsupported
// pub type PSYM_ENUMLINES_CALLBACKW = Option<unsafe extern "system" fn(lineinfo: *const SRCCODEINFOW, usercontext: *const core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 4785:1: attribute cfg requires explicit semantics/configuration
// #[cfg(target_arch = "x86")]
// pub type PSYM_ENUMMODULES_CALLBACK = Option<unsafe extern "system" fn(modulename: windows_sys::core::PCSTR, baseofdll: u32, usercontext: *const core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 4787:1: generic scalar type unsupported
// pub type PSYM_ENUMMODULES_CALLBACK64 = Option<unsafe extern "system" fn(modulename: windows_sys::core::PCSTR, baseofdll: u64, usercontext: *const core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 4788:1: generic scalar type unsupported
// pub type PSYM_ENUMMODULES_CALLBACKW64 = Option<unsafe extern "system" fn(modulename: windows_sys::core::PCWSTR, baseofdll: u64, usercontext: *const core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 4789:1: generic scalar type unsupported
// pub type PSYM_ENUMPROCESSES_CALLBACK = Option<unsafe extern "system" fn(hprocess: super::super::super::Foundation::HANDLE, usercontext: *const core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 4790:1: generic scalar type unsupported
// pub type PSYM_ENUMSOURCEFILES_CALLBACK = Option<unsafe extern "system" fn(psourcefile: *const SOURCEFILE, usercontext: *const core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 4791:1: generic scalar type unsupported
// pub type PSYM_ENUMSOURCEFILES_CALLBACKW = Option<unsafe extern "system" fn(psourcefile: *const SOURCEFILEW, usercontext: *const core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 4792:1: attribute cfg requires explicit semantics/configuration
// #[cfg(target_arch = "x86")]
// pub type PSYM_ENUMSYMBOLS_CALLBACK = Option<unsafe extern "system" fn(symbolname: windows_sys::core::PCSTR, symboladdress: u32, symbolsize: u32, usercontext: *const core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 4794:1: generic scalar type unsupported
// pub type PSYM_ENUMSYMBOLS_CALLBACK64 = Option<unsafe extern "system" fn(symbolname: windows_sys::core::PCSTR, symboladdress: u64, symbolsize: u32, usercontext: *const core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 4795:1: generic scalar type unsupported
// pub type PSYM_ENUMSYMBOLS_CALLBACK64W = Option<unsafe extern "system" fn(symbolname: windows_sys::core::PCWSTR, symboladdress: u64, symbolsize: u32, usercontext: *const core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 4796:1: attribute cfg requires explicit semantics/configuration
// #[cfg(target_arch = "x86")]
// pub type PSYM_ENUMSYMBOLS_CALLBACKW = Option<unsafe extern "system" fn(symbolname: windows_sys::core::PCWSTR, symboladdress: u32, symbolsize: u32, usercontext: *const core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 4798:1: attribute cfg requires explicit semantics/configuration
// #[cfg(target_arch = "x86")]
// pub type PTRANSLATE_ADDRESS_ROUTINE = Option<unsafe extern "system" fn(hprocess: super::super::super::Foundation::HANDLE, hthread: super::super::super::Foundation::HANDLE, lpaddr: *mut ADDRESS) -> u32>;

// UNSUPPORTED Rust 4800:1: generic scalar type unsupported
// pub type PTRANSLATE_ADDRESS_ROUTINE64 = Option<unsafe extern "system" fn(hprocess: super::super::super::Foundation::HANDLE, hthread: super::super::super::Foundation::HANDLE, lpaddr: *const ADDRESS64) -> u64>;

// UNSUPPORTED Rust 4801:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Kernel")]
// pub type PVECTORED_EXCEPTION_HANDLER = Option<unsafe extern "system" fn(exceptioninfo: *mut EXCEPTION_POINTERS) -> i32>;

// UNSUPPORTED Rust 4803:1: generic scalar type unsupported
// pub type PWAITCHAINCALLBACK = Option<unsafe extern "system" fn(wcthandle: *mut core::ffi::c_void, context: usize, callbackstatus: u32, nodecount: *mut u32, nodeinfoarray: *mut WAITCHAIN_NODE_INFO, iscycle: *mut windows_sys::core::BOOL)>;

public const val `ProcessVmCountersStream`: `MINIDUMP_STREAM_TYPE` = 22;
public const val `QUOTA_UNDERFLOW`: `BUGCHECK_ERROR` = 33u;
public const val `RAMDISK_BOOT_INITIALIZATION_FAILED`: `BUGCHECK_ERROR` = 248u;
public const val `RDR_FILE_SYSTEM`: `BUGCHECK_ERROR` = 39u;
public const val `RECOM_DRIVER`: `BUGCHECK_ERROR` = 132u;
public const val `RECURSIVE_MACHINE_CHECK`: `BUGCHECK_ERROR` = 251u;
public const val `RECURSIVE_NMI`: `BUGCHECK_ERROR` = 273u;
public const val `REFERENCE_BY_POINTER`: `BUGCHECK_ERROR` = 24u;
public const val `REFMON_INITIALIZATION_FAILED`: `BUGCHECK_ERROR` = 108u;
public const val `REFS_FILE_SYSTEM`: `BUGCHECK_ERROR` = 329u;
public const val `REF_UNKNOWN_LOGON_SESSION`: `BUGCHECK_ERROR` = 71u;
public const val `REGISTRY_CALLBACK_DRIVER_EXCEPTION`: `BUGCHECK_ERROR` = 319u;
public const val `REGISTRY_ERROR`: `BUGCHECK_ERROR` = 81u;
public const val `REGISTRY_FILTER_DRIVER_EXCEPTION`: `BUGCHECK_ERROR` = 309u;
public const val `REGISTRY_LIVE_DUMP`: `BUGCHECK_ERROR` = 487u;
public const val `RESERVE_QUEUE_OVERFLOW`: `BUGCHECK_ERROR` = 255u;
public const val `RESOURCE_NOT_OWNED`: `BUGCHECK_ERROR` = 227u;
public const val `RESOURCE_OWNER_POINTER_INVALID`: `BUGCHECK_ERROR` = 306u;
// UNSUPPORTED Rust 4822:1: non-scalar type Ptr unsupported
// pub const RESTORE_LAST_ERROR_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("RestoreLastError");

// UNSUPPORTED Rust 4823:1: non-scalar type Ptr unsupported
// pub const RESTORE_LAST_ERROR_NAME_A: windows_sys::core::PCSTR = windows_sys::core::s!("RestoreLastError");

// UNSUPPORTED Rust 4824:1: non-scalar type Ptr unsupported
// pub const RESTORE_LAST_ERROR_NAME_W: windows_sys::core::PCWSTR = windows_sys::core::w!("RestoreLastError");

public const val `RIP_EVENT`: `DEBUG_EVENT_CODE` = 9u;
// UNSUPPORTED Rust 4826:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct RIP_INFO {
//     pub dwError: u32,
//     pub dwType: RIP_INFO_TYPE,
// }

public typealias `RIP_INFO_TYPE` = UInt;
public typealias `RTL_VIRTUAL_UNWIND_HANDLER_TYPE` = UInt;
public const val `ReadMemoryFailureCallback`: `MINIDUMP_CALLBACK_TYPE` = 14;
public const val `RemoveMemoryCallback`: `MINIDUMP_CALLBACK_TYPE` = 9;
public const val `ReservedStream0`: `MINIDUMP_STREAM_TYPE` = 1;
public const val `ReservedStream1`: `MINIDUMP_STREAM_TYPE` = 2;
public const val `SAVER_ACCOUNTPROVSVCINITFAILURE`: `BUGCHECK_ERROR` = 61461u;
public const val `SAVER_APPBARDISMISSAL`: `BUGCHECK_ERROR` = 61454u;
public const val `SAVER_APPLISTUNREACHABLE`: `BUGCHECK_ERROR` = 61456u;
public const val `SAVER_AUDIODRIVERHANG`: `BUGCHECK_ERROR` = 62464u;
public const val `SAVER_AUXILIARYFULLDUMP`: `BUGCHECK_ERROR` = 61460u;
public const val `SAVER_BATTERYPULLOUT`: `BUGCHECK_ERROR` = 62720u;
public const val `SAVER_BLANKSCREEN`: `BUGCHECK_ERROR` = 61442u;
public const val `SAVER_CALLDISMISSAL`: `BUGCHECK_ERROR` = 61453u;
public const val `SAVER_CAPTURESERVICE`: `BUGCHECK_ERROR` = 63488u;
public const val `SAVER_CHROMEPROCESSCRASH`: `BUGCHECK_ERROR` = 61450u;
public const val `SAVER_DEVICEUPDATEUNSPECIFIED`: `BUGCHECK_ERROR` = 62208u;
public const val `SAVER_GRAPHICS`: `BUGCHECK_ERROR` = 61448u;
public const val `SAVER_INPUT`: `BUGCHECK_ERROR` = 61443u;
public const val `SAVER_MEDIACORETESTHANG`: `BUGCHECK_ERROR` = 62976u;
public const val `SAVER_MTBFCOMMANDHANG`: `BUGCHECK_ERROR` = 61697u;
public const val `SAVER_MTBFCOMMANDTIMEOUT`: `BUGCHECK_ERROR` = 789u;
public const val `SAVER_MTBFIOERROR`: `BUGCHECK_ERROR` = 61699u;
public const val `SAVER_MTBFPASSBUGCHECK`: `BUGCHECK_ERROR` = 61698u;
public const val `SAVER_NAVIGATIONMODEL`: `BUGCHECK_ERROR` = 61446u;
public const val `SAVER_NAVSERVERTIMEOUT`: `BUGCHECK_ERROR` = 61449u;
public const val `SAVER_NONRESPONSIVEPROCESS`: `BUGCHECK_ERROR` = 404u;
public const val `SAVER_NOTIFICATIONDISMISSAL`: `BUGCHECK_ERROR` = 61451u;
public const val `SAVER_OUTOFMEMORY`: `BUGCHECK_ERROR` = 61447u;
public const val `SAVER_RENDERMOBILEUIOOM`: `BUGCHECK_ERROR` = 61953u;
public const val `SAVER_RENDERTHREADHANG`: `BUGCHECK_ERROR` = 61952u;
public const val `SAVER_REPORTNOTIFICATIONFAILURE`: `BUGCHECK_ERROR` = 61457u;
public const val `SAVER_RESOURCEMANAGEMENT`: `BUGCHECK_ERROR` = 63232u;
public const val `SAVER_RILADAPTATIONCRASH`: `BUGCHECK_ERROR` = 61455u;
public const val `SAVER_RPCFAILURE`: `BUGCHECK_ERROR` = 61459u;
public const val `SAVER_SICKAPPLICATION`: `BUGCHECK_ERROR` = 34918u;
public const val `SAVER_SPEECHDISMISSAL`: `BUGCHECK_ERROR` = 61452u;
public const val `SAVER_STARTNOTVISIBLE`: `BUGCHECK_ERROR` = 61445u;
public const val `SAVER_UNEXPECTEDSHUTDOWN`: `BUGCHECK_ERROR` = 61458u;
public const val `SAVER_UNSPECIFIED`: `BUGCHECK_ERROR` = 61440u;
public const val `SAVER_WAITFORSHELLREADY`: `BUGCHECK_ERROR` = 63744u;
public const val `SAVER_WATCHDOG`: `BUGCHECK_ERROR` = 61444u;
public const val `SCSI_DISK_DRIVER_INTERNAL`: `BUGCHECK_ERROR` = 45u;
public const val `SCSI_VERIFIER_DETECTED_VIOLATION`: `BUGCHECK_ERROR` = 241u;
public const val `SDBUS_INTERNAL_ERROR`: `BUGCHECK_ERROR` = 346u;
public const val `SECURE_BOOT_VIOLATION`: `BUGCHECK_ERROR` = 325u;
public const val `SECURE_FAULT_UNHANDLED`: `BUGCHECK_ERROR` = 397u;
public const val `SECURE_KERNEL_ERROR`: `BUGCHECK_ERROR` = 395u;
public const val `SECURE_PCI_CONFIG_SPACE_ACCESS_VIOLATION`: `BUGCHECK_ERROR` = 490u;
public const val `SECURITY1_INITIALIZATION_FAILED`: `BUGCHECK_ERROR` = 99u;
public const val `SECURITY_INITIALIZATION_FAILED`: `BUGCHECK_ERROR` = 95u;
public const val `SECURITY_SYSTEM`: `BUGCHECK_ERROR` = 41u;
public const val `SEM_ALL_ERRORS`: `THREAD_ERROR_MODE` = 0u;
public const val `SEM_FAILCRITICALERRORS`: `THREAD_ERROR_MODE` = 1u;
public const val `SEM_NOALIGNMENTFAULTEXCEPT`: `THREAD_ERROR_MODE` = 4u;
public const val `SEM_NOGPFAULTERRORBOX`: `THREAD_ERROR_MODE` = 2u;
public const val `SEM_NOOPENFILEERRORBOX`: `THREAD_ERROR_MODE` = 32768u;
public const val `SERIAL_DRIVER_INTERNAL`: `BUGCHECK_ERROR` = 56u;
public const val `SESSION1_INITIALIZATION_FAILED`: `BUGCHECK_ERROR` = 109u;
public const val `SESSION_HAS_VALID_POOL_ON_EXIT`: `BUGCHECK_ERROR` = 171u;
public const val `SESSION_HAS_VALID_SPECIAL_POOL_ON_EXIT`: `BUGCHECK_ERROR` = 236u;
public const val `SESSION_HAS_VALID_VIEWS_ON_EXIT`: `BUGCHECK_ERROR` = 186u;
public const val `SETUP_FAILURE`: `BUGCHECK_ERROR` = 133u;
public const val `SET_ENV_VAR_FAILED`: `BUGCHECK_ERROR` = 91u;
public const val `SET_OF_INVALID_CONTEXT`: `BUGCHECK_ERROR` = 48u;
public const val `SHARED_RESOURCE_CONV_ERROR`: `BUGCHECK_ERROR` = 31u;
public const val `SILO_CORRUPT`: `BUGCHECK_ERROR` = 394u;
public const val `SLE_ERROR`: `RIP_INFO_TYPE` = 1u;
public const val `SLE_MINORERROR`: `RIP_INFO_TYPE` = 2u;
public const val `SLE_WARNING`: `RIP_INFO_TYPE` = 3u;
public const val `SLMFLAG_ALT_INDEX`: `SYM_LOAD_FLAGS` = 2u;
public const val `SLMFLAG_NONE`: `SYM_LOAD_FLAGS` = 0u;
public const val `SLMFLAG_NO_SYMBOLS`: `SYM_LOAD_FLAGS` = 4u;
public const val `SLMFLAG_VIRTUAL`: `SYM_LOAD_FLAGS` = 1u;
public const val `SMB_REDIRECTOR_LIVEDUMP`: `BUGCHECK_ERROR` = 423u;
public const val `SMB_SERVER_LIVEDUMP`: `BUGCHECK_ERROR` = 405u;
public const val `SOC_CRITICAL_DEVICE_REMOVED`: `BUGCHECK_ERROR` = 334u;
public const val `SOC_SUBSYSTEM_FAILURE`: `BUGCHECK_ERROR` = 331u;
public const val `SOC_SUBSYSTEM_FAILURE_LIVEDUMP`: `BUGCHECK_ERROR` = 349u;
public const val `SOFT_RESTART_FATAL_ERROR`: `BUGCHECK_ERROR` = 112u;
// UNSUPPORTED Rust 4912:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SOURCEFILE {
//     pub ModBase: u64,
//     pub FileName: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 4918:1: declaration Impl has no candidate rule
// impl Default for SOURCEFILE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4923:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SOURCEFILEW {
//     pub ModBase: u64,
//     pub FileName: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 4929:1: declaration Impl has no candidate rule
// impl Default for SOURCEFILEW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SPECIAL_POOL_DETECTED_MEMORY_CORRUPTION`: `BUGCHECK_ERROR` = 193u;
public const val `SPIN_LOCK_ALREADY_OWNED`: `BUGCHECK_ERROR` = 15u;
public const val `SPIN_LOCK_INIT_FAILURE`: `BUGCHECK_ERROR` = 129u;
public const val `SPIN_LOCK_NOT_OWNED`: `BUGCHECK_ERROR` = 16u;
public const val `SPLITSYM_EXTRACT_ALL`: UInt = 2u;
public const val `SPLITSYM_REMOVE_PRIVATE`: UInt = 1u;
public const val `SPLITSYM_SYMBOLPATH_IS_SRC`: UInt = 4u;
// UNSUPPORTED Rust 4941:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SRCCODEINFO {
//     pub SizeOfStruct: u32,
//     pub Key: *mut core::ffi::c_void,
//     pub ModBase: u64,
//     pub Obj: [i8; 261],
//     pub FileName: [i8; 261],
//     pub LineNumber: u32,
//     pub Address: u64,
// }

// UNSUPPORTED Rust 4952:1: declaration Impl has no candidate rule
// impl Default for SRCCODEINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4957:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SRCCODEINFOW {
//     pub SizeOfStruct: u32,
//     pub Key: *mut core::ffi::c_void,
//     pub ModBase: u64,
//     pub Obj: [u16; 261],
//     pub FileName: [u16; 261],
//     pub LineNumber: u32,
//     pub Address: u64,
// }

// UNSUPPORTED Rust 4968:1: declaration Impl has no candidate rule
// impl Default for SRCCODEINFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SSRVACTION_CHECKSUMSTATUS`: UInt = 8u;
public const val `SSRVACTION_EVENT`: UInt = 3u;
public const val `SSRVACTION_EVENTW`: UInt = 4u;
public const val `SSRVACTION_HTTPSTATUS`: UInt = 6u;
public const val `SSRVACTION_QUERYCANCEL`: UInt = 2u;
public const val `SSRVACTION_SIZE`: UInt = 5u;
public const val `SSRVACTION_TRACE`: UInt = 1u;
public const val `SSRVACTION_XMLOUTPUT`: UInt = 7u;
public const val `SSRVOPT_CALLBACK`: UInt = 1u;
public const val `SSRVOPT_CALLBACKW`: UInt = 65536u;
public const val `SSRVOPT_DISABLE_PING_HOST`: UInt = 67108864u;
public const val `SSRVOPT_DISABLE_TIMEOUT`: UInt = 134217728u;
public const val `SSRVOPT_DONT_UNCOMPRESS`: UInt = 33554432u;
public const val `SSRVOPT_DOWNSTREAM_STORE`: UInt = 8192u;
public const val `SSRVOPT_DWORD`: `SYM_FIND_ID_OPTION` = 2u;
public const val `SSRVOPT_DWORDPTR`: `SYM_FIND_ID_OPTION` = 4u;
public const val `SSRVOPT_ENABLE_COMM_MSG`: UInt = 268435456u;
public const val `SSRVOPT_FAVOR_COMPRESSED`: UInt = 2097152u;
public const val `SSRVOPT_FLAT_DEFAULT_STORE`: UInt = 131072u;
public const val `SSRVOPT_GETPATH`: UInt = 64u;
public const val `SSRVOPT_GUIDPTR`: `SYM_FIND_ID_OPTION` = 8u;
public const val `SSRVOPT_MAX`: UInt = 2147483648u;
public const val `SSRVOPT_MESSAGE`: UInt = 524288u;
public const val `SSRVOPT_NOCOPY`: UInt = 64u;
public const val `SSRVOPT_OLDGUIDPTR`: UInt = 16u;
public const val `SSRVOPT_OVERWRITE`: UInt = 16384u;
public const val `SSRVOPT_PARAMTYPE`: UInt = 256u;
public const val `SSRVOPT_PARENTWIN`: UInt = 128u;
public const val `SSRVOPT_PROXY`: UInt = 4096u;
public const val `SSRVOPT_PROXYW`: UInt = 262144u;
public const val `SSRVOPT_RESETTOU`: UInt = 32768u;
public const val `SSRVOPT_RETRY_APP_HANG`: UInt = 2147483648u;
public const val `SSRVOPT_SECURE`: UInt = 512u;
public const val `SSRVOPT_SERVICE`: UInt = 1048576u;
public const val `SSRVOPT_SETCONTEXT`: UInt = 2048u;
public const val `SSRVOPT_STRING`: UInt = 4194304u;
public const val `SSRVOPT_TRACE`: UInt = 1024u;
public const val `SSRVOPT_UNATTENDED`: UInt = 32u;
public const val `SSRVOPT_URI_FILTER`: UInt = 536870912u;
public const val `SSRVOPT_URI_TIERS`: UInt = 1073741824u;
public const val `SSRVOPT_WINHTTP`: UInt = 8388608u;
public const val `SSRVOPT_WININET`: UInt = 16777216u;
public const val `SSRVURI_ALL`: UInt = 255u;
public const val `SSRVURI_COMPRESSED`: UInt = 2u;
public const val `SSRVURI_FILEPTR`: UInt = 4u;
public const val `SSRVURI_HTTP_COMPRESSED`: UInt = 2u;
public const val `SSRVURI_HTTP_FILEPTR`: UInt = 4u;
public const val `SSRVURI_HTTP_MASK`: UInt = 15u;
public const val `SSRVURI_HTTP_NORMAL`: UInt = 1u;
public const val `SSRVURI_NORMAL`: UInt = 1u;
public const val `SSRVURI_UNC_COMPRESSED`: UInt = 32u;
public const val `SSRVURI_UNC_FILEPTR`: UInt = 64u;
public const val `SSRVURI_UNC_MASK`: UInt = 240u;
public const val `SSRVURI_UNC_NORMAL`: UInt = 16u;
// UNSUPPORTED Rust 5027:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct STACKFRAME {
//     pub AddrPC: ADDRESS,
//     pub AddrReturn: ADDRESS,
//     pub AddrFrame: ADDRESS,
//     pub AddrStack: ADDRESS,
//     pub FuncTableEntry: *mut core::ffi::c_void,
//     pub Params: [u32; 4],
//     pub Far: windows_sys::core::BOOL,
//     pub Virtual: windows_sys::core::BOOL,
//     pub Reserved: [u32; 3],
//     pub KdHelp: KDHELP,
//     pub AddrBStore: ADDRESS,
// }

// UNSUPPORTED Rust 5043:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for STACKFRAME {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5049:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct STACKFRAME64 {
//     pub AddrPC: ADDRESS64,
//     pub AddrReturn: ADDRESS64,
//     pub AddrFrame: ADDRESS64,
//     pub AddrStack: ADDRESS64,
//     pub AddrBStore: ADDRESS64,
//     pub FuncTableEntry: *mut core::ffi::c_void,
//     pub Params: [u64; 4],
//     pub Far: windows_sys::core::BOOL,
//     pub Virtual: windows_sys::core::BOOL,
//     pub Reserved: [u64; 3],
//     pub KdHelp: KDHELP64,
// }

// UNSUPPORTED Rust 5064:1: declaration Impl has no candidate rule
// impl Default for STACKFRAME64 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5069:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct STACKFRAME_EX {
//     pub AddrPC: ADDRESS64,
//     pub AddrReturn: ADDRESS64,
//     pub AddrFrame: ADDRESS64,
//     pub AddrStack: ADDRESS64,
//     pub AddrBStore: ADDRESS64,
//     pub FuncTableEntry: *mut core::ffi::c_void,
//     pub Params: [u64; 4],
//     pub Far: windows_sys::core::BOOL,
//     pub Virtual: windows_sys::core::BOOL,
//     pub Reserved: [u64; 3],
//     pub KdHelp: KDHELP64,
//     pub StackFrameSize: u32,
//     pub InlineFrameContext: u32,
// }

// UNSUPPORTED Rust 5086:1: declaration Impl has no candidate rule
// impl Default for STACKFRAME_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `STORAGE_DEVICE_ABNORMALITY_DETECTED`: `BUGCHECK_ERROR` = 320u;
public const val `STORAGE_MINIPORT_ERROR`: `BUGCHECK_ERROR` = 240u;
public const val `STORE_DATA_STRUCTURE_CORRUPTION`: `BUGCHECK_ERROR` = 455u;
public const val `STREAMS_INTERNAL_ERROR`: `BUGCHECK_ERROR` = 75u;
// UNSUPPORTED Rust 5095:1: generic scalar type unsupported
// pub type SYMADDSOURCESTREAM = Option<unsafe extern "system" fn(param0: super::super::super::Foundation::HANDLE, param1: u64, param2: windows_sys::core::PCSTR, param3: *mut u8, param4: usize) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 5096:1: generic scalar type unsupported
// pub type SYMADDSOURCESTREAMA = Option<unsafe extern "system" fn(param0: super::super::super::Foundation::HANDLE, param1: u64, param2: windows_sys::core::PCSTR, param3: *mut u8, param4: usize) -> windows_sys::core::BOOL>;

public const val `SYMBOLIC_INITIALIZATION_FAILED`: `BUGCHECK_ERROR` = 100u;
// UNSUPPORTED Rust 5098:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SYMBOL_INFO {
//     pub SizeOfStruct: u32,
//     pub TypeIndex: u32,
//     pub Reserved: [u64; 2],
//     pub Index: u32,
//     pub Size: u32,
//     pub ModBase: u64,
//     pub Flags: SYMBOL_INFO_FLAGS,
//     pub Value: u64,
//     pub Address: u64,
//     pub Register: u32,
//     pub Scope: u32,
//     pub Tag: u32,
//     pub NameLen: u32,
//     pub MaxNameLen: u32,
//     pub Name: [i8; 1],
// }

// UNSUPPORTED Rust 5117:1: declaration Impl has no candidate rule
// impl Default for SYMBOL_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5122:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SYMBOL_INFOW {
//     pub SizeOfStruct: u32,
//     pub TypeIndex: u32,
//     pub Reserved: [u64; 2],
//     pub Index: u32,
//     pub Size: u32,
//     pub ModBase: u64,
//     pub Flags: SYMBOL_INFO_FLAGS,
//     pub Value: u64,
//     pub Address: u64,
//     pub Register: u32,
//     pub Scope: u32,
//     pub Tag: u32,
//     pub NameLen: u32,
//     pub MaxNameLen: u32,
//     pub Name: [u16; 1],
// }

// UNSUPPORTED Rust 5141:1: declaration Impl has no candidate rule
// impl Default for SYMBOL_INFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `SYMBOL_INFO_FLAGS` = UInt;
// UNSUPPORTED Rust 5147:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SYMBOL_INFO_PACKAGE {
//     pub si: SYMBOL_INFO,
//     pub name: [i8; 2001],
// }

// UNSUPPORTED Rust 5153:1: declaration Impl has no candidate rule
// impl Default for SYMBOL_INFO_PACKAGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5158:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SYMBOL_INFO_PACKAGEW {
//     pub si: SYMBOL_INFOW,
//     pub name: [u16; 2001],
// }

// UNSUPPORTED Rust 5164:1: declaration Impl has no candidate rule
// impl Default for SYMBOL_INFO_PACKAGEW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SYMENUM_OPTIONS_DEFAULT`: UInt = 1u;
public const val `SYMENUM_OPTIONS_INLINE`: UInt = 2u;
public const val `SYMFLAG_CLR_TOKEN`: `SYMBOL_INFO_FLAGS` = 262144u;
public const val `SYMFLAG_CONSTANT`: `SYMBOL_INFO_FLAGS` = 256u;
public const val `SYMFLAG_EXPORT`: `SYMBOL_INFO_FLAGS` = 512u;
public const val `SYMFLAG_FIXUP_ARM64X`: UInt = 16777216u;
public const val `SYMFLAG_FORWARDER`: `SYMBOL_INFO_FLAGS` = 1024u;
public const val `SYMFLAG_FRAMEREL`: `SYMBOL_INFO_FLAGS` = 32u;
public const val `SYMFLAG_FUNCTION`: `SYMBOL_INFO_FLAGS` = 2048u;
public const val `SYMFLAG_FUNC_NO_RETURN`: UInt = 1048576u;
public const val `SYMFLAG_GLOBAL`: UInt = 33554432u;
public const val `SYMFLAG_ILREL`: `SYMBOL_INFO_FLAGS` = 65536u;
public const val `SYMFLAG_LOCAL`: `SYMBOL_INFO_FLAGS` = 128u;
public const val `SYMFLAG_METADATA`: `SYMBOL_INFO_FLAGS` = 131072u;
public const val `SYMFLAG_NULL`: UInt = 524288u;
public const val `SYMFLAG_PARAMETER`: `SYMBOL_INFO_FLAGS` = 64u;
public const val `SYMFLAG_PUBLIC_CODE`: UInt = 4194304u;
public const val `SYMFLAG_REGISTER`: `SYMBOL_INFO_FLAGS` = 8u;
public const val `SYMFLAG_REGREL`: `SYMBOL_INFO_FLAGS` = 16u;
public const val `SYMFLAG_REGREL_ALIASINDIR`: UInt = 8388608u;
public const val `SYMFLAG_RESET`: UInt = 2147483648u;
public const val `SYMFLAG_SLOT`: `SYMBOL_INFO_FLAGS` = 32768u;
public const val `SYMFLAG_SYNTHETIC_ZEROBASE`: UInt = 2097152u;
public const val `SYMFLAG_THUNK`: `SYMBOL_INFO_FLAGS` = 8192u;
public const val `SYMFLAG_TLSREL`: `SYMBOL_INFO_FLAGS` = 16384u;
public const val `SYMFLAG_VALUEPRESENT`: `SYMBOL_INFO_FLAGS` = 1u;
public const val `SYMFLAG_VIRTUAL`: `SYMBOL_INFO_FLAGS` = 4096u;
public const val `SYMF_CONSTANT`: UInt = 256u;
public const val `SYMF_EXPORT`: UInt = 512u;
public const val `SYMF_FORWARDER`: UInt = 1024u;
public const val `SYMF_FRAMEREL`: UInt = 32u;
public const val `SYMF_FUNCTION`: UInt = 2048u;
public const val `SYMF_LOCAL`: UInt = 128u;
public const val `SYMF_OMAP_GENERATED`: UInt = 1u;
public const val `SYMF_OMAP_MODIFIED`: UInt = 2u;
public const val `SYMF_PARAMETER`: UInt = 64u;
public const val `SYMF_REGISTER`: UInt = 8u;
public const val `SYMF_REGREL`: UInt = 16u;
public const val `SYMF_THUNK`: UInt = 8192u;
public const val `SYMF_TLSREL`: UInt = 16384u;
public const val `SYMF_VIRTUAL`: UInt = 4096u;
public const val `SYMOPT_ALLOW_ABSOLUTE_SYMBOLS`: UInt = 2048u;
public const val `SYMOPT_ALLOW_ZERO_ADDRESS`: UInt = 16777216u;
public const val `SYMOPT_AUTO_PUBLICS`: UInt = 65536u;
public const val `SYMOPT_CASE_INSENSITIVE`: UInt = 1u;
public const val `SYMOPT_DEBUG`: UInt = 2147483648u;
public const val `SYMOPT_DEFERRED_LOADS`: UInt = 4u;
public const val `SYMOPT_DISABLE_FAST_SYMBOLS`: UInt = 268435456u;
public const val `SYMOPT_DISABLE_SRVSTAR_ON_STARTUP`: UInt = 1073741824u;
public const val `SYMOPT_DISABLE_SYMSRV_AUTODETECT`: UInt = 33554432u;
public const val `SYMOPT_DISABLE_SYMSRV_TIMEOUT`: UInt = 536870912u;
public const val `SYMOPT_EXACT_SYMBOLS`: UInt = 1024u;
public const val `SYMOPT_EX_DISABLEACCESSTIMEUPDATE`: `IMAGEHLP_EXTENDED_OPTIONS` = 0;
public const val `SYMOPT_EX_LASTVALIDDEBUGDIRECTORY`: `IMAGEHLP_EXTENDED_OPTIONS` = 1;
public const val `SYMOPT_EX_MAX`: `IMAGEHLP_EXTENDED_OPTIONS` = 4;
public const val `SYMOPT_EX_NEVERLOADSYMBOLS`: `IMAGEHLP_EXTENDED_OPTIONS` = 3;
public const val `SYMOPT_EX_NOIMPLICITPATTERNSEARCH`: `IMAGEHLP_EXTENDED_OPTIONS` = 2;
public const val `SYMOPT_FAIL_CRITICAL_ERRORS`: UInt = 512u;
public const val `SYMOPT_FAVOR_COMPRESSED`: UInt = 8388608u;
public const val `SYMOPT_FLAT_DIRECTORY`: UInt = 4194304u;
public const val `SYMOPT_IGNORE_CVREC`: UInt = 128u;
public const val `SYMOPT_IGNORE_IMAGEDIR`: UInt = 2097152u;
public const val `SYMOPT_IGNORE_NT_SYMPATH`: UInt = 4096u;
public const val `SYMOPT_INCLUDE_32BIT_MODULES`: UInt = 8192u;
public const val `SYMOPT_LOAD_ANYTHING`: UInt = 64u;
public const val `SYMOPT_LOAD_LINES`: UInt = 16u;
public const val `SYMOPT_NO_CPP`: UInt = 8u;
public const val `SYMOPT_NO_IMAGE_SEARCH`: UInt = 131072u;
public const val `SYMOPT_NO_PROMPTS`: UInt = 524288u;
public const val `SYMOPT_NO_PUBLICS`: UInt = 32768u;
public const val `SYMOPT_NO_UNQUALIFIED_LOADS`: UInt = 256u;
public const val `SYMOPT_OMAP_FIND_NEAREST`: UInt = 32u;
public const val `SYMOPT_OVERWRITE`: UInt = 1048576u;
public const val `SYMOPT_PUBLICS_ONLY`: UInt = 16384u;
public const val `SYMOPT_READONLY_CACHE`: UInt = 67108864u;
public const val `SYMOPT_SECURE`: UInt = 262144u;
public const val `SYMOPT_SYMPATH_LAST`: UInt = 134217728u;
public const val `SYMOPT_UNDNAME`: UInt = 2u;
public const val `SYMSEARCH_ALLITEMS`: UInt = 8u;
public const val `SYMSEARCH_GLOBALSONLY`: UInt = 4u;
public const val `SYMSEARCH_MASKOBJS`: UInt = 1u;
public const val `SYMSEARCH_RECURSE`: UInt = 2u;
// UNSUPPORTED Rust 5251:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SYMSRV_EXTENDED_OUTPUT_DATA {
//     pub sizeOfStruct: u32,
//     pub version: u32,
//     pub filePtrMsg: [u16; 261],
// }

// UNSUPPORTED Rust 5258:1: declaration Impl has no candidate rule
// impl Default for SYMSRV_EXTENDED_OUTPUT_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5263:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SYMSRV_INDEX_INFO {
//     pub sizeofstruct: u32,
//     pub file: [i8; 261],
//     pub stripped: windows_sys::core::BOOL,
//     pub timestamp: u32,
//     pub size: u32,
//     pub dbgfile: [i8; 261],
//     pub pdbfile: [i8; 261],
//     pub guid: windows_sys::core::GUID,
//     pub sig: u32,
//     pub age: u32,
// }

// UNSUPPORTED Rust 5277:1: declaration Impl has no candidate rule
// impl Default for SYMSRV_INDEX_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5282:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SYMSRV_INDEX_INFOW {
//     pub sizeofstruct: u32,
//     pub file: [u16; 261],
//     pub stripped: windows_sys::core::BOOL,
//     pub timestamp: u32,
//     pub size: u32,
//     pub dbgfile: [u16; 261],
//     pub pdbfile: [u16; 261],
//     pub guid: windows_sys::core::GUID,
//     pub sig: u32,
//     pub age: u32,
// }

// UNSUPPORTED Rust 5296:1: declaration Impl has no candidate rule
// impl Default for SYMSRV_INDEX_INFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SYMSRV_VERSION`: UInt = 2u;
public const val `SYMSTOREOPT_ALT_INDEX`: UInt = 16u;
public const val `SYMSTOREOPT_COMPRESS`: `SYM_SRV_STORE_FILE_FLAGS` = 1u;
public const val `SYMSTOREOPT_OVERWRITE`: `SYM_SRV_STORE_FILE_FLAGS` = 2u;
public const val `SYMSTOREOPT_PASS_IF_EXISTS`: `SYM_SRV_STORE_FILE_FLAGS` = 64u;
public const val `SYMSTOREOPT_POINTER`: `SYM_SRV_STORE_FILE_FLAGS` = 8u;
public const val `SYMSTOREOPT_RETURNINDEX`: `SYM_SRV_STORE_FILE_FLAGS` = 4u;
public const val `SYMSTOREOPT_UNICODE`: UInt = 32u;
public typealias `SYM_FIND_ID_OPTION` = UInt;
public const val `SYM_INLINE_COMP_DIFFERENT`: UInt = 5u;
public const val `SYM_INLINE_COMP_ERROR`: UInt = 0u;
public const val `SYM_INLINE_COMP_IDENTICAL`: UInt = 1u;
public const val `SYM_INLINE_COMP_STEPIN`: UInt = 2u;
public const val `SYM_INLINE_COMP_STEPOUT`: UInt = 3u;
public const val `SYM_INLINE_COMP_STEPOVER`: UInt = 4u;
public typealias `SYM_LOAD_FLAGS` = UInt;
public typealias `SYM_SRV_STORE_FILE_FLAGS` = UInt;
public const val `SYM_STKWALK_DEFAULT`: UInt = 0u;
public const val `SYM_STKWALK_FORCE_FRAMEPTR`: UInt = 1u;
public const val `SYM_STKWALK_ZEROEXTEND_PTRS`: UInt = 2u;
public typealias `SYM_TYPE` = Int;
public const val `SYNTHETIC_EXCEPTION_UNHANDLED`: `BUGCHECK_ERROR` = 399u;
public const val `SYNTHETIC_WATCHDOG_TIMEOUT`: `BUGCHECK_ERROR` = 458u;
public const val `SYSTEM_EXIT_OWNED_MUTEX`: `BUGCHECK_ERROR` = 57u;
public const val `SYSTEM_IMAGE_BAD_SIGNATURE`: `BUGCHECK_ERROR` = 195u;
public const val `SYSTEM_LICENSE_VIOLATION`: `BUGCHECK_ERROR` = 154u;
public const val `SYSTEM_PTE_MISUSE`: `BUGCHECK_ERROR` = 218u;
public const val `SYSTEM_SCAN_AT_RAISED_IRQL_CAUGHT_IMPROPER_DRIVER_UNLOAD`: `BUGCHECK_ERROR` = 212u;
public const val `SYSTEM_SERVICE_EXCEPTION`: `BUGCHECK_ERROR` = 59u;
public const val `SYSTEM_THREAD_EXCEPTION_NOT_HANDLED`: `BUGCHECK_ERROR` = 126u;
public const val `SYSTEM_THREAD_EXCEPTION_NOT_HANDLED_M`: `BUGCHECK_ERROR` = 268435582u;
public const val `SYSTEM_UNWIND_PREVIOUS_USER`: `BUGCHECK_ERROR` = 58u;
public const val `SecondaryFlagsCallback`: `MINIDUMP_CALLBACK_TYPE` = 15;
public const val `SymCoff`: `SYM_TYPE` = 1;
public const val `SymCv`: `SYM_TYPE` = 2;
public const val `SymDeferred`: `SYM_TYPE` = 5;
public const val `SymDia`: `SYM_TYPE` = 7;
public const val `SymExport`: `SYM_TYPE` = 4;
public const val `SymNone`: `SYM_TYPE` = 0;
public const val `SymPdb`: `SYM_TYPE` = 3;
public const val `SymSym`: `SYM_TYPE` = 6;
public const val `SymVirtual`: `SYM_TYPE` = 8;
public const val `SystemInfoStream`: `MINIDUMP_STREAM_TYPE` = 7;
public const val `SystemMemoryInfoStream`: `MINIDUMP_STREAM_TYPE` = 21;
public const val `TARGET_ATTRIBUTE_PACMASK`: UInt = 1u;
public const val `TARGET_MDL_TOO_SMALL`: `BUGCHECK_ERROR` = 64u;
public const val `TCPIP_AOAC_NIC_ACTIVE_REFERENCE_LEAK`: `BUGCHECK_ERROR` = 336u;
public const val `TELEMETRY_ASSERTS_LIVEDUMP`: `BUGCHECK_ERROR` = 465u;
public const val `TERMINAL_SERVER_DRIVER_MADE_INCORRECT_MEMORY_REFERENCE`: `BUGCHECK_ERROR` = 207u;
public const val `THIRD_PARTY_FILE_SYSTEM_FAILURE`: `BUGCHECK_ERROR` = 264u;
public typealias `THREAD_ERROR_MODE` = UInt;
public const val `THREAD_NOT_MUTEX_OWNER`: `BUGCHECK_ERROR` = 17u;
public const val `THREAD_STUCK_IN_DEVICE_DRIVER`: `BUGCHECK_ERROR` = 234u;
public const val `THREAD_STUCK_IN_DEVICE_DRIVER_M`: `BUGCHECK_ERROR` = 268435690u;
public const val `THREAD_TERMINATE_HELD_MUTEX`: `BUGCHECK_ERROR` = 1073741962u;
public typealias `THREAD_WRITE_FLAGS` = Int;
public const val `TIMER_OR_DPC_INVALID`: `BUGCHECK_ERROR` = 199u;
public const val `TI_FINDCHILDREN`: `IMAGEHLP_SYMBOL_TYPE_INFO` = 7;
// UNSUPPORTED Rust 5359:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct TI_FINDCHILDREN_PARAMS {
//     pub Count: u32,
//     pub Start: u32,
//     pub ChildId: [u32; 1],
// }

// UNSUPPORTED Rust 5366:1: declaration Impl has no candidate rule
// impl Default for TI_FINDCHILDREN_PARAMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `TI_GET_ADDRESS`: `IMAGEHLP_SYMBOL_TYPE_INFO` = 22;
public const val `TI_GET_ADDRESSOFFSET`: `IMAGEHLP_SYMBOL_TYPE_INFO` = 9;
public const val `TI_GET_ARRAYINDEXTYPEID`: `IMAGEHLP_SYMBOL_TYPE_INFO` = 6;
public const val `TI_GET_BASETYPE`: `IMAGEHLP_SYMBOL_TYPE_INFO` = 5;
public const val `TI_GET_BITPOSITION`: `IMAGEHLP_SYMBOL_TYPE_INFO` = 14;
public const val `TI_GET_CALLING_CONVENTION`: `IMAGEHLP_SYMBOL_TYPE_INFO` = 26;
public const val `TI_GET_CHILDRENCOUNT`: `IMAGEHLP_SYMBOL_TYPE_INFO` = 13;
public const val `TI_GET_CLASSPARENTID`: `IMAGEHLP_SYMBOL_TYPE_INFO` = 18;
public const val `TI_GET_COUNT`: `IMAGEHLP_SYMBOL_TYPE_INFO` = 12;
public const val `TI_GET_DATAKIND`: `IMAGEHLP_SYMBOL_TYPE_INFO` = 8;
public const val `TI_GET_INDIRECTVIRTUALBASECLASS`: `IMAGEHLP_SYMBOL_TYPE_INFO` = 32;
public const val `TI_GET_IS_REFERENCE`: `IMAGEHLP_SYMBOL_TYPE_INFO` = 31;
public const val `TI_GET_LENGTH`: `IMAGEHLP_SYMBOL_TYPE_INFO` = 2;
public const val `TI_GET_LEXICALPARENT`: `IMAGEHLP_SYMBOL_TYPE_INFO` = 21;
public const val `TI_GET_NESTED`: `IMAGEHLP_SYMBOL_TYPE_INFO` = 19;
public const val `TI_GET_OBJECTPOINTERTYPE`: `IMAGEHLP_SYMBOL_TYPE_INFO` = 34;
public const val `TI_GET_OFFSET`: `IMAGEHLP_SYMBOL_TYPE_INFO` = 10;
public const val `TI_GET_SYMINDEX`: `IMAGEHLP_SYMBOL_TYPE_INFO` = 20;
public const val `TI_GET_SYMNAME`: `IMAGEHLP_SYMBOL_TYPE_INFO` = 1;
public const val `TI_GET_SYMTAG`: `IMAGEHLP_SYMBOL_TYPE_INFO` = 0;
public const val `TI_GET_THISADJUST`: `IMAGEHLP_SYMBOL_TYPE_INFO` = 23;
public const val `TI_GET_TYPE`: `IMAGEHLP_SYMBOL_TYPE_INFO` = 3;
public const val `TI_GET_TYPEID`: `IMAGEHLP_SYMBOL_TYPE_INFO` = 4;
public const val `TI_GET_UDTKIND`: `IMAGEHLP_SYMBOL_TYPE_INFO` = 24;
public const val `TI_GET_VALUE`: `IMAGEHLP_SYMBOL_TYPE_INFO` = 11;
public const val `TI_GET_VIRTUALBASECLASS`: `IMAGEHLP_SYMBOL_TYPE_INFO` = 15;
public const val `TI_GET_VIRTUALBASEDISPINDEX`: `IMAGEHLP_SYMBOL_TYPE_INFO` = 30;
public const val `TI_GET_VIRTUALBASEOFFSET`: `IMAGEHLP_SYMBOL_TYPE_INFO` = 29;
public const val `TI_GET_VIRTUALBASEPOINTEROFFSET`: `IMAGEHLP_SYMBOL_TYPE_INFO` = 17;
public const val `TI_GET_VIRTUALBASETABLETYPE`: `IMAGEHLP_SYMBOL_TYPE_INFO` = 33;
public const val `TI_GET_VIRTUALTABLESHAPEID`: `IMAGEHLP_SYMBOL_TYPE_INFO` = 16;
public const val `TI_GTIEX_REQS_VALID`: `IMAGEHLP_SYMBOL_TYPE_INFO` = 28;
public const val `TI_IS_CLOSE_EQUIV_TO`: `IMAGEHLP_SYMBOL_TYPE_INFO` = 27;
public const val `TI_IS_EQUIV_TO`: `IMAGEHLP_SYMBOL_TYPE_INFO` = 25;
public const val `TOO_MANY_RECURSIVE_FAULTS`: `BUGCHECK_ERROR` = 286u;
public const val `TRAP_CAUSE_UNKNOWN`: `BUGCHECK_ERROR` = 18u;
public const val `TTM_FATAL_ERROR`: `BUGCHECK_ERROR` = 411u;
public const val `TTM_WATCHDOG_TIMEOUT`: `BUGCHECK_ERROR` = 416u;
public const val `ThreadCallback`: `MINIDUMP_CALLBACK_TYPE` = 1;
public const val `ThreadExCallback`: `MINIDUMP_CALLBACK_TYPE` = 2;
public const val `ThreadExListStream`: `MINIDUMP_STREAM_TYPE` = 8;
public const val `ThreadInfoListStream`: `MINIDUMP_STREAM_TYPE` = 17;
public const val `ThreadListStream`: `MINIDUMP_STREAM_TYPE` = 3;
public const val `ThreadNamesStream`: `MINIDUMP_STREAM_TYPE` = 24;
public const val `ThreadWriteBackingStore`: `THREAD_WRITE_FLAGS` = 8;
public const val `ThreadWriteContext`: `THREAD_WRITE_FLAGS` = 4;
public const val `ThreadWriteInstructionWindow`: `THREAD_WRITE_FLAGS` = 16;
public const val `ThreadWriteStack`: `THREAD_WRITE_FLAGS` = 2;
public const val `ThreadWriteThread`: `THREAD_WRITE_FLAGS` = 1;
public const val `ThreadWriteThreadData`: `THREAD_WRITE_FLAGS` = 32;
public const val `ThreadWriteThreadInfo`: `THREAD_WRITE_FLAGS` = 64;
public const val `TokenStream`: `MINIDUMP_STREAM_TYPE` = 19;
public const val `UCMUCSI_FAILURE`: `BUGCHECK_ERROR` = 472u;
public const val `UCMUCSI_LIVEDUMP`: `BUGCHECK_ERROR` = 468u;
public const val `UDFS_FILE_SYSTEM`: `BUGCHECK_ERROR` = 155u;
public const val `UFX_LIVEDUMP`: `BUGCHECK_ERROR` = 408u;
public const val `UNDNAME_32_BIT_DECODE`: UInt = 2048u;
public const val `UNDNAME_COMPLETE`: UInt = 0u;
public const val `UNDNAME_NAME_ONLY`: UInt = 4096u;
public const val `UNDNAME_NO_ACCESS_SPECIFIERS`: UInt = 128u;
public const val `UNDNAME_NO_ALLOCATION_LANGUAGE`: UInt = 16u;
public const val `UNDNAME_NO_ALLOCATION_MODEL`: UInt = 8u;
public const val `UNDNAME_NO_ARGUMENTS`: UInt = 8192u;
public const val `UNDNAME_NO_CV_THISTYPE`: UInt = 64u;
public const val `UNDNAME_NO_FUNCTION_RETURNS`: UInt = 4u;
public const val `UNDNAME_NO_LEADING_UNDERSCORES`: UInt = 1u;
public const val `UNDNAME_NO_MEMBER_TYPE`: UInt = 512u;
public const val `UNDNAME_NO_MS_KEYWORDS`: UInt = 2u;
public const val `UNDNAME_NO_MS_THISTYPE`: UInt = 32u;
public const val `UNDNAME_NO_RETURN_UDT_MODEL`: UInt = 1024u;
public const val `UNDNAME_NO_SPECIAL_SYMS`: UInt = 16384u;
public const val `UNDNAME_NO_THISTYPE`: UInt = 96u;
public const val `UNDNAME_NO_THROW_SIGNATURES`: UInt = 256u;
public const val `UNEXPECTED_INITIALIZATION_CALL`: `BUGCHECK_ERROR` = 51u;
public const val `UNEXPECTED_KERNEL_MODE_TRAP`: `BUGCHECK_ERROR` = 127u;
public const val `UNEXPECTED_KERNEL_MODE_TRAP_M`: `BUGCHECK_ERROR` = 268435583u;
public const val `UNEXPECTED_STORE_EXCEPTION`: `BUGCHECK_ERROR` = 340u;
public const val `UNLOAD_DLL_DEBUG_EVENT`: `DEBUG_EVENT_CODE` = 7u;
// UNSUPPORTED Rust 5449:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct UNLOAD_DLL_DEBUG_INFO {
//     pub lpBaseOfDll: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 5454:1: declaration Impl has no candidate rule
// impl Default for UNLOAD_DLL_DEBUG_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `UNMOUNTABLE_BOOT_VOLUME`: `BUGCHECK_ERROR` = 237u;
public const val `UNSUPPORTED_INSTRUCTION_MODE`: `BUGCHECK_ERROR` = 337u;
public const val `UNSUPPORTED_PROCESSOR`: `BUGCHECK_ERROR` = 93u;
// UNSUPPORTED Rust 5462:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct UNWIND_HISTORY_TABLE {
//     pub Count: u32,
//     pub LocalHint: u8,
//     pub GlobalHint: u8,
//     pub Search: u8,
//     pub Once: u8,
//     pub LowAddress: usize,
//     pub HighAddress: usize,
//     pub Entry: [UNWIND_HISTORY_TABLE_ENTRY; 12],
// }

// UNSUPPORTED Rust 5475:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for UNWIND_HISTORY_TABLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5481:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct UNWIND_HISTORY_TABLE_ENTRY {
//     pub ImageBase: usize,
//     pub FunctionEntry: *mut IMAGE_RUNTIME_FUNCTION_ENTRY,
// }

// UNSUPPORTED Rust 5488:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for UNWIND_HISTORY_TABLE_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5494:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(target_arch = "aarch64")]
// #[derive(Clone, Copy)]
// pub struct UNWIND_HISTORY_TABLE_ENTRY {
//     pub ImageBase: usize,
//     pub FunctionEntry: *mut IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY,
// }

// UNSUPPORTED Rust 5501:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "aarch64")]
// impl Default for UNWIND_HISTORY_TABLE_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `UNWIND_ON_INVALID_STACK`: `BUGCHECK_ERROR` = 427u;
public const val `UNW_FLAG_CHAININFO`: `RTL_VIRTUAL_UNWIND_HANDLER_TYPE` = 4u;
public const val `UNW_FLAG_EHANDLER`: `RTL_VIRTUAL_UNWIND_HANDLER_TYPE` = 1u;
public const val `UNW_FLAG_NHANDLER`: `RTL_VIRTUAL_UNWIND_HANDLER_TYPE` = 0u;
public const val `UNW_FLAG_UHANDLER`: `RTL_VIRTUAL_UNWIND_HANDLER_TYPE` = 2u;
public const val `UP_DRIVER_ON_MP_SYSTEM`: `BUGCHECK_ERROR` = 146u;
public const val `USB4_HARDWARE_VIOLATION`: `BUGCHECK_ERROR` = 496u;
public const val `USB_DRIPS_BLOCKER_SURPRISE_REMOVAL_LIVEDUMP`: `BUGCHECK_ERROR` = 421u;
public const val `USER_MODE_HEALTH_MONITOR`: `BUGCHECK_ERROR` = 158u;
public const val `USER_MODE_HEALTH_MONITOR_LIVEDUMP`: `BUGCHECK_ERROR` = 457u;
public const val `UnloadedModuleListStream`: `MINIDUMP_STREAM_TYPE` = 14;
public const val `UnusedStream`: `MINIDUMP_STREAM_TYPE` = 0;
public typealias `VER_PLATFORM` = UInt;
public const val `VER_PLATFORM_WIN32_NT`: `VER_PLATFORM` = 2u;
public const val `VER_PLATFORM_WIN32_WINDOWS`: `VER_PLATFORM` = 1u;
public const val `VER_PLATFORM_WIN32s`: `VER_PLATFORM` = 0u;
public const val `VHD_BOOT_HOST_VOLUME_NOT_ENOUGH_SPACE`: `BUGCHECK_ERROR` = 310u;
public const val `VHD_BOOT_INITIALIZATION_FAILED`: `BUGCHECK_ERROR` = 303u;
public const val `VIDEO_DRIVER_DEBUG_REPORT_REQUEST`: `BUGCHECK_ERROR` = 1073741997u;
public const val `VIDEO_DRIVER_INIT_FAILURE`: `BUGCHECK_ERROR` = 180u;
public const val `VIDEO_DWMINIT_TIMEOUT_FALLBACK_BDD`: `BUGCHECK_ERROR` = 391u;
public const val `VIDEO_DXGKRNL_BLACK_SCREEN_LIVEDUMP`: `BUGCHECK_ERROR` = 424u;
public const val `VIDEO_DXGKRNL_FATAL_ERROR`: `BUGCHECK_ERROR` = 275u;
public const val `VIDEO_DXGKRNL_LIVEDUMP`: `BUGCHECK_ERROR` = 403u;
public const val `VIDEO_DXGKRNL_SYSMM_FATAL_ERROR`: `BUGCHECK_ERROR` = 484u;
public const val `VIDEO_ENGINE_TIMEOUT_DETECTED`: `BUGCHECK_ERROR` = 321u;
public const val `VIDEO_MEMORY_MANAGEMENT_INTERNAL`: `BUGCHECK_ERROR` = 270u;
public const val `VIDEO_MINIPORT_BLACK_SCREEN_LIVEDUMP`: `BUGCHECK_ERROR` = 440u;
public const val `VIDEO_MINIPORT_FAILED_LIVEDUMP`: `BUGCHECK_ERROR` = 432u;
public const val `VIDEO_SCHEDULER_INTERNAL_ERROR`: `BUGCHECK_ERROR` = 281u;
public const val `VIDEO_SHADOW_DRIVER_FATAL_ERROR`: `BUGCHECK_ERROR` = 276u;
public const val `VIDEO_TDR_APPLICATION_BLOCKED`: `BUGCHECK_ERROR` = 322u;
public const val `VIDEO_TDR_FAILURE`: `BUGCHECK_ERROR` = 278u;
public const val `VIDEO_TDR_TIMEOUT_DETECTED`: `BUGCHECK_ERROR` = 279u;
public const val `VMBUS_LIVEDUMP`: `BUGCHECK_ERROR` = 1073742319u;
public const val `VOLMGRX_INTERNAL_ERROR`: `BUGCHECK_ERROR` = 88u;
public const val `VOLSNAP_OVERLAPPED_TABLE_ACCESS`: `BUGCHECK_ERROR` = 301u;
public const val `VSL_INITIALIZATION_FAILED`: `BUGCHECK_ERROR` = 111u;
public const val `VmPostReadCallback`: `MINIDUMP_CALLBACK_TYPE` = 20;
public const val `VmPreReadCallback`: `MINIDUMP_CALLBACK_TYPE` = 19;
public const val `VmQueryCallback`: `MINIDUMP_CALLBACK_TYPE` = 18;
public const val `VmStartCallback`: `MINIDUMP_CALLBACK_TYPE` = 17;
// UNSUPPORTED Rust 5549:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WAITCHAIN_NODE_INFO {
//     pub ObjectType: WCT_OBJECT_TYPE,
//     pub ObjectStatus: WCT_OBJECT_STATUS,
//     pub Anonymous: WAITCHAIN_NODE_INFO_0,
// }

// UNSUPPORTED Rust 5556:1: declaration Impl has no candidate rule
// impl Default for WAITCHAIN_NODE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5561:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WAITCHAIN_NODE_INFO_0 {
//     pub LockObject: WAITCHAIN_NODE_INFO_0_0,
//     pub ThreadObject: WAITCHAIN_NODE_INFO_0_1,
// }

// UNSUPPORTED Rust 5567:1: declaration Impl has no candidate rule
// impl Default for WAITCHAIN_NODE_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5572:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WAITCHAIN_NODE_INFO_0_0 {
//     pub ObjectName: [u16; 128],
//     pub Timeout: i64,
//     pub Alertable: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 5579:1: declaration Impl has no candidate rule
// impl Default for WAITCHAIN_NODE_INFO_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5584:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WAITCHAIN_NODE_INFO_0_1 {
//     pub ProcessId: u32,
//     pub ThreadId: u32,
//     pub WaitTime: u32,
//     pub ContextSwitches: u32,
// }

public typealias `WAIT_CHAIN_THREAD_OPTIONS` = UInt;
public const val `WCT_ASYNC_OPEN_FLAG`: `OPEN_THREAD_WAIT_CHAIN_SESSION_FLAGS` = 1u;
public const val `WCT_MAX_NODE_COUNT`: UInt = 16u;
public const val `WCT_NETWORK_IO_FLAG`: UInt = 8u;
public typealias `WCT_OBJECT_STATUS` = Int;
public typealias `WCT_OBJECT_TYPE` = Int;
public const val `WCT_OBJNAME_LENGTH`: UInt = 128u;
public const val `WCT_OUT_OF_PROC_COM_FLAG`: `WAIT_CHAIN_THREAD_OPTIONS` = 2u;
public const val `WCT_OUT_OF_PROC_CS_FLAG`: `WAIT_CHAIN_THREAD_OPTIONS` = 4u;
public const val `WCT_OUT_OF_PROC_FLAG`: `WAIT_CHAIN_THREAD_OPTIONS` = 1u;
public const val `WDF_VIOLATION`: `BUGCHECK_ERROR` = 269u;
public const val `WFP_INVALID_OPERATION`: `BUGCHECK_ERROR` = 467u;
// UNSUPPORTED Rust 5604:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct WHEA_AER_BRIDGE_DESCRIPTOR {
//     pub Type: u16,
//     pub Enabled: bool,
//     pub Reserved: u8,
//     pub BusNumber: u32,
//     pub Slot: WHEA_PCI_SLOT_NUMBER,
//     pub DeviceControl: u16,
//     pub Flags: AER_BRIDGE_DESCRIPTOR_FLAGS,
//     pub UncorrectableErrorMask: u32,
//     pub UncorrectableErrorSeverity: u32,
//     pub CorrectableErrorMask: u32,
//     pub AdvancedCapsAndControl: u32,
//     pub SecondaryUncorrectableErrorMask: u32,
//     pub SecondaryUncorrectableErrorSev: u32,
//     pub SecondaryCapsAndControl: u32,
// }

// UNSUPPORTED Rust 5622:1: declaration Impl has no candidate rule
// impl Default for WHEA_AER_BRIDGE_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5627:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct WHEA_AER_ENDPOINT_DESCRIPTOR {
//     pub Type: u16,
//     pub Enabled: bool,
//     pub Reserved: u8,
//     pub BusNumber: u32,
//     pub Slot: WHEA_PCI_SLOT_NUMBER,
//     pub DeviceControl: u16,
//     pub Flags: AER_ENDPOINT_DESCRIPTOR_FLAGS,
//     pub UncorrectableErrorMask: u32,
//     pub UncorrectableErrorSeverity: u32,
//     pub CorrectableErrorMask: u32,
//     pub AdvancedCapsAndControl: u32,
// }

// UNSUPPORTED Rust 5642:1: declaration Impl has no candidate rule
// impl Default for WHEA_AER_ENDPOINT_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5647:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct WHEA_AER_ROOTPORT_DESCRIPTOR {
//     pub Type: u16,
//     pub Enabled: bool,
//     pub Reserved: u8,
//     pub BusNumber: u32,
//     pub Slot: WHEA_PCI_SLOT_NUMBER,
//     pub DeviceControl: u16,
//     pub Flags: AER_ROOTPORT_DESCRIPTOR_FLAGS,
//     pub UncorrectableErrorMask: u32,
//     pub UncorrectableErrorSeverity: u32,
//     pub CorrectableErrorMask: u32,
//     pub AdvancedCapsAndControl: u32,
//     pub RootErrorCommand: u32,
// }

// UNSUPPORTED Rust 5663:1: declaration Impl has no candidate rule
// impl Default for WHEA_AER_ROOTPORT_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WHEA_BAD_PAGE_LIST_LOCATION`: UInt = 15u;
public const val `WHEA_BAD_PAGE_LIST_MAX_SIZE`: UInt = 14u;
public const val `WHEA_CMCI_THRESHOLD_COUNT`: UInt = 10u;
public const val `WHEA_CMCI_THRESHOLD_POLL_COUNT`: UInt = 12u;
public const val `WHEA_CMCI_THRESHOLD_TIME`: UInt = 11u;
public const val `WHEA_DEVICE_DRIVER_BUFFER_SET_MAX`: UInt = 1u;
public const val `WHEA_DEVICE_DRIVER_BUFFER_SET_MIN`: UInt = 1u;
public const val `WHEA_DEVICE_DRIVER_BUFFER_SET_V1`: UInt = 1u;
public const val `WHEA_DEVICE_DRIVER_CONFIG_MAX`: UInt = 2u;
public const val `WHEA_DEVICE_DRIVER_CONFIG_MIN`: UInt = 1u;
public const val `WHEA_DEVICE_DRIVER_CONFIG_V1`: UInt = 1u;
public const val `WHEA_DEVICE_DRIVER_CONFIG_V2`: UInt = 2u;
// UNSUPPORTED Rust 5680:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct WHEA_DEVICE_DRIVER_DESCRIPTOR {
//     pub Type: u16,
//     pub Enabled: bool,
//     pub Reserved: u8,
//     pub SourceGuid: windows_sys::core::GUID,
//     pub LogTag: u16,
//     pub Reserved2: u16,
//     pub PacketLength: u32,
//     pub PacketCount: u32,
//     pub PacketBuffer: *mut u8,
//     pub Config: WHEA_ERROR_SOURCE_CONFIGURATION_DD,
//     pub CreatorId: windows_sys::core::GUID,
//     pub PartitionId: windows_sys::core::GUID,
//     pub MaxSectionDataLength: u32,
//     pub MaxSectionsPerRecord: u32,
//     pub PacketStateBuffer: *mut u8,
//     pub OpenHandles: i32,
// }

// UNSUPPORTED Rust 5700:1: declaration Impl has no candidate rule
// impl Default for WHEA_DEVICE_DRIVER_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WHEA_DISABLE_DUMMY_WRITE`: UInt = 6u;
public const val `WHEA_DISABLE_OFFLINE`: UInt = 0u;
// UNSUPPORTED Rust 5707:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct WHEA_DRIVER_BUFFER_SET {
//     pub Version: u32,
//     pub Data: *mut u8,
//     pub DataSize: u32,
//     pub SectionTypeGuid: *mut windows_sys::core::GUID,
//     pub SectionFriendlyName: *mut u8,
//     pub Flags: *mut u8,
// }

// UNSUPPORTED Rust 5717:1: declaration Impl has no candidate rule
// impl Default for WHEA_DRIVER_BUFFER_SET {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5722:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct WHEA_ERROR_SOURCE_CONFIGURATION_DD {
//     pub Initialize: WHEA_ERROR_SOURCE_INITIALIZE_DEVICE_DRIVER,
//     pub Uninitialize: WHEA_ERROR_SOURCE_UNINITIALIZE_DEVICE_DRIVER,
//     pub Correct: WHEA_ERROR_SOURCE_CORRECT_DEVICE_DRIVER,
// }

// UNSUPPORTED Rust 5729:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct WHEA_ERROR_SOURCE_CONFIGURATION_DEVICE_DRIVER {
//     pub Version: u32,
//     pub SourceGuid: windows_sys::core::GUID,
//     pub LogTag: u16,
//     pub Reserved: [u8; 6],
//     pub Initialize: WHEA_ERROR_SOURCE_INITIALIZE_DEVICE_DRIVER,
//     pub Uninitialize: WHEA_ERROR_SOURCE_UNINITIALIZE_DEVICE_DRIVER,
//     pub MaxSectionDataLength: u32,
//     pub MaxSectionsPerReport: u32,
//     pub CreatorId: windows_sys::core::GUID,
//     pub PartitionId: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 5743:1: declaration Impl has no candidate rule
// impl Default for WHEA_ERROR_SOURCE_CONFIGURATION_DEVICE_DRIVER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5748:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct WHEA_ERROR_SOURCE_CONFIGURATION_DEVICE_DRIVER_V1 {
//     pub Version: u32,
//     pub SourceGuid: windows_sys::core::GUID,
//     pub LogTag: u16,
//     pub Reserved: [u8; 6],
//     pub Initialize: WHEA_ERROR_SOURCE_INITIALIZE_DEVICE_DRIVER,
//     pub Uninitialize: WHEA_ERROR_SOURCE_UNINITIALIZE_DEVICE_DRIVER,
// }

// UNSUPPORTED Rust 5758:1: declaration Impl has no candidate rule
// impl Default for WHEA_ERROR_SOURCE_CONFIGURATION_DEVICE_DRIVER_V1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5763:1: generic scalar type unsupported
// pub type WHEA_ERROR_SOURCE_CORRECT_DEVICE_DRIVER = Option<unsafe extern "system" fn(errorsourcedesc: *mut core::ffi::c_void, maximumsectionlength: *mut u32) -> super::super::super::Foundation::NTSTATUS>;

// UNSUPPORTED Rust 5764:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct WHEA_ERROR_SOURCE_DESCRIPTOR {
//     pub Length: u32,
//     pub Version: u32,
//     pub Type: WHEA_ERROR_SOURCE_TYPE,
//     pub State: WHEA_ERROR_SOURCE_STATE,
//     pub MaxRawDataLength: u32,
//     pub NumRecordsToPreallocate: u32,
//     pub MaxSectionsPerRecord: u32,
//     pub ErrorSourceId: u32,
//     pub PlatformErrorSourceId: u32,
//     pub Flags: u32,
//     pub Info: WHEA_ERROR_SOURCE_DESCRIPTOR_0,
// }

// UNSUPPORTED Rust 5779:1: declaration Impl has no candidate rule
// impl Default for WHEA_ERROR_SOURCE_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5784:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHEA_ERROR_SOURCE_DESCRIPTOR_0 {
//     pub XpfMceDescriptor: WHEA_XPF_MCE_DESCRIPTOR,
//     pub XpfCmcDescriptor: WHEA_XPF_CMC_DESCRIPTOR,
//     pub XpfNmiDescriptor: WHEA_XPF_NMI_DESCRIPTOR,
//     pub IpfMcaDescriptor: WHEA_IPF_MCA_DESCRIPTOR,
//     pub IpfCmcDescriptor: WHEA_IPF_CMC_DESCRIPTOR,
//     pub IpfCpeDescriptor: WHEA_IPF_CPE_DESCRIPTOR,
//     pub AerRootportDescriptor: WHEA_AER_ROOTPORT_DESCRIPTOR,
//     pub AerEndpointDescriptor: WHEA_AER_ENDPOINT_DESCRIPTOR,
//     pub AerBridgeDescriptor: WHEA_AER_BRIDGE_DESCRIPTOR,
//     pub GenErrDescriptor: WHEA_GENERIC_ERROR_DESCRIPTOR,
//     pub GenErrDescriptorV2: WHEA_GENERIC_ERROR_DESCRIPTOR_V2,
//     pub DeviceDriverDescriptor: WHEA_DEVICE_DRIVER_DESCRIPTOR,
// }

// UNSUPPORTED Rust 5800:1: declaration Impl has no candidate rule
// impl Default for WHEA_ERROR_SOURCE_DESCRIPTOR_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WHEA_ERROR_SOURCE_DESCRIPTOR_TYPE_AERBRIDGE`: UInt = 8u;
public const val `WHEA_ERROR_SOURCE_DESCRIPTOR_TYPE_AERENDPOINT`: UInt = 7u;
public const val `WHEA_ERROR_SOURCE_DESCRIPTOR_TYPE_AERROOTPORT`: UInt = 6u;
public const val `WHEA_ERROR_SOURCE_DESCRIPTOR_TYPE_GENERIC`: UInt = 9u;
public const val `WHEA_ERROR_SOURCE_DESCRIPTOR_TYPE_GENERIC_V2`: UInt = 10u;
public const val `WHEA_ERROR_SOURCE_DESCRIPTOR_TYPE_IPFCMC`: UInt = 4u;
public const val `WHEA_ERROR_SOURCE_DESCRIPTOR_TYPE_IPFCPE`: UInt = 5u;
public const val `WHEA_ERROR_SOURCE_DESCRIPTOR_TYPE_IPFMCA`: UInt = 3u;
public const val `WHEA_ERROR_SOURCE_DESCRIPTOR_TYPE_XPFCMC`: UInt = 1u;
public const val `WHEA_ERROR_SOURCE_DESCRIPTOR_TYPE_XPFMCE`: UInt = 0u;
public const val `WHEA_ERROR_SOURCE_DESCRIPTOR_TYPE_XPFNMI`: UInt = 2u;
public const val `WHEA_ERROR_SOURCE_DESCRIPTOR_VERSION_10`: UInt = 10u;
public const val `WHEA_ERROR_SOURCE_DESCRIPTOR_VERSION_11`: UInt = 11u;
public const val `WHEA_ERROR_SOURCE_FLAG_DEFAULTSOURCE`: UInt = 2147483648u;
public const val `WHEA_ERROR_SOURCE_FLAG_FIRMWAREFIRST`: UInt = 1u;
public const val `WHEA_ERROR_SOURCE_FLAG_GHES_ASSIST`: UInt = 4u;
public const val `WHEA_ERROR_SOURCE_FLAG_GLOBAL`: UInt = 2u;
// UNSUPPORTED Rust 5822:1: generic scalar type unsupported
// pub type WHEA_ERROR_SOURCE_INITIALIZE_DEVICE_DRIVER = Option<unsafe extern "system" fn(context: *mut core::ffi::c_void, errorsourceid: u32) -> super::super::super::Foundation::NTSTATUS>;

public const val `WHEA_ERROR_SOURCE_INVALID_RELATED_SOURCE`: UInt = 65535u;
public typealias `WHEA_ERROR_SOURCE_STATE` = Int;
public typealias `WHEA_ERROR_SOURCE_TYPE` = Int;
// UNSUPPORTED Rust 5826:1: generic scalar type unsupported
// pub type WHEA_ERROR_SOURCE_UNINITIALIZE_DEVICE_DRIVER = Option<unsafe extern "system" fn(context: *mut core::ffi::c_void)>;

// UNSUPPORTED Rust 5827:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct WHEA_GENERIC_ERROR_DESCRIPTOR {
//     pub Type: u16,
//     pub Reserved: u8,
//     pub Enabled: u8,
//     pub ErrStatusBlockLength: u32,
//     pub RelatedErrorSourceId: u32,
//     pub ErrStatusAddressSpaceID: u8,
//     pub ErrStatusAddressBitWidth: u8,
//     pub ErrStatusAddressBitOffset: u8,
//     pub ErrStatusAddressAccessSize: u8,
//     pub ErrStatusAddress: i64,
//     pub Notify: WHEA_NOTIFICATION_DESCRIPTOR,
// }

// UNSUPPORTED Rust 5842:1: declaration Impl has no candidate rule
// impl Default for WHEA_GENERIC_ERROR_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5847:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct WHEA_GENERIC_ERROR_DESCRIPTOR_V2 {
//     pub Type: u16,
//     pub Reserved: u8,
//     pub Enabled: u8,
//     pub ErrStatusBlockLength: u32,
//     pub RelatedErrorSourceId: u32,
//     pub ErrStatusAddressSpaceID: u8,
//     pub ErrStatusAddressBitWidth: u8,
//     pub ErrStatusAddressBitOffset: u8,
//     pub ErrStatusAddressAccessSize: u8,
//     pub ErrStatusAddress: i64,
//     pub Notify: WHEA_NOTIFICATION_DESCRIPTOR,
//     pub ReadAckAddressSpaceID: u8,
//     pub ReadAckAddressBitWidth: u8,
//     pub ReadAckAddressBitOffset: u8,
//     pub ReadAckAddressAccessSize: u8,
//     pub ReadAckAddress: i64,
//     pub ReadAckPreserveMask: u64,
//     pub ReadAckWriteMask: u64,
// }

// UNSUPPORTED Rust 5869:1: declaration Impl has no candidate rule
// impl Default for WHEA_GENERIC_ERROR_DESCRIPTOR_V2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WHEA_INTERNAL_ERROR`: `BUGCHECK_ERROR` = 290u;
// UNSUPPORTED Rust 5875:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct WHEA_IPF_CMC_DESCRIPTOR {
//     pub Type: u16,
//     pub Enabled: u8,
//     pub Reserved: u8,
// }

// UNSUPPORTED Rust 5882:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct WHEA_IPF_CPE_DESCRIPTOR {
//     pub Type: u16,
//     pub Enabled: u8,
//     pub Reserved: u8,
// }

// UNSUPPORTED Rust 5889:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct WHEA_IPF_MCA_DESCRIPTOR {
//     pub Type: u16,
//     pub Enabled: u8,
//     pub Reserved: u8,
// }

public const val `WHEA_MAX_MC_BANKS`: UInt = 32u;
public const val `WHEA_MEM_PERSISTOFFLINE`: UInt = 1u;
public const val `WHEA_MEM_PFA_DISABLE`: UInt = 2u;
public const val `WHEA_MEM_PFA_PAGECOUNT`: UInt = 3u;
public const val `WHEA_MEM_PFA_THRESHOLD`: UInt = 4u;
public const val `WHEA_MEM_PFA_TIMEOUT`: UInt = 5u;
// UNSUPPORTED Rust 5902:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WHEA_NOTIFICATION_DESCRIPTOR {
//     pub Type: u8,
//     pub Length: u8,
//     pub Flags: WHEA_NOTIFICATION_FLAGS,
//     pub u: WHEA_NOTIFICATION_DESCRIPTOR_0,
// }

// UNSUPPORTED Rust 5910:1: declaration Impl has no candidate rule
// impl Default for WHEA_NOTIFICATION_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5915:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHEA_NOTIFICATION_DESCRIPTOR_0 {
//     pub Polled: WHEA_NOTIFICATION_DESCRIPTOR_0_0,
//     pub Interrupt: WHEA_NOTIFICATION_DESCRIPTOR_0_1,
//     pub LocalInterrupt: WHEA_NOTIFICATION_DESCRIPTOR_0_2,
//     pub Sci: WHEA_NOTIFICATION_DESCRIPTOR_0_3,
//     pub Nmi: WHEA_NOTIFICATION_DESCRIPTOR_0_4,
//     pub Sea: WHEA_NOTIFICATION_DESCRIPTOR_0_5,
//     pub Sei: WHEA_NOTIFICATION_DESCRIPTOR_0_6,
//     pub Gsiv: WHEA_NOTIFICATION_DESCRIPTOR_0_7,
// }

// UNSUPPORTED Rust 5927:1: declaration Impl has no candidate rule
// impl Default for WHEA_NOTIFICATION_DESCRIPTOR_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5932:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct WHEA_NOTIFICATION_DESCRIPTOR_0_7 {
//     pub PollInterval: u32,
//     pub Vector: u32,
//     pub SwitchToPollingThreshold: u32,
//     pub SwitchToPollingWindow: u32,
//     pub ErrorThreshold: u32,
//     pub ErrorThresholdWindow: u32,
// }

// UNSUPPORTED Rust 5942:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct WHEA_NOTIFICATION_DESCRIPTOR_0_1 {
//     pub PollInterval: u32,
//     pub Vector: u32,
//     pub SwitchToPollingThreshold: u32,
//     pub SwitchToPollingWindow: u32,
//     pub ErrorThreshold: u32,
//     pub ErrorThresholdWindow: u32,
// }

// UNSUPPORTED Rust 5952:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct WHEA_NOTIFICATION_DESCRIPTOR_0_2 {
//     pub PollInterval: u32,
//     pub Vector: u32,
//     pub SwitchToPollingThreshold: u32,
//     pub SwitchToPollingWindow: u32,
//     pub ErrorThreshold: u32,
//     pub ErrorThresholdWindow: u32,
// }

// UNSUPPORTED Rust 5962:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct WHEA_NOTIFICATION_DESCRIPTOR_0_4 {
//     pub PollInterval: u32,
//     pub Vector: u32,
//     pub SwitchToPollingThreshold: u32,
//     pub SwitchToPollingWindow: u32,
//     pub ErrorThreshold: u32,
//     pub ErrorThresholdWindow: u32,
// }

// UNSUPPORTED Rust 5972:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct WHEA_NOTIFICATION_DESCRIPTOR_0_0 {
//     pub PollInterval: u32,
// }

// UNSUPPORTED Rust 5977:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct WHEA_NOTIFICATION_DESCRIPTOR_0_3 {
//     pub PollInterval: u32,
//     pub Vector: u32,
//     pub SwitchToPollingThreshold: u32,
//     pub SwitchToPollingWindow: u32,
//     pub ErrorThreshold: u32,
//     pub ErrorThresholdWindow: u32,
// }

// UNSUPPORTED Rust 5987:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct WHEA_NOTIFICATION_DESCRIPTOR_0_5 {
//     pub PollInterval: u32,
//     pub Vector: u32,
//     pub SwitchToPollingThreshold: u32,
//     pub SwitchToPollingWindow: u32,
//     pub ErrorThreshold: u32,
//     pub ErrorThresholdWindow: u32,
// }

// UNSUPPORTED Rust 5997:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct WHEA_NOTIFICATION_DESCRIPTOR_0_6 {
//     pub PollInterval: u32,
//     pub Vector: u32,
//     pub SwitchToPollingThreshold: u32,
//     pub SwitchToPollingWindow: u32,
//     pub ErrorThreshold: u32,
//     pub ErrorThresholdWindow: u32,
// }

// UNSUPPORTED Rust 6007:1: declaration Union has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union WHEA_NOTIFICATION_FLAGS {
//     pub Anonymous: WHEA_NOTIFICATION_FLAGS_0,
//     pub AsUSHORT: u16,
// }

// UNSUPPORTED Rust 6013:1: declaration Impl has no candidate rule
// impl Default for WHEA_NOTIFICATION_FLAGS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6018:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct WHEA_NOTIFICATION_FLAGS_0 {
//     pub _bitfield: u16,
// }

public const val `WHEA_NOTIFICATION_TYPE_ARMV8_SEA`: UInt = 8u;
public const val `WHEA_NOTIFICATION_TYPE_ARMV8_SEI`: UInt = 9u;
public const val `WHEA_NOTIFICATION_TYPE_CMCI`: UInt = 5u;
public const val `WHEA_NOTIFICATION_TYPE_EXTERNALINTERRUPT`: UInt = 1u;
public const val `WHEA_NOTIFICATION_TYPE_EXTERNALINTERRUPT_GSIV`: UInt = 10u;
public const val `WHEA_NOTIFICATION_TYPE_GPIO_SIGNAL`: UInt = 7u;
public const val `WHEA_NOTIFICATION_TYPE_LOCALINTERRUPT`: UInt = 2u;
public const val `WHEA_NOTIFICATION_TYPE_MCE`: UInt = 6u;
public const val `WHEA_NOTIFICATION_TYPE_NMI`: UInt = 4u;
public const val `WHEA_NOTIFICATION_TYPE_POLLED`: UInt = 0u;
public const val `WHEA_NOTIFICATION_TYPE_SCI`: UInt = 3u;
public const val `WHEA_NOTIFICATION_TYPE_SDEI`: UInt = 11u;
public const val `WHEA_NOTIFY_ALL_OFFLINES`: UInt = 16u;
// UNSUPPORTED Rust 6036:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WHEA_PCI_SLOT_NUMBER {
//     pub u: WHEA_PCI_SLOT_NUMBER_0,
// }

// UNSUPPORTED Rust 6041:1: declaration Impl has no candidate rule
// impl Default for WHEA_PCI_SLOT_NUMBER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6046:1: declaration Union has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union WHEA_PCI_SLOT_NUMBER_0 {
//     pub bits: WHEA_PCI_SLOT_NUMBER_0_0,
//     pub AsULONG: u32,
// }

// UNSUPPORTED Rust 6052:1: declaration Impl has no candidate rule
// impl Default for WHEA_PCI_SLOT_NUMBER_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6057:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct WHEA_PCI_SLOT_NUMBER_0_0 {
//     pub _bitfield: u32,
// }

public const val `WHEA_PENDING_PAGE_LIST_SZ`: UInt = 13u;
public const val `WHEA_RESTORE_CMCI_ATTEMPTS`: UInt = 8u;
public const val `WHEA_RESTORE_CMCI_ENABLED`: UInt = 7u;
public const val `WHEA_RESTORE_CMCI_ERR_LIMIT`: UInt = 9u;
public const val `WHEA_ROW_FAIL_CHECK_ENABLE`: UInt = 18u;
public const val `WHEA_ROW_FAIL_CHECK_EXTENT`: UInt = 17u;
public const val `WHEA_ROW_FAIL_CHECK_THRESHOLD`: UInt = 19u;
public const val `WHEA_UNCORRECTABLE_ERROR`: `BUGCHECK_ERROR` = 292u;
// UNSUPPORTED Rust 6070:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct WHEA_XPF_CMC_DESCRIPTOR {
//     pub Type: u16,
//     pub Enabled: bool,
//     pub NumberOfBanks: u8,
//     pub Reserved: u32,
//     pub Notify: WHEA_NOTIFICATION_DESCRIPTOR,
//     pub Banks: [WHEA_XPF_MC_BANK_DESCRIPTOR; 32],
// }

// UNSUPPORTED Rust 6080:1: declaration Impl has no candidate rule
// impl Default for WHEA_XPF_CMC_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6085:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct WHEA_XPF_MCE_DESCRIPTOR {
//     pub Type: u16,
//     pub Enabled: u8,
//     pub NumberOfBanks: u8,
//     pub Flags: XPF_MCE_FLAGS,
//     pub MCG_Capability: u64,
//     pub MCG_GlobalControl: u64,
//     pub Banks: [WHEA_XPF_MC_BANK_DESCRIPTOR; 32],
// }

// UNSUPPORTED Rust 6096:1: declaration Impl has no candidate rule
// impl Default for WHEA_XPF_MCE_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6101:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct WHEA_XPF_MC_BANK_DESCRIPTOR {
//     pub BankNumber: u8,
//     pub ClearOnInitialization: bool,
//     pub StatusDataFormat: u8,
//     pub Flags: XPF_MC_BANK_FLAGS,
//     pub ControlMsr: u32,
//     pub StatusMsr: u32,
//     pub AddressMsr: u32,
//     pub MiscMsr: u32,
//     pub ControlData: u64,
// }

// UNSUPPORTED Rust 6114:1: declaration Impl has no candidate rule
// impl Default for WHEA_XPF_MC_BANK_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WHEA_XPF_MC_BANK_STATUSFORMAT_AMD64MCA`: UInt = 2u;
public const val `WHEA_XPF_MC_BANK_STATUSFORMAT_IA32MCA`: UInt = 0u;
public const val `WHEA_XPF_MC_BANK_STATUSFORMAT_Intel64MCA`: UInt = 1u;
// UNSUPPORTED Rust 6122:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct WHEA_XPF_NMI_DESCRIPTOR {
//     pub Type: u16,
//     pub Enabled: bool,
// }

public const val `WIN32K_ATOMIC_CHECK_FAILURE`: `BUGCHECK_ERROR` = 352u;
public const val `WIN32K_CALLOUT_WATCHDOG_BUGCHECK`: `BUGCHECK_ERROR` = 418u;
public const val `WIN32K_CALLOUT_WATCHDOG_LIVEDUMP`: `BUGCHECK_ERROR` = 417u;
public const val `WIN32K_CRITICAL_FAILURE`: `BUGCHECK_ERROR` = 356u;
public const val `WIN32K_CRITICAL_FAILURE_LIVEDUMP`: `BUGCHECK_ERROR` = 400u;
public const val `WIN32K_HANDLE_MANAGER`: `BUGCHECK_ERROR` = 311u;
public const val `WIN32K_INIT_OR_RIT_FAILURE`: `BUGCHECK_ERROR` = 145u;
public const val `WIN32K_POWER_WATCHDOG_TIMEOUT`: `BUGCHECK_ERROR` = 412u;
public const val `WIN32K_SECURITY_FAILURE`: `BUGCHECK_ERROR` = 407u;
public const val `WINDOWS_NT_BANNER`: `BUGCHECK_ERROR` = 1073741950u;
public const val `WINDOWS_NT_CSD_STRING`: `BUGCHECK_ERROR` = 1073741959u;
public const val `WINDOWS_NT_INFO_STRING`: `BUGCHECK_ERROR` = 1073741960u;
public const val `WINDOWS_NT_INFO_STRING_PLURAL`: `BUGCHECK_ERROR` = 1073741981u;
public const val `WINDOWS_NT_MP_STRING`: `BUGCHECK_ERROR` = 1073741961u;
public const val `WINDOWS_NT_RC_STRING`: `BUGCHECK_ERROR` = 1073741982u;
public const val `WINLOGON_FATAL_ERROR`: `BUGCHECK_ERROR` = 3221226010u;
public const val `WINSOCK_DETECTED_HUNG_CLOSESOCKET_LIVEDUMP`: `BUGCHECK_ERROR` = 342u;
public const val `WORKER_INVALID`: `BUGCHECK_ERROR` = 228u;
public const val `WORKER_THREAD_INVALID_STATE`: `BUGCHECK_ERROR` = 466u;
public const val `WORKER_THREAD_RETURNED_AT_BAD_IRQL`: `BUGCHECK_ERROR` = 225u;
public const val `WORKER_THREAD_RETURNED_WHILE_ATTACHED_TO_SILO`: `BUGCHECK_ERROR` = 410u;
public const val `WORKER_THREAD_RETURNED_WITH_BAD_IO_PRIORITY`: `BUGCHECK_ERROR` = 296u;
public const val `WORKER_THREAD_RETURNED_WITH_BAD_PAGING_IO_PRIORITY`: `BUGCHECK_ERROR` = 297u;
public const val `WORKER_THREAD_RETURNED_WITH_NON_DEFAULT_WORKLOAD_CLASS`: `BUGCHECK_ERROR` = 470u;
public const val `WORKER_THREAD_RETURNED_WITH_SYSTEM_PAGE_PRIORITY_ACTIVE`: `BUGCHECK_ERROR` = 347u;
public const val `WORKER_THREAD_TEST_CONDITION`: `BUGCHECK_ERROR` = 355u;
// UNSUPPORTED Rust 6154:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WOW64_CONTEXT {
//     pub ContextFlags: WOW64_CONTEXT_FLAGS,
//     pub Dr0: u32,
//     pub Dr1: u32,
//     pub Dr2: u32,
//     pub Dr3: u32,
//     pub Dr6: u32,
//     pub Dr7: u32,
//     pub FloatSave: WOW64_FLOATING_SAVE_AREA,
//     pub SegGs: u32,
//     pub SegFs: u32,
//     pub SegEs: u32,
//     pub SegDs: u32,
//     pub Edi: u32,
//     pub Esi: u32,
//     pub Ebx: u32,
//     pub Edx: u32,
//     pub Ecx: u32,
//     pub Eax: u32,
//     pub Ebp: u32,
//     pub Eip: u32,
//     pub SegCs: u32,
//     pub EFlags: u32,
//     pub Esp: u32,
//     pub SegSs: u32,
//     pub ExtendedRegisters: [u8; 512],
// }

// UNSUPPORTED Rust 6183:1: declaration Impl has no candidate rule
// impl Default for WOW64_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WOW64_CONTEXT_ALL`: `WOW64_CONTEXT_FLAGS` = 65599u;
public const val `WOW64_CONTEXT_CONTROL`: `WOW64_CONTEXT_FLAGS` = 65537u;
public const val `WOW64_CONTEXT_DEBUG_REGISTERS`: `WOW64_CONTEXT_FLAGS` = 65552u;
public const val `WOW64_CONTEXT_EXCEPTION_ACTIVE`: `WOW64_CONTEXT_FLAGS` = 134217728u;
public const val `WOW64_CONTEXT_EXCEPTION_REPORTING`: `WOW64_CONTEXT_FLAGS` = 2147483648u;
public const val `WOW64_CONTEXT_EXCEPTION_REQUEST`: `WOW64_CONTEXT_FLAGS` = 1073741824u;
public const val `WOW64_CONTEXT_EXTENDED_REGISTERS`: `WOW64_CONTEXT_FLAGS` = 65568u;
public typealias `WOW64_CONTEXT_FLAGS` = UInt;
public const val `WOW64_CONTEXT_FLOATING_POINT`: `WOW64_CONTEXT_FLAGS` = 65544u;
public const val `WOW64_CONTEXT_FULL`: `WOW64_CONTEXT_FLAGS` = 65543u;
public const val `WOW64_CONTEXT_INTEGER`: `WOW64_CONTEXT_FLAGS` = 65538u;
public const val `WOW64_CONTEXT_SEGMENTS`: `WOW64_CONTEXT_FLAGS` = 65540u;
public const val `WOW64_CONTEXT_SERVICE_ACTIVE`: `WOW64_CONTEXT_FLAGS` = 268435456u;
public const val `WOW64_CONTEXT_X86`: `WOW64_CONTEXT_FLAGS` = 65536u;
public const val `WOW64_CONTEXT_XSTATE`: `WOW64_CONTEXT_FLAGS` = 65600u;
// UNSUPPORTED Rust 6203:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WOW64_DESCRIPTOR_TABLE_ENTRY {
//     pub Selector: u32,
//     pub Descriptor: WOW64_LDT_ENTRY,
// }

// UNSUPPORTED Rust 6209:1: declaration Impl has no candidate rule
// impl Default for WOW64_DESCRIPTOR_TABLE_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6214:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WOW64_FLOATING_SAVE_AREA {
//     pub ControlWord: u32,
//     pub StatusWord: u32,
//     pub TagWord: u32,
//     pub ErrorOffset: u32,
//     pub ErrorSelector: u32,
//     pub DataOffset: u32,
//     pub DataSelector: u32,
//     pub RegisterArea: [u8; 80],
//     pub Cr0NpxState: u32,
// }

// UNSUPPORTED Rust 6227:1: declaration Impl has no candidate rule
// impl Default for WOW64_FLOATING_SAVE_AREA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6232:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WOW64_LDT_ENTRY {
//     pub LimitLow: u16,
//     pub BaseLow: u16,
//     pub HighWord: WOW64_LDT_ENTRY_0,
// }

// UNSUPPORTED Rust 6239:1: declaration Impl has no candidate rule
// impl Default for WOW64_LDT_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6244:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WOW64_LDT_ENTRY_0 {
//     pub Bytes: WOW64_LDT_ENTRY_0_0,
//     pub Bits: WOW64_LDT_ENTRY_0_1,
// }

// UNSUPPORTED Rust 6250:1: declaration Impl has no candidate rule
// impl Default for WOW64_LDT_ENTRY_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6255:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WOW64_LDT_ENTRY_0_1 {
//     pub _bitfield: u32,
// }

// UNSUPPORTED Rust 6260:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WOW64_LDT_ENTRY_0_0 {
//     pub BaseMid: u8,
//     pub Flags1: u8,
//     pub Flags2: u8,
//     pub BaseHi: u8,
// }

public const val `WOW64_MAXIMUM_SUPPORTED_EXTENSION`: UInt = 512u;
public const val `WOW64_SIZE_OF_80387_REGISTERS`: UInt = 80u;
public const val `WVR_LIVEDUMP_APP_IO_TIMEOUT`: `BUGCHECK_ERROR` = 387u;
public const val `WVR_LIVEDUMP_CRITICAL_ERROR`: `BUGCHECK_ERROR` = 390u;
public const val `WVR_LIVEDUMP_MANUALLY_INITIATED`: `BUGCHECK_ERROR` = 388u;
public const val `WVR_LIVEDUMP_RECOVERY_IOCONTEXT_TIMEOUT`: `BUGCHECK_ERROR` = 386u;
public const val `WVR_LIVEDUMP_REPLICATION_IOCONTEXT_TIMEOUT`: `BUGCHECK_ERROR` = 384u;
public const val `WVR_LIVEDUMP_STATE_FAILURE`: `BUGCHECK_ERROR` = 389u;
public const val `WVR_LIVEDUMP_STATE_TRANSITION_TIMEOUT`: `BUGCHECK_ERROR` = 385u;
public const val `WctAlpcType`: `WCT_OBJECT_TYPE` = 4;
public const val `WctComActivationType`: `WCT_OBJECT_TYPE` = 9;
public const val `WctComType`: `WCT_OBJECT_TYPE` = 5;
public const val `WctCriticalSectionType`: `WCT_OBJECT_TYPE` = 1;
public const val `WctMaxType`: `WCT_OBJECT_TYPE` = 13;
public const val `WctMutexType`: `WCT_OBJECT_TYPE` = 3;
public const val `WctProcessWaitType`: `WCT_OBJECT_TYPE` = 7;
public const val `WctSendMessageType`: `WCT_OBJECT_TYPE` = 2;
public const val `WctSmbIoType`: `WCT_OBJECT_TYPE` = 12;
public const val `WctSocketIoType`: `WCT_OBJECT_TYPE` = 11;
public const val `WctStatusAbandoned`: `WCT_OBJECT_STATUS` = 8;
public const val `WctStatusBlocked`: `WCT_OBJECT_STATUS` = 3;
public const val `WctStatusError`: `WCT_OBJECT_STATUS` = 10;
public const val `WctStatusMax`: `WCT_OBJECT_STATUS` = 11;
public const val `WctStatusNoAccess`: `WCT_OBJECT_STATUS` = 1;
public const val `WctStatusNotOwned`: `WCT_OBJECT_STATUS` = 7;
public const val `WctStatusOwned`: `WCT_OBJECT_STATUS` = 6;
public const val `WctStatusPidOnly`: `WCT_OBJECT_STATUS` = 4;
public const val `WctStatusPidOnlyRpcss`: `WCT_OBJECT_STATUS` = 5;
public const val `WctStatusRunning`: `WCT_OBJECT_STATUS` = 2;
public const val `WctStatusUnknown`: `WCT_OBJECT_STATUS` = 9;
public const val `WctThreadType`: `WCT_OBJECT_TYPE` = 8;
public const val `WctThreadWaitType`: `WCT_OBJECT_TYPE` = 6;
public const val `WctUnknownType`: `WCT_OBJECT_TYPE` = 10;
public const val `WheaErrSrcStateRemovePending`: `WHEA_ERROR_SOURCE_STATE` = 4;
public const val `WheaErrSrcStateRemoved`: `WHEA_ERROR_SOURCE_STATE` = 3;
public const val `WheaErrSrcStateStarted`: `WHEA_ERROR_SOURCE_STATE` = 2;
public const val `WheaErrSrcStateStopped`: `WHEA_ERROR_SOURCE_STATE` = 1;
public const val `WheaErrSrcTypeBMC`: `WHEA_ERROR_SOURCE_TYPE` = 14;
public const val `WheaErrSrcTypeBOOT`: `WHEA_ERROR_SOURCE_TYPE` = 7;
public const val `WheaErrSrcTypeCMC`: `WHEA_ERROR_SOURCE_TYPE` = 1;
public const val `WheaErrSrcTypeCPE`: `WHEA_ERROR_SOURCE_TYPE` = 2;
public const val `WheaErrSrcTypeDeviceDriver`: `WHEA_ERROR_SOURCE_TYPE` = 16;
public const val `WheaErrSrcTypeGeneric`: `WHEA_ERROR_SOURCE_TYPE` = 5;
public const val `WheaErrSrcTypeGenericV2`: `WHEA_ERROR_SOURCE_TYPE` = 12;
public const val `WheaErrSrcTypeINIT`: `WHEA_ERROR_SOURCE_TYPE` = 6;
public const val `WheaErrSrcTypeIPFCMC`: `WHEA_ERROR_SOURCE_TYPE` = 10;
public const val `WheaErrSrcTypeIPFCPE`: `WHEA_ERROR_SOURCE_TYPE` = 11;
public const val `WheaErrSrcTypeIPFMCA`: `WHEA_ERROR_SOURCE_TYPE` = 9;
public const val `WheaErrSrcTypeMCE`: `WHEA_ERROR_SOURCE_TYPE` = 0;
public const val `WheaErrSrcTypeMax`: `WHEA_ERROR_SOURCE_TYPE` = 19;
public const val `WheaErrSrcTypeNMI`: `WHEA_ERROR_SOURCE_TYPE` = 3;
public const val `WheaErrSrcTypePCIe`: `WHEA_ERROR_SOURCE_TYPE` = 4;
public const val `WheaErrSrcTypePMEM`: `WHEA_ERROR_SOURCE_TYPE` = 15;
public const val `WheaErrSrcTypeSCIGeneric`: `WHEA_ERROR_SOURCE_TYPE` = 8;
public const val `WheaErrSrcTypeSCIGenericV2`: `WHEA_ERROR_SOURCE_TYPE` = 13;
public const val `WheaErrSrcTypeSea`: `WHEA_ERROR_SOURCE_TYPE` = 17;
public const val `WheaErrSrcTypeSei`: `WHEA_ERROR_SOURCE_TYPE` = 18;
public const val `WriteKernelMinidumpCallback`: `MINIDUMP_CALLBACK_TYPE` = 7;
public const val `XBOX_360_SYSTEM_CRASH`: `BUGCHECK_ERROR` = 864u;
public const val `XBOX_360_SYSTEM_CRASH_RESERVED`: `BUGCHECK_ERROR` = 1056u;
public const val `XBOX_CORRUPTED_IMAGE`: `BUGCHECK_ERROR` = 855u;
public const val `XBOX_CORRUPTED_IMAGE_BASE`: `BUGCHECK_ERROR` = 857u;
public const val `XBOX_INVERTED_FUNCTION_TABLE_OVERFLOW`: `BUGCHECK_ERROR` = 856u;
public const val `XBOX_MANUALLY_INITIATED_CRASH`: `BUGCHECK_ERROR` = 196614u;
public const val `XBOX_SECURITY_FAILUE`: `BUGCHECK_ERROR` = 1057u;
public const val `XBOX_SHUTDOWN_WATCHDOG_TIMEOUT`: `BUGCHECK_ERROR` = 859u;
public const val `XBOX_VMCTRL_CS_TIMEOUT`: `BUGCHECK_ERROR` = 854u;
public const val `XBOX_XDS_WATCHDOG_TIMEOUT`: `BUGCHECK_ERROR` = 858u;
public const val `XNS_INTERNAL_ERROR`: `BUGCHECK_ERROR` = 87u;
// UNSUPPORTED Rust 6337:1: declaration Union has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union XPF_MCE_FLAGS {
//     pub Anonymous: XPF_MCE_FLAGS_0,
//     pub AsULONG: u32,
// }

// UNSUPPORTED Rust 6343:1: declaration Impl has no candidate rule
// impl Default for XPF_MCE_FLAGS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6348:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct XPF_MCE_FLAGS_0 {
//     pub _bitfield: u32,
// }

// UNSUPPORTED Rust 6353:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union XPF_MC_BANK_FLAGS {
//     pub Anonymous: XPF_MC_BANK_FLAGS_0,
//     pub AsUCHAR: u8,
// }

// UNSUPPORTED Rust 6359:1: declaration Impl has no candidate rule
// impl Default for XPF_MC_BANK_FLAGS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6364:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct XPF_MC_BANK_FLAGS_0 {
//     pub _bitfield: u8,
// }

// UNSUPPORTED Rust 6369:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct XSAVE_AREA {
//     pub LegacyState: XSAVE_FORMAT,
//     pub Header: XSAVE_AREA_HEADER,
// }

// UNSUPPORTED Rust 6375:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct XSAVE_AREA_HEADER {
//     pub Mask: u64,
//     pub CompactionMask: u64,
//     pub Reserved2: [u64; 6],
// }

// UNSUPPORTED Rust 6382:1: declaration Impl has no candidate rule
// impl Default for XSAVE_AREA_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6387:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct XSAVE_FORMAT {
//     pub ControlWord: u16,
//     pub StatusWord: u16,
//     pub TagWord: u8,
//     pub Reserved1: u8,
//     pub ErrorOpcode: u16,
//     pub ErrorOffset: u32,
//     pub ErrorSelector: u16,
//     pub Reserved2: u16,
//     pub DataOffset: u32,
//     pub DataSelector: u16,
//     pub Reserved3: u16,
//     pub MxCsr: u32,
//     pub MxCsr_Mask: u32,
//     pub FloatRegisters: [M128A; 8],
//     pub XmmRegisters: [M128A; 8],
//     pub Reserved4: [u8; 224],
// }

// UNSUPPORTED Rust 6408:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for XSAVE_FORMAT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6414:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct XSAVE_FORMAT {
//     pub ControlWord: u16,
//     pub StatusWord: u16,
//     pub TagWord: u8,
//     pub Reserved1: u8,
//     pub ErrorOpcode: u16,
//     pub ErrorOffset: u32,
//     pub ErrorSelector: u16,
//     pub Reserved2: u16,
//     pub DataOffset: u32,
//     pub DataSelector: u16,
//     pub Reserved3: u16,
//     pub MxCsr: u32,
//     pub MxCsr_Mask: u32,
//     pub FloatRegisters: [M128A; 8],
//     pub XmmRegisters: [M128A; 16],
//     pub Reserved4: [u8; 96],
// }

// UNSUPPORTED Rust 6435:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for XSAVE_FORMAT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6441:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct XSTATE_CONFIGURATION {
//     pub EnabledFeatures: u64,
//     pub EnabledVolatileFeatures: u64,
//     pub Size: u32,
//     pub Anonymous: XSTATE_CONFIGURATION_0,
//     pub Features: [XSTATE_FEATURE; 64],
//     pub EnabledSupervisorFeatures: u64,
//     pub AlignedFeatures: u64,
//     pub AllFeatureSize: u32,
//     pub AllFeatures: [u32; 64],
//     pub EnabledUserVisibleSupervisorFeatures: u64,
//     pub ExtendedFeatureDisableFeatures: u64,
//     pub AllNonLargeFeatureSize: u32,
//     pub Spare: u32,
// }

// UNSUPPORTED Rust 6458:1: declaration Impl has no candidate rule
// impl Default for XSTATE_CONFIGURATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6463:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union XSTATE_CONFIGURATION_0 {
//     pub ControlFlags: u32,
//     pub Anonymous: XSTATE_CONFIGURATION_0_0,
// }

// UNSUPPORTED Rust 6469:1: declaration Impl has no candidate rule
// impl Default for XSTATE_CONFIGURATION_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6474:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct XSTATE_CONFIGURATION_0_0 {
//     pub _bitfield: u32,
// }

// UNSUPPORTED Rust 6479:1: declaration Struct has no candidate rule
// #[repr(C, packed(4))]
// #[derive(Clone, Copy)]
// pub struct XSTATE_CONFIG_FEATURE_MSC_INFO {
//     pub SizeOfInfo: u32,
//     pub ContextSize: u32,
//     pub EnabledFeatures: u64,
//     pub Features: [XSTATE_FEATURE; 64],
// }

// UNSUPPORTED Rust 6487:1: declaration Impl has no candidate rule
// impl Default for XSTATE_CONFIG_FEATURE_MSC_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6492:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct XSTATE_CONTEXT {
//     pub Mask: u64,
//     pub Length: u32,
//     pub Reserved1: u32,
//     pub Area: *mut XSAVE_AREA,
//     pub Reserved2: u32,
//     pub Buffer: *mut core::ffi::c_void,
//     pub Reserved3: u32,
// }

// UNSUPPORTED Rust 6504:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for XSTATE_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6510:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct XSTATE_CONTEXT {
//     pub Mask: u64,
//     pub Length: u32,
//     pub Reserved1: u32,
//     pub Area: *mut XSAVE_AREA,
//     pub Buffer: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 6520:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for XSTATE_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6526:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct XSTATE_FEATURE {
//     pub Offset: u32,
//     pub Size: u32,
// }

public const val `ceStreamBucketParameters`: `MINIDUMP_STREAM_TYPE` = 32778;
public const val `ceStreamDiagnosisList`: `MINIDUMP_STREAM_TYPE` = 32780;
public const val `ceStreamException`: `MINIDUMP_STREAM_TYPE` = 32770;
public const val `ceStreamMemoryPhysicalList`: `MINIDUMP_STREAM_TYPE` = 32777;
public const val `ceStreamMemoryVirtualList`: `MINIDUMP_STREAM_TYPE` = 32776;
public const val `ceStreamModuleList`: `MINIDUMP_STREAM_TYPE` = 32771;
public const val `ceStreamNull`: `MINIDUMP_STREAM_TYPE` = 32768;
public const val `ceStreamProcessList`: `MINIDUMP_STREAM_TYPE` = 32772;
public const val `ceStreamProcessModuleMap`: `MINIDUMP_STREAM_TYPE` = 32779;
public const val `ceStreamSystemInfo`: `MINIDUMP_STREAM_TYPE` = 32769;
public const val `ceStreamThreadCallStackList`: `MINIDUMP_STREAM_TYPE` = 32775;
public const val `ceStreamThreadContextList`: `MINIDUMP_STREAM_TYPE` = 32774;
public const val `ceStreamThreadList`: `MINIDUMP_STREAM_TYPE` = 32773;
public const val `hdBase`: `IMAGEHLP_HD_TYPE` = 0;
public const val `hdMax`: `IMAGEHLP_HD_TYPE` = 3;
public const val `hdSrc`: `IMAGEHLP_HD_TYPE` = 2;
public const val `hdSym`: `IMAGEHLP_HD_TYPE` = 1;
public const val `sevAttn`: `IMAGEHLP_CBA_EVENT_SEVERITY` = 2u;
public const val `sevFatal`: `IMAGEHLP_CBA_EVENT_SEVERITY` = 3u;
public const val `sevInfo`: `IMAGEHLP_CBA_EVENT_SEVERITY` = 0u;
public const val `sevMax`: Int = 4;
public const val `sevProblem`: `IMAGEHLP_CBA_EVENT_SEVERITY` = 1u;
public const val `sfDbg`: `IMAGEHLP_SF_TYPE` = 1;
public const val `sfImage`: `IMAGEHLP_SF_TYPE` = 0;
public const val `sfMax`: `IMAGEHLP_SF_TYPE` = 4;
public const val `sfMpd`: `IMAGEHLP_SF_TYPE` = 3;
public const val `sfPdb`: `IMAGEHLP_SF_TYPE` = 2;
