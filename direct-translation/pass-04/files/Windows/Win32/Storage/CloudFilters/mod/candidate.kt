// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=cldapi.dll, ABI=system, export=CfCloseHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CfCloseHandle`(`filehandle` : `super`.`super`.`Foundation`.`HANDLE`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=cldapi.dll, ABI=system, export=CfConnectSyncRoot; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_CorrelationVector")]
public external fun `CfConnectSyncRoot`(`syncrootpath` : `windows_sys`.`core`.`PCWSTR`, `callbacktable` : /* Rust *const */ kotlinx.cinterop.CPointer<`CF_CALLBACK_REGISTRATION`>?, `callbackcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `connectflags` : `CF_CONNECT_FLAGS`, `connectionkey` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CF_CONNECTION_KEY`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=cldapi.dll, ABI=system, export=CfConvertToPlaceholder; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `CfConvertToPlaceholder`(`filehandle` : `super`.`super`.`Foundation`.`HANDLE`, `fileidentity` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `fileidentitylength` : UInt, `convertflags` : `CF_CONVERT_FLAGS`, `convertusn` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, `overlapped` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=cldapi.dll, ABI=system, export=CfCreatePlaceholders; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_FileSystem")]
public external fun `CfCreatePlaceholders`(`basedirectorypath` : `windows_sys`.`core`.`PCWSTR`, `placeholderarray` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CF_PLACEHOLDER_CREATE_INFO`>?, `placeholdercount` : UInt, `createflags` : `CF_CREATE_FLAGS`, `entriesprocessed` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=cldapi.dll, ABI=system, export=CfDehydratePlaceholder; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `CfDehydratePlaceholder`(`filehandle` : `super`.`super`.`Foundation`.`HANDLE`, `startingoffset` : Long, `length` : Long, `dehydrateflags` : `CF_DEHYDRATE_FLAGS`, `overlapped` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=cldapi.dll, ABI=system, export=CfDisconnectSyncRoot; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CfDisconnectSyncRoot`(`connectionkey` : `CF_CONNECTION_KEY`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=cldapi.dll, ABI=system, export=CfExecute; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Storage_FileSystem", feature = "Win32_System_CorrelationVector"))]
public external fun `CfExecute`(`opinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`CF_OPERATION_INFO`>?, `opparams` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CF_OPERATION_PARAMETERS`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=cldapi.dll, ABI=system, export=CfGetCorrelationVector; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_CorrelationVector")]
public external fun `CfGetCorrelationVector`(`filehandle` : `super`.`super`.`Foundation`.`HANDLE`, `correlationvector` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`CorrelationVector`.`CORRELATION_VECTOR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=cldapi.dll, ABI=system, export=CfGetPlaceholderInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CfGetPlaceholderInfo`(`filehandle` : `super`.`super`.`Foundation`.`HANDLE`, `infoclass` : `CF_PLACEHOLDER_INFO_CLASS`, `infobuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `infobufferlength` : UInt, `returnedlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=cldapi.dll, ABI=system, export=CfGetPlaceholderRangeInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CfGetPlaceholderRangeInfo`(`filehandle` : `super`.`super`.`Foundation`.`HANDLE`, `infoclass` : `CF_PLACEHOLDER_RANGE_INFO_CLASS`, `startingoffset` : Long, `length` : Long, `infobuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `infobufferlength` : UInt, `returnedlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=cldapi.dll, ABI=system, export=CfGetPlaceholderRangeInfoForHydration; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CfGetPlaceholderRangeInfoForHydration`(`connectionkey` : `CF_CONNECTION_KEY`, `transferkey` : Long, `fileid` : Long, `infoclass` : `CF_PLACEHOLDER_RANGE_INFO_CLASS`, `startingoffset` : Long, `rangelength` : Long, `infobuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `infobuffersize` : UInt, `infobufferwritten` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=cldapi.dll, ABI=system, export=CfGetPlaceholderStateFromAttributeTag; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CfGetPlaceholderStateFromAttributeTag`(`fileattributes` : UInt, `reparsetag` : UInt) : `CF_PLACEHOLDER_STATE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=cldapi.dll, ABI=system, export=CfGetPlaceholderStateFromFileInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_FileSystem")]
public external fun `CfGetPlaceholderStateFromFileInfo`(`infobuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `infoclass` : `super`.`FileSystem`.`FILE_INFO_BY_HANDLE_CLASS`) : `CF_PLACEHOLDER_STATE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=cldapi.dll, ABI=system, export=CfGetPlaceholderStateFromFindData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_FileSystem")]
public external fun `CfGetPlaceholderStateFromFindData`(`finddata` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`FileSystem`.`WIN32_FIND_DATAA`>?) : `CF_PLACEHOLDER_STATE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=cldapi.dll, ABI=system, export=CfGetPlatformInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CfGetPlatformInfo`(`platformversion` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CF_PLATFORM_INFO`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=cldapi.dll, ABI=system, export=CfGetSyncRootInfoByHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CfGetSyncRootInfoByHandle`(`filehandle` : `super`.`super`.`Foundation`.`HANDLE`, `infoclass` : `CF_SYNC_ROOT_INFO_CLASS`, `infobuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `infobufferlength` : UInt, `returnedlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=cldapi.dll, ABI=system, export=CfGetSyncRootInfoByPath; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CfGetSyncRootInfoByPath`(`filepath` : `windows_sys`.`core`.`PCWSTR`, `infoclass` : `CF_SYNC_ROOT_INFO_CLASS`, `infobuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `infobufferlength` : UInt, `returnedlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=cldapi.dll, ABI=system, export=CfGetTransferKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CfGetTransferKey`(`filehandle` : `super`.`super`.`Foundation`.`HANDLE`, `transferkey` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=cldapi.dll, ABI=system, export=CfGetWin32HandleFromProtectedHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CfGetWin32HandleFromProtectedHandle`(`protectedhandle` : `super`.`super`.`Foundation`.`HANDLE`) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=cldapi.dll, ABI=system, export=CfHydratePlaceholder; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `CfHydratePlaceholder`(`filehandle` : `super`.`super`.`Foundation`.`HANDLE`, `startingoffset` : Long, `length` : Long, `hydrateflags` : `CF_HYDRATE_FLAGS`, `overlapped` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=cldapi.dll, ABI=system, export=CfOpenFileWithOplock; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CfOpenFileWithOplock`(`filepath` : `windows_sys`.`core`.`PCWSTR`, `flags` : `CF_OPEN_FILE_FLAGS`, `protectedhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=cldapi.dll, ABI=system, export=CfQuerySyncProviderStatus; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CfQuerySyncProviderStatus`(`connectionkey` : `CF_CONNECTION_KEY`, `providerstatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CF_SYNC_PROVIDER_STATUS`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=cldapi.dll, ABI=system, export=CfReferenceProtectedHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CfReferenceProtectedHandle`(`protectedhandle` : `super`.`super`.`Foundation`.`HANDLE`) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=cldapi.dll, ABI=system, export=CfRegisterSyncRoot; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CfRegisterSyncRoot`(`syncrootpath` : `windows_sys`.`core`.`PCWSTR`, `registration` : /* Rust *const */ kotlinx.cinterop.CPointer<`CF_SYNC_REGISTRATION`>?, `policies` : /* Rust *const */ kotlinx.cinterop.CPointer<`CF_SYNC_POLICIES`>?, `registerflags` : `CF_REGISTER_FLAGS`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=cldapi.dll, ABI=system, export=CfReleaseProtectedHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CfReleaseProtectedHandle`(`protectedhandle` : `super`.`super`.`Foundation`.`HANDLE`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=cldapi.dll, ABI=system, export=CfReleaseTransferKey; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CfReleaseTransferKey`(`filehandle` : `super`.`super`.`Foundation`.`HANDLE`, `transferkey` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=cldapi.dll, ABI=system, export=CfReportProviderProgress; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CfReportProviderProgress`(`connectionkey` : `CF_CONNECTION_KEY`, `transferkey` : Long, `providerprogresstotal` : Long, `providerprogresscompleted` : Long) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=cldapi.dll, ABI=system, export=CfReportProviderProgress2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CfReportProviderProgress2`(`connectionkey` : `CF_CONNECTION_KEY`, `transferkey` : Long, `requestkey` : Long, `providerprogresstotal` : Long, `providerprogresscompleted` : Long, `targetsessionid` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=cldapi.dll, ABI=system, export=CfReportSyncStatus; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CfReportSyncStatus`(`syncrootpath` : `windows_sys`.`core`.`PCWSTR`, `syncstatus` : /* Rust *const */ kotlinx.cinterop.CPointer<`CF_SYNC_STATUS`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=cldapi.dll, ABI=system, export=CfRevertPlaceholder; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `CfRevertPlaceholder`(`filehandle` : `super`.`super`.`Foundation`.`HANDLE`, `revertflags` : `CF_REVERT_FLAGS`, `overlapped` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=cldapi.dll, ABI=system, export=CfSetCorrelationVector; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_CorrelationVector")]
public external fun `CfSetCorrelationVector`(`filehandle` : `super`.`super`.`Foundation`.`HANDLE`, `correlationvector` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`CorrelationVector`.`CORRELATION_VECTOR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=cldapi.dll, ABI=system, export=CfSetInSyncState; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CfSetInSyncState`(`filehandle` : `super`.`super`.`Foundation`.`HANDLE`, `insyncstate` : `CF_IN_SYNC_STATE`, `insyncflags` : `CF_SET_IN_SYNC_FLAGS`, `insyncusn` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=cldapi.dll, ABI=system, export=CfSetPinState; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public external fun `CfSetPinState`(`filehandle` : `super`.`super`.`Foundation`.`HANDLE`, `pinstate` : `CF_PIN_STATE`, `pinflags` : `CF_SET_PIN_FLAGS`, `overlapped` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=cldapi.dll, ABI=system, export=CfUnregisterSyncRoot; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CfUnregisterSyncRoot`(`syncrootpath` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=cldapi.dll, ABI=system, export=CfUpdatePlaceholder; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Storage_FileSystem", feature = "Win32_System_IO"))]
public external fun `CfUpdatePlaceholder`(`filehandle` : `super`.`super`.`Foundation`.`HANDLE`, `fsmetadata` : /* Rust *const */ kotlinx.cinterop.CPointer<`CF_FS_METADATA`>?, `fileidentity` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `fileidentitylength` : UInt, `dehydraterangearray` : /* Rust *const */ kotlinx.cinterop.CPointer<`CF_FILE_RANGE`>?, `dehydraterangecount` : UInt, `updateflags` : `CF_UPDATE_FLAGS`, `updateusn` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, `overlapped` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`IO`.`OVERLAPPED`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=cldapi.dll, ABI=system, export=CfUpdateSyncProviderStatus; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CfUpdateSyncProviderStatus`(`connectionkey` : `CF_CONNECTION_KEY`, `providerstatus` : `CF_SYNC_PROVIDER_STATUS`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_CorrelationVector")]
public typealias `CF_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`CF_CALLBACK_INFO`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`CF_CALLBACK_PARAMETERS`>?) -> Unit>>>;
public typealias `CF_CALLBACK_CANCEL_FLAGS` = Int;
public const val `CF_CALLBACK_CANCEL_FLAG_IO_ABORTED`: `CF_CALLBACK_CANCEL_FLAGS` = 2;
public const val `CF_CALLBACK_CANCEL_FLAG_IO_TIMEOUT`: `CF_CALLBACK_CANCEL_FLAGS` = 1;
public const val `CF_CALLBACK_CANCEL_FLAG_NONE`: `CF_CALLBACK_CANCEL_FLAGS` = 0;
public typealias `CF_CALLBACK_CLOSE_COMPLETION_FLAGS` = Int;
public const val `CF_CALLBACK_CLOSE_COMPLETION_FLAG_DELETED`: `CF_CALLBACK_CLOSE_COMPLETION_FLAGS` = 1;
public const val `CF_CALLBACK_CLOSE_COMPLETION_FLAG_NONE`: `CF_CALLBACK_CLOSE_COMPLETION_FLAGS` = 0;
public typealias `CF_CALLBACK_DEHYDRATE_COMPLETION_FLAGS` = Int;
public const val `CF_CALLBACK_DEHYDRATE_COMPLETION_FLAG_BACKGROUND`: `CF_CALLBACK_DEHYDRATE_COMPLETION_FLAGS` = 1;
public const val `CF_CALLBACK_DEHYDRATE_COMPLETION_FLAG_DEHYDRATED`: `CF_CALLBACK_DEHYDRATE_COMPLETION_FLAGS` = 2;
public const val `CF_CALLBACK_DEHYDRATE_COMPLETION_FLAG_NONE`: `CF_CALLBACK_DEHYDRATE_COMPLETION_FLAGS` = 0;
public typealias `CF_CALLBACK_DEHYDRATE_FLAGS` = Int;
public const val `CF_CALLBACK_DEHYDRATE_FLAG_BACKGROUND`: `CF_CALLBACK_DEHYDRATE_FLAGS` = 1;
public const val `CF_CALLBACK_DEHYDRATE_FLAG_NONE`: `CF_CALLBACK_DEHYDRATE_FLAGS` = 0;
public typealias `CF_CALLBACK_DEHYDRATION_REASON` = Int;
public const val `CF_CALLBACK_DEHYDRATION_REASON_NONE`: `CF_CALLBACK_DEHYDRATION_REASON` = 0;
public const val `CF_CALLBACK_DEHYDRATION_REASON_SYSTEM_INACTIVITY`: `CF_CALLBACK_DEHYDRATION_REASON` = 3;
public const val `CF_CALLBACK_DEHYDRATION_REASON_SYSTEM_LOW_SPACE`: `CF_CALLBACK_DEHYDRATION_REASON` = 2;
public const val `CF_CALLBACK_DEHYDRATION_REASON_SYSTEM_OS_UPGRADE`: `CF_CALLBACK_DEHYDRATION_REASON` = 4;
public const val `CF_CALLBACK_DEHYDRATION_REASON_USER_MANUAL`: `CF_CALLBACK_DEHYDRATION_REASON` = 1;
public typealias `CF_CALLBACK_DELETE_COMPLETION_FLAGS` = Int;
public const val `CF_CALLBACK_DELETE_COMPLETION_FLAG_NONE`: `CF_CALLBACK_DELETE_COMPLETION_FLAGS` = 0;
public typealias `CF_CALLBACK_DELETE_FLAGS` = Int;
public const val `CF_CALLBACK_DELETE_FLAG_IS_DIRECTORY`: `CF_CALLBACK_DELETE_FLAGS` = 1;
public const val `CF_CALLBACK_DELETE_FLAG_IS_UNDELETE`: `CF_CALLBACK_DELETE_FLAGS` = 2;
public const val `CF_CALLBACK_DELETE_FLAG_NONE`: `CF_CALLBACK_DELETE_FLAGS` = 0;
public typealias `CF_CALLBACK_FETCH_DATA_FLAGS` = Int;
public const val `CF_CALLBACK_FETCH_DATA_FLAG_EXPLICIT_HYDRATION`: `CF_CALLBACK_FETCH_DATA_FLAGS` = 2;
public const val `CF_CALLBACK_FETCH_DATA_FLAG_NONE`: `CF_CALLBACK_FETCH_DATA_FLAGS` = 0;
public const val `CF_CALLBACK_FETCH_DATA_FLAG_RECOVERY`: `CF_CALLBACK_FETCH_DATA_FLAGS` = 1;
public typealias `CF_CALLBACK_FETCH_PLACEHOLDERS_FLAGS` = Int;
public const val `CF_CALLBACK_FETCH_PLACEHOLDERS_FLAG_NONE`: `CF_CALLBACK_FETCH_PLACEHOLDERS_FLAGS` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_CorrelationVector")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CF_CALLBACK_INFO` (
    public var `StructSize`: UInt,
    public var `ConnectionKey`: `CF_CONNECTION_KEY`,
    public var `CallbackContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `VolumeGuidName`: `windows_sys`.`core`.`PCWSTR`,
    public var `VolumeDosName`: `windows_sys`.`core`.`PCWSTR`,
    public var `VolumeSerialNumber`: UInt,
    public var `SyncRootFileId`: Long,
    public var `SyncRootIdentity`: /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `SyncRootIdentityLength`: UInt,
    public var `FileId`: Long,
    public var `FileSize`: Long,
    public var `FileIdentity`: /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `FileIdentityLength`: UInt,
    public var `NormalizedPath`: `windows_sys`.`core`.`PCWSTR`,
    public var `TransferKey`: Long,
    public var `PriorityHint`: UByte,
    public var `CorrelationVector`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`CorrelationVector`.`CORRELATION_VECTOR`>?,
    public var `ProcessInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`CF_PROCESS_INFO`>?,
    public var `RequestKey`: Long,
)
// UNSUPPORTED Rust 108:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_CorrelationVector")]
// impl Default for CF_CALLBACK_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `CF_CALLBACK_OPEN_COMPLETION_FLAGS` = Int;
public const val `CF_CALLBACK_OPEN_COMPLETION_FLAG_NONE`: `CF_CALLBACK_OPEN_COMPLETION_FLAGS` = 0;
public const val `CF_CALLBACK_OPEN_COMPLETION_FLAG_PLACEHOLDER_UNKNOWN`: `CF_CALLBACK_OPEN_COMPLETION_FLAGS` = 1;
public const val `CF_CALLBACK_OPEN_COMPLETION_FLAG_PLACEHOLDER_UNSUPPORTED`: `CF_CALLBACK_OPEN_COMPLETION_FLAGS` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CF_CALLBACK_PARAMETERS` (
    public var `ParamSize`: UInt,
    public var `Anonymous`: `CF_CALLBACK_PARAMETERS_0`,
)
// UNSUPPORTED Rust 124:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CF_CALLBACK_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 129:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union CF_CALLBACK_PARAMETERS_0 {
//     pub Cancel: CF_CALLBACK_PARAMETERS_0_0,
//     pub FetchData: CF_CALLBACK_PARAMETERS_0_1,
//     pub ValidateData: CF_CALLBACK_PARAMETERS_0_2,
//     pub FetchPlaceholders: CF_CALLBACK_PARAMETERS_0_3,
//     pub OpenCompletion: CF_CALLBACK_PARAMETERS_0_4,
//     pub CloseCompletion: CF_CALLBACK_PARAMETERS_0_5,
//     pub Dehydrate: CF_CALLBACK_PARAMETERS_0_6,
//     pub DehydrateCompletion: CF_CALLBACK_PARAMETERS_0_7,
//     pub Delete: CF_CALLBACK_PARAMETERS_0_8,
//     pub DeleteCompletion: CF_CALLBACK_PARAMETERS_0_9,
//     pub Rename: CF_CALLBACK_PARAMETERS_0_10,
//     pub RenameCompletion: CF_CALLBACK_PARAMETERS_0_11,
// }

// UNSUPPORTED Rust 145:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CF_CALLBACK_PARAMETERS_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CF_CALLBACK_PARAMETERS_0_0` (
    public var `Flags`: `CF_CALLBACK_CANCEL_FLAGS`,
    public var `Anonymous`: `CF_CALLBACK_PARAMETERS_0_0_0`,
)
// UNSUPPORTED Rust 156:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CF_CALLBACK_PARAMETERS_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 161:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union CF_CALLBACK_PARAMETERS_0_0_0 {
//     pub FetchData: CF_CALLBACK_PARAMETERS_0_0_0_0,
// }

// UNSUPPORTED Rust 166:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CF_CALLBACK_PARAMETERS_0_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CF_CALLBACK_PARAMETERS_0_0_0_0` (
    public var `FileOffset`: Long,
    public var `Length`: Long,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CF_CALLBACK_PARAMETERS_0_5` (
    public var `Flags`: `CF_CALLBACK_CLOSE_COMPLETION_FLAGS`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CF_CALLBACK_PARAMETERS_0_7` (
    public var `Flags`: `CF_CALLBACK_DEHYDRATE_COMPLETION_FLAGS`,
    public var `Reason`: `CF_CALLBACK_DEHYDRATION_REASON`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CF_CALLBACK_PARAMETERS_0_6` (
    public var `Flags`: `CF_CALLBACK_DEHYDRATE_FLAGS`,
    public var `Reason`: `CF_CALLBACK_DEHYDRATION_REASON`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CF_CALLBACK_PARAMETERS_0_9` (
    public var `Flags`: `CF_CALLBACK_DELETE_COMPLETION_FLAGS`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CF_CALLBACK_PARAMETERS_0_8` (
    public var `Flags`: `CF_CALLBACK_DELETE_FLAGS`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CF_CALLBACK_PARAMETERS_0_1` (
    public var `Flags`: `CF_CALLBACK_FETCH_DATA_FLAGS`,
    public var `RequiredFileOffset`: Long,
    public var `RequiredLength`: Long,
    public var `OptionalFileOffset`: Long,
    public var `OptionalLength`: Long,
    public var `LastDehydrationTime`: Long,
    public var `LastDehydrationReason`: `CF_CALLBACK_DEHYDRATION_REASON`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CF_CALLBACK_PARAMETERS_0_3` (
    public var `Flags`: `CF_CALLBACK_FETCH_PLACEHOLDERS_FLAGS`,
    public var `Pattern`: `windows_sys`.`core`.`PCWSTR`,
)
// UNSUPPORTED Rust 221:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CF_CALLBACK_PARAMETERS_0_3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CF_CALLBACK_PARAMETERS_0_4` (
    public var `Flags`: `CF_CALLBACK_OPEN_COMPLETION_FLAGS`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CF_CALLBACK_PARAMETERS_0_11` (
    public var `Flags`: `CF_CALLBACK_RENAME_COMPLETION_FLAGS`,
    public var `SourcePath`: `windows_sys`.`core`.`PCWSTR`,
)
// UNSUPPORTED Rust 237:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CF_CALLBACK_PARAMETERS_0_11 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CF_CALLBACK_PARAMETERS_0_10` (
    public var `Flags`: `CF_CALLBACK_RENAME_FLAGS`,
    public var `TargetPath`: `windows_sys`.`core`.`PCWSTR`,
)
// UNSUPPORTED Rust 248:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CF_CALLBACK_PARAMETERS_0_10 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CF_CALLBACK_PARAMETERS_0_2` (
    public var `Flags`: `CF_CALLBACK_VALIDATE_DATA_FLAGS`,
    public var `RequiredFileOffset`: Long,
    public var `RequiredLength`: Long,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_CorrelationVector")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CF_CALLBACK_REGISTRATION` (
    public var `Type`: `CF_CALLBACK_TYPE`,
    public var `Callback`: `CF_CALLBACK`,
)
public typealias `CF_CALLBACK_RENAME_COMPLETION_FLAGS` = Int;
public const val `CF_CALLBACK_RENAME_COMPLETION_FLAG_NONE`: `CF_CALLBACK_RENAME_COMPLETION_FLAGS` = 0;
public typealias `CF_CALLBACK_RENAME_FLAGS` = Int;
public const val `CF_CALLBACK_RENAME_FLAG_IS_DIRECTORY`: `CF_CALLBACK_RENAME_FLAGS` = 1;
public const val `CF_CALLBACK_RENAME_FLAG_NONE`: `CF_CALLBACK_RENAME_FLAGS` = 0;
public const val `CF_CALLBACK_RENAME_FLAG_SOURCE_IN_SCOPE`: `CF_CALLBACK_RENAME_FLAGS` = 2;
public const val `CF_CALLBACK_RENAME_FLAG_TARGET_IN_SCOPE`: `CF_CALLBACK_RENAME_FLAGS` = 4;
public typealias `CF_CALLBACK_TYPE` = Int;
public const val `CF_CALLBACK_TYPE_CANCEL_FETCH_DATA`: `CF_CALLBACK_TYPE` = 2;
public const val `CF_CALLBACK_TYPE_CANCEL_FETCH_PLACEHOLDERS`: `CF_CALLBACK_TYPE` = 4;
public const val `CF_CALLBACK_TYPE_FETCH_DATA`: `CF_CALLBACK_TYPE` = 0;
public const val `CF_CALLBACK_TYPE_FETCH_PLACEHOLDERS`: `CF_CALLBACK_TYPE` = 3;
public const val `CF_CALLBACK_TYPE_NONE`: `CF_CALLBACK_TYPE` = -1;
public const val `CF_CALLBACK_TYPE_NOTIFY_DEHYDRATE`: `CF_CALLBACK_TYPE` = 7;
public const val `CF_CALLBACK_TYPE_NOTIFY_DEHYDRATE_COMPLETION`: `CF_CALLBACK_TYPE` = 8;
public const val `CF_CALLBACK_TYPE_NOTIFY_DELETE`: `CF_CALLBACK_TYPE` = 9;
public const val `CF_CALLBACK_TYPE_NOTIFY_DELETE_COMPLETION`: `CF_CALLBACK_TYPE` = 10;
public const val `CF_CALLBACK_TYPE_NOTIFY_FILE_CLOSE_COMPLETION`: `CF_CALLBACK_TYPE` = 6;
public const val `CF_CALLBACK_TYPE_NOTIFY_FILE_OPEN_COMPLETION`: `CF_CALLBACK_TYPE` = 5;
public const val `CF_CALLBACK_TYPE_NOTIFY_RENAME`: `CF_CALLBACK_TYPE` = 11;
public const val `CF_CALLBACK_TYPE_NOTIFY_RENAME_COMPLETION`: `CF_CALLBACK_TYPE` = 12;
public const val `CF_CALLBACK_TYPE_VALIDATE_DATA`: `CF_CALLBACK_TYPE` = 1;
public typealias `CF_CALLBACK_VALIDATE_DATA_FLAGS` = Int;
public const val `CF_CALLBACK_VALIDATE_DATA_FLAG_EXPLICIT_HYDRATION`: `CF_CALLBACK_VALIDATE_DATA_FLAGS` = 2;
public const val `CF_CALLBACK_VALIDATE_DATA_FLAG_NONE`: `CF_CALLBACK_VALIDATE_DATA_FLAGS` = 0;
public typealias `CF_CONNECTION_KEY` = Long;
public typealias `CF_CONNECT_FLAGS` = Int;
public const val `CF_CONNECT_FLAG_BLOCK_SELF_IMPLICIT_HYDRATION`: `CF_CONNECT_FLAGS` = 8;
public const val `CF_CONNECT_FLAG_NONE`: `CF_CONNECT_FLAGS` = 0;
public const val `CF_CONNECT_FLAG_REQUIRE_FULL_FILE_PATH`: `CF_CONNECT_FLAGS` = 4;
public const val `CF_CONNECT_FLAG_REQUIRE_PROCESS_INFO`: `CF_CONNECT_FLAGS` = 2;
public typealias `CF_CONVERT_FLAGS` = Int;
public const val `CF_CONVERT_FLAG_ALWAYS_FULL`: `CF_CONVERT_FLAGS` = 8;
public const val `CF_CONVERT_FLAG_DEHYDRATE`: `CF_CONVERT_FLAGS` = 2;
public const val `CF_CONVERT_FLAG_ENABLE_ON_DEMAND_POPULATION`: `CF_CONVERT_FLAGS` = 4;
public const val `CF_CONVERT_FLAG_FORCE_CONVERT_TO_CLOUD_FILE`: `CF_CONVERT_FLAGS` = 16;
public const val `CF_CONVERT_FLAG_MARK_IN_SYNC`: `CF_CONVERT_FLAGS` = 1;
public const val `CF_CONVERT_FLAG_NONE`: `CF_CONVERT_FLAGS` = 0;
public typealias `CF_CREATE_FLAGS` = Int;
public const val `CF_CREATE_FLAG_NONE`: `CF_CREATE_FLAGS` = 0;
public const val `CF_CREATE_FLAG_STOP_ON_ERROR`: `CF_CREATE_FLAGS` = 1;
public typealias `CF_DEHYDRATE_FLAGS` = Int;
public const val `CF_DEHYDRATE_FLAG_BACKGROUND`: `CF_DEHYDRATE_FLAGS` = 1;
public const val `CF_DEHYDRATE_FLAG_NONE`: `CF_DEHYDRATE_FLAGS` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CF_FILE_RANGE` (
    public var `StartingOffset`: Long,
    public var `Length`: Long,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_FileSystem")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CF_FS_METADATA` (
    public var `BasicInfo`: `super`.`FileSystem`.`FILE_BASIC_INFO`,
    public var `FileSize`: Long,
)
public typealias `CF_HARDLINK_POLICY` = Int;
public const val `CF_HARDLINK_POLICY_ALLOWED`: `CF_HARDLINK_POLICY` = 1;
public const val `CF_HARDLINK_POLICY_NONE`: `CF_HARDLINK_POLICY` = 0;
public typealias `CF_HYDRATE_FLAGS` = Int;
public const val `CF_HYDRATE_FLAG_NONE`: `CF_HYDRATE_FLAGS` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CF_HYDRATION_POLICY` (
    public var `Primary`: `CF_HYDRATION_POLICY_PRIMARY`,
    public var `Modifier`: `CF_HYDRATION_POLICY_MODIFIER`,
)
public const val `CF_HYDRATION_POLICY_ALWAYS_FULL`: `CF_HYDRATION_POLICY_PRIMARY` = 3u;
public const val `CF_HYDRATION_POLICY_FULL`: `CF_HYDRATION_POLICY_PRIMARY` = 2u;
public typealias `CF_HYDRATION_POLICY_MODIFIER` = UShort;
public const val `CF_HYDRATION_POLICY_MODIFIER_ALLOW_FULL_RESTART_HYDRATION`: `CF_HYDRATION_POLICY_MODIFIER` = 8u;
public const val `CF_HYDRATION_POLICY_MODIFIER_AUTO_DEHYDRATION_ALLOWED`: `CF_HYDRATION_POLICY_MODIFIER` = 4u;
public const val `CF_HYDRATION_POLICY_MODIFIER_NONE`: `CF_HYDRATION_POLICY_MODIFIER` = 0u;
public const val `CF_HYDRATION_POLICY_MODIFIER_STREAMING_ALLOWED`: `CF_HYDRATION_POLICY_MODIFIER` = 2u;
public const val `CF_HYDRATION_POLICY_MODIFIER_VALIDATION_REQUIRED`: `CF_HYDRATION_POLICY_MODIFIER` = 1u;
public const val `CF_HYDRATION_POLICY_PARTIAL`: `CF_HYDRATION_POLICY_PRIMARY` = 0u;
public typealias `CF_HYDRATION_POLICY_PRIMARY` = UShort;
public const val `CF_HYDRATION_POLICY_PROGRESSIVE`: `CF_HYDRATION_POLICY_PRIMARY` = 1u;
public typealias `CF_INSYNC_POLICY` = UInt;
public const val `CF_INSYNC_POLICY_NONE`: `CF_INSYNC_POLICY` = 0u;
public const val `CF_INSYNC_POLICY_PRESERVE_INSYNC_FOR_SYNC_ENGINE`: `CF_INSYNC_POLICY` = 2147483648u;
public const val `CF_INSYNC_POLICY_TRACK_ALL`: `CF_INSYNC_POLICY` = 16777215u;
public const val `CF_INSYNC_POLICY_TRACK_DIRECTORY_ALL`: `CF_INSYNC_POLICY` = 11184880u;
public const val `CF_INSYNC_POLICY_TRACK_DIRECTORY_CREATION_TIME`: `CF_INSYNC_POLICY` = 16u;
public const val `CF_INSYNC_POLICY_TRACK_DIRECTORY_HIDDEN_ATTRIBUTE`: `CF_INSYNC_POLICY` = 64u;
public const val `CF_INSYNC_POLICY_TRACK_DIRECTORY_LAST_WRITE_TIME`: `CF_INSYNC_POLICY` = 512u;
public const val `CF_INSYNC_POLICY_TRACK_DIRECTORY_READONLY_ATTRIBUTE`: `CF_INSYNC_POLICY` = 32u;
public const val `CF_INSYNC_POLICY_TRACK_DIRECTORY_SYSTEM_ATTRIBUTE`: `CF_INSYNC_POLICY` = 128u;
public const val `CF_INSYNC_POLICY_TRACK_FILE_ALL`: `CF_INSYNC_POLICY` = 5592335u;
public const val `CF_INSYNC_POLICY_TRACK_FILE_CREATION_TIME`: `CF_INSYNC_POLICY` = 1u;
public const val `CF_INSYNC_POLICY_TRACK_FILE_HIDDEN_ATTRIBUTE`: `CF_INSYNC_POLICY` = 4u;
public const val `CF_INSYNC_POLICY_TRACK_FILE_LAST_WRITE_TIME`: `CF_INSYNC_POLICY` = 256u;
public const val `CF_INSYNC_POLICY_TRACK_FILE_READONLY_ATTRIBUTE`: `CF_INSYNC_POLICY` = 2u;
public const val `CF_INSYNC_POLICY_TRACK_FILE_SYSTEM_ATTRIBUTE`: `CF_INSYNC_POLICY` = 8u;
public typealias `CF_IN_SYNC_STATE` = Int;
public const val `CF_IN_SYNC_STATE_IN_SYNC`: `CF_IN_SYNC_STATE` = 1;
public const val `CF_IN_SYNC_STATE_NOT_IN_SYNC`: `CF_IN_SYNC_STATE` = 0;
public const val `CF_MAX_PRIORITY_HINT`: UInt = 15u;
public const val `CF_MAX_PROVIDER_NAME_LENGTH`: UInt = 255u;
public const val `CF_MAX_PROVIDER_VERSION_LENGTH`: UInt = 255u;
public typealias `CF_OPEN_FILE_FLAGS` = Int;
public const val `CF_OPEN_FILE_FLAG_DELETE_ACCESS`: `CF_OPEN_FILE_FLAGS` = 4;
public const val `CF_OPEN_FILE_FLAG_EXCLUSIVE`: `CF_OPEN_FILE_FLAGS` = 1;
public const val `CF_OPEN_FILE_FLAG_FOREGROUND`: `CF_OPEN_FILE_FLAGS` = 8;
public const val `CF_OPEN_FILE_FLAG_NONE`: `CF_OPEN_FILE_FLAGS` = 0;
public const val `CF_OPEN_FILE_FLAG_WRITE_ACCESS`: `CF_OPEN_FILE_FLAGS` = 2;
public typealias `CF_OPERATION_ACK_DATA_FLAGS` = Int;
public const val `CF_OPERATION_ACK_DATA_FLAG_NONE`: `CF_OPERATION_ACK_DATA_FLAGS` = 0;
public typealias `CF_OPERATION_ACK_DEHYDRATE_FLAGS` = Int;
public const val `CF_OPERATION_ACK_DEHYDRATE_FLAG_NONE`: `CF_OPERATION_ACK_DEHYDRATE_FLAGS` = 0;
public typealias `CF_OPERATION_ACK_DELETE_FLAGS` = Int;
public const val `CF_OPERATION_ACK_DELETE_FLAG_NONE`: `CF_OPERATION_ACK_DELETE_FLAGS` = 0;
public typealias `CF_OPERATION_ACK_RENAME_FLAGS` = Int;
public const val `CF_OPERATION_ACK_RENAME_FLAG_NONE`: `CF_OPERATION_ACK_RENAME_FLAGS` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_CorrelationVector")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CF_OPERATION_INFO` (
    public var `StructSize`: UInt,
    public var `Type`: `CF_OPERATION_TYPE`,
    public var `ConnectionKey`: `CF_CONNECTION_KEY`,
    public var `TransferKey`: Long,
    public var `CorrelationVector`: /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`System`.`CorrelationVector`.`CORRELATION_VECTOR`>?,
    public var `SyncStatus`: /* Rust *const */ kotlinx.cinterop.CPointer<`CF_SYNC_STATUS`>?,
    public var `RequestKey`: Long,
)
// UNSUPPORTED Rust 394:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_CorrelationVector")]
// impl Default for CF_OPERATION_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_FileSystem")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CF_OPERATION_PARAMETERS` (
    public var `ParamSize`: UInt,
    public var `Anonymous`: `CF_OPERATION_PARAMETERS_0`,
)
// UNSUPPORTED Rust 407:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Storage_FileSystem")]
// impl Default for CF_OPERATION_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 413:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Storage_FileSystem")]
// #[derive(Clone, Copy)]
// pub union CF_OPERATION_PARAMETERS_0 {
//     pub TransferData: CF_OPERATION_PARAMETERS_0_0,
//     pub RetrieveData: CF_OPERATION_PARAMETERS_0_1,
//     pub AckData: CF_OPERATION_PARAMETERS_0_2,
//     pub RestartHydration: CF_OPERATION_PARAMETERS_0_3,
//     pub TransferPlaceholders: CF_OPERATION_PARAMETERS_0_4,
//     pub AckDehydrate: CF_OPERATION_PARAMETERS_0_5,
//     pub AckRename: CF_OPERATION_PARAMETERS_0_6,
//     pub AckDelete: CF_OPERATION_PARAMETERS_0_7,
// }

// UNSUPPORTED Rust 426:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Storage_FileSystem")]
// impl Default for CF_OPERATION_PARAMETERS_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_FileSystem")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CF_OPERATION_PARAMETERS_0_2` (
    public var `Flags`: `CF_OPERATION_ACK_DATA_FLAGS`,
    public var `CompletionStatus`: `super`.`super`.`Foundation`.`NTSTATUS`,
    public var `Offset`: Long,
    public var `Length`: Long,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_FileSystem")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CF_OPERATION_PARAMETERS_0_5` (
    public var `Flags`: `CF_OPERATION_ACK_DEHYDRATE_FLAGS`,
    public var `CompletionStatus`: `super`.`super`.`Foundation`.`NTSTATUS`,
    public var `FileIdentity`: /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `FileIdentityLength`: UInt,
)
// UNSUPPORTED Rust 450:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Storage_FileSystem")]
// impl Default for CF_OPERATION_PARAMETERS_0_5 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_FileSystem")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CF_OPERATION_PARAMETERS_0_7` (
    public var `Flags`: `CF_OPERATION_ACK_DELETE_FLAGS`,
    public var `CompletionStatus`: `super`.`super`.`Foundation`.`NTSTATUS`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_FileSystem")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CF_OPERATION_PARAMETERS_0_6` (
    public var `Flags`: `CF_OPERATION_ACK_RENAME_FLAGS`,
    public var `CompletionStatus`: `super`.`super`.`Foundation`.`NTSTATUS`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_FileSystem")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CF_OPERATION_PARAMETERS_0_3` (
    public var `Flags`: `CF_OPERATION_RESTART_HYDRATION_FLAGS`,
    public var `FsMetadata`: /* Rust *const */ kotlinx.cinterop.CPointer<`CF_FS_METADATA`>?,
    public var `FileIdentity`: /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `FileIdentityLength`: UInt,
)
// UNSUPPORTED Rust 479:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Storage_FileSystem")]
// impl Default for CF_OPERATION_PARAMETERS_0_3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_FileSystem")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CF_OPERATION_PARAMETERS_0_1` (
    public var `Flags`: `CF_OPERATION_RETRIEVE_DATA_FLAGS`,
    public var `Buffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Offset`: Long,
    public var `Length`: Long,
    public var `ReturnedLength`: Long,
)
// UNSUPPORTED Rust 495:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Storage_FileSystem")]
// impl Default for CF_OPERATION_PARAMETERS_0_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_FileSystem")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CF_OPERATION_PARAMETERS_0_0` (
    public var `Flags`: `CF_OPERATION_TRANSFER_DATA_FLAGS`,
    public var `CompletionStatus`: `super`.`super`.`Foundation`.`NTSTATUS`,
    public var `Buffer`: /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Offset`: Long,
    public var `Length`: Long,
)
// UNSUPPORTED Rust 511:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Storage_FileSystem")]
// impl Default for CF_OPERATION_PARAMETERS_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_FileSystem")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CF_OPERATION_PARAMETERS_0_4` (
    public var `Flags`: `CF_OPERATION_TRANSFER_PLACEHOLDERS_FLAGS`,
    public var `CompletionStatus`: `super`.`super`.`Foundation`.`NTSTATUS`,
    public var `PlaceholderTotalCount`: Long,
    public var `PlaceholderArray`: /* Rust *mut */ kotlinx.cinterop.CPointer<`CF_PLACEHOLDER_CREATE_INFO`>?,
    public var `PlaceholderCount`: UInt,
    public var `EntriesProcessed`: UInt,
)
// UNSUPPORTED Rust 528:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Storage_FileSystem")]
// impl Default for CF_OPERATION_PARAMETERS_0_4 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `CF_OPERATION_RESTART_HYDRATION_FLAGS` = Int;
public const val `CF_OPERATION_RESTART_HYDRATION_FLAG_MARK_IN_SYNC`: `CF_OPERATION_RESTART_HYDRATION_FLAGS` = 1;
public const val `CF_OPERATION_RESTART_HYDRATION_FLAG_NONE`: `CF_OPERATION_RESTART_HYDRATION_FLAGS` = 0;
public typealias `CF_OPERATION_RETRIEVE_DATA_FLAGS` = Int;
public const val `CF_OPERATION_RETRIEVE_DATA_FLAG_NONE`: `CF_OPERATION_RETRIEVE_DATA_FLAGS` = 0;
public typealias `CF_OPERATION_TRANSFER_DATA_FLAGS` = Int;
public const val `CF_OPERATION_TRANSFER_DATA_FLAG_NONE`: `CF_OPERATION_TRANSFER_DATA_FLAGS` = 0;
public typealias `CF_OPERATION_TRANSFER_PLACEHOLDERS_FLAGS` = Int;
public const val `CF_OPERATION_TRANSFER_PLACEHOLDERS_FLAG_DISABLE_ON_DEMAND_POPULATION`: `CF_OPERATION_TRANSFER_PLACEHOLDERS_FLAGS` = 2;
public const val `CF_OPERATION_TRANSFER_PLACEHOLDERS_FLAG_NONE`: `CF_OPERATION_TRANSFER_PLACEHOLDERS_FLAGS` = 0;
public const val `CF_OPERATION_TRANSFER_PLACEHOLDERS_FLAG_STOP_ON_ERROR`: `CF_OPERATION_TRANSFER_PLACEHOLDERS_FLAGS` = 1;
public typealias `CF_OPERATION_TYPE` = Int;
public const val `CF_OPERATION_TYPE_ACK_DATA`: `CF_OPERATION_TYPE` = 2;
public const val `CF_OPERATION_TYPE_ACK_DEHYDRATE`: `CF_OPERATION_TYPE` = 5;
public const val `CF_OPERATION_TYPE_ACK_DELETE`: `CF_OPERATION_TYPE` = 6;
public const val `CF_OPERATION_TYPE_ACK_RENAME`: `CF_OPERATION_TYPE` = 7;
public const val `CF_OPERATION_TYPE_RESTART_HYDRATION`: `CF_OPERATION_TYPE` = 3;
public const val `CF_OPERATION_TYPE_RETRIEVE_DATA`: `CF_OPERATION_TYPE` = 1;
public const val `CF_OPERATION_TYPE_TRANSFER_DATA`: `CF_OPERATION_TYPE` = 0;
public const val `CF_OPERATION_TYPE_TRANSFER_PLACEHOLDERS`: `CF_OPERATION_TYPE` = 4;
public typealias `CF_PIN_STATE` = Int;
public const val `CF_PIN_STATE_EXCLUDED`: `CF_PIN_STATE` = 3;
public const val `CF_PIN_STATE_INHERIT`: `CF_PIN_STATE` = 4;
public const val `CF_PIN_STATE_PINNED`: `CF_PIN_STATE` = 1;
public const val `CF_PIN_STATE_UNPINNED`: `CF_PIN_STATE` = 2;
public const val `CF_PIN_STATE_UNSPECIFIED`: `CF_PIN_STATE` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CF_PLACEHOLDER_BASIC_INFO` (
    public var `PinState`: `CF_PIN_STATE`,
    public var `InSyncState`: `CF_IN_SYNC_STATE`,
    public var `FileId`: Long,
    public var `SyncRootFileId`: Long,
    public var `FileIdentityLength`: UInt,
    public var `FileIdentity`: UByteArray,
)
// UNSUPPORTED Rust 570:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CF_PLACEHOLDER_BASIC_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `CF_PLACEHOLDER_CREATE_FLAGS` = Int;
public const val `CF_PLACEHOLDER_CREATE_FLAG_ALWAYS_FULL`: `CF_PLACEHOLDER_CREATE_FLAGS` = 8;
public const val `CF_PLACEHOLDER_CREATE_FLAG_DISABLE_ON_DEMAND_POPULATION`: `CF_PLACEHOLDER_CREATE_FLAGS` = 1;
public const val `CF_PLACEHOLDER_CREATE_FLAG_MARK_IN_SYNC`: `CF_PLACEHOLDER_CREATE_FLAGS` = 2;
public const val `CF_PLACEHOLDER_CREATE_FLAG_NONE`: `CF_PLACEHOLDER_CREATE_FLAGS` = 0;
public const val `CF_PLACEHOLDER_CREATE_FLAG_SUPERSEDE`: `CF_PLACEHOLDER_CREATE_FLAGS` = 4;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Storage_FileSystem")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CF_PLACEHOLDER_CREATE_INFO` (
    public var `RelativeFileName`: `windows_sys`.`core`.`PCWSTR`,
    public var `FsMetadata`: `CF_FS_METADATA`,
    public var `FileIdentity`: /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `FileIdentityLength`: UInt,
    public var `Flags`: `CF_PLACEHOLDER_CREATE_FLAGS`,
    public var `Result`: `windows_sys`.`core`.`HRESULT`,
    public var `CreateUsn`: Long,
)
// UNSUPPORTED Rust 593:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Storage_FileSystem")]
// impl Default for CF_PLACEHOLDER_CREATE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CF_PLACEHOLDER_INFO_BASIC`: `CF_PLACEHOLDER_INFO_CLASS` = 0;
public typealias `CF_PLACEHOLDER_INFO_CLASS` = Int;
public const val `CF_PLACEHOLDER_INFO_STANDARD`: `CF_PLACEHOLDER_INFO_CLASS` = 1;
public typealias `CF_PLACEHOLDER_MANAGEMENT_POLICY` = Int;
public const val `CF_PLACEHOLDER_MANAGEMENT_POLICY_CONVERT_TO_UNRESTRICTED`: `CF_PLACEHOLDER_MANAGEMENT_POLICY` = 2;
public const val `CF_PLACEHOLDER_MANAGEMENT_POLICY_CREATE_UNRESTRICTED`: `CF_PLACEHOLDER_MANAGEMENT_POLICY` = 1;
public const val `CF_PLACEHOLDER_MANAGEMENT_POLICY_DEFAULT`: `CF_PLACEHOLDER_MANAGEMENT_POLICY` = 0;
public const val `CF_PLACEHOLDER_MANAGEMENT_POLICY_UPDATE_UNRESTRICTED`: `CF_PLACEHOLDER_MANAGEMENT_POLICY` = 4;
public const val `CF_PLACEHOLDER_MAX_FILE_IDENTITY_LENGTH`: UInt = 4096u;
public typealias `CF_PLACEHOLDER_RANGE_INFO_CLASS` = Int;
public const val `CF_PLACEHOLDER_RANGE_INFO_MODIFIED`: `CF_PLACEHOLDER_RANGE_INFO_CLASS` = 3;
public const val `CF_PLACEHOLDER_RANGE_INFO_ONDISK`: `CF_PLACEHOLDER_RANGE_INFO_CLASS` = 1;
public const val `CF_PLACEHOLDER_RANGE_INFO_VALIDATED`: `CF_PLACEHOLDER_RANGE_INFO_CLASS` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CF_PLACEHOLDER_STANDARD_INFO` (
    public var `OnDiskDataSize`: Long,
    public var `ValidatedDataSize`: Long,
    public var `ModifiedDataSize`: Long,
    public var `PropertiesSize`: Long,
    public var `PinState`: `CF_PIN_STATE`,
    public var `InSyncState`: `CF_IN_SYNC_STATE`,
    public var `FileId`: Long,
    public var `SyncRootFileId`: Long,
    public var `FileIdentityLength`: UInt,
    public var `FileIdentity`: UByteArray,
)
// UNSUPPORTED Rust 626:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CF_PLACEHOLDER_STANDARD_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `CF_PLACEHOLDER_STATE` = UInt;
public const val `CF_PLACEHOLDER_STATE_ESSENTIAL_PROP_PRESENT`: `CF_PLACEHOLDER_STATE` = 4u;
public const val `CF_PLACEHOLDER_STATE_INVALID`: `CF_PLACEHOLDER_STATE` = 4294967295u;
public const val `CF_PLACEHOLDER_STATE_IN_SYNC`: `CF_PLACEHOLDER_STATE` = 8u;
public const val `CF_PLACEHOLDER_STATE_NO_STATES`: `CF_PLACEHOLDER_STATE` = 0u;
public const val `CF_PLACEHOLDER_STATE_PARTIAL`: `CF_PLACEHOLDER_STATE` = 16u;
public const val `CF_PLACEHOLDER_STATE_PARTIALLY_ON_DISK`: `CF_PLACEHOLDER_STATE` = 32u;
public const val `CF_PLACEHOLDER_STATE_PLACEHOLDER`: `CF_PLACEHOLDER_STATE` = 1u;
public const val `CF_PLACEHOLDER_STATE_SYNC_ROOT`: `CF_PLACEHOLDER_STATE` = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CF_PLATFORM_INFO` (
    public var `BuildNumber`: UInt,
    public var `RevisionNumber`: UInt,
    public var `IntegrationNumber`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CF_POPULATION_POLICY` (
    public var `Primary`: `CF_POPULATION_POLICY_PRIMARY`,
    public var `Modifier`: `CF_POPULATION_POLICY_MODIFIER`,
)
public const val `CF_POPULATION_POLICY_ALWAYS_FULL`: `CF_POPULATION_POLICY_PRIMARY` = 3u;
public const val `CF_POPULATION_POLICY_FULL`: `CF_POPULATION_POLICY_PRIMARY` = 2u;
public typealias `CF_POPULATION_POLICY_MODIFIER` = UShort;
public const val `CF_POPULATION_POLICY_MODIFIER_NONE`: `CF_POPULATION_POLICY_MODIFIER` = 0u;
public const val `CF_POPULATION_POLICY_PARTIAL`: `CF_POPULATION_POLICY_PRIMARY` = 0u;
public typealias `CF_POPULATION_POLICY_PRIMARY` = UShort;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CF_PROCESS_INFO` (
    public var `StructSize`: UInt,
    public var `ProcessId`: UInt,
    public var `ImagePath`: `windows_sys`.`core`.`PCWSTR`,
    public var `PackageName`: `windows_sys`.`core`.`PCWSTR`,
    public var `ApplicationId`: `windows_sys`.`core`.`PCWSTR`,
    public var `CommandLine`: `windows_sys`.`core`.`PCWSTR`,
    public var `SessionId`: UInt,
)
// UNSUPPORTED Rust 670:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CF_PROCESS_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CF_PROVIDER_STATUS_CLEAR_FLAGS`: `CF_SYNC_PROVIDER_STATUS` = 2147483648u;
public const val `CF_PROVIDER_STATUS_CONNECTIVITY_LOST`: `CF_SYNC_PROVIDER_STATUS` = 64u;
public const val `CF_PROVIDER_STATUS_DISCONNECTED`: `CF_SYNC_PROVIDER_STATUS` = 0u;
public const val `CF_PROVIDER_STATUS_ERROR`: `CF_SYNC_PROVIDER_STATUS` = 3221225474u;
public const val `CF_PROVIDER_STATUS_IDLE`: `CF_SYNC_PROVIDER_STATUS` = 1u;
public const val `CF_PROVIDER_STATUS_POPULATE_CONTENT`: `CF_SYNC_PROVIDER_STATUS` = 8u;
public const val `CF_PROVIDER_STATUS_POPULATE_METADATA`: `CF_SYNC_PROVIDER_STATUS` = 4u;
public const val `CF_PROVIDER_STATUS_POPULATE_NAMESPACE`: `CF_SYNC_PROVIDER_STATUS` = 2u;
public const val `CF_PROVIDER_STATUS_SYNC_FULL`: `CF_SYNC_PROVIDER_STATUS` = 32u;
public const val `CF_PROVIDER_STATUS_SYNC_INCREMENTAL`: `CF_SYNC_PROVIDER_STATUS` = 16u;
public const val `CF_PROVIDER_STATUS_TERMINATED`: `CF_SYNC_PROVIDER_STATUS` = 3221225473u;
public typealias `CF_REGISTER_FLAGS` = Int;
public const val `CF_REGISTER_FLAG_DISABLE_ON_DEMAND_POPULATION_ON_ROOT`: `CF_REGISTER_FLAGS` = 2;
public const val `CF_REGISTER_FLAG_MARK_IN_SYNC_ON_ROOT`: `CF_REGISTER_FLAGS` = 4;
public const val `CF_REGISTER_FLAG_NONE`: `CF_REGISTER_FLAGS` = 0;
public const val `CF_REGISTER_FLAG_UPDATE`: `CF_REGISTER_FLAGS` = 1;
public const val `CF_REQUEST_KEY_DEFAULT`: UInt = 0u;
public typealias `CF_REVERT_FLAGS` = Int;
public const val `CF_REVERT_FLAG_NONE`: `CF_REVERT_FLAGS` = 0;
public typealias `CF_SET_IN_SYNC_FLAGS` = Int;
public const val `CF_SET_IN_SYNC_FLAG_NONE`: `CF_SET_IN_SYNC_FLAGS` = 0;
public typealias `CF_SET_PIN_FLAGS` = Int;
public const val `CF_SET_PIN_FLAG_NONE`: `CF_SET_PIN_FLAGS` = 0;
public const val `CF_SET_PIN_FLAG_RECURSE`: `CF_SET_PIN_FLAGS` = 1;
public const val `CF_SET_PIN_FLAG_RECURSE_ONLY`: `CF_SET_PIN_FLAGS` = 2;
public const val `CF_SET_PIN_FLAG_RECURSE_STOP_ON_ERROR`: `CF_SET_PIN_FLAGS` = 4;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CF_SYNC_POLICIES` (
    public var `StructSize`: UInt,
    public var `Hydration`: `CF_HYDRATION_POLICY`,
    public var `Population`: `CF_POPULATION_POLICY`,
    public var `InSync`: `CF_INSYNC_POLICY`,
    public var `HardLink`: `CF_HARDLINK_POLICY`,
    public var `PlaceholderManagement`: `CF_PLACEHOLDER_MANAGEMENT_POLICY`,
)
public typealias `CF_SYNC_PROVIDER_STATUS` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CF_SYNC_REGISTRATION` (
    public var `StructSize`: UInt,
    public var `ProviderName`: `windows_sys`.`core`.`PCWSTR`,
    public var `ProviderVersion`: `windows_sys`.`core`.`PCWSTR`,
    public var `SyncRootIdentity`: /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `SyncRootIdentityLength`: UInt,
    public var `FileIdentity`: /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `FileIdentityLength`: UInt,
    public var `ProviderId`: `windows_sys`.`core`.`GUID`,
)
// UNSUPPORTED Rust 724:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CF_SYNC_REGISTRATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CF_SYNC_ROOT_BASIC_INFO` (
    public var `SyncRootFileId`: Long,
)
public const val `CF_SYNC_ROOT_INFO_BASIC`: `CF_SYNC_ROOT_INFO_CLASS` = 0;
public typealias `CF_SYNC_ROOT_INFO_CLASS` = Int;
public const val `CF_SYNC_ROOT_INFO_PROVIDER`: `CF_SYNC_ROOT_INFO_CLASS` = 2;
public const val `CF_SYNC_ROOT_INFO_STANDARD`: `CF_SYNC_ROOT_INFO_CLASS` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CF_SYNC_ROOT_PROVIDER_INFO` (
    public var `ProviderStatus`: `CF_SYNC_PROVIDER_STATUS`,
    public var `ProviderName`: UShortArray,
    public var `ProviderVersion`: UShortArray,
)
// UNSUPPORTED Rust 745:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CF_SYNC_ROOT_PROVIDER_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CF_SYNC_ROOT_STANDARD_INFO` (
    public var `SyncRootFileId`: Long,
    public var `HydrationPolicy`: `CF_HYDRATION_POLICY`,
    public var `PopulationPolicy`: `CF_POPULATION_POLICY`,
    public var `InSyncPolicy`: `CF_INSYNC_POLICY`,
    public var `HardLinkPolicy`: `CF_HARDLINK_POLICY`,
    public var `ProviderStatus`: `CF_SYNC_PROVIDER_STATUS`,
    public var `ProviderName`: UShortArray,
    public var `ProviderVersion`: UShortArray,
    public var `SyncRootIdentityLength`: UInt,
    public var `SyncRootIdentity`: UByteArray,
)
// UNSUPPORTED Rust 764:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CF_SYNC_ROOT_STANDARD_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CF_SYNC_STATUS` (
    public var `StructSize`: UInt,
    public var `Code`: UInt,
    public var `DescriptionOffset`: UInt,
    public var `DescriptionLength`: UInt,
    public var `DeviceIdOffset`: UInt,
    public var `DeviceIdLength`: UInt,
)
public typealias `CF_UPDATE_FLAGS` = Int;
public const val `CF_UPDATE_FLAG_ALLOW_PARTIAL`: `CF_UPDATE_FLAGS` = 1024;
public const val `CF_UPDATE_FLAG_ALWAYS_FULL`: `CF_UPDATE_FLAGS` = 512;
public const val `CF_UPDATE_FLAG_CLEAR_IN_SYNC`: `CF_UPDATE_FLAGS` = 64;
public const val `CF_UPDATE_FLAG_DEHYDRATE`: `CF_UPDATE_FLAGS` = 4;
public const val `CF_UPDATE_FLAG_DISABLE_ON_DEMAND_POPULATION`: `CF_UPDATE_FLAGS` = 16;
public const val `CF_UPDATE_FLAG_ENABLE_ON_DEMAND_POPULATION`: `CF_UPDATE_FLAGS` = 8;
public const val `CF_UPDATE_FLAG_MARK_IN_SYNC`: `CF_UPDATE_FLAGS` = 2;
public const val `CF_UPDATE_FLAG_NONE`: `CF_UPDATE_FLAGS` = 0;
public const val `CF_UPDATE_FLAG_PASSTHROUGH_FS_METADATA`: `CF_UPDATE_FLAGS` = 256;
public const val `CF_UPDATE_FLAG_REMOVE_FILE_IDENTITY`: `CF_UPDATE_FLAGS` = 32;
public const val `CF_UPDATE_FLAG_REMOVE_PROPERTY`: `CF_UPDATE_FLAGS` = 128;
public const val `CF_UPDATE_FLAG_VERIFY_IN_SYNC`: `CF_UPDATE_FLAGS` = 1;
