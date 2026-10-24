// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advpack.dll, ABI=system, export=AddDelBackupEntryA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AddDelBackupEntryA`(`lpcszfilelist` : `windows_sys`.`core`.`PCSTR`, `lpcszbackupdir` : `windows_sys`.`core`.`PCSTR`, `lpcszbasename` : `windows_sys`.`core`.`PCSTR`, `dwflags` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advpack.dll, ABI=system, export=AddDelBackupEntryW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AddDelBackupEntryW`(`lpcszfilelist` : `windows_sys`.`core`.`PCWSTR`, `lpcszbackupdir` : `windows_sys`.`core`.`PCWSTR`, `lpcszbasename` : `windows_sys`.`core`.`PCWSTR`, `dwflags` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advpack.dll, ABI=system, export=AdvInstallFileA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AdvInstallFileA`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `lpszsourcedir` : `windows_sys`.`core`.`PCSTR`, `lpszsourcefile` : `windows_sys`.`core`.`PCSTR`, `lpszdestdir` : `windows_sys`.`core`.`PCSTR`, `lpszdestfile` : `windows_sys`.`core`.`PCSTR`, `dwflags` : UInt, `dwreserved` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advpack.dll, ABI=system, export=AdvInstallFileW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AdvInstallFileW`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `lpszsourcedir` : `windows_sys`.`core`.`PCWSTR`, `lpszsourcefile` : `windows_sys`.`core`.`PCWSTR`, `lpszdestdir` : `windows_sys`.`core`.`PCWSTR`, `lpszdestfile` : `windows_sys`.`core`.`PCWSTR`, `dwflags` : UInt, `dwreserved` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=apphelp.dll, ABI=system, export=ApphelpCheckShellObject; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ApphelpCheckShellObject`(`objectclsid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `bshimifnecessary` : `windows_sys`.`core`.`BOOL`, `pullflags` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=CancelDeviceWakeupRequest; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CancelDeviceWakeupRequest`(`hdevice` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advpack.dll, ABI=system, export=CloseINFEngine; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CloseINFEngine`(`hinf` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-realtime-l1-1-2.dll, ABI=system, export=ConvertAuxiliaryCounterToPerformanceCounter; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ConvertAuxiliaryCounterToPerformanceCounter`(`ullauxiliarycountervalue` : ULong, `lpperformancecountervalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `lpconversionerror` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-realtime-l1-1-2.dll, ABI=system, export=ConvertPerformanceCounterToAuxiliaryCounter; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ConvertPerformanceCounterToAuxiliaryCounter`(`ullperformancecountervalue` : ULong, `lpauxiliarycountervalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `lpconversionerror` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dciman32.dll, ABI=system, export=DCIBeginAccess; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DCIBeginAccess`(`pdci` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DCISURFACEINFO`>?, `x` : Int, `y` : Int, `dx` : Int, `dy` : Int) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dciman32.dll, ABI=system, export=DCICloseProvider; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `DCICloseProvider`(`hdc` : `super`.`super`.`Graphics`.`Gdi`.`HDC`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dciman32.dll, ABI=system, export=DCICreateOffscreen; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `DCICreateOffscreen`(`hdc` : `super`.`super`.`Graphics`.`Gdi`.`HDC`, `dwcompression` : UInt, `dwredmask` : UInt, `dwgreenmask` : UInt, `dwbluemask` : UInt, `dwwidth` : UInt, `dwheight` : UInt, `dwdcicaps` : UInt, `dwbitcount` : UInt, `lplpsurface` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DCIOFFSCREEN`>>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dciman32.dll, ABI=system, export=DCICreateOverlay; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `DCICreateOverlay`(`hdc` : `super`.`super`.`Graphics`.`Gdi`.`HDC`, `lpoffscreensurf` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lplpsurface` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DCIOVERLAY`>>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dciman32.dll, ABI=system, export=DCICreatePrimary; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `DCICreatePrimary`(`hdc` : `super`.`super`.`Graphics`.`Gdi`.`HDC`, `lplpsurface` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DCISURFACEINFO`>>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dciman32.dll, ABI=system, export=DCIDestroy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DCIDestroy`(`pdci` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DCISURFACEINFO`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dciman32.dll, ABI=system, export=DCIDraw; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DCIDraw`(`pdci` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DCIOFFSCREEN`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dciman32.dll, ABI=system, export=DCIEndAccess; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DCIEndAccess`(`pdci` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DCISURFACEINFO`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dciman32.dll, ABI=system, export=DCIEnum; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `DCIEnum`(`hdc` : `super`.`super`.`Graphics`.`Gdi`.`HDC`, `lprdst` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `lprsrc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `lpfncallback` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dciman32.dll, ABI=system, export=DCIOpenProvider; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `DCIOpenProvider`() : `super`.`super`.`Graphics`.`Gdi`.`HDC`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dciman32.dll, ABI=system, export=DCISetClipList; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `DCISetClipList`(`pdci` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DCIOFFSCREEN`>?, `prd` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Graphics`.`Gdi`.`RGNDATA`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dciman32.dll, ABI=system, export=DCISetDestination; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DCISetDestination`(`pdci` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DCIOFFSCREEN`>?, `dst` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `src` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dciman32.dll, ABI=system, export=DCISetSrcDestClip; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `DCISetSrcDestClip`(`pdci` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DCIOFFSCREEN`>?, `srcrc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `destrc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `prd` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Graphics`.`Gdi`.`RGNDATA`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advpack.dll, ABI=system, export=DelNodeA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DelNodeA`(`pszfileordirname` : `windows_sys`.`core`.`PCSTR`, `dwflags` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advpack.dll, ABI=system, export=DelNodeRunDLL32W; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DelNodeRunDLL32W`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `hinstance` : `super`.`super`.`Foundation`.`HINSTANCE`, `pszparms` : `windows_sys`.`core`.`PWSTR`, `nshow` : Int) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advpack.dll, ABI=system, export=DelNodeW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DelNodeW`(`pszfileordirname` : `windows_sys`.`core`.`PCWSTR`, `dwflags` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=DnsHostnameToComputerNameA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DnsHostnameToComputerNameA`(`hostname` : `windows_sys`.`core`.`PCSTR`, `computername` : `windows_sys`.`core`.`PSTR`, `nsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=DnsHostnameToComputerNameW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DnsHostnameToComputerNameW`(`hostname` : `windows_sys`.`core`.`PCWSTR`, `computername` : `windows_sys`.`core`.`PWSTR`, `nsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=DosDateTimeToFileTime; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DosDateTimeToFileTime`(`wfatdate` : UShort, `wfattime` : UShort, `lpfiletime` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`FILETIME`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=EnableProcessOptionalXStateFeatures; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "arm64ec", target_arch = "x86", target_arch = "x86_64"))]
public external fun `EnableProcessOptionalXStateFeatures`(`features` : ULong) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advpack.dll, ABI=system, export=ExecuteCabA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ExecuteCabA`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `pcab` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CABINFOA`>?, `preserved` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advpack.dll, ABI=system, export=ExecuteCabW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ExecuteCabW`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `pcab` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CABINFOW`>?, `preserved` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advpack.dll, ABI=system, export=ExtractFilesA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ExtractFilesA`(`pszcabname` : `windows_sys`.`core`.`PCSTR`, `pszexpanddir` : `windows_sys`.`core`.`PCSTR`, `dwflags` : UInt, `pszfilelist` : `windows_sys`.`core`.`PCSTR`, `lpreserved` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwreserved` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advpack.dll, ABI=system, export=ExtractFilesW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ExtractFilesW`(`pszcabname` : `windows_sys`.`core`.`PCWSTR`, `pszexpanddir` : `windows_sys`.`core`.`PCWSTR`, `dwflags` : UInt, `pszfilelist` : `windows_sys`.`core`.`PCWSTR`, `lpreserved` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwreserved` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advpack.dll, ABI=system, export=FileSaveMarkNotExistA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FileSaveMarkNotExistA`(`lpfilelist` : `windows_sys`.`core`.`PCSTR`, `lpdir` : `windows_sys`.`core`.`PCSTR`, `lpbasename` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advpack.dll, ABI=system, export=FileSaveMarkNotExistW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FileSaveMarkNotExistW`(`lpfilelist` : `windows_sys`.`core`.`PCWSTR`, `lpdir` : `windows_sys`.`core`.`PCWSTR`, `lpbasename` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advpack.dll, ABI=system, export=FileSaveRestoreOnINFA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FileSaveRestoreOnINFA`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `psztitle` : `windows_sys`.`core`.`PCSTR`, `pszinf` : `windows_sys`.`core`.`PCSTR`, `pszsection` : `windows_sys`.`core`.`PCSTR`, `pszbackupdir` : `windows_sys`.`core`.`PCSTR`, `pszbasebackupfile` : `windows_sys`.`core`.`PCSTR`, `dwflags` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advpack.dll, ABI=system, export=FileSaveRestoreOnINFW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FileSaveRestoreOnINFW`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `psztitle` : `windows_sys`.`core`.`PCWSTR`, `pszinf` : `windows_sys`.`core`.`PCWSTR`, `pszsection` : `windows_sys`.`core`.`PCWSTR`, `pszbackupdir` : `windows_sys`.`core`.`PCWSTR`, `pszbasebackupfile` : `windows_sys`.`core`.`PCWSTR`, `dwflags` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advpack.dll, ABI=system, export=FileSaveRestoreW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FileSaveRestoreW`(`hdlg` : `super`.`super`.`Foundation`.`HWND`, `lpfilelist` : `windows_sys`.`core`.`PCWSTR`, `lpdir` : `windows_sys`.`core`.`PCWSTR`, `lpbasename` : `windows_sys`.`core`.`PCWSTR`, `dwflags` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=FileTimeToDosDateTime; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FileTimeToDosDateTime`(`lpfiletime` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`FILETIME`>?, `lpfatdate` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `lpfattime` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-dx-d3dkmt-l1-1-0.dll, ABI=system, export=GdiEntry13; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdiEntry13`() : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetComputerNameA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetComputerNameA`(`lpbuffer` : `windows_sys`.`core`.`PSTR`, `nsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetComputerNameW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetComputerNameW`(`lpbuffer` : `windows_sys`.`core`.`PWSTR`, `nsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=GetCurrentHwProfileA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetCurrentHwProfileA`(`lphwprofileinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HW_PROFILE_INFOA`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=GetCurrentHwProfileW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetCurrentHwProfileW`(`lphwprofileinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HW_PROFILE_INFOW`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dciman32.dll, ABI=system, export=GetDCRegionData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GetDCRegionData`(`hdc` : `super`.`super`.`Graphics`.`Gdi`.`HDC`, `size` : UInt, `prd` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Graphics`.`Gdi`.`RGNDATA`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-featurestaging-l1-1-0.dll, ABI=system, export=GetFeatureEnabledState; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetFeatureEnabledState`(`featureid` : UInt, `changetime` : `FEATURE_CHANGE_TIME`) : `FEATURE_ENABLED_STATE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-featurestaging-l1-1-1.dll, ABI=system, export=GetFeatureVariant; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetFeatureVariant`(`featureid` : UInt, `changetime` : `FEATURE_CHANGE_TIME`, `payloadid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `hasnotification` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetFirmwareEnvironmentVariableA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetFirmwareEnvironmentVariableA`(`lpname` : `windows_sys`.`core`.`PCSTR`, `lpguid` : `windows_sys`.`core`.`PCSTR`, `pbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `nsize` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetFirmwareEnvironmentVariableExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetFirmwareEnvironmentVariableExA`(`lpname` : `windows_sys`.`core`.`PCSTR`, `lpguid` : `windows_sys`.`core`.`PCSTR`, `pbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `nsize` : UInt, `pdwattribubutes` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetFirmwareEnvironmentVariableExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetFirmwareEnvironmentVariableExW`(`lpname` : `windows_sys`.`core`.`PCWSTR`, `lpguid` : `windows_sys`.`core`.`PCWSTR`, `pbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `nsize` : UInt, `pdwattribubutes` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetFirmwareEnvironmentVariableW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetFirmwareEnvironmentVariableW`(`lpname` : `windows_sys`.`core`.`PCWSTR`, `lpguid` : `windows_sys`.`core`.`PCWSTR`, `pbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `nsize` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetPrivateProfileIntA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetPrivateProfileIntA`(`lpappname` : `windows_sys`.`core`.`PCSTR`, `lpkeyname` : `windows_sys`.`core`.`PCSTR`, `ndefault` : Int, `lpfilename` : `windows_sys`.`core`.`PCSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetPrivateProfileIntW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetPrivateProfileIntW`(`lpappname` : `windows_sys`.`core`.`PCWSTR`, `lpkeyname` : `windows_sys`.`core`.`PCWSTR`, `ndefault` : Int, `lpfilename` : `windows_sys`.`core`.`PCWSTR`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetPrivateProfileSectionA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetPrivateProfileSectionA`(`lpappname` : `windows_sys`.`core`.`PCSTR`, `lpreturnedstring` : `windows_sys`.`core`.`PSTR`, `nsize` : UInt, `lpfilename` : `windows_sys`.`core`.`PCSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetPrivateProfileSectionNamesA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetPrivateProfileSectionNamesA`(`lpszreturnbuffer` : `windows_sys`.`core`.`PSTR`, `nsize` : UInt, `lpfilename` : `windows_sys`.`core`.`PCSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetPrivateProfileSectionNamesW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetPrivateProfileSectionNamesW`(`lpszreturnbuffer` : `windows_sys`.`core`.`PWSTR`, `nsize` : UInt, `lpfilename` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetPrivateProfileSectionW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetPrivateProfileSectionW`(`lpappname` : `windows_sys`.`core`.`PCWSTR`, `lpreturnedstring` : `windows_sys`.`core`.`PWSTR`, `nsize` : UInt, `lpfilename` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetPrivateProfileStringA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetPrivateProfileStringA`(`lpappname` : `windows_sys`.`core`.`PCSTR`, `lpkeyname` : `windows_sys`.`core`.`PCSTR`, `lpdefault` : `windows_sys`.`core`.`PCSTR`, `lpreturnedstring` : `windows_sys`.`core`.`PSTR`, `nsize` : UInt, `lpfilename` : `windows_sys`.`core`.`PCSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetPrivateProfileStringW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetPrivateProfileStringW`(`lpappname` : `windows_sys`.`core`.`PCWSTR`, `lpkeyname` : `windows_sys`.`core`.`PCWSTR`, `lpdefault` : `windows_sys`.`core`.`PCWSTR`, `lpreturnedstring` : `windows_sys`.`core`.`PWSTR`, `nsize` : UInt, `lpfilename` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetPrivateProfileStructA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetPrivateProfileStructA`(`lpszsection` : `windows_sys`.`core`.`PCSTR`, `lpszkey` : `windows_sys`.`core`.`PCSTR`, `lpstruct` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `usizestruct` : UInt, `szfile` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetPrivateProfileStructW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetPrivateProfileStructW`(`lpszsection` : `windows_sys`.`core`.`PCWSTR`, `lpszkey` : `windows_sys`.`core`.`PCWSTR`, `lpstruct` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `usizestruct` : UInt, `szfile` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetProfileIntA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetProfileIntA`(`lpappname` : `windows_sys`.`core`.`PCSTR`, `lpkeyname` : `windows_sys`.`core`.`PCSTR`, `ndefault` : Int) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetProfileIntW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetProfileIntW`(`lpappname` : `windows_sys`.`core`.`PCWSTR`, `lpkeyname` : `windows_sys`.`core`.`PCWSTR`, `ndefault` : Int) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetProfileSectionA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetProfileSectionA`(`lpappname` : `windows_sys`.`core`.`PCSTR`, `lpreturnedstring` : `windows_sys`.`core`.`PSTR`, `nsize` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetProfileSectionW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetProfileSectionW`(`lpappname` : `windows_sys`.`core`.`PCWSTR`, `lpreturnedstring` : `windows_sys`.`core`.`PWSTR`, `nsize` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetProfileStringA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetProfileStringA`(`lpappname` : `windows_sys`.`core`.`PCSTR`, `lpkeyname` : `windows_sys`.`core`.`PCSTR`, `lpdefault` : `windows_sys`.`core`.`PCSTR`, `lpreturnedstring` : `windows_sys`.`core`.`PSTR`, `nsize` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetProfileStringW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetProfileStringW`(`lpappname` : `windows_sys`.`core`.`PCWSTR`, `lpkeyname` : `windows_sys`.`core`.`PCWSTR`, `lpdefault` : `windows_sys`.`core`.`PCWSTR`, `lpreturnedstring` : `windows_sys`.`core`.`PWSTR`, `nsize` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetSystemRegistryQuota; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetSystemRegistryQuota`(`pdwquotaallowed` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pdwquotaused` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetThreadEnabledXStateFeatures; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "arm64ec", target_arch = "x86", target_arch = "x86_64"))]
public external fun `GetThreadEnabledXStateFeatures`() : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=GetUserNameA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetUserNameA`(`lpbuffer` : `windows_sys`.`core`.`PSTR`, `pcbbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=GetUserNameW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetUserNameW`(`lpbuffer` : `windows_sys`.`core`.`PWSTR`, `pcbbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advpack.dll, ABI=system, export=GetVersionFromFileA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetVersionFromFileA`(`lpszfilename` : `windows_sys`.`core`.`PCSTR`, `pdwmsver` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pdwlsver` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `bversion` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advpack.dll, ABI=system, export=GetVersionFromFileExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetVersionFromFileExA`(`lpszfilename` : `windows_sys`.`core`.`PCSTR`, `pdwmsver` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pdwlsver` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `bversion` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advpack.dll, ABI=system, export=GetVersionFromFileExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetVersionFromFileExW`(`lpszfilename` : `windows_sys`.`core`.`PCWSTR`, `pdwmsver` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pdwlsver` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `bversion` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advpack.dll, ABI=system, export=GetVersionFromFileW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetVersionFromFileW`(`lpszfilename` : `windows_sys`.`core`.`PCWSTR`, `pdwmsver` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pdwlsver` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `bversion` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dciman32.dll, ABI=system, export=GetWindowRegionData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GetWindowRegionData`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `size` : UInt, `prd` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Graphics`.`Gdi`.`RGNDATA`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GlobalCompact; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GlobalCompact`(`dwminfree` : UInt) : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GlobalFix; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GlobalFix`(`hmem` : `super`.`super`.`Foundation`.`HGLOBAL`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GlobalUnWire; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GlobalUnWire`(`hmem` : `super`.`super`.`Foundation`.`HGLOBAL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GlobalUnfix; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GlobalUnfix`(`hmem` : `super`.`super`.`Foundation`.`HGLOBAL`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GlobalWire; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GlobalWire`(`hmem` : `super`.`super`.`Foundation`.`HGLOBAL`) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=IMPGetIMEA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IMPGetIMEA`(`param0` : `super`.`super`.`Foundation`.`HWND`, `param1` : /* Rust *mut */ kotlinx.cinterop.CPointer<`IMEPROA`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=IMPGetIMEW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IMPGetIMEW`(`param0` : `super`.`super`.`Foundation`.`HWND`, `param1` : /* Rust *mut */ kotlinx.cinterop.CPointer<`IMEPROW`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=IMPQueryIMEA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IMPQueryIMEA`(`param0` : /* Rust *mut */ kotlinx.cinterop.CPointer<`IMEPROA`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=IMPQueryIMEW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IMPQueryIMEW`(`param0` : /* Rust *mut */ kotlinx.cinterop.CPointer<`IMEPROW`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=IMPSetIMEA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IMPSetIMEA`(`param0` : `super`.`super`.`Foundation`.`HWND`, `param1` : /* Rust *mut */ kotlinx.cinterop.CPointer<`IMEPROA`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=IMPSetIMEW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IMPSetIMEW`(`param0` : `super`.`super`.`Foundation`.`HWND`, `param1` : /* Rust *mut */ kotlinx.cinterop.CPointer<`IMEPROW`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-apiquery-l2-1-0.dll, ABI=system, export=IsApiSetImplemented; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsApiSetImplemented`(`contract` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=IsBadHugeReadPtr; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsBadHugeReadPtr`(`lp` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ucb` : ULong) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=IsBadHugeWritePtr; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsBadHugeWritePtr`(`lp` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ucb` : ULong) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advpack.dll, ABI=system, export=IsNTAdmin; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsNTAdmin`(`dwreserved` : UInt, `lpdwreserved` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=IsNativeVhdBoot; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsNativeVhdBoot`(`nativevhdboot` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=IsTokenUntrusted; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsTokenUntrusted`(`tokenhandle` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advpack.dll, ABI=system, export=LaunchINFSectionExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LaunchINFSectionExW`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `hinstance` : `super`.`super`.`Foundation`.`HINSTANCE`, `pszparms` : `windows_sys`.`core`.`PCWSTR`, `nshow` : Int) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advpack.dll, ABI=system, export=LaunchINFSectionW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LaunchINFSectionW`(`hwndowner` : `super`.`super`.`Foundation`.`HWND`, `hinstance` : `super`.`super`.`Foundation`.`HINSTANCE`, `pszparams` : `windows_sys`.`core`.`PWSTR`, `nshow` : Int) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=LocalCompact; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LocalCompact`(`uminfree` : UInt) : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=LocalShrink; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LocalShrink`(`hmem` : `super`.`super`.`Foundation`.`HLOCAL`, `cbnewsize` : UInt) : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=MulDiv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MulDiv`(`nnumber` : Int, `nnumerator` : Int, `ndenominator` : Int) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advpack.dll, ABI=system, export=NeedReboot; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NeedReboot`(`dwrebootcheck` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advpack.dll, ABI=system, export=NeedRebootInit; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NeedRebootInit`() : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advpack.dll, ABI=system, export=OpenINFEngineA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OpenINFEngineA`(`pszinffilename` : `windows_sys`.`core`.`PCSTR`, `pszinstallsection` : `windows_sys`.`core`.`PCSTR`, `dwflags` : UInt, `phinf` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `pvreserved` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advpack.dll, ABI=system, export=OpenINFEngineW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OpenINFEngineW`(`pszinffilename` : `windows_sys`.`core`.`PCWSTR`, `pszinstallsection` : `windows_sys`.`core`.`PCWSTR`, `dwflags` : UInt, `phinf` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `pvreserved` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=OpenMutexA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OpenMutexA`(`dwdesiredaccess` : UInt, `binherithandle` : `windows_sys`.`core`.`BOOL`, `lpname` : `windows_sys`.`core`.`PCSTR`) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=OpenSemaphoreA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OpenSemaphoreA`(`dwdesiredaccess` : UInt, `binherithandle` : `windows_sys`.`core`.`BOOL`, `lpname` : `windows_sys`.`core`.`PCSTR`) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-realtime-l1-1-2.dll, ABI=system, export=QueryAuxiliaryCounterFrequency; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `QueryAuxiliaryCounterFrequency`(`lpauxiliarycounterfrequency` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=QueryIdleProcessorCycleTime; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `QueryIdleProcessorCycleTime`(`bufferlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `processoridlecycletime` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=QueryIdleProcessorCycleTimeEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `QueryIdleProcessorCycleTimeEx`(`group` : UShort, `bufferlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `processoridlecycletime` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-realtime-l1-1-1.dll, ABI=system, export=QueryInterruptTime; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `QueryInterruptTime`(`lpinterrupttime` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-realtime-l1-1-1.dll, ABI=system, export=QueryInterruptTimePrecise; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `QueryInterruptTimePrecise`(`lpinterrupttimeprecise` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=QueryProcessCycleTime; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `QueryProcessCycleTime`(`processhandle` : `super`.`super`.`Foundation`.`HANDLE`, `cycletime` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=QueryThreadCycleTime; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `QueryThreadCycleTime`(`threadhandle` : `super`.`super`.`Foundation`.`HANDLE`, `cycletime` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=QueryUnbiasedInterruptTime; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `QueryUnbiasedInterruptTime`(`unbiasedtime` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-realtime-l1-1-1.dll, ABI=system, export=QueryUnbiasedInterruptTimePrecise; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `QueryUnbiasedInterruptTimePrecise`(`lpunbiasedinterrupttimeprecise` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-backgroundtask-l1-1-0.dll, ABI=system, export=RaiseCustomSystemEventTrigger; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RaiseCustomSystemEventTrigger`(`customsystemeventtriggerconfig` : /* Rust *const */ kotlinx.cinterop.CPointer<`CUSTOM_SYSTEM_EVENT_TRIGGER_CONFIG`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advpack.dll, ABI=system, export=RebootCheckOnInstallA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RebootCheckOnInstallA`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `pszinf` : `windows_sys`.`core`.`PCSTR`, `pszsec` : `windows_sys`.`core`.`PCSTR`, `dwreserved` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advpack.dll, ABI=system, export=RebootCheckOnInstallW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RebootCheckOnInstallW`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `pszinf` : `windows_sys`.`core`.`PCWSTR`, `pszsec` : `windows_sys`.`core`.`PCWSTR`, `dwreserved` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-featurestaging-l1-1-0.dll, ABI=system, export=RecordFeatureError; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RecordFeatureError`(`featureid` : UInt, `error` : /* Rust *const */ kotlinx.cinterop.CPointer<`FEATURE_ERROR`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-featurestaging-l1-1-0.dll, ABI=system, export=RecordFeatureUsage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RecordFeatureUsage`(`featureid` : UInt, `kind` : UInt, `addend` : UInt, `originname` : `windows_sys`.`core`.`PCSTR`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advpack.dll, ABI=system, export=RegInstallA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegInstallA`(`hmod` : `super`.`super`.`Foundation`.`HMODULE`, `pszsection` : `windows_sys`.`core`.`PCSTR`, `psttable` : /* Rust *const */ kotlinx.cinterop.CPointer<`STRTABLEA`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advpack.dll, ABI=system, export=RegInstallW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegInstallW`(`hmod` : `super`.`super`.`Foundation`.`HMODULE`, `pszsection` : `windows_sys`.`core`.`PCWSTR`, `psttable` : /* Rust *const */ kotlinx.cinterop.CPointer<`STRTABLEW`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advpack.dll, ABI=system, export=RegRestoreAllA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Registry")]
public external fun `RegRestoreAllA`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `psztitlestring` : `windows_sys`.`core`.`PCSTR`, `hkbckupkey` : `super`.`Registry`.`HKEY`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advpack.dll, ABI=system, export=RegRestoreAllW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Registry")]
public external fun `RegRestoreAllW`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `psztitlestring` : `windows_sys`.`core`.`PCWSTR`, `hkbckupkey` : `super`.`Registry`.`HKEY`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advpack.dll, ABI=system, export=RegSaveRestoreA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Registry")]
public external fun `RegSaveRestoreA`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `psztitlestring` : `windows_sys`.`core`.`PCSTR`, `hkbckupkey` : `super`.`Registry`.`HKEY`, `pcszrootkey` : `windows_sys`.`core`.`PCSTR`, `pcszsubkey` : `windows_sys`.`core`.`PCSTR`, `pcszvaluename` : `windows_sys`.`core`.`PCSTR`, `dwflags` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advpack.dll, ABI=system, export=RegSaveRestoreOnINFA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Registry")]
public external fun `RegSaveRestoreOnINFA`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `psztitle` : `windows_sys`.`core`.`PCSTR`, `pszinf` : `windows_sys`.`core`.`PCSTR`, `pszsection` : `windows_sys`.`core`.`PCSTR`, `hhklmbackkey` : `super`.`Registry`.`HKEY`, `hhkcubackkey` : `super`.`Registry`.`HKEY`, `dwflags` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advpack.dll, ABI=system, export=RegSaveRestoreOnINFW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Registry")]
public external fun `RegSaveRestoreOnINFW`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `psztitle` : `windows_sys`.`core`.`PCWSTR`, `pszinf` : `windows_sys`.`core`.`PCWSTR`, `pszsection` : `windows_sys`.`core`.`PCWSTR`, `hhklmbackkey` : `super`.`Registry`.`HKEY`, `hhkcubackkey` : `super`.`Registry`.`HKEY`, `dwflags` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advpack.dll, ABI=system, export=RegSaveRestoreW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Registry")]
public external fun `RegSaveRestoreW`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `psztitlestring` : `windows_sys`.`core`.`PCWSTR`, `hkbckupkey` : `super`.`Registry`.`HKEY`, `pcszrootkey` : `windows_sys`.`core`.`PCWSTR`, `pcszsubkey` : `windows_sys`.`core`.`PCWSTR`, `pcszvaluename` : `windows_sys`.`core`.`PCWSTR`, `dwflags` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=ReplacePartitionUnit; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ReplacePartitionUnit`(`targetpartition` : `windows_sys`.`core`.`PCWSTR`, `sparepartition` : `windows_sys`.`core`.`PCWSTR`, `flags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=RequestDeviceWakeup; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RequestDeviceWakeup`(`hdevice` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=RtlAnsiStringToUnicodeString; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
public external fun `RtlAnsiStringToUnicodeString`(`destinationstring` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`UNICODE_STRING`>?, `sourcestring` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Kernel`.`STRING`>?, `allocatedestinationstring` : Boolean) : `super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=RtlCharToInteger; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtlCharToInteger`(`string` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `base` : UInt, `value` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=RtlFreeAnsiString; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
public external fun `RtlFreeAnsiString`(`ansistring` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Kernel`.`STRING`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=RtlFreeOemString; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
public external fun `RtlFreeOemString`(`oemstring` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Kernel`.`STRING`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=RtlFreeUnicodeString; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtlFreeUnicodeString`(`unicodestring` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`UNICODE_STRING`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=RtlGetReturnAddressHijackTarget; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtlGetReturnAddressHijackTarget`() : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=RtlInitAnsiString; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
public external fun `RtlInitAnsiString`(`destinationstring` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Kernel`.`STRING`>?, `sourcestring` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=RtlInitAnsiStringEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
public external fun `RtlInitAnsiStringEx`(`destinationstring` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Kernel`.`STRING`>?, `sourcestring` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?) : `super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=RtlInitString; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
public external fun `RtlInitString`(`destinationstring` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Kernel`.`STRING`>?, `sourcestring` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=RtlInitStringEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
public external fun `RtlInitStringEx`(`destinationstring` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Kernel`.`STRING`>?, `sourcestring` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?) : `super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=RtlInitUnicodeString; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtlInitUnicodeString`(`destinationstring` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`UNICODE_STRING`>?, `sourcestring` : `windows_sys`.`core`.`PCWSTR`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=RtlIsNameLegalDOS8Dot3; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
public external fun `RtlIsNameLegalDOS8Dot3`(`name` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`UNICODE_STRING`>?, `oemname` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Kernel`.`STRING`>?, `namecontainsspaces` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.BooleanVar>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=RtlLocalTimeToSystemTime; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtlLocalTimeToSystemTime`(`localtime` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, `systemtime` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : `super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=RtlRaiseCustomSystemEventTrigger; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtlRaiseCustomSystemEventTrigger`(`triggerconfig` : /* Rust *const */ kotlinx.cinterop.CPointer<`CUSTOM_SYSTEM_EVENT_TRIGGER_CONFIG`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=RtlTimeToSecondsSince1970; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtlTimeToSecondsSince1970`(`time` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, `elapsedseconds` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=RtlUnicodeStringToAnsiString; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
public external fun `RtlUnicodeStringToAnsiString`(`destinationstring` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Kernel`.`STRING`>?, `sourcestring` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`UNICODE_STRING`>?, `allocatedestinationstring` : Boolean) : `super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=RtlUnicodeStringToOemString; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
public external fun `RtlUnicodeStringToOemString`(`destinationstring` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Kernel`.`STRING`>?, `sourcestring` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`UNICODE_STRING`>?, `allocatedestinationstring` : Boolean) : `super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=RtlUnicodeToMultiByteSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtlUnicodeToMultiByteSize`(`bytesinmultibytestring` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `unicodestring` : `windows_sys`.`core`.`PCWSTR`, `bytesinunicodestring` : UInt) : `super`.`super`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=RtlUniform; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RtlUniform`(`seed` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advpack.dll, ABI=system, export=RunSetupCommandA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RunSetupCommandA`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `szcmdname` : `windows_sys`.`core`.`PCSTR`, `szinfsection` : `windows_sys`.`core`.`PCSTR`, `szdir` : `windows_sys`.`core`.`PCSTR`, `lpsztitle` : `windows_sys`.`core`.`PCSTR`, `phexe` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?, `dwflags` : UInt, `pvreserved` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advpack.dll, ABI=system, export=RunSetupCommandW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RunSetupCommandW`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `szcmdname` : `windows_sys`.`core`.`PCWSTR`, `szinfsection` : `windows_sys`.`core`.`PCWSTR`, `szdir` : `windows_sys`.`core`.`PCWSTR`, `lpsztitle` : `windows_sys`.`core`.`PCWSTR`, `phexe` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?, `dwflags` : UInt, `pvreserved` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SendIMEMessageExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SendIMEMessageExA`(`param0` : `super`.`super`.`Foundation`.`HWND`, `param1` : `super`.`super`.`Foundation`.`LPARAM`) : `super`.`super`.`Foundation`.`LRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=SendIMEMessageExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SendIMEMessageExW`(`param0` : `super`.`super`.`Foundation`.`HWND`, `param1` : `super`.`super`.`Foundation`.`LPARAM`) : `super`.`super`.`Foundation`.`LRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=SetEnvironmentStringsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetEnvironmentStringsA`(`newenvironment` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=SetFirmwareEnvironmentVariableA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetFirmwareEnvironmentVariableA`(`lpname` : `windows_sys`.`core`.`PCSTR`, `lpguid` : `windows_sys`.`core`.`PCSTR`, `pvalue` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `nsize` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=SetFirmwareEnvironmentVariableExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetFirmwareEnvironmentVariableExA`(`lpname` : `windows_sys`.`core`.`PCSTR`, `lpguid` : `windows_sys`.`core`.`PCSTR`, `pvalue` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `nsize` : UInt, `dwattributes` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=SetFirmwareEnvironmentVariableExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetFirmwareEnvironmentVariableExW`(`lpname` : `windows_sys`.`core`.`PCWSTR`, `lpguid` : `windows_sys`.`core`.`PCWSTR`, `pvalue` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `nsize` : UInt, `dwattributes` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=SetFirmwareEnvironmentVariableW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetFirmwareEnvironmentVariableW`(`lpname` : `windows_sys`.`core`.`PCWSTR`, `lpguid` : `windows_sys`.`core`.`PCWSTR`, `pvalue` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `nsize` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=SetHandleCount; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetHandleCount`(`unumber` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=SetMessageWaitingIndicator; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetMessageWaitingIndicator`(`hmsgindicator` : `super`.`super`.`Foundation`.`HANDLE`, `ulmsgcount` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advpack.dll, ABI=system, export=SetPerUserSecValuesA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetPerUserSecValuesA`(`pperuser` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PERUSERSECTIONA`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advpack.dll, ABI=system, export=SetPerUserSecValuesW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetPerUserSecValuesW`(`pperuser` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PERUSERSECTIONW`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-featurestaging-l1-1-0.dll, ABI=system, export=SubscribeFeatureStateChangeNotification; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SubscribeFeatureStateChangeNotification`(`subscription` : /* Rust *mut */ kotlinx.cinterop.CPointer<`FEATURE_STATE_CHANGE_SUBSCRIPTION`>?, `callback` : `PFEATURE_STATE_CHANGE_CALLBACK`, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advpack.dll, ABI=system, export=TranslateInfStringA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TranslateInfStringA`(`pszinffilename` : `windows_sys`.`core`.`PCSTR`, `pszinstallsection` : `windows_sys`.`core`.`PCSTR`, `psztranslatesection` : `windows_sys`.`core`.`PCSTR`, `psztranslatekey` : `windows_sys`.`core`.`PCSTR`, `pszbuffer` : `windows_sys`.`core`.`PSTR`, `cchbuffer` : UInt, `pdwrequiredsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pvreserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advpack.dll, ABI=system, export=TranslateInfStringExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TranslateInfStringExA`(`hinf` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pszinffilename` : `windows_sys`.`core`.`PCSTR`, `psztranslatesection` : `windows_sys`.`core`.`PCSTR`, `psztranslatekey` : `windows_sys`.`core`.`PCSTR`, `pszbuffer` : `windows_sys`.`core`.`PSTR`, `dwbuffersize` : UInt, `pdwrequiredsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pvreserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advpack.dll, ABI=system, export=TranslateInfStringExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TranslateInfStringExW`(`hinf` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pszinffilename` : `windows_sys`.`core`.`PCWSTR`, `psztranslatesection` : `windows_sys`.`core`.`PCWSTR`, `psztranslatekey` : `windows_sys`.`core`.`PCWSTR`, `pszbuffer` : `windows_sys`.`core`.`PWSTR`, `dwbuffersize` : UInt, `pdwrequiredsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pvreserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advpack.dll, ABI=system, export=TranslateInfStringW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TranslateInfStringW`(`pszinffilename` : `windows_sys`.`core`.`PCWSTR`, `pszinstallsection` : `windows_sys`.`core`.`PCWSTR`, `psztranslatesection` : `windows_sys`.`core`.`PCWSTR`, `psztranslatekey` : `windows_sys`.`core`.`PCWSTR`, `pszbuffer` : `windows_sys`.`core`.`PWSTR`, `cchbuffer` : UInt, `pdwrequiredsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pvreserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-featurestaging-l1-1-0.dll, ABI=system, export=UnsubscribeFeatureStateChangeNotification; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UnsubscribeFeatureStateChangeNotification`(`subscription` : `FEATURE_STATE_CHANGE_SUBSCRIPTION`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advpack.dll, ABI=system, export=UserInstStubWrapperA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UserInstStubWrapperA`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `hinstance` : `super`.`super`.`Foundation`.`HINSTANCE`, `pszparms` : `windows_sys`.`core`.`PCSTR`, `nshow` : Int) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advpack.dll, ABI=system, export=UserInstStubWrapperW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UserInstStubWrapperW`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `hinstance` : `super`.`super`.`Foundation`.`HINSTANCE`, `pszparms` : `windows_sys`.`core`.`PCWSTR`, `nshow` : Int) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advpack.dll, ABI=system, export=UserUnInstStubWrapperA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UserUnInstStubWrapperA`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `hinstance` : `super`.`super`.`Foundation`.`HINSTANCE`, `pszparms` : `windows_sys`.`core`.`PCSTR`, `nshow` : Int) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advpack.dll, ABI=system, export=UserUnInstStubWrapperW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UserUnInstStubWrapperW`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `hinstance` : `super`.`super`.`Foundation`.`HINSTANCE`, `pszparms` : `windows_sys`.`core`.`PCWSTR`, `nshow` : Int) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=WINNLSEnableIME; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WINNLSEnableIME`(`param0` : `super`.`super`.`Foundation`.`HWND`, `param1` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=WINNLSGetEnableStatus; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WINNLSGetEnableStatus`(`param0` : `super`.`super`.`Foundation`.`HWND`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=user32.dll, ABI=system, export=WINNLSGetIMEHotkey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WINNLSGetIMEHotkey`(`param0` : `super`.`super`.`Foundation`.`HWND`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dciman32.dll, ABI=system, export=WinWatchClose; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinWatchClose`(`hww` : `HWINWATCH`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dciman32.dll, ABI=system, export=WinWatchDidStatusChange; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinWatchDidStatusChange`(`hww` : `HWINWATCH`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dciman32.dll, ABI=system, export=WinWatchGetClipList; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `WinWatchGetClipList`(`hww` : `HWINWATCH`, `prc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `size` : UInt, `prd` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Graphics`.`Gdi`.`RGNDATA`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dciman32.dll, ABI=system, export=WinWatchNotify; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinWatchNotify`(`hww` : `HWINWATCH`, `notifycallback` : `WINWATCHNOTIFYPROC`, `notifyparam` : `super`.`super`.`Foundation`.`LPARAM`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=dciman32.dll, ABI=system, export=WinWatchOpen; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinWatchOpen`(`hwnd` : `super`.`super`.`Foundation`.`HWND`) : `HWINWATCH`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldp.dll, ABI=system, export=WldpCanExecuteBuffer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WldpCanExecuteBuffer`(`host` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `options` : `WLDP_EXECUTION_EVALUATION_OPTIONS`, `buffer` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `buffersize` : UInt, `auditinfo` : `windows_sys`.`core`.`PCWSTR`, `result` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WLDP_EXECUTION_POLICY`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldp.dll, ABI=system, export=WldpCanExecuteFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WldpCanExecuteFile`(`host` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `options` : `WLDP_EXECUTION_EVALUATION_OPTIONS`, `filehandle` : `super`.`super`.`Foundation`.`HANDLE`, `auditinfo` : `windows_sys`.`core`.`PCWSTR`, `result` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WLDP_EXECUTION_POLICY`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldp.dll, ABI=system, export=WldpCanExecuteStream; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `WldpCanExecuteStream`(`host` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `options` : `WLDP_EXECUTION_EVALUATION_OPTIONS`, `stream` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `auditinfo` : `windows_sys`.`core`.`PCWSTR`, `result` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WLDP_EXECUTION_POLICY`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldp.dll, ABI=system, export=WldpGetLockdownPolicy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WldpGetLockdownPolicy`(`hostinformation` : /* Rust *const */ kotlinx.cinterop.CPointer<`WLDP_HOST_INFORMATION`>?, `lockdownstate` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lockdownflags` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldp.dll, ABI=system, export=WldpIsClassInApprovedList; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WldpIsClassInApprovedList`(`classid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `hostinformation` : /* Rust *const */ kotlinx.cinterop.CPointer<`WLDP_HOST_INFORMATION`>?, `isapproved` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?, `optionalflags` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldp.dll, ABI=system, export=WldpIsDynamicCodePolicyEnabled; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WldpIsDynamicCodePolicyEnabled`(`isenabled` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldp.dll, ABI=system, export=WldpQueryDeviceSecurityInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WldpQueryDeviceSecurityInformation`(`information` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WLDP_DEVICE_SECURITY_INFORMATION`>?, `informationlength` : UInt, `returnlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldp.dll, ABI=system, export=WldpQueryDynamicCodeTrust; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WldpQueryDynamicCodeTrust`(`filehandle` : `super`.`super`.`Foundation`.`HANDLE`, `baseimage` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `imagesize` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wldp.dll, ABI=system, export=WldpSetDynamicCodeTrust; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WldpSetDynamicCodeTrust`(`filehandle` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=WritePrivateProfileSectionA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WritePrivateProfileSectionA`(`lpappname` : `windows_sys`.`core`.`PCSTR`, `lpstring` : `windows_sys`.`core`.`PCSTR`, `lpfilename` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=WritePrivateProfileSectionW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WritePrivateProfileSectionW`(`lpappname` : `windows_sys`.`core`.`PCWSTR`, `lpstring` : `windows_sys`.`core`.`PCWSTR`, `lpfilename` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=WritePrivateProfileStringA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WritePrivateProfileStringA`(`lpappname` : `windows_sys`.`core`.`PCSTR`, `lpkeyname` : `windows_sys`.`core`.`PCSTR`, `lpstring` : `windows_sys`.`core`.`PCSTR`, `lpfilename` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=WritePrivateProfileStringW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WritePrivateProfileStringW`(`lpappname` : `windows_sys`.`core`.`PCWSTR`, `lpkeyname` : `windows_sys`.`core`.`PCWSTR`, `lpstring` : `windows_sys`.`core`.`PCWSTR`, `lpfilename` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=WritePrivateProfileStructA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WritePrivateProfileStructA`(`lpszsection` : `windows_sys`.`core`.`PCSTR`, `lpszkey` : `windows_sys`.`core`.`PCSTR`, `lpstruct` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `usizestruct` : UInt, `szfile` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=WritePrivateProfileStructW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WritePrivateProfileStructW`(`lpszsection` : `windows_sys`.`core`.`PCWSTR`, `lpszkey` : `windows_sys`.`core`.`PCWSTR`, `lpstruct` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `usizestruct` : UInt, `szfile` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=WriteProfileSectionA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WriteProfileSectionA`(`lpappname` : `windows_sys`.`core`.`PCSTR`, `lpstring` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=WriteProfileSectionW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WriteProfileSectionW`(`lpappname` : `windows_sys`.`core`.`PCWSTR`, `lpstring` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=WriteProfileStringA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WriteProfileStringA`(`lpappname` : `windows_sys`.`core`.`PCSTR`, `lpkeyname` : `windows_sys`.`core`.`PCSTR`, `lpstring` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=WriteProfileStringW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WriteProfileStringW`(`lpappname` : `windows_sys`.`core`.`PCWSTR`, `lpkeyname` : `windows_sys`.`core`.`PCWSTR`, `lpstring` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=_hread; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `_hread`(`hfile` : Int, `lpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lbytes` : Int) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=_hwrite; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `_hwrite`(`hfile` : Int, `lpbuffer` : `windows_sys`.`core`.`PCSTR`, `lbytes` : Int) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=_lclose; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `_lclose`(`hfile` : Int) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=_lcreat; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `_lcreat`(`lppathname` : `windows_sys`.`core`.`PCSTR`, `iattribute` : Int) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=_llseek; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `_llseek`(`hfile` : Int, `loffset` : Int, `iorigin` : Int) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=_lopen; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `_lopen`(`lppathname` : `windows_sys`.`core`.`PCSTR`, `ireadwrite` : Int) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=_lread; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `_lread`(`hfile` : Int, `lpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ubytes` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=_lwrite; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `_lwrite`(`hfile` : Int, `lpbuffer` : `windows_sys`.`core`.`PCSTR`, `ubytes` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=uaw_lstrcmpW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
public external fun `uaw_lstrcmpW`(`string1` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `string2` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=uaw_lstrcmpiW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
public external fun `uaw_lstrcmpiW`(`string1` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `string2` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=uaw_lstrlenW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
public external fun `uaw_lstrlenW`(`string` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=uaw_wcschr; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
public external fun `uaw_wcschr`(`string` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `character` : UShort) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=uaw_wcscpy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
public external fun `uaw_wcscpy`(`destination` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `source` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=uaw_wcsicmp; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
public external fun `uaw_wcsicmp`(`string1` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `string2` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=uaw_wcslen; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
public external fun `uaw_wcslen`(`string` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=uaw_wcsrchr; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
public external fun `uaw_wcsrchr`(`string` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `character` : UShort) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ACTCTX_SECTION_KEYED_DATA_2600` (
    public var `cbSize`: UInt,
    public var `ulDataFormatVersion`: UInt,
    public var `lpData`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `ulLength`: UInt,
    public var `lpSectionGlobalData`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `ulSectionGlobalDataLength`: UInt,
    public var `lpSectionBase`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `ulSectionTotalLength`: UInt,
    public var `hActCtx`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `ulAssemblyRosterIndex`: UInt,
)
// UNSUPPORTED Rust 276:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ACTCTX_SECTION_KEYED_DATA_2600 {
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
public class `ACTCTX_SECTION_KEYED_DATA_ASSEMBLY_METADATA` (
    public var `lpInformation`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `lpSectionBase`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `ulSectionLength`: UInt,
    public var `lpSectionGlobalDataBase`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `ulSectionGlobalDataLength`: UInt,
)
// UNSUPPORTED Rust 290:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ACTCTX_SECTION_KEYED_DATA_ASSEMBLY_METADATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ACTIVATION_CONTEXT_BASIC_INFORMATION` (
    public var `hActCtx`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `dwFlags`: UInt,
)
// UNSUPPORTED Rust 301:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `APPLICATION_RECOVERY_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> UInt>>>;
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 260 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CABINFOA` (
    public var `pszCab`: `windows_sys`.`core`.`PSTR`,
    public var `pszInf`: `windows_sys`.`core`.`PSTR`,
    public var `pszSection`: `windows_sys`.`core`.`PSTR`,
    public var `szSrcPath`: ByteArray,
    public var `dwFlags`: UInt,
)
// UNSUPPORTED Rust 391:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CABINFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 260 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CABINFOW` (
    public var `pszCab`: `windows_sys`.`core`.`PWSTR`,
    public var `pszInf`: `windows_sys`.`core`.`PWSTR`,
    public var `pszSection`: `windows_sys`.`core`.`PWSTR`,
    public var `szSrcPath`: UShortArray,
    public var `dwFlags`: UInt,
)
// UNSUPPORTED Rust 405:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CABINFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 410:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CLIENT_ID` (
    public var `UniqueProcess`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `UniqueThread`: `super`.`super`.`Foundation`.`HANDLE`,
)
// UNSUPPORTED Rust 438:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CUSTOM_SYSTEM_EVENT_TRIGGER_CONFIG` (
    public var `Size`: UInt,
    public var `TriggerId`: `windows_sys`.`core`.`PCWSTR`,
)
// UNSUPPORTED Rust 484:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CUSTOM_SYSTEM_EVENT_TRIGGER_CONFIG {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 489:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CameraUIControl: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x16d5a2be_b1c5_47b3_8eae_ccbcf452c7e8);

// UNSUPPORTED Rust 490:1: declaration Struct has no candidate rule; syntax: only named record shapes currently supported
// #[repr(transparent)]
// #[derive(Clone, Copy)]
// pub struct CameraUIControlCaptureMode(pub i32);

// UNSUPPORTED Rust 493:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl CameraUIControlCaptureMode {
//     pub const PhotoOrVideo: Self = Self(0i32);
//     pub const Photo: Self = Self(1i32);
//     pub const Video: Self = Self(2i32);
// }

// UNSUPPORTED Rust 498:1: declaration Struct has no candidate rule; syntax: only named record shapes currently supported
// #[repr(transparent)]
// #[derive(Clone, Copy)]
// pub struct CameraUIControlLinearSelectionMode(pub i32);

// UNSUPPORTED Rust 501:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl CameraUIControlLinearSelectionMode {
//     pub const Single: Self = Self(0i32);
//     pub const Multiple: Self = Self(1i32);
// }

// UNSUPPORTED Rust 505:1: declaration Struct has no candidate rule; syntax: only named record shapes currently supported
// #[repr(transparent)]
// #[derive(Clone, Copy)]
// pub struct CameraUIControlMode(pub i32);

// UNSUPPORTED Rust 508:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl CameraUIControlMode {
//     pub const Browse: Self = Self(0i32);
//     pub const Linear: Self = Self(1i32);
// }

// UNSUPPORTED Rust 512:1: declaration Struct has no candidate rule; syntax: only named record shapes currently supported
// #[repr(transparent)]
// #[derive(Clone, Copy)]
// pub struct CameraUIControlPhotoFormat(pub i32);

// UNSUPPORTED Rust 515:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl CameraUIControlPhotoFormat {
//     pub const Jpeg: Self = Self(0i32);
//     pub const Png: Self = Self(1i32);
//     pub const JpegXR: Self = Self(2i32);
// }

// UNSUPPORTED Rust 520:1: declaration Struct has no candidate rule; syntax: only named record shapes currently supported
// #[repr(transparent)]
// #[derive(Clone, Copy)]
// pub struct CameraUIControlVideoFormat(pub i32);

// UNSUPPORTED Rust 523:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl CameraUIControlVideoFormat {
//     pub const Mp4: Self = Self(0i32);
//     pub const Wmv: Self = Self(1i32);
// }

// UNSUPPORTED Rust 527:1: declaration Struct has no candidate rule; syntax: only named record shapes currently supported
// #[repr(transparent)]
// #[derive(Clone, Copy)]
// pub struct CameraUIControlViewType(pub i32);

// UNSUPPORTED Rust 530:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl CameraUIControlViewType {
//     pub const SingleItem: Self = Self(0i32);
//     pub const ItemList: Self = Self(1i32);
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DATETIME` (
    public var `year`: UShort,
    public var `month`: UShort,
    public var `day`: UShort,
    public var `hour`: UShort,
    public var `min`: UShort,
    public var `sec`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DCICMD` (
    public var `dwCommand`: UInt,
    public var `dwParam1`: UInt,
    public var `dwParam2`: UInt,
    public var `dwVersion`: UInt,
    public var `dwReserved`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DCICREATEINPUT` (
    public var `cmd`: `DCICMD`,
    public var `dwCompression`: UInt,
    public var `dwMask`: UIntArray,
    public var `dwWidth`: UInt,
    public var `dwHeight`: UInt,
    public var `dwDCICaps`: UInt,
    public var `dwBitCount`: UInt,
    public var `lpSurface`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 565:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DCICREATEINPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DCICREATEOFFSCREENSURFACE`: UInt = 2u;
public const val `DCICREATEOVERLAYSURFACE`: UInt = 3u;
public const val `DCICREATEPRIMARYSURFACE`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DCIENUMINPUT` (
    public var `cmd`: `DCICMD`,
    public var `rSrc`: `super`.`super`.`Foundation`.`RECT`,
    public var `rDst`: `super`.`super`.`Foundation`.`RECT`,
    public var `EnumCallback`: Long,
    public var `lpContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 582:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DCIENUMINPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DCIENUMSURFACE`: UInt = 4u;
public const val `DCIESCAPE`: UInt = 5u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DCIOFFSCREEN` (
    public var `dciInfo`: `DCISURFACEINFO`,
    public var `Draw`: Long,
    public var `SetClipList`: Long,
    public var `SetDestination`: Long,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DCIOVERLAY` (
    public var `dciInfo`: `DCISURFACEINFO`,
    public var `dwChromakeyValue`: UInt,
    public var `dwChromakeyMask`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DCISURFACEINFO` (
    public var `dwSize`: UInt,
    public var `dwDCICaps`: UInt,
    public var `dwCompression`: UInt,
    public var `dwMask`: UIntArray,
    public var `dwWidth`: UInt,
    public var `dwHeight`: UInt,
    public var `lStride`: Int,
    public var `dwBitCount`: UInt,
    public var `dwOffSurface`: ULong,
    public var `wSelSurface`: UShort,
    public var `wReserved`: UShort,
    public var `dwReserved1`: UInt,
    public var `dwReserved2`: UInt,
    public var `dwReserved3`: UInt,
    public var `BeginAccess`: Long,
    public var `EndAccess`: Long,
    public var `DestroySurface`: Long,
)
// UNSUPPORTED Rust 625:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DELAYLOAD_INFO` (
    public var `Size`: UInt,
    public var `DelayloadDescriptor`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IMAGE_DELAYLOAD_DESCRIPTOR`>?,
    public var `ThunkAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IMAGE_THUNK_DATA32`>?,
    public var `TargetDllName`: `windows_sys`.`core`.`PCSTR`,
    public var `TargetApiDescriptor`: `DELAYLOAD_PROC_DESCRIPTOR`,
    public var `TargetModuleBase`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Unused`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `LastError`: UInt,
)
// UNSUPPORTED Rust 701:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// impl Default for DELAYLOAD_INFO {
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
public class `DELAYLOAD_INFO` (
    public var `Size`: UInt,
    public var `DelayloadDescriptor`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IMAGE_DELAYLOAD_DESCRIPTOR`>?,
    public var `ThunkAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<`IMAGE_THUNK_DATA64`>?,
    public var `TargetDllName`: `windows_sys`.`core`.`PCSTR`,
    public var `TargetApiDescriptor`: `DELAYLOAD_PROC_DESCRIPTOR`,
    public var `TargetModuleBase`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Unused`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `LastError`: UInt,
)
// UNSUPPORTED Rust 720:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for DELAYLOAD_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DELAYLOAD_PROC_DESCRIPTOR` (
    public var `ImportDescribedByName`: UInt,
    public var `Description`: `DELAYLOAD_PROC_DESCRIPTOR_0`,
)
// UNSUPPORTED Rust 732:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DELAYLOAD_PROC_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 737:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DELAYLOAD_PROC_DESCRIPTOR_0 {
//     pub Name: windows_sys::core::PCSTR,
//     pub Ordinal: u32,
// }

// UNSUPPORTED Rust 743:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// UNSUPPORTED Rust 768:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const DefaultBrowserSyncSettings: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3ac83423_3112_4aa6_9b5b_1feb23d0c5f9);

public const val `EFSRPC_SECURE_ONLY`: UInt = 8u;
public const val `EFS_DROP_ALTERNATE_STREAMS`: UInt = 16u;
public const val `EFS_USE_RECOVERY_KEYS`: UInt = 1u;
public const val `ENTITY_LIST_ID`: UInt = 0u;
public const val `ENTITY_TYPE_ID`: UInt = 1u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `ENUM_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`DCISURFACEINFO`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
public const val `ER_ENTITY`: `TDIENTITY_ENTITY_TYPE` = 896u;
public const val `ER_ICMP`: UInt = 896u;
public const val `EVENTLOG_FULL_INFO`: UInt = 0u;
// UNSUPPORTED Rust 778:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const EditionUpgradeBroker: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc4270827_4f39_45df_9288_12ff6b85a921);

// UNSUPPORTED Rust 779:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FEATURE_ERROR` (
    public var `hr`: `windows_sys`.`core`.`HRESULT`,
    public var `lineNumber`: UShort,
    public var `file`: `windows_sys`.`core`.`PCSTR`,
    public var `process`: `windows_sys`.`core`.`PCSTR`,
    public var `module`: `windows_sys`.`core`.`PCSTR`,
    public var `callerReturnAddressOffset`: UInt,
    public var `callerModule`: `windows_sys`.`core`.`PCSTR`,
    public var `message`: `windows_sys`.`core`.`PCSTR`,
    public var `originLineNumber`: UShort,
    public var `originFile`: `windows_sys`.`core`.`PCSTR`,
    public var `originModule`: `windows_sys`.`core`.`PCSTR`,
    public var `originCallerReturnAddressOffset`: UInt,
    public var `originCallerModule`: `windows_sys`.`core`.`PCSTR`,
    public var `originName`: `windows_sys`.`core`.`PCSTR`,
)
// UNSUPPORTED Rust 810:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FEATURE_ERROR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `FEATURE_STATE_CHANGE_SUBSCRIPTION` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
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
// UNSUPPORTED Rust 860:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const GET_SYSTEM_WOW64_DIRECTORY_NAME_A_A: windows_sys::core::PCSTR = windows_sys::core::s!("GetSystemWow64DirectoryA");

// UNSUPPORTED Rust 861:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const GET_SYSTEM_WOW64_DIRECTORY_NAME_A_T: windows_sys::core::PCWSTR = windows_sys::core::w!("GetSystemWow64DirectoryA");

// UNSUPPORTED Rust 862:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const GET_SYSTEM_WOW64_DIRECTORY_NAME_A_W: windows_sys::core::PCWSTR = windows_sys::core::w!("GetSystemWow64DirectoryA");

// UNSUPPORTED Rust 863:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const GET_SYSTEM_WOW64_DIRECTORY_NAME_T_A: windows_sys::core::PCWSTR = windows_sys::core::w!("GetSystemWow64DirectoryW");

// UNSUPPORTED Rust 864:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const GET_SYSTEM_WOW64_DIRECTORY_NAME_T_T: windows_sys::core::PCWSTR = windows_sys::core::w!("GetSystemWow64DirectoryW");

// UNSUPPORTED Rust 865:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const GET_SYSTEM_WOW64_DIRECTORY_NAME_T_W: windows_sys::core::PCWSTR = windows_sys::core::w!("GetSystemWow64DirectoryW");

// UNSUPPORTED Rust 866:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const GET_SYSTEM_WOW64_DIRECTORY_NAME_W_A: windows_sys::core::PCSTR = windows_sys::core::s!("GetSystemWow64DirectoryW");

// UNSUPPORTED Rust 867:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const GET_SYSTEM_WOW64_DIRECTORY_NAME_W_T: windows_sys::core::PCWSTR = windows_sys::core::w!("GetSystemWow64DirectoryW");

// UNSUPPORTED Rust 868:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
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
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HWINWATCH` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
public const val `HW_PROFILE_GUIDLEN`: UInt = 39u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 39 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 80 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HW_PROFILE_INFOA` (
    public var `dwDockInfo`: UInt,
    public var `szHwProfileGuid`: ByteArray,
    public var `szHwProfileName`: ByteArray,
)
// UNSUPPORTED Rust 894:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HW_PROFILE_INFOA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 39 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 80 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HW_PROFILE_INFOW` (
    public var `dwDockInfo`: UInt,
    public var `szHwProfileGuid`: UShortArray,
    public var `szHwProfileName`: UShortArray,
)
// UNSUPPORTED Rust 906:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGE_DELAYLOAD_DESCRIPTOR` (
    public var `Attributes`: `IMAGE_DELAYLOAD_DESCRIPTOR_0`,
    public var `DllNameRVA`: UInt,
    public var `ModuleHandleRVA`: UInt,
    public var `ImportAddressTableRVA`: UInt,
    public var `ImportNameTableRVA`: UInt,
    public var `BoundImportAddressTableRVA`: UInt,
    public var `UnloadInformationTableRVA`: UInt,
    public var `TimeDateStamp`: UInt,
)
// UNSUPPORTED Rust 948:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGE_DELAYLOAD_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 953:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IMAGE_DELAYLOAD_DESCRIPTOR_0 {
//     pub AllAttributes: u32,
//     pub Anonymous: IMAGE_DELAYLOAD_DESCRIPTOR_0_0,
// }

// UNSUPPORTED Rust 959:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGE_DELAYLOAD_DESCRIPTOR_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IMAGE_DELAYLOAD_DESCRIPTOR_0_0` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGE_THUNK_DATA32` (
    public var `u1`: `IMAGE_THUNK_DATA32_0`,
)
// UNSUPPORTED Rust 974:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGE_THUNK_DATA32 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 979:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IMAGE_THUNK_DATA32_0 {
//     pub ForwarderString: u32,
//     pub Function: u32,
//     pub Ordinal: u32,
//     pub AddressOfData: u32,
// }

// UNSUPPORTED Rust 987:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGE_THUNK_DATA32_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMAGE_THUNK_DATA64` (
    public var `u1`: `IMAGE_THUNK_DATA64_0`,
)
// UNSUPPORTED Rust 997:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGE_THUNK_DATA64 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1002:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IMAGE_THUNK_DATA64_0 {
//     pub ForwarderString: u64,
//     pub Function: u64,
//     pub Ordinal: u64,
//     pub AddressOfData: u64,
// }

// UNSUPPORTED Rust 1010:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMAGE_THUNK_DATA64_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IMEA_INIT`: UInt = 1u;
public const val `IMEA_NEXT`: UInt = 2u;
public const val `IMEA_PREV`: UInt = 3u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 50 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 80 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 30 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMEPROA` (
    public var `hWnd`: `super`.`super`.`Foundation`.`HWND`,
    public var `InstDate`: `DATETIME`,
    public var `wVersion`: UInt,
    public var `szDescription`: UByteArray,
    public var `szName`: UByteArray,
    public var `szOptions`: UByteArray,
)
// UNSUPPORTED Rust 1028:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMEPROA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 50 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 80 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 30 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IMEPROW` (
    public var `hWnd`: `super`.`super`.`Foundation`.`HWND`,
    public var `InstDate`: `DATETIME`,
    public var `wVersion`: UInt,
    public var `szDescription`: UShortArray,
    public var `szName`: UShortArray,
    public var `szOptions`: UShortArray,
)
// UNSUPPORTED Rust 1043:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IMEPROW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IMESTRUCT` (
    public var `fnc`: UInt,
    public var `wParam`: `super`.`super`.`Foundation`.`WPARAM`,
    public var `wCount`: UInt,
    public var `dchSource`: UInt,
    public var `dchDest`: UInt,
    public var `lParam1`: `super`.`super`.`Foundation`.`LPARAM`,
    public var `lParam2`: `super`.`super`.`Foundation`.`LPARAM`,
    public var `lParam3`: `super`.`super`.`Foundation`.`LPARAM`,
)
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `JAVA_TRUST` (
    public var `cbSize`: UInt,
    public var `flag`: UInt,
    public var `fAllActiveXPermissions`: `windows_sys`.`core`.`BOOL`,
    public var `fAllPermissions`: `windows_sys`.`core`.`BOOL`,
    public var `dwEncodingType`: UInt,
    public var `pbJavaPermissions`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `cbJavaPermissions`: UInt,
    public var `pbSigner`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `cbSigner`: UInt,
    public var `pwszZone`: `windows_sys`.`core`.`PCWSTR`,
    public var `guidZone`: `windows_sys`.`core`.`GUID`,
    public var `hVerify`: `windows_sys`.`core`.`HRESULT`,
)
// UNSUPPORTED Rust 1136:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for JAVA_TRUST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `JIT_DEBUG_INFO` (
    public var `dwSize`: UInt,
    public var `dwProcessorArchitecture`: UInt,
    public var `dwThreadID`: UInt,
    public var `dwReserved0`: UInt,
    public var `lpExceptionAddress`: ULong,
    public var `lpExceptionRecord`: ULong,
    public var `lpContextRecord`: ULong,
)
public const val `KEY_ALL_KEYS`: `WLDP_KEY` = 2;
public const val `KEY_OVERRIDE`: `WLDP_KEY` = 1;
public const val `KEY_UNKNOWN`: `WLDP_KEY` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 8 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Kernel")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LDR_DATA_TABLE_ENTRY` (
    public var `Reserved1`: Array</* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?>,
    public var `InMemoryOrderLinks`: `super`.`Kernel`.`LIST_ENTRY`,
    public var `Reserved2`: Array</* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?>,
    public var `DllBase`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Reserved3`: Array</* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?>,
    public var `FullDllName`: `super`.`super`.`Foundation`.`UNICODE_STRING`,
    public var `Reserved4`: UByteArray,
    public var `Reserved5`: Array</* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?>,
    public var `Anonymous`: `LDR_DATA_TABLE_ENTRY_0`,
    public var `TimeDateStamp`: UInt,
)
// UNSUPPORTED Rust 1170:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Kernel")]
// impl Default for LDR_DATA_TABLE_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1176:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_System_Kernel")]
// #[derive(Clone, Copy)]
// pub union LDR_DATA_TABLE_ENTRY_0 {
//     pub CheckSum: u32,
//     pub Reserved6: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 1183:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PDELAYLOAD_FAILURE_DLL_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`DELAYLOAD_INFO`>?) -> /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 59 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 128 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 10 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 1040 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PERUSERSECTIONA` (
    public var `szGUID`: ByteArray,
    public var `szDispName`: ByteArray,
    public var `szLocale`: ByteArray,
    public var `szStub`: ByteArray,
    public var `szVersion`: ByteArray,
    public var `szCompID`: ByteArray,
    public var `dwIsInstalled`: UInt,
    public var `bRollback`: `windows_sys`.`core`.`BOOL`,
)
// UNSUPPORTED Rust 1233:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PERUSERSECTIONA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 59 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 128 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 10 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 1040 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PERUSERSECTIONW` (
    public var `szGUID`: UShortArray,
    public var `szDispName`: UShortArray,
    public var `szLocale`: UShortArray,
    public var `szStub`: UShortArray,
    public var `szVersion`: UShortArray,
    public var `szCompID`: UShortArray,
    public var `dwIsInstalled`: UInt,
    public var `bRollback`: `windows_sys`.`core`.`BOOL`,
)
// UNSUPPORTED Rust 1250:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PERUSERSECTIONW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFEATURE_STATE_CHANGE_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFIBER_CALLOUT_ROUTINE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PQUERYACTCTXW_FUNC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, `super`.`super`.`Foundation`.`HANDLE`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, ULong, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) -> `windows_sys`.`core`.`BOOL`>>>;
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 10 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PUBLIC_OBJECT_BASIC_INFORMATION` (
    public var `Attributes`: UInt,
    public var `GrantedAccess`: UInt,
    public var `HandleCount`: UInt,
    public var `PointerCount`: UInt,
    public var `Reserved`: UIntArray,
)
// UNSUPPORTED Rust 1295:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PUBLIC_OBJECT_BASIC_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 22 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PUBLIC_OBJECT_TYPE_INFORMATION` (
    public var `TypeName`: `super`.`super`.`Foundation`.`UNICODE_STRING`,
    public var `Reserved`: UIntArray,
)
// UNSUPPORTED Rust 1306:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PUBLIC_OBJECT_TYPE_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PWINSTATIONQUERYINFORMATIONW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, UInt, `WINSTATIONINFOCLASS`, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> Boolean>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PWLDP_CANEXECUTEBUFFER_API` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `WLDP_EXECUTION_EVALUATION_OPTIONS`, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, UInt, `windows_sys`.`core`.`PCWSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<`WLDP_EXECUTION_POLICY`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PWLDP_CANEXECUTEFILE_API` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `WLDP_EXECUTION_EVALUATION_OPTIONS`, `super`.`super`.`Foundation`.`HANDLE`, `windows_sys`.`core`.`PCWSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<`WLDP_EXECUTION_POLICY`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public typealias `PWLDP_CANEXECUTESTREAM_API` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `WLDP_EXECUTION_EVALUATION_OPTIONS`, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `windows_sys`.`core`.`PCWSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<`WLDP_EXECUTION_POLICY`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PWLDP_ISAPPAPPROVEDBYPOLICY_API` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, ULong) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PWLDP_ISDYNAMICCODEPOLICYENABLED_API` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PWLDP_ISPRODUCTIONCONFIGURATION_API` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PWLDP_ISWCOSPRODUCTIONCONFIGURATION_API` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PWLDP_QUERYDEVICESECURITYINFORMATION_API` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WLDP_DEVICE_SECURITY_INFORMATION`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PWLDP_QUERYDYNAMICODETRUST_API` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PWLDP_QUERYPOLICYSETTINGENABLED2_API` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PWLDP_QUERYPOLICYSETTINGENABLED_API` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`WLDP_POLICY_SETTING`, /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PWLDP_QUERYWINDOWSLOCKDOWNMODE_API` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WLDP_WINDOWS_LOCKDOWN_MODE`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PWLDP_QUERYWINDOWSLOCKDOWNRESTRICTION_API` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WLDP_WINDOWS_LOCKDOWN_RESTRICTION`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PWLDP_RESETPRODUCTIONCONFIGURATION_API` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PWLDP_RESETWCOSPRODUCTIONCONFIGURATION_API` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PWLDP_SETDYNAMICCODETRUST_API` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PWLDP_SETWINDOWSLOCKDOWNRESTRICTION_API` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`WLDP_WINDOWS_LOCKDOWN_RESTRICTION`) -> `windows_sys`.`core`.`HRESULT`>>>;
public const val `QUERY_ACTCTX_FLAG_ACTCTX_IS_ADDRESS`: UInt = 16u;
public const val `QUERY_ACTCTX_FLAG_ACTCTX_IS_HMODULE`: UInt = 8u;
public const val `QUERY_ACTCTX_FLAG_NO_ADDREF`: UInt = 2147483648u;
public const val `QUERY_ACTCTX_FLAG_USE_ACTIVE_ACTCTX`: UInt = 4u;
public const val `RECOVERY_DEFAULT_PING_INTERVAL`: UInt = 5000u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `REGINSTALLA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HMODULE`, `windows_sys`.`core`.`PCSTR`, /* Rust *const */ kotlinx.cinterop.CPointer<`STRTABLEA`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// UNSUPPORTED Rust 1336:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const REG_RESTORE_LOG_KEY: windows_sys::core::PCWSTR = windows_sys::core::w!("RegRestoreLogFile");

// UNSUPPORTED Rust 1337:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `STRENTRYA` (
    public var `pszName`: `windows_sys`.`core`.`PSTR`,
    public var `pszValue`: `windows_sys`.`core`.`PSTR`,
)
// UNSUPPORTED Rust 1403:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STRENTRYA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `STRENTRYW` (
    public var `pszName`: `windows_sys`.`core`.`PWSTR`,
    public var `pszValue`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 1414:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STRENTRYW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STRINGEXSTRUCT` (
    public var `dwSize`: UInt,
    public var `uDeterminePos`: UInt,
    public var `uDetermineDelimPos`: UInt,
    public var `uYomiPos`: UInt,
    public var `uYomiDelimPos`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `STRTABLEA` (
    public var `cEntries`: UInt,
    public var `pse`: /* Rust *mut */ kotlinx.cinterop.CPointer<`STRENTRYA`>?,
)
// UNSUPPORTED Rust 1434:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STRTABLEA {
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
public class `STRTABLEW` (
    public var `cEntries`: UInt,
    public var `pse`: /* Rust *mut */ kotlinx.cinterop.CPointer<`STRENTRYW`>?,
)
// UNSUPPORTED Rust 1445:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STRTABLEW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 24 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SYSTEM_BASIC_INFORMATION` (
    public var `Reserved1`: UByteArray,
    public var `Reserved2`: Array</* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?>,
    public var `NumberOfProcessors`: Byte,
)
// UNSUPPORTED Rust 1457:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SYSTEM_BASIC_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SYSTEM_CODEINTEGRITY_INFORMATION` (
    public var `Length`: UInt,
    public var `CodeIntegrityOptions`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SYSTEM_EXCEPTION_INFORMATION` (
    public var `Reserved1`: UByteArray,
)
// UNSUPPORTED Rust 1473:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SYSTEM_EXCEPTION_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 24 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SYSTEM_INTERRUPT_INFORMATION` (
    public var `Reserved1`: UByteArray,
)
// UNSUPPORTED Rust 1483:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SYSTEM_INTERRUPT_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SYSTEM_LOOKASIDE_INFORMATION` (
    public var `Reserved1`: UByteArray,
)
// UNSUPPORTED Rust 1493:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SYSTEM_LOOKASIDE_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 312 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SYSTEM_PERFORMANCE_INFORMATION` (
    public var `Reserved1`: UByteArray,
)
// UNSUPPORTED Rust 1503:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SYSTEM_PERFORMANCE_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SYSTEM_POLICY_INFORMATION` (
    public var `Reserved1`: Array</* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?>,
    public var `Reserved2`: UIntArray,
)
// UNSUPPORTED Rust 1514:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SYSTEM_POLICY_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SYSTEM_PROCESSOR_PERFORMANCE_INFORMATION` (
    public var `IdleTime`: Long,
    public var `KernelTime`: Long,
    public var `UserTime`: Long,
    public var `Reserved1`: LongArray,
    public var `Reserved2`: UInt,
)
// UNSUPPORTED Rust 1528:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SYSTEM_PROCESSOR_PERFORMANCE_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 48 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SYSTEM_PROCESS_INFORMATION` (
    public var `NextEntryOffset`: UInt,
    public var `NumberOfThreads`: UInt,
    public var `Reserved1`: UByteArray,
    public var `ImageName`: `super`.`super`.`Foundation`.`UNICODE_STRING`,
    public var `BasePriority`: Int,
    public var `UniqueProcessId`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `Reserved2`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `HandleCount`: UInt,
    public var `SessionId`: UInt,
    public var `Reserved3`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `PeakVirtualSize`: ULong,
    public var `VirtualSize`: ULong,
    public var `Reserved4`: UInt,
    public var `PeakWorkingSetSize`: ULong,
    public var `WorkingSetSize`: ULong,
    public var `Reserved5`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `QuotaPagedPoolUsage`: ULong,
    public var `Reserved6`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `QuotaNonPagedPoolUsage`: ULong,
    public var `PagefileUsage`: ULong,
    public var `PeakPagefileUsage`: ULong,
    public var `PrivatePageCount`: ULong,
    public var `Reserved7`: LongArray,
)
// UNSUPPORTED Rust 1560:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SYSTEM_PROCESS_INFORMATION {
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
public class `SYSTEM_REGISTRY_QUOTA_INFORMATION` (
    public var `RegistryQuotaAllowed`: UInt,
    public var `RegistryQuotaUsed`: UInt,
    public var `Reserved1`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 1572:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SYSTEM_REGISTRY_QUOTA_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SYSTEM_STATUS_FLAG_POWER_SAVING_ON`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SYSTEM_THREAD_INFORMATION` (
    public var `Reserved1`: LongArray,
    public var `Reserved2`: UInt,
    public var `StartAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `ClientId`: `CLIENT_ID`,
    public var `Priority`: Int,
    public var `BasePriority`: Int,
    public var `Reserved3`: UInt,
    public var `ThreadState`: UInt,
    public var `WaitReason`: UInt,
)
// UNSUPPORTED Rust 1591:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SYSTEM_THREAD_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 48 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SYSTEM_TIMEOFDAY_INFORMATION` (
    public var `Reserved1`: UByteArray,
)
// UNSUPPORTED Rust 1601:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TCP_REQUEST_QUERY_INFORMATION_EX32_XP` (
    public var `ID`: `TDIObjectID`,
    public var `Context`: UIntArray,
)
// UNSUPPORTED Rust 1645:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for TCP_REQUEST_QUERY_INFORMATION_EX32_XP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TCP_REQUEST_QUERY_INFORMATION_EX_W2K` (
    public var `ID`: `TDIObjectID`,
    public var `Context`: UByteArray,
)
// UNSUPPORTED Rust 1657:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TCP_REQUEST_QUERY_INFORMATION_EX_W2K {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TCP_REQUEST_QUERY_INFORMATION_EX_XP` (
    public var `ID`: `TDIObjectID`,
    public var `Context`: ULongArray,
)
// UNSUPPORTED Rust 1668:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TCP_REQUEST_QUERY_INFORMATION_EX_XP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TCP_REQUEST_SET_INFORMATION_EX` (
    public var `ID`: `TDIObjectID`,
    public var `BufferSize`: UInt,
    public var `Buffer`: UByteArray,
)
// UNSUPPORTED Rust 1680:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TDIEntityID` (
    public var `tei_entity`: `TDIENTITY_ENTITY_TYPE`,
    public var `tei_instance`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TDIObjectID` (
    public var `toi_entity`: `TDIEntityID`,
    public var `toi_class`: UInt,
    public var `toi_type`: UInt,
    public var `toi_id`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TDI_TL_IO_CONTROL_ENDPOINT` (
    public var `Type`: `TDI_TL_IO_CONTROL_TYPE`,
    public var `Level`: UInt,
    public var `Anonymous`: `TDI_TL_IO_CONTROL_ENDPOINT_0`,
    public var `InputBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `InputBufferLength`: UInt,
    public var `OutputBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `OutputBufferLength`: UInt,
)
// UNSUPPORTED Rust 1715:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TDI_TL_IO_CONTROL_ENDPOINT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1720:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union TDI_TL_IO_CONTROL_ENDPOINT_0 {
//     pub IoControlCode: u32,
//     pub OptionName: u32,
// }

// UNSUPPORTED Rust 1726:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TDI_TL_IO_CONTROL_ENDPOINT_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `TDI_TL_IO_CONTROL_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `THREAD_NAME_INFORMATION` (
    public var `ThreadName`: `super`.`super`.`Foundation`.`UNICODE_STRING`,
)
public const val `THREAD_PRIORITY_ERROR_RETURN`: UInt = 2147483647u;
public const val `UMS_VERSION`: UInt = 256u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `UNDETERMINESTRUCT` (
    public var `dwSize`: UInt,
    public var `uDefIMESize`: UInt,
    public var `uDefIMEPos`: UInt,
    public var `uUndetTextLen`: UInt,
    public var `uUndetTextPos`: UInt,
    public var `uUndetAttrPos`: UInt,
    public var `uCursorPos`: UInt,
    public var `uDeltaStart`: UInt,
    public var `uDetermineTextLen`: UInt,
    public var `uDetermineTextPos`: UInt,
    public var `uDetermineDelimPos`: UInt,
    public var `uYomiTextLen`: UInt,
    public var `uYomiTextPos`: UInt,
    public var `uYomiDelimPos`: UInt,
)
public typealias `VALUENAME` = Int;
public const val `VALUENAME_BUILT_IN_LIST`: `VALUENAME` = 2;
public const val `VALUENAME_ENTERPRISE_DEFINED_CLASS_ID`: `VALUENAME` = 1;
public const val `VALUENAME_UNKNOWN`: `VALUENAME` = 0;
public typealias `WINSTATIONINFOCLASS` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 70 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 1140 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WINSTATIONINFORMATIONW` (
    public var `Reserved2`: UByteArray,
    public var `LogonId`: UInt,
    public var `Reserved3`: UByteArray,
)
// UNSUPPORTED Rust 1769:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WINSTATIONINFORMATIONW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WINWATCHNOTIFYPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`HWINWATCH`, `super`.`super`.`Foundation`.`HWND`, UInt, `super`.`super`.`Foundation`.`LPARAM`) -> Unit>>>;
public const val `WINWATCHNOTIFY_CHANGED`: UInt = 4u;
public const val `WINWATCHNOTIFY_CHANGING`: UInt = 3u;
public const val `WINWATCHNOTIFY_DESTROY`: UInt = 2u;
public const val `WINWATCHNOTIFY_START`: UInt = 0u;
public const val `WINWATCHNOTIFY_STOP`: UInt = 1u;
// UNSUPPORTED Rust 1780:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const WLDP_CANEXECUTEBUFFER_FN: windows_sys::core::PCSTR = windows_sys::core::s!("WldpCanExecuteBuffer");

// UNSUPPORTED Rust 1781:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const WLDP_CANEXECUTEFILE_FN: windows_sys::core::PCSTR = windows_sys::core::s!("WldpCanExecuteFile");

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WLDP_DEVICE_SECURITY_INFORMATION` (
    public var `UnlockIdSize`: UInt,
    public var `UnlockId`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `ManufacturerIDLength`: UInt,
    public var `ManufacturerID`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 1790:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WLDP_DEVICE_SECURITY_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1795:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const WLDP_DLL: windows_sys::core::PCWSTR = windows_sys::core::w!("WLDP.DLL");

public typealias `WLDP_EXECUTION_EVALUATION_OPTIONS` = Int;
public const val `WLDP_EXECUTION_EVALUATION_OPTION_EXECUTE_IN_INTERACTIVE_SESSION`: `WLDP_EXECUTION_EVALUATION_OPTIONS` = 1;
public const val `WLDP_EXECUTION_EVALUATION_OPTION_NONE`: `WLDP_EXECUTION_EVALUATION_OPTIONS` = 0;
public typealias `WLDP_EXECUTION_POLICY` = Int;
public const val `WLDP_EXECUTION_POLICY_ALLOWED`: `WLDP_EXECUTION_POLICY` = 1;
public const val `WLDP_EXECUTION_POLICY_BLOCKED`: `WLDP_EXECUTION_POLICY` = 0;
public const val `WLDP_EXECUTION_POLICY_REQUIRE_SANDBOX`: `WLDP_EXECUTION_POLICY` = 2;
public const val `WLDP_FLAGS_SKIPSIGNATUREVALIDATION`: UInt = 256u;
// UNSUPPORTED Rust 1804:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const WLDP_GETLOCKDOWNPOLICY_FN: windows_sys::core::PCSTR = windows_sys::core::s!("WldpGetLockdownPolicy");

public typealias `WLDP_HOST` = Int;
// UNSUPPORTED Rust 1806:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WLDP_HOST_CMD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5baea1d6_6f1c_488e_8490_347fa5c5067f);

// UNSUPPORTED Rust 1807:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
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
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WLDP_HOST_INFORMATION` (
    public var `dwRevision`: UInt,
    public var `dwHostId`: `WLDP_HOST_ID`,
    public var `szSource`: `windows_sys`.`core`.`PCWSTR`,
    public var `hSource`: `super`.`super`.`Foundation`.`HANDLE`,
)
// UNSUPPORTED Rust 1826:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WLDP_HOST_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WLDP_HOST_INFORMATION_REVISION`: UInt = 1u;
// UNSUPPORTED Rust 1832:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WLDP_HOST_JAVASCRIPT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5629f0d5_1cca_4fed_a1a3_36a8c18d74c0);

public const val `WLDP_HOST_MAX`: `WLDP_HOST` = 2;
// UNSUPPORTED Rust 1834:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WLDP_HOST_MSI: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x624eb611_6e7e_4eec_9bfe_f0ecdbfcf390);

// UNSUPPORTED Rust 1835:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WLDP_HOST_OTHER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x626cbec3_e1fa_4227_9800_ed210274cf7c);

// UNSUPPORTED Rust 1836:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WLDP_HOST_POWERSHELL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8e9aaa7c_198b_4879_ae41_a50d47ad6458);

// UNSUPPORTED Rust 1837:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WLDP_HOST_PYTHON: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbfd557ef_2448_42ec_810b_0d9f09352d4a);

public const val `WLDP_HOST_RUNDLL32`: `WLDP_HOST` = 0;
public const val `WLDP_HOST_SVCHOST`: `WLDP_HOST` = 1;
// UNSUPPORTED Rust 1840:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WLDP_HOST_WINDOWS_SCRIPT_HOST: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd30b84c5_29ce_4ff3_86ec_a30007a82e49);

// UNSUPPORTED Rust 1841:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const WLDP_HOST_XML: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5594be58_c6bf_4295_82f4_d494d20e3a36);

// UNSUPPORTED Rust 1842:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const WLDP_ISAPPAPPROVEDBYPOLICY_FN: windows_sys::core::PCSTR = windows_sys::core::s!("WldpIsAppApprovedByPolicy");

// UNSUPPORTED Rust 1843:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const WLDP_ISCLASSINAPPROVEDLIST_FN: windows_sys::core::PCSTR = windows_sys::core::s!("WldpIsClassInApprovedList");

// UNSUPPORTED Rust 1844:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const WLDP_ISDYNAMICCODEPOLICYENABLED_FN: windows_sys::core::PCSTR = windows_sys::core::s!("WldpIsDynamicCodePolicyEnabled");

// UNSUPPORTED Rust 1845:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const WLDP_ISPRODUCTIONCONFIGURATION_FN: windows_sys::core::PCSTR = windows_sys::core::s!("WldpIsProductionConfiguration");

// UNSUPPORTED Rust 1846:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
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
// UNSUPPORTED Rust 1858:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const WLDP_QUERYDANAMICCODETRUST_FN: windows_sys::core::PCSTR = windows_sys::core::s!("WldpQueryDynamicCodeTrust");

// UNSUPPORTED Rust 1859:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const WLDP_QUERYDEVICESECURITYINFORMATION_FN: windows_sys::core::PCSTR = windows_sys::core::s!("WldpQueryDeviceSecurityInformation");

// UNSUPPORTED Rust 1860:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const WLDP_QUERYDYNAMICCODETRUST_FN: windows_sys::core::PCSTR = windows_sys::core::s!("WldpQueryDynamicCodeTrust");

// UNSUPPORTED Rust 1861:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const WLDP_QUERYPOLICYSETTINGENABLED2_FN: windows_sys::core::PCSTR = windows_sys::core::s!("WldpQueryPolicySettingEnabled2");

// UNSUPPORTED Rust 1862:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const WLDP_QUERYPOLICYSETTINGENABLED_FN: windows_sys::core::PCSTR = windows_sys::core::s!("WldpQueryPolicySettingEnabled");

// UNSUPPORTED Rust 1863:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const WLDP_QUERYWINDOWSLOCKDOWNMODE_FN: windows_sys::core::PCSTR = windows_sys::core::s!("WldpQueryWindowsLockdownMode");

// UNSUPPORTED Rust 1864:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const WLDP_QUERYWINDOWSLOCKDOWNRESTRICTION_FN: windows_sys::core::PCSTR = windows_sys::core::s!("WldpQueryWindowsLockdownRestriction");

// UNSUPPORTED Rust 1865:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const WLDP_RESETPRODUCTIONCONFIGURATION_FN: windows_sys::core::PCSTR = windows_sys::core::s!("WldpResetProductionConfiguration");

// UNSUPPORTED Rust 1866:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const WLDP_RESETWCOSPRODUCTIONCONFIGURATION_FN: windows_sys::core::PCSTR = windows_sys::core::s!("WldpResetWcosProductionConfiguration");

// UNSUPPORTED Rust 1867:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const WLDP_SETDYNAMICCODETRUST_FN: windows_sys::core::PCSTR = windows_sys::core::s!("WldpSetDynamicCodeTrust");

// UNSUPPORTED Rust 1868:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
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
