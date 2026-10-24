// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Mod has no candidate rule; syntax: no per-file syntax rule for Mod
// #[cfg(feature = "Win32_System_Diagnostics_Debug_Extensions")]
// pub mod Extensions;

// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=AddVectoredContinueHandler; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
public external fun `AddVectoredContinueHandler`(`first` : UInt, `handler` : `PVECTORED_EXCEPTION_HANDLER`) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=AddVectoredExceptionHandler; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
public external fun `AddVectoredExceptionHandler`(`first` : UInt, `handler` : `PVECTORED_EXCEPTION_HANDLER`) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=Beep; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `Beep`(`dwfreq` : UInt, `dwduration` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imagehlp.dll, ABI=system, export=BindImage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `BindImage`(`imagename` : `windows_sys`.`core`.`PCSTR`, `dllpath` : `windows_sys`.`core`.`PCSTR`, `symbolpath` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imagehlp.dll, ABI=system, export=BindImageEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `BindImageEx`(`flags` : UInt, `imagename` : `windows_sys`.`core`.`PCSTR`, `dllpath` : `windows_sys`.`core`.`PCSTR`, `symbolpath` : `windows_sys`.`core`.`PCSTR`, `statusroutine` : `PIMAGEHLP_STATUS_ROUTINE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=CheckRemoteDebuggerPresent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CheckRemoteDebuggerPresent`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `pbdebuggerpresent` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imagehlp.dll, ABI=system, export=CheckSumMappedFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_SystemInformation")]
public external fun `CheckSumMappedFile`(`baseaddress` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `filelength` : UInt, `headersum` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `checksum` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<`IMAGE_NT_HEADERS32`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imagehlp.dll, ABI=system, export=CheckSumMappedFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_SystemInformation")]
public external fun `CheckSumMappedFile`(`baseaddress` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `filelength` : UInt, `headersum` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `checksum` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<`IMAGE_NT_HEADERS64`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=CloseThreadWaitChainSession; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CloseThreadWaitChainSession`(`wcthandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=ContinueDebugEvent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ContinueDebugEvent`(`dwprocessid` : UInt, `dwthreadid` : UInt, `dwcontinuestatus` : `super`.`super`.`super`.`Foundation`.`NTSTATUS`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=CopyContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
public external fun `CopyContext`(`destination` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CONTEXT`>?, `contextflags` : `CONTEXT_FLAGS`, `source` : /* Rust *const */ kotlinx.cinterop.CPointer<`CONTEXT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=DbgHelpCreateUserDump; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DbgHelpCreateUserDump`(`filename` : `windows_sys`.`core`.`PCSTR`, `callback` : `PDBGHELP_CREATE_USER_DUMP_CALLBACK`, `userdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=DbgHelpCreateUserDumpW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DbgHelpCreateUserDumpW`(`filename` : `windows_sys`.`core`.`PCWSTR`, `callback` : `PDBGHELP_CREATE_USER_DUMP_CALLBACK`, `userdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=DebugActiveProcess; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DebugActiveProcess`(`dwprocessid` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=DebugActiveProcessStop; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DebugActiveProcessStop`(`dwprocessid` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=DebugBreak; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DebugBreak`()
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=DebugBreakProcess; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DebugBreakProcess`(`process` : `super`.`super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=DebugSetProcessKillOnExit; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DebugSetProcessKillOnExit`(`killonexit` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=DecodePointer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DecodePointer`(`ptr` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-util-l1-1-1.dll, ABI=system, export=DecodeRemotePointer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DecodeRemotePointer`(`processhandle` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `ptr` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `decodedptr` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=DecodeSystemPointer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DecodeSystemPointer`(`ptr` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=EncodePointer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EncodePointer`(`ptr` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-util-l1-1-1.dll, ABI=system, export=EncodeRemotePointer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EncodeRemotePointer`(`processhandle` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `ptr` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `encodedptr` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=EncodeSystemPointer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EncodeSystemPointer`(`ptr` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=EnumDirTree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumDirTree`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `rootpath` : `windows_sys`.`core`.`PCSTR`, `inputpathname` : `windows_sys`.`core`.`PCSTR`, `outputpathbuffer` : `windows_sys`.`core`.`PSTR`, `cb` : `PENUMDIRTREE_CALLBACK`, `data` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=EnumDirTreeW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumDirTreeW`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `rootpath` : `windows_sys`.`core`.`PCWSTR`, `inputpathname` : `windows_sys`.`core`.`PCWSTR`, `outputpathbuffer` : `windows_sys`.`core`.`PWSTR`, `cb` : `PENUMDIRTREE_CALLBACKW`, `data` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=EnumerateLoadedModules; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
public external fun `EnumerateLoadedModules`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `enumloadedmodulescallback` : `PENUMLOADED_MODULES_CALLBACK`, `usercontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=EnumerateLoadedModules64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumerateLoadedModules64`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `enumloadedmodulescallback` : `PENUMLOADED_MODULES_CALLBACK64`, `usercontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=EnumerateLoadedModulesEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumerateLoadedModulesEx`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `enumloadedmodulescallback` : `PENUMLOADED_MODULES_CALLBACK64`, `usercontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=EnumerateLoadedModulesExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumerateLoadedModulesExW`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `enumloadedmodulescallback` : `PENUMLOADED_MODULES_CALLBACKW64`, `usercontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=EnumerateLoadedModulesW64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumerateLoadedModulesW64`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `enumloadedmodulescallback` : `PENUMLOADED_MODULES_CALLBACKW64`, `usercontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=FatalAppExitA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FatalAppExitA`(`uaction` : UInt, `lpmessagetext` : `windows_sys`.`core`.`PCSTR`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=FatalAppExitW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FatalAppExitW`(`uaction` : UInt, `lpmessagetext` : `windows_sys`.`core`.`PCWSTR`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=FatalExit; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FatalExit`(`exitcode` : Int) : Nothing
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=FindDebugInfoFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindDebugInfoFile`(`filename` : `windows_sys`.`core`.`PCSTR`, `symbolpath` : `windows_sys`.`core`.`PCSTR`, `debugfilepath` : `windows_sys`.`core`.`PSTR`) : `super`.`super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=FindDebugInfoFileEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindDebugInfoFileEx`(`filename` : `windows_sys`.`core`.`PCSTR`, `symbolpath` : `windows_sys`.`core`.`PCSTR`, `debugfilepath` : `windows_sys`.`core`.`PSTR`, `callback` : `PFIND_DEBUG_FILE_CALLBACK`, `callerdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `super`.`super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=FindDebugInfoFileExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindDebugInfoFileExW`(`filename` : `windows_sys`.`core`.`PCWSTR`, `symbolpath` : `windows_sys`.`core`.`PCWSTR`, `debugfilepath` : `windows_sys`.`core`.`PWSTR`, `callback` : `PFIND_DEBUG_FILE_CALLBACKW`, `callerdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `super`.`super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=FindExecutableImage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindExecutableImage`(`filename` : `windows_sys`.`core`.`PCSTR`, `symbolpath` : `windows_sys`.`core`.`PCSTR`, `imagefilepath` : `windows_sys`.`core`.`PSTR`) : `super`.`super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=FindExecutableImageEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindExecutableImageEx`(`filename` : `windows_sys`.`core`.`PCSTR`, `symbolpath` : `windows_sys`.`core`.`PCSTR`, `imagefilepath` : `windows_sys`.`core`.`PSTR`, `callback` : `PFIND_EXE_FILE_CALLBACK`, `callerdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `super`.`super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=FindExecutableImageExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindExecutableImageExW`(`filename` : `windows_sys`.`core`.`PCWSTR`, `symbolpath` : `windows_sys`.`core`.`PCWSTR`, `imagefilepath` : `windows_sys`.`core`.`PWSTR`, `callback` : `PFIND_EXE_FILE_CALLBACKW`, `callerdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `super`.`super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=FindFileInPath; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindFileInPath`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `searchpatha` : `windows_sys`.`core`.`PCSTR`, `filename` : `windows_sys`.`core`.`PCSTR`, `id` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `two` : UInt, `three` : UInt, `flags` : UInt, `filepath` : `windows_sys`.`core`.`PSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=FindFileInSearchPath; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindFileInSearchPath`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `searchpatha` : `windows_sys`.`core`.`PCSTR`, `filename` : `windows_sys`.`core`.`PCSTR`, `one` : UInt, `two` : UInt, `three` : UInt, `filepath` : `windows_sys`.`core`.`PSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=FlushInstructionCache; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FlushInstructionCache`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `lpbaseaddress` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwsize` : ULong) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=FormatMessageA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FormatMessageA`(`dwflags` : `FORMAT_MESSAGE_OPTIONS`, `lpsource` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwmessageid` : UInt, `dwlanguageid` : UInt, `lpbuffer` : `windows_sys`.`core`.`PSTR`, `nsize` : UInt, `arguments` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=FormatMessageW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FormatMessageW`(`dwflags` : `FORMAT_MESSAGE_OPTIONS`, `lpsource` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwmessageid` : UInt, `dwlanguageid` : UInt, `lpbuffer` : `windows_sys`.`core`.`PWSTR`, `nsize` : UInt, `arguments` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetEnabledXStateFeatures; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "arm64ec", target_arch = "x86", target_arch = "x86_64"))]
public external fun `GetEnabledXStateFeatures`() : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetErrorMode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetErrorMode`() : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imagehlp.dll, ABI=system, export=GetImageConfigInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Kernel", feature = "Win32_System_SystemInformation"))]
public external fun `GetImageConfigInformation`(`loadedimage` : /* Rust *const */ kotlinx.cinterop.CPointer<`LOADED_IMAGE`>?, `imageconfiginformation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`IMAGE_LOAD_CONFIG_DIRECTORY32`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imagehlp.dll, ABI=system, export=GetImageConfigInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Kernel", feature = "Win32_System_SystemInformation"))]
public external fun `GetImageConfigInformation`(`loadedimage` : /* Rust *const */ kotlinx.cinterop.CPointer<`LOADED_IMAGE`>?, `imageconfiginformation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`IMAGE_LOAD_CONFIG_DIRECTORY64`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imagehlp.dll, ABI=system, export=GetImageUnusedHeaderBytes; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Kernel", feature = "Win32_System_SystemInformation"))]
public external fun `GetImageUnusedHeaderBytes`(`loadedimage` : /* Rust *const */ kotlinx.cinterop.CPointer<`LOADED_IMAGE`>?, `sizeunusedheaderbytes` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=GetSymLoadError; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetSymLoadError`() : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetThreadContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
public external fun `GetThreadContext`(`hthread` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `lpcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CONTEXT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetThreadErrorMode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetThreadErrorMode`() : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetThreadSelectorEntry; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetThreadSelectorEntry`(`hthread` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `dwselector` : UInt, `lpselectorentry` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LDT_ENTRY`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=GetThreadWaitChain; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetThreadWaitChain`(`wcthandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `context` : ULong, `flags` : `WAIT_CHAIN_THREAD_OPTIONS`, `threadid` : UInt, `nodecount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `nodeinfoarray` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WAITCHAIN_NODE_INFO`>?, `iscycle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=GetTimestampForLoadedLibrary; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetTimestampForLoadedLibrary`(`module` : `super`.`super`.`super`.`Foundation`.`HMODULE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetXStateFeaturesMask; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "arm64ec", target_arch = "x86", target_arch = "x86_64"))]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
public external fun `GetXStateFeaturesMask`(`context` : /* Rust *const */ kotlinx.cinterop.CPointer<`CONTEXT`>?, `featuremask` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imagehlp.dll, ABI=system, export=ImageAddCertificate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_WinTrust")]
public external fun `ImageAddCertificate`(`filehandle` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `certificate` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Security`.`WinTrust`.`WIN_CERTIFICATE`>?, `index` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=ImageDirectoryEntryToData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImageDirectoryEntryToData`(`base` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `mappedasimage` : Boolean, `directoryentry` : `IMAGE_DIRECTORY_ENTRY`, `size` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=ImageDirectoryEntryToDataEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImageDirectoryEntryToDataEx`(`base` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `mappedasimage` : Boolean, `directoryentry` : `IMAGE_DIRECTORY_ENTRY`, `size` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `foundheader` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`IMAGE_SECTION_HEADER`>>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imagehlp.dll, ABI=system, export=ImageEnumerateCertificates; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImageEnumerateCertificates`(`filehandle` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `typefilter` : UShort, `certificatecount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `indices` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `indexcount` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imagehlp.dll, ABI=system, export=ImageGetCertificateData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_WinTrust")]
public external fun `ImageGetCertificateData`(`filehandle` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `certificateindex` : UInt, `certificate` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Security`.`WinTrust`.`WIN_CERTIFICATE`>?, `requiredlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imagehlp.dll, ABI=system, export=ImageGetCertificateHeader; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_WinTrust")]
public external fun `ImageGetCertificateHeader`(`filehandle` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `certificateindex` : UInt, `certificateheader` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Security`.`WinTrust`.`WIN_CERTIFICATE`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imagehlp.dll, ABI=system, export=ImageGetDigestStream; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImageGetDigestStream`(`filehandle` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `digestlevel` : UInt, `digestfunction` : `DIGEST_FUNCTION`, `digesthandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imagehlp.dll, ABI=system, export=ImageLoad; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Kernel", feature = "Win32_System_SystemInformation"))]
public external fun `ImageLoad`(`dllname` : `windows_sys`.`core`.`PCSTR`, `dllpath` : `windows_sys`.`core`.`PCSTR`) : /* Rust *mut */ kotlinx.cinterop.CPointer<`LOADED_IMAGE`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=ImageNtHeader; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_SystemInformation")]
public external fun `ImageNtHeader`(`base` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<`IMAGE_NT_HEADERS32`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=ImageNtHeader; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_SystemInformation")]
public external fun `ImageNtHeader`(`base` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<`IMAGE_NT_HEADERS64`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imagehlp.dll, ABI=system, export=ImageRemoveCertificate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImageRemoveCertificate`(`filehandle` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `index` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=ImageRvaToSection; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_SystemInformation")]
public external fun `ImageRvaToSection`(`ntheaders` : /* Rust *const */ kotlinx.cinterop.CPointer<`IMAGE_NT_HEADERS32`>?, `base` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `rva` : UInt) : /* Rust *mut */ kotlinx.cinterop.CPointer<`IMAGE_SECTION_HEADER`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=ImageRvaToSection; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_SystemInformation")]
public external fun `ImageRvaToSection`(`ntheaders` : /* Rust *const */ kotlinx.cinterop.CPointer<`IMAGE_NT_HEADERS64`>?, `base` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `rva` : UInt) : /* Rust *mut */ kotlinx.cinterop.CPointer<`IMAGE_SECTION_HEADER`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=ImageRvaToVa; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_SystemInformation")]
public external fun `ImageRvaToVa`(`ntheaders` : /* Rust *const */ kotlinx.cinterop.CPointer<`IMAGE_NT_HEADERS32`>?, `base` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `rva` : UInt, `lastrvasection` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`IMAGE_SECTION_HEADER`>>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=ImageRvaToVa; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_SystemInformation")]
public external fun `ImageRvaToVa`(`ntheaders` : /* Rust *const */ kotlinx.cinterop.CPointer<`IMAGE_NT_HEADERS64`>?, `base` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `rva` : UInt, `lastrvasection` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`IMAGE_SECTION_HEADER`>>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imagehlp.dll, ABI=system, export=ImageUnload; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Kernel", feature = "Win32_System_SystemInformation"))]
public external fun `ImageUnload`(`loadedimage` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LOADED_IMAGE`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=ImagehlpApiVersion; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImagehlpApiVersion`() : /* Rust *mut */ kotlinx.cinterop.CPointer<`API_VERSION`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=ImagehlpApiVersionEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ImagehlpApiVersionEx`(`appversion` : /* Rust *const */ kotlinx.cinterop.CPointer<`API_VERSION`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<`API_VERSION`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=InitializeContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
public external fun `InitializeContext`(`buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `contextflags` : `CONTEXT_FLAGS`, `context` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`CONTEXT`>>?, `contextlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=InitializeContext2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
public external fun `InitializeContext2`(`buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `contextflags` : `CONTEXT_FLAGS`, `context` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`CONTEXT`>>?, `contextlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `xstatecompactionmask` : ULong) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=IsDebuggerPresent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsDebuggerPresent`() : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=LocateXStateFeature; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "arm64ec", target_arch = "x86", target_arch = "x86_64"))]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
public external fun `LocateXStateFeature`(`context` : /* Rust *const */ kotlinx.cinterop.CPointer<`CONTEXT`>?, `featureid` : UInt, `length` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=MakeSureDirectoryPathExists; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MakeSureDirectoryPathExists`(`dirpath` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imagehlp.dll, ABI=system, export=MapAndLoad; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Kernel", feature = "Win32_System_SystemInformation"))]
public external fun `MapAndLoad`(`imagename` : `windows_sys`.`core`.`PCSTR`, `dllpath` : `windows_sys`.`core`.`PCSTR`, `loadedimage` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LOADED_IMAGE`>?, `dotdll` : `windows_sys`.`core`.`BOOL`, `readonly` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imagehlp.dll, ABI=system, export=MapFileAndCheckSumA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MapFileAndCheckSumA`(`filename` : `windows_sys`.`core`.`PCSTR`, `headersum` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `checksum` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imagehlp.dll, ABI=system, export=MapFileAndCheckSumW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MapFileAndCheckSumW`(`filename` : `windows_sys`.`core`.`PCWSTR`, `headersum` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `checksum` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=MessageBeep; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `MessageBeep`(`utype` : `super`.`super`.`super`.`UI`.`WindowsAndMessaging`.`MESSAGEBOX_STYLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=MiniDumpReadDumpStream; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MiniDumpReadDumpStream`(`baseofdump` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `streamnumber` : UInt, `dir` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`MINIDUMP_DIRECTORY`>>?, `streampointer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `streamsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=MiniDumpWriteDump; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Storage_FileSystem", feature = "Win32_System_Kernel", feature = "Win32_System_Memory"))]
public external fun `MiniDumpWriteDump`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `processid` : UInt, `hfile` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `dumptype` : `MINIDUMP_TYPE`, `exceptionparam` : /* Rust *const */ kotlinx.cinterop.CPointer<`MINIDUMP_EXCEPTION_INFORMATION`>?, `userstreamparam` : /* Rust *const */ kotlinx.cinterop.CPointer<`MINIDUMP_USER_STREAM_INFORMATION`>?, `callbackparam` : /* Rust *const */ kotlinx.cinterop.CPointer<`MINIDUMP_CALLBACK_INFORMATION`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=OpenThreadWaitChainSession; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OpenThreadWaitChainSession`(`flags` : `OPEN_THREAD_WAIT_CHAIN_SESSION_FLAGS`, `callback` : `PWAITCHAINCALLBACK`) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=OutputDebugStringA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OutputDebugStringA`(`lpoutputstring` : `windows_sys`.`core`.`PCSTR`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=OutputDebugStringW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OutputDebugStringW`(`lpoutputstring` : `windows_sys`.`core`.`PCWSTR`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=RaiseException; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RaiseException`(`dwexceptioncode` : UInt, `dwexceptionflags` : UInt, `nnumberofarguments` : UInt, `lparguments` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=RaiseFailFastException; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
public external fun `RaiseFailFastException`(`pexceptionrecord` : /* Rust *const */ kotlinx.cinterop.CPointer<`EXCEPTION_RECORD`>?, `pcontextrecord` : /* Rust *const */ kotlinx.cinterop.CPointer<`CONTEXT`>?, `dwflags` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=RangeMapAddPeImageSections; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RangeMapAddPeImageSections`(`rmaphandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `imagename` : `windows_sys`.`core`.`PCWSTR`, `mappedimage` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `mappingbytes` : UInt, `imagebase` : ULong, `usertag` : ULong, `mappingflags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=RangeMapCreate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RangeMapCreate`() : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=RangeMapFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RangeMapFree`(`rmaphandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=RangeMapRead; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RangeMapRead`(`rmaphandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `offset` : ULong, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `requestbytes` : UInt, `flags` : UInt, `donebytes` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=RangeMapRemove; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RangeMapRemove`(`rmaphandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `usertag` : ULong) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=RangeMapWrite; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RangeMapWrite`(`rmaphandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `offset` : ULong, `buffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `requestbytes` : UInt, `flags` : UInt, `donebytes` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imagehlp.dll, ABI=system, export=ReBaseImage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ReBaseImage`(`currentimagename` : `windows_sys`.`core`.`PCSTR`, `symbolpath` : `windows_sys`.`core`.`PCSTR`, `frebase` : `windows_sys`.`core`.`BOOL`, `frebasesysfileok` : `windows_sys`.`core`.`BOOL`, `fgoingdown` : `windows_sys`.`core`.`BOOL`, `checkimagesize` : UInt, `oldimagesize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `oldimagebase` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `newimagesize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `newimagebase` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `timestamp` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imagehlp.dll, ABI=system, export=ReBaseImage64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ReBaseImage64`(`currentimagename` : `windows_sys`.`core`.`PCSTR`, `symbolpath` : `windows_sys`.`core`.`PCSTR`, `frebase` : `windows_sys`.`core`.`BOOL`, `frebasesysfileok` : `windows_sys`.`core`.`BOOL`, `fgoingdown` : `windows_sys`.`core`.`BOOL`, `checkimagesize` : UInt, `oldimagesize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `oldimagebase` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `newimagesize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `newimagebase` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `timestamp` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=ReadProcessMemory; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ReadProcessMemory`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `lpbaseaddress` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `nsize` : ULong, `lpnumberofbytesread` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegisterWaitChainCOMCallback; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegisterWaitChainCOMCallback`(`callstatecallback` : `PCOGETCALLSTATE`, `activationstatecallback` : `PCOGETACTIVATIONSTATE`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=RemoveInvalidModuleList; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RemoveInvalidModuleList`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=RemoveVectoredContinueHandler; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RemoveVectoredContinueHandler`(`handle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=RemoveVectoredExceptionHandler; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RemoveVectoredExceptionHandler`(`handle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=ReportSymbolLoadSummary; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ReportSymbolLoadSummary`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `ploadmodule` : `windows_sys`.`core`.`PCWSTR`, `psymboldata` : /* Rust *const */ kotlinx.cinterop.CPointer<`DBGHELP_DATA_REPORT_STRUCT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=RtlAddFunctionTable; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "arm64ec", target_arch = "x86_64"))]
public external fun `RtlAddFunctionTable`(`functiontable` : /* Rust *const */ kotlinx.cinterop.CPointer<`IMAGE_RUNTIME_FUNCTION_ENTRY`>?, `entrycount` : UInt, `baseaddress` : ULong) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=RtlAddFunctionTable; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "aarch64")]
public external fun `RtlAddFunctionTable`(`functiontable` : /* Rust *const */ kotlinx.cinterop.CPointer<`IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY`>?, `entrycount` : UInt, `baseaddress` : ULong) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=RtlAddGrowableFunctionTable; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "arm64ec", target_arch = "x86_64"))]
public external fun `RtlAddGrowableFunctionTable`(`dynamictable` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `functiontable` : /* Rust *const */ kotlinx.cinterop.CPointer<`IMAGE_RUNTIME_FUNCTION_ENTRY`>?, `entrycount` : UInt, `maximumentrycount` : UInt, `rangebase` : ULong, `rangeend` : ULong) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=RtlAddGrowableFunctionTable; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "aarch64")]
public external fun `RtlAddGrowableFunctionTable`(`dynamictable` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `functiontable` : /* Rust *const */ kotlinx.cinterop.CPointer<`IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY`>?, `entrycount` : UInt, `maximumentrycount` : UInt, `rangebase` : ULong, `rangeend` : ULong) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=RtlCaptureContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
public external fun `RtlCaptureContext`(`contextrecord` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CONTEXT`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=RtlCaptureContext2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
public external fun `RtlCaptureContext2`(`contextrecord` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CONTEXT`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=RtlCaptureStackBackTrace; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtlCaptureStackBackTrace`(`framestoskip` : UInt, `framestocapture` : UInt, `backtrace` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `backtracehash` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UShort
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=RtlDeleteFunctionTable; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "arm64ec", target_arch = "x86_64"))]
public external fun `RtlDeleteFunctionTable`(`functiontable` : /* Rust *const */ kotlinx.cinterop.CPointer<`IMAGE_RUNTIME_FUNCTION_ENTRY`>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=RtlDeleteFunctionTable; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "aarch64")]
public external fun `RtlDeleteFunctionTable`(`functiontable` : /* Rust *const */ kotlinx.cinterop.CPointer<`IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY`>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=RtlDeleteGrowableFunctionTable; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
public external fun `RtlDeleteGrowableFunctionTable`(`dynamictable` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=RtlGrowFunctionTable; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
public external fun `RtlGrowFunctionTable`(`dynamictable` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `newentrycount` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=RtlInstallFunctionTableCallback; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "arm64ec", target_arch = "x86_64"))]
public external fun `RtlInstallFunctionTableCallback`(`tableidentifier` : ULong, `baseaddress` : ULong, `length` : UInt, `callback` : `PGET_RUNTIME_FUNCTION_CALLBACK`, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `outofprocesscallbackdll` : `windows_sys`.`core`.`PCWSTR`) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=RtlInstallFunctionTableCallback; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "aarch64")]
public external fun `RtlInstallFunctionTableCallback`(`tableidentifier` : ULong, `baseaddress` : ULong, `length` : UInt, `callback` : `PGET_RUNTIME_FUNCTION_CALLBACK`, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `outofprocesscallbackdll` : `windows_sys`.`core`.`PCWSTR`) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=RtlLookupFunctionEntry; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "arm64ec", target_arch = "x86_64"))]
public external fun `RtlLookupFunctionEntry`(`controlpc` : ULong, `imagebase` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `historytable` : /* Rust *mut */ kotlinx.cinterop.CPointer<`UNWIND_HISTORY_TABLE`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<`IMAGE_RUNTIME_FUNCTION_ENTRY`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=RtlLookupFunctionEntry; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "aarch64")]
public external fun `RtlLookupFunctionEntry`(`controlpc` : ULong, `imagebase` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `historytable` : /* Rust *mut */ kotlinx.cinterop.CPointer<`UNWIND_HISTORY_TABLE`>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<`IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=RtlPcToFileHeader; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtlPcToFileHeader`(`pcvalue` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `baseofimage` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=RtlRaiseException; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtlRaiseException`(`exceptionrecord` : /* Rust *const */ kotlinx.cinterop.CPointer<`EXCEPTION_RECORD`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=C, export=RtlRestoreContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
public external fun `RtlRestoreContext`(`contextrecord` : /* Rust *const */ kotlinx.cinterop.CPointer<`CONTEXT`>?, `exceptionrecord` : /* Rust *const */ kotlinx.cinterop.CPointer<`EXCEPTION_RECORD`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=RtlUnwind; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtlUnwind`(`targetframe` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `targetip` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `exceptionrecord` : /* Rust *const */ kotlinx.cinterop.CPointer<`EXCEPTION_RECORD`>?, `returnvalue` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=RtlUnwindEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
public external fun `RtlUnwindEx`(`targetframe` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `targetip` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `exceptionrecord` : /* Rust *const */ kotlinx.cinterop.CPointer<`EXCEPTION_RECORD`>?, `returnvalue` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `contextrecord` : /* Rust *const */ kotlinx.cinterop.CPointer<`CONTEXT`>?, `historytable` : /* Rust *const */ kotlinx.cinterop.CPointer<`UNWIND_HISTORY_TABLE`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=RtlVirtualUnwind; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
public external fun `RtlVirtualUnwind`(`handlertype` : `RTL_VIRTUAL_UNWIND_HANDLER_TYPE`, `imagebase` : ULong, `controlpc` : ULong, `functionentry` : /* Rust *const */ kotlinx.cinterop.CPointer<`IMAGE_RUNTIME_FUNCTION_ENTRY`>?, `contextrecord` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CONTEXT`>?, `handlerdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `establisherframe` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `contextpointers` : /* Rust *mut */ kotlinx.cinterop.CPointer<`KNONVOLATILE_CONTEXT_POINTERS`>?) : `super`.`super`.`Kernel`.`EXCEPTION_ROUTINE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=RtlVirtualUnwind; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "aarch64")]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
public external fun `RtlVirtualUnwind`(`handlertype` : `RTL_VIRTUAL_UNWIND_HANDLER_TYPE`, `imagebase` : ULong, `controlpc` : ULong, `functionentry` : /* Rust *const */ kotlinx.cinterop.CPointer<`IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY`>?, `contextrecord` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CONTEXT`>?, `handlerdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `establisherframe` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `contextpointers` : /* Rust *mut */ kotlinx.cinterop.CPointer<`KNONVOLATILE_CONTEXT_POINTERS`>?) : `super`.`super`.`Kernel`.`EXCEPTION_ROUTINE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SearchTreeForFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SearchTreeForFile`(`rootpath` : `windows_sys`.`core`.`PCSTR`, `inputpathname` : `windows_sys`.`core`.`PCSTR`, `outputpathbuffer` : `windows_sys`.`core`.`PSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SearchTreeForFileW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SearchTreeForFileW`(`rootpath` : `windows_sys`.`core`.`PCWSTR`, `inputpathname` : `windows_sys`.`core`.`PCWSTR`, `outputpathbuffer` : `windows_sys`.`core`.`PWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SetCheckUserInterruptShared; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetCheckUserInterruptShared`(`lpstartaddress` : `LPCALL_BACK_USER_INTERRUPT_ROUTINE`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=SetErrorMode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetErrorMode`(`umode` : `THREAD_ERROR_MODE`) : `THREAD_ERROR_MODE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imagehlp.dll, ABI=system, export=SetImageConfigInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Kernel", feature = "Win32_System_SystemInformation"))]
public external fun `SetImageConfigInformation`(`loadedimage` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LOADED_IMAGE`>?, `imageconfiginformation` : /* Rust *const */ kotlinx.cinterop.CPointer<`IMAGE_LOAD_CONFIG_DIRECTORY32`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imagehlp.dll, ABI=system, export=SetImageConfigInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Kernel", feature = "Win32_System_SystemInformation"))]
public external fun `SetImageConfigInformation`(`loadedimage` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LOADED_IMAGE`>?, `imageconfiginformation` : /* Rust *const */ kotlinx.cinterop.CPointer<`IMAGE_LOAD_CONFIG_DIRECTORY64`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SetSymLoadError; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetSymLoadError`(`error` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=SetThreadContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
public external fun `SetThreadContext`(`hthread` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `lpcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`CONTEXT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=SetThreadErrorMode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetThreadErrorMode`(`dwnewmode` : `THREAD_ERROR_MODE`, `lpoldmode` : /* Rust *mut */ kotlinx.cinterop.CPointer<`THREAD_ERROR_MODE`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=SetUnhandledExceptionFilter; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
public external fun `SetUnhandledExceptionFilter`(`lptoplevelexceptionfilter` : `LPTOP_LEVEL_EXCEPTION_FILTER`) : `LPTOP_LEVEL_EXCEPTION_FILTER`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=SetXStateFeaturesMask; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "arm64ec", target_arch = "x86", target_arch = "x86_64"))]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
public external fun `SetXStateFeaturesMask`(`context` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CONTEXT`>?, `featuremask` : ULong) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=StackWalk; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
public external fun `StackWalk`(`machinetype` : UInt, `hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `hthread` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `stackframe` : /* Rust *mut */ kotlinx.cinterop.CPointer<`STACKFRAME`>?, `contextrecord` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `readmemoryroutine` : `PREAD_PROCESS_MEMORY_ROUTINE`, `functiontableaccessroutine` : `PFUNCTION_TABLE_ACCESS_ROUTINE`, `getmodulebaseroutine` : `PGET_MODULE_BASE_ROUTINE`, `translateaddress` : `PTRANSLATE_ADDRESS_ROUTINE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=StackWalk2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `StackWalk2`(`machinetype` : UInt, `hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `hthread` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `stackframe` : /* Rust *mut */ kotlinx.cinterop.CPointer<`STACKFRAME_EX`>?, `contextrecord` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `readmemoryroutine` : `PREAD_PROCESS_MEMORY_ROUTINE64`, `functiontableaccessroutine` : `PFUNCTION_TABLE_ACCESS_ROUTINE64`, `getmodulebaseroutine` : `PGET_MODULE_BASE_ROUTINE64`, `translateaddress` : `PTRANSLATE_ADDRESS_ROUTINE64`, `gettargetattributevalue` : `PGET_TARGET_ATTRIBUTE_VALUE64`, `flags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=StackWalk64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `StackWalk64`(`machinetype` : UInt, `hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `hthread` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `stackframe` : /* Rust *mut */ kotlinx.cinterop.CPointer<`STACKFRAME64`>?, `contextrecord` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `readmemoryroutine` : `PREAD_PROCESS_MEMORY_ROUTINE64`, `functiontableaccessroutine` : `PFUNCTION_TABLE_ACCESS_ROUTINE64`, `getmodulebaseroutine` : `PGET_MODULE_BASE_ROUTINE64`, `translateaddress` : `PTRANSLATE_ADDRESS_ROUTINE64`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=StackWalkEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `StackWalkEx`(`machinetype` : UInt, `hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `hthread` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `stackframe` : /* Rust *mut */ kotlinx.cinterop.CPointer<`STACKFRAME_EX`>?, `contextrecord` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `readmemoryroutine` : `PREAD_PROCESS_MEMORY_ROUTINE64`, `functiontableaccessroutine` : `PFUNCTION_TABLE_ACCESS_ROUTINE64`, `getmodulebaseroutine` : `PGET_MODULE_BASE_ROUTINE64`, `translateaddress` : `PTRANSLATE_ADDRESS_ROUTINE64`, `flags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymAddSourceStream; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymAddSourceStream`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `base` : ULong, `streamfile` : `windows_sys`.`core`.`PCSTR`, `buffer` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `size` : ULong) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymAddSourceStreamA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymAddSourceStreamA`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `base` : ULong, `streamfile` : `windows_sys`.`core`.`PCSTR`, `buffer` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `size` : ULong) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymAddSourceStreamW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymAddSourceStreamW`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `base` : ULong, `filespec` : `windows_sys`.`core`.`PCWSTR`, `buffer` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `size` : ULong) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymAddSymbol; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymAddSymbol`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `baseofdll` : ULong, `name` : `windows_sys`.`core`.`PCSTR`, `address` : ULong, `size` : UInt, `flags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymAddSymbolW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymAddSymbolW`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `baseofdll` : ULong, `name` : `windows_sys`.`core`.`PCWSTR`, `address` : ULong, `size` : UInt, `flags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymAddrIncludeInlineTrace; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymAddrIncludeInlineTrace`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `address` : ULong) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymCleanup; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymCleanup`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymCompareInlineTrace; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymCompareInlineTrace`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `address1` : ULong, `inlinecontext1` : UInt, `retaddress1` : ULong, `address2` : ULong, `retaddress2` : ULong) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymDeleteSymbol; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymDeleteSymbol`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `baseofdll` : ULong, `name` : `windows_sys`.`core`.`PCSTR`, `address` : ULong, `flags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymDeleteSymbolW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymDeleteSymbolW`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `baseofdll` : ULong, `name` : `windows_sys`.`core`.`PCWSTR`, `address` : ULong, `flags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymEnumLines; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymEnumLines`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `base` : ULong, `obj` : `windows_sys`.`core`.`PCSTR`, `file` : `windows_sys`.`core`.`PCSTR`, `enumlinescallback` : `PSYM_ENUMLINES_CALLBACK`, `usercontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymEnumLinesW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymEnumLinesW`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `base` : ULong, `obj` : `windows_sys`.`core`.`PCWSTR`, `file` : `windows_sys`.`core`.`PCWSTR`, `enumlinescallback` : `PSYM_ENUMLINES_CALLBACKW`, `usercontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymEnumProcesses; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymEnumProcesses`(`enumprocessescallback` : `PSYM_ENUMPROCESSES_CALLBACK`, `usercontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymEnumSourceFileTokens; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymEnumSourceFileTokens`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `base` : ULong, `callback` : `PENUMSOURCEFILETOKENSCALLBACK`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymEnumSourceFiles; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymEnumSourceFiles`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `modbase` : ULong, `mask` : `windows_sys`.`core`.`PCSTR`, `cbsrcfiles` : `PSYM_ENUMSOURCEFILES_CALLBACK`, `usercontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymEnumSourceFilesW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymEnumSourceFilesW`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `modbase` : ULong, `mask` : `windows_sys`.`core`.`PCWSTR`, `cbsrcfiles` : `PSYM_ENUMSOURCEFILES_CALLBACKW`, `usercontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymEnumSourceLines; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymEnumSourceLines`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `base` : ULong, `obj` : `windows_sys`.`core`.`PCSTR`, `file` : `windows_sys`.`core`.`PCSTR`, `line` : UInt, `flags` : UInt, `enumlinescallback` : `PSYM_ENUMLINES_CALLBACK`, `usercontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymEnumSourceLinesW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymEnumSourceLinesW`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `base` : ULong, `obj` : `windows_sys`.`core`.`PCWSTR`, `file` : `windows_sys`.`core`.`PCWSTR`, `line` : UInt, `flags` : UInt, `enumlinescallback` : `PSYM_ENUMLINES_CALLBACKW`, `usercontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymEnumSym; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymEnumSym`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `baseofdll` : ULong, `enumsymbolscallback` : `PSYM_ENUMERATESYMBOLS_CALLBACK`, `usercontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymEnumSymbols; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymEnumSymbols`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `baseofdll` : ULong, `mask` : `windows_sys`.`core`.`PCSTR`, `enumsymbolscallback` : `PSYM_ENUMERATESYMBOLS_CALLBACK`, `usercontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymEnumSymbolsEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymEnumSymbolsEx`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `baseofdll` : ULong, `mask` : `windows_sys`.`core`.`PCSTR`, `enumsymbolscallback` : `PSYM_ENUMERATESYMBOLS_CALLBACK`, `usercontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `options` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymEnumSymbolsExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymEnumSymbolsExW`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `baseofdll` : ULong, `mask` : `windows_sys`.`core`.`PCWSTR`, `enumsymbolscallback` : `PSYM_ENUMERATESYMBOLS_CALLBACKW`, `usercontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `options` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymEnumSymbolsForAddr; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymEnumSymbolsForAddr`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `address` : ULong, `enumsymbolscallback` : `PSYM_ENUMERATESYMBOLS_CALLBACK`, `usercontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymEnumSymbolsForAddrW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymEnumSymbolsForAddrW`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `address` : ULong, `enumsymbolscallback` : `PSYM_ENUMERATESYMBOLS_CALLBACKW`, `usercontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymEnumSymbolsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymEnumSymbolsW`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `baseofdll` : ULong, `mask` : `windows_sys`.`core`.`PCWSTR`, `enumsymbolscallback` : `PSYM_ENUMERATESYMBOLS_CALLBACKW`, `usercontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymEnumTypes; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymEnumTypes`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `baseofdll` : ULong, `enumsymbolscallback` : `PSYM_ENUMERATESYMBOLS_CALLBACK`, `usercontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymEnumTypesByName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymEnumTypesByName`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `baseofdll` : ULong, `mask` : `windows_sys`.`core`.`PCSTR`, `enumsymbolscallback` : `PSYM_ENUMERATESYMBOLS_CALLBACK`, `usercontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymEnumTypesByNameW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymEnumTypesByNameW`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `baseofdll` : ULong, `mask` : `windows_sys`.`core`.`PCWSTR`, `enumsymbolscallback` : `PSYM_ENUMERATESYMBOLS_CALLBACKW`, `usercontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymEnumTypesW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymEnumTypesW`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `baseofdll` : ULong, `enumsymbolscallback` : `PSYM_ENUMERATESYMBOLS_CALLBACKW`, `usercontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymEnumerateModules; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
public external fun `SymEnumerateModules`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `enummodulescallback` : `PSYM_ENUMMODULES_CALLBACK`, `usercontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymEnumerateModules64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymEnumerateModules64`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `enummodulescallback` : `PSYM_ENUMMODULES_CALLBACK64`, `usercontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymEnumerateModulesW64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymEnumerateModulesW64`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `enummodulescallback` : `PSYM_ENUMMODULES_CALLBACKW64`, `usercontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymEnumerateSymbols; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
public external fun `SymEnumerateSymbols`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `baseofdll` : UInt, `enumsymbolscallback` : `PSYM_ENUMSYMBOLS_CALLBACK`, `usercontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymEnumerateSymbols64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymEnumerateSymbols64`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `baseofdll` : ULong, `enumsymbolscallback` : `PSYM_ENUMSYMBOLS_CALLBACK64`, `usercontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymEnumerateSymbolsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
public external fun `SymEnumerateSymbolsW`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `baseofdll` : UInt, `enumsymbolscallback` : `PSYM_ENUMSYMBOLS_CALLBACKW`, `usercontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymEnumerateSymbolsW64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymEnumerateSymbolsW64`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `baseofdll` : ULong, `enumsymbolscallback` : `PSYM_ENUMSYMBOLS_CALLBACK64W`, `usercontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymFindDebugInfoFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymFindDebugInfoFile`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `filename` : `windows_sys`.`core`.`PCSTR`, `debugfilepath` : `windows_sys`.`core`.`PSTR`, `callback` : `PFIND_DEBUG_FILE_CALLBACK`, `callerdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `super`.`super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymFindDebugInfoFileW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymFindDebugInfoFileW`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `filename` : `windows_sys`.`core`.`PCWSTR`, `debugfilepath` : `windows_sys`.`core`.`PWSTR`, `callback` : `PFIND_DEBUG_FILE_CALLBACKW`, `callerdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `super`.`super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymFindExecutableImage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymFindExecutableImage`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `filename` : `windows_sys`.`core`.`PCSTR`, `imagefilepath` : `windows_sys`.`core`.`PSTR`, `callback` : `PFIND_EXE_FILE_CALLBACK`, `callerdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `super`.`super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymFindExecutableImageW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymFindExecutableImageW`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `filename` : `windows_sys`.`core`.`PCWSTR`, `imagefilepath` : `windows_sys`.`core`.`PWSTR`, `callback` : `PFIND_EXE_FILE_CALLBACKW`, `callerdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `super`.`super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymFindFileInPath; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymFindFileInPath`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `searchpatha` : `windows_sys`.`core`.`PCSTR`, `filename` : `windows_sys`.`core`.`PCSTR`, `id` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `two` : UInt, `three` : UInt, `flags` : `SYM_FIND_ID_OPTION`, `foundfile` : `windows_sys`.`core`.`PSTR`, `callback` : `PFINDFILEINPATHCALLBACK`, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymFindFileInPathW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymFindFileInPathW`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `searchpatha` : `windows_sys`.`core`.`PCWSTR`, `filename` : `windows_sys`.`core`.`PCWSTR`, `id` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `two` : UInt, `three` : UInt, `flags` : `SYM_FIND_ID_OPTION`, `foundfile` : `windows_sys`.`core`.`PWSTR`, `callback` : `PFINDFILEINPATHCALLBACKW`, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymFromAddr; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymFromAddr`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `address` : ULong, `displacement` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `symbol` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SYMBOL_INFO`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymFromAddrW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymFromAddrW`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `address` : ULong, `displacement` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `symbol` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SYMBOL_INFOW`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymFromIndex; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymFromIndex`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `baseofdll` : ULong, `index` : UInt, `symbol` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SYMBOL_INFO`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymFromIndexW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymFromIndexW`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `baseofdll` : ULong, `index` : UInt, `symbol` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SYMBOL_INFOW`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymFromInlineContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymFromInlineContext`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `address` : ULong, `inlinecontext` : UInt, `displacement` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `symbol` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SYMBOL_INFO`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymFromInlineContextW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymFromInlineContextW`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `address` : ULong, `inlinecontext` : UInt, `displacement` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `symbol` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SYMBOL_INFOW`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymFromName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymFromName`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `name` : `windows_sys`.`core`.`PCSTR`, `symbol` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SYMBOL_INFO`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymFromNameW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymFromNameW`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `name` : `windows_sys`.`core`.`PCWSTR`, `symbol` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SYMBOL_INFOW`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymFromToken; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymFromToken`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `base` : ULong, `token` : UInt, `symbol` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SYMBOL_INFO`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymFromTokenW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymFromTokenW`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `base` : ULong, `token` : UInt, `symbol` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SYMBOL_INFOW`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymFunctionTableAccess; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
public external fun `SymFunctionTableAccess`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `addrbase` : UInt) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymFunctionTableAccess64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymFunctionTableAccess64`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `addrbase` : ULong) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymFunctionTableAccess64AccessRoutines; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymFunctionTableAccess64AccessRoutines`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `addrbase` : ULong, `readmemoryroutine` : `PREAD_PROCESS_MEMORY_ROUTINE64`, `getmodulebaseroutine` : `PGET_MODULE_BASE_ROUTINE64`) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymGetExtendedOption; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymGetExtendedOption`(`option` : `IMAGEHLP_EXTENDED_OPTIONS`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymGetFileLineOffsets64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymGetFileLineOffsets64`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `modulename` : `windows_sys`.`core`.`PCSTR`, `filename` : `windows_sys`.`core`.`PCSTR`, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `bufferlines` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymGetHomeDirectory; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymGetHomeDirectory`(`type` : UInt, `dir` : `windows_sys`.`core`.`PSTR`, `size` : ULong) : `windows_sys`.`core`.`PSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymGetHomeDirectoryW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymGetHomeDirectoryW`(`type` : UInt, `dir` : `windows_sys`.`core`.`PWSTR`, `size` : ULong) : `windows_sys`.`core`.`PWSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymGetLineFromAddr; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
public external fun `SymGetLineFromAddr`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `dwaddr` : UInt, `pdwdisplacement` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `line` : /* Rust *mut */ kotlinx.cinterop.CPointer<`IMAGEHLP_LINE`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymGetLineFromAddr64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymGetLineFromAddr64`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `qwaddr` : ULong, `pdwdisplacement` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `line64` : /* Rust *mut */ kotlinx.cinterop.CPointer<`IMAGEHLP_LINE64`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymGetLineFromAddrW64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymGetLineFromAddrW64`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `dwaddr` : ULong, `pdwdisplacement` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `line` : /* Rust *mut */ kotlinx.cinterop.CPointer<`IMAGEHLP_LINEW64`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymGetLineFromInlineContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymGetLineFromInlineContext`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `qwaddr` : ULong, `inlinecontext` : UInt, `qwmodulebaseaddress` : ULong, `pdwdisplacement` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `line64` : /* Rust *mut */ kotlinx.cinterop.CPointer<`IMAGEHLP_LINE64`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymGetLineFromInlineContextW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymGetLineFromInlineContextW`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `dwaddr` : ULong, `inlinecontext` : UInt, `qwmodulebaseaddress` : ULong, `pdwdisplacement` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `line` : /* Rust *mut */ kotlinx.cinterop.CPointer<`IMAGEHLP_LINEW64`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymGetLineFromName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
public external fun `SymGetLineFromName`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `modulename` : `windows_sys`.`core`.`PCSTR`, `filename` : `windows_sys`.`core`.`PCSTR`, `dwlinenumber` : UInt, `pldisplacement` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `line` : /* Rust *mut */ kotlinx.cinterop.CPointer<`IMAGEHLP_LINE`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymGetLineFromName64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymGetLineFromName64`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `modulename` : `windows_sys`.`core`.`PCSTR`, `filename` : `windows_sys`.`core`.`PCSTR`, `dwlinenumber` : UInt, `pldisplacement` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `line` : /* Rust *mut */ kotlinx.cinterop.CPointer<`IMAGEHLP_LINE64`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymGetLineFromNameW64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymGetLineFromNameW64`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `modulename` : `windows_sys`.`core`.`PCWSTR`, `filename` : `windows_sys`.`core`.`PCWSTR`, `dwlinenumber` : UInt, `pldisplacement` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `line` : /* Rust *mut */ kotlinx.cinterop.CPointer<`IMAGEHLP_LINEW64`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymGetLineNext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
public external fun `SymGetLineNext`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `line` : /* Rust *mut */ kotlinx.cinterop.CPointer<`IMAGEHLP_LINE`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymGetLineNext64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymGetLineNext64`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `line` : /* Rust *mut */ kotlinx.cinterop.CPointer<`IMAGEHLP_LINE64`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymGetLineNextW64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymGetLineNextW64`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `line` : /* Rust *mut */ kotlinx.cinterop.CPointer<`IMAGEHLP_LINEW64`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymGetLinePrev; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
public external fun `SymGetLinePrev`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `line` : /* Rust *mut */ kotlinx.cinterop.CPointer<`IMAGEHLP_LINE`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymGetLinePrev64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymGetLinePrev64`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `line` : /* Rust *mut */ kotlinx.cinterop.CPointer<`IMAGEHLP_LINE64`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymGetLinePrevW64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymGetLinePrevW64`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `line` : /* Rust *mut */ kotlinx.cinterop.CPointer<`IMAGEHLP_LINEW64`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymGetModuleBase; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
public external fun `SymGetModuleBase`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `dwaddr` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymGetModuleBase64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymGetModuleBase64`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `qwaddr` : ULong) : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymGetModuleInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
public external fun `SymGetModuleInfo`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `dwaddr` : UInt, `moduleinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`IMAGEHLP_MODULE`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymGetModuleInfo64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymGetModuleInfo64`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `qwaddr` : ULong, `moduleinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`IMAGEHLP_MODULE64`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymGetModuleInfoW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
public external fun `SymGetModuleInfoW`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `dwaddr` : UInt, `moduleinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`IMAGEHLP_MODULEW`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymGetModuleInfoW64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymGetModuleInfoW64`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `qwaddr` : ULong, `moduleinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`IMAGEHLP_MODULEW64`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymGetOmaps; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymGetOmaps`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `baseofdll` : ULong, `omapto` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`OMAP`>>?, `comapto` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `omapfrom` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`OMAP`>>?, `comapfrom` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymGetOptions; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymGetOptions`() : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymGetScope; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymGetScope`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `baseofdll` : ULong, `index` : UInt, `symbol` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SYMBOL_INFO`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymGetScopeW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymGetScopeW`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `baseofdll` : ULong, `index` : UInt, `symbol` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SYMBOL_INFOW`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymGetSearchPath; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymGetSearchPath`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `searchpatha` : `windows_sys`.`core`.`PSTR`, `searchpathlength` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymGetSearchPathW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymGetSearchPathW`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `searchpatha` : `windows_sys`.`core`.`PWSTR`, `searchpathlength` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymGetSourceFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymGetSourceFile`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `base` : ULong, `params` : `windows_sys`.`core`.`PCSTR`, `filespec` : `windows_sys`.`core`.`PCSTR`, `filepath` : `windows_sys`.`core`.`PSTR`, `size` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymGetSourceFileChecksum; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymGetSourceFileChecksum`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `base` : ULong, `filespec` : `windows_sys`.`core`.`PCSTR`, `pchecksumtype` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pchecksum` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `checksumsize` : UInt, `pactualbyteswritten` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymGetSourceFileChecksumW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymGetSourceFileChecksumW`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `base` : ULong, `filespec` : `windows_sys`.`core`.`PCWSTR`, `pchecksumtype` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pchecksum` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `checksumsize` : UInt, `pactualbyteswritten` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymGetSourceFileFromToken; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymGetSourceFileFromToken`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `token` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `params` : `windows_sys`.`core`.`PCSTR`, `filepath` : `windows_sys`.`core`.`PSTR`, `size` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymGetSourceFileFromTokenByTokenName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymGetSourceFileFromTokenByTokenName`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `token` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `tokenname` : `windows_sys`.`core`.`PCSTR`, `params` : `windows_sys`.`core`.`PCSTR`, `filepath` : `windows_sys`.`core`.`PSTR`, `size` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymGetSourceFileFromTokenByTokenNameW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymGetSourceFileFromTokenByTokenNameW`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `token` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `tokenname` : `windows_sys`.`core`.`PCWSTR`, `params` : `windows_sys`.`core`.`PCWSTR`, `filepath` : `windows_sys`.`core`.`PWSTR`, `size` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymGetSourceFileFromTokenW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymGetSourceFileFromTokenW`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `token` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `params` : `windows_sys`.`core`.`PCWSTR`, `filepath` : `windows_sys`.`core`.`PWSTR`, `size` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymGetSourceFileToken; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymGetSourceFileToken`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `base` : ULong, `filespec` : `windows_sys`.`core`.`PCSTR`, `token` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `size` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymGetSourceFileTokenByTokenName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymGetSourceFileTokenByTokenName`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `base` : ULong, `filespec` : `windows_sys`.`core`.`PCSTR`, `tokenname` : `windows_sys`.`core`.`PCSTR`, `tokenparameters` : `windows_sys`.`core`.`PCSTR`, `token` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `size` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymGetSourceFileTokenByTokenNameW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymGetSourceFileTokenByTokenNameW`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `base` : ULong, `filespec` : `windows_sys`.`core`.`PCWSTR`, `tokenname` : `windows_sys`.`core`.`PCWSTR`, `tokenparameters` : `windows_sys`.`core`.`PCWSTR`, `token` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `size` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymGetSourceFileTokenW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymGetSourceFileTokenW`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `base` : ULong, `filespec` : `windows_sys`.`core`.`PCWSTR`, `token` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `size` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymGetSourceFileW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymGetSourceFileW`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `base` : ULong, `params` : `windows_sys`.`core`.`PCWSTR`, `filespec` : `windows_sys`.`core`.`PCWSTR`, `filepath` : `windows_sys`.`core`.`PWSTR`, `size` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymGetSourceVarFromToken; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymGetSourceVarFromToken`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `token` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `params` : `windows_sys`.`core`.`PCSTR`, `varname` : `windows_sys`.`core`.`PCSTR`, `value` : `windows_sys`.`core`.`PSTR`, `size` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymGetSourceVarFromTokenW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymGetSourceVarFromTokenW`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `token` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `params` : `windows_sys`.`core`.`PCWSTR`, `varname` : `windows_sys`.`core`.`PCWSTR`, `value` : `windows_sys`.`core`.`PWSTR`, `size` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymGetSymFromAddr; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
public external fun `SymGetSymFromAddr`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `dwaddr` : UInt, `pdwdisplacement` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `symbol` : /* Rust *mut */ kotlinx.cinterop.CPointer<`IMAGEHLP_SYMBOL`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymGetSymFromAddr64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymGetSymFromAddr64`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `qwaddr` : ULong, `pdwdisplacement` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `symbol` : /* Rust *mut */ kotlinx.cinterop.CPointer<`IMAGEHLP_SYMBOL64`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymGetSymFromName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
public external fun `SymGetSymFromName`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `name` : `windows_sys`.`core`.`PCSTR`, `symbol` : /* Rust *mut */ kotlinx.cinterop.CPointer<`IMAGEHLP_SYMBOL`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymGetSymFromName64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymGetSymFromName64`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `name` : `windows_sys`.`core`.`PCSTR`, `symbol` : /* Rust *mut */ kotlinx.cinterop.CPointer<`IMAGEHLP_SYMBOL64`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymGetSymNext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
public external fun `SymGetSymNext`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `symbol` : /* Rust *mut */ kotlinx.cinterop.CPointer<`IMAGEHLP_SYMBOL`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymGetSymNext64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymGetSymNext64`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `symbol` : /* Rust *mut */ kotlinx.cinterop.CPointer<`IMAGEHLP_SYMBOL64`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymGetSymPrev; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
public external fun `SymGetSymPrev`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `symbol` : /* Rust *mut */ kotlinx.cinterop.CPointer<`IMAGEHLP_SYMBOL`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymGetSymPrev64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymGetSymPrev64`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `symbol` : /* Rust *mut */ kotlinx.cinterop.CPointer<`IMAGEHLP_SYMBOL64`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymGetSymbolFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymGetSymbolFile`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `sympath` : `windows_sys`.`core`.`PCSTR`, `imagefile` : `windows_sys`.`core`.`PCSTR`, `type` : UInt, `symbolfile` : `windows_sys`.`core`.`PSTR`, `csymbolfile` : ULong, `dbgfile` : `windows_sys`.`core`.`PSTR`, `cdbgfile` : ULong) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymGetSymbolFileW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymGetSymbolFileW`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `sympath` : `windows_sys`.`core`.`PCWSTR`, `imagefile` : `windows_sys`.`core`.`PCWSTR`, `type` : UInt, `symbolfile` : `windows_sys`.`core`.`PWSTR`, `csymbolfile` : ULong, `dbgfile` : `windows_sys`.`core`.`PWSTR`, `cdbgfile` : ULong) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymGetTypeFromName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymGetTypeFromName`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `baseofdll` : ULong, `name` : `windows_sys`.`core`.`PCSTR`, `symbol` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SYMBOL_INFO`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymGetTypeFromNameW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymGetTypeFromNameW`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `baseofdll` : ULong, `name` : `windows_sys`.`core`.`PCWSTR`, `symbol` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SYMBOL_INFOW`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymGetTypeInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymGetTypeInfo`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `modbase` : ULong, `typeid` : UInt, `gettype` : `IMAGEHLP_SYMBOL_TYPE_INFO`, `pinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymGetTypeInfoEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymGetTypeInfoEx`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `modbase` : ULong, `params` : /* Rust *mut */ kotlinx.cinterop.CPointer<`IMAGEHLP_GET_TYPE_INFO_PARAMS`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymGetUnwindInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymGetUnwindInfo`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `address` : ULong, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `size` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymInitialize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymInitialize`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `usersearchpath` : `windows_sys`.`core`.`PCSTR`, `finvadeprocess` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymInitializeW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymInitializeW`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `usersearchpath` : `windows_sys`.`core`.`PCWSTR`, `finvadeprocess` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymLoadModule; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
public external fun `SymLoadModule`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `hfile` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `imagename` : `windows_sys`.`core`.`PCSTR`, `modulename` : `windows_sys`.`core`.`PCSTR`, `baseofdll` : UInt, `sizeofdll` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymLoadModule64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymLoadModule64`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `hfile` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `imagename` : `windows_sys`.`core`.`PCSTR`, `modulename` : `windows_sys`.`core`.`PCSTR`, `baseofdll` : ULong, `sizeofdll` : UInt) : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymLoadModuleEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymLoadModuleEx`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `hfile` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `imagename` : `windows_sys`.`core`.`PCSTR`, `modulename` : `windows_sys`.`core`.`PCSTR`, `baseofdll` : ULong, `dllsize` : UInt, `data` : /* Rust *const */ kotlinx.cinterop.CPointer<`MODLOAD_DATA`>?, `flags` : `SYM_LOAD_FLAGS`) : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymLoadModuleExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymLoadModuleExW`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `hfile` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `imagename` : `windows_sys`.`core`.`PCWSTR`, `modulename` : `windows_sys`.`core`.`PCWSTR`, `baseofdll` : ULong, `dllsize` : UInt, `data` : /* Rust *const */ kotlinx.cinterop.CPointer<`MODLOAD_DATA`>?, `flags` : `SYM_LOAD_FLAGS`) : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymMatchFileName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymMatchFileName`(`filename` : `windows_sys`.`core`.`PCSTR`, `match` : `windows_sys`.`core`.`PCSTR`, `filenamestop` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PSTR`>?, `matchstop` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PSTR`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymMatchFileNameW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymMatchFileNameW`(`filename` : `windows_sys`.`core`.`PCWSTR`, `match` : `windows_sys`.`core`.`PCWSTR`, `filenamestop` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?, `matchstop` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymMatchString; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymMatchString`(`string` : `windows_sys`.`core`.`PCSTR`, `expression` : `windows_sys`.`core`.`PCSTR`, `fcase` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymMatchStringA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymMatchStringA`(`string` : `windows_sys`.`core`.`PCSTR`, `expression` : `windows_sys`.`core`.`PCSTR`, `fcase` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymMatchStringW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymMatchStringW`(`string` : `windows_sys`.`core`.`PCWSTR`, `expression` : `windows_sys`.`core`.`PCWSTR`, `fcase` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymNext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymNext`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `si` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SYMBOL_INFO`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymNextW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymNextW`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `siw` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SYMBOL_INFOW`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymPrev; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymPrev`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `si` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SYMBOL_INFO`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymPrevW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymPrevW`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `siw` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SYMBOL_INFOW`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymQueryInlineTrace; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymQueryInlineTrace`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `startaddress` : ULong, `startcontext` : UInt, `startretaddress` : ULong, `curaddress` : ULong, `curcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `curframeindex` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymRefreshModuleList; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymRefreshModuleList`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymRegisterCallback; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
public external fun `SymRegisterCallback`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `callbackfunction` : `PSYMBOL_REGISTERED_CALLBACK`, `usercontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymRegisterCallback64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymRegisterCallback64`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `callbackfunction` : `PSYMBOL_REGISTERED_CALLBACK64`, `usercontext` : ULong) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymRegisterCallbackW64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymRegisterCallbackW64`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `callbackfunction` : `PSYMBOL_REGISTERED_CALLBACK64`, `usercontext` : ULong) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymRegisterFunctionEntryCallback; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
public external fun `SymRegisterFunctionEntryCallback`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `callbackfunction` : `PSYMBOL_FUNCENTRY_CALLBACK`, `usercontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymRegisterFunctionEntryCallback64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymRegisterFunctionEntryCallback64`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `callbackfunction` : `PSYMBOL_FUNCENTRY_CALLBACK64`, `usercontext` : ULong) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymSearch; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymSearch`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `baseofdll` : ULong, `index` : UInt, `symtag` : UInt, `mask` : `windows_sys`.`core`.`PCSTR`, `address` : ULong, `enumsymbolscallback` : `PSYM_ENUMERATESYMBOLS_CALLBACK`, `usercontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `options` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymSearchW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymSearchW`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `baseofdll` : ULong, `index` : UInt, `symtag` : UInt, `mask` : `windows_sys`.`core`.`PCWSTR`, `address` : ULong, `enumsymbolscallback` : `PSYM_ENUMERATESYMBOLS_CALLBACKW`, `usercontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `options` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymSetContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymSetContext`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `stackframe` : /* Rust *const */ kotlinx.cinterop.CPointer<`IMAGEHLP_STACK_FRAME`>?, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymSetExtendedOption; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymSetExtendedOption`(`option` : `IMAGEHLP_EXTENDED_OPTIONS`, `value` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymSetHomeDirectory; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymSetHomeDirectory`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `dir` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`PSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymSetHomeDirectoryW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymSetHomeDirectoryW`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `dir` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`PWSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymSetOptions; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymSetOptions`(`symoptions` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymSetParentWindow; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymSetParentWindow`(`hwnd` : `super`.`super`.`super`.`Foundation`.`HWND`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymSetScopeFromAddr; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymSetScopeFromAddr`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `address` : ULong) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymSetScopeFromIndex; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymSetScopeFromIndex`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `baseofdll` : ULong, `index` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymSetScopeFromInlineContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymSetScopeFromInlineContext`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `address` : ULong, `inlinecontext` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymSetSearchPath; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymSetSearchPath`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `searchpatha` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymSetSearchPathW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymSetSearchPathW`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `searchpatha` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymSrvDeltaName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymSrvDeltaName`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `sympath` : `windows_sys`.`core`.`PCSTR`, `type` : `windows_sys`.`core`.`PCSTR`, `file1` : `windows_sys`.`core`.`PCSTR`, `file2` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`PCSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymSrvDeltaNameW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymSrvDeltaNameW`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `sympath` : `windows_sys`.`core`.`PCWSTR`, `type` : `windows_sys`.`core`.`PCWSTR`, `file1` : `windows_sys`.`core`.`PCWSTR`, `file2` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`PCWSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymSrvGetFileIndexInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymSrvGetFileIndexInfo`(`file` : `windows_sys`.`core`.`PCSTR`, `info` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SYMSRV_INDEX_INFO`>?, `flags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymSrvGetFileIndexInfoW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymSrvGetFileIndexInfoW`(`file` : `windows_sys`.`core`.`PCWSTR`, `info` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SYMSRV_INDEX_INFOW`>?, `flags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymSrvGetFileIndexString; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymSrvGetFileIndexString`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `srvpath` : `windows_sys`.`core`.`PCSTR`, `file` : `windows_sys`.`core`.`PCSTR`, `index` : `windows_sys`.`core`.`PSTR`, `size` : ULong, `flags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymSrvGetFileIndexStringW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymSrvGetFileIndexStringW`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `srvpath` : `windows_sys`.`core`.`PCWSTR`, `file` : `windows_sys`.`core`.`PCWSTR`, `index` : `windows_sys`.`core`.`PWSTR`, `size` : ULong, `flags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymSrvGetFileIndexes; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymSrvGetFileIndexes`(`file` : `windows_sys`.`core`.`PCSTR`, `id` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `val1` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `val2` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `flags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymSrvGetFileIndexesW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymSrvGetFileIndexesW`(`file` : `windows_sys`.`core`.`PCWSTR`, `id` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `val1` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `val2` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `flags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymSrvGetSupplement; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymSrvGetSupplement`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `sympath` : `windows_sys`.`core`.`PCSTR`, `node` : `windows_sys`.`core`.`PCSTR`, `file` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`PCSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymSrvGetSupplementW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymSrvGetSupplementW`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `sympath` : `windows_sys`.`core`.`PCWSTR`, `node` : `windows_sys`.`core`.`PCWSTR`, `file` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`PCWSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymSrvIsStore; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymSrvIsStore`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `path` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymSrvIsStoreW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymSrvIsStoreW`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `path` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymSrvStoreFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymSrvStoreFile`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `srvpath` : `windows_sys`.`core`.`PCSTR`, `file` : `windows_sys`.`core`.`PCSTR`, `flags` : `SYM_SRV_STORE_FILE_FLAGS`) : `windows_sys`.`core`.`PCSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymSrvStoreFileW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymSrvStoreFileW`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `srvpath` : `windows_sys`.`core`.`PCWSTR`, `file` : `windows_sys`.`core`.`PCWSTR`, `flags` : `SYM_SRV_STORE_FILE_FLAGS`) : `windows_sys`.`core`.`PCWSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymSrvStoreSupplement; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymSrvStoreSupplement`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `srvpath` : `windows_sys`.`core`.`PCSTR`, `node` : `windows_sys`.`core`.`PCSTR`, `file` : `windows_sys`.`core`.`PCSTR`, `flags` : UInt) : `windows_sys`.`core`.`PCSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymSrvStoreSupplementW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymSrvStoreSupplementW`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `sympath` : `windows_sys`.`core`.`PCWSTR`, `node` : `windows_sys`.`core`.`PCWSTR`, `file` : `windows_sys`.`core`.`PCWSTR`, `flags` : UInt) : `windows_sys`.`core`.`PCWSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymUnDName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
public external fun `SymUnDName`(`sym` : /* Rust *const */ kotlinx.cinterop.CPointer<`IMAGEHLP_SYMBOL`>?, `undecname` : `windows_sys`.`core`.`PSTR`, `undecnamelength` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymUnDName64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymUnDName64`(`sym` : /* Rust *const */ kotlinx.cinterop.CPointer<`IMAGEHLP_SYMBOL64`>?, `undecname` : `windows_sys`.`core`.`PSTR`, `undecnamelength` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymUnloadModule; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
public external fun `SymUnloadModule`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `baseofdll` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=SymUnloadModule64; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SymUnloadModule64`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `baseofdll` : ULong) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-errorhandling-l1-1-3.dll, ABI=system, export=TerminateProcessOnMemoryExhaustion; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TerminateProcessOnMemoryExhaustion`(`failedallocationsize` : ULong)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imagehlp.dll, ABI=system, export=TouchFileTimes; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TouchFileTimes`(`filehandle` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `psystemtime` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`SYSTEMTIME`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=UnDecorateSymbolName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UnDecorateSymbolName`(`name` : `windows_sys`.`core`.`PCSTR`, `outputstring` : `windows_sys`.`core`.`PSTR`, `maxstringlength` : UInt, `flags` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dbghelp.dll, ABI=system, export=UnDecorateSymbolNameW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UnDecorateSymbolNameW`(`name` : `windows_sys`.`core`.`PCWSTR`, `outputstring` : `windows_sys`.`core`.`PWSTR`, `maxstringlength` : UInt, `flags` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imagehlp.dll, ABI=system, export=UnMapAndLoad; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Kernel", feature = "Win32_System_SystemInformation"))]
public external fun `UnMapAndLoad`(`loadedimage` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LOADED_IMAGE`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=UnhandledExceptionFilter; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
public external fun `UnhandledExceptionFilter`(`exceptioninfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`EXCEPTION_POINTERS`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imagehlp.dll, ABI=system, export=UpdateDebugInfoFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_SystemInformation")]
public external fun `UpdateDebugInfoFile`(`imagefilename` : `windows_sys`.`core`.`PCSTR`, `symbolpath` : `windows_sys`.`core`.`PCSTR`, `debugfilepath` : `windows_sys`.`core`.`PSTR`, `ntheaders` : /* Rust *const */ kotlinx.cinterop.CPointer<`IMAGE_NT_HEADERS32`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=imagehlp.dll, ABI=system, export=UpdateDebugInfoFileEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_SystemInformation")]
public external fun `UpdateDebugInfoFileEx`(`imagefilename` : `windows_sys`.`core`.`PCSTR`, `symbolpath` : `windows_sys`.`core`.`PCSTR`, `debugfilepath` : `windows_sys`.`core`.`PSTR`, `ntheaders` : /* Rust *const */ kotlinx.cinterop.CPointer<`IMAGE_NT_HEADERS32`>?, `oldchecksum` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=WaitForDebugEvent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Threading")]
public external fun `WaitForDebugEvent`(`lpdebugevent` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DEBUG_EVENT`>?, `dwmilliseconds` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=WaitForDebugEventEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Threading")]
public external fun `WaitForDebugEventEx`(`lpdebugevent` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DEBUG_EVENT`>?, `dwmilliseconds` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=Wow64GetThreadContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `Wow64GetThreadContext`(`hthread` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `lpcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WOW64_CONTEXT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=Wow64GetThreadSelectorEntry; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `Wow64GetThreadSelectorEntry`(`hthread` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `dwselector` : UInt, `lpselectorentry` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WOW64_LDT_ENTRY`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=Wow64SetThreadContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `Wow64SetThreadContext`(`hthread` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `lpcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`WOW64_CONTEXT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=WriteProcessMemory; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WriteProcessMemory`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `lpbaseaddress` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `nsize` : ULong, `lpnumberofbyteswritten` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `windows_sys`.`core`.`BOOL`
public const val `ABNORMAL_RESET_DETECTED`: `BUGCHECK_ERROR` = 327u;
public const val `ACPI_BIOS_ERROR`: `BUGCHECK_ERROR` = 165u;
public const val `ACPI_BIOS_FATAL_ERROR`: `BUGCHECK_ERROR` = 224u;
public const val `ACPI_DRIVER_INTERNAL`: `BUGCHECK_ERROR` = 163u;
public const val `ACPI_FIRMWARE_WATCHDOG_TIMEOUT`: `BUGCHECK_ERROR` = 464u;
public const val `ACTIVE_EX_WORKER_THREAD_TERMINATION`: `BUGCHECK_ERROR` = 233u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ADDRESS` (
    public var `Offset`: UInt,
    public var `Segment`: UShort,
    public var `Mode`: `ADDRESS_MODE`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ADDRESS64` (
    public var `Offset`: ULong,
    public var `Segment`: UShort,
    public var `Mode`: `ADDRESS_MODE`,
)
public typealias `ADDRESS_MODE` = Int;
// UNSUPPORTED Rust 449:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union AER_BRIDGE_DESCRIPTOR_FLAGS {
//     pub Anonymous: AER_BRIDGE_DESCRIPTOR_FLAGS_0,
//     pub AsUSHORT: u16,
// }

// UNSUPPORTED Rust 455:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for AER_BRIDGE_DESCRIPTOR_FLAGS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `AER_BRIDGE_DESCRIPTOR_FLAGS_0` (
    public var `_bitfield`: UShort,
)
// UNSUPPORTED Rust 465:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union AER_ENDPOINT_DESCRIPTOR_FLAGS {
//     pub Anonymous: AER_ENDPOINT_DESCRIPTOR_FLAGS_0,
//     pub AsUSHORT: u16,
// }

// UNSUPPORTED Rust 471:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for AER_ENDPOINT_DESCRIPTOR_FLAGS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `AER_ENDPOINT_DESCRIPTOR_FLAGS_0` (
    public var `_bitfield`: UShort,
)
// UNSUPPORTED Rust 481:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union AER_ROOTPORT_DESCRIPTOR_FLAGS {
//     pub Anonymous: AER_ROOTPORT_DESCRIPTOR_FLAGS_0,
//     pub AsUSHORT: u16,
// }

// UNSUPPORTED Rust 487:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for AER_ROOTPORT_DESCRIPTOR_FLAGS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `AER_ROOTPORT_DESCRIPTOR_FLAGS_0` (
    public var `_bitfield`: UShort,
)
public const val `AGP_GART_CORRUPTION`: `BUGCHECK_ERROR` = 261u;
public const val `AGP_ILLEGALLY_REPROGRAMMED`: `BUGCHECK_ERROR` = 262u;
public const val `AGP_INTERNAL`: `BUGCHECK_ERROR` = 277u;
public const val `AGP_INVALID_ACCESS`: `BUGCHECK_ERROR` = 260u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `APC_CALLBACK_DATA` (
    public var `Parameter`: ULong,
    public var `ContextRecord`: /* Rust *mut */ kotlinx.cinterop.CPointer<`CONTEXT`>?,
    public var `Reserved0`: ULong,
    public var `Reserved1`: ULong,
)
// UNSUPPORTED Rust 510:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Kernel")]
// impl Default for APC_CALLBACK_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `APC_INDEX_MISMATCH`: `BUGCHECK_ERROR` = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `API_VERSION` (
    public var `MajorVersion`: UShort,
    public var `MinorVersion`: UShort,
    public var `Revision`: UShort,
    public var `Reserved`: UShort,
)
public const val `API_VERSION_NUMBER`: UInt = 12u;
public const val `APP_TAGGING_INITIALIZATION_FAILED`: `BUGCHECK_ERROR` = 266u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 8 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "arm64ec", target_arch = "x86", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ARM64_NT_CONTEXT` (
    public var `ContextFlags`: UInt,
    public var `Cpsr`: UInt,
    public var `Anonymous`: `ARM64_NT_CONTEXT_0`,
    public var `Sp`: ULong,
    public var `Pc`: ULong,
    public var `V`: Array<`ARM64_NT_NEON128`>,
    public var `Fpcr`: UInt,
    public var `Fpsr`: UInt,
    public var `Bcr`: UIntArray,
    public var `Bvr`: ULongArray,
    public var `Wcr`: UIntArray,
    public var `Wvr`: ULongArray,
)
// UNSUPPORTED Rust 544:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "arm64ec", target_arch = "x86", target_arch = "x86_64"))]
// impl Default for ARM64_NT_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 550:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(any(target_arch = "arm64ec", target_arch = "x86", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub union ARM64_NT_CONTEXT_0 {
//     pub Anonymous: ARM64_NT_CONTEXT_0_0,
//     pub X: [u64; 31],
// }

// UNSUPPORTED Rust 557:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "arm64ec", target_arch = "x86", target_arch = "x86_64"))]
// impl Default for ARM64_NT_CONTEXT_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "arm64ec", target_arch = "x86", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ARM64_NT_CONTEXT_0_0` (
    public var `X0`: ULong,
    public var `X1`: ULong,
    public var `X2`: ULong,
    public var `X3`: ULong,
    public var `X4`: ULong,
    public var `X5`: ULong,
    public var `X6`: ULong,
    public var `X7`: ULong,
    public var `X8`: ULong,
    public var `X9`: ULong,
    public var `X10`: ULong,
    public var `X11`: ULong,
    public var `X12`: ULong,
    public var `X13`: ULong,
    public var `X14`: ULong,
    public var `X15`: ULong,
    public var `X16`: ULong,
    public var `X17`: ULong,
    public var `X18`: ULong,
    public var `X19`: ULong,
    public var `X20`: ULong,
    public var `X21`: ULong,
    public var `X22`: ULong,
    public var `X23`: ULong,
    public var `X24`: ULong,
    public var `X25`: ULong,
    public var `X26`: ULong,
    public var `X27`: ULong,
    public var `X28`: ULong,
    public var `Fp`: ULong,
    public var `Lr`: ULong,
)
// UNSUPPORTED Rust 599:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union ARM64_NT_NEON128 {
//     pub Anonymous: ARM64_NT_NEON128_0,
//     pub D: [f64; 2],
//     pub S: [f32; 4],
//     pub H: [u16; 8],
//     pub B: [u8; 16],
// }

// UNSUPPORTED Rust 608:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ARM64_NT_NEON128 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ARM64_NT_NEON128_0` (
    public var `Low`: ULong,
    public var `High`: Long,
)
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 512 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CONTEXT` (
    public var `ContextFlags`: `CONTEXT_FLAGS`,
    public var `Dr0`: UInt,
    public var `Dr1`: UInt,
    public var `Dr2`: UInt,
    public var `Dr3`: UInt,
    public var `Dr6`: UInt,
    public var `Dr7`: UInt,
    public var `FloatSave`: `super`.`super`.`Kernel`.`FLOATING_SAVE_AREA`,
    public var `SegGs`: UInt,
    public var `SegFs`: UInt,
    public var `SegEs`: UInt,
    public var `SegDs`: UInt,
    public var `Edi`: UInt,
    public var `Esi`: UInt,
    public var `Ebx`: UInt,
    public var `Edx`: UInt,
    public var `Ecx`: UInt,
    public var `Eax`: UInt,
    public var `Ebp`: UInt,
    public var `Eip`: UInt,
    public var `SegCs`: UInt,
    public var `EFlags`: UInt,
    public var `Esp`: UInt,
    public var `SegSs`: UInt,
    public var `ExtendedRegisters`: UByteArray,
)
// UNSUPPORTED Rust 771:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// #[cfg(feature = "Win32_System_Kernel")]
// impl Default for CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 26 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CONTEXT` (
    public var `P1Home`: ULong,
    public var `P2Home`: ULong,
    public var `P3Home`: ULong,
    public var `P4Home`: ULong,
    public var `P5Home`: ULong,
    public var `P6Home`: ULong,
    public var `ContextFlags`: `CONTEXT_FLAGS`,
    public var `MxCsr`: UInt,
    public var `SegCs`: UShort,
    public var `SegDs`: UShort,
    public var `SegEs`: UShort,
    public var `SegFs`: UShort,
    public var `SegGs`: UShort,
    public var `SegSs`: UShort,
    public var `EFlags`: UInt,
    public var `Dr0`: ULong,
    public var `Dr1`: ULong,
    public var `Dr2`: ULong,
    public var `Dr3`: ULong,
    public var `Dr6`: ULong,
    public var `Dr7`: ULong,
    public var `Rax`: ULong,
    public var `Rcx`: ULong,
    public var `Rdx`: ULong,
    public var `Rbx`: ULong,
    public var `Rsp`: ULong,
    public var `Rbp`: ULong,
    public var `Rsi`: ULong,
    public var `Rdi`: ULong,
    public var `R8`: ULong,
    public var `R9`: ULong,
    public var `R10`: ULong,
    public var `R11`: ULong,
    public var `R12`: ULong,
    public var `R13`: ULong,
    public var `R14`: ULong,
    public var `R15`: ULong,
    public var `Rip`: ULong,
    public var `Anonymous`: `CONTEXT_0`,
    public var `VectorRegister`: Array<`M128A`>,
    public var `VectorControl`: ULong,
    public var `DebugControl`: ULong,
    public var `LastBranchToRip`: ULong,
    public var `LastBranchFromRip`: ULong,
    public var `LastExceptionToRip`: ULong,
    public var `LastExceptionFromRip`: ULong,
)
// UNSUPPORTED Rust 829:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 835:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(any(target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub union CONTEXT_0 {
//     pub FltSave: XSAVE_FORMAT,
//     pub Anonymous: CONTEXT_0_0,
// }

// UNSUPPORTED Rust 842:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for CONTEXT_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 8 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CONTEXT_0_0` (
    public var `Header`: Array<`M128A`>,
    public var `Legacy`: Array<`M128A`>,
    public var `Xmm0`: `M128A`,
    public var `Xmm1`: `M128A`,
    public var `Xmm2`: `M128A`,
    public var `Xmm3`: `M128A`,
    public var `Xmm4`: `M128A`,
    public var `Xmm5`: `M128A`,
    public var `Xmm6`: `M128A`,
    public var `Xmm7`: `M128A`,
    public var `Xmm8`: `M128A`,
    public var `Xmm9`: `M128A`,
    public var `Xmm10`: `M128A`,
    public var `Xmm11`: `M128A`,
    public var `Xmm12`: `M128A`,
    public var `Xmm13`: `M128A`,
    public var `Xmm14`: `M128A`,
    public var `Xmm15`: `M128A`,
)
// UNSUPPORTED Rust 871:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for CONTEXT_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 8 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(target_arch = "aarch64")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CONTEXT` (
    public var `ContextFlags`: `CONTEXT_FLAGS`,
    public var `Cpsr`: UInt,
    public var `Anonymous`: `CONTEXT_0`,
    public var `Sp`: ULong,
    public var `Pc`: ULong,
    public var `V`: Array<`ARM64_NT_NEON128`>,
    public var `Fpcr`: UInt,
    public var `Fpsr`: UInt,
    public var `Bcr`: UIntArray,
    public var `Bvr`: ULongArray,
    public var `Wcr`: UIntArray,
    public var `Wvr`: ULongArray,
)
// UNSUPPORTED Rust 894:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "aarch64")]
// impl Default for CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 900:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(target_arch = "aarch64")]
// #[derive(Clone, Copy)]
// pub union CONTEXT_0 {
//     pub Anonymous: CONTEXT_0_0,
//     pub X: [u64; 31],
// }

// UNSUPPORTED Rust 907:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "aarch64")]
// impl Default for CONTEXT_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(target_arch = "aarch64")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CONTEXT_0_0` (
    public var `X0`: ULong,
    public var `X1`: ULong,
    public var `X2`: ULong,
    public var `X3`: ULong,
    public var `X4`: ULong,
    public var `X5`: ULong,
    public var `X6`: ULong,
    public var `X7`: ULong,
    public var `X8`: ULong,
    public var `X9`: ULong,
    public var `X10`: ULong,
    public var `X11`: ULong,
    public var `X12`: ULong,
    public var `X13`: ULong,
    public var `X14`: ULong,
    public var `X15`: ULong,
    public var `X16`: ULong,
    public var `X17`: ULong,
    public var `X18`: ULong,
    public var `X19`: ULong,
    public var `X20`: ULong,
    public var `X21`: ULong,
    public var `X22`: ULong,
    public var `X23`: ULong,
    public var `X24`: ULong,
    public var `X25`: ULong,
    public var `X26`: ULong,
    public var `X27`: ULong,
    public var `X28`: ULong,
    public var `Fp`: ULong,
    public var `Lr`: ULong,
)
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
// UNSUPPORTED Rust 1009:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union CPU_INFORMATION {
//     pub X86CpuInfo: CPU_INFORMATION_0,
//     pub OtherCpuInfo: CPU_INFORMATION_1,
// }

// UNSUPPORTED Rust 1015:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CPU_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CPU_INFORMATION_1` (
    public var `ProcessorFeatures`: ULongArray,
)
// UNSUPPORTED Rust 1025:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CPU_INFORMATION_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CPU_INFORMATION_0` (
    public var `VendorId`: UIntArray,
    public var `VersionInformation`: UInt,
    public var `FeatureInformation`: UInt,
    public var `AMDExtendedCpuFeatures`: UInt,
)
// UNSUPPORTED Rust 1038:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CPU_INFORMATION_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CRASHDUMP_WATCHDOG_TIMEOUT`: `BUGCHECK_ERROR` = 486u;
public const val `CREATE_DELETE_LOCK_NOT_LOCKED`: `BUGCHECK_ERROR` = 20u;
public const val `CREATE_PROCESS_DEBUG_EVENT`: `DEBUG_EVENT_CODE` = 3u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Threading")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CREATE_PROCESS_DEBUG_INFO` (
    public var `hFile`: `super`.`super`.`super`.`Foundation`.`HANDLE`,
    public var `hProcess`: `super`.`super`.`super`.`Foundation`.`HANDLE`,
    public var `hThread`: `super`.`super`.`super`.`Foundation`.`HANDLE`,
    public var `lpBaseOfImage`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `dwDebugInfoFileOffset`: UInt,
    public var `nDebugInfoSize`: UInt,
    public var `lpThreadLocalBase`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `lpStartAddress`: `super`.`super`.`Threading`.`LPTHREAD_START_ROUTINE`,
    public var `lpImageName`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `fUnicode`: UShort,
)
// UNSUPPORTED Rust 1061:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Threading")]
// impl Default for CREATE_PROCESS_DEBUG_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CREATE_THREAD_DEBUG_EVENT`: `DEBUG_EVENT_CODE` = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Threading")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CREATE_THREAD_DEBUG_INFO` (
    public var `hThread`: `super`.`super`.`super`.`Foundation`.`HANDLE`,
    public var `lpThreadLocalBase`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `lpStartAddress`: `super`.`super`.`Threading`.`LPTHREAD_START_ROUTINE`,
)
// UNSUPPORTED Rust 1076:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DBGHELP_DATA_REPORT_STRUCT` (
    public var `pBinPathNonExist`: `windows_sys`.`core`.`PCWSTR`,
    public var `pSymbolPathNonExist`: `windows_sys`.`core`.`PCWSTR`,
)
// UNSUPPORTED Rust 1101:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Threading")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DEBUG_EVENT` (
    public var `dwDebugEventCode`: `DEBUG_EVENT_CODE`,
    public var `dwProcessId`: UInt,
    public var `dwThreadId`: UInt,
    public var `u`: `DEBUG_EVENT_0`,
)
// UNSUPPORTED Rust 1154:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Threading")]
// impl Default for DEBUG_EVENT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1160:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
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

// UNSUPPORTED Rust 1174:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `DIGEST_FUNCTION` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, UInt) -> `windows_sys`.`core`.`BOOL`>>>;
public const val `DIRECTED_FX_TRANSITION_LIVEDUMP`: `BUGCHECK_ERROR` = 425u;
public const val `DIRTY_MAPPED_PAGES_CONGESTION`: `BUGCHECK_ERROR` = 235u;
public const val `DIRTY_NOWRITE_PAGES_CONGESTION`: `BUGCHECK_ERROR` = 253u;
public const val `DISORDERLY_SHUTDOWN`: `BUGCHECK_ERROR` = 243u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DISPATCHER_CONTEXT` (
    public var `ControlPc`: ULong,
    public var `ImageBase`: ULong,
    public var `FunctionEntry`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IMAGE_RUNTIME_FUNCTION_ENTRY`>?,
    public var `EstablisherFrame`: ULong,
    public var `TargetIp`: ULong,
    public var `ContextRecord`: /* Rust *mut */ kotlinx.cinterop.CPointer<`CONTEXT`>?,
    public var `LanguageHandler`: `super`.`super`.`Kernel`.`EXCEPTION_ROUTINE`,
    public var `HandlerData`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `HistoryTable`: /* Rust *mut */ kotlinx.cinterop.CPointer<`UNWIND_HISTORY_TABLE`>?,
    public var `ScopeIndex`: UInt,
    public var `Fill0`: UInt,
)
// UNSUPPORTED Rust 1209:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "arm64ec", target_arch = "x86_64"))]
// #[cfg(feature = "Win32_System_Kernel")]
// impl Default for DISPATCHER_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(target_arch = "aarch64")]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DISPATCHER_CONTEXT` (
    public var `ControlPc`: ULong,
    public var `ImageBase`: ULong,
    public var `FunctionEntry`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY`>?,
    public var `EstablisherFrame`: ULong,
    public var `TargetPc`: ULong,
    public var `ContextRecord`: /* Rust *mut */ kotlinx.cinterop.CPointer<`CONTEXT`>?,
    public var `LanguageHandler`: `super`.`super`.`Kernel`.`EXCEPTION_ROUTINE`,
    public var `HandlerData`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `HistoryTable`: /* Rust *mut */ kotlinx.cinterop.CPointer<`UNWIND_HISTORY_TABLE`>?,
    public var `ScopeIndex`: UInt,
    public var `ControlPcIsUnwound`: Boolean,
    public var `NonVolatileRegisters`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 1234:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// UNSUPPORTED Rust 1283:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DUMP_FILE_ATTRIBUTES {
//     pub Anonymous: DUMP_FILE_ATTRIBUTES_0,
//     pub Attributes: u32,
// }

// UNSUPPORTED Rust 1289:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DUMP_FILE_ATTRIBUTES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DUMP_FILE_ATTRIBUTES_0` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1200 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 128 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 1760 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 56 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DUMP_HEADER32` (
    public var `Signature`: UInt,
    public var `ValidDump`: UInt,
    public var `MajorVersion`: UInt,
    public var `MinorVersion`: UInt,
    public var `DirectoryTableBase`: UInt,
    public var `PfnDataBase`: UInt,
    public var `PsLoadedModuleList`: UInt,
    public var `PsActiveProcessHead`: UInt,
    public var `MachineImageType`: UInt,
    public var `NumberProcessors`: UInt,
    public var `BugCheckCode`: UInt,
    public var `BugCheckParameter1`: UInt,
    public var `BugCheckParameter2`: UInt,
    public var `BugCheckParameter3`: UInt,
    public var `BugCheckParameter4`: UInt,
    public var `VersionUser`: ByteArray,
    public var `PaeEnabled`: UByte,
    public var `KdSecondaryVersion`: UByte,
    public var `Spare3`: UByteArray,
    public var `KdDebuggerDataBlock`: UInt,
    public var `Anonymous`: `DUMP_HEADER32_0`,
    public var `ContextRecord`: UByteArray,
    public var `Exception`: `EXCEPTION_RECORD32`,
    public var `Comment`: ByteArray,
    public var `Attributes`: `DUMP_FILE_ATTRIBUTES`,
    public var `BootId`: UInt,
    public var `_reserved0`: UByteArray,
    public var `DumpType`: UInt,
    public var `MiniDumpFields`: UInt,
    public var `SecondaryDataState`: UInt,
    public var `ProductType`: UInt,
    public var `SuiteMask`: UInt,
    public var `WriterStatus`: UInt,
    public var `RequiredDumpSpace`: Long,
    public var `_reserved2`: UByteArray,
    public var `SystemUpTime`: Long,
    public var `SystemTime`: Long,
    public var `_reserved3`: UByteArray,
)
// UNSUPPORTED Rust 1341:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DUMP_HEADER32 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1346:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DUMP_HEADER32_0 {
//     pub PhysicalMemoryBlock: PHYSICAL_MEMORY_DESCRIPTOR32,
//     pub PhysicalMemoryBlockBuffer: [u8; 700],
// }

// UNSUPPORTED Rust 1352:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DUMP_HEADER32_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 3000 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 128 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 4008 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DUMP_HEADER64` (
    public var `Signature`: UInt,
    public var `ValidDump`: UInt,
    public var `MajorVersion`: UInt,
    public var `MinorVersion`: UInt,
    public var `DirectoryTableBase`: ULong,
    public var `PfnDataBase`: ULong,
    public var `PsLoadedModuleList`: ULong,
    public var `PsActiveProcessHead`: ULong,
    public var `MachineImageType`: UInt,
    public var `NumberProcessors`: UInt,
    public var `BugCheckCode`: UInt,
    public var `BugCheckParameter1`: ULong,
    public var `BugCheckParameter2`: ULong,
    public var `BugCheckParameter3`: ULong,
    public var `BugCheckParameter4`: ULong,
    public var `VersionUser`: ByteArray,
    public var `KdDebuggerDataBlock`: ULong,
    public var `Anonymous`: `DUMP_HEADER64_0`,
    public var `ContextRecord`: UByteArray,
    public var `Exception`: `EXCEPTION_RECORD64`,
    public var `DumpType`: UInt,
    public var `RequiredDumpSpace`: Long,
    public var `SystemTime`: Long,
    public var `Comment`: ByteArray,
    public var `SystemUpTime`: Long,
    public var `MiniDumpFields`: UInt,
    public var `SecondaryDataState`: UInt,
    public var `ProductType`: UInt,
    public var `SuiteMask`: UInt,
    public var `WriterStatus`: UInt,
    public var `Unused1`: UByte,
    public var `KdSecondaryVersion`: UByte,
    public var `Unused`: UByteArray,
    public var `Attributes`: `DUMP_FILE_ATTRIBUTES`,
    public var `BootId`: UInt,
    public var `_reserved0`: UByteArray,
)
// UNSUPPORTED Rust 1397:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DUMP_HEADER64 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1402:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DUMP_HEADER64_0 {
//     pub PhysicalMemoryBlock: PHYSICAL_MEMORY_DESCRIPTOR64,
//     pub PhysicalMemoryBlockBuffer: [u8; 700],
// }

// UNSUPPORTED Rust 1408:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DebugPropertyInfo` (
    public var `m_dwValidFields`: UInt,
    public var `m_bstrName`: `windows_sys`.`core`.`BSTR`,
    public var `m_bstrType`: `windows_sys`.`core`.`BSTR`,
    public var `m_bstrValue`: `windows_sys`.`core`.`BSTR`,
    public var `m_bstrFullName`: `windows_sys`.`core`.`BSTR`,
    public var `m_dwAttrib`: UInt,
    public var `m_pDebugProp`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 1437:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EXCEPTION_DEBUG_INFO` (
    public var `ExceptionRecord`: `EXCEPTION_RECORD`,
    public var `dwFirstChance`: UInt,
)
public const val `EXCEPTION_EXECUTE_HANDLER`: Int = 1;
public const val `EXCEPTION_ON_INVALID_STACK`: `BUGCHECK_ERROR` = 426u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `EXCEPTION_POINTERS` (
    public var `ExceptionRecord`: /* Rust *mut */ kotlinx.cinterop.CPointer<`EXCEPTION_RECORD`>?,
    public var `ContextRecord`: /* Rust *mut */ kotlinx.cinterop.CPointer<`CONTEXT`>?,
)
// UNSUPPORTED Rust 1479:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Kernel")]
// impl Default for EXCEPTION_POINTERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Rust fixed array length 15 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `EXCEPTION_RECORD` (
    public var `ExceptionCode`: `super`.`super`.`super`.`Foundation`.`NTSTATUS`,
    public var `ExceptionFlags`: UInt,
    public var `ExceptionRecord`: /* Rust *mut */ kotlinx.cinterop.CPointer<`EXCEPTION_RECORD`>?,
    public var `ExceptionAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `NumberParameters`: UInt,
    public var `ExceptionInformation`: ULongArray,
)
// UNSUPPORTED Rust 1495:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for EXCEPTION_RECORD {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 15 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `EXCEPTION_RECORD32` (
    public var `ExceptionCode`: `super`.`super`.`super`.`Foundation`.`NTSTATUS`,
    public var `ExceptionFlags`: UInt,
    public var `ExceptionRecord`: UInt,
    public var `ExceptionAddress`: UInt,
    public var `NumberParameters`: UInt,
    public var `ExceptionInformation`: UIntArray,
)
// UNSUPPORTED Rust 1510:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for EXCEPTION_RECORD32 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 15 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `EXCEPTION_RECORD64` (
    public var `ExceptionCode`: `super`.`super`.`super`.`Foundation`.`NTSTATUS`,
    public var `ExceptionFlags`: UInt,
    public var `ExceptionRecord`: ULong,
    public var `ExceptionAddress`: ULong,
    public var `NumberParameters`: UInt,
    public var `__unusedAlignment`: UInt,
    public var `ExceptionInformation`: ULongArray,
)
// UNSUPPORTED Rust 1526:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for EXCEPTION_RECORD64 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `EXCEPTION_SCOPE_INVALID`: `BUGCHECK_ERROR` = 333u;
public const val `EXFAT_FILE_SYSTEM`: `BUGCHECK_ERROR` = 300u;
public const val `EXIT_PROCESS_DEBUG_EVENT`: `DEBUG_EVENT_CODE` = 5u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EXIT_PROCESS_DEBUG_INFO` (
    public var `dwExitCode`: UInt,
)
public const val `EXIT_THREAD_DEBUG_EVENT`: `DEBUG_EVENT_CODE` = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EXIT_THREAD_DEBUG_INFO` (
    public var `dwExitCode`: UInt,
)
public const val `EXRESOURCE_TIMEOUT_LIVEDUMP`: `BUGCHECK_ERROR` = 460u;
public const val `EXT_OUTPUT_VER`: UInt = 1u;
public const val `EX_PROP_INFO_DEBUGEXTPROP`: `EX_PROP_INFO_FLAGS` = 4096;
public typealias `EX_PROP_INFO_FLAGS` = Int;
public const val `EX_PROP_INFO_ID`: `EX_PROP_INFO_FLAGS` = 256;
public const val `EX_PROP_INFO_LOCKBYTES`: `EX_PROP_INFO_FLAGS` = 2048;
public const val `EX_PROP_INFO_NTYPE`: `EX_PROP_INFO_FLAGS` = 512;
public const val `EX_PROP_INFO_NVALUE`: `EX_PROP_INFO_FLAGS` = 1024;
public const val `ExceptionStream`: `MINIDUMP_STREAM_TYPE` = 6;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com_StructuredStorage", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ExtendedDebugPropertyInfo` (
    public var `dwValidFields`: UInt,
    public var `pszName`: `windows_sys`.`core`.`PWSTR`,
    public var `pszType`: `windows_sys`.`core`.`PWSTR`,
    public var `pszValue`: `windows_sys`.`core`.`PWSTR`,
    public var `pszFullName`: `windows_sys`.`core`.`PWSTR`,
    public var `dwAttrib`: UInt,
    public var `pDebugProp`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `nDISPID`: UInt,
    public var `nType`: UInt,
    public var `varValue`: `super`.`super`.`Variant`.`VARIANT`,
    public var `plbValue`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `pDebugExtProp`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 1571:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FPO_DATA` (
    public var `ulOffStart`: UInt,
    public var `cbProcSize`: UInt,
    public var `cdwLocals`: UInt,
    public var `cdwParams`: UShort,
    public var `_bitfield`: UShort,
)
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGEHLP_CBA_EVENT` (
    public var `severity`: `IMAGEHLP_CBA_EVENT_SEVERITY`,
    public var `code`: UInt,
    public var `desc`: `windows_sys`.`core`.`PSTR`,
    public var `object`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 1792:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGEHLP_CBA_EVENT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGEHLP_CBA_EVENTW` (
    public var `severity`: `IMAGEHLP_CBA_EVENT_SEVERITY`,
    public var `code`: UInt,
    public var `desc`: `windows_sys`.`core`.`PCWSTR`,
    public var `object`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 1805:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGEHLP_CBA_EVENTW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `IMAGEHLP_CBA_EVENT_SEVERITY` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGEHLP_CBA_READ_MEMORY` (
    public var `addr`: ULong,
    public var `buf`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `bytes`: UInt,
    public var `bytesread`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
)
// UNSUPPORTED Rust 1819:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGEHLP_CBA_READ_MEMORY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 260 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGEHLP_DEFERRED_SYMBOL_LOAD` (
    public var `SizeOfStruct`: UInt,
    public var `BaseOfImage`: UInt,
    public var `CheckSum`: UInt,
    public var `TimeDateStamp`: UInt,
    public var `FileName`: ByteArray,
    public var `Reparse`: Boolean,
    public var `hFile`: `super`.`super`.`super`.`Foundation`.`HANDLE`,
)
// UNSUPPORTED Rust 1836:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// impl Default for IMAGEHLP_DEFERRED_SYMBOL_LOAD {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 260 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGEHLP_DEFERRED_SYMBOL_LOAD64` (
    public var `SizeOfStruct`: UInt,
    public var `BaseOfImage`: ULong,
    public var `CheckSum`: UInt,
    public var `TimeDateStamp`: UInt,
    public var `FileName`: ByteArray,
    public var `Reparse`: Boolean,
    public var `hFile`: `super`.`super`.`super`.`Foundation`.`HANDLE`,
    public var `Flags`: UInt,
)
// UNSUPPORTED Rust 1854:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGEHLP_DEFERRED_SYMBOL_LOAD64 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 261 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGEHLP_DEFERRED_SYMBOL_LOADW64` (
    public var `SizeOfStruct`: UInt,
    public var `BaseOfImage`: ULong,
    public var `CheckSum`: UInt,
    public var `TimeDateStamp`: UInt,
    public var `FileName`: UShortArray,
    public var `Reparse`: Boolean,
    public var `hFile`: `super`.`super`.`super`.`Foundation`.`HANDLE`,
    public var `Flags`: UInt,
)
// UNSUPPORTED Rust 1871:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGEHLP_DEFERRED_SYMBOL_LOADW64 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGEHLP_DUPLICATE_SYMBOL` (
    public var `SizeOfStruct`: UInt,
    public var `NumberOfDups`: UInt,
    public var `Symbol`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IMAGEHLP_SYMBOL`>?,
    public var `SelectedSymbol`: UInt,
)
// UNSUPPORTED Rust 1885:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// impl Default for IMAGEHLP_DUPLICATE_SYMBOL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGEHLP_DUPLICATE_SYMBOL64` (
    public var `SizeOfStruct`: UInt,
    public var `NumberOfDups`: UInt,
    public var `Symbol`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IMAGEHLP_SYMBOL64`>?,
    public var `SelectedSymbol`: UInt,
)
// UNSUPPORTED Rust 1899:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGEHLP_DUPLICATE_SYMBOL64 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `IMAGEHLP_EXTENDED_OPTIONS` = Int;
public const val `IMAGEHLP_GET_TYPE_INFO_CHILDREN`: `IMAGEHLP_GET_TYPE_INFO_FLAGS` = 2u;
public typealias `IMAGEHLP_GET_TYPE_INFO_FLAGS` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGEHLP_GET_TYPE_INFO_PARAMS` (
    public var `SizeOfStruct`: UInt,
    public var `Flags`: `IMAGEHLP_GET_TYPE_INFO_FLAGS`,
    public var `NumIds`: UInt,
    public var `TypeIds`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `TagFilter`: ULong,
    public var `NumReqs`: UInt,
    public var `ReqKinds`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IMAGEHLP_SYMBOL_TYPE_INFO`>?,
    public var `ReqOffsets`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?,
    public var `ReqSizes`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `ReqStride`: ULong,
    public var `BufferSize`: ULong,
    public var `Buffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `EntriesMatched`: UInt,
    public var `EntriesFilled`: UInt,
    public var `TagsFound`: ULong,
    public var `AllReqsValid`: ULong,
    public var `NumReqsValid`: UInt,
    public var `ReqsValid`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?,
)
// UNSUPPORTED Rust 1929:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGEHLP_GET_TYPE_INFO_PARAMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IMAGEHLP_GET_TYPE_INFO_UNCACHED`: `IMAGEHLP_GET_TYPE_INFO_FLAGS` = 1u;
public typealias `IMAGEHLP_HD_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IMAGEHLP_JIT_SYMBOLMAP` (
    public var `SizeOfStruct`: UInt,
    public var `Address`: ULong,
    public var `BaseOfImage`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGEHLP_LINE` (
    public var `SizeOfStruct`: UInt,
    public var `Key`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `LineNumber`: UInt,
    public var `FileName`: `windows_sys`.`core`.`PSTR`,
    public var `Address`: UInt,
)
// UNSUPPORTED Rust 1953:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// impl Default for IMAGEHLP_LINE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGEHLP_LINE64` (
    public var `SizeOfStruct`: UInt,
    public var `Key`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `LineNumber`: UInt,
    public var `FileName`: `windows_sys`.`core`.`PSTR`,
    public var `Address`: ULong,
)
// UNSUPPORTED Rust 1968:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGEHLP_LINE64 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGEHLP_LINEW` (
    public var `SizeOfStruct`: UInt,
    public var `Key`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `LineNumber`: UInt,
    public var `FileName`: `windows_sys`.`core`.`PSTR`,
    public var `Address`: ULong,
)
// UNSUPPORTED Rust 1983:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// impl Default for IMAGEHLP_LINEW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGEHLP_LINEW64` (
    public var `SizeOfStruct`: UInt,
    public var `Key`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `LineNumber`: UInt,
    public var `FileName`: `windows_sys`.`core`.`PWSTR`,
    public var `Address`: ULong,
)
// UNSUPPORTED Rust 1998:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGEHLP_LINEW64 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGEHLP_MODULE` (
    public var `SizeOfStruct`: UInt,
    public var `BaseOfImage`: UInt,
    public var `ImageSize`: UInt,
    public var `TimeDateStamp`: UInt,
    public var `CheckSum`: UInt,
    public var `NumSyms`: UInt,
    public var `SymType`: `SYM_TYPE`,
    public var `ModuleName`: ByteArray,
    public var `ImageName`: ByteArray,
    public var `LoadedImageName`: ByteArray,
)
// UNSUPPORTED Rust 2018:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// impl Default for IMAGEHLP_MODULE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 780 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGEHLP_MODULE64` (
    public var `SizeOfStruct`: UInt,
    public var `BaseOfImage`: ULong,
    public var `ImageSize`: UInt,
    public var `TimeDateStamp`: UInt,
    public var `CheckSum`: UInt,
    public var `NumSyms`: UInt,
    public var `SymType`: `SYM_TYPE`,
    public var `ModuleName`: ByteArray,
    public var `ImageName`: ByteArray,
    public var `LoadedImageName`: ByteArray,
    public var `LoadedPdbName`: ByteArray,
    public var `CVSig`: UInt,
    public var `CVData`: ByteArray,
    public var `PdbSig`: UInt,
    public var `PdbSig70`: `windows_sys`.`core`.`GUID`,
    public var `PdbAge`: UInt,
    public var `PdbUnmatched`: `windows_sys`.`core`.`BOOL`,
    public var `DbgUnmatched`: `windows_sys`.`core`.`BOOL`,
    public var `LineNumbers`: `windows_sys`.`core`.`BOOL`,
    public var `GlobalSymbols`: `windows_sys`.`core`.`BOOL`,
    public var `TypeInfo`: `windows_sys`.`core`.`BOOL`,
    public var `SourceIndexed`: `windows_sys`.`core`.`BOOL`,
    public var `Publics`: `windows_sys`.`core`.`BOOL`,
    public var `MachineType`: UInt,
    public var `Reserved`: UInt,
)
// UNSUPPORTED Rust 2053:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGEHLP_MODULE64 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IMAGEHLP_MODULE64_EX` (
    public var `Module`: `IMAGEHLP_MODULE64`,
    public var `RegionFlags`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGEHLP_MODULEW` (
    public var `SizeOfStruct`: UInt,
    public var `BaseOfImage`: UInt,
    public var `ImageSize`: UInt,
    public var `TimeDateStamp`: UInt,
    public var `CheckSum`: UInt,
    public var `NumSyms`: UInt,
    public var `SymType`: `SYM_TYPE`,
    public var `ModuleName`: UShortArray,
    public var `ImageName`: UShortArray,
    public var `LoadedImageName`: UShortArray,
)
// UNSUPPORTED Rust 2079:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// impl Default for IMAGEHLP_MODULEW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 780 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGEHLP_MODULEW64` (
    public var `SizeOfStruct`: UInt,
    public var `BaseOfImage`: ULong,
    public var `ImageSize`: UInt,
    public var `TimeDateStamp`: UInt,
    public var `CheckSum`: UInt,
    public var `NumSyms`: UInt,
    public var `SymType`: `SYM_TYPE`,
    public var `ModuleName`: UShortArray,
    public var `ImageName`: UShortArray,
    public var `LoadedImageName`: UShortArray,
    public var `LoadedPdbName`: UShortArray,
    public var `CVSig`: UInt,
    public var `CVData`: UShortArray,
    public var `PdbSig`: UInt,
    public var `PdbSig70`: `windows_sys`.`core`.`GUID`,
    public var `PdbAge`: UInt,
    public var `PdbUnmatched`: `windows_sys`.`core`.`BOOL`,
    public var `DbgUnmatched`: `windows_sys`.`core`.`BOOL`,
    public var `LineNumbers`: `windows_sys`.`core`.`BOOL`,
    public var `GlobalSymbols`: `windows_sys`.`core`.`BOOL`,
    public var `TypeInfo`: `windows_sys`.`core`.`BOOL`,
    public var `SourceIndexed`: `windows_sys`.`core`.`BOOL`,
    public var `Publics`: `windows_sys`.`core`.`BOOL`,
    public var `MachineType`: UInt,
    public var `Reserved`: UInt,
)
// UNSUPPORTED Rust 2114:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGEHLP_MODULEW64 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IMAGEHLP_MODULEW64_EX` (
    public var `Module`: `IMAGEHLP_MODULEW64`,
    public var `RegionFlags`: UInt,
)
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 5 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGEHLP_STACK_FRAME` (
    public var `InstructionOffset`: ULong,
    public var `ReturnOffset`: ULong,
    public var `FrameOffset`: ULong,
    public var `StackOffset`: ULong,
    public var `BackingStoreOffset`: ULong,
    public var `FuncTableEntry`: ULong,
    public var `Params`: ULongArray,
    public var `Reserved`: ULongArray,
    public var `Virtual`: `windows_sys`.`core`.`BOOL`,
    public var `Reserved2`: UInt,
)
// UNSUPPORTED Rust 2152:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGEHLP_STACK_FRAME {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `IMAGEHLP_STATUS_REASON` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGEHLP_SYMBOL` (
    public var `SizeOfStruct`: UInt,
    public var `Address`: UInt,
    public var `Size`: UInt,
    public var `Flags`: UInt,
    public var `MaxNameLength`: UInt,
    public var `Name`: ByteArray,
)
// UNSUPPORTED Rust 2169:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// impl Default for IMAGEHLP_SYMBOL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGEHLP_SYMBOL64` (
    public var `SizeOfStruct`: UInt,
    public var `Address`: ULong,
    public var `Size`: UInt,
    public var `Flags`: UInt,
    public var `MaxNameLength`: UInt,
    public var `Name`: ByteArray,
)
// UNSUPPORTED Rust 2185:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGEHLP_SYMBOL64 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 2001 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGEHLP_SYMBOL64_PACKAGE` (
    public var `sym`: `IMAGEHLP_SYMBOL64`,
    public var `name`: ByteArray,
)
// UNSUPPORTED Rust 2196:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGEHLP_SYMBOL64_PACKAGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGEHLP_SYMBOLW` (
    public var `SizeOfStruct`: UInt,
    public var `Address`: UInt,
    public var `Size`: UInt,
    public var `Flags`: UInt,
    public var `MaxNameLength`: UInt,
    public var `Name`: UShortArray,
)
// UNSUPPORTED Rust 2212:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// impl Default for IMAGEHLP_SYMBOLW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGEHLP_SYMBOLW64` (
    public var `SizeOfStruct`: UInt,
    public var `Address`: ULong,
    public var `Size`: UInt,
    public var `Flags`: UInt,
    public var `MaxNameLength`: UInt,
    public var `Name`: UShortArray,
)
// UNSUPPORTED Rust 2228:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGEHLP_SYMBOLW64 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 2001 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGEHLP_SYMBOLW64_PACKAGE` (
    public var `sym`: `IMAGEHLP_SYMBOLW64`,
    public var `name`: UShortArray,
)
// UNSUPPORTED Rust 2239:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGEHLP_SYMBOLW64_PACKAGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 2001 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGEHLP_SYMBOLW_PACKAGE` (
    public var `sym`: `IMAGEHLP_SYMBOLW`,
    public var `name`: UShortArray,
)
// UNSUPPORTED Rust 2251:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 2001 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGEHLP_SYMBOL_PACKAGE` (
    public var `sym`: `IMAGEHLP_SYMBOL`,
    public var `name`: ByteArray,
)
// UNSUPPORTED Rust 2273:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// impl Default for IMAGEHLP_SYMBOL_PACKAGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 260 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGEHLP_SYMBOL_SRC` (
    public var `sizeofstruct`: UInt,
    public var `type`: UInt,
    public var `file`: ByteArray,
)
// UNSUPPORTED Rust 2286:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGEHLP_SYMBOL_SRC {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IMAGEHLP_SYMBOL_THUNK`: UInt = 8192u;
public typealias `IMAGEHLP_SYMBOL_TYPE_INFO` = Int;
public const val `IMAGEHLP_SYMBOL_TYPE_INFO_MAX`: `IMAGEHLP_SYMBOL_TYPE_INFO` = 35;
public const val `IMAGEHLP_SYMBOL_VIRTUAL`: UInt = 4096u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY` (
    public var `BeginAddress`: UInt,
    public var `Anonymous`: `IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY_0`,
)
// UNSUPPORTED Rust 2301:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2306:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY_0 {
//     pub UnwindData: u32,
//     pub Anonymous: IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY_0_0,
// }

// UNSUPPORTED Rust 2312:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY_0_0` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IMAGE_COFF_SYMBOLS_HEADER` (
    public var `NumberOfSymbols`: UInt,
    public var `LvaToFirstSymbol`: UInt,
    public var `NumberOfLinenumbers`: UInt,
    public var `LvaToFirstLinenumber`: UInt,
    public var `RvaToFirstByteOfCode`: UInt,
    public var `RvaToLastByteOfCode`: UInt,
    public var `RvaToFirstByteOfData`: UInt,
    public var `RvaToLastByteOfData`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGE_COR20_HEADER` (
    public var `cb`: UInt,
    public var `MajorRuntimeVersion`: UShort,
    public var `MinorRuntimeVersion`: UShort,
    public var `MetaData`: `IMAGE_DATA_DIRECTORY`,
    public var `Flags`: UInt,
    public var `Anonymous`: `IMAGE_COR20_HEADER_0`,
    public var `Resources`: `IMAGE_DATA_DIRECTORY`,
    public var `StrongNameSignature`: `IMAGE_DATA_DIRECTORY`,
    public var `CodeManagerTable`: `IMAGE_DATA_DIRECTORY`,
    public var `VTableFixups`: `IMAGE_DATA_DIRECTORY`,
    public var `ExportAddressTableJumps`: `IMAGE_DATA_DIRECTORY`,
    public var `ManagedNativeHeader`: `IMAGE_DATA_DIRECTORY`,
)
// UNSUPPORTED Rust 2350:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGE_COR20_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2355:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IMAGE_COR20_HEADER_0 {
//     pub EntryPointToken: u32,
//     pub EntryPointRVA: u32,
// }

// UNSUPPORTED Rust 2361:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGE_COR20_HEADER_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IMAGE_DATA_DIRECTORY` (
    public var `VirtualAddress`: UInt,
    public var `Size`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IMAGE_DEBUG_DIRECTORY` (
    public var `Characteristics`: UInt,
    public var `TimeDateStamp`: UInt,
    public var `MajorVersion`: UShort,
    public var `MinorVersion`: UShort,
    public var `Type`: `IMAGE_DEBUG_TYPE`,
    public var `SizeOfData`: UInt,
    public var `AddressOfRawData`: UInt,
    public var `PointerToRawData`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGE_DEBUG_INFORMATION` (
    public var `List`: `super`.`super`.`Kernel`.`LIST_ENTRY`,
    public var `ReservedSize`: UInt,
    public var `ReservedMappedBase`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `ReservedMachine`: UShort,
    public var `ReservedCharacteristics`: UShort,
    public var `ReservedCheckSum`: UInt,
    public var `ImageBase`: UInt,
    public var `SizeOfImage`: UInt,
    public var `ReservedNumberOfSections`: UInt,
    public var `ReservedSections`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IMAGE_SECTION_HEADER`>?,
    public var `ReservedExportedNamesSize`: UInt,
    public var `ReservedExportedNames`: `windows_sys`.`core`.`PSTR`,
    public var `ReservedNumberOfFunctionTableEntries`: UInt,
    public var `ReservedFunctionTableEntries`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IMAGE_FUNCTION_ENTRY`>?,
    public var `ReservedLowestFunctionStartingAddress`: UInt,
    public var `ReservedHighestFunctionEndingAddress`: UInt,
    public var `ReservedNumberOfFpoTableEntries`: UInt,
    public var `ReservedFpoTableEntries`: /* Rust *mut */ kotlinx.cinterop.CPointer<`FPO_DATA`>?,
    public var `SizeOfCoffSymbols`: UInt,
    public var `CoffSymbols`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IMAGE_COFF_SYMBOLS_HEADER`>?,
    public var `ReservedSizeOfCodeViewSymbols`: UInt,
    public var `ReservedCodeViewSymbols`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `ImageFilePath`: `windows_sys`.`core`.`PSTR`,
    public var `ImageFileName`: `windows_sys`.`core`.`PSTR`,
    public var `ReservedDebugFilePath`: `windows_sys`.`core`.`PSTR`,
    public var `ReservedTimeDateStamp`: UInt,
    public var `ReservedRomImage`: `windows_sys`.`core`.`BOOL`,
    public var `ReservedDebugDirectory`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IMAGE_DEBUG_DIRECTORY`>?,
    public var `ReservedNumberOfDebugDirectories`: UInt,
    public var `ReservedOriginalFunctionTableBaseAddress`: UInt,
    public var `Reserved`: UIntArray,
)
// UNSUPPORTED Rust 2421:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_SystemInformation")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IMAGE_FILE_HEADER` (
    public var `Machine`: `super`.`super`.`SystemInformation`.`IMAGE_FILE_MACHINE`,
    public var `NumberOfSections`: UShort,
    public var `TimeDateStamp`: UInt,
    public var `PointerToSymbolTable`: UInt,
    public var `NumberOfSymbols`: UInt,
    public var `SizeOfOptionalHeader`: UShort,
    public var `Characteristics`: `IMAGE_FILE_CHARACTERISTICS`,
)
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IMAGE_FUNCTION_ENTRY` (
    public var `StartingAddress`: UInt,
    public var `EndingAddress`: UInt,
    public var `EndOfPrologue`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGE_FUNCTION_ENTRY64` (
    public var `StartingAddress`: ULong,
    public var `EndingAddress`: ULong,
    public var `Anonymous`: `IMAGE_FUNCTION_ENTRY64_0`,
)
// UNSUPPORTED Rust 2529:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGE_FUNCTION_ENTRY64 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2534:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(4))]
// #[derive(Clone, Copy)]
// pub union IMAGE_FUNCTION_ENTRY64_0 {
//     pub EndOfPrologue: u64,
//     pub UnwindInfoAddress: u64,
// }

// UNSUPPORTED Rust 2540:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGE_FUNCTION_ENTRY64_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IMAGE_LOAD_CONFIG_CODE_INTEGRITY` (
    public var `Flags`: UShort,
    public var `Catalog`: UShort,
    public var `CatalogOffset`: UInt,
    public var `Reserved`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IMAGE_LOAD_CONFIG_DIRECTORY32` (
    public var `Size`: UInt,
    public var `TimeDateStamp`: UInt,
    public var `MajorVersion`: UShort,
    public var `MinorVersion`: UShort,
    public var `GlobalFlagsClear`: UInt,
    public var `GlobalFlagsSet`: UInt,
    public var `CriticalSectionDefaultTimeout`: UInt,
    public var `DeCommitFreeBlockThreshold`: UInt,
    public var `DeCommitTotalFreeThreshold`: UInt,
    public var `LockPrefixTable`: UInt,
    public var `MaximumAllocationSize`: UInt,
    public var `VirtualMemoryThreshold`: UInt,
    public var `ProcessHeapFlags`: UInt,
    public var `ProcessAffinityMask`: UInt,
    public var `CSDVersion`: UShort,
    public var `DependentLoadFlags`: UShort,
    public var `EditList`: UInt,
    public var `SecurityCookie`: UInt,
    public var `SEHandlerTable`: UInt,
    public var `SEHandlerCount`: UInt,
    public var `GuardCFCheckFunctionPointer`: UInt,
    public var `GuardCFDispatchFunctionPointer`: UInt,
    public var `GuardCFFunctionTable`: UInt,
    public var `GuardCFFunctionCount`: UInt,
    public var `GuardFlags`: UInt,
    public var `CodeIntegrity`: `IMAGE_LOAD_CONFIG_CODE_INTEGRITY`,
    public var `GuardAddressTakenIatEntryTable`: UInt,
    public var `GuardAddressTakenIatEntryCount`: UInt,
    public var `GuardLongJumpTargetTable`: UInt,
    public var `GuardLongJumpTargetCount`: UInt,
    public var `DynamicValueRelocTable`: UInt,
    public var `CHPEMetadataPointer`: UInt,
    public var `GuardRFFailureRoutine`: UInt,
    public var `GuardRFFailureRoutineFunctionPointer`: UInt,
    public var `DynamicValueRelocTableOffset`: UInt,
    public var `DynamicValueRelocTableSection`: UShort,
    public var `Reserved2`: UShort,
    public var `GuardRFVerifyStackPointerFunctionPointer`: UInt,
    public var `HotPatchTableOffset`: UInt,
    public var `Reserved3`: UInt,
    public var `EnclaveConfigurationPointer`: UInt,
    public var `VolatileMetadataPointer`: UInt,
    public var `GuardEHContinuationTable`: UInt,
    public var `GuardEHContinuationCount`: UInt,
    public var `GuardXFGCheckFunctionPointer`: UInt,
    public var `GuardXFGDispatchFunctionPointer`: UInt,
    public var `GuardXFGTableDispatchFunctionPointer`: UInt,
    public var `CastGuardOsDeterminedFailureMode`: UInt,
    public var `GuardMemcpyFunctionPointer`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IMAGE_LOAD_CONFIG_DIRECTORY64` (
    public var `Size`: UInt,
    public var `TimeDateStamp`: UInt,
    public var `MajorVersion`: UShort,
    public var `MinorVersion`: UShort,
    public var `GlobalFlagsClear`: UInt,
    public var `GlobalFlagsSet`: UInt,
    public var `CriticalSectionDefaultTimeout`: UInt,
    public var `DeCommitFreeBlockThreshold`: ULong,
    public var `DeCommitTotalFreeThreshold`: ULong,
    public var `LockPrefixTable`: ULong,
    public var `MaximumAllocationSize`: ULong,
    public var `VirtualMemoryThreshold`: ULong,
    public var `ProcessAffinityMask`: ULong,
    public var `ProcessHeapFlags`: UInt,
    public var `CSDVersion`: UShort,
    public var `DependentLoadFlags`: UShort,
    public var `EditList`: ULong,
    public var `SecurityCookie`: ULong,
    public var `SEHandlerTable`: ULong,
    public var `SEHandlerCount`: ULong,
    public var `GuardCFCheckFunctionPointer`: ULong,
    public var `GuardCFDispatchFunctionPointer`: ULong,
    public var `GuardCFFunctionTable`: ULong,
    public var `GuardCFFunctionCount`: ULong,
    public var `GuardFlags`: UInt,
    public var `CodeIntegrity`: `IMAGE_LOAD_CONFIG_CODE_INTEGRITY`,
    public var `GuardAddressTakenIatEntryTable`: ULong,
    public var `GuardAddressTakenIatEntryCount`: ULong,
    public var `GuardLongJumpTargetTable`: ULong,
    public var `GuardLongJumpTargetCount`: ULong,
    public var `DynamicValueRelocTable`: ULong,
    public var `CHPEMetadataPointer`: ULong,
    public var `GuardRFFailureRoutine`: ULong,
    public var `GuardRFFailureRoutineFunctionPointer`: ULong,
    public var `DynamicValueRelocTableOffset`: UInt,
    public var `DynamicValueRelocTableSection`: UShort,
    public var `Reserved2`: UShort,
    public var `GuardRFVerifyStackPointerFunctionPointer`: ULong,
    public var `HotPatchTableOffset`: UInt,
    public var `Reserved3`: UInt,
    public var `EnclaveConfigurationPointer`: ULong,
    public var `VolatileMetadataPointer`: ULong,
    public var `GuardEHContinuationTable`: ULong,
    public var `GuardEHContinuationCount`: ULong,
    public var `GuardXFGCheckFunctionPointer`: ULong,
    public var `GuardXFGDispatchFunctionPointer`: ULong,
    public var `GuardXFGTableDispatchFunctionPointer`: ULong,
    public var `CastGuardOsDeterminedFailureMode`: ULong,
    public var `GuardMemcpyFunctionPointer`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_SystemInformation")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IMAGE_NT_HEADERS32` (
    public var `Signature`: UInt,
    public var `FileHeader`: `IMAGE_FILE_HEADER`,
    public var `OptionalHeader`: `IMAGE_OPTIONAL_HEADER32`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_SystemInformation")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IMAGE_NT_HEADERS64` (
    public var `Signature`: UInt,
    public var `FileHeader`: `IMAGE_FILE_HEADER`,
    public var `OptionalHeader`: `IMAGE_OPTIONAL_HEADER64`,
)
public const val `IMAGE_NT_OPTIONAL_HDR32_MAGIC`: `IMAGE_OPTIONAL_HEADER_MAGIC` = 267u;
public const val `IMAGE_NT_OPTIONAL_HDR64_MAGIC`: `IMAGE_OPTIONAL_HEADER_MAGIC` = 523u;
public const val `IMAGE_NT_OPTIONAL_HDR_MAGIC`: `IMAGE_OPTIONAL_HEADER_MAGIC` = 523u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGE_OPTIONAL_HEADER32` (
    public var `Magic`: `IMAGE_OPTIONAL_HEADER_MAGIC`,
    public var `MajorLinkerVersion`: UByte,
    public var `MinorLinkerVersion`: UByte,
    public var `SizeOfCode`: UInt,
    public var `SizeOfInitializedData`: UInt,
    public var `SizeOfUninitializedData`: UInt,
    public var `AddressOfEntryPoint`: UInt,
    public var `BaseOfCode`: UInt,
    public var `BaseOfData`: UInt,
    public var `ImageBase`: UInt,
    public var `SectionAlignment`: UInt,
    public var `FileAlignment`: UInt,
    public var `MajorOperatingSystemVersion`: UShort,
    public var `MinorOperatingSystemVersion`: UShort,
    public var `MajorImageVersion`: UShort,
    public var `MinorImageVersion`: UShort,
    public var `MajorSubsystemVersion`: UShort,
    public var `MinorSubsystemVersion`: UShort,
    public var `Win32VersionValue`: UInt,
    public var `SizeOfImage`: UInt,
    public var `SizeOfHeaders`: UInt,
    public var `CheckSum`: UInt,
    public var `Subsystem`: `IMAGE_SUBSYSTEM`,
    public var `DllCharacteristics`: `IMAGE_DLL_CHARACTERISTICS`,
    public var `SizeOfStackReserve`: UInt,
    public var `SizeOfStackCommit`: UInt,
    public var `SizeOfHeapReserve`: UInt,
    public var `SizeOfHeapCommit`: UInt,
    public var `LoaderFlags`: UInt,
    public var `NumberOfRvaAndSizes`: UInt,
    public var `DataDirectory`: Array<`IMAGE_DATA_DIRECTORY`>,
)
// UNSUPPORTED Rust 2713:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGE_OPTIONAL_HEADER32 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGE_OPTIONAL_HEADER64` (
    public var `Magic`: `IMAGE_OPTIONAL_HEADER_MAGIC`,
    public var `MajorLinkerVersion`: UByte,
    public var `MinorLinkerVersion`: UByte,
    public var `SizeOfCode`: UInt,
    public var `SizeOfInitializedData`: UInt,
    public var `SizeOfUninitializedData`: UInt,
    public var `AddressOfEntryPoint`: UInt,
    public var `BaseOfCode`: UInt,
    public var `ImageBase`: ULong,
    public var `SectionAlignment`: UInt,
    public var `FileAlignment`: UInt,
    public var `MajorOperatingSystemVersion`: UShort,
    public var `MinorOperatingSystemVersion`: UShort,
    public var `MajorImageVersion`: UShort,
    public var `MinorImageVersion`: UShort,
    public var `MajorSubsystemVersion`: UShort,
    public var `MinorSubsystemVersion`: UShort,
    public var `Win32VersionValue`: UInt,
    public var `SizeOfImage`: UInt,
    public var `SizeOfHeaders`: UInt,
    public var `CheckSum`: UInt,
    public var `Subsystem`: `IMAGE_SUBSYSTEM`,
    public var `DllCharacteristics`: `IMAGE_DLL_CHARACTERISTICS`,
    public var `SizeOfStackReserve`: ULong,
    public var `SizeOfStackCommit`: ULong,
    public var `SizeOfHeapReserve`: ULong,
    public var `SizeOfHeapCommit`: ULong,
    public var `LoaderFlags`: UInt,
    public var `NumberOfRvaAndSizes`: UInt,
    public var `DataDirectory`: Array<`IMAGE_DATA_DIRECTORY`>,
)
// UNSUPPORTED Rust 2752:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGE_OPTIONAL_HEADER64 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `IMAGE_OPTIONAL_HEADER_MAGIC` = UShort;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_SystemInformation")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IMAGE_ROM_HEADERS` (
    public var `FileHeader`: `IMAGE_FILE_HEADER`,
    public var `OptionalHeader`: `IMAGE_ROM_OPTIONAL_HEADER`,
)
public const val `IMAGE_ROM_OPTIONAL_HDR_MAGIC`: `IMAGE_OPTIONAL_HEADER_MAGIC` = 263u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGE_ROM_OPTIONAL_HEADER` (
    public var `Magic`: UShort,
    public var `MajorLinkerVersion`: UByte,
    public var `MinorLinkerVersion`: UByte,
    public var `SizeOfCode`: UInt,
    public var `SizeOfInitializedData`: UInt,
    public var `SizeOfUninitializedData`: UInt,
    public var `AddressOfEntryPoint`: UInt,
    public var `BaseOfCode`: UInt,
    public var `BaseOfData`: UInt,
    public var `BaseOfBss`: UInt,
    public var `GprMask`: UInt,
    public var `CprMask`: UIntArray,
    public var `GpValue`: UInt,
)
// UNSUPPORTED Rust 2783:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGE_ROM_OPTIONAL_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGE_RUNTIME_FUNCTION_ENTRY` (
    public var `BeginAddress`: UInt,
    public var `EndAddress`: UInt,
    public var `Anonymous`: `IMAGE_RUNTIME_FUNCTION_ENTRY_0`,
)
// UNSUPPORTED Rust 2795:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGE_RUNTIME_FUNCTION_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2800:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IMAGE_RUNTIME_FUNCTION_ENTRY_0 {
//     pub UnwindInfoAddress: u32,
//     pub UnwindData: u32,
// }

// UNSUPPORTED Rust 2806:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 8 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGE_SECTION_HEADER` (
    public var `Name`: UByteArray,
    public var `Misc`: `IMAGE_SECTION_HEADER_0`,
    public var `VirtualAddress`: UInt,
    public var `SizeOfRawData`: UInt,
    public var `PointerToRawData`: UInt,
    public var `PointerToRelocations`: UInt,
    public var `PointerToLinenumbers`: UInt,
    public var `NumberOfRelocations`: UShort,
    public var `NumberOfLinenumbers`: UShort,
    public var `Characteristics`: `IMAGE_SECTION_CHARACTERISTICS`,
)
// UNSUPPORTED Rust 2865:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGE_SECTION_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2870:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IMAGE_SECTION_HEADER_0 {
//     pub PhysicalAddress: u32,
//     pub VirtualSize: u32,
// }

// UNSUPPORTED Rust 2876:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IPMI_OS_SEL_RECORD` (
    public var `Signature`: UInt,
    public var `Version`: UInt,
    public var `Length`: UInt,
    public var `RecordType`: `IPMI_OS_SEL_RECORD_TYPE`,
    public var `DataLength`: UInt,
    public var `Data`: UByteArray,
)
// UNSUPPORTED Rust 2953:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 5 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KDHELP` (
    public var `Thread`: UInt,
    public var `ThCallbackStack`: UInt,
    public var `NextCallback`: UInt,
    public var `FramePointer`: UInt,
    public var `KiCallUserMode`: UInt,
    public var `KeUserCallbackDispatcher`: UInt,
    public var `SystemRangeStart`: UInt,
    public var `ThCallbackBStore`: UInt,
    public var `KiUserExceptionDispatcher`: UInt,
    public var `StackBase`: UInt,
    public var `StackLimit`: UInt,
    public var `Reserved`: UIntArray,
)
// UNSUPPORTED Rust 3006:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// impl Default for KDHELP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KDHELP64` (
    public var `Thread`: ULong,
    public var `ThCallbackStack`: UInt,
    public var `ThCallbackBStore`: UInt,
    public var `NextCallback`: UInt,
    public var `FramePointer`: UInt,
    public var `KiCallUserMode`: ULong,
    public var `KeUserCallbackDispatcher`: ULong,
    public var `SystemRangeStart`: ULong,
    public var `KiUserExceptionDispatcher`: ULong,
    public var `StackBase`: ULong,
    public var `StackLimit`: ULong,
    public var `BuildVersion`: UInt,
    public var `RetpolineStubFunctionTableSize`: UInt,
    public var `RetpolineStubFunctionTable`: ULong,
    public var `RetpolineStubOffset`: UInt,
    public var `RetpolineStubSize`: UInt,
    public var `Reserved0`: ULongArray,
)
// UNSUPPORTED Rust 3033:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KNONVOLATILE_CONTEXT_POINTERS` (
    public var `Dummy`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KNONVOLATILE_CONTEXT_POINTERS` (
    public var `Anonymous1`: `KNONVOLATILE_CONTEXT_POINTERS_0`,
    public var `Anonymous2`: `KNONVOLATILE_CONTEXT_POINTERS_1`,
)
// UNSUPPORTED Rust 3069:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for KNONVOLATILE_CONTEXT_POINTERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3075:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(any(target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub union KNONVOLATILE_CONTEXT_POINTERS_0 {
//     pub FloatingContext: [*mut M128A; 16],
//     pub Anonymous: KNONVOLATILE_CONTEXT_POINTERS_0_0,
// }

// UNSUPPORTED Rust 3082:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for KNONVOLATILE_CONTEXT_POINTERS_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KNONVOLATILE_CONTEXT_POINTERS_0_0` (
    public var `Xmm0`: /* Rust *mut */ kotlinx.cinterop.CPointer<`M128A`>?,
    public var `Xmm1`: /* Rust *mut */ kotlinx.cinterop.CPointer<`M128A`>?,
    public var `Xmm2`: /* Rust *mut */ kotlinx.cinterop.CPointer<`M128A`>?,
    public var `Xmm3`: /* Rust *mut */ kotlinx.cinterop.CPointer<`M128A`>?,
    public var `Xmm4`: /* Rust *mut */ kotlinx.cinterop.CPointer<`M128A`>?,
    public var `Xmm5`: /* Rust *mut */ kotlinx.cinterop.CPointer<`M128A`>?,
    public var `Xmm6`: /* Rust *mut */ kotlinx.cinterop.CPointer<`M128A`>?,
    public var `Xmm7`: /* Rust *mut */ kotlinx.cinterop.CPointer<`M128A`>?,
    public var `Xmm8`: /* Rust *mut */ kotlinx.cinterop.CPointer<`M128A`>?,
    public var `Xmm9`: /* Rust *mut */ kotlinx.cinterop.CPointer<`M128A`>?,
    public var `Xmm10`: /* Rust *mut */ kotlinx.cinterop.CPointer<`M128A`>?,
    public var `Xmm11`: /* Rust *mut */ kotlinx.cinterop.CPointer<`M128A`>?,
    public var `Xmm12`: /* Rust *mut */ kotlinx.cinterop.CPointer<`M128A`>?,
    public var `Xmm13`: /* Rust *mut */ kotlinx.cinterop.CPointer<`M128A`>?,
    public var `Xmm14`: /* Rust *mut */ kotlinx.cinterop.CPointer<`M128A`>?,
    public var `Xmm15`: /* Rust *mut */ kotlinx.cinterop.CPointer<`M128A`>?,
)
// UNSUPPORTED Rust 3109:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for KNONVOLATILE_CONTEXT_POINTERS_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3115:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(any(target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub union KNONVOLATILE_CONTEXT_POINTERS_1 {
//     pub IntegerContext: [*mut u64; 16],
//     pub Anonymous: KNONVOLATILE_CONTEXT_POINTERS_1_0,
// }

// UNSUPPORTED Rust 3122:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for KNONVOLATILE_CONTEXT_POINTERS_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KNONVOLATILE_CONTEXT_POINTERS_1_0` (
    public var `Rax`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?,
    public var `Rcx`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?,
    public var `Rdx`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?,
    public var `Rbx`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?,
    public var `Rsp`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?,
    public var `Rbp`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?,
    public var `Rsi`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?,
    public var `Rdi`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?,
    public var `R8`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?,
    public var `R9`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?,
    public var `R10`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?,
    public var `R11`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?,
    public var `R12`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?,
    public var `R13`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?,
    public var `R14`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?,
    public var `R15`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?,
)
// UNSUPPORTED Rust 3149:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for KNONVOLATILE_CONTEXT_POINTERS_1_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(target_arch = "aarch64")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KNONVOLATILE_CONTEXT_POINTERS` (
    public var `X19`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?,
    public var `X20`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?,
    public var `X21`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?,
    public var `X22`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?,
    public var `X23`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?,
    public var `X24`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?,
    public var `X25`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?,
    public var `X26`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?,
    public var `X27`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?,
    public var `X28`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?,
    public var `Fp`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?,
    public var `Lr`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?,
    public var `D8`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?,
    public var `D9`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?,
    public var `D10`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?,
    public var `D11`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?,
    public var `D12`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?,
    public var `D13`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?,
    public var `D14`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?,
    public var `D15`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?,
)
// UNSUPPORTED Rust 3180:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "aarch64")]
// impl Default for KNONVOLATILE_CONTEXT_POINTERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KernelMinidumpStatusCallback`: `MINIDUMP_CALLBACK_TYPE` = 8;
public const val `LAST_CHANCE_CALLED_FROM_KMODE`: `BUGCHECK_ERROR` = 21u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LDT_ENTRY` (
    public var `LimitLow`: UShort,
    public var `BaseLow`: UShort,
    public var `HighWord`: `LDT_ENTRY_0`,
)
// UNSUPPORTED Rust 3195:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LDT_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3200:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union LDT_ENTRY_0 {
//     pub Bytes: LDT_ENTRY_0_0,
//     pub Bits: LDT_ENTRY_0_1,
// }

// UNSUPPORTED Rust 3206:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LDT_ENTRY_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LDT_ENTRY_0_1` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LDT_ENTRY_0_0` (
    public var `BaseMid`: UByte,
    public var `Flags1`: UByte,
    public var `Flags2`: UByte,
    public var `BaseHi`: UByte,
)
public const val `LIVE_SYSTEM_DUMP`: `BUGCHECK_ERROR` = 353u;
public const val `LM_SERVER_INTERNAL_ERROR`: `BUGCHECK_ERROR` = 84u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Kernel", feature = "Win32_System_SystemInformation"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LOADED_IMAGE` (
    public var `ModuleName`: `windows_sys`.`core`.`PSTR`,
    public var `hFile`: `super`.`super`.`super`.`Foundation`.`HANDLE`,
    public var `MappedAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `FileHeader`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IMAGE_NT_HEADERS32`>?,
    public var `LastRvaSection`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IMAGE_SECTION_HEADER`>?,
    public var `NumberOfSections`: UInt,
    public var `Sections`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IMAGE_SECTION_HEADER`>?,
    public var `Characteristics`: `IMAGE_FILE_CHARACTERISTICS2`,
    public var `fSystemImage`: Boolean,
    public var `fDOSImage`: Boolean,
    public var `fReadOnly`: Boolean,
    public var `Version`: UByte,
    public var `Links`: `super`.`super`.`Kernel`.`LIST_ENTRY`,
    public var `SizeOfImage`: UInt,
)
// UNSUPPORTED Rust 3246:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// #[cfg(all(feature = "Win32_System_Kernel", feature = "Win32_System_SystemInformation"))]
// impl Default for LOADED_IMAGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Kernel", feature = "Win32_System_SystemInformation"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LOADED_IMAGE` (
    public var `ModuleName`: `windows_sys`.`core`.`PSTR`,
    public var `hFile`: `super`.`super`.`super`.`Foundation`.`HANDLE`,
    public var `MappedAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `FileHeader`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IMAGE_NT_HEADERS64`>?,
    public var `LastRvaSection`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IMAGE_SECTION_HEADER`>?,
    public var `NumberOfSections`: UInt,
    public var `Sections`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IMAGE_SECTION_HEADER`>?,
    public var `Characteristics`: `IMAGE_FILE_CHARACTERISTICS2`,
    public var `fSystemImage`: Boolean,
    public var `fDOSImage`: Boolean,
    public var `fReadOnly`: Boolean,
    public var `Version`: UByte,
    public var `Links`: `super`.`super`.`Kernel`.`LIST_ENTRY`,
    public var `SizeOfImage`: UInt,
)
// UNSUPPORTED Rust 3273:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LOAD_DLL_DEBUG_INFO` (
    public var `hFile`: `super`.`super`.`super`.`Foundation`.`HANDLE`,
    public var `lpBaseOfDll`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `dwDebugInfoFileOffset`: UInt,
    public var `nDebugInfoSize`: UInt,
    public var `lpImageName`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `fUnicode`: UShort,
)
// UNSUPPORTED Rust 3293:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LOAD_DLL_DEBUG_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `LOCKED_PAGES_TRACKER_CORRUPTION`: `BUGCHECK_ERROR` = 217u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPCALL_BACK_USER_INTERRUPT_ROUTINE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> UInt>>>;
public const val `LPC_INITIALIZATION_FAILED`: `BUGCHECK_ERROR` = 106u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
public typealias `LPTOP_LEVEL_EXCEPTION_FILTER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`EXCEPTION_POINTERS`>?) -> Int>>>;
public const val `LastReservedStream`: `MINIDUMP_STREAM_TYPE` = 65535;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `M128A` (
    public var `Low`: ULong,
    public var `High`: Long,
)
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Storage_FileSystem", feature = "Win32_System_Kernel", feature = "Win32_System_Memory"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MINIDUMP_CALLBACK_INFORMATION` (
    public var `CallbackRoutine`: `MINIDUMP_CALLBACK_ROUTINE`,
    public var `CallbackParam`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 3333:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// #[cfg(all(feature = "Win32_Storage_FileSystem", feature = "Win32_System_Kernel", feature = "Win32_System_Memory"))]
// impl Default for MINIDUMP_CALLBACK_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Storage_FileSystem", feature = "Win32_System_Kernel", feature = "Win32_System_Memory"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MINIDUMP_CALLBACK_INFORMATION` (
    public var `CallbackRoutine`: `MINIDUMP_CALLBACK_ROUTINE`,
    public var `CallbackParam`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 3348:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[cfg(all(feature = "Win32_Storage_FileSystem", feature = "Win32_System_Kernel", feature = "Win32_System_Memory"))]
// impl Default for MINIDUMP_CALLBACK_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Storage_FileSystem", feature = "Win32_System_Kernel"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MINIDUMP_CALLBACK_INPUT` (
    public var `ProcessId`: UInt,
    public var `ProcessHandle`: `super`.`super`.`super`.`Foundation`.`HANDLE`,
    public var `CallbackType`: UInt,
    public var `Anonymous`: `MINIDUMP_CALLBACK_INPUT_0`,
)
// UNSUPPORTED Rust 3364:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Storage_FileSystem", feature = "Win32_System_Kernel"))]
// impl Default for MINIDUMP_CALLBACK_INPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3370:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
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

// UNSUPPORTED Rust 3387:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_Storage_FileSystem", feature = "Win32_System_Kernel"))]
// impl Default for MINIDUMP_CALLBACK_INPUT_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Memory")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MINIDUMP_CALLBACK_OUTPUT` (
    public var `Anonymous`: `MINIDUMP_CALLBACK_OUTPUT_0`,
)
// UNSUPPORTED Rust 3399:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Memory")]
// impl Default for MINIDUMP_CALLBACK_OUTPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3405:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
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

