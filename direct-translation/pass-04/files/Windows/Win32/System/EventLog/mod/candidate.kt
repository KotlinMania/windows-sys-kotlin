// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=BackupEventLogA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `BackupEventLogA`(`heventlog` : `super`.`super`.`Foundation`.`HANDLE`, `lpbackupfilename` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=BackupEventLogW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `BackupEventLogW`(`heventlog` : `super`.`super`.`Foundation`.`HANDLE`, `lpbackupfilename` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=ClearEventLogA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ClearEventLogA`(`heventlog` : `super`.`super`.`Foundation`.`HANDLE`, `lpbackupfilename` : `windows_sys`.`core`.`PCSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=ClearEventLogW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ClearEventLogW`(`heventlog` : `super`.`super`.`Foundation`.`HANDLE`, `lpbackupfilename` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=CloseEventLog; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CloseEventLog`(`heventlog` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=DeregisterEventSource; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeregisterEventSource`(`heventlog` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wevtapi.dll, ABI=system, export=EvtArchiveExportedLog; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EvtArchiveExportedLog`(`session` : `EVT_HANDLE`, `logfilepath` : `windows_sys`.`core`.`PCWSTR`, `locale` : UInt, `flags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wevtapi.dll, ABI=system, export=EvtCancel; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EvtCancel`(`object` : `EVT_HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wevtapi.dll, ABI=system, export=EvtClearLog; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EvtClearLog`(`session` : `EVT_HANDLE`, `channelpath` : `windows_sys`.`core`.`PCWSTR`, `targetfilepath` : `windows_sys`.`core`.`PCWSTR`, `flags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wevtapi.dll, ABI=system, export=EvtClose; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EvtClose`(`object` : `EVT_HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wevtapi.dll, ABI=system, export=EvtCreateBookmark; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EvtCreateBookmark`(`bookmarkxml` : `windows_sys`.`core`.`PCWSTR`) : `EVT_HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wevtapi.dll, ABI=system, export=EvtCreateRenderContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EvtCreateRenderContext`(`valuepathscount` : UInt, `valuepaths` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCWSTR`>?, `flags` : UInt) : `EVT_HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wevtapi.dll, ABI=system, export=EvtExportLog; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EvtExportLog`(`session` : `EVT_HANDLE`, `path` : `windows_sys`.`core`.`PCWSTR`, `query` : `windows_sys`.`core`.`PCWSTR`, `targetfilepath` : `windows_sys`.`core`.`PCWSTR`, `flags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wevtapi.dll, ABI=system, export=EvtFormatMessage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `EvtFormatMessage`(`publishermetadata` : `EVT_HANDLE`, `event` : `EVT_HANDLE`, `messageid` : UInt, `valuecount` : UInt, `values` : /* Rust *const */ kotlinx.cinterop.CPointer<`EVT_VARIANT`>?, `flags` : UInt, `buffersize` : UInt, `buffer` : `windows_sys`.`core`.`PWSTR`, `bufferused` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wevtapi.dll, ABI=system, export=EvtGetChannelConfigProperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `EvtGetChannelConfigProperty`(`channelconfig` : `EVT_HANDLE`, `propertyid` : `EVT_CHANNEL_CONFIG_PROPERTY_ID`, `flags` : UInt, `propertyvaluebuffersize` : UInt, `propertyvaluebuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`EVT_VARIANT`>?, `propertyvaluebufferused` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wevtapi.dll, ABI=system, export=EvtGetEventInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `EvtGetEventInfo`(`event` : `EVT_HANDLE`, `propertyid` : `EVT_EVENT_PROPERTY_ID`, `propertyvaluebuffersize` : UInt, `propertyvaluebuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`EVT_VARIANT`>?, `propertyvaluebufferused` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wevtapi.dll, ABI=system, export=EvtGetEventMetadataProperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `EvtGetEventMetadataProperty`(`eventmetadata` : `EVT_HANDLE`, `propertyid` : `EVT_EVENT_METADATA_PROPERTY_ID`, `flags` : UInt, `eventmetadatapropertybuffersize` : UInt, `eventmetadatapropertybuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`EVT_VARIANT`>?, `eventmetadatapropertybufferused` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wevtapi.dll, ABI=system, export=EvtGetExtendedStatus; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EvtGetExtendedStatus`(`buffersize` : UInt, `buffer` : `windows_sys`.`core`.`PWSTR`, `bufferused` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wevtapi.dll, ABI=system, export=EvtGetLogInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `EvtGetLogInfo`(`log` : `EVT_HANDLE`, `propertyid` : `EVT_LOG_PROPERTY_ID`, `propertyvaluebuffersize` : UInt, `propertyvaluebuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`EVT_VARIANT`>?, `propertyvaluebufferused` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wevtapi.dll, ABI=system, export=EvtGetObjectArrayProperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `EvtGetObjectArrayProperty`(`objectarray` : Long, `propertyid` : UInt, `arrayindex` : UInt, `flags` : UInt, `propertyvaluebuffersize` : UInt, `propertyvaluebuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`EVT_VARIANT`>?, `propertyvaluebufferused` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wevtapi.dll, ABI=system, export=EvtGetObjectArraySize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EvtGetObjectArraySize`(`objectarray` : Long, `objectarraysize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wevtapi.dll, ABI=system, export=EvtGetPublisherMetadataProperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `EvtGetPublisherMetadataProperty`(`publishermetadata` : `EVT_HANDLE`, `propertyid` : `EVT_PUBLISHER_METADATA_PROPERTY_ID`, `flags` : UInt, `publishermetadatapropertybuffersize` : UInt, `publishermetadatapropertybuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`EVT_VARIANT`>?, `publishermetadatapropertybufferused` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wevtapi.dll, ABI=system, export=EvtGetQueryInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `EvtGetQueryInfo`(`queryorsubscription` : `EVT_HANDLE`, `propertyid` : `EVT_QUERY_PROPERTY_ID`, `propertyvaluebuffersize` : UInt, `propertyvaluebuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`EVT_VARIANT`>?, `propertyvaluebufferused` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wevtapi.dll, ABI=system, export=EvtNext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EvtNext`(`resultset` : `EVT_HANDLE`, `eventssize` : UInt, `events` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, `timeout` : UInt, `flags` : UInt, `returned` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wevtapi.dll, ABI=system, export=EvtNextChannelPath; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EvtNextChannelPath`(`channelenum` : `EVT_HANDLE`, `channelpathbuffersize` : UInt, `channelpathbuffer` : `windows_sys`.`core`.`PWSTR`, `channelpathbufferused` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wevtapi.dll, ABI=system, export=EvtNextEventMetadata; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EvtNextEventMetadata`(`eventmetadataenum` : `EVT_HANDLE`, `flags` : UInt) : `EVT_HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wevtapi.dll, ABI=system, export=EvtNextPublisherId; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EvtNextPublisherId`(`publisherenum` : `EVT_HANDLE`, `publisheridbuffersize` : UInt, `publisheridbuffer` : `windows_sys`.`core`.`PWSTR`, `publisheridbufferused` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wevtapi.dll, ABI=system, export=EvtOpenChannelConfig; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EvtOpenChannelConfig`(`session` : `EVT_HANDLE`, `channelpath` : `windows_sys`.`core`.`PCWSTR`, `flags` : UInt) : `EVT_HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wevtapi.dll, ABI=system, export=EvtOpenChannelEnum; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EvtOpenChannelEnum`(`session` : `EVT_HANDLE`, `flags` : UInt) : `EVT_HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wevtapi.dll, ABI=system, export=EvtOpenEventMetadataEnum; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EvtOpenEventMetadataEnum`(`publishermetadata` : `EVT_HANDLE`, `flags` : UInt) : `EVT_HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wevtapi.dll, ABI=system, export=EvtOpenLog; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EvtOpenLog`(`session` : `EVT_HANDLE`, `path` : `windows_sys`.`core`.`PCWSTR`, `flags` : UInt) : `EVT_HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wevtapi.dll, ABI=system, export=EvtOpenPublisherEnum; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EvtOpenPublisherEnum`(`session` : `EVT_HANDLE`, `flags` : UInt) : `EVT_HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wevtapi.dll, ABI=system, export=EvtOpenPublisherMetadata; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EvtOpenPublisherMetadata`(`session` : `EVT_HANDLE`, `publisherid` : `windows_sys`.`core`.`PCWSTR`, `logfilepath` : `windows_sys`.`core`.`PCWSTR`, `locale` : UInt, `flags` : UInt) : `EVT_HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wevtapi.dll, ABI=system, export=EvtOpenSession; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EvtOpenSession`(`loginclass` : `EVT_LOGIN_CLASS`, `login` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `timeout` : UInt, `flags` : UInt) : `EVT_HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wevtapi.dll, ABI=system, export=EvtQuery; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EvtQuery`(`session` : `EVT_HANDLE`, `path` : `windows_sys`.`core`.`PCWSTR`, `query` : `windows_sys`.`core`.`PCWSTR`, `flags` : UInt) : `EVT_HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wevtapi.dll, ABI=system, export=EvtRender; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EvtRender`(`context` : `EVT_HANDLE`, `fragment` : `EVT_HANDLE`, `flags` : UInt, `buffersize` : UInt, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `bufferused` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `propertycount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wevtapi.dll, ABI=system, export=EvtSaveChannelConfig; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EvtSaveChannelConfig`(`channelconfig` : `EVT_HANDLE`, `flags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wevtapi.dll, ABI=system, export=EvtSeek; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EvtSeek`(`resultset` : `EVT_HANDLE`, `position` : Long, `bookmark` : `EVT_HANDLE`, `timeout` : UInt, `flags` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wevtapi.dll, ABI=system, export=EvtSetChannelConfigProperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `EvtSetChannelConfigProperty`(`channelconfig` : `EVT_HANDLE`, `propertyid` : `EVT_CHANNEL_CONFIG_PROPERTY_ID`, `flags` : UInt, `propertyvalue` : /* Rust *const */ kotlinx.cinterop.CPointer<`EVT_VARIANT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wevtapi.dll, ABI=system, export=EvtSubscribe; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EvtSubscribe`(`session` : `EVT_HANDLE`, `signalevent` : `super`.`super`.`Foundation`.`HANDLE`, `channelpath` : `windows_sys`.`core`.`PCWSTR`, `query` : `windows_sys`.`core`.`PCWSTR`, `bookmark` : `EVT_HANDLE`, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `callback` : `EVT_SUBSCRIBE_CALLBACK`, `flags` : UInt) : `EVT_HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=wevtapi.dll, ABI=system, export=EvtUpdateBookmark; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EvtUpdateBookmark`(`bookmark` : `EVT_HANDLE`, `event` : `EVT_HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=GetEventLogInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetEventLogInformation`(`heventlog` : `super`.`super`.`Foundation`.`HANDLE`, `dwinfolevel` : UInt, `lpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbbufsize` : UInt, `pcbbytesneeded` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=GetNumberOfEventLogRecords; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetNumberOfEventLogRecords`(`heventlog` : `super`.`super`.`Foundation`.`HANDLE`, `numberofrecords` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=GetOldestEventLogRecord; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetOldestEventLogRecord`(`heventlog` : `super`.`super`.`Foundation`.`HANDLE`, `oldestrecord` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=NotifyChangeEventLog; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `NotifyChangeEventLog`(`heventlog` : `super`.`super`.`Foundation`.`HANDLE`, `hevent` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=OpenBackupEventLogA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OpenBackupEventLogA`(`lpuncservername` : `windows_sys`.`core`.`PCSTR`, `lpfilename` : `windows_sys`.`core`.`PCSTR`) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=OpenBackupEventLogW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OpenBackupEventLogW`(`lpuncservername` : `windows_sys`.`core`.`PCWSTR`, `lpfilename` : `windows_sys`.`core`.`PCWSTR`) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=OpenEventLogA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OpenEventLogA`(`lpuncservername` : `windows_sys`.`core`.`PCSTR`, `lpsourcename` : `windows_sys`.`core`.`PCSTR`) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=OpenEventLogW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OpenEventLogW`(`lpuncservername` : `windows_sys`.`core`.`PCWSTR`, `lpsourcename` : `windows_sys`.`core`.`PCWSTR`) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=ReadEventLogA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ReadEventLogA`(`heventlog` : `super`.`super`.`Foundation`.`HANDLE`, `dwreadflags` : `READ_EVENT_LOG_READ_FLAGS`, `dwrecordoffset` : UInt, `lpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `nnumberofbytestoread` : UInt, `pnbytesread` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pnminnumberofbytesneeded` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=ReadEventLogW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ReadEventLogW`(`heventlog` : `super`.`super`.`Foundation`.`HANDLE`, `dwreadflags` : `READ_EVENT_LOG_READ_FLAGS`, `dwrecordoffset` : UInt, `lpbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `nnumberofbytestoread` : UInt, `pnbytesread` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `pnminnumberofbytesneeded` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegisterEventSourceA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegisterEventSourceA`(`lpuncservername` : `windows_sys`.`core`.`PCSTR`, `lpsourcename` : `windows_sys`.`core`.`PCSTR`) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegisterEventSourceW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegisterEventSourceW`(`lpuncservername` : `windows_sys`.`core`.`PCWSTR`, `lpsourcename` : `windows_sys`.`core`.`PCWSTR`) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=ReportEventA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `ReportEventA`(`heventlog` : `super`.`super`.`Foundation`.`HANDLE`, `wtype` : `REPORT_EVENT_TYPE`, `wcategory` : UShort, `dweventid` : UInt, `lpusersid` : `super`.`super`.`Security`.`PSID`, `wnumstrings` : UShort, `dwdatasize` : UInt, `lpstrings` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCSTR`>?, `lprawdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=ReportEventW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `ReportEventW`(`heventlog` : `super`.`super`.`Foundation`.`HANDLE`, `wtype` : `REPORT_EVENT_TYPE`, `wcategory` : UShort, `dweventid` : UInt, `lpusersid` : `super`.`super`.`Security`.`PSID`, `wnumstrings` : UShort, `dwdatasize` : UInt, `lpstrings` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCWSTR`>?, `lprawdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EVENTLOGRECORD` (
    public var `Length`: UInt,
    public var `Reserved`: UInt,
    public var `RecordNumber`: UInt,
    public var `TimeGenerated`: UInt,
    public var `TimeWritten`: UInt,
    public var `EventID`: UInt,
    public var `EventType`: `REPORT_EVENT_TYPE`,
    public var `NumStrings`: UShort,
    public var `EventCategory`: UShort,
    public var `ReservedFlags`: UShort,
    public var `ClosingRecordNumber`: UInt,
    public var `StringOffset`: UInt,
    public var `UserSidLength`: UInt,
    public var `UserSidOffset`: UInt,
    public var `DataLength`: UInt,
    public var `DataOffset`: UInt,
)
public const val `EVENTLOG_AUDIT_FAILURE`: `REPORT_EVENT_TYPE` = 16u;
public const val `EVENTLOG_AUDIT_SUCCESS`: `REPORT_EVENT_TYPE` = 8u;
public const val `EVENTLOG_ERROR_TYPE`: `REPORT_EVENT_TYPE` = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EVENTLOG_FULL_INFORMATION` (
    public var `dwFull`: UInt,
)
public const val `EVENTLOG_INFORMATION_TYPE`: `REPORT_EVENT_TYPE` = 4u;
public const val `EVENTLOG_SEEK_READ`: `READ_EVENT_LOG_READ_FLAGS` = 2u;
public const val `EVENTLOG_SEQUENTIAL_READ`: `READ_EVENT_LOG_READ_FLAGS` = 1u;
public const val `EVENTLOG_SUCCESS`: `REPORT_EVENT_TYPE` = 0u;
public const val `EVENTLOG_WARNING_TYPE`: `REPORT_EVENT_TYPE` = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `EVENTSFORLOGFILE` (
    public var `ulSize`: UInt,
    public var `szLogicalLogFile`: UShortArray,
    public var `ulNumRecords`: UInt,
    public var `pEventLogRecords`: Array<`EVENTLOGRECORD`>,
)
// UNSUPPORTED Rust 108:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for EVENTSFORLOGFILE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `EVT_ALL_ACCESS`: UInt = 7u;
public typealias `EVT_CHANNEL_CLOCK_TYPE` = Int;
public typealias `EVT_CHANNEL_CONFIG_PROPERTY_ID` = Int;
public typealias `EVT_CHANNEL_ISOLATION_TYPE` = Int;
public typealias `EVT_CHANNEL_REFERENCE_FLAGS` = UInt;
public typealias `EVT_CHANNEL_SID_TYPE` = Int;
public typealias `EVT_CHANNEL_TYPE` = Int;
public const val `EVT_CLEAR_ACCESS`: UInt = 4u;
public typealias `EVT_EVENT_METADATA_PROPERTY_ID` = Int;
public typealias `EVT_EVENT_PROPERTY_ID` = Int;
public typealias `EVT_EXPORTLOG_FLAGS` = UInt;
public typealias `EVT_FORMAT_MESSAGE_FLAGS` = UInt;
public typealias `EVT_HANDLE` = Long;
public typealias `EVT_LOGIN_CLASS` = Int;
public typealias `EVT_LOG_PROPERTY_ID` = Int;
public typealias `EVT_OPEN_LOG_FLAGS` = UInt;
public typealias `EVT_PUBLISHER_METADATA_PROPERTY_ID` = Int;
public typealias `EVT_QUERY_FLAGS` = UInt;
public typealias `EVT_QUERY_PROPERTY_ID` = Int;
public const val `EVT_READ_ACCESS`: UInt = 1u;
public typealias `EVT_RENDER_CONTEXT_FLAGS` = UInt;
public typealias `EVT_RENDER_FLAGS` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `EVT_RPC_LOGIN` (
    public var `Server`: `windows_sys`.`core`.`PWSTR`,
    public var `User`: `windows_sys`.`core`.`PWSTR`,
    public var `Domain`: `windows_sys`.`core`.`PWSTR`,
    public var `Password`: `windows_sys`.`core`.`PWSTR`,
    public var `Flags`: UInt,
)
// UNSUPPORTED Rust 144:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for EVT_RPC_LOGIN {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `EVT_RPC_LOGIN_FLAGS` = UInt;
public typealias `EVT_SEEK_FLAGS` = UInt;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `EVT_SUBSCRIBE_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`EVT_SUBSCRIBE_NOTIFY_ACTION`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `EVT_HANDLE`) -> UInt>>>;
public typealias `EVT_SUBSCRIBE_FLAGS` = UInt;
public typealias `EVT_SUBSCRIBE_NOTIFY_ACTION` = Int;
public typealias `EVT_SYSTEM_PROPERTY_ID` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `EVT_VARIANT` (
    public var `Anonymous`: `EVT_VARIANT_0`,
    public var `Count`: UInt,
    public var `Type`: UInt,
)
// UNSUPPORTED Rust 163:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for EVT_VARIANT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 169:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub union EVT_VARIANT_0 {
//     pub BooleanVal: windows_sys::core::BOOL,
//     pub SByteVal: i8,
//     pub Int16Val: i16,
//     pub Int32Val: i32,
//     pub Int64Val: i64,
//     pub ByteVal: u8,
//     pub UInt16Val: u16,
//     pub UInt32Val: u32,
//     pub UInt64Val: u64,
//     pub SingleVal: f32,
//     pub DoubleVal: f64,
//     pub FileTimeVal: u64,
//     pub SysTimeVal: *mut super::super::Foundation::SYSTEMTIME,
//     pub GuidVal: *mut windows_sys::core::GUID,
//     pub StringVal: windows_sys::core::PCWSTR,
//     pub AnsiStringVal: windows_sys::core::PCSTR,
//     pub BinaryVal: *mut u8,
//     pub SidVal: super::super::Security::PSID,
//     pub SizeTVal: usize,
//     pub BooleanArr: *mut windows_sys::core::BOOL,
//     pub SByteArr: *mut i8,
//     pub Int16Arr: *mut i16,
//     pub Int32Arr: *mut i32,
//     pub Int64Arr: *mut i64,
//     pub ByteArr: *mut u8,
//     pub UInt16Arr: *mut u16,
//     pub UInt32Arr: *mut u32,
//     pub UInt64Arr: *mut u64,
//     pub SingleArr: *mut f32,
//     pub DoubleArr: *mut f64,
//     pub FileTimeArr: *mut super::super::Foundation::FILETIME,
//     pub SysTimeArr: *mut super::super::Foundation::SYSTEMTIME,
//     pub GuidArr: *mut windows_sys::core::GUID,
//     pub StringArr: *mut windows_sys::core::PWSTR,
//     pub AnsiStringArr: *mut windows_sys::core::PSTR,
//     pub SidArr: *mut super::super::Security::PSID,
//     pub SizeTArr: *mut usize,
//     pub EvtHandleVal: EVT_HANDLE,
//     pub XmlVal: windows_sys::core::PCWSTR,
//     pub XmlValArr: *const windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 214:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Security")]
// impl Default for EVT_VARIANT_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `EVT_VARIANT_TYPE` = Int;
public const val `EVT_VARIANT_TYPE_ARRAY`: UInt = 128u;
public const val `EVT_VARIANT_TYPE_MASK`: UInt = 127u;
public const val `EVT_WRITE_ACCESS`: UInt = 2u;
public const val `EventMetadataEventChannel`: `EVT_EVENT_METADATA_PROPERTY_ID` = 2;
public const val `EventMetadataEventID`: `EVT_EVENT_METADATA_PROPERTY_ID` = 0;
public const val `EventMetadataEventKeyword`: `EVT_EVENT_METADATA_PROPERTY_ID` = 6;
public const val `EventMetadataEventLevel`: `EVT_EVENT_METADATA_PROPERTY_ID` = 3;
public const val `EventMetadataEventMessageID`: `EVT_EVENT_METADATA_PROPERTY_ID` = 7;
public const val `EventMetadataEventOpcode`: `EVT_EVENT_METADATA_PROPERTY_ID` = 4;
public const val `EventMetadataEventTask`: `EVT_EVENT_METADATA_PROPERTY_ID` = 5;
public const val `EventMetadataEventTemplate`: `EVT_EVENT_METADATA_PROPERTY_ID` = 8;
public const val `EventMetadataEventVersion`: `EVT_EVENT_METADATA_PROPERTY_ID` = 1;
public const val `EvtChannelClockTypeQPC`: `EVT_CHANNEL_CLOCK_TYPE` = 1;
public const val `EvtChannelClockTypeSystemTime`: `EVT_CHANNEL_CLOCK_TYPE` = 0;
public const val `EvtChannelConfigAccess`: `EVT_CHANNEL_CONFIG_PROPERTY_ID` = 5;
public const val `EvtChannelConfigClassicEventlog`: `EVT_CHANNEL_CONFIG_PROPERTY_ID` = 4;
public const val `EvtChannelConfigEnabled`: `EVT_CHANNEL_CONFIG_PROPERTY_ID` = 0;
public const val `EvtChannelConfigIsolation`: `EVT_CHANNEL_CONFIG_PROPERTY_ID` = 1;
public const val `EvtChannelConfigOwningPublisher`: `EVT_CHANNEL_CONFIG_PROPERTY_ID` = 3;
public const val `EvtChannelConfigPropertyIdEND`: `EVT_CHANNEL_CONFIG_PROPERTY_ID` = 21;
public const val `EvtChannelConfigType`: `EVT_CHANNEL_CONFIG_PROPERTY_ID` = 2;
public const val `EvtChannelIsolationTypeApplication`: `EVT_CHANNEL_ISOLATION_TYPE` = 0;
public const val `EvtChannelIsolationTypeCustom`: `EVT_CHANNEL_ISOLATION_TYPE` = 2;
public const val `EvtChannelIsolationTypeSystem`: `EVT_CHANNEL_ISOLATION_TYPE` = 1;
public const val `EvtChannelLoggingConfigAutoBackup`: `EVT_CHANNEL_CONFIG_PROPERTY_ID` = 7;
public const val `EvtChannelLoggingConfigLogFilePath`: `EVT_CHANNEL_CONFIG_PROPERTY_ID` = 9;
public const val `EvtChannelLoggingConfigMaxSize`: `EVT_CHANNEL_CONFIG_PROPERTY_ID` = 8;
public const val `EvtChannelLoggingConfigRetention`: `EVT_CHANNEL_CONFIG_PROPERTY_ID` = 6;
public const val `EvtChannelPublisherList`: `EVT_CHANNEL_CONFIG_PROPERTY_ID` = 19;
public const val `EvtChannelPublishingConfigBufferSize`: `EVT_CHANNEL_CONFIG_PROPERTY_ID` = 13;
public const val `EvtChannelPublishingConfigClockType`: `EVT_CHANNEL_CONFIG_PROPERTY_ID` = 17;
public const val `EvtChannelPublishingConfigControlGuid`: `EVT_CHANNEL_CONFIG_PROPERTY_ID` = 12;
public const val `EvtChannelPublishingConfigFileMax`: `EVT_CHANNEL_CONFIG_PROPERTY_ID` = 20;
public const val `EvtChannelPublishingConfigKeywords`: `EVT_CHANNEL_CONFIG_PROPERTY_ID` = 11;
public const val `EvtChannelPublishingConfigLatency`: `EVT_CHANNEL_CONFIG_PROPERTY_ID` = 16;
public const val `EvtChannelPublishingConfigLevel`: `EVT_CHANNEL_CONFIG_PROPERTY_ID` = 10;
public const val `EvtChannelPublishingConfigMaxBuffers`: `EVT_CHANNEL_CONFIG_PROPERTY_ID` = 15;
public const val `EvtChannelPublishingConfigMinBuffers`: `EVT_CHANNEL_CONFIG_PROPERTY_ID` = 14;
public const val `EvtChannelPublishingConfigSidType`: `EVT_CHANNEL_CONFIG_PROPERTY_ID` = 18;
public const val `EvtChannelReferenceImported`: `EVT_CHANNEL_REFERENCE_FLAGS` = 1u;
public const val `EvtChannelSidTypeNone`: `EVT_CHANNEL_SID_TYPE` = 0;
public const val `EvtChannelSidTypePublishing`: `EVT_CHANNEL_SID_TYPE` = 1;
public const val `EvtChannelTypeAdmin`: `EVT_CHANNEL_TYPE` = 0;
public const val `EvtChannelTypeAnalytic`: `EVT_CHANNEL_TYPE` = 2;
public const val `EvtChannelTypeDebug`: `EVT_CHANNEL_TYPE` = 3;
public const val `EvtChannelTypeOperational`: `EVT_CHANNEL_TYPE` = 1;
public const val `EvtEventMetadataPropertyIdEND`: `EVT_EVENT_METADATA_PROPERTY_ID` = 9;
public const val `EvtEventPath`: `EVT_EVENT_PROPERTY_ID` = 1;
public const val `EvtEventPropertyIdEND`: `EVT_EVENT_PROPERTY_ID` = 2;
public const val `EvtEventQueryIDs`: `EVT_EVENT_PROPERTY_ID` = 0;
public const val `EvtExportLogChannelPath`: `EVT_EXPORTLOG_FLAGS` = 1u;
public const val `EvtExportLogFilePath`: `EVT_EXPORTLOG_FLAGS` = 2u;
public const val `EvtExportLogOverwrite`: `EVT_EXPORTLOG_FLAGS` = 8192u;
public const val `EvtExportLogTolerateQueryErrors`: `EVT_EXPORTLOG_FLAGS` = 4096u;
public const val `EvtFormatMessageChannel`: `EVT_FORMAT_MESSAGE_FLAGS` = 6u;
public const val `EvtFormatMessageEvent`: `EVT_FORMAT_MESSAGE_FLAGS` = 1u;
public const val `EvtFormatMessageId`: `EVT_FORMAT_MESSAGE_FLAGS` = 8u;
public const val `EvtFormatMessageKeyword`: `EVT_FORMAT_MESSAGE_FLAGS` = 5u;
public const val `EvtFormatMessageLevel`: `EVT_FORMAT_MESSAGE_FLAGS` = 2u;
public const val `EvtFormatMessageOpcode`: `EVT_FORMAT_MESSAGE_FLAGS` = 4u;
public const val `EvtFormatMessageProvider`: `EVT_FORMAT_MESSAGE_FLAGS` = 7u;
public const val `EvtFormatMessageTask`: `EVT_FORMAT_MESSAGE_FLAGS` = 3u;
public const val `EvtFormatMessageXml`: `EVT_FORMAT_MESSAGE_FLAGS` = 9u;
public const val `EvtLogAttributes`: `EVT_LOG_PROPERTY_ID` = 4;
public const val `EvtLogCreationTime`: `EVT_LOG_PROPERTY_ID` = 0;
public const val `EvtLogFileSize`: `EVT_LOG_PROPERTY_ID` = 3;
public const val `EvtLogFull`: `EVT_LOG_PROPERTY_ID` = 7;
public const val `EvtLogLastAccessTime`: `EVT_LOG_PROPERTY_ID` = 1;
public const val `EvtLogLastWriteTime`: `EVT_LOG_PROPERTY_ID` = 2;
public const val `EvtLogNumberOfLogRecords`: `EVT_LOG_PROPERTY_ID` = 5;
public const val `EvtLogOldestRecordNumber`: `EVT_LOG_PROPERTY_ID` = 6;
public const val `EvtOpenChannelPath`: `EVT_OPEN_LOG_FLAGS` = 1u;
public const val `EvtOpenFilePath`: `EVT_OPEN_LOG_FLAGS` = 2u;
public const val `EvtPublisherMetadataChannelReferenceFlags`: `EVT_PUBLISHER_METADATA_PROPERTY_ID` = 10;
public const val `EvtPublisherMetadataChannelReferenceID`: `EVT_PUBLISHER_METADATA_PROPERTY_ID` = 9;
public const val `EvtPublisherMetadataChannelReferenceIndex`: `EVT_PUBLISHER_METADATA_PROPERTY_ID` = 8;
public const val `EvtPublisherMetadataChannelReferenceMessageID`: `EVT_PUBLISHER_METADATA_PROPERTY_ID` = 11;
public const val `EvtPublisherMetadataChannelReferencePath`: `EVT_PUBLISHER_METADATA_PROPERTY_ID` = 7;
public const val `EvtPublisherMetadataChannelReferences`: `EVT_PUBLISHER_METADATA_PROPERTY_ID` = 6;
public const val `EvtPublisherMetadataHelpLink`: `EVT_PUBLISHER_METADATA_PROPERTY_ID` = 4;
public const val `EvtPublisherMetadataKeywordMessageID`: `EVT_PUBLISHER_METADATA_PROPERTY_ID` = 28;
public const val `EvtPublisherMetadataKeywordName`: `EVT_PUBLISHER_METADATA_PROPERTY_ID` = 26;
public const val `EvtPublisherMetadataKeywordValue`: `EVT_PUBLISHER_METADATA_PROPERTY_ID` = 27;
public const val `EvtPublisherMetadataKeywords`: `EVT_PUBLISHER_METADATA_PROPERTY_ID` = 25;
public const val `EvtPublisherMetadataLevelMessageID`: `EVT_PUBLISHER_METADATA_PROPERTY_ID` = 15;
public const val `EvtPublisherMetadataLevelName`: `EVT_PUBLISHER_METADATA_PROPERTY_ID` = 13;
public const val `EvtPublisherMetadataLevelValue`: `EVT_PUBLISHER_METADATA_PROPERTY_ID` = 14;
public const val `EvtPublisherMetadataLevels`: `EVT_PUBLISHER_METADATA_PROPERTY_ID` = 12;
public const val `EvtPublisherMetadataMessageFilePath`: `EVT_PUBLISHER_METADATA_PROPERTY_ID` = 3;
public const val `EvtPublisherMetadataOpcodeMessageID`: `EVT_PUBLISHER_METADATA_PROPERTY_ID` = 24;
public const val `EvtPublisherMetadataOpcodeName`: `EVT_PUBLISHER_METADATA_PROPERTY_ID` = 22;
public const val `EvtPublisherMetadataOpcodeValue`: `EVT_PUBLISHER_METADATA_PROPERTY_ID` = 23;
public const val `EvtPublisherMetadataOpcodes`: `EVT_PUBLISHER_METADATA_PROPERTY_ID` = 21;
public const val `EvtPublisherMetadataParameterFilePath`: `EVT_PUBLISHER_METADATA_PROPERTY_ID` = 2;
public const val `EvtPublisherMetadataPropertyIdEND`: `EVT_PUBLISHER_METADATA_PROPERTY_ID` = 29;
public const val `EvtPublisherMetadataPublisherGuid`: `EVT_PUBLISHER_METADATA_PROPERTY_ID` = 0;
public const val `EvtPublisherMetadataPublisherMessageID`: `EVT_PUBLISHER_METADATA_PROPERTY_ID` = 5;
public const val `EvtPublisherMetadataResourceFilePath`: `EVT_PUBLISHER_METADATA_PROPERTY_ID` = 1;
public const val `EvtPublisherMetadataTaskEventGuid`: `EVT_PUBLISHER_METADATA_PROPERTY_ID` = 18;
public const val `EvtPublisherMetadataTaskMessageID`: `EVT_PUBLISHER_METADATA_PROPERTY_ID` = 20;
public const val `EvtPublisherMetadataTaskName`: `EVT_PUBLISHER_METADATA_PROPERTY_ID` = 17;
public const val `EvtPublisherMetadataTaskValue`: `EVT_PUBLISHER_METADATA_PROPERTY_ID` = 19;
public const val `EvtPublisherMetadataTasks`: `EVT_PUBLISHER_METADATA_PROPERTY_ID` = 16;
public const val `EvtQueryChannelPath`: `EVT_QUERY_FLAGS` = 1u;
public const val `EvtQueryFilePath`: `EVT_QUERY_FLAGS` = 2u;
public const val `EvtQueryForwardDirection`: `EVT_QUERY_FLAGS` = 256u;
public const val `EvtQueryNames`: `EVT_QUERY_PROPERTY_ID` = 0;
public const val `EvtQueryPropertyIdEND`: `EVT_QUERY_PROPERTY_ID` = 2;
public const val `EvtQueryReverseDirection`: `EVT_QUERY_FLAGS` = 512u;
public const val `EvtQueryStatuses`: `EVT_QUERY_PROPERTY_ID` = 1;
public const val `EvtQueryTolerateQueryErrors`: `EVT_QUERY_FLAGS` = 4096u;
public const val `EvtRenderBookmark`: `EVT_RENDER_FLAGS` = 2u;
public const val `EvtRenderContextSystem`: `EVT_RENDER_CONTEXT_FLAGS` = 1u;
public const val `EvtRenderContextUser`: `EVT_RENDER_CONTEXT_FLAGS` = 2u;
public const val `EvtRenderContextValues`: `EVT_RENDER_CONTEXT_FLAGS` = 0u;
public const val `EvtRenderEventValues`: `EVT_RENDER_FLAGS` = 0u;
public const val `EvtRenderEventXml`: `EVT_RENDER_FLAGS` = 1u;
public const val `EvtRpcLogin`: `EVT_LOGIN_CLASS` = 1;
public const val `EvtRpcLoginAuthDefault`: `EVT_RPC_LOGIN_FLAGS` = 0u;
public const val `EvtRpcLoginAuthKerberos`: `EVT_RPC_LOGIN_FLAGS` = 2u;
public const val `EvtRpcLoginAuthNTLM`: `EVT_RPC_LOGIN_FLAGS` = 3u;
public const val `EvtRpcLoginAuthNegotiate`: `EVT_RPC_LOGIN_FLAGS` = 1u;
public const val `EvtSeekOriginMask`: `EVT_SEEK_FLAGS` = 7u;
public const val `EvtSeekRelativeToBookmark`: `EVT_SEEK_FLAGS` = 4u;
public const val `EvtSeekRelativeToCurrent`: `EVT_SEEK_FLAGS` = 3u;
public const val `EvtSeekRelativeToFirst`: `EVT_SEEK_FLAGS` = 1u;
public const val `EvtSeekRelativeToLast`: `EVT_SEEK_FLAGS` = 2u;
public const val `EvtSeekStrict`: `EVT_SEEK_FLAGS` = 65536u;
public const val `EvtSubscribeActionDeliver`: `EVT_SUBSCRIBE_NOTIFY_ACTION` = 1;
public const val `EvtSubscribeActionError`: `EVT_SUBSCRIBE_NOTIFY_ACTION` = 0;
public const val `EvtSubscribeOriginMask`: `EVT_SUBSCRIBE_FLAGS` = 3u;
public const val `EvtSubscribeStartAfterBookmark`: `EVT_SUBSCRIBE_FLAGS` = 3u;
public const val `EvtSubscribeStartAtOldestRecord`: `EVT_SUBSCRIBE_FLAGS` = 2u;
public const val `EvtSubscribeStrict`: `EVT_SUBSCRIBE_FLAGS` = 65536u;
public const val `EvtSubscribeToFutureEvents`: `EVT_SUBSCRIBE_FLAGS` = 1u;
public const val `EvtSubscribeTolerateQueryErrors`: `EVT_SUBSCRIBE_FLAGS` = 4096u;
public const val `EvtSystemActivityID`: `EVT_SYSTEM_PROPERTY_ID` = 10;
public const val `EvtSystemChannel`: `EVT_SYSTEM_PROPERTY_ID` = 14;
public const val `EvtSystemComputer`: `EVT_SYSTEM_PROPERTY_ID` = 15;
public const val `EvtSystemEventID`: `EVT_SYSTEM_PROPERTY_ID` = 2;
public const val `EvtSystemEventRecordId`: `EVT_SYSTEM_PROPERTY_ID` = 9;
public const val `EvtSystemKeywords`: `EVT_SYSTEM_PROPERTY_ID` = 7;
public const val `EvtSystemLevel`: `EVT_SYSTEM_PROPERTY_ID` = 4;
public const val `EvtSystemOpcode`: `EVT_SYSTEM_PROPERTY_ID` = 6;
public const val `EvtSystemProcessID`: `EVT_SYSTEM_PROPERTY_ID` = 12;
public const val `EvtSystemPropertyIdEND`: `EVT_SYSTEM_PROPERTY_ID` = 18;
public const val `EvtSystemProviderGuid`: `EVT_SYSTEM_PROPERTY_ID` = 1;
public const val `EvtSystemProviderName`: `EVT_SYSTEM_PROPERTY_ID` = 0;
public const val `EvtSystemQualifiers`: `EVT_SYSTEM_PROPERTY_ID` = 3;
public const val `EvtSystemRelatedActivityID`: `EVT_SYSTEM_PROPERTY_ID` = 11;
public const val `EvtSystemTask`: `EVT_SYSTEM_PROPERTY_ID` = 5;
public const val `EvtSystemThreadID`: `EVT_SYSTEM_PROPERTY_ID` = 13;
public const val `EvtSystemTimeCreated`: `EVT_SYSTEM_PROPERTY_ID` = 8;
public const val `EvtSystemUserID`: `EVT_SYSTEM_PROPERTY_ID` = 16;
public const val `EvtSystemVersion`: `EVT_SYSTEM_PROPERTY_ID` = 17;
public const val `EvtVarTypeAnsiString`: `EVT_VARIANT_TYPE` = 2;
public const val `EvtVarTypeBinary`: `EVT_VARIANT_TYPE` = 14;
public const val `EvtVarTypeBoolean`: `EVT_VARIANT_TYPE` = 13;
public const val `EvtVarTypeByte`: `EVT_VARIANT_TYPE` = 4;
public const val `EvtVarTypeDouble`: `EVT_VARIANT_TYPE` = 12;
public const val `EvtVarTypeEvtHandle`: `EVT_VARIANT_TYPE` = 32;
public const val `EvtVarTypeEvtXml`: `EVT_VARIANT_TYPE` = 35;
public const val `EvtVarTypeFileTime`: `EVT_VARIANT_TYPE` = 17;
public const val `EvtVarTypeGuid`: `EVT_VARIANT_TYPE` = 15;
public const val `EvtVarTypeHexInt32`: `EVT_VARIANT_TYPE` = 20;
public const val `EvtVarTypeHexInt64`: `EVT_VARIANT_TYPE` = 21;
public const val `EvtVarTypeInt16`: `EVT_VARIANT_TYPE` = 5;
public const val `EvtVarTypeInt32`: `EVT_VARIANT_TYPE` = 7;
public const val `EvtVarTypeInt64`: `EVT_VARIANT_TYPE` = 9;
public const val `EvtVarTypeNull`: `EVT_VARIANT_TYPE` = 0;
public const val `EvtVarTypeSByte`: `EVT_VARIANT_TYPE` = 3;
public const val `EvtVarTypeSid`: `EVT_VARIANT_TYPE` = 19;
public const val `EvtVarTypeSingle`: `EVT_VARIANT_TYPE` = 11;
public const val `EvtVarTypeSizeT`: `EVT_VARIANT_TYPE` = 16;
public const val `EvtVarTypeString`: `EVT_VARIANT_TYPE` = 1;
public const val `EvtVarTypeSysTime`: `EVT_VARIANT_TYPE` = 18;
public const val `EvtVarTypeUInt16`: `EVT_VARIANT_TYPE` = 6;
public const val `EvtVarTypeUInt32`: `EVT_VARIANT_TYPE` = 8;
public const val `EvtVarTypeUInt64`: `EVT_VARIANT_TYPE` = 10;
public typealias `READ_EVENT_LOG_READ_FLAGS` = UInt;
public typealias `REPORT_EVENT_TYPE` = UShort;
