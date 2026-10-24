// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=clfsw32.dll, ABI=system, export=AddLogContainer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AddLogContainer`(`hlog` : `super`.`super`.`Foundation`.`HANDLE`, `pcbcontainer` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `pwszcontainerpath` : `windows_sys`.`core`.`PCWSTR`, `preserved` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=clfsw32.dll, ABI=system, export=AddLogContainerSet; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AddLogContainerSet`(`hlog` : `super`.`super`.`Foundation`.`HANDLE`, `ccontainer` : UShort, `pcbcontainer` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `rgwszcontainerpath` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCWSTR`>?, `preserved` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=AddUsersToEncryptedFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `AddUsersToEncryptedFile`(`lpfilename` : `windows_sys`.`core`.`PCWSTR`, `pencryptioncertificates` : /* Rust *const */ kotlinx.cinterop.CPointer<`ENCRYPTION_CERTIFICATE_LIST`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=clfsw32.dll, ABI=system, export=AdvanceLogBase; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `AdvanceLogBase`(`pvmarshal` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `plsnbase` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CLS_LSN`>?, `fflags` : UInt, `poverlapped` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=clfsw32.dll, ABI=system, export=AlignReservedLog; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AlignReservedLog`(`pvmarshal` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `creservedrecords` : UInt, `rgcbreservation` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, `pcbalignreservation` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=clfsw32.dll, ABI=system, export=AllocReservedLog; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AllocReservedLog`(`pvmarshal` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `creservedrecords` : UInt, `pcbadjustment` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=AreFileApisANSI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AreFileApisANSI`() : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=AreShortNamesEnabled; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AreShortNamesEnabled`(`handle` : `super`.`super`.`Foundation`.`HANDLE`, `enabled` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=BackupRead; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `BackupRead`(`hfile` : `super`.`super`.`Foundation`.`HANDLE`, `lpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `nnumberofbytestoread` : UInt, `lpnumberofbytesread` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `babort` : `windows_sys`.`core`.`BOOL`, `bprocesssecurity` : `windows_sys`.`core`.`BOOL`, `lpcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=BackupSeek; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `BackupSeek`(`hfile` : `super`.`super`.`Foundation`.`HANDLE`, `dwlowbytestoseek` : UInt, `dwhighbytestoseek` : UInt, `lpdwlowbyteseeked` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpdwhighbyteseeked` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=BackupWrite; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `BackupWrite`(`hfile` : `super`.`super`.`Foundation`.`HANDLE`, `lpbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `nnumberofbytestowrite` : UInt, `lpnumberofbyteswritten` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `babort` : `windows_sys`.`core`.`BOOL`, `bprocesssecurity` : `windows_sys`.`core`.`BOOL`, `lpcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-ioring-l1-1-0.dll, ABI=system, export=BuildIoRingCancelRequest; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `BuildIoRingCancelRequest`(`ioring` : `HIORING`, `file` : `IORING_HANDLE_REF`, `optocancel` : ULong, `userdata` : ULong) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=BuildIoRingFlushFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `BuildIoRingFlushFile`(`ioring` : `HIORING`, `fileref` : `IORING_HANDLE_REF`, `flushmode` : `FILE_FLUSH_MODE`, `userdata` : ULong, `sqeflags` : `IORING_SQE_FLAGS`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-ioring-l1-1-0.dll, ABI=system, export=BuildIoRingReadFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `BuildIoRingReadFile`(`ioring` : `HIORING`, `fileref` : `IORING_HANDLE_REF`, `dataref` : `IORING_BUFFER_REF`, `numberofbytestoread` : UInt, `fileoffset` : ULong, `userdata` : ULong, `sqeflags` : `IORING_SQE_FLAGS`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-ioring-l1-1-0.dll, ABI=system, export=BuildIoRingRegisterBuffers; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `BuildIoRingRegisterBuffers`(`ioring` : `HIORING`, `count` : UInt, `buffers` : /* Rust *const */ kotlinx.cinterop.CPointer<`IORING_BUFFER_INFO`>?, `userdata` : ULong) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-ioring-l1-1-0.dll, ABI=system, export=BuildIoRingRegisterFileHandles; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `BuildIoRingRegisterFileHandles`(`ioring` : `HIORING`, `count` : UInt, `handles` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?, `userdata` : ULong) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=BuildIoRingWriteFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `BuildIoRingWriteFile`(`ioring` : `HIORING`, `fileref` : `IORING_HANDLE_REF`, `bufferref` : `IORING_BUFFER_REF`, `numberofbytestowrite` : UInt, `fileoffset` : ULong, `writeflags` : `FILE_WRITE_FLAGS`, `userdata` : ULong, `sqeflags` : `IORING_SQE_FLAGS`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=CheckNameLegalDOS8Dot3A; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CheckNameLegalDOS8Dot3A`(`lpname` : `windows_sys`.`core`.`PCSTR`, `lpoemname` : `windows_sys`.`core`.`PSTR`, `oemnamesize` : UInt, `pbnamecontainsspaces` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?, `pbnamelegal` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=CheckNameLegalDOS8Dot3W; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CheckNameLegalDOS8Dot3W`(`lpname` : `windows_sys`.`core`.`PCWSTR`, `lpoemname` : `windows_sys`.`core`.`PSTR`, `oemnamesize` : UInt, `pbnamecontainsspaces` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?, `pbnamelegal` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=clfsw32.dll, ABI=system, export=CloseAndResetLogFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CloseAndResetLogFile`(`hlog` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=CloseEncryptedFileRaw; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CloseEncryptedFileRaw`(`pvcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-ioring-l1-1-0.dll, ABI=system, export=CloseIoRing; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CloseIoRing`(`ioring` : `HIORING`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ktmw32.dll, ABI=system, export=CommitComplete; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CommitComplete`(`enlistmenthandle` : `super`.`super`.`Foundation`.`HANDLE`, `tmvirtualclock` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ktmw32.dll, ABI=system, export=CommitEnlistment; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CommitEnlistment`(`enlistmenthandle` : `super`.`super`.`Foundation`.`HANDLE`, `tmvirtualclock` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ktmw32.dll, ABI=system, export=CommitTransaction; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CommitTransaction`(`transactionhandle` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ktmw32.dll, ABI=system, export=CommitTransactionAsync; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CommitTransactionAsync`(`transactionhandle` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=CompareFileTime; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CompareFileTime`(`lpfiletime1` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`FILETIME`>?, `lpfiletime2` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`FILETIME`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=CopyFile2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CopyFile2`(`pwszexistingfilename` : `windows_sys`.`core`.`PCWSTR`, `pwsznewfilename` : `windows_sys`.`core`.`PCWSTR`, `pextendedparameters` : /* Rust *const */ kotlinx.cinterop.CPointer<`COPYFILE2_EXTENDED_PARAMETERS`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=CopyFileA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CopyFileA`(`lpexistingfilename` : `windows_sys`.`core`.`PCSTR`, `lpnewfilename` : `windows_sys`.`core`.`PCSTR`, `bfailifexists` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=CopyFileExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CopyFileExA`(`lpexistingfilename` : `windows_sys`.`core`.`PCSTR`, `lpnewfilename` : `windows_sys`.`core`.`PCSTR`, `lpprogressroutine` : `LPPROGRESS_ROUTINE`, `lpdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pbcancel` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?, `dwcopyflags` : `COPYFILE_FLAGS`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=CopyFileExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CopyFileExW`(`lpexistingfilename` : `windows_sys`.`core`.`PCWSTR`, `lpnewfilename` : `windows_sys`.`core`.`PCWSTR`, `lpprogressroutine` : `LPPROGRESS_ROUTINE`, `lpdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pbcancel` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?, `dwcopyflags` : `COPYFILE_FLAGS`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-file-fromapp-l1-1-0.dll, ABI=system, export=CopyFileFromAppW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CopyFileFromAppW`(`lpexistingfilename` : `windows_sys`.`core`.`PCWSTR`, `lpnewfilename` : `windows_sys`.`core`.`PCWSTR`, `bfailifexists` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=CopyFileTransactedA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CopyFileTransactedA`(`lpexistingfilename` : `windows_sys`.`core`.`PCSTR`, `lpnewfilename` : `windows_sys`.`core`.`PCSTR`, `lpprogressroutine` : `LPPROGRESS_ROUTINE`, `lpdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pbcancel` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?, `dwcopyflags` : UInt, `htransaction` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=CopyFileTransactedW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CopyFileTransactedW`(`lpexistingfilename` : `windows_sys`.`core`.`PCWSTR`, `lpnewfilename` : `windows_sys`.`core`.`PCWSTR`, `lpprogressroutine` : `LPPROGRESS_ROUTINE`, `lpdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pbcancel` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?, `dwcopyflags` : UInt, `htransaction` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=CopyFileW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CopyFileW`(`lpexistingfilename` : `windows_sys`.`core`.`PCWSTR`, `lpnewfilename` : `windows_sys`.`core`.`PCWSTR`, `bfailifexists` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=CopyLZFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CopyLZFile`(`hfsource` : Int, `hfdest` : Int) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=CreateDirectoryA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `CreateDirectoryA`(`lppathname` : `windows_sys`.`core`.`PCSTR`, `lpsecurityattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SECURITY_ATTRIBUTES`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=CreateDirectoryExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `CreateDirectoryExA`(`lptemplatedirectory` : `windows_sys`.`core`.`PCSTR`, `lpnewdirectory` : `windows_sys`.`core`.`PCSTR`, `lpsecurityattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SECURITY_ATTRIBUTES`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=CreateDirectoryExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `CreateDirectoryExW`(`lptemplatedirectory` : `windows_sys`.`core`.`PCWSTR`, `lpnewdirectory` : `windows_sys`.`core`.`PCWSTR`, `lpsecurityattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SECURITY_ATTRIBUTES`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-file-fromapp-l1-1-0.dll, ABI=system, export=CreateDirectoryFromAppW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `CreateDirectoryFromAppW`(`lppathname` : `windows_sys`.`core`.`PCWSTR`, `lpsecurityattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SECURITY_ATTRIBUTES`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=CreateDirectoryTransactedA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `CreateDirectoryTransactedA`(`lptemplatedirectory` : `windows_sys`.`core`.`PCSTR`, `lpnewdirectory` : `windows_sys`.`core`.`PCSTR`, `lpsecurityattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SECURITY_ATTRIBUTES`>?, `htransaction` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=CreateDirectoryTransactedW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `CreateDirectoryTransactedW`(`lptemplatedirectory` : `windows_sys`.`core`.`PCWSTR`, `lpnewdirectory` : `windows_sys`.`core`.`PCWSTR`, `lpsecurityattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SECURITY_ATTRIBUTES`>?, `htransaction` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=CreateDirectoryW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `CreateDirectoryW`(`lppathname` : `windows_sys`.`core`.`PCWSTR`, `lpsecurityattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SECURITY_ATTRIBUTES`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ktmw32.dll, ABI=system, export=CreateEnlistment; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `CreateEnlistment`(`lpenlistmentattributes` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SECURITY_ATTRIBUTES`>?, `resourcemanagerhandle` : `super`.`super`.`Foundation`.`HANDLE`, `transactionhandle` : `super`.`super`.`Foundation`.`HANDLE`, `notificationmask` : UInt, `createoptions` : UInt, `enlistmentkey` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=CreateFile2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `CreateFile2`(`lpfilename` : `windows_sys`.`core`.`PCWSTR`, `dwdesiredaccess` : UInt, `dwsharemode` : `FILE_SHARE_MODE`, `dwcreationdisposition` : `FILE_CREATION_DISPOSITION`, `pcreateexparams` : /* Rust *const */ kotlinx.cinterop.CPointer<`CREATEFILE2_EXTENDED_PARAMETERS`>?) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-file-fromapp-l1-1-0.dll, ABI=system, export=CreateFile2FromAppW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `CreateFile2FromAppW`(`lpfilename` : `windows_sys`.`core`.`PCWSTR`, `dwdesiredaccess` : UInt, `dwsharemode` : UInt, `dwcreationdisposition` : UInt, `pcreateexparams` : /* Rust *const */ kotlinx.cinterop.CPointer<`CREATEFILE2_EXTENDED_PARAMETERS`>?) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=CreateFileA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `CreateFileA`(`lpfilename` : `windows_sys`.`core`.`PCSTR`, `dwdesiredaccess` : UInt, `dwsharemode` : `FILE_SHARE_MODE`, `lpsecurityattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SECURITY_ATTRIBUTES`>?, `dwcreationdisposition` : `FILE_CREATION_DISPOSITION`, `dwflagsandattributes` : `FILE_FLAGS_AND_ATTRIBUTES`, `htemplatefile` : `super`.`super`.`Foundation`.`HANDLE`) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-file-fromapp-l1-1-0.dll, ABI=system, export=CreateFileFromAppW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `CreateFileFromAppW`(`lpfilename` : `windows_sys`.`core`.`PCWSTR`, `dwdesiredaccess` : UInt, `dwsharemode` : UInt, `lpsecurityattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SECURITY_ATTRIBUTES`>?, `dwcreationdisposition` : UInt, `dwflagsandattributes` : UInt, `htemplatefile` : `super`.`super`.`Foundation`.`HANDLE`) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=CreateFileTransactedA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `CreateFileTransactedA`(`lpfilename` : `windows_sys`.`core`.`PCSTR`, `dwdesiredaccess` : UInt, `dwsharemode` : `FILE_SHARE_MODE`, `lpsecurityattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SECURITY_ATTRIBUTES`>?, `dwcreationdisposition` : `FILE_CREATION_DISPOSITION`, `dwflagsandattributes` : `FILE_FLAGS_AND_ATTRIBUTES`, `htemplatefile` : `super`.`super`.`Foundation`.`HANDLE`, `htransaction` : `super`.`super`.`Foundation`.`HANDLE`, `pusminiversion` : /* Rust *const */ kotlinx.cinterop.CPointer<`TXFS_MINIVERSION`>?, `lpextendedparameter` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=CreateFileTransactedW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `CreateFileTransactedW`(`lpfilename` : `windows_sys`.`core`.`PCWSTR`, `dwdesiredaccess` : UInt, `dwsharemode` : `FILE_SHARE_MODE`, `lpsecurityattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SECURITY_ATTRIBUTES`>?, `dwcreationdisposition` : `FILE_CREATION_DISPOSITION`, `dwflagsandattributes` : `FILE_FLAGS_AND_ATTRIBUTES`, `htemplatefile` : `super`.`super`.`Foundation`.`HANDLE`, `htransaction` : `super`.`super`.`Foundation`.`HANDLE`, `pusminiversion` : /* Rust *const */ kotlinx.cinterop.CPointer<`TXFS_MINIVERSION`>?, `lpextendedparameter` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=CreateFileW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `CreateFileW`(`lpfilename` : `windows_sys`.`core`.`PCWSTR`, `dwdesiredaccess` : UInt, `dwsharemode` : `FILE_SHARE_MODE`, `lpsecurityattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SECURITY_ATTRIBUTES`>?, `dwcreationdisposition` : `FILE_CREATION_DISPOSITION`, `dwflagsandattributes` : `FILE_FLAGS_AND_ATTRIBUTES`, `htemplatefile` : `super`.`super`.`Foundation`.`HANDLE`) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=CreateHardLinkA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `CreateHardLinkA`(`lpfilename` : `windows_sys`.`core`.`PCSTR`, `lpexistingfilename` : `windows_sys`.`core`.`PCSTR`, `lpsecurityattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SECURITY_ATTRIBUTES`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=CreateHardLinkTransactedA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `CreateHardLinkTransactedA`(`lpfilename` : `windows_sys`.`core`.`PCSTR`, `lpexistingfilename` : `windows_sys`.`core`.`PCSTR`, `lpsecurityattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SECURITY_ATTRIBUTES`>?, `htransaction` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=CreateHardLinkTransactedW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `CreateHardLinkTransactedW`(`lpfilename` : `windows_sys`.`core`.`PCWSTR`, `lpexistingfilename` : `windows_sys`.`core`.`PCWSTR`, `lpsecurityattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SECURITY_ATTRIBUTES`>?, `htransaction` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=CreateHardLinkW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `CreateHardLinkW`(`lpfilename` : `windows_sys`.`core`.`PCWSTR`, `lpexistingfilename` : `windows_sys`.`core`.`PCWSTR`, `lpsecurityattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SECURITY_ATTRIBUTES`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-ioring-l1-1-0.dll, ABI=system, export=CreateIoRing; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateIoRing`(`ioringversion` : `IORING_VERSION`, `flags` : `IORING_CREATE_FLAGS`, `submissionqueuesize` : UInt, `completionqueuesize` : UInt, `h` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HIORING`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=clfsw32.dll, ABI=system, export=CreateLogContainerScanContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `CreateLogContainerScanContext`(`hlog` : `super`.`super`.`Foundation`.`HANDLE`, `cfromcontainer` : UInt, `ccontainers` : UInt, `escanmode` : UByte, `pcxscan` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CLS_SCAN_CONTEXT`>?, `poverlapped` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=clfsw32.dll, ABI=system, export=CreateLogFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `CreateLogFile`(`pszlogfilename` : `windows_sys`.`core`.`PCWSTR`, `fdesiredaccess` : UInt, `dwsharemode` : `FILE_SHARE_MODE`, `psalogfile` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SECURITY_ATTRIBUTES`>?, `fcreatedisposition` : `FILE_CREATION_DISPOSITION`, `fflagsandattributes` : `FILE_FLAGS_AND_ATTRIBUTES`) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=clfsw32.dll, ABI=system, export=CreateLogMarshallingArea; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateLogMarshallingArea`(`hlog` : `super`.`super`.`Foundation`.`HANDLE`, `pfnallocbuffer` : `CLFS_BLOCK_ALLOCATION`, `pfnfreebuffer` : `CLFS_BLOCK_DEALLOCATION`, `pvblockalloccontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbmarshallingbuffer` : UInt, `cmaxwritebuffers` : UInt, `cmaxreadbuffers` : UInt, `ppvmarshal` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ktmw32.dll, ABI=system, export=CreateResourceManager; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `CreateResourceManager`(`lpresourcemanagerattributes` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SECURITY_ATTRIBUTES`>?, `resourcemanagerid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `createoptions` : UInt, `tmhandle` : `super`.`super`.`Foundation`.`HANDLE`, `description` : `windows_sys`.`core`.`PCWSTR`) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=CreateSymbolicLinkA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateSymbolicLinkA`(`lpsymlinkfilename` : `windows_sys`.`core`.`PCSTR`, `lptargetfilename` : `windows_sys`.`core`.`PCSTR`, `dwflags` : `SYMBOLIC_LINK_FLAGS`) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=CreateSymbolicLinkTransactedA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateSymbolicLinkTransactedA`(`lpsymlinkfilename` : `windows_sys`.`core`.`PCSTR`, `lptargetfilename` : `windows_sys`.`core`.`PCSTR`, `dwflags` : `SYMBOLIC_LINK_FLAGS`, `htransaction` : `super`.`super`.`Foundation`.`HANDLE`) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=CreateSymbolicLinkTransactedW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateSymbolicLinkTransactedW`(`lpsymlinkfilename` : `windows_sys`.`core`.`PCWSTR`, `lptargetfilename` : `windows_sys`.`core`.`PCWSTR`, `dwflags` : `SYMBOLIC_LINK_FLAGS`, `htransaction` : `super`.`super`.`Foundation`.`HANDLE`) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=CreateSymbolicLinkW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateSymbolicLinkW`(`lpsymlinkfilename` : `windows_sys`.`core`.`PCWSTR`, `lptargetfilename` : `windows_sys`.`core`.`PCWSTR`, `dwflags` : `SYMBOLIC_LINK_FLAGS`) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=CreateTapePartition; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateTapePartition`(`hdevice` : `super`.`super`.`Foundation`.`HANDLE`, `dwpartitionmethod` : `CREATE_TAPE_PARTITION_METHOD`, `dwcount` : UInt, `dwsize` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ktmw32.dll, ABI=system, export=CreateTransaction; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `CreateTransaction`(`lptransactionattributes` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SECURITY_ATTRIBUTES`>?, `uow` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `createoptions` : UInt, `isolationlevel` : UInt, `isolationflags` : UInt, `timeout` : UInt, `description` : `windows_sys`.`core`.`PCWSTR`) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ktmw32.dll, ABI=system, export=CreateTransactionManager; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `CreateTransactionManager`(`lptransactionattributes` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SECURITY_ATTRIBUTES`>?, `logfilename` : `windows_sys`.`core`.`PCWSTR`, `createoptions` : UInt, `commitstrength` : UInt) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=DecryptFileA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DecryptFileA`(`lpfilename` : `windows_sys`.`core`.`PCSTR`, `dwreserved` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=DecryptFileW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DecryptFileW`(`lpfilename` : `windows_sys`.`core`.`PCWSTR`, `dwreserved` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=DefineDosDeviceA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DefineDosDeviceA`(`dwflags` : `DEFINE_DOS_DEVICE_FLAGS`, `lpdevicename` : `windows_sys`.`core`.`PCSTR`, `lptargetpath` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=DefineDosDeviceW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DefineDosDeviceW`(`dwflags` : `DEFINE_DOS_DEVICE_FLAGS`, `lpdevicename` : `windows_sys`.`core`.`PCWSTR`, `lptargetpath` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=DeleteFileA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeleteFileA`(`lpfilename` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-file-fromapp-l1-1-0.dll, ABI=system, export=DeleteFileFromAppW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeleteFileFromAppW`(`lpfilename` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=DeleteFileTransactedA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeleteFileTransactedA`(`lpfilename` : `windows_sys`.`core`.`PCSTR`, `htransaction` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=DeleteFileTransactedW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeleteFileTransactedW`(`lpfilename` : `windows_sys`.`core`.`PCWSTR`, `htransaction` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=DeleteFileW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeleteFileW`(`lpfilename` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=clfsw32.dll, ABI=system, export=DeleteLogByHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeleteLogByHandle`(`hlog` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=clfsw32.dll, ABI=system, export=DeleteLogFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeleteLogFile`(`pszlogfilename` : `windows_sys`.`core`.`PCWSTR`, `pvreserved` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=clfsw32.dll, ABI=system, export=DeleteLogMarshallingArea; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeleteLogMarshallingArea`(`pvmarshal` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=DeleteVolumeMountPointA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeleteVolumeMountPointA`(`lpszvolumemountpoint` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=DeleteVolumeMountPointW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeleteVolumeMountPointW`(`lpszvolumemountpoint` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=clfsw32.dll, ABI=system, export=DeregisterManageableLogClient; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeregisterManageableLogClient`(`hlog` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=DuplicateEncryptionInfoFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `DuplicateEncryptionInfoFile`(`srcfilename` : `windows_sys`.`core`.`PCWSTR`, `dstfilename` : `windows_sys`.`core`.`PCWSTR`, `dwcreationdistribution` : UInt, `dwattributes` : UInt, `lpsecurityattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SECURITY_ATTRIBUTES`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=EncryptFileA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EncryptFileA`(`lpfilename` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=EncryptFileW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EncryptFileW`(`lpfilename` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=EncryptionDisable; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EncryptionDisable`(`dirpath` : `windows_sys`.`core`.`PCWSTR`, `disable` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=EraseTape; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EraseTape`(`hdevice` : `super`.`super`.`Foundation`.`HANDLE`, `dwerasetype` : `ERASE_TAPE_TYPE`, `bimmediate` : `windows_sys`.`core`.`BOOL`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=FileEncryptionStatusA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FileEncryptionStatusA`(`lpfilename` : `windows_sys`.`core`.`PCSTR`, `lpstatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=FileEncryptionStatusW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FileEncryptionStatusW`(`lpfilename` : `windows_sys`.`core`.`PCWSTR`, `lpstatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=FileTimeToLocalFileTime; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FileTimeToLocalFileTime`(`lpfiletime` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`FILETIME`>?, `lplocalfiletime` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`FILETIME`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=FindClose; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindClose`(`hfindfile` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=FindCloseChangeNotification; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindCloseChangeNotification`(`hchangehandle` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=FindFirstChangeNotificationA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindFirstChangeNotificationA`(`lppathname` : `windows_sys`.`core`.`PCSTR`, `bwatchsubtree` : `windows_sys`.`core`.`BOOL`, `dwnotifyfilter` : `FILE_NOTIFY_CHANGE`) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=FindFirstChangeNotificationW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindFirstChangeNotificationW`(`lppathname` : `windows_sys`.`core`.`PCWSTR`, `bwatchsubtree` : `windows_sys`.`core`.`BOOL`, `dwnotifyfilter` : `FILE_NOTIFY_CHANGE`) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=FindFirstFileA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindFirstFileA`(`lpfilename` : `windows_sys`.`core`.`PCSTR`, `lpfindfiledata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WIN32_FIND_DATAA`>?) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=FindFirstFileExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindFirstFileExA`(`lpfilename` : `windows_sys`.`core`.`PCSTR`, `finfolevelid` : `FINDEX_INFO_LEVELS`, `lpfindfiledata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `fsearchop` : `FINDEX_SEARCH_OPS`, `lpsearchfilter` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwadditionalflags` : `FIND_FIRST_EX_FLAGS`) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-file-fromapp-l1-1-0.dll, ABI=system, export=FindFirstFileExFromAppW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindFirstFileExFromAppW`(`lpfilename` : `windows_sys`.`core`.`PCWSTR`, `finfolevelid` : `FINDEX_INFO_LEVELS`, `lpfindfiledata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `fsearchop` : `FINDEX_SEARCH_OPS`, `lpsearchfilter` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwadditionalflags` : UInt) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=FindFirstFileExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindFirstFileExW`(`lpfilename` : `windows_sys`.`core`.`PCWSTR`, `finfolevelid` : `FINDEX_INFO_LEVELS`, `lpfindfiledata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `fsearchop` : `FINDEX_SEARCH_OPS`, `lpsearchfilter` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwadditionalflags` : `FIND_FIRST_EX_FLAGS`) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=FindFirstFileNameTransactedW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindFirstFileNameTransactedW`(`lpfilename` : `windows_sys`.`core`.`PCWSTR`, `dwflags` : UInt, `stringlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `linkname` : `windows_sys`.`core`.`PWSTR`, `htransaction` : `super`.`super`.`Foundation`.`HANDLE`) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=FindFirstFileNameW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindFirstFileNameW`(`lpfilename` : `windows_sys`.`core`.`PCWSTR`, `dwflags` : UInt, `stringlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `linkname` : `windows_sys`.`core`.`PWSTR`) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=FindFirstFileTransactedA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindFirstFileTransactedA`(`lpfilename` : `windows_sys`.`core`.`PCSTR`, `finfolevelid` : `FINDEX_INFO_LEVELS`, `lpfindfiledata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `fsearchop` : `FINDEX_SEARCH_OPS`, `lpsearchfilter` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwadditionalflags` : UInt, `htransaction` : `super`.`super`.`Foundation`.`HANDLE`) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=FindFirstFileTransactedW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindFirstFileTransactedW`(`lpfilename` : `windows_sys`.`core`.`PCWSTR`, `finfolevelid` : `FINDEX_INFO_LEVELS`, `lpfindfiledata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `fsearchop` : `FINDEX_SEARCH_OPS`, `lpsearchfilter` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwadditionalflags` : UInt, `htransaction` : `super`.`super`.`Foundation`.`HANDLE`) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=FindFirstFileW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindFirstFileW`(`lpfilename` : `windows_sys`.`core`.`PCWSTR`, `lpfindfiledata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WIN32_FIND_DATAW`>?) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=FindFirstStreamTransactedW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindFirstStreamTransactedW`(`lpfilename` : `windows_sys`.`core`.`PCWSTR`, `infolevel` : `STREAM_INFO_LEVELS`, `lpfindstreamdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwflags` : UInt, `htransaction` : `super`.`super`.`Foundation`.`HANDLE`) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=FindFirstStreamW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindFirstStreamW`(`lpfilename` : `windows_sys`.`core`.`PCWSTR`, `infolevel` : `STREAM_INFO_LEVELS`, `lpfindstreamdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwflags` : UInt) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=FindFirstVolumeA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindFirstVolumeA`(`lpszvolumename` : `windows_sys`.`core`.`PSTR`, `cchbufferlength` : UInt) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=FindFirstVolumeMountPointA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindFirstVolumeMountPointA`(`lpszrootpathname` : `windows_sys`.`core`.`PCSTR`, `lpszvolumemountpoint` : `windows_sys`.`core`.`PSTR`, `cchbufferlength` : UInt) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=FindFirstVolumeMountPointW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindFirstVolumeMountPointW`(`lpszrootpathname` : `windows_sys`.`core`.`PCWSTR`, `lpszvolumemountpoint` : `windows_sys`.`core`.`PWSTR`, `cchbufferlength` : UInt) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=FindFirstVolumeW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindFirstVolumeW`(`lpszvolumename` : `windows_sys`.`core`.`PWSTR`, `cchbufferlength` : UInt) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=FindNextChangeNotification; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindNextChangeNotification`(`hchangehandle` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=FindNextFileA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindNextFileA`(`hfindfile` : `super`.`super`.`Foundation`.`HANDLE`, `lpfindfiledata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WIN32_FIND_DATAA`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=FindNextFileNameW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindNextFileNameW`(`hfindstream` : `super`.`super`.`Foundation`.`HANDLE`, `stringlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `linkname` : `windows_sys`.`core`.`PWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=FindNextFileW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindNextFileW`(`hfindfile` : `super`.`super`.`Foundation`.`HANDLE`, `lpfindfiledata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WIN32_FIND_DATAW`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=FindNextStreamW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindNextStreamW`(`hfindstream` : `super`.`super`.`Foundation`.`HANDLE`, `lpfindstreamdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=FindNextVolumeA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindNextVolumeA`(`hfindvolume` : `super`.`super`.`Foundation`.`HANDLE`, `lpszvolumename` : `windows_sys`.`core`.`PSTR`, `cchbufferlength` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=FindNextVolumeMountPointA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindNextVolumeMountPointA`(`hfindvolumemountpoint` : `super`.`super`.`Foundation`.`HANDLE`, `lpszvolumemountpoint` : `windows_sys`.`core`.`PSTR`, `cchbufferlength` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=FindNextVolumeMountPointW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindNextVolumeMountPointW`(`hfindvolumemountpoint` : `super`.`super`.`Foundation`.`HANDLE`, `lpszvolumemountpoint` : `windows_sys`.`core`.`PWSTR`, `cchbufferlength` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=FindNextVolumeW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindNextVolumeW`(`hfindvolume` : `super`.`super`.`Foundation`.`HANDLE`, `lpszvolumename` : `windows_sys`.`core`.`PWSTR`, `cchbufferlength` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=FindVolumeClose; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindVolumeClose`(`hfindvolume` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=FindVolumeMountPointClose; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindVolumeMountPointClose`(`hfindvolumemountpoint` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=FlushFileBuffers; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FlushFileBuffers`(`hfile` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=clfsw32.dll, ABI=system, export=FlushLogBuffers; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `FlushLogBuffers`(`pvmarshal` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `poverlapped` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=clfsw32.dll, ABI=system, export=FlushLogToLsn; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `FlushLogToLsn`(`pvmarshalcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `plsnflush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CLS_LSN`>?, `plsnlastflushed` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CLS_LSN`>?, `poverlapped` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=FreeEncryptedFileMetadata; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FreeEncryptedFileMetadata`(`pbmetadata` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=FreeEncryptionCertificateHashList; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `FreeEncryptionCertificateHashList`(`pusers` : /* Rust *const */ kotlinx.cinterop.CPointer<`ENCRYPTION_CERTIFICATE_HASH_LIST`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=clfsw32.dll, ABI=system, export=FreeReservedLog; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FreeReservedLog`(`pvmarshal` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `creservedrecords` : UInt, `pcbadjustment` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetBinaryTypeA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetBinaryTypeA`(`lpapplicationname` : `windows_sys`.`core`.`PCSTR`, `lpbinarytype` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetBinaryTypeW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetBinaryTypeW`(`lpapplicationname` : `windows_sys`.`core`.`PCWSTR`, `lpbinarytype` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetCompressedFileSizeA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetCompressedFileSizeA`(`lpfilename` : `windows_sys`.`core`.`PCSTR`, `lpfilesizehigh` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetCompressedFileSizeTransactedA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetCompressedFileSizeTransactedA`(`lpfilename` : `windows_sys`.`core`.`PCSTR`, `lpfilesizehigh` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `htransaction` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetCompressedFileSizeTransactedW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetCompressedFileSizeTransactedW`(`lpfilename` : `windows_sys`.`core`.`PCWSTR`, `lpfilesizehigh` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `htransaction` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetCompressedFileSizeW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetCompressedFileSizeW`(`lpfilename` : `windows_sys`.`core`.`PCWSTR`, `lpfilesizehigh` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ktmw32.dll, ABI=system, export=GetCurrentClockTransactionManager; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetCurrentClockTransactionManager`(`transactionmanagerhandle` : `super`.`super`.`Foundation`.`HANDLE`, `tmvirtualclock` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetDiskFreeSpaceA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetDiskFreeSpaceA`(`lprootpathname` : `windows_sys`.`core`.`PCSTR`, `lpsectorspercluster` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpbytespersector` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpnumberoffreeclusters` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lptotalnumberofclusters` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetDiskFreeSpaceExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetDiskFreeSpaceExA`(`lpdirectoryname` : `windows_sys`.`core`.`PCSTR`, `lpfreebytesavailabletocaller` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `lptotalnumberofbytes` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `lptotalnumberoffreebytes` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetDiskFreeSpaceExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetDiskFreeSpaceExW`(`lpdirectoryname` : `windows_sys`.`core`.`PCWSTR`, `lpfreebytesavailabletocaller` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `lptotalnumberofbytes` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `lptotalnumberoffreebytes` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetDiskFreeSpaceW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetDiskFreeSpaceW`(`lprootpathname` : `windows_sys`.`core`.`PCWSTR`, `lpsectorspercluster` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpbytespersector` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpnumberoffreeclusters` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lptotalnumberofclusters` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetDiskSpaceInformationA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetDiskSpaceInformationA`(`rootpath` : `windows_sys`.`core`.`PCSTR`, `diskspaceinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DISK_SPACE_INFORMATION`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetDiskSpaceInformationW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetDiskSpaceInformationW`(`rootpath` : `windows_sys`.`core`.`PCWSTR`, `diskspaceinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DISK_SPACE_INFORMATION`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetDriveTypeA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetDriveTypeA`(`lprootpathname` : `windows_sys`.`core`.`PCSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetDriveTypeW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetDriveTypeW`(`lprootpathname` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=GetEncryptedFileMetadata; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetEncryptedFileMetadata`(`lpfilename` : `windows_sys`.`core`.`PCWSTR`, `pcbmetadata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `ppbmetadata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ktmw32.dll, ABI=system, export=GetEnlistmentId; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetEnlistmentId`(`enlistmenthandle` : `super`.`super`.`Foundation`.`HANDLE`, `enlistmentid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ktmw32.dll, ABI=system, export=GetEnlistmentRecoveryInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetEnlistmentRecoveryInformation`(`enlistmenthandle` : `super`.`super`.`Foundation`.`HANDLE`, `buffersize` : UInt, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `bufferused` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetExpandedNameA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetExpandedNameA`(`lpszsource` : `windows_sys`.`core`.`PCSTR`, `lpszbuffer` : `windows_sys`.`core`.`PSTR`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetExpandedNameW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetExpandedNameW`(`lpszsource` : `windows_sys`.`core`.`PCWSTR`, `lpszbuffer` : `windows_sys`.`core`.`PWSTR`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetFileAttributesA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetFileAttributesA`(`lpfilename` : `windows_sys`.`core`.`PCSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetFileAttributesExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetFileAttributesExA`(`lpfilename` : `windows_sys`.`core`.`PCSTR`, `finfolevelid` : `GET_FILEEX_INFO_LEVELS`, `lpfileinformation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-file-fromapp-l1-1-0.dll, ABI=system, export=GetFileAttributesExFromAppW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetFileAttributesExFromAppW`(`lpfilename` : `windows_sys`.`core`.`PCWSTR`, `finfolevelid` : `GET_FILEEX_INFO_LEVELS`, `lpfileinformation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetFileAttributesExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetFileAttributesExW`(`lpfilename` : `windows_sys`.`core`.`PCWSTR`, `finfolevelid` : `GET_FILEEX_INFO_LEVELS`, `lpfileinformation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetFileAttributesTransactedA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetFileAttributesTransactedA`(`lpfilename` : `windows_sys`.`core`.`PCSTR`, `finfolevelid` : `GET_FILEEX_INFO_LEVELS`, `lpfileinformation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `htransaction` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetFileAttributesTransactedW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetFileAttributesTransactedW`(`lpfilename` : `windows_sys`.`core`.`PCWSTR`, `finfolevelid` : `GET_FILEEX_INFO_LEVELS`, `lpfileinformation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `htransaction` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetFileAttributesW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetFileAttributesW`(`lpfilename` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetFileBandwidthReservation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetFileBandwidthReservation`(`hfile` : `super`.`super`.`Foundation`.`HANDLE`, `lpperiodmilliseconds` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpbytesperperiod` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pdiscardable` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?, `lptransfersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpnumoutstandingrequests` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetFileInformationByHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetFileInformationByHandle`(`hfile` : `super`.`super`.`Foundation`.`HANDLE`, `lpfileinformation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`BY_HANDLE_FILE_INFORMATION`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetFileInformationByHandleEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetFileInformationByHandleEx`(`hfile` : `super`.`super`.`Foundation`.`HANDLE`, `fileinformationclass` : `FILE_INFO_BY_HANDLE_CLASS`, `lpfileinformation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwbuffersize` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetFileSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetFileSize`(`hfile` : `super`.`super`.`Foundation`.`HANDLE`, `lpfilesizehigh` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetFileSizeEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetFileSizeEx`(`hfile` : `super`.`super`.`Foundation`.`HANDLE`, `lpfilesize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetFileTime; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetFileTime`(`hfile` : `super`.`super`.`Foundation`.`HANDLE`, `lpcreationtime` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`FILETIME`>?, `lplastaccesstime` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`FILETIME`>?, `lplastwritetime` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`FILETIME`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetFileType; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetFileType`(`hfile` : `super`.`super`.`Foundation`.`HANDLE`) : `FILE_TYPE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=version.dll, ABI=system, export=GetFileVersionInfoA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetFileVersionInfoA`(`lptstrfilename` : `windows_sys`.`core`.`PCSTR`, `dwhandle` : UInt, `dwlen` : UInt, `lpdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=version.dll, ABI=system, export=GetFileVersionInfoExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetFileVersionInfoExA`(`dwflags` : `GET_FILE_VERSION_INFO_FLAGS`, `lpwstrfilename` : `windows_sys`.`core`.`PCSTR`, `dwhandle` : UInt, `dwlen` : UInt, `lpdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=version.dll, ABI=system, export=GetFileVersionInfoExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetFileVersionInfoExW`(`dwflags` : `GET_FILE_VERSION_INFO_FLAGS`, `lpwstrfilename` : `windows_sys`.`core`.`PCWSTR`, `dwhandle` : UInt, `dwlen` : UInt, `lpdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=version.dll, ABI=system, export=GetFileVersionInfoSizeA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetFileVersionInfoSizeA`(`lptstrfilename` : `windows_sys`.`core`.`PCSTR`, `lpdwhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=version.dll, ABI=system, export=GetFileVersionInfoSizeExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetFileVersionInfoSizeExA`(`dwflags` : `GET_FILE_VERSION_INFO_FLAGS`, `lpwstrfilename` : `windows_sys`.`core`.`PCSTR`, `lpdwhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=version.dll, ABI=system, export=GetFileVersionInfoSizeExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetFileVersionInfoSizeExW`(`dwflags` : `GET_FILE_VERSION_INFO_FLAGS`, `lpwstrfilename` : `windows_sys`.`core`.`PCWSTR`, `lpdwhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=version.dll, ABI=system, export=GetFileVersionInfoSizeW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetFileVersionInfoSizeW`(`lptstrfilename` : `windows_sys`.`core`.`PCWSTR`, `lpdwhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=version.dll, ABI=system, export=GetFileVersionInfoW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetFileVersionInfoW`(`lptstrfilename` : `windows_sys`.`core`.`PCWSTR`, `dwhandle` : UInt, `dwlen` : UInt, `lpdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetFinalPathNameByHandleA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetFinalPathNameByHandleA`(`hfile` : `super`.`super`.`Foundation`.`HANDLE`, `lpszfilepath` : `windows_sys`.`core`.`PSTR`, `cchfilepath` : UInt, `dwflags` : `GETFINALPATHNAMEBYHANDLE_FLAGS`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetFinalPathNameByHandleW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetFinalPathNameByHandleW`(`hfile` : `super`.`super`.`Foundation`.`HANDLE`, `lpszfilepath` : `windows_sys`.`core`.`PWSTR`, `cchfilepath` : UInt, `dwflags` : `GETFINALPATHNAMEBYHANDLE_FLAGS`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetFullPathNameA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetFullPathNameA`(`lpfilename` : `windows_sys`.`core`.`PCSTR`, `nbufferlength` : UInt, `lpbuffer` : `windows_sys`.`core`.`PSTR`, `lpfilepart` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PSTR`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetFullPathNameTransactedA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetFullPathNameTransactedA`(`lpfilename` : `windows_sys`.`core`.`PCSTR`, `nbufferlength` : UInt, `lpbuffer` : `windows_sys`.`core`.`PSTR`, `lpfilepart` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PSTR`>?, `htransaction` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetFullPathNameTransactedW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetFullPathNameTransactedW`(`lpfilename` : `windows_sys`.`core`.`PCWSTR`, `nbufferlength` : UInt, `lpbuffer` : `windows_sys`.`core`.`PWSTR`, `lpfilepart` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?, `htransaction` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetFullPathNameW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetFullPathNameW`(`lpfilename` : `windows_sys`.`core`.`PCWSTR`, `nbufferlength` : UInt, `lpbuffer` : `windows_sys`.`core`.`PWSTR`, `lpfilepart` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-ioring-l1-1-0.dll, ABI=system, export=GetIoRingInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetIoRingInfo`(`ioring` : `HIORING`, `info` : /* Rust *mut */ kotlinx.cinterop.CPointer<`IORING_INFO`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=clfsw32.dll, ABI=system, export=GetLogContainerName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetLogContainerName`(`hlog` : `super`.`super`.`Foundation`.`HANDLE`, `cidlogicalcontainer` : UInt, `pwstrcontainername` : `windows_sys`.`core`.`PCWSTR`, `clencontainername` : UInt, `pcactuallencontainername` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=clfsw32.dll, ABI=system, export=GetLogFileInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetLogFileInformation`(`hlog` : `super`.`super`.`Foundation`.`HANDLE`, `pinfobuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CLS_INFORMATION`>?, `cbbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=clfsw32.dll, ABI=system, export=GetLogIoStatistics; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetLogIoStatistics`(`hlog` : `super`.`super`.`Foundation`.`HANDLE`, `pvstatsbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbstatsbuffer` : UInt, `estatsclass` : `CLFS_IOSTATS_CLASS`, `pcbstatswritten` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=clfsw32.dll, ABI=system, export=GetLogReservationInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetLogReservationInfo`(`pvmarshal` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pcbrecordnumber` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pcbuserreservation` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, `pcbcommitreservation` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetLogicalDriveStringsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetLogicalDriveStringsA`(`nbufferlength` : UInt, `lpbuffer` : `windows_sys`.`core`.`PSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetLogicalDriveStringsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetLogicalDriveStringsW`(`nbufferlength` : UInt, `lpbuffer` : `windows_sys`.`core`.`PWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetLogicalDrives; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetLogicalDrives`() : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetLongPathNameA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetLongPathNameA`(`lpszshortpath` : `windows_sys`.`core`.`PCSTR`, `lpszlongpath` : `windows_sys`.`core`.`PSTR`, `cchbuffer` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetLongPathNameTransactedA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetLongPathNameTransactedA`(`lpszshortpath` : `windows_sys`.`core`.`PCSTR`, `lpszlongpath` : `windows_sys`.`core`.`PSTR`, `cchbuffer` : UInt, `htransaction` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetLongPathNameTransactedW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetLongPathNameTransactedW`(`lpszshortpath` : `windows_sys`.`core`.`PCWSTR`, `lpszlongpath` : `windows_sys`.`core`.`PWSTR`, `cchbuffer` : UInt, `htransaction` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetLongPathNameW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetLongPathNameW`(`lpszshortpath` : `windows_sys`.`core`.`PCWSTR`, `lpszlongpath` : `windows_sys`.`core`.`PWSTR`, `cchbuffer` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=clfsw32.dll, ABI=system, export=GetNextLogArchiveExtent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetNextLogArchiveExtent`(`pvarchivecontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `rgadextent` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CLS_ARCHIVE_DESCRIPTOR`>?, `cdescriptors` : UInt, `pcdescriptorsreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ktmw32.dll, ABI=system, export=GetNotificationResourceManager; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetNotificationResourceManager`(`resourcemanagerhandle` : `super`.`super`.`Foundation`.`HANDLE`, `transactionnotification` : /* Rust *mut */ kotlinx.cinterop.CPointer<`TRANSACTION_NOTIFICATION`>?, `notificationlength` : UInt, `dwmilliseconds` : UInt, `returnlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ktmw32.dll, ABI=system, export=GetNotificationResourceManagerAsync; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `GetNotificationResourceManagerAsync`(`resourcemanagerhandle` : `super`.`super`.`Foundation`.`HANDLE`, `transactionnotification` : /* Rust *mut */ kotlinx.cinterop.CPointer<`TRANSACTION_NOTIFICATION`>?, `transactionnotificationlength` : UInt, `returnlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpoverlapped` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetShortPathNameA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetShortPathNameA`(`lpszlongpath` : `windows_sys`.`core`.`PCSTR`, `lpszshortpath` : `windows_sys`.`core`.`PSTR`, `cchbuffer` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetShortPathNameW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetShortPathNameW`(`lpszlongpath` : `windows_sys`.`core`.`PCWSTR`, `lpszshortpath` : `windows_sys`.`core`.`PWSTR`, `cchbuffer` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetTapeParameters; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetTapeParameters`(`hdevice` : `super`.`super`.`Foundation`.`HANDLE`, `dwoperation` : `GET_TAPE_DRIVE_PARAMETERS_OPERATION`, `lpdwsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lptapeinformation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetTapePosition; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetTapePosition`(`hdevice` : `super`.`super`.`Foundation`.`HANDLE`, `dwpositiontype` : `TAPE_POSITION_TYPE`, `lpdwpartition` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpdwoffsetlow` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpdwoffsethigh` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetTapeStatus; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetTapeStatus`(`hdevice` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetTempFileNameA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetTempFileNameA`(`lppathname` : `windows_sys`.`core`.`PCSTR`, `lpprefixstring` : `windows_sys`.`core`.`PCSTR`, `uunique` : UInt, `lptempfilename` : `windows_sys`.`core`.`PSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetTempFileNameW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetTempFileNameW`(`lppathname` : `windows_sys`.`core`.`PCWSTR`, `lpprefixstring` : `windows_sys`.`core`.`PCWSTR`, `uunique` : UInt, `lptempfilename` : `windows_sys`.`core`.`PWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetTempPath2A; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetTempPath2A`(`bufferlength` : UInt, `buffer` : `windows_sys`.`core`.`PSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetTempPath2W; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetTempPath2W`(`bufferlength` : UInt, `buffer` : `windows_sys`.`core`.`PWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetTempPathA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetTempPathA`(`nbufferlength` : UInt, `lpbuffer` : `windows_sys`.`core`.`PSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetTempPathW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetTempPathW`(`nbufferlength` : UInt, `lpbuffer` : `windows_sys`.`core`.`PWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ktmw32.dll, ABI=system, export=GetTransactionId; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetTransactionId`(`transactionhandle` : `super`.`super`.`Foundation`.`HANDLE`, `transactionid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ktmw32.dll, ABI=system, export=GetTransactionInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetTransactionInformation`(`transactionhandle` : `super`.`super`.`Foundation`.`HANDLE`, `outcome` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `isolationlevel` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `isolationflags` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `timeout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `bufferlength` : UInt, `description` : `windows_sys`.`core`.`PWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ktmw32.dll, ABI=system, export=GetTransactionManagerId; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetTransactionManagerId`(`transactionmanagerhandle` : `super`.`super`.`Foundation`.`HANDLE`, `transactionmanagerid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetVolumeInformationA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetVolumeInformationA`(`lprootpathname` : `windows_sys`.`core`.`PCSTR`, `lpvolumenamebuffer` : `windows_sys`.`core`.`PSTR`, `nvolumenamesize` : UInt, `lpvolumeserialnumber` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpmaximumcomponentlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpfilesystemflags` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpfilesystemnamebuffer` : `windows_sys`.`core`.`PSTR`, `nfilesystemnamesize` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetVolumeInformationByHandleW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetVolumeInformationByHandleW`(`hfile` : `super`.`super`.`Foundation`.`HANDLE`, `lpvolumenamebuffer` : `windows_sys`.`core`.`PWSTR`, `nvolumenamesize` : UInt, `lpvolumeserialnumber` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpmaximumcomponentlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpfilesystemflags` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpfilesystemnamebuffer` : `windows_sys`.`core`.`PWSTR`, `nfilesystemnamesize` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetVolumeInformationW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetVolumeInformationW`(`lprootpathname` : `windows_sys`.`core`.`PCWSTR`, `lpvolumenamebuffer` : `windows_sys`.`core`.`PWSTR`, `nvolumenamesize` : UInt, `lpvolumeserialnumber` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpmaximumcomponentlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpfilesystemflags` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpfilesystemnamebuffer` : `windows_sys`.`core`.`PWSTR`, `nfilesystemnamesize` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetVolumeNameForVolumeMountPointA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetVolumeNameForVolumeMountPointA`(`lpszvolumemountpoint` : `windows_sys`.`core`.`PCSTR`, `lpszvolumename` : `windows_sys`.`core`.`PSTR`, `cchbufferlength` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetVolumeNameForVolumeMountPointW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetVolumeNameForVolumeMountPointW`(`lpszvolumemountpoint` : `windows_sys`.`core`.`PCWSTR`, `lpszvolumename` : `windows_sys`.`core`.`PWSTR`, `cchbufferlength` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetVolumePathNameA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetVolumePathNameA`(`lpszfilename` : `windows_sys`.`core`.`PCSTR`, `lpszvolumepathname` : `windows_sys`.`core`.`PSTR`, `cchbufferlength` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetVolumePathNameW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetVolumePathNameW`(`lpszfilename` : `windows_sys`.`core`.`PCWSTR`, `lpszvolumepathname` : `windows_sys`.`core`.`PWSTR`, `cchbufferlength` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetVolumePathNamesForVolumeNameA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetVolumePathNamesForVolumeNameA`(`lpszvolumename` : `windows_sys`.`core`.`PCSTR`, `lpszvolumepathnames` : `windows_sys`.`core`.`PSTR`, `cchbufferlength` : UInt, `lpcchreturnlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetVolumePathNamesForVolumeNameW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetVolumePathNamesForVolumeNameW`(`lpszvolumename` : `windows_sys`.`core`.`PCWSTR`, `lpszvolumepathnames` : `windows_sys`.`core`.`PWSTR`, `cchbufferlength` : UInt, `lpcchreturnlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=clfsw32.dll, ABI=system, export=HandleLogFull; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HandleLogFull`(`hlog` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=clfsw32.dll, ABI=system, export=InstallLogPolicy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InstallLogPolicy`(`hlog` : `super`.`super`.`Foundation`.`HANDLE`, `ppolicy` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CLFS_MGMT_POLICY`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-ioring-l1-1-0.dll, ABI=system, export=IsIoRingOpSupported; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsIoRingOpSupported`(`ioring` : `HIORING`, `op` : `IORING_OP_CODE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=LZClose; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LZClose`(`hfile` : Int)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=LZCopy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LZCopy`(`hfsource` : Int, `hfdest` : Int) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=LZDone; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LZDone`()
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=LZInit; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LZInit`(`hfsource` : Int) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=LZOpenFileA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LZOpenFileA`(`lpfilename` : `windows_sys`.`core`.`PCSTR`, `lpreopenbuf` : /* Rust *mut */ kotlinx.cinterop.CPointer<`OFSTRUCT`>?, `wstyle` : `LZOPENFILE_STYLE`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=LZOpenFileW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LZOpenFileW`(`lpfilename` : `windows_sys`.`core`.`PCWSTR`, `lpreopenbuf` : /* Rust *mut */ kotlinx.cinterop.CPointer<`OFSTRUCT`>?, `wstyle` : `LZOPENFILE_STYLE`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=LZRead; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LZRead`(`hfile` : Int, `lpbuffer` : `windows_sys`.`core`.`PSTR`, `cbread` : Int) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=LZSeek; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LZSeek`(`hfile` : Int, `loffset` : Int, `iorigin` : Int) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=LZStart; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LZStart`() : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=LocalFileTimeToFileTime; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LocalFileTimeToFileTime`(`lplocalfiletime` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`FILETIME`>?, `lpfiletime` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`FILETIME`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=LockFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LockFile`(`hfile` : `super`.`super`.`Foundation`.`HANDLE`, `dwfileoffsetlow` : UInt, `dwfileoffsethigh` : UInt, `nnumberofbytestolocklow` : UInt, `nnumberofbytestolockhigh` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=LockFileEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `LockFileEx`(`hfile` : `super`.`super`.`Foundation`.`HANDLE`, `dwflags` : `LOCK_FILE_FLAGS`, `dwreserved` : UInt, `nnumberofbytestolocklow` : UInt, `nnumberofbytestolockhigh` : UInt, `lpoverlapped` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=clfsw32.dll, ABI=system, export=LogTailAdvanceFailure; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LogTailAdvanceFailure`(`hlog` : `super`.`super`.`Foundation`.`HANDLE`, `dwreason` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=clfsw32.dll, ABI=system, export=LsnBlockOffset; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LsnBlockOffset`(`plsn` : /* Rust *const */ kotlinx.cinterop.CPointer<`CLS_LSN`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=clfsw32.dll, ABI=system, export=LsnContainer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LsnContainer`(`plsn` : /* Rust *const */ kotlinx.cinterop.CPointer<`CLS_LSN`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=clfsw32.dll, ABI=system, export=LsnCreate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LsnCreate`(`cidcontainer` : UInt, `offblock` : UInt, `crecord` : UInt) : `CLS_LSN`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=clfsw32.dll, ABI=system, export=LsnEqual; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LsnEqual`(`plsn1` : /* Rust *const */ kotlinx.cinterop.CPointer<`CLS_LSN`>?, `plsn2` : /* Rust *const */ kotlinx.cinterop.CPointer<`CLS_LSN`>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=clfsw32.dll, ABI=system, export=LsnGreater; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LsnGreater`(`plsn1` : /* Rust *const */ kotlinx.cinterop.CPointer<`CLS_LSN`>?, `plsn2` : /* Rust *const */ kotlinx.cinterop.CPointer<`CLS_LSN`>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=clfsw32.dll, ABI=system, export=LsnIncrement; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LsnIncrement`(`plsn` : /* Rust *const */ kotlinx.cinterop.CPointer<`CLS_LSN`>?) : `CLS_LSN`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=clfsw32.dll, ABI=system, export=LsnInvalid; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LsnInvalid`(`plsn` : /* Rust *const */ kotlinx.cinterop.CPointer<`CLS_LSN`>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=clfsw32.dll, ABI=system, export=LsnLess; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LsnLess`(`plsn1` : /* Rust *const */ kotlinx.cinterop.CPointer<`CLS_LSN`>?, `plsn2` : /* Rust *const */ kotlinx.cinterop.CPointer<`CLS_LSN`>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=clfsw32.dll, ABI=system, export=LsnNull; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LsnNull`(`plsn` : /* Rust *const */ kotlinx.cinterop.CPointer<`CLS_LSN`>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=clfsw32.dll, ABI=system, export=LsnRecordSequence; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LsnRecordSequence`(`plsn` : /* Rust *const */ kotlinx.cinterop.CPointer<`CLS_LSN`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=MoveFileA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MoveFileA`(`lpexistingfilename` : `windows_sys`.`core`.`PCSTR`, `lpnewfilename` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=MoveFileExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MoveFileExA`(`lpexistingfilename` : `windows_sys`.`core`.`PCSTR`, `lpnewfilename` : `windows_sys`.`core`.`PCSTR`, `dwflags` : `MOVE_FILE_FLAGS`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=MoveFileExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MoveFileExW`(`lpexistingfilename` : `windows_sys`.`core`.`PCWSTR`, `lpnewfilename` : `windows_sys`.`core`.`PCWSTR`, `dwflags` : `MOVE_FILE_FLAGS`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-file-fromapp-l1-1-0.dll, ABI=system, export=MoveFileFromAppW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MoveFileFromAppW`(`lpexistingfilename` : `windows_sys`.`core`.`PCWSTR`, `lpnewfilename` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=MoveFileTransactedA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MoveFileTransactedA`(`lpexistingfilename` : `windows_sys`.`core`.`PCSTR`, `lpnewfilename` : `windows_sys`.`core`.`PCSTR`, `lpprogressroutine` : `LPPROGRESS_ROUTINE`, `lpdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwflags` : `MOVE_FILE_FLAGS`, `htransaction` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=MoveFileTransactedW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MoveFileTransactedW`(`lpexistingfilename` : `windows_sys`.`core`.`PCWSTR`, `lpnewfilename` : `windows_sys`.`core`.`PCWSTR`, `lpprogressroutine` : `LPPROGRESS_ROUTINE`, `lpdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwflags` : `MOVE_FILE_FLAGS`, `htransaction` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=MoveFileW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MoveFileW`(`lpexistingfilename` : `windows_sys`.`core`.`PCWSTR`, `lpnewfilename` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=MoveFileWithProgressA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MoveFileWithProgressA`(`lpexistingfilename` : `windows_sys`.`core`.`PCSTR`, `lpnewfilename` : `windows_sys`.`core`.`PCSTR`, `lpprogressroutine` : `LPPROGRESS_ROUTINE`, `lpdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwflags` : `MOVE_FILE_FLAGS`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=MoveFileWithProgressW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MoveFileWithProgressW`(`lpexistingfilename` : `windows_sys`.`core`.`PCWSTR`, `lpnewfilename` : `windows_sys`.`core`.`PCWSTR`, `lpprogressroutine` : `LPPROGRESS_ROUTINE`, `lpdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwflags` : `MOVE_FILE_FLAGS`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=NetConnectionEnum; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NetConnectionEnum`(`servername` : `windows_sys`.`core`.`PCWSTR`, `qualifier` : `windows_sys`.`core`.`PCWSTR`, `level` : UInt, `bufptr` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, `prefmaxlen` : UInt, `entriesread` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `totalentries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `resume_handle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=NetFileClose; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NetFileClose`(`servername` : `windows_sys`.`core`.`PCWSTR`, `fileid` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=NetFileEnum; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NetFileEnum`(`servername` : `windows_sys`.`core`.`PCWSTR`, `basepath` : `windows_sys`.`core`.`PCWSTR`, `username` : `windows_sys`.`core`.`PCWSTR`, `level` : UInt, `bufptr` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, `prefmaxlen` : UInt, `entriesread` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `totalentries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `resume_handle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=NetFileGetInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NetFileGetInfo`(`servername` : `windows_sys`.`core`.`PCWSTR`, `fileid` : UInt, `level` : UInt, `bufptr` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=NetServerAliasAdd; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NetServerAliasAdd`(`servername` : `windows_sys`.`core`.`PCWSTR`, `level` : UInt, `buf` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=NetServerAliasDel; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NetServerAliasDel`(`servername` : `windows_sys`.`core`.`PCWSTR`, `level` : UInt, `buf` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=NetServerAliasEnum; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NetServerAliasEnum`(`servername` : `windows_sys`.`core`.`PCWSTR`, `level` : UInt, `bufptr` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, `prefmaxlen` : UInt, `entriesread` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `totalentries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `resumehandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=NetSessionDel; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NetSessionDel`(`servername` : `windows_sys`.`core`.`PCWSTR`, `uncclientname` : `windows_sys`.`core`.`PCWSTR`, `username` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=NetSessionEnum; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NetSessionEnum`(`servername` : `windows_sys`.`core`.`PCWSTR`, `uncclientname` : `windows_sys`.`core`.`PCWSTR`, `username` : `windows_sys`.`core`.`PCWSTR`, `level` : UInt, `bufptr` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, `prefmaxlen` : UInt, `entriesread` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `totalentries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `resume_handle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=NetSessionGetInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NetSessionGetInfo`(`servername` : `windows_sys`.`core`.`PCWSTR`, `uncclientname` : `windows_sys`.`core`.`PCWSTR`, `username` : `windows_sys`.`core`.`PCWSTR`, `level` : UInt, `bufptr` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=NetShareAdd; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NetShareAdd`(`servername` : `windows_sys`.`core`.`PCWSTR`, `level` : UInt, `buf` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `parm_err` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=NetShareCheck; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NetShareCheck`(`servername` : `windows_sys`.`core`.`PCWSTR`, `device` : `windows_sys`.`core`.`PCWSTR`, `type` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=NetShareDel; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NetShareDel`(`servername` : `windows_sys`.`core`.`PCWSTR`, `netname` : `windows_sys`.`core`.`PCWSTR`, `reserved` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=NetShareDelEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NetShareDelEx`(`servername` : `windows_sys`.`core`.`PCWSTR`, `level` : UInt, `buf` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=NetShareDelSticky; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NetShareDelSticky`(`servername` : `windows_sys`.`core`.`PCWSTR`, `netname` : `windows_sys`.`core`.`PCWSTR`, `reserved` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=NetShareEnum; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NetShareEnum`(`servername` : `windows_sys`.`core`.`PCWSTR`, `level` : UInt, `bufptr` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, `prefmaxlen` : UInt, `entriesread` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `totalentries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `resume_handle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=NetShareEnumSticky; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NetShareEnumSticky`(`servername` : `windows_sys`.`core`.`PCWSTR`, `level` : UInt, `bufptr` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, `prefmaxlen` : UInt, `entriesread` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `totalentries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `resume_handle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=NetShareGetInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NetShareGetInfo`(`servername` : `windows_sys`.`core`.`PCWSTR`, `netname` : `windows_sys`.`core`.`PCWSTR`, `level` : UInt, `bufptr` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=NetShareSetInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NetShareSetInfo`(`servername` : `windows_sys`.`core`.`PCWSTR`, `netname` : `windows_sys`.`core`.`PCWSTR`, `level` : UInt, `buf` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `parm_err` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=NetStatisticsGet; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NetStatisticsGet`(`servername` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `service` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, `level` : UInt, `options` : UInt, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=OpenEncryptedFileRawA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OpenEncryptedFileRawA`(`lpfilename` : `windows_sys`.`core`.`PCSTR`, `ulflags` : UInt, `pvcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=OpenEncryptedFileRawW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OpenEncryptedFileRawW`(`lpfilename` : `windows_sys`.`core`.`PCWSTR`, `ulflags` : UInt, `pvcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ktmw32.dll, ABI=system, export=OpenEnlistment; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OpenEnlistment`(`dwdesiredaccess` : UInt, `resourcemanagerhandle` : `super`.`super`.`Foundation`.`HANDLE`, `enlistmentid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=OpenFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OpenFile`(`lpfilename` : `windows_sys`.`core`.`PCSTR`, `lpreopenbuff` : /* Rust *mut */ kotlinx.cinterop.CPointer<`OFSTRUCT`>?, `ustyle` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=OpenFileById; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `OpenFileById`(`hvolumehint` : `super`.`super`.`Foundation`.`HANDLE`, `lpfileid` : /* Rust *const */ kotlinx.cinterop.CPointer<`FILE_ID_DESCRIPTOR`>?, `dwdesiredaccess` : UInt, `dwsharemode` : `FILE_SHARE_MODE`, `lpsecurityattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SECURITY_ATTRIBUTES`>?, `dwflagsandattributes` : `FILE_FLAGS_AND_ATTRIBUTES`) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ktmw32.dll, ABI=system, export=OpenResourceManager; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OpenResourceManager`(`dwdesiredaccess` : UInt, `tmhandle` : `super`.`super`.`Foundation`.`HANDLE`, `resourcemanagerid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ktmw32.dll, ABI=system, export=OpenTransaction; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OpenTransaction`(`dwdesiredaccess` : UInt, `transactionid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ktmw32.dll, ABI=system, export=OpenTransactionManager; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OpenTransactionManager`(`logfilename` : `windows_sys`.`core`.`PCWSTR`, `desiredaccess` : UInt, `openoptions` : UInt) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ktmw32.dll, ABI=system, export=OpenTransactionManagerById; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OpenTransactionManagerById`(`transactionmanagerid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `desiredaccess` : UInt, `openoptions` : UInt) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-ioring-l1-1-0.dll, ABI=system, export=PopIoRingCompletion; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PopIoRingCompletion`(`ioring` : `HIORING`, `cqe` : /* Rust *mut */ kotlinx.cinterop.CPointer<`IORING_CQE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ktmw32.dll, ABI=system, export=PrePrepareComplete; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PrePrepareComplete`(`enlistmenthandle` : `super`.`super`.`Foundation`.`HANDLE`, `tmvirtualclock` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ktmw32.dll, ABI=system, export=PrePrepareEnlistment; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PrePrepareEnlistment`(`enlistmenthandle` : `super`.`super`.`Foundation`.`HANDLE`, `tmvirtualclock` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ktmw32.dll, ABI=system, export=PrepareComplete; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PrepareComplete`(`enlistmenthandle` : `super`.`super`.`Foundation`.`HANDLE`, `tmvirtualclock` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ktmw32.dll, ABI=system, export=PrepareEnlistment; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PrepareEnlistment`(`enlistmenthandle` : `super`.`super`.`Foundation`.`HANDLE`, `tmvirtualclock` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=clfsw32.dll, ABI=system, export=PrepareLogArchive; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PrepareLogArchive`(`hlog` : `super`.`super`.`Foundation`.`HANDLE`, `pszbaselogfilename` : `windows_sys`.`core`.`PWSTR`, `clen` : UInt, `plsnlow` : /* Rust *const */ kotlinx.cinterop.CPointer<`CLS_LSN`>?, `plsnhigh` : /* Rust *const */ kotlinx.cinterop.CPointer<`CLS_LSN`>?, `pcactuallength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `poffbaselogfiledata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `pcbbaselogfilelength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `plsnbase` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CLS_LSN`>?, `plsnlast` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CLS_LSN`>?, `plsncurrentarchivetail` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CLS_LSN`>?, `ppvarchivecontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=PrepareTape; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PrepareTape`(`hdevice` : `super`.`super`.`Foundation`.`HANDLE`, `dwoperation` : `PREPARE_TAPE_OPERATION`, `bimmediate` : `windows_sys`.`core`.`BOOL`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=QueryDosDeviceA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `QueryDosDeviceA`(`lpdevicename` : `windows_sys`.`core`.`PCSTR`, `lptargetpath` : `windows_sys`.`core`.`PSTR`, `ucchmax` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=QueryDosDeviceW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `QueryDosDeviceW`(`lpdevicename` : `windows_sys`.`core`.`PCWSTR`, `lptargetpath` : `windows_sys`.`core`.`PWSTR`, `ucchmax` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-ioring-l1-1-0.dll, ABI=system, export=QueryIoRingCapabilities; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `QueryIoRingCapabilities`(`capabilities` : /* Rust *mut */ kotlinx.cinterop.CPointer<`IORING_CAPABILITIES`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=clfsw32.dll, ABI=system, export=QueryLogPolicy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `QueryLogPolicy`(`hlog` : `super`.`super`.`Foundation`.`HANDLE`, `epolicytype` : `CLFS_MGMT_POLICY_TYPE`, `ppolicybuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CLFS_MGMT_POLICY`>?, `pcbpolicybuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=QueryRecoveryAgentsOnEncryptedFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `QueryRecoveryAgentsOnEncryptedFile`(`lpfilename` : `windows_sys`.`core`.`PCWSTR`, `precoveryagents` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`ENCRYPTION_CERTIFICATE_HASH_LIST`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=QueryUsersOnEncryptedFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `QueryUsersOnEncryptedFile`(`lpfilename` : `windows_sys`.`core`.`PCWSTR`, `pusers` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`ENCRYPTION_CERTIFICATE_HASH_LIST`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=ReOpenFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ReOpenFile`(`horiginalfile` : `super`.`super`.`Foundation`.`HANDLE`, `dwdesiredaccess` : UInt, `dwsharemode` : `FILE_SHARE_MODE`, `dwflagsandattributes` : `FILE_FLAGS_AND_ATTRIBUTES`) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=ReadDirectoryChangesExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `ReadDirectoryChangesExW`(`hdirectory` : `super`.`super`.`Foundation`.`HANDLE`, `lpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `nbufferlength` : UInt, `bwatchsubtree` : `windows_sys`.`core`.`BOOL`, `dwnotifyfilter` : `FILE_NOTIFY_CHANGE`, `lpbytesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpoverlapped` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?, `lpcompletionroutine` : `super`.`super`.`System`.`IO`.`LPOVERLAPPED_COMPLETION_ROUTINE`, `readdirectorynotifyinformationclass` : `READ_DIRECTORY_NOTIFY_INFORMATION_CLASS`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=ReadDirectoryChangesW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `ReadDirectoryChangesW`(`hdirectory` : `super`.`super`.`Foundation`.`HANDLE`, `lpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `nbufferlength` : UInt, `bwatchsubtree` : `windows_sys`.`core`.`BOOL`, `dwnotifyfilter` : `FILE_NOTIFY_CHANGE`, `lpbytesreturned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpoverlapped` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?, `lpcompletionroutine` : `super`.`super`.`System`.`IO`.`LPOVERLAPPED_COMPLETION_ROUTINE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=ReadEncryptedFileRaw; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ReadEncryptedFileRaw`(`pfexportcallback` : `PFE_EXPORT_FUNC`, `pvcallbackcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pvcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=ReadFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `ReadFile`(`hfile` : `super`.`super`.`Foundation`.`HANDLE`, `lpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `nnumberofbytestoread` : UInt, `lpnumberofbytesread` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpoverlapped` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=ReadFileEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `ReadFileEx`(`hfile` : `super`.`super`.`Foundation`.`HANDLE`, `lpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `nnumberofbytestoread` : UInt, `lpoverlapped` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?, `lpcompletionroutine` : `super`.`super`.`System`.`IO`.`LPOVERLAPPED_COMPLETION_ROUTINE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=ReadFileScatter; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `ReadFileScatter`(`hfile` : `super`.`super`.`Foundation`.`HANDLE`, `asegmentarray` : /* Rust *const */ kotlinx.cinterop.CPointer<`FILE_SEGMENT_ELEMENT`>?, `nnumberofbytestoread` : UInt, `lpreserved` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpoverlapped` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=clfsw32.dll, ABI=system, export=ReadLogArchiveMetadata; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ReadLogArchiveMetadata`(`pvarchivecontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cboffset` : UInt, `cbbytestoread` : UInt, `pbreadbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pcbbytesread` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=clfsw32.dll, ABI=system, export=ReadLogNotification; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `ReadLogNotification`(`hlog` : `super`.`super`.`Foundation`.`HANDLE`, `pnotification` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CLFS_MGMT_NOTIFICATION`>?, `lpoverlapped` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=clfsw32.dll, ABI=system, export=ReadLogRecord; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `ReadLogRecord`(`pvmarshal` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `plsnfirst` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CLS_LSN`>?, `econtextmode` : `CLFS_CONTEXT_MODE`, `ppvreadbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `pcbreadbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `perecordtype` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `plsnundonext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CLS_LSN`>?, `plsnprevious` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CLS_LSN`>?, `ppvreadcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `poverlapped` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=clfsw32.dll, ABI=system, export=ReadLogRestartArea; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `ReadLogRestartArea`(`pvmarshal` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppvrestartbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `pcbrestartbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `plsn` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CLS_LSN`>?, `ppvcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `poverlapped` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=clfsw32.dll, ABI=system, export=ReadNextLogRecord; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `ReadNextLogRecord`(`pvreadcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppvbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `pcbbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `perecordtype` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `plsnuser` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CLS_LSN`>?, `plsnundonext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CLS_LSN`>?, `plsnprevious` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CLS_LSN`>?, `plsnrecord` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CLS_LSN`>?, `poverlapped` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ktmw32.dll, ABI=system, export=ReadOnlyEnlistment; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ReadOnlyEnlistment`(`enlistmenthandle` : `super`.`super`.`Foundation`.`HANDLE`, `tmvirtualclock` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=clfsw32.dll, ABI=system, export=ReadPreviousLogRestartArea; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `ReadPreviousLogRestartArea`(`pvreadcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppvrestartbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `pcbrestartbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `plsnrestart` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CLS_LSN`>?, `poverlapped` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ktmw32.dll, ABI=system, export=RecoverEnlistment; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RecoverEnlistment`(`enlistmenthandle` : `super`.`super`.`Foundation`.`HANDLE`, `enlistmentkey` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ktmw32.dll, ABI=system, export=RecoverResourceManager; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RecoverResourceManager`(`resourcemanagerhandle` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ktmw32.dll, ABI=system, export=RecoverTransactionManager; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RecoverTransactionManager`(`transactionmanagerhandle` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=clfsw32.dll, ABI=system, export=RegisterForLogWriteNotification; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegisterForLogWriteNotification`(`hlog` : `super`.`super`.`Foundation`.`HANDLE`, `cbthreshold` : UInt, `fenable` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=clfsw32.dll, ABI=system, export=RegisterManageableLogClient; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegisterManageableLogClient`(`hlog` : `super`.`super`.`Foundation`.`HANDLE`, `pcallbacks` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LOG_MANAGEMENT_CALLBACKS`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=RemoveDirectoryA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RemoveDirectoryA`(`lppathname` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-file-fromapp-l1-1-0.dll, ABI=system, export=RemoveDirectoryFromAppW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RemoveDirectoryFromAppW`(`lppathname` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=RemoveDirectoryTransactedA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RemoveDirectoryTransactedA`(`lppathname` : `windows_sys`.`core`.`PCSTR`, `htransaction` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=RemoveDirectoryTransactedW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RemoveDirectoryTransactedW`(`lppathname` : `windows_sys`.`core`.`PCWSTR`, `htransaction` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=RemoveDirectoryW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RemoveDirectoryW`(`lppathname` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=clfsw32.dll, ABI=system, export=RemoveLogContainer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RemoveLogContainer`(`hlog` : `super`.`super`.`Foundation`.`HANDLE`, `pwszcontainerpath` : `windows_sys`.`core`.`PCWSTR`, `fforce` : `windows_sys`.`core`.`BOOL`, `preserved` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=clfsw32.dll, ABI=system, export=RemoveLogContainerSet; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RemoveLogContainerSet`(`hlog` : `super`.`super`.`Foundation`.`HANDLE`, `ccontainer` : UShort, `rgwszcontainerpath` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCWSTR`>?, `fforce` : `windows_sys`.`core`.`BOOL`, `preserved` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=clfsw32.dll, ABI=system, export=RemoveLogPolicy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RemoveLogPolicy`(`hlog` : `super`.`super`.`Foundation`.`HANDLE`, `epolicytype` : `CLFS_MGMT_POLICY_TYPE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RemoveUsersFromEncryptedFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `RemoveUsersFromEncryptedFile`(`lpfilename` : `windows_sys`.`core`.`PCWSTR`, `phashes` : /* Rust *const */ kotlinx.cinterop.CPointer<`ENCRYPTION_CERTIFICATE_HASH_LIST`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ktmw32.dll, ABI=system, export=RenameTransactionManager; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RenameTransactionManager`(`logfilename` : `windows_sys`.`core`.`PCWSTR`, `existingtransactionmanagerguid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=ReplaceFileA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ReplaceFileA`(`lpreplacedfilename` : `windows_sys`.`core`.`PCSTR`, `lpreplacementfilename` : `windows_sys`.`core`.`PCSTR`, `lpbackupfilename` : `windows_sys`.`core`.`PCSTR`, `dwreplaceflags` : `REPLACE_FILE_FLAGS`, `lpexclude` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpreserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-file-fromapp-l1-1-0.dll, ABI=system, export=ReplaceFileFromAppW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ReplaceFileFromAppW`(`lpreplacedfilename` : `windows_sys`.`core`.`PCWSTR`, `lpreplacementfilename` : `windows_sys`.`core`.`PCWSTR`, `lpbackupfilename` : `windows_sys`.`core`.`PCWSTR`, `dwreplaceflags` : UInt, `lpexclude` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpreserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=ReplaceFileW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ReplaceFileW`(`lpreplacedfilename` : `windows_sys`.`core`.`PCWSTR`, `lpreplacementfilename` : `windows_sys`.`core`.`PCWSTR`, `lpbackupfilename` : `windows_sys`.`core`.`PCWSTR`, `dwreplaceflags` : `REPLACE_FILE_FLAGS`, `lpexclude` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpreserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=clfsw32.dll, ABI=system, export=ReserveAndAppendLog; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `ReserveAndAppendLog`(`pvmarshal` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `rgwriteentries` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CLS_WRITE_ENTRY`>?, `cwriteentries` : UInt, `plsnundonext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CLS_LSN`>?, `plsnprevious` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CLS_LSN`>?, `creserverecords` : UInt, `rgcbreservation` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, `fflags` : `CLFS_FLAG`, `plsn` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CLS_LSN`>?, `poverlapped` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=clfsw32.dll, ABI=system, export=ReserveAndAppendLogAligned; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `ReserveAndAppendLogAligned`(`pvmarshal` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `rgwriteentries` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CLS_WRITE_ENTRY`>?, `cwriteentries` : UInt, `cbentryalignment` : UInt, `plsnundonext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CLS_LSN`>?, `plsnprevious` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CLS_LSN`>?, `creserverecords` : UInt, `rgcbreservation` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, `fflags` : `CLFS_FLAG`, `plsn` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CLS_LSN`>?, `poverlapped` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ktmw32.dll, ABI=system, export=RollbackComplete; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RollbackComplete`(`enlistmenthandle` : `super`.`super`.`Foundation`.`HANDLE`, `tmvirtualclock` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ktmw32.dll, ABI=system, export=RollbackEnlistment; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RollbackEnlistment`(`enlistmenthandle` : `super`.`super`.`Foundation`.`HANDLE`, `tmvirtualclock` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ktmw32.dll, ABI=system, export=RollbackTransaction; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RollbackTransaction`(`transactionhandle` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ktmw32.dll, ABI=system, export=RollbackTransactionAsync; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RollbackTransactionAsync`(`transactionhandle` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ktmw32.dll, ABI=system, export=RollforwardTransactionManager; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RollforwardTransactionManager`(`transactionmanagerhandle` : `super`.`super`.`Foundation`.`HANDLE`, `tmvirtualclock` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=clfsw32.dll, ABI=system, export=ScanLogContainers; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ScanLogContainers`(`pcxscan` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CLS_SCAN_CONTEXT`>?, `escanmode` : UByte, `preserved` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=SearchPathA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SearchPathA`(`lppath` : `windows_sys`.`core`.`PCSTR`, `lpfilename` : `windows_sys`.`core`.`PCSTR`, `lpextension` : `windows_sys`.`core`.`PCSTR`, `nbufferlength` : UInt, `lpbuffer` : `windows_sys`.`core`.`PSTR`, `lpfilepart` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PSTR`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=SearchPathW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SearchPathW`(`lppath` : `windows_sys`.`core`.`PCWSTR`, `lpfilename` : `windows_sys`.`core`.`PCWSTR`, `lpextension` : `windows_sys`.`core`.`PCWSTR`, `nbufferlength` : UInt, `lpbuffer` : `windows_sys`.`core`.`PWSTR`, `lpfilepart` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=SetEncryptedFileMetadata; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `SetEncryptedFileMetadata`(`lpfilename` : `windows_sys`.`core`.`PCWSTR`, `pboldmetadata` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pbnewmetadata` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `pownerhash` : /* Rust *const */ kotlinx.cinterop.CPointer<`ENCRYPTION_CERTIFICATE_HASH`>?, `dwoperation` : UInt, `pcertificatesadded` : /* Rust *const */ kotlinx.cinterop.CPointer<`ENCRYPTION_CERTIFICATE_HASH_LIST`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=SetEndOfFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetEndOfFile`(`hfile` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=clfsw32.dll, ABI=system, export=SetEndOfLog; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `SetEndOfLog`(`hlog` : `super`.`super`.`Foundation`.`HANDLE`, `plsnend` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CLS_LSN`>?, `lpoverlapped` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ktmw32.dll, ABI=system, export=SetEnlistmentRecoveryInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetEnlistmentRecoveryInformation`(`enlistmenthandle` : `super`.`super`.`Foundation`.`HANDLE`, `buffersize` : UInt, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=SetFileApisToANSI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetFileApisToANSI`()
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=SetFileApisToOEM; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetFileApisToOEM`()
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=SetFileAttributesA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetFileAttributesA`(`lpfilename` : `windows_sys`.`core`.`PCSTR`, `dwfileattributes` : `FILE_FLAGS_AND_ATTRIBUTES`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-file-fromapp-l1-1-0.dll, ABI=system, export=SetFileAttributesFromAppW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetFileAttributesFromAppW`(`lpfilename` : `windows_sys`.`core`.`PCWSTR`, `dwfileattributes` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=SetFileAttributesTransactedA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetFileAttributesTransactedA`(`lpfilename` : `windows_sys`.`core`.`PCSTR`, `dwfileattributes` : UInt, `htransaction` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=SetFileAttributesTransactedW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetFileAttributesTransactedW`(`lpfilename` : `windows_sys`.`core`.`PCWSTR`, `dwfileattributes` : UInt, `htransaction` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=SetFileAttributesW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetFileAttributesW`(`lpfilename` : `windows_sys`.`core`.`PCWSTR`, `dwfileattributes` : `FILE_FLAGS_AND_ATTRIBUTES`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=SetFileBandwidthReservation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetFileBandwidthReservation`(`hfile` : `super`.`super`.`Foundation`.`HANDLE`, `nperiodmilliseconds` : UInt, `nbytesperperiod` : UInt, `bdiscardable` : `windows_sys`.`core`.`BOOL`, `lptransfersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpnumoutstandingrequests` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=SetFileCompletionNotificationModes; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetFileCompletionNotificationModes`(`filehandle` : `super`.`super`.`Foundation`.`HANDLE`, `flags` : UByte) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=SetFileInformationByHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetFileInformationByHandle`(`hfile` : `super`.`super`.`Foundation`.`HANDLE`, `fileinformationclass` : `FILE_INFO_BY_HANDLE_CLASS`, `lpfileinformation` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwbuffersize` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=SetFileIoOverlappedRange; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetFileIoOverlappedRange`(`filehandle` : `super`.`super`.`Foundation`.`HANDLE`, `overlappedrangestart` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `length` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=SetFilePointer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetFilePointer`(`hfile` : `super`.`super`.`Foundation`.`HANDLE`, `ldistancetomove` : Int, `lpdistancetomovehigh` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `dwmovemethod` : `SET_FILE_POINTER_MOVE_METHOD`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=SetFilePointerEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetFilePointerEx`(`hfile` : `super`.`super`.`Foundation`.`HANDLE`, `lidistancetomove` : Long, `lpnewfilepointer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, `dwmovemethod` : `SET_FILE_POINTER_MOVE_METHOD`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=SetFileShortNameA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetFileShortNameA`(`hfile` : `super`.`super`.`Foundation`.`HANDLE`, `lpshortname` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=SetFileShortNameW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetFileShortNameW`(`hfile` : `super`.`super`.`Foundation`.`HANDLE`, `lpshortname` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=SetFileTime; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetFileTime`(`hfile` : `super`.`super`.`Foundation`.`HANDLE`, `lpcreationtime` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`FILETIME`>?, `lplastaccesstime` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`FILETIME`>?, `lplastwritetime` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`FILETIME`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=SetFileValidData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetFileValidData`(`hfile` : `super`.`super`.`Foundation`.`HANDLE`, `validdatalength` : Long) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-ioring-l1-1-0.dll, ABI=system, export=SetIoRingCompletionEvent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetIoRingCompletionEvent`(`ioring` : `HIORING`, `hevent` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=clfsw32.dll, ABI=system, export=SetLogArchiveMode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetLogArchiveMode`(`hlog` : `super`.`super`.`Foundation`.`HANDLE`, `emode` : `CLFS_LOG_ARCHIVE_MODE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=clfsw32.dll, ABI=system, export=SetLogArchiveTail; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetLogArchiveTail`(`hlog` : `super`.`super`.`Foundation`.`HANDLE`, `plsnarchivetail` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CLS_LSN`>?, `preserved` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=clfsw32.dll, ABI=system, export=SetLogFileSizeWithPolicy; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetLogFileSizeWithPolicy`(`hlog` : `super`.`super`.`Foundation`.`HANDLE`, `pdesiredsize` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `presultingsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ktmw32.dll, ABI=system, export=SetResourceManagerCompletionPort; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetResourceManagerCompletionPort`(`resourcemanagerhandle` : `super`.`super`.`Foundation`.`HANDLE`, `iocompletionporthandle` : `super`.`super`.`Foundation`.`HANDLE`, `completionkey` : ULong) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=SetSearchPathMode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetSearchPathMode`(`flags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=SetTapeParameters; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetTapeParameters`(`hdevice` : `super`.`super`.`Foundation`.`HANDLE`, `dwoperation` : `TAPE_INFORMATION_TYPE`, `lptapeinformation` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=SetTapePosition; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetTapePosition`(`hdevice` : `super`.`super`.`Foundation`.`HANDLE`, `dwpositionmethod` : `TAPE_POSITION_METHOD`, `dwpartition` : UInt, `dwoffsetlow` : UInt, `dwoffsethigh` : UInt, `bimmediate` : `windows_sys`.`core`.`BOOL`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ktmw32.dll, ABI=system, export=SetTransactionInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetTransactionInformation`(`transactionhandle` : `super`.`super`.`Foundation`.`HANDLE`, `isolationlevel` : UInt, `isolationflags` : UInt, `timeout` : UInt, `description` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=SetUserFileEncryptionKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `SetUserFileEncryptionKey`(`pencryptioncertificate` : /* Rust *const */ kotlinx.cinterop.CPointer<`ENCRYPTION_CERTIFICATE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=SetUserFileEncryptionKeyEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `SetUserFileEncryptionKeyEx`(`pencryptioncertificate` : /* Rust *const */ kotlinx.cinterop.CPointer<`ENCRYPTION_CERTIFICATE`>?, `dwcapabilities` : UInt, `dwflags` : UInt, `pvreserved` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=SetVolumeLabelA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetVolumeLabelA`(`lprootpathname` : `windows_sys`.`core`.`PCSTR`, `lpvolumename` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=SetVolumeLabelW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetVolumeLabelW`(`lprootpathname` : `windows_sys`.`core`.`PCWSTR`, `lpvolumename` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=SetVolumeMountPointA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetVolumeMountPointA`(`lpszvolumemountpoint` : `windows_sys`.`core`.`PCSTR`, `lpszvolumename` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=SetVolumeMountPointW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetVolumeMountPointW`(`lpszvolumemountpoint` : `windows_sys`.`core`.`PCWSTR`, `lpszvolumename` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ktmw32.dll, ABI=system, export=SinglePhaseReject; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SinglePhaseReject`(`enlistmenthandle` : `super`.`super`.`Foundation`.`HANDLE`, `tmvirtualclock` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-core-ioring-l1-1-0.dll, ABI=system, export=SubmitIoRing; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SubmitIoRing`(`ioring` : `HIORING`, `waitoperations` : UInt, `milliseconds` : UInt, `submittedentries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=clfsw32.dll, ABI=system, export=TerminateLogArchive; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TerminateLogArchive`(`pvarchivecontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=clfsw32.dll, ABI=system, export=TerminateReadLog; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TerminateReadLog`(`pvcursorcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=clfsw32.dll, ABI=system, export=TruncateLog; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `TruncateLog`(`pvmarshal` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `plsnend` : /* Rust *const */ kotlinx.cinterop.CPointer<`CLS_LSN`>?, `lpoverlapped` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=txfw32.dll, ABI=system, export=TxfGetThreadMiniVersionForCreate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TxfGetThreadMiniVersionForCreate`(`miniversion` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=txfw32.dll, ABI=system, export=TxfLogCreateFileReadContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TxfLogCreateFileReadContext`(`logpath` : `windows_sys`.`core`.`PCWSTR`, `beginninglsn` : `CLS_LSN`, `endinglsn` : `CLS_LSN`, `txffileid` : /* Rust *const */ kotlinx.cinterop.CPointer<`TXF_ID`>?, `txflogcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=txfw32.dll, ABI=system, export=TxfLogCreateRangeReadContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TxfLogCreateRangeReadContext`(`logpath` : `windows_sys`.`core`.`PCWSTR`, `beginninglsn` : `CLS_LSN`, `endinglsn` : `CLS_LSN`, `beginningvirtualclock` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, `endingvirtualclock` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, `recordtypemask` : UInt, `txflogcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=txfw32.dll, ABI=system, export=TxfLogDestroyReadContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TxfLogDestroyReadContext`(`txflogcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=txfw32.dll, ABI=system, export=TxfLogReadRecords; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TxfLogReadRecords`(`txflogcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `bufferlength` : UInt, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `bytesused` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `recordcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=txfw32.dll, ABI=system, export=TxfLogRecordGetFileName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TxfLogRecordGetFileName`(`recordbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `recordbufferlengthinbytes` : UInt, `namebuffer` : `windows_sys`.`core`.`PWSTR`, `namebufferlengthinbytes` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `txfid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`TXF_ID`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=txfw32.dll, ABI=system, export=TxfLogRecordGetGenericType; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TxfLogRecordGetGenericType`(`recordbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `recordbufferlengthinbytes` : UInt, `generictype` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `virtualclock` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=txfw32.dll, ABI=system, export=TxfReadMetadataInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TxfReadMetadataInfo`(`filehandle` : `super`.`super`.`Foundation`.`HANDLE`, `txffileid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`TXF_ID`>?, `lastlsn` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CLS_LSN`>?, `transactionstate` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lockingtransaction` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=txfw32.dll, ABI=system, export=TxfSetThreadMiniVersionForCreate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TxfSetThreadMiniVersionForCreate`(`miniversion` : UShort)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=UnlockFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UnlockFile`(`hfile` : `super`.`super`.`Foundation`.`HANDLE`, `dwfileoffsetlow` : UInt, `dwfileoffsethigh` : UInt, `nnumberofbytestounlocklow` : UInt, `nnumberofbytestounlockhigh` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=UnlockFileEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `UnlockFileEx`(`hfile` : `super`.`super`.`Foundation`.`HANDLE`, `dwreserved` : UInt, `nnumberofbytestounlocklow` : UInt, `nnumberofbytestounlockhigh` : UInt, `lpoverlapped` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=clfsw32.dll, ABI=system, export=ValidateLog; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `ValidateLog`(`pszlogfilename` : `windows_sys`.`core`.`PCWSTR`, `psalogfile` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SECURITY_ATTRIBUTES`>?, `pinfobuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CLS_INFORMATION`>?, `pcbbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=version.dll, ABI=system, export=VerFindFileA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VerFindFileA`(`uflags` : `VER_FIND_FILE_FLAGS`, `szfilename` : `windows_sys`.`core`.`PCSTR`, `szwindir` : `windows_sys`.`core`.`PCSTR`, `szappdir` : `windows_sys`.`core`.`PCSTR`, `szcurdir` : `windows_sys`.`core`.`PSTR`, `pucurdirlen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `szdestdir` : `windows_sys`.`core`.`PSTR`, `pudestdirlen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `VER_FIND_FILE_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=version.dll, ABI=system, export=VerFindFileW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VerFindFileW`(`uflags` : `VER_FIND_FILE_FLAGS`, `szfilename` : `windows_sys`.`core`.`PCWSTR`, `szwindir` : `windows_sys`.`core`.`PCWSTR`, `szappdir` : `windows_sys`.`core`.`PCWSTR`, `szcurdir` : `windows_sys`.`core`.`PWSTR`, `pucurdirlen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `szdestdir` : `windows_sys`.`core`.`PWSTR`, `pudestdirlen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `VER_FIND_FILE_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=version.dll, ABI=system, export=VerInstallFileA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VerInstallFileA`(`uflags` : `VER_INSTALL_FILE_FLAGS`, `szsrcfilename` : `windows_sys`.`core`.`PCSTR`, `szdestfilename` : `windows_sys`.`core`.`PCSTR`, `szsrcdir` : `windows_sys`.`core`.`PCSTR`, `szdestdir` : `windows_sys`.`core`.`PCSTR`, `szcurdir` : `windows_sys`.`core`.`PCSTR`, `sztmpfile` : `windows_sys`.`core`.`PSTR`, `putmpfilelen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `VER_INSTALL_FILE_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=version.dll, ABI=system, export=VerInstallFileW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VerInstallFileW`(`uflags` : `VER_INSTALL_FILE_FLAGS`, `szsrcfilename` : `windows_sys`.`core`.`PCWSTR`, `szdestfilename` : `windows_sys`.`core`.`PCWSTR`, `szsrcdir` : `windows_sys`.`core`.`PCWSTR`, `szdestdir` : `windows_sys`.`core`.`PCWSTR`, `szcurdir` : `windows_sys`.`core`.`PCWSTR`, `sztmpfile` : `windows_sys`.`core`.`PWSTR`, `putmpfilelen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `VER_INSTALL_FILE_STATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=VerLanguageNameA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VerLanguageNameA`(`wlang` : UInt, `szlang` : `windows_sys`.`core`.`PSTR`, `cchlang` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=VerLanguageNameW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VerLanguageNameW`(`wlang` : UInt, `szlang` : `windows_sys`.`core`.`PWSTR`, `cchlang` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=version.dll, ABI=system, export=VerQueryValueA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VerQueryValueA`(`pblock` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpsubblock` : `windows_sys`.`core`.`PCSTR`, `lplpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `pulen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=version.dll, ABI=system, export=VerQueryValueW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VerQueryValueW`(`pblock` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `lpsubblock` : `windows_sys`.`core`.`PCWSTR`, `lplpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `pulen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wofutil.dll, ABI=system, export=WofEnumEntries; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WofEnumEntries`(`volumename` : `windows_sys`.`core`.`PCWSTR`, `provider` : UInt, `enumproc` : `WofEnumEntryProc`, `userdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wofutil.dll, ABI=system, export=WofFileEnumFiles; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WofFileEnumFiles`(`volumename` : `windows_sys`.`core`.`PCWSTR`, `algorithm` : UInt, `enumproc` : `WofEnumFilesProc`, `userdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wofutil.dll, ABI=system, export=WofGetDriverVersion; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WofGetDriverVersion`(`fileorvolumehandle` : `super`.`super`.`Foundation`.`HANDLE`, `provider` : UInt, `wofversion` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wofutil.dll, ABI=system, export=WofIsExternalFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WofIsExternalFile`(`filepath` : `windows_sys`.`core`.`PCWSTR`, `isexternalfile` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?, `provider` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `externalfileinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `bufferlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wofutil.dll, ABI=system, export=WofSetFileDataLocation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WofSetFileDataLocation`(`filehandle` : `super`.`super`.`Foundation`.`HANDLE`, `provider` : UInt, `externalfileinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `length` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wofutil.dll, ABI=system, export=WofShouldCompressBinaries; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WofShouldCompressBinaries`(`volume` : `windows_sys`.`core`.`PCWSTR`, `algorithm` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wofutil.dll, ABI=system, export=WofWimAddEntry; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WofWimAddEntry`(`volumename` : `windows_sys`.`core`.`PCWSTR`, `wimpath` : `windows_sys`.`core`.`PCWSTR`, `wimtype` : UInt, `wimindex` : UInt, `datasourceid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wofutil.dll, ABI=system, export=WofWimEnumFiles; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WofWimEnumFiles`(`volumename` : `windows_sys`.`core`.`PCWSTR`, `datasourceid` : Long, `enumproc` : `WofEnumFilesProc`, `userdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wofutil.dll, ABI=system, export=WofWimRemoveEntry; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WofWimRemoveEntry`(`volumename` : `windows_sys`.`core`.`PCWSTR`, `datasourceid` : Long) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wofutil.dll, ABI=system, export=WofWimSuspendEntry; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WofWimSuspendEntry`(`volumename` : `windows_sys`.`core`.`PCWSTR`, `datasourceid` : Long) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wofutil.dll, ABI=system, export=WofWimUpdateEntry; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WofWimUpdateEntry`(`volumename` : `windows_sys`.`core`.`PCWSTR`, `datasourceid` : Long, `newwimpath` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=Wow64DisableWow64FsRedirection; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `Wow64DisableWow64FsRedirection`(`oldvalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=Wow64EnableWow64FsRedirection; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `Wow64EnableWow64FsRedirection`(`wow64fsenableredirection` : Boolean) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=Wow64RevertWow64FsRedirection; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `Wow64RevertWow64FsRedirection`(`olvalue` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=WriteEncryptedFileRaw; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WriteEncryptedFileRaw`(`pfimportcallback` : `PFE_IMPORT_FUNC`, `pvcallbackcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pvcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=WriteFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `WriteFile`(`hfile` : `super`.`super`.`Foundation`.`HANDLE`, `lpbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `nnumberofbytestowrite` : UInt, `lpnumberofbyteswritten` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpoverlapped` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=WriteFileEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `WriteFileEx`(`hfile` : `super`.`super`.`Foundation`.`HANDLE`, `lpbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `nnumberofbytestowrite` : UInt, `lpoverlapped` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?, `lpcompletionroutine` : `super`.`super`.`System`.`IO`.`LPOVERLAPPED_COMPLETION_ROUTINE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=WriteFileGather; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `WriteFileGather`(`hfile` : `super`.`super`.`Foundation`.`HANDLE`, `asegmentarray` : /* Rust *const */ kotlinx.cinterop.CPointer<`FILE_SEGMENT_ELEMENT`>?, `nnumberofbytestowrite` : UInt, `lpreserved` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `lpoverlapped` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=clfsw32.dll, ABI=system, export=WriteLogRestartArea; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `WriteLogRestartArea`(`pvmarshal` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `pvrestartbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbrestartbuffer` : UInt, `plsnbase` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CLS_LSN`>?, `fflags` : `CLFS_FLAG`, `pcbwritten` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `plsnnext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CLS_LSN`>?, `poverlapped` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=WriteTapemark; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WriteTapemark`(`hdevice` : `super`.`super`.`Foundation`.`HANDLE`, `dwtapemarktype` : `TAPEMARK_TYPE`, `dwtapemarkcount` : UInt, `bimmediate` : `windows_sys`.`core`.`BOOL`) : UInt
public const val `ACCESS_ALL`: `SHARE_INFO_PERMISSIONS` = 32768u;
public const val `ACCESS_ATRIB`: `SHARE_INFO_PERMISSIONS` = 32u;
public const val `ACCESS_CREATE`: `SHARE_INFO_PERMISSIONS` = 4u;
public const val `ACCESS_DELETE`: `SHARE_INFO_PERMISSIONS` = 16u;
public const val `ACCESS_EXEC`: `SHARE_INFO_PERMISSIONS` = 8u;
public const val `ACCESS_PERM`: `SHARE_INFO_PERMISSIONS` = 64u;
public const val `ACCESS_READ`: `SHARE_INFO_PERMISSIONS` = 1u;
public const val `ACCESS_WRITE`: `SHARE_INFO_PERMISSIONS` = 2u;
public const val `BACKUP_ALTERNATE_DATA`: `WIN_STREAM_ID` = 4u;
public const val `BACKUP_DATA`: `WIN_STREAM_ID` = 1u;
public const val `BACKUP_EA_DATA`: `WIN_STREAM_ID` = 2u;
public const val `BACKUP_LINK`: `WIN_STREAM_ID` = 5u;
public const val `BACKUP_OBJECT_ID`: `WIN_STREAM_ID` = 7u;
public const val `BACKUP_PROPERTY_DATA`: `WIN_STREAM_ID` = 6u;
public const val `BACKUP_REPARSE_DATA`: `WIN_STREAM_ID` = 8u;
public const val `BACKUP_SECURITY_DATA`: `WIN_STREAM_ID` = 3u;
public const val `BACKUP_SPARSE_BLOCK`: `WIN_STREAM_ID` = 9u;
public const val `BACKUP_TXFS_DATA`: `WIN_STREAM_ID` = 10u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `BY_HANDLE_FILE_INFORMATION` (
    public var `dwFileAttributes`: UInt,
    public var `ftCreationTime`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `ftLastAccessTime`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `ftLastWriteTime`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `dwVolumeSerialNumber`: UInt,
    public var `nFileSizeHigh`: UInt,
    public var `nFileSizeLow`: UInt,
    public var `nNumberOfLinks`: UInt,
    public var `nFileIndexHigh`: UInt,
    public var `nFileIndexLow`: UInt,
)
public const val `BusType1394`: `STORAGE_BUS_TYPE` = 4;
public const val `BusTypeAta`: `STORAGE_BUS_TYPE` = 3;
public const val `BusTypeAtapi`: `STORAGE_BUS_TYPE` = 2;
public const val `BusTypeFibre`: `STORAGE_BUS_TYPE` = 6;
public const val `BusTypeFileBackedVirtual`: `STORAGE_BUS_TYPE` = 15;
public const val `BusTypeMax`: `STORAGE_BUS_TYPE` = 20;
public const val `BusTypeMaxReserved`: `STORAGE_BUS_TYPE` = 127;
public const val `BusTypeMmc`: `STORAGE_BUS_TYPE` = 13;
public const val `BusTypeNvme`: `STORAGE_BUS_TYPE` = 17;
public const val `BusTypeRAID`: `STORAGE_BUS_TYPE` = 8;
public const val `BusTypeSCM`: `STORAGE_BUS_TYPE` = 18;
public const val `BusTypeSas`: `STORAGE_BUS_TYPE` = 10;
public const val `BusTypeSata`: `STORAGE_BUS_TYPE` = 11;
public const val `BusTypeScsi`: `STORAGE_BUS_TYPE` = 1;
public const val `BusTypeSd`: `STORAGE_BUS_TYPE` = 12;
public const val `BusTypeSpaces`: `STORAGE_BUS_TYPE` = 16;
public const val `BusTypeSsa`: `STORAGE_BUS_TYPE` = 5;
public const val `BusTypeUfs`: `STORAGE_BUS_TYPE` = 19;
public const val `BusTypeUnknown`: `STORAGE_BUS_TYPE` = 0;
public const val `BusTypeUsb`: `STORAGE_BUS_TYPE` = 7;
public const val `BusTypeVirtual`: `STORAGE_BUS_TYPE` = 14;
public const val `BusTypeiScsi`: `STORAGE_BUS_TYPE` = 9;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public typealias `CACHE_ACCESS_CHECK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Security`.`PSECURITY_DESCRIPTOR`, `super`.`super`.`Foundation`.`HANDLE`, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`GENERIC_MAPPING`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`PRIVILEGE_SET`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `CACHE_DESTROY_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `CACHE_KEY_COMPARE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `CACHE_KEY_HASH` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, UInt) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `CACHE_READ_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`BOOL`>>>;
public const val `CALLBACK_CHUNK_FINISHED`: `LPPROGRESS_ROUTINE_CALLBACK_REASON` = 0u;
public const val `CALLBACK_STREAM_SWITCH`: `LPPROGRESS_ROUTINE_CALLBACK_REASON` = 1u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `CLAIMMEDIALABEL` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`MediaLabelInfo`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `CLAIMMEDIALABELEX` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`MediaLabelInfo`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) -> UInt>>>;
// UNSUPPORTED Rust 536:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const CLFS_BASELOG_EXTENSION: windows_sys::core::PCWSTR = windows_sys::core::w!(".blf");

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `CLFS_BLOCK_ALLOCATION` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `CLFS_BLOCK_DEALLOCATION` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// UNSUPPORTED Rust 539:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const CLFS_CONTAINER_RELATIVE_PREFIX: windows_sys::core::PCWSTR = windows_sys::core::w!("%BLF%\\");

// UNSUPPORTED Rust 540:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const CLFS_CONTAINER_STREAM_PREFIX: windows_sys::core::PCWSTR = windows_sys::core::w!("%BLF%:");

public typealias `CLFS_CONTEXT_MODE` = Int;
public typealias `CLFS_FLAG` = UInt;
public const val `CLFS_FLAG_FILTER_INTERMEDIATE_LEVEL`: UInt = 16u;
public const val `CLFS_FLAG_FILTER_TOP_LEVEL`: UInt = 32u;
public const val `CLFS_FLAG_FORCE_APPEND`: `CLFS_FLAG` = 1u;
public const val `CLFS_FLAG_FORCE_FLUSH`: `CLFS_FLAG` = 2u;
public const val `CLFS_FLAG_HIDDEN_SYSTEM_LOG`: UInt = 512u;
public const val `CLFS_FLAG_IGNORE_SHARE_ACCESS`: UInt = 64u;
public const val `CLFS_FLAG_MINIFILTER_LEVEL`: UInt = 256u;
public const val `CLFS_FLAG_NON_REENTRANT_FILTER`: UInt = 16u;
public const val `CLFS_FLAG_NO_FLAGS`: `CLFS_FLAG` = 0u;
public const val `CLFS_FLAG_READ_IN_PROGRESS`: UInt = 128u;
public const val `CLFS_FLAG_REENTRANT_FILE_SYSTEM`: UInt = 8u;
public const val `CLFS_FLAG_REENTRANT_FILTER`: UInt = 32u;
public const val `CLFS_FLAG_USE_RESERVATION`: `CLFS_FLAG` = 4u;
public typealias `CLFS_IOSTATS_CLASS` = Int;
public typealias `CLFS_LOG_ARCHIVE_MODE` = Int;
// UNSUPPORTED Rust 558:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLFS_LOG_NAME_INFORMATION {
//     pub NameLengthInBytes: u16,
//     pub Name: [u16; 1],
// }

// UNSUPPORTED Rust 564:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CLFS_LOG_NAME_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CLFS_MARSHALLING_FLAG_DISABLE_BUFF_INIT`: UInt = 1u;
public const val `CLFS_MARSHALLING_FLAG_NONE`: UInt = 0u;
public const val `CLFS_MAX_CONTAINER_INFO`: UInt = 256u;
public const val `CLFS_MGMT_CLIENT_REGISTRATION_VERSION`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CLFS_MGMT_NOTIFICATION` (
    public var `Notification`: `CLFS_MGMT_NOTIFICATION_TYPE`,
    public var `Lsn`: `CLS_LSN`,
    public var `LogIsPinned`: UShort,
)
public typealias `CLFS_MGMT_NOTIFICATION_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CLFS_MGMT_POLICY` (
    public var `Version`: UInt,
    public var `LengthInBytes`: UInt,
    public var `PolicyFlags`: UInt,
    public var `PolicyType`: `CLFS_MGMT_POLICY_TYPE`,
    public var `PolicyParameters`: `CLFS_MGMT_POLICY_0`,
)
// UNSUPPORTED Rust 590:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CLFS_MGMT_POLICY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 595:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union CLFS_MGMT_POLICY_0 {
//     pub MaximumSize: CLFS_MGMT_POLICY_0_0,
//     pub MinimumSize: CLFS_MGMT_POLICY_0_1,
//     pub NewContainerSize: CLFS_MGMT_POLICY_0_2,
//     pub GrowthRate: CLFS_MGMT_POLICY_0_3,
//     pub LogTail: CLFS_MGMT_POLICY_0_4,
//     pub AutoShrink: CLFS_MGMT_POLICY_0_5,
//     pub AutoGrow: CLFS_MGMT_POLICY_0_6,
//     pub NewContainerPrefix: CLFS_MGMT_POLICY_0_7,
//     pub NewContainerSuffix: CLFS_MGMT_POLICY_0_8,
//     pub NewContainerExtension: CLFS_MGMT_POLICY_0_9,
// }

// UNSUPPORTED Rust 609:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CLFS_MGMT_POLICY_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CLFS_MGMT_POLICY_0_6` (
    public var `Enabled`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CLFS_MGMT_POLICY_0_5` (
    public var `Percentage`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CLFS_MGMT_POLICY_0_3` (
    public var `AbsoluteGrowthInContainers`: UInt,
    public var `RelativeGrowthPercentage`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CLFS_MGMT_POLICY_0_4` (
    public var `MinimumAvailablePercentage`: UInt,
    public var `MinimumAvailableContainers`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CLFS_MGMT_POLICY_0_0` (
    public var `Containers`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CLFS_MGMT_POLICY_0_1` (
    public var `Containers`: UInt,
)
// UNSUPPORTED Rust 646:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLFS_MGMT_POLICY_0_9 {
//     pub ExtensionLengthInBytes: u16,
//     pub ExtensionString: [u16; 1],
// }

// UNSUPPORTED Rust 652:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CLFS_MGMT_POLICY_0_9 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 657:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLFS_MGMT_POLICY_0_7 {
//     pub PrefixLengthInBytes: u16,
//     pub PrefixString: [u16; 1],
// }

// UNSUPPORTED Rust 663:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CLFS_MGMT_POLICY_0_7 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CLFS_MGMT_POLICY_0_2` (
    public var `SizeInBytes`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CLFS_MGMT_POLICY_0_8` (
    public var `NextContainerSuffix`: ULong,
)
public typealias `CLFS_MGMT_POLICY_TYPE` = Int;
public const val `CLFS_MGMT_POLICY_VERSION`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CLFS_NODE_ID` (
    public var `cType`: UInt,
    public var `cbNode`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CLFS_PHYSICAL_LSN_INFORMATION` (
    public var `StreamIdentifier`: UByte,
    public var `VirtualLsn`: `CLS_LSN`,
    public var `PhysicalLsn`: `CLS_LSN`,
)
public const val `CLFS_SCAN_BACKWARD`: UByte = 4u;
public const val `CLFS_SCAN_BUFFERED`: UByte = 32u;
public const val `CLFS_SCAN_CLOSE`: UByte = 8u;
public const val `CLFS_SCAN_FORWARD`: UByte = 2u;
public const val `CLFS_SCAN_INIT`: UByte = 1u;
public const val `CLFS_SCAN_INITIALIZED`: UByte = 16u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CLFS_STREAM_ID_INFORMATION` (
    public var `StreamIdentifier`: UByte,
)
// UNSUPPORTED Rust 704:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CLSID_DiskQuotaControl: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7988b571_ec89_11cf_9c00_00aa00a14f56);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CLS_ARCHIVE_DESCRIPTOR` (
    public var `coffLow`: ULong,
    public var `coffHigh`: ULong,
    public var `infoContainer`: `CLS_CONTAINER_INFORMATION`,
)
// UNSUPPORTED Rust 712:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLS_CONTAINER_INFORMATION {
//     pub FileAttributes: u32,
//     pub CreationTime: u64,
//     pub LastAccessTime: u64,
//     pub LastWriteTime: u64,
//     pub ContainerSize: i64,
//     pub FileNameActualLength: u32,
//     pub FileNameLength: u32,
//     pub FileName: [u16; 256],
//     pub State: u32,
//     pub PhysicalContainerId: u32,
//     pub LogicalContainerId: u32,
// }

// UNSUPPORTED Rust 727:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CLS_CONTAINER_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `CLS_CONTEXT_MODE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CLS_INFORMATION` (
    public var `TotalAvailable`: Long,
    public var `CurrentAvailable`: Long,
    public var `TotalReservation`: Long,
    public var `BaseFileSize`: ULong,
    public var `ContainerSize`: ULong,
    public var `TotalContainers`: UInt,
    public var `FreeContainers`: UInt,
    public var `TotalClients`: UInt,
    public var `Attributes`: UInt,
    public var `FlushThreshold`: UInt,
    public var `SectorSize`: UInt,
    public var `MinArchiveTailLsn`: `CLS_LSN`,
    public var `BaseLsn`: `CLS_LSN`,
    public var `LastFlushedLsn`: `CLS_LSN`,
    public var `LastLsn`: `CLS_LSN`,
    public var `RestartLsn`: `CLS_LSN`,
    public var `Identity`: `windows_sys`.`core`.`GUID`,
)
public typealias `CLS_IOSTATS_CLASS` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CLS_IO_STATISTICS` (
    public var `hdrIoStats`: `CLS_IO_STATISTICS_HEADER`,
    public var `cFlush`: ULong,
    public var `cbFlush`: ULong,
    public var `cMetaFlush`: ULong,
    public var `cbMetaFlush`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CLS_IO_STATISTICS_HEADER` (
    public var `ubMajorVersion`: UByte,
    public var `ubMinorVersion`: UByte,
    public var `eStatsClass`: `CLFS_IOSTATS_CLASS`,
    public var `cbLength`: UShort,
    public var `coffData`: UInt,
)
public typealias `CLS_LOG_INFORMATION_CLASS` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CLS_LSN` (
    public var `Internal`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CLS_SCAN_CONTEXT` (
    public var `cidNode`: `CLFS_NODE_ID`,
    public var `hLog`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `cIndex`: UInt,
    public var `cContainers`: UInt,
    public var `cContainersReturned`: UInt,
    public var `eScanMode`: UByte,
    public var `pinfoContainer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`CLS_CONTAINER_INFORMATION`>?,
)
// UNSUPPORTED Rust 790:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CLS_SCAN_CONTEXT {
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
public class `CLS_WRITE_ENTRY` (
    public var `Buffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `ByteLength`: UInt,
)
// UNSUPPORTED Rust 801:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CLS_WRITE_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `COMPRESSION_FORMAT` = UShort;
public const val `COMPRESSION_FORMAT_DEFAULT`: `COMPRESSION_FORMAT` = 1u;
public const val `COMPRESSION_FORMAT_LZNT1`: `COMPRESSION_FORMAT` = 2u;
public const val `COMPRESSION_FORMAT_NONE`: `COMPRESSION_FORMAT` = 0u;
public const val `COMPRESSION_FORMAT_XP10`: `COMPRESSION_FORMAT` = 5u;
public const val `COMPRESSION_FORMAT_XPRESS`: `COMPRESSION_FORMAT` = 3u;
public const val `COMPRESSION_FORMAT_XPRESS_HUFF`: `COMPRESSION_FORMAT` = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CONNECTION_INFO_0` (
    public var `coni0_id`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CONNECTION_INFO_1` (
    public var `coni1_id`: UInt,
    public var `coni1_type`: `SHARE_TYPE`,
    public var `coni1_num_opens`: UInt,
    public var `coni1_num_users`: UInt,
    public var `coni1_time`: UInt,
    public var `coni1_username`: `windows_sys`.`core`.`PWSTR`,
    public var `coni1_netname`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 829:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CONNECTION_INFO_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `COPYFILE2_CALLBACK_CHUNK_FINISHED`: `COPYFILE2_MESSAGE_TYPE` = 2;
public const val `COPYFILE2_CALLBACK_CHUNK_STARTED`: `COPYFILE2_MESSAGE_TYPE` = 1;
public const val `COPYFILE2_CALLBACK_ERROR`: `COPYFILE2_MESSAGE_TYPE` = 6;
public const val `COPYFILE2_CALLBACK_MAX`: `COPYFILE2_MESSAGE_TYPE` = 7;
public const val `COPYFILE2_CALLBACK_NONE`: `COPYFILE2_MESSAGE_TYPE` = 0;
public const val `COPYFILE2_CALLBACK_POLL_CONTINUE`: `COPYFILE2_MESSAGE_TYPE` = 5;
public const val `COPYFILE2_CALLBACK_STREAM_FINISHED`: `COPYFILE2_MESSAGE_TYPE` = 4;
public const val `COPYFILE2_CALLBACK_STREAM_STARTED`: `COPYFILE2_MESSAGE_TYPE` = 3;
public typealias `COPYFILE2_COPY_PHASE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `COPYFILE2_EXTENDED_PARAMETERS` (
    public var `dwSize`: UInt,
    public var `dwCopyFlags`: `COPYFILE_FLAGS`,
    public var `pfCancel`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?,
    public var `pProgressRoutine`: `PCOPYFILE2_PROGRESS_ROUTINE`,
    public var `pvCallbackContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 852:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for COPYFILE2_EXTENDED_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 857:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct COPYFILE2_EXTENDED_PARAMETERS_V2 {
//     pub dwSize: u32,
//     pub dwCopyFlags: COPYFILE_FLAGS,
//     pub pfCancel: *mut windows_sys::core::BOOL,
//     pub pProgressRoutine: PCOPYFILE2_PROGRESS_ROUTINE,
//     pub pvCallbackContext: *mut core::ffi::c_void,
//     pub dwCopyFlagsV2: COPYFILE2_V2_FLAGS,
//     pub ioDesiredSize: u32,
//     pub ioDesiredRate: u32,
//     pub reserved: [*mut core::ffi::c_void; 8],
// }

// UNSUPPORTED Rust 870:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for COPYFILE2_EXTENDED_PARAMETERS_V2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `COPYFILE2_IO_CYCLE_SIZE_MAX`: UInt = 1073741824u;
public const val `COPYFILE2_IO_CYCLE_SIZE_MIN`: UInt = 4096u;
public const val `COPYFILE2_IO_RATE_MIN`: UInt = 512u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `COPYFILE2_MESSAGE` (
    public var `Type`: `COPYFILE2_MESSAGE_TYPE`,
    public var `dwPadding`: UInt,
    public var `Info`: `COPYFILE2_MESSAGE_0`,
)
// UNSUPPORTED Rust 885:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for COPYFILE2_MESSAGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 890:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union COPYFILE2_MESSAGE_0 {
//     pub ChunkStarted: COPYFILE2_MESSAGE_0_0,
//     pub ChunkFinished: COPYFILE2_MESSAGE_0_1,
//     pub StreamStarted: COPYFILE2_MESSAGE_0_2,
//     pub StreamFinished: COPYFILE2_MESSAGE_0_3,
//     pub PollContinue: COPYFILE2_MESSAGE_0_4,
//     pub Error: COPYFILE2_MESSAGE_0_5,
// }

// UNSUPPORTED Rust 900:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for COPYFILE2_MESSAGE_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `COPYFILE2_MESSAGE_0_1` (
    public var `dwStreamNumber`: UInt,
    public var `dwFlags`: UInt,
    public var `hSourceFile`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `hDestinationFile`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `uliChunkNumber`: ULong,
    public var `uliChunkSize`: ULong,
    public var `uliStreamSize`: ULong,
    public var `uliStreamBytesTransferred`: ULong,
    public var `uliTotalFileSize`: ULong,
    public var `uliTotalBytesTransferred`: ULong,
)
// UNSUPPORTED Rust 919:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for COPYFILE2_MESSAGE_0_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `COPYFILE2_MESSAGE_0_0` (
    public var `dwStreamNumber`: UInt,
    public var `dwReserved`: UInt,
    public var `hSourceFile`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `hDestinationFile`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `uliChunkNumber`: ULong,
    public var `uliChunkSize`: ULong,
    public var `uliStreamSize`: ULong,
    public var `uliTotalFileSize`: ULong,
)
// UNSUPPORTED Rust 936:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for COPYFILE2_MESSAGE_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `COPYFILE2_MESSAGE_0_5` (
    public var `CopyPhase`: `COPYFILE2_COPY_PHASE`,
    public var `dwStreamNumber`: UInt,
    public var `hrFailure`: `windows_sys`.`core`.`HRESULT`,
    public var `dwReserved`: UInt,
    public var `uliChunkNumber`: ULong,
    public var `uliStreamSize`: ULong,
    public var `uliStreamBytesTransferred`: ULong,
    public var `uliTotalFileSize`: ULong,
    public var `uliTotalBytesTransferred`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `COPYFILE2_MESSAGE_0_4` (
    public var `dwReserved`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `COPYFILE2_MESSAGE_0_3` (
    public var `dwStreamNumber`: UInt,
    public var `dwReserved`: UInt,
    public var `hSourceFile`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `hDestinationFile`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `uliStreamSize`: ULong,
    public var `uliStreamBytesTransferred`: ULong,
    public var `uliTotalFileSize`: ULong,
    public var `uliTotalBytesTransferred`: ULong,
)
// UNSUPPORTED Rust 971:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for COPYFILE2_MESSAGE_0_3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `COPYFILE2_MESSAGE_0_2` (
    public var `dwStreamNumber`: UInt,
    public var `dwReserved`: UInt,
    public var `hSourceFile`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `hDestinationFile`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `uliStreamSize`: ULong,
    public var `uliTotalFileSize`: ULong,
)
// UNSUPPORTED Rust 986:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for COPYFILE2_MESSAGE_0_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `COPYFILE2_MESSAGE_ACTION` = Int;
public const val `COPYFILE2_MESSAGE_COPY_OFFLOAD`: Int = 1;
public typealias `COPYFILE2_MESSAGE_TYPE` = Int;
public const val `COPYFILE2_PHASE_MAX`: `COPYFILE2_COPY_PHASE` = 7;
public const val `COPYFILE2_PHASE_NAMEGRAFT_COPY`: `COPYFILE2_COPY_PHASE` = 6;
public const val `COPYFILE2_PHASE_NONE`: `COPYFILE2_COPY_PHASE` = 0;
public const val `COPYFILE2_PHASE_PREPARE_DEST`: `COPYFILE2_COPY_PHASE` = 2;
public const val `COPYFILE2_PHASE_PREPARE_SOURCE`: `COPYFILE2_COPY_PHASE` = 1;
public const val `COPYFILE2_PHASE_READ_SOURCE`: `COPYFILE2_COPY_PHASE` = 3;
public const val `COPYFILE2_PHASE_SERVER_COPY`: `COPYFILE2_COPY_PHASE` = 5;
public const val `COPYFILE2_PHASE_WRITE_DESTINATION`: `COPYFILE2_COPY_PHASE` = 4;
public const val `COPYFILE2_PROGRESS_CANCEL`: `COPYFILE2_MESSAGE_ACTION` = 1;
public const val `COPYFILE2_PROGRESS_CONTINUE`: `COPYFILE2_MESSAGE_ACTION` = 0;
public const val `COPYFILE2_PROGRESS_PAUSE`: `COPYFILE2_MESSAGE_ACTION` = 4;
public const val `COPYFILE2_PROGRESS_QUIET`: `COPYFILE2_MESSAGE_ACTION` = 3;
public const val `COPYFILE2_PROGRESS_STOP`: `COPYFILE2_MESSAGE_ACTION` = 2;
public typealias `COPYFILE2_V2_FLAGS` = UInt;
public typealias `COPYFILE_FLAGS` = UInt;
public typealias `COPYPROGRESSROUTINE_PROGRESS` = UInt;
public const val `COPY_FILE2_V2_DONT_COPY_JUNCTIONS`: `COPYFILE2_V2_FLAGS` = 1u;
public const val `COPY_FILE2_V2_VALID_FLAGS`: `COPYFILE2_V2_FLAGS` = 1u;
public const val `COPY_FILE_ALLOW_DECRYPTED_DESTINATION`: `COPYFILE_FLAGS` = 8u;
public const val `COPY_FILE_COPY_SYMLINK`: `COPYFILE_FLAGS` = 2048u;
public const val `COPY_FILE_DIRECTORY`: `COPYFILE_FLAGS` = 128u;
public const val `COPY_FILE_DISABLE_PRE_ALLOCATION`: `COPYFILE_FLAGS` = 67108864u;
public const val `COPY_FILE_DONT_REQUEST_DEST_WRITE_DAC`: `COPYFILE_FLAGS` = 33554432u;
public const val `COPY_FILE_ENABLE_LOW_FREE_SPACE_MODE`: `COPYFILE_FLAGS` = 134217728u;
public const val `COPY_FILE_ENABLE_SPARSE_COPY`: `COPYFILE_FLAGS` = 536870912u;
public const val `COPY_FILE_FAIL_IF_EXISTS`: `COPYFILE_FLAGS` = 1u;
public const val `COPY_FILE_IGNORE_EDP_BLOCK`: `COPYFILE_FLAGS` = 4194304u;
public const val `COPY_FILE_IGNORE_SOURCE_ENCRYPTION`: `COPYFILE_FLAGS` = 8388608u;
public const val `COPY_FILE_NO_BUFFERING`: `COPYFILE_FLAGS` = 4096u;
public const val `COPY_FILE_NO_OFFLOAD`: `COPYFILE_FLAGS` = 262144u;
public const val `COPY_FILE_OPEN_AND_COPY_REPARSE_POINT`: `COPYFILE_FLAGS` = 2097152u;
public const val `COPY_FILE_OPEN_SOURCE_FOR_WRITE`: `COPYFILE_FLAGS` = 4u;
public const val `COPY_FILE_REQUEST_COMPRESSED_TRAFFIC`: `COPYFILE_FLAGS` = 268435456u;
public const val `COPY_FILE_REQUEST_SECURITY_PRIVILEGES`: `COPYFILE_FLAGS` = 8192u;
public const val `COPY_FILE_RESTARTABLE`: `COPYFILE_FLAGS` = 2u;
public const val `COPY_FILE_RESUME_FROM_PAUSE`: `COPYFILE_FLAGS` = 16384u;
public const val `COPY_FILE_SKIP_ALTERNATE_STREAMS`: `COPYFILE_FLAGS` = 32768u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CREATEFILE2_EXTENDED_PARAMETERS` (
    public var `dwSize`: UInt,
    public var `dwFileAttributes`: UInt,
    public var `dwFileFlags`: UInt,
    public var `dwSecurityQosFlags`: UInt,
    public var `lpSecurityAttributes`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SECURITY_ATTRIBUTES`>?,
    public var `hTemplateFile`: `super`.`super`.`Foundation`.`HANDLE`,
)
// UNSUPPORTED Rust 1042:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for CREATEFILE2_EXTENDED_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CREATE_ALWAYS`: `FILE_CREATION_DISPOSITION` = 2u;
public const val `CREATE_NEW`: `FILE_CREATION_DISPOSITION` = 1u;
public typealias `CREATE_TAPE_PARTITION_METHOD` = UInt;
public const val `CRM_PROTOCOL_DYNAMIC_MARSHAL_INFO`: UInt = 2u;
public const val `CRM_PROTOCOL_EXPLICIT_MARSHAL_ONLY`: UInt = 1u;
public const val `CRM_PROTOCOL_MAXIMUM_OPTION`: UInt = 3u;
public const val `CSC_CACHE_AUTO_REINT`: UInt = 16u;
public const val `CSC_CACHE_MANUAL_REINT`: UInt = 0u;
public const val `CSC_CACHE_NONE`: UInt = 48u;
public const val `CSC_CACHE_VDO`: UInt = 32u;
public const val `CSC_MASK`: UInt = 48u;
public const val `CSC_MASK_EXT`: UInt = 8240u;
public const val `CSV_BLOCK_AND_FILE_CACHE_CALLBACK_VERSION`: UInt = 2u;
public const val `CSV_BLOCK_CACHE_CALLBACK_VERSION`: UInt = 1u;
public const val `ClfsClientRecord`: UByte = 3u;
public const val `ClfsContainerActive`: UInt = 4u;
public const val `ClfsContainerActivePendingDelete`: UInt = 8u;
public const val `ClfsContainerInactive`: UInt = 2u;
public const val `ClfsContainerInitializing`: UInt = 1u;
public const val `ClfsContainerPendingArchive`: UInt = 16u;
public const val `ClfsContainerPendingArchiveAndDelete`: UInt = 32u;
public const val `ClfsContextForward`: `CLFS_CONTEXT_MODE` = 3;
public const val `ClfsContextNone`: `CLFS_CONTEXT_MODE` = 0;
public const val `ClfsContextPrevious`: `CLFS_CONTEXT_MODE` = 2;
public const val `ClfsContextUndoNext`: `CLFS_CONTEXT_MODE` = 1;
public const val `ClfsDataRecord`: UByte = 1u;
public const val `ClfsIoStatsDefault`: `CLFS_IOSTATS_CLASS` = 0;
public const val `ClfsIoStatsMax`: `CLFS_IOSTATS_CLASS` = 65535;
public const val `ClfsLogArchiveDisabled`: `CLFS_LOG_ARCHIVE_MODE` = 2;
public const val `ClfsLogArchiveEnabled`: `CLFS_LOG_ARCHIVE_MODE` = 1;
public const val `ClfsLogBasicInformation`: `CLS_LOG_INFORMATION_CLASS` = 0;
public const val `ClfsLogBasicInformationPhysical`: `CLS_LOG_INFORMATION_CLASS` = 1;
public const val `ClfsLogPhysicalLsnInformation`: `CLS_LOG_INFORMATION_CLASS` = 5;
public const val `ClfsLogPhysicalNameInformation`: `CLS_LOG_INFORMATION_CLASS` = 2;
public const val `ClfsLogStreamIdentifierInformation`: `CLS_LOG_INFORMATION_CLASS` = 3;
public const val `ClfsLogSystemMarkingInformation`: `CLS_LOG_INFORMATION_CLASS` = 4;
public const val `ClfsMgmtAdvanceTailNotification`: `CLFS_MGMT_NOTIFICATION_TYPE` = 0;
public const val `ClfsMgmtLogFullHandlerNotification`: `CLFS_MGMT_NOTIFICATION_TYPE` = 1;
public const val `ClfsMgmtLogUnpinnedNotification`: `CLFS_MGMT_NOTIFICATION_TYPE` = 2;
public const val `ClfsMgmtLogWriteNotification`: `CLFS_MGMT_NOTIFICATION_TYPE` = 3;
public const val `ClfsMgmtPolicyAutoGrow`: `CLFS_MGMT_POLICY_TYPE` = 6;
public const val `ClfsMgmtPolicyAutoShrink`: `CLFS_MGMT_POLICY_TYPE` = 5;
public const val `ClfsMgmtPolicyGrowthRate`: `CLFS_MGMT_POLICY_TYPE` = 3;
public const val `ClfsMgmtPolicyInvalid`: `CLFS_MGMT_POLICY_TYPE` = 10;
public const val `ClfsMgmtPolicyLogTail`: `CLFS_MGMT_POLICY_TYPE` = 4;
public const val `ClfsMgmtPolicyMaximumSize`: `CLFS_MGMT_POLICY_TYPE` = 0;
public const val `ClfsMgmtPolicyMinimumSize`: `CLFS_MGMT_POLICY_TYPE` = 1;
public const val `ClfsMgmtPolicyNewContainerExtension`: `CLFS_MGMT_POLICY_TYPE` = 9;
public const val `ClfsMgmtPolicyNewContainerPrefix`: `CLFS_MGMT_POLICY_TYPE` = 7;
public const val `ClfsMgmtPolicyNewContainerSize`: `CLFS_MGMT_POLICY_TYPE` = 2;
public const val `ClfsMgmtPolicyNewContainerSuffix`: `CLFS_MGMT_POLICY_TYPE` = 8;
public const val `ClfsNullRecord`: UByte = 0u;
public const val `ClfsRestartRecord`: UByte = 2u;
public const val `ClsContainerActive`: UInt = 4u;
public const val `ClsContainerActivePendingDelete`: UInt = 8u;
public const val `ClsContainerInactive`: UInt = 2u;
public const val `ClsContainerInitializing`: UInt = 1u;
public const val `ClsContainerPendingArchive`: UInt = 16u;
public const val `ClsContainerPendingArchiveAndDelete`: UInt = 32u;
public const val `ClsContextForward`: `CLS_CONTEXT_MODE` = 3;
public const val `ClsContextNone`: `CLS_CONTEXT_MODE` = 0;
public const val `ClsContextPrevious`: `CLS_CONTEXT_MODE` = 2;
public const val `ClsContextUndoNext`: `CLS_CONTEXT_MODE` = 1;
public const val `ClsIoStatsDefault`: `CLS_IOSTATS_CLASS` = 0;
public const val `ClsIoStatsMax`: `CLS_IOSTATS_CLASS` = 65535;
public const val `DDD_EXACT_MATCH_ON_REMOVE`: `DEFINE_DOS_DEVICE_FLAGS` = 4u;
public const val `DDD_LUID_BROADCAST_DRIVE`: `DEFINE_DOS_DEVICE_FLAGS` = 16u;
public const val `DDD_NO_BROADCAST_SYSTEM`: `DEFINE_DOS_DEVICE_FLAGS` = 8u;
public const val `DDD_RAW_TARGET_PATH`: `DEFINE_DOS_DEVICE_FLAGS` = 1u;
public const val `DDD_REMOVE_DEFINITION`: `DEFINE_DOS_DEVICE_FLAGS` = 2u;
public typealias `DEFINE_DOS_DEVICE_FLAGS` = UInt;
public const val `DELETE`: `FILE_ACCESS_RIGHTS` = 65536u;
public const val `DISKQUOTA_FILESTATE_INCOMPLETE`: UInt = 256u;
public const val `DISKQUOTA_FILESTATE_MASK`: UInt = 768u;
public const val `DISKQUOTA_FILESTATE_REBUILDING`: UInt = 512u;
public const val `DISKQUOTA_LOGFLAG_USER_LIMIT`: UInt = 2u;
public const val `DISKQUOTA_LOGFLAG_USER_THRESHOLD`: UInt = 1u;
public const val `DISKQUOTA_STATE_DISABLED`: UInt = 0u;
public const val `DISKQUOTA_STATE_ENFORCE`: UInt = 2u;
public const val `DISKQUOTA_STATE_MASK`: UInt = 3u;
public const val `DISKQUOTA_STATE_TRACK`: UInt = 1u;
public typealias `DISKQUOTA_USERNAME_RESOLVE` = UInt;
public const val `DISKQUOTA_USERNAME_RESOLVE_ASYNC`: `DISKQUOTA_USERNAME_RESOLVE` = 2u;
public const val `DISKQUOTA_USERNAME_RESOLVE_NONE`: `DISKQUOTA_USERNAME_RESOLVE` = 0u;
public const val `DISKQUOTA_USERNAME_RESOLVE_SYNC`: `DISKQUOTA_USERNAME_RESOLVE` = 1u;
public const val `DISKQUOTA_USER_ACCOUNT_DELETED`: UInt = 2u;
public const val `DISKQUOTA_USER_ACCOUNT_INVALID`: UInt = 3u;
public const val `DISKQUOTA_USER_ACCOUNT_RESOLVED`: UInt = 0u;
public const val `DISKQUOTA_USER_ACCOUNT_UNAVAILABLE`: UInt = 1u;
public const val `DISKQUOTA_USER_ACCOUNT_UNKNOWN`: UInt = 4u;
public const val `DISKQUOTA_USER_ACCOUNT_UNRESOLVED`: UInt = 5u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DISKQUOTA_USER_INFORMATION` (
    public var `QuotaUsed`: Long,
    public var `QuotaThreshold`: Long,
    public var `QuotaLimit`: Long,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DISK_SPACE_INFORMATION` (
    public var `ActualTotalAllocationUnits`: ULong,
    public var `ActualAvailableAllocationUnits`: ULong,
    public var `ActualPoolUnavailableAllocationUnits`: ULong,
    public var `CallerTotalAllocationUnits`: ULong,
    public var `CallerAvailableAllocationUnits`: ULong,
    public var `CallerPoolUnavailableAllocationUnits`: ULong,
    public var `UsedAllocationUnits`: ULong,
    public var `TotalReservedAllocationUnits`: ULong,
    public var `VolumeStorageReserveAllocationUnits`: ULong,
    public var `AvailableCommittedAllocationUnits`: ULong,
    public var `PoolAvailableAllocationUnits`: ULong,
    public var `SectorsPerAllocationUnit`: UInt,
    public var `BytesPerSector`: UInt,
)
// UNSUPPORTED Rust 1163:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const EA_CONTAINER_NAME: windows_sys::core::PCSTR = windows_sys::core::s!("ContainerName");

// UNSUPPORTED Rust 1164:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const EA_CONTAINER_SIZE: windows_sys::core::PCSTR = windows_sys::core::s!("ContainerSize");

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `EFS_CERTIFICATE_BLOB` (
    public var `dwCertEncodingType`: UInt,
    public var `cbData`: UInt,
    public var `pbData`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 1172:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for EFS_CERTIFICATE_BLOB {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EFS_COMPATIBILITY_INFO` (
    public var `EfsVersion`: UInt,
)
public const val `EFS_COMPATIBILITY_VERSION_NCRYPT_PROTECTOR`: UInt = 5u;
public const val `EFS_COMPATIBILITY_VERSION_PFILE_PROTECTOR`: UInt = 6u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EFS_DECRYPTION_STATUS_INFO` (
    public var `dwDecryptionError`: UInt,
    public var `dwHashOffset`: UInt,
    public var `cbHash`: UInt,
)
public const val `EFS_EFS_SUBVER_EFS_CERT`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EFS_ENCRYPTION_STATUS_INFO` (
    public var `bHasCurrentKey`: `windows_sys`.`core`.`BOOL`,
    public var `dwEncryptionError`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `EFS_HASH_BLOB` (
    public var `cbData`: UInt,
    public var `pbData`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 1204:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for EFS_HASH_BLOB {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EFS_KEY_INFO` (
    public var `dwVersion`: UInt,
    public var `Entropy`: UInt,
    public var `Algorithm`: `super`.`super`.`Security`.`Cryptography`.`ALG_ID`,
    public var `KeyLength`: UInt,
)
public const val `EFS_METADATA_ADD_USER`: UInt = 1u;
public const val `EFS_METADATA_GENERAL_OP`: UInt = 8u;
public const val `EFS_METADATA_REMOVE_USER`: UInt = 2u;
public const val `EFS_METADATA_REPLACE_USER`: UInt = 4u;
public const val `EFS_PFILE_SUBVER_APPX`: UInt = 3u;
public const val `EFS_PFILE_SUBVER_RMS`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `EFS_PIN_BLOB` (
    public var `cbPadding`: UInt,
    public var `cbData`: UInt,
    public var `pbData`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 1231:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for EFS_PIN_BLOB {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `EFS_RPC_BLOB` (
    public var `cbData`: UInt,
    public var `pbData`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 1242:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for EFS_RPC_BLOB {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `EFS_SUBVER_UNKNOWN`: UInt = 0u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EFS_VERSION_INFO` (
    public var `EfsVersion`: UInt,
    public var `SubVersion`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ENCRYPTED_FILE_METADATA_SIGNATURE` (
    public var `dwEfsAccessType`: UInt,
    public var `pCertificatesAdded`: /* Rust *mut */ kotlinx.cinterop.CPointer<`ENCRYPTION_CERTIFICATE_HASH_LIST`>?,
    public var `pEncryptionCertificate`: /* Rust *mut */ kotlinx.cinterop.CPointer<`ENCRYPTION_CERTIFICATE`>?,
    public var `pEfsStreamSignature`: /* Rust *mut */ kotlinx.cinterop.CPointer<`EFS_RPC_BLOB`>?,
)
// UNSUPPORTED Rust 1263:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for ENCRYPTED_FILE_METADATA_SIGNATURE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ENCRYPTION_CERTIFICATE` (
    public var `cbTotalLength`: UInt,
    public var `pUserSid`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SID`>?,
    public var `pCertBlob`: /* Rust *mut */ kotlinx.cinterop.CPointer<`EFS_CERTIFICATE_BLOB`>?,
)
// UNSUPPORTED Rust 1277:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for ENCRYPTION_CERTIFICATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ENCRYPTION_CERTIFICATE_HASH` (
    public var `cbTotalLength`: UInt,
    public var `pUserSid`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SID`>?,
    public var `pHash`: /* Rust *mut */ kotlinx.cinterop.CPointer<`EFS_HASH_BLOB`>?,
    public var `lpDisplayInformation`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 1292:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for ENCRYPTION_CERTIFICATE_HASH {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ENCRYPTION_CERTIFICATE_HASH_LIST` (
    public var `nCert_Hash`: UInt,
    public var `pUsers`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`ENCRYPTION_CERTIFICATE_HASH`>>?,
)
// UNSUPPORTED Rust 1305:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for ENCRYPTION_CERTIFICATE_HASH_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ENCRYPTION_CERTIFICATE_LIST` (
    public var `nUsers`: UInt,
    public var `pUsers`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`ENCRYPTION_CERTIFICATE`>>?,
)
// UNSUPPORTED Rust 1318:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for ENCRYPTION_CERTIFICATE_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ENCRYPTION_PROTECTOR` (
    public var `cbTotalLength`: UInt,
    public var `pUserSid`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Security`.`SID`>?,
    public var `lpProtectorDescriptor`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 1332:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for ENCRYPTION_PROTECTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ENCRYPTION_PROTECTOR_LIST` (
    public var `nProtectors`: UInt,
    public var `pProtectors`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`ENCRYPTION_PROTECTOR`>>?,
)
// UNSUPPORTED Rust 1345:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for ENCRYPTION_PROTECTOR_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ENLISTMENT_MAXIMUM_OPTION`: UInt = 1u;
// UNSUPPORTED Rust 1352:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const ENLISTMENT_OBJECT_PATH: windows_sys::core::PCWSTR = windows_sys::core::w!("\\Enlistment\\");

public const val `ENLISTMENT_SUPERIOR`: UInt = 1u;
public typealias `ERASE_TAPE_TYPE` = UInt;
public const val `ExtendedFileIdType`: `FILE_ID_TYPE` = 2;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `FCACHE_CREATE_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `super`.`super`.`Foundation`.`HANDLE`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `FCACHE_RICHCREATE_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) -> `super`.`super`.`Foundation`.`HANDLE`>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FH_OVERLAPPED` (
    public var `Internal`: ULong,
    public var `InternalHigh`: ULong,
    public var `Offset`: UInt,
    public var `OffsetHigh`: UInt,
    public var `hEvent`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `pfnCompletion`: `PFN_IO_COMPLETION`,
    public var `Reserved1`: ULong,
    public var `Reserved2`: ULong,
    public var `Reserved3`: ULong,
    public var `Reserved4`: ULong,
)
// UNSUPPORTED Rust 1372:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FH_OVERLAPPED {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `FILE_ACCESS_RIGHTS` = UInt;
public typealias `FILE_ACTION` = UInt;
public const val `FILE_ACTION_ADDED`: `FILE_ACTION` = 1u;
public const val `FILE_ACTION_MODIFIED`: `FILE_ACTION` = 3u;
public const val `FILE_ACTION_REMOVED`: `FILE_ACTION` = 2u;
public const val `FILE_ACTION_RENAMED_NEW_NAME`: `FILE_ACTION` = 5u;
public const val `FILE_ACTION_RENAMED_OLD_NAME`: `FILE_ACTION` = 4u;
public const val `FILE_ADD_FILE`: `FILE_ACCESS_RIGHTS` = 2u;
public const val `FILE_ADD_SUBDIRECTORY`: `FILE_ACCESS_RIGHTS` = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FILE_ALIGNMENT_INFO` (
    public var `AlignmentRequirement`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FILE_ALLOCATION_INFO` (
    public var `AllocationSize`: Long,
)
public const val `FILE_ALL_ACCESS`: `FILE_ACCESS_RIGHTS` = 2032127u;
public const val `FILE_APPEND_DATA`: `FILE_ACCESS_RIGHTS` = 4u;
public const val `FILE_ATTRIBUTE_ARCHIVE`: `FILE_FLAGS_AND_ATTRIBUTES` = 32u;
public const val `FILE_ATTRIBUTE_COMPRESSED`: `FILE_FLAGS_AND_ATTRIBUTES` = 2048u;
public const val `FILE_ATTRIBUTE_DEVICE`: `FILE_FLAGS_AND_ATTRIBUTES` = 64u;
public const val `FILE_ATTRIBUTE_DIRECTORY`: `FILE_FLAGS_AND_ATTRIBUTES` = 16u;
public const val `FILE_ATTRIBUTE_EA`: `FILE_FLAGS_AND_ATTRIBUTES` = 262144u;
public const val `FILE_ATTRIBUTE_ENCRYPTED`: `FILE_FLAGS_AND_ATTRIBUTES` = 16384u;
public const val `FILE_ATTRIBUTE_HIDDEN`: `FILE_FLAGS_AND_ATTRIBUTES` = 2u;
public const val `FILE_ATTRIBUTE_INTEGRITY_STREAM`: `FILE_FLAGS_AND_ATTRIBUTES` = 32768u;
public const val `FILE_ATTRIBUTE_NORMAL`: `FILE_FLAGS_AND_ATTRIBUTES` = 128u;
public const val `FILE_ATTRIBUTE_NOT_CONTENT_INDEXED`: `FILE_FLAGS_AND_ATTRIBUTES` = 8192u;
public const val `FILE_ATTRIBUTE_NO_SCRUB_DATA`: `FILE_FLAGS_AND_ATTRIBUTES` = 131072u;
public const val `FILE_ATTRIBUTE_OFFLINE`: `FILE_FLAGS_AND_ATTRIBUTES` = 4096u;
public const val `FILE_ATTRIBUTE_PINNED`: `FILE_FLAGS_AND_ATTRIBUTES` = 524288u;
public const val `FILE_ATTRIBUTE_READONLY`: `FILE_FLAGS_AND_ATTRIBUTES` = 1u;
public const val `FILE_ATTRIBUTE_RECALL_ON_DATA_ACCESS`: `FILE_FLAGS_AND_ATTRIBUTES` = 4194304u;
public const val `FILE_ATTRIBUTE_RECALL_ON_OPEN`: `FILE_FLAGS_AND_ATTRIBUTES` = 262144u;
public const val `FILE_ATTRIBUTE_REPARSE_POINT`: `FILE_FLAGS_AND_ATTRIBUTES` = 1024u;
public const val `FILE_ATTRIBUTE_SPARSE_FILE`: `FILE_FLAGS_AND_ATTRIBUTES` = 512u;
public const val `FILE_ATTRIBUTE_SYSTEM`: `FILE_FLAGS_AND_ATTRIBUTES` = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FILE_ATTRIBUTE_TAG_INFO` (
    public var `FileAttributes`: UInt,
    public var `ReparseTag`: UInt,
)
public const val `FILE_ATTRIBUTE_TEMPORARY`: `FILE_FLAGS_AND_ATTRIBUTES` = 256u;
public const val `FILE_ATTRIBUTE_UNPINNED`: `FILE_FLAGS_AND_ATTRIBUTES` = 1048576u;
public const val `FILE_ATTRIBUTE_VIRTUAL`: `FILE_FLAGS_AND_ATTRIBUTES` = 65536u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FILE_BASIC_INFO` (
    public var `CreationTime`: Long,
    public var `LastAccessTime`: Long,
    public var `LastWriteTime`: Long,
    public var `ChangeTime`: Long,
    public var `FileAttributes`: UInt,
)
public const val `FILE_BEGIN`: `SET_FILE_POINTER_MOVE_METHOD` = 0u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FILE_CASE_SENSITIVE_INFO` (
    public var `Flags`: UInt,
)
// UNSUPPORTED Rust 1441:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FILE_COMPRESSION_INFO {
//     pub CompressedFileSize: i64,
//     pub CompressionFormat: COMPRESSION_FORMAT,
//     pub CompressionUnitShift: u8,
//     pub ChunkShift: u8,
//     pub ClusterShift: u8,
//     pub Reserved: [u8; 3],
// }

// UNSUPPORTED Rust 1451:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FILE_COMPRESSION_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FILE_CREATE_PIPE_INSTANCE`: `FILE_ACCESS_RIGHTS` = 4u;
public typealias `FILE_CREATION_DISPOSITION` = UInt;
public const val `FILE_CURRENT`: `SET_FILE_POINTER_MOVE_METHOD` = 1u;
public const val `FILE_DELETE_CHILD`: `FILE_ACCESS_RIGHTS` = 64u;
public const val `FILE_DEVICE_CD_ROM`: `FILE_DEVICE_TYPE` = 2u;
public const val `FILE_DEVICE_DISK`: `FILE_DEVICE_TYPE` = 7u;
public const val `FILE_DEVICE_DVD`: `FILE_DEVICE_TYPE` = 51u;
public const val `FILE_DEVICE_TAPE`: `FILE_DEVICE_TYPE` = 31u;
public typealias `FILE_DEVICE_TYPE` = UInt;
public const val `FILE_DISPOSITION_FLAG_DELETE`: `FILE_DISPOSITION_INFO_EX_FLAGS` = 1u;
public const val `FILE_DISPOSITION_FLAG_DO_NOT_DELETE`: `FILE_DISPOSITION_INFO_EX_FLAGS` = 0u;
public const val `FILE_DISPOSITION_FLAG_FORCE_IMAGE_SECTION_CHECK`: `FILE_DISPOSITION_INFO_EX_FLAGS` = 4u;
public const val `FILE_DISPOSITION_FLAG_IGNORE_READONLY_ATTRIBUTE`: `FILE_DISPOSITION_INFO_EX_FLAGS` = 16u;
public const val `FILE_DISPOSITION_FLAG_ON_CLOSE`: `FILE_DISPOSITION_INFO_EX_FLAGS` = 8u;
public const val `FILE_DISPOSITION_FLAG_POSIX_SEMANTICS`: `FILE_DISPOSITION_INFO_EX_FLAGS` = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FILE_DISPOSITION_INFO` (
    public var `DeleteFile`: Boolean,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FILE_DISPOSITION_INFO_EX` (
    public var `Flags`: `FILE_DISPOSITION_INFO_EX_FLAGS`,
)
public typealias `FILE_DISPOSITION_INFO_EX_FLAGS` = UInt;
public const val `FILE_END`: `SET_FILE_POINTER_MOVE_METHOD` = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FILE_END_OF_FILE_INFO` (
    public var `EndOfFile`: Long,
)
public const val `FILE_EXECUTE`: `FILE_ACCESS_RIGHTS` = 32u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FILE_EXTENT` (
    public var `VolumeOffset`: ULong,
    public var `ExtentLength`: ULong,
)
public typealias `FILE_FLAGS_AND_ATTRIBUTES` = UInt;
public const val `FILE_FLAG_BACKUP_SEMANTICS`: `FILE_FLAGS_AND_ATTRIBUTES` = 33554432u;
public const val `FILE_FLAG_DELETE_ON_CLOSE`: `FILE_FLAGS_AND_ATTRIBUTES` = 67108864u;
public const val `FILE_FLAG_FIRST_PIPE_INSTANCE`: `FILE_FLAGS_AND_ATTRIBUTES` = 524288u;
public const val `FILE_FLAG_NO_BUFFERING`: `FILE_FLAGS_AND_ATTRIBUTES` = 536870912u;
public const val `FILE_FLAG_OPEN_NO_RECALL`: `FILE_FLAGS_AND_ATTRIBUTES` = 1048576u;
public const val `FILE_FLAG_OPEN_REPARSE_POINT`: `FILE_FLAGS_AND_ATTRIBUTES` = 2097152u;
public const val `FILE_FLAG_OVERLAPPED`: `FILE_FLAGS_AND_ATTRIBUTES` = 1073741824u;
public const val `FILE_FLAG_POSIX_SEMANTICS`: `FILE_FLAGS_AND_ATTRIBUTES` = 16777216u;
public const val `FILE_FLAG_RANDOM_ACCESS`: `FILE_FLAGS_AND_ATTRIBUTES` = 268435456u;
public const val `FILE_FLAG_SEQUENTIAL_SCAN`: `FILE_FLAGS_AND_ATTRIBUTES` = 134217728u;
public const val `FILE_FLAG_SESSION_AWARE`: `FILE_FLAGS_AND_ATTRIBUTES` = 8388608u;
public const val `FILE_FLAG_WRITE_THROUGH`: `FILE_FLAGS_AND_ATTRIBUTES` = 2147483648u;
public const val `FILE_FLUSH_DATA`: `FILE_FLUSH_MODE` = 1;
public const val `FILE_FLUSH_DEFAULT`: `FILE_FLUSH_MODE` = 0;
public const val `FILE_FLUSH_MIN_METADATA`: `FILE_FLUSH_MODE` = 2;
public typealias `FILE_FLUSH_MODE` = Int;
public const val `FILE_FLUSH_NO_SYNC`: `FILE_FLUSH_MODE` = 3;
// UNSUPPORTED Rust 1513:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FILE_FULL_DIR_INFO {
//     pub NextEntryOffset: u32,
//     pub FileIndex: u32,
//     pub CreationTime: i64,
//     pub LastAccessTime: i64,
//     pub LastWriteTime: i64,
//     pub ChangeTime: i64,
//     pub EndOfFile: i64,
//     pub AllocationSize: i64,
//     pub FileAttributes: u32,
//     pub FileNameLength: u32,
//     pub EaSize: u32,
//     pub FileName: [u16; 1],
// }

// UNSUPPORTED Rust 1529:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FILE_FULL_DIR_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FILE_GENERIC_EXECUTE`: `FILE_ACCESS_RIGHTS` = 1179808u;
public const val `FILE_GENERIC_READ`: `FILE_ACCESS_RIGHTS` = 1179785u;
public const val `FILE_GENERIC_WRITE`: `FILE_ACCESS_RIGHTS` = 1179926u;
// UNSUPPORTED Rust 1537:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FILE_ID_128 {
//     pub Identifier: [u8; 16],
// }

// UNSUPPORTED Rust 1542:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FILE_ID_128 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1547:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FILE_ID_BOTH_DIR_INFO {
//     pub NextEntryOffset: u32,
//     pub FileIndex: u32,
//     pub CreationTime: i64,
//     pub LastAccessTime: i64,
//     pub LastWriteTime: i64,
//     pub ChangeTime: i64,
//     pub EndOfFile: i64,
//     pub AllocationSize: i64,
//     pub FileAttributes: u32,
//     pub FileNameLength: u32,
//     pub EaSize: u32,
//     pub ShortNameLength: i8,
//     pub ShortName: [u16; 12],
//     pub FileId: i64,
//     pub FileName: [u16; 1],
// }

// UNSUPPORTED Rust 1566:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FILE_ID_BOTH_DIR_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FILE_ID_DESCRIPTOR` (
    public var `dwSize`: UInt,
    public var `Type`: `FILE_ID_TYPE`,
    public var `Anonymous`: `FILE_ID_DESCRIPTOR_0`,
)
// UNSUPPORTED Rust 1578:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FILE_ID_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1583:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union FILE_ID_DESCRIPTOR_0 {
//     pub FileId: i64,
//     pub ObjectId: windows_sys::core::GUID,
//     pub ExtendedFileId: FILE_ID_128,
// }

// UNSUPPORTED Rust 1590:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FILE_ID_DESCRIPTOR_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1595:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FILE_ID_EXTD_DIR_INFO {
//     pub NextEntryOffset: u32,
//     pub FileIndex: u32,
//     pub CreationTime: i64,
//     pub LastAccessTime: i64,
//     pub LastWriteTime: i64,
//     pub ChangeTime: i64,
//     pub EndOfFile: i64,
//     pub AllocationSize: i64,
//     pub FileAttributes: u32,
//     pub FileNameLength: u32,
//     pub EaSize: u32,
//     pub ReparsePointTag: u32,
//     pub FileId: FILE_ID_128,
//     pub FileName: [u16; 1],
// }

// UNSUPPORTED Rust 1613:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FILE_ID_EXTD_DIR_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FILE_ID_INFO` (
    public var `VolumeSerialNumber`: ULong,
    public var `FileId`: `FILE_ID_128`,
)
public typealias `FILE_ID_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FILE_INFO_2` (
    public var `fi2_id`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FILE_INFO_3` (
    public var `fi3_id`: UInt,
    public var `fi3_permissions`: `FILE_INFO_FLAGS_PERMISSIONS`,
    public var `fi3_num_locks`: UInt,
    public var `fi3_pathname`: `windows_sys`.`core`.`PWSTR`,
    public var `fi3_username`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 1639:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FILE_INFO_3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `FILE_INFO_BY_HANDLE_CLASS` = Int;
public typealias `FILE_INFO_FLAGS_PERMISSIONS` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FILE_IO_PRIORITY_HINT_INFO` (
    public var `PriorityHint`: `PRIORITY_HINT`,
)
public const val `FILE_LIST_DIRECTORY`: `FILE_ACCESS_RIGHTS` = 1u;
// UNSUPPORTED Rust 1652:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FILE_NAME_INFO {
//     pub FileNameLength: u32,
//     pub FileName: [u16; 1],
// }

// UNSUPPORTED Rust 1658:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FILE_NAME_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FILE_NAME_NORMALIZED`: `GETFINALPATHNAMEBYHANDLE_FLAGS` = 0u;
public const val `FILE_NAME_OPENED`: `GETFINALPATHNAMEBYHANDLE_FLAGS` = 8u;
public typealias `FILE_NOTIFY_CHANGE` = UInt;
public const val `FILE_NOTIFY_CHANGE_ATTRIBUTES`: `FILE_NOTIFY_CHANGE` = 4u;
public const val `FILE_NOTIFY_CHANGE_CREATION`: `FILE_NOTIFY_CHANGE` = 64u;
public const val `FILE_NOTIFY_CHANGE_DIR_NAME`: `FILE_NOTIFY_CHANGE` = 2u;
public const val `FILE_NOTIFY_CHANGE_FILE_NAME`: `FILE_NOTIFY_CHANGE` = 1u;
public const val `FILE_NOTIFY_CHANGE_LAST_ACCESS`: `FILE_NOTIFY_CHANGE` = 32u;
public const val `FILE_NOTIFY_CHANGE_LAST_WRITE`: `FILE_NOTIFY_CHANGE` = 16u;
public const val `FILE_NOTIFY_CHANGE_SECURITY`: `FILE_NOTIFY_CHANGE` = 256u;
public const val `FILE_NOTIFY_CHANGE_SIZE`: `FILE_NOTIFY_CHANGE` = 8u;
// UNSUPPORTED Rust 1674:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FILE_NOTIFY_EXTENDED_INFORMATION {
//     pub NextEntryOffset: u32,
//     pub Action: FILE_ACTION,
//     pub CreationTime: i64,
//     pub LastModificationTime: i64,
//     pub LastChangeTime: i64,
//     pub LastAccessTime: i64,
//     pub AllocatedLength: i64,
//     pub FileSize: i64,
//     pub FileAttributes: u32,
//     pub Anonymous: FILE_NOTIFY_EXTENDED_INFORMATION_0,
//     pub FileId: i64,
//     pub ParentFileId: i64,
//     pub FileNameLength: u32,
//     pub FileName: [u16; 1],
// }

// UNSUPPORTED Rust 1692:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FILE_NOTIFY_EXTENDED_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1697:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union FILE_NOTIFY_EXTENDED_INFORMATION_0 {
//     pub ReparsePointTag: u32,
//     pub EaSize: u32,
// }

// UNSUPPORTED Rust 1703:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FILE_NOTIFY_EXTENDED_INFORMATION_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1708:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FILE_NOTIFY_INFORMATION {
//     pub NextEntryOffset: u32,
//     pub Action: FILE_ACTION,
//     pub FileNameLength: u32,
//     pub FileName: [u16; 1],
// }

// UNSUPPORTED Rust 1716:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FILE_NOTIFY_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FILE_PROVIDER_COMPRESSION_LZX`: UInt = 1u;
public const val `FILE_PROVIDER_COMPRESSION_XPRESS16K`: UInt = 3u;
public const val `FILE_PROVIDER_COMPRESSION_XPRESS4K`: UInt = 0u;
public const val `FILE_PROVIDER_COMPRESSION_XPRESS8K`: UInt = 2u;
public const val `FILE_READ_ATTRIBUTES`: `FILE_ACCESS_RIGHTS` = 128u;
public const val `FILE_READ_DATA`: `FILE_ACCESS_RIGHTS` = 1u;
public const val `FILE_READ_EA`: `FILE_ACCESS_RIGHTS` = 8u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FILE_REMOTE_PROTOCOL_INFO` (
    public var `StructureVersion`: UShort,
    public var `StructureSize`: UShort,
    public var `Protocol`: UInt,
    public var `ProtocolMajorVersion`: UShort,
    public var `ProtocolMinorVersion`: UShort,
    public var `ProtocolRevision`: UShort,
    public var `Reserved`: UShort,
    public var `Flags`: UInt,
    public var `GenericReserved`: `FILE_REMOTE_PROTOCOL_INFO_0`,
    public var `ProtocolSpecific`: `FILE_REMOTE_PROTOCOL_INFO_1`,
)
// UNSUPPORTED Rust 1742:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FILE_REMOTE_PROTOCOL_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1747:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FILE_REMOTE_PROTOCOL_INFO_0 {
//     pub Reserved: [u32; 8],
// }

// UNSUPPORTED Rust 1752:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FILE_REMOTE_PROTOCOL_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1757:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union FILE_REMOTE_PROTOCOL_INFO_1 {
//     pub Smb2: FILE_REMOTE_PROTOCOL_INFO_1_0,
//     pub Reserved: [u32; 16],
// }

// UNSUPPORTED Rust 1763:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FILE_REMOTE_PROTOCOL_INFO_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FILE_REMOTE_PROTOCOL_INFO_1_0` (
    public var `Server`: `FILE_REMOTE_PROTOCOL_INFO_1_0_0`,
    public var `Share`: `FILE_REMOTE_PROTOCOL_INFO_1_0_1`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FILE_REMOTE_PROTOCOL_INFO_1_0_0` (
    public var `Capabilities`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FILE_REMOTE_PROTOCOL_INFO_1_0_1` (
    public var `Capabilities`: UInt,
    public var `ShareFlags`: UInt,
)
// UNSUPPORTED Rust 1785:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FILE_RENAME_INFO {
//     pub Anonymous: FILE_RENAME_INFO_0,
//     pub RootDirectory: super::super::Foundation::HANDLE,
//     pub FileNameLength: u32,
//     pub FileName: [u16; 1],
// }

// UNSUPPORTED Rust 1793:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FILE_RENAME_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1798:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union FILE_RENAME_INFO_0 {
//     pub ReplaceIfExists: bool,
//     pub Flags: u32,
// }

// UNSUPPORTED Rust 1804:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FILE_RENAME_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1809:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union FILE_SEGMENT_ELEMENT {
//     pub Buffer: *mut core::ffi::c_void,
//     pub Alignment: u64,
// }

// UNSUPPORTED Rust 1815:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FILE_SEGMENT_ELEMENT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FILE_SHARE_DELETE`: `FILE_SHARE_MODE` = 4u;
public typealias `FILE_SHARE_MODE` = UInt;
public const val `FILE_SHARE_NONE`: `FILE_SHARE_MODE` = 0u;
public const val `FILE_SHARE_READ`: `FILE_SHARE_MODE` = 1u;
public const val `FILE_SHARE_WRITE`: `FILE_SHARE_MODE` = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FILE_STANDARD_INFO` (
    public var `AllocationSize`: Long,
    public var `EndOfFile`: Long,
    public var `NumberOfLinks`: UInt,
    public var `DeletePending`: Boolean,
    public var `Directory`: Boolean,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FILE_STORAGE_INFO` (
    public var `LogicalBytesPerSector`: UInt,
    public var `PhysicalBytesPerSectorForAtomicity`: UInt,
    public var `PhysicalBytesPerSectorForPerformance`: UInt,
    public var `FileSystemEffectivePhysicalBytesPerSectorForAtomicity`: UInt,
    public var `Flags`: UInt,
    public var `ByteOffsetForSectorAlignment`: UInt,
    public var `ByteOffsetForPartitionAlignment`: UInt,
)
// UNSUPPORTED Rust 1845:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FILE_STREAM_INFO {
//     pub NextEntryOffset: u32,
//     pub StreamNameLength: u32,
//     pub StreamSize: i64,
//     pub StreamAllocationSize: i64,
//     pub StreamName: [u16; 1],
// }

// UNSUPPORTED Rust 1854:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FILE_STREAM_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FILE_TRAVERSE`: `FILE_ACCESS_RIGHTS` = 32u;
public typealias `FILE_TYPE` = UInt;
public const val `FILE_TYPE_CHAR`: `FILE_TYPE` = 2u;
public const val `FILE_TYPE_DISK`: `FILE_TYPE` = 1u;
public const val `FILE_TYPE_PIPE`: `FILE_TYPE` = 3u;
public const val `FILE_TYPE_REMOTE`: `FILE_TYPE` = 32768u;
public const val `FILE_TYPE_UNKNOWN`: `FILE_TYPE` = 0u;
public const val `FILE_VER_GET_LOCALISED`: `GET_FILE_VERSION_INFO_FLAGS` = 1u;
public const val `FILE_VER_GET_NEUTRAL`: `GET_FILE_VERSION_INFO_FLAGS` = 2u;
public const val `FILE_VER_GET_PREFETCHED`: `GET_FILE_VERSION_INFO_FLAGS` = 4u;
public const val `FILE_WRITE_ATTRIBUTES`: `FILE_ACCESS_RIGHTS` = 256u;
public const val `FILE_WRITE_DATA`: `FILE_ACCESS_RIGHTS` = 2u;
public const val `FILE_WRITE_EA`: `FILE_ACCESS_RIGHTS` = 16u;
public typealias `FILE_WRITE_FLAGS` = Int;
public const val `FILE_WRITE_FLAGS_NONE`: `FILE_WRITE_FLAGS` = 0;
public const val `FILE_WRITE_FLAGS_WRITE_THROUGH`: `FILE_WRITE_FLAGS` = 1;
public typealias `FINDEX_INFO_LEVELS` = Int;
public typealias `FINDEX_SEARCH_OPS` = Int;
public const val `FIND_FIRST_EX_CASE_SENSITIVE`: `FIND_FIRST_EX_FLAGS` = 1u;
public typealias `FIND_FIRST_EX_FLAGS` = UInt;
public const val `FIND_FIRST_EX_LARGE_FETCH`: `FIND_FIRST_EX_FLAGS` = 2u;
public const val `FIND_FIRST_EX_ON_DISK_ENTRIES_ONLY`: `FIND_FIRST_EX_FLAGS` = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FIO_CONTEXT` (
    public var `m_dwTempHack`: UInt,
    public var `m_dwSignature`: UInt,
    public var `m_hFile`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `m_dwLinesOffset`: UInt,
    public var `m_dwHeaderLength`: UInt,
)
// UNSUPPORTED Rust 1890:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for FIO_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FileAlignmentInfo`: `FILE_INFO_BY_HANDLE_CLASS` = 17;
public const val `FileAllocationInfo`: `FILE_INFO_BY_HANDLE_CLASS` = 5;
public const val `FileAttributeTagInfo`: `FILE_INFO_BY_HANDLE_CLASS` = 9;
public const val `FileBasicInfo`: `FILE_INFO_BY_HANDLE_CLASS` = 0;
public const val `FileCaseSensitiveInfo`: `FILE_INFO_BY_HANDLE_CLASS` = 23;
public const val `FileCompressionInfo`: `FILE_INFO_BY_HANDLE_CLASS` = 8;
public const val `FileDispositionInfo`: `FILE_INFO_BY_HANDLE_CLASS` = 4;
public const val `FileDispositionInfoEx`: `FILE_INFO_BY_HANDLE_CLASS` = 21;
public const val `FileEndOfFileInfo`: `FILE_INFO_BY_HANDLE_CLASS` = 6;
public const val `FileFullDirectoryInfo`: `FILE_INFO_BY_HANDLE_CLASS` = 14;
public const val `FileFullDirectoryRestartInfo`: `FILE_INFO_BY_HANDLE_CLASS` = 15;
public const val `FileIdBothDirectoryInfo`: `FILE_INFO_BY_HANDLE_CLASS` = 10;
public const val `FileIdBothDirectoryRestartInfo`: `FILE_INFO_BY_HANDLE_CLASS` = 11;
public const val `FileIdExtdDirectoryInfo`: `FILE_INFO_BY_HANDLE_CLASS` = 19;
public const val `FileIdExtdDirectoryRestartInfo`: `FILE_INFO_BY_HANDLE_CLASS` = 20;
public const val `FileIdInfo`: `FILE_INFO_BY_HANDLE_CLASS` = 18;
public const val `FileIdType`: `FILE_ID_TYPE` = 0;
public const val `FileIoPriorityHintInfo`: `FILE_INFO_BY_HANDLE_CLASS` = 12;
public const val `FileNameInfo`: `FILE_INFO_BY_HANDLE_CLASS` = 2;
public const val `FileNormalizedNameInfo`: `FILE_INFO_BY_HANDLE_CLASS` = 24;
public const val `FileRemoteProtocolInfo`: `FILE_INFO_BY_HANDLE_CLASS` = 13;
public const val `FileRenameInfo`: `FILE_INFO_BY_HANDLE_CLASS` = 3;
public const val `FileRenameInfoEx`: `FILE_INFO_BY_HANDLE_CLASS` = 22;
public const val `FileStandardInfo`: `FILE_INFO_BY_HANDLE_CLASS` = 1;
public const val `FileStorageInfo`: `FILE_INFO_BY_HANDLE_CLASS` = 16;
public const val `FileStreamInfo`: `FILE_INFO_BY_HANDLE_CLASS` = 7;
public const val `FindExInfoBasic`: `FINDEX_INFO_LEVELS` = 1;
public const val `FindExInfoMaxInfoLevel`: `FINDEX_INFO_LEVELS` = 2;
public const val `FindExInfoStandard`: `FINDEX_INFO_LEVELS` = 0;
public const val `FindExSearchLimitToDevices`: `FINDEX_SEARCH_OPS` = 2;
public const val `FindExSearchLimitToDirectories`: `FINDEX_SEARCH_OPS` = 1;
public const val `FindExSearchMaxSearchOp`: `FINDEX_SEARCH_OPS` = 3;
public const val `FindExSearchNameMatch`: `FINDEX_SEARCH_OPS` = 0;
public const val `FindStreamInfoMaxInfoLevel`: `STREAM_INFO_LEVELS` = 1;
public const val `FindStreamInfoStandard`: `STREAM_INFO_LEVELS` = 0;
public typealias `GETFINALPATHNAMEBYHANDLE_FLAGS` = UInt;
public typealias `GET_FILEEX_INFO_LEVELS` = Int;
public typealias `GET_FILE_VERSION_INFO_FLAGS` = UInt;
public const val `GET_TAPE_DRIVE_INFORMATION`: `GET_TAPE_DRIVE_PARAMETERS_OPERATION` = 1u;
public typealias `GET_TAPE_DRIVE_PARAMETERS_OPERATION` = UInt;
public const val `GET_TAPE_MEDIA_INFORMATION`: `GET_TAPE_DRIVE_PARAMETERS_OPERATION` = 0u;
public const val `GetFileExInfoStandard`: `GET_FILEEX_INFO_LEVELS` = 0;
public const val `GetFileExMaxInfoLevel`: `GET_FILEEX_INFO_LEVELS` = 1;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HIORING` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
public const val `INVALID_FILE_ATTRIBUTES`: UInt = 4294967295u;
public const val `INVALID_FILE_SIZE`: UInt = 4294967295u;
public const val `INVALID_SET_FILE_POINTER`: UInt = 4294967295u;
public const val `IOCTL_VOLUME_ALLOCATE_BC_STREAM`: UInt = 5685312u;
public const val `IOCTL_VOLUME_BASE`: UInt = 86u;
public const val `IOCTL_VOLUME_BC_VERSION`: UInt = 1u;
public const val `IOCTL_VOLUME_FREE_BC_STREAM`: UInt = 5685316u;
public const val `IOCTL_VOLUME_GET_BC_PROPERTIES`: UInt = 5652540u;
public const val `IOCTL_VOLUME_GET_CSVBLOCKCACHE_CALLBACK`: UInt = 5685352u;
public const val `IOCTL_VOLUME_GET_GPT_ATTRIBUTES`: UInt = 5636152u;
public const val `IOCTL_VOLUME_GET_VOLUME_DISK_EXTENTS`: UInt = 5636096u;
public const val `IOCTL_VOLUME_IS_CLUSTERED`: UInt = 5636144u;
public const val `IOCTL_VOLUME_IS_CSV`: UInt = 5636192u;
public const val `IOCTL_VOLUME_IS_DYNAMIC`: UInt = 5636168u;
public const val `IOCTL_VOLUME_IS_IO_CAPABLE`: UInt = 5636116u;
public const val `IOCTL_VOLUME_IS_OFFLINE`: UInt = 5636112u;
public const val `IOCTL_VOLUME_IS_PARTITION`: UInt = 5636136u;
public const val `IOCTL_VOLUME_LOGICAL_TO_PHYSICAL`: UInt = 5636128u;
public const val `IOCTL_VOLUME_OFFLINE`: UInt = 5685260u;
public const val `IOCTL_VOLUME_ONLINE`: UInt = 5685256u;
public const val `IOCTL_VOLUME_PHYSICAL_TO_LOGICAL`: UInt = 5636132u;
public const val `IOCTL_VOLUME_POST_ONLINE`: UInt = 5685348u;
public const val `IOCTL_VOLUME_PREPARE_FOR_CRITICAL_IO`: UInt = 5685324u;
public const val `IOCTL_VOLUME_PREPARE_FOR_SHRINK`: UInt = 5685340u;
public const val `IOCTL_VOLUME_QUERY_ALLOCATION_HINT`: UInt = 5652562u;
public const val `IOCTL_VOLUME_QUERY_FAILOVER_SET`: UInt = 5636120u;
public const val `IOCTL_VOLUME_QUERY_MINIMUM_SHRINK_SIZE`: UInt = 5652568u;
public const val `IOCTL_VOLUME_QUERY_VOLUME_NUMBER`: UInt = 5636124u;
public const val `IOCTL_VOLUME_READ_PLEX`: UInt = 5652526u;
public const val `IOCTL_VOLUME_SET_GPT_ATTRIBUTES`: UInt = 5636148u;
public const val `IOCTL_VOLUME_SUPPORTS_ONLINE_OFFLINE`: UInt = 5636100u;
public const val `IOCTL_VOLUME_UPDATE_PROPERTIES`: UInt = 5636180u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IORING_BUFFER_INFO` (
    public var `Address`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Length`: UInt,
)
// UNSUPPORTED Rust 1977:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IORING_BUFFER_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IORING_BUFFER_REF` (
    public var `Kind`: `IORING_REF_KIND`,
    public var `Buffer`: `IORING_BUFFER_REF_0`,
)
// UNSUPPORTED Rust 1988:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IORING_BUFFER_REF {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1993:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IORING_BUFFER_REF_0 {
//     pub Address: *mut core::ffi::c_void,
//     pub IndexAndOffset: IORING_REGISTERED_BUFFER,
// }

// UNSUPPORTED Rust 1999:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IORING_BUFFER_REF_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IORING_CAPABILITIES` (
    public var `MaxVersion`: `IORING_VERSION`,
    public var `MaxSubmissionQueueSize`: UInt,
    public var `MaxCompletionQueueSize`: UInt,
    public var `FeatureFlags`: `IORING_FEATURE_FLAGS`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IORING_CQE` (
    public var `UserData`: ULong,
    public var `ResultCode`: `windows_sys`.`core`.`HRESULT`,
    public var `Information`: ULong,
)
public typealias `IORING_CREATE_ADVISORY_FLAGS` = Int;
public const val `IORING_CREATE_ADVISORY_FLAGS_NONE`: `IORING_CREATE_ADVISORY_FLAGS` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IORING_CREATE_FLAGS` (
    public var `Required`: `IORING_CREATE_REQUIRED_FLAGS`,
    public var `Advisory`: `IORING_CREATE_ADVISORY_FLAGS`,
)
public typealias `IORING_CREATE_REQUIRED_FLAGS` = Int;
public const val `IORING_CREATE_REQUIRED_FLAGS_NONE`: `IORING_CREATE_REQUIRED_FLAGS` = 0;
public typealias `IORING_FEATURE_FLAGS` = Int;
public const val `IORING_FEATURE_FLAGS_NONE`: `IORING_FEATURE_FLAGS` = 0;
public const val `IORING_FEATURE_SET_COMPLETION_EVENT`: `IORING_FEATURE_FLAGS` = 2;
public const val `IORING_FEATURE_UM_EMULATION`: `IORING_FEATURE_FLAGS` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `IORING_HANDLE_REF` (
    public var `Kind`: `IORING_REF_KIND`,
    public var `Handle`: `IORING_HANDLE_REF_0`,
)
// UNSUPPORTED Rust 2039:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IORING_HANDLE_REF {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2044:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union IORING_HANDLE_REF_0 {
//     pub Handle: super::super::Foundation::HANDLE,
//     pub Index: u32,
// }

// UNSUPPORTED Rust 2050:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for IORING_HANDLE_REF_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IORING_INFO` (
    public var `IoRingVersion`: `IORING_VERSION`,
    public var `Flags`: `IORING_CREATE_FLAGS`,
    public var `SubmissionQueueSize`: UInt,
    public var `CompletionQueueSize`: UInt,
)
public const val `IORING_OP_CANCEL`: `IORING_OP_CODE` = 4;
public typealias `IORING_OP_CODE` = Int;
public const val `IORING_OP_FLUSH`: `IORING_OP_CODE` = 6;
public const val `IORING_OP_NOP`: `IORING_OP_CODE` = 0;
public const val `IORING_OP_READ`: `IORING_OP_CODE` = 1;
public const val `IORING_OP_REGISTER_BUFFERS`: `IORING_OP_CODE` = 3;
public const val `IORING_OP_REGISTER_FILES`: `IORING_OP_CODE` = 2;
public const val `IORING_OP_WRITE`: `IORING_OP_CODE` = 5;
public typealias `IORING_REF_KIND` = Int;
public const val `IORING_REF_RAW`: `IORING_REF_KIND` = 0;
public const val `IORING_REF_REGISTERED`: `IORING_REF_KIND` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `IORING_REGISTERED_BUFFER` (
    public var `BufferIndex`: UInt,
    public var `Offset`: UInt,
)
public typealias `IORING_SQE_FLAGS` = Int;
public typealias `IORING_VERSION` = Int;
public const val `IORING_VERSION_1`: `IORING_VERSION` = 1;
public const val `IORING_VERSION_2`: `IORING_VERSION` = 2;
public const val `IORING_VERSION_3`: `IORING_VERSION` = 300;
public const val `IORING_VERSION_INVALID`: `IORING_VERSION` = 0;
public const val `IOSQE_FLAGS_DRAIN_PRECEDING_OPS`: `IORING_SQE_FLAGS` = 1;
public const val `IOSQE_FLAGS_NONE`: `IORING_SQE_FLAGS` = 0;
public const val `IoPriorityHintLow`: `PRIORITY_HINT` = 1;
public const val `IoPriorityHintNormal`: `PRIORITY_HINT` = 2;
public const val `IoPriorityHintVeryLow`: `PRIORITY_HINT` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KCRM_MARSHAL_HEADER` (
    public var `VersionMajor`: UInt,
    public var `VersionMinor`: UInt,
    public var `NumProtocols`: UInt,
    public var `Unused`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `KCRM_PROTOCOL_BLOB` (
    public var `ProtocolId`: `windows_sys`.`core`.`GUID`,
    public var `StaticInfoLength`: UInt,
    public var `TransactionIdInfoLength`: UInt,
    public var `Unused1`: UInt,
    public var `Unused2`: UInt,
)
// UNSUPPORTED Rust 2108:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct KCRM_TRANSACTION_BLOB {
//     pub UOW: windows_sys::core::GUID,
//     pub TmIdentity: windows_sys::core::GUID,
//     pub IsolationLevel: u32,
//     pub IsolationFlags: u32,
//     pub Timeout: u32,
//     pub Description: [u16; 64],
// }

// UNSUPPORTED Rust 2118:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KCRM_TRANSACTION_BLOB {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `KTM_MARSHAL_BLOB_VERSION_MAJOR`: UInt = 1u;
public const val `KTM_MARSHAL_BLOB_VERSION_MINOR`: UInt = 1u;
public const val `LOCKFILE_EXCLUSIVE_LOCK`: `LOCK_FILE_FLAGS` = 2u;
public const val `LOCKFILE_FAIL_IMMEDIATELY`: `LOCK_FILE_FLAGS` = 1u;
public typealias `LOCK_FILE_FLAGS` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LOG_MANAGEMENT_CALLBACKS` (
    public var `CallbackContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `AdvanceTailCallback`: `PLOG_TAIL_ADVANCE_CALLBACK`,
    public var `LogFullHandlerCallback`: `PLOG_FULL_HANDLER_CALLBACK`,
    public var `LogUnpinnedCallback`: `PLOG_UNPINNED_CALLBACK`,
)
// UNSUPPORTED Rust 2136:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LOG_MANAGEMENT_CALLBACKS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `LOG_POLICY_OVERWRITE`: UInt = 1u;
public const val `LOG_POLICY_PERSIST`: UInt = 2u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPPROGRESS_ROUTINE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(Long, Long, Long, Long, UInt, `LPPROGRESS_ROUTINE_CALLBACK_REASON`, `super`.`super`.`Foundation`.`HANDLE`, `super`.`super`.`Foundation`.`HANDLE`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `COPYPROGRESSROUTINE_PROGRESS`>>>;
public typealias `LPPROGRESS_ROUTINE_CALLBACK_REASON` = UInt;
public const val `LZERROR_BADINHANDLE`: Int = -1;
public const val `LZERROR_BADOUTHANDLE`: Int = -2;
public const val `LZERROR_BADVALUE`: Int = -7;
public const val `LZERROR_GLOBALLOC`: Int = -5;
public const val `LZERROR_GLOBLOCK`: Int = -6;
public const val `LZERROR_READ`: Int = -3;
public const val `LZERROR_UNKNOWNALG`: Int = -8;
public const val `LZERROR_WRITE`: Int = -4;
public typealias `LZOPENFILE_STYLE` = UShort;
public const val `MAXIMUM_REPARSE_DATA_BUFFER_SIZE`: UInt = 16384u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `MAXMEDIALABEL` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> UInt>>>;
public const val `MAX_RESOURCEMANAGER_DESCRIPTION_LENGTH`: UInt = 64u;
public const val `MAX_SID_SIZE`: UInt = 256u;
public const val `MAX_TRANSACTION_DESCRIPTION_LENGTH`: UInt = 64u;
public const val `MOVEFILE_COPY_ALLOWED`: `MOVE_FILE_FLAGS` = 2u;
public const val `MOVEFILE_CREATE_HARDLINK`: `MOVE_FILE_FLAGS` = 16u;
public const val `MOVEFILE_DELAY_UNTIL_REBOOT`: `MOVE_FILE_FLAGS` = 4u;
public const val `MOVEFILE_FAIL_IF_NOT_TRACKABLE`: `MOVE_FILE_FLAGS` = 32u;
public const val `MOVEFILE_REPLACE_EXISTING`: `MOVE_FILE_FLAGS` = 1u;
public const val `MOVEFILE_WRITE_THROUGH`: `MOVE_FILE_FLAGS` = 8u;
public typealias `MOVE_FILE_FLAGS` = UInt;
public const val `MaximumFileIdType`: `FILE_ID_TYPE` = 3;
public const val `MaximumFileInfoByHandleClass`: `FILE_INFO_BY_HANDLE_CLASS` = 25;
public const val `MaximumIoPriorityHintType`: `PRIORITY_HINT` = 3;
// UNSUPPORTED Rust 2169:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MediaLabelInfo {
//     pub LabelType: [u16; 64],
//     pub LabelIDSize: u32,
//     pub LabelID: [u8; 256],
//     pub LabelAppDescr: [u16; 256],
// }

// UNSUPPORTED Rust 2177:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MediaLabelInfo {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NAME_CACHE_CONTEXT` (
    public var `m_dwSignature`: UInt,
)
public const val `NTMSMLI_MAXAPPDESCR`: UInt = 256u;
public const val `NTMSMLI_MAXIDSIZE`: UInt = 256u;
public const val `NTMSMLI_MAXTYPE`: UInt = 64u;
public const val `NTMS_ALLOCATE_ERROR_IF_UNAVAILABLE`: `NtmsAllocateOptions` = 4;
public const val `NTMS_ALLOCATE_FROMSCRATCH`: `NtmsAllocationPolicy` = 1;
public const val `NTMS_ALLOCATE_NEW`: `NtmsAllocateOptions` = 1;
public const val `NTMS_ALLOCATE_NEXT`: `NtmsAllocateOptions` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NTMS_ALLOCATION_INFORMATION` (
    public var `dwSize`: UInt,
    public var `lpReserved`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `AllocatedFrom`: `windows_sys`.`core`.`GUID`,
)
// UNSUPPORTED Rust 2201:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NTMS_ALLOCATION_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NTMS_APPLICATIONNAME_LENGTH`: UInt = 64u;
public const val `NTMS_ASYNCOP_MOUNT`: `NtmsAsyncOperations` = 1;
public const val `NTMS_ASYNCSTATE_COMPLETE`: `NtmsAsyncStatus` = 4;
public const val `NTMS_ASYNCSTATE_INPROCESS`: `NtmsAsyncStatus` = 3;
public const val `NTMS_ASYNCSTATE_QUEUED`: `NtmsAsyncStatus` = 0;
public const val `NTMS_ASYNCSTATE_WAIT_OPERATOR`: `NtmsAsyncStatus` = 2;
public const val `NTMS_ASYNCSTATE_WAIT_RESOURCE`: `NtmsAsyncStatus` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NTMS_ASYNC_IO` (
    public var `OperationId`: `windows_sys`.`core`.`GUID`,
    public var `EventId`: `windows_sys`.`core`.`GUID`,
    public var `dwOperationType`: UInt,
    public var `dwResult`: UInt,
    public var `dwAsyncState`: UInt,
    public var `hEvent`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `bOnStateChange`: `windows_sys`.`core`.`BOOL`,
)
// UNSUPPORTED Rust 2224:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NTMS_ASYNC_IO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NTMS_BARCODESTATE_OK`: `NtmsBarCodeState` = 1;
public const val `NTMS_BARCODESTATE_UNREADABLE`: `NtmsBarCodeState` = 2;
public const val `NTMS_BARCODE_LENGTH`: UInt = 64u;
public const val `NTMS_CHANGER`: `NtmsObjectsTypes` = 2;
// UNSUPPORTED Rust 2233:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NTMS_CHANGERINFORMATIONA {
//     pub Number: u32,
//     pub ChangerType: windows_sys::core::GUID,
//     pub szSerialNumber: [i8; 32],
//     pub szRevision: [i8; 32],
//     pub szDeviceName: [i8; 64],
//     pub ScsiPort: u16,
//     pub ScsiBus: u16,
//     pub ScsiTarget: u16,
//     pub ScsiLun: u16,
//     pub Library: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 2247:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NTMS_CHANGERINFORMATIONA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2252:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NTMS_CHANGERINFORMATIONW {
//     pub Number: u32,
//     pub ChangerType: windows_sys::core::GUID,
//     pub szSerialNumber: [u16; 32],
//     pub szRevision: [u16; 32],
//     pub szDeviceName: [u16; 64],
//     pub ScsiPort: u16,
//     pub ScsiBus: u16,
//     pub ScsiTarget: u16,
//     pub ScsiLun: u16,
//     pub Library: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 2266:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NTMS_CHANGERINFORMATIONW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2271:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NTMS_CHANGERTYPEINFORMATIONA {
//     pub szVendor: [i8; 128],
//     pub szProduct: [i8; 128],
//     pub DeviceType: u32,
// }

// UNSUPPORTED Rust 2278:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NTMS_CHANGERTYPEINFORMATIONA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2283:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NTMS_CHANGERTYPEINFORMATIONW {
//     pub szVendor: [u16; 128],
//     pub szProduct: [u16; 128],
//     pub DeviceType: u32,
// }

// UNSUPPORTED Rust 2290:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NTMS_CHANGERTYPEINFORMATIONW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NTMS_CHANGER_TYPE`: `NtmsObjectsTypes` = 3;
public const val `NTMS_COMPUTER`: `NtmsObjectsTypes` = 4;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NTMS_COMPUTERINFORMATION` (
    public var `dwLibRequestPurgeTime`: UInt,
    public var `dwOpRequestPurgeTime`: UInt,
    public var `dwLibRequestFlags`: UInt,
    public var `dwOpRequestFlags`: UInt,
    public var `dwMediaPoolPolicy`: UInt,
)
public const val `NTMS_COMPUTERNAME_LENGTH`: UInt = 64u;
public const val `NTMS_CONTROL_ACCESS`: `NtmsAccessMask` = 4;
public const val `NTMS_CREATE_NEW`: `NtmsCreateOptions` = 2;
public const val `NTMS_DEALLOCATE_TOSCRATCH`: `NtmsDeallocationPolicy` = 1;
public const val `NTMS_DESCRIPTION_LENGTH`: UInt = 127u;
public const val `NTMS_DEVICENAME_LENGTH`: UInt = 64u;
public const val `NTMS_DISMOUNT_DEFERRED`: `NtmsDismountOptions` = 1;
public const val `NTMS_DISMOUNT_IMMEDIATE`: `NtmsDismountOptions` = 2;
public const val `NTMS_DOORSTATE_CLOSED`: `NtmsDoorState` = 1;
public const val `NTMS_DOORSTATE_OPEN`: `NtmsDoorState` = 2;
public const val `NTMS_DOORSTATE_UNKNOWN`: `NtmsDoorState` = 0;
public const val `NTMS_DRIVE`: `NtmsObjectsTypes` = 5;
// UNSUPPORTED Rust 2318:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NTMS_DRIVEINFORMATIONA {
//     pub Number: u32,
//     pub State: u32,
//     pub DriveType: windows_sys::core::GUID,
//     pub szDeviceName: [i8; 64],
//     pub szSerialNumber: [i8; 32],
//     pub szRevision: [i8; 32],
//     pub ScsiPort: u16,
//     pub ScsiBus: u16,
//     pub ScsiTarget: u16,
//     pub ScsiLun: u16,
//     pub dwMountCount: u32,
//     pub LastCleanedTs: super::super::Foundation::SYSTEMTIME,
//     pub SavedPartitionId: windows_sys::core::GUID,
//     pub Library: windows_sys::core::GUID,
//     pub Reserved: windows_sys::core::GUID,
//     pub dwDeferDismountDelay: u32,
// }

// UNSUPPORTED Rust 2338:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NTMS_DRIVEINFORMATIONA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2343:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NTMS_DRIVEINFORMATIONW {
//     pub Number: u32,
//     pub State: u32,
//     pub DriveType: windows_sys::core::GUID,
//     pub szDeviceName: [u16; 64],
//     pub szSerialNumber: [u16; 32],
//     pub szRevision: [u16; 32],
//     pub ScsiPort: u16,
//     pub ScsiBus: u16,
//     pub ScsiTarget: u16,
//     pub ScsiLun: u16,
//     pub dwMountCount: u32,
//     pub LastCleanedTs: super::super::Foundation::SYSTEMTIME,
//     pub SavedPartitionId: windows_sys::core::GUID,
//     pub Library: windows_sys::core::GUID,
//     pub Reserved: windows_sys::core::GUID,
//     pub dwDeferDismountDelay: u32,
// }

// UNSUPPORTED Rust 2363:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NTMS_DRIVEINFORMATIONW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NTMS_DRIVESTATE_BEING_CLEANED`: `NtmsDriveState` = 6;
public const val `NTMS_DRIVESTATE_DISMOUNTABLE`: `NtmsDriveState` = 7;
public const val `NTMS_DRIVESTATE_DISMOUNTED`: `NtmsDriveState` = 0;
public const val `NTMS_DRIVESTATE_LOADED`: `NtmsDriveState` = 2;
public const val `NTMS_DRIVESTATE_MOUNTED`: `NtmsDriveState` = 1;
public const val `NTMS_DRIVESTATE_UNLOADED`: `NtmsDriveState` = 5;
// UNSUPPORTED Rust 2374:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NTMS_DRIVETYPEINFORMATIONA {
//     pub szVendor: [i8; 128],
//     pub szProduct: [i8; 128],
//     pub NumberOfHeads: u32,
//     pub DeviceType: FILE_DEVICE_TYPE,
// }

// UNSUPPORTED Rust 2382:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NTMS_DRIVETYPEINFORMATIONA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2387:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NTMS_DRIVETYPEINFORMATIONW {
//     pub szVendor: [u16; 128],
//     pub szProduct: [u16; 128],
//     pub NumberOfHeads: u32,
//     pub DeviceType: FILE_DEVICE_TYPE,
// }

// UNSUPPORTED Rust 2395:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NTMS_DRIVETYPEINFORMATIONW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NTMS_DRIVE_TYPE`: `NtmsObjectsTypes` = 6;
public const val `NTMS_EJECT_ASK_USER`: `NtmsEjectOperation` = 5;
public const val `NTMS_EJECT_FORCE`: `NtmsEjectOperation` = 3;
public const val `NTMS_EJECT_IMMEDIATE`: `NtmsEjectOperation` = 4;
public const val `NTMS_EJECT_QUEUE`: `NtmsEjectOperation` = 2;
public const val `NTMS_EJECT_START`: `NtmsEjectOperation` = 0;
public const val `NTMS_EJECT_STOP`: `NtmsEjectOperation` = 1;
public const val `NTMS_ENUM_DEFAULT`: `NtmsEnumerateOption` = 0;
public const val `NTMS_ENUM_ROOTPOOL`: `NtmsEnumerateOption` = 1;
public const val `NTMS_ERROR_ON_DUPLICATE`: `NtmsCreateNtmsMediaOptions` = 1;
public const val `NTMS_EVENT_COMPLETE`: `NtmsNotificationOperations` = 5;
public const val `NTMS_EVENT_SIGNAL`: `NtmsNotificationOperations` = 4;
// UNSUPPORTED Rust 2412:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NTMS_FILESYSTEM_INFO {
//     pub FileSystemType: [u16; 64],
//     pub VolumeName: [u16; 256],
//     pub SerialNumber: u32,
// }

// UNSUPPORTED Rust 2419:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NTMS_FILESYSTEM_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NTMS_I1_LIBRARYINFORMATION` (
    public var `LibraryType`: UInt,
    public var `CleanerSlot`: `windows_sys`.`core`.`GUID`,
    public var `CleanerSlotDefault`: `windows_sys`.`core`.`GUID`,
    public var `LibrarySupportsDriveCleaning`: `windows_sys`.`core`.`BOOL`,
    public var `BarCodeReaderInstalled`: `windows_sys`.`core`.`BOOL`,
    public var `InventoryMethod`: UInt,
    public var `dwCleanerUsesRemaining`: UInt,
    public var `FirstDriveNumber`: UInt,
    public var `dwNumberOfDrives`: UInt,
    public var `FirstSlotNumber`: UInt,
    public var `dwNumberOfSlots`: UInt,
    public var `FirstDoorNumber`: UInt,
    public var `dwNumberOfDoors`: UInt,
    public var `FirstPortNumber`: UInt,
    public var `dwNumberOfPorts`: UInt,
    public var `FirstChangerNumber`: UInt,
    public var `dwNumberOfChangers`: UInt,
    public var `dwNumberOfMedia`: UInt,
    public var `dwNumberOfMediaTypes`: UInt,
    public var `dwNumberOfLibRequests`: UInt,
    public var `Reserved`: `windows_sys`.`core`.`GUID`,
)
// UNSUPPORTED Rust 2449:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NTMS_I1_LIBREQUESTINFORMATIONA {
//     pub OperationCode: u32,
//     pub OperationOption: u32,
//     pub State: u32,
//     pub PartitionId: windows_sys::core::GUID,
//     pub DriveId: windows_sys::core::GUID,
//     pub PhysMediaId: windows_sys::core::GUID,
//     pub Library: windows_sys::core::GUID,
//     pub SlotId: windows_sys::core::GUID,
//     pub TimeQueued: super::super::Foundation::SYSTEMTIME,
//     pub TimeCompleted: super::super::Foundation::SYSTEMTIME,
//     pub szApplication: [i8; 64],
//     pub szUser: [i8; 64],
//     pub szComputer: [i8; 64],
// }

// UNSUPPORTED Rust 2466:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NTMS_I1_LIBREQUESTINFORMATIONA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2471:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NTMS_I1_LIBREQUESTINFORMATIONW {
//     pub OperationCode: u32,
//     pub OperationOption: u32,
//     pub State: u32,
//     pub PartitionId: windows_sys::core::GUID,
//     pub DriveId: windows_sys::core::GUID,
//     pub PhysMediaId: windows_sys::core::GUID,
//     pub Library: windows_sys::core::GUID,
//     pub SlotId: windows_sys::core::GUID,
//     pub TimeQueued: super::super::Foundation::SYSTEMTIME,
//     pub TimeCompleted: super::super::Foundation::SYSTEMTIME,
//     pub szApplication: [u16; 64],
//     pub szUser: [u16; 64],
//     pub szComputer: [u16; 64],
// }

// UNSUPPORTED Rust 2488:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NTMS_I1_LIBREQUESTINFORMATIONW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NTMS_I1_MESSAGE_LENGTH`: UInt = 127u;
// UNSUPPORTED Rust 2494:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NTMS_I1_OBJECTINFORMATIONA {
//     pub dwSize: u32,
//     pub dwType: u32,
//     pub Created: super::super::Foundation::SYSTEMTIME,
//     pub Modified: super::super::Foundation::SYSTEMTIME,
//     pub ObjectGuid: windows_sys::core::GUID,
//     pub Enabled: windows_sys::core::BOOL,
//     pub dwOperationalState: u32,
//     pub szName: [i8; 64],
//     pub szDescription: [i8; 127],
//     pub Info: NTMS_I1_OBJECTINFORMATIONA_0,
// }

// UNSUPPORTED Rust 2508:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NTMS_I1_OBJECTINFORMATIONA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2513:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NTMS_I1_OBJECTINFORMATIONA_0 {
//     pub Drive: NTMS_DRIVEINFORMATIONA,
//     pub DriveType: NTMS_DRIVETYPEINFORMATIONA,
//     pub Library: NTMS_I1_LIBRARYINFORMATION,
//     pub Changer: NTMS_CHANGERINFORMATIONA,
//     pub ChangerType: NTMS_CHANGERTYPEINFORMATIONA,
//     pub StorageSlot: NTMS_STORAGESLOTINFORMATION,
//     pub IEDoor: NTMS_IEDOORINFORMATION,
//     pub IEPort: NTMS_IEPORTINFORMATION,
//     pub PhysicalMedia: NTMS_I1_PMIDINFORMATIONA,
//     pub LogicalMedia: NTMS_LMIDINFORMATION,
//     pub Partition: NTMS_I1_PARTITIONINFORMATIONA,
//     pub MediaPool: NTMS_MEDIAPOOLINFORMATION,
//     pub MediaType: NTMS_MEDIATYPEINFORMATION,
//     pub LibRequest: NTMS_I1_LIBREQUESTINFORMATIONA,
//     pub OpRequest: NTMS_I1_OPREQUESTINFORMATIONA,
// }

// UNSUPPORTED Rust 2532:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NTMS_I1_OBJECTINFORMATIONA_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2537:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NTMS_I1_OBJECTINFORMATIONW {
//     pub dwSize: u32,
//     pub dwType: u32,
//     pub Created: super::super::Foundation::SYSTEMTIME,
//     pub Modified: super::super::Foundation::SYSTEMTIME,
//     pub ObjectGuid: windows_sys::core::GUID,
//     pub Enabled: windows_sys::core::BOOL,
//     pub dwOperationalState: u32,
//     pub szName: [u16; 64],
//     pub szDescription: [u16; 127],
//     pub Info: NTMS_I1_OBJECTINFORMATIONW_0,
// }

// UNSUPPORTED Rust 2551:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NTMS_I1_OBJECTINFORMATIONW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2556:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NTMS_I1_OBJECTINFORMATIONW_0 {
//     pub Drive: NTMS_DRIVEINFORMATIONW,
//     pub DriveType: NTMS_DRIVETYPEINFORMATIONW,
//     pub Library: NTMS_I1_LIBRARYINFORMATION,
//     pub Changer: NTMS_CHANGERINFORMATIONW,
//     pub ChangerType: NTMS_CHANGERTYPEINFORMATIONW,
//     pub StorageSlot: NTMS_STORAGESLOTINFORMATION,
//     pub IEDoor: NTMS_IEDOORINFORMATION,
//     pub IEPort: NTMS_IEPORTINFORMATION,
//     pub PhysicalMedia: NTMS_I1_PMIDINFORMATIONW,
//     pub LogicalMedia: NTMS_LMIDINFORMATION,
//     pub Partition: NTMS_I1_PARTITIONINFORMATIONW,
//     pub MediaPool: NTMS_MEDIAPOOLINFORMATION,
//     pub MediaType: NTMS_MEDIATYPEINFORMATION,
//     pub LibRequest: NTMS_I1_LIBREQUESTINFORMATIONW,
//     pub OpRequest: NTMS_I1_OPREQUESTINFORMATIONW,
// }

// UNSUPPORTED Rust 2575:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NTMS_I1_OBJECTINFORMATIONW_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2580:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NTMS_I1_OPREQUESTINFORMATIONA {
//     pub Request: u32,
//     pub Submitted: super::super::Foundation::SYSTEMTIME,
//     pub State: u32,
//     pub szMessage: [i8; 127],
//     pub Arg1Type: u32,
//     pub Arg1: windows_sys::core::GUID,
//     pub Arg2Type: u32,
//     pub Arg2: windows_sys::core::GUID,
//     pub szApplication: [i8; 64],
//     pub szUser: [i8; 64],
//     pub szComputer: [i8; 64],
// }

// UNSUPPORTED Rust 2595:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NTMS_I1_OPREQUESTINFORMATIONA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2600:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NTMS_I1_OPREQUESTINFORMATIONW {
//     pub Request: u32,
//     pub Submitted: super::super::Foundation::SYSTEMTIME,
//     pub State: u32,
//     pub szMessage: [u16; 127],
//     pub Arg1Type: u32,
//     pub Arg1: windows_sys::core::GUID,
//     pub Arg2Type: u32,
//     pub Arg2: windows_sys::core::GUID,
//     pub szApplication: [u16; 64],
//     pub szUser: [u16; 64],
//     pub szComputer: [u16; 64],
// }

// UNSUPPORTED Rust 2615:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NTMS_I1_OPREQUESTINFORMATIONW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2620:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NTMS_I1_PARTITIONINFORMATIONA {
//     pub PhysicalMedia: windows_sys::core::GUID,
//     pub LogicalMedia: windows_sys::core::GUID,
//     pub State: u32,
//     pub Side: u16,
//     pub dwOmidLabelIdLength: u32,
//     pub OmidLabelId: [u8; 255],
//     pub szOmidLabelType: [i8; 64],
//     pub szOmidLabelInfo: [i8; 256],
//     pub dwMountCount: u32,
//     pub dwAllocateCount: u32,
// }

// UNSUPPORTED Rust 2634:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NTMS_I1_PARTITIONINFORMATIONA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2639:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NTMS_I1_PARTITIONINFORMATIONW {
//     pub PhysicalMedia: windows_sys::core::GUID,
//     pub LogicalMedia: windows_sys::core::GUID,
//     pub State: u32,
//     pub Side: u16,
//     pub dwOmidLabelIdLength: u32,
//     pub OmidLabelId: [u8; 255],
//     pub szOmidLabelType: [u16; 64],
//     pub szOmidLabelInfo: [u16; 256],
//     pub dwMountCount: u32,
//     pub dwAllocateCount: u32,
// }

// UNSUPPORTED Rust 2653:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NTMS_I1_PARTITIONINFORMATIONW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2658:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NTMS_I1_PMIDINFORMATIONA {
//     pub CurrentLibrary: windows_sys::core::GUID,
//     pub MediaPool: windows_sys::core::GUID,
//     pub Location: windows_sys::core::GUID,
//     pub LocationType: u32,
//     pub MediaType: windows_sys::core::GUID,
//     pub HomeSlot: windows_sys::core::GUID,
//     pub szBarCode: [i8; 64],
//     pub BarCodeState: u32,
//     pub szSequenceNumber: [i8; 32],
//     pub MediaState: u32,
//     pub dwNumberOfPartitions: u32,
// }

// UNSUPPORTED Rust 2673:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NTMS_I1_PMIDINFORMATIONA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2678:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NTMS_I1_PMIDINFORMATIONW {
//     pub CurrentLibrary: windows_sys::core::GUID,
//     pub MediaPool: windows_sys::core::GUID,
//     pub Location: windows_sys::core::GUID,
//     pub LocationType: u32,
//     pub MediaType: windows_sys::core::GUID,
//     pub HomeSlot: windows_sys::core::GUID,
//     pub szBarCode: [u16; 64],
//     pub BarCodeState: u32,
//     pub szSequenceNumber: [u16; 32],
//     pub MediaState: u32,
//     pub dwNumberOfPartitions: u32,
// }

// UNSUPPORTED Rust 2693:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NTMS_I1_PMIDINFORMATIONW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NTMS_IEDOOR`: `NtmsObjectsTypes` = 7;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NTMS_IEDOORINFORMATION` (
    public var `Number`: UInt,
    public var `State`: UInt,
    public var `MaxOpenSecs`: UShort,
    public var `Library`: `windows_sys`.`core`.`GUID`,
)
public const val `NTMS_IEPORT`: `NtmsObjectsTypes` = 8;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NTMS_IEPORTINFORMATION` (
    public var `Number`: UInt,
    public var `Content`: UInt,
    public var `Position`: UInt,
    public var `MaxExtendSecs`: UShort,
    public var `Library`: `windows_sys`.`core`.`GUID`,
)
public const val `NTMS_INITIALIZING`: `NtmsOperationalState` = 10;
public const val `NTMS_INJECT_RETRACT`: `NtmsInjectOperation` = 2;
public const val `NTMS_INJECT_START`: `NtmsInjectOperation` = 0;
public const val `NTMS_INJECT_STARTMANY`: `NtmsInjectOperation` = 3;
public const val `NTMS_INJECT_STOP`: `NtmsInjectOperation` = 1;
public const val `NTMS_INVENTORY_DEFAULT`: `NtmsInventoryMethod` = 3;
public const val `NTMS_INVENTORY_FAST`: `NtmsInventoryMethod` = 1;
public const val `NTMS_INVENTORY_MAX`: `NtmsInventoryMethod` = 6;
public const val `NTMS_INVENTORY_NONE`: `NtmsInventoryMethod` = 0;
public const val `NTMS_INVENTORY_OMID`: `NtmsInventoryMethod` = 2;
public const val `NTMS_INVENTORY_SLOT`: `NtmsInventoryMethod` = 4;
public const val `NTMS_INVENTORY_STOP`: `NtmsInventoryMethod` = 5;
public const val `NTMS_LIBRARY`: `NtmsObjectsTypes` = 9;
public const val `NTMS_LIBRARYFLAG_AUTODETECTCHANGE`: `NtmsLibraryFlags` = 4;
public const val `NTMS_LIBRARYFLAG_CLEANERPRESENT`: `NtmsLibraryFlags` = 2;
public const val `NTMS_LIBRARYFLAG_FIXEDOFFLINE`: `NtmsLibraryFlags` = 1;
public const val `NTMS_LIBRARYFLAG_IGNORECLEANERUSESREMAINING`: `NtmsLibraryFlags` = 8;
public const val `NTMS_LIBRARYFLAG_RECOGNIZECLEANERBARCODE`: `NtmsLibraryFlags` = 16;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NTMS_LIBRARYINFORMATION` (
    public var `LibraryType`: UInt,
    public var `CleanerSlot`: `windows_sys`.`core`.`GUID`,
    public var `CleanerSlotDefault`: `windows_sys`.`core`.`GUID`,
    public var `LibrarySupportsDriveCleaning`: `windows_sys`.`core`.`BOOL`,
    public var `BarCodeReaderInstalled`: `windows_sys`.`core`.`BOOL`,
    public var `InventoryMethod`: UInt,
    public var `dwCleanerUsesRemaining`: UInt,
    public var `FirstDriveNumber`: UInt,
    public var `dwNumberOfDrives`: UInt,
    public var `FirstSlotNumber`: UInt,
    public var `dwNumberOfSlots`: UInt,
    public var `FirstDoorNumber`: UInt,
    public var `dwNumberOfDoors`: UInt,
    public var `FirstPortNumber`: UInt,
    public var `dwNumberOfPorts`: UInt,
    public var `FirstChangerNumber`: UInt,
    public var `dwNumberOfChangers`: UInt,
    public var `dwNumberOfMedia`: UInt,
    public var `dwNumberOfMediaTypes`: UInt,
    public var `dwNumberOfLibRequests`: UInt,
    public var `Reserved`: `windows_sys`.`core`.`GUID`,
    public var `AutoRecovery`: `windows_sys`.`core`.`BOOL`,
    public var `dwFlags`: UInt,
)
public const val `NTMS_LIBRARYTYPE_OFFLINE`: `NtmsLibraryType` = 1;
public const val `NTMS_LIBRARYTYPE_ONLINE`: `NtmsLibraryType` = 2;
public const val `NTMS_LIBRARYTYPE_STANDALONE`: `NtmsLibraryType` = 3;
public const val `NTMS_LIBRARYTYPE_UNKNOWN`: `NtmsLibraryType` = 0;
public const val `NTMS_LIBREQFLAGS_NOAUTOPURGE`: `NtmsLibRequestFlags` = 1;
public const val `NTMS_LIBREQFLAGS_NOFAILEDPURGE`: `NtmsLibRequestFlags` = 2;
public const val `NTMS_LIBREQUEST`: `NtmsObjectsTypes` = 10;
// UNSUPPORTED Rust 2769:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NTMS_LIBREQUESTINFORMATIONA {
//     pub OperationCode: u32,
//     pub OperationOption: u32,
//     pub State: u32,
//     pub PartitionId: windows_sys::core::GUID,
//     pub DriveId: windows_sys::core::GUID,
//     pub PhysMediaId: windows_sys::core::GUID,
//     pub Library: windows_sys::core::GUID,
//     pub SlotId: windows_sys::core::GUID,
//     pub TimeQueued: super::super::Foundation::SYSTEMTIME,
//     pub TimeCompleted: super::super::Foundation::SYSTEMTIME,
//     pub szApplication: [i8; 64],
//     pub szUser: [i8; 64],
//     pub szComputer: [i8; 64],
//     pub dwErrorCode: u32,
//     pub WorkItemId: windows_sys::core::GUID,
//     pub dwPriority: u32,
// }

// UNSUPPORTED Rust 2789:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NTMS_LIBREQUESTINFORMATIONA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2794:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NTMS_LIBREQUESTINFORMATIONW {
//     pub OperationCode: u32,
//     pub OperationOption: u32,
//     pub State: u32,
//     pub PartitionId: windows_sys::core::GUID,
//     pub DriveId: windows_sys::core::GUID,
//     pub PhysMediaId: windows_sys::core::GUID,
//     pub Library: windows_sys::core::GUID,
//     pub SlotId: windows_sys::core::GUID,
//     pub TimeQueued: super::super::Foundation::SYSTEMTIME,
//     pub TimeCompleted: super::super::Foundation::SYSTEMTIME,
//     pub szApplication: [u16; 64],
//     pub szUser: [u16; 64],
//     pub szComputer: [u16; 64],
//     pub dwErrorCode: u32,
//     pub WorkItemId: windows_sys::core::GUID,
//     pub dwPriority: u32,
// }

// UNSUPPORTED Rust 2814:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NTMS_LIBREQUESTINFORMATIONW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NTMS_LMIDINFORMATION` (
    public var `MediaPool`: `windows_sys`.`core`.`GUID`,
    public var `dwNumberOfPartitions`: UInt,
)
public const val `NTMS_LM_CANCELLED`: `NtmsLmState` = 7;
public const val `NTMS_LM_CLASSIFY`: `NtmsLmOperation` = 19;
public const val `NTMS_LM_CLEANDRIVE`: `NtmsLmOperation` = 15;
public const val `NTMS_LM_DEFERRED`: `NtmsLmState` = 6;
public const val `NTMS_LM_DEFFERED`: `NtmsLmState` = 6;
public const val `NTMS_LM_DISABLECHANGER`: `NtmsLmOperation` = 1;
public const val `NTMS_LM_DISABLEDRIVE`: `NtmsLmOperation` = 3;
public const val `NTMS_LM_DISABLELIBRARY`: `NtmsLmOperation` = 1;
public const val `NTMS_LM_DISABLEMEDIA`: `NtmsLmOperation` = 5;
public const val `NTMS_LM_DISMOUNT`: `NtmsLmOperation` = 16;
public const val `NTMS_LM_DOORACCESS`: `NtmsLmOperation` = 9;
public const val `NTMS_LM_EJECT`: `NtmsLmOperation` = 10;
public const val `NTMS_LM_EJECTCLEANER`: `NtmsLmOperation` = 11;
public const val `NTMS_LM_ENABLECHANGER`: `NtmsLmOperation` = 2;
public const val `NTMS_LM_ENABLEDRIVE`: `NtmsLmOperation` = 4;
public const val `NTMS_LM_ENABLELIBRARY`: `NtmsLmOperation` = 2;
public const val `NTMS_LM_ENABLEMEDIA`: `NtmsLmOperation` = 6;
public const val `NTMS_LM_FAILED`: `NtmsLmState` = 3;
public const val `NTMS_LM_INJECT`: `NtmsLmOperation` = 12;
public const val `NTMS_LM_INJECTCLEANER`: `NtmsLmOperation` = 13;
public const val `NTMS_LM_INPROCESS`: `NtmsLmState` = 1;
public const val `NTMS_LM_INVALID`: `NtmsLmState` = 4;
public const val `NTMS_LM_INVENTORY`: `NtmsLmOperation` = 8;
public const val `NTMS_LM_MAXWORKITEM`: `NtmsLmOperation` = 22;
public const val `NTMS_LM_MOUNT`: `NtmsLmOperation` = 17;
public const val `NTMS_LM_PASSED`: `NtmsLmState` = 2;
public const val `NTMS_LM_PROCESSOMID`: `NtmsLmOperation` = 14;
public const val `NTMS_LM_QUEUED`: `NtmsLmState` = 0;
public const val `NTMS_LM_RELEASECLEANER`: `NtmsLmOperation` = 21;
public const val `NTMS_LM_REMOVE`: `NtmsLmOperation` = 0;
public const val `NTMS_LM_RESERVECLEANER`: `NtmsLmOperation` = 20;
public const val `NTMS_LM_STOPPED`: `NtmsLmState` = 8;
public const val `NTMS_LM_UPDATEOMID`: `NtmsLmOperation` = 7;
public const val `NTMS_LM_WAITING`: `NtmsLmState` = 5;
public const val `NTMS_LM_WRITESCRATCH`: `NtmsLmOperation` = 18;
public const val `NTMS_LOGICAL_MEDIA`: `NtmsObjectsTypes` = 11;
public const val `NTMS_MAXATTR_LENGTH`: UInt = 65536u;
public const val `NTMS_MAXATTR_NAMELEN`: UInt = 32u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NTMS_MEDIAPOOLINFORMATION` (
    public var `PoolType`: UInt,
    public var `MediaType`: `windows_sys`.`core`.`GUID`,
    public var `Parent`: `windows_sys`.`core`.`GUID`,
    public var `AllocationPolicy`: UInt,
    public var `DeallocationPolicy`: UInt,
    public var `dwMaxAllocates`: UInt,
    public var `dwNumberOfPhysicalMedia`: UInt,
    public var `dwNumberOfLogicalMedia`: UInt,
    public var `dwNumberOfMediaPools`: UInt,
)
public const val `NTMS_MEDIARW_READONLY`: `NtmsReadWriteCharacteristics` = 3;
public const val `NTMS_MEDIARW_REWRITABLE`: `NtmsReadWriteCharacteristics` = 1;
public const val `NTMS_MEDIARW_UNKNOWN`: `NtmsReadWriteCharacteristics` = 0;
public const val `NTMS_MEDIARW_WRITEONCE`: `NtmsReadWriteCharacteristics` = 2;
public const val `NTMS_MEDIASTATE_IDLE`: `NtmsMediaState` = 0;
public const val `NTMS_MEDIASTATE_INUSE`: `NtmsMediaState` = 1;
public const val `NTMS_MEDIASTATE_LOADED`: `NtmsMediaState` = 3;
public const val `NTMS_MEDIASTATE_MOUNTED`: `NtmsMediaState` = 2;
public const val `NTMS_MEDIASTATE_OPERROR`: `NtmsMediaState` = 5;
public const val `NTMS_MEDIASTATE_OPREQ`: `NtmsMediaState` = 6;
public const val `NTMS_MEDIASTATE_UNLOADED`: `NtmsMediaState` = 4;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NTMS_MEDIATYPEINFORMATION` (
    public var `MediaType`: UInt,
    public var `NumberOfSides`: UInt,
    public var `ReadWriteCharacteristics`: UInt,
    public var `DeviceType`: `FILE_DEVICE_TYPE`,
)
public const val `NTMS_MEDIA_POOL`: `NtmsObjectsTypes` = 12;
public const val `NTMS_MEDIA_TYPE`: `NtmsObjectsTypes` = 13;
public const val `NTMS_MESSAGE_LENGTH`: UInt = 256u;
public const val `NTMS_MODIFY_ACCESS`: `NtmsAccessMask` = 2;
public const val `NTMS_MOUNT_ERROR_IF_OFFLINE`: `NtmsMountOptions` = 8;
public const val `NTMS_MOUNT_ERROR_IF_UNAVAILABLE`: `NtmsMountOptions` = 4;
public const val `NTMS_MOUNT_ERROR_NOT_AVAILABLE`: `NtmsMountOptions` = 4;
public const val `NTMS_MOUNT_ERROR_OFFLINE`: `NtmsMountOptions` = 8;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NTMS_MOUNT_INFORMATION` (
    public var `dwSize`: UInt,
    public var `lpReserved`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 2909:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NTMS_MOUNT_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NTMS_MOUNT_NOWAIT`: `NtmsMountOptions` = 32;
public const val `NTMS_MOUNT_READ`: `NtmsMountOptions` = 1;
public const val `NTMS_MOUNT_SPECIFIC_DRIVE`: `NtmsMountOptions` = 16;
public const val `NTMS_MOUNT_WRITE`: `NtmsMountOptions` = 2;
public const val `NTMS_NEEDS_SERVICE`: `NtmsOperationalState` = 20;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NTMS_NOTIFICATIONINFORMATION` (
    public var `dwOperation`: UInt,
    public var `ObjectId`: `windows_sys`.`core`.`GUID`,
)
public const val `NTMS_NOT_PRESENT`: `NtmsOperationalState` = 21;
public const val `NTMS_NUMBER_OF_OBJECT_TYPES`: `NtmsObjectsTypes` = 19;
public const val `NTMS_OBJECT`: `NtmsObjectsTypes` = 1;
// UNSUPPORTED Rust 2928:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NTMS_OBJECTINFORMATIONA {
//     pub dwSize: u32,
//     pub dwType: u32,
//     pub Created: super::super::Foundation::SYSTEMTIME,
//     pub Modified: super::super::Foundation::SYSTEMTIME,
//     pub ObjectGuid: windows_sys::core::GUID,
//     pub Enabled: windows_sys::core::BOOL,
//     pub dwOperationalState: u32,
//     pub szName: [i8; 64],
//     pub szDescription: [i8; 127],
//     pub Info: NTMS_OBJECTINFORMATIONA_0,
// }

// UNSUPPORTED Rust 2942:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NTMS_OBJECTINFORMATIONA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2947:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NTMS_OBJECTINFORMATIONA_0 {
//     pub Drive: NTMS_DRIVEINFORMATIONA,
//     pub DriveType: NTMS_DRIVETYPEINFORMATIONA,
//     pub Library: NTMS_LIBRARYINFORMATION,
//     pub Changer: NTMS_CHANGERINFORMATIONA,
//     pub ChangerType: NTMS_CHANGERTYPEINFORMATIONA,
//     pub StorageSlot: NTMS_STORAGESLOTINFORMATION,
//     pub IEDoor: NTMS_IEDOORINFORMATION,
//     pub IEPort: NTMS_IEPORTINFORMATION,
//     pub PhysicalMedia: NTMS_PMIDINFORMATIONA,
//     pub LogicalMedia: NTMS_LMIDINFORMATION,
//     pub Partition: NTMS_PARTITIONINFORMATIONA,
//     pub MediaPool: NTMS_MEDIAPOOLINFORMATION,
//     pub MediaType: NTMS_MEDIATYPEINFORMATION,
//     pub LibRequest: NTMS_LIBREQUESTINFORMATIONA,
//     pub OpRequest: NTMS_OPREQUESTINFORMATIONA,
//     pub Computer: NTMS_COMPUTERINFORMATION,
// }

// UNSUPPORTED Rust 2967:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NTMS_OBJECTINFORMATIONA_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2972:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NTMS_OBJECTINFORMATIONW {
//     pub dwSize: u32,
//     pub dwType: u32,
//     pub Created: super::super::Foundation::SYSTEMTIME,
//     pub Modified: super::super::Foundation::SYSTEMTIME,
//     pub ObjectGuid: windows_sys::core::GUID,
//     pub Enabled: windows_sys::core::BOOL,
//     pub dwOperationalState: u32,
//     pub szName: [u16; 64],
//     pub szDescription: [u16; 127],
//     pub Info: NTMS_OBJECTINFORMATIONW_0,
// }

// UNSUPPORTED Rust 2986:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NTMS_OBJECTINFORMATIONW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2991:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union NTMS_OBJECTINFORMATIONW_0 {
//     pub Drive: NTMS_DRIVEINFORMATIONW,
//     pub DriveType: NTMS_DRIVETYPEINFORMATIONW,
//     pub Library: NTMS_LIBRARYINFORMATION,
//     pub Changer: NTMS_CHANGERINFORMATIONW,
//     pub ChangerType: NTMS_CHANGERTYPEINFORMATIONW,
//     pub StorageSlot: NTMS_STORAGESLOTINFORMATION,
//     pub IEDoor: NTMS_IEDOORINFORMATION,
//     pub IEPort: NTMS_IEPORTINFORMATION,
//     pub PhysicalMedia: NTMS_PMIDINFORMATIONW,
//     pub LogicalMedia: NTMS_LMIDINFORMATION,
//     pub Partition: NTMS_PARTITIONINFORMATIONW,
//     pub MediaPool: NTMS_MEDIAPOOLINFORMATION,
//     pub MediaType: NTMS_MEDIATYPEINFORMATION,
//     pub LibRequest: NTMS_LIBREQUESTINFORMATIONW,
//     pub OpRequest: NTMS_OPREQUESTINFORMATIONW,
//     pub Computer: NTMS_COMPUTERINFORMATION,
// }

// UNSUPPORTED Rust 3011:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NTMS_OBJECTINFORMATIONW_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NTMS_OBJECTNAME_LENGTH`: UInt = 64u;
public const val `NTMS_OBJ_DELETE`: `NtmsNotificationOperations` = 3;
public const val `NTMS_OBJ_INSERT`: `NtmsNotificationOperations` = 2;
public const val `NTMS_OBJ_UPDATE`: `NtmsNotificationOperations` = 1;
public const val `NTMS_OMIDLABELID_LENGTH`: UInt = 255u;
public const val `NTMS_OMIDLABELINFO_LENGTH`: UInt = 256u;
public const val `NTMS_OMIDLABELTYPE_LENGTH`: UInt = 64u;
public typealias `NTMS_OMID_TYPE` = UInt;
public const val `NTMS_OMID_TYPE_FILESYSTEM_INFO`: `NTMS_OMID_TYPE` = 2u;
public const val `NTMS_OMID_TYPE_RAW_LABEL`: `NTMS_OMID_TYPE` = 1u;
public const val `NTMS_OPEN_ALWAYS`: `NtmsCreateOptions` = 3;
public const val `NTMS_OPEN_EXISTING`: `NtmsCreateOptions` = 1;
public const val `NTMS_OPREQFLAGS_NOALERTS`: `NtmsOpRequestFlags` = 16;
public const val `NTMS_OPREQFLAGS_NOAUTOPURGE`: `NtmsOpRequestFlags` = 1;
public const val `NTMS_OPREQFLAGS_NOFAILEDPURGE`: `NtmsOpRequestFlags` = 2;
public const val `NTMS_OPREQFLAGS_NOTRAYICON`: `NtmsOpRequestFlags` = 32;
public const val `NTMS_OPREQUEST`: `NtmsObjectsTypes` = 17;
// UNSUPPORTED Rust 3033:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NTMS_OPREQUESTINFORMATIONA {
//     pub Request: u32,
//     pub Submitted: super::super::Foundation::SYSTEMTIME,
//     pub State: u32,
//     pub szMessage: [i8; 256],
//     pub Arg1Type: u32,
//     pub Arg1: windows_sys::core::GUID,
//     pub Arg2Type: u32,
//     pub Arg2: windows_sys::core::GUID,
//     pub szApplication: [i8; 64],
//     pub szUser: [i8; 64],
//     pub szComputer: [i8; 64],
// }

// UNSUPPORTED Rust 3048:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NTMS_OPREQUESTINFORMATIONA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3053:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NTMS_OPREQUESTINFORMATIONW {
//     pub Request: u32,
//     pub Submitted: super::super::Foundation::SYSTEMTIME,
//     pub State: u32,
//     pub szMessage: [u16; 256],
//     pub Arg1Type: u32,
//     pub Arg1: windows_sys::core::GUID,
//     pub Arg2Type: u32,
//     pub Arg2: windows_sys::core::GUID,
//     pub szApplication: [u16; 64],
//     pub szUser: [u16; 64],
//     pub szComputer: [u16; 64],
// }

// UNSUPPORTED Rust 3068:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NTMS_OPREQUESTINFORMATIONW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NTMS_OPREQ_CLEANER`: `NtmsOpreqCommand` = 2;
public const val `NTMS_OPREQ_DEVICESERVICE`: `NtmsOpreqCommand` = 3;
public const val `NTMS_OPREQ_MESSAGE`: `NtmsOpreqCommand` = 5;
public const val `NTMS_OPREQ_MOVEMEDIA`: `NtmsOpreqCommand` = 4;
public const val `NTMS_OPREQ_NEWMEDIA`: `NtmsOpreqCommand` = 1;
public const val `NTMS_OPREQ_UNKNOWN`: `NtmsOpreqCommand` = 0;
public const val `NTMS_OPSTATE_ACTIVE`: `NtmsOpreqState` = 2;
public const val `NTMS_OPSTATE_COMPLETE`: `NtmsOpreqState` = 5;
public const val `NTMS_OPSTATE_INPROGRESS`: `NtmsOpreqState` = 3;
public const val `NTMS_OPSTATE_REFUSED`: `NtmsOpreqState` = 4;
public const val `NTMS_OPSTATE_SUBMITTED`: `NtmsOpreqState` = 1;
public const val `NTMS_OPSTATE_UNKNOWN`: `NtmsOpreqState` = 0;
public const val `NTMS_PARTITION`: `NtmsObjectsTypes` = 14;
// UNSUPPORTED Rust 3086:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NTMS_PARTITIONINFORMATIONA {
//     pub PhysicalMedia: windows_sys::core::GUID,
//     pub LogicalMedia: windows_sys::core::GUID,
//     pub State: u32,
//     pub Side: u16,
//     pub dwOmidLabelIdLength: u32,
//     pub OmidLabelId: [u8; 255],
//     pub szOmidLabelType: [i8; 64],
//     pub szOmidLabelInfo: [i8; 256],
//     pub dwMountCount: u32,
//     pub dwAllocateCount: u32,
//     pub Capacity: i64,
// }

// UNSUPPORTED Rust 3101:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NTMS_PARTITIONINFORMATIONA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3106:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NTMS_PARTITIONINFORMATIONW {
//     pub PhysicalMedia: windows_sys::core::GUID,
//     pub LogicalMedia: windows_sys::core::GUID,
//     pub State: u32,
//     pub Side: u16,
//     pub dwOmidLabelIdLength: u32,
//     pub OmidLabelId: [u8; 255],
//     pub szOmidLabelType: [u16; 64],
//     pub szOmidLabelInfo: [u16; 256],
//     pub dwMountCount: u32,
//     pub dwAllocateCount: u32,
//     pub Capacity: i64,
// }

// UNSUPPORTED Rust 3121:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NTMS_PARTITIONINFORMATIONW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NTMS_PARTSTATE_ALLOCATED`: `NtmsPartitionState` = 5;
public const val `NTMS_PARTSTATE_AVAILABLE`: `NtmsPartitionState` = 4;
public const val `NTMS_PARTSTATE_COMPLETE`: `NtmsPartitionState` = 6;
public const val `NTMS_PARTSTATE_DECOMMISSIONED`: `NtmsPartitionState` = 3;
public const val `NTMS_PARTSTATE_FOREIGN`: `NtmsPartitionState` = 7;
public const val `NTMS_PARTSTATE_IMPORT`: `NtmsPartitionState` = 8;
public const val `NTMS_PARTSTATE_INCOMPATIBLE`: `NtmsPartitionState` = 2;
public const val `NTMS_PARTSTATE_RESERVED`: `NtmsPartitionState` = 9;
public const val `NTMS_PARTSTATE_UNKNOWN`: `NtmsPartitionState` = 0;
public const val `NTMS_PARTSTATE_UNPREPARED`: `NtmsPartitionState` = 1;
public const val `NTMS_PHYSICAL_MEDIA`: `NtmsObjectsTypes` = 15;
// UNSUPPORTED Rust 3137:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NTMS_PMIDINFORMATIONA {
//     pub CurrentLibrary: windows_sys::core::GUID,
//     pub MediaPool: windows_sys::core::GUID,
//     pub Location: windows_sys::core::GUID,
//     pub LocationType: u32,
//     pub MediaType: windows_sys::core::GUID,
//     pub HomeSlot: windows_sys::core::GUID,
//     pub szBarCode: [i8; 64],
//     pub BarCodeState: u32,
//     pub szSequenceNumber: [i8; 32],
//     pub MediaState: u32,
//     pub dwNumberOfPartitions: u32,
//     pub dwMediaTypeCode: u32,
//     pub dwDensityCode: u32,
//     pub MountedPartition: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 3155:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NTMS_PMIDINFORMATIONA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3160:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NTMS_PMIDINFORMATIONW {
//     pub CurrentLibrary: windows_sys::core::GUID,
//     pub MediaPool: windows_sys::core::GUID,
//     pub Location: windows_sys::core::GUID,
//     pub LocationType: u32,
//     pub MediaType: windows_sys::core::GUID,
//     pub HomeSlot: windows_sys::core::GUID,
//     pub szBarCode: [u16; 64],
//     pub BarCodeState: u32,
//     pub szSequenceNumber: [u16; 32],
//     pub MediaState: u32,
//     pub dwNumberOfPartitions: u32,
//     pub dwMediaTypeCode: u32,
//     pub dwDensityCode: u32,
//     pub MountedPartition: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 3178:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for NTMS_PMIDINFORMATIONW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `NTMS_POOLHIERARCHY_LENGTH`: UInt = 512u;
public const val `NTMS_POOLPOLICY_KEEPOFFLINEIMPORT`: `NtmsMediaPoolPolicy` = 2;
public const val `NTMS_POOLPOLICY_PURGEOFFLINESCRATCH`: `NtmsMediaPoolPolicy` = 1;
public const val `NTMS_POOLTYPE_APPLICATION`: `NtmsPoolType` = 1000;
public const val `NTMS_POOLTYPE_FOREIGN`: `NtmsPoolType` = 2;
public const val `NTMS_POOLTYPE_IMPORT`: `NtmsPoolType` = 3;
public const val `NTMS_POOLTYPE_SCRATCH`: `NtmsPoolType` = 1;
public const val `NTMS_POOLTYPE_UNKNOWN`: `NtmsPoolType` = 0;
public const val `NTMS_PORTCONTENT_EMPTY`: `NtmsPortContent` = 2;
public const val `NTMS_PORTCONTENT_FULL`: `NtmsPortContent` = 1;
public const val `NTMS_PORTCONTENT_UNKNOWN`: `NtmsPortContent` = 0;
public const val `NTMS_PORTPOSITION_EXTENDED`: `NtmsPortPosition` = 1;
public const val `NTMS_PORTPOSITION_RETRACTED`: `NtmsPortPosition` = 2;
public const val `NTMS_PORTPOSITION_UNKNOWN`: `NtmsPortPosition` = 0;
public const val `NTMS_PRIORITY_DEFAULT`: `NtmsMountPriority` = 0;
public const val `NTMS_PRIORITY_HIGH`: `NtmsMountPriority` = 7;
public const val `NTMS_PRIORITY_HIGHEST`: `NtmsMountPriority` = 15;
public const val `NTMS_PRIORITY_LOW`: `NtmsMountPriority` = -7;
public const val `NTMS_PRIORITY_LOWEST`: `NtmsMountPriority` = -15;
public const val `NTMS_PRIORITY_NORMAL`: `NtmsMountPriority` = 0;
public const val `NTMS_PRODUCTNAME_LENGTH`: UInt = 128u;
public const val `NTMS_READY`: `NtmsOperationalState` = 0;
public const val `NTMS_REVISION_LENGTH`: UInt = 32u;
public const val `NTMS_SEQUENCE_LENGTH`: UInt = 32u;
public const val `NTMS_SERIALNUMBER_LENGTH`: UInt = 32u;
public const val `NTMS_SESSION_QUERYEXPEDITE`: `NtmsSessionOptions` = 1;
public const val `NTMS_SLOTSTATE_EMPTY`: `NtmsSlotState` = 2;
public const val `NTMS_SLOTSTATE_FULL`: `NtmsSlotState` = 1;
public const val `NTMS_SLOTSTATE_NEEDSINVENTORY`: `NtmsSlotState` = 4;
public const val `NTMS_SLOTSTATE_NOTPRESENT`: `NtmsSlotState` = 3;
public const val `NTMS_SLOTSTATE_UNKNOWN`: `NtmsSlotState` = 0;
public const val `NTMS_STORAGESLOT`: `NtmsObjectsTypes` = 16;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `NTMS_STORAGESLOTINFORMATION` (
    public var `Number`: UInt,
    public var `State`: UInt,
    public var `Library`: `windows_sys`.`core`.`GUID`,
)
public const val `NTMS_UIDEST_ADD`: `NtmsUIOperations` = 1;
public const val `NTMS_UIDEST_DELETE`: `NtmsUIOperations` = 2;
public const val `NTMS_UIDEST_DELETEALL`: `NtmsUIOperations` = 3;
public const val `NTMS_UIOPERATION_MAX`: `NtmsUIOperations` = 4;
public const val `NTMS_UITYPE_ERR`: `NtmsUITypes` = 3;
public const val `NTMS_UITYPE_INFO`: `NtmsUITypes` = 1;
public const val `NTMS_UITYPE_INVALID`: `NtmsUITypes` = 0;
public const val `NTMS_UITYPE_MAX`: `NtmsUITypes` = 4;
public const val `NTMS_UITYPE_REQ`: `NtmsUITypes` = 2;
public const val `NTMS_UI_DESTINATION`: `NtmsObjectsTypes` = 18;
public const val `NTMS_UNKNOWN`: `NtmsObjectsTypes` = 0;
public const val `NTMS_UNKNOWN_DRIVE`: `NtmsDriveType` = 0;
public const val `NTMS_USERNAME_LENGTH`: UInt = 64u;
public const val `NTMS_USE_ACCESS`: `NtmsAccessMask` = 1;
public const val `NTMS_VENDORNAME_LENGTH`: UInt = 128u;
public typealias `NtmsAccessMask` = Int;
public typealias `NtmsAllocateOptions` = Int;
public typealias `NtmsAllocationPolicy` = Int;
public typealias `NtmsAsyncOperations` = Int;
public typealias `NtmsAsyncStatus` = Int;
public typealias `NtmsBarCodeState` = Int;
public typealias `NtmsCreateNtmsMediaOptions` = Int;
public typealias `NtmsCreateOptions` = Int;
public typealias `NtmsDeallocationPolicy` = Int;
public typealias `NtmsDismountOptions` = Int;
public typealias `NtmsDoorState` = Int;
public typealias `NtmsDriveState` = Int;
public typealias `NtmsDriveType` = Int;
public typealias `NtmsEjectOperation` = Int;
public typealias `NtmsEnumerateOption` = Int;
public typealias `NtmsInjectOperation` = Int;
public typealias `NtmsInventoryMethod` = Int;
public typealias `NtmsLibRequestFlags` = Int;
public typealias `NtmsLibraryFlags` = Int;
public typealias `NtmsLibraryType` = Int;
public typealias `NtmsLmOperation` = Int;
public typealias `NtmsLmState` = Int;
public typealias `NtmsMediaPoolPolicy` = Int;
public typealias `NtmsMediaState` = Int;
public typealias `NtmsMountOptions` = Int;
public typealias `NtmsMountPriority` = Int;
public typealias `NtmsNotificationOperations` = Int;
public typealias `NtmsObjectsTypes` = Int;
public typealias `NtmsOpRequestFlags` = Int;
public typealias `NtmsOperationalState` = Int;
public typealias `NtmsOpreqCommand` = Int;
public typealias `NtmsOpreqState` = Int;
public typealias `NtmsPartitionState` = Int;
public typealias `NtmsPoolType` = Int;
public typealias `NtmsPortContent` = Int;
public typealias `NtmsPortPosition` = Int;
public typealias `NtmsReadWriteCharacteristics` = Int;
public typealias `NtmsSessionOptions` = Int;
public typealias `NtmsSlotState` = Int;
public typealias `NtmsUIOperations` = Int;
public typealias `NtmsUITypes` = Int;
// UNSUPPORTED Rust 3278:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct OFSTRUCT {
//     pub cBytes: u8,
//     pub fFixedDisk: u8,
//     pub nErrCode: u16,
//     pub Reserved1: u16,
//     pub Reserved2: u16,
//     pub szPathName: [i8; 128],
// }

// UNSUPPORTED Rust 3288:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for OFSTRUCT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `OF_CANCEL`: `LZOPENFILE_STYLE` = 2048u;
public const val `OF_CREATE`: `LZOPENFILE_STYLE` = 4096u;
public const val `OF_DELETE`: `LZOPENFILE_STYLE` = 512u;
public const val `OF_EXIST`: `LZOPENFILE_STYLE` = 16384u;
public const val `OF_PARSE`: `LZOPENFILE_STYLE` = 256u;
public const val `OF_PROMPT`: `LZOPENFILE_STYLE` = 8192u;
public const val `OF_READ`: `LZOPENFILE_STYLE` = 0u;
public const val `OF_READWRITE`: `LZOPENFILE_STYLE` = 2u;
public const val `OF_REOPEN`: `LZOPENFILE_STYLE` = 32768u;
public const val `OF_SHARE_COMPAT`: `LZOPENFILE_STYLE` = 0u;
public const val `OF_SHARE_DENY_NONE`: `LZOPENFILE_STYLE` = 64u;
public const val `OF_SHARE_DENY_READ`: `LZOPENFILE_STYLE` = 48u;
public const val `OF_SHARE_DENY_WRITE`: `LZOPENFILE_STYLE` = 32u;
public const val `OF_SHARE_EXCLUSIVE`: `LZOPENFILE_STYLE` = 16u;
public const val `OF_VERIFY`: `LZOPENFILE_STYLE` = 1024u;
public const val `OF_WRITE`: `LZOPENFILE_STYLE` = 1u;
public const val `OPEN_ALWAYS`: `FILE_CREATION_DISPOSITION` = 4u;
public const val `OPEN_EXISTING`: `FILE_CREATION_DISPOSITION` = 3u;
public const val `ObjectIdType`: `FILE_ID_TYPE` = 1;
// UNSUPPORTED Rust 3312:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PARTITION_BASIC_DATA_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xebd0a0a2_b9e5_4433_87c0_68b6b72699c7);

// UNSUPPORTED Rust 3313:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PARTITION_BSP_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x57434f53_4df9_45b9_8e9e_2370f006457c);

// UNSUPPORTED Rust 3314:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PARTITION_CLUSTER_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdb97dba9_0840_4bae_97f0_ffb9a327c7e1);

// UNSUPPORTED Rust 3315:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PARTITION_DPP_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x57434f53_94cb_43f0_a533_d73c10cfa57d);

// UNSUPPORTED Rust 3316:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PARTITION_ENTRY_UNUSED_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000000_0000_0000_0000_000000000000);

// UNSUPPORTED Rust 3317:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PARTITION_LDM_DATA_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xaf9b60a0_1431_4f62_bc68_3311714a69ad);

// UNSUPPORTED Rust 3318:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PARTITION_LDM_METADATA_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5808c8aa_7e8f_42e0_85d2_e1e90434cfb3);

// UNSUPPORTED Rust 3319:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PARTITION_LEGACY_BL_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x424ca0e2_7cb2_4fb9_8143_c52a99398bc6);

// UNSUPPORTED Rust 3320:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PARTITION_LEGACY_BL_GUID_BACKUP: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x424c3e6c_d79f_49cb_935d_36d71467a288);

// UNSUPPORTED Rust 3321:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PARTITION_MAIN_OS_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x57434f53_8f45_405e_8a23_186d8a4330d3);

// UNSUPPORTED Rust 3322:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PARTITION_MSFT_RECOVERY_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xde94bba4_06d1_4d40_a16a_bfd50179d6ac);

// UNSUPPORTED Rust 3323:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PARTITION_MSFT_RESERVED_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe3c9e316_0b5c_4db8_817d_f92df00215ae);

// UNSUPPORTED Rust 3324:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PARTITION_MSFT_SNAPSHOT_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcaddebf1_4400_4de8_b103_12117dcf3ccf);

// UNSUPPORTED Rust 3325:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PARTITION_OS_DATA_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x57434f53_23f2_44d5_a830_67bbdaa609f9);

// UNSUPPORTED Rust 3326:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PARTITION_PATCH_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8967a686_96aa_6aa8_9589_a84256541090);

// UNSUPPORTED Rust 3327:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PARTITION_PRE_INSTALLED_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x57434f53_7fe0_4196_9b42_427b51643484);

// UNSUPPORTED Rust 3328:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PARTITION_SBL_CACHE_HDD_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x03aaa829_ebfc_4e7e_aac9_c4d76c63b24b);

// UNSUPPORTED Rust 3329:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PARTITION_SBL_CACHE_SSD_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xeeff8352_dd2a_44db_ae83_bee1cf7481dc);

// UNSUPPORTED Rust 3330:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PARTITION_SBL_CACHE_SSD_RESERVED_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdcc0c7c1_55ad_4f17_9d43_4bc776e0117e);

// UNSUPPORTED Rust 3331:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PARTITION_SERVICING_FILES_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x57434f53_432e_4014_ae4c_8deaa9c0006a);

// UNSUPPORTED Rust 3332:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PARTITION_SERVICING_METADATA_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x57434f53_c691_4a05_bb4e_703dafd229ce);

// UNSUPPORTED Rust 3333:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PARTITION_SERVICING_RESERVE_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x57434f53_4b81_460b_a319_ffb6fe136d14);

// UNSUPPORTED Rust 3334:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PARTITION_SERVICING_STAGING_ROOT_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x57434f53_e84d_4e84_aaf3_ecbbbd04b9df);

// UNSUPPORTED Rust 3335:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PARTITION_SPACES_DATA_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe7addcb4_dc34_4539_9a76_ebbd07be6f7e);

// UNSUPPORTED Rust 3336:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PARTITION_SPACES_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe75caf8f_f680_4cee_afa3_b001e56efc2d);

// UNSUPPORTED Rust 3337:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PARTITION_SYSTEM_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc12a7328_f81f_11d2_ba4b_00a0c93ec93b);

// UNSUPPORTED Rust 3338:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const PARTITION_WINDOWS_SYSTEM_GUID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x57434f53_e3e3_4631_a5c5_26d2243873aa);

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PCLFS_COMPLETION_ROUTINE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PCOPYFILE2_PROGRESS_ROUTINE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`COPYFILE2_MESSAGE`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `COPYFILE2_MESSAGE_ACTION`>>>;
public const val `PERM_FILE_CREATE`: `FILE_INFO_FLAGS_PERMISSIONS` = 4u;
public const val `PERM_FILE_READ`: `FILE_INFO_FLAGS_PERMISSIONS` = 1u;
public const val `PERM_FILE_WRITE`: `FILE_INFO_FLAGS_PERMISSIONS` = 2u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFE_EXPORT_FUNC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFE_IMPORT_FUNC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_IO_COMPLETION` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`FIO_CONTEXT`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`FH_OVERLAPPED`>?, UInt, UInt) -> Unit>>>;
public const val `PIPE_ACCESS_DUPLEX`: `FILE_FLAGS_AND_ATTRIBUTES` = 3u;
public const val `PIPE_ACCESS_INBOUND`: `FILE_FLAGS_AND_ATTRIBUTES` = 1u;
public const val `PIPE_ACCESS_OUTBOUND`: `FILE_FLAGS_AND_ATTRIBUTES` = 2u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLOG_FULL_HANDLER_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, UInt, `windows_sys`.`core`.`BOOL`, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLOG_TAIL_ADVANCE_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, `CLS_LSN`, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PLOG_UNPINNED_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
public typealias `PREPARE_TAPE_OPERATION` = UInt;
public typealias `PRIORITY_HINT` = Int;
public const val `PROGRESS_CANCEL`: `COPYPROGRESSROUTINE_PROGRESS` = 1u;
public const val `PROGRESS_CONTINUE`: `COPYPROGRESSROUTINE_PROGRESS` = 0u;
public const val `PROGRESS_QUIET`: `COPYPROGRESSROUTINE_PROGRESS` = 3u;
public const val `PROGRESS_STOP`: `COPYPROGRESSROUTINE_PROGRESS` = 2u;
public const val `QUIC`: `SERVER_CERTIFICATE_TYPE` = 0;
public const val `READ_CONTROL`: `FILE_ACCESS_RIGHTS` = 131072u;
public typealias `READ_DIRECTORY_NOTIFY_INFORMATION_CLASS` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `REPARSE_GUID_DATA_BUFFER` (
    public var `ReparseTag`: UInt,
    public var `ReparseDataLength`: UShort,
    public var `Reserved`: UShort,
    public var `ReparseGuid`: `windows_sys`.`core`.`GUID`,
    public var `GenericReparseBuffer`: `REPARSE_GUID_DATA_BUFFER_0`,
)
// UNSUPPORTED Rust 3371:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct REPARSE_GUID_DATA_BUFFER_0 {
//     pub DataBuffer: [u8; 1],
// }

// UNSUPPORTED Rust 3376:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for REPARSE_GUID_DATA_BUFFER_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `REPLACEFILE_IGNORE_ACL_ERRORS`: `REPLACE_FILE_FLAGS` = 4u;
public const val `REPLACEFILE_IGNORE_MERGE_ERRORS`: `REPLACE_FILE_FLAGS` = 2u;
public const val `REPLACEFILE_WRITE_THROUGH`: `REPLACE_FILE_FLAGS` = 1u;
public typealias `REPLACE_FILE_FLAGS` = UInt;
public const val `RESOURCE_MANAGER_COMMUNICATION`: UInt = 2u;
public const val `RESOURCE_MANAGER_MAXIMUM_OPTION`: UInt = 3u;
// UNSUPPORTED Rust 3387:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const RESOURCE_MANAGER_OBJECT_PATH: windows_sys::core::PCWSTR = windows_sys::core::w!("\\ResourceManager\\");

public const val `RESOURCE_MANAGER_VOLATILE`: UInt = 1u;
public const val `ReadDirectoryNotifyExtendedInformation`: `READ_DIRECTORY_NOTIFY_INFORMATION_CLASS` = 2;
public const val `ReadDirectoryNotifyFullInformation`: `READ_DIRECTORY_NOTIFY_INFORMATION_CLASS` = 3;
public const val `ReadDirectoryNotifyInformation`: `READ_DIRECTORY_NOTIFY_INFORMATION_CLASS` = 1;
public const val `ReadDirectoryNotifyMaximumInformation`: `READ_DIRECTORY_NOTIFY_INFORMATION_CLASS` = 4;
public const val `SECURITY_ANONYMOUS`: `FILE_FLAGS_AND_ATTRIBUTES` = 0u;
public const val `SECURITY_CONTEXT_TRACKING`: `FILE_FLAGS_AND_ATTRIBUTES` = 262144u;
public const val `SECURITY_DELEGATION`: `FILE_FLAGS_AND_ATTRIBUTES` = 196608u;
public const val `SECURITY_EFFECTIVE_ONLY`: `FILE_FLAGS_AND_ATTRIBUTES` = 524288u;
public const val `SECURITY_IDENTIFICATION`: `FILE_FLAGS_AND_ATTRIBUTES` = 65536u;
public const val `SECURITY_IMPERSONATION`: `FILE_FLAGS_AND_ATTRIBUTES` = 131072u;
public const val `SECURITY_SQOS_PRESENT`: `FILE_FLAGS_AND_ATTRIBUTES` = 1048576u;
public const val `SECURITY_VALID_SQOS_FLAGS`: `FILE_FLAGS_AND_ATTRIBUTES` = 2031616u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SERVER_ALIAS_INFO_0` (
    public var `srvai0_alias`: `windows_sys`.`core`.`PWSTR`,
    public var `srvai0_target`: `windows_sys`.`core`.`PWSTR`,
    public var `srvai0_default`: Boolean,
    public var `srvai0_reserved`: UInt,
)
// UNSUPPORTED Rust 3409:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SERVER_ALIAS_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SERVER_CERTIFICATE_INFO_0` (
    public var `srvci0_name`: `windows_sys`.`core`.`PWSTR`,
    public var `srvci0_subject`: `windows_sys`.`core`.`PWSTR`,
    public var `srvci0_issuer`: `windows_sys`.`core`.`PWSTR`,
    public var `srvci0_thumbprint`: `windows_sys`.`core`.`PWSTR`,
    public var `srvci0_friendlyname`: `windows_sys`.`core`.`PWSTR`,
    public var `srvci0_notbefore`: `windows_sys`.`core`.`PWSTR`,
    public var `srvci0_notafter`: `windows_sys`.`core`.`PWSTR`,
    public var `srvci0_storelocation`: `windows_sys`.`core`.`PWSTR`,
    public var `srvci0_storename`: `windows_sys`.`core`.`PWSTR`,
    public var `srvci0_renewalchain`: `windows_sys`.`core`.`PWSTR`,
    public var `srvci0_type`: UInt,
    public var `srvci0_flags`: UInt,
    public var `srvci0_mapping_status`: UInt,
)
// UNSUPPORTED Rust 3431:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SERVER_CERTIFICATE_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `SERVER_CERTIFICATE_TYPE` = Int;
public const val `SESI1_NUM_ELEMENTS`: UInt = 8u;
public const val `SESI2_NUM_ELEMENTS`: UInt = 9u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SESSION_INFO_0` (
    public var `sesi0_cname`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 3444:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SESSION_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SESSION_INFO_1` (
    public var `sesi1_cname`: `windows_sys`.`core`.`PWSTR`,
    public var `sesi1_username`: `windows_sys`.`core`.`PWSTR`,
    public var `sesi1_num_opens`: UInt,
    public var `sesi1_time`: UInt,
    public var `sesi1_idle_time`: UInt,
    public var `sesi1_user_flags`: `SESSION_INFO_USER_FLAGS`,
)
// UNSUPPORTED Rust 3459:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SESSION_INFO_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SESSION_INFO_10` (
    public var `sesi10_cname`: `windows_sys`.`core`.`PWSTR`,
    public var `sesi10_username`: `windows_sys`.`core`.`PWSTR`,
    public var `sesi10_time`: UInt,
    public var `sesi10_idle_time`: UInt,
)
// UNSUPPORTED Rust 3472:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SESSION_INFO_10 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SESSION_INFO_2` (
    public var `sesi2_cname`: `windows_sys`.`core`.`PWSTR`,
    public var `sesi2_username`: `windows_sys`.`core`.`PWSTR`,
    public var `sesi2_num_opens`: UInt,
    public var `sesi2_time`: UInt,
    public var `sesi2_idle_time`: UInt,
    public var `sesi2_user_flags`: `SESSION_INFO_USER_FLAGS`,
    public var `sesi2_cltype_name`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 3488:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SESSION_INFO_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SESSION_INFO_502` (
    public var `sesi502_cname`: `windows_sys`.`core`.`PWSTR`,
    public var `sesi502_username`: `windows_sys`.`core`.`PWSTR`,
    public var `sesi502_num_opens`: UInt,
    public var `sesi502_time`: UInt,
    public var `sesi502_idle_time`: UInt,
    public var `sesi502_user_flags`: `SESSION_INFO_USER_FLAGS`,
    public var `sesi502_cltype_name`: `windows_sys`.`core`.`PWSTR`,
    public var `sesi502_transport`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 3505:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SESSION_INFO_502 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `SESSION_INFO_USER_FLAGS` = UInt;
public const val `SESS_GUEST`: `SESSION_INFO_USER_FLAGS` = 1u;
public const val `SESS_NOENCRYPTION`: `SESSION_INFO_USER_FLAGS` = 2u;
public typealias `SET_FILE_POINTER_MOVE_METHOD` = UInt;
public const val `SET_TAPE_DRIVE_INFORMATION`: `TAPE_INFORMATION_TYPE` = 1u;
public const val `SET_TAPE_MEDIA_INFORMATION`: `TAPE_INFORMATION_TYPE` = 0u;
public const val `SHARE_CURRENT_USES_PARMNUM`: UInt = 7u;
public const val `SHARE_FILE_SD_PARMNUM`: UInt = 501u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SHARE_INFO_0` (
    public var `shi0_netname`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 3523:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SHARE_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SHARE_INFO_1` (
    public var `shi1_netname`: `windows_sys`.`core`.`PWSTR`,
    public var `shi1_type`: `SHARE_TYPE`,
    public var `shi1_remark`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 3535:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SHARE_INFO_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SHARE_INFO_1004` (
    public var `shi1004_remark`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 3545:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SHARE_INFO_1004 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SHARE_INFO_1005` (
    public var `shi1005_flags`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SHARE_INFO_1006` (
    public var `shi1006_max_uses`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SHARE_INFO_1501` (
    public var `shi1501_reserved`: UInt,
    public var `shi1501_security_descriptor`: `super`.`super`.`Security`.`PSECURITY_DESCRIPTOR`,
)
// UNSUPPORTED Rust 3567:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for SHARE_INFO_1501 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SHARE_INFO_1503` (
    public var `shi1503_sharefilter`: `windows_sys`.`core`.`GUID`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SHARE_INFO_2` (
    public var `shi2_netname`: `windows_sys`.`core`.`PWSTR`,
    public var `shi2_type`: `SHARE_TYPE`,
    public var `shi2_remark`: `windows_sys`.`core`.`PWSTR`,
    public var `shi2_permissions`: `SHARE_INFO_PERMISSIONS`,
    public var `shi2_max_uses`: UInt,
    public var `shi2_current_uses`: UInt,
    public var `shi2_path`: `windows_sys`.`core`.`PWSTR`,
    public var `shi2_passwd`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 3590:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SHARE_INFO_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SHARE_INFO_501` (
    public var `shi501_netname`: `windows_sys`.`core`.`PWSTR`,
    public var `shi501_type`: `SHARE_TYPE`,
    public var `shi501_remark`: `windows_sys`.`core`.`PWSTR`,
    public var `shi501_flags`: UInt,
)
// UNSUPPORTED Rust 3603:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SHARE_INFO_501 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SHARE_INFO_502` (
    public var `shi502_netname`: `windows_sys`.`core`.`PWSTR`,
    public var `shi502_type`: `SHARE_TYPE`,
    public var `shi502_remark`: `windows_sys`.`core`.`PWSTR`,
    public var `shi502_permissions`: `SHARE_INFO_PERMISSIONS`,
    public var `shi502_max_uses`: UInt,
    public var `shi502_current_uses`: UInt,
    public var `shi502_path`: `windows_sys`.`core`.`PWSTR`,
    public var `shi502_passwd`: `windows_sys`.`core`.`PWSTR`,
    public var `shi502_reserved`: UInt,
    public var `shi502_security_descriptor`: `super`.`super`.`Security`.`PSECURITY_DESCRIPTOR`,
)
// UNSUPPORTED Rust 3623:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for SHARE_INFO_502 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SHARE_INFO_503` (
    public var `shi503_netname`: `windows_sys`.`core`.`PWSTR`,
    public var `shi503_type`: `SHARE_TYPE`,
    public var `shi503_remark`: `windows_sys`.`core`.`PWSTR`,
    public var `shi503_permissions`: `SHARE_INFO_PERMISSIONS`,
    public var `shi503_max_uses`: UInt,
    public var `shi503_current_uses`: UInt,
    public var `shi503_path`: `windows_sys`.`core`.`PWSTR`,
    public var `shi503_passwd`: `windows_sys`.`core`.`PWSTR`,
    public var `shi503_servername`: `windows_sys`.`core`.`PWSTR`,
    public var `shi503_reserved`: UInt,
    public var `shi503_security_descriptor`: `super`.`super`.`Security`.`PSECURITY_DESCRIPTOR`,
)
// UNSUPPORTED Rust 3645:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for SHARE_INFO_503 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `SHARE_INFO_PERMISSIONS` = UInt;
public const val `SHARE_MAX_USES_PARMNUM`: UInt = 6u;
public const val `SHARE_NETNAME_PARMNUM`: UInt = 1u;
public const val `SHARE_PASSWD_PARMNUM`: UInt = 9u;
public const val `SHARE_PATH_PARMNUM`: UInt = 8u;
public const val `SHARE_PERMISSIONS_PARMNUM`: UInt = 5u;
public const val `SHARE_QOS_POLICY_PARMNUM`: UInt = 504u;
public const val `SHARE_REMARK_PARMNUM`: UInt = 4u;
public const val `SHARE_SERVER_PARMNUM`: UInt = 503u;
public typealias `SHARE_TYPE` = UInt;
public const val `SHARE_TYPE_PARMNUM`: UInt = 3u;
public const val `SHI1005_FLAGS_ACCESS_BASED_DIRECTORY_ENUM`: UInt = 2048u;
public const val `SHI1005_FLAGS_ALLOW_NAMESPACE_CACHING`: UInt = 1024u;
public const val `SHI1005_FLAGS_CLUSTER_MANAGED`: UInt = 524288u;
public const val `SHI1005_FLAGS_COMPRESS_DATA`: UInt = 1048576u;
public const val `SHI1005_FLAGS_DFS`: UInt = 1u;
public const val `SHI1005_FLAGS_DFS_ROOT`: UInt = 2u;
public const val `SHI1005_FLAGS_DISABLE_CLIENT_BUFFERING`: UInt = 131072u;
public const val `SHI1005_FLAGS_DISABLE_DIRECTORY_HANDLE_LEASING`: UInt = 4194304u;
public const val `SHI1005_FLAGS_ENABLE_CA`: UInt = 16384u;
public const val `SHI1005_FLAGS_ENABLE_HASH`: UInt = 8192u;
public const val `SHI1005_FLAGS_ENCRYPT_DATA`: UInt = 32768u;
public const val `SHI1005_FLAGS_FORCE_LEVELII_OPLOCK`: UInt = 4096u;
public const val `SHI1005_FLAGS_FORCE_SHARED_DELETE`: UInt = 512u;
public const val `SHI1005_FLAGS_IDENTITY_REMOTING`: UInt = 262144u;
public const val `SHI1005_FLAGS_ISOLATED_TRANSPORT`: UInt = 2097152u;
public const val `SHI1005_FLAGS_RESERVED`: UInt = 65536u;
public const val `SHI1005_FLAGS_RESTRICT_EXCLUSIVE_OPENS`: UInt = 256u;
public const val `SHI1_NUM_ELEMENTS`: UInt = 4u;
public const val `SHI2_NUM_ELEMENTS`: UInt = 10u;
public const val `SHI_USES_UNLIMITED`: UInt = 4294967295u;
public const val `SPECIFIC_RIGHTS_ALL`: `FILE_ACCESS_RIGHTS` = 65535u;
public const val `STANDARD_RIGHTS_ALL`: `FILE_ACCESS_RIGHTS` = 2031616u;
public const val `STANDARD_RIGHTS_EXECUTE`: `FILE_ACCESS_RIGHTS` = 131072u;
public const val `STANDARD_RIGHTS_READ`: `FILE_ACCESS_RIGHTS` = 131072u;
public const val `STANDARD_RIGHTS_REQUIRED`: `FILE_ACCESS_RIGHTS` = 983040u;
public const val `STANDARD_RIGHTS_WRITE`: `FILE_ACCESS_RIGHTS` = 131072u;
public const val `STATSOPT_CLR`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STAT_SERVER_0` (
    public var `sts0_start`: UInt,
    public var `sts0_fopens`: UInt,
    public var `sts0_devopens`: UInt,
    public var `sts0_jobsqueued`: UInt,
    public var `sts0_sopens`: UInt,
    public var `sts0_stimedout`: UInt,
    public var `sts0_serrorout`: UInt,
    public var `sts0_pwerrors`: UInt,
    public var `sts0_permerrors`: UInt,
    public var `sts0_syserrors`: UInt,
    public var `sts0_bytessent_low`: UInt,
    public var `sts0_bytessent_high`: UInt,
    public var `sts0_bytesrcvd_low`: UInt,
    public var `sts0_bytesrcvd_high`: UInt,
    public var `sts0_avresponse`: UInt,
    public var `sts0_reqbufneed`: UInt,
    public var `sts0_bigbufneed`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STAT_WORKSTATION_0` (
    public var `StatisticsStartTime`: Long,
    public var `BytesReceived`: Long,
    public var `SmbsReceived`: Long,
    public var `PagingReadBytesRequested`: Long,
    public var `NonPagingReadBytesRequested`: Long,
    public var `CacheReadBytesRequested`: Long,
    public var `NetworkReadBytesRequested`: Long,
    public var `BytesTransmitted`: Long,
    public var `SmbsTransmitted`: Long,
    public var `PagingWriteBytesRequested`: Long,
    public var `NonPagingWriteBytesRequested`: Long,
    public var `CacheWriteBytesRequested`: Long,
    public var `NetworkWriteBytesRequested`: Long,
    public var `InitiallyFailedOperations`: UInt,
    public var `FailedCompletionOperations`: UInt,
    public var `ReadOperations`: UInt,
    public var `RandomReadOperations`: UInt,
    public var `ReadSmbs`: UInt,
    public var `LargeReadSmbs`: UInt,
    public var `SmallReadSmbs`: UInt,
    public var `WriteOperations`: UInt,
    public var `RandomWriteOperations`: UInt,
    public var `WriteSmbs`: UInt,
    public var `LargeWriteSmbs`: UInt,
    public var `SmallWriteSmbs`: UInt,
    public var `RawReadsDenied`: UInt,
    public var `RawWritesDenied`: UInt,
    public var `NetworkErrors`: UInt,
    public var `Sessions`: UInt,
    public var `FailedSessions`: UInt,
    public var `Reconnects`: UInt,
    public var `CoreConnects`: UInt,
    public var `Lanman20Connects`: UInt,
    public var `Lanman21Connects`: UInt,
    public var `LanmanNtConnects`: UInt,
    public var `ServerDisconnects`: UInt,
    public var `HungSessions`: UInt,
    public var `UseCount`: UInt,
    public var `FailedUseCount`: UInt,
    public var `CurrentCommands`: UInt,
)
public typealias `STORAGE_BUS_TYPE` = Int;
public typealias `STREAM_INFO_LEVELS` = Int;
public const val `STYPE_DEVICE`: `SHARE_TYPE` = 2u;
public const val `STYPE_DISKTREE`: `SHARE_TYPE` = 0u;
public const val `STYPE_IPC`: `SHARE_TYPE` = 3u;
public const val `STYPE_MASK`: `SHARE_TYPE` = 255u;
public const val `STYPE_PRINTQ`: `SHARE_TYPE` = 1u;
public const val `STYPE_RESERVED1`: UInt = 16777216u;
public const val `STYPE_RESERVED2`: UInt = 33554432u;
public const val `STYPE_RESERVED3`: UInt = 67108864u;
public const val `STYPE_RESERVED4`: UInt = 134217728u;
public const val `STYPE_RESERVED5`: UInt = 1048576u;
public const val `STYPE_RESERVED_ALL`: UInt = 1073741568u;
public const val `STYPE_SPECIAL`: `SHARE_TYPE` = 2147483648u;
public const val `STYPE_TEMPORARY`: `SHARE_TYPE` = 1073741824u;
public typealias `SYMBOLIC_LINK_FLAGS` = UInt;
public const val `SYMBOLIC_LINK_FLAG_ALLOW_UNPRIVILEGED_CREATE`: `SYMBOLIC_LINK_FLAGS` = 2u;
public const val `SYMBOLIC_LINK_FLAG_DIRECTORY`: `SYMBOLIC_LINK_FLAGS` = 1u;
public const val `SYNCHRONIZE`: `FILE_ACCESS_RIGHTS` = 1048576u;
public typealias `TAPEMARK_TYPE` = UInt;
public const val `TAPE_ABSOLUTE_BLOCK`: `TAPE_POSITION_METHOD` = 1u;
public const val `TAPE_ABSOLUTE_POSITION`: `TAPE_POSITION_TYPE` = 0u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TAPE_ERASE` (
    public var `Type`: `ERASE_TAPE_TYPE`,
    public var `Immediate`: Boolean,
)
public const val `TAPE_ERASE_LONG`: `ERASE_TAPE_TYPE` = 1u;
public const val `TAPE_ERASE_SHORT`: `ERASE_TAPE_TYPE` = 0u;
public const val `TAPE_FILEMARKS`: `TAPEMARK_TYPE` = 1u;
public const val `TAPE_FIXED_PARTITIONS`: `CREATE_TAPE_PARTITION_METHOD` = 0u;
public const val `TAPE_FORMAT`: `PREPARE_TAPE_OPERATION` = 5u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TAPE_GET_POSITION` (
    public var `Type`: `TAPE_POSITION_TYPE`,
    public var `Partition`: UInt,
    public var `Offset`: Long,
)
public typealias `TAPE_INFORMATION_TYPE` = UInt;
public const val `TAPE_INITIATOR_PARTITIONS`: `CREATE_TAPE_PARTITION_METHOD` = 2u;
public const val `TAPE_LOAD`: `PREPARE_TAPE_OPERATION` = 0u;
public const val `TAPE_LOCK`: `PREPARE_TAPE_OPERATION` = 3u;
public const val `TAPE_LOGICAL_BLOCK`: `TAPE_POSITION_METHOD` = 2u;
public const val `TAPE_LOGICAL_POSITION`: `TAPE_POSITION_TYPE` = 1u;
public const val `TAPE_LONG_FILEMARKS`: `TAPEMARK_TYPE` = 3u;
public typealias `TAPE_POSITION_METHOD` = UInt;
public typealias `TAPE_POSITION_TYPE` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TAPE_PREPARE` (
    public var `Operation`: `PREPARE_TAPE_OPERATION`,
    public var `Immediate`: Boolean,
)
public const val `TAPE_REWIND`: `TAPE_POSITION_METHOD` = 0u;
public const val `TAPE_SELECT_PARTITIONS`: `CREATE_TAPE_PARTITION_METHOD` = 1u;
public const val `TAPE_SETMARKS`: `TAPEMARK_TYPE` = 0u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TAPE_SET_POSITION` (
    public var `Method`: `TAPE_POSITION_METHOD`,
    public var `Partition`: UInt,
    public var `Offset`: Long,
    public var `Immediate`: Boolean,
)
public const val `TAPE_SHORT_FILEMARKS`: `TAPEMARK_TYPE` = 2u;
public const val `TAPE_SPACE_END_OF_DATA`: `TAPE_POSITION_METHOD` = 4u;
public const val `TAPE_SPACE_FILEMARKS`: `TAPE_POSITION_METHOD` = 6u;
public const val `TAPE_SPACE_RELATIVE_BLOCKS`: `TAPE_POSITION_METHOD` = 5u;
public const val `TAPE_SPACE_SEQUENTIAL_FMKS`: `TAPE_POSITION_METHOD` = 7u;
public const val `TAPE_SPACE_SEQUENTIAL_SMKS`: `TAPE_POSITION_METHOD` = 9u;
public const val `TAPE_SPACE_SETMARKS`: `TAPE_POSITION_METHOD` = 8u;
public const val `TAPE_TENSION`: `PREPARE_TAPE_OPERATION` = 2u;
public const val `TAPE_UNLOAD`: `PREPARE_TAPE_OPERATION` = 1u;
public const val `TAPE_UNLOCK`: `PREPARE_TAPE_OPERATION` = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TAPE_WRITE_MARKS` (
    public var `Type`: `TAPEMARK_TYPE`,
    public var `Count`: UInt,
    public var `Immediate`: Boolean,
)
// UNSUPPORTED Rust 3837:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const TRANSACTIONMANAGER_OBJECT_PATH: windows_sys::core::PCWSTR = windows_sys::core::w!("\\TransactionManager\\");

public const val `TRANSACTION_DO_NOT_PROMOTE`: UInt = 1u;
public const val `TRANSACTION_MANAGER_COMMIT_DEFAULT`: UInt = 0u;
public const val `TRANSACTION_MANAGER_COMMIT_LOWEST`: UInt = 8u;
public const val `TRANSACTION_MANAGER_COMMIT_SYSTEM_HIVES`: UInt = 4u;
public const val `TRANSACTION_MANAGER_COMMIT_SYSTEM_VOLUME`: UInt = 2u;
public const val `TRANSACTION_MANAGER_CORRUPT_FOR_PROGRESS`: UInt = 32u;
public const val `TRANSACTION_MANAGER_CORRUPT_FOR_RECOVERY`: UInt = 16u;
public const val `TRANSACTION_MANAGER_MAXIMUM_OPTION`: UInt = 63u;
public const val `TRANSACTION_MANAGER_VOLATILE`: UInt = 1u;
public const val `TRANSACTION_MAXIMUM_OPTION`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TRANSACTION_NOTIFICATION` (
    public var `TransactionKey`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `TransactionNotification`: UInt,
    public var `TmVirtualClock`: Long,
    public var `ArgumentLength`: UInt,
)
// UNSUPPORTED Rust 3856:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TRANSACTION_NOTIFICATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TRANSACTION_NOTIFICATION_MARSHAL_ARGUMENT` (
    public var `MarshalCookie`: UInt,
    public var `UOW`: `windows_sys`.`core`.`GUID`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TRANSACTION_NOTIFICATION_PROPAGATE_ARGUMENT` (
    public var `PropagationCookie`: UInt,
    public var `UOW`: `windows_sys`.`core`.`GUID`,
    public var `TmIdentity`: `windows_sys`.`core`.`GUID`,
    public var `BufferLength`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TRANSACTION_NOTIFICATION_RECOVERY_ARGUMENT` (
    public var `EnlistmentId`: `windows_sys`.`core`.`GUID`,
    public var `UOW`: `windows_sys`.`core`.`GUID`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TRANSACTION_NOTIFICATION_SAVEPOINT_ARGUMENT` (
    public var `SavepointId`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TRANSACTION_NOTIFICATION_TM_ONLINE_ARGUMENT` (
    public var `TmIdentity`: `windows_sys`.`core`.`GUID`,
    public var `Flags`: UInt,
)
public const val `TRANSACTION_NOTIFICATION_TM_ONLINE_FLAG_IS_CLUSTERED`: UInt = 1u;
public const val `TRANSACTION_NOTIFY_COMMIT`: UInt = 4u;
public const val `TRANSACTION_NOTIFY_COMMIT_COMPLETE`: UInt = 64u;
public const val `TRANSACTION_NOTIFY_COMMIT_FINALIZE`: UInt = 1073741824u;
public const val `TRANSACTION_NOTIFY_COMMIT_REQUEST`: UInt = 67108864u;
public const val `TRANSACTION_NOTIFY_DELEGATE_COMMIT`: UInt = 1024u;
public const val `TRANSACTION_NOTIFY_ENLIST_MASK`: UInt = 262144u;
public const val `TRANSACTION_NOTIFY_ENLIST_PREPREPARE`: UInt = 4096u;
public const val `TRANSACTION_NOTIFY_INDOUBT`: UInt = 16384u;
public const val `TRANSACTION_NOTIFY_LAST_RECOVER`: UInt = 8192u;
public const val `TRANSACTION_NOTIFY_MARSHAL`: UInt = 131072u;
public const val `TRANSACTION_NOTIFY_MASK`: UInt = 1073741823u;
public const val `TRANSACTION_NOTIFY_PREPARE`: UInt = 2u;
public const val `TRANSACTION_NOTIFY_PREPARE_COMPLETE`: UInt = 32u;
public const val `TRANSACTION_NOTIFY_PREPREPARE`: UInt = 1u;
public const val `TRANSACTION_NOTIFY_PREPREPARE_COMPLETE`: UInt = 16u;
public const val `TRANSACTION_NOTIFY_PROMOTE`: UInt = 134217728u;
public const val `TRANSACTION_NOTIFY_PROMOTE_NEW`: UInt = 268435456u;
public const val `TRANSACTION_NOTIFY_PROPAGATE_PULL`: UInt = 32768u;
public const val `TRANSACTION_NOTIFY_PROPAGATE_PUSH`: UInt = 65536u;
public const val `TRANSACTION_NOTIFY_RECOVER`: UInt = 256u;
public const val `TRANSACTION_NOTIFY_RECOVER_QUERY`: UInt = 2048u;
public const val `TRANSACTION_NOTIFY_REQUEST_OUTCOME`: UInt = 536870912u;
public const val `TRANSACTION_NOTIFY_RM_DISCONNECTED`: UInt = 16777216u;
public const val `TRANSACTION_NOTIFY_ROLLBACK`: UInt = 8u;
public const val `TRANSACTION_NOTIFY_ROLLBACK_COMPLETE`: UInt = 128u;
public const val `TRANSACTION_NOTIFY_SINGLE_PHASE_COMMIT`: UInt = 512u;
public const val `TRANSACTION_NOTIFY_TM_ONLINE`: UInt = 33554432u;
// UNSUPPORTED Rust 3920:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const TRANSACTION_OBJECT_PATH: windows_sys::core::PCWSTR = windows_sys::core::w!("\\Transaction\\");

public typealias `TRANSACTION_OUTCOME` = Int;
public const val `TRUNCATE_EXISTING`: `FILE_CREATION_DISPOSITION` = 5u;
public typealias `TXFS_MINIVERSION` = UInt;
public const val `TXFS_MINIVERSION_COMMITTED_VIEW`: `TXFS_MINIVERSION` = 0u;
public const val `TXFS_MINIVERSION_DEFAULT_VIEW`: `TXFS_MINIVERSION` = 65534u;
public const val `TXFS_MINIVERSION_DIRTY_VIEW`: `TXFS_MINIVERSION` = 65535u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TXF_ID` (
    public var `Anonymous`: `TXF_ID_0`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TXF_ID_0` (
    public var `LowPart`: Long,
    public var `HighPart`: Long,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TXF_LOG_RECORD_AFFECTED_FILE` (
    public var `Version`: UShort,
    public var `RecordLength`: UInt,
    public var `Flags`: UInt,
    public var `TxfFileId`: `TXF_ID`,
    public var `KtmGuid`: `windows_sys`.`core`.`GUID`,
    public var `FileNameLength`: UInt,
    public var `FileNameByteOffsetInStructure`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TXF_LOG_RECORD_BASE` (
    public var `Version`: UShort,
    public var `RecordType`: `TXF_LOG_RECORD_TYPE`,
    public var `RecordLength`: UInt,
)
public const val `TXF_LOG_RECORD_GENERIC_TYPE_ABORT`: UInt = 2u;
public const val `TXF_LOG_RECORD_GENERIC_TYPE_COMMIT`: UInt = 1u;
public const val `TXF_LOG_RECORD_GENERIC_TYPE_DATA`: UInt = 8u;
public const val `TXF_LOG_RECORD_GENERIC_TYPE_PREPARE`: UInt = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TXF_LOG_RECORD_TRUNCATE` (
    public var `Version`: UShort,
    public var `RecordType`: UShort,
    public var `RecordLength`: UInt,
    public var `Flags`: UInt,
    public var `TxfFileId`: `TXF_ID`,
    public var `KtmGuid`: `windows_sys`.`core`.`GUID`,
    public var `NewFileSize`: Long,
    public var `FileNameLength`: UInt,
    public var `FileNameByteOffsetInStructure`: UInt,
)
public typealias `TXF_LOG_RECORD_TYPE` = UShort;
public const val `TXF_LOG_RECORD_TYPE_AFFECTED_FILE`: `TXF_LOG_RECORD_TYPE` = 4u;
public const val `TXF_LOG_RECORD_TYPE_TRUNCATE`: `TXF_LOG_RECORD_TYPE` = 2u;
public const val `TXF_LOG_RECORD_TYPE_WRITE`: `TXF_LOG_RECORD_TYPE` = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TXF_LOG_RECORD_WRITE` (
    public var `Version`: UShort,
    public var `RecordType`: UShort,
    public var `RecordLength`: UInt,
    public var `Flags`: UInt,
    public var `TxfFileId`: `TXF_ID`,
    public var `KtmGuid`: `windows_sys`.`core`.`GUID`,
    public var `ByteOffsetInFile`: Long,
    public var `NumBytesWritten`: UInt,
    public var `ByteOffsetInStructure`: UInt,
    public var `FileNameLength`: UInt,
    public var `FileNameByteOffsetInStructure`: UInt,
)
public const val `TransactionOutcomeAborted`: `TRANSACTION_OUTCOME` = 3;
public const val `TransactionOutcomeCommitted`: `TRANSACTION_OUTCOME` = 2;
public const val `TransactionOutcomeUndetermined`: `TRANSACTION_OUTCOME` = 1;
public typealias `VER_FIND_FILE_FLAGS` = UInt;
public typealias `VER_FIND_FILE_STATUS` = UInt;
public typealias `VER_INSTALL_FILE_FLAGS` = UInt;
public typealias `VER_INSTALL_FILE_STATUS` = UInt;
public const val `VFFF_ISSHAREDFILE`: `VER_FIND_FILE_FLAGS` = 1u;
public const val `VFF_BUFFTOOSMALL`: `VER_FIND_FILE_STATUS` = 4u;
public const val `VFF_CURNEDEST`: `VER_FIND_FILE_STATUS` = 1u;
public const val `VFF_FILEINUSE`: `VER_FIND_FILE_STATUS` = 2u;
public const val `VFT2_DRV_COMM`: `VS_FIXEDFILEINFO_FILE_SUBTYPE` = 10;
public const val `VFT2_DRV_DISPLAY`: `VS_FIXEDFILEINFO_FILE_SUBTYPE` = 4;
public const val `VFT2_DRV_INPUTMETHOD`: `VS_FIXEDFILEINFO_FILE_SUBTYPE` = 11;
public const val `VFT2_DRV_INSTALLABLE`: `VS_FIXEDFILEINFO_FILE_SUBTYPE` = 8;
public const val `VFT2_DRV_KEYBOARD`: `VS_FIXEDFILEINFO_FILE_SUBTYPE` = 2;
public const val `VFT2_DRV_LANGUAGE`: `VS_FIXEDFILEINFO_FILE_SUBTYPE` = 3;
public const val `VFT2_DRV_MOUSE`: `VS_FIXEDFILEINFO_FILE_SUBTYPE` = 5;
public const val `VFT2_DRV_NETWORK`: `VS_FIXEDFILEINFO_FILE_SUBTYPE` = 6;
public const val `VFT2_DRV_PRINTER`: `VS_FIXEDFILEINFO_FILE_SUBTYPE` = 1;
public const val `VFT2_DRV_SOUND`: `VS_FIXEDFILEINFO_FILE_SUBTYPE` = 9;
public const val `VFT2_DRV_SYSTEM`: `VS_FIXEDFILEINFO_FILE_SUBTYPE` = 7;
public const val `VFT2_DRV_VERSIONED_PRINTER`: `VS_FIXEDFILEINFO_FILE_SUBTYPE` = 12;
public const val `VFT2_FONT_RASTER`: `VS_FIXEDFILEINFO_FILE_SUBTYPE` = 1;
public const val `VFT2_FONT_TRUETYPE`: `VS_FIXEDFILEINFO_FILE_SUBTYPE` = 3;
public const val `VFT2_FONT_VECTOR`: `VS_FIXEDFILEINFO_FILE_SUBTYPE` = 2;
public const val `VFT2_UNKNOWN`: `VS_FIXEDFILEINFO_FILE_SUBTYPE` = 0;
public const val `VFT_APP`: `VS_FIXEDFILEINFO_FILE_TYPE` = 1;
public const val `VFT_DLL`: `VS_FIXEDFILEINFO_FILE_TYPE` = 2;
public const val `VFT_DRV`: `VS_FIXEDFILEINFO_FILE_TYPE` = 3;
public const val `VFT_FONT`: `VS_FIXEDFILEINFO_FILE_TYPE` = 4;
public const val `VFT_STATIC_LIB`: `VS_FIXEDFILEINFO_FILE_TYPE` = 7;
public const val `VFT_UNKNOWN`: `VS_FIXEDFILEINFO_FILE_TYPE` = 0;
public const val `VFT_VXD`: `VS_FIXEDFILEINFO_FILE_TYPE` = 5;
public const val `VIFF_DONTDELETEOLD`: `VER_INSTALL_FILE_FLAGS` = 2u;
public const val `VIFF_FORCEINSTALL`: `VER_INSTALL_FILE_FLAGS` = 1u;
public const val `VIF_ACCESSVIOLATION`: `VER_INSTALL_FILE_STATUS` = 512u;
public const val `VIF_BUFFTOOSMALL`: `VER_INSTALL_FILE_STATUS` = 262144u;
public const val `VIF_CANNOTCREATE`: `VER_INSTALL_FILE_STATUS` = 2048u;
public const val `VIF_CANNOTDELETE`: `VER_INSTALL_FILE_STATUS` = 4096u;
public const val `VIF_CANNOTDELETECUR`: `VER_INSTALL_FILE_STATUS` = 16384u;
public const val `VIF_CANNOTLOADCABINET`: `VER_INSTALL_FILE_STATUS` = 1048576u;
public const val `VIF_CANNOTLOADLZ32`: `VER_INSTALL_FILE_STATUS` = 524288u;
public const val `VIF_CANNOTREADDST`: `VER_INSTALL_FILE_STATUS` = 131072u;
public const val `VIF_CANNOTREADSRC`: `VER_INSTALL_FILE_STATUS` = 65536u;
public const val `VIF_CANNOTRENAME`: `VER_INSTALL_FILE_STATUS` = 8192u;
public const val `VIF_DIFFCODEPG`: `VER_INSTALL_FILE_STATUS` = 16u;
public const val `VIF_DIFFLANG`: `VER_INSTALL_FILE_STATUS` = 8u;
public const val `VIF_DIFFTYPE`: `VER_INSTALL_FILE_STATUS` = 32u;
public const val `VIF_FILEINUSE`: `VER_INSTALL_FILE_STATUS` = 128u;
public const val `VIF_MISMATCH`: `VER_INSTALL_FILE_STATUS` = 2u;
public const val `VIF_OUTOFMEMORY`: `VER_INSTALL_FILE_STATUS` = 32768u;
public const val `VIF_OUTOFSPACE`: `VER_INSTALL_FILE_STATUS` = 256u;
public const val `VIF_SHARINGVIOLATION`: `VER_INSTALL_FILE_STATUS` = 1024u;
public const val `VIF_SRCOLD`: `VER_INSTALL_FILE_STATUS` = 4u;
public const val `VIF_TEMPFILE`: `VER_INSTALL_FILE_STATUS` = 1u;
public const val `VIF_WRITEPROT`: `VER_INSTALL_FILE_STATUS` = 64u;
// UNSUPPORTED Rust 4049:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct VOLUME_ALLOCATE_BC_STREAM_INPUT {
//     pub Version: u32,
//     pub RequestsPerPeriod: u32,
//     pub Period: u32,
//     pub RetryFailures: bool,
//     pub Discardable: bool,
//     pub Reserved1: [bool; 2],
//     pub LowestByteOffset: u64,
//     pub HighestByteOffset: u64,
//     pub AccessType: u32,
//     pub AccessMode: u32,
// }

// UNSUPPORTED Rust 4063:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for VOLUME_ALLOCATE_BC_STREAM_INPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `VOLUME_ALLOCATE_BC_STREAM_OUTPUT` (
    public var `RequestSize`: ULong,
    public var `NumOutStandingRequests`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `VOLUME_ALLOCATION_HINT_INPUT` (
    public var `ClusterSize`: UInt,
    public var `NumberOfClusters`: UInt,
    public var `StartingClusterNumber`: Long,
)
// UNSUPPORTED Rust 4081:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct VOLUME_ALLOCATION_HINT_OUTPUT {
//     pub Bitmap: [u32; 1],
// }

// UNSUPPORTED Rust 4086:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for VOLUME_ALLOCATION_HINT_OUTPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4091:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct VOLUME_CRITICAL_IO {
//     pub AccessType: u32,
//     pub ExtentsCount: u32,
//     pub Extents: [FILE_EXTENT; 1],
// }

// UNSUPPORTED Rust 4098:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for VOLUME_CRITICAL_IO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4103:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct VOLUME_FAILOVER_SET {
//     pub NumberOfDisks: u32,
//     pub DiskNumbers: [u32; 1],
// }

// UNSUPPORTED Rust 4109:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for VOLUME_FAILOVER_SET {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `VOLUME_GET_BC_PROPERTIES_INPUT` (
    public var `Version`: UInt,
    public var `Reserved1`: UInt,
    public var `LowestByteOffset`: ULong,
    public var `HighestByteOffset`: ULong,
    public var `AccessType`: UInt,
    public var `AccessMode`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `VOLUME_GET_BC_PROPERTIES_OUTPUT` (
    public var `MaximumRequestsPerPeriod`: UInt,
    public var `MinimumPeriod`: UInt,
    public var `MaximumRequestSize`: ULong,
    public var `EstimatedTimePerRequest`: UInt,
    public var `NumOutStandingRequests`: UInt,
    public var `RequestSize`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `VOLUME_LOGICAL_OFFSET` (
    public var `LogicalOffset`: Long,
)
public const val `VOLUME_NAME_DOS`: `GETFINALPATHNAMEBYHANDLE_FLAGS` = 0u;
public const val `VOLUME_NAME_GUID`: `GETFINALPATHNAMEBYHANDLE_FLAGS` = 1u;
public const val `VOLUME_NAME_NONE`: `GETFINALPATHNAMEBYHANDLE_FLAGS` = 4u;
public const val `VOLUME_NAME_NT`: `GETFINALPATHNAMEBYHANDLE_FLAGS` = 2u;
// UNSUPPORTED Rust 4143:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct VOLUME_NUMBER {
//     pub VolumeNumber: u32,
//     pub VolumeManagerName: [u16; 8],
// }

// UNSUPPORTED Rust 4149:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for VOLUME_NUMBER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `VOLUME_PHYSICAL_OFFSET` (
    public var `DiskNumber`: UInt,
    public var `Offset`: Long,
)
// UNSUPPORTED Rust 4160:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct VOLUME_PHYSICAL_OFFSETS {
//     pub NumberOfPhysicalOffsets: u32,
//     pub PhysicalOffset: [VOLUME_PHYSICAL_OFFSET; 1],
// }

// UNSUPPORTED Rust 4166:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for VOLUME_PHYSICAL_OFFSETS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `VOLUME_READ_PLEX_INPUT` (
    public var `ByteOffset`: Long,
    public var `Length`: UInt,
    public var `PlexNumber`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `VOLUME_SET_GPT_ATTRIBUTES_INFORMATION` (
    public var `GptAttributes`: ULong,
    public var `RevertOnClose`: Boolean,
    public var `ApplyToAllConnectedVolumes`: Boolean,
    public var `Reserved1`: UShort,
    public var `Reserved2`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `VOLUME_SHRINK_INFO` (
    public var `VolumeSize`: ULong,
)
public const val `VOS_DOS`: `VS_FIXEDFILEINFO_FILE_OS` = 65536u;
public const val `VOS_DOS_WINDOWS16`: `VS_FIXEDFILEINFO_FILE_OS` = 65537u;
public const val `VOS_DOS_WINDOWS32`: `VS_FIXEDFILEINFO_FILE_OS` = 65540u;
public const val `VOS_NT`: `VS_FIXEDFILEINFO_FILE_OS` = 262144u;
public const val `VOS_NT_WINDOWS32`: `VS_FIXEDFILEINFO_FILE_OS` = 262148u;
public const val `VOS_OS216`: `VS_FIXEDFILEINFO_FILE_OS` = 131072u;
public const val `VOS_OS216_PM16`: `VS_FIXEDFILEINFO_FILE_OS` = 131074u;
public const val `VOS_OS232`: `VS_FIXEDFILEINFO_FILE_OS` = 196608u;
public const val `VOS_OS232_PM32`: `VS_FIXEDFILEINFO_FILE_OS` = 196611u;
public const val `VOS_UNKNOWN`: `VS_FIXEDFILEINFO_FILE_OS` = 0u;
public const val `VOS_WINCE`: `VS_FIXEDFILEINFO_FILE_OS` = 327680u;
public const val `VOS__BASE`: `VS_FIXEDFILEINFO_FILE_OS` = 0u;
public const val `VOS__PM16`: `VS_FIXEDFILEINFO_FILE_OS` = 2u;
public const val `VOS__PM32`: `VS_FIXEDFILEINFO_FILE_OS` = 3u;
public const val `VOS__WINDOWS16`: `VS_FIXEDFILEINFO_FILE_OS` = 1u;
public const val `VOS__WINDOWS32`: `VS_FIXEDFILEINFO_FILE_OS` = 4u;
public const val `VS_FFI_FILEFLAGSMASK`: Int = 63;
public const val `VS_FFI_SIGNATURE`: Int = -17890115;
public const val `VS_FFI_STRUCVERSION`: Int = 65536;
public const val `VS_FF_DEBUG`: `VS_FIXEDFILEINFO_FILE_FLAGS` = 1u;
public const val `VS_FF_INFOINFERRED`: `VS_FIXEDFILEINFO_FILE_FLAGS` = 16u;
public const val `VS_FF_PATCHED`: `VS_FIXEDFILEINFO_FILE_FLAGS` = 4u;
public const val `VS_FF_PRERELEASE`: `VS_FIXEDFILEINFO_FILE_FLAGS` = 2u;
public const val `VS_FF_PRIVATEBUILD`: `VS_FIXEDFILEINFO_FILE_FLAGS` = 8u;
public const val `VS_FF_SPECIALBUILD`: `VS_FIXEDFILEINFO_FILE_FLAGS` = 32u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `VS_FIXEDFILEINFO` (
    public var `dwSignature`: UInt,
    public var `dwStrucVersion`: UInt,
    public var `dwFileVersionMS`: UInt,
    public var `dwFileVersionLS`: UInt,
    public var `dwProductVersionMS`: UInt,
    public var `dwProductVersionLS`: UInt,
    public var `dwFileFlagsMask`: UInt,
    public var `dwFileFlags`: `VS_FIXEDFILEINFO_FILE_FLAGS`,
    public var `dwFileOS`: `VS_FIXEDFILEINFO_FILE_OS`,
    public var `dwFileType`: UInt,
    public var `dwFileSubtype`: UInt,
    public var `dwFileDateMS`: UInt,
    public var `dwFileDateLS`: UInt,
)
public typealias `VS_FIXEDFILEINFO_FILE_FLAGS` = UInt;
public typealias `VS_FIXEDFILEINFO_FILE_OS` = UInt;
public typealias `VS_FIXEDFILEINFO_FILE_SUBTYPE` = Int;
public typealias `VS_FIXEDFILEINFO_FILE_TYPE` = Int;
public const val `VS_USER_DEFINED`: UInt = 100u;
public const val `VS_VERSION_INFO`: UInt = 1u;
public const val `WIM_BOOT_NOT_OS_WIM`: UInt = 0u;
public const val `WIM_BOOT_OS_WIM`: UInt = 1u;
public const val `WIM_ENTRY_FLAG_NOT_ACTIVE`: UInt = 1u;
public const val `WIM_ENTRY_FLAG_SUSPENDED`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WIM_ENTRY_INFO` (
    public var `WimEntryInfoSize`: UInt,
    public var `WimType`: UInt,
    public var `DataSourceId`: Long,
    public var `WimGuid`: `windows_sys`.`core`.`GUID`,
    public var `WimPath`: `windows_sys`.`core`.`PCWSTR`,
    public var `WimIndex`: UInt,
    public var `Flags`: UInt,
)
// UNSUPPORTED Rust 4255:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WIM_ENTRY_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4260:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WIM_EXTERNAL_FILE_INFO {
//     pub DataSourceId: i64,
//     pub ResourceHash: [u8; 20],
//     pub Flags: u32,
// }

// UNSUPPORTED Rust 4267:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WIM_EXTERNAL_FILE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WIM_EXTERNAL_FILE_INFO_FLAG_NOT_ACTIVE`: UInt = 1u;
public const val `WIM_EXTERNAL_FILE_INFO_FLAG_SUSPENDED`: UInt = 2u;
public const val `WIM_PROVIDER_HASH_SIZE`: UInt = 20u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WIN32_FILE_ATTRIBUTE_DATA` (
    public var `dwFileAttributes`: UInt,
    public var `ftCreationTime`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `ftLastAccessTime`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `ftLastWriteTime`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `nFileSizeHigh`: UInt,
    public var `nFileSizeLow`: UInt,
)
// UNSUPPORTED Rust 4285:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WIN32_FIND_DATAA {
//     pub dwFileAttributes: u32,
//     pub ftCreationTime: super::super::Foundation::FILETIME,
//     pub ftLastAccessTime: super::super::Foundation::FILETIME,
//     pub ftLastWriteTime: super::super::Foundation::FILETIME,
//     pub nFileSizeHigh: u32,
//     pub nFileSizeLow: u32,
//     pub dwReserved0: u32,
//     pub dwReserved1: u32,
//     pub cFileName: [i8; 260],
//     pub cAlternateFileName: [i8; 14],
// }

// UNSUPPORTED Rust 4299:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WIN32_FIND_DATAA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4304:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WIN32_FIND_DATAW {
//     pub dwFileAttributes: u32,
//     pub ftCreationTime: super::super::Foundation::FILETIME,
//     pub ftLastAccessTime: super::super::Foundation::FILETIME,
//     pub ftLastWriteTime: super::super::Foundation::FILETIME,
//     pub nFileSizeHigh: u32,
//     pub nFileSizeLow: u32,
//     pub dwReserved0: u32,
//     pub dwReserved1: u32,
//     pub cFileName: [u16; 260],
//     pub cAlternateFileName: [u16; 14],
// }

// UNSUPPORTED Rust 4318:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WIN32_FIND_DATAW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4323:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WIN32_FIND_STREAM_DATA {
//     pub StreamSize: i64,
//     pub cStreamName: [u16; 296],
// }

// UNSUPPORTED Rust 4329:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WIN32_FIND_STREAM_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4334:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WIN32_STREAM_ID {
//     pub dwStreamId: WIN_STREAM_ID,
//     pub dwStreamAttributes: u32,
//     pub Size: i64,
//     pub dwStreamNameSize: u32,
//     pub cStreamName: [u16; 1],
// }

// UNSUPPORTED Rust 4343:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WIN32_STREAM_ID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WINEFS_SETUSERKEY_SET_CAPABILITIES`: UInt = 1u;
public typealias `WIN_STREAM_ID` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WOF_FILE_COMPRESSION_INFO_V0` (
    public var `Algorithm`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WOF_FILE_COMPRESSION_INFO_V1` (
    public var `Algorithm`: UInt,
    public var `Flags`: UInt,
)
public const val `WOF_PROVIDER_FILE`: UInt = 2u;
public const val `WOF_PROVIDER_WIM`: UInt = 1u;
public const val `WRITE_DAC`: `FILE_ACCESS_RIGHTS` = 262144u;
public const val `WRITE_OWNER`: `FILE_ACCESS_RIGHTS` = 524288u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WofEnumEntryProc` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WofEnumFilesProc` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`BOOL`>>>;
public const val `_FT_TYPES_DEFINITION_`: UInt = 1u;