// UNSUPPORTED Rust 3420:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Memory")]
// impl Default for MINIDUMP_CALLBACK_OUTPUT_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Memory")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MINIDUMP_CALLBACK_OUTPUT_0_0` (
    public var `MemoryBase`: ULong,
    public var `MemorySize`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Memory")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MINIDUMP_CALLBACK_OUTPUT_0_1` (
    public var `CheckCancel`: `windows_sys`.`core`.`BOOL`,
    public var `Cancel`: `windows_sys`.`core`.`BOOL`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Memory")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MINIDUMP_CALLBACK_OUTPUT_0_2` (
    public var `VmRegion`: `MINIDUMP_MEMORY_INFO`,
    public var `Continue`: `windows_sys`.`core`.`BOOL`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Memory")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MINIDUMP_CALLBACK_OUTPUT_0_3` (
    public var `VmQueryStatus`: `windows_sys`.`core`.`HRESULT`,
    public var `VmQueryResult`: `MINIDUMP_MEMORY_INFO`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Memory")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MINIDUMP_CALLBACK_OUTPUT_0_4` (
    public var `VmReadStatus`: `windows_sys`.`core`.`HRESULT`,
    public var `VmReadBytesCompleted`: UInt,
)
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Storage_FileSystem", feature = "Win32_System_Kernel", feature = "Win32_System_Memory"))]
public typealias `MINIDUMP_CALLBACK_ROUTINE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`MINIDUMP_CALLBACK_INPUT`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`MINIDUMP_CALLBACK_OUTPUT`>?) -> `windows_sys`.`core`.`BOOL`>>>;
public typealias `MINIDUMP_CALLBACK_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MINIDUMP_DIRECTORY` (
    public var `StreamType`: UInt,
    public var `Location`: `MINIDUMP_LOCATION_DESCRIPTOR`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 15 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MINIDUMP_EXCEPTION` (
    public var `ExceptionCode`: UInt,
    public var `ExceptionFlags`: UInt,
    public var `ExceptionRecord`: ULong,
    public var `ExceptionAddress`: ULong,
    public var `NumberParameters`: UInt,
    public var `__unusedAlignment`: UInt,
    public var `ExceptionInformation`: ULongArray,
)
// UNSUPPORTED Rust 3481:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MINIDUMP_EXCEPTION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MINIDUMP_EXCEPTION_INFORMATION` (
    public var `ThreadId`: UInt,
    public var `ExceptionPointers`: /* Rust *mut */ kotlinx.cinterop.CPointer<`EXCEPTION_POINTERS`>?,
    public var `ClientPointers`: `windows_sys`.`core`.`BOOL`,
)
// UNSUPPORTED Rust 3495:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// #[cfg(feature = "Win32_System_Kernel")]
// impl Default for MINIDUMP_EXCEPTION_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MINIDUMP_EXCEPTION_INFORMATION` (
    public var `ThreadId`: UInt,
    public var `ExceptionPointers`: /* Rust *mut */ kotlinx.cinterop.CPointer<`EXCEPTION_POINTERS`>?,
    public var `ClientPointers`: `windows_sys`.`core`.`BOOL`,
)
// UNSUPPORTED Rust 3511:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[cfg(feature = "Win32_System_Kernel")]
// impl Default for MINIDUMP_EXCEPTION_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MINIDUMP_EXCEPTION_INFORMATION64` (
    public var `ThreadId`: UInt,
    public var `ExceptionRecord`: ULong,
    public var `ContextRecord`: ULong,
    public var `ClientPointers`: `windows_sys`.`core`.`BOOL`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MINIDUMP_EXCEPTION_STREAM` (
    public var `ThreadId`: UInt,
    public var `__alignment`: UInt,
    public var `ExceptionRecord`: `MINIDUMP_EXCEPTION`,
    public var `ThreadContext`: `MINIDUMP_LOCATION_DESCRIPTOR`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MINIDUMP_FUNCTION_TABLE_DESCRIPTOR` (
    public var `MinimumAddress`: ULong,
    public var `MaximumAddress`: ULong,
    public var `BaseAddress`: ULong,
    public var `EntryCount`: UInt,
    public var `SizeOfAlignPad`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MINIDUMP_FUNCTION_TABLE_STREAM` (
    public var `SizeOfHeader`: UInt,
    public var `SizeOfDescriptor`: UInt,
    public var `SizeOfNativeDescriptor`: UInt,
    public var `SizeOfFunctionEntry`: UInt,
    public var `NumberOfDescriptors`: UInt,
    public var `SizeOfAlignPad`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MINIDUMP_HANDLE_DATA_STREAM` (
    public var `SizeOfHeader`: UInt,
    public var `SizeOfDescriptor`: UInt,
    public var `NumberOfDescriptors`: UInt,
    public var `Reserved`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MINIDUMP_HANDLE_DESCRIPTOR` (
    public var `Handle`: ULong,
    public var `TypeNameRva`: UInt,
    public var `ObjectNameRva`: UInt,
    public var `Attributes`: UInt,
    public var `GrantedAccess`: UInt,
    public var `HandleCount`: UInt,
    public var `PointerCount`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MINIDUMP_HANDLE_DESCRIPTOR_2` (
    public var `Handle`: ULong,
    public var `TypeNameRva`: UInt,
    public var `ObjectNameRva`: UInt,
    public var `Attributes`: UInt,
    public var `GrantedAccess`: UInt,
    public var `HandleCount`: UInt,
    public var `PointerCount`: UInt,
    public var `ObjectInfoRva`: UInt,
    public var `Reserved0`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MINIDUMP_HANDLE_OBJECT_INFORMATION` (
    public var `NextInfoRva`: UInt,
    public var `InfoType`: UInt,
    public var `SizeOfInfo`: UInt,
)
public typealias `MINIDUMP_HANDLE_OBJECT_INFORMATION_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MINIDUMP_HANDLE_OPERATION_LIST` (
    public var `SizeOfHeader`: UInt,
    public var `SizeOfEntry`: UInt,
    public var `NumberOfEntries`: UInt,
    public var `Reserved`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MINIDUMP_HEADER` (
    public var `Signature`: UInt,
    public var `Version`: UInt,
    public var `NumberOfStreams`: UInt,
    public var `StreamDirectoryRva`: UInt,
    public var `CheckSum`: UInt,
    public var `Anonymous`: `MINIDUMP_HEADER_0`,
    public var `Flags`: ULong,
)
// UNSUPPORTED Rust 3612:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MINIDUMP_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3617:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union MINIDUMP_HEADER_0 {
//     pub Reserved: u32,
//     pub TimeDateStamp: u32,
// }

// UNSUPPORTED Rust 3623:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MINIDUMP_HEADER_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MINIDUMP_INCLUDE_MODULE_CALLBACK` (
    public var `BaseOfImage`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MINIDUMP_INCLUDE_THREAD_CALLBACK` (
    public var `ThreadId`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MINIDUMP_IO_CALLBACK` (
    public var `Handle`: `super`.`super`.`super`.`Foundation`.`HANDLE`,
    public var `Offset`: ULong,
    public var `Buffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `BufferBytes`: UInt,
)
// UNSUPPORTED Rust 3646:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MINIDUMP_IO_CALLBACK {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MINIDUMP_LOCATION_DESCRIPTOR` (
    public var `DataSize`: UInt,
    public var `Rva`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MINIDUMP_LOCATION_DESCRIPTOR64` (
    public var `DataSize`: ULong,
    public var `Rva`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MINIDUMP_MEMORY64_LIST` (
    public var `NumberOfMemoryRanges`: ULong,
    public var `BaseRva`: ULong,
    public var `MemoryRanges`: Array<`MINIDUMP_MEMORY_DESCRIPTOR64`>,
)
// UNSUPPORTED Rust 3670:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MINIDUMP_MEMORY64_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MINIDUMP_MEMORY_DESCRIPTOR` (
    public var `StartOfMemoryRange`: ULong,
    public var `Memory`: `MINIDUMP_LOCATION_DESCRIPTOR`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MINIDUMP_MEMORY_DESCRIPTOR64` (
    public var `StartOfMemoryRange`: ULong,
    public var `DataSize`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Memory")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MINIDUMP_MEMORY_INFO` (
    public var `BaseAddress`: ULong,
    public var `AllocationBase`: ULong,
    public var `AllocationProtect`: UInt,
    public var `__alignment1`: UInt,
    public var `RegionSize`: ULong,
    public var `State`: `super`.`super`.`Memory`.`VIRTUAL_ALLOCATION_TYPE`,
    public var `Protect`: UInt,
    public var `Type`: UInt,
    public var `__alignment2`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MINIDUMP_MEMORY_INFO_LIST` (
    public var `SizeOfHeader`: UInt,
    public var `SizeOfEntry`: UInt,
    public var `NumberOfEntries`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MINIDUMP_MEMORY_LIST` (
    public var `NumberOfMemoryRanges`: UInt,
    public var `MemoryRanges`: Array<`MINIDUMP_MEMORY_DESCRIPTOR`>,
)
// UNSUPPORTED Rust 3714:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MINIDUMP_MISC_INFO` (
    public var `SizeOfInfo`: UInt,
    public var `Flags1`: `MINIDUMP_MISC_INFO_FLAGS`,
    public var `ProcessId`: UInt,
    public var `ProcessCreateTime`: UInt,
    public var `ProcessUserTime`: UInt,
    public var `ProcessKernelTime`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MINIDUMP_MISC_INFO_2` (
    public var `SizeOfInfo`: UInt,
    public var `Flags1`: UInt,
    public var `ProcessId`: UInt,
    public var `ProcessCreateTime`: UInt,
    public var `ProcessUserTime`: UInt,
    public var `ProcessKernelTime`: UInt,
    public var `ProcessorMaxMhz`: UInt,
    public var `ProcessorCurrentMhz`: UInt,
    public var `ProcessorMhzLimit`: UInt,
    public var `ProcessorMaxIdleState`: UInt,
    public var `ProcessorCurrentIdleState`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Time")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MINIDUMP_MISC_INFO_3` (
    public var `SizeOfInfo`: UInt,
    public var `Flags1`: UInt,
    public var `ProcessId`: UInt,
    public var `ProcessCreateTime`: UInt,
    public var `ProcessUserTime`: UInt,
    public var `ProcessKernelTime`: UInt,
    public var `ProcessorMaxMhz`: UInt,
    public var `ProcessorCurrentMhz`: UInt,
    public var `ProcessorMhzLimit`: UInt,
    public var `ProcessorMaxIdleState`: UInt,
    public var `ProcessorCurrentIdleState`: UInt,
    public var `ProcessIntegrityLevel`: UInt,
    public var `ProcessExecuteFlags`: UInt,
    public var `ProtectedProcess`: UInt,
    public var `TimeZoneId`: UInt,
    public var `TimeZone`: `super`.`super`.`Time`.`TIME_ZONE_INFORMATION`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 260 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 40 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Time")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MINIDUMP_MISC_INFO_4` (
    public var `SizeOfInfo`: UInt,
    public var `Flags1`: UInt,
    public var `ProcessId`: UInt,
    public var `ProcessCreateTime`: UInt,
    public var `ProcessUserTime`: UInt,
    public var `ProcessKernelTime`: UInt,
    public var `ProcessorMaxMhz`: UInt,
    public var `ProcessorCurrentMhz`: UInt,
    public var `ProcessorMhzLimit`: UInt,
    public var `ProcessorMaxIdleState`: UInt,
    public var `ProcessorCurrentIdleState`: UInt,
    public var `ProcessIntegrityLevel`: UInt,
    public var `ProcessExecuteFlags`: UInt,
    public var `ProtectedProcess`: UInt,
    public var `TimeZoneId`: UInt,
    public var `TimeZone`: `super`.`super`.`Time`.`TIME_ZONE_INFORMATION`,
    public var `BuildString`: UShortArray,
    public var `DbgBldStr`: UShortArray,
)
// UNSUPPORTED Rust 3797:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Time")]
// impl Default for MINIDUMP_MISC_INFO_4 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 260 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 40 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Time")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MINIDUMP_MISC_INFO_5` (
    public var `SizeOfInfo`: UInt,
    public var `Flags1`: UInt,
    public var `ProcessId`: UInt,
    public var `ProcessCreateTime`: UInt,
    public var `ProcessUserTime`: UInt,
    public var `ProcessKernelTime`: UInt,
    public var `ProcessorMaxMhz`: UInt,
    public var `ProcessorCurrentMhz`: UInt,
    public var `ProcessorMhzLimit`: UInt,
    public var `ProcessorMaxIdleState`: UInt,
    public var `ProcessorCurrentIdleState`: UInt,
    public var `ProcessIntegrityLevel`: UInt,
    public var `ProcessExecuteFlags`: UInt,
    public var `ProtectedProcess`: UInt,
    public var `TimeZoneId`: UInt,
    public var `TimeZone`: `super`.`super`.`Time`.`TIME_ZONE_INFORMATION`,
    public var `BuildString`: UShortArray,
    public var `DbgBldStr`: UShortArray,
    public var `XStateData`: `XSTATE_CONFIG_FEATURE_MSC_INFO`,
    public var `ProcessCookie`: UInt,
)
// UNSUPPORTED Rust 3828:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Time")]
// impl Default for MINIDUMP_MISC_INFO_5 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `MINIDUMP_MISC_INFO_FLAGS` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_FileSystem")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MINIDUMP_MODULE` (
    public var `BaseOfImage`: ULong,
    public var `SizeOfImage`: UInt,
    public var `CheckSum`: UInt,
    public var `TimeDateStamp`: UInt,
    public var `ModuleNameRva`: UInt,
    public var `VersionInfo`: `super`.`super`.`super`.`Storage`.`FileSystem`.`VS_FIXEDFILEINFO`,
    public var `CvRecord`: `MINIDUMP_LOCATION_DESCRIPTOR`,
    public var `MiscRecord`: `MINIDUMP_LOCATION_DESCRIPTOR`,
    public var `Reserved0`: ULong,
    public var `Reserved1`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_FileSystem")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MINIDUMP_MODULE_CALLBACK` (
    public var `FullPath`: `windows_sys`.`core`.`PWSTR`,
    public var `BaseOfImage`: ULong,
    public var `SizeOfImage`: UInt,
    public var `CheckSum`: UInt,
    public var `TimeDateStamp`: UInt,
    public var `VersionInfo`: `super`.`super`.`super`.`Storage`.`FileSystem`.`VS_FIXEDFILEINFO`,
    public var `CvRecord`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `SizeOfCvRecord`: UInt,
    public var `MiscRecord`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `SizeOfMiscRecord`: UInt,
)
// UNSUPPORTED Rust 3865:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Storage_FileSystem")]
// impl Default for MINIDUMP_MODULE_CALLBACK {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_FileSystem")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MINIDUMP_MODULE_LIST` (
    public var `NumberOfModules`: UInt,
    public var `Modules`: Array<`MINIDUMP_MODULE`>,
)
// UNSUPPORTED Rust 3878:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Storage_FileSystem")]
// impl Default for MINIDUMP_MODULE_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MINIDUMP_PROCESS_VM_COUNTERS`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MINIDUMP_PROCESS_VM_COUNTERS_1` (
    public var `Revision`: UShort,
    public var `PageFaultCount`: UInt,
    public var `PeakWorkingSetSize`: ULong,
    public var `WorkingSetSize`: ULong,
    public var `QuotaPeakPagedPoolUsage`: ULong,
    public var `QuotaPagedPoolUsage`: ULong,
    public var `QuotaPeakNonPagedPoolUsage`: ULong,
    public var `QuotaNonPagedPoolUsage`: ULong,
    public var `PagefileUsage`: ULong,
    public var `PeakPagefileUsage`: ULong,
    public var `PrivateUsage`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MINIDUMP_PROCESS_VM_COUNTERS_2` (
    public var `Revision`: UShort,
    public var `Flags`: UShort,
    public var `PageFaultCount`: UInt,
    public var `PeakWorkingSetSize`: ULong,
    public var `WorkingSetSize`: ULong,
    public var `QuotaPeakPagedPoolUsage`: ULong,
    public var `QuotaPagedPoolUsage`: ULong,
    public var `QuotaPeakNonPagedPoolUsage`: ULong,
    public var `QuotaNonPagedPoolUsage`: ULong,
    public var `PagefileUsage`: ULong,
    public var `PeakPagefileUsage`: ULong,
    public var `PeakVirtualSize`: ULong,
    public var `VirtualSize`: ULong,
    public var `PrivateUsage`: ULong,
    public var `PrivateWorkingSetSize`: ULong,
    public var `SharedCommitUsage`: ULong,
    public var `JobSharedCommitUsage`: ULong,
    public var `JobPrivateCommitUsage`: ULong,
    public var `JobPeakPrivateCommitUsage`: ULong,
    public var `JobPrivateCommitLimit`: ULong,
    public var `JobTotalCommitLimit`: ULong,
)
public const val `MINIDUMP_PROCESS_VM_COUNTERS_EX`: UInt = 4u;
public const val `MINIDUMP_PROCESS_VM_COUNTERS_EX2`: UInt = 8u;
public const val `MINIDUMP_PROCESS_VM_COUNTERS_JOB`: UInt = 16u;
public const val `MINIDUMP_PROCESS_VM_COUNTERS_VIRTUALSIZE`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MINIDUMP_READ_MEMORY_FAILURE_CALLBACK` (
    public var `Offset`: ULong,
    public var `Bytes`: UInt,
    public var `FailureStatus`: `windows_sys`.`core`.`HRESULT`,
)
public typealias `MINIDUMP_SECONDARY_FLAGS` = Int;
public typealias `MINIDUMP_STREAM_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MINIDUMP_STRING` (
    public var `Length`: UInt,
    public var `Buffer`: UShortArray,
)
// UNSUPPORTED Rust 3944:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MINIDUMP_STRING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MINIDUMP_SYSMEMINFO1_BASICPERF`: UInt = 2u;
public const val `MINIDUMP_SYSMEMINFO1_FILECACHE_TRANSITIONREPURPOSECOUNT_FLAGS`: UInt = 1u;
public const val `MINIDUMP_SYSMEMINFO1_PERF_CCTOTALDIRTYPAGES_CCDIRTYPAGETHRESHOLD`: UInt = 4u;
public const val `MINIDUMP_SYSMEMINFO1_PERF_RESIDENTAVAILABLEPAGES_SHAREDCOMMITPAGES`: UInt = 8u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MINIDUMP_SYSTEM_BASIC_INFORMATION` (
    public var `TimerResolution`: UInt,
    public var `PageSize`: UInt,
    public var `NumberOfPhysicalPages`: UInt,
    public var `LowestPhysicalPageNumber`: UInt,
    public var `HighestPhysicalPageNumber`: UInt,
    public var `AllocationGranularity`: UInt,
    public var `MinimumUserModeAddress`: ULong,
    public var `MaximumUserModeAddress`: ULong,
    public var `ActiveProcessorsAffinityMask`: ULong,
    public var `NumberOfProcessors`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MINIDUMP_SYSTEM_BASIC_PERFORMANCE_INFORMATION` (
    public var `AvailablePages`: ULong,
    public var `CommittedPages`: ULong,
    public var `CommitLimit`: ULong,
    public var `PeakCommitment`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MINIDUMP_SYSTEM_FILECACHE_INFORMATION` (
    public var `CurrentSize`: ULong,
    public var `PeakSize`: ULong,
    public var `PageFaultCount`: UInt,
    public var `MinimumWorkingSet`: ULong,
    public var `MaximumWorkingSet`: ULong,
    public var `CurrentSizeIncludingTransitionInPages`: ULong,
    public var `PeakSizeIncludingTransitionInPages`: ULong,
    public var `TransitionRePurposeCount`: UInt,
    public var `Flags`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_SystemInformation")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MINIDUMP_SYSTEM_INFO` (
    public var `ProcessorArchitecture`: `super`.`super`.`SystemInformation`.`PROCESSOR_ARCHITECTURE`,
    public var `ProcessorLevel`: UShort,
    public var `ProcessorRevision`: UShort,
    public var `Anonymous1`: `MINIDUMP_SYSTEM_INFO_0`,
    public var `MajorVersion`: UInt,
    public var `MinorVersion`: UInt,
    public var `BuildNumber`: UInt,
    public var `PlatformId`: `VER_PLATFORM`,
    public var `CSDVersionRva`: UInt,
    public var `Anonymous2`: `MINIDUMP_SYSTEM_INFO_1`,
    public var `Cpu`: `CPU_INFORMATION`,
)
// UNSUPPORTED Rust 4004:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_SystemInformation")]
// impl Default for MINIDUMP_SYSTEM_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4010:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_System_SystemInformation")]
// #[derive(Clone, Copy)]
// pub union MINIDUMP_SYSTEM_INFO_0 {
//     pub Reserved0: u16,
//     pub Anonymous: MINIDUMP_SYSTEM_INFO_0_0,
// }

// UNSUPPORTED Rust 4017:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_SystemInformation")]
// impl Default for MINIDUMP_SYSTEM_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_SystemInformation")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MINIDUMP_SYSTEM_INFO_0_0` (
    public var `NumberOfProcessors`: UByte,
    public var `ProductType`: UByte,
)
// UNSUPPORTED Rust 4030:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_System_SystemInformation")]
// #[derive(Clone, Copy)]
// pub union MINIDUMP_SYSTEM_INFO_1 {
//     pub Reserved1: u32,
//     pub Anonymous: MINIDUMP_SYSTEM_INFO_1_0,
// }

// UNSUPPORTED Rust 4037:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_SystemInformation")]
// impl Default for MINIDUMP_SYSTEM_INFO_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_SystemInformation")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MINIDUMP_SYSTEM_INFO_1_0` (
    public var `SuiteMask`: UShort,
    public var `Reserved2`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MINIDUMP_SYSTEM_MEMORY_INFO_1` (
    public var `Revision`: UShort,
    public var `Flags`: UShort,
    public var `BasicInfo`: `MINIDUMP_SYSTEM_BASIC_INFORMATION`,
    public var `FileCacheInfo`: `MINIDUMP_SYSTEM_FILECACHE_INFORMATION`,
    public var `BasicPerfInfo`: `MINIDUMP_SYSTEM_BASIC_PERFORMANCE_INFORMATION`,
    public var `PerfInfo`: `MINIDUMP_SYSTEM_PERFORMANCE_INFORMATION`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MINIDUMP_SYSTEM_PERFORMANCE_INFORMATION` (
    public var `IdleProcessTime`: ULong,
    public var `IoReadTransferCount`: ULong,
    public var `IoWriteTransferCount`: ULong,
    public var `IoOtherTransferCount`: ULong,
    public var `IoReadOperationCount`: UInt,
    public var `IoWriteOperationCount`: UInt,
    public var `IoOtherOperationCount`: UInt,
    public var `AvailablePages`: UInt,
    public var `CommittedPages`: UInt,
    public var `CommitLimit`: UInt,
    public var `PeakCommitment`: UInt,
    public var `PageFaultCount`: UInt,
    public var `CopyOnWriteCount`: UInt,
    public var `TransitionCount`: UInt,
    public var `CacheTransitionCount`: UInt,
    public var `DemandZeroCount`: UInt,
    public var `PageReadCount`: UInt,
    public var `PageReadIoCount`: UInt,
    public var `CacheReadCount`: UInt,
    public var `CacheIoCount`: UInt,
    public var `DirtyPagesWriteCount`: UInt,
    public var `DirtyWriteIoCount`: UInt,
    public var `MappedPagesWriteCount`: UInt,
    public var `MappedWriteIoCount`: UInt,
    public var `PagedPoolPages`: UInt,
    public var `NonPagedPoolPages`: UInt,
    public var `PagedPoolAllocs`: UInt,
    public var `PagedPoolFrees`: UInt,
    public var `NonPagedPoolAllocs`: UInt,
    public var `NonPagedPoolFrees`: UInt,
    public var `FreeSystemPtes`: UInt,
    public var `ResidentSystemCodePage`: UInt,
    public var `TotalSystemDriverPages`: UInt,
    public var `TotalSystemCodePages`: UInt,
    public var `NonPagedPoolLookasideHits`: UInt,
    public var `PagedPoolLookasideHits`: UInt,
    public var `AvailablePagedPoolPages`: UInt,
    public var `ResidentSystemCachePage`: UInt,
    public var `ResidentPagedPoolPage`: UInt,
    public var `ResidentSystemDriverPage`: UInt,
    public var `CcFastReadNoWait`: UInt,
    public var `CcFastReadWait`: UInt,
    public var `CcFastReadResourceMiss`: UInt,
    public var `CcFastReadNotPossible`: UInt,
    public var `CcFastMdlReadNoWait`: UInt,
    public var `CcFastMdlReadWait`: UInt,
    public var `CcFastMdlReadResourceMiss`: UInt,
    public var `CcFastMdlReadNotPossible`: UInt,
    public var `CcMapDataNoWait`: UInt,
    public var `CcMapDataWait`: UInt,
    public var `CcMapDataNoWaitMiss`: UInt,
    public var `CcMapDataWaitMiss`: UInt,
    public var `CcPinMappedDataCount`: UInt,
    public var `CcPinReadNoWait`: UInt,
    public var `CcPinReadWait`: UInt,
    public var `CcPinReadNoWaitMiss`: UInt,
    public var `CcPinReadWaitMiss`: UInt,
    public var `CcCopyReadNoWait`: UInt,
    public var `CcCopyReadWait`: UInt,
    public var `CcCopyReadNoWaitMiss`: UInt,
    public var `CcCopyReadWaitMiss`: UInt,
    public var `CcMdlReadNoWait`: UInt,
    public var `CcMdlReadWait`: UInt,
    public var `CcMdlReadNoWaitMiss`: UInt,
    public var `CcMdlReadWaitMiss`: UInt,
    public var `CcReadAheadIos`: UInt,
    public var `CcLazyWriteIos`: UInt,
    public var `CcLazyWritePages`: UInt,
    public var `CcDataFlushes`: UInt,
    public var `CcDataPages`: UInt,
    public var `ContextSwitches`: UInt,
    public var `FirstLevelTbFills`: UInt,
    public var `SecondLevelTbFills`: UInt,
    public var `SystemCalls`: UInt,
    public var `CcTotalDirtyPages`: ULong,
    public var `CcDirtyPageThreshold`: ULong,
    public var `ResidentAvailablePages`: Long,
    public var `SharedCommittedPages`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MINIDUMP_THREAD` (
    public var `ThreadId`: UInt,
    public var `SuspendCount`: UInt,
    public var `PriorityClass`: UInt,
    public var `Priority`: UInt,
    public var `Teb`: ULong,
    public var `Stack`: `MINIDUMP_MEMORY_DESCRIPTOR`,
    public var `ThreadContext`: `MINIDUMP_LOCATION_DESCRIPTOR`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[cfg(any(target_arch = "arm64ec", target_arch = "x86", target_arch = "x86_64"))]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MINIDUMP_THREAD_CALLBACK` (
    public var `ThreadId`: UInt,
    public var `ThreadHandle`: `super`.`super`.`super`.`Foundation`.`HANDLE`,
    public var `Context`: `CONTEXT`,
    public var `SizeOfContext`: UInt,
    public var `StackBase`: ULong,
    public var `StackEnd`: ULong,
)
// UNSUPPORTED Rust 4165:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "arm64ec", target_arch = "x86", target_arch = "x86_64"))]
// #[cfg(feature = "Win32_System_Kernel")]
// impl Default for MINIDUMP_THREAD_CALLBACK {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[cfg(target_arch = "aarch64")]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MINIDUMP_THREAD_CALLBACK` (
    public var `ThreadId`: UInt,
    public var `ThreadHandle`: `super`.`super`.`super`.`Foundation`.`HANDLE`,
    public var `Pad`: UInt,
    public var `Context`: `CONTEXT`,
    public var `SizeOfContext`: UInt,
    public var `StackBase`: ULong,
    public var `StackEnd`: ULong,
)
// UNSUPPORTED Rust 4185:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "aarch64")]
// #[cfg(feature = "Win32_System_Kernel")]
// impl Default for MINIDUMP_THREAD_CALLBACK {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MINIDUMP_THREAD_EX` (
    public var `ThreadId`: UInt,
    public var `SuspendCount`: UInt,
    public var `PriorityClass`: UInt,
    public var `Priority`: UInt,
    public var `Teb`: ULong,
    public var `Stack`: `MINIDUMP_MEMORY_DESCRIPTOR`,
    public var `ThreadContext`: `MINIDUMP_LOCATION_DESCRIPTOR`,
    public var `BackingStore`: `MINIDUMP_MEMORY_DESCRIPTOR`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[cfg(any(target_arch = "arm64ec", target_arch = "x86", target_arch = "x86_64"))]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MINIDUMP_THREAD_EX_CALLBACK` (
    public var `ThreadId`: UInt,
    public var `ThreadHandle`: `super`.`super`.`super`.`Foundation`.`HANDLE`,
    public var `Context`: `CONTEXT`,
    public var `SizeOfContext`: UInt,
    public var `StackBase`: ULong,
    public var `StackEnd`: ULong,
    public var `BackingStoreBase`: ULong,
    public var `BackingStoreEnd`: ULong,
)
// UNSUPPORTED Rust 4218:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "arm64ec", target_arch = "x86", target_arch = "x86_64"))]
// #[cfg(feature = "Win32_System_Kernel")]
// impl Default for MINIDUMP_THREAD_EX_CALLBACK {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[cfg(target_arch = "aarch64")]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MINIDUMP_THREAD_EX_CALLBACK` (
    public var `ThreadId`: UInt,
    public var `ThreadHandle`: `super`.`super`.`super`.`Foundation`.`HANDLE`,
    public var `Pad`: UInt,
    public var `Context`: `CONTEXT`,
    public var `SizeOfContext`: UInt,
    public var `StackBase`: ULong,
    public var `StackEnd`: ULong,
    public var `BackingStoreBase`: ULong,
    public var `BackingStoreEnd`: ULong,
)
// UNSUPPORTED Rust 4240:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "aarch64")]
// #[cfg(feature = "Win32_System_Kernel")]
// impl Default for MINIDUMP_THREAD_EX_CALLBACK {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MINIDUMP_THREAD_EX_LIST` (
    public var `NumberOfThreads`: UInt,
    public var `Threads`: Array<`MINIDUMP_THREAD_EX`>,
)
// UNSUPPORTED Rust 4253:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MINIDUMP_THREAD_EX_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MINIDUMP_THREAD_INFO` (
    public var `ThreadId`: UInt,
    public var `DumpFlags`: `MINIDUMP_THREAD_INFO_DUMP_FLAGS`,
    public var `DumpError`: UInt,
    public var `ExitStatus`: UInt,
    public var `CreateTime`: ULong,
    public var `ExitTime`: ULong,
    public var `KernelTime`: ULong,
    public var `UserTime`: ULong,
    public var `StartAddress`: ULong,
    public var `Affinity`: ULong,
)
public typealias `MINIDUMP_THREAD_INFO_DUMP_FLAGS` = UInt;
public const val `MINIDUMP_THREAD_INFO_ERROR_THREAD`: `MINIDUMP_THREAD_INFO_DUMP_FLAGS` = 1u;
public const val `MINIDUMP_THREAD_INFO_EXITED_THREAD`: `MINIDUMP_THREAD_INFO_DUMP_FLAGS` = 4u;
public const val `MINIDUMP_THREAD_INFO_INVALID_CONTEXT`: `MINIDUMP_THREAD_INFO_DUMP_FLAGS` = 16u;
public const val `MINIDUMP_THREAD_INFO_INVALID_INFO`: `MINIDUMP_THREAD_INFO_DUMP_FLAGS` = 8u;
public const val `MINIDUMP_THREAD_INFO_INVALID_TEB`: `MINIDUMP_THREAD_INFO_DUMP_FLAGS` = 32u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MINIDUMP_THREAD_INFO_LIST` (
    public var `SizeOfHeader`: UInt,
    public var `SizeOfEntry`: UInt,
    public var `NumberOfEntries`: UInt,
)
public const val `MINIDUMP_THREAD_INFO_WRITING_THREAD`: `MINIDUMP_THREAD_INFO_DUMP_FLAGS` = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MINIDUMP_THREAD_LIST` (
    public var `NumberOfThreads`: UInt,
    public var `Threads`: Array<`MINIDUMP_THREAD`>,
)
// UNSUPPORTED Rust 4292:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MINIDUMP_THREAD_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MINIDUMP_THREAD_NAME` (
    public var `ThreadId`: UInt,
    public var `RvaOfThreadName`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MINIDUMP_THREAD_NAME_LIST` (
    public var `NumberOfThreadNames`: UInt,
    public var `ThreadNames`: Array<`MINIDUMP_THREAD_NAME`>,
)
// UNSUPPORTED Rust 4309:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MINIDUMP_THREAD_NAME_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MINIDUMP_TOKEN_INFO_HEADER` (
    public var `TokenSize`: UInt,
    public var `TokenId`: UInt,
    public var `TokenHandle`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MINIDUMP_TOKEN_INFO_LIST` (
    public var `TokenListSize`: UInt,
    public var `TokenListEntries`: UInt,
    public var `ListHeaderSize`: UInt,
    public var `ElementHeaderSize`: UInt,
)
public typealias `MINIDUMP_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MINIDUMP_UNLOADED_MODULE` (
    public var `BaseOfImage`: ULong,
    public var `SizeOfImage`: UInt,
    public var `CheckSum`: UInt,
    public var `TimeDateStamp`: UInt,
    public var `ModuleNameRva`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MINIDUMP_UNLOADED_MODULE_LIST` (
    public var `SizeOfHeader`: UInt,
    public var `SizeOfEntry`: UInt,
    public var `NumberOfEntries`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MINIDUMP_USER_RECORD` (
    public var `Type`: UInt,
    public var `Memory`: `MINIDUMP_LOCATION_DESCRIPTOR`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MINIDUMP_USER_STREAM` (
    public var `Type`: UInt,
    public var `BufferSize`: UInt,
    public var `Buffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 4360:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// impl Default for MINIDUMP_USER_STREAM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MINIDUMP_USER_STREAM` (
    public var `Type`: UInt,
    public var `BufferSize`: UInt,
    public var `Buffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 4374:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for MINIDUMP_USER_STREAM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MINIDUMP_USER_STREAM_INFORMATION` (
    public var `UserStreamCount`: UInt,
    public var `UserStreamArray`: /* Rust *mut */ kotlinx.cinterop.CPointer<`MINIDUMP_USER_STREAM`>?,
)
// UNSUPPORTED Rust 4387:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// impl Default for MINIDUMP_USER_STREAM_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MINIDUMP_USER_STREAM_INFORMATION` (
    public var `UserStreamCount`: UInt,
    public var `UserStreamArray`: /* Rust *mut */ kotlinx.cinterop.CPointer<`MINIDUMP_USER_STREAM`>?,
)
// UNSUPPORTED Rust 4400:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for MINIDUMP_USER_STREAM_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MINIDUMP_VERSION`: UInt = 42899u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MINIDUMP_VM_POST_READ_CALLBACK` (
    public var `Offset`: ULong,
    public var `Buffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Size`: UInt,
    public var `Completed`: UInt,
    public var `Status`: `windows_sys`.`core`.`HRESULT`,
)
// UNSUPPORTED Rust 4416:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MINIDUMP_VM_POST_READ_CALLBACK {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MINIDUMP_VM_PRE_READ_CALLBACK` (
    public var `Offset`: ULong,
    public var `Buffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Size`: UInt,
)
// UNSUPPORTED Rust 4428:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MINIDUMP_VM_PRE_READ_CALLBACK {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MINIDUMP_VM_QUERY_CALLBACK` (
    public var `Offset`: ULong,
)
public const val `MISALIGNED_POINTER_PARAMETER`: `BUGCHECK_ERROR` = 502u;
public const val `MISMATCHED_HAL`: `BUGCHECK_ERROR` = 121u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MODLOAD_CVMISC` (
    public var `oCV`: UInt,
    public var `cCV`: ULong,
    public var `oMisc`: UInt,
    public var `cMisc`: ULong,
    public var `dtImage`: UInt,
    public var `cImage`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MODLOAD_DATA` (
    public var `ssize`: UInt,
    public var `ssig`: `MODLOAD_DATA_TYPE`,
    public var `data`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `size`: UInt,
    public var `flags`: UInt,
)
// UNSUPPORTED Rust 4459:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MODLOAD_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `MODLOAD_DATA_TYPE` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MODLOAD_PDBGUID_PDBAGE` (
    public var `PdbGuid`: `windows_sys`.`core`.`GUID`,
    public var `PdbAge`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MODULE_TYPE_INFO` (
    public var `dataLength`: UShort,
    public var `leaf`: UShort,
    public var `data`: UByteArray,
)
// UNSUPPORTED Rust 4478:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `OMAP` (
    public var `rva`: UInt,
    public var `rvaTo`: UInt,
)
public typealias `OPEN_THREAD_WAIT_CHAIN_SESSION_FLAGS` = UInt;
public const val `OS_DATA_TAMPERING`: `BUGCHECK_ERROR` = 341u;
public const val `OUTPUT_DEBUG_STRING_EVENT`: `DEBUG_EVENT_CODE` = 8u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OUTPUT_DEBUG_STRING_INFO` (
    public var `lpDebugStringData`: `windows_sys`.`core`.`PSTR`,
    public var `fUnicode`: UShort,
    public var `nDebugStringLength`: UShort,
)
// UNSUPPORTED Rust 4622:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PCOGETACTIVATIONSTATE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`GUID`, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PCOGETCALLSTATE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(Int, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PDBGHELP_CREATE_USER_DUMP_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`BOOL`>>>;
public const val `PDC_LOCK_WATCHDOG_LIVEDUMP`: `BUGCHECK_ERROR` = 380u;
public const val `PDC_PRIVILEGE_CHECK_LIVEDUMP`: `BUGCHECK_ERROR` = 415u;
public const val `PDC_UNEXPECTED_REVOCATION_LIVEDUMP`: `BUGCHECK_ERROR` = 381u;
public const val `PDC_WATCHDOG_TIMEOUT`: `BUGCHECK_ERROR` = 335u;
public const val `PDC_WATCHDOG_TIMEOUT_LIVEDUMP`: `BUGCHECK_ERROR` = 348u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PENUMDIRTREE_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCSTR`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PENUMDIRTREE_CALLBACKW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
public typealias `PENUMLOADED_MODULES_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCSTR`, UInt, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PENUMLOADED_MODULES_CALLBACK64` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCSTR`, ULong, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PENUMLOADED_MODULES_CALLBACKW64` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, ULong, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PENUMSOURCEFILETOKENSCALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, ULong) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFINDFILEINPATHCALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCSTR`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFINDFILEINPATHCALLBACKW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFIND_DEBUG_FILE_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`super`.`Foundation`.`HANDLE`, `windows_sys`.`core`.`PCSTR`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFIND_DEBUG_FILE_CALLBACKW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`super`.`Foundation`.`HANDLE`, `windows_sys`.`core`.`PCWSTR`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFIND_EXE_FILE_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`super`.`Foundation`.`HANDLE`, `windows_sys`.`core`.`PCSTR`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFIND_EXE_FILE_CALLBACKW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`super`.`Foundation`.`HANDLE`, `windows_sys`.`core`.`PCWSTR`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`BOOL`>>>;
public const val `PFN_LIST_CORRUPT`: `BUGCHECK_ERROR` = 78u;
public const val `PFN_REFERENCE_COUNT`: `BUGCHECK_ERROR` = 28u;
public const val `PFN_SHARE_COUNT`: `BUGCHECK_ERROR` = 27u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
public typealias `PFUNCTION_TABLE_ACCESS_ROUTINE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`super`.`Foundation`.`HANDLE`, UInt) -> /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFUNCTION_TABLE_ACCESS_ROUTINE64` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`super`.`Foundation`.`HANDLE`, ULong) -> /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?>>>;
public const val `PF_DETECTED_CORRUPTION`: `BUGCHECK_ERROR` = 401u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
public typealias `PGET_MODULE_BASE_ROUTINE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`super`.`Foundation`.`HANDLE`, UInt) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PGET_MODULE_BASE_ROUTINE64` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`super`.`Foundation`.`HANDLE`, ULong) -> ULong>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "arm64ec", target_arch = "x86_64"))]
public typealias `PGET_RUNTIME_FUNCTION_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> /* Rust *mut */ kotlinx.cinterop.CPointer<`IMAGE_RUNTIME_FUNCTION_ENTRY`>?>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "aarch64")]
public typealias `PGET_RUNTIME_FUNCTION_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> /* Rust *mut */ kotlinx.cinterop.CPointer<`IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY`>?>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PGET_TARGET_ATTRIBUTE_VALUE64` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`super`.`Foundation`.`HANDLE`, UInt, ULong, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) -> `windows_sys`.`core`.`BOOL`>>>;
public const val `PHASE0_EXCEPTION`: `BUGCHECK_ERROR` = 120u;
public const val `PHASE0_INITIALIZATION_FAILED`: `BUGCHECK_ERROR` = 49u;
public const val `PHASE1_INITIALIZATION_FAILED`: `BUGCHECK_ERROR` = 50u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PHYSICAL_MEMORY_DESCRIPTOR32` (
    public var `NumberOfRuns`: UInt,
    public var `NumberOfPages`: UInt,
    public var `Run`: Array<`PHYSICAL_MEMORY_RUN32`>,
)
// UNSUPPORTED Rust 4684:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PHYSICAL_MEMORY_DESCRIPTOR32 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PHYSICAL_MEMORY_DESCRIPTOR64` (
    public var `NumberOfRuns`: UInt,
    public var `NumberOfPages`: ULong,
    public var `Run`: Array<`PHYSICAL_MEMORY_RUN64`>,
)
// UNSUPPORTED Rust 4696:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PHYSICAL_MEMORY_DESCRIPTOR64 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PHYSICAL_MEMORY_RUN32` (
    public var `BasePage`: UInt,
    public var `PageCount`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PHYSICAL_MEMORY_RUN64` (
    public var `BasePage`: ULong,
    public var `PageCount`: ULong,
)
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PIMAGEHLP_STATUS_ROUTINE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`IMAGEHLP_STATUS_REASON`, `windows_sys`.`core`.`PCSTR`, `windows_sys`.`core`.`PCSTR`, ULong, ULong) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PIMAGEHLP_STATUS_ROUTINE32` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`IMAGEHLP_STATUS_REASON`, `windows_sys`.`core`.`PCSTR`, `windows_sys`.`core`.`PCSTR`, UInt, ULong) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PIMAGEHLP_STATUS_ROUTINE64` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`IMAGEHLP_STATUS_REASON`, `windows_sys`.`core`.`PCSTR`, `windows_sys`.`core`.`PCSTR`, ULong, ULong) -> `windows_sys`.`core`.`BOOL`>>>;
public const val `PINBALL_FILE_SYSTEM`: `BUGCHECK_ERROR` = 89u;
public const val `PNP_DETECTED_FATAL_ERROR`: `BUGCHECK_ERROR` = 202u;
public const val `PNP_INTERNAL_ERROR`: `BUGCHECK_ERROR` = 149u;
public const val `POOL_CORRUPTION_IN_FILE_AREA`: `BUGCHECK_ERROR` = 222u;
public const val `PORT_DRIVER_INTERNAL`: `BUGCHECK_ERROR` = 44u;
public const val `POWER_FAILURE_SIMULATE`: `BUGCHECK_ERROR` = 229u;
public const val `PP0_INITIALIZATION_FAILED`: `BUGCHECK_ERROR` = 143u;
public const val `PP1_INITIALIZATION_FAILED`: `BUGCHECK_ERROR` = 144u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
public typealias `PREAD_PROCESS_MEMORY_ROUTINE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`super`.`Foundation`.`HANDLE`, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PREAD_PROCESS_MEMORY_ROUTINE64` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`super`.`Foundation`.`HANDLE`, ULong, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`BOOL`>>>;
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
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PSYMBOLSERVERBYINDEXPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCSTR`, `windows_sys`.`core`.`PCSTR`, `windows_sys`.`core`.`PCSTR`, `windows_sys`.`core`.`PCSTR`) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PSYMBOLSERVERBYINDEXPROCA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCSTR`, `windows_sys`.`core`.`PCSTR`, `windows_sys`.`core`.`PCSTR`, `windows_sys`.`core`.`PCSTR`) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PSYMBOLSERVERBYINDEXPROCW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PCWSTR`) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PSYMBOLSERVERCALLBACKPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, ULong, ULong) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PSYMBOLSERVERCLOSEPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PSYMBOLSERVERDELTANAME` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, UInt, `windows_sys`.`core`.`PCSTR`, ULong) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PSYMBOLSERVERDELTANAMEW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, UInt, `windows_sys`.`core`.`PCWSTR`, ULong) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PSYMBOLSERVERGETINDEXSTRING` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, UInt, `windows_sys`.`core`.`PCSTR`, ULong) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PSYMBOLSERVERGETINDEXSTRINGW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, UInt, `windows_sys`.`core`.`PCWSTR`, ULong) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PSYMBOLSERVERGETOPTIONDATAPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PSYMBOLSERVERGETOPTIONSPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> ULong>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PSYMBOLSERVERGETSUPPLEMENT` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCSTR`, `windows_sys`.`core`.`PCSTR`, `windows_sys`.`core`.`PCSTR`, `windows_sys`.`core`.`PCSTR`, ULong) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PSYMBOLSERVERGETSUPPLEMENTW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PCWSTR`, ULong) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PSYMBOLSERVERGETVERSION` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`API_VERSION`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PSYMBOLSERVERISSTORE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCSTR`) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PSYMBOLSERVERISSTOREW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PSYMBOLSERVERMESSAGEPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, ULong, ULong) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PSYMBOLSERVEROPENPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PSYMBOLSERVERPINGPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCSTR`) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PSYMBOLSERVERPINGPROCA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCSTR`) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PSYMBOLSERVERPINGPROCW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PSYMBOLSERVERPINGPROCWEX` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PSYMBOLSERVERPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCSTR`, `windows_sys`.`core`.`PCSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, UInt, `windows_sys`.`core`.`PCSTR`) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PSYMBOLSERVERPROCA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCSTR`, `windows_sys`.`core`.`PCSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, UInt, `windows_sys`.`core`.`PCSTR`) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PSYMBOLSERVERPROCW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PCWSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, UInt, `windows_sys`.`core`.`PCWSTR`) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PSYMBOLSERVERSETHTTPAUTHHEADER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PSYMBOLSERVERSETOPTIONSPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, ULong) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PSYMBOLSERVERSETOPTIONSWPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, ULong) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PSYMBOLSERVERSTOREFILE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCSTR`, `windows_sys`.`core`.`PCSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, UInt, `windows_sys`.`core`.`PCSTR`, ULong, UInt) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PSYMBOLSERVERSTOREFILEW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PCWSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, UInt, `windows_sys`.`core`.`PCWSTR`, ULong, UInt) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PSYMBOLSERVERSTORESUPPLEMENT` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCSTR`, `windows_sys`.`core`.`PCSTR`, `windows_sys`.`core`.`PCSTR`, `windows_sys`.`core`.`PCSTR`, ULong, UInt) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PSYMBOLSERVERSTORESUPPLEMENTW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PCWSTR`, ULong, UInt) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PSYMBOLSERVERVERSION` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PSYMBOLSERVERWEXPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PCWSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, UInt, `windows_sys`.`core`.`PCWSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<`SYMSRV_EXTENDED_OUTPUT_DATA`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PSYMBOL_FUNCENTRY_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`super`.`Foundation`.`HANDLE`, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PSYMBOL_FUNCENTRY_CALLBACK64` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`super`.`Foundation`.`HANDLE`, ULong, ULong) -> /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
public typealias `PSYMBOL_REGISTERED_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`super`.`Foundation`.`HANDLE`, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PSYMBOL_REGISTERED_CALLBACK64` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`super`.`Foundation`.`HANDLE`, UInt, ULong, ULong) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PSYM_ENUMERATESYMBOLS_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`SYMBOL_INFO`>?, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PSYM_ENUMERATESYMBOLS_CALLBACKW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`SYMBOL_INFOW`>?, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PSYM_ENUMLINES_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`SRCCODEINFO`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PSYM_ENUMLINES_CALLBACKW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`SRCCODEINFOW`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
public typealias `PSYM_ENUMMODULES_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCSTR`, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PSYM_ENUMMODULES_CALLBACK64` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCSTR`, ULong, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PSYM_ENUMMODULES_CALLBACKW64` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, ULong, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PSYM_ENUMPROCESSES_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`super`.`Foundation`.`HANDLE`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PSYM_ENUMSOURCEFILES_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`SOURCEFILE`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PSYM_ENUMSOURCEFILES_CALLBACKW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`SOURCEFILEW`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
public typealias `PSYM_ENUMSYMBOLS_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCSTR`, UInt, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PSYM_ENUMSYMBOLS_CALLBACK64` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCSTR`, ULong, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PSYM_ENUMSYMBOLS_CALLBACK64W` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, ULong, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
public typealias `PSYM_ENUMSYMBOLS_CALLBACKW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, UInt, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
public typealias `PTRANSLATE_ADDRESS_ROUTINE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`super`.`Foundation`.`HANDLE`, `super`.`super`.`super`.`Foundation`.`HANDLE`, /* Rust *mut */ kotlinx.cinterop.CPointer<`ADDRESS`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PTRANSLATE_ADDRESS_ROUTINE64` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`super`.`Foundation`.`HANDLE`, `super`.`super`.`super`.`Foundation`.`HANDLE`, /* Rust *const */ kotlinx.cinterop.CPointer<`ADDRESS64`>?) -> ULong>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
public typealias `PVECTORED_EXCEPTION_HANDLER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`EXCEPTION_POINTERS`>?) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PWAITCHAINCALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, ULong, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`WAITCHAIN_NODE_INFO`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) -> Unit>>>;
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
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `RESTORE_LAST_ERROR_NAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RestoreLastError");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `RESTORE_LAST_ERROR_NAME_A`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("RestoreLastError");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `RESTORE_LAST_ERROR_NAME_W`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("RestoreLastError");
public const val `RIP_EVENT`: `DEBUG_EVENT_CODE` = 9u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `RIP_INFO` (
    public var `dwError`: UInt,
    public var `dwType`: `RIP_INFO_TYPE`,
)
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SOURCEFILE` (
    public var `ModBase`: ULong,
    public var `FileName`: `windows_sys`.`core`.`PSTR`,
)
// UNSUPPORTED Rust 4918:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SOURCEFILE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SOURCEFILEW` (
    public var `ModBase`: ULong,
    public var `FileName`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 4929:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 261 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SRCCODEINFO` (
    public var `SizeOfStruct`: UInt,
    public var `Key`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `ModBase`: ULong,
    public var `Obj`: ByteArray,
    public var `FileName`: ByteArray,
    public var `LineNumber`: UInt,
    public var `Address`: ULong,
)
// UNSUPPORTED Rust 4952:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SRCCODEINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 261 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SRCCODEINFOW` (
    public var `SizeOfStruct`: UInt,
    public var `Key`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `ModBase`: ULong,
    public var `Obj`: UShortArray,
    public var `FileName`: UShortArray,
    public var `LineNumber`: UInt,
    public var `Address`: ULong,
)
// UNSUPPORTED Rust 4968:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `STACKFRAME` (
    public var `AddrPC`: `ADDRESS`,
    public var `AddrReturn`: `ADDRESS`,
    public var `AddrFrame`: `ADDRESS`,
    public var `AddrStack`: `ADDRESS`,
    public var `FuncTableEntry`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Params`: UIntArray,
    public var `Far`: `windows_sys`.`core`.`BOOL`,
    public var `Virtual`: `windows_sys`.`core`.`BOOL`,
    public var `Reserved`: UIntArray,
    public var `KdHelp`: `KDHELP`,
    public var `AddrBStore`: `ADDRESS`,
)
// UNSUPPORTED Rust 5043:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// impl Default for STACKFRAME {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `STACKFRAME64` (
    public var `AddrPC`: `ADDRESS64`,
    public var `AddrReturn`: `ADDRESS64`,
    public var `AddrFrame`: `ADDRESS64`,
    public var `AddrStack`: `ADDRESS64`,
    public var `AddrBStore`: `ADDRESS64`,
    public var `FuncTableEntry`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Params`: ULongArray,
    public var `Far`: `windows_sys`.`core`.`BOOL`,
    public var `Virtual`: `windows_sys`.`core`.`BOOL`,
    public var `Reserved`: ULongArray,
    public var `KdHelp`: `KDHELP64`,
)
// UNSUPPORTED Rust 5064:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STACKFRAME64 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `STACKFRAME_EX` (
    public var `AddrPC`: `ADDRESS64`,
    public var `AddrReturn`: `ADDRESS64`,
    public var `AddrFrame`: `ADDRESS64`,
    public var `AddrStack`: `ADDRESS64`,
    public var `AddrBStore`: `ADDRESS64`,
    public var `FuncTableEntry`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Params`: ULongArray,
    public var `Far`: `windows_sys`.`core`.`BOOL`,
    public var `Virtual`: `windows_sys`.`core`.`BOOL`,
    public var `Reserved`: ULongArray,
    public var `KdHelp`: `KDHELP64`,
    public var `StackFrameSize`: UInt,
    public var `InlineFrameContext`: UInt,
)
// UNSUPPORTED Rust 5086:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STACKFRAME_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `STORAGE_DEVICE_ABNORMALITY_DETECTED`: `BUGCHECK_ERROR` = 320u;
public const val `STORAGE_MINIPORT_ERROR`: `BUGCHECK_ERROR` = 240u;
public const val `STORE_DATA_STRUCTURE_CORRUPTION`: `BUGCHECK_ERROR` = 455u;
public const val `STREAMS_INTERNAL_ERROR`: `BUGCHECK_ERROR` = 75u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `SYMADDSOURCESTREAM` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`super`.`Foundation`.`HANDLE`, ULong, `windows_sys`.`core`.`PCSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, ULong) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `SYMADDSOURCESTREAMA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`super`.`Foundation`.`HANDLE`, ULong, `windows_sys`.`core`.`PCSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, ULong) -> `windows_sys`.`core`.`BOOL`>>>;
public const val `SYMBOLIC_INITIALIZATION_FAILED`: `BUGCHECK_ERROR` = 100u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SYMBOL_INFO` (
    public var `SizeOfStruct`: UInt,
    public var `TypeIndex`: UInt,
    public var `Reserved`: ULongArray,
    public var `Index`: UInt,
    public var `Size`: UInt,
    public var `ModBase`: ULong,
    public var `Flags`: `SYMBOL_INFO_FLAGS`,
    public var `Value`: ULong,
    public var `Address`: ULong,
    public var `Register`: UInt,
    public var `Scope`: UInt,
    public var `Tag`: UInt,
    public var `NameLen`: UInt,
    public var `MaxNameLen`: UInt,
    public var `Name`: ByteArray,
)
// UNSUPPORTED Rust 5117:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SYMBOL_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SYMBOL_INFOW` (
    public var `SizeOfStruct`: UInt,
    public var `TypeIndex`: UInt,
    public var `Reserved`: ULongArray,
    public var `Index`: UInt,
    public var `Size`: UInt,
    public var `ModBase`: ULong,
    public var `Flags`: `SYMBOL_INFO_FLAGS`,
    public var `Value`: ULong,
    public var `Address`: ULong,
    public var `Register`: UInt,
    public var `Scope`: UInt,
    public var `Tag`: UInt,
    public var `NameLen`: UInt,
    public var `MaxNameLen`: UInt,
    public var `Name`: UShortArray,
)
// UNSUPPORTED Rust 5141:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SYMBOL_INFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `SYMBOL_INFO_FLAGS` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 2001 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SYMBOL_INFO_PACKAGE` (
    public var `si`: `SYMBOL_INFO`,
    public var `name`: ByteArray,
)
// UNSUPPORTED Rust 5153:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SYMBOL_INFO_PACKAGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 2001 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SYMBOL_INFO_PACKAGEW` (
    public var `si`: `SYMBOL_INFOW`,
    public var `name`: UShortArray,
)
// UNSUPPORTED Rust 5164:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 261 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SYMSRV_EXTENDED_OUTPUT_DATA` (
    public var `sizeOfStruct`: UInt,
    public var `version`: UInt,
    public var `filePtrMsg`: UShortArray,
)
// UNSUPPORTED Rust 5258:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SYMSRV_EXTENDED_OUTPUT_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 261 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SYMSRV_INDEX_INFO` (
    public var `sizeofstruct`: UInt,
    public var `file`: ByteArray,
    public var `stripped`: `windows_sys`.`core`.`BOOL`,
    public var `timestamp`: UInt,
    public var `size`: UInt,
    public var `dbgfile`: ByteArray,
    public var `pdbfile`: ByteArray,
    public var `guid`: `windows_sys`.`core`.`GUID`,
    public var `sig`: UInt,
    public var `age`: UInt,
)
// UNSUPPORTED Rust 5277:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SYMSRV_INDEX_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 261 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SYMSRV_INDEX_INFOW` (
    public var `sizeofstruct`: UInt,
    public var `file`: UShortArray,
    public var `stripped`: `windows_sys`.`core`.`BOOL`,
    public var `timestamp`: UInt,
    public var `size`: UInt,
    public var `dbgfile`: UShortArray,
    public var `pdbfile`: UShortArray,
    public var `guid`: `windows_sys`.`core`.`GUID`,
    public var `sig`: UInt,
    public var `age`: UInt,
)
// UNSUPPORTED Rust 5296:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TI_FINDCHILDREN_PARAMS` (
    public var `Count`: UInt,
    public var `Start`: UInt,
    public var `ChildId`: UIntArray,
)
// UNSUPPORTED Rust 5366:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `UNLOAD_DLL_DEBUG_INFO` (
    public var `lpBaseOfDll`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 5454:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for UNLOAD_DLL_DEBUG_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `UNMOUNTABLE_BOOT_VOLUME`: `BUGCHECK_ERROR` = 237u;
