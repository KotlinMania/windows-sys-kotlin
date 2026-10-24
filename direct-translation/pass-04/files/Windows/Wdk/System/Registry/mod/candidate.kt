// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=NtCommitRegistryTransaction; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NtCommitRegistryTransaction`(`transactionhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `flags` : UInt) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=NtCreateKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
public external fun `NtCreateKey`(`keyhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`>?, `desiredaccess` : UInt, `objectattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`OBJECT_ATTRIBUTES`>?, `titleindex` : UInt, `class` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`>?, `createoptions` : UInt, `disposition` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=NtCreateKeyTransacted; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
public external fun `NtCreateKeyTransacted`(`keyhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`>?, `desiredaccess` : UInt, `objectattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`OBJECT_ATTRIBUTES`>?, `titleindex` : UInt, `class` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`>?, `createoptions` : UInt, `transactionhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `disposition` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=NtCreateRegistryTransaction; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
public external fun `NtCreateRegistryTransaction`(`transactionhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`>?, `desiredaccess` : UInt, `objectattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`OBJECT_ATTRIBUTES`>?, `createoptions` : UInt) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=NtDeleteKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NtDeleteKey`(`keyhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=NtDeleteValueKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NtDeleteValueKey`(`keyhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `valuename` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=NtEnumerateKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NtEnumerateKey`(`keyhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `index` : UInt, `keyinformationclass` : `KEY_INFORMATION_CLASS`, `keyinformation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `length` : UInt, `resultlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=NtEnumerateValueKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NtEnumerateValueKey`(`keyhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `index` : UInt, `keyvalueinformationclass` : `KEY_VALUE_INFORMATION_CLASS`, `keyvalueinformation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `length` : UInt, `resultlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=NtFlushKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NtFlushKey`(`keyhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=NtNotifyChangeMultipleKeys; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security", feature = "Win32_System_IO"))]
public external fun `NtNotifyChangeMultipleKeys`(`masterkeyhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `count` : UInt, `subordinateobjects` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`OBJECT_ATTRIBUTES`>?, `event` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `apcroutine` : `super`.`super`.`super`.`Win32`.`System`.`IO`.`PIO_APC_ROUTINE`, `apccontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `iostatusblock` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`System`.`IO`.`IO_STATUS_BLOCK`>?, `completionfilter` : UInt, `watchtree` : Boolean, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `buffersize` : UInt, `asynchronous` : Boolean) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=NtOpenKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
public external fun `NtOpenKey`(`keyhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`>?, `desiredaccess` : UInt, `objectattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`OBJECT_ATTRIBUTES`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=NtOpenKeyEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
public external fun `NtOpenKeyEx`(`keyhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`>?, `desiredaccess` : UInt, `objectattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`OBJECT_ATTRIBUTES`>?, `openoptions` : UInt) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=NtOpenKeyTransacted; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
public external fun `NtOpenKeyTransacted`(`keyhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`>?, `desiredaccess` : UInt, `objectattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`OBJECT_ATTRIBUTES`>?, `transactionhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=NtOpenKeyTransactedEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
public external fun `NtOpenKeyTransactedEx`(`keyhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`>?, `desiredaccess` : UInt, `objectattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`OBJECT_ATTRIBUTES`>?, `openoptions` : UInt, `transactionhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=NtOpenRegistryTransaction; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
public external fun `NtOpenRegistryTransaction`(`transactionhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`>?, `desiredaccess` : UInt, `objectattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`OBJECT_ATTRIBUTES`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=NtQueryKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NtQueryKey`(`keyhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `keyinformationclass` : `KEY_INFORMATION_CLASS`, `keyinformation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `length` : UInt, `resultlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=NtQueryMultipleValueKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NtQueryMultipleValueKey`(`keyhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `valueentries` : /* Rust *mut */ kotlinx.cinterop.CPointer<`KEY_VALUE_ENTRY`>?, `entrycount` : UInt, `valuebuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `bufferlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `requiredbufferlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=NtQueryValueKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NtQueryValueKey`(`keyhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `valuename` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`>?, `keyvalueinformationclass` : `KEY_VALUE_INFORMATION_CLASS`, `keyvalueinformation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `length` : UInt, `resultlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=NtRenameKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NtRenameKey`(`keyhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `newname` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=NtRestoreKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NtRestoreKey`(`keyhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `filehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `flags` : UInt) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=NtRollbackRegistryTransaction; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NtRollbackRegistryTransaction`(`transactionhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `flags` : UInt) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=NtSaveKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NtSaveKey`(`keyhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `filehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=NtSaveKeyEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NtSaveKeyEx`(`keyhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `filehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `format` : UInt) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=NtSetInformationKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NtSetInformationKey`(`keyhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `keysetinformationclass` : `KEY_SET_INFORMATION_CLASS`, `keysetinformation` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `keysetinformationlength` : UInt) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=NtSetValueKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NtSetValueKey`(`keyhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `valuename` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`>?, `titleindex` : UInt, `type` : UInt, `data` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `datasize` : UInt) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=ZwCommitRegistryTransaction; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ZwCommitRegistryTransaction`(`transactionhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `flags` : UInt) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=ZwCreateKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
public external fun `ZwCreateKey`(`keyhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`>?, `desiredaccess` : UInt, `objectattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`OBJECT_ATTRIBUTES`>?, `titleindex` : UInt, `class` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`>?, `createoptions` : UInt, `disposition` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=ZwCreateKeyTransacted; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
public external fun `ZwCreateKeyTransacted`(`keyhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`>?, `desiredaccess` : UInt, `objectattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`OBJECT_ATTRIBUTES`>?, `titleindex` : UInt, `class` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`>?, `createoptions` : UInt, `transactionhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `disposition` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=ZwCreateRegistryTransaction; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
public external fun `ZwCreateRegistryTransaction`(`transactionhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`>?, `desiredaccess` : UInt, `objectattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`OBJECT_ATTRIBUTES`>?, `createoptions` : UInt) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=ZwDeleteKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ZwDeleteKey`(`keyhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=ZwDeleteValueKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ZwDeleteValueKey`(`keyhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `valuename` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=ZwEnumerateKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ZwEnumerateKey`(`keyhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `index` : UInt, `keyinformationclass` : `KEY_INFORMATION_CLASS`, `keyinformation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `length` : UInt, `resultlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=ZwEnumerateValueKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ZwEnumerateValueKey`(`keyhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `index` : UInt, `keyvalueinformationclass` : `KEY_VALUE_INFORMATION_CLASS`, `keyvalueinformation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `length` : UInt, `resultlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=ZwFlushKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ZwFlushKey`(`keyhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=ZwNotifyChangeMultipleKeys; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security", feature = "Win32_System_IO"))]
public external fun `ZwNotifyChangeMultipleKeys`(`masterkeyhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `count` : UInt, `subordinateobjects` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`OBJECT_ATTRIBUTES`>?, `event` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `apcroutine` : `super`.`super`.`super`.`Win32`.`System`.`IO`.`PIO_APC_ROUTINE`, `apccontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `iostatusblock` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`System`.`IO`.`IO_STATUS_BLOCK`>?, `completionfilter` : UInt, `watchtree` : Boolean, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `buffersize` : UInt, `asynchronous` : Boolean) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=ZwOpenKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
public external fun `ZwOpenKey`(`keyhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`>?, `desiredaccess` : UInt, `objectattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`OBJECT_ATTRIBUTES`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=ZwOpenKeyEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
public external fun `ZwOpenKeyEx`(`keyhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`>?, `desiredaccess` : UInt, `objectattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`OBJECT_ATTRIBUTES`>?, `openoptions` : UInt) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=ZwOpenKeyTransacted; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
public external fun `ZwOpenKeyTransacted`(`keyhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`>?, `desiredaccess` : UInt, `objectattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`OBJECT_ATTRIBUTES`>?, `transactionhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=ZwOpenKeyTransactedEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
public external fun `ZwOpenKeyTransactedEx`(`keyhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`>?, `desiredaccess` : UInt, `objectattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`OBJECT_ATTRIBUTES`>?, `openoptions` : UInt, `transactionhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=ZwOpenRegistryTransaction; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Wdk_Foundation", feature = "Win32_Security"))]
public external fun `ZwOpenRegistryTransaction`(`transactionhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`>?, `desiredaccess` : UInt, `objectattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`OBJECT_ATTRIBUTES`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=ZwQueryKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ZwQueryKey`(`keyhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `keyinformationclass` : `KEY_INFORMATION_CLASS`, `keyinformation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `length` : UInt, `resultlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=ZwQueryMultipleValueKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ZwQueryMultipleValueKey`(`keyhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `valueentries` : /* Rust *mut */ kotlinx.cinterop.CPointer<`KEY_VALUE_ENTRY`>?, `entrycount` : UInt, `valuebuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `bufferlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `requiredbufferlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=ZwQueryValueKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ZwQueryValueKey`(`keyhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `valuename` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`>?, `keyvalueinformationclass` : `KEY_VALUE_INFORMATION_CLASS`, `keyvalueinformation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `length` : UInt, `resultlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=ZwRenameKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ZwRenameKey`(`keyhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `newname` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`>?) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=ZwRestoreKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ZwRestoreKey`(`keyhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `filehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `flags` : UInt) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=ZwRollbackRegistryTransaction; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ZwRollbackRegistryTransaction`(`transactionhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `flags` : UInt) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=ZwSaveKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ZwSaveKey`(`keyhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `filehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=ZwSaveKeyEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ZwSaveKeyEx`(`keyhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `filehandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `format` : UInt) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=ZwSetInformationKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ZwSetInformationKey`(`keyhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `keysetinformationclass` : `KEY_SET_INFORMATION_CLASS`, `keysetinformation` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `keysetinformationlength` : UInt) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=ntdll.dll, ABI=system, export=ZwSetValueKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ZwSetValueKey`(`keyhandle` : `super`.`super`.`super`.`Win32`.`Foundation`.`HANDLE`, `valuename` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`>?, `titleindex` : UInt, `type` : UInt, `data` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `datasize` : UInt) : `super`.`super`.`super`.`Win32`.`Foundation`.`NTSTATUS`
public typealias `KEY_INFORMATION_CLASS` = Int;
public typealias `KEY_SET_INFORMATION_CLASS` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `KEY_VALUE_ENTRY` (
    public var `ValueName`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`>?,
    public var `DataLength`: UInt,
    public var `DataOffset`: UInt,
    public var `Type`: UInt,
)
// UNSUPPORTED Rust 79:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for KEY_VALUE_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `KEY_VALUE_INFORMATION_CLASS` = Int;
public const val `KeyBasicInformation`: `KEY_INFORMATION_CLASS` = 0;
public const val `KeyCachedInformation`: `KEY_INFORMATION_CLASS` = 4;
public const val `KeyControlFlagsInformation`: `KEY_SET_INFORMATION_CLASS` = 2;
public const val `KeyFlagsInformation`: `KEY_INFORMATION_CLASS` = 5;
public const val `KeyFullInformation`: `KEY_INFORMATION_CLASS` = 2;
public const val `KeyHandleTagsInformation`: `KEY_INFORMATION_CLASS` = 7;
public const val `KeyLayerInformation`: `KEY_INFORMATION_CLASS` = 9;
public const val `KeyNameInformation`: `KEY_INFORMATION_CLASS` = 3;
public const val `KeyNodeInformation`: `KEY_INFORMATION_CLASS` = 1;
public const val `KeySetDebugInformation`: `KEY_SET_INFORMATION_CLASS` = 4;
public const val `KeySetHandleTagsInformation`: `KEY_SET_INFORMATION_CLASS` = 5;
public const val `KeySetLayerInformation`: `KEY_SET_INFORMATION_CLASS` = 6;
public const val `KeySetVirtualizationInformation`: `KEY_SET_INFORMATION_CLASS` = 3;
public const val `KeyTrustInformation`: `KEY_INFORMATION_CLASS` = 8;
public const val `KeyValueBasicInformation`: `KEY_VALUE_INFORMATION_CLASS` = 0;
public const val `KeyValueFullInformation`: `KEY_VALUE_INFORMATION_CLASS` = 1;
public const val `KeyValueFullInformationAlign64`: `KEY_VALUE_INFORMATION_CLASS` = 3;
public const val `KeyValueLayerInformation`: `KEY_VALUE_INFORMATION_CLASS` = 5;
public const val `KeyValuePartialInformation`: `KEY_VALUE_INFORMATION_CLASS` = 2;
public const val `KeyValuePartialInformationAlign64`: `KEY_VALUE_INFORMATION_CLASS` = 4;
public const val `KeyVirtualizationInformation`: `KEY_INFORMATION_CLASS` = 6;
public const val `KeyWow64FlagsInformation`: `KEY_SET_INFORMATION_CLASS` = 1;
public const val `KeyWriteTimeInformation`: `KEY_SET_INFORMATION_CLASS` = 0;
public const val `MaxKeyInfoClass`: `KEY_INFORMATION_CLASS` = 10;
public const val `MaxKeySetInfoClass`: `KEY_SET_INFORMATION_CLASS` = 7;
public const val `MaxKeyValueInfoClass`: `KEY_VALUE_INFORMATION_CLASS` = 6;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `REG_ENUMERATE_KEY_INFORMATION` (
    public var `Object`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Index`: UInt,
    public var `KeyInformationClass`: `KEY_INFORMATION_CLASS`,
    public var `KeyInformation`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Length`: UInt,
    public var `ResultLength`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `CallContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `ObjectContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Reserved`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 124:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for REG_ENUMERATE_KEY_INFORMATION {
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
public class `REG_ENUMERATE_VALUE_KEY_INFORMATION` (
    public var `Object`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Index`: UInt,
    public var `KeyValueInformationClass`: `KEY_VALUE_INFORMATION_CLASS`,
    public var `KeyValueInformation`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Length`: UInt,
    public var `ResultLength`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `CallContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `ObjectContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Reserved`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 142:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for REG_ENUMERATE_VALUE_KEY_INFORMATION {
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
public class `REG_QUERY_KEY_INFORMATION` (
    public var `Object`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `KeyInformationClass`: `KEY_INFORMATION_CLASS`,
    public var `KeyInformation`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Length`: UInt,
    public var `ResultLength`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `CallContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `ObjectContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Reserved`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 159:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for REG_QUERY_KEY_INFORMATION {
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
public class `REG_QUERY_MULTIPLE_VALUE_KEY_INFORMATION` (
    public var `Object`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `ValueEntries`: /* Rust *mut */ kotlinx.cinterop.CPointer<`KEY_VALUE_ENTRY`>?,
    public var `EntryCount`: UInt,
    public var `ValueBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `BufferLength`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `RequiredBufferLength`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `CallContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `ObjectContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Reserved`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 177:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for REG_QUERY_MULTIPLE_VALUE_KEY_INFORMATION {
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
public class `REG_QUERY_VALUE_KEY_INFORMATION` (
    public var `Object`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `ValueName`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Win32`.`Foundation`.`UNICODE_STRING`>?,
    public var `KeyValueInformationClass`: `KEY_VALUE_INFORMATION_CLASS`,
    public var `KeyValueInformation`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Length`: UInt,
    public var `ResultLength`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `CallContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `ObjectContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Reserved`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 195:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for REG_QUERY_VALUE_KEY_INFORMATION {
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
public class `REG_SET_INFORMATION_KEY_INFORMATION` (
    public var `Object`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `KeySetInformationClass`: `KEY_SET_INFORMATION_CLASS`,
    public var `KeySetInformation`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `KeySetInformationLength`: UInt,
    public var `CallContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `ObjectContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Reserved`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 211:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for REG_SET_INFORMATION_KEY_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

