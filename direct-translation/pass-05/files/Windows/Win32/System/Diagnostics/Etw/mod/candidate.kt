// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=CloseTrace; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CloseTrace`(`tracehandle` : `PROCESSTRACE_HANDLE`) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=ControlTraceA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ControlTraceA`(`tracehandle` : `CONTROLTRACE_HANDLE`, `instancename` : `windows_sys`.`core`.`PCSTR`, `properties` : /* Rust *mut */ kotlinx.cinterop.CPointer<`EVENT_TRACE_PROPERTIES`>?, `controlcode` : `EVENT_TRACE_CONTROL`) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=ControlTraceW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ControlTraceW`(`tracehandle` : `CONTROLTRACE_HANDLE`, `instancename` : `windows_sys`.`core`.`PCWSTR`, `properties` : /* Rust *mut */ kotlinx.cinterop.CPointer<`EVENT_TRACE_PROPERTIES`>?, `controlcode` : `EVENT_TRACE_CONTROL`) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=CreateTraceInstanceId; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreateTraceInstanceId`(`reghandle` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `instinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`EVENT_INSTANCE_INFO`>?) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=CveEventWrite; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CveEventWrite`(`cveid` : `windows_sys`.`core`.`PCWSTR`, `additionaldetails` : `windows_sys`.`core`.`PCWSTR`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=EnableTrace; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnableTrace`(`enable` : UInt, `enableflag` : UInt, `enablelevel` : UInt, `controlguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `tracehandle` : `CONTROLTRACE_HANDLE`) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=EnableTraceEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnableTraceEx`(`providerid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `sourceid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `tracehandle` : `CONTROLTRACE_HANDLE`, `isenabled` : UInt, `level` : UByte, `matchanykeyword` : ULong, `matchallkeyword` : ULong, `enableproperty` : UInt, `enablefilterdesc` : /* Rust *const */ kotlinx.cinterop.CPointer<`EVENT_FILTER_DESCRIPTOR`>?) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=EnableTraceEx2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnableTraceEx2`(`tracehandle` : `CONTROLTRACE_HANDLE`, `providerid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `controlcode` : UInt, `level` : UByte, `matchanykeyword` : ULong, `matchallkeyword` : ULong, `timeout` : UInt, `enableparameters` : /* Rust *const */ kotlinx.cinterop.CPointer<`ENABLE_TRACE_PARAMETERS`>?) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=EnumerateTraceGuids; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumerateTraceGuids`(`guidpropertiesarray` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`TRACE_GUID_PROPERTIES`>>?, `propertyarraycount` : UInt, `guidcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=EnumerateTraceGuidsEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EnumerateTraceGuidsEx`(`tracequeryinfoclass` : `TRACE_QUERY_INFO_CLASS`, `inbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `inbuffersize` : UInt, `outbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `outbuffersize` : UInt, `returnlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=EventAccessControl; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `EventAccessControl`(`guid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `operation` : UInt, `sid` : `super`.`super`.`super`.`Security`.`PSID`, `rights` : UInt, `allowordeny` : Boolean) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=EventAccessQuery; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `EventAccessQuery`(`guid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `buffer` : `super`.`super`.`super`.`Security`.`PSECURITY_DESCRIPTOR`, `buffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=EventAccessRemove; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EventAccessRemove`(`guid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=EventActivityIdControl; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EventActivityIdControl`(`controlcode` : UInt, `activityid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=EventEnabled; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EventEnabled`(`reghandle` : `REGHANDLE`, `eventdescriptor` : /* Rust *const */ kotlinx.cinterop.CPointer<`EVENT_DESCRIPTOR`>?) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=EventProviderEnabled; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EventProviderEnabled`(`reghandle` : `REGHANDLE`, `level` : UByte, `keyword` : ULong) : Boolean
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=EventRegister; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EventRegister`(`providerid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `enablecallback` : `PENABLECALLBACK`, `callbackcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `reghandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`REGHANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=EventSetInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EventSetInformation`(`reghandle` : `REGHANDLE`, `informationclass` : `EVENT_INFO_CLASS`, `eventinformation` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `informationlength` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=EventUnregister; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EventUnregister`(`reghandle` : `REGHANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=EventWrite; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EventWrite`(`reghandle` : `REGHANDLE`, `eventdescriptor` : /* Rust *const */ kotlinx.cinterop.CPointer<`EVENT_DESCRIPTOR`>?, `userdatacount` : UInt, `userdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`EVENT_DATA_DESCRIPTOR`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=EventWriteEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EventWriteEx`(`reghandle` : `REGHANDLE`, `eventdescriptor` : /* Rust *const */ kotlinx.cinterop.CPointer<`EVENT_DESCRIPTOR`>?, `filter` : ULong, `flags` : UInt, `activityid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `relatedactivityid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `userdatacount` : UInt, `userdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`EVENT_DATA_DESCRIPTOR`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=EventWriteString; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EventWriteString`(`reghandle` : `REGHANDLE`, `level` : UByte, `keyword` : ULong, `string` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=EventWriteTransfer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `EventWriteTransfer`(`reghandle` : `REGHANDLE`, `eventdescriptor` : /* Rust *const */ kotlinx.cinterop.CPointer<`EVENT_DESCRIPTOR`>?, `activityid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `relatedactivityid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `userdatacount` : UInt, `userdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`EVENT_DATA_DESCRIPTOR`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=FlushTraceA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FlushTraceA`(`tracehandle` : `CONTROLTRACE_HANDLE`, `instancename` : `windows_sys`.`core`.`PCSTR`, `properties` : /* Rust *mut */ kotlinx.cinterop.CPointer<`EVENT_TRACE_PROPERTIES`>?) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=FlushTraceW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FlushTraceW`(`tracehandle` : `CONTROLTRACE_HANDLE`, `instancename` : `windows_sys`.`core`.`PCWSTR`, `properties` : /* Rust *mut */ kotlinx.cinterop.CPointer<`EVENT_TRACE_PROPERTIES`>?) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=GetTraceEnableFlags; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetTraceEnableFlags`(`tracehandle` : ULong) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=GetTraceEnableLevel; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetTraceEnableLevel`(`tracehandle` : ULong) : UByte
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=GetTraceLoggerHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetTraceLoggerHandle`(`buffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=OpenTraceA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Time")]
public external fun `OpenTraceA`(`logfile` : /* Rust *mut */ kotlinx.cinterop.CPointer<`EVENT_TRACE_LOGFILEA`>?) : `PROCESSTRACE_HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=OpenTraceFromBufferStream; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Time")]
public external fun `OpenTraceFromBufferStream`(`options` : /* Rust *const */ kotlinx.cinterop.CPointer<`ETW_OPEN_TRACE_OPTIONS`>?, `buffercompletioncallback` : `PETW_BUFFER_COMPLETION_CALLBACK`, `buffercompletioncontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=OpenTraceFromFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Time")]
public external fun `OpenTraceFromFile`(`logfilename` : `windows_sys`.`core`.`PCWSTR`, `options` : /* Rust *const */ kotlinx.cinterop.CPointer<`ETW_OPEN_TRACE_OPTIONS`>?, `logfileheader` : /* Rust *mut */ kotlinx.cinterop.CPointer<`TRACE_LOGFILE_HEADER`>?) : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=OpenTraceFromRealTimeLogger; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Time")]
public external fun `OpenTraceFromRealTimeLogger`(`loggername` : `windows_sys`.`core`.`PCWSTR`, `options` : /* Rust *const */ kotlinx.cinterop.CPointer<`ETW_OPEN_TRACE_OPTIONS`>?, `logfileheader` : /* Rust *mut */ kotlinx.cinterop.CPointer<`TRACE_LOGFILE_HEADER`>?) : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=OpenTraceFromRealTimeLoggerWithAllocationOptions; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Time")]
public external fun `OpenTraceFromRealTimeLoggerWithAllocationOptions`(`loggername` : `windows_sys`.`core`.`PCWSTR`, `options` : /* Rust *const */ kotlinx.cinterop.CPointer<`ETW_OPEN_TRACE_OPTIONS`>?, `allocationsize` : ULong, `memorypartitionhandle` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `logfileheader` : /* Rust *mut */ kotlinx.cinterop.CPointer<`TRACE_LOGFILE_HEADER`>?) : ULong
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=OpenTraceW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Time")]
public external fun `OpenTraceW`(`logfile` : /* Rust *mut */ kotlinx.cinterop.CPointer<`EVENT_TRACE_LOGFILEW`>?) : `PROCESSTRACE_HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=ProcessTrace; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ProcessTrace`(`handlearray` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROCESSTRACE_HANDLE`>?, `handlecount` : UInt, `starttime` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILETIME`>?, `endtime` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`FILETIME`>?) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=ProcessTraceAddBufferToBufferStream; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ProcessTraceAddBufferToBufferStream`(`tracehandle` : ULong, `buffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`ETW_BUFFER_HEADER`>?, `buffersize` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=ProcessTraceBufferDecrementReference; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ProcessTraceBufferDecrementReference`(`buffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`ETW_BUFFER_HEADER`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=ProcessTraceBufferIncrementReference; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ProcessTraceBufferIncrementReference`(`tracehandle` : ULong, `buffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`ETW_BUFFER_HEADER`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=QueryAllTracesA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `QueryAllTracesA`(`propertyarray` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`EVENT_TRACE_PROPERTIES`>>?, `propertyarraycount` : UInt, `loggercount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=QueryAllTracesW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `QueryAllTracesW`(`propertyarray` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`EVENT_TRACE_PROPERTIES`>>?, `propertyarraycount` : UInt, `loggercount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=QueryTraceA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `QueryTraceA`(`tracehandle` : `CONTROLTRACE_HANDLE`, `instancename` : `windows_sys`.`core`.`PCSTR`, `properties` : /* Rust *mut */ kotlinx.cinterop.CPointer<`EVENT_TRACE_PROPERTIES`>?) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=QueryTraceProcessingHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `QueryTraceProcessingHandle`(`processinghandle` : `PROCESSTRACE_HANDLE`, `informationclass` : `ETW_PROCESS_HANDLE_INFO_TYPE`, `inbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `inbuffersize` : UInt, `outbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `outbuffersize` : UInt, `returnlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=QueryTraceW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `QueryTraceW`(`tracehandle` : `CONTROLTRACE_HANDLE`, `instancename` : `windows_sys`.`core`.`PCWSTR`, `properties` : /* Rust *mut */ kotlinx.cinterop.CPointer<`EVENT_TRACE_PROPERTIES`>?) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegisterTraceGuidsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegisterTraceGuidsA`(`requestaddress` : `WMIDPREQUEST`, `requestcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `controlguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `guidcount` : UInt, `traceguidreg` : /* Rust *const */ kotlinx.cinterop.CPointer<`TRACE_GUID_REGISTRATION`>?, `mofimagepath` : `windows_sys`.`core`.`PCSTR`, `mofresourcename` : `windows_sys`.`core`.`PCSTR`, `registrationhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RegisterTraceGuidsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegisterTraceGuidsW`(`requestaddress` : `WMIDPREQUEST`, `requestcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `controlguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `guidcount` : UInt, `traceguidreg` : /* Rust *const */ kotlinx.cinterop.CPointer<`TRACE_GUID_REGISTRATION`>?, `mofimagepath` : `windows_sys`.`core`.`PCWSTR`, `mofresourcename` : `windows_sys`.`core`.`PCWSTR`, `registrationhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=RemoveTraceCallback; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RemoveTraceCallback`(`pguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=SetTraceCallback; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetTraceCallback`(`pguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `eventcallback` : `PEVENT_CALLBACK`) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=StartTraceA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `StartTraceA`(`tracehandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CONTROLTRACE_HANDLE`>?, `instancename` : `windows_sys`.`core`.`PCSTR`, `properties` : /* Rust *mut */ kotlinx.cinterop.CPointer<`EVENT_TRACE_PROPERTIES`>?) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=StartTraceW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `StartTraceW`(`tracehandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CONTROLTRACE_HANDLE`>?, `instancename` : `windows_sys`.`core`.`PCWSTR`, `properties` : /* Rust *mut */ kotlinx.cinterop.CPointer<`EVENT_TRACE_PROPERTIES`>?) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=StopTraceA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `StopTraceA`(`tracehandle` : `CONTROLTRACE_HANDLE`, `instancename` : `windows_sys`.`core`.`PCSTR`, `properties` : /* Rust *mut */ kotlinx.cinterop.CPointer<`EVENT_TRACE_PROPERTIES`>?) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=StopTraceW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `StopTraceW`(`tracehandle` : `CONTROLTRACE_HANDLE`, `instancename` : `windows_sys`.`core`.`PCWSTR`, `properties` : /* Rust *mut */ kotlinx.cinterop.CPointer<`EVENT_TRACE_PROPERTIES`>?) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tdh.dll, ABI=system, export=TdhAggregatePayloadFilters; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TdhAggregatePayloadFilters`(`payloadfiltercount` : UInt, `payloadfilterptrs` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `eventmatchallflags` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.BooleanVar>?, `eventfilterdescriptor` : /* Rust *mut */ kotlinx.cinterop.CPointer<`EVENT_FILTER_DESCRIPTOR`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tdh.dll, ABI=system, export=TdhCleanupPayloadEventFilterDescriptor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TdhCleanupPayloadEventFilterDescriptor`(`eventfilterdescriptor` : /* Rust *mut */ kotlinx.cinterop.CPointer<`EVENT_FILTER_DESCRIPTOR`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tdh.dll, ABI=system, export=TdhCloseDecodingHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TdhCloseDecodingHandle`(`handle` : `TDH_HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tdh.dll, ABI=system, export=TdhCreatePayloadFilter; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TdhCreatePayloadFilter`(`providerguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `eventdescriptor` : /* Rust *const */ kotlinx.cinterop.CPointer<`EVENT_DESCRIPTOR`>?, `eventmatchany` : Boolean, `payloadpredicatecount` : UInt, `payloadpredicates` : /* Rust *const */ kotlinx.cinterop.CPointer<`PAYLOAD_FILTER_PREDICATE`>?, `payloadfilter` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tdh.dll, ABI=system, export=TdhDeletePayloadFilter; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TdhDeletePayloadFilter`(`payloadfilter` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tdh.dll, ABI=system, export=TdhEnumerateManifestProviderEvents; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TdhEnumerateManifestProviderEvents`(`providerguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PROVIDER_EVENT_INFO`>?, `buffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tdh.dll, ABI=system, export=TdhEnumerateProviderFieldInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TdhEnumerateProviderFieldInformation`(`pguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `eventfieldtype` : `EVENT_FIELD_TYPE`, `pbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PROVIDER_FIELD_INFOARRAY`>?, `pbuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tdh.dll, ABI=system, export=TdhEnumerateProviderFilters; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TdhEnumerateProviderFilters`(`guid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `tdhcontextcount` : UInt, `tdhcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`TDH_CONTEXT`>?, `filtercount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`PROVIDER_FILTER_INFO`>>?, `buffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tdh.dll, ABI=system, export=TdhEnumerateProviders; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TdhEnumerateProviders`(`pbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PROVIDER_ENUMERATION_INFO`>?, `pbuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tdh.dll, ABI=system, export=TdhEnumerateProvidersForDecodingSource; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TdhEnumerateProvidersForDecodingSource`(`filter` : `DECODING_SOURCE`, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PROVIDER_ENUMERATION_INFO`>?, `buffersize` : UInt, `bufferrequired` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tdh.dll, ABI=system, export=TdhFormatProperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TdhFormatProperty`(`eventinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`TRACE_EVENT_INFO`>?, `mapinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`EVENT_MAP_INFO`>?, `pointersize` : UInt, `propertyintype` : UShort, `propertyouttype` : UShort, `propertylength` : UShort, `userdatalength` : UShort, `userdata` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `buffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `buffer` : `windows_sys`.`core`.`PWSTR`, `userdataconsumed` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tdh.dll, ABI=system, export=TdhGetDecodingParameter; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TdhGetDecodingParameter`(`handle` : `TDH_HANDLE`, `tdhcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`TDH_CONTEXT`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tdh.dll, ABI=system, export=TdhGetEventInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TdhGetEventInformation`(`event` : /* Rust *const */ kotlinx.cinterop.CPointer<`EVENT_RECORD`>?, `tdhcontextcount` : UInt, `tdhcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`TDH_CONTEXT`>?, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`TRACE_EVENT_INFO`>?, `buffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tdh.dll, ABI=system, export=TdhGetEventMapInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TdhGetEventMapInformation`(`pevent` : /* Rust *const */ kotlinx.cinterop.CPointer<`EVENT_RECORD`>?, `pmapname` : `windows_sys`.`core`.`PCWSTR`, `pbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`EVENT_MAP_INFO`>?, `pbuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tdh.dll, ABI=system, export=TdhGetManifestEventInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TdhGetManifestEventInformation`(`providerguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `eventdescriptor` : /* Rust *const */ kotlinx.cinterop.CPointer<`EVENT_DESCRIPTOR`>?, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`TRACE_EVENT_INFO`>?, `buffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tdh.dll, ABI=system, export=TdhGetProperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TdhGetProperty`(`pevent` : /* Rust *const */ kotlinx.cinterop.CPointer<`EVENT_RECORD`>?, `tdhcontextcount` : UInt, `ptdhcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`TDH_CONTEXT`>?, `propertydatacount` : UInt, `ppropertydata` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROPERTY_DATA_DESCRIPTOR`>?, `buffersize` : UInt, `pbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tdh.dll, ABI=system, export=TdhGetPropertySize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TdhGetPropertySize`(`pevent` : /* Rust *const */ kotlinx.cinterop.CPointer<`EVENT_RECORD`>?, `tdhcontextcount` : UInt, `ptdhcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`TDH_CONTEXT`>?, `propertydatacount` : UInt, `ppropertydata` : /* Rust *const */ kotlinx.cinterop.CPointer<`PROPERTY_DATA_DESCRIPTOR`>?, `ppropertysize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tdh.dll, ABI=system, export=TdhGetWppMessage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TdhGetWppMessage`(`handle` : `TDH_HANDLE`, `eventrecord` : /* Rust *const */ kotlinx.cinterop.CPointer<`EVENT_RECORD`>?, `buffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tdh.dll, ABI=system, export=TdhGetWppProperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TdhGetWppProperty`(`handle` : `TDH_HANDLE`, `eventrecord` : /* Rust *const */ kotlinx.cinterop.CPointer<`EVENT_RECORD`>?, `propertyname` : `windows_sys`.`core`.`PCWSTR`, `buffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tdh.dll, ABI=system, export=TdhLoadManifest; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TdhLoadManifest`(`manifest` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tdh.dll, ABI=system, export=TdhLoadManifestFromBinary; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TdhLoadManifestFromBinary`(`binarypath` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tdh.dll, ABI=system, export=TdhLoadManifestFromMemory; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TdhLoadManifestFromMemory`(`pdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbdata` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tdh.dll, ABI=system, export=TdhOpenDecodingHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TdhOpenDecodingHandle`(`handle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`TDH_HANDLE`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tdh.dll, ABI=system, export=TdhQueryProviderFieldInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TdhQueryProviderFieldInformation`(`pguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `eventfieldvalue` : ULong, `eventfieldtype` : `EVENT_FIELD_TYPE`, `pbuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PROVIDER_FIELD_INFOARRAY`>?, `pbuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tdh.dll, ABI=system, export=TdhSetDecodingParameter; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TdhSetDecodingParameter`(`handle` : `TDH_HANDLE`, `tdhcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`TDH_CONTEXT`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tdh.dll, ABI=system, export=TdhUnloadManifest; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TdhUnloadManifest`(`manifest` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=tdh.dll, ABI=system, export=TdhUnloadManifestFromMemory; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TdhUnloadManifestFromMemory`(`pdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `cbdata` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=TraceEvent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TraceEvent`(`tracehandle` : ULong, `eventtrace` : /* Rust *const */ kotlinx.cinterop.CPointer<`EVENT_TRACE_HEADER`>?) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=TraceEventInstance; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TraceEventInstance`(`tracehandle` : ULong, `eventtrace` : /* Rust *const */ kotlinx.cinterop.CPointer<`EVENT_INSTANCE_HEADER`>?, `instinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`EVENT_INSTANCE_INFO`>?, `parentinstinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`EVENT_INSTANCE_INFO`>?) : UInt
// UNSUPPORTED Rust 89:1: foreign declaration requires explicit native target and interop package; syntax: foreign signature shape unsupported
// windows_link::link!("advapi32.dll" "C" fn TraceMessage(loggerhandle : u64, messageflags : TRACE_MESSAGE_FLAGS, messageguid : *const windows_sys::core::GUID, messagenumber : u16, ...) -> super::super::super::Foundation:: WIN32_ERROR);

// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=TraceMessageVa; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TraceMessageVa`(`loggerhandle` : ULong, `messageflags` : `TRACE_MESSAGE_FLAGS`, `messageguid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `messagenumber` : UShort, `messagearglist` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=TraceQueryInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TraceQueryInformation`(`sessionhandle` : `CONTROLTRACE_HANDLE`, `informationclass` : `TRACE_QUERY_INFO_CLASS`, `traceinformation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `informationlength` : UInt, `returnlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=TraceSetInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TraceSetInformation`(`sessionhandle` : `CONTROLTRACE_HANDLE`, `informationclass` : `TRACE_QUERY_INFO_CLASS`, `traceinformation` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `informationlength` : UInt) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=UnregisterTraceGuids; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UnregisterTraceGuids`(`registrationhandle` : ULong) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=UpdateTraceA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UpdateTraceA`(`tracehandle` : `CONTROLTRACE_HANDLE`, `instancename` : `windows_sys`.`core`.`PCSTR`, `properties` : /* Rust *mut */ kotlinx.cinterop.CPointer<`EVENT_TRACE_PROPERTIES`>?) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=advapi32.dll, ABI=system, export=UpdateTraceW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UpdateTraceW`(`tracehandle` : `CONTROLTRACE_HANDLE`, `instancename` : `windows_sys`.`core`.`PCWSTR`, `properties` : /* Rust *mut */ kotlinx.cinterop.CPointer<`EVENT_TRACE_PROPERTIES`>?) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// UNSUPPORTED Rust 96:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const ALPCGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x45d8cccd_539f_4b72_a8b7_5c683142609a);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 7 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CLASSIC_EVENT_ID` (
    public var `EventGuid`: `windows_sys`.`core`.`GUID`,
    public var `Type`: UByte,
    public var `Reserved`: UByteArray,
)
// UNSUPPORTED Rust 104:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CLASSIC_EVENT_ID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 109:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CLSID_TraceRelogger: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7b40792d_05ff_44c4_9058_f440c71f17d4);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CONTROLTRACE_HANDLE` (
    public var `Value`: ULong,
)
// UNSUPPORTED Rust 115:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CTraceRelogger: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7b40792d_05ff_44c4_9058_f440c71f17d4);

public typealias `DECODING_SOURCE` = Int;
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `DIAG_LOGGER_NAMEA`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("DiagLog");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `DIAG_LOGGER_NAMEW`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("DiagLog");
public const val `DecodingSourceMax`: `DECODING_SOURCE` = 4;
public const val `DecodingSourceTlg`: `DECODING_SOURCE` = 3;
public const val `DecodingSourceWPP`: `DECODING_SOURCE` = 2;
public const val `DecodingSourceWbem`: `DECODING_SOURCE` = 1;
public const val `DecodingSourceXMLFile`: `DECODING_SOURCE` = 0;
// UNSUPPORTED Rust 124:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const DefaultTraceSecurityGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0811c1af_7a07_4a06_82ed_869455cdf713);

// UNSUPPORTED Rust 125:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const DiskIoGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3d6fa8d4_fe05_11d0_9dda_00c04fd7ba7c);

public typealias `ENABLECALLBACK_ENABLED_STATE` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ENABLE_TRACE_PARAMETERS` (
    public var `Version`: UInt,
    public var `EnableProperty`: UInt,
    public var `ControlFlags`: UInt,
    public var `SourceId`: `windows_sys`.`core`.`GUID`,
    public var `EnableFilterDesc`: /* Rust *mut */ kotlinx.cinterop.CPointer<`EVENT_FILTER_DESCRIPTOR`>?,
    public var `FilterDescCount`: UInt,
)
// UNSUPPORTED Rust 137:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ENABLE_TRACE_PARAMETERS {
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
public class `ENABLE_TRACE_PARAMETERS_V1` (
    public var `Version`: UInt,
    public var `EnableProperty`: UInt,
    public var `ControlFlags`: UInt,
    public var `SourceId`: `windows_sys`.`core`.`GUID`,
    public var `EnableFilterDesc`: /* Rust *mut */ kotlinx.cinterop.CPointer<`EVENT_FILTER_DESCRIPTOR`>?,
)
// UNSUPPORTED Rust 151:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ENABLE_TRACE_PARAMETERS_V1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ENABLE_TRACE_PARAMETERS_VERSION`: UInt = 1u;
public const val `ENABLE_TRACE_PARAMETERS_VERSION_2`: UInt = 2u;
public const val `ETW_ASCIICHAR_TYPE_VALUE`: UInt = 102u;
public const val `ETW_ASCIISTRING_TYPE_VALUE`: UInt = 103u;
public const val `ETW_BOOLEAN_TYPE_VALUE`: UInt = 14u;
public const val `ETW_BOOL_TYPE_VALUE`: UInt = 108u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Time")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ETW_BUFFER_CALLBACK_INFORMATION` (
    public var `TraceHandle`: ULong,
    public var `LogfileHeader`: /* Rust *const */ kotlinx.cinterop.CPointer<`TRACE_LOGFILE_HEADER`>?,
    public var `BuffersRead`: UInt,
)
// UNSUPPORTED Rust 170:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Time")]
// impl Default for ETW_BUFFER_CALLBACK_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ETW_BUFFER_CONTEXT` (
    public var `Anonymous`: `ETW_BUFFER_CONTEXT_0`,
    public var `LoggerId`: UShort,
)
// UNSUPPORTED Rust 182:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ETW_BUFFER_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 187:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union ETW_BUFFER_CONTEXT_0 {
//     pub Anonymous: ETW_BUFFER_CONTEXT_0_0,
//     pub ProcessorIndex: u16,
// }

// UNSUPPORTED Rust 193:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ETW_BUFFER_CONTEXT_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ETW_BUFFER_CONTEXT_0_0` (
    public var `ProcessorNumber`: UByte,
    public var `Alignment`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 5 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ETW_BUFFER_HEADER` (
    public var `Reserved1`: UIntArray,
    public var `TimeStamp`: Long,
    public var `Reserved2`: UIntArray,
    public var `ClientContext`: `ETW_BUFFER_CONTEXT`,
    public var `Reserved3`: UInt,
    public var `FilledBytes`: UInt,
    public var `Reserved4`: UIntArray,
)
// UNSUPPORTED Rust 215:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ETW_BUFFER_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ETW_BYTE_TYPE_VALUE`: UInt = 4u;
public const val `ETW_CHAR_TYPE_VALUE`: UInt = 11u;
public typealias `ETW_COMPRESSION_RESUMPTION_MODE` = Int;
public const val `ETW_COUNTED_ANSISTRING_TYPE_VALUE`: UInt = 109u;
public const val `ETW_COUNTED_STRING_TYPE_VALUE`: UInt = 104u;
public const val `ETW_DATETIME_TYPE_VALUE`: UInt = 119u;
public const val `ETW_DECIMAL_TYPE_VALUE`: UInt = 15u;
public const val `ETW_DOUBLE_TYPE_VALUE`: UInt = 13u;
public const val `ETW_GUID_TYPE_VALUE`: UInt = 101u;
public const val `ETW_HIDDEN_TYPE_VALUE`: UInt = 107u;
public const val `ETW_INT16_TYPE_VALUE`: UInt = 5u;
public const val `ETW_INT32_TYPE_VALUE`: UInt = 7u;
public const val `ETW_INT64_TYPE_VALUE`: UInt = 9u;
public const val `ETW_NON_NULL_TERMINATED_STRING_TYPE_VALUE`: UInt = 112u;
public const val `ETW_NULL_TYPE_VALUE`: UInt = 0u;
public const val `ETW_OBJECT_TYPE_VALUE`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Time")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ETW_OPEN_TRACE_OPTIONS` (
    public var `ProcessTraceModes`: `ETW_PROCESS_TRACE_MODES`,
    public var `EventCallback`: `PEVENT_RECORD_CALLBACK`,
    public var `EventCallbackContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `BufferCallback`: `PETW_BUFFER_CALLBACK`,
    public var `BufferCallbackContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 246:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Time")]
// impl Default for ETW_OPEN_TRACE_OPTIONS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ETW_PMC_COUNTER_OWNER` (
    public var `OwnerType`: `ETW_PMC_COUNTER_OWNER_TYPE`,
    public var `ProfileSource`: UInt,
    public var `OwnerTag`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ETW_PMC_COUNTER_OWNERSHIP_STATUS` (
    public var `ProcessorNumber`: UInt,
    public var `NumberOfCounters`: UInt,
    public var `CounterOwners`: Array<`ETW_PMC_COUNTER_OWNER`>,
)
// UNSUPPORTED Rust 266:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ETW_PMC_COUNTER_OWNERSHIP_STATUS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `ETW_PMC_COUNTER_OWNER_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ETW_PMC_SESSION_INFO` (
    public var `NextEntryOffset`: UInt,
    public var `LoggerId`: UShort,
    public var `Reserved`: UShort,
    public var `ProfileSourceCount`: UInt,
    public var `HookIdCount`: UInt,
)
public const val `ETW_POINTER_TYPE_VALUE`: UInt = 105u;
public typealias `ETW_PROCESS_HANDLE_INFO_TYPE` = Int;
public typealias `ETW_PROCESS_TRACE_MODES` = Int;
public const val `ETW_PROCESS_TRACE_MODE_NONE`: `ETW_PROCESS_TRACE_MODES` = 0;
public const val `ETW_PROCESS_TRACE_MODE_RAW_TIMESTAMP`: `ETW_PROCESS_TRACE_MODES` = 1;
public typealias `ETW_PROVIDER_TRAIT_TYPE` = Int;
public const val `ETW_PTVECTOR_TYPE_VALUE`: UInt = 117u;
public const val `ETW_REDUCED_ANSISTRING_TYPE_VALUE`: UInt = 113u;
public const val `ETW_REDUCED_STRING_TYPE_VALUE`: UInt = 114u;
public const val `ETW_REFRENCE_TYPE_VALUE`: UInt = 120u;
public const val `ETW_REVERSED_COUNTED_ANSISTRING_TYPE_VALUE`: UInt = 111u;
public const val `ETW_REVERSED_COUNTED_STRING_TYPE_VALUE`: UInt = 110u;
public const val `ETW_SBYTE_TYPE_VALUE`: UInt = 3u;
public const val `ETW_SID_TYPE_VALUE`: UInt = 115u;
public const val `ETW_SINGLE_TYPE_VALUE`: UInt = 12u;
public const val `ETW_SIZET_TYPE_VALUE`: UInt = 106u;
public const val `ETW_STRING_TYPE_VALUE`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ETW_TRACE_PARTITION_INFORMATION` (
    public var `PartitionId`: `windows_sys`.`core`.`GUID`,
    public var `ParentId`: `windows_sys`.`core`.`GUID`,
    public var `QpcOffsetFromRoot`: Long,
    public var `PartitionType`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ETW_TRACE_PARTITION_INFORMATION_V2` (
    public var `QpcOffsetFromRoot`: Long,
    public var `PartitionType`: UInt,
    public var `PartitionId`: `windows_sys`.`core`.`PWSTR`,
    public var `ParentId`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 314:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ETW_TRACE_PARTITION_INFORMATION_V2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `ETW_UINT16_TYPE_VALUE`: UInt = 6u;
public const val `ETW_UINT32_TYPE_VALUE`: UInt = 8u;
public const val `ETW_UINT64_TYPE_VALUE`: UInt = 10u;
public const val `ETW_VARIANT_TYPE_VALUE`: UInt = 116u;
public const val `ETW_WMITIME_TYPE_VALUE`: UInt = 118u;
public const val `EVENTMAP_ENTRY_VALUETYPE_STRING`: `MAP_VALUETYPE` = 1;
public const val `EVENTMAP_ENTRY_VALUETYPE_ULONG`: `MAP_VALUETYPE` = 0;
public const val `EVENTMAP_INFO_FLAG_MANIFEST_BITMAP`: `MAP_FLAGS` = 2;
public const val `EVENTMAP_INFO_FLAG_MANIFEST_PATTERNMAP`: `MAP_FLAGS` = 4;
public const val `EVENTMAP_INFO_FLAG_MANIFEST_VALUEMAP`: `MAP_FLAGS` = 1;
public const val `EVENTMAP_INFO_FLAG_WBEM_BITMAP`: `MAP_FLAGS` = 16;
public const val `EVENTMAP_INFO_FLAG_WBEM_FLAG`: `MAP_FLAGS` = 32;
public const val `EVENTMAP_INFO_FLAG_WBEM_NO_MAP`: `MAP_FLAGS` = 64;
public const val `EVENTMAP_INFO_FLAG_WBEM_VALUEMAP`: `MAP_FLAGS` = 8;
public typealias `EVENTSECURITYOPERATION` = Int;
public const val `EVENT_ACTIVITY_CTRL_CREATE_ID`: UInt = 3u;
public const val `EVENT_ACTIVITY_CTRL_CREATE_SET_ID`: UInt = 5u;
public const val `EVENT_ACTIVITY_CTRL_GET_ID`: UInt = 1u;
public const val `EVENT_ACTIVITY_CTRL_GET_SET_ID`: UInt = 4u;
public const val `EVENT_ACTIVITY_CTRL_SET_ID`: UInt = 2u;
public const val `EVENT_CONTROL_CODE_CAPTURE_STATE`: `ENABLECALLBACK_ENABLED_STATE` = 2u;
public const val `EVENT_CONTROL_CODE_DISABLE_PROVIDER`: `ENABLECALLBACK_ENABLED_STATE` = 0u;
public const val `EVENT_CONTROL_CODE_ENABLE_PROVIDER`: `ENABLECALLBACK_ENABLED_STATE` = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `EVENT_DATA_DESCRIPTOR` (
    public var `Ptr`: ULong,
    public var `Size`: UInt,
    public var `Anonymous`: `EVENT_DATA_DESCRIPTOR_0`,
)
// UNSUPPORTED Rust 349:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for EVENT_DATA_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 354:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union EVENT_DATA_DESCRIPTOR_0 {
//     pub Reserved: u32,
//     pub Anonymous: EVENT_DATA_DESCRIPTOR_0_0,
// }

// UNSUPPORTED Rust 360:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for EVENT_DATA_DESCRIPTOR_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EVENT_DATA_DESCRIPTOR_0_0` (
    public var `Type`: UByte,
    public var `Reserved1`: UByte,
    public var `Reserved2`: UShort,
)
public const val `EVENT_DATA_DESCRIPTOR_TYPE_EVENT_METADATA`: UInt = 1u;
public const val `EVENT_DATA_DESCRIPTOR_TYPE_NONE`: UInt = 0u;
public const val `EVENT_DATA_DESCRIPTOR_TYPE_PROVIDER_METADATA`: UInt = 2u;
public const val `EVENT_DATA_DESCRIPTOR_TYPE_TIMESTAMP_OVERRIDE`: UInt = 3u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EVENT_DESCRIPTOR` (
    public var `Id`: UShort,
    public var `Version`: UByte,
    public var `Channel`: UByte,
    public var `Level`: UByte,
    public var `Opcode`: UByte,
    public var `Task`: UShort,
    public var `Keyword`: ULong,
)
public const val `EVENT_ENABLE_PROPERTY_ENABLE_KEYWORD_0`: UInt = 64u;
public const val `EVENT_ENABLE_PROPERTY_ENABLE_SILOS`: UInt = 1024u;
public const val `EVENT_ENABLE_PROPERTY_EVENT_KEY`: UInt = 256u;
public const val `EVENT_ENABLE_PROPERTY_EXCLUDE_INPRIVATE`: UInt = 512u;
public const val `EVENT_ENABLE_PROPERTY_IGNORE_KEYWORD_0`: UInt = 16u;
public const val `EVENT_ENABLE_PROPERTY_PROCESS_START_KEY`: UInt = 128u;
public const val `EVENT_ENABLE_PROPERTY_PROVIDER_GROUP`: UInt = 32u;
public const val `EVENT_ENABLE_PROPERTY_PSM_KEY`: UInt = 8u;
public const val `EVENT_ENABLE_PROPERTY_SID`: UInt = 1u;
public const val `EVENT_ENABLE_PROPERTY_SOURCE_CONTAINER_TRACKING`: UInt = 2048u;
public const val `EVENT_ENABLE_PROPERTY_STACK_TRACE`: UInt = 4u;
public const val `EVENT_ENABLE_PROPERTY_TS_ID`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EVENT_EXTENDED_ITEM_EVENT_KEY` (
    public var `Key`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EVENT_EXTENDED_ITEM_INSTANCE` (
    public var `InstanceId`: UInt,
    public var `ParentInstanceId`: UInt,
    public var `ParentGuid`: `windows_sys`.`core`.`GUID`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EVENT_EXTENDED_ITEM_PEBS_INDEX` (
    public var `PebsIndex`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `EVENT_EXTENDED_ITEM_PMC_COUNTERS` (
    public var `Counter`: ULongArray,
)
// UNSUPPORTED Rust 421:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for EVENT_EXTENDED_ITEM_PMC_COUNTERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EVENT_EXTENDED_ITEM_PROCESS_START_KEY` (
    public var `ProcessStartKey`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EVENT_EXTENDED_ITEM_RELATED_ACTIVITYID` (
    public var `RelatedActivityId`: `windows_sys`.`core`.`GUID`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EVENT_EXTENDED_ITEM_STACK_KEY32` (
    public var `MatchId`: ULong,
    public var `StackKey`: UInt,
    public var `Padding`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EVENT_EXTENDED_ITEM_STACK_KEY64` (
    public var `MatchId`: ULong,
    public var `StackKey`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `EVENT_EXTENDED_ITEM_STACK_TRACE32` (
    public var `MatchId`: ULong,
    public var `Address`: UIntArray,
)
// UNSUPPORTED Rust 455:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for EVENT_EXTENDED_ITEM_STACK_TRACE32 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `EVENT_EXTENDED_ITEM_STACK_TRACE64` (
    public var `MatchId`: ULong,
    public var `Address`: ULongArray,
)
// UNSUPPORTED Rust 466:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for EVENT_EXTENDED_ITEM_STACK_TRACE64 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EVENT_EXTENDED_ITEM_TS_ID` (
    public var `SessionId`: UInt,
)
public typealias `EVENT_FIELD_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EVENT_FILTER_DESCRIPTOR` (
    public var `Ptr`: ULong,
    public var `Size`: UInt,
    public var `Type`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `EVENT_FILTER_EVENT_ID` (
    public var `FilterIn`: Boolean,
    public var `Reserved`: UByte,
    public var `Count`: UShort,
    public var `Events`: UShortArray,
)
// UNSUPPORTED Rust 492:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for EVENT_FILTER_EVENT_ID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `EVENT_FILTER_EVENT_NAME` (
    public var `MatchAnyKeyword`: ULong,
    public var `MatchAllKeyword`: ULong,
    public var `Level`: UByte,
    public var `FilterIn`: Boolean,
    public var `NameCount`: UShort,
    public var `Names`: UByteArray,
)
// UNSUPPORTED Rust 507:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for EVENT_FILTER_EVENT_NAME {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 5 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `EVENT_FILTER_HEADER` (
    public var `Id`: UShort,
    public var `Version`: UByte,
    public var `Reserved`: UByteArray,
    public var `InstanceId`: ULong,
    public var `Size`: UInt,
    public var `NextOffset`: UInt,
)
// UNSUPPORTED Rust 522:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for EVENT_FILTER_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EVENT_FILTER_LEVEL_KW` (
    public var `MatchAnyKeyword`: ULong,
    public var `MatchAllKeyword`: ULong,
    public var `Level`: UByte,
    public var `FilterIn`: Boolean,
)
public const val `EVENT_FILTER_TYPE_CONTAINER`: UInt = 2147516416u;
public const val `EVENT_FILTER_TYPE_EVENT_ID`: UInt = 2147484160u;
public const val `EVENT_FILTER_TYPE_EVENT_NAME`: UInt = 2147484672u;
public const val `EVENT_FILTER_TYPE_EXECUTABLE_NAME`: UInt = 2147483656u;
public const val `EVENT_FILTER_TYPE_NONE`: UInt = 0u;
public const val `EVENT_FILTER_TYPE_PACKAGE_APP_ID`: UInt = 2147483680u;
public const val `EVENT_FILTER_TYPE_PACKAGE_ID`: UInt = 2147483664u;
public const val `EVENT_FILTER_TYPE_PAYLOAD`: UInt = 2147483904u;
public const val `EVENT_FILTER_TYPE_PID`: UInt = 2147483652u;
public const val `EVENT_FILTER_TYPE_SCHEMATIZED`: UInt = 2147483648u;
public const val `EVENT_FILTER_TYPE_STACKWALK`: UInt = 2147487744u;
public const val `EVENT_FILTER_TYPE_STACKWALK_LEVEL_KW`: UInt = 2147500032u;
public const val `EVENT_FILTER_TYPE_STACKWALK_NAME`: UInt = 2147491840u;
public const val `EVENT_FILTER_TYPE_SYSTEM_FLAGS`: UInt = 2147483649u;
public const val `EVENT_FILTER_TYPE_TRACEHANDLE`: UInt = 2147483650u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `EVENT_HEADER` (
    public var `Size`: UShort,
    public var `HeaderType`: UShort,
    public var `Flags`: UShort,
    public var `EventProperty`: UShort,
    public var `ThreadId`: UInt,
    public var `ProcessId`: UInt,
    public var `TimeStamp`: Long,
    public var `ProviderId`: `windows_sys`.`core`.`GUID`,
    public var `EventDescriptor`: `EVENT_DESCRIPTOR`,
    public var `Anonymous`: `EVENT_HEADER_0`,
    public var `ActivityId`: `windows_sys`.`core`.`GUID`,
)
// UNSUPPORTED Rust 565:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for EVENT_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 570:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union EVENT_HEADER_0 {
//     pub Anonymous: EVENT_HEADER_0_0,
//     pub ProcessorTime: u64,
// }

// UNSUPPORTED Rust 576:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for EVENT_HEADER_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EVENT_HEADER_0_0` (
    public var `KernelTime`: UInt,
    public var `UserTime`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EVENT_HEADER_EXTENDED_DATA_ITEM` (
    public var `Reserved1`: UShort,
    public var `ExtType`: UShort,
    public var `Anonymous`: `EVENT_HEADER_EXTENDED_DATA_ITEM_0`,
    public var `DataSize`: UShort,
    public var `DataPtr`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EVENT_HEADER_EXTENDED_DATA_ITEM_0` (
    public var `_bitfield`: UShort,
)
public const val `EVENT_HEADER_EXT_TYPE_CONTAINER_ID`: UInt = 16u;
public const val `EVENT_HEADER_EXT_TYPE_CONTROL_GUID`: UInt = 14u;
public const val `EVENT_HEADER_EXT_TYPE_EVENT_KEY`: UInt = 10u;
public const val `EVENT_HEADER_EXT_TYPE_EVENT_SCHEMA_TL`: UInt = 11u;
public const val `EVENT_HEADER_EXT_TYPE_INSTANCE_INFO`: UInt = 4u;
public const val `EVENT_HEADER_EXT_TYPE_MAX`: UInt = 19u;
public const val `EVENT_HEADER_EXT_TYPE_PEBS_INDEX`: UInt = 7u;
public const val `EVENT_HEADER_EXT_TYPE_PMC_COUNTERS`: UInt = 8u;
public const val `EVENT_HEADER_EXT_TYPE_PROCESS_START_KEY`: UInt = 13u;
public const val `EVENT_HEADER_EXT_TYPE_PROV_TRAITS`: UInt = 12u;
public const val `EVENT_HEADER_EXT_TYPE_PSM_KEY`: UInt = 9u;
public const val `EVENT_HEADER_EXT_TYPE_QPC_DELTA`: UInt = 15u;
public const val `EVENT_HEADER_EXT_TYPE_RELATED_ACTIVITYID`: UInt = 1u;
public const val `EVENT_HEADER_EXT_TYPE_SID`: UInt = 2u;
public const val `EVENT_HEADER_EXT_TYPE_STACK_KEY32`: UInt = 17u;
public const val `EVENT_HEADER_EXT_TYPE_STACK_KEY64`: UInt = 18u;
public const val `EVENT_HEADER_EXT_TYPE_STACK_TRACE32`: UInt = 5u;
public const val `EVENT_HEADER_EXT_TYPE_STACK_TRACE64`: UInt = 6u;
public const val `EVENT_HEADER_EXT_TYPE_TS_ID`: UInt = 3u;
public const val `EVENT_HEADER_FLAG_32_BIT_HEADER`: UInt = 32u;
public const val `EVENT_HEADER_FLAG_64_BIT_HEADER`: UInt = 64u;
public const val `EVENT_HEADER_FLAG_CLASSIC_HEADER`: UInt = 256u;
public const val `EVENT_HEADER_FLAG_DECODE_GUID`: UInt = 128u;
public const val `EVENT_HEADER_FLAG_EXTENDED_INFO`: UInt = 1u;
public const val `EVENT_HEADER_FLAG_NO_CPUTIME`: UInt = 16u;
public const val `EVENT_HEADER_FLAG_PRIVATE_SESSION`: UInt = 2u;
public const val `EVENT_HEADER_FLAG_PROCESSOR_INDEX`: UInt = 512u;
public const val `EVENT_HEADER_FLAG_STRING_ONLY`: UInt = 4u;
public const val `EVENT_HEADER_FLAG_TRACE_MESSAGE`: UInt = 8u;
public const val `EVENT_HEADER_PROPERTY_FORWARDED_XML`: UInt = 2u;
public const val `EVENT_HEADER_PROPERTY_LEGACY_EVENTLOG`: UInt = 4u;
public const val `EVENT_HEADER_PROPERTY_RELOGGABLE`: UInt = 8u;
public const val `EVENT_HEADER_PROPERTY_XML`: UInt = 1u;
public typealias `EVENT_INFO_CLASS` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `EVENT_INSTANCE_HEADER` (
    public var `Size`: UShort,
    public var `Anonymous1`: `EVENT_INSTANCE_HEADER_0`,
    public var `Anonymous2`: `EVENT_INSTANCE_HEADER_1`,
    public var `ThreadId`: UInt,
    public var `ProcessId`: UInt,
    public var `TimeStamp`: Long,
    public var `RegHandle`: ULong,
    public var `InstanceId`: UInt,
    public var `ParentInstanceId`: UInt,
    public var `Anonymous3`: `EVENT_INSTANCE_HEADER_2`,
    public var `ParentRegHandle`: ULong,
)
// UNSUPPORTED Rust 650:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for EVENT_INSTANCE_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 655:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union EVENT_INSTANCE_HEADER_0 {
//     pub FieldTypeFlags: u16,
//     pub Anonymous: EVENT_INSTANCE_HEADER_0_0,
// }

// UNSUPPORTED Rust 661:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for EVENT_INSTANCE_HEADER_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EVENT_INSTANCE_HEADER_0_0` (
    public var `HeaderType`: UByte,
    public var `MarkerFlags`: UByte,
)
// UNSUPPORTED Rust 672:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union EVENT_INSTANCE_HEADER_1 {
//     pub Version: u32,
//     pub Class: EVENT_INSTANCE_HEADER_1_0,
// }

// UNSUPPORTED Rust 678:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for EVENT_INSTANCE_HEADER_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EVENT_INSTANCE_HEADER_1_0` (
    public var `Type`: UByte,
    public var `Level`: UByte,
    public var `Version`: UShort,
)
// UNSUPPORTED Rust 690:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union EVENT_INSTANCE_HEADER_2 {
//     pub Anonymous1: EVENT_INSTANCE_HEADER_2_0,
//     pub ProcessorTime: u64,
//     pub Anonymous2: EVENT_INSTANCE_HEADER_2_1,
// }

// UNSUPPORTED Rust 697:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for EVENT_INSTANCE_HEADER_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EVENT_INSTANCE_HEADER_2_0` (
    public var `KernelTime`: UInt,
    public var `UserTime`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EVENT_INSTANCE_HEADER_2_1` (
    public var `EventId`: UInt,
    public var `Flags`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `EVENT_INSTANCE_INFO` (
    public var `RegHandle`: `super`.`super`.`super`.`Foundation`.`HANDLE`,
    public var `InstanceId`: UInt,
)
// UNSUPPORTED Rust 720:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for EVENT_INSTANCE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `EVENT_LOGGER_NAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("EventLog");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `EVENT_LOGGER_NAMEA`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("EventLog");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `EVENT_LOGGER_NAMEW`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("EventLog");
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `EVENT_MAP_ENTRY` (
    public var `OutputOffset`: UInt,
    public var `Anonymous`: `EVENT_MAP_ENTRY_0`,
)
// UNSUPPORTED Rust 734:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for EVENT_MAP_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 739:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union EVENT_MAP_ENTRY_0 {
//     pub Value: u32,
//     pub InputOffset: u32,
// }

// UNSUPPORTED Rust 745:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for EVENT_MAP_ENTRY_0 {
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
public class `EVENT_MAP_INFO` (
    public var `NameOffset`: UInt,
    public var `Flag`: `MAP_FLAGS`,
    public var `EntryCount`: UInt,
    public var `Anonymous`: `EVENT_MAP_INFO_0`,
    public var `MapEntryArray`: Array<`EVENT_MAP_ENTRY`>,
)
// UNSUPPORTED Rust 759:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for EVENT_MAP_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 764:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union EVENT_MAP_INFO_0 {
//     pub MapEntryValueType: MAP_VALUETYPE,
//     pub FormatStringOffset: u32,
// }

// UNSUPPORTED Rust 770:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for EVENT_MAP_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `EVENT_MAX_LEVEL`: UInt = 255u;
public const val `EVENT_MIN_LEVEL`: UInt = 0u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `EVENT_PROPERTY_INFO` (
    public var `Flags`: `PROPERTY_FLAGS`,
    public var `NameOffset`: UInt,
    public var `Anonymous1`: `EVENT_PROPERTY_INFO_0`,
    public var `Anonymous2`: `EVENT_PROPERTY_INFO_1`,
    public var `Anonymous3`: `EVENT_PROPERTY_INFO_2`,
    public var `Anonymous4`: `EVENT_PROPERTY_INFO_3`,
)
// UNSUPPORTED Rust 787:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for EVENT_PROPERTY_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 792:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union EVENT_PROPERTY_INFO_0 {
//     pub nonStructType: EVENT_PROPERTY_INFO_0_0,
//     pub structType: EVENT_PROPERTY_INFO_0_1,
//     pub customSchemaType: EVENT_PROPERTY_INFO_0_2,
// }

// UNSUPPORTED Rust 799:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for EVENT_PROPERTY_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EVENT_PROPERTY_INFO_0_2` (
    public var `InType`: UShort,
    public var `OutType`: UShort,
    public var `CustomSchemaOffset`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EVENT_PROPERTY_INFO_0_0` (
    public var `InType`: UShort,
    public var `OutType`: UShort,
    public var `MapNameOffset`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EVENT_PROPERTY_INFO_0_1` (
    public var `StructStartIndex`: UShort,
    public var `NumOfStructMembers`: UShort,
    public var `padding`: UInt,
)
// UNSUPPORTED Rust 825:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union EVENT_PROPERTY_INFO_1 {
//     pub count: u16,
//     pub countPropertyIndex: u16,
// }

// UNSUPPORTED Rust 831:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for EVENT_PROPERTY_INFO_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 836:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union EVENT_PROPERTY_INFO_2 {
//     pub length: u16,
//     pub lengthPropertyIndex: u16,
// }

// UNSUPPORTED Rust 842:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for EVENT_PROPERTY_INFO_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 847:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union EVENT_PROPERTY_INFO_3 {
//     pub Reserved: u32,
//     pub Anonymous: EVENT_PROPERTY_INFO_3_0,
// }

// UNSUPPORTED Rust 853:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for EVENT_PROPERTY_INFO_3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EVENT_PROPERTY_INFO_3_0` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `EVENT_RECORD` (
    public var `EventHeader`: `EVENT_HEADER`,
    public var `BufferContext`: `ETW_BUFFER_CONTEXT`,
    public var `ExtendedDataCount`: UShort,
    public var `UserDataLength`: UShort,
    public var `ExtendedData`: /* Rust *mut */ kotlinx.cinterop.CPointer<`EVENT_HEADER_EXTENDED_DATA_ITEM`>?,
    public var `UserData`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `UserContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 874:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for EVENT_RECORD {
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
public class `EVENT_TRACE` (
    public var `Header`: `EVENT_TRACE_HEADER`,
    public var `InstanceId`: UInt,
    public var `ParentInstanceId`: UInt,
    public var `ParentGuid`: `windows_sys`.`core`.`GUID`,
    public var `MofData`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `MofLength`: UInt,
    public var `Anonymous`: `EVENT_TRACE_0`,
)
// UNSUPPORTED Rust 890:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for EVENT_TRACE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 895:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union EVENT_TRACE_0 {
//     pub ClientContext: u32,
//     pub BufferContext: ETW_BUFFER_CONTEXT,
// }

// UNSUPPORTED Rust 901:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for EVENT_TRACE_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `EVENT_TRACE_ADDTO_TRIAGE_DUMP`: UInt = 2147483648u;
public const val `EVENT_TRACE_ADD_HEADER_MODE`: UInt = 4096u;
public const val `EVENT_TRACE_BUFFERING_MODE`: UInt = 1024u;
public const val `EVENT_TRACE_COMPRESSED_MODE`: UInt = 67108864u;
public typealias `EVENT_TRACE_CONTROL` = UInt;
public const val `EVENT_TRACE_CONTROL_CONVERT_TO_REALTIME`: UInt = 5u;
public const val `EVENT_TRACE_CONTROL_FLUSH`: `EVENT_TRACE_CONTROL` = 3u;
public const val `EVENT_TRACE_CONTROL_INCREMENT_FILE`: UInt = 4u;
public const val `EVENT_TRACE_CONTROL_QUERY`: `EVENT_TRACE_CONTROL` = 0u;
public const val `EVENT_TRACE_CONTROL_STOP`: `EVENT_TRACE_CONTROL` = 1u;
public const val `EVENT_TRACE_CONTROL_UPDATE`: `EVENT_TRACE_CONTROL` = 2u;
public const val `EVENT_TRACE_DELAY_OPEN_FILE_MODE`: UInt = 512u;
public const val `EVENT_TRACE_FILE_MODE_APPEND`: UInt = 4u;
public const val `EVENT_TRACE_FILE_MODE_CIRCULAR`: UInt = 2u;
public const val `EVENT_TRACE_FILE_MODE_NEWFILE`: UInt = 8u;
public const val `EVENT_TRACE_FILE_MODE_NONE`: UInt = 0u;
public const val `EVENT_TRACE_FILE_MODE_PREALLOCATE`: UInt = 32u;
public const val `EVENT_TRACE_FILE_MODE_SEQUENTIAL`: UInt = 1u;
public typealias `EVENT_TRACE_FLAG` = UInt;
public const val `EVENT_TRACE_FLAG_ALPC`: `EVENT_TRACE_FLAG` = 1048576u;
public const val `EVENT_TRACE_FLAG_CSWITCH`: `EVENT_TRACE_FLAG` = 16u;
public const val `EVENT_TRACE_FLAG_DBGPRINT`: `EVENT_TRACE_FLAG` = 262144u;
public const val `EVENT_TRACE_FLAG_DEBUG_EVENTS`: UInt = 4194304u;
public const val `EVENT_TRACE_FLAG_DISK_FILE_IO`: `EVENT_TRACE_FLAG` = 512u;
public const val `EVENT_TRACE_FLAG_DISK_IO`: `EVENT_TRACE_FLAG` = 256u;
public const val `EVENT_TRACE_FLAG_DISK_IO_INIT`: `EVENT_TRACE_FLAG` = 1024u;
public const val `EVENT_TRACE_FLAG_DISPATCHER`: `EVENT_TRACE_FLAG` = 2048u;
public const val `EVENT_TRACE_FLAG_DPC`: `EVENT_TRACE_FLAG` = 32u;
public const val `EVENT_TRACE_FLAG_DRIVER`: `EVENT_TRACE_FLAG` = 8388608u;
public const val `EVENT_TRACE_FLAG_ENABLE_RESERVE`: UInt = 536870912u;
public const val `EVENT_TRACE_FLAG_EXTENSION`: UInt = 2147483648u;
public const val `EVENT_TRACE_FLAG_FILE_IO`: `EVENT_TRACE_FLAG` = 33554432u;
public const val `EVENT_TRACE_FLAG_FILE_IO_INIT`: `EVENT_TRACE_FLAG` = 67108864u;
public const val `EVENT_TRACE_FLAG_FORWARD_WMI`: UInt = 1073741824u;
public const val `EVENT_TRACE_FLAG_IMAGE_LOAD`: `EVENT_TRACE_FLAG` = 4u;
public const val `EVENT_TRACE_FLAG_INTERRUPT`: `EVENT_TRACE_FLAG` = 64u;
public const val `EVENT_TRACE_FLAG_JOB`: `EVENT_TRACE_FLAG` = 524288u;
public const val `EVENT_TRACE_FLAG_MEMORY_HARD_FAULTS`: `EVENT_TRACE_FLAG` = 8192u;
public const val `EVENT_TRACE_FLAG_MEMORY_PAGE_FAULTS`: `EVENT_TRACE_FLAG` = 4096u;
public const val `EVENT_TRACE_FLAG_NETWORK_TCPIP`: `EVENT_TRACE_FLAG` = 65536u;
public const val `EVENT_TRACE_FLAG_NO_SYSCONFIG`: `EVENT_TRACE_FLAG` = 268435456u;
public const val `EVENT_TRACE_FLAG_PROCESS`: `EVENT_TRACE_FLAG` = 1u;
public const val `EVENT_TRACE_FLAG_PROCESS_COUNTERS`: `EVENT_TRACE_FLAG` = 8u;
public const val `EVENT_TRACE_FLAG_PROFILE`: `EVENT_TRACE_FLAG` = 16777216u;
public const val `EVENT_TRACE_FLAG_REGISTRY`: `EVENT_TRACE_FLAG` = 131072u;
public const val `EVENT_TRACE_FLAG_SPLIT_IO`: `EVENT_TRACE_FLAG` = 2097152u;
public const val `EVENT_TRACE_FLAG_SYSTEMCALL`: `EVENT_TRACE_FLAG` = 128u;
public const val `EVENT_TRACE_FLAG_THREAD`: `EVENT_TRACE_FLAG` = 2u;
public const val `EVENT_TRACE_FLAG_VAMAP`: `EVENT_TRACE_FLAG` = 32768u;
public const val `EVENT_TRACE_FLAG_VIRTUAL_ALLOC`: `EVENT_TRACE_FLAG` = 16384u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `EVENT_TRACE_HEADER` (
    public var `Size`: UShort,
    public var `Anonymous1`: `EVENT_TRACE_HEADER_0`,
    public var `Anonymous2`: `EVENT_TRACE_HEADER_1`,
    public var `ThreadId`: UInt,
    public var `ProcessId`: UInt,
    public var `TimeStamp`: Long,
    public var `Anonymous3`: `EVENT_TRACE_HEADER_2`,
    public var `Anonymous4`: `EVENT_TRACE_HEADER_3`,
)
// UNSUPPORTED Rust 968:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for EVENT_TRACE_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 973:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union EVENT_TRACE_HEADER_0 {
//     pub FieldTypeFlags: u16,
//     pub Anonymous: EVENT_TRACE_HEADER_0_0,
// }

// UNSUPPORTED Rust 979:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for EVENT_TRACE_HEADER_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EVENT_TRACE_HEADER_0_0` (
    public var `HeaderType`: UByte,
    public var `MarkerFlags`: UByte,
)
// UNSUPPORTED Rust 990:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union EVENT_TRACE_HEADER_1 {
//     pub Version: u32,
//     pub Class: EVENT_TRACE_HEADER_1_0,
// }

// UNSUPPORTED Rust 996:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for EVENT_TRACE_HEADER_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EVENT_TRACE_HEADER_1_0` (
    public var `Type`: UByte,
    public var `Level`: UByte,
    public var `Version`: UShort,
)
// UNSUPPORTED Rust 1008:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union EVENT_TRACE_HEADER_2 {
//     pub Guid: windows_sys::core::GUID,
//     pub GuidPtr: u64,
// }

// UNSUPPORTED Rust 1014:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for EVENT_TRACE_HEADER_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1019:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union EVENT_TRACE_HEADER_3 {
//     pub Anonymous1: EVENT_TRACE_HEADER_3_0,
//     pub ProcessorTime: u64,
//     pub Anonymous2: EVENT_TRACE_HEADER_3_1,
// }

// UNSUPPORTED Rust 1026:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for EVENT_TRACE_HEADER_3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EVENT_TRACE_HEADER_3_0` (
    public var `KernelTime`: UInt,
    public var `UserTime`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EVENT_TRACE_HEADER_3_1` (
    public var `ClientContext`: UInt,
    public var `Flags`: UInt,
)
public const val `EVENT_TRACE_INDEPENDENT_SESSION_MODE`: UInt = 134217728u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Time")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `EVENT_TRACE_LOGFILEA` (
    public var `LogFileName`: `windows_sys`.`core`.`PSTR`,
    public var `LoggerName`: `windows_sys`.`core`.`PSTR`,
    public var `CurrentTime`: Long,
    public var `BuffersRead`: UInt,
    public var `Anonymous1`: `EVENT_TRACE_LOGFILEA_0`,
    public var `CurrentEvent`: `EVENT_TRACE`,
    public var `LogfileHeader`: `TRACE_LOGFILE_HEADER`,
    public var `BufferCallback`: `PEVENT_TRACE_BUFFER_CALLBACKA`,
    public var `BufferSize`: UInt,
    public var `Filled`: UInt,
    public var `EventsLost`: UInt,
    public var `Anonymous2`: `EVENT_TRACE_LOGFILEA_1`,
    public var `IsKernelTrace`: UInt,
    public var `Context`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 1063:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Time")]
// impl Default for EVENT_TRACE_LOGFILEA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1069:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_System_Time")]
// #[derive(Clone, Copy)]
// pub union EVENT_TRACE_LOGFILEA_0 {
//     pub LogFileMode: u32,
//     pub ProcessTraceMode: u32,
// }

// UNSUPPORTED Rust 1076:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Time")]
// impl Default for EVENT_TRACE_LOGFILEA_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1082:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_System_Time")]
// #[derive(Clone, Copy)]
// pub union EVENT_TRACE_LOGFILEA_1 {
//     pub EventCallback: PEVENT_CALLBACK,
//     pub EventRecordCallback: PEVENT_RECORD_CALLBACK,
// }

// UNSUPPORTED Rust 1089:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Time")]
// impl Default for EVENT_TRACE_LOGFILEA_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Time")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `EVENT_TRACE_LOGFILEW` (
    public var `LogFileName`: `windows_sys`.`core`.`PWSTR`,
    public var `LoggerName`: `windows_sys`.`core`.`PWSTR`,
    public var `CurrentTime`: Long,
    public var `BuffersRead`: UInt,
    public var `Anonymous1`: `EVENT_TRACE_LOGFILEW_0`,
    public var `CurrentEvent`: `EVENT_TRACE`,
    public var `LogfileHeader`: `TRACE_LOGFILE_HEADER`,
    public var `BufferCallback`: `PEVENT_TRACE_BUFFER_CALLBACKW`,
    public var `BufferSize`: UInt,
    public var `Filled`: UInt,
    public var `EventsLost`: UInt,
    public var `Anonymous2`: `EVENT_TRACE_LOGFILEW_1`,
    public var `IsKernelTrace`: UInt,
    public var `Context`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 1114:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Time")]
// impl Default for EVENT_TRACE_LOGFILEW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1120:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_System_Time")]
// #[derive(Clone, Copy)]
// pub union EVENT_TRACE_LOGFILEW_0 {
//     pub LogFileMode: u32,
//     pub ProcessTraceMode: u32,
// }

// UNSUPPORTED Rust 1127:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Time")]
// impl Default for EVENT_TRACE_LOGFILEW_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1133:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_System_Time")]
// #[derive(Clone, Copy)]
// pub union EVENT_TRACE_LOGFILEW_1 {
//     pub EventCallback: PEVENT_CALLBACK,
//     pub EventRecordCallback: PEVENT_RECORD_CALLBACK,
// }

// UNSUPPORTED Rust 1140:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Time")]
// impl Default for EVENT_TRACE_LOGFILEW_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `EVENT_TRACE_MODE_RESERVED`: UInt = 1048576u;
public const val `EVENT_TRACE_NONSTOPPABLE_MODE`: UInt = 64u;
public const val `EVENT_TRACE_NO_PER_PROCESSOR_BUFFERING`: UInt = 268435456u;
public const val `EVENT_TRACE_PERSIST_ON_HYBRID_SHUTDOWN`: UInt = 8388608u;
public const val `EVENT_TRACE_PRIVATE_IN_PROC`: UInt = 131072u;
public const val `EVENT_TRACE_PRIVATE_LOGGER_MODE`: UInt = 2048u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `EVENT_TRACE_PROPERTIES` (
    public var `Wnode`: `WNODE_HEADER`,
    public var `BufferSize`: UInt,
    public var `MinimumBuffers`: UInt,
    public var `MaximumBuffers`: UInt,
    public var `MaximumFileSize`: UInt,
    public var `LogFileMode`: UInt,
    public var `FlushTimer`: UInt,
    public var `EnableFlags`: `EVENT_TRACE_FLAG`,
    public var `Anonymous`: `EVENT_TRACE_PROPERTIES_0`,
    public var `NumberOfBuffers`: UInt,
    public var `FreeBuffers`: UInt,
    public var `EventsLost`: UInt,
    public var `BuffersWritten`: UInt,
    public var `LogBuffersLost`: UInt,
    public var `RealTimeBuffersLost`: UInt,
    public var `LoggerThreadId`: `super`.`super`.`super`.`Foundation`.`HANDLE`,
    public var `LogFileNameOffset`: UInt,
    public var `LoggerNameOffset`: UInt,
)
// UNSUPPORTED Rust 1174:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for EVENT_TRACE_PROPERTIES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1179:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union EVENT_TRACE_PROPERTIES_0 {
//     pub AgeLimit: i32,
//     pub FlushThreshold: i32,
// }

// UNSUPPORTED Rust 1185:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for EVENT_TRACE_PROPERTIES_0 {
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
public class `EVENT_TRACE_PROPERTIES_V2` (
    public var `Wnode`: `WNODE_HEADER`,
    public var `BufferSize`: UInt,
    public var `MinimumBuffers`: UInt,
    public var `MaximumBuffers`: UInt,
    public var `MaximumFileSize`: UInt,
    public var `LogFileMode`: UInt,
    public var `FlushTimer`: UInt,
    public var `EnableFlags`: `EVENT_TRACE_FLAG`,
    public var `Anonymous1`: `EVENT_TRACE_PROPERTIES_V2_0`,
    public var `NumberOfBuffers`: UInt,
    public var `FreeBuffers`: UInt,
    public var `EventsLost`: UInt,
    public var `BuffersWritten`: UInt,
    public var `LogBuffersLost`: UInt,
    public var `RealTimeBuffersLost`: UInt,
    public var `LoggerThreadId`: `super`.`super`.`super`.`Foundation`.`HANDLE`,
    public var `LogFileNameOffset`: UInt,
    public var `LoggerNameOffset`: UInt,
    public var `Anonymous2`: `EVENT_TRACE_PROPERTIES_V2_1`,
    public var `FilterDescCount`: UInt,
    public var `FilterDesc`: /* Rust *mut */ kotlinx.cinterop.CPointer<`EVENT_FILTER_DESCRIPTOR`>?,
    public var `Anonymous3`: `EVENT_TRACE_PROPERTIES_V2_2`,
)
// UNSUPPORTED Rust 1216:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for EVENT_TRACE_PROPERTIES_V2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1221:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union EVENT_TRACE_PROPERTIES_V2_0 {
//     pub AgeLimit: i32,
//     pub FlushThreshold: i32,
// }

// UNSUPPORTED Rust 1227:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for EVENT_TRACE_PROPERTIES_V2_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1232:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union EVENT_TRACE_PROPERTIES_V2_1 {
//     pub Anonymous: EVENT_TRACE_PROPERTIES_V2_1_0,
//     pub V2Control: u32,
// }

// UNSUPPORTED Rust 1238:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for EVENT_TRACE_PROPERTIES_V2_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EVENT_TRACE_PROPERTIES_V2_1_0` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 1248:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union EVENT_TRACE_PROPERTIES_V2_2 {
//     pub Anonymous: EVENT_TRACE_PROPERTIES_V2_2_0,
//     pub V2Options: u64,
// }

// UNSUPPORTED Rust 1254:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for EVENT_TRACE_PROPERTIES_V2_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EVENT_TRACE_PROPERTIES_V2_2_0` (
    public var `_bitfield`: UInt,
)
public const val `EVENT_TRACE_REAL_TIME_MODE`: UInt = 256u;
public const val `EVENT_TRACE_RELOG_MODE`: UInt = 65536u;
public const val `EVENT_TRACE_SECURE_MODE`: UInt = 128u;
public const val `EVENT_TRACE_STOP_ON_HYBRID_SHUTDOWN`: UInt = 4194304u;
public const val `EVENT_TRACE_SYSTEM_LOGGER_MODE`: UInt = 33554432u;
public const val `EVENT_TRACE_TYPE_ACCEPT`: UInt = 15u;
public const val `EVENT_TRACE_TYPE_ACKDUP`: UInt = 22u;
public const val `EVENT_TRACE_TYPE_ACKFULL`: UInt = 20u;
public const val `EVENT_TRACE_TYPE_ACKPART`: UInt = 21u;
public const val `EVENT_TRACE_TYPE_CHECKPOINT`: UInt = 8u;
public const val `EVENT_TRACE_TYPE_CONFIG`: UInt = 11u;
public const val `EVENT_TRACE_TYPE_CONFIG_BOOT`: UInt = 37u;
public const val `EVENT_TRACE_TYPE_CONFIG_CI_INFO`: UInt = 29u;
public const val `EVENT_TRACE_TYPE_CONFIG_CPU`: UInt = 10u;
public const val `EVENT_TRACE_TYPE_CONFIG_DEFRAG`: UInt = 31u;
public const val `EVENT_TRACE_TYPE_CONFIG_DEVICEFAMILY`: UInt = 33u;
public const val `EVENT_TRACE_TYPE_CONFIG_DPI`: UInt = 28u;
public const val `EVENT_TRACE_TYPE_CONFIG_FLIGHTID`: UInt = 34u;
public const val `EVENT_TRACE_TYPE_CONFIG_IDECHANNEL`: UInt = 23u;
public const val `EVENT_TRACE_TYPE_CONFIG_IRQ`: UInt = 21u;
public const val `EVENT_TRACE_TYPE_CONFIG_LOGICALDISK`: UInt = 12u;
public const val `EVENT_TRACE_TYPE_CONFIG_MACHINEID`: UInt = 30u;
public const val `EVENT_TRACE_TYPE_CONFIG_MOBILEPLATFORM`: UInt = 32u;
public const val `EVENT_TRACE_TYPE_CONFIG_NETINFO`: UInt = 17u;
public const val `EVENT_TRACE_TYPE_CONFIG_NIC`: UInt = 13u;
public const val `EVENT_TRACE_TYPE_CONFIG_NUMANODE`: UInt = 24u;
public const val `EVENT_TRACE_TYPE_CONFIG_OPTICALMEDIA`: UInt = 18u;
public const val `EVENT_TRACE_TYPE_CONFIG_PHYSICALDISK`: UInt = 11u;
public const val `EVENT_TRACE_TYPE_CONFIG_PHYSICALDISK_EX`: UInt = 19u;
public const val `EVENT_TRACE_TYPE_CONFIG_PLATFORM`: UInt = 25u;
public const val `EVENT_TRACE_TYPE_CONFIG_PNP`: UInt = 22u;
public const val `EVENT_TRACE_TYPE_CONFIG_POWER`: UInt = 16u;
public const val `EVENT_TRACE_TYPE_CONFIG_PROCESSOR`: UInt = 35u;
public const val `EVENT_TRACE_TYPE_CONFIG_PROCESSORGROUP`: UInt = 26u;
public const val `EVENT_TRACE_TYPE_CONFIG_PROCESSORNUMBER`: UInt = 27u;
public const val `EVENT_TRACE_TYPE_CONFIG_SERVICES`: UInt = 15u;
public const val `EVENT_TRACE_TYPE_CONFIG_VIDEO`: UInt = 14u;
public const val `EVENT_TRACE_TYPE_CONFIG_VIRTUALIZATION`: UInt = 36u;
public const val `EVENT_TRACE_TYPE_CONNECT`: UInt = 12u;
public const val `EVENT_TRACE_TYPE_CONNFAIL`: UInt = 17u;
public const val `EVENT_TRACE_TYPE_COPY_ARP`: UInt = 19u;
public const val `EVENT_TRACE_TYPE_COPY_TCP`: UInt = 18u;
public const val `EVENT_TRACE_TYPE_DBGID_RSDS`: UInt = 64u;
public const val `EVENT_TRACE_TYPE_DC_END`: UInt = 4u;
public const val `EVENT_TRACE_TYPE_DC_START`: UInt = 3u;
public const val `EVENT_TRACE_TYPE_DEQUEUE`: UInt = 7u;
public const val `EVENT_TRACE_TYPE_DISCONNECT`: UInt = 13u;
public const val `EVENT_TRACE_TYPE_END`: UInt = 2u;
public const val `EVENT_TRACE_TYPE_EXTENSION`: UInt = 5u;
public const val `EVENT_TRACE_TYPE_FLT_POSTOP_COMPLETION`: UInt = 99u;
public const val `EVENT_TRACE_TYPE_FLT_POSTOP_FAILURE`: UInt = 101u;
public const val `EVENT_TRACE_TYPE_FLT_POSTOP_INIT`: UInt = 97u;
public const val `EVENT_TRACE_TYPE_FLT_PREOP_COMPLETION`: UInt = 98u;
public const val `EVENT_TRACE_TYPE_FLT_PREOP_FAILURE`: UInt = 100u;
public const val `EVENT_TRACE_TYPE_FLT_PREOP_INIT`: UInt = 96u;
public const val `EVENT_TRACE_TYPE_GUIDMAP`: UInt = 10u;
public const val `EVENT_TRACE_TYPE_INFO`: UInt = 0u;
public const val `EVENT_TRACE_TYPE_IO_FLUSH`: UInt = 14u;
public const val `EVENT_TRACE_TYPE_IO_FLUSH_INIT`: UInt = 15u;
public const val `EVENT_TRACE_TYPE_IO_READ`: UInt = 10u;
public const val `EVENT_TRACE_TYPE_IO_READ_INIT`: UInt = 12u;
public const val `EVENT_TRACE_TYPE_IO_REDIRECTED_INIT`: UInt = 16u;
public const val `EVENT_TRACE_TYPE_IO_WRITE`: UInt = 11u;
public const val `EVENT_TRACE_TYPE_IO_WRITE_INIT`: UInt = 13u;
public const val `EVENT_TRACE_TYPE_LOAD`: UInt = 10u;
public const val `EVENT_TRACE_TYPE_MM_AV`: UInt = 15u;
public const val `EVENT_TRACE_TYPE_MM_COW`: UInt = 12u;
public const val `EVENT_TRACE_TYPE_MM_DZF`: UInt = 11u;
public const val `EVENT_TRACE_TYPE_MM_GPF`: UInt = 13u;
public const val `EVENT_TRACE_TYPE_MM_HPF`: UInt = 14u;
public const val `EVENT_TRACE_TYPE_MM_TF`: UInt = 10u;
public const val `EVENT_TRACE_TYPE_OPTICAL_IO_FLUSH`: UInt = 57u;
public const val `EVENT_TRACE_TYPE_OPTICAL_IO_FLUSH_INIT`: UInt = 60u;
public const val `EVENT_TRACE_TYPE_OPTICAL_IO_READ`: UInt = 55u;
public const val `EVENT_TRACE_TYPE_OPTICAL_IO_READ_INIT`: UInt = 58u;
public const val `EVENT_TRACE_TYPE_OPTICAL_IO_WRITE`: UInt = 56u;
public const val `EVENT_TRACE_TYPE_OPTICAL_IO_WRITE_INIT`: UInt = 59u;
public const val `EVENT_TRACE_TYPE_RECEIVE`: UInt = 11u;
public const val `EVENT_TRACE_TYPE_RECONNECT`: UInt = 16u;
public const val `EVENT_TRACE_TYPE_REGCLOSE`: UInt = 27u;
public const val `EVENT_TRACE_TYPE_REGCOMMIT`: UInt = 30u;
public const val `EVENT_TRACE_TYPE_REGCREATE`: UInt = 10u;
public const val `EVENT_TRACE_TYPE_REGDELETE`: UInt = 12u;
public const val `EVENT_TRACE_TYPE_REGDELETEVALUE`: UInt = 15u;
public const val `EVENT_TRACE_TYPE_REGENUMERATEKEY`: UInt = 17u;
public const val `EVENT_TRACE_TYPE_REGENUMERATEVALUEKEY`: UInt = 18u;
public const val `EVENT_TRACE_TYPE_REGFLUSH`: UInt = 21u;
public const val `EVENT_TRACE_TYPE_REGKCBCREATE`: UInt = 22u;
public const val `EVENT_TRACE_TYPE_REGKCBDELETE`: UInt = 23u;
public const val `EVENT_TRACE_TYPE_REGKCBRUNDOWNBEGIN`: UInt = 24u;
public const val `EVENT_TRACE_TYPE_REGKCBRUNDOWNEND`: UInt = 25u;
public const val `EVENT_TRACE_TYPE_REGMOUNTHIVE`: UInt = 33u;
public const val `EVENT_TRACE_TYPE_REGOPEN`: UInt = 11u;
public const val `EVENT_TRACE_TYPE_REGPREPARE`: UInt = 31u;
public const val `EVENT_TRACE_TYPE_REGQUERY`: UInt = 13u;
public const val `EVENT_TRACE_TYPE_REGQUERYMULTIPLEVALUE`: UInt = 19u;
public const val `EVENT_TRACE_TYPE_REGQUERYSECURITY`: UInt = 29u;
public const val `EVENT_TRACE_TYPE_REGQUERYVALUE`: UInt = 16u;
public const val `EVENT_TRACE_TYPE_REGROLLBACK`: UInt = 32u;
public const val `EVENT_TRACE_TYPE_REGSETINFORMATION`: UInt = 20u;
public const val `EVENT_TRACE_TYPE_REGSETSECURITY`: UInt = 28u;
public const val `EVENT_TRACE_TYPE_REGSETVALUE`: UInt = 14u;
public const val `EVENT_TRACE_TYPE_REGVIRTUALIZE`: UInt = 26u;
public const val `EVENT_TRACE_TYPE_REPLY`: UInt = 6u;
public const val `EVENT_TRACE_TYPE_RESUME`: UInt = 7u;
public const val `EVENT_TRACE_TYPE_RETRANSMIT`: UInt = 14u;
public const val `EVENT_TRACE_TYPE_SECURITY`: UInt = 13u;
public const val `EVENT_TRACE_TYPE_SEND`: UInt = 10u;
public const val `EVENT_TRACE_TYPE_SIDINFO`: UInt = 12u;
public const val `EVENT_TRACE_TYPE_START`: UInt = 1u;
public const val `EVENT_TRACE_TYPE_STOP`: UInt = 2u;
public const val `EVENT_TRACE_TYPE_SUSPEND`: UInt = 8u;
public const val `EVENT_TRACE_TYPE_TERMINATE`: UInt = 11u;
public const val `EVENT_TRACE_TYPE_WINEVT_RECEIVE`: UInt = 240u;
public const val `EVENT_TRACE_TYPE_WINEVT_SEND`: UInt = 9u;
public const val `EVENT_TRACE_USE_GLOBAL_SEQUENCE`: UInt = 16384u;
public const val `EVENT_TRACE_USE_KBYTES_FOR_SIZE`: UInt = 8192u;
public const val `EVENT_TRACE_USE_LOCAL_SEQUENCE`: UInt = 32768u;
public const val `EVENT_TRACE_USE_NOCPUTIME`: UInt = 2u;
public const val `EVENT_TRACE_USE_PAGED_MEMORY`: UInt = 16777216u;
public const val `EVENT_TRACE_USE_PROCTIME`: UInt = 1u;
public const val `EVENT_WRITE_FLAG_INPRIVATE`: UInt = 2u;
public const val `EVENT_WRITE_FLAG_NO_FAULTING`: UInt = 1u;
public const val `EtwCompressionModeNoDisable`: `ETW_COMPRESSION_RESUMPTION_MODE` = 1;
public const val `EtwCompressionModeNoRestart`: `ETW_COMPRESSION_RESUMPTION_MODE` = 2;
public const val `EtwCompressionModeRestart`: `ETW_COMPRESSION_RESUMPTION_MODE` = 0;
public const val `EtwPmcOwnerFree`: `ETW_PMC_COUNTER_OWNER_TYPE` = 0;
public const val `EtwPmcOwnerTagged`: `ETW_PMC_COUNTER_OWNER_TYPE` = 2;
public const val `EtwPmcOwnerTaggedWithSource`: `ETW_PMC_COUNTER_OWNER_TYPE` = 3;
public const val `EtwPmcOwnerUntagged`: `ETW_PMC_COUNTER_OWNER_TYPE` = 1;
public const val `EtwProviderTraitDecodeGuid`: `ETW_PROVIDER_TRAIT_TYPE` = 2;
public const val `EtwProviderTraitTypeGroup`: `ETW_PROVIDER_TRAIT_TYPE` = 1;
public const val `EtwProviderTraitTypeMax`: `ETW_PROVIDER_TRAIT_TYPE` = 3;
public const val `EtwQueryLastDroppedTimes`: `ETW_PROCESS_HANDLE_INFO_TYPE` = 3;
public const val `EtwQueryLogFileHeader`: `ETW_PROCESS_HANDLE_INFO_TYPE` = 4;
public const val `EtwQueryPartitionInformation`: `ETW_PROCESS_HANDLE_INFO_TYPE` = 1;
public const val `EtwQueryPartitionInformationV2`: `ETW_PROCESS_HANDLE_INFO_TYPE` = 2;
public const val `EtwQueryProcessHandleInfoMax`: `ETW_PROCESS_HANDLE_INFO_TYPE` = 5;
public const val `EventChannelInformation`: `EVENT_FIELD_TYPE` = 2;
public const val `EventInformationMax`: `EVENT_FIELD_TYPE` = 5;
public const val `EventKeywordInformation`: `EVENT_FIELD_TYPE` = 0;
public const val `EventLevelInformation`: `EVENT_FIELD_TYPE` = 1;
public const val `EventOpcodeInformation`: `EVENT_FIELD_TYPE` = 4;
public const val `EventProviderBinaryTrackInfo`: `EVENT_INFO_CLASS` = 0;
public const val `EventProviderSetReserved1`: `EVENT_INFO_CLASS` = 1;
public const val `EventProviderSetTraits`: `EVENT_INFO_CLASS` = 2;
public const val `EventProviderUseDescriptorType`: `EVENT_INFO_CLASS` = 3;
public const val `EventSecurityAddDACL`: `EVENTSECURITYOPERATION` = 2;
public const val `EventSecurityAddSACL`: `EVENTSECURITYOPERATION` = 3;
public const val `EventSecurityMax`: `EVENTSECURITYOPERATION` = 4;
public const val `EventSecuritySetDACL`: `EVENTSECURITYOPERATION` = 0;
public const val `EventSecuritySetSACL`: `EVENTSECURITYOPERATION` = 1;
public const val `EventTaskInformation`: `EVENT_FIELD_TYPE` = 3;
// UNSUPPORTED Rust 1417:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const EventTraceConfigGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x01853a65_418f_4f36_aefc_dc0f1d2fd235);

// UNSUPPORTED Rust 1418:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const EventTraceGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x68fdd900_4a3e_11d1_84f4_0000f80464e3);

// UNSUPPORTED Rust 1419:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const FileIoGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x90cbdc39_4a3e_11d1_84f4_0000f80464e3);

// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `GLOBAL_LOGGER_NAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("GlobalLogger");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `GLOBAL_LOGGER_NAMEA`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("GlobalLogger");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `GLOBAL_LOGGER_NAMEW`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("GlobalLogger");
// UNSUPPORTED Rust 1423:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const ImageLoadGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2cb15d1d_5fc1_11d2_abe1_00a0c911f518);

// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `KERNEL_LOGGER_NAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("NT Kernel Logger");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `KERNEL_LOGGER_NAMEA`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("NT Kernel Logger");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `KERNEL_LOGGER_NAMEW`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("NT Kernel Logger");
public typealias `MAP_FLAGS` = Int;
public typealias `MAP_VALUETYPE` = Int;
public const val `MAX_EVENT_DATA_DESCRIPTORS`: UInt = 128u;
public const val `MAX_EVENT_FILTERS_COUNT`: UInt = 13u;
public const val `MAX_EVENT_FILTER_DATA_SIZE`: UInt = 1024u;
public const val `MAX_EVENT_FILTER_EVENT_ID_COUNT`: UInt = 64u;
public const val `MAX_EVENT_FILTER_EVENT_NAME_SIZE`: UInt = 4096u;
public const val `MAX_EVENT_FILTER_PAYLOAD_SIZE`: UInt = 4096u;
public const val `MAX_EVENT_FILTER_PID_COUNT`: UInt = 8u;
public const val `MAX_MOF_FIELDS`: UInt = 16u;
public const val `MAX_PAYLOAD_PREDICATES`: UInt = 8u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MOF_FIELD` (
    public var `DataPtr`: ULong,
    public var `Length`: UInt,
    public var `DataType`: UInt,
)
public const val `MaxEventInfo`: `EVENT_INFO_CLASS` = 4;
public const val `MaxTraceSetInfoClass`: `TRACE_QUERY_INFO_CLASS` = 28;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `OFFSETINSTANCEDATAANDLENGTH` (
    public var `OffsetInstanceData`: UInt,
    public var `LengthInstanceData`: UInt,
)
public const val `PAYLOADFIELD_BETWEEN`: `PAYLOAD_OPERATOR` = 6;
public const val `PAYLOADFIELD_CONTAINS`: `PAYLOAD_OPERATOR` = 20;
public const val `PAYLOADFIELD_DOESNTCONTAIN`: `PAYLOAD_OPERATOR` = 21;
public const val `PAYLOADFIELD_EQ`: `PAYLOAD_OPERATOR` = 0;
public const val `PAYLOADFIELD_GE`: `PAYLOAD_OPERATOR` = 5;
public const val `PAYLOADFIELD_GT`: `PAYLOAD_OPERATOR` = 3;
public const val `PAYLOADFIELD_INVALID`: `PAYLOAD_OPERATOR` = 32;
public const val `PAYLOADFIELD_IS`: `PAYLOAD_OPERATOR` = 30;
public const val `PAYLOADFIELD_ISNOT`: `PAYLOAD_OPERATOR` = 31;
public const val `PAYLOADFIELD_LE`: `PAYLOAD_OPERATOR` = 2;
public const val `PAYLOADFIELD_LT`: `PAYLOAD_OPERATOR` = 4;
public const val `PAYLOADFIELD_MODULO`: `PAYLOAD_OPERATOR` = 8;
public const val `PAYLOADFIELD_NE`: `PAYLOAD_OPERATOR` = 1;
public const val `PAYLOADFIELD_NOTBETWEEN`: `PAYLOAD_OPERATOR` = 7;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PAYLOAD_FILTER_PREDICATE` (
    public var `FieldName`: `windows_sys`.`core`.`PWSTR`,
    public var `CompareOp`: UShort,
    public var `Value`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 1474:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PAYLOAD_FILTER_PREDICATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `PAYLOAD_OPERATOR` = Int;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PENABLECALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ENABLECALLBACK_ENABLED_STATE`, UByte, ULong, ULong, /* Rust *const */ kotlinx.cinterop.CPointer<`EVENT_FILTER_DESCRIPTOR`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Time")]
public typealias `PETW_BUFFER_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`ETW_BUFFER_HEADER`>?, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`ETW_BUFFER_CALLBACK_INFORMATION`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PETW_BUFFER_COMPLETION_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`ETW_BUFFER_HEADER`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PEVENT_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`EVENT_TRACE`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PEVENT_RECORD_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`EVENT_RECORD`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Time")]
public typealias `PEVENT_TRACE_BUFFER_CALLBACKA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`EVENT_TRACE_LOGFILEA`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Time")]
public typealias `PEVENT_TRACE_BUFFER_CALLBACKW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`EVENT_TRACE_LOGFILEW`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PROCESSTRACE_HANDLE` (
    public var `Value`: ULong,
)
public const val `PROCESS_TRACE_MODE_EVENT_RECORD`: UInt = 268435456u;
public const val `PROCESS_TRACE_MODE_RAW_TIMESTAMP`: UInt = 4096u;
public const val `PROCESS_TRACE_MODE_REAL_TIME`: UInt = 256u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PROFILE_SOURCE_INFO` (
    public var `NextEntryOffset`: UInt,
    public var `Source`: UInt,
    public var `MinInterval`: UInt,
    public var `MaxInterval`: UInt,
    public var `Reserved`: ULong,
    public var `Description`: UShortArray,
)
// UNSUPPORTED Rust 1508:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROFILE_SOURCE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PROPERTY_DATA_DESCRIPTOR` (
    public var `PropertyName`: ULong,
    public var `ArrayIndex`: UInt,
    public var `Reserved`: UInt,
)
public typealias `PROPERTY_FLAGS` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PROVIDER_ENUMERATION_INFO` (
    public var `NumberOfProviders`: UInt,
    public var `Reserved`: UInt,
    public var `TraceProviderInfoArray`: Array<`TRACE_PROVIDER_INFO`>,
)
// UNSUPPORTED Rust 1528:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROVIDER_ENUMERATION_INFO {
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
public class `PROVIDER_EVENT_INFO` (
    public var `NumberOfEvents`: UInt,
    public var `Reserved`: UInt,
    public var `EventDescriptorsArray`: Array<`EVENT_DESCRIPTOR`>,
)
// UNSUPPORTED Rust 1540:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROVIDER_EVENT_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PROVIDER_FIELD_INFO` (
    public var `NameOffset`: UInt,
    public var `DescriptionOffset`: UInt,
    public var `Value`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PROVIDER_FIELD_INFOARRAY` (
    public var `NumberOfElements`: UInt,
    public var `FieldType`: `EVENT_FIELD_TYPE`,
    public var `FieldInfoArray`: Array<`PROVIDER_FIELD_INFO`>,
)
// UNSUPPORTED Rust 1559:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROVIDER_FIELD_INFOARRAY {
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
public class `PROVIDER_FILTER_INFO` (
    public var `Id`: UByte,
    public var `Version`: UByte,
    public var `MessageOffset`: UInt,
    public var `Reserved`: UInt,
    public var `PropertyCount`: UInt,
    public var `EventPropertyInfoArray`: Array<`EVENT_PROPERTY_INFO`>,
)
// UNSUPPORTED Rust 1574:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PROVIDER_FILTER_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1579:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const PageFaultGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3d6fa8d3_fe05_11d0_9dda_00c04fd7ba7c);

// UNSUPPORTED Rust 1580:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const PerfInfoGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xce1dbfb4_137e_4da6_87b0_3f59aa102cbc);

// UNSUPPORTED Rust 1581:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const PrivateLoggerNotificationGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3595ab5c_042a_4c8e_b942_2d059bfeb1b1);

// UNSUPPORTED Rust 1582:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const ProcessGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3d6fa8d0_fe05_11d0_9dda_00c04fd7ba7c);

public const val `PropertyHasCustomSchema`: `PROPERTY_FLAGS` = 128;
public const val `PropertyHasTags`: `PROPERTY_FLAGS` = 64;
public const val `PropertyParamCount`: `PROPERTY_FLAGS` = 4;
public const val `PropertyParamFixedCount`: `PROPERTY_FLAGS` = 32;
public const val `PropertyParamFixedLength`: `PROPERTY_FLAGS` = 16;
public const val `PropertyParamLength`: `PROPERTY_FLAGS` = 2;
public const val `PropertyStruct`: `PROPERTY_FLAGS` = 1;
public const val `PropertyWBEMXmlFragment`: `PROPERTY_FLAGS` = 8;
public typealias `REGHANDLE` = Long;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `RELOGSTREAM_HANDLE` (
    public var `Value`: ULong,
)
// UNSUPPORTED Rust 1597:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const RegistryGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xae53722e_c863_11d2_8659_00c04fa321a1);

public const val `SYSTEM_ALPC_KW_GENERAL`: ULong = 1uL;
public const val `SYSTEM_CONFIG_KW_GRAPHICS`: ULong = 2uL;
public const val `SYSTEM_CONFIG_KW_NETWORK`: ULong = 8uL;
public const val `SYSTEM_CONFIG_KW_OPTICAL`: ULong = 64uL;
public const val `SYSTEM_CONFIG_KW_PNP`: ULong = 32uL;
public const val `SYSTEM_CONFIG_KW_SERVICES`: ULong = 16uL;
public const val `SYSTEM_CONFIG_KW_STORAGE`: ULong = 4uL;
public const val `SYSTEM_CONFIG_KW_SYSTEM`: ULong = 1uL;
public const val `SYSTEM_CPU_KW_CACHE_FLUSH`: ULong = 2uL;
public const val `SYSTEM_CPU_KW_CONFIG`: ULong = 1uL;
public const val `SYSTEM_CPU_KW_SPEC_CONTROL`: ULong = 4uL;
public const val `SYSTEM_EVENT_TYPE`: UInt = 1u;
public const val `SYSTEM_HYPERVISOR_KW_CALLOUTS`: ULong = 2uL;
public const val `SYSTEM_HYPERVISOR_KW_PROFILE`: ULong = 1uL;
public const val `SYSTEM_HYPERVISOR_KW_VTL_CHANGE`: ULong = 4uL;
public const val `SYSTEM_INTERRUPT_KW_CLOCK_INTERRUPT`: ULong = 2uL;
public const val `SYSTEM_INTERRUPT_KW_DPC`: ULong = 4uL;
public const val `SYSTEM_INTERRUPT_KW_DPC_QUEUE`: ULong = 8uL;
public const val `SYSTEM_INTERRUPT_KW_GENERAL`: ULong = 1uL;
public const val `SYSTEM_INTERRUPT_KW_IPI`: ULong = 64uL;
public const val `SYSTEM_INTERRUPT_KW_WDF_DPC`: ULong = 16uL;
public const val `SYSTEM_INTERRUPT_KW_WDF_INTERRUPT`: ULong = 32uL;
public const val `SYSTEM_IOFILTER_KW_FAILURE`: ULong = 8uL;
public const val `SYSTEM_IOFILTER_KW_FASTIO`: ULong = 4uL;
public const val `SYSTEM_IOFILTER_KW_GENERAL`: ULong = 1uL;
public const val `SYSTEM_IOFILTER_KW_INIT`: ULong = 2uL;
public const val `SYSTEM_IO_KW_CC`: ULong = 256uL;
public const val `SYSTEM_IO_KW_DISK`: ULong = 1uL;
public const val `SYSTEM_IO_KW_DISK_INIT`: ULong = 2uL;
public const val `SYSTEM_IO_KW_DRIVERS`: ULong = 128uL;
public const val `SYSTEM_IO_KW_FILE`: ULong = 16uL;
public const val `SYSTEM_IO_KW_FILENAME`: ULong = 4uL;
public const val `SYSTEM_IO_KW_NETWORK`: ULong = 512uL;
public const val `SYSTEM_IO_KW_OPTICAL`: ULong = 32uL;
public const val `SYSTEM_IO_KW_OPTICAL_INIT`: ULong = 64uL;
public const val `SYSTEM_IO_KW_SPLIT`: ULong = 8uL;
public const val `SYSTEM_LOCK_KW_SPINLOCK`: ULong = 1uL;
public const val `SYSTEM_LOCK_KW_SPINLOCK_COUNTERS`: ULong = 2uL;
public const val `SYSTEM_LOCK_KW_SYNC_OBJECTS`: ULong = 4uL;
public const val `SYSTEM_MEMORY_KW_ALL_FAULTS`: ULong = 4uL;
public const val `SYSTEM_MEMORY_KW_CONTMEM_GEN`: ULong = 512uL;
public const val `SYSTEM_MEMORY_KW_FOOTPRINT`: ULong = 2048uL;
public const val `SYSTEM_MEMORY_KW_GENERAL`: ULong = 1uL;
public const val `SYSTEM_MEMORY_KW_HARD_FAULTS`: ULong = 2uL;
public const val `SYSTEM_MEMORY_KW_HEAP`: ULong = 128uL;
public const val `SYSTEM_MEMORY_KW_MEMINFO`: ULong = 16uL;
public const val `SYSTEM_MEMORY_KW_MEMINFO_WS`: ULong = 64uL;
public const val `SYSTEM_MEMORY_KW_NONTRADEABLE`: ULong = 32768uL;
public const val `SYSTEM_MEMORY_KW_PFSECTION`: ULong = 32uL;
public const val `SYSTEM_MEMORY_KW_POOL`: ULong = 8uL;
public const val `SYSTEM_MEMORY_KW_REFSET`: ULong = 8192uL;
public const val `SYSTEM_MEMORY_KW_SESSION`: ULong = 4096uL;
public const val `SYSTEM_MEMORY_KW_VAMAP`: ULong = 16384uL;
public const val `SYSTEM_MEMORY_KW_VIRTUAL_ALLOC`: ULong = 1024uL;
public const val `SYSTEM_MEMORY_KW_WS`: ULong = 256uL;
public const val `SYSTEM_MEMORY_POOL_FILTER_ID`: UInt = 1u;
public const val `SYSTEM_OBJECT_KW_GENERAL`: ULong = 1uL;
public const val `SYSTEM_OBJECT_KW_HANDLE`: ULong = 2uL;
public const val `SYSTEM_POWER_KW_GENERAL`: ULong = 1uL;
public const val `SYSTEM_POWER_KW_HIBER_RUNDOWN`: ULong = 2uL;
public const val `SYSTEM_POWER_KW_IDLE_SELECTION`: ULong = 8uL;
public const val `SYSTEM_POWER_KW_PPM_EXIT_LATENCY`: ULong = 16uL;
public const val `SYSTEM_POWER_KW_PROCESSOR_IDLE`: ULong = 4uL;
public const val `SYSTEM_PROCESS_KW_DBGPRINT`: ULong = 256uL;
public const val `SYSTEM_PROCESS_KW_DEBUG_EVENTS`: ULong = 128uL;
public const val `SYSTEM_PROCESS_KW_FREEZE`: ULong = 4uL;
public const val `SYSTEM_PROCESS_KW_GENERAL`: ULong = 1uL;
public const val `SYSTEM_PROCESS_KW_INSWAP`: ULong = 2uL;
public const val `SYSTEM_PROCESS_KW_JOB`: ULong = 512uL;
public const val `SYSTEM_PROCESS_KW_LOADER`: ULong = 4096uL;
public const val `SYSTEM_PROCESS_KW_PERF_COUNTER`: ULong = 8uL;
public const val `SYSTEM_PROCESS_KW_THREAD`: ULong = 2048uL;
public const val `SYSTEM_PROCESS_KW_WAKE_COUNTER`: ULong = 16uL;
public const val `SYSTEM_PROCESS_KW_WAKE_DROP`: ULong = 32uL;
public const val `SYSTEM_PROCESS_KW_WAKE_EVENT`: ULong = 64uL;
public const val `SYSTEM_PROCESS_KW_WORKER_THREAD`: ULong = 1024uL;
public const val `SYSTEM_PROFILE_KW_GENERAL`: ULong = 1uL;
public const val `SYSTEM_PROFILE_KW_PMC_PROFILE`: ULong = 2uL;
public const val `SYSTEM_REGISTRY_KW_GENERAL`: ULong = 1uL;
public const val `SYSTEM_REGISTRY_KW_HIVE`: ULong = 2uL;
public const val `SYSTEM_REGISTRY_KW_NOTIFICATION`: ULong = 4uL;
public const val `SYSTEM_SCHEDULER_KW_AFFINITY`: ULong = 64uL;
public const val `SYSTEM_SCHEDULER_KW_ANTI_STARVATION`: ULong = 16uL;
public const val `SYSTEM_SCHEDULER_KW_COMPACT_CSWITCH`: ULong = 1024uL;
public const val `SYSTEM_SCHEDULER_KW_CONTEXT_SWITCH`: ULong = 512uL;
public const val `SYSTEM_SCHEDULER_KW_DISPATCHER`: ULong = 2uL;
public const val `SYSTEM_SCHEDULER_KW_IDEAL_PROCESSOR`: ULong = 256uL;
public const val `SYSTEM_SCHEDULER_KW_KERNEL_QUEUE`: ULong = 4uL;
public const val `SYSTEM_SCHEDULER_KW_LOAD_BALANCER`: ULong = 32uL;
public const val `SYSTEM_SCHEDULER_KW_PRIORITY`: ULong = 128uL;
public const val `SYSTEM_SCHEDULER_KW_SHOULD_YIELD`: ULong = 8uL;
public const val `SYSTEM_SCHEDULER_KW_XSCHEDULER`: ULong = 1uL;
public const val `SYSTEM_SYSCALL_KW_GENERAL`: ULong = 1uL;
public const val `SYSTEM_TIMER_KW_CLOCK_TIMER`: ULong = 2uL;
public const val `SYSTEM_TIMER_KW_GENERAL`: ULong = 1uL;
// UNSUPPORTED Rust 1693:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const SplitIoGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd837ca92_12b9_44a5_ad6a_3a65b3578aa8);

// UNSUPPORTED Rust 1694:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const SystemAlpcProviderGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfcb9baaf_e529_4980_92e9_ced1a6aadfdf);

// UNSUPPORTED Rust 1695:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const SystemConfigProviderGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfef3a8b6_318d_4b67_a96a_3b0f6b8f18fe);

// UNSUPPORTED Rust 1696:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const SystemCpuProviderGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc6c5265f_eae8_4650_aae4_9d48603d8510);

// UNSUPPORTED Rust 1697:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const SystemHypervisorProviderGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbafa072a_918a_4bed_b622_bc152097098f);

// UNSUPPORTED Rust 1698:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const SystemInterruptProviderGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd4bbee17_b545_4888_858b_744169015b25);

// UNSUPPORTED Rust 1699:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const SystemIoFilterProviderGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfbd09363_9e22_4661_b8bf_e7a34b535b8c);

// UNSUPPORTED Rust 1700:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const SystemIoProviderGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3d5c43e3_0f1c_4202_b817_174c0070dc79);

// UNSUPPORTED Rust 1701:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const SystemLockProviderGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x721ddfd3_dacc_4e1e_b26a_a2cb31d4705a);

// UNSUPPORTED Rust 1702:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const SystemMemoryProviderGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x82958ca9_b6cd_47f8_a3a8_03ae85a4bc24);

// UNSUPPORTED Rust 1703:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const SystemObjectProviderGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfebd7460_3d1d_47eb_af49_c9eeb1e146f2);

// UNSUPPORTED Rust 1704:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const SystemPowerProviderGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc134884a_32d5_4488_80e5_14ed7abb8269);

// UNSUPPORTED Rust 1705:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const SystemProcessProviderGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x151f55dc_467d_471f_83b5_5f889d46ff66);

// UNSUPPORTED Rust 1706:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const SystemProfileProviderGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbfeb0324_1cee_496f_a409_2ac2b48a6322);

// UNSUPPORTED Rust 1707:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const SystemRegistryProviderGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x16156bd9_fab4_4cfa_a232_89d1099058e3);

// UNSUPPORTED Rust 1708:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const SystemSchedulerProviderGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x599a2a76_4d91_4910_9ac7_7d33f2e97a6c);

// UNSUPPORTED Rust 1709:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const SystemSyscallProviderGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x434286f7_6f1b_45bb_b37e_95f623046c7c);

// UNSUPPORTED Rust 1710:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const SystemTimerProviderGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4f061568_e215_499f_ab2e_eda0ae890a5b);

// UNSUPPORTED Rust 1711:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const SystemTraceControlGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9e814aad_3204_11d2_9a82_006008a86939);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TDH_CONTEXT` (
    public var `ParameterValue`: ULong,
    public var `ParameterType`: `TDH_CONTEXT_TYPE`,
    public var `ParameterSize`: UInt,
)
public const val `TDH_CONTEXT_MAXIMUM`: `TDH_CONTEXT_TYPE` = 5;
public const val `TDH_CONTEXT_PDB_PATH`: `TDH_CONTEXT_TYPE` = 4;
public const val `TDH_CONTEXT_POINTERSIZE`: `TDH_CONTEXT_TYPE` = 3;
public typealias `TDH_CONTEXT_TYPE` = Int;
public const val `TDH_CONTEXT_WPP_GMT`: `TDH_CONTEXT_TYPE` = 2;
public const val `TDH_CONTEXT_WPP_TMFFILE`: `TDH_CONTEXT_TYPE` = 0;
public const val `TDH_CONTEXT_WPP_TMFSEARCHPATH`: `TDH_CONTEXT_TYPE` = 1;
public typealias `TDH_HANDLE` = Long;
public const val `TDH_INTYPE_ANSICHAR`: `_TDH_IN_TYPE` = 307;
public const val `TDH_INTYPE_ANSISTRING`: `_TDH_IN_TYPE` = 2;
public const val `TDH_INTYPE_BINARY`: `_TDH_IN_TYPE` = 14;
public const val `TDH_INTYPE_BOOLEAN`: `_TDH_IN_TYPE` = 13;
public const val `TDH_INTYPE_COUNTEDANSISTRING`: `_TDH_IN_TYPE` = 301;
public const val `TDH_INTYPE_COUNTEDSTRING`: `_TDH_IN_TYPE` = 300;
public const val `TDH_INTYPE_DOUBLE`: `_TDH_IN_TYPE` = 12;
public const val `TDH_INTYPE_FILETIME`: `_TDH_IN_TYPE` = 17;
public const val `TDH_INTYPE_FLOAT`: `_TDH_IN_TYPE` = 11;
public const val `TDH_INTYPE_GUID`: `_TDH_IN_TYPE` = 15;
public const val `TDH_INTYPE_HEXDUMP`: `_TDH_IN_TYPE` = 309;
public const val `TDH_INTYPE_HEXINT32`: `_TDH_IN_TYPE` = 20;
public const val `TDH_INTYPE_HEXINT64`: `_TDH_IN_TYPE` = 21;
public const val `TDH_INTYPE_INT16`: `_TDH_IN_TYPE` = 5;
public const val `TDH_INTYPE_INT32`: `_TDH_IN_TYPE` = 7;
public const val `TDH_INTYPE_INT64`: `_TDH_IN_TYPE` = 9;
public const val `TDH_INTYPE_INT8`: `_TDH_IN_TYPE` = 3;
public const val `TDH_INTYPE_MANIFEST_COUNTEDANSISTRING`: `_TDH_IN_TYPE` = 23;
public const val `TDH_INTYPE_MANIFEST_COUNTEDBINARY`: `_TDH_IN_TYPE` = 25;
public const val `TDH_INTYPE_MANIFEST_COUNTEDSTRING`: `_TDH_IN_TYPE` = 22;
public const val `TDH_INTYPE_NONNULLTERMINATEDANSISTRING`: `_TDH_IN_TYPE` = 305;
public const val `TDH_INTYPE_NONNULLTERMINATEDSTRING`: `_TDH_IN_TYPE` = 304;
public const val `TDH_INTYPE_NULL`: `_TDH_IN_TYPE` = 0;
public const val `TDH_INTYPE_POINTER`: `_TDH_IN_TYPE` = 16;
public const val `TDH_INTYPE_RESERVED24`: `_TDH_IN_TYPE` = 24;
public const val `TDH_INTYPE_REVERSEDCOUNTEDANSISTRING`: `_TDH_IN_TYPE` = 303;
public const val `TDH_INTYPE_REVERSEDCOUNTEDSTRING`: `_TDH_IN_TYPE` = 302;
public const val `TDH_INTYPE_SID`: `_TDH_IN_TYPE` = 19;
public const val `TDH_INTYPE_SIZET`: `_TDH_IN_TYPE` = 308;
public const val `TDH_INTYPE_SYSTEMTIME`: `_TDH_IN_TYPE` = 18;
public const val `TDH_INTYPE_UINT16`: `_TDH_IN_TYPE` = 6;
public const val `TDH_INTYPE_UINT32`: `_TDH_IN_TYPE` = 8;
public const val `TDH_INTYPE_UINT64`: `_TDH_IN_TYPE` = 10;
public const val `TDH_INTYPE_UINT8`: `_TDH_IN_TYPE` = 4;
public const val `TDH_INTYPE_UNICODECHAR`: `_TDH_IN_TYPE` = 306;
public const val `TDH_INTYPE_UNICODESTRING`: `_TDH_IN_TYPE` = 1;
public const val `TDH_INTYPE_WBEMSID`: `_TDH_IN_TYPE` = 310;
public const val `TDH_OUTTYPE_BOOLEAN`: `_TDH_OUT_TYPE` = 13;
public const val `TDH_OUTTYPE_BYTE`: `_TDH_OUT_TYPE` = 3;
public const val `TDH_OUTTYPE_CIMDATETIME`: `_TDH_OUT_TYPE` = 26;
public const val `TDH_OUTTYPE_CODE_POINTER`: `_TDH_OUT_TYPE` = 37;
public const val `TDH_OUTTYPE_CULTURE_INSENSITIVE_DATETIME`: `_TDH_OUT_TYPE` = 33;
public const val `TDH_OUTTYPE_DATETIME`: `_TDH_OUT_TYPE` = 2;
public const val `TDH_OUTTYPE_DATETIME_UTC`: `_TDH_OUT_TYPE` = 38;
public const val `TDH_OUTTYPE_DOUBLE`: `_TDH_OUT_TYPE` = 12;
public const val `TDH_OUTTYPE_ERRORCODE`: `_TDH_OUT_TYPE` = 29;
public const val `TDH_OUTTYPE_ETWTIME`: `_TDH_OUT_TYPE` = 27;
public const val `TDH_OUTTYPE_FLOAT`: `_TDH_OUT_TYPE` = 11;
public const val `TDH_OUTTYPE_GUID`: `_TDH_OUT_TYPE` = 14;
public const val `TDH_OUTTYPE_HEXBINARY`: `_TDH_OUT_TYPE` = 15;
public const val `TDH_OUTTYPE_HEXINT16`: `_TDH_OUT_TYPE` = 17;
public const val `TDH_OUTTYPE_HEXINT32`: `_TDH_OUT_TYPE` = 18;
public const val `TDH_OUTTYPE_HEXINT64`: `_TDH_OUT_TYPE` = 19;
public const val `TDH_OUTTYPE_HEXINT8`: `_TDH_OUT_TYPE` = 16;
public const val `TDH_OUTTYPE_HRESULT`: `_TDH_OUT_TYPE` = 32;
public const val `TDH_OUTTYPE_INT`: `_TDH_OUT_TYPE` = 7;
public const val `TDH_OUTTYPE_IPV4`: `_TDH_OUT_TYPE` = 23;
public const val `TDH_OUTTYPE_IPV6`: `_TDH_OUT_TYPE` = 24;
public const val `TDH_OUTTYPE_JSON`: `_TDH_OUT_TYPE` = 34;
public const val `TDH_OUTTYPE_LONG`: `_TDH_OUT_TYPE` = 9;
public const val `TDH_OUTTYPE_NOPRINT`: `_TDH_OUT_TYPE` = 301;
public const val `TDH_OUTTYPE_NTSTATUS`: `_TDH_OUT_TYPE` = 31;
public const val `TDH_OUTTYPE_NULL`: `_TDH_OUT_TYPE` = 0;
public const val `TDH_OUTTYPE_PID`: `_TDH_OUT_TYPE` = 20;
public const val `TDH_OUTTYPE_PKCS7_WITH_TYPE_INFO`: `_TDH_OUT_TYPE` = 36;
public const val `TDH_OUTTYPE_PORT`: `_TDH_OUT_TYPE` = 22;
public const val `TDH_OUTTYPE_REDUCEDSTRING`: `_TDH_OUT_TYPE` = 300;
public const val `TDH_OUTTYPE_SHORT`: `_TDH_OUT_TYPE` = 5;
public const val `TDH_OUTTYPE_SOCKETADDRESS`: `_TDH_OUT_TYPE` = 25;
public const val `TDH_OUTTYPE_STRING`: `_TDH_OUT_TYPE` = 1;
public const val `TDH_OUTTYPE_TID`: `_TDH_OUT_TYPE` = 21;
public const val `TDH_OUTTYPE_UNSIGNEDBYTE`: `_TDH_OUT_TYPE` = 4;
public const val `TDH_OUTTYPE_UNSIGNEDINT`: `_TDH_OUT_TYPE` = 8;
public const val `TDH_OUTTYPE_UNSIGNEDLONG`: `_TDH_OUT_TYPE` = 10;
public const val `TDH_OUTTYPE_UNSIGNEDSHORT`: `_TDH_OUT_TYPE` = 6;
public const val `TDH_OUTTYPE_UTF8`: `_TDH_OUT_TYPE` = 35;
public const val `TDH_OUTTYPE_WIN32ERROR`: `_TDH_OUT_TYPE` = 30;
public const val `TDH_OUTTYPE_XML`: `_TDH_OUT_TYPE` = 28;
public const val `TEMPLATE_CONTROL_GUID`: `TEMPLATE_FLAGS` = 4;
public const val `TEMPLATE_EVENT_DATA`: `TEMPLATE_FLAGS` = 1;
public typealias `TEMPLATE_FLAGS` = Int;
public const val `TEMPLATE_USER_DATA`: `TEMPLATE_FLAGS` = 2;
public const val `TRACELOG_ACCESS_KERNEL_LOGGER`: UInt = 256u;
public const val `TRACELOG_ACCESS_REALTIME`: UInt = 1024u;
public const val `TRACELOG_CREATE_INPROC`: UInt = 512u;
public const val `TRACELOG_CREATE_ONDISK`: UInt = 64u;
public const val `TRACELOG_CREATE_REALTIME`: UInt = 32u;
public const val `TRACELOG_GUID_ENABLE`: UInt = 128u;
public const val `TRACELOG_JOIN_GROUP`: UInt = 4096u;
public const val `TRACELOG_LOG_EVENT`: UInt = 512u;
public const val `TRACELOG_REGISTER_GUIDS`: UInt = 2048u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TRACE_ENABLE_INFO` (
    public var `IsEnabled`: UInt,
    public var `Level`: UByte,
    public var `Reserved1`: UByte,
    public var `LoggerId`: UShort,
    public var `EnableProperty`: UInt,
    public var `Reserved2`: UInt,
    public var `MatchAnyKeyword`: ULong,
    public var `MatchAllKeyword`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TRACE_EVENT_INFO` (
    public var `ProviderGuid`: `windows_sys`.`core`.`GUID`,
    public var `EventGuid`: `windows_sys`.`core`.`GUID`,
    public var `EventDescriptor`: `EVENT_DESCRIPTOR`,
    public var `DecodingSource`: `DECODING_SOURCE`,
    public var `ProviderNameOffset`: UInt,
    public var `LevelNameOffset`: UInt,
    public var `ChannelNameOffset`: UInt,
    public var `KeywordsNameOffset`: UInt,
    public var `TaskNameOffset`: UInt,
    public var `OpcodeNameOffset`: UInt,
    public var `EventMessageOffset`: UInt,
    public var `ProviderMessageOffset`: UInt,
    public var `BinaryXMLOffset`: UInt,
    public var `BinaryXMLSize`: UInt,
    public var `Anonymous1`: `TRACE_EVENT_INFO_0`,
    public var `Anonymous2`: `TRACE_EVENT_INFO_1`,
    public var `PropertyCount`: UInt,
    public var `TopLevelPropertyCount`: UInt,
    public var `Anonymous3`: `TRACE_EVENT_INFO_2`,
    public var `EventPropertyInfoArray`: Array<`EVENT_PROPERTY_INFO`>,
)
// UNSUPPORTED Rust 1854:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TRACE_EVENT_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1859:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union TRACE_EVENT_INFO_0 {
//     pub EventNameOffset: u32,
//     pub ActivityIDNameOffset: u32,
// }

// UNSUPPORTED Rust 1865:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TRACE_EVENT_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1870:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union TRACE_EVENT_INFO_1 {
//     pub EventAttributesOffset: u32,
//     pub RelatedActivityIDNameOffset: u32,
// }

// UNSUPPORTED Rust 1876:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TRACE_EVENT_INFO_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1881:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union TRACE_EVENT_INFO_2 {
//     pub Flags: TEMPLATE_FLAGS,
//     pub Anonymous: TRACE_EVENT_INFO_2_0,
// }

// UNSUPPORTED Rust 1887:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TRACE_EVENT_INFO_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TRACE_EVENT_INFO_2_0` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TRACE_GUID_INFO` (
    public var `InstanceCount`: UInt,
    public var `Reserved`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TRACE_GUID_PROPERTIES` (
    public var `Guid`: `windows_sys`.`core`.`GUID`,
    public var `GuidType`: UInt,
    public var `LoggerId`: UInt,
    public var `EnableLevel`: UInt,
    public var `EnableFlags`: UInt,
    public var `IsEnable`: Boolean,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TRACE_GUID_REGISTRATION` (
    public var `Guid`: /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
    public var `RegHandle`: `super`.`super`.`super`.`Foundation`.`HANDLE`,
)
// UNSUPPORTED Rust 1919:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for TRACE_GUID_REGISTRATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `TRACE_HEADER_FLAG_LOG_WNODE`: UInt = 262144u;
public const val `TRACE_HEADER_FLAG_TRACED_GUID`: UInt = 131072u;
public const val `TRACE_HEADER_FLAG_USE_GUID_PTR`: UInt = 524288u;
public const val `TRACE_HEADER_FLAG_USE_MOF_PTR`: UInt = 1048576u;
public const val `TRACE_HEADER_FLAG_USE_TIMESTAMP`: UInt = 512u;
public const val `TRACE_LEVEL_CRITICAL`: UInt = 1u;
public const val `TRACE_LEVEL_ERROR`: UInt = 2u;
public const val `TRACE_LEVEL_FATAL`: UInt = 1u;
public const val `TRACE_LEVEL_INFORMATION`: UInt = 4u;
public const val `TRACE_LEVEL_NONE`: UInt = 0u;
public const val `TRACE_LEVEL_RESERVED6`: UInt = 6u;
public const val `TRACE_LEVEL_RESERVED7`: UInt = 7u;
public const val `TRACE_LEVEL_RESERVED8`: UInt = 8u;
public const val `TRACE_LEVEL_RESERVED9`: UInt = 9u;
public const val `TRACE_LEVEL_VERBOSE`: UInt = 5u;
public const val `TRACE_LEVEL_WARNING`: UInt = 3u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Time")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TRACE_LOGFILE_HEADER` (
    public var `BufferSize`: UInt,
    public var `Anonymous1`: `TRACE_LOGFILE_HEADER_0`,
    public var `ProviderVersion`: UInt,
    public var `NumberOfProcessors`: UInt,
    public var `EndTime`: Long,
    public var `TimerResolution`: UInt,
    public var `MaximumFileSize`: UInt,
    public var `LogFileMode`: UInt,
    public var `BuffersWritten`: UInt,
    public var `Anonymous2`: `TRACE_LOGFILE_HEADER_1`,
    public var `LoggerName`: `windows_sys`.`core`.`PWSTR`,
    public var `LogFileName`: `windows_sys`.`core`.`PWSTR`,
    public var `TimeZone`: `super`.`super`.`Time`.`TIME_ZONE_INFORMATION`,
    public var `BootTime`: Long,
    public var `PerfFreq`: Long,
    public var `StartTime`: Long,
    public var `ReservedFlags`: UInt,
    public var `BuffersLost`: UInt,
)
// UNSUPPORTED Rust 1963:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Time")]
// impl Default for TRACE_LOGFILE_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1969:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_System_Time")]
// #[derive(Clone, Copy)]
// pub union TRACE_LOGFILE_HEADER_0 {
//     pub Version: u32,
//     pub VersionDetail: TRACE_LOGFILE_HEADER_0_0,
// }

// UNSUPPORTED Rust 1976:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Time")]
// impl Default for TRACE_LOGFILE_HEADER_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Time")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TRACE_LOGFILE_HEADER_0_0` (
    public var `MajorVersion`: UByte,
    public var `MinorVersion`: UByte,
    public var `SubVersion`: UByte,
    public var `SubMinorVersion`: UByte,
)
// UNSUPPORTED Rust 1991:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_System_Time")]
// #[derive(Clone, Copy)]
// pub union TRACE_LOGFILE_HEADER_1 {
//     pub LogInstanceGuid: windows_sys::core::GUID,
//     pub Anonymous: TRACE_LOGFILE_HEADER_1_0,
// }

// UNSUPPORTED Rust 1998:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Time")]
// impl Default for TRACE_LOGFILE_HEADER_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Time")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TRACE_LOGFILE_HEADER_1_0` (
    public var `StartBuffers`: UInt,
    public var `PointerSize`: UInt,
    public var `EventsLost`: UInt,
    public var `CpuSpeedInMHz`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Time")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TRACE_LOGFILE_HEADER32` (
    public var `BufferSize`: UInt,
    public var `Anonymous1`: `TRACE_LOGFILE_HEADER32_0`,
    public var `ProviderVersion`: UInt,
    public var `NumberOfProcessors`: UInt,
    public var `EndTime`: Long,
    public var `TimerResolution`: UInt,
    public var `MaximumFileSize`: UInt,
    public var `LogFileMode`: UInt,
    public var `BuffersWritten`: UInt,
    public var `Anonymous2`: `TRACE_LOGFILE_HEADER32_1`,
    public var `LoggerName`: UInt,
    public var `LogFileName`: UInt,
    public var `TimeZone`: `super`.`super`.`Time`.`TIME_ZONE_INFORMATION`,
    public var `BootTime`: Long,
    public var `PerfFreq`: Long,
    public var `StartTime`: Long,
    public var `ReservedFlags`: UInt,
    public var `BuffersLost`: UInt,
)
// UNSUPPORTED Rust 2036:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Time")]
// impl Default for TRACE_LOGFILE_HEADER32 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2042:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_System_Time")]
// #[derive(Clone, Copy)]
// pub union TRACE_LOGFILE_HEADER32_0 {
//     pub Version: u32,
//     pub VersionDetail: TRACE_LOGFILE_HEADER32_0_0,
// }

// UNSUPPORTED Rust 2049:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Time")]
// impl Default for TRACE_LOGFILE_HEADER32_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Time")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TRACE_LOGFILE_HEADER32_0_0` (
    public var `MajorVersion`: UByte,
    public var `MinorVersion`: UByte,
    public var `SubVersion`: UByte,
    public var `SubMinorVersion`: UByte,
)
// UNSUPPORTED Rust 2064:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_System_Time")]
// #[derive(Clone, Copy)]
// pub union TRACE_LOGFILE_HEADER32_1 {
//     pub LogInstanceGuid: windows_sys::core::GUID,
//     pub Anonymous: TRACE_LOGFILE_HEADER32_1_0,
// }

// UNSUPPORTED Rust 2071:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Time")]
// impl Default for TRACE_LOGFILE_HEADER32_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Time")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TRACE_LOGFILE_HEADER32_1_0` (
    public var `StartBuffers`: UInt,
    public var `PointerSize`: UInt,
    public var `EventsLost`: UInt,
    public var `CpuSpeedInMHz`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Time")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `TRACE_LOGFILE_HEADER64` (
    public var `BufferSize`: UInt,
    public var `Anonymous1`: `TRACE_LOGFILE_HEADER64_0`,
    public var `ProviderVersion`: UInt,
    public var `NumberOfProcessors`: UInt,
    public var `EndTime`: Long,
    public var `TimerResolution`: UInt,
    public var `MaximumFileSize`: UInt,
    public var `LogFileMode`: UInt,
    public var `BuffersWritten`: UInt,
    public var `Anonymous2`: `TRACE_LOGFILE_HEADER64_1`,
    public var `LoggerName`: ULong,
    public var `LogFileName`: ULong,
    public var `TimeZone`: `super`.`super`.`Time`.`TIME_ZONE_INFORMATION`,
    public var `BootTime`: Long,
    public var `PerfFreq`: Long,
    public var `StartTime`: Long,
    public var `ReservedFlags`: UInt,
    public var `BuffersLost`: UInt,
)
// UNSUPPORTED Rust 2109:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Time")]
// impl Default for TRACE_LOGFILE_HEADER64 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2115:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_System_Time")]
// #[derive(Clone, Copy)]
// pub union TRACE_LOGFILE_HEADER64_0 {
//     pub Version: u32,
//     pub VersionDetail: TRACE_LOGFILE_HEADER64_0_0,
// }

// UNSUPPORTED Rust 2122:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Time")]
// impl Default for TRACE_LOGFILE_HEADER64_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Time")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TRACE_LOGFILE_HEADER64_0_0` (
    public var `MajorVersion`: UByte,
    public var `MinorVersion`: UByte,
    public var `SubVersion`: UByte,
    public var `SubMinorVersion`: UByte,
)
// UNSUPPORTED Rust 2137:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_System_Time")]
// #[derive(Clone, Copy)]
// pub union TRACE_LOGFILE_HEADER64_1 {
//     pub LogInstanceGuid: windows_sys::core::GUID,
//     pub Anonymous: TRACE_LOGFILE_HEADER64_1_0,
// }

// UNSUPPORTED Rust 2144:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Time")]
// impl Default for TRACE_LOGFILE_HEADER64_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Time")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TRACE_LOGFILE_HEADER64_1_0` (
    public var `StartBuffers`: UInt,
    public var `PointerSize`: UInt,
    public var `EventsLost`: UInt,
    public var `CpuSpeedInMHz`: UInt,
)
public const val `TRACE_MESSAGE_COMPONENTID`: `TRACE_MESSAGE_FLAGS` = 4u;
public typealias `TRACE_MESSAGE_FLAGS` = UInt;
public const val `TRACE_MESSAGE_FLAG_MASK`: UInt = 65535u;
public const val `TRACE_MESSAGE_GUID`: `TRACE_MESSAGE_FLAGS` = 2u;
public const val `TRACE_MESSAGE_PERFORMANCE_TIMESTAMP`: UInt = 16u;
public const val `TRACE_MESSAGE_POINTER32`: UInt = 64u;
public const val `TRACE_MESSAGE_POINTER64`: UInt = 128u;
public const val `TRACE_MESSAGE_SEQUENCE`: `TRACE_MESSAGE_FLAGS` = 1u;
public const val `TRACE_MESSAGE_SYSTEMINFO`: `TRACE_MESSAGE_FLAGS` = 32u;
public const val `TRACE_MESSAGE_TIMESTAMP`: `TRACE_MESSAGE_FLAGS` = 8u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TRACE_PERIODIC_CAPTURE_STATE_INFO` (
    public var `CaptureStateFrequencyInSeconds`: UInt,
    public var `ProviderCount`: UShort,
    public var `Reserved`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TRACE_PROFILE_INTERVAL` (
    public var `Source`: UInt,
    public var `Interval`: UInt,
)
public const val `TRACE_PROVIDER_FLAG_LEGACY`: UInt = 1u;
public const val `TRACE_PROVIDER_FLAG_PRE_ENABLE`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TRACE_PROVIDER_INFO` (
    public var `ProviderGuid`: `windows_sys`.`core`.`GUID`,
    public var `SchemaSource`: UInt,
    public var `ProviderNameOffset`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TRACE_PROVIDER_INSTANCE_INFO` (
    public var `NextOffset`: UInt,
    public var `EnableCount`: UInt,
    public var `Pid`: UInt,
    public var `Flags`: UInt,
)
public typealias `TRACE_QUERY_INFO_CLASS` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TRACE_STACK_CACHING_INFO` (
    public var `Enabled`: Boolean,
    public var `CacheSize`: UInt,
    public var `BucketCount`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TRACE_VERSION_INFO` (
    public var `EtwTraceProcessingVersion`: UInt,
    public var `Reserved`: UInt,
)
// UNSUPPORTED Rust 2213:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const TcpIpGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9a280ac0_c8e0_11d1_84e2_00c04fb998a2);

// UNSUPPORTED Rust 2214:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const ThreadGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3d6fa8d1_fe05_11d0_9dda_00c04fd7ba7c);

public const val `TraceDisallowListQuery`: `TRACE_QUERY_INFO_CLASS` = 14;
public const val `TraceGroupQueryInfo`: `TRACE_QUERY_INFO_CLASS` = 13;
public const val `TraceGroupQueryList`: `TRACE_QUERY_INFO_CLASS` = 12;
public const val `TraceGuidQueryInfo`: `TRACE_QUERY_INFO_CLASS` = 1;
public const val `TraceGuidQueryList`: `TRACE_QUERY_INFO_CLASS` = 0;
public const val `TraceGuidQueryProcess`: `TRACE_QUERY_INFO_CLASS` = 2;
public const val `TraceInfoReserved15`: `TRACE_QUERY_INFO_CLASS` = 15;
public const val `TraceLbrConfigurationInfo`: `TRACE_QUERY_INFO_CLASS` = 20;
public const val `TraceLbrEventListInfo`: `TRACE_QUERY_INFO_CLASS` = 21;
public const val `TraceMaxLoggersQuery`: `TRACE_QUERY_INFO_CLASS` = 19;
public const val `TraceMaxPmcCounterQuery`: `TRACE_QUERY_INFO_CLASS` = 22;
public const val `TracePeriodicCaptureStateInfo`: `TRACE_QUERY_INFO_CLASS` = 17;
public const val `TracePeriodicCaptureStateListInfo`: `TRACE_QUERY_INFO_CLASS` = 16;
public const val `TracePmcCounterListInfo`: `TRACE_QUERY_INFO_CLASS` = 9;
public const val `TracePmcCounterOwners`: `TRACE_QUERY_INFO_CLASS` = 25;
public const val `TracePmcEventListInfo`: `TRACE_QUERY_INFO_CLASS` = 8;
public const val `TracePmcSessionInformation`: `TRACE_QUERY_INFO_CLASS` = 27;
public const val `TraceProfileSourceConfigInfo`: `TRACE_QUERY_INFO_CLASS` = 6;
public const val `TraceProfileSourceListInfo`: `TRACE_QUERY_INFO_CLASS` = 7;
public const val `TraceProviderBinaryTracking`: `TRACE_QUERY_INFO_CLASS` = 18;
public const val `TraceSampledProfileIntervalInfo`: `TRACE_QUERY_INFO_CLASS` = 5;
public const val `TraceSetDisallowList`: `TRACE_QUERY_INFO_CLASS` = 10;
public const val `TraceStackCachingInfo`: `TRACE_QUERY_INFO_CLASS` = 24;
public const val `TraceStackTracingInfo`: `TRACE_QUERY_INFO_CLASS` = 3;
public const val `TraceStreamCount`: `TRACE_QUERY_INFO_CLASS` = 23;
public const val `TraceSystemTraceEnableFlagsInfo`: `TRACE_QUERY_INFO_CLASS` = 4;
public const val `TraceUnifiedStackCachingInfo`: `TRACE_QUERY_INFO_CLASS` = 26;
public const val `TraceVersionInfo`: `TRACE_QUERY_INFO_CLASS` = 11;
// UNSUPPORTED Rust 2243:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const UdpIpGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xbf3a50c5_a9c9_4988_a005_2df0b7c80f80);

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WMIDPREQUEST` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`WMIDPREQUESTCODE`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> UInt>>>;
public typealias `WMIDPREQUESTCODE` = Int;
public const val `WMIGUID_EXECUTE`: UInt = 16u;
public const val `WMIGUID_NOTIFICATION`: UInt = 4u;
public const val `WMIGUID_QUERY`: UInt = 1u;
public const val `WMIGUID_READ_DESCRIPTION`: UInt = 8u;
public const val `WMIGUID_SET`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WMIREGGUIDW` (
    public var `Guid`: `windows_sys`.`core`.`GUID`,
    public var `Flags`: UInt,
    public var `InstanceCount`: UInt,
    public var `Anonymous`: `WMIREGGUIDW_0`,
)
// UNSUPPORTED Rust 2259:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WMIREGGUIDW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2264:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WMIREGGUIDW_0 {
//     pub InstanceNameList: u32,
//     pub BaseNameOffset: u32,
//     pub Pdo: usize,
//     pub InstanceInfo: usize,
// }

// UNSUPPORTED Rust 2272:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WMIREGGUIDW_0 {
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
public class `WMIREGINFOW` (
    public var `BufferSize`: UInt,
    public var `NextWmiRegInfo`: UInt,
    public var `RegistryPath`: UInt,
    public var `MofResourceName`: UInt,
    public var `GuidCount`: UInt,
    public var `WmiRegGuid`: Array<`WMIREGGUIDW`>,
)
// UNSUPPORTED Rust 2287:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WMIREGINFOW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WMIREG_FLAG_EVENT_ONLY_GUID`: UInt = 64u;
public const val `WMIREG_FLAG_EXPENSIVE`: UInt = 1u;
public const val `WMIREG_FLAG_INSTANCE_BASENAME`: UInt = 8u;
public const val `WMIREG_FLAG_INSTANCE_LIST`: UInt = 4u;
public const val `WMIREG_FLAG_INSTANCE_PDO`: UInt = 32u;
public const val `WMIREG_FLAG_REMOVE_GUID`: UInt = 65536u;
public const val `WMIREG_FLAG_RESERVED1`: UInt = 131072u;
public const val `WMIREG_FLAG_RESERVED2`: UInt = 262144u;
public const val `WMIREG_FLAG_TRACED_GUID`: UInt = 524288u;
public const val `WMIREG_FLAG_TRACE_CONTROL_GUID`: UInt = 4096u;
public const val `WMI_CAPTURE_STATE`: `WMIDPREQUESTCODE` = 10;
public const val `WMI_DISABLE_COLLECTION`: `WMIDPREQUESTCODE` = 7;
public const val `WMI_DISABLE_EVENTS`: `WMIDPREQUESTCODE` = 5;
public const val `WMI_ENABLE_COLLECTION`: `WMIDPREQUESTCODE` = 6;
public const val `WMI_ENABLE_EVENTS`: `WMIDPREQUESTCODE` = 4;
public const val `WMI_EXECUTE_METHOD`: `WMIDPREQUESTCODE` = 9;
public const val `WMI_GET_ALL_DATA`: `WMIDPREQUESTCODE` = 0;
public const val `WMI_GET_SINGLE_INSTANCE`: `WMIDPREQUESTCODE` = 1;
public const val `WMI_GLOBAL_LOGGER_ID`: UInt = 1u;
public const val `WMI_GUIDTYPE_DATA`: UInt = 2u;
public const val `WMI_GUIDTYPE_EVENT`: UInt = 3u;
public const val `WMI_GUIDTYPE_TRACE`: UInt = 1u;
public const val `WMI_GUIDTYPE_TRACECONTROL`: UInt = 0u;
public const val `WMI_REGINFO`: `WMIDPREQUESTCODE` = 8;
public const val `WMI_SET_SINGLE_INSTANCE`: `WMIDPREQUESTCODE` = 2;
public const val `WMI_SET_SINGLE_ITEM`: `WMIDPREQUESTCODE` = 3;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WNODE_ALL_DATA` (
    public var `WnodeHeader`: `WNODE_HEADER`,
    public var `DataBlockOffset`: UInt,
    public var `InstanceCount`: UInt,
    public var `OffsetInstanceNameOffsets`: UInt,
    public var `Anonymous`: `WNODE_ALL_DATA_0`,
)
// UNSUPPORTED Rust 2327:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WNODE_ALL_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2332:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WNODE_ALL_DATA_0 {
//     pub FixedInstanceSize: u32,
//     pub OffsetInstanceDataAndLength: [OFFSETINSTANCEDATAANDLENGTH; 1],
// }

// UNSUPPORTED Rust 2338:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WNODE_ALL_DATA_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WNODE_EVENT_ITEM` (
    public var `WnodeHeader`: `WNODE_HEADER`,
)
// UNSUPPORTED Rust 2348:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WNODE_EVENT_ITEM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WNODE_EVENT_REFERENCE` (
    public var `WnodeHeader`: `WNODE_HEADER`,
    public var `TargetGuid`: `windows_sys`.`core`.`GUID`,
    public var `TargetDataBlockSize`: UInt,
    public var `Anonymous`: `WNODE_EVENT_REFERENCE_0`,
)
// UNSUPPORTED Rust 2361:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WNODE_EVENT_REFERENCE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2366:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WNODE_EVENT_REFERENCE_0 {
//     pub TargetInstanceIndex: u32,
//     pub TargetInstanceName: [u16; 1],
// }

// UNSUPPORTED Rust 2372:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WNODE_EVENT_REFERENCE_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WNODE_FLAG_ALL_DATA`: UInt = 1u;
public const val `WNODE_FLAG_ANSI_INSTANCENAMES`: UInt = 16384u;
public const val `WNODE_FLAG_EVENT_ITEM`: UInt = 8u;
public const val `WNODE_FLAG_EVENT_REFERENCE`: UInt = 8192u;
public const val `WNODE_FLAG_FIXED_INSTANCE_SIZE`: UInt = 16u;
public const val `WNODE_FLAG_INSTANCES_SAME`: UInt = 64u;
public const val `WNODE_FLAG_INTERNAL`: UInt = 256u;
public const val `WNODE_FLAG_LOG_WNODE`: UInt = 262144u;
public const val `WNODE_FLAG_METHOD_ITEM`: UInt = 32768u;
public const val `WNODE_FLAG_NO_HEADER`: UInt = 2097152u;
public const val `WNODE_FLAG_PDO_INSTANCE_NAMES`: UInt = 65536u;
public const val `WNODE_FLAG_PERSIST_EVENT`: UInt = 1024u;
public const val `WNODE_FLAG_SEND_DATA_BLOCK`: UInt = 4194304u;
public const val `WNODE_FLAG_SEVERITY_MASK`: UInt = 4278190080u;
public const val `WNODE_FLAG_SINGLE_INSTANCE`: UInt = 2u;
public const val `WNODE_FLAG_SINGLE_ITEM`: UInt = 4u;
public const val `WNODE_FLAG_STATIC_INSTANCE_NAMES`: UInt = 128u;
public const val `WNODE_FLAG_TOO_SMALL`: UInt = 32u;
public const val `WNODE_FLAG_TRACED_GUID`: UInt = 131072u;
public const val `WNODE_FLAG_USE_GUID_PTR`: UInt = 524288u;
public const val `WNODE_FLAG_USE_MOF_PTR`: UInt = 1048576u;
public const val `WNODE_FLAG_USE_TIMESTAMP`: UInt = 512u;
public const val `WNODE_FLAG_VERSIONED_PROPERTIES`: UInt = 8388608u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WNODE_HEADER` (
    public var `BufferSize`: UInt,
    public var `ProviderId`: UInt,
    public var `Anonymous1`: `WNODE_HEADER_0`,
    public var `Anonymous2`: `WNODE_HEADER_1`,
    public var `Guid`: `windows_sys`.`core`.`GUID`,
    public var `ClientContext`: UInt,
    public var `Flags`: UInt,
)
// UNSUPPORTED Rust 2411:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WNODE_HEADER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2416:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WNODE_HEADER_0 {
//     pub HistoricalContext: u64,
//     pub Anonymous: WNODE_HEADER_0_0,
// }

// UNSUPPORTED Rust 2422:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WNODE_HEADER_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WNODE_HEADER_0_0` (
    public var `Version`: UInt,
    public var `Linkage`: UInt,
)
// UNSUPPORTED Rust 2433:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WNODE_HEADER_1 {
//     pub CountLost: u32,
//     pub KernelHandle: super::super::super::Foundation::HANDLE,
//     pub TimeStamp: i64,
// }

// UNSUPPORTED Rust 2440:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WNODE_HEADER_1 {
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
public class `WNODE_METHOD_ITEM` (
    public var `WnodeHeader`: `WNODE_HEADER`,
    public var `OffsetInstanceName`: UInt,
    public var `InstanceIndex`: UInt,
    public var `MethodId`: UInt,
    public var `DataBlockOffset`: UInt,
    public var `SizeDataBlock`: UInt,
    public var `VariableData`: UByteArray,
)
// UNSUPPORTED Rust 2456:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WNODE_METHOD_ITEM {
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
public class `WNODE_SINGLE_INSTANCE` (
    public var `WnodeHeader`: `WNODE_HEADER`,
    public var `OffsetInstanceName`: UInt,
    public var `InstanceIndex`: UInt,
    public var `DataBlockOffset`: UInt,
    public var `SizeDataBlock`: UInt,
    public var `VariableData`: UByteArray,
)
// UNSUPPORTED Rust 2471:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WNODE_SINGLE_INSTANCE {
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
public class `WNODE_SINGLE_ITEM` (
    public var `WnodeHeader`: `WNODE_HEADER`,
    public var `OffsetInstanceName`: UInt,
    public var `InstanceIndex`: UInt,
    public var `ItemId`: UInt,
    public var `DataBlockOffset`: UInt,
    public var `SizeDataItem`: UInt,
    public var `VariableData`: UByteArray,
)
// UNSUPPORTED Rust 2487:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WNODE_SINGLE_ITEM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WNODE_TOO_SMALL` (
    public var `WnodeHeader`: `WNODE_HEADER`,
    public var `SizeNeeded`: UInt,
)
// UNSUPPORTED Rust 2498:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WNODE_TOO_SMALL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `_TDH_IN_TYPE` = Int;
public typealias `_TDH_OUT_TYPE` = Int;