public const val `UNSUPPORTED_INSTRUCTION_MODE`: `BUGCHECK_ERROR` = 337u;
public const val `UNSUPPORTED_PROCESSOR`: `BUGCHECK_ERROR` = 93u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 12 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `UNWIND_HISTORY_TABLE` (
    public var `Count`: UInt,
    public var `LocalHint`: UByte,
    public var `GlobalHint`: UByte,
    public var `Search`: UByte,
    public var `Once`: UByte,
    public var `LowAddress`: ULong,
    public var `HighAddress`: ULong,
    public var `Entry`: Array<`UNWIND_HISTORY_TABLE_ENTRY`>,
)
// UNSUPPORTED Rust 5475:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for UNWIND_HISTORY_TABLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `UNWIND_HISTORY_TABLE_ENTRY` (
    public var `ImageBase`: ULong,
    public var `FunctionEntry`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IMAGE_RUNTIME_FUNCTION_ENTRY`>?,
)
// UNSUPPORTED Rust 5488:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for UNWIND_HISTORY_TABLE_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(target_arch = "aarch64")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `UNWIND_HISTORY_TABLE_ENTRY` (
    public var `ImageBase`: ULong,
    public var `FunctionEntry`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY`>?,
)
// UNSUPPORTED Rust 5501:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WAITCHAIN_NODE_INFO` (
    public var `ObjectType`: `WCT_OBJECT_TYPE`,
    public var `ObjectStatus`: `WCT_OBJECT_STATUS`,
    public var `Anonymous`: `WAITCHAIN_NODE_INFO_0`,
)
// UNSUPPORTED Rust 5556:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WAITCHAIN_NODE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5561:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WAITCHAIN_NODE_INFO_0 {
//     pub LockObject: WAITCHAIN_NODE_INFO_0_0,
//     pub ThreadObject: WAITCHAIN_NODE_INFO_0_1,
// }

