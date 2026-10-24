// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=faultrep.dll, ABI=system, export=AddERExcludedApplicationA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AddERExcludedApplicationA`(`szapplication` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=faultrep.dll, ABI=system, export=AddERExcludedApplicationW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AddERExcludedApplicationW`(`wszapplication` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=faultrep.dll, ABI=system, export=ReportFault; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Diagnostics_Debug", feature = "Win32_System_Kernel"))]
public external fun `ReportFault`(`pep` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Diagnostics`.`Debug`.`EXCEPTION_POINTERS`>?, `dwopt` : UInt) : `EFaultRepRetVal`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wer.dll, ABI=system, export=WerAddExcludedApplication; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WerAddExcludedApplication`(`pwzexename` : `windows_sys`.`core`.`PCWSTR`, `ballusers` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wer.dll, ABI=system, export=WerFreeString; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WerFreeString`(`pwszstr` : `windows_sys`.`core`.`PCWSTR`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=WerGetFlags; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WerGetFlags`(`hprocess` : `super`.`super`.`Foundation`.`HANDLE`, `pdwflags` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WER_FAULT_REPORTING`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=WerRegisterAdditionalProcess; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WerRegisterAdditionalProcess`(`processid` : UInt, `captureextrainfoforthreadid` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=WerRegisterAppLocalDump; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WerRegisterAppLocalDump`(`localappdatarelativepath` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=WerRegisterCustomMetadata; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WerRegisterCustomMetadata`(`key` : `windows_sys`.`core`.`PCWSTR`, `value` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=WerRegisterExcludedMemoryBlock; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WerRegisterExcludedMemoryBlock`(`address` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `size` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=WerRegisterFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WerRegisterFile`(`pwzfile` : `windows_sys`.`core`.`PCWSTR`, `regfiletype` : `WER_REGISTER_FILE_TYPE`, `dwflags` : `WER_FILE`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=WerRegisterMemoryBlock; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WerRegisterMemoryBlock`(`pvaddress` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `dwsize` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=WerRegisterRuntimeExceptionModule; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WerRegisterRuntimeExceptionModule`(`pwszoutofprocesscallbackdll` : `windows_sys`.`core`.`PCWSTR`, `pcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wer.dll, ABI=system, export=WerRemoveExcludedApplication; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WerRemoveExcludedApplication`(`pwzexename` : `windows_sys`.`core`.`PCWSTR`, `ballusers` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wer.dll, ABI=system, export=WerReportAddDump; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Diagnostics_Debug", feature = "Win32_System_Kernel"))]
public external fun `WerReportAddDump`(`hreporthandle` : `HREPORT`, `hprocess` : `super`.`super`.`Foundation`.`HANDLE`, `hthread` : `super`.`super`.`Foundation`.`HANDLE`, `dumptype` : `WER_DUMP_TYPE`, `pexceptionparam` : /* Rust *const */ kotlinx.cinterop.CPointer<`WER_EXCEPTION_INFORMATION`>?, `pdumpcustomoptions` : /* Rust *const */ kotlinx.cinterop.CPointer<`WER_DUMP_CUSTOM_OPTIONS`>?, `dwflags` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wer.dll, ABI=system, export=WerReportAddFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WerReportAddFile`(`hreporthandle` : `HREPORT`, `pwzpath` : `windows_sys`.`core`.`PCWSTR`, `repfiletype` : `WER_FILE_TYPE`, `dwfileflags` : `WER_FILE`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wer.dll, ABI=system, export=WerReportCloseHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WerReportCloseHandle`(`hreporthandle` : `HREPORT`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wer.dll, ABI=system, export=WerReportCreate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WerReportCreate`(`pwzeventtype` : `windows_sys`.`core`.`PCWSTR`, `reptype` : `WER_REPORT_TYPE`, `preportinformation` : /* Rust *const */ kotlinx.cinterop.CPointer<`WER_REPORT_INFORMATION`>?, `phreporthandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HREPORT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=faultrep.dll, ABI=system, export=WerReportHang; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WerReportHang`(`hwndhungapp` : `super`.`super`.`Foundation`.`HWND`, `pwzhungapplicationname` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wer.dll, ABI=system, export=WerReportSetParameter; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WerReportSetParameter`(`hreporthandle` : `HREPORT`, `dwparamid` : UInt, `pwzname` : `windows_sys`.`core`.`PCWSTR`, `pwzvalue` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wer.dll, ABI=system, export=WerReportSetUIOption; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WerReportSetUIOption`(`hreporthandle` : `HREPORT`, `repuitypeid` : `WER_REPORT_UI`, `pwzvalue` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wer.dll, ABI=system, export=WerReportSubmit; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WerReportSubmit`(`hreporthandle` : `HREPORT`, `consent` : `WER_CONSENT`, `dwflags` : `WER_SUBMIT_FLAGS`, `psubmitresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WER_SUBMIT_RESULT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=WerSetFlags; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WerSetFlags`(`dwflags` : `WER_FAULT_REPORTING`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wer.dll, ABI=system, export=WerStoreClose; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WerStoreClose`(`hreportstore` : `HREPORTSTORE`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wer.dll, ABI=system, export=WerStoreGetFirstReportKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WerStoreGetFirstReportKey`(`hreportstore` : `HREPORTSTORE`, `ppszreportkey` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wer.dll, ABI=system, export=WerStoreGetNextReportKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WerStoreGetNextReportKey`(`hreportstore` : `HREPORTSTORE`, `ppszreportkey` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wer.dll, ABI=system, export=WerStoreGetReportCount; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WerStoreGetReportCount`(`hreportstore` : `HREPORTSTORE`, `pdwreportcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wer.dll, ABI=system, export=WerStoreGetSizeOnDisk; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WerStoreGetSizeOnDisk`(`hreportstore` : `HREPORTSTORE`, `pqwsizeinbytes` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wer.dll, ABI=system, export=WerStoreOpen; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WerStoreOpen`(`repstoretype` : `REPORT_STORE_TYPES`, `phreportstore` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HREPORTSTORE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wer.dll, ABI=system, export=WerStorePurge; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WerStorePurge`() : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wer.dll, ABI=system, export=WerStoreQueryReportMetadataV1; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WerStoreQueryReportMetadataV1`(`hreportstore` : `HREPORTSTORE`, `pszreportkey` : `windows_sys`.`core`.`PCWSTR`, `preportmetadata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WER_REPORT_METADATA_V1`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wer.dll, ABI=system, export=WerStoreQueryReportMetadataV2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WerStoreQueryReportMetadataV2`(`hreportstore` : `HREPORTSTORE`, `pszreportkey` : `windows_sys`.`core`.`PCWSTR`, `preportmetadata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WER_REPORT_METADATA_V2`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wer.dll, ABI=system, export=WerStoreQueryReportMetadataV3; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WerStoreQueryReportMetadataV3`(`hreportstore` : `HREPORTSTORE`, `pszreportkey` : `windows_sys`.`core`.`PCWSTR`, `preportmetadata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WER_REPORT_METADATA_V3`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wer.dll, ABI=system, export=WerStoreUploadReport; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WerStoreUploadReport`(`hreportstore` : `HREPORTSTORE`, `pszreportkey` : `windows_sys`.`core`.`PCWSTR`, `dwflags` : UInt, `psubmitresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WER_SUBMIT_RESULT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=WerUnregisterAdditionalProcess; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WerUnregisterAdditionalProcess`(`processid` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=WerUnregisterAppLocalDump; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WerUnregisterAppLocalDump`() : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=WerUnregisterCustomMetadata; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WerUnregisterCustomMetadata`(`key` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=WerUnregisterExcludedMemoryBlock; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WerUnregisterExcludedMemoryBlock`(`address` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=WerUnregisterFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WerUnregisterFile`(`pwzfilepath` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=WerUnregisterMemoryBlock; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WerUnregisterMemoryBlock`(`pvaddress` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=WerUnregisterRuntimeExceptionModule; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WerUnregisterRuntimeExceptionModule`(`pwszoutofprocesscallbackdll` : `windows_sys`.`core`.`PCWSTR`, `pcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// UNSUPPORTED Rust 44:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const APPCRASH_EVENT: windows_sys::core::PCWSTR = windows_sys::core::w!("APPCRASH");

public typealias `EFaultRepRetVal` = Int;
public const val `E_STORE_INVALID`: `REPORT_STORE_TYPES` = 4;
public const val `E_STORE_MACHINE_ARCHIVE`: `REPORT_STORE_TYPES` = 2;
public const val `E_STORE_MACHINE_QUEUE`: `REPORT_STORE_TYPES` = 3;
public const val `E_STORE_USER_ARCHIVE`: `REPORT_STORE_TYPES` = 0;
public const val `E_STORE_USER_QUEUE`: `REPORT_STORE_TYPES` = 1;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HREPORT` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HREPORTSTORE` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// UNSUPPORTED Rust 53:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const PACKAGED_APPCRASH_EVENT: windows_sys::core::PCWSTR = windows_sys::core::w!("MoAppCrash");

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Diagnostics_Debug", feature = "Win32_System_Kernel"))]
public typealias `PFN_WER_RUNTIME_EXCEPTION_DEBUGGER_LAUNCH` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WER_RUNTIME_EXCEPTION_INFORMATION`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?, `windows_sys`.`core`.`PWSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Diagnostics_Debug", feature = "Win32_System_Kernel"))]
public typealias `PFN_WER_RUNTIME_EXCEPTION_EVENT` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WER_RUNTIME_EXCEPTION_INFORMATION`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?, `windows_sys`.`core`.`PWSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Diagnostics_Debug", feature = "Win32_System_Kernel"))]
public typealias `PFN_WER_RUNTIME_EXCEPTION_EVENT_SIGNATURE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WER_RUNTIME_EXCEPTION_INFORMATION`>?, UInt, `windows_sys`.`core`.`PWSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `windows_sys`.`core`.`PWSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`HRESULT`>>>;
public typealias `REPORT_STORE_TYPES` = Int;
public typealias `WER_CONSENT` = Int;
public const val `WER_DUMP_AUXILIARY`: UInt = 2u;
// UNSUPPORTED Rust 63:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WER_DUMP_CUSTOM_OPTIONS {
//     pub dwSize: u32,
//     pub dwMask: u32,
//     pub dwDumpFlags: u32,
//     pub bOnlyThisThread: windows_sys::core::BOOL,
//     pub dwExceptionThreadFlags: u32,
//     pub dwOtherThreadFlags: u32,
//     pub dwExceptionThreadExFlags: u32,
//     pub dwOtherThreadExFlags: u32,
//     pub dwPreferredModuleFlags: u32,
//     pub dwOtherModuleFlags: u32,
//     pub wzPreferredModuleList: [u16; 256],
// }

// UNSUPPORTED Rust 78:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WER_DUMP_CUSTOM_OPTIONS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 83:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WER_DUMP_CUSTOM_OPTIONS_V2 {
//     pub dwSize: u32,
//     pub dwMask: u32,
//     pub dwDumpFlags: u32,
//     pub bOnlyThisThread: windows_sys::core::BOOL,
//     pub dwExceptionThreadFlags: u32,
//     pub dwOtherThreadFlags: u32,
//     pub dwExceptionThreadExFlags: u32,
//     pub dwOtherThreadExFlags: u32,
//     pub dwPreferredModuleFlags: u32,
//     pub dwOtherModuleFlags: u32,
//     pub wzPreferredModuleList: [u16; 256],
//     pub dwPreferredModuleResetFlags: u32,
//     pub dwOtherModuleResetFlags: u32,
// }

// UNSUPPORTED Rust 100:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WER_DUMP_CUSTOM_OPTIONS_V2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 105:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WER_DUMP_CUSTOM_OPTIONS_V3 {
//     pub dwSize: u32,
//     pub dwMask: u32,
//     pub dwDumpFlags: u32,
//     pub bOnlyThisThread: windows_sys::core::BOOL,
//     pub dwExceptionThreadFlags: u32,
//     pub dwOtherThreadFlags: u32,
//     pub dwExceptionThreadExFlags: u32,
//     pub dwOtherThreadExFlags: u32,
//     pub dwPreferredModuleFlags: u32,
//     pub dwOtherModuleFlags: u32,
//     pub wzPreferredModuleList: [u16; 256],
//     pub dwPreferredModuleResetFlags: u32,
//     pub dwOtherModuleResetFlags: u32,
//     pub pvDumpKey: *mut core::ffi::c_void,
//     pub hSnapshot: super::super::Foundation::HANDLE,
//     pub dwThreadID: u32,
// }

// UNSUPPORTED Rust 125:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WER_DUMP_CUSTOM_OPTIONS_V3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WER_DUMP_MASK_START`: UInt = 1u;
public const val `WER_DUMP_NOHEAP_ONQUEUE`: UInt = 1u;
public typealias `WER_DUMP_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Diagnostics_Debug", feature = "Win32_System_Kernel"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WER_EXCEPTION_INFORMATION` (
    public var `pExceptionPointers`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Diagnostics`.`Debug`.`EXCEPTION_POINTERS`>?,
    public var `bClientPointers`: `windows_sys`.`core`.`BOOL`,
)
// UNSUPPORTED Rust 140:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_System_Diagnostics_Debug", feature = "Win32_System_Kernel"))]
// impl Default for WER_EXCEPTION_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WER_FAULT_REPORTING` = UInt;
public const val `WER_FAULT_REPORTING_ALWAYS_SHOW_UI`: `WER_FAULT_REPORTING` = 16u;
public const val `WER_FAULT_REPORTING_CRITICAL`: UInt = 512u;
public const val `WER_FAULT_REPORTING_DISABLE_SNAPSHOT_CRASH`: UInt = 128u;
public const val `WER_FAULT_REPORTING_DISABLE_SNAPSHOT_HANG`: UInt = 256u;
public const val `WER_FAULT_REPORTING_DURABLE`: UInt = 1024u;
public const val `WER_FAULT_REPORTING_FLAG_DISABLE_THREAD_SUSPENSION`: `WER_FAULT_REPORTING` = 4u;
public const val `WER_FAULT_REPORTING_FLAG_NOHEAP`: `WER_FAULT_REPORTING` = 1u;
public const val `WER_FAULT_REPORTING_FLAG_NO_HEAP_ON_QUEUE`: UInt = 64u;
public const val `WER_FAULT_REPORTING_FLAG_QUEUE`: `WER_FAULT_REPORTING` = 2u;
public const val `WER_FAULT_REPORTING_FLAG_QUEUE_UPLOAD`: `WER_FAULT_REPORTING` = 8u;
public const val `WER_FAULT_REPORTING_NO_UI`: UInt = 32u;
public typealias `WER_FILE` = UInt;
public const val `WER_FILE_ANONYMOUS_DATA`: `WER_FILE` = 2u;
public const val `WER_FILE_COMPRESSED`: UInt = 4u;
public const val `WER_FILE_DELETE_WHEN_DONE`: `WER_FILE` = 1u;
public typealias `WER_FILE_TYPE` = Int;
public const val `WER_MAX_APPLICATION_NAME_LENGTH`: UInt = 128u;
public const val `WER_MAX_BUCKET_ID_STRING_LENGTH`: UInt = 260u;
public const val `WER_MAX_DESCRIPTION_LENGTH`: UInt = 512u;
public const val `WER_MAX_EVENT_NAME_LENGTH`: UInt = 64u;
public const val `WER_MAX_FRIENDLY_EVENT_NAME_LENGTH`: UInt = 128u;
public const val `WER_MAX_LOCAL_DUMP_SUBPATH_LENGTH`: UInt = 64u;
public const val `WER_MAX_PARAM_COUNT`: UInt = 10u;
public const val `WER_MAX_PARAM_LENGTH`: UInt = 260u;
public const val `WER_MAX_PREFERRED_MODULES`: UInt = 128u;
public const val `WER_MAX_PREFERRED_MODULES_BUFFER`: UInt = 256u;
public const val `WER_MAX_REGISTERED_DUMPCOLLECTION`: UInt = 4u;
public const val `WER_MAX_REGISTERED_ENTRIES`: UInt = 512u;
public const val `WER_MAX_REGISTERED_METADATA`: UInt = 8u;
public const val `WER_MAX_REGISTERED_RUNTIME_EXCEPTION_MODULES`: UInt = 16u;
public const val `WER_MAX_SIGNATURE_NAME_LENGTH`: UInt = 128u;
public const val `WER_MAX_TOTAL_PARAM_LENGTH`: UInt = 1720u;
public const val `WER_METADATA_KEY_MAX_LENGTH`: UInt = 64u;
public const val `WER_METADATA_VALUE_MAX_LENGTH`: UInt = 128u;
public const val `WER_P0`: UInt = 0u;
public const val `WER_P1`: UInt = 1u;
public const val `WER_P2`: UInt = 2u;
public const val `WER_P3`: UInt = 3u;
public const val `WER_P4`: UInt = 4u;
public const val `WER_P5`: UInt = 5u;
public const val `WER_P6`: UInt = 6u;
public const val `WER_P7`: UInt = 7u;
public const val `WER_P8`: UInt = 8u;
public const val `WER_P9`: UInt = 9u;
public typealias `WER_REGISTER_FILE_TYPE` = Int;
// UNSUPPORTED Rust 192:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WER_REPORT_INFORMATION {
//     pub dwSize: u32,
//     pub hProcess: super::super::Foundation::HANDLE,
//     pub wzConsentKey: [u16; 64],
//     pub wzFriendlyEventName: [u16; 128],
//     pub wzApplicationName: [u16; 128],
//     pub wzApplicationPath: [u16; 260],
//     pub wzDescription: [u16; 512],
//     pub hwndParent: super::super::Foundation::HWND,
// }

// UNSUPPORTED Rust 204:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WER_REPORT_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 209:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WER_REPORT_INFORMATION_V3 {
//     pub dwSize: u32,
//     pub hProcess: super::super::Foundation::HANDLE,
//     pub wzConsentKey: [u16; 64],
//     pub wzFriendlyEventName: [u16; 128],
//     pub wzApplicationName: [u16; 128],
//     pub wzApplicationPath: [u16; 260],
//     pub wzDescription: [u16; 512],
//     pub hwndParent: super::super::Foundation::HWND,
//     pub wzNamespacePartner: [u16; 64],
//     pub wzNamespaceGroup: [u16; 64],
// }

// UNSUPPORTED Rust 223:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WER_REPORT_INFORMATION_V3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 228:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WER_REPORT_INFORMATION_V4 {
//     pub dwSize: u32,
//     pub hProcess: super::super::Foundation::HANDLE,
//     pub wzConsentKey: [u16; 64],
//     pub wzFriendlyEventName: [u16; 128],
//     pub wzApplicationName: [u16; 128],
//     pub wzApplicationPath: [u16; 260],
//     pub wzDescription: [u16; 512],
//     pub hwndParent: super::super::Foundation::HWND,
//     pub wzNamespacePartner: [u16; 64],
//     pub wzNamespaceGroup: [u16; 64],
//     pub rgbApplicationIdentity: [u8; 16],
//     pub hSnapshot: super::super::Foundation::HANDLE,
//     pub hDeleteFilesImpersonationToken: super::super::Foundation::HANDLE,
// }

// UNSUPPORTED Rust 245:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WER_REPORT_INFORMATION_V4 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 250:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WER_REPORT_INFORMATION_V5 {
//     pub dwSize: u32,
//     pub hProcess: super::super::Foundation::HANDLE,
//     pub wzConsentKey: [u16; 64],
//     pub wzFriendlyEventName: [u16; 128],
//     pub wzApplicationName: [u16; 128],
//     pub wzApplicationPath: [u16; 260],
//     pub wzDescription: [u16; 512],
//     pub hwndParent: super::super::Foundation::HWND,
//     pub wzNamespacePartner: [u16; 64],
//     pub wzNamespaceGroup: [u16; 64],
//     pub rgbApplicationIdentity: [u8; 16],
//     pub hSnapshot: super::super::Foundation::HANDLE,
//     pub hDeleteFilesImpersonationToken: super::super::Foundation::HANDLE,
//     pub submitResultMax: WER_SUBMIT_RESULT,
// }

// UNSUPPORTED Rust 268:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WER_REPORT_INFORMATION_V5 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WER_REPORT_METADATA_V1` (
    public var `Signature`: `WER_REPORT_SIGNATURE`,
    public var `BucketId`: `windows_sys`.`core`.`GUID`,
    public var `ReportId`: `windows_sys`.`core`.`GUID`,
    public var `CreationTime`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `SizeInBytes`: ULong,
)
// UNSUPPORTED Rust 282:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WER_REPORT_METADATA_V2 {
//     pub Signature: WER_REPORT_SIGNATURE,
//     pub BucketId: windows_sys::core::GUID,
//     pub ReportId: windows_sys::core::GUID,
//     pub CreationTime: super::super::Foundation::FILETIME,
//     pub SizeInBytes: u64,
//     pub CabId: [u16; 260],
//     pub ReportStatus: u32,
//     pub ReportIntegratorId: windows_sys::core::GUID,
//     pub NumberOfFiles: u32,
//     pub SizeOfFileNames: u32,
//     pub FileNames: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 297:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WER_REPORT_METADATA_V2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 302:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WER_REPORT_METADATA_V3 {
//     pub Signature: WER_REPORT_SIGNATURE,
//     pub BucketId: windows_sys::core::GUID,
//     pub ReportId: windows_sys::core::GUID,
//     pub CreationTime: super::super::Foundation::FILETIME,
//     pub SizeInBytes: u64,
//     pub CabId: [u16; 260],
//     pub ReportStatus: u32,
//     pub ReportIntegratorId: windows_sys::core::GUID,
//     pub NumberOfFiles: u32,
//     pub SizeOfFileNames: u32,
//     pub FileNames: windows_sys::core::PWSTR,
//     pub FriendlyEventName: [u16; 128],
//     pub ApplicationName: [u16; 128],
//     pub ApplicationPath: [u16; 260],
//     pub Description: [u16; 512],
//     pub BucketIdString: [u16; 260],
//     pub LegacyBucketId: u64,
// }

// UNSUPPORTED Rust 323:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WER_REPORT_METADATA_V3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 328:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WER_REPORT_PARAMETER {
//     pub Name: [u16; 129],
//     pub Value: [u16; 260],
// }

// UNSUPPORTED Rust 334:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WER_REPORT_PARAMETER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 339:1: declaration Struct has no candidate rule; syntax: overlapping/out-of-range AST source edits
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WER_REPORT_SIGNATURE {
//     pub EventName: [u16; 65],
//     pub Parameters: [WER_REPORT_PARAMETER; 10],
// }

// UNSUPPORTED Rust 345:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WER_REPORT_SIGNATURE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WER_REPORT_TYPE` = Int;
public typealias `WER_REPORT_UI` = Int;
// UNSUPPORTED Rust 352:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const WER_RUNTIME_EXCEPTION_DEBUGGER_LAUNCH: windows_sys::core::PCSTR = windows_sys::core::s!("OutOfProcessExceptionEventDebuggerLaunchCallback");

// UNSUPPORTED Rust 353:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const WER_RUNTIME_EXCEPTION_EVENT_FUNCTION: windows_sys::core::PCSTR = windows_sys::core::s!("OutOfProcessExceptionEventCallback");

// UNSUPPORTED Rust 354:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const WER_RUNTIME_EXCEPTION_EVENT_SIGNATURE_FUNCTION: windows_sys::core::PCSTR = windows_sys::core::s!("OutOfProcessExceptionEventSignatureCallback");

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Diagnostics_Debug", feature = "Win32_System_Kernel"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WER_RUNTIME_EXCEPTION_INFORMATION` (
    public var `dwSize`: UInt,
    public var `hProcess`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `hThread`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `exceptionRecord`: `super`.`Diagnostics`.`Debug`.`EXCEPTION_RECORD`,
    public var `context`: `super`.`Diagnostics`.`Debug`.`CONTEXT`,
    public var `pwszReportId`: `windows_sys`.`core`.`PCWSTR`,
    public var `bIsFatal`: `windows_sys`.`core`.`BOOL`,
    public var `dwReserved`: UInt,
)
// UNSUPPORTED Rust 368:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_System_Diagnostics_Debug", feature = "Win32_System_Kernel"))]
// impl Default for WER_RUNTIME_EXCEPTION_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WER_SUBMIT_ADD_REGISTERED_DATA`: `WER_SUBMIT_FLAGS` = 16u;
public const val `WER_SUBMIT_ARCHIVE_PARAMETERS_ONLY`: `WER_SUBMIT_FLAGS` = 4096u;
public const val `WER_SUBMIT_BYPASS_DATA_THROTTLING`: `WER_SUBMIT_FLAGS` = 2048u;
public const val `WER_SUBMIT_BYPASS_NETWORK_COST_THROTTLING`: UInt = 32768u;
public const val `WER_SUBMIT_BYPASS_POWER_THROTTLING`: UInt = 16384u;
public typealias `WER_SUBMIT_FLAGS` = UInt;
public const val `WER_SUBMIT_HONOR_RECOVERY`: `WER_SUBMIT_FLAGS` = 1u;
public const val `WER_SUBMIT_HONOR_RESTART`: `WER_SUBMIT_FLAGS` = 2u;
public const val `WER_SUBMIT_NO_ARCHIVE`: `WER_SUBMIT_FLAGS` = 256u;
public const val `WER_SUBMIT_NO_CLOSE_UI`: `WER_SUBMIT_FLAGS` = 64u;
public const val `WER_SUBMIT_NO_QUEUE`: `WER_SUBMIT_FLAGS` = 128u;
public const val `WER_SUBMIT_OUTOFPROCESS`: `WER_SUBMIT_FLAGS` = 32u;
public const val `WER_SUBMIT_OUTOFPROCESS_ASYNC`: `WER_SUBMIT_FLAGS` = 1024u;
public const val `WER_SUBMIT_QUEUE`: `WER_SUBMIT_FLAGS` = 4u;
public const val `WER_SUBMIT_REPORT_MACHINE_ID`: `WER_SUBMIT_FLAGS` = 8192u;
public typealias `WER_SUBMIT_RESULT` = Int;
public const val `WER_SUBMIT_SHOW_DEBUG`: `WER_SUBMIT_FLAGS` = 8u;
public const val `WER_SUBMIT_START_MINIMIZED`: `WER_SUBMIT_FLAGS` = 512u;
public const val `WerConsentAlwaysPrompt`: `WER_CONSENT` = 4;
public const val `WerConsentApproved`: `WER_CONSENT` = 2;
public const val `WerConsentDenied`: `WER_CONSENT` = 3;
public const val `WerConsentMax`: `WER_CONSENT` = 5;
public const val `WerConsentNotAsked`: `WER_CONSENT` = 1;
public const val `WerCustomAction`: `WER_SUBMIT_RESULT` = 9;
public const val `WerDisabled`: `WER_SUBMIT_RESULT` = 5;
public const val `WerDisabledQueue`: `WER_SUBMIT_RESULT` = 7;
public const val `WerDumpTypeHeapDump`: `WER_DUMP_TYPE` = 3;
public const val `WerDumpTypeMax`: `WER_DUMP_TYPE` = 5;
public const val `WerDumpTypeMicroDump`: `WER_DUMP_TYPE` = 1;
public const val `WerDumpTypeMiniDump`: `WER_DUMP_TYPE` = 2;
public const val `WerDumpTypeNone`: `WER_DUMP_TYPE` = 0;
public const val `WerDumpTypeTriageDump`: `WER_DUMP_TYPE` = 4;
public const val `WerFileTypeAuxiliaryDump`: `WER_FILE_TYPE` = 8;
public const val `WerFileTypeCustomDump`: `WER_FILE_TYPE` = 7;
public const val `WerFileTypeEtlTrace`: `WER_FILE_TYPE` = 9;
public const val `WerFileTypeHeapdump`: `WER_FILE_TYPE` = 3;
public const val `WerFileTypeMax`: `WER_FILE_TYPE` = 10;
public const val `WerFileTypeMicrodump`: `WER_FILE_TYPE` = 1;
public const val `WerFileTypeMinidump`: `WER_FILE_TYPE` = 2;
public const val `WerFileTypeOther`: `WER_FILE_TYPE` = 5;
public const val `WerFileTypeTriagedump`: `WER_FILE_TYPE` = 6;
public const val `WerFileTypeUserDocument`: `WER_FILE_TYPE` = 4;
public const val `WerRegFileTypeMax`: `WER_REGISTER_FILE_TYPE` = 3;
public const val `WerRegFileTypeOther`: `WER_REGISTER_FILE_TYPE` = 2;
public const val `WerRegFileTypeUserDocument`: `WER_REGISTER_FILE_TYPE` = 1;
public const val `WerReportApplicationCrash`: `WER_REPORT_TYPE` = 2;
public const val `WerReportApplicationHang`: `WER_REPORT_TYPE` = 3;
public const val `WerReportAsync`: `WER_SUBMIT_RESULT` = 8;
public const val `WerReportCancelled`: `WER_SUBMIT_RESULT` = 6;
public const val `WerReportCritical`: `WER_REPORT_TYPE` = 1;
public const val `WerReportDebug`: `WER_SUBMIT_RESULT` = 3;
public const val `WerReportFailed`: `WER_SUBMIT_RESULT` = 4;
public const val `WerReportInvalid`: `WER_REPORT_TYPE` = 5;
public const val `WerReportKernel`: `WER_REPORT_TYPE` = 4;
public const val `WerReportNonCritical`: `WER_REPORT_TYPE` = 0;
public const val `WerReportQueued`: `WER_SUBMIT_RESULT` = 1;
public const val `WerReportUploaded`: `WER_SUBMIT_RESULT` = 2;
public const val `WerReportUploadedCab`: `WER_SUBMIT_RESULT` = 11;
public const val `WerStorageLocationNotFound`: `WER_SUBMIT_RESULT` = 12;
public const val `WerSubmitResultMax`: `WER_SUBMIT_RESULT` = 13;
public const val `WerThrottled`: `WER_SUBMIT_RESULT` = 10;
public const val `WerUIAdditionalDataDlgHeader`: `WER_REPORT_UI` = 1;
public const val `WerUICloseDlgBody`: `WER_REPORT_UI` = 9;
public const val `WerUICloseDlgButtonText`: `WER_REPORT_UI` = 10;
public const val `WerUICloseDlgHeader`: `WER_REPORT_UI` = 8;
public const val `WerUICloseText`: `WER_REPORT_UI` = 7;
public const val `WerUIConsentDlgBody`: `WER_REPORT_UI` = 4;
public const val `WerUIConsentDlgHeader`: `WER_REPORT_UI` = 3;
public const val `WerUIIconFilePath`: `WER_REPORT_UI` = 2;
public const val `WerUIMax`: `WER_REPORT_UI` = 11;
public const val `WerUIOfflineSolutionCheckText`: `WER_REPORT_UI` = 6;
public const val `WerUIOnlineSolutionCheckText`: `WER_REPORT_UI` = 5;
public const val `frrvErr`: `EFaultRepRetVal` = 3;
public const val `frrvErrAnotherInstance`: `EFaultRepRetVal` = 8;
public const val `frrvErrDoubleFault`: `EFaultRepRetVal` = 10;
public const val `frrvErrNoDW`: `EFaultRepRetVal` = 4;
public const val `frrvErrNoMemory`: `EFaultRepRetVal` = 9;
public const val `frrvErrTimeout`: `EFaultRepRetVal` = 5;
public const val `frrvLaunchDebugger`: `EFaultRepRetVal` = 6;
public const val `frrvOk`: `EFaultRepRetVal` = 0;
public const val `frrvOkHeadless`: `EFaultRepRetVal` = 7;
public const val `frrvOkManifest`: `EFaultRepRetVal` = 1;
public const val `frrvOkQueued`: `EFaultRepRetVal` = 2;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `pfn_ADDEREXCLUDEDAPPLICATIONA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCSTR`) -> `EFaultRepRetVal`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `pfn_ADDEREXCLUDEDAPPLICATIONW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`) -> `EFaultRepRetVal`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Diagnostics_Debug", feature = "Win32_System_Kernel"))]
public typealias `pfn_REPORTFAULT` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Diagnostics`.`Debug`.`EXCEPTION_POINTERS`>?, UInt) -> `EFaultRepRetVal`>>>;