// UNSUPPORTED Rust 5567:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WAITCHAIN_NODE_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 128 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WAITCHAIN_NODE_INFO_0_0` (
    public var `ObjectName`: UShortArray,
    public var `Timeout`: Long,
    public var `Alertable`: `windows_sys`.`core`.`BOOL`,
)
// UNSUPPORTED Rust 5579:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WAITCHAIN_NODE_INFO_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WAITCHAIN_NODE_INFO_0_1` (
    public var `ProcessId`: UInt,
    public var `ThreadId`: UInt,
    public var `WaitTime`: UInt,
    public var `ContextSwitches`: UInt,
)
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WHEA_AER_BRIDGE_DESCRIPTOR` (
    public var `Type`: UShort,
    public var `Enabled`: Boolean,
    public var `Reserved`: UByte,
    public var `BusNumber`: UInt,
    public var `Slot`: `WHEA_PCI_SLOT_NUMBER`,
    public var `DeviceControl`: UShort,
    public var `Flags`: `AER_BRIDGE_DESCRIPTOR_FLAGS`,
    public var `UncorrectableErrorMask`: UInt,
    public var `UncorrectableErrorSeverity`: UInt,
    public var `CorrectableErrorMask`: UInt,
    public var `AdvancedCapsAndControl`: UInt,
    public var `SecondaryUncorrectableErrorMask`: UInt,
    public var `SecondaryUncorrectableErrorSev`: UInt,
    public var `SecondaryCapsAndControl`: UInt,
)
// UNSUPPORTED Rust 5622:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WHEA_AER_BRIDGE_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WHEA_AER_ENDPOINT_DESCRIPTOR` (
    public var `Type`: UShort,
    public var `Enabled`: Boolean,
    public var `Reserved`: UByte,
    public var `BusNumber`: UInt,
    public var `Slot`: `WHEA_PCI_SLOT_NUMBER`,
    public var `DeviceControl`: UShort,
    public var `Flags`: `AER_ENDPOINT_DESCRIPTOR_FLAGS`,
    public var `UncorrectableErrorMask`: UInt,
    public var `UncorrectableErrorSeverity`: UInt,
    public var `CorrectableErrorMask`: UInt,
    public var `AdvancedCapsAndControl`: UInt,
)
// UNSUPPORTED Rust 5642:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WHEA_AER_ENDPOINT_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WHEA_AER_ROOTPORT_DESCRIPTOR` (
    public var `Type`: UShort,
    public var `Enabled`: Boolean,
    public var `Reserved`: UByte,
    public var `BusNumber`: UInt,
    public var `Slot`: `WHEA_PCI_SLOT_NUMBER`,
    public var `DeviceControl`: UShort,
    public var `Flags`: `AER_ROOTPORT_DESCRIPTOR_FLAGS`,
    public var `UncorrectableErrorMask`: UInt,
    public var `UncorrectableErrorSeverity`: UInt,
    public var `CorrectableErrorMask`: UInt,
    public var `AdvancedCapsAndControl`: UInt,
    public var `RootErrorCommand`: UInt,
)
// UNSUPPORTED Rust 5663:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WHEA_DEVICE_DRIVER_DESCRIPTOR` (
    public var `Type`: UShort,
    public var `Enabled`: Boolean,
    public var `Reserved`: UByte,
    public var `SourceGuid`: `windows_sys`.`core`.`GUID`,
    public var `LogTag`: UShort,
    public var `Reserved2`: UShort,
    public var `PacketLength`: UInt,
    public var `PacketCount`: UInt,
    public var `PacketBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `Config`: `WHEA_ERROR_SOURCE_CONFIGURATION_DD`,
    public var `CreatorId`: `windows_sys`.`core`.`GUID`,
    public var `PartitionId`: `windows_sys`.`core`.`GUID`,
    public var `MaxSectionDataLength`: UInt,
    public var `MaxSectionsPerRecord`: UInt,
    public var `PacketStateBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `OpenHandles`: Int,
)
// UNSUPPORTED Rust 5700:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WHEA_DEVICE_DRIVER_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WHEA_DISABLE_DUMMY_WRITE`: UInt = 6u;
public const val `WHEA_DISABLE_OFFLINE`: UInt = 0u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WHEA_DRIVER_BUFFER_SET` (
    public var `Version`: UInt,
    public var `Data`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `DataSize`: UInt,
    public var `SectionTypeGuid`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
    public var `SectionFriendlyName`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `Flags`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 5717:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WHEA_DRIVER_BUFFER_SET {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHEA_ERROR_SOURCE_CONFIGURATION_DD` (
    public var `Initialize`: `WHEA_ERROR_SOURCE_INITIALIZE_DEVICE_DRIVER`,
    public var `Uninitialize`: `WHEA_ERROR_SOURCE_UNINITIALIZE_DEVICE_DRIVER`,
    public var `Correct`: `WHEA_ERROR_SOURCE_CORRECT_DEVICE_DRIVER`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WHEA_ERROR_SOURCE_CONFIGURATION_DEVICE_DRIVER` (
    public var `Version`: UInt,
    public var `SourceGuid`: `windows_sys`.`core`.`GUID`,
    public var `LogTag`: UShort,
    public var `Reserved`: UByteArray,
    public var `Initialize`: `WHEA_ERROR_SOURCE_INITIALIZE_DEVICE_DRIVER`,
    public var `Uninitialize`: `WHEA_ERROR_SOURCE_UNINITIALIZE_DEVICE_DRIVER`,
    public var `MaxSectionDataLength`: UInt,
    public var `MaxSectionsPerReport`: UInt,
    public var `CreatorId`: `windows_sys`.`core`.`GUID`,
    public var `PartitionId`: `windows_sys`.`core`.`GUID`,
)
// UNSUPPORTED Rust 5743:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WHEA_ERROR_SOURCE_CONFIGURATION_DEVICE_DRIVER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WHEA_ERROR_SOURCE_CONFIGURATION_DEVICE_DRIVER_V1` (
    public var `Version`: UInt,
    public var `SourceGuid`: `windows_sys`.`core`.`GUID`,
    public var `LogTag`: UShort,
    public var `Reserved`: UByteArray,
    public var `Initialize`: `WHEA_ERROR_SOURCE_INITIALIZE_DEVICE_DRIVER`,
    public var `Uninitialize`: `WHEA_ERROR_SOURCE_UNINITIALIZE_DEVICE_DRIVER`,
)
// UNSUPPORTED Rust 5758:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WHEA_ERROR_SOURCE_CONFIGURATION_DEVICE_DRIVER_V1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WHEA_ERROR_SOURCE_CORRECT_DEVICE_DRIVER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WHEA_ERROR_SOURCE_DESCRIPTOR` (
    public var `Length`: UInt,
    public var `Version`: UInt,
    public var `Type`: `WHEA_ERROR_SOURCE_TYPE`,
    public var `State`: `WHEA_ERROR_SOURCE_STATE`,
    public var `MaxRawDataLength`: UInt,
    public var `NumRecordsToPreallocate`: UInt,
    public var `MaxSectionsPerRecord`: UInt,
    public var `ErrorSourceId`: UInt,
    public var `PlatformErrorSourceId`: UInt,
    public var `Flags`: UInt,
    public var `Info`: `WHEA_ERROR_SOURCE_DESCRIPTOR_0`,
)
// UNSUPPORTED Rust 5779:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WHEA_ERROR_SOURCE_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5784:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
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

// UNSUPPORTED Rust 5800:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WHEA_ERROR_SOURCE_INITIALIZE_DEVICE_DRIVER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt) -> `super`.`super`.`super`.`Foundation`.`NTSTATUS`>>>;
public const val `WHEA_ERROR_SOURCE_INVALID_RELATED_SOURCE`: UInt = 65535u;
public typealias `WHEA_ERROR_SOURCE_STATE` = Int;
public typealias `WHEA_ERROR_SOURCE_TYPE` = Int;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WHEA_ERROR_SOURCE_UNINITIALIZE_DEVICE_DRIVER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WHEA_GENERIC_ERROR_DESCRIPTOR` (
    public var `Type`: UShort,
    public var `Reserved`: UByte,
    public var `Enabled`: UByte,
    public var `ErrStatusBlockLength`: UInt,
    public var `RelatedErrorSourceId`: UInt,
    public var `ErrStatusAddressSpaceID`: UByte,
    public var `ErrStatusAddressBitWidth`: UByte,
    public var `ErrStatusAddressBitOffset`: UByte,
    public var `ErrStatusAddressAccessSize`: UByte,
    public var `ErrStatusAddress`: Long,
    public var `Notify`: `WHEA_NOTIFICATION_DESCRIPTOR`,
)
// UNSUPPORTED Rust 5842:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WHEA_GENERIC_ERROR_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WHEA_GENERIC_ERROR_DESCRIPTOR_V2` (
    public var `Type`: UShort,
    public var `Reserved`: UByte,
    public var `Enabled`: UByte,
    public var `ErrStatusBlockLength`: UInt,
    public var `RelatedErrorSourceId`: UInt,
    public var `ErrStatusAddressSpaceID`: UByte,
    public var `ErrStatusAddressBitWidth`: UByte,
    public var `ErrStatusAddressBitOffset`: UByte,
    public var `ErrStatusAddressAccessSize`: UByte,
    public var `ErrStatusAddress`: Long,
    public var `Notify`: `WHEA_NOTIFICATION_DESCRIPTOR`,
    public var `ReadAckAddressSpaceID`: UByte,
    public var `ReadAckAddressBitWidth`: UByte,
    public var `ReadAckAddressBitOffset`: UByte,
    public var `ReadAckAddressAccessSize`: UByte,
    public var `ReadAckAddress`: Long,
    public var `ReadAckPreserveMask`: ULong,
    public var `ReadAckWriteMask`: ULong,
)
// UNSUPPORTED Rust 5869:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WHEA_GENERIC_ERROR_DESCRIPTOR_V2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WHEA_INTERNAL_ERROR`: `BUGCHECK_ERROR` = 290u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHEA_IPF_CMC_DESCRIPTOR` (
    public var `Type`: UShort,
    public var `Enabled`: UByte,
    public var `Reserved`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHEA_IPF_CPE_DESCRIPTOR` (
    public var `Type`: UShort,
    public var `Enabled`: UByte,
    public var `Reserved`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHEA_IPF_MCA_DESCRIPTOR` (
    public var `Type`: UShort,
    public var `Enabled`: UByte,
    public var `Reserved`: UByte,
)
public const val `WHEA_MAX_MC_BANKS`: UInt = 32u;
public const val `WHEA_MEM_PERSISTOFFLINE`: UInt = 1u;
public const val `WHEA_MEM_PFA_DISABLE`: UInt = 2u;
public const val `WHEA_MEM_PFA_PAGECOUNT`: UInt = 3u;
public const val `WHEA_MEM_PFA_THRESHOLD`: UInt = 4u;
public const val `WHEA_MEM_PFA_TIMEOUT`: UInt = 5u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WHEA_NOTIFICATION_DESCRIPTOR` (
    public var `Type`: UByte,
    public var `Length`: UByte,
    public var `Flags`: `WHEA_NOTIFICATION_FLAGS`,
    public var `u`: `WHEA_NOTIFICATION_DESCRIPTOR_0`,
)
// UNSUPPORTED Rust 5910:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WHEA_NOTIFICATION_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 5915:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
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

// UNSUPPORTED Rust 5927:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WHEA_NOTIFICATION_DESCRIPTOR_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHEA_NOTIFICATION_DESCRIPTOR_0_7` (
    public var `PollInterval`: UInt,
    public var `Vector`: UInt,
    public var `SwitchToPollingThreshold`: UInt,
    public var `SwitchToPollingWindow`: UInt,
    public var `ErrorThreshold`: UInt,
    public var `ErrorThresholdWindow`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHEA_NOTIFICATION_DESCRIPTOR_0_1` (
    public var `PollInterval`: UInt,
    public var `Vector`: UInt,
    public var `SwitchToPollingThreshold`: UInt,
    public var `SwitchToPollingWindow`: UInt,
    public var `ErrorThreshold`: UInt,
    public var `ErrorThresholdWindow`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHEA_NOTIFICATION_DESCRIPTOR_0_2` (
    public var `PollInterval`: UInt,
    public var `Vector`: UInt,
    public var `SwitchToPollingThreshold`: UInt,
    public var `SwitchToPollingWindow`: UInt,
    public var `ErrorThreshold`: UInt,
    public var `ErrorThresholdWindow`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHEA_NOTIFICATION_DESCRIPTOR_0_4` (
    public var `PollInterval`: UInt,
    public var `Vector`: UInt,
    public var `SwitchToPollingThreshold`: UInt,
    public var `SwitchToPollingWindow`: UInt,
    public var `ErrorThreshold`: UInt,
    public var `ErrorThresholdWindow`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHEA_NOTIFICATION_DESCRIPTOR_0_0` (
    public var `PollInterval`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHEA_NOTIFICATION_DESCRIPTOR_0_3` (
    public var `PollInterval`: UInt,
    public var `Vector`: UInt,
    public var `SwitchToPollingThreshold`: UInt,
    public var `SwitchToPollingWindow`: UInt,
    public var `ErrorThreshold`: UInt,
    public var `ErrorThresholdWindow`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHEA_NOTIFICATION_DESCRIPTOR_0_5` (
    public var `PollInterval`: UInt,
    public var `Vector`: UInt,
    public var `SwitchToPollingThreshold`: UInt,
    public var `SwitchToPollingWindow`: UInt,
    public var `ErrorThreshold`: UInt,
    public var `ErrorThresholdWindow`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHEA_NOTIFICATION_DESCRIPTOR_0_6` (
    public var `PollInterval`: UInt,
    public var `Vector`: UInt,
    public var `SwitchToPollingThreshold`: UInt,
    public var `SwitchToPollingWindow`: UInt,
    public var `ErrorThreshold`: UInt,
    public var `ErrorThresholdWindow`: UInt,
)
// UNSUPPORTED Rust 6007:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union WHEA_NOTIFICATION_FLAGS {
//     pub Anonymous: WHEA_NOTIFICATION_FLAGS_0,
//     pub AsUSHORT: u16,
// }

// UNSUPPORTED Rust 6013:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WHEA_NOTIFICATION_FLAGS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHEA_NOTIFICATION_FLAGS_0` (
    public var `_bitfield`: UShort,
)
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WHEA_PCI_SLOT_NUMBER` (
    public var `u`: `WHEA_PCI_SLOT_NUMBER_0`,
)
// UNSUPPORTED Rust 6041:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WHEA_PCI_SLOT_NUMBER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6046:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union WHEA_PCI_SLOT_NUMBER_0 {
//     pub bits: WHEA_PCI_SLOT_NUMBER_0_0,
//     pub AsULONG: u32,
// }

// UNSUPPORTED Rust 6052:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WHEA_PCI_SLOT_NUMBER_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHEA_PCI_SLOT_NUMBER_0_0` (
    public var `_bitfield`: UInt,
)
public const val `WHEA_PENDING_PAGE_LIST_SZ`: UInt = 13u;
public const val `WHEA_RESTORE_CMCI_ATTEMPTS`: UInt = 8u;
public const val `WHEA_RESTORE_CMCI_ENABLED`: UInt = 7u;
public const val `WHEA_RESTORE_CMCI_ERR_LIMIT`: UInt = 9u;
public const val `WHEA_ROW_FAIL_CHECK_ENABLE`: UInt = 18u;
public const val `WHEA_ROW_FAIL_CHECK_EXTENT`: UInt = 17u;
public const val `WHEA_ROW_FAIL_CHECK_THRESHOLD`: UInt = 19u;
public const val `WHEA_UNCORRECTABLE_ERROR`: `BUGCHECK_ERROR` = 292u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WHEA_XPF_CMC_DESCRIPTOR` (
    public var `Type`: UShort,
    public var `Enabled`: Boolean,
    public var `NumberOfBanks`: UByte,
    public var `Reserved`: UInt,
    public var `Notify`: `WHEA_NOTIFICATION_DESCRIPTOR`,
    public var `Banks`: Array<`WHEA_XPF_MC_BANK_DESCRIPTOR`>,
)
// UNSUPPORTED Rust 6080:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WHEA_XPF_CMC_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WHEA_XPF_MCE_DESCRIPTOR` (
    public var `Type`: UShort,
    public var `Enabled`: UByte,
    public var `NumberOfBanks`: UByte,
    public var `Flags`: `XPF_MCE_FLAGS`,
    public var `MCG_Capability`: ULong,
    public var `MCG_GlobalControl`: ULong,
    public var `Banks`: Array<`WHEA_XPF_MC_BANK_DESCRIPTOR`>,
)
// UNSUPPORTED Rust 6096:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WHEA_XPF_MCE_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WHEA_XPF_MC_BANK_DESCRIPTOR` (
    public var `BankNumber`: UByte,
    public var `ClearOnInitialization`: Boolean,
    public var `StatusDataFormat`: UByte,
    public var `Flags`: `XPF_MC_BANK_FLAGS`,
    public var `ControlMsr`: UInt,
    public var `StatusMsr`: UInt,
    public var `AddressMsr`: UInt,
    public var `MiscMsr`: UInt,
    public var `ControlData`: ULong,
)
// UNSUPPORTED Rust 6114:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WHEA_XPF_MC_BANK_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WHEA_XPF_MC_BANK_STATUSFORMAT_AMD64MCA`: UInt = 2u;
public const val `WHEA_XPF_MC_BANK_STATUSFORMAT_IA32MCA`: UInt = 0u;
public const val `WHEA_XPF_MC_BANK_STATUSFORMAT_Intel64MCA`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHEA_XPF_NMI_DESCRIPTOR` (
    public var `Type`: UShort,
    public var `Enabled`: Boolean,
)
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 512 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WOW64_CONTEXT` (
    public var `ContextFlags`: `WOW64_CONTEXT_FLAGS`,
    public var `Dr0`: UInt,
    public var `Dr1`: UInt,
    public var `Dr2`: UInt,
    public var `Dr3`: UInt,
    public var `Dr6`: UInt,
    public var `Dr7`: UInt,
    public var `FloatSave`: `WOW64_FLOATING_SAVE_AREA`,
    public var `SegGs`: UInt,
    public var `SegFs`: UInt,
    public var `SegEs`: UInt,
    public var `SegDs`: UInt,
    public var `Edi`: UInt,
    public var `Esi`: UInt,
    public var `Ebx`: UInt,
    public var `Edx`: UInt,
    public var `Ecx`: UInt,
    public var `Eax`: UInt,
    public var `Ebp`: UInt,
    public var `Eip`: UInt,
    public var `SegCs`: UInt,
    public var `EFlags`: UInt,
    public var `Esp`: UInt,
    public var `SegSs`: UInt,
    public var `ExtendedRegisters`: UByteArray,
)
// UNSUPPORTED Rust 6183:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WOW64_DESCRIPTOR_TABLE_ENTRY` (
    public var `Selector`: UInt,
    public var `Descriptor`: `WOW64_LDT_ENTRY`,
)
// UNSUPPORTED Rust 6209:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WOW64_DESCRIPTOR_TABLE_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 80 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WOW64_FLOATING_SAVE_AREA` (
    public var `ControlWord`: UInt,
    public var `StatusWord`: UInt,
    public var `TagWord`: UInt,
    public var `ErrorOffset`: UInt,
    public var `ErrorSelector`: UInt,
    public var `DataOffset`: UInt,
    public var `DataSelector`: UInt,
    public var `RegisterArea`: UByteArray,
    public var `Cr0NpxState`: UInt,
)
// UNSUPPORTED Rust 6227:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WOW64_FLOATING_SAVE_AREA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WOW64_LDT_ENTRY` (
    public var `LimitLow`: UShort,
    public var `BaseLow`: UShort,
    public var `HighWord`: `WOW64_LDT_ENTRY_0`,
)
// UNSUPPORTED Rust 6239:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WOW64_LDT_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6244:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WOW64_LDT_ENTRY_0 {
//     pub Bytes: WOW64_LDT_ENTRY_0_0,
//     pub Bits: WOW64_LDT_ENTRY_0_1,
// }

// UNSUPPORTED Rust 6250:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WOW64_LDT_ENTRY_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WOW64_LDT_ENTRY_0_1` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WOW64_LDT_ENTRY_0_0` (
    public var `BaseMid`: UByte,
    public var `Flags1`: UByte,
    public var `Flags2`: UByte,
    public var `BaseHi`: UByte,
)
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
// UNSUPPORTED Rust 6337:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union XPF_MCE_FLAGS {
//     pub Anonymous: XPF_MCE_FLAGS_0,
//     pub AsULONG: u32,
// }

// UNSUPPORTED Rust 6343:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for XPF_MCE_FLAGS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `XPF_MCE_FLAGS_0` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 6353:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union XPF_MC_BANK_FLAGS {
//     pub Anonymous: XPF_MC_BANK_FLAGS_0,
//     pub AsUCHAR: u8,
// }

// UNSUPPORTED Rust 6359:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for XPF_MC_BANK_FLAGS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `XPF_MC_BANK_FLAGS_0` (
    public var `_bitfield`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `XSAVE_AREA` (
    public var `LegacyState`: `XSAVE_FORMAT`,
    public var `Header`: `XSAVE_AREA_HEADER`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `XSAVE_AREA_HEADER` (
    public var `Mask`: ULong,
    public var `CompactionMask`: ULong,
    public var `Reserved2`: ULongArray,
)
// UNSUPPORTED Rust 6382:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for XSAVE_AREA_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 8 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 224 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `XSAVE_FORMAT` (
    public var `ControlWord`: UShort,
    public var `StatusWord`: UShort,
    public var `TagWord`: UByte,
    public var `Reserved1`: UByte,
    public var `ErrorOpcode`: UShort,
    public var `ErrorOffset`: UInt,
    public var `ErrorSelector`: UShort,
    public var `Reserved2`: UShort,
    public var `DataOffset`: UInt,
    public var `DataSelector`: UShort,
    public var `Reserved3`: UShort,
    public var `MxCsr`: UInt,
    public var `MxCsr_Mask`: UInt,
    public var `FloatRegisters`: Array<`M128A`>,
    public var `XmmRegisters`: Array<`M128A`>,
    public var `Reserved4`: UByteArray,
)
// UNSUPPORTED Rust 6408:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// impl Default for XSAVE_FORMAT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 8 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 96 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `XSAVE_FORMAT` (
    public var `ControlWord`: UShort,
    public var `StatusWord`: UShort,
    public var `TagWord`: UByte,
    public var `Reserved1`: UByte,
    public var `ErrorOpcode`: UShort,
    public var `ErrorOffset`: UInt,
    public var `ErrorSelector`: UShort,
    public var `Reserved2`: UShort,
    public var `DataOffset`: UInt,
    public var `DataSelector`: UShort,
    public var `Reserved3`: UShort,
    public var `MxCsr`: UInt,
    public var `MxCsr_Mask`: UInt,
    public var `FloatRegisters`: Array<`M128A`>,
    public var `XmmRegisters`: Array<`M128A`>,
    public var `Reserved4`: UByteArray,
)
// UNSUPPORTED Rust 6435:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for XSAVE_FORMAT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 64 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `XSTATE_CONFIGURATION` (
    public var `EnabledFeatures`: ULong,
    public var `EnabledVolatileFeatures`: ULong,
    public var `Size`: UInt,
    public var `Anonymous`: `XSTATE_CONFIGURATION_0`,
    public var `Features`: Array<`XSTATE_FEATURE`>,
    public var `EnabledSupervisorFeatures`: ULong,
    public var `AlignedFeatures`: ULong,
    public var `AllFeatureSize`: UInt,
    public var `AllFeatures`: UIntArray,
    public var `EnabledUserVisibleSupervisorFeatures`: ULong,
    public var `ExtendedFeatureDisableFeatures`: ULong,
    public var `AllNonLargeFeatureSize`: UInt,
    public var `Spare`: UInt,
)
// UNSUPPORTED Rust 6458:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for XSTATE_CONFIGURATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 6463:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union XSTATE_CONFIGURATION_0 {
//     pub ControlFlags: u32,
//     pub Anonymous: XSTATE_CONFIGURATION_0_0,
// }

// UNSUPPORTED Rust 6469:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for XSTATE_CONFIGURATION_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `XSTATE_CONFIGURATION_0_0` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 64 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `XSTATE_CONFIG_FEATURE_MSC_INFO` (
    public var `SizeOfInfo`: UInt,
    public var `ContextSize`: UInt,
    public var `EnabledFeatures`: ULong,
    public var `Features`: Array<`XSTATE_FEATURE`>,
)
// UNSUPPORTED Rust 6487:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for XSTATE_CONFIG_FEATURE_MSC_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `XSTATE_CONTEXT` (
    public var `Mask`: ULong,
    public var `Length`: UInt,
    public var `Reserved1`: UInt,
    public var `Area`: /* Rust *mut */ kotlinx.cinterop.CPointer<`XSAVE_AREA`>?,
    public var `Reserved2`: UInt,
    public var `Buffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Reserved3`: UInt,
)
// UNSUPPORTED Rust 6504:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// impl Default for XSTATE_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `XSTATE_CONTEXT` (
    public var `Mask`: ULong,
    public var `Length`: UInt,
    public var `Reserved1`: UInt,
    public var `Area`: /* Rust *mut */ kotlinx.cinterop.CPointer<`XSAVE_AREA`>?,
    public var `Buffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 6520:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for XSTATE_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `XSTATE_FEATURE` (
    public var `Offset`: UInt,
    public var `Size`: UInt,
)
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
